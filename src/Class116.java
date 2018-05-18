/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
	static final int anInt1250 = 1;
	static final int anInt1251 = 0;
	int anInt1252;
	Index aClass317_1253;
	public int anInt1254;
	Class282_Sub7 aClass282_Sub7_1255;
	Class282_Sub15_Sub2 aClass282_Sub15_Sub2_1256;
	Class250 aClass250_1257 = null;
	static final int anInt1258 = 2;
	public static long aLong1259;

	public boolean method1953() {
		Class332.method5929(-1993597928);
		if (0 == -842296555 * ((Class116) this).anInt1252) {
			((Class116) this).aClass282_Sub7_1255 = Class282_Sub7.method12164(((Class116) this).aClass317_1253, anInt1254 * 773403033, 0);
			if (((Class116) this).aClass282_Sub7_1255 == null)
				return false;
			((Class116) this).aClass250_1257 = new Class250(Class148.aClass317_1732, Class148.aClass317_1731);
			((Class116) this).anInt1252 = -1907153859;
		}
		if (1 == ((Class116) this).anInt1252 * -842296555) {
			if (!((Class116) this).aClass282_Sub15_Sub2_1256.method15182(((Class116) this).aClass282_Sub7_1255, Class148.aClass317_1737, ((Class116) this).aClass250_1257, 22050, 310589325))
				return false;
			((Class116) this).anInt1252 = 480659578;
		}
		return true;
	}

	Class282_Sub15_Sub2 method1954(int i) {
		return ((Class116) this).aClass282_Sub15_Sub2_1256;
	}

	Class282_Sub7 method1955(int i) {
		return ((Class116) this).aClass282_Sub7_1255;
	}

	public Class116(Index class317, int i) {
		((Class116) this).anInt1252 = 0;
		((Class116) this).aClass317_1253 = class317;
		anInt1254 = i * -1294101847;
		((Class116) this).aClass282_Sub15_Sub2_1256 = new Class282_Sub15_Sub2();
		((Class116) this).aClass282_Sub15_Sub2_1256.method15137(9, 128, -1186547906);
	}

	public boolean method1956(int i) {
		return -842296555 * ((Class116) this).anInt1252 == 2;
	}

	Class282_Sub15_Sub2 method1957() {
		return ((Class116) this).aClass282_Sub15_Sub2_1256;
	}

	Class282_Sub15_Sub2 method1958() {
		return ((Class116) this).aClass282_Sub15_Sub2_1256;
	}

	Class282_Sub15_Sub2 method1959() {
		return ((Class116) this).aClass282_Sub15_Sub2_1256;
	}

	public boolean method1960() {
		return -842296555 * ((Class116) this).anInt1252 == 2;
	}

	Class282_Sub7 method1961() {
		return ((Class116) this).aClass282_Sub7_1255;
	}

	Class282_Sub7 method1962() {
		return ((Class116) this).aClass282_Sub7_1255;
	}

	public boolean method1963(int i) {
		Class332.method5929(263587449);
		if (0 == -842296555 * ((Class116) this).anInt1252) {
			((Class116) this).aClass282_Sub7_1255 = Class282_Sub7.method12164(((Class116) this).aClass317_1253, anInt1254 * 773403033, 0);
			if (((Class116) this).aClass282_Sub7_1255 == null)
				return false;
			((Class116) this).aClass250_1257 = new Class250(Class148.aClass317_1732, Class148.aClass317_1731);
			((Class116) this).anInt1252 = -1907153859;
		}
		if (1 == ((Class116) this).anInt1252 * -842296555) {
			if (!((Class116) this).aClass282_Sub15_Sub2_1256.method15182(((Class116) this).aClass282_Sub7_1255, Class148.aClass317_1737, ((Class116) this).aClass250_1257, 22050, 1813033404))
				return false;
			((Class116) this).anInt1252 = 480659578;
		}
		return true;
	}

	public boolean method1964() {
		return -842296555 * ((Class116) this).anInt1252 == 2;
	}

	Class282_Sub7 method1965() {
		return ((Class116) this).aClass282_Sub7_1255;
	}

	public static boolean method1966(int i) {
		if (0 != -1423242349 * Class148.anInt1730)
			return true;
		return Class148.aClass282_Sub15_Sub2_1735.method15103(1586124800);
	}

	static final void method1967(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub22.method14680(class118, class527, -493402778);
	}

	static final void method1968(CS2Executor class527, byte i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub29_8201.method7785(i_0_, -225955104);
	}

	public static MeshRasterizer method1969(GraphicalRenderer class505, int i, int i_1_, int i_2_, int i_3_, int i_4_, MeshRasterizer class528, int i_5_, int i_6_, int i_7_, int i_8_, Class456 class456, int i_9_) {
		if (null == class528)
			return null;
		int i_10_ = 2055;
		if (null != class456) {
			i_10_ |= class456.method7640(-2080241294);
			i_10_ &= ~0x200;
		}
		long l = (((long) i_6_ << 48) + (((long) i_5_ << 32) + (long) (i_4_ + (i_7_ << 16) + (i_8_ << 24))));
		MeshRasterizer class528_11_;
		synchronized (Class13.aClass229_127) {
			class528_11_ = (MeshRasterizer) Class13.aClass229_127.method3865(l);
		}
		if (class528_11_ == null || class505.method8452(class528_11_.m(), i_10_) != 0) {
			if (null != class528_11_)
				i_10_ = class505.method8546(i_10_, class528_11_.m());
			int i_12_;
			if (i_4_ == 1)
				i_12_ = 9;
			else if (2 == i_4_)
				i_12_ = 12;
			else if (3 == i_4_)
				i_12_ = 15;
			else if (i_4_ == 4)
				i_12_ = 18;
			else
				i_12_ = 21;
			int i_13_ = 3;
			int[] is = { 64, 96, 128 };
			RSMesh class157 = new RSMesh(i_13_ * i_12_ + 1, 2 * (i_12_ * i_13_) - i_12_, 0);
			int i_14_ = class157.method2662(0, 0, 0);
			int[][] is_15_ = new int[i_13_][i_12_];
			for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
				int i_17_ = is[i_16_];
				int i_18_ = is[i_16_];
				for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
					int i_20_ = (i_19_ << 14) / i_12_;
					int i_21_ = Class382.anIntArray4657[i_20_] * i_17_ >> 14;
					int i_22_ = i_18_ * Class382.anIntArray4661[i_20_] >> 14;
					is_15_[i_16_][i_19_] = class157.method2662(i_21_, 0, i_22_);
				}
			}
			for (int i_23_ = 0; i_23_ < i_13_; i_23_++) {
				int i_24_ = (i_23_ * 256 + 128) / i_13_;
				int i_25_ = 256 - i_24_;
				byte i_26_ = (byte) (i_24_ * i_8_ + i_25_ * i_7_ >> 8);
				short i_27_ = (short) ((((i_6_ & 0x7f) * i_24_ + (i_5_ & 0x7f) * i_25_ & 0x7f00) + (((i_25_ * (i_5_ & 0x380) + (i_6_ & 0x380) * i_24_) & 0x38000) + (((i_6_ & 0xfc00) * i_24_ + i_25_ * (i_5_ & 0xfc00)) & 0xfc0000))) >> 8);
				for (int i_28_ = 0; i_28_ < i_12_; i_28_++) {
					if (0 == i_23_)
						class157.method2663(i_14_, is_15_[0][(1 + i_28_) % i_12_], is_15_[0][i_28_], (byte) 1, (byte) -1, i_27_, i_26_, (short) -1);
					else {
						class157.method2663(is_15_[i_23_ - 1][i_28_], (is_15_[i_23_ - 1][(1 + i_28_) % i_12_]), is_15_[i_23_][(i_28_ + 1) % i_12_], (byte) 1, (byte) -1, i_27_, i_26_, (short) -1);
						class157.method2663(is_15_[i_23_ - 1][i_28_], is_15_[i_23_][(1 + i_28_) % i_12_], is_15_[i_23_][i_28_], (byte) 1, (byte) -1, i_27_, i_26_, (short) -1);
					}
				}
			}
			class528_11_ = class505.createMeshRasterizer(class157, i_10_, 1257126031 * Class13.anInt128, 64, 768);
			synchronized (Class13.aClass229_127) {
				Class13.aClass229_127.method3856(class528_11_, l);
			}
		}
		int i_29_ = class528.RA();
		int i_30_ = class528.ya();
		int i_31_ = class528.AA();
		int i_32_ = class528.ha();
		if (class456 != null) {
			class528_11_ = class528_11_.method11289((byte) 3, i_10_, true);
			class528_11_.oa(i_30_ - i_29_ >> 1, 128, i_32_ - i_31_ >> 1);
			class528_11_.ia(i_30_ + i_29_ >> 1, 0, i_31_ + i_32_ >> 1);
			class456.method7579(class528_11_, 1270030336);
		} else {
			class528_11_ = class528_11_.method11289((byte) 3, i_10_, true);
			class528_11_.oa(i_30_ - i_29_ >> 1, 128, i_32_ - i_31_ >> 1);
			class528_11_.ia(i_29_ + i_30_ >> 1, 0, i_31_ + i_32_ >> 1);
		}
		if (i_1_ != 0)
			class528_11_.t(i_1_);
		if (0 != i_2_)
			class528_11_.EA(i_2_);
		if (i_3_ != 0)
			class528_11_.ia(0, i_3_, 0);
		return class528_11_;
	}
}
