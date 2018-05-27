/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class348 {
	int anInt4060 = 809353231;
	static final int anInt4061 = 1;
	NodeCollection aClass482_4062 = new NodeCollection();
	static final int anInt4063 = 6;
	static final int anInt4064 = 2;
	static final int anInt4065 = 11;
	static final int anInt4066 = 4;
	static final int anInt4067 = 5;
	static final int anInt4068 = 10;
	static final int anInt4069 = 7;
	static final int anInt4070 = 8;
	static final int anInt4071 = 9;
	static final int anInt4072 = 3;
	long aLong4073;
	static final int anInt4074 = 12;
	static final int anInt4075 = 13;

	void method6171(RsByteBuffer class282_sub35, byte i) {
		((Class348) this).aLong4073 = class282_sub35.readLong(1262555059) * -8302090460667771417L;
		((Class348) this).anInt4060 = class282_sub35.readInt() * -809353231;
		for (int i_0_ = class282_sub35.readUnsignedByte(); i_0_ != 0; i_0_ = class282_sub35.readUnsignedByte()) {
			Class282_Sub17 class282_sub17;
			if (3 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub10(this);
			else if (1 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub1(this);
			else if (i_0_ == 13)
				class282_sub17 = new Class282_Sub17_Sub9(this);
			else if (4 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub6(this);
			else if (6 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub8(this);
			else if (5 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub2(this);
			else if (i_0_ == 2)
				class282_sub17 = new Class282_Sub17_Sub7(this);
			else if (i_0_ == 7)
				class282_sub17 = new Class282_Sub17_Sub12(this);
			else if (i_0_ == 8)
				class282_sub17 = new Class282_Sub17_Sub13(this);
			else if (9 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub11(this);
			else if (i_0_ == 10)
				class282_sub17 = new Class282_Sub17_Sub5(this);
			else if (i_0_ == 11)
				class282_sub17 = new Class282_Sub17_Sub4(this);
			else if (12 == i_0_)
				class282_sub17 = new Class282_Sub17_Sub3(this);
			else
				throw new RuntimeException("");
			class282_sub17.method12250(class282_sub35, -1771896031);
			((Class348) this).aClass482_4062.append(class282_sub17, -575060880);
		}
	}

	public void method6172(Class61 class61) {
		if ((747801689090652059L * ((Class61) class61).aLong631 != ((Class348) this).aLong4073 * 5062689612773211607L) || (((Class348) this).anInt4060 * 1111937297 != 675380709 * ((Class61) class61).anInt637))
			throw new RuntimeException("");
		for (Class282_Sub17 class282_sub17 = ((Class282_Sub17) ((Class348) this).aClass482_4062.head((byte) 117)); null != class282_sub17; class282_sub17 = (Class282_Sub17) ((Class348) this).aClass482_4062.next(1108248941))
			class282_sub17.method12251(class61, -429954850);
		((Class61) class61).anInt637 += 1021671405;
	}

	public void method6173(Class61 class61, int i) {
		if ((747801689090652059L * ((Class61) class61).aLong631 != ((Class348) this).aLong4073 * 5062689612773211607L) || (((Class348) this).anInt4060 * 1111937297 != 675380709 * ((Class61) class61).anInt637))
			throw new RuntimeException("");
		for (Class282_Sub17 class282_sub17 = ((Class282_Sub17) ((Class348) this).aClass482_4062.head((byte) 23)); null != class282_sub17; class282_sub17 = (Class282_Sub17) ((Class348) this).aClass482_4062.next(983749552))
			class282_sub17.method12251(class61, -429954850);
		((Class61) class61).anInt637 += 1021671405;
	}

	public Class348(RsByteBuffer class282_sub35) {
		method6171(class282_sub35, (byte) 46);
	}

	static final void method6174(CS2Executor class527, int i) {
		int i_1_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_1_, (byte) 116);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1337 * -1009302201;
	}

	public static void method6175(boolean bool, int i) {
		if (bool) {
			if (-1 != client.anInt7349 * -1699899559)
				Class337.method6017(-1699899559 * client.anInt7349, -1669420859);
			for (Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(1087054250)); class282_sub44 != null; class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7751((byte) 11))) {
				if (!class282_sub44.method4994(1167502204)) {
					class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(-848491079));
					if (class282_sub44 == null)
						break;
				}
				Class351.method6196(class282_sub44, true, false, -2131194694);
			}
			client.anInt7349 = -153305321;
			client.aClass465_7442 = new IterableNodeMap(8);
			MeshModifier.method7041((byte) -6);
			client.anInt7349 = -1189891005 * Class58.aClass529_527.anInt7036;
			Class516.method8867(false, -905479502);
			IncomingPacket.method6378(-1538407760);
			Class150.method2582(-1699899559 * client.anInt7349, null, -1484331524);
		}
		Class468_Sub12.method12708(1506818197);
		Class9.aBool71 = false;
		Class509.method8739(900001069);
		client.anInt7427 = 434551523;
		UnderlayIndexLoader.method8036(client.anInt7340 * -141702765, (byte) 4);
		Class84.myPlayer = new Player(null);
		Class84.myPlayer.method11172((float) (IndexLoaders.MAP_REGION_DECODER.method4424(1639359144) * 512 / 2), 0.0F, (float) (IndexLoaders.MAP_REGION_DECODER.method4451(-1549308154) * 512 / 2));
		Class84.myPlayer.regionBaseX[0] = IndexLoaders.MAP_REGION_DECODER.method4424(-1586336378) / 2;
		Class84.myPlayer.regionBaseY[0] = IndexLoaders.MAP_REGION_DECODER.method4451(-1038237242) / 2;
		Class246.anInt3029 = 0;
		Class31.anInt361 = 0;
		if (5 == Class262.anInt3240 * -672443707) {
			Class31.anInt361 = (Class296.anInt3534 * 1034829113 << 9) * -2043310439;
			Class246.anInt3029 = (Class282_Sub44.anInt8064 * -2026930995 << 9) * 1442943697;
		} else
			Class515.method8860((byte) -92);
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(-367591790);
	}

	static boolean method6176(int i, int i_2_) {
		return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i || i == 50 || 51 == i || i == 52 || i == 53 || 15 == i);
	}
}
