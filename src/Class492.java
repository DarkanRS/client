/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class Class492 {
	public int anInt6081;
	Class491 aClass491_6082;
	int anInt6083;
	public int anInt6084;

	void method6179(RsByteBuffer class298_sub53, int i, byte i_0_) {
		try {
			if (i == 1)
				((Class492) this).anInt6083 = class298_sub53.readBigSmart(1235052657) * -1732871629;
			else if (2 == i) {
				anInt6084 = class298_sub53.readUnsignedByte() * -1845194875;
				anInt6081 = class298_sub53.readUnsignedByte() * -1430050043;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.f(").append(')').toString());
		}
	}

	void method6180(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (i_1_ == 0) {
					if (i == 1638036980)
						break;
					break;
				}
				method6179(class298_sub53, i_1_, (byte) -92);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.a(").append(')').toString());
		}
	}

	public synchronized Class89 method6181(int i) {
		try {
			Class89 class89 = ((Class89) (((Class491) ((Class492) this).aClass491_6082).aClass348_6078.method4184((long) (((Class492) this).anInt6083 * 1338052859))));
			if (class89 != null)
				return class89;
			class89 = Class89.method987((((Class491) ((Class492) this).aClass491_6082).aClass243_6077), 1338052859 * ((Class492) this).anInt6083, 0);
			if (class89 != null)
				((Class491) ((Class492) this).aClass491_6082).aClass348_6078.method4194(class89, (long) (1338052859 * ((Class492) this).anInt6083));
			return class89;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.b(").append(')').toString());
		}
	}

	Class492() {
		/* empty */
	}

	static final void method6182(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			Class19[] class19s = client.aClass19Array8869;
			for (int i_8_ = 0; i_8_ < class19s.length; i_8_++) {
				Class19 class19 = class19s[i_8_];
				if (class19 != null) {
					if (class19.anInt266 * 958933333 != 2) {
						if (i_7_ != 996259282)
							break;
					} else {
						Class139.method1549((((Class19) class19).anInt259 * -458864019), -1338192389 * class19.anInt260, 1018128075 * class19.anInt261, (((Class19) class19).anInt262 * 143254950), -549885479);
						if (client.aFloatArray8891[0] > -1.0F && 443738891 * client.anInt8884 % 20 < 10) {
							Class57 class57 = (Class128_Sub2.aClass57Array8560[-92466201 * ((Class19) class19).anInt258]);
							int i_9_ = (int) ((float) i + client.aFloatArray8891[0] - 12.0F);
							int i_10_ = (int) ((float) i_2_ + client.aFloatArray8891[1] - 28.0F);
							class57.method645(i_9_, i_10_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.jf(").append(')').toString());
		}
	}

	static final void method6183(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			if (i_11_ > i_12_) {
				for (int i_15_ = i_12_; i_15_ < i_11_; i_15_++)
					Class372_Sub2.anIntArrayArray4047[i_15_][i] = i_13_;
			} else {
				for (int i_16_ = i_11_; i_16_ < i_12_; i_16_++)
					Class372_Sub2.anIntArrayArray4047[i_16_][i] = i_13_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.r(").append(')').toString());
		}
	}

	static boolean method6184(Class355 class355, int i) {
		try {
			return Class170.method1814(class355, null, (byte) -87);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.p(").append(')').toString());
		}
	}

	public static void method6185(Object object, int i) {
		try {
			if (null != ClientScript2.anEventQueue5262) {
				for (int i_17_ = 0; (i_17_ < 50 && ClientScript2.anEventQueue5262.peekEvent() != null); i_17_++)
					Class464.method6060(1L);
				try {
					if (object != null)
						ClientScript2.anEventQueue5262.postEvent(new ActionEvent(object, 1001, "dummy"));
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ug.c(").append(')').toString());
		}
	}
}
