public class Class188 {

	public static boolean aBool2378 = false;

	public static boolean aBool2377 = false;

	public static boolean aBool2372 = false;

	Class188() throws Throwable {
		throw new Error();
	}

	public static void method3139(GraphicalRenderer graphicalrenderer_0, Index index_1) {
		Class91[] arr_3 = Class91.method1514(index_1, Class165.anInt2035);
		Class282_Sub21.aClass160Array7673 = new NativeSprite[arr_3.length];
		int i_4;
		for (i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class282_Sub21.aClass160Array7673[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
		}
		arr_3 = Class91.method1514(index_1, Class475.anInt5622);
		Class16.aClass160Array138 = new NativeSprite[arr_3.length];
		for (i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class16.aClass160Array138[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
		}
		arr_3 = Class91.method1514(index_1, Class16.anInt135);
		Class391.aClass160Array4778 = new NativeSprite[arr_3.length];
		for (i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class391.aClass160Array4778[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
		}
		arr_3 = Class91.method1514(index_1, Class16.anInt142);
		Class282_Sub20_Sub15.aClass160Array9838 = new NativeSprite[arr_3.length];
		for (i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class282_Sub20_Sub15.aClass160Array9838[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
		}
		arr_3 = Class91.method1514(index_1, Class16.anInt137);
		Class16.aClass160Array145 = new NativeSprite[arr_3.length];
		byte b_6 = 25;
		int i_5;
		for (i_5 = 0; i_5 < arr_3.length; i_5++) {
			arr_3[i_5].method1529(-b_6 + (int) (Math.random() * (double) b_6 * 2.0D), -b_6 + (int) (Math.random() * (double) b_6 * 2.0D), -b_6 + (int) (Math.random() * (double) b_6 * 2.0D));
			Class16.aClass160Array145[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
		}
		arr_3 = Class91.method1514(index_1, Class468_Sub12.anInt7899);
		Class282_Sub36.aClass160Array7994 = new NativeSprite[arr_3.length];
		for (i_5 = 0; i_5 < arr_3.length; i_5++) {
			Class282_Sub36.aClass160Array7994[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
		}
		arr_3 = Class91.method1514(index_1, Class13.anInt130);
		Class250.aClass160Array3092 = new NativeSprite[arr_3.length];
		b_6 = 12;
		for (i_5 = 0; i_5 < arr_3.length; i_5++) {
			arr_3[i_5].method1529(-b_6 + (int) (Math.random() * (double) b_6 * 2.0D), -b_6 + (int) (Math.random() * (double) b_6 * 2.0D), -b_6 + (int) (Math.random() * (double) b_6 * 2.0D));
			Class250.aClass160Array3092[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
		}
		arr_3 = Class91.method1514(index_1, Class16.anInt143);
		Class182.aClass160Array2261 = new NativeSprite[arr_3.length];
		b_6 = 12;
		for (i_5 = 0; i_5 < arr_3.length; i_5++) {
			arr_3[i_5].method1529(-b_6 + (int) (Math.random() * (double) b_6 * 2.0D), -b_6 + (int) (Math.random() * (double) b_6 * 2.0D), -b_6 + (int) (Math.random() * (double) b_6 * 2.0D));
			Class182.aClass160Array2261[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
		}
		Class16.aClass160_146 = graphicalrenderer_0.method8444(Class91.method1522(index_1, Class16.anInt141, 0), true);
		Exception_Sub1.aClass160_10075 = graphicalrenderer_0.method8444(Class91.method1522(index_1, Class165.anInt2037, 0), true);
		arr_3 = Class91.method1514(index_1, Class271.anInt3330);
		Class245.aClass160Array3027 = new NativeSprite[arr_3.length];
		for (i_5 = 0; i_5 < arr_3.length; i_5++) {
			Class245.aClass160Array3027[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
		}
	}

	static void method3140() {
		SoftCache softcache_1 = Class13.aClass229_127;
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3859(-1273299444);
		}
	}

	static final void decodeTilestreamPacket(TilestreamPacket tilestreampacket_0, int i_1) {
		RsBitsBuffer rsbitsbuffer_2 = client.aClass184_7475.recievedBuffer;
		int i_3;
		CoordGrid coordgrid_4;
		int i_5;
		int i_6;
		int i_7;
		int i_8;
		int i_9;
		int i_10;
		int i_11;
		if (TilestreamPacket.aClass364_4204 == tilestreampacket_0) {
			i_3 = rsbitsbuffer_2.readUnsignedByte();
			coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
			i_6 = i_5 + coordgrid_4.y;
			i_7 = (i_3 >> 4 & 0x7) + SceneObjectType.anInt5495;
			i_8 = i_7 + coordgrid_4.x;
			i_9 = rsbitsbuffer_2.readUnsignedShort();
			i_10 = rsbitsbuffer_2.readUnsignedShort();
			i_11 = rsbitsbuffer_2.readUnsignedShort();
			if (client.aClass465_7414 != null) {
				Class282_Sub29 class282_sub29_12 = (Class282_Sub29) client.aClass465_7414.get((long) (Class272.anInt3331 << 28 | i_6 << 14 | i_8));
				if (class282_sub29_12 != null) {
					for (Class282_Sub34 class282_sub34_13 = (Class282_Sub34) class282_sub29_12.aClass482_7708.head((byte) 55); class282_sub34_13 != null; class282_sub34_13 = (Class282_Sub34) class282_sub29_12.aClass482_7708.next(1296718058)) {
						if ((i_9 & 0x7fff) == class282_sub34_13.anInt7853 && i_10 == class282_sub34_13.anInt7852) {
							class282_sub34_13.remove();
							class282_sub34_13.anInt7852 = i_11;
							Class353.method6209(Class272.anInt3331, i_8, i_6, class282_sub34_13, 1242216050);
							break;
						}
					}
					if (i_7 >= 0 && i_5 >= 0 && i_7 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1322428879) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-334647833)) {
						Class434_Sub1.method12760(Class272.anInt3331, i_7, i_5);
					}
				}
			}
		} else {
			int i_21;
			if (TilestreamPacket.aClass364_4211 == tilestreampacket_0) {
				i_3 = rsbitsbuffer_2.readInt();
				i_21 = rsbitsbuffer_2.readUnsignedByte();
				IndexLoaders.MAP_REGION_DECODER.method4436(-1902226751).getObjectDefinitions(i_3).method7987(i_21, -588474817);
			} else {
				int i_23;
				if (TilestreamPacket.aClass364_4218 == tilestreampacket_0) {
					i_3 = rsbitsbuffer_2.readUnsignedByte();
					i_21 = (i_3 >> 4 & 0x7) + SceneObjectType.anInt5495;
					i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
					i_6 = rsbitsbuffer_2.readUnsignedShort();
					if (i_6 == 65535) {
						i_6 = -1;
					}
					i_7 = rsbitsbuffer_2.readUnsignedShort();
					i_8 = rsbitsbuffer_2.readUnsignedShort();
					i_9 = rsbitsbuffer_2.readUnsignedByte();
					if (IndexLoaders.MAP_REGION_DECODER.method4419(-1960644512) != Class256.aClass256_3153 && i_21 >= 0 && i_5 >= 0 && i_21 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-1162153340) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1140122689)) {
						if (i_6 == -1) {
							Class282_Sub50_Sub10 class282_sub50_sub10_22 = (Class282_Sub50_Sub10) client.aClass465_7334.get((long) (i_21 << 16 | i_5));
							if (class282_sub50_sub10_22 != null) {
								class282_sub50_sub10_22.aClass521_Sub1_Sub1_Sub4_9636.method15931(-2141216299);
								class282_sub50_sub10_22.remove();
							}
						} else {
							i_10 = i_21 * 512 + 256;
							i_11 = i_5 * 512 + 256;
							i_23 = Class272.anInt3331;
							if (i_23 < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_21, i_5, 1736872012)) {
								++i_23;
							}
							Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4_35 = new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1262511642), i_6, i_8, Class272.anInt3331, i_23, i_10, Class504.method8389(i_10, i_11, Class272.anInt3331, (byte) 59) - i_7, i_11, i_21, i_21, i_5, i_5, i_9, false);
							client.aClass465_7334.put(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4_35), (long) (i_21 << 16 | i_5));
						}
					}
				} else {
					int i_14;
					int i_15;
					int i_16;
					int i_24;
					if (TilestreamPacket.PROJECTILE == tilestreampacket_0) {
						i_3 = rsbitsbuffer_2.readUnsignedByte();
						boolean bool_38 = (i_3 & 0x80) != 0;
						i_5 = (i_3 >> 3 & 0x7) + SceneObjectType.anInt5495;
						i_6 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
						i_7 = i_5 + rsbitsbuffer_2.readByte();
						i_8 = i_6 + rsbitsbuffer_2.readByte();
						i_9 = rsbitsbuffer_2.readShort();
						i_10 = rsbitsbuffer_2.readUnsignedShort();
						i_11 = rsbitsbuffer_2.readUnsignedByte() * 4;
						i_23 = rsbitsbuffer_2.readUnsignedByte() * 4;
						i_24 = rsbitsbuffer_2.readUnsignedShort();
						i_14 = rsbitsbuffer_2.readUnsignedShort();
						i_15 = rsbitsbuffer_2.readUnsignedByte();
						i_16 = rsbitsbuffer_2.readUnsignedShort();
						if (i_15 == 255) {
							i_15 = -1;
						}
						if (IndexLoaders.MAP_REGION_DECODER.method4419(-1848311366) != Class256.aClass256_3153 && i_5 >= 0 && i_6 >= 0 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1333657203) && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1784224136) && i_7 >= 0 && i_8 >= 0 && i_7 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-1429544528) && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-637602428) && i_10 != 65535) {
							i_5 = i_5 * 512 + 256;
							i_6 = i_6 * 512 + 256;
							i_7 = i_7 * 512 + 256;
							i_8 = i_8 * 512 + 256;
							i_11 <<= 2;
							i_23 <<= 2;
							i_16 <<= 2;
							Class521_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3_17 = new Class521_Sub1_Sub1_Sub3(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1524809877), i_10, Class272.anInt3331, Class272.anInt3331, i_5, i_6, i_11, i_24 + client.cycles, i_14 + client.cycles, i_15, i_16, 0, i_9, i_23, bool_38, -1);
							class521_sub1_sub1_sub3_17.method15904(i_7, i_8, Class504.method8389(i_7, i_8, Class272.anInt3331, (byte) 20) - i_23, i_24 + client.cycles);
							client.aClass482_7333.append(new Class282_Sub50_Sub16(class521_sub1_sub1_sub3_17), -430462117);
						}
					} else if (TilestreamPacket.aClass364_4214 == tilestreampacket_0) {
						i_3 = rsbitsbuffer_2.readUnsignedByte();
						i_21 = (i_3 >> 4 & 0x7) + SceneObjectType.anInt5495;
						i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
						i_6 = rsbitsbuffer_2.readUnsignedShort();
						if (i_6 == 65535) {
							i_6 = -1;
						}
						i_7 = rsbitsbuffer_2.readUnsignedByte();
						i_8 = i_7 >> 4 & 0xf;
						i_9 = i_7 & 0x7;
						i_10 = rsbitsbuffer_2.readUnsignedByte();
						i_11 = rsbitsbuffer_2.readUnsignedByte();
						i_23 = rsbitsbuffer_2.readUnsignedShort();
						if (IndexLoaders.MAP_REGION_DECODER.method4419(-1875813222) != Class256.aClass256_3153 && i_21 >= 0 && i_5 >= 0 && i_21 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1714570873) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1820425054)) {
							i_24 = i_8 + 1;
							if (VertexNormal.myPlayer.regionBaseX[0] >= i_21 - i_24 && VertexNormal.myPlayer.regionBaseX[0] <= i_21 + i_24 && VertexNormal.myPlayer.regionBaseY[0] >= i_5 - i_24 && VertexNormal.myPlayer.regionBaseY[0] <= i_24 + i_5) {
								Class383.method6509(i_6, i_9, i_10, i_11, i_8 + (Class272.anInt3331 << 24) + (i_5 << 8) + (i_21 << 16), i_23);
							}
						}
					} else if (TilestreamPacket.aClass364_4205 == tilestreampacket_0) {
						i_3 = rsbitsbuffer_2.readUnsignedShort();
						i_21 = rsbitsbuffer_2.readUnsignedByte();
						CoordGrid coordgrid_25 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
						i_6 = (i_21 & 0x7) + Class158_Sub1_Sub2.anInt10131;
						i_7 = i_6 + coordgrid_25.y;
						i_8 = (i_21 >> 4 & 0x7) + SceneObjectType.anInt5495;
						i_9 = i_8 + coordgrid_25.x;
						i_10 = rsbitsbuffer_2.readUnsignedShortLE128();
						i_11 = rsbitsbuffer_2.readUnsignedShortLE128();
						if (i_3 != client.anInt7315) {
							boolean bool_40 = i_8 >= 0 && i_6 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-550020806) && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1767012747);
							if (bool_40 || IndexLoaders.MAP_REGION_DECODER.method4419(-1899363566).method4401()) {
								Class353.method6209(Class272.anInt3331, i_9, i_7, new Class282_Sub34(i_11, i_10), 773061896);
								if (bool_40) {
									Class434_Sub1.method12760(Class272.anInt3331, i_8, i_6);
								}
							}
						}
					} else if (TilestreamPacket.aClass364_4213 == tilestreampacket_0) {
						i_3 = rsbitsbuffer_2.readUnsignedByte128();
						i_21 = i_3 >> 2;
						i_5 = i_3 & 0x3;
						i_6 = client.anIntArray7230[i_21];
						i_7 = rsbitsbuffer_2.readUnsignedByte();
						i_8 = (i_7 >> 4 & 0x7) + SceneObjectType.anInt5495;
						i_9 = (i_7 & 0x7) + Class158_Sub1_Sub2.anInt10131;
						if (IndexLoaders.MAP_REGION_DECODER.method4419(-1974292488).method4401() || i_8 >= 0 && i_9 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1428692167) && i_9 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-2096834193)) {
							Class299.method5313(Class272.anInt3331, i_8, i_9, i_6, -1, i_21, i_5);
						}
					} else if (TilestreamPacket.aClass364_4207 == tilestreampacket_0) {
						i_3 = rsbitsbuffer_2.readUnsignedByteC();
						coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
						i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
						i_6 = i_5 + coordgrid_4.y;
						i_7 = (i_3 >> 4 & 0x7) + SceneObjectType.anInt5495;
						i_8 = i_7 + coordgrid_4.x;
						i_9 = rsbitsbuffer_2.readUnsignedShortLE128();
						Class282_Sub29 class282_sub29_39 = (Class282_Sub29) client.aClass465_7414.get((long) (Class272.anInt3331 << 28 | i_6 << 14 | i_8));
						if (class282_sub29_39 != null) {
							for (Class282_Sub34 class282_sub34_26 = (Class282_Sub34) class282_sub29_39.aClass482_7708.head((byte) 19); class282_sub34_26 != null; class282_sub34_26 = (Class282_Sub34) class282_sub29_39.aClass482_7708.next(715558625)) {
								if ((i_9 & 0x7fff) == class282_sub34_26.anInt7853) {
									class282_sub34_26.remove();
									break;
								}
							}
							if (class282_sub29_39.aClass482_7708.hasNext(2087735245)) {
								class282_sub29_39.remove();
							}
							if (i_7 >= 0 && i_5 >= 0 && i_7 < IndexLoaders.MAP_REGION_DECODER.getSizeX(793956639) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-539075068)) {
								Class434_Sub1.method12760(Class272.anInt3331, i_7, i_5);
							}
						}
					} else {
						int i_18;
						int i_30;
						if (TilestreamPacket.aClass364_4209 == tilestreampacket_0) {
							i_3 = rsbitsbuffer_2.readInt();
							ObjectDefinitions objectdefinitions_32 = IndexLoaders.MAP_REGION_DECODER.method4436(-1701060227).getObjectDefinitions(i_3);
							i_5 = rsbitsbuffer_2.readUnsignedByte128();
							i_6 = i_5 >> 2;
							i_7 = client.anIntArray7230[i_6];
							i_8 = rsbitsbuffer_2.readUnsignedByte();
							i_9 = rsbitsbuffer_2.readUnsignedByte128();
							i_10 = (i_9 >> 4 & 0x7) + SceneObjectType.anInt5495;
							i_11 = (i_9 & 0x7) + Class158_Sub1_Sub2.anInt10131;
							if (i_6 == SceneObjectType.GROUND_INTERACT.type) {
								i_6 = SceneObjectType.SCENERY_INTERACT.type;
							}
							i_23 = 0;
							if (objectdefinitions_32.types != null) {
								i_24 = -1;
								for (i_14 = 0; i_14 < objectdefinitions_32.types.length; i_14++) {
									if (i_6 == objectdefinitions_32.types[i_14]) {
										i_24 = i_14;
										break;
									}
								}
								i_23 = objectdefinitions_32.modelIds[i_24].length;
							}
							i_24 = 0;
							if (objectdefinitions_32.modifiedColors != null) {
								i_24 = objectdefinitions_32.modifiedColors.length;
							}
							i_14 = 0;
							if (objectdefinitions_32.modifiedTextures != null) {
								i_14 = objectdefinitions_32.modifiedTextures.length;
							}
							if ((i_8 & 0x1) == 1) {
								Class489.method8217(Class272.anInt3331, i_10, i_11, i_7, i_3, i_6, (Class476) null, (byte) -37);
							} else {
								int[] ints_28 = null;
								if ((i_8 & 0x2) == 2) {
									ints_28 = new int[i_23];
									for (i_16 = 0; i_16 < i_23; i_16++) {
										ints_28[i_16] = rsbitsbuffer_2.readInt();
									}
								}
								short[] shorts_29 = null;
								if ((i_8 & 0x4) == 4) {
									shorts_29 = new short[i_24];
									for (i_30 = 0; i_30 < i_24; i_30++) {
										shorts_29[i_30] = (short) rsbitsbuffer_2.readUnsignedShort();
									}
								}
								short[] shorts_37 = null;
								if ((i_8 & 0x8) == 8) {
									shorts_37 = new short[i_14];
									for (i_18 = 0; i_18 < i_14; i_18++) {
										shorts_37[i_18] = (short) rsbitsbuffer_2.readUnsignedShort();
									}
								}
								Class489.method8217(Class272.anInt3331, i_10, i_11, i_7, i_3, i_6, new Class476(Class282_Sub31.aLong7777, ints_28, shorts_29, shorts_37), (byte) 79);
								++Class282_Sub31.aLong7777;
							}
						} else if (TilestreamPacket.TILE_MESSAGE == tilestreampacket_0) {
							rsbitsbuffer_2.readUnsignedByte();
							i_3 = rsbitsbuffer_2.readUnsignedByte();
							i_21 = (i_3 >> 4 & 0x7) + SceneObjectType.anInt5495;
							i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
							i_6 = rsbitsbuffer_2.readUnsignedShort();
							i_7 = rsbitsbuffer_2.readUnsignedByte();
							i_8 = rsbitsbuffer_2.read24BitUnsignedInteger();
							String string_27 = rsbitsbuffer_2.readString();
							if (IndexLoaders.MAP_REGION_DECODER.method4419(-2041304970) != Class256.aClass256_3153) {
								ParticleProducerDefinition.method1161(Class272.anInt3331, i_21, i_5, i_7, i_6, i_8, string_27, (short) 17078);
							}
						} else if (TilestreamPacket.aClass364_4217 == tilestreampacket_0) {
							i_3 = rsbitsbuffer_2.readUnsignedByte();
							i_21 = (i_3 >> 4 & 0x7) + SceneObjectType.anInt5495;
							i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.anInt10131;
							i_6 = rsbitsbuffer_2.readUnsignedShort();
							if (i_6 == 65535) {
								i_6 = -1;
							}
							i_7 = rsbitsbuffer_2.readUnsignedByte();
							i_8 = i_7 >> 4 & 0xf;
							i_9 = i_7 & 0x7;
							i_10 = rsbitsbuffer_2.readUnsignedByte();
							i_11 = rsbitsbuffer_2.readUnsignedByte();
							i_23 = rsbitsbuffer_2.readUnsignedShort();
							boolean bool_41 = rsbitsbuffer_2.readUnsignedByte() == 1;
							if (IndexLoaders.MAP_REGION_DECODER.method4419(-2004979271) != Class256.aClass256_3153 && i_21 >= 0 && i_5 >= 0 && i_21 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-274697283) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1740682056)) {
								i_14 = i_8 + 1;
								if (VertexNormal.myPlayer.regionBaseX[0] >= i_21 - i_14 && VertexNormal.myPlayer.regionBaseX[0] <= i_21 + i_14 && VertexNormal.myPlayer.regionBaseY[0] >= i_5 - i_14 && VertexNormal.myPlayer.regionBaseY[0] <= i_14 + i_5) {
									Class256.method4414(i_6, i_9, i_10, i_11, i_8 + (Class272.anInt3331 << 24) + (i_5 << 8) + (i_21 << 16), bool_41, i_23);
								}
							}
						} else if (TilestreamPacket.aClass364_4216 == tilestreampacket_0) {
							i_3 = rsbitsbuffer_2.readUnsigned128Byte();
							i_21 = i_3 >> 2;
							i_5 = i_3 & 0x3;
							i_6 = client.anIntArray7230[i_21];
							i_7 = rsbitsbuffer_2.readUnsigned128Byte();
							i_8 = (i_7 >> 4 & 0x7) + SceneObjectType.anInt5495;
							i_9 = (i_7 & 0x7) + Class158_Sub1_Sub2.anInt10131;
							i_10 = rsbitsbuffer_2.readIntLE();
							if (IndexLoaders.MAP_REGION_DECODER.method4419(-2057621455) != Class256.aClass256_3153) {
								Class9.animateObject(Class272.anInt3331, i_8, i_9, i_6, i_21, i_5, i_10);
							}
						} else if (TilestreamPacket.CREATE_GROUND_ITEM == tilestreampacket_0) {
							i_3 = rsbitsbuffer_2.readUnsignedShortLE128();
							i_21 = rsbitsbuffer_2.readUnsignedShort128();
							i_5 = rsbitsbuffer_2.readUnsignedByteC();
							CoordGrid coordgrid_31 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
							i_7 = (i_5 & 0x7) + Class158_Sub1_Sub2.anInt10131;
							i_8 = i_7 + coordgrid_31.y;
							i_9 = (i_5 >> 4 & 0x7) + SceneObjectType.anInt5495;
							i_10 = i_9 + coordgrid_31.x;
							boolean bool_36 = i_9 >= 0 && i_7 >= 0 && i_9 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1965458843) && i_7 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1811316937);
							if (bool_36 || IndexLoaders.MAP_REGION_DECODER.method4419(-2008774639).method4401()) {
								Class353.method6209(Class272.anInt3331, i_10, i_8, new Class282_Sub34(i_21, i_3), 1102559151);
								if (bool_36) {
									Class434_Sub1.method12760(Class272.anInt3331, i_9, i_7);
								}
							}
						} else if (TilestreamPacket.aClass364_4210 == tilestreampacket_0) {
							i_3 = rsbitsbuffer_2.readUnsignedByte();
							i_21 = (i_3 >> 4 & 0xf) + SceneObjectType.anInt5495 * 2;
							i_5 = Class158_Sub1_Sub2.anInt10131 * 2 + (i_3 & 0xf);
							i_6 = rsbitsbuffer_2.readUnsignedByte();
							boolean bool_33 = (i_6 & 0x1) != 0;
							boolean bool_34 = (i_6 & 0x2) != 0;
							i_9 = bool_34 ? i_6 >> 2 : -1;
							i_10 = i_21 + rsbitsbuffer_2.readByte();
							i_11 = i_5 + rsbitsbuffer_2.readByte();
							i_23 = rsbitsbuffer_2.readShort();
							i_24 = rsbitsbuffer_2.readShort();
							i_14 = rsbitsbuffer_2.readUnsignedShort();
							i_15 = rsbitsbuffer_2.readUnsignedByte();
							if (bool_34) {
								i_15 = (byte) i_15;
							} else {
								i_15 *= 4;
							}
							i_16 = rsbitsbuffer_2.readUnsignedByte() * 4;
							i_30 = rsbitsbuffer_2.readUnsignedShort();
							i_18 = rsbitsbuffer_2.readUnsignedShort();
							int i_19 = rsbitsbuffer_2.readUnsignedByte();
							int i_20 = rsbitsbuffer_2.readUnsignedShort();
							if (i_19 == 255) {
								i_19 = -1;
							}
							if (IndexLoaders.MAP_REGION_DECODER.method4419(-2018534452) != Class256.aClass256_3153 && i_21 >= 0 && i_5 >= 0 && i_21 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1734176778) * 2 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1519408769) * 2 && i_10 >= 0 && i_11 >= 0 && i_10 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-959037550) * 2 && i_11 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-722556858) * 2 && i_14 != 65535) {
								i_21 *= 256;
								i_5 *= 256;
								i_10 *= 256;
								i_11 *= 256;
								i_15 <<= 2;
								i_16 <<= 2;
								i_20 <<= 2;
								Class438.method7335(i_14, i_23, i_24, i_9, i_15, i_16, i_21, i_5, i_10, i_11, i_30, i_18, i_19, i_20, bool_33);
							}
						} else if (TilestreamPacket.aClass364_4208 == tilestreampacket_0) {
							i_3 = rsbitsbuffer_2.readInt();
							i_21 = rsbitsbuffer_2.readUnsigned128Byte();
							i_5 = (i_21 >> 4 & 0x7) + SceneObjectType.anInt5495;
							i_6 = (i_21 & 0x7) + Class158_Sub1_Sub2.anInt10131;
							i_7 = rsbitsbuffer_2.readUnsigned128Byte();
							i_8 = i_7 >> 2;
							i_9 = i_7 & 0x3;
							i_10 = client.anIntArray7230[i_8];
							if (IndexLoaders.MAP_REGION_DECODER.method4419(-2043341946).method4401() || i_5 >= 0 && i_6 >= 0 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-1768152965) && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1500234910)) {
								Class299.method5313(Class272.anInt3331, i_5, i_6, i_10, i_3, i_8, i_9);
							}
						} else {
							Class151.method2594("" + tilestreampacket_0, new RuntimeException(), (byte) -3);
							Class438.method7333(false, 2095125734);
						}
					}
				}
			}
		}
	}

	public static void method3142(int i_0) {
		if (NamedFileReference.method867(1523656747) != Class279.aClass279_3368) {
			try {
				String string_1 = Class282_Sub44.anApplet8065.getParameter(Class358.aClass358_4144.aString4159);
				int i_2 = (int) (TextureDetails.time() / 86400000L) - 11745;
				String string_3 = "usrdob=" + i_2 + "; version=1; path=/; domain=" + string_1;
				Class441.method7376(Class282_Sub44.anApplet8065, "document.cookie=\"" + string_3 + "\"", (byte) 18);
			} catch (Throwable throwable_4) {
				;
			}
		}
	}
}
