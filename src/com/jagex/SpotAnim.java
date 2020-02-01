package com.jagex;
public class SpotAnim extends Transform_Sub1_Sub1 {

	boolean aBool10405 = true;
	int anInt10407 = 0;
	int rotation = 0;
	int spotAnimId;
	Animation animation;
	ParticleSystem aClass539_10409;

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15929(graphicalrenderer_1, 0x800 | (868957945 * this.rotation * -2052644023 != 0 ? 5 : 0), this.spotAnimId * -1615535539 * 346760837, (short) 27510);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			if (this.rotation * -2052644023 * 868957945 != 0) {
				meshrasterizer_2.f(1509410816 * this.rotation * -2052644023);
			}

			Matrix44Var matrix44var_3 = this.method11168();
			this.method15930(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (byte) 22);
			Class285 class285_4 = Class470.method7824(false, (byte) -71);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass539_10409 != null) {
				Class151 class151_5 = this.aClass539_10409.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}

			this.aBool10405 = meshrasterizer_2.i();
			this.anInt10407 = meshrasterizer_2.YA() * 1799159049 * -1656643271;
			meshrasterizer_2.n();
			return class285_4;
		}
	}

	boolean method12986(int i_1) {
		return false;
	}

	public int method12995(int i_1) {
		return this.anInt10407;
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return null;
	}

	public final void method15926() {
		if (this.animation != null && !this.animation.method7580(1671019519)) {
			this.animation.method7627(1, 360110199);
		}

	}

	public final boolean method15927() {
		return this.animation != null && !this.animation.hasSpeed(-432924037);
	}

	public final boolean method15928() {
		return this.animation == null || this.animation.method7580(283387313);
	}

	MeshRasterizer method15929(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, short s_4) {
		SpotAnimDefinitions spotanimdefinitions_5 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(i_3, (byte) -22);
		Ground class390_6 = this.aClass206_7970.aGroundArray2607[this.plane];
		Ground class390_7 = this.collisionPlane < 3 ? this.aClass206_7970.aGroundArray2607[this.collisionPlane + 1] : null;
		Vector3 vector3_8 = this.method11166().coords;
		return this.animation != null && !this.animation.method7580(1923086864) ? spotanimdefinitions_5.rasterize(graphicalrenderer_1, i_2, true, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, this.animation, (byte) 2, -2029487974) : spotanimdefinitions_5.rasterize(graphicalrenderer_1, i_2, true, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, (Animation) null, (byte) 2, -379915283);
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15929(graphicalrenderer_1, 0x800 | (868957945 * this.rotation * -2052644023 != 0 ? 5 : 0), this.spotAnimId * -1615535539 * 346760837, (short) -6159);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			if (this.rotation * -2052644023 * 868957945 != 0) {
				meshrasterizer_2.f(1509410816 * this.rotation * -2052644023);
			}

			Matrix44Var matrix44var_3 = this.method11168();
			this.method15930(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (byte) 81);
			Class285 class285_4 = Class470.method7824(false, (byte) -13);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass539_10409 != null) {
				Class151 class151_5 = this.aClass539_10409.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}

			this.aBool10405 = meshrasterizer_2.i();
			this.anInt10407 = meshrasterizer_2.YA() * 1799159049 * -1656643271;
			meshrasterizer_2.n();
			return class285_4;
		}
	}
	
	public SpotAnim(SceneObjectManager objManager, int spotAnimId, int speed, int fromPlane, int toPlane, int localX, int height, int localY, int x1, int x2, int y1, int y2, int rotation, boolean setting2) {
		super(objManager, fromPlane, toPlane, localX, height, localY, x1, x2, y1, y2, false, (byte) 0);
		this.spotAnimId = spotAnimId;
		this.rotation = rotation;
		SpotAnimDefinitions spotanimdefinitions_15 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnimId, (byte) -53);
		int animId = spotanimdefinitions_15.animationId;
		if (animId != -1) {
			this.animation = new Animation_Sub2(this);
			int i_17 = spotanimdefinitions_15.aBool6968 ? 0 : 2;
			if (setting2) {
				i_17 = 1;
			}

			this.animation.animateFull(animId, speed, i_17, false, -782305807);
		}

		this.method13008(1, (byte) -42);
	}

	void method15930(GraphicalRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3, byte b_4) {
		meshrasterizer_2.method11273(matrix44var_3);
		ParticleEmitterConfig[] arr_5 = meshrasterizer_2.method11253();
		SurfaceSkin[] arr_6 = meshrasterizer_2.method11274();
		if ((this.aClass539_10409 == null || this.aClass539_10409.aBool7132) && (arr_5 != null || arr_6 != null)) {
			this.aClass539_10409 = ParticleSystem.method11557(client.cycles, true);
		}

		if (this.aClass539_10409 != null) {
			this.aClass539_10409.method11511(graphicalrenderer_1, (long) client.cycles, arr_5, arr_6);
			this.aClass539_10409.method11515(this.plane, this.aShort9458, this.localX, this.aShort9456, this.localY);
		}

	}

	public void method15931(int i_1) {
		if (this.aClass539_10409 != null) {
			this.aClass539_10409.method11527();
		}

	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		return false;
	}

	final boolean method12985(int i_1) {
		return false;
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	boolean method12999() {
		return false;
	}

	boolean method13000() {
		return this.aBool10405;
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	public int method13017() {
		return this.anInt10407 * 1799159049 * -1656643271;
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public int method13005() {
		return this.anInt10407 * 1799159049 * -1656643271;
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	boolean method13002() {
		return this.aBool10405;
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15929(graphicalrenderer_1, 0x800 | (868957945 * this.rotation * -2052644023 != 0 ? 5 : 0), this.spotAnimId * -1615535539 * 346760837, (short) 25265);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			if (this.rotation * -2052644023 * 868957945 != 0) {
				meshrasterizer_2.f(1509410816 * this.rotation * -2052644023);
			}

			Matrix44Var matrix44var_3 = this.method11168();
			this.method15930(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (byte) 3);
			Class285 class285_4 = Class470.method7824(false, (byte) -9);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass539_10409 != null) {
				Class151 class151_5 = this.aClass539_10409.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}

			this.aBool10405 = meshrasterizer_2.i();
			this.anInt10407 = meshrasterizer_2.YA() * 1799159049 * -1656643271;
			meshrasterizer_2.n();
			return class285_4;
		}
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = this.method15929(graphicalrenderer_1, 0x800 | (this.rotation != 0 ? 5 : 0), this.spotAnimId, (short) -28146);
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			if (this.rotation != 0) {
				meshrasterizer_3.f(this.rotation * 2048);
			}

			Matrix44Var matrix44var_4 = this.method11168();
			this.method15930(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, (byte) 66);
			Class285 class285_5 = Class470.method7824(false, (byte) -116);
			meshrasterizer_3.method11282(matrix44var_4, this.boundingBoxPolygons[0], 0);
			if (this.aClass539_10409 != null) {
				Class151 class151_6 = this.aClass539_10409.method11517();
				graphicalrenderer_1.method8456(class151_6);
			}

			this.aBool10405 = meshrasterizer_3.i();
			this.anInt10407 = meshrasterizer_3.YA();
			meshrasterizer_3.n();
			return class285_5;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15929(graphicalrenderer_1, 0, 346760837 * this.spotAnimId * -1615535539, (short) -3054);
		if (meshrasterizer_2 != null) {
			this.method15930(graphicalrenderer_1, meshrasterizer_2, this.method11168(), (byte) 100);
		}

	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.method15929(graphicalrenderer_1, 0, this.spotAnimId, (short) 4697);
		if (meshrasterizer_3 != null) {
			this.method15930(graphicalrenderer_1, meshrasterizer_3, this.method11168(), (byte) 25);
		}

	}

	final boolean method13026() {
		return false;
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	public int method13006() {
		return this.anInt10407 * 1799159049 * -1656643271;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public int method13003() {
		return this.anInt10407 * 1799159049 * -1656643271;
	}

	boolean method13001() {
		return this.aBool10405;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		return false;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15929(graphicalrenderer_1, 0, 346760837 * this.spotAnimId * -1615535539, (short) 19834);
		if (meshrasterizer_2 != null) {
			this.method15930(graphicalrenderer_1, meshrasterizer_2, this.method11168(), (byte) 68);
		}

	}

	boolean method12987(int i_1) {
		return this.aBool10405;
	}

	final boolean method13011() {
		return false;
	}

}
