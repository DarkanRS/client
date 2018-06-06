
/* Class528_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class528_Sub3 extends MeshRasterizer {
	float[] aFloatArray8892;
	int anInt8893;
	static int[] anIntArray8894;
	int anInt8895;
	int anInt8896;
	short aShort8897;
	short aShort8898;
	int anInt8899 = 0;
	byte[] aByteArray8900;
	int[] anIntArray8901;
	int[] anIntArray8902;
	boolean aBool8903;
	boolean aBool8904;
	short[] aShortArray8905;
	int anInt8906;
	short[] aShortArray8907;
	int anInt8908;
	short[] aShortArray8909;
	int anInt8910 = 0;
	short[] aShortArray8911;
	byte[] aByteArray8912;
	Class63 aClass63_8913;
	float[] aFloatArray8914;
	static final int anInt8915 = 7;
	int anInt8916;
	Class505_Sub2 aClass505_Sub2_8917;
	short[] aShortArray8918;
	boolean aBool8919;
	short[] aShortArray8920;
	short[] aShortArray8921;
	short[] aShortArray8922;
	short[] aShortArray8923;
	int[][] anIntArrayArray8924;
	short[] aShortArray8925;
	Class39 aClass39_8926;
	Class63 aClass63_8927;
	static int[] anIntArray8928;
	Class63 aClass63_8929;
	Class63 aClass63_8930;
	int[] anIntArray8931;
	static int anInt8932;
	short[] aShortArray8933;
	Class56[] aClass56Array8934;
	static final int anInt8935 = 4;
	int anInt8936;
	boolean aBool8937;
	static Class34 aClass34_8938;
	static int anInt8939;
	int anInt8940;
	int anInt8941;
	int anInt8942;
	int anInt8943;
	int[] anIntArray8944;
	short[] aShortArray8945;
	int[] anIntArray8946;
	int[] anIntArray8947;
	short[] aShortArray8948;
	Class87[] aClass87Array8949;
	Class172[] aClass172Array8950;
	int anInt8951;
	int[] anIntArray8952;
	Class65[] aClass65Array8953;
	int[][] anIntArrayArray8954;
	static long[] aLongArray8955;
	static float[] aFloatArray8956 = new float[2];
	int anInt8957;
	static int[] anIntArray8958;
	boolean aBool8959;
	static int[] anIntArray8960;
	static int[] anIntArray8961;
	Class355 aClass355_8962;
	int anInt8963;
	static int anInt8964;
	static boolean aBool8965;
	int[][] anIntArrayArray8966;

	public int ci() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8940;
	}

	public MeshRasterizer method11278(byte i, int i_0_, boolean bool) {
		boolean bool_1_ = false;
		Class528_Sub3 class528_sub3_2_;
		Class528_Sub3 class528_sub3_3_;
		if (i > 0 && i <= 7) {
			class528_sub3_3_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8840[i - 1]);
			class528_sub3_2_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8839[i - 1]);
			bool_1_ = true;
		} else
			class528_sub3_2_ = class528_sub3_3_ = new Class528_Sub3(((Class528_Sub3) this).aClass505_Sub2_8917, 0, 0, true, false);
		return method14267(class528_sub3_2_, class528_sub3_3_, i_0_, bool_1_, bool);
	}

	public void di(short i, short i_4_) {
		Interface22 interface22 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834;
		for (int i_5_ = 0; i_5_ < ((Class528_Sub3) this).anInt8916; i_5_++) {
			if (((Class528_Sub3) this).aShortArray8923[i_5_] == i)
				((Class528_Sub3) this).aShortArray8923[i_5_] = i_4_;
		}
		byte i_6_ = 0;
		byte i_7_ = 0;
		if (i != -1) {
			Class169 class169 = interface22.method144(i & 0xffff, -2107912111);
			i_6_ = class169.aByte2079;
			i_7_ = class169.aByte2080;
		}
		byte i_8_ = 0;
		byte i_9_ = 0;
		if (i_4_ != -1) {
			Class169 class169 = interface22.method144(i_4_ & 0xffff, -2138461043);
			i_8_ = class169.aByte2079;
			i_9_ = class169.aByte2080;
			if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
				((Class528_Sub3) this).aBool8903 = true;
		}
		if (i_6_ != i_8_ | i_7_ != i_9_) {
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_10_ = 0; i_10_ < ((Class528_Sub3) this).anInt8951; i_10_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_10_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_10_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
				}
			}
			method14269();
		}
	}

	static byte[] method14265(byte[] is, int i) {
		byte[] is_11_ = new byte[i];
		System.arraycopy(is, 0, is_11_, 0, i);
		return is_11_;
	}

	public int cm() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8908;
	}

	public boolean dh() {
		return ((Class528_Sub3) this).aBool8903;
	}

	public int cw() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8908;
	}

	public MeshRasterizer method11277(byte i, int i_12_, boolean bool) {
		boolean bool_13_ = false;
		Class528_Sub3 class528_sub3_14_;
		Class528_Sub3 class528_sub3_15_;
		if (i > 0 && i <= 7) {
			class528_sub3_15_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8840[i - 1]);
			class528_sub3_14_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8839[i - 1]);
			bool_13_ = true;
		} else
			class528_sub3_14_ = class528_sub3_15_ = new Class528_Sub3(((Class528_Sub3) this).aClass505_Sub2_8917, 0, 0, true, false);
		return method14267(class528_sub3_14_, class528_sub3_15_, i_12_, bool_13_, bool);
	}

	short method14266(RSMesh class157, int i, int i_16_, long l, int i_17_, int i_18_, int i_19_, int i_20_, float f, float f_21_) {
		int i_22_ = ((Class528_Sub3) this).anIntArray8947[i];
		int i_23_ = ((Class528_Sub3) this).anIntArray8947[i + 1];
		int i_24_ = 0;
		for (int i_25_ = i_22_; i_25_ < i_23_; i_25_++) {
			short i_26_ = ((Class528_Sub3) this).aShortArray8948[i_25_];
			if (i_26_ == 0) {
				i_24_ = i_25_;
				break;
			}
			if (aLongArray8955[i_25_] == l)
				return (short) (i_26_ - 1);
		}
		((Class528_Sub3) this).aShortArray8948[i_24_] = (short) (((Class528_Sub3) this).anInt8906 + 1);
		aLongArray8955[i_24_] = l;
		((Class528_Sub3) this).aShortArray8945[(((Class528_Sub3) this).anInt8906)] = (short) i_16_;
		((Class528_Sub3) this).aShortArray8907[(((Class528_Sub3) this).anInt8906)] = (short) i;
		((Class528_Sub3) this).aShortArray8909[(((Class528_Sub3) this).anInt8906)] = (short) i_17_;
		((Class528_Sub3) this).aShortArray8933[(((Class528_Sub3) this).anInt8906)] = (short) i_18_;
		((Class528_Sub3) this).aShortArray8911[(((Class528_Sub3) this).anInt8906)] = (short) i_19_;
		((Class528_Sub3) this).aByteArray8912[((Class528_Sub3) this).anInt8906] = (byte) i_20_;
		((Class528_Sub3) this).aFloatArray8892[(((Class528_Sub3) this).anInt8906)] = f;
		((Class528_Sub3) this).aFloatArray8914[(((Class528_Sub3) this).anInt8906)] = f_21_;
		return (short) ((Class528_Sub3) this).anInt8906++;
	}

	public MeshRasterizer method11289(byte i, int i_27_, boolean bool) {
		boolean bool_28_ = false;
		Class528_Sub3 class528_sub3_29_;
		Class528_Sub3 class528_sub3_30_;
		if (i > 0 && i <= 7) {
			class528_sub3_30_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8840[i - 1]);
			class528_sub3_29_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8839[i - 1]);
			bool_28_ = true;
		} else
			class528_sub3_29_ = class528_sub3_30_ = new Class528_Sub3(((Class528_Sub3) this).aClass505_Sub2_8917, 0, 0, true, false);
		return method14267(class528_sub3_29_, class528_sub3_30_, i_27_, bool_28_, bool);
	}

	MeshRasterizer method14267(Class528_Sub3 class528_sub3_31_, Class528_Sub3 class528_sub3_32_, int i, boolean bool, boolean bool_33_) {
		((Class528_Sub3) class528_sub3_31_).anInt8895 = i;
		((Class528_Sub3) class528_sub3_31_).anInt8896 = ((Class528_Sub3) this).anInt8896;
		((Class528_Sub3) class528_sub3_31_).aShort8897 = ((Class528_Sub3) this).aShort8897;
		((Class528_Sub3) class528_sub3_31_).aShort8898 = ((Class528_Sub3) this).aShort8898;
		((Class528_Sub3) class528_sub3_31_).anInt8899 = ((Class528_Sub3) this).anInt8899;
		((Class528_Sub3) class528_sub3_31_).anInt8910 = ((Class528_Sub3) this).anInt8910;
		((Class528_Sub3) class528_sub3_31_).anInt8906 = ((Class528_Sub3) this).anInt8906;
		((Class528_Sub3) class528_sub3_31_).anInt8916 = ((Class528_Sub3) this).anInt8916;
		((Class528_Sub3) class528_sub3_31_).anInt8963 = ((Class528_Sub3) this).anInt8963;
		((Class528_Sub3) class528_sub3_31_).anInt8951 = ((Class528_Sub3) this).anInt8951;
		if ((i & 0x100) != 0)
			((Class528_Sub3) class528_sub3_31_).aBool8959 = true;
		else
			((Class528_Sub3) class528_sub3_31_).aBool8959 = ((Class528_Sub3) this).aBool8959;
		((Class528_Sub3) class528_sub3_31_).aBool8903 = ((Class528_Sub3) this).aBool8903;
		boolean bool_34_ = Class50.method994(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_35_ = Class50.method979(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_36_ = Class50.method980(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_37_ = bool_34_ | bool_35_ | bool_36_;
		if (bool_37_) {
			if (bool_34_) {
				if (((Class528_Sub3) class528_sub3_32_).anIntArray8901 == null || ((((Class528_Sub3) class528_sub3_32_).anIntArray8901).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_31_).anIntArray8901 = ((Class528_Sub3) class528_sub3_32_).anIntArray8901 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_31_).anIntArray8901 = ((Class528_Sub3) class528_sub3_32_).anIntArray8901;
			} else
				((Class528_Sub3) class528_sub3_31_).anIntArray8901 = ((Class528_Sub3) this).anIntArray8901;
			if (bool_35_) {
				if (((Class528_Sub3) class528_sub3_32_).anIntArray8902 == null || ((((Class528_Sub3) class528_sub3_32_).anIntArray8902).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_31_).anIntArray8902 = ((Class528_Sub3) class528_sub3_32_).anIntArray8902 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_31_).anIntArray8902 = ((Class528_Sub3) class528_sub3_32_).anIntArray8902;
			} else
				((Class528_Sub3) class528_sub3_31_).anIntArray8902 = ((Class528_Sub3) this).anIntArray8902;
			if (bool_36_) {
				if (((Class528_Sub3) class528_sub3_32_).anIntArray8931 == null || ((((Class528_Sub3) class528_sub3_32_).anIntArray8931).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_31_).anIntArray8931 = ((Class528_Sub3) class528_sub3_32_).anIntArray8931 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_31_).anIntArray8931 = ((Class528_Sub3) class528_sub3_32_).anIntArray8931;
			} else
				((Class528_Sub3) class528_sub3_31_).anIntArray8931 = ((Class528_Sub3) this).anIntArray8931;
			for (int i_38_ = 0; i_38_ < ((Class528_Sub3) this).anInt8899; i_38_++) {
				if (bool_34_)
					((Class528_Sub3) class528_sub3_31_).anIntArray8901[i_38_] = ((Class528_Sub3) this).anIntArray8901[i_38_];
				if (bool_35_)
					((Class528_Sub3) class528_sub3_31_).anIntArray8902[i_38_] = ((Class528_Sub3) this).anIntArray8902[i_38_];
				if (bool_36_)
					((Class528_Sub3) class528_sub3_31_).anIntArray8931[i_38_] = ((Class528_Sub3) this).anIntArray8931[i_38_];
			}
		} else {
			((Class528_Sub3) class528_sub3_31_).anIntArray8901 = ((Class528_Sub3) this).anIntArray8901;
			((Class528_Sub3) class528_sub3_31_).anIntArray8902 = ((Class528_Sub3) this).anIntArray8902;
			((Class528_Sub3) class528_sub3_31_).anIntArray8931 = ((Class528_Sub3) this).anIntArray8931;
		}
		if (Class50.method995(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_31_).aClass63_8927 = ((Class528_Sub3) class528_sub3_32_).aClass63_8927;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8927).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8927).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8927).aBool663 = true;
		} else if (Class50.method990(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_31_).aClass63_8927 = ((Class528_Sub3) this).aClass63_8927;
		else
			((Class528_Sub3) class528_sub3_31_).aClass63_8927 = null;
		if (Class50.method1022(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aShortArray8918 == null || (((Class528_Sub3) class528_sub3_32_).aShortArray8918.length < ((Class528_Sub3) this).anInt8916))
				((Class528_Sub3) class528_sub3_31_).aShortArray8918 = ((Class528_Sub3) class528_sub3_32_).aShortArray8918 = new short[((Class528_Sub3) this).anInt8916];
			else
				((Class528_Sub3) class528_sub3_31_).aShortArray8918 = ((Class528_Sub3) class528_sub3_32_).aShortArray8918;
			for (int i_39_ = 0; i_39_ < ((Class528_Sub3) this).anInt8916; i_39_++)
				((Class528_Sub3) class528_sub3_31_).aShortArray8918[i_39_] = ((Class528_Sub3) this).aShortArray8918[i_39_];
		} else
			((Class528_Sub3) class528_sub3_31_).aShortArray8918 = ((Class528_Sub3) this).aShortArray8918;
		if (Class50.method984(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aByteArray8900 == null || (((Class528_Sub3) class528_sub3_32_).aByteArray8900.length < ((Class528_Sub3) this).anInt8916))
				((Class528_Sub3) class528_sub3_31_).aByteArray8900 = ((Class528_Sub3) class528_sub3_32_).aByteArray8900 = new byte[((Class528_Sub3) this).anInt8916];
			else
				((Class528_Sub3) class528_sub3_31_).aByteArray8900 = ((Class528_Sub3) class528_sub3_32_).aByteArray8900;
			for (int i_40_ = 0; i_40_ < ((Class528_Sub3) this).anInt8916; i_40_++)
				((Class528_Sub3) class528_sub3_31_).aByteArray8900[i_40_] = ((Class528_Sub3) this).aByteArray8900[i_40_];
		} else
			((Class528_Sub3) class528_sub3_31_).aByteArray8900 = ((Class528_Sub3) this).aByteArray8900;
		if (Class50.method1051(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_31_).aClass63_8913 = ((Class528_Sub3) class528_sub3_32_).aClass63_8913;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8913).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8913).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8913).aBool663 = true;
		} else if (Class50.method1059(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_31_).aClass63_8913 = ((Class528_Sub3) this).aClass63_8913;
		else
			((Class528_Sub3) class528_sub3_31_).aClass63_8913 = null;
		if (Class50.method982(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aShortArray8909 == null || (((Class528_Sub3) class528_sub3_32_).aShortArray8909.length < ((Class528_Sub3) this).anInt8906)) {
				int i_41_ = ((Class528_Sub3) this).anInt8906;
				((Class528_Sub3) class528_sub3_31_).aShortArray8909 = ((Class528_Sub3) class528_sub3_32_).aShortArray8909 = new short[i_41_];
				((Class528_Sub3) class528_sub3_31_).aShortArray8933 = ((Class528_Sub3) class528_sub3_32_).aShortArray8933 = new short[i_41_];
				((Class528_Sub3) class528_sub3_31_).aShortArray8911 = ((Class528_Sub3) class528_sub3_32_).aShortArray8911 = new short[i_41_];
			} else {
				((Class528_Sub3) class528_sub3_31_).aShortArray8909 = ((Class528_Sub3) class528_sub3_32_).aShortArray8909;
				((Class528_Sub3) class528_sub3_31_).aShortArray8933 = ((Class528_Sub3) class528_sub3_32_).aShortArray8933;
				((Class528_Sub3) class528_sub3_31_).aShortArray8911 = ((Class528_Sub3) class528_sub3_32_).aShortArray8911;
			}
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				if (((Class528_Sub3) class528_sub3_32_).aClass355_8962 == null)
					((Class528_Sub3) class528_sub3_32_).aClass355_8962 = new Class355();
				Class355 class355 = (((Class528_Sub3) class528_sub3_31_).aClass355_8962 = ((Class528_Sub3) class528_sub3_32_).aClass355_8962);
				if (((Class355) class355).aShortArray4115 == null || (((Class355) class355).aShortArray4115.length < ((Class528_Sub3) this).anInt8906)) {
					int i_42_ = ((Class528_Sub3) this).anInt8906;
					((Class355) class355).aShortArray4115 = new short[i_42_];
					((Class355) class355).aShortArray4114 = new short[i_42_];
					((Class355) class355).aShortArray4113 = new short[i_42_];
					((Class355) class355).aByteArray4116 = new byte[i_42_];
				}
				for (int i_43_ = 0; i_43_ < ((Class528_Sub3) this).anInt8906; i_43_++) {
					((Class528_Sub3) class528_sub3_31_).aShortArray8909[i_43_] = ((Class528_Sub3) this).aShortArray8909[i_43_];
					((Class528_Sub3) class528_sub3_31_).aShortArray8933[i_43_] = ((Class528_Sub3) this).aShortArray8933[i_43_];
					((Class528_Sub3) class528_sub3_31_).aShortArray8911[i_43_] = ((Class528_Sub3) this).aShortArray8911[i_43_];
					((Class355) class355).aShortArray4115[i_43_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115[i_43_]);
					((Class355) class355).aShortArray4114[i_43_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114[i_43_]);
					((Class355) class355).aShortArray4113[i_43_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113[i_43_]);
					((Class355) class355).aByteArray4116[i_43_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116[i_43_]);
				}
			} else {
				((Class528_Sub3) class528_sub3_31_).aClass355_8962 = null;
				for (int i_44_ = 0; i_44_ < ((Class528_Sub3) this).anInt8906; i_44_++) {
					((Class528_Sub3) class528_sub3_31_).aShortArray8909[i_44_] = ((Class528_Sub3) this).aShortArray8909[i_44_];
					((Class528_Sub3) class528_sub3_31_).aShortArray8933[i_44_] = ((Class528_Sub3) this).aShortArray8933[i_44_];
					((Class528_Sub3) class528_sub3_31_).aShortArray8911[i_44_] = ((Class528_Sub3) this).aShortArray8911[i_44_];
				}
			}
			((Class528_Sub3) class528_sub3_31_).aByteArray8912 = ((Class528_Sub3) this).aByteArray8912;
		} else {
			((Class528_Sub3) class528_sub3_31_).aClass355_8962 = ((Class528_Sub3) this).aClass355_8962;
			((Class528_Sub3) class528_sub3_31_).aShortArray8909 = ((Class528_Sub3) this).aShortArray8909;
			((Class528_Sub3) class528_sub3_31_).aShortArray8933 = ((Class528_Sub3) this).aShortArray8933;
			((Class528_Sub3) class528_sub3_31_).aShortArray8911 = ((Class528_Sub3) this).aShortArray8911;
			((Class528_Sub3) class528_sub3_31_).aByteArray8912 = ((Class528_Sub3) this).aByteArray8912;
		}
		if (Class50.method1020(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_31_).aClass63_8929 = ((Class528_Sub3) class528_sub3_32_).aClass63_8929;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8929).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8929).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8929).aBool663 = true;
		} else if (Class50.method983(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_31_).aClass63_8929 = ((Class528_Sub3) this).aClass63_8929;
		else
			((Class528_Sub3) class528_sub3_31_).aClass63_8929 = null;
		if (Class50.method985(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aFloatArray8892 == null || (((Class528_Sub3) class528_sub3_32_).aFloatArray8892.length < ((Class528_Sub3) this).anInt8916)) {
				int i_45_ = ((Class528_Sub3) this).anInt8906;
				((Class528_Sub3) class528_sub3_31_).aFloatArray8892 = ((Class528_Sub3) class528_sub3_32_).aFloatArray8892 = new float[i_45_];
				((Class528_Sub3) class528_sub3_31_).aFloatArray8914 = ((Class528_Sub3) class528_sub3_32_).aFloatArray8914 = new float[i_45_];
			} else {
				((Class528_Sub3) class528_sub3_31_).aFloatArray8892 = ((Class528_Sub3) class528_sub3_32_).aFloatArray8892;
				((Class528_Sub3) class528_sub3_31_).aFloatArray8914 = ((Class528_Sub3) class528_sub3_32_).aFloatArray8914;
			}
			for (int i_46_ = 0; i_46_ < ((Class528_Sub3) this).anInt8906; i_46_++) {
				((Class528_Sub3) class528_sub3_31_).aFloatArray8892[i_46_] = ((Class528_Sub3) this).aFloatArray8892[i_46_];
				((Class528_Sub3) class528_sub3_31_).aFloatArray8914[i_46_] = ((Class528_Sub3) this).aFloatArray8914[i_46_];
			}
		} else {
			((Class528_Sub3) class528_sub3_31_).aFloatArray8892 = ((Class528_Sub3) this).aFloatArray8892;
			((Class528_Sub3) class528_sub3_31_).aFloatArray8914 = ((Class528_Sub3) this).aFloatArray8914;
		}
		if (Class50.method1056(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_31_).aClass63_8930 = ((Class528_Sub3) class528_sub3_32_).aClass63_8930;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8930).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8930).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_31_).aClass63_8930).aBool663 = true;
		} else if (Class50.method993(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_31_).aClass63_8930 = ((Class528_Sub3) this).aClass63_8930;
		else
			((Class528_Sub3) class528_sub3_31_).aClass63_8930 = null;
		if (Class50.method986(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aShortArray8920 == null || (((Class528_Sub3) class528_sub3_32_).aShortArray8920.length < ((Class528_Sub3) this).anInt8916)) {
				int i_47_ = ((Class528_Sub3) this).anInt8916;
				((Class528_Sub3) class528_sub3_31_).aShortArray8920 = ((Class528_Sub3) class528_sub3_32_).aShortArray8920 = new short[i_47_];
				((Class528_Sub3) class528_sub3_31_).aShortArray8921 = ((Class528_Sub3) class528_sub3_32_).aShortArray8921 = new short[i_47_];
				((Class528_Sub3) class528_sub3_31_).aShortArray8922 = ((Class528_Sub3) class528_sub3_32_).aShortArray8922 = new short[i_47_];
			} else {
				((Class528_Sub3) class528_sub3_31_).aShortArray8920 = ((Class528_Sub3) class528_sub3_32_).aShortArray8920;
				((Class528_Sub3) class528_sub3_31_).aShortArray8921 = ((Class528_Sub3) class528_sub3_32_).aShortArray8921;
				((Class528_Sub3) class528_sub3_31_).aShortArray8922 = ((Class528_Sub3) class528_sub3_32_).aShortArray8922;
			}
			for (int i_48_ = 0; i_48_ < ((Class528_Sub3) this).anInt8916; i_48_++) {
				((Class528_Sub3) class528_sub3_31_).aShortArray8920[i_48_] = ((Class528_Sub3) this).aShortArray8920[i_48_];
				((Class528_Sub3) class528_sub3_31_).aShortArray8921[i_48_] = ((Class528_Sub3) this).aShortArray8921[i_48_];
				((Class528_Sub3) class528_sub3_31_).aShortArray8922[i_48_] = ((Class528_Sub3) this).aShortArray8922[i_48_];
			}
		} else {
			((Class528_Sub3) class528_sub3_31_).aShortArray8920 = ((Class528_Sub3) this).aShortArray8920;
			((Class528_Sub3) class528_sub3_31_).aShortArray8921 = ((Class528_Sub3) this).aShortArray8921;
			((Class528_Sub3) class528_sub3_31_).aShortArray8922 = ((Class528_Sub3) this).aShortArray8922;
		}
		if (Class50.method999(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_31_).aClass39_8926 = ((Class528_Sub3) class528_sub3_32_).aClass39_8926;
			((Class39) ((Class528_Sub3) class528_sub3_31_).aClass39_8926).anInterface32_407 = (((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class39) ((Class528_Sub3) class528_sub3_31_).aClass39_8926).aBool408 = ((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408;
			((Class39) ((Class528_Sub3) class528_sub3_31_).aClass39_8926).aBool406 = true;
		} else if (Class50.method1043(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_31_).aClass39_8926 = ((Class528_Sub3) this).aClass39_8926;
		else
			((Class528_Sub3) class528_sub3_31_).aClass39_8926 = null;
		if (Class50.method992(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aShortArray8923 == null || (((Class528_Sub3) class528_sub3_32_).aShortArray8923.length < ((Class528_Sub3) this).anInt8916)) {
				int i_49_ = ((Class528_Sub3) this).anInt8916;
				((Class528_Sub3) class528_sub3_31_).aShortArray8923 = ((Class528_Sub3) class528_sub3_32_).aShortArray8923 = new short[i_49_];
			} else
				((Class528_Sub3) class528_sub3_31_).aShortArray8923 = ((Class528_Sub3) class528_sub3_32_).aShortArray8923;
			for (int i_50_ = 0; i_50_ < ((Class528_Sub3) this).anInt8916; i_50_++)
				((Class528_Sub3) class528_sub3_31_).aShortArray8923[i_50_] = ((Class528_Sub3) this).aShortArray8923[i_50_];
		} else
			((Class528_Sub3) class528_sub3_31_).aShortArray8923 = ((Class528_Sub3) this).aShortArray8923;
		if (Class50.method988(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_32_).aClass65Array8953 == null || ((((Class528_Sub3) class528_sub3_32_).aClass65Array8953).length < ((Class528_Sub3) this).anInt8951)) {
				int i_51_ = ((Class528_Sub3) this).anInt8951;
				((Class528_Sub3) class528_sub3_31_).aClass65Array8953 = ((Class528_Sub3) class528_sub3_32_).aClass65Array8953 = new Class65[i_51_];
				for (int i_52_ = 0; i_52_ < ((Class528_Sub3) this).anInt8951; i_52_++)
					((Class528_Sub3) class528_sub3_31_).aClass65Array8953[i_52_] = ((Class528_Sub3) this).aClass65Array8953[i_52_].method1275();
			} else {
				((Class528_Sub3) class528_sub3_31_).aClass65Array8953 = ((Class528_Sub3) class528_sub3_32_).aClass65Array8953;
				for (int i_53_ = 0; i_53_ < ((Class528_Sub3) this).anInt8951; i_53_++)
					((Class528_Sub3) class528_sub3_31_).aClass65Array8953[i_53_].method1270(((Class528_Sub3) this).aClass65Array8953[i_53_]);
			}
		} else
			((Class528_Sub3) class528_sub3_31_).aClass65Array8953 = ((Class528_Sub3) this).aClass65Array8953;
		((Class528_Sub3) class528_sub3_31_).aClass56Array8934 = ((Class528_Sub3) this).aClass56Array8934;
		if (((Class528_Sub3) this).aBool8937) {
			((Class528_Sub3) class528_sub3_31_).anInt8957 = ((Class528_Sub3) this).anInt8957;
			((Class528_Sub3) class528_sub3_31_).anInt8936 = ((Class528_Sub3) this).anInt8936;
			((Class528_Sub3) class528_sub3_31_).anInt8940 = ((Class528_Sub3) this).anInt8940;
			((Class528_Sub3) class528_sub3_31_).anInt8941 = ((Class528_Sub3) this).anInt8941;
			((Class528_Sub3) class528_sub3_31_).anInt8908 = ((Class528_Sub3) this).anInt8908;
			((Class528_Sub3) class528_sub3_31_).anInt8893 = ((Class528_Sub3) this).anInt8893;
			((Class528_Sub3) class528_sub3_31_).anInt8942 = ((Class528_Sub3) this).anInt8942;
			((Class528_Sub3) class528_sub3_31_).anInt8943 = ((Class528_Sub3) this).anInt8943;
			((Class528_Sub3) class528_sub3_31_).aBool8937 = true;
		} else
			((Class528_Sub3) class528_sub3_31_).aBool8937 = false;
		((Class528_Sub3) class528_sub3_31_).anIntArrayArray8966 = ((Class528_Sub3) this).anIntArrayArray8966;
		((Class528_Sub3) class528_sub3_31_).anIntArrayArray8924 = ((Class528_Sub3) this).anIntArrayArray8924;
		((Class528_Sub3) class528_sub3_31_).anIntArrayArray8954 = ((Class528_Sub3) this).anIntArrayArray8954;
		((Class528_Sub3) class528_sub3_31_).aShortArray8948 = ((Class528_Sub3) this).aShortArray8948;
		((Class528_Sub3) class528_sub3_31_).anIntArray8947 = ((Class528_Sub3) this).anIntArray8947;
		((Class528_Sub3) class528_sub3_31_).aShortArray8907 = ((Class528_Sub3) this).aShortArray8907;
		((Class528_Sub3) class528_sub3_31_).aShortArray8945 = ((Class528_Sub3) this).aShortArray8945;
		((Class528_Sub3) class528_sub3_31_).aShortArray8905 = ((Class528_Sub3) this).aShortArray8905;
		((Class528_Sub3) class528_sub3_31_).aShortArray8925 = ((Class528_Sub3) this).aShortArray8925;
		((Class528_Sub3) class528_sub3_31_).anIntArray8944 = ((Class528_Sub3) this).anIntArray8944;
		((Class528_Sub3) class528_sub3_31_).anIntArray8946 = ((Class528_Sub3) this).anIntArray8946;
		((Class528_Sub3) class528_sub3_31_).anIntArray8952 = ((Class528_Sub3) this).anIntArray8952;
		((Class528_Sub3) class528_sub3_31_).aClass87Array8949 = ((Class528_Sub3) this).aClass87Array8949;
		((Class528_Sub3) class528_sub3_31_).aClass172Array8950 = ((Class528_Sub3) this).aClass172Array8950;
		return class528_sub3_31_;
	}

	public void cr(int i) {
		((Class528_Sub3) this).aShort8898 = (short) i;
		method14268();
		method14285();
	}

	void method14268() {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662 = false;
	}

	void method14269() {
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = false;
	}

	public void method11298(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub3) this).aShortArray8905 != null) {
			Matrix44Var class294_54_ = class294;
			if (bool) {
				class294_54_ = ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8713;
				class294_54_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_55_ = 0; i_55_ < ((Class528_Sub3) this).anInt8910; i_55_++) {
				if ((i & ((Class528_Sub3) this).aShortArray8905[i_55_]) != 0) {
					class294_54_.method5226((float) ((Class528_Sub3) this).anIntArray8901[i_55_], (float) ((Class528_Sub3) this).anIntArray8902[i_55_], (float) ((Class528_Sub3) this).anIntArray8931[i_55_], fs);
					((Class528_Sub3) this).anIntArray8901[i_55_] = (int) fs[0];
					((Class528_Sub3) this).anIntArray8902[i_55_] = (int) fs[1];
					((Class528_Sub3) this).anIntArray8931[i_55_] = (int) fs[2];
				}
			}
		}
	}

	void method14270() {
		if (((Class528_Sub3) this).aClass39_8926 != null)
			((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408 = false;
	}

	public void f(int i) {
		int i_56_ = Class382.anIntArray4657[i];
		int i_57_ = Class382.anIntArray4661[i];
		for (int i_58_ = 0; i_58_ < ((Class528_Sub3) this).anInt8910; i_58_++) {
			int i_59_ = ((((Class528_Sub3) this).anIntArray8931[i_58_] * i_56_ + ((Class528_Sub3) this).anIntArray8901[i_58_] * i_57_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_58_] = ((((Class528_Sub3) this).anIntArray8931[i_58_] * i_57_ - ((Class528_Sub3) this).anIntArray8901[i_58_] * i_56_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_58_] = i_59_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public boolean method11309(int i, int i_60_, Matrix44Var class294, boolean bool, int i_61_) {
		Matrix44Arr class384 = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
		class384.method6522(class294);
		class384.method6523(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8728);
		boolean bool_62_ = false;
		float f = 3.4028235E38F;
		float f_63_ = -3.4028235E38F;
		float f_64_ = 3.4028235E38F;
		float f_65_ = -3.4028235E38F;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i_66_ = ((((Class528_Sub3) this).anInt8941 - ((Class528_Sub3) this).anInt8940) >> 1);
		int i_67_ = ((((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908) >> 1);
		int i_68_ = ((((Class528_Sub3) this).anInt8943 - ((Class528_Sub3) this).anInt8942) >> 1);
		int i_69_ = ((Class528_Sub3) this).anInt8940 + i_66_;
		int i_70_ = ((Class528_Sub3) this).anInt8908 + i_67_;
		int i_71_ = ((Class528_Sub3) this).anInt8942 + i_68_;
		int i_72_ = i_69_ - (i_66_ << i_61_);
		int i_73_ = i_70_ - (i_67_ << i_61_);
		int i_74_ = i_71_ - (i_68_ << i_61_);
		int i_75_ = i_69_ + (i_66_ << i_61_);
		int i_76_ = i_70_ + (i_67_ << i_61_);
		int i_77_ = i_71_ + (i_68_ << i_61_);
		anIntArray8894[0] = i_72_;
		anIntArray8960[0] = i_73_;
		anIntArray8961[0] = i_74_;
		anIntArray8894[1] = i_75_;
		anIntArray8960[1] = i_73_;
		anIntArray8961[1] = i_74_;
		anIntArray8894[2] = i_72_;
		anIntArray8960[2] = i_76_;
		anIntArray8961[2] = i_74_;
		anIntArray8894[3] = i_75_;
		anIntArray8960[3] = i_76_;
		anIntArray8961[3] = i_74_;
		anIntArray8894[4] = i_72_;
		anIntArray8960[4] = i_73_;
		anIntArray8961[4] = i_77_;
		anIntArray8894[5] = i_75_;
		anIntArray8960[5] = i_73_;
		anIntArray8961[5] = i_77_;
		anIntArray8894[6] = i_72_;
		anIntArray8960[6] = i_76_;
		anIntArray8961[6] = i_77_;
		anIntArray8894[7] = i_75_;
		anIntArray8960[7] = i_76_;
		anIntArray8961[7] = i_77_;
		for (int i_78_ = 0; i_78_ < 8; i_78_++) {
			float f_79_ = (float) anIntArray8894[i_78_];
			float f_80_ = (float) anIntArray8960[i_78_];
			float f_81_ = (float) anIntArray8961[i_78_];
			float f_82_ = (class384.buf[2] * f_79_ + class384.buf[6] * f_80_ + class384.buf[10] * f_81_ + class384.buf[14]);
			float f_83_ = (class384.buf[3] * f_79_ + class384.buf[7] * f_80_ + class384.buf[11] * f_81_ + class384.buf[15]);
			if (f_82_ >= -f_83_) {
				float f_84_ = (class384.buf[0] * f_79_ + class384.buf[4] * f_80_ + class384.buf[8] * f_81_ + class384.buf[12]);
				float f_85_ = (class384.buf[1] * f_79_ + class384.buf[5] * f_80_ + class384.buf[9] * f_81_ + class384.buf[13]);
				float f_86_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_84_ / f_83_));
				float f_87_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_85_ / f_83_));
				if (f_86_ < f)
					f = f_86_;
				if (f_86_ > f_63_)
					f_63_ = f_86_;
				if (f_87_ < f_64_)
					f_64_ = f_87_;
				if (f_87_ > f_65_)
					f_65_ = f_87_;
				bool_62_ = true;
			}
		}
		if (bool_62_ && (float) i > f && (float) i < f_63_ && (float) i_60_ > f_64_ && (float) i_60_ < f_65_) {
			if (bool)
				return true;
			if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
				anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
				anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
			}
			for (int i_88_ = 0; i_88_ < ((Class528_Sub3) this).anInt8910; i_88_++) {
				float f_89_ = (float) ((Class528_Sub3) this).anIntArray8901[i_88_];
				float f_90_ = (float) ((Class528_Sub3) this).anIntArray8902[i_88_];
				float f_91_ = (float) ((Class528_Sub3) this).anIntArray8931[i_88_];
				float f_92_ = (class384.buf[2] * f_89_ + class384.buf[6] * f_90_ + class384.buf[10] * f_91_ + class384.buf[14]);
				float f_93_ = (class384.buf[3] * f_89_ + class384.buf[7] * f_90_ + class384.buf[11] * f_91_ + class384.buf[15]);
				if (f_92_ >= -f_93_) {
					float f_94_ = (class384.buf[0] * f_89_ + class384.buf[4] * f_90_ + class384.buf[8] * f_91_ + class384.buf[12]);
					float f_95_ = (class384.buf[1] * f_89_ + class384.buf[5] * f_90_ + class384.buf[9] * f_91_ + class384.buf[13]);
					int i_96_ = ((Class528_Sub3) this).anIntArray8947[i_88_];
					int i_97_ = ((Class528_Sub3) this).anIntArray8947[i_88_ + 1];
					for (int i_98_ = i_96_; i_98_ < i_97_; i_98_++) {
						int i_99_ = (((Class528_Sub3) this).aShortArray8948[i_98_] - 1);
						if (i_99_ == -1)
							break;
						anIntArray8928[i_99_] = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_94_ / f_93_));
						anIntArray8958[i_99_] = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_95_ / f_93_));
					}
				} else {
					int i_100_ = ((Class528_Sub3) this).anIntArray8947[i_88_];
					int i_101_ = ((Class528_Sub3) this).anIntArray8947[i_88_ + 1];
					for (int i_102_ = i_100_; i_102_ < i_101_; i_102_++) {
						int i_103_ = (((Class528_Sub3) this).aShortArray8948[i_102_] - 1);
						if (i_103_ == -1)
							break;
						anIntArray8928[(((Class528_Sub3) this).aShortArray8948[i_102_]) - 1] = -999999;
					}
				}
			}
			for (int i_104_ = 0; i_104_ < ((Class528_Sub3) this).anInt8916; i_104_++) {
				if (anIntArray8928[(((Class528_Sub3) this).aShortArray8920[i_104_])] != -999999 && anIntArray8928[(((Class528_Sub3) this).aShortArray8921[i_104_])] != -999999 && anIntArray8928[(((Class528_Sub3) this).aShortArray8922[i_104_])] != -999999
						&& method14276(i, i_60_, anIntArray8958[(((Class528_Sub3) this).aShortArray8920[i_104_])], anIntArray8958[(((Class528_Sub3) this).aShortArray8921[i_104_])], anIntArray8958[(((Class528_Sub3) this).aShortArray8922[i_104_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8920[i_104_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8921[i_104_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8922[i_104_])]))
					return true;
			}
		}
		return false;
	}

	public void t(int i) {
		int i_105_ = Class382.anIntArray4657[i];
		int i_106_ = Class382.anIntArray4661[i];
		for (int i_107_ = 0; i_107_ < ((Class528_Sub3) this).anInt8910; i_107_++) {
			int i_108_ = ((((Class528_Sub3) this).anIntArray8902[i_107_] * i_106_ - ((Class528_Sub3) this).anIntArray8931[i_107_] * i_105_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_107_] = ((((Class528_Sub3) this).anIntArray8902[i_107_] * i_105_ + ((Class528_Sub3) this).anIntArray8931[i_107_] * i_106_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_107_] = i_108_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void EA(int i) {
		int i_109_ = Class382.anIntArray4657[i];
		int i_110_ = Class382.anIntArray4661[i];
		for (int i_111_ = 0; i_111_ < ((Class528_Sub3) this).anInt8910; i_111_++) {
			int i_112_ = ((((Class528_Sub3) this).anIntArray8902[i_111_] * i_109_ + ((Class528_Sub3) this).anIntArray8901[i_111_] * i_110_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_111_] = ((((Class528_Sub3) this).anIntArray8902[i_111_] * i_110_ - ((Class528_Sub3) this).anIntArray8901[i_111_] * i_109_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_111_] = i_112_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void ia(int i, int i_113_, int i_114_) {
		for (int i_115_ = 0; i_115_ < ((Class528_Sub3) this).anInt8910; i_115_++) {
			if (i != 0)
				((Class528_Sub3) this).anIntArray8901[i_115_] += i;
			if (i_113_ != 0)
				((Class528_Sub3) this).anIntArray8902[i_115_] += i_113_;
			if (i_114_ != 0)
				((Class528_Sub3) this).anIntArray8931[i_115_] += i_114_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	boolean method14271() {
		if (((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408)
			return true;
		if (((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_409 == null)
			((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_409 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13993(false);
		Interface32 interface32 = (((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_409);
		interface32.method208(((Class528_Sub3) this).anInt8963 * 6);
		Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
		if (unsafe != null) {
			int i = ((Class528_Sub3) this).anInt8963 * 6;
			long l = interface32.method40(0, i);
			if (l == 0L)
				return false;
			for (int i_116_ = 0; i_116_ < ((Class528_Sub3) this).anInt8963; i_116_++) {
				unsafe.putShort(l, (((Class528_Sub3) this).aShortArray8920[i_116_]));
				l += 2L;
				unsafe.putShort(l, (((Class528_Sub3) this).aShortArray8921[i_116_]));
				l += 2L;
				unsafe.putShort(l, (((Class528_Sub3) this).aShortArray8922[i_116_]));
				l += 2L;
			}
			interface32.method38();
			((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407 = interface32;
			((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408 = true;
			((Class528_Sub3) this).aBool8919 = true;
			return true;
		}
		ByteBuffer bytebuffer = ((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838;
		bytebuffer.clear();
		for (int i = 0; i < ((Class528_Sub3) this).anInt8963; i++) {
			bytebuffer.putShort(((Class528_Sub3) this).aShortArray8920[i]);
			bytebuffer.putShort(((Class528_Sub3) this).aShortArray8921[i]);
			bytebuffer.putShort(((Class528_Sub3) this).aShortArray8922[i]);
		}
		if (interface32.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695))) {
			((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407 = interface32;
			((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408 = true;
			((Class528_Sub3) this).aBool8919 = true;
			return true;
		}
		return false;
	}

	public void oa(int i, int i_117_, int i_118_) {
		for (int i_119_ = 0; i_119_ < ((Class528_Sub3) this).anInt8910; i_119_++) {
			if (i != 128)
				((Class528_Sub3) this).anIntArray8901[i_119_] = ((Class528_Sub3) this).anIntArray8901[i_119_] * i >> 7;
			if (i_117_ != 128)
				((Class528_Sub3) this).anIntArray8902[i_119_] = (((Class528_Sub3) this).anIntArray8902[i_119_] * i_117_ >> 7);
			if (i_118_ != 128)
				((Class528_Sub3) this).anIntArray8931[i_119_] = (((Class528_Sub3) this).anIntArray8931[i_119_] * i_118_ >> 7);
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public int co() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8943;
	}

	public void aq(int i) {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8927).aBool663 = Class50.method995(i, ((Class528_Sub3) this).anInt8896);
		if (((Class528_Sub3) this).aClass63_8930 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8930).aBool663 = Class50.method1056(i, ((Class528_Sub3) this).anInt8896);
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool663 = Class50.method1051(i, ((Class528_Sub3) this).anInt8896);
		if (((Class528_Sub3) this).aClass63_8929 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8929).aBool663 = Class50.method1020(i, ((Class528_Sub3) this).anInt8896);
		((Class528_Sub3) this).anInt8895 = i;
		if (((Class528_Sub3) this).aClass355_8962 != null && (((Class528_Sub3) this).anInt8895 & 0x10000) == 0) {
			((Class528_Sub3) this).aShortArray8909 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115);
			((Class528_Sub3) this).aShortArray8933 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114);
			((Class528_Sub3) this).aShortArray8911 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113);
			((Class528_Sub3) this).aByteArray8912 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116);
			((Class528_Sub3) this).aClass355_8962 = null;
		}
		((Class528_Sub3) this).aBool8919 = true;
		method14274();
	}

	public int N() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8936;
	}

	public byte[] aw() {
		return ((Class528_Sub3) this).aByteArray8900;
	}

	public int RA() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8940;
	}

	public int ya() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8941;
	}

	public int ar() {
		return ((Class528_Sub3) this).anInt8895;
	}

	public int dg() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8957;
	}

	Class528_Sub3(Class505_Sub2 class505_sub2, RSMesh class157, int i, int i_120_, int i_121_, int i_122_) {
		this(class505_sub2, i, i_122_, true, false);
		Interface22 interface22 = class505_sub2.anInterface22_5834;
		int[] is = new int[class157.anInt1973];
		((Class528_Sub3) this).anIntArray8947 = new int[class157.anInt1999 + 1];
		for (int i_123_ = 0; i_123_ < class157.anInt1973; i_123_++) {
			if (class157.aByteArray1985 == null || class157.aByteArray1985[i_123_] != 2) {
				if (class157.aShortArray1993 != null && class157.aShortArray1993[i_123_] != -1) {
					Class169 class169 = interface22.method144((class157.aShortArray1993[i_123_]) & 0xffff, -1906869426);
					if (((((Class528_Sub3) this).anInt8896 & 0x40) == 0 || !class169.aBool2056) && class169.aBool2072)
						continue;
				}
				is[((Class528_Sub3) this).anInt8916++] = i_123_;
				((Class528_Sub3) this).anIntArray8947[(class157.aShortArray1982[i_123_])]++;
				((Class528_Sub3) this).anIntArray8947[(class157.aShortArray1983[i_123_])]++;
				((Class528_Sub3) this).anIntArray8947[(class157.aShortArray1984[i_123_])]++;
			}
		}
		((Class528_Sub3) this).anInt8963 = ((Class528_Sub3) this).anInt8916;
		long[] ls = new long[((Class528_Sub3) this).anInt8916];
		boolean bool = (((Class528_Sub3) this).anInt8895 & 0x100) != 0;
		for (int i_124_ = 0; i_124_ < ((Class528_Sub3) this).anInt8916; i_124_++) {
			int i_125_ = is[i_124_];
			Class169 class169 = null;
			int i_126_ = 0;
			int i_127_ = 0;
			int i_128_ = 0;
			int i_129_ = 0;
			if (class157.aClass84Array2009 != null) {
				boolean bool_130_ = false;
				for (int i_131_ = 0; i_131_ < class157.aClass84Array2009.length; i_131_++) {
					Class84 class84 = class157.aClass84Array2009[i_131_];
					if (i_125_ == class84.anInt809 * 2110152423) {
						Class347 class347 = Class417.method7005((class84.anInt812 * -221586257), -1690640599);
						if (class347.aBool4059)
							bool_130_ = true;
						if (class347.anInt4055 * 117872423 != -1) {
							Class169 class169_132_ = interface22.method144((class347.anInt4055 * 117872423), -1795935165);
							if (class169_132_.anInt2074 * 1960017665 == 2)
								((Class528_Sub3) this).aBool8959 = true;
						}
					}
				}
				if (bool_130_) {
					ls[i_124_] = 9223372036854775807L;
					((Class528_Sub3) this).anInt8963--;
					continue;
				}
			}
			int i_133_ = -1;
			if (class157.aShortArray1993 != null) {
				i_133_ = class157.aShortArray1993[i_125_];
				if (i_133_ != -1) {
					class169 = interface22.method144(i_133_ & 0xffff, -2013100197);
					if ((((Class528_Sub3) this).anInt8896 & 0x40) == 0 || !class169.aBool2056) {
						i_128_ = class169.aByte2064;
						i_129_ = class169.aByte2076;
					} else {
						i_133_ = -1;
						class169 = null;
					}
				}
			}
			boolean bool_134_ = ((class157.aByteArray1975 != null && class157.aByteArray1975[i_125_] != 0) || (class169 != null && class169.anInt2074 * 1960017665 != 0));
			if ((bool || bool_134_) && class157.aByteArray1977 != null)
				i_126_ += class157.aByteArray1977[i_125_] << 17;
			if (bool_134_)
				i_126_ += 65536;
			i_126_ += (i_128_ & 0xff) << 8;
			i_126_ += i_129_ & 0xff;
			i_127_ += (i_133_ & 0xffff) << 16;
			i_127_ += i_124_ & 0xffff;
			ls[i_124_] = ((long) i_126_ << 32) + (long) i_127_;
			((Class528_Sub3) this).aBool8959 |= bool_134_;
			Class528_Sub3 class528_sub3_135_ = this;
			((Class528_Sub3) class528_sub3_135_).aBool8903 = (((Class528_Sub3) class528_sub3_135_).aBool8903 | (class169 != null && (class169.aByte2081 != 0 || class169.aByte2090 != 0)));
		}
		Class159.method2736(ls, is, (byte) 8);
		((Class528_Sub3) this).anInt8899 = class157.anInt1974;
		((Class528_Sub3) this).anInt8910 = class157.anInt1999;
		((Class528_Sub3) this).anIntArray8901 = class157.anIntArray1976;
		((Class528_Sub3) this).anIntArray8902 = class157.anIntArray2003;
		((Class528_Sub3) this).anIntArray8931 = class157.anIntArray1978;
		((Class528_Sub3) this).aShortArray8905 = class157.aShortArray1980;
		Class36[] class36s = new Class36[((Class528_Sub3) this).anInt8910];
		((Class528_Sub3) this).aClass87Array8949 = class157.aClass87Array2007;
		((Class528_Sub3) this).aClass172Array8950 = class157.aClass172Array2008;
		if (class157.aClass84Array2009 != null) {
			((Class528_Sub3) this).anInt8951 = class157.aClass84Array2009.length;
			((Class528_Sub3) this).aClass56Array8934 = new Class56[((Class528_Sub3) this).anInt8951];
			((Class528_Sub3) this).aClass65Array8953 = new Class65[((Class528_Sub3) this).anInt8951];
			for (int i_136_ = 0; i_136_ < ((Class528_Sub3) this).anInt8951; i_136_++) {
				Class84 class84 = class157.aClass84Array2009[i_136_];
				Class347 class347 = Class417.method7005(class84.anInt812 * -221586257, -1212131848);
				int i_137_ = -1;
				for (int i_138_ = 0; i_138_ < ((Class528_Sub3) this).anInt8916; i_138_++) {
					if (is[i_138_] == class84.anInt809 * 2110152423) {
						i_137_ = i_138_;
						break;
					}
				}
				if (i_137_ == -1)
					throw new RuntimeException();
				int i_139_ = ((Class540.anIntArray7136[(class157.aShortArray2006[class84.anInt809 * 2110152423]) & 0xffff]) & 0xffffff);
				i_139_ = i_139_ | 255 - (class157.aByteArray1975 != null ? (class157.aByteArray1975[class84.anInt809 * 2110152423]) : 0) << 24;
				((Class528_Sub3) this).aClass56Array8934[i_136_] = new Class56(i_137_, (class157.aShortArray1982[class84.anInt809 * 2110152423]), (class157.aShortArray1983[class84.anInt809 * 2110152423]), (class157.aShortArray1984[class84.anInt809 * 2110152423]), class347.anInt4054 * -1720863327, class347.anInt4050 * -743047207, class347.anInt4055 * 117872423, class347.anInt4057 * 1007428267, class347.anInt4051 * -920295177, class347.aBool4059, class347.aBool4058, class84.anInt810 * 1823219025);
				((Class528_Sub3) this).aClass65Array8953[i_136_] = new Class65(i_139_);
			}
		}
		int i_140_ = ((Class528_Sub3) this).anInt8916 * 3;
		((Class528_Sub3) this).aShortArray8907 = new short[i_140_];
		((Class528_Sub3) this).aShortArray8945 = new short[i_140_];
		((Class528_Sub3) this).aShortArray8909 = new short[i_140_];
		((Class528_Sub3) this).aShortArray8933 = new short[i_140_];
		((Class528_Sub3) this).aShortArray8911 = new short[i_140_];
		((Class528_Sub3) this).aByteArray8912 = new byte[i_140_];
		((Class528_Sub3) this).aFloatArray8892 = new float[i_140_];
		((Class528_Sub3) this).aFloatArray8914 = new float[i_140_];
		((Class528_Sub3) this).aShortArray8918 = new short[((Class528_Sub3) this).anInt8916];
		((Class528_Sub3) this).aByteArray8900 = new byte[((Class528_Sub3) this).anInt8916];
		((Class528_Sub3) this).aShortArray8920 = new short[((Class528_Sub3) this).anInt8916];
		((Class528_Sub3) this).aShortArray8921 = new short[((Class528_Sub3) this).anInt8916];
		((Class528_Sub3) this).aShortArray8922 = new short[((Class528_Sub3) this).anInt8916];
		((Class528_Sub3) this).aShortArray8923 = new short[((Class528_Sub3) this).anInt8916];
		if (class157.aShortArray1981 != null)
			((Class528_Sub3) this).aShortArray8925 = new short[((Class528_Sub3) this).anInt8916];
		((Class528_Sub3) this).aShort8897 = (short) i_120_;
		((Class528_Sub3) this).aShort8898 = (short) i_121_;
		((Class528_Sub3) this).aShortArray8948 = new short[i_140_];
		aLongArray8955 = new long[i_140_];
		int i_141_ = 0;
		for (int i_142_ = 0; i_142_ < class157.anInt1999; i_142_++) {
			int i_143_ = ((Class528_Sub3) this).anIntArray8947[i_142_];
			((Class528_Sub3) this).anIntArray8947[i_142_] = i_141_;
			i_141_ += i_143_;
			class36s[i_142_] = new Class36();
		}
		((Class528_Sub3) this).anIntArray8947[class157.anInt1999] = i_141_;
		Class83 class83 = method11256(class157, is, ((Class528_Sub3) this).anInt8916);
		Class64[] class64s = new Class64[class157.anInt1973];
		for (int i_144_ = 0; i_144_ < class157.anInt1973; i_144_++) {
			short i_145_ = class157.aShortArray1982[i_144_];
			short i_146_ = class157.aShortArray1983[i_144_];
			short i_147_ = class157.aShortArray1984[i_144_];
			int i_148_ = (((Class528_Sub3) this).anIntArray8901[i_146_] - ((Class528_Sub3) this).anIntArray8901[i_145_]);
			int i_149_ = (((Class528_Sub3) this).anIntArray8902[i_146_] - ((Class528_Sub3) this).anIntArray8902[i_145_]);
			int i_150_ = (((Class528_Sub3) this).anIntArray8931[i_146_] - ((Class528_Sub3) this).anIntArray8931[i_145_]);
			int i_151_ = (((Class528_Sub3) this).anIntArray8901[i_147_] - ((Class528_Sub3) this).anIntArray8901[i_145_]);
			int i_152_ = (((Class528_Sub3) this).anIntArray8902[i_147_] - ((Class528_Sub3) this).anIntArray8902[i_145_]);
			int i_153_ = (((Class528_Sub3) this).anIntArray8931[i_147_] - ((Class528_Sub3) this).anIntArray8931[i_145_]);
			int i_154_ = i_149_ * i_153_ - i_152_ * i_150_;
			int i_155_ = i_150_ * i_151_ - i_153_ * i_148_;
			int i_156_;
			for (i_156_ = i_148_ * i_152_ - i_151_ * i_149_; (i_154_ > 8192 || i_155_ > 8192 || i_156_ > 8192 || i_154_ < -8192 || i_155_ < -8192 || i_156_ < -8192); i_156_ >>= 1) {
				i_154_ >>= 1;
				i_155_ >>= 1;
			}
			int i_157_ = (int) Math.sqrt((double) (i_154_ * i_154_ + i_155_ * i_155_ + i_156_ * i_156_));
			if (i_157_ <= 0)
				i_157_ = 1;
			i_154_ = i_154_ * 256 / i_157_;
			i_155_ = i_155_ * 256 / i_157_;
			i_156_ = i_156_ * 256 / i_157_;
			byte i_158_ = (class157.aByteArray1985 == null ? (byte) 0 : class157.aByteArray1985[i_144_]);
			if (i_158_ == 0) {
				Class36 class36 = class36s[i_145_];
				((Class36) class36).anInt387 += i_154_;
				((Class36) class36).anInt385 += i_155_;
				((Class36) class36).anInt384 += i_156_;
				((Class36) class36).anInt386++;
				class36 = class36s[i_146_];
				((Class36) class36).anInt387 += i_154_;
				((Class36) class36).anInt385 += i_155_;
				((Class36) class36).anInt384 += i_156_;
				((Class36) class36).anInt386++;
				class36 = class36s[i_147_];
				((Class36) class36).anInt387 += i_154_;
				((Class36) class36).anInt385 += i_155_;
				((Class36) class36).anInt384 += i_156_;
				((Class36) class36).anInt386++;
			} else if (i_158_ == 1) {
				Class64 class64 = class64s[i_144_] = new Class64();
				((Class64) class64).anInt665 = i_154_;
				((Class64) class64).anInt666 = i_155_;
				((Class64) class64).anInt667 = i_156_;
			}
		}
		for (int i_159_ = 0; i_159_ < ((Class528_Sub3) this).anInt8916; i_159_++) {
			int i_160_ = is[i_159_];
			int i_161_ = class157.aShortArray2006[i_160_] & 0xffff;
			int i_162_;
			if (class157.aByteArray1988 == null)
				i_162_ = -1;
			else
				i_162_ = class157.aByteArray1988[i_160_];
			int i_163_;
			if (class157.aByteArray1975 == null)
				i_163_ = 0;
			else
				i_163_ = class157.aByteArray1975[i_160_] & 0xff;
			short i_164_ = (class157.aShortArray1993 == null ? (short) -1 : class157.aShortArray1993[i_160_]);
			if (i_164_ != -1 && (((Class528_Sub3) this).anInt8896 & 0x40) != 0) {
				Class169 class169 = interface22.method144(i_164_ & 0xffff, -2082914380);
				if (class169.aBool2056)
					i_164_ = (short) -1;
			}
			float f = 0.0F;
			float f_165_ = 0.0F;
			float f_166_ = 0.0F;
			float f_167_ = 0.0F;
			float f_168_ = 0.0F;
			float f_169_ = 0.0F;
			int i_170_ = 0;
			int i_171_ = 0;
			int i_172_ = 0;
			if (i_164_ != -1) {
				if (i_162_ == -1) {
					f = 0.0F;
					f_165_ = 1.0F;
					f_166_ = 1.0F;
					f_167_ = 1.0F;
					i_170_ = 1;
					f_168_ = 0.0F;
					f_169_ = 0.0F;
					i_171_ = 2;
				} else {
					i_162_ &= 0xff;
					byte i_173_ = class157.aByteArray1995[i_162_];
					if (i_173_ == 0) {
						short i_174_ = class157.aShortArray1982[i_160_];
						short i_175_ = class157.aShortArray1983[i_160_];
						short i_176_ = class157.aShortArray1984[i_160_];
						short i_177_ = class157.aShortArray1996[i_162_];
						short i_178_ = class157.aShortArray1987[i_162_];
						short i_179_ = class157.aShortArray1998[i_162_];
						float f_180_ = (float) class157.anIntArray1976[i_177_];
						float f_181_ = (float) class157.anIntArray2003[i_177_];
						float f_182_ = (float) class157.anIntArray1978[i_177_];
						float f_183_ = (float) class157.anIntArray1976[i_178_] - f_180_;
						float f_184_ = (float) class157.anIntArray2003[i_178_] - f_181_;
						float f_185_ = (float) class157.anIntArray1978[i_178_] - f_182_;
						float f_186_ = (float) class157.anIntArray1976[i_179_] - f_180_;
						float f_187_ = (float) class157.anIntArray2003[i_179_] - f_181_;
						float f_188_ = (float) class157.anIntArray1978[i_179_] - f_182_;
						float f_189_ = (float) class157.anIntArray1976[i_174_] - f_180_;
						float f_190_ = (float) class157.anIntArray2003[i_174_] - f_181_;
						float f_191_ = (float) class157.anIntArray1978[i_174_] - f_182_;
						float f_192_ = (float) class157.anIntArray1976[i_175_] - f_180_;
						float f_193_ = (float) class157.anIntArray2003[i_175_] - f_181_;
						float f_194_ = (float) class157.anIntArray1978[i_175_] - f_182_;
						float f_195_ = (float) class157.anIntArray1976[i_176_] - f_180_;
						float f_196_ = (float) class157.anIntArray2003[i_176_] - f_181_;
						float f_197_ = (float) class157.anIntArray1978[i_176_] - f_182_;
						float f_198_ = f_184_ * f_188_ - f_185_ * f_187_;
						float f_199_ = f_185_ * f_186_ - f_183_ * f_188_;
						float f_200_ = f_183_ * f_187_ - f_184_ * f_186_;
						float f_201_ = f_187_ * f_200_ - f_188_ * f_199_;
						float f_202_ = f_188_ * f_198_ - f_186_ * f_200_;
						float f_203_ = f_186_ * f_199_ - f_187_ * f_198_;
						float f_204_ = 1.0F / (f_201_ * f_183_ + f_202_ * f_184_ + f_203_ * f_185_);
						f = (f_201_ * f_189_ + f_202_ * f_190_ + f_203_ * f_191_) * f_204_;
						f_166_ = (f_201_ * f_192_ + f_202_ * f_193_ + f_203_ * f_194_) * f_204_;
						f_168_ = (f_201_ * f_195_ + f_202_ * f_196_ + f_203_ * f_197_) * f_204_;
						f_201_ = f_184_ * f_200_ - f_185_ * f_199_;
						f_202_ = f_185_ * f_198_ - f_183_ * f_200_;
						f_203_ = f_183_ * f_199_ - f_184_ * f_198_;
						f_204_ = 1.0F / (f_201_ * f_186_ + f_202_ * f_187_ + f_203_ * f_188_);
						f_165_ = (f_201_ * f_189_ + f_202_ * f_190_ + f_203_ * f_191_) * f_204_;
						f_167_ = (f_201_ * f_192_ + f_202_ * f_193_ + f_203_ * f_194_) * f_204_;
						f_169_ = (f_201_ * f_195_ + f_202_ * f_196_ + f_203_ * f_197_) * f_204_;
					} else {
						short i_205_ = class157.aShortArray1982[i_160_];
						short i_206_ = class157.aShortArray1983[i_160_];
						short i_207_ = class157.aShortArray1984[i_160_];
						int i_208_ = class83.anIntArray808[i_162_];
						int i_209_ = class83.anIntArray805[i_162_];
						int i_210_ = class83.anIntArray807[i_162_];
						float[] fs = class83.aFloatArrayArray806[i_162_];
						byte i_211_ = class157.aByteArray1990[i_162_];
						float f_212_ = (float) class157.anIntArray1992[i_162_] / 256.0F;
						if (i_173_ == 1) {
							float f_213_ = ((float) class157.anIntArray2001[i_162_] / 1024.0F);
							method11306(class157.anIntArray1976[i_205_], class157.anIntArray2003[i_205_], class157.anIntArray1978[i_205_], i_208_, i_209_, i_210_, fs, f_213_, i_211_, f_212_, aFloatArray8956);
							f = aFloatArray8956[0];
							f_165_ = aFloatArray8956[1];
							method11306(class157.anIntArray1976[i_206_], class157.anIntArray2003[i_206_], class157.anIntArray1978[i_206_], i_208_, i_209_, i_210_, fs, f_213_, i_211_, f_212_, aFloatArray8956);
							f_166_ = aFloatArray8956[0];
							f_167_ = aFloatArray8956[1];
							method11306(class157.anIntArray1976[i_207_], class157.anIntArray2003[i_207_], class157.anIntArray1978[i_207_], i_208_, i_209_, i_210_, fs, f_213_, i_211_, f_212_, aFloatArray8956);
							f_168_ = aFloatArray8956[0];
							f_169_ = aFloatArray8956[1];
							float f_214_ = f_213_ / 2.0F;
							if ((i_211_ & 0x1) == 0) {
								if (f_166_ - f > f_214_) {
									f_166_ -= f_213_;
									i_170_ = 1;
								} else if (f - f_166_ > f_214_) {
									f_166_ += f_213_;
									i_170_ = 2;
								}
								if (f_168_ - f > f_214_) {
									f_168_ -= f_213_;
									i_171_ = 1;
								} else if (f - f_168_ > f_214_) {
									f_168_ += f_213_;
									i_171_ = 2;
								}
							} else {
								if (f_167_ - f_165_ > f_214_) {
									f_167_ -= f_213_;
									i_170_ = 1;
								} else if (f_165_ - f_167_ > f_214_) {
									f_167_ += f_213_;
									i_170_ = 2;
								}
								if (f_169_ - f_165_ > f_214_) {
									f_169_ -= f_213_;
									i_171_ = 1;
								} else if (f_165_ - f_169_ > f_214_) {
									f_169_ += f_213_;
									i_171_ = 2;
								}
							}
						} else if (i_173_ == 2) {
							float f_215_ = ((float) class157.anIntArray1997[i_162_] / 256.0F);
							float f_216_ = ((float) class157.anIntArray2004[i_162_] / 256.0F);
							int i_217_ = (class157.anIntArray1976[i_206_] - class157.anIntArray1976[i_205_]);
							int i_218_ = (class157.anIntArray2003[i_206_] - class157.anIntArray2003[i_205_]);
							int i_219_ = (class157.anIntArray1978[i_206_] - class157.anIntArray1978[i_205_]);
							int i_220_ = (class157.anIntArray1976[i_207_] - class157.anIntArray1976[i_205_]);
							int i_221_ = (class157.anIntArray2003[i_207_] - class157.anIntArray2003[i_205_]);
							int i_222_ = (class157.anIntArray1978[i_207_] - class157.anIntArray1978[i_205_]);
							int i_223_ = i_218_ * i_222_ - i_221_ * i_219_;
							int i_224_ = i_219_ * i_220_ - i_222_ * i_217_;
							int i_225_ = i_217_ * i_221_ - i_220_ * i_218_;
							float f_226_ = (64.0F / (float) class157.anIntArray1989[i_162_]);
							float f_227_ = (64.0F / (float) class157.anIntArray2000[i_162_]);
							float f_228_ = (64.0F / (float) class157.anIntArray2001[i_162_]);
							float f_229_ = (((float) i_223_ * fs[0] + (float) i_224_ * fs[1] + (float) i_225_ * fs[2]) / f_226_);
							float f_230_ = (((float) i_223_ * fs[3] + (float) i_224_ * fs[4] + (float) i_225_ * fs[5]) / f_227_);
							float f_231_ = (((float) i_223_ * fs[6] + (float) i_224_ * fs[7] + (float) i_225_ * fs[8]) / f_228_);
							i_172_ = method11254(f_229_, f_230_, f_231_);
							method11255(class157.anIntArray1976[i_205_], class157.anIntArray2003[i_205_], class157.anIntArray1978[i_205_], i_208_, i_209_, i_210_, i_172_, fs, i_211_, f_212_, f_215_, f_216_, aFloatArray8956);
							f = aFloatArray8956[0];
							f_165_ = aFloatArray8956[1];
							method11255(class157.anIntArray1976[i_206_], class157.anIntArray2003[i_206_], class157.anIntArray1978[i_206_], i_208_, i_209_, i_210_, i_172_, fs, i_211_, f_212_, f_215_, f_216_, aFloatArray8956);
							f_166_ = aFloatArray8956[0];
							f_167_ = aFloatArray8956[1];
							method11255(class157.anIntArray1976[i_207_], class157.anIntArray2003[i_207_], class157.anIntArray1978[i_207_], i_208_, i_209_, i_210_, i_172_, fs, i_211_, f_212_, f_215_, f_216_, aFloatArray8956);
							f_168_ = aFloatArray8956[0];
							f_169_ = aFloatArray8956[1];
						} else if (i_173_ == 3) {
							method11271(class157.anIntArray1976[i_205_], class157.anIntArray2003[i_205_], class157.anIntArray1978[i_205_], i_208_, i_209_, i_210_, fs, i_211_, f_212_, aFloatArray8956);
							f = aFloatArray8956[0];
							f_165_ = aFloatArray8956[1];
							method11271(class157.anIntArray1976[i_206_], class157.anIntArray2003[i_206_], class157.anIntArray1978[i_206_], i_208_, i_209_, i_210_, fs, i_211_, f_212_, aFloatArray8956);
							f_166_ = aFloatArray8956[0];
							f_167_ = aFloatArray8956[1];
							method11271(class157.anIntArray1976[i_207_], class157.anIntArray2003[i_207_], class157.anIntArray1978[i_207_], i_208_, i_209_, i_210_, fs, i_211_, f_212_, aFloatArray8956);
							f_168_ = aFloatArray8956[0];
							f_169_ = aFloatArray8956[1];
							if ((i_211_ & 0x1) == 0) {
								if (f_166_ - f > 0.5F) {
									f_166_--;
									i_170_ = 1;
								} else if (f - f_166_ > 0.5F) {
									f_166_++;
									i_170_ = 2;
								}
								if (f_168_ - f > 0.5F) {
									f_168_--;
									i_171_ = 1;
								} else if (f - f_168_ > 0.5F) {
									f_168_++;
									i_171_ = 2;
								}
							} else {
								if (f_167_ - f_165_ > 0.5F) {
									f_167_--;
									i_170_ = 1;
								} else if (f_165_ - f_167_ > 0.5F) {
									f_167_++;
									i_170_ = 2;
								}
								if (f_169_ - f_165_ > 0.5F) {
									f_169_--;
									i_171_ = 1;
								} else if (f_165_ - f_169_ > 0.5F) {
									f_169_++;
									i_171_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_232_;
			if (class157.aByteArray1985 == null)
				i_232_ = (byte) 0;
			else
				i_232_ = class157.aByteArray1985[i_160_];
			if (i_232_ == 0) {
				long l = ((long) (i_162_ << 2) + (((long) (i_172_ << 24) + (long) (i_161_ << 8) + (long) i_163_) << 32));
				short i_233_ = class157.aShortArray1982[i_160_];
				short i_234_ = class157.aShortArray1983[i_160_];
				short i_235_ = class157.aShortArray1984[i_160_];
				Class36 class36 = class36s[i_233_];
				((Class528_Sub3) this).aShortArray8920[i_159_] = method14266(class157, i_233_, i_159_, l, ((Class36) class36).anInt387, ((Class36) class36).anInt385, ((Class36) class36).anInt384, ((Class36) class36).anInt386, f, f_165_);
				class36 = class36s[i_234_];
				((Class528_Sub3) this).aShortArray8921[i_159_] = method14266(class157, i_234_, i_159_, l + (long) i_170_, ((Class36) class36).anInt387, ((Class36) class36).anInt385, ((Class36) class36).anInt384, ((Class36) class36).anInt386, f_166_, f_167_);
				class36 = class36s[i_235_];
				((Class528_Sub3) this).aShortArray8922[i_159_] = method14266(class157, i_235_, i_159_, l + (long) i_171_, ((Class36) class36).anInt387, ((Class36) class36).anInt385, ((Class36) class36).anInt384, ((Class36) class36).anInt386, f_168_, f_169_);
			} else if (i_232_ == 1) {
				Class64 class64 = class64s[i_160_];
				long l = ((long) ((i_162_ << 2) + (((Class64) class64).anInt665 > 0 ? 1024 : 2048) + (((Class64) class64).anInt666 + 256 << 12) + (((Class64) class64).anInt667 + 256 << 22)) + (((long) (i_172_ << 24) + (long) (i_161_ << 8) + (long) i_163_) << 32));
				((Class528_Sub3) this).aShortArray8920[i_159_] = method14266(class157, class157.aShortArray1982[i_160_], i_159_, l, ((Class64) class64).anInt665, ((Class64) class64).anInt666, ((Class64) class64).anInt667, 0, f, f_165_);
				((Class528_Sub3) this).aShortArray8921[i_159_] = method14266(class157, class157.aShortArray1983[i_160_], i_159_, l + (long) i_170_, ((Class64) class64).anInt665, ((Class64) class64).anInt666, ((Class64) class64).anInt667, 0, f_166_, f_167_);
				((Class528_Sub3) this).aShortArray8922[i_159_] = method14266(class157, class157.aShortArray1984[i_160_], i_159_, l + (long) i_171_, ((Class64) class64).anInt665, ((Class64) class64).anInt666, ((Class64) class64).anInt667, 0, f_168_, f_169_);
			}
			if (class157.aByteArray1975 != null)
				((Class528_Sub3) this).aByteArray8900[i_159_] = class157.aByteArray1975[i_160_];
			if (class157.aShortArray1981 != null)
				((Class528_Sub3) this).aShortArray8925[i_159_] = class157.aShortArray1981[i_160_];
			((Class528_Sub3) this).aShortArray8918[i_159_] = class157.aShortArray2006[i_160_];
			((Class528_Sub3) this).aShortArray8923[i_159_] = i_164_;
		}
		if (((Class528_Sub3) this).anInt8963 > 0) {
			int i_236_ = 1;
			short i_237_ = ((Class528_Sub3) this).aShortArray8923[0];
			for (int i_238_ = 0; i_238_ < ((Class528_Sub3) this).anInt8963; i_238_++) {
				short i_239_ = ((Class528_Sub3) this).aShortArray8923[i_238_];
				if (i_239_ != i_237_) {
					i_236_++;
					i_237_ = i_239_;
				}
			}
			((Class528_Sub3) this).anIntArray8952 = new int[i_236_];
			((Class528_Sub3) this).anIntArray8946 = new int[i_236_];
			((Class528_Sub3) this).anIntArray8944 = new int[i_236_ + 1];
			((Class528_Sub3) this).anIntArray8944[0] = 0;
			int i_240_ = ((Class528_Sub3) this).anInt8906;
			int i_241_ = 0;
			i_236_ = 0;
			i_237_ = ((Class528_Sub3) this).aShortArray8923[0];
			for (int i_242_ = 0; i_242_ < ((Class528_Sub3) this).anInt8963; i_242_++) {
				short i_243_ = ((Class528_Sub3) this).aShortArray8923[i_242_];
				if (i_243_ != i_237_) {
					((Class528_Sub3) this).anIntArray8952[i_236_] = i_240_;
					((Class528_Sub3) this).anIntArray8946[i_236_] = i_241_ - i_240_ + 1;
					((Class528_Sub3) this).anIntArray8944[++i_236_] = i_242_;
					i_240_ = ((Class528_Sub3) this).anInt8906;
					i_241_ = 0;
					i_237_ = i_243_;
				}
				int i_244_ = ((Class528_Sub3) this).aShortArray8920[i_242_];
				if (i_244_ < i_240_)
					i_240_ = i_244_;
				if (i_244_ > i_241_)
					i_241_ = i_244_;
				i_244_ = ((Class528_Sub3) this).aShortArray8921[i_242_];
				if (i_244_ < i_240_)
					i_240_ = i_244_;
				if (i_244_ > i_241_)
					i_241_ = i_244_;
				i_244_ = ((Class528_Sub3) this).aShortArray8922[i_242_];
				if (i_244_ < i_240_)
					i_240_ = i_244_;
				if (i_244_ > i_241_)
					i_241_ = i_244_;
			}
			((Class528_Sub3) this).anIntArray8952[i_236_] = i_240_;
			((Class528_Sub3) this).anIntArray8946[i_236_] = i_241_ - i_240_ + 1;
			((Class528_Sub3) this).anIntArray8944[++i_236_] = ((Class528_Sub3) this).anInt8963;
		}
		aLongArray8955 = null;
		((Class528_Sub3) this).aShortArray8907 = method14311(((Class528_Sub3) this).aShortArray8907, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aShortArray8945 = method14311(((Class528_Sub3) this).aShortArray8945, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aShortArray8909 = method14311(((Class528_Sub3) this).aShortArray8909, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aShortArray8933 = method14311(((Class528_Sub3) this).aShortArray8933, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aShortArray8911 = method14311(((Class528_Sub3) this).aShortArray8911, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aByteArray8912 = method14265(((Class528_Sub3) this).aByteArray8912, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aFloatArray8892 = method14286(((Class528_Sub3) this).aFloatArray8892, ((Class528_Sub3) this).anInt8906);
		((Class528_Sub3) this).aFloatArray8914 = method14286(((Class528_Sub3) this).aFloatArray8914, ((Class528_Sub3) this).anInt8906);
		if (class157.anIntArray2002 != null && Class50.method1007(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).anIntArrayArray8966 = class157.method2665(false);
		if (class157.aClass84Array2009 != null && Class50.method1008(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).anIntArrayArray8954 = class157.method2667();
		if (class157.anIntArray1991 != null && Class50.method1006(i, ((Class528_Sub3) this).anInt8896)) {
			int i_245_ = 0;
			int[] is_246_ = new int[256];
			for (int i_247_ = 0; i_247_ < ((Class528_Sub3) this).anInt8916; i_247_++) {
				int i_248_ = class157.anIntArray1991[is[i_247_]];
				if (i_248_ >= 0) {
					is_246_[i_248_]++;
					if (i_248_ > i_245_)
						i_245_ = i_248_;
				}
			}
			((Class528_Sub3) this).anIntArrayArray8924 = new int[i_245_ + 1][];
			for (int i_249_ = 0; i_249_ <= i_245_; i_249_++) {
				((Class528_Sub3) this).anIntArrayArray8924[i_249_] = new int[is_246_[i_249_]];
				is_246_[i_249_] = 0;
			}
			for (int i_250_ = 0; i_250_ < ((Class528_Sub3) this).anInt8916; i_250_++) {
				int i_251_ = class157.anIntArray1991[is[i_250_]];
				if (i_251_ >= 0)
					((Class528_Sub3) this).anIntArrayArray8924[i_251_][is_246_[i_251_]++] = i_250_;
			}
		}
	}

	static byte[] method14272(byte[] is, int i) {
		byte[] is_252_ = new byte[i];
		System.arraycopy(is, 0, is_252_, 0, i);
		return is_252_;
	}

	public void method11269(MeshRasterizer class528, int i, int i_253_, int i_254_, boolean bool) {
		Class528_Sub3 class528_sub3_255_ = (Class528_Sub3) class528;
		if (((Class528_Sub3) this).anInt8916 != 0 && ((Class528_Sub3) class528_sub3_255_).anInt8916 != 0) {
			int i_256_ = ((Class528_Sub3) class528_sub3_255_).anInt8910;
			int[] is = ((Class528_Sub3) class528_sub3_255_).anIntArray8901;
			int[] is_257_ = ((Class528_Sub3) class528_sub3_255_).anIntArray8902;
			int[] is_258_ = ((Class528_Sub3) class528_sub3_255_).anIntArray8931;
			short[] is_259_ = ((Class528_Sub3) class528_sub3_255_).aShortArray8909;
			short[] is_260_ = ((Class528_Sub3) class528_sub3_255_).aShortArray8933;
			short[] is_261_ = ((Class528_Sub3) class528_sub3_255_).aShortArray8911;
			byte[] is_262_ = ((Class528_Sub3) class528_sub3_255_).aByteArray8912;
			short[] is_263_;
			short[] is_264_;
			short[] is_265_;
			byte[] is_266_;
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				is_263_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115);
				is_264_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114);
				is_265_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113);
				is_266_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116);
			} else {
				is_263_ = null;
				is_264_ = null;
				is_265_ = null;
				is_266_ = null;
			}
			short[] is_267_;
			short[] is_268_;
			short[] is_269_;
			byte[] is_270_;
			if (((Class528_Sub3) class528_sub3_255_).aClass355_8962 != null) {
				is_267_ = ((Class355) (((Class528_Sub3) class528_sub3_255_).aClass355_8962)).aShortArray4115;
				is_268_ = ((Class355) (((Class528_Sub3) class528_sub3_255_).aClass355_8962)).aShortArray4114;
				is_269_ = ((Class355) (((Class528_Sub3) class528_sub3_255_).aClass355_8962)).aShortArray4113;
				is_270_ = ((Class355) (((Class528_Sub3) class528_sub3_255_).aClass355_8962)).aByteArray4116;
			} else {
				is_267_ = null;
				is_268_ = null;
				is_269_ = null;
				is_270_ = null;
			}
			int[] is_271_ = ((Class528_Sub3) class528_sub3_255_).anIntArray8947;
			short[] is_272_ = ((Class528_Sub3) class528_sub3_255_).aShortArray8948;
			if (!((Class528_Sub3) class528_sub3_255_).aBool8937)
				class528_sub3_255_.method14281();
			int i_273_ = ((Class528_Sub3) class528_sub3_255_).anInt8908;
			int i_274_ = ((Class528_Sub3) class528_sub3_255_).anInt8893;
			int i_275_ = ((Class528_Sub3) class528_sub3_255_).anInt8940;
			int i_276_ = ((Class528_Sub3) class528_sub3_255_).anInt8941;
			int i_277_ = ((Class528_Sub3) class528_sub3_255_).anInt8942;
			int i_278_ = ((Class528_Sub3) class528_sub3_255_).anInt8943;
			for (int i_279_ = 0; i_279_ < ((Class528_Sub3) this).anInt8910; i_279_++) {
				int i_280_ = ((Class528_Sub3) this).anIntArray8902[i_279_] - i_253_;
				if (i_280_ >= i_273_ && i_280_ <= i_274_) {
					int i_281_ = ((Class528_Sub3) this).anIntArray8901[i_279_] - i;
					if (i_281_ >= i_275_ && i_281_ <= i_276_) {
						int i_282_ = (((Class528_Sub3) this).anIntArray8931[i_279_] - i_254_);
						if (i_282_ >= i_277_ && i_282_ <= i_278_) {
							int i_283_ = -1;
							int i_284_ = (((Class528_Sub3) this).anIntArray8947[i_279_]);
							int i_285_ = (((Class528_Sub3) this).anIntArray8947[i_279_ + 1]);
							for (int i_286_ = i_284_; i_286_ < i_285_; i_286_++) {
								i_283_ = (((Class528_Sub3) this).aShortArray8948[i_286_]) - 1;
								if (i_283_ == -1 || (((Class528_Sub3) this).aByteArray8912[i_283_]) != 0)
									break;
							}
							if (i_283_ != -1) {
								for (int i_287_ = 0; i_287_ < i_256_; i_287_++) {
									if (i_281_ == is[i_287_] && i_282_ == is_258_[i_287_] && i_280_ == is_257_[i_287_]) {
										int i_288_ = -1;
										i_284_ = is_271_[i_287_];
										i_285_ = is_271_[i_287_ + 1];
										for (int i_289_ = i_284_; i_289_ < i_285_; i_289_++) {
											i_288_ = is_272_[i_289_] - 1;
											if (i_288_ == -1 || is_262_[i_288_] != 0)
												break;
										}
										if (i_288_ != -1) {
											if (is_263_ == null) {
												((Class528_Sub3) this).aClass355_8962 = new Class355();
												is_263_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4115 = (Class512.method8761((((Class528_Sub3) this).aShortArray8909), 359522952));
												is_264_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4114 = (Class512.method8761((((Class528_Sub3) this).aShortArray8933), 943738498));
												is_265_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4113 = (Class512.method8761((((Class528_Sub3) this).aShortArray8911), 1204065687));
												is_266_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aByteArray4116 = (Class282_Sub50_Sub13.method15090((((Class528_Sub3) this).aByteArray8912), -2142109036));
											}
											if (is_267_ == null) {
												Class355 class355 = (((Class528_Sub3) class528_sub3_255_).aClass355_8962 = new Class355());
												is_267_ = ((Class355) class355).aShortArray4115 = (Class512.method8761(is_259_, 1575595200));
												is_268_ = ((Class355) class355).aShortArray4114 = (Class512.method8761(is_260_, 1808523418));
												is_269_ = ((Class355) class355).aShortArray4113 = (Class512.method8761(is_261_, 261274610));
												is_270_ = ((Class355) class355).aByteArray4116 = (Class282_Sub50_Sub13.method15090(is_262_, -2131501259));
											}
											short i_290_ = (((Class528_Sub3) this).aShortArray8909[i_283_]);
											short i_291_ = (((Class528_Sub3) this).aShortArray8933[i_283_]);
											short i_292_ = (((Class528_Sub3) this).aShortArray8911[i_283_]);
											byte i_293_ = (((Class528_Sub3) this).aByteArray8912[i_283_]);
											i_284_ = is_271_[i_287_];
											i_285_ = is_271_[i_287_ + 1];
											for (int i_294_ = i_284_; i_294_ < i_285_; i_294_++) {
												int i_295_ = is_272_[i_294_] - 1;
												if (i_295_ == -1)
													break;
												if (is_270_[i_295_] != 0) {
													is_267_[i_295_] += i_290_;
													is_268_[i_295_] += i_291_;
													is_269_[i_295_] += i_292_;
													is_270_[i_295_] += i_293_;
												}
											}
											i_290_ = is_259_[i_288_];
											i_291_ = is_260_[i_288_];
											i_292_ = is_261_[i_288_];
											i_293_ = is_262_[i_288_];
											i_284_ = (((Class528_Sub3) this).anIntArray8947[i_279_]);
											i_285_ = (((Class528_Sub3) this).anIntArray8947[i_279_ + 1]);
											for (int i_296_ = i_284_; i_296_ < i_285_; i_296_++) {
												int i_297_ = ((((Class528_Sub3) this).aShortArray8948[i_296_]) - 1);
												if (i_297_ == -1)
													break;
												if (is_266_[i_297_] != 0) {
													is_263_[i_297_] += i_290_;
													is_264_[i_297_] += i_291_;
													is_265_[i_297_] += i_292_;
													is_266_[i_297_] += i_293_;
												}
											}
											class528_sub3_255_.method14285();
											method14285();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void p(int i) {
		((Class528_Sub3) this).aShort8897 = (short) i;
		method14269();
	}

	public void Q(int i) {
		((Class528_Sub3) this).aShort8898 = (short) i;
		method14268();
		method14285();
	}

	static float[] method14273(float[] fs, int i) {
		float[] fs_298_ = new float[i];
		System.arraycopy(fs, 0, fs_298_, 0, i);
		return fs_298_;
	}

	static {
		anIntArray8928 = new int[1];
		anIntArray8958 = new int[1];
		anIntArray8894 = new int[8];
		anIntArray8960 = new int[8];
		anIntArray8961 = new int[8];
	}

	void method14274() {
		if (((Class528_Sub3) this).aBool8919) {
			((Class528_Sub3) this).aBool8919 = false;
			if (((Class528_Sub3) this).aClass87Array8949 == null && ((Class528_Sub3) this).aClass172Array8950 == null && ((Class528_Sub3) this).aClass56Array8934 == null && !Class50.method981(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				boolean bool = false;
				boolean bool_299_ = false;
				boolean bool_300_ = false;
				if (((Class528_Sub3) this).anIntArray8901 != null && !Class50.method1000(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264()) {
						if (!((Class528_Sub3) this).aBool8937)
							method14281();
						bool = true;
					} else
						((Class528_Sub3) this).aBool8919 = true;
				}
				if (((Class528_Sub3) this).anIntArray8902 != null && !Class50.method1001(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264()) {
						if (!((Class528_Sub3) this).aBool8937)
							method14281();
						bool_299_ = true;
					} else
						((Class528_Sub3) this).aBool8919 = true;
				}
				if (((Class528_Sub3) this).anIntArray8931 != null && !Class50.method1002(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264()) {
						if (!((Class528_Sub3) this).aBool8937)
							method14281();
						bool_300_ = true;
					} else
						((Class528_Sub3) this).aBool8919 = true;
				}
				if (bool)
					((Class528_Sub3) this).anIntArray8901 = null;
				if (bool_299_)
					((Class528_Sub3) this).anIntArray8902 = null;
				if (bool_300_)
					((Class528_Sub3) this).anIntArray8931 = null;
			}
			if (((Class528_Sub3) this).aShortArray8948 != null && ((Class528_Sub3) this).anIntArray8901 == null && ((Class528_Sub3) this).anIntArray8902 == null && ((Class528_Sub3) this).anIntArray8931 == null) {
				((Class528_Sub3) this).aShortArray8948 = null;
				((Class528_Sub3) this).anIntArray8947 = null;
			}
			while_1_: do {
				if (((Class528_Sub3) this).aByteArray8912 != null && !Class50.method996(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					do {
						if ((((Class528_Sub3) this).anInt8896 & 0x37) != 0) {
							if (((Class528_Sub3) this).aClass63_8929 != null && !((Class528_Sub3) this).aClass63_8929.method1264())
								break;
						} else if (((Class528_Sub3) this).aClass63_8913 != null && !((Class528_Sub3) this).aClass63_8913.method1264())
							break;
						((Class528_Sub3) this).aShortArray8911 = null;
						((Class528_Sub3) this).aShortArray8933 = null;
						((Class528_Sub3) this).aShortArray8909 = null;
						((Class528_Sub3) this).aByteArray8912 = null;
						break while_1_;
					} while (false);
					((Class528_Sub3) this).aBool8919 = true;
				}
			} while (false);
			if (((Class528_Sub3) this).aShortArray8918 != null && !Class50.method987(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aShortArray8918 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aByteArray8900 != null && !Class50.method1004(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aByteArray8900 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aFloatArray8892 != null && !Class50.method1005(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8930 == null || ((Class528_Sub3) this).aClass63_8930.method1264()) {
					((Class528_Sub3) this).aFloatArray8914 = null;
					((Class528_Sub3) this).aFloatArray8892 = null;
				} else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8923 != null && !Class50.method1010(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aShortArray8923 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8920 != null && !Class50.method1009(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if ((((Class528_Sub3) this).aClass39_8926 == null || ((Class528_Sub3) this).aClass39_8926.method861()) && (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())) {
					((Class528_Sub3) this).aShortArray8922 = null;
					((Class528_Sub3) this).aShortArray8921 = null;
					((Class528_Sub3) this).aShortArray8920 = null;
				} else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8907 != null) {
				if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264())
					((Class528_Sub3) this).aShortArray8907 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8945 != null) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aShortArray8945 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).anIntArrayArray8924 != null && !Class50.method1006(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				((Class528_Sub3) this).anIntArrayArray8924 = null;
				((Class528_Sub3) this).aShortArray8925 = null;
			}
			if (((Class528_Sub3) this).anIntArrayArray8966 != null && !Class50.method1007(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				((Class528_Sub3) this).anIntArrayArray8966 = null;
				((Class528_Sub3) this).aShortArray8905 = null;
			}
			if (((Class528_Sub3) this).anIntArrayArray8954 != null && !Class50.method1008(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
				((Class528_Sub3) this).anIntArrayArray8954 = null;
			if (((Class528_Sub3) this).anIntArray8944 != null && (((Class528_Sub3) this).anInt8895 & 0x800) == 0 && (((Class528_Sub3) this).anInt8895 & 0x40000) == 0) {
				((Class528_Sub3) this).anIntArray8944 = null;
				((Class528_Sub3) this).anIntArray8946 = null;
				((Class528_Sub3) this).anIntArray8952 = null;
			}
		}
	}

	public void X(short i, short i_301_) {
		for (int i_302_ = 0; i_302_ < ((Class528_Sub3) this).anInt8916; i_302_++) {
			if (((Class528_Sub3) this).aShortArray8918[i_302_] == i)
				((Class528_Sub3) this).aShortArray8918[i_302_] = i_301_;
		}
		if (((Class528_Sub3) this).aClass56Array8934 != null) {
			for (int i_303_ = 0; i_303_ < ((Class528_Sub3) this).anInt8951; i_303_++) {
				Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_303_];
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_303_];
				((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
			}
		}
		method14269();
	}

	public void method11312(byte i, byte[] is) {
		if (is == null) {
			for (int i_304_ = 0; i_304_ < ((Class528_Sub3) this).anInt8916; i_304_++)
				((Class528_Sub3) this).aByteArray8900[i_304_] = i;
		} else {
			for (int i_305_ = 0; i_305_ < ((Class528_Sub3) this).anInt8916; i_305_++) {
				int i_306_ = 255 - ((255 - (is[i_305_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class528_Sub3) this).aByteArray8900[i_305_] = (byte) i_306_;
			}
		}
		method14269();
	}

	public void W(short i, short i_307_) {
		Interface22 interface22 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834;
		for (int i_308_ = 0; i_308_ < ((Class528_Sub3) this).anInt8916; i_308_++) {
			if (((Class528_Sub3) this).aShortArray8923[i_308_] == i)
				((Class528_Sub3) this).aShortArray8923[i_308_] = i_307_;
		}
		byte i_309_ = 0;
		byte i_310_ = 0;
		if (i != -1) {
			Class169 class169 = interface22.method144(i & 0xffff, -2034175789);
			i_309_ = class169.aByte2079;
			i_310_ = class169.aByte2080;
		}
		byte i_311_ = 0;
		byte i_312_ = 0;
		if (i_307_ != -1) {
			Class169 class169 = interface22.method144(i_307_ & 0xffff, -1856192723);
			i_311_ = class169.aByte2079;
			i_312_ = class169.aByte2080;
			if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
				((Class528_Sub3) this).aBool8903 = true;
		}
		if (i_309_ != i_311_ | i_310_ != i_312_) {
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_313_ = 0; i_313_ < ((Class528_Sub3) this).anInt8951; i_313_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_313_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_313_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
				}
			}
			method14269();
		}
	}

	public void method11259() {
		if (((Class528_Sub3) this).anInt8906 > 0 && ((Class528_Sub3) this).anInt8963 > 0) {
			method14279();
			method14271();
			method14274();
		}
	}

	public void method11307(byte i, byte[] is) {
		if (is == null) {
			for (int i_314_ = 0; i_314_ < ((Class528_Sub3) this).anInt8916; i_314_++)
				((Class528_Sub3) this).aByteArray8900[i_314_] = i;
		} else {
			for (int i_315_ = 0; i_315_ < ((Class528_Sub3) this).anInt8916; i_315_++) {
				int i_316_ = 255 - ((255 - (is[i_315_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class528_Sub3) this).aByteArray8900[i_315_] = (byte) i_316_;
			}
		}
		method14269();
	}

	public boolean i() {
		return ((Class528_Sub3) this).aBool8959;
	}

	public boolean u() {
		return ((Class528_Sub3) this).aBool8903;
	}

	public void method11292(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub3) this).aShortArray8905 != null) {
			Matrix44Var class294_317_ = class294;
			if (bool) {
				class294_317_ = ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8713;
				class294_317_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_318_ = 0; i_318_ < ((Class528_Sub3) this).anInt8910; i_318_++) {
				if ((i & ((Class528_Sub3) this).aShortArray8905[i_318_]) != 0) {
					class294_317_.method5226((float) ((Class528_Sub3) this).anIntArray8901[i_318_], (float) ((Class528_Sub3) this).anIntArray8902[i_318_], (float) ((Class528_Sub3) this).anIntArray8931[i_318_], fs);
					((Class528_Sub3) this).anIntArray8901[i_318_] = (int) fs[0];
					((Class528_Sub3) this).anIntArray8902[i_318_] = (int) fs[1];
					((Class528_Sub3) this).anIntArray8931[i_318_] = (int) fs[2];
				}
			}
		}
	}

	void method11288() {
		/* empty */
	}

	public void bx(int i) {
		int i_319_ = Class382.anIntArray4657[i];
		int i_320_ = Class382.anIntArray4661[i];
		for (int i_321_ = 0; i_321_ < ((Class528_Sub3) this).anInt8910; i_321_++) {
			int i_322_ = ((((Class528_Sub3) this).anIntArray8931[i_321_] * i_319_ + ((Class528_Sub3) this).anIntArray8901[i_321_] * i_320_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_321_] = ((((Class528_Sub3) this).anIntArray8931[i_321_] * i_320_ - ((Class528_Sub3) this).anIntArray8901[i_321_] * i_319_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_321_] = i_322_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	void method14275(Matrix44Arr class384) {
		if (((Class528_Sub3) this).aClass56Array8934 != null) {
			((Class528_Sub3) this).aClass505_Sub2_8917.RA(!((Class528_Sub3) this).aBool8959);
			Matrix44Var class294 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass294_8713);
			Class103 class103 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass103_8796);
			for (int i = 0; i < ((Class528_Sub3) this).anInt8951; i++) {
				Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i];
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i];
				if (!((Class56) class56).aBool522 || !((Class528_Sub3) this).aClass505_Sub2_8917.method8471()) {
					float f = ((float) ((((Class528_Sub3) this).anIntArray8901[((Class56) class56).anInt517]) + (((Class528_Sub3) this).anIntArray8901[((Class56) class56).anInt515]) + (((Class528_Sub3) this).anIntArray8901[((Class56) class56).anInt521])) * 0.3333333F);
					float f_323_ = ((float) ((((Class528_Sub3) this).anIntArray8902[((Class56) class56).anInt517]) + (((Class528_Sub3) this).anIntArray8902[((Class56) class56).anInt515]) + (((Class528_Sub3) this).anIntArray8902[((Class56) class56).anInt521])) * 0.3333333F);
					float f_324_ = ((float) ((((Class528_Sub3) this).anIntArray8931[((Class56) class56).anInt517]) + (((Class528_Sub3) this).anIntArray8931[((Class56) class56).anInt515]) + (((Class528_Sub3) this).anIntArray8931[((Class56) class56).anInt521])) * 0.3333333F);
					float f_325_ = (class384.buf[0] * f + class384.buf[4] * f_323_ + class384.buf[8] * f_324_ + class384.buf[12]);
					float f_326_ = (class384.buf[1] * f + class384.buf[5] * f_323_ + class384.buf[9] * f_324_ + class384.buf[13]);
					float f_327_ = (class384.buf[2] * f + class384.buf[6] * f_323_ + class384.buf[10] * f_324_ + class384.buf[14]);
					float f_328_ = ((float) (1.0 / Math.sqrt((double) (f_325_ * f_325_ + f_326_ * f_326_ + f_327_ * f_327_))) * (float) ((Class56) class56).anInt523);
					class294.method5213(((Class65) class65).anInt673, (((Class65) class65).anInt671 * ((Class56) class56).aShort519) >> 7, (((Class65) class65).anInt670 * ((Class56) class56).aShort520) >> 7, (f_325_ + (float) ((Class65) class65).anInt668 - f_325_ * f_328_), (f_326_ + (float) ((Class65) class65).anInt672 - f_326_ * f_328_), f_327_ - f_327_ * f_328_);
					class294.method5208(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8804);
					((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8715.method6522(class294);
					class103.method1788(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass384_8715);
					class103.aClass384_1058.method6518();
					class103.anInt1056 = ((Class65) class65).anInt669;
					class103.anInterface6_1059 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(((Class56) class56).aShort516);
					class103.method1790();
				}
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.RA(true);
		}
	}

	void w(int i, int i_329_, int i_330_, int i_331_) {
		if (i == 0) {
			int i_332_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_333_ = 0; i_333_ < ((Class528_Sub3) this).anInt8910; i_333_++) {
				anInt8932 += ((Class528_Sub3) this).anIntArray8901[i_333_];
				anInt8939 += ((Class528_Sub3) this).anIntArray8902[i_333_];
				anInt8964 += ((Class528_Sub3) this).anIntArray8931[i_333_];
				i_332_++;
			}
			if (i_332_ > 0) {
				anInt8932 = anInt8932 / i_332_ + i_329_;
				anInt8939 = anInt8939 / i_332_ + i_330_;
				anInt8964 = anInt8964 / i_332_ + i_331_;
			} else {
				anInt8932 = i_329_;
				anInt8939 = i_330_;
				anInt8964 = i_331_;
			}
		} else if (i == 1) {
			for (int i_334_ = 0; i_334_ < ((Class528_Sub3) this).anInt8910; i_334_++) {
				((Class528_Sub3) this).anIntArray8901[i_334_] += i_329_;
				((Class528_Sub3) this).anIntArray8902[i_334_] += i_330_;
				((Class528_Sub3) this).anIntArray8931[i_334_] += i_331_;
			}
		} else if (i == 2) {
			for (int i_335_ = 0; i_335_ < ((Class528_Sub3) this).anInt8910; i_335_++) {
				((Class528_Sub3) this).anIntArray8901[i_335_] -= anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_335_] -= anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_335_] -= anInt8964;
				if (i_331_ != 0) {
					int i_336_ = Class382.anIntArray4657[i_331_];
					int i_337_ = Class382.anIntArray4661[i_331_];
					int i_338_ = (((((Class528_Sub3) this).anIntArray8902[i_335_] * i_336_) + (((Class528_Sub3) this).anIntArray8901[i_335_] * i_337_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8902[i_335_] = ((((Class528_Sub3) this).anIntArray8902[i_335_] * i_337_) - (((Class528_Sub3) this).anIntArray8901[i_335_] * i_336_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8901[i_335_] = i_338_;
				}
				if (i_329_ != 0) {
					int i_339_ = Class382.anIntArray4657[i_329_];
					int i_340_ = Class382.anIntArray4661[i_329_];
					int i_341_ = (((((Class528_Sub3) this).anIntArray8902[i_335_] * i_340_) - (((Class528_Sub3) this).anIntArray8931[i_335_] * i_339_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8931[i_335_] = ((((Class528_Sub3) this).anIntArray8902[i_335_] * i_339_) + (((Class528_Sub3) this).anIntArray8931[i_335_] * i_340_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8902[i_335_] = i_341_;
				}
				if (i_330_ != 0) {
					int i_342_ = Class382.anIntArray4657[i_330_];
					int i_343_ = Class382.anIntArray4661[i_330_];
					int i_344_ = (((((Class528_Sub3) this).anIntArray8931[i_335_] * i_342_) + (((Class528_Sub3) this).anIntArray8901[i_335_] * i_343_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8931[i_335_] = ((((Class528_Sub3) this).anIntArray8931[i_335_] * i_343_) - (((Class528_Sub3) this).anIntArray8901[i_335_] * i_342_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8901[i_335_] = i_344_;
				}
				((Class528_Sub3) this).anIntArray8901[i_335_] += anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_335_] += anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_335_] += anInt8964;
			}
		} else if (i == 3) {
			for (int i_345_ = 0; i_345_ < ((Class528_Sub3) this).anInt8910; i_345_++) {
				((Class528_Sub3) this).anIntArray8901[i_345_] -= anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_345_] -= anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_345_] -= anInt8964;
				((Class528_Sub3) this).anIntArray8901[i_345_] = (((Class528_Sub3) this).anIntArray8901[i_345_] * i_329_ / 128);
				((Class528_Sub3) this).anIntArray8902[i_345_] = (((Class528_Sub3) this).anIntArray8902[i_345_] * i_330_ / 128);
				((Class528_Sub3) this).anIntArray8931[i_345_] = (((Class528_Sub3) this).anIntArray8931[i_345_] * i_331_ / 128);
				((Class528_Sub3) this).anIntArray8901[i_345_] += anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_345_] += anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_345_] += anInt8964;
			}
		} else if (i == 5) {
			for (int i_346_ = 0; i_346_ < ((Class528_Sub3) this).anInt8916; i_346_++) {
				int i_347_ = ((((Class528_Sub3) this).aByteArray8900[i_346_] & 0xff) + i_329_ * 8);
				if (i_347_ < 0)
					i_347_ = 0;
				else if (i_347_ > 255)
					i_347_ = 255;
				((Class528_Sub3) this).aByteArray8900[i_346_] = (byte) i_347_;
			}
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_348_ = 0; i_348_ < ((Class528_Sub3) this).anInt8951; i_348_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_348_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_348_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
				}
			}
			method14269();
		} else if (i == 7) {
			for (int i_349_ = 0; i_349_ < ((Class528_Sub3) this).anInt8916; i_349_++) {
				int i_350_ = ((Class528_Sub3) this).aShortArray8918[i_349_] & 0xffff;
				int i_351_ = i_350_ >> 10 & 0x3f;
				int i_352_ = i_350_ >> 7 & 0x7;
				int i_353_ = i_350_ & 0x7f;
				i_351_ = i_351_ + i_329_ & 0x3f;
				i_352_ += i_330_ / 4;
				if (i_352_ < 0)
					i_352_ = 0;
				else if (i_352_ > 7)
					i_352_ = 7;
				i_353_ += i_331_;
				if (i_353_ < 0)
					i_353_ = 0;
				else if (i_353_ > 127)
					i_353_ = 127;
				((Class528_Sub3) this).aShortArray8918[i_349_] = (short) (i_351_ << 10 | i_352_ << 7 | i_353_);
			}
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_354_ = 0; i_354_ < ((Class528_Sub3) this).anInt8951; i_354_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_354_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_354_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
				}
			}
			method14269();
		} else if (i == 8) {
			for (int i_355_ = 0; i_355_ < ((Class528_Sub3) this).anInt8951; i_355_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_355_];
				((Class65) class65).anInt668 += i_329_;
				((Class65) class65).anInt672 += i_330_;
			}
		} else if (i == 10) {
			for (int i_356_ = 0; i_356_ < ((Class528_Sub3) this).anInt8951; i_356_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_356_];
				((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_329_ >> 7;
				((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_330_ >> 7;
			}
		} else if (i == 9) {
			for (int i_357_ = 0; i_357_ < ((Class528_Sub3) this).anInt8951; i_357_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_357_];
				((Class65) class65).anInt673 = ((Class65) class65).anInt673 + i_329_ & 0x3fff;
			}
		}
	}

	void method11268(int i, int[] is, int i_358_, int i_359_, int i_360_, int i_361_, boolean bool) {
		int i_362_ = is.length;
		if (i == 0) {
			i_358_ <<= 4;
			i_359_ <<= 4;
			i_360_ <<= 4;
			int i_363_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_364_ = 0; i_364_ < i_362_; i_364_++) {
				int i_365_ = is[i_364_];
				if (i_365_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_366_ = ((Class528_Sub3) this).anIntArrayArray8966[i_365_];
					for (int i_367_ = 0; i_367_ < is_366_.length; i_367_++) {
						int i_368_ = is_366_[i_367_];
						anInt8932 += ((Class528_Sub3) this).anIntArray8901[i_368_];
						anInt8939 += ((Class528_Sub3) this).anIntArray8902[i_368_];
						anInt8964 += ((Class528_Sub3) this).anIntArray8931[i_368_];
						i_363_++;
					}
				}
			}
			if (i_363_ > 0) {
				anInt8932 = anInt8932 / i_363_ + i_358_;
				anInt8939 = anInt8939 / i_363_ + i_359_;
				anInt8964 = anInt8964 / i_363_ + i_360_;
			} else {
				anInt8932 = i_358_;
				anInt8939 = i_359_;
				anInt8964 = i_360_;
			}
		} else if (i == 1) {
			i_358_ <<= 4;
			i_359_ <<= 4;
			i_360_ <<= 4;
			for (int i_369_ = 0; i_369_ < i_362_; i_369_++) {
				int i_370_ = is[i_369_];
				if (i_370_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_371_ = ((Class528_Sub3) this).anIntArrayArray8966[i_370_];
					for (int i_372_ = 0; i_372_ < is_371_.length; i_372_++) {
						int i_373_ = is_371_[i_372_];
						((Class528_Sub3) this).anIntArray8901[i_373_] += i_358_;
						((Class528_Sub3) this).anIntArray8902[i_373_] += i_359_;
						((Class528_Sub3) this).anIntArray8931[i_373_] += i_360_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_374_ = 0; i_374_ < i_362_; i_374_++) {
				int i_375_ = is[i_374_];
				if (i_375_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_376_ = ((Class528_Sub3) this).anIntArrayArray8966[i_375_];
					if ((i_361_ & 0x1) == 0) {
						for (int i_377_ = 0; i_377_ < is_376_.length; i_377_++) {
							int i_378_ = is_376_[i_377_];
							((Class528_Sub3) this).anIntArray8901[i_378_] -= anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_378_] -= anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_378_] -= anInt8964;
							if (i_360_ != 0) {
								int i_379_ = Class382.anIntArray4657[i_360_];
								int i_380_ = Class382.anIntArray4661[i_360_];
								int i_381_ = (((((Class528_Sub3) this).anIntArray8902[i_378_]) * i_379_ + (((Class528_Sub3) this).anIntArray8901[i_378_]) * i_380_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8902[i_378_] = ((((Class528_Sub3) this).anIntArray8902[i_378_]) * i_380_ - (((Class528_Sub3) this).anIntArray8901[i_378_]) * i_379_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_378_] = i_381_;
							}
							if (i_358_ != 0) {
								int i_382_ = Class382.anIntArray4657[i_358_];
								int i_383_ = Class382.anIntArray4661[i_358_];
								int i_384_ = (((((Class528_Sub3) this).anIntArray8902[i_378_]) * i_383_ - (((Class528_Sub3) this).anIntArray8931[i_378_]) * i_382_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_378_] = ((((Class528_Sub3) this).anIntArray8902[i_378_]) * i_382_ + (((Class528_Sub3) this).anIntArray8931[i_378_]) * i_383_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8902[i_378_] = i_384_;
							}
							if (i_359_ != 0) {
								int i_385_ = Class382.anIntArray4657[i_359_];
								int i_386_ = Class382.anIntArray4661[i_359_];
								int i_387_ = (((((Class528_Sub3) this).anIntArray8931[i_378_]) * i_385_ + (((Class528_Sub3) this).anIntArray8901[i_378_]) * i_386_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_378_] = ((((Class528_Sub3) this).anIntArray8931[i_378_]) * i_386_ - (((Class528_Sub3) this).anIntArray8901[i_378_]) * i_385_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_378_] = i_387_;
							}
							((Class528_Sub3) this).anIntArray8901[i_378_] += anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_378_] += anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_378_] += anInt8964;
						}
					} else {
						for (int i_388_ = 0; i_388_ < is_376_.length; i_388_++) {
							int i_389_ = is_376_[i_388_];
							((Class528_Sub3) this).anIntArray8901[i_389_] -= anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_389_] -= anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_389_] -= anInt8964;
							if (i_358_ != 0) {
								int i_390_ = Class382.anIntArray4657[i_358_];
								int i_391_ = Class382.anIntArray4661[i_358_];
								int i_392_ = (((((Class528_Sub3) this).anIntArray8902[i_389_]) * i_391_ - (((Class528_Sub3) this).anIntArray8931[i_389_]) * i_390_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_389_] = ((((Class528_Sub3) this).anIntArray8902[i_389_]) * i_390_ + (((Class528_Sub3) this).anIntArray8931[i_389_]) * i_391_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8902[i_389_] = i_392_;
							}
							if (i_360_ != 0) {
								int i_393_ = Class382.anIntArray4657[i_360_];
								int i_394_ = Class382.anIntArray4661[i_360_];
								int i_395_ = (((((Class528_Sub3) this).anIntArray8902[i_389_]) * i_393_ + (((Class528_Sub3) this).anIntArray8901[i_389_]) * i_394_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8902[i_389_] = ((((Class528_Sub3) this).anIntArray8902[i_389_]) * i_394_ - (((Class528_Sub3) this).anIntArray8901[i_389_]) * i_393_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_389_] = i_395_;
							}
							if (i_359_ != 0) {
								int i_396_ = Class382.anIntArray4657[i_359_];
								int i_397_ = Class382.anIntArray4661[i_359_];
								int i_398_ = (((((Class528_Sub3) this).anIntArray8931[i_389_]) * i_396_ + (((Class528_Sub3) this).anIntArray8901[i_389_]) * i_397_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_389_] = ((((Class528_Sub3) this).anIntArray8931[i_389_]) * i_397_ - (((Class528_Sub3) this).anIntArray8901[i_389_]) * i_396_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_389_] = i_398_;
							}
							((Class528_Sub3) this).anIntArray8901[i_389_] += anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_389_] += anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_389_] += anInt8964;
						}
					}
				}
			}
			if (bool) {
				for (int i_399_ = 0; i_399_ < i_362_; i_399_++) {
					int i_400_ = is[i_399_];
					if (i_400_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_401_ = (((Class528_Sub3) this).anIntArrayArray8966[i_400_]);
						for (int i_402_ = 0; i_402_ < is_401_.length; i_402_++) {
							int i_403_ = is_401_[i_402_];
							int i_404_ = (((Class528_Sub3) this).anIntArray8947[i_403_]);
							int i_405_ = (((Class528_Sub3) this).anIntArray8947[i_403_ + 1]);
							for (int i_406_ = i_404_; i_406_ < i_405_; i_406_++) {
								int i_407_ = ((((Class528_Sub3) this).aShortArray8948[i_406_]) - 1);
								if (i_407_ == -1)
									break;
								if (i_360_ != 0) {
									int i_408_ = Class382.anIntArray4657[i_360_];
									int i_409_ = Class382.anIntArray4661[i_360_];
									int i_410_ = (((((Class528_Sub3) this).aShortArray8933[i_407_]) * i_408_ + ((((Class528_Sub3) this).aShortArray8909[i_407_]) * i_409_) + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8933[i_407_] = (short) ((((((Class528_Sub3) this).aShortArray8933[i_407_]) * i_409_) - (((Class528_Sub3) this).aShortArray8909[i_407_]) * i_408_ + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8909[i_407_] = (short) i_410_;
								}
								if (i_358_ != 0) {
									int i_411_ = Class382.anIntArray4657[i_358_];
									int i_412_ = Class382.anIntArray4661[i_358_];
									int i_413_ = (((((Class528_Sub3) this).aShortArray8933[i_407_]) * i_412_ - ((((Class528_Sub3) this).aShortArray8911[i_407_]) * i_411_) + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8911[i_407_] = (short) ((((((Class528_Sub3) this).aShortArray8933[i_407_]) * i_411_) + (((Class528_Sub3) this).aShortArray8911[i_407_]) * i_412_ + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8933[i_407_] = (short) i_413_;
								}
								if (i_359_ != 0) {
									int i_414_ = Class382.anIntArray4657[i_359_];
									int i_415_ = Class382.anIntArray4661[i_359_];
									int i_416_ = (((((Class528_Sub3) this).aShortArray8911[i_407_]) * i_414_ + ((((Class528_Sub3) this).aShortArray8909[i_407_]) * i_415_) + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8911[i_407_] = (short) ((((((Class528_Sub3) this).aShortArray8911[i_407_]) * i_415_) - (((Class528_Sub3) this).aShortArray8909[i_407_]) * i_414_ + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8909[i_407_] = (short) i_416_;
								}
							}
						}
					}
				}
				method14285();
			}
		} else if (i == 3) {
			for (int i_417_ = 0; i_417_ < i_362_; i_417_++) {
				int i_418_ = is[i_417_];
				if (i_418_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_419_ = ((Class528_Sub3) this).anIntArrayArray8966[i_418_];
					for (int i_420_ = 0; i_420_ < is_419_.length; i_420_++) {
						int i_421_ = is_419_[i_420_];
						((Class528_Sub3) this).anIntArray8901[i_421_] -= anInt8932;
						((Class528_Sub3) this).anIntArray8902[i_421_] -= anInt8939;
						((Class528_Sub3) this).anIntArray8931[i_421_] -= anInt8964;
						((Class528_Sub3) this).anIntArray8901[i_421_] = (((Class528_Sub3) this).anIntArray8901[i_421_] * i_358_) >> 7;
						((Class528_Sub3) this).anIntArray8902[i_421_] = (((Class528_Sub3) this).anIntArray8902[i_421_] * i_359_) >> 7;
						((Class528_Sub3) this).anIntArray8931[i_421_] = (((Class528_Sub3) this).anIntArray8931[i_421_] * i_360_) >> 7;
						((Class528_Sub3) this).anIntArray8901[i_421_] += anInt8932;
						((Class528_Sub3) this).anIntArray8902[i_421_] += anInt8939;
						((Class528_Sub3) this).anIntArray8931[i_421_] += anInt8964;
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_422_ = false;
				for (int i_423_ = 0; i_423_ < i_362_; i_423_++) {
					int i_424_ = is[i_423_];
					if (i_424_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_425_ = (((Class528_Sub3) this).anIntArrayArray8924[i_424_]);
						for (int i_426_ = 0; i_426_ < is_425_.length; i_426_++) {
							int i_427_ = is_425_[i_426_];
							int i_428_ = (((((Class528_Sub3) this).aByteArray8900[i_427_]) & 0xff) + i_358_ * 8);
							if (i_428_ < 0)
								i_428_ = 0;
							else if (i_428_ > 255)
								i_428_ = 255;
							((Class528_Sub3) this).aByteArray8900[i_427_] = (byte) i_428_;
						}
						bool_422_ = bool_422_ | is_425_.length > 0;
					}
				}
				if (bool_422_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_429_ = 0; i_429_ < ((Class528_Sub3) this).anInt8951; i_429_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_429_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_429_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
						}
					}
					method14269();
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_430_ = false;
				for (int i_431_ = 0; i_431_ < i_362_; i_431_++) {
					int i_432_ = is[i_431_];
					if (i_432_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_433_ = (((Class528_Sub3) this).anIntArrayArray8924[i_432_]);
						for (int i_434_ = 0; i_434_ < is_433_.length; i_434_++) {
							int i_435_ = is_433_[i_434_];
							int i_436_ = ((((Class528_Sub3) this).aShortArray8918[i_435_]) & 0xffff);
							int i_437_ = i_436_ >> 10 & 0x3f;
							int i_438_ = i_436_ >> 7 & 0x7;
							int i_439_ = i_436_ & 0x7f;
							i_437_ = i_437_ + i_358_ & 0x3f;
							i_438_ += i_359_ / 4;
							if (i_438_ < 0)
								i_438_ = 0;
							else if (i_438_ > 7)
								i_438_ = 7;
							i_439_ += i_360_;
							if (i_439_ < 0)
								i_439_ = 0;
							else if (i_439_ > 127)
								i_439_ = 127;
							((Class528_Sub3) this).aShortArray8918[i_435_] = (short) (i_437_ << 10 | i_438_ << 7 | i_439_);
						}
						bool_430_ = bool_430_ | is_433_.length > 0;
					}
				}
				if (bool_430_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_440_ = 0; i_440_ < ((Class528_Sub3) this).anInt8951; i_440_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_440_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_440_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff)]) & 0xffffff);
						}
					}
					method14269();
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_441_ = 0; i_441_ < i_362_; i_441_++) {
					int i_442_ = is[i_441_];
					if (i_442_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_443_ = (((Class528_Sub3) this).anIntArrayArray8954[i_442_]);
						for (int i_444_ = 0; i_444_ < is_443_.length; i_444_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_443_[i_444_]]);
							((Class65) class65).anInt668 += i_358_;
							((Class65) class65).anInt672 += i_359_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_445_ = 0; i_445_ < i_362_; i_445_++) {
					int i_446_ = is[i_445_];
					if (i_446_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_447_ = (((Class528_Sub3) this).anIntArrayArray8954[i_446_]);
						for (int i_448_ = 0; i_448_ < is_447_.length; i_448_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_447_[i_448_]]);
							((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_358_ >> 7;
							((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_359_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_449_ = 0; i_449_ < i_362_; i_449_++) {
					int i_450_ = is[i_449_];
					if (i_450_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_451_ = (((Class528_Sub3) this).anIntArrayArray8954[i_450_]);
						for (int i_452_ = 0; i_452_ < is_451_.length; i_452_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_451_[i_452_]]);
							((Class65) class65).anInt673 = (((Class65) class65).anInt673 + i_358_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method11260() {
		/* empty */
	}

	public int cu() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8941;
	}

	public Class172[] method11274() {
		return ((Class528_Sub3) this).aClass172Array8950;
	}

	public Class87[] method11253() {
		return ((Class528_Sub3) this).aClass87Array8949;
	}

	public void method11273(Matrix44Var class294) {
		Matrix44Arr class384 = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
		class384.method6522(class294);
		if (((Class528_Sub3) this).aClass87Array8949 != null) {
			for (int i = 0; i < ((Class528_Sub3) this).aClass87Array8949.length; i++) {
				Class87 class87 = ((Class528_Sub3) this).aClass87Array8949[i];
				Class87 class87_453_ = class87;
				if (class87.aClass87_835 != null)
					class87_453_ = class87.aClass87_835;
				class87_453_.anInt844 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_453_.anInt841 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_453_.anInt847 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_453_.anInt834 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_453_.anInt843 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_453_.anInt845 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_453_.anInt846 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_453_.anInt840 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_453_.anInt848 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub3) this).aClass172Array8950 != null) {
			for (int i = 0; i < ((Class528_Sub3) this).aClass172Array8950.length; i++) {
				Class172 class172 = ((Class528_Sub3) this).aClass172Array8950[i];
				Class172 class172_454_ = class172;
				if (class172.aClass172_2114 != null)
					class172_454_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Matrix44Arr(class384);
				class172_454_.anInt2113 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_454_.anInt2117 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_454_.anInt2118 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	public boolean method11270(int i, int i_455_, Matrix44Var class294, boolean bool, int i_456_) {
		Matrix44Arr class384 = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
		class384.method6522(class294);
		class384.method6523(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8728);
		boolean bool_457_ = false;
		float f = 3.4028235E38F;
		float f_458_ = -3.4028235E38F;
		float f_459_ = 3.4028235E38F;
		float f_460_ = -3.4028235E38F;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i_461_ = ((((Class528_Sub3) this).anInt8941 - ((Class528_Sub3) this).anInt8940) >> 1);
		int i_462_ = ((((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908) >> 1);
		int i_463_ = ((((Class528_Sub3) this).anInt8943 - ((Class528_Sub3) this).anInt8942) >> 1);
		int i_464_ = ((Class528_Sub3) this).anInt8940 + i_461_;
		int i_465_ = ((Class528_Sub3) this).anInt8908 + i_462_;
		int i_466_ = ((Class528_Sub3) this).anInt8942 + i_463_;
		int i_467_ = i_464_ - (i_461_ << i_456_);
		int i_468_ = i_465_ - (i_462_ << i_456_);
		int i_469_ = i_466_ - (i_463_ << i_456_);
		int i_470_ = i_464_ + (i_461_ << i_456_);
		int i_471_ = i_465_ + (i_462_ << i_456_);
		int i_472_ = i_466_ + (i_463_ << i_456_);
		anIntArray8894[0] = i_467_;
		anIntArray8960[0] = i_468_;
		anIntArray8961[0] = i_469_;
		anIntArray8894[1] = i_470_;
		anIntArray8960[1] = i_468_;
		anIntArray8961[1] = i_469_;
		anIntArray8894[2] = i_467_;
		anIntArray8960[2] = i_471_;
		anIntArray8961[2] = i_469_;
		anIntArray8894[3] = i_470_;
		anIntArray8960[3] = i_471_;
		anIntArray8961[3] = i_469_;
		anIntArray8894[4] = i_467_;
		anIntArray8960[4] = i_468_;
		anIntArray8961[4] = i_472_;
		anIntArray8894[5] = i_470_;
		anIntArray8960[5] = i_468_;
		anIntArray8961[5] = i_472_;
		anIntArray8894[6] = i_467_;
		anIntArray8960[6] = i_471_;
		anIntArray8961[6] = i_472_;
		anIntArray8894[7] = i_470_;
		anIntArray8960[7] = i_471_;
		anIntArray8961[7] = i_472_;
		for (int i_473_ = 0; i_473_ < 8; i_473_++) {
			float f_474_ = (float) anIntArray8894[i_473_];
			float f_475_ = (float) anIntArray8960[i_473_];
			float f_476_ = (float) anIntArray8961[i_473_];
			float f_477_ = (class384.buf[2] * f_474_ + class384.buf[6] * f_475_ + class384.buf[10] * f_476_ + class384.buf[14]);
			float f_478_ = (class384.buf[3] * f_474_ + class384.buf[7] * f_475_ + class384.buf[11] * f_476_ + class384.buf[15]);
			if (f_477_ >= -f_478_) {
				float f_479_ = (class384.buf[0] * f_474_ + class384.buf[4] * f_475_ + class384.buf[8] * f_476_ + class384.buf[12]);
				float f_480_ = (class384.buf[1] * f_474_ + class384.buf[5] * f_475_ + class384.buf[9] * f_476_ + class384.buf[13]);
				float f_481_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_479_ / f_478_));
				float f_482_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_480_ / f_478_));
				if (f_481_ < f)
					f = f_481_;
				if (f_481_ > f_458_)
					f_458_ = f_481_;
				if (f_482_ < f_459_)
					f_459_ = f_482_;
				if (f_482_ > f_460_)
					f_460_ = f_482_;
				bool_457_ = true;
			}
		}
		if (bool_457_ && (float) i > f && (float) i < f_458_ && (float) i_455_ > f_459_ && (float) i_455_ < f_460_) {
			if (bool)
				return true;
			if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
				anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
				anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
			}
			for (int i_483_ = 0; i_483_ < ((Class528_Sub3) this).anInt8910; i_483_++) {
				float f_484_ = (float) ((Class528_Sub3) this).anIntArray8901[i_483_];
				float f_485_ = (float) ((Class528_Sub3) this).anIntArray8902[i_483_];
				float f_486_ = (float) ((Class528_Sub3) this).anIntArray8931[i_483_];
				float f_487_ = (class384.buf[2] * f_484_ + class384.buf[6] * f_485_ + class384.buf[10] * f_486_ + class384.buf[14]);
				float f_488_ = (class384.buf[3] * f_484_ + class384.buf[7] * f_485_ + class384.buf[11] * f_486_ + class384.buf[15]);
				if (f_487_ >= -f_488_) {
					float f_489_ = (class384.buf[0] * f_484_ + class384.buf[4] * f_485_ + class384.buf[8] * f_486_ + class384.buf[12]);
					float f_490_ = (class384.buf[1] * f_484_ + class384.buf[5] * f_485_ + class384.buf[9] * f_486_ + class384.buf[13]);
					int i_491_ = ((Class528_Sub3) this).anIntArray8947[i_483_];
					int i_492_ = ((Class528_Sub3) this).anIntArray8947[i_483_ + 1];
					for (int i_493_ = i_491_; i_493_ < i_492_; i_493_++) {
						int i_494_ = (((Class528_Sub3) this).aShortArray8948[i_493_] - 1);
						if (i_494_ == -1)
							break;
						anIntArray8928[i_494_] = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_489_ / f_488_));
						anIntArray8958[i_494_] = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_490_ / f_488_));
					}
				} else {
					int i_495_ = ((Class528_Sub3) this).anIntArray8947[i_483_];
					int i_496_ = ((Class528_Sub3) this).anIntArray8947[i_483_ + 1];
					for (int i_497_ = i_495_; i_497_ < i_496_; i_497_++) {
						int i_498_ = (((Class528_Sub3) this).aShortArray8948[i_497_] - 1);
						if (i_498_ == -1)
							break;
						anIntArray8928[(((Class528_Sub3) this).aShortArray8948[i_497_]) - 1] = -999999;
					}
				}
			}
			for (int i_499_ = 0; i_499_ < ((Class528_Sub3) this).anInt8916; i_499_++) {
				if (anIntArray8928[(((Class528_Sub3) this).aShortArray8920[i_499_])] != -999999 && anIntArray8928[(((Class528_Sub3) this).aShortArray8921[i_499_])] != -999999 && anIntArray8928[(((Class528_Sub3) this).aShortArray8922[i_499_])] != -999999
						&& method14276(i, i_455_, anIntArray8958[(((Class528_Sub3) this).aShortArray8920[i_499_])], anIntArray8958[(((Class528_Sub3) this).aShortArray8921[i_499_])], anIntArray8958[(((Class528_Sub3) this).aShortArray8922[i_499_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8920[i_499_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8921[i_499_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8922[i_499_])]))
					return true;
			}
		}
		return false;
	}

	boolean method14276(int i, int i_500_, int i_501_, int i_502_, int i_503_, int i_504_, int i_505_, int i_506_) {
		if (i_500_ < i_501_ && i_500_ < i_502_ && i_500_ < i_503_)
			return false;
		if (i_500_ > i_501_ && i_500_ > i_502_ && i_500_ > i_503_)
			return false;
		if (i < i_504_ && i < i_505_ && i < i_506_)
			return false;
		if (i > i_504_ && i > i_505_ && i > i_506_)
			return false;
		return true;
	}

	public Class282_Sub50_Sub17 ga(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub3) this).anInt8906 == 0)
			return null;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i;
		int i_507_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) > 0) {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_507_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_507_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_508_;
		int i_509_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8778) > 0) {
			i_508_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_509_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i_508_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_509_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_510_ = i_507_ - i + 1;
		int i_511_ = i_509_ - i_508_ + 1;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_512_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_510_, i_511_)) {
			class282_sub50_sub17_sub2_512_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_512_.method16042();
		} else
			class282_sub50_sub17_sub2_512_ = new Class282_Sub50_Sub17_Sub2((((Class528_Sub3) this).aClass505_Sub2_8917), i_510_, i_511_);
		class282_sub50_sub17_sub2_512_.method16040(i, i_508_, i_507_, i_509_);
		method14277(class282_sub50_sub17_sub2_512_);
		return class282_sub50_sub17_sub2_512_;
	}

	void method14277(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2) {
		if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
			anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
			anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++) {
			int i_513_ = (((((Class528_Sub3) this).anIntArray8901[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453));
			int i_514_ = (((((Class528_Sub3) this).anIntArray8931[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455));
			int i_515_ = ((Class528_Sub3) this).anIntArray8947[i];
			int i_516_ = ((Class528_Sub3) this).anIntArray8947[i + 1];
			for (int i_517_ = i_515_; i_517_ < i_516_; i_517_++) {
				int i_518_ = ((Class528_Sub3) this).aShortArray8948[i_517_] - 1;
				if (i_518_ == -1)
					break;
				anIntArray8928[i_518_] = i_513_;
				anIntArray8958[i_518_] = i_514_;
			}
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8963; i++) {
			if (((Class528_Sub3) this).aByteArray8900 == null || ((Class528_Sub3) this).aByteArray8900[i] <= 128) {
				short i_519_ = ((Class528_Sub3) this).aShortArray8920[i];
				short i_520_ = ((Class528_Sub3) this).aShortArray8921[i];
				short i_521_ = ((Class528_Sub3) this).aShortArray8922[i];
				int i_522_ = anIntArray8928[i_519_];
				int i_523_ = anIntArray8928[i_520_];
				int i_524_ = anIntArray8928[i_521_];
				int i_525_ = anIntArray8958[i_519_];
				int i_526_ = anIntArray8958[i_520_];
				int i_527_ = anIntArray8958[i_521_];
				if (((i_522_ - i_523_) * (i_526_ - i_527_) - (i_526_ - i_525_) * (i_524_ - i_523_)) > 0)
					class282_sub50_sub17_sub2.method16043(i_525_, i_526_, i_527_, i_522_, i_523_, i_524_);
			}
		}
	}

	public void method11282(Matrix44Var class294, Class275_Sub5 class275_sub5, int i) {
		if (aClass34_8938 != null)
			aClass34_8938.method841();
		if (((Class528_Sub3) this).anInt8906 != 0) {
			Matrix44Arr class384 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8724);
			Matrix44Arr class384_528_ = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
			Matrix44Arr class384_529_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8715);
			class384_528_.method6522(class294);
			class384_529_.method6562(class384_528_);
			class384_529_.method6523(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass384_8728);
			if (!((Class528_Sub3) this).aBool8937)
				method14281();
			float[] fs = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloatArray8717);
			class384_528_.method6527(0.0F, (float) ((Class528_Sub3) this).anInt8908, 0.0F, fs);
			float f = fs[0];
			float f_530_ = fs[1];
			float f_531_ = fs[2];
			class384_528_.method6527(0.0F, (float) ((Class528_Sub3) this).anInt8893, 0.0F, fs);
			float f_532_ = fs[0];
			float f_533_ = fs[1];
			float f_534_ = fs[2];
			for (int i_535_ = 0; i_535_ < 6; i_535_++) {
				float[] fs_536_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloatArrayArray8730[i_535_]);
				float f_537_ = (fs_536_[0] * f + fs_536_[1] * f_530_ + fs_536_[2] * f_531_ + fs_536_[3] + (float) ((Class528_Sub3) this).anInt8936);
				float f_538_ = (fs_536_[0] * f_532_ + fs_536_[1] * f_533_ + fs_536_[2] * f_534_ + fs_536_[3] + (float) ((Class528_Sub3) this).anInt8936);
				if (f_537_ < 0.0F && f_538_ < 0.0F)
					return;
			}
			if (class275_sub5 != null) {
				boolean bool = false;
				boolean bool_539_ = true;
				int i_540_ = ((((Class528_Sub3) this).anInt8940 + ((Class528_Sub3) this).anInt8941) >> 1);
				int i_541_ = ((((Class528_Sub3) this).anInt8942 + ((Class528_Sub3) this).anInt8943) >> 1);
				int i_542_ = i_540_;
				int i_543_ = ((Class528_Sub3) this).anInt8908;
				int i_544_ = i_541_;
				float f_545_ = (class384_529_.buf[0] * (float) i_542_ + class384_529_.buf[4] * (float) i_543_ + class384_529_.buf[8] * (float) i_544_ + class384_529_.buf[12]);
				float f_546_ = (class384_529_.buf[1] * (float) i_542_ + class384_529_.buf[5] * (float) i_543_ + class384_529_.buf[9] * (float) i_544_ + class384_529_.buf[13]);
				float f_547_ = (class384_529_.buf[2] * (float) i_542_ + class384_529_.buf[6] * (float) i_543_ + class384_529_.buf[10] * (float) i_544_ + class384_529_.buf[14]);
				float f_548_ = (class384_529_.buf[3] * (float) i_542_ + class384_529_.buf[7] * (float) i_543_ + class384_529_.buf[11] * (float) i_544_ + class384_529_.buf[15]);
				if (f_547_ >= -f_548_) {
					class275_sub5.anInt7847 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732) * f_545_ / f_548_);
					class275_sub5.anInt7848 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734) * f_546_ / f_548_);
				} else
					bool = true;
				i_542_ = i_540_;
				i_543_ = ((Class528_Sub3) this).anInt8893;
				i_544_ = i_541_;
				float f_549_ = (class384_529_.buf[0] * (float) i_542_ + class384_529_.buf[4] * (float) i_543_ + class384_529_.buf[8] * (float) i_544_ + class384_529_.buf[12]);
				float f_550_ = (class384_529_.buf[1] * (float) i_542_ + class384_529_.buf[5] * (float) i_543_ + class384_529_.buf[9] * (float) i_544_ + class384_529_.buf[13]);
				float f_551_ = (class384_529_.buf[2] * (float) i_542_ + class384_529_.buf[6] * (float) i_543_ + class384_529_.buf[10] * (float) i_544_ + class384_529_.buf[14]);
				float f_552_ = (class384_529_.buf[3] * (float) i_542_ + class384_529_.buf[7] * (float) i_543_ + class384_529_.buf[11] * (float) i_544_ + class384_529_.buf[15]);
				if (f_551_ >= -f_552_) {
					class275_sub5.anInt7850 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732) * f_549_ / f_552_);
					class275_sub5.anInt7846 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734) * f_550_ / f_552_);
				} else
					bool = true;
				if (bool) {
					if (f_547_ < -f_548_ && f_551_ < -f_552_)
						bool_539_ = false;
					else if (f_547_ < -f_548_) {
						float f_553_ = (f_547_ + f_548_) / (f_551_ + f_552_) - 1.0F;
						float f_554_ = f_545_ + f_553_ * (f_549_ - f_545_);
						float f_555_ = f_546_ + f_553_ * (f_550_ - f_546_);
						float f_556_ = f_548_ + f_553_ * (f_552_ - f_548_);
						class275_sub5.anInt7847 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_554_ / f_556_));
						class275_sub5.anInt7848 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_555_ / f_556_));
					} else if (f_551_ < -f_552_) {
						float f_557_ = (f_551_ + f_552_) / (f_547_ + f_548_) - 1.0F;
						float f_558_ = f_549_ + f_557_ * (f_545_ - f_549_);
						float f_559_ = f_550_ + f_557_ * (f_546_ - f_550_);
						float f_560_ = f_552_ + f_557_ * (f_548_ - f_552_);
						class275_sub5.anInt7850 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_558_ / f_560_));
						class275_sub5.anInt7846 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_559_ / f_560_));
					}
				}
				if (bool_539_) {
					if (f_547_ / f_548_ > f_551_ / f_552_) {
						float f_561_ = (f_545_ + (class384.buf[0] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[12]);
						float f_562_ = (f_548_ + (class384.buf[3] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) - (float) class275_sub5.anInt7847 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_561_ / f_562_));
					} else {
						float f_563_ = (f_549_ + (class384.buf[0] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[12]);
						float f_564_ = (f_552_ + (class384.buf[3] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) - (float) class275_sub5.anInt7850 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_563_ / f_564_));
					}
					class275_sub5.aBool7849 = true;
				}
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.method14098(i);
			method14278(class294);
			((Class528_Sub3) this).aClass505_Sub2_8917.method14098(0);
			class384_528_.method6522(class294);
			class384_528_.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8740);
			method14275(class384_528_);
		}
	}

	void method14278(Matrix44Var class294) {
		if (((Class528_Sub3) this).anInt8963 != 0 && (method14279() && method14271())) {
			if (aClass34_8938 == null) {
				/* empty */
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.method14004();
			Class48 class48 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass48_8794);
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(0, (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(1, (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(2, (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method13997(((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
			class48.method957(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
			class48.aClass384_454.method6518();
			if (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aBool8779) {
				Class90 class90 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13898();
				class48.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) -(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8739));
				class48.aClass303_458.scale(3.0F / (float) (class90.anInt945 * 973144081));
				class48.aClass385_459.set(((float) (class90.anInt946 * 1152775735 >> 16 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 8 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 0 & 0xff) / 255.0F));
			} else {
				class48.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.set(0.0F, 0.0F, 0.0F);
			}
			if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8811 > 0) {
				class48.aClass303_460.set(0.0F, 0.0F, 1.0F, -(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813));
				class48.aClass385_457.set((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 16 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 8 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 0 & 0xff) / 255.0F);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_458.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8740);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_460.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				class48.aClass303_460.scale(1.0F / ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8819) - (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813)));
			} else {
				class48.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.set(0.0F, 0.0F, 0.0F);
			}
			if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8721);
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(false);
				for (int i = 0; i < ((Class528_Sub3) this).anIntArray8952.length; i++) {
					int i_565_ = ((Class528_Sub3) this).anIntArray8944[i];
					int i_566_ = ((Class528_Sub3) this).anIntArray8944[i + 1];
					int i_567_ = (((Class528_Sub3) this).aShortArray8923[i_565_] & 0xffff);
					boolean bool = false;
					if (i_567_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_567_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_567_, -1766452421);
						bool = !Class282_Sub41.method13367(class169.aByte2064, (short) 22697);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i];
					class48.anInt469 = i_565_ * 3;
					class48.anInt470 = i_566_ - i_565_;
					class48.method946(bool);
				}
			} else {
				((Class528_Sub3) this).aClass505_Sub2_8917.method14161(3, (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661));
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8836);
				Matrix44Var class294_568_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass294_8713);
				class294_568_.method5209(class294);
				class294_568_.method5207();
				int i = 0;
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(true);
				else {
					class48.aClass385_466.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]));
					class48.aClass385_466.method6649(class294_568_);
					class48.aClass385_448.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_464.set((-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_461.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831 > 0) {
						i = (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831);
						Vector3 class385 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass385_8707);
						for (int i_569_ = 0; i_569_ < i; i_569_++) {
							Class282_Sub24 class282_sub24 = (((Class528_Sub3) this).aClass505_Sub2_8917.aClass282_Sub24Array8716[i_569_]);
							int i_570_ = class282_sub24.method12371(-2146580608);
							class385.copy(class282_sub24.aClass385_7687);
							class385.method6651(class294_568_);
							class48.aFloatArray463[i_569_ * 4 + 0] = class385.x;
							class48.aFloatArray463[i_569_ * 4 + 1] = class385.y;
							class48.aFloatArray463[i_569_ * 4 + 2] = class385.z;
							class48.aFloatArray463[i_569_ * 4 + 3] = (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523));
							float f = (class282_sub24.method12395(-208549702) / 255.0F);
							class48.aFloatArray450[i_569_ * 4 + 0] = (float) (i_570_ >> 16 & 0xff) * f;
							class48.aFloatArray450[i_569_ * 4 + 1] = (float) (i_570_ >> 8 & 0xff) * f;
							class48.aFloatArray450[i_569_ * 4 + 2] = (float) (i_570_ & 0xff) * f;
							class48.aFloatArray450[i_569_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_571_ = 0; i_571_ < ((Class528_Sub3) this).anIntArray8952.length; i_571_++) {
					int i_572_ = ((Class528_Sub3) this).anIntArray8944[i_571_];
					int i_573_ = ((Class528_Sub3) this).anIntArray8944[i_571_ + 1];
					int i_574_ = (((Class528_Sub3) this).aShortArray8923[i_572_] & 0xffff);
					byte i_575_ = 11;
					if (i_574_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_574_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_574_, -2146030433);
						i_575_ = class169.aByte2064;
						class48.method944(class169);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i_571_];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i_571_];
					class48.anInt469 = i_572_ * 3;
					class48.anInt470 = i_573_ - i_572_;
					switch (i_575_) {
					case 6:
						class48.method946(!Class282_Sub41.method13367(i_575_, (short) 14784));
						break;
					case 1:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_568_);
						class48.method948(i);
						break;
					case 7:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_568_);
						class48.aClass384_465.method6522(class294);
						class48.anInterface31_451 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13965();
						class48.method949(i);
						break;
					case 5:
						if (!((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692) {
							Class41_Sub1_Sub2 class41_sub1_sub2 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass41_Sub1_Sub2_8798);
							Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_574_, -1952578778);
							class41_sub1_sub2.method15550(class169.aByte2076, (class169.anInt2077 * 1385119855), 720267839);
							class41_sub1_sub2.aClass384_10146.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8729);
							class41_sub1_sub2.anInt10152 = (((Class528_Sub3) this).anIntArray8952[i_571_]) * -1086935879;
							class41_sub1_sub2.anInt10153 = (((Class528_Sub3) this).anIntArray8946[i_571_]) * -1645796649;
							class41_sub1_sub2.anInt10142 = i_572_ * 2006407467;
							class41_sub1_sub2.anInt10155 = (i_573_ - i_572_) * -1715708705;
							class41_sub1_sub2.method15549((short) 27284);
						} else
							class48.method965(i);
						break;
					default:
						class48.method965(i);
					}
				}
			}
			method14274();
		}
	}

	void method11275(int i, int[] is, int i_576_, int i_577_, int i_578_, int i_579_, boolean bool) {
		int i_580_ = is.length;
		if (i == 0) {
			i_576_ <<= 4;
			i_577_ <<= 4;
			i_578_ <<= 4;
			int i_581_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_582_ = 0; i_582_ < i_580_; i_582_++) {
				int i_583_ = is[i_582_];
				if (i_583_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_584_ = ((Class528_Sub3) this).anIntArrayArray8966[i_583_];
					for (int i_585_ = 0; i_585_ < is_584_.length; i_585_++) {
						int i_586_ = is_584_[i_585_];
						anInt8932 += ((Class528_Sub3) this).anIntArray8901[i_586_];
						anInt8939 += ((Class528_Sub3) this).anIntArray8902[i_586_];
						anInt8964 += ((Class528_Sub3) this).anIntArray8931[i_586_];
						i_581_++;
					}
				}
			}
			if (i_581_ > 0) {
				anInt8932 = anInt8932 / i_581_ + i_576_;
				anInt8939 = anInt8939 / i_581_ + i_577_;
				anInt8964 = anInt8964 / i_581_ + i_578_;
			} else {
				anInt8932 = i_576_;
				anInt8939 = i_577_;
				anInt8964 = i_578_;
			}
		} else if (i == 1) {
			i_576_ <<= 4;
			i_577_ <<= 4;
			i_578_ <<= 4;
			for (int i_587_ = 0; i_587_ < i_580_; i_587_++) {
				int i_588_ = is[i_587_];
				if (i_588_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_589_ = ((Class528_Sub3) this).anIntArrayArray8966[i_588_];
					for (int i_590_ = 0; i_590_ < is_589_.length; i_590_++) {
						int i_591_ = is_589_[i_590_];
						((Class528_Sub3) this).anIntArray8901[i_591_] += i_576_;
						((Class528_Sub3) this).anIntArray8902[i_591_] += i_577_;
						((Class528_Sub3) this).anIntArray8931[i_591_] += i_578_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_592_ = 0; i_592_ < i_580_; i_592_++) {
				int i_593_ = is[i_592_];
				if (i_593_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_594_ = ((Class528_Sub3) this).anIntArrayArray8966[i_593_];
					if ((i_579_ & 0x1) == 0) {
						for (int i_595_ = 0; i_595_ < is_594_.length; i_595_++) {
							int i_596_ = is_594_[i_595_];
							((Class528_Sub3) this).anIntArray8901[i_596_] -= anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_596_] -= anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_596_] -= anInt8964;
							if (i_578_ != 0) {
								int i_597_ = Class382.anIntArray4657[i_578_];
								int i_598_ = Class382.anIntArray4661[i_578_];
								int i_599_ = (((((Class528_Sub3) this).anIntArray8902[i_596_]) * i_597_ + (((Class528_Sub3) this).anIntArray8901[i_596_]) * i_598_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8902[i_596_] = ((((Class528_Sub3) this).anIntArray8902[i_596_]) * i_598_ - (((Class528_Sub3) this).anIntArray8901[i_596_]) * i_597_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_596_] = i_599_;
							}
							if (i_576_ != 0) {
								int i_600_ = Class382.anIntArray4657[i_576_];
								int i_601_ = Class382.anIntArray4661[i_576_];
								int i_602_ = (((((Class528_Sub3) this).anIntArray8902[i_596_]) * i_601_ - (((Class528_Sub3) this).anIntArray8931[i_596_]) * i_600_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_596_] = ((((Class528_Sub3) this).anIntArray8902[i_596_]) * i_600_ + (((Class528_Sub3) this).anIntArray8931[i_596_]) * i_601_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8902[i_596_] = i_602_;
							}
							if (i_577_ != 0) {
								int i_603_ = Class382.anIntArray4657[i_577_];
								int i_604_ = Class382.anIntArray4661[i_577_];
								int i_605_ = (((((Class528_Sub3) this).anIntArray8931[i_596_]) * i_603_ + (((Class528_Sub3) this).anIntArray8901[i_596_]) * i_604_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_596_] = ((((Class528_Sub3) this).anIntArray8931[i_596_]) * i_604_ - (((Class528_Sub3) this).anIntArray8901[i_596_]) * i_603_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_596_] = i_605_;
							}
							((Class528_Sub3) this).anIntArray8901[i_596_] += anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_596_] += anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_596_] += anInt8964;
						}
					} else {
						for (int i_606_ = 0; i_606_ < is_594_.length; i_606_++) {
							int i_607_ = is_594_[i_606_];
							((Class528_Sub3) this).anIntArray8901[i_607_] -= anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_607_] -= anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_607_] -= anInt8964;
							if (i_576_ != 0) {
								int i_608_ = Class382.anIntArray4657[i_576_];
								int i_609_ = Class382.anIntArray4661[i_576_];
								int i_610_ = (((((Class528_Sub3) this).anIntArray8902[i_607_]) * i_609_ - (((Class528_Sub3) this).anIntArray8931[i_607_]) * i_608_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_607_] = ((((Class528_Sub3) this).anIntArray8902[i_607_]) * i_608_ + (((Class528_Sub3) this).anIntArray8931[i_607_]) * i_609_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8902[i_607_] = i_610_;
							}
							if (i_578_ != 0) {
								int i_611_ = Class382.anIntArray4657[i_578_];
								int i_612_ = Class382.anIntArray4661[i_578_];
								int i_613_ = (((((Class528_Sub3) this).anIntArray8902[i_607_]) * i_611_ + (((Class528_Sub3) this).anIntArray8901[i_607_]) * i_612_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8902[i_607_] = ((((Class528_Sub3) this).anIntArray8902[i_607_]) * i_612_ - (((Class528_Sub3) this).anIntArray8901[i_607_]) * i_611_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_607_] = i_613_;
							}
							if (i_577_ != 0) {
								int i_614_ = Class382.anIntArray4657[i_577_];
								int i_615_ = Class382.anIntArray4661[i_577_];
								int i_616_ = (((((Class528_Sub3) this).anIntArray8931[i_607_]) * i_614_ + (((Class528_Sub3) this).anIntArray8901[i_607_]) * i_615_ + 16383) >> 14);
								((Class528_Sub3) this).anIntArray8931[i_607_] = ((((Class528_Sub3) this).anIntArray8931[i_607_]) * i_615_ - (((Class528_Sub3) this).anIntArray8901[i_607_]) * i_614_ + 16383) >> 14;
								((Class528_Sub3) this).anIntArray8901[i_607_] = i_616_;
							}
							((Class528_Sub3) this).anIntArray8901[i_607_] += anInt8932;
							((Class528_Sub3) this).anIntArray8902[i_607_] += anInt8939;
							((Class528_Sub3) this).anIntArray8931[i_607_] += anInt8964;
						}
					}
				}
			}
			if (bool) {
				for (int i_617_ = 0; i_617_ < i_580_; i_617_++) {
					int i_618_ = is[i_617_];
					if (i_618_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_619_ = (((Class528_Sub3) this).anIntArrayArray8966[i_618_]);
						for (int i_620_ = 0; i_620_ < is_619_.length; i_620_++) {
							int i_621_ = is_619_[i_620_];
							int i_622_ = (((Class528_Sub3) this).anIntArray8947[i_621_]);
							int i_623_ = (((Class528_Sub3) this).anIntArray8947[i_621_ + 1]);
							for (int i_624_ = i_622_; i_624_ < i_623_; i_624_++) {
								int i_625_ = ((((Class528_Sub3) this).aShortArray8948[i_624_]) - 1);
								if (i_625_ == -1)
									break;
								if (i_578_ != 0) {
									int i_626_ = Class382.anIntArray4657[i_578_];
									int i_627_ = Class382.anIntArray4661[i_578_];
									int i_628_ = (((((Class528_Sub3) this).aShortArray8933[i_625_]) * i_626_ + ((((Class528_Sub3) this).aShortArray8909[i_625_]) * i_627_) + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8933[i_625_] = (short) ((((((Class528_Sub3) this).aShortArray8933[i_625_]) * i_627_) - (((Class528_Sub3) this).aShortArray8909[i_625_]) * i_626_ + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8909[i_625_] = (short) i_628_;
								}
								if (i_576_ != 0) {
									int i_629_ = Class382.anIntArray4657[i_576_];
									int i_630_ = Class382.anIntArray4661[i_576_];
									int i_631_ = (((((Class528_Sub3) this).aShortArray8933[i_625_]) * i_630_ - ((((Class528_Sub3) this).aShortArray8911[i_625_]) * i_629_) + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8911[i_625_] = (short) ((((((Class528_Sub3) this).aShortArray8933[i_625_]) * i_629_) + (((Class528_Sub3) this).aShortArray8911[i_625_]) * i_630_ + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8933[i_625_] = (short) i_631_;
								}
								if (i_577_ != 0) {
									int i_632_ = Class382.anIntArray4657[i_577_];
									int i_633_ = Class382.anIntArray4661[i_577_];
									int i_634_ = (((((Class528_Sub3) this).aShortArray8911[i_625_]) * i_632_ + ((((Class528_Sub3) this).aShortArray8909[i_625_]) * i_633_) + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8911[i_625_] = (short) ((((((Class528_Sub3) this).aShortArray8911[i_625_]) * i_633_) - (((Class528_Sub3) this).aShortArray8909[i_625_]) * i_632_ + 16383) >> 14);
									((Class528_Sub3) this).aShortArray8909[i_625_] = (short) i_634_;
								}
							}
						}
					}
				}
				method14285();
			}
		} else if (i == 3) {
			for (int i_635_ = 0; i_635_ < i_580_; i_635_++) {
				int i_636_ = is[i_635_];
				if (i_636_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_637_ = ((Class528_Sub3) this).anIntArrayArray8966[i_636_];
					for (int i_638_ = 0; i_638_ < is_637_.length; i_638_++) {
						int i_639_ = is_637_[i_638_];
						((Class528_Sub3) this).anIntArray8901[i_639_] -= anInt8932;
						((Class528_Sub3) this).anIntArray8902[i_639_] -= anInt8939;
						((Class528_Sub3) this).anIntArray8931[i_639_] -= anInt8964;
						((Class528_Sub3) this).anIntArray8901[i_639_] = (((Class528_Sub3) this).anIntArray8901[i_639_] * i_576_) >> 7;
						((Class528_Sub3) this).anIntArray8902[i_639_] = (((Class528_Sub3) this).anIntArray8902[i_639_] * i_577_) >> 7;
						((Class528_Sub3) this).anIntArray8931[i_639_] = (((Class528_Sub3) this).anIntArray8931[i_639_] * i_578_) >> 7;
						((Class528_Sub3) this).anIntArray8901[i_639_] += anInt8932;
						((Class528_Sub3) this).anIntArray8902[i_639_] += anInt8939;
						((Class528_Sub3) this).anIntArray8931[i_639_] += anInt8964;
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_640_ = false;
				for (int i_641_ = 0; i_641_ < i_580_; i_641_++) {
					int i_642_ = is[i_641_];
					if (i_642_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_643_ = (((Class528_Sub3) this).anIntArrayArray8924[i_642_]);
						for (int i_644_ = 0; i_644_ < is_643_.length; i_644_++) {
							int i_645_ = is_643_[i_644_];
							int i_646_ = (((((Class528_Sub3) this).aByteArray8900[i_645_]) & 0xff) + i_576_ * 8);
							if (i_646_ < 0)
								i_646_ = 0;
							else if (i_646_ > 255)
								i_646_ = 255;
							((Class528_Sub3) this).aByteArray8900[i_645_] = (byte) i_646_;
						}
						bool_640_ = bool_640_ | is_643_.length > 0;
					}
				}
				if (bool_640_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_647_ = 0; i_647_ < ((Class528_Sub3) this).anInt8951; i_647_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_647_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_647_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
						}
					}
					method14269();
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_648_ = false;
				for (int i_649_ = 0; i_649_ < i_580_; i_649_++) {
					int i_650_ = is[i_649_];
					if (i_650_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_651_ = (((Class528_Sub3) this).anIntArrayArray8924[i_650_]);
						for (int i_652_ = 0; i_652_ < is_651_.length; i_652_++) {
							int i_653_ = is_651_[i_652_];
							int i_654_ = ((((Class528_Sub3) this).aShortArray8918[i_653_]) & 0xffff);
							int i_655_ = i_654_ >> 10 & 0x3f;
							int i_656_ = i_654_ >> 7 & 0x7;
							int i_657_ = i_654_ & 0x7f;
							i_655_ = i_655_ + i_576_ & 0x3f;
							i_656_ += i_577_ / 4;
							if (i_656_ < 0)
								i_656_ = 0;
							else if (i_656_ > 7)
								i_656_ = 7;
							i_657_ += i_578_;
							if (i_657_ < 0)
								i_657_ = 0;
							else if (i_657_ > 127)
								i_657_ = 127;
							((Class528_Sub3) this).aShortArray8918[i_653_] = (short) (i_655_ << 10 | i_656_ << 7 | i_657_);
						}
						bool_648_ = bool_648_ | is_651_.length > 0;
					}
				}
				if (bool_648_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_658_ = 0; i_658_ < ((Class528_Sub3) this).anInt8951; i_658_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_658_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_658_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff)]) & 0xffffff);
						}
					}
					method14269();
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_659_ = 0; i_659_ < i_580_; i_659_++) {
					int i_660_ = is[i_659_];
					if (i_660_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_661_ = (((Class528_Sub3) this).anIntArrayArray8954[i_660_]);
						for (int i_662_ = 0; i_662_ < is_661_.length; i_662_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_661_[i_662_]]);
							((Class65) class65).anInt668 += i_576_;
							((Class65) class65).anInt672 += i_577_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_663_ = 0; i_663_ < i_580_; i_663_++) {
					int i_664_ = is[i_663_];
					if (i_664_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_665_ = (((Class528_Sub3) this).anIntArrayArray8954[i_664_]);
						for (int i_666_ = 0; i_666_ < is_665_.length; i_666_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_665_[i_666_]]);
							((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_576_ >> 7;
							((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_577_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_667_ = 0; i_667_ < i_580_; i_667_++) {
					int i_668_ = is[i_667_];
					if (i_668_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_669_ = (((Class528_Sub3) this).anIntArrayArray8954[i_668_]);
						for (int i_670_ = 0; i_670_ < is_669_.length; i_670_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_669_[i_670_]]);
							((Class65) class65).anInt673 = (((Class65) class65).anInt673 + i_576_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	boolean ea() {
		if (((Class528_Sub3) this).anIntArrayArray8966 == null)
			return false;
		for (int i = 0; i < ((Class528_Sub3) this).anInt8899; i++) {
			((Class528_Sub3) this).anIntArray8901[i] <<= 4;
			((Class528_Sub3) this).anIntArray8902[i] <<= 4;
			((Class528_Sub3) this).anIntArray8931[i] <<= 4;
		}
		anInt8932 = 0;
		anInt8939 = 0;
		anInt8964 = 0;
		return true;
	}

	boolean method14279() {
		boolean bool = !((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662;
		boolean bool_671_ = ((((Class528_Sub3) this).anInt8896 & 0x37) != 0 && !((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662);
		boolean bool_672_ = !((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662;
		boolean bool_673_ = !((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662;
		if (!bool_672_ && !bool && !bool_671_ && !bool_673_)
			return true;
		boolean bool_674_ = true;
		if (bool_672_ && ((Class528_Sub3) this).aShortArray8907 != null) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 12, 12);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 12;
				long l = interface4.method40(0, i);
				for (int i_675_ = 0; i_675_ < ((Class528_Sub3) this).anInt8906; i_675_++) {
					short i_676_ = ((Class528_Sub3) this).aShortArray8907[i_675_];
					unsafe.putFloat(l, (float) (((Class528_Sub3) this).anIntArray8901[i_676_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class528_Sub3) this).anIntArray8902[i_676_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class528_Sub3) this).anIntArray8931[i_676_]));
					l += 4L;
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
					bytebuffer.putFloat((float) ((Class528_Sub3) this).anIntArray8901[(((Class528_Sub3) this).aShortArray8907[i])]);
					bytebuffer.putFloat((float) ((Class528_Sub3) this).anIntArray8902[(((Class528_Sub3) this).aShortArray8907[i])]);
					bytebuffer.putFloat((float) ((Class528_Sub3) this).anIntArray8931[(((Class528_Sub3) this).aShortArray8907[i])]);
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662 = true;
		}
		if (bool) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 4, 4);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 4;
				long l = interface4.method40(0, i);
				if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
					short[] is;
					short[] is_677_;
					short[] is_678_;
					byte[] is_679_;
					if (((Class528_Sub3) this).aClass355_8962 != null) {
						is = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4115;
						is_677_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4114;
						is_678_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4113;
						is_679_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aByteArray4116;
					} else {
						is = ((Class528_Sub3) this).aShortArray8909;
						is_677_ = ((Class528_Sub3) this).aShortArray8933;
						is_678_ = ((Class528_Sub3) this).aShortArray8911;
						is_679_ = ((Class528_Sub3) this).aByteArray8912;
					}
					float f = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					float f_680_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					for (int i_681_ = 0; i_681_ < ((Class528_Sub3) this).anInt8906; i_681_++) {
						short i_682_ = ((Class528_Sub3) this).aShortArray8945[i_681_];
						int i_683_ = method14282((((Class528_Sub3) this).aShortArray8918[i_682_]) & 0xffff, (((Class528_Sub3) this).aShortArray8923[i_682_]), ((Class528_Sub3) this).aShort8897);
						float f_684_ = ((float) (i_683_ >> 16 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766));
						float f_685_ = ((float) (i_683_ >> 8 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767));
						float f_686_ = ((float) (i_683_ & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768));
						byte i_687_ = is_679_[i_681_];
						float f_688_;
						if (i_687_ == 0)
							f_688_ = (((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i_681_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_677_[i_681_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_678_[i_681_]) * 0.0026041667F);
						else
							f_688_ = (((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i_681_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_677_[i_681_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_678_[i_681_]) / ((float) i_687_ * 256.0F));
						float f_689_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769) + f_688_ * (f_688_ < 0.0F ? f_680_ : f));
						int i_690_ = (int) (f_684_ * f_689_);
						if (i_690_ < 0)
							i_690_ = 0;
						else if (i_690_ > 255)
							i_690_ = 255;
						int i_691_ = (int) (f_685_ * f_689_);
						if (i_691_ < 0)
							i_691_ = 0;
						else if (i_691_ > 255)
							i_691_ = 255;
						int i_692_ = (int) (f_686_ * f_689_);
						if (i_692_ < 0)
							i_692_ = 0;
						else if (i_692_ > 255)
							i_692_ = 255;
						unsafe.putInt(l, (255 - (((Class528_Sub3) this).aByteArray8900[i_682_]) << 24 | i_690_ << 16 | i_691_ << 8 | i_692_));
						l += 4L;
					}
				} else {
					for (int i_693_ = 0; i_693_ < ((Class528_Sub3) this).anInt8906; i_693_++) {
						short i_694_ = ((Class528_Sub3) this).aShortArray8945[i_693_];
						int i_695_ = (255 - (((Class528_Sub3) this).aByteArray8900[i_694_]) << 24 | method14282(((((Class528_Sub3) this).aShortArray8918[i_694_]) & 0xffff), (((Class528_Sub3) this).aShortArray8923[i_694_]), (((Class528_Sub3) this).aShort8897)));
						unsafe.putInt(l, i_695_);
						l += 4L;
					}
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
					short[] is;
					short[] is_696_;
					short[] is_697_;
					byte[] is_698_;
					if (((Class528_Sub3) this).aClass355_8962 != null) {
						is = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4115;
						is_696_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4114;
						is_697_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4113;
						is_698_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aByteArray4116;
					} else {
						is = ((Class528_Sub3) this).aShortArray8909;
						is_696_ = ((Class528_Sub3) this).aShortArray8933;
						is_697_ = ((Class528_Sub3) this).aShortArray8911;
						is_698_ = ((Class528_Sub3) this).aByteArray8912;
					}
					float f = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					float f_699_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
						short i_700_ = ((Class528_Sub3) this).aShortArray8945[i];
						int i_701_ = method14282((((Class528_Sub3) this).aShortArray8918[i_700_]) & 0xffff, (((Class528_Sub3) this).aShortArray8923[i_700_]), ((Class528_Sub3) this).aShort8897);
						float f_702_ = ((float) (i_701_ >> 16 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766));
						float f_703_ = ((float) (i_701_ >> 8 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767));
						float f_704_ = ((float) (i_701_ & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768));
						byte i_705_ = is_698_[i];
						float f_706_;
						if (i_705_ == 0)
							f_706_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i] + ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_696_[i]) + ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_697_[i])) * 0.0026041667F;
						else
							f_706_ = (((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_696_[i] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_697_[i]) / ((float) i_705_ * 256.0F));
						float f_707_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769) + f_706_ * (f_706_ < 0.0F ? f_699_ : f));
						int i_708_ = (int) (f_702_ * f_707_);
						if (i_708_ < 0)
							i_708_ = 0;
						else if (i_708_ > 255)
							i_708_ = 255;
						int i_709_ = (int) (f_703_ * f_707_);
						if (i_709_ < 0)
							i_709_ = 0;
						else if (i_709_ > 255)
							i_709_ = 255;
						int i_710_ = (int) (f_704_ * f_707_);
						if (i_710_ < 0)
							i_710_ = 0;
						else if (i_710_ > 255)
							i_710_ = 255;
						bytebuffer.putInt(255 - (((Class528_Sub3) this).aByteArray8900[i_700_]) << 24 | i_708_ << 16 | i_709_ << 8 | i_710_);
					}
				} else {
					for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
						short i_711_ = ((Class528_Sub3) this).aShortArray8945[i];
						int i_712_ = (255 - (((Class528_Sub3) this).aByteArray8900[i_711_]) << 24 | method14282(((((Class528_Sub3) this).aShortArray8918[i_711_]) & 0xffff), (((Class528_Sub3) this).aShortArray8923[i_711_]), (((Class528_Sub3) this).aShort8897)));
						bytebuffer.putInt(i_712_);
					}
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = true;
		}
		if (bool_671_) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 12, 12);
			short[] is;
			short[] is_713_;
			short[] is_714_;
			byte[] is_715_;
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				is = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115);
				is_713_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114);
				is_714_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113);
				is_715_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116);
			} else {
				is = ((Class528_Sub3) this).aShortArray8909;
				is_713_ = ((Class528_Sub3) this).aShortArray8933;
				is_714_ = ((Class528_Sub3) this).aShortArray8911;
				is_715_ = ((Class528_Sub3) this).aByteArray8912;
			}
			float f = 3.0F / (float) ((Class528_Sub3) this).aShort8898;
			float f_716_ = 3.0F / (float) (((Class528_Sub3) this).aShort8898 + ((Class528_Sub3) this).aShort8898 / 2);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 12;
				long l = interface4.method40(0, i);
				for (int i_717_ = 0; i_717_ < ((Class528_Sub3) this).anInt8906; i_717_++) {
					float f_718_ = (is_715_[i_717_] == 0 ? f_716_ : f / (float) is_715_[i_717_]);
					float f_719_ = (float) is[i_717_] * f_718_;
					float f_720_ = (float) is_713_[i_717_] * f_718_;
					float f_721_ = (float) is_714_[i_717_] * f_718_;
					unsafe.putFloat(l, f_719_);
					l += 4L;
					unsafe.putFloat(l, f_720_);
					l += 4L;
					unsafe.putFloat(l, f_721_);
					l += 4L;
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
					float f_722_ = is_715_[i] == 0 ? f_716_ : f / (float) is_715_[i];
					float f_723_ = (float) is[i] * f_722_;
					float f_724_ = (float) is_713_[i] * f_722_;
					float f_725_ = (float) is_714_[i] * f_722_;
					bytebuffer.putFloat(f_723_);
					bytebuffer.putFloat(f_724_);
					bytebuffer.putFloat(f_725_);
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662 = true;
		}
		if (bool_673_) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 8, 8);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 8;
				long l = interface4.method40(0, i);
				for (int i_726_ = 0; i_726_ < ((Class528_Sub3) this).anInt8906; i_726_++) {
					unsafe.putFloat(l, (((Class528_Sub3) this).aFloatArray8892[i_726_]));
					l += 4L;
					unsafe.putFloat(l, (((Class528_Sub3) this).aFloatArray8914[i_726_]));
					l += 4L;
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
					bytebuffer.putFloat(((Class528_Sub3) this).aFloatArray8892[i]);
					bytebuffer.putFloat(((Class528_Sub3) this).aFloatArray8914[i]);
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662 = true;
		}
		return bool_674_;
	}

	void method14280() {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class528_Sub3) this).aClass63_8927.method1266();
		if (((Class528_Sub3) this).aClass63_8930 != null)
			((Class528_Sub3) this).aClass63_8930.method1266();
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class528_Sub3) this).aClass63_8913.method1266();
		if (((Class528_Sub3) this).aClass63_8929 != null)
			((Class528_Sub3) this).aClass63_8929.method1266();
		if (((Class528_Sub3) this).aClass39_8926 != null)
			((Class528_Sub3) this).aClass39_8926.method863();
	}

	void method14281() {
		int i = 32767;
		int i_727_ = 32767;
		int i_728_ = 32767;
		int i_729_ = -32768;
		int i_730_ = -32768;
		int i_731_ = -32768;
		int i_732_ = 0;
		int i_733_ = 0;
		for (int i_734_ = 0; i_734_ < ((Class528_Sub3) this).anInt8910; i_734_++) {
			int i_735_ = ((Class528_Sub3) this).anIntArray8901[i_734_];
			int i_736_ = ((Class528_Sub3) this).anIntArray8902[i_734_];
			int i_737_ = ((Class528_Sub3) this).anIntArray8931[i_734_];
			if (i_735_ < i)
				i = i_735_;
			if (i_735_ > i_729_)
				i_729_ = i_735_;
			if (i_736_ < i_727_)
				i_727_ = i_736_;
			if (i_736_ > i_730_)
				i_730_ = i_736_;
			if (i_737_ < i_728_)
				i_728_ = i_737_;
			if (i_737_ > i_731_)
				i_731_ = i_737_;
			int i_738_ = i_735_ * i_735_ + i_737_ * i_737_;
			if (i_738_ > i_732_)
				i_732_ = i_738_;
			i_738_ = i_735_ * i_735_ + i_737_ * i_737_ + i_736_ * i_736_;
			if (i_738_ > i_733_)
				i_733_ = i_738_;
		}
		((Class528_Sub3) this).anInt8940 = i;
		((Class528_Sub3) this).anInt8941 = i_729_;
		((Class528_Sub3) this).anInt8908 = i_727_;
		((Class528_Sub3) this).anInt8893 = i_730_;
		((Class528_Sub3) this).anInt8942 = i_728_;
		((Class528_Sub3) this).anInt8943 = i_731_;
		((Class528_Sub3) this).anInt8936 = (int) (Math.sqrt((double) i_732_) + 0.99);
		((Class528_Sub3) this).anInt8957 = (int) (Math.sqrt((double) i_733_) + 0.99);
		((Class528_Sub3) this).aBool8937 = true;
	}

	int method14282(int i, short i_739_, int i_740_) {
		int i_741_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anIntArray8803[method14290(i, i_740_)]);
		if (i_739_ != -1) {
			Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_739_ & 0xffff, -2097753568);
			int i_742_ = class169.aByte2079 & 0xff;
			if (i_742_ != 0) {
				int i_743_ = 131586 * i_740_;
				if (i_742_ == 256)
					i_741_ = i_743_;
				else {
					int i_744_ = i_742_;
					int i_745_ = 256 - i_742_;
					i_741_ = ((((i_743_ & 0xff00ff) * i_744_ + (i_741_ & 0xff00ff) * i_745_) & ~0xff00ff) + (((i_743_ & 0xff00) * i_744_ + (i_741_ & 0xff00) * i_745_) & 0xff0000)) >> 8;
				}
			}
			int i_746_ = class169.aByte2080 & 0xff;
			if (i_746_ != 0) {
				i_746_ += 256;
				int i_747_ = ((i_741_ & 0xff0000) >> 16) * i_746_;
				if (i_747_ > 65535)
					i_747_ = 65535;
				int i_748_ = ((i_741_ & 0xff00) >> 8) * i_746_;
				if (i_748_ > 65535)
					i_748_ = 65535;
				int i_749_ = (i_741_ & 0xff) * i_746_;
				if (i_749_ > 65535)
					i_749_ = 65535;
				i_741_ = (i_747_ << 8 & 0xff0000) + (i_748_ & 0xff00) + (i_749_ >> 8);
			}
		}
		return i_741_ & 0xffffff;
	}

	public void bn(int i) {
		int i_750_ = Class382.anIntArray4657[i];
		int i_751_ = Class382.anIntArray4661[i];
		for (int i_752_ = 0; i_752_ < ((Class528_Sub3) this).anInt8910; i_752_++) {
			int i_753_ = ((((Class528_Sub3) this).anIntArray8902[i_752_] * i_751_ - ((Class528_Sub3) this).anIntArray8931[i_752_] * i_750_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_752_] = ((((Class528_Sub3) this).anIntArray8902[i_752_] * i_750_ + ((Class528_Sub3) this).anIntArray8931[i_752_] * i_751_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_752_] = i_753_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public MeshRasterizer method11276(byte i, int i_754_, boolean bool) {
		boolean bool_755_ = false;
		Class528_Sub3 class528_sub3_756_;
		Class528_Sub3 class528_sub3_757_;
		if (i > 0 && i <= 7) {
			class528_sub3_757_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8840[i - 1]);
			class528_sub3_756_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8839[i - 1]);
			bool_755_ = true;
		} else
			class528_sub3_756_ = class528_sub3_757_ = new Class528_Sub3(((Class528_Sub3) this).aClass505_Sub2_8917, 0, 0, true, false);
		return method14267(class528_sub3_756_, class528_sub3_757_, i_754_, bool_755_, bool);
	}

	public void pa(int i, int i_758_, Class390 class390, Class390 class390_759_, int i_760_, int i_761_, int i_762_) {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i_763_ = i_760_ + ((Class528_Sub3) this).anInt8940;
		int i_764_ = i_760_ + ((Class528_Sub3) this).anInt8941;
		int i_765_ = i_762_ + ((Class528_Sub3) this).anInt8942;
		int i_766_ = i_762_ + ((Class528_Sub3) this).anInt8943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_763_ >= 0 && ((i_764_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4776 * -1843860823) && i_765_ >= 0 && ((i_766_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4773 * 1826078169))) {
			if (i == 4 || i == 5) {
				if (class390_759_ == null || (i_763_ < 0 || ((i_764_ + class390_759_.anInt4774 * 750971439 >> class390_759_.anInt4775 * 1856651955) >= class390_759_.anInt4776 * -1843860823) || i_765_ < 0 || ((i_766_ + class390_759_.anInt4774 * 750971439 >> class390_759_.anInt4775 * 1856651955) >= class390_759_.anInt4773 * 1826078169)))
					return;
			} else {
				i_763_ >>= class390.anInt4775 * 1856651955;
				i_764_ = (i_764_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				i_765_ >>= class390.anInt4775 * 1856651955;
				i_766_ = (i_766_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				if (class390.method6722(i_763_, i_765_, 65280) == i_761_ && class390.method6722(i_764_, i_765_, 65280) == i_761_ && class390.method6722(i_763_, i_766_, 65280) == i_761_ && class390.method6722(i_764_, i_766_, 65280) == i_761_)
					return;
			}
			if (i == 1) {
				for (int i_767_ = 0; i_767_ < ((Class528_Sub3) this).anInt8910; i_767_++)
					((Class528_Sub3) this).anIntArray8902[i_767_] = (((Class528_Sub3) this).anIntArray8902[i_767_] + class390.method6709(((((Class528_Sub3) this).anIntArray8901[i_767_]) + i_760_), ((((Class528_Sub3) this).anIntArray8931[i_767_]) + i_762_), 1770743243) - i_761_);
			} else if (i == 2) {
				int i_768_ = ((Class528_Sub3) this).anInt8908;
				if (i_768_ == 0)
					return;
				for (int i_769_ = 0; i_769_ < ((Class528_Sub3) this).anInt8910; i_769_++) {
					int i_770_ = (((Class528_Sub3) this).anIntArray8902[i_769_] << 16) / i_768_;
					if (i_770_ < i_758_)
						((Class528_Sub3) this).anIntArray8902[i_769_] = (((Class528_Sub3) this).anIntArray8902[i_769_] + (class390.method6709((((Class528_Sub3) this).anIntArray8901[i_769_]) + i_760_, (((Class528_Sub3) this).anIntArray8931[i_769_]) + i_762_, -1194531979) - i_761_) * (i_758_ - i_770_) / i_758_);
				}
			} else if (i == 3) {
				int i_771_ = (i_758_ & 0xff) * 4;
				int i_772_ = (i_758_ >> 8 & 0xff) * 4;
				int i_773_ = (i_758_ >> 16 & 0xff) << 6;
				int i_774_ = (i_758_ >> 24 & 0xff) << 6;
				if (i_760_ - (i_771_ >> 1) < 0 || (i_760_ + (i_771_ >> 1) + class390.anInt4774 * 750971439 >= (class390.anInt4776 * -1843860823 << class390.anInt4775 * 1856651955)) || i_762_ - (i_772_ >> 1) < 0 || (i_762_ + (i_772_ >> 1) + class390.anInt4774 * 750971439 >= (class390.anInt4773 * 1826078169 << class390.anInt4775 * 1856651955)))
					return;
				method11281(class390, i_760_, i_761_, i_762_, i_771_, i_772_, i_773_, i_774_);
			} else if (i == 4) {
				int i_775_ = (((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908);
				for (int i_776_ = 0; i_776_ < ((Class528_Sub3) this).anInt8910; i_776_++)
					((Class528_Sub3) this).anIntArray8902[i_776_] = (((Class528_Sub3) this).anIntArray8902[i_776_] + (class390_759_.method6709((((Class528_Sub3) this).anIntArray8901[i_776_]) + i_760_, (((Class528_Sub3) this).anIntArray8931[i_776_]) + i_762_, 1587611464) - i_761_) + i_775_);
			} else if (i == 5) {
				int i_777_ = (((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908);
				for (int i_778_ = 0; i_778_ < ((Class528_Sub3) this).anInt8910; i_778_++) {
					int i_779_ = (((Class528_Sub3) this).anIntArray8901[i_778_] + i_760_);
					int i_780_ = (((Class528_Sub3) this).anIntArray8931[i_778_] + i_762_);
					int i_781_ = class390.method6709(i_779_, i_780_, -2069259244);
					int i_782_ = class390_759_.method6709(i_779_, i_780_, -1440102393);
					int i_783_ = i_781_ - i_782_ - i_758_;
					((Class528_Sub3) this).anIntArray8902[i_778_] = ((((Class528_Sub3) this).anIntArray8902[i_778_] << 8) / i_777_ * i_783_ >> 8) - (i_761_ - i_781_);
				}
			}
			method14268();
			((Class528_Sub3) this).aBool8937 = false;
		}
	}

	void method14283(Matrix44Var class294) {
		if (((Class528_Sub3) this).anInt8963 != 0 && (method14279() && method14271())) {
			if (aClass34_8938 == null) {
				/* empty */
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.method14004();
			Class48 class48 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass48_8794);
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(0, (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(1, (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(2, (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method13997(((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
			class48.method957(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
			class48.aClass384_454.method6518();
			if (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aBool8779) {
				Class90 class90 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13898();
				class48.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) -(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8739));
				class48.aClass303_458.scale(3.0F / (float) (class90.anInt945 * 973144081));
				class48.aClass385_459.set(((float) (class90.anInt946 * 1152775735 >> 16 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 8 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 0 & 0xff) / 255.0F));
			} else {
				class48.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.set(0.0F, 0.0F, 0.0F);
			}
			if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8811 > 0) {
				class48.aClass303_460.set(0.0F, 0.0F, 1.0F, -(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813));
				class48.aClass385_457.set((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 16 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 8 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 0 & 0xff) / 255.0F);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_458.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8740);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_460.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				class48.aClass303_460.scale(1.0F / ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8819) - (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813)));
			} else {
				class48.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.set(0.0F, 0.0F, 0.0F);
			}
			if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8721);
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(false);
				for (int i = 0; i < ((Class528_Sub3) this).anIntArray8952.length; i++) {
					int i_784_ = ((Class528_Sub3) this).anIntArray8944[i];
					int i_785_ = ((Class528_Sub3) this).anIntArray8944[i + 1];
					int i_786_ = (((Class528_Sub3) this).aShortArray8923[i_784_] & 0xffff);
					boolean bool = false;
					if (i_786_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_786_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_786_, -1925930202);
						bool = !Class282_Sub41.method13367(class169.aByte2064, (short) 31333);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i];
					class48.anInt469 = i_784_ * 3;
					class48.anInt470 = i_785_ - i_784_;
					class48.method946(bool);
				}
			} else {
				((Class528_Sub3) this).aClass505_Sub2_8917.method14161(3, (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661));
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8836);
				Matrix44Var class294_787_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass294_8713);
				class294_787_.method5209(class294);
				class294_787_.method5207();
				int i = 0;
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(true);
				else {
					class48.aClass385_466.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]));
					class48.aClass385_466.method6649(class294_787_);
					class48.aClass385_448.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_464.set((-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_461.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831 > 0) {
						i = (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831);
						Vector3 class385 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass385_8707);
						for (int i_788_ = 0; i_788_ < i; i_788_++) {
							Class282_Sub24 class282_sub24 = (((Class528_Sub3) this).aClass505_Sub2_8917.aClass282_Sub24Array8716[i_788_]);
							int i_789_ = class282_sub24.method12371(-2142974852);
							class385.copy(class282_sub24.aClass385_7687);
							class385.method6651(class294_787_);
							class48.aFloatArray463[i_788_ * 4 + 0] = class385.x;
							class48.aFloatArray463[i_788_ * 4 + 1] = class385.y;
							class48.aFloatArray463[i_788_ * 4 + 2] = class385.z;
							class48.aFloatArray463[i_788_ * 4 + 3] = (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523));
							float f = (class282_sub24.method12395(1923649808) / 255.0F);
							class48.aFloatArray450[i_788_ * 4 + 0] = (float) (i_789_ >> 16 & 0xff) * f;
							class48.aFloatArray450[i_788_ * 4 + 1] = (float) (i_789_ >> 8 & 0xff) * f;
							class48.aFloatArray450[i_788_ * 4 + 2] = (float) (i_789_ & 0xff) * f;
							class48.aFloatArray450[i_788_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_790_ = 0; i_790_ < ((Class528_Sub3) this).anIntArray8952.length; i_790_++) {
					int i_791_ = ((Class528_Sub3) this).anIntArray8944[i_790_];
					int i_792_ = ((Class528_Sub3) this).anIntArray8944[i_790_ + 1];
					int i_793_ = (((Class528_Sub3) this).aShortArray8923[i_791_] & 0xffff);
					byte i_794_ = 11;
					if (i_793_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_793_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_793_, -1815122636);
						i_794_ = class169.aByte2064;
						class48.method944(class169);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i_790_];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i_790_];
					class48.anInt469 = i_791_ * 3;
					class48.anInt470 = i_792_ - i_791_;
					switch (i_794_) {
					case 6:
						class48.method946(!Class282_Sub41.method13367(i_794_, (short) 3167));
						break;
					case 1:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_787_);
						class48.method948(i);
						break;
					case 7:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_787_);
						class48.aClass384_465.method6522(class294);
						class48.anInterface31_451 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13965();
						class48.method949(i);
						break;
					case 5:
						if (!((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692) {
							Class41_Sub1_Sub2 class41_sub1_sub2 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass41_Sub1_Sub2_8798);
							Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_793_, -1907515135);
							class41_sub1_sub2.method15550(class169.aByte2076, (class169.anInt2077 * 1385119855), 1496709968);
							class41_sub1_sub2.aClass384_10146.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8729);
							class41_sub1_sub2.anInt10152 = (((Class528_Sub3) this).anIntArray8952[i_790_]) * -1086935879;
							class41_sub1_sub2.anInt10153 = (((Class528_Sub3) this).anIntArray8946[i_790_]) * -1645796649;
							class41_sub1_sub2.anInt10142 = i_791_ * 2006407467;
							class41_sub1_sub2.anInt10155 = (i_792_ - i_791_) * -1715708705;
							class41_sub1_sub2.method15549((short) 7089);
						} else
							class48.method965(i);
						break;
					default:
						class48.method965(i);
					}
				}
			}
			method14274();
		}
	}

	void method11285() {
		/* empty */
	}

	public MeshRasterizer method11279(byte i, int i_795_, boolean bool) {
		boolean bool_796_ = false;
		Class528_Sub3 class528_sub3_797_;
		Class528_Sub3 class528_sub3_798_;
		if (i > 0 && i <= 7) {
			class528_sub3_798_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8840[i - 1]);
			class528_sub3_797_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8839[i - 1]);
			bool_796_ = true;
		} else
			class528_sub3_797_ = class528_sub3_798_ = new Class528_Sub3(((Class528_Sub3) this).aClass505_Sub2_8917, 0, 0, true, false);
		return method14267(class528_sub3_797_, class528_sub3_798_, i_795_, bool_796_, bool);
	}

	public MeshRasterizer method11296(byte i, int i_799_, boolean bool) {
		boolean bool_800_ = false;
		Class528_Sub3 class528_sub3_801_;
		Class528_Sub3 class528_sub3_802_;
		if (i > 0 && i <= 7) {
			class528_sub3_802_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8840[i - 1]);
			class528_sub3_801_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass528_Sub3Array8839[i - 1]);
			bool_800_ = true;
		} else
			class528_sub3_801_ = class528_sub3_802_ = new Class528_Sub3(((Class528_Sub3) this).aClass505_Sub2_8917, 0, 0, true, false);
		return method14267(class528_sub3_801_, class528_sub3_802_, i_799_, bool_800_, bool);
	}

	static short[] method14284(short[] is, int i) {
		short[] is_803_ = new short[i];
		System.arraycopy(is, 0, is_803_, 0, i);
		return is_803_;
	}

	public int ae() {
		return ((Class528_Sub3) this).anInt8895;
	}

	void ka() {
		for (int i = 0; i < ((Class528_Sub3) this).anInt8899; i++) {
			((Class528_Sub3) this).anIntArray8901[i] = ((Class528_Sub3) this).anIntArray8901[i] + 7 >> 4;
			((Class528_Sub3) this).anIntArray8902[i] = ((Class528_Sub3) this).anIntArray8902[i] + 7 >> 4;
			((Class528_Sub3) this).anIntArray8931[i] = ((Class528_Sub3) this).anIntArray8931[i] + 7 >> 4;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	void method14285() {
		if ((((Class528_Sub3) this).anInt8896 & 0x37) != 0) {
			if (((Class528_Sub3) this).aClass63_8929 != null)
				((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662 = false;
		} else if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = false;
	}

	public void bi(int i) {
		int i_804_ = Class382.anIntArray4657[i];
		int i_805_ = Class382.anIntArray4661[i];
		for (int i_806_ = 0; i_806_ < ((Class528_Sub3) this).anInt8910; i_806_++) {
			int i_807_ = ((((Class528_Sub3) this).anIntArray8931[i_806_] * i_804_ + ((Class528_Sub3) this).anIntArray8901[i_806_] * i_805_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_806_] = ((((Class528_Sub3) this).anIntArray8931[i_806_] * i_805_ - ((Class528_Sub3) this).anIntArray8901[i_806_] * i_804_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_806_] = i_807_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bw(int i) {
		int i_808_ = Class382.anIntArray4657[i];
		int i_809_ = Class382.anIntArray4661[i];
		for (int i_810_ = 0; i_810_ < ((Class528_Sub3) this).anInt8910; i_810_++) {
			int i_811_ = ((((Class528_Sub3) this).anIntArray8931[i_810_] * i_808_ + ((Class528_Sub3) this).anIntArray8901[i_810_] * i_809_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_810_] = ((((Class528_Sub3) this).anIntArray8931[i_810_] * i_809_ - ((Class528_Sub3) this).anIntArray8901[i_810_] * i_808_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_810_] = i_811_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public int n() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8957;
	}

	public void KA(int i) {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8927).aBool663 = Class50.method995(i, ((Class528_Sub3) this).anInt8896);
		if (((Class528_Sub3) this).aClass63_8930 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8930).aBool663 = Class50.method1056(i, ((Class528_Sub3) this).anInt8896);
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool663 = Class50.method1051(i, ((Class528_Sub3) this).anInt8896);
		if (((Class528_Sub3) this).aClass63_8929 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8929).aBool663 = Class50.method1020(i, ((Class528_Sub3) this).anInt8896);
		((Class528_Sub3) this).anInt8895 = i;
		if (((Class528_Sub3) this).aClass355_8962 != null && (((Class528_Sub3) this).anInt8895 & 0x10000) == 0) {
			((Class528_Sub3) this).aShortArray8909 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115);
			((Class528_Sub3) this).aShortArray8933 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114);
			((Class528_Sub3) this).aShortArray8911 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113);
			((Class528_Sub3) this).aByteArray8912 = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116);
			((Class528_Sub3) this).aClass355_8962 = null;
		}
		((Class528_Sub3) this).aBool8919 = true;
		method14274();
	}

	public void dl(int i) {
		int i_812_ = Class382.anIntArray4657[i];
		int i_813_ = Class382.anIntArray4661[i];
		for (int i_814_ = 0; i_814_ < ((Class528_Sub3) this).anInt8910; i_814_++) {
			int i_815_ = ((((Class528_Sub3) this).anIntArray8902[i_814_] * i_812_ + ((Class528_Sub3) this).anIntArray8901[i_814_] * i_813_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_814_] = ((((Class528_Sub3) this).anIntArray8902[i_814_] * i_813_ - ((Class528_Sub3) this).anIntArray8901[i_814_] * i_812_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_814_] = i_815_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bm(int i) {
		int i_816_ = Class382.anIntArray4657[i];
		int i_817_ = Class382.anIntArray4661[i];
		for (int i_818_ = 0; i_818_ < ((Class528_Sub3) this).anInt8910; i_818_++) {
			int i_819_ = ((((Class528_Sub3) this).anIntArray8902[i_818_] * i_817_ - ((Class528_Sub3) this).anIntArray8931[i_818_] * i_816_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_818_] = ((((Class528_Sub3) this).anIntArray8902[i_818_] * i_816_ + ((Class528_Sub3) this).anIntArray8931[i_818_] * i_817_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_818_] = i_819_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bs(int i) {
		int i_820_ = Class382.anIntArray4657[i];
		int i_821_ = Class382.anIntArray4661[i];
		for (int i_822_ = 0; i_822_ < ((Class528_Sub3) this).anInt8910; i_822_++) {
			int i_823_ = ((((Class528_Sub3) this).anIntArray8902[i_822_] * i_821_ - ((Class528_Sub3) this).anIntArray8931[i_822_] * i_820_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_822_] = ((((Class528_Sub3) this).anIntArray8902[i_822_] * i_820_ + ((Class528_Sub3) this).anIntArray8931[i_822_] * i_821_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_822_] = i_823_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bk(int i) {
		int i_824_ = Class382.anIntArray4657[i];
		int i_825_ = Class382.anIntArray4661[i];
		for (int i_826_ = 0; i_826_ < ((Class528_Sub3) this).anInt8910; i_826_++) {
			int i_827_ = ((((Class528_Sub3) this).anIntArray8902[i_826_] * i_825_ - ((Class528_Sub3) this).anIntArray8931[i_826_] * i_824_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_826_] = ((((Class528_Sub3) this).anIntArray8902[i_826_] * i_824_ + ((Class528_Sub3) this).anIntArray8931[i_826_] * i_825_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_826_] = i_827_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bf(int i) {
		int i_828_ = Class382.anIntArray4657[i];
		int i_829_ = Class382.anIntArray4661[i];
		for (int i_830_ = 0; i_830_ < ((Class528_Sub3) this).anInt8910; i_830_++) {
			int i_831_ = ((((Class528_Sub3) this).anIntArray8902[i_830_] * i_829_ - ((Class528_Sub3) this).anIntArray8931[i_830_] * i_828_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_830_] = ((((Class528_Sub3) this).anIntArray8902[i_830_] * i_828_ + ((Class528_Sub3) this).anIntArray8931[i_830_] * i_829_) >> 14);
			((Class528_Sub3) this).anIntArray8902[i_830_] = i_831_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public Class87[] method11300() {
		return ((Class528_Sub3) this).aClass87Array8949;
	}

	public void ce(int i) {
		((Class528_Sub3) this).aShort8897 = (short) i;
		method14269();
	}

	public void by() {
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++)
			((Class528_Sub3) this).anIntArray8931[i] = -((Class528_Sub3) this).anIntArray8931[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++)
			((Class528_Sub3) this).aShortArray8911[i] = (short) -((Class528_Sub3) this).aShortArray8911[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8916; i++) {
			short i_832_ = ((Class528_Sub3) this).aShortArray8920[i];
			((Class528_Sub3) this).aShortArray8920[i] = ((Class528_Sub3) this).aShortArray8922[i];
			((Class528_Sub3) this).aShortArray8922[i] = i_832_;
		}
		method14268();
		method14285();
		method14270();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bq() {
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++)
			((Class528_Sub3) this).anIntArray8931[i] = -((Class528_Sub3) this).anIntArray8931[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++)
			((Class528_Sub3) this).aShortArray8911[i] = (short) -((Class528_Sub3) this).aShortArray8911[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8916; i++) {
			short i_833_ = ((Class528_Sub3) this).aShortArray8920[i];
			((Class528_Sub3) this).aShortArray8920[i] = ((Class528_Sub3) this).aShortArray8922[i];
			((Class528_Sub3) this).aShortArray8922[i] = i_833_;
		}
		method14268();
		method14285();
		method14270();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bc(int i, int i_834_, Class390 class390, Class390 class390_835_, int i_836_, int i_837_, int i_838_) {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i_839_ = i_836_ + ((Class528_Sub3) this).anInt8940;
		int i_840_ = i_836_ + ((Class528_Sub3) this).anInt8941;
		int i_841_ = i_838_ + ((Class528_Sub3) this).anInt8942;
		int i_842_ = i_838_ + ((Class528_Sub3) this).anInt8943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_839_ >= 0 && ((i_840_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4776 * -1843860823) && i_841_ >= 0 && ((i_842_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4773 * 1826078169))) {
			if (i == 4 || i == 5) {
				if (class390_835_ == null || (i_839_ < 0 || ((i_840_ + class390_835_.anInt4774 * 750971439 >> class390_835_.anInt4775 * 1856651955) >= class390_835_.anInt4776 * -1843860823) || i_841_ < 0 || ((i_842_ + class390_835_.anInt4774 * 750971439 >> class390_835_.anInt4775 * 1856651955) >= class390_835_.anInt4773 * 1826078169)))
					return;
			} else {
				i_839_ >>= class390.anInt4775 * 1856651955;
				i_840_ = (i_840_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				i_841_ >>= class390.anInt4775 * 1856651955;
				i_842_ = (i_842_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				if (class390.method6722(i_839_, i_841_, 65280) == i_837_ && class390.method6722(i_840_, i_841_, 65280) == i_837_ && class390.method6722(i_839_, i_842_, 65280) == i_837_ && class390.method6722(i_840_, i_842_, 65280) == i_837_)
					return;
			}
			if (i == 1) {
				for (int i_843_ = 0; i_843_ < ((Class528_Sub3) this).anInt8910; i_843_++)
					((Class528_Sub3) this).anIntArray8902[i_843_] = (((Class528_Sub3) this).anIntArray8902[i_843_] + class390.method6709(((((Class528_Sub3) this).anIntArray8901[i_843_]) + i_836_), ((((Class528_Sub3) this).anIntArray8931[i_843_]) + i_838_), 344103840) - i_837_);
			} else if (i == 2) {
				int i_844_ = ((Class528_Sub3) this).anInt8908;
				if (i_844_ == 0)
					return;
				for (int i_845_ = 0; i_845_ < ((Class528_Sub3) this).anInt8910; i_845_++) {
					int i_846_ = (((Class528_Sub3) this).anIntArray8902[i_845_] << 16) / i_844_;
					if (i_846_ < i_834_)
						((Class528_Sub3) this).anIntArray8902[i_845_] = (((Class528_Sub3) this).anIntArray8902[i_845_] + (class390.method6709((((Class528_Sub3) this).anIntArray8901[i_845_]) + i_836_, (((Class528_Sub3) this).anIntArray8931[i_845_]) + i_838_, -904937996) - i_837_) * (i_834_ - i_846_) / i_834_);
				}
			} else if (i == 3) {
				int i_847_ = (i_834_ & 0xff) * 4;
				int i_848_ = (i_834_ >> 8 & 0xff) * 4;
				int i_849_ = (i_834_ >> 16 & 0xff) << 6;
				int i_850_ = (i_834_ >> 24 & 0xff) << 6;
				if (i_836_ - (i_847_ >> 1) < 0 || (i_836_ + (i_847_ >> 1) + class390.anInt4774 * 750971439 >= (class390.anInt4776 * -1843860823 << class390.anInt4775 * 1856651955)) || i_838_ - (i_848_ >> 1) < 0 || (i_838_ + (i_848_ >> 1) + class390.anInt4774 * 750971439 >= (class390.anInt4773 * 1826078169 << class390.anInt4775 * 1856651955)))
					return;
				method11281(class390, i_836_, i_837_, i_838_, i_847_, i_848_, i_849_, i_850_);
			} else if (i == 4) {
				int i_851_ = (((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908);
				for (int i_852_ = 0; i_852_ < ((Class528_Sub3) this).anInt8910; i_852_++)
					((Class528_Sub3) this).anIntArray8902[i_852_] = (((Class528_Sub3) this).anIntArray8902[i_852_] + (class390_835_.method6709((((Class528_Sub3) this).anIntArray8901[i_852_]) + i_836_, (((Class528_Sub3) this).anIntArray8931[i_852_]) + i_838_, -1827398874) - i_837_) + i_851_);
			} else if (i == 5) {
				int i_853_ = (((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908);
				for (int i_854_ = 0; i_854_ < ((Class528_Sub3) this).anInt8910; i_854_++) {
					int i_855_ = (((Class528_Sub3) this).anIntArray8901[i_854_] + i_836_);
					int i_856_ = (((Class528_Sub3) this).anIntArray8931[i_854_] + i_838_);
					int i_857_ = class390.method6709(i_855_, i_856_, 114216817);
					int i_858_ = class390_835_.method6709(i_855_, i_856_, 1659725231);
					int i_859_ = i_857_ - i_858_ - i_834_;
					((Class528_Sub3) this).anIntArray8902[i_854_] = ((((Class528_Sub3) this).anIntArray8902[i_854_] << 8) / i_853_ * i_859_ >> 8) - (i_837_ - i_857_);
				}
			}
			method14268();
			((Class528_Sub3) this).aBool8937 = false;
		}
	}

	public int o() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8893;
	}

	void bl(int i, int[] is, int i_860_, int i_861_, int i_862_, boolean bool, int i_863_, int[] is_864_) {
		int i_865_ = is.length;
		if (i == 0) {
			i_860_ <<= 4;
			i_861_ <<= 4;
			i_862_ <<= 4;
			int i_866_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_867_ = 0; i_867_ < i_865_; i_867_++) {
				int i_868_ = is[i_867_];
				if (i_868_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_869_ = ((Class528_Sub3) this).anIntArrayArray8966[i_868_];
					for (int i_870_ = 0; i_870_ < is_869_.length; i_870_++) {
						int i_871_ = is_869_[i_870_];
						if (((Class528_Sub3) this).aShortArray8905 == null || (i_863_ & (((Class528_Sub3) this).aShortArray8905[i_871_])) != 0) {
							anInt8932 += (((Class528_Sub3) this).anIntArray8901[i_871_]);
							anInt8939 += (((Class528_Sub3) this).anIntArray8902[i_871_]);
							anInt8964 += (((Class528_Sub3) this).anIntArray8931[i_871_]);
							i_866_++;
						}
					}
				}
			}
			if (i_866_ > 0) {
				anInt8932 = anInt8932 / i_866_ + i_860_;
				anInt8939 = anInt8939 / i_866_ + i_861_;
				anInt8964 = anInt8964 / i_866_ + i_862_;
				aBool8965 = true;
			} else {
				anInt8932 = i_860_;
				anInt8939 = i_861_;
				anInt8964 = i_862_;
			}
		} else if (i == 1) {
			if (is_864_ != null) {
				int i_872_ = ((is_864_[0] * i_860_ + is_864_[1] * i_861_ + is_864_[2] * i_862_ + 8192) >> 14);
				int i_873_ = ((is_864_[3] * i_860_ + is_864_[4] * i_861_ + is_864_[5] * i_862_ + 8192) >> 14);
				int i_874_ = ((is_864_[6] * i_860_ + is_864_[7] * i_861_ + is_864_[8] * i_862_ + 8192) >> 14);
				i_860_ = i_872_;
				i_861_ = i_873_;
				i_862_ = i_874_;
			}
			i_860_ <<= 4;
			i_861_ <<= 4;
			i_862_ <<= 4;
			for (int i_875_ = 0; i_875_ < i_865_; i_875_++) {
				int i_876_ = is[i_875_];
				if (i_876_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_877_ = ((Class528_Sub3) this).anIntArrayArray8966[i_876_];
					for (int i_878_ = 0; i_878_ < is_877_.length; i_878_++) {
						int i_879_ = is_877_[i_878_];
						if (((Class528_Sub3) this).aShortArray8905 == null || (i_863_ & (((Class528_Sub3) this).aShortArray8905[i_879_])) != 0) {
							((Class528_Sub3) this).anIntArray8901[i_879_] += i_860_;
							((Class528_Sub3) this).anIntArray8902[i_879_] += i_861_;
							((Class528_Sub3) this).anIntArray8931[i_879_] += i_862_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_864_ != null) {
				int i_880_ = is_864_[9] << 4;
				int i_881_ = is_864_[10] << 4;
				int i_882_ = is_864_[11] << 4;
				int i_883_ = is_864_[12] << 4;
				int i_884_ = is_864_[13] << 4;
				int i_885_ = is_864_[14] << 4;
				if (aBool8965) {
					int i_886_ = ((is_864_[0] * anInt8932 + is_864_[3] * anInt8939 + is_864_[6] * anInt8964 + 8192) >> 14);
					int i_887_ = ((is_864_[1] * anInt8932 + is_864_[4] * anInt8939 + is_864_[7] * anInt8964 + 8192) >> 14);
					int i_888_ = ((is_864_[2] * anInt8932 + is_864_[5] * anInt8939 + is_864_[8] * anInt8964 + 8192) >> 14);
					i_886_ += i_883_;
					i_887_ += i_884_;
					i_888_ += i_885_;
					anInt8932 = i_886_;
					anInt8939 = i_887_;
					anInt8964 = i_888_;
					aBool8965 = false;
				}
				int[] is_889_ = new int[9];
				int i_890_ = Class382.anIntArray4661[i_860_];
				int i_891_ = Class382.anIntArray4657[i_860_];
				int i_892_ = Class382.anIntArray4661[i_861_];
				int i_893_ = Class382.anIntArray4657[i_861_];
				int i_894_ = Class382.anIntArray4661[i_862_];
				int i_895_ = Class382.anIntArray4657[i_862_];
				int i_896_ = i_891_ * i_894_ + 8192 >> 14;
				int i_897_ = i_891_ * i_895_ + 8192 >> 14;
				is_889_[0] = i_892_ * i_894_ + i_893_ * i_897_ + 8192 >> 14;
				is_889_[1] = -i_892_ * i_895_ + i_893_ * i_896_ + 8192 >> 14;
				is_889_[2] = i_893_ * i_890_ + 8192 >> 14;
				is_889_[3] = i_890_ * i_895_ + 8192 >> 14;
				is_889_[4] = i_890_ * i_894_ + 8192 >> 14;
				is_889_[5] = -i_891_;
				is_889_[6] = -i_893_ * i_894_ + i_892_ * i_897_ + 8192 >> 14;
				is_889_[7] = i_893_ * i_895_ + i_892_ * i_896_ + 8192 >> 14;
				is_889_[8] = i_892_ * i_890_ + 8192 >> 14;
				int i_898_ = (is_889_[0] * -anInt8932 + is_889_[1] * -anInt8939 + is_889_[2] * -anInt8964 + 8192) >> 14;
				int i_899_ = (is_889_[3] * -anInt8932 + is_889_[4] * -anInt8939 + is_889_[5] * -anInt8964 + 8192) >> 14;
				int i_900_ = (is_889_[6] * -anInt8932 + is_889_[7] * -anInt8939 + is_889_[8] * -anInt8964 + 8192) >> 14;
				int i_901_ = i_898_ + anInt8932;
				int i_902_ = i_899_ + anInt8939;
				int i_903_ = i_900_ + anInt8964;
				int[] is_904_ = new int[9];
				for (int i_905_ = 0; i_905_ < 3; i_905_++) {
					for (int i_906_ = 0; i_906_ < 3; i_906_++) {
						int i_907_ = 0;
						for (int i_908_ = 0; i_908_ < 3; i_908_++)
							i_907_ += (is_889_[i_905_ * 3 + i_908_] * is_864_[i_906_ * 3 + i_908_]);
						is_904_[i_905_ * 3 + i_906_] = i_907_ + 8192 >> 14;
					}
				}
				int i_909_ = ((is_889_[0] * i_883_ + is_889_[1] * i_884_ + is_889_[2] * i_885_ + 8192) >> 14);
				int i_910_ = ((is_889_[3] * i_883_ + is_889_[4] * i_884_ + is_889_[5] * i_885_ + 8192) >> 14);
				int i_911_ = ((is_889_[6] * i_883_ + is_889_[7] * i_884_ + is_889_[8] * i_885_ + 8192) >> 14);
				i_909_ += i_901_;
				i_910_ += i_902_;
				i_911_ += i_903_;
				int[] is_912_ = new int[9];
				for (int i_913_ = 0; i_913_ < 3; i_913_++) {
					for (int i_914_ = 0; i_914_ < 3; i_914_++) {
						int i_915_ = 0;
						for (int i_916_ = 0; i_916_ < 3; i_916_++)
							i_915_ += (is_864_[i_913_ * 3 + i_916_] * is_904_[i_914_ + i_916_ * 3]);
						is_912_[i_913_ * 3 + i_914_] = i_915_ + 8192 >> 14;
					}
				}
				int i_917_ = ((is_864_[0] * i_909_ + is_864_[1] * i_910_ + is_864_[2] * i_911_ + 8192) >> 14);
				int i_918_ = ((is_864_[3] * i_909_ + is_864_[4] * i_910_ + is_864_[5] * i_911_ + 8192) >> 14);
				int i_919_ = ((is_864_[6] * i_909_ + is_864_[7] * i_910_ + is_864_[8] * i_911_ + 8192) >> 14);
				i_917_ += i_880_;
				i_918_ += i_881_;
				i_919_ += i_882_;
				for (int i_920_ = 0; i_920_ < i_865_; i_920_++) {
					int i_921_ = is[i_920_];
					if (i_921_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_922_ = (((Class528_Sub3) this).anIntArrayArray8966[i_921_]);
						for (int i_923_ = 0; i_923_ < is_922_.length; i_923_++) {
							int i_924_ = is_922_[i_923_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_863_ & (((Class528_Sub3) this).aShortArray8905[i_924_])) != 0)) {
								int i_925_ = (is_912_[0] * (((Class528_Sub3) this).anIntArray8901[i_924_]) + is_912_[1] * (((Class528_Sub3) this).anIntArray8902[i_924_]) + is_912_[2] * (((Class528_Sub3) this).anIntArray8931[i_924_]) + 8192) >> 14;
								int i_926_ = (is_912_[3] * (((Class528_Sub3) this).anIntArray8901[i_924_]) + is_912_[4] * (((Class528_Sub3) this).anIntArray8902[i_924_]) + is_912_[5] * (((Class528_Sub3) this).anIntArray8931[i_924_]) + 8192) >> 14;
								int i_927_ = (is_912_[6] * (((Class528_Sub3) this).anIntArray8901[i_924_]) + is_912_[7] * (((Class528_Sub3) this).anIntArray8902[i_924_]) + is_912_[8] * (((Class528_Sub3) this).anIntArray8931[i_924_]) + 8192) >> 14;
								i_925_ += i_917_;
								i_926_ += i_918_;
								i_927_ += i_919_;
								((Class528_Sub3) this).anIntArray8901[i_924_] = i_925_;
								((Class528_Sub3) this).anIntArray8902[i_924_] = i_926_;
								((Class528_Sub3) this).anIntArray8931[i_924_] = i_927_;
							}
						}
					}
				}
			} else {
				for (int i_928_ = 0; i_928_ < i_865_; i_928_++) {
					int i_929_ = is[i_928_];
					if (i_929_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_930_ = (((Class528_Sub3) this).anIntArrayArray8966[i_929_]);
						for (int i_931_ = 0; i_931_ < is_930_.length; i_931_++) {
							int i_932_ = is_930_[i_931_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_863_ & (((Class528_Sub3) this).aShortArray8905[i_932_])) != 0)) {
								((Class528_Sub3) this).anIntArray8901[i_932_] -= anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_932_] -= anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_932_] -= anInt8964;
								if (i_862_ != 0) {
									int i_933_ = Class382.anIntArray4657[i_862_];
									int i_934_ = Class382.anIntArray4661[i_862_];
									int i_935_ = ((((Class528_Sub3) this).anIntArray8902[i_932_]) * i_933_ + (((Class528_Sub3) this).anIntArray8901[i_932_]) * i_934_ + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8902[i_932_] = ((((Class528_Sub3) this).anIntArray8902[i_932_]) * i_934_ - (((Class528_Sub3) this).anIntArray8901[i_932_]) * i_933_ + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8901[i_932_] = i_935_;
								}
								if (i_860_ != 0) {
									int i_936_ = Class382.anIntArray4657[i_860_];
									int i_937_ = Class382.anIntArray4661[i_860_];
									int i_938_ = ((((Class528_Sub3) this).anIntArray8902[i_932_]) * i_937_ - (((Class528_Sub3) this).anIntArray8931[i_932_]) * i_936_ + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8931[i_932_] = ((((Class528_Sub3) this).anIntArray8902[i_932_]) * i_936_ + (((Class528_Sub3) this).anIntArray8931[i_932_]) * i_937_ + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8902[i_932_] = i_938_;
								}
								if (i_861_ != 0) {
									int i_939_ = Class382.anIntArray4657[i_861_];
									int i_940_ = Class382.anIntArray4661[i_861_];
									int i_941_ = ((((Class528_Sub3) this).anIntArray8931[i_932_]) * i_939_ + (((Class528_Sub3) this).anIntArray8901[i_932_]) * i_940_ + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8931[i_932_] = ((((Class528_Sub3) this).anIntArray8931[i_932_]) * i_940_ - (((Class528_Sub3) this).anIntArray8901[i_932_]) * i_939_ + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8901[i_932_] = i_941_;
								}
								((Class528_Sub3) this).anIntArray8901[i_932_] += anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_932_] += anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_932_] += anInt8964;
							}
						}
					}
				}
				if (bool) {
					for (int i_942_ = 0; i_942_ < i_865_; i_942_++) {
						int i_943_ = is[i_942_];
						if (i_943_ < (((Class528_Sub3) this).anIntArrayArray8966).length) {
							int[] is_944_ = (((Class528_Sub3) this).anIntArrayArray8966[i_943_]);
							for (int i_945_ = 0; i_945_ < is_944_.length; i_945_++) {
								int i_946_ = is_944_[i_945_];
								if ((((Class528_Sub3) this).aShortArray8905 == null) || ((i_863_ & (((Class528_Sub3) this).aShortArray8905[i_946_])) != 0)) {
									int i_947_ = (((Class528_Sub3) this).anIntArray8947[i_946_]);
									int i_948_ = (((Class528_Sub3) this).anIntArray8947[i_946_ + 1]);
									for (int i_949_ = i_947_; i_949_ < i_948_; i_949_++) {
										int i_950_ = ((((Class528_Sub3) this).aShortArray8948[i_949_]) - 1);
										if (i_950_ == -1)
											break;
										if (i_862_ != 0) {
											int i_951_ = (Class382.anIntArray4657[i_862_]);
											int i_952_ = (Class382.anIntArray4661[i_862_]);
											int i_953_ = ((((((Class528_Sub3) this).aShortArray8933[i_950_]) * i_951_) + (((Class528_Sub3) this).aShortArray8909[i_950_]) * i_952_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8933[i_950_] = (short) (((((Class528_Sub3) this).aShortArray8933[i_950_]) * i_952_ - (((Class528_Sub3) this).aShortArray8909[i_950_]) * i_951_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8909[i_950_] = (short) i_953_;
										}
										if (i_860_ != 0) {
											int i_954_ = (Class382.anIntArray4657[i_860_]);
											int i_955_ = (Class382.anIntArray4661[i_860_]);
											int i_956_ = ((((((Class528_Sub3) this).aShortArray8933[i_950_]) * i_955_) - (((Class528_Sub3) this).aShortArray8911[i_950_]) * i_954_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8911[i_950_] = (short) (((((Class528_Sub3) this).aShortArray8933[i_950_]) * i_954_ + (((Class528_Sub3) this).aShortArray8911[i_950_]) * i_955_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8933[i_950_] = (short) i_956_;
										}
										if (i_861_ != 0) {
											int i_957_ = (Class382.anIntArray4657[i_861_]);
											int i_958_ = (Class382.anIntArray4661[i_861_]);
											int i_959_ = ((((((Class528_Sub3) this).aShortArray8911[i_950_]) * i_957_) + (((Class528_Sub3) this).aShortArray8909[i_950_]) * i_958_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8911[i_950_] = (short) (((((Class528_Sub3) this).aShortArray8911[i_950_]) * i_958_ - (((Class528_Sub3) this).aShortArray8909[i_950_]) * i_957_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8909[i_950_] = (short) i_959_;
										}
									}
								}
							}
						}
					}
					method14285();
				}
			}
		} else if (i == 3) {
			if (is_864_ != null) {
				int i_960_ = is_864_[9] << 4;
				int i_961_ = is_864_[10] << 4;
				int i_962_ = is_864_[11] << 4;
				int i_963_ = is_864_[12] << 4;
				int i_964_ = is_864_[13] << 4;
				int i_965_ = is_864_[14] << 4;
				if (aBool8965) {
					int i_966_ = ((is_864_[0] * anInt8932 + is_864_[3] * anInt8939 + is_864_[6] * anInt8964 + 8192) >> 14);
					int i_967_ = ((is_864_[1] * anInt8932 + is_864_[4] * anInt8939 + is_864_[7] * anInt8964 + 8192) >> 14);
					int i_968_ = ((is_864_[2] * anInt8932 + is_864_[5] * anInt8939 + is_864_[8] * anInt8964 + 8192) >> 14);
					i_966_ += i_963_;
					i_967_ += i_964_;
					i_968_ += i_965_;
					anInt8932 = i_966_;
					anInt8939 = i_967_;
					anInt8964 = i_968_;
					aBool8965 = false;
				}
				int i_969_ = i_860_ << 15 >> 7;
				int i_970_ = i_861_ << 15 >> 7;
				int i_971_ = i_862_ << 15 >> 7;
				int i_972_ = i_969_ * -anInt8932 + 8192 >> 14;
				int i_973_ = i_970_ * -anInt8939 + 8192 >> 14;
				int i_974_ = i_971_ * -anInt8964 + 8192 >> 14;
				int i_975_ = i_972_ + anInt8932;
				int i_976_ = i_973_ + anInt8939;
				int i_977_ = i_974_ + anInt8964;
				int[] is_978_ = new int[9];
				is_978_[0] = i_969_ * is_864_[0] + 8192 >> 14;
				is_978_[1] = i_969_ * is_864_[3] + 8192 >> 14;
				is_978_[2] = i_969_ * is_864_[6] + 8192 >> 14;
				is_978_[3] = i_970_ * is_864_[1] + 8192 >> 14;
				is_978_[4] = i_970_ * is_864_[4] + 8192 >> 14;
				is_978_[5] = i_970_ * is_864_[7] + 8192 >> 14;
				is_978_[6] = i_971_ * is_864_[2] + 8192 >> 14;
				is_978_[7] = i_971_ * is_864_[5] + 8192 >> 14;
				is_978_[8] = i_971_ * is_864_[8] + 8192 >> 14;
				int i_979_ = i_969_ * i_963_ + 8192 >> 14;
				int i_980_ = i_970_ * i_964_ + 8192 >> 14;
				int i_981_ = i_971_ * i_965_ + 8192 >> 14;
				i_979_ += i_975_;
				i_980_ += i_976_;
				i_981_ += i_977_;
				int[] is_982_ = new int[9];
				for (int i_983_ = 0; i_983_ < 3; i_983_++) {
					for (int i_984_ = 0; i_984_ < 3; i_984_++) {
						int i_985_ = 0;
						for (int i_986_ = 0; i_986_ < 3; i_986_++)
							i_985_ += (is_864_[i_983_ * 3 + i_986_] * is_978_[i_984_ + i_986_ * 3]);
						is_982_[i_983_ * 3 + i_984_] = i_985_ + 8192 >> 14;
					}
				}
				int i_987_ = ((is_864_[0] * i_979_ + is_864_[1] * i_980_ + is_864_[2] * i_981_ + 8192) >> 14);
				int i_988_ = ((is_864_[3] * i_979_ + is_864_[4] * i_980_ + is_864_[5] * i_981_ + 8192) >> 14);
				int i_989_ = ((is_864_[6] * i_979_ + is_864_[7] * i_980_ + is_864_[8] * i_981_ + 8192) >> 14);
				i_987_ += i_960_;
				i_988_ += i_961_;
				i_989_ += i_962_;
				for (int i_990_ = 0; i_990_ < i_865_; i_990_++) {
					int i_991_ = is[i_990_];
					if (i_991_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_992_ = (((Class528_Sub3) this).anIntArrayArray8966[i_991_]);
						for (int i_993_ = 0; i_993_ < is_992_.length; i_993_++) {
							int i_994_ = is_992_[i_993_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_863_ & (((Class528_Sub3) this).aShortArray8905[i_994_])) != 0)) {
								int i_995_ = (is_982_[0] * (((Class528_Sub3) this).anIntArray8901[i_994_]) + is_982_[1] * (((Class528_Sub3) this).anIntArray8902[i_994_]) + is_982_[2] * (((Class528_Sub3) this).anIntArray8931[i_994_]) + 8192) >> 14;
								int i_996_ = (is_982_[3] * (((Class528_Sub3) this).anIntArray8901[i_994_]) + is_982_[4] * (((Class528_Sub3) this).anIntArray8902[i_994_]) + is_982_[5] * (((Class528_Sub3) this).anIntArray8931[i_994_]) + 8192) >> 14;
								int i_997_ = (is_982_[6] * (((Class528_Sub3) this).anIntArray8901[i_994_]) + is_982_[7] * (((Class528_Sub3) this).anIntArray8902[i_994_]) + is_982_[8] * (((Class528_Sub3) this).anIntArray8931[i_994_]) + 8192) >> 14;
								i_995_ += i_987_;
								i_996_ += i_988_;
								i_997_ += i_989_;
								((Class528_Sub3) this).anIntArray8901[i_994_] = i_995_;
								((Class528_Sub3) this).anIntArray8902[i_994_] = i_996_;
								((Class528_Sub3) this).anIntArray8931[i_994_] = i_997_;
							}
						}
					}
				}
			} else {
				for (int i_998_ = 0; i_998_ < i_865_; i_998_++) {
					int i_999_ = is[i_998_];
					if (i_999_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_1000_ = (((Class528_Sub3) this).anIntArrayArray8966[i_999_]);
						for (int i_1001_ = 0; i_1001_ < is_1000_.length; i_1001_++) {
							int i_1002_ = is_1000_[i_1001_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_863_ & (((Class528_Sub3) this).aShortArray8905[i_1002_])) != 0)) {
								((Class528_Sub3) this).anIntArray8901[i_1002_] -= anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_1002_] -= anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_1002_] -= anInt8964;
								((Class528_Sub3) this).anIntArray8901[i_1002_] = (((Class528_Sub3) this).anIntArray8901[i_1002_]) * i_860_ >> 7;
								((Class528_Sub3) this).anIntArray8902[i_1002_] = (((Class528_Sub3) this).anIntArray8902[i_1002_]) * i_861_ >> 7;
								((Class528_Sub3) this).anIntArray8931[i_1002_] = (((Class528_Sub3) this).anIntArray8931[i_1002_]) * i_862_ >> 7;
								((Class528_Sub3) this).anIntArray8901[i_1002_] += anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_1002_] += anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_1002_] += anInt8964;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_1003_ = false;
				for (int i_1004_ = 0; i_1004_ < i_865_; i_1004_++) {
					int i_1005_ = is[i_1004_];
					if (i_1005_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_1006_ = (((Class528_Sub3) this).anIntArrayArray8924[i_1005_]);
						for (int i_1007_ = 0; i_1007_ < is_1006_.length; i_1007_++) {
							int i_1008_ = is_1006_[i_1007_];
							if (((Class528_Sub3) this).aShortArray8925 == null || ((i_863_ & (((Class528_Sub3) this).aShortArray8925[i_1008_])) != 0)) {
								int i_1009_ = (((((Class528_Sub3) this).aByteArray8900[i_1008_]) & 0xff) + i_860_ * 8);
								if (i_1009_ < 0)
									i_1009_ = 0;
								else if (i_1009_ > 255)
									i_1009_ = 255;
								((Class528_Sub3) this).aByteArray8900[i_1008_] = (byte) i_1009_;
							}
						}
						bool_1003_ = bool_1003_ | is_1006_.length > 0;
					}
				}
				if (bool_1003_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_1010_ = 0; i_1010_ < ((Class528_Sub3) this).anInt8951; i_1010_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_1010_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_1010_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
						}
					}
					method14269();
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_1011_ = false;
				for (int i_1012_ = 0; i_1012_ < i_865_; i_1012_++) {
					int i_1013_ = is[i_1012_];
					if (i_1013_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_1014_ = (((Class528_Sub3) this).anIntArrayArray8924[i_1013_]);
						for (int i_1015_ = 0; i_1015_ < is_1014_.length; i_1015_++) {
							int i_1016_ = is_1014_[i_1015_];
							if (((Class528_Sub3) this).aShortArray8925 == null || ((i_863_ & (((Class528_Sub3) this).aShortArray8925[i_1016_])) != 0)) {
								int i_1017_ = ((((Class528_Sub3) this).aShortArray8918[i_1016_]) & 0xffff);
								int i_1018_ = i_1017_ >> 10 & 0x3f;
								int i_1019_ = i_1017_ >> 7 & 0x7;
								int i_1020_ = i_1017_ & 0x7f;
								i_1018_ = i_1018_ + i_860_ & 0x3f;
								i_1019_ += i_861_ / 4;
								if (i_1019_ < 0)
									i_1019_ = 0;
								else if (i_1019_ > 7)
									i_1019_ = 7;
								i_1020_ += i_862_;
								if (i_1020_ < 0)
									i_1020_ = 0;
								else if (i_1020_ > 127)
									i_1020_ = 127;
								((Class528_Sub3) this).aShortArray8918[i_1016_] = (short) (i_1018_ << 10 | i_1019_ << 7 | i_1020_);
							}
						}
						bool_1011_ = bool_1011_ | is_1014_.length > 0;
					}
				}
				if (bool_1011_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_1021_ = 0; i_1021_ < ((Class528_Sub3) this).anInt8951; i_1021_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_1021_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_1021_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff)]) & 0xffffff);
						}
					}
					method14269();
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_1022_ = 0; i_1022_ < i_865_; i_1022_++) {
					int i_1023_ = is[i_1022_];
					if (i_1023_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_1024_ = (((Class528_Sub3) this).anIntArrayArray8954[i_1023_]);
						for (int i_1025_ = 0; i_1025_ < is_1024_.length; i_1025_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_1024_[i_1025_]]);
							((Class65) class65).anInt668 += i_860_;
							((Class65) class65).anInt672 += i_861_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_1026_ = 0; i_1026_ < i_865_; i_1026_++) {
					int i_1027_ = is[i_1026_];
					if (i_1027_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_1028_ = (((Class528_Sub3) this).anIntArrayArray8954[i_1027_]);
						for (int i_1029_ = 0; i_1029_ < is_1028_.length; i_1029_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_1028_[i_1029_]]);
							((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_860_ >> 7;
							((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_861_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_1030_ = 0; i_1030_ < i_865_; i_1030_++) {
					int i_1031_ = is[i_1030_];
					if (i_1031_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_1032_ = (((Class528_Sub3) this).anIntArrayArray8954[i_1031_]);
						for (int i_1033_ = 0; i_1033_ < is_1032_.length; i_1033_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_1032_[i_1033_]]);
							((Class65) class65).anInt673 = (((Class65) class65).anInt673 + i_860_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method11295() {
		if (((Class528_Sub3) this).anInt8906 > 0 && ((Class528_Sub3) this).anInt8963 > 0) {
			method14279();
			method14271();
			method14274();
		}
	}

	boolean bv() {
		if (((Class528_Sub3) this).anIntArrayArray8966 == null)
			return false;
		for (int i = 0; i < ((Class528_Sub3) this).anInt8899; i++) {
			((Class528_Sub3) this).anIntArray8901[i] <<= 4;
			((Class528_Sub3) this).anIntArray8902[i] <<= 4;
			((Class528_Sub3) this).anIntArray8931[i] <<= 4;
		}
		anInt8932 = 0;
		anInt8939 = 0;
		anInt8964 = 0;
		return true;
	}

	void bp() {
		for (int i = 0; i < ((Class528_Sub3) this).anInt8899; i++) {
			((Class528_Sub3) this).anIntArray8901[i] = ((Class528_Sub3) this).anIntArray8901[i] + 7 >> 4;
			((Class528_Sub3) this).anIntArray8902[i] = ((Class528_Sub3) this).anIntArray8902[i] + 7 >> 4;
			((Class528_Sub3) this).anIntArray8931[i] = ((Class528_Sub3) this).anIntArray8931[i] + 7 >> 4;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public void bz(int i) {
		int i_1034_ = Class382.anIntArray4657[i];
		int i_1035_ = Class382.anIntArray4661[i];
		for (int i_1036_ = 0; i_1036_ < ((Class528_Sub3) this).anInt8910; i_1036_++) {
			int i_1037_ = ((((Class528_Sub3) this).anIntArray8931[i_1036_] * i_1034_ + ((Class528_Sub3) this).anIntArray8901[i_1036_] * i_1035_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_1036_] = ((((Class528_Sub3) this).anIntArray8931[i_1036_] * i_1035_ - ((Class528_Sub3) this).anIntArray8901[i_1036_] * i_1034_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_1036_] = i_1037_;
		}
		for (int i_1038_ = 0; i_1038_ < ((Class528_Sub3) this).anInt8906; i_1038_++) {
			int i_1039_ = ((((Class528_Sub3) this).aShortArray8911[i_1038_] * i_1034_ + (((Class528_Sub3) this).aShortArray8909[i_1038_] * i_1035_)) >> 14);
			((Class528_Sub3) this).aShortArray8911[i_1038_] = (short) (((((Class528_Sub3) this).aShortArray8911[i_1038_] * i_1035_) - (((Class528_Sub3) this).aShortArray8909[i_1038_] * i_1034_)) >> 14);
			((Class528_Sub3) this).aShortArray8909[i_1038_] = (short) i_1039_;
		}
		method14268();
		method14285();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public int YA() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8908;
	}

	void bb(int i, int i_1040_, int i_1041_, int i_1042_) {
		if (i == 0) {
			int i_1043_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_1044_ = 0; i_1044_ < ((Class528_Sub3) this).anInt8910; i_1044_++) {
				anInt8932 += ((Class528_Sub3) this).anIntArray8901[i_1044_];
				anInt8939 += ((Class528_Sub3) this).anIntArray8902[i_1044_];
				anInt8964 += ((Class528_Sub3) this).anIntArray8931[i_1044_];
				i_1043_++;
			}
			if (i_1043_ > 0) {
				anInt8932 = anInt8932 / i_1043_ + i_1040_;
				anInt8939 = anInt8939 / i_1043_ + i_1041_;
				anInt8964 = anInt8964 / i_1043_ + i_1042_;
			} else {
				anInt8932 = i_1040_;
				anInt8939 = i_1041_;
				anInt8964 = i_1042_;
			}
		} else if (i == 1) {
			for (int i_1045_ = 0; i_1045_ < ((Class528_Sub3) this).anInt8910; i_1045_++) {
				((Class528_Sub3) this).anIntArray8901[i_1045_] += i_1040_;
				((Class528_Sub3) this).anIntArray8902[i_1045_] += i_1041_;
				((Class528_Sub3) this).anIntArray8931[i_1045_] += i_1042_;
			}
		} else if (i == 2) {
			for (int i_1046_ = 0; i_1046_ < ((Class528_Sub3) this).anInt8910; i_1046_++) {
				((Class528_Sub3) this).anIntArray8901[i_1046_] -= anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1046_] -= anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1046_] -= anInt8964;
				if (i_1042_ != 0) {
					int i_1047_ = Class382.anIntArray4657[i_1042_];
					int i_1048_ = Class382.anIntArray4661[i_1042_];
					int i_1049_ = (((((Class528_Sub3) this).anIntArray8902[i_1046_] * i_1047_) + (((Class528_Sub3) this).anIntArray8901[i_1046_] * i_1048_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8902[i_1046_] = ((((Class528_Sub3) this).anIntArray8902[i_1046_] * i_1048_) - (((Class528_Sub3) this).anIntArray8901[i_1046_] * i_1047_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8901[i_1046_] = i_1049_;
				}
				if (i_1040_ != 0) {
					int i_1050_ = Class382.anIntArray4657[i_1040_];
					int i_1051_ = Class382.anIntArray4661[i_1040_];
					int i_1052_ = (((((Class528_Sub3) this).anIntArray8902[i_1046_] * i_1051_) - (((Class528_Sub3) this).anIntArray8931[i_1046_] * i_1050_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8931[i_1046_] = ((((Class528_Sub3) this).anIntArray8902[i_1046_] * i_1050_) + (((Class528_Sub3) this).anIntArray8931[i_1046_] * i_1051_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8902[i_1046_] = i_1052_;
				}
				if (i_1041_ != 0) {
					int i_1053_ = Class382.anIntArray4657[i_1041_];
					int i_1054_ = Class382.anIntArray4661[i_1041_];
					int i_1055_ = (((((Class528_Sub3) this).anIntArray8931[i_1046_] * i_1053_) + (((Class528_Sub3) this).anIntArray8901[i_1046_] * i_1054_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8931[i_1046_] = ((((Class528_Sub3) this).anIntArray8931[i_1046_] * i_1054_) - (((Class528_Sub3) this).anIntArray8901[i_1046_] * i_1053_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8901[i_1046_] = i_1055_;
				}
				((Class528_Sub3) this).anIntArray8901[i_1046_] += anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1046_] += anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1046_] += anInt8964;
			}
		} else if (i == 3) {
			for (int i_1056_ = 0; i_1056_ < ((Class528_Sub3) this).anInt8910; i_1056_++) {
				((Class528_Sub3) this).anIntArray8901[i_1056_] -= anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1056_] -= anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1056_] -= anInt8964;
				((Class528_Sub3) this).anIntArray8901[i_1056_] = (((Class528_Sub3) this).anIntArray8901[i_1056_] * i_1040_ / 128);
				((Class528_Sub3) this).anIntArray8902[i_1056_] = (((Class528_Sub3) this).anIntArray8902[i_1056_] * i_1041_ / 128);
				((Class528_Sub3) this).anIntArray8931[i_1056_] = (((Class528_Sub3) this).anIntArray8931[i_1056_] * i_1042_ / 128);
				((Class528_Sub3) this).anIntArray8901[i_1056_] += anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1056_] += anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1056_] += anInt8964;
			}
		} else if (i == 5) {
			for (int i_1057_ = 0; i_1057_ < ((Class528_Sub3) this).anInt8916; i_1057_++) {
				int i_1058_ = ((((Class528_Sub3) this).aByteArray8900[i_1057_] & 0xff) + i_1040_ * 8);
				if (i_1058_ < 0)
					i_1058_ = 0;
				else if (i_1058_ > 255)
					i_1058_ = 255;
				((Class528_Sub3) this).aByteArray8900[i_1057_] = (byte) i_1058_;
			}
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_1059_ = 0; i_1059_ < ((Class528_Sub3) this).anInt8951; i_1059_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1059_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1059_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
				}
			}
			method14269();
		} else if (i == 7) {
			for (int i_1060_ = 0; i_1060_ < ((Class528_Sub3) this).anInt8916; i_1060_++) {
				int i_1061_ = ((Class528_Sub3) this).aShortArray8918[i_1060_] & 0xffff;
				int i_1062_ = i_1061_ >> 10 & 0x3f;
				int i_1063_ = i_1061_ >> 7 & 0x7;
				int i_1064_ = i_1061_ & 0x7f;
				i_1062_ = i_1062_ + i_1040_ & 0x3f;
				i_1063_ += i_1041_ / 4;
				if (i_1063_ < 0)
					i_1063_ = 0;
				else if (i_1063_ > 7)
					i_1063_ = 7;
				i_1064_ += i_1042_;
				if (i_1064_ < 0)
					i_1064_ = 0;
				else if (i_1064_ > 127)
					i_1064_ = 127;
				((Class528_Sub3) this).aShortArray8918[i_1060_] = (short) (i_1062_ << 10 | i_1063_ << 7 | i_1064_);
			}
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_1065_ = 0; i_1065_ < ((Class528_Sub3) this).anInt8951; i_1065_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1065_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1065_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
				}
			}
			method14269();
		} else if (i == 8) {
			for (int i_1066_ = 0; i_1066_ < ((Class528_Sub3) this).anInt8951; i_1066_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1066_];
				((Class65) class65).anInt668 += i_1040_;
				((Class65) class65).anInt672 += i_1041_;
			}
		} else if (i == 10) {
			for (int i_1067_ = 0; i_1067_ < ((Class528_Sub3) this).anInt8951; i_1067_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1067_];
				((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_1040_ >> 7;
				((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_1041_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1068_ = 0; i_1068_ < ((Class528_Sub3) this).anInt8951; i_1068_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1068_];
				((Class65) class65).anInt673 = ((Class65) class65).anInt673 + i_1040_ & 0x3fff;
			}
		}
	}

	void bo(int i, int i_1069_, int i_1070_, int i_1071_) {
		if (i == 0) {
			int i_1072_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_1073_ = 0; i_1073_ < ((Class528_Sub3) this).anInt8910; i_1073_++) {
				anInt8932 += ((Class528_Sub3) this).anIntArray8901[i_1073_];
				anInt8939 += ((Class528_Sub3) this).anIntArray8902[i_1073_];
				anInt8964 += ((Class528_Sub3) this).anIntArray8931[i_1073_];
				i_1072_++;
			}
			if (i_1072_ > 0) {
				anInt8932 = anInt8932 / i_1072_ + i_1069_;
				anInt8939 = anInt8939 / i_1072_ + i_1070_;
				anInt8964 = anInt8964 / i_1072_ + i_1071_;
			} else {
				anInt8932 = i_1069_;
				anInt8939 = i_1070_;
				anInt8964 = i_1071_;
			}
		} else if (i == 1) {
			for (int i_1074_ = 0; i_1074_ < ((Class528_Sub3) this).anInt8910; i_1074_++) {
				((Class528_Sub3) this).anIntArray8901[i_1074_] += i_1069_;
				((Class528_Sub3) this).anIntArray8902[i_1074_] += i_1070_;
				((Class528_Sub3) this).anIntArray8931[i_1074_] += i_1071_;
			}
		} else if (i == 2) {
			for (int i_1075_ = 0; i_1075_ < ((Class528_Sub3) this).anInt8910; i_1075_++) {
				((Class528_Sub3) this).anIntArray8901[i_1075_] -= anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1075_] -= anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1075_] -= anInt8964;
				if (i_1071_ != 0) {
					int i_1076_ = Class382.anIntArray4657[i_1071_];
					int i_1077_ = Class382.anIntArray4661[i_1071_];
					int i_1078_ = (((((Class528_Sub3) this).anIntArray8902[i_1075_] * i_1076_) + (((Class528_Sub3) this).anIntArray8901[i_1075_] * i_1077_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8902[i_1075_] = ((((Class528_Sub3) this).anIntArray8902[i_1075_] * i_1077_) - (((Class528_Sub3) this).anIntArray8901[i_1075_] * i_1076_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8901[i_1075_] = i_1078_;
				}
				if (i_1069_ != 0) {
					int i_1079_ = Class382.anIntArray4657[i_1069_];
					int i_1080_ = Class382.anIntArray4661[i_1069_];
					int i_1081_ = (((((Class528_Sub3) this).anIntArray8902[i_1075_] * i_1080_) - (((Class528_Sub3) this).anIntArray8931[i_1075_] * i_1079_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8931[i_1075_] = ((((Class528_Sub3) this).anIntArray8902[i_1075_] * i_1079_) + (((Class528_Sub3) this).anIntArray8931[i_1075_] * i_1080_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8902[i_1075_] = i_1081_;
				}
				if (i_1070_ != 0) {
					int i_1082_ = Class382.anIntArray4657[i_1070_];
					int i_1083_ = Class382.anIntArray4661[i_1070_];
					int i_1084_ = (((((Class528_Sub3) this).anIntArray8931[i_1075_] * i_1082_) + (((Class528_Sub3) this).anIntArray8901[i_1075_] * i_1083_) + 16383) >> 14);
					((Class528_Sub3) this).anIntArray8931[i_1075_] = ((((Class528_Sub3) this).anIntArray8931[i_1075_] * i_1083_) - (((Class528_Sub3) this).anIntArray8901[i_1075_] * i_1082_) + 16383) >> 14;
					((Class528_Sub3) this).anIntArray8901[i_1075_] = i_1084_;
				}
				((Class528_Sub3) this).anIntArray8901[i_1075_] += anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1075_] += anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1075_] += anInt8964;
			}
		} else if (i == 3) {
			for (int i_1085_ = 0; i_1085_ < ((Class528_Sub3) this).anInt8910; i_1085_++) {
				((Class528_Sub3) this).anIntArray8901[i_1085_] -= anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1085_] -= anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1085_] -= anInt8964;
				((Class528_Sub3) this).anIntArray8901[i_1085_] = (((Class528_Sub3) this).anIntArray8901[i_1085_] * i_1069_ / 128);
				((Class528_Sub3) this).anIntArray8902[i_1085_] = (((Class528_Sub3) this).anIntArray8902[i_1085_] * i_1070_ / 128);
				((Class528_Sub3) this).anIntArray8931[i_1085_] = (((Class528_Sub3) this).anIntArray8931[i_1085_] * i_1071_ / 128);
				((Class528_Sub3) this).anIntArray8901[i_1085_] += anInt8932;
				((Class528_Sub3) this).anIntArray8902[i_1085_] += anInt8939;
				((Class528_Sub3) this).anIntArray8931[i_1085_] += anInt8964;
			}
		} else if (i == 5) {
			for (int i_1086_ = 0; i_1086_ < ((Class528_Sub3) this).anInt8916; i_1086_++) {
				int i_1087_ = ((((Class528_Sub3) this).aByteArray8900[i_1086_] & 0xff) + i_1069_ * 8);
				if (i_1087_ < 0)
					i_1087_ = 0;
				else if (i_1087_ > 255)
					i_1087_ = 255;
				((Class528_Sub3) this).aByteArray8900[i_1086_] = (byte) i_1087_;
			}
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_1088_ = 0; i_1088_ < ((Class528_Sub3) this).anInt8951; i_1088_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1088_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1088_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
				}
			}
			method14269();
		} else if (i == 7) {
			for (int i_1089_ = 0; i_1089_ < ((Class528_Sub3) this).anInt8916; i_1089_++) {
				int i_1090_ = ((Class528_Sub3) this).aShortArray8918[i_1089_] & 0xffff;
				int i_1091_ = i_1090_ >> 10 & 0x3f;
				int i_1092_ = i_1090_ >> 7 & 0x7;
				int i_1093_ = i_1090_ & 0x7f;
				i_1091_ = i_1091_ + i_1069_ & 0x3f;
				i_1092_ += i_1070_ / 4;
				if (i_1092_ < 0)
					i_1092_ = 0;
				else if (i_1092_ > 7)
					i_1092_ = 7;
				i_1093_ += i_1071_;
				if (i_1093_ < 0)
					i_1093_ = 0;
				else if (i_1093_ > 127)
					i_1093_ = 127;
				((Class528_Sub3) this).aShortArray8918[i_1089_] = (short) (i_1091_ << 10 | i_1092_ << 7 | i_1093_);
			}
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_1094_ = 0; i_1094_ < ((Class528_Sub3) this).anInt8951; i_1094_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1094_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1094_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
				}
			}
			method14269();
		} else if (i == 8) {
			for (int i_1095_ = 0; i_1095_ < ((Class528_Sub3) this).anInt8951; i_1095_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1095_];
				((Class65) class65).anInt668 += i_1069_;
				((Class65) class65).anInt672 += i_1070_;
			}
		} else if (i == 10) {
			for (int i_1096_ = 0; i_1096_ < ((Class528_Sub3) this).anInt8951; i_1096_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1096_];
				((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_1069_ >> 7;
				((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_1070_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1097_ = 0; i_1097_ < ((Class528_Sub3) this).anInt8951; i_1097_++) {
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1097_];
				((Class65) class65).anInt673 = ((Class65) class65).anInt673 + i_1069_ & 0x3fff;
			}
		}
	}

	static float[] method14286(float[] fs, int i) {
		float[] fs_1098_ = new float[i];
		System.arraycopy(fs, 0, fs_1098_, 0, i);
		return fs_1098_;
	}

	public void method11290(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub3) this).aShortArray8905 != null) {
			Matrix44Var class294_1099_ = class294;
			if (bool) {
				class294_1099_ = ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8713;
				class294_1099_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_1100_ = 0; i_1100_ < ((Class528_Sub3) this).anInt8910; i_1100_++) {
				if ((i & ((Class528_Sub3) this).aShortArray8905[i_1100_]) != 0) {
					class294_1099_.method5226((float) (((Class528_Sub3) this).anIntArray8901[i_1100_]), (float) (((Class528_Sub3) this).anIntArray8902[i_1100_]), (float) (((Class528_Sub3) this).anIntArray8931[i_1100_]), fs);
					((Class528_Sub3) this).anIntArray8901[i_1100_] = (int) fs[0];
					((Class528_Sub3) this).anIntArray8902[i_1100_] = (int) fs[1];
					((Class528_Sub3) this).anIntArray8931[i_1100_] = (int) fs[2];
				}
			}
		}
	}

	public void method11291(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub3) this).aShortArray8905 != null) {
			Matrix44Var class294_1101_ = class294;
			if (bool) {
				class294_1101_ = ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8713;
				class294_1101_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_1102_ = 0; i_1102_ < ((Class528_Sub3) this).anInt8910; i_1102_++) {
				if ((i & ((Class528_Sub3) this).aShortArray8905[i_1102_]) != 0) {
					class294_1101_.method5226((float) (((Class528_Sub3) this).anIntArray8901[i_1102_]), (float) (((Class528_Sub3) this).anIntArray8902[i_1102_]), (float) (((Class528_Sub3) this).anIntArray8931[i_1102_]), fs);
					((Class528_Sub3) this).anIntArray8901[i_1102_] = (int) fs[0];
					((Class528_Sub3) this).anIntArray8902[i_1102_] = (int) fs[1];
					((Class528_Sub3) this).anIntArray8931[i_1102_] = (int) fs[2];
				}
			}
		}
	}

	public int cd() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8943;
	}

	public void method11293(Matrix44Var class294, Class275_Sub5 class275_sub5, int i) {
		if (aClass34_8938 != null)
			aClass34_8938.method841();
		if (((Class528_Sub3) this).anInt8906 != 0) {
			Matrix44Arr class384 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8724);
			Matrix44Arr class384_1103_ = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
			Matrix44Arr class384_1104_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8715);
			class384_1103_.method6522(class294);
			class384_1104_.method6562(class384_1103_);
			class384_1104_.method6523(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass384_8728);
			if (!((Class528_Sub3) this).aBool8937)
				method14281();
			float[] fs = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloatArray8717);
			class384_1103_.method6527(0.0F, (float) ((Class528_Sub3) this).anInt8908, 0.0F, fs);
			float f = fs[0];
			float f_1105_ = fs[1];
			float f_1106_ = fs[2];
			class384_1103_.method6527(0.0F, (float) ((Class528_Sub3) this).anInt8893, 0.0F, fs);
			float f_1107_ = fs[0];
			float f_1108_ = fs[1];
			float f_1109_ = fs[2];
			for (int i_1110_ = 0; i_1110_ < 6; i_1110_++) {
				float[] fs_1111_ = (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloatArrayArray8730[i_1110_]);
				float f_1112_ = (fs_1111_[0] * f + fs_1111_[1] * f_1105_ + fs_1111_[2] * f_1106_ + fs_1111_[3] + (float) ((Class528_Sub3) this).anInt8936);
				float f_1113_ = (fs_1111_[0] * f_1107_ + fs_1111_[1] * f_1108_ + fs_1111_[2] * f_1109_ + fs_1111_[3] + (float) ((Class528_Sub3) this).anInt8936);
				if (f_1112_ < 0.0F && f_1113_ < 0.0F)
					return;
			}
			if (class275_sub5 != null) {
				boolean bool = false;
				boolean bool_1114_ = true;
				int i_1115_ = ((((Class528_Sub3) this).anInt8940 + ((Class528_Sub3) this).anInt8941) >> 1);
				int i_1116_ = ((((Class528_Sub3) this).anInt8942 + ((Class528_Sub3) this).anInt8943) >> 1);
				int i_1117_ = i_1115_;
				int i_1118_ = ((Class528_Sub3) this).anInt8908;
				int i_1119_ = i_1116_;
				float f_1120_ = (class384_1104_.buf[0] * (float) i_1117_ + class384_1104_.buf[4] * (float) i_1118_ + class384_1104_.buf[8] * (float) i_1119_ + class384_1104_.buf[12]);
				float f_1121_ = (class384_1104_.buf[1] * (float) i_1117_ + class384_1104_.buf[5] * (float) i_1118_ + class384_1104_.buf[9] * (float) i_1119_ + class384_1104_.buf[13]);
				float f_1122_ = (class384_1104_.buf[2] * (float) i_1117_ + class384_1104_.buf[6] * (float) i_1118_ + class384_1104_.buf[10] * (float) i_1119_ + class384_1104_.buf[14]);
				float f_1123_ = (class384_1104_.buf[3] * (float) i_1117_ + class384_1104_.buf[7] * (float) i_1118_ + class384_1104_.buf[11] * (float) i_1119_ + class384_1104_.buf[15]);
				if (f_1122_ >= -f_1123_) {
					class275_sub5.anInt7847 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732) * f_1120_ / f_1123_);
					class275_sub5.anInt7848 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734) * f_1121_ / f_1123_);
				} else
					bool = true;
				i_1117_ = i_1115_;
				i_1118_ = ((Class528_Sub3) this).anInt8893;
				i_1119_ = i_1116_;
				float f_1124_ = (class384_1104_.buf[0] * (float) i_1117_ + class384_1104_.buf[4] * (float) i_1118_ + class384_1104_.buf[8] * (float) i_1119_ + class384_1104_.buf[12]);
				float f_1125_ = (class384_1104_.buf[1] * (float) i_1117_ + class384_1104_.buf[5] * (float) i_1118_ + class384_1104_.buf[9] * (float) i_1119_ + class384_1104_.buf[13]);
				float f_1126_ = (class384_1104_.buf[2] * (float) i_1117_ + class384_1104_.buf[6] * (float) i_1118_ + class384_1104_.buf[10] * (float) i_1119_ + class384_1104_.buf[14]);
				float f_1127_ = (class384_1104_.buf[3] * (float) i_1117_ + class384_1104_.buf[7] * (float) i_1118_ + class384_1104_.buf[11] * (float) i_1119_ + class384_1104_.buf[15]);
				if (f_1126_ >= -f_1127_) {
					class275_sub5.anInt7850 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732) * f_1124_ / f_1127_);
					class275_sub5.anInt7846 = (int) ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734) * f_1125_ / f_1127_);
				} else
					bool = true;
				if (bool) {
					if (f_1122_ < -f_1123_ && f_1126_ < -f_1127_)
						bool_1114_ = false;
					else if (f_1122_ < -f_1123_) {
						float f_1128_ = (f_1122_ + f_1123_) / (f_1126_ + f_1127_) - 1.0F;
						float f_1129_ = f_1120_ + f_1128_ * (f_1124_ - f_1120_);
						float f_1130_ = f_1121_ + f_1128_ * (f_1125_ - f_1121_);
						float f_1131_ = f_1123_ + f_1128_ * (f_1127_ - f_1123_);
						class275_sub5.anInt7847 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_1129_ / f_1131_));
						class275_sub5.anInt7848 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_1130_ / f_1131_));
					} else if (f_1126_ < -f_1127_) {
						float f_1132_ = (f_1126_ + f_1127_) / (f_1122_ + f_1123_) - 1.0F;
						float f_1133_ = f_1124_ + f_1132_ * (f_1120_ - f_1124_);
						float f_1134_ = f_1125_ + f_1132_ * (f_1121_ - f_1125_);
						float f_1135_ = f_1127_ + f_1132_ * (f_1123_ - f_1127_);
						class275_sub5.anInt7850 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_1133_ / f_1135_));
						class275_sub5.anInt7846 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_1134_ / f_1135_));
					}
				}
				if (bool_1114_) {
					if (f_1122_ / f_1123_ > f_1126_ / f_1127_) {
						float f_1136_ = (f_1120_ + (class384.buf[0] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[12]);
						float f_1137_ = (f_1123_ + (class384.buf[3] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) - (float) class275_sub5.anInt7847 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_1136_ / f_1137_));
					} else {
						float f_1138_ = (f_1124_ + (class384.buf[0] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[12]);
						float f_1139_ = (f_1127_ + (class384.buf[3] * (float) ((Class528_Sub3) this).anInt8936) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) - (float) class275_sub5.anInt7850 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_1138_ / f_1139_));
					}
					class275_sub5.aBool7849 = true;
				}
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.method14098(i);
			method14278(class294);
			((Class528_Sub3) this).aClass505_Sub2_8917.method14098(0);
			class384_1103_.method6522(class294);
			class384_1103_.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8740);
			method14275(class384_1103_);
		}
	}

	public void method11315(Matrix44Var class294) {
		Matrix44Arr class384 = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
		class384.method6522(class294);
		if (((Class528_Sub3) this).aClass87Array8949 != null) {
			for (int i = 0; i < ((Class528_Sub3) this).aClass87Array8949.length; i++) {
				Class87 class87 = ((Class528_Sub3) this).aClass87Array8949[i];
				Class87 class87_1140_ = class87;
				if (class87.aClass87_835 != null)
					class87_1140_ = class87.aClass87_835;
				class87_1140_.anInt844 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_1140_.anInt841 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_1140_.anInt847 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_1140_.anInt834 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_1140_.anInt843 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_1140_.anInt845 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_1140_.anInt846 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_1140_.anInt840 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_1140_.anInt848 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub3) this).aClass172Array8950 != null) {
			for (int i = 0; i < ((Class528_Sub3) this).aClass172Array8950.length; i++) {
				Class172 class172 = ((Class528_Sub3) this).aClass172Array8950[i];
				Class172 class172_1141_ = class172;
				if (class172.aClass172_2114 != null)
					class172_1141_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Matrix44Arr(class384);
				class172_1141_.anInt2113 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_1141_.anInt2117 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_1141_.anInt2118 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	public void method11294(Matrix44Var class294) {
		Matrix44Arr class384 = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
		class384.method6522(class294);
		if (((Class528_Sub3) this).aClass87Array8949 != null) {
			for (int i = 0; i < ((Class528_Sub3) this).aClass87Array8949.length; i++) {
				Class87 class87 = ((Class528_Sub3) this).aClass87Array8949[i];
				Class87 class87_1142_ = class87;
				if (class87.aClass87_835 != null)
					class87_1142_ = class87.aClass87_835;
				class87_1142_.anInt844 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_1142_.anInt841 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_1142_.anInt847 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt836 * -1572033967])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt836 * -1572033967)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_1142_.anInt834 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_1142_.anInt843 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_1142_.anInt845 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt837 * -1955014451])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt837 * -1955014451)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_1142_.anInt846 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_1142_.anInt840 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_1142_.anInt848 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[class87.anInt838 * -2135413869])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class87.anInt838 * -2135413869)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub3) this).aClass172Array8950 != null) {
			for (int i = 0; i < ((Class528_Sub3) this).aClass172Array8950.length; i++) {
				Class172 class172 = ((Class528_Sub3) this).aClass172Array8950[i];
				Class172 class172_1143_ = class172;
				if (class172.aClass172_2114 != null)
					class172_1143_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Matrix44Arr(class384);
				class172_1143_.anInt2113 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[4] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[8] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_1143_.anInt2117 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[5] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[9] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_1143_.anInt2118 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub3) this).anIntArray8901[(class172.anInt2119 * -1382123871)])) + (class384.buf[6] * (float) (((Class528_Sub3) this).anIntArray8902[(class172.anInt2119 * -1382123871)])) + (class384.buf[10] * (float) (((Class528_Sub3) this).anIntArray8931[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	public int cv() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8940;
	}

	public int Z() {
		return ((Class528_Sub3) this).aShort8898;
	}

	public int cc() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8940;
	}

	public void S(int i) {
		int i_1144_ = Class382.anIntArray4657[i];
		int i_1145_ = Class382.anIntArray4661[i];
		for (int i_1146_ = 0; i_1146_ < ((Class528_Sub3) this).anInt8910; i_1146_++) {
			int i_1147_ = ((((Class528_Sub3) this).anIntArray8931[i_1146_] * i_1144_ + ((Class528_Sub3) this).anIntArray8901[i_1146_] * i_1145_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_1146_] = ((((Class528_Sub3) this).anIntArray8931[i_1146_] * i_1145_ - ((Class528_Sub3) this).anIntArray8901[i_1146_] * i_1144_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_1146_] = i_1147_;
		}
		for (int i_1148_ = 0; i_1148_ < ((Class528_Sub3) this).anInt8906; i_1148_++) {
			int i_1149_ = ((((Class528_Sub3) this).aShortArray8911[i_1148_] * i_1144_ + (((Class528_Sub3) this).aShortArray8909[i_1148_] * i_1145_)) >> 14);
			((Class528_Sub3) this).aShortArray8911[i_1148_] = (short) (((((Class528_Sub3) this).aShortArray8911[i_1148_] * i_1145_) - (((Class528_Sub3) this).aShortArray8909[i_1148_] * i_1144_)) >> 14);
			((Class528_Sub3) this).aShortArray8909[i_1148_] = (short) i_1149_;
		}
		method14268();
		method14285();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public int m() {
		return ((Class528_Sub3) this).anInt8895;
	}

	public void method11263(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub3) this).aShortArray8905 != null) {
			Matrix44Var class294_1150_ = class294;
			if (bool) {
				class294_1150_ = ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8713;
				class294_1150_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_1151_ = 0; i_1151_ < ((Class528_Sub3) this).anInt8910; i_1151_++) {
				if ((i & ((Class528_Sub3) this).aShortArray8905[i_1151_]) != 0) {
					class294_1150_.method5226((float) (((Class528_Sub3) this).anIntArray8901[i_1151_]), (float) (((Class528_Sub3) this).anIntArray8902[i_1151_]), (float) (((Class528_Sub3) this).anIntArray8931[i_1151_]), fs);
					((Class528_Sub3) this).anIntArray8901[i_1151_] = (int) fs[0];
					((Class528_Sub3) this).anIntArray8902[i_1151_] = (int) fs[1];
					((Class528_Sub3) this).anIntArray8931[i_1151_] = (int) fs[2];
				}
			}
		}
	}

	public int cb() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8908;
	}

	public int ha() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8943;
	}

	static float[] method14287(float[] fs, int i) {
		float[] fs_1152_ = new float[i];
		System.arraycopy(fs, 0, fs_1152_, 0, i);
		return fs_1152_;
	}

	public int ca() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8908;
	}

	public int ck() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8942;
	}

	Class528_Sub3(Class505_Sub2 class505_sub2, int i, int i_1153_, boolean bool, boolean bool_1154_) {
		((Class528_Sub3) this).anInt8906 = 0;
		((Class528_Sub3) this).anInt8916 = 0;
		((Class528_Sub3) this).anInt8963 = 0;
		((Class528_Sub3) this).aBool8904 = false;
		((Class528_Sub3) this).aBool8919 = true;
		((Class528_Sub3) this).aBool8959 = false;
		((Class528_Sub3) this).aBool8903 = false;
		((Class528_Sub3) this).aBool8937 = false;
		((Class528_Sub3) this).aClass505_Sub2_8917 = class505_sub2;
		((Class528_Sub3) this).anInt8895 = i;
		((Class528_Sub3) this).anInt8896 = i_1153_;
		((Class528_Sub3) this).aBool8904 = bool_1154_;
		if (bool || Class50.method990(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).aClass63_8927 = new Class63(Class50.method995((((Class528_Sub3) this).anInt8895), (((Class528_Sub3) this).anInt8896)));
		if (bool || Class50.method993(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).aClass63_8930 = new Class63(Class50.method1056((((Class528_Sub3) this).anInt8895), (((Class528_Sub3) this).anInt8896)));
		if (bool || Class50.method1059(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).aClass63_8913 = new Class63(Class50.method1051((((Class528_Sub3) this).anInt8895), (((Class528_Sub3) this).anInt8896)));
		if (bool || Class50.method983(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).aClass63_8929 = new Class63(Class50.method1020((((Class528_Sub3) this).anInt8895), (((Class528_Sub3) this).anInt8896)));
		if (bool || Class50.method1043(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) this).aClass39_8926 = new Class39(Class50.method999((((Class528_Sub3) this).anInt8895), (((Class528_Sub3) this).anInt8896)));
		if (bool && bool_1154_) {
			((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664 = ((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664 = ((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664 = ((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664 = ((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
		}
	}

	public void bj(int i) {
		int i_1155_ = Class382.anIntArray4657[i];
		int i_1156_ = Class382.anIntArray4661[i];
		for (int i_1157_ = 0; i_1157_ < ((Class528_Sub3) this).anInt8910; i_1157_++) {
			int i_1158_ = ((((Class528_Sub3) this).anIntArray8931[i_1157_] * i_1155_ + ((Class528_Sub3) this).anIntArray8901[i_1157_] * i_1156_) >> 14);
			((Class528_Sub3) this).anIntArray8931[i_1157_] = ((((Class528_Sub3) this).anIntArray8931[i_1157_] * i_1156_ - ((Class528_Sub3) this).anIntArray8901[i_1157_] * i_1155_) >> 14);
			((Class528_Sub3) this).anIntArray8901[i_1157_] = i_1158_;
		}
		for (int i_1159_ = 0; i_1159_ < ((Class528_Sub3) this).anInt8906; i_1159_++) {
			int i_1160_ = ((((Class528_Sub3) this).aShortArray8911[i_1159_] * i_1155_ + (((Class528_Sub3) this).aShortArray8909[i_1159_] * i_1156_)) >> 14);
			((Class528_Sub3) this).aShortArray8911[i_1159_] = (short) (((((Class528_Sub3) this).aShortArray8911[i_1159_] * i_1156_) - (((Class528_Sub3) this).aShortArray8909[i_1159_] * i_1155_)) >> 14);
			((Class528_Sub3) this).aShortArray8909[i_1159_] = (short) i_1160_;
		}
		method14268();
		method14285();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public boolean successful() {
		if (((Class528_Sub3) this).aShortArray8923 == null)
			return true;
		for (int i = 0; i < ((Class528_Sub3) this).aShortArray8923.length; i++) {
			if (((Class528_Sub3) this).aShortArray8923[i] != -1 && !(((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method139(((Class528_Sub3) this).aShortArray8923[i], -675097130)))
				return false;
		}
		return true;
	}

	public int cp() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8940;
	}

	public int ch() {
		return ((Class528_Sub3) this).aShort8898;
	}

	void method14288() {
		int i = 32767;
		int i_1161_ = 32767;
		int i_1162_ = 32767;
		int i_1163_ = -32768;
		int i_1164_ = -32768;
		int i_1165_ = -32768;
		int i_1166_ = 0;
		int i_1167_ = 0;
		for (int i_1168_ = 0; i_1168_ < ((Class528_Sub3) this).anInt8910; i_1168_++) {
			int i_1169_ = ((Class528_Sub3) this).anIntArray8901[i_1168_];
			int i_1170_ = ((Class528_Sub3) this).anIntArray8902[i_1168_];
			int i_1171_ = ((Class528_Sub3) this).anIntArray8931[i_1168_];
			if (i_1169_ < i)
				i = i_1169_;
			if (i_1169_ > i_1163_)
				i_1163_ = i_1169_;
			if (i_1170_ < i_1161_)
				i_1161_ = i_1170_;
			if (i_1170_ > i_1164_)
				i_1164_ = i_1170_;
			if (i_1171_ < i_1162_)
				i_1162_ = i_1171_;
			if (i_1171_ > i_1165_)
				i_1165_ = i_1171_;
			int i_1172_ = i_1169_ * i_1169_ + i_1171_ * i_1171_;
			if (i_1172_ > i_1166_)
				i_1166_ = i_1172_;
			i_1172_ = i_1169_ * i_1169_ + i_1171_ * i_1171_ + i_1170_ * i_1170_;
			if (i_1172_ > i_1167_)
				i_1167_ = i_1172_;
		}
		((Class528_Sub3) this).anInt8940 = i;
		((Class528_Sub3) this).anInt8941 = i_1163_;
		((Class528_Sub3) this).anInt8908 = i_1161_;
		((Class528_Sub3) this).anInt8893 = i_1164_;
		((Class528_Sub3) this).anInt8942 = i_1162_;
		((Class528_Sub3) this).anInt8943 = i_1165_;
		((Class528_Sub3) this).anInt8936 = (int) (Math.sqrt((double) i_1166_) + 0.99);
		((Class528_Sub3) this).anInt8957 = (int) (Math.sqrt((double) i_1167_) + 0.99);
		((Class528_Sub3) this).aBool8937 = true;
	}

	public void cq(short i, short i_1173_) {
		for (int i_1174_ = 0; i_1174_ < ((Class528_Sub3) this).anInt8916; i_1174_++) {
			if (((Class528_Sub3) this).aShortArray8918[i_1174_] == i)
				((Class528_Sub3) this).aShortArray8918[i_1174_] = i_1173_;
		}
		if (((Class528_Sub3) this).aClass56Array8934 != null) {
			for (int i_1175_ = 0; i_1175_ < ((Class528_Sub3) this).anInt8951; i_1175_++) {
				Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1175_];
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1175_];
				((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
			}
		}
		method14269();
	}

	void method14289() {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class528_Sub3) this).aClass63_8927.method1266();
		if (((Class528_Sub3) this).aClass63_8930 != null)
			((Class528_Sub3) this).aClass63_8930.method1266();
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class528_Sub3) this).aClass63_8913.method1266();
		if (((Class528_Sub3) this).aClass63_8929 != null)
			((Class528_Sub3) this).aClass63_8929.method1266();
		if (((Class528_Sub3) this).aClass39_8926 != null)
			((Class528_Sub3) this).aClass39_8926.method863();
	}

	public void cy(int i, int i_1176_, int i_1177_, int i_1178_) {
		for (int i_1179_ = 0; i_1179_ < ((Class528_Sub3) this).anInt8916; i_1179_++) {
			int i_1180_ = ((Class528_Sub3) this).aShortArray8918[i_1179_] & 0xffff;
			int i_1181_ = i_1180_ >> 10 & 0x3f;
			int i_1182_ = i_1180_ >> 7 & 0x7;
			int i_1183_ = i_1180_ & 0x7f;
			if (i != -1)
				i_1181_ += (i - i_1181_) * i_1178_ >> 7;
			if (i_1176_ != -1)
				i_1182_ += (i_1176_ - i_1182_) * i_1178_ >> 7;
			if (i_1177_ != -1)
				i_1183_ += (i_1177_ - i_1183_) * i_1178_ >> 7;
			((Class528_Sub3) this).aShortArray8918[i_1179_] = (short) (i_1181_ << 10 | i_1182_ << 7 | i_1183_);
		}
		if (((Class528_Sub3) this).aClass56Array8934 != null) {
			for (int i_1184_ = 0; i_1184_ < ((Class528_Sub3) this).anInt8951; i_1184_++) {
				Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1184_];
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1184_];
				((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
			}
		}
		method14269();
	}

	public int dd() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8893;
	}

	public Class172[] method11331() {
		return ((Class528_Sub3) this).aClass172Array8950;
	}

	public Class172[] method11283() {
		return ((Class528_Sub3) this).aClass172Array8950;
	}

	public Class172[] method11302() {
		return ((Class528_Sub3) this).aClass172Array8950;
	}

	public boolean method11303() {
		if (((Class528_Sub3) this).aShortArray8923 == null)
			return true;
		for (int i = 0; i < ((Class528_Sub3) this).aShortArray8923.length; i++) {
			if (((Class528_Sub3) this).aShortArray8923[i] != -1 && !(((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method139(((Class528_Sub3) this).aShortArray8923[i], -344240074)))
				return false;
		}
		return true;
	}

	public int AA() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8942;
	}

	boolean bh() {
		if (((Class528_Sub3) this).anIntArrayArray8966 == null)
			return false;
		for (int i = 0; i < ((Class528_Sub3) this).anInt8899; i++) {
			((Class528_Sub3) this).anIntArray8901[i] <<= 4;
			((Class528_Sub3) this).anIntArray8902[i] <<= 4;
			((Class528_Sub3) this).anIntArray8931[i] <<= 4;
		}
		anInt8932 = 0;
		anInt8939 = 0;
		anInt8964 = 0;
		return true;
	}

	public void dk(int i, int i_1185_, int i_1186_) {
		for (int i_1187_ = 0; i_1187_ < ((Class528_Sub3) this).anInt8910; i_1187_++) {
			if (i != 0)
				((Class528_Sub3) this).anIntArray8901[i_1187_] += i;
			if (i_1185_ != 0)
				((Class528_Sub3) this).anIntArray8902[i_1187_] += i_1185_;
			if (i_1186_ != 0)
				((Class528_Sub3) this).anIntArray8931[i_1187_] += i_1186_;
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public int dy() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8936;
	}

	public int dm() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8936;
	}

	public int dp() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8957;
	}

	public int du() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8957;
	}

	int method14290(int i, int i_1188_) {
		i_1188_ = i_1188_ * (i & 0x7f) >> 7;
		if (i_1188_ < 2)
			i_1188_ = 2;
		else if (i_1188_ > 126)
			i_1188_ = 126;
		return (i & 0xff80) + i_1188_;
	}

	public int c() {
		return ((Class528_Sub3) this).aShort8897;
	}

	void e(int i, int[] is, int i_1189_, int i_1190_, int i_1191_, boolean bool, int i_1192_, int[] is_1193_) {
		int i_1194_ = is.length;
		if (i == 0) {
			i_1189_ <<= 4;
			i_1190_ <<= 4;
			i_1191_ <<= 4;
			int i_1195_ = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			for (int i_1196_ = 0; i_1196_ < i_1194_; i_1196_++) {
				int i_1197_ = is[i_1196_];
				if (i_1197_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_1198_ = ((Class528_Sub3) this).anIntArrayArray8966[i_1197_];
					for (int i_1199_ = 0; i_1199_ < is_1198_.length; i_1199_++) {
						int i_1200_ = is_1198_[i_1199_];
						if (((Class528_Sub3) this).aShortArray8905 == null || (i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1200_])) != 0) {
							anInt8932 += (((Class528_Sub3) this).anIntArray8901[i_1200_]);
							anInt8939 += (((Class528_Sub3) this).anIntArray8902[i_1200_]);
							anInt8964 += (((Class528_Sub3) this).anIntArray8931[i_1200_]);
							i_1195_++;
						}
					}
				}
			}
			if (i_1195_ > 0) {
				anInt8932 = anInt8932 / i_1195_ + i_1189_;
				anInt8939 = anInt8939 / i_1195_ + i_1190_;
				anInt8964 = anInt8964 / i_1195_ + i_1191_;
				aBool8965 = true;
			} else {
				anInt8932 = i_1189_;
				anInt8939 = i_1190_;
				anInt8964 = i_1191_;
			}
		} else if (i == 1) {
			if (is_1193_ != null) {
				int i_1201_ = ((is_1193_[0] * i_1189_ + is_1193_[1] * i_1190_ + is_1193_[2] * i_1191_ + 8192) >> 14);
				int i_1202_ = ((is_1193_[3] * i_1189_ + is_1193_[4] * i_1190_ + is_1193_[5] * i_1191_ + 8192) >> 14);
				int i_1203_ = ((is_1193_[6] * i_1189_ + is_1193_[7] * i_1190_ + is_1193_[8] * i_1191_ + 8192) >> 14);
				i_1189_ = i_1201_;
				i_1190_ = i_1202_;
				i_1191_ = i_1203_;
			}
			i_1189_ <<= 4;
			i_1190_ <<= 4;
			i_1191_ <<= 4;
			for (int i_1204_ = 0; i_1204_ < i_1194_; i_1204_++) {
				int i_1205_ = is[i_1204_];
				if (i_1205_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
					int[] is_1206_ = ((Class528_Sub3) this).anIntArrayArray8966[i_1205_];
					for (int i_1207_ = 0; i_1207_ < is_1206_.length; i_1207_++) {
						int i_1208_ = is_1206_[i_1207_];
						if (((Class528_Sub3) this).aShortArray8905 == null || (i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1208_])) != 0) {
							((Class528_Sub3) this).anIntArray8901[i_1208_] += i_1189_;
							((Class528_Sub3) this).anIntArray8902[i_1208_] += i_1190_;
							((Class528_Sub3) this).anIntArray8931[i_1208_] += i_1191_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1193_ != null) {
				int i_1209_ = is_1193_[9] << 4;
				int i_1210_ = is_1193_[10] << 4;
				int i_1211_ = is_1193_[11] << 4;
				int i_1212_ = is_1193_[12] << 4;
				int i_1213_ = is_1193_[13] << 4;
				int i_1214_ = is_1193_[14] << 4;
				if (aBool8965) {
					int i_1215_ = ((is_1193_[0] * anInt8932 + is_1193_[3] * anInt8939 + is_1193_[6] * anInt8964 + 8192) >> 14);
					int i_1216_ = ((is_1193_[1] * anInt8932 + is_1193_[4] * anInt8939 + is_1193_[7] * anInt8964 + 8192) >> 14);
					int i_1217_ = ((is_1193_[2] * anInt8932 + is_1193_[5] * anInt8939 + is_1193_[8] * anInt8964 + 8192) >> 14);
					i_1215_ += i_1212_;
					i_1216_ += i_1213_;
					i_1217_ += i_1214_;
					anInt8932 = i_1215_;
					anInt8939 = i_1216_;
					anInt8964 = i_1217_;
					aBool8965 = false;
				}
				int[] is_1218_ = new int[9];
				int i_1219_ = Class382.anIntArray4661[i_1189_];
				int i_1220_ = Class382.anIntArray4657[i_1189_];
				int i_1221_ = Class382.anIntArray4661[i_1190_];
				int i_1222_ = Class382.anIntArray4657[i_1190_];
				int i_1223_ = Class382.anIntArray4661[i_1191_];
				int i_1224_ = Class382.anIntArray4657[i_1191_];
				int i_1225_ = i_1220_ * i_1223_ + 8192 >> 14;
				int i_1226_ = i_1220_ * i_1224_ + 8192 >> 14;
				is_1218_[0] = i_1221_ * i_1223_ + i_1222_ * i_1226_ + 8192 >> 14;
				is_1218_[1] = -i_1221_ * i_1224_ + i_1222_ * i_1225_ + 8192 >> 14;
				is_1218_[2] = i_1222_ * i_1219_ + 8192 >> 14;
				is_1218_[3] = i_1219_ * i_1224_ + 8192 >> 14;
				is_1218_[4] = i_1219_ * i_1223_ + 8192 >> 14;
				is_1218_[5] = -i_1220_;
				is_1218_[6] = -i_1222_ * i_1223_ + i_1221_ * i_1226_ + 8192 >> 14;
				is_1218_[7] = i_1222_ * i_1224_ + i_1221_ * i_1225_ + 8192 >> 14;
				is_1218_[8] = i_1221_ * i_1219_ + 8192 >> 14;
				int i_1227_ = ((is_1218_[0] * -anInt8932 + is_1218_[1] * -anInt8939 + is_1218_[2] * -anInt8964 + 8192) >> 14);
				int i_1228_ = ((is_1218_[3] * -anInt8932 + is_1218_[4] * -anInt8939 + is_1218_[5] * -anInt8964 + 8192) >> 14);
				int i_1229_ = ((is_1218_[6] * -anInt8932 + is_1218_[7] * -anInt8939 + is_1218_[8] * -anInt8964 + 8192) >> 14);
				int i_1230_ = i_1227_ + anInt8932;
				int i_1231_ = i_1228_ + anInt8939;
				int i_1232_ = i_1229_ + anInt8964;
				int[] is_1233_ = new int[9];
				for (int i_1234_ = 0; i_1234_ < 3; i_1234_++) {
					for (int i_1235_ = 0; i_1235_ < 3; i_1235_++) {
						int i_1236_ = 0;
						for (int i_1237_ = 0; i_1237_ < 3; i_1237_++)
							i_1236_ += (is_1218_[i_1234_ * 3 + i_1237_] * is_1193_[i_1235_ * 3 + i_1237_]);
						is_1233_[i_1234_ * 3 + i_1235_] = i_1236_ + 8192 >> 14;
					}
				}
				int i_1238_ = ((is_1218_[0] * i_1212_ + is_1218_[1] * i_1213_ + is_1218_[2] * i_1214_ + 8192) >> 14);
				int i_1239_ = ((is_1218_[3] * i_1212_ + is_1218_[4] * i_1213_ + is_1218_[5] * i_1214_ + 8192) >> 14);
				int i_1240_ = ((is_1218_[6] * i_1212_ + is_1218_[7] * i_1213_ + is_1218_[8] * i_1214_ + 8192) >> 14);
				i_1238_ += i_1230_;
				i_1239_ += i_1231_;
				i_1240_ += i_1232_;
				int[] is_1241_ = new int[9];
				for (int i_1242_ = 0; i_1242_ < 3; i_1242_++) {
					for (int i_1243_ = 0; i_1243_ < 3; i_1243_++) {
						int i_1244_ = 0;
						for (int i_1245_ = 0; i_1245_ < 3; i_1245_++)
							i_1244_ += (is_1193_[i_1242_ * 3 + i_1245_] * is_1233_[i_1243_ + i_1245_ * 3]);
						is_1241_[i_1242_ * 3 + i_1243_] = i_1244_ + 8192 >> 14;
					}
				}
				int i_1246_ = ((is_1193_[0] * i_1238_ + is_1193_[1] * i_1239_ + is_1193_[2] * i_1240_ + 8192) >> 14);
				int i_1247_ = ((is_1193_[3] * i_1238_ + is_1193_[4] * i_1239_ + is_1193_[5] * i_1240_ + 8192) >> 14);
				int i_1248_ = ((is_1193_[6] * i_1238_ + is_1193_[7] * i_1239_ + is_1193_[8] * i_1240_ + 8192) >> 14);
				i_1246_ += i_1209_;
				i_1247_ += i_1210_;
				i_1248_ += i_1211_;
				for (int i_1249_ = 0; i_1249_ < i_1194_; i_1249_++) {
					int i_1250_ = is[i_1249_];
					if (i_1250_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_1251_ = (((Class528_Sub3) this).anIntArrayArray8966[i_1250_]);
						for (int i_1252_ = 0; i_1252_ < is_1251_.length; i_1252_++) {
							int i_1253_ = is_1251_[i_1252_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1253_])) != 0)) {
								int i_1254_ = (is_1241_[0] * (((Class528_Sub3) this).anIntArray8901[i_1253_]) + is_1241_[1] * (((Class528_Sub3) this).anIntArray8902[i_1253_]) + is_1241_[2] * (((Class528_Sub3) this).anIntArray8931[i_1253_]) + 8192) >> 14;
								int i_1255_ = (is_1241_[3] * (((Class528_Sub3) this).anIntArray8901[i_1253_]) + is_1241_[4] * (((Class528_Sub3) this).anIntArray8902[i_1253_]) + is_1241_[5] * (((Class528_Sub3) this).anIntArray8931[i_1253_]) + 8192) >> 14;
								int i_1256_ = (is_1241_[6] * (((Class528_Sub3) this).anIntArray8901[i_1253_]) + is_1241_[7] * (((Class528_Sub3) this).anIntArray8902[i_1253_]) + is_1241_[8] * (((Class528_Sub3) this).anIntArray8931[i_1253_]) + 8192) >> 14;
								i_1254_ += i_1246_;
								i_1255_ += i_1247_;
								i_1256_ += i_1248_;
								((Class528_Sub3) this).anIntArray8901[i_1253_] = i_1254_;
								((Class528_Sub3) this).anIntArray8902[i_1253_] = i_1255_;
								((Class528_Sub3) this).anIntArray8931[i_1253_] = i_1256_;
							}
						}
					}
				}
			} else {
				for (int i_1257_ = 0; i_1257_ < i_1194_; i_1257_++) {
					int i_1258_ = is[i_1257_];
					if (i_1258_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_1259_ = (((Class528_Sub3) this).anIntArrayArray8966[i_1258_]);
						for (int i_1260_ = 0; i_1260_ < is_1259_.length; i_1260_++) {
							int i_1261_ = is_1259_[i_1260_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1261_])) != 0)) {
								((Class528_Sub3) this).anIntArray8901[i_1261_] -= anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_1261_] -= anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_1261_] -= anInt8964;
								if (i_1191_ != 0) {
									int i_1262_ = Class382.anIntArray4657[i_1191_];
									int i_1263_ = Class382.anIntArray4661[i_1191_];
									int i_1264_ = ((((Class528_Sub3) this).anIntArray8902[i_1261_]) * i_1262_ + ((((Class528_Sub3) this).anIntArray8901[i_1261_]) * i_1263_) + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8902[i_1261_] = ((((Class528_Sub3) this).anIntArray8902[i_1261_]) * i_1263_ - ((((Class528_Sub3) this).anIntArray8901[i_1261_]) * i_1262_) + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8901[i_1261_] = i_1264_;
								}
								if (i_1189_ != 0) {
									int i_1265_ = Class382.anIntArray4657[i_1189_];
									int i_1266_ = Class382.anIntArray4661[i_1189_];
									int i_1267_ = ((((Class528_Sub3) this).anIntArray8902[i_1261_]) * i_1266_ - ((((Class528_Sub3) this).anIntArray8931[i_1261_]) * i_1265_) + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8931[i_1261_] = ((((Class528_Sub3) this).anIntArray8902[i_1261_]) * i_1265_ + ((((Class528_Sub3) this).anIntArray8931[i_1261_]) * i_1266_) + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8902[i_1261_] = i_1267_;
								}
								if (i_1190_ != 0) {
									int i_1268_ = Class382.anIntArray4657[i_1190_];
									int i_1269_ = Class382.anIntArray4661[i_1190_];
									int i_1270_ = ((((Class528_Sub3) this).anIntArray8931[i_1261_]) * i_1268_ + ((((Class528_Sub3) this).anIntArray8901[i_1261_]) * i_1269_) + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8931[i_1261_] = ((((Class528_Sub3) this).anIntArray8931[i_1261_]) * i_1269_ - ((((Class528_Sub3) this).anIntArray8901[i_1261_]) * i_1268_) + 16383) >> 14;
									((Class528_Sub3) this).anIntArray8901[i_1261_] = i_1270_;
								}
								((Class528_Sub3) this).anIntArray8901[i_1261_] += anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_1261_] += anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_1261_] += anInt8964;
							}
						}
					}
				}
				if (bool) {
					for (int i_1271_ = 0; i_1271_ < i_1194_; i_1271_++) {
						int i_1272_ = is[i_1271_];
						if (i_1272_ < (((Class528_Sub3) this).anIntArrayArray8966).length) {
							int[] is_1273_ = (((Class528_Sub3) this).anIntArrayArray8966[i_1272_]);
							for (int i_1274_ = 0; i_1274_ < is_1273_.length; i_1274_++) {
								int i_1275_ = is_1273_[i_1274_];
								if ((((Class528_Sub3) this).aShortArray8905 == null) || ((i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1275_])) != 0)) {
									int i_1276_ = (((Class528_Sub3) this).anIntArray8947[i_1275_]);
									int i_1277_ = (((Class528_Sub3) this).anIntArray8947[i_1275_ + 1]);
									for (int i_1278_ = i_1276_; i_1278_ < i_1277_; i_1278_++) {
										int i_1279_ = ((((Class528_Sub3) this).aShortArray8948[i_1278_]) - 1);
										if (i_1279_ == -1)
											break;
										if (i_1191_ != 0) {
											int i_1280_ = (Class382.anIntArray4657[i_1191_]);
											int i_1281_ = (Class382.anIntArray4661[i_1191_]);
											int i_1282_ = (((((Class528_Sub3) this).aShortArray8933[i_1279_]) * i_1280_ + (((Class528_Sub3) this).aShortArray8909[i_1279_]) * i_1281_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8933[i_1279_] = (short) ((((((Class528_Sub3) this).aShortArray8933[i_1279_]) * i_1281_) - ((((Class528_Sub3) this).aShortArray8909[i_1279_]) * i_1280_) + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8909[i_1279_] = (short) i_1282_;
										}
										if (i_1189_ != 0) {
											int i_1283_ = (Class382.anIntArray4657[i_1189_]);
											int i_1284_ = (Class382.anIntArray4661[i_1189_]);
											int i_1285_ = (((((Class528_Sub3) this).aShortArray8933[i_1279_]) * i_1284_ - (((Class528_Sub3) this).aShortArray8911[i_1279_]) * i_1283_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8911[i_1279_] = (short) ((((((Class528_Sub3) this).aShortArray8933[i_1279_]) * i_1283_) + ((((Class528_Sub3) this).aShortArray8911[i_1279_]) * i_1284_) + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8933[i_1279_] = (short) i_1285_;
										}
										if (i_1190_ != 0) {
											int i_1286_ = (Class382.anIntArray4657[i_1190_]);
											int i_1287_ = (Class382.anIntArray4661[i_1190_]);
											int i_1288_ = (((((Class528_Sub3) this).aShortArray8911[i_1279_]) * i_1286_ + (((Class528_Sub3) this).aShortArray8909[i_1279_]) * i_1287_ + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8911[i_1279_] = (short) ((((((Class528_Sub3) this).aShortArray8911[i_1279_]) * i_1287_) - ((((Class528_Sub3) this).aShortArray8909[i_1279_]) * i_1286_) + 16383) >> 14);
											((Class528_Sub3) this).aShortArray8909[i_1279_] = (short) i_1288_;
										}
									}
								}
							}
						}
					}
					method14285();
				}
			}
		} else if (i == 3) {
			if (is_1193_ != null) {
				int i_1289_ = is_1193_[9] << 4;
				int i_1290_ = is_1193_[10] << 4;
				int i_1291_ = is_1193_[11] << 4;
				int i_1292_ = is_1193_[12] << 4;
				int i_1293_ = is_1193_[13] << 4;
				int i_1294_ = is_1193_[14] << 4;
				if (aBool8965) {
					int i_1295_ = ((is_1193_[0] * anInt8932 + is_1193_[3] * anInt8939 + is_1193_[6] * anInt8964 + 8192) >> 14);
					int i_1296_ = ((is_1193_[1] * anInt8932 + is_1193_[4] * anInt8939 + is_1193_[7] * anInt8964 + 8192) >> 14);
					int i_1297_ = ((is_1193_[2] * anInt8932 + is_1193_[5] * anInt8939 + is_1193_[8] * anInt8964 + 8192) >> 14);
					i_1295_ += i_1292_;
					i_1296_ += i_1293_;
					i_1297_ += i_1294_;
					anInt8932 = i_1295_;
					anInt8939 = i_1296_;
					anInt8964 = i_1297_;
					aBool8965 = false;
				}
				int i_1298_ = i_1189_ << 15 >> 7;
				int i_1299_ = i_1190_ << 15 >> 7;
				int i_1300_ = i_1191_ << 15 >> 7;
				int i_1301_ = i_1298_ * -anInt8932 + 8192 >> 14;
				int i_1302_ = i_1299_ * -anInt8939 + 8192 >> 14;
				int i_1303_ = i_1300_ * -anInt8964 + 8192 >> 14;
				int i_1304_ = i_1301_ + anInt8932;
				int i_1305_ = i_1302_ + anInt8939;
				int i_1306_ = i_1303_ + anInt8964;
				int[] is_1307_ = new int[9];
				is_1307_[0] = i_1298_ * is_1193_[0] + 8192 >> 14;
				is_1307_[1] = i_1298_ * is_1193_[3] + 8192 >> 14;
				is_1307_[2] = i_1298_ * is_1193_[6] + 8192 >> 14;
				is_1307_[3] = i_1299_ * is_1193_[1] + 8192 >> 14;
				is_1307_[4] = i_1299_ * is_1193_[4] + 8192 >> 14;
				is_1307_[5] = i_1299_ * is_1193_[7] + 8192 >> 14;
				is_1307_[6] = i_1300_ * is_1193_[2] + 8192 >> 14;
				is_1307_[7] = i_1300_ * is_1193_[5] + 8192 >> 14;
				is_1307_[8] = i_1300_ * is_1193_[8] + 8192 >> 14;
				int i_1308_ = i_1298_ * i_1292_ + 8192 >> 14;
				int i_1309_ = i_1299_ * i_1293_ + 8192 >> 14;
				int i_1310_ = i_1300_ * i_1294_ + 8192 >> 14;
				i_1308_ += i_1304_;
				i_1309_ += i_1305_;
				i_1310_ += i_1306_;
				int[] is_1311_ = new int[9];
				for (int i_1312_ = 0; i_1312_ < 3; i_1312_++) {
					for (int i_1313_ = 0; i_1313_ < 3; i_1313_++) {
						int i_1314_ = 0;
						for (int i_1315_ = 0; i_1315_ < 3; i_1315_++)
							i_1314_ += (is_1193_[i_1312_ * 3 + i_1315_] * is_1307_[i_1313_ + i_1315_ * 3]);
						is_1311_[i_1312_ * 3 + i_1313_] = i_1314_ + 8192 >> 14;
					}
				}
				int i_1316_ = ((is_1193_[0] * i_1308_ + is_1193_[1] * i_1309_ + is_1193_[2] * i_1310_ + 8192) >> 14);
				int i_1317_ = ((is_1193_[3] * i_1308_ + is_1193_[4] * i_1309_ + is_1193_[5] * i_1310_ + 8192) >> 14);
				int i_1318_ = ((is_1193_[6] * i_1308_ + is_1193_[7] * i_1309_ + is_1193_[8] * i_1310_ + 8192) >> 14);
				i_1316_ += i_1289_;
				i_1317_ += i_1290_;
				i_1318_ += i_1291_;
				for (int i_1319_ = 0; i_1319_ < i_1194_; i_1319_++) {
					int i_1320_ = is[i_1319_];
					if (i_1320_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_1321_ = (((Class528_Sub3) this).anIntArrayArray8966[i_1320_]);
						for (int i_1322_ = 0; i_1322_ < is_1321_.length; i_1322_++) {
							int i_1323_ = is_1321_[i_1322_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1323_])) != 0)) {
								int i_1324_ = (is_1311_[0] * (((Class528_Sub3) this).anIntArray8901[i_1323_]) + is_1311_[1] * (((Class528_Sub3) this).anIntArray8902[i_1323_]) + is_1311_[2] * (((Class528_Sub3) this).anIntArray8931[i_1323_]) + 8192) >> 14;
								int i_1325_ = (is_1311_[3] * (((Class528_Sub3) this).anIntArray8901[i_1323_]) + is_1311_[4] * (((Class528_Sub3) this).anIntArray8902[i_1323_]) + is_1311_[5] * (((Class528_Sub3) this).anIntArray8931[i_1323_]) + 8192) >> 14;
								int i_1326_ = (is_1311_[6] * (((Class528_Sub3) this).anIntArray8901[i_1323_]) + is_1311_[7] * (((Class528_Sub3) this).anIntArray8902[i_1323_]) + is_1311_[8] * (((Class528_Sub3) this).anIntArray8931[i_1323_]) + 8192) >> 14;
								i_1324_ += i_1316_;
								i_1325_ += i_1317_;
								i_1326_ += i_1318_;
								((Class528_Sub3) this).anIntArray8901[i_1323_] = i_1324_;
								((Class528_Sub3) this).anIntArray8902[i_1323_] = i_1325_;
								((Class528_Sub3) this).anIntArray8931[i_1323_] = i_1326_;
							}
						}
					}
				}
			} else {
				for (int i_1327_ = 0; i_1327_ < i_1194_; i_1327_++) {
					int i_1328_ = is[i_1327_];
					if (i_1328_ < ((Class528_Sub3) this).anIntArrayArray8966.length) {
						int[] is_1329_ = (((Class528_Sub3) this).anIntArrayArray8966[i_1328_]);
						for (int i_1330_ = 0; i_1330_ < is_1329_.length; i_1330_++) {
							int i_1331_ = is_1329_[i_1330_];
							if (((Class528_Sub3) this).aShortArray8905 == null || ((i_1192_ & (((Class528_Sub3) this).aShortArray8905[i_1331_])) != 0)) {
								((Class528_Sub3) this).anIntArray8901[i_1331_] -= anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_1331_] -= anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_1331_] -= anInt8964;
								((Class528_Sub3) this).anIntArray8901[i_1331_] = (((Class528_Sub3) this).anIntArray8901[i_1331_]) * i_1189_ >> 7;
								((Class528_Sub3) this).anIntArray8902[i_1331_] = (((Class528_Sub3) this).anIntArray8902[i_1331_]) * i_1190_ >> 7;
								((Class528_Sub3) this).anIntArray8931[i_1331_] = (((Class528_Sub3) this).anIntArray8931[i_1331_]) * i_1191_ >> 7;
								((Class528_Sub3) this).anIntArray8901[i_1331_] += anInt8932;
								((Class528_Sub3) this).anIntArray8902[i_1331_] += anInt8939;
								((Class528_Sub3) this).anIntArray8931[i_1331_] += anInt8964;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_1332_ = false;
				for (int i_1333_ = 0; i_1333_ < i_1194_; i_1333_++) {
					int i_1334_ = is[i_1333_];
					if (i_1334_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_1335_ = (((Class528_Sub3) this).anIntArrayArray8924[i_1334_]);
						for (int i_1336_ = 0; i_1336_ < is_1335_.length; i_1336_++) {
							int i_1337_ = is_1335_[i_1336_];
							if (((Class528_Sub3) this).aShortArray8925 == null || ((i_1192_ & (((Class528_Sub3) this).aShortArray8925[i_1337_])) != 0)) {
								int i_1338_ = (((((Class528_Sub3) this).aByteArray8900[i_1337_]) & 0xff) + i_1189_ * 8);
								if (i_1338_ < 0)
									i_1338_ = 0;
								else if (i_1338_ > 255)
									i_1338_ = 255;
								((Class528_Sub3) this).aByteArray8900[i_1337_] = (byte) i_1338_;
							}
						}
						bool_1332_ = bool_1332_ | is_1335_.length > 0;
					}
				}
				if (bool_1332_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_1339_ = 0; i_1339_ < ((Class528_Sub3) this).anInt8951; i_1339_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_1339_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_1339_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & 0xffffff | 255 - ((((Class528_Sub3) this).aByteArray8900[((Class56) class56).anInt518]) & 0xff) << 24);
						}
					}
					method14269();
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub3) this).anIntArrayArray8924 != null) {
				boolean bool_1340_ = false;
				for (int i_1341_ = 0; i_1341_ < i_1194_; i_1341_++) {
					int i_1342_ = is[i_1341_];
					if (i_1342_ < ((Class528_Sub3) this).anIntArrayArray8924.length) {
						int[] is_1343_ = (((Class528_Sub3) this).anIntArrayArray8924[i_1342_]);
						for (int i_1344_ = 0; i_1344_ < is_1343_.length; i_1344_++) {
							int i_1345_ = is_1343_[i_1344_];
							if (((Class528_Sub3) this).aShortArray8925 == null || ((i_1192_ & (((Class528_Sub3) this).aShortArray8925[i_1345_])) != 0)) {
								int i_1346_ = ((((Class528_Sub3) this).aShortArray8918[i_1345_]) & 0xffff);
								int i_1347_ = i_1346_ >> 10 & 0x3f;
								int i_1348_ = i_1346_ >> 7 & 0x7;
								int i_1349_ = i_1346_ & 0x7f;
								i_1347_ = i_1347_ + i_1189_ & 0x3f;
								i_1348_ += i_1190_ / 4;
								if (i_1348_ < 0)
									i_1348_ = 0;
								else if (i_1348_ > 7)
									i_1348_ = 7;
								i_1349_ += i_1191_;
								if (i_1349_ < 0)
									i_1349_ = 0;
								else if (i_1349_ > 127)
									i_1349_ = 127;
								((Class528_Sub3) this).aShortArray8918[i_1345_] = (short) (i_1347_ << 10 | i_1348_ << 7 | i_1349_);
							}
						}
						bool_1340_ = bool_1340_ | is_1343_.length > 0;
					}
				}
				if (bool_1340_) {
					if (((Class528_Sub3) this).aClass56Array8934 != null) {
						for (int i_1350_ = 0; i_1350_ < ((Class528_Sub3) this).anInt8951; i_1350_++) {
							Class56 class56 = (((Class528_Sub3) this).aClass56Array8934[i_1350_]);
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[i_1350_]);
							((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff)]) & 0xffffff);
						}
					}
					method14269();
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_1351_ = 0; i_1351_ < i_1194_; i_1351_++) {
					int i_1352_ = is[i_1351_];
					if (i_1352_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_1353_ = (((Class528_Sub3) this).anIntArrayArray8954[i_1352_]);
						for (int i_1354_ = 0; i_1354_ < is_1353_.length; i_1354_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_1353_[i_1354_]]);
							((Class65) class65).anInt668 += i_1189_;
							((Class65) class65).anInt672 += i_1190_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_1355_ = 0; i_1355_ < i_1194_; i_1355_++) {
					int i_1356_ = is[i_1355_];
					if (i_1356_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_1357_ = (((Class528_Sub3) this).anIntArrayArray8954[i_1356_]);
						for (int i_1358_ = 0; i_1358_ < is_1357_.length; i_1358_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_1357_[i_1358_]]);
							((Class65) class65).anInt671 = ((Class65) class65).anInt671 * i_1189_ >> 7;
							((Class65) class65).anInt670 = ((Class65) class65).anInt670 * i_1190_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub3) this).anIntArrayArray8954 != null) {
				for (int i_1359_ = 0; i_1359_ < i_1194_; i_1359_++) {
					int i_1360_ = is[i_1359_];
					if (i_1360_ < ((Class528_Sub3) this).anIntArrayArray8954.length) {
						int[] is_1361_ = (((Class528_Sub3) this).anIntArrayArray8954[i_1360_]);
						for (int i_1362_ = 0; i_1362_ < is_1361_.length; i_1362_++) {
							Class65 class65 = (((Class528_Sub3) this).aClass65Array8953[is_1361_[i_1362_]]);
							((Class65) class65).anInt673 = (((Class65) class65).anInt673 + i_1189_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void df(short i, short i_1363_) {
		Interface22 interface22 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834;
		for (int i_1364_ = 0; i_1364_ < ((Class528_Sub3) this).anInt8916; i_1364_++) {
			if (((Class528_Sub3) this).aShortArray8923[i_1364_] == i)
				((Class528_Sub3) this).aShortArray8923[i_1364_] = i_1363_;
		}
		byte i_1365_ = 0;
		byte i_1366_ = 0;
		if (i != -1) {
			Class169 class169 = interface22.method144(i & 0xffff, -2057176573);
			i_1365_ = class169.aByte2079;
			i_1366_ = class169.aByte2080;
		}
		byte i_1367_ = 0;
		byte i_1368_ = 0;
		if (i_1363_ != -1) {
			Class169 class169 = interface22.method144(i_1363_ & 0xffff, -2063275771);
			i_1367_ = class169.aByte2079;
			i_1368_ = class169.aByte2080;
			if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
				((Class528_Sub3) this).aBool8903 = true;
		}
		if (i_1365_ != i_1367_ | i_1366_ != i_1368_) {
			if (((Class528_Sub3) this).aClass56Array8934 != null) {
				for (int i_1369_ = 0; i_1369_ < ((Class528_Sub3) this).anInt8951; i_1369_++) {
					Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1369_];
					Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1369_];
					((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
				}
			}
			method14269();
		}
	}

	public boolean dv() {
		return ((Class528_Sub3) this).aBool8959;
	}

	void method11308() {
		/* empty */
	}

	void method11301() {
		/* empty */
	}

	public void wa() {
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++)
			((Class528_Sub3) this).anIntArray8931[i] = -((Class528_Sub3) this).anIntArray8931[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++)
			((Class528_Sub3) this).aShortArray8911[i] = (short) -((Class528_Sub3) this).aShortArray8911[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8916; i++) {
			short i_1370_ = ((Class528_Sub3) this).aShortArray8920[i];
			((Class528_Sub3) this).aShortArray8920[i] = ((Class528_Sub3) this).aShortArray8922[i];
			((Class528_Sub3) this).aShortArray8922[i] = i_1370_;
		}
		method14268();
		method14285();
		method14270();
		((Class528_Sub3) this).aBool8937 = false;
	}

	public boolean method11286(int i, int i_1371_, Matrix44Var class294, boolean bool, int i_1372_) {
		Matrix44Arr class384 = ((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683;
		class384.method6522(class294);
		class384.method6523(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8728);
		boolean bool_1373_ = false;
		float f = 3.4028235E38F;
		float f_1374_ = -3.4028235E38F;
		float f_1375_ = 3.4028235E38F;
		float f_1376_ = -3.4028235E38F;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i_1377_ = ((((Class528_Sub3) this).anInt8941 - ((Class528_Sub3) this).anInt8940) >> 1);
		int i_1378_ = ((((Class528_Sub3) this).anInt8893 - ((Class528_Sub3) this).anInt8908) >> 1);
		int i_1379_ = ((((Class528_Sub3) this).anInt8943 - ((Class528_Sub3) this).anInt8942) >> 1);
		int i_1380_ = ((Class528_Sub3) this).anInt8940 + i_1377_;
		int i_1381_ = ((Class528_Sub3) this).anInt8908 + i_1378_;
		int i_1382_ = ((Class528_Sub3) this).anInt8942 + i_1379_;
		int i_1383_ = i_1380_ - (i_1377_ << i_1372_);
		int i_1384_ = i_1381_ - (i_1378_ << i_1372_);
		int i_1385_ = i_1382_ - (i_1379_ << i_1372_);
		int i_1386_ = i_1380_ + (i_1377_ << i_1372_);
		int i_1387_ = i_1381_ + (i_1378_ << i_1372_);
		int i_1388_ = i_1382_ + (i_1379_ << i_1372_);
		anIntArray8894[0] = i_1383_;
		anIntArray8960[0] = i_1384_;
		anIntArray8961[0] = i_1385_;
		anIntArray8894[1] = i_1386_;
		anIntArray8960[1] = i_1384_;
		anIntArray8961[1] = i_1385_;
		anIntArray8894[2] = i_1383_;
		anIntArray8960[2] = i_1387_;
		anIntArray8961[2] = i_1385_;
		anIntArray8894[3] = i_1386_;
		anIntArray8960[3] = i_1387_;
		anIntArray8961[3] = i_1385_;
		anIntArray8894[4] = i_1383_;
		anIntArray8960[4] = i_1384_;
		anIntArray8961[4] = i_1388_;
		anIntArray8894[5] = i_1386_;
		anIntArray8960[5] = i_1384_;
		anIntArray8961[5] = i_1388_;
		anIntArray8894[6] = i_1383_;
		anIntArray8960[6] = i_1387_;
		anIntArray8961[6] = i_1388_;
		anIntArray8894[7] = i_1386_;
		anIntArray8960[7] = i_1387_;
		anIntArray8961[7] = i_1388_;
		for (int i_1389_ = 0; i_1389_ < 8; i_1389_++) {
			float f_1390_ = (float) anIntArray8894[i_1389_];
			float f_1391_ = (float) anIntArray8960[i_1389_];
			float f_1392_ = (float) anIntArray8961[i_1389_];
			float f_1393_ = (class384.buf[2] * f_1390_ + class384.buf[6] * f_1391_ + class384.buf[10] * f_1392_ + class384.buf[14]);
			float f_1394_ = (class384.buf[3] * f_1390_ + class384.buf[7] * f_1391_ + class384.buf[11] * f_1392_ + class384.buf[15]);
			if (f_1393_ >= -f_1394_) {
				float f_1395_ = (class384.buf[0] * f_1390_ + class384.buf[4] * f_1391_ + class384.buf[8] * f_1392_ + class384.buf[12]);
				float f_1396_ = (class384.buf[1] * f_1390_ + class384.buf[5] * f_1391_ + class384.buf[9] * f_1392_ + class384.buf[13]);
				float f_1397_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8797 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_1395_ / f_1394_));
				float f_1398_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aFloat8741 + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_1396_ / f_1394_));
				if (f_1397_ < f)
					f = f_1397_;
				if (f_1397_ > f_1374_)
					f_1374_ = f_1397_;
				if (f_1398_ < f_1375_)
					f_1375_ = f_1398_;
				if (f_1398_ > f_1376_)
					f_1376_ = f_1398_;
				bool_1373_ = true;
			}
		}
		if (bool_1373_ && (float) i > f && (float) i < f_1374_ && (float) i_1371_ > f_1375_ && (float) i_1371_ < f_1376_) {
			if (bool)
				return true;
			if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
				anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
				anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
			}
			for (int i_1399_ = 0; i_1399_ < ((Class528_Sub3) this).anInt8910; i_1399_++) {
				float f_1400_ = (float) ((Class528_Sub3) this).anIntArray8901[i_1399_];
				float f_1401_ = (float) ((Class528_Sub3) this).anIntArray8902[i_1399_];
				float f_1402_ = (float) ((Class528_Sub3) this).anIntArray8931[i_1399_];
				float f_1403_ = (class384.buf[2] * f_1400_ + class384.buf[6] * f_1401_ + class384.buf[10] * f_1402_ + class384.buf[14]);
				float f_1404_ = (class384.buf[3] * f_1400_ + class384.buf[7] * f_1401_ + class384.buf[11] * f_1402_ + class384.buf[15]);
				if (f_1403_ >= -f_1404_) {
					float f_1405_ = (class384.buf[0] * f_1400_ + class384.buf[4] * f_1401_ + class384.buf[8] * f_1402_ + class384.buf[12]);
					float f_1406_ = (class384.buf[1] * f_1400_ + class384.buf[5] * f_1401_ + class384.buf[9] * f_1402_ + class384.buf[13]);
					int i_1407_ = ((Class528_Sub3) this).anIntArray8947[i_1399_];
					int i_1408_ = ((Class528_Sub3) this).anIntArray8947[i_1399_ + 1];
					for (int i_1409_ = i_1407_; i_1409_ < i_1408_; i_1409_++) {
						int i_1410_ = (((Class528_Sub3) this).aShortArray8948[i_1409_] - 1);
						if (i_1410_ == -1)
							break;
						anIntArray8928[i_1410_] = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8797) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8732 * f_1405_ / f_1404_));
						anIntArray8958[i_1410_] = (int) ((((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8741) + (((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aFloat8734 * f_1406_ / f_1404_));
					}
				} else {
					int i_1411_ = ((Class528_Sub3) this).anIntArray8947[i_1399_];
					int i_1412_ = ((Class528_Sub3) this).anIntArray8947[i_1399_ + 1];
					for (int i_1413_ = i_1411_; i_1413_ < i_1412_; i_1413_++) {
						int i_1414_ = (((Class528_Sub3) this).aShortArray8948[i_1413_] - 1);
						if (i_1414_ == -1)
							break;
						anIntArray8928[(((Class528_Sub3) this).aShortArray8948[i_1413_]) - 1] = -999999;
					}
				}
			}
			for (int i_1415_ = 0; i_1415_ < ((Class528_Sub3) this).anInt8916; i_1415_++) {
				if (anIntArray8928[(((Class528_Sub3) this).aShortArray8920[i_1415_])] != -999999 && anIntArray8928[(((Class528_Sub3) this).aShortArray8921[i_1415_])] != -999999 && anIntArray8928[(((Class528_Sub3) this).aShortArray8922[i_1415_])] != -999999
						&& method14276(i, i_1371_, anIntArray8958[(((Class528_Sub3) this).aShortArray8920[i_1415_])], anIntArray8958[(((Class528_Sub3) this).aShortArray8921[i_1415_])], anIntArray8958[(((Class528_Sub3) this).aShortArray8922[i_1415_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8920[i_1415_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8921[i_1415_])], anIntArray8928[(((Class528_Sub3) this).aShortArray8922[i_1415_])]))
					return true;
			}
		}
		return false;
	}

	public Class282_Sub50_Sub17 dn(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub3) this).anInt8906 == 0)
			return null;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i;
		int i_1416_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) > 0) {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1416_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1416_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1417_;
		int i_1418_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8778) > 0) {
			i_1417_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1418_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i_1417_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1418_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1419_ = i_1416_ - i + 1;
		int i_1420_ = i_1418_ - i_1417_ + 1;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_1421_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_1419_, i_1420_)) {
			class282_sub50_sub17_sub2_1421_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_1421_.method16042();
		} else
			class282_sub50_sub17_sub2_1421_ = new Class282_Sub50_Sub17_Sub2((((Class528_Sub3) this).aClass505_Sub2_8917), i_1419_, i_1420_);
		class282_sub50_sub17_sub2_1421_.method16040(i, i_1417_, i_1416_, i_1418_);
		method14277(class282_sub50_sub17_sub2_1421_);
		return class282_sub50_sub17_sub2_1421_;
	}

	public int ct() {
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		return ((Class528_Sub3) this).anInt8941;
	}

	public Class282_Sub50_Sub17 dw(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub3) this).anInt8906 == 0)
			return null;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i;
		int i_1422_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) > 0) {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1422_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1422_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1423_;
		int i_1424_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8778) > 0) {
			i_1423_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1424_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i_1423_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1424_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1425_ = i_1422_ - i + 1;
		int i_1426_ = i_1424_ - i_1423_ + 1;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_1427_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_1425_, i_1426_)) {
			class282_sub50_sub17_sub2_1427_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_1427_.method16042();
		} else
			class282_sub50_sub17_sub2_1427_ = new Class282_Sub50_Sub17_Sub2((((Class528_Sub3) this).aClass505_Sub2_8917), i_1425_, i_1426_);
		class282_sub50_sub17_sub2_1427_.method16040(i, i_1423_, i_1422_, i_1424_);
		method14277(class282_sub50_sub17_sub2_1427_);
		return class282_sub50_sub17_sub2_1427_;
	}

	public Class282_Sub50_Sub17 dr(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub3) this).anInt8906 == 0)
			return null;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i;
		int i_1428_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) > 0) {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1428_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1428_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1429_;
		int i_1430_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8778) > 0) {
			i_1429_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1430_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i_1429_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1430_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1431_ = i_1428_ - i + 1;
		int i_1432_ = i_1430_ - i_1429_ + 1;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_1433_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_1431_, i_1432_)) {
			class282_sub50_sub17_sub2_1433_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_1433_.method16042();
		} else
			class282_sub50_sub17_sub2_1433_ = new Class282_Sub50_Sub17_Sub2((((Class528_Sub3) this).aClass505_Sub2_8917), i_1431_, i_1432_);
		class282_sub50_sub17_sub2_1433_.method16040(i, i_1429_, i_1428_, i_1430_);
		method14277(class282_sub50_sub17_sub2_1433_);
		return class282_sub50_sub17_sub2_1433_;
	}

	public int dq() {
		return ((Class528_Sub3) this).aShort8897;
	}

	int method14291(int i, short i_1434_, int i_1435_) {
		int i_1436_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anIntArray8803[method14290(i, i_1435_)]);
		if (i_1434_ != -1) {
			Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1434_ & 0xffff, -1890482057);
			int i_1437_ = class169.aByte2079 & 0xff;
			if (i_1437_ != 0) {
				int i_1438_ = 131586 * i_1435_;
				if (i_1437_ == 256)
					i_1436_ = i_1438_;
				else {
					int i_1439_ = i_1437_;
					int i_1440_ = 256 - i_1437_;
					i_1436_ = ((((i_1438_ & 0xff00ff) * i_1439_ + (i_1436_ & 0xff00ff) * i_1440_) & ~0xff00ff) + (((i_1438_ & 0xff00) * i_1439_ + (i_1436_ & 0xff00) * i_1440_) & 0xff0000)) >> 8;
				}
			}
			int i_1441_ = class169.aByte2080 & 0xff;
			if (i_1441_ != 0) {
				i_1441_ += 256;
				int i_1442_ = ((i_1436_ & 0xff0000) >> 16) * i_1441_;
				if (i_1442_ > 65535)
					i_1442_ = 65535;
				int i_1443_ = ((i_1436_ & 0xff00) >> 8) * i_1441_;
				if (i_1443_ > 65535)
					i_1443_ = 65535;
				int i_1444_ = (i_1436_ & 0xff) * i_1441_;
				if (i_1444_ > 65535)
					i_1444_ = 65535;
				i_1436_ = (i_1442_ << 8 & 0xff0000) + (i_1443_ & 0xff00) + (i_1444_ >> 8);
			}
		}
		return i_1436_ & 0xffffff;
	}

	short method14292(RSMesh class157, int i, int i_1445_, long l, int i_1446_, int i_1447_, int i_1448_, int i_1449_, float f, float f_1450_) {
		int i_1451_ = ((Class528_Sub3) this).anIntArray8947[i];
		int i_1452_ = ((Class528_Sub3) this).anIntArray8947[i + 1];
		int i_1453_ = 0;
		for (int i_1454_ = i_1451_; i_1454_ < i_1452_; i_1454_++) {
			short i_1455_ = ((Class528_Sub3) this).aShortArray8948[i_1454_];
			if (i_1455_ == 0) {
				i_1453_ = i_1454_;
				break;
			}
			if (aLongArray8955[i_1454_] == l)
				return (short) (i_1455_ - 1);
		}
		((Class528_Sub3) this).aShortArray8948[i_1453_] = (short) (((Class528_Sub3) this).anInt8906 + 1);
		aLongArray8955[i_1453_] = l;
		((Class528_Sub3) this).aShortArray8945[(((Class528_Sub3) this).anInt8906)] = (short) i_1445_;
		((Class528_Sub3) this).aShortArray8907[(((Class528_Sub3) this).anInt8906)] = (short) i;
		((Class528_Sub3) this).aShortArray8909[(((Class528_Sub3) this).anInt8906)] = (short) i_1446_;
		((Class528_Sub3) this).aShortArray8933[(((Class528_Sub3) this).anInt8906)] = (short) i_1447_;
		((Class528_Sub3) this).aShortArray8911[(((Class528_Sub3) this).anInt8906)] = (short) i_1448_;
		((Class528_Sub3) this).aByteArray8912[((Class528_Sub3) this).anInt8906] = (byte) i_1449_;
		((Class528_Sub3) this).aFloatArray8892[(((Class528_Sub3) this).anInt8906)] = f;
		((Class528_Sub3) this).aFloatArray8914[(((Class528_Sub3) this).anInt8906)] = f_1450_;
		return (short) ((Class528_Sub3) this).anInt8906++;
	}

	public void ep(int i, int i_1456_, int i_1457_) {
		for (int i_1458_ = 0; i_1458_ < ((Class528_Sub3) this).anInt8910; i_1458_++) {
			if (i != 128)
				((Class528_Sub3) this).anIntArray8901[i_1458_] = ((Class528_Sub3) this).anIntArray8901[i_1458_] * i >> 7;
			if (i_1456_ != 128)
				((Class528_Sub3) this).anIntArray8902[i_1458_] = (((Class528_Sub3) this).anIntArray8902[i_1458_] * i_1456_ >> 7);
			if (i_1457_ != 128)
				((Class528_Sub3) this).anIntArray8931[i_1458_] = (((Class528_Sub3) this).anIntArray8931[i_1458_] * i_1457_ >> 7);
		}
		method14268();
		((Class528_Sub3) this).aBool8937 = false;
	}

	static short[] method14293(short[] is, int i) {
		short[] is_1459_ = new short[i];
		System.arraycopy(is, 0, is_1459_, 0, i);
		return is_1459_;
	}

	public byte[] cz() {
		return ((Class528_Sub3) this).aByteArray8900;
	}

	static short[] method14294(short[] is, int i) {
		short[] is_1460_ = new short[i];
		System.arraycopy(is, 0, is_1460_, 0, i);
		return is_1460_;
	}

	static float[] method14295(float[] fs, int i) {
		float[] fs_1461_ = new float[i];
		System.arraycopy(fs, 0, fs_1461_, 0, i);
		return fs_1461_;
	}

	public void method11299(MeshRasterizer class528, int i, int i_1462_, int i_1463_, boolean bool) {
		Class528_Sub3 class528_sub3_1464_ = (Class528_Sub3) class528;
		if (((Class528_Sub3) this).anInt8916 != 0 && ((Class528_Sub3) class528_sub3_1464_).anInt8916 != 0) {
			int i_1465_ = ((Class528_Sub3) class528_sub3_1464_).anInt8910;
			int[] is = ((Class528_Sub3) class528_sub3_1464_).anIntArray8901;
			int[] is_1466_ = ((Class528_Sub3) class528_sub3_1464_).anIntArray8902;
			int[] is_1467_ = ((Class528_Sub3) class528_sub3_1464_).anIntArray8931;
			short[] is_1468_ = ((Class528_Sub3) class528_sub3_1464_).aShortArray8909;
			short[] is_1469_ = ((Class528_Sub3) class528_sub3_1464_).aShortArray8933;
			short[] is_1470_ = ((Class528_Sub3) class528_sub3_1464_).aShortArray8911;
			byte[] is_1471_ = ((Class528_Sub3) class528_sub3_1464_).aByteArray8912;
			short[] is_1472_;
			short[] is_1473_;
			short[] is_1474_;
			byte[] is_1475_;
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				is_1472_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115);
				is_1473_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114);
				is_1474_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113);
				is_1475_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116);
			} else {
				is_1472_ = null;
				is_1473_ = null;
				is_1474_ = null;
				is_1475_ = null;
			}
			short[] is_1476_;
			short[] is_1477_;
			short[] is_1478_;
			byte[] is_1479_;
			if (((Class528_Sub3) class528_sub3_1464_).aClass355_8962 != null) {
				is_1476_ = ((Class355) (((Class528_Sub3) class528_sub3_1464_).aClass355_8962)).aShortArray4115;
				is_1477_ = ((Class355) (((Class528_Sub3) class528_sub3_1464_).aClass355_8962)).aShortArray4114;
				is_1478_ = ((Class355) (((Class528_Sub3) class528_sub3_1464_).aClass355_8962)).aShortArray4113;
				is_1479_ = ((Class355) (((Class528_Sub3) class528_sub3_1464_).aClass355_8962)).aByteArray4116;
			} else {
				is_1476_ = null;
				is_1477_ = null;
				is_1478_ = null;
				is_1479_ = null;
			}
			int[] is_1480_ = ((Class528_Sub3) class528_sub3_1464_).anIntArray8947;
			short[] is_1481_ = ((Class528_Sub3) class528_sub3_1464_).aShortArray8948;
			if (!((Class528_Sub3) class528_sub3_1464_).aBool8937)
				class528_sub3_1464_.method14281();
			int i_1482_ = ((Class528_Sub3) class528_sub3_1464_).anInt8908;
			int i_1483_ = ((Class528_Sub3) class528_sub3_1464_).anInt8893;
			int i_1484_ = ((Class528_Sub3) class528_sub3_1464_).anInt8940;
			int i_1485_ = ((Class528_Sub3) class528_sub3_1464_).anInt8941;
			int i_1486_ = ((Class528_Sub3) class528_sub3_1464_).anInt8942;
			int i_1487_ = ((Class528_Sub3) class528_sub3_1464_).anInt8943;
			for (int i_1488_ = 0; i_1488_ < ((Class528_Sub3) this).anInt8910; i_1488_++) {
				int i_1489_ = ((Class528_Sub3) this).anIntArray8902[i_1488_] - i_1462_;
				if (i_1489_ >= i_1482_ && i_1489_ <= i_1483_) {
					int i_1490_ = ((Class528_Sub3) this).anIntArray8901[i_1488_] - i;
					if (i_1490_ >= i_1484_ && i_1490_ <= i_1485_) {
						int i_1491_ = (((Class528_Sub3) this).anIntArray8931[i_1488_] - i_1463_);
						if (i_1491_ >= i_1486_ && i_1491_ <= i_1487_) {
							int i_1492_ = -1;
							int i_1493_ = (((Class528_Sub3) this).anIntArray8947[i_1488_]);
							int i_1494_ = (((Class528_Sub3) this).anIntArray8947[i_1488_ + 1]);
							for (int i_1495_ = i_1493_; i_1495_ < i_1494_; i_1495_++) {
								i_1492_ = (((Class528_Sub3) this).aShortArray8948[i_1495_]) - 1;
								if (i_1492_ == -1 || (((Class528_Sub3) this).aByteArray8912[i_1492_]) != 0)
									break;
							}
							if (i_1492_ != -1) {
								for (int i_1496_ = 0; i_1496_ < i_1465_; i_1496_++) {
									if (i_1490_ == is[i_1496_] && i_1491_ == is_1467_[i_1496_] && i_1489_ == is_1466_[i_1496_]) {
										int i_1497_ = -1;
										i_1493_ = is_1480_[i_1496_];
										i_1494_ = is_1480_[i_1496_ + 1];
										for (int i_1498_ = i_1493_; i_1498_ < i_1494_; i_1498_++) {
											i_1497_ = is_1481_[i_1498_] - 1;
											if (i_1497_ == -1 || is_1471_[i_1497_] != 0)
												break;
										}
										if (i_1497_ != -1) {
											if (is_1472_ == null) {
												((Class528_Sub3) this).aClass355_8962 = new Class355();
												is_1472_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4115 = (Class512.method8761((((Class528_Sub3) this).aShortArray8909), 699880567));
												is_1473_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4114 = (Class512.method8761((((Class528_Sub3) this).aShortArray8933), 1983225125));
												is_1474_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4113 = (Class512.method8761((((Class528_Sub3) this).aShortArray8911), 1609951623));
												is_1475_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aByteArray4116 = (Class282_Sub50_Sub13.method15090((((Class528_Sub3) this).aByteArray8912), -2147189615));
											}
											if (is_1476_ == null) {
												Class355 class355 = (((Class528_Sub3) class528_sub3_1464_).aClass355_8962 = new Class355());
												is_1476_ = ((Class355) class355).aShortArray4115 = (Class512.method8761(is_1468_, -162528355));
												is_1477_ = ((Class355) class355).aShortArray4114 = (Class512.method8761(is_1469_, -466639398));
												is_1478_ = ((Class355) class355).aShortArray4113 = (Class512.method8761(is_1470_, -502250628));
												is_1479_ = ((Class355) class355).aByteArray4116 = (Class282_Sub50_Sub13.method15090(is_1471_, -2134425269));
											}
											short i_1499_ = (((Class528_Sub3) this).aShortArray8909[i_1492_]);
											short i_1500_ = (((Class528_Sub3) this).aShortArray8933[i_1492_]);
											short i_1501_ = (((Class528_Sub3) this).aShortArray8911[i_1492_]);
											byte i_1502_ = (((Class528_Sub3) this).aByteArray8912[i_1492_]);
											i_1493_ = is_1480_[i_1496_];
											i_1494_ = is_1480_[i_1496_ + 1];
											for (int i_1503_ = i_1493_; i_1503_ < i_1494_; i_1503_++) {
												int i_1504_ = is_1481_[i_1503_] - 1;
												if (i_1504_ == -1)
													break;
												if (is_1479_[i_1504_] != 0) {
													is_1476_[i_1504_] += i_1499_;
													is_1477_[i_1504_] += i_1500_;
													is_1478_[i_1504_] += i_1501_;
													is_1479_[i_1504_] += i_1502_;
												}
											}
											i_1499_ = is_1468_[i_1497_];
											i_1500_ = is_1469_[i_1497_];
											i_1501_ = is_1470_[i_1497_];
											i_1502_ = is_1471_[i_1497_];
											i_1493_ = (((Class528_Sub3) this).anIntArray8947[i_1488_]);
											i_1494_ = (((Class528_Sub3) this).anIntArray8947[i_1488_ + 1]);
											for (int i_1505_ = i_1493_; i_1505_ < i_1494_; i_1505_++) {
												int i_1506_ = ((((Class528_Sub3) this).aShortArray8948[i_1505_]) - 1);
												if (i_1506_ == -1)
													break;
												if (is_1475_[i_1506_] != 0) {
													is_1472_[i_1506_] += i_1499_;
													is_1473_[i_1506_] += i_1500_;
													is_1474_[i_1506_] += i_1501_;
													is_1475_[i_1506_] += i_1502_;
												}
											}
											class528_sub3_1464_.method14285();
											method14285();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	void method14296(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2) {
		if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
			anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
			anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++) {
			int i_1507_ = (((((Class528_Sub3) this).anIntArray8901[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453));
			int i_1508_ = (((((Class528_Sub3) this).anIntArray8931[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455));
			int i_1509_ = ((Class528_Sub3) this).anIntArray8947[i];
			int i_1510_ = ((Class528_Sub3) this).anIntArray8947[i + 1];
			for (int i_1511_ = i_1509_; i_1511_ < i_1510_; i_1511_++) {
				int i_1512_ = ((Class528_Sub3) this).aShortArray8948[i_1511_] - 1;
				if (i_1512_ == -1)
					break;
				anIntArray8928[i_1512_] = i_1507_;
				anIntArray8958[i_1512_] = i_1508_;
			}
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8963; i++) {
			if (((Class528_Sub3) this).aByteArray8900 == null || ((Class528_Sub3) this).aByteArray8900[i] <= 128) {
				short i_1513_ = ((Class528_Sub3) this).aShortArray8920[i];
				short i_1514_ = ((Class528_Sub3) this).aShortArray8921[i];
				short i_1515_ = ((Class528_Sub3) this).aShortArray8922[i];
				int i_1516_ = anIntArray8928[i_1513_];
				int i_1517_ = anIntArray8928[i_1514_];
				int i_1518_ = anIntArray8928[i_1515_];
				int i_1519_ = anIntArray8958[i_1513_];
				int i_1520_ = anIntArray8958[i_1514_];
				int i_1521_ = anIntArray8958[i_1515_];
				if (((i_1516_ - i_1517_) * (i_1520_ - i_1521_) - (i_1520_ - i_1519_) * (i_1518_ - i_1517_)) > 0)
					class282_sub50_sub17_sub2.method16043(i_1519_, i_1520_, i_1521_, i_1516_, i_1517_, i_1518_);
			}
		}
	}

	static float[] method14297(float[] fs, int i) {
		float[] fs_1522_ = new float[i];
		System.arraycopy(fs, 0, fs_1522_, 0, i);
		return fs_1522_;
	}

	MeshRasterizer method14298(Class528_Sub3 class528_sub3_1523_, Class528_Sub3 class528_sub3_1524_, int i, boolean bool, boolean bool_1525_) {
		((Class528_Sub3) class528_sub3_1523_).anInt8895 = i;
		((Class528_Sub3) class528_sub3_1523_).anInt8896 = ((Class528_Sub3) this).anInt8896;
		((Class528_Sub3) class528_sub3_1523_).aShort8897 = ((Class528_Sub3) this).aShort8897;
		((Class528_Sub3) class528_sub3_1523_).aShort8898 = ((Class528_Sub3) this).aShort8898;
		((Class528_Sub3) class528_sub3_1523_).anInt8899 = ((Class528_Sub3) this).anInt8899;
		((Class528_Sub3) class528_sub3_1523_).anInt8910 = ((Class528_Sub3) this).anInt8910;
		((Class528_Sub3) class528_sub3_1523_).anInt8906 = ((Class528_Sub3) this).anInt8906;
		((Class528_Sub3) class528_sub3_1523_).anInt8916 = ((Class528_Sub3) this).anInt8916;
		((Class528_Sub3) class528_sub3_1523_).anInt8963 = ((Class528_Sub3) this).anInt8963;
		((Class528_Sub3) class528_sub3_1523_).anInt8951 = ((Class528_Sub3) this).anInt8951;
		if ((i & 0x100) != 0)
			((Class528_Sub3) class528_sub3_1523_).aBool8959 = true;
		else
			((Class528_Sub3) class528_sub3_1523_).aBool8959 = ((Class528_Sub3) this).aBool8959;
		((Class528_Sub3) class528_sub3_1523_).aBool8903 = ((Class528_Sub3) this).aBool8903;
		boolean bool_1526_ = Class50.method994(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_1527_ = Class50.method979(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_1528_ = Class50.method980(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_1529_ = bool_1526_ | bool_1527_ | bool_1528_;
		if (bool_1529_) {
			if (bool_1526_) {
				if ((((Class528_Sub3) class528_sub3_1524_).anIntArray8901 == null) || ((((Class528_Sub3) class528_sub3_1524_).anIntArray8901).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_1523_).anIntArray8901 = ((Class528_Sub3) class528_sub3_1524_).anIntArray8901 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_1523_).anIntArray8901 = ((Class528_Sub3) class528_sub3_1524_).anIntArray8901;
			} else
				((Class528_Sub3) class528_sub3_1523_).anIntArray8901 = ((Class528_Sub3) this).anIntArray8901;
			if (bool_1527_) {
				if ((((Class528_Sub3) class528_sub3_1524_).anIntArray8902 == null) || ((((Class528_Sub3) class528_sub3_1524_).anIntArray8902).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_1523_).anIntArray8902 = ((Class528_Sub3) class528_sub3_1524_).anIntArray8902 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_1523_).anIntArray8902 = ((Class528_Sub3) class528_sub3_1524_).anIntArray8902;
			} else
				((Class528_Sub3) class528_sub3_1523_).anIntArray8902 = ((Class528_Sub3) this).anIntArray8902;
			if (bool_1528_) {
				if ((((Class528_Sub3) class528_sub3_1524_).anIntArray8931 == null) || ((((Class528_Sub3) class528_sub3_1524_).anIntArray8931).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_1523_).anIntArray8931 = ((Class528_Sub3) class528_sub3_1524_).anIntArray8931 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_1523_).anIntArray8931 = ((Class528_Sub3) class528_sub3_1524_).anIntArray8931;
			} else
				((Class528_Sub3) class528_sub3_1523_).anIntArray8931 = ((Class528_Sub3) this).anIntArray8931;
			for (int i_1530_ = 0; i_1530_ < ((Class528_Sub3) this).anInt8899; i_1530_++) {
				if (bool_1526_)
					((Class528_Sub3) class528_sub3_1523_).anIntArray8901[i_1530_] = ((Class528_Sub3) this).anIntArray8901[i_1530_];
				if (bool_1527_)
					((Class528_Sub3) class528_sub3_1523_).anIntArray8902[i_1530_] = ((Class528_Sub3) this).anIntArray8902[i_1530_];
				if (bool_1528_)
					((Class528_Sub3) class528_sub3_1523_).anIntArray8931[i_1530_] = ((Class528_Sub3) this).anIntArray8931[i_1530_];
			}
		} else {
			((Class528_Sub3) class528_sub3_1523_).anIntArray8901 = ((Class528_Sub3) this).anIntArray8901;
			((Class528_Sub3) class528_sub3_1523_).anIntArray8902 = ((Class528_Sub3) this).anIntArray8902;
			((Class528_Sub3) class528_sub3_1523_).anIntArray8931 = ((Class528_Sub3) this).anIntArray8931;
		}
		if (Class50.method995(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1523_).aClass63_8927 = ((Class528_Sub3) class528_sub3_1524_).aClass63_8927;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8927).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8927).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8927).aBool663 = true;
		} else if (Class50.method990(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1523_).aClass63_8927 = ((Class528_Sub3) this).aClass63_8927;
		else
			((Class528_Sub3) class528_sub3_1523_).aClass63_8927 = null;
		if (Class50.method1022(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aShortArray8918 == null || ((((Class528_Sub3) class528_sub3_1524_).aShortArray8918).length < ((Class528_Sub3) this).anInt8916))
				((Class528_Sub3) class528_sub3_1523_).aShortArray8918 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8918 = new short[((Class528_Sub3) this).anInt8916];
			else
				((Class528_Sub3) class528_sub3_1523_).aShortArray8918 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8918;
			for (int i_1531_ = 0; i_1531_ < ((Class528_Sub3) this).anInt8916; i_1531_++)
				((Class528_Sub3) class528_sub3_1523_).aShortArray8918[i_1531_] = ((Class528_Sub3) this).aShortArray8918[i_1531_];
		} else
			((Class528_Sub3) class528_sub3_1523_).aShortArray8918 = ((Class528_Sub3) this).aShortArray8918;
		if (Class50.method984(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aByteArray8900 == null || (((Class528_Sub3) class528_sub3_1524_).aByteArray8900.length < ((Class528_Sub3) this).anInt8916))
				((Class528_Sub3) class528_sub3_1523_).aByteArray8900 = ((Class528_Sub3) class528_sub3_1524_).aByteArray8900 = new byte[((Class528_Sub3) this).anInt8916];
			else
				((Class528_Sub3) class528_sub3_1523_).aByteArray8900 = ((Class528_Sub3) class528_sub3_1524_).aByteArray8900;
			for (int i_1532_ = 0; i_1532_ < ((Class528_Sub3) this).anInt8916; i_1532_++)
				((Class528_Sub3) class528_sub3_1523_).aByteArray8900[i_1532_] = ((Class528_Sub3) this).aByteArray8900[i_1532_];
		} else
			((Class528_Sub3) class528_sub3_1523_).aByteArray8900 = ((Class528_Sub3) this).aByteArray8900;
		if (Class50.method1051(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1523_).aClass63_8913 = ((Class528_Sub3) class528_sub3_1524_).aClass63_8913;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8913).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8913).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8913).aBool663 = true;
		} else if (Class50.method1059(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1523_).aClass63_8913 = ((Class528_Sub3) this).aClass63_8913;
		else
			((Class528_Sub3) class528_sub3_1523_).aClass63_8913 = null;
		if (Class50.method982(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aShortArray8909 == null || ((((Class528_Sub3) class528_sub3_1524_).aShortArray8909).length < ((Class528_Sub3) this).anInt8906)) {
				int i_1533_ = ((Class528_Sub3) this).anInt8906;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8909 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8909 = new short[i_1533_];
				((Class528_Sub3) class528_sub3_1523_).aShortArray8933 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8933 = new short[i_1533_];
				((Class528_Sub3) class528_sub3_1523_).aShortArray8911 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8911 = new short[i_1533_];
			} else {
				((Class528_Sub3) class528_sub3_1523_).aShortArray8909 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8909;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8933 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8933;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8911 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8911;
			}
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				if (((Class528_Sub3) class528_sub3_1524_).aClass355_8962 == null)
					((Class528_Sub3) class528_sub3_1524_).aClass355_8962 = new Class355();
				Class355 class355 = (((Class528_Sub3) class528_sub3_1523_).aClass355_8962 = ((Class528_Sub3) class528_sub3_1524_).aClass355_8962);
				if (((Class355) class355).aShortArray4115 == null || (((Class355) class355).aShortArray4115.length < ((Class528_Sub3) this).anInt8906)) {
					int i_1534_ = ((Class528_Sub3) this).anInt8906;
					((Class355) class355).aShortArray4115 = new short[i_1534_];
					((Class355) class355).aShortArray4114 = new short[i_1534_];
					((Class355) class355).aShortArray4113 = new short[i_1534_];
					((Class355) class355).aByteArray4116 = new byte[i_1534_];
				}
				for (int i_1535_ = 0; i_1535_ < ((Class528_Sub3) this).anInt8906; i_1535_++) {
					((Class528_Sub3) class528_sub3_1523_).aShortArray8909[i_1535_] = ((Class528_Sub3) this).aShortArray8909[i_1535_];
					((Class528_Sub3) class528_sub3_1523_).aShortArray8933[i_1535_] = ((Class528_Sub3) this).aShortArray8933[i_1535_];
					((Class528_Sub3) class528_sub3_1523_).aShortArray8911[i_1535_] = ((Class528_Sub3) this).aShortArray8911[i_1535_];
					((Class355) class355).aShortArray4115[i_1535_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115[i_1535_]);
					((Class355) class355).aShortArray4114[i_1535_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114[i_1535_]);
					((Class355) class355).aShortArray4113[i_1535_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113[i_1535_]);
					((Class355) class355).aByteArray4116[i_1535_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116[i_1535_]);
				}
			} else {
				((Class528_Sub3) class528_sub3_1523_).aClass355_8962 = null;
				for (int i_1536_ = 0; i_1536_ < ((Class528_Sub3) this).anInt8906; i_1536_++) {
					((Class528_Sub3) class528_sub3_1523_).aShortArray8909[i_1536_] = ((Class528_Sub3) this).aShortArray8909[i_1536_];
					((Class528_Sub3) class528_sub3_1523_).aShortArray8933[i_1536_] = ((Class528_Sub3) this).aShortArray8933[i_1536_];
					((Class528_Sub3) class528_sub3_1523_).aShortArray8911[i_1536_] = ((Class528_Sub3) this).aShortArray8911[i_1536_];
				}
			}
			((Class528_Sub3) class528_sub3_1523_).aByteArray8912 = ((Class528_Sub3) this).aByteArray8912;
		} else {
			((Class528_Sub3) class528_sub3_1523_).aClass355_8962 = ((Class528_Sub3) this).aClass355_8962;
			((Class528_Sub3) class528_sub3_1523_).aShortArray8909 = ((Class528_Sub3) this).aShortArray8909;
			((Class528_Sub3) class528_sub3_1523_).aShortArray8933 = ((Class528_Sub3) this).aShortArray8933;
			((Class528_Sub3) class528_sub3_1523_).aShortArray8911 = ((Class528_Sub3) this).aShortArray8911;
			((Class528_Sub3) class528_sub3_1523_).aByteArray8912 = ((Class528_Sub3) this).aByteArray8912;
		}
		if (Class50.method1020(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1523_).aClass63_8929 = ((Class528_Sub3) class528_sub3_1524_).aClass63_8929;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8929).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8929).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8929).aBool663 = true;
		} else if (Class50.method983(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1523_).aClass63_8929 = ((Class528_Sub3) this).aClass63_8929;
		else
			((Class528_Sub3) class528_sub3_1523_).aClass63_8929 = null;
		if (Class50.method985(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aFloatArray8892 == null || ((((Class528_Sub3) class528_sub3_1524_).aFloatArray8892).length < ((Class528_Sub3) this).anInt8916)) {
				int i_1537_ = ((Class528_Sub3) this).anInt8906;
				((Class528_Sub3) class528_sub3_1523_).aFloatArray8892 = ((Class528_Sub3) class528_sub3_1524_).aFloatArray8892 = new float[i_1537_];
				((Class528_Sub3) class528_sub3_1523_).aFloatArray8914 = ((Class528_Sub3) class528_sub3_1524_).aFloatArray8914 = new float[i_1537_];
			} else {
				((Class528_Sub3) class528_sub3_1523_).aFloatArray8892 = ((Class528_Sub3) class528_sub3_1524_).aFloatArray8892;
				((Class528_Sub3) class528_sub3_1523_).aFloatArray8914 = ((Class528_Sub3) class528_sub3_1524_).aFloatArray8914;
			}
			for (int i_1538_ = 0; i_1538_ < ((Class528_Sub3) this).anInt8906; i_1538_++) {
				((Class528_Sub3) class528_sub3_1523_).aFloatArray8892[i_1538_] = ((Class528_Sub3) this).aFloatArray8892[i_1538_];
				((Class528_Sub3) class528_sub3_1523_).aFloatArray8914[i_1538_] = ((Class528_Sub3) this).aFloatArray8914[i_1538_];
			}
		} else {
			((Class528_Sub3) class528_sub3_1523_).aFloatArray8892 = ((Class528_Sub3) this).aFloatArray8892;
			((Class528_Sub3) class528_sub3_1523_).aFloatArray8914 = ((Class528_Sub3) this).aFloatArray8914;
		}
		if (Class50.method1056(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1523_).aClass63_8930 = ((Class528_Sub3) class528_sub3_1524_).aClass63_8930;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8930).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8930).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1523_).aClass63_8930).aBool663 = true;
		} else if (Class50.method993(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1523_).aClass63_8930 = ((Class528_Sub3) this).aClass63_8930;
		else
			((Class528_Sub3) class528_sub3_1523_).aClass63_8930 = null;
		if (Class50.method986(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aShortArray8920 == null || ((((Class528_Sub3) class528_sub3_1524_).aShortArray8920).length < ((Class528_Sub3) this).anInt8916)) {
				int i_1539_ = ((Class528_Sub3) this).anInt8916;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8920 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8920 = new short[i_1539_];
				((Class528_Sub3) class528_sub3_1523_).aShortArray8921 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8921 = new short[i_1539_];
				((Class528_Sub3) class528_sub3_1523_).aShortArray8922 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8922 = new short[i_1539_];
			} else {
				((Class528_Sub3) class528_sub3_1523_).aShortArray8920 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8920;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8921 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8921;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8922 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8922;
			}
			for (int i_1540_ = 0; i_1540_ < ((Class528_Sub3) this).anInt8916; i_1540_++) {
				((Class528_Sub3) class528_sub3_1523_).aShortArray8920[i_1540_] = ((Class528_Sub3) this).aShortArray8920[i_1540_];
				((Class528_Sub3) class528_sub3_1523_).aShortArray8921[i_1540_] = ((Class528_Sub3) this).aShortArray8921[i_1540_];
				((Class528_Sub3) class528_sub3_1523_).aShortArray8922[i_1540_] = ((Class528_Sub3) this).aShortArray8922[i_1540_];
			}
		} else {
			((Class528_Sub3) class528_sub3_1523_).aShortArray8920 = ((Class528_Sub3) this).aShortArray8920;
			((Class528_Sub3) class528_sub3_1523_).aShortArray8921 = ((Class528_Sub3) this).aShortArray8921;
			((Class528_Sub3) class528_sub3_1523_).aShortArray8922 = ((Class528_Sub3) this).aShortArray8922;
		}
		if (Class50.method999(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1523_).aClass39_8926 = ((Class528_Sub3) class528_sub3_1524_).aClass39_8926;
			((Class39) ((Class528_Sub3) class528_sub3_1523_).aClass39_8926).anInterface32_407 = (((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class39) ((Class528_Sub3) class528_sub3_1523_).aClass39_8926).aBool408 = ((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408;
			((Class39) ((Class528_Sub3) class528_sub3_1523_).aClass39_8926).aBool406 = true;
		} else if (Class50.method1043(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1523_).aClass39_8926 = ((Class528_Sub3) this).aClass39_8926;
		else
			((Class528_Sub3) class528_sub3_1523_).aClass39_8926 = null;
		if (Class50.method992(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aShortArray8923 == null || ((((Class528_Sub3) class528_sub3_1524_).aShortArray8923).length < ((Class528_Sub3) this).anInt8916)) {
				int i_1541_ = ((Class528_Sub3) this).anInt8916;
				((Class528_Sub3) class528_sub3_1523_).aShortArray8923 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8923 = new short[i_1541_];
			} else
				((Class528_Sub3) class528_sub3_1523_).aShortArray8923 = ((Class528_Sub3) class528_sub3_1524_).aShortArray8923;
			for (int i_1542_ = 0; i_1542_ < ((Class528_Sub3) this).anInt8916; i_1542_++)
				((Class528_Sub3) class528_sub3_1523_).aShortArray8923[i_1542_] = ((Class528_Sub3) this).aShortArray8923[i_1542_];
		} else
			((Class528_Sub3) class528_sub3_1523_).aShortArray8923 = ((Class528_Sub3) this).aShortArray8923;
		if (Class50.method988(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1524_).aClass65Array8953 == null || ((((Class528_Sub3) class528_sub3_1524_).aClass65Array8953).length < ((Class528_Sub3) this).anInt8951)) {
				int i_1543_ = ((Class528_Sub3) this).anInt8951;
				((Class528_Sub3) class528_sub3_1523_).aClass65Array8953 = ((Class528_Sub3) class528_sub3_1524_).aClass65Array8953 = new Class65[i_1543_];
				for (int i_1544_ = 0; i_1544_ < ((Class528_Sub3) this).anInt8951; i_1544_++)
					((Class528_Sub3) class528_sub3_1523_).aClass65Array8953[i_1544_] = ((Class528_Sub3) this).aClass65Array8953[i_1544_].method1275();
			} else {
				((Class528_Sub3) class528_sub3_1523_).aClass65Array8953 = ((Class528_Sub3) class528_sub3_1524_).aClass65Array8953;
				for (int i_1545_ = 0; i_1545_ < ((Class528_Sub3) this).anInt8951; i_1545_++)
					((Class528_Sub3) class528_sub3_1523_).aClass65Array8953[i_1545_].method1270(((Class528_Sub3) this).aClass65Array8953[i_1545_]);
			}
		} else
			((Class528_Sub3) class528_sub3_1523_).aClass65Array8953 = ((Class528_Sub3) this).aClass65Array8953;
		((Class528_Sub3) class528_sub3_1523_).aClass56Array8934 = ((Class528_Sub3) this).aClass56Array8934;
		if (((Class528_Sub3) this).aBool8937) {
			((Class528_Sub3) class528_sub3_1523_).anInt8957 = ((Class528_Sub3) this).anInt8957;
			((Class528_Sub3) class528_sub3_1523_).anInt8936 = ((Class528_Sub3) this).anInt8936;
			((Class528_Sub3) class528_sub3_1523_).anInt8940 = ((Class528_Sub3) this).anInt8940;
			((Class528_Sub3) class528_sub3_1523_).anInt8941 = ((Class528_Sub3) this).anInt8941;
			((Class528_Sub3) class528_sub3_1523_).anInt8908 = ((Class528_Sub3) this).anInt8908;
			((Class528_Sub3) class528_sub3_1523_).anInt8893 = ((Class528_Sub3) this).anInt8893;
			((Class528_Sub3) class528_sub3_1523_).anInt8942 = ((Class528_Sub3) this).anInt8942;
			((Class528_Sub3) class528_sub3_1523_).anInt8943 = ((Class528_Sub3) this).anInt8943;
			((Class528_Sub3) class528_sub3_1523_).aBool8937 = true;
		} else
			((Class528_Sub3) class528_sub3_1523_).aBool8937 = false;
		((Class528_Sub3) class528_sub3_1523_).anIntArrayArray8966 = ((Class528_Sub3) this).anIntArrayArray8966;
		((Class528_Sub3) class528_sub3_1523_).anIntArrayArray8924 = ((Class528_Sub3) this).anIntArrayArray8924;
		((Class528_Sub3) class528_sub3_1523_).anIntArrayArray8954 = ((Class528_Sub3) this).anIntArrayArray8954;
		((Class528_Sub3) class528_sub3_1523_).aShortArray8948 = ((Class528_Sub3) this).aShortArray8948;
		((Class528_Sub3) class528_sub3_1523_).anIntArray8947 = ((Class528_Sub3) this).anIntArray8947;
		((Class528_Sub3) class528_sub3_1523_).aShortArray8907 = ((Class528_Sub3) this).aShortArray8907;
		((Class528_Sub3) class528_sub3_1523_).aShortArray8945 = ((Class528_Sub3) this).aShortArray8945;
		((Class528_Sub3) class528_sub3_1523_).aShortArray8905 = ((Class528_Sub3) this).aShortArray8905;
		((Class528_Sub3) class528_sub3_1523_).aShortArray8925 = ((Class528_Sub3) this).aShortArray8925;
		((Class528_Sub3) class528_sub3_1523_).anIntArray8944 = ((Class528_Sub3) this).anIntArray8944;
		((Class528_Sub3) class528_sub3_1523_).anIntArray8946 = ((Class528_Sub3) this).anIntArray8946;
		((Class528_Sub3) class528_sub3_1523_).anIntArray8952 = ((Class528_Sub3) this).anIntArray8952;
		((Class528_Sub3) class528_sub3_1523_).aClass87Array8949 = ((Class528_Sub3) this).aClass87Array8949;
		((Class528_Sub3) class528_sub3_1523_).aClass172Array8950 = ((Class528_Sub3) this).aClass172Array8950;
		return class528_sub3_1523_;
	}

	MeshRasterizer method14299(Class528_Sub3 class528_sub3_1546_, Class528_Sub3 class528_sub3_1547_, int i, boolean bool, boolean bool_1548_) {
		((Class528_Sub3) class528_sub3_1546_).anInt8895 = i;
		((Class528_Sub3) class528_sub3_1546_).anInt8896 = ((Class528_Sub3) this).anInt8896;
		((Class528_Sub3) class528_sub3_1546_).aShort8897 = ((Class528_Sub3) this).aShort8897;
		((Class528_Sub3) class528_sub3_1546_).aShort8898 = ((Class528_Sub3) this).aShort8898;
		((Class528_Sub3) class528_sub3_1546_).anInt8899 = ((Class528_Sub3) this).anInt8899;
		((Class528_Sub3) class528_sub3_1546_).anInt8910 = ((Class528_Sub3) this).anInt8910;
		((Class528_Sub3) class528_sub3_1546_).anInt8906 = ((Class528_Sub3) this).anInt8906;
		((Class528_Sub3) class528_sub3_1546_).anInt8916 = ((Class528_Sub3) this).anInt8916;
		((Class528_Sub3) class528_sub3_1546_).anInt8963 = ((Class528_Sub3) this).anInt8963;
		((Class528_Sub3) class528_sub3_1546_).anInt8951 = ((Class528_Sub3) this).anInt8951;
		if ((i & 0x100) != 0)
			((Class528_Sub3) class528_sub3_1546_).aBool8959 = true;
		else
			((Class528_Sub3) class528_sub3_1546_).aBool8959 = ((Class528_Sub3) this).aBool8959;
		((Class528_Sub3) class528_sub3_1546_).aBool8903 = ((Class528_Sub3) this).aBool8903;
		boolean bool_1549_ = Class50.method994(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_1550_ = Class50.method979(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_1551_ = Class50.method980(i, ((Class528_Sub3) this).anInt8896);
		boolean bool_1552_ = bool_1549_ | bool_1550_ | bool_1551_;
		if (bool_1552_) {
			if (bool_1549_) {
				if ((((Class528_Sub3) class528_sub3_1547_).anIntArray8901 == null) || ((((Class528_Sub3) class528_sub3_1547_).anIntArray8901).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_1546_).anIntArray8901 = ((Class528_Sub3) class528_sub3_1547_).anIntArray8901 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_1546_).anIntArray8901 = ((Class528_Sub3) class528_sub3_1547_).anIntArray8901;
			} else
				((Class528_Sub3) class528_sub3_1546_).anIntArray8901 = ((Class528_Sub3) this).anIntArray8901;
			if (bool_1550_) {
				if ((((Class528_Sub3) class528_sub3_1547_).anIntArray8902 == null) || ((((Class528_Sub3) class528_sub3_1547_).anIntArray8902).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_1546_).anIntArray8902 = ((Class528_Sub3) class528_sub3_1547_).anIntArray8902 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_1546_).anIntArray8902 = ((Class528_Sub3) class528_sub3_1547_).anIntArray8902;
			} else
				((Class528_Sub3) class528_sub3_1546_).anIntArray8902 = ((Class528_Sub3) this).anIntArray8902;
			if (bool_1551_) {
				if ((((Class528_Sub3) class528_sub3_1547_).anIntArray8931 == null) || ((((Class528_Sub3) class528_sub3_1547_).anIntArray8931).length < ((Class528_Sub3) this).anInt8899))
					((Class528_Sub3) class528_sub3_1546_).anIntArray8931 = ((Class528_Sub3) class528_sub3_1547_).anIntArray8931 = new int[((Class528_Sub3) this).anInt8899];
				else
					((Class528_Sub3) class528_sub3_1546_).anIntArray8931 = ((Class528_Sub3) class528_sub3_1547_).anIntArray8931;
			} else
				((Class528_Sub3) class528_sub3_1546_).anIntArray8931 = ((Class528_Sub3) this).anIntArray8931;
			for (int i_1553_ = 0; i_1553_ < ((Class528_Sub3) this).anInt8899; i_1553_++) {
				if (bool_1549_)
					((Class528_Sub3) class528_sub3_1546_).anIntArray8901[i_1553_] = ((Class528_Sub3) this).anIntArray8901[i_1553_];
				if (bool_1550_)
					((Class528_Sub3) class528_sub3_1546_).anIntArray8902[i_1553_] = ((Class528_Sub3) this).anIntArray8902[i_1553_];
				if (bool_1551_)
					((Class528_Sub3) class528_sub3_1546_).anIntArray8931[i_1553_] = ((Class528_Sub3) this).anIntArray8931[i_1553_];
			}
		} else {
			((Class528_Sub3) class528_sub3_1546_).anIntArray8901 = ((Class528_Sub3) this).anIntArray8901;
			((Class528_Sub3) class528_sub3_1546_).anIntArray8902 = ((Class528_Sub3) this).anIntArray8902;
			((Class528_Sub3) class528_sub3_1546_).anIntArray8931 = ((Class528_Sub3) this).anIntArray8931;
		}
		if (Class50.method995(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1546_).aClass63_8927 = ((Class528_Sub3) class528_sub3_1547_).aClass63_8927;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8927).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8927).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8927).aBool663 = true;
		} else if (Class50.method990(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1546_).aClass63_8927 = ((Class528_Sub3) this).aClass63_8927;
		else
			((Class528_Sub3) class528_sub3_1546_).aClass63_8927 = null;
		if (Class50.method1022(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aShortArray8918 == null || ((((Class528_Sub3) class528_sub3_1547_).aShortArray8918).length < ((Class528_Sub3) this).anInt8916))
				((Class528_Sub3) class528_sub3_1546_).aShortArray8918 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8918 = new short[((Class528_Sub3) this).anInt8916];
			else
				((Class528_Sub3) class528_sub3_1546_).aShortArray8918 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8918;
			for (int i_1554_ = 0; i_1554_ < ((Class528_Sub3) this).anInt8916; i_1554_++)
				((Class528_Sub3) class528_sub3_1546_).aShortArray8918[i_1554_] = ((Class528_Sub3) this).aShortArray8918[i_1554_];
		} else
			((Class528_Sub3) class528_sub3_1546_).aShortArray8918 = ((Class528_Sub3) this).aShortArray8918;
		if (Class50.method984(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aByteArray8900 == null || (((Class528_Sub3) class528_sub3_1547_).aByteArray8900.length < ((Class528_Sub3) this).anInt8916))
				((Class528_Sub3) class528_sub3_1546_).aByteArray8900 = ((Class528_Sub3) class528_sub3_1547_).aByteArray8900 = new byte[((Class528_Sub3) this).anInt8916];
			else
				((Class528_Sub3) class528_sub3_1546_).aByteArray8900 = ((Class528_Sub3) class528_sub3_1547_).aByteArray8900;
			for (int i_1555_ = 0; i_1555_ < ((Class528_Sub3) this).anInt8916; i_1555_++)
				((Class528_Sub3) class528_sub3_1546_).aByteArray8900[i_1555_] = ((Class528_Sub3) this).aByteArray8900[i_1555_];
		} else
			((Class528_Sub3) class528_sub3_1546_).aByteArray8900 = ((Class528_Sub3) this).aByteArray8900;
		if (Class50.method1051(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1546_).aClass63_8913 = ((Class528_Sub3) class528_sub3_1547_).aClass63_8913;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8913).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8913).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8913).aBool663 = true;
		} else if (Class50.method1059(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1546_).aClass63_8913 = ((Class528_Sub3) this).aClass63_8913;
		else
			((Class528_Sub3) class528_sub3_1546_).aClass63_8913 = null;
		if (Class50.method982(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aShortArray8909 == null || ((((Class528_Sub3) class528_sub3_1547_).aShortArray8909).length < ((Class528_Sub3) this).anInt8906)) {
				int i_1556_ = ((Class528_Sub3) this).anInt8906;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8909 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8909 = new short[i_1556_];
				((Class528_Sub3) class528_sub3_1546_).aShortArray8933 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8933 = new short[i_1556_];
				((Class528_Sub3) class528_sub3_1546_).aShortArray8911 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8911 = new short[i_1556_];
			} else {
				((Class528_Sub3) class528_sub3_1546_).aShortArray8909 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8909;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8933 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8933;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8911 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8911;
			}
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				if (((Class528_Sub3) class528_sub3_1547_).aClass355_8962 == null)
					((Class528_Sub3) class528_sub3_1547_).aClass355_8962 = new Class355();
				Class355 class355 = (((Class528_Sub3) class528_sub3_1546_).aClass355_8962 = ((Class528_Sub3) class528_sub3_1547_).aClass355_8962);
				if (((Class355) class355).aShortArray4115 == null || (((Class355) class355).aShortArray4115.length < ((Class528_Sub3) this).anInt8906)) {
					int i_1557_ = ((Class528_Sub3) this).anInt8906;
					((Class355) class355).aShortArray4115 = new short[i_1557_];
					((Class355) class355).aShortArray4114 = new short[i_1557_];
					((Class355) class355).aShortArray4113 = new short[i_1557_];
					((Class355) class355).aByteArray4116 = new byte[i_1557_];
				}
				for (int i_1558_ = 0; i_1558_ < ((Class528_Sub3) this).anInt8906; i_1558_++) {
					((Class528_Sub3) class528_sub3_1546_).aShortArray8909[i_1558_] = ((Class528_Sub3) this).aShortArray8909[i_1558_];
					((Class528_Sub3) class528_sub3_1546_).aShortArray8933[i_1558_] = ((Class528_Sub3) this).aShortArray8933[i_1558_];
					((Class528_Sub3) class528_sub3_1546_).aShortArray8911[i_1558_] = ((Class528_Sub3) this).aShortArray8911[i_1558_];
					((Class355) class355).aShortArray4115[i_1558_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115[i_1558_]);
					((Class355) class355).aShortArray4114[i_1558_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114[i_1558_]);
					((Class355) class355).aShortArray4113[i_1558_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113[i_1558_]);
					((Class355) class355).aByteArray4116[i_1558_] = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116[i_1558_]);
				}
			} else {
				((Class528_Sub3) class528_sub3_1546_).aClass355_8962 = null;
				for (int i_1559_ = 0; i_1559_ < ((Class528_Sub3) this).anInt8906; i_1559_++) {
					((Class528_Sub3) class528_sub3_1546_).aShortArray8909[i_1559_] = ((Class528_Sub3) this).aShortArray8909[i_1559_];
					((Class528_Sub3) class528_sub3_1546_).aShortArray8933[i_1559_] = ((Class528_Sub3) this).aShortArray8933[i_1559_];
					((Class528_Sub3) class528_sub3_1546_).aShortArray8911[i_1559_] = ((Class528_Sub3) this).aShortArray8911[i_1559_];
				}
			}
			((Class528_Sub3) class528_sub3_1546_).aByteArray8912 = ((Class528_Sub3) this).aByteArray8912;
		} else {
			((Class528_Sub3) class528_sub3_1546_).aClass355_8962 = ((Class528_Sub3) this).aClass355_8962;
			((Class528_Sub3) class528_sub3_1546_).aShortArray8909 = ((Class528_Sub3) this).aShortArray8909;
			((Class528_Sub3) class528_sub3_1546_).aShortArray8933 = ((Class528_Sub3) this).aShortArray8933;
			((Class528_Sub3) class528_sub3_1546_).aShortArray8911 = ((Class528_Sub3) this).aShortArray8911;
			((Class528_Sub3) class528_sub3_1546_).aByteArray8912 = ((Class528_Sub3) this).aByteArray8912;
		}
		if (Class50.method1020(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1546_).aClass63_8929 = ((Class528_Sub3) class528_sub3_1547_).aClass63_8929;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8929).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8929).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8929).aBool663 = true;
		} else if (Class50.method983(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1546_).aClass63_8929 = ((Class528_Sub3) this).aClass63_8929;
		else
			((Class528_Sub3) class528_sub3_1546_).aClass63_8929 = null;
		if (Class50.method985(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aFloatArray8892 == null || ((((Class528_Sub3) class528_sub3_1547_).aFloatArray8892).length < ((Class528_Sub3) this).anInt8916)) {
				int i_1560_ = ((Class528_Sub3) this).anInt8906;
				((Class528_Sub3) class528_sub3_1546_).aFloatArray8892 = ((Class528_Sub3) class528_sub3_1547_).aFloatArray8892 = new float[i_1560_];
				((Class528_Sub3) class528_sub3_1546_).aFloatArray8914 = ((Class528_Sub3) class528_sub3_1547_).aFloatArray8914 = new float[i_1560_];
			} else {
				((Class528_Sub3) class528_sub3_1546_).aFloatArray8892 = ((Class528_Sub3) class528_sub3_1547_).aFloatArray8892;
				((Class528_Sub3) class528_sub3_1546_).aFloatArray8914 = ((Class528_Sub3) class528_sub3_1547_).aFloatArray8914;
			}
			for (int i_1561_ = 0; i_1561_ < ((Class528_Sub3) this).anInt8906; i_1561_++) {
				((Class528_Sub3) class528_sub3_1546_).aFloatArray8892[i_1561_] = ((Class528_Sub3) this).aFloatArray8892[i_1561_];
				((Class528_Sub3) class528_sub3_1546_).aFloatArray8914[i_1561_] = ((Class528_Sub3) this).aFloatArray8914[i_1561_];
			}
		} else {
			((Class528_Sub3) class528_sub3_1546_).aFloatArray8892 = ((Class528_Sub3) this).aFloatArray8892;
			((Class528_Sub3) class528_sub3_1546_).aFloatArray8914 = ((Class528_Sub3) this).aFloatArray8914;
		}
		if (Class50.method1056(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1546_).aClass63_8930 = ((Class528_Sub3) class528_sub3_1547_).aClass63_8930;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8930).anInterface4_661 = (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661);
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8930).aBool662 = ((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662;
			((Class63) ((Class528_Sub3) class528_sub3_1546_).aClass63_8930).aBool663 = true;
		} else if (Class50.method993(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1546_).aClass63_8930 = ((Class528_Sub3) this).aClass63_8930;
		else
			((Class528_Sub3) class528_sub3_1546_).aClass63_8930 = null;
		if (Class50.method986(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aShortArray8920 == null || ((((Class528_Sub3) class528_sub3_1547_).aShortArray8920).length < ((Class528_Sub3) this).anInt8916)) {
				int i_1562_ = ((Class528_Sub3) this).anInt8916;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8920 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8920 = new short[i_1562_];
				((Class528_Sub3) class528_sub3_1546_).aShortArray8921 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8921 = new short[i_1562_];
				((Class528_Sub3) class528_sub3_1546_).aShortArray8922 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8922 = new short[i_1562_];
			} else {
				((Class528_Sub3) class528_sub3_1546_).aShortArray8920 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8920;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8921 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8921;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8922 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8922;
			}
			for (int i_1563_ = 0; i_1563_ < ((Class528_Sub3) this).anInt8916; i_1563_++) {
				((Class528_Sub3) class528_sub3_1546_).aShortArray8920[i_1563_] = ((Class528_Sub3) this).aShortArray8920[i_1563_];
				((Class528_Sub3) class528_sub3_1546_).aShortArray8921[i_1563_] = ((Class528_Sub3) this).aShortArray8921[i_1563_];
				((Class528_Sub3) class528_sub3_1546_).aShortArray8922[i_1563_] = ((Class528_Sub3) this).aShortArray8922[i_1563_];
			}
		} else {
			((Class528_Sub3) class528_sub3_1546_).aShortArray8920 = ((Class528_Sub3) this).aShortArray8920;
			((Class528_Sub3) class528_sub3_1546_).aShortArray8921 = ((Class528_Sub3) this).aShortArray8921;
			((Class528_Sub3) class528_sub3_1546_).aShortArray8922 = ((Class528_Sub3) this).aShortArray8922;
		}
		if (Class50.method999(i, ((Class528_Sub3) this).anInt8896)) {
			((Class528_Sub3) class528_sub3_1546_).aClass39_8926 = ((Class528_Sub3) class528_sub3_1547_).aClass39_8926;
			((Class39) ((Class528_Sub3) class528_sub3_1546_).aClass39_8926).anInterface32_407 = (((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class39) ((Class528_Sub3) class528_sub3_1546_).aClass39_8926).aBool408 = ((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408;
			((Class39) ((Class528_Sub3) class528_sub3_1546_).aClass39_8926).aBool406 = true;
		} else if (Class50.method1043(i, ((Class528_Sub3) this).anInt8896))
			((Class528_Sub3) class528_sub3_1546_).aClass39_8926 = ((Class528_Sub3) this).aClass39_8926;
		else
			((Class528_Sub3) class528_sub3_1546_).aClass39_8926 = null;
		if (Class50.method992(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aShortArray8923 == null || ((((Class528_Sub3) class528_sub3_1547_).aShortArray8923).length < ((Class528_Sub3) this).anInt8916)) {
				int i_1564_ = ((Class528_Sub3) this).anInt8916;
				((Class528_Sub3) class528_sub3_1546_).aShortArray8923 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8923 = new short[i_1564_];
			} else
				((Class528_Sub3) class528_sub3_1546_).aShortArray8923 = ((Class528_Sub3) class528_sub3_1547_).aShortArray8923;
			for (int i_1565_ = 0; i_1565_ < ((Class528_Sub3) this).anInt8916; i_1565_++)
				((Class528_Sub3) class528_sub3_1546_).aShortArray8923[i_1565_] = ((Class528_Sub3) this).aShortArray8923[i_1565_];
		} else
			((Class528_Sub3) class528_sub3_1546_).aShortArray8923 = ((Class528_Sub3) this).aShortArray8923;
		if (Class50.method988(i, ((Class528_Sub3) this).anInt8896)) {
			if (((Class528_Sub3) class528_sub3_1547_).aClass65Array8953 == null || ((((Class528_Sub3) class528_sub3_1547_).aClass65Array8953).length < ((Class528_Sub3) this).anInt8951)) {
				int i_1566_ = ((Class528_Sub3) this).anInt8951;
				((Class528_Sub3) class528_sub3_1546_).aClass65Array8953 = ((Class528_Sub3) class528_sub3_1547_).aClass65Array8953 = new Class65[i_1566_];
				for (int i_1567_ = 0; i_1567_ < ((Class528_Sub3) this).anInt8951; i_1567_++)
					((Class528_Sub3) class528_sub3_1546_).aClass65Array8953[i_1567_] = ((Class528_Sub3) this).aClass65Array8953[i_1567_].method1275();
			} else {
				((Class528_Sub3) class528_sub3_1546_).aClass65Array8953 = ((Class528_Sub3) class528_sub3_1547_).aClass65Array8953;
				for (int i_1568_ = 0; i_1568_ < ((Class528_Sub3) this).anInt8951; i_1568_++)
					((Class528_Sub3) class528_sub3_1546_).aClass65Array8953[i_1568_].method1270(((Class528_Sub3) this).aClass65Array8953[i_1568_]);
			}
		} else
			((Class528_Sub3) class528_sub3_1546_).aClass65Array8953 = ((Class528_Sub3) this).aClass65Array8953;
		((Class528_Sub3) class528_sub3_1546_).aClass56Array8934 = ((Class528_Sub3) this).aClass56Array8934;
		if (((Class528_Sub3) this).aBool8937) {
			((Class528_Sub3) class528_sub3_1546_).anInt8957 = ((Class528_Sub3) this).anInt8957;
			((Class528_Sub3) class528_sub3_1546_).anInt8936 = ((Class528_Sub3) this).anInt8936;
			((Class528_Sub3) class528_sub3_1546_).anInt8940 = ((Class528_Sub3) this).anInt8940;
			((Class528_Sub3) class528_sub3_1546_).anInt8941 = ((Class528_Sub3) this).anInt8941;
			((Class528_Sub3) class528_sub3_1546_).anInt8908 = ((Class528_Sub3) this).anInt8908;
			((Class528_Sub3) class528_sub3_1546_).anInt8893 = ((Class528_Sub3) this).anInt8893;
			((Class528_Sub3) class528_sub3_1546_).anInt8942 = ((Class528_Sub3) this).anInt8942;
			((Class528_Sub3) class528_sub3_1546_).anInt8943 = ((Class528_Sub3) this).anInt8943;
			((Class528_Sub3) class528_sub3_1546_).aBool8937 = true;
		} else
			((Class528_Sub3) class528_sub3_1546_).aBool8937 = false;
		((Class528_Sub3) class528_sub3_1546_).anIntArrayArray8966 = ((Class528_Sub3) this).anIntArrayArray8966;
		((Class528_Sub3) class528_sub3_1546_).anIntArrayArray8924 = ((Class528_Sub3) this).anIntArrayArray8924;
		((Class528_Sub3) class528_sub3_1546_).anIntArrayArray8954 = ((Class528_Sub3) this).anIntArrayArray8954;
		((Class528_Sub3) class528_sub3_1546_).aShortArray8948 = ((Class528_Sub3) this).aShortArray8948;
		((Class528_Sub3) class528_sub3_1546_).anIntArray8947 = ((Class528_Sub3) this).anIntArray8947;
		((Class528_Sub3) class528_sub3_1546_).aShortArray8907 = ((Class528_Sub3) this).aShortArray8907;
		((Class528_Sub3) class528_sub3_1546_).aShortArray8945 = ((Class528_Sub3) this).aShortArray8945;
		((Class528_Sub3) class528_sub3_1546_).aShortArray8905 = ((Class528_Sub3) this).aShortArray8905;
		((Class528_Sub3) class528_sub3_1546_).aShortArray8925 = ((Class528_Sub3) this).aShortArray8925;
		((Class528_Sub3) class528_sub3_1546_).anIntArray8944 = ((Class528_Sub3) this).anIntArray8944;
		((Class528_Sub3) class528_sub3_1546_).anIntArray8946 = ((Class528_Sub3) this).anIntArray8946;
		((Class528_Sub3) class528_sub3_1546_).anIntArray8952 = ((Class528_Sub3) this).anIntArray8952;
		((Class528_Sub3) class528_sub3_1546_).aClass87Array8949 = ((Class528_Sub3) this).aClass87Array8949;
		((Class528_Sub3) class528_sub3_1546_).aClass172Array8950 = ((Class528_Sub3) this).aClass172Array8950;
		return class528_sub3_1546_;
	}

	void method14300() {
		if (((Class528_Sub3) this).aBool8919) {
			((Class528_Sub3) this).aBool8919 = false;
			if (((Class528_Sub3) this).aClass87Array8949 == null && ((Class528_Sub3) this).aClass172Array8950 == null && ((Class528_Sub3) this).aClass56Array8934 == null && !Class50.method981(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				boolean bool = false;
				boolean bool_1569_ = false;
				boolean bool_1570_ = false;
				if (((Class528_Sub3) this).anIntArray8901 != null && !Class50.method1000(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264()) {
						if (!((Class528_Sub3) this).aBool8937)
							method14281();
						bool = true;
					} else
						((Class528_Sub3) this).aBool8919 = true;
				}
				if (((Class528_Sub3) this).anIntArray8902 != null && !Class50.method1001(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264()) {
						if (!((Class528_Sub3) this).aBool8937)
							method14281();
						bool_1569_ = true;
					} else
						((Class528_Sub3) this).aBool8919 = true;
				}
				if (((Class528_Sub3) this).anIntArray8931 != null && !Class50.method1002(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264()) {
						if (!((Class528_Sub3) this).aBool8937)
							method14281();
						bool_1570_ = true;
					} else
						((Class528_Sub3) this).aBool8919 = true;
				}
				if (bool)
					((Class528_Sub3) this).anIntArray8901 = null;
				if (bool_1569_)
					((Class528_Sub3) this).anIntArray8902 = null;
				if (bool_1570_)
					((Class528_Sub3) this).anIntArray8931 = null;
			}
			if (((Class528_Sub3) this).aShortArray8948 != null && ((Class528_Sub3) this).anIntArray8901 == null && ((Class528_Sub3) this).anIntArray8902 == null && ((Class528_Sub3) this).anIntArray8931 == null) {
				((Class528_Sub3) this).aShortArray8948 = null;
				((Class528_Sub3) this).anIntArray8947 = null;
			}
			while_2_: do {
				if (((Class528_Sub3) this).aByteArray8912 != null && !Class50.method996(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
					do {
						if ((((Class528_Sub3) this).anInt8896 & 0x37) != 0) {
							if (((Class528_Sub3) this).aClass63_8929 != null && !((Class528_Sub3) this).aClass63_8929.method1264())
								break;
						} else if (((Class528_Sub3) this).aClass63_8913 != null && !((Class528_Sub3) this).aClass63_8913.method1264())
							break;
						((Class528_Sub3) this).aShortArray8911 = null;
						((Class528_Sub3) this).aShortArray8933 = null;
						((Class528_Sub3) this).aShortArray8909 = null;
						((Class528_Sub3) this).aByteArray8912 = null;
						break while_2_;
					} while (false);
					((Class528_Sub3) this).aBool8919 = true;
				}
			} while (false);
			if (((Class528_Sub3) this).aShortArray8918 != null && !Class50.method987(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aShortArray8918 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aByteArray8900 != null && !Class50.method1004(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aByteArray8900 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aFloatArray8892 != null && !Class50.method1005(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8930 == null || ((Class528_Sub3) this).aClass63_8930.method1264()) {
					((Class528_Sub3) this).aFloatArray8914 = null;
					((Class528_Sub3) this).aFloatArray8892 = null;
				} else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8923 != null && !Class50.method1010(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aShortArray8923 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8920 != null && !Class50.method1009(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				if ((((Class528_Sub3) this).aClass39_8926 == null || ((Class528_Sub3) this).aClass39_8926.method861()) && (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())) {
					((Class528_Sub3) this).aShortArray8922 = null;
					((Class528_Sub3) this).aShortArray8921 = null;
					((Class528_Sub3) this).aShortArray8920 = null;
				} else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8907 != null) {
				if (((Class528_Sub3) this).aClass63_8927 == null || ((Class528_Sub3) this).aClass63_8927.method1264())
					((Class528_Sub3) this).aShortArray8907 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).aShortArray8945 != null) {
				if (((Class528_Sub3) this).aClass63_8913 == null || ((Class528_Sub3) this).aClass63_8913.method1264())
					((Class528_Sub3) this).aShortArray8945 = null;
				else
					((Class528_Sub3) this).aBool8919 = true;
			}
			if (((Class528_Sub3) this).anIntArrayArray8924 != null && !Class50.method1006(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				((Class528_Sub3) this).anIntArrayArray8924 = null;
				((Class528_Sub3) this).aShortArray8925 = null;
			}
			if (((Class528_Sub3) this).anIntArrayArray8966 != null && !Class50.method1007(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896)) {
				((Class528_Sub3) this).anIntArrayArray8966 = null;
				((Class528_Sub3) this).aShortArray8905 = null;
			}
			if (((Class528_Sub3) this).anIntArrayArray8954 != null && !Class50.method1008(((Class528_Sub3) this).anInt8895, ((Class528_Sub3) this).anInt8896))
				((Class528_Sub3) this).anIntArrayArray8954 = null;
			if (((Class528_Sub3) this).anIntArray8944 != null && (((Class528_Sub3) this).anInt8895 & 0x800) == 0 && (((Class528_Sub3) this).anInt8895 & 0x40000) == 0) {
				((Class528_Sub3) this).anIntArray8944 = null;
				((Class528_Sub3) this).anIntArray8946 = null;
				((Class528_Sub3) this).anIntArray8952 = null;
			}
		}
	}

	void method14301() {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662 = false;
	}

	void method14302() {
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = false;
	}

	void method14303() {
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = false;
	}

	void method14304() {
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = false;
	}

	void method14305() {
		if ((((Class528_Sub3) this).anInt8896 & 0x37) != 0) {
			if (((Class528_Sub3) this).aClass63_8929 != null)
				((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662 = false;
		} else if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = false;
	}

	void method14306() {
		if (((Class528_Sub3) this).aClass39_8926 != null)
			((Class39) ((Class528_Sub3) this).aClass39_8926).aBool408 = false;
	}

	public void PA(int i, int i_1571_, int i_1572_, int i_1573_) {
		for (int i_1574_ = 0; i_1574_ < ((Class528_Sub3) this).anInt8916; i_1574_++) {
			int i_1575_ = ((Class528_Sub3) this).aShortArray8918[i_1574_] & 0xffff;
			int i_1576_ = i_1575_ >> 10 & 0x3f;
			int i_1577_ = i_1575_ >> 7 & 0x7;
			int i_1578_ = i_1575_ & 0x7f;
			if (i != -1)
				i_1576_ += (i - i_1576_) * i_1573_ >> 7;
			if (i_1571_ != -1)
				i_1577_ += (i_1571_ - i_1577_) * i_1573_ >> 7;
			if (i_1572_ != -1)
				i_1578_ += (i_1572_ - i_1578_) * i_1573_ >> 7;
			((Class528_Sub3) this).aShortArray8918[i_1574_] = (short) (i_1576_ << 10 | i_1577_ << 7 | i_1578_);
		}
		if (((Class528_Sub3) this).aClass56Array8934 != null) {
			for (int i_1579_ = 0; i_1579_ < ((Class528_Sub3) this).anInt8951; i_1579_++) {
				Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i_1579_];
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i_1579_];
				((Class65) class65).anInt669 = (((Class65) class65).anInt669 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub3) this).aShortArray8918[((Class56) class56).anInt518]) & 0xffff]) & 0xffffff));
			}
		}
		method14269();
	}

	boolean method14307(int i, int i_1580_, int i_1581_, int i_1582_, int i_1583_, int i_1584_, int i_1585_, int i_1586_) {
		if (i_1580_ < i_1581_ && i_1580_ < i_1582_ && i_1580_ < i_1583_)
			return false;
		if (i_1580_ > i_1581_ && i_1580_ > i_1582_ && i_1580_ > i_1583_)
			return false;
		if (i < i_1584_ && i < i_1585_ && i < i_1586_)
			return false;
		if (i > i_1584_ && i > i_1585_ && i > i_1586_)
			return false;
		return true;
	}

	void method11261() {
		/* empty */
	}

	void method14308(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2) {
		if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
			anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
			anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++) {
			int i_1587_ = (((((Class528_Sub3) this).anIntArray8901[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453));
			int i_1588_ = (((((Class528_Sub3) this).anIntArray8931[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455));
			int i_1589_ = ((Class528_Sub3) this).anIntArray8947[i];
			int i_1590_ = ((Class528_Sub3) this).anIntArray8947[i + 1];
			for (int i_1591_ = i_1589_; i_1591_ < i_1590_; i_1591_++) {
				int i_1592_ = ((Class528_Sub3) this).aShortArray8948[i_1591_] - 1;
				if (i_1592_ == -1)
					break;
				anIntArray8928[i_1592_] = i_1587_;
				anIntArray8958[i_1592_] = i_1588_;
			}
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8963; i++) {
			if (((Class528_Sub3) this).aByteArray8900 == null || ((Class528_Sub3) this).aByteArray8900[i] <= 128) {
				short i_1593_ = ((Class528_Sub3) this).aShortArray8920[i];
				short i_1594_ = ((Class528_Sub3) this).aShortArray8921[i];
				short i_1595_ = ((Class528_Sub3) this).aShortArray8922[i];
				int i_1596_ = anIntArray8928[i_1593_];
				int i_1597_ = anIntArray8928[i_1594_];
				int i_1598_ = anIntArray8928[i_1595_];
				int i_1599_ = anIntArray8958[i_1593_];
				int i_1600_ = anIntArray8958[i_1594_];
				int i_1601_ = anIntArray8958[i_1595_];
				if (((i_1596_ - i_1597_) * (i_1600_ - i_1601_) - (i_1600_ - i_1599_) * (i_1598_ - i_1597_)) > 0)
					class282_sub50_sub17_sub2.method16043(i_1599_, i_1600_, i_1601_, i_1596_, i_1597_, i_1598_);
			}
		}
	}

	void method14309(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2) {
		if (anIntArray8928.length < ((Class528_Sub3) this).anInt8906) {
			anIntArray8928 = new int[((Class528_Sub3) this).anInt8906];
			anIntArray8958 = new int[((Class528_Sub3) this).anInt8906];
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++) {
			int i_1602_ = (((((Class528_Sub3) this).anIntArray8901[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453));
			int i_1603_ = (((((Class528_Sub3) this).anIntArray8931[i] - ((((Class528_Sub3) this).anIntArray8902[i] * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806) - (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455));
			int i_1604_ = ((Class528_Sub3) this).anIntArray8947[i];
			int i_1605_ = ((Class528_Sub3) this).anIntArray8947[i + 1];
			for (int i_1606_ = i_1604_; i_1606_ < i_1605_; i_1606_++) {
				int i_1607_ = ((Class528_Sub3) this).aShortArray8948[i_1606_] - 1;
				if (i_1607_ == -1)
					break;
				anIntArray8928[i_1607_] = i_1602_;
				anIntArray8958[i_1607_] = i_1603_;
			}
		}
		for (int i = 0; i < ((Class528_Sub3) this).anInt8963; i++) {
			if (((Class528_Sub3) this).aByteArray8900 == null || ((Class528_Sub3) this).aByteArray8900[i] <= 128) {
				short i_1608_ = ((Class528_Sub3) this).aShortArray8920[i];
				short i_1609_ = ((Class528_Sub3) this).aShortArray8921[i];
				short i_1610_ = ((Class528_Sub3) this).aShortArray8922[i];
				int i_1611_ = anIntArray8928[i_1608_];
				int i_1612_ = anIntArray8928[i_1609_];
				int i_1613_ = anIntArray8928[i_1610_];
				int i_1614_ = anIntArray8958[i_1608_];
				int i_1615_ = anIntArray8958[i_1609_];
				int i_1616_ = anIntArray8958[i_1610_];
				if (((i_1611_ - i_1612_) * (i_1615_ - i_1616_) - (i_1615_ - i_1614_) * (i_1613_ - i_1612_)) > 0)
					class282_sub50_sub17_sub2.method16043(i_1614_, i_1615_, i_1616_, i_1611_, i_1612_, i_1613_);
			}
		}
	}

	void method14310(Matrix44Var class294) {
		if (((Class528_Sub3) this).anInt8963 != 0 && (method14279() && method14271())) {
			if (aClass34_8938 == null) {
				/* empty */
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.method14004();
			Class48 class48 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass48_8794);
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(0, (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(1, (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(2, (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method13997(((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
			class48.method957(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
			class48.aClass384_454.method6518();
			if (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aBool8779) {
				Class90 class90 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13898();
				class48.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) -(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8739));
				class48.aClass303_458.scale(3.0F / (float) (class90.anInt945 * 973144081));
				class48.aClass385_459.set(((float) (class90.anInt946 * 1152775735 >> 16 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 8 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 0 & 0xff) / 255.0F));
			} else {
				class48.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.set(0.0F, 0.0F, 0.0F);
			}
			if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8811 > 0) {
				class48.aClass303_460.set(0.0F, 0.0F, 1.0F, -(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813));
				class48.aClass385_457.set((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 16 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 8 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 0 & 0xff) / 255.0F);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_458.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8740);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_460.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				class48.aClass303_460.scale(1.0F / ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8819) - (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813)));
			} else {
				class48.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.set(0.0F, 0.0F, 0.0F);
			}
			if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8721);
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(false);
				for (int i = 0; i < ((Class528_Sub3) this).anIntArray8952.length; i++) {
					int i_1617_ = ((Class528_Sub3) this).anIntArray8944[i];
					int i_1618_ = ((Class528_Sub3) this).anIntArray8944[i + 1];
					int i_1619_ = (((Class528_Sub3) this).aShortArray8923[i_1617_] & 0xffff);
					boolean bool = false;
					if (i_1619_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_1619_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1619_, -2098567516);
						bool = !Class282_Sub41.method13367(class169.aByte2064, (short) 16778);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i];
					class48.anInt469 = i_1617_ * 3;
					class48.anInt470 = i_1618_ - i_1617_;
					class48.method946(bool);
				}
			} else {
				((Class528_Sub3) this).aClass505_Sub2_8917.method14161(3, (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661));
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8836);
				Matrix44Var class294_1620_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass294_8713);
				class294_1620_.method5209(class294);
				class294_1620_.method5207();
				int i = 0;
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(true);
				else {
					class48.aClass385_466.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]));
					class48.aClass385_466.method6649(class294_1620_);
					class48.aClass385_448.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_464.set((-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_461.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831 > 0) {
						i = (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831);
						Vector3 class385 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass385_8707);
						for (int i_1621_ = 0; i_1621_ < i; i_1621_++) {
							Class282_Sub24 class282_sub24 = (((Class528_Sub3) this).aClass505_Sub2_8917.aClass282_Sub24Array8716[i_1621_]);
							int i_1622_ = class282_sub24.method12371(-2146625076);
							class385.copy(class282_sub24.aClass385_7687);
							class385.method6651(class294_1620_);
							class48.aFloatArray463[i_1621_ * 4 + 0] = class385.x;
							class48.aFloatArray463[i_1621_ * 4 + 1] = class385.y;
							class48.aFloatArray463[i_1621_ * 4 + 2] = class385.z;
							class48.aFloatArray463[i_1621_ * 4 + 3] = (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523));
							float f = (class282_sub24.method12395(-1204624285) / 255.0F);
							class48.aFloatArray450[i_1621_ * 4 + 0] = (float) (i_1622_ >> 16 & 0xff) * f;
							class48.aFloatArray450[i_1621_ * 4 + 1] = (float) (i_1622_ >> 8 & 0xff) * f;
							class48.aFloatArray450[i_1621_ * 4 + 2] = (float) (i_1622_ & 0xff) * f;
							class48.aFloatArray450[i_1621_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_1623_ = 0; i_1623_ < ((Class528_Sub3) this).anIntArray8952.length; i_1623_++) {
					int i_1624_ = ((Class528_Sub3) this).anIntArray8944[i_1623_];
					int i_1625_ = ((Class528_Sub3) this).anIntArray8944[i_1623_ + 1];
					int i_1626_ = (((Class528_Sub3) this).aShortArray8923[i_1624_] & 0xffff);
					byte i_1627_ = 11;
					if (i_1626_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_1626_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1626_, -2069200422);
						i_1627_ = class169.aByte2064;
						class48.method944(class169);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i_1623_];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i_1623_];
					class48.anInt469 = i_1624_ * 3;
					class48.anInt470 = i_1625_ - i_1624_;
					switch (i_1627_) {
					case 6:
						class48.method946(!Class282_Sub41.method13367(i_1627_, (short) 28342));
						break;
					case 1:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_1620_);
						class48.method948(i);
						break;
					case 7:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_1620_);
						class48.aClass384_465.method6522(class294);
						class48.anInterface31_451 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13965();
						class48.method949(i);
						break;
					case 5:
						if (!((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692) {
							Class41_Sub1_Sub2 class41_sub1_sub2 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass41_Sub1_Sub2_8798);
							Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1626_, -1790429899);
							class41_sub1_sub2.method15550(class169.aByte2076, (class169.anInt2077 * 1385119855), 987242313);
							class41_sub1_sub2.aClass384_10146.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8729);
							class41_sub1_sub2.anInt10152 = (((Class528_Sub3) this).anIntArray8952[i_1623_]) * -1086935879;
							class41_sub1_sub2.anInt10153 = (((Class528_Sub3) this).anIntArray8946[i_1623_]) * -1645796649;
							class41_sub1_sub2.anInt10142 = i_1624_ * 2006407467;
							class41_sub1_sub2.anInt10155 = (i_1625_ - i_1624_) * -1715708705;
							class41_sub1_sub2.method15549((short) 16890);
						} else
							class48.method965(i);
						break;
					default:
						class48.method965(i);
					}
				}
			}
			method14274();
		}
	}

	static short[] method14311(short[] is, int i) {
		short[] is_1628_ = new short[i];
		System.arraycopy(is, 0, is_1628_, 0, i);
		return is_1628_;
	}

	void method14312(Matrix44Var class294) {
		if (((Class528_Sub3) this).anInt8963 != 0 && (method14279() && method14271())) {
			if (aClass34_8938 == null) {
				/* empty */
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.method14004();
			Class48 class48 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass48_8794);
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(0, (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(1, (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method14161(2, (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661));
			((Class528_Sub3) this).aClass505_Sub2_8917.method13997(((Class39) ((Class528_Sub3) this).aClass39_8926).anInterface32_407);
			((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
			class48.method957(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
			class48.aClass384_454.method6518();
			if (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aBool8779) {
				Class90 class90 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13898();
				class48.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) -(((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8739));
				class48.aClass303_458.scale(3.0F / (float) (class90.anInt945 * 973144081));
				class48.aClass385_459.set(((float) (class90.anInt946 * 1152775735 >> 16 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 8 & 0xff) / 255.0F), ((float) (class90.anInt946 * 1152775735 >> 0 & 0xff) / 255.0F));
			} else {
				class48.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.set(0.0F, 0.0F, 0.0F);
			}
			if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8811 > 0) {
				class48.aClass303_460.set(0.0F, 0.0F, 1.0F, -(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813));
				class48.aClass385_457.set((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 16 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 8 & 0xff) / 255.0F, (float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8810) >> 0 & 0xff) / 255.0F);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_458.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6522(class294);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8740);
				((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683.method6520();
				class48.aClass303_460.concat(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8683);
				class48.aClass303_460.scale(1.0F / ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8819) - (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8813)));
			} else {
				class48.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.set(0.0F, 0.0F, 0.0F);
			}
			if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8721);
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(false);
				for (int i = 0; i < ((Class528_Sub3) this).anIntArray8952.length; i++) {
					int i_1629_ = ((Class528_Sub3) this).anIntArray8944[i];
					int i_1630_ = ((Class528_Sub3) this).anIntArray8944[i + 1];
					int i_1631_ = (((Class528_Sub3) this).aShortArray8923[i_1629_] & 0xffff);
					boolean bool = false;
					if (i_1631_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_1631_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1631_, -1969203671);
						bool = !Class282_Sub41.method13367(class169.aByte2064, (short) 16669);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i];
					class48.anInt469 = i_1629_ * 3;
					class48.anInt470 = i_1630_ - i_1629_;
					class48.method946(bool);
				}
			} else {
				((Class528_Sub3) this).aClass505_Sub2_8917.method14161(3, (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661));
				((Class528_Sub3) this).aClass505_Sub2_8917.method13996(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass70_8836);
				Matrix44Var class294_1632_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass294_8713);
				class294_1632_.method5209(class294);
				class294_1632_.method5207();
				int i = 0;
				if (((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692)
					((Class528_Sub3) this).aClass505_Sub2_8917.method13946(true);
				else {
					class48.aClass385_466.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]));
					class48.aClass385_466.method6649(class294_1632_);
					class48.aClass385_448.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_464.set((-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (-(((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					class48.aClass385_461.set((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767)), (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769 * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768)));
					if (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831 > 0) {
						i = (((Class528_Sub3) this).aClass505_Sub2_8917.anInt8831);
						Vector3 class385 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass385_8707);
						for (int i_1633_ = 0; i_1633_ < i; i_1633_++) {
							Class282_Sub24 class282_sub24 = (((Class528_Sub3) this).aClass505_Sub2_8917.aClass282_Sub24Array8716[i_1633_]);
							int i_1634_ = class282_sub24.method12371(-2146530448);
							class385.copy(class282_sub24.aClass385_7687);
							class385.method6651(class294_1632_);
							class48.aFloatArray463[i_1633_ * 4 + 0] = class385.x;
							class48.aFloatArray463[i_1633_ * 4 + 1] = class385.y;
							class48.aFloatArray463[i_1633_ * 4 + 2] = class385.z;
							class48.aFloatArray463[i_1633_ * 4 + 3] = (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523));
							float f = (class282_sub24.method12395(896654546) / 255.0F);
							class48.aFloatArray450[i_1633_ * 4 + 0] = (float) (i_1634_ >> 16 & 0xff) * f;
							class48.aFloatArray450[i_1633_ * 4 + 1] = (float) (i_1634_ >> 8 & 0xff) * f;
							class48.aFloatArray450[i_1633_ * 4 + 2] = (float) (i_1634_ & 0xff) * f;
							class48.aFloatArray450[i_1633_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_1635_ = 0; i_1635_ < ((Class528_Sub3) this).anIntArray8952.length; i_1635_++) {
					int i_1636_ = ((Class528_Sub3) this).anIntArray8944[i_1635_];
					int i_1637_ = ((Class528_Sub3) this).anIntArray8944[i_1635_ + 1];
					int i_1638_ = (((Class528_Sub3) this).aShortArray8923[i_1636_] & 0xffff);
					byte i_1639_ = 11;
					if (i_1638_ != 65535) {
						class48.anInterface6_452 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(i_1638_);
						Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1638_, -1886850219);
						i_1639_ = class169.aByte2064;
						class48.method944(class169);
						class48.aClass384_454.buf[12] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2081 / 64.0F % 1.0F);
						class48.aClass384_454.buf[13] = ((float) ((((Class528_Sub3) this).aClass505_Sub2_8917.anInt8820) % 128000) / 1000.0F * (float) class169.aByte2090 / 64.0F % 1.0F);
					} else {
						class48.anInterface6_452 = (((Class528_Sub3) this).aClass505_Sub2_8917.anInterface6_8788);
						float[] fs = class48.aClass384_454.buf;
						class48.aClass384_454.buf[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class48.anInt467 = ((Class528_Sub3) this).anIntArray8952[i_1635_];
					class48.anInt468 = ((Class528_Sub3) this).anIntArray8946[i_1635_];
					class48.anInt469 = i_1636_ * 3;
					class48.anInt470 = i_1637_ - i_1636_;
					switch (i_1639_) {
					case 6:
						class48.method946(!Class282_Sub41.method13367(i_1639_, (short) 28816));
						break;
					case 1:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_1632_);
						class48.method948(i);
						break;
					case 7:
						class48.aClass385_455.set((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[12]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[13]), (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8814.buf[14]));
						class48.aClass385_455.method6651(class294_1632_);
						class48.aClass384_465.method6522(class294);
						class48.anInterface31_451 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13965();
						class48.method949(i);
						break;
					case 5:
						if (!((Class528_Sub3) this).aClass505_Sub2_8917.aBool8692) {
							Class41_Sub1_Sub2 class41_sub1_sub2 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass41_Sub1_Sub2_8798);
							Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1638_, -1800256949);
							class41_sub1_sub2.method15550(class169.aByte2076, (class169.anInt2077 * 1385119855), 892227812);
							class41_sub1_sub2.aClass384_10146.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6522(class294);
							class41_sub1_sub2.aClass384_10138.method6523(((Class528_Sub3) this).aClass505_Sub2_8917.aClass384_8729);
							class41_sub1_sub2.anInt10152 = (((Class528_Sub3) this).anIntArray8952[i_1635_]) * -1086935879;
							class41_sub1_sub2.anInt10153 = (((Class528_Sub3) this).anIntArray8946[i_1635_]) * -1645796649;
							class41_sub1_sub2.anInt10142 = i_1636_ * 2006407467;
							class41_sub1_sub2.anInt10155 = (i_1637_ - i_1636_) * -1715708705;
							class41_sub1_sub2.method15549((short) 27804);
						} else
							class48.method965(i);
						break;
					default:
						class48.method965(i);
					}
				}
			}
			method14274();
		}
	}

	void method14313(Matrix44Arr class384) {
		if (((Class528_Sub3) this).aClass56Array8934 != null) {
			((Class528_Sub3) this).aClass505_Sub2_8917.RA(!((Class528_Sub3) this).aBool8959);
			Matrix44Var class294 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass294_8713);
			Class103 class103 = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass103_8796);
			for (int i = 0; i < ((Class528_Sub3) this).anInt8951; i++) {
				Class56 class56 = ((Class528_Sub3) this).aClass56Array8934[i];
				Class65 class65 = ((Class528_Sub3) this).aClass65Array8953[i];
				if (!((Class56) class56).aBool522 || !((Class528_Sub3) this).aClass505_Sub2_8917.method8471()) {
					float f = ((float) ((((Class528_Sub3) this).anIntArray8901[((Class56) class56).anInt517]) + (((Class528_Sub3) this).anIntArray8901[((Class56) class56).anInt515]) + (((Class528_Sub3) this).anIntArray8901[((Class56) class56).anInt521])) * 0.3333333F);
					float f_1640_ = ((float) ((((Class528_Sub3) this).anIntArray8902[((Class56) class56).anInt517]) + (((Class528_Sub3) this).anIntArray8902[((Class56) class56).anInt515]) + (((Class528_Sub3) this).anIntArray8902[((Class56) class56).anInt521])) * 0.3333333F);
					float f_1641_ = ((float) ((((Class528_Sub3) this).anIntArray8931[((Class56) class56).anInt517]) + (((Class528_Sub3) this).anIntArray8931[((Class56) class56).anInt515]) + (((Class528_Sub3) this).anIntArray8931[((Class56) class56).anInt521])) * 0.3333333F);
					float f_1642_ = (class384.buf[0] * f + class384.buf[4] * f_1640_ + class384.buf[8] * f_1641_ + class384.buf[12]);
					float f_1643_ = (class384.buf[1] * f + class384.buf[5] * f_1640_ + class384.buf[9] * f_1641_ + class384.buf[13]);
					float f_1644_ = (class384.buf[2] * f + class384.buf[6] * f_1640_ + class384.buf[10] * f_1641_ + class384.buf[14]);
					float f_1645_ = ((float) (1.0 / Math.sqrt((double) (f_1642_ * f_1642_ + f_1643_ * f_1643_ + (f_1644_ * f_1644_)))) * (float) ((Class56) class56).anInt523);
					class294.method5213(((Class65) class65).anInt673, (((Class65) class65).anInt671 * ((Class56) class56).aShort519) >> 7, (((Class65) class65).anInt670 * ((Class56) class56).aShort520) >> 7, (f_1642_ + (float) ((Class65) class65).anInt668 - f_1642_ * f_1645_), (f_1643_ + (float) ((Class65) class65).anInt672 - f_1643_ * f_1645_), f_1644_ - f_1644_ * f_1645_);
					class294.method5208(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass294_8804);
					((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass384_8715.method6522(class294);
					class103.method1788(((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).aClass384_8715);
					class103.aClass384_1058.method6518();
					class103.anInt1056 = ((Class65) class65).anInt669;
					class103.anInterface6_1059 = ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).aClass66_8787.method1283(((Class56) class56).aShort516);
					class103.method1790();
				}
			}
			((Class528_Sub3) this).aClass505_Sub2_8917.RA(true);
		}
	}

	boolean method14314() {
		boolean bool = !((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662;
		boolean bool_1646_ = ((((Class528_Sub3) this).anInt8896 & 0x37) != 0 && !((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662);
		boolean bool_1647_ = !((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662;
		boolean bool_1648_ = !((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662;
		if (!bool_1647_ && !bool && !bool_1646_ && !bool_1648_)
			return true;
		boolean bool_1649_ = true;
		if (bool_1647_ && ((Class528_Sub3) this).aShortArray8907 != null) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 12, 12);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 12;
				long l = interface4.method40(0, i);
				for (int i_1650_ = 0; i_1650_ < ((Class528_Sub3) this).anInt8906; i_1650_++) {
					short i_1651_ = ((Class528_Sub3) this).aShortArray8907[i_1650_];
					unsafe.putFloat(l, (float) (((Class528_Sub3) this).anIntArray8901[i_1651_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class528_Sub3) this).anIntArray8902[i_1651_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class528_Sub3) this).anIntArray8931[i_1651_]));
					l += 4L;
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
					bytebuffer.putFloat((float) ((Class528_Sub3) this).anIntArray8901[(((Class528_Sub3) this).aShortArray8907[i])]);
					bytebuffer.putFloat((float) ((Class528_Sub3) this).anIntArray8902[(((Class528_Sub3) this).aShortArray8907[i])]);
					bytebuffer.putFloat((float) ((Class528_Sub3) this).anIntArray8931[(((Class528_Sub3) this).aShortArray8907[i])]);
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8927).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8927).aBool662 = true;
		}
		if (bool) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 4, 4);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 4;
				long l = interface4.method40(0, i);
				if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
					short[] is;
					short[] is_1652_;
					short[] is_1653_;
					byte[] is_1654_;
					if (((Class528_Sub3) this).aClass355_8962 != null) {
						is = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4115;
						is_1652_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4114;
						is_1653_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4113;
						is_1654_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aByteArray4116;
					} else {
						is = ((Class528_Sub3) this).aShortArray8909;
						is_1652_ = ((Class528_Sub3) this).aShortArray8933;
						is_1653_ = ((Class528_Sub3) this).aShortArray8911;
						is_1654_ = ((Class528_Sub3) this).aByteArray8912;
					}
					float f = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					float f_1655_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					for (int i_1656_ = 0; i_1656_ < ((Class528_Sub3) this).anInt8906; i_1656_++) {
						short i_1657_ = ((Class528_Sub3) this).aShortArray8945[i_1656_];
						int i_1658_ = method14282((((Class528_Sub3) this).aShortArray8918[i_1657_]) & 0xffff, (((Class528_Sub3) this).aShortArray8923[i_1657_]), ((Class528_Sub3) this).aShort8897);
						float f_1659_ = ((float) (i_1658_ >> 16 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766));
						float f_1660_ = ((float) (i_1658_ >> 8 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767));
						float f_1661_ = ((float) (i_1658_ & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768));
						byte i_1662_ = is_1654_[i_1656_];
						float f_1663_;
						if (i_1662_ == 0)
							f_1663_ = (((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i_1656_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_1652_[i_1656_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_1653_[i_1656_]) * 0.0026041667F);
						else
							f_1663_ = (((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i_1656_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_1652_[i_1656_] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_1653_[i_1656_]) / ((float) i_1662_ * 256.0F));
						float f_1664_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769) + f_1663_ * (f_1663_ < 0.0F ? f_1655_ : f));
						int i_1665_ = (int) (f_1659_ * f_1664_);
						if (i_1665_ < 0)
							i_1665_ = 0;
						else if (i_1665_ > 255)
							i_1665_ = 255;
						int i_1666_ = (int) (f_1660_ * f_1664_);
						if (i_1666_ < 0)
							i_1666_ = 0;
						else if (i_1666_ > 255)
							i_1666_ = 255;
						int i_1667_ = (int) (f_1661_ * f_1664_);
						if (i_1667_ < 0)
							i_1667_ = 0;
						else if (i_1667_ > 255)
							i_1667_ = 255;
						unsafe.putInt(l, (255 - (((Class528_Sub3) this).aByteArray8900[i_1657_]) << 24 | i_1665_ << 16 | i_1666_ << 8 | i_1667_));
						l += 4L;
					}
				} else {
					for (int i_1668_ = 0; i_1668_ < ((Class528_Sub3) this).anInt8906; i_1668_++) {
						short i_1669_ = ((Class528_Sub3) this).aShortArray8945[i_1668_];
						int i_1670_ = (255 - (((Class528_Sub3) this).aByteArray8900[i_1669_]) << 24 | method14282(((((Class528_Sub3) this).aShortArray8918[i_1669_]) & 0xffff), (((Class528_Sub3) this).aShortArray8923[i_1669_]), (((Class528_Sub3) this).aShort8897)));
						unsafe.putInt(l, i_1670_);
						l += 4L;
					}
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				if ((((Class528_Sub3) this).anInt8896 & 0x37) == 0) {
					short[] is;
					short[] is_1671_;
					short[] is_1672_;
					byte[] is_1673_;
					if (((Class528_Sub3) this).aClass355_8962 != null) {
						is = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4115;
						is_1671_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4114;
						is_1672_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aShortArray4113;
						is_1673_ = ((Class355) (((Class528_Sub3) this).aClass355_8962)).aByteArray4116;
					} else {
						is = ((Class528_Sub3) this).aShortArray8909;
						is_1671_ = ((Class528_Sub3) this).aShortArray8933;
						is_1672_ = ((Class528_Sub3) this).aShortArray8911;
						is_1673_ = ((Class528_Sub3) this).aByteArray8912;
					}
					float f = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8770) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					float f_1674_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8826) * 768.0F / (float) ((Class528_Sub3) this).aShort8898);
					for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
						short i_1675_ = ((Class528_Sub3) this).aShortArray8945[i];
						int i_1676_ = method14282((((Class528_Sub3) this).aShortArray8918[i_1675_]) & 0xffff, (((Class528_Sub3) this).aShortArray8923[i_1675_]), ((Class528_Sub3) this).aShort8897);
						float f_1677_ = ((float) (i_1676_ >> 16 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8766));
						float f_1678_ = ((float) (i_1676_ >> 8 & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8767));
						float f_1679_ = ((float) (i_1676_ & 0xff) * (((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8768));
						byte i_1680_ = is_1673_[i];
						float f_1681_;
						if (i_1680_ == 0)
							f_1681_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i] + ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_1671_[i]) + ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_1672_[i])) * 0.0026041667F;
						else
							f_1681_ = (((((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[0]) * (float) is[i] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[1]) * (float) is_1671_[i] + (((Class528_Sub3) this).aClass505_Sub2_8917.aFloatArray8747[2]) * (float) is_1672_[i]) / ((float) i_1680_ * 256.0F));
						float f_1682_ = ((((Class528_Sub3) this).aClass505_Sub2_8917.aFloat8769) + f_1681_ * (f_1681_ < 0.0F ? f_1674_ : f));
						int i_1683_ = (int) (f_1677_ * f_1682_);
						if (i_1683_ < 0)
							i_1683_ = 0;
						else if (i_1683_ > 255)
							i_1683_ = 255;
						int i_1684_ = (int) (f_1678_ * f_1682_);
						if (i_1684_ < 0)
							i_1684_ = 0;
						else if (i_1684_ > 255)
							i_1684_ = 255;
						int i_1685_ = (int) (f_1679_ * f_1682_);
						if (i_1685_ < 0)
							i_1685_ = 0;
						else if (i_1685_ > 255)
							i_1685_ = 255;
						bytebuffer.putInt((255 - (((Class528_Sub3) this).aByteArray8900[i_1675_]) << 24) | i_1683_ << 16 | i_1684_ << 8 | i_1685_);
					}
				} else {
					for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
						short i_1686_ = ((Class528_Sub3) this).aShortArray8945[i];
						int i_1687_ = (255 - (((Class528_Sub3) this).aByteArray8900[i_1686_]) << 24 | method14282(((((Class528_Sub3) this).aShortArray8918[i_1686_]) & 0xffff), (((Class528_Sub3) this).aShortArray8923[i_1686_]), (((Class528_Sub3) this).aShort8897)));
						bytebuffer.putInt(i_1687_);
					}
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8913).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8913).aBool662 = true;
		}
		if (bool_1646_) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 12, 12);
			short[] is;
			short[] is_1688_;
			short[] is_1689_;
			byte[] is_1690_;
			if (((Class528_Sub3) this).aClass355_8962 != null) {
				is = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4115);
				is_1688_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4114);
				is_1689_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aShortArray4113);
				is_1690_ = (((Class355) ((Class528_Sub3) this).aClass355_8962).aByteArray4116);
			} else {
				is = ((Class528_Sub3) this).aShortArray8909;
				is_1688_ = ((Class528_Sub3) this).aShortArray8933;
				is_1689_ = ((Class528_Sub3) this).aShortArray8911;
				is_1690_ = ((Class528_Sub3) this).aByteArray8912;
			}
			float f = 3.0F / (float) ((Class528_Sub3) this).aShort8898;
			float f_1691_ = 3.0F / (float) (((Class528_Sub3) this).aShort8898 + ((Class528_Sub3) this).aShort8898 / 2);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 12;
				long l = interface4.method40(0, i);
				for (int i_1692_ = 0; i_1692_ < ((Class528_Sub3) this).anInt8906; i_1692_++) {
					float f_1693_ = (is_1690_[i_1692_] == 0 ? f_1691_ : f / (float) is_1690_[i_1692_]);
					float f_1694_ = (float) is[i_1692_] * f_1693_;
					float f_1695_ = (float) is_1688_[i_1692_] * f_1693_;
					float f_1696_ = (float) is_1689_[i_1692_] * f_1693_;
					unsafe.putFloat(l, f_1694_);
					l += 4L;
					unsafe.putFloat(l, f_1695_);
					l += 4L;
					unsafe.putFloat(l, f_1696_);
					l += 4L;
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
					float f_1697_ = is_1690_[i] == 0 ? f_1691_ : f / (float) is_1690_[i];
					float f_1698_ = (float) is[i] * f_1697_;
					float f_1699_ = (float) is_1688_[i] * f_1697_;
					float f_1700_ = (float) is_1689_[i] * f_1697_;
					bytebuffer.putFloat(f_1698_);
					bytebuffer.putFloat(f_1699_);
					bytebuffer.putFloat(f_1700_);
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8929).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8929).aBool662 = true;
		}
		if (bool_1648_) {
			if ((((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664) == null)
				((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664 = ((Class528_Sub3) this).aClass505_Sub2_8917.method13994(((Class528_Sub3) this).aBool8904);
			Interface4 interface4 = (((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_664);
			interface4.method31(((Class528_Sub3) this).anInt8906 * 8, 8);
			Unsafe unsafe = ((Class528_Sub3) this).aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe != null) {
				int i = ((Class528_Sub3) this).anInt8906 * 8;
				long l = interface4.method40(0, i);
				for (int i_1701_ = 0; i_1701_ < ((Class528_Sub3) this).anInt8906; i_1701_++) {
					unsafe.putFloat(l, (((Class528_Sub3) this).aFloatArray8892[i_1701_]));
					l += 4L;
					unsafe.putFloat(l, (((Class528_Sub3) this).aFloatArray8914[i_1701_]));
					l += 4L;
				}
				interface4.method38();
			} else {
				ByteBuffer bytebuffer = (((Class528_Sub3) this).aClass505_Sub2_8917.aByteBuffer8838);
				bytebuffer.clear();
				for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++) {
					bytebuffer.putFloat(((Class528_Sub3) this).aFloatArray8892[i]);
					bytebuffer.putFloat(((Class528_Sub3) this).aFloatArray8914[i]);
				}
				interface4.method42(0, bytebuffer.position(), (((Class528_Sub3) this).aClass505_Sub2_8917.aLong8695));
			}
			((Class63) ((Class528_Sub3) this).aClass63_8930).anInterface4_661 = interface4;
			((Class63) ((Class528_Sub3) this).aClass63_8930).aBool662 = true;
		}
		return bool_1649_;
	}

	void method14315() {
		if (((Class528_Sub3) this).aClass63_8927 != null)
			((Class528_Sub3) this).aClass63_8927.method1266();
		if (((Class528_Sub3) this).aClass63_8930 != null)
			((Class528_Sub3) this).aClass63_8930.method1266();
		if (((Class528_Sub3) this).aClass63_8913 != null)
			((Class528_Sub3) this).aClass63_8913.method1266();
		if (((Class528_Sub3) this).aClass63_8929 != null)
			((Class528_Sub3) this).aClass63_8929.method1266();
		if (((Class528_Sub3) this).aClass39_8926 != null)
			((Class528_Sub3) this).aClass39_8926.method863();
	}

	public Class282_Sub50_Sub17 da(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub3) this).anInt8906 == 0)
			return null;
		if (!((Class528_Sub3) this).aBool8937)
			method14281();
		int i;
		int i_1702_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) > 0) {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1702_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i = ((((Class528_Sub3) this).anInt8940 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1702_ = ((((Class528_Sub3) this).anInt8941 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8777) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1703_;
		int i_1704_;
		if ((((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8778) > 0) {
			i_1703_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1704_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		} else {
			i_1703_ = ((((Class528_Sub3) this).anInt8942 - ((((Class528_Sub3) this).anInt8908 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
			i_1704_ = ((((Class528_Sub3) this).anInt8943 - ((((Class528_Sub3) this).anInt8893 * ((Class505_Sub2) (((Class528_Sub3) this).aClass505_Sub2_8917)).anInt8778) >> 8)) >> ((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anInt8806);
		}
		int i_1705_ = i_1702_ - i + 1;
		int i_1706_ = i_1704_ - i_1703_ + 1;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_1707_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_1705_, i_1706_)) {
			class282_sub50_sub17_sub2_1707_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_1707_.method16042();
		} else
			class282_sub50_sub17_sub2_1707_ = new Class282_Sub50_Sub17_Sub2((((Class528_Sub3) this).aClass505_Sub2_8917), i_1705_, i_1706_);
		class282_sub50_sub17_sub2_1707_.method16040(i, i_1703_, i_1702_, i_1704_);
		method14277(class282_sub50_sub17_sub2_1707_);
		return class282_sub50_sub17_sub2_1707_;
	}

	int method14316(int i, int i_1708_) {
		i_1708_ = i_1708_ * (i & 0x7f) >> 7;
		if (i_1708_ < 2)
			i_1708_ = 2;
		else if (i_1708_ > 126)
			i_1708_ = 126;
		return (i & 0xff80) + i_1708_;
	}

	int method14317(int i, int i_1709_) {
		i_1709_ = i_1709_ * (i & 0x7f) >> 7;
		if (i_1709_ < 2)
			i_1709_ = 2;
		else if (i_1709_ > 126)
			i_1709_ = 126;
		return (i & 0xff80) + i_1709_;
	}

	int method14318(int i, int i_1710_) {
		i_1710_ = i_1710_ * (i & 0x7f) >> 7;
		if (i_1710_ < 2)
			i_1710_ = 2;
		else if (i_1710_ > 126)
			i_1710_ = 126;
		return (i & 0xff80) + i_1710_;
	}

	int method14319(int i, int i_1711_) {
		i_1711_ = i_1711_ * (i & 0x7f) >> 7;
		if (i_1711_ < 2)
			i_1711_ = 2;
		else if (i_1711_ > 126)
			i_1711_ = 126;
		return (i & 0xff80) + i_1711_;
	}

	int method14320(int i, int i_1712_) {
		i_1712_ = i_1712_ * (i & 0x7f) >> 7;
		if (i_1712_ < 2)
			i_1712_ = 2;
		else if (i_1712_ > 126)
			i_1712_ = 126;
		return (i & 0xff80) + i_1712_;
	}

	public void be() {
		for (int i = 0; i < ((Class528_Sub3) this).anInt8910; i++)
			((Class528_Sub3) this).anIntArray8931[i] = -((Class528_Sub3) this).anIntArray8931[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8906; i++)
			((Class528_Sub3) this).aShortArray8911[i] = (short) -((Class528_Sub3) this).aShortArray8911[i];
		for (int i = 0; i < ((Class528_Sub3) this).anInt8916; i++) {
			short i_1713_ = ((Class528_Sub3) this).aShortArray8920[i];
			((Class528_Sub3) this).aShortArray8920[i] = ((Class528_Sub3) this).aShortArray8922[i];
			((Class528_Sub3) this).aShortArray8922[i] = i_1713_;
		}
		method14268();
		method14285();
		method14270();
		((Class528_Sub3) this).aBool8937 = false;
	}

	int method14321(int i, short i_1714_, int i_1715_) {
		int i_1716_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anIntArray8803[method14290(i, i_1715_)]);
		if (i_1714_ != -1) {
			Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1714_ & 0xffff, -1851638312);
			int i_1717_ = class169.aByte2079 & 0xff;
			if (i_1717_ != 0) {
				int i_1718_ = 131586 * i_1715_;
				if (i_1717_ == 256)
					i_1716_ = i_1718_;
				else {
					int i_1719_ = i_1717_;
					int i_1720_ = 256 - i_1717_;
					i_1716_ = ((((i_1718_ & 0xff00ff) * i_1719_ + (i_1716_ & 0xff00ff) * i_1720_) & ~0xff00ff) + (((i_1718_ & 0xff00) * i_1719_ + (i_1716_ & 0xff00) * i_1720_) & 0xff0000)) >> 8;
				}
			}
			int i_1721_ = class169.aByte2080 & 0xff;
			if (i_1721_ != 0) {
				i_1721_ += 256;
				int i_1722_ = ((i_1716_ & 0xff0000) >> 16) * i_1721_;
				if (i_1722_ > 65535)
					i_1722_ = 65535;
				int i_1723_ = ((i_1716_ & 0xff00) >> 8) * i_1721_;
				if (i_1723_ > 65535)
					i_1723_ = 65535;
				int i_1724_ = (i_1716_ & 0xff) * i_1721_;
				if (i_1724_ > 65535)
					i_1724_ = 65535;
				i_1716_ = (i_1722_ << 8 & 0xff0000) + (i_1723_ & 0xff00) + (i_1724_ >> 8);
			}
		}
		return i_1716_ & 0xffffff;
	}

	int method14322(int i, short i_1725_, int i_1726_) {
		int i_1727_ = (((Class505_Sub2) ((Class528_Sub3) this).aClass505_Sub2_8917).anIntArray8803[method14290(i, i_1726_)]);
		if (i_1725_ != -1) {
			Class169 class169 = ((Class528_Sub3) this).aClass505_Sub2_8917.anInterface22_5834.method144(i_1725_ & 0xffff, -1998071603);
			int i_1728_ = class169.aByte2079 & 0xff;
			if (i_1728_ != 0) {
				int i_1729_ = 131586 * i_1726_;
				if (i_1728_ == 256)
					i_1727_ = i_1729_;
				else {
					int i_1730_ = i_1728_;
					int i_1731_ = 256 - i_1728_;
					i_1727_ = ((((i_1729_ & 0xff00ff) * i_1730_ + (i_1727_ & 0xff00ff) * i_1731_) & ~0xff00ff) + (((i_1729_ & 0xff00) * i_1730_ + (i_1727_ & 0xff00) * i_1731_) & 0xff0000)) >> 8;
				}
			}
			int i_1732_ = class169.aByte2080 & 0xff;
			if (i_1732_ != 0) {
				i_1732_ += 256;
				int i_1733_ = ((i_1727_ & 0xff0000) >> 16) * i_1732_;
				if (i_1733_ > 65535)
					i_1733_ = 65535;
				int i_1734_ = ((i_1727_ & 0xff00) >> 8) * i_1732_;
				if (i_1734_ > 65535)
					i_1734_ = 65535;
				int i_1735_ = (i_1727_ & 0xff) * i_1732_;
				if (i_1735_ > 65535)
					i_1735_ = 65535;
				i_1727_ = (i_1733_ << 8 & 0xff0000) + (i_1734_ & 0xff00) + (i_1735_ >> 8);
			}
		}
		return i_1727_ & 0xffffff;
	}
}
