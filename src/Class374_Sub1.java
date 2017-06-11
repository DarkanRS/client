/* Class374_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class374_Sub1 extends Class374 {
	public static Class243 aClass243_7731;

	boolean method4634() {
		return (method4639((short) 10438) != null || (((Class374_Sub1) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
	}

	boolean method4619(int i) {
		try {
			return (method4639((short) 10071) != null || (((Class374_Sub1) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.u(").append(')').toString());
		}
	}

	Class374_Sub1() {
		/* empty */
	}

	Class298_Sub50 method4639(short i) {
		try {
			return ((Class298_Sub50) client.aClass453_8827.method5939(1766612795));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.az(").append(')').toString());
		}
	}

	Class298_Sub36 method4633(byte i) {
		try {
			return Class18.method359(OutcommingPacket.aClass198_1995, client.gameConnection.aClass449_330, (byte) 89);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.x(").append(')').toString());
		}
	}

	void method4617(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50, byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.k(").append(')').toString());
		}
	}

	boolean method4624() {
		return (method4639((short) -18072) != null || (((Class374_Sub1) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
	}

	void method4621() {
		Class298_Sub50 class298_sub50 = method4639((short) 7682);
		if (class298_sub50 != null) {
			int i = method4615(class298_sub50, 32767, (byte) 48);
			int i_0_ = class298_sub50.method3560(-1340824693);
			if (i_0_ < 0)
				i_0_ = 0;
			else if (i_0_ > 65535)
				i_0_ = 65535;
			int i_1_ = class298_sub50.method3547((byte) -58);
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 65535)
				i_1_ = 65535;
			int i_2_ = 0;
			if (class298_sub50.method3546(-1372966703) == 2)
				i_2_ = 1;
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2008, client.gameConnection.aClass449_330, (byte) 77);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_1_ | i_0_ << 16, -1426845039);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i | i_2_ << 15);
			client.gameConnection.method390(class298_sub36, (byte) -38);
		}
	}

	void method4613() {
		Class298_Sub50 class298_sub50 = method4639((short) 14253);
		if (class298_sub50 != null) {
			int i = method4615(class298_sub50, 32767, (byte) 78);
			int i_3_ = class298_sub50.method3560(-964598213);
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ > 65535)
				i_3_ = 65535;
			int i_4_ = class298_sub50.method3547((byte) 26);
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 65535)
				i_4_ = 65535;
			int i_5_ = 0;
			if (class298_sub50.method3546(-1372966703) == 2)
				i_5_ = 1;
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2008, client.gameConnection.aClass449_330, (byte) 71);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_4_ | i_3_ << 16, -1629465959);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i | i_5_ << 15);
			client.gameConnection.method390(class298_sub36, (byte) -6);
		}
	}

	void method4612(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		/* empty */
	}

	boolean method4623() {
		return (method4639((short) 8384) != null || (((Class374_Sub1) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
	}

	void method4618(byte i) {
		try {
			Class298_Sub50 class298_sub50 = method4639((short) 12232);
			if (class298_sub50 != null) {
				int i_6_ = method4615(class298_sub50, 32767, (byte) 9);
				int i_7_ = class298_sub50.method3560(-1870529488);
				if (i_7_ < 0)
					i_7_ = 0;
				else if (i_7_ > 65535)
					i_7_ = 65535;
				int i_8_ = class298_sub50.method3547((byte) -26);
				if (i_8_ < 0)
					i_8_ = 0;
				else if (i_8_ > 65535)
					i_8_ = 65535;
				int i_9_ = 0;
				if (class298_sub50.method3546(-1372966703) == 2)
					i_9_ = 1;
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2008, client.gameConnection.aClass449_330, (byte) 8);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_8_ | i_7_ << 16, 121434419);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i_6_ | i_9_ << 15);
				client.gameConnection.method390(class298_sub36, (byte) -44);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.d(").append(')').toString());
		}
	}

	int method4629() {
		return 0;
	}

	Class298_Sub36 method4625() {
		return Class18.method359(OutcommingPacket.aClass198_1995, client.gameConnection.aClass449_330, (byte) 126);
	}

	Class298_Sub36 method4631() {
		return Class18.method359(OutcommingPacket.aClass198_1995, client.gameConnection.aClass449_330, (byte) 67);
	}

	int method4635() {
		return 0;
	}

	int method4628() {
		return 0;
	}

	void method4627(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		/* empty */
	}

	void method4630(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		/* empty */
	}

	void method4632(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		/* empty */
	}

	void method4622() {
		Class298_Sub50 class298_sub50 = method4639((short) -5180);
		if (class298_sub50 != null) {
			int i = method4615(class298_sub50, 32767, (byte) 103);
			int i_10_ = class298_sub50.method3560(-2028653571);
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 65535)
				i_10_ = 65535;
			int i_11_ = class298_sub50.method3547((byte) -30);
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 65535)
				i_11_ = 65535;
			int i_12_ = 0;
			if (class298_sub50.method3546(-1372966703) == 2)
				i_12_ = 1;
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2008, client.gameConnection.aClass449_330, (byte) 43);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_11_ | i_10_ << 16, -611244662);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i | i_12_ << 15);
			client.gameConnection.method390(class298_sub36, (byte) -78);
		}
	}

	int method4616(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.i(").append(')').toString());
		}
	}

	public static void method4640(boolean bool, boolean bool_13_, int i) {
		try {
			if (bool) {
				Class379.anInt4097 += 1929855733;
				Class326.method3968(-1915881134);
			}
			if (bool_13_) {
				Class379.anInt4095 += -1931699395;
				Class329.method3994((byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.a(").append(')').toString());
		}
	}

	static final void method4641(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			client.anInt8831 = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * 443563833;
			client.anInt8690 = ((((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]) * -802224543);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adi.afv(").append(')').toString());
		}
	}
}
