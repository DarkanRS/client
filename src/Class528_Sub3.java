import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class528_Sub3 extends MeshRasterizer {

	static Class34 aClass34_8938;
	static float[] aFloatArray8956 = new float[2];
	static int[] anIntArray8928 = new int[1];
	static int[] anIntArray8958 = new int[1];
	static int[] anIntArray8894 = new int[8];
	static int[] anIntArray8960 = new int[8];
	static int[] anIntArray8961 = new int[8];
	boolean aBool8903;
	int anInt8906;
	int anInt8895;
	int anInt8896;
	short aShort8897;
	short aShort8898;
	int anInt8899;
	int anInt8910;
	int anInt8916;
	int anInt8963;
	int anInt8951;
	boolean aBool8959;
	int[] anIntArray8901;
	int[] anIntArray8902;
	int[] anIntArray8931;
	Class63 aClass63_8927;
	short[] aShortArray8918;
	byte[] aByteArray8900;
	Class63 aClass63_8913;
	Class355 aClass355_8962;
	short[] aShortArray8909;
	short[] aShortArray8933;
	short[] aShortArray8911;
	byte[] aByteArray8912;
	Class63 aClass63_8929;
	float[] aFloatArray8892;
	float[] aFloatArray8914;
	Class63 aClass63_8930;
	short[] aShortArray8920;
	short[] aShortArray8921;
	short[] aShortArray8922;
	Class39 aClass39_8926;
	short[] aShortArray8923;
	Class65[] aClass65Array8953;
	Class56[] aClass56Array8934;
	boolean aBool8937;
	int anInt8957;
	int anInt8936;
	int anInt8940;
	int anInt8941;
	int anInt8908;
	int anInt8893;
	int anInt8942;
	int anInt8943;
	int[][] anIntArrayArray8966;
	int[][] anIntArrayArray8924;
	int[][] anIntArrayArray8954;
	short[] aShortArray8948;
	int[] anIntArray8947;
	short[] aShortArray8907;
	short[] aShortArray8945;
	short[] aShortArray8905;
	short[] aShortArray8925;
	int[] anIntArray8944;
	int[] anIntArray8946;
	int[] anIntArray8952;
	Class87[] aClass87Array8949;
	Class172[] aClass172Array8950;
	boolean aBool8919;
	static long[] aLongArray8955;
	static int anInt8932;
	static int anInt8939;
	static int anInt8964;
	static boolean aBool8965;
	boolean aBool8904;
	Class505_Sub2 aClass505_Sub2_8917;

	public int ci() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8940;
	}

	public MeshRasterizer method11278(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		Class528_Sub3 class528_sub3_5;
		Class528_Sub3 class528_sub3_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub3_6 = this.aClass505_Sub2_8917.aClass528_Sub3Array8840[b_1 - 1];
			class528_sub3_5 = this.aClass505_Sub2_8917.aClass528_Sub3Array8839[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub3_5 = class528_sub3_6 = new Class528_Sub3(this.aClass505_Sub2_8917, 0, 0, true, false);
		}

		return this.method14267(class528_sub3_5, class528_sub3_6, i_2, bool_4, bool_3);
	}

	public void di(short s_1, short s_2) {
		Interface22 interface22_3 = this.aClass505_Sub2_8917.anInterface22_5834;

		for (int i_4 = 0; i_4 < this.anInt8916 * 3 * -1431655765; i_4++) {
			if (this.aShortArray8923[i_4] == s_1) {
				this.aShortArray8923[i_4] = s_2;
			}
		}

		byte b_13 = 0;
		byte b_5 = 0;
		if (s_1 != -1) {
			Class169 class169_6 = interface22_3.method144(s_1 & 0xffff, -2107912111);
			b_13 = class169_6.aByte2079;
			b_5 = class169_6.aByte2080;
		}

		byte b_11 = 0;
		byte b_7 = 0;
		if (s_2 != -1) {
			Class169 class169_8 = interface22_3.method144(s_2 & 0xffff, -2138461043);
			b_11 = class169_8.aByte2079;
			b_7 = class169_8.aByte2080;
			if (class169_8.aByte2081 != 0 || class169_8.aByte2090 != 0) {
				this.aBool8903 = true;
			}
		}

		if (b_13 != b_11 | b_5 != b_7) {
			if (this.aClass56Array8934 != null) {
				for (int i_12 = 0; i_12 < this.anInt8951; i_12++) {
					Class56 class56_9 = this.aClass56Array8934[i_12];
					Class65 class65_10 = this.aClass65Array8953[i_12];
					class65_10.anInt669 = class65_10.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_9.anInt518] & 0xffff] & 0xffffff;
				}
			}

			this.method14269();
		}

	}

	static byte[] method14265(byte[] bytes_0, int i_1) {
		byte[] bytes_2 = new byte[i_1];
		System.arraycopy(bytes_0, 0, bytes_2, 0, i_1);
		return bytes_2;
	}

	public int cm() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8908;
	}

	public boolean dh() {
		return this.aBool8903;
	}

	public int cw() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8908;
	}

	public MeshRasterizer method11277(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		Class528_Sub3 class528_sub3_5;
		Class528_Sub3 class528_sub3_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub3_6 = this.aClass505_Sub2_8917.aClass528_Sub3Array8840[b_1 - 1];
			class528_sub3_5 = this.aClass505_Sub2_8917.aClass528_Sub3Array8839[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub3_5 = class528_sub3_6 = new Class528_Sub3(this.aClass505_Sub2_8917, 0, 0, true, false);
		}

		return this.method14267(class528_sub3_5, class528_sub3_6, i_2, bool_4, bool_3);
	}

	short method14266(RSMesh rsmesh_1, int i_2, int i_3, long long_4, int i_6, int i_7, int i_8, int i_9, float f_10, float f_11) {
		int i_12 = this.anIntArray8947[i_2];
		int i_13 = this.anIntArray8947[i_2 + 1];
		int i_14 = 0;

		for (int i_15 = i_12; i_15 < i_13; i_15++) {
			short s_16 = this.aShortArray8948[i_15];
			if (s_16 == 0) {
				i_14 = i_15;
				break;
			}

			if (aLongArray8955[i_15] == long_4) {
				return (short) (s_16 - 1);
			}
		}

		this.aShortArray8948[i_14] = (short) (this.anInt8906 + 1);
		aLongArray8955[i_14] = long_4;
		this.aShortArray8945[this.anInt8906] = (short) i_3;
		this.aShortArray8907[this.anInt8906] = (short) i_2;
		this.aShortArray8909[this.anInt8906] = (short) i_6;
		this.aShortArray8933[this.anInt8906] = (short) i_7;
		this.aShortArray8911[this.anInt8906] = (short) i_8;
		this.aByteArray8912[this.anInt8906] = (byte) i_9;
		this.aFloatArray8892[this.anInt8906] = f_10;
		this.aFloatArray8914[this.anInt8906] = f_11;
		return (short) (this.anInt8906++);
	}

	public MeshRasterizer method11289(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		Class528_Sub3 class528_sub3_5;
		Class528_Sub3 class528_sub3_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub3_6 = this.aClass505_Sub2_8917.aClass528_Sub3Array8840[b_1 - 1];
			class528_sub3_5 = this.aClass505_Sub2_8917.aClass528_Sub3Array8839[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub3_5 = class528_sub3_6 = new Class528_Sub3(this.aClass505_Sub2_8917, 0, 0, true, false);
		}

		return this.method14267(class528_sub3_5, class528_sub3_6, i_2, bool_4, bool_3);
	}

	MeshRasterizer method14267(Class528_Sub3 class528_sub3_1, Class528_Sub3 class528_sub3_2, int i_3, boolean bool_4, boolean bool_5) {
		class528_sub3_1.anInt8895 = i_3;
		class528_sub3_1.anInt8896 = this.anInt8896;
		class528_sub3_1.aShort8897 = this.aShort8897;
		class528_sub3_1.aShort8898 = this.aShort8898;
		class528_sub3_1.anInt8899 = this.anInt8899;
		class528_sub3_1.anInt8910 = this.anInt8910;
		class528_sub3_1.anInt8906 = this.anInt8906;
		class528_sub3_1.anInt8916 = this.anInt8916;
		class528_sub3_1.anInt8963 = this.anInt8963;
		class528_sub3_1.anInt8951 = this.anInt8951;
		if ((i_3 & 0x100) != 0) {
			class528_sub3_1.aBool8959 = true;
		} else {
			class528_sub3_1.aBool8959 = this.aBool8959;
		}

		class528_sub3_1.aBool8903 = this.aBool8903;
		boolean bool_6 = Class50.method994(i_3, this.anInt8896);
		boolean bool_7 = Class50.method979(i_3, this.anInt8896);
		boolean bool_8 = Class50.method980(i_3, this.anInt8896);
		boolean bool_9 = bool_6 | bool_7 | bool_8;
		int i_10;
		if (bool_9) {
			if (bool_6) {
				if (class528_sub3_2.anIntArray8901 != null && class528_sub3_2.anIntArray8901.length >= this.anInt8899) {
					class528_sub3_1.anIntArray8901 = class528_sub3_2.anIntArray8901;
				} else {
					class528_sub3_1.anIntArray8901 = class528_sub3_2.anIntArray8901 = new int[this.anInt8899];
				}
			} else {
				class528_sub3_1.anIntArray8901 = this.anIntArray8901;
			}

			if (bool_7) {
				if (class528_sub3_2.anIntArray8902 != null && class528_sub3_2.anIntArray8902.length >= this.anInt8899) {
					class528_sub3_1.anIntArray8902 = class528_sub3_2.anIntArray8902;
				} else {
					class528_sub3_1.anIntArray8902 = class528_sub3_2.anIntArray8902 = new int[this.anInt8899];
				}
			} else {
				class528_sub3_1.anIntArray8902 = this.anIntArray8902;
			}

			if (bool_8) {
				if (class528_sub3_2.anIntArray8931 != null && class528_sub3_2.anIntArray8931.length >= this.anInt8899) {
					class528_sub3_1.anIntArray8931 = class528_sub3_2.anIntArray8931;
				} else {
					class528_sub3_1.anIntArray8931 = class528_sub3_2.anIntArray8931 = new int[this.anInt8899];
				}
			} else {
				class528_sub3_1.anIntArray8931 = this.anIntArray8931;
			}

			for (i_10 = 0; i_10 < this.anInt8899; i_10++) {
				if (bool_6) {
					class528_sub3_1.anIntArray8901[i_10] = this.anIntArray8901[i_10];
				}

				if (bool_7) {
					class528_sub3_1.anIntArray8902[i_10] = this.anIntArray8902[i_10];
				}

				if (bool_8) {
					class528_sub3_1.anIntArray8931[i_10] = this.anIntArray8931[i_10];
				}
			}
		} else {
			class528_sub3_1.anIntArray8901 = this.anIntArray8901;
			class528_sub3_1.anIntArray8902 = this.anIntArray8902;
			class528_sub3_1.anIntArray8931 = this.anIntArray8931;
		}

		if (Class50.method995(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8927 = class528_sub3_2.aClass63_8927;
			class528_sub3_1.aClass63_8927.anInterface4_661 = this.aClass63_8927.anInterface4_661;
			class528_sub3_1.aClass63_8927.aBool662 = this.aClass63_8927.aBool662;
			class528_sub3_1.aClass63_8927.aBool663 = true;
		} else if (Class50.method990(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8927 = this.aClass63_8927;
		} else {
			class528_sub3_1.aClass63_8927 = null;
		}

		if (Class50.method1022(i_3, this.anInt8896)) {
			if (class528_sub3_2.aShortArray8918 != null && class528_sub3_2.aShortArray8918.length >= this.anInt8916) {
				class528_sub3_1.aShortArray8918 = class528_sub3_2.aShortArray8918;
			} else {
				class528_sub3_1.aShortArray8918 = class528_sub3_2.aShortArray8918 = new short[this.anInt8916];
			}

			for (i_10 = 0; i_10 < this.anInt8916; i_10++) {
				class528_sub3_1.aShortArray8918[i_10] = this.aShortArray8918[i_10];
			}
		} else {
			class528_sub3_1.aShortArray8918 = this.aShortArray8918;
		}

		if (Class50.method984(i_3, this.anInt8896)) {
			if (class528_sub3_2.aByteArray8900 != null && class528_sub3_2.aByteArray8900.length >= this.anInt8916) {
				class528_sub3_1.aByteArray8900 = class528_sub3_2.aByteArray8900;
			} else {
				class528_sub3_1.aByteArray8900 = class528_sub3_2.aByteArray8900 = new byte[this.anInt8916];
			}

			for (i_10 = 0; i_10 < this.anInt8916; i_10++) {
				class528_sub3_1.aByteArray8900[i_10] = this.aByteArray8900[i_10];
			}
		} else {
			class528_sub3_1.aByteArray8900 = this.aByteArray8900;
		}

		if (Class50.method1051(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8913 = class528_sub3_2.aClass63_8913;
			class528_sub3_1.aClass63_8913.anInterface4_661 = this.aClass63_8913.anInterface4_661;
			class528_sub3_1.aClass63_8913.aBool662 = this.aClass63_8913.aBool662;
			class528_sub3_1.aClass63_8913.aBool663 = true;
		} else if (Class50.method1059(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8913 = this.aClass63_8913;
		} else {
			class528_sub3_1.aClass63_8913 = null;
		}

		int i_11;
		if (Class50.method982(i_3, this.anInt8896)) {
			if (class528_sub3_2.aShortArray8909 != null && class528_sub3_2.aShortArray8909.length >= this.anInt8906) {
				class528_sub3_1.aShortArray8909 = class528_sub3_2.aShortArray8909;
				class528_sub3_1.aShortArray8933 = class528_sub3_2.aShortArray8933;
				class528_sub3_1.aShortArray8911 = class528_sub3_2.aShortArray8911;
			} else {
				i_10 = this.anInt8906;
				class528_sub3_1.aShortArray8909 = class528_sub3_2.aShortArray8909 = new short[i_10];
				class528_sub3_1.aShortArray8933 = class528_sub3_2.aShortArray8933 = new short[i_10];
				class528_sub3_1.aShortArray8911 = class528_sub3_2.aShortArray8911 = new short[i_10];
			}

			if (this.aClass355_8962 != null) {
				if (class528_sub3_2.aClass355_8962 == null) {
					class528_sub3_2.aClass355_8962 = new Class355();
				}

				Class355 class355_12 = class528_sub3_1.aClass355_8962 = class528_sub3_2.aClass355_8962;
				if (class355_12.aShortArray4115 == null || class355_12.aShortArray4115.length < this.anInt8906) {
					i_11 = this.anInt8906;
					class355_12.aShortArray4115 = new short[i_11];
					class355_12.aShortArray4114 = new short[i_11];
					class355_12.aShortArray4113 = new short[i_11];
					class355_12.aByteArray4116 = new byte[i_11];
				}

				for (i_11 = 0; i_11 < this.anInt8906; i_11++) {
					class528_sub3_1.aShortArray8909[i_11] = this.aShortArray8909[i_11];
					class528_sub3_1.aShortArray8933[i_11] = this.aShortArray8933[i_11];
					class528_sub3_1.aShortArray8911[i_11] = this.aShortArray8911[i_11];
					class355_12.aShortArray4115[i_11] = this.aClass355_8962.aShortArray4115[i_11];
					class355_12.aShortArray4114[i_11] = this.aClass355_8962.aShortArray4114[i_11];
					class355_12.aShortArray4113[i_11] = this.aClass355_8962.aShortArray4113[i_11];
					class355_12.aByteArray4116[i_11] = this.aClass355_8962.aByteArray4116[i_11];
				}
			} else {
				class528_sub3_1.aClass355_8962 = null;

				for (i_10 = 0; i_10 < this.anInt8906; i_10++) {
					class528_sub3_1.aShortArray8909[i_10] = this.aShortArray8909[i_10];
					class528_sub3_1.aShortArray8933[i_10] = this.aShortArray8933[i_10];
					class528_sub3_1.aShortArray8911[i_10] = this.aShortArray8911[i_10];
				}
			}

			class528_sub3_1.aByteArray8912 = this.aByteArray8912;
		} else {
			class528_sub3_1.aClass355_8962 = this.aClass355_8962;
			class528_sub3_1.aShortArray8909 = this.aShortArray8909;
			class528_sub3_1.aShortArray8933 = this.aShortArray8933;
			class528_sub3_1.aShortArray8911 = this.aShortArray8911;
			class528_sub3_1.aByteArray8912 = this.aByteArray8912;
		}

		if (Class50.method1020(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8929 = class528_sub3_2.aClass63_8929;
			class528_sub3_1.aClass63_8929.anInterface4_661 = this.aClass63_8929.anInterface4_661;
			class528_sub3_1.aClass63_8929.aBool662 = this.aClass63_8929.aBool662;
			class528_sub3_1.aClass63_8929.aBool663 = true;
		} else if (Class50.method983(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8929 = this.aClass63_8929;
		} else {
			class528_sub3_1.aClass63_8929 = null;
		}

		if (Class50.method985(i_3, this.anInt8896)) {
			if (class528_sub3_2.aFloatArray8892 != null && class528_sub3_2.aFloatArray8892.length >= this.anInt8916) {
				class528_sub3_1.aFloatArray8892 = class528_sub3_2.aFloatArray8892;
				class528_sub3_1.aFloatArray8914 = class528_sub3_2.aFloatArray8914;
			} else {
				i_10 = this.anInt8906;
				class528_sub3_1.aFloatArray8892 = class528_sub3_2.aFloatArray8892 = new float[i_10];
				class528_sub3_1.aFloatArray8914 = class528_sub3_2.aFloatArray8914 = new float[i_10];
			}

			for (i_10 = 0; i_10 < this.anInt8906; i_10++) {
				class528_sub3_1.aFloatArray8892[i_10] = this.aFloatArray8892[i_10];
				class528_sub3_1.aFloatArray8914[i_10] = this.aFloatArray8914[i_10];
			}
		} else {
			class528_sub3_1.aFloatArray8892 = this.aFloatArray8892;
			class528_sub3_1.aFloatArray8914 = this.aFloatArray8914;
		}

		if (Class50.method1056(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8930 = class528_sub3_2.aClass63_8930;
			class528_sub3_1.aClass63_8930.anInterface4_661 = this.aClass63_8930.anInterface4_661;
			class528_sub3_1.aClass63_8930.aBool662 = this.aClass63_8930.aBool662;
			class528_sub3_1.aClass63_8930.aBool663 = true;
		} else if (Class50.method993(i_3, this.anInt8896)) {
			class528_sub3_1.aClass63_8930 = this.aClass63_8930;
		} else {
			class528_sub3_1.aClass63_8930 = null;
		}

		if (Class50.method986(i_3, this.anInt8896)) {
			if (class528_sub3_2.aShortArray8920 != null && class528_sub3_2.aShortArray8920.length >= this.anInt8916) {
				class528_sub3_1.aShortArray8920 = class528_sub3_2.aShortArray8920;
				class528_sub3_1.aShortArray8921 = class528_sub3_2.aShortArray8921;
				class528_sub3_1.aShortArray8922 = class528_sub3_2.aShortArray8922;
			} else {
				i_10 = this.anInt8916;
				class528_sub3_1.aShortArray8920 = class528_sub3_2.aShortArray8920 = new short[i_10];
				class528_sub3_1.aShortArray8921 = class528_sub3_2.aShortArray8921 = new short[i_10];
				class528_sub3_1.aShortArray8922 = class528_sub3_2.aShortArray8922 = new short[i_10];
			}

			for (i_10 = 0; i_10 < this.anInt8916; i_10++) {
				class528_sub3_1.aShortArray8920[i_10] = this.aShortArray8920[i_10];
				class528_sub3_1.aShortArray8921[i_10] = this.aShortArray8921[i_10];
				class528_sub3_1.aShortArray8922[i_10] = this.aShortArray8922[i_10];
			}
		} else {
			class528_sub3_1.aShortArray8920 = this.aShortArray8920;
			class528_sub3_1.aShortArray8921 = this.aShortArray8921;
			class528_sub3_1.aShortArray8922 = this.aShortArray8922;
		}

		if (Class50.method999(i_3, this.anInt8896)) {
			class528_sub3_1.aClass39_8926 = class528_sub3_2.aClass39_8926;
			class528_sub3_1.aClass39_8926.anInterface32_407 = this.aClass39_8926.anInterface32_407;
			class528_sub3_1.aClass39_8926.aBool408 = this.aClass39_8926.aBool408;
			class528_sub3_1.aClass39_8926.aBool406 = true;
		} else if (Class50.method1043(i_3, this.anInt8896)) {
			class528_sub3_1.aClass39_8926 = this.aClass39_8926;
		} else {
			class528_sub3_1.aClass39_8926 = null;
		}

		if (Class50.method992(i_3, this.anInt8896)) {
			if (class528_sub3_2.aShortArray8923 != null && class528_sub3_2.aShortArray8923.length >= this.anInt8916) {
				class528_sub3_1.aShortArray8923 = class528_sub3_2.aShortArray8923;
			} else {
				i_10 = this.anInt8916;
				class528_sub3_1.aShortArray8923 = class528_sub3_2.aShortArray8923 = new short[i_10];
			}

			for (i_10 = 0; i_10 < this.anInt8916; i_10++) {
				class528_sub3_1.aShortArray8923[i_10] = this.aShortArray8923[i_10];
			}
		} else {
			class528_sub3_1.aShortArray8923 = this.aShortArray8923;
		}

		if (Class50.method988(i_3, this.anInt8896)) {
			if (class528_sub3_2.aClass65Array8953 != null && class528_sub3_2.aClass65Array8953.length >= this.anInt8951) {
				class528_sub3_1.aClass65Array8953 = class528_sub3_2.aClass65Array8953;

				for (i_10 = 0; i_10 < this.anInt8951; i_10++) {
					class528_sub3_1.aClass65Array8953[i_10].method1270(this.aClass65Array8953[i_10]);
				}
			} else {
				i_10 = this.anInt8951;
				class528_sub3_1.aClass65Array8953 = class528_sub3_2.aClass65Array8953 = new Class65[i_10];

				for (i_11 = 0; i_11 < this.anInt8951; i_11++) {
					class528_sub3_1.aClass65Array8953[i_11] = this.aClass65Array8953[i_11].method1275();
				}
			}
		} else {
			class528_sub3_1.aClass65Array8953 = this.aClass65Array8953;
		}

		class528_sub3_1.aClass56Array8934 = this.aClass56Array8934;
		if (this.aBool8937) {
			class528_sub3_1.anInt8957 = this.anInt8957;
			class528_sub3_1.anInt8936 = this.anInt8936;
			class528_sub3_1.anInt8940 = this.anInt8940;
			class528_sub3_1.anInt8941 = this.anInt8941;
			class528_sub3_1.anInt8908 = this.anInt8908;
			class528_sub3_1.anInt8893 = this.anInt8893;
			class528_sub3_1.anInt8942 = this.anInt8942;
			class528_sub3_1.anInt8943 = this.anInt8943;
			class528_sub3_1.aBool8937 = true;
		} else {
			class528_sub3_1.aBool8937 = false;
		}

		class528_sub3_1.anIntArrayArray8966 = this.anIntArrayArray8966;
		class528_sub3_1.anIntArrayArray8924 = this.anIntArrayArray8924;
		class528_sub3_1.anIntArrayArray8954 = this.anIntArrayArray8954;
		class528_sub3_1.aShortArray8948 = this.aShortArray8948;
		class528_sub3_1.anIntArray8947 = this.anIntArray8947;
		class528_sub3_1.aShortArray8907 = this.aShortArray8907;
		class528_sub3_1.aShortArray8945 = this.aShortArray8945;
		class528_sub3_1.aShortArray8905 = this.aShortArray8905;
		class528_sub3_1.aShortArray8925 = this.aShortArray8925;
		class528_sub3_1.anIntArray8944 = this.anIntArray8944;
		class528_sub3_1.anIntArray8946 = this.anIntArray8946;
		class528_sub3_1.anIntArray8952 = this.anIntArray8952;
		class528_sub3_1.aClass87Array8949 = this.aClass87Array8949;
		class528_sub3_1.aClass172Array8950 = this.aClass172Array8950;
		return class528_sub3_1;
	}

	public void cr(int i_1) {
		this.aShort8898 = (short) i_1;
		this.method14268();
		this.method14285();
	}

	void method14268() {
		if (this.aClass63_8927 != null) {
			this.aClass63_8927.aBool662 = false;
		}

	}

	void method14269() {
		if (this.aClass63_8913 != null) {
			this.aClass63_8913.aBool662 = false;
		}

	}

	public void method11298(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8905 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = this.aClass505_Sub2_8917.aClass294_8713;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < this.anInt8910; i_6++) {
				if ((i_2 & this.aShortArray8905[i_6]) != 0) {
					matrix44var_4.method5226((float) this.anIntArray8901[i_6], (float) this.anIntArray8902[i_6], (float) this.anIntArray8931[i_6], floats_5);
					this.anIntArray8901[i_6] = (int) floats_5[0];
					this.anIntArray8902[i_6] = (int) floats_5[1];
					this.anIntArray8931[i_6] = (int) floats_5[2];
				}
			}
		}

	}

	void method14270() {
		if (this.aClass39_8926 != null) {
			this.aClass39_8926.aBool408 = false;
		}

	}

	public void f(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = i_2 * this.anIntArray8931[i_4] + i_3 * this.anIntArray8901[i_4] >> 14;
			this.anIntArray8931[i_4] = i_3 * this.anIntArray8931[i_4] - i_2 * this.anIntArray8901[i_4] >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public boolean method11309(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		Matrix44Arr matrix44arr_6 = this.aClass505_Sub2_8917.aClass384_8683;
		matrix44arr_6.fromVarMatrix44(matrix44var_3);
		matrix44arr_6.method6523(this.aClass505_Sub2_8917.aClass384_8728);
		boolean bool_7 = false;
		float f_8 = Float.MAX_VALUE;
		float f_9 = -3.4028235E38F;
		float f_10 = Float.MAX_VALUE;
		float f_11 = -3.4028235E38F;
		if (!this.aBool8937) {
			this.method14281();
		}

		int i_12 = this.anInt8941 - this.anInt8940 >> 1;
		int i_13 = this.anInt8893 - this.anInt8908 >> 1;
		int i_14 = this.anInt8943 - this.anInt8942 >> 1;
		int i_15 = this.anInt8940 + i_12;
		int i_16 = this.anInt8908 + i_13;
		int i_17 = this.anInt8942 + i_14;
		int i_18 = i_15 - (i_12 << i_5);
		int i_19 = i_16 - (i_13 << i_5);
		int i_20 = i_17 - (i_14 << i_5);
		int i_21 = i_15 + (i_12 << i_5);
		int i_22 = i_16 + (i_13 << i_5);
		int i_23 = i_17 + (i_14 << i_5);
		anIntArray8894[0] = i_18;
		anIntArray8960[0] = i_19;
		anIntArray8961[0] = i_20;
		anIntArray8894[1] = i_21;
		anIntArray8960[1] = i_19;
		anIntArray8961[1] = i_20;
		anIntArray8894[2] = i_18;
		anIntArray8960[2] = i_22;
		anIntArray8961[2] = i_20;
		anIntArray8894[3] = i_21;
		anIntArray8960[3] = i_22;
		anIntArray8961[3] = i_20;
		anIntArray8894[4] = i_18;
		anIntArray8960[4] = i_19;
		anIntArray8961[4] = i_23;
		anIntArray8894[5] = i_21;
		anIntArray8960[5] = i_19;
		anIntArray8961[5] = i_23;
		anIntArray8894[6] = i_18;
		anIntArray8960[6] = i_22;
		anIntArray8961[6] = i_23;
		anIntArray8894[7] = i_21;
		anIntArray8960[7] = i_22;
		anIntArray8961[7] = i_23;

		int i_24;
		float f_25;
		float f_26;
		float f_27;
		float f_28;
		float f_29;
		float f_30;
		float f_31;
		for (i_24 = 0; i_24 < 8; i_24++) {
			f_25 = (float) anIntArray8894[i_24];
			f_26 = (float) anIntArray8960[i_24];
			f_27 = (float) anIntArray8961[i_24];
			f_28 = matrix44arr_6.buf[2] * f_25 + matrix44arr_6.buf[6] * f_26 + matrix44arr_6.buf[10] * f_27 + matrix44arr_6.buf[14];
			f_29 = matrix44arr_6.buf[3] * f_25 + matrix44arr_6.buf[7] * f_26 + matrix44arr_6.buf[11] * f_27 + matrix44arr_6.buf[15];
			if (f_28 >= -f_29) {
				f_30 = matrix44arr_6.buf[0] * f_25 + matrix44arr_6.buf[4] * f_26 + matrix44arr_6.buf[8] * f_27 + matrix44arr_6.buf[12];
				f_31 = matrix44arr_6.buf[1] * f_25 + matrix44arr_6.buf[5] * f_26 + matrix44arr_6.buf[9] * f_27 + matrix44arr_6.buf[13];
				float f_32 = this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_29;
				float f_33 = this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_29;
				if (f_32 < f_8) {
					f_8 = f_32;
				}

				if (f_32 > f_9) {
					f_9 = f_32;
				}

				if (f_33 < f_10) {
					f_10 = f_33;
				}

				if (f_33 > f_11) {
					f_11 = f_33;
				}

				bool_7 = true;
			}
		}

		if (bool_7 && (float) i_1 > f_8 && (float) i_1 < f_9 && (float) i_2 > f_10 && (float) i_2 < f_11) {
			if (bool_4) {
				return true;
			}

			if (anIntArray8928.length < this.anInt8906) {
				anIntArray8928 = new int[this.anInt8906];
				anIntArray8958 = new int[this.anInt8906];
			}

			for (i_24 = 0; i_24 < this.anInt8910; i_24++) {
				f_25 = (float) this.anIntArray8901[i_24];
				f_26 = (float) this.anIntArray8902[i_24];
				f_27 = (float) this.anIntArray8931[i_24];
				f_28 = matrix44arr_6.buf[2] * f_25 + matrix44arr_6.buf[6] * f_26 + matrix44arr_6.buf[10] * f_27 + matrix44arr_6.buf[14];
				f_29 = matrix44arr_6.buf[3] * f_25 + matrix44arr_6.buf[7] * f_26 + matrix44arr_6.buf[11] * f_27 + matrix44arr_6.buf[15];
				int i_38;
				int i_39;
				if (f_28 >= -f_29) {
					f_30 = matrix44arr_6.buf[0] * f_25 + matrix44arr_6.buf[4] * f_26 + matrix44arr_6.buf[8] * f_27 + matrix44arr_6.buf[12];
					f_31 = matrix44arr_6.buf[1] * f_25 + matrix44arr_6.buf[5] * f_26 + matrix44arr_6.buf[9] * f_27 + matrix44arr_6.buf[13];
					i_38 = this.anIntArray8947[i_24];
					i_39 = this.anIntArray8947[i_24 + 1];

					for (int i_34 = i_38; i_34 < i_39; i_34++) {
						int i_35 = this.aShortArray8948[i_34] - 1;
						if (i_35 == -1) {
							break;
						}

						anIntArray8928[i_35] = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_29);
						anIntArray8958[i_35] = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_29);
					}
				} else {
					int i_36 = this.anIntArray8947[i_24];
					int i_37 = this.anIntArray8947[i_24 + 1];

					for (i_38 = i_36; i_38 < i_37; i_38++) {
						i_39 = this.aShortArray8948[i_38] - 1;
						if (i_39 == -1) {
							break;
						}

						anIntArray8928[this.aShortArray8948[i_38] - 1] = -999999;
					}
				}
			}

			for (i_24 = 0; i_24 < this.anInt8916 * 3 * -1431655765; i_24++) {
				if (anIntArray8928[this.aShortArray8920[i_24]] != -999999 && anIntArray8928[this.aShortArray8921[i_24]] != -999999 && anIntArray8928[this.aShortArray8922[i_24]] != -999999 && this.method14276(i_1, i_2, anIntArray8958[this.aShortArray8920[i_24]], anIntArray8958[this.aShortArray8921[i_24]], anIntArray8958[this.aShortArray8922[i_24]], anIntArray8928[this.aShortArray8920[i_24]], anIntArray8928[this.aShortArray8921[i_24]], anIntArray8928[this.aShortArray8922[i_24]])) {
					return true;
				}
			}
		}

		return false;
	}

	public void t(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = i_3 * this.anIntArray8902[i_4] - i_2 * this.anIntArray8931[i_4] >> 14;
			this.anIntArray8931[i_4] = i_2 * this.anIntArray8902[i_4] + i_3 * this.anIntArray8931[i_4] >> 14;
			this.anIntArray8902[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void EA(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = i_2 * this.anIntArray8902[i_4] + i_3 * this.anIntArray8901[i_4] >> 14;
			this.anIntArray8902[i_4] = i_3 * this.anIntArray8902[i_4] - i_2 * this.anIntArray8901[i_4] >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void ia(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			if (i_1 != 0) {
				this.anIntArray8901[i_4] += i_1;
			}

			if (i_2 != 0) {
				this.anIntArray8902[i_4] += i_2;
			}

			if (i_3 != 0) {
				this.anIntArray8931[i_4] += i_3;
			}
		}

		this.method14268();
		this.aBool8937 = false;
	}

	boolean method14271() {
		if (this.aClass39_8926.aBool408) {
			return true;
		} else {
			if (this.aClass39_8926.anInterface32_409 == null) {
				this.aClass39_8926.anInterface32_409 = this.aClass505_Sub2_8917.method13993(false);
			}

			Interface32 interface32_1 = this.aClass39_8926.anInterface32_409;
			interface32_1.method208(this.anInt8963 * 6);
			Unsafe unsafe_2 = this.aClass505_Sub2_8917.anUnsafe8830;
			if (unsafe_2 != null) {
				int i_3 = this.anInt8963 * 6;
				long long_4 = interface32_1.method40(0, i_3);
				if (long_4 == 0L) {
					return false;
				} else {
					for (int i_6 = 0; i_6 < this.anInt8963; i_6++) {
						unsafe_2.putShort(long_4, this.aShortArray8920[i_6]);
						long_4 += 2L;
						unsafe_2.putShort(long_4, this.aShortArray8921[i_6]);
						long_4 += 2L;
						unsafe_2.putShort(long_4, this.aShortArray8922[i_6]);
						long_4 += 2L;
					}

					interface32_1.method38();
					this.aClass39_8926.anInterface32_407 = interface32_1;
					this.aClass39_8926.aBool408 = true;
					this.aBool8919 = true;
					return true;
				}
			} else {
				ByteBuffer bytebuffer_7 = this.aClass505_Sub2_8917.aByteBuffer8838;
				bytebuffer_7.clear();

				for (int i_8 = 0; i_8 < this.anInt8963; i_8++) {
					bytebuffer_7.putShort(this.aShortArray8920[i_8]);
					bytebuffer_7.putShort(this.aShortArray8921[i_8]);
					bytebuffer_7.putShort(this.aShortArray8922[i_8]);
				}

				if (interface32_1.method42(0, bytebuffer_7.position(), this.aClass505_Sub2_8917.aLong8695)) {
					this.aClass39_8926.anInterface32_407 = interface32_1;
					this.aClass39_8926.aBool408 = true;
					this.aBool8919 = true;
					return true;
				} else {
					return false;
				}
			}
		}
	}

	public void oa(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			if (i_1 != 128) {
				this.anIntArray8901[i_4] = this.anIntArray8901[i_4] * i_1 >> 7;
			}

			if (i_2 != 128) {
				this.anIntArray8902[i_4] = i_2 * this.anIntArray8902[i_4] >> 7;
			}

			if (i_3 != 128) {
				this.anIntArray8931[i_4] = i_3 * this.anIntArray8931[i_4] >> 7;
			}
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public int co() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8943;
	}

	public void aq(int i_1) {
		if (this.aClass63_8927 != null) {
			this.aClass63_8927.aBool663 = Class50.method995(i_1, this.anInt8896);
		}

		if (this.aClass63_8930 != null) {
			this.aClass63_8930.aBool663 = Class50.method1056(i_1, this.anInt8896);
		}

		if (this.aClass63_8913 != null) {
			this.aClass63_8913.aBool663 = Class50.method1051(i_1, this.anInt8896);
		}

		if (this.aClass63_8929 != null) {
			this.aClass63_8929.aBool663 = Class50.method1020(i_1, this.anInt8896);
		}

		this.anInt8895 = i_1;
		if (this.aClass355_8962 != null && (this.anInt8895 & 0x10000) == 0) {
			this.aShortArray8909 = this.aClass355_8962.aShortArray4115;
			this.aShortArray8933 = this.aClass355_8962.aShortArray4114;
			this.aShortArray8911 = this.aClass355_8962.aShortArray4113;
			this.aByteArray8912 = this.aClass355_8962.aByteArray4116;
			this.aClass355_8962 = null;
		}

		this.aBool8919 = true;
		this.method14274();
	}

	public int N() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8936;
	}

	public byte[] aw() {
		return this.aByteArray8900;
	}

	public int RA() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8940;
	}

	public int ya() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8941;
	}

	public int ar() {
		return this.anInt8895;
	}

	public int dg() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8957;
	}

	Class528_Sub3(Class505_Sub2 class505_sub2_1, RSMesh rsmesh_2, int i_3, int i_4, int i_5, int i_6) {
		this(class505_sub2_1, i_3, i_6, true, false);
		Interface22 interface22_7 = class505_sub2_1.anInterface22_5834;
		int[] ints_8 = new int[rsmesh_2.faceCount];
		this.anIntArray8947 = new int[rsmesh_2.anInt1999 + 1];

		for (int i_9 = 0; i_9 < rsmesh_2.faceCount; i_9++) {
			if (rsmesh_2.faceType == null || rsmesh_2.faceType[i_9] != 2) {
				if (rsmesh_2.faceTextures != null && rsmesh_2.faceTextures[i_9] != -1) {
					Class169 class169_70 = interface22_7.method144(rsmesh_2.faceTextures[i_9] & 0xffff, -1906869426);
					if (((this.anInt8896 & 0x40) == 0 || !class169_70.aBool2056) && class169_70.aBool2072) {
						continue;
					}
				}

				ints_8[this.anInt8916++] = i_9;
				++this.anIntArray8947[rsmesh_2.triangleX[i_9]];
				++this.anIntArray8947[rsmesh_2.triangleY[i_9]];
				++this.anIntArray8947[rsmesh_2.triangleZ[i_9]];
			}
		}

		this.anInt8963 = this.anInt8916;
		long[] longs_63 = new long[this.anInt8916];
		boolean bool_10 = (this.anInt8895 & 0x100) != 0;

		int i_12;
		int i_14;
		int i_19;
		Class169 class169_69;
		short s_82;
		int i_112;
		for (int i_11 = 0; i_11 < this.anInt8916; i_11++) {
			i_12 = ints_8[i_11];
			Class169 class169_65 = null;
			i_14 = 0;
			byte b_67 = 0;
			byte b_16 = 0;
			byte b_17 = 0;
			if (rsmesh_2.aClass84Array2009 != null) {
				boolean bool_18 = false;

				for (i_19 = 0; i_19 < rsmesh_2.aClass84Array2009.length; i_19++) {
					Class84 class84_73 = rsmesh_2.aClass84Array2009[i_19];
					if (i_12 == class84_73.anInt809) {
						Class347 class347_77 = Class417.method7005(class84_73.anInt812, -1690640599);
						if (class347_77.aBool4059) {
							bool_18 = true;
						}

						if (class347_77.anInt4055 != -1) {
							class169_69 = interface22_7.method144(class347_77.anInt4055, -1795935165);
							if (class169_69.anInt2074 == 2) {
								this.aBool8959 = true;
							}
						}
					}
				}

				if (bool_18) {
					longs_63[i_11] = Long.MAX_VALUE;
					--this.anInt8963;
					continue;
				}
			}

			s_82 = -1;
			if (rsmesh_2.faceTextures != null) {
				s_82 = rsmesh_2.faceTextures[i_12];
				if (s_82 != -1) {
					class169_65 = interface22_7.method144(s_82 & 0xffff, -2013100197);
					if ((this.anInt8896 & 0x40) != 0 && class169_65.aBool2056) {
						s_82 = -1;
						class169_65 = null;
					} else {
						b_16 = class169_65.aByte2064;
						b_17 = class169_65.aByte2076;
					}
				}
			}

			boolean bool_83 = rsmesh_2.faceAlphas != null && rsmesh_2.faceAlphas[i_12] != 0 || class169_65 != null && class169_65.anInt2074 != 0;
			if ((bool_10 || bool_83) && rsmesh_2.facePriorities != null) {
				i_14 += rsmesh_2.facePriorities[i_12] << 17;
			}

			if (bool_83) {
				i_14 += 65536;
			}

			i_14 += (b_16 & 0xff) << 8;
			i_14 += b_17 & 0xff;
			i_112 = b_67 + ((s_82 & 0xffff) << 16);
			i_112 += i_11 & 0xffff;
			longs_63[i_11] = ((long) i_14 << 32) + (long) i_112;
			this.aBool8959 |= bool_83;
			this.aBool8903 |= class169_65 != null && (class169_65.aByte2081 != 0 || class169_65.aByte2090 != 0);
		}

		Class159.method2736(longs_63, ints_8, (byte) 8);
		this.anInt8899 = rsmesh_2.vertexCount;
		this.anInt8910 = rsmesh_2.anInt1999;
		this.anIntArray8901 = rsmesh_2.vertexX;
		this.anIntArray8902 = rsmesh_2.vertexY;
		this.anIntArray8931 = rsmesh_2.vertexZ;
		this.aShortArray8905 = rsmesh_2.aShortArray1980;
		Class36[] arr_64 = new Class36[this.anInt8910];
		this.aClass87Array8949 = rsmesh_2.aClass87Array2007;
		this.aClass172Array8950 = rsmesh_2.aClass172Array2008;
		int i_79;
		if (rsmesh_2.aClass84Array2009 != null) {
			this.anInt8951 = rsmesh_2.aClass84Array2009.length;
			this.aClass56Array8934 = new Class56[this.anInt8951];
			this.aClass65Array8953 = new Class65[this.anInt8951];

			for (i_12 = 0; i_12 < this.anInt8951; i_12++) {
				Class84 class84_111 = rsmesh_2.aClass84Array2009[i_12];
				Class347 class347_66 = Class417.method7005(class84_111.anInt812, -1212131848);
				i_112 = -1;

				for (i_79 = 0; i_79 < this.anInt8916; i_79++) {
					if (class84_111.anInt809 == ints_8[i_79]) {
						i_112 = i_79;
						break;
					}
				}

				if (i_112 == -1) {
					throw new RuntimeException();
				}

				i_79 = Class540.anIntArray7136[rsmesh_2.faceColor[class84_111.anInt809] & 0xffff] & 0xffffff;
				i_79 |= 255 - (rsmesh_2.faceAlphas != null ? rsmesh_2.faceAlphas[class84_111.anInt809] : 0) << 24;
				this.aClass56Array8934[i_12] = new Class56(i_112, rsmesh_2.triangleX[class84_111.anInt809], rsmesh_2.triangleY[class84_111.anInt809], rsmesh_2.triangleZ[class84_111.anInt809], class347_66.anInt4054, class347_66.anInt4050, class347_66.anInt4055, class347_66.anInt4057, class347_66.anInt4051, class347_66.aBool4059, class347_66.aBool4058, class84_111.anInt810);
				this.aClass65Array8953[i_12] = new Class65(i_79);
			}
		}

		i_12 = this.anInt8916 * 3;
		this.aShortArray8907 = new short[i_12];
		this.aShortArray8945 = new short[i_12];
		this.aShortArray8909 = new short[i_12];
		this.aShortArray8933 = new short[i_12];
		this.aShortArray8911 = new short[i_12];
		this.aByteArray8912 = new byte[i_12];
		this.aFloatArray8892 = new float[i_12];
		this.aFloatArray8914 = new float[i_12];
		this.aShortArray8918 = new short[this.anInt8916];
		this.aByteArray8900 = new byte[this.anInt8916];
		this.aShortArray8920 = new short[this.anInt8916];
		this.aShortArray8921 = new short[this.anInt8916];
		this.aShortArray8922 = new short[this.anInt8916];
		this.aShortArray8923 = new short[this.anInt8916];
		if (rsmesh_2.aShortArray1981 != null) {
			this.aShortArray8925 = new short[this.anInt8916];
		}

		this.aShort8897 = (short) i_4;
		this.aShort8898 = (short) i_5;
		this.aShortArray8948 = new short[i_12];
		aLongArray8955 = new long[i_12];
		int i_13 = 0;

		for (i_14 = 0; i_14 < rsmesh_2.anInt1999; i_14++) {
			i_112 = this.anIntArray8947[i_14];
			this.anIntArray8947[i_14] = i_13;
			i_13 += i_112;
			arr_64[i_14] = new Class36();
		}

		this.anIntArray8947[rsmesh_2.anInt1999] = i_13;
		Class83 class83_110 = this.method11256(rsmesh_2, ints_8, this.anInt8916);
		Class64[] arr_15 = new Class64[rsmesh_2.faceCount];

		int i_20;
		short s_80;
		short s_84;
		for (i_79 = 0; i_79 < rsmesh_2.faceCount; i_79++) {
			s_80 = rsmesh_2.triangleX[i_79];
			s_82 = rsmesh_2.triangleY[i_79];
			s_84 = rsmesh_2.triangleZ[i_79];
			i_20 = this.anIntArray8901[s_82] - this.anIntArray8901[s_80];
			int i_21 = this.anIntArray8902[s_82] - this.anIntArray8902[s_80];
			int i_22 = this.anIntArray8931[s_82] - this.anIntArray8931[s_80];
			int i_23 = this.anIntArray8901[s_84] - this.anIntArray8901[s_80];
			int i_24 = this.anIntArray8902[s_84] - this.anIntArray8902[s_80];
			int i_25 = this.anIntArray8931[s_84] - this.anIntArray8931[s_80];
			int i_26 = i_21 * i_25 - i_24 * i_22;
			int i_27 = i_22 * i_23 - i_25 * i_20;

			int i_28;
			for (i_28 = i_20 * i_24 - i_23 * i_21; i_26 > 8192 || i_27 > 8192 || i_28 > 8192 || i_26 < -8192 || i_27 < -8192 || i_28 < -8192; i_28 >>= 1) {
				i_26 >>= 1;
				i_27 >>= 1;
			}

			int i_29 = (int) Math.sqrt((double) (i_26 * i_26 + i_27 * i_27 + i_28 * i_28));
			if (i_29 <= 0) {
				i_29 = 1;
			}

			i_26 = i_26 * 256 / i_29;
			i_27 = i_27 * 256 / i_29;
			i_28 = i_28 * 256 / i_29;
			byte b_30 = rsmesh_2.faceType == null ? 0 : rsmesh_2.faceType[i_79];
			if (b_30 == 0) {
				Class36 class36_31 = arr_64[s_80];
				class36_31.anInt387 += i_26;
				class36_31.anInt385 += i_27;
				class36_31.anInt384 += i_28;
				++class36_31.anInt386;
				class36_31 = arr_64[s_82];
				class36_31.anInt387 += i_26;
				class36_31.anInt385 += i_27;
				class36_31.anInt384 += i_28;
				++class36_31.anInt386;
				class36_31 = arr_64[s_84];
				class36_31.anInt387 += i_26;
				class36_31.anInt385 += i_27;
				class36_31.anInt384 += i_28;
				++class36_31.anInt386;
			} else if (b_30 == 1) {
				Class64 class64_97 = arr_15[i_79] = new Class64();
				class64_97.anInt665 = i_26;
				class64_97.anInt666 = i_27;
				class64_97.anInt667 = i_28;
			}
		}

		int i_85;
		short s_86;
		for (i_79 = 0; i_79 < this.anInt8916; i_79++) {
			int i_81 = ints_8[i_79];
			i_85 = rsmesh_2.faceColor[i_81] & 0xffff;
			if (rsmesh_2.texturePos == null) {
				i_19 = -1;
			} else {
				i_19 = rsmesh_2.texturePos[i_81];
			}

			if (rsmesh_2.faceAlphas == null) {
				i_20 = 0;
			} else {
				i_20 = rsmesh_2.faceAlphas[i_81] & 0xff;
			}

			s_86 = rsmesh_2.faceTextures == null ? -1 : rsmesh_2.faceTextures[i_81];
			if (s_86 != -1 && (this.anInt8896 & 0x40) != 0) {
				class169_69 = interface22_7.method144(s_86 & 0xffff, -2082914380);
				if (class169_69.aBool2056) {
					s_86 = -1;
				}
			}

			float f_87 = 0.0F;
			float f_88 = 0.0F;
			float f_89 = 0.0F;
			float f_91 = 0.0F;
			float f_92 = 0.0F;
			float f_93 = 0.0F;
			byte b_94 = 0;
			byte b_95 = 0;
			int i_96 = 0;
			short s_34;
			short s_35;
			short s_36;
			byte b_71;
			if (s_86 != -1) {
				if (i_19 == -1) {
					f_87 = 0.0F;
					f_88 = 1.0F;
					f_89 = 1.0F;
					f_91 = 1.0F;
					b_94 = 1;
					f_92 = 0.0F;
					f_93 = 0.0F;
					b_95 = 2;
				} else {
					i_19 &= 0xff;
					b_71 = rsmesh_2.textureRenderTypes[i_19];
					float f_40;
					float f_41;
					float f_42;
					float f_52;
					float f_53;
					float f_54;
					float f_55;
					float f_56;
					float f_57;
					short s_74;
					short s_75;
					if (b_71 == 0) {
						s_74 = rsmesh_2.triangleX[i_81];
						s_75 = rsmesh_2.triangleY[i_81];
						s_34 = rsmesh_2.triangleZ[i_81];
						s_35 = rsmesh_2.texTriX[i_19];
						s_36 = rsmesh_2.texTriY[i_19];
						short s_76 = rsmesh_2.texTriZ[i_19];
						float f_38 = (float) rsmesh_2.vertexX[s_35];
						float f_39 = (float) rsmesh_2.vertexY[s_35];
						f_40 = (float) rsmesh_2.vertexZ[s_35];
						f_41 = (float) rsmesh_2.vertexX[s_36] - f_38;
						f_42 = (float) rsmesh_2.vertexY[s_36] - f_39;
						float f_43 = (float) rsmesh_2.vertexZ[s_36] - f_40;
						float f_44 = (float) rsmesh_2.vertexX[s_76] - f_38;
						float f_45 = (float) rsmesh_2.vertexY[s_76] - f_39;
						float f_46 = (float) rsmesh_2.vertexZ[s_76] - f_40;
						float f_47 = (float) rsmesh_2.vertexX[s_74] - f_38;
						float f_48 = (float) rsmesh_2.vertexY[s_74] - f_39;
						float f_49 = (float) rsmesh_2.vertexZ[s_74] - f_40;
						float f_50 = (float) rsmesh_2.vertexX[s_75] - f_38;
						float f_51 = (float) rsmesh_2.vertexY[s_75] - f_39;
						f_52 = (float) rsmesh_2.vertexZ[s_75] - f_40;
						f_53 = (float) rsmesh_2.vertexX[s_34] - f_38;
						f_54 = (float) rsmesh_2.vertexY[s_34] - f_39;
						f_55 = (float) rsmesh_2.vertexZ[s_34] - f_40;
						f_56 = f_42 * f_46 - f_43 * f_45;
						f_57 = f_43 * f_44 - f_41 * f_46;
						float f_58 = f_41 * f_45 - f_42 * f_44;
						float f_59 = f_45 * f_58 - f_46 * f_57;
						float f_60 = f_46 * f_56 - f_44 * f_58;
						float f_61 = f_44 * f_57 - f_45 * f_56;
						float f_62 = 1.0F / (f_59 * f_41 + f_60 * f_42 + f_61 * f_43);
						f_87 = (f_59 * f_47 + f_60 * f_48 + f_61 * f_49) * f_62;
						f_89 = (f_59 * f_50 + f_60 * f_51 + f_61 * f_52) * f_62;
						f_92 = (f_59 * f_53 + f_60 * f_54 + f_61 * f_55) * f_62;
						f_59 = f_42 * f_58 - f_43 * f_57;
						f_60 = f_43 * f_56 - f_41 * f_58;
						f_61 = f_41 * f_57 - f_42 * f_56;
						f_62 = 1.0F / (f_59 * f_44 + f_60 * f_45 + f_61 * f_46);
						f_88 = (f_59 * f_47 + f_60 * f_48 + f_61 * f_49) * f_62;
						f_91 = (f_59 * f_50 + f_60 * f_51 + f_61 * f_52) * f_62;
						f_93 = (f_59 * f_53 + f_60 * f_54 + f_61 * f_55) * f_62;
					} else {
						s_74 = rsmesh_2.triangleX[i_81];
						s_75 = rsmesh_2.triangleY[i_81];
						s_34 = rsmesh_2.triangleZ[i_81];
						int i_98 = class83_110.anIntArray808[i_19];
						int i_99 = class83_110.anIntArray805[i_19];
						int i_113 = class83_110.anIntArray807[i_19];
						float[] floats_78 = class83_110.aFloatArrayArray806[i_19];
						byte b_100 = rsmesh_2.aByteArray1990[i_19];
						f_40 = (float) rsmesh_2.anIntArray1992[i_19] / 256.0F;
						if (b_71 == 1) {
							f_41 = (float) rsmesh_2.anIntArray2001[i_19] / 1024.0F;
							this.method11306(rsmesh_2.vertexX[s_74], rsmesh_2.vertexY[s_74], rsmesh_2.vertexZ[s_74], i_98, i_99, i_113, floats_78, f_41, b_100, f_40, aFloatArray8956);
							f_87 = aFloatArray8956[0];
							f_88 = aFloatArray8956[1];
							this.method11306(rsmesh_2.vertexX[s_75], rsmesh_2.vertexY[s_75], rsmesh_2.vertexZ[s_75], i_98, i_99, i_113, floats_78, f_41, b_100, f_40, aFloatArray8956);
							f_89 = aFloatArray8956[0];
							f_91 = aFloatArray8956[1];
							this.method11306(rsmesh_2.vertexX[s_34], rsmesh_2.vertexY[s_34], rsmesh_2.vertexZ[s_34], i_98, i_99, i_113, floats_78, f_41, b_100, f_40, aFloatArray8956);
							f_92 = aFloatArray8956[0];
							f_93 = aFloatArray8956[1];
							f_42 = f_41 / 2.0F;
							if ((b_100 & 0x1) == 0) {
								if (f_89 - f_87 > f_42) {
									f_89 -= f_41;
									b_94 = 1;
								} else if (f_87 - f_89 > f_42) {
									f_89 += f_41;
									b_94 = 2;
								}

								if (f_92 - f_87 > f_42) {
									f_92 -= f_41;
									b_95 = 1;
								} else if (f_87 - f_92 > f_42) {
									f_92 += f_41;
									b_95 = 2;
								}
							} else {
								if (f_91 - f_88 > f_42) {
									f_91 -= f_41;
									b_94 = 1;
								} else if (f_88 - f_91 > f_42) {
									f_91 += f_41;
									b_94 = 2;
								}

								if (f_93 - f_88 > f_42) {
									f_93 -= f_41;
									b_95 = 1;
								} else if (f_88 - f_93 > f_42) {
									f_93 += f_41;
									b_95 = 2;
								}
							}
						} else if (b_71 == 2) {
							f_41 = (float) rsmesh_2.anIntArray1997[i_19] / 256.0F;
							f_42 = (float) rsmesh_2.anIntArray2004[i_19] / 256.0F;
							int i_101 = rsmesh_2.vertexX[s_75] - rsmesh_2.vertexX[s_74];
							int i_102 = rsmesh_2.vertexY[s_75] - rsmesh_2.vertexY[s_74];
							int i_103 = rsmesh_2.vertexZ[s_75] - rsmesh_2.vertexZ[s_74];
							int i_104 = rsmesh_2.vertexX[s_34] - rsmesh_2.vertexX[s_74];
							int i_105 = rsmesh_2.vertexY[s_34] - rsmesh_2.vertexY[s_74];
							int i_106 = rsmesh_2.vertexZ[s_34] - rsmesh_2.vertexZ[s_74];
							int i_107 = i_102 * i_106 - i_105 * i_103;
							int i_108 = i_103 * i_104 - i_106 * i_101;
							int i_109 = i_101 * i_105 - i_104 * i_102;
							f_52 = 64.0F / (float) rsmesh_2.anIntArray1989[i_19];
							f_53 = 64.0F / (float) rsmesh_2.anIntArray2000[i_19];
							f_54 = 64.0F / (float) rsmesh_2.anIntArray2001[i_19];
							f_55 = ((float) i_107 * floats_78[0] + (float) i_108 * floats_78[1] + (float) i_109 * floats_78[2]) / f_52;
							f_56 = ((float) i_107 * floats_78[3] + (float) i_108 * floats_78[4] + (float) i_109 * floats_78[5]) / f_53;
							f_57 = ((float) i_107 * floats_78[6] + (float) i_108 * floats_78[7] + (float) i_109 * floats_78[8]) / f_54;
							i_96 = this.method11254(f_55, f_56, f_57);
							this.method11255(rsmesh_2.vertexX[s_74], rsmesh_2.vertexY[s_74], rsmesh_2.vertexZ[s_74], i_98, i_99, i_113, i_96, floats_78, b_100, f_40, f_41, f_42, aFloatArray8956);
							f_87 = aFloatArray8956[0];
							f_88 = aFloatArray8956[1];
							this.method11255(rsmesh_2.vertexX[s_75], rsmesh_2.vertexY[s_75], rsmesh_2.vertexZ[s_75], i_98, i_99, i_113, i_96, floats_78, b_100, f_40, f_41, f_42, aFloatArray8956);
							f_89 = aFloatArray8956[0];
							f_91 = aFloatArray8956[1];
							this.method11255(rsmesh_2.vertexX[s_34], rsmesh_2.vertexY[s_34], rsmesh_2.vertexZ[s_34], i_98, i_99, i_113, i_96, floats_78, b_100, f_40, f_41, f_42, aFloatArray8956);
							f_92 = aFloatArray8956[0];
							f_93 = aFloatArray8956[1];
						} else if (b_71 == 3) {
							this.method11271(rsmesh_2.vertexX[s_74], rsmesh_2.vertexY[s_74], rsmesh_2.vertexZ[s_74], i_98, i_99, i_113, floats_78, b_100, f_40, aFloatArray8956);
							f_87 = aFloatArray8956[0];
							f_88 = aFloatArray8956[1];
							this.method11271(rsmesh_2.vertexX[s_75], rsmesh_2.vertexY[s_75], rsmesh_2.vertexZ[s_75], i_98, i_99, i_113, floats_78, b_100, f_40, aFloatArray8956);
							f_89 = aFloatArray8956[0];
							f_91 = aFloatArray8956[1];
							this.method11271(rsmesh_2.vertexX[s_34], rsmesh_2.vertexY[s_34], rsmesh_2.vertexZ[s_34], i_98, i_99, i_113, floats_78, b_100, f_40, aFloatArray8956);
							f_92 = aFloatArray8956[0];
							f_93 = aFloatArray8956[1];
							if ((b_100 & 0x1) == 0) {
								if (f_89 - f_87 > 0.5F) {
									--f_89;
									b_94 = 1;
								} else if (f_87 - f_89 > 0.5F) {
									++f_89;
									b_94 = 2;
								}

								if (f_92 - f_87 > 0.5F) {
									--f_92;
									b_95 = 1;
								} else if (f_87 - f_92 > 0.5F) {
									++f_92;
									b_95 = 2;
								}
							} else {
								if (f_91 - f_88 > 0.5F) {
									--f_91;
									b_94 = 1;
								} else if (f_88 - f_91 > 0.5F) {
									++f_91;
									b_94 = 2;
								}

								if (f_93 - f_88 > 0.5F) {
									--f_93;
									b_95 = 1;
								} else if (f_88 - f_93 > 0.5F) {
									++f_93;
									b_95 = 2;
								}
							}
						}
					}
				}
			}

			if (rsmesh_2.faceType == null) {
				b_71 = 0;
			} else {
				b_71 = rsmesh_2.faceType[i_81];
			}

			if (b_71 == 0) {
				long long_32 = (long) (i_19 << 2) + ((long) (i_96 << 24) + (long) (i_85 << 8) + (long) i_20 << 32);
				s_34 = rsmesh_2.triangleX[i_81];
				s_35 = rsmesh_2.triangleY[i_81];
				s_36 = rsmesh_2.triangleZ[i_81];
				Class36 class36_37 = arr_64[s_34];
				this.aShortArray8920[i_79] = this.method14266(rsmesh_2, s_34, i_79, long_32, class36_37.anInt387, class36_37.anInt385, class36_37.anInt384, class36_37.anInt386, f_87, f_88);
				class36_37 = arr_64[s_35];
				this.aShortArray8921[i_79] = this.method14266(rsmesh_2, s_35, i_79, long_32 + (long) b_94, class36_37.anInt387, class36_37.anInt385, class36_37.anInt384, class36_37.anInt386, f_89, f_91);
				class36_37 = arr_64[s_36];
				this.aShortArray8922[i_79] = this.method14266(rsmesh_2, s_36, i_79, long_32 + (long) b_95, class36_37.anInt387, class36_37.anInt385, class36_37.anInt384, class36_37.anInt386, f_92, f_93);
			} else if (b_71 == 1) {
				Class64 class64_72 = arr_15[i_81];
				long long_33 = (long) ((i_19 << 2) + (class64_72.anInt665 > 0 ? 1024 : 2048) + (class64_72.anInt666 + 256 << 12) + (class64_72.anInt667 + 256 << 22)) + ((long) (i_96 << 24) + (long) (i_85 << 8) + (long) i_20 << 32);
				this.aShortArray8920[i_79] = this.method14266(rsmesh_2, rsmesh_2.triangleX[i_81], i_79, long_33, class64_72.anInt665, class64_72.anInt666, class64_72.anInt667, 0, f_87, f_88);
				this.aShortArray8921[i_79] = this.method14266(rsmesh_2, rsmesh_2.triangleY[i_81], i_79, long_33 + (long) b_94, class64_72.anInt665, class64_72.anInt666, class64_72.anInt667, 0, f_89, f_91);
				this.aShortArray8922[i_79] = this.method14266(rsmesh_2, rsmesh_2.triangleZ[i_81], i_79, long_33 + (long) b_95, class64_72.anInt665, class64_72.anInt666, class64_72.anInt667, 0, f_92, f_93);
			}

			if (rsmesh_2.faceAlphas != null) {
				this.aByteArray8900[i_79] = rsmesh_2.faceAlphas[i_81];
			}

			if (rsmesh_2.aShortArray1981 != null) {
				this.aShortArray8925[i_79] = rsmesh_2.aShortArray1981[i_81];
			}

			this.aShortArray8918[i_79] = rsmesh_2.faceColor[i_81];
			this.aShortArray8923[i_79] = s_86;
		}

		if (this.anInt8963 > 0) {
			i_79 = 1;
			s_80 = this.aShortArray8923[0];

			for (i_85 = 0; i_85 < this.anInt8963; i_85++) {
				s_84 = this.aShortArray8923[i_85];
				if (s_84 != s_80) {
					++i_79;
					s_80 = s_84;
				}
			}

			this.anIntArray8952 = new int[i_79];
			this.anIntArray8946 = new int[i_79];
			this.anIntArray8944 = new int[i_79 + 1];
			this.anIntArray8944[0] = 0;
			i_85 = this.anInt8906;
			s_84 = 0;
			i_79 = 0;
			s_80 = this.aShortArray8923[0];

			for (i_20 = 0; i_20 < this.anInt8963; i_20++) {
				s_86 = this.aShortArray8923[i_20];
				if (s_86 != s_80) {
					this.anIntArray8952[i_79] = i_85;
					this.anIntArray8946[i_79] = s_84 - i_85 + 1;
					++i_79;
					this.anIntArray8944[i_79] = i_20;
					i_85 = this.anInt8906;
					s_84 = 0;
					s_80 = s_86;
				}

				short s_90 = this.aShortArray8920[i_20];
				if (s_90 < i_85) {
					i_85 = s_90;
				}

				if (s_90 > s_84) {
					s_84 = s_90;
				}

				s_90 = this.aShortArray8921[i_20];
				if (s_90 < i_85) {
					i_85 = s_90;
				}

				if (s_90 > s_84) {
					s_84 = s_90;
				}

				s_90 = this.aShortArray8922[i_20];
				if (s_90 < i_85) {
					i_85 = s_90;
				}

				if (s_90 > s_84) {
					s_84 = s_90;
				}
			}

			this.anIntArray8952[i_79] = i_85;
			this.anIntArray8946[i_79] = s_84 - i_85 + 1;
			++i_79;
			this.anIntArray8944[i_79] = this.anInt8963;
		}

		aLongArray8955 = null;
		this.aShortArray8907 = method14311(this.aShortArray8907, this.anInt8906);
		this.aShortArray8945 = method14311(this.aShortArray8945, this.anInt8906);
		this.aShortArray8909 = method14311(this.aShortArray8909, this.anInt8906);
		this.aShortArray8933 = method14311(this.aShortArray8933, this.anInt8906);
		this.aShortArray8911 = method14311(this.aShortArray8911, this.anInt8906);
		this.aByteArray8912 = method14265(this.aByteArray8912, this.anInt8906);
		this.aFloatArray8892 = method14286(this.aFloatArray8892, this.anInt8906);
		this.aFloatArray8914 = method14286(this.aFloatArray8914, this.anInt8906);
		if (rsmesh_2.vertexSkins != null && Class50.method1007(i_3, this.anInt8896)) {
			this.anIntArrayArray8966 = rsmesh_2.method2665(false);
		}

		if (rsmesh_2.aClass84Array2009 != null && Class50.method1008(i_3, this.anInt8896)) {
			this.anIntArrayArray8954 = rsmesh_2.method2667();
		}

		if (rsmesh_2.skinValues != null && Class50.method1006(i_3, this.anInt8896)) {
			i_79 = 0;
			int[] ints_68 = new int[256];

			for (i_85 = 0; i_85 < this.anInt8916; i_85++) {
				i_19 = rsmesh_2.skinValues[ints_8[i_85]];
				if (i_19 >= 0) {
					++ints_68[i_19];
					if (i_19 > i_79) {
						i_79 = i_19;
					}
				}
			}

			this.anIntArrayArray8924 = new int[i_79 + 1][];

			for (i_85 = 0; i_85 <= i_79; i_85++) {
				this.anIntArrayArray8924[i_85] = new int[ints_68[i_85]];
				ints_68[i_85] = 0;
			}

			for (i_85 = 0; i_85 < this.anInt8916; i_85++) {
				i_19 = rsmesh_2.skinValues[ints_8[i_85]];
				if (i_19 >= 0) {
					this.anIntArrayArray8924[i_19][ints_68[i_19]++] = i_85;
				}
			}
		}

	}

	public void method11269(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class528_Sub3 class528_sub3_6 = (Class528_Sub3) meshrasterizer_1;
		if (this.anInt8916 != 0 && class528_sub3_6.anInt8916 != 0) {
			int i_7 = class528_sub3_6.anInt8910;
			int[] ints_8 = class528_sub3_6.anIntArray8901;
			int[] ints_9 = class528_sub3_6.anIntArray8902;
			int[] ints_10 = class528_sub3_6.anIntArray8931;
			short[] shorts_11 = class528_sub3_6.aShortArray8909;
			short[] shorts_12 = class528_sub3_6.aShortArray8933;
			short[] shorts_13 = class528_sub3_6.aShortArray8911;
			byte[] bytes_14 = class528_sub3_6.aByteArray8912;
			short[] shorts_15;
			short[] shorts_16;
			short[] shorts_17;
			byte[] bytes_18;
			if (this.aClass355_8962 != null) {
				shorts_15 = this.aClass355_8962.aShortArray4115;
				shorts_16 = this.aClass355_8962.aShortArray4114;
				shorts_17 = this.aClass355_8962.aShortArray4113;
				bytes_18 = this.aClass355_8962.aByteArray4116;
			} else {
				shorts_15 = null;
				shorts_16 = null;
				shorts_17 = null;
				bytes_18 = null;
			}

			short[] shorts_19;
			short[] shorts_20;
			short[] shorts_21;
			byte[] bytes_22;
			if (class528_sub3_6.aClass355_8962 != null) {
				shorts_19 = class528_sub3_6.aClass355_8962.aShortArray4115;
				shorts_20 = class528_sub3_6.aClass355_8962.aShortArray4114;
				shorts_21 = class528_sub3_6.aClass355_8962.aShortArray4113;
				bytes_22 = class528_sub3_6.aClass355_8962.aByteArray4116;
			} else {
				shorts_19 = null;
				shorts_20 = null;
				shorts_21 = null;
				bytes_22 = null;
			}

			int[] ints_23 = class528_sub3_6.anIntArray8947;
			short[] shorts_24 = class528_sub3_6.aShortArray8948;
			if (!class528_sub3_6.aBool8937) {
				class528_sub3_6.method14281();
			}

			int i_25 = class528_sub3_6.anInt8908;
			int i_26 = class528_sub3_6.anInt8893;
			int i_27 = class528_sub3_6.anInt8940;
			int i_28 = class528_sub3_6.anInt8941;
			int i_29 = class528_sub3_6.anInt8942;
			int i_30 = class528_sub3_6.anInt8943;

			for (int i_31 = 0; i_31 < this.anInt8910; i_31++) {
				int i_32 = this.anIntArray8902[i_31] - i_3;
				if (i_32 >= i_25 && i_32 <= i_26) {
					int i_33 = this.anIntArray8901[i_31] - i_2;
					if (i_33 >= i_27 && i_33 <= i_28) {
						int i_34 = this.anIntArray8931[i_31] - i_4;
						if (i_34 >= i_29 && i_34 <= i_30) {
							int i_35 = -1;
							int i_36 = this.anIntArray8947[i_31];
							int i_37 = this.anIntArray8947[i_31 + 1];

							int i_38;
							for (i_38 = i_36; i_38 < i_37; i_38++) {
								i_35 = this.aShortArray8948[i_38] - 1;
								if (i_35 == -1 || this.aByteArray8912[i_35] != 0) {
									break;
								}
							}

							if (i_35 != -1) {
								for (i_38 = 0; i_38 < i_7; i_38++) {
									if (i_33 == ints_8[i_38] && i_34 == ints_10[i_38] && i_32 == ints_9[i_38]) {
										int i_39 = -1;
										i_36 = ints_23[i_38];
										i_37 = ints_23[i_38 + 1];

										for (int i_40 = i_36; i_40 < i_37; i_40++) {
											i_39 = shorts_24[i_40] - 1;
											if (i_39 == -1 || bytes_14[i_39] != 0) {
												break;
											}
										}

										if (i_39 != -1) {
											if (shorts_15 == null) {
												this.aClass355_8962 = new Class355();
												shorts_15 = this.aClass355_8962.aShortArray4115 = Class512.method8761(this.aShortArray8909, 359522952);
												shorts_16 = this.aClass355_8962.aShortArray4114 = Class512.method8761(this.aShortArray8933, 943738498);
												shorts_17 = this.aClass355_8962.aShortArray4113 = Class512.method8761(this.aShortArray8911, 1204065687);
												bytes_18 = this.aClass355_8962.aByteArray4116 = AnimationFrameSet.method15090(this.aByteArray8912, -2142109036);
											}

											if (shorts_19 == null) {
												Class355 class355_46 = class528_sub3_6.aClass355_8962 = new Class355();
												shorts_19 = class355_46.aShortArray4115 = Class512.method8761(shorts_11, 1575595200);
												shorts_20 = class355_46.aShortArray4114 = Class512.method8761(shorts_12, 1808523418);
												shorts_21 = class355_46.aShortArray4113 = Class512.method8761(shorts_13, 261274610);
												bytes_22 = class355_46.aByteArray4116 = AnimationFrameSet.method15090(bytes_14, -2131501259);
											}

											short s_47 = this.aShortArray8909[i_35];
											short s_41 = this.aShortArray8933[i_35];
											short s_42 = this.aShortArray8911[i_35];
											byte b_43 = this.aByteArray8912[i_35];
											i_36 = ints_23[i_38];
											i_37 = ints_23[i_38 + 1];

											int i_44;
											int i_45;
											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = shorts_24[i_44] - 1;
												if (i_45 == -1) {
													break;
												}

												if (bytes_22[i_45] != 0) {
													shorts_19[i_45] += s_47;
													shorts_20[i_45] += s_41;
													shorts_21[i_45] += s_42;
													bytes_22[i_45] += b_43;
												}
											}

											s_47 = shorts_11[i_39];
											s_41 = shorts_12[i_39];
											s_42 = shorts_13[i_39];
											b_43 = bytes_14[i_39];
											i_36 = this.anIntArray8947[i_31];
											i_37 = this.anIntArray8947[i_31 + 1];

											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = this.aShortArray8948[i_44] - 1;
												if (i_45 == -1) {
													break;
												}

												if (bytes_18[i_45] != 0) {
													shorts_15[i_45] += s_47;
													shorts_16[i_45] += s_41;
													shorts_17[i_45] += s_42;
													bytes_18[i_45] += b_43;
												}
											}

											class528_sub3_6.method14285();
											this.method14285();
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

	public void p(int i_1) {
		this.aShort8897 = (short) i_1;
		this.method14269();
	}

	public void Q(int i_1) {
		this.aShort8898 = (short) i_1;
		this.method14268();
		this.method14285();
	}

	void method14274() {
		if (this.aBool8919) {
			this.aBool8919 = false;
			if (this.aClass87Array8949 == null && this.aClass172Array8950 == null && this.aClass56Array8934 == null && !Class50.method981(this.anInt8895, this.anInt8896)) {
				boolean bool_1 = false;
				boolean bool_2 = false;
				boolean bool_3 = false;
				if (this.anIntArray8901 != null && !Class50.method1000(this.anInt8895, this.anInt8896)) {
					if (this.aClass63_8927 != null && !this.aClass63_8927.method1264()) {
						this.aBool8919 = true;
					} else {
						if (!this.aBool8937) {
							this.method14281();
						}

						bool_1 = true;
					}
				}

				if (this.anIntArray8902 != null && !Class50.method1001(this.anInt8895, this.anInt8896)) {
					if (this.aClass63_8927 != null && !this.aClass63_8927.method1264()) {
						this.aBool8919 = true;
					} else {
						if (!this.aBool8937) {
							this.method14281();
						}

						bool_2 = true;
					}
				}

				if (this.anIntArray8931 != null && !Class50.method1002(this.anInt8895, this.anInt8896)) {
					if (this.aClass63_8927 != null && !this.aClass63_8927.method1264()) {
						this.aBool8919 = true;
					} else {
						if (!this.aBool8937) {
							this.method14281();
						}

						bool_3 = true;
					}
				}

				if (bool_1) {
					this.anIntArray8901 = null;
				}

				if (bool_2) {
					this.anIntArray8902 = null;
				}

				if (bool_3) {
					this.anIntArray8931 = null;
				}
			}

			if (this.aShortArray8948 != null && this.anIntArray8901 == null && this.anIntArray8902 == null && this.anIntArray8931 == null) {
				this.aShortArray8948 = null;
				this.anIntArray8947 = null;
			}

			if (this.aByteArray8912 != null && !Class50.method996(this.anInt8895, this.anInt8896)) {
				label300: {
					label243: {
						if ((this.anInt8896 & 0x37) != 0) {
							if (this.aClass63_8929 == null || this.aClass63_8929.method1264()) {
								break label243;
							}
						} else if (this.aClass63_8913 == null || this.aClass63_8913.method1264()) {
							break label243;
						}

						this.aBool8919 = true;
						break label300;
					}

					this.aShortArray8911 = null;
					this.aShortArray8933 = null;
					this.aShortArray8909 = null;
					this.aByteArray8912 = null;
				}
			}

			if (this.aShortArray8918 != null && !Class50.method987(this.anInt8895, this.anInt8896)) {
				if (this.aClass63_8913 != null && !this.aClass63_8913.method1264()) {
					this.aBool8919 = true;
				} else {
					this.aShortArray8918 = null;
				}
			}

			if (this.aByteArray8900 != null && !Class50.method1004(this.anInt8895, this.anInt8896)) {
				if (this.aClass63_8913 != null && !this.aClass63_8913.method1264()) {
					this.aBool8919 = true;
				} else {
					this.aByteArray8900 = null;
				}
			}

			if (this.aFloatArray8892 != null && !Class50.method1005(this.anInt8895, this.anInt8896)) {
				if (this.aClass63_8930 != null && !this.aClass63_8930.method1264()) {
					this.aBool8919 = true;
				} else {
					this.aFloatArray8914 = null;
					this.aFloatArray8892 = null;
				}
			}

			if (this.aShortArray8923 != null && !Class50.method1010(this.anInt8895, this.anInt8896)) {
				if (this.aClass63_8913 != null && !this.aClass63_8913.method1264()) {
					this.aBool8919 = true;
				} else {
					this.aShortArray8923 = null;
				}
			}

			if (this.aShortArray8920 != null && !Class50.method1009(this.anInt8895, this.anInt8896)) {
				if ((this.aClass39_8926 == null || this.aClass39_8926.method861()) && (this.aClass63_8913 == null || this.aClass63_8913.method1264())) {
					this.aShortArray8922 = null;
					this.aShortArray8921 = null;
					this.aShortArray8920 = null;
				} else {
					this.aBool8919 = true;
				}
			}

			if (this.aShortArray8907 != null) {
				if (this.aClass63_8927 != null && !this.aClass63_8927.method1264()) {
					this.aBool8919 = true;
				} else {
					this.aShortArray8907 = null;
				}
			}

			if (this.aShortArray8945 != null) {
				if (this.aClass63_8913 != null && !this.aClass63_8913.method1264()) {
					this.aBool8919 = true;
				} else {
					this.aShortArray8945 = null;
				}
			}

			if (this.anIntArrayArray8924 != null && !Class50.method1006(this.anInt8895, this.anInt8896)) {
				this.anIntArrayArray8924 = null;
				this.aShortArray8925 = null;
			}

			if (this.anIntArrayArray8966 != null && !Class50.method1007(this.anInt8895, this.anInt8896)) {
				this.anIntArrayArray8966 = null;
				this.aShortArray8905 = null;
			}

			if (this.anIntArrayArray8954 != null && !Class50.method1008(this.anInt8895, this.anInt8896)) {
				this.anIntArrayArray8954 = null;
			}

			if (this.anIntArray8944 != null && (this.anInt8895 & 0x800) == 0 && (this.anInt8895 & 0x40000) == 0) {
				this.anIntArray8944 = null;
				this.anIntArray8946 = null;
				this.anIntArray8952 = null;
			}
		}

	}

	public void X(short s_1, short s_2) {
		int i_3;
		for (i_3 = 0; i_3 < this.anInt8916; i_3++) {
			if (this.aShortArray8918[i_3] == s_1) {
				this.aShortArray8918[i_3] = s_2;
			}
		}

		if (this.aClass56Array8934 != null) {
			for (i_3 = 0; i_3 < this.anInt8951; i_3++) {
				Class56 class56_4 = this.aClass56Array8934[i_3];
				Class65 class65_5 = this.aClass65Array8953[i_3];
				class65_5.anInt669 = class65_5.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_4.anInt518] & 0xffff] & 0xffffff;
			}
		}

		this.method14269();
	}

	public void method11312(byte b_1, byte[] bytes_2) {
		int i_3;
		if (bytes_2 == null) {
			for (i_3 = 0; i_3 < this.anInt8916; i_3++) {
				this.aByteArray8900[i_3] = b_1;
			}
		} else {
			for (i_3 = 0; i_3 < this.anInt8916; i_3++) {
				int i_4 = 255 - (255 - (b_1 & 0xff)) * (255 - (bytes_2[i_3] & 0xff)) / 255;
				this.aByteArray8900[i_3] = (byte) i_4;
			}
		}

		this.method14269();
	}

	public void W(short s_1, short s_2) {
		Interface22 interface22_3 = this.aClass505_Sub2_8917.anInterface22_5834;

		for (int i_4 = 0; i_4 < this.anInt8916; i_4++) {
			if (this.aShortArray8923[i_4] == s_1) {
				this.aShortArray8923[i_4] = s_2;
			}
		}

		byte b_13 = 0;
		byte b_5 = 0;
		if (s_1 != -1) {
			Class169 class169_6 = interface22_3.method144(s_1 & 0xffff, -2034175789);
			b_13 = class169_6.aByte2079;
			b_5 = class169_6.aByte2080;
		}

		byte b_11 = 0;
		byte b_7 = 0;
		if (s_2 != -1) {
			Class169 class169_8 = interface22_3.method144(s_2 & 0xffff, -1856192723);
			b_11 = class169_8.aByte2079;
			b_7 = class169_8.aByte2080;
			if (class169_8.aByte2081 != 0 || class169_8.aByte2090 != 0) {
				this.aBool8903 = true;
			}
		}

		if (b_13 != b_11 | b_5 != b_7) {
			if (this.aClass56Array8934 != null) {
				for (int i_12 = 0; i_12 < this.anInt8951; i_12++) {
					Class56 class56_9 = this.aClass56Array8934[i_12];
					Class65 class65_10 = this.aClass65Array8953[i_12];
					class65_10.anInt669 = class65_10.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_9.anInt518] & 0xffff] & 0xffffff;
				}
			}

			this.method14269();
		}

	}

	public void method11259() {
		if (this.anInt8906 > 0 && this.anInt8963 > 0) {
			this.method14279();
			this.method14271();
			this.method14274();
		}

	}

	public void method11307(byte b_1, byte[] bytes_2) {
		int i_3;
		if (bytes_2 == null) {
			for (i_3 = 0; i_3 < this.anInt8916 * 3 * -1431655765; i_3++) {
				this.aByteArray8900[i_3] = b_1;
			}
		} else {
			for (i_3 = 0; i_3 < this.anInt8916 * 3 * -1431655765; i_3++) {
				int i_4 = 255 - (255 - (bytes_2[i_3] & 0xff)) * (255 - (b_1 & 0xff)) / 255;
				this.aByteArray8900[i_3] = (byte) i_4;
			}
		}

		this.method14269();
	}

	public boolean i() {
		return this.aBool8959;
	}

	public boolean u() {
		return this.aBool8903;
	}

	public void method11292(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8905 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = this.aClass505_Sub2_8917.aClass294_8713;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < this.anInt8910; i_6++) {
				if ((i_2 & this.aShortArray8905[i_6]) != 0) {
					matrix44var_4.method5226((float) this.anIntArray8901[i_6], (float) this.anIntArray8902[i_6], (float) this.anIntArray8931[i_6], floats_5);
					this.anIntArray8901[i_6] = (int) floats_5[0];
					this.anIntArray8902[i_6] = (int) floats_5[1];
					this.anIntArray8931[i_6] = (int) floats_5[2];
				}
			}
		}

	}

	void method11288() {
	}

	public void bx(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8931[i_4] * i_2 + this.anIntArray8901[i_4] * i_3 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8931[i_4] * i_3 - this.anIntArray8901[i_4] * i_2 >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	void method14275(Matrix44Arr matrix44arr_1) {
		if (this.aClass56Array8934 != null) {
			this.aClass505_Sub2_8917.RA(!this.aBool8959);
			Matrix44Var matrix44var_2 = this.aClass505_Sub2_8917.aClass294_8713;
			Class103 class103_3 = this.aClass505_Sub2_8917.aClass103_8796;

			for (int i_4 = 0; i_4 < this.anInt8951; i_4++) {
				Class56 class56_5 = this.aClass56Array8934[i_4];
				Class65 class65_6 = this.aClass65Array8953[i_4];
				if (!class56_5.aBool522 || !this.aClass505_Sub2_8917.method8471()) {
					float f_7 = (float) (this.anIntArray8901[class56_5.anInt517] + this.anIntArray8901[class56_5.anInt515] + this.anIntArray8901[class56_5.anInt521]) * 0.3333333F;
					float f_8 = (float) (this.anIntArray8902[class56_5.anInt517] + this.anIntArray8902[class56_5.anInt515] + this.anIntArray8902[class56_5.anInt521]) * 0.3333333F;
					float f_9 = (float) (this.anIntArray8931[class56_5.anInt517] + this.anIntArray8931[class56_5.anInt515] + this.anIntArray8931[class56_5.anInt521]) * 0.3333333F;
					float f_10 = matrix44arr_1.buf[0] * f_7 + matrix44arr_1.buf[4] * f_8 + matrix44arr_1.buf[8] * f_9 + matrix44arr_1.buf[12];
					float f_11 = matrix44arr_1.buf[1] * f_7 + matrix44arr_1.buf[5] * f_8 + matrix44arr_1.buf[9] * f_9 + matrix44arr_1.buf[13];
					float f_12 = matrix44arr_1.buf[2] * f_7 + matrix44arr_1.buf[6] * f_8 + matrix44arr_1.buf[10] * f_9 + matrix44arr_1.buf[14];
					float f_13 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11 + f_12 * f_12))) * (float) class56_5.anInt523;
					matrix44var_2.method5213(class65_6.anInt673, class65_6.anInt671 * class56_5.aShort519 >> 7, class65_6.anInt670 * class56_5.aShort520 >> 7, f_10 + (float) class65_6.anInt668 - f_10 * f_13, f_11 + (float) class65_6.anInt672 - f_11 * f_13, f_12 - f_12 * f_13);
					matrix44var_2.method5208(this.aClass505_Sub2_8917.aClass294_8804);
					this.aClass505_Sub2_8917.aClass384_8715.fromVarMatrix44(matrix44var_2);
					class103_3.method1788(this.aClass505_Sub2_8917.aClass384_8715);
					class103_3.aClass384_1058.identity();
					class103_3.anInt1056 = class65_6.anInt669;
					class103_3.anInterface6_1059 = this.aClass505_Sub2_8917.aClass66_8787.method1283(class56_5.aShort516);
					class103_3.method1790();
				}
			}

			this.aClass505_Sub2_8917.RA(true);
		}

	}

	void w(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_6 = 0; i_6 < this.anInt8910; i_6++) {
				anInt8932 += this.anIntArray8901[i_6];
				anInt8939 += this.anIntArray8902[i_6];
				anInt8964 += this.anIntArray8931[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				anInt8932 = i_2 + anInt8932 / i_5;
				anInt8939 = i_3 + anInt8939 / i_5;
				anInt8964 = i_4 + anInt8964 / i_5;
			} else {
				anInt8932 = i_2;
				anInt8939 = i_3;
				anInt8964 = i_4;
			}
		} else if (i_1 == 1) {
			for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
				this.anIntArray8901[i_5] += i_2;
				this.anIntArray8902[i_5] += i_3;
				this.anIntArray8931[i_5] += i_4;
			}
		} else {
			int i_7;
			int i_8;
			if (i_1 == 2) {
				for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
					this.anIntArray8901[i_5] -= anInt8932;
					this.anIntArray8902[i_5] -= anInt8939;
					this.anIntArray8931[i_5] -= anInt8964;
					if (i_4 != 0) {
						i_6 = Class382.anIntArray4657[i_4];
						i_7 = Class382.anIntArray4661[i_4];
						i_8 = i_6 * this.anIntArray8902[i_5] + i_7 * this.anIntArray8901[i_5] + 16383 >> 14;
						this.anIntArray8902[i_5] = i_7 * this.anIntArray8902[i_5] - i_6 * this.anIntArray8901[i_5] + 16383 >> 14;
						this.anIntArray8901[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Class382.anIntArray4657[i_2];
						i_7 = Class382.anIntArray4661[i_2];
						i_8 = i_7 * this.anIntArray8902[i_5] - i_6 * this.anIntArray8931[i_5] + 16383 >> 14;
						this.anIntArray8931[i_5] = i_6 * this.anIntArray8902[i_5] + i_7 * this.anIntArray8931[i_5] + 16383 >> 14;
						this.anIntArray8902[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Class382.anIntArray4657[i_3];
						i_7 = Class382.anIntArray4661[i_3];
						i_8 = i_6 * this.anIntArray8931[i_5] + i_7 * this.anIntArray8901[i_5] + 16383 >> 14;
						this.anIntArray8931[i_5] = i_7 * this.anIntArray8931[i_5] - i_6 * this.anIntArray8901[i_5] + 16383 >> 14;
						this.anIntArray8901[i_5] = i_8;
					}

					this.anIntArray8901[i_5] += anInt8932;
					this.anIntArray8902[i_5] += anInt8939;
					this.anIntArray8931[i_5] += anInt8964;
				}
			} else if (i_1 == 3) {
				for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
					this.anIntArray8901[i_5] -= anInt8932;
					this.anIntArray8902[i_5] -= anInt8939;
					this.anIntArray8931[i_5] -= anInt8964;
					this.anIntArray8901[i_5] = i_2 * this.anIntArray8901[i_5] / 128;
					this.anIntArray8902[i_5] = i_3 * this.anIntArray8902[i_5] / 128;
					this.anIntArray8931[i_5] = i_4 * this.anIntArray8931[i_5] / 128;
					this.anIntArray8901[i_5] += anInt8932;
					this.anIntArray8902[i_5] += anInt8939;
					this.anIntArray8931[i_5] += anInt8964;
				}
			} else {
				Class56 class56_10;
				Class65 class65_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < this.anInt8916; i_5++) {
						i_6 = (this.aByteArray8900[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0) {
							i_6 = 0;
						} else if (i_6 > 255) {
							i_6 = 255;
						}

						this.aByteArray8900[i_5] = (byte) i_6;
					}

					if (this.aClass56Array8934 != null) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class56_10 = this.aClass56Array8934[i_5];
							class65_11 = this.aClass65Array8953[i_5];
							class65_11.anInt669 = class65_11.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_10.anInt518] & 0xff) << 24;
						}
					}

					this.method14269();
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < this.anInt8916; i_5++) {
						i_6 = this.aShortArray8918[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
						i_8 = i_6 >> 7 & 0x7;
						int i_9 = i_6 & 0x7f;
						i_7 = i_7 + i_2 & 0x3f;
						i_8 += i_3 / 4;
						if (i_8 < 0) {
							i_8 = 0;
						} else if (i_8 > 7) {
							i_8 = 7;
						}

						i_9 += i_4;
						if (i_9 < 0) {
							i_9 = 0;
						} else if (i_9 > 127) {
							i_9 = 127;
						}

						this.aShortArray8918[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					if (this.aClass56Array8934 != null) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class56_10 = this.aClass56Array8934[i_5];
							class65_11 = this.aClass65Array8953[i_5];
							class65_11.anInt669 = class65_11.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_10.anInt518] & 0xffff] & 0xffffff;
						}
					}

					this.method14269();
				} else {
					Class65 class65_12;
					if (i_1 == 8) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt668 += i_2;
							class65_12.anInt672 += i_3;
						}
					} else if (i_1 == 10) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt671 = i_2 * class65_12.anInt671 >> 7;
							class65_12.anInt670 = i_3 * class65_12.anInt670 >> 7;
						}
					} else if (i_1 == 9) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt673 = i_2 + class65_12.anInt673 & 0x3fff;
						}
					}
				}
			}
		}

	}

	void method11268(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		int i_8 = ints_2.length;
		int i_9;
		int i_10;
		int i_11;
		int[] ints_12;
		int i_13;
		int i_14;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			i_9 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_10 = 0; i_10 < i_8; i_10++) {
				i_11 = ints_2[i_10];
				if (i_11 < this.anIntArrayArray8966.length) {
					ints_12 = this.anIntArrayArray8966[i_11];

					for (i_13 = 0; i_13 < ints_12.length; i_13++) {
						i_14 = ints_12[i_13];
						anInt8932 += this.anIntArray8901[i_14];
						anInt8939 += this.anIntArray8902[i_14];
						anInt8964 += this.anIntArray8931[i_14];
						++i_9;
					}
				}
			}

			if (i_9 > 0) {
				anInt8932 = i_3 + anInt8932 / i_9;
				anInt8939 = i_4 + anInt8939 / i_9;
				anInt8964 = i_5 + anInt8964 / i_9;
			} else {
				anInt8932 = i_3;
				anInt8939 = i_4;
				anInt8964 = i_5;
			}
		} else {
			int[] ints_21;
			int i_22;
			if (i_1 == 1) {
				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;

				for (i_9 = 0; i_9 < i_8; i_9++) {
					i_10 = ints_2[i_9];
					if (i_10 < this.anIntArrayArray8966.length) {
						ints_21 = this.anIntArrayArray8966[i_10];

						for (i_22 = 0; i_22 < ints_21.length; i_22++) {
							i_13 = ints_21[i_22];
							this.anIntArray8901[i_13] += i_3;
							this.anIntArray8902[i_13] += i_4;
							this.anIntArray8931[i_13] += i_5;
						}
					}
				}
			} else {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_1 == 2) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8966.length) {
							ints_21 = this.anIntArrayArray8966[i_10];
							if ((i_6 & 0x1) == 0) {
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									this.anIntArray8901[i_13] -= anInt8932;
									this.anIntArray8902[i_13] -= anInt8939;
									this.anIntArray8931[i_13] -= anInt8964;
									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = i_14 * this.anIntArray8902[i_13] + i_15 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8902[i_13] = i_15 * this.anIntArray8902[i_13] - i_14 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = i_15 * this.anIntArray8902[i_13] - i_14 * this.anIntArray8931[i_13] + 16383 >> 14;
										this.anIntArray8931[i_13] = i_14 * this.anIntArray8902[i_13] + i_15 * this.anIntArray8931[i_13] + 16383 >> 14;
										this.anIntArray8902[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = i_14 * this.anIntArray8931[i_13] + i_15 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8931[i_13] = i_15 * this.anIntArray8931[i_13] - i_14 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									this.anIntArray8901[i_13] += anInt8932;
									this.anIntArray8902[i_13] += anInt8939;
									this.anIntArray8931[i_13] += anInt8964;
								}
							} else {
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									this.anIntArray8901[i_13] -= anInt8932;
									this.anIntArray8902[i_13] -= anInt8939;
									this.anIntArray8931[i_13] -= anInt8964;
									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = i_15 * this.anIntArray8902[i_13] - i_14 * this.anIntArray8931[i_13] + 16383 >> 14;
										this.anIntArray8931[i_13] = i_14 * this.anIntArray8902[i_13] + i_15 * this.anIntArray8931[i_13] + 16383 >> 14;
										this.anIntArray8902[i_13] = i_16;
									}

									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = i_14 * this.anIntArray8902[i_13] + i_15 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8902[i_13] = i_15 * this.anIntArray8902[i_13] - i_14 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = i_14 * this.anIntArray8931[i_13] + i_15 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8931[i_13] = i_15 * this.anIntArray8931[i_13] - i_14 * this.anIntArray8901[i_13] + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									this.anIntArray8901[i_13] += anInt8932;
									this.anIntArray8902[i_13] += anInt8939;
									this.anIntArray8931[i_13] += anInt8964;
								}
							}
						}
					}

					if (bool_7) {
						for (i_9 = 0; i_9 < i_8; i_9++) {
							i_10 = ints_2[i_9];
							if (i_10 < this.anIntArrayArray8966.length) {
								ints_21 = this.anIntArrayArray8966[i_10];

								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									i_14 = this.anIntArray8947[i_13];
									i_15 = this.anIntArray8947[i_13 + 1];

									for (i_16 = i_14; i_16 < i_15; i_16++) {
										i_17 = this.aShortArray8948[i_16] - 1;
										if (i_17 == -1) {
											break;
										}

										int i_19;
										int i_20;
										if (i_5 != 0) {
											i_18 = Class382.anIntArray4657[i_5];
											i_19 = Class382.anIntArray4661[i_5];
											i_20 = this.aShortArray8933[i_17] * i_18 + this.aShortArray8909[i_17] * i_19 + 16383 >> 14;
											this.aShortArray8933[i_17] = (short) (this.aShortArray8933[i_17] * i_19 - this.aShortArray8909[i_17] * i_18 + 16383 >> 14);
											this.aShortArray8909[i_17] = (short) i_20;
										}

										if (i_3 != 0) {
											i_18 = Class382.anIntArray4657[i_3];
											i_19 = Class382.anIntArray4661[i_3];
											i_20 = this.aShortArray8933[i_17] * i_19 - this.aShortArray8911[i_17] * i_18 + 16383 >> 14;
											this.aShortArray8911[i_17] = (short) (this.aShortArray8933[i_17] * i_18 + this.aShortArray8911[i_17] * i_19 + 16383 >> 14);
											this.aShortArray8933[i_17] = (short) i_20;
										}

										if (i_4 != 0) {
											i_18 = Class382.anIntArray4657[i_4];
											i_19 = Class382.anIntArray4661[i_4];
											i_20 = this.aShortArray8911[i_17] * i_18 + this.aShortArray8909[i_17] * i_19 + 16383 >> 14;
											this.aShortArray8911[i_17] = (short) (this.aShortArray8911[i_17] * i_19 - this.aShortArray8909[i_17] * i_18 + 16383 >> 14);
											this.aShortArray8909[i_17] = (short) i_20;
										}
									}
								}
							}
						}

						this.method14285();
					}
				} else if (i_1 == 3) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8966.length) {
							ints_21 = this.anIntArrayArray8966[i_10];

							for (i_22 = 0; i_22 < ints_21.length; i_22++) {
								i_13 = ints_21[i_22];
								this.anIntArray8901[i_13] -= anInt8932;
								this.anIntArray8902[i_13] -= anInt8939;
								this.anIntArray8931[i_13] -= anInt8964;
								this.anIntArray8901[i_13] = i_3 * this.anIntArray8901[i_13] >> 7;
								this.anIntArray8902[i_13] = i_4 * this.anIntArray8902[i_13] >> 7;
								this.anIntArray8931[i_13] = i_5 * this.anIntArray8931[i_13] >> 7;
								this.anIntArray8901[i_13] += anInt8932;
								this.anIntArray8902[i_13] += anInt8939;
								this.anIntArray8931[i_13] += anInt8964;
							}
						}
					}
				} else {
					boolean bool_24;
					Class65 class65_25;
					Class56 class56_26;
					if (i_1 == 5) {
						if (this.anIntArrayArray8924 != null) {
							bool_24 = false;

							for (i_10 = 0; i_10 < i_8; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8924.length) {
									ints_12 = this.anIntArrayArray8924[i_11];

									for (i_13 = 0; i_13 < ints_12.length; i_13++) {
										i_14 = ints_12[i_13];
										i_15 = (this.aByteArray8900[i_14] & 0xff) + i_3 * 8;
										if (i_15 < 0) {
											i_15 = 0;
										} else if (i_15 > 255) {
											i_15 = 255;
										}

										this.aByteArray8900[i_14] = (byte) i_15;
									}

									bool_24 |= ints_12.length > 0;
								}
							}

							if (bool_24) {
								if (this.aClass56Array8934 != null) {
									for (i_10 = 0; i_10 < this.anInt8951; i_10++) {
										class56_26 = this.aClass56Array8934[i_10];
										class65_25 = this.aClass65Array8953[i_10];
										class65_25.anInt669 = class65_25.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_26.anInt518] & 0xff) << 24;
									}
								}

								this.method14269();
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8924 != null) {
							bool_24 = false;

							for (i_10 = 0; i_10 < i_8; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8924.length) {
									ints_12 = this.anIntArrayArray8924[i_11];

									for (i_13 = 0; i_13 < ints_12.length; i_13++) {
										i_14 = ints_12[i_13];
										i_15 = this.aShortArray8918[i_14] & 0xffff;
										i_16 = i_15 >> 10 & 0x3f;
										i_17 = i_15 >> 7 & 0x7;
										i_18 = i_15 & 0x7f;
										i_16 = i_3 + i_16 & 0x3f;
										i_17 += i_4 / 4;
										if (i_17 < 0) {
											i_17 = 0;
										} else if (i_17 > 7) {
											i_17 = 7;
										}

										i_18 += i_5;
										if (i_18 < 0) {
											i_18 = 0;
										} else if (i_18 > 127) {
											i_18 = 127;
										}

										this.aShortArray8918[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
									}

									bool_24 |= ints_12.length > 0;
								}
							}

							if (bool_24) {
								if (this.aClass56Array8934 != null) {
									for (i_10 = 0; i_10 < this.anInt8951; i_10++) {
										class56_26 = this.aClass56Array8934[i_10];
										class65_25 = this.aClass65Array8953[i_10];
										class65_25.anInt669 = class65_25.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_26.anInt518] & 0xffff] & 0xffffff;
									}
								}

								this.method14269();
							}
						}
					} else {
						Class65 class65_23;
						if (i_1 == 8) {
							if (this.anIntArrayArray8954 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8954.length) {
										ints_21 = this.anIntArrayArray8954[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class65_23 = this.aClass65Array8953[ints_21[i_22]];
											class65_23.anInt668 += i_3;
											class65_23.anInt672 += i_4;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8954 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8954.length) {
										ints_21 = this.anIntArrayArray8954[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class65_23 = this.aClass65Array8953[ints_21[i_22]];
											class65_23.anInt671 = i_3 * class65_23.anInt671 >> 7;
											class65_23.anInt670 = i_4 * class65_23.anInt670 >> 7;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8954 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8954.length) {
									ints_21 = this.anIntArrayArray8954[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										class65_23 = this.aClass65Array8953[ints_21[i_22]];
										class65_23.anInt673 = i_3 + class65_23.anInt673 & 0x3fff;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	void method11260() {
	}

	public int cu() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8941;
	}

	public Class172[] method11274() {
		return this.aClass172Array8950;
	}

	public Class87[] method11253() {
		return this.aClass87Array8949;
	}

	public void method11273(Matrix44Var matrix44var_1) {
		Matrix44Arr matrix44arr_2 = this.aClass505_Sub2_8917.aClass384_8683;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (this.aClass87Array8949 != null) {
			for (i_3 = 0; i_3 < this.aClass87Array8949.length; i_3++) {
				Class87 class87_4 = this.aClass87Array8949[i_3];
				Class87 class87_5 = class87_4;
				if (class87_4.aClass87_835 != null) {
					class87_5 = class87_4.aClass87_835;
				}

				class87_5.anInt844 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt836] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt836] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt836]);
				class87_5.anInt841 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt836] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt836] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt836]);
				class87_5.anInt847 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt836] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt836] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt836]);
				class87_5.anInt834 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt837] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt837] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt837]);
				class87_5.anInt843 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt837] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt837] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt837]);
				class87_5.anInt845 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt837] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt837] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt837]);
				class87_5.anInt846 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt838] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt838] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt838]);
				class87_5.anInt840 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt838] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt838] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt838]);
				class87_5.anInt848 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt838] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt838] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt838]);
			}
		}

		if (this.aClass172Array8950 != null) {
			for (i_3 = 0; i_3 < this.aClass172Array8950.length; i_3++) {
				Class172 class172_6 = this.aClass172Array8950[i_3];
				Class172 class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null) {
					class172_7 = class172_6.aClass172_2114;
				}

				if (class172_6.aClass384_2116 != null) {
					class172_6.aClass384_2116.method6562(matrix44arr_2);
				} else {
					class172_6.aClass384_2116 = new Matrix44Arr(matrix44arr_2);
				}

				class172_7.anInt2113 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class172_6.anInt2119] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class172_6.anInt2119] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class172_6.anInt2119]);
				class172_7.anInt2117 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class172_6.anInt2119] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class172_6.anInt2119] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class172_6.anInt2119]);
				class172_7.anInt2118 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class172_6.anInt2119] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class172_6.anInt2119] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class172_6.anInt2119]);
			}
		}

	}

	public boolean method11270(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		Matrix44Arr matrix44arr_6 = this.aClass505_Sub2_8917.aClass384_8683;
		matrix44arr_6.fromVarMatrix44(matrix44var_3);
		matrix44arr_6.method6523(this.aClass505_Sub2_8917.aClass384_8728);
		boolean bool_7 = false;
		float f_8 = Float.MAX_VALUE;
		float f_9 = -3.4028235E38F;
		float f_10 = Float.MAX_VALUE;
		float f_11 = -3.4028235E38F;
		if (!this.aBool8937) {
			this.method14281();
		}

		int i_12 = this.anInt8941 - this.anInt8940 >> 1;
		int i_13 = this.anInt8893 - this.anInt8908 >> 1;
		int i_14 = this.anInt8943 - this.anInt8942 >> 1;
		int i_15 = i_12 + this.anInt8940;
		int i_16 = i_13 + this.anInt8908;
		int i_17 = i_14 + this.anInt8942;
		int i_18 = i_15 - (i_12 << i_5);
		int i_19 = i_16 - (i_13 << i_5);
		int i_20 = i_17 - (i_14 << i_5);
		int i_21 = i_15 + (i_12 << i_5);
		int i_22 = i_16 + (i_13 << i_5);
		int i_23 = i_17 + (i_14 << i_5);
		anIntArray8894[0] = i_18;
		anIntArray8960[0] = i_19;
		anIntArray8961[0] = i_20;
		anIntArray8894[1] = i_21;
		anIntArray8960[1] = i_19;
		anIntArray8961[1] = i_20;
		anIntArray8894[2] = i_18;
		anIntArray8960[2] = i_22;
		anIntArray8961[2] = i_20;
		anIntArray8894[3] = i_21;
		anIntArray8960[3] = i_22;
		anIntArray8961[3] = i_20;
		anIntArray8894[4] = i_18;
		anIntArray8960[4] = i_19;
		anIntArray8961[4] = i_23;
		anIntArray8894[5] = i_21;
		anIntArray8960[5] = i_19;
		anIntArray8961[5] = i_23;
		anIntArray8894[6] = i_18;
		anIntArray8960[6] = i_22;
		anIntArray8961[6] = i_23;
		anIntArray8894[7] = i_21;
		anIntArray8960[7] = i_22;
		anIntArray8961[7] = i_23;

		int i_24;
		float f_25;
		float f_26;
		float f_27;
		float f_28;
		float f_29;
		float f_30;
		float f_31;
		for (i_24 = 0; i_24 < 8; i_24++) {
			f_25 = (float) anIntArray8894[i_24];
			f_26 = (float) anIntArray8960[i_24];
			f_27 = (float) anIntArray8961[i_24];
			f_28 = matrix44arr_6.buf[2] * f_25 + matrix44arr_6.buf[6] * f_26 + matrix44arr_6.buf[10] * f_27 + matrix44arr_6.buf[14];
			f_29 = matrix44arr_6.buf[3] * f_25 + matrix44arr_6.buf[7] * f_26 + matrix44arr_6.buf[11] * f_27 + matrix44arr_6.buf[15];
			if (f_28 >= -f_29) {
				f_30 = matrix44arr_6.buf[0] * f_25 + matrix44arr_6.buf[4] * f_26 + matrix44arr_6.buf[8] * f_27 + matrix44arr_6.buf[12];
				f_31 = matrix44arr_6.buf[1] * f_25 + matrix44arr_6.buf[5] * f_26 + matrix44arr_6.buf[9] * f_27 + matrix44arr_6.buf[13];
				float f_32 = this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_29;
				float f_33 = this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_29;
				if (f_32 < f_8) {
					f_8 = f_32;
				}

				if (f_32 > f_9) {
					f_9 = f_32;
				}

				if (f_33 < f_10) {
					f_10 = f_33;
				}

				if (f_33 > f_11) {
					f_11 = f_33;
				}

				bool_7 = true;
			}
		}

		if (bool_7 && (float) i_1 > f_8 && (float) i_1 < f_9 && (float) i_2 > f_10 && (float) i_2 < f_11) {
			if (bool_4) {
				return true;
			}

			if (anIntArray8928.length < this.anInt8906) {
				anIntArray8928 = new int[this.anInt8906];
				anIntArray8958 = new int[this.anInt8906];
			}

			for (i_24 = 0; i_24 < this.anInt8910; i_24++) {
				f_25 = (float) this.anIntArray8901[i_24];
				f_26 = (float) this.anIntArray8902[i_24];
				f_27 = (float) this.anIntArray8931[i_24];
				f_28 = matrix44arr_6.buf[2] * f_25 + matrix44arr_6.buf[6] * f_26 + matrix44arr_6.buf[10] * f_27 + matrix44arr_6.buf[14];
				f_29 = matrix44arr_6.buf[3] * f_25 + matrix44arr_6.buf[7] * f_26 + matrix44arr_6.buf[11] * f_27 + matrix44arr_6.buf[15];
				int i_38;
				int i_39;
				if (f_28 >= -f_29) {
					f_30 = matrix44arr_6.buf[0] * f_25 + matrix44arr_6.buf[4] * f_26 + matrix44arr_6.buf[8] * f_27 + matrix44arr_6.buf[12];
					f_31 = matrix44arr_6.buf[1] * f_25 + matrix44arr_6.buf[5] * f_26 + matrix44arr_6.buf[9] * f_27 + matrix44arr_6.buf[13];
					i_38 = this.anIntArray8947[i_24];
					i_39 = this.anIntArray8947[i_24 + 1];

					for (int i_34 = i_38; i_34 < i_39; i_34++) {
						int i_35 = this.aShortArray8948[i_34] - 1;
						if (i_35 == -1) {
							break;
						}

						anIntArray8928[i_35] = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_29);
						anIntArray8958[i_35] = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_29);
					}
				} else {
					int i_36 = this.anIntArray8947[i_24];
					int i_37 = this.anIntArray8947[i_24 + 1];

					for (i_38 = i_36; i_38 < i_37; i_38++) {
						i_39 = this.aShortArray8948[i_38] - 1;
						if (i_39 == -1) {
							break;
						}

						anIntArray8928[this.aShortArray8948[i_38] - 1] = -999999;
					}
				}
			}

			for (i_24 = 0; i_24 < this.anInt8916; i_24++) {
				if (anIntArray8928[this.aShortArray8920[i_24]] != -999999 && anIntArray8928[this.aShortArray8921[i_24]] != -999999 && anIntArray8928[this.aShortArray8922[i_24]] != -999999 && this.method14276(i_1, i_2, anIntArray8958[this.aShortArray8920[i_24]], anIntArray8958[this.aShortArray8921[i_24]], anIntArray8958[this.aShortArray8922[i_24]], anIntArray8928[this.aShortArray8920[i_24]], anIntArray8928[this.aShortArray8921[i_24]], anIntArray8928[this.aShortArray8922[i_24]])) {
					return true;
				}
			}
		}

		return false;
	}

	boolean method14276(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		return i_2 < i_3 && i_2 < i_4 && i_2 < i_5 ? false : (i_2 > i_3 && i_2 > i_4 && i_2 > i_5 ? false : (i_1 < i_6 && i_1 < i_7 && i_1 < i_8 ? false : i_1 <= i_6 || i_1 <= i_7 || i_1 <= i_8));
	}

	public Shadow ga(Shadow class282_sub50_sub17_1) {
		if (this.anInt8906 == 0) {
			return null;
		} else {
			if (!this.aBool8937) {
				this.method14281();
			}

			int i_2;
			int i_3;
			if (this.aClass505_Sub2_8917.anInt8777 > 0) {
				i_2 = this.anInt8940 - (this.aClass505_Sub2_8917.anInt8777 * this.anInt8893 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
				i_3 = this.anInt8941 - (this.aClass505_Sub2_8917.anInt8777 * this.anInt8908 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
			} else {
				i_2 = this.anInt8940 - (this.aClass505_Sub2_8917.anInt8777 * this.anInt8908 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
				i_3 = this.anInt8941 - (this.aClass505_Sub2_8917.anInt8777 * this.anInt8893 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
			}

			int i_4;
			int i_5;
			if (this.aClass505_Sub2_8917.anInt8778 > 0) {
				i_4 = this.anInt8942 - (this.aClass505_Sub2_8917.anInt8778 * this.anInt8893 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
				i_5 = this.anInt8943 - (this.aClass505_Sub2_8917.anInt8778 * this.anInt8908 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
			} else {
				i_4 = this.anInt8942 - (this.aClass505_Sub2_8917.anInt8778 * this.anInt8908 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
				i_5 = this.anInt8943 - (this.aClass505_Sub2_8917.anInt8778 * this.anInt8893 >> 8) >> this.aClass505_Sub2_8917.anInt8806;
			}

			int i_6 = i_3 - i_2 + 1;
			int i_7 = i_5 - i_4 + 1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_8 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_9;
			if (class282_sub50_sub17_sub2_8 != null && class282_sub50_sub17_sub2_8.method16039(i_6, i_7)) {
				class282_sub50_sub17_sub2_9 = class282_sub50_sub17_sub2_8;
				class282_sub50_sub17_sub2_8.method16042();
			} else {
				class282_sub50_sub17_sub2_9 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8917, i_6, i_7);
			}

			class282_sub50_sub17_sub2_9.method16040(i_2, i_4, i_3, i_5);
			this.method14277(class282_sub50_sub17_sub2_9);
			return class282_sub50_sub17_sub2_9;
		}
	}

	void method14277(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_1) {
		if (anIntArray8928.length < this.anInt8906) {
			anIntArray8928 = new int[this.anInt8906];
			anIntArray8958 = new int[this.anInt8906];
		}

		int i_2;
		int i_6;
		int i_7;
		int i_8;
		for (i_2 = 0; i_2 < this.anInt8910; i_2++) {
			int i_3 = (this.anIntArray8901[i_2] - (this.aClass505_Sub2_8917.anInt8777 * this.anIntArray8902[i_2] >> 8) >> this.aClass505_Sub2_8917.anInt8806) - class282_sub50_sub17_sub2_1.anInt10453;
			int i_4 = (this.anIntArray8931[i_2] - (this.aClass505_Sub2_8917.anInt8778 * this.anIntArray8902[i_2] >> 8) >> this.aClass505_Sub2_8917.anInt8806) - class282_sub50_sub17_sub2_1.anInt10455;
			int i_5 = this.anIntArray8947[i_2];
			i_6 = this.anIntArray8947[i_2 + 1];

			for (i_7 = i_5; i_7 < i_6; i_7++) {
				i_8 = this.aShortArray8948[i_7] - 1;
				if (i_8 == -1) {
					break;
				}

				anIntArray8928[i_8] = i_3;
				anIntArray8958[i_8] = i_4;
			}
		}

		for (i_2 = 0; i_2 < this.anInt8963; i_2++) {
			if (this.aByteArray8900 == null || this.aByteArray8900[i_2] <= 128) {
				short s_12 = this.aShortArray8920[i_2];
				short s_13 = this.aShortArray8921[i_2];
				short s_14 = this.aShortArray8922[i_2];
				i_6 = anIntArray8928[s_12];
				i_7 = anIntArray8928[s_13];
				i_8 = anIntArray8928[s_14];
				int i_9 = anIntArray8958[s_12];
				int i_10 = anIntArray8958[s_13];
				int i_11 = anIntArray8958[s_14];
				if ((i_6 - i_7) * (i_10 - i_11) - (i_10 - i_9) * (i_8 - i_7) > 0) {
					class282_sub50_sub17_sub2_1.method16043(i_9, i_10, i_11, i_6, i_7, i_8);
				}
			}
		}

	}

	public void method11282(Matrix44Var matrix44var_1, Class275_Sub5 class275_sub5_2, int i_3) {
		if (aClass34_8938 != null) {
			aClass34_8938.method841();
		}

		if (this.anInt8906 != 0) {
			Matrix44Arr matrix44arr_4 = this.aClass505_Sub2_8917.aClass384_8724;
			Matrix44Arr matrix44arr_5 = this.aClass505_Sub2_8917.aClass384_8683;
			Matrix44Arr matrix44arr_6 = this.aClass505_Sub2_8917.aClass384_8715;
			matrix44arr_5.fromVarMatrix44(matrix44var_1);
			matrix44arr_6.method6562(matrix44arr_5);
			matrix44arr_6.method6523(this.aClass505_Sub2_8917.aClass384_8728);
			if (!this.aBool8937) {
				this.method14281();
			}

			float[] floats_7 = this.aClass505_Sub2_8917.aFloatArray8717;
			matrix44arr_5.method6527(0.0F, (float) this.anInt8908, 0.0F, floats_7);
			float f_8 = floats_7[0];
			float f_9 = floats_7[1];
			float f_10 = floats_7[2];
			matrix44arr_5.method6527(0.0F, (float) this.anInt8893, 0.0F, floats_7);
			float f_11 = floats_7[0];
			float f_12 = floats_7[1];
			float f_13 = floats_7[2];

			for (int i_14 = 0; i_14 < 6; i_14++) {
				float[] floats_33 = this.aClass505_Sub2_8917.aFloatArrayArray8730[i_14];
				float f_16 = floats_33[0] * f_8 + floats_33[1] * f_9 + floats_33[2] * f_10 + floats_33[3] + (float) this.anInt8936;
				float f_17 = floats_33[0] * f_11 + floats_33[1] * f_12 + floats_33[2] * f_13 + floats_33[3] + (float) this.anInt8936;
				if (f_16 < 0.0F && f_17 < 0.0F) {
					return;
				}
			}

			if (class275_sub5_2 != null) {
				boolean bool_34 = false;
				boolean bool_15 = true;
				int i_35 = this.anInt8940 + this.anInt8941 >> 1;
				int i_36 = this.anInt8942 + this.anInt8943 >> 1;
				int i_19 = this.anInt8908;
				float f_21 = matrix44arr_6.buf[0] * (float) i_35 + matrix44arr_6.buf[4] * (float) i_19 + matrix44arr_6.buf[8] * (float) i_36 + matrix44arr_6.buf[12];
				float f_22 = matrix44arr_6.buf[1] * (float) i_35 + matrix44arr_6.buf[5] * (float) i_19 + matrix44arr_6.buf[9] * (float) i_36 + matrix44arr_6.buf[13];
				float f_23 = matrix44arr_6.buf[2] * (float) i_35 + matrix44arr_6.buf[6] * (float) i_19 + matrix44arr_6.buf[10] * (float) i_36 + matrix44arr_6.buf[14];
				float f_24 = matrix44arr_6.buf[3] * (float) i_35 + matrix44arr_6.buf[7] * (float) i_19 + matrix44arr_6.buf[11] * (float) i_36 + matrix44arr_6.buf[15];
				if (f_23 >= -f_24) {
					class275_sub5_2.anInt7847 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_21 / f_24);
					class275_sub5_2.anInt7848 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_22 / f_24);
				} else {
					bool_34 = true;
				}

				i_19 = this.anInt8893;
				float f_25 = matrix44arr_6.buf[0] * (float) i_35 + matrix44arr_6.buf[4] * (float) i_19 + matrix44arr_6.buf[8] * (float) i_36 + matrix44arr_6.buf[12];
				float f_26 = matrix44arr_6.buf[1] * (float) i_35 + matrix44arr_6.buf[5] * (float) i_19 + matrix44arr_6.buf[9] * (float) i_36 + matrix44arr_6.buf[13];
				float f_27 = matrix44arr_6.buf[2] * (float) i_35 + matrix44arr_6.buf[6] * (float) i_19 + matrix44arr_6.buf[10] * (float) i_36 + matrix44arr_6.buf[14];
				float f_28 = matrix44arr_6.buf[3] * (float) i_35 + matrix44arr_6.buf[7] * (float) i_19 + matrix44arr_6.buf[11] * (float) i_36 + matrix44arr_6.buf[15];
				if (f_27 >= -f_28) {
					class275_sub5_2.anInt7850 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_25 / f_28);
					class275_sub5_2.anInt7846 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_26 / f_28);
				} else {
					bool_34 = true;
				}

				float f_29;
				float f_30;
				if (bool_34) {
					if (f_23 < -f_24 && f_27 < -f_28) {
						bool_15 = false;
					} else {
						float f_31;
						float f_32;
						if (f_23 < -f_24) {
							f_29 = (f_23 + f_24) / (f_27 + f_28) - 1.0F;
							f_30 = f_21 + f_29 * (f_25 - f_21);
							f_31 = f_22 + f_29 * (f_26 - f_22);
							f_32 = f_24 + f_29 * (f_28 - f_24);
							class275_sub5_2.anInt7847 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_32);
							class275_sub5_2.anInt7848 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_32);
						} else if (f_27 < -f_28) {
							f_29 = (f_27 + f_28) / (f_23 + f_24) - 1.0F;
							f_30 = f_25 + f_29 * (f_21 - f_25);
							f_31 = f_26 + f_29 * (f_22 - f_26);
							f_32 = f_28 + f_29 * (f_24 - f_28);
							class275_sub5_2.anInt7850 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_32);
							class275_sub5_2.anInt7846 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_32);
						}
					}
				}

				if (bool_15) {
					if (f_23 / f_24 > f_27 / f_28) {
						f_29 = f_21 + matrix44arr_4.buf[0] * (float) this.anInt8936 + matrix44arr_4.buf[12];
						f_30 = f_24 + matrix44arr_4.buf[3] * (float) this.anInt8936 + matrix44arr_4.buf[15];
						class275_sub5_2.anInt7851 = (int) (this.aClass505_Sub2_8917.aFloat8797 - (float) class275_sub5_2.anInt7847 + this.aClass505_Sub2_8917.aFloat8732 * f_29 / f_30);
					} else {
						f_29 = f_25 + matrix44arr_4.buf[0] * (float) this.anInt8936 + matrix44arr_4.buf[12];
						f_30 = f_28 + matrix44arr_4.buf[3] * (float) this.anInt8936 + matrix44arr_4.buf[15];
						class275_sub5_2.anInt7851 = (int) (this.aClass505_Sub2_8917.aFloat8797 - (float) class275_sub5_2.anInt7850 + this.aClass505_Sub2_8917.aFloat8732 * f_29 / f_30);
					}

					class275_sub5_2.aBool7849 = true;
				}
			}

			this.aClass505_Sub2_8917.method14098(i_3);
			this.method14278(matrix44var_1);
			this.aClass505_Sub2_8917.method14098(0);
			matrix44arr_5.fromVarMatrix44(matrix44var_1);
			matrix44arr_5.method6523(this.aClass505_Sub2_8917.aClass384_8740);
			this.method14275(matrix44arr_5);
		}

	}

	void method14278(Matrix44Var matrix44var_1) {
		if (this.anInt8963 != 0 && this.method14279() && this.method14271()) {
			this.aClass505_Sub2_8917.method14004();
			Class48 class48_2 = this.aClass505_Sub2_8917.aClass48_8794;
			this.aClass505_Sub2_8917.method14161(0, this.aClass63_8927.anInterface4_661);
			this.aClass505_Sub2_8917.method14161(1, this.aClass63_8913.anInterface4_661);
			this.aClass505_Sub2_8917.method14161(2, this.aClass63_8930.anInterface4_661);
			this.aClass505_Sub2_8917.method13997(this.aClass39_8926.anInterface32_407);
			this.aClass505_Sub2_8917.aClass384_8683.fromVarMatrix44(matrix44var_1);
			class48_2.method957(this.aClass505_Sub2_8917.aClass384_8683);
			class48_2.aClass384_454.identity();
			if (this.aClass505_Sub2_8917.aBool8779) {
				Class90 class90_3 = this.aClass505_Sub2_8917.method13898();
				class48_2.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) (-this.aClass505_Sub2_8917.anInt8739));
				class48_2.aClass303_458.scale(3.0F / (float) class90_3.scale);
				class48_2.aClass385_459.set((float) (class90_3.color >> 16 & 0xff) / 255.0F, (float) (class90_3.color >> 8 & 0xff) / 255.0F, (float) (class90_3.color >> 0 & 0xff) / 255.0F);
			} else {
				class48_2.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_2.aClass385_459.set(0.0F, 0.0F, 0.0F);
			}

			if (this.aClass505_Sub2_8917.anInt8811 > 0) {
				class48_2.aClass303_460.set(0.0F, 0.0F, 1.0F, -this.aClass505_Sub2_8917.aFloat8813);
				class48_2.aClass385_457.set((float) (this.aClass505_Sub2_8917.anInt8810 >> 16 & 0xff) / 255.0F, (float) (this.aClass505_Sub2_8917.anInt8810 >> 8 & 0xff) / 255.0F, (float) (this.aClass505_Sub2_8917.anInt8810 >> 0 & 0xff) / 255.0F);
				this.aClass505_Sub2_8917.aClass384_8683.fromVarMatrix44(matrix44var_1);
				this.aClass505_Sub2_8917.aClass384_8683.method6520();
				class48_2.aClass303_458.concat(this.aClass505_Sub2_8917.aClass384_8683);
				this.aClass505_Sub2_8917.aClass384_8683.fromVarMatrix44(matrix44var_1);
				this.aClass505_Sub2_8917.aClass384_8683.method6523(this.aClass505_Sub2_8917.aClass384_8740);
				this.aClass505_Sub2_8917.aClass384_8683.method6520();
				class48_2.aClass303_460.concat(this.aClass505_Sub2_8917.aClass384_8683);
				class48_2.aClass303_460.scale(1.0F / (this.aClass505_Sub2_8917.aFloat8819 - this.aClass505_Sub2_8917.aFloat8813));
			} else {
				class48_2.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_2.aClass385_457.set(0.0F, 0.0F, 0.0F);
			}

			int i_4;
			int i_5;
			int i_6;
			if ((this.anInt8896 & 0x37) == 0) {
				this.aClass505_Sub2_8917.method13996(this.aClass505_Sub2_8917.aClass70_8721);
				if (this.aClass505_Sub2_8917.aBool8692) {
					this.aClass505_Sub2_8917.method13946(false);
				}

				for (int i_12 = 0; i_12 < this.anIntArray8952.length; i_12++) {
					i_4 = this.anIntArray8944[i_12];
					i_5 = this.anIntArray8944[i_12 + 1];
					i_6 = this.aShortArray8923[i_4] & 0xffff;
					boolean bool_17 = false;
					if (i_6 != 65535) {
						class48_2.anInterface6_452 = this.aClass505_Sub2_8917.aClass66_8787.method1283(i_6);
						Class169 class169_8 = this.aClass505_Sub2_8917.anInterface22_5834.method144(i_6, -1766452421);
						bool_17 = !Class282_Sub41.method13367(class169_8.aByte2064, (short) 22697);
						class48_2.aClass384_454.buf[12] = (float) (this.aClass505_Sub2_8917.anInt8820 % 128000) / 1000.0F * (float) class169_8.aByte2081 / 64.0F % 1.0F;
						class48_2.aClass384_454.buf[13] = (float) (this.aClass505_Sub2_8917.anInt8820 % 128000) / 1000.0F * (float) class169_8.aByte2090 / 64.0F % 1.0F;
					} else {
						class48_2.anInterface6_452 = this.aClass505_Sub2_8917.anInterface6_8788;
						float[] floats_18 = class48_2.aClass384_454.buf;
						class48_2.aClass384_454.buf[13] = 0.0F;
						floats_18[12] = 0.0F;
					}

					class48_2.anInt467 = this.anIntArray8952[i_12];
					class48_2.anInt468 = this.anIntArray8946[i_12];
					class48_2.anInt469 = i_4 * 3;
					class48_2.anInt470 = i_5 - i_4;
					class48_2.method946(bool_17);
				}
			} else {
				this.aClass505_Sub2_8917.method14161(3, this.aClass63_8929.anInterface4_661);
				this.aClass505_Sub2_8917.method13996(this.aClass505_Sub2_8917.aClass70_8836);
				Matrix44Var matrix44var_16 = this.aClass505_Sub2_8917.aClass294_8713;
				matrix44var_16.method5209(matrix44var_1);
				matrix44var_16.method5207();
				i_4 = 0;
				int i_15;
				if (this.aClass505_Sub2_8917.aBool8692) {
					this.aClass505_Sub2_8917.method13946(true);
				} else {
					class48_2.aClass385_466.set(this.aClass505_Sub2_8917.aFloatArray8747[0], this.aClass505_Sub2_8917.aFloatArray8747[1], this.aClass505_Sub2_8917.aFloatArray8747[2]);
					class48_2.aClass385_466.method6649(matrix44var_16);
					class48_2.aClass385_448.set(this.aClass505_Sub2_8917.aFloat8770 * this.aClass505_Sub2_8917.aFloat8766, this.aClass505_Sub2_8917.aFloat8770 * this.aClass505_Sub2_8917.aFloat8767, this.aClass505_Sub2_8917.aFloat8770 * this.aClass505_Sub2_8917.aFloat8768);
					class48_2.aClass385_464.set(-this.aClass505_Sub2_8917.aFloat8826 * this.aClass505_Sub2_8917.aFloat8766, -this.aClass505_Sub2_8917.aFloat8826 * this.aClass505_Sub2_8917.aFloat8767, -this.aClass505_Sub2_8917.aFloat8826 * this.aClass505_Sub2_8917.aFloat8768);
					class48_2.aClass385_461.set(this.aClass505_Sub2_8917.aFloat8769 * this.aClass505_Sub2_8917.aFloat8766, this.aClass505_Sub2_8917.aFloat8769 * this.aClass505_Sub2_8917.aFloat8767, this.aClass505_Sub2_8917.aFloat8769 * this.aClass505_Sub2_8917.aFloat8768);
					if (this.aClass505_Sub2_8917.anInt8831 > 0) {
						i_4 = this.aClass505_Sub2_8917.anInt8831;
						Vector3 vector3_13 = this.aClass505_Sub2_8917.aClass385_8707;

						for (i_6 = 0; i_6 < i_4; i_6++) {
							Class282_Sub24 class282_sub24_14 = this.aClass505_Sub2_8917.aClass282_Sub24Array8716[i_6];
							i_15 = class282_sub24_14.method12371(-2146580608);
							vector3_13.copy(class282_sub24_14.aClass385_7687);
							vector3_13.method6651(matrix44var_16);
							class48_2.aFloatArray463[i_6 * 4 + 0] = vector3_13.x;
							class48_2.aFloatArray463[i_6 * 4 + 1] = vector3_13.y;
							class48_2.aFloatArray463[i_6 * 4 + 2] = vector3_13.z;
							class48_2.aFloatArray463[i_6 * 4 + 3] = (float) (class282_sub24_14.method12370(-789603523) * class282_sub24_14.method12370(-789603523));
							float f_9 = class282_sub24_14.method12395(-208549702) / 255.0F;
							class48_2.aFloatArray450[i_6 * 4 + 0] = (float) (i_15 >> 16 & 0xff) * f_9;
							class48_2.aFloatArray450[i_6 * 4 + 1] = (float) (i_15 >> 8 & 0xff) * f_9;
							class48_2.aFloatArray450[i_6 * 4 + 2] = (float) (i_15 & 0xff) * f_9;
							class48_2.aFloatArray450[i_6 * 4 + 3] = 1.0F;
						}
					}
				}

				for (i_5 = 0; i_5 < this.anIntArray8952.length; i_5++) {
					i_6 = this.anIntArray8944[i_5];
					int i_7 = this.anIntArray8944[i_5 + 1];
					i_15 = this.aShortArray8923[i_6] & 0xffff;
					byte b_19 = 11;
					if (i_15 != 65535) {
						class48_2.anInterface6_452 = this.aClass505_Sub2_8917.aClass66_8787.method1283(i_15);
						Class169 class169_10 = this.aClass505_Sub2_8917.anInterface22_5834.method144(i_15, -2146030433);
						b_19 = class169_10.aByte2064;
						class48_2.method944(class169_10);
						class48_2.aClass384_454.buf[12] = (float) (this.aClass505_Sub2_8917.anInt8820 % 128000) / 1000.0F * (float) class169_10.aByte2081 / 64.0F % 1.0F;
						class48_2.aClass384_454.buf[13] = (float) (this.aClass505_Sub2_8917.anInt8820 % 128000) / 1000.0F * (float) class169_10.aByte2090 / 64.0F % 1.0F;
					} else {
						class48_2.anInterface6_452 = this.aClass505_Sub2_8917.anInterface6_8788;
						float[] floats_20 = class48_2.aClass384_454.buf;
						class48_2.aClass384_454.buf[13] = 0.0F;
						floats_20[12] = 0.0F;
					}

					class48_2.anInt467 = this.anIntArray8952[i_5];
					class48_2.anInt468 = this.anIntArray8946[i_5];
					class48_2.anInt469 = i_6 * 3;
					class48_2.anInt470 = i_7 - i_6;
					switch (b_19) {
					case 1:
						class48_2.aClass385_455.set(this.aClass505_Sub2_8917.aClass384_8814.buf[12], this.aClass505_Sub2_8917.aClass384_8814.buf[13], this.aClass505_Sub2_8917.aClass384_8814.buf[14]);
						class48_2.aClass385_455.method6651(matrix44var_16);
						class48_2.method948(i_4);
						break;
					case 2:
					case 3:
					case 4:
					default:
						class48_2.method965(i_4);
						break;
					case 5:
						if (!this.aClass505_Sub2_8917.aBool8692) {
							Class41_Sub1_Sub2 class41_sub1_sub2_21 = this.aClass505_Sub2_8917.aClass41_Sub1_Sub2_8798;
							Class169 class169_11 = this.aClass505_Sub2_8917.anInterface22_5834.method144(i_15, -1952578778);
							class41_sub1_sub2_21.method15550(class169_11.aByte2076, class169_11.anInt2077, 720267839);
							class41_sub1_sub2_21.aClass384_10146.fromVarMatrix44(matrix44var_1);
							class41_sub1_sub2_21.aClass384_10138.fromVarMatrix44(matrix44var_1);
							class41_sub1_sub2_21.aClass384_10138.method6523(this.aClass505_Sub2_8917.aClass384_8729);
							class41_sub1_sub2_21.anInt10152 = this.anIntArray8952[i_5];
							class41_sub1_sub2_21.anInt10153 = this.anIntArray8946[i_5];
							class41_sub1_sub2_21.anInt10142 = i_6 * 3;
							class41_sub1_sub2_21.anInt10155 = i_7 - i_6;
							class41_sub1_sub2_21.method15549((short) 27284);
						} else {
							class48_2.method965(i_4);
						}
						break;
					case 6:
						class48_2.method946(!Class282_Sub41.method13367(b_19, (short) 14784));
						break;
					case 7:
						class48_2.aClass385_455.set(this.aClass505_Sub2_8917.aClass384_8814.buf[12], this.aClass505_Sub2_8917.aClass384_8814.buf[13], this.aClass505_Sub2_8917.aClass384_8814.buf[14]);
						class48_2.aClass385_455.method6651(matrix44var_16);
						class48_2.aClass384_465.fromVarMatrix44(matrix44var_1);
						class48_2.anInterface31_451 = this.aClass505_Sub2_8917.method13965();
						class48_2.method949(i_4);
					}
				}
			}

			this.method14274();
		}

	}

	void method11275(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		int i_8 = ints_2.length;
		int i_9;
		int i_10;
		int i_11;
		int[] ints_12;
		int i_13;
		int i_14;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			i_9 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_10 = 0; i_10 < i_8; i_10++) {
				i_11 = ints_2[i_10];
				if (i_11 < this.anIntArrayArray8966.length) {
					ints_12 = this.anIntArrayArray8966[i_11];

					for (i_13 = 0; i_13 < ints_12.length; i_13++) {
						i_14 = ints_12[i_13];
						anInt8932 += this.anIntArray8901[i_14];
						anInt8939 += this.anIntArray8902[i_14];
						anInt8964 += this.anIntArray8931[i_14];
						++i_9;
					}
				}
			}

			if (i_9 > 0) {
				anInt8932 = anInt8932 / i_9 + i_3;
				anInt8939 = anInt8939 / i_9 + i_4;
				anInt8964 = anInt8964 / i_9 + i_5;
			} else {
				anInt8932 = i_3;
				anInt8939 = i_4;
				anInt8964 = i_5;
			}
		} else {
			int[] ints_21;
			int i_22;
			if (i_1 == 1) {
				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;

				for (i_9 = 0; i_9 < i_8; i_9++) {
					i_10 = ints_2[i_9];
					if (i_10 < this.anIntArrayArray8966.length) {
						ints_21 = this.anIntArrayArray8966[i_10];

						for (i_22 = 0; i_22 < ints_21.length; i_22++) {
							i_13 = ints_21[i_22];
							this.anIntArray8901[i_13] += i_3;
							this.anIntArray8902[i_13] += i_4;
							this.anIntArray8931[i_13] += i_5;
						}
					}
				}
			} else {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_1 == 2) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8966.length) {
							ints_21 = this.anIntArrayArray8966[i_10];
							if ((i_6 & 0x1) == 0) {
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									this.anIntArray8901[i_13] -= anInt8932;
									this.anIntArray8902[i_13] -= anInt8939;
									this.anIntArray8931[i_13] -= anInt8964;
									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = this.anIntArray8902[i_13] * i_14 + this.anIntArray8901[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8902[i_13] = this.anIntArray8902[i_13] * i_15 - this.anIntArray8901[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = this.anIntArray8902[i_13] * i_15 - this.anIntArray8931[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8931[i_13] = this.anIntArray8902[i_13] * i_14 + this.anIntArray8931[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8902[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = this.anIntArray8931[i_13] * i_14 + this.anIntArray8901[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8931[i_13] = this.anIntArray8931[i_13] * i_15 - this.anIntArray8901[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									this.anIntArray8901[i_13] += anInt8932;
									this.anIntArray8902[i_13] += anInt8939;
									this.anIntArray8931[i_13] += anInt8964;
								}
							} else {
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									this.anIntArray8901[i_13] -= anInt8932;
									this.anIntArray8902[i_13] -= anInt8939;
									this.anIntArray8931[i_13] -= anInt8964;
									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = this.anIntArray8902[i_13] * i_15 - this.anIntArray8931[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8931[i_13] = this.anIntArray8902[i_13] * i_14 + this.anIntArray8931[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8902[i_13] = i_16;
									}

									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = this.anIntArray8902[i_13] * i_14 + this.anIntArray8901[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8902[i_13] = this.anIntArray8902[i_13] * i_15 - this.anIntArray8901[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = this.anIntArray8931[i_13] * i_14 + this.anIntArray8901[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8931[i_13] = this.anIntArray8931[i_13] * i_15 - this.anIntArray8901[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8901[i_13] = i_16;
									}

									this.anIntArray8901[i_13] += anInt8932;
									this.anIntArray8902[i_13] += anInt8939;
									this.anIntArray8931[i_13] += anInt8964;
								}
							}
						}
					}

					if (bool_7) {
						for (i_9 = 0; i_9 < i_8; i_9++) {
							i_10 = ints_2[i_9];
							if (i_10 < this.anIntArrayArray8966.length) {
								ints_21 = this.anIntArrayArray8966[i_10];

								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									i_14 = this.anIntArray8947[i_13];
									i_15 = this.anIntArray8947[i_13 + 1];

									for (i_16 = i_14; i_16 < i_15; i_16++) {
										i_17 = this.aShortArray8948[i_16] - 1;
										if (i_17 == -1) {
											break;
										}

										int i_19;
										int i_20;
										if (i_5 != 0) {
											i_18 = Class382.anIntArray4657[i_5];
											i_19 = Class382.anIntArray4661[i_5];
											i_20 = this.aShortArray8933[i_17] * i_18 + this.aShortArray8909[i_17] * i_19 + 16383 >> 14;
											this.aShortArray8933[i_17] = (short) (this.aShortArray8933[i_17] * i_19 - this.aShortArray8909[i_17] * i_18 + 16383 >> 14);
											this.aShortArray8909[i_17] = (short) i_20;
										}

										if (i_3 != 0) {
											i_18 = Class382.anIntArray4657[i_3];
											i_19 = Class382.anIntArray4661[i_3];
											i_20 = this.aShortArray8933[i_17] * i_19 - this.aShortArray8911[i_17] * i_18 + 16383 >> 14;
											this.aShortArray8911[i_17] = (short) (this.aShortArray8933[i_17] * i_18 + this.aShortArray8911[i_17] * i_19 + 16383 >> 14);
											this.aShortArray8933[i_17] = (short) i_20;
										}

										if (i_4 != 0) {
											i_18 = Class382.anIntArray4657[i_4];
											i_19 = Class382.anIntArray4661[i_4];
											i_20 = this.aShortArray8911[i_17] * i_18 + this.aShortArray8909[i_17] * i_19 + 16383 >> 14;
											this.aShortArray8911[i_17] = (short) (this.aShortArray8911[i_17] * i_19 - this.aShortArray8909[i_17] * i_18 + 16383 >> 14);
											this.aShortArray8909[i_17] = (short) i_20;
										}
									}
								}
							}
						}

						this.method14285();
					}
				} else if (i_1 == 3) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8966.length) {
							ints_21 = this.anIntArrayArray8966[i_10];

							for (i_22 = 0; i_22 < ints_21.length; i_22++) {
								i_13 = ints_21[i_22];
								this.anIntArray8901[i_13] -= anInt8932;
								this.anIntArray8902[i_13] -= anInt8939;
								this.anIntArray8931[i_13] -= anInt8964;
								this.anIntArray8901[i_13] = this.anIntArray8901[i_13] * i_3 >> 7;
								this.anIntArray8902[i_13] = this.anIntArray8902[i_13] * i_4 >> 7;
								this.anIntArray8931[i_13] = this.anIntArray8931[i_13] * i_5 >> 7;
								this.anIntArray8901[i_13] += anInt8932;
								this.anIntArray8902[i_13] += anInt8939;
								this.anIntArray8931[i_13] += anInt8964;
							}
						}
					}
				} else {
					boolean bool_24;
					Class65 class65_25;
					Class56 class56_26;
					if (i_1 == 5) {
						if (this.anIntArrayArray8924 != null) {
							bool_24 = false;

							for (i_10 = 0; i_10 < i_8; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8924.length) {
									ints_12 = this.anIntArrayArray8924[i_11];

									for (i_13 = 0; i_13 < ints_12.length; i_13++) {
										i_14 = ints_12[i_13];
										i_15 = (this.aByteArray8900[i_14] & 0xff) + i_3 * 8;
										if (i_15 < 0) {
											i_15 = 0;
										} else if (i_15 > 255) {
											i_15 = 255;
										}

										this.aByteArray8900[i_14] = (byte) i_15;
									}

									bool_24 |= ints_12.length > 0;
								}
							}

							if (bool_24) {
								if (this.aClass56Array8934 != null) {
									for (i_10 = 0; i_10 < this.anInt8951; i_10++) {
										class56_26 = this.aClass56Array8934[i_10];
										class65_25 = this.aClass65Array8953[i_10];
										class65_25.anInt669 = class65_25.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_26.anInt518] & 0xff) << 24;
									}
								}

								this.method14269();
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8924 != null) {
							bool_24 = false;

							for (i_10 = 0; i_10 < i_8; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8924.length) {
									ints_12 = this.anIntArrayArray8924[i_11];

									for (i_13 = 0; i_13 < ints_12.length; i_13++) {
										i_14 = ints_12[i_13];
										i_15 = this.aShortArray8918[i_14] & 0xffff;
										i_16 = i_15 >> 10 & 0x3f;
										i_17 = i_15 >> 7 & 0x7;
										i_18 = i_15 & 0x7f;
										i_16 = i_16 + i_3 & 0x3f;
										i_17 += i_4 / 4;
										if (i_17 < 0) {
											i_17 = 0;
										} else if (i_17 > 7) {
											i_17 = 7;
										}

										i_18 += i_5;
										if (i_18 < 0) {
											i_18 = 0;
										} else if (i_18 > 127) {
											i_18 = 127;
										}

										this.aShortArray8918[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
									}

									bool_24 |= ints_12.length > 0;
								}
							}

							if (bool_24) {
								if (this.aClass56Array8934 != null) {
									for (i_10 = 0; i_10 < this.anInt8951; i_10++) {
										class56_26 = this.aClass56Array8934[i_10];
										class65_25 = this.aClass65Array8953[i_10];
										class65_25.anInt669 = class65_25.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_26.anInt518] & 0xffff] & 0xffffff;
									}
								}

								this.method14269();
							}
						}
					} else {
						Class65 class65_23;
						if (i_1 == 8) {
							if (this.anIntArrayArray8954 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8954.length) {
										ints_21 = this.anIntArrayArray8954[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class65_23 = this.aClass65Array8953[ints_21[i_22]];
											class65_23.anInt668 += i_3;
											class65_23.anInt672 += i_4;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8954 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8954.length) {
										ints_21 = this.anIntArrayArray8954[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class65_23 = this.aClass65Array8953[ints_21[i_22]];
											class65_23.anInt671 = class65_23.anInt671 * i_3 >> 7;
											class65_23.anInt670 = class65_23.anInt670 * i_4 >> 7;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8954 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8954.length) {
									ints_21 = this.anIntArrayArray8954[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										class65_23 = this.aClass65Array8953[ints_21[i_22]];
										class65_23.anInt673 = class65_23.anInt673 + i_3 & 0x3fff;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	boolean ea() {
		if (this.anIntArrayArray8966 == null) {
			return false;
		} else {
			for (int i_1 = 0; i_1 < this.anInt8899; i_1++) {
				this.anIntArray8901[i_1] <<= 4;
				this.anIntArray8902[i_1] <<= 4;
				this.anIntArray8931[i_1] <<= 4;
			}

			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			return true;
		}
	}

	boolean method14279() {
		boolean bool_1 = !this.aClass63_8913.aBool662;
		boolean bool_2 = (this.anInt8896 & 0x37) != 0 && !this.aClass63_8929.aBool662;
		boolean bool_3 = !this.aClass63_8927.aBool662;
		boolean bool_4 = !this.aClass63_8930.aBool662;
		if (!bool_3 && !bool_1 && !bool_2 && !bool_4) {
			return true;
		} else {
			boolean bool_5 = true;
			Interface4 interface4_6;
			Unsafe unsafe_7;
			int i_8;
			long long_9;
			int i_11;
			ByteBuffer bytebuffer_29;
			short s_32;
			int i_36;
			if (bool_3 && this.aShortArray8907 != null) {
				if (this.aClass63_8927.anInterface4_664 == null) {
					this.aClass63_8927.anInterface4_664 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
				}

				interface4_6 = this.aClass63_8927.anInterface4_664;
				interface4_6.method31(this.anInt8906 * 12, 12);
				unsafe_7 = this.aClass505_Sub2_8917.anUnsafe8830;
				if (unsafe_7 != null) {
					i_8 = this.anInt8906 * 12;
					long_9 = interface4_6.method40(0, i_8);

					for (i_11 = 0; i_11 < this.anInt8906; i_11++) {
						s_32 = this.aShortArray8907[i_11];
						unsafe_7.putFloat(long_9, (float) this.anIntArray8901[s_32]);
						long_9 += 4L;
						unsafe_7.putFloat(long_9, (float) this.anIntArray8902[s_32]);
						long_9 += 4L;
						unsafe_7.putFloat(long_9, (float) this.anIntArray8931[s_32]);
						long_9 += 4L;
					}

					interface4_6.method38();
				} else {
					bytebuffer_29 = this.aClass505_Sub2_8917.aByteBuffer8838;
					bytebuffer_29.clear();

					for (i_36 = 0; i_36 < this.anInt8906; i_36++) {
						bytebuffer_29.putFloat((float) this.anIntArray8901[this.aShortArray8907[i_36]]);
						bytebuffer_29.putFloat((float) this.anIntArray8902[this.aShortArray8907[i_36]]);
						bytebuffer_29.putFloat((float) this.anIntArray8931[this.aShortArray8907[i_36]]);
					}

					interface4_6.method42(0, bytebuffer_29.position(), this.aClass505_Sub2_8917.aLong8695);
				}

				this.aClass63_8927.anInterface4_661 = interface4_6;
				this.aClass63_8927.aBool662 = true;
			}

			int i_15;
			int i_17;
			float f_18;
			float f_19;
			float f_20;
			short[] shorts_30;
			float f_46;
			float f_50;
			if (bool_1) {
				if (this.aClass63_8913.anInterface4_664 == null) {
					this.aClass63_8913.anInterface4_664 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
				}

				interface4_6 = this.aClass63_8913.anInterface4_664;
				interface4_6.method31(this.anInt8906 * 4, 4);
				unsafe_7 = this.aClass505_Sub2_8917.anUnsafe8830;
				float f_22;
				int i_26;
				short[] shorts_31;
				if (unsafe_7 != null) {
					i_8 = this.anInt8906 * 4;
					long_9 = interface4_6.method40(0, i_8);
					if ((this.anInt8896 & 0x37) == 0) {
						short[] shorts_13;
						byte[] bytes_14;
						short[] shorts_42;
						if (this.aClass355_8962 != null) {
							shorts_31 = this.aClass355_8962.aShortArray4115;
							shorts_42 = this.aClass355_8962.aShortArray4114;
							shorts_13 = this.aClass355_8962.aShortArray4113;
							bytes_14 = this.aClass355_8962.aByteArray4116;
						} else {
							shorts_31 = this.aShortArray8909;
							shorts_42 = this.aShortArray8933;
							shorts_13 = this.aShortArray8911;
							bytes_14 = this.aByteArray8912;
						}

						float f_45 = this.aClass505_Sub2_8917.aFloat8770 * 768.0F / (float) this.aShort8898;
						f_46 = this.aClass505_Sub2_8917.aFloat8826 * 768.0F / (float) this.aShort8898;

						for (i_17 = 0; i_17 < this.anInt8906; i_17++) {
							short s_48 = this.aShortArray8945[i_17];
							int i_49 = this.method14282(this.aShortArray8918[s_48] & 0xffff, this.aShortArray8923[s_48], this.aShort8897);
							f_20 = (float) (i_49 >> 16 & 0xff) * this.aClass505_Sub2_8917.aFloat8766;
							f_50 = (float) (i_49 >> 8 & 0xff) * this.aClass505_Sub2_8917.aFloat8767;
							f_22 = (float) (i_49 & 0xff) * this.aClass505_Sub2_8917.aFloat8768;
							byte b_51 = bytes_14[i_17];
							float f_52;
							if (b_51 == 0) {
								f_52 = (this.aClass505_Sub2_8917.aFloatArray8747[0] * (float) shorts_31[i_17] + this.aClass505_Sub2_8917.aFloatArray8747[1] * (float) shorts_42[i_17] + this.aClass505_Sub2_8917.aFloatArray8747[2] * (float) shorts_13[i_17]) * 0.0026041667F;
							} else {
								f_52 = (this.aClass505_Sub2_8917.aFloatArray8747[0] * (float) shorts_31[i_17] + this.aClass505_Sub2_8917.aFloatArray8747[1] * (float) shorts_42[i_17] + this.aClass505_Sub2_8917.aFloatArray8747[2] * (float) shorts_13[i_17]) / ((float) b_51 * 256.0F);
							}

							float f_53 = this.aClass505_Sub2_8917.aFloat8769 + f_52 * (f_52 < 0.0F ? f_46 : f_45);
							i_26 = (int) (f_20 * f_53);
							if (i_26 < 0) {
								i_26 = 0;
							} else if (i_26 > 255) {
								i_26 = 255;
							}

							int i_27 = (int) (f_50 * f_53);
							if (i_27 < 0) {
								i_27 = 0;
							} else if (i_27 > 255) {
								i_27 = 255;
							}

							int i_28 = (int) (f_22 * f_53);
							if (i_28 < 0) {
								i_28 = 0;
							} else if (i_28 > 255) {
								i_28 = 255;
							}

							unsafe_7.putInt(long_9, 255 - this.aByteArray8900[s_48] << 24 | i_26 << 16 | i_27 << 8 | i_28);
							long_9 += 4L;
						}
					} else {
						for (i_11 = 0; i_11 < this.anInt8906; i_11++) {
							s_32 = this.aShortArray8945[i_11];
							int i_57 = 255 - this.aByteArray8900[s_32] << 24 | this.method14282(this.aShortArray8918[s_32] & 0xffff, this.aShortArray8923[s_32], this.aShort8897);
							unsafe_7.putInt(long_9, i_57);
							long_9 += 4L;
						}
					}

					interface4_6.method38();
				} else {
					bytebuffer_29 = this.aClass505_Sub2_8917.aByteBuffer8838;
					bytebuffer_29.clear();
					if ((this.anInt8896 & 0x37) == 0) {
						short[] shorts_10;
						byte[] bytes_12;
						if (this.aClass355_8962 != null) {
							shorts_30 = this.aClass355_8962.aShortArray4115;
							shorts_10 = this.aClass355_8962.aShortArray4114;
							shorts_31 = this.aClass355_8962.aShortArray4113;
							bytes_12 = this.aClass355_8962.aByteArray4116;
						} else {
							shorts_30 = this.aShortArray8909;
							shorts_10 = this.aShortArray8933;
							shorts_31 = this.aShortArray8911;
							bytes_12 = this.aByteArray8912;
						}

						float f_37 = this.aClass505_Sub2_8917.aFloat8770 * 768.0F / (float) this.aShort8898;
						float f_33 = this.aClass505_Sub2_8917.aFloat8826 * 768.0F / (float) this.aShort8898;

						for (i_15 = 0; i_15 < this.anInt8906; i_15++) {
							short s_16 = this.aShortArray8945[i_15];
							i_17 = this.method14282(this.aShortArray8918[s_16] & 0xffff, this.aShortArray8923[s_16], this.aShort8897);
							f_18 = (float) (i_17 >> 16 & 0xff) * this.aClass505_Sub2_8917.aFloat8766;
							f_19 = (float) (i_17 >> 8 & 0xff) * this.aClass505_Sub2_8917.aFloat8767;
							f_20 = (float) (i_17 & 0xff) * this.aClass505_Sub2_8917.aFloat8768;
							byte b_21 = bytes_12[i_15];
							if (b_21 == 0) {
								f_22 = (this.aClass505_Sub2_8917.aFloatArray8747[0] * (float) shorts_30[i_15] + this.aClass505_Sub2_8917.aFloatArray8747[1] * (float) shorts_10[i_15] + this.aClass505_Sub2_8917.aFloatArray8747[2] * (float) shorts_31[i_15]) * 0.0026041667F;
							} else {
								f_22 = (this.aClass505_Sub2_8917.aFloatArray8747[0] * (float) shorts_30[i_15] + this.aClass505_Sub2_8917.aFloatArray8747[1] * (float) shorts_10[i_15] + this.aClass505_Sub2_8917.aFloatArray8747[2] * (float) shorts_31[i_15]) / ((float) b_21 * 256.0F);
							}

							float f_23 = this.aClass505_Sub2_8917.aFloat8769 + f_22 * (f_22 < 0.0F ? f_33 : f_37);
							int i_24 = (int) (f_18 * f_23);
							if (i_24 < 0) {
								i_24 = 0;
							} else if (i_24 > 255) {
								i_24 = 255;
							}

							int i_25 = (int) (f_19 * f_23);
							if (i_25 < 0) {
								i_25 = 0;
							} else if (i_25 > 255) {
								i_25 = 255;
							}

							i_26 = (int) (f_20 * f_23);
							if (i_26 < 0) {
								i_26 = 0;
							} else if (i_26 > 255) {
								i_26 = 255;
							}

							bytebuffer_29.putInt(255 - this.aByteArray8900[s_16] << 24 | i_24 << 16 | i_25 << 8 | i_26);
						}
					} else {
						for (i_36 = 0; i_36 < this.anInt8906; i_36++) {
							short s_38 = this.aShortArray8945[i_36];
							i_11 = 255 - this.aByteArray8900[s_38] << 24 | this.method14282(this.aShortArray8918[s_38] & 0xffff, this.aShortArray8923[s_38], this.aShort8897);
							bytebuffer_29.putInt(i_11);
						}
					}

					interface4_6.method42(0, bytebuffer_29.position(), this.aClass505_Sub2_8917.aLong8695);
				}

				this.aClass63_8913.anInterface4_661 = interface4_6;
				this.aClass63_8913.aBool662 = true;
			}

			if (bool_2) {
				if (this.aClass63_8929.anInterface4_664 == null) {
					this.aClass63_8929.anInterface4_664 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
				}

				interface4_6 = this.aClass63_8929.anInterface4_664;
				interface4_6.method31(this.anInt8906 * 12, 12);
				short[] shorts_39;
				byte[] bytes_40;
				short[] shorts_54;
				if (this.aClass355_8962 != null) {
					shorts_39 = this.aClass355_8962.aShortArray4115;
					shorts_54 = this.aClass355_8962.aShortArray4114;
					shorts_30 = this.aClass355_8962.aShortArray4113;
					bytes_40 = this.aClass355_8962.aByteArray4116;
				} else {
					shorts_39 = this.aShortArray8909;
					shorts_54 = this.aShortArray8933;
					shorts_30 = this.aShortArray8911;
					bytes_40 = this.aByteArray8912;
				}

				float f_41 = 3.0F / (float) this.aShort8898;
				float f_55 = 3.0F / (float) (this.aShort8898 / 2 + this.aShort8898);
				Unsafe unsafe_43 = this.aClass505_Sub2_8917.anUnsafe8830;
				if (unsafe_43 != null) {
					int i_56 = this.anInt8906 * 12;
					long long_34 = interface4_6.method40(0, i_56);

					for (i_17 = 0; i_17 < this.anInt8906; i_17++) {
						f_18 = bytes_40[i_17] == 0 ? f_55 : f_41 / (float) bytes_40[i_17];
						f_19 = (float) shorts_39[i_17] * f_18;
						f_20 = (float) shorts_54[i_17] * f_18;
						f_50 = (float) shorts_30[i_17] * f_18;
						unsafe_43.putFloat(long_34, f_19);
						long_34 += 4L;
						unsafe_43.putFloat(long_34, f_20);
						long_34 += 4L;
						unsafe_43.putFloat(long_34, f_50);
						long_34 += 4L;
					}

					interface4_6.method38();
				} else {
					ByteBuffer bytebuffer_44 = this.aClass505_Sub2_8917.aByteBuffer8838;
					bytebuffer_44.clear();

					for (i_15 = 0; i_15 < this.anInt8906; i_15++) {
						f_46 = bytes_40[i_15] == 0 ? f_55 : f_41 / (float) bytes_40[i_15];
						float f_47 = (float) shorts_39[i_15] * f_46;
						f_18 = (float) shorts_54[i_15] * f_46;
						f_19 = (float) shorts_30[i_15] * f_46;
						bytebuffer_44.putFloat(f_47);
						bytebuffer_44.putFloat(f_18);
						bytebuffer_44.putFloat(f_19);
					}

					interface4_6.method42(0, bytebuffer_44.position(), this.aClass505_Sub2_8917.aLong8695);
				}

				this.aClass63_8929.anInterface4_661 = interface4_6;
				this.aClass63_8929.aBool662 = true;
			}

			if (bool_4) {
				if (this.aClass63_8930.anInterface4_664 == null) {
					this.aClass63_8930.anInterface4_664 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
				}

				interface4_6 = this.aClass63_8930.anInterface4_664;
				interface4_6.method31(this.anInt8906 * 8, 8);
				unsafe_7 = this.aClass505_Sub2_8917.anUnsafe8830;
				if (unsafe_7 != null) {
					i_8 = this.anInt8906 * 8;
					long_9 = interface4_6.method40(0, i_8);

					for (i_11 = 0; i_11 < this.anInt8906; i_11++) {
						unsafe_7.putFloat(long_9, this.aFloatArray8892[i_11]);
						long_9 += 4L;
						unsafe_7.putFloat(long_9, this.aFloatArray8914[i_11]);
						long_9 += 4L;
					}

					interface4_6.method38();
				} else {
					bytebuffer_29 = this.aClass505_Sub2_8917.aByteBuffer8838;
					bytebuffer_29.clear();

					for (i_36 = 0; i_36 < this.anInt8906; i_36++) {
						bytebuffer_29.putFloat(this.aFloatArray8892[i_36]);
						bytebuffer_29.putFloat(this.aFloatArray8914[i_36]);
					}

					interface4_6.method42(0, bytebuffer_29.position(), this.aClass505_Sub2_8917.aLong8695);
				}

				this.aClass63_8930.anInterface4_661 = interface4_6;
				this.aClass63_8930.aBool662 = true;
			}

			return bool_5;
		}
	}

	void method14280() {
		if (this.aClass63_8927 != null) {
			this.aClass63_8927.method1266();
		}

		if (this.aClass63_8930 != null) {
			this.aClass63_8930.method1266();
		}

		if (this.aClass63_8913 != null) {
			this.aClass63_8913.method1266();
		}

		if (this.aClass63_8929 != null) {
			this.aClass63_8929.method1266();
		}

		if (this.aClass39_8926 != null) {
			this.aClass39_8926.method863();
		}

	}

	void method14281() {
		int i_1 = 32767;
		int i_2 = 32767;
		int i_3 = 32767;
		int i_4 = -32768;
		int i_5 = -32768;
		int i_6 = -32768;
		int i_7 = 0;
		int i_8 = 0;

		for (int i_9 = 0; i_9 < this.anInt8910; i_9++) {
			int i_10 = this.anIntArray8901[i_9];
			int i_11 = this.anIntArray8902[i_9];
			int i_12 = this.anIntArray8931[i_9];
			if (i_10 < i_1) {
				i_1 = i_10;
			}

			if (i_10 > i_4) {
				i_4 = i_10;
			}

			if (i_11 < i_2) {
				i_2 = i_11;
			}

			if (i_11 > i_5) {
				i_5 = i_11;
			}

			if (i_12 < i_3) {
				i_3 = i_12;
			}

			if (i_12 > i_6) {
				i_6 = i_12;
			}

			int i_13 = i_10 * i_10 + i_12 * i_12;
			if (i_13 > i_7) {
				i_7 = i_13;
			}

			i_13 = i_10 * i_10 + i_12 * i_12 + i_11 * i_11;
			if (i_13 > i_8) {
				i_8 = i_13;
			}
		}

		this.anInt8940 = i_1;
		this.anInt8941 = i_4;
		this.anInt8908 = i_2;
		this.anInt8893 = i_5;
		this.anInt8942 = i_3;
		this.anInt8943 = i_6;
		this.anInt8936 = (int) (Math.sqrt((double) i_7) + 0.99D);
		this.anInt8957 = (int) (Math.sqrt((double) i_8) + 0.99D);
		this.aBool8937 = true;
	}

	int method14282(int i_1, short s_2, int i_3) {
		int i_4 = this.aClass505_Sub2_8917.anIntArray8803[this.method14290(i_1, i_3)];
		if (s_2 != -1) {
			Class169 class169_5 = this.aClass505_Sub2_8917.anInterface22_5834.method144(s_2 & 0xffff, -2097753568);
			int i_6 = class169_5.aByte2079 & 0xff;
			int i_7;
			int i_9;
			if (i_6 != 0) {
				i_7 = i_3 * 131586;
				if (i_6 == 256) {
					i_4 = i_7;
				} else {
					i_9 = 256 - i_6;
					i_4 = ((i_7 & 0xff00ff) * i_6 + (i_4 & 0xff00ff) * i_9 & ~0xff00ff) + (i_6 * (i_7 & 0xff00) + i_9 * (i_4 & 0xff00) & 0xff0000) >> 8;
				}
			}

			i_7 = class169_5.aByte2080 & 0xff;
			if (i_7 != 0) {
				i_7 += 256;
				int i_8 = i_7 * ((i_4 & 0xff0000) >> 16);
				if (i_8 > 65535) {
					i_8 = 65535;
				}

				i_9 = i_7 * ((i_4 & 0xff00) >> 8);
				if (i_9 > 65535) {
					i_9 = 65535;
				}

				int i_10 = (i_4 & 0xff) * i_7;
				if (i_10 > 65535) {
					i_10 = 65535;
				}

				i_4 = (i_10 >> 8) + (i_9 & 0xff00) + (i_8 << 8 & 0xff0000);
			}
		}

		return i_4 & 0xffffff;
	}

	public void bn(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8902[i_4] * i_3 - this.anIntArray8931[i_4] * i_2 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8902[i_4] * i_2 + this.anIntArray8931[i_4] * i_3 >> 14;
			this.anIntArray8902[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public MeshRasterizer method11276(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		Class528_Sub3 class528_sub3_5;
		Class528_Sub3 class528_sub3_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub3_6 = this.aClass505_Sub2_8917.aClass528_Sub3Array8840[b_1 - 1];
			class528_sub3_5 = this.aClass505_Sub2_8917.aClass528_Sub3Array8839[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub3_5 = class528_sub3_6 = new Class528_Sub3(this.aClass505_Sub2_8917, 0, 0, true, false);
		}

		return this.method14267(class528_sub3_5, class528_sub3_6, i_2, bool_4, bool_3);
	}

	public void pa(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
		if (!this.aBool8937) {
			this.method14281();
		}

		int i_8 = i_5 + this.anInt8940;
		int i_9 = i_5 + this.anInt8941;
		int i_10 = i_7 + this.anInt8942;
		int i_11 = i_7 + this.anInt8943;
		if (i_1 != 1 && i_1 != 2 && i_1 != 3 && i_1 != 5 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
			if (i_1 != 4 && i_1 != 5) {
				i_8 >>= class390_3.tileScale;
				i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				i_10 >>= class390_3.tileScale;
				i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				if (class390_3.method6722(i_8, i_10, 65280) == i_6 && class390_3.method6722(i_9, i_10, 65280) == i_6 && class390_3.method6722(i_8, i_11, 65280) == i_6 && class390_3.method6722(i_9, i_11, 65280) == i_6) {
					return;
				}
			} else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length) {
				return;
			}

			int i_12;
			if (i_1 == 1) {
				for (i_12 = 0; i_12 < this.anInt8910; i_12++) {
					this.anIntArray8902[i_12] = this.anIntArray8902[i_12] + class390_3.averageHeight(this.anIntArray8901[i_12] + i_5, this.anIntArray8931[i_12] + i_7, 1770743243) - i_6;
				}
			} else {
				int i_13;
				int i_14;
				if (i_1 == 2) {
					i_12 = this.anInt8908;
					if (i_12 == 0) {
						return;
					}

					for (i_13 = 0; i_13 < this.anInt8910; i_13++) {
						i_14 = (this.anIntArray8902[i_13] << 16) / i_12;
						if (i_14 < i_2) {
							this.anIntArray8902[i_13] += (class390_3.averageHeight(this.anIntArray8901[i_13] + i_5, this.anIntArray8931[i_13] + i_7, -1194531979) - i_6) * (i_2 - i_14) / i_2;
						}
					}
				} else {
					int i_15;
					if (i_1 == 3) {
						i_12 = (i_2 & 0xff) * 4;
						i_13 = (i_2 >> 8 & 0xff) * 4;
						i_14 = (i_2 >> 16 & 0xff) << 6;
						i_15 = (i_2 >> 24 & 0xff) << 6;
						if (i_5 - (i_12 >> 1) < 0 || i_5 + class390_3.tileUnits + (i_12 >> 1) >= class390_3.width << class390_3.tileScale || i_7 - (i_13 >> 1) < 0 || class390_3.tileUnits + (i_13 >> 1) + i_7 >= class390_3.length << class390_3.tileScale) {
							return;
						}

						this.method11281(class390_3, i_5, i_6, i_7, i_12, i_13, i_14, i_15);
					} else if (i_1 == 4) {
						i_12 = this.anInt8893 - this.anInt8908;

						for (i_13 = 0; i_13 < this.anInt8910; i_13++) {
							this.anIntArray8902[i_13] = this.anIntArray8902[i_13] + (class390_4.averageHeight(this.anIntArray8901[i_13] + i_5, this.anIntArray8931[i_13] + i_7, 1587611464) - i_6) + i_12;
						}
					} else if (i_1 == 5) {
						i_12 = this.anInt8893 - this.anInt8908;

						for (i_13 = 0; i_13 < this.anInt8910; i_13++) {
							i_14 = i_5 + this.anIntArray8901[i_13];
							i_15 = i_7 + this.anIntArray8931[i_13];
							int i_16 = class390_3.averageHeight(i_14, i_15, -2069259244);
							int i_17 = class390_4.averageHeight(i_14, i_15, -1440102393);
							int i_18 = i_16 - i_17 - i_2;
							this.anIntArray8902[i_13] = (i_18 * ((this.anIntArray8902[i_13] << 8) / i_12) >> 8) - (i_6 - i_16);
						}
					}
				}
			}

			this.method14268();
			this.aBool8937 = false;
		}

	}

	void method11285() {
	}

	public MeshRasterizer method11279(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		Class528_Sub3 class528_sub3_5;
		Class528_Sub3 class528_sub3_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub3_6 = this.aClass505_Sub2_8917.aClass528_Sub3Array8840[b_1 - 1];
			class528_sub3_5 = this.aClass505_Sub2_8917.aClass528_Sub3Array8839[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub3_5 = class528_sub3_6 = new Class528_Sub3(this.aClass505_Sub2_8917, 0, 0, true, false);
		}

		return this.method14267(class528_sub3_5, class528_sub3_6, i_2, bool_4, bool_3);
	}

	public MeshRasterizer method11296(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		Class528_Sub3 class528_sub3_5;
		Class528_Sub3 class528_sub3_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub3_6 = this.aClass505_Sub2_8917.aClass528_Sub3Array8840[b_1 - 1];
			class528_sub3_5 = this.aClass505_Sub2_8917.aClass528_Sub3Array8839[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub3_5 = class528_sub3_6 = new Class528_Sub3(this.aClass505_Sub2_8917, 0, 0, true, false);
		}

		return this.method14267(class528_sub3_5, class528_sub3_6, i_2, bool_4, bool_3);
	}

	public int ae() {
		return this.anInt8895;
	}

	void ka() {
		for (int i_1 = 0; i_1 < this.anInt8899; i_1++) {
			this.anIntArray8901[i_1] = this.anIntArray8901[i_1] + 7 >> 4;
			this.anIntArray8902[i_1] = this.anIntArray8902[i_1] + 7 >> 4;
			this.anIntArray8931[i_1] = this.anIntArray8931[i_1] + 7 >> 4;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	void method14285() {
		if ((this.anInt8896 & 0x37) != 0) {
			if (this.aClass63_8929 != null) {
				this.aClass63_8929.aBool662 = false;
			}
		} else if (this.aClass63_8913 != null) {
			this.aClass63_8913.aBool662 = false;
		}

	}

	public void bi(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8931[i_4] * i_2 + this.anIntArray8901[i_4] * i_3 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8931[i_4] * i_3 - this.anIntArray8901[i_4] * i_2 >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void bw(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8931[i_4] * i_2 + this.anIntArray8901[i_4] * i_3 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8931[i_4] * i_3 - this.anIntArray8901[i_4] * i_2 >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public int n() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8957;
	}

	public void KA(int i_1) {
		if (this.aClass63_8927 != null) {
			this.aClass63_8927.aBool663 = Class50.method995(i_1, this.anInt8896);
		}

		if (this.aClass63_8930 != null) {
			this.aClass63_8930.aBool663 = Class50.method1056(i_1, this.anInt8896);
		}

		if (this.aClass63_8913 != null) {
			this.aClass63_8913.aBool663 = Class50.method1051(i_1, this.anInt8896);
		}

		if (this.aClass63_8929 != null) {
			this.aClass63_8929.aBool663 = Class50.method1020(i_1, this.anInt8896);
		}

		this.anInt8895 = i_1;
		if (this.aClass355_8962 != null && (this.anInt8895 & 0x10000) == 0) {
			this.aShortArray8909 = this.aClass355_8962.aShortArray4115;
			this.aShortArray8933 = this.aClass355_8962.aShortArray4114;
			this.aShortArray8911 = this.aClass355_8962.aShortArray4113;
			this.aByteArray8912 = this.aClass355_8962.aByteArray4116;
			this.aClass355_8962 = null;
		}

		this.aBool8919 = true;
		this.method14274();
	}

	public void dl(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8902[i_4] * i_2 + this.anIntArray8901[i_4] * i_3 >> 14;
			this.anIntArray8902[i_4] = this.anIntArray8902[i_4] * i_3 - this.anIntArray8901[i_4] * i_2 >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void bm(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8902[i_4] * i_3 - this.anIntArray8931[i_4] * i_2 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8902[i_4] * i_2 + this.anIntArray8931[i_4] * i_3 >> 14;
			this.anIntArray8902[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void bs(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8902[i_4] * i_3 - this.anIntArray8931[i_4] * i_2 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8902[i_4] * i_2 + this.anIntArray8931[i_4] * i_3 >> 14;
			this.anIntArray8902[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void bk(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8902[i_4] * i_3 - this.anIntArray8931[i_4] * i_2 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8902[i_4] * i_2 + this.anIntArray8931[i_4] * i_3 >> 14;
			this.anIntArray8902[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void bf(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			int i_5 = this.anIntArray8902[i_4] * i_3 - this.anIntArray8931[i_4] * i_2 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8902[i_4] * i_2 + this.anIntArray8931[i_4] * i_3 >> 14;
			this.anIntArray8902[i_4] = i_5;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public Class87[] method11300() {
		return this.aClass87Array8949;
	}

	public void ce(int i_1) {
		this.aShort8897 = (short) i_1;
		this.method14269();
	}

	public void by() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8910; i_1++) {
			this.anIntArray8931[i_1] = -this.anIntArray8931[i_1];
		}

		for (i_1 = 0; i_1 < this.anInt8906; i_1++) {
			this.aShortArray8911[i_1] = (short) (-this.aShortArray8911[i_1]);
		}

		for (i_1 = 0; i_1 < this.anInt8916 * 3 * -1431655765; i_1++) {
			short s_2 = this.aShortArray8920[i_1];
			this.aShortArray8920[i_1] = this.aShortArray8922[i_1];
			this.aShortArray8922[i_1] = s_2;
		}

		this.method14268();
		this.method14285();
		this.method14270();
		this.aBool8937 = false;
	}

	public void bq() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8910; i_1++) {
			this.anIntArray8931[i_1] = -this.anIntArray8931[i_1];
		}

		for (i_1 = 0; i_1 < this.anInt8906; i_1++) {
			this.aShortArray8911[i_1] = (short) (-this.aShortArray8911[i_1]);
		}

		for (i_1 = 0; i_1 < this.anInt8916 * 3 * -1431655765; i_1++) {
			short s_2 = this.aShortArray8920[i_1];
			this.aShortArray8920[i_1] = this.aShortArray8922[i_1];
			this.aShortArray8922[i_1] = s_2;
		}

		this.method14268();
		this.method14285();
		this.method14270();
		this.aBool8937 = false;
	}

	public void bc(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
		if (!this.aBool8937) {
			this.method14281();
		}

		int i_8 = i_5 + this.anInt8940;
		int i_9 = i_5 + this.anInt8941;
		int i_10 = i_7 + this.anInt8942;
		int i_11 = i_7 + this.anInt8943;
		if (i_1 != 1 && i_1 != 2 && i_1 != 3 && i_1 != 5 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
			if (i_1 != 4 && i_1 != 5) {
				i_8 >>= class390_3.tileScale ;
				i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				i_10 >>= class390_3.tileScale;
				i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				if (class390_3.method6722(i_8, i_10, 65280) == i_6 && class390_3.method6722(i_9, i_10, 65280) == i_6 && class390_3.method6722(i_8, i_11, 65280) == i_6 && class390_3.method6722(i_9, i_11, 65280) == i_6) {
					return;
				}
			} else if (class390_4 == null || i_8 < 0 || i_9 + class390_4.tileUnits >> class390_4.tileScale >= class390_4.width || i_10 < 0 || i_11 + class390_4.tileUnits >> class390_4.tileScale >= class390_4.length) {
				return;
			}

			int i_12;
			if (i_1 == 1) {
				for (i_12 = 0; i_12 < this.anInt8910; i_12++) {
					this.anIntArray8902[i_12] = this.anIntArray8902[i_12] + class390_3.averageHeight(this.anIntArray8901[i_12] + i_5, this.anIntArray8931[i_12] + i_7, 344103840) - i_6;
				}
			} else {
				int i_13;
				int i_14;
				if (i_1 == 2) {
					i_12 = this.anInt8908;
					if (i_12 == 0) {
						return;
					}

					for (i_13 = 0; i_13 < this.anInt8910; i_13++) {
						i_14 = (this.anIntArray8902[i_13] << 16) / i_12;
						if (i_14 < i_2) {
							this.anIntArray8902[i_13] += (class390_3.averageHeight(this.anIntArray8901[i_13] + i_5, this.anIntArray8931[i_13] + i_7, -904937996) - i_6) * (i_2 - i_14) / i_2;
						}
					}
				} else {
					int i_15;
					if (i_1 == 3) {
						i_12 = (i_2 & 0xff) * 4;
						i_13 = (i_2 >> 8 & 0xff) * 4;
						i_14 = (i_2 >> 16 & 0xff) << 6;
						i_15 = (i_2 >> 24 & 0xff) << 6;
						if (i_5 - (i_12 >> 1) < 0 || i_5 + (i_12 >> 1) + class390_3.tileUnits >= class390_3.width << class390_3.tileScale || i_7 - (i_13 >> 1) < 0 || i_7 + (i_13 >> 1) + class390_3.tileUnits >= class390_3.length << class390_3.tileScale) {
							return;
						}

						this.method11281(class390_3, i_5, i_6, i_7, i_12, i_13, i_14, i_15);
					} else if (i_1 == 4) {
						i_12 = this.anInt8893 - this.anInt8908;

						for (i_13 = 0; i_13 < this.anInt8910; i_13++) {
							this.anIntArray8902[i_13] = this.anIntArray8902[i_13] + (class390_4.averageHeight(this.anIntArray8901[i_13] + i_5, this.anIntArray8931[i_13] + i_7, -1827398874) - i_6) + i_12;
						}
					} else if (i_1 == 5) {
						i_12 = this.anInt8893 - this.anInt8908;

						for (i_13 = 0; i_13 < this.anInt8910; i_13++) {
							i_14 = this.anIntArray8901[i_13] + i_5;
							i_15 = this.anIntArray8931[i_13] + i_7;
							int i_16 = class390_3.averageHeight(i_14, i_15, 114216817);
							int i_17 = class390_4.averageHeight(i_14, i_15, 1659725231);
							int i_18 = i_16 - i_17 - i_2;
							this.anIntArray8902[i_13] = ((this.anIntArray8902[i_13] << 8) / i_12 * i_18 >> 8) - (i_6 - i_16);
						}
					}
				}
			}

			this.method14268();
			this.aBool8937 = false;
		}

	}

	public int o() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8893;
	}

	void bl(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
		int i_9 = ints_2.length;
		int i_10;
		int i_11;
		int i_12;
		int[] ints_13;
		int i_14;
		int i_15;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			i_10 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_11 = 0; i_11 < i_9; i_11++) {
				i_12 = ints_2[i_11];
				if (i_12 < this.anIntArrayArray8966.length) {
					ints_13 = this.anIntArrayArray8966[i_12];

					for (i_14 = 0; i_14 < ints_13.length; i_14++) {
						i_15 = ints_13[i_14];
						if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_15]) != 0) {
							anInt8932 += this.anIntArray8901[i_15];
							anInt8939 += this.anIntArray8902[i_15];
							anInt8964 += this.anIntArray8931[i_15];
							++i_10;
						}
					}
				}
			}

			if (i_10 > 0) {
				anInt8932 = anInt8932 / i_10 + i_3;
				anInt8939 = anInt8939 / i_10 + i_4;
				anInt8964 = anInt8964 / i_10 + i_5;
				aBool8965 = true;
			} else {
				anInt8932 = i_3;
				anInt8939 = i_4;
				anInt8964 = i_5;
			}
		} else {
			int[] ints_47;
			int i_48;
			if (i_1 == 1) {
				if (ints_8 != null) {
					i_10 = ints_8[0] * i_3 + ints_8[1] * i_4 + ints_8[2] * i_5 + 8192 >> 14;
					i_11 = ints_8[3] * i_3 + ints_8[4] * i_4 + ints_8[5] * i_5 + 8192 >> 14;
					i_12 = ints_8[6] * i_3 + ints_8[7] * i_4 + ints_8[8] * i_5 + 8192 >> 14;
					i_3 = i_10;
					i_4 = i_11;
					i_5 = i_12;
				}

				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;

				for (i_10 = 0; i_10 < i_9; i_10++) {
					i_11 = ints_2[i_10];
					if (i_11 < this.anIntArrayArray8966.length) {
						ints_47 = this.anIntArrayArray8966[i_11];

						for (i_48 = 0; i_48 < ints_47.length; i_48++) {
							i_14 = ints_47[i_48];
							if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
								this.anIntArray8901[i_14] += i_3;
								this.anIntArray8902[i_14] += i_4;
								this.anIntArray8931[i_14] += i_5;
							}
						}
					}
				}
			} else {
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_26;
				int i_27;
				int i_28;
				int i_30;
				int i_32;
				int i_33;
				int i_34;
				int[] ints_35;
				int i_36;
				int i_37;
				int i_38;
				int i_39;
				int i_40;
				if (i_1 == 2) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8965) {
							i_16 = ints_8[0] * anInt8932 + ints_8[3] * anInt8939 + ints_8[6] * anInt8964 + 8192 >> 14;
							i_17 = ints_8[1] * anInt8932 + ints_8[4] * anInt8939 + ints_8[7] * anInt8964 + 8192 >> 14;
							i_18 = ints_8[2] * anInt8932 + ints_8[5] * anInt8939 + ints_8[8] * anInt8964 + 8192 >> 14;
							i_16 += i_48;
							i_17 += i_14;
							i_18 += i_15;
							anInt8932 = i_16;
							anInt8939 = i_17;
							anInt8964 = i_18;
							aBool8965 = false;
						}

						int[] ints_49 = new int[9];
						i_17 = Class382.anIntArray4661[i_3];
						i_18 = Class382.anIntArray4657[i_3];
						i_19 = Class382.anIntArray4661[i_4];
						i_20 = Class382.anIntArray4657[i_4];
						i_21 = Class382.anIntArray4661[i_5];
						i_22 = Class382.anIntArray4657[i_5];
						i_23 = i_18 * i_21 + 8192 >> 14;
						i_24 = i_18 * i_22 + 8192 >> 14;
						ints_49[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
						ints_49[1] = -i_19 * i_22 + i_20 * i_23 + 8192 >> 14;
						ints_49[2] = i_20 * i_17 + 8192 >> 14;
						ints_49[3] = i_17 * i_22 + 8192 >> 14;
						ints_49[4] = i_17 * i_21 + 8192 >> 14;
						ints_49[5] = -i_18;
						ints_49[6] = -i_20 * i_21 + i_19 * i_24 + 8192 >> 14;
						ints_49[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
						ints_49[8] = i_19 * i_17 + 8192 >> 14;
						int i_25 = ints_49[0] * -anInt8932 + ints_49[1] * -anInt8939 + ints_49[2] * -anInt8964 + 8192 >> 14;
						i_26 = ints_49[3] * -anInt8932 + ints_49[4] * -anInt8939 + ints_49[5] * -anInt8964 + 8192 >> 14;
						i_27 = ints_49[6] * -anInt8932 + ints_49[7] * -anInt8939 + ints_49[8] * -anInt8964 + 8192 >> 14;
						i_28 = i_25 + anInt8932;
						int i_29 = i_26 + anInt8939;
						i_30 = i_27 + anInt8964;
						int[] ints_31 = new int[9];

						for (i_32 = 0; i_32 < 3; i_32++) {
							for (i_33 = 0; i_33 < 3; i_33++) {
								i_34 = 0;

								for (int i_53 = 0; i_53 < 3; i_53++) {
									i_34 += ints_49[i_32 * 3 + i_53] * ints_8[i_33 * 3 + i_53];
								}

								ints_31[i_32 * 3 + i_33] = i_34 + 8192 >> 14;
							}
						}

						i_32 = ints_49[0] * i_48 + ints_49[1] * i_14 + ints_49[2] * i_15 + 8192 >> 14;
						i_33 = ints_49[3] * i_48 + ints_49[4] * i_14 + ints_49[5] * i_15 + 8192 >> 14;
						i_34 = ints_49[6] * i_48 + ints_49[7] * i_14 + ints_49[8] * i_15 + 8192 >> 14;
						i_32 += i_28;
						i_33 += i_29;
						i_34 += i_30;
						ints_35 = new int[9];

						for (i_36 = 0; i_36 < 3; i_36++) {
							for (i_37 = 0; i_37 < 3; i_37++) {
								i_38 = 0;

								for (i_39 = 0; i_39 < 3; i_39++) {
									i_38 += ints_8[i_36 * 3 + i_39] * ints_31[i_37 + i_39 * 3];
								}

								ints_35[i_36 * 3 + i_37] = i_38 + 8192 >> 14;
							}
						}

						i_36 = ints_8[0] * i_32 + ints_8[1] * i_33 + ints_8[2] * i_34 + 8192 >> 14;
						i_37 = ints_8[3] * i_32 + ints_8[4] * i_33 + ints_8[5] * i_34 + 8192 >> 14;
						i_38 = ints_8[6] * i_32 + ints_8[7] * i_33 + ints_8[8] * i_34 + 8192 >> 14;
						i_36 += i_10;
						i_37 += i_11;
						i_38 += i_12;

						for (i_39 = 0; i_39 < i_9; i_39++) {
							i_40 = ints_2[i_39];
							if (i_40 < this.anIntArrayArray8966.length) {
								int[] ints_41 = this.anIntArrayArray8966[i_40];

								for (int i_42 = 0; i_42 < ints_41.length; i_42++) {
									int i_43 = ints_41[i_42];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_43]) != 0) {
										int i_44 = ints_35[0] * this.anIntArray8901[i_43] + ints_35[1] * this.anIntArray8902[i_43] + ints_35[2] * this.anIntArray8931[i_43] + 8192 >> 14;
										int i_45 = ints_35[3] * this.anIntArray8901[i_43] + ints_35[4] * this.anIntArray8902[i_43] + ints_35[5] * this.anIntArray8931[i_43] + 8192 >> 14;
										int i_46 = ints_35[6] * this.anIntArray8901[i_43] + ints_35[7] * this.anIntArray8902[i_43] + ints_35[8] * this.anIntArray8931[i_43] + 8192 >> 14;
										i_44 += i_36;
										i_45 += i_37;
										i_46 += i_38;
										this.anIntArray8901[i_43] = i_44;
										this.anIntArray8902[i_43] = i_45;
										this.anIntArray8931[i_43] = i_46;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8966.length) {
								ints_47 = this.anIntArrayArray8966[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
										this.anIntArray8901[i_14] -= anInt8932;
										this.anIntArray8902[i_14] -= anInt8939;
										this.anIntArray8931[i_14] -= anInt8964;
										if (i_5 != 0) {
											i_15 = Class382.anIntArray4657[i_5];
											i_16 = Class382.anIntArray4661[i_5];
											i_17 = this.anIntArray8902[i_14] * i_15 + this.anIntArray8901[i_14] * i_16 + 16383 >> 14;
											this.anIntArray8902[i_14] = this.anIntArray8902[i_14] * i_16 - this.anIntArray8901[i_14] * i_15 + 16383 >> 14;
											this.anIntArray8901[i_14] = i_17;
										}

										if (i_3 != 0) {
											i_15 = Class382.anIntArray4657[i_3];
											i_16 = Class382.anIntArray4661[i_3];
											i_17 = this.anIntArray8902[i_14] * i_16 - this.anIntArray8931[i_14] * i_15 + 16383 >> 14;
											this.anIntArray8931[i_14] = this.anIntArray8902[i_14] * i_15 + this.anIntArray8931[i_14] * i_16 + 16383 >> 14;
											this.anIntArray8902[i_14] = i_17;
										}

										if (i_4 != 0) {
											i_15 = Class382.anIntArray4657[i_4];
											i_16 = Class382.anIntArray4661[i_4];
											i_17 = this.anIntArray8931[i_14] * i_15 + this.anIntArray8901[i_14] * i_16 + 16383 >> 14;
											this.anIntArray8931[i_14] = this.anIntArray8931[i_14] * i_16 - this.anIntArray8901[i_14] * i_15 + 16383 >> 14;
											this.anIntArray8901[i_14] = i_17;
										}

										this.anIntArray8901[i_14] += anInt8932;
										this.anIntArray8902[i_14] += anInt8939;
										this.anIntArray8931[i_14] += anInt8964;
									}
								}
							}
						}

						if (bool_6) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8966.length) {
									ints_47 = this.anIntArrayArray8966[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
											i_15 = this.anIntArray8947[i_14];
											i_16 = this.anIntArray8947[i_14 + 1];

											for (i_17 = i_15; i_17 < i_16; i_17++) {
												i_18 = this.aShortArray8948[i_17] - 1;
												if (i_18 == -1) {
													break;
												}

												if (i_5 != 0) {
													i_19 = Class382.anIntArray4657[i_5];
													i_20 = Class382.anIntArray4661[i_5];
													i_21 = this.aShortArray8933[i_18] * i_19 + this.aShortArray8909[i_18] * i_20 + 16383 >> 14;
													this.aShortArray8933[i_18] = (short) (this.aShortArray8933[i_18] * i_20 - this.aShortArray8909[i_18] * i_19 + 16383 >> 14);
													this.aShortArray8909[i_18] = (short) i_21;
												}

												if (i_3 != 0) {
													i_19 = Class382.anIntArray4657[i_3];
													i_20 = Class382.anIntArray4661[i_3];
													i_21 = this.aShortArray8933[i_18] * i_20 - this.aShortArray8911[i_18] * i_19 + 16383 >> 14;
													this.aShortArray8911[i_18] = (short) (this.aShortArray8933[i_18] * i_19 + this.aShortArray8911[i_18] * i_20 + 16383 >> 14);
													this.aShortArray8933[i_18] = (short) i_21;
												}

												if (i_4 != 0) {
													i_19 = Class382.anIntArray4657[i_4];
													i_20 = Class382.anIntArray4661[i_4];
													i_21 = this.aShortArray8911[i_18] * i_19 + this.aShortArray8909[i_18] * i_20 + 16383 >> 14;
													this.aShortArray8911[i_18] = (short) (this.aShortArray8911[i_18] * i_20 - this.aShortArray8909[i_18] * i_19 + 16383 >> 14);
													this.aShortArray8909[i_18] = (short) i_21;
												}
											}
										}
									}
								}
							}

							this.method14285();
						}
					}
				} else if (i_1 == 3) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8965) {
							i_16 = ints_8[0] * anInt8932 + ints_8[3] * anInt8939 + ints_8[6] * anInt8964 + 8192 >> 14;
							i_17 = ints_8[1] * anInt8932 + ints_8[4] * anInt8939 + ints_8[7] * anInt8964 + 8192 >> 14;
							i_18 = ints_8[2] * anInt8932 + ints_8[5] * anInt8939 + ints_8[8] * anInt8964 + 8192 >> 14;
							i_16 += i_48;
							i_17 += i_14;
							i_18 += i_15;
							anInt8932 = i_16;
							anInt8939 = i_17;
							anInt8964 = i_18;
							aBool8965 = false;
						}

						i_16 = i_3 << 15 >> 7;
						i_17 = i_4 << 15 >> 7;
						i_18 = i_5 << 15 >> 7;
						i_19 = i_16 * -anInt8932 + 8192 >> 14;
						i_20 = i_17 * -anInt8939 + 8192 >> 14;
						i_21 = i_18 * -anInt8964 + 8192 >> 14;
						i_22 = i_19 + anInt8932;
						i_23 = i_20 + anInt8939;
						i_24 = i_21 + anInt8964;
						int[] ints_50 = new int[] { i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, i_17 * ints_8[7] + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, i_18 * ints_8[5] + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14 };
						i_26 = i_16 * i_48 + 8192 >> 14;
						i_27 = i_17 * i_14 + 8192 >> 14;
						i_28 = i_18 * i_15 + 8192 >> 14;
						i_26 += i_22;
						i_27 += i_23;
						i_28 += i_24;
						int[] ints_51 = new int[9];

						int i_52;
						for (i_30 = 0; i_30 < 3; i_30++) {
							for (i_52 = 0; i_52 < 3; i_52++) {
								i_32 = 0;

								for (i_33 = 0; i_33 < 3; i_33++) {
									i_32 += ints_8[i_30 * 3 + i_33] * ints_50[i_52 + i_33 * 3];
								}

								ints_51[i_30 * 3 + i_52] = i_32 + 8192 >> 14;
							}
						}

						i_30 = ints_8[0] * i_26 + ints_8[1] * i_27 + ints_8[2] * i_28 + 8192 >> 14;
						i_52 = ints_8[3] * i_26 + ints_8[4] * i_27 + ints_8[5] * i_28 + 8192 >> 14;
						i_32 = ints_8[6] * i_26 + ints_8[7] * i_27 + ints_8[8] * i_28 + 8192 >> 14;
						i_30 += i_10;
						i_52 += i_11;
						i_32 += i_12;

						for (i_33 = 0; i_33 < i_9; i_33++) {
							i_34 = ints_2[i_33];
							if (i_34 < this.anIntArrayArray8966.length) {
								ints_35 = this.anIntArrayArray8966[i_34];

								for (i_36 = 0; i_36 < ints_35.length; i_36++) {
									i_37 = ints_35[i_36];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_37]) != 0) {
										i_38 = ints_51[0] * this.anIntArray8901[i_37] + ints_51[1] * this.anIntArray8902[i_37] + ints_51[2] * this.anIntArray8931[i_37] + 8192 >> 14;
										i_39 = ints_51[3] * this.anIntArray8901[i_37] + ints_51[4] * this.anIntArray8902[i_37] + ints_51[5] * this.anIntArray8931[i_37] + 8192 >> 14;
										i_40 = ints_51[6] * this.anIntArray8901[i_37] + ints_51[7] * this.anIntArray8902[i_37] + ints_51[8] * this.anIntArray8931[i_37] + 8192 >> 14;
										i_38 += i_30;
										i_39 += i_52;
										i_40 += i_32;
										this.anIntArray8901[i_37] = i_38;
										this.anIntArray8902[i_37] = i_39;
										this.anIntArray8931[i_37] = i_40;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8966.length) {
								ints_47 = this.anIntArrayArray8966[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
										this.anIntArray8901[i_14] -= anInt8932;
										this.anIntArray8902[i_14] -= anInt8939;
										this.anIntArray8931[i_14] -= anInt8964;
										this.anIntArray8901[i_14] = this.anIntArray8901[i_14] * i_3 >> 7;
										this.anIntArray8902[i_14] = this.anIntArray8902[i_14] * i_4 >> 7;
										this.anIntArray8931[i_14] = this.anIntArray8931[i_14] * i_5 >> 7;
										this.anIntArray8901[i_14] += anInt8932;
										this.anIntArray8902[i_14] += anInt8939;
										this.anIntArray8931[i_14] += anInt8964;
									}
								}
							}
						}
					}
				} else {
					Class65 class65_55;
					boolean bool_56;
					Class56 class56_57;
					if (i_1 == 5) {
						if (this.anIntArrayArray8924 != null) {
							bool_56 = false;

							for (i_11 = 0; i_11 < i_9; i_11++) {
								i_12 = ints_2[i_11];
								if (i_12 < this.anIntArrayArray8924.length) {
									ints_13 = this.anIntArrayArray8924[i_12];

									for (i_14 = 0; i_14 < ints_13.length; i_14++) {
										i_15 = ints_13[i_14];
										if (this.aShortArray8925 == null || (i_7 & this.aShortArray8925[i_15]) != 0) {
											i_16 = (this.aByteArray8900[i_15] & 0xff) + i_3 * 8;
											if (i_16 < 0) {
												i_16 = 0;
											} else if (i_16 > 255) {
												i_16 = 255;
											}

											this.aByteArray8900[i_15] = (byte) i_16;
										}
									}

									bool_56 |= ints_13.length > 0;
								}
							}

							if (bool_56) {
								if (this.aClass56Array8934 != null) {
									for (i_11 = 0; i_11 < this.anInt8951; i_11++) {
										class56_57 = this.aClass56Array8934[i_11];
										class65_55 = this.aClass65Array8953[i_11];
										class65_55.anInt669 = class65_55.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_57.anInt518] & 0xff) << 24;
									}
								}

								this.method14269();
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8924 != null) {
							bool_56 = false;

							for (i_11 = 0; i_11 < i_9; i_11++) {
								i_12 = ints_2[i_11];
								if (i_12 < this.anIntArrayArray8924.length) {
									ints_13 = this.anIntArrayArray8924[i_12];

									for (i_14 = 0; i_14 < ints_13.length; i_14++) {
										i_15 = ints_13[i_14];
										if (this.aShortArray8925 == null || (i_7 & this.aShortArray8925[i_15]) != 0) {
											i_16 = this.aShortArray8918[i_15] & 0xffff;
											i_17 = i_16 >> 10 & 0x3f;
											i_18 = i_16 >> 7 & 0x7;
											i_19 = i_16 & 0x7f;
											i_17 = i_17 + i_3 & 0x3f;
											i_18 += i_4 / 4;
											if (i_18 < 0) {
												i_18 = 0;
											} else if (i_18 > 7) {
												i_18 = 7;
											}

											i_19 += i_5;
											if (i_19 < 0) {
												i_19 = 0;
											} else if (i_19 > 127) {
												i_19 = 127;
											}

											this.aShortArray8918[i_15] = (short) (i_17 << 10 | i_18 << 7 | i_19);
										}
									}

									bool_56 |= ints_13.length > 0;
								}
							}

							if (bool_56) {
								if (this.aClass56Array8934 != null) {
									for (i_11 = 0; i_11 < this.anInt8951; i_11++) {
										class56_57 = this.aClass56Array8934[i_11];
										class65_55 = this.aClass65Array8953[i_11];
										class65_55.anInt669 = class65_55.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_57.anInt518] & 0xffff] & 0xffffff;
									}
								}

								this.method14269();
							}
						}
					} else {
						Class65 class65_54;
						if (i_1 == 8) {
							if (this.anIntArrayArray8954 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8954.length) {
										ints_47 = this.anIntArrayArray8954[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class65_54 = this.aClass65Array8953[ints_47[i_48]];
											class65_54.anInt668 += i_3;
											class65_54.anInt672 += i_4;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8954 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8954.length) {
										ints_47 = this.anIntArrayArray8954[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class65_54 = this.aClass65Array8953[ints_47[i_48]];
											class65_54.anInt671 = class65_54.anInt671 * i_3 >> 7;
											class65_54.anInt670 = class65_54.anInt670 * i_4 >> 7;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8954 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8954.length) {
									ints_47 = this.anIntArrayArray8954[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										class65_54 = this.aClass65Array8953[ints_47[i_48]];
										class65_54.anInt673 = class65_54.anInt673 + i_3 & 0x3fff;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public void method11295() {
		if (this.anInt8906 > 0 && this.anInt8963 * 3 * -1431655765 * 3 * -1431655765 > 0) {
			this.method14279();
			this.method14271();
			this.method14274();
		}

	}

	boolean bv() {
		if (this.anIntArrayArray8966 == null) {
			return false;
		} else {
			for (int i_1 = 0; i_1 < this.anInt8899; i_1++) {
				this.anIntArray8901[i_1] <<= 4;
				this.anIntArray8902[i_1] <<= 4;
				this.anIntArray8931[i_1] <<= 4;
			}

			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			return true;
		}
	}

	void bp() {
		for (int i_1 = 0; i_1 < this.anInt8899; i_1++) {
			this.anIntArray8901[i_1] = this.anIntArray8901[i_1] + 7 >> 4;
			this.anIntArray8902[i_1] = this.anIntArray8902[i_1] + 7 >> 4;
			this.anIntArray8931[i_1] = this.anIntArray8931[i_1] + 7 >> 4;
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public void bz(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		int i_4;
		int i_5;
		for (i_4 = 0; i_4 < this.anInt8910; i_4++) {
			i_5 = this.anIntArray8931[i_4] * i_2 + this.anIntArray8901[i_4] * i_3 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8931[i_4] * i_3 - this.anIntArray8901[i_4] * i_2 >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		for (i_4 = 0; i_4 < this.anInt8906; i_4++) {
			i_5 = this.aShortArray8911[i_4] * i_2 + this.aShortArray8909[i_4] * i_3 >> 14;
			this.aShortArray8911[i_4] = (short) (this.aShortArray8911[i_4] * i_3 - this.aShortArray8909[i_4] * i_2 >> 14);
			this.aShortArray8909[i_4] = (short) i_5;
		}

		this.method14268();
		this.method14285();
		this.aBool8937 = false;
	}

	public int YA() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8908;
	}

	void bb(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_6 = 0; i_6 < this.anInt8910; i_6++) {
				anInt8932 += this.anIntArray8901[i_6];
				anInt8939 += this.anIntArray8902[i_6];
				anInt8964 += this.anIntArray8931[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				anInt8932 = anInt8932 / i_5 + i_2;
				anInt8939 = anInt8939 / i_5 + i_3;
				anInt8964 = anInt8964 / i_5 + i_4;
			} else {
				anInt8932 = i_2;
				anInt8939 = i_3;
				anInt8964 = i_4;
			}
		} else if (i_1 == 1) {
			for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
				this.anIntArray8901[i_5] += i_2;
				this.anIntArray8902[i_5] += i_3;
				this.anIntArray8931[i_5] += i_4;
			}
		} else {
			int i_7;
			int i_8;
			if (i_1 == 2) {
				for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
					this.anIntArray8901[i_5] -= anInt8932;
					this.anIntArray8902[i_5] -= anInt8939;
					this.anIntArray8931[i_5] -= anInt8964;
					if (i_4 != 0) {
						i_6 = Class382.anIntArray4657[i_4];
						i_7 = Class382.anIntArray4661[i_4];
						i_8 = this.anIntArray8902[i_5] * i_6 + this.anIntArray8901[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8902[i_5] = this.anIntArray8902[i_5] * i_7 - this.anIntArray8901[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8901[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Class382.anIntArray4657[i_2];
						i_7 = Class382.anIntArray4661[i_2];
						i_8 = this.anIntArray8902[i_5] * i_7 - this.anIntArray8931[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8931[i_5] = this.anIntArray8902[i_5] * i_6 + this.anIntArray8931[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8902[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Class382.anIntArray4657[i_3];
						i_7 = Class382.anIntArray4661[i_3];
						i_8 = this.anIntArray8931[i_5] * i_6 + this.anIntArray8901[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8931[i_5] = this.anIntArray8931[i_5] * i_7 - this.anIntArray8901[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8901[i_5] = i_8;
					}

					this.anIntArray8901[i_5] += anInt8932;
					this.anIntArray8902[i_5] += anInt8939;
					this.anIntArray8931[i_5] += anInt8964;
				}
			} else if (i_1 == 3) {
				for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
					this.anIntArray8901[i_5] -= anInt8932;
					this.anIntArray8902[i_5] -= anInt8939;
					this.anIntArray8931[i_5] -= anInt8964;
					this.anIntArray8901[i_5] = this.anIntArray8901[i_5] * i_2 / 128;
					this.anIntArray8902[i_5] = this.anIntArray8902[i_5] * i_3 / 128;
					this.anIntArray8931[i_5] = this.anIntArray8931[i_5] * i_4 / 128;
					this.anIntArray8901[i_5] += anInt8932;
					this.anIntArray8902[i_5] += anInt8939;
					this.anIntArray8931[i_5] += anInt8964;
				}
			} else {
				Class56 class56_10;
				Class65 class65_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < this.anInt8916 * 3 * -1431655765; i_5++) {
						i_6 = (this.aByteArray8900[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0) {
							i_6 = 0;
						} else if (i_6 > 255) {
							i_6 = 255;
						}

						this.aByteArray8900[i_5] = (byte) i_6;
					}

					if (this.aClass56Array8934 != null) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class56_10 = this.aClass56Array8934[i_5];
							class65_11 = this.aClass65Array8953[i_5];
							class65_11.anInt669 = class65_11.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_10.anInt518] & 0xff) << 24;
						}
					}

					this.method14269();
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < this.anInt8916 * 3 * -1431655765; i_5++) {
						i_6 = this.aShortArray8918[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
						i_8 = i_6 >> 7 & 0x7;
						int i_9 = i_6 & 0x7f;
						i_7 = i_7 + i_2 & 0x3f;
						i_8 += i_3 / 4;
						if (i_8 < 0) {
							i_8 = 0;
						} else if (i_8 > 7) {
							i_8 = 7;
						}

						i_9 += i_4;
						if (i_9 < 0) {
							i_9 = 0;
						} else if (i_9 > 127) {
							i_9 = 127;
						}

						this.aShortArray8918[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					if (this.aClass56Array8934 != null) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class56_10 = this.aClass56Array8934[i_5];
							class65_11 = this.aClass65Array8953[i_5];
							class65_11.anInt669 = class65_11.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_10.anInt518] & 0xffff] & 0xffffff;
						}
					}

					this.method14269();
				} else {
					Class65 class65_12;
					if (i_1 == 8) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt668 += i_2;
							class65_12.anInt672 += i_3;
						}
					} else if (i_1 == 10) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt671 = class65_12.anInt671 * i_2 >> 7;
							class65_12.anInt670 = class65_12.anInt670 * i_3 >> 7;
						}
					} else if (i_1 == 9) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt673 = class65_12.anInt673 + i_2 & 0x3fff;
						}
					}
				}
			}
		}

	}

	void bo(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_6 = 0; i_6 < this.anInt8910; i_6++) {
				anInt8932 += this.anIntArray8901[i_6];
				anInt8939 += this.anIntArray8902[i_6];
				anInt8964 += this.anIntArray8931[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				anInt8932 = anInt8932 / i_5 + i_2;
				anInt8939 = anInt8939 / i_5 + i_3;
				anInt8964 = anInt8964 / i_5 + i_4;
			} else {
				anInt8932 = i_2;
				anInt8939 = i_3;
				anInt8964 = i_4;
			}
		} else if (i_1 == 1) {
			for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
				this.anIntArray8901[i_5] += i_2;
				this.anIntArray8902[i_5] += i_3;
				this.anIntArray8931[i_5] += i_4;
			}
		} else {
			int i_7;
			int i_8;
			if (i_1 == 2) {
				for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
					this.anIntArray8901[i_5] -= anInt8932;
					this.anIntArray8902[i_5] -= anInt8939;
					this.anIntArray8931[i_5] -= anInt8964;
					if (i_4 != 0) {
						i_6 = Class382.anIntArray4657[i_4];
						i_7 = Class382.anIntArray4661[i_4];
						i_8 = this.anIntArray8902[i_5] * i_6 + this.anIntArray8901[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8902[i_5] = this.anIntArray8902[i_5] * i_7 - this.anIntArray8901[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8901[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Class382.anIntArray4657[i_2];
						i_7 = Class382.anIntArray4661[i_2];
						i_8 = this.anIntArray8902[i_5] * i_7 - this.anIntArray8931[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8931[i_5] = this.anIntArray8902[i_5] * i_6 + this.anIntArray8931[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8902[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Class382.anIntArray4657[i_3];
						i_7 = Class382.anIntArray4661[i_3];
						i_8 = this.anIntArray8931[i_5] * i_6 + this.anIntArray8901[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8931[i_5] = this.anIntArray8931[i_5] * i_7 - this.anIntArray8901[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8901[i_5] = i_8;
					}

					this.anIntArray8901[i_5] += anInt8932;
					this.anIntArray8902[i_5] += anInt8939;
					this.anIntArray8931[i_5] += anInt8964;
				}
			} else if (i_1 == 3) {
				for (i_5 = 0; i_5 < this.anInt8910; i_5++) {
					this.anIntArray8901[i_5] -= anInt8932;
					this.anIntArray8902[i_5] -= anInt8939;
					this.anIntArray8931[i_5] -= anInt8964;
					this.anIntArray8901[i_5] = this.anIntArray8901[i_5] * i_2 / 128;
					this.anIntArray8902[i_5] = this.anIntArray8902[i_5] * i_3 / 128;
					this.anIntArray8931[i_5] = this.anIntArray8931[i_5] * i_4 / 128;
					this.anIntArray8901[i_5] += anInt8932;
					this.anIntArray8902[i_5] += anInt8939;
					this.anIntArray8931[i_5] += anInt8964;
				}
			} else {
				Class56 class56_10;
				Class65 class65_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < this.anInt8916 * 3 * -1431655765; i_5++) {
						i_6 = (this.aByteArray8900[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0) {
							i_6 = 0;
						} else if (i_6 > 255) {
							i_6 = 255;
						}

						this.aByteArray8900[i_5] = (byte) i_6;
					}

					if (this.aClass56Array8934 != null) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class56_10 = this.aClass56Array8934[i_5];
							class65_11 = this.aClass65Array8953[i_5];
							class65_11.anInt669 = class65_11.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_10.anInt518] & 0xff) << 24;
						}
					}

					this.method14269();
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < this.anInt8916 * 3 * -1431655765; i_5++) {
						i_6 = this.aShortArray8918[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
						i_8 = i_6 >> 7 & 0x7;
						int i_9 = i_6 & 0x7f;
						i_7 = i_7 + i_2 & 0x3f;
						i_8 += i_3 / 4;
						if (i_8 < 0) {
							i_8 = 0;
						} else if (i_8 > 7) {
							i_8 = 7;
						}

						i_9 += i_4;
						if (i_9 < 0) {
							i_9 = 0;
						} else if (i_9 > 127) {
							i_9 = 127;
						}

						this.aShortArray8918[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					if (this.aClass56Array8934 != null) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class56_10 = this.aClass56Array8934[i_5];
							class65_11 = this.aClass65Array8953[i_5];
							class65_11.anInt669 = class65_11.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_10.anInt518] & 0xffff] & 0xffffff;
						}
					}

					this.method14269();
				} else {
					Class65 class65_12;
					if (i_1 == 8) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt668 += i_2;
							class65_12.anInt672 += i_3;
						}
					} else if (i_1 == 10) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt671 = class65_12.anInt671 * i_2 >> 7;
							class65_12.anInt670 = class65_12.anInt670 * i_3 >> 7;
						}
					} else if (i_1 == 9) {
						for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
							class65_12 = this.aClass65Array8953[i_5];
							class65_12.anInt673 = class65_12.anInt673 + i_2 & 0x3fff;
						}
					}
				}
			}
		}

	}

	static float[] method14286(float[] floats_0, int i_1) {
		float[] floats_2 = new float[i_1];
		System.arraycopy(floats_0, 0, floats_2, 0, i_1);
		return floats_2;
	}

	public void method11290(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8905 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = this.aClass505_Sub2_8917.aClass294_8713;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < this.anInt8910; i_6++) {
				if ((i_2 & this.aShortArray8905[i_6]) != 0) {
					matrix44var_4.method5226((float) this.anIntArray8901[i_6], (float) this.anIntArray8902[i_6], (float) this.anIntArray8931[i_6], floats_5);
					this.anIntArray8901[i_6] = (int) floats_5[0];
					this.anIntArray8902[i_6] = (int) floats_5[1];
					this.anIntArray8931[i_6] = (int) floats_5[2];
				}
			}
		}

	}

	public void method11291(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8905 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = this.aClass505_Sub2_8917.aClass294_8713;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < this.anInt8910; i_6++) {
				if ((i_2 & this.aShortArray8905[i_6]) != 0) {
					matrix44var_4.method5226((float) this.anIntArray8901[i_6], (float) this.anIntArray8902[i_6], (float) this.anIntArray8931[i_6], floats_5);
					this.anIntArray8901[i_6] = (int) floats_5[0];
					this.anIntArray8902[i_6] = (int) floats_5[1];
					this.anIntArray8931[i_6] = (int) floats_5[2];
				}
			}
		}

	}

	public int cd() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8943;
	}

	public void method11293(Matrix44Var matrix44var_1, Class275_Sub5 class275_sub5_2, int i_3) {
		if (aClass34_8938 != null) {
			aClass34_8938.method841();
		}

		if (this.anInt8906 != 0) {
			Matrix44Arr matrix44arr_4 = this.aClass505_Sub2_8917.aClass384_8724;
			Matrix44Arr matrix44arr_5 = this.aClass505_Sub2_8917.aClass384_8683;
			Matrix44Arr matrix44arr_6 = this.aClass505_Sub2_8917.aClass384_8715;
			matrix44arr_5.fromVarMatrix44(matrix44var_1);
			matrix44arr_6.method6562(matrix44arr_5);
			matrix44arr_6.method6523(this.aClass505_Sub2_8917.aClass384_8728);
			if (!this.aBool8937) {
				this.method14281();
			}

			float[] floats_7 = this.aClass505_Sub2_8917.aFloatArray8717;
			matrix44arr_5.method6527(0.0F, (float) this.anInt8908, 0.0F, floats_7);
			float f_8 = floats_7[0];
			float f_9 = floats_7[1];
			float f_10 = floats_7[2];
			matrix44arr_5.method6527(0.0F, (float) this.anInt8893, 0.0F, floats_7);
			float f_11 = floats_7[0];
			float f_12 = floats_7[1];
			float f_13 = floats_7[2];

			for (int i_14 = 0; i_14 < 6; i_14++) {
				float[] floats_33 = this.aClass505_Sub2_8917.aFloatArrayArray8730[i_14];
				float f_16 = floats_33[0] * f_8 + floats_33[1] * f_9 + floats_33[2] * f_10 + floats_33[3] + (float) this.anInt8936;
				float f_17 = floats_33[0] * f_11 + floats_33[1] * f_12 + floats_33[2] * f_13 + floats_33[3] + (float) this.anInt8936;
				if (f_16 < 0.0F && f_17 < 0.0F) {
					return;
				}
			}

			if (class275_sub5_2 != null) {
				boolean bool_34 = false;
				boolean bool_15 = true;
				int i_35 = this.anInt8940 + this.anInt8941 >> 1;
				int i_36 = this.anInt8942 + this.anInt8943 >> 1;
				int i_19 = this.anInt8908;
				float f_21 = matrix44arr_6.buf[0] * (float) i_35 + matrix44arr_6.buf[4] * (float) i_19 + matrix44arr_6.buf[8] * (float) i_36 + matrix44arr_6.buf[12];
				float f_22 = matrix44arr_6.buf[1] * (float) i_35 + matrix44arr_6.buf[5] * (float) i_19 + matrix44arr_6.buf[9] * (float) i_36 + matrix44arr_6.buf[13];
				float f_23 = matrix44arr_6.buf[2] * (float) i_35 + matrix44arr_6.buf[6] * (float) i_19 + matrix44arr_6.buf[10] * (float) i_36 + matrix44arr_6.buf[14];
				float f_24 = matrix44arr_6.buf[3] * (float) i_35 + matrix44arr_6.buf[7] * (float) i_19 + matrix44arr_6.buf[11] * (float) i_36 + matrix44arr_6.buf[15];
				if (f_23 >= -f_24) {
					class275_sub5_2.anInt7847 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_21 / f_24);
					class275_sub5_2.anInt7848 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_22 / f_24);
				} else {
					bool_34 = true;
				}

				i_19 = this.anInt8893;
				float f_25 = matrix44arr_6.buf[0] * (float) i_35 + matrix44arr_6.buf[4] * (float) i_19 + matrix44arr_6.buf[8] * (float) i_36 + matrix44arr_6.buf[12];
				float f_26 = matrix44arr_6.buf[1] * (float) i_35 + matrix44arr_6.buf[5] * (float) i_19 + matrix44arr_6.buf[9] * (float) i_36 + matrix44arr_6.buf[13];
				float f_27 = matrix44arr_6.buf[2] * (float) i_35 + matrix44arr_6.buf[6] * (float) i_19 + matrix44arr_6.buf[10] * (float) i_36 + matrix44arr_6.buf[14];
				float f_28 = matrix44arr_6.buf[3] * (float) i_35 + matrix44arr_6.buf[7] * (float) i_19 + matrix44arr_6.buf[11] * (float) i_36 + matrix44arr_6.buf[15];
				if (f_27 >= -f_28) {
					class275_sub5_2.anInt7850 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_25 / f_28);
					class275_sub5_2.anInt7846 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_26 / f_28);
				} else {
					bool_34 = true;
				}

				float f_29;
				float f_30;
				if (bool_34) {
					if (f_23 < -f_24 && f_27 < -f_28) {
						bool_15 = false;
					} else {
						float f_31;
						float f_32;
						if (f_23 < -f_24) {
							f_29 = (f_23 + f_24) / (f_27 + f_28) - 1.0F;
							f_30 = f_21 + f_29 * (f_25 - f_21);
							f_31 = f_22 + f_29 * (f_26 - f_22);
							f_32 = f_24 + f_29 * (f_28 - f_24);
							class275_sub5_2.anInt7847 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_32);
							class275_sub5_2.anInt7848 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_32);
						} else if (f_27 < -f_28) {
							f_29 = (f_27 + f_28) / (f_23 + f_24) - 1.0F;
							f_30 = f_25 + f_29 * (f_21 - f_25);
							f_31 = f_26 + f_29 * (f_22 - f_26);
							f_32 = f_28 + f_29 * (f_24 - f_28);
							class275_sub5_2.anInt7850 = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_32);
							class275_sub5_2.anInt7846 = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_32);
						}
					}
				}

				if (bool_15) {
					if (f_23 / f_24 > f_27 / f_28) {
						f_29 = f_21 + matrix44arr_4.buf[0] * (float) this.anInt8936 + matrix44arr_4.buf[12];
						f_30 = f_24 + matrix44arr_4.buf[3] * (float) this.anInt8936 + matrix44arr_4.buf[15];
						class275_sub5_2.anInt7851 = (int) (this.aClass505_Sub2_8917.aFloat8797 - (float) class275_sub5_2.anInt7847 + this.aClass505_Sub2_8917.aFloat8732 * f_29 / f_30);
					} else {
						f_29 = f_25 + matrix44arr_4.buf[0] * (float) this.anInt8936 + matrix44arr_4.buf[12];
						f_30 = f_28 + matrix44arr_4.buf[3] * (float) this.anInt8936 + matrix44arr_4.buf[15];
						class275_sub5_2.anInt7851 = (int) (this.aClass505_Sub2_8917.aFloat8797 - (float) class275_sub5_2.anInt7850 + this.aClass505_Sub2_8917.aFloat8732 * f_29 / f_30);
					}

					class275_sub5_2.aBool7849 = true;
				}
			}

			this.aClass505_Sub2_8917.method14098(i_3);
			this.method14278(matrix44var_1);
			this.aClass505_Sub2_8917.method14098(0);
			matrix44arr_5.fromVarMatrix44(matrix44var_1);
			matrix44arr_5.method6523(this.aClass505_Sub2_8917.aClass384_8740);
			this.method14275(matrix44arr_5);
		}

	}

	public void method11315(Matrix44Var matrix44var_1) {
		Matrix44Arr matrix44arr_2 = this.aClass505_Sub2_8917.aClass384_8683;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (this.aClass87Array8949 != null) {
			for (i_3 = 0; i_3 < this.aClass87Array8949.length; i_3++) {
				Class87 class87_4 = this.aClass87Array8949[i_3];
				Class87 class87_5 = class87_4;
				if (class87_4.aClass87_835 != null) {
					class87_5 = class87_4.aClass87_835;
				}

				class87_5.anInt844 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt836 * 1502404273 * -1572033967]) * -1929058355 * -75866875;
				class87_5.anInt841 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt836 * 1502404273 * -1572033967]) * 996785411 * 1618253227;
				class87_5.anInt847 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt836 * 1502404273 * -1572033967]) * 976806429 * -489230283;
				class87_5.anInt834 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt837 * -2021469179 * -1955014451]) * -458323579 * 1747322701;
				class87_5.anInt843 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt837 * -2021469179 * -1955014451]) * 543149547 * -174394685;
				class87_5.anInt845 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt837 * -2021469179 * -1955014451]) * 1054448197 * 305293453;
				class87_5.anInt846 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt838 * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
				class87_5.anInt840 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt838 * -1292195173 * -2135413869]) * -1652520905 * 950906247;
				class87_5.anInt848 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt838 * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
			}
		}

		if (this.aClass172Array8950 != null) {
			for (i_3 = 0; i_3 < this.aClass172Array8950.length; i_3++) {
				Class172 class172_6 = this.aClass172Array8950[i_3];
				Class172 class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null) {
					class172_7 = class172_6.aClass172_2114;
				}

				if (class172_6.aClass384_2116 != null) {
					class172_6.aClass384_2116.method6562(matrix44arr_2);
				} else {
					class172_6.aClass384_2116 = new Matrix44Arr(matrix44arr_2);
				}

				class172_7.anInt2113 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
				class172_7.anInt2117 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
				class172_7.anInt2118 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
			}
		}

	}

	public void method11294(Matrix44Var matrix44var_1) {
		Matrix44Arr matrix44arr_2 = this.aClass505_Sub2_8917.aClass384_8683;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (this.aClass87Array8949 != null) {
			for (i_3 = 0; i_3 < this.aClass87Array8949.length; i_3++) {
				Class87 class87_4 = this.aClass87Array8949[i_3];
				Class87 class87_5 = class87_4;
				if (class87_4.aClass87_835 != null) {
					class87_5 = class87_4.aClass87_835;
				}

				class87_5.anInt844 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt836 * 1502404273 * -1572033967]) * -1929058355 * -75866875;
				class87_5.anInt841 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt836 * 1502404273 * -1572033967]) * 996785411 * 1618253227;
				class87_5.anInt847 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt836 * 1502404273 * -1572033967]) * 976806429 * -489230283;
				class87_5.anInt834 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt837 * -2021469179 * -1955014451]) * -458323579 * 1747322701;
				class87_5.anInt843 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt837 * -2021469179 * -1955014451]) * 543149547 * -174394685;
				class87_5.anInt845 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt837 * -2021469179 * -1955014451]) * 1054448197 * 305293453;
				class87_5.anInt846 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class87_4.anInt838 * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
				class87_5.anInt840 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class87_4.anInt838 * -1292195173 * -2135413869]) * -1652520905 * 950906247;
				class87_5.anInt848 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class87_4.anInt838 * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
			}
		}

		if (this.aClass172Array8950 != null) {
			for (i_3 = 0; i_3 < this.aClass172Array8950.length; i_3++) {
				Class172 class172_6 = this.aClass172Array8950[i_3];
				Class172 class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null) {
					class172_7 = class172_6.aClass172_2114;
				}

				if (class172_6.aClass384_2116 != null) {
					class172_6.aClass384_2116.method6562(matrix44arr_2);
				} else {
					class172_6.aClass384_2116 = new Matrix44Arr(matrix44arr_2);
				}

				class172_7.anInt2113 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8901[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[4] * (float) this.anIntArray8902[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[8] * (float) this.anIntArray8931[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
				class172_7.anInt2117 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8901[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[5] * (float) this.anIntArray8902[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[9] * (float) this.anIntArray8931[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
				class172_7.anInt2118 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8901[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[6] * (float) this.anIntArray8902[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[10] * (float) this.anIntArray8931[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
			}
		}

	}

	public int cv() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8940;
	}

	public int Z() {
		return this.aShort8898;
	}

	public int cc() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8940;
	}

	public void S(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		int i_4;
		int i_5;
		for (i_4 = 0; i_4 < this.anInt8910; i_4++) {
			i_5 = i_2 * this.anIntArray8931[i_4] + i_3 * this.anIntArray8901[i_4] >> 14;
			this.anIntArray8931[i_4] = i_3 * this.anIntArray8931[i_4] - i_2 * this.anIntArray8901[i_4] >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		for (i_4 = 0; i_4 < this.anInt8906; i_4++) {
			i_5 = this.aShortArray8911[i_4] * i_2 + this.aShortArray8909[i_4] * i_3 >> 14;
			this.aShortArray8911[i_4] = (short) (this.aShortArray8911[i_4] * i_3 - this.aShortArray8909[i_4] * i_2 >> 14);
			this.aShortArray8909[i_4] = (short) i_5;
		}

		this.method14268();
		this.method14285();
		this.aBool8937 = false;
	}

	public int m() {
		return this.anInt8895;
	}

	public void method11263(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8905 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = this.aClass505_Sub2_8917.aClass294_8713;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < this.anInt8910; i_6++) {
				if ((i_2 & this.aShortArray8905[i_6]) != 0) {
					matrix44var_4.method5226((float) this.anIntArray8901[i_6], (float) this.anIntArray8902[i_6], (float) this.anIntArray8931[i_6], floats_5);
					this.anIntArray8901[i_6] = (int) floats_5[0];
					this.anIntArray8902[i_6] = (int) floats_5[1];
					this.anIntArray8931[i_6] = (int) floats_5[2];
				}
			}
		}

	}

	public int cb() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8908;
	}

	public int ha() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8943;
	}

	public int ca() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8908;
	}

	public int ck() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8942;
	}

	Class528_Sub3(Class505_Sub2 class505_sub2_1, int i_2, int i_3, boolean bool_4, boolean bool_5) {
		this.anInt8899 = 0;
		this.anInt8910 = 0;
		this.anInt8906 = 0;
		this.anInt8916 = 0;
		this.anInt8963 = 0;
		this.aBool8904 = false;
		this.aBool8919 = true;
		this.aBool8959 = false;
		this.aBool8903 = false;
		this.aBool8937 = false;
		this.aClass505_Sub2_8917 = class505_sub2_1;
		this.anInt8895 = i_2;
		this.anInt8896 = i_3;
		this.aBool8904 = bool_5;
		if (bool_4 || Class50.method990(this.anInt8895, this.anInt8896)) {
			this.aClass63_8927 = new Class63(Class50.method995(this.anInt8895, this.anInt8896));
		}

		if (bool_4 || Class50.method993(this.anInt8895, this.anInt8896)) {
			this.aClass63_8930 = new Class63(Class50.method1056(this.anInt8895, this.anInt8896));
		}

		if (bool_4 || Class50.method1059(this.anInt8895, this.anInt8896)) {
			this.aClass63_8913 = new Class63(Class50.method1051(this.anInt8895, this.anInt8896));
		}

		if (bool_4 || Class50.method983(this.anInt8895, this.anInt8896)) {
			this.aClass63_8929 = new Class63(Class50.method1020(this.anInt8895, this.anInt8896));
		}

		if (bool_4 || Class50.method1043(this.anInt8895, this.anInt8896)) {
			this.aClass39_8926 = new Class39(Class50.method999(this.anInt8895, this.anInt8896));
		}

		if (bool_4 && bool_5) {
			this.aClass63_8927.anInterface4_664 = this.aClass63_8927.anInterface4_661 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
			this.aClass63_8930.anInterface4_664 = this.aClass63_8930.anInterface4_661 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
			this.aClass63_8913.anInterface4_664 = this.aClass63_8913.anInterface4_661 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
			this.aClass63_8929.anInterface4_664 = this.aClass63_8929.anInterface4_661 = this.aClass505_Sub2_8917.method13994(this.aBool8904);
		}

	}

	public void bj(int i_1) {
		int i_2 = Class382.anIntArray4657[i_1];
		int i_3 = Class382.anIntArray4661[i_1];

		int i_4;
		int i_5;
		for (i_4 = 0; i_4 < this.anInt8910; i_4++) {
			i_5 = this.anIntArray8931[i_4] * i_2 + this.anIntArray8901[i_4] * i_3 >> 14;
			this.anIntArray8931[i_4] = this.anIntArray8931[i_4] * i_3 - this.anIntArray8901[i_4] * i_2 >> 14;
			this.anIntArray8901[i_4] = i_5;
		}

		for (i_4 = 0; i_4 < this.anInt8906; i_4++) {
			i_5 = this.aShortArray8911[i_4] * i_2 + this.aShortArray8909[i_4] * i_3 >> 14;
			this.aShortArray8911[i_4] = (short) (this.aShortArray8911[i_4] * i_3 - this.aShortArray8909[i_4] * i_2 >> 14);
			this.aShortArray8909[i_4] = (short) i_5;
		}

		this.method14268();
		this.method14285();
		this.aBool8937 = false;
	}

	public boolean successful() {
		if (this.aShortArray8923 == null) {
			return true;
		} else {
			for (int i_1 = 0; i_1 < this.aShortArray8923.length; i_1++) {
				if (this.aShortArray8923[i_1] != -1 && !this.aClass505_Sub2_8917.anInterface22_5834.method139(this.aShortArray8923[i_1], -675097130)) {
					return false;
				}
			}

			return true;
		}
	}

	public int cp() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8940;
	}

	public int ch() {
		return this.aShort8898;
	}

	public void cq(short s_1, short s_2) {
		int i_3;
		for (i_3 = 0; i_3 < this.anInt8916 * 3 * -1431655765; i_3++) {
			if (this.aShortArray8918[i_3] == s_1) {
				this.aShortArray8918[i_3] = s_2;
			}
		}

		if (this.aClass56Array8934 != null) {
			for (i_3 = 0; i_3 < this.anInt8951; i_3++) {
				Class56 class56_4 = this.aClass56Array8934[i_3];
				Class65 class65_5 = this.aClass65Array8953[i_3];
				class65_5.anInt669 = class65_5.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_4.anInt518] & 0xffff] & 0xffffff;
			}
		}

		this.method14269();
	}

	public void cy(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		for (i_5 = 0; i_5 < this.anInt8916 * 3 * -1431655765; i_5++) {
			int i_6 = this.aShortArray8918[i_5] & 0xffff;
			int i_7 = i_6 >> 10 & 0x3f;
			int i_8 = i_6 >> 7 & 0x7;
			int i_9 = i_6 & 0x7f;
			if (i_1 != -1) {
				i_7 += (i_1 - i_7) * i_4 >> 7;
			}

			if (i_2 != -1) {
				i_8 += (i_2 - i_8) * i_4 >> 7;
			}

			if (i_3 != -1) {
				i_9 += (i_3 - i_9) * i_4 >> 7;
			}

			this.aShortArray8918[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
		}

		if (this.aClass56Array8934 != null) {
			for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
				Class56 class56_10 = this.aClass56Array8934[i_5];
				Class65 class65_11 = this.aClass65Array8953[i_5];
				class65_11.anInt669 = class65_11.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_10.anInt518] & 0xffff] & 0xffffff;
			}
		}

		this.method14269();
	}

	public int dd() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8893;
	}

	public Class172[] method11331() {
		return this.aClass172Array8950;
	}

	public Class172[] method11283() {
		return this.aClass172Array8950;
	}

	public Class172[] method11302() {
		return this.aClass172Array8950;
	}

	public boolean method11303() {
		if (this.aShortArray8923 == null) {
			return true;
		} else {
			for (int i_1 = 0; i_1 < this.aShortArray8923.length; i_1++) {
				if (this.aShortArray8923[i_1] != -1 && !this.aClass505_Sub2_8917.anInterface22_5834.method139(this.aShortArray8923[i_1], -344240074)) {
					return false;
				}
			}

			return true;
		}
	}

	public int AA() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8942;
	}

	boolean bh() {
		if (this.anIntArrayArray8966 == null) {
			return false;
		} else {
			for (int i_1 = 0; i_1 < this.anInt8899; i_1++) {
				this.anIntArray8901[i_1] <<= 4;
				this.anIntArray8902[i_1] <<= 4;
				this.anIntArray8931[i_1] <<= 4;
			}

			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;
			return true;
		}
	}

	public void dk(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			if (i_1 != 0) {
				this.anIntArray8901[i_4] += i_1;
			}

			if (i_2 != 0) {
				this.anIntArray8902[i_4] += i_2;
			}

			if (i_3 != 0) {
				this.anIntArray8931[i_4] += i_3;
			}
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public int dy() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8936;
	}

	public int dm() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8936;
	}

	public int dp() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8957;
	}

	public int du() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8957;
	}

	int method14290(int i_1, int i_2) {
		i_2 = (i_1 & 0x7f) * i_2 >> 7;
		if (i_2 < 2) {
			i_2 = 2;
		} else if (i_2 > 126) {
			i_2 = 126;
		}

		return i_2 + (i_1 & 0xff80);
	}

	public int c() {
		return this.aShort8897;
	}

	void e(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
		int i_9 = ints_2.length;
		int i_10;
		int i_11;
		int i_12;
		int[] ints_13;
		int i_14;
		int i_15;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			i_10 = 0;
			anInt8932 = 0;
			anInt8939 = 0;
			anInt8964 = 0;

			for (i_11 = 0; i_11 < i_9; i_11++) {
				i_12 = ints_2[i_11];
				if (i_12 < this.anIntArrayArray8966.length) {
					ints_13 = this.anIntArrayArray8966[i_12];

					for (i_14 = 0; i_14 < ints_13.length; i_14++) {
						i_15 = ints_13[i_14];
						if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_15]) != 0) {
							anInt8932 += this.anIntArray8901[i_15];
							anInt8939 += this.anIntArray8902[i_15];
							anInt8964 += this.anIntArray8931[i_15];
							++i_10;
						}
					}
				}
			}

			if (i_10 > 0) {
				anInt8932 = i_3 + anInt8932 / i_10;
				anInt8939 = i_4 + anInt8939 / i_10;
				anInt8964 = i_5 + anInt8964 / i_10;
				aBool8965 = true;
			} else {
				anInt8932 = i_3;
				anInt8939 = i_4;
				anInt8964 = i_5;
			}
		} else {
			int[] ints_47;
			int i_48;
			if (i_1 == 1) {
				if (ints_8 != null) {
					i_10 = i_5 * ints_8[2] + ints_8[1] * i_4 + i_3 * ints_8[0] + 8192 >> 14;
					i_11 = i_3 * ints_8[3] + i_5 * ints_8[5] + i_4 * ints_8[4] + 8192 >> 14;
					i_12 = i_3 * ints_8[6] + ints_8[7] * i_4 + i_5 * ints_8[8] + 8192 >> 14;
					i_3 = i_10;
					i_4 = i_11;
					i_5 = i_12;
				}

				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;

				for (i_10 = 0; i_10 < i_9; i_10++) {
					i_11 = ints_2[i_10];
					if (i_11 < this.anIntArrayArray8966.length) {
						ints_47 = this.anIntArrayArray8966[i_11];

						for (i_48 = 0; i_48 < ints_47.length; i_48++) {
							i_14 = ints_47[i_48];
							if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
								this.anIntArray8901[i_14] += i_3;
								this.anIntArray8902[i_14] += i_4;
								this.anIntArray8931[i_14] += i_5;
							}
						}
					}
				}
			} else {
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_26;
				int i_27;
				int i_28;
				int i_30;
				int i_32;
				int i_33;
				int i_34;
				int[] ints_35;
				int i_36;
				int i_37;
				int i_38;
				int i_39;
				int i_40;
				if (i_1 == 2) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8965) {
							i_16 = ints_8[0] * anInt8932 + ints_8[6] * anInt8964 + ints_8[3] * anInt8939 + 8192 >> 14;
							i_17 = ints_8[7] * anInt8964 + ints_8[4] * anInt8939 + ints_8[1] * anInt8932 + 8192 >> 14;
							i_18 = ints_8[8] * anInt8964 + ints_8[2] * anInt8932 + ints_8[5] * anInt8939 + 8192 >> 14;
							i_16 += i_48;
							i_17 += i_14;
							i_18 += i_15;
							anInt8932 = i_16;
							anInt8939 = i_17;
							anInt8964 = i_18;
							aBool8965 = false;
						}

						int[] ints_49 = new int[9];
						i_17 = Class382.anIntArray4661[i_3];
						i_18 = Class382.anIntArray4657[i_3];
						i_19 = Class382.anIntArray4661[i_4];
						i_20 = Class382.anIntArray4657[i_4];
						i_21 = Class382.anIntArray4661[i_5];
						i_22 = Class382.anIntArray4657[i_5];
						i_23 = i_18 * i_21 + 8192 >> 14;
						i_24 = i_18 * i_22 + 8192 >> 14;
						ints_49[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
						ints_49[1] = i_20 * i_23 + -i_19 * i_22 + 8192 >> 14;
						ints_49[2] = i_20 * i_17 + 8192 >> 14;
						ints_49[3] = i_17 * i_22 + 8192 >> 14;
						ints_49[4] = i_17 * i_21 + 8192 >> 14;
						ints_49[5] = -i_18;
						ints_49[6] = i_19 * i_24 + -i_20 * i_21 + 8192 >> 14;
						ints_49[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
						ints_49[8] = i_19 * i_17 + 8192 >> 14;
						int i_25 = ints_49[1] * -anInt8939 + ints_49[0] * -anInt8932 + ints_49[2] * -anInt8964 + 8192 >> 14;
						i_26 = -anInt8939 * ints_49[4] + ints_49[3] * -anInt8932 + -anInt8964 * ints_49[5] + 8192 >> 14;
						i_27 = ints_49[7] * -anInt8939 + ints_49[6] * -anInt8932 + ints_49[8] * -anInt8964 + 8192 >> 14;
						i_28 = i_25 + anInt8932;
						int i_29 = i_26 + anInt8939;
						i_30 = i_27 + anInt8964;
						int[] ints_31 = new int[9];

						for (i_32 = 0; i_32 < 3; i_32++) {
							for (i_33 = 0; i_33 < 3; i_33++) {
								i_34 = 0;

								for (int i_53 = 0; i_53 < 3; i_53++) {
									i_34 += ints_8[i_53 + i_33 * 3] * ints_49[i_53 + i_32 * 3];
								}

								ints_31[i_33 + i_32 * 3] = i_34 + 8192 >> 14;
							}
						}

						i_32 = i_14 * ints_49[1] + i_48 * ints_49[0] + i_15 * ints_49[2] + 8192 >> 14;
						i_33 = i_14 * ints_49[4] + i_48 * ints_49[3] + i_15 * ints_49[5] + 8192 >> 14;
						i_34 = ints_49[6] * i_48 + i_15 * ints_49[8] + ints_49[7] * i_14 + 8192 >> 14;
						i_32 += i_28;
						i_33 += i_29;
						i_34 += i_30;
						ints_35 = new int[9];

						for (i_36 = 0; i_36 < 3; i_36++) {
							for (i_37 = 0; i_37 < 3; i_37++) {
								i_38 = 0;

								for (i_39 = 0; i_39 < 3; i_39++) {
									i_38 += ints_31[i_37 + i_39 * 3] * ints_8[i_39 + i_36 * 3];
								}

								ints_35[i_37 + i_36 * 3] = i_38 + 8192 >> 14;
							}
						}

						i_36 = i_34 * ints_8[2] + i_32 * ints_8[0] + i_33 * ints_8[1] + 8192 >> 14;
						i_37 = i_32 * ints_8[3] + i_33 * ints_8[4] + ints_8[5] * i_34 + 8192 >> 14;
						i_38 = i_32 * ints_8[6] + i_34 * ints_8[8] + ints_8[7] * i_33 + 8192 >> 14;
						i_36 += i_10;
						i_37 += i_11;
						i_38 += i_12;

						for (i_39 = 0; i_39 < i_9; i_39++) {
							i_40 = ints_2[i_39];
							if (i_40 < this.anIntArrayArray8966.length) {
								int[] ints_41 = this.anIntArrayArray8966[i_40];

								for (int i_42 = 0; i_42 < ints_41.length; i_42++) {
									int i_43 = ints_41[i_42];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_43]) != 0) {
										int i_44 = ints_35[0] * this.anIntArray8901[i_43] + ints_35[2] * this.anIntArray8931[i_43] + ints_35[1] * this.anIntArray8902[i_43] + 8192 >> 14;
										int i_45 = ints_35[4] * this.anIntArray8902[i_43] + ints_35[5] * this.anIntArray8931[i_43] + ints_35[3] * this.anIntArray8901[i_43] + 8192 >> 14;
										int i_46 = ints_35[6] * this.anIntArray8901[i_43] + ints_35[7] * this.anIntArray8902[i_43] + ints_35[8] * this.anIntArray8931[i_43] + 8192 >> 14;
										i_44 += i_36;
										i_45 += i_37;
										i_46 += i_38;
										this.anIntArray8901[i_43] = i_44;
										this.anIntArray8902[i_43] = i_45;
										this.anIntArray8931[i_43] = i_46;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8966.length) {
								ints_47 = this.anIntArrayArray8966[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
										this.anIntArray8901[i_14] -= anInt8932;
										this.anIntArray8902[i_14] -= anInt8939;
										this.anIntArray8931[i_14] -= anInt8964;
										if (i_5 != 0) {
											i_15 = Class382.anIntArray4657[i_5];
											i_16 = Class382.anIntArray4661[i_5];
											i_17 = i_15 * this.anIntArray8902[i_14] + i_16 * this.anIntArray8901[i_14] + 16383 >> 14;
											this.anIntArray8902[i_14] = i_16 * this.anIntArray8902[i_14] - i_15 * this.anIntArray8901[i_14] + 16383 >> 14;
											this.anIntArray8901[i_14] = i_17;
										}

										if (i_3 != 0) {
											i_15 = Class382.anIntArray4657[i_3];
											i_16 = Class382.anIntArray4661[i_3];
											i_17 = i_16 * this.anIntArray8902[i_14] - i_15 * this.anIntArray8931[i_14] + 16383 >> 14;
											this.anIntArray8931[i_14] = i_15 * this.anIntArray8902[i_14] + i_16 * this.anIntArray8931[i_14] + 16383 >> 14;
											this.anIntArray8902[i_14] = i_17;
										}

										if (i_4 != 0) {
											i_15 = Class382.anIntArray4657[i_4];
											i_16 = Class382.anIntArray4661[i_4];
											i_17 = i_15 * this.anIntArray8931[i_14] + i_16 * this.anIntArray8901[i_14] + 16383 >> 14;
											this.anIntArray8931[i_14] = i_16 * this.anIntArray8931[i_14] - i_15 * this.anIntArray8901[i_14] + 16383 >> 14;
											this.anIntArray8901[i_14] = i_17;
										}

										this.anIntArray8901[i_14] += anInt8932;
										this.anIntArray8902[i_14] += anInt8939;
										this.anIntArray8931[i_14] += anInt8964;
									}
								}
							}
						}

						if (bool_6) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8966.length) {
									ints_47 = this.anIntArrayArray8966[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
											i_15 = this.anIntArray8947[i_14];
											i_16 = this.anIntArray8947[i_14 + 1];

											for (i_17 = i_15; i_17 < i_16; i_17++) {
												i_18 = this.aShortArray8948[i_17] - 1;
												if (i_18 == -1) {
													break;
												}

												if (i_5 != 0) {
													i_19 = Class382.anIntArray4657[i_5];
													i_20 = Class382.anIntArray4661[i_5];
													i_21 = this.aShortArray8933[i_18] * i_19 + this.aShortArray8909[i_18] * i_20 + 16383 >> 14;
													this.aShortArray8933[i_18] = (short) (this.aShortArray8933[i_18] * i_20 - this.aShortArray8909[i_18] * i_19 + 16383 >> 14);
													this.aShortArray8909[i_18] = (short) i_21;
												}

												if (i_3 != 0) {
													i_19 = Class382.anIntArray4657[i_3];
													i_20 = Class382.anIntArray4661[i_3];
													i_21 = this.aShortArray8933[i_18] * i_20 - this.aShortArray8911[i_18] * i_19 + 16383 >> 14;
													this.aShortArray8911[i_18] = (short) (this.aShortArray8933[i_18] * i_19 + this.aShortArray8911[i_18] * i_20 + 16383 >> 14);
													this.aShortArray8933[i_18] = (short) i_21;
												}

												if (i_4 != 0) {
													i_19 = Class382.anIntArray4657[i_4];
													i_20 = Class382.anIntArray4661[i_4];
													i_21 = this.aShortArray8911[i_18] * i_19 + this.aShortArray8909[i_18] * i_20 + 16383 >> 14;
													this.aShortArray8911[i_18] = (short) (this.aShortArray8911[i_18] * i_20 - this.aShortArray8909[i_18] * i_19 + 16383 >> 14);
													this.aShortArray8909[i_18] = (short) i_21;
												}
											}
										}
									}
								}
							}

							this.method14285();
						}
					}
				} else if (i_1 == 3) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8965) {
							i_16 = ints_8[0] * anInt8932 + ints_8[6] * anInt8964 + ints_8[3] * anInt8939 + 8192 >> 14;
							i_17 = ints_8[7] * anInt8964 + ints_8[4] * anInt8939 + ints_8[1] * anInt8932 + 8192 >> 14;
							i_18 = ints_8[8] * anInt8964 + ints_8[2] * anInt8932 + ints_8[5] * anInt8939 + 8192 >> 14;
							i_16 += i_48;
							i_17 += i_14;
							i_18 += i_15;
							anInt8932 = i_16;
							anInt8939 = i_17;
							anInt8964 = i_18;
							aBool8965 = false;
						}

						i_16 = i_3 << 15 >> 7;
						i_17 = i_4 << 15 >> 7;
						i_18 = i_5 << 15 >> 7;
						i_19 = i_16 * -anInt8932 + 8192 >> 14;
						i_20 = i_17 * -anInt8939 + 8192 >> 14;
						i_21 = i_18 * -anInt8964 + 8192 >> 14;
						i_22 = i_19 + anInt8932;
						i_23 = i_20 + anInt8939;
						i_24 = i_21 + anInt8964;
						int[] ints_50 = new int[] { i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, ints_8[7] * i_17 + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, ints_8[5] * i_18 + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14 };
						i_26 = i_16 * i_48 + 8192 >> 14;
						i_27 = i_17 * i_14 + 8192 >> 14;
						i_28 = i_18 * i_15 + 8192 >> 14;
						i_26 += i_22;
						i_27 += i_23;
						i_28 += i_24;
						int[] ints_51 = new int[9];

						int i_52;
						for (i_30 = 0; i_30 < 3; i_30++) {
							for (i_52 = 0; i_52 < 3; i_52++) {
								i_32 = 0;

								for (i_33 = 0; i_33 < 3; i_33++) {
									i_32 += ints_50[i_52 + i_33 * 3] * ints_8[i_33 + i_30 * 3];
								}

								ints_51[i_52 + i_30 * 3] = i_32 + 8192 >> 14;
							}
						}

						i_30 = i_28 * ints_8[2] + i_26 * ints_8[0] + i_27 * ints_8[1] + 8192 >> 14;
						i_52 = i_26 * ints_8[3] + i_27 * ints_8[4] + ints_8[5] * i_28 + 8192 >> 14;
						i_32 = i_26 * ints_8[6] + i_28 * ints_8[8] + ints_8[7] * i_27 + 8192 >> 14;
						i_30 += i_10;
						i_52 += i_11;
						i_32 += i_12;

						for (i_33 = 0; i_33 < i_9; i_33++) {
							i_34 = ints_2[i_33];
							if (i_34 < this.anIntArrayArray8966.length) {
								ints_35 = this.anIntArrayArray8966[i_34];

								for (i_36 = 0; i_36 < ints_35.length; i_36++) {
									i_37 = ints_35[i_36];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_37]) != 0) {
										i_38 = ints_51[0] * this.anIntArray8901[i_37] + ints_51[2] * this.anIntArray8931[i_37] + ints_51[1] * this.anIntArray8902[i_37] + 8192 >> 14;
										i_39 = ints_51[4] * this.anIntArray8902[i_37] + ints_51[5] * this.anIntArray8931[i_37] + ints_51[3] * this.anIntArray8901[i_37] + 8192 >> 14;
										i_40 = ints_51[6] * this.anIntArray8901[i_37] + ints_51[7] * this.anIntArray8902[i_37] + ints_51[8] * this.anIntArray8931[i_37] + 8192 >> 14;
										i_38 += i_30;
										i_39 += i_52;
										i_40 += i_32;
										this.anIntArray8901[i_37] = i_38;
										this.anIntArray8902[i_37] = i_39;
										this.anIntArray8931[i_37] = i_40;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8966.length) {
								ints_47 = this.anIntArrayArray8966[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (this.aShortArray8905 == null || (i_7 & this.aShortArray8905[i_14]) != 0) {
										this.anIntArray8901[i_14] -= anInt8932;
										this.anIntArray8902[i_14] -= anInt8939;
										this.anIntArray8931[i_14] -= anInt8964;
										this.anIntArray8901[i_14] = i_3 * this.anIntArray8901[i_14] >> 7;
										this.anIntArray8902[i_14] = i_4 * this.anIntArray8902[i_14] >> 7;
										this.anIntArray8931[i_14] = i_5 * this.anIntArray8931[i_14] >> 7;
										this.anIntArray8901[i_14] += anInt8932;
										this.anIntArray8902[i_14] += anInt8939;
										this.anIntArray8931[i_14] += anInt8964;
									}
								}
							}
						}
					}
				} else {
					Class65 class65_55;
					boolean bool_56;
					Class56 class56_57;
					if (i_1 == 5) {
						if (this.anIntArrayArray8924 != null) {
							bool_56 = false;

							for (i_11 = 0; i_11 < i_9; i_11++) {
								i_12 = ints_2[i_11];
								if (i_12 < this.anIntArrayArray8924.length) {
									ints_13 = this.anIntArrayArray8924[i_12];

									for (i_14 = 0; i_14 < ints_13.length; i_14++) {
										i_15 = ints_13[i_14];
										if (this.aShortArray8925 == null || (i_7 & this.aShortArray8925[i_15]) != 0) {
											i_16 = (this.aByteArray8900[i_15] & 0xff) + i_3 * 8;
											if (i_16 < 0) {
												i_16 = 0;
											} else if (i_16 > 255) {
												i_16 = 255;
											}

											this.aByteArray8900[i_15] = (byte) i_16;
										}
									}

									bool_56 |= ints_13.length > 0;
								}
							}

							if (bool_56) {
								if (this.aClass56Array8934 != null) {
									for (i_11 = 0; i_11 < this.anInt8951; i_11++) {
										class56_57 = this.aClass56Array8934[i_11];
										class65_55 = this.aClass65Array8953[i_11];
										class65_55.anInt669 = class65_55.anInt669 & 0xffffff | 255 - (this.aByteArray8900[class56_57.anInt518] & 0xff) << 24;
									}
								}

								this.method14269();
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8924 != null) {
							bool_56 = false;

							for (i_11 = 0; i_11 < i_9; i_11++) {
								i_12 = ints_2[i_11];
								if (i_12 < this.anIntArrayArray8924.length) {
									ints_13 = this.anIntArrayArray8924[i_12];

									for (i_14 = 0; i_14 < ints_13.length; i_14++) {
										i_15 = ints_13[i_14];
										if (this.aShortArray8925 == null || (i_7 & this.aShortArray8925[i_15]) != 0) {
											i_16 = this.aShortArray8918[i_15] & 0xffff;
											i_17 = i_16 >> 10 & 0x3f;
											i_18 = i_16 >> 7 & 0x7;
											i_19 = i_16 & 0x7f;
											i_17 = i_3 + i_17 & 0x3f;
											i_18 += i_4 / 4;
											if (i_18 < 0) {
												i_18 = 0;
											} else if (i_18 > 7) {
												i_18 = 7;
											}

											i_19 += i_5;
											if (i_19 < 0) {
												i_19 = 0;
											} else if (i_19 > 127) {
												i_19 = 127;
											}

											this.aShortArray8918[i_15] = (short) (i_17 << 10 | i_18 << 7 | i_19);
										}
									}

									bool_56 |= ints_13.length > 0;
								}
							}

							if (bool_56) {
								if (this.aClass56Array8934 != null) {
									for (i_11 = 0; i_11 < this.anInt8951; i_11++) {
										class56_57 = this.aClass56Array8934[i_11];
										class65_55 = this.aClass65Array8953[i_11];
										class65_55.anInt669 = class65_55.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_57.anInt518] & 0xffff] & 0xffffff;
									}
								}

								this.method14269();
							}
						}
					} else {
						Class65 class65_54;
						if (i_1 == 8) {
							if (this.anIntArrayArray8954 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8954.length) {
										ints_47 = this.anIntArrayArray8954[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class65_54 = this.aClass65Array8953[ints_47[i_48]];
											class65_54.anInt668 += i_3;
											class65_54.anInt672 += i_4;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8954 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8954.length) {
										ints_47 = this.anIntArrayArray8954[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class65_54 = this.aClass65Array8953[ints_47[i_48]];
											class65_54.anInt671 = i_3 * class65_54.anInt671 >> 7;
											class65_54.anInt670 = i_4 * class65_54.anInt670 >> 7;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8954 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8954.length) {
									ints_47 = this.anIntArrayArray8954[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										class65_54 = this.aClass65Array8953[ints_47[i_48]];
										class65_54.anInt673 = i_3 + class65_54.anInt673 & 0x3fff;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public void df(short s_1, short s_2) {
		Interface22 interface22_3 = this.aClass505_Sub2_8917.anInterface22_5834;

		for (int i_4 = 0; i_4 < this.anInt8916 * 3 * -1431655765; i_4++) {
			if (this.aShortArray8923[i_4] == s_1) {
				this.aShortArray8923[i_4] = s_2;
			}
		}

		byte b_13 = 0;
		byte b_5 = 0;
		if (s_1 != -1) {
			Class169 class169_6 = interface22_3.method144(s_1 & 0xffff, -2057176573);
			b_13 = class169_6.aByte2079;
			b_5 = class169_6.aByte2080;
		}

		byte b_11 = 0;
		byte b_7 = 0;
		if (s_2 != -1) {
			Class169 class169_8 = interface22_3.method144(s_2 & 0xffff, -2063275771);
			b_11 = class169_8.aByte2079;
			b_7 = class169_8.aByte2080;
			if (class169_8.aByte2081 != 0 || class169_8.aByte2090 != 0) {
				this.aBool8903 = true;
			}
		}

		if (b_13 != b_11 | b_5 != b_7) {
			if (this.aClass56Array8934 != null) {
				for (int i_12 = 0; i_12 < this.anInt8951; i_12++) {
					Class56 class56_9 = this.aClass56Array8934[i_12];
					Class65 class65_10 = this.aClass65Array8953[i_12];
					class65_10.anInt669 = class65_10.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_9.anInt518] & 0xffff] & 0xffffff;
				}
			}

			this.method14269();
		}

	}

	public boolean dv() {
		return this.aBool8959;
	}

	void method11308() {
	}

	void method11301() {
	}

	public void wa() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8910; i_1++) {
			this.anIntArray8931[i_1] = -this.anIntArray8931[i_1];
		}

		for (i_1 = 0; i_1 < this.anInt8906; i_1++) {
			this.aShortArray8911[i_1] = (short) (-this.aShortArray8911[i_1]);
		}

		for (i_1 = 0; i_1 < this.anInt8916; i_1++) {
			short s_2 = this.aShortArray8920[i_1];
			this.aShortArray8920[i_1] = this.aShortArray8922[i_1];
			this.aShortArray8922[i_1] = s_2;
		}

		this.method14268();
		this.method14285();
		this.method14270();
		this.aBool8937 = false;
	}

	public boolean method11286(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		Matrix44Arr matrix44arr_6 = this.aClass505_Sub2_8917.aClass384_8683;
		matrix44arr_6.fromVarMatrix44(matrix44var_3);
		matrix44arr_6.method6523(this.aClass505_Sub2_8917.aClass384_8728);
		boolean bool_7 = false;
		float f_8 = Float.MAX_VALUE;
		float f_9 = -3.4028235E38F;
		float f_10 = Float.MAX_VALUE;
		float f_11 = -3.4028235E38F;
		if (!this.aBool8937) {
			this.method14281();
		}

		int i_12 = this.anInt8941 - this.anInt8940 >> 1;
		int i_13 = this.anInt8893 - this.anInt8908 >> 1;
		int i_14 = this.anInt8943 - this.anInt8942 >> 1;
		int i_15 = this.anInt8940 + i_12;
		int i_16 = this.anInt8908 + i_13;
		int i_17 = this.anInt8942 + i_14;
		int i_18 = i_15 - (i_12 << i_5);
		int i_19 = i_16 - (i_13 << i_5);
		int i_20 = i_17 - (i_14 << i_5);
		int i_21 = i_15 + (i_12 << i_5);
		int i_22 = i_16 + (i_13 << i_5);
		int i_23 = i_17 + (i_14 << i_5);
		anIntArray8894[0] = i_18;
		anIntArray8960[0] = i_19;
		anIntArray8961[0] = i_20;
		anIntArray8894[1] = i_21;
		anIntArray8960[1] = i_19;
		anIntArray8961[1] = i_20;
		anIntArray8894[2] = i_18;
		anIntArray8960[2] = i_22;
		anIntArray8961[2] = i_20;
		anIntArray8894[3] = i_21;
		anIntArray8960[3] = i_22;
		anIntArray8961[3] = i_20;
		anIntArray8894[4] = i_18;
		anIntArray8960[4] = i_19;
		anIntArray8961[4] = i_23;
		anIntArray8894[5] = i_21;
		anIntArray8960[5] = i_19;
		anIntArray8961[5] = i_23;
		anIntArray8894[6] = i_18;
		anIntArray8960[6] = i_22;
		anIntArray8961[6] = i_23;
		anIntArray8894[7] = i_21;
		anIntArray8960[7] = i_22;
		anIntArray8961[7] = i_23;

		int i_24;
		float f_25;
		float f_26;
		float f_27;
		float f_28;
		float f_29;
		float f_30;
		float f_31;
		for (i_24 = 0; i_24 < 8; i_24++) {
			f_25 = (float) anIntArray8894[i_24];
			f_26 = (float) anIntArray8960[i_24];
			f_27 = (float) anIntArray8961[i_24];
			f_28 = matrix44arr_6.buf[2] * f_25 + matrix44arr_6.buf[6] * f_26 + matrix44arr_6.buf[10] * f_27 + matrix44arr_6.buf[14];
			f_29 = matrix44arr_6.buf[3] * f_25 + matrix44arr_6.buf[7] * f_26 + matrix44arr_6.buf[11] * f_27 + matrix44arr_6.buf[15];
			if (f_28 >= -f_29) {
				f_30 = matrix44arr_6.buf[0] * f_25 + matrix44arr_6.buf[4] * f_26 + matrix44arr_6.buf[8] * f_27 + matrix44arr_6.buf[12];
				f_31 = matrix44arr_6.buf[1] * f_25 + matrix44arr_6.buf[5] * f_26 + matrix44arr_6.buf[9] * f_27 + matrix44arr_6.buf[13];
				float f_32 = this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_29;
				float f_33 = this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_29;
				if (f_32 < f_8) {
					f_8 = f_32;
				}

				if (f_32 > f_9) {
					f_9 = f_32;
				}

				if (f_33 < f_10) {
					f_10 = f_33;
				}

				if (f_33 > f_11) {
					f_11 = f_33;
				}

				bool_7 = true;
			}
		}

		if (bool_7 && (float) i_1 > f_8 && (float) i_1 < f_9 && (float) i_2 > f_10 && (float) i_2 < f_11) {
			if (bool_4) {
				return true;
			}

			if (anIntArray8928.length < this.anInt8906) {
				anIntArray8928 = new int[this.anInt8906];
				anIntArray8958 = new int[this.anInt8906];
			}

			for (i_24 = 0; i_24 < this.anInt8910; i_24++) {
				f_25 = (float) this.anIntArray8901[i_24];
				f_26 = (float) this.anIntArray8902[i_24];
				f_27 = (float) this.anIntArray8931[i_24];
				f_28 = matrix44arr_6.buf[2] * f_25 + matrix44arr_6.buf[6] * f_26 + matrix44arr_6.buf[10] * f_27 + matrix44arr_6.buf[14];
				f_29 = matrix44arr_6.buf[3] * f_25 + matrix44arr_6.buf[7] * f_26 + matrix44arr_6.buf[11] * f_27 + matrix44arr_6.buf[15];
				int i_38;
				int i_39;
				if (f_28 >= -f_29) {
					f_30 = matrix44arr_6.buf[0] * f_25 + matrix44arr_6.buf[4] * f_26 + matrix44arr_6.buf[8] * f_27 + matrix44arr_6.buf[12];
					f_31 = matrix44arr_6.buf[1] * f_25 + matrix44arr_6.buf[5] * f_26 + matrix44arr_6.buf[9] * f_27 + matrix44arr_6.buf[13];
					i_38 = this.anIntArray8947[i_24];
					i_39 = this.anIntArray8947[i_24 + 1];

					for (int i_34 = i_38; i_34 < i_39; i_34++) {
						int i_35 = this.aShortArray8948[i_34] - 1;
						if (i_35 == -1) {
							break;
						}

						anIntArray8928[i_35] = (int) (this.aClass505_Sub2_8917.aFloat8797 + this.aClass505_Sub2_8917.aFloat8732 * f_30 / f_29);
						anIntArray8958[i_35] = (int) (this.aClass505_Sub2_8917.aFloat8741 + this.aClass505_Sub2_8917.aFloat8734 * f_31 / f_29);
					}
				} else {
					int i_36 = this.anIntArray8947[i_24];
					int i_37 = this.anIntArray8947[i_24 + 1];

					for (i_38 = i_36; i_38 < i_37; i_38++) {
						i_39 = this.aShortArray8948[i_38] - 1;
						if (i_39 == -1) {
							break;
						}

						anIntArray8928[this.aShortArray8948[i_38] - 1] = -999999;
					}
				}
			}

			for (i_24 = 0; i_24 < this.anInt8916 * 3 * -1431655765; i_24++) {
				if (anIntArray8928[this.aShortArray8920[i_24]] != -999999 && anIntArray8928[this.aShortArray8921[i_24]] != -999999 && anIntArray8928[this.aShortArray8922[i_24]] != -999999 && this.method14276(i_1, i_2, anIntArray8958[this.aShortArray8920[i_24]], anIntArray8958[this.aShortArray8921[i_24]], anIntArray8958[this.aShortArray8922[i_24]], anIntArray8928[this.aShortArray8920[i_24]], anIntArray8928[this.aShortArray8921[i_24]], anIntArray8928[this.aShortArray8922[i_24]])) {
					return true;
				}
			}
		}

		return false;
	}

	public Shadow dn(Shadow class282_sub50_sub17_1) {
		if (this.anInt8906 == 0) {
			return null;
		} else {
			if (!this.aBool8937) {
				this.method14281();
			}

			int i_2;
			int i_3;
			if (this.aClass505_Sub2_8917.anInt8777 > 0) {
				i_2 = this.anInt8940 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_2 = this.anInt8940 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_4;
			int i_5;
			if (this.aClass505_Sub2_8917.anInt8778 > 0) {
				i_4 = this.anInt8942 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_4 = this.anInt8942 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_6 = i_3 - i_2 + 1;
			int i_7 = i_5 - i_4 + 1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_8 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_9;
			if (class282_sub50_sub17_sub2_8 != null && class282_sub50_sub17_sub2_8.method16039(i_6, i_7)) {
				class282_sub50_sub17_sub2_9 = class282_sub50_sub17_sub2_8;
				class282_sub50_sub17_sub2_8.method16042();
			} else {
				class282_sub50_sub17_sub2_9 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8917, i_6, i_7);
			}

			class282_sub50_sub17_sub2_9.method16040(i_2, i_4, i_3, i_5);
			this.method14277(class282_sub50_sub17_sub2_9);
			return class282_sub50_sub17_sub2_9;
		}
	}

	public int ct() {
		if (!this.aBool8937) {
			this.method14281();
		}

		return this.anInt8941;
	}

	public Shadow dw(Shadow class282_sub50_sub17_1) {
		if (this.anInt8906 == 0) {
			return null;
		} else {
			if (!this.aBool8937) {
				this.method14281();
			}

			int i_2;
			int i_3;
			if (this.aClass505_Sub2_8917.anInt8777 > 0) {
				i_2 = this.anInt8940 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_2 = this.anInt8940 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_4;
			int i_5;
			if (this.aClass505_Sub2_8917.anInt8778 > 0) {
				i_4 = this.anInt8942 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_4 = this.anInt8942 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_6 = i_3 - i_2 + 1;
			int i_7 = i_5 - i_4 + 1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_8 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_9;
			if (class282_sub50_sub17_sub2_8 != null && class282_sub50_sub17_sub2_8.method16039(i_6, i_7)) {
				class282_sub50_sub17_sub2_9 = class282_sub50_sub17_sub2_8;
				class282_sub50_sub17_sub2_8.method16042();
			} else {
				class282_sub50_sub17_sub2_9 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8917, i_6, i_7);
			}

			class282_sub50_sub17_sub2_9.method16040(i_2, i_4, i_3, i_5);
			this.method14277(class282_sub50_sub17_sub2_9);
			return class282_sub50_sub17_sub2_9;
		}
	}

	public Shadow dr(Shadow class282_sub50_sub17_1) {
		if (this.anInt8906 == 0) {
			return null;
		} else {
			if (!this.aBool8937) {
				this.method14281();
			}

			int i_2;
			int i_3;
			if (this.aClass505_Sub2_8917.anInt8777 > 0) {
				i_2 = this.anInt8940 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_2 = this.anInt8940 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_4;
			int i_5;
			if (this.aClass505_Sub2_8917.anInt8778 > 0) {
				i_4 = this.anInt8942 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_4 = this.anInt8942 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_6 = i_3 - i_2 + 1;
			int i_7 = i_5 - i_4 + 1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_8 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_9;
			if (class282_sub50_sub17_sub2_8 != null && class282_sub50_sub17_sub2_8.method16039(i_6, i_7)) {
				class282_sub50_sub17_sub2_9 = class282_sub50_sub17_sub2_8;
				class282_sub50_sub17_sub2_8.method16042();
			} else {
				class282_sub50_sub17_sub2_9 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8917, i_6, i_7);
			}

			class282_sub50_sub17_sub2_9.method16040(i_2, i_4, i_3, i_5);
			this.method14277(class282_sub50_sub17_sub2_9);
			return class282_sub50_sub17_sub2_9;
		}
	}

	public int dq() {
		return this.aShort8897;
	}

	public void ep(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.anInt8910; i_4++) {
			if (i_1 != 128) {
				this.anIntArray8901[i_4] = this.anIntArray8901[i_4] * i_1 >> 7;
			}

			if (i_2 != 128) {
				this.anIntArray8902[i_4] = this.anIntArray8902[i_4] * i_2 >> 7;
			}

			if (i_3 != 128) {
				this.anIntArray8931[i_4] = this.anIntArray8931[i_4] * i_3 >> 7;
			}
		}

		this.method14268();
		this.aBool8937 = false;
	}

	public byte[] cz() {
		return this.aByteArray8900;
	}

	public void method11299(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class528_Sub3 class528_sub3_6 = (Class528_Sub3) meshrasterizer_1;
		if (this.anInt8916 * 3 * -1431655765 != 0 && class528_sub3_6.anInt8916 * 3 * -1431655765 != 0) {
			int i_7 = class528_sub3_6.anInt8910;
			int[] ints_8 = class528_sub3_6.anIntArray8901;
			int[] ints_9 = class528_sub3_6.anIntArray8902;
			int[] ints_10 = class528_sub3_6.anIntArray8931;
			short[] shorts_11 = class528_sub3_6.aShortArray8909;
			short[] shorts_12 = class528_sub3_6.aShortArray8933;
			short[] shorts_13 = class528_sub3_6.aShortArray8911;
			byte[] bytes_14 = class528_sub3_6.aByteArray8912;
			short[] shorts_15;
			short[] shorts_16;
			short[] shorts_17;
			byte[] bytes_18;
			if (this.aClass355_8962 != null) {
				shorts_15 = this.aClass355_8962.aShortArray4115;
				shorts_16 = this.aClass355_8962.aShortArray4114;
				shorts_17 = this.aClass355_8962.aShortArray4113;
				bytes_18 = this.aClass355_8962.aByteArray4116;
			} else {
				shorts_15 = null;
				shorts_16 = null;
				shorts_17 = null;
				bytes_18 = null;
			}

			short[] shorts_19;
			short[] shorts_20;
			short[] shorts_21;
			byte[] bytes_22;
			if (class528_sub3_6.aClass355_8962 != null) {
				shorts_19 = class528_sub3_6.aClass355_8962.aShortArray4115;
				shorts_20 = class528_sub3_6.aClass355_8962.aShortArray4114;
				shorts_21 = class528_sub3_6.aClass355_8962.aShortArray4113;
				bytes_22 = class528_sub3_6.aClass355_8962.aByteArray4116;
			} else {
				shorts_19 = null;
				shorts_20 = null;
				shorts_21 = null;
				bytes_22 = null;
			}

			int[] ints_23 = class528_sub3_6.anIntArray8947;
			short[] shorts_24 = class528_sub3_6.aShortArray8948;
			if (!class528_sub3_6.aBool8937) {
				class528_sub3_6.method14281();
			}

			int i_25 = class528_sub3_6.anInt8908;
			int i_26 = class528_sub3_6.anInt8893;
			int i_27 = class528_sub3_6.anInt8940;
			int i_28 = class528_sub3_6.anInt8941;
			int i_29 = class528_sub3_6.anInt8942;
			int i_30 = class528_sub3_6.anInt8943;

			for (int i_31 = 0; i_31 < this.anInt8910; i_31++) {
				int i_32 = this.anIntArray8902[i_31] - i_3;
				if (i_32 >= i_25 && i_32 <= i_26) {
					int i_33 = this.anIntArray8901[i_31] - i_2;
					if (i_33 >= i_27 && i_33 <= i_28) {
						int i_34 = this.anIntArray8931[i_31] - i_4;
						if (i_34 >= i_29 && i_34 <= i_30) {
							int i_35 = -1;
							int i_36 = this.anIntArray8947[i_31];
							int i_37 = this.anIntArray8947[i_31 + 1];

							int i_38;
							for (i_38 = i_36; i_38 < i_37; i_38++) {
								i_35 = this.aShortArray8948[i_38] - 1;
								if (i_35 == -1 || this.aByteArray8912[i_35] != 0) {
									break;
								}
							}

							if (i_35 != -1) {
								for (i_38 = 0; i_38 < i_7; i_38++) {
									if (i_33 == ints_8[i_38] && i_34 == ints_10[i_38] && i_32 == ints_9[i_38]) {
										int i_39 = -1;
										i_36 = ints_23[i_38];
										i_37 = ints_23[i_38 + 1];

										for (int i_40 = i_36; i_40 < i_37; i_40++) {
											i_39 = shorts_24[i_40] - 1;
											if (i_39 == -1 || bytes_14[i_39] != 0) {
												break;
											}
										}

										if (i_39 != -1) {
											if (shorts_15 == null) {
												this.aClass355_8962 = new Class355();
												shorts_15 = this.aClass355_8962.aShortArray4115 = Class512.method8761(this.aShortArray8909, 699880567);
												shorts_16 = this.aClass355_8962.aShortArray4114 = Class512.method8761(this.aShortArray8933, 1983225125);
												shorts_17 = this.aClass355_8962.aShortArray4113 = Class512.method8761(this.aShortArray8911, 1609951623);
												bytes_18 = this.aClass355_8962.aByteArray4116 = AnimationFrameSet.method15090(this.aByteArray8912, -2147189615);
											}

											if (shorts_19 == null) {
												Class355 class355_46 = class528_sub3_6.aClass355_8962 = new Class355();
												shorts_19 = class355_46.aShortArray4115 = Class512.method8761(shorts_11, -162528355);
												shorts_20 = class355_46.aShortArray4114 = Class512.method8761(shorts_12, -466639398);
												shorts_21 = class355_46.aShortArray4113 = Class512.method8761(shorts_13, -502250628);
												bytes_22 = class355_46.aByteArray4116 = AnimationFrameSet.method15090(bytes_14, -2134425269);
											}

											short s_47 = this.aShortArray8909[i_35];
											short s_41 = this.aShortArray8933[i_35];
											short s_42 = this.aShortArray8911[i_35];
											byte b_43 = this.aByteArray8912[i_35];
											i_36 = ints_23[i_38];
											i_37 = ints_23[i_38 + 1];

											int i_44;
											int i_45;
											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = shorts_24[i_44] - 1;
												if (i_45 == -1) {
													break;
												}

												if (bytes_22[i_45] != 0) {
													shorts_19[i_45] += s_47;
													shorts_20[i_45] += s_41;
													shorts_21[i_45] += s_42;
													bytes_22[i_45] += b_43;
												}
											}

											s_47 = shorts_11[i_39];
											s_41 = shorts_12[i_39];
											s_42 = shorts_13[i_39];
											b_43 = bytes_14[i_39];
											i_36 = this.anIntArray8947[i_31];
											i_37 = this.anIntArray8947[i_31 + 1];

											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = this.aShortArray8948[i_44] - 1;
												if (i_45 == -1) {
													break;
												}

												if (bytes_18[i_45] != 0) {
													shorts_15[i_45] += s_47;
													shorts_16[i_45] += s_41;
													shorts_17[i_45] += s_42;
													bytes_18[i_45] += b_43;
												}
											}

											class528_sub3_6.method14285();
											this.method14285();
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

	public void PA(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		for (i_5 = 0; i_5 < this.anInt8916; i_5++) {
			int i_6 = this.aShortArray8918[i_5] & 0xffff;
			int i_7 = i_6 >> 10 & 0x3f;
			int i_8 = i_6 >> 7 & 0x7;
			int i_9 = i_6 & 0x7f;
			if (i_1 != -1) {
				i_7 += (i_1 - i_7) * i_4 >> 7;
			}

			if (i_2 != -1) {
				i_8 += i_4 * (i_2 - i_8) >> 7;
			}

			if (i_3 != -1) {
				i_9 += (i_3 - i_9) * i_4 >> 7;
			}

			this.aShortArray8918[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
		}

		if (this.aClass56Array8934 != null) {
			for (i_5 = 0; i_5 < this.anInt8951; i_5++) {
				Class56 class56_10 = this.aClass56Array8934[i_5];
				Class65 class65_11 = this.aClass65Array8953[i_5];
				class65_11.anInt669 = class65_11.anInt669 & ~0xffffff | Class540.anIntArray7136[this.aShortArray8918[class56_10.anInt518] & 0xffff] & 0xffffff;
			}
		}

		this.method14269();
	}

	void method11261() {
	}

	static short[] method14311(short[] shorts_0, int i_1) {
		short[] shorts_2 = new short[i_1];
		System.arraycopy(shorts_0, 0, shorts_2, 0, i_1);
		return shorts_2;
	}

	public Shadow da(Shadow class282_sub50_sub17_1) {
		if (this.anInt8906 == 0) {
			return null;
		} else {
			if (!this.aBool8937) {
				this.method14281();
			}

			int i_2;
			int i_3;
			if (this.aClass505_Sub2_8917.anInt8777 > 0) {
				i_2 = this.anInt8940 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_2 = this.anInt8940 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_3 = this.anInt8941 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8777 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_4;
			int i_5;
			if (this.aClass505_Sub2_8917.anInt8778 > 0) {
				i_4 = this.anInt8942 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			} else {
				i_4 = this.anInt8942 - (this.anInt8908 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
				i_5 = this.anInt8943 - (this.anInt8893 * this.aClass505_Sub2_8917.anInt8778 >> 8) >> this.aClass505_Sub2_8917.anInt8806 * -1431655765 * 3 * -1431655765 * 3;
			}

			int i_6 = i_3 - i_2 + 1;
			int i_7 = i_5 - i_4 + 1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_8 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_1;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_9;
			if (class282_sub50_sub17_sub2_8 != null && class282_sub50_sub17_sub2_8.method16039(i_6, i_7)) {
				class282_sub50_sub17_sub2_9 = class282_sub50_sub17_sub2_8;
				class282_sub50_sub17_sub2_8.method16042();
			} else {
				class282_sub50_sub17_sub2_9 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8917, i_6, i_7);
			}

			class282_sub50_sub17_sub2_9.method16040(i_2, i_4, i_3, i_5);
			this.method14277(class282_sub50_sub17_sub2_9);
			return class282_sub50_sub17_sub2_9;
		}
	}

	public void be() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8910; i_1++) {
			this.anIntArray8931[i_1] = -this.anIntArray8931[i_1];
		}

		for (i_1 = 0; i_1 < this.anInt8906; i_1++) {
			this.aShortArray8911[i_1] = (short) (-this.aShortArray8911[i_1]);
		}

		for (i_1 = 0; i_1 < this.anInt8916 * 3 * -1431655765; i_1++) {
			short s_2 = this.aShortArray8920[i_1];
			this.aShortArray8920[i_1] = this.aShortArray8922[i_1];
			this.aShortArray8922[i_1] = s_2;
		}

		this.method14268();
		this.method14285();
		this.method14270();
		this.aBool8937 = false;
	}

}
