/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108 {
	public String aString1316;
	public String aString1317;
	public String aString1318;
	public Class122[] aClass122Array1319;
	public Class122[] aClass122Array1320;
	public static int anInt1321;

	Class108() {
		/* empty */
	}

	void method1145(Class101 class101, byte i) {
		try {
			aString1317 = class101.method1079(1509343502);
			aString1316 = class101.method1079(1509343502);
			aString1318 = class101.method1079(1509343502);
			int i_0_ = class101.method1080(823123769);
			int i_1_ = class101.method1080(-1396708449);
			aClass122Array1319 = i_0_ == 0 ? null : new Class122[i_0_];
			aClass122Array1320 = i_1_ == 0 ? null : new Class122[i_1_];
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				aClass122Array1319[i_2_] = new Class122();
				aClass122Array1319[i_2_].method1317(class101, 1424483545);
			}
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				aClass122Array1320[i_3_] = new Class122();
				aClass122Array1320[i_3_].method1317(class101, 1424483545);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.a(").append(')').toString());
		}
	}

	public static void method1146(Class243 class243, int i) {
		try {
			Class287.aClass243_3100 = class243;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.a(").append(')').toString());
		}
	}

	static final void method1147(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aBoolean8640 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.abd(").append(')').toString());
		}
	}

	static final void method1148(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) 70);
			Class119 class119 = Class389.aClass119Array4165[i_4_ >> 16];
			Class21.method365(class105, class119, false, 1, class403, 233594133);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.he(").append(')').toString());
		}
	}

	static String method1149(int i, Class429 class429, int i_5_) {
		try {
			if (i < 100000)
				return new StringBuilder().append("<col=ffff00>").append(i).append("</col>").toString();
			if (i < 10000000)
				return new StringBuilder().append("<col=ffffff>").append(i / 1000).append(Tradution.aClass470_5920.method6049(class429, -875414210)).append("</col>").toString();
			return new StringBuilder().append("<col=00ff80>").append(i / 1000000).append(Tradution.aClass470_5918.method6049(class429, -875414210)).append("</col>").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.n(").append(')').toString());
		}
	}

	public static final void method1150(boolean bool, byte i) {
		try {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CLOSE_INTERFACE_PACKET, client.gameConnection.aClass449_330, (byte) 111);
			client.gameConnection.method390(class298_sub36, (byte) -21);
			for (Interface class298_sub51 = ((Interface) client.aClass437_8841.method5816(1892786919)); null != class298_sub51; class298_sub51 = ((Interface) client.aClass437_8841.method5815((byte) -93))) {
				if (!class298_sub51.method2840(-629325116)) {
					class298_sub51 = ((Interface) client.aClass437_8841.method5816(1676096674));
					if (class298_sub51 == null) {
						if (i <= 0) {
							/* empty */
						}
						break;
					}
				}
				if (0 == class298_sub51.clipped * 27137839)
					Class173.method1821(class298_sub51, true, bool, -113822480);
			}
			if (client.aClass105_8652 != null) {
				Tradution.method6054(client.aClass105_8652, -1209330591);
				client.aClass105_8652 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.lr(").append(')').toString());
		}
	}

	static final void method1151(ClientScript2 class403, int i) {
		try {
			if (Class68.aShortArray678 == null || (Class242.anInt2709 * -316347407 >= Class344.anInt3688 * 367592105))
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = ((Class68.aShortArray678[(Class242.anInt2709 += 1578804497) * -316347407 - 1]) & 0xffff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.abw(").append(')').toString());
		}
	}

	static void method1152(int i, int i_6_, int i_7_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(14, (long) i);
			class298_sub37_sub12.method3449((byte) 25);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.ag(").append(')').toString());
		}
	}

	static void method1153(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			int i_13_ = 0;
			int i_14_ = i_10_;
			int i_15_ = i_9_ * i_9_;
			int i_16_ = i_10_ * i_10_;
			int i_17_ = i_16_ << 1;
			int i_18_ = i_15_ << 1;
			int i_19_ = i_10_ << 1;
			int i_20_ = i_17_ + (1 - i_19_) * i_15_;
			int i_21_ = i_16_ - (i_19_ - 1) * i_18_;
			int i_22_ = i_15_ << 2;
			int i_23_ = i_16_ << 2;
			int i_24_ = i_17_ * (3 + (i_13_ << 1));
			int i_25_ = ((i_14_ << 1) - 3) * i_18_;
			int i_26_ = (1 + i_13_) * i_23_;
			int i_27_ = i_22_ * (i_14_ - 1);
			Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_8_]), i - i_9_, i_9_ + i, i_11_, -2115360638);
			while (i_14_ > 0) {
				if (i_20_ < 0) {
					while (i_20_ < 0) {
						i_20_ += i_24_;
						i_21_ += i_26_;
						i_24_ += i_23_;
						i_26_ += i_23_;
						i_13_++;
					}
				}
				if (i_21_ < 0) {
					i_20_ += i_24_;
					i_21_ += i_26_;
					i_24_ += i_23_;
					i_26_ += i_23_;
					i_13_++;
				}
				i_20_ += -i_27_;
				i_21_ += -i_25_;
				i_25_ -= i_22_;
				i_27_ -= i_22_;
				i_14_--;
				int i_28_ = i_8_ - i_14_;
				int i_29_ = i_8_ + i_14_;
				int i_30_ = i_13_ + i;
				int i_31_ = i - i_13_;
				Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_28_]), i_31_, i_30_, i_11_, 756505397);
				Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_29_]), i_31_, i_30_, i_11_, 931363895);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ek.at(").append(')').toString());
		}
	}
}
