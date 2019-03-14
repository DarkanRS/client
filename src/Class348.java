public class Class348 {

	long aLong4073;

	int anInt4060 = -1;

	NodeCollection aClass482_4062 = new NodeCollection();

	void method6171(RsByteBuffer rsbytebuffer_1, byte b_2) {
		this.aLong4073 = rsbytebuffer_1.readLong();
		this.anInt4060 = rsbytebuffer_1.readInt();
		for (int i_3 = rsbytebuffer_1.readUnsignedByte(); i_3 != 0; i_3 = rsbytebuffer_1.readUnsignedByte()) {
			Object obj_4;
			if (i_3 == 3) {
				obj_4 = new Class282_Sub17_Sub10(this);
			} else if (i_3 == 1) {
				obj_4 = new Class282_Sub17_Sub1(this);
			} else if (i_3 == 13) {
				obj_4 = new Class282_Sub17_Sub9(this);
			} else if (i_3 == 4) {
				obj_4 = new Class282_Sub17_Sub6(this);
			} else if (i_3 == 6) {
				obj_4 = new Class282_Sub17_Sub8(this);
			} else if (i_3 == 5) {
				obj_4 = new Class282_Sub17_Sub2(this);
			} else if (i_3 == 2) {
				obj_4 = new Class282_Sub17_Sub7(this);
			} else if (i_3 == 7) {
				obj_4 = new Class282_Sub17_Sub12(this);
			} else if (i_3 == 8) {
				obj_4 = new Class282_Sub17_Sub13(this);
			} else if (i_3 == 9) {
				obj_4 = new Class282_Sub17_Sub11(this);
			} else if (i_3 == 10) {
				obj_4 = new Class282_Sub17_Sub5(this);
			} else if (i_3 == 11) {
				obj_4 = new Class282_Sub17_Sub4(this);
			} else {
				if (i_3 != 12) {
					throw new RuntimeException("");
				}
				obj_4 = new Class282_Sub17_Sub3(this);
			}
			((Class282_Sub17) obj_4).method12250(rsbytebuffer_1, -1771896031);
			this.aClass482_4062.append((Node) obj_4, -575060880);
		}
	}

	public void method6173(Class61 class61_1, int i_2) {
		if (class61_1.aLong631 == this.aLong4073 && this.anInt4060 == class61_1.anInt637) {
			for (Class282_Sub17 class282_sub17_3 = (Class282_Sub17) this.aClass482_4062.head((byte) 23); class282_sub17_3 != null; class282_sub17_3 = (Class282_Sub17) this.aClass482_4062.next(983749552)) {
				class282_sub17_3.method12251(class61_1, -429954850);
			}
			++class61_1.anInt637;
		} else {
			throw new RuntimeException("");
		}
	}

	public Class348(RsByteBuffer rsbytebuffer_1) {
		this.method6171(rsbytebuffer_1, (byte) 46);
	}

	public static void method6175(boolean bool_0, int i_1) {
		if (bool_0) {
			if (client.anInt7349 != -1) {
				Class337.unloadInterface(client.anInt7349, -1669420859);
			}
			for (Class282_Sub44 class282_sub44_2 = (Class282_Sub44) client.aClass465_7442.method7750(1087054250); class282_sub44_2 != null; class282_sub44_2 = (Class282_Sub44) client.aClass465_7442.method7751((byte) 11)) {
				if (!class282_sub44_2.method4994(1167502204)) {
					class282_sub44_2 = (Class282_Sub44) client.aClass465_7442.method7750(-848491079);
					if (class282_sub44_2 == null) {
						break;
					}
				}
				Class351.method6196(class282_sub44_2, true, false, -2131194694);
			}
			client.anInt7349 = -1;
			client.aClass465_7442 = new IterableNodeMap(8);
			MeshModifier.method7041((byte) -6);
			client.anInt7349 = Class58.aClass529_527.anInt7036;
			Class516.method8867(false, -905479502);
			IncomingPacket.method6378(-1538407760);
			Class150.method2582(client.anInt7349, (int[]) null, -1484331524);
		}
		Class468_Sub12.method12708(1506818197);
		Class9.aBool71 = false;
		Class509.method8739(900001069);
		client.anInt7427 = -1;
		UnderlayIndexLoader.method8036(client.anInt7340, (byte) 4);
		Class84.myPlayer = new Player((SceneObjectManager) null);
		Class84.myPlayer.method11172((float) (IndexLoaders.MAP_REGION_DECODER.getSizeX(1639359144) * 512 / 2), 0.0F, (float) (IndexLoaders.MAP_REGION_DECODER.getSizeY(-1549308154) * 512 / 2));
		Class84.myPlayer.regionBaseX[0] = IndexLoaders.MAP_REGION_DECODER.getSizeX(-1586336378) / 2;
		Class84.myPlayer.regionBaseY[0] = IndexLoaders.MAP_REGION_DECODER.getSizeY(-1038237242) / 2;
		Class246.anInt3029 = 0;
		Class31.anInt361 = 0;
		if (NativeLibraryLoader.anInt3240 == 5) {
			Class31.anInt361 = Class296.anInt3534 << 9;
			Class246.anInt3029 = Class282_Sub44.anInt8064 << 9;
		} else {
			SpotAnimIndexLoader.method8860((byte) -92);
		}
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(-367591790);
	}

	static boolean method6176(int i_0, int i_1) {
		return i_0 == 44 || i_0 == 45 || i_0 == 46 || i_0 == 47 || i_0 == 48 || i_0 == 49 || i_0 == 50 || i_0 == 51 || i_0 == 52 || i_0 == 53 || i_0 == 15;
	}
}
