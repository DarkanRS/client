/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class487 {
	Class348 aClass348_6064 = new Class348(64);
	Class348 aClass348_6065 = new Class348(64);
	public static int anInt6066 = 64;
	Class243 aClass243_6067;
	Class243 aClass243_6068;
	public static int anInt6069 = 64;

	public Class496 method6159(int i, int i_0_) {
		try {
			Class496 class496;
			synchronized (((Class487) this).aClass348_6064) {
				class496 = (Class496) ((Class487) this).aClass348_6064.method4184((long) i);
			}
			if (class496 != null)
				return class496;
			byte[] is;
			synchronized (((Class487) this).aClass243_6067) {
				is = (((Class487) this).aClass243_6067.getFile(Class120.aClass120_1419.anInt1460 * -1006924897, i, (byte) -51));
			}
			class496 = new Class496();
			((Class496) class496).aClass487_6095 = this;
			if (is != null)
				class496.method6196(new RsByteBuffer(is), -1377008682);
			synchronized (((Class487) this).aClass348_6064) {
				((Class487) this).aClass348_6064.method4194(class496, (long) i);
			}
			return class496;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.a(").append(')').toString());
		}
	}

	public void method6160(int i, int i_1_, int i_2_) {
		try {
			((Class487) this).aClass348_6064 = new Class348(i);
			((Class487) this).aClass348_6065 = new Class348(i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.f(").append(')').toString());
		}
	}

	public void method6161(byte i) {
		try {
			synchronized (((Class487) this).aClass348_6064) {
				((Class487) this).aClass348_6064.method4187();
			}
			synchronized (((Class487) this).aClass348_6065) {
				((Class487) this).aClass348_6065.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.b(").append(')').toString());
		}
	}

	public void method6162(byte i) {
		try {
			synchronized (((Class487) this).aClass348_6064) {
				((Class487) this).aClass348_6064.method4189();
			}
			synchronized (((Class487) this).aClass348_6065) {
				((Class487) this).aClass348_6065.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.i(").append(')').toString());
		}
	}

	public Class487(Class411 class411, Class429 class429, Class243 class243, Class243 class243_3_) {
		((Class487) this).aClass243_6067 = class243;
		((Class487) this).aClass243_6068 = class243_3_;
		((Class487) this).aClass243_6067.method2316((Class120.aClass120_1419.anInt1460) * -1006924897, 1339445894);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	public void method6163(int i, int i_4_) {
		try {
			synchronized (((Class487) this).aClass348_6064) {
				((Class487) this).aClass348_6064.method4186(i, -2105806073);
			}
			synchronized (((Class487) this).aClass348_6065) {
				((Class487) this).aClass348_6065.method4186(i, -1191128609);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.p(").append(')').toString());
		}
	}

	static final void method6164(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (string != null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = string.length();
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.aaa(").append(')').toString());
		}
	}

	static final void method6165(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			Class97.method1041(i_6_, 1637585593);
			int i_11_ = 0;
			int i_12_ = i_6_ - i_9_;
			if (i_12_ < 0)
				i_12_ = 0;
			int i_13_ = i_6_;
			int i_14_ = -i_6_;
			int i_15_ = i_12_;
			int i_16_ = -i_12_;
			int i_17_ = -1;
			int i_18_ = -1;
			int[] is = Class372_Sub1.anIntArrayArray4047[i_5_];
			int i_19_ = i - i_12_;
			int i_20_ = i + i_12_;
			Class82_Sub22.method940(is, i - i_6_, i_19_, i_8_, 822506078);
			Class82_Sub22.method940(is, i_19_, i_20_, i_7_, -940933309);
			Class82_Sub22.method940(is, i_20_, i_6_ + i, i_8_, -1370408112);
			while (i_13_ > i_11_) {
				i_17_ += 2;
				i_18_ += 2;
				i_14_ += i_17_;
				i_16_ += i_18_;
				if (i_16_ >= 0 && i_15_ >= 1) {
					Class372_Sub1.anIntArray7727[i_15_] = i_11_;
					i_15_--;
					i_16_ -= i_15_ << 1;
				}
				i_11_++;
				if (i_14_ >= 0) {
					i_13_--;
					i_14_ -= i_13_ << 1;
					if (i_13_ >= i_12_) {
						int[] is_21_ = Class372_Sub1.anIntArrayArray4047[i_5_ + i_13_];
						int[] is_22_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_13_];
						int i_23_ = i + i_11_;
						int i_24_ = i - i_11_;
						Class82_Sub22.method940(is_21_, i_24_, i_23_, i_8_, 1051915434);
						Class82_Sub22.method940(is_22_, i_24_, i_23_, i_8_, 793440117);
					} else {
						int[] is_25_ = Class372_Sub1.anIntArrayArray4047[i_5_ + i_13_];
						int[] is_26_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_13_];
						int i_27_ = Class372_Sub1.anIntArray7727[i_13_];
						int i_28_ = i + i_11_;
						int i_29_ = i - i_11_;
						int i_30_ = i_27_ + i;
						int i_31_ = i - i_27_;
						Class82_Sub22.method940(is_25_, i_29_, i_31_, i_8_, -12764045);
						Class82_Sub22.method940(is_25_, i_31_, i_30_, i_7_, -194110803);
						Class82_Sub22.method940(is_25_, i_30_, i_28_, i_8_, 1394181568);
						Class82_Sub22.method940(is_26_, i_29_, i_31_, i_8_, -730104987);
						Class82_Sub22.method940(is_26_, i_31_, i_30_, i_7_, 737940457);
						Class82_Sub22.method940(is_26_, i_30_, i_28_, i_8_, 204079647);
					}
				}
				int[] is_32_ = Class372_Sub1.anIntArrayArray4047[i_5_ + i_11_];
				int[] is_33_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_11_];
				int i_34_ = i + i_13_;
				int i_35_ = i - i_13_;
				if (i_11_ < i_12_) {
					int i_36_ = (i_15_ < i_11_ ? Class372_Sub1.anIntArray7727[i_11_] : i_15_);
					int i_37_ = i_36_ + i;
					int i_38_ = i - i_36_;
					Class82_Sub22.method940(is_32_, i_35_, i_38_, i_8_, 1223209089);
					Class82_Sub22.method940(is_32_, i_38_, i_37_, i_7_, 896350728);
					Class82_Sub22.method940(is_32_, i_37_, i_34_, i_8_, -668389774);
					Class82_Sub22.method940(is_33_, i_35_, i_38_, i_8_, -1129338234);
					Class82_Sub22.method940(is_33_, i_38_, i_37_, i_7_, -1441853951);
					Class82_Sub22.method940(is_33_, i_37_, i_34_, i_8_, 145211847);
				} else {
					Class82_Sub22.method940(is_32_, i_35_, i_34_, i_8_, 242307563);
					Class82_Sub22.method940(is_33_, i_35_, i_34_, i_8_, 1665587281);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ub.r(").append(')').toString());
		}
	}
}
