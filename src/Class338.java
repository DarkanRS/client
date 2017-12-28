/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class338 {
	int[] anIntArray3970;
	static float[] aFloatArray3971;
	int[] anIntArray3972;
	static int[] anIntArray3973 = { 256, 128, 86, 64 };
	static boolean[] aBoolArray3974;
	int[] anIntArray3975;
	int[] anIntArray3976;
	int[][] anIntArrayArray3977;
	int anInt3978;
	static int[] anIntArray3979;
	int[] anIntArray3980;
	static int[] anIntArray3981;

	int method6019(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i_2_ - i_0_;
		int i_5_ = i_1_ - i;
		int i_6_ = i_4_ < 0 ? -i_4_ : i_4_;
		int i_7_ = i_6_ * (i_3_ - i);
		int i_8_ = i_7_ / i_5_;
		return i_4_ < 0 ? i_0_ - i_8_ : i_0_ + i_8_;
	}

	static int method6020(int[] is, int i) {
		int i_9_ = is[i];
		int i_10_ = -1;
		int i_11_ = 2147483647;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			int i_13_ = is[i_12_];
			if (i_13_ > i_9_ && i_13_ < i_11_) {
				i_10_ = i_12_;
				i_11_ = i_13_;
			}
		}
		return i_10_;
	}

	void method6021(int i, int i_14_, int i_15_, int i_16_, float[] fs, int i_17_) {
		int i_18_ = i_16_ - i_14_;
		int i_19_ = i_15_ - i;
		int i_20_ = i_18_ < 0 ? -i_18_ : i_18_;
		int i_21_ = i_18_ / i_19_;
		int i_22_ = i_14_;
		int i_23_ = 0;
		int i_24_ = i_18_ < 0 ? i_21_ - 1 : i_21_ + 1;
		i_20_ = i_20_ - (i_21_ < 0 ? -i_21_ : i_21_) * i_19_;
		fs[i] *= aFloatArray3971[i_22_];
		if (i_15_ > i_17_)
			i_15_ = i_17_;
		for (int i_25_ = i + 1; i_25_ < i_15_; i_25_++) {
			i_23_ += i_20_;
			if (i_23_ >= i_19_) {
				i_23_ -= i_19_;
				i_22_ += i_24_;
			} else
				i_22_ += i_21_;
			fs[i_25_] *= aFloatArray3971[i_22_];
		}
	}

	static int method6022(int[] is, int i) {
		int i_26_ = is[i];
		int i_27_ = -1;
		int i_28_ = -2147483648;
		for (int i_29_ = 0; i_29_ < i; i_29_++) {
			int i_30_ = is[i_29_];
			if (i_30_ < i_26_ && i_30_ > i_28_) {
				i_27_ = i_29_;
				i_28_ = i_30_;
			}
		}
		return i_27_;
	}

	void method6023(int i, int i_31_) {
		if (i < i_31_) {
			int i_32_ = i;
			int i_33_ = anIntArray3979[i_32_];
			int i_34_ = anIntArray3981[i_32_];
			boolean bool = aBoolArray3974[i_32_];
			for (int i_35_ = i + 1; i_35_ <= i_31_; i_35_++) {
				int i_36_ = anIntArray3979[i_35_];
				if (i_36_ < i_33_) {
					anIntArray3979[i_32_] = i_36_;
					anIntArray3981[i_32_] = anIntArray3981[i_35_];
					aBoolArray3974[i_32_] = aBoolArray3974[i_35_];
					i_32_++;
					anIntArray3979[i_35_] = anIntArray3979[i_32_];
					anIntArray3981[i_35_] = anIntArray3981[i_32_];
					aBoolArray3974[i_35_] = aBoolArray3974[i_32_];
				}
			}
			anIntArray3979[i_32_] = i_33_;
			anIntArray3981[i_32_] = i_34_;
			aBoolArray3974[i_32_] = bool;
			method6035(i, i_32_ - 1);
			method6035(i_32_ + 1, i_31_);
		}
	}

	Class338() {
		int i = Class282_Sub18.method12264(16);
		if (i != 1)
			throw new RuntimeException();
		int i_37_ = Class282_Sub18.method12264(5);
		int i_38_ = 0;
		((Class338) this).anIntArray3970 = new int[i_37_];
		for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
			int i_40_ = Class282_Sub18.method12264(4);
			((Class338) this).anIntArray3970[i_39_] = i_40_;
			if (i_40_ >= i_38_)
				i_38_ = i_40_ + 1;
		}
		((Class338) this).anIntArray3975 = new int[i_38_];
		((Class338) this).anIntArray3976 = new int[i_38_];
		((Class338) this).anIntArray3980 = new int[i_38_];
		((Class338) this).anIntArrayArray3977 = new int[i_38_][];
		for (int i_41_ = 0; i_41_ < i_38_; i_41_++) {
			((Class338) this).anIntArray3975[i_41_] = Class282_Sub18.method12264(3) + 1;
			int i_42_ = (((Class338) this).anIntArray3976[i_41_] = Class282_Sub18.method12264(2));
			if (i_42_ != 0)
				((Class338) this).anIntArray3980[i_41_] = Class282_Sub18.method12264(8);
			i_42_ = 1 << i_42_;
			int[] is = new int[i_42_];
			((Class338) this).anIntArrayArray3977[i_41_] = is;
			for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
				is[i_43_] = Class282_Sub18.method12264(8) - 1;
		}
		((Class338) this).anInt3978 = Class282_Sub18.method12264(2) + 1;
		int i_44_ = Class282_Sub18.method12264(4);
		int i_45_ = 2;
		for (int i_46_ = 0; i_46_ < i_37_; i_46_++)
			i_45_ += (((Class338) this).anIntArray3975[((Class338) this).anIntArray3970[i_46_]]);
		((Class338) this).anIntArray3972 = new int[i_45_];
		((Class338) this).anIntArray3972[0] = 0;
		((Class338) this).anIntArray3972[1] = 1 << i_44_;
		i_45_ = 2;
		for (int i_47_ = 0; i_47_ < i_37_; i_47_++) {
			int i_48_ = ((Class338) this).anIntArray3970[i_47_];
			for (int i_49_ = 0; i_49_ < ((Class338) this).anIntArray3975[i_48_]; i_49_++)
				((Class338) this).anIntArray3972[i_45_++] = Class282_Sub18.method12264(i_44_);
		}
		if (anIntArray3979 == null || anIntArray3979.length < i_45_) {
			anIntArray3979 = new int[i_45_];
			anIntArray3981 = new int[i_45_];
			aBoolArray3974 = new boolean[i_45_];
		}
	}

	boolean method6024() {
		boolean bool = Class282_Sub18.method12263() != 0;
		if (!bool)
			return false;
		int i = ((Class338) this).anIntArray3972.length;
		for (int i_50_ = 0; i_50_ < i; i_50_++)
			anIntArray3979[i_50_] = ((Class338) this).anIntArray3972[i_50_];
		int i_51_ = anIntArray3973[((Class338) this).anInt3978 - 1];
		int i_52_ = Class159.method2739(i_51_ - 1, -985364582);
		anIntArray3981[0] = Class282_Sub18.method12264(i_52_);
		anIntArray3981[1] = Class282_Sub18.method12264(i_52_);
		int i_53_ = 2;
		for (int i_54_ = 0; i_54_ < ((Class338) this).anIntArray3970.length; i_54_++) {
			int i_55_ = ((Class338) this).anIntArray3970[i_54_];
			int i_56_ = ((Class338) this).anIntArray3975[i_55_];
			int i_57_ = ((Class338) this).anIntArray3976[i_55_];
			int i_58_ = (1 << i_57_) - 1;
			int i_59_ = 0;
			if (i_57_ > 0)
				i_59_ = Class282_Sub18.aClass255Array7615[((Class338) this).anIntArray3980[i_55_]].method4384();
			for (int i_60_ = 0; i_60_ < i_56_; i_60_++) {
				int i_61_ = (((Class338) this).anIntArrayArray3977[i_55_][i_59_ & i_58_]);
				i_59_ >>>= i_57_;
				anIntArray3981[i_53_++] = (i_61_ >= 0 ? Class282_Sub18.aClass255Array7615[i_61_].method4384() : 0);
			}
		}
		return true;
	}

	void method6025(float[] fs, int i) {
		int i_62_ = ((Class338) this).anIntArray3972.length;
		int i_63_ = anIntArray3973[((Class338) this).anInt3978 - 1];
		boolean[] bools = aBoolArray3974;
		aBoolArray3974[1] = true;
		bools[0] = true;
		for (int i_64_ = 2; i_64_ < i_62_; i_64_++) {
			int i_65_ = method6022(anIntArray3979, i_64_);
			int i_66_ = method6020(anIntArray3979, i_64_);
			int i_67_ = method6019(anIntArray3979[i_65_], anIntArray3981[i_65_], anIntArray3979[i_66_], anIntArray3981[i_66_], anIntArray3979[i_64_]);
			int i_68_ = anIntArray3981[i_64_];
			int i_69_ = i_63_ - i_67_;
			int i_70_ = i_67_;
			int i_71_ = (i_69_ < i_70_ ? i_69_ : i_70_) << 1;
			if (i_68_ != 0) {
				boolean[] bools_72_ = aBoolArray3974;
				int i_73_ = i_65_;
				aBoolArray3974[i_66_] = true;
				bools_72_[i_73_] = true;
				aBoolArray3974[i_64_] = true;
				if (i_68_ >= i_71_)
					anIntArray3981[i_64_] = (i_69_ > i_70_ ? i_68_ - i_70_ + i_67_ : i_67_ - i_68_ + i_69_ - 1);
				else
					anIntArray3981[i_64_] = ((i_68_ & 0x1) != 0 ? i_67_ - (i_68_ + 1) / 2 : i_67_ + i_68_ / 2);
			} else {
				aBoolArray3974[i_64_] = false;
				anIntArray3981[i_64_] = i_67_;
			}
		}
		method6035(0, i_62_ - 1);
		int i_74_ = 0;
		int i_75_ = anIntArray3981[0] * ((Class338) this).anInt3978;
		for (int i_76_ = 1; i_76_ < i_62_; i_76_++) {
			if (aBoolArray3974[i_76_]) {
				int i_77_ = anIntArray3979[i_76_];
				int i_78_ = anIntArray3981[i_76_] * ((Class338) this).anInt3978;
				method6021(i_74_, i_75_, i_77_, i_78_, fs, i);
				if (i_77_ >= i)
					return;
				i_74_ = i_77_;
				i_75_ = i_78_;
			}
		}
		float f = aFloatArray3971[i_75_];
		for (int i_79_ = i_74_; i_79_ < i; i_79_++)
			fs[i_79_] *= f;
	}

	static {
		aFloatArray3971 = (new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F,
				7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
				5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
				4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
				3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F,
				0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F,
				0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
				0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F });
	}

	void method6026(int i, int i_80_) {
		if (i < i_80_) {
			int i_81_ = i;
			int i_82_ = anIntArray3979[i_81_];
			int i_83_ = anIntArray3981[i_81_];
			boolean bool = aBoolArray3974[i_81_];
			for (int i_84_ = i + 1; i_84_ <= i_80_; i_84_++) {
				int i_85_ = anIntArray3979[i_84_];
				if (i_85_ < i_82_) {
					anIntArray3979[i_81_] = i_85_;
					anIntArray3981[i_81_] = anIntArray3981[i_84_];
					aBoolArray3974[i_81_] = aBoolArray3974[i_84_];
					i_81_++;
					anIntArray3979[i_84_] = anIntArray3979[i_81_];
					anIntArray3981[i_84_] = anIntArray3981[i_81_];
					aBoolArray3974[i_84_] = aBoolArray3974[i_81_];
				}
			}
			anIntArray3979[i_81_] = i_82_;
			anIntArray3981[i_81_] = i_83_;
			aBoolArray3974[i_81_] = bool;
			method6035(i, i_81_ - 1);
			method6035(i_81_ + 1, i_80_);
		}
	}

	static int method6027(int[] is, int i) {
		int i_86_ = is[i];
		int i_87_ = -1;
		int i_88_ = 2147483647;
		for (int i_89_ = 0; i_89_ < i; i_89_++) {
			int i_90_ = is[i_89_];
			if (i_90_ > i_86_ && i_90_ < i_88_) {
				i_87_ = i_89_;
				i_88_ = i_90_;
			}
		}
		return i_87_;
	}

	int method6028(int i, int i_91_, int i_92_, int i_93_, int i_94_) {
		int i_95_ = i_93_ - i_91_;
		int i_96_ = i_92_ - i;
		int i_97_ = i_95_ < 0 ? -i_95_ : i_95_;
		int i_98_ = i_97_ * (i_94_ - i);
		int i_99_ = i_98_ / i_96_;
		return i_95_ < 0 ? i_91_ - i_99_ : i_91_ + i_99_;
	}

	void method6029(int i, int i_100_, int i_101_, int i_102_, float[] fs, int i_103_) {
		int i_104_ = i_102_ - i_100_;
		int i_105_ = i_101_ - i;
		int i_106_ = i_104_ < 0 ? -i_104_ : i_104_;
		int i_107_ = i_104_ / i_105_;
		int i_108_ = i_100_;
		int i_109_ = 0;
		int i_110_ = i_104_ < 0 ? i_107_ - 1 : i_107_ + 1;
		i_106_ = i_106_ - (i_107_ < 0 ? -i_107_ : i_107_) * i_105_;
		fs[i] *= aFloatArray3971[i_108_];
		if (i_101_ > i_103_)
			i_101_ = i_103_;
		for (int i_111_ = i + 1; i_111_ < i_101_; i_111_++) {
			i_109_ += i_106_;
			if (i_109_ >= i_105_) {
				i_109_ -= i_105_;
				i_108_ += i_110_;
			} else
				i_108_ += i_107_;
			fs[i_111_] *= aFloatArray3971[i_108_];
		}
	}

	static int method6030(int[] is, int i) {
		int i_112_ = is[i];
		int i_113_ = -1;
		int i_114_ = 2147483647;
		for (int i_115_ = 0; i_115_ < i; i_115_++) {
			int i_116_ = is[i_115_];
			if (i_116_ > i_112_ && i_116_ < i_114_) {
				i_113_ = i_115_;
				i_114_ = i_116_;
			}
		}
		return i_113_;
	}

	void method6031(int i, int i_117_) {
		if (i < i_117_) {
			int i_118_ = i;
			int i_119_ = anIntArray3979[i_118_];
			int i_120_ = anIntArray3981[i_118_];
			boolean bool = aBoolArray3974[i_118_];
			for (int i_121_ = i + 1; i_121_ <= i_117_; i_121_++) {
				int i_122_ = anIntArray3979[i_121_];
				if (i_122_ < i_119_) {
					anIntArray3979[i_118_] = i_122_;
					anIntArray3981[i_118_] = anIntArray3981[i_121_];
					aBoolArray3974[i_118_] = aBoolArray3974[i_121_];
					i_118_++;
					anIntArray3979[i_121_] = anIntArray3979[i_118_];
					anIntArray3981[i_121_] = anIntArray3981[i_118_];
					aBoolArray3974[i_121_] = aBoolArray3974[i_118_];
				}
			}
			anIntArray3979[i_118_] = i_119_;
			anIntArray3981[i_118_] = i_120_;
			aBoolArray3974[i_118_] = bool;
			method6035(i, i_118_ - 1);
			method6035(i_118_ + 1, i_117_);
		}
	}

	boolean method6032() {
		boolean bool = Class282_Sub18.method12263() != 0;
		if (!bool)
			return false;
		int i = ((Class338) this).anIntArray3972.length;
		for (int i_123_ = 0; i_123_ < i; i_123_++)
			anIntArray3979[i_123_] = ((Class338) this).anIntArray3972[i_123_];
		int i_124_ = anIntArray3973[((Class338) this).anInt3978 - 1];
		int i_125_ = Class159.method2739(i_124_ - 1, -1685312812);
		anIntArray3981[0] = Class282_Sub18.method12264(i_125_);
		anIntArray3981[1] = Class282_Sub18.method12264(i_125_);
		int i_126_ = 2;
		for (int i_127_ = 0; i_127_ < ((Class338) this).anIntArray3970.length; i_127_++) {
			int i_128_ = ((Class338) this).anIntArray3970[i_127_];
			int i_129_ = ((Class338) this).anIntArray3975[i_128_];
			int i_130_ = ((Class338) this).anIntArray3976[i_128_];
			int i_131_ = (1 << i_130_) - 1;
			int i_132_ = 0;
			if (i_130_ > 0)
				i_132_ = Class282_Sub18.aClass255Array7615[((Class338) this).anIntArray3980[i_128_]].method4384();
			for (int i_133_ = 0; i_133_ < i_129_; i_133_++) {
				int i_134_ = (((Class338) this).anIntArrayArray3977[i_128_][i_132_ & i_131_]);
				i_132_ >>>= i_130_;
				anIntArray3981[i_126_++] = (i_134_ >= 0 ? Class282_Sub18.aClass255Array7615[i_134_].method4384() : 0);
			}
		}
		return true;
	}

	void method6033(int i, int i_135_) {
		if (i < i_135_) {
			int i_136_ = i;
			int i_137_ = anIntArray3979[i_136_];
			int i_138_ = anIntArray3981[i_136_];
			boolean bool = aBoolArray3974[i_136_];
			for (int i_139_ = i + 1; i_139_ <= i_135_; i_139_++) {
				int i_140_ = anIntArray3979[i_139_];
				if (i_140_ < i_137_) {
					anIntArray3979[i_136_] = i_140_;
					anIntArray3981[i_136_] = anIntArray3981[i_139_];
					aBoolArray3974[i_136_] = aBoolArray3974[i_139_];
					i_136_++;
					anIntArray3979[i_139_] = anIntArray3979[i_136_];
					anIntArray3981[i_139_] = anIntArray3981[i_136_];
					aBoolArray3974[i_139_] = aBoolArray3974[i_136_];
				}
			}
			anIntArray3979[i_136_] = i_137_;
			anIntArray3981[i_136_] = i_138_;
			aBoolArray3974[i_136_] = bool;
			method6035(i, i_136_ - 1);
			method6035(i_136_ + 1, i_135_);
		}
	}

	void method6034(int i, int i_141_) {
		if (i < i_141_) {
			int i_142_ = i;
			int i_143_ = anIntArray3979[i_142_];
			int i_144_ = anIntArray3981[i_142_];
			boolean bool = aBoolArray3974[i_142_];
			for (int i_145_ = i + 1; i_145_ <= i_141_; i_145_++) {
				int i_146_ = anIntArray3979[i_145_];
				if (i_146_ < i_143_) {
					anIntArray3979[i_142_] = i_146_;
					anIntArray3981[i_142_] = anIntArray3981[i_145_];
					aBoolArray3974[i_142_] = aBoolArray3974[i_145_];
					i_142_++;
					anIntArray3979[i_145_] = anIntArray3979[i_142_];
					anIntArray3981[i_145_] = anIntArray3981[i_142_];
					aBoolArray3974[i_145_] = aBoolArray3974[i_142_];
				}
			}
			anIntArray3979[i_142_] = i_143_;
			anIntArray3981[i_142_] = i_144_;
			aBoolArray3974[i_142_] = bool;
			method6035(i, i_142_ - 1);
			method6035(i_142_ + 1, i_141_);
		}
	}

	void method6035(int i, int i_147_) {
		if (i < i_147_) {
			int i_148_ = i;
			int i_149_ = anIntArray3979[i_148_];
			int i_150_ = anIntArray3981[i_148_];
			boolean bool = aBoolArray3974[i_148_];
			for (int i_151_ = i + 1; i_151_ <= i_147_; i_151_++) {
				int i_152_ = anIntArray3979[i_151_];
				if (i_152_ < i_149_) {
					anIntArray3979[i_148_] = i_152_;
					anIntArray3981[i_148_] = anIntArray3981[i_151_];
					aBoolArray3974[i_148_] = aBoolArray3974[i_151_];
					i_148_++;
					anIntArray3979[i_151_] = anIntArray3979[i_148_];
					anIntArray3981[i_151_] = anIntArray3981[i_148_];
					aBoolArray3974[i_151_] = aBoolArray3974[i_148_];
				}
			}
			anIntArray3979[i_148_] = i_149_;
			anIntArray3981[i_148_] = i_150_;
			aBoolArray3974[i_148_] = bool;
			method6035(i, i_148_ - 1);
			method6035(i_148_ + 1, i_147_);
		}
	}

	boolean method6036() {
		boolean bool = Class282_Sub18.method12263() != 0;
		if (!bool)
			return false;
		int i = ((Class338) this).anIntArray3972.length;
		for (int i_153_ = 0; i_153_ < i; i_153_++)
			anIntArray3979[i_153_] = ((Class338) this).anIntArray3972[i_153_];
		int i_154_ = anIntArray3973[((Class338) this).anInt3978 - 1];
		int i_155_ = Class159.method2739(i_154_ - 1, 168983062);
		anIntArray3981[0] = Class282_Sub18.method12264(i_155_);
		anIntArray3981[1] = Class282_Sub18.method12264(i_155_);
		int i_156_ = 2;
		for (int i_157_ = 0; i_157_ < ((Class338) this).anIntArray3970.length; i_157_++) {
			int i_158_ = ((Class338) this).anIntArray3970[i_157_];
			int i_159_ = ((Class338) this).anIntArray3975[i_158_];
			int i_160_ = ((Class338) this).anIntArray3976[i_158_];
			int i_161_ = (1 << i_160_) - 1;
			int i_162_ = 0;
			if (i_160_ > 0)
				i_162_ = Class282_Sub18.aClass255Array7615[((Class338) this).anIntArray3980[i_158_]].method4384();
			for (int i_163_ = 0; i_163_ < i_159_; i_163_++) {
				int i_164_ = (((Class338) this).anIntArrayArray3977[i_158_][i_162_ & i_161_]);
				i_162_ >>>= i_160_;
				anIntArray3981[i_156_++] = (i_164_ >= 0 ? Class282_Sub18.aClass255Array7615[i_164_].method4384() : 0);
			}
		}
		return true;
	}

	void method6037(int i, int i_165_, int i_166_, int i_167_, float[] fs, int i_168_) {
		int i_169_ = i_167_ - i_165_;
		int i_170_ = i_166_ - i;
		int i_171_ = i_169_ < 0 ? -i_169_ : i_169_;
		int i_172_ = i_169_ / i_170_;
		int i_173_ = i_165_;
		int i_174_ = 0;
		int i_175_ = i_169_ < 0 ? i_172_ - 1 : i_172_ + 1;
		i_171_ = i_171_ - (i_172_ < 0 ? -i_172_ : i_172_) * i_170_;
		fs[i] *= aFloatArray3971[i_173_];
		if (i_166_ > i_168_)
			i_166_ = i_168_;
		for (int i_176_ = i + 1; i_176_ < i_166_; i_176_++) {
			i_174_ += i_171_;
			if (i_174_ >= i_170_) {
				i_174_ -= i_170_;
				i_173_ += i_175_;
			} else
				i_173_ += i_172_;
			fs[i_176_] *= aFloatArray3971[i_173_];
		}
	}

	boolean method6038() {
		boolean bool = Class282_Sub18.method12263() != 0;
		if (!bool)
			return false;
		int i = ((Class338) this).anIntArray3972.length;
		for (int i_177_ = 0; i_177_ < i; i_177_++)
			anIntArray3979[i_177_] = ((Class338) this).anIntArray3972[i_177_];
		int i_178_ = anIntArray3973[((Class338) this).anInt3978 - 1];
		int i_179_ = Class159.method2739(i_178_ - 1, -933930369);
		anIntArray3981[0] = Class282_Sub18.method12264(i_179_);
		anIntArray3981[1] = Class282_Sub18.method12264(i_179_);
		int i_180_ = 2;
		for (int i_181_ = 0; i_181_ < ((Class338) this).anIntArray3970.length; i_181_++) {
			int i_182_ = ((Class338) this).anIntArray3970[i_181_];
			int i_183_ = ((Class338) this).anIntArray3975[i_182_];
			int i_184_ = ((Class338) this).anIntArray3976[i_182_];
			int i_185_ = (1 << i_184_) - 1;
			int i_186_ = 0;
			if (i_184_ > 0)
				i_186_ = Class282_Sub18.aClass255Array7615[((Class338) this).anIntArray3980[i_182_]].method4384();
			for (int i_187_ = 0; i_187_ < i_183_; i_187_++) {
				int i_188_ = (((Class338) this).anIntArrayArray3977[i_182_][i_186_ & i_185_]);
				i_186_ >>>= i_184_;
				anIntArray3981[i_180_++] = (i_188_ >= 0 ? Class282_Sub18.aClass255Array7615[i_188_].method4384() : 0);
			}
		}
		return true;
	}

	void method6039(float[] fs, int i) {
		int i_189_ = ((Class338) this).anIntArray3972.length;
		int i_190_ = anIntArray3973[((Class338) this).anInt3978 - 1];
		boolean[] bools = aBoolArray3974;
		aBoolArray3974[1] = true;
		bools[0] = true;
		for (int i_191_ = 2; i_191_ < i_189_; i_191_++) {
			int i_192_ = method6022(anIntArray3979, i_191_);
			int i_193_ = method6020(anIntArray3979, i_191_);
			int i_194_ = method6019(anIntArray3979[i_192_], anIntArray3981[i_192_], anIntArray3979[i_193_], anIntArray3981[i_193_], anIntArray3979[i_191_]);
			int i_195_ = anIntArray3981[i_191_];
			int i_196_ = i_190_ - i_194_;
			int i_197_ = i_194_;
			int i_198_ = (i_196_ < i_197_ ? i_196_ : i_197_) << 1;
			if (i_195_ != 0) {
				boolean[] bools_199_ = aBoolArray3974;
				int i_200_ = i_192_;
				aBoolArray3974[i_193_] = true;
				bools_199_[i_200_] = true;
				aBoolArray3974[i_191_] = true;
				if (i_195_ >= i_198_)
					anIntArray3981[i_191_] = (i_196_ > i_197_ ? i_195_ - i_197_ + i_194_ : i_194_ - i_195_ + i_196_ - 1);
				else
					anIntArray3981[i_191_] = ((i_195_ & 0x1) != 0 ? i_194_ - (i_195_ + 1) / 2 : i_194_ + i_195_ / 2);
			} else {
				aBoolArray3974[i_191_] = false;
				anIntArray3981[i_191_] = i_194_;
			}
		}
		method6035(0, i_189_ - 1);
		int i_201_ = 0;
		int i_202_ = anIntArray3981[0] * ((Class338) this).anInt3978;
		for (int i_203_ = 1; i_203_ < i_189_; i_203_++) {
			if (aBoolArray3974[i_203_]) {
				int i_204_ = anIntArray3979[i_203_];
				int i_205_ = anIntArray3981[i_203_] * ((Class338) this).anInt3978;
				method6021(i_201_, i_202_, i_204_, i_205_, fs, i);
				if (i_204_ >= i)
					return;
				i_201_ = i_204_;
				i_202_ = i_205_;
			}
		}
		float f = aFloatArray3971[i_202_];
		for (int i_206_ = i_201_; i_206_ < i; i_206_++)
			fs[i_206_] *= f;
	}
}
