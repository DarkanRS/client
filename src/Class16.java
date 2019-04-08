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

	static CutsceneAction method562(RsByteBuffer buffer) {
		int i_2 = buffer.readUnsignedByte();
		CutsceneActionType type = Class346.method6156(i_2);
		Object action = null;
		switch (type.id) {
		case 0:
			action = new Class96_Sub15(buffer);
			break;
		case 1:
			action = new Class96_Sub20(buffer);
			break;
		case 2:
			action = new Class96_Sub14(buffer);
		case 3:
		case 7:
		case 21:
		default:
			break;
		case 4:
			action = new Class96_Sub4(buffer);
			break;
		case 5:
			action = new Class96_Sub21(buffer);
			break;
		case 6:
			action = new Class96_Sub8(buffer);
			break;
		case 8:
			action = new Class96_Sub5(buffer);
			break;
		case 9:
			action = new Class96_Sub22(buffer);
			break;
		case 10:
			action = new Class96_Sub16(buffer, false);
			break;
		case 11:
			action = new Class96_Sub11(buffer);
			break;
		case 12:
			action = new Class96_Sub7(buffer);
			break;
		case 13:
			action = new Class96_Sub3(buffer);
			break;
		case 14:
			action = new Class96_Sub10_Sub2(buffer);
			break;
		case 15:
			action = new ProjectileCutsceneAction(buffer, 0, 0);
			break;
		case 16:
			action = new Class96_Sub1(buffer);
			break;
		case 17:
			action = new Class96_Sub17(buffer);
			break;
		case 18:
			action = new Class96_Sub9(buffer);
			break;
		case 19:
			action = new ProjectileCutsceneAction(buffer, 1, 0);
			break;
		case 20:
			action = new Class96_Sub6(buffer);
			break;
		case 22:
			action = new Class96_Sub12(buffer);
			break;
		case 23:
			action = new Class96_Sub13(buffer);
			break;
		case 24:
			action = new ProjectileCutsceneAction(buffer, 0, 1);
			break;
		case 25:
			action = new Class96_Sub10_Sub1(buffer);
			break;
		case 26:
			action = new Class96_Sub18(buffer);
			break;
		case 27:
			action = new Class96_Sub16(buffer, true);
			break;
		case 28:
			action = new ProjectileCutsceneAction(buffer, 1, 1);
			break;
		case 29:
			action = new Class96_Sub2(buffer);
			break;
		case 30:
			action = new Class96_Sub23(buffer);
		}
		return (CutsceneAction) action;
	}

	public static void method566(int i_0) {
		Class260.aClass268Array3232 = new Class268[50];
		Class260.anInt3219 = 0;
	}

	public static final void method567(String string_0, boolean bool_1, byte b_2) {
		if (string_0 != null) {
			if (client.anInt7373 >= 100) {
				LoadingStage.method6681(Message.aClass433_5289.translate(Class223.CURRENT_LANGUAGE, -927458536), (byte) 0);
			} else {
				String string_3 = Class383.method6515(string_0);
				if (string_3 != null) {
					int i_4;
					String string_6;
					String string_7;
					for (i_4 = 0; i_4 < client.anInt7373; i_4++) {
						Class10 class10_5 = client.aClass10Array7456[i_4];
						string_6 = Class383.method6515(class10_5.aString115);
						if (string_6 != null && string_6.equals(string_3)) {
							LoadingStage.method6681(string_0 + Message.aClass433_5302.translate(Class223.CURRENT_LANGUAGE, -794034411), (byte) 6);
							return;
						}
						if (class10_5.aString116 != null) {
							string_7 = Class383.method6515(class10_5.aString116);
							if (string_7 != null && string_7.equals(string_3)) {
								LoadingStage.method6681(string_0 + Message.aClass433_5302.translate(Class223.CURRENT_LANGUAGE, -1228902826), (byte) 24);
								return;
							}
						}
					}
					for (i_4 = 0; i_4 < client.anInt7449; i_4++) {
						Class6 class6_9 = client.aClass6Array7452[i_4];
						string_6 = Class383.method6515(class6_9.aString37);
						if (string_6 != null && string_6.equals(string_3)) {
							LoadingStage.method6681(Message.aClass433_5308.translate(Class223.CURRENT_LANGUAGE, -1154046234) + string_0 + Message.aClass433_5192.translate(Class223.CURRENT_LANGUAGE, -627858057), (byte) 53);
							return;
						}
						if (class6_9.aString43 != null) {
							string_7 = Class383.method6515(class6_9.aString43);
							if (string_7 != null && string_7.equals(string_3)) {
								LoadingStage.method6681(Message.aClass433_5308.translate(Class223.CURRENT_LANGUAGE, -1770440532) + string_0 + Message.aClass433_5192.translate(Class223.CURRENT_LANGUAGE, -695950851), (byte) 47);
								return;
							}
						}
					}
					if (Class383.method6515(VertexNormal.myPlayer.displayName).equals(string_3)) {
						LoadingStage.method6681(Message.aClass433_5238.translate(Class223.CURRENT_LANGUAGE, -1399059410), (byte) -31);
					} else {
						BufferedConnectionContext class184_8 = Class468_Sub20.method12807(1039135585);
						TCPPacket tcpmessage_10 = Class271.method4828(OutgoingPacket.aClass379_4578, class184_8.isaac, 732263274);
						tcpmessage_10.buffer.writeByte(ChatLine.getLength(string_0) + 1);
						tcpmessage_10.buffer.writeString(string_0);
						tcpmessage_10.buffer.writeByte(bool_1 ? 1 : 0);
						class184_8.queuePacket(tcpmessage_10);
					}
				}
			}
		}
	}

	static final void method568(int i_0, int i_1, int i_2, int i_3) {
		if (i_0 > i_1) {
			Class232.method3922(Class532_Sub2.anIntArrayArray7072[i_2], i_1, i_0, i_3, (byte) -16);
		} else {
			Class232.method3922(Class532_Sub2.anIntArrayArray7072[i_2], i_0, i_1, i_3, (byte) 7);
		}
	}
}
