/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13 {
	static SoftCache aClass229_127 = new SoftCache(32);
	static int anInt128;
	static String[] aStringArray129;
	static int anInt130;

	Class13() throws Throwable {
		throw new Error();
	}

	static void method489() {
		synchronized (aClass229_127) {
			aClass229_127.method3859(-1379442480);
		}
	}

	public static MeshRasterizer method490(GraphicalRenderer class505, int i, int i_0_, int i_1_, int i_2_, int i_3_, MeshRasterizer class528, int i_4_, int i_5_, int i_6_, int i_7_, Class456 class456) {
		if (null == class528)
			return null;
		int i_8_ = 2055;
		if (null != class456) {
			i_8_ |= class456.method7640(-1713393537);
			i_8_ &= ~0x200;
		}
		long l = (((long) i_5_ << 48) + (((long) i_4_ << 32) + (long) (i_3_ + (i_6_ << 16) + (i_7_ << 24))));
		MeshRasterizer class528_9_;
		synchronized (aClass229_127) {
			class528_9_ = (MeshRasterizer) aClass229_127.get(l);
		}
		if (class528_9_ == null || class505.method8452(class528_9_.m(), i_8_) != 0) {
			if (null != class528_9_)
				i_8_ = class505.method8546(i_8_, class528_9_.m());
			int i_10_;
			if (i_3_ == 1)
				i_10_ = 9;
			else if (2 == i_3_)
				i_10_ = 12;
			else if (3 == i_3_)
				i_10_ = 15;
			else if (i_3_ == 4)
				i_10_ = 18;
			else
				i_10_ = 21;
			int i_11_ = 3;
			int[] is = { 64, 96, 128 };
			RSMesh class157 = new RSMesh(i_11_ * i_10_ + 1, 2 * (i_10_ * i_11_) - i_10_, 0);
			int i_12_ = class157.method2662(0, 0, 0);
			int[][] is_13_ = new int[i_11_][i_10_];
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				int i_15_ = is[i_14_];
				int i_16_ = is[i_14_];
				for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
					int i_18_ = (i_17_ << 14) / i_10_;
					int i_19_ = Class382.anIntArray4657[i_18_] * i_15_ >> 14;
					int i_20_ = i_16_ * Class382.anIntArray4661[i_18_] >> 14;
					is_13_[i_14_][i_17_] = class157.method2662(i_19_, 0, i_20_);
				}
			}
			for (int i_21_ = 0; i_21_ < i_11_; i_21_++) {
				int i_22_ = (i_21_ * 256 + 128) / i_11_;
				int i_23_ = 256 - i_22_;
				byte i_24_ = (byte) (i_22_ * i_7_ + i_23_ * i_6_ >> 8);
				short i_25_ = (short) ((((i_5_ & 0x7f) * i_22_ + (i_4_ & 0x7f) * i_23_ & 0x7f00) + (((i_23_ * (i_4_ & 0x380) + (i_5_ & 0x380) * i_22_) & 0x38000) + (((i_5_ & 0xfc00) * i_22_ + i_23_ * (i_4_ & 0xfc00)) & 0xfc0000))) >> 8);
				for (int i_26_ = 0; i_26_ < i_10_; i_26_++) {
					if (0 == i_21_)
						class157.method2663(i_12_, is_13_[0][(1 + i_26_) % i_10_], is_13_[0][i_26_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
					else {
						class157.method2663(is_13_[i_21_ - 1][i_26_], (is_13_[i_21_ - 1][(1 + i_26_) % i_10_]), is_13_[i_21_][(i_26_ + 1) % i_10_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
						class157.method2663(is_13_[i_21_ - 1][i_26_], is_13_[i_21_][(1 + i_26_) % i_10_], is_13_[i_21_][i_26_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
					}
				}
			}
			class528_9_ = class505.createMeshRasterizer(class157, i_8_, 1257126031 * anInt128, 64, 768);
			synchronized (aClass229_127) {
				aClass229_127.put(class528_9_, l);
			}
		}
		int i_27_ = class528.RA();
		int i_28_ = class528.ya();
		int i_29_ = class528.AA();
		int i_30_ = class528.ha();
		if (class456 != null) {
			class528_9_ = class528_9_.method11289((byte) 3, i_8_, true);
			class528_9_.oa(i_28_ - i_27_ >> 1, 128, i_30_ - i_29_ >> 1);
			class528_9_.ia(i_28_ + i_27_ >> 1, 0, i_29_ + i_30_ >> 1);
			class456.method7579(class528_9_, 1543118150);
		} else {
			class528_9_ = class528_9_.method11289((byte) 3, i_8_, true);
			class528_9_.oa(i_28_ - i_27_ >> 1, 128, i_30_ - i_29_ >> 1);
			class528_9_.ia(i_27_ + i_28_ >> 1, 0, i_29_ + i_30_ >> 1);
		}
		if (i_0_ != 0)
			class528_9_.t(i_0_);
		if (0 != i_1_)
			class528_9_.EA(i_1_);
		if (i_2_ != 0)
			class528_9_.ia(0, i_2_, 0);
		return class528_9_;
	}

	public static MeshRasterizer method491(GraphicalRenderer class505, int i, int i_31_, int i_32_, int i_33_, int i_34_, MeshRasterizer class528, int i_35_, int i_36_, int i_37_, int i_38_, Class456 class456) {
		if (null == class528)
			return null;
		int i_39_ = 2055;
		if (null != class456) {
			i_39_ |= class456.method7640(-830479338);
			i_39_ &= ~0x200;
		}
		long l = (((long) i_36_ << 48) + (((long) i_35_ << 32) + (long) (i_34_ + (i_37_ << 16) + (i_38_ << 24))));
		MeshRasterizer class528_40_;
		synchronized (aClass229_127) {
			class528_40_ = (MeshRasterizer) aClass229_127.get(l);
		}
		if (class528_40_ == null || class505.method8452(class528_40_.m(), i_39_) != 0) {
			if (null != class528_40_)
				i_39_ = class505.method8546(i_39_, class528_40_.m());
			int i_41_;
			if (i_34_ == 1)
				i_41_ = 9;
			else if (2 == i_34_)
				i_41_ = 12;
			else if (3 == i_34_)
				i_41_ = 15;
			else if (i_34_ == 4)
				i_41_ = 18;
			else
				i_41_ = 21;
			int i_42_ = 3;
			int[] is = { 64, 96, 128 };
			RSMesh class157 = new RSMesh(i_42_ * i_41_ + 1, 2 * (i_41_ * i_42_) - i_41_, 0);
			int i_43_ = class157.method2662(0, 0, 0);
			int[][] is_44_ = new int[i_42_][i_41_];
			for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
				int i_46_ = is[i_45_];
				int i_47_ = is[i_45_];
				for (int i_48_ = 0; i_48_ < i_41_; i_48_++) {
					int i_49_ = (i_48_ << 14) / i_41_;
					int i_50_ = Class382.anIntArray4657[i_49_] * i_46_ >> 14;
					int i_51_ = i_47_ * Class382.anIntArray4661[i_49_] >> 14;
					is_44_[i_45_][i_48_] = class157.method2662(i_50_, 0, i_51_);
				}
			}
			for (int i_52_ = 0; i_52_ < i_42_; i_52_++) {
				int i_53_ = (i_52_ * 256 + 128) / i_42_;
				int i_54_ = 256 - i_53_;
				byte i_55_ = (byte) (i_53_ * i_38_ + i_54_ * i_37_ >> 8);
				short i_56_ = (short) (((((i_36_ & 0x7f) * i_53_ + (i_35_ & 0x7f) * i_54_) & 0x7f00) + (((i_54_ * (i_35_ & 0x380) + (i_36_ & 0x380) * i_53_) & 0x38000) + (((i_36_ & 0xfc00) * i_53_ + i_54_ * (i_35_ & 0xfc00)) & 0xfc0000))) >> 8);
				for (int i_57_ = 0; i_57_ < i_41_; i_57_++) {
					if (0 == i_52_)
						class157.method2663(i_43_, is_44_[0][(1 + i_57_) % i_41_], is_44_[0][i_57_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
					else {
						class157.method2663(is_44_[i_52_ - 1][i_57_], (is_44_[i_52_ - 1][(1 + i_57_) % i_41_]), is_44_[i_52_][(i_57_ + 1) % i_41_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
						class157.method2663(is_44_[i_52_ - 1][i_57_], is_44_[i_52_][(1 + i_57_) % i_41_], is_44_[i_52_][i_57_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
					}
				}
			}
			class528_40_ = class505.createMeshRasterizer(class157, i_39_, 1257126031 * anInt128, 64, 768);
			synchronized (aClass229_127) {
				aClass229_127.put(class528_40_, l);
			}
		}
		int i_58_ = class528.RA();
		int i_59_ = class528.ya();
		int i_60_ = class528.AA();
		int i_61_ = class528.ha();
		if (class456 != null) {
			class528_40_ = class528_40_.method11289((byte) 3, i_39_, true);
			class528_40_.oa(i_59_ - i_58_ >> 1, 128, i_61_ - i_60_ >> 1);
			class528_40_.ia(i_59_ + i_58_ >> 1, 0, i_60_ + i_61_ >> 1);
			class456.method7579(class528_40_, 1997700347);
		} else {
			class528_40_ = class528_40_.method11289((byte) 3, i_39_, true);
			class528_40_.oa(i_59_ - i_58_ >> 1, 128, i_61_ - i_60_ >> 1);
			class528_40_.ia(i_58_ + i_59_ >> 1, 0, i_60_ + i_61_ >> 1);
		}
		if (i_31_ != 0)
			class528_40_.t(i_31_);
		if (0 != i_32_)
			class528_40_.EA(i_32_);
		if (i_33_ != 0)
			class528_40_.ia(0, i_33_, 0);
		return class528_40_;
	}

	static void method492(int i) {
		anInt128 = 1984685679 * i;
		synchronized (aClass229_127) {
			aClass229_127.method3859(-1886061314);
		}
	}

	static void method493() {
		synchronized (aClass229_127) {
			aClass229_127.method3859(-1008356827);
		}
	}

	static void method494() {
		synchronized (aClass229_127) {
			aClass229_127.method3859(-1475288627);
		}
	}

	static void method495(int i) {
		anInt128 = 1984685679 * i;
		synchronized (aClass229_127) {
			aClass229_127.method3859(118075989);
		}
	}

	static void method496(int i) {
		anInt128 = 1984685679 * i;
		synchronized (aClass229_127) {
			aClass229_127.method3859(-606564197);
		}
	}

	static void method497() {
		synchronized (aClass229_127) {
			aClass229_127.method3859(147155939);
		}
	}

	static void method498(int i) {
		synchronized (aClass229_127) {
			aClass229_127.method3858(i, (byte) 3);
		}
	}

	static void method499(int i) {
		synchronized (aClass229_127) {
			aClass229_127.method3858(i, (byte) -59);
		}
	}

	static void method500(int i) {
		synchronized (aClass229_127) {
			aClass229_127.method3858(i, (byte) 22);
		}
	}

	static final void method501(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		class118.aBool1322 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) -70);
	}

	static final void method502(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 2090816514);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1403 = Class351.method6193(string, class527, 1107987835);
		class118.anIntArray1315 = is;
		class118.aBool1384 = true;
	}

	static void method503(Class282_Sub50_Sub15 class282_sub50_sub15, int i) {
		boolean bool = false;
		class282_sub50_sub15.method13452((byte) -5);
		for (Class282_Sub50_Sub15 class282_sub50_sub15_62_ = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15_62_; class282_sub50_sub15_62_ = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-1642244739))) {
			if (Class301.method5334(class282_sub50_sub15.method15244((byte) 107), class282_sub50_sub15_62_.method15244((byte) 59), 993157847)) {
				Class224.method3782(class282_sub50_sub15, class282_sub50_sub15_62_, -1979656463);
				bool = true;
				break;
			}
		}
		if (!bool)
			Class20.aClass477_182.method7936(class282_sub50_sub15, -1738910950);
	}

	static final void method504(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -1176728971 * Class517.anInt5904;
	}

	static final void method505(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		int i_63_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_63_, (byte) 0);
		if (!class437.aString5335.equals(string))
			class118.method2000(i_63_, string, 2122573770);
		else
			class118.method1995(i_63_, -1265527536);
	}

	static final void method506(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		class118.anInt1376 = -280394239 * (class527.intStack[1942118537 * class527.anInt7012]);
		class118.anInt1314 = (1004789833 * (class527.intStack[class527.anInt7012 * 1942118537 + 1]));
		Class109.method1858(class118, (byte) -10);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -1735080264);
	}

	public static final int method507(int i, int i_64_, int i_65_, int i_66_, int i_67_, byte i_68_) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-888508075) == null)
			return 0;
		if (i_67_ < 3) {
			Class311 class311 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
			int i_69_ = i >> 9;
			int i_70_ = i_64_ >> 9;
			if (i_65_ < 0 || i_66_ < 0 || i_65_ > IndexLoaders.MAP_REGION_DECODER.method4424(1440924603) - 1 || i_66_ > IndexLoaders.MAP_REGION_DECODER.method4451(-1516017407) - 1)
				return 0;
			if (i_69_ < 1 || i_70_ < 1 || i_69_ > IndexLoaders.MAP_REGION_DECODER.method4424(645551626) - 1 || i_70_ > IndexLoaders.MAP_REGION_DECODER.method4451(-608520237) - 1)
				return 0;
			boolean bool = (0 != (class311.aByteArrayArrayArray3638[1][i >> 9][i_64_ >> 9] & 0x2));
			if (0 == (i & 0x1ff)) {
				boolean bool_71_ = 0 != ((class311.aByteArrayArrayArray3638[1][i_69_ - 1][i_64_ >> 9]) & 0x2);
				boolean bool_72_ = ((class311.aByteArrayArrayArray3638[1][i_69_][i_64_ >> 9] & 0x2) != 0);
				if (bool_72_ != bool_71_)
					bool = (class311.aByteArrayArrayArray3638[1][i_65_][i_66_] & 0x2) != 0;
			}
			if ((i_64_ & 0x1ff) == 0) {
				boolean bool_73_ = 0 != ((class311.aByteArrayArrayArray3638[1][i >> 9][i_70_ - 1]) & 0x2);
				boolean bool_74_ = ((class311.aByteArrayArrayArray3638[1][i >> 9][i_70_] & 0x2) != 0);
				if (bool_73_ != bool_74_)
					bool = 0 != ((class311.aByteArrayArrayArray3638[1][i_65_][i_66_]) & 0x2);
			}
			if (bool)
				i_67_++;
		}
		return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1611665057).aClass390Array2591[i_67_].method6709(i, i_64_, -1580541166);
	}

	public static void method508(boolean bool, boolean bool_75_, int i) {
		if (bool) {
			Class540.anInt7137 -= -1089474401;
			if (0 == -1384830113 * Class540.anInt7137)
				Class335.anIntArray3916 = null;
		}
		if (bool_75_) {
			Class540.anInt7135 -= 2019563659;
			if (0 == 89493283 * Class540.anInt7135)
				Class540.anIntArray7136 = null;
		}
	}
}
