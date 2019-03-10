import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class346 {

	public int[] anIntArray4046;

	public QuickchatDefinitions aClass282_Sub50_Sub9_4047;

	public int anInt4048;

	static NodeCollection aClass482_4049;

	public static byte[] method6154(Object object_0, boolean bool_1, byte b_2) {
		if (object_0 == null) {
			return null;
		} else if (object_0 instanceof byte[]) {
			byte[] bytes_5 = (byte[]) object_0;
			return bool_1 ? Arrays.copyOf(bytes_5, bytes_5.length) : bytes_5;
		} else if (object_0 instanceof ByteBuffer) {
			ByteBuffer bytebuffer_3 = (ByteBuffer) object_0;
			byte[] bytes_4 = new byte[bytebuffer_3.capacity()];
			bytebuffer_3.position(0);
			bytebuffer_3.get(bytes_4);
			return bytes_4;
		} else {
			throw new IllegalArgumentException();
		}
	}

	static boolean method6155(RsBitsBuffer rsbitsbuffer_0, int i_1, short s_2) {
		int i_3 = rsbitsbuffer_0.readBits(2, (byte) -19);
		int i_4;
		int i_5;
		int i_9;
		int i_10;
		int i_11;
		if (i_3 == 0) {
			if (rsbitsbuffer_0.readBits(1, (byte) 91) != 0) {
				method6155(rsbitsbuffer_0, i_1, (short) 371);
			}
			i_4 = rsbitsbuffer_0.readBits(6, (byte) 50);
			i_5 = rsbitsbuffer_0.readBits(6, (byte) -76);
			boolean bool_18 = rsbitsbuffer_0.readBits(1, (byte) 68) == 1;
			if (bool_18) {
				Class197.anIntArray2435[++Class197.anInt2434 - 1] = i_1;
			}
			if (client.players[i_1] != null) {
				throw new RuntimeException();
			} else {
				Class4 class4_7 = Class197.aClass4Array2430[i_1];
				Player player_8 = client.players[i_1] = new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1638773780));
				player_8.anInt10314 = i_1;
				if (Class197.aClass282_Sub35Array2428[i_1] != null) {
					player_8.decodeAppearance(Class197.aClass282_Sub35Array2428[i_1]);
				}
				player_8.method15791(class4_7.anInt30, true, (byte) -43);
				player_8.faceEntity = class4_7.anInt32;
				i_9 = class4_7.anInt31;
				i_10 = i_9 >> 28;
				i_11 = i_9 >> 14 & 0xff;
				int i_12 = i_9 & 0xff;
				CoordGrid coordgrid_13 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1961926059);
				int i_14 = i_4 + (i_11 << 6) - coordgrid_13.x;
				int i_15 = i_5 + (i_12 << 6) - coordgrid_13.y;
				player_8.aBool10571 = class4_7.aBool29;
				player_8.aBool10550 = class4_7.aBool33;
				player_8.aByteArray10365[0] = Class197.playerMovementTypes[i_1];
				player_8.plane = player_8.aByte7968 = (byte) i_10;
				if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).is0x2(i_14, i_15, 1509882915)) {
					player_8.aByte7968 = (byte) (player_8.aByte7968 + 1);
				}
				player_8.method16130(i_14, i_15, -2001556911);
				player_8.aBool10568 = false;
				Class197.aClass4Array2430[i_1] = null;
				return true;
			}
		} else if (i_3 == 1) {
			i_4 = rsbitsbuffer_0.readBits(2, (byte) -68);
			i_5 = Class197.aClass4Array2430[i_1].anInt31;
			Class197.aClass4Array2430[i_1].anInt31 = (i_5 & 0xfffffff) + (((i_5 >> 28) + i_4 & 0x3) << 28);
			return false;
		} else {
			int i_6;
			int i_16;
			int i_17;
			if (i_3 == 2) {
				i_4 = rsbitsbuffer_0.readBits(5, (byte) 14);
				i_5 = i_4 >> 3;
				i_6 = i_4 & 0x7;
				i_16 = Class197.aClass4Array2430[i_1].anInt31;
				i_17 = (i_16 >> 28) + i_5 & 0x3;
				i_9 = i_16 >> 14 & 0xff;
				i_10 = i_16 & 0xff;
				if (i_6 == 0) {
					--i_9;
					--i_10;
				}
				if (i_6 == 1) {
					--i_10;
				}
				if (i_6 == 2) {
					++i_9;
					--i_10;
				}
				if (i_6 == 3) {
					--i_9;
				}
				if (i_6 == 4) {
					++i_9;
				}
				if (i_6 == 5) {
					--i_9;
					++i_10;
				}
				if (i_6 == 6) {
					++i_10;
				}
				if (i_6 == 7) {
					++i_9;
					++i_10;
				}
				Class197.aClass4Array2430[i_1].anInt31 = (i_9 << 14) + i_10 + (i_17 << 28);
				return false;
			} else {
				i_4 = rsbitsbuffer_0.readBits(18, (byte) -11);
				i_5 = i_4 >> 16;
				i_6 = i_4 >> 8 & 0xff;
				i_16 = i_4 & 0xff;
				i_17 = Class197.aClass4Array2430[i_1].anInt31;
				i_9 = (i_17 >> 28) + i_5 & 0x3;
				i_10 = i_6 + (i_17 >> 14) & 0xff;
				i_11 = i_16 + i_17 & 0xff;
				Class197.aClass4Array2430[i_1].anInt31 = (i_10 << 14) + i_11 + (i_9 << 28);
				return false;
			}
		}
	}

	public static Class411 method6156(int i_0, int i_1) {
		Class411[] arr_2 = Class451.method7519((short) 19418);
		Class411[] arr_3 = arr_2;
		for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class411 class411_5 = arr_3[i_4];
			if (i_0 == class411_5.anInt4957) {
				return class411_5;
			}
		}
		return null;
	}

	static String method6157(IComponentDefinitions icomponentdefinitions_0, int i_1) {
		return client.method11633(icomponentdefinitions_0).getUseOptionFlags() == 0 ? null : (icomponentdefinitions_0.aString1338 != null && icomponentdefinitions_0.aString1338.trim().length() != 0 ? icomponentdefinitions_0.aString1338 : (client.aBool7168 ? "Hidden-use" : null));
	}

	static final void method6158(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 908211513) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1415 = Class351.method6193(string_4, cs2executor_2, 1001457907);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static final void method6159(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_6 = i_2 - i_0;
		int i_7 = i_3 - i_1;
		if (i_6 == 0) {
			if (i_7 != 0) {
				Class468_Sub15.method12746(i_0, i_1, i_3, i_4, 1519996212);
			}
		} else if (i_7 == 0) {
			CS2Executor.method11250(i_0, i_2, i_1, i_4, -789142799);
		} else {
			int i_8 = (i_7 << 12) / i_6;
			int i_9 = i_1 - (i_0 * i_8 >> 12);
			int i_10;
			int i_11;
			if (i_0 < Class532_Sub2.anInt7071) {
				i_10 = (i_8 * Class532_Sub2.anInt7071 >> 12) + i_9;
				i_11 = Class532_Sub2.anInt7071;
			} else if (i_0 > Class532_Sub2.anInt7069) {
				i_10 = (i_8 * Class532_Sub2.anInt7069 >> 12) + i_9;
				i_11 = Class532_Sub2.anInt7069;
			} else {
				i_10 = i_1;
				i_11 = i_0;
			}
			int i_12;
			int i_13;
			if (i_2 < Class532_Sub2.anInt7071) {
				i_12 = (i_8 * Class532_Sub2.anInt7071 >> 12) + i_9;
				i_13 = Class532_Sub2.anInt7071;
			} else if (i_2 > Class532_Sub2.anInt7069) {
				i_12 = (i_8 * Class532_Sub2.anInt7069 >> 12) + i_9;
				i_13 = Class532_Sub2.anInt7069;
			} else {
				i_12 = i_3;
				i_13 = i_2;
			}
			if (i_10 < Class532_Sub2.anInt7070) {
				i_10 = Class532_Sub2.anInt7070;
				i_11 = (Class532_Sub2.anInt7070 - i_9 << 12) / i_8;
			} else if (i_10 > Class532_Sub2.anInt7068) {
				i_10 = Class532_Sub2.anInt7068;
				i_11 = (Class532_Sub2.anInt7068 - i_9 << 12) / i_8;
			}
			if (i_12 < Class532_Sub2.anInt7070) {
				i_12 = Class532_Sub2.anInt7070;
				i_13 = (Class532_Sub2.anInt7070 - i_9 << 12) / i_8;
			} else if (i_12 > Class532_Sub2.anInt7068) {
				i_12 = Class532_Sub2.anInt7068;
				i_13 = (Class532_Sub2.anInt7068 - i_9 << 12) / i_8;
			}
			AnimationIndexLoader.method11220(i_11, i_10, i_13, i_12, i_4, (byte) 12);
		}
	}

	static void method6160(int i_0) {
		Class9.lobbyStage = 140;
		Class9.aClass184_73 = client.aClass184_7218;
		if (client.aByteArray7152 != null) {
			RsByteBuffer rsbytebuffer_1 = new RsByteBuffer(client.aByteArray7152);
			Class9.aLong77 = rsbytebuffer_1.readLong(1238599154);
			Class9.aLong86 = rsbytebuffer_1.readLong(169037294);
		}
		if (Class9.aLong77 < 0L) {
			Class8_Sub1.method13784(35, 776111623);
		} else {
			Class455.method7558(false, true, "", "", Class9.aLong77);
		}
	}

	static void method6161(boolean bool_0, int i_1) {
		if (bool_0) {
			if (client.anInt7349 != -1) {
				Class337.unloadInterface(client.anInt7349, -650534239);
			}
			for (Class282_Sub44 class282_sub44_2 = (Class282_Sub44) client.aClass465_7442.method7750(-649341183); class282_sub44_2 != null; class282_sub44_2 = (Class282_Sub44) client.aClass465_7442.method7751((byte) 6)) {
				if (!class282_sub44_2.method4994(-2135855077)) {
					class282_sub44_2 = (Class282_Sub44) client.aClass465_7442.method7750(439080271);
					if (class282_sub44_2 == null) {
						break;
					}
				}
				Class351.method6196(class282_sub44_2, true, false, -1457682699);
			}
			client.anInt7349 = -1;
			client.aClass465_7442 = new IterableNodeMap(8);
			MeshModifier.method7041((byte) -97);
			client.anInt7349 = Class58.aClass529_527.anInt7027;
			Class516.method8867(false, -905479502);
			IncomingPacket.method6378(-1538407760);
			Class150.method2582(client.anInt7349, (int[]) null, -1429871398);
		}
		Class9.aBool71 = true;
	}
}
