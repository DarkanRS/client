/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class390 {
	public int[][] anIntArrayArray4772;
	public int anInt4773;
	public int anInt4774;
	public int anInt4775;
	public int anInt4776;
	static int anInt4777;

	public abstract void method6706(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, Class90 class90, boolean bool);

	public abstract void LA(int i, int i_8_, int i_9_);

	public abstract void method6707(int i, int i_10_, int[] is, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, Class90 class90, boolean bool);

	public abstract void method6708(int i, int i_18_, int[] is, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, Class90 class90, boolean bool);

	public abstract void SA();

	public abstract void p();

	public final int method6709(int i, int i_29_, int i_30_) {
		int i_31_ = i >> 1856651955 * anInt4775;
		int i_32_ = i_29_ >> anInt4775 * 1856651955;
		if (i_31_ < 0 || i_32_ < 0 || i_31_ > -1843860823 * anInt4776 - 1 || i_32_ > 1826078169 * anInt4773 - 1)
			return 0;
		int i_33_ = i & anInt4774 * 750971439 - 1;
		int i_34_ = i_29_ & anInt4774 * 750971439 - 1;
		int i_35_ = ((anIntArrayArray4772[i_31_][i_32_] * (750971439 * anInt4774 - i_33_) + i_33_ * anIntArrayArray4772[i_31_ + 1][i_32_]) >> 1856651955 * anInt4775);
		int i_36_ = ((((750971439 * anInt4774 - i_33_) * anIntArrayArray4772[i_31_][i_32_ + 1]) + i_33_ * anIntArrayArray4772[1 + i_31_][1 + i_32_]) >> 1856651955 * anInt4775);
		return ((anInt4774 * 750971439 - i_34_) * i_35_ + i_36_ * i_34_ >> anInt4775 * 1856651955);
	}

	public abstract void method6710(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, boolean[][] bools);

	public abstract void z(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_43_, int i_44_, int i_45_, boolean bool);

	public abstract void method6711(Class282_Sub24 class282_sub24, int[] is);

	public abstract void UA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_46_, int i_47_, int i_48_, boolean bool);

	public abstract void NA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_49_, int i_50_, int i_51_, boolean bool);

	public abstract boolean method6712(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_52_, int i_53_, int i_54_, boolean bool);

	public abstract void method6713(Class282_Sub24 class282_sub24, int[] is);

	public abstract void m(int i, int i_55_, int i_56_);

	public abstract void method6714(int i, int i_57_, int[] is, int[] is_58_, int[] is_59_, int[] is_60_, int[] is_61_, int[] is_62_, int[] is_63_, int[] is_64_, int[] is_65_, int[] is_66_, int[] is_67_, Class90 class90, boolean bool);

	public abstract void b(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_68_, int i_69_, int i_70_, boolean bool);

	public abstract void method6715(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, boolean[][] bools);

	public abstract void e();

	public abstract void method6716(int i, int i_77_, int i_78_, boolean[][] bools, boolean bool, int i_79_);

	public abstract void method6717(int i, int i_80_, int i_81_, boolean[][] bools, boolean bool, int i_82_);

	public abstract void u(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_83_, int i_84_, int i_85_, boolean bool);

	public abstract boolean method6718(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_86_, int i_87_, int i_88_, boolean bool);

	public abstract boolean method6719(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_89_, int i_90_, int i_91_, boolean bool);

	public abstract void d(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_92_, int i_93_, int i_94_, boolean bool);

	public abstract void a(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_95_, int i_96_, int i_97_, boolean bool);

	Class390(int i, int i_98_, int i_99_, int[][] is) {
		anInt4776 = i * 1018124697;
		anInt4773 = -689114519 * i_98_;
		int i_100_ = 0;
		for (/**/; i_99_ > 1; i_99_ >>= 1)
			i_100_++;
		anInt4774 = (1 << i_100_) * 2001771727;
		anInt4775 = i_100_ * 1764768891;
		anIntArrayArray4772 = is;
	}

	public abstract void method6720(Class282_Sub24 class282_sub24, int[] is);

	public abstract Class282_Sub50_Sub17 s(int i, int i_101_, Class282_Sub50_Sub17 class282_sub50_sub17);

	public abstract void method6721(Class282_Sub24 class282_sub24, int[] is);

	public final int method6722(int i, int i_102_, int i_103_) {
		return anIntArrayArray4772[i][i_102_];
	}

	public abstract void method6723(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, boolean[][] bools);

	public abstract Class282_Sub50_Sub17 w(int i, int i_110_, Class282_Sub50_Sub17 class282_sub50_sub17);

	public final int method6724(int i, int i_111_) {
		int i_112_ = i >> 1856651955 * anInt4775;
		int i_113_ = i_111_ >> anInt4775 * 1856651955;
		if (i_112_ < 0 || i_113_ < 0 || i_112_ > -1843860823 * anInt4776 - 1 || i_113_ > 1826078169 * anInt4773 - 1)
			return 0;
		int i_114_ = i & anInt4774 * 750971439 - 1;
		int i_115_ = i_111_ & anInt4774 * 750971439 - 1;
		int i_116_ = ((anIntArrayArray4772[i_112_][i_113_] * (750971439 * anInt4774 - i_114_) + i_114_ * anIntArrayArray4772[i_112_ + 1][i_113_]) >> 1856651955 * anInt4775);
		int i_117_ = ((((750971439 * anInt4774 - i_114_) * anIntArrayArray4772[i_112_][i_113_ + 1]) + i_114_ * anIntArrayArray4772[1 + i_112_][1 + i_113_]) >> 1856651955 * anInt4775);
		return ((anInt4774 * 750971439 - i_115_) * i_116_ + i_117_ * i_115_ >> anInt4775 * 1856651955);
	}

	public final int method6725(int i, int i_118_) {
		return anIntArrayArray4772[i][i_118_];
	}

	public final int method6726(int i, int i_119_) {
		return anIntArrayArray4772[i][i_119_];
	}

	public final int method6727(int i, int i_120_) {
		return anIntArrayArray4772[i][i_120_];
	}

	static void method6728(IComponentDefinitions class118, Class119 class119, int i, int i_121_, int i_122_, int i_123_, int i_124_, long l) {
		int i_125_ = i_122_ * i_122_ + i_123_ * i_123_;
		if ((long) i_125_ <= l) {
			int i_126_;
			if (4 == -672443707 * NativeLibraryLoader.anInt3240)
				i_126_ = (int) client.aFloat7365 & 0x3fff;
			else
				i_126_ = ((int) client.aFloat7365 + client.anInt7255 * -1790074477 & 0x3fff);
			int i_127_ = Class382.anIntArray4657[i_126_];
			int i_128_ = Class382.anIntArray4661[i_126_];
			if (-672443707 * NativeLibraryLoader.anInt3240 != 4) {
				i_127_ = i_127_ * 256 / (client.anInt7203 * -1864403271 + 256);
				i_128_ = 256 * i_128_ / (256 + -1864403271 * client.anInt7203);
			}
			int i_129_ = i_123_ * i_127_ + i_128_ * i_122_ >> 14;
			int i_130_ = i_123_ * i_128_ - i_127_ * i_122_ >> 14;
			NativeSprite class160 = Class282_Sub20_Sub15.aClass160Array9838[i_124_];
			int i_131_ = class160.method2747();
			int i_132_ = class160.method2793();
			int i_133_ = class118.anInt1301 * 1506818197 / 2 + i_129_ - i_131_ / 2;
			int i_134_ = i_131_ + i_133_;
			int i_135_ = class118.anInt1429 * -492594917 / 2 + -i_130_ - i_132_;
			int i_136_ = i_135_ + i_132_;
			if (!class119.method2073(i_133_, i_135_, -560505458) || !class119.method2073(i_134_, i_135_, -1424835178) || !class119.method2073(i_133_, i_136_, -197878747) || !class119.method2073(i_134_, i_136_, -685172335)) {
				double d = Math.atan2((double) i_129_, (double) i_130_);
				int i_137_ = Math.min(class118.anInt1301 * 1506818197 / 2, -492594917 * class118.anInt1429 / 2);
				i_137_ -= 6;
				int i_138_ = (int) (Math.sin(d) * (double) i_137_);
				int i_139_ = (int) (Math.cos(d) * (double) i_137_);
				Class245.aClass160Array3027[i_124_].method2758(((float) i + (float) (class118.anInt1301 * 1506818197) / 2.0F + (float) i_138_), ((float) i_121_ + (float) (-492594917 * class118.anInt1429) / 2.0F - (float) i_139_), 4096, (int) (65535.0 * (-d / 6.283185307179586)));
			} else
				class160.method2773(i + i_133_, i_121_ + i_135_, class119.aClass455_1456, i, i_121_);
		}
	}

	static final void method6729(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_140_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		boolean bool = 1 == (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), i_140_, 77442027);
		if (!bool)
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 0, -1019376772);
		Class190.method3148((byte) 45);
		client.aBool7175 = false;
	}

	static final void method6730(CS2Executor class527, int i) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = ((Player) class527.animable).method16127(true, 2071482968);
	}

	public static final void method6731(int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_) {
		if (i >= Class532_Sub1.anInt7071 * -612590951 && i_141_ <= Class532_Sub1.anInt7069 * -1345107225 && i_142_ >= 324226563 * Class532_Sub1.anInt7070 && i_143_ <= -348932735 * Class532_Sub1.anInt7068)
			HitbarDefinitions.method3230(i, i_141_, i_142_, i_143_, i_144_, i_145_, i_146_, (byte) 89);
		else
			PlayerAppearance.method4034(i, i_141_, i_142_, i_143_, i_144_, i_145_, i_146_, (byte) -84);
	}

	static final void method6732(CS2Executor class527, byte i) {
		int i_148_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_148_, (byte) 8);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class431.method7222(1242812938);
	}
}
