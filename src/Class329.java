
/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class329 {
	protected boolean aBool3773;
	static int[][] anIntArrayArray3774;
	static int[][] anIntArrayArray3775;
	protected Class206 aClass206_3776;
	static final int anInt3777 = 0;
	static int[] anIntArray3778;
	static final int anInt3779 = 64;
	public boolean aBool3780;
	int anInt3781;
	public boolean aBool3782;
	static final int anInt3783 = 2;
	protected int anInt3784;
	protected int anInt3785;
	public boolean aBool3786;
	protected Class311 aClass311_3787;
	public byte[][][] aByteArrayArrayArray3788;
	Class479 aClass479_3789;
	byte[][][] aByteArrayArrayArray3790;
	byte[][][] aByteArrayArrayArray3791;
	static final int anInt3792 = 16;
	static boolean[][] aBoolArrayArray3793;
	protected byte[][][] aByteArrayArrayArray3794;
	int[] anIntArray3795;
	int[] anIntArray3796;
	int[] anIntArray3797;
	int[] anIntArray3798;
	int[] anIntArray3799;
	static int[] anIntArray3800;
	static final int anInt3801 = 1;
	static final int anInt3802 = 2;
	static final int anInt3803 = 3;
	static final int anInt3804 = 1;
	static final int anInt3805 = 512;
	static final int anInt3806 = 4;
	static final int anInt3807 = 8;
	byte[][][] aByteArrayArrayArray3808;
	public int anInt3809 = 0;
	boolean aBool3810;
	static int[] anIntArray3811;
	static final int anInt3812 = 256;
	int[] anIntArray3813;
	static int[] anIntArray3814 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	static int[][] anIntArrayArray3815;
	static boolean[][] aBoolArrayArray3816;
	static final int anInt3817 = 0;
	public int[][][] anIntArrayArrayArray3818;
	static int[] anIntArray3819;
	public boolean aBool3820;
	static int[][] anIntArrayArray3821;
	static boolean[][] aBoolArrayArray3822;
	static boolean[][] aBoolArrayArray3823;
	static int[][] anIntArrayArray3824;
	byte[][][] aByteArrayArrayArray3825;
	static int[] anIntArray3826;
	int[] anIntArray3827;
	static int[][] anIntArrayArray3828;
	static int[] anIntArray3829 = { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	static int[][] anIntArrayArray3830;
	static int[][] anIntArrayArray3831;
	int[] anIntArray3832;
	static int[][] anIntArrayArray3833;
	Class536 aClass536_3834;
	public boolean aBool3835 = false;
	static int[][] anIntArrayArray3836;
	int[] anIntArray3837;
	int[] anIntArray3838;
	int[] anIntArray3839;
	static final int anInt3840 = 128;
	static final int anInt3841 = 32;
	int[] anIntArray3842;
	int[] anIntArray3843;
	int anInt3844;
	public int anInt3845;
	int anInt3846;
	static int[] anIntArray3847;
	int anInt3848;
	int anInt3849;
	int anInt3850;
	boolean aBool3851;
	int anInt3852;
	boolean aBool3853;
	boolean aBool3854;
	int anInt3855;
	int anInt3856;
	int[] anIntArray3857;
	int[] anIntArray3858;
	int[] anIntArray3859;
	static int[][] anIntArrayArray3860;
	public static Index aClass317_3861;

	final void method5834(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_0_, int i_1_, int i_2_, byte[][] is, byte[][] is_3_, byte[][] is_4_, boolean[] bools) {
		boolean[] bools_5_ = (null != class531 && class531.aBool7061 ? aBoolArrayArray3793[-595948995 * ((Class329) this).anInt3844] : (aBoolArrayArray3816[((Class329) this).anInt3844 * -595948995]));
		if (i_0_ > 0) {
			if (i > 0) {
				int i_6_ = is[i - 1][i_0_ - 1] & 0xff;
				if (i_6_ > 0) {
					Class531 class531_7_ = ((Class329) this).aClass536_3834.method11475(i_6_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_7_.anInt7054 && class531_7_.aBool7061) {
						byte i_8_ = is_3_[i - 1][i_0_ - 1];
						int i_9_ = 2 * is_4_[i - 1][i_0_ - 1] + 4 & 0x7;
						int i_10_ = Class153.method2617(class505, class531_7_, (byte) -25);
						if (aBoolArrayArray3822[i_8_][i_9_]) {
							((Class329) this).anIntArray3838[0] = class531_7_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[0] = i_10_;
							((Class329) this).anIntArray3813[0] = 1717409107 * class531_7_.anInt7066;
							((Class329) this).anIntArray3827[0] = class531_7_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[0] = 1070524733 * class531_7_.anInt7052;
							((Class329) this).anIntArray3843[0] = 256;
						}
					}
				}
			}
			if (i < i_1_ - 1) {
				int i_11_ = is[i + 1][i_0_ - 1] & 0xff;
				if (i_11_ > 0) {
					Class531 class531_12_ = ((Class329) this).aClass536_3834.method11475(i_11_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_12_.anInt7054 && class531_12_.aBool7061) {
						byte i_13_ = is_3_[1 + i][i_0_ - 1];
						int i_14_ = 6 + is_4_[1 + i][i_0_ - 1] * 2 & 0x7;
						int i_15_ = Class153.method2617(class505, class531_12_, (byte) -2);
						if (aBoolArrayArray3822[i_13_][i_14_]) {
							((Class329) this).anIntArray3838[2] = 1419498143 * class531_12_.anInt7054;
							((Class329) this).anIntArray3839[2] = i_15_;
							((Class329) this).anIntArray3813[2] = 1717409107 * class531_12_.anInt7066;
							((Class329) this).anIntArray3827[2] = -1065364389 * class531_12_.anInt7057;
							((Class329) this).anIntArray3842[2] = class531_12_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[2] = 512;
						}
					}
				}
			}
		}
		if (i_0_ < i_2_ - 1) {
			if (i > 0) {
				int i_16_ = is[i - 1][i_0_ + 1] & 0xff;
				if (i_16_ > 0) {
					Class531 class531_17_ = ((Class329) this).aClass536_3834.method11475(i_16_ - 1, (byte) 0);
					if (class531_17_.anInt7054 * 1419498143 != -1 && class531_17_.aBool7061) {
						byte i_18_ = is_3_[i - 1][i_0_ + 1];
						int i_19_ = is_4_[i - 1][1 + i_0_] * 2 + 2 & 0x7;
						int i_20_ = Class153.method2617(class505, class531_17_, (byte) -68);
						if (aBoolArrayArray3822[i_18_][i_19_]) {
							((Class329) this).anIntArray3838[6] = class531_17_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[6] = i_20_;
							((Class329) this).anIntArray3813[6] = 1717409107 * class531_17_.anInt7066;
							((Class329) this).anIntArray3827[6] = class531_17_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[6] = class531_17_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[6] = 64;
						}
					}
				}
			}
			if (i < i_1_ - 1) {
				int i_21_ = is[1 + i][i_0_ + 1] & 0xff;
				if (i_21_ > 0) {
					Class531 class531_22_ = ((Class329) this).aClass536_3834.method11475(i_21_ - 1, (byte) 0);
					if (1419498143 * class531_22_.anInt7054 != -1 && class531_22_.aBool7061) {
						byte i_23_ = is_3_[i + 1][1 + i_0_];
						int i_24_ = 2 * is_4_[i + 1][i_0_ + 1] + 0 & 0x7;
						int i_25_ = Class153.method2617(class505, class531_22_, (byte) -83);
						if (aBoolArrayArray3822[i_23_][i_24_]) {
							((Class329) this).anIntArray3838[4] = class531_22_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[4] = i_25_;
							((Class329) this).anIntArray3813[4] = class531_22_.anInt7066 * 1717409107;
							((Class329) this).anIntArray3827[4] = -1065364389 * class531_22_.anInt7057;
							((Class329) this).anIntArray3842[4] = 1070524733 * class531_22_.anInt7052;
							((Class329) this).anIntArray3843[4] = 128;
						}
					}
				}
			}
		}
		if (i_0_ > 0) {
			int i_26_ = is[i][i_0_ - 1] & 0xff;
			if (i_26_ > 0) {
				Class531 class531_27_ = ((Class329) this).aClass536_3834.method11475(i_26_ - 1, (byte) 0);
				if (1419498143 * class531_27_.anInt7054 != -1) {
					byte i_28_ = is_3_[i][i_0_ - 1];
					int i_29_ = is_4_[i][i_0_ - 1];
					if (class531_27_.aBool7061) {
						int i_30_ = 2;
						int i_31_ = 2 * i_29_ + 4;
						int i_32_ = Class153.method2617(class505, class531_27_, (byte) -81);
						for (int i_33_ = 0; i_33_ < 3; i_33_++) {
							i_31_ &= 0x7;
							i_30_ &= 0x7;
							if (aBoolArrayArray3822[i_28_][i_31_] && (((Class329) this).anIntArray3842[i_30_] <= class531_27_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_30_] = 1419498143 * class531_27_.anInt7054;
								((Class329) this).anIntArray3839[i_30_] = i_32_;
								((Class329) this).anIntArray3813[i_30_] = 1717409107 * class531_27_.anInt7066;
								((Class329) this).anIntArray3827[i_30_] = -1065364389 * class531_27_.anInt7057;
								if (((Class329) this).anIntArray3842[i_30_] == 1070524733 * class531_27_.anInt7052)
									((Class329) this).anIntArray3843[i_30_] |= 0x20;
								else
									((Class329) this).anIntArray3843[i_30_] = 32;
								((Class329) this).anIntArray3842[i_30_] = class531_27_.anInt7052 * 1070524733;
							}
							i_31_++;
							i_30_--;
						}
						if (!bools_5_[0 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[0] = aBoolArrayArray3793[i_28_][2 + i_29_ & 0x3];
					} else if (!bools_5_[0 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[0] = aBoolArrayArray3816[i_28_][i_29_ + 2 & 0x3];
				}
			}
		}
		if (i_0_ < i_2_ - 1) {
			int i_34_ = is[i][i_0_ + 1] & 0xff;
			if (i_34_ > 0) {
				Class531 class531_35_ = ((Class329) this).aClass536_3834.method11475(i_34_ - 1, (byte) 0);
				if (-1 != 1419498143 * class531_35_.anInt7054) {
					byte i_36_ = is_3_[i][i_0_ + 1];
					int i_37_ = is_4_[i][i_0_ + 1];
					if (class531_35_.aBool7061) {
						int i_38_ = 4;
						int i_39_ = 2 * i_37_ + 2;
						int i_40_ = Class153.method2617(class505, class531_35_, (byte) -29);
						for (int i_41_ = 0; i_41_ < 3; i_41_++) {
							i_39_ &= 0x7;
							i_38_ &= 0x7;
							if (aBoolArrayArray3822[i_36_][i_39_] && (((Class329) this).anIntArray3842[i_38_] <= 1070524733 * class531_35_.anInt7052)) {
								((Class329) this).anIntArray3838[i_38_] = class531_35_.anInt7054 * 1419498143;
								((Class329) this).anIntArray3839[i_38_] = i_40_;
								((Class329) this).anIntArray3813[i_38_] = 1717409107 * class531_35_.anInt7066;
								((Class329) this).anIntArray3827[i_38_] = class531_35_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_38_] == 1070524733 * class531_35_.anInt7052)
									((Class329) this).anIntArray3843[i_38_] |= 0x10;
								else
									((Class329) this).anIntArray3843[i_38_] = 16;
								((Class329) this).anIntArray3842[i_38_] = 1070524733 * class531_35_.anInt7052;
							}
							i_39_--;
							i_38_++;
						}
						if (!bools_5_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
							bools[2] = aBoolArrayArray3793[i_36_][i_37_ + 0 & 0x3];
					} else if (!bools_5_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[2] = aBoolArrayArray3816[i_36_][0 + i_37_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_42_ = is[i - 1][i_0_] & 0xff;
			if (i_42_ > 0) {
				Class531 class531_43_ = ((Class329) this).aClass536_3834.method11475(i_42_ - 1, (byte) 0);
				if (class531_43_.anInt7054 * 1419498143 != -1) {
					byte i_44_ = is_3_[i - 1][i_0_];
					int i_45_ = is_4_[i - 1][i_0_];
					if (class531_43_.aBool7061) {
						int i_46_ = 6;
						int i_47_ = i_45_ * 2 + 4;
						int i_48_ = Class153.method2617(class505, class531_43_, (byte) -38);
						for (int i_49_ = 0; i_49_ < 3; i_49_++) {
							i_47_ &= 0x7;
							i_46_ &= 0x7;
							if (aBoolArrayArray3822[i_44_][i_47_] && (((Class329) this).anIntArray3842[i_46_] <= 1070524733 * class531_43_.anInt7052)) {
								((Class329) this).anIntArray3838[i_46_] = 1419498143 * class531_43_.anInt7054;
								((Class329) this).anIntArray3839[i_46_] = i_48_;
								((Class329) this).anIntArray3813[i_46_] = class531_43_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_46_] = -1065364389 * class531_43_.anInt7057;
								if (1070524733 * class531_43_.anInt7052 == ((Class329) this).anIntArray3842[i_46_])
									((Class329) this).anIntArray3843[i_46_] |= 0x8;
								else
									((Class329) this).anIntArray3843[i_46_] = 8;
								((Class329) this).anIntArray3842[i_46_] = 1070524733 * class531_43_.anInt7052;
							}
							i_47_--;
							i_46_++;
						}
						if (!bools_5_[(((Class329) this).anInt3781 * 1070348131 + 3) & 0x3])
							bools[3] = aBoolArrayArray3793[i_44_][i_45_ + 1 & 0x3];
					} else if (!bools_5_[3 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
						bools[3] = aBoolArrayArray3816[i_44_][1 + i_45_ & 0x3];
				}
			}
		}
		if (i < i_1_ - 1) {
			int i_50_ = is[i + 1][i_0_] & 0xff;
			if (i_50_ > 0) {
				Class531 class531_51_ = ((Class329) this).aClass536_3834.method11475(i_50_ - 1, (byte) 0);
				if (1419498143 * class531_51_.anInt7054 != -1) {
					byte i_52_ = is_3_[1 + i][i_0_];
					int i_53_ = is_4_[1 + i][i_0_];
					if (class531_51_.aBool7061) {
						int i_54_ = 4;
						int i_55_ = 6 + i_53_ * 2;
						int i_56_ = Class153.method2617(class505, class531_51_, (byte) 59);
						for (int i_57_ = 0; i_57_ < 3; i_57_++) {
							i_55_ &= 0x7;
							i_54_ &= 0x7;
							if (aBoolArrayArray3822[i_52_][i_55_] && (((Class329) this).anIntArray3842[i_54_] <= class531_51_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_54_] = 1419498143 * class531_51_.anInt7054;
								((Class329) this).anIntArray3839[i_54_] = i_56_;
								((Class329) this).anIntArray3813[i_54_] = class531_51_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_54_] = class531_51_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_54_] == class531_51_.anInt7052 * 1070524733)
									((Class329) this).anIntArray3843[i_54_] |= 0x4;
								else
									((Class329) this).anIntArray3843[i_54_] = 4;
								((Class329) this).anIntArray3842[i_54_] = class531_51_.anInt7052 * 1070524733;
							}
							i_55_++;
							i_54_--;
						}
						if (!bools_5_[1 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[1] = aBoolArrayArray3793[i_52_][3 + i_53_ & 0x3];
					} else if (!bools_5_[(1070348131 * ((Class329) this).anInt3781 + 1 & 0x3)])
						bools[1] = aBoolArrayArray3816[i_52_][i_53_ + 3 & 0x3];
				}
			}
		}
		if (null != class531 && class531.aBool7061) {
			int i_58_ = Class153.method2617(class505, class531, (byte) 109);
			for (int i_59_ = 0; i_59_ < 8; i_59_++) {
				int i_60_ = i_59_ - 2140696262 * ((Class329) this).anInt3781 & 0x7;
				if ((aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_59_]) && (((Class329) this).anIntArray3842[i_60_] <= class531.anInt7052 * 1070524733)) {
					((Class329) this).anIntArray3838[i_60_] = class531.anInt7054 * 1419498143;
					((Class329) this).anIntArray3839[i_60_] = i_58_;
					((Class329) this).anIntArray3813[i_60_] = 1717409107 * class531.anInt7066;
					((Class329) this).anIntArray3827[i_60_] = class531.anInt7057 * -1065364389;
					if (1070524733 * class531.anInt7052 == ((Class329) this).anIntArray3842[i_60_])
						((Class329) this).anIntArray3843[i_60_] |= 0x2;
					else
						((Class329) this).anIntArray3843[i_60_] = 2;
					((Class329) this).anIntArray3842[i_60_] = class531.anInt7052 * 1070524733;
				}
			}
		}
	}

	public void method5835(int i) {
		aBool3773 = true;
	}

	int method5836(int i, int i_61_, int i_62_, int i_63_, int i_64_, Class390 class390, byte[][] is) {
		if ((-595948995 * ((Class329) this).anInt3844 == 0 || -595948995 * ((Class329) this).anInt3844 == 12) && i_61_ > 0 && i_62_ > 0 && i_61_ < -1230013231 * anInt3784 && i_62_ < anInt3785 * 2024737111) {
			int i_65_ = 0;
			int i_66_ = 0;
			int i_67_ = 0;
			int i_68_ = 0;
			i_65_ = i_65_ + (i == is[i_61_ - 1][i_62_ - 1] ? 1 : -1);
			i_66_ = i_66_ + (i == is[i_63_][i_62_ - 1] ? 1 : -1);
			i_67_ = i_67_ + (is[i_63_][i_64_] == i ? 1 : -1);
			i_68_ = i_68_ + (i == is[i_61_ - 1][i_64_] ? 1 : -1);
			if (is[i_61_][i_62_ - 1] == i) {
				i_65_++;
				i_66_++;
			} else {
				i_65_--;
				i_66_--;
			}
			if (i == is[i_63_][i_62_]) {
				i_66_++;
				i_67_++;
			} else {
				i_66_--;
				i_67_--;
			}
			if (i == is[i_61_][i_64_]) {
				i_67_++;
				i_68_++;
			} else {
				i_67_--;
				i_68_--;
			}
			if (i == is[i_61_ - 1][i_62_]) {
				i_68_++;
				i_65_++;
			} else {
				i_68_--;
				i_65_--;
			}
			int i_69_ = i_65_ - i_67_;
			if (i_69_ < 0)
				i_69_ = -i_69_;
			int i_70_ = i_66_ - i_68_;
			if (i_70_ < 0)
				i_70_ = -i_70_;
			if (i_69_ == i_70_) {
				i_69_ = (class390.method6722(i_61_, i_62_, 65280) - class390.method6722(i_63_, i_64_, 65280));
				if (i_69_ < 0)
					i_69_ = -i_69_;
				i_70_ = (class390.method6722(i_63_, i_62_, 65280) - class390.method6722(i_61_, i_64_, 65280));
				if (i_70_ < 0)
					i_70_ = -i_70_;
			}
			return i_69_ < i_70_ ? 1 : 0;
		}
		return ((Class329) this).anInt3781 * 1070348131;
	}

	public final void method5837(GraphicalRenderer class505, Class390 class390, Class390 class390_71_, int i) {
		int[][] is = new int[anInt3784 * -1230013231][anInt3785 * 2024737111];
		if (null == ((Class329) this).anIntArray3795 || (((Class329) this).anIntArray3795.length != 2024737111 * anInt3785)) {
			((Class329) this).anIntArray3795 = new int[2024737111 * anInt3785];
			((Class329) this).anIntArray3796 = new int[anInt3785 * 2024737111];
			((Class329) this).anIntArray3797 = new int[anInt3785 * 2024737111];
			((Class329) this).anIntArray3798 = new int[2024737111 * anInt3785];
			((Class329) this).anIntArray3799 = new int[2024737111 * anInt3785];
		}
		for (int i_72_ = 0; i_72_ < anInt3845 * 1599084401; i_72_++) {
			for (int i_73_ = 0; i_73_ < 2024737111 * anInt3785; i_73_++) {
				((Class329) this).anIntArray3795[i_73_] = 0;
				((Class329) this).anIntArray3796[i_73_] = 0;
				((Class329) this).anIntArray3797[i_73_] = 0;
				((Class329) this).anIntArray3798[i_73_] = 0;
				((Class329) this).anIntArray3799[i_73_] = 0;
			}
			for (int i_74_ = -5; i_74_ < -1230013231 * anInt3784; i_74_++) {
				for (int i_75_ = 0; i_75_ < anInt3785 * 2024737111; i_75_++) {
					int i_76_ = i_74_ + 5;
					if (i_76_ < anInt3784 * -1230013231) {
						int i_77_ = (((Class329) this).aByteArrayArrayArray3808[i_72_][i_76_][i_75_]) & 0xff;
						if (i_77_ > 0) {
							Class481 class481 = ((Class329) this).aClass479_3789.method8025(i_77_ - 1, (byte) -26);
							((Class329) this).anIntArray3795[i_75_] += class481.anInt5724 * -520008741;
							((Class329) this).anIntArray3796[i_75_] += -771727201 * class481.anInt5726;
							((Class329) this).anIntArray3797[i_75_] += 1389910939 * class481.anInt5725;
							((Class329) this).anIntArray3798[i_75_] += -45673991 * class481.anInt5718;
							((Class329) this).anIntArray3799[i_75_]++;
						}
					}
					int i_78_ = i_74_ - 5;
					if (i_78_ >= 0) {
						int i_79_ = (((Class329) this).aByteArrayArrayArray3808[i_72_][i_78_][i_75_]) & 0xff;
						if (i_79_ > 0) {
							Class481 class481 = ((Class329) this).aClass479_3789.method8025(i_79_ - 1, (byte) -111);
							((Class329) this).anIntArray3795[i_75_] -= -520008741 * class481.anInt5724;
							((Class329) this).anIntArray3796[i_75_] -= class481.anInt5726 * -771727201;
							((Class329) this).anIntArray3797[i_75_] -= 1389910939 * class481.anInt5725;
							((Class329) this).anIntArray3798[i_75_] -= -45673991 * class481.anInt5718;
							((Class329) this).anIntArray3799[i_75_]--;
						}
					}
				}
				if (i_74_ >= 0) {
					int i_80_ = 0;
					int i_81_ = 0;
					int i_82_ = 0;
					int i_83_ = 0;
					int i_84_ = 0;
					for (int i_85_ = -5; i_85_ < anInt3785 * 2024737111; i_85_++) {
						int i_86_ = i_85_ + 5;
						if (i_86_ < anInt3785 * 2024737111) {
							i_80_ += ((Class329) this).anIntArray3795[i_86_];
							i_81_ += ((Class329) this).anIntArray3796[i_86_];
							i_82_ += ((Class329) this).anIntArray3797[i_86_];
							i_83_ += ((Class329) this).anIntArray3798[i_86_];
							i_84_ += ((Class329) this).anIntArray3799[i_86_];
						}
						int i_87_ = i_85_ - 5;
						if (i_87_ >= 0) {
							i_80_ -= ((Class329) this).anIntArray3795[i_87_];
							i_81_ -= ((Class329) this).anIntArray3796[i_87_];
							i_82_ -= ((Class329) this).anIntArray3797[i_87_];
							i_83_ -= ((Class329) this).anIntArray3798[i_87_];
							i_84_ -= ((Class329) this).anIntArray3799[i_87_];
						}
						if (i_85_ >= 0 && i_83_ > 0 && i_84_ > 0)
							is[i_74_][i_85_] = Class371.method6348(i_80_ * 256 / i_83_, i_81_ / i_84_, i_82_ / i_84_, -432025079);
					}
				}
			}
			if (aBool3820)
				method5846(class505, aClass206_3776.aClass390Array2591[i_72_], i_72_, is, 0 == i_72_ ? class390 : null, i_72_ == 0 ? class390_71_ : null, (byte) 4);
			else
				method5845(class505, aClass206_3776.aClass390Array2591[i_72_], i_72_, is, i_72_ == 0 ? class390 : null, i_72_ == 0 ? class390_71_ : null, (byte) 1);
			((Class329) this).aByteArrayArrayArray3808[i_72_] = null;
			((Class329) this).aByteArrayArrayArray3825[i_72_] = null;
			((Class329) this).aByteArrayArrayArray3790[i_72_] = null;
			((Class329) this).aByteArrayArrayArray3791[i_72_] = null;
		}
		if (!aBool3786) {
			if (anInt3809 * 207676255 != 0)
				aClass206_3776.method3429(1532483847);
			if (aBool3780)
				aClass206_3776.method3431(1204197709);
		}
		for (int i_88_ = 0; i_88_ < 1599084401 * anInt3845; i_88_++)
			aClass206_3776.aClass390Array2591[i_88_].SA();
	}

	public final void method5838(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_) {
		for (int i_94_ = i_90_; i_94_ < i_92_ + i_90_; i_94_++) {
			for (int i_95_ = i_89_; i_95_ < i_91_ + i_89_; i_95_++) {
				if (i_95_ >= 0 && i_95_ < anInt3784 * -1230013231 && i_94_ >= 0 && i_94_ < 2024737111 * anInt3785)
					anIntArrayArrayArray3818[i][i_95_][i_94_] = i > 0 ? (anIntArrayArrayArray3818[i - 1][i_95_][i_94_]) - 960 : 0;
			}
		}
		if (i_89_ > 0 && i_89_ < -1230013231 * anInt3784) {
			for (int i_96_ = i_90_ + 1; i_96_ < i_90_ + i_92_; i_96_++) {
				if (i_96_ >= 0 && i_96_ < 2024737111 * anInt3785)
					anIntArrayArrayArray3818[i][i_89_][i_96_] = anIntArrayArrayArray3818[i][i_89_ - 1][i_96_];
			}
		}
		if (i_90_ > 0 && i_90_ < 2024737111 * anInt3785) {
			for (int i_97_ = i_89_ + 1; i_97_ < i_91_ + i_89_; i_97_++) {
				if (i_97_ >= 0 && i_97_ < anInt3784 * -1230013231)
					anIntArrayArrayArray3818[i][i_97_][i_90_] = anIntArrayArrayArray3818[i][i_97_][i_90_ - 1];
			}
		}
		if (i_89_ >= 0 && i_90_ >= 0 && i_89_ < -1230013231 * anInt3784 && i_90_ < 2024737111 * anInt3785) {
			if (0 == i) {
				if (i_89_ > 0 && 0 != anIntArrayArrayArray3818[i][i_89_ - 1][i_90_])
					anIntArrayArrayArray3818[i][i_89_][i_90_] = anIntArrayArrayArray3818[i][i_89_ - 1][i_90_];
				else if (i_90_ > 0 && anIntArrayArrayArray3818[i][i_89_][i_90_ - 1] != 0)
					anIntArrayArrayArray3818[i][i_89_][i_90_] = anIntArrayArrayArray3818[i][i_89_][i_90_ - 1];
				else if (i_89_ > 0 && i_90_ > 0 && (anIntArrayArrayArray3818[i][i_89_ - 1][i_90_ - 1] != 0))
					anIntArrayArrayArray3818[i][i_89_][i_90_] = anIntArrayArrayArray3818[i][i_89_ - 1][i_90_ - 1];
			} else if (i_89_ > 0 && (anIntArrayArrayArray3818[i - 1][i_89_ - 1][i_90_] != anIntArrayArrayArray3818[i][i_89_ - 1][i_90_]))
				anIntArrayArrayArray3818[i][i_89_][i_90_] = anIntArrayArrayArray3818[i][i_89_ - 1][i_90_];
			else if (i_90_ > 0 && (anIntArrayArrayArray3818[i][i_89_][i_90_ - 1] != anIntArrayArrayArray3818[i - 1][i_89_][i_90_ - 1]))
				anIntArrayArrayArray3818[i][i_89_][i_90_] = anIntArrayArrayArray3818[i][i_89_][i_90_ - 1];
			else if (i_89_ > 0 && i_90_ > 0 && (anIntArrayArrayArray3818[i][i_89_ - 1][i_90_ - 1] != (anIntArrayArrayArray3818[i - 1][i_89_ - 1][i_90_ - 1])))
				anIntArrayArrayArray3818[i][i_89_][i_90_] = anIntArrayArrayArray3818[i][i_89_ - 1][i_90_ - 1];
		}
	}

	public final void method5839(RsByteBuffer class282_sub35, int i, int i_98_, int i_99_, int i_100_, Class336[] class336s, byte i_101_) {
		if (!aBool3786) {
			for (int i_102_ = 0; i_102_ < 4; i_102_++) {
				Class336 class336 = class336s[i_102_];
				for (int i_103_ = 0; i_103_ < 64; i_103_++) {
					for (int i_104_ = 0; i_104_ < 64; i_104_++) {
						int i_105_ = i + i_103_;
						int i_106_ = i_104_ + i_98_;
						if (i_105_ >= 0 && i_105_ < anInt3784 * -1230013231 && i_106_ >= 0 && i_106_ < anInt3785 * 2024737111)
							class336.method5974(i_105_, i_106_, 1933302120);
					}
				}
			}
		}
		int i_107_ = i_99_ + i;
		int i_108_ = i_100_ + i_98_;
		for (int i_109_ = 0; i_109_ < anInt3845 * 1599084401; i_109_++) {
			for (int i_110_ = 0; i_110_ < 64; i_110_++) {
				for (int i_111_ = 0; i_111_ < 64; i_111_++)
					method5871(class282_sub35, i_109_, i_110_ + i, i_111_ + i_98_, 0, 0, i_107_ + i_110_, i_111_ + i_108_, 0, false, 116410177);
			}
		}
	}

	void method5840(Class390 class390, Class481 class481, Class531 class531, int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_) {
		int i_118_ = class390.method6722(i_112_, i_113_, 65280);
		int i_119_ = class390.method6722(i_114_, i_113_, 65280);
		int i_120_ = class390.method6722(i_114_, i_115_, 65280);
		int i_121_ = class390.method6722(i_112_, i_115_, 65280);
		boolean bool = aClass311_3787.method5497(i_112_, i_113_, 1685082842);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_122_ = true;
			if (null != class481 && !class481.aBool5722)
				bool_122_ = false;
			else if (i_116_ == 0 && 0 != ((Class329) this).anInt3844 * -595948995)
				bool_122_ = false;
			else if (i_117_ > 0 && class531 != null && !class531.aBool7056)
				bool_122_ = false;
			if (bool_122_ && i_119_ == i_118_ && i_118_ == i_120_ && i_118_ == i_121_)
				aByteArrayArrayArray3794[i][i_112_][i_113_] |= 0x4;
		}
	}

	public final void method5841(RsByteBuffer class282_sub35, int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, Class336[] class336s, int i_129_) {
		int i_130_ = (i_126_ & 0x7) * 8;
		int i_131_ = 8 * (i_127_ & 0x7);
		if (!aBool3786) {
			Class336 class336 = class336s[i];
			for (int i_132_ = 0; i_132_ < 8; i_132_++) {
				for (int i_133_ = 0; i_133_ < 8; i_133_++) {
					int i_134_ = (i_123_ + Class112.method1871(i_132_ & 0x7, i_133_ & 0x7, i_128_, 1449989045));
					int i_135_ = i_124_ + Class2.method259(i_132_ & 0x7, i_133_ & 0x7, i_128_, 97423682);
					if (i_134_ > 0 && i_134_ < -1230013231 * anInt3784 - 1 && i_135_ > 0 && i_135_ < 2024737111 * anInt3785 - 1)
						class336.method5974(i_134_, i_135_, 1933302120);
				}
			}
		}
		int i_136_ = (i_126_ & ~0x7) << 3;
		int i_137_ = (i_127_ & ~0x7) << 3;
		int i_138_ = 0;
		int i_139_ = 0;
		if (1 == i_128_)
			i_139_ = 1;
		else if (2 == i_128_) {
			i_138_ = 1;
			i_139_ = 1;
		} else if (i_128_ == 3)
			i_138_ = 1;
		for (int i_140_ = 0; i_140_ < 1599084401 * anInt3845; i_140_++) {
			for (int i_141_ = 0; i_141_ < 64; i_141_++) {
				for (int i_142_ = 0; i_142_ < 64; i_142_++) {
					if (i_125_ == i_140_ && i_141_ >= i_130_ && i_141_ <= i_130_ + 8 && i_142_ >= i_131_ && i_142_ <= i_131_ + 8) {
						int i_143_;
						int i_144_;
						if (i_141_ == i_130_ + 8 || 8 + i_131_ == i_142_) {
							if (0 == i_128_) {
								i_143_ = i_141_ - i_130_ + i_123_;
								i_144_ = i_142_ - i_131_ + i_124_;
							} else if (1 == i_128_) {
								i_143_ = i_142_ - i_131_ + i_123_;
								i_144_ = i_124_ + 8 - (i_141_ - i_130_);
							} else if (2 == i_128_) {
								i_143_ = i_123_ + 8 - (i_141_ - i_130_);
								i_144_ = 8 + i_124_ - (i_142_ - i_131_);
							} else {
								i_143_ = 8 + i_123_ - (i_142_ - i_131_);
								i_144_ = i_124_ + (i_141_ - i_130_);
							}
							method5871(class282_sub35, i, i_143_, i_144_, 0, 0, i_136_ + i_141_, i_137_ + i_142_, 0, true, 1122422835);
						} else {
							i_143_ = i_123_ + Class112.method1871(i_141_ & 0x7, i_142_ & 0x7, i_128_, 1449989045);
							i_144_ = i_124_ + Class2.method259(i_141_ & 0x7, i_142_ & 0x7, i_128_, 656585016);
							method5871(class282_sub35, i, i_143_, i_144_, i_138_, i_139_, i_136_ + i_141_, i_137_ + i_142_, i_128_, false, -310142187);
						}
						if (i_141_ == 63 || 63 == i_142_) {
							int i_145_ = 1;
							if (63 == i_141_ && i_142_ == 63)
								i_145_ = 3;
							for (int i_146_ = 0; i_146_ < i_145_; i_146_++) {
								int i_147_ = i_141_;
								int i_148_ = i_142_;
								if (0 == i_146_) {
									i_147_ = i_141_ == 63 ? 64 : i_141_;
									i_148_ = 63 == i_142_ ? 64 : i_142_;
								} else if (1 == i_146_)
									i_147_ = 64;
								else if (2 == i_146_)
									i_148_ = 64;
								int i_149_;
								int i_150_;
								if (0 == i_128_) {
									i_149_ = i_123_ + (i_147_ - i_130_);
									i_150_ = i_148_ - i_131_ + i_124_;
								} else if (1 == i_128_) {
									i_149_ = i_123_ + (i_148_ - i_131_);
									i_150_ = 8 + i_124_ - (i_147_ - i_130_);
								} else if (2 == i_128_) {
									i_149_ = i_123_ + 8 - (i_147_ - i_130_);
									i_150_ = i_124_ + 8 - (i_148_ - i_131_);
								} else {
									i_149_ = 8 + i_123_ - (i_148_ - i_131_);
									i_150_ = i_147_ - i_130_ + i_124_;
								}
								if (i_149_ >= 0 && i_149_ < -1230013231 * anInt3784 && i_150_ >= 0 && i_150_ < anInt3785 * 2024737111)
									anIntArrayArrayArray3818[i][i_149_][i_150_] = (anIntArrayArrayArray3818[i][i_143_ + i_138_][i_139_ + i_144_]);
							}
						}
					} else
						method5871(class282_sub35, 0, -1, -1, 0, 0, 0, 0, 0, false, 56162627);
				}
			}
		}
	}

	public final void method5842(int i, int i_151_, int i_152_, int i_153_) {
		for (int i_154_ = 0; i_154_ < anInt3845 * 1599084401; i_154_++)
			method5838(i_154_, i, i_151_, i_152_, i_153_, -1337783095);
	}

	public void method5843(GraphicalRenderer class505, int[][][] is, Class336[] class336s, byte i) {
		if (!aBool3786) {
			for (int i_155_ = 0; i_155_ < 4; i_155_++) {
				for (int i_156_ = 0; i_156_ < anInt3784 * -1230013231; i_156_++) {
					for (int i_157_ = 0; i_157_ < 2024737111 * anInt3785; i_157_++) {
						if (0 != ((aClass311_3787.aByteArrayArrayArray3638[i_155_][i_156_][i_157_]) & 0x1)) {
							int i_158_ = i_155_;
							if (0 != ((aClass311_3787.aByteArrayArrayArray3638[1][i_156_][i_157_]) & 0x2))
								i_158_--;
							if (i_158_ >= 0)
								class336s[i_158_].method5972(i_156_, i_157_, 16711935);
						}
					}
				}
			}
		}
		for (int i_159_ = 0; i_159_ < anInt3845 * 1599084401; i_159_++) {
			int i_160_ = 0;
			int i_161_ = 0;
			if (!aBool3786) {
				if (aBool3835)
					i_161_ |= 0x8;
				if (aBool3780)
					i_160_ |= 0x2;
				if (anInt3809 * 207676255 != 0) {
					i_160_ |= 0x1;
					i_161_ |= 0x10;
				}
			}
			if (aBool3780)
				i_161_ |= 0x7;
			if (!aBool3782)
				i_161_ |= 0x20;
			int[][] is_162_ = (is != null && i_159_ < is.length ? is[i_159_] : anIntArrayArrayArray3818[i_159_]);
			aClass206_3776.method3385(i_159_, class505.method8478(-1230013231 * anInt3784, anInt3785 * 2024737111, anIntArrayArrayArray3818[i_159_], is_162_, 512, i_160_, i_161_), 322492568);
		}
	}

	void method5844(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_163_, Class390 class390_164_) {
		for (int i_165_ = 0; i_165_ < -1230013231 * anInt3784; i_165_++) {
			for (int i_166_ = 0; i_166_ < 2024737111 * anInt3785; i_166_++) {
				byte i_167_ = (((Class329) this).aByteArrayArrayArray3790[i][i_165_][i_166_]);
				byte i_168_ = (((Class329) this).aByteArrayArrayArray3791[i][i_165_][i_166_]);
				int i_169_ = ((((Class329) this).aByteArrayArrayArray3825[i][i_165_][i_166_]) & 0xff);
				int i_170_ = ((((Class329) this).aByteArrayArrayArray3808[i][i_165_][i_166_]) & 0xff);
				Class531 class531 = (0 != i_169_ ? ((Class329) this).aClass536_3834.method11475(i_169_ - 1, (byte) 0) : null);
				Class481 class481 = (i_170_ != 0 ? ((Class329) this).aClass479_3789.method8025(i_170_ - 1, (byte) -121) : null);
				if (0 == i_167_ && class531 == null)
					i_167_ = (byte) 12;
				Class531 class531_171_ = class531;
				if (null != class531 && -1 == 1419498143 * class531.anInt7054 && -1 == -848345857 * class531.anInt7058) {
					class531_171_ = class531;
					class531 = null;
				}
				if (class531 != null || class481 != null) {
					((Class329) this).anInt3855 = anIntArray3829[i_167_] * -32442583;
					((Class329) this).anInt3856 = anIntArray3814[i_167_] * 1732574483;
					int i_172_ = ((null != class481 ? ((Class329) this).anInt3855 * -1657432807 : 0) + (class531 != null ? ((Class329) this).anInt3856 * -1916381925 : 0));
					int i_173_ = 0;
					((Class329) this).anInt3781 = 0;
					((Class329) this).anInt3848 = (null != class531 ? 1717409107 * class531.anInt7066 : -1) * -1668530227;
					int i_174_ = (class481 != null ? class481.anInt5719 * -1346987295 : -1);
					int[] is_175_ = new int[i_172_];
					int[] is_176_ = new int[i_172_];
					int[] is_177_ = new int[i_172_];
					int[] is_178_ = new int[i_172_];
					int[] is_179_ = new int[i_172_];
					int[] is_180_ = new int[i_172_];
					int[] is_181_ = ((class531 != null && -1 != class531.anInt7058 * -848345857) ? new int[i_172_] : null);
					if (class531 != null) {
						for (int i_182_ = 0; (i_182_ < -1916381925 * ((Class329) this).anInt3856); i_182_++) {
							is_175_[i_173_] = (anIntArrayArray3824[i_167_][((Class329) this).anInt3781 * 1070348131]);
							is_176_[i_173_] = (anIntArrayArray3860[i_167_][((Class329) this).anInt3781 * 1070348131]);
							is_177_[i_173_] = (anIntArrayArray3815[i_167_][1070348131 * ((Class329) this).anInt3781]);
							is_179_[i_173_] = 1725089029 * ((Class329) this).anInt3848;
							is_180_[i_173_] = -1065364389 * class531.anInt7057;
							is_178_[i_173_] = class531.anInt7054 * 1419498143;
							if (is_181_ != null)
								is_181_[i_173_] = class531.anInt7058 * -848345857;
							i_173_++;
							((Class329) this).anInt3781 += 56558155;
						}
						if (!aBool3786 && i == 0)
							aClass206_3776.method3392(i_165_, i_166_, class531.anInt7051 * 220189999, class531.anInt7063 * 442664952, class531.anInt7064 * -1036917025, 669977931 * class531.anInt7065, class531.anInt7055 * -1307230745, -335219819 * class531.anInt7067, (short) -25627);
					} else
						((Class329) this).anInt3781 += ((Class329) this).anInt3856 * -70638359;
					if (class481 != null) {
						for (int i_183_ = 0; (i_183_ < -1657432807 * ((Class329) this).anInt3855); i_183_++) {
							is_175_[i_173_] = (anIntArrayArray3824[i_167_][((Class329) this).anInt3781 * 1070348131]);
							is_176_[i_173_] = (anIntArrayArray3860[i_167_][1070348131 * ((Class329) this).anInt3781]);
							is_177_[i_173_] = (anIntArrayArray3815[i_167_][((Class329) this).anInt3781 * 1070348131]);
							is_179_[i_173_] = i_174_;
							is_180_[i_173_] = -1001005969 * class481.anInt5720;
							is_178_[i_173_] = is[i_165_][i_166_];
							if (is_181_ != null)
								is_181_[i_173_] = is_178_[i_173_];
							i_173_++;
							((Class329) this).anInt3781 += 56558155;
						}
					}
					int i_184_ = anIntArray3811.length;
					int[] is_185_ = new int[i_184_];
					int[] is_186_ = new int[i_184_];
					int[] is_187_ = class390_164_ != null ? new int[i_184_] : null;
					int[] is_188_ = (null != class390_164_ || class390_163_ != null ? new int[i_184_] : null);
					for (int i_189_ = 0; i_189_ < i_184_; i_189_++) {
						int i_190_ = anIntArray3811[i_189_];
						int i_191_ = anIntArray3800[i_189_];
						if (0 == i_168_) {
							is_185_[i_189_] = i_190_;
							is_186_[i_189_] = i_191_;
						} else if (1 == i_168_) {
							int i_192_ = i_190_;
							is_185_[i_189_] = i_191_;
							is_186_[i_189_] = 512 - i_192_;
						} else if (2 == i_168_) {
							is_185_[i_189_] = 512 - i_190_;
							is_186_[i_189_] = 512 - i_191_;
						} else if (3 == i_168_) {
							int i_193_ = i_190_;
							is_185_[i_189_] = 512 - i_191_;
							is_186_[i_189_] = i_193_;
						}
						if (null != is_187_ && aBoolArrayArray3822[i_167_][i_189_]) {
							int i_194_ = (i_165_ << 9) + is_185_[i_189_];
							int i_195_ = (i_166_ << 9) + is_186_[i_189_];
							is_187_[i_189_] = (class390_164_.method6709(i_194_, i_195_, -43336556) - class390.method6709(i_194_, i_195_, -370685942));
						}
						if (null != is_188_) {
							if (null != class390_164_ && !aBoolArrayArray3822[i_167_][i_189_]) {
								int i_196_ = is_185_[i_189_] + (i_165_ << 9);
								int i_197_ = is_186_[i_189_] + (i_166_ << 9);
								is_188_[i_189_] = (class390.method6709(i_196_, i_197_, -1333020880) - (class390_164_.method6709(i_196_, i_197_, -1602216013)));
							} else if (class390_163_ != null && !(aBoolArrayArray3823[i_167_][i_189_])) {
								int i_198_ = is_185_[i_189_] + (i_165_ << 9);
								int i_199_ = (i_166_ << 9) + is_186_[i_189_];
								is_188_[i_189_] = (class390_163_.method6709(i_198_, i_199_, -994904759) - class390.method6709(i_198_, i_199_, -712576783));
							}
						}
					}
					int i_200_ = class390.method6722(i_165_, i_166_, 65280);
					int i_201_ = class390.method6722(1 + i_165_, i_166_, 65280);
					int i_202_ = class390.method6722(i_165_ + 1, i_166_ + 1, 65280);
					int i_203_ = class390.method6722(i_165_, 1 + i_166_, 65280);
					boolean bool = aClass311_3787.method5497(i_165_, i_166_, 2023437713);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_204_ = true;
						if (null != class481 && !class481.aBool5722)
							bool_204_ = false;
						else if (i_170_ == 0 && 0 != i_167_)
							bool_204_ = false;
						else if (i_169_ > 0 && class531_171_ != null && !class531_171_.aBool7056)
							bool_204_ = false;
						if (bool_204_ && i_200_ == i_201_ && i_200_ == i_202_ && i_200_ == i_203_)
							aByteArrayArrayArray3794[i][i_165_][i_166_] |= 0x4;
					}
					Class90 class90 = new Class90();
					if (aBool3786) {
						class90.anInt946 = (aClass206_3776.method3387(i_165_, i_166_, (byte) 107) * -1856397433);
						class90.anInt945 = (aClass206_3776.method3386(i_165_, i_166_, 1499060423) * 873459953);
						class90.anInt947 = (aClass206_3776.method3538(i_165_, i_166_, -575094789) * -96197041);
						class90.anInt949 = (aClass206_3776.method3432(i_165_, i_166_, (byte) 1) * -1472617411);
						class90.anInt950 = (aClass206_3776.method3464(i_165_, i_166_, 1676472771) * 1801644261);
						class90.anInt951 = (aClass206_3776.method3391(i_165_, i_166_, 1994121470) * 1412616155);
					}
					class390.method6708(i_165_, i_166_, is_185_, is_187_, is_186_, is_188_, is_175_, is_176_, is_177_, is_178_, is_181_, is_179_, is_180_, class90, false);
					aClass206_3776.method3384(i, i_165_, i_166_, (byte) -31);
				}
			}
		}
	}

	void method5845(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_205_, Class390 class390_206_, byte i_207_) {
		for (int i_208_ = 0; i_208_ < -1230013231 * anInt3784; i_208_++) {
			for (int i_209_ = 0; i_209_ < 2024737111 * anInt3785; i_209_++) {
				byte i_210_ = (((Class329) this).aByteArrayArrayArray3790[i][i_208_][i_209_]);
				byte i_211_ = (((Class329) this).aByteArrayArrayArray3791[i][i_208_][i_209_]);
				int i_212_ = ((((Class329) this).aByteArrayArrayArray3825[i][i_208_][i_209_]) & 0xff);
				int i_213_ = ((((Class329) this).aByteArrayArrayArray3808[i][i_208_][i_209_]) & 0xff);
				Class531 class531 = (0 != i_212_ ? ((Class329) this).aClass536_3834.method11475(i_212_ - 1, (byte) 0) : null);
				Class481 class481 = (i_213_ != 0 ? ((Class329) this).aClass479_3789.method8025(i_213_ - 1, (byte) -14) : null);
				if (0 == i_210_ && class531 == null)
					i_210_ = (byte) 12;
				Class531 class531_214_ = class531;
				if (null != class531 && -1 == 1419498143 * class531.anInt7054 && -1 == -848345857 * class531.anInt7058) {
					class531_214_ = class531;
					class531 = null;
				}
				if (class531 != null || class481 != null) {
					((Class329) this).anInt3855 = anIntArray3829[i_210_] * -32442583;
					((Class329) this).anInt3856 = anIntArray3814[i_210_] * 1732574483;
					int i_215_ = ((null != class481 ? ((Class329) this).anInt3855 * -1657432807 : 0) + (class531 != null ? ((Class329) this).anInt3856 * -1916381925 : 0));
					int i_216_ = 0;
					((Class329) this).anInt3781 = 0;
					((Class329) this).anInt3848 = (null != class531 ? 1717409107 * class531.anInt7066 : -1) * -1668530227;
					int i_217_ = (class481 != null ? class481.anInt5719 * -1346987295 : -1);
					int[] is_218_ = new int[i_215_];
					int[] is_219_ = new int[i_215_];
					int[] is_220_ = new int[i_215_];
					int[] is_221_ = new int[i_215_];
					int[] is_222_ = new int[i_215_];
					int[] is_223_ = new int[i_215_];
					int[] is_224_ = ((class531 != null && -1 != class531.anInt7058 * -848345857) ? new int[i_215_] : null);
					if (class531 != null) {
						for (int i_225_ = 0; (i_225_ < -1916381925 * ((Class329) this).anInt3856); i_225_++) {
							is_218_[i_216_] = (anIntArrayArray3824[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_219_[i_216_] = (anIntArrayArray3860[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_220_[i_216_] = (anIntArrayArray3815[i_210_][1070348131 * ((Class329) this).anInt3781]);
							is_222_[i_216_] = 1725089029 * ((Class329) this).anInt3848;
							is_223_[i_216_] = -1065364389 * class531.anInt7057;
							is_221_[i_216_] = class531.anInt7054 * 1419498143;
							if (is_224_ != null)
								is_224_[i_216_] = class531.anInt7058 * -848345857;
							i_216_++;
							((Class329) this).anInt3781 += 56558155;
						}
						if (!aBool3786 && i == 0)
							aClass206_3776.method3392(i_208_, i_209_, class531.anInt7051 * 220189999, class531.anInt7063 * 442664952, class531.anInt7064 * -1036917025, 669977931 * class531.anInt7065, class531.anInt7055 * -1307230745, -335219819 * class531.anInt7067, (short) -10476);
					} else
						((Class329) this).anInt3781 += ((Class329) this).anInt3856 * -70638359;
					if (class481 != null) {
						for (int i_226_ = 0; (i_226_ < -1657432807 * ((Class329) this).anInt3855); i_226_++) {
							is_218_[i_216_] = (anIntArrayArray3824[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_219_[i_216_] = (anIntArrayArray3860[i_210_][1070348131 * ((Class329) this).anInt3781]);
							is_220_[i_216_] = (anIntArrayArray3815[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_222_[i_216_] = i_217_;
							is_223_[i_216_] = -1001005969 * class481.anInt5720;
							is_221_[i_216_] = is[i_208_][i_209_];
							if (is_224_ != null)
								is_224_[i_216_] = is_221_[i_216_];
							i_216_++;
							((Class329) this).anInt3781 += 56558155;
						}
					}
					int i_227_ = anIntArray3811.length;
					int[] is_228_ = new int[i_227_];
					int[] is_229_ = new int[i_227_];
					int[] is_230_ = class390_206_ != null ? new int[i_227_] : null;
					int[] is_231_ = (null != class390_206_ || class390_205_ != null ? new int[i_227_] : null);
					for (int i_232_ = 0; i_232_ < i_227_; i_232_++) {
						int i_233_ = anIntArray3811[i_232_];
						int i_234_ = anIntArray3800[i_232_];
						if (0 == i_211_) {
							is_228_[i_232_] = i_233_;
							is_229_[i_232_] = i_234_;
						} else if (1 == i_211_) {
							int i_235_ = i_233_;
							is_228_[i_232_] = i_234_;
							is_229_[i_232_] = 512 - i_235_;
						} else if (2 == i_211_) {
							is_228_[i_232_] = 512 - i_233_;
							is_229_[i_232_] = 512 - i_234_;
						} else if (3 == i_211_) {
							int i_236_ = i_233_;
							is_228_[i_232_] = 512 - i_234_;
							is_229_[i_232_] = i_236_;
						}
						if (null != is_230_ && aBoolArrayArray3822[i_210_][i_232_]) {
							int i_237_ = (i_208_ << 9) + is_228_[i_232_];
							int i_238_ = (i_209_ << 9) + is_229_[i_232_];
							is_230_[i_232_] = (class390_206_.method6709(i_237_, i_238_, 1611134572) - class390.method6709(i_237_, i_238_, -1090922483));
						}
						if (null != is_231_) {
							if (null != class390_206_ && !aBoolArrayArray3822[i_210_][i_232_]) {
								int i_239_ = is_228_[i_232_] + (i_208_ << 9);
								int i_240_ = is_229_[i_232_] + (i_209_ << 9);
								is_231_[i_232_] = (class390.method6709(i_239_, i_240_, 1460513028) - (class390_206_.method6709(i_239_, i_240_, -2104579941)));
							} else if (class390_205_ != null && !(aBoolArrayArray3823[i_210_][i_232_])) {
								int i_241_ = is_228_[i_232_] + (i_208_ << 9);
								int i_242_ = (i_209_ << 9) + is_229_[i_232_];
								is_231_[i_232_] = (class390_205_.method6709(i_241_, i_242_, -896694521) - class390.method6709(i_241_, i_242_, 1289574118));
							}
						}
					}
					int i_243_ = class390.method6722(i_208_, i_209_, 65280);
					int i_244_ = class390.method6722(1 + i_208_, i_209_, 65280);
					int i_245_ = class390.method6722(i_208_ + 1, i_209_ + 1, 65280);
					int i_246_ = class390.method6722(i_208_, 1 + i_209_, 65280);
					boolean bool = aClass311_3787.method5497(i_208_, i_209_, 1772345202);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_247_ = true;
						if (null != class481 && !class481.aBool5722)
							bool_247_ = false;
						else if (i_213_ == 0 && 0 != i_210_)
							bool_247_ = false;
						else if (i_212_ > 0 && class531_214_ != null && !class531_214_.aBool7056)
							bool_247_ = false;
						if (bool_247_ && i_243_ == i_244_ && i_243_ == i_245_ && i_243_ == i_246_)
							aByteArrayArrayArray3794[i][i_208_][i_209_] |= 0x4;
					}
					Class90 class90 = new Class90();
					if (aBool3786) {
						class90.anInt946 = (aClass206_3776.method3387(i_208_, i_209_, (byte) 110) * -1856397433);
						class90.anInt945 = (aClass206_3776.method3386(i_208_, i_209_, 2091764285) * 873459953);
						class90.anInt947 = (aClass206_3776.method3538(i_208_, i_209_, -575094789) * -96197041);
						class90.anInt949 = (aClass206_3776.method3432(i_208_, i_209_, (byte) 1) * -1472617411);
						class90.anInt950 = (aClass206_3776.method3464(i_208_, i_209_, -989916176) * 1801644261);
						class90.anInt951 = (aClass206_3776.method3391(i_208_, i_209_, 2086149647) * 1412616155);
					}
					class390.method6708(i_208_, i_209_, is_228_, is_230_, is_229_, is_231_, is_218_, is_219_, is_220_, is_221_, is_224_, is_222_, is_223_, class90, false);
					aClass206_3776.method3384(i, i_208_, i_209_, (byte) 44);
				}
			}
		}
	}

	void method5846(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_248_, Class390 class390_249_, byte i_250_) {
		byte[][] is_251_ = ((Class329) this).aByteArrayArrayArray3790[i];
		byte[][] is_252_ = ((Class329) this).aByteArrayArrayArray3791[i];
		byte[][] is_253_ = ((Class329) this).aByteArrayArrayArray3808[i];
		byte[][] is_254_ = ((Class329) this).aByteArrayArrayArray3825[i];
		boolean[] bools = new boolean[4];
		for (int i_255_ = 0; i_255_ < anInt3784 * -1230013231; i_255_++) {
			int i_256_ = i_255_ < anInt3784 * -1230013231 - 1 ? 1 + i_255_ : i_255_;
			for (int i_257_ = 0; i_257_ < 2024737111 * anInt3785; i_257_++) {
				int i_258_ = (i_257_ < anInt3785 * 2024737111 - 1 ? 1 + i_257_ : i_257_);
				((Class329) this).anInt3844 = is_251_[i_255_][i_257_] * 1489820949;
				((Class329) this).anInt3781 = is_252_[i_255_][i_257_] * 56558155;
				int i_259_ = is_254_[i_255_][i_257_] & 0xff;
				int i_260_ = is_253_[i_255_][i_257_] & 0xff;
				if (i_259_ != 0 || i_260_ != 0) {
					Class531 class531 = (i_259_ != 0 ? ((Class329) this).aClass536_3834.method11475(i_259_ - 1, (byte) 0) : null);
					Class481 class481 = (0 != i_260_ ? ((Class329) this).aClass479_3789.method8025(i_260_ - 1, (byte) -6) : null);
					if (0 == -595948995 * ((Class329) this).anInt3844 && null == class531)
						((Class329) this).anInt3844 = 697982204;
					((Class329) this).aBool3851 = false;
					((Class329) this).aBool3810 = false;
					boolean[] bools_261_ = bools;
					boolean[] bools_262_ = bools;
					boolean[] bools_263_ = bools;
					bools[3] = false;
					bools_263_[2] = false;
					bools_262_[1] = false;
					bools_261_[0] = false;
					Class531 class531_264_ = class531;
					if (null != class531) {
						if (-1 == class531.anInt7054 * 1419498143 && -1 == class531.anInt7058 * -848345857) {
							class531_264_ = class531;
							class531 = null;
						} else if (null != class481 && (-595948995 * ((Class329) this).anInt3844 != 0))
							((Class329) this).aBool3810 = class531.aBool7061;
					}
					((Class329) this).anInt3781 = method5870(i_260_, i_255_, i_257_, i_256_, i_258_, class390, is_253_, -770588954) * 56558155;
					for (int i_265_ = 0; i_265_ < 13; i_265_++) {
						((Class329) this).anIntArray3842[i_265_] = -1;
						((Class329) this).anIntArray3843[i_265_] = 1;
					}
					method5859(class505, class531, class481, i_255_, i_257_, is_251_, is_252_, is_254_, bools, (short) 14961);
					((Class329) this).aBool3853 = (!((Class329) this).aBool3810 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method5849(class531, class481, -961871857);
					int i_266_ = (-1657432807 * ((Class329) this).anInt3855 + -1916381925 * ((Class329) this).anInt3856);
					if (i_266_ <= 0)
						aClass206_3776.method3384(i, i_255_, i_257_, (byte) 7);
					else {
						if (bools[0])
							i_266_++;
						if (bools[2])
							i_266_++;
						if (bools[1])
							i_266_++;
						if (bools[3])
							i_266_++;
						((Class329) this).anInt3846 = 0;
						((Class329) this).anInt3852 = 0;
						int i_267_ = 3 * i_266_;
						int[] is_268_ = (((Class329) this).aBool3854 ? new int[i_267_] : null);
						int[] is_269_ = new int[i_267_];
						int[] is_270_ = new int[i_267_];
						int[] is_271_ = new int[i_267_];
						int[] is_272_ = new int[i_267_];
						int[] is_273_ = new int[i_267_];
						int[] is_274_ = null != class390_249_ ? new int[i_267_] : null;
						int[] is_275_ = (null != class390_249_ || class390_248_ != null ? new int[i_267_] : null);
						method5850(class505, i, i_255_, i_257_, class531, bools, is_268_, is_269_, is_270_, is_271_, is_272_, is_273_, is_274_, is_275_, class390, class390_249_, class390_248_, 702605153);
						int i_276_ = is_253_[i_255_][i_258_] & 0xff;
						int i_277_ = is_253_[i_256_][i_258_] & 0xff;
						int i_278_ = is_253_[i_256_][i_257_] & 0xff;
						method5851(class505, i, i_255_, i_257_, i_256_, i_258_, class481, i_260_, i_276_, i_277_, i_278_, bools, is_268_, is_269_, is_270_, is_271_, is_272_, is_273_, is_274_, is_275_, is, class390, class390_249_, class390_248_, (byte) 2);
						method5852(class390, class481, class531_264_, i, i_255_, i_257_, i_256_, i_258_, i_260_, i_259_, (short) 13205);
						Class90 class90 = new Class90();
						if (aBool3786) {
							class90.anInt946 = (aClass206_3776.method3387(i_255_, i_257_, (byte) 114) * -1856397433);
							class90.anInt945 = (aClass206_3776.method3386(i_255_, i_257_, 1952003657) * 873459953);
							class90.anInt947 = (aClass206_3776.method3538(i_255_, i_257_, -575094789) * -96197041);
							class90.anInt949 = (aClass206_3776.method3432(i_255_, i_257_, (byte) 1) * -1472617411);
							class90.anInt950 = (aClass206_3776.method3464(i_255_, i_257_, -1127280692) * 1801644261);
							class90.anInt951 = (aClass206_3776.method3391(i_255_, i_257_, 2048484597) * 1412616155);
						}
						class390.method6707(i_255_, i_257_, is_269_, is_274_, is_270_, is_275_, is_271_, is_268_, is_272_, is_273_, class90, ((Class329) this).aBool3851);
						aClass206_3776.method3384(i, i_255_, i_257_, (byte) -7);
					}
				}
			}
		}
	}

	final void method5847(RsByteBuffer class282_sub35, int i, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_, int i_285_, boolean bool) {
		if (1 == i_285_)
			i_282_ = 1;
		else if (2 == i_285_) {
			i_281_ = 1;
			i_282_ = 1;
		} else if (i_285_ == 3)
			i_281_ = 1;
		if (i_279_ >= 0 && i_279_ < -1230013231 * anInt3784 && i_280_ >= 0 && i_280_ < 2024737111 * anInt3785) {
			if (!aBool3786 && !bool)
				aClass311_3787.aByteArrayArrayArray3638[i][i_279_][i_280_] = (byte) 0;
			for (;;) {
				int i_286_ = class282_sub35.readUnsignedByte();
				if (i_286_ == 0) {
					if (aBool3786)
						anIntArrayArrayArray3818[0][i_281_ + i_279_][i_282_ + i_280_] = 0;
					else if (i == 0)
						anIntArrayArrayArray3818[0][i_279_ + i_281_][i_282_ + i_280_] = (-Class92.method1560(i_283_ + 932731, i_284_ + 556238, 1939298679) * 8) << 2;
					else
						anIntArrayArrayArray3818[i][i_279_ + i_281_][i_282_ + i_280_] = (anIntArrayArrayArray3818[i - 1][i_281_ + i_279_][i_280_ + i_282_]) - 960;
					break;
				}
				if (i_286_ == 1) {
					int i_287_ = class282_sub35.readUnsignedByte();
					if (!aBool3786) {
						if (i_287_ == 1)
							i_287_ = 0;
						if (0 == i)
							anIntArrayArrayArray3818[0][i_279_ + i_281_][i_280_ + i_282_] = 8 * -i_287_ << 2;
						else
							anIntArrayArrayArray3818[i][i_279_ + i_281_][i_282_ + i_280_] = ((anIntArrayArrayArray3818[i - 1][i_279_ + i_281_][i_280_ + i_282_]) - (8 * i_287_ << 2));
					} else
						anIntArrayArrayArray3818[0][i_281_ + i_279_][i_280_ + i_282_] = 8 * i_287_ << 2;
					break;
				}
				if (i_286_ <= 49) {
					if (bool)
						class282_sub35.readUnsignedByte();
					else {
						((Class329) this).aByteArrayArrayArray3825[i][i_279_][i_280_] = class282_sub35.readByte((short) -5540);
						((Class329) this).aByteArrayArrayArray3790[i][i_279_][i_280_] = (byte) ((i_286_ - 2) / 4);
						((Class329) this).aByteArrayArrayArray3791[i][i_279_][i_280_] = (byte) (i_285_ + (i_286_ - 2) & 0x3);
					}
				} else if (i_286_ <= 81) {
					if (!aBool3786 && !bool)
						aClass311_3787.aByteArrayArrayArray3638[i][i_279_][i_280_] = (byte) (i_286_ - 49);
				} else if (!bool)
					((Class329) this).aByteArrayArrayArray3808[i][i_279_][i_280_] = (byte) (i_286_ - 81);
			}
		} else {
			for (;;) {
				int i_288_ = class282_sub35.readUnsignedByte();
				if (0 == i_288_)
					break;
				if (i_288_ == 1) {
					class282_sub35.readUnsignedByte();
					break;
				}
				if (i_288_ <= 49)
					class282_sub35.readUnsignedByte();
			}
		}
	}

	final void method5848(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_289_, int i_290_, int i_291_, byte[][] is, byte[][] is_292_, byte[][] is_293_, boolean[] bools, int i_294_) {
		boolean[] bools_295_ = (null != class531 && class531.aBool7061 ? aBoolArrayArray3793[-595948995 * ((Class329) this).anInt3844] : (aBoolArrayArray3816[((Class329) this).anInt3844 * -595948995]));
		if (i_289_ > 0) {
			if (i > 0) {
				int i_296_ = is[i - 1][i_289_ - 1] & 0xff;
				if (i_296_ > 0) {
					Class531 class531_297_ = ((Class329) this).aClass536_3834.method11475(i_296_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_297_.anInt7054 && class531_297_.aBool7061) {
						byte i_298_ = is_292_[i - 1][i_289_ - 1];
						int i_299_ = 2 * is_293_[i - 1][i_289_ - 1] + 4 & 0x7;
						int i_300_ = Class153.method2617(class505, class531_297_, (byte) -21);
						if (aBoolArrayArray3822[i_298_][i_299_]) {
							((Class329) this).anIntArray3838[0] = class531_297_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[0] = i_300_;
							((Class329) this).anIntArray3813[0] = 1717409107 * class531_297_.anInt7066;
							((Class329) this).anIntArray3827[0] = class531_297_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[0] = 1070524733 * class531_297_.anInt7052;
							((Class329) this).anIntArray3843[0] = 256;
						}
					}
				}
			}
			if (i < i_290_ - 1) {
				int i_301_ = is[i + 1][i_289_ - 1] & 0xff;
				if (i_301_ > 0) {
					Class531 class531_302_ = ((Class329) this).aClass536_3834.method11475(i_301_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_302_.anInt7054 && class531_302_.aBool7061) {
						byte i_303_ = is_292_[1 + i][i_289_ - 1];
						int i_304_ = 6 + is_293_[1 + i][i_289_ - 1] * 2 & 0x7;
						int i_305_ = Class153.method2617(class505, class531_302_, (byte) -18);
						if (aBoolArrayArray3822[i_303_][i_304_]) {
							((Class329) this).anIntArray3838[2] = 1419498143 * class531_302_.anInt7054;
							((Class329) this).anIntArray3839[2] = i_305_;
							((Class329) this).anIntArray3813[2] = 1717409107 * class531_302_.anInt7066;
							((Class329) this).anIntArray3827[2] = -1065364389 * class531_302_.anInt7057;
							((Class329) this).anIntArray3842[2] = class531_302_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[2] = 512;
						}
					}
				}
			}
		}
		if (i_289_ < i_291_ - 1) {
			if (i > 0) {
				int i_306_ = is[i - 1][i_289_ + 1] & 0xff;
				if (i_306_ > 0) {
					Class531 class531_307_ = ((Class329) this).aClass536_3834.method11475(i_306_ - 1, (byte) 0);
					if (class531_307_.anInt7054 * 1419498143 != -1 && class531_307_.aBool7061) {
						byte i_308_ = is_292_[i - 1][i_289_ + 1];
						int i_309_ = is_293_[i - 1][1 + i_289_] * 2 + 2 & 0x7;
						int i_310_ = Class153.method2617(class505, class531_307_, (byte) 12);
						if (aBoolArrayArray3822[i_308_][i_309_]) {
							((Class329) this).anIntArray3838[6] = class531_307_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[6] = i_310_;
							((Class329) this).anIntArray3813[6] = 1717409107 * class531_307_.anInt7066;
							((Class329) this).anIntArray3827[6] = class531_307_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[6] = class531_307_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[6] = 64;
						}
					}
				}
			}
			if (i < i_290_ - 1) {
				int i_311_ = is[1 + i][i_289_ + 1] & 0xff;
				if (i_311_ > 0) {
					Class531 class531_312_ = ((Class329) this).aClass536_3834.method11475(i_311_ - 1, (byte) 0);
					if (1419498143 * class531_312_.anInt7054 != -1 && class531_312_.aBool7061) {
						byte i_313_ = is_292_[i + 1][1 + i_289_];
						int i_314_ = 2 * is_293_[i + 1][i_289_ + 1] + 0 & 0x7;
						int i_315_ = Class153.method2617(class505, class531_312_, (byte) -16);
						if (aBoolArrayArray3822[i_313_][i_314_]) {
							((Class329) this).anIntArray3838[4] = class531_312_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[4] = i_315_;
							((Class329) this).anIntArray3813[4] = class531_312_.anInt7066 * 1717409107;
							((Class329) this).anIntArray3827[4] = -1065364389 * class531_312_.anInt7057;
							((Class329) this).anIntArray3842[4] = 1070524733 * class531_312_.anInt7052;
							((Class329) this).anIntArray3843[4] = 128;
						}
					}
				}
			}
		}
		if (i_289_ > 0) {
			int i_316_ = is[i][i_289_ - 1] & 0xff;
			if (i_316_ > 0) {
				Class531 class531_317_ = ((Class329) this).aClass536_3834.method11475(i_316_ - 1, (byte) 0);
				if (1419498143 * class531_317_.anInt7054 != -1) {
					byte i_318_ = is_292_[i][i_289_ - 1];
					int i_319_ = is_293_[i][i_289_ - 1];
					if (class531_317_.aBool7061) {
						int i_320_ = 2;
						int i_321_ = 2 * i_319_ + 4;
						int i_322_ = Class153.method2617(class505, class531_317_, (byte) 56);
						for (int i_323_ = 0; i_323_ < 3; i_323_++) {
							i_321_ &= 0x7;
							i_320_ &= 0x7;
							if (aBoolArrayArray3822[i_318_][i_321_] && (((Class329) this).anIntArray3842[i_320_] <= class531_317_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_320_] = 1419498143 * class531_317_.anInt7054;
								((Class329) this).anIntArray3839[i_320_] = i_322_;
								((Class329) this).anIntArray3813[i_320_] = 1717409107 * class531_317_.anInt7066;
								((Class329) this).anIntArray3827[i_320_] = -1065364389 * class531_317_.anInt7057;
								if (((Class329) this).anIntArray3842[i_320_] == 1070524733 * class531_317_.anInt7052)
									((Class329) this).anIntArray3843[i_320_] |= 0x20;
								else
									((Class329) this).anIntArray3843[i_320_] = 32;
								((Class329) this).anIntArray3842[i_320_] = class531_317_.anInt7052 * 1070524733;
							}
							i_321_++;
							i_320_--;
						}
						if (!bools_295_[0 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[0] = (aBoolArrayArray3793[i_318_][2 + i_319_ & 0x3]);
					} else if (!bools_295_[0 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[0] = aBoolArrayArray3816[i_318_][i_319_ + 2 & 0x3];
				}
			}
		}
		if (i_289_ < i_291_ - 1) {
			int i_324_ = is[i][i_289_ + 1] & 0xff;
			if (i_324_ > 0) {
				Class531 class531_325_ = ((Class329) this).aClass536_3834.method11475(i_324_ - 1, (byte) 0);
				if (-1 != 1419498143 * class531_325_.anInt7054) {
					byte i_326_ = is_292_[i][i_289_ + 1];
					int i_327_ = is_293_[i][i_289_ + 1];
					if (class531_325_.aBool7061) {
						int i_328_ = 4;
						int i_329_ = 2 * i_327_ + 2;
						int i_330_ = Class153.method2617(class505, class531_325_, (byte) 43);
						for (int i_331_ = 0; i_331_ < 3; i_331_++) {
							i_329_ &= 0x7;
							i_328_ &= 0x7;
							if (aBoolArrayArray3822[i_326_][i_329_] && (((Class329) this).anIntArray3842[i_328_] <= 1070524733 * class531_325_.anInt7052)) {
								((Class329) this).anIntArray3838[i_328_] = class531_325_.anInt7054 * 1419498143;
								((Class329) this).anIntArray3839[i_328_] = i_330_;
								((Class329) this).anIntArray3813[i_328_] = 1717409107 * class531_325_.anInt7066;
								((Class329) this).anIntArray3827[i_328_] = class531_325_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_328_] == 1070524733 * class531_325_.anInt7052)
									((Class329) this).anIntArray3843[i_328_] |= 0x10;
								else
									((Class329) this).anIntArray3843[i_328_] = 16;
								((Class329) this).anIntArray3842[i_328_] = 1070524733 * class531_325_.anInt7052;
							}
							i_329_--;
							i_328_++;
						}
						if (!bools_295_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
							bools[2] = (aBoolArrayArray3793[i_326_][i_327_ + 0 & 0x3]);
					} else if (!bools_295_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[2] = aBoolArrayArray3816[i_326_][0 + i_327_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_332_ = is[i - 1][i_289_] & 0xff;
			if (i_332_ > 0) {
				Class531 class531_333_ = ((Class329) this).aClass536_3834.method11475(i_332_ - 1, (byte) 0);
				if (class531_333_.anInt7054 * 1419498143 != -1) {
					byte i_334_ = is_292_[i - 1][i_289_];
					int i_335_ = is_293_[i - 1][i_289_];
					if (class531_333_.aBool7061) {
						int i_336_ = 6;
						int i_337_ = i_335_ * 2 + 4;
						int i_338_ = Class153.method2617(class505, class531_333_, (byte) -53);
						for (int i_339_ = 0; i_339_ < 3; i_339_++) {
							i_337_ &= 0x7;
							i_336_ &= 0x7;
							if (aBoolArrayArray3822[i_334_][i_337_] && (((Class329) this).anIntArray3842[i_336_] <= 1070524733 * class531_333_.anInt7052)) {
								((Class329) this).anIntArray3838[i_336_] = 1419498143 * class531_333_.anInt7054;
								((Class329) this).anIntArray3839[i_336_] = i_338_;
								((Class329) this).anIntArray3813[i_336_] = class531_333_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_336_] = -1065364389 * class531_333_.anInt7057;
								if (1070524733 * class531_333_.anInt7052 == (((Class329) this).anIntArray3842[i_336_]))
									((Class329) this).anIntArray3843[i_336_] |= 0x8;
								else
									((Class329) this).anIntArray3843[i_336_] = 8;
								((Class329) this).anIntArray3842[i_336_] = 1070524733 * class531_333_.anInt7052;
							}
							i_337_--;
							i_336_++;
						}
						if (!bools_295_[(((Class329) this).anInt3781 * 1070348131 + 3 & 0x3)])
							bools[3] = (aBoolArrayArray3793[i_334_][i_335_ + 1 & 0x3]);
					} else if (!bools_295_[(3 + 1070348131 * ((Class329) this).anInt3781 & 0x3)])
						bools[3] = aBoolArrayArray3816[i_334_][1 + i_335_ & 0x3];
				}
			}
		}
		if (i < i_290_ - 1) {
			int i_340_ = is[i + 1][i_289_] & 0xff;
			if (i_340_ > 0) {
				Class531 class531_341_ = ((Class329) this).aClass536_3834.method11475(i_340_ - 1, (byte) 0);
				if (1419498143 * class531_341_.anInt7054 != -1) {
					byte i_342_ = is_292_[1 + i][i_289_];
					int i_343_ = is_293_[1 + i][i_289_];
					if (class531_341_.aBool7061) {
						int i_344_ = 4;
						int i_345_ = 6 + i_343_ * 2;
						int i_346_ = Class153.method2617(class505, class531_341_, (byte) 10);
						for (int i_347_ = 0; i_347_ < 3; i_347_++) {
							i_345_ &= 0x7;
							i_344_ &= 0x7;
							if (aBoolArrayArray3822[i_342_][i_345_] && (((Class329) this).anIntArray3842[i_344_] <= class531_341_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_344_] = 1419498143 * class531_341_.anInt7054;
								((Class329) this).anIntArray3839[i_344_] = i_346_;
								((Class329) this).anIntArray3813[i_344_] = class531_341_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_344_] = class531_341_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_344_] == class531_341_.anInt7052 * 1070524733)
									((Class329) this).anIntArray3843[i_344_] |= 0x4;
								else
									((Class329) this).anIntArray3843[i_344_] = 4;
								((Class329) this).anIntArray3842[i_344_] = class531_341_.anInt7052 * 1070524733;
							}
							i_345_++;
							i_344_--;
						}
						if (!bools_295_[1 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[1] = (aBoolArrayArray3793[i_342_][3 + i_343_ & 0x3]);
					} else if (!bools_295_[(1070348131 * ((Class329) this).anInt3781 + 1 & 0x3)])
						bools[1] = aBoolArrayArray3816[i_342_][i_343_ + 3 & 0x3];
				}
			}
		}
		if (null != class531 && class531.aBool7061) {
			int i_348_ = Class153.method2617(class505, class531, (byte) -30);
			for (int i_349_ = 0; i_349_ < 8; i_349_++) {
				int i_350_ = i_349_ - 2140696262 * ((Class329) this).anInt3781 & 0x7;
				if ((aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_349_]) && (((Class329) this).anIntArray3842[i_350_] <= class531.anInt7052 * 1070524733)) {
					((Class329) this).anIntArray3838[i_350_] = class531.anInt7054 * 1419498143;
					((Class329) this).anIntArray3839[i_350_] = i_348_;
					((Class329) this).anIntArray3813[i_350_] = 1717409107 * class531.anInt7066;
					((Class329) this).anIntArray3827[i_350_] = class531.anInt7057 * -1065364389;
					if (1070524733 * class531.anInt7052 == ((Class329) this).anIntArray3842[i_350_])
						((Class329) this).anIntArray3843[i_350_] |= 0x2;
					else
						((Class329) this).anIntArray3843[i_350_] = 2;
					((Class329) this).anIntArray3842[i_350_] = class531.anInt7052 * 1070524733;
				}
			}
		}
	}

	void method5849(Class531 class531, Class481 class481, int i) {
		if (((Class329) this).aBool3853) {
			((Class329) this).anIntArray3857 = (anIntArrayArray3824[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3860[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3815[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anInt3856 = 1732574483 * (null != class531 ? (anIntArray3814[-595948995 * ((Class329) this).anInt3844]) : 0);
			((Class329) this).anInt3855 = -32442583 * (null != class481 ? (anIntArray3829[((Class329) this).anInt3844 * -595948995]) : 0);
		} else if (((Class329) this).aBool3810) {
			((Class329) this).anIntArray3857 = (anIntArrayArray3775[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3821[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3836[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anInt3856 = 1732574483 * (null != class531 ? (anIntArray3778[((Class329) this).anInt3844 * -595948995]) : 0);
			((Class329) this).anInt3855 = (class481 != null ? anIntArray3819[-595948995 * ((Class329) this).anInt3844] : 0) * -32442583;
			((Class329) this).anIntArray3832 = (anIntArrayArray3833[-595948995 * ((Class329) this).anInt3844]);
		} else {
			((Class329) this).anIntArray3857 = (anIntArrayArray3774[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3830[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3831[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anInt3856 = (class531 != null ? anIntArray3826[((Class329) this).anInt3844 * -595948995] : 0) * 1732574483;
			((Class329) this).anInt3855 = (class481 != null ? anIntArray3847[-595948995 * ((Class329) this).anInt3844] : 0) * -32442583;
			((Class329) this).anIntArray3832 = (anIntArrayArray3828[((Class329) this).anInt3844 * -595948995]);
		}
	}

	void method5850(GraphicalRenderer class505, int i, int i_351_, int i_352_, Class531 class531, boolean[] bools, int[] is, int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, int[] is_358_, int[] is_359_, Class390 class390, Class390 class390_360_, Class390 class390_361_, int i_362_) {
		((Class329) this).anInt3850 = 1866422575;
		((Class329) this).anInt3848 = 1668530227;
		((Class329) this).anInt3849 = -566299392;
		if (class531 != null) {
			((Class329) this).anInt3850 = class531.anInt7054 * -2062938673;
			((Class329) this).anInt3848 = class531.anInt7066 * 1041498231;
			((Class329) this).anInt3849 = -1129429737 * class531.anInt7057;
			int i_363_ = Class153.method2617(class505, class531, (byte) 29);
			for (int i_364_ = 0; i_364_ < -1916381925 * ((Class329) this).anInt3856; i_364_++) {
				boolean bool = false;
				int i_365_;
				if (bools[0 - ((Class329) this).anInt3781 * 1070348131 & 0x3] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[0])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_365_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[2])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_365_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_365_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[3] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_365_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_365_ = 3;
				}
				for (int i_366_ = 0; i_366_ < i_365_; i_366_++) {
					int i_367_ = ((Class329) this).anIntArray3837[i_366_];
					int i_368_ = (i_367_ - ((Class329) this).anInt3781 * 2140696262 & 0x7);
					int i_369_ = anIntArray3811[i_367_];
					int i_370_ = anIntArray3800[i_367_];
					int i_371_;
					int i_372_;
					if (1 == 1070348131 * ((Class329) this).anInt3781) {
						i_371_ = i_370_;
						i_372_ = 512 - i_369_;
					} else if (2 == 1070348131 * ((Class329) this).anInt3781) {
						i_371_ = 512 - i_369_;
						i_372_ = 512 - i_370_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_371_ = 512 - i_370_;
						i_372_ = i_369_;
					} else {
						i_371_ = i_369_;
						i_372_ = i_370_;
					}
					is_353_[((Class329) this).anInt3852 * -1626041195] = i_371_;
					is_354_[-1626041195 * ((Class329) this).anInt3852] = i_372_;
					if (null != is_358_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_367_])) {
						int i_373_ = (i_351_ << 9) + i_371_;
						int i_374_ = (i_352_ << 9) + i_372_;
						is_358_[-1626041195 * ((Class329) this).anInt3852] = (class390_360_.method6709(i_373_, i_374_, 1550950385) - class390.method6709(i_373_, i_374_, -497084405));
					}
					if (is_359_ != null) {
						if (null != class390_360_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_367_])) {
							int i_375_ = (i_351_ << 9) + i_371_;
							int i_376_ = (i_352_ << 9) + i_372_;
							is_359_[((Class329) this).anInt3852 * -1626041195] = (class390.method6709(i_375_, i_376_, -1953375051) - class390_360_.method6709(i_375_, i_376_, -1082530779));
						} else if (class390_361_ != null && !(aBoolArrayArray3823[(((Class329) this).anInt3844 * -595948995)][i_367_])) {
							int i_377_ = i_371_ + (i_351_ << 9);
							int i_378_ = i_372_ + (i_352_ << 9);
							is_359_[-1626041195 * ((Class329) this).anInt3852] = (class390_361_.method6709(i_377_, i_378_, -1990196729) - class390.method6709(i_377_, i_378_, -1843099367));
						}
					}
					if (i_367_ < 8 && (((Class329) this).anIntArray3842[i_368_] > class531.anInt7052 * 1070524733)) {
						if (is != null)
							is[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3839[i_368_];
						is_357_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3827[i_368_];
						is_356_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3813[i_368_];
						is_355_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3838[i_368_];
					} else {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = i_363_;
						is_356_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7066 * 1717409107;
						is_357_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7057 * -1065364389;
						is_355_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (!aBool3786 && 0 == i)
				aClass206_3776.method3392(i_351_, i_352_, 220189999 * class531.anInt7051, 442664952 * class531.anInt7063, -1036917025 * class531.anInt7064, class531.anInt7065 * 669977931, -1307230745 * class531.anInt7055, class531.anInt7067 * -335219819, (short) -30684);
			if (-595948995 * ((Class329) this).anInt3844 != 12 && 1419498143 * class531.anInt7054 != -1 && class531.aBool7059)
				((Class329) this).aBool3851 = true;
		} else if (((Class329) this).aBool3853)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3814[-595948995 * ((Class329) this).anInt3844]);
		else if (((Class329) this).aBool3810)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3778[-595948995 * ((Class329) this).anInt3844]);
		else
			((Class329) this).anInt3846 += -193737745 * (anIntArray3826[-595948995 * ((Class329) this).anInt3844]);
	}

	void method5851(GraphicalRenderer class505, int i, int i_379_, int i_380_, int i_381_, int i_382_, Class481 class481, int i_383_, int i_384_, int i_385_, int i_386_, boolean[] bools, int[] is, int[] is_387_, int[] is_388_, int[] is_389_, int[] is_390_, int[] is_391_, int[] is_392_, int[] is_393_, int[][] is_394_, Class390 class390, Class390 class390_395_, Class390 class390_396_, byte i_397_) {
		if (null != class481) {
			if (i_384_ == 0)
				i_384_ = i_383_;
			if (0 == i_385_)
				i_385_ = i_383_;
			if (0 == i_386_)
				i_386_ = i_383_;
			Class481 class481_398_ = ((Class329) this).aClass479_3789.method8025(i_383_ - 1, (byte) -96);
			Class481 class481_399_ = ((Class329) this).aClass479_3789.method8025(i_384_ - 1, (byte) -18);
			Class481 class481_400_ = ((Class329) this).aClass479_3789.method8025(i_385_ - 1, (byte) -95);
			Class481 class481_401_ = ((Class329) this).aClass479_3789.method8025(i_386_ - 1, (byte) -80);
			for (int i_402_ = 0; i_402_ < -1657432807 * ((Class329) this).anInt3855; i_402_++) {
				boolean bool = false;
				int i_403_;
				if (bools[0 - 1070348131 * ((Class329) this).anInt3781 & 0x3] && (((Class329) this).anIntArray3832[0] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_403_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[2] == ((Class329) this).anInt3846 * -1256144113)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_403_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_403_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[3])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_403_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_403_ = 3;
				}
				for (int i_404_ = 0; i_404_ < i_403_; i_404_++) {
					int i_405_ = ((Class329) this).anIntArray3837[i_404_];
					int i_406_ = (i_405_ - 2140696262 * ((Class329) this).anInt3781 & 0x7);
					int i_407_ = anIntArray3811[i_405_];
					int i_408_ = anIntArray3800[i_405_];
					int i_409_;
					int i_410_;
					if (((Class329) this).anInt3781 * 1070348131 == 1) {
						i_409_ = i_408_;
						i_410_ = 512 - i_407_;
					} else if (1070348131 * ((Class329) this).anInt3781 == 2) {
						i_409_ = 512 - i_407_;
						i_410_ = 512 - i_408_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_409_ = 512 - i_408_;
						i_410_ = i_407_;
					} else {
						i_409_ = i_407_;
						i_410_ = i_408_;
					}
					is_387_[((Class329) this).anInt3852 * -1626041195] = i_409_;
					is_388_[((Class329) this).anInt3852 * -1626041195] = i_410_;
					if (null != is_392_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_405_])) {
						int i_411_ = (i_379_ << 9) + i_409_;
						int i_412_ = (i_380_ << 9) + i_410_;
						is_392_[((Class329) this).anInt3852 * -1626041195] = (class390_395_.method6709(i_411_, i_412_, -722499660) - class390.method6709(i_411_, i_412_, 478616173));
					}
					if (is_393_ != null) {
						if (null != class390_395_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_405_])) {
							int i_413_ = i_409_ + (i_379_ << 9);
							int i_414_ = (i_380_ << 9) + i_410_;
							is_393_[-1626041195 * ((Class329) this).anInt3852] = (class390.method6709(i_413_, i_414_, -1591634709) - class390_395_.method6709(i_413_, i_414_, -1293906415));
						} else if (class390_396_ != null && !(aBoolArrayArray3823[(-595948995 * ((Class329) this).anInt3844)][i_405_])) {
							int i_415_ = (i_379_ << 9) + i_409_;
							int i_416_ = (i_380_ << 9) + i_410_;
							is_393_[((Class329) this).anInt3852 * -1626041195] = (class390_396_.method6709(i_415_, i_416_, 2113040787) - class390.method6709(i_415_, i_416_, 1891063345));
						}
					}
					if (i_405_ < 8 && ((Class329) this).anIntArray3842[i_406_] >= 0) {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3839[i_406_];
						is_391_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3827[i_406_];
						is_390_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3813[i_406_];
						is_389_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3838[i_406_];
					} else {
						if (((Class329) this).aBool3810 && (aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_405_])) {
							is_390_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anInt3848 * 1725089029;
							is_391_[((Class329) this).anInt3852 * -1626041195] = -1073742499 * ((Class329) this).anInt3849;
							is_389_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
						} else if (0 == i_409_ && 0 == i_410_) {
							is_389_[-1626041195 * ((Class329) this).anInt3852] = is_394_[i_379_][i_380_];
							is_390_[-1626041195 * ((Class329) this).anInt3852] = -1346987295 * class481_398_.anInt5719;
							is_391_[((Class329) this).anInt3852 * -1626041195] = class481_398_.anInt5720 * -1001005969;
						} else if (0 == i_409_ && 512 == i_410_) {
							is_389_[((Class329) this).anInt3852 * -1626041195] = is_394_[i_379_][i_382_];
							is_390_[-1626041195 * ((Class329) this).anInt3852] = -1346987295 * class481_399_.anInt5719;
							is_391_[((Class329) this).anInt3852 * -1626041195] = class481_399_.anInt5720 * -1001005969;
						} else if (512 == i_409_ && 512 == i_410_) {
							is_389_[-1626041195 * ((Class329) this).anInt3852] = is_394_[i_381_][i_382_];
							is_390_[-1626041195 * ((Class329) this).anInt3852] = class481_400_.anInt5719 * -1346987295;
							is_391_[-1626041195 * ((Class329) this).anInt3852] = class481_400_.anInt5720 * -1001005969;
						} else if (i_409_ == 512 && 0 == i_410_) {
							is_389_[((Class329) this).anInt3852 * -1626041195] = is_394_[i_381_][i_380_];
							is_390_[((Class329) this).anInt3852 * -1626041195] = -1346987295 * class481_401_.anInt5719;
							is_391_[((Class329) this).anInt3852 * -1626041195] = -1001005969 * class481_401_.anInt5720;
						} else {
							if (i_409_ < 256) {
								if (i_410_ < 256) {
									is_390_[(-1626041195 * ((Class329) this).anInt3852)] = (-1346987295 * class481_398_.anInt5719);
									is_391_[(-1626041195 * ((Class329) this).anInt3852)] = (-1001005969 * class481_398_.anInt5720);
								} else {
									is_390_[(((Class329) this).anInt3852 * -1626041195)] = (class481_399_.anInt5719 * -1346987295);
									is_391_[(((Class329) this).anInt3852 * -1626041195)] = (-1001005969 * class481_399_.anInt5720);
								}
							} else if (i_410_ < 256) {
								is_390_[(-1626041195 * ((Class329) this).anInt3852)] = -1346987295 * class481_401_.anInt5719;
								is_391_[(-1626041195 * ((Class329) this).anInt3852)] = class481_401_.anInt5720 * -1001005969;
							} else {
								is_390_[(-1626041195 * ((Class329) this).anInt3852)] = class481_400_.anInt5719 * -1346987295;
								is_391_[(((Class329) this).anInt3852 * -1626041195)] = -1001005969 * class481_400_.anInt5720;
							}
							int i_417_ = Class371.method6347(is_394_[i_379_][i_380_], is_394_[i_381_][i_380_], i_409_ << 7 >> 9, -1964912847);
							int i_418_ = Class371.method6347(is_394_[i_379_][i_382_], is_394_[i_381_][i_382_], i_409_ << 7 >> 9, -2132910365);
							is_389_[((Class329) this).anInt3852 * -1626041195] = Class371.method6347(i_417_, i_418_, i_410_ << 7 >> 9, -2113555849);
						}
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = is_389_[(-1626041195 * ((Class329) this).anInt3852)];
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (0 != -595948995 * ((Class329) this).anInt3844 && class481.aBool5721)
				((Class329) this).aBool3851 = true;
		}
	}

	void method5852(Class390 class390, Class481 class481, Class531 class531, int i, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, int i_424_, short i_425_) {
		int i_426_ = class390.method6722(i_419_, i_420_, 65280);
		int i_427_ = class390.method6722(i_421_, i_420_, 65280);
		int i_428_ = class390.method6722(i_421_, i_422_, 65280);
		int i_429_ = class390.method6722(i_419_, i_422_, 65280);
		boolean bool = aClass311_3787.method5497(i_419_, i_420_, 1534116751);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_430_ = true;
			if (null != class481 && !class481.aBool5722)
				bool_430_ = false;
			else if (i_423_ == 0 && 0 != ((Class329) this).anInt3844 * -595948995)
				bool_430_ = false;
			else if (i_424_ > 0 && class531 != null && !class531.aBool7056)
				bool_430_ = false;
			if (bool_430_ && i_427_ == i_426_ && i_426_ == i_428_ && i_426_ == i_429_)
				aByteArrayArrayArray3794[i][i_419_][i_420_] |= 0x4;
		}
	}

	public final void method5853(int i, int[][] is, int i_431_) {
		int[][] is_432_ = anIntArrayArrayArray3818[i];
		for (int i_433_ = 0; i_433_ < anInt3784 * -1230013231 + 1; i_433_++) {
			for (int i_434_ = 0; i_434_ < 1 + 2024737111 * anInt3785; i_434_++)
				is_432_[i_433_][i_434_] += is[i_433_][i_434_];
		}
	}

	static {
		anIntArray3826 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray3847 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray3778 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray3819 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray3811 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray3800 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray3822 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBoolArrayArray3823 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray3824 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray3860 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray3815 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray3816 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray3828 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray3774 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray3830 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray3831 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray3793 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray3833 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray3775 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray3821 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray3836 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	Class329(Class206 class206, int i, int i_435_, int i_436_, boolean bool, Class536 class536, Class479 class479, Class311 class311) {
		aBool3780 = false;
		aBool3820 = false;
		aBool3782 = false;
		((Class329) this).anIntArray3837 = new int[6];
		((Class329) this).anIntArray3838 = new int[13];
		((Class329) this).anIntArray3839 = new int[13];
		((Class329) this).anIntArray3813 = new int[13];
		((Class329) this).anIntArray3827 = new int[13];
		((Class329) this).anIntArray3842 = new int[13];
		((Class329) this).anIntArray3843 = new int[13];
		((Class329) this).anInt3846 = 0;
		((Class329) this).anInt3852 = 0;
		((Class329) this).anIntArray3832 = null;
		aClass206_3776 = class206;
		anInt3845 = i * 627820945;
		anInt3784 = 1781423153 * i_435_;
		anInt3785 = 1893331559 * i_436_;
		aBool3786 = bool;
		((Class329) this).aClass536_3834 = class536;
		((Class329) this).aClass479_3789 = class479;
		aClass311_3787 = class311;
		((Class329) this).aByteArrayArrayArray3808 = (new byte[anInt3845 * 1599084401][-1230013231 * anInt3784][anInt3785 * 2024737111]);
		((Class329) this).aByteArrayArrayArray3825 = (new byte[1599084401 * anInt3845][anInt3784 * -1230013231][anInt3785 * 2024737111]);
		((Class329) this).aByteArrayArrayArray3790 = (new byte[anInt3845 * 1599084401][anInt3784 * -1230013231][2024737111 * anInt3785]);
		((Class329) this).aByteArrayArrayArray3791 = (new byte[1599084401 * anInt3845][anInt3784 * -1230013231][2024737111 * anInt3785]);
		anIntArrayArrayArray3818 = (new int[anInt3845 * 1599084401][1 + -1230013231 * anInt3784][1 + 2024737111 * anInt3785]);
		aByteArrayArrayArray3794 = (new byte[anInt3845 * 1599084401][-1230013231 * anInt3784 + 1][anInt3785 * 2024737111 + 1]);
	}

	public void method5854() {
		((Class329) this).anIntArray3795 = null;
		((Class329) this).anIntArray3796 = null;
		((Class329) this).anIntArray3797 = null;
		((Class329) this).anIntArray3798 = null;
		((Class329) this).anIntArray3799 = null;
		aBool3773 = false;
	}

	public final void method5855(int i, int i_437_, int i_438_, int i_439_) {
		for (int i_440_ = 0; i_440_ < anInt3845 * 1599084401; i_440_++)
			method5838(i_440_, i, i_437_, i_438_, i_439_, -1337783095);
	}

	public final void method5856(RsByteBuffer class282_sub35, int i, int i_441_, int i_442_, int i_443_, int i_444_, int i_445_, int i_446_, Class336[] class336s) {
		int i_447_ = (i_444_ & 0x7) * 8;
		int i_448_ = 8 * (i_445_ & 0x7);
		if (!aBool3786) {
			Class336 class336 = class336s[i];
			for (int i_449_ = 0; i_449_ < 8; i_449_++) {
				for (int i_450_ = 0; i_450_ < 8; i_450_++) {
					int i_451_ = (i_441_ + Class112.method1871(i_449_ & 0x7, i_450_ & 0x7, i_446_, 1449989045));
					int i_452_ = i_442_ + Class2.method259(i_449_ & 0x7, i_450_ & 0x7, i_446_, 828458292);
					if (i_451_ > 0 && i_451_ < -1230013231 * anInt3784 - 1 && i_452_ > 0 && i_452_ < 2024737111 * anInt3785 - 1)
						class336.method5974(i_451_, i_452_, 1933302120);
				}
			}
		}
		int i_453_ = (i_444_ & ~0x7) << 3;
		int i_454_ = (i_445_ & ~0x7) << 3;
		int i_455_ = 0;
		int i_456_ = 0;
		if (1 == i_446_)
			i_456_ = 1;
		else if (2 == i_446_) {
			i_455_ = 1;
			i_456_ = 1;
		} else if (i_446_ == 3)
			i_455_ = 1;
		for (int i_457_ = 0; i_457_ < 1599084401 * anInt3845; i_457_++) {
			for (int i_458_ = 0; i_458_ < 64; i_458_++) {
				for (int i_459_ = 0; i_459_ < 64; i_459_++) {
					if (i_443_ == i_457_ && i_458_ >= i_447_ && i_458_ <= i_447_ + 8 && i_459_ >= i_448_ && i_459_ <= i_448_ + 8) {
						int i_460_;
						int i_461_;
						if (i_458_ == i_447_ + 8 || 8 + i_448_ == i_459_) {
							if (0 == i_446_) {
								i_460_ = i_458_ - i_447_ + i_441_;
								i_461_ = i_459_ - i_448_ + i_442_;
							} else if (1 == i_446_) {
								i_460_ = i_459_ - i_448_ + i_441_;
								i_461_ = i_442_ + 8 - (i_458_ - i_447_);
							} else if (2 == i_446_) {
								i_460_ = i_441_ + 8 - (i_458_ - i_447_);
								i_461_ = 8 + i_442_ - (i_459_ - i_448_);
							} else {
								i_460_ = 8 + i_441_ - (i_459_ - i_448_);
								i_461_ = i_442_ + (i_458_ - i_447_);
							}
							method5871(class282_sub35, i, i_460_, i_461_, 0, 0, i_453_ + i_458_, i_454_ + i_459_, 0, true, 1574885940);
						} else {
							i_460_ = i_441_ + Class112.method1871(i_458_ & 0x7, i_459_ & 0x7, i_446_, 1449989045);
							i_461_ = i_442_ + Class2.method259(i_458_ & 0x7, i_459_ & 0x7, i_446_, -1303121716);
							method5871(class282_sub35, i, i_460_, i_461_, i_455_, i_456_, i_453_ + i_458_, i_454_ + i_459_, i_446_, false, -265555476);
						}
						if (i_458_ == 63 || 63 == i_459_) {
							int i_462_ = 1;
							if (63 == i_458_ && i_459_ == 63)
								i_462_ = 3;
							for (int i_463_ = 0; i_463_ < i_462_; i_463_++) {
								int i_464_ = i_458_;
								int i_465_ = i_459_;
								if (0 == i_463_) {
									i_464_ = i_458_ == 63 ? 64 : i_458_;
									i_465_ = 63 == i_459_ ? 64 : i_459_;
								} else if (1 == i_463_)
									i_464_ = 64;
								else if (2 == i_463_)
									i_465_ = 64;
								int i_466_;
								int i_467_;
								if (0 == i_446_) {
									i_466_ = i_441_ + (i_464_ - i_447_);
									i_467_ = i_465_ - i_448_ + i_442_;
								} else if (1 == i_446_) {
									i_466_ = i_441_ + (i_465_ - i_448_);
									i_467_ = 8 + i_442_ - (i_464_ - i_447_);
								} else if (2 == i_446_) {
									i_466_ = i_441_ + 8 - (i_464_ - i_447_);
									i_467_ = i_442_ + 8 - (i_465_ - i_448_);
								} else {
									i_466_ = 8 + i_441_ - (i_465_ - i_448_);
									i_467_ = i_464_ - i_447_ + i_442_;
								}
								if (i_466_ >= 0 && i_466_ < -1230013231 * anInt3784 && i_467_ >= 0 && i_467_ < anInt3785 * 2024737111)
									anIntArrayArrayArray3818[i][i_466_][i_467_] = (anIntArrayArrayArray3818[i][i_460_ + i_455_][i_456_ + i_461_]);
							}
						}
					} else
						method5871(class282_sub35, 0, -1, -1, 0, 0, 0, 0, 0, false, -905865620);
				}
			}
		}
	}

	public final void method5857(int i, int i_468_, int i_469_, int i_470_, int i_471_) {
		for (int i_472_ = i_469_; i_472_ < i_471_ + i_469_; i_472_++) {
			for (int i_473_ = i_468_; i_473_ < i_470_ + i_468_; i_473_++) {
				if (i_473_ >= 0 && i_473_ < anInt3784 * -1230013231 && i_472_ >= 0 && i_472_ < 2024737111 * anInt3785)
					anIntArrayArrayArray3818[i][i_473_][i_472_] = i > 0 ? (anIntArrayArrayArray3818[i - 1][i_473_][i_472_]) - 960 : 0;
			}
		}
		if (i_468_ > 0 && i_468_ < -1230013231 * anInt3784) {
			for (int i_474_ = i_469_ + 1; i_474_ < i_469_ + i_471_; i_474_++) {
				if (i_474_ >= 0 && i_474_ < 2024737111 * anInt3785)
					anIntArrayArrayArray3818[i][i_468_][i_474_] = anIntArrayArrayArray3818[i][i_468_ - 1][i_474_];
			}
		}
		if (i_469_ > 0 && i_469_ < 2024737111 * anInt3785) {
			for (int i_475_ = i_468_ + 1; i_475_ < i_470_ + i_468_; i_475_++) {
				if (i_475_ >= 0 && i_475_ < anInt3784 * -1230013231)
					anIntArrayArrayArray3818[i][i_475_][i_469_] = anIntArrayArrayArray3818[i][i_475_][i_469_ - 1];
			}
		}
		if (i_468_ >= 0 && i_469_ >= 0 && i_468_ < -1230013231 * anInt3784 && i_469_ < 2024737111 * anInt3785) {
			if (0 == i) {
				if (i_468_ > 0 && 0 != anIntArrayArrayArray3818[i][i_468_ - 1][i_469_])
					anIntArrayArrayArray3818[i][i_468_][i_469_] = anIntArrayArrayArray3818[i][i_468_ - 1][i_469_];
				else if (i_469_ > 0 && (anIntArrayArrayArray3818[i][i_468_][i_469_ - 1] != 0))
					anIntArrayArrayArray3818[i][i_468_][i_469_] = anIntArrayArrayArray3818[i][i_468_][i_469_ - 1];
				else if (i_468_ > 0 && i_469_ > 0 && (anIntArrayArrayArray3818[i][i_468_ - 1][i_469_ - 1]) != 0)
					anIntArrayArrayArray3818[i][i_468_][i_469_] = anIntArrayArrayArray3818[i][i_468_ - 1][i_469_ - 1];
			} else if (i_468_ > 0 && (anIntArrayArrayArray3818[i - 1][i_468_ - 1][i_469_] != anIntArrayArrayArray3818[i][i_468_ - 1][i_469_]))
				anIntArrayArrayArray3818[i][i_468_][i_469_] = anIntArrayArrayArray3818[i][i_468_ - 1][i_469_];
			else if (i_469_ > 0 && (anIntArrayArrayArray3818[i][i_468_][i_469_ - 1] != (anIntArrayArrayArray3818[i - 1][i_468_][i_469_ - 1])))
				anIntArrayArrayArray3818[i][i_468_][i_469_] = anIntArrayArrayArray3818[i][i_468_][i_469_ - 1];
			else if (i_468_ > 0 && i_469_ > 0 && (anIntArrayArrayArray3818[i][i_468_ - 1][i_469_ - 1] != (anIntArrayArrayArray3818[i - 1][i_468_ - 1][i_469_ - 1])))
				anIntArrayArrayArray3818[i][i_468_][i_469_] = anIntArrayArrayArray3818[i][i_468_ - 1][i_469_ - 1];
		}
	}

	public final void method5858(RsByteBuffer class282_sub35, int i, int i_476_, int i_477_, int i_478_, Class336[] class336s) {
		if (!aBool3786) {
			for (int i_479_ = 0; i_479_ < 4; i_479_++) {
				Class336 class336 = class336s[i_479_];
				for (int i_480_ = 0; i_480_ < 64; i_480_++) {
					for (int i_481_ = 0; i_481_ < 64; i_481_++) {
						int i_482_ = i + i_480_;
						int i_483_ = i_481_ + i_476_;
						if (i_482_ >= 0 && i_482_ < anInt3784 * -1230013231 && i_483_ >= 0 && i_483_ < anInt3785 * 2024737111)
							class336.method5974(i_482_, i_483_, 1933302120);
					}
				}
			}
		}
		int i_484_ = i_477_ + i;
		int i_485_ = i_478_ + i_476_;
		for (int i_486_ = 0; i_486_ < anInt3845 * 1599084401; i_486_++) {
			for (int i_487_ = 0; i_487_ < 64; i_487_++) {
				for (int i_488_ = 0; i_488_ < 64; i_488_++)
					method5871(class282_sub35, i_486_, i_487_ + i, i_488_ + i_476_, 0, 0, i_484_ + i_487_, i_488_ + i_485_, 0, false, -1661025267);
			}
		}
	}

	void method5859(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_489_, byte[][] is, byte[][] is_490_, byte[][] is_491_, boolean[] bools, short i_492_) {
		boolean[] bools_493_ = (class531 != null && class531.aBool7061 ? aBoolArrayArray3793[((Class329) this).anInt3844 * -595948995] : (aBoolArrayArray3816[-595948995 * ((Class329) this).anInt3844]));
		method5848(class505, class531, class481, i, i_489_, anInt3784 * -1230013231, anInt3785 * 2024737111, is_491_, is, is_490_, bools, -1828708428);
		((Class329) this).aBool3854 = null != class531 && (class531.anInt7054 * 1419498143 != -848345857 * class531.anInt7058);
		if (!((Class329) this).aBool3854) {
			for (int i_494_ = 0; i_494_ < 8; i_494_++) {
				if (((Class329) this).anIntArray3842[i_494_] >= 0 && (((Class329) this).anIntArray3839[i_494_] != ((Class329) this).anIntArray3838[i_494_])) {
					((Class329) this).aBool3854 = true;
					break;
				}
			}
		}
		if (!bools_493_[1 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_495_ = bools;
			int i_496_ = 1;
			bools_495_[i_496_] = (bools_495_[i_496_] | 0 == (((Class329) this).anIntArray3843[2] & ((Class329) this).anIntArray3843[4]));
		}
		if (!bools_493_[3 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_497_ = bools;
			int i_498_ = 3;
			bools_497_[i_498_] = (bools_497_[i_498_] | 0 == (((Class329) this).anIntArray3843[6] & ((Class329) this).anIntArray3843[0]));
		}
		if (!bools_493_[1070348131 * ((Class329) this).anInt3781 + 0 & 0x3]) {
			boolean[] bools_499_ = bools;
			int i_500_ = 0;
			bools_499_[i_500_] = (bools_499_[i_500_] | 0 == (((Class329) this).anIntArray3843[0] & ((Class329) this).anIntArray3843[2]));
		}
		if (!bools_493_[2 + 1070348131 * ((Class329) this).anInt3781 & 0x3]) {
			boolean[] bools_501_ = bools;
			int i_502_ = 2;
			bools_501_[i_502_] = (bools_501_[i_502_] | 0 == (((Class329) this).anIntArray3843[4] & ((Class329) this).anIntArray3843[6]));
		}
		if (!((Class329) this).aBool3810 && (((Class329) this).anInt3844 * -595948995 == 0 || -595948995 * ((Class329) this).anInt3844 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_503_ = bools;
				bools[3] = false;
				bools_503_[0] = false;
				((Class329) this).anInt3844 = (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_504_ = bools;
				bools[1] = false;
				bools_504_[0] = false;
				((Class329) this).anInt3844 = (0 == -595948995 * ((Class329) this).anInt3844 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 169674465;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_505_ = bools;
				bools[2] = false;
				bools_505_[1] = false;
				((Class329) this).anInt3844 = (1489820949 * (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14));
				((Class329) this).anInt3781 = 113116310;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_506_ = bools;
				bools[3] = false;
				bools_506_[2] = false;
				((Class329) this).anInt3844 = (1489820949 * (0 == ((Class329) this).anInt3844 * -595948995 ? 13 : 14));
				((Class329) this).anInt3781 = 56558155;
			}
		}
	}

	public void method5860() {
		aBool3773 = true;
	}

	final void method5861(RsByteBuffer class282_sub35, int i, int i_507_, int i_508_, int i_509_, int i_510_, int i_511_, int i_512_, int i_513_, boolean bool) {
		if (1 == i_513_)
			i_510_ = 1;
		else if (2 == i_513_) {
			i_509_ = 1;
			i_510_ = 1;
		} else if (i_513_ == 3)
			i_509_ = 1;
		if (i_507_ >= 0 && i_507_ < -1230013231 * anInt3784 && i_508_ >= 0 && i_508_ < 2024737111 * anInt3785) {
			if (!aBool3786 && !bool)
				aClass311_3787.aByteArrayArrayArray3638[i][i_507_][i_508_] = (byte) 0;
			for (;;) {
				int i_514_ = class282_sub35.readUnsignedByte();
				if (i_514_ == 0) {
					if (aBool3786)
						anIntArrayArrayArray3818[0][i_509_ + i_507_][i_510_ + i_508_] = 0;
					else if (i == 0)
						anIntArrayArrayArray3818[0][i_507_ + i_509_][i_510_ + i_508_] = (-Class92.method1560(i_511_ + 932731, i_512_ + 556238, 1825371249) * 8) << 2;
					else
						anIntArrayArrayArray3818[i][i_507_ + i_509_][i_510_ + i_508_] = (anIntArrayArrayArray3818[i - 1][i_509_ + i_507_][i_508_ + i_510_]) - 960;
					break;
				}
				if (i_514_ == 1) {
					int i_515_ = class282_sub35.readUnsignedByte();
					if (!aBool3786) {
						if (i_515_ == 1)
							i_515_ = 0;
						if (0 == i)
							anIntArrayArrayArray3818[0][i_507_ + i_509_][i_508_ + i_510_] = 8 * -i_515_ << 2;
						else
							anIntArrayArrayArray3818[i][i_507_ + i_509_][i_510_ + i_508_] = ((anIntArrayArrayArray3818[i - 1][i_507_ + i_509_][i_508_ + i_510_]) - (8 * i_515_ << 2));
					} else
						anIntArrayArrayArray3818[0][i_509_ + i_507_][i_508_ + i_510_] = 8 * i_515_ << 2;
					break;
				}
				if (i_514_ <= 49) {
					if (bool)
						class282_sub35.readUnsignedByte();
					else {
						((Class329) this).aByteArrayArrayArray3825[i][i_507_][i_508_] = class282_sub35.readByte((short) -10306);
						((Class329) this).aByteArrayArrayArray3790[i][i_507_][i_508_] = (byte) ((i_514_ - 2) / 4);
						((Class329) this).aByteArrayArrayArray3791[i][i_507_][i_508_] = (byte) (i_513_ + (i_514_ - 2) & 0x3);
					}
				} else if (i_514_ <= 81) {
					if (!aBool3786 && !bool)
						aClass311_3787.aByteArrayArrayArray3638[i][i_507_][i_508_] = (byte) (i_514_ - 49);
				} else if (!bool)
					((Class329) this).aByteArrayArrayArray3808[i][i_507_][i_508_] = (byte) (i_514_ - 81);
			}
		} else {
			for (;;) {
				int i_516_ = class282_sub35.readUnsignedByte();
				if (0 == i_516_)
					break;
				if (i_516_ == 1) {
					class282_sub35.readUnsignedByte();
					break;
				}
				if (i_516_ <= 49)
					class282_sub35.readUnsignedByte();
			}
		}
	}

	final void method5862(RsByteBuffer class282_sub35, int i, int i_517_, int i_518_, int i_519_, int i_520_, int i_521_, int i_522_, int i_523_, boolean bool) {
		if (1 == i_523_)
			i_520_ = 1;
		else if (2 == i_523_) {
			i_519_ = 1;
			i_520_ = 1;
		} else if (i_523_ == 3)
			i_519_ = 1;
		if (i_517_ >= 0 && i_517_ < -1230013231 * anInt3784 && i_518_ >= 0 && i_518_ < 2024737111 * anInt3785) {
			if (!aBool3786 && !bool)
				aClass311_3787.aByteArrayArrayArray3638[i][i_517_][i_518_] = (byte) 0;
			for (;;) {
				int i_524_ = class282_sub35.readUnsignedByte();
				if (i_524_ == 0) {
					if (aBool3786)
						anIntArrayArrayArray3818[0][i_519_ + i_517_][i_520_ + i_518_] = 0;
					else if (i == 0)
						anIntArrayArrayArray3818[0][i_517_ + i_519_][i_520_ + i_518_] = (-Class92.method1560(i_521_ + 932731, i_522_ + 556238, 1600473191) * 8) << 2;
					else
						anIntArrayArrayArray3818[i][i_517_ + i_519_][i_520_ + i_518_] = (anIntArrayArrayArray3818[i - 1][i_519_ + i_517_][i_518_ + i_520_]) - 960;
					break;
				}
				if (i_524_ == 1) {
					int i_525_ = class282_sub35.readUnsignedByte();
					if (!aBool3786) {
						if (i_525_ == 1)
							i_525_ = 0;
						if (0 == i)
							anIntArrayArrayArray3818[0][i_517_ + i_519_][i_518_ + i_520_] = 8 * -i_525_ << 2;
						else
							anIntArrayArrayArray3818[i][i_517_ + i_519_][i_520_ + i_518_] = ((anIntArrayArrayArray3818[i - 1][i_517_ + i_519_][i_518_ + i_520_]) - (8 * i_525_ << 2));
					} else
						anIntArrayArrayArray3818[0][i_519_ + i_517_][i_518_ + i_520_] = 8 * i_525_ << 2;
					break;
				}
				if (i_524_ <= 49) {
					if (bool)
						class282_sub35.readUnsignedByte();
					else {
						((Class329) this).aByteArrayArrayArray3825[i][i_517_][i_518_] = class282_sub35.readByte((short) -3191);
						((Class329) this).aByteArrayArrayArray3790[i][i_517_][i_518_] = (byte) ((i_524_ - 2) / 4);
						((Class329) this).aByteArrayArrayArray3791[i][i_517_][i_518_] = (byte) (i_523_ + (i_524_ - 2) & 0x3);
					}
				} else if (i_524_ <= 81) {
					if (!aBool3786 && !bool)
						aClass311_3787.aByteArrayArrayArray3638[i][i_517_][i_518_] = (byte) (i_524_ - 49);
				} else if (!bool)
					((Class329) this).aByteArrayArrayArray3808[i][i_517_][i_518_] = (byte) (i_524_ - 81);
			}
		} else {
			for (;;) {
				int i_526_ = class282_sub35.readUnsignedByte();
				if (0 == i_526_)
					break;
				if (i_526_ == 1) {
					class282_sub35.readUnsignedByte();
					break;
				}
				if (i_526_ <= 49)
					class282_sub35.readUnsignedByte();
			}
		}
	}

	public final void method5863(int i, int[][] is) {
		int[][] is_527_ = anIntArrayArrayArray3818[i];
		for (int i_528_ = 0; i_528_ < anInt3784 * -1230013231 + 1; i_528_++) {
			for (int i_529_ = 0; i_529_ < 1 + 2024737111 * anInt3785; i_529_++)
				is_527_[i_528_][i_529_] += is[i_528_][i_529_];
		}
	}

	public void method5864(GraphicalRenderer class505, int[][][] is, Class336[] class336s) {
		if (!aBool3786) {
			for (int i = 0; i < 4; i++) {
				for (int i_530_ = 0; i_530_ < anInt3784 * -1230013231; i_530_++) {
					for (int i_531_ = 0; i_531_ < 2024737111 * anInt3785; i_531_++) {
						if (0 != ((aClass311_3787.aByteArrayArrayArray3638[i][i_530_][i_531_]) & 0x1)) {
							int i_532_ = i;
							if (0 != ((aClass311_3787.aByteArrayArrayArray3638[1][i_530_][i_531_]) & 0x2))
								i_532_--;
							if (i_532_ >= 0)
								class336s[i_532_].method5972(i_530_, i_531_, 16711935);
						}
					}
				}
			}
		}
		for (int i = 0; i < anInt3845 * 1599084401; i++) {
			int i_533_ = 0;
			int i_534_ = 0;
			if (!aBool3786) {
				if (aBool3835)
					i_534_ |= 0x8;
				if (aBool3780)
					i_533_ |= 0x2;
				if (anInt3809 * 207676255 != 0) {
					i_533_ |= 0x1;
					i_534_ |= 0x10;
				}
			}
			if (aBool3780)
				i_534_ |= 0x7;
			if (!aBool3782)
				i_534_ |= 0x20;
			int[][] is_535_ = (is != null && i < is.length ? is[i] : anIntArrayArrayArray3818[i]);
			aClass206_3776.method3385(i, class505.method8478(-1230013231 * anInt3784, anInt3785 * 2024737111, anIntArrayArrayArray3818[i], is_535_, 512, i_533_, i_534_), 322492568);
		}
	}

	public void method5865(GraphicalRenderer class505, int[][][] is, Class336[] class336s) {
		if (!aBool3786) {
			for (int i = 0; i < 4; i++) {
				for (int i_536_ = 0; i_536_ < anInt3784 * -1230013231; i_536_++) {
					for (int i_537_ = 0; i_537_ < 2024737111 * anInt3785; i_537_++) {
						if (0 != ((aClass311_3787.aByteArrayArrayArray3638[i][i_536_][i_537_]) & 0x1)) {
							int i_538_ = i;
							if (0 != ((aClass311_3787.aByteArrayArrayArray3638[1][i_536_][i_537_]) & 0x2))
								i_538_--;
							if (i_538_ >= 0)
								class336s[i_538_].method5972(i_536_, i_537_, 16711935);
						}
					}
				}
			}
		}
		for (int i = 0; i < anInt3845 * 1599084401; i++) {
			int i_539_ = 0;
			int i_540_ = 0;
			if (!aBool3786) {
				if (aBool3835)
					i_540_ |= 0x8;
				if (aBool3780)
					i_539_ |= 0x2;
				if (anInt3809 * 207676255 != 0) {
					i_539_ |= 0x1;
					i_540_ |= 0x10;
				}
			}
			if (aBool3780)
				i_540_ |= 0x7;
			if (!aBool3782)
				i_540_ |= 0x20;
			int[][] is_541_ = (is != null && i < is.length ? is[i] : anIntArrayArrayArray3818[i]);
			aClass206_3776.method3385(i, class505.method8478(-1230013231 * anInt3784, anInt3785 * 2024737111, anIntArrayArrayArray3818[i], is_541_, 512, i_539_, i_540_), 322492568);
		}
	}

	static final int method5866(int i, int i_542_, int i_543_) {
		if (i_542_ == i)
			return i;
		int i_544_ = 128 - i_543_;
		int i_545_ = i_543_ * (i_542_ & 0x7f) + (i & 0x7f) * i_544_ >> 7;
		int i_546_ = (i & 0x380) * i_544_ + (i_542_ & 0x380) * i_543_ >> 7;
		int i_547_ = i_544_ * (i & 0xfc00) + i_543_ * (i_542_ & 0xfc00) >> 7;
		return i_547_ & 0xfc00 | i_546_ & 0x380 | i_545_ & 0x7f;
	}

	void method5867(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_548_, Class390 class390_549_) {
		for (int i_550_ = 0; i_550_ < -1230013231 * anInt3784; i_550_++) {
			for (int i_551_ = 0; i_551_ < 2024737111 * anInt3785; i_551_++) {
				byte i_552_ = (((Class329) this).aByteArrayArrayArray3790[i][i_550_][i_551_]);
				byte i_553_ = (((Class329) this).aByteArrayArrayArray3791[i][i_550_][i_551_]);
				int i_554_ = ((((Class329) this).aByteArrayArrayArray3825[i][i_550_][i_551_]) & 0xff);
				int i_555_ = ((((Class329) this).aByteArrayArrayArray3808[i][i_550_][i_551_]) & 0xff);
				Class531 class531 = (0 != i_554_ ? ((Class329) this).aClass536_3834.method11475(i_554_ - 1, (byte) 0) : null);
				Class481 class481 = (i_555_ != 0 ? ((Class329) this).aClass479_3789.method8025(i_555_ - 1, (byte) -43) : null);
				if (0 == i_552_ && class531 == null)
					i_552_ = (byte) 12;
				Class531 class531_556_ = class531;
				if (null != class531 && -1 == 1419498143 * class531.anInt7054 && -1 == -848345857 * class531.anInt7058) {
					class531_556_ = class531;
					class531 = null;
				}
				if (class531 != null || class481 != null) {
					((Class329) this).anInt3855 = anIntArray3829[i_552_] * -32442583;
					((Class329) this).anInt3856 = anIntArray3814[i_552_] * 1732574483;
					int i_557_ = ((null != class481 ? ((Class329) this).anInt3855 * -1657432807 : 0) + (class531 != null ? ((Class329) this).anInt3856 * -1916381925 : 0));
					int i_558_ = 0;
					((Class329) this).anInt3781 = 0;
					((Class329) this).anInt3848 = (null != class531 ? 1717409107 * class531.anInt7066 : -1) * -1668530227;
					int i_559_ = (class481 != null ? class481.anInt5719 * -1346987295 : -1);
					int[] is_560_ = new int[i_557_];
					int[] is_561_ = new int[i_557_];
					int[] is_562_ = new int[i_557_];
					int[] is_563_ = new int[i_557_];
					int[] is_564_ = new int[i_557_];
					int[] is_565_ = new int[i_557_];
					int[] is_566_ = ((class531 != null && -1 != class531.anInt7058 * -848345857) ? new int[i_557_] : null);
					if (class531 != null) {
						for (int i_567_ = 0; (i_567_ < -1916381925 * ((Class329) this).anInt3856); i_567_++) {
							is_560_[i_558_] = (anIntArrayArray3824[i_552_][((Class329) this).anInt3781 * 1070348131]);
							is_561_[i_558_] = (anIntArrayArray3860[i_552_][((Class329) this).anInt3781 * 1070348131]);
							is_562_[i_558_] = (anIntArrayArray3815[i_552_][1070348131 * ((Class329) this).anInt3781]);
							is_564_[i_558_] = 1725089029 * ((Class329) this).anInt3848;
							is_565_[i_558_] = -1065364389 * class531.anInt7057;
							is_563_[i_558_] = class531.anInt7054 * 1419498143;
							if (is_566_ != null)
								is_566_[i_558_] = class531.anInt7058 * -848345857;
							i_558_++;
							((Class329) this).anInt3781 += 56558155;
						}
						if (!aBool3786 && i == 0)
							aClass206_3776.method3392(i_550_, i_551_, class531.anInt7051 * 220189999, class531.anInt7063 * 442664952, class531.anInt7064 * -1036917025, 669977931 * class531.anInt7065, class531.anInt7055 * -1307230745, -335219819 * class531.anInt7067, (short) -27967);
					} else
						((Class329) this).anInt3781 += ((Class329) this).anInt3856 * -70638359;
					if (class481 != null) {
						for (int i_568_ = 0; (i_568_ < -1657432807 * ((Class329) this).anInt3855); i_568_++) {
							is_560_[i_558_] = (anIntArrayArray3824[i_552_][((Class329) this).anInt3781 * 1070348131]);
							is_561_[i_558_] = (anIntArrayArray3860[i_552_][1070348131 * ((Class329) this).anInt3781]);
							is_562_[i_558_] = (anIntArrayArray3815[i_552_][((Class329) this).anInt3781 * 1070348131]);
							is_564_[i_558_] = i_559_;
							is_565_[i_558_] = -1001005969 * class481.anInt5720;
							is_563_[i_558_] = is[i_550_][i_551_];
							if (is_566_ != null)
								is_566_[i_558_] = is_563_[i_558_];
							i_558_++;
							((Class329) this).anInt3781 += 56558155;
						}
					}
					int i_569_ = anIntArray3811.length;
					int[] is_570_ = new int[i_569_];
					int[] is_571_ = new int[i_569_];
					int[] is_572_ = class390_549_ != null ? new int[i_569_] : null;
					int[] is_573_ = (null != class390_549_ || class390_548_ != null ? new int[i_569_] : null);
					for (int i_574_ = 0; i_574_ < i_569_; i_574_++) {
						int i_575_ = anIntArray3811[i_574_];
						int i_576_ = anIntArray3800[i_574_];
						if (0 == i_553_) {
							is_570_[i_574_] = i_575_;
							is_571_[i_574_] = i_576_;
						} else if (1 == i_553_) {
							int i_577_ = i_575_;
							is_570_[i_574_] = i_576_;
							is_571_[i_574_] = 512 - i_577_;
						} else if (2 == i_553_) {
							is_570_[i_574_] = 512 - i_575_;
							is_571_[i_574_] = 512 - i_576_;
						} else if (3 == i_553_) {
							int i_578_ = i_575_;
							is_570_[i_574_] = 512 - i_576_;
							is_571_[i_574_] = i_578_;
						}
						if (null != is_572_ && aBoolArrayArray3822[i_552_][i_574_]) {
							int i_579_ = (i_550_ << 9) + is_570_[i_574_];
							int i_580_ = (i_551_ << 9) + is_571_[i_574_];
							is_572_[i_574_] = (class390_549_.method6709(i_579_, i_580_, -211369287) - class390.method6709(i_579_, i_580_, 499504390));
						}
						if (null != is_573_) {
							if (null != class390_549_ && !aBoolArrayArray3822[i_552_][i_574_]) {
								int i_581_ = is_570_[i_574_] + (i_550_ << 9);
								int i_582_ = is_571_[i_574_] + (i_551_ << 9);
								is_573_[i_574_] = (class390.method6709(i_581_, i_582_, -499020385) - class390_549_.method6709(i_581_, i_582_, 159327616));
							} else if (class390_548_ != null && !(aBoolArrayArray3823[i_552_][i_574_])) {
								int i_583_ = is_570_[i_574_] + (i_550_ << 9);
								int i_584_ = (i_551_ << 9) + is_571_[i_574_];
								is_573_[i_574_] = (class390_548_.method6709(i_583_, i_584_, 1405593005) - class390.method6709(i_583_, i_584_, -2087545843));
							}
						}
					}
					int i_585_ = class390.method6722(i_550_, i_551_, 65280);
					int i_586_ = class390.method6722(1 + i_550_, i_551_, 65280);
					int i_587_ = class390.method6722(i_550_ + 1, i_551_ + 1, 65280);
					int i_588_ = class390.method6722(i_550_, 1 + i_551_, 65280);
					boolean bool = aClass311_3787.method5497(i_550_, i_551_, 2108303017);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_589_ = true;
						if (null != class481 && !class481.aBool5722)
							bool_589_ = false;
						else if (i_555_ == 0 && 0 != i_552_)
							bool_589_ = false;
						else if (i_554_ > 0 && class531_556_ != null && !class531_556_.aBool7056)
							bool_589_ = false;
						if (bool_589_ && i_585_ == i_586_ && i_585_ == i_587_ && i_585_ == i_588_)
							aByteArrayArrayArray3794[i][i_550_][i_551_] |= 0x4;
					}
					Class90 class90 = new Class90();
					if (aBool3786) {
						class90.anInt946 = (aClass206_3776.method3387(i_550_, i_551_, (byte) 110) * -1856397433);
						class90.anInt945 = (aClass206_3776.method3386(i_550_, i_551_, 1713188734) * 873459953);
						class90.anInt947 = (aClass206_3776.method3538(i_550_, i_551_, -575094789) * -96197041);
						class90.anInt949 = (aClass206_3776.method3432(i_550_, i_551_, (byte) 1) * -1472617411);
						class90.anInt950 = (aClass206_3776.method3464(i_550_, i_551_, -1857497087) * 1801644261);
						class90.anInt951 = (aClass206_3776.method3391(i_550_, i_551_, 1880971927) * 1412616155);
					}
					class390.method6708(i_550_, i_551_, is_570_, is_572_, is_571_, is_573_, is_560_, is_561_, is_562_, is_563_, is_566_, is_564_, is_565_, class90, false);
					aClass206_3776.method3384(i, i_550_, i_551_, (byte) -84);
				}
			}
		}
	}

	void method5868(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_590_, Class390 class390_591_) {
		byte[][] is_592_ = ((Class329) this).aByteArrayArrayArray3790[i];
		byte[][] is_593_ = ((Class329) this).aByteArrayArrayArray3791[i];
		byte[][] is_594_ = ((Class329) this).aByteArrayArrayArray3808[i];
		byte[][] is_595_ = ((Class329) this).aByteArrayArrayArray3825[i];
		boolean[] bools = new boolean[4];
		for (int i_596_ = 0; i_596_ < anInt3784 * -1230013231; i_596_++) {
			int i_597_ = i_596_ < anInt3784 * -1230013231 - 1 ? 1 + i_596_ : i_596_;
			for (int i_598_ = 0; i_598_ < 2024737111 * anInt3785; i_598_++) {
				int i_599_ = (i_598_ < anInt3785 * 2024737111 - 1 ? 1 + i_598_ : i_598_);
				((Class329) this).anInt3844 = is_592_[i_596_][i_598_] * 1489820949;
				((Class329) this).anInt3781 = is_593_[i_596_][i_598_] * 56558155;
				int i_600_ = is_595_[i_596_][i_598_] & 0xff;
				int i_601_ = is_594_[i_596_][i_598_] & 0xff;
				if (i_600_ != 0 || i_601_ != 0) {
					Class531 class531 = (i_600_ != 0 ? ((Class329) this).aClass536_3834.method11475(i_600_ - 1, (byte) 0) : null);
					Class481 class481 = (0 != i_601_ ? ((Class329) this).aClass479_3789.method8025(i_601_ - 1, (byte) -13) : null);
					if (0 == -595948995 * ((Class329) this).anInt3844 && null == class531)
						((Class329) this).anInt3844 = 697982204;
					((Class329) this).aBool3851 = false;
					((Class329) this).aBool3810 = false;
					boolean[] bools_602_ = bools;
					boolean[] bools_603_ = bools;
					boolean[] bools_604_ = bools;
					bools[3] = false;
					bools_604_[2] = false;
					bools_603_[1] = false;
					bools_602_[0] = false;
					Class531 class531_605_ = class531;
					if (null != class531) {
						if (-1 == class531.anInt7054 * 1419498143 && -1 == class531.anInt7058 * -848345857) {
							class531_605_ = class531;
							class531 = null;
						} else if (null != class481 && (-595948995 * ((Class329) this).anInt3844 != 0))
							((Class329) this).aBool3810 = class531.aBool7061;
					}
					((Class329) this).anInt3781 = (method5870(i_601_, i_596_, i_598_, i_597_, i_599_, class390, is_594_, -1020449763) * 56558155);
					for (int i_606_ = 0; i_606_ < 13; i_606_++) {
						((Class329) this).anIntArray3842[i_606_] = -1;
						((Class329) this).anIntArray3843[i_606_] = 1;
					}
					method5859(class505, class531, class481, i_596_, i_598_, is_592_, is_593_, is_595_, bools, (short) -10160);
					((Class329) this).aBool3853 = (!((Class329) this).aBool3810 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method5849(class531, class481, -1603680946);
					int i_607_ = (-1657432807 * ((Class329) this).anInt3855 + -1916381925 * ((Class329) this).anInt3856);
					if (i_607_ <= 0)
						aClass206_3776.method3384(i, i_596_, i_598_, (byte) -94);
					else {
						if (bools[0])
							i_607_++;
						if (bools[2])
							i_607_++;
						if (bools[1])
							i_607_++;
						if (bools[3])
							i_607_++;
						((Class329) this).anInt3846 = 0;
						((Class329) this).anInt3852 = 0;
						int i_608_ = 3 * i_607_;
						int[] is_609_ = (((Class329) this).aBool3854 ? new int[i_608_] : null);
						int[] is_610_ = new int[i_608_];
						int[] is_611_ = new int[i_608_];
						int[] is_612_ = new int[i_608_];
						int[] is_613_ = new int[i_608_];
						int[] is_614_ = new int[i_608_];
						int[] is_615_ = null != class390_591_ ? new int[i_608_] : null;
						int[] is_616_ = (null != class390_591_ || class390_590_ != null ? new int[i_608_] : null);
						method5850(class505, i, i_596_, i_598_, class531, bools, is_609_, is_610_, is_611_, is_612_, is_613_, is_614_, is_615_, is_616_, class390, class390_591_, class390_590_, 71641635);
						int i_617_ = is_594_[i_596_][i_599_] & 0xff;
						int i_618_ = is_594_[i_597_][i_599_] & 0xff;
						int i_619_ = is_594_[i_597_][i_598_] & 0xff;
						method5851(class505, i, i_596_, i_598_, i_597_, i_599_, class481, i_601_, i_617_, i_618_, i_619_, bools, is_609_, is_610_, is_611_, is_612_, is_613_, is_614_, is_615_, is_616_, is, class390, class390_591_, class390_590_, (byte) 2);
						method5852(class390, class481, class531_605_, i, i_596_, i_598_, i_597_, i_599_, i_601_, i_600_, (short) 618);
						Class90 class90 = new Class90();
						if (aBool3786) {
							class90.anInt946 = (aClass206_3776.method3387(i_596_, i_598_, (byte) 103) * -1856397433);
							class90.anInt945 = (aClass206_3776.method3386(i_596_, i_598_, 1491850466) * 873459953);
							class90.anInt947 = (aClass206_3776.method3538(i_596_, i_598_, -575094789) * -96197041);
							class90.anInt949 = (aClass206_3776.method3432(i_596_, i_598_, (byte) 1) * -1472617411);
							class90.anInt950 = (aClass206_3776.method3464(i_596_, i_598_, 301812201) * 1801644261);
							class90.anInt951 = (aClass206_3776.method3391(i_596_, i_598_, 1978640032) * 1412616155);
						}
						class390.method6707(i_596_, i_598_, is_610_, is_615_, is_611_, is_616_, is_612_, is_609_, is_613_, is_614_, class90, ((Class329) this).aBool3851);
						aClass206_3776.method3384(i, i_596_, i_598_, (byte) 97);
					}
				}
			}
		}
	}

	void method5869(GraphicalRenderer class505, int i, int i_620_, int i_621_, int i_622_, int i_623_, Class481 class481, int i_624_, int i_625_, int i_626_, int i_627_, boolean[] bools, int[] is, int[] is_628_, int[] is_629_, int[] is_630_, int[] is_631_, int[] is_632_, int[] is_633_, int[] is_634_, int[][] is_635_, Class390 class390, Class390 class390_636_, Class390 class390_637_) {
		if (null != class481) {
			if (i_625_ == 0)
				i_625_ = i_624_;
			if (0 == i_626_)
				i_626_ = i_624_;
			if (0 == i_627_)
				i_627_ = i_624_;
			Class481 class481_638_ = ((Class329) this).aClass479_3789.method8025(i_624_ - 1, (byte) -38);
			Class481 class481_639_ = ((Class329) this).aClass479_3789.method8025(i_625_ - 1, (byte) -39);
			Class481 class481_640_ = ((Class329) this).aClass479_3789.method8025(i_626_ - 1, (byte) -93);
			Class481 class481_641_ = ((Class329) this).aClass479_3789.method8025(i_627_ - 1, (byte) -80);
			for (int i_642_ = 0; i_642_ < -1657432807 * ((Class329) this).anInt3855; i_642_++) {
				boolean bool = false;
				int i_643_;
				if (bools[0 - 1070348131 * ((Class329) this).anInt3781 & 0x3] && (((Class329) this).anIntArray3832[0] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_643_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[2] == ((Class329) this).anInt3846 * -1256144113)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_643_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_643_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[3])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_643_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_643_ = 3;
				}
				for (int i_644_ = 0; i_644_ < i_643_; i_644_++) {
					int i_645_ = ((Class329) this).anIntArray3837[i_644_];
					int i_646_ = (i_645_ - 2140696262 * ((Class329) this).anInt3781 & 0x7);
					int i_647_ = anIntArray3811[i_645_];
					int i_648_ = anIntArray3800[i_645_];
					int i_649_;
					int i_650_;
					if (((Class329) this).anInt3781 * 1070348131 == 1) {
						i_649_ = i_648_;
						i_650_ = 512 - i_647_;
					} else if (1070348131 * ((Class329) this).anInt3781 == 2) {
						i_649_ = 512 - i_647_;
						i_650_ = 512 - i_648_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_649_ = 512 - i_648_;
						i_650_ = i_647_;
					} else {
						i_649_ = i_647_;
						i_650_ = i_648_;
					}
					is_628_[((Class329) this).anInt3852 * -1626041195] = i_649_;
					is_629_[((Class329) this).anInt3852 * -1626041195] = i_650_;
					if (null != is_633_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_645_])) {
						int i_651_ = (i_620_ << 9) + i_649_;
						int i_652_ = (i_621_ << 9) + i_650_;
						is_633_[((Class329) this).anInt3852 * -1626041195] = (class390_636_.method6709(i_651_, i_652_, 925279205) - class390.method6709(i_651_, i_652_, 486675843));
					}
					if (is_634_ != null) {
						if (null != class390_636_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_645_])) {
							int i_653_ = i_649_ + (i_620_ << 9);
							int i_654_ = (i_621_ << 9) + i_650_;
							is_634_[-1626041195 * ((Class329) this).anInt3852] = (class390.method6709(i_653_, i_654_, 1134707766) - class390_636_.method6709(i_653_, i_654_, -172779312));
						} else if (class390_637_ != null && !(aBoolArrayArray3823[(-595948995 * ((Class329) this).anInt3844)][i_645_])) {
							int i_655_ = (i_620_ << 9) + i_649_;
							int i_656_ = (i_621_ << 9) + i_650_;
							is_634_[((Class329) this).anInt3852 * -1626041195] = (class390_637_.method6709(i_655_, i_656_, -857741251) - class390.method6709(i_655_, i_656_, -212229168));
						}
					}
					if (i_645_ < 8 && ((Class329) this).anIntArray3842[i_646_] >= 0) {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3839[i_646_];
						is_632_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3827[i_646_];
						is_631_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3813[i_646_];
						is_630_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3838[i_646_];
					} else {
						if (((Class329) this).aBool3810 && (aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_645_])) {
							is_631_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anInt3848 * 1725089029;
							is_632_[((Class329) this).anInt3852 * -1626041195] = -1073742499 * ((Class329) this).anInt3849;
							is_630_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
						} else if (0 == i_649_ && 0 == i_650_) {
							is_630_[-1626041195 * ((Class329) this).anInt3852] = is_635_[i_620_][i_621_];
							is_631_[-1626041195 * ((Class329) this).anInt3852] = -1346987295 * class481_638_.anInt5719;
							is_632_[((Class329) this).anInt3852 * -1626041195] = class481_638_.anInt5720 * -1001005969;
						} else if (0 == i_649_ && 512 == i_650_) {
							is_630_[((Class329) this).anInt3852 * -1626041195] = is_635_[i_620_][i_623_];
							is_631_[-1626041195 * ((Class329) this).anInt3852] = -1346987295 * class481_639_.anInt5719;
							is_632_[((Class329) this).anInt3852 * -1626041195] = class481_639_.anInt5720 * -1001005969;
						} else if (512 == i_649_ && 512 == i_650_) {
							is_630_[-1626041195 * ((Class329) this).anInt3852] = is_635_[i_622_][i_623_];
							is_631_[-1626041195 * ((Class329) this).anInt3852] = class481_640_.anInt5719 * -1346987295;
							is_632_[-1626041195 * ((Class329) this).anInt3852] = class481_640_.anInt5720 * -1001005969;
						} else if (i_649_ == 512 && 0 == i_650_) {
							is_630_[((Class329) this).anInt3852 * -1626041195] = is_635_[i_622_][i_621_];
							is_631_[((Class329) this).anInt3852 * -1626041195] = -1346987295 * class481_641_.anInt5719;
							is_632_[((Class329) this).anInt3852 * -1626041195] = -1001005969 * class481_641_.anInt5720;
						} else {
							if (i_649_ < 256) {
								if (i_650_ < 256) {
									is_631_[(-1626041195 * ((Class329) this).anInt3852)] = (-1346987295 * class481_638_.anInt5719);
									is_632_[(-1626041195 * ((Class329) this).anInt3852)] = (-1001005969 * class481_638_.anInt5720);
								} else {
									is_631_[(((Class329) this).anInt3852 * -1626041195)] = (class481_639_.anInt5719 * -1346987295);
									is_632_[(((Class329) this).anInt3852 * -1626041195)] = (-1001005969 * class481_639_.anInt5720);
								}
							} else if (i_650_ < 256) {
								is_631_[(-1626041195 * ((Class329) this).anInt3852)] = -1346987295 * class481_641_.anInt5719;
								is_632_[(-1626041195 * ((Class329) this).anInt3852)] = class481_641_.anInt5720 * -1001005969;
							} else {
								is_631_[(-1626041195 * ((Class329) this).anInt3852)] = class481_640_.anInt5719 * -1346987295;
								is_632_[(((Class329) this).anInt3852 * -1626041195)] = -1001005969 * class481_640_.anInt5720;
							}
							int i_657_ = Class371.method6347(is_635_[i_620_][i_621_], is_635_[i_622_][i_621_], i_649_ << 7 >> 9, -2069890265);
							int i_658_ = Class371.method6347(is_635_[i_620_][i_623_], is_635_[i_622_][i_623_], i_649_ << 7 >> 9, -1815547275);
							is_630_[((Class329) this).anInt3852 * -1626041195] = Class371.method6347(i_657_, i_658_, i_650_ << 7 >> 9, -1926153046);
						}
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = is_630_[(-1626041195 * ((Class329) this).anInt3852)];
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (0 != -595948995 * ((Class329) this).anInt3844 && class481.aBool5721)
				((Class329) this).aBool3851 = true;
		}
	}

	int method5870(int i, int i_659_, int i_660_, int i_661_, int i_662_, Class390 class390, byte[][] is, int i_663_) {
		if ((-595948995 * ((Class329) this).anInt3844 == 0 || -595948995 * ((Class329) this).anInt3844 == 12) && i_659_ > 0 && i_660_ > 0 && i_659_ < -1230013231 * anInt3784 && i_660_ < anInt3785 * 2024737111) {
			int i_664_ = 0;
			int i_665_ = 0;
			int i_666_ = 0;
			int i_667_ = 0;
			i_664_ = i_664_ + (i == is[i_659_ - 1][i_660_ - 1] ? 1 : -1);
			i_665_ = i_665_ + (i == is[i_661_][i_660_ - 1] ? 1 : -1);
			i_666_ = i_666_ + (is[i_661_][i_662_] == i ? 1 : -1);
			i_667_ = i_667_ + (i == is[i_659_ - 1][i_662_] ? 1 : -1);
			if (is[i_659_][i_660_ - 1] == i) {
				i_664_++;
				i_665_++;
			} else {
				i_664_--;
				i_665_--;
			}
			if (i == is[i_661_][i_660_]) {
				i_665_++;
				i_666_++;
			} else {
				i_665_--;
				i_666_--;
			}
			if (i == is[i_659_][i_662_]) {
				i_666_++;
				i_667_++;
			} else {
				i_666_--;
				i_667_--;
			}
			if (i == is[i_659_ - 1][i_660_]) {
				i_667_++;
				i_664_++;
			} else {
				i_667_--;
				i_664_--;
			}
			int i_668_ = i_664_ - i_666_;
			if (i_668_ < 0)
				i_668_ = -i_668_;
			int i_669_ = i_665_ - i_667_;
			if (i_669_ < 0)
				i_669_ = -i_669_;
			if (i_668_ == i_669_) {
				i_668_ = (class390.method6722(i_659_, i_660_, 65280) - class390.method6722(i_661_, i_662_, 65280));
				if (i_668_ < 0)
					i_668_ = -i_668_;
				i_669_ = (class390.method6722(i_661_, i_660_, 65280) - class390.method6722(i_659_, i_662_, 65280));
				if (i_669_ < 0)
					i_669_ = -i_669_;
			}
			return i_668_ < i_669_ ? 1 : 0;
		}
		return ((Class329) this).anInt3781 * 1070348131;
	}

	final void method5871(RsByteBuffer class282_sub35, int i, int i_670_, int i_671_, int i_672_, int i_673_, int i_674_, int i_675_, int i_676_, boolean bool, int i_677_) {
		if (1 == i_676_)
			i_673_ = 1;
		else if (2 == i_676_) {
			i_672_ = 1;
			i_673_ = 1;
		} else if (i_676_ == 3)
			i_672_ = 1;
		if (i_670_ >= 0 && i_670_ < -1230013231 * anInt3784 && i_671_ >= 0 && i_671_ < 2024737111 * anInt3785) {
			if (!aBool3786 && !bool)
				aClass311_3787.aByteArrayArrayArray3638[i][i_670_][i_671_] = (byte) 0;
			for (;;) {
				int i_678_ = class282_sub35.readUnsignedByte();
				if (i_678_ == 0) {
					if (aBool3786)
						anIntArrayArrayArray3818[0][i_672_ + i_670_][i_673_ + i_671_] = 0;
					else if (i == 0)
						anIntArrayArrayArray3818[0][i_670_ + i_672_][i_673_ + i_671_] = (-Class92.method1560(i_674_ + 932731, i_675_ + 556238, 1995871883) * 8) << 2;
					else
						anIntArrayArrayArray3818[i][i_670_ + i_672_][i_673_ + i_671_] = (anIntArrayArrayArray3818[i - 1][i_672_ + i_670_][i_671_ + i_673_]) - 960;
					break;
				}
				if (i_678_ == 1) {
					int i_679_ = class282_sub35.readUnsignedByte();
					if (!aBool3786) {
						if (i_679_ == 1)
							i_679_ = 0;
						if (0 == i)
							anIntArrayArrayArray3818[0][i_670_ + i_672_][i_671_ + i_673_] = 8 * -i_679_ << 2;
						else
							anIntArrayArrayArray3818[i][i_670_ + i_672_][i_673_ + i_671_] = ((anIntArrayArrayArray3818[i - 1][i_670_ + i_672_][i_671_ + i_673_]) - (8 * i_679_ << 2));
					} else
						anIntArrayArrayArray3818[0][i_672_ + i_670_][i_671_ + i_673_] = 8 * i_679_ << 2;
					break;
				}
				if (i_678_ <= 49) {
					if (bool)
						class282_sub35.readUnsignedByte();
					else {
						((Class329) this).aByteArrayArrayArray3825[i][i_670_][i_671_] = class282_sub35.readByte((short) -18637);
						((Class329) this).aByteArrayArrayArray3790[i][i_670_][i_671_] = (byte) ((i_678_ - 2) / 4);
						((Class329) this).aByteArrayArrayArray3791[i][i_670_][i_671_] = (byte) (i_676_ + (i_678_ - 2) & 0x3);
					}
				} else if (i_678_ <= 81) {
					if (!aBool3786 && !bool)
						aClass311_3787.aByteArrayArrayArray3638[i][i_670_][i_671_] = (byte) (i_678_ - 49);
				} else if (!bool)
					((Class329) this).aByteArrayArrayArray3808[i][i_670_][i_671_] = (byte) (i_678_ - 81);
			}
		} else {
			for (;;) {
				int i_680_ = class282_sub35.readUnsignedByte();
				if (0 == i_680_)
					break;
				if (i_680_ == 1) {
					class282_sub35.readUnsignedByte();
					break;
				}
				if (i_680_ <= 49)
					class282_sub35.readUnsignedByte();
			}
		}
	}

	int method5872(int i, int i_681_, int i_682_, int i_683_, int i_684_, Class390 class390, byte[][] is) {
		if ((-595948995 * ((Class329) this).anInt3844 == 0 || -595948995 * ((Class329) this).anInt3844 == 12) && i_681_ > 0 && i_682_ > 0 && i_681_ < -1230013231 * anInt3784 && i_682_ < anInt3785 * 2024737111) {
			int i_685_ = 0;
			int i_686_ = 0;
			int i_687_ = 0;
			int i_688_ = 0;
			i_685_ = i_685_ + (i == is[i_681_ - 1][i_682_ - 1] ? 1 : -1);
			i_686_ = i_686_ + (i == is[i_683_][i_682_ - 1] ? 1 : -1);
			i_687_ = i_687_ + (is[i_683_][i_684_] == i ? 1 : -1);
			i_688_ = i_688_ + (i == is[i_681_ - 1][i_684_] ? 1 : -1);
			if (is[i_681_][i_682_ - 1] == i) {
				i_685_++;
				i_686_++;
			} else {
				i_685_--;
				i_686_--;
			}
			if (i == is[i_683_][i_682_]) {
				i_686_++;
				i_687_++;
			} else {
				i_686_--;
				i_687_--;
			}
			if (i == is[i_681_][i_684_]) {
				i_687_++;
				i_688_++;
			} else {
				i_687_--;
				i_688_--;
			}
			if (i == is[i_681_ - 1][i_682_]) {
				i_688_++;
				i_685_++;
			} else {
				i_688_--;
				i_685_--;
			}
			int i_689_ = i_685_ - i_687_;
			if (i_689_ < 0)
				i_689_ = -i_689_;
			int i_690_ = i_686_ - i_688_;
			if (i_690_ < 0)
				i_690_ = -i_690_;
			if (i_689_ == i_690_) {
				i_689_ = (class390.method6722(i_681_, i_682_, 65280) - class390.method6722(i_683_, i_684_, 65280));
				if (i_689_ < 0)
					i_689_ = -i_689_;
				i_690_ = (class390.method6722(i_683_, i_682_, 65280) - class390.method6722(i_681_, i_684_, 65280));
				if (i_690_ < 0)
					i_690_ = -i_690_;
			}
			return i_689_ < i_690_ ? 1 : 0;
		}
		return ((Class329) this).anInt3781 * 1070348131;
	}

	void method5873(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_691_, byte[][] is, byte[][] is_692_, byte[][] is_693_, boolean[] bools) {
		boolean[] bools_694_ = (class531 != null && class531.aBool7061 ? aBoolArrayArray3793[((Class329) this).anInt3844 * -595948995] : (aBoolArrayArray3816[-595948995 * ((Class329) this).anInt3844]));
		method5848(class505, class531, class481, i, i_691_, anInt3784 * -1230013231, anInt3785 * 2024737111, is_693_, is, is_692_, bools, -1476870410);
		((Class329) this).aBool3854 = null != class531 && (class531.anInt7054 * 1419498143 != -848345857 * class531.anInt7058);
		if (!((Class329) this).aBool3854) {
			for (int i_695_ = 0; i_695_ < 8; i_695_++) {
				if (((Class329) this).anIntArray3842[i_695_] >= 0 && (((Class329) this).anIntArray3839[i_695_] != ((Class329) this).anIntArray3838[i_695_])) {
					((Class329) this).aBool3854 = true;
					break;
				}
			}
		}
		if (!bools_694_[1 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_696_ = bools;
			int i_697_ = 1;
			bools_696_[i_697_] = (bools_696_[i_697_] | 0 == (((Class329) this).anIntArray3843[2] & ((Class329) this).anIntArray3843[4]));
		}
		if (!bools_694_[3 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_698_ = bools;
			int i_699_ = 3;
			bools_698_[i_699_] = (bools_698_[i_699_] | 0 == (((Class329) this).anIntArray3843[6] & ((Class329) this).anIntArray3843[0]));
		}
		if (!bools_694_[1070348131 * ((Class329) this).anInt3781 + 0 & 0x3]) {
			boolean[] bools_700_ = bools;
			int i_701_ = 0;
			bools_700_[i_701_] = (bools_700_[i_701_] | 0 == (((Class329) this).anIntArray3843[0] & ((Class329) this).anIntArray3843[2]));
		}
		if (!bools_694_[2 + 1070348131 * ((Class329) this).anInt3781 & 0x3]) {
			boolean[] bools_702_ = bools;
			int i_703_ = 2;
			bools_702_[i_703_] = (bools_702_[i_703_] | 0 == (((Class329) this).anIntArray3843[4] & ((Class329) this).anIntArray3843[6]));
		}
		if (!((Class329) this).aBool3810 && (((Class329) this).anInt3844 * -595948995 == 0 || -595948995 * ((Class329) this).anInt3844 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_704_ = bools;
				bools[3] = false;
				bools_704_[0] = false;
				((Class329) this).anInt3844 = (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_705_ = bools;
				bools[1] = false;
				bools_705_[0] = false;
				((Class329) this).anInt3844 = (0 == -595948995 * ((Class329) this).anInt3844 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 169674465;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_706_ = bools;
				bools[2] = false;
				bools_706_[1] = false;
				((Class329) this).anInt3844 = (1489820949 * (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14));
				((Class329) this).anInt3781 = 113116310;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_707_ = bools;
				bools[3] = false;
				bools_707_[2] = false;
				((Class329) this).anInt3844 = (1489820949 * (0 == ((Class329) this).anInt3844 * -595948995 ? 13 : 14));
				((Class329) this).anInt3781 = 56558155;
			}
		}
	}

	void method5874(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_708_, byte[][] is, byte[][] is_709_, byte[][] is_710_, boolean[] bools) {
		boolean[] bools_711_ = (class531 != null && class531.aBool7061 ? aBoolArrayArray3793[((Class329) this).anInt3844 * -595948995] : (aBoolArrayArray3816[-595948995 * ((Class329) this).anInt3844]));
		method5848(class505, class531, class481, i, i_708_, anInt3784 * -1230013231, anInt3785 * 2024737111, is_710_, is, is_709_, bools, -1670617987);
		((Class329) this).aBool3854 = null != class531 && (class531.anInt7054 * 1419498143 != -848345857 * class531.anInt7058);
		if (!((Class329) this).aBool3854) {
			for (int i_712_ = 0; i_712_ < 8; i_712_++) {
				if (((Class329) this).anIntArray3842[i_712_] >= 0 && (((Class329) this).anIntArray3839[i_712_] != ((Class329) this).anIntArray3838[i_712_])) {
					((Class329) this).aBool3854 = true;
					break;
				}
			}
		}
		if (!bools_711_[1 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_713_ = bools;
			int i_714_ = 1;
			bools_713_[i_714_] = (bools_713_[i_714_] | 0 == (((Class329) this).anIntArray3843[2] & ((Class329) this).anIntArray3843[4]));
		}
		if (!bools_711_[3 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_715_ = bools;
			int i_716_ = 3;
			bools_715_[i_716_] = (bools_715_[i_716_] | 0 == (((Class329) this).anIntArray3843[6] & ((Class329) this).anIntArray3843[0]));
		}
		if (!bools_711_[1070348131 * ((Class329) this).anInt3781 + 0 & 0x3]) {
			boolean[] bools_717_ = bools;
			int i_718_ = 0;
			bools_717_[i_718_] = (bools_717_[i_718_] | 0 == (((Class329) this).anIntArray3843[0] & ((Class329) this).anIntArray3843[2]));
		}
		if (!bools_711_[2 + 1070348131 * ((Class329) this).anInt3781 & 0x3]) {
			boolean[] bools_719_ = bools;
			int i_720_ = 2;
			bools_719_[i_720_] = (bools_719_[i_720_] | 0 == (((Class329) this).anIntArray3843[4] & ((Class329) this).anIntArray3843[6]));
		}
		if (!((Class329) this).aBool3810 && (((Class329) this).anInt3844 * -595948995 == 0 || -595948995 * ((Class329) this).anInt3844 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_721_ = bools;
				bools[3] = false;
				bools_721_[0] = false;
				((Class329) this).anInt3844 = (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_722_ = bools;
				bools[1] = false;
				bools_722_[0] = false;
				((Class329) this).anInt3844 = (0 == -595948995 * ((Class329) this).anInt3844 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 169674465;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_723_ = bools;
				bools[2] = false;
				bools_723_[1] = false;
				((Class329) this).anInt3844 = (1489820949 * (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14));
				((Class329) this).anInt3781 = 113116310;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_724_ = bools;
				bools[3] = false;
				bools_724_[2] = false;
				((Class329) this).anInt3844 = (1489820949 * (0 == ((Class329) this).anInt3844 * -595948995 ? 13 : 14));
				((Class329) this).anInt3781 = 56558155;
			}
		}
	}

	void method5875(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_725_, byte[][] is, byte[][] is_726_, byte[][] is_727_, boolean[] bools) {
		boolean[] bools_728_ = (class531 != null && class531.aBool7061 ? aBoolArrayArray3793[((Class329) this).anInt3844 * -595948995] : (aBoolArrayArray3816[-595948995 * ((Class329) this).anInt3844]));
		method5848(class505, class531, class481, i, i_725_, anInt3784 * -1230013231, anInt3785 * 2024737111, is_727_, is, is_726_, bools, -1803929010);
		((Class329) this).aBool3854 = null != class531 && (class531.anInt7054 * 1419498143 != -848345857 * class531.anInt7058);
		if (!((Class329) this).aBool3854) {
			for (int i_729_ = 0; i_729_ < 8; i_729_++) {
				if (((Class329) this).anIntArray3842[i_729_] >= 0 && (((Class329) this).anIntArray3839[i_729_] != ((Class329) this).anIntArray3838[i_729_])) {
					((Class329) this).aBool3854 = true;
					break;
				}
			}
		}
		if (!bools_728_[1 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_730_ = bools;
			int i_731_ = 1;
			bools_730_[i_731_] = (bools_730_[i_731_] | 0 == (((Class329) this).anIntArray3843[2] & ((Class329) this).anIntArray3843[4]));
		}
		if (!bools_728_[3 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_732_ = bools;
			int i_733_ = 3;
			bools_732_[i_733_] = (bools_732_[i_733_] | 0 == (((Class329) this).anIntArray3843[6] & ((Class329) this).anIntArray3843[0]));
		}
		if (!bools_728_[1070348131 * ((Class329) this).anInt3781 + 0 & 0x3]) {
			boolean[] bools_734_ = bools;
			int i_735_ = 0;
			bools_734_[i_735_] = (bools_734_[i_735_] | 0 == (((Class329) this).anIntArray3843[0] & ((Class329) this).anIntArray3843[2]));
		}
		if (!bools_728_[2 + 1070348131 * ((Class329) this).anInt3781 & 0x3]) {
			boolean[] bools_736_ = bools;
			int i_737_ = 2;
			bools_736_[i_737_] = (bools_736_[i_737_] | 0 == (((Class329) this).anIntArray3843[4] & ((Class329) this).anIntArray3843[6]));
		}
		if (!((Class329) this).aBool3810 && (((Class329) this).anInt3844 * -595948995 == 0 || -595948995 * ((Class329) this).anInt3844 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_738_ = bools;
				bools[3] = false;
				bools_738_[0] = false;
				((Class329) this).anInt3844 = (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_739_ = bools;
				bools[1] = false;
				bools_739_[0] = false;
				((Class329) this).anInt3844 = (0 == -595948995 * ((Class329) this).anInt3844 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 169674465;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_740_ = bools;
				bools[2] = false;
				bools_740_[1] = false;
				((Class329) this).anInt3844 = (1489820949 * (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14));
				((Class329) this).anInt3781 = 113116310;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_741_ = bools;
				bools[3] = false;
				bools_741_[2] = false;
				((Class329) this).anInt3844 = (1489820949 * (0 == ((Class329) this).anInt3844 * -595948995 ? 13 : 14));
				((Class329) this).anInt3781 = 56558155;
			}
		}
	}

	void method5876(Class531 class531, Class481 class481) {
		if (((Class329) this).aBool3853) {
			((Class329) this).anIntArray3857 = (anIntArrayArray3824[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3860[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3815[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anInt3856 = 1732574483 * (null != class531 ? (anIntArray3814[-595948995 * ((Class329) this).anInt3844]) : 0);
			((Class329) this).anInt3855 = -32442583 * (null != class481 ? (anIntArray3829[((Class329) this).anInt3844 * -595948995]) : 0);
		} else if (((Class329) this).aBool3810) {
			((Class329) this).anIntArray3857 = (anIntArrayArray3775[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3821[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3836[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anInt3856 = 1732574483 * (null != class531 ? (anIntArray3778[((Class329) this).anInt3844 * -595948995]) : 0);
			((Class329) this).anInt3855 = (class481 != null ? anIntArray3819[-595948995 * ((Class329) this).anInt3844] : 0) * -32442583;
			((Class329) this).anIntArray3832 = (anIntArrayArray3833[-595948995 * ((Class329) this).anInt3844]);
		} else {
			((Class329) this).anIntArray3857 = (anIntArrayArray3774[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3830[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3831[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anInt3856 = (class531 != null ? anIntArray3826[((Class329) this).anInt3844 * -595948995] : 0) * 1732574483;
			((Class329) this).anInt3855 = (class481 != null ? anIntArray3847[-595948995 * ((Class329) this).anInt3844] : 0) * -32442583;
			((Class329) this).anIntArray3832 = (anIntArrayArray3828[((Class329) this).anInt3844 * -595948995]);
		}
	}

	void method5877(GraphicalRenderer class505, int i, int i_742_, int i_743_, Class531 class531, boolean[] bools, int[] is, int[] is_744_, int[] is_745_, int[] is_746_, int[] is_747_, int[] is_748_, int[] is_749_, int[] is_750_, Class390 class390, Class390 class390_751_, Class390 class390_752_) {
		((Class329) this).anInt3850 = 1866422575;
		((Class329) this).anInt3848 = 1668530227;
		((Class329) this).anInt3849 = -566299392;
		if (class531 != null) {
			((Class329) this).anInt3850 = class531.anInt7054 * -2062938673;
			((Class329) this).anInt3848 = class531.anInt7066 * 1041498231;
			((Class329) this).anInt3849 = -1129429737 * class531.anInt7057;
			int i_753_ = Class153.method2617(class505, class531, (byte) -12);
			for (int i_754_ = 0; i_754_ < -1916381925 * ((Class329) this).anInt3856; i_754_++) {
				boolean bool = false;
				int i_755_;
				if (bools[0 - ((Class329) this).anInt3781 * 1070348131 & 0x3] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[0])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_755_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[2])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_755_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_755_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[3] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_755_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_755_ = 3;
				}
				for (int i_756_ = 0; i_756_ < i_755_; i_756_++) {
					int i_757_ = ((Class329) this).anIntArray3837[i_756_];
					int i_758_ = (i_757_ - ((Class329) this).anInt3781 * 2140696262 & 0x7);
					int i_759_ = anIntArray3811[i_757_];
					int i_760_ = anIntArray3800[i_757_];
					int i_761_;
					int i_762_;
					if (1 == 1070348131 * ((Class329) this).anInt3781) {
						i_761_ = i_760_;
						i_762_ = 512 - i_759_;
					} else if (2 == 1070348131 * ((Class329) this).anInt3781) {
						i_761_ = 512 - i_759_;
						i_762_ = 512 - i_760_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_761_ = 512 - i_760_;
						i_762_ = i_759_;
					} else {
						i_761_ = i_759_;
						i_762_ = i_760_;
					}
					is_744_[((Class329) this).anInt3852 * -1626041195] = i_761_;
					is_745_[-1626041195 * ((Class329) this).anInt3852] = i_762_;
					if (null != is_749_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_757_])) {
						int i_763_ = (i_742_ << 9) + i_761_;
						int i_764_ = (i_743_ << 9) + i_762_;
						is_749_[-1626041195 * ((Class329) this).anInt3852] = (class390_751_.method6709(i_763_, i_764_, -917004163) - class390.method6709(i_763_, i_764_, 2130800450));
					}
					if (is_750_ != null) {
						if (null != class390_751_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_757_])) {
							int i_765_ = (i_742_ << 9) + i_761_;
							int i_766_ = (i_743_ << 9) + i_762_;
							is_750_[((Class329) this).anInt3852 * -1626041195] = (class390.method6709(i_765_, i_766_, -417680676) - class390_751_.method6709(i_765_, i_766_, 369124472));
						} else if (class390_752_ != null && !(aBoolArrayArray3823[(((Class329) this).anInt3844 * -595948995)][i_757_])) {
							int i_767_ = i_761_ + (i_742_ << 9);
							int i_768_ = i_762_ + (i_743_ << 9);
							is_750_[-1626041195 * ((Class329) this).anInt3852] = (class390_752_.method6709(i_767_, i_768_, -773894373) - class390.method6709(i_767_, i_768_, 819039889));
						}
					}
					if (i_757_ < 8 && (((Class329) this).anIntArray3842[i_758_] > class531.anInt7052 * 1070524733)) {
						if (is != null)
							is[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3839[i_758_];
						is_748_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3827[i_758_];
						is_747_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3813[i_758_];
						is_746_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3838[i_758_];
					} else {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = i_753_;
						is_747_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7066 * 1717409107;
						is_748_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7057 * -1065364389;
						is_746_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (!aBool3786 && 0 == i)
				aClass206_3776.method3392(i_742_, i_743_, 220189999 * class531.anInt7051, 442664952 * class531.anInt7063, -1036917025 * class531.anInt7064, class531.anInt7065 * 669977931, -1307230745 * class531.anInt7055, class531.anInt7067 * -335219819, (short) -29917);
			if (-595948995 * ((Class329) this).anInt3844 != 12 && 1419498143 * class531.anInt7054 != -1 && class531.aBool7059)
				((Class329) this).aBool3851 = true;
		} else if (((Class329) this).aBool3853)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3814[-595948995 * ((Class329) this).anInt3844]);
		else if (((Class329) this).aBool3810)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3778[-595948995 * ((Class329) this).anInt3844]);
		else
			((Class329) this).anInt3846 += -193737745 * (anIntArray3826[-595948995 * ((Class329) this).anInt3844]);
	}

	void method5878(GraphicalRenderer class505, int i, int i_769_, int i_770_, Class531 class531, boolean[] bools, int[] is, int[] is_771_, int[] is_772_, int[] is_773_, int[] is_774_, int[] is_775_, int[] is_776_, int[] is_777_, Class390 class390, Class390 class390_778_, Class390 class390_779_) {
		((Class329) this).anInt3850 = 1866422575;
		((Class329) this).anInt3848 = 1668530227;
		((Class329) this).anInt3849 = -566299392;
		if (class531 != null) {
			((Class329) this).anInt3850 = class531.anInt7054 * -2062938673;
			((Class329) this).anInt3848 = class531.anInt7066 * 1041498231;
			((Class329) this).anInt3849 = -1129429737 * class531.anInt7057;
			int i_780_ = Class153.method2617(class505, class531, (byte) -53);
			for (int i_781_ = 0; i_781_ < -1916381925 * ((Class329) this).anInt3856; i_781_++) {
				boolean bool = false;
				int i_782_;
				if (bools[0 - ((Class329) this).anInt3781 * 1070348131 & 0x3] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[0])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_782_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[2])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_782_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_782_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[3] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_782_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_782_ = 3;
				}
				for (int i_783_ = 0; i_783_ < i_782_; i_783_++) {
					int i_784_ = ((Class329) this).anIntArray3837[i_783_];
					int i_785_ = (i_784_ - ((Class329) this).anInt3781 * 2140696262 & 0x7);
					int i_786_ = anIntArray3811[i_784_];
					int i_787_ = anIntArray3800[i_784_];
					int i_788_;
					int i_789_;
					if (1 == 1070348131 * ((Class329) this).anInt3781) {
						i_788_ = i_787_;
						i_789_ = 512 - i_786_;
					} else if (2 == 1070348131 * ((Class329) this).anInt3781) {
						i_788_ = 512 - i_786_;
						i_789_ = 512 - i_787_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_788_ = 512 - i_787_;
						i_789_ = i_786_;
					} else {
						i_788_ = i_786_;
						i_789_ = i_787_;
					}
					is_771_[((Class329) this).anInt3852 * -1626041195] = i_788_;
					is_772_[-1626041195 * ((Class329) this).anInt3852] = i_789_;
					if (null != is_776_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_784_])) {
						int i_790_ = (i_769_ << 9) + i_788_;
						int i_791_ = (i_770_ << 9) + i_789_;
						is_776_[-1626041195 * ((Class329) this).anInt3852] = (class390_778_.method6709(i_790_, i_791_, -249735070) - class390.method6709(i_790_, i_791_, -1048665652));
					}
					if (is_777_ != null) {
						if (null != class390_778_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_784_])) {
							int i_792_ = (i_769_ << 9) + i_788_;
							int i_793_ = (i_770_ << 9) + i_789_;
							is_777_[((Class329) this).anInt3852 * -1626041195] = (class390.method6709(i_792_, i_793_, 1644706557) - class390_778_.method6709(i_792_, i_793_, 154666135));
						} else if (class390_779_ != null && !(aBoolArrayArray3823[(((Class329) this).anInt3844 * -595948995)][i_784_])) {
							int i_794_ = i_788_ + (i_769_ << 9);
							int i_795_ = i_789_ + (i_770_ << 9);
							is_777_[-1626041195 * ((Class329) this).anInt3852] = (class390_779_.method6709(i_794_, i_795_, -1333249617) - class390.method6709(i_794_, i_795_, 1905960284));
						}
					}
					if (i_784_ < 8 && (((Class329) this).anIntArray3842[i_785_] > class531.anInt7052 * 1070524733)) {
						if (is != null)
							is[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3839[i_785_];
						is_775_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3827[i_785_];
						is_774_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3813[i_785_];
						is_773_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3838[i_785_];
					} else {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = i_780_;
						is_774_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7066 * 1717409107;
						is_775_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7057 * -1065364389;
						is_773_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (!aBool3786 && 0 == i)
				aClass206_3776.method3392(i_769_, i_770_, 220189999 * class531.anInt7051, 442664952 * class531.anInt7063, -1036917025 * class531.anInt7064, class531.anInt7065 * 669977931, -1307230745 * class531.anInt7055, class531.anInt7067 * -335219819, (short) -21122);
			if (-595948995 * ((Class329) this).anInt3844 != 12 && 1419498143 * class531.anInt7054 != -1 && class531.aBool7059)
				((Class329) this).aBool3851 = true;
		} else if (((Class329) this).aBool3853)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3814[-595948995 * ((Class329) this).anInt3844]);
		else if (((Class329) this).aBool3810)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3778[-595948995 * ((Class329) this).anInt3844]);
		else
			((Class329) this).anInt3846 += -193737745 * (anIntArray3826[-595948995 * ((Class329) this).anInt3844]);
	}

	void method5879(GraphicalRenderer class505, int i, int i_796_, int i_797_, Class531 class531, boolean[] bools, int[] is, int[] is_798_, int[] is_799_, int[] is_800_, int[] is_801_, int[] is_802_, int[] is_803_, int[] is_804_, Class390 class390, Class390 class390_805_, Class390 class390_806_) {
		((Class329) this).anInt3850 = 1866422575;
		((Class329) this).anInt3848 = 1668530227;
		((Class329) this).anInt3849 = -566299392;
		if (class531 != null) {
			((Class329) this).anInt3850 = class531.anInt7054 * -2062938673;
			((Class329) this).anInt3848 = class531.anInt7066 * 1041498231;
			((Class329) this).anInt3849 = -1129429737 * class531.anInt7057;
			int i_807_ = Class153.method2617(class505, class531, (byte) -24);
			for (int i_808_ = 0; i_808_ < -1916381925 * ((Class329) this).anInt3856; i_808_++) {
				boolean bool = false;
				int i_809_;
				if (bools[0 - ((Class329) this).anInt3781 * 1070348131 & 0x3] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[0])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_809_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[2])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_809_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_809_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[3] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_809_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_809_ = 3;
				}
				for (int i_810_ = 0; i_810_ < i_809_; i_810_++) {
					int i_811_ = ((Class329) this).anIntArray3837[i_810_];
					int i_812_ = (i_811_ - ((Class329) this).anInt3781 * 2140696262 & 0x7);
					int i_813_ = anIntArray3811[i_811_];
					int i_814_ = anIntArray3800[i_811_];
					int i_815_;
					int i_816_;
					if (1 == 1070348131 * ((Class329) this).anInt3781) {
						i_815_ = i_814_;
						i_816_ = 512 - i_813_;
					} else if (2 == 1070348131 * ((Class329) this).anInt3781) {
						i_815_ = 512 - i_813_;
						i_816_ = 512 - i_814_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_815_ = 512 - i_814_;
						i_816_ = i_813_;
					} else {
						i_815_ = i_813_;
						i_816_ = i_814_;
					}
					is_798_[((Class329) this).anInt3852 * -1626041195] = i_815_;
					is_799_[-1626041195 * ((Class329) this).anInt3852] = i_816_;
					if (null != is_803_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_811_])) {
						int i_817_ = (i_796_ << 9) + i_815_;
						int i_818_ = (i_797_ << 9) + i_816_;
						is_803_[-1626041195 * ((Class329) this).anInt3852] = (class390_805_.method6709(i_817_, i_818_, 490291196) - class390.method6709(i_817_, i_818_, 1416322383));
					}
					if (is_804_ != null) {
						if (null != class390_805_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_811_])) {
							int i_819_ = (i_796_ << 9) + i_815_;
							int i_820_ = (i_797_ << 9) + i_816_;
							is_804_[((Class329) this).anInt3852 * -1626041195] = (class390.method6709(i_819_, i_820_, 690129280) - class390_805_.method6709(i_819_, i_820_, 1953738823));
						} else if (class390_806_ != null && !(aBoolArrayArray3823[(((Class329) this).anInt3844 * -595948995)][i_811_])) {
							int i_821_ = i_815_ + (i_796_ << 9);
							int i_822_ = i_816_ + (i_797_ << 9);
							is_804_[-1626041195 * ((Class329) this).anInt3852] = (class390_806_.method6709(i_821_, i_822_, -172003780) - class390.method6709(i_821_, i_822_, -1759987324));
						}
					}
					if (i_811_ < 8 && (((Class329) this).anIntArray3842[i_812_] > class531.anInt7052 * 1070524733)) {
						if (is != null)
							is[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3839[i_812_];
						is_802_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3827[i_812_];
						is_801_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3813[i_812_];
						is_800_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3838[i_812_];
					} else {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = i_807_;
						is_801_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7066 * 1717409107;
						is_802_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7057 * -1065364389;
						is_800_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (!aBool3786 && 0 == i)
				aClass206_3776.method3392(i_796_, i_797_, 220189999 * class531.anInt7051, 442664952 * class531.anInt7063, -1036917025 * class531.anInt7064, class531.anInt7065 * 669977931, -1307230745 * class531.anInt7055, class531.anInt7067 * -335219819, (short) -27084);
			if (-595948995 * ((Class329) this).anInt3844 != 12 && 1419498143 * class531.anInt7054 != -1 && class531.aBool7059)
				((Class329) this).aBool3851 = true;
		} else if (((Class329) this).aBool3853)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3814[-595948995 * ((Class329) this).anInt3844]);
		else if (((Class329) this).aBool3810)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3778[-595948995 * ((Class329) this).anInt3844]);
		else
			((Class329) this).anInt3846 += -193737745 * (anIntArray3826[-595948995 * ((Class329) this).anInt3844]);
	}

	static final int method5880(int i, int i_823_) {
		int i_824_ = (Class260.method4632(i - 1, i_823_ - 1, -794056281) + Class260.method4632(1 + i, i_823_ - 1, -725489370) + Class260.method4632(i - 1, 1 + i_823_, -1402472245) + Class260.method4632(i + 1, 1 + i_823_, -1129359107));
		int i_825_ = (Class260.method4632(i - 1, i_823_, -1220429440) + Class260.method4632(1 + i, i_823_, -1834694040) + Class260.method4632(i, i_823_ - 1, -444238683) + Class260.method4632(i, i_823_ + 1, -1966434844));
		int i_826_ = Class260.method4632(i, i_823_, -261760532);
		return i_826_ / 4 + (i_825_ / 8 + i_824_ / 16);
	}

	void method5881(Class390 class390, Class481 class481, Class531 class531, int i, int i_827_, int i_828_, int i_829_, int i_830_, int i_831_, int i_832_) {
		int i_833_ = class390.method6722(i_827_, i_828_, 65280);
		int i_834_ = class390.method6722(i_829_, i_828_, 65280);
		int i_835_ = class390.method6722(i_829_, i_830_, 65280);
		int i_836_ = class390.method6722(i_827_, i_830_, 65280);
		boolean bool = aClass311_3787.method5497(i_827_, i_828_, 1488644062);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_837_ = true;
			if (null != class481 && !class481.aBool5722)
				bool_837_ = false;
			else if (i_831_ == 0 && 0 != ((Class329) this).anInt3844 * -595948995)
				bool_837_ = false;
			else if (i_832_ > 0 && class531 != null && !class531.aBool7056)
				bool_837_ = false;
			if (bool_837_ && i_834_ == i_833_ && i_833_ == i_835_ && i_833_ == i_836_)
				aByteArrayArrayArray3794[i][i_827_][i_828_] |= 0x4;
		}
	}

	static final int method5882(int i, int i_838_, int i_839_) {
		int i_840_ = i / i_839_;
		int i_841_ = i & i_839_ - 1;
		int i_842_ = i_838_ / i_839_;
		int i_843_ = i_838_ & i_839_ - 1;
		int i_844_ = Class241.method4151(i_840_, i_842_, 1156456439);
		int i_845_ = Class241.method4151(i_840_ + 1, i_842_, 1156456439);
		int i_846_ = Class241.method4151(i_840_, i_842_ + 1, 1156456439);
		int i_847_ = Class241.method4151(1 + i_840_, 1 + i_842_, 1156456439);
		int i_848_ = Class430.method7220(i_844_, i_845_, i_841_, i_839_, -1764935182);
		int i_849_ = Class430.method7220(i_846_, i_847_, i_841_, i_839_, -936047841);
		return Class430.method7220(i_848_, i_849_, i_843_, i_839_, -834318519);
	}

	void method5883(Class390 class390, Class481 class481, Class531 class531, int i, int i_850_, int i_851_, int i_852_, int i_853_, int i_854_, int i_855_) {
		int i_856_ = class390.method6722(i_850_, i_851_, 65280);
		int i_857_ = class390.method6722(i_852_, i_851_, 65280);
		int i_858_ = class390.method6722(i_852_, i_853_, 65280);
		int i_859_ = class390.method6722(i_850_, i_853_, 65280);
		boolean bool = aClass311_3787.method5497(i_850_, i_851_, 1756077935);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_860_ = true;
			if (null != class481 && !class481.aBool5722)
				bool_860_ = false;
			else if (i_854_ == 0 && 0 != ((Class329) this).anInt3844 * -595948995)
				bool_860_ = false;
			else if (i_855_ > 0 && class531 != null && !class531.aBool7056)
				bool_860_ = false;
			if (bool_860_ && i_857_ == i_856_ && i_856_ == i_858_ && i_856_ == i_859_)
				aByteArrayArrayArray3794[i][i_850_][i_851_] |= 0x4;
		}
	}

	int method5884(int i, int i_861_, int i_862_, int i_863_, int i_864_, Class390 class390, byte[][] is) {
		if ((-595948995 * ((Class329) this).anInt3844 == 0 || -595948995 * ((Class329) this).anInt3844 == 12) && i_861_ > 0 && i_862_ > 0 && i_861_ < -1230013231 * anInt3784 && i_862_ < anInt3785 * 2024737111) {
			int i_865_ = 0;
			int i_866_ = 0;
			int i_867_ = 0;
			int i_868_ = 0;
			i_865_ = i_865_ + (i == is[i_861_ - 1][i_862_ - 1] ? 1 : -1);
			i_866_ = i_866_ + (i == is[i_863_][i_862_ - 1] ? 1 : -1);
			i_867_ = i_867_ + (is[i_863_][i_864_] == i ? 1 : -1);
			i_868_ = i_868_ + (i == is[i_861_ - 1][i_864_] ? 1 : -1);
			if (is[i_861_][i_862_ - 1] == i) {
				i_865_++;
				i_866_++;
			} else {
				i_865_--;
				i_866_--;
			}
			if (i == is[i_863_][i_862_]) {
				i_866_++;
				i_867_++;
			} else {
				i_866_--;
				i_867_--;
			}
			if (i == is[i_861_][i_864_]) {
				i_867_++;
				i_868_++;
			} else {
				i_867_--;
				i_868_--;
			}
			if (i == is[i_861_ - 1][i_862_]) {
				i_868_++;
				i_865_++;
			} else {
				i_868_--;
				i_865_--;
			}
			int i_869_ = i_865_ - i_867_;
			if (i_869_ < 0)
				i_869_ = -i_869_;
			int i_870_ = i_866_ - i_868_;
			if (i_870_ < 0)
				i_870_ = -i_870_;
			if (i_869_ == i_870_) {
				i_869_ = (class390.method6722(i_861_, i_862_, 65280) - class390.method6722(i_863_, i_864_, 65280));
				if (i_869_ < 0)
					i_869_ = -i_869_;
				i_870_ = (class390.method6722(i_863_, i_862_, 65280) - class390.method6722(i_861_, i_864_, 65280));
				if (i_870_ < 0)
					i_870_ = -i_870_;
			}
			return i_869_ < i_870_ ? 1 : 0;
		}
		return ((Class329) this).anInt3781 * 1070348131;
	}

	static final int method5885(int i, int i_871_) {
		int i_872_ = (Class159.method2735(45365 + i, i_871_ + 91923, 4, -726719813) - 128 + (Class159.method2735(i + 10294, 37821 + i_871_, 2, -726719813) - 128 >> 1) + (Class159.method2735(i, i_871_, 1, -726719813) - 128 >> 2));
		i_872_ = 35 + (int) ((double) i_872_ * 0.3);
		if (i_872_ < 10)
			i_872_ = 10;
		else if (i_872_ > 60)
			i_872_ = 60;
		return i_872_;
	}

	static final int method5886(int i, int i_873_, int i_874_) {
		int i_875_ = i / i_874_;
		int i_876_ = i & i_874_ - 1;
		int i_877_ = i_873_ / i_874_;
		int i_878_ = i_873_ & i_874_ - 1;
		int i_879_ = Class241.method4151(i_875_, i_877_, 1156456439);
		int i_880_ = Class241.method4151(i_875_ + 1, i_877_, 1156456439);
		int i_881_ = Class241.method4151(i_875_, i_877_ + 1, 1156456439);
		int i_882_ = Class241.method4151(1 + i_875_, 1 + i_877_, 1156456439);
		int i_883_ = Class430.method7220(i_879_, i_880_, i_876_, i_874_, -755553778);
		int i_884_ = Class430.method7220(i_881_, i_882_, i_876_, i_874_, -1045113702);
		return Class430.method7220(i_883_, i_884_, i_878_, i_874_, -1310074094);
	}

	static final int method5887(int i, int i_885_, int i_886_) {
		if (i_885_ == i)
			return i;
		int i_887_ = 128 - i_886_;
		int i_888_ = i_886_ * (i_885_ & 0x7f) + (i & 0x7f) * i_887_ >> 7;
		int i_889_ = (i & 0x380) * i_887_ + (i_885_ & 0x380) * i_886_ >> 7;
		int i_890_ = i_887_ * (i & 0xfc00) + i_886_ * (i_885_ & 0xfc00) >> 7;
		return i_890_ & 0xfc00 | i_889_ & 0x380 | i_888_ & 0x7f;
	}

	final void method5888(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_891_, int i_892_, int i_893_, byte[][] is, byte[][] is_894_, byte[][] is_895_, boolean[] bools) {
		boolean[] bools_896_ = (null != class531 && class531.aBool7061 ? aBoolArrayArray3793[-595948995 * ((Class329) this).anInt3844] : (aBoolArrayArray3816[((Class329) this).anInt3844 * -595948995]));
		if (i_891_ > 0) {
			if (i > 0) {
				int i_897_ = is[i - 1][i_891_ - 1] & 0xff;
				if (i_897_ > 0) {
					Class531 class531_898_ = ((Class329) this).aClass536_3834.method11475(i_897_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_898_.anInt7054 && class531_898_.aBool7061) {
						byte i_899_ = is_894_[i - 1][i_891_ - 1];
						int i_900_ = 2 * is_895_[i - 1][i_891_ - 1] + 4 & 0x7;
						int i_901_ = Class153.method2617(class505, class531_898_, (byte) -108);
						if (aBoolArrayArray3822[i_899_][i_900_]) {
							((Class329) this).anIntArray3838[0] = class531_898_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[0] = i_901_;
							((Class329) this).anIntArray3813[0] = 1717409107 * class531_898_.anInt7066;
							((Class329) this).anIntArray3827[0] = class531_898_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[0] = 1070524733 * class531_898_.anInt7052;
							((Class329) this).anIntArray3843[0] = 256;
						}
					}
				}
			}
			if (i < i_892_ - 1) {
				int i_902_ = is[i + 1][i_891_ - 1] & 0xff;
				if (i_902_ > 0) {
					Class531 class531_903_ = ((Class329) this).aClass536_3834.method11475(i_902_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_903_.anInt7054 && class531_903_.aBool7061) {
						byte i_904_ = is_894_[1 + i][i_891_ - 1];
						int i_905_ = 6 + is_895_[1 + i][i_891_ - 1] * 2 & 0x7;
						int i_906_ = Class153.method2617(class505, class531_903_, (byte) 23);
						if (aBoolArrayArray3822[i_904_][i_905_]) {
							((Class329) this).anIntArray3838[2] = 1419498143 * class531_903_.anInt7054;
							((Class329) this).anIntArray3839[2] = i_906_;
							((Class329) this).anIntArray3813[2] = 1717409107 * class531_903_.anInt7066;
							((Class329) this).anIntArray3827[2] = -1065364389 * class531_903_.anInt7057;
							((Class329) this).anIntArray3842[2] = class531_903_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[2] = 512;
						}
					}
				}
			}
		}
		if (i_891_ < i_893_ - 1) {
			if (i > 0) {
				int i_907_ = is[i - 1][i_891_ + 1] & 0xff;
				if (i_907_ > 0) {
					Class531 class531_908_ = ((Class329) this).aClass536_3834.method11475(i_907_ - 1, (byte) 0);
					if (class531_908_.anInt7054 * 1419498143 != -1 && class531_908_.aBool7061) {
						byte i_909_ = is_894_[i - 1][i_891_ + 1];
						int i_910_ = is_895_[i - 1][1 + i_891_] * 2 + 2 & 0x7;
						int i_911_ = Class153.method2617(class505, class531_908_, (byte) 17);
						if (aBoolArrayArray3822[i_909_][i_910_]) {
							((Class329) this).anIntArray3838[6] = class531_908_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[6] = i_911_;
							((Class329) this).anIntArray3813[6] = 1717409107 * class531_908_.anInt7066;
							((Class329) this).anIntArray3827[6] = class531_908_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[6] = class531_908_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[6] = 64;
						}
					}
				}
			}
			if (i < i_892_ - 1) {
				int i_912_ = is[1 + i][i_891_ + 1] & 0xff;
				if (i_912_ > 0) {
					Class531 class531_913_ = ((Class329) this).aClass536_3834.method11475(i_912_ - 1, (byte) 0);
					if (1419498143 * class531_913_.anInt7054 != -1 && class531_913_.aBool7061) {
						byte i_914_ = is_894_[i + 1][1 + i_891_];
						int i_915_ = 2 * is_895_[i + 1][i_891_ + 1] + 0 & 0x7;
						int i_916_ = Class153.method2617(class505, class531_913_, (byte) 22);
						if (aBoolArrayArray3822[i_914_][i_915_]) {
							((Class329) this).anIntArray3838[4] = class531_913_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[4] = i_916_;
							((Class329) this).anIntArray3813[4] = class531_913_.anInt7066 * 1717409107;
							((Class329) this).anIntArray3827[4] = -1065364389 * class531_913_.anInt7057;
							((Class329) this).anIntArray3842[4] = 1070524733 * class531_913_.anInt7052;
							((Class329) this).anIntArray3843[4] = 128;
						}
					}
				}
			}
		}
		if (i_891_ > 0) {
			int i_917_ = is[i][i_891_ - 1] & 0xff;
			if (i_917_ > 0) {
				Class531 class531_918_ = ((Class329) this).aClass536_3834.method11475(i_917_ - 1, (byte) 0);
				if (1419498143 * class531_918_.anInt7054 != -1) {
					byte i_919_ = is_894_[i][i_891_ - 1];
					int i_920_ = is_895_[i][i_891_ - 1];
					if (class531_918_.aBool7061) {
						int i_921_ = 2;
						int i_922_ = 2 * i_920_ + 4;
						int i_923_ = Class153.method2617(class505, class531_918_, (byte) 113);
						for (int i_924_ = 0; i_924_ < 3; i_924_++) {
							i_922_ &= 0x7;
							i_921_ &= 0x7;
							if (aBoolArrayArray3822[i_919_][i_922_] && (((Class329) this).anIntArray3842[i_921_] <= class531_918_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_921_] = 1419498143 * class531_918_.anInt7054;
								((Class329) this).anIntArray3839[i_921_] = i_923_;
								((Class329) this).anIntArray3813[i_921_] = 1717409107 * class531_918_.anInt7066;
								((Class329) this).anIntArray3827[i_921_] = -1065364389 * class531_918_.anInt7057;
								if (((Class329) this).anIntArray3842[i_921_] == 1070524733 * class531_918_.anInt7052)
									((Class329) this).anIntArray3843[i_921_] |= 0x20;
								else
									((Class329) this).anIntArray3843[i_921_] = 32;
								((Class329) this).anIntArray3842[i_921_] = class531_918_.anInt7052 * 1070524733;
							}
							i_922_++;
							i_921_--;
						}
						if (!bools_896_[0 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[0] = (aBoolArrayArray3793[i_919_][2 + i_920_ & 0x3]);
					} else if (!bools_896_[0 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[0] = aBoolArrayArray3816[i_919_][i_920_ + 2 & 0x3];
				}
			}
		}
		if (i_891_ < i_893_ - 1) {
			int i_925_ = is[i][i_891_ + 1] & 0xff;
			if (i_925_ > 0) {
				Class531 class531_926_ = ((Class329) this).aClass536_3834.method11475(i_925_ - 1, (byte) 0);
				if (-1 != 1419498143 * class531_926_.anInt7054) {
					byte i_927_ = is_894_[i][i_891_ + 1];
					int i_928_ = is_895_[i][i_891_ + 1];
					if (class531_926_.aBool7061) {
						int i_929_ = 4;
						int i_930_ = 2 * i_928_ + 2;
						int i_931_ = Class153.method2617(class505, class531_926_, (byte) 6);
						for (int i_932_ = 0; i_932_ < 3; i_932_++) {
							i_930_ &= 0x7;
							i_929_ &= 0x7;
							if (aBoolArrayArray3822[i_927_][i_930_] && (((Class329) this).anIntArray3842[i_929_] <= 1070524733 * class531_926_.anInt7052)) {
								((Class329) this).anIntArray3838[i_929_] = class531_926_.anInt7054 * 1419498143;
								((Class329) this).anIntArray3839[i_929_] = i_931_;
								((Class329) this).anIntArray3813[i_929_] = 1717409107 * class531_926_.anInt7066;
								((Class329) this).anIntArray3827[i_929_] = class531_926_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_929_] == 1070524733 * class531_926_.anInt7052)
									((Class329) this).anIntArray3843[i_929_] |= 0x10;
								else
									((Class329) this).anIntArray3843[i_929_] = 16;
								((Class329) this).anIntArray3842[i_929_] = 1070524733 * class531_926_.anInt7052;
							}
							i_930_--;
							i_929_++;
						}
						if (!bools_896_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
							bools[2] = (aBoolArrayArray3793[i_927_][i_928_ + 0 & 0x3]);
					} else if (!bools_896_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[2] = aBoolArrayArray3816[i_927_][0 + i_928_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_933_ = is[i - 1][i_891_] & 0xff;
			if (i_933_ > 0) {
				Class531 class531_934_ = ((Class329) this).aClass536_3834.method11475(i_933_ - 1, (byte) 0);
				if (class531_934_.anInt7054 * 1419498143 != -1) {
					byte i_935_ = is_894_[i - 1][i_891_];
					int i_936_ = is_895_[i - 1][i_891_];
					if (class531_934_.aBool7061) {
						int i_937_ = 6;
						int i_938_ = i_936_ * 2 + 4;
						int i_939_ = Class153.method2617(class505, class531_934_, (byte) -77);
						for (int i_940_ = 0; i_940_ < 3; i_940_++) {
							i_938_ &= 0x7;
							i_937_ &= 0x7;
							if (aBoolArrayArray3822[i_935_][i_938_] && (((Class329) this).anIntArray3842[i_937_] <= 1070524733 * class531_934_.anInt7052)) {
								((Class329) this).anIntArray3838[i_937_] = 1419498143 * class531_934_.anInt7054;
								((Class329) this).anIntArray3839[i_937_] = i_939_;
								((Class329) this).anIntArray3813[i_937_] = class531_934_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_937_] = -1065364389 * class531_934_.anInt7057;
								if (1070524733 * class531_934_.anInt7052 == (((Class329) this).anIntArray3842[i_937_]))
									((Class329) this).anIntArray3843[i_937_] |= 0x8;
								else
									((Class329) this).anIntArray3843[i_937_] = 8;
								((Class329) this).anIntArray3842[i_937_] = 1070524733 * class531_934_.anInt7052;
							}
							i_938_--;
							i_937_++;
						}
						if (!bools_896_[(((Class329) this).anInt3781 * 1070348131 + 3 & 0x3)])
							bools[3] = (aBoolArrayArray3793[i_935_][i_936_ + 1 & 0x3]);
					} else if (!bools_896_[(3 + 1070348131 * ((Class329) this).anInt3781 & 0x3)])
						bools[3] = aBoolArrayArray3816[i_935_][1 + i_936_ & 0x3];
				}
			}
		}
		if (i < i_892_ - 1) {
			int i_941_ = is[i + 1][i_891_] & 0xff;
			if (i_941_ > 0) {
				Class531 class531_942_ = ((Class329) this).aClass536_3834.method11475(i_941_ - 1, (byte) 0);
				if (1419498143 * class531_942_.anInt7054 != -1) {
					byte i_943_ = is_894_[1 + i][i_891_];
					int i_944_ = is_895_[1 + i][i_891_];
					if (class531_942_.aBool7061) {
						int i_945_ = 4;
						int i_946_ = 6 + i_944_ * 2;
						int i_947_ = Class153.method2617(class505, class531_942_, (byte) 21);
						for (int i_948_ = 0; i_948_ < 3; i_948_++) {
							i_946_ &= 0x7;
							i_945_ &= 0x7;
							if (aBoolArrayArray3822[i_943_][i_946_] && (((Class329) this).anIntArray3842[i_945_] <= class531_942_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_945_] = 1419498143 * class531_942_.anInt7054;
								((Class329) this).anIntArray3839[i_945_] = i_947_;
								((Class329) this).anIntArray3813[i_945_] = class531_942_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_945_] = class531_942_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_945_] == class531_942_.anInt7052 * 1070524733)
									((Class329) this).anIntArray3843[i_945_] |= 0x4;
								else
									((Class329) this).anIntArray3843[i_945_] = 4;
								((Class329) this).anIntArray3842[i_945_] = class531_942_.anInt7052 * 1070524733;
							}
							i_946_++;
							i_945_--;
						}
						if (!bools_896_[1 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[1] = (aBoolArrayArray3793[i_943_][3 + i_944_ & 0x3]);
					} else if (!bools_896_[(1070348131 * ((Class329) this).anInt3781 + 1 & 0x3)])
						bools[1] = aBoolArrayArray3816[i_943_][i_944_ + 3 & 0x3];
				}
			}
		}
		if (null != class531 && class531.aBool7061) {
			int i_949_ = Class153.method2617(class505, class531, (byte) 19);
			for (int i_950_ = 0; i_950_ < 8; i_950_++) {
				int i_951_ = i_950_ - 2140696262 * ((Class329) this).anInt3781 & 0x7;
				if ((aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_950_]) && (((Class329) this).anIntArray3842[i_951_] <= class531.anInt7052 * 1070524733)) {
					((Class329) this).anIntArray3838[i_951_] = class531.anInt7054 * 1419498143;
					((Class329) this).anIntArray3839[i_951_] = i_949_;
					((Class329) this).anIntArray3813[i_951_] = 1717409107 * class531.anInt7066;
					((Class329) this).anIntArray3827[i_951_] = class531.anInt7057 * -1065364389;
					if (1070524733 * class531.anInt7052 == ((Class329) this).anIntArray3842[i_951_])
						((Class329) this).anIntArray3843[i_951_] |= 0x2;
					else
						((Class329) this).anIntArray3843[i_951_] = 2;
					((Class329) this).anIntArray3842[i_951_] = class531.anInt7052 * 1070524733;
				}
			}
		}
	}

	static final int method5889(int i, int i_952_) {
		int i_953_ = (Class159.method2735(45365 + i, i_952_ + 91923, 4, -726719813) - 128 + (Class159.method2735(i + 10294, 37821 + i_952_, 2, -726719813) - 128 >> 1) + (Class159.method2735(i, i_952_, 1, -726719813) - 128 >> 2));
		i_953_ = 35 + (int) ((double) i_953_ * 0.3);
		if (i_953_ < 10)
			i_953_ = 10;
		else if (i_953_ > 60)
			i_953_ = 60;
		return i_953_;
	}

	public final void method5890(int i, int i_954_, int i_955_, int i_956_, byte i_957_) {
		for (int i_958_ = 0; i_958_ < anInt3845 * 1599084401; i_958_++)
			method5838(i_958_, i, i_954_, i_955_, i_956_, -1337783095);
	}

	public void method5891(short i) {
		((Class329) this).anIntArray3795 = null;
		((Class329) this).anIntArray3796 = null;
		((Class329) this).anIntArray3797 = null;
		((Class329) this).anIntArray3798 = null;
		((Class329) this).anIntArray3799 = null;
		aBool3773 = false;
	}

	int method5892(int i, int i_959_, int i_960_, int i_961_, int i_962_, Class390 class390, byte[][] is) {
		if ((-595948995 * ((Class329) this).anInt3844 == 0 || -595948995 * ((Class329) this).anInt3844 == 12) && i_959_ > 0 && i_960_ > 0 && i_959_ < -1230013231 * anInt3784 && i_960_ < anInt3785 * 2024737111) {
			int i_963_ = 0;
			int i_964_ = 0;
			int i_965_ = 0;
			int i_966_ = 0;
			i_963_ = i_963_ + (i == is[i_959_ - 1][i_960_ - 1] ? 1 : -1);
			i_964_ = i_964_ + (i == is[i_961_][i_960_ - 1] ? 1 : -1);
			i_965_ = i_965_ + (is[i_961_][i_962_] == i ? 1 : -1);
			i_966_ = i_966_ + (i == is[i_959_ - 1][i_962_] ? 1 : -1);
			if (is[i_959_][i_960_ - 1] == i) {
				i_963_++;
				i_964_++;
			} else {
				i_963_--;
				i_964_--;
			}
			if (i == is[i_961_][i_960_]) {
				i_964_++;
				i_965_++;
			} else {
				i_964_--;
				i_965_--;
			}
			if (i == is[i_959_][i_962_]) {
				i_965_++;
				i_966_++;
			} else {
				i_965_--;
				i_966_--;
			}
			if (i == is[i_959_ - 1][i_960_]) {
				i_966_++;
				i_963_++;
			} else {
				i_966_--;
				i_963_--;
			}
			int i_967_ = i_963_ - i_965_;
			if (i_967_ < 0)
				i_967_ = -i_967_;
			int i_968_ = i_964_ - i_966_;
			if (i_968_ < 0)
				i_968_ = -i_968_;
			if (i_967_ == i_968_) {
				i_967_ = (class390.method6722(i_959_, i_960_, 65280) - class390.method6722(i_961_, i_962_, 65280));
				if (i_967_ < 0)
					i_967_ = -i_967_;
				i_968_ = (class390.method6722(i_961_, i_960_, 65280) - class390.method6722(i_959_, i_962_, 65280));
				if (i_968_ < 0)
					i_968_ = -i_968_;
			}
			return i_967_ < i_968_ ? 1 : 0;
		}
		return ((Class329) this).anInt3781 * 1070348131;
	}

	static final int method5893(int i, int i_969_, int i_970_) {
		int i_971_ = i / i_970_;
		int i_972_ = i & i_970_ - 1;
		int i_973_ = i_969_ / i_970_;
		int i_974_ = i_969_ & i_970_ - 1;
		int i_975_ = Class241.method4151(i_971_, i_973_, 1156456439);
		int i_976_ = Class241.method4151(i_971_ + 1, i_973_, 1156456439);
		int i_977_ = Class241.method4151(i_971_, i_973_ + 1, 1156456439);
		int i_978_ = Class241.method4151(1 + i_971_, 1 + i_973_, 1156456439);
		int i_979_ = Class430.method7220(i_975_, i_976_, i_972_, i_970_, -1737280342);
		int i_980_ = Class430.method7220(i_977_, i_978_, i_972_, i_970_, -1821561536);
		return Class430.method7220(i_979_, i_980_, i_974_, i_970_, -905669665);
	}

	static final int method5894(int i, int i_981_, int i_982_, int i_983_) {
		int i_984_ = 65536 - Class382.anIntArray4661[i_982_ * 8192 / i_983_] >> 1;
		return (i_981_ * i_984_ >> 16) + (i * (65536 - i_984_) >> 16);
	}

	static final int method5895(int i, int i_985_, int i_986_, int i_987_) {
		int i_988_ = 65536 - Class382.anIntArray4661[i_986_ * 8192 / i_987_] >> 1;
		return (i_985_ * i_988_ >> 16) + (i * (65536 - i_988_) >> 16);
	}

	final void method5896(GraphicalRenderer class505, Class531 class531, Class481 class481, int i, int i_989_, int i_990_, int i_991_, byte[][] is, byte[][] is_992_, byte[][] is_993_, boolean[] bools) {
		boolean[] bools_994_ = (null != class531 && class531.aBool7061 ? aBoolArrayArray3793[-595948995 * ((Class329) this).anInt3844] : (aBoolArrayArray3816[((Class329) this).anInt3844 * -595948995]));
		if (i_989_ > 0) {
			if (i > 0) {
				int i_995_ = is[i - 1][i_989_ - 1] & 0xff;
				if (i_995_ > 0) {
					Class531 class531_996_ = ((Class329) this).aClass536_3834.method11475(i_995_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_996_.anInt7054 && class531_996_.aBool7061) {
						byte i_997_ = is_992_[i - 1][i_989_ - 1];
						int i_998_ = 2 * is_993_[i - 1][i_989_ - 1] + 4 & 0x7;
						int i_999_ = Class153.method2617(class505, class531_996_, (byte) 69);
						if (aBoolArrayArray3822[i_997_][i_998_]) {
							((Class329) this).anIntArray3838[0] = class531_996_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[0] = i_999_;
							((Class329) this).anIntArray3813[0] = 1717409107 * class531_996_.anInt7066;
							((Class329) this).anIntArray3827[0] = class531_996_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[0] = 1070524733 * class531_996_.anInt7052;
							((Class329) this).anIntArray3843[0] = 256;
						}
					}
				}
			}
			if (i < i_990_ - 1) {
				int i_1000_ = is[i + 1][i_989_ - 1] & 0xff;
				if (i_1000_ > 0) {
					Class531 class531_1001_ = ((Class329) this).aClass536_3834.method11475(i_1000_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_1001_.anInt7054 && class531_1001_.aBool7061) {
						byte i_1002_ = is_992_[1 + i][i_989_ - 1];
						int i_1003_ = 6 + is_993_[1 + i][i_989_ - 1] * 2 & 0x7;
						int i_1004_ = Class153.method2617(class505, class531_1001_, (byte) -59);
						if (aBoolArrayArray3822[i_1002_][i_1003_]) {
							((Class329) this).anIntArray3838[2] = 1419498143 * class531_1001_.anInt7054;
							((Class329) this).anIntArray3839[2] = i_1004_;
							((Class329) this).anIntArray3813[2] = 1717409107 * class531_1001_.anInt7066;
							((Class329) this).anIntArray3827[2] = -1065364389 * class531_1001_.anInt7057;
							((Class329) this).anIntArray3842[2] = class531_1001_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[2] = 512;
						}
					}
				}
			}
		}
		if (i_989_ < i_991_ - 1) {
			if (i > 0) {
				int i_1005_ = is[i - 1][i_989_ + 1] & 0xff;
				if (i_1005_ > 0) {
					Class531 class531_1006_ = ((Class329) this).aClass536_3834.method11475(i_1005_ - 1, (byte) 0);
					if (class531_1006_.anInt7054 * 1419498143 != -1 && class531_1006_.aBool7061) {
						byte i_1007_ = is_992_[i - 1][i_989_ + 1];
						int i_1008_ = is_993_[i - 1][1 + i_989_] * 2 + 2 & 0x7;
						int i_1009_ = Class153.method2617(class505, class531_1006_, (byte) -18);
						if (aBoolArrayArray3822[i_1007_][i_1008_]) {
							((Class329) this).anIntArray3838[6] = class531_1006_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[6] = i_1009_;
							((Class329) this).anIntArray3813[6] = 1717409107 * class531_1006_.anInt7066;
							((Class329) this).anIntArray3827[6] = class531_1006_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[6] = class531_1006_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[6] = 64;
						}
					}
				}
			}
			if (i < i_990_ - 1) {
				int i_1010_ = is[1 + i][i_989_ + 1] & 0xff;
				if (i_1010_ > 0) {
					Class531 class531_1011_ = ((Class329) this).aClass536_3834.method11475(i_1010_ - 1, (byte) 0);
					if (1419498143 * class531_1011_.anInt7054 != -1 && class531_1011_.aBool7061) {
						byte i_1012_ = is_992_[i + 1][1 + i_989_];
						int i_1013_ = 2 * is_993_[i + 1][i_989_ + 1] + 0 & 0x7;
						int i_1014_ = Class153.method2617(class505, class531_1011_, (byte) -47);
						if (aBoolArrayArray3822[i_1012_][i_1013_]) {
							((Class329) this).anIntArray3838[4] = class531_1011_.anInt7054 * 1419498143;
							((Class329) this).anIntArray3839[4] = i_1014_;
							((Class329) this).anIntArray3813[4] = class531_1011_.anInt7066 * 1717409107;
							((Class329) this).anIntArray3827[4] = -1065364389 * class531_1011_.anInt7057;
							((Class329) this).anIntArray3842[4] = 1070524733 * class531_1011_.anInt7052;
							((Class329) this).anIntArray3843[4] = 128;
						}
					}
				}
			}
		}
		if (i_989_ > 0) {
			int i_1015_ = is[i][i_989_ - 1] & 0xff;
			if (i_1015_ > 0) {
				Class531 class531_1016_ = ((Class329) this).aClass536_3834.method11475(i_1015_ - 1, (byte) 0);
				if (1419498143 * class531_1016_.anInt7054 != -1) {
					byte i_1017_ = is_992_[i][i_989_ - 1];
					int i_1018_ = is_993_[i][i_989_ - 1];
					if (class531_1016_.aBool7061) {
						int i_1019_ = 2;
						int i_1020_ = 2 * i_1018_ + 4;
						int i_1021_ = Class153.method2617(class505, class531_1016_, (byte) -48);
						for (int i_1022_ = 0; i_1022_ < 3; i_1022_++) {
							i_1020_ &= 0x7;
							i_1019_ &= 0x7;
							if (aBoolArrayArray3822[i_1017_][i_1020_] && (((Class329) this).anIntArray3842[i_1019_] <= (class531_1016_.anInt7052 * 1070524733))) {
								((Class329) this).anIntArray3838[i_1019_] = 1419498143 * class531_1016_.anInt7054;
								((Class329) this).anIntArray3839[i_1019_] = i_1021_;
								((Class329) this).anIntArray3813[i_1019_] = 1717409107 * class531_1016_.anInt7066;
								((Class329) this).anIntArray3827[i_1019_] = -1065364389 * class531_1016_.anInt7057;
								if (((Class329) this).anIntArray3842[i_1019_] == 1070524733 * class531_1016_.anInt7052)
									((Class329) this).anIntArray3843[i_1019_] |= 0x20;
								else
									((Class329) this).anIntArray3843[i_1019_] = 32;
								((Class329) this).anIntArray3842[i_1019_] = class531_1016_.anInt7052 * 1070524733;
							}
							i_1020_++;
							i_1019_--;
						}
						if (!bools_994_[0 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[0] = (aBoolArrayArray3793[i_1017_][2 + i_1018_ & 0x3]);
					} else if (!bools_994_[0 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[0] = aBoolArrayArray3816[i_1017_][i_1018_ + 2 & 0x3];
				}
			}
		}
		if (i_989_ < i_991_ - 1) {
			int i_1023_ = is[i][i_989_ + 1] & 0xff;
			if (i_1023_ > 0) {
				Class531 class531_1024_ = ((Class329) this).aClass536_3834.method11475(i_1023_ - 1, (byte) 0);
				if (-1 != 1419498143 * class531_1024_.anInt7054) {
					byte i_1025_ = is_992_[i][i_989_ + 1];
					int i_1026_ = is_993_[i][i_989_ + 1];
					if (class531_1024_.aBool7061) {
						int i_1027_ = 4;
						int i_1028_ = 2 * i_1026_ + 2;
						int i_1029_ = Class153.method2617(class505, class531_1024_, (byte) 101);
						for (int i_1030_ = 0; i_1030_ < 3; i_1030_++) {
							i_1028_ &= 0x7;
							i_1027_ &= 0x7;
							if (aBoolArrayArray3822[i_1025_][i_1028_] && (((Class329) this).anIntArray3842[i_1027_] <= (1070524733 * class531_1024_.anInt7052))) {
								((Class329) this).anIntArray3838[i_1027_] = class531_1024_.anInt7054 * 1419498143;
								((Class329) this).anIntArray3839[i_1027_] = i_1029_;
								((Class329) this).anIntArray3813[i_1027_] = 1717409107 * class531_1024_.anInt7066;
								((Class329) this).anIntArray3827[i_1027_] = class531_1024_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_1027_] == 1070524733 * class531_1024_.anInt7052)
									((Class329) this).anIntArray3843[i_1027_] |= 0x10;
								else
									((Class329) this).anIntArray3843[i_1027_] = 16;
								((Class329) this).anIntArray3842[i_1027_] = 1070524733 * class531_1024_.anInt7052;
							}
							i_1028_--;
							i_1027_++;
						}
						if (!bools_994_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
							bools[2] = (aBoolArrayArray3793[i_1025_][i_1026_ + 0 & 0x3]);
					} else if (!bools_994_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[2] = aBoolArrayArray3816[i_1025_][0 + i_1026_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_1031_ = is[i - 1][i_989_] & 0xff;
			if (i_1031_ > 0) {
				Class531 class531_1032_ = ((Class329) this).aClass536_3834.method11475(i_1031_ - 1, (byte) 0);
				if (class531_1032_.anInt7054 * 1419498143 != -1) {
					byte i_1033_ = is_992_[i - 1][i_989_];
					int i_1034_ = is_993_[i - 1][i_989_];
					if (class531_1032_.aBool7061) {
						int i_1035_ = 6;
						int i_1036_ = i_1034_ * 2 + 4;
						int i_1037_ = Class153.method2617(class505, class531_1032_, (byte) 35);
						for (int i_1038_ = 0; i_1038_ < 3; i_1038_++) {
							i_1036_ &= 0x7;
							i_1035_ &= 0x7;
							if (aBoolArrayArray3822[i_1033_][i_1036_] && (((Class329) this).anIntArray3842[i_1035_] <= (1070524733 * class531_1032_.anInt7052))) {
								((Class329) this).anIntArray3838[i_1035_] = 1419498143 * class531_1032_.anInt7054;
								((Class329) this).anIntArray3839[i_1035_] = i_1037_;
								((Class329) this).anIntArray3813[i_1035_] = class531_1032_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_1035_] = -1065364389 * class531_1032_.anInt7057;
								if (1070524733 * class531_1032_.anInt7052 == (((Class329) this).anIntArray3842[i_1035_]))
									((Class329) this).anIntArray3843[i_1035_] |= 0x8;
								else
									((Class329) this).anIntArray3843[i_1035_] = 8;
								((Class329) this).anIntArray3842[i_1035_] = 1070524733 * class531_1032_.anInt7052;
							}
							i_1036_--;
							i_1035_++;
						}
						if (!bools_994_[(((Class329) this).anInt3781 * 1070348131 + 3 & 0x3)])
							bools[3] = (aBoolArrayArray3793[i_1033_][i_1034_ + 1 & 0x3]);
					} else if (!bools_994_[(3 + 1070348131 * ((Class329) this).anInt3781 & 0x3)])
						bools[3] = aBoolArrayArray3816[i_1033_][1 + i_1034_ & 0x3];
				}
			}
		}
		if (i < i_990_ - 1) {
			int i_1039_ = is[i + 1][i_989_] & 0xff;
			if (i_1039_ > 0) {
				Class531 class531_1040_ = ((Class329) this).aClass536_3834.method11475(i_1039_ - 1, (byte) 0);
				if (1419498143 * class531_1040_.anInt7054 != -1) {
					byte i_1041_ = is_992_[1 + i][i_989_];
					int i_1042_ = is_993_[1 + i][i_989_];
					if (class531_1040_.aBool7061) {
						int i_1043_ = 4;
						int i_1044_ = 6 + i_1042_ * 2;
						int i_1045_ = Class153.method2617(class505, class531_1040_, (byte) 72);
						for (int i_1046_ = 0; i_1046_ < 3; i_1046_++) {
							i_1044_ &= 0x7;
							i_1043_ &= 0x7;
							if (aBoolArrayArray3822[i_1041_][i_1044_] && (((Class329) this).anIntArray3842[i_1043_] <= (class531_1040_.anInt7052 * 1070524733))) {
								((Class329) this).anIntArray3838[i_1043_] = 1419498143 * class531_1040_.anInt7054;
								((Class329) this).anIntArray3839[i_1043_] = i_1045_;
								((Class329) this).anIntArray3813[i_1043_] = class531_1040_.anInt7066 * 1717409107;
								((Class329) this).anIntArray3827[i_1043_] = class531_1040_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_1043_] == class531_1040_.anInt7052 * 1070524733)
									((Class329) this).anIntArray3843[i_1043_] |= 0x4;
								else
									((Class329) this).anIntArray3843[i_1043_] = 4;
								((Class329) this).anIntArray3842[i_1043_] = class531_1040_.anInt7052 * 1070524733;
							}
							i_1044_++;
							i_1043_--;
						}
						if (!bools_994_[1 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[1] = (aBoolArrayArray3793[i_1041_][3 + i_1042_ & 0x3]);
					} else if (!bools_994_[(1070348131 * ((Class329) this).anInt3781 + 1 & 0x3)])
						bools[1] = aBoolArrayArray3816[i_1041_][i_1042_ + 3 & 0x3];
				}
			}
		}
		if (null != class531 && class531.aBool7061) {
			int i_1047_ = Class153.method2617(class505, class531, (byte) -46);
			for (int i_1048_ = 0; i_1048_ < 8; i_1048_++) {
				int i_1049_ = i_1048_ - 2140696262 * ((Class329) this).anInt3781 & 0x7;
				if ((aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_1048_]) && (((Class329) this).anIntArray3842[i_1049_] <= class531.anInt7052 * 1070524733)) {
					((Class329) this).anIntArray3838[i_1049_] = class531.anInt7054 * 1419498143;
					((Class329) this).anIntArray3839[i_1049_] = i_1047_;
					((Class329) this).anIntArray3813[i_1049_] = 1717409107 * class531.anInt7066;
					((Class329) this).anIntArray3827[i_1049_] = class531.anInt7057 * -1065364389;
					if (1070524733 * class531.anInt7052 == ((Class329) this).anIntArray3842[i_1049_])
						((Class329) this).anIntArray3843[i_1049_] |= 0x2;
					else
						((Class329) this).anIntArray3843[i_1049_] = 2;
					((Class329) this).anIntArray3842[i_1049_] = class531.anInt7052 * 1070524733;
				}
			}
		}
	}

	static final int method5897(int i, int i_1050_) {
		int i_1051_ = (Class260.method4632(i - 1, i_1050_ - 1, -203736912) + Class260.method4632(1 + i, i_1050_ - 1, -107812181) + Class260.method4632(i - 1, 1 + i_1050_, -1404499336) + Class260.method4632(i + 1, 1 + i_1050_, -394655332));
		int i_1052_ = (Class260.method4632(i - 1, i_1050_, -853845327) + Class260.method4632(1 + i, i_1050_, -908667032) + Class260.method4632(i, i_1050_ - 1, -152185651) + Class260.method4632(i, i_1050_ + 1, -1697600915));
		int i_1053_ = Class260.method4632(i, i_1050_, -1581032206);
		return i_1053_ / 4 + (i_1052_ / 8 + i_1051_ / 16);
	}

	static final int method5898(int i, int i_1054_) {
		int i_1055_ = (Class260.method4632(i - 1, i_1054_ - 1, -744758628) + Class260.method4632(1 + i, i_1054_ - 1, -1392897838) + Class260.method4632(i - 1, 1 + i_1054_, -2114127883) + Class260.method4632(i + 1, 1 + i_1054_, -759723238));
		int i_1056_ = (Class260.method4632(i - 1, i_1054_, -202698262) + Class260.method4632(1 + i, i_1054_, -1674642695) + Class260.method4632(i, i_1054_ - 1, -249055378) + Class260.method4632(i, i_1054_ + 1, -1769365313));
		int i_1057_ = Class260.method4632(i, i_1054_, -2042849375);
		return i_1057_ / 4 + (i_1056_ / 8 + i_1055_ / 16);
	}

	static final int method5899(int i, int i_1058_) {
		int i_1059_ = i_1058_ * 57 + i;
		i_1059_ = i_1059_ << 13 ^ i_1059_;
		int i_1060_ = ((789221 + i_1059_ * i_1059_ * 15731) * i_1059_ + 1376312589 & 0x7fffffff);
		return i_1060_ >> 19 & 0xff;
	}

	static final int method5900(int i, int i_1061_) {
		int i_1062_ = i_1061_ * 57 + i;
		i_1062_ = i_1062_ << 13 ^ i_1062_;
		int i_1063_ = ((789221 + i_1062_ * i_1062_ * 15731) * i_1062_ + 1376312589 & 0x7fffffff);
		return i_1063_ >> 19 & 0xff;
	}

	static final void method5901(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 567564004;
		int i_1064_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_1065_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_1066_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 2]);
		int i_1067_ = (((CS2Executor) class527).intStack[3 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		Class431 class431 = Class466.aClass444_5570.method7424(i_1066_, (byte) 8);
		if (class431.aChar5146 != i_1064_ || class431.aChar5140 != i_1065_)
			throw new RuntimeException(new StringBuilder().append(i_1066_).append(" ").append(i_1067_).toString());
		if (115 == i_1065_)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = class431.method7226(i_1067_, 870483820);
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class431.method7232(i_1067_, -1848389937);
	}

	static final void method5902(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((CS2Executor) class527).aClass61_7010.aByte619;
	}

	public static void method5903(Class470 class470, Frame frame, int i) {
		class470.method7820((byte) 1);
		frame.setVisible(false);
		frame.dispose();
	}

	static final void method5904(CS2Executor class527, short i) {
		int i_1068_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (null == Class468_Sub8.aClass98Array7889[i_1068_])
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = (Class468_Sub8.aClass98Array7889[i_1068_].aClass118Array998).length;
	}

	static long method5905(Interface12 interface12, int i, int i_1069_, byte i_1070_) {
		long l = 4194304L;
		long l_1071_ = -9223372036854775808L;
		Class478 class478 = client.aClass257_7353.method4436(-1495690632).method7891(interface12.method84(1049688189), 65280);
		long l_1072_ = (long) (i | i_1069_ << 7 | interface12.method89(1466657768) << 14 | interface12.method92(-524760179) << 20 | 0x40000000);
		if (0 == -348507379 * class478.anInt5652)
			l_1072_ |= l_1071_;
		if (1 == -1062790731 * class478.anInt5687)
			l_1072_ |= l;
		l_1072_ |= (long) interface12.method84(-1337355622) << 32;
		return l_1072_;
	}

	static void method5906(int i, int i_1073_) {
		Class282_Sub53_Sub2.anInt9630 = i * -1678093667;
		Class282_Sub53_Sub2.aClass282_Sub53_Sub2Array9633 = new Class282_Sub53_Sub2[i];
		Class279.anInt3370 = 0;
	}
}
