/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class159 {
	static int anInt1617 = 128;
	Class_ra_Sub3 aClass_ra_Sub3_1618;
	static int anInt1619 = 128;
	Interface9_Impl2[] anInterface9_Impl2Array1620 = null;
	public boolean aBoolean1621;
	static Object anObject1622;
	Interface9_Impl3 anInterface9_Impl3_1623 = null;
	public Interface9_Impl2[] anInterface9_Impl2Array1624 = null;
	public Interface9_Impl3 anInterface9_Impl3_1625 = null;
	public Interface9_Impl3 anInterface9_Impl3_1626 = null;
	public static int anInt1627 = 16;
	static Object anObject1628;
	static Object anObject1629;

	Class159(Class_ra_Sub3 class_ra_sub3) {
		((Class159) this).aClass_ra_Sub3_1618 = class_ra_sub3;
		aBoolean1621 = ((Class159) this).aClass_ra_Sub3_1618.aBoolean8365;
		if (aBoolean1621 && !((Class159) this).aClass_ra_Sub3_1618.method5349(Class55.aClass55_565, Class77.aClass77_717))
			aBoolean1621 = false;
		if (aBoolean1621 || ((Class159) this).aClass_ra_Sub3_1618.method5348(Class55.aClass55_565, Class77.aClass77_717)) {
			method1706();
			if (!aBoolean1621) {
				((Class159) this).anInterface9_Impl2Array1620 = new Interface9_Impl2[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class415.method5586(anObject1622, i * 32768, 32768, (byte) 1);
					((Class159) this).anInterface9_Impl2Array1620[i] = (((Class159) this).aClass_ra_Sub3_1618.method5351(Class55.aClass55_565, 128, 128, true, is));
				}
				anInterface9_Impl2Array1624 = new Interface9_Impl2[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class415.method5586(anObject1628, i * 32768, 32768, (byte) 1);
					anInterface9_Impl2Array1624[i] = (((Class159) this).aClass_ra_Sub3_1618.method5351(Class55.aClass55_565, 128, 128, true, is));
				}
			} else {
				byte[] is = Class338.method4114(anObject1622, false, 1565550558);
				((Class159) this).anInterface9_Impl3_1623 = (((Class159) this).aClass_ra_Sub3_1618.method5416(Class55.aClass55_565, 128, 128, 16, true, is));
				is = Class338.method4114(anObject1628, false, -1292209598);
				anInterface9_Impl3_1625 = (((Class159) this).aClass_ra_Sub3_1618.method5416(Class55.aClass55_565, 128, 128, 16, true, is));
			}
		}
	}

	public boolean method1704() {
		return (aBoolean1621 ? ((Class159) this).anInterface9_Impl3_1623 != null : ((Class159) this).anInterface9_Impl2Array1620 != null);
	}

	public boolean method1705() {
		if (!((Class159) this).aClass_ra_Sub3_1618.aBoolean8365)
			return false;
		if (anInterface9_Impl3_1626 == null) {
			if (anObject1629 == null) {
				byte[] is = Class306.method3756(128, 128, 16, 8, new Class307_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject1629 = Class158.method1702(is, false, (short) 13525);
			}
			byte[] is = Class338.method4114(anObject1629, false, 466014049);
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
			anInterface9_Impl3_1626 = (((Class159) this).aClass_ra_Sub3_1618.method5416(Class55.aClass55_557, 128, 128, 16, true, is_0_));
		}
		return anInterface9_Impl3_1626 != null;
	}

	static void method1706() {
		if (anObject1622 == null) {
			Class213_Sub2_Sub1 class213_sub2_sub1 = new Class213_Sub2_Sub1();
			byte[] is = class213_sub2_sub1.method1977(128, 128, 16);
			anObject1622 = Class158.method1702(is, false, (short) 5197);
		}
		if (anObject1628 == null) {
			Class213_Sub1_Sub1 class213_sub1_sub1 = new Class213_Sub1_Sub1();
			byte[] is = class213_sub1_sub1.method1972(128, 128, 16);
			anObject1628 = Class158.method1702(is, false, (short) 9144);
		}
	}
}
