public abstract class Animable extends Class521_Sub1_Sub1 {

	public int index;
	public int anInt10326;
	public byte aByte10327;
	public int anInt10328;
	public int anInt10341;
	public int anInt10342;
	public int anInt10343;
	public int anInt10345;
	public int anInt10346;
	public int anInt10349;
	public byte aByte10364;
	public byte aByte10371;
	public int turnDirection;
	public int turningTicks;
	public int[] anIntArray10335;
	public int[] anIntArray10362;
	ParticleSystem aClass539_10369;
	boolean aBool10370;
	public int anInt10355;
	public int anInt10367;
	byte aByte10358;
	int interfaceIdToLoad;
	public RSInterface inter;
	public int loadedInterfaceId;
	int anInt10315;
	int anInt10317;
	public boolean aBool10318;
	public int anInt10319;
	public int anInt10375;
	public int drawPriority;
	int anInt10325;
	public int[] anIntArray10316;
	public int[] anIntArray10329;
	public int[] anIntArray10351;
	public int[] anIntArray10331;
	public int[] anIntArray10332;
	public EntityList aClass457_10333;
	public int faceEntity;
	public int[] currentAnimations;
	public MovingAnimation aClass456_Sub3_10337;
	public Animation currentAnimation;
	public int anInt10347;
	public int anInt10348;
	public byte aByte10352;
	public int lastUpdate;
	public int anInt10340;
	public Class19 aClass19_10359;
	public Class19 aClass19_10360;
	public Class19 aClass19_10330;
	public int anInt10366;
	public int anInt10368;
	boolean aBool10312;
	public int[] regionBaseX;
	public int[] regionBaseY;
	public byte[] walkTypes;
	public MeshRasterizer[] aClass528Array10372;
	public Class161[] aClass161Array10339;
	public Class456_Sub2_Sub1[] aClass456_Sub2_Sub1Array10354;
	Class163 aClass163_10334;
	int anInt10322;
	int anInt10323;
	int anInt10363;

	public void turn(int i_1, boolean bool_2) {
		RenderAnimDefs renderanimdefs_4 = this.getRenderAnimDefs();
		if (bool_2 || renderanimdefs_4.anInt2820 != 0 || this.anInt10340 != 0) {
			this.turnDirection = i_1 & 0x3fff;
			this.aClass19_10359.method577(this.turnDirection, 836947093);
		}

	}

	public int method13017() {
		return this.anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * this.anInt10317 * -358839357;
	}

	boolean method12987(int i_1) {
		return this.aBool10312;
	}

	public abstract int method15794();

	public void method15795(int i_1, int i_2, boolean bool_3, byte b_4) {
		if (this.initInterface()) {
			InteractableObject.method16099(this.inter.components, -1, i_1, i_2, bool_3, (byte) 33);
		}

	}

	public int method15796() {
		RenderAnimDefs renderanimdefs_2 = this.getRenderAnimDefs();
		int i_3 = this.aClass19_10359.turnDirection;
		boolean bool_4;
		if (renderanimdefs_2.anInt2820 != 0) {
			bool_4 = this.aClass19_10359.method576(this.turnDirection, renderanimdefs_2.anInt2820, renderanimdefs_2.anInt2804, 1656393893);
		} else {
			bool_4 = this.aClass19_10359.method576(this.turnDirection, this.anInt10340, this.anInt10340, 1676023529);
		}

		int i_5 = this.aClass19_10359.turnDirection - i_3;
		if (i_5 != 0) {
			++this.turningTicks;
		} else {
			this.turningTicks = 0;
			this.aClass19_10359.method577(this.turnDirection, 2019707046);
		}

		if (bool_4) {
			if (renderanimdefs_2.anInt2825 != 0) {
				if (i_5 > 0) {
					this.aClass19_10360.method576(renderanimdefs_2.anInt2824, renderanimdefs_2.anInt2825, renderanimdefs_2.anInt2823, 1659264135);
				} else {
					this.aClass19_10360.method576(-renderanimdefs_2.anInt2824, renderanimdefs_2.anInt2825, renderanimdefs_2.anInt2823, 1639499103);
				}
			}

			if (renderanimdefs_2.anInt2816 != 0) {
				this.aClass19_10330.method576(renderanimdefs_2.anInt2827, renderanimdefs_2.anInt2816, renderanimdefs_2.anInt2815, 1666619993);
			}
		} else {
			if (renderanimdefs_2.anInt2825 != 0) {
				this.aClass19_10360.method576(0, renderanimdefs_2.anInt2825, renderanimdefs_2.anInt2823, 2114745339);
			} else {
				this.aClass19_10360.method577(0, 1751012412);
			}

			if (renderanimdefs_2.anInt2816 != 0) {
				this.aClass19_10330.method576(0, renderanimdefs_2.anInt2816, renderanimdefs_2.anInt2815, 1643131619);
			} else {
				this.aClass19_10330.method577(0, 1690575668);
			}
		}

		return i_5;
	}

