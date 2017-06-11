/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class139 {
	static Class139 aClass139_1545;
	static Class139 aClass139_1546;
	static Class139 aClass139_1547 = new Class139();
	static int anInt1548;

	public int method1545(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = (Class462.anInt5683 * -2110394505 > i_0_ ? -2110394505 * Class462.anInt5683 : i_0_);
			if (aClass139_1547 == this)
				return 0;
			if (aClass139_1545 == this)
				return i_2_ - i;
			if (aClass139_1546 == this)
				return (i_2_ - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.f(").append(')').toString());
		}
	}

	Class139() {
		/* empty */
	}

	static {
		aClass139_1546 = new Class139();
		aClass139_1545 = new Class139();
	}

	static final void method1546(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_3_, -1927807761);
			String string = "";
			if (null != class102 && class102.aString1091 != null)
				string = class102.aString1091;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.acs(").append(')').toString());
		}
	}

	static final void method1547(ClientScript2 class403, byte i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class301.method3708(i_4_ >> 14 & 0x3fff, i_4_ & 0x3fff);
			if (class298_sub37_sub13 == null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class298_sub37_sub13.anInt9643 * -947282109;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.adh(").append(')').toString());
		}
	}

	public static void method1548(String string, boolean bool, GraphicsToolkit class_ra, Class264 class264, Class505 class505, byte i) {
		try {
			boolean bool_5_ = (!Class372_Sub3.aBoolean7730 || Class309.method3804(-2107815446));
			if (bool_5_) {
				if (Class372_Sub3.aBoolean7730 && bool_5_) {
					class505 = Class14.aClass505_176;
					class264 = class_ra.method5092(class505, Class14.aClass89Array169, true);
					int i_6_ = class505.method6259(string, 250, null, -2064618715);
					int i_7_ = class505.method6260(string, 250, -2028004825 * class505.anInt6200, null, -804719139);
					int i_8_ = Class422_Sub30.aClass89_8437.anInt812;
					int i_9_ = 4 + i_8_;
					i_6_ += 2 * i_9_;
					i_7_ += i_9_ * 2;
					if (i_6_ < 646794549 * Class14.anInt172)
						i_6_ = 646794549 * Class14.anInt172;
					if (i_7_ < Class14.anInt175 * 1004672961)
						i_7_ = 1004672961 * Class14.anInt175;
					int i_10_ = (Class14.aClass139_171.method1545(i_6_, (client.anInt8794 * 775068819), -1808907629) + -994816289 * Class14.anInt170);
					int i_11_ = (Class14.aClass133_177.method1482(i_7_, (client.anInt8803 * -791746413), -750031668) + -277668631 * Class14.anInt173);
					class_ra.method5125(Class385.aClass89_4142, false).method662(i_10_ + Class98_Sub2.aClass89_6932.anInt812, Class98_Sub2.aClass89_6932.anInt816 + i_11_, i_6_ - Class98_Sub2.aClass89_6932.anInt812 * 2, i_7_ - 2 * Class98_Sub2.aClass89_6932.anInt816, 1, 0, 0);
					class_ra.method5125(Class98_Sub2.aClass89_6932, true).method645(i_10_, i_11_);
					Class98_Sub2.aClass89_6932.method992();
					class_ra.method5125(Class98_Sub2.aClass89_6932, true).method645(i_6_ + i_10_ - i_8_, i_11_);
					Class98_Sub2.aClass89_6932.method980();
					class_ra.method5125(Class98_Sub2.aClass89_6932, true).method645(i_6_ + i_10_ - i_8_, i_11_ + i_7_ - i_8_);
					Class98_Sub2.aClass89_6932.method992();
					class_ra.method5125(Class98_Sub2.aClass89_6932, true).method645(i_10_, i_7_ + i_11_ - i_8_);
					Class98_Sub2.aClass89_6932.method980();
					class_ra.method5125(Class422_Sub30.aClass89_8437, true).method636(i_10_, i_11_ + Class98_Sub2.aClass89_6932.anInt816, i_8_, i_7_ - 2 * Class98_Sub2.aClass89_6932.anInt816);
					Class422_Sub30.aClass89_8437.method989();
					class_ra.method5125(Class422_Sub30.aClass89_8437, true).method636(Class98_Sub2.aClass89_6932.anInt812 + i_10_, i_11_, i_6_ - 2 * Class98_Sub2.aClass89_6932.anInt812, i_8_);
					Class422_Sub30.aClass89_8437.method989();
					class_ra.method5125(Class422_Sub30.aClass89_8437, true).method636(i_10_ + i_6_ - i_8_, i_11_ + Class98_Sub2.aClass89_6932.anInt816, i_8_, i_7_ - 2 * Class98_Sub2.aClass89_6932.anInt816);
					Class422_Sub30.aClass89_8437.method989();
					class_ra.method5125(Class422_Sub30.aClass89_8437, true).method636(i_10_ + Class98_Sub2.aClass89_6932.anInt812, i_11_ + i_7_ - i_8_, i_6_ - 2 * Class98_Sub2.aClass89_6932.anInt812, i_8_);
					Class422_Sub30.aClass89_8437.method989();
					class264.method2475(string, i_9_ + i_10_, i_11_ + i_9_, i_6_ - i_9_ * 2, i_7_ - 2 * i_9_, (-617134757 * Class428.anInt6623 | ~0xffffff), -1, 1, 1, 0, null, null, null, 0, 0, -45995166);
					Class227.method2112(i_10_, i_11_, i_6_, i_7_, (byte) 2);
				} else {
					int i_12_ = class505.method6259(string, 250, null, -570698918);
					int i_13_ = (class505.method6262(string, 250, null, 1328812176) * 13);
					int i_14_ = 4;
					int i_15_ = 6 + i_14_;
					int i_16_ = 6 + i_14_;
					class_ra.B(i_15_ - i_14_, i_16_ - i_14_, i_14_ + (i_12_ + i_14_), i_13_ + i_14_ + i_14_, -16777216, 0);
					class_ra.method5019(i_15_ - i_14_, i_16_ - i_14_, i_14_ + (i_12_ + i_14_), i_13_ + i_14_ + i_14_, -1, 0);
					class264.method2475(string, i_15_, i_16_, i_12_, i_13_, -1, -1, 1, 1, 0, null, null, null, 0, 0, -45995166);
					Class227.method2112(i_15_ - i_14_, i_16_ - i_14_, i_14_ + i_12_ + i_14_, i_13_ + i_14_ + i_14_, (byte) 2);
				}
				if (bool) {
					try {
						class_ra.method4988((byte) 18);
					} catch (Exception_Sub1 exception_sub1) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.b(").append(')').toString());
		}
	}

	static final void method1549(int i, int i_17_, int i_18_, int i_19_, int i_20_) {
		try {
			Class125.method1400(i, i_17_, i_18_, 0, i_19_, false, 2074024195);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.jb(").append(')').toString());
		}
	}

	static final void method1550(ClientScript2 class403, byte i) {
		try {
			int i_21_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_21_, (byte) 74);
			Class119 class119 = Class389.aClass119Array4165[i_21_ >> 16];
			Class247.method2363(class105, class119, class403, 2008837273);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.ff(").append(')').toString());
		}
	}

	static final void method1551(ClientScript2 class403, int i) {
		try {
			Class298_Sub28.method3109((byte) 32);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fq.ahw(").append(')').toString());
		}
	}
}
