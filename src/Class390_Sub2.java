
/* Class390_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class390_Sub2 extends Class390 {
	static float[] aFloatArray8646 = new float[16];
	int[][][] anIntArrayArrayArray8647;
	Class505_Sub1 aClass505_Sub1_8648;
	int[][][] anIntArrayArrayArray8649;
	int anInt8650;
	int anInt8651;
	int anInt8652;
	short[][] aShortArrayArray8653;
	int anInt8654;
	float[][] aFloatArrayArray8655;
	Class282_Sub3[][][] aClass282_Sub3ArrayArrayArray8656;
	int anInt8657;
	static final int anInt8658 = 1;
	int anInt8659;
	int[][][] anIntArrayArrayArray8660;
	int[][][] anIntArrayArrayArray8661;
	int[][][] anIntArrayArrayArray8662;
	byte[][] aByteArrayArray8663;
	Class130 aClass130_8664;
	int[][][] anIntArrayArrayArray8665;
	Node[] aClass282Array8666;
	Interface14 anInterface14_8667;
	Class143 aClass143_8668;
	Class143 aClass143_8669;
	Class143 aClass143_8670;
	Class143 aClass143_8671;
	int anInt8672;
	XLinkedNodeList aClass473_8673 = new XLinkedNodeList();
	byte[][] aByteArrayArray8674;
	float[][] aFloatArrayArray8675;
	static final int anInt8676 = 74;
	float[][] aFloatArrayArray8677;
	Class453 aClass453_8678;
	int anInt8679;

	void method13879(Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1, int i, int i_0_) {
		int[] is = ((Class390_Sub2) this).anIntArrayArrayArray8661[i][i_0_];
		int[] is_1_ = ((Class390_Sub2) this).anIntArrayArrayArray8660[i][i_0_];
		int i_2_ = is.length;
		if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8500).length < i_2_) {
			((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8500 = new int[i_2_];
			((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8501 = new int[i_2_];
		}
		int[] is_3_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8500);
		int[] is_4_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8501);
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			is_3_[i_5_] = is[i_5_] >> (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8473);
			is_4_[i_5_] = is_1_[i_5_] >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
		}
		int i_6_ = 0;
		while (i_6_ < i_2_) {
			int i_7_ = is_3_[i_6_];
			int i_8_ = is_4_[i_6_++];
			int i_9_ = is_3_[i_6_];
			int i_10_ = is_4_[i_6_++];
			int i_11_ = is_3_[i_6_];
			int i_12_ = is_4_[i_6_++];
			if ((i_7_ - i_9_) * (i_10_ - i_12_) - (i_10_ - i_8_) * (i_11_ - i_9_) > 0)
				class282_sub50_sub17_sub1.method15713(i_8_, i_10_, i_12_, i_7_, i_9_, i_11_);
		}
	}

	public void LA(int i, int i_13_, int i_14_) {
		if ((((Class390_Sub2) this).aByteArrayArray8674[i][i_13_] & 0xff) < i_14_)
			((Class390_Sub2) this).aByteArrayArray8674[i][i_13_] = (byte) i_14_;
	}

	void method13880(Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1, int i, int i_15_) {
		int[] is = ((Class390_Sub2) this).anIntArrayArrayArray8661[i][i_15_];
		int[] is_16_ = ((Class390_Sub2) this).anIntArrayArrayArray8660[i][i_15_];
		int i_17_ = is.length;
		if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8500).length < i_17_) {
			((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8500 = new int[i_17_];
			((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8501 = new int[i_17_];
		}
		int[] is_18_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8500);
		int[] is_19_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8501);
		for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
			is_18_[i_20_] = is[i_20_] >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			is_19_[i_20_] = is_16_[i_20_] >> (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8473);
		}
		int i_21_ = 0;
		while (i_21_ < i_17_) {
			int i_22_ = is_18_[i_21_];
			int i_23_ = is_19_[i_21_++];
			int i_24_ = is_18_[i_21_];
			int i_25_ = is_19_[i_21_++];
			int i_26_ = is_18_[i_21_];
			int i_27_ = is_19_[i_21_++];
			if ((i_22_ - i_24_) * (i_25_ - i_27_) - (i_25_ - i_23_) * (i_26_ - i_24_) > 0)
				class282_sub50_sub17_sub1.method15713(i_23_, i_25_, i_27_, i_22_, i_24_, i_26_);
		}
	}

	public void method6708(int i, int i_28_, int[] is, int[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_, int[] is_38_, Class90 class90, boolean bool) {
		int i_39_ = is_35_.length;
		int[] is_40_ = new int[i_39_ * 3];
		int[] is_41_ = new int[i_39_ * 3];
		int[] is_42_ = new int[i_39_ * 3];
		int[] is_43_ = is_36_ != null ? new int[i_39_ * 3] : null;
		int[] is_44_ = new int[i_39_ * 3];
		int[] is_45_ = new int[i_39_ * 3];
		int[] is_46_ = is_29_ != null ? new int[i_39_ * 3] : null;
		int[] is_47_ = is_31_ != null ? new int[i_39_ * 3] : null;
		int i_48_ = 0;
		for (int i_49_ = 0; i_49_ < i_39_; i_49_++) {
			int i_50_ = is_32_[i_49_];
			int i_51_ = is_33_[i_49_];
			int i_52_ = is_34_[i_49_];
			is_40_[i_48_] = is[i_50_];
			is_41_[i_48_] = is_30_[i_50_];
			is_42_[i_48_] = is_35_[i_49_];
			is_44_[i_48_] = is_37_[i_49_];
			is_45_[i_48_] = is_38_[i_49_];
			if (is_36_ != null)
				is_43_[i_48_] = is_36_[i_49_];
			if (is_29_ != null)
				is_46_[i_48_] = is_29_[i_50_];
			if (is_31_ != null)
				is_47_[i_48_] = is_31_[i_50_];
			i_48_++;
			is_40_[i_48_] = is[i_51_];
			is_41_[i_48_] = is_30_[i_51_];
			is_42_[i_48_] = is_35_[i_49_];
			is_44_[i_48_] = is_37_[i_49_];
			is_45_[i_48_] = is_38_[i_49_];
			if (is_36_ != null)
				is_43_[i_48_] = is_36_[i_49_];
			if (is_29_ != null)
				is_46_[i_48_] = is_29_[i_51_];
			if (is_31_ != null)
				is_47_[i_48_] = is_31_[i_51_];
			i_48_++;
			is_40_[i_48_] = is[i_52_];
			is_41_[i_48_] = is_30_[i_52_];
			is_42_[i_48_] = is_35_[i_49_];
			is_44_[i_48_] = is_37_[i_49_];
			is_45_[i_48_] = is_38_[i_49_];
			if (is_36_ != null)
				is_43_[i_48_] = is_36_[i_49_];
			if (is_29_ != null)
				is_46_[i_48_] = is_29_[i_52_];
			if (is_31_ != null)
				is_47_[i_48_] = is_31_[i_52_];
			i_48_++;
		}
		method6707(i, i_28_, is_40_, is_46_, is_41_, is_47_, is_42_, is_43_, is_44_, is_45_, class90, bool);
	}

	public void method6716(int i, int i_53_, int i_54_, boolean[][] bools, boolean bool, int i_55_) {
		method13881(i, i_53_, i_54_, bools, bool, i_55_);
	}

	void method13881(int i, int i_56_, int i_57_, boolean[][] bools, boolean bool, int i_58_) {
		if (((Class390_Sub2) this).aClass282Array8666 != null) {
			int i_59_ = i_57_ + i_57_ + 1;
			i_59_ *= i_59_;
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502).length < i_59_)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502 = new int[i_59_];
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.buffer).length < ((Class390_Sub2) this).anInt8654 * 2)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1(((Class390_Sub2) this).anInt8654 * 2);
			int i_60_ = i - i_57_;
			int i_61_ = i_60_;
			if (i_60_ < 0)
				i_60_ = 0;
			int i_62_ = i_56_ - i_57_;
			int i_63_ = i_62_;
			if (i_62_ < 0)
				i_62_ = 0;
			int i_64_ = i + i_57_;
			if (i_64_ > anInt4776 * -1843860823 - 1)
				i_64_ = anInt4776 * -1843860823 - 1;
			int i_65_ = i_56_ + i_57_;
			if (i_65_ > anInt4773 * 1826078169 - 1)
				i_65_ = anInt4773 * 1826078169 - 1;
			int i_66_ = 0;
			int[] is = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502);
			for (int i_67_ = i_60_; i_67_ <= i_64_; i_67_++) {
				boolean[] bools_68_ = bools[i_67_ - i_61_];
				for (int i_69_ = i_62_; i_69_ <= i_65_; i_69_++) {
					if (bools_68_[i_69_ - i_63_])
						is[i_66_++] = i_69_ * (anInt4776 * -1843860823) + i_67_;
				}
			}
			((Class390_Sub2) this).aClass505_Sub1_8648.method13607();
			((Class390_Sub2) this).aClass505_Sub1_8648.method13620((((Class390_Sub2) this).anInt8652 & 0x7) != 0);
			for (int i_70_ = 0; i_70_ < ((Class390_Sub2) this).aClass282Array8666.length - 0; i_70_++)
				((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i_70_]).method12085(is, i_66_);
			if (!((Class390_Sub2) this).aClass473_8673.method7861(141891001)) {
				int i_71_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8441);
				int i_72_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8358);
				((Class390_Sub2) this).aClass505_Sub1_8648.c(0, i_72_, ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8378);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13623(false);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13624(128);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13581(-2);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13654(((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass137_Sub1_8460);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13717(8448, 7681);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13595(0, 34166, 770);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13616(0, 34167, 770);
				for (Node class282 = ((Class390_Sub2) this).aClass473_8673.getBack(); class282 != null; class282 = ((Class390_Sub2) this).aClass473_8673.getPrevious()) {
					Class282_Sub19 class282_sub19 = (Class282_Sub19) class282;
					class282_sub19.method12311(i, i_56_, i_57_, bools);
				}
				((Class390_Sub2) this).aClass505_Sub1_8648.method13595(0, 5890, 768);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13616(0, 5890, 770);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13654(null);
				((Class390_Sub2) this).aClass505_Sub1_8648.c(i_71_, i_72_, ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8378);
			}
			if (((Class390_Sub2) this).aClass130_8664 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13647(((Class390_Sub2) this).aClass143_8668, null, null, ((Class390_Sub2) this).aClass143_8671);
				((Class390_Sub2) this).aClass130_8664.method2290(i, i_56_, i_57_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void SA() {
		if (((Class390_Sub2) this).anInt8672 > 0) {
			byte[][] is = (new byte[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
			for (int i = 1; i < anInt4776 * -1843860823; i++) {
				for (int i_73_ = 1; i_73_ < anInt4773 * 1826078169; i_73_++)
					is[i][i_73_] = (byte) (((((Class390_Sub2) this).aByteArrayArray8674[i - 1][i_73_]) >> 2) + ((((Class390_Sub2) this).aByteArrayArray8674[i + 1][i_73_]) >> 3) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_73_ - 1]) >> 2) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_73_ + 1]) >> 3) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_73_]) >> 1));
			}
			((Class390_Sub2) this).aClass282Array8666 = new Node[((Class390_Sub2) this).aClass453_8678.method7540(-975751825)];
			((Class390_Sub2) this).aClass453_8678.method7532(((Class390_Sub2) this).aClass282Array8666, (byte) 45);
			for (int i = 0; i < ((Class390_Sub2) this).aClass282Array8666.length; i++)
				((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i]).method12092(((Class390_Sub2) this).anInt8672);
			int i = 24;
			if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null)
				i += 4;
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aNativeHeap8445.method759(((Class390_Sub2) this).anInt8672 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class282_Sub3[] class282_sub3s = new Class282_Sub3[((Class390_Sub2) this).anInt8672];
			int i_74_ = Class51.method1072(((Class390_Sub2) this).anInt8672 / 4, 1975203630);
			if (i_74_ < 1)
				i_74_ = 1;
			Class453 class453 = new Class453(i_74_);
			Class282_Sub3[] class282_sub3s_75_ = new Class282_Sub3[((Class390_Sub2) this).anInt8659];
			for (int i_76_ = 0; i_76_ < anInt4776 * -1843860823; i_76_++) {
				for (int i_77_ = 0; i_77_ < anInt4773 * 1826078169; i_77_++) {
					if ((((Class390_Sub2) this).anIntArrayArrayArray8647[i_76_][i_77_]) != null) {
						Class282_Sub3[] class282_sub3s_78_ = (((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656[i_76_][i_77_]);
						int[] is_79_ = (((Class390_Sub2) this).anIntArrayArrayArray8661[i_76_][i_77_]);
						int[] is_80_ = (((Class390_Sub2) this).anIntArrayArrayArray8660[i_76_][i_77_]);
						int[] is_81_ = (((Class390_Sub2) this).anIntArrayArrayArray8665[i_76_][i_77_]);
						int[] is_82_ = (((Class390_Sub2) this).anIntArrayArrayArray8647[i_76_][i_77_]);
						int[] is_83_ = ((((Class390_Sub2) this).anIntArrayArrayArray8649 != null) ? (((Class390_Sub2) this).anIntArrayArrayArray8649[i_76_][i_77_]) : null);
						int[] is_84_ = ((((Class390_Sub2) this).anIntArrayArrayArray8662 != null) ? (((Class390_Sub2) this).anIntArrayArrayArray8662[i_76_][i_77_]) : null);
						if (is_81_ == null)
							is_81_ = is_82_;
						float f = (((Class390_Sub2) this).aFloatArrayArray8675[i_76_][i_77_]);
						float f_85_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_76_][i_77_]);
						float f_86_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_76_][i_77_]);
						float f_87_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_76_][i_77_ + 1]);
						float f_88_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_76_][i_77_ + 1]);
						float f_89_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_76_][i_77_ + 1]);
						float f_90_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_76_ + 1][i_77_ + 1]);
						float f_91_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_76_ + 1][i_77_ + 1]);
						float f_92_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_76_ + 1][i_77_ + 1]);
						float f_93_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_76_ + 1][i_77_]);
						float f_94_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_76_ + 1][i_77_]);
						float f_95_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_76_ + 1][i_77_]);
						int i_96_ = is[i_76_][i_77_] & 0xff;
						int i_97_ = is[i_76_][i_77_ + 1] & 0xff;
						int i_98_ = is[i_76_ + 1][i_77_ + 1] & 0xff;
						int i_99_ = is[i_76_ + 1][i_77_] & 0xff;
						int i_100_ = 0;
						while_172_: for (int i_101_ = 0; i_101_ < is_82_.length; i_101_++) {
							Class282_Sub3 class282_sub3 = class282_sub3s_78_[i_101_];
							for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
								if (class282_sub3s_75_[i_102_] == class282_sub3)
									continue while_172_;
							}
							class282_sub3s_75_[i_100_++] = class282_sub3;
						}
						short[] is_103_ = (((Class390_Sub2) this).aShortArrayArray8653[i_77_ * (anInt4776 * -1843860823) + i_76_] = new short[is_82_.length]);
						for (int i_104_ = 0; i_104_ < is_82_.length; i_104_++) {
							int i_105_ = ((i_76_ << anInt4775 * 1856651955) + is_79_[i_104_]);
							int i_106_ = ((i_77_ << anInt4775 * 1856651955) + is_80_[i_104_]);
							int i_107_ = i_105_ >> ((Class390_Sub2) this).anInt8679;
							int i_108_ = i_106_ >> ((Class390_Sub2) this).anInt8679;
							int i_109_ = is_82_[i_104_];
							int i_110_ = is_81_[i_104_];
							int i_111_ = is_83_ != null ? is_83_[i_104_] : 0;
							long l = ((long) i_110_ << 48 | (long) i_109_ << 32 | (long) (i_107_ << 16) | (long) i_108_);
							int i_112_ = is_79_[i_104_];
							int i_113_ = is_80_[i_104_];
							int i_114_ = 74;
							int i_115_ = 0;
							float f_116_ = 1.0F;
							float f_117_;
							float f_118_;
							float f_119_;
							if (i_112_ == 0 && i_113_ == 0) {
								f_117_ = f;
								f_118_ = f_85_;
								f_119_ = f_86_;
								i_114_ -= i_96_;
							} else if (i_112_ == 0 && i_113_ == anInt4774 * 750971439) {
								f_117_ = f_87_;
								f_118_ = f_88_;
								f_119_ = f_89_;
								i_114_ -= i_97_;
							} else if (i_112_ == anInt4774 * 750971439 && i_113_ == anInt4774 * 750971439) {
								f_117_ = f_90_;
								f_118_ = f_91_;
								f_119_ = f_92_;
								i_114_ -= i_98_;
							} else if (i_112_ == anInt4774 * 750971439 && i_113_ == 0) {
								f_117_ = f_93_;
								f_118_ = f_94_;
								f_119_ = f_95_;
								i_114_ -= i_99_;
							} else {
								float f_120_ = ((float) i_112_ / (float) (anInt4774 * 750971439));
								float f_121_ = ((float) i_113_ / (float) (anInt4774 * 750971439));
								float f_122_ = f + (f_93_ - f) * f_120_;
								float f_123_ = f_85_ + (f_94_ - f_85_) * f_120_;
								float f_124_ = f_86_ + (f_95_ - f_86_) * f_120_;
								float f_125_ = f_87_ + (f_90_ - f_87_) * f_120_;
								float f_126_ = f_88_ + (f_91_ - f_88_) * f_120_;
								float f_127_ = f_89_ + (f_92_ - f_89_) * f_120_;
								f_117_ = f_122_ + (f_125_ - f_122_) * f_121_;
								f_118_ = f_123_ + (f_126_ - f_123_) * f_121_;
								f_119_ = f_124_ + (f_127_ - f_124_) * f_121_;
								int i_128_ = i_96_ + ((i_99_ - i_96_) * i_112_ >> anInt4775 * 1856651955);
								int i_129_ = i_97_ + ((i_98_ - i_97_) * i_112_ >> anInt4775 * 1856651955);
								i_114_ -= i_128_ + ((i_129_ - i_128_) * i_113_ >> anInt4775 * 1856651955);
							}
							if (i_109_ != -1) {
								int i_130_ = (i_109_ & 0x7f) * i_114_ >> 7;
								if (i_130_ < 2)
									i_130_ = 2;
								else if (i_130_ > 126)
									i_130_ = 126;
								i_115_ = (Class540.anIntArray7136[i_109_ & 0xff80 | i_130_]);
								if ((((Class390_Sub2) this).anInt8652 & 0x7) == 0) {
									f_116_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[0]) * f_117_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[1]) * f_118_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[2]) * f_119_);
									f_116_ = (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8432 + (f_116_ * (f_116_ > 0.0F ? (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8433) : (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8434))));
								}
							}
							Node class282 = null;
							if ((i_105_ & ((Class390_Sub2) this).anInt8650 - 1) == 0 && ((i_106_ & ((Class390_Sub2) this).anInt8650 - 1) == 0))
								class282 = class453.method7530(l);
							int i_131_;
							if (class282 == null) {
								int i_132_;
								if (i_110_ != i_109_) {
									int i_133_ = (i_110_ & 0x7f) * i_114_ >> 7;
									if (i_133_ < 2)
										i_133_ = 2;
									else if (i_133_ > 126)
										i_133_ = 126;
									i_132_ = (Class540.anIntArray7136[i_110_ & 0xff80 | i_133_]);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) == 0) {
										float f_134_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[0]) * f_117_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[1]) * f_118_ + ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[2]) * f_119_));
										f_134_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8432) + (f_116_ * (f_116_ > 0.0F ? (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8433) : (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8434))));
										int i_135_ = i_132_ >> 16 & 0xff;
										int i_136_ = i_132_ >> 8 & 0xff;
										int i_137_ = i_132_ & 0xff;
										i_135_ *= f_134_;
										if (i_135_ < 0)
											i_135_ = 0;
										else if (i_135_ > 255)
											i_135_ = 255;
										i_136_ *= f_134_;
										if (i_136_ < 0)
											i_136_ = 0;
										else if (i_136_ > 255)
											i_136_ = 255;
										i_137_ *= f_134_;
										if (i_137_ < 0)
											i_137_ = 0;
										else if (i_137_ > 255)
											i_137_ = 255;
										i_132_ = (i_135_ << 16 | i_136_ << 8 | i_137_);
									}
								} else
									i_132_ = i_115_;
								if (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aBool8467) {
									stream.method2923((float) i_105_);
									stream.method2923((float) (method6709(i_105_, i_106_, 1641387909) + i_111_));
									stream.method2923((float) i_106_);
									stream.method2920((byte) (i_132_ >> 16));
									stream.method2920((byte) (i_132_ >> 8));
									stream.method2920((byte) i_132_);
									stream.method2920(-1);
									stream.method2923((float) i_105_);
									stream.method2923((float) i_106_);
									if ((((Class390_Sub2) this).anIntArrayArrayArray8662) != null)
										stream.method2923(is_84_ != null ? (float) ((is_84_[i_104_]) - 1) : 0.0F);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
										stream.method2923(f_117_);
										stream.method2923(f_118_);
										stream.method2923(f_119_);
									}
								} else {
									stream.method2924((float) i_105_);
									stream.method2924((float) (method6709(i_105_, i_106_, -1852341854) + i_111_));
									stream.method2924((float) i_106_);
									stream.method2920((byte) (i_132_ >> 16));
									stream.method2920((byte) (i_132_ >> 8));
									stream.method2920((byte) i_132_);
									stream.method2920(-1);
									stream.method2924((float) i_105_);
									stream.method2924((float) i_106_);
									if ((((Class390_Sub2) this).anIntArrayArrayArray8662) != null)
										stream.method2924(is_84_ != null ? (float) ((is_84_[i_104_]) - 1) : 0.0F);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
										stream.method2924(f_117_);
										stream.method2924(f_118_);
										stream.method2924(f_119_);
									}
								}
								i_131_ = ((Class390_Sub2) this).anInt8657++;
								is_103_[i_104_] = (short) i_131_;
								if (i_109_ != -1)
									class282_sub3s[i_131_] = class282_sub3s_78_[i_104_];
								class453.method7534(new Class282_Sub46(is_103_[i_104_]), l);
							} else {
								is_103_[i_104_] = ((Class282_Sub46) class282).aShort8067;
								i_131_ = is_103_[i_104_] & 0xffff;
								if (i_109_ != -1 && ((class282_sub3s_78_[i_104_].data * -3442165056282524525L) < (class282_sub3s[i_131_].data * -3442165056282524525L)))
									class282_sub3s[i_131_] = class282_sub3s_78_[i_104_];
							}
							for (int i_138_ = 0; i_138_ < i_100_; i_138_++)
								class282_sub3s_75_[i_138_].method12083(i_131_, i_115_, i_114_, f_116_);
							((Class390_Sub2) this).anInt8654++;
						}
					}
				}
			}
			for (int i_139_ = 0; i_139_ < ((Class390_Sub2) this).anInt8657; i_139_++) {
				Class282_Sub3 class282_sub3 = class282_sub3s[i_139_];
				if (class282_sub3 != null)
					class282_sub3.method12081(i_139_);
			}
			for (int i_140_ = 0; i_140_ < anInt4776 * -1843860823; i_140_++) {
				for (int i_141_ = 0; i_141_ < anInt4773 * 1826078169; i_141_++) {
					short[] is_142_ = (((Class390_Sub2) this).aShortArrayArray8653[i_141_ * (anInt4776 * -1843860823) + i_140_]);
					if (is_142_ != null) {
						int i_143_ = 0;
						int i_144_ = 0;
						while (i_144_ < is_142_.length) {
							int i_145_ = is_142_[i_144_++] & 0xffff;
							int i_146_ = is_142_[i_144_++] & 0xffff;
							int i_147_ = is_142_[i_144_++] & 0xffff;
							Class282_Sub3 class282_sub3 = class282_sub3s[i_145_];
							Class282_Sub3 class282_sub3_148_ = class282_sub3s[i_146_];
							Class282_Sub3 class282_sub3_149_ = class282_sub3s[i_147_];
							Class282_Sub3 class282_sub3_150_ = null;
							if (class282_sub3 != null) {
								class282_sub3.method12082(i_140_, i_141_, i_143_);
								class282_sub3_150_ = class282_sub3;
							}
							if (class282_sub3_148_ != null) {
								class282_sub3_148_.method12082(i_140_, i_141_, i_143_);
								if (class282_sub3_150_ == null || ((class282_sub3_148_.data * -3442165056282524525L) < (class282_sub3_150_.data * -3442165056282524525L)))
									class282_sub3_150_ = class282_sub3_148_;
							}
							if (class282_sub3_149_ != null) {
								class282_sub3_149_.method12082(i_140_, i_141_, i_143_);
								if (class282_sub3_150_ == null || ((class282_sub3_149_.data * -3442165056282524525L) < (class282_sub3_150_.data * -3442165056282524525L)))
									class282_sub3_150_ = class282_sub3_149_;
							}
							if (class282_sub3_150_ != null) {
								if (class282_sub3 != null)
									class282_sub3_150_.method12081(i_145_);
								if (class282_sub3_148_ != null)
									class282_sub3_150_.method12081(i_146_);
								if (class282_sub3_149_ != null)
									class282_sub3_150_.method12081(i_147_);
								class282_sub3_150_.method12082(i_140_, i_141_, i_143_);
							}
							i_143_++;
						}
					}
				}
			}
			stream.method2925();
			((Class390_Sub2) this).anInterface14_8667 = (((Class390_Sub2) this).aClass505_Sub1_8648.method13600(i, nativeheapbuffer, stream.method2918(), false));
			if (((Class390_Sub2) this).anInterface14_8667 instanceof Class135_Sub2)
				nativeheapbuffer.method1178();
			((Class390_Sub2) this).aClass143_8668 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, 0);
			((Class390_Sub2) this).aClass143_8669 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5121, 4, 12);
			int i_151_;
			if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null) {
				((Class390_Sub2) this).aClass143_8671 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, 16);
				i_151_ = 28;
			} else {
				((Class390_Sub2) this).aClass143_8671 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 2, 16);
				i_151_ = 24;
			}
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0)
				((Class390_Sub2) this).aClass143_8670 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, i_151_);
			long[] ls = new long[((Class390_Sub2) this).aClass282Array8666.length];
			for (int i_152_ = 0; i_152_ < ((Class390_Sub2) this).aClass282Array8666.length; i_152_++) {
				Class282_Sub3 class282_sub3 = ((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i_152_]);
				ls[i_152_] = class282_sub3.data * -3442165056282524525L;
				class282_sub3.method12087(((Class390_Sub2) this).anInt8657);
			}
			Class214.method3669(ls, ((Class390_Sub2) this).aClass282Array8666, 1513078605);
			if (((Class390_Sub2) this).aClass130_8664 != null)
				((Class390_Sub2) this).aClass130_8664.method2309();
		} else
			((Class390_Sub2) this).aClass130_8664 = null;
		if ((((Class390_Sub2) this).anInt8651 & 0x2) == 0) {
			((Class390_Sub2) this).anIntArrayArrayArray8660 = null;
			((Class390_Sub2) this).anIntArrayArrayArray8661 = null;
			((Class390_Sub2) this).anIntArrayArrayArray8647 = null;
		}
		((Class390_Sub2) this).anIntArrayArrayArray8662 = null;
		((Class390_Sub2) this).anIntArrayArrayArray8665 = null;
		((Class390_Sub2) this).anIntArrayArrayArray8649 = null;
		((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656 = null;
		((Class390_Sub2) this).aByteArrayArray8674 = null;
		((Class390_Sub2) this).aClass453_8678 = null;
		((Class390_Sub2) this).aFloatArrayArray8677 = null;
		((Class390_Sub2) this).aFloatArrayArray8655 = null;
		((Class390_Sub2) this).aFloatArrayArray8675 = null;
	}

	public void method6715(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, boolean[][] bools) {
		Class158 class158 = ((Class390_Sub2) this).aClass505_Sub1_8648.method8523((byte) 123);
		if (((Class390_Sub2) this).anInt8672 > 0 && class158 != null) {
			((Class390_Sub2) this).aClass505_Sub1_8648.method13586();
			((Class390_Sub2) this).aClass505_Sub1_8648.method13642(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13656(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13623(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13624(0);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13581(-2);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13654(null);
			aFloatArray8646[0] = (float) i_154_ / (128.0F * (float) (anInt4774 * 750971439) * (float) class158.method2714());
			aFloatArray8646[1] = 0.0F;
			aFloatArray8646[2] = 0.0F;
			aFloatArray8646[3] = 0.0F;
			aFloatArray8646[4] = 0.0F;
			aFloatArray8646[5] = (float) i_154_ / (128.0F * (float) (anInt4774 * 750971439) * (float) class158.method2716());
			aFloatArray8646[6] = 0.0F;
			aFloatArray8646[7] = 0.0F;
			aFloatArray8646[8] = 0.0F;
			aFloatArray8646[9] = 0.0F;
			aFloatArray8646[10] = 0.0F;
			aFloatArray8646[11] = 0.0F;
			aFloatArray8646[12] = -1.0F - ((float) (i_155_ * i_154_) / 128.0F - (float) (i * 2)) / (float) class158.method2714();
			aFloatArray8646[13] = 1.0F - (((float) (2 * i_153_) + (float) (i_158_ * i_154_) / 128.0F) / (float) class158.method2716());
			aFloatArray8646[14] = 0.0F;
			aFloatArray8646[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8646, 0);
			aFloatArray8646[0] = 1.0F;
			aFloatArray8646[1] = 0.0F;
			aFloatArray8646[2] = 0.0F;
			aFloatArray8646[3] = 0.0F;
			aFloatArray8646[4] = 0.0F;
			aFloatArray8646[5] = 0.0F;
			aFloatArray8646[6] = 1.0F;
			aFloatArray8646[7] = 0.0F;
			aFloatArray8646[8] = 0.0F;
			aFloatArray8646[9] = 1.0F;
			aFloatArray8646[10] = 0.0F;
			aFloatArray8646[11] = 0.0F;
			aFloatArray8646[12] = 0.0F;
			aFloatArray8646[13] = 0.0F;
			aFloatArray8646[14] = 0.0F;
			aFloatArray8646[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8646, 0);
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(true);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13593();
			} else
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13647(((Class390_Sub2) this).aClass143_8668, ((Class390_Sub2) this).aClass143_8670, ((Class390_Sub2) this).aClass143_8669, ((Class390_Sub2) this).aClass143_8671);
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.buffer).length < ((Class390_Sub2) this).anInt8654 * 2)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1(((Class390_Sub2) this).anInt8654 * 2);
			else
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.index = 0;
			int i_159_ = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499);
			if (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aBool8467) {
				for (int i_160_ = i_156_; i_160_ < i_158_; i_160_++) {
					int i_161_ = i_160_ * (anInt4776 * -1843860823) + i_155_;
					for (int i_162_ = i_155_; i_162_ < i_157_; i_162_++) {
						if (bools[i_162_ - i_155_][i_160_ - i_156_]) {
							short[] is = (((Class390_Sub2) this).aShortArrayArray8653[i_161_]);
							if (is != null) {
								for (int i_163_ = 0; i_163_ < is.length; i_163_++) {
									class282_sub35_sub1.writeShort(is[i_163_] & 0xffff, 1417031095);
									i_159_++;
								}
							}
						}
						i_161_++;
					}
				}
			} else {
				for (int i_164_ = i_156_; i_164_ < i_158_; i_164_++) {
					int i_165_ = i_164_ * (anInt4776 * -1843860823) + i_155_;
					for (int i_166_ = i_155_; i_166_ < i_157_; i_166_++) {
						if (bools[i_166_ - i_155_][i_164_ - i_156_]) {
							short[] is = (((Class390_Sub2) this).aShortArrayArray8653[i_165_]);
							if (is != null) {
								for (int i_167_ = 0; i_167_ < is.length; i_167_++) {
									class282_sub35_sub1.writeLEShort(is[i_167_] & 0xffff, (byte) -40);
									i_159_++;
								}
							}
						}
						i_165_++;
					}
				}
			}
			if (i_159_ > 0) {
				Class131_Sub2 class131_sub2 = new Class131_Sub2((((Class390_Sub2) this).aClass505_Sub1_8648), 5123, class282_sub35_sub1.buffer, (class282_sub35_sub1.index * -1990677291));
				((Class390_Sub2) this).aClass505_Sub1_8648.method13611(class131_sub2, 4, 0, i_159_);
			}
		}
	}

	public void UA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_168_, int i_169_, int i_170_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_171_ = (i - (i_168_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_172_ = (i_169_ - (i_168_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2314(class282_sub50_sub17, i_171_, i_172_);
		}
	}

	public boolean method6712(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_173_, int i_174_, int i_175_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 == null || class282_sub50_sub17 == null)
			return false;
		int i_176_ = (i - (i_173_ * ((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8438 >> 8) >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		int i_177_ = (i_174_ - (i_173_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8439) >> 8) >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		return ((Class390_Sub2) this).aClass130_8664.method2293(class282_sub50_sub17, i_176_, i_177_);
	}

	void method13882(int i, int i_178_, int i_179_, boolean[][] bools, boolean bool, int i_180_) {
		if (((Class390_Sub2) this).aClass282Array8666 != null) {
			int i_181_ = i_179_ + i_179_ + 1;
			i_181_ *= i_181_;
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502).length < i_181_)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502 = new int[i_181_];
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.buffer).length < ((Class390_Sub2) this).anInt8654 * 2)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1(((Class390_Sub2) this).anInt8654 * 2);
			int i_182_ = i - i_179_;
			int i_183_ = i_182_;
			if (i_182_ < 0)
				i_182_ = 0;
			int i_184_ = i_178_ - i_179_;
			int i_185_ = i_184_;
			if (i_184_ < 0)
				i_184_ = 0;
			int i_186_ = i + i_179_;
			if (i_186_ > anInt4776 * -1843860823 - 1)
				i_186_ = anInt4776 * -1843860823 - 1;
			int i_187_ = i_178_ + i_179_;
			if (i_187_ > anInt4773 * 1826078169 - 1)
				i_187_ = anInt4773 * 1826078169 - 1;
			int i_188_ = 0;
			int[] is = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502);
			for (int i_189_ = i_182_; i_189_ <= i_186_; i_189_++) {
				boolean[] bools_190_ = bools[i_189_ - i_183_];
				for (int i_191_ = i_184_; i_191_ <= i_187_; i_191_++) {
					if (bools_190_[i_191_ - i_185_])
						is[i_188_++] = i_191_ * (anInt4776 * -1843860823) + i_189_;
				}
			}
			((Class390_Sub2) this).aClass505_Sub1_8648.method13607();
			((Class390_Sub2) this).aClass505_Sub1_8648.method13620((((Class390_Sub2) this).anInt8652 & 0x7) != 0);
			for (int i_192_ = 0; i_192_ < ((Class390_Sub2) this).aClass282Array8666.length - 0; i_192_++)
				((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i_192_]).method12085(is, i_188_);
			if (!((Class390_Sub2) this).aClass473_8673.method7861(141891001)) {
				int i_193_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8441);
				int i_194_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8358);
				((Class390_Sub2) this).aClass505_Sub1_8648.c(0, i_194_, ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8378);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13623(false);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13624(128);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13581(-2);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13654(((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass137_Sub1_8460);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13717(8448, 7681);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13595(0, 34166, 770);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13616(0, 34167, 770);
				for (Node class282 = ((Class390_Sub2) this).aClass473_8673.getBack(); class282 != null; class282 = ((Class390_Sub2) this).aClass473_8673.getPrevious()) {
					Class282_Sub19 class282_sub19 = (Class282_Sub19) class282;
					class282_sub19.method12311(i, i_178_, i_179_, bools);
				}
				((Class390_Sub2) this).aClass505_Sub1_8648.method13595(0, 5890, 768);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13616(0, 5890, 770);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13654(null);
				((Class390_Sub2) this).aClass505_Sub1_8648.c(i_193_, i_194_, ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8378);
			}
			if (((Class390_Sub2) this).aClass130_8664 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13647(((Class390_Sub2) this).aClass143_8668, null, null, ((Class390_Sub2) this).aClass143_8671);
				((Class390_Sub2) this).aClass130_8664.method2290(i, i_178_, i_179_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void NA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_195_, int i_196_, int i_197_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_198_ = (i - (i_195_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_199_ = (i_196_ - (i_195_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2313(class282_sub50_sub17, i_198_, i_199_);
		}
	}

	public void method6713(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub2) this).aClass473_8673.insertBack(new Class282_Sub19(((Class390_Sub2) this).aClass505_Sub1_8648, this, class282_sub24, is));
	}

	public void method6707(int i, int i_200_, int[] is, int[] is_201_, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, Class90 class90, boolean bool) {
		Interface22 interface22 = ((Class390_Sub2) this).aClass505_Sub1_8648.anInterface22_5834;
		if (is_203_ != null && ((Class390_Sub2) this).anIntArrayArrayArray8662 == null)
			((Class390_Sub2) this).anIntArrayArrayArray8662 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		if (is_201_ != null && ((Class390_Sub2) this).anIntArrayArrayArray8649 == null)
			((Class390_Sub2) this).anIntArrayArrayArray8649 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		((Class390_Sub2) this).anIntArrayArrayArray8661[i][i_200_] = is;
		((Class390_Sub2) this).anIntArrayArrayArray8660[i][i_200_] = is_202_;
		((Class390_Sub2) this).anIntArrayArrayArray8647[i][i_200_] = is_204_;
		((Class390_Sub2) this).anIntArrayArrayArray8665[i][i_200_] = is_205_;
		if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null)
			((Class390_Sub2) this).anIntArrayArrayArray8662[i][i_200_] = is_203_;
		if (((Class390_Sub2) this).anIntArrayArrayArray8649 != null)
			((Class390_Sub2) this).anIntArrayArrayArray8649[i][i_200_] = is_201_;
		Class282_Sub3[] class282_sub3s = (((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656[i][i_200_] = new Class282_Sub3[is_204_.length]);
		for (int i_208_ = 0; i_208_ < is_204_.length; i_208_++) {
			int i_209_ = is_206_[i_208_];
			int i_210_ = is_207_[i_208_];
			if ((((Class390_Sub2) this).anInt8652 & 0x20) != 0 && i_209_ != -1 && interface22.method144(i_209_, -2043005984).aBool2056) {
				i_210_ = 128;
				i_209_ = -1;
			}
			long l = ((long) (class90.anInt947 * -732614481) << 48 | (long) (class90.anInt945 * 973144081) << 42 | (long) (class90.anInt946 * 1152775735) << 28 | (long) (i_210_ << 14) | (long) i_209_);
			Node class282;
			for (class282 = ((Class390_Sub2) this).aClass453_8678.method7530(l); class282 != null; class282 = ((Class390_Sub2) this).aClass453_8678.method7544(1982653237)) {
				Class282_Sub3 class282_sub3 = (Class282_Sub3) class282;
				if (((Class282_Sub3) class282_sub3).anInt7493 == i_209_ && (((Class282_Sub3) class282_sub3).aFloat7490 == (float) i_210_) && ((Class282_Sub3) class282_sub3).aClass90_7487.method1506(class90, 1457774218))
					break;
			}
			if (class282 == null) {
				class282_sub3s[i_208_] = new Class282_Sub3(this, i_209_, i_210_, class90);
				((Class390_Sub2) this).aClass453_8678.method7534(class282_sub3s[i_208_], l);
			} else
				class282_sub3s[i_208_] = (Class282_Sub3) class282;
		}
		if (bool)
			((Class390_Sub2) this).aByteArrayArray8663[i][i_200_] |= 0x1;
		if (is_204_.length > ((Class390_Sub2) this).anInt8659)
			((Class390_Sub2) this).anInt8659 = is_204_.length;
		((Class390_Sub2) this).anInt8672 += is_204_.length;
	}

	public void m(int i, int i_211_, int i_212_) {
		if ((((Class390_Sub2) this).aByteArrayArray8674[i][i_211_] & 0xff) < i_212_)
			((Class390_Sub2) this).aByteArrayArray8674[i][i_211_] = (byte) i_212_;
	}

	public void method6714(int i, int i_213_, int[] is, int[] is_214_, int[] is_215_, int[] is_216_, int[] is_217_, int[] is_218_, int[] is_219_, int[] is_220_, int[] is_221_, int[] is_222_, int[] is_223_, Class90 class90, boolean bool) {
		int i_224_ = is_220_.length;
		int[] is_225_ = new int[i_224_ * 3];
		int[] is_226_ = new int[i_224_ * 3];
		int[] is_227_ = new int[i_224_ * 3];
		int[] is_228_ = is_221_ != null ? new int[i_224_ * 3] : null;
		int[] is_229_ = new int[i_224_ * 3];
		int[] is_230_ = new int[i_224_ * 3];
		int[] is_231_ = is_214_ != null ? new int[i_224_ * 3] : null;
		int[] is_232_ = is_216_ != null ? new int[i_224_ * 3] : null;
		int i_233_ = 0;
		for (int i_234_ = 0; i_234_ < i_224_; i_234_++) {
			int i_235_ = is_217_[i_234_];
			int i_236_ = is_218_[i_234_];
			int i_237_ = is_219_[i_234_];
			is_225_[i_233_] = is[i_235_];
			is_226_[i_233_] = is_215_[i_235_];
			is_227_[i_233_] = is_220_[i_234_];
			is_229_[i_233_] = is_222_[i_234_];
			is_230_[i_233_] = is_223_[i_234_];
			if (is_221_ != null)
				is_228_[i_233_] = is_221_[i_234_];
			if (is_214_ != null)
				is_231_[i_233_] = is_214_[i_235_];
			if (is_216_ != null)
				is_232_[i_233_] = is_216_[i_235_];
			i_233_++;
			is_225_[i_233_] = is[i_236_];
			is_226_[i_233_] = is_215_[i_236_];
			is_227_[i_233_] = is_220_[i_234_];
			is_229_[i_233_] = is_222_[i_234_];
			is_230_[i_233_] = is_223_[i_234_];
			if (is_221_ != null)
				is_228_[i_233_] = is_221_[i_234_];
			if (is_214_ != null)
				is_231_[i_233_] = is_214_[i_236_];
			if (is_216_ != null)
				is_232_[i_233_] = is_216_[i_236_];
			i_233_++;
			is_225_[i_233_] = is[i_237_];
			is_226_[i_233_] = is_215_[i_237_];
			is_227_[i_233_] = is_220_[i_234_];
			is_229_[i_233_] = is_222_[i_234_];
			is_230_[i_233_] = is_223_[i_234_];
			if (is_221_ != null)
				is_228_[i_233_] = is_221_[i_234_];
			if (is_214_ != null)
				is_231_[i_233_] = is_214_[i_237_];
			if (is_216_ != null)
				is_232_[i_233_] = is_216_[i_237_];
			i_233_++;
		}
		method6707(i, i_213_, is_225_, is_231_, is_226_, is_232_, is_227_, is_228_, is_229_, is_230_, class90, bool);
	}

	public void method6706(int i, int i_238_, int[] is, int[] is_239_, int[] is_240_, int[] is_241_, int[] is_242_, int[] is_243_, int[] is_244_, int[] is_245_, Class90 class90, boolean bool) {
		Interface22 interface22 = ((Class390_Sub2) this).aClass505_Sub1_8648.anInterface22_5834;
		if (is_241_ != null && ((Class390_Sub2) this).anIntArrayArrayArray8662 == null)
			((Class390_Sub2) this).anIntArrayArrayArray8662 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		if (is_239_ != null && ((Class390_Sub2) this).anIntArrayArrayArray8649 == null)
			((Class390_Sub2) this).anIntArrayArrayArray8649 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		((Class390_Sub2) this).anIntArrayArrayArray8661[i][i_238_] = is;
		((Class390_Sub2) this).anIntArrayArrayArray8660[i][i_238_] = is_240_;
		((Class390_Sub2) this).anIntArrayArrayArray8647[i][i_238_] = is_242_;
		((Class390_Sub2) this).anIntArrayArrayArray8665[i][i_238_] = is_243_;
		if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null)
			((Class390_Sub2) this).anIntArrayArrayArray8662[i][i_238_] = is_241_;
		if (((Class390_Sub2) this).anIntArrayArrayArray8649 != null)
			((Class390_Sub2) this).anIntArrayArrayArray8649[i][i_238_] = is_239_;
		Class282_Sub3[] class282_sub3s = (((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656[i][i_238_] = new Class282_Sub3[is_242_.length]);
		for (int i_246_ = 0; i_246_ < is_242_.length; i_246_++) {
			int i_247_ = is_244_[i_246_];
			int i_248_ = is_245_[i_246_];
			if ((((Class390_Sub2) this).anInt8652 & 0x20) != 0 && i_247_ != -1 && interface22.method144(i_247_, -1841281080).aBool2056) {
				i_248_ = 128;
				i_247_ = -1;
			}
			long l = ((long) (class90.anInt947 * -732614481) << 48 | (long) (class90.anInt945 * 973144081) << 42 | (long) (class90.anInt946 * 1152775735) << 28 | (long) (i_248_ << 14) | (long) i_247_);
			Node class282;
			for (class282 = ((Class390_Sub2) this).aClass453_8678.method7530(l); class282 != null; class282 = ((Class390_Sub2) this).aClass453_8678.method7544(1204674199)) {
				Class282_Sub3 class282_sub3 = (Class282_Sub3) class282;
				if (((Class282_Sub3) class282_sub3).anInt7493 == i_247_ && (((Class282_Sub3) class282_sub3).aFloat7490 == (float) i_248_) && ((Class282_Sub3) class282_sub3).aClass90_7487.method1506(class90, 1785628838))
					break;
			}
			if (class282 == null) {
				class282_sub3s[i_246_] = new Class282_Sub3(this, i_247_, i_248_, class90);
				((Class390_Sub2) this).aClass453_8678.method7534(class282_sub3s[i_246_], l);
			} else
				class282_sub3s[i_246_] = (Class282_Sub3) class282;
		}
		if (bool)
			((Class390_Sub2) this).aByteArrayArray8663[i][i_238_] |= 0x1;
		if (is_242_.length > ((Class390_Sub2) this).anInt8659)
			((Class390_Sub2) this).anInt8659 = is_242_.length;
		((Class390_Sub2) this).anInt8672 += is_242_.length;
	}

	public void p() {
		if (((Class390_Sub2) this).anInt8672 > 0) {
			byte[][] is = (new byte[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
			for (int i = 1; i < anInt4776 * -1843860823; i++) {
				for (int i_249_ = 1; i_249_ < anInt4773 * 1826078169; i_249_++)
					is[i][i_249_] = (byte) (((((Class390_Sub2) this).aByteArrayArray8674[i - 1][i_249_]) >> 2) + ((((Class390_Sub2) this).aByteArrayArray8674[i + 1][i_249_]) >> 3) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_249_ - 1]) >> 2) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_249_ + 1]) >> 3) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_249_]) >> 1));
			}
			((Class390_Sub2) this).aClass282Array8666 = new Node[((Class390_Sub2) this).aClass453_8678.method7540(-975751825)];
			((Class390_Sub2) this).aClass453_8678.method7532(((Class390_Sub2) this).aClass282Array8666, (byte) 58);
			for (int i = 0; i < ((Class390_Sub2) this).aClass282Array8666.length; i++)
				((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i]).method12092(((Class390_Sub2) this).anInt8672);
			int i = 24;
			if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null)
				i += 4;
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aNativeHeap8445.method759(((Class390_Sub2) this).anInt8672 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class282_Sub3[] class282_sub3s = new Class282_Sub3[((Class390_Sub2) this).anInt8672];
			int i_250_ = Class51.method1072(((Class390_Sub2) this).anInt8672 / 4, 1405051640);
			if (i_250_ < 1)
				i_250_ = 1;
			Class453 class453 = new Class453(i_250_);
			Class282_Sub3[] class282_sub3s_251_ = new Class282_Sub3[((Class390_Sub2) this).anInt8659];
			for (int i_252_ = 0; i_252_ < anInt4776 * -1843860823; i_252_++) {
				for (int i_253_ = 0; i_253_ < anInt4773 * 1826078169; i_253_++) {
					if ((((Class390_Sub2) this).anIntArrayArrayArray8647[i_252_][i_253_]) != null) {
						Class282_Sub3[] class282_sub3s_254_ = (((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656[i_252_][i_253_]);
						int[] is_255_ = (((Class390_Sub2) this).anIntArrayArrayArray8661[i_252_][i_253_]);
						int[] is_256_ = (((Class390_Sub2) this).anIntArrayArrayArray8660[i_252_][i_253_]);
						int[] is_257_ = (((Class390_Sub2) this).anIntArrayArrayArray8665[i_252_][i_253_]);
						int[] is_258_ = (((Class390_Sub2) this).anIntArrayArrayArray8647[i_252_][i_253_]);
						int[] is_259_ = ((((Class390_Sub2) this).anIntArrayArrayArray8649 != null) ? (((Class390_Sub2) this).anIntArrayArrayArray8649[i_252_][i_253_]) : null);
						int[] is_260_ = ((((Class390_Sub2) this).anIntArrayArrayArray8662 != null) ? (((Class390_Sub2) this).anIntArrayArrayArray8662[i_252_][i_253_]) : null);
						if (is_257_ == null)
							is_257_ = is_258_;
						float f = (((Class390_Sub2) this).aFloatArrayArray8675[i_252_][i_253_]);
						float f_261_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_252_][i_253_]);
						float f_262_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_252_][i_253_]);
						float f_263_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_252_][i_253_ + 1]);
						float f_264_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_252_][i_253_ + 1]);
						float f_265_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_252_][i_253_ + 1]);
						float f_266_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_252_ + 1][i_253_ + 1]);
						float f_267_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_252_ + 1][i_253_ + 1]);
						float f_268_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_252_ + 1][i_253_ + 1]);
						float f_269_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_252_ + 1][i_253_]);
						float f_270_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_252_ + 1][i_253_]);
						float f_271_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_252_ + 1][i_253_]);
						int i_272_ = is[i_252_][i_253_] & 0xff;
						int i_273_ = is[i_252_][i_253_ + 1] & 0xff;
						int i_274_ = is[i_252_ + 1][i_253_ + 1] & 0xff;
						int i_275_ = is[i_252_ + 1][i_253_] & 0xff;
						int i_276_ = 0;
						while_174_: for (int i_277_ = 0; i_277_ < is_258_.length; i_277_++) {
							Class282_Sub3 class282_sub3 = class282_sub3s_254_[i_277_];
							for (int i_278_ = 0; i_278_ < i_276_; i_278_++) {
								if (class282_sub3s_251_[i_278_] == class282_sub3)
									continue while_174_;
							}
							class282_sub3s_251_[i_276_++] = class282_sub3;
						}
						short[] is_279_ = (((Class390_Sub2) this).aShortArrayArray8653[(i_253_ * (anInt4776 * -1843860823) + i_252_)] = new short[is_258_.length]);
						for (int i_280_ = 0; i_280_ < is_258_.length; i_280_++) {
							int i_281_ = ((i_252_ << anInt4775 * 1856651955) + is_255_[i_280_]);
							int i_282_ = ((i_253_ << anInt4775 * 1856651955) + is_256_[i_280_]);
							int i_283_ = i_281_ >> ((Class390_Sub2) this).anInt8679;
							int i_284_ = i_282_ >> ((Class390_Sub2) this).anInt8679;
							int i_285_ = is_258_[i_280_];
							int i_286_ = is_257_[i_280_];
							int i_287_ = is_259_ != null ? is_259_[i_280_] : 0;
							long l = ((long) i_286_ << 48 | (long) i_285_ << 32 | (long) (i_283_ << 16) | (long) i_284_);
							int i_288_ = is_255_[i_280_];
							int i_289_ = is_256_[i_280_];
							int i_290_ = 74;
							int i_291_ = 0;
							float f_292_ = 1.0F;
							float f_293_;
							float f_294_;
							float f_295_;
							if (i_288_ == 0 && i_289_ == 0) {
								f_293_ = f;
								f_294_ = f_261_;
								f_295_ = f_262_;
								i_290_ -= i_272_;
							} else if (i_288_ == 0 && i_289_ == anInt4774 * 750971439) {
								f_293_ = f_263_;
								f_294_ = f_264_;
								f_295_ = f_265_;
								i_290_ -= i_273_;
							} else if (i_288_ == anInt4774 * 750971439 && i_289_ == anInt4774 * 750971439) {
								f_293_ = f_266_;
								f_294_ = f_267_;
								f_295_ = f_268_;
								i_290_ -= i_274_;
							} else if (i_288_ == anInt4774 * 750971439 && i_289_ == 0) {
								f_293_ = f_269_;
								f_294_ = f_270_;
								f_295_ = f_271_;
								i_290_ -= i_275_;
							} else {
								float f_296_ = ((float) i_288_ / (float) (anInt4774 * 750971439));
								float f_297_ = ((float) i_289_ / (float) (anInt4774 * 750971439));
								float f_298_ = f + (f_269_ - f) * f_296_;
								float f_299_ = f_261_ + (f_270_ - f_261_) * f_296_;
								float f_300_ = f_262_ + (f_271_ - f_262_) * f_296_;
								float f_301_ = f_263_ + (f_266_ - f_263_) * f_296_;
								float f_302_ = f_264_ + (f_267_ - f_264_) * f_296_;
								float f_303_ = f_265_ + (f_268_ - f_265_) * f_296_;
								f_293_ = f_298_ + (f_301_ - f_298_) * f_297_;
								f_294_ = f_299_ + (f_302_ - f_299_) * f_297_;
								f_295_ = f_300_ + (f_303_ - f_300_) * f_297_;
								int i_304_ = i_272_ + ((i_275_ - i_272_) * i_288_ >> anInt4775 * 1856651955);
								int i_305_ = i_273_ + ((i_274_ - i_273_) * i_288_ >> anInt4775 * 1856651955);
								i_290_ -= i_304_ + ((i_305_ - i_304_) * i_289_ >> anInt4775 * 1856651955);
							}
							if (i_285_ != -1) {
								int i_306_ = (i_285_ & 0x7f) * i_290_ >> 7;
								if (i_306_ < 2)
									i_306_ = 2;
								else if (i_306_ > 126)
									i_306_ = 126;
								i_291_ = (Class540.anIntArray7136[i_285_ & 0xff80 | i_306_]);
								if ((((Class390_Sub2) this).anInt8652 & 0x7) == 0) {
									f_292_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[0]) * f_293_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[1]) * f_294_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[2]) * f_295_);
									f_292_ = (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8432 + (f_292_ * (f_292_ > 0.0F ? (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8433) : (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8434))));
								}
							}
							Node class282 = null;
							if ((i_281_ & ((Class390_Sub2) this).anInt8650 - 1) == 0 && ((i_282_ & ((Class390_Sub2) this).anInt8650 - 1) == 0))
								class282 = class453.method7530(l);
							int i_307_;
							if (class282 == null) {
								int i_308_;
								if (i_286_ != i_285_) {
									int i_309_ = (i_286_ & 0x7f) * i_290_ >> 7;
									if (i_309_ < 2)
										i_309_ = 2;
									else if (i_309_ > 126)
										i_309_ = 126;
									i_308_ = (Class540.anIntArray7136[i_286_ & 0xff80 | i_309_]);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) == 0) {
										float f_310_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[0]) * f_293_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[1]) * f_294_ + ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[2]) * f_295_));
										f_310_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8432) + (f_292_ * (f_292_ > 0.0F ? (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8433) : (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8434))));
										int i_311_ = i_308_ >> 16 & 0xff;
										int i_312_ = i_308_ >> 8 & 0xff;
										int i_313_ = i_308_ & 0xff;
										i_311_ *= f_310_;
										if (i_311_ < 0)
											i_311_ = 0;
										else if (i_311_ > 255)
											i_311_ = 255;
										i_312_ *= f_310_;
										if (i_312_ < 0)
											i_312_ = 0;
										else if (i_312_ > 255)
											i_312_ = 255;
										i_313_ *= f_310_;
										if (i_313_ < 0)
											i_313_ = 0;
										else if (i_313_ > 255)
											i_313_ = 255;
										i_308_ = (i_311_ << 16 | i_312_ << 8 | i_313_);
									}
								} else
									i_308_ = i_291_;
								if (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aBool8467) {
									stream.method2923((float) i_281_);
									stream.method2923((float) (method6709(i_281_, i_282_, 1231325489) + i_287_));
									stream.method2923((float) i_282_);
									stream.method2920((byte) (i_308_ >> 16));
									stream.method2920((byte) (i_308_ >> 8));
									stream.method2920((byte) i_308_);
									stream.method2920(-1);
									stream.method2923((float) i_281_);
									stream.method2923((float) i_282_);
									if ((((Class390_Sub2) this).anIntArrayArrayArray8662) != null)
										stream.method2923(is_260_ != null ? (float) ((is_260_[i_280_]) - 1) : 0.0F);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
										stream.method2923(f_293_);
										stream.method2923(f_294_);
										stream.method2923(f_295_);
									}
								} else {
									stream.method2924((float) i_281_);
									stream.method2924((float) (method6709(i_281_, i_282_, 1313954574) + i_287_));
									stream.method2924((float) i_282_);
									stream.method2920((byte) (i_308_ >> 16));
									stream.method2920((byte) (i_308_ >> 8));
									stream.method2920((byte) i_308_);
									stream.method2920(-1);
									stream.method2924((float) i_281_);
									stream.method2924((float) i_282_);
									if ((((Class390_Sub2) this).anIntArrayArrayArray8662) != null)
										stream.method2924(is_260_ != null ? (float) ((is_260_[i_280_]) - 1) : 0.0F);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
										stream.method2924(f_293_);
										stream.method2924(f_294_);
										stream.method2924(f_295_);
									}
								}
								i_307_ = ((Class390_Sub2) this).anInt8657++;
								is_279_[i_280_] = (short) i_307_;
								if (i_285_ != -1)
									class282_sub3s[i_307_] = class282_sub3s_254_[i_280_];
								class453.method7534(new Class282_Sub46(is_279_[i_280_]), l);
							} else {
								is_279_[i_280_] = ((Class282_Sub46) class282).aShort8067;
								i_307_ = is_279_[i_280_] & 0xffff;
								if (i_285_ != -1 && ((class282_sub3s_254_[i_280_].data * -3442165056282524525L) < (class282_sub3s[i_307_].data * -3442165056282524525L)))
									class282_sub3s[i_307_] = class282_sub3s_254_[i_280_];
							}
							for (int i_314_ = 0; i_314_ < i_276_; i_314_++)
								class282_sub3s_251_[i_314_].method12083(i_307_, i_291_, i_290_, f_292_);
							((Class390_Sub2) this).anInt8654++;
						}
					}
				}
			}
			for (int i_315_ = 0; i_315_ < ((Class390_Sub2) this).anInt8657; i_315_++) {
				Class282_Sub3 class282_sub3 = class282_sub3s[i_315_];
				if (class282_sub3 != null)
					class282_sub3.method12081(i_315_);
			}
			for (int i_316_ = 0; i_316_ < anInt4776 * -1843860823; i_316_++) {
				for (int i_317_ = 0; i_317_ < anInt4773 * 1826078169; i_317_++) {
					short[] is_318_ = (((Class390_Sub2) this).aShortArrayArray8653[i_317_ * (anInt4776 * -1843860823) + i_316_]);
					if (is_318_ != null) {
						int i_319_ = 0;
						int i_320_ = 0;
						while (i_320_ < is_318_.length) {
							int i_321_ = is_318_[i_320_++] & 0xffff;
							int i_322_ = is_318_[i_320_++] & 0xffff;
							int i_323_ = is_318_[i_320_++] & 0xffff;
							Class282_Sub3 class282_sub3 = class282_sub3s[i_321_];
							Class282_Sub3 class282_sub3_324_ = class282_sub3s[i_322_];
							Class282_Sub3 class282_sub3_325_ = class282_sub3s[i_323_];
							Class282_Sub3 class282_sub3_326_ = null;
							if (class282_sub3 != null) {
								class282_sub3.method12082(i_316_, i_317_, i_319_);
								class282_sub3_326_ = class282_sub3;
							}
							if (class282_sub3_324_ != null) {
								class282_sub3_324_.method12082(i_316_, i_317_, i_319_);
								if (class282_sub3_326_ == null || ((class282_sub3_324_.data * -3442165056282524525L) < (class282_sub3_326_.data * -3442165056282524525L)))
									class282_sub3_326_ = class282_sub3_324_;
							}
							if (class282_sub3_325_ != null) {
								class282_sub3_325_.method12082(i_316_, i_317_, i_319_);
								if (class282_sub3_326_ == null || ((class282_sub3_325_.data * -3442165056282524525L) < (class282_sub3_326_.data * -3442165056282524525L)))
									class282_sub3_326_ = class282_sub3_325_;
							}
							if (class282_sub3_326_ != null) {
								if (class282_sub3 != null)
									class282_sub3_326_.method12081(i_321_);
								if (class282_sub3_324_ != null)
									class282_sub3_326_.method12081(i_322_);
								if (class282_sub3_325_ != null)
									class282_sub3_326_.method12081(i_323_);
								class282_sub3_326_.method12082(i_316_, i_317_, i_319_);
							}
							i_319_++;
						}
					}
				}
			}
			stream.method2925();
			((Class390_Sub2) this).anInterface14_8667 = (((Class390_Sub2) this).aClass505_Sub1_8648.method13600(i, nativeheapbuffer, stream.method2918(), false));
			if (((Class390_Sub2) this).anInterface14_8667 instanceof Class135_Sub2)
				nativeheapbuffer.method1178();
			((Class390_Sub2) this).aClass143_8668 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, 0);
			((Class390_Sub2) this).aClass143_8669 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5121, 4, 12);
			int i_327_;
			if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null) {
				((Class390_Sub2) this).aClass143_8671 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, 16);
				i_327_ = 28;
			} else {
				((Class390_Sub2) this).aClass143_8671 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 2, 16);
				i_327_ = 24;
			}
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0)
				((Class390_Sub2) this).aClass143_8670 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, i_327_);
			long[] ls = new long[((Class390_Sub2) this).aClass282Array8666.length];
			for (int i_328_ = 0; i_328_ < ((Class390_Sub2) this).aClass282Array8666.length; i_328_++) {
				Class282_Sub3 class282_sub3 = ((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i_328_]);
				ls[i_328_] = class282_sub3.data * -3442165056282524525L;
				class282_sub3.method12087(((Class390_Sub2) this).anInt8657);
			}
			Class214.method3669(ls, ((Class390_Sub2) this).aClass282Array8666, 1931288714);
			if (((Class390_Sub2) this).aClass130_8664 != null)
				((Class390_Sub2) this).aClass130_8664.method2309();
		} else
			((Class390_Sub2) this).aClass130_8664 = null;
		if ((((Class390_Sub2) this).anInt8651 & 0x2) == 0) {
			((Class390_Sub2) this).anIntArrayArrayArray8660 = null;
			((Class390_Sub2) this).anIntArrayArrayArray8661 = null;
			((Class390_Sub2) this).anIntArrayArrayArray8647 = null;
		}
		((Class390_Sub2) this).anIntArrayArrayArray8662 = null;
		((Class390_Sub2) this).anIntArrayArrayArray8665 = null;
		((Class390_Sub2) this).anIntArrayArrayArray8649 = null;
		((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656 = null;
		((Class390_Sub2) this).aByteArrayArray8674 = null;
		((Class390_Sub2) this).aClass453_8678 = null;
		((Class390_Sub2) this).aFloatArrayArray8677 = null;
		((Class390_Sub2) this).aFloatArrayArray8655 = null;
		((Class390_Sub2) this).aFloatArrayArray8675 = null;
	}

	public void e() {
		if (((Class390_Sub2) this).anInt8672 > 0) {
			byte[][] is = (new byte[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
			for (int i = 1; i < anInt4776 * -1843860823; i++) {
				for (int i_329_ = 1; i_329_ < anInt4773 * 1826078169; i_329_++)
					is[i][i_329_] = (byte) (((((Class390_Sub2) this).aByteArrayArray8674[i - 1][i_329_]) >> 2) + ((((Class390_Sub2) this).aByteArrayArray8674[i + 1][i_329_]) >> 3) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_329_ - 1]) >> 2) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_329_ + 1]) >> 3) + ((((Class390_Sub2) this).aByteArrayArray8674[i][i_329_]) >> 1));
			}
			((Class390_Sub2) this).aClass282Array8666 = new Node[((Class390_Sub2) this).aClass453_8678.method7540(-975751825)];
			((Class390_Sub2) this).aClass453_8678.method7532(((Class390_Sub2) this).aClass282Array8666, (byte) 41);
			for (int i = 0; i < ((Class390_Sub2) this).aClass282Array8666.length; i++)
				((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i]).method12092(((Class390_Sub2) this).anInt8672);
			int i = 24;
			if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null)
				i += 4;
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aNativeHeap8445.method759(((Class390_Sub2) this).anInt8672 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class282_Sub3[] class282_sub3s = new Class282_Sub3[((Class390_Sub2) this).anInt8672];
			int i_330_ = Class51.method1072(((Class390_Sub2) this).anInt8672 / 4, 2033414513);
			if (i_330_ < 1)
				i_330_ = 1;
			Class453 class453 = new Class453(i_330_);
			Class282_Sub3[] class282_sub3s_331_ = new Class282_Sub3[((Class390_Sub2) this).anInt8659];
			for (int i_332_ = 0; i_332_ < anInt4776 * -1843860823; i_332_++) {
				for (int i_333_ = 0; i_333_ < anInt4773 * 1826078169; i_333_++) {
					if ((((Class390_Sub2) this).anIntArrayArrayArray8647[i_332_][i_333_]) != null) {
						Class282_Sub3[] class282_sub3s_334_ = (((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656[i_332_][i_333_]);
						int[] is_335_ = (((Class390_Sub2) this).anIntArrayArrayArray8661[i_332_][i_333_]);
						int[] is_336_ = (((Class390_Sub2) this).anIntArrayArrayArray8660[i_332_][i_333_]);
						int[] is_337_ = (((Class390_Sub2) this).anIntArrayArrayArray8665[i_332_][i_333_]);
						int[] is_338_ = (((Class390_Sub2) this).anIntArrayArrayArray8647[i_332_][i_333_]);
						int[] is_339_ = ((((Class390_Sub2) this).anIntArrayArrayArray8649 != null) ? (((Class390_Sub2) this).anIntArrayArrayArray8649[i_332_][i_333_]) : null);
						int[] is_340_ = ((((Class390_Sub2) this).anIntArrayArrayArray8662 != null) ? (((Class390_Sub2) this).anIntArrayArrayArray8662[i_332_][i_333_]) : null);
						if (is_337_ == null)
							is_337_ = is_338_;
						float f = (((Class390_Sub2) this).aFloatArrayArray8675[i_332_][i_333_]);
						float f_341_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_332_][i_333_]);
						float f_342_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_332_][i_333_]);
						float f_343_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_332_][i_333_ + 1]);
						float f_344_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_332_][i_333_ + 1]);
						float f_345_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_332_][i_333_ + 1]);
						float f_346_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_332_ + 1][i_333_ + 1]);
						float f_347_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_332_ + 1][i_333_ + 1]);
						float f_348_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_332_ + 1][i_333_ + 1]);
						float f_349_ = (((Class390_Sub2) this).aFloatArrayArray8675[i_332_ + 1][i_333_]);
						float f_350_ = (((Class390_Sub2) this).aFloatArrayArray8655[i_332_ + 1][i_333_]);
						float f_351_ = (((Class390_Sub2) this).aFloatArrayArray8677[i_332_ + 1][i_333_]);
						int i_352_ = is[i_332_][i_333_] & 0xff;
						int i_353_ = is[i_332_][i_333_ + 1] & 0xff;
						int i_354_ = is[i_332_ + 1][i_333_ + 1] & 0xff;
						int i_355_ = is[i_332_ + 1][i_333_] & 0xff;
						int i_356_ = 0;
						while_176_: for (int i_357_ = 0; i_357_ < is_338_.length; i_357_++) {
							Class282_Sub3 class282_sub3 = class282_sub3s_334_[i_357_];
							for (int i_358_ = 0; i_358_ < i_356_; i_358_++) {
								if (class282_sub3s_331_[i_358_] == class282_sub3)
									continue while_176_;
							}
							class282_sub3s_331_[i_356_++] = class282_sub3;
						}
						short[] is_359_ = (((Class390_Sub2) this).aShortArrayArray8653[(i_333_ * (anInt4776 * -1843860823) + i_332_)] = new short[is_338_.length]);
						for (int i_360_ = 0; i_360_ < is_338_.length; i_360_++) {
							int i_361_ = ((i_332_ << anInt4775 * 1856651955) + is_335_[i_360_]);
							int i_362_ = ((i_333_ << anInt4775 * 1856651955) + is_336_[i_360_]);
							int i_363_ = i_361_ >> ((Class390_Sub2) this).anInt8679;
							int i_364_ = i_362_ >> ((Class390_Sub2) this).anInt8679;
							int i_365_ = is_338_[i_360_];
							int i_366_ = is_337_[i_360_];
							int i_367_ = is_339_ != null ? is_339_[i_360_] : 0;
							long l = ((long) i_366_ << 48 | (long) i_365_ << 32 | (long) (i_363_ << 16) | (long) i_364_);
							int i_368_ = is_335_[i_360_];
							int i_369_ = is_336_[i_360_];
							int i_370_ = 74;
							int i_371_ = 0;
							float f_372_ = 1.0F;
							float f_373_;
							float f_374_;
							float f_375_;
							if (i_368_ == 0 && i_369_ == 0) {
								f_373_ = f;
								f_374_ = f_341_;
								f_375_ = f_342_;
								i_370_ -= i_352_;
							} else if (i_368_ == 0 && i_369_ == anInt4774 * 750971439) {
								f_373_ = f_343_;
								f_374_ = f_344_;
								f_375_ = f_345_;
								i_370_ -= i_353_;
							} else if (i_368_ == anInt4774 * 750971439 && i_369_ == anInt4774 * 750971439) {
								f_373_ = f_346_;
								f_374_ = f_347_;
								f_375_ = f_348_;
								i_370_ -= i_354_;
							} else if (i_368_ == anInt4774 * 750971439 && i_369_ == 0) {
								f_373_ = f_349_;
								f_374_ = f_350_;
								f_375_ = f_351_;
								i_370_ -= i_355_;
							} else {
								float f_376_ = ((float) i_368_ / (float) (anInt4774 * 750971439));
								float f_377_ = ((float) i_369_ / (float) (anInt4774 * 750971439));
								float f_378_ = f + (f_349_ - f) * f_376_;
								float f_379_ = f_341_ + (f_350_ - f_341_) * f_376_;
								float f_380_ = f_342_ + (f_351_ - f_342_) * f_376_;
								float f_381_ = f_343_ + (f_346_ - f_343_) * f_376_;
								float f_382_ = f_344_ + (f_347_ - f_344_) * f_376_;
								float f_383_ = f_345_ + (f_348_ - f_345_) * f_376_;
								f_373_ = f_378_ + (f_381_ - f_378_) * f_377_;
								f_374_ = f_379_ + (f_382_ - f_379_) * f_377_;
								f_375_ = f_380_ + (f_383_ - f_380_) * f_377_;
								int i_384_ = i_352_ + ((i_355_ - i_352_) * i_368_ >> anInt4775 * 1856651955);
								int i_385_ = i_353_ + ((i_354_ - i_353_) * i_368_ >> anInt4775 * 1856651955);
								i_370_ -= i_384_ + ((i_385_ - i_384_) * i_369_ >> anInt4775 * 1856651955);
							}
							if (i_365_ != -1) {
								int i_386_ = (i_365_ & 0x7f) * i_370_ >> 7;
								if (i_386_ < 2)
									i_386_ = 2;
								else if (i_386_ > 126)
									i_386_ = 126;
								i_371_ = (Class540.anIntArray7136[i_365_ & 0xff80 | i_386_]);
								if ((((Class390_Sub2) this).anInt8652 & 0x7) == 0) {
									f_372_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[0]) * f_373_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[1]) * f_374_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[2]) * f_375_);
									f_372_ = (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8432 + (f_372_ * (f_372_ > 0.0F ? (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8433) : (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8434))));
								}
							}
							Node class282 = null;
							if ((i_361_ & ((Class390_Sub2) this).anInt8650 - 1) == 0 && ((i_362_ & ((Class390_Sub2) this).anInt8650 - 1) == 0))
								class282 = class453.method7530(l);
							int i_387_;
							if (class282 == null) {
								int i_388_;
								if (i_366_ != i_365_) {
									int i_389_ = (i_366_ & 0x7f) * i_370_ >> 7;
									if (i_389_ < 2)
										i_389_ = 2;
									else if (i_389_ > 126)
										i_389_ = 126;
									i_388_ = (Class540.anIntArray7136[i_366_ & 0xff80 | i_389_]);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) == 0) {
										float f_390_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[0]) * f_373_ + (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[1]) * f_374_ + ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloatArray8426[2]) * f_375_));
										f_390_ = ((((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8432) + (f_372_ * (f_372_ > 0.0F ? (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8433) : (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aFloat8434))));
										int i_391_ = i_388_ >> 16 & 0xff;
										int i_392_ = i_388_ >> 8 & 0xff;
										int i_393_ = i_388_ & 0xff;
										i_391_ *= f_390_;
										if (i_391_ < 0)
											i_391_ = 0;
										else if (i_391_ > 255)
											i_391_ = 255;
										i_392_ *= f_390_;
										if (i_392_ < 0)
											i_392_ = 0;
										else if (i_392_ > 255)
											i_392_ = 255;
										i_393_ *= f_390_;
										if (i_393_ < 0)
											i_393_ = 0;
										else if (i_393_ > 255)
											i_393_ = 255;
										i_388_ = (i_391_ << 16 | i_392_ << 8 | i_393_);
									}
								} else
									i_388_ = i_371_;
								if (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).aBool8467) {
									stream.method2923((float) i_361_);
									stream.method2923((float) (method6709(i_361_, i_362_, 2112888515) + i_367_));
									stream.method2923((float) i_362_);
									stream.method2920((byte) (i_388_ >> 16));
									stream.method2920((byte) (i_388_ >> 8));
									stream.method2920((byte) i_388_);
									stream.method2920(-1);
									stream.method2923((float) i_361_);
									stream.method2923((float) i_362_);
									if ((((Class390_Sub2) this).anIntArrayArrayArray8662) != null)
										stream.method2923(is_340_ != null ? (float) ((is_340_[i_360_]) - 1) : 0.0F);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
										stream.method2923(f_373_);
										stream.method2923(f_374_);
										stream.method2923(f_375_);
									}
								} else {
									stream.method2924((float) i_361_);
									stream.method2924((float) (method6709(i_361_, i_362_, 1456683956) + i_367_));
									stream.method2924((float) i_362_);
									stream.method2920((byte) (i_388_ >> 16));
									stream.method2920((byte) (i_388_ >> 8));
									stream.method2920((byte) i_388_);
									stream.method2920(-1);
									stream.method2924((float) i_361_);
									stream.method2924((float) i_362_);
									if ((((Class390_Sub2) this).anIntArrayArrayArray8662) != null)
										stream.method2924(is_340_ != null ? (float) ((is_340_[i_360_]) - 1) : 0.0F);
									if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
										stream.method2924(f_373_);
										stream.method2924(f_374_);
										stream.method2924(f_375_);
									}
								}
								i_387_ = ((Class390_Sub2) this).anInt8657++;
								is_359_[i_360_] = (short) i_387_;
								if (i_365_ != -1)
									class282_sub3s[i_387_] = class282_sub3s_334_[i_360_];
								class453.method7534(new Class282_Sub46(is_359_[i_360_]), l);
							} else {
								is_359_[i_360_] = ((Class282_Sub46) class282).aShort8067;
								i_387_ = is_359_[i_360_] & 0xffff;
								if (i_365_ != -1 && ((class282_sub3s_334_[i_360_].data * -3442165056282524525L) < (class282_sub3s[i_387_].data * -3442165056282524525L)))
									class282_sub3s[i_387_] = class282_sub3s_334_[i_360_];
							}
							for (int i_394_ = 0; i_394_ < i_356_; i_394_++)
								class282_sub3s_331_[i_394_].method12083(i_387_, i_371_, i_370_, f_372_);
							((Class390_Sub2) this).anInt8654++;
						}
					}
				}
			}
			for (int i_395_ = 0; i_395_ < ((Class390_Sub2) this).anInt8657; i_395_++) {
				Class282_Sub3 class282_sub3 = class282_sub3s[i_395_];
				if (class282_sub3 != null)
					class282_sub3.method12081(i_395_);
			}
			for (int i_396_ = 0; i_396_ < anInt4776 * -1843860823; i_396_++) {
				for (int i_397_ = 0; i_397_ < anInt4773 * 1826078169; i_397_++) {
					short[] is_398_ = (((Class390_Sub2) this).aShortArrayArray8653[i_397_ * (anInt4776 * -1843860823) + i_396_]);
					if (is_398_ != null) {
						int i_399_ = 0;
						int i_400_ = 0;
						while (i_400_ < is_398_.length) {
							int i_401_ = is_398_[i_400_++] & 0xffff;
							int i_402_ = is_398_[i_400_++] & 0xffff;
							int i_403_ = is_398_[i_400_++] & 0xffff;
							Class282_Sub3 class282_sub3 = class282_sub3s[i_401_];
							Class282_Sub3 class282_sub3_404_ = class282_sub3s[i_402_];
							Class282_Sub3 class282_sub3_405_ = class282_sub3s[i_403_];
							Class282_Sub3 class282_sub3_406_ = null;
							if (class282_sub3 != null) {
								class282_sub3.method12082(i_396_, i_397_, i_399_);
								class282_sub3_406_ = class282_sub3;
							}
							if (class282_sub3_404_ != null) {
								class282_sub3_404_.method12082(i_396_, i_397_, i_399_);
								if (class282_sub3_406_ == null || ((class282_sub3_404_.data * -3442165056282524525L) < (class282_sub3_406_.data * -3442165056282524525L)))
									class282_sub3_406_ = class282_sub3_404_;
							}
							if (class282_sub3_405_ != null) {
								class282_sub3_405_.method12082(i_396_, i_397_, i_399_);
								if (class282_sub3_406_ == null || ((class282_sub3_405_.data * -3442165056282524525L) < (class282_sub3_406_.data * -3442165056282524525L)))
									class282_sub3_406_ = class282_sub3_405_;
							}
							if (class282_sub3_406_ != null) {
								if (class282_sub3 != null)
									class282_sub3_406_.method12081(i_401_);
								if (class282_sub3_404_ != null)
									class282_sub3_406_.method12081(i_402_);
								if (class282_sub3_405_ != null)
									class282_sub3_406_.method12081(i_403_);
								class282_sub3_406_.method12082(i_396_, i_397_, i_399_);
							}
							i_399_++;
						}
					}
				}
			}
			stream.method2925();
			((Class390_Sub2) this).anInterface14_8667 = (((Class390_Sub2) this).aClass505_Sub1_8648.method13600(i, nativeheapbuffer, stream.method2918(), false));
			if (((Class390_Sub2) this).anInterface14_8667 instanceof Class135_Sub2)
				nativeheapbuffer.method1178();
			((Class390_Sub2) this).aClass143_8668 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, 0);
			((Class390_Sub2) this).aClass143_8669 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5121, 4, 12);
			int i_407_;
			if (((Class390_Sub2) this).anIntArrayArrayArray8662 != null) {
				((Class390_Sub2) this).aClass143_8671 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, 16);
				i_407_ = 28;
			} else {
				((Class390_Sub2) this).aClass143_8671 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 2, 16);
				i_407_ = 24;
			}
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0)
				((Class390_Sub2) this).aClass143_8670 = new Class143(((Class390_Sub2) this).anInterface14_8667, 5126, 3, i_407_);
			long[] ls = new long[((Class390_Sub2) this).aClass282Array8666.length];
			for (int i_408_ = 0; i_408_ < ((Class390_Sub2) this).aClass282Array8666.length; i_408_++) {
				Class282_Sub3 class282_sub3 = ((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i_408_]);
				ls[i_408_] = class282_sub3.data * -3442165056282524525L;
				class282_sub3.method12087(((Class390_Sub2) this).anInt8657);
			}
			Class214.method3669(ls, ((Class390_Sub2) this).aClass282Array8666, 2031695435);
			if (((Class390_Sub2) this).aClass130_8664 != null)
				((Class390_Sub2) this).aClass130_8664.method2309();
		} else
			((Class390_Sub2) this).aClass130_8664 = null;
		if ((((Class390_Sub2) this).anInt8651 & 0x2) == 0) {
			((Class390_Sub2) this).anIntArrayArrayArray8660 = null;
			((Class390_Sub2) this).anIntArrayArrayArray8661 = null;
			((Class390_Sub2) this).anIntArrayArrayArray8647 = null;
		}
		((Class390_Sub2) this).anIntArrayArrayArray8662 = null;
		((Class390_Sub2) this).anIntArrayArrayArray8665 = null;
		((Class390_Sub2) this).anIntArrayArrayArray8649 = null;
		((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656 = null;
		((Class390_Sub2) this).aByteArrayArray8674 = null;
		((Class390_Sub2) this).aClass453_8678 = null;
		((Class390_Sub2) this).aFloatArrayArray8677 = null;
		((Class390_Sub2) this).aFloatArrayArray8655 = null;
		((Class390_Sub2) this).aFloatArrayArray8675 = null;
	}

	Class390_Sub2(Class505_Sub1 class505_sub1, int i, int i_409_, int i_410_, int i_411_, int[][] is, int[][] is_412_, int i_413_) {
		super(i_410_, i_411_, i_413_, is);
		((Class390_Sub2) this).aClass505_Sub1_8648 = class505_sub1;
		((Class390_Sub2) this).anInt8679 = anInt4775 * 1856651955 - 2;
		((Class390_Sub2) this).anInt8650 = 1 << ((Class390_Sub2) this).anInt8679;
		((Class390_Sub2) this).anInt8651 = i;
		((Class390_Sub2) this).anInt8652 = i_409_;
		((Class390_Sub2) this).anIntArrayArrayArray8649 = new int[i_410_][i_411_][];
		((Class390_Sub2) this).aClass282_Sub3ArrayArrayArray8656 = new Class282_Sub3[i_410_][i_411_][];
		((Class390_Sub2) this).anIntArrayArrayArray8661 = new int[i_410_][i_411_][];
		((Class390_Sub2) this).anIntArrayArrayArray8660 = new int[i_410_][i_411_][];
		((Class390_Sub2) this).anIntArrayArrayArray8647 = new int[i_410_][i_411_][];
		((Class390_Sub2) this).anIntArrayArrayArray8665 = new int[i_410_][i_411_][];
		((Class390_Sub2) this).aShortArrayArray8653 = new short[i_410_ * i_411_][];
		((Class390_Sub2) this).aByteArrayArray8663 = new byte[i_410_][i_411_];
		((Class390_Sub2) this).aByteArrayArray8674 = new byte[i_410_ + 1][i_411_ + 1];
		((Class390_Sub2) this).aFloatArrayArray8675 = (new float[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
		((Class390_Sub2) this).aFloatArrayArray8655 = (new float[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
		((Class390_Sub2) this).aFloatArrayArray8677 = (new float[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
		for (int i_414_ = 1; i_414_ < anInt4773 * 1826078169; i_414_++) {
			for (int i_415_ = 1; i_415_ < anInt4776 * -1843860823; i_415_++) {
				int i_416_ = (is_412_[i_415_ + 1][i_414_] - is_412_[i_415_ - 1][i_414_]);
				int i_417_ = (is_412_[i_415_][i_414_ + 1] - is_412_[i_415_][i_414_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_416_ * i_416_ + 4 * i_413_ * i_413_ + i_417_ * i_417_)));
				((Class390_Sub2) this).aFloatArrayArray8675[i_415_][i_414_] = (float) i_416_ * f;
				((Class390_Sub2) this).aFloatArrayArray8655[i_415_][i_414_] = (float) (-i_413_ * 2) * f;
				((Class390_Sub2) this).aFloatArrayArray8677[i_415_][i_414_] = (float) i_417_ * f;
			}
		}
		((Class390_Sub2) this).aClass453_8678 = new Class453(128);
		if ((((Class390_Sub2) this).anInt8652 & 0x10) != 0)
			((Class390_Sub2) this).aClass130_8664 = new Class130(((Class390_Sub2) this).aClass505_Sub1_8648, this);
	}

	public Class282_Sub50_Sub17 s(int i, int i_418_, Class282_Sub50_Sub17 class282_sub50_sub17) {
		if ((((Class390_Sub2) this).aByteArrayArray8663[i][i_418_] & 0x1) == 0)
			return null;
		int i_419_ = (anInt4774 * 750971439 >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_420_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_419_, i_419_)) {
			class282_sub50_sub17_sub1_420_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_420_.method15712();
		} else
			class282_sub50_sub17_sub1_420_ = new Class282_Sub50_Sub17_Sub1((((Class390_Sub2) this).aClass505_Sub1_8648), i_419_, i_419_);
		class282_sub50_sub17_sub1_420_.method15721(0, 0, i_419_, i_419_);
		method13879(class282_sub50_sub17_sub1_420_, i, i_418_);
		return class282_sub50_sub17_sub1_420_;
	}

	public void u(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_421_, int i_422_, int i_423_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_424_ = (i - (i_421_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_425_ = (i_422_ - (i_421_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2314(class282_sub50_sub17, i_424_, i_425_);
		}
	}

	public boolean method6718(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_426_, int i_427_, int i_428_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 == null || class282_sub50_sub17 == null)
			return false;
		int i_429_ = (i - (i_426_ * ((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8438 >> 8) >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		int i_430_ = (i_427_ - (i_426_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8439) >> 8) >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		return ((Class390_Sub2) this).aClass130_8664.method2293(class282_sub50_sub17, i_429_, i_430_);
	}

	public boolean method6719(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_431_, int i_432_, int i_433_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 == null || class282_sub50_sub17 == null)
			return false;
		int i_434_ = (i - (i_431_ * ((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8438 >> 8) >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		int i_435_ = (i_432_ - (i_431_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8439) >> 8) >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		return ((Class390_Sub2) this).aClass130_8664.method2293(class282_sub50_sub17, i_434_, i_435_);
	}

	public void d(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_436_, int i_437_, int i_438_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_439_ = (i - (i_436_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_440_ = (i_437_ - (i_436_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2313(class282_sub50_sub17, i_439_, i_440_);
		}
	}

	public void a(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_441_, int i_442_, int i_443_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_444_ = (i - (i_441_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_445_ = (i_442_ - (i_441_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2313(class282_sub50_sub17, i_444_, i_445_);
		}
	}

	public void method6710(int i, int i_446_, int i_447_, int i_448_, int i_449_, int i_450_, int i_451_, boolean[][] bools) {
		Class158 class158 = ((Class390_Sub2) this).aClass505_Sub1_8648.method8523((byte) 110);
		if (((Class390_Sub2) this).anInt8672 > 0 && class158 != null) {
			((Class390_Sub2) this).aClass505_Sub1_8648.method13586();
			((Class390_Sub2) this).aClass505_Sub1_8648.method13642(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13656(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13623(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13624(0);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13581(-2);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13654(null);
			aFloatArray8646[0] = (float) i_447_ / (128.0F * (float) (anInt4774 * 750971439) * (float) class158.method2714());
			aFloatArray8646[1] = 0.0F;
			aFloatArray8646[2] = 0.0F;
			aFloatArray8646[3] = 0.0F;
			aFloatArray8646[4] = 0.0F;
			aFloatArray8646[5] = (float) i_447_ / (128.0F * (float) (anInt4774 * 750971439) * (float) class158.method2716());
			aFloatArray8646[6] = 0.0F;
			aFloatArray8646[7] = 0.0F;
			aFloatArray8646[8] = 0.0F;
			aFloatArray8646[9] = 0.0F;
			aFloatArray8646[10] = 0.0F;
			aFloatArray8646[11] = 0.0F;
			aFloatArray8646[12] = -1.0F - ((float) (i_448_ * i_447_) / 128.0F - (float) (i * 2)) / (float) class158.method2714();
			aFloatArray8646[13] = 1.0F - (((float) (2 * i_446_) + (float) (i_451_ * i_447_) / 128.0F) / (float) class158.method2716());
			aFloatArray8646[14] = 0.0F;
			aFloatArray8646[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8646, 0);
			aFloatArray8646[0] = 1.0F;
			aFloatArray8646[1] = 0.0F;
			aFloatArray8646[2] = 0.0F;
			aFloatArray8646[3] = 0.0F;
			aFloatArray8646[4] = 0.0F;
			aFloatArray8646[5] = 0.0F;
			aFloatArray8646[6] = 1.0F;
			aFloatArray8646[7] = 0.0F;
			aFloatArray8646[8] = 0.0F;
			aFloatArray8646[9] = 1.0F;
			aFloatArray8646[10] = 0.0F;
			aFloatArray8646[11] = 0.0F;
			aFloatArray8646[12] = 0.0F;
			aFloatArray8646[13] = 0.0F;
			aFloatArray8646[14] = 0.0F;
			aFloatArray8646[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8646, 0);
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(true);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13593();
			} else
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13647(((Class390_Sub2) this).aClass143_8668, ((Class390_Sub2) this).aClass143_8670, ((Class390_Sub2) this).aClass143_8669, ((Class390_Sub2) this).aClass143_8671);
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.buffer).length < ((Class390_Sub2) this).anInt8654 * 2)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1(((Class390_Sub2) this).anInt8654 * 2);
			else
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.index = 0;
			int i_452_ = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499);
			if (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aBool8467) {
				for (int i_453_ = i_449_; i_453_ < i_451_; i_453_++) {
					int i_454_ = i_453_ * (anInt4776 * -1843860823) + i_448_;
					for (int i_455_ = i_448_; i_455_ < i_450_; i_455_++) {
						if (bools[i_455_ - i_448_][i_453_ - i_449_]) {
							short[] is = (((Class390_Sub2) this).aShortArrayArray8653[i_454_]);
							if (is != null) {
								for (int i_456_ = 0; i_456_ < is.length; i_456_++) {
									class282_sub35_sub1.writeShort(is[i_456_] & 0xffff, 1417031095);
									i_452_++;
								}
							}
						}
						i_454_++;
					}
				}
			} else {
				for (int i_457_ = i_449_; i_457_ < i_451_; i_457_++) {
					int i_458_ = i_457_ * (anInt4776 * -1843860823) + i_448_;
					for (int i_459_ = i_448_; i_459_ < i_450_; i_459_++) {
						if (bools[i_459_ - i_448_][i_457_ - i_449_]) {
							short[] is = (((Class390_Sub2) this).aShortArrayArray8653[i_458_]);
							if (is != null) {
								for (int i_460_ = 0; i_460_ < is.length; i_460_++) {
									class282_sub35_sub1.writeLEShort(is[i_460_] & 0xffff, (byte) -46);
									i_452_++;
								}
							}
						}
						i_458_++;
					}
				}
			}
			if (i_452_ > 0) {
				Class131_Sub2 class131_sub2 = new Class131_Sub2((((Class390_Sub2) this).aClass505_Sub1_8648), 5123, class282_sub35_sub1.buffer, (class282_sub35_sub1.index * -1990677291));
				((Class390_Sub2) this).aClass505_Sub1_8648.method13611(class131_sub2, 4, 0, i_452_);
			}
		}
	}

	public void z(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_461_, int i_462_, int i_463_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_464_ = (i - (i_461_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_465_ = (i_462_ - (i_461_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2313(class282_sub50_sub17, i_464_, i_465_);
		}
	}

	public void method6717(int i, int i_466_, int i_467_, boolean[][] bools, boolean bool, int i_468_) {
		method13881(i, i_466_, i_467_, bools, bool, i_468_);
	}

	public void method6720(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub2) this).aClass473_8673.insertBack(new Class282_Sub19(((Class390_Sub2) this).aClass505_Sub1_8648, this, class282_sub24, is));
	}

	public void method6711(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub2) this).aClass473_8673.insertBack(new Class282_Sub19(((Class390_Sub2) this).aClass505_Sub1_8648, this, class282_sub24, is));
	}

	void method13883(int i, int i_469_, int i_470_, boolean[][] bools, boolean bool, int i_471_) {
		if (((Class390_Sub2) this).aClass282Array8666 != null) {
			int i_472_ = i_470_ + i_470_ + 1;
			i_472_ *= i_472_;
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502).length < i_472_)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502 = new int[i_472_];
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.buffer).length < ((Class390_Sub2) this).anInt8654 * 2)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1(((Class390_Sub2) this).anInt8654 * 2);
			int i_473_ = i - i_470_;
			int i_474_ = i_473_;
			if (i_473_ < 0)
				i_473_ = 0;
			int i_475_ = i_469_ - i_470_;
			int i_476_ = i_475_;
			if (i_475_ < 0)
				i_475_ = 0;
			int i_477_ = i + i_470_;
			if (i_477_ > anInt4776 * -1843860823 - 1)
				i_477_ = anInt4776 * -1843860823 - 1;
			int i_478_ = i_469_ + i_470_;
			if (i_478_ > anInt4773 * 1826078169 - 1)
				i_478_ = anInt4773 * 1826078169 - 1;
			int i_479_ = 0;
			int[] is = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anIntArray8502);
			for (int i_480_ = i_473_; i_480_ <= i_477_; i_480_++) {
				boolean[] bools_481_ = bools[i_480_ - i_474_];
				for (int i_482_ = i_475_; i_482_ <= i_478_; i_482_++) {
					if (bools_481_[i_482_ - i_476_])
						is[i_479_++] = i_482_ * (anInt4776 * -1843860823) + i_480_;
				}
			}
			((Class390_Sub2) this).aClass505_Sub1_8648.method13607();
			((Class390_Sub2) this).aClass505_Sub1_8648.method13620((((Class390_Sub2) this).anInt8652 & 0x7) != 0);
			for (int i_483_ = 0; i_483_ < ((Class390_Sub2) this).aClass282Array8666.length - 0; i_483_++)
				((Class282_Sub3) ((Class390_Sub2) this).aClass282Array8666[i_483_]).method12085(is, i_479_);
			if (!((Class390_Sub2) this).aClass473_8673.method7861(141891001)) {
				int i_484_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8441);
				int i_485_ = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8358);
				((Class390_Sub2) this).aClass505_Sub1_8648.c(0, i_485_, ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8378);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13623(false);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13624(128);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13581(-2);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13654(((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass137_Sub1_8460);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13717(8448, 7681);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13595(0, 34166, 770);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13616(0, 34167, 770);
				for (Node class282 = ((Class390_Sub2) this).aClass473_8673.getBack(); class282 != null; class282 = ((Class390_Sub2) this).aClass473_8673.getPrevious()) {
					Class282_Sub19 class282_sub19 = (Class282_Sub19) class282;
					class282_sub19.method12311(i, i_469_, i_470_, bools);
				}
				((Class390_Sub2) this).aClass505_Sub1_8648.method13595(0, 5890, 768);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13616(0, 5890, 770);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13654(null);
				((Class390_Sub2) this).aClass505_Sub1_8648.c(i_484_, i_485_, ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8378);
			}
			if (((Class390_Sub2) this).aClass130_8664 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13647(((Class390_Sub2) this).aClass143_8668, null, null, ((Class390_Sub2) this).aClass143_8671);
				((Class390_Sub2) this).aClass130_8664.method2290(i, i_469_, i_470_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public Class282_Sub50_Sub17 w(int i, int i_486_, Class282_Sub50_Sub17 class282_sub50_sub17) {
		if ((((Class390_Sub2) this).aByteArrayArray8663[i][i_486_] & 0x1) == 0)
			return null;
		int i_487_ = (anInt4774 * 750971439 >> (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473));
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_488_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_487_, i_487_)) {
			class282_sub50_sub17_sub1_488_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_488_.method15712();
		} else
			class282_sub50_sub17_sub1_488_ = new Class282_Sub50_Sub17_Sub1((((Class390_Sub2) this).aClass505_Sub1_8648), i_487_, i_487_);
		class282_sub50_sub17_sub1_488_.method15721(0, 0, i_487_, i_487_);
		method13879(class282_sub50_sub17_sub1_488_, i, i_486_);
		return class282_sub50_sub17_sub1_488_;
	}

	public void method6723(int i, int i_489_, int i_490_, int i_491_, int i_492_, int i_493_, int i_494_, boolean[][] bools) {
		Class158 class158 = ((Class390_Sub2) this).aClass505_Sub1_8648.method8523((byte) 122);
		if (((Class390_Sub2) this).anInt8672 > 0 && class158 != null) {
			((Class390_Sub2) this).aClass505_Sub1_8648.method13586();
			((Class390_Sub2) this).aClass505_Sub1_8648.method13642(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13656(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13623(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13624(0);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13581(-2);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13654(null);
			aFloatArray8646[0] = (float) i_490_ / (128.0F * (float) (anInt4774 * 750971439) * (float) class158.method2714());
			aFloatArray8646[1] = 0.0F;
			aFloatArray8646[2] = 0.0F;
			aFloatArray8646[3] = 0.0F;
			aFloatArray8646[4] = 0.0F;
			aFloatArray8646[5] = (float) i_490_ / (128.0F * (float) (anInt4774 * 750971439) * (float) class158.method2716());
			aFloatArray8646[6] = 0.0F;
			aFloatArray8646[7] = 0.0F;
			aFloatArray8646[8] = 0.0F;
			aFloatArray8646[9] = 0.0F;
			aFloatArray8646[10] = 0.0F;
			aFloatArray8646[11] = 0.0F;
			aFloatArray8646[12] = -1.0F - ((float) (i_491_ * i_490_) / 128.0F - (float) (i * 2)) / (float) class158.method2714();
			aFloatArray8646[13] = 1.0F - (((float) (2 * i_489_) + (float) (i_494_ * i_490_) / 128.0F) / (float) class158.method2716());
			aFloatArray8646[14] = 0.0F;
			aFloatArray8646[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8646, 0);
			aFloatArray8646[0] = 1.0F;
			aFloatArray8646[1] = 0.0F;
			aFloatArray8646[2] = 0.0F;
			aFloatArray8646[3] = 0.0F;
			aFloatArray8646[4] = 0.0F;
			aFloatArray8646[5] = 0.0F;
			aFloatArray8646[6] = 1.0F;
			aFloatArray8646[7] = 0.0F;
			aFloatArray8646[8] = 0.0F;
			aFloatArray8646[9] = 1.0F;
			aFloatArray8646[10] = 0.0F;
			aFloatArray8646[11] = 0.0F;
			aFloatArray8646[12] = 0.0F;
			aFloatArray8646[13] = 0.0F;
			aFloatArray8646[14] = 0.0F;
			aFloatArray8646[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8646, 0);
			if ((((Class390_Sub2) this).anInt8652 & 0x7) != 0) {
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(true);
				((Class390_Sub2) this).aClass505_Sub1_8648.method13593();
			} else
				((Class390_Sub2) this).aClass505_Sub1_8648.method13620(false);
			((Class390_Sub2) this).aClass505_Sub1_8648.method13647(((Class390_Sub2) this).aClass143_8668, ((Class390_Sub2) this).aClass143_8670, ((Class390_Sub2) this).aClass143_8669, ((Class390_Sub2) this).aClass143_8671);
			if ((((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.buffer).length < ((Class390_Sub2) this).anInt8654 * 2)
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1(((Class390_Sub2) this).anInt8654 * 2);
			else
				((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499.index = 0;
			int i_495_ = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aClass282_Sub35_Sub1_8499);
			if (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).aBool8467) {
				for (int i_496_ = i_492_; i_496_ < i_494_; i_496_++) {
					int i_497_ = i_496_ * (anInt4776 * -1843860823) + i_491_;
					for (int i_498_ = i_491_; i_498_ < i_493_; i_498_++) {
						if (bools[i_498_ - i_491_][i_496_ - i_492_]) {
							short[] is = (((Class390_Sub2) this).aShortArrayArray8653[i_497_]);
							if (is != null) {
								for (int i_499_ = 0; i_499_ < is.length; i_499_++) {
									class282_sub35_sub1.writeShort(is[i_499_] & 0xffff, 1417031095);
									i_495_++;
								}
							}
						}
						i_497_++;
					}
				}
			} else {
				for (int i_500_ = i_492_; i_500_ < i_494_; i_500_++) {
					int i_501_ = i_500_ * (anInt4776 * -1843860823) + i_491_;
					for (int i_502_ = i_491_; i_502_ < i_493_; i_502_++) {
						if (bools[i_502_ - i_491_][i_500_ - i_492_]) {
							short[] is = (((Class390_Sub2) this).aShortArrayArray8653[i_501_]);
							if (is != null) {
								for (int i_503_ = 0; i_503_ < is.length; i_503_++) {
									class282_sub35_sub1.writeLEShort((is[i_503_] & 0xffff), (byte) 46);
									i_495_++;
								}
							}
						}
						i_501_++;
					}
				}
			}
			if (i_495_ > 0) {
				Class131_Sub2 class131_sub2 = new Class131_Sub2((((Class390_Sub2) this).aClass505_Sub1_8648), 5123, class282_sub35_sub1.buffer, (class282_sub35_sub1.index * -1990677291));
				((Class390_Sub2) this).aClass505_Sub1_8648.method13611(class131_sub2, 4, 0, i_495_);
			}
		}
	}

	public void b(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_504_, int i_505_, int i_506_, boolean bool) {
		if (((Class390_Sub2) this).aClass130_8664 != null && class282_sub50_sub17 != null) {
			int i_507_ = (i - (i_504_ * (((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8438) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			int i_508_ = (i_505_ - (i_504_ * (((Class505_Sub1) (((Class390_Sub2) this).aClass505_Sub1_8648)).anInt8439) >> 8) >> ((Class505_Sub1) ((Class390_Sub2) this).aClass505_Sub1_8648).anInt8473);
			((Class390_Sub2) this).aClass130_8664.method2313(class282_sub50_sub17, i_507_, i_508_);
		}
	}

	public void method6721(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub2) this).aClass473_8673.insertBack(new Class282_Sub19(((Class390_Sub2) this).aClass505_Sub1_8648, this, class282_sub24, is));
	}
}
