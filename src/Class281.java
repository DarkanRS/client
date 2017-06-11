/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class281 {
	int anInt2988;
	int[] anIntArray2989;
	int[] anIntArray2990;
	int[] anIntArray2991;
	int[] anIntArray2992;
	int[] anIntArray2993;
	static float[] aFloatArray2994;
	static int[] anIntArray2995 = { 256, 128, 86, 64 };
	int[][] anIntArrayArray2996;
	static int[] anIntArray2997;
	static int[] anIntArray2998;
	static boolean[] aBooleanArray2999;

	static int method2610(int[] is, int i) {
		int i_0_ = is[i];
		int i_1_ = -1;
		int i_2_ = 2147483647;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = is[i_3_];
			if (i_4_ > i_0_ && i_4_ < i_2_) {
				i_1_ = i_3_;
				i_2_ = i_4_;
			}
		}
		return i_1_;
	}

	int method2611(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		int i_9_ = i_7_ - i_5_;
		int i_10_ = i_6_ - i;
		int i_11_ = i_9_ < 0 ? -i_9_ : i_9_;
		int i_12_ = i_11_ * (i_8_ - i);
		int i_13_ = i_12_ / i_10_;
		return i_9_ < 0 ? i_5_ - i_13_ : i_5_ + i_13_;
	}

	static int method2612(int[] is, int i) {
		int i_14_ = is[i];
		int i_15_ = -1;
		int i_16_ = -2147483648;
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			int i_18_ = is[i_17_];
			if (i_18_ < i_14_ && i_18_ > i_16_) {
				i_15_ = i_17_;
				i_16_ = i_18_;
			}
		}
		return i_15_;
	}

	Class281() {
		int i = Class298_Sub23.method3070(16);
		if (i != 1)
			throw new RuntimeException();
		int i_19_ = Class298_Sub23.method3070(5);
		int i_20_ = 0;
		((Class281) this).anIntArray2992 = new int[i_19_];
		for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
			int i_22_ = Class298_Sub23.method3070(4);
			((Class281) this).anIntArray2992[i_21_] = i_22_;
			if (i_22_ >= i_20_)
				i_20_ = i_22_ + 1;
		}
		((Class281) this).anIntArray2993 = new int[i_20_];
		((Class281) this).anIntArray2989 = new int[i_20_];
		((Class281) this).anIntArray2991 = new int[i_20_];
		((Class281) this).anIntArrayArray2996 = new int[i_20_][];
		for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
			((Class281) this).anIntArray2993[i_23_] = Class298_Sub23.method3070(3) + 1;
			int i_24_ = (((Class281) this).anIntArray2989[i_23_] = Class298_Sub23.method3070(2));
			if (i_24_ != 0)
				((Class281) this).anIntArray2991[i_23_] = Class298_Sub23.method3070(8);
			i_24_ = 1 << i_24_;
			int[] is = new int[i_24_];
			((Class281) this).anIntArrayArray2996[i_23_] = is;
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				is[i_25_] = Class298_Sub23.method3070(8) - 1;
		}
		((Class281) this).anInt2988 = Class298_Sub23.method3070(2) + 1;
		int i_26_ = Class298_Sub23.method3070(4);
		int i_27_ = 2;
		for (int i_28_ = 0; i_28_ < i_19_; i_28_++)
			i_27_ += (((Class281) this).anIntArray2993[((Class281) this).anIntArray2992[i_28_]]);
		((Class281) this).anIntArray2990 = new int[i_27_];
		((Class281) this).anIntArray2990[0] = 0;
		((Class281) this).anIntArray2990[1] = 1 << i_26_;
		i_27_ = 2;
		for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
			int i_30_ = ((Class281) this).anIntArray2992[i_29_];
			for (int i_31_ = 0; i_31_ < ((Class281) this).anIntArray2993[i_30_]; i_31_++)
				((Class281) this).anIntArray2990[i_27_++] = Class298_Sub23.method3070(i_26_);
		}
		if (anIntArray2997 == null || anIntArray2997.length < i_27_) {
			anIntArray2997 = new int[i_27_];
			anIntArray2998 = new int[i_27_];
			aBooleanArray2999 = new boolean[i_27_];
		}
	}

	boolean method2613() {
		boolean bool = Class298_Sub23.method3063() != 0;
		if (!bool)
			return false;
		int i = ((Class281) this).anIntArray2990.length;
		for (int i_32_ = 0; i_32_ < i; i_32_++)
			anIntArray2997[i_32_] = ((Class281) this).anIntArray2990[i_32_];
		int i_33_ = anIntArray2995[((Class281) this).anInt2988 - 1];
		int i_34_ = Class87.method970(i_33_ - 1, 975054523);
		anIntArray2998[0] = Class298_Sub23.method3070(i_34_);
		anIntArray2998[1] = Class298_Sub23.method3070(i_34_);
		int i_35_ = 2;
		for (int i_36_ = 0; i_36_ < ((Class281) this).anIntArray2992.length; i_36_++) {
			int i_37_ = ((Class281) this).anIntArray2992[i_36_];
			int i_38_ = ((Class281) this).anIntArray2993[i_37_];
			int i_39_ = ((Class281) this).anIntArray2989[i_37_];
			int i_40_ = (1 << i_39_) - 1;
			int i_41_ = 0;
			if (i_39_ > 0)
				i_41_ = Class298_Sub23.aClass265Array7328[((Class281) this).anIntArray2991[i_37_]].method2517();
			for (int i_42_ = 0; i_42_ < i_38_; i_42_++) {
				int i_43_ = (((Class281) this).anIntArrayArray2996[i_37_][i_41_ & i_40_]);
				i_41_ >>>= i_39_;
				anIntArray2998[i_35_++] = (i_43_ >= 0 ? Class298_Sub23.aClass265Array7328[i_43_].method2517() : 0);
			}
		}
		return true;
	}

	void method2614(float[] fs, int i) {
		int i_44_ = ((Class281) this).anIntArray2990.length;
		int i_45_ = anIntArray2995[((Class281) this).anInt2988 - 1];
		boolean[] bools = aBooleanArray2999;
		aBooleanArray2999[1] = true;
		bools[0] = true;
		for (int i_46_ = 2; i_46_ < i_44_; i_46_++) {
			int i_47_ = method2612(anIntArray2997, i_46_);
			int i_48_ = method2610(anIntArray2997, i_46_);
			int i_49_ = method2611(anIntArray2997[i_47_], anIntArray2998[i_47_], anIntArray2997[i_48_], anIntArray2998[i_48_], anIntArray2997[i_46_]);
			int i_50_ = anIntArray2998[i_46_];
			int i_51_ = i_45_ - i_49_;
			int i_52_ = i_49_;
			int i_53_ = (i_51_ < i_52_ ? i_51_ : i_52_) << 1;
			if (i_50_ != 0) {
				boolean[] bools_54_ = aBooleanArray2999;
				int i_55_ = i_47_;
				aBooleanArray2999[i_48_] = true;
				bools_54_[i_55_] = true;
				aBooleanArray2999[i_46_] = true;
				if (i_50_ >= i_53_)
					anIntArray2998[i_46_] = (i_51_ > i_52_ ? i_50_ - i_52_ + i_49_ : i_49_ - i_50_ + i_51_ - 1);
				else
					anIntArray2998[i_46_] = ((i_50_ & 0x1) != 0 ? i_49_ - (i_50_ + 1) / 2 : i_49_ + i_50_ / 2);
			} else {
				aBooleanArray2999[i_46_] = false;
				anIntArray2998[i_46_] = i_49_;
			}
		}
		method2615(0, i_44_ - 1);
		int i_56_ = 0;
		int i_57_ = anIntArray2998[0] * ((Class281) this).anInt2988;
		for (int i_58_ = 1; i_58_ < i_44_; i_58_++) {
			if (aBooleanArray2999[i_58_]) {
				int i_59_ = anIntArray2997[i_58_];
				int i_60_ = anIntArray2998[i_58_] * ((Class281) this).anInt2988;
				method2616(i_56_, i_57_, i_59_, i_60_, fs, i);
				if (i_59_ >= i)
					return;
				i_56_ = i_59_;
				i_57_ = i_60_;
			}
		}
		float f = aFloatArray2994[i_57_];
		for (int i_61_ = i_56_; i_61_ < i; i_61_++)
			fs[i_61_] *= f;
	}

	static {
		aFloatArray2994 = (new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F,
				7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
				5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
				4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
				3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
				0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F,
				0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F,
				0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F });
	}

	void method2615(int i, int i_62_) {
		if (i < i_62_) {
			int i_63_ = i;
			int i_64_ = anIntArray2997[i_63_];
			int i_65_ = anIntArray2998[i_63_];
			boolean bool = aBooleanArray2999[i_63_];
			for (int i_66_ = i + 1; i_66_ <= i_62_; i_66_++) {
				int i_67_ = anIntArray2997[i_66_];
				if (i_67_ < i_64_) {
					anIntArray2997[i_63_] = i_67_;
					anIntArray2998[i_63_] = anIntArray2998[i_66_];
					aBooleanArray2999[i_63_] = aBooleanArray2999[i_66_];
					i_63_++;
					anIntArray2997[i_66_] = anIntArray2997[i_63_];
					anIntArray2998[i_66_] = anIntArray2998[i_63_];
					aBooleanArray2999[i_66_] = aBooleanArray2999[i_63_];
				}
			}
			anIntArray2997[i_63_] = i_64_;
			anIntArray2998[i_63_] = i_65_;
			aBooleanArray2999[i_63_] = bool;
			method2615(i, i_63_ - 1);
			method2615(i_63_ + 1, i_62_);
		}
	}

	void method2616(int i, int i_68_, int i_69_, int i_70_, float[] fs, int i_71_) {
		int i_72_ = i_70_ - i_68_;
		int i_73_ = i_69_ - i;
		int i_74_ = i_72_ < 0 ? -i_72_ : i_72_;
		int i_75_ = i_72_ / i_73_;
		int i_76_ = i_68_;
		int i_77_ = 0;
		int i_78_ = i_72_ < 0 ? i_75_ - 1 : i_75_ + 1;
		i_74_ = i_74_ - (i_75_ < 0 ? -i_75_ : i_75_) * i_73_;
		fs[i] *= aFloatArray2994[i_76_];
		if (i_69_ > i_71_)
			i_69_ = i_71_;
		for (int i_79_ = i + 1; i_79_ < i_69_; i_79_++) {
			i_77_ += i_74_;
			if (i_77_ >= i_73_) {
				i_77_ -= i_73_;
				i_76_ += i_78_;
			} else
				i_76_ += i_75_;
			fs[i_79_] *= aFloatArray2994[i_76_];
		}
	}
}
