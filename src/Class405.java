/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class405 {
	public int anInt5266 = 636252365;
	public int[] anIntArray5267;
	public static int anInt5268 = 0;
	static int anInt5269 = 2;
	public int anInt5270 = 78914705;
	public static int anInt5271 = 1;
	public int[] anIntArray5272;
	public int[] anIntArray5273;

	public Class405(Class243 class243) {
		byte[] is = class243.method2294((-363169051 * Class380.aClass380_4105.anInt4108), (byte) 105);
		method4955(new RsByteBuffer(is), 1286712749);
		if (anIntArray5267 == null)
			throw new RuntimeException("");
	}

	void method4955(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i == 773233530)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_0_) {
					int i_1_ = class298_sub53.readUnsignedByte();
					anIntArray5267 = new int[i_1_];
					int i_2_ = 0;
					for (/**/; i_2_ < anIntArray5267.length; i_2_++) {
						anIntArray5267[i_2_] = class298_sub53.readUnsignedByte();
						if (anIntArray5267[i_2_] == 0) {
							if (i == 773233530)
								return;
						} else if (2 == anIntArray5267[i_2_])
							continue;
					}
				} else if (3 == i_0_)
					anInt5266 = class298_sub53.readUnsignedByte() * -636252365;
				else if (4 == i_0_)
					anInt5270 = class298_sub53.readUnsignedByte() * -78914705;
				else if (5 == i_0_) {
					anIntArray5272 = new int[class298_sub53.readUnsignedByte()];
					for (int i_3_ = 0; i_3_ < anIntArray5272.length; i_3_++)
						anIntArray5272[i_3_] = class298_sub53.readUnsignedByte();
				} else if (6 == i_0_) {
					anIntArray5273 = new int[class298_sub53.readUnsignedByte()];
					for (int i_4_ = 0; i_4_ < anIntArray5273.length; i_4_++)
						anIntArray5273[i_4_] = class298_sub53.readUnsignedByte();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qv.a(").append(')').toString());
		}
	}

	static final void method4956(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aBoolean8802 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qv.uq(").append(')').toString());
		}
	}

	public static void method4957(Class297 class297, short i) {
		try {
			if (null != ((Class297) class297).aClass298_Sub19_Sub2_3184)
				Class285.aClass298_Sub19_Sub4_3083.method3048(((Class297) class297).aClass298_Sub19_Sub2_3184);
			else
				((Class297) class297).anInt3177 = -2147483648;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qv.j(").append(')').toString());
		}
	}

	static final void method4958(int i) {
		try {
			Class152.method1652(Class373.aClass_ra4071, (long) (443738891 * client.anInt8884));
			if (-257444687 * client.WINDOW_PANE_ID != -1)
				Class443.method5884(-257444687 * client.WINDOW_PANE_ID, 186134073);
			for (int i_5_ = 0; i_5_ < -112139815 * client.anInt8686; i_5_++) {
				client.aBooleanArray8901[i_5_] = client.aBooleanArray8900[i_5_];
				client.aBooleanArray8900[i_5_] = false;
			}
			client.anInt8832 = -1390800553 * client.anInt8884;
			if (-1 != client.WINDOW_PANE_ID * -257444687) {
				client.anInt8686 = 0;
				Class104.method1104(-710389872);
			}
			Class373.aClass_ra4071.L();
			Class463.method6013(Class373.aClass_ra4071, (byte) 74);
			int i_6_ = Class298_Sub17_Sub4.method2926(-185727929);
			if (-1 == i_6_)
				i_6_ = client.anInt8937 * -1808468501;
			if (-1 == i_6_)
				i_6_ = client.anInt8831 * 1203044105;
			Class518.method6314(i_6_, 614001892);
			client.anInt8961 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qv.ig(").append(')').toString());
		}
	}

	static void method4959(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1]), 245040087).anInt4006) * 1327747841;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qv.r(").append(')').toString());
		}
	}
}
