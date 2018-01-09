/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class49 {
	static final int anInt471 = 128;
	static final int anInt472 = 128;
	public static final int anInt473 = 16;
	public boolean aBool474;
	Interface1 anInterface1_475;
	Interface6[] anInterface6Array476 = null;
	static Object anObject477;
	public Interface6[] anInterface6Array478;
	public Interface1 anInterface1_479;
	public Interface1 anInterface1_480;
	Class505_Sub2 aClass505_Sub2_481;
	static Object anObject482;
	static Object anObject483;

	static void method968() {
		if (anObject482 == null) {
			Class370_Sub1_Sub1 class370_sub1_sub1 = new Class370_Sub1_Sub1();
			byte[] is = class370_sub1_sub1.method15431(128, 128, 16);
			anObject482 = Class309.method5493(is, false, (byte) 97);
		}
		if (anObject477 == null) {
			Class370_Sub2_Sub1 class370_sub2_sub1 = new Class370_Sub2_Sub1();
			byte[] is = class370_sub2_sub1.method15442(128, 128, 16);
			anObject477 = Class309.method5493(is, false, (byte) 80);
		}
	}

	public boolean method969() {
		if (!((Class49) this).aClass505_Sub2_481.aBool8827)
			return false;
		if (anInterface1_480 == null) {
			if (anObject483 == null) {
				byte[] is = Class264.method4782(128, 128, 16, 8, new Class261_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject483 = Class309.method5493(is, false, (byte) 40);
			}
			byte[] is = Class346.toByteArray(anObject483, false, (byte) 1);
			byte[] is_0_ = new byte[is.length * 4];
			int i = 0;
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				int i_2_ = i_1_ * 16384;
				int i_3_ = i_2_;
				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					int i_5_ = i_3_ + i_4_ * 128;
					int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
					int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
					for (int i_8_ = 0; i_8_ < 128; i_8_++) {
						float f = (float) ((is[i_6_ + i_8_] & 0xff) - (is[i_7_ + i_8_] & 0xff));
						float f_9_ = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff) - (is[i_5_ + (i_8_ + 1 & 0x7f)] & 0xff));
						float f_10_ = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_ + 16384.0F + f * f)));
						is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
						is_0_[i++] = is[i_2_++];
					}
				}
			}
			anInterface1_480 = (((Class49) this).aClass505_Sub2_481.method13962(Class150.aClass150_1949, 128, 128, 16, true, is_0_));
		}
		return anInterface1_480 != null;
	}

	Class49(Class505_Sub2 class505_sub2) {
		((Class49) this).anInterface1_475 = null;
		anInterface6Array478 = null;
		anInterface1_479 = null;
		anInterface1_480 = null;
		((Class49) this).aClass505_Sub2_481 = class505_sub2;
		aBool474 = ((Class49) this).aClass505_Sub2_481.aBool8827;
		if (aBool474 && !(((Class49) this).aClass505_Sub2_481.method13955(Class150.aClass150_1952, Class76.aClass76_751)))
			aBool474 = false;
		if (aBool474 || (((Class49) this).aClass505_Sub2_481.method13954(Class150.aClass150_1952, Class76.aClass76_751))) {
			method968();
			if (!aBool474) {
				((Class49) this).anInterface6Array476 = new Interface6[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class282_Sub17_Sub5.method15410(anObject482, i * 32768, 32768, -232784177);
					((Class49) this).anInterface6Array476[i] = (((Class49) this).aClass505_Sub2_481.method13957(Class150.aClass150_1952, 128, 128, true, is));
				}
				anInterface6Array478 = new Interface6[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class282_Sub17_Sub5.method15410(anObject477, i * 32768, 32768, -560964822);
					anInterface6Array478[i] = (((Class49) this).aClass505_Sub2_481.method13957(Class150.aClass150_1952, 128, 128, true, is));
				}
			} else {
				byte[] is = Class346.toByteArray(anObject482, false, (byte) 1);
				((Class49) this).anInterface1_475 = (((Class49) this).aClass505_Sub2_481.method13962(Class150.aClass150_1952, 128, 128, 16, true, is));
				is = Class346.toByteArray(anObject477, false, (byte) 1);
				anInterface1_479 = (((Class49) this).aClass505_Sub2_481.method13962(Class150.aClass150_1952, 128, 128, 16, true, is));
			}
		}
	}

	static void method970() {
		if (anObject482 == null) {
			Class370_Sub1_Sub1 class370_sub1_sub1 = new Class370_Sub1_Sub1();
			byte[] is = class370_sub1_sub1.method15431(128, 128, 16);
			anObject482 = Class309.method5493(is, false, (byte) 113);
		}
		if (anObject477 == null) {
			Class370_Sub2_Sub1 class370_sub2_sub1 = new Class370_Sub2_Sub1();
			byte[] is = class370_sub2_sub1.method15442(128, 128, 16);
			anObject477 = Class309.method5493(is, false, (byte) 37);
		}
	}

	public boolean method971() {
		if (!((Class49) this).aClass505_Sub2_481.aBool8827)
			return false;
		if (anInterface1_480 == null) {
			if (anObject483 == null) {
				byte[] is = Class264.method4782(128, 128, 16, 8, new Class261_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject483 = Class309.method5493(is, false, (byte) 118);
			}
			byte[] is = Class346.toByteArray(anObject483, false, (byte) 1);
			byte[] is_11_ = new byte[is.length * 4];
			int i = 0;
			for (int i_12_ = 0; i_12_ < 16; i_12_++) {
				int i_13_ = i_12_ * 16384;
				int i_14_ = i_13_;
				for (int i_15_ = 0; i_15_ < 128; i_15_++) {
					int i_16_ = i_14_ + i_15_ * 128;
					int i_17_ = i_14_ + (i_15_ - 1 & 0x7f) * 128;
					int i_18_ = i_14_ + (i_15_ + 1 & 0x7f) * 128;
					for (int i_19_ = 0; i_19_ < 128; i_19_++) {
						float f = (float) ((is[i_17_ + i_19_] & 0xff) - (is[i_18_ + i_19_] & 0xff));
						float f_20_ = (float) ((is[i_16_ + (i_19_ - 1 & 0x7f)] & 0xff) - (is[i_16_ + (i_19_ + 1 & 0x7f)] & 0xff));
						float f_21_ = (float) (128.0 / Math.sqrt((double) (f_20_ * f_20_ + 16384.0F + f * f)));
						is_11_[i++] = (byte) (int) (f_20_ * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (128.0F * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (f * f_21_ + 127.0F);
						is_11_[i++] = is[i_13_++];
					}
				}
			}
			anInterface1_480 = (((Class49) this).aClass505_Sub2_481.method13962(Class150.aClass150_1949, 128, 128, 16, true, is_11_));
		}
		return anInterface1_480 != null;
	}

	static void method972() {
		if (anObject482 == null) {
			Class370_Sub1_Sub1 class370_sub1_sub1 = new Class370_Sub1_Sub1();
			byte[] is = class370_sub1_sub1.method15431(128, 128, 16);
			anObject482 = Class309.method5493(is, false, (byte) 80);
		}
		if (anObject477 == null) {
			Class370_Sub2_Sub1 class370_sub2_sub1 = new Class370_Sub2_Sub1();
			byte[] is = class370_sub2_sub1.method15442(128, 128, 16);
			anObject477 = Class309.method5493(is, false, (byte) 28);
		}
	}

	public boolean method973() {
		return (aBool474 ? ((Class49) this).anInterface1_475 != null : ((Class49) this).anInterface6Array476 != null);
	}

	public boolean method974() {
		return (aBool474 ? ((Class49) this).anInterface1_475 != null : ((Class49) this).anInterface6Array476 != null);
	}

	public boolean method975() {
		return (aBool474 ? ((Class49) this).anInterface1_475 != null : ((Class49) this).anInterface6Array476 != null);
	}

	public boolean method976() {
		if (!((Class49) this).aClass505_Sub2_481.aBool8827)
			return false;
		if (anInterface1_480 == null) {
			if (anObject483 == null) {
				byte[] is = Class264.method4782(128, 128, 16, 8, new Class261_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject483 = Class309.method5493(is, false, (byte) 81);
			}
			byte[] is = Class346.toByteArray(anObject483, false, (byte) 1);
			byte[] is_22_ = new byte[is.length * 4];
			int i = 0;
			for (int i_23_ = 0; i_23_ < 16; i_23_++) {
				int i_24_ = i_23_ * 16384;
				int i_25_ = i_24_;
				for (int i_26_ = 0; i_26_ < 128; i_26_++) {
					int i_27_ = i_25_ + i_26_ * 128;
					int i_28_ = i_25_ + (i_26_ - 1 & 0x7f) * 128;
					int i_29_ = i_25_ + (i_26_ + 1 & 0x7f) * 128;
					for (int i_30_ = 0; i_30_ < 128; i_30_++) {
						float f = (float) ((is[i_28_ + i_30_] & 0xff) - (is[i_29_ + i_30_] & 0xff));
						float f_31_ = (float) ((is[i_27_ + (i_30_ - 1 & 0x7f)] & 0xff) - (is[i_27_ + (i_30_ + 1 & 0x7f)] & 0xff));
						float f_32_ = (float) (128.0 / Math.sqrt((double) (f_31_ * f_31_ + 16384.0F + f * f)));
						is_22_[i++] = (byte) (int) (f_31_ * f_32_ + 127.0F);
						is_22_[i++] = (byte) (int) (128.0F * f_32_ + 127.0F);
						is_22_[i++] = (byte) (int) (f * f_32_ + 127.0F);
						is_22_[i++] = is[i_24_++];
					}
				}
			}
			anInterface1_480 = (((Class49) this).aClass505_Sub2_481.method13962(Class150.aClass150_1949, 128, 128, 16, true, is_22_));
		}
		return anInterface1_480 != null;
	}
}
