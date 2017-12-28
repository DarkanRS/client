/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class322 {
	int[][] anIntArrayArray3732;
	int anInt3733;
	byte[] aByteArray3734;
	int anInt3735;
	int anInt3736;
	int[] anIntArray3737;
	int[] anIntArray3738;
	Class40 aClass40_3739;
	int anInt3740;
	Class40[] aClass40Array3741;
	byte[][] aByteArrayArray3742;
	int[] anIntArray3743;
	int[] anIntArray3744;
	int[] anIntArray3745;
	int[][] anIntArrayArray3746;
	static final int anInt3747 = 7;
	int[] anIntArray3748;
	public static Class317 aClass317_3749;

	void method5759(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(Class282_Sub17_Sub6.method15438(is, (byte) 90));
		int i = class282_sub35.readUnsignedByte();
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			((Class322) this).anInt3735 = class282_sub35.readInt() * -1817791645;
		else
			((Class322) this).anInt3735 = 0;
		int i_0_ = class282_sub35.readUnsignedByte();
		boolean bool = (i_0_ & 0x1) != 0;
		boolean bool_1_ = 0 != (i_0_ & 0x2);
		if (i >= 7)
			((Class322) this).anInt3736 = class282_sub35.method13097((byte) 1) * 2022935963;
		else
			((Class322) this).anInt3736 = class282_sub35.readUnsignedShort() * 2022935963;
		int i_2_ = 0;
		int i_3_ = -1;
		((Class322) this).anIntArray3737 = new int[((Class322) this).anInt3736 * 1006899347];
		if (i >= 7) {
			for (int i_4_ = 0; i_4_ < 1006899347 * ((Class322) this).anInt3736; i_4_++) {
				((Class322) this).anIntArray3737[i_4_] = i_2_ += class282_sub35.method13097((byte) 1);
				if (((Class322) this).anIntArray3737[i_4_] > i_3_)
					i_3_ = ((Class322) this).anIntArray3737[i_4_];
			}
		} else {
			for (int i_5_ = 0; i_5_ < ((Class322) this).anInt3736 * 1006899347; i_5_++) {
				((Class322) this).anIntArray3737[i_5_] = i_2_ += class282_sub35.readUnsignedShort();
				if (((Class322) this).anIntArray3737[i_5_] > i_3_)
					i_3_ = ((Class322) this).anIntArray3737[i_5_];
			}
		}
		((Class322) this).anInt3740 = (1 + i_3_) * -1799178585;
		((Class322) this).anIntArray3745 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool_1_)
			((Class322) this).aByteArrayArray3742 = new byte[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3743 = new int[1563136279 * ((Class322) this).anInt3740];
		((Class322) this).anIntArray3744 = new int[((Class322) this).anInt3740 * 1563136279];
		((Class322) this).anIntArrayArray3732 = new int[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3748 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool) {
			((Class322) this).anIntArray3738 = new int[((Class322) this).anInt3740 * 1563136279];
			for (int i_6_ = 0; i_6_ < 1563136279 * ((Class322) this).anInt3740; i_6_++)
				((Class322) this).anIntArray3738[i_6_] = -1;
			for (int i_7_ = 0; i_7_ < 1006899347 * ((Class322) this).anInt3736; i_7_++)
				((Class322) this).anIntArray3738[(((Class322) this).anIntArray3737[i_7_])] = class282_sub35.readInt();
			((Class322) this).aClass40_3739 = new Class40(((Class322) this).anIntArray3738);
		}
		for (int i_8_ = 0; i_8_ < ((Class322) this).anInt3736 * 1006899347; i_8_++)
			((Class322) this).anIntArray3745[(((Class322) this).anIntArray3737[i_8_])] = class282_sub35.readInt();
		if (bool_1_) {
			for (int i_9_ = 0; i_9_ < 1006899347 * ((Class322) this).anInt3736; i_9_++) {
				byte[] is_10_ = new byte[64];
				class282_sub35.readBytes(is_10_, 0, 64, 781983218);
				((Class322) this).aByteArrayArray3742[(((Class322) this).anIntArray3737[i_9_])] = is_10_;
			}
		}
		for (int i_11_ = 0; i_11_ < ((Class322) this).anInt3736 * 1006899347; i_11_++)
			((Class322) this).anIntArray3743[(((Class322) this).anIntArray3737[i_11_])] = class282_sub35.readInt();
		if (i >= 7) {
			for (int i_12_ = 0; i_12_ < ((Class322) this).anInt3736 * 1006899347; i_12_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_12_])] = class282_sub35.method13097((byte) 1);
			for (int i_13_ = 0; i_13_ < 1006899347 * ((Class322) this).anInt3736; i_13_++) {
				int i_14_ = ((Class322) this).anIntArray3737[i_13_];
				int i_15_ = ((Class322) this).anIntArray3744[i_14_];
				i_2_ = 0;
				int i_16_ = -1;
				((Class322) this).anIntArrayArray3732[i_14_] = new int[i_15_];
				for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
					int i_18_ = (((Class322) this).anIntArrayArray3732[i_14_][i_17_] = i_2_ += class282_sub35.method13097((byte) 1));
					if (i_18_ > i_16_)
						i_16_ = i_18_;
				}
				((Class322) this).anIntArray3748[i_14_] = i_16_ + 1;
				if (i_15_ == i_16_ + 1)
					((Class322) this).anIntArrayArray3732[i_14_] = null;
			}
		} else {
			for (int i_19_ = 0; i_19_ < ((Class322) this).anInt3736 * 1006899347; i_19_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_19_])] = class282_sub35.readUnsignedShort();
			for (int i_20_ = 0; i_20_ < 1006899347 * ((Class322) this).anInt3736; i_20_++) {
				int i_21_ = ((Class322) this).anIntArray3737[i_20_];
				int i_22_ = ((Class322) this).anIntArray3744[i_21_];
				i_2_ = 0;
				int i_23_ = -1;
				((Class322) this).anIntArrayArray3732[i_21_] = new int[i_22_];
				for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
					int i_25_ = (((Class322) this).anIntArrayArray3732[i_21_][i_24_] = i_2_ += class282_sub35.readUnsignedShort());
					if (i_25_ > i_23_)
						i_23_ = i_25_;
				}
				((Class322) this).anIntArray3748[i_21_] = 1 + i_23_;
				if (i_22_ == i_23_ + 1)
					((Class322) this).anIntArrayArray3732[i_21_] = null;
			}
		}
		if (bool) {
			((Class322) this).anIntArrayArray3746 = new int[i_3_ + 1][];
			((Class322) this).aClass40Array3741 = new Class40[i_3_ + 1];
			for (int i_26_ = 0; i_26_ < ((Class322) this).anInt3736 * 1006899347; i_26_++) {
				int i_27_ = ((Class322) this).anIntArray3737[i_26_];
				int i_28_ = ((Class322) this).anIntArray3744[i_27_];
				((Class322) this).anIntArrayArray3746[i_27_] = new int[((Class322) this).anIntArray3748[i_27_]];
				for (int i_29_ = 0; i_29_ < ((Class322) this).anIntArray3748[i_27_]; i_29_++)
					((Class322) this).anIntArrayArray3746[i_27_][i_29_] = -1;
				for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
					int i_31_;
					if (null != ((Class322) this).anIntArrayArray3732[i_27_])
						i_31_ = (((Class322) this).anIntArrayArray3732[i_27_][i_30_]);
					else
						i_31_ = i_30_;
					((Class322) this).anIntArrayArray3746[i_27_][i_31_] = class282_sub35.readInt();
				}
				((Class322) this).aClass40Array3741[i_27_] = new Class40(((Class322) this).anIntArrayArray3746[i_27_]);
			}
		}
	}

	void method5760(byte[] is, int i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(Class282_Sub17_Sub6.method15438(is, (byte) 90));
		int i_32_ = class282_sub35.readUnsignedByte();
		if (i_32_ < 5 || i_32_ > 7)
			throw new RuntimeException();
		if (i_32_ >= 6)
			((Class322) this).anInt3735 = class282_sub35.readInt() * -1817791645;
		else
			((Class322) this).anInt3735 = 0;
		int i_33_ = class282_sub35.readUnsignedByte();
		boolean bool = (i_33_ & 0x1) != 0;
		boolean bool_34_ = 0 != (i_33_ & 0x2);
		if (i_32_ >= 7)
			((Class322) this).anInt3736 = class282_sub35.method13097((byte) 1) * 2022935963;
		else
			((Class322) this).anInt3736 = class282_sub35.readUnsignedShort() * 2022935963;
		int i_35_ = 0;
		int i_36_ = -1;
		((Class322) this).anIntArray3737 = new int[((Class322) this).anInt3736 * 1006899347];
		if (i_32_ >= 7) {
			for (int i_37_ = 0; i_37_ < 1006899347 * ((Class322) this).anInt3736; i_37_++) {
				((Class322) this).anIntArray3737[i_37_] = i_35_ += class282_sub35.method13097((byte) 1);
				if (((Class322) this).anIntArray3737[i_37_] > i_36_)
					i_36_ = ((Class322) this).anIntArray3737[i_37_];
			}
		} else {
			for (int i_38_ = 0; i_38_ < ((Class322) this).anInt3736 * 1006899347; i_38_++) {
				((Class322) this).anIntArray3737[i_38_] = i_35_ += class282_sub35.readUnsignedShort();
				if (((Class322) this).anIntArray3737[i_38_] > i_36_)
					i_36_ = ((Class322) this).anIntArray3737[i_38_];
			}
		}
		((Class322) this).anInt3740 = (1 + i_36_) * -1799178585;
		((Class322) this).anIntArray3745 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool_34_)
			((Class322) this).aByteArrayArray3742 = new byte[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3743 = new int[1563136279 * ((Class322) this).anInt3740];
		((Class322) this).anIntArray3744 = new int[((Class322) this).anInt3740 * 1563136279];
		((Class322) this).anIntArrayArray3732 = new int[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3748 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool) {
			((Class322) this).anIntArray3738 = new int[((Class322) this).anInt3740 * 1563136279];
			for (int i_39_ = 0; i_39_ < 1563136279 * ((Class322) this).anInt3740; i_39_++)
				((Class322) this).anIntArray3738[i_39_] = -1;
			for (int i_40_ = 0; i_40_ < 1006899347 * ((Class322) this).anInt3736; i_40_++)
				((Class322) this).anIntArray3738[(((Class322) this).anIntArray3737[i_40_])] = class282_sub35.readInt();
			((Class322) this).aClass40_3739 = new Class40(((Class322) this).anIntArray3738);
		}
		for (int i_41_ = 0; i_41_ < ((Class322) this).anInt3736 * 1006899347; i_41_++)
			((Class322) this).anIntArray3745[(((Class322) this).anIntArray3737[i_41_])] = class282_sub35.readInt();
		if (bool_34_) {
			for (int i_42_ = 0; i_42_ < 1006899347 * ((Class322) this).anInt3736; i_42_++) {
				byte[] is_43_ = new byte[64];
				class282_sub35.readBytes(is_43_, 0, 64, 612047318);
				((Class322) this).aByteArrayArray3742[(((Class322) this).anIntArray3737[i_42_])] = is_43_;
			}
		}
		for (int i_44_ = 0; i_44_ < ((Class322) this).anInt3736 * 1006899347; i_44_++)
			((Class322) this).anIntArray3743[(((Class322) this).anIntArray3737[i_44_])] = class282_sub35.readInt();
		if (i_32_ >= 7) {
			for (int i_45_ = 0; i_45_ < ((Class322) this).anInt3736 * 1006899347; i_45_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_45_])] = class282_sub35.method13097((byte) 1);
			for (int i_46_ = 0; i_46_ < 1006899347 * ((Class322) this).anInt3736; i_46_++) {
				int i_47_ = ((Class322) this).anIntArray3737[i_46_];
				int i_48_ = ((Class322) this).anIntArray3744[i_47_];
				i_35_ = 0;
				int i_49_ = -1;
				((Class322) this).anIntArrayArray3732[i_47_] = new int[i_48_];
				for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
					int i_51_ = (((Class322) this).anIntArrayArray3732[i_47_][i_50_] = i_35_ += class282_sub35.method13097((byte) 1));
					if (i_51_ > i_49_)
						i_49_ = i_51_;
				}
				((Class322) this).anIntArray3748[i_47_] = i_49_ + 1;
				if (i_48_ == i_49_ + 1)
					((Class322) this).anIntArrayArray3732[i_47_] = null;
			}
		} else {
			for (int i_52_ = 0; i_52_ < ((Class322) this).anInt3736 * 1006899347; i_52_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_52_])] = class282_sub35.readUnsignedShort();
			for (int i_53_ = 0; i_53_ < 1006899347 * ((Class322) this).anInt3736; i_53_++) {
				int i_54_ = ((Class322) this).anIntArray3737[i_53_];
				int i_55_ = ((Class322) this).anIntArray3744[i_54_];
				i_35_ = 0;
				int i_56_ = -1;
				((Class322) this).anIntArrayArray3732[i_54_] = new int[i_55_];
				for (int i_57_ = 0; i_57_ < i_55_; i_57_++) {
					int i_58_ = (((Class322) this).anIntArrayArray3732[i_54_][i_57_] = i_35_ += class282_sub35.readUnsignedShort());
					if (i_58_ > i_56_)
						i_56_ = i_58_;
				}
				((Class322) this).anIntArray3748[i_54_] = 1 + i_56_;
				if (i_55_ == i_56_ + 1)
					((Class322) this).anIntArrayArray3732[i_54_] = null;
			}
		}
		if (bool) {
			((Class322) this).anIntArrayArray3746 = new int[i_36_ + 1][];
			((Class322) this).aClass40Array3741 = new Class40[i_36_ + 1];
			for (int i_59_ = 0; i_59_ < ((Class322) this).anInt3736 * 1006899347; i_59_++) {
				int i_60_ = ((Class322) this).anIntArray3737[i_59_];
				int i_61_ = ((Class322) this).anIntArray3744[i_60_];
				((Class322) this).anIntArrayArray3746[i_60_] = new int[((Class322) this).anIntArray3748[i_60_]];
				for (int i_62_ = 0; i_62_ < ((Class322) this).anIntArray3748[i_60_]; i_62_++)
					((Class322) this).anIntArrayArray3746[i_60_][i_62_] = -1;
				for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
					int i_64_;
					if (null != ((Class322) this).anIntArrayArray3732[i_60_])
						i_64_ = (((Class322) this).anIntArrayArray3732[i_60_][i_63_]);
					else
						i_64_ = i_63_;
					((Class322) this).anIntArrayArray3746[i_60_][i_64_] = class282_sub35.readInt();
				}
				((Class322) this).aClass40Array3741[i_60_] = new Class40(((Class322) this).anIntArrayArray3746[i_60_]);
			}
		}
	}

	void method5761(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(Class282_Sub17_Sub6.method15438(is, (byte) 20));
		int i = class282_sub35.readUnsignedByte();
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			((Class322) this).anInt3735 = class282_sub35.readInt() * -1817791645;
		else
			((Class322) this).anInt3735 = 0;
		int i_65_ = class282_sub35.readUnsignedByte();
		boolean bool = (i_65_ & 0x1) != 0;
		boolean bool_66_ = 0 != (i_65_ & 0x2);
		if (i >= 7)
			((Class322) this).anInt3736 = class282_sub35.method13097((byte) 1) * 2022935963;
		else
			((Class322) this).anInt3736 = class282_sub35.readUnsignedShort() * 2022935963;
		int i_67_ = 0;
		int i_68_ = -1;
		((Class322) this).anIntArray3737 = new int[((Class322) this).anInt3736 * 1006899347];
		if (i >= 7) {
			for (int i_69_ = 0; i_69_ < 1006899347 * ((Class322) this).anInt3736; i_69_++) {
				((Class322) this).anIntArray3737[i_69_] = i_67_ += class282_sub35.method13097((byte) 1);
				if (((Class322) this).anIntArray3737[i_69_] > i_68_)
					i_68_ = ((Class322) this).anIntArray3737[i_69_];
			}
		} else {
			for (int i_70_ = 0; i_70_ < ((Class322) this).anInt3736 * 1006899347; i_70_++) {
				((Class322) this).anIntArray3737[i_70_] = i_67_ += class282_sub35.readUnsignedShort();
				if (((Class322) this).anIntArray3737[i_70_] > i_68_)
					i_68_ = ((Class322) this).anIntArray3737[i_70_];
			}
		}
		((Class322) this).anInt3740 = (1 + i_68_) * -1799178585;
		((Class322) this).anIntArray3745 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool_66_)
			((Class322) this).aByteArrayArray3742 = new byte[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3743 = new int[1563136279 * ((Class322) this).anInt3740];
		((Class322) this).anIntArray3744 = new int[((Class322) this).anInt3740 * 1563136279];
		((Class322) this).anIntArrayArray3732 = new int[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3748 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool) {
			((Class322) this).anIntArray3738 = new int[((Class322) this).anInt3740 * 1563136279];
			for (int i_71_ = 0; i_71_ < 1563136279 * ((Class322) this).anInt3740; i_71_++)
				((Class322) this).anIntArray3738[i_71_] = -1;
			for (int i_72_ = 0; i_72_ < 1006899347 * ((Class322) this).anInt3736; i_72_++)
				((Class322) this).anIntArray3738[(((Class322) this).anIntArray3737[i_72_])] = class282_sub35.readInt();
			((Class322) this).aClass40_3739 = new Class40(((Class322) this).anIntArray3738);
		}
		for (int i_73_ = 0; i_73_ < ((Class322) this).anInt3736 * 1006899347; i_73_++)
			((Class322) this).anIntArray3745[(((Class322) this).anIntArray3737[i_73_])] = class282_sub35.readInt();
		if (bool_66_) {
			for (int i_74_ = 0; i_74_ < 1006899347 * ((Class322) this).anInt3736; i_74_++) {
				byte[] is_75_ = new byte[64];
				class282_sub35.readBytes(is_75_, 0, 64, 422479023);
				((Class322) this).aByteArrayArray3742[(((Class322) this).anIntArray3737[i_74_])] = is_75_;
			}
		}
		for (int i_76_ = 0; i_76_ < ((Class322) this).anInt3736 * 1006899347; i_76_++)
			((Class322) this).anIntArray3743[(((Class322) this).anIntArray3737[i_76_])] = class282_sub35.readInt();
		if (i >= 7) {
			for (int i_77_ = 0; i_77_ < ((Class322) this).anInt3736 * 1006899347; i_77_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_77_])] = class282_sub35.method13097((byte) 1);
			for (int i_78_ = 0; i_78_ < 1006899347 * ((Class322) this).anInt3736; i_78_++) {
				int i_79_ = ((Class322) this).anIntArray3737[i_78_];
				int i_80_ = ((Class322) this).anIntArray3744[i_79_];
				i_67_ = 0;
				int i_81_ = -1;
				((Class322) this).anIntArrayArray3732[i_79_] = new int[i_80_];
				for (int i_82_ = 0; i_82_ < i_80_; i_82_++) {
					int i_83_ = (((Class322) this).anIntArrayArray3732[i_79_][i_82_] = i_67_ += class282_sub35.method13097((byte) 1));
					if (i_83_ > i_81_)
						i_81_ = i_83_;
				}
				((Class322) this).anIntArray3748[i_79_] = i_81_ + 1;
				if (i_80_ == i_81_ + 1)
					((Class322) this).anIntArrayArray3732[i_79_] = null;
			}
		} else {
			for (int i_84_ = 0; i_84_ < ((Class322) this).anInt3736 * 1006899347; i_84_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_84_])] = class282_sub35.readUnsignedShort();
			for (int i_85_ = 0; i_85_ < 1006899347 * ((Class322) this).anInt3736; i_85_++) {
				int i_86_ = ((Class322) this).anIntArray3737[i_85_];
				int i_87_ = ((Class322) this).anIntArray3744[i_86_];
				i_67_ = 0;
				int i_88_ = -1;
				((Class322) this).anIntArrayArray3732[i_86_] = new int[i_87_];
				for (int i_89_ = 0; i_89_ < i_87_; i_89_++) {
					int i_90_ = (((Class322) this).anIntArrayArray3732[i_86_][i_89_] = i_67_ += class282_sub35.readUnsignedShort());
					if (i_90_ > i_88_)
						i_88_ = i_90_;
				}
				((Class322) this).anIntArray3748[i_86_] = 1 + i_88_;
				if (i_87_ == i_88_ + 1)
					((Class322) this).anIntArrayArray3732[i_86_] = null;
			}
		}
		if (bool) {
			((Class322) this).anIntArrayArray3746 = new int[i_68_ + 1][];
			((Class322) this).aClass40Array3741 = new Class40[i_68_ + 1];
			for (int i_91_ = 0; i_91_ < ((Class322) this).anInt3736 * 1006899347; i_91_++) {
				int i_92_ = ((Class322) this).anIntArray3737[i_91_];
				int i_93_ = ((Class322) this).anIntArray3744[i_92_];
				((Class322) this).anIntArrayArray3746[i_92_] = new int[((Class322) this).anIntArray3748[i_92_]];
				for (int i_94_ = 0; i_94_ < ((Class322) this).anIntArray3748[i_92_]; i_94_++)
					((Class322) this).anIntArrayArray3746[i_92_][i_94_] = -1;
				for (int i_95_ = 0; i_95_ < i_93_; i_95_++) {
					int i_96_;
					if (null != ((Class322) this).anIntArrayArray3732[i_92_])
						i_96_ = (((Class322) this).anIntArrayArray3732[i_92_][i_95_]);
					else
						i_96_ = i_95_;
					((Class322) this).anIntArrayArray3746[i_92_][i_96_] = class282_sub35.readInt();
				}
				((Class322) this).aClass40Array3741[i_92_] = new Class40(((Class322) this).anIntArrayArray3746[i_92_]);
			}
		}
	}

	Class322(byte[] is, int i, byte[] is_97_) {
		((Class322) this).anInt3733 = Class285.method5028(is, is.length, (short) 255) * 2079717751;
		if (i != -2006273977 * ((Class322) this).anInt3733)
			throw new RuntimeException();
		if (null != is_97_) {
			if (is_97_.length != 64)
				throw new RuntimeException();
			((Class322) this).aByteArray3734 = Class361.method6273(is, 0, is.length, (byte) 79);
			for (int i_98_ = 0; i_98_ < 64; i_98_++) {
				if (is_97_[i_98_] != ((Class322) this).aByteArray3734[i_98_])
					throw new RuntimeException();
			}
		}
		method5760(is, 227007259);
	}

	void method5762(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(Class282_Sub17_Sub6.method15438(is, (byte) 117));
		int i = class282_sub35.readUnsignedByte();
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			((Class322) this).anInt3735 = class282_sub35.readInt() * -1817791645;
		else
			((Class322) this).anInt3735 = 0;
		int i_99_ = class282_sub35.readUnsignedByte();
		boolean bool = (i_99_ & 0x1) != 0;
		boolean bool_100_ = 0 != (i_99_ & 0x2);
		if (i >= 7)
			((Class322) this).anInt3736 = class282_sub35.method13097((byte) 1) * 2022935963;
		else
			((Class322) this).anInt3736 = class282_sub35.readUnsignedShort() * 2022935963;
		int i_101_ = 0;
		int i_102_ = -1;
		((Class322) this).anIntArray3737 = new int[((Class322) this).anInt3736 * 1006899347];
		if (i >= 7) {
			for (int i_103_ = 0; i_103_ < 1006899347 * ((Class322) this).anInt3736; i_103_++) {
				((Class322) this).anIntArray3737[i_103_] = i_101_ += class282_sub35.method13097((byte) 1);
				if (((Class322) this).anIntArray3737[i_103_] > i_102_)
					i_102_ = ((Class322) this).anIntArray3737[i_103_];
			}
		} else {
			for (int i_104_ = 0; i_104_ < ((Class322) this).anInt3736 * 1006899347; i_104_++) {
				((Class322) this).anIntArray3737[i_104_] = i_101_ += class282_sub35.readUnsignedShort();
				if (((Class322) this).anIntArray3737[i_104_] > i_102_)
					i_102_ = ((Class322) this).anIntArray3737[i_104_];
			}
		}
		((Class322) this).anInt3740 = (1 + i_102_) * -1799178585;
		((Class322) this).anIntArray3745 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool_100_)
			((Class322) this).aByteArrayArray3742 = new byte[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3743 = new int[1563136279 * ((Class322) this).anInt3740];
		((Class322) this).anIntArray3744 = new int[((Class322) this).anInt3740 * 1563136279];
		((Class322) this).anIntArrayArray3732 = new int[((Class322) this).anInt3740 * 1563136279][];
		((Class322) this).anIntArray3748 = new int[((Class322) this).anInt3740 * 1563136279];
		if (bool) {
			((Class322) this).anIntArray3738 = new int[((Class322) this).anInt3740 * 1563136279];
			for (int i_105_ = 0; i_105_ < 1563136279 * ((Class322) this).anInt3740; i_105_++)
				((Class322) this).anIntArray3738[i_105_] = -1;
			for (int i_106_ = 0; i_106_ < 1006899347 * ((Class322) this).anInt3736; i_106_++)
				((Class322) this).anIntArray3738[(((Class322) this).anIntArray3737[i_106_])] = class282_sub35.readInt();
			((Class322) this).aClass40_3739 = new Class40(((Class322) this).anIntArray3738);
		}
		for (int i_107_ = 0; i_107_ < ((Class322) this).anInt3736 * 1006899347; i_107_++)
			((Class322) this).anIntArray3745[(((Class322) this).anIntArray3737[i_107_])] = class282_sub35.readInt();
		if (bool_100_) {
			for (int i_108_ = 0; i_108_ < 1006899347 * ((Class322) this).anInt3736; i_108_++) {
				byte[] is_109_ = new byte[64];
				class282_sub35.readBytes(is_109_, 0, 64, 464889531);
				((Class322) this).aByteArrayArray3742[((Class322) this).anIntArray3737[i_108_]] = is_109_;
			}
		}
		for (int i_110_ = 0; i_110_ < ((Class322) this).anInt3736 * 1006899347; i_110_++)
			((Class322) this).anIntArray3743[(((Class322) this).anIntArray3737[i_110_])] = class282_sub35.readInt();
		if (i >= 7) {
			for (int i_111_ = 0; i_111_ < ((Class322) this).anInt3736 * 1006899347; i_111_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_111_])] = class282_sub35.method13097((byte) 1);
			for (int i_112_ = 0; i_112_ < 1006899347 * ((Class322) this).anInt3736; i_112_++) {
				int i_113_ = ((Class322) this).anIntArray3737[i_112_];
				int i_114_ = ((Class322) this).anIntArray3744[i_113_];
				i_101_ = 0;
				int i_115_ = -1;
				((Class322) this).anIntArrayArray3732[i_113_] = new int[i_114_];
				for (int i_116_ = 0; i_116_ < i_114_; i_116_++) {
					int i_117_ = (((Class322) this).anIntArrayArray3732[i_113_][i_116_] = i_101_ += class282_sub35.method13097((byte) 1));
					if (i_117_ > i_115_)
						i_115_ = i_117_;
				}
				((Class322) this).anIntArray3748[i_113_] = i_115_ + 1;
				if (i_114_ == i_115_ + 1)
					((Class322) this).anIntArrayArray3732[i_113_] = null;
			}
		} else {
			for (int i_118_ = 0; i_118_ < ((Class322) this).anInt3736 * 1006899347; i_118_++)
				((Class322) this).anIntArray3744[(((Class322) this).anIntArray3737[i_118_])] = class282_sub35.readUnsignedShort();
			for (int i_119_ = 0; i_119_ < 1006899347 * ((Class322) this).anInt3736; i_119_++) {
				int i_120_ = ((Class322) this).anIntArray3737[i_119_];
				int i_121_ = ((Class322) this).anIntArray3744[i_120_];
				i_101_ = 0;
				int i_122_ = -1;
				((Class322) this).anIntArrayArray3732[i_120_] = new int[i_121_];
				for (int i_123_ = 0; i_123_ < i_121_; i_123_++) {
					int i_124_ = (((Class322) this).anIntArrayArray3732[i_120_][i_123_] = i_101_ += class282_sub35.readUnsignedShort());
					if (i_124_ > i_122_)
						i_122_ = i_124_;
				}
				((Class322) this).anIntArray3748[i_120_] = 1 + i_122_;
				if (i_121_ == i_122_ + 1)
					((Class322) this).anIntArrayArray3732[i_120_] = null;
			}
		}
		if (bool) {
			((Class322) this).anIntArrayArray3746 = new int[i_102_ + 1][];
			((Class322) this).aClass40Array3741 = new Class40[i_102_ + 1];
			for (int i_125_ = 0; i_125_ < ((Class322) this).anInt3736 * 1006899347; i_125_++) {
				int i_126_ = ((Class322) this).anIntArray3737[i_125_];
				int i_127_ = ((Class322) this).anIntArray3744[i_126_];
				((Class322) this).anIntArrayArray3746[i_126_] = new int[((Class322) this).anIntArray3748[i_126_]];
				for (int i_128_ = 0; i_128_ < ((Class322) this).anIntArray3748[i_126_]; i_128_++)
					((Class322) this).anIntArrayArray3746[i_126_][i_128_] = -1;
				for (int i_129_ = 0; i_129_ < i_127_; i_129_++) {
					int i_130_;
					if (null != ((Class322) this).anIntArrayArray3732[i_126_])
						i_130_ = (((Class322) this).anIntArrayArray3732[i_126_][i_129_]);
					else
						i_130_ = i_129_;
					((Class322) this).anIntArrayArray3746[i_126_][i_130_] = class282_sub35.readInt();
				}
				((Class322) this).aClass40Array3741[i_126_] = new Class40(((Class322) this).anIntArrayArray3746[i_126_]);
			}
		}
	}

	static final void method5763(Class118 class118, Class98 class98, Class527 class527, int i) {
		class118.anInt1329 = 1179500154;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, -1575336609);
	}

	static final void method5764(Class527 class527, short i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_131_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_132_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537 + 1]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_131_ / i_132_;
	}

	static final void method5765(Class527 class527, int i) {
		int i_133_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class119.aClass426_1463.getItemDefinitions(i_133_, 200987173).anInt5064 * 155439281);
	}

	static final void method5766(Class527 class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]), 1012945270);
		Class190.method3148((byte) 77);
		client.aBool7175 = false;
	}

	static final void method5767(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method12797((byte) 57) ? 1 : 0;
	}

	static void method5768(int i, byte i_134_) {
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3858(i, (byte) -14);
		}
	}

	static final void method5769(Class527 class527, byte i) {
		int i_135_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		if (Class475.aBool5623) {
			if (i == 9) {
				Class467[] class467s = Class405.method6825((byte) 57);
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = class467s[i_135_].anInt5571 * -1928226539;
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = class467s[i_135_].anInt5574 * -1980032233;
			}
		} else {
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		}
	}
}
