/* Class282_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub30 extends Node {
	int[] anIntArray7709;
	int[] anIntArray7710 = { -1 };
	static IterableNodeMap aClass465_7711 = new IterableNodeMap(32);
	static SoftCache aClass229_7712 = new SoftCache(11);

	static void method12427() {
		aClass465_7711.method7749(-1248616800);
	}

	public static int method12428(int i, int i_0_, boolean bool, boolean bool_1_) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool_1_, -418182201);
		if (class282_sub30 == null)
			return 0;
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_3_++) {
			if (((Class282_Sub30) class282_sub30).anIntArray7710[i_3_] >= 0 && (((Class282_Sub30) class282_sub30).anIntArray7710[i_3_] < -1662523091 * IndexLoaders.ITEM_INDEX_LOADER.maxItemsCount)) {
				ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((((Class282_Sub30) class282_sub30).anIntArray7710[i_3_]), 1939490794);
				int i_4_ = class425.method7099(i_0_, ((Class125.aClass424_1573.method7069(i_0_, (byte) 0).anInt5337) * -1741480635), -655698445);
				if (bool)
					i_2_ += i_4_ * (((Class282_Sub30) class282_sub30).anIntArray7709[i_3_]);
				else
					i_2_ += i_4_;
			}
		}
		return i_2_;
	}

	final MeshRasterizer method12429(GraphicalRenderer class505, int i, Class456 class456, int i_5_, boolean bool, PlayerAppearance class238, int i_6_) {
		MeshRasterizer class528 = null;
		int i_7_ = i;
		Class227 class227 = null;
		if (-1 != i_5_)
			class227 = Class96_Sub16.aClass211_9383.method3616(i_5_, (byte) 66);
		int[] is = ((Class282_Sub30) this).anIntArray7710;
		if (null != class227 && class227.anIntArray2811 != null) {
			is = new int[class227.anIntArray2811.length];
			for (int i_8_ = 0; i_8_ < class227.anIntArray2811.length; i_8_++) {
				int i_9_ = class227.anIntArray2811[i_8_];
				if (i_9_ >= 0 && i_9_ < ((Class282_Sub30) this).anIntArray7710.length)
					is[i_8_] = ((Class282_Sub30) this).anIntArray7710[i_9_];
				else
					is[i_8_] = -1;
			}
		}
		if (null != class456)
			i_7_ |= class456.method7640(-1290274733);
		long l = method12444(is, i_5_, class238 != null ? class238.colors : null, bool, 583894637);
		if (aClass229_7712 != null)
			class528 = (MeshRasterizer) aClass229_7712.method3865(l);
		if (null == class528 || class505.method8452(class528.m(), i_7_) != 0) {
			if (class528 != null)
				i_7_ = class505.method8546(i_7_, class528.m());
			int i_10_ = i_7_;
			boolean bool_11_ = false;
			for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
				if (is[i_12_] != -1 && !IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(is[i_12_], 1950538416).bodyMeshesReady(bool, null, -763899504))
					bool_11_ = true;
			}
			if (bool_11_)
				return null;
			RSMesh[] class157s = new RSMesh[is.length];
			for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
				if (is[i_13_] != -1)
					class157s[i_13_] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(is[i_13_], 584500075).getBodyMesh(bool, null, 2085001887);
			}
			if (null != class227 && class227.anIntArrayArray2802 != null) {
				for (int i_14_ = 0; i_14_ < class227.anIntArrayArray2802.length; i_14_++) {
					if (null != class227.anIntArrayArray2802[i_14_] && class157s[i_14_] != null) {
						int i_15_ = class227.anIntArrayArray2802[i_14_][0];
						int i_16_ = class227.anIntArrayArray2802[i_14_][1];
						int i_17_ = class227.anIntArrayArray2802[i_14_][2];
						int i_18_ = class227.anIntArrayArray2802[i_14_][3];
						int i_19_ = class227.anIntArrayArray2802[i_14_][4];
						int i_20_ = class227.anIntArrayArray2802[i_14_][5];
						if (i_18_ != 0 || i_19_ != 0 || i_20_ != 0)
							class157s[i_14_].method2671(i_18_, i_19_, i_20_);
						if (i_15_ != 0 || i_16_ != 0 || i_17_ != 0)
							class157s[i_14_].method2712(i_15_, i_16_, i_17_);
					}
				}
			}
			RSMesh class157 = new RSMesh(class157s, class157s.length);
			if (class238 != null)
				i_10_ |= 0x4000;
			class528 = class505.createMeshRasterizer(class157, i_10_, -939931493 * Class105.anInt1069, 65, 857);
			if (class238 != null) {
				for (int i_21_ = 0; i_21_ < 10; i_21_++) {
					for (int i_22_ = 0; i_22_ < (AbstractQueue_Sub1.SKIN_COLORS[i_21_]).length; i_22_++) {
						if (class238.colors[i_21_] < (Class366.SKIN_COLORS[i_21_][i_22_]).length)
							class528.X((AbstractQueue_Sub1.SKIN_COLORS[i_21_][i_22_]), (Class366.SKIN_COLORS[i_21_][i_22_][class238.colors[i_21_]]));
					}
				}
			}
			if (null != aClass229_7712) {
				class528.KA(i_7_);
				aClass229_7712.put(class528, l);
			}
		}
		if (class456 == null)
			return class528;
		MeshRasterizer class528_23_ = class528.method11289((byte) 1, i_7_, true);
		class456.method7577(class528_23_, 0, 16711935);
		return class528_23_;
	}

	static void method12430(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 355510515);
		if (class282_sub30 != null)
			class282_sub30.unlink(-371378792);
	}

	static void method12431(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -1064510317);
		if (class282_sub30 != null)
			class282_sub30.unlink(-371378792);
	}

	public static int method12432(int i, int i_24_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -1976659745);
		if (null == class282_sub30)
			return 0;
		if (i_24_ < 0 || i_24_ >= (((Class282_Sub30) class282_sub30).anIntArray7709).length)
			return 0;
		return ((Class282_Sub30) class282_sub30).anIntArray7709[i_24_];
	}

	public static int method12433(int i, int i_25_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -171466149);
		if (null == class282_sub30)
			return 0;
		if (i_25_ < 0 || i_25_ >= (((Class282_Sub30) class282_sub30).anIntArray7709).length)
			return 0;
		return ((Class282_Sub30) class282_sub30).anIntArray7709[i_25_];
	}

	public static int method12434(int i, int i_26_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -2028569269);
		if (null == class282_sub30)
			return 0;
		if (i_26_ < 0 || i_26_ >= (((Class282_Sub30) class282_sub30).anIntArray7709).length)
			return 0;
		return ((Class282_Sub30) class282_sub30).anIntArray7709[i_26_];
	}

	public static int method12435(int i, int i_27_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 803788572);
		if (class282_sub30 == null)
			return 0;
		if (-1 == i_27_)
			return 0;
		int i_28_ = 0;
		for (int i_29_ = 0; i_29_ < ((Class282_Sub30) class282_sub30).anIntArray7709.length; i_29_++) {
			if (((Class282_Sub30) class282_sub30).anIntArray7710[i_29_] == i_27_)
				i_28_ += ((Class282_Sub30) class282_sub30).anIntArray7709[i_29_];
		}
		return i_28_;
	}

	static void method12436(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 706400111);
		if (null != class282_sub30) {
			for (int i_30_ = 0; (i_30_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_30_++) {
				((Class282_Sub30) class282_sub30).anIntArray7710[i_30_] = -1;
				((Class282_Sub30) class282_sub30).anIntArray7709[i_30_] = 0;
			}
		}
	}

	public static int method12437(int i, int i_31_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -2101164589);
		if (class282_sub30 == null)
			return 0;
		if (-1 == i_31_)
			return 0;
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < ((Class282_Sub30) class282_sub30).anIntArray7709.length; i_33_++) {
			if (((Class282_Sub30) class282_sub30).anIntArray7710[i_33_] == i_31_)
				i_32_ += ((Class282_Sub30) class282_sub30).anIntArray7709[i_33_];
		}
		return i_32_;
	}

	static void method12438(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 638529549);
		if (class282_sub30 != null)
			class282_sub30.unlink(-371378792);
	}

	static void method12439(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -1515589512);
		if (class282_sub30 != null)
			class282_sub30.unlink(-371378792);
	}

	public static int method12440(int i, int i_34_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 394407435);
		if (null == class282_sub30)
			return -1;
		if (i_34_ < 0 || i_34_ >= (((Class282_Sub30) class282_sub30).anIntArray7710).length)
			return -1;
		return ((Class282_Sub30) class282_sub30).anIntArray7710[i_34_];
	}

	static void method12441(int i, int i_35_, int i_36_, int i_37_, boolean bool) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		Class282_Sub30 class282_sub30 = (Class282_Sub30) aClass465_7711.method7754(l);
		if (null == class282_sub30) {
			class282_sub30 = new Class282_Sub30();
			aClass465_7711.method7765(class282_sub30, l);
		}
		if (((Class282_Sub30) class282_sub30).anIntArray7710.length <= i_35_) {
			int[] is = new int[1 + i_35_];
			int[] is_38_ = new int[i_35_ + 1];
			for (int i_39_ = 0; (i_39_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_39_++) {
				is[i_39_] = ((Class282_Sub30) class282_sub30).anIntArray7710[i_39_];
				is_38_[i_39_] = ((Class282_Sub30) class282_sub30).anIntArray7709[i_39_];
			}
			for (int i_40_ = ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_40_ < i_35_; i_40_++) {
				is[i_40_] = -1;
				is_38_[i_40_] = 0;
			}
			((Class282_Sub30) class282_sub30).anIntArray7710 = is;
			((Class282_Sub30) class282_sub30).anIntArray7709 = is_38_;
		}
		((Class282_Sub30) class282_sub30).anIntArray7710[i_35_] = i_36_;
		((Class282_Sub30) class282_sub30).anIntArray7709[i_35_] = i_37_;
	}

	static void method12442(int i, int i_41_, int i_42_, int i_43_, boolean bool) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		Class282_Sub30 class282_sub30 = (Class282_Sub30) aClass465_7711.method7754(l);
		if (null == class282_sub30) {
			class282_sub30 = new Class282_Sub30();
			aClass465_7711.method7765(class282_sub30, l);
		}
		if (((Class282_Sub30) class282_sub30).anIntArray7710.length <= i_41_) {
			int[] is = new int[1 + i_41_];
			int[] is_44_ = new int[i_41_ + 1];
			for (int i_45_ = 0; (i_45_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_45_++) {
				is[i_45_] = ((Class282_Sub30) class282_sub30).anIntArray7710[i_45_];
				is_44_[i_45_] = ((Class282_Sub30) class282_sub30).anIntArray7709[i_45_];
			}
			for (int i_46_ = ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_46_ < i_41_; i_46_++) {
				is[i_46_] = -1;
				is_44_[i_46_] = 0;
			}
			((Class282_Sub30) class282_sub30).anIntArray7710 = is;
			((Class282_Sub30) class282_sub30).anIntArray7709 = is_44_;
		}
		((Class282_Sub30) class282_sub30).anIntArray7710[i_41_] = i_42_;
		((Class282_Sub30) class282_sub30).anIntArray7709[i_41_] = i_43_;
	}

	static void method12443(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -1420663111);
		if (null != class282_sub30) {
			for (int i_47_ = 0; (i_47_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_47_++) {
				((Class282_Sub30) class282_sub30).anIntArray7710[i_47_] = -1;
				((Class282_Sub30) class282_sub30).anIntArray7709[i_47_] = 0;
			}
		}
	}

	long method12444(int[] is, int i, int[] is_48_, boolean bool, int i_49_) {
		long[] ls = RsByteBuffer.aLongArray7979;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_50_ = 0; i_50_ < is.length; i_50_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_50_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_50_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_50_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_50_]) & 0xffL)];
		}
		if (null != is_48_) {
			for (int i_51_ = 0; i_51_ < 5; i_51_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_48_[i_51_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	static void method12445(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -621031648);
		if (null != class282_sub30) {
			for (int i_52_ = 0; (i_52_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_52_++) {
				((Class282_Sub30) class282_sub30).anIntArray7710[i_52_] = -1;
				((Class282_Sub30) class282_sub30).anIntArray7709[i_52_] = 0;
			}
		}
	}

	static void method12446(int i, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 813668022);
		if (null != class282_sub30) {
			for (int i_53_ = 0; (i_53_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_53_++) {
				((Class282_Sub30) class282_sub30).anIntArray7710[i_53_] = -1;
				((Class282_Sub30) class282_sub30).anIntArray7709[i_53_] = 0;
			}
		}
	}

	static void method12447() {
		aClass465_7711.method7749(-654712600);
	}

	long method12448(int[] is, int i, int[] is_54_, boolean bool) {
		long[] ls = RsByteBuffer.aLongArray7979;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_55_ = 0; i_55_ < is.length; i_55_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_55_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_55_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_55_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_55_]) & 0xffL)];
		}
		if (null != is_54_) {
			for (int i_56_ = 0; i_56_ < 5; i_56_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_54_[i_56_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	Class282_Sub30() {
		((Class282_Sub30) this).anIntArray7709 = new int[] { 0 };
	}

	public static int method12449(int i, int i_57_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 1959797024);
		if (class282_sub30 == null)
			return 0;
		if (-1 == i_57_)
			return 0;
		int i_58_ = 0;
		for (int i_59_ = 0; i_59_ < ((Class282_Sub30) class282_sub30).anIntArray7709.length; i_59_++) {
			if (((Class282_Sub30) class282_sub30).anIntArray7710[i_59_] == i_57_)
				i_58_ += ((Class282_Sub30) class282_sub30).anIntArray7709[i_59_];
		}
		return i_58_;
	}

	public static int method12450(int i, boolean bool) {
		if (bool)
			return 0;
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -2137382631);
		if (class282_sub30 == null)
			return ((Class96_Sub10.aClass392_9298.method6735(i, (short) 29499).anInt10277) * 875957203);
		int i_60_ = 0;
		for (int i_61_ = 0; i_61_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_61_++) {
			if (-1 == ((Class282_Sub30) class282_sub30).anIntArray7710[i_61_])
				i_60_++;
		}
		i_60_ += ((Class96_Sub10.aClass392_9298.method6735(i, (short) 13394).anInt10277) * 875957203 - ((Class282_Sub30) class282_sub30).anIntArray7710.length);
		return i_60_;
	}

	static void method12451() {
		aClass465_7711.method7749(-973093102);
	}

	public static int method12452(int i, boolean bool) {
		if (bool)
			return 0;
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -1568714544);
		if (class282_sub30 == null)
			return ((Class96_Sub10.aClass392_9298.method6735(i, (short) 6995).anInt10277) * 875957203);
		int i_62_ = 0;
		for (int i_63_ = 0; i_63_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_63_++) {
			if (-1 == ((Class282_Sub30) class282_sub30).anIntArray7710[i_63_])
				i_62_++;
		}
		i_62_ += ((Class96_Sub10.aClass392_9298.method6735(i, (short) 15586).anInt10277) * 875957203 - ((Class282_Sub30) class282_sub30).anIntArray7710.length);
		return i_62_;
	}

	public static int method12453(int i, int i_64_, boolean bool) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 1938631637);
		if (null == class282_sub30)
			return -1;
		if (i_64_ < 0 || i_64_ >= (((Class282_Sub30) class282_sub30).anIntArray7710).length)
			return -1;
		return ((Class282_Sub30) class282_sub30).anIntArray7710[i_64_];
	}

	final MeshRasterizer method12454(GraphicalRenderer class505, int i, Class456 class456, int i_65_, boolean bool, PlayerAppearance class238) {
		MeshRasterizer class528 = null;
		int i_66_ = i;
		Class227 class227 = null;
		if (-1 != i_65_)
			class227 = Class96_Sub16.aClass211_9383.method3616(i_65_, (byte) -18);
		int[] is = ((Class282_Sub30) this).anIntArray7710;
		if (null != class227 && class227.anIntArray2811 != null) {
			is = new int[class227.anIntArray2811.length];
			for (int i_67_ = 0; i_67_ < class227.anIntArray2811.length; i_67_++) {
				int i_68_ = class227.anIntArray2811[i_67_];
				if (i_68_ >= 0 && i_68_ < ((Class282_Sub30) this).anIntArray7710.length)
					is[i_67_] = ((Class282_Sub30) this).anIntArray7710[i_68_];
				else
					is[i_67_] = -1;
			}
		}
		if (null != class456)
			i_66_ |= class456.method7640(-1923028148);
		long l = method12444(is, i_65_, class238 != null ? class238.colors : null, bool, 583894637);
		if (aClass229_7712 != null)
			class528 = (MeshRasterizer) aClass229_7712.method3865(l);
		if (null == class528 || class505.method8452(class528.m(), i_66_) != 0) {
			if (class528 != null)
				i_66_ = class505.method8546(i_66_, class528.m());
			int i_69_ = i_66_;
			boolean bool_70_ = false;
			for (int i_71_ = 0; i_71_ < is.length; i_71_++) {
				if (is[i_71_] != -1 && !IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(is[i_71_], 927290338).bodyMeshesReady(bool, null, 1048076416))
					bool_70_ = true;
			}
			if (bool_70_)
				return null;
			RSMesh[] class157s = new RSMesh[is.length];
			for (int i_72_ = 0; i_72_ < is.length; i_72_++) {
				if (is[i_72_] != -1)
					class157s[i_72_] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(is[i_72_], 1368194180).getBodyMesh(bool, null, 1891500048);
			}
			if (null != class227 && class227.anIntArrayArray2802 != null) {
				for (int i_73_ = 0; i_73_ < class227.anIntArrayArray2802.length; i_73_++) {
					if (null != class227.anIntArrayArray2802[i_73_] && class157s[i_73_] != null) {
						int i_74_ = class227.anIntArrayArray2802[i_73_][0];
						int i_75_ = class227.anIntArrayArray2802[i_73_][1];
						int i_76_ = class227.anIntArrayArray2802[i_73_][2];
						int i_77_ = class227.anIntArrayArray2802[i_73_][3];
						int i_78_ = class227.anIntArrayArray2802[i_73_][4];
						int i_79_ = class227.anIntArrayArray2802[i_73_][5];
						if (i_77_ != 0 || i_78_ != 0 || i_79_ != 0)
							class157s[i_73_].method2671(i_77_, i_78_, i_79_);
						if (i_74_ != 0 || i_75_ != 0 || i_76_ != 0)
							class157s[i_73_].method2712(i_74_, i_75_, i_76_);
					}
				}
			}
			RSMesh class157 = new RSMesh(class157s, class157s.length);
			if (class238 != null)
				i_69_ |= 0x4000;
			class528 = class505.createMeshRasterizer(class157, i_69_, -939931493 * Class105.anInt1069, 65, 857);
			if (class238 != null) {
				for (int i_80_ = 0; i_80_ < 10; i_80_++) {
					for (int i_81_ = 0; i_81_ < (AbstractQueue_Sub1.SKIN_COLORS[i_80_]).length; i_81_++) {
						if (class238.colors[i_80_] < (Class366.SKIN_COLORS[i_80_][i_81_]).length)
							class528.X((AbstractQueue_Sub1.SKIN_COLORS[i_80_][i_81_]), (Class366.SKIN_COLORS[i_80_][i_81_][class238.colors[i_80_]]));
					}
				}
			}
			if (null != aClass229_7712) {
				class528.KA(i_66_);
				aClass229_7712.put(class528, l);
			}
		}
		if (class456 == null)
			return class528;
		MeshRasterizer class528_82_ = class528.method11289((byte) 1, i_66_, true);
		class456.method7577(class528_82_, 0, 16711935);
		return class528_82_;
	}

	static void method12455(int i) {
		Class105.anInt1069 = 946658707 * i;
		aClass229_7712.method3859(1979292933);
	}

	static void method12456(int i) {
		Class105.anInt1069 = 946658707 * i;
		aClass229_7712.method3859(-1637097751);
	}

	static void method12457() {
		aClass229_7712.method3859(1082161707);
	}
}