	public void method15797(int[] ints_1, int[] ints_2) {
		if (this.anIntArray10335 == null && ints_1 != null) {
			this.anIntArray10335 = new int[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
		} else if (ints_1 == null) {
			this.anIntArray10335 = null;
			return;
		}

		int i_4;
		for (i_4 = 0; i_4 < this.anIntArray10335.length; i_4++) {
			this.anIntArray10335[i_4] = -1;
		}

		for (i_4 = 0; i_4 < ints_1.length; i_4++) {
			int i_5 = ints_2[i_4];

			for (int i_6 = 0; i_6 < this.anIntArray10335.length; i_5 >>= 1) {
				if ((i_5 & 0x1) != 0) {
					this.anIntArray10335[i_6] = ints_1[i_4];
				}

				++i_6;
			}
		}

	}

	public boolean method15798(int i_1, int i_2) {
		if (this.anIntArray10362 == null) {
			if (i_2 == -1) {
				return true;
			}

			this.anIntArray10362 = new int[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];

			for (int i_10 = 0; i_10 < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i_10++) {
				this.anIntArray10362[i_10] = -1;
			}
		}

		RenderAnimDefs renderanimdefs_4 = this.getRenderAnimDefs();
		int i_5 = 256;
		if (renderanimdefs_4.anIntArray2818 != null && renderanimdefs_4.anIntArray2818[i_1] > 0) {
			i_5 = renderanimdefs_4.anIntArray2818[i_1];
		}

		int i_6;
		int i_7;
		if (i_2 == -1) {
			if (this.anIntArray10362[i_1] == -1) {
				return true;
			} else {
				i_6 = this.aClass19_10359.method578();
				i_7 = this.anIntArray10362[i_1];
				int i_8 = i_6 - i_7;
				if (i_8 >= -i_5 && i_8 <= i_5) {
					this.anIntArray10362[i_1] = -1;

					for (int i_9 = 0; i_9 < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i_9++) {
						if (this.anIntArray10362[i_9] != -1) {
							return true;
						}
					}

					this.anIntArray10362 = null;
					return true;
				} else {
					if ((i_8 <= 0 || i_8 > 8192) && i_8 > -8192) {
						this.anIntArray10362[i_1] = i_7 - i_5 & 0x3fff;
					} else {
						this.anIntArray10362[i_1] = i_7 + i_5 & 0x3fff;
					}

					return false;
				}
			}
		} else {
			if (this.anIntArray10362[i_1] == -1) {
				this.anIntArray10362[i_1] = this.aClass19_10359.method578();
			}

			i_6 = this.anIntArray10362[i_1];
			i_7 = i_2 - i_6;
			if (i_7 >= -i_5 && i_7 <= i_5) {
				this.anIntArray10362[i_1] = i_2;
				return true;
			} else {
				if ((i_7 <= 0 || i_7 > 8192) && i_7 > -8192) {
					this.anIntArray10362[i_1] = i_6 - i_5 & 0x3fff;
				} else {
					this.anIntArray10362[i_1] = i_6 + i_5 & 0x3fff;
				}

				return false;
			}
		}
	}

	void method15799(GraphicalRenderer graphicalrenderer_1, MeshRasterizer[] arr_2, Matrix44Var matrix44var_3, boolean bool_4, byte b_5) {
		if (!bool_4) {
			int i_6 = 0;
			int i_7 = 0;
			int i_8 = 0;
			int i_9 = 0;
			int i_10 = -1;
			int i_11 = -1;
			Surface[][] arr_12 = new Surface[arr_2.length][];
			SurfaceSkin[][] arr_13 = new SurfaceSkin[arr_2.length][];

			for (int i_14 = 0; i_14 < arr_2.length; i_14++) {
				if (arr_2[i_14] != null) {
					arr_2[i_14].method11273(matrix44var_3);
					arr_12[i_14] = arr_2[i_14].method11253();
					arr_13[i_14] = arr_2[i_14].method11274();
					if (arr_12[i_14] != null) {
						i_10 = i_14;
						++i_7;
						i_6 += arr_12[i_14].length;
					}

					if (arr_13[i_14] != null) {
						i_11 = i_14;
						++i_9;
						i_8 += arr_13[i_14].length;
					}
				}
			}

			if ((this.aClass539_10369 == null || this.aClass539_10369.aBool7132) && (i_7 > 0 || i_9 > 0)) {
				this.aClass539_10369 = ParticleSystem.method11557(client.cycles, true);
			}

			if (this.aClass539_10369 != null) {
				Object obj_20 = null;
				Surface[] arr_15;
				if (i_7 == 1) {
					arr_15 = arr_12[i_10];
				} else {
					arr_15 = new Surface[i_6];
					int i_21 = 0;

					for (int i_22 = 0; i_22 < arr_2.length; i_22++) {
						if (arr_12[i_22] != null) {
							System.arraycopy(arr_12[i_22], 0, arr_15, i_21, arr_12[i_22].length);
							i_21 += arr_12[i_22].length;
						}
					}
				}

				Object obj_16 = null;
				SurfaceSkin[] arr_17;
				if (i_9 == 1) {
					arr_17 = arr_13[i_11];
				} else {
					arr_17 = new SurfaceSkin[i_8];
					int i_18 = 0;

					for (int i_19 = 0; i_19 < arr_2.length; i_19++) {
						if (arr_13[i_19] != null) {
							System.arraycopy(arr_13[i_19], 0, arr_17, i_18, arr_13[i_19].length);
							i_18 += arr_13[i_19].length;
						}
					}
				}

				this.aClass539_10369.method11511(graphicalrenderer_1, (long) client.cycles, arr_15, arr_17);
				this.aBool10370 = true;
			}
		} else if (this.aClass539_10369 != null) {
			this.aClass539_10369.method11512((long) client.cycles);
		}

		if (this.aClass539_10369 != null) {
			this.aClass539_10369.method11515(this.plane, this.aShort9458, this.localX, this.aShort9456, this.localY);
		}

	}

	public final void sendSpotAnim(int spotAnimId, int i_2, int i_3, int i_4, boolean bool_5, int i_6, int i_7) {
		Class161 class161_8 = this.aClass161Array10339[i_6];
		int currSpotAnimId = class161_8.spotAnimId;
		if (spotAnimId != -1 && currSpotAnimId != -1) {
			SpotAnimDefinitions spotAnimDefs;
			if (currSpotAnimId == spotAnimId) {
				spotAnimDefs = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) -32);
				if (spotAnimDefs.aBool6968 && spotAnimDefs.animationId != -1) {
					AnimationDefinitions animationdefinitions_11 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotAnimDefs.animationId, (byte) 21);
					int i_12 = animationdefinitions_11.replayMode;
					if (i_12 == 0) {
						return;
					}

					if (i_12 == 2) {
						class161_8.animation.method7584(955077688);
						return;
					}
				}
			} else {
				spotAnimDefs = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) 36);
				SpotAnimDefinitions currSpotAnimDefs = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(currSpotAnimId, (byte) -6);
				if (spotAnimDefs.animationId != -1 && currSpotAnimDefs.animationId != -1) {
					AnimationDefinitions animationdefinitions_15 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotAnimDefs.animationId, (byte) -33);
					AnimationDefinitions animationdefinitions_13 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(currSpotAnimDefs.animationId, (byte) 13);
					if (animationdefinitions_15.priority < animationdefinitions_13.priority) {
						return;
					}
				}
			}
		}

		byte b_14 = 0;
		if (spotAnimId != -1 && !IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) 62).aBool6968) {
			b_14 = 2;
		}

		if (spotAnimId != -1 && bool_5) {
			b_14 = 1;
		}

		class161_8.spotAnimId = spotAnimId;
		class161_8.anInt2011 = i_4;
		class161_8.anInt2013 = i_2 >> 16;
		class161_8.anInt2015 = i_3;
		class161_8.animation.method7571(spotAnimId != -1 ? IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) -71).animationId : -1, i_2 & 0xffff, b_14, false, -1358660139);
	}

	public final void method15801() {
		this.anInt10355 = 0;
		this.anInt10367 = 0;
	}

	public final void applyHit(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		boolean bool_8 = true;
		boolean bool_9 = true;

		int i_10;
		for (i_10 = 0; i_10 < QuickchatFiller.ENTITY_DEFAULTS.maximumHits; i_10++) {
			if (this.anIntArray10351[i_10] > i_5) {
				bool_8 = false;
			} else {
				bool_9 = false;
			}
		}

		i_10 = -1;
		int i_11 = -1;
		int i_12 = 0;
		if (i_1 >= 0) {
			HitsplatDefinitions hitsplatdefinitions_13 = IndexLoaders.HITSPLAT_LOADER.getDefinitions(i_1);
			i_11 = hitsplatdefinitions_13.anInt2839;
			i_12 = hitsplatdefinitions_13.anInt2841;
		}

		int i_15;
		if (bool_9) {
			if (i_11 == -1) {
				return;
			}

			i_10 = 0;
			i_15 = 0;
			if (i_11 == 0) {
				i_15 = this.anIntArray10351[0];
			} else if (i_11 == 1) {
				i_15 = this.anIntArray10329[0];
			}

			for (int i_14 = 1; i_14 < QuickchatFiller.ENTITY_DEFAULTS.maximumHits; i_14++) {
				if (i_11 == 0) {
					if (this.anIntArray10351[i_14] < i_15) {
						i_10 = i_14;
						i_15 = this.anIntArray10351[i_14];
					}
				} else if (i_11 == 1 && this.anIntArray10329[i_14] < i_15) {
					i_10 = i_14;
					i_15 = this.anIntArray10329[i_14];
				}
			}

			if (i_11 == 1 && i_15 >= i_2) {
				return;
			}
		} else {
			if (bool_8) {
				this.aByte10358 = 0;
			}

			for (i_15 = 0; i_15 < QuickchatFiller.ENTITY_DEFAULTS.maximumHits; i_15++) {
				byte b_16 = this.aByte10358;
				this.aByte10358 = (byte) ((this.aByte10358 + 1) % QuickchatFiller.ENTITY_DEFAULTS.maximumHits);
				if (this.anIntArray10351[b_16] <= i_5) {
					i_10 = b_16;
					break;
				}
			}
		}

		if (i_10 >= 0) {
			this.anIntArray10316[i_10] = i_1;
			this.anIntArray10329[i_10] = i_2;
			this.anIntArray10331[i_10] = i_3;
			this.anIntArray10332[i_10] = i_4;
			this.anIntArray10351[i_10] = i_5 + i_12 + i_6;
		}

	}

	public final void displayHitbar(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		HitbarDefinitions hitbardefinitions_8 = IndexLoaders.HITBAR_LOADER.getDefinitions(i_1, -133815568);
		Class275_Sub7 class275_sub7_9 = null;
		Class275_Sub7 class275_sub7_10 = null;
		int i_11 = hitbardefinitions_8.anInt2440;
		int i_12 = 0;

		Class275_Sub7 class275_sub7_13;
		for (class275_sub7_13 = (Class275_Sub7) this.aClass457_10333.method7659(); class275_sub7_13 != null; class275_sub7_13 = (Class275_Sub7) this.aClass457_10333.method7650((byte) 105)) {
			++i_12;
			if (hitbardefinitions_8 == class275_sub7_13.aClass198_7863) {
				class275_sub7_13.method12601(i_2 + i_4, i_5, i_6, i_3, -555582799);
				return;
			}

			if (class275_sub7_13.aClass198_7863.anInt2446 <= hitbardefinitions_8.anInt2446) {
				class275_sub7_9 = class275_sub7_13;
			}

			if (class275_sub7_13.aClass198_7863.anInt2440 > i_11) {
				class275_sub7_10 = class275_sub7_13;
				i_11 = class275_sub7_13.aClass198_7863.anInt2440;
			}
		}

		if (class275_sub7_10 != null || i_12 < QuickchatFiller.ENTITY_DEFAULTS.anInt7032) {
			class275_sub7_13 = new Class275_Sub7(hitbardefinitions_8);
			if (class275_sub7_9 == null) {
				this.aClass457_10333.method7647(class275_sub7_13, -1998416604);
			} else {
				Class516.method8866(class275_sub7_13, class275_sub7_9, -63118413);
			}

			class275_sub7_13.method12601(i_2 + i_4, i_5, i_6, i_3, -1371931787);
			if (i_12 >= QuickchatFiller.ENTITY_DEFAULTS.anInt7032) {
				class275_sub7_10.method4887();
			}
		}

	}

	boolean method13000() {
		return this.aBool10312;
	}

	public int method12997() {
		RenderAnimDefs renderanimdefs_2 = this.getRenderAnimDefs();
		int i_3;
		if (renderanimdefs_2.anInt2798 != -1) {
			i_3 = renderanimdefs_2.anInt2798;
		} else if (this.anInt10317 == -32768) {
			i_3 = 200;
		} else {
			i_3 = -this.anInt10317;
		}

		Position class305_4 = this.method11166();
		int i_5 = (int) class305_4.aClass385_3595.x >> 9;
		int i_6 = (int) class305_4.aClass385_3595.z >> 9;
		if (this.aClass206_7970 != null && i_5 >= 1 && i_6 >= 1 && i_5 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_6 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) {
			Class293 class293_7 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][i_5][i_6];
			if (class293_7 != null && class293_7.aClass521_Sub1_Sub3_3499 != null) {
				return class293_7.aClass521_Sub1_Sub3_3499.aShort9561 + i_3;
			}
		}

		return i_3;
	}

	public abstract int method15804();

	public int getSize() {
		return this.anInt10315;
	}

	public void method14697(byte b_1) {
		int i_2 = (this.anInt10315 - 1 << 8) + 240;
		Vector3 vector3_3 = this.method11166().aClass385_3595;
		this.aShort9458 = (short) ((int) vector3_3.x - i_2 >> 9);
		this.aShort9456 = (short) ((int) vector3_3.z - i_2 >> 9);
		this.localX = (short) (i_2 + (int) vector3_3.x >> 9);
		this.localY = (short) (i_2 + (int) vector3_3.z >> 9);
	}

	Animable(SceneObjectManager sceneobjectmanager_1) {
		this(sceneobjectmanager_1, 10);
	}

	public abstract int method15806();

	boolean method12986(int i_1) {
		return false;
	}

	abstract int getRenderAnimation();

	public abstract Class163 method15809();

	public abstract Class163 method15811(int var1);

	public void method15812(int i_1) {
		if (this.aClass163_10334 != null && this.aClass163_10334.aString2028 != null) {
			--this.aClass163_10334.anInt2030;
			if (this.aClass163_10334.anInt2030 == 0) {
				this.aClass163_10334.aString2028 = null;
			}
		}

	}

	public void method15813(int i_1) {
		if (this.interfaceIdToLoad != this.loadedInterfaceId) {
			this.method15816();
		}

		this.interfaceIdToLoad = i_1;
	}

	public abstract boolean method15814();

	boolean initInterface(int i_1) {
		if (this.loadedInterfaceId == i_1) {
			return true;
		} else {
			this.inter = SkyboxIndexLoader.getInterface(i_1, (int[]) null, (RSInterface) null, true, (byte) -56);
			if (this.inter == null) {
				return false;
			} else {
				this.loadedInterfaceId = i_1;
				Connection.runIComponentScripts(this.inter.components);
				return true;
			}
		}
	}

	void method15816() {
		if (this.loadedInterfaceId != -1) {
			HostNameIdentifier.clearComponents(this.loadedInterfaceId, -1658723672);
			this.inter = null;
			this.loadedInterfaceId = -1;
		}

	}

	public void method15818(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (!this.initInterface()) {
			if (i_1 != -1) {
				client.aBoolArray7443[i_1] = true;
			} else {
				for (int i_9 = 0; i_9 < 107; i_9++) {
					client.aBoolArray7443[i_9] = true;
				}
			}
		} else {
			GroundDecoration.method16094(this.inter.method1616(2115136308), -1, i_2, i_3, i_4, i_5, i_6, i_7, i_1, false);
		}

	}

	void method15819(MeshRasterizer meshrasterizer_1) {
		int i_3 = this.aClass19_10360.turnDirection;
		int i_4 = this.aClass19_10330.turnDirection;
		if (i_3 != 0 || i_4 != 0) {
			int i_5 = meshrasterizer_1.YA() / 2;
			meshrasterizer_1.ia(0, -i_5, 0);
			meshrasterizer_1.EA(i_3 & 0x3fff);
			meshrasterizer_1.t(i_4 & 0x3fff);
			meshrasterizer_1.ia(0, i_5, 0);
		}

	}

	boolean method12999() {
		return false;
	}

	boolean method13001() {
		return this.aBool10312;
	}

	public int method13003() {
		return this.anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * this.anInt10317 * -358839357;
	}

	boolean method13002() {
		return this.aBool10312;
	}

	public int method13005() {
		return this.anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * this.anInt10317 * -358839357;
	}

	public void setBoundSize(int i_1) {
		this.anInt10315 = i_1;
	}

	void method15837(GraphicalRenderer graphicalrenderer_1, RenderAnimDefs renderanimdefs_2, int i_3, int i_4, int i_5, int i_6) {
		for (int i_8 = 0; i_8 < this.aClass161Array10339.length; i_8++) {
			byte b_9 = 0;
			if (i_8 == 0) {
				b_9 = 2;
			} else if (i_8 == 1) {
				b_9 = 5;
			} else if (i_8 == 2) {
				b_9 = 1;
			} else if (i_8 == 3) {
				b_9 = 7;
			}

			Class161 class161_10 = this.aClass161Array10339[i_8];
			if (class161_10.spotAnimId != -1 && !class161_10.animation.hasSpeed(-544447199)) {
				SpotAnimDefinitions spotanimdefinitions_11 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(class161_10.spotAnimId, (byte) 62);
				boolean bool_12 = spotanimdefinitions_11.aByte6982 == 3 && (i_4 != 0 || i_5 != 0);
				int i_13 = i_3;
				if (bool_12) {
					i_13 = i_3 | 0x7;
				} else {
					if (class161_10.anInt2015 != 0) {
						i_13 = i_3 | 0x5;
					}

					if (class161_10.anInt2013 != 0) {
						i_13 |= 0x2;
					}

					if (class161_10.anInt2011 >= 0) {
						i_13 |= 0x7;
					}
				}

				MeshRasterizer meshrasterizer_14 = this.aClass528Array10372[i_8 + 1] = spotanimdefinitions_11.method11228(graphicalrenderer_1, i_13, class161_10.animation, b_9, (byte) 53);
				if (meshrasterizer_14 != null) {
					if (class161_10.anInt2011 >= 0 && renderanimdefs_2.anIntArrayArray2802 != null && renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011] != null) {
						int i_15 = 0;
						int i_16 = 0;
						int i_17 = 0;
						if (renderanimdefs_2.anIntArrayArray2802 != null && renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011] != null) {
							i_15 += renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011][0];
							i_16 += renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011][1];
							i_17 += renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011][2];
						}

						if (renderanimdefs_2.anIntArrayArray2791 != null && renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011] != null) {
							i_15 += renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011][0];
							i_16 += renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011][1];
							i_17 += renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011][2];
						}

						if (i_17 != 0 || i_15 != 0) {
							int i_18 = i_6;
							if (this.anIntArray10362 != null && this.anIntArray10362[class161_10.anInt2011] != -1) {
								i_18 = this.anIntArray10362[class161_10.anInt2011];
							}

							int i_19 = i_18 + class161_10.anInt2015 * 2048 - i_6 & 0x3fff;
							if (i_19 != 0) {
								meshrasterizer_14.f(i_19);
							}

							int i_20 = Class382.anIntArray4657[i_19];
							int i_21 = Class382.anIntArray4661[i_19];
							int i_22 = i_21 * i_15 + i_17 * i_20 >> 14;
							i_17 = i_21 * i_17 - i_15 * i_20 >> 14;
							i_15 = i_22;
						}

						meshrasterizer_14.ia(i_15, i_16, i_17);
					} else if (class161_10.anInt2015 != 0) {
						meshrasterizer_14.f(class161_10.anInt2015 * 2048);
					}

					if (class161_10.anInt2013 != 0) {
						meshrasterizer_14.ia(0, -class161_10.anInt2013 << 2, 0);
					}

					if (bool_12) {
						if (this.anInt10322 != 0) {
							meshrasterizer_14.t(this.anInt10322);
						}

						if (this.anInt10323 != 0) {
							meshrasterizer_14.EA(this.anInt10323);
						}

						if (this.anInt10363 != 0) {
							meshrasterizer_14.ia(0, this.anInt10363, 0);
						}
					}
				}
			} else {
				this.aClass528Array10372[i_8 + 1] = null;
			}
		}

	}

	public abstract Class163 method15852();

	public RenderAnimDefs getRenderAnimDefs() {
		int i_2 = this.getRenderAnimation();
		return i_2 == -1 ? RenderAnimIndexLoader.aClass227_2669 : IndexLoaders.RENDER_ANIM_LOADER.getRenderAnimDefs(i_2, (byte) -2);
	}

	public final void method15857(int i_1) {
		HitbarDefinitions hitbardefinitions_3 = IndexLoaders.HITBAR_LOADER.getDefinitions(i_1, 757267285);

		for (Class275_Sub7 class275_sub7_4 = (Class275_Sub7) this.aClass457_10333.method7659(); class275_sub7_4 != null; class275_sub7_4 = (Class275_Sub7) this.aClass457_10333.method7650((byte) 67)) {
			if (hitbardefinitions_3 == class275_sub7_4.aClass198_7863) {
				class275_sub7_4.method4887();
				break;
			}
		}

	}

	public void method15863(int i_1, int i_2) {
		RenderAnimDefs renderanimdefs_3 = this.getRenderAnimDefs();
		if (renderanimdefs_3.anInt2820 != 0 || this.anInt10340 != 0) {
			this.aClass19_10359.method579();
			int i_4 = i_1 - this.aClass19_10359.turnDirection & 0x3fff;
			if (i_4 > 8192) {
				this.turnDirection = this.aClass19_10359.turnDirection - (16384 - i_4);
			} else {
				this.turnDirection = this.aClass19_10359.turnDirection + i_4;
			}
		}

	}

	abstract int method15867();

	abstract int method15868();

	Animable(SceneObjectManager sceneobjectmanager_1, int i_2) {
		super(sceneobjectmanager_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		this.anInt10315 = 1;
		this.anInt10317 = -32768;
		this.aBool10318 = true;
		this.anInt10319 = 0;
		this.anInt10375 = -1;
		this.drawPriority = 0;
		this.anInt10325 = 0;
		this.aByte10358 = 0;
		this.anIntArray10316 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
		this.anIntArray10329 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
		this.anIntArray10351 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
		this.anIntArray10331 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
		this.anIntArray10332 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
		this.aClass457_10333 = new EntityList();
		this.faceEntity = -1;
		this.currentAnimations = null;
		this.aClass456_Sub3_10337 = new MovingAnimation(this);
		this.currentAnimation = new Class456_Sub2(this);
		this.anInt10347 = -1;
		this.anInt10348 = -1;
		this.aByte10352 = 0;
		this.lastUpdate = 0;
		this.turningTicks = 0;
		this.anInt10340 = 256;
		this.aClass19_10359 = new Class19();
		this.aClass19_10360 = new Class19();
		this.aClass19_10330 = new Class19();
		this.anInt10355 = 0;
		this.anInt10366 = 0;
		this.anInt10367 = 0;
		this.anInt10368 = 0;
		this.aBool10370 = false;
		this.aBool10312 = false;
		this.loadedInterfaceId = -1;
		this.interfaceIdToLoad = -1;
		this.regionBaseX = new int[i_2];
		this.regionBaseY = new int[i_2];
		this.walkTypes = new byte[i_2];
		this.aClass528Array10372 = new MeshRasterizer[5];
		this.aClass161Array10339 = new Class161[4];

		for (int i_3 = 0; i_3 < 4; i_3++) {
			this.aClass161Array10339[i_3] = new Class161(this);
		}

		this.aClass456_Sub2_Sub1Array10354 = new Class456_Sub2_Sub1[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
	}

	public abstract boolean method15871();

	public abstract boolean method15872();

	public abstract boolean method15873();

	public abstract int method15874();

	public void method15875(String string_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass163_10334 == null) {
			this.aClass163_10334 = new Class163();
		}

		this.aClass163_10334.aString2028 = string_1;
		this.aClass163_10334.anInt2027 = i_2;
		this.aClass163_10334.anInt2029 = i_3;
		this.aClass163_10334.anInt2030 = this.aClass163_10334.anInt2026 = i_4;
	}

	public abstract Class163 method15876();

	public abstract Class163 method15877();

	public void method15880(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, byte b_9) {
		if (this.initInterface()) {
			client.method11768(this.inter, this.inter.method1616(2121231895), -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
		}

	}

	public abstract boolean method15887();

	public int method13006() {
		return this.anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * this.anInt10317 * -358839357;
	}

	public abstract int method15892();

	void method15895(int i_1, int i_2, int i_3, int i_4, int i_5) {
		Vector3 vector3_7 = this.method11166().aClass385_3595;
		int i_8 = this.aShort9458 + this.localX >> 1;
		int i_9 = this.localY + this.aShort9456 >> 1;
		int i_10 = Class382.anIntArray4657[i_1];
		int i_11 = Class382.anIntArray4661[i_1];
		int i_12 = -i_2 / 2;
		int i_13 = -i_3 / 2;
		int i_14 = i_11 * i_12 + i_10 * i_13 >> 14;
		int i_15 = i_13 * i_11 - i_10 * i_12 >> 14;
		int i_16 = Class13.method507(i_14 + (int) vector3_7.x, i_15 + (int) vector3_7.z, i_8, i_9, this.plane, (byte) -92);
		int i_17 = i_2 / 2;
		int i_18 = -i_3 / 2;
		int i_19 = i_17 * i_11 + i_10 * i_18 >> 14;
		int i_20 = i_11 * i_18 - i_17 * i_10 >> 14;
		int i_21 = Class13.method507(i_19 + (int) vector3_7.x, i_20 + (int) vector3_7.z, i_8, i_9, this.plane, (byte) -75);
		int i_22 = -i_2 / 2;
		int i_23 = i_3 / 2;
		int i_24 = i_11 * i_22 + i_10 * i_23 >> 14;
		int i_25 = i_23 * i_11 - i_10 * i_22 >> 14;
		int i_26 = Class13.method507(i_24 + (int) vector3_7.x, i_25 + (int) vector3_7.z, i_8, i_9, this.plane, (byte) -66);
		int i_27 = i_2 / 2;
		int i_28 = i_3 / 2;
		int i_29 = i_11 * i_27 + i_28 * i_10 >> 14;
		int i_30 = i_28 * i_11 - i_10 * i_27 >> 14;
		int i_31 = Class13.method507(i_29 + (int) vector3_7.x, i_30 + (int) vector3_7.z, i_8, i_9, this.plane, (byte) -13);
		int i_32 = i_16 < i_21 ? i_16 : i_21;
		int i_33 = i_26 < i_31 ? i_26 : i_31;
		int i_34 = i_21 < i_31 ? i_21 : i_31;
		int i_35 = i_16 < i_26 ? i_16 : i_26;
		this.anInt10322 = (int) (Math.atan2((double) (i_32 - i_33), (double) i_3) * 2607.5945876176133D) & 0x3fff;
		this.anInt10323 = (int) (Math.atan2((double) (i_35 - i_34), (double) i_2) * 2607.5945876176133D) & 0x3fff;
		int i_36;
		if (this.anInt10322 != 0 && i_4 != 0) {
			i_36 = 16384 - i_4;
			if (this.anInt10322 > 8192) {
				if (this.anInt10322 < i_36) {
					this.anInt10322 = i_36;
				}
			} else if (this.anInt10322 > i_4) {
				this.anInt10322 = i_4;
			}
		}

		if (this.anInt10323 != 0 && i_5 != 0) {
			i_36 = 16384 - i_5;
			if (this.anInt10323 > 8192) {
				if (this.anInt10323 < i_36) {
					this.anInt10323 = i_36;
				}
			} else if (this.anInt10323 > i_5) {
				this.anInt10323 = i_5;
			}
		}

		this.anInt10363 = i_31 + i_16;
		if (i_21 + i_26 < this.anInt10363) {
			this.anInt10363 = i_26 + i_21;
		}

		this.anInt10363 = (this.anInt10363 >> 1) - (int) vector3_7.y;
	}

	public abstract int method15897();

	public abstract int method15898();

	public abstract int method15899(int var1);

	public int method12995(int i_1) {
		return this.anInt10317 == -32768 ? 0 : this.anInt10317;
	}

	boolean initInterface() {
		return this.interfaceIdToLoad == -1 ? false : this.initInterface(this.interfaceIdToLoad);
	}

}
