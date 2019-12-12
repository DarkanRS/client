public class NPC extends Entity {

	public NPCMeshModifier meshModifiers;
	public int faceX = -1;
	public int faceY = -1;
	public int meshModifierCount = 1;
	public int headMeshModifierCount = 1;
	public int anInt10575 = -1;
	public VarNPCMap varns = new VarNPCMap();
	int[] anIntArray10585 = new int[6];
	int[] anIntArray10586 = new int[6];
	int anInt10587;
	int anInt10588;
	int anInt10589;
	int anInt10590;
	public NPCDefinitions definitions;
	public String modifiedName;
	public int anInt10582;

	int method12996() {
		return this.definitions == null ? 0 : this.definitions.anInt4913;
	}

	public NPC(SceneObjectManager sceneobjectmanager_1) {
		super(sceneobjectmanager_1, 25);
		this.method16156();
	}

	void method16156() {
		this.anInt10587 = 32 + (int) (Math.random() * 4.0D);
		this.anInt10588 = 3 + (int) (Math.random() * 2.0D);
		this.anInt10589 = 16 + (int) (Math.random() * 3.0D);
		if (Class393.preferences.textures.method12873(-255909442) == 1) {
			this.anInt10590 = (int) (Math.random() * 6.0D);
		} else {
			this.anInt10590 = (int) (Math.random() * 12.0D);
		}

	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return null;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	boolean method16158(GraphicalRenderer graphicalrenderer_1, int i_2, byte b_3) {
		int i_4 = i_2;
		BASDefinitions renderanimdefs_5 = this.getRenderAnimDefs();
		Animation animation_6 = this.currentAnimation.hasDefs() && !this.currentAnimation.hasSpeed(-1119795377) ? this.currentAnimation : null;
		MovingAnimation class456_sub3_7 = this.aAnimation_Sub3_10337.hasDefs() && (!this.aAnimation_Sub3_10337.aBool7891 || animation_6 == null) ? this.aAnimation_Sub3_10337 : null;
		int i_8 = renderanimdefs_5.anInt2786;
		int i_9 = renderanimdefs_5.anInt2829;
		if (i_8 != 0 || i_9 != 0 || renderanimdefs_5.anInt2824 != 0 || renderanimdefs_5.anInt2827 != 0) {
			i_2 |= 0x7;
		}

		boolean bool_10 = this.scalar != 0 && client.cycles >= this.anInt10347 && client.cycles < this.anInt10348;
		if (bool_10) {
			i_2 |= 0x80000;
		}

		int i_11 = this.aClass19_10359.method578();
		MeshRasterizer meshrasterizer_12 = this.aMeshRasterizerArray10372[0] = this.definitions.renderFull(graphicalrenderer_1, i_2, IndexLoaders.RENDER_ANIM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, animation_6, class456_sub3_7, this.aAnimation_Sub2_Sub1Array10354, this.anIntArray10362, i_11, this.meshModifiers, this.getRenderAnimation(), false, -1676394010);
		if (meshrasterizer_12 == null) {
			return false;
		} else {
			this.anInt10317 = meshrasterizer_12.YA();
			meshrasterizer_12.n();
			this.method15819(meshrasterizer_12);
			if (i_8 == 0 && i_9 == 0) {
				this.method15895(i_11, this.getSize() << 9, this.getSize() << 9, 0, 0);
			} else {
				this.method15895(i_11, i_8, i_9, renderanimdefs_5.anInt2813, renderanimdefs_5.anInt2790);
				if (this.anInt10322 != 0) {
					this.aMeshRasterizerArray10372[0].t(this.anInt10322);
				}

				if (this.anInt10323 != 0) {
					this.aMeshRasterizerArray10372[0].EA(this.anInt10323);
				}

				if (this.anInt10363 != 0) {
					this.aMeshRasterizerArray10372[0].ia(0, this.anInt10363, 0);
				}
			}

			if (bool_10) {
				meshrasterizer_12.PA(this.redAdd, this.greenAdd, this.blueAdd, this.scalar & 0xff);
			}

			this.method15837(graphicalrenderer_1, renderanimdefs_5, i_4, i_8, i_9, i_11);
			return true;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.definitions != null && (this.aBool10370 || this.method16158(graphicalrenderer_1, 0, (byte) 23))) {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			matrix44var_3.method5209(this.method11168());
			matrix44var_3.method5219(0.0F, -5.0F, 0.0F);
			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_3, this.aBool10370, (byte) -31);

			for (int i_4 = 0; i_4 < this.aMeshRasterizerArray10372.length; i_4++) {
				this.aMeshRasterizerArray10372[i_4] = null;
			}
		}

	}

	public int getCS2Index() {
		return this.index + 1;
	}

	public void move(int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
		this.plane = this.collisionPlane = (byte) i_1;
		if (IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_2, i_3, 1670715577)) {
			++this.collisionPlane;
		}

		if (this.currentAnimation.hasDefs() && this.currentAnimation.getDefs().walkingPrecedence == 1) {
			this.currentAnimations = null;
			this.currentAnimation.update(-1);
		}

		int i_7;
		for (i_7 = 0; i_7 < this.spotAnims.length; i_7++) {
			if (this.spotAnims[i_7].spotAnimId != -1) {
				SpotAnimDefinitions spotanimdefinitions_11 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnims[i_7].spotAnimId, (byte) -95);
				if (spotanimdefinitions_11.aBool6968 && spotanimdefinitions_11.animationId != -1 && IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_11.animationId, (byte) 7).walkingPrecedence == 1) {
					this.spotAnims[i_7].animation.update(-1);
					this.spotAnims[i_7].spotAnimId = -1;
				}
			}
		}

		if (!bool_4) {
			i_7 = i_2 - this.regionBaseX[0];
			int i_8 = i_3 - this.regionBaseY[0];
			if (i_7 >= -8 && i_7 <= 8 && i_8 >= -8 && i_8 <= 8) {
				if (this.anInt10355 < this.regionBaseX.length - 1) {
					++this.anInt10355;
				}

				for (int i_9 = this.anInt10355; i_9 > 0; --i_9) {
					this.regionBaseX[i_9] = this.regionBaseX[i_9 - 1];
					this.regionBaseY[i_9] = this.regionBaseY[i_9 - 1];
					this.walkTypes[i_9] = this.walkTypes[i_9 - 1];
				}

				this.regionBaseX[0] = i_2;
				this.regionBaseY[0] = i_3;
				this.walkTypes[0] = MovementType.WALKING.id;
				return;
			}
		}

		this.anInt10355 = 0;
		this.anInt10367 = 0;
		this.anInt10366 = 0;
		this.regionBaseX[0] = i_2;
		this.regionBaseY[0] = i_3;
		Vector3 vector3_10 = Vector3.popVectorStackTo(this.method11166().coords);
		vector3_10.x = (float) ((i_5 << 8) + (this.regionBaseX[0] << 9));
		vector3_10.z = (float) ((i_5 << 8) + (this.regionBaseY[0] << 9));
		this.method11171(vector3_10);
		vector3_10.pushVectorStack();
		if (this.aClass539_10369 != null) {
			this.aClass539_10369.method11505();
		}

	}

	public final boolean hasDefinition(int i_1) {
		return this.definitions != null;
	}

	int getRenderAnimation() {
		if (this.anInt10575 != -1) {
			return this.anInt10575;
		} else {
			if (this.definitions.transformTo != null) {
				NPCDefinitions npcdefinitions_2 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
				if (npcdefinitions_2 != null && npcdefinitions_2.renderEmote != -1) {
					return npcdefinitions_2.renderEmote;
				}
			}

			return this.definitions.renderEmote;
		}
	}

	public final void move(NPCDirection direction, int walkType) {
		int baseX = this.regionBaseX[0];
		int baseY = this.regionBaseY[0];
		switch (direction.value) {
		case 0:
			++baseY;
			break;
		case 1:
			--baseX;
			++baseY;
			break;
		case 2:
			++baseX;
			++baseY;
			break;
		case 3:
			++baseX;
			break;
		case 4:
			--baseX;
			--baseY;
			break;
		case 5:
			--baseX;
			break;
		case 6:
			--baseY;
			break;
		case 7:
			++baseX;
			--baseY;
		}

		if (this.currentAnimation.hasDefs() && this.currentAnimation.getDefs().walkingPrecedence == 1) {
			this.currentAnimations = null;
			this.currentAnimation.update(-1);
		}

		int i_6;
		for (i_6 = 0; i_6 < this.spotAnims.length; i_6++) {
			if (this.spotAnims[i_6].spotAnimId != -1) {
				SpotAnimDefinitions spotanimdefinitions_7 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnims[i_6].spotAnimId, (byte) -12);
				if (spotanimdefinitions_7.aBool6968 && spotanimdefinitions_7.animationId != -1 && IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_7.animationId, (byte) -9).walkingPrecedence == 1) {
					this.spotAnims[i_6].animation.update(-1);
					this.spotAnims[i_6].spotAnimId = -1;
				}
			}
		}

		if (this.anInt10355 < this.regionBaseX.length - 1) {
			++this.anInt10355;
		}

		for (i_6 = this.anInt10355; i_6 > 0; --i_6) {
			this.regionBaseX[i_6] = this.regionBaseX[i_6 - 1];
			this.regionBaseY[i_6] = this.regionBaseY[i_6 - 1];
			this.walkTypes[i_6] = this.walkTypes[i_6 - 1];
		}

		this.regionBaseX[0] = baseX;
		this.regionBaseY[0] = baseY;
		this.walkTypes[0] = (byte) walkType;
	}

	public int method12997() {
		if (this.definitions.transformTo != null) {
			NPCDefinitions npcdefinitions_2 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_2 != null && npcdefinitions_2.anInt4902 != -1) {
				return npcdefinitions_2.anInt4902;
			}
		}

		return this.definitions.anInt4902 != -1 ? this.definitions.anInt4902 : super.method12997();
	}

	boolean method16162(int i_1) {
		return this.definitions.visible;
	}

	public int method15898() {
		if (this.definitions.transformTo != null) {
			NPCDefinitions npcdefinitions_1 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_1 != null && 327817917 * npcdefinitions_1.anInt4918 * 1094135957 != -1) {
				return npcdefinitions_1.anInt4918 * 1094135957 * 327817917;
			}
		}

		return 327817917 * this.definitions.anInt4918 * 1094135957;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		if (this.definitions != null && (this.aBool10370 || this.method16158(graphicalrenderer_1, 0, (byte) -5))) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5209(this.method11168());
			matrix44var_2.method5219(0.0F, -5.0F, 0.0F);
			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, this.aBool10370, (byte) 9);

			for (int i_3 = 0; i_3 < this.aMeshRasterizerArray10372.length; i_3++) {
				this.aMeshRasterizerArray10372[i_3] = null;
			}
		}

	}

	final boolean method12985(int i_1) {
		return false;
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	public int method16163(int i_1) {
		return this.anIntArray10585[i_1];
	}

	public boolean method15871() {
		return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.definitions != null && this.method16158(graphicalrenderer_1, 131072, (byte) 19)) {
			Matrix44Var matrix44var_5 = this.method11168();
			boolean bool_6 = false;

			int i_7;
			for (i_7 = 0; i_7 < this.aMeshRasterizerArray10372.length; i_7++) {
				if (this.aMeshRasterizerArray10372[i_7] != null) {
					boolean bool_8;
					label57: {
						if (this.definitions.anInt4913 <= 0) {
							label56: {
								if (this.definitions.anInt4917 == -1) {
									if (this.definitions.size == 1) {
										break label56;
									}
								} else if (this.definitions.anInt4917 == 1) {
									break label56;
								}

								bool_8 = false;
								break label57;
							}
						}

						bool_8 = true;
					}

					boolean bool_10 = this.aMeshRasterizerArray10372[i_7].method11270(i_2, i_3, matrix44var_5, bool_8, this.definitions.anInt4913);
					if (bool_10) {
						bool_6 = true;
						break;
					}
				}
			}

			for (i_7 = 0; i_7 < this.aMeshRasterizerArray10372.length; i_7++) {
				this.aMeshRasterizerArray10372[i_7] = null;
			}

			return bool_6;
		} else {
			return false;
		}
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		if (this.definitions != null && this.method16158(graphicalrenderer_1, 526336, (byte) -27)) {
			Matrix44Var matrix44var_2 = this.method11168();
			Position class305_3 = this.method11166();
			Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
			int i_5 = this.aClass19_10359.method578();
			Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_3.coords.x >> 9][(int) class305_3.coords.z >> 9];
			if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
				int i_7 = this.anInt10325 * -374848179 * -2023195771 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = -374848179 * (int) ((float) (-2023195771 * this.anInt10325 * -374848179) - (float) i_7 / 10.0F) * -2023195771;
			} else {
				this.anInt10325 = -374848179 * (int) ((float) (this.anInt10325 * -374848179 * -2023195771) - (float) (-2023195771 * this.anInt10325 * -374848179) / 10.0F) * -2023195771;
			}

			matrix44var_4.method5209(matrix44var_2);
			matrix44var_4.method5219(0.0F, (float) (-20 - this.anInt10325 * -374848179 * -2023195771), 0.0F);
			BASDefinitions renderanimdefs_13 = this.getRenderAnimDefs();
			NPCDefinitions npcdefinitions_8 = this.definitions.transformTo != null ? this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER) : this.definitions;
			this.aBool10312 = false;
			Class285 class285_9 = null;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -105) == 1 && npcdefinitions_8.aBool4912 && renderanimdefs_13.aBool2787) {
				Animation animation_10 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(-1080298347) ? this.currentAnimation : null;
				MovingAnimation class456_sub3_11 = !this.aAnimation_Sub3_10337.hasDefs() || this.aAnimation_Sub3_10337.aBool7891 && animation_10 != null ? null : this.aAnimation_Sub3_10337;
				MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, i_5, this.anInt10322 * 2085530051 * -35614997, -1768311789 * this.anInt10323 * 884618779, -628205413 * this.anInt10363 * -1453470317, 1203434505 * this.definitions.size * -1156523463, this.aMeshRasterizerArray10372[0], this.definitions.aShort4874 & 0xffff, this.definitions.aShort4897 & 0xffff, this.definitions.aByte4883 & 0xff, this.definitions.aByte4899 & 0xff, (Animation) (class456_sub3_11 != null ? class456_sub3_11 : animation_10));
				if (meshrasterizer_12 != null) {
					if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < 1 + this.aMeshRasterizerArray10372.length) {
						this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -19);
					}

					class285_9 = Class470.method7824(this.method16162(1548602767), (byte) -37);
					this.aBool10312 = true;
					graphicalrenderer_1.RA(false);
					meshrasterizer_12.method11282(matrix44var_4, this.boundingBoxPolygons[this.aMeshRasterizerArray10372.length], 0);
					graphicalrenderer_1.RA(true);
				}
			}

			if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -90);
			}

			if (class285_9 == null) {
				class285_9 = Class470.method7824(this.method16162(759364370), (byte) -74);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_4, false, (byte) 0);

			int i_14;
			for (i_14 = 0; i_14 < this.aMeshRasterizerArray10372.length; i_14++) {
				if (this.aMeshRasterizerArray10372[i_14] != null) {
					if (this.definitions.aBool4920) {
						this.aMeshRasterizerArray10372[i_14].PA(this.anInt10587 * 1113755543 * 812179495, 954646983 * this.anInt10588 * -1431655765 * 3 * -1912819721, 37639707 * this.anInt10589 * -62352365, 478845591 * this.anInt10590 * -331447001);
					}

					this.aMeshRasterizerArray10372[i_14].method11282(matrix44var_4, this.boundingBoxPolygons[i_14], 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_15 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_15);
			}

			for (i_14 = 0; i_14 < this.aMeshRasterizerArray10372.length; i_14++) {
				if (this.aMeshRasterizerArray10372[i_14] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_14].i();
				}

				this.aMeshRasterizerArray10372[i_14] = null;
			}

			this.anInt10349 = client.anInt7286 * 1895928101 * 1178121955 * -2009373393;
			return class285_9;
		} else {
			return null;
		}
	}

	public void method16164(String string_1) {
		int i_5 = Class204.method3363(1027745545) * QuickchatFiller.ENTITY_DEFAULTS.npcMessageDuration;
		this.method15875(string_1, 0, 0, i_5, 1930642006);
	}

	public Class163 method15852() {
		return this.aClass163_10334 != null && this.aClass163_10334.aString2028 == null ? null : this.aClass163_10334;
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		if (this.definitions != null && this.method16158(graphicalrenderer_1, 526336, (byte) 26)) {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Matrix44Var matrix44var_5 = graphicalrenderer_1.method8450();
			int i_6 = this.aClass19_10359.method578();
			Class293 class293_7 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
			if (class293_7 != null && class293_7.aTransform_Sub1_Sub3_3499 != null) {
				int i_8 = this.anInt10325 - class293_7.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = (int) ((float) this.anInt10325 - (float) i_8 / 10.0F);
			} else {
				this.anInt10325 = (int) ((float) this.anInt10325 - (float) this.anInt10325 / 10.0F);
			}

			matrix44var_5.method5209(matrix44var_3);
			matrix44var_5.method5219(0.0F, (float) (-20 - this.anInt10325), 0.0F);
			BASDefinitions renderanimdefs_14 = this.getRenderAnimDefs();
			NPCDefinitions npcdefinitions_9 = this.definitions.transformTo != null ? this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER) : this.definitions;
			this.aBool10312 = false;
			Class285 class285_10 = null;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -38) == 1 && npcdefinitions_9.aBool4912 && renderanimdefs_14.aBool2787) {
				Animation animation_11 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(-539713016) ? this.currentAnimation : null;
				MovingAnimation class456_sub3_12 = !this.aAnimation_Sub3_10337.hasDefs() || this.aAnimation_Sub3_10337.aBool7891 && animation_11 != null ? null : this.aAnimation_Sub3_10337;
				MeshRasterizer meshrasterizer_13 = SongReference.method1969(graphicalrenderer_1, i_6, this.anInt10322, this.anInt10323, this.anInt10363, this.definitions.size, this.aMeshRasterizerArray10372[0], this.definitions.aShort4874 & 0xffff, this.definitions.aShort4897 & 0xffff, this.definitions.aByte4883 & 0xff, this.definitions.aByte4899 & 0xff, (Animation) (class456_sub3_12 != null ? class456_sub3_12 : animation_11));
				if (meshrasterizer_13 != null) {
					if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < this.aMeshRasterizerArray10372.length + 1) {
						this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -107);
					}

					class285_10 = Class470.method7824(this.method16162(425151398), (byte) -117);
					this.aBool10312 = true;
					graphicalrenderer_1.RA(false);
					meshrasterizer_13.method11282(matrix44var_5, this.boundingBoxPolygons[this.aMeshRasterizerArray10372.length], 0);
					graphicalrenderer_1.RA(true);
				}
			}

			if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -9);
			}

			if (class285_10 == null) {
				class285_10 = Class470.method7824(this.method16162(1979469596), (byte) -108);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_5, false, (byte) -6);

			int i_15;
			for (i_15 = 0; i_15 < this.aMeshRasterizerArray10372.length; i_15++) {
				if (this.aMeshRasterizerArray10372[i_15] != null) {
					if (this.definitions.aBool4920) {
						this.aMeshRasterizerArray10372[i_15].PA(this.anInt10587, this.anInt10588, this.anInt10589, this.anInt10590);
					}

					this.aMeshRasterizerArray10372[i_15].method11282(matrix44var_5, this.boundingBoxPolygons[i_15], 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_16 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_16);
			}

			for (i_15 = 0; i_15 < this.aMeshRasterizerArray10372.length; i_15++) {
				if (this.aMeshRasterizerArray10372[i_15] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_15].i();
				}

				this.aMeshRasterizerArray10372[i_15] = null;
			}

			this.anInt10349 = client.anInt7286;
			return class285_10;
		} else {
			return null;
		}
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		if (this.definitions != null && this.method16158(graphicalrenderer_1, 526336, (byte) -14)) {
			Matrix44Var matrix44var_2 = this.method11168();
			Position class305_3 = this.method11166();
			Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
			int i_5 = this.aClass19_10359.method578();
			Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_3.coords.x >> 9][(int) class305_3.coords.z >> 9];
			if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
				int i_7 = this.anInt10325 * -374848179 * -2023195771 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = -374848179 * (int) ((float) (-2023195771 * this.anInt10325 * -374848179) - (float) i_7 / 10.0F) * -2023195771;
			} else {
				this.anInt10325 = -374848179 * (int) ((float) (this.anInt10325 * -374848179 * -2023195771) - (float) (-2023195771 * this.anInt10325 * -374848179) / 10.0F) * -2023195771;
			}

			matrix44var_4.method5209(matrix44var_2);
			matrix44var_4.method5219(0.0F, (float) (-20 - this.anInt10325 * -374848179 * -2023195771), 0.0F);
			BASDefinitions renderanimdefs_13 = this.getRenderAnimDefs();
			NPCDefinitions npcdefinitions_8 = this.definitions.transformTo != null ? this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER) : this.definitions;
			this.aBool10312 = false;
			Class285 class285_9 = null;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -85) == 1 && npcdefinitions_8.aBool4912 && renderanimdefs_13.aBool2787) {
				Animation animation_10 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(-1093777602) ? this.currentAnimation : null;
				MovingAnimation class456_sub3_11 = !this.aAnimation_Sub3_10337.hasDefs() || this.aAnimation_Sub3_10337.aBool7891 && animation_10 != null ? null : this.aAnimation_Sub3_10337;
				MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, i_5, this.anInt10322 * 2085530051 * -35614997, -1768311789 * this.anInt10323 * 884618779, -628205413 * this.anInt10363 * -1453470317, 1203434505 * this.definitions.size * -1156523463, this.aMeshRasterizerArray10372[0], this.definitions.aShort4874 & 0xffff, this.definitions.aShort4897 & 0xffff, this.definitions.aByte4883 & 0xff, this.definitions.aByte4899 & 0xff, (Animation) (class456_sub3_11 != null ? class456_sub3_11 : animation_10));
				if (meshrasterizer_12 != null) {
					if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < 1 + this.aMeshRasterizerArray10372.length) {
						this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -114);
					}

					class285_9 = Class470.method7824(this.method16162(673687659), (byte) -118);
					this.aBool10312 = true;
					graphicalrenderer_1.RA(false);
					meshrasterizer_12.method11282(matrix44var_4, this.boundingBoxPolygons[this.aMeshRasterizerArray10372.length], 0);
					graphicalrenderer_1.RA(true);
				}
			}

			if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -3);
			}

			if (class285_9 == null) {
				class285_9 = Class470.method7824(this.method16162(1870859445), (byte) -84);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_4, false, (byte) -22);

			int i_14;
			for (i_14 = 0; i_14 < this.aMeshRasterizerArray10372.length; i_14++) {
				if (this.aMeshRasterizerArray10372[i_14] != null) {
					if (this.definitions.aBool4920) {
						this.aMeshRasterizerArray10372[i_14].PA(this.anInt10587 * 1113755543 * 812179495, 954646983 * this.anInt10588 * -1431655765 * 3 * -1912819721, 37639707 * this.anInt10589 * -62352365, 478845591 * this.anInt10590 * -331447001);
					}

					this.aMeshRasterizerArray10372[i_14].method11282(matrix44var_4, this.boundingBoxPolygons[i_14], 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_15 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_15);
			}

			for (i_14 = 0; i_14 < this.aMeshRasterizerArray10372.length; i_14++) {
				if (this.aMeshRasterizerArray10372[i_14] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_14].i();
				}

				this.aMeshRasterizerArray10372[i_14] = null;
			}

			this.anInt10349 = client.anInt7286 * 1895928101 * 1178121955 * -2009373393;
			return class285_9;
		} else {
			return null;
		}
	}

	public int method15897() {
		if (this.definitions.transformTo != null) {
			NPCDefinitions npcdefinitions_1 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_1 != null && 327817917 * npcdefinitions_1.anInt4918 * 1094135957 != -1) {
				return npcdefinitions_1.anInt4918 * 1094135957 * 327817917;
			}
		}

		return 327817917 * this.definitions.anInt4918 * 1094135957;
	}

	public boolean method15887() {
		return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
	}

	public Class163 method15811(int i_1) {
		return this.aClass163_10334 != null && this.aClass163_10334.aString2028 == null ? null : this.aClass163_10334;
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	public void setDefinition(NPCDefinitions npcdefinitions_1) {
		if (npcdefinitions_1 != this.definitions && Class20.aBool161 && EnumIndexLoader.method7426(this.index, (byte) -83)) {
			Class316.method5594();
		}

		this.definitions = npcdefinitions_1;
		if (this.definitions != null) {
			this.modifiedName = this.definitions.name;
			this.anInt10582 = this.definitions.combatLevel;
		}

		if (this.aClass539_10369 != null) {
			this.aClass539_10369.method11505();
		}

	}

	int method15868() {
		if (-343399559 * this.anInt10575 * -1914841399 != -1) {
			return this.anInt10575 * -1914841399 * -343399559;
		} else {
			if (this.definitions.transformTo != null) {
				NPCDefinitions npcdefinitions_1 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
				if (npcdefinitions_1 != null && npcdefinitions_1.renderEmote * -318852007 * -490908695 != -1) {
					return -490908695 * npcdefinitions_1.renderEmote * -318852007;
				}
			}

			return this.definitions.renderEmote * -318852007 * -490908695;
		}
	}

	final boolean method13011() {
		return false;
	}

	public boolean method15872() {
		return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
	}

	public boolean method15873() {
		return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
	}

	public boolean method15814() {
		return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
	}

	public Class163 method15809() {
		return this.aClass163_10334 != null && this.aClass163_10334.aString2028 == null ? null : this.aClass163_10334;
	}

	public Class163 method15876() {
		return this.aClass163_10334 != null && this.aClass163_10334.aString2028 == null ? null : this.aClass163_10334;
	}

	public Class163 method15877() {
		return this.aClass163_10334 != null && this.aClass163_10334.aString2028 == null ? null : this.aClass163_10334;
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	int method15867() {
		if (-343399559 * this.anInt10575 * -1914841399 != -1) {
			return this.anInt10575 * -1914841399 * -343399559;
		} else {
			if (this.definitions.transformTo != null) {
				NPCDefinitions npcdefinitions_1 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
				if (npcdefinitions_1 != null && npcdefinitions_1.renderEmote * -318852007 * -490908695 != -1) {
					return -490908695 * npcdefinitions_1.renderEmote * -318852007;
				}
			}

			return this.definitions.renderEmote * -318852007 * -490908695;
		}
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.definitions != null && this.method16158(graphicalrenderer_1, 131072, (byte) -19)) {
			Matrix44Var matrix44var_4 = this.method11168();
			boolean bool_5 = false;

			int i_6;
			for (i_6 = 0; i_6 < this.aMeshRasterizerArray10372.length; i_6++) {
				if (this.aMeshRasterizerArray10372[i_6] != null) {
					boolean bool_7;
					label57: {
						if (-1894935519 * this.definitions.anInt4913 * 1057419233 <= 0) {
							label56: {
								if (1419481733 * this.definitions.anInt4917 * -832596403 == -1) {
									if (this.definitions.size * -1156523463 * 1203434505 == 1) {
										break label56;
									}
								} else if (this.definitions.anInt4917 * -832596403 * 1419481733 == 1) {
									break label56;
								}

								bool_7 = false;
								break label57;
							}
						}

						bool_7 = true;
					}

					boolean bool_9 = this.aMeshRasterizerArray10372[i_6].method11270(i_2, i_3, matrix44var_4, bool_7, this.definitions.anInt4913 * 1057419233 * -1894935519);
					if (bool_9) {
						bool_5 = true;
						break;
					}
				}
			}

			for (i_6 = 0; i_6 < this.aMeshRasterizerArray10372.length; i_6++) {
				this.aMeshRasterizerArray10372[i_6] = null;
			}

			return bool_5;
		} else {
			return false;
		}
	}

	public int method16169(int i_1) {
		return this.anIntArray10586[i_1];
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public int method15804() {
		if (this.definitions.transformTo != null) {
			NPCDefinitions npcdefinitions_1 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_1 != null && 327817917 * npcdefinitions_1.anInt4918 * 1094135957 != -1) {
				return npcdefinitions_1.anInt4918 * 1094135957 * 327817917;
			}
		}

		return 327817917 * this.definitions.anInt4918 * 1094135957;
	}

	public int method15874() {
		return 1 + this.index * -1498872675 * -1691508299;
	}

	public int method15892() {
		return 1 + this.index * -1498872675 * -1691508299;
	}

	final boolean method13026() {
		return false;
	}

	public void method16179(int i_1, int i_2, int i_3) {
		this.anIntArray10585[i_1] = i_2;
		this.anIntArray10586[i_1] = i_3;
	}

	public int method15899(int i_1) {
		if (this.definitions.transformTo != null) {
			NPCDefinitions npcdefinitions_2 = this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_2 != null && npcdefinitions_2.anInt4918 != -1) {
				return npcdefinitions_2.anInt4918;
			}
		}

		return this.definitions.anInt4918;
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		if (this.definitions != null && (this.aBool10370 || this.method16158(graphicalrenderer_1, 0, (byte) 29))) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5209(this.method11168());
			matrix44var_2.method5219(0.0F, -5.0F, 0.0F);
			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, this.aBool10370, (byte) 87);

			for (int i_3 = 0; i_3 < this.aMeshRasterizerArray10372.length; i_3++) {
				this.aMeshRasterizerArray10372[i_3] = null;
			}
		}

	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		if (this.definitions != null && this.method16158(graphicalrenderer_1, 526336, (byte) 37)) {
			Matrix44Var matrix44var_2 = this.method11168();
			Position class305_3 = this.method11166();
			Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
			int i_5 = this.aClass19_10359.method578();
			Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_3.coords.x >> 9][(int) class305_3.coords.z >> 9];
			if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
				int i_7 = this.anInt10325 * -374848179 * -2023195771 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = -374848179 * (int) ((float) (-2023195771 * this.anInt10325 * -374848179) - (float) i_7 / 10.0F) * -2023195771;
			} else {
				this.anInt10325 = -374848179 * (int) ((float) (this.anInt10325 * -374848179 * -2023195771) - (float) (-2023195771 * this.anInt10325 * -374848179) / 10.0F) * -2023195771;
			}

			matrix44var_4.method5209(matrix44var_2);
			matrix44var_4.method5219(0.0F, (float) (-20 - this.anInt10325 * -374848179 * -2023195771), 0.0F);
			BASDefinitions renderanimdefs_13 = this.getRenderAnimDefs();
			NPCDefinitions npcdefinitions_8 = this.definitions.transformTo != null ? this.definitions.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER) : this.definitions;
			this.aBool10312 = false;
			Class285 class285_9 = null;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -99) == 1 && npcdefinitions_8.aBool4912 && renderanimdefs_13.aBool2787) {
				Animation animation_10 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(2108774285) ? this.currentAnimation : null;
				MovingAnimation class456_sub3_11 = !this.aAnimation_Sub3_10337.hasDefs() || this.aAnimation_Sub3_10337.aBool7891 && animation_10 != null ? null : this.aAnimation_Sub3_10337;
				MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, i_5, this.anInt10322 * 2085530051 * -35614997, -1768311789 * this.anInt10323 * 884618779, -628205413 * this.anInt10363 * -1453470317, 1203434505 * this.definitions.size * -1156523463, this.aMeshRasterizerArray10372[0], this.definitions.aShort4874 & 0xffff, this.definitions.aShort4897 & 0xffff, this.definitions.aByte4883 & 0xff, this.definitions.aByte4899 & 0xff, (Animation) (class456_sub3_11 != null ? class456_sub3_11 : animation_10));
				if (meshrasterizer_12 != null) {
					if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < 1 + this.aMeshRasterizerArray10372.length) {
						this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -124);
					}

					class285_9 = Class470.method7824(this.method16162(1927143783), (byte) -100);
					this.aBool10312 = true;
					graphicalrenderer_1.RA(false);
					meshrasterizer_12.method11282(matrix44var_4, this.boundingBoxPolygons[this.aMeshRasterizerArray10372.length], 0);
					graphicalrenderer_1.RA(true);
				}
			}

			if (this.boundingBoxPolygons == null || this.boundingBoxPolygons.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -10);
			}

			if (class285_9 == null) {
				class285_9 = Class470.method7824(this.method16162(574364280), (byte) -55);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_4, false, (byte) -36);

			int i_14;
			for (i_14 = 0; i_14 < this.aMeshRasterizerArray10372.length; i_14++) {
				if (this.aMeshRasterizerArray10372[i_14] != null) {
					if (this.definitions.aBool4920) {
						this.aMeshRasterizerArray10372[i_14].PA(this.anInt10587 * 1113755543 * 812179495, 954646983 * this.anInt10588 * -1431655765 * 3 * -1912819721, 37639707 * this.anInt10589 * -62352365, 478845591 * this.anInt10590 * -331447001);
					}

					this.aMeshRasterizerArray10372[i_14].method11282(matrix44var_4, this.boundingBoxPolygons[i_14], 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_15 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_15);
			}

			for (i_14 = 0; i_14 < this.aMeshRasterizerArray10372.length; i_14++) {
				if (this.aMeshRasterizerArray10372[i_14] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_14].i();
				}

				this.aMeshRasterizerArray10372[i_14] = null;
			}

			this.anInt10349 = client.anInt7286 * 1895928101 * 1178121955 * -2009373393;
			return class285_9;
		} else {
			return null;
		}
	}

	public int method15806() {
		return 1 + this.index * -1498872675 * -1691508299;
	}
}
