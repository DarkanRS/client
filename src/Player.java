public class Player extends Animable {

	public int anInt10569;
	public int anInt10570;
	public byte male = 0;
	public int skullId = -1;
	public int headIconId = -1;
	public int combatLevel = 0;
	public int cbLevelWithSumm = 0;
	public int cbLevelRelated = -1;
	public int elo = 0;
	public int faceDirection = -1;
	public boolean aBool10573 = false;
	public int teamId = 0;
	public int walkingAnimation = -1;
	public int rotate180Animation = -1;
	public int rotate90RightAnimation = -1;
	public int rotate90LeftAnimation = -1;
	public boolean isTransformedNPC = false;
	public int isNpc = 0;
	public int specialByte = 255;
	public boolean aBool10568 = false;
	public boolean aBool10571 = false;
	public boolean hidden = false;
	public boolean aBool10550 = false;
	public Class155 aClass155_10561 = new Class155();
	String prefixTitle;
	String postfixTitle;
	int renderEmote;
	public String username;
	public String displayName;
	public PlayerAppearance playerAppearance;

	final void method13021() {
		throw new IllegalStateException();
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		if (this.playerAppearance != null && this.method16133(graphicalrenderer_1, 2048)) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = this.aClass19_10359.method578();
			Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.aClass385_3595.x >> 9][(int) class305_4.aClass385_3595.z >> 9];
			if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
				int i_7 = -2023195771 * this.anInt10325 * -374848179 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = (int) ((float) (this.anInt10325 * -374848179 * -2023195771) - (float) i_7 / 10.0F) * -374848179 * -2023195771;
			} else {
				this.anInt10325 = -374848179 * (int) ((float) (-2023195771 * this.anInt10325 * -374848179) - (float) (this.anInt10325 * -374848179 * -2023195771) / 10.0F) * -2023195771;
			}

			matrix44var_2.method5209(matrix44var_3);
			matrix44var_2.method5219(0.0F, (float) (-20 - -2023195771 * this.anInt10325 * -374848179), 0.0F);
			Class285 class285_17 = null;
			this.aBool10312 = false;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -110) == 1) {
				BASDefinitions renderanimdefs_8 = this.getRenderAnimDefs();
				if (renderanimdefs_8.aBool2787 && (-977770149 * this.playerAppearance.anInt2928 * 232890067 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.playerAppearance.anInt2928 * 232890067 * -977770149).aBool4912)) {
					Animation animation_9 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(-563768008) ? this.currentAnimation : null;
					MovingAnimation class456_sub3_10 = this.aAnimation_Sub3_10337.hasDefs() && (!this.aAnimation_Sub3_10337.aBool7891 || animation_9 == null) ? this.aAnimation_Sub3_10337 : null;
					MeshRasterizer meshrasterizer_11 = Class116.method1969(graphicalrenderer_1, i_5, -35614997 * this.anInt10322 * 2085530051, this.anInt10323 * 884618779 * -1768311789, -628205413 * this.anInt10363 * -1453470317, 1, this.aMeshRasterizerArray10372[0], 0, 0, 160, 240, (Animation) (class456_sub3_10 != null ? class456_sub3_10 : animation_9));
					if (meshrasterizer_11 != null) {
						if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < 1 + this.aMeshRasterizerArray10372.length) {
							this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -124);
						}

						class285_17 = Class470.method7824(true, (byte) -56);
						this.aBool10312 = true;
						graphicalrenderer_1.RA(false);
						meshrasterizer_11.method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[this.aMeshRasterizerArray10372.length], 0);
						graphicalrenderer_1.RA(true);
					}
				}
			}

			int i_18;
			if (this == VertexNormal.myPlayer) {
				for (i_18 = client.aClass180Array7348.length - 1; i_18 >= 0; --i_18) {
					Class180 class180_25 = client.aClass180Array7348[i_18];
					if (class180_25 != null && 1869984395 * class180_25.anInt2242 * -669014749 != -1) {
						int i_13;
						if (-379447335 * class180_25.anInt2236 * -860161943 == 1) {
							StringNode class282_sub47_26 = (StringNode) client.NPCS.get((long) (1505135749 * class180_25.anInt2238 * -1443656627));
							if (class282_sub47_26 != null) {
								NPC npc_29 = (NPC) class282_sub47_26.anObject8068;
								Vector3 vector3_12 = Vector3.method6632(npc_29.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								i_13 = (int) vector3_12.x;
								int i_14 = (int) vector3_12.z;
								this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], (long) i_13, (long) i_14, 1869984395 * class180_25.anInt2242 * -669014749, 92160000L);
							}
						}

						if (class180_25.anInt2236 * -860161943 * -379447335 == 2) {
							Vector3 vector3_27 = VertexNormal.myPlayer.method11166().aClass385_3595;
							long long_19 = (long) (class180_25.anInt2243 * -1582343557 * -51612493 - (int) vector3_27.x);
							long long_21 = (long) (class180_25.anInt2235 * -1351216313 * -1074026889 - (int) vector3_27.z);
							long long_15 = (long) (1116475963 * class180_25.anInt2237 * 1144190707 << 9);
							long_15 *= long_15;
							this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], long_19, long_21, class180_25.anInt2242 * -669014749 * 1869984395, long_15);
						}

						if (-379447335 * class180_25.anInt2236 * -860161943 == 10 && 1505135749 * class180_25.anInt2238 * -1443656627 >= 0 && 1505135749 * class180_25.anInt2238 * -1443656627 < client.players.length) {
							Player player_28 = client.players[1505135749 * class180_25.anInt2238 * -1443656627];
							if (player_28 != null) {
								Vector3 vector3_30 = Vector3.method6632(player_28.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								int i_23 = (int) vector3_30.x;
								i_13 = (int) vector3_30.z;
								this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], (long) i_23, (long) i_13, class180_25.anInt2242 * -669014749 * 1869984395, 92160000L);
							}
						}
					}
				}
			}

			matrix44var_2.method5209(matrix44var_3);
			matrix44var_2.method5219(0.0F, (float) (-5 - -2023195771 * this.anInt10325 * -374848179), 0.0F);
			if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -87);
			}

			if (class285_17 == null) {
				class285_17 = Class470.method7824(true, (byte) -33);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, false, (byte) 79);

			for (i_18 = 0; i_18 < this.aMeshRasterizerArray10372.length; i_18++) {
				if (this.aMeshRasterizerArray10372[i_18] != null) {
					this.aMeshRasterizerArray10372[i_18].method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[i_18], this == VertexNormal.myPlayer ? 1 : 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_24 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_24);
			}

			for (i_18 = 0; i_18 < this.aMeshRasterizerArray10372.length; i_18++) {
				if (this.aMeshRasterizerArray10372[i_18] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_18].i();
				}

				this.aMeshRasterizerArray10372[i_18] = null;
			}

			this.anInt10349 = 1178121955 * client.anInt7286 * 1895928101 * -2009373393;
			return class285_17;
		} else {
			return null;
		}
	}

	final boolean method13011() {
		return false;
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return null;
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.playerAppearance != null && (this.aBool10370 || this.method16133(graphicalrenderer_1, 0))) {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			matrix44var_3.method5210(this.method11166());
			matrix44var_3.method5219(0.0F, -5.0F, 0.0F);
			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_3, this.aBool10370, (byte) -50);

			for (int i_4 = 0; i_4 < this.aMeshRasterizerArray10372.length; i_4++) {
				this.aMeshRasterizerArray10372[i_4] = null;
			}
		}

	}

	public final boolean hasAppearance(byte b_1) {
		return this.playerAppearance != null;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		if (this.playerAppearance != null && (this.aBool10370 || this.method16133(graphicalrenderer_1, 0))) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5210(this.method11166());
			matrix44var_2.method5219(0.0F, -5.0F, 0.0F);
			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, this.aBool10370, (byte) -26);

			for (int i_3 = 0; i_3 < this.aMeshRasterizerArray10372.length; i_3++) {
				this.aMeshRasterizerArray10372[i_3] = null;
			}
		}

	}

	public String getUsernameWithTitle() {
		String str_3 = "";
		if (this.prefixTitle != null) {
			str_3 = this.prefixTitle;
		}

		str_3 = str_3 + this.username;
		if (this.postfixTitle != null) {
			str_3 = str_3 + this.postfixTitle;
		}

		return str_3;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public final void method16129(int i_1, int i_2, byte b_3, int i_4) {
		if (this.currentAnimation.hasDefs() && this.currentAnimation.getDefs().walkingPrecedence == 1) {
			this.currentAnimations = null;
			this.currentAnimation.update(-1);
		}

		for (int i_5 = 0; i_5 < this.aClass161Array10339.length; i_5++) {
			if (this.aClass161Array10339[i_5].spotAnimId != -1) {
				SpotAnimDefinitions spotanimdefinitions_6 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.aClass161Array10339[i_5].spotAnimId, (byte) 55);
				if (spotanimdefinitions_6.aBool6968 && spotanimdefinitions_6.animationId != -1 && IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_6.animationId, (byte) -26).walkingPrecedence == 1) {
					this.aClass161Array10339[i_5].animation.update(-1);
					this.aClass161Array10339[i_5].spotAnimId = -1;
				}
			}
		}

		this.faceDirection = -1;
		if (i_1 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_2 >= 0 && i_2 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			if (this.regionBaseX[0] >= 0 && this.regionBaseX[0] < IndexLoaders.MAP_REGION_DECODER.getSizeX() && this.regionBaseY[0] >= 0 && this.regionBaseY[0] < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				if (b_3 == MovementType.RUNNING.id) {
					Class512.method8762(this, i_1, i_2, MovementType.RUNNING.id);
				}

				this.method16132(i_1, i_2, b_3);
			} else {
				this.move(i_1, i_2);
			}
		} else {
			this.move(i_1, i_2);
		}

	}

	public void move(int i_1, int i_2) {
		this.anInt10355 = 0;
		this.anInt10367 = 0;
		this.anInt10366 = 0;
		this.regionBaseX[0] = i_1;
		this.regionBaseY[0] = i_2;
		int i_4 = this.getSize();
		Vector3 vector3_5 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		vector3_5.x = (float) (i_4 * 256 + this.regionBaseX[0] * 512);
		vector3_5.z = (float) (this.regionBaseY[0] * 512 + i_4 * 256);
		this.method11171(vector3_5);
		vector3_5.pushVectorStack();
		if (this == VertexNormal.myPlayer) {
			IndexLoaders.MAP_REGION_DECODER.method4435().method4048(-402586639);
		}

		if (this.aClass539_10369 != null) {
			this.aClass539_10369.method11505();
		}

	}

	public boolean method15887() {
		return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
	}

	public int getSize() {
		return this.playerAppearance != null && this.playerAppearance.anInt2928 != -1 ? IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.playerAppearance.anInt2928).size : super.getSize();
	}

	int getRenderAnimation() {
		return this.renderEmote;
	}

	public int method15899(int i_1) {
		return -1;
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.playerAppearance != null && this.method16133(graphicalrenderer_1, 131072)) {
			Matrix44Var matrix44var_5 = this.method11168();
			boolean bool_6 = false;

			int i_7;
			for (i_7 = 0; i_7 < this.aMeshRasterizerArray10372.length; i_7++) {
				if (this.aMeshRasterizerArray10372[i_7] != null && this.aMeshRasterizerArray10372[i_7].method11270(i_2, i_3, matrix44var_5, true, 0)) {
					bool_6 = true;
					break;
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

	public Player(SceneObjectManager sceneobjectmanager_1) {
		super(sceneobjectmanager_1);
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	public final void method16132(int i_1, int i_2, byte b_3) {
		if (this.anInt10355 < this.regionBaseX.length - 1) {
			++this.anInt10355;
		}

		for (int i_5 = this.anInt10355; i_5 > 0; --i_5) {
			this.regionBaseX[i_5] = this.regionBaseX[i_5 - 1];
			this.regionBaseY[i_5] = this.regionBaseY[i_5 - 1];
			this.walkTypes[i_5] = this.walkTypes[i_5 - 1];
		}

		this.regionBaseX[0] = i_1;
		this.regionBaseY[0] = i_2;
		this.walkTypes[0] = b_3;
	}

	boolean method16133(GraphicalRenderer graphicalrenderer_1, int i_2) {
		int i_4 = i_2;
		BASDefinitions renderanimdefs_5 = this.getRenderAnimDefs();
		Animation animation_6 = this.currentAnimation.hasDefs() && !this.currentAnimation.hasSpeed(-509247548) ? this.currentAnimation : null;
		MovingAnimation class456_sub3_7 = !this.aAnimation_Sub3_10337.hasDefs() || this.aBool10573 || this.aAnimation_Sub3_10337.aBool7891 && animation_6 != null ? null : this.aAnimation_Sub3_10337;
		int i_8 = renderanimdefs_5.anInt2786;
		int i_9 = renderanimdefs_5.anInt2829;
		if (i_8 != 0 || i_9 != 0 || renderanimdefs_5.anInt2824 != 0 || renderanimdefs_5.anInt2827 != 0) {
			i_2 |= 0x7;
		}

		int i_10 = this.aClass19_10359.method578();
		boolean bool_11 = this.aByte10352 != 0 && client.cycles >= this.anInt10347 && client.cycles < this.anInt10348;
		if (bool_11) {
			i_2 |= 0x80000;
		}

		MeshRasterizer meshrasterizer_12 = this.aMeshRasterizerArray10372[0] = this.playerAppearance.method3998(graphicalrenderer_1, i_2, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, animation_6, class456_sub3_7, this.aAnimation_Sub2_Sub1Array10354, this.anIntArray10362, i_10, LinkedNodeList.EQUIPMENT_DEFAULTS, (short) -9437);
		int i_13 = Class46.method932();
		if (Engine.MAX_MEMORY < 96 && i_13 > 50) {
			JS5CacheFile.method3359();
		}

		if (ServerEnvironment.aClass496_5813 != HDWaterTile.aClass496_952 && i_13 < 50) {
			int i_14;
			for (i_14 = 50 - i_13; i_14 > client.anInt7173; client.anInt7173++) {
				Class339.aByteArrayArray3986[client.anInt7173] = new byte[102400];
			}

			while (i_14 < client.anInt7173) {
				--client.anInt7173;
				Class339.aByteArrayArray3986[client.anInt7173] = null;
			}
		} else if (ServerEnvironment.aClass496_5813 != HDWaterTile.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
			client.anInt7173 = 0;
		}

		if (meshrasterizer_12 == null) {
			return false;
		} else {
			this.anInt10317 = meshrasterizer_12.YA();
			meshrasterizer_12.n();
			this.method15819(meshrasterizer_12);
			if (i_8 == 0 && i_9 == 0) {
				this.method15895(i_10, this.getSize() << 9, this.getSize() << 9, 0, 0);
			} else {
				this.method15895(i_10, i_8, i_9, renderanimdefs_5.anInt2813, renderanimdefs_5.anInt2790);
				if (this.anInt10322 != 0) {
					meshrasterizer_12.t(this.anInt10322);
				}

				if (this.anInt10323 != 0) {
					meshrasterizer_12.EA(this.anInt10323);
				}

				if (this.anInt10363 != 0) {
					meshrasterizer_12.ia(0, this.anInt10363, 0);
				}
			}

			if (bool_11) {
				meshrasterizer_12.PA(this.aByte10371, this.aByte10327, this.aByte10364, this.aByte10352 & 0xff);
			}

			if (!this.aBool10573) {
				this.method15837(graphicalrenderer_1, renderanimdefs_5, i_4, i_8, i_9, i_10);
			}

			return true;
		}
	}

	public void sendChat(String string_1, int i_2, int i_3) {
		this.method15875(string_1, i_2, i_3, Class204.method3363(592406309) * QuickchatFiller.ENTITY_DEFAULTS.playerMessageDuration, 1858323003);
	}

	public int method15794() {
		return -this.index - 1;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		if (this.playerAppearance != null && this.method16133(graphicalrenderer_1, 2048)) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = this.aClass19_10359.method578();
			Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.aClass385_3595.x >> 9][(int) class305_4.aClass385_3595.z >> 9];
			if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
				int i_7 = -2023195771 * this.anInt10325 * -374848179 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = (int) ((float) (this.anInt10325 * -374848179 * -2023195771) - (float) i_7 / 10.0F) * -374848179 * -2023195771;
			} else {
				this.anInt10325 = -374848179 * (int) ((float) (-2023195771 * this.anInt10325 * -374848179) - (float) (this.anInt10325 * -374848179 * -2023195771) / 10.0F) * -2023195771;
			}

			matrix44var_2.method5209(matrix44var_3);
			matrix44var_2.method5219(0.0F, (float) (-20 - -2023195771 * this.anInt10325 * -374848179), 0.0F);
			Class285 class285_17 = null;
			this.aBool10312 = false;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -42) == 1) {
				BASDefinitions renderanimdefs_8 = this.getRenderAnimDefs();
				if (renderanimdefs_8.aBool2787 && (-977770149 * this.playerAppearance.anInt2928 * 232890067 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.playerAppearance.anInt2928 * 232890067 * -977770149).aBool4912)) {
					Animation animation_9 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(-305064415) ? this.currentAnimation : null;
					MovingAnimation class456_sub3_10 = this.aAnimation_Sub3_10337.hasDefs() && (!this.aAnimation_Sub3_10337.aBool7891 || animation_9 == null) ? this.aAnimation_Sub3_10337 : null;
					MeshRasterizer meshrasterizer_11 = Class116.method1969(graphicalrenderer_1, i_5, -35614997 * this.anInt10322 * 2085530051, this.anInt10323 * 884618779 * -1768311789, -628205413 * this.anInt10363 * -1453470317, 1, this.aMeshRasterizerArray10372[0], 0, 0, 160, 240, (Animation) (class456_sub3_10 != null ? class456_sub3_10 : animation_9));
					if (meshrasterizer_11 != null) {
						if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < 1 + this.aMeshRasterizerArray10372.length) {
							this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -105);
						}

						class285_17 = Class470.method7824(true, (byte) -34);
						this.aBool10312 = true;
						graphicalrenderer_1.RA(false);
						meshrasterizer_11.method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[this.aMeshRasterizerArray10372.length], 0);
						graphicalrenderer_1.RA(true);
					}
				}
			}

			int i_18;
			if (this == VertexNormal.myPlayer) {
				for (i_18 = client.aClass180Array7348.length - 1; i_18 >= 0; --i_18) {
					Class180 class180_25 = client.aClass180Array7348[i_18];
					if (class180_25 != null && 1869984395 * class180_25.anInt2242 * -669014749 != -1) {
						int i_13;
						if (-379447335 * class180_25.anInt2236 * -860161943 == 1) {
							StringNode class282_sub47_26 = (StringNode) client.NPCS.get((long) (1505135749 * class180_25.anInt2238 * -1443656627));
							if (class282_sub47_26 != null) {
								NPC npc_29 = (NPC) class282_sub47_26.anObject8068;
								Vector3 vector3_12 = Vector3.method6632(npc_29.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								i_13 = (int) vector3_12.x;
								int i_14 = (int) vector3_12.z;
								this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], (long) i_13, (long) i_14, 1869984395 * class180_25.anInt2242 * -669014749, 92160000L);
							}
						}

						if (class180_25.anInt2236 * -860161943 * -379447335 == 2) {
							Vector3 vector3_27 = VertexNormal.myPlayer.method11166().aClass385_3595;
							long long_19 = (long) (class180_25.anInt2243 * -1582343557 * -51612493 - (int) vector3_27.x);
							long long_21 = (long) (class180_25.anInt2235 * -1351216313 * -1074026889 - (int) vector3_27.z);
							long long_15 = (long) (1116475963 * class180_25.anInt2237 * 1144190707 << 9);
							long_15 *= long_15;
							this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], long_19, long_21, class180_25.anInt2242 * -669014749 * 1869984395, long_15);
						}

						if (-379447335 * class180_25.anInt2236 * -860161943 == 10 && 1505135749 * class180_25.anInt2238 * -1443656627 >= 0 && 1505135749 * class180_25.anInt2238 * -1443656627 < client.players.length) {
							Player player_28 = client.players[1505135749 * class180_25.anInt2238 * -1443656627];
							if (player_28 != null) {
								Vector3 vector3_30 = Vector3.method6632(player_28.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								int i_23 = (int) vector3_30.x;
								i_13 = (int) vector3_30.z;
								this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], (long) i_23, (long) i_13, class180_25.anInt2242 * -669014749 * 1869984395, 92160000L);
							}
						}
					}
				}
			}

			matrix44var_2.method5209(matrix44var_3);
			matrix44var_2.method5219(0.0F, (float) (-5 - -2023195771 * this.anInt10325 * -374848179), 0.0F);
			if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -105);
			}

			if (class285_17 == null) {
				class285_17 = Class470.method7824(true, (byte) -44);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, false, (byte) -1);

			for (i_18 = 0; i_18 < this.aMeshRasterizerArray10372.length; i_18++) {
				if (this.aMeshRasterizerArray10372[i_18] != null) {
					this.aMeshRasterizerArray10372[i_18].method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[i_18], this == VertexNormal.myPlayer ? 1 : 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_24 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_24);
			}

			for (i_18 = 0; i_18 < this.aMeshRasterizerArray10372.length; i_18++) {
				if (this.aMeshRasterizerArray10372[i_18] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_18].i();
				}

				this.aMeshRasterizerArray10372[i_18] = null;
			}

			this.anInt10349 = 1178121955 * client.anInt7286 * 1895928101 * -2009373393;
			return class285_17;
		} else {
			return null;
		}
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		if (this.playerAppearance != null && this.method16133(graphicalrenderer_1, 2048)) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = this.aClass19_10359.method578();
			Class293 class293_6 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_4.aClass385_3595.x >> 9][(int) class305_4.aClass385_3595.z >> 9];
			if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
				int i_7 = -2023195771 * this.anInt10325 * -374848179 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = (int) ((float) (this.anInt10325 * -374848179 * -2023195771) - (float) i_7 / 10.0F) * -374848179 * -2023195771;
			} else {
				this.anInt10325 = -374848179 * (int) ((float) (-2023195771 * this.anInt10325 * -374848179) - (float) (this.anInt10325 * -374848179 * -2023195771) / 10.0F) * -2023195771;
			}

			matrix44var_2.method5209(matrix44var_3);
			matrix44var_2.method5219(0.0F, (float) (-20 - -2023195771 * this.anInt10325 * -374848179), 0.0F);
			Class285 class285_17 = null;
			this.aBool10312 = false;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -32) == 1) {
				BASDefinitions renderanimdefs_8 = this.getRenderAnimDefs();
				if (renderanimdefs_8.aBool2787 && (-977770149 * this.playerAppearance.anInt2928 * 232890067 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.playerAppearance.anInt2928 * 232890067 * -977770149).aBool4912)) {
					Animation animation_9 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(871780846) ? this.currentAnimation : null;
					MovingAnimation class456_sub3_10 = this.aAnimation_Sub3_10337.hasDefs() && (!this.aAnimation_Sub3_10337.aBool7891 || animation_9 == null) ? this.aAnimation_Sub3_10337 : null;
					MeshRasterizer meshrasterizer_11 = Class116.method1969(graphicalrenderer_1, i_5, -35614997 * this.anInt10322 * 2085530051, this.anInt10323 * 884618779 * -1768311789, -628205413 * this.anInt10363 * -1453470317, 1, this.aMeshRasterizerArray10372[0], 0, 0, 160, 240, (Animation) (class456_sub3_10 != null ? class456_sub3_10 : animation_9));
					if (meshrasterizer_11 != null) {
						if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < 1 + this.aMeshRasterizerArray10372.length) {
							this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -105);
						}

						class285_17 = Class470.method7824(true, (byte) -125);
						this.aBool10312 = true;
						graphicalrenderer_1.RA(false);
						meshrasterizer_11.method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[this.aMeshRasterizerArray10372.length], 0);
						graphicalrenderer_1.RA(true);
					}
				}
			}

			int i_18;
			if (this == VertexNormal.myPlayer) {
				for (i_18 = client.aClass180Array7348.length - 1; i_18 >= 0; --i_18) {
					Class180 class180_25 = client.aClass180Array7348[i_18];
					if (class180_25 != null && 1869984395 * class180_25.anInt2242 * -669014749 != -1) {
						int i_13;
						if (-379447335 * class180_25.anInt2236 * -860161943 == 1) {
							StringNode class282_sub47_26 = (StringNode) client.NPCS.get((long) (1505135749 * class180_25.anInt2238 * -1443656627));
							if (class282_sub47_26 != null) {
								NPC npc_29 = (NPC) class282_sub47_26.anObject8068;
								Vector3 vector3_12 = Vector3.method6632(npc_29.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								i_13 = (int) vector3_12.x;
								int i_14 = (int) vector3_12.z;
								this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], (long) i_13, (long) i_14, 1869984395 * class180_25.anInt2242 * -669014749, 92160000L);
							}
						}

						if (class180_25.anInt2236 * -860161943 * -379447335 == 2) {
							Vector3 vector3_27 = VertexNormal.myPlayer.method11166().aClass385_3595;
							long long_19 = (long) (class180_25.anInt2243 * -1582343557 * -51612493 - (int) vector3_27.x);
							long long_21 = (long) (class180_25.anInt2235 * -1351216313 * -1074026889 - (int) vector3_27.z);
							long long_15 = (long) (1116475963 * class180_25.anInt2237 * 1144190707 << 9);
							long_15 *= long_15;
							this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], long_19, long_21, class180_25.anInt2242 * -669014749 * 1869984395, long_15);
						}

						if (-379447335 * class180_25.anInt2236 * -860161943 == 10 && 1505135749 * class180_25.anInt2238 * -1443656627 >= 0 && 1505135749 * class180_25.anInt2238 * -1443656627 < client.players.length) {
							Player player_28 = client.players[1505135749 * class180_25.anInt2238 * -1443656627];
							if (player_28 != null) {
								Vector3 vector3_30 = Vector3.method6632(player_28.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								int i_23 = (int) vector3_30.x;
								i_13 = (int) vector3_30.z;
								this.method16136(graphicalrenderer_1, matrix44var_2, this.aMeshRasterizerArray10372[0], (long) i_23, (long) i_13, class180_25.anInt2242 * -669014749 * 1869984395, 92160000L);
							}
						}
					}
				}
			}

			matrix44var_2.method5209(matrix44var_3);
			matrix44var_2.method5219(0.0F, (float) (-5 - -2023195771 * this.anInt10325 * -374848179), 0.0F);
			if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -61);
			}

			if (class285_17 == null) {
				class285_17 = Class470.method7824(true, (byte) -77);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, false, (byte) 1);

			for (i_18 = 0; i_18 < this.aMeshRasterizerArray10372.length; i_18++) {
				if (this.aMeshRasterizerArray10372[i_18] != null) {
					this.aMeshRasterizerArray10372[i_18].method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[i_18], this == VertexNormal.myPlayer ? 1 : 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_24 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_24);
			}

			for (i_18 = 0; i_18 < this.aMeshRasterizerArray10372.length; i_18++) {
				if (this.aMeshRasterizerArray10372[i_18] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_18].i();
				}

				this.aMeshRasterizerArray10372[i_18] = null;
			}

			this.anInt10349 = 1178121955 * client.anInt7286 * 1895928101 * -2009373393;
			return class285_17;
		} else {
			return null;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		if (this.playerAppearance != null && (this.aBool10370 || this.method16133(graphicalrenderer_1, 0))) {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5210(this.method11166());
			matrix44var_2.method5219(0.0F, -5.0F, 0.0F);
			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_2, this.aBool10370, (byte) 12);

			for (int i_3 = 0; i_3 < this.aMeshRasterizerArray10372.length; i_3++) {
				this.aMeshRasterizerArray10372[i_3] = null;
			}
		}

	}

	public boolean method15871() {
		return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
	}

	final boolean method13026() {
		return false;
	}

	public int method15804() {
		return -1;
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	void method16136(GraphicalRenderer graphicalrenderer_1, Matrix44Var matrix44var_2, MeshRasterizer meshrasterizer_3, long long_4, long long_6, int i_8, long long_9) {
		long long_11 = long_4 * long_4 + long_6 * long_6;
		if (long_11 >= 262144L && long_11 <= long_9) {
			int i_13 = (int) (Math.atan2((double) long_4, (double) long_6) * 2607.5945876176133D - (double) this.aClass19_10359.method578()) & 0x3fff;
			MeshRasterizer meshrasterizer_14 = Defaults7Loader.method8752(graphicalrenderer_1, i_13, this.anInt10322, this.anInt10323, this.anInt10363, i_8);
			if (meshrasterizer_14 != null) {
				graphicalrenderer_1.RA(false);
				meshrasterizer_14.method11282(matrix44var_2, (EntityNode_Sub5) null, 0);
				graphicalrenderer_1.RA(true);
			}
		}

	}

	int method15867() {
		return this.renderEmote * -900819287 * 1628597657;
	}

	int method15868() {
		return this.renderEmote * -900819287 * 1628597657;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public boolean method15872() {
		return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
	}

	public boolean method15873() {
		return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
	}

	public boolean method15814() {
		return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
	}

	public Class163 method15809() {
		if (this.aClass163_10334 != null) {
			if (this.aClass163_10334.aString2028 == null) {
				return null;
			}

			if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && MovementType.method4282(this.displayName)) {
				return this.aClass163_10334;
			}
		}

		return null;
	}

	public Class163 method15876() {
		if (this.aClass163_10334 != null) {
			if (this.aClass163_10334.aString2028 == null) {
				return null;
			}

			if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && MovementType.method4282(this.displayName)) {
				return this.aClass163_10334;
			}
		}

		return null;
	}

	public Class163 method15877() {
		if (this.aClass163_10334 != null) {
			if (this.aClass163_10334.aString2028 == null) {
				return null;
			}

			if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && MovementType.method4282(this.displayName)) {
				return this.aClass163_10334;
			}
		}

		return null;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.playerAppearance != null && this.method16133(graphicalrenderer_1, 131072)) {
			Matrix44Var matrix44var_4 = this.method11168();
			boolean bool_5 = false;

			int i_6;
			for (i_6 = 0; i_6 < this.aMeshRasterizerArray10372.length; i_6++) {
				if (this.aMeshRasterizerArray10372[i_6] != null && this.aMeshRasterizerArray10372[i_6].method11270(i_2, i_3, matrix44var_4, true, 0)) {
					bool_5 = true;
					break;
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

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public final void decodeAppearance(RsByteBuffer buffer) {
		buffer.index = 0;
		int flags = buffer.readUnsignedByte();
		this.male = (byte) (flags & 0x1);
		boolean transformedBefore = this.isTransformedNPC;
		this.isTransformedNPC = (flags & 0x2) != 0;
		boolean showElo = (flags & 0x4) != 0;
		int size = super.getSize();
		this.setBoundSize((flags >> 3 & 0x7) + 1);
		boolean titleBefore = (flags & 0x40) != 0;
		boolean titleAfter = (flags & 0x80) != 0;
		Vector3 vecSize = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		vecSize.x += (float) (this.getSize() - size << 8);
		vecSize.z += (float) (this.getSize() - size << 8);
		this.method11171(vecSize);
		vecSize.pushVectorStack();
		if (titleBefore) {
			this.prefixTitle = buffer.readGJString();
		} else {
			this.prefixTitle = null;
		}

		if (titleAfter) {
			this.postfixTitle = buffer.readGJString();
		} else {
			this.postfixTitle = null;
		}

		this.skullId = buffer.readByte();
		this.headIconId = buffer.readByte();
		this.hidden = buffer.readByte() == 1;
		if (ServerEnvironment.aClass496_5813 == HDWaterTile.aClass496_952 && client.rights >= 2) {
			this.hidden = false;
		}

		int i_10 = -1;
		this.teamId = 0;
		int[] bodyAppearances = new int[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
		MeshModifier[] modifiedMeshes = new MeshModifier[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
		ItemDefinitions[] wornItems = new ItemDefinitions[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];

		int i;
		int i_15;
		int i_16;
		int itemId;
		int i_18;
		for (i = 0; i < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i++) {
			if (LinkedNodeList.EQUIPMENT_DEFAULTS.hidden[i] != 1) {
				i_15 = buffer.readUnsignedByte();
				if (i_15 == 0) {
					bodyAppearances[i] = 0;
				} else {
					i_16 = buffer.readUnsignedByte();
					itemId = i_16 + (i_15 << 8);
					if (i == 0 && itemId == 65535) {
						i_10 = buffer.readBigSmart();
						this.teamId = buffer.readUnsignedByte();
						break;
					}

					if (itemId >= 16384) {
						itemId -= 16384;
						bodyAppearances[i] = itemId | 0x40000000;
						wornItems[i] = IndexLoaders.ITEM_LOADER.getItemDefinitions(itemId);
						i_18 = wornItems[i].teamId;
						if (i_18 != 0) {
							this.teamId = i_18;
						}
					} else {
						bodyAppearances[i] = itemId - 256 | ~0x7fffffff;
					}
				}
			}
		}

		if (i_10 == -1) {
			i = buffer.readUnsignedShort();
			i_15 = 0;

			for (i_16 = 0; i_16 < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i_16++) {
				if (LinkedNodeList.EQUIPMENT_DEFAULTS.hidden[i_16] == 0) {
					if ((i & 1 << i_15) != 0) {
						modifiedMeshes[i_16] = Class506.decodeItemEffects(wornItems[i_16], buffer);
					}

					++i_15;
				}
			}
		}

		int[] ints_21 = new int[10];

		for (i_15 = 0; i_15 < 10; i_15++) {
			i_16 = buffer.readUnsignedByte();
			if (Class366.SKIN_COLORS.length < 1 || i_16 < 0 || i_16 >= Class366.SKIN_COLORS[i_15][0].length) {
				i_16 = 0;
			}

			ints_21[i_15] = i_16;
		}

		this.renderEmote = buffer.readUnsignedShort();
		this.username = buffer.readString();
		this.displayName = this.username;
		if (this == VertexNormal.myPlayer) {
			RuntimeException_Sub3.aString10458 = this.username;
		}

		this.combatLevel = buffer.readUnsignedByte();
		if (showElo) {
			this.elo = buffer.readUnsignedShort();
			if (this.elo == 65535) {
				this.elo = -1;
			}

			this.cbLevelWithSumm = this.combatLevel;
			this.cbLevelRelated = -1;
		} else {
			this.elo = 0;
			this.cbLevelWithSumm = buffer.readUnsignedByte();
			this.cbLevelRelated = buffer.readUnsignedByte();
			if (this.cbLevelRelated == 255) {
				this.cbLevelRelated = -1;
			}
		}

		i_15 = this.isNpc;
		this.isNpc = buffer.readUnsignedByte();
		if (this.isNpc != 0) {
			i_16 = this.walkingAnimation;
			itemId = this.rotate180Animation;
			i_18 = this.rotate90RightAnimation;
			int i_19 = this.rotate90LeftAnimation;
			int i_20 = this.specialByte;
			this.walkingAnimation = buffer.readUnsignedShort();
			this.rotate180Animation = buffer.readUnsignedShort();
			this.rotate90RightAnimation = buffer.readUnsignedShort();
			this.rotate90LeftAnimation = buffer.readUnsignedShort();
			this.specialByte = buffer.readUnsignedByte();
			if (transformedBefore != this.isTransformedNPC || i_15 != this.isNpc || i_16 != this.walkingAnimation || itemId != this.rotate180Animation || i_18 != this.rotate90RightAnimation || i_19 != this.rotate90LeftAnimation || i_20 != this.specialByte) {
				IncomingPacket.method6379(this);
			}
		} else {
			Class149_Sub2.method14609(this);
		}

		if (this.playerAppearance == null) {
			this.playerAppearance = new PlayerAppearance();
		}

		i_16 = this.playerAppearance.anInt2928;
		int[] ints_22 = this.playerAppearance.colors;
		this.playerAppearance.method3992(this.getRenderAnimation(), bodyAppearances, modifiedMeshes, ints_21, this.male == 1, i_10);
		if (i_10 != i_16) {
			vecSize = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
			vecSize.x = (float) ((this.regionBaseX[0] << 9) + (this.getSize() << 8));
			vecSize.z = (float) ((this.regionBaseY[0] << 9) + (this.getSize() << 8));
			this.method11171(vecSize);
			vecSize.pushVectorStack();
		}

		if (this.index == client.myPlayerIndex && ints_22 != null) {
			for (i_18 = 0; i_18 < ints_21.length; i_18++) {
				if (ints_21[i_18] != ints_22[i_18]) {
					IndexLoaders.ITEM_LOADER.method7151((byte) -16);
					break;
				}
			}
		}

		if (this.aClass539_10369 != null) {
			this.aClass539_10369.method11505();
		}

		if (this.aAnimation_Sub3_10337.hasDefs() && this.aAnimation_Sub3_10337.aBool7891) {
			BASDefinitions renderanimdefs_23 = this.getRenderAnimDefs();
			if (!renderanimdefs_23.method3810(this.aAnimation_Sub3_10337.method7597())) {
				this.aAnimation_Sub3_10337.update(-1);
				this.aAnimation_Sub3_10337.aBool7891 = false;
			}
		}

	}

	public Class163 method15852() {
		if (this.aClass163_10334 != null) {
			if (this.aClass163_10334.aString2028 == null) {
				return null;
			}

			if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && MovementType.method4282(this.displayName)) {
				return this.aClass163_10334;
			}
		}

		return null;
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public int method15806() {
		return -(this.index * -1498872675 * -1691508299) - 1;
	}

	final boolean method12985(int i_1) {
		return false;
	}

	public int method15898() {
		return -1;
	}

	public int method15897() {
		return -1;
	}

	public int method15892() {
		return -(this.index * -1498872675 * -1691508299) - 1;
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		if (this.playerAppearance != null && this.method16133(graphicalrenderer_1, 2048)) {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			Matrix44Var matrix44var_4 = this.method11168();
			Position class305_5 = this.method11166();
			int i_6 = this.aClass19_10359.method578();
			Class293 class293_7 = this.aClass206_7970.aClass293ArrayArrayArray2604[this.plane][(int) class305_5.aClass385_3595.x >> 9][(int) class305_5.aClass385_3595.z >> 9];
			if (class293_7 != null && class293_7.aTransform_Sub1_Sub3_3499 != null) {
				int i_8 = this.anInt10325 - class293_7.aTransform_Sub1_Sub3_3499.aShort9561;
				this.anInt10325 = (int) ((float) this.anInt10325 - (float) i_8 / 10.0F);
			} else {
				this.anInt10325 = (int) ((float) this.anInt10325 - (float) this.anInt10325 / 10.0F);
			}

			matrix44var_3.method5209(matrix44var_4);
			matrix44var_3.method5219(0.0F, (float) (-20 - this.anInt10325), 0.0F);
			Class285 class285_18 = null;
			this.aBool10312 = false;
			if (Class393.preferences.aPreference_Sub28_8212.method12966((byte) -35) == 1) {
				BASDefinitions renderanimdefs_9 = this.getRenderAnimDefs();
				if (renderanimdefs_9.aBool2787 && (this.playerAppearance.anInt2928 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.playerAppearance.anInt2928).aBool4912)) {
					Animation animation_10 = this.currentAnimation.hasDefs() && this.currentAnimation.hasSpeed(-1045482299) ? this.currentAnimation : null;
					MovingAnimation class456_sub3_11 = this.aAnimation_Sub3_10337.hasDefs() && (!this.aAnimation_Sub3_10337.aBool7891 || animation_10 == null) ? this.aAnimation_Sub3_10337 : null;
					MeshRasterizer meshrasterizer_12 = Class116.method1969(graphicalrenderer_1, i_6, this.anInt10322, this.anInt10323, this.anInt10363, 1, this.aMeshRasterizerArray10372[0], 0, 0, 160, 240, (Animation) (class456_sub3_11 != null ? class456_sub3_11 : animation_10));
					if (meshrasterizer_12 != null) {
						if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < this.aMeshRasterizerArray10372.length + 1) {
							this.method13008(this.aMeshRasterizerArray10372.length + 1, (byte) -9);
						}

						class285_18 = Class470.method7824(true, (byte) -88);
						this.aBool10312 = true;
						graphicalrenderer_1.RA(false);
						meshrasterizer_12.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[this.aMeshRasterizerArray10372.length], 0);
						graphicalrenderer_1.RA(true);
					}
				}
			}

			int i_19;
			if (this == VertexNormal.myPlayer) {
				for (i_19 = client.aClass180Array7348.length - 1; i_19 >= 0; --i_19) {
					Class180 class180_26 = client.aClass180Array7348[i_19];
					if (class180_26 != null && class180_26.anInt2242 != -1) {
						int i_14;
						if (class180_26.anInt2236 == 1) {
							StringNode class282_sub47_27 = (StringNode) client.NPCS.get((long) class180_26.anInt2238);
							if (class282_sub47_27 != null) {
								NPC npc_30 = (NPC) class282_sub47_27.anObject8068;
								Vector3 vector3_13 = Vector3.method6632(npc_30.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								i_14 = (int) vector3_13.x;
								int i_15 = (int) vector3_13.z;
								this.method16136(graphicalrenderer_1, matrix44var_3, this.aMeshRasterizerArray10372[0], (long) i_14, (long) i_15, class180_26.anInt2242, 92160000L);
							}
						}

						if (class180_26.anInt2236 == 2) {
							Vector3 vector3_28 = VertexNormal.myPlayer.method11166().aClass385_3595;
							long long_20 = (long) (class180_26.anInt2243 - (int) vector3_28.x);
							long long_22 = (long) (class180_26.anInt2235 - (int) vector3_28.z);
							long long_16 = (long) (class180_26.anInt2237 << 9);
							long_16 *= long_16;
							this.method16136(graphicalrenderer_1, matrix44var_3, this.aMeshRasterizerArray10372[0], long_20, long_22, class180_26.anInt2242, long_16);
						}

						if (class180_26.anInt2236 == 10 && class180_26.anInt2238 >= 0 && class180_26.anInt2238 < client.players.length) {
							Player player_29 = client.players[class180_26.anInt2238];
							if (player_29 != null) {
								Vector3 vector3_31 = Vector3.method6632(player_29.method11166().aClass385_3595, VertexNormal.myPlayer.method11166().aClass385_3595);
								int i_24 = (int) vector3_31.x;
								i_14 = (int) vector3_31.z;
								this.method16136(graphicalrenderer_1, matrix44var_3, this.aMeshRasterizerArray10372[0], (long) i_24, (long) i_14, class180_26.anInt2242, 92160000L);
							}
						}
					}
				}
			}

			matrix44var_3.method5209(matrix44var_4);
			matrix44var_3.method5219(0.0F, (float) (-5 - this.anInt10325), 0.0F);
			if (this.aEntityNode_Sub5Array7965 == null || this.aEntityNode_Sub5Array7965.length < this.aMeshRasterizerArray10372.length) {
				this.method13008(this.aMeshRasterizerArray10372.length, (byte) -92);
			}

			if (class285_18 == null) {
				class285_18 = Class470.method7824(true, (byte) -43);
			}

			this.method15799(graphicalrenderer_1, this.aMeshRasterizerArray10372, matrix44var_3, false, (byte) -20);

			for (i_19 = 0; i_19 < this.aMeshRasterizerArray10372.length; i_19++) {
				if (this.aMeshRasterizerArray10372[i_19] != null) {
					this.aMeshRasterizerArray10372[i_19].method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[i_19], this == VertexNormal.myPlayer ? 1 : 0);
				}
			}

			if (this.aClass539_10369 != null) {
				Class151 class151_25 = this.aClass539_10369.method11517();
				graphicalrenderer_1.method8456(class151_25);
			}

			for (i_19 = 0; i_19 < this.aMeshRasterizerArray10372.length; i_19++) {
				if (this.aMeshRasterizerArray10372[i_19] != null) {
					this.aBool10312 |= this.aMeshRasterizerArray10372[i_19].i();
				}

				this.aMeshRasterizerArray10372[i_19] = null;
			}

			this.anInt10349 = client.anInt7286;
			return class285_18;
		} else {
			return null;
		}
	}

	public Class163 method15811(int i_1) {
		if (this.aClass163_10334 != null) {
			if (this.aClass163_10334.aString2028 == null) {
				return null;
			}

			if (client.PUBLIC_FILTER == 0 || client.PUBLIC_FILTER == 3 || client.PUBLIC_FILTER == 1 && MovementType.method4282(this.displayName)) {
				return this.aClass163_10334;
			}
		}

		return null;
	}

	public int method15874() {
		return -(this.index * -1498872675 * -1691508299) - 1;
	}

}
