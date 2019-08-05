public class Wall extends Transform_Sub1_Sub5 implements SceneObject {

	static int[] anIntArray10531 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray10533 = new int[] { 16, 32, 64, 128 };
	boolean aBool10528 = true;
	Class200 aClass200_10530;
	public Class123 aClass123_10532;
	boolean aBool10529;

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_4 = this.method11168();
			Position class305_5 = this.method11166();
			Class285 class285_6 = Class470.method7824(this.aBool10529, (byte) -46);
			int i_7 = (int) class305_5.coords.x >> 9;
			int i_8 = (int) class305_5.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, i_7, i_7, i_8, i_8, true, 319778577);
			meshrasterizer_3.method11282(matrix44var_4, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10532.aClass539_1538 != null) {
				Class151 class151_9 = this.aClass123_10532.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_9);
			}

			this.aBool10528 = meshrasterizer_3.i() || this.aClass123_10532.aClass539_1538 != null;
			if (this.aClass200_10530 == null) {
				this.aClass200_10530 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3, (byte) -4);
			} else {
				Class388.method6694(this.aClass200_10530, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3, -1850766643);
			}

			return class285_6;
		}
	}

	boolean method12986(int i_1) {
		return false;
	}

	boolean method12987(int i_1) {
		return this.aBool10528;
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return this.aClass200_10530;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10532.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = (int) class305_4.coords.x >> 9;
			int i_6 = (int) class305_4.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_5, i_5, i_6, i_6, false, -66384219);
		}

	}

	boolean method13001() {
		return this.aBool10528;
	}

	public void method16108(Class476 class476_1) {
		this.aClass123_10532.method2116(class476_1, 424577870);
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10532.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_3 != null) {
			Matrix44Var matrix44var_4 = this.method11168();
			Position class305_5 = this.method11166();
			int i_6 = (int) class305_5.coords.x >> 9;
			int i_7 = (int) class305_5.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, i_6, i_6, i_7, i_7, false, 657441893);
		}

	}

	public int method77() {
		return this.aClass123_10532.anInt1555 * 2129865927 * 845010167;
	}

	final boolean method12985(int i_1) {
		return false;
	}

	public boolean method94() {
		return this.aClass123_10532.method2117(249607349);
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	public int getId(int i_1) {
		return this.aClass123_10532.anInt1540;
	}

	public int method89(int i_1) {
		return this.aClass123_10532.anInt1555;
	}

	public int method92(int i_1) {
		return this.aClass123_10532.anInt1542;
	}

	public void method85() {
	}

	public boolean method86(int i_1) {
		return this.aClass123_10532.method2117(-1306330739);
	}

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10532.method2118(graphicalrenderer_1, 1838435469);
	}

	public void method90() {
	}

	public int method12997() {
		return this.aClass123_10532.method2121();
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10532.method2136(graphicalrenderer_1, (byte) -126);
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public void method96() {
	}

	public int method91() {
		return this.aClass123_10532.anInt1542 * -2132267033 * -515017769;
	}

	public void method38() {
	}

	boolean method13002() {
		return this.aBool10528;
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10529, (byte) -125);
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, -337672509);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10532.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10532.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}

			this.aBool10528 = meshrasterizer_2.i() || this.aClass123_10532.aClass539_1538 != null;
			if (this.aClass200_10530 == null) {
				this.aClass200_10530 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) 5);
			} else {
				Class388.method6694(this.aClass200_10530, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, -550552279);
			}

			return class285_5;
		}
	}

	public int method73() {
		return this.aClass123_10532.anInt1555 * 2129865927 * 845010167;
	}

	public Wall(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, Engine.method4777(i_11, i_12));
		this.aClass123_10532 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, i_11, i_12, this.plane, i_6, this, bool_10, i_13);
		this.aBool10529 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.method13008(1, (byte) -77);
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10532.method2136(graphicalrenderer_1, (byte) -44);
	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10532.method2136(graphicalrenderer_1, (byte) -59);
	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10532.method2118(graphicalrenderer_1, 2032514144);
	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10532.method2118(graphicalrenderer_1, 2115861985);
	}

	public int method13005() {
		return this.aClass123_10532.method2115(156104600);
	}

	boolean method13000() {
		return this.aBool10528;
	}

	boolean method12999() {
		return false;
	}

	public int method76() {
		return this.aClass123_10532.anInt1540 * 1623064993 * 1535779425;
	}

	public int method13003() {
		return this.aClass123_10532.method2115(-1195004848);
	}

	public int method13017() {
		return this.aClass123_10532.method2115(1873128711);
	}

	public int method39() {
		return this.aClass123_10532.anInt1540 * 1623064993 * 1535779425;
	}

	public int method13006() {
		return this.aClass123_10532.method2115(-924448901);
	}

	public boolean method95() {
		return this.aClass123_10532.method2117(1065429909);
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	public int method12995(int i_1) {
		return this.aClass123_10532.method2115(1807526638);
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10529, (byte) -77);
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, -204709260);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10532.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10532.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}

			this.aBool10528 = meshrasterizer_2.i() || this.aClass123_10532.aClass539_1538 != null;
			if (this.aClass200_10530 == null) {
				this.aClass200_10530 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) 8);
			} else {
				Class388.method6694(this.aClass200_10530, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, -237678782);
			}

			return class285_5;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10532.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = (int) class305_4.coords.x >> 9;
			int i_6 = (int) class305_4.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_5, i_5, i_6, i_6, false, 975685007);
		}

	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.aClass123_10532.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_5 == null ? false : meshrasterizer_5.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	final boolean method13026() {
		return false;
	}

	final boolean method13011() {
		return false;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10529, (byte) -18);
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 1290726085);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10532.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10532.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}

			this.aBool10528 = meshrasterizer_2.i() || this.aClass123_10532.aClass539_1538 != null;
			if (this.aClass200_10530 == null) {
				this.aClass200_10530 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) -25);
			} else {
				Class388.method6694(this.aClass200_10530, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, -678461281);
			}

			return class285_5;
		}
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10530;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10530;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10530;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.aClass123_10532.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_4 == null ? false : meshrasterizer_4.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	static final void method16113() {
		int i_1 = Class296.CAM_MOVE_LOCALX * 512 + 256;
		int i_2 = Node_Sub44.CAM_MOVE_LOCALY * 512 + 256;
		int i_3 = Class504.getTerrainHeightAtPos(i_1, i_2, Class4.anInt35) - SpotAnimDefinitions.CAM_MOVE_Z;
		if (Class115.CAM_MOVE_VAR_SPEED >= 100) {
			IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = Class296.CAM_MOVE_LOCALX * 512 + 256;
			Class246.CAM_MOVE_ABSOLUTEY = Node_Sub44.CAM_MOVE_LOCALY * 512 + 256;
			Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT = Class504.getTerrainHeightAtPos(IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX, Class246.CAM_MOVE_ABSOLUTEY, Class4.anInt35) - SpotAnimDefinitions.CAM_MOVE_Z;
		} else {
			if (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX < i_1) {
				IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = (i_1 - IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX) * Class115.CAM_MOVE_VAR_SPEED / 1000 + IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX + Class454.CAM_MOVE_CONST_SPEED;
				if (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX > i_1) {
					IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = i_1;
				}
			}

			if (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX > i_1) {
				IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX -= Class115.CAM_MOVE_VAR_SPEED * (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX - i_1) / 1000 + Class454.CAM_MOVE_CONST_SPEED;
				if (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX < i_1) {
					IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = i_1;
				}
			}

			if (Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT < i_3) {
				Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT = (i_3 - Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT) * Class115.CAM_MOVE_VAR_SPEED / 1000 + Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT + Class454.CAM_MOVE_CONST_SPEED;
				if (Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT > i_3) {
					Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT = i_3;
				}
			}

			if (Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT > i_3) {
				Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT -= Class115.CAM_MOVE_VAR_SPEED * (Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT - i_3) / 1000 + Class454.CAM_MOVE_CONST_SPEED;
				if (Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT < i_3) {
					Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT = i_3;
				}
			}

			if (Class246.CAM_MOVE_ABSOLUTEY < i_2) {
				Class246.CAM_MOVE_ABSOLUTEY = (i_2 - Class246.CAM_MOVE_ABSOLUTEY) * Class115.CAM_MOVE_VAR_SPEED / 1000 + Class246.CAM_MOVE_ABSOLUTEY + Class454.CAM_MOVE_CONST_SPEED;
				if (Class246.CAM_MOVE_ABSOLUTEY > i_2) {
					Class246.CAM_MOVE_ABSOLUTEY = i_2;
				}
			}

			if (Class246.CAM_MOVE_ABSOLUTEY > i_2) {
				Class246.CAM_MOVE_ABSOLUTEY -= Class115.CAM_MOVE_VAR_SPEED * (Class246.CAM_MOVE_ABSOLUTEY - i_2) / 1000 + Class454.CAM_MOVE_CONST_SPEED;
				if (Class246.CAM_MOVE_ABSOLUTEY < i_2) {
					Class246.CAM_MOVE_ABSOLUTEY = i_2;
				}
			}
		}

		i_1 = PlaySynthCutsceneAction.anInt9368 * 512 + 256;
		i_2 = OutgoingLoginPacket.anInt4280 * 512 + 256;
		i_3 = Class504.getTerrainHeightAtPos(i_1, i_2, Class4.anInt35) - Class121.anInt1527;
		int i_4 = i_1 - IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX;
		int i_5 = i_3 - Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT;
		int i_6 = i_2 - Class246.CAM_MOVE_ABSOLUTEY;
		int i_7 = (int) Math.sqrt((double) (i_6 * i_6 + i_4 * i_4));
		int i_8 = (int) (Math.atan2((double) i_5, (double) i_7) * 2607.5945876176133D) & 0x3fff;
		int i_9 = (int) (Math.atan2((double) i_4, (double) i_6) * -2607.5945876176133D) & 0x3fff;
		if (i_8 < 1024) {
			i_8 = 1024;
		}

		if (i_8 > 3072) {
			i_8 = 3072;
		}

		if (Class293.anInt3512 < i_8) {
			Class293.anInt3512 += (i_8 - Class293.anInt3512 >> 3) * Class501.anInt5828 / 1000 + LinkedNodeList.anInt5606 << 3;
			if (Class293.anInt3512 > i_8) {
				Class293.anInt3512 = i_8;
			}
		}

		if (Class293.anInt3512 > i_8) {
			Class293.anInt3512 -= (Class293.anInt3512 - i_8 >> 3) * Class501.anInt5828 / 1000 + LinkedNodeList.anInt5606 << 3;
			if (Class293.anInt3512 < i_8) {
				Class293.anInt3512 = i_8;
			}
		}

		int i_10 = i_9 - AnimationDefinitions.anInt5930;
		if (i_10 > 8192) {
			i_10 -= 16384;
		}

		if (i_10 < -8192) {
			i_10 += 16384;
		}

		i_10 >>= 3;
		if (i_10 > 0) {
			AnimationDefinitions.anInt5930 += i_10 * Class501.anInt5828 / 1000 + LinkedNodeList.anInt5606 << 3;
			AnimationDefinitions.anInt5930 &= 0x3fff;
		}

		if (i_10 < 0) {
			AnimationDefinitions.anInt5930 -= LinkedNodeList.anInt5606 + -i_10 * Class501.anInt5828 / 1000 << 3;
			AnimationDefinitions.anInt5930 &= 0x3fff;
		}

		int i_11 = i_9 - AnimationDefinitions.anInt5930;
		if (i_11 > 8192) {
			i_11 -= 16384;
		}

		if (i_11 < -8192) {
			i_11 += 16384;
		}

		if (i_11 < 0 && i_10 > 0 || i_11 > 0 && i_10 < 0) {
			AnimationDefinitions.anInt5930 = i_9;
		}

		Class121.anInt1525 = 0;
	}

	public static final void method16114() {
		if (!client.aBool7331) {
			client.aFloat7284 += (-12.0F - client.aFloat7284) / 2.0F;
			client.aBool7371 = true;
			client.aBool7331 = true;
		}

	}
}
