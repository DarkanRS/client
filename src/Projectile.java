public class Projectile extends Transform_Sub1_Sub1 {

	double aDouble10394;
	double aDouble10395;
	double aDouble10396;
	double aDouble10397;
	double aDouble10390;
	boolean aBool10401 = false;
	int anInt10385 = 0;
	ParticleSystem aClass539_10402;
	boolean aBool10398 = false;
	int spotAnimId;
	public int startTime;
	public int endTime;
	int angleY;
	int angleXZ;
	int entitySource;
	public int entityLockOn;
	int startHeight;
	public int endHeight;
	boolean useFloorHeight;
	int anInt10391;
	Animation animation;

	boolean method12999() {
		return false;
	}

	boolean method12986(int i_1) {
		return false;
	}

	public void method15903() {
		if (!this.aBool10398 && this.entitySource != 0) {
			Object obj_2 = null;
			if (client.anInt7341 == 4) {
				obj_2 = Class82.aClass75Array804[this.entitySource - 1].method1342((byte) 61);
			} else {
				int i_14;
				if (this.entitySource < 0) {
					i_14 = -this.entitySource - 1;
					if (i_14 == client.myPlayerIndex) {
						obj_2 = VertexNormal.MY_PLAYER;
					} else {
						obj_2 = client.players[i_14];
					}
				} else {
					i_14 = this.entitySource - 1;
					StringNode class282_sub47_4 = (StringNode) client.NPCS.get((long) i_14);
					if (class282_sub47_4 != null) {
						obj_2 = (Entity) class282_sub47_4.anObject8068;
					}
				}
			}

			if (obj_2 != null) {
				Vector3 vector3_3 = ((Entity) obj_2).method11166().coords;
				this.method11172(vector3_3.x, (float) (Class504.getTerrainHeightAtPos((int) vector3_3.x, (int) vector3_3.z, this.plane, (byte) 26) - this.startHeight), vector3_3.z);
				if (this.anInt10391 >= 0) {
					BASDefinitions renderanimdefs_15 = ((Entity) obj_2).getRenderAnimDefs();
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
						int i_7 = ((Entity) obj_2).aClass19_10359.method578();
						int i_8 = i_7;
						if (((Entity) obj_2).anIntArray10362 != null && ((Entity) obj_2).anIntArray10362[this.anInt10391] != -1) {
							i_8 = ((Entity) obj_2).anIntArray10362[this.anInt10391];
						}

						int i_9 = i_8 - i_7 & 0x3fff;
						int i_10 = Class382.SINE[i_9];
						int i_11 = Class382.COSINE[i_9];
						int i_12 = i_10 * i_6 + i_5 * i_11 >> 14;
						i_6 = i_6 * i_11 - i_10 * i_5 >> 14;
						Vector3 vector3_13 = Vector3.popVectorStackTo(this.method11166().coords);
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
		Vector3 position = Vector3.popVectorStackTo(this.method11166().coords);
		if (!this.aBool10398) {
			float f_7 = (float) i_1 - position.x;
			float f_8 = (float) i_2 - position.z;
			float f_9 = (float) Math.sqrt((double) (f_8 * f_8 + f_7 * f_7));
			if (f_9 != 0.0F) {
				position.x += f_7 * (float) this.angleXZ / f_9;
				position.z += f_8 * (float) this.angleXZ / f_9;
			}

			if (this.useFloorHeight) {
				position.y = (float) (Class504.getTerrainHeightAtPos((int) position.x, (int) position.z, this.plane, (byte) 116) - this.startHeight);
			}

			this.method11171(position);
		}

		double d_10 = (double) (this.endTime + 1 - i_4);
		this.aDouble10394 = (double) ((float) i_1 - position.x) / d_10;
		this.aDouble10395 = (double) ((float) i_2 - position.z) / d_10;
		this.aDouble10396 = Math.sqrt(this.aDouble10395 * this.aDouble10395 + this.aDouble10394 * this.aDouble10394);
		if (this.angleY != -1) {
			if (!this.aBool10398) {
				this.aDouble10397 = -this.aDouble10396 * Math.tan(0.02454369D * (double) this.angleY);
			}

			this.aDouble10390 = ((double) ((float) i_3 - position.y) - this.aDouble10397 * d_10) * 2.0D / (d_10 * d_10);
		} else {
			this.aDouble10397 = (double) ((float) i_3 - position.y) / d_10;
		}

		position.pushVectorStack();
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
			meshrasterizer_3.method11282(matrix44var_4, this.boundingBoxPolygons[0], 0);
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
		Vector3 vector3_2 = this.method11166().coords;
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
		SpotAnimDefinitions spotanimdefinitions_4 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnimId, (byte) -54);
		return spotanimdefinitions_4.method11228(graphicalrenderer_1, i_2, this.animation, (byte) 2, (byte) 57);
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
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
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
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
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

	public Projectile(SceneObjectManager objManager, int spotAnimId, int fromPlane, int toPlane, int localX, int localY, int startHeight, int startTime, int endTime, int angleY, int angleXZ, int entitySource, int entityLockOn, int endHeight, boolean flag0x80, int i_16) {
		super(objManager, fromPlane, toPlane, localX, Class504.getTerrainHeightAtPos(localX, localY, fromPlane, (byte) 25) - startHeight, localY, localX >> 9, localX >> 9, localY >> 9, localY >> 9, false, (byte) 0);
		this.spotAnimId = spotAnimId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.angleY = angleY;
		this.angleXZ = angleXZ;
		this.entitySource = entitySource;
		this.entityLockOn = entityLockOn;
		this.startHeight = startHeight;
		this.endHeight = endHeight;
		this.useFloorHeight = flag0x80;
		this.aBool10398 = false;
		this.anInt10391 = i_16;
		int i_17 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnimId, (byte) -8).animationId;
		this.animation = new Animation_Sub2(this);
		this.animation.update(i_17);
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
		class305_3.coords.x = (float) ((double) class305_3.coords.x + this.aDouble10394 * (double) i_1);
		class305_3.coords.z = (float) ((double) class305_3.coords.z + this.aDouble10395 * (double) i_1);
		if (this.useFloorHeight) {
			class305_3.coords.y = (float) (Class504.getTerrainHeightAtPos((int) class305_3.coords.x, (int) class305_3.coords.z, this.plane, (byte) 18) - this.startHeight);
		} else if (this.angleY != -1) {
			class305_3.coords.y = (float) ((double) class305_3.coords.y + this.aDouble10397 * (double) i_1 + (double) i_1 * (double) i_1 * 0.5D * this.aDouble10390);
			this.aDouble10397 += (double) i_1 * this.aDouble10390;
		} else {
			class305_3.coords.y = (float) ((double) class305_3.coords.y + this.aDouble10397 * (double) i_1);
		}

		class305_3.quaternion.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble10397, this.aDouble10396));
		Quaternion quaternion_4 = Quaternion.create();
		quaternion_4.angle(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble10394, this.aDouble10395) - 3.1415927F);
		class305_3.quaternion.multiply(quaternion_4);
		quaternion_4.cache();
		this.method11191(class305_3);
		if (this.animation.method7627(1, -1320963255) && this.animation.method7580(1594863337)) {
			this.animation.method7582((byte) -115);
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
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
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
