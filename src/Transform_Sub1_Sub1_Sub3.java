public class Transform_Sub1_Sub1_Sub3 extends Transform_Sub1_Sub1 {

	double aDouble10394;
	double aDouble10395;
	double aDouble10396;
	double aDouble10397;
	double aDouble10390;
	boolean aBool10401 = false;
	int anInt10385 = 0;
	ParticleSystem aClass539_10402;
	boolean aBool10398 = false;
	int anInt10386;
	public int anInt10393;
	public int anInt10392;
	int anInt10387;
	int anInt10388;
	int anInt10389;
	public int anInt10382;
	int anInt10383;
	public int anInt10384;
	boolean aBool10400;
	int anInt10391;
	Animation aAnimation_10399;

	boolean method12999() {
		return false;
	}

	boolean method12986(int i_1) {
		return false;
	}

	public void method15903() {
		if (!this.aBool10398 && this.anInt10389 != 0) {
			Object obj_2 = null;
			if (client.anInt7341 == 4) {
				obj_2 = Class82.aClass75Array804[this.anInt10389 - 1].method1342((byte) 61);
			} else {
				int i_14;
				if (this.anInt10389 < 0) {
					i_14 = -this.anInt10389 - 1;
					if (i_14 == client.anInt7315) {
						obj_2 = VertexNormal.myPlayer;
					} else {
						obj_2 = client.players[i_14];
					}
				} else {
					i_14 = this.anInt10389 - 1;
					StringNode class282_sub47_4 = (StringNode) client.NPCS.get((long) i_14);
					if (class282_sub47_4 != null) {
						obj_2 = (Animable) class282_sub47_4.anObject8068;
					}
				}
			}

			if (obj_2 != null) {
				Vector3 vector3_3 = ((Animable) obj_2).method11166().aClass385_3595;
				this.method11172(vector3_3.x, (float) (Class504.method8389((int) vector3_3.x, (int) vector3_3.z, this.plane, (byte) 26) - this.anInt10383), vector3_3.z);
				if (this.anInt10391 >= 0) {
					BASDefinitions renderanimdefs_15 = ((Animable) obj_2).getRenderAnimDefs();
					int i_5 = 0;
					int i_6 = 0;
					if (renderanimdefs_15.anIntArrayArray2802 != null && renderanimdefs_15.anIntArrayArray2802[this.anInt10391] != null) {
						i_5 += renderanimdefs_15.anIntArrayArray2802[this.anInt10391][0];
						i_6 += renderanimdefs_15.anIntArrayArray2802[this.anInt10391][2];
					}

					if (renderanimdefs_15.anIntArrayArray2791 != null && renderanimdefs_15.anIntArrayArray2791[this.anInt10391] != null) {
						i_5 += renderanimdefs_15.anIntArrayArray2791[this.anInt10391][0];
						i_6 += renderanimdefs_15.anIntArrayArray2791[this.anInt10391][2];
					}

					if (i_5 != 0 || i_6 != 0) {
						int i_7 = ((Animable) obj_2).aClass19_10359.method578();
						int i_8 = i_7;
						if (((Animable) obj_2).anIntArray10362 != null && ((Animable) obj_2).anIntArray10362[this.anInt10391] != -1) {
							i_8 = ((Animable) obj_2).anIntArray10362[this.anInt10391];
						}

						int i_9 = i_8 - i_7 & 0x3fff;
						int i_10 = Class382.anIntArray4657[i_9];
						int i_11 = Class382.anIntArray4661[i_9];
						int i_12 = i_10 * i_6 + i_5 * i_11 >> 14;
						i_6 = i_6 * i_11 - i_10 * i_5 >> 14;
						Vector3 vector3_13 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
						vector3_13.x += (float) i_12;
						vector3_13.z += (float) i_6;
						this.method11171(vector3_13);
						vector3_13.pushVectorStack();
					}
				}
			}
		}

	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return null;
	}

	public final void method15904(int i_1, int i_2, int i_3, int i_4) {
		Vector3 vector3_6 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		if (!this.aBool10398) {
			float f_7 = (float) i_1 - vector3_6.x;
			float f_8 = (float) i_2 - vector3_6.z;
			float f_9 = (float) Math.sqrt((double) (f_8 * f_8 + f_7 * f_7));
			if (f_9 != 0.0F) {
				vector3_6.x += f_7 * (float) this.anInt10388 / f_9;
				vector3_6.z += f_8 * (float) this.anInt10388 / f_9;
			}

			if (this.aBool10400) {
				vector3_6.y = (float) (Class504.method8389((int) vector3_6.x, (int) vector3_6.z, this.plane, (byte) 116) - this.anInt10383);
			}

			this.method11171(vector3_6);
		}

		double d_10 = (double) (this.anInt10392 + 1 - i_4);
		this.aDouble10394 = (double) ((float) i_1 - vector3_6.x) / d_10;
		this.aDouble10395 = (double) ((float) i_2 - vector3_6.z) / d_10;
		this.aDouble10396 = Math.sqrt(this.aDouble10395 * this.aDouble10395 + this.aDouble10394 * this.aDouble10394);
		if (this.anInt10387 != -1) {
			if (!this.aBool10398) {
				this.aDouble10397 = -this.aDouble10396 * Math.tan(0.02454369D * (double) this.anInt10387);
			}

			this.aDouble10390 = ((double) ((float) i_3 - vector3_6.y) - this.aDouble10397 * d_10) * 2.0D / (d_10 * d_10);
		} else {
			this.aDouble10397 = (double) ((float) i_3 - vector3_6.y) / d_10;
		}

		vector3_6.pushVectorStack();
	}

	boolean method13000() {
		return this.aBool10401;
	}

	public int method12995(int i_1) {
		return this.anInt10385;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = this.method15907(graphicalrenderer_1, 2048, 288666020);
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_4 = this.method11168();
			this.method15905(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, (short) -8736);
			Class285 class285_5 = Class470.method7824(false, (byte) -59);
			meshrasterizer_3.method11282(matrix44var_4, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass539_10402 != null) {
				Class151 class151_6 = this.aClass539_10402.method11517();
				graphicalrenderer_1.method8456(class151_6);
			}

			this.aBool10401 = meshrasterizer_3.i();
			meshrasterizer_3.n();
			this.anInt10385 = meshrasterizer_3.YA();
			return class285_5;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.method15907(graphicalrenderer_1, 0, 1850318327);
		if (meshrasterizer_3 != null) {
			Matrix44Var matrix44var_4 = this.method11168();
			this.anInt10385 = meshrasterizer_3.YA();
			meshrasterizer_3.n();
			this.method15905(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, (short) 22710);
		}

	}

	void method14697(byte b_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		this.aShort9458 = this.localX = (short) ((int) (vector3_2.x / 512.0F));
		this.aShort9456 = this.localY = (short) ((int) (vector3_2.z / 512.0F));
	}

	void method15905(GraphicalRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3, short s_4) {
		meshrasterizer_2.method11273(matrix44var_3);
		Surface[] arr_5 = meshrasterizer_2.method11253();
		SurfaceSkin[] arr_6 = meshrasterizer_2.method11274();
		if ((this.aClass539_10402 == null || this.aClass539_10402.aBool7132) && (arr_5 != null || arr_6 != null)) {
			this.aClass539_10402 = ParticleSystem.method11557(client.cycles, true);
		}

		if (this.aClass539_10402 != null) {
			this.aClass539_10402.method11511(graphicalrenderer_1, (long) client.cycles, arr_5, arr_6);
			this.aClass539_10402.method11515(this.plane, this.aShort9458, this.localX, this.aShort9456, this.localY);
		}

	}

	public void method15906() {
		if (this.aClass539_10402 != null) {
			this.aClass539_10402.method11527();
		}

	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		return false;
	}

	public int method13003() {
		return this.anInt10385 * -1120357653 * 1701537219;
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	MeshRasterizer method15907(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		SpotAnimDefinitions spotanimdefinitions_4 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.anInt10386, (byte) -54);
		return spotanimdefinitions_4.method11228(graphicalrenderer_1, i_2, this.aAnimation_10399, (byte) 2, (byte) 57);
	}

	public int method13005() {
		return this.anInt10385 * -1120357653 * 1701537219;
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	boolean method13001() {
		return this.aBool10401;
	}

	boolean method13002() {
		return this.aBool10401;
	}

	public int method13017() {
		return this.anInt10385 * -1120357653 * 1701537219;
	}

	public int method13006() {
		return this.anInt10385 * -1120357653 * 1701537219;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15907(graphicalrenderer_1, 2048, -52713373);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			this.method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (short) -381);
			Class285 class285_4 = Class470.method7824(false, (byte) -61);
			meshrasterizer_2.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass539_10402 != null) {
				Class151 class151_5 = this.aClass539_10402.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}

			this.aBool10401 = meshrasterizer_2.i();
			meshrasterizer_2.n();
			this.anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
			return class285_4;
		}
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15907(graphicalrenderer_1, 2048, 1825252349);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			this.method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (short) 8398);
			Class285 class285_4 = Class470.method7824(false, (byte) -42);
			meshrasterizer_2.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass539_10402 != null) {
				Class151 class151_5 = this.aClass539_10402.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}

			this.aBool10401 = meshrasterizer_2.i();
			meshrasterizer_2.n();
			this.anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
			return class285_4;
		}
	}

	public Transform_Sub1_Sub1_Sub3(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, boolean bool_15, int i_16) {
		super(sceneobjectmanager_1, i_3, i_4, i_5, Class504.method8389(i_5, i_6, i_3, (byte) 25) - i_7, i_6, i_5 >> 9, i_5 >> 9, i_6 >> 9, i_6 >> 9, false, (byte) 0);
		this.anInt10386 = i_2;
		this.anInt10393 = i_8;
		this.anInt10392 = i_9;
		this.anInt10387 = i_10;
		this.anInt10388 = i_11;
		this.anInt10389 = i_12;
		this.anInt10382 = i_13;
		this.anInt10383 = i_7;
		this.anInt10384 = i_14;
		this.aBool10400 = bool_15;
		this.aBool10398 = false;
		this.anInt10391 = i_16;
		int i_17 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.anInt10386, (byte) -8).animationId;
		this.aAnimation_10399 = new Animation_Sub2(this);
		this.aAnimation_10399.update(i_17);
		this.method13008(1, (byte) -89);
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15907(graphicalrenderer_1, 0, 613981340);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = this.method11168();
			this.anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
			meshrasterizer_2.n();
			this.method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (short) -18799);
		}

	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15907(graphicalrenderer_1, 0, 208863314);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = this.method11168();
			this.anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
			meshrasterizer_2.n();
			this.method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (short) -29917);
		}

	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	final boolean method13011() {
		return false;
	}

	boolean method12987(int i_1) {
		return this.aBool10401;
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public final void method15910(int i_1) {
		this.aBool10398 = true;
		Position class305_3 = new Position(this.method11166());
		class305_3.aClass385_3595.x = (float) ((double) class305_3.aClass385_3595.x + this.aDouble10394 * (double) i_1);
		class305_3.aClass385_3595.z = (float) ((double) class305_3.aClass385_3595.z + this.aDouble10395 * (double) i_1);
		if (this.aBool10400) {
			class305_3.aClass385_3595.y = (float) (Class504.method8389((int) class305_3.aClass385_3595.x, (int) class305_3.aClass385_3595.z, this.plane, (byte) 18) - this.anInt10383);
		} else if (this.anInt10387 != -1) {
			class305_3.aClass385_3595.y = (float) ((double) class305_3.aClass385_3595.y + this.aDouble10397 * (double) i_1 + (double) i_1 * (double) i_1 * 0.5D * this.aDouble10390);
			this.aDouble10397 += (double) i_1 * this.aDouble10390;
		} else {
			class305_3.aClass385_3595.y = (float) ((double) class305_3.aClass385_3595.y + this.aDouble10397 * (double) i_1);
		}

		class305_3.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble10397, this.aDouble10396));
		Quaternion quaternion_4 = Quaternion.create();
		quaternion_4.angle(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble10394, this.aDouble10395) - 3.1415927F);
		class305_3.aClass381_3594.multiply(quaternion_4);
		quaternion_4.cache();
		this.method11191(class305_3);
		if (this.aAnimation_10399.method7627(1, -1320963255) && this.aAnimation_10399.method7580(1594863337)) {
			this.aAnimation_10399.method7582((byte) -115);
		}

	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		return false;
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.method15907(graphicalrenderer_1, 2048, 886246446);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			this.method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, (short) 13564);
			Class285 class285_4 = Class470.method7824(false, (byte) -22);
			meshrasterizer_2.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass539_10402 != null) {
				Class151 class151_5 = this.aClass539_10402.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}

			this.aBool10401 = meshrasterizer_2.i();
			meshrasterizer_2.n();
			this.anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
			return class285_4;
		}
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	final boolean method13026() {
		return false;
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	final boolean method12985(int i_1) {
		return false;
	}

}
