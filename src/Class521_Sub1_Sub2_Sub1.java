public class Class521_Sub1_Sub2_Sub1 extends Class521_Sub1_Sub2 {

	public int anInt10412;
	public int anInt10414;
	public int anInt10416;
	public int anInt10423;
	int anInt10420;
	int anInt10421;
	int anInt10413;
	int anInt10417;
	public int anInt10422 = 0;
	boolean aBool10419 = false;
	int anInt10418 = 0;
	public int anInt10411 = -1;
	public int anInt10415 = -1;

	public int method12997(int i_1) {
		return this.anInt10422 - this.method12995(-2133263456);
	}

	void method15947(int i_1) {
		this.anInt10420 = 32 + (int) (Math.random() * 4.0D);
		this.anInt10421 = 3 + (int) (Math.random() * 2.0D);
		this.anInt10413 = 16 + (int) (Math.random() * 3.0D);
		if (Class393.preferences.textures.method12873(1014790347) == 1) {
			this.anInt10417 = (int) (Math.random() * 10.0D);
		} else {
			this.anInt10417 = (int) (Math.random() * 20.0D);
		}

	}

	boolean method12999() {
		return false;
	}

	boolean method12987(int i_1) {
		return this.aBool10419;
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return null;
	}

	public int method12995(int i_1) {
		return -10;
	}

	boolean method13001() {
		return this.aBool10419;
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	boolean method12986(int i_1) {
		return false;
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4) {
		Matrix44Var matrix44var_5 = graphicalrenderer_1.method8450();
		matrix44var_5.method5210(this.method11166());
		matrix44var_5.method5219(0.0F, -10.0F, 0.0F);
		MeshRasterizer meshrasterizer_6 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10423, 1970157841).method7084(graphicalrenderer_1, 131072, this.anInt10416, (PlayerAppearance) null, (Animation) null, 0, 0, 0, 0, (byte) 0);
		if (meshrasterizer_6 != null && meshrasterizer_6.method11270(i_2, i_3, matrix44var_5, true, 0)) {
			return true;
		} else {
			if (this.anInt10411 != -1) {
				meshrasterizer_6 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10411, 1550672616).method7084(graphicalrenderer_1, 131072, this.anInt10414, (PlayerAppearance) null, (Animation) null, 0, 0, 0, 0, (byte) 0);
				if (meshrasterizer_6 != null && meshrasterizer_6.method11270(i_2, i_3, matrix44var_5, true, 0)) {
					return true;
				}
			}

			if (this.anInt10415 != -1) {
				meshrasterizer_6 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10415, 2022809096).method7084(graphicalrenderer_1, 131072, this.anInt10412, (PlayerAppearance) null, (Animation) null, 0, 0, 0, 0, (byte) 0);
				if (meshrasterizer_6 != null && meshrasterizer_6.method11270(i_2, i_3, matrix44var_5, true, 0)) {
					return true;
				}
			}

			return false;
		}
	}

	public int method13003() {
		return -10;
	}

	public int method13006() {
		return -10;
	}

	boolean method13002() {
		return this.aBool10419;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9, (byte) -112);
		SceneObjectNode sceneobjectnode_4 = this.aClass206_7970.getGroundDecoration(this.plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9, -387297653);
		int i_5 = 0;
		if (class208_3 != null && class208_3.aClass521_Sub1_Sub1_2659.aBool9459) {
			i_5 = class208_3.aClass521_Sub1_Sub1_2659.method12995(21913800);
		}

		if (sceneobjectnode_4 != null && sceneobjectnode_4.aShort9561 > -i_5) {
			i_5 = -sceneobjectnode_4.aShort9561;
		}

		if (i_5 != 1327971947 * this.anInt10422 * -460947901) {
			vector3_2.y += (float) (i_5 - 1327971947 * this.anInt10422 * -460947901);
			this.method11171(vector3_2);
			this.anInt10422 = -460947901 * i_5 * 1327971947;
		}

		Matrix44Var matrix44var_6 = graphicalrenderer_1.method8450();
		matrix44var_6.method5212();
		if (this.anInt10422 * -460947901 * 1327971947 == 0) {
			boolean bool_7 = false;
			boolean bool_8 = false;
			boolean bool_9 = false;
			Ground class390_10 = this.aClass206_7970.aClass390Array2591[this.aByte7968];
			int i_11 = 599728753 * this.anInt10418 * -1885839727 << 1;
			int i_13 = -i_11 / 2;
			int i_14 = -i_11 / 2;
			int i_15 = class390_10.averageHeight((int) vector3_2.x + i_13, (int) vector3_2.z + i_14, 2105992060);
			int i_16 = i_11 / 2;
			int i_17 = -i_11 / 2;
			int i_18 = class390_10.averageHeight((int) vector3_2.x + i_16, i_17 + (int) vector3_2.z, 1157857956);
			int i_19 = -i_11 / 2;
			int i_20 = i_11 / 2;
			int i_21 = class390_10.averageHeight((int) vector3_2.x + i_19, i_20 + (int) vector3_2.z, -102791110);
			int i_22 = i_11 / 2;
			int i_23 = i_11 / 2;
			int i_24 = class390_10.averageHeight((int) vector3_2.x + i_22, (int) vector3_2.z + i_23, 63414596);
			int i_25 = i_15 < i_18 ? i_15 : i_18;
			int i_26 = i_21 < i_24 ? i_21 : i_24;
			int i_27 = i_18 < i_24 ? i_18 : i_24;
			int i_28 = i_15 < i_21 ? i_15 : i_21;
			int i_29;
			if (i_11 != 0) {
				i_29 = (int) (Math.atan2((double) (i_25 - i_26), (double) i_11) * 2607.5945876176133D) & 0x3fff;
				if (i_29 != 0) {
					matrix44var_6.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_29));
				}
			}

			if (i_11 != 0) {
				i_29 = (int) (Math.atan2((double) (i_28 - i_27), (double) i_11) * 2607.5945876176133D) & 0x3fff;
				if (i_29 != 0) {
					matrix44var_6.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(-i_29));
				}
			}

			i_29 = i_15 + i_24;
			if (i_18 + i_21 < i_29) {
				i_29 = i_18 + i_21;
			}

			i_29 = (i_29 >> 1) - (int) vector3_2.y;
			if (i_29 != 0) {
				matrix44var_6.method5219(0.0F, (float) i_29, 0.0F);
			}
		}

		vector3_2.pushVectorStack();
		Vector3 vector3_30 = this.method11166().aClass385_3595;
		matrix44var_6.method5219(vector3_30.x, vector3_30.y - 10.0F, vector3_30.z);
		Class285 class285_31 = Class470.method7824(true, (byte) 2);
		this.aBool10419 = false;
		this.anInt10418 = 0 * 599728753;
		MeshRasterizer meshrasterizer_32;
		if (-503986647 * this.anInt10415 * 100349465 != -1) {
			meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-503986647 * this.anInt10415 * 100349465, 1566081376).method7084(graphicalrenderer_1, 526336, this.anInt10412 * -1052106625 * -931815553, (PlayerAppearance) null, (Animation) null, this.anInt10420 * -450257987 * 225048469, this.anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
			if (meshrasterizer_32 != null) {
				meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[2], 0);
				this.aBool10419 |= meshrasterizer_32.i();
				this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
			}
		}

		if (this.anInt10411 * -1841858001 * 313920719 != -1) {
			meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10411 * -1841858001 * 313920719, 627296952).method7084(graphicalrenderer_1, 526336, 1089437631 * this.anInt10414 * 1305767999, (PlayerAppearance) null, (Animation) null, 225048469 * this.anInt10420 * -450257987, -731570957 * this.anInt10421 * -1431655765 * 3 * -146187205, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
			if (meshrasterizer_32 != null) {
				meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[1], 0);
				this.aBool10419 |= meshrasterizer_32.i();
				if (meshrasterizer_32.n() > this.anInt10418 * -1885839727 * 599728753) {
					this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
				}
			}
		}

		meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-876219087 * this.anInt10423 * -1511570479, 1397021511).method7084(graphicalrenderer_1, 526336, this.anInt10416 * 1423185937 * 513267953, (PlayerAppearance) null, (Animation) null, 225048469 * this.anInt10420 * -450257987, this.anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
		if (meshrasterizer_32 != null) {
			meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[0], 0);
			this.aBool10419 |= meshrasterizer_32.i();
			if (meshrasterizer_32.n() > 599728753 * this.anInt10418 * -1885839727) {
				this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
			}
		}

		return class285_31;
	}

	public int method13017() {
		return -10;
	}

	public int method13005() {
		return -10;
	}

	int method12996(int i_1) {
		ItemDefinitions itemdefinitions_2 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10423, 688788238);
		int i_3 = itemdefinitions_2.pickSizeShift;
		ItemDefinitions itemdefinitions_4;
		if (this.anInt10411 != -1) {
			itemdefinitions_4 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10411, 448963833);
			if (itemdefinitions_4.pickSizeShift > i_3) {
				i_3 = itemdefinitions_4.pickSizeShift;
			}
		}

		if (this.anInt10415 != -1) {
			itemdefinitions_4 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10415, 2069769929);
			if (itemdefinitions_4.pickSizeShift > i_3) {
				i_3 = itemdefinitions_4.pickSizeShift;
			}
		}

		return i_3;
	}

	public Class521_Sub1_Sub2_Sub1(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		super(sceneobjectmanager_1, i_2, i_3, i_4, i_5, i_6);
		this.method13008(3, (byte) -104);
		this.method15947(1890677127);
	}

	boolean method13000() {
		return this.aBool10419;
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9, (byte) 62);
		SceneObjectNode sceneobjectnode_4 = this.aClass206_7970.getGroundDecoration(this.plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9, -387297653);
		int i_5 = 0;
		if (class208_3 != null && class208_3.aClass521_Sub1_Sub1_2659.aBool9459) {
			i_5 = class208_3.aClass521_Sub1_Sub1_2659.method12995(-2077263748);
		}

		if (sceneobjectnode_4 != null && sceneobjectnode_4.aShort9561 > -i_5) {
			i_5 = -sceneobjectnode_4.aShort9561;
		}

		if (i_5 != 1327971947 * this.anInt10422 * -460947901) {
			vector3_2.y += (float) (i_5 - 1327971947 * this.anInt10422 * -460947901);
			this.method11171(vector3_2);
			this.anInt10422 = -460947901 * i_5 * 1327971947;
		}

		Matrix44Var matrix44var_6 = graphicalrenderer_1.method8450();
		matrix44var_6.method5212();
		if (this.anInt10422 * -460947901 * 1327971947 == 0) {
			boolean bool_7 = false;
			boolean bool_8 = false;
			boolean bool_9 = false;
			Ground class390_10 = this.aClass206_7970.aClass390Array2591[this.aByte7968];
			int i_11 = 599728753 * this.anInt10418 * -1885839727 << 1;
			int i_13 = -i_11 / 2;
			int i_14 = -i_11 / 2;
			int i_15 = class390_10.averageHeight((int) vector3_2.x + i_13, (int) vector3_2.z + i_14, 1641785657);
			int i_16 = i_11 / 2;
			int i_17 = -i_11 / 2;
			int i_18 = class390_10.averageHeight((int) vector3_2.x + i_16, i_17 + (int) vector3_2.z, -450358171);
			int i_19 = -i_11 / 2;
			int i_20 = i_11 / 2;
			int i_21 = class390_10.averageHeight((int) vector3_2.x + i_19, i_20 + (int) vector3_2.z, -1463134594);
			int i_22 = i_11 / 2;
			int i_23 = i_11 / 2;
			int i_24 = class390_10.averageHeight((int) vector3_2.x + i_22, (int) vector3_2.z + i_23, -1500462449);
			int i_25 = i_15 < i_18 ? i_15 : i_18;
			int i_26 = i_21 < i_24 ? i_21 : i_24;
			int i_27 = i_18 < i_24 ? i_18 : i_24;
			int i_28 = i_15 < i_21 ? i_15 : i_21;
			int i_29;
			if (i_11 != 0) {
				i_29 = (int) (Math.atan2((double) (i_25 - i_26), (double) i_11) * 2607.5945876176133D) & 0x3fff;
				if (i_29 != 0) {
					matrix44var_6.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_29));
				}
			}

			if (i_11 != 0) {
				i_29 = (int) (Math.atan2((double) (i_28 - i_27), (double) i_11) * 2607.5945876176133D) & 0x3fff;
				if (i_29 != 0) {
					matrix44var_6.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(-i_29));
				}
			}

			i_29 = i_15 + i_24;
			if (i_18 + i_21 < i_29) {
				i_29 = i_18 + i_21;
			}

			i_29 = (i_29 >> 1) - (int) vector3_2.y;
			if (i_29 != 0) {
				matrix44var_6.method5219(0.0F, (float) i_29, 0.0F);
			}
		}

		vector3_2.pushVectorStack();
		Vector3 vector3_30 = this.method11166().aClass385_3595;
		matrix44var_6.method5219(vector3_30.x, vector3_30.y - 10.0F, vector3_30.z);
		Class285 class285_31 = Class470.method7824(true, (byte) -32);
		this.aBool10419 = false;
		this.anInt10418 = 0 * 599728753;
		MeshRasterizer meshrasterizer_32;
		if (-503986647 * this.anInt10415 * 100349465 != -1) {
			meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-503986647 * this.anInt10415 * 100349465, 1810214014).method7084(graphicalrenderer_1, 526336, this.anInt10412 * -1052106625 * -931815553, (PlayerAppearance) null, (Animation) null, this.anInt10420 * -450257987 * 225048469, this.anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
			if (meshrasterizer_32 != null) {
				meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[2], 0);
				this.aBool10419 |= meshrasterizer_32.i();
				this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
			}
		}

		if (this.anInt10411 * -1841858001 * 313920719 != -1) {
			meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10411 * -1841858001 * 313920719, 208623712).method7084(graphicalrenderer_1, 526336, 1089437631 * this.anInt10414 * 1305767999, (PlayerAppearance) null, (Animation) null, 225048469 * this.anInt10420 * -450257987, -731570957 * this.anInt10421 * -1431655765 * 3 * -146187205, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
			if (meshrasterizer_32 != null) {
				meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[1], 0);
				this.aBool10419 |= meshrasterizer_32.i();
				if (meshrasterizer_32.n() > this.anInt10418 * -1885839727 * 599728753) {
					this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
				}
			}
		}

		meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-876219087 * this.anInt10423 * -1511570479, 1591407655).method7084(graphicalrenderer_1, 526336, this.anInt10416 * 1423185937 * 513267953, (PlayerAppearance) null, (Animation) null, 225048469 * this.anInt10420 * -450257987, this.anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
		if (meshrasterizer_32 != null) {
			meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[0], 0);
			this.aBool10419 |= meshrasterizer_32.i();
			if (meshrasterizer_32.n() > 599728753 * this.anInt10418 * -1885839727) {
				this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
			}
		}

		return class285_31;
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9, (byte) 88);
		SceneObjectNode sceneobjectnode_4 = this.aClass206_7970.getGroundDecoration(this.plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9, -387297653);
		int i_5 = 0;
		if (class208_3 != null && class208_3.aClass521_Sub1_Sub1_2659.aBool9459) {
			i_5 = class208_3.aClass521_Sub1_Sub1_2659.method12995(-1830209037);
		}

		if (sceneobjectnode_4 != null && sceneobjectnode_4.aShort9561 > -i_5) {
			i_5 = -sceneobjectnode_4.aShort9561;
		}

		if (i_5 != 1327971947 * this.anInt10422 * -460947901) {
			vector3_2.y += (float) (i_5 - 1327971947 * this.anInt10422 * -460947901);
			this.method11171(vector3_2);
			this.anInt10422 = -460947901 * i_5 * 1327971947;
		}

		Matrix44Var matrix44var_6 = graphicalrenderer_1.method8450();
		matrix44var_6.method5212();
		if (this.anInt10422 * -460947901 * 1327971947 == 0) {
			boolean bool_7 = false;
			boolean bool_8 = false;
			boolean bool_9 = false;
			Ground class390_10 = this.aClass206_7970.aClass390Array2591[this.aByte7968];
			int i_11 = 599728753 * this.anInt10418 * -1885839727 << 1;
			int i_13 = -i_11 / 2;
			int i_14 = -i_11 / 2;
			int i_15 = class390_10.averageHeight((int) vector3_2.x + i_13, (int) vector3_2.z + i_14, 1551660618);
			int i_16 = i_11 / 2;
			int i_17 = -i_11 / 2;
			int i_18 = class390_10.averageHeight((int) vector3_2.x + i_16, i_17 + (int) vector3_2.z, 250380296);
			int i_19 = -i_11 / 2;
			int i_20 = i_11 / 2;
			int i_21 = class390_10.averageHeight((int) vector3_2.x + i_19, i_20 + (int) vector3_2.z, -268709026);
			int i_22 = i_11 / 2;
			int i_23 = i_11 / 2;
			int i_24 = class390_10.averageHeight((int) vector3_2.x + i_22, (int) vector3_2.z + i_23, 1481182627);
			int i_25 = i_15 < i_18 ? i_15 : i_18;
			int i_26 = i_21 < i_24 ? i_21 : i_24;
			int i_27 = i_18 < i_24 ? i_18 : i_24;
			int i_28 = i_15 < i_21 ? i_15 : i_21;
			int i_29;
			if (i_11 != 0) {
				i_29 = (int) (Math.atan2((double) (i_25 - i_26), (double) i_11) * 2607.5945876176133D) & 0x3fff;
				if (i_29 != 0) {
					matrix44var_6.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_29));
				}
			}

			if (i_11 != 0) {
				i_29 = (int) (Math.atan2((double) (i_28 - i_27), (double) i_11) * 2607.5945876176133D) & 0x3fff;
				if (i_29 != 0) {
					matrix44var_6.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(-i_29));
				}
			}

			i_29 = i_15 + i_24;
			if (i_18 + i_21 < i_29) {
				i_29 = i_18 + i_21;
			}

			i_29 = (i_29 >> 1) - (int) vector3_2.y;
			if (i_29 != 0) {
				matrix44var_6.method5219(0.0F, (float) i_29, 0.0F);
			}
		}

		vector3_2.pushVectorStack();
		Vector3 vector3_30 = this.method11166().aClass385_3595;
		matrix44var_6.method5219(vector3_30.x, vector3_30.y - 10.0F, vector3_30.z);
		Class285 class285_31 = Class470.method7824(true, (byte) -61);
		this.aBool10419 = false;
		this.anInt10418 = 0 * 599728753;
		MeshRasterizer meshrasterizer_32;
		if (-503986647 * this.anInt10415 * 100349465 != -1) {
			meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-503986647 * this.anInt10415 * 100349465, 1568687750).method7084(graphicalrenderer_1, 526336, this.anInt10412 * -1052106625 * -931815553, (PlayerAppearance) null, (Animation) null, this.anInt10420 * -450257987 * 225048469, this.anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
			if (meshrasterizer_32 != null) {
				meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[2], 0);
				this.aBool10419 |= meshrasterizer_32.i();
				this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
			}
		}

		if (this.anInt10411 * -1841858001 * 313920719 != -1) {
			meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10411 * -1841858001 * 313920719, 849121032).method7084(graphicalrenderer_1, 526336, 1089437631 * this.anInt10414 * 1305767999, (PlayerAppearance) null, (Animation) null, 225048469 * this.anInt10420 * -450257987, -731570957 * this.anInt10421 * -1431655765 * 3 * -146187205, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
			if (meshrasterizer_32 != null) {
				meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[1], 0);
				this.aBool10419 |= meshrasterizer_32.i();
				if (meshrasterizer_32.n() > this.anInt10418 * -1885839727 * 599728753) {
					this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
				}
			}
		}

		meshrasterizer_32 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-876219087 * this.anInt10423 * -1511570479, 1958359567).method7084(graphicalrenderer_1, 526336, this.anInt10416 * 1423185937 * 513267953, (PlayerAppearance) null, (Animation) null, 225048469 * this.anInt10420 * -450257987, this.anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * this.anInt10413 * 1440872383, -359736537 * this.anInt10417 * 1371726999, (byte) 0);
		if (meshrasterizer_32 != null) {
			meshrasterizer_32.method11282(matrix44var_6, this.aClass275_Sub5Array7965[0], 0);
			this.aBool10419 |= meshrasterizer_32.i();
			if (meshrasterizer_32.n() > 599728753 * this.anInt10418 * -1885839727) {
				this.anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
			}
		}

		return class285_31;
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
		matrix44var_4.method5210(this.method11166());
		matrix44var_4.method5219(0.0F, -10.0F, 0.0F);
		MeshRasterizer meshrasterizer_5 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10423 * -1511570479 * -876219087, 1772986804).method7084(graphicalrenderer_1, 131072, this.anInt10416 * 1423185937 * 513267953, (PlayerAppearance) null, (Animation) null, 0, 0, 0, 0, (byte) 0);
		if (meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, matrix44var_4, true, 0)) {
			return true;
		} else {
			if (this.anInt10411 * -1841858001 * 313920719 != -1) {
				meshrasterizer_5 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(313920719 * this.anInt10411 * -1841858001, 505864410).method7084(graphicalrenderer_1, 131072, 1089437631 * this.anInt10414 * 1305767999, (PlayerAppearance) null, (Animation) null, 0, 0, 0, 0, (byte) 0);
				if (meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, matrix44var_4, true, 0)) {
					return true;
				}
			}

			if (this.anInt10415 * 100349465 * -503986647 != -1) {
				meshrasterizer_5 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10415 * 100349465 * -503986647, 1589292457).method7084(graphicalrenderer_1, 131072, this.anInt10412 * -1052106625 * -931815553, (PlayerAppearance) null, (Animation) null, 0, 0, 0, 0, (byte) 0);
				if (meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, matrix44var_4, true, 0)) {
					return true;
				}
			}

			return false;
		}
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return null;
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1, int i_2) {
		Vector3 vector3_3 = Vector3.popVectorStackTo(this.method11166().aClass385_3595);
		Class208 class208_4 = this.aClass206_7970.method3507(this.plane, (int) vector3_3.x >> 9, (int) vector3_3.z >> 9, (byte) -92);
		SceneObjectNode sceneobjectnode_5 = this.aClass206_7970.getGroundDecoration(this.plane, (int) vector3_3.x >> 9, (int) vector3_3.z >> 9, -387297653);
		int i_6 = 0;
		if (class208_4 != null && class208_4.aClass521_Sub1_Sub1_2659.aBool9459) {
			i_6 = class208_4.aClass521_Sub1_Sub1_2659.method12995(-1954899292);
		}

		if (sceneobjectnode_5 != null && sceneobjectnode_5.aShort9561 > -i_6) {
			i_6 = -sceneobjectnode_5.aShort9561;
		}

		if (i_6 != this.anInt10422) {
			vector3_3.y += (float) (i_6 - this.anInt10422);
			this.method11171(vector3_3);
			this.anInt10422 = i_6;
		}

		Matrix44Var matrix44var_7 = graphicalrenderer_1.method8450();
		matrix44var_7.method5212();
		if (this.anInt10422 == 0) {
			boolean bool_8 = false;
			boolean bool_9 = false;
			boolean bool_10 = false;
			Ground class390_11 = this.aClass206_7970.aClass390Array2591[this.aByte7968];
			int i_12 = this.anInt10418 << 1;
			int i_14 = -i_12 / 2;
			int i_15 = -i_12 / 2;
			int i_16 = class390_11.averageHeight(i_14 + (int) vector3_3.x, i_15 + (int) vector3_3.z, 924924615);
			int i_17 = i_12 / 2;
			int i_18 = -i_12 / 2;
			int i_19 = class390_11.averageHeight(i_17 + (int) vector3_3.x, i_18 + (int) vector3_3.z, 533438354);
			int i_20 = -i_12 / 2;
			int i_21 = i_12 / 2;
			int i_22 = class390_11.averageHeight(i_20 + (int) vector3_3.x, i_21 + (int) vector3_3.z, 656324571);
			int i_23 = i_12 / 2;
			int i_24 = i_12 / 2;
			int i_25 = class390_11.averageHeight(i_23 + (int) vector3_3.x, i_24 + (int) vector3_3.z, -1831727640);
			int i_26 = i_16 < i_19 ? i_16 : i_19;
			int i_27 = i_22 < i_25 ? i_22 : i_25;
			int i_28 = i_19 < i_25 ? i_19 : i_25;
			int i_29 = i_16 < i_22 ? i_16 : i_22;
			int i_30;
			if (i_12 != 0) {
				i_30 = (int) (Math.atan2((double) (i_26 - i_27), (double) i_12) * 2607.5945876176133D) & 0x3fff;
				if (i_30 != 0) {
					matrix44var_7.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_30));
				}
			}

			if (i_12 != 0) {
				i_30 = (int) (Math.atan2((double) (i_29 - i_28), (double) i_12) * 2607.5945876176133D) & 0x3fff;
				if (i_30 != 0) {
					matrix44var_7.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(-i_30));
				}
			}

			i_30 = i_16 + i_25;
			if (i_19 + i_22 < i_30) {
				i_30 = i_19 + i_22;
			}

			i_30 = (i_30 >> 1) - (int) vector3_3.y;
			if (i_30 != 0) {
				matrix44var_7.method5219(0.0F, (float) i_30, 0.0F);
			}
		}

		vector3_3.pushVectorStack();
		Vector3 vector3_31 = this.method11166().aClass385_3595;
		matrix44var_7.method5219(vector3_31.x, vector3_31.y - 10.0F, vector3_31.z);
		Class285 class285_32 = Class470.method7824(true, (byte) -5);
		this.aBool10419 = false;
		this.anInt10418 = 0;
		MeshRasterizer meshrasterizer_33;
		if (this.anInt10415 != -1) {
			meshrasterizer_33 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10415, 2123092777).method7084(graphicalrenderer_1, 526336, this.anInt10412, (PlayerAppearance) null, (Animation) null, this.anInt10420, this.anInt10421, this.anInt10413, this.anInt10417, (byte) 0);
			if (meshrasterizer_33 != null) {
				meshrasterizer_33.method11282(matrix44var_7, this.aClass275_Sub5Array7965[2], 0);
				this.aBool10419 |= meshrasterizer_33.i();
				this.anInt10418 = meshrasterizer_33.n();
			}
		}

		if (this.anInt10411 != -1) {
			meshrasterizer_33 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10411, 687184901).method7084(graphicalrenderer_1, 526336, this.anInt10414, (PlayerAppearance) null, (Animation) null, this.anInt10420, this.anInt10421, this.anInt10413, this.anInt10417, (byte) 0);
			if (meshrasterizer_33 != null) {
				meshrasterizer_33.method11282(matrix44var_7, this.aClass275_Sub5Array7965[1], 0);
				this.aBool10419 |= meshrasterizer_33.i();
				if (meshrasterizer_33.n() > this.anInt10418) {
					this.anInt10418 = meshrasterizer_33.n();
				}
			}
		}

		meshrasterizer_33 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(this.anInt10423, 994725585).method7084(graphicalrenderer_1, 526336, this.anInt10416, (PlayerAppearance) null, (Animation) null, this.anInt10420, this.anInt10421, this.anInt10413, this.anInt10417, (byte) 0);
		if (meshrasterizer_33 != null) {
			meshrasterizer_33.method11282(matrix44var_7, this.aClass275_Sub5Array7965[0], 0);
			this.aBool10419 |= meshrasterizer_33.i();
			if (meshrasterizer_33.n() > this.anInt10418) {
				this.anInt10418 = meshrasterizer_33.n();
			}
		}

		return class285_32;
	}

}
