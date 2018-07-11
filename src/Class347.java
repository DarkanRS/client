/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347 {
	public int anInt4050;
	public int anInt4051;
	static SoftCache aClass229_4052 = new SoftCache(64);
	static Index aClass317_4053;
	public int anInt4054;
	public int anInt4055 = -2109958295;
	static final int anInt4056 = 0;
	public int anInt4057;
	public boolean aBool4058;
	public boolean aBool4059;

	void method6162(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (1 == i) {
			anInt4055 = class282_sub35.readUnsignedShort() * 2109958295;
			if (65535 == 117872423 * anInt4055)
				anInt4055 = -2109958295;
		} else if (2 == i) {
			anInt4054 = (class282_sub35.readUnsignedShort() + 1) * -930910623;
			anInt4050 = (class282_sub35.readUnsignedShort() + 1) * 133206121;
		} else if (i == 3)
			class282_sub35.readByte((short) -22486);
		else if (4 == i)
			anInt4051 = class282_sub35.readUnsignedByte() * -742532921;
		else if (5 == i)
			anInt4057 = class282_sub35.readUnsignedByte() * 575850499;
		else if (i == 6)
			aBool4058 = true;
		else if (i == 7)
			aBool4059 = true;
	}

	void method6163(RsByteBuffer class282_sub35, int i, short i_1_) {
		for (;;) {
			int i_2_ = class282_sub35.readUnsignedByte();
			if (0 == i_2_)
				break;
			method6164(class282_sub35, i_2_, i, 2147483647);
		}
	}

	void method6164(RsByteBuffer class282_sub35, int i, int i_3_, int i_4_) {
		if (1 == i) {
			anInt4055 = class282_sub35.readUnsignedShort() * 2109958295;
			if (65535 == 117872423 * anInt4055)
				anInt4055 = -2109958295;
		} else if (2 == i) {
			anInt4054 = (class282_sub35.readUnsignedShort() + 1) * -930910623;
			anInt4050 = (class282_sub35.readUnsignedShort() + 1) * 133206121;
		} else if (i == 3)
			class282_sub35.readByte((short) -3807);
		else if (4 == i)
			anInt4051 = class282_sub35.readUnsignedByte() * -742532921;
		else if (5 == i)
			anInt4057 = class282_sub35.readUnsignedByte() * 575850499;
		else if (i == 6)
			aBool4058 = true;
		else if (i == 7)
			aBool4059 = true;
	}

	public static void method6165(Index class317) {
		aClass317_4053 = class317;
	}

	public static void method6166(Index class317) {
		aClass317_4053 = class317;
	}

	public static Class347 method6167(int i) {
		Class347 class347 = (Class347) aClass229_4052.get((long) i);
		if (null != class347)
			return class347;
		byte[] is = aClass317_4053.getFile(0, i, -1744491945);
		class347 = new Class347();
		if (null != is)
			class347.method6163(new RsByteBuffer(is), i, (short) 257);
		aClass229_4052.put(class347, (long) i);
		return class347;
	}

	void method6168(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_5_ = class282_sub35.readUnsignedByte();
			if (0 == i_5_)
				break;
			method6164(class282_sub35, i_5_, i, 2147483647);
		}
	}

	Class347() {
		anInt4054 = 551262272;
		anInt4050 = -64742848;
		anInt4051 = -1485065842;
		anInt4057 = 575850499;
		aBool4058 = false;
		aBool4059 = false;
	}

	static final void method6169(CS2Executor class527, byte i) {
		int i_6_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class282_Sub1.method11614(i_6_, 143389073);
	}

	static final void method6170(int i, int i_7_, int i_8_) {
		if (Class291_Sub1.aFloat3468 < Class291_Sub1.aFloat3462) {
			Class291_Sub1.aFloat3468 += (double) Class291_Sub1.aFloat3468 / 30.0;
			if (Class291_Sub1.aFloat3468 > Class291_Sub1.aFloat3462)
				Class291_Sub1.aFloat3468 = Class291_Sub1.aFloat3462;
			Class89.method1502(-463679465);
			Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
			Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469, (short) 8192);
		} else if (Class291_Sub1.aFloat3468 > Class291_Sub1.aFloat3462) {
			Class291_Sub1.aFloat3468 -= (double) Class291_Sub1.aFloat3468 / 30.0;
			if (Class291_Sub1.aFloat3468 < Class291_Sub1.aFloat3462)
				Class291_Sub1.aFloat3468 = Class291_Sub1.aFloat3462;
			Class89.method1502(372349674);
			Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
			Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469, (short) 8192);
		}
		if (Class291_Sub1.anInt8014 * -1359738663 != -1 && -1 != -162722139 * Class291_Sub1.anInt8016) {
			int i_9_ = (Class291_Sub1.anInt8014 * -1359738663 - -861975801 * Class427.anInt5123);
			if (i_9_ < 2 || i_9_ > 2)
				i_9_ /= 8;
			int i_10_ = (-162722139 * Class291_Sub1.anInt8016 - 483850921 * Class475.anInt5624);
			if (i_10_ < 2 || i_10_ > 2)
				i_10_ /= 8;
			Class427.anInt5123 = (i_9_ + Class427.anInt5123 * -861975801) * 1714827959;
			Class475.anInt5624 = 1710901657 * (i_10_ + 483850921 * Class475.anInt5624);
			if (0 == i_9_ && 0 == i_10_) {
				Class291_Sub1.anInt8014 = -1089992553;
				Class291_Sub1.anInt8016 = 638834387;
			}
			Class89.method1502(-140705519);
		}
		if (Class361.anInt4185 * 750747217 > 0) {
			Class96_Sub9.anInt9282 -= 759227215;
			if (896422831 * Class96_Sub9.anInt9282 == 0) {
				Class361.anInt4185 -= -1293776207;
				Class96_Sub9.anInt9282 = -1386689828;
			}
		} else {
			Class291_Sub1.anInt8018 = 428705471;
			Class291_Sub1.anInt8026 = -194319891;
		}
		if (Class291_Sub1.aBool8022 && null != Class346.aClass482_4049) {
			for (Class282_Sub33 class282_sub33 = ((Class282_Sub33) Class346.aClass482_4049.head((byte) 117)); class282_sub33 != null; class282_sub33 = ((Class282_Sub33) Class346.aClass482_4049.next(-731653338))) {
				WorldMapAreaDefs class220 = (Class291_Sub1.aClass218_3456.getWorldMapDefs(-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991), 1327385371));
				if (class282_sub33.method12577(i, i_7_, -1474454985)) {
					if (null != class220.aStringArray2740) {
						if (null != class220.aStringArray2740[4])
							PlayerAppearance.method4032(class220.aStringArray2740[4], class220.aString2732, -1, 1012, -1, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), class220.anInt2718 * 781329827, 0, true, false, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), false, -1941866254);
						if (null != class220.aStringArray2740[3])
							PlayerAppearance.method4032(class220.aStringArray2740[3], class220.aString2732, -1, 1011, -1, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, 0, true, false, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), false, -1376328054);
						if (null != class220.aStringArray2740[2])
							PlayerAppearance.method4032(class220.aStringArray2740[2], class220.aString2732, -1, 1010, -1, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, 0, true, false, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), false, -1687598339);
						if (class220.aStringArray2740[1] != null)
							PlayerAppearance.method4032(class220.aStringArray2740[1], class220.aString2732, -1, 1009, -1, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), class220.anInt2718 * 781329827, 0, true, false, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), false, -1447138539);
						if (class220.aStringArray2740[0] != null)
							PlayerAppearance.method4032(class220.aStringArray2740[0], class220.aString2732, -1, 1008, -1, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), 781329827 * class220.anInt2718, 0, true, false, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), false, -1091796707);
					}
					if (!((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989) {
						((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989 = true;
						Class210.method3614(Class397.aClass397_4797, ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), class220.anInt2718 * 781329827, (byte) 82);
					}
					if (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989)
						Class210.method3614(Class397.aClass397_4805, ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, (byte) 69);
				} else if (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989) {
					((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989 = false;
					Class210.method3614(Class397.aClass397_4798, ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, (byte) 75);
				}
			}
		}
	}
}
