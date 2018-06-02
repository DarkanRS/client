
/* Class282_Sub20_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.Socket;

public class Class282_Sub20_Sub10 extends Class282_Sub20 {
	static final int anInt9793 = 0;
	static final int anInt9794 = 1;
	static final int anInt9795 = 0;
	int[] anIntArray9796;
	static final int anInt9797 = 2;
	int[] anIntArray9798;
	int anInt9799 = 0;
	int[][] anIntArrayArray9800;
	short[] aShortArray9801 = new short[257];
	static Socket aSocket9802;

	void method12329() {
		if (null == ((Class282_Sub20_Sub10) this).anIntArrayArray9800)
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class282_Sub20_Sub10) this).anIntArrayArray9800.length < 2)
			throw new RuntimeException();
		if (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799 == 2)
			method15259(-938643914);
		Class316.method5586((byte) -9);
		method15258((byte) 16);
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -2005829703);
		if (aClass320_7667.aBool3722) {
			int[] is_1_ = method12317(0, i, 2064121299);
			for (int i_2_ = 0; i_2_ < Class316.anInt3670 * -402153223; i_2_++) {
				int i_3_ = is_1_[i_2_] >> 4;
				if (i_3_ < 0)
					i_3_ = 0;
				if (i_3_ > 256)
					i_3_ = 256;
				is[i_2_] = ((Class282_Sub20_Sub10) this).aShortArray9801[i_3_];
			}
		}
		return is;
	}

	final int[] method15257(int i, int i_4_) {
		if (i < 0)
			return ((Class282_Sub20_Sub10) this).anIntArray9798;
		if (i >= ((Class282_Sub20_Sub10) this).anIntArrayArray9800.length)
			return ((Class282_Sub20_Sub10) this).anIntArray9796;
		return ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i];
	}

	void method12321(int i) {
		if (null == ((Class282_Sub20_Sub10) this).anIntArrayArray9800)
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class282_Sub20_Sub10) this).anIntArrayArray9800.length < 2)
			throw new RuntimeException();
		if (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799 == 2)
			method15259(-938643914);
		Class316.method5586((byte) -8);
		method15258((byte) 16);
	}

	void method15258(byte i) {
		switch (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799) {
		case 2:
			for (int i_5_ = 0; i_5_ < 257; i_5_++) {
				int i_6_ = i_5_ << 4;
				int i_7_;
				for (i_7_ = 1; (i_7_ < (((Class282_Sub20_Sub10) this).anIntArrayArray9800).length - 1 && (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_7_][0]) <= i_6_); i_7_++) {
					/* empty */
				}
				int[] is = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_7_ - 1]);
				int[] is_8_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_7_];
				int i_9_ = method15257(i_7_ - 2, 1838320651)[1];
				int i_10_ = is[1];
				int i_11_ = is_8_[1];
				int i_12_ = method15257(1 + i_7_, 1394468294)[1];
				int i_13_ = (i_6_ - is[0] << 12) / (is_8_[0] - is[0]);
				int i_14_ = i_13_ * i_13_ >> 12;
				int i_15_ = i_12_ - i_11_ - i_9_ + i_10_;
				int i_16_ = i_9_ - i_10_ - i_15_;
				int i_17_ = i_11_ - i_9_;
				int i_18_ = i_10_;
				int i_19_ = (i_15_ * i_13_ >> 12) * i_14_ >> 12;
				int i_20_ = i_16_ * i_14_ >> 12;
				int i_21_ = i_13_ * i_17_ >> 12;
				int i_22_ = i_19_ + i_20_ + i_21_ + i_18_;
				if (i_22_ <= -32768)
					i_22_ = -32767;
				if (i_22_ >= 32768)
					i_22_ = 32767;
				((Class282_Sub20_Sub10) this).aShortArray9801[i_5_] = (short) i_22_;
			}
			break;
		default:
			for (int i_23_ = 0; i_23_ < 257; i_23_++) {
				int i_24_ = i_23_ << 4;
				int i_25_;
				for (i_25_ = 1; (i_25_ < (((Class282_Sub20_Sub10) this).anIntArrayArray9800).length - 1 && (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_25_][0]) <= i_24_); i_25_++) {
					/* empty */
				}
				int[] is = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_25_ - 1]);
				int[] is_26_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_25_];
				int i_27_ = (i_24_ - is[0] << 12) / (is_26_[0] - is[0]);
				int i_28_ = 4096 - i_27_;
				int i_29_ = i_28_ * is[1] + is_26_[1] * i_27_ >> 12;
				if (i_29_ <= -32768)
					i_29_ = -32767;
				if (i_29_ >= 32768)
					i_29_ = 32767;
				((Class282_Sub20_Sub10) this).aShortArray9801[i_23_] = (short) i_29_;
			}
			break;
		case 1:
			for (int i_30_ = 0; i_30_ < 257; i_30_++) {
				int i_31_ = i_30_ << 4;
				int i_32_;
				for (i_32_ = 1; (i_32_ < (((Class282_Sub20_Sub10) this).anIntArrayArray9800).length - 1 && (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_32_][0]) <= i_31_); i_32_++) {
					/* empty */
				}
				int[] is = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_32_ - 1]);
				int[] is_33_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_32_];
				int i_34_ = (i_31_ - is[0] << 12) / (is_33_[0] - is[0]);
				int i_35_ = 4096 - Class316.anIntArray3675[i_34_ >> 5 & 0xff] >> 1;
				int i_36_ = 4096 - i_35_;
				int i_37_ = i_36_ * is[1] + is_33_[1] * i_35_ >> 12;
				if (i_37_ <= -32768)
					i_37_ = -32767;
				if (i_37_ >= 32768)
					i_37_ = 32767;
				((Class282_Sub20_Sub10) this).aShortArray9801[i_30_] = (short) i_37_;
			}
		}
	}

	final void method15259(int i) {
		int[] is = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[0];
		int[] is_38_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[1];
		int[] is_39_ = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[((Class282_Sub20_Sub10) this).anIntArrayArray9800.length - 2]);
		int[] is_40_ = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[((Class282_Sub20_Sub10) this).anIntArrayArray9800.length - 1]);
		((Class282_Sub20_Sub10) this).anIntArray9798 = new int[] { is[0] - is_38_[0] + is[0], is[1] - is_38_[1] + is[1] };
		((Class282_Sub20_Sub10) this).anIntArray9796 = new int[] { is_39_[0] + (is_39_[0] - is_40_[0]), is_39_[1] + (is_39_[1] - is_40_[1]) };
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_41_) {
		if (0 == i) {
			((Class282_Sub20_Sub10) this).anInt9799 = class282_sub35.readUnsignedByte() * 1337254035;
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[class282_sub35.readUnsignedByte()][2];
			for (int i_42_ = 0; (i_42_ < ((Class282_Sub20_Sub10) this).anIntArrayArray9800.length); i_42_++) {
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_42_][0] = class282_sub35.readUnsignedShort();
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_42_][1] = class282_sub35.readUnsignedShort();
			}
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, 424407395);
		if (aClass320_7667.aBool3722) {
			int[] is_43_ = method12317(0, i, 2027688061);
			for (int i_44_ = 0; i_44_ < Class316.anInt3670 * -402153223; i_44_++) {
				int i_45_ = is_43_[i_44_] >> 4;
				if (i_45_ < 0)
					i_45_ = 0;
				if (i_45_ > 256)
					i_45_ = 256;
				is[i_44_] = ((Class282_Sub20_Sub10) this).aShortArray9801[i_45_];
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -133502849);
		if (aClass320_7667.aBool3722) {
			int[] is_46_ = method12317(0, i, 1925640570);
			for (int i_47_ = 0; i_47_ < Class316.anInt3670 * -402153223; i_47_++) {
				int i_48_ = is_46_[i_47_] >> 4;
				if (i_48_ < 0)
					i_48_ = 0;
				if (i_48_ > 256)
					i_48_ = 256;
				is[i_47_] = ((Class282_Sub20_Sub10) this).aShortArray9801[i_48_];
			}
		}
		return is;
	}

	void method12328() {
		if (null == ((Class282_Sub20_Sub10) this).anIntArrayArray9800)
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class282_Sub20_Sub10) this).anIntArrayArray9800.length < 2)
			throw new RuntimeException();
		if (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799 == 2)
			method15259(-938643914);
		Class316.method5586((byte) 13);
		method15258((byte) 16);
	}

	void method12318() {
		if (null == ((Class282_Sub20_Sub10) this).anIntArrayArray9800)
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class282_Sub20_Sub10) this).anIntArrayArray9800.length < 2)
			throw new RuntimeException();
		if (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799 == 2)
			method15259(-938643914);
		Class316.method5586((byte) 44);
		method15258((byte) 16);
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		if (0 == i) {
			((Class282_Sub20_Sub10) this).anInt9799 = class282_sub35.readUnsignedByte() * 1337254035;
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[class282_sub35.readUnsignedByte()][2];
			for (int i_49_ = 0; (i_49_ < ((Class282_Sub20_Sub10) this).anIntArrayArray9800.length); i_49_++) {
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_49_][0] = class282_sub35.readUnsignedShort();
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_49_][1] = class282_sub35.readUnsignedShort();
			}
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		if (0 == i) {
			((Class282_Sub20_Sub10) this).anInt9799 = class282_sub35.readUnsignedByte() * 1337254035;
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[class282_sub35.readUnsignedByte()][2];
			for (int i_50_ = 0; (i_50_ < ((Class282_Sub20_Sub10) this).anIntArrayArray9800.length); i_50_++) {
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_50_][0] = class282_sub35.readUnsignedShort();
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_50_][1] = class282_sub35.readUnsignedShort();
			}
		}
	}

	public Class282_Sub20_Sub10() {
		super(1, true);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		if (0 == i) {
			((Class282_Sub20_Sub10) this).anInt9799 = class282_sub35.readUnsignedByte() * 1337254035;
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[class282_sub35.readUnsignedByte()][2];
			for (int i_51_ = 0; (i_51_ < ((Class282_Sub20_Sub10) this).anIntArrayArray9800.length); i_51_++) {
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_51_][0] = class282_sub35.readUnsignedShort();
				((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_51_][1] = class282_sub35.readUnsignedShort();
			}
		}
	}

	final int[] method15260(int i) {
		if (i < 0)
			return ((Class282_Sub20_Sub10) this).anIntArray9798;
		if (i >= ((Class282_Sub20_Sub10) this).anIntArrayArray9800.length)
			return ((Class282_Sub20_Sub10) this).anIntArray9796;
		return ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i];
	}

	void method12350() {
		if (null == ((Class282_Sub20_Sub10) this).anIntArrayArray9800)
			((Class282_Sub20_Sub10) this).anIntArrayArray9800 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class282_Sub20_Sub10) this).anIntArrayArray9800.length < 2)
			throw new RuntimeException();
		if (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799 == 2)
			method15259(-938643914);
		Class316.method5586((byte) 71);
		method15258((byte) 16);
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -2094253270);
		if (aClass320_7667.aBool3722) {
			int[] is_52_ = method12317(0, i, 2043166811);
			for (int i_53_ = 0; i_53_ < Class316.anInt3670 * -402153223; i_53_++) {
				int i_54_ = is_52_[i_53_] >> 4;
				if (i_54_ < 0)
					i_54_ = 0;
				if (i_54_ > 256)
					i_54_ = 256;
				is[i_53_] = ((Class282_Sub20_Sub10) this).aShortArray9801[i_54_];
			}
		}
		return is;
	}

	void method15261() {
		switch (-1664926309 * ((Class282_Sub20_Sub10) this).anInt9799) {
		case 2:
			for (int i = 0; i < 257; i++) {
				int i_55_ = i << 4;
				int i_56_;
				for (i_56_ = 1; (i_56_ < (((Class282_Sub20_Sub10) this).anIntArrayArray9800).length - 1 && (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_56_][0]) <= i_55_); i_56_++) {
					/* empty */
				}
				int[] is = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_56_ - 1]);
				int[] is_57_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_56_];
				int i_58_ = method15257(i_56_ - 2, 987066353)[1];
				int i_59_ = is[1];
				int i_60_ = is_57_[1];
				int i_61_ = method15257(1 + i_56_, 1430654609)[1];
				int i_62_ = (i_55_ - is[0] << 12) / (is_57_[0] - is[0]);
				int i_63_ = i_62_ * i_62_ >> 12;
				int i_64_ = i_61_ - i_60_ - i_58_ + i_59_;
				int i_65_ = i_58_ - i_59_ - i_64_;
				int i_66_ = i_60_ - i_58_;
				int i_67_ = i_59_;
				int i_68_ = (i_64_ * i_62_ >> 12) * i_63_ >> 12;
				int i_69_ = i_65_ * i_63_ >> 12;
				int i_70_ = i_62_ * i_66_ >> 12;
				int i_71_ = i_68_ + i_69_ + i_70_ + i_67_;
				if (i_71_ <= -32768)
					i_71_ = -32767;
				if (i_71_ >= 32768)
					i_71_ = 32767;
				((Class282_Sub20_Sub10) this).aShortArray9801[i] = (short) i_71_;
			}
			break;
		default:
			for (int i = 0; i < 257; i++) {
				int i_72_ = i << 4;
				int i_73_;
				for (i_73_ = 1; (i_73_ < (((Class282_Sub20_Sub10) this).anIntArrayArray9800).length - 1 && (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_73_][0]) <= i_72_); i_73_++) {
					/* empty */
				}
				int[] is = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_73_ - 1]);
				int[] is_74_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_73_];
				int i_75_ = (i_72_ - is[0] << 12) / (is_74_[0] - is[0]);
				int i_76_ = 4096 - i_75_;
				int i_77_ = i_76_ * is[1] + is_74_[1] * i_75_ >> 12;
				if (i_77_ <= -32768)
					i_77_ = -32767;
				if (i_77_ >= 32768)
					i_77_ = 32767;
				((Class282_Sub20_Sub10) this).aShortArray9801[i] = (short) i_77_;
			}
			break;
		case 1:
			for (int i = 0; i < 257; i++) {
				int i_78_ = i << 4;
				int i_79_;
				for (i_79_ = 1; (i_79_ < (((Class282_Sub20_Sub10) this).anIntArrayArray9800).length - 1 && (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_79_][0]) <= i_78_); i_79_++) {
					/* empty */
				}
				int[] is = (((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_79_ - 1]);
				int[] is_80_ = ((Class282_Sub20_Sub10) this).anIntArrayArray9800[i_79_];
				int i_81_ = (i_78_ - is[0] << 12) / (is_80_[0] - is[0]);
				int i_82_ = 4096 - Class316.anIntArray3675[i_81_ >> 5 & 0xff] >> 1;
				int i_83_ = 4096 - i_82_;
				int i_84_ = i_83_ * is[1] + is_80_[1] * i_82_ >> 12;
				if (i_84_ <= -32768)
					i_84_ = -32767;
				if (i_84_ >= 32768)
					i_84_ = 32767;
				((Class282_Sub20_Sub10) this).aShortArray9801[i] = (short) i_84_;
			}
		}
	}

	static Class282_Sub15_Sub2 method15262(Class282_Sub15_Sub2 class282_sub15_sub2, int i) {
		Class282_Sub15_Sub2 class282_sub15_sub2_85_ = (null == class282_sub15_sub2 ? new Class282_Sub15_Sub2() : new Class282_Sub15_Sub2(class282_sub15_sub2));
		class282_sub15_sub2_85_.method15137(9, 128, -240032763);
		return class282_sub15_sub2_85_;
	}

	public static void method15263(int i, byte i_86_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(2, (long) i);
		class282_sub50_sub12.method14965((byte) 22);
	}
}
