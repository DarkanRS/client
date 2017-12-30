/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class538 {
	Class457 aClass457_7100;
	Class59 aClass59_7101;
	Class539 aClass539_7102;
	int anInt7103 = 0;
	int anInt7104;
	boolean aBool7105;
	long aLong7106;
	boolean aBool7107 = false;
	int anInt7108;
	Class234 aClass234_7109;
	Class87 aClass87_7110;
	int anInt7111;
	int anInt7112;
	int anInt7113;
	int anInt7114;
	Class234 aClass234_7115 = new Class234();
	int anInt7116;
	int anInt7117;
	boolean aBool7118;

	void method11493(Class505 class505, long l, int i, boolean bool, int i_0_) {
		if (((Class538) this).aBool7107)
			bool = false;
		else if (-391332475 * Class235.anInt2906 < ((Class538) this).aClass59_7101.anInt571 * 1928824825)
			bool = false;
		else if (-354764491 * Class235.anInt2903 > Class89.anIntArray934[-391332475 * Class235.anInt2906])
			bool = false;
		else if (((Class538) this).aBool7105)
			bool = false;
		else if (((Class538) this).aClass59_7101.anInt535 * 1421742661 != -1) {
			int i_1_ = (int) (l - ((Class538) this).aLong7106 * 2280700155061459571L);
			if (!((Class538) this).aClass59_7101.aBool568 && (i_1_ > ((Class538) this).aClass59_7101.anInt535 * 1421742661))
				bool = false;
			else
				i_1_ %= 1421742661 * ((Class538) this).aClass59_7101.anInt535;
			if (!((Class538) this).aClass59_7101.aBool567 && (i_1_ < 1733627243 * ((Class538) this).aClass59_7101.anInt537))
				bool = false;
			if (((Class538) this).aClass59_7101.aBool567 && (i_1_ >= 1733627243 * ((Class538) this).aClass59_7101.anInt537))
				bool = false;
		}
		((Class538) this).anInt7104 = 0;
		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7659(301908602)); class275_sub1_sub1_sub1 != null; class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7650((byte) 88))) {
			class275_sub1_sub1_sub1.method15967(l, i);
			((Class538) this).anInt7104 += -621421001;
		}
		if (bool) {
			int i_2_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2890 * 612300759) + (-1238511007 * ((Class234) (((Class538) this).aClass234_7115)).anInt2893 + (((Class234) ((Class538) this).aClass234_7115).anInt2888) * 644521341)) / 3);
			int i_3_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2885 * -2116698901) + -445820465 * ((Class234) ((Class538) this).aClass234_7115).anInt2895 + -267446389 * ((Class234) (((Class538) this).aClass234_7115)).anInt2891) / 3);
			int i_4_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2886 * 1434240987) + -1183640035 * ((Class234) (((Class538) this).aClass234_7115)).anInt2889 + (((Class234) ((Class538) this).aClass234_7115).anInt2884 * -17399029)) / 3);
			if (i_2_ != (((Class234) ((Class538) this).aClass234_7115).anInt2894) * -1219492825 || i_3_ != (((Class234) ((Class538) this).aClass234_7115).anInt2887) * -556077091 || -1774643233 * (((Class234) ((Class538) this).aClass234_7115).anInt2892) != i_4_ || !((Class538) this).aBool7118) {
				((Class234) ((Class538) this).aClass234_7115).anInt2894 = 300755863 * i_2_;
				((Class234) ((Class538) this).aClass234_7115).anInt2887 = -891559819 * i_3_;
				((Class234) ((Class538) this).aClass234_7115).anInt2892 = -493001697 * i_4_;
				int i_5_ = (-1238511007 * ((Class234) (((Class538) this).aClass234_7115)).anInt2893 - 644521341 * ((Class234) (((Class538) this).aClass234_7115)).anInt2888);
				int i_6_ = (-445820465 * ((Class234) (((Class538) this).aClass234_7115)).anInt2895 - (((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901);
				int i_7_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2889 * -1183640035) - (((Class234) ((Class538) this).aClass234_7115).anInt2886) * 1434240987);
				int i_8_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2890 * 612300759) - 644521341 * ((Class234) (((Class538) this).aClass234_7115)).anInt2888);
				int i_9_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2891 * -267446389) - (((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901);
				int i_10_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2884 * -17399029) - (((Class234) ((Class538) this).aClass234_7115).anInt2886) * 1434240987);
				((Class538) this).anInt7108 = (i_6_ * i_10_ - i_7_ * i_9_) * -1046677935;
				((Class538) this).anInt7111 = (i_7_ * i_8_ - i_5_ * i_10_) * 1092713695;
				for (((Class538) this).anInt7112 = 1789133273 * (i_5_ * i_9_ - i_8_ * i_6_); (((Class538) this).anInt7108 * 883430065 > 32767 || ((Class538) this).anInt7111 * -1867956449 > 32767 || -210735511 * ((Class538) this).anInt7112 > 32767 || ((Class538) this).anInt7108 * 883430065 < -32767 || -1867956449 * ((Class538) this).anInt7111 < -32767
						|| -210735511 * ((Class538) this).anInt7112 < -32767); ((Class538) this).anInt7112 = ((-210735511 * ((Class538) this).anInt7112 >> 1) * 1789133273)) {
					((Class538) this).anInt7108 = ((((Class538) this).anInt7108 * 883430065 >> 1) * -1046677935);
					((Class538) this).anInt7111 = ((-1867956449 * ((Class538) this).anInt7111 >> 1) * 1092713695);
				}
				int i_11_ = (int) (Math.sqrt((double) ((-210735511 * ((Class538) this).anInt7112 * (-210735511 * ((Class538) this).anInt7112)) + ((-1867956449 * ((Class538) this).anInt7111 * (((Class538) this).anInt7111 * -1867956449)) + (((Class538) this).anInt7108 * 883430065 * (883430065 * (((Class538) this).anInt7108)))))));
				if (i_11_ <= 0)
					i_11_ = 1;
				((Class538) this).anInt7108 = (-726635185 * ((Class538) this).anInt7108 / i_11_ * -1046677935);
				((Class538) this).anInt7111 = 1092713695 * (249970913 * ((Class538) this).anInt7111 / i_11_);
				((Class538) this).anInt7112 = (((Class538) this).anInt7112 * 1136923031 / i_11_ * 1789133273);
				if (((Class538) this).aClass59_7101.aShort570 > 0 || ((Class538) this).aClass59_7101.aShort579 > 0) {
					int i_12_ = (int) (Math.atan2((double) (-210735511 * (((Class538) this).anInt7112)), (double) ((((Class538) this).anInt7108) * 883430065)) * 2607.5945876176133);
					int i_13_ = (int) ((Math.atan2((double) (-1867956449 * ((Class538) this).anInt7111), Math.sqrt((double) (((((Class538) this).anInt7108) * 883430065 * (883430065 * (((Class538) this).anInt7108))) + (-210735511 * (((Class538) this).anInt7112) * ((((Class538) this).anInt7112) * -210735511)))))) * 2607.5945876176133);
					((Class538) this).anInt7114 = ((((Class538) this).aClass59_7101.aShort570 - ((Class538) this).aClass59_7101.aShort530) * -5660799);
					((Class538) this).anInt7113 = (683540327 * (((Class538) this).aClass59_7101.aShort530 + i_12_ - (((Class538) this).anInt7114 * -757686143 >> 1)));
					((Class538) this).anInt7116 = (-1772978221 * (((Class538) this).aClass59_7101.aShort579 - ((Class538) this).aClass59_7101.aShort536));
					((Class538) this).anInt7117 = ((i_13_ + ((Class538) this).aClass59_7101.aShort536 - (((Class538) this).anInt7116 * -1202245541 >> 1)) * -530799909);
				}
				((Class538) this).aBool7118 = true;
			}
			((Class538) this).anInt7103 += (int) ((double) i * ((double) (((Class538) this).aClass59_7101.anInt546 * -1826783957) + (Math.random() * (double) (-51746139 * (((Class538) this).aClass59_7101.anInt545) - ((((Class538) this).aClass59_7101.anInt546) * -1826783957))))) * 950353803;
			if (1547890723 * ((Class538) this).anInt7103 > 63) {
				int i_14_ = 1547890723 * ((Class538) this).anInt7103 >> 6;
				((Class538) this).anInt7103 = 950353803 * (1547890723 * ((Class538) this).anInt7103 & 0x3f);
				int i_15_ = (i << 8) / i_14_;
				int i_16_ = 0;
				int i_17_ = 0;
				while (i_17_ < i_14_) {
					int i_18_;
					int i_19_;
					int i_20_;
					if (((Class538) this).aClass59_7101.aShort570 > 0 || ((Class538) this).aClass59_7101.aShort579 > 0) {
						int i_21_ = (-1922847657 * ((Class538) this).anInt7113 + (int) ((double) (-757686143 * (((Class538) this).anInt7114)) * Math.random()));
						i_21_ &= 0x3fff;
						int i_22_ = Class382.anIntArray4657[i_21_];
						int i_23_ = Class382.anIntArray4661[i_21_];
						int i_24_ = (-42956461 * ((Class538) this).anInt7117 + (int) ((double) (-1202245541 * (((Class538) this).anInt7116)) * Math.random()));
						i_24_ &= 0x1fff;
						int i_25_ = Class382.anIntArray4657[i_24_];
						int i_26_ = Class382.anIntArray4661[i_24_];
						int i_27_ = 13;
						i_18_ = i_23_ * i_25_ >> i_27_;
						i_19_ = -1 * (i_26_ << 1);
						i_20_ = i_25_ * i_22_ >> i_27_;
					} else {
						i_18_ = ((Class538) this).anInt7108 * 883430065;
						i_19_ = ((Class538) this).anInt7111 * -1867956449;
						i_20_ = ((Class538) this).anInt7112 * -210735511;
					}
					float f = (float) Math.random();
					float f_28_ = (float) Math.random();
					if (f + f_28_ > 1.0F) {
						f = 1.0F - f;
						f_28_ = 1.0F - f_28_;
					}
					float f_29_ = 1.0F - (f + f_28_);
					int i_30_ = (int) (f_28_ * (float) (((Class234) (((Class538) this).aClass234_7115)).anInt2893 * -1238511007) + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2888) * 644521341) * f + (f_29_ * (float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2890) * 612300759)));
					int i_31_ = (int) ((float) (-445820465 * (((Class234) ((Class538) this).aClass234_7115).anInt2895)) * f_28_ + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901) * f + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2891) * -267446389) * f_29_);
					int i_32_ = (int) (f_29_ * (float) (((Class234) (((Class538) this).aClass234_7115)).anInt2884 * -17399029) + ((float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2886) * 1434240987) * f + f_28_ * (float) (-1183640035 * (((Class234) (((Class538) this).aClass234_7115)).anInt2889))));
					int i_33_ = ((-768945749 * ((Class538) this).aClass59_7101.anInt538) + (int) (Math.random() * (double) ((-1453312369 * (((Class538) this).aClass59_7101.anInt539)) - ((((Class538) this).aClass59_7101.anInt538) * -768945749))));
					int i_34_ = ((-481955231 * ((Class538) this).aClass59_7101.anInt555) + (int) (Math.random() * (double) (((((Class538) this).aClass59_7101.anInt556) * 1730929631) - ((((Class538) this).aClass59_7101.anInt555) * -481955231))));
					int i_35_ = ((1234374815 * ((Class538) this).aClass59_7101.anInt544) + (int) (Math.random() * (double) (197487861 * (((Class538) this).aClass59_7101.anInt577) - (1234374815 * (((Class538) this).aClass59_7101.anInt544)))));
					int i_36_;
					if (((Class538) this).aClass59_7101.aBool550) {
						double d = Math.random();
						i_36_ = ((int) (d * (double) (1058779855 * (((Class538) this).aClass59_7101.anInt581)) + (double) (-53681217 * (((Class538) this).aClass59_7101.anInt565))) << 16 | (int) ((double) ((((Class538) this).aClass59_7101.anInt551) * 1513056797) + d * (double) (-87647421 * (((Class538) this).aClass59_7101.anInt584))) << 8 | (int) ((double) ((((Class538) this).aClass59_7101.anInt585) * -2036236121) + d * (double) (-1314769033 * (((Class538) this).aClass59_7101.anInt587)))
								| (int) ((double) (-1834026439 * (((Class538) this).aClass59_7101.anInt588)) + (Math.random() * (double) (59671205 * (((Class538) this).aClass59_7101.anInt590)))) << 24);
					} else
						i_36_ = ((int) ((double) ((((Class538) this).aClass59_7101.anInt565) * -53681217) + (Math.random() * (double) (1058779855 * (((Class538) this).aClass59_7101.anInt581)))) << 16 | (int) ((double) ((((Class538) this).aClass59_7101.anInt551) * 1513056797) + (Math.random() * (double) ((((Class538) this).aClass59_7101.anInt584) * -87647421))) << 8
								| (int) ((double) ((((Class538) this).aClass59_7101.anInt585) * -2036236121) + (Math.random() * (double) (-1314769033 * (((Class538) this).aClass59_7101.anInt587)))) | (int) ((double) (-1834026439 * (((Class538) this).aClass59_7101.anInt588)) + (Math.random() * (double) ((((Class538) this).aClass59_7101.anInt590) * 59671205))) << 24);
					int i_37_ = (((Class538) this).aClass59_7101.anInt554 * -751231617);
					if (!class505.method8406() && !((Class538) this).aClass59_7101.aBool574)
						i_37_ = -1;
					Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1;
					if (Class235.anInt2905 * -2090761405 != Class235.anInt2902 * -1374337333) {
						class275_sub1_sub1_sub1 = (Class235.aClass275_Sub1_Sub1_Sub1Array2897[-1374337333 * Class235.anInt2902]);
						Class235.anInt2902 = ((1 + -1374337333 * Class235.anInt2902 & 0x3ff) * -29004061);
						class275_sub1_sub1_sub1.method15955(this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_, i_33_, i_34_, i_36_, i_35_, i_37_, ((Class538) this).aClass59_7101.aBool572, ((Class538) this).aClass59_7101.aBool534);
					} else
						class275_sub1_sub1_sub1 = (new Class275_Sub1_Sub1_Sub1(this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_, i_33_, i_34_, i_36_, i_35_, i_37_, ((Class538) this).aClass59_7101.aBool572, ((Class538) this).aClass59_7101.aBool534));
					if (i_16_ > 256)
						class275_sub1_sub1_sub1.method15967(l, i_16_ >> 8);
					((Class538) this).anInt7104 += -621421001;
					i_17_++;
					i_16_ += i_15_;
				}
			}
		}
		if (!((Class538) this).aClass234_7115.method3944(((Class538) this).aClass234_7109, (byte) 15)) {
			Class234 class234 = ((Class538) this).aClass234_7109;
			((Class538) this).aClass234_7109 = ((Class538) this).aClass234_7115;
			((Class538) this).aClass234_7115 = class234;
			((Class234) ((Class538) this).aClass234_7115).anInt2888 = ((Class538) this).aClass87_7110.anInt844 * 289207337;
			((Class234) ((Class538) this).aClass234_7115).anInt2885 = -653305279 * ((Class538) this).aClass87_7110.anInt841;
			((Class234) ((Class538) this).aClass234_7115).anInt2886 = 174222639 * ((Class538) this).aClass87_7110.anInt847;
			((Class234) ((Class538) this).aClass234_7115).anInt2893 = 1283454061 * ((Class538) this).aClass87_7110.anInt834;
			((Class234) ((Class538) this).aClass234_7115).anInt2895 = ((Class538) this).aClass87_7110.anInt843 * 255103181;
			((Class234) ((Class538) this).aClass234_7115).anInt2889 = 1444696369 * ((Class538) this).aClass87_7110.anInt845;
			((Class234) ((Class538) this).aClass234_7115).anInt2890 = ((Class538) this).aClass87_7110.anInt846 * -1788528747;
			((Class234) ((Class538) this).aClass234_7115).anInt2891 = ((Class538) this).aClass87_7110.anInt840 * 1327309173;
			((Class234) ((Class538) this).aClass234_7115).anInt2884 = ((Class538) this).aClass87_7110.anInt848 * 856138047;
			((Class234) ((Class538) this).aClass234_7115).anInt2894 = ((Class234) ((Class538) this).aClass234_7109).anInt2894 * 1;
			((Class234) ((Class538) this).aClass234_7115).anInt2887 = ((Class234) ((Class538) this).aClass234_7109).anInt2887 * 1;
			((Class234) ((Class538) this).aClass234_7115).anInt2892 = 1 * ((Class234) ((Class538) this).aClass234_7109).anInt2892;
		}
		Class235.anInt2900 += ((Class538) this).anInt7104 * 1527961209;
	}

	void method11494(byte i) {
		((Class234) ((Class538) this).aClass234_7115).anInt2888 = 289207337 * ((Class538) this).aClass87_7110.anInt844;
		((Class234) ((Class538) this).aClass234_7115).anInt2885 = ((Class538) this).aClass87_7110.anInt841 * -653305279;
		((Class234) ((Class538) this).aClass234_7115).anInt2886 = 174222639 * ((Class538) this).aClass87_7110.anInt847;
		((Class234) ((Class538) this).aClass234_7115).anInt2893 = 1283454061 * ((Class538) this).aClass87_7110.anInt834;
		((Class234) ((Class538) this).aClass234_7115).anInt2895 = 255103181 * ((Class538) this).aClass87_7110.anInt843;
		((Class234) ((Class538) this).aClass234_7115).anInt2889 = 1444696369 * ((Class538) this).aClass87_7110.anInt845;
		((Class234) ((Class538) this).aClass234_7115).anInt2890 = ((Class538) this).aClass87_7110.anInt846 * -1788528747;
		((Class234) ((Class538) this).aClass234_7115).anInt2891 = 1327309173 * ((Class538) this).aClass87_7110.anInt840;
		((Class234) ((Class538) this).aClass234_7115).anInt2884 = ((Class538) this).aClass87_7110.anInt848 * 856138047;
		if (((-1238511007 * ((Class234) ((Class538) this).aClass234_7115).anInt2893) == (((Class234) ((Class538) this).aClass234_7115).anInt2888 * 644521341)) && ((-1238511007 * ((Class234) ((Class538) this).aClass234_7115).anInt2893) == (612300759 * ((Class234) ((Class538) this).aClass234_7115).anInt2890)) && ((-2116698901 * ((Class234) ((Class538) this).aClass234_7115).anInt2885) == (((Class234) ((Class538) this).aClass234_7115).anInt2895 * -445820465))
				&& ((-445820465 * ((Class234) ((Class538) this).aClass234_7115).anInt2895) == (((Class234) ((Class538) this).aClass234_7115).anInt2891 * -267446389)) && ((((Class234) ((Class538) this).aClass234_7115).anInt2889 * -1183640035) == (((Class234) ((Class538) this).aClass234_7115).anInt2886 * 1434240987)) && ((-1183640035 * ((Class234) ((Class538) this).aClass234_7115).anInt2889) == -17399029 * (((Class234) ((Class538) this).aClass234_7115).anInt2884)))
			((Class538) this).aBool7105 = true;
		else if (((Class538) this).aBool7105) {
			((Class538) this).aBool7105 = false;
			((Class234) ((Class538) this).aClass234_7109).anInt2888 = ((Class234) ((Class538) this).aClass234_7115).anInt2888 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2885 = ((Class234) ((Class538) this).aClass234_7115).anInt2885 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2886 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2886;
			((Class234) ((Class538) this).aClass234_7109).anInt2893 = ((Class234) ((Class538) this).aClass234_7115).anInt2893 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2895 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2895;
			((Class234) ((Class538) this).aClass234_7109).anInt2889 = ((Class234) ((Class538) this).aClass234_7115).anInt2889 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2890 = ((Class234) ((Class538) this).aClass234_7115).anInt2890 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2891 = ((Class234) ((Class538) this).aClass234_7115).anInt2891 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2884 = ((Class234) ((Class538) this).aClass234_7115).anInt2884 * 1;
		}
	}

	void method11495(Class505 class505, long l, int i, boolean bool) {
		if (((Class538) this).aBool7107)
			bool = false;
		else if (-391332475 * Class235.anInt2906 < ((Class538) this).aClass59_7101.anInt571 * 1928824825)
			bool = false;
		else if (-354764491 * Class235.anInt2903 > Class89.anIntArray934[-391332475 * Class235.anInt2906])
			bool = false;
		else if (((Class538) this).aBool7105)
			bool = false;
		else if (((Class538) this).aClass59_7101.anInt535 * 1421742661 != -1) {
			int i_38_ = (int) (l - ((Class538) this).aLong7106 * 2280700155061459571L);
			if (!((Class538) this).aClass59_7101.aBool568 && (i_38_ > ((Class538) this).aClass59_7101.anInt535 * 1421742661))
				bool = false;
			else
				i_38_ %= 1421742661 * ((Class538) this).aClass59_7101.anInt535;
			if (!((Class538) this).aClass59_7101.aBool567 && (i_38_ < 1733627243 * ((Class538) this).aClass59_7101.anInt537))
				bool = false;
			if (((Class538) this).aClass59_7101.aBool567 && (i_38_ >= 1733627243 * ((Class538) this).aClass59_7101.anInt537))
				bool = false;
		}
		((Class538) this).anInt7104 = 0;
		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7659(301908602)); class275_sub1_sub1_sub1 != null; class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7650((byte) 27))) {
			class275_sub1_sub1_sub1.method15967(l, i);
			((Class538) this).anInt7104 += -621421001;
		}
		if (bool) {
			int i_39_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2890 * 612300759) + (-1238511007 * ((Class234) (((Class538) this).aClass234_7115)).anInt2893 + (((Class234) ((Class538) this).aClass234_7115).anInt2888) * 644521341)) / 3);
			int i_40_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2885 * -2116698901) + -445820465 * ((Class234) ((Class538) this).aClass234_7115).anInt2895 + -267446389 * ((Class234) (((Class538) this).aClass234_7115)).anInt2891) / 3);
			int i_41_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2886 * 1434240987) + -1183640035 * ((Class234) (((Class538) this).aClass234_7115)).anInt2889 + (((Class234) ((Class538) this).aClass234_7115).anInt2884 * -17399029)) / 3);
			if (i_39_ != (((Class234) ((Class538) this).aClass234_7115).anInt2894) * -1219492825 || i_40_ != (((Class234) ((Class538) this).aClass234_7115).anInt2887) * -556077091 || -1774643233 * (((Class234) ((Class538) this).aClass234_7115).anInt2892) != i_41_ || !((Class538) this).aBool7118) {
				((Class234) ((Class538) this).aClass234_7115).anInt2894 = 300755863 * i_39_;
				((Class234) ((Class538) this).aClass234_7115).anInt2887 = -891559819 * i_40_;
				((Class234) ((Class538) this).aClass234_7115).anInt2892 = -493001697 * i_41_;
				int i_42_ = (-1238511007 * ((Class234) (((Class538) this).aClass234_7115)).anInt2893 - 644521341 * ((Class234) (((Class538) this).aClass234_7115)).anInt2888);
				int i_43_ = (-445820465 * ((Class234) (((Class538) this).aClass234_7115)).anInt2895 - (((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901);
				int i_44_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2889 * -1183640035) - (((Class234) ((Class538) this).aClass234_7115).anInt2886) * 1434240987);
				int i_45_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2890 * 612300759) - 644521341 * ((Class234) (((Class538) this).aClass234_7115)).anInt2888);
				int i_46_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2891 * -267446389) - (((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901);
				int i_47_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2884 * -17399029) - (((Class234) ((Class538) this).aClass234_7115).anInt2886) * 1434240987);
				((Class538) this).anInt7108 = (i_43_ * i_47_ - i_44_ * i_46_) * -1046677935;
				((Class538) this).anInt7111 = (i_44_ * i_45_ - i_42_ * i_47_) * 1092713695;
				for (((Class538) this).anInt7112 = 1789133273 * (i_42_ * i_46_ - i_45_ * i_43_); (((Class538) this).anInt7108 * 883430065 > 32767 || ((Class538) this).anInt7111 * -1867956449 > 32767 || -210735511 * ((Class538) this).anInt7112 > 32767 || ((Class538) this).anInt7108 * 883430065 < -32767 || -1867956449 * ((Class538) this).anInt7111 < -32767
						|| -210735511 * ((Class538) this).anInt7112 < -32767); ((Class538) this).anInt7112 = ((-210735511 * ((Class538) this).anInt7112 >> 1) * 1789133273)) {
					((Class538) this).anInt7108 = ((((Class538) this).anInt7108 * 883430065 >> 1) * -1046677935);
					((Class538) this).anInt7111 = ((-1867956449 * ((Class538) this).anInt7111 >> 1) * 1092713695);
				}
				int i_48_ = (int) (Math.sqrt((double) ((-210735511 * ((Class538) this).anInt7112 * (-210735511 * ((Class538) this).anInt7112)) + ((-1867956449 * ((Class538) this).anInt7111 * (((Class538) this).anInt7111 * -1867956449)) + (((Class538) this).anInt7108 * 883430065 * (883430065 * (((Class538) this).anInt7108)))))));
				if (i_48_ <= 0)
					i_48_ = 1;
				((Class538) this).anInt7108 = (-726635185 * ((Class538) this).anInt7108 / i_48_ * -1046677935);
				((Class538) this).anInt7111 = 1092713695 * (249970913 * ((Class538) this).anInt7111 / i_48_);
				((Class538) this).anInt7112 = (((Class538) this).anInt7112 * 1136923031 / i_48_ * 1789133273);
				if (((Class538) this).aClass59_7101.aShort570 > 0 || ((Class538) this).aClass59_7101.aShort579 > 0) {
					int i_49_ = (int) (Math.atan2((double) (-210735511 * (((Class538) this).anInt7112)), (double) ((((Class538) this).anInt7108) * 883430065)) * 2607.5945876176133);
					int i_50_ = (int) ((Math.atan2((double) (-1867956449 * ((Class538) this).anInt7111), Math.sqrt((double) (((((Class538) this).anInt7108) * 883430065 * (883430065 * (((Class538) this).anInt7108))) + (-210735511 * (((Class538) this).anInt7112) * ((((Class538) this).anInt7112) * -210735511)))))) * 2607.5945876176133);
					((Class538) this).anInt7114 = ((((Class538) this).aClass59_7101.aShort570 - ((Class538) this).aClass59_7101.aShort530) * -5660799);
					((Class538) this).anInt7113 = (683540327 * (((Class538) this).aClass59_7101.aShort530 + i_49_ - (((Class538) this).anInt7114 * -757686143 >> 1)));
					((Class538) this).anInt7116 = (-1772978221 * (((Class538) this).aClass59_7101.aShort579 - ((Class538) this).aClass59_7101.aShort536));
					((Class538) this).anInt7117 = ((i_50_ + ((Class538) this).aClass59_7101.aShort536 - (((Class538) this).anInt7116 * -1202245541 >> 1)) * -530799909);
				}
				((Class538) this).aBool7118 = true;
			}
			((Class538) this).anInt7103 += (int) ((double) i * ((double) (((Class538) this).aClass59_7101.anInt546 * -1826783957) + (Math.random() * (double) (-51746139 * (((Class538) this).aClass59_7101.anInt545) - ((((Class538) this).aClass59_7101.anInt546) * -1826783957))))) * 950353803;
			if (1547890723 * ((Class538) this).anInt7103 > 63) {
				int i_51_ = 1547890723 * ((Class538) this).anInt7103 >> 6;
				((Class538) this).anInt7103 = 950353803 * (1547890723 * ((Class538) this).anInt7103 & 0x3f);
				int i_52_ = (i << 8) / i_51_;
				int i_53_ = 0;
				int i_54_ = 0;
				while (i_54_ < i_51_) {
					int i_55_;
					int i_56_;
					int i_57_;
					if (((Class538) this).aClass59_7101.aShort570 > 0 || ((Class538) this).aClass59_7101.aShort579 > 0) {
						int i_58_ = (-1922847657 * ((Class538) this).anInt7113 + (int) ((double) (-757686143 * (((Class538) this).anInt7114)) * Math.random()));
						i_58_ &= 0x3fff;
						int i_59_ = Class382.anIntArray4657[i_58_];
						int i_60_ = Class382.anIntArray4661[i_58_];
						int i_61_ = (-42956461 * ((Class538) this).anInt7117 + (int) ((double) (-1202245541 * (((Class538) this).anInt7116)) * Math.random()));
						i_61_ &= 0x1fff;
						int i_62_ = Class382.anIntArray4657[i_61_];
						int i_63_ = Class382.anIntArray4661[i_61_];
						int i_64_ = 13;
						i_55_ = i_60_ * i_62_ >> i_64_;
						i_56_ = -1 * (i_63_ << 1);
						i_57_ = i_62_ * i_59_ >> i_64_;
					} else {
						i_55_ = ((Class538) this).anInt7108 * 883430065;
						i_56_ = ((Class538) this).anInt7111 * -1867956449;
						i_57_ = ((Class538) this).anInt7112 * -210735511;
					}
					float f = (float) Math.random();
					float f_65_ = (float) Math.random();
					if (f + f_65_ > 1.0F) {
						f = 1.0F - f;
						f_65_ = 1.0F - f_65_;
					}
					float f_66_ = 1.0F - (f + f_65_);
					int i_67_ = (int) (f_65_ * (float) (((Class234) (((Class538) this).aClass234_7115)).anInt2893 * -1238511007) + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2888) * 644521341) * f + (f_66_ * (float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2890) * 612300759)));
					int i_68_ = (int) ((float) (-445820465 * (((Class234) ((Class538) this).aClass234_7115).anInt2895)) * f_65_ + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901) * f + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2891) * -267446389) * f_66_);
					int i_69_ = (int) (f_66_ * (float) (((Class234) (((Class538) this).aClass234_7115)).anInt2884 * -17399029) + ((float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2886) * 1434240987) * f + f_65_ * (float) (-1183640035 * (((Class234) (((Class538) this).aClass234_7115)).anInt2889))));
					int i_70_ = ((-768945749 * ((Class538) this).aClass59_7101.anInt538) + (int) (Math.random() * (double) ((-1453312369 * (((Class538) this).aClass59_7101.anInt539)) - ((((Class538) this).aClass59_7101.anInt538) * -768945749))));
					int i_71_ = ((-481955231 * ((Class538) this).aClass59_7101.anInt555) + (int) (Math.random() * (double) (((((Class538) this).aClass59_7101.anInt556) * 1730929631) - ((((Class538) this).aClass59_7101.anInt555) * -481955231))));
					int i_72_ = ((1234374815 * ((Class538) this).aClass59_7101.anInt544) + (int) (Math.random() * (double) (197487861 * (((Class538) this).aClass59_7101.anInt577) - (1234374815 * (((Class538) this).aClass59_7101.anInt544)))));
					int i_73_;
					if (((Class538) this).aClass59_7101.aBool550) {
						double d = Math.random();
						i_73_ = ((int) (d * (double) (1058779855 * (((Class538) this).aClass59_7101.anInt581)) + (double) (-53681217 * (((Class538) this).aClass59_7101.anInt565))) << 16 | (int) ((double) ((((Class538) this).aClass59_7101.anInt551) * 1513056797) + d * (double) (-87647421 * (((Class538) this).aClass59_7101.anInt584))) << 8 | (int) ((double) ((((Class538) this).aClass59_7101.anInt585) * -2036236121) + d * (double) (-1314769033 * (((Class538) this).aClass59_7101.anInt587)))
								| (int) ((double) (-1834026439 * (((Class538) this).aClass59_7101.anInt588)) + (Math.random() * (double) (59671205 * (((Class538) this).aClass59_7101.anInt590)))) << 24);
					} else
						i_73_ = ((int) ((double) ((((Class538) this).aClass59_7101.anInt565) * -53681217) + (Math.random() * (double) (1058779855 * (((Class538) this).aClass59_7101.anInt581)))) << 16 | (int) ((double) ((((Class538) this).aClass59_7101.anInt551) * 1513056797) + (Math.random() * (double) ((((Class538) this).aClass59_7101.anInt584) * -87647421))) << 8
								| (int) ((double) ((((Class538) this).aClass59_7101.anInt585) * -2036236121) + (Math.random() * (double) (-1314769033 * (((Class538) this).aClass59_7101.anInt587)))) | (int) ((double) (-1834026439 * (((Class538) this).aClass59_7101.anInt588)) + (Math.random() * (double) ((((Class538) this).aClass59_7101.anInt590) * 59671205))) << 24);
					int i_74_ = (((Class538) this).aClass59_7101.anInt554 * -751231617);
					if (!class505.method8406() && !((Class538) this).aClass59_7101.aBool574)
						i_74_ = -1;
					Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1;
					if (Class235.anInt2905 * -2090761405 != Class235.anInt2902 * -1374337333) {
						class275_sub1_sub1_sub1 = (Class235.aClass275_Sub1_Sub1_Sub1Array2897[-1374337333 * Class235.anInt2902]);
						Class235.anInt2902 = ((1 + -1374337333 * Class235.anInt2902 & 0x3ff) * -29004061);
						class275_sub1_sub1_sub1.method15955(this, i_67_, i_68_, i_69_, i_55_, i_56_, i_57_, i_70_, i_71_, i_73_, i_72_, i_74_, ((Class538) this).aClass59_7101.aBool572, ((Class538) this).aClass59_7101.aBool534);
					} else
						class275_sub1_sub1_sub1 = (new Class275_Sub1_Sub1_Sub1(this, i_67_, i_68_, i_69_, i_55_, i_56_, i_57_, i_70_, i_71_, i_73_, i_72_, i_74_, ((Class538) this).aClass59_7101.aBool572, ((Class538) this).aClass59_7101.aBool534));
					if (i_53_ > 256)
						class275_sub1_sub1_sub1.method15967(l, i_53_ >> 8);
					((Class538) this).anInt7104 += -621421001;
					i_54_++;
					i_53_ += i_52_;
				}
			}
		}
		if (!((Class538) this).aClass234_7115.method3944(((Class538) this).aClass234_7109, (byte) 53)) {
			Class234 class234 = ((Class538) this).aClass234_7109;
			((Class538) this).aClass234_7109 = ((Class538) this).aClass234_7115;
			((Class538) this).aClass234_7115 = class234;
			((Class234) ((Class538) this).aClass234_7115).anInt2888 = ((Class538) this).aClass87_7110.anInt844 * 289207337;
			((Class234) ((Class538) this).aClass234_7115).anInt2885 = -653305279 * ((Class538) this).aClass87_7110.anInt841;
			((Class234) ((Class538) this).aClass234_7115).anInt2886 = 174222639 * ((Class538) this).aClass87_7110.anInt847;
			((Class234) ((Class538) this).aClass234_7115).anInt2893 = 1283454061 * ((Class538) this).aClass87_7110.anInt834;
			((Class234) ((Class538) this).aClass234_7115).anInt2895 = ((Class538) this).aClass87_7110.anInt843 * 255103181;
			((Class234) ((Class538) this).aClass234_7115).anInt2889 = 1444696369 * ((Class538) this).aClass87_7110.anInt845;
			((Class234) ((Class538) this).aClass234_7115).anInt2890 = ((Class538) this).aClass87_7110.anInt846 * -1788528747;
			((Class234) ((Class538) this).aClass234_7115).anInt2891 = ((Class538) this).aClass87_7110.anInt840 * 1327309173;
			((Class234) ((Class538) this).aClass234_7115).anInt2884 = ((Class538) this).aClass87_7110.anInt848 * 856138047;
			((Class234) ((Class538) this).aClass234_7115).anInt2894 = ((Class234) ((Class538) this).aClass234_7109).anInt2894 * 1;
			((Class234) ((Class538) this).aClass234_7115).anInt2887 = ((Class234) ((Class538) this).aClass234_7109).anInt2887 * 1;
			((Class234) ((Class538) this).aClass234_7115).anInt2892 = 1 * ((Class234) ((Class538) this).aClass234_7109).anInt2892;
		}
		Class235.anInt2900 += ((Class538) this).anInt7104 * 1527961209;
	}

	void method11496(Class206 class206, Class505 class505, long l) {
		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7659(301908602)); class275_sub1_sub1_sub1 != null; class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7650((byte) 108)))
			class275_sub1_sub1_sub1.method15965(class206, class505, l);
	}

	void method11497() {
		((Class234) ((Class538) this).aClass234_7115).anInt2888 = 289207337 * ((Class538) this).aClass87_7110.anInt844;
		((Class234) ((Class538) this).aClass234_7115).anInt2885 = ((Class538) this).aClass87_7110.anInt841 * -653305279;
		((Class234) ((Class538) this).aClass234_7115).anInt2886 = 174222639 * ((Class538) this).aClass87_7110.anInt847;
		((Class234) ((Class538) this).aClass234_7115).anInt2893 = 1283454061 * ((Class538) this).aClass87_7110.anInt834;
		((Class234) ((Class538) this).aClass234_7115).anInt2895 = 255103181 * ((Class538) this).aClass87_7110.anInt843;
		((Class234) ((Class538) this).aClass234_7115).anInt2889 = 1444696369 * ((Class538) this).aClass87_7110.anInt845;
		((Class234) ((Class538) this).aClass234_7115).anInt2890 = ((Class538) this).aClass87_7110.anInt846 * -1788528747;
		((Class234) ((Class538) this).aClass234_7115).anInt2891 = 1327309173 * ((Class538) this).aClass87_7110.anInt840;
		((Class234) ((Class538) this).aClass234_7115).anInt2884 = ((Class538) this).aClass87_7110.anInt848 * 856138047;
		if (((-1238511007 * ((Class234) ((Class538) this).aClass234_7115).anInt2893) == (((Class234) ((Class538) this).aClass234_7115).anInt2888 * 644521341)) && ((-1238511007 * ((Class234) ((Class538) this).aClass234_7115).anInt2893) == (612300759 * ((Class234) ((Class538) this).aClass234_7115).anInt2890)) && ((-2116698901 * ((Class234) ((Class538) this).aClass234_7115).anInt2885) == (((Class234) ((Class538) this).aClass234_7115).anInt2895 * -445820465))
				&& ((-445820465 * ((Class234) ((Class538) this).aClass234_7115).anInt2895) == (((Class234) ((Class538) this).aClass234_7115).anInt2891 * -267446389)) && ((((Class234) ((Class538) this).aClass234_7115).anInt2889 * -1183640035) == (((Class234) ((Class538) this).aClass234_7115).anInt2886 * 1434240987)) && ((-1183640035 * ((Class234) ((Class538) this).aClass234_7115).anInt2889) == -17399029 * (((Class234) ((Class538) this).aClass234_7115).anInt2884)))
			((Class538) this).aBool7105 = true;
		else if (((Class538) this).aBool7105) {
			((Class538) this).aBool7105 = false;
			((Class234) ((Class538) this).aClass234_7109).anInt2888 = ((Class234) ((Class538) this).aClass234_7115).anInt2888 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2885 = ((Class234) ((Class538) this).aClass234_7115).anInt2885 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2886 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2886;
			((Class234) ((Class538) this).aClass234_7109).anInt2893 = ((Class234) ((Class538) this).aClass234_7115).anInt2893 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2895 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2895;
			((Class234) ((Class538) this).aClass234_7109).anInt2889 = ((Class234) ((Class538) this).aClass234_7115).anInt2889 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2890 = ((Class234) ((Class538) this).aClass234_7115).anInt2890 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2891 = ((Class234) ((Class538) this).aClass234_7115).anInt2891 * 1;
			((Class234) ((Class538) this).aClass234_7109).anInt2884 = ((Class234) ((Class538) this).aClass234_7115).anInt2884 * 1;
		}
	}

	void method11498(Class505 class505, long l, int i, boolean bool) {
		if (((Class538) this).aBool7107)
			bool = false;
		else if (-391332475 * Class235.anInt2906 < ((Class538) this).aClass59_7101.anInt571 * 1928824825)
			bool = false;
		else if (-354764491 * Class235.anInt2903 > Class89.anIntArray934[-391332475 * Class235.anInt2906])
			bool = false;
		else if (((Class538) this).aBool7105)
			bool = false;
		else if (((Class538) this).aClass59_7101.anInt535 * 1421742661 != -1) {
			int i_75_ = (int) (l - ((Class538) this).aLong7106 * 2280700155061459571L);
			if (!((Class538) this).aClass59_7101.aBool568 && (i_75_ > ((Class538) this).aClass59_7101.anInt535 * 1421742661))
				bool = false;
			else
				i_75_ %= 1421742661 * ((Class538) this).aClass59_7101.anInt535;
			if (!((Class538) this).aClass59_7101.aBool567 && (i_75_ < 1733627243 * ((Class538) this).aClass59_7101.anInt537))
				bool = false;
			if (((Class538) this).aClass59_7101.aBool567 && (i_75_ >= 1733627243 * ((Class538) this).aClass59_7101.anInt537))
				bool = false;
		}
		((Class538) this).anInt7104 = 0;
		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7659(301908602)); class275_sub1_sub1_sub1 != null; class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7650((byte) 67))) {
			class275_sub1_sub1_sub1.method15967(l, i);
			((Class538) this).anInt7104 += -621421001;
		}
		if (bool) {
			int i_76_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2890 * 612300759) + (-1238511007 * ((Class234) (((Class538) this).aClass234_7115)).anInt2893 + (((Class234) ((Class538) this).aClass234_7115).anInt2888) * 644521341)) / 3);
			int i_77_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2885 * -2116698901) + -445820465 * ((Class234) ((Class538) this).aClass234_7115).anInt2895 + -267446389 * ((Class234) (((Class538) this).aClass234_7115)).anInt2891) / 3);
			int i_78_ = (((((Class234) ((Class538) this).aClass234_7115).anInt2886 * 1434240987) + -1183640035 * ((Class234) (((Class538) this).aClass234_7115)).anInt2889 + (((Class234) ((Class538) this).aClass234_7115).anInt2884 * -17399029)) / 3);
			if (i_76_ != (((Class234) ((Class538) this).aClass234_7115).anInt2894) * -1219492825 || i_77_ != (((Class234) ((Class538) this).aClass234_7115).anInt2887) * -556077091 || -1774643233 * (((Class234) ((Class538) this).aClass234_7115).anInt2892) != i_78_ || !((Class538) this).aBool7118) {
				((Class234) ((Class538) this).aClass234_7115).anInt2894 = 300755863 * i_76_;
				((Class234) ((Class538) this).aClass234_7115).anInt2887 = -891559819 * i_77_;
				((Class234) ((Class538) this).aClass234_7115).anInt2892 = -493001697 * i_78_;
				int i_79_ = (-1238511007 * ((Class234) (((Class538) this).aClass234_7115)).anInt2893 - 644521341 * ((Class234) (((Class538) this).aClass234_7115)).anInt2888);
				int i_80_ = (-445820465 * ((Class234) (((Class538) this).aClass234_7115)).anInt2895 - (((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901);
				int i_81_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2889 * -1183640035) - (((Class234) ((Class538) this).aClass234_7115).anInt2886) * 1434240987);
				int i_82_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2890 * 612300759) - 644521341 * ((Class234) (((Class538) this).aClass234_7115)).anInt2888);
				int i_83_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2891 * -267446389) - (((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901);
				int i_84_ = ((((Class234) ((Class538) this).aClass234_7115).anInt2884 * -17399029) - (((Class234) ((Class538) this).aClass234_7115).anInt2886) * 1434240987);
				((Class538) this).anInt7108 = (i_80_ * i_84_ - i_81_ * i_83_) * -1046677935;
				((Class538) this).anInt7111 = (i_81_ * i_82_ - i_79_ * i_84_) * 1092713695;
				for (((Class538) this).anInt7112 = 1789133273 * (i_79_ * i_83_ - i_82_ * i_80_); (((Class538) this).anInt7108 * 883430065 > 32767 || ((Class538) this).anInt7111 * -1867956449 > 32767 || -210735511 * ((Class538) this).anInt7112 > 32767 || ((Class538) this).anInt7108 * 883430065 < -32767 || -1867956449 * ((Class538) this).anInt7111 < -32767
						|| -210735511 * ((Class538) this).anInt7112 < -32767); ((Class538) this).anInt7112 = ((-210735511 * ((Class538) this).anInt7112 >> 1) * 1789133273)) {
					((Class538) this).anInt7108 = ((((Class538) this).anInt7108 * 883430065 >> 1) * -1046677935);
					((Class538) this).anInt7111 = ((-1867956449 * ((Class538) this).anInt7111 >> 1) * 1092713695);
				}
				int i_85_ = (int) (Math.sqrt((double) ((-210735511 * ((Class538) this).anInt7112 * (-210735511 * ((Class538) this).anInt7112)) + ((-1867956449 * ((Class538) this).anInt7111 * (((Class538) this).anInt7111 * -1867956449)) + (((Class538) this).anInt7108 * 883430065 * (883430065 * (((Class538) this).anInt7108)))))));
				if (i_85_ <= 0)
					i_85_ = 1;
				((Class538) this).anInt7108 = (-726635185 * ((Class538) this).anInt7108 / i_85_ * -1046677935);
				((Class538) this).anInt7111 = 1092713695 * (249970913 * ((Class538) this).anInt7111 / i_85_);
				((Class538) this).anInt7112 = (((Class538) this).anInt7112 * 1136923031 / i_85_ * 1789133273);
				if (((Class538) this).aClass59_7101.aShort570 > 0 || ((Class538) this).aClass59_7101.aShort579 > 0) {
					int i_86_ = (int) (Math.atan2((double) (-210735511 * (((Class538) this).anInt7112)), (double) ((((Class538) this).anInt7108) * 883430065)) * 2607.5945876176133);
					int i_87_ = (int) ((Math.atan2((double) (-1867956449 * ((Class538) this).anInt7111), Math.sqrt((double) (((((Class538) this).anInt7108) * 883430065 * (883430065 * (((Class538) this).anInt7108))) + (-210735511 * (((Class538) this).anInt7112) * ((((Class538) this).anInt7112) * -210735511)))))) * 2607.5945876176133);
					((Class538) this).anInt7114 = ((((Class538) this).aClass59_7101.aShort570 - ((Class538) this).aClass59_7101.aShort530) * -5660799);
					((Class538) this).anInt7113 = (683540327 * (((Class538) this).aClass59_7101.aShort530 + i_86_ - (((Class538) this).anInt7114 * -757686143 >> 1)));
					((Class538) this).anInt7116 = (-1772978221 * (((Class538) this).aClass59_7101.aShort579 - ((Class538) this).aClass59_7101.aShort536));
					((Class538) this).anInt7117 = ((i_87_ + ((Class538) this).aClass59_7101.aShort536 - (((Class538) this).anInt7116 * -1202245541 >> 1)) * -530799909);
				}
				((Class538) this).aBool7118 = true;
			}
			((Class538) this).anInt7103 += (int) ((double) i * ((double) (((Class538) this).aClass59_7101.anInt546 * -1826783957) + (Math.random() * (double) (-51746139 * (((Class538) this).aClass59_7101.anInt545) - ((((Class538) this).aClass59_7101.anInt546) * -1826783957))))) * 950353803;
			if (1547890723 * ((Class538) this).anInt7103 > 63) {
				int i_88_ = 1547890723 * ((Class538) this).anInt7103 >> 6;
				((Class538) this).anInt7103 = 950353803 * (1547890723 * ((Class538) this).anInt7103 & 0x3f);
				int i_89_ = (i << 8) / i_88_;
				int i_90_ = 0;
				int i_91_ = 0;
				while (i_91_ < i_88_) {
					int i_92_;
					int i_93_;
					int i_94_;
					if (((Class538) this).aClass59_7101.aShort570 > 0 || ((Class538) this).aClass59_7101.aShort579 > 0) {
						int i_95_ = (-1922847657 * ((Class538) this).anInt7113 + (int) ((double) (-757686143 * (((Class538) this).anInt7114)) * Math.random()));
						i_95_ &= 0x3fff;
						int i_96_ = Class382.anIntArray4657[i_95_];
						int i_97_ = Class382.anIntArray4661[i_95_];
						int i_98_ = (-42956461 * ((Class538) this).anInt7117 + (int) ((double) (-1202245541 * (((Class538) this).anInt7116)) * Math.random()));
						i_98_ &= 0x1fff;
						int i_99_ = Class382.anIntArray4657[i_98_];
						int i_100_ = Class382.anIntArray4661[i_98_];
						int i_101_ = 13;
						i_92_ = i_97_ * i_99_ >> i_101_;
						i_93_ = -1 * (i_100_ << 1);
						i_94_ = i_99_ * i_96_ >> i_101_;
					} else {
						i_92_ = ((Class538) this).anInt7108 * 883430065;
						i_93_ = ((Class538) this).anInt7111 * -1867956449;
						i_94_ = ((Class538) this).anInt7112 * -210735511;
					}
					float f = (float) Math.random();
					float f_102_ = (float) Math.random();
					if (f + f_102_ > 1.0F) {
						f = 1.0F - f;
						f_102_ = 1.0F - f_102_;
					}
					float f_103_ = 1.0F - (f + f_102_);
					int i_104_ = (int) ((f_102_ * (float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2893) * -1238511007)) + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2888) * 644521341) * f + (f_103_ * (float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2890) * 612300759)));
					int i_105_ = (int) ((float) (-445820465 * (((Class234) ((Class538) this).aClass234_7115).anInt2895)) * f_102_ + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2885) * -2116698901) * f + (float) ((((Class234) ((Class538) this).aClass234_7115).anInt2891) * -267446389) * f_103_);
					int i_106_ = (int) ((f_103_ * (float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2884) * -17399029)) + ((float) ((((Class234) (((Class538) this).aClass234_7115)).anInt2886) * 1434240987) * f + f_102_ * (float) (-1183640035 * (((Class234) (((Class538) this).aClass234_7115)).anInt2889))));
					int i_107_ = ((-768945749 * ((Class538) this).aClass59_7101.anInt538) + (int) (Math.random() * (double) ((-1453312369 * (((Class538) this).aClass59_7101.anInt539)) - ((((Class538) this).aClass59_7101.anInt538) * -768945749))));
					int i_108_ = ((-481955231 * ((Class538) this).aClass59_7101.anInt555) + (int) (Math.random() * (double) (((((Class538) this).aClass59_7101.anInt556) * 1730929631) - ((((Class538) this).aClass59_7101.anInt555) * -481955231))));
					int i_109_ = ((1234374815 * ((Class538) this).aClass59_7101.anInt544) + (int) (Math.random() * (double) (197487861 * (((Class538) this).aClass59_7101.anInt577) - (1234374815 * (((Class538) this).aClass59_7101.anInt544)))));
					int i_110_;
					if (((Class538) this).aClass59_7101.aBool550) {
						double d = Math.random();
						i_110_ = ((int) (d * (double) (1058779855 * (((Class538) this).aClass59_7101.anInt581)) + (double) (-53681217 * (((Class538) this).aClass59_7101.anInt565))) << 16 | (int) ((double) ((((Class538) this).aClass59_7101.anInt551) * 1513056797) + d * (double) (-87647421 * (((Class538) this).aClass59_7101.anInt584))) << 8 | (int) ((double) ((((Class538) this).aClass59_7101.anInt585) * -2036236121) + d * (double) (-1314769033 * (((Class538) this).aClass59_7101.anInt587)))
								| (int) ((double) (-1834026439 * (((Class538) this).aClass59_7101.anInt588)) + (Math.random() * (double) (59671205 * (((Class538) this).aClass59_7101.anInt590)))) << 24);
					} else
						i_110_ = ((int) ((double) ((((Class538) this).aClass59_7101.anInt565) * -53681217) + (Math.random() * (double) (1058779855 * (((Class538) this).aClass59_7101.anInt581)))) << 16 | (int) ((double) ((((Class538) this).aClass59_7101.anInt551) * 1513056797) + (Math.random() * (double) ((((Class538) this).aClass59_7101.anInt584) * -87647421))) << 8
								| (int) ((double) ((((Class538) this).aClass59_7101.anInt585) * -2036236121) + (Math.random() * (double) (-1314769033 * (((Class538) this).aClass59_7101.anInt587)))) | (int) ((double) (-1834026439 * (((Class538) this).aClass59_7101.anInt588)) + (Math.random() * (double) ((((Class538) this).aClass59_7101.anInt590) * 59671205))) << 24);
					int i_111_ = (((Class538) this).aClass59_7101.anInt554 * -751231617);
					if (!class505.method8406() && !((Class538) this).aClass59_7101.aBool574)
						i_111_ = -1;
					Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1;
					if (Class235.anInt2905 * -2090761405 != Class235.anInt2902 * -1374337333) {
						class275_sub1_sub1_sub1 = (Class235.aClass275_Sub1_Sub1_Sub1Array2897[-1374337333 * Class235.anInt2902]);
						Class235.anInt2902 = ((1 + -1374337333 * Class235.anInt2902 & 0x3ff) * -29004061);
						class275_sub1_sub1_sub1.method15955(this, i_104_, i_105_, i_106_, i_92_, i_93_, i_94_, i_107_, i_108_, i_110_, i_109_, i_111_, ((Class538) this).aClass59_7101.aBool572, ((Class538) this).aClass59_7101.aBool534);
					} else
						class275_sub1_sub1_sub1 = (new Class275_Sub1_Sub1_Sub1(this, i_104_, i_105_, i_106_, i_92_, i_93_, i_94_, i_107_, i_108_, i_110_, i_109_, i_111_, ((Class538) this).aClass59_7101.aBool572, ((Class538) this).aClass59_7101.aBool534));
					if (i_90_ > 256)
						class275_sub1_sub1_sub1.method15967(l, i_90_ >> 8);
					((Class538) this).anInt7104 += -621421001;
					i_91_++;
					i_90_ += i_89_;
				}
			}
		}
		if (!((Class538) this).aClass234_7115.method3944(((Class538) this).aClass234_7109, (byte) 42)) {
			Class234 class234 = ((Class538) this).aClass234_7109;
			((Class538) this).aClass234_7109 = ((Class538) this).aClass234_7115;
			((Class538) this).aClass234_7115 = class234;
			((Class234) ((Class538) this).aClass234_7115).anInt2888 = ((Class538) this).aClass87_7110.anInt844 * 289207337;
			((Class234) ((Class538) this).aClass234_7115).anInt2885 = -653305279 * ((Class538) this).aClass87_7110.anInt841;
			((Class234) ((Class538) this).aClass234_7115).anInt2886 = 174222639 * ((Class538) this).aClass87_7110.anInt847;
			((Class234) ((Class538) this).aClass234_7115).anInt2893 = 1283454061 * ((Class538) this).aClass87_7110.anInt834;
			((Class234) ((Class538) this).aClass234_7115).anInt2895 = ((Class538) this).aClass87_7110.anInt843 * 255103181;
			((Class234) ((Class538) this).aClass234_7115).anInt2889 = 1444696369 * ((Class538) this).aClass87_7110.anInt845;
			((Class234) ((Class538) this).aClass234_7115).anInt2890 = ((Class538) this).aClass87_7110.anInt846 * -1788528747;
			((Class234) ((Class538) this).aClass234_7115).anInt2891 = ((Class538) this).aClass87_7110.anInt840 * 1327309173;
			((Class234) ((Class538) this).aClass234_7115).anInt2884 = ((Class538) this).aClass87_7110.anInt848 * 856138047;
			((Class234) ((Class538) this).aClass234_7115).anInt2894 = ((Class234) ((Class538) this).aClass234_7109).anInt2894 * 1;
			((Class234) ((Class538) this).aClass234_7115).anInt2887 = ((Class234) ((Class538) this).aClass234_7109).anInt2887 * 1;
			((Class234) ((Class538) this).aClass234_7115).anInt2892 = 1 * ((Class234) ((Class538) this).aClass234_7109).anInt2892;
		}
		Class235.anInt2900 += ((Class538) this).anInt7104 * 1527961209;
	}

	Class538(Class505 class505, Class87 class87, Class539 class539, long l) {
		((Class538) this).aClass234_7109 = new Class234();
		((Class538) this).aBool7105 = false;
		((Class538) this).aBool7118 = false;
		((Class538) this).aClass87_7110 = class87;
		((Class538) this).aClass539_7102 = class539;
		((Class538) this).aLong7106 = 5577910423325727419L * l;
		((Class538) this).aClass59_7101 = ((Class538) this).aClass87_7110.method1485(228843304);
		if (!class505.method8406() && -1461099159 * ((Class538) this).aClass59_7101.anInt573 != -1)
			((Class538) this).aClass59_7101 = Class282_Sub11_Sub1.method15434((-1461099159 * (((Class538) this).aClass59_7101.anInt573)), (byte) 14);
		((Class538) this).aClass457_7100 = new Class457();
		((Class538) this).anInt7103 = (int) ((double) (1547890723 * ((Class538) this).anInt7103) + Math.random() * 64.0) * 950353803;
		method11494((byte) -43);
		((Class234) ((Class538) this).aClass234_7109).anInt2888 = ((Class234) ((Class538) this).aClass234_7115).anInt2888 * 1;
		((Class234) ((Class538) this).aClass234_7109).anInt2885 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2885;
		((Class234) ((Class538) this).aClass234_7109).anInt2886 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2886;
		((Class234) ((Class538) this).aClass234_7109).anInt2893 = ((Class234) ((Class538) this).aClass234_7115).anInt2893 * 1;
		((Class234) ((Class538) this).aClass234_7109).anInt2895 = ((Class234) ((Class538) this).aClass234_7115).anInt2895 * 1;
		((Class234) ((Class538) this).aClass234_7109).anInt2889 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2889;
		((Class234) ((Class538) this).aClass234_7109).anInt2890 = ((Class234) ((Class538) this).aClass234_7115).anInt2890 * 1;
		((Class234) ((Class538) this).aClass234_7109).anInt2891 = ((Class234) ((Class538) this).aClass234_7115).anInt2891 * 1;
		((Class234) ((Class538) this).aClass234_7109).anInt2884 = 1 * ((Class234) ((Class538) this).aClass234_7115).anInt2884;
	}

	void method11499(Class206 class206, Class505 class505, long l) {
		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7659(301908602)); class275_sub1_sub1_sub1 != null; class275_sub1_sub1_sub1 = ((Class275_Sub1_Sub1_Sub1) ((Class538) this).aClass457_7100.method7650((byte) 108)))
			class275_sub1_sub1_sub1.method15965(class206, class505, l);
	}

	public static void method11500(int i, boolean bool, byte i_112_) {
		Class231.method3914(i, Class433.aClass433_5251.method7273(Class223.aClass495_2772, -929025713), bool, (byte) 104);
	}

	static final void method11501(int i) {
		Class96_Sub12.method14614(Class316.aClass505_3680, (long) (-1809259861 * client.cycles));
		if (client.anInt7349 * -1699899559 != -1)
			UnderlayDefinition.method8777(client.anInt7349 * -1699899559, (byte) -116);
		for (int i_113_ = 0; i_113_ < client.anInt7407 * 1858642375; i_113_++) {
			client.aBoolArray7410[i_113_] = client.aBoolArray7443[i_113_];
			client.aBoolArray7443[i_113_] = false;
		}
		client.anInt7408 = client.cycles * -1565957043;
		if (-1699899559 * client.anInt7349 != -1) {
			client.anInt7407 = 0;
			Class421.method7039((byte) 16);
		}
		Class316.aClass505_3680.L();
		Class282_Sub20_Sub33.method15411(Class316.aClass505_3680, (byte) 123);
		int i_114_ = Class58.method1141(1515135830);
		if (-1 == i_114_)
			i_114_ = client.anInt7427 * -1211259595;
		if (i_114_ == -1)
			i_114_ = -141702765 * client.anInt7340;
		Class479.method8036(i_114_, (byte) 4);
		client.anInt7261 = 0;
	}
}
