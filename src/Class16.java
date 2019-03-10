public class Class16 {

	static int anInt135;

	static int anInt136;

	static int anInt137;

	static NativeSprite[] aClass160Array138;

	public static FontMetrics aClass414_139;

	static int p11FullIndex;

	static int anInt141;

	static int anInt142;

	static int anInt143;

	public static FontRenderer aClass8_144;

	static NativeSprite[] aClass160Array145;

	static NativeSprite aClass160_146;

	Class16() throws Throwable {
		throw new Error();
	}

	static Class96 method562(RsByteBuffer rsbytebuffer_0, int i_1) {
		int i_2 = rsbytebuffer_0.readUnsignedByte();
		Class411 class411_3 = Class346.method6156(i_2, 2101068179);
		Object obj_4 = null;
		switch (class411_3.anInt4956) {
		case 0:
			obj_4 = new Class96_Sub15(rsbytebuffer_0);
			break;
		case 1:
			obj_4 = new Class96_Sub20(rsbytebuffer_0);
			break;
		case 2:
			obj_4 = new Class96_Sub14(rsbytebuffer_0);
		case 3:
		case 7:
		case 21:
		default:
			break;
		case 4:
			obj_4 = new Class96_Sub4(rsbytebuffer_0);
			break;
		case 5:
			obj_4 = new Class96_Sub21(rsbytebuffer_0);
			break;
		case 6:
			obj_4 = new Class96_Sub8(rsbytebuffer_0);
			break;
		case 8:
			obj_4 = new Class96_Sub5(rsbytebuffer_0);
			break;
		case 9:
			obj_4 = new Class96_Sub22(rsbytebuffer_0);
			break;
		case 10:
			obj_4 = new Class96_Sub16(rsbytebuffer_0, false);
			break;
		case 11:
			obj_4 = new Class96_Sub11(rsbytebuffer_0);
			break;
		case 12:
			obj_4 = new Class96_Sub7(rsbytebuffer_0);
			break;
		case 13:
			obj_4 = new Class96_Sub3(rsbytebuffer_0);
			break;
		case 14:
			obj_4 = new Class96_Sub10_Sub2(rsbytebuffer_0);
			break;
		case 15:
			obj_4 = new Class96_Sub19(rsbytebuffer_0, 0, 0);
			break;
		case 16:
			obj_4 = new Class96_Sub1(rsbytebuffer_0);
			break;
		case 17:
			obj_4 = new Class96_Sub17(rsbytebuffer_0);
			break;
		case 18:
			obj_4 = new Class96_Sub9(rsbytebuffer_0);
			break;
		case 19:
			obj_4 = new Class96_Sub19(rsbytebuffer_0, 1, 0);
			break;
		case 20:
			obj_4 = new Class96_Sub6(rsbytebuffer_0);
			break;
		case 22:
			obj_4 = new Class96_Sub12(rsbytebuffer_0);
			break;
		case 23:
			obj_4 = new Class96_Sub13(rsbytebuffer_0);
			break;
		case 24:
			obj_4 = new Class96_Sub19(rsbytebuffer_0, 0, 1);
			break;
		case 25:
			obj_4 = new Class96_Sub10_Sub1(rsbytebuffer_0);
			break;
		case 26:
			obj_4 = new Class96_Sub18(rsbytebuffer_0);
			break;
		case 27:
			obj_4 = new Class96_Sub16(rsbytebuffer_0, true);
			break;
		case 28:
			obj_4 = new Class96_Sub19(rsbytebuffer_0, 1, 1);
			break;
		case 29:
			obj_4 = new Class96_Sub2(rsbytebuffer_0);
			break;
		case 30:
			obj_4 = new Class96_Sub23(rsbytebuffer_0);
		}
		return (Class96) obj_4;
	}

	public static void method566(int i_0) {
		Class260.aClass268Array3232 = new Class268[50];
		Class260.anInt3219 = 0;
	}

	public static final void method567(String string_0, boolean bool_1, byte b_2) {
		if (string_0 != null) {
			if (client.anInt7373 >= 100) {
				LoadingStage.method6681(4, Message.aClass433_5289.translate(Class223.CURRENT_LANGUAGE, -927458536), (byte) 0);
			} else {
				String string_3 = Class383.method6515(string_0, 1942118537);
				if (string_3 != null) {
					int i_4;
					String string_6;
					String string_7;
					for (i_4 = 0; i_4 < client.anInt7373; i_4++) {
						Class10 class10_5 = client.aClass10Array7456[i_4];
						string_6 = Class383.method6515(class10_5.aString115, 1942118537);
						if (string_6 != null && string_6.equals(string_3)) {
							LoadingStage.method6681(4, string_0 + Message.aClass433_5302.translate(Class223.CURRENT_LANGUAGE, -794034411), (byte) 6);
							return;
						}
						if (class10_5.aString116 != null) {
							string_7 = Class383.method6515(class10_5.aString116, 1942118537);
							if (string_7 != null && string_7.equals(string_3)) {
								LoadingStage.method6681(4, string_0 + Message.aClass433_5302.translate(Class223.CURRENT_LANGUAGE, -1228902826), (byte) 24);
								return;
							}
						}
					}
					for (i_4 = 0; i_4 < client.anInt7449; i_4++) {
						Class6 class6_9 = client.aClass6Array7452[i_4];
						string_6 = Class383.method6515(class6_9.aString37, 1942118537);
						if (string_6 != null && string_6.equals(string_3)) {
							LoadingStage.method6681(4, Message.aClass433_5308.translate(Class223.CURRENT_LANGUAGE, -1154046234) + string_0 + Message.aClass433_5192.translate(Class223.CURRENT_LANGUAGE, -627858057), (byte) 53);
							return;
						}
						if (class6_9.aString43 != null) {
							string_7 = Class383.method6515(class6_9.aString43, 1942118537);
							if (string_7 != null && string_7.equals(string_3)) {
								LoadingStage.method6681(4, Message.aClass433_5308.translate(Class223.CURRENT_LANGUAGE, -1770440532) + string_0 + Message.aClass433_5192.translate(Class223.CURRENT_LANGUAGE, -695950851), (byte) 47);
								return;
							}
						}
					}
					if (Class383.method6515(Class84.myPlayer.displayName, 1942118537).equals(string_3)) {
						LoadingStage.method6681(4, Message.aClass433_5238.translate(Class223.CURRENT_LANGUAGE, -1399059410), (byte) -31);
					} else {
						Class184 class184_8 = Class468_Sub20.method12807(1039135585);
						TCPMessage tcpmessage_10 = Class271.method4828(OutgoingPacket.aClass379_4578, class184_8.isaac, 732263274);
						tcpmessage_10.buffer.writeByte(ChatLine.getLength(string_0) + 1);
						tcpmessage_10.buffer.writeString(string_0);
						tcpmessage_10.buffer.writeByte(bool_1 ? 1 : 0);
						class184_8.method3049(tcpmessage_10, -1139033433);
					}
				}
			}
		}
	}

	static final void method568(int i_0, int i_1, int i_2, int i_3, short s_4) {
		if (i_0 > i_1) {
			Class232.method3922(Class532_Sub2.anIntArrayArray7072[i_2], i_1, i_0, i_3, (byte) -16);
		} else {
			Class232.method3922(Class532_Sub2.anIntArrayArray7072[i_2], i_0, i_1, i_3, (byte) 7);
		}
	}
}
