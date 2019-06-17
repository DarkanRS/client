public class WallDecoration extends Transform_Sub1_Sub4 implements SceneObject {

	boolean aBool10504 = true;

	Class200 aClass200_10503;

	public Class123 aClass123_10501;

	boolean aBool10502;

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10501.method2132(graphicalrenderer_1, 262144, false, true);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = (int) class305_4.coords.x >> 9;
			int i_6 = (int) class305_4.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_5, i_5, i_6, i_6, false, 481625826);
		}
	}

	boolean method12987(int i_1) {
		return this.aBool10504;
	}

	public int method77() {
		return this.aClass123_10501.anInt1555 * 2129865927 * 845010167;
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return this.aClass200_10503;
	}

	public int method13017() {
		return this.aClass123_10501.method2115(-2054050626);
	}

	public int method12997() {
		return this.aClass123_10501.method2121();
	}

	public void method16082(Class476 class476_1) {
		this.aClass123_10501.method2116(class476_1, -786129672);
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
			matrix44var_4.method5209(this.method11168());
			matrix44var_4.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Position class305_5 = this.method11166();
			Class285 class285_6 = Class470.method7824(this.aBool10502, (byte) -19);
			int i_7 = (int) class305_5.coords.x >> 9;
			int i_8 = (int) class305_5.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, i_7, i_7, i_8, i_8, true, 2117778784);
			meshrasterizer_3.method11282(matrix44var_4, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10501.aClass539_1538 != null) {
				Class151 class151_9 = this.aClass123_10501.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_9);
			}
			this.aBool10504 = meshrasterizer_3.i() || this.aClass123_10501.aClass539_1538 != null;
			if (this.aClass200_10503 == null) {
				this.aClass200_10503 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3, (byte) 64);
			} else {
				Class388.method6694(this.aClass200_10503, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3, -862136190);
			}
			return class285_6;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10501.method2132(graphicalrenderer_1, 262144, false, true);
		if (meshrasterizer_3 != null) {
			Matrix44Var matrix44var_4 = this.method11168();
			Position class305_5 = this.method11166();
			int i_6 = (int) class305_5.coords.x >> 9;
			int i_7 = (int) class305_5.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, i_6, i_6, i_7, i_7, false, 810474788);
		}
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.aClass123_10501.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_5 == null ? false : meshrasterizer_5.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10501.method2132(graphicalrenderer_1, 262144, false, true);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			int i_5 = (int) class305_4.coords.x >> 9;
			int i_6 = (int) class305_4.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_5, i_5, i_6, i_6, false, 499948673);
		}
	}

	public int method12995(int i_1) {
		return this.aClass123_10501.method2115(-542086847);
	}

	public int method91() {
		return -515017769 * this.aClass123_10501.anInt1542 * -2132267033;
	}

	public void method85() {
	}

	public boolean method86(int i_1) {
		return this.aClass123_10501.method2117(-48783891);
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10501.method2136(graphicalrenderer_1, (byte) -53);
	}

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10501.method2118(graphicalrenderer_1, 1878976654);
	}

	public int method76() {
		return this.aClass123_10501.anInt1540 * 1623064993 * 1535779425;
	}

	public int method39() {
		return this.aClass123_10501.anInt1540 * 1623064993 * 1535779425;
	}

	public int method73() {
		return this.aClass123_10501.anInt1555 * 2129865927 * 845010167;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10503;
	}

	public void method38() {
	}

	public int method92(int i_1) {
		return this.aClass123_10501.anInt1542;
	}

	public void method90() {
	}

	public boolean method94() {
		return this.aClass123_10501.method2117(-1109544704);
	}

	public WallDecoration(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14, int i_15) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, i_11, i_12);
		this.aClass123_10501 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, i_13, i_14, this.plane, i_6, this, bool_10, i_15);
		this.aBool10502 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.method13008(1, (byte) -98);
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10501.method2136(graphicalrenderer_1, (byte) -96);
	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10501.method2136(graphicalrenderer_1, (byte) -94);
	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10501.method2118(graphicalrenderer_1, 1845753757);
	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10501.method2118(graphicalrenderer_1, 2026906554);
	}

	boolean method12986(int i_1) {
		return false;
	}

	boolean method13000() {
		return this.aBool10504;
	}

	boolean method13001() {
		return this.aBool10504;
	}

	public void method96() {
	}

	public int method13003() {
		return this.aClass123_10501.method2115(-829042136);
	}

	public int getId(int i_1) {
		return this.aClass123_10501.anInt1540;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			matrix44var_3.method5209(this.method11168());
			matrix44var_3.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10502, (byte) -29);
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 801514354);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10501.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10501.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10504 = meshrasterizer_2.i() || this.aClass123_10501.aClass539_1538 != null;
			if (this.aClass200_10503 == null) {
				this.aClass200_10503 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) -95);
			} else {
				Class388.method6694(this.aClass200_10503, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, 478482041);
			}
			return class285_5;
		}
	}

	public int method13006() {
		return this.aClass123_10501.method2115(1308504799);
	}

	public int method13005() {
		return this.aClass123_10501.method2115(746810719);
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			matrix44var_3.method5209(this.method11168());
			matrix44var_3.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10502, (byte) -73);
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 1608810000);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10501.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10501.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10504 = meshrasterizer_2.i() || this.aClass123_10501.aClass539_1538 != null;
			if (this.aClass200_10503 == null) {
				this.aClass200_10503 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) -44);
			} else {
				Class388.method6694(this.aClass200_10503, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, -369350425);
			}
			return class285_5;
		}
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			matrix44var_3.method5209(this.method11168());
			matrix44var_3.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10502, (byte) -12);
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 2103867839);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10501.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10501.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10504 = meshrasterizer_2.i() || this.aClass123_10501.aClass539_1538 != null;
			if (this.aClass200_10503 == null) {
				this.aClass200_10503 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) -14);
			} else {
				Class388.method6694(this.aClass200_10503, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, -1553157461);
			}
			return class285_5;
		}
	}

	boolean method13002() {
		return this.aBool10504;
	}

	public int method89(int i_1) {
		return this.aClass123_10501.anInt1555;
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10503;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10503;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.aClass123_10501.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_4 == null ? false : meshrasterizer_4.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	public boolean method95() {
		return this.aClass123_10501.method2117(317422168);
	}

	boolean method12999() {
		return false;
	}

	public static void method16086(int i_2, int i_3) {
		Class532.anInt7071 = 0;
		Class532.anInt7069 = i_2;
		Class532.anInt7070 = 0;
		Class532.anInt7068 = i_3;
	}

	static final void method16087(Entity animable_0) {
		if (animable_0.anIntArray10335 != null || animable_0.anIntArray10362 != null) {
			boolean bool_2 = true;
			CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			for (int i_4 = 0; i_4 < animable_0.anIntArray10335.length; i_4++) {
				int i_5 = -1;
				if (animable_0.anIntArray10335 != null) {
					i_5 = animable_0.anIntArray10335[i_4];
				}
				if (i_5 == -1) {
					if (!animable_0.method15798(i_4, -1)) {
						bool_2 = false;
					}
				} else {
					bool_2 = false;
					boolean bool_6 = false;
					boolean bool_7 = false;
					Vector3 vector3_8 = animable_0.method11166().coords;
					int i_9;
					int i_10;
					int i_11;
					if ((i_5 & ~0x3fffffff) == -1073741824) {
						i_11 = i_5 & 0xfffffff;
						int i_12 = i_11 >> 14;
						int i_13 = i_11 & 0x3fff;
						i_9 = (int) vector3_8.x - ((i_12 - coordgrid_3.x) * 512 + 256);
						i_10 = (int) vector3_8.z - ((i_13 - coordgrid_3.y) * 512 + 256);
					} else {
						Vector3 vector3_15;
						if ((i_5 & 0x8000) != 0) {
							i_11 = i_5 & 0x7fff;
							Player player_14 = client.players[i_11];
							if (player_14 == null) {
								animable_0.method15798(i_4, -1);
								continue;
							}
							vector3_15 = player_14.method11166().coords;
							i_9 = (int) vector3_8.x - (int) vector3_15.x;
							i_10 = (int) vector3_8.z - (int) vector3_15.z;
						} else {
							StringNode class282_sub47_16 = (StringNode) client.NPCS.get((long) i_5);
							if (class282_sub47_16 == null) {
								animable_0.method15798(i_4, -1);
								continue;
							}
							NPC npc_17 = (NPC) class282_sub47_16.anObject8068;
							vector3_15 = npc_17.method11166().coords;
							i_9 = (int) vector3_8.x - (int) vector3_15.x;
							i_10 = (int) vector3_8.z - (int) vector3_15.z;
						}
					}
					if (i_9 != 0 || i_10 != 0) {
						animable_0.method15798(i_4, (int) (Math.atan2((double) i_9, (double) i_10) * 2607.5945876176133D) & 0x3fff);
					}
				}
			}
			if (bool_2) {
				animable_0.anIntArray10335 = null;
				animable_0.anIntArray10362 = null;
			}
		}
	}

	public static void method16088(int i_0) {
		if (client.gameState == 3) {
			TCPPacket tcpmessage_2 = Class271.createPacket(OutgoingPacket.aClass379_4606, client.connectionContext.isaac);
			tcpmessage_2.buffer.writeByte(i_0);
			client.connectionContext.queuePacket(tcpmessage_2);
		}
	}
}
