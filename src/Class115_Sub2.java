
/* Class115_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class115_Sub2 extends Class115 {
	static int[] anIntArray9417;
	static final int anInt9418 = 35632;
	Class505_Sub2_Sub1 aClass505_Sub2_Sub1_9419;
	static final int anInt9420 = 35633;
	Class101_Sub1 aClass101_Sub1_9421;
	float[] aFloatArray9422;
	int anInt9423 = 0;
	int anInt9424;
	boolean aBool9425;
	int[] anIntArray9426;
	static float[] aFloatArray9427;
	static final int anInt9428 = 13;
	float[] aFloatArray9429;
	String aString9430;
	float[] aFloatArray9431;
	float[] aFloatArray9432;
	int[] anIntArray9433;
	String aString9434;
	int anInt9435 = 0;
	static boolean $assertionsDisabled = !Class115_Sub2.class.desiredAssertionStatus();

	void method1928(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		int i_0_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_0_ != -1) {
			if (interface30 == null)
				interface30 = (((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInterface6_8788);
			if (i < ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInt8825) {
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i);
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class319) (Class319) interface30).anInt3707), (((Class319) (Class319) interface30).anInt3706));
			}
			if (((Class115_Sub2) this).anIntArray9433[i_0_] != i) {
				((Class115_Sub2) this).anIntArray9433[i_0_] = i;
				OpenGL.glUniform1i(i_0_, i);
			}
		}
	}

	Class115_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1, Class99 class99) {
		((Class115_Sub2) this).anInt9424 = 0;
		((Class115_Sub2) this).aBool9425 = false;
		((Class115_Sub2) this).anIntArray9426 = new int[13];
		aString1245 = class99.aString1003;
		StringBuilder stringbuilder = new StringBuilder();
		if (class99.aString1001 != null) {
			aString1244 = class99.aString1001;
			if (class99.aClass121Array1000 != null) {
				Class121[] class121s = class99.aClass121Array1000;
				for (int i = 0; i < class121s.length; i++) {
					Class121 class121 = class121s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class121.aString1524).append(" ").append(class121.aString1523).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class505_sub2_sub1.method15579(aString1244)));
			((Class115_Sub2) this).aString9434 = stringbuilder.toString();
		}
		if (class99.aString1002 != null) {
			aString1246 = class99.aString1002;
			stringbuilder.setLength(0);
			if (class99.aClass121Array1004 != null) {
				Class121[] class121s = class99.aClass121Array1004;
				for (int i = 0; i < class121s.length; i++) {
					Class121 class121 = class121s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class121.aString1524).append(" ").append(class121.aString1523).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class505_sub2_sub1.method15579(aString1246)));
			((Class115_Sub2) this).aString9430 = stringbuilder.toString();
		}
		Class503.method8365(((Class115_Sub2) this).anIntArray9426, 0, ((Class115_Sub2) this).anIntArray9426.length, -1);
	}

	int method14670(int i, String string, String string_1_) {
		if (string == null)
			return 0;
		int i_2_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_2_, string);
		OpenGL.glCompileShader(i_2_);
		OpenGL.glGetShaderiv(i_2_, 35713, anIntArray9417, 0);
		if (anIntArray9417[0] == 0) {
			OpenGL.glDeleteShader(i_2_);
			i_2_ = 0;
		}
		return i_2_;
	}

	int method14671(int i, String string, String string_3_) {
		if (string == null)
			return 0;
		int i_4_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_4_, string);
		OpenGL.glCompileShader(i_4_);
		OpenGL.glGetShaderiv(i_4_, 35713, anIntArray9417, 0);
		if (anIntArray9417[0] == 0) {
			OpenGL.glDeleteShader(i_4_);
			i_4_ = 0;
		}
		return i_4_;
	}

	void method1894(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				if ((class282_sub21_sub1.method15457((byte) 94) != Class111.aClass111_1219) && (class282_sub21_sub1.method15457((byte) 73) != Class111.aClass111_1182))
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method1923(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_5_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_5_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_5_;
				if (class282_sub21_sub1.method15457((byte) 21) != Class111.aClass111_1132)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform2f(i, f, f_5_);
			}
		}
	}

	void method1939(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_6_, float f_7_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_6_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_7_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_6_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_7_;
				if (class282_sub21_sub1.method15457((byte) 99) != Class111.aClass111_1133)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform3f(i, f, f_6_, f_7_);
			}
		}
	}

	void method1944(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_8_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_8_ != -1)
			OpenGL.glUniform4fv(i_8_, i, fs, 0);
	}

	void method1903(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_9_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_9_ != -1)
			OpenGL.glUniform4fv(i_9_, i, fs, 0);
	}

	void method1936(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		if (!$assertionsDisabled && (class282_sub21_sub1.method15457((byte) 19) != Class111.aClass111_1168))
			throw new AssertionError();
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class384.method6551(aFloatArray9427), 0);
	}

	void method1891(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		if (!$assertionsDisabled && (class282_sub21_sub1.method15457((byte) 98) != Class111.aClass111_1150))
			throw new AssertionError();
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class384.method6517(aFloatArray9427), 0);
	}

	void method1896(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		int i_10_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_10_ != -1) {
			if (interface30 == null)
				interface30 = (((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInterface6_8788);
			if (i < ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInt8825) {
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i);
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class319) (Class319) interface30).anInt3707), (((Class319) (Class319) interface30).anInt3706));
			}
			if (((Class115_Sub2) this).anIntArray9433[i_10_] != i) {
				((Class115_Sub2) this).anIntArray9433[i_10_] = i;
				OpenGL.glUniform1i(i_10_, i);
			}
		}
	}

	void method1893(int i, float f, float f_11_, float f_12_) {
		OpenGL.glUniform3f(i, f, f_11_, f_12_);
	}

	void method1895(int i, float f, float f_13_, float f_14_, float f_15_) {
		OpenGL.glUniform4f(i, f, f_13_, f_14_, f_15_);
	}

	void method1897(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_16_, float f_17_, float f_18_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_16_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_17_ || ((Class115_Sub2) this).aFloatArray9432[i] != f_18_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_16_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_17_;
				((Class115_Sub2) this).aFloatArray9432[i] = f_18_;
				if (class282_sub21_sub1.method15457((byte) 46) != Class111.aClass111_1134)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform4f(i, f, f_16_, f_17_, f_18_);
			}
		}
	}

	void method1905(int i, Class384 class384) {
		OpenGL.glUniform3fv(i, 3, class384.method6544(aFloatArray9427), 0);
	}

	void method1906(int i, Class384 class384) {
		OpenGL.glUniform2fv(i, 4, class384.method6551(aFloatArray9427), 0);
	}

	void method1900(int i, Class384 class384) {
		OpenGL.glUniform4fv(i, 4, class384.method6517(aFloatArray9427), 0);
	}

	void method1927(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		if (!$assertionsDisabled && (class282_sub21_sub1.method15457((byte) 94) != Class111.aClass111_1150))
			throw new AssertionError();
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class384.method6517(aFloatArray9427), 0);
	}

	void method1938(int i, float[] fs, int i_19_) {
		OpenGL.glUniform4fv(i, i_19_, fs, 0);
	}

	public void finalize() {
		method26();
	}

	static {
		anIntArray9417 = new int[2];
		aFloatArray9427 = new float[16];
	}

	public void method32() {
		if (((Class115_Sub2) this).anInt9423 != 0) {
			((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method15573(((Class115_Sub2) this).anInt9423);
			if (((Class115_Sub2) this).anInt9435 != 0)
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method15580((long) ((Class115_Sub2) this).anInt9435);
			if (((Class115_Sub2) this).anInt9424 != 0)
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method15580((long) ((Class115_Sub2) this).anInt9424);
			((Class115_Sub2) this).anInt9423 = 0;
			((Class115_Sub2) this).anInt9435 = 0;
			((Class115_Sub2) this).anInt9424 = 0;
		}
	}

	void method1945(int i, int i_20_, Interface30 interface30) {
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i_20_);
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
		OpenGL.glUniform1i(i, i_20_);
	}

	void method14672() {
		method26();
	}

	public boolean method1898() {
		if (((Class115_Sub2) this).aBool9425)
			return true;
		((Class505_Sub2_Sub1) ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419).aClass115_Sub2_10189 = null;
		((Class115_Sub2) this).anInt9435 = method14671(35633, ((Class115_Sub2) this).aString9434, aString1244);
		((Class115_Sub2) this).anInt9424 = method14671(35632, ((Class115_Sub2) this).aString9430, aString1246);
		if (((Class115_Sub2) this).anInt9435 == 0 || ((Class115_Sub2) this).anInt9424 == 0) {
			if (((Class115_Sub2) this).anInt9435 != 0)
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9435);
			if (((Class115_Sub2) this).anInt9424 != 0)
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9424);
			return false;
		}
		((Class115_Sub2) this).anInt9423 = OpenGL.glCreateProgram();
		if (((Class115_Sub2) this).anInt9435 != 0)
			OpenGL.glAttachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9435);
		if (((Class115_Sub2) this).anInt9424 != 0)
			OpenGL.glAttachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9424);
		OpenGL.glLinkProgram(((Class115_Sub2) this).anInt9423);
		OpenGL.glGetProgramiv(((Class115_Sub2) this).anInt9423, 35714, anIntArray9417, 0);
		if (anIntArray9417[0] == 0) {
			if (((Class115_Sub2) this).anInt9435 != 0) {
				OpenGL.glDetachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9435);
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9435);
			}
			if (((Class115_Sub2) this).anInt9424 != 0) {
				OpenGL.glDetachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9424);
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9424);
			}
			OpenGL.glDeleteProgram(((Class115_Sub2) this).anInt9423);
			return false;
		}
		OpenGL.glUseProgram(((Class115_Sub2) this).anInt9423);
		int i = -1;
		for (int i_21_ = 0; i_21_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1650(656920593); i_21_++) {
			if (((Class115_Sub2) this).aClass101_Sub1_9421.method1652(i_21_, (byte) 43) == this) {
				i = i_21_;
				break;
			}
		}
		if (i == -1)
			return false;
		int i_22_ = 0;
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1682(508450289); i_24_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub2) this).aClass101_Sub1_9421.method1742(i_24_, 618345574);
			if (class282_sub21_sub1 != null) {
				class282_sub21_sub1.method15471(i);
				Class111 class111 = class282_sub21_sub1.method15457((byte) 111);
				int i_25_ = (((Class282_Sub21_Sub1_Sub2) (Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).anIntArray10308[i]);
				if (class111 == Class111.aClass111_1219 || class111 == Class111.aClass111_1182 || class111 == Class111.aClass111_1132 || class111 == Class111.aClass111_1133 || class111 == Class111.aClass111_1134)
					i_22_ = Math.max(i_25_, i_22_);
				else
					i_23_ = Math.max(i_25_, i_23_);
			}
		}
		for (int i_26_ = 0; i_26_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1679(381488614); i_26_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub2) this).aClass101_Sub1_9421.method1705(i_26_, 2049312181);
			if (class282_sub21_sub1 != null) {
				class282_sub21_sub1.method15471(i);
				Class111 class111 = class282_sub21_sub1.method15457((byte) 93);
				int i_27_ = (((Class282_Sub21_Sub1_Sub2) (Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).anIntArray10308[i]);
				if (class111 == Class111.aClass111_1219 || class111 == Class111.aClass111_1182 || class111 == Class111.aClass111_1132 || class111 == Class111.aClass111_1133 || class111 == Class111.aClass111_1134)
					i_22_ = Math.max(i_27_, i_22_);
				else
					i_23_ = Math.max(i_27_, i_23_);
			}
		}
		((Class115_Sub2) this).aFloatArray9429 = new float[i_22_ + 1];
		((Class115_Sub2) this).aFloatArray9422 = new float[i_22_ + 1];
		((Class115_Sub2) this).aFloatArray9431 = new float[i_22_ + 1];
		((Class115_Sub2) this).aFloatArray9432 = new float[i_22_ + 1];
		((Class115_Sub2) this).anIntArray9433 = new int[i_23_ + 1];
		for (int i_28_ = 0; i_28_ < ((Class115_Sub2) this).anIntArray9433.length; i_28_++)
			((Class115_Sub2) this).anIntArray9433[i_28_] = -1;
		((Class115_Sub2) this).aString9434 = null;
		((Class115_Sub2) this).aString9430 = null;
		((Class115_Sub2) this).aBool9425 = true;
		return true;
	}

	void method1901(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_29_, float f_30_, float f_31_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_29_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_30_ || ((Class115_Sub2) this).aFloatArray9432[i] != f_31_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_29_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_30_;
				((Class115_Sub2) this).aFloatArray9432[i] = f_31_;
				if (class282_sub21_sub1.method15457((byte) 39) != Class111.aClass111_1134)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform4f(i, f, f_29_, f_30_, f_31_);
			}
		}
	}

	void method1912(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				if ((class282_sub21_sub1.method15457((byte) 104) != Class111.aClass111_1219) && (class282_sub21_sub1.method15457((byte) 20) != Class111.aClass111_1182))
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method1913(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_32_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_32_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_32_;
				if (class282_sub21_sub1.method15457((byte) 91) != Class111.aClass111_1132)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform2f(i, f, f_32_);
			}
		}
	}

	void method1914(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_33_, float f_34_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_33_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_34_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_33_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_34_;
				if (class282_sub21_sub1.method15457((byte) 25) != Class111.aClass111_1133)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform3f(i, f, f_33_, f_34_);
			}
		}
	}

	void method1915(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_35_, float f_36_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_35_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_36_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_35_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_36_;
				if (class282_sub21_sub1.method15457((byte) 86) != Class111.aClass111_1133)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform3f(i, f, f_35_, f_36_);
			}
		}
	}

	void method1916(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_37_, float f_38_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_37_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_38_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_37_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_38_;
				if (class282_sub21_sub1.method15457((byte) 50) != Class111.aClass111_1133)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform3f(i, f, f_37_, f_38_);
			}
		}
	}

	void method1937(int i, float[] fs, int i_39_) {
		OpenGL.glUniform4fv(i, i_39_, fs, 0);
	}

	void method1948(int i, int i_40_, Interface30 interface30) {
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i_40_);
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
		OpenGL.glUniform1i(i, i_40_);
	}

	void method1920(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_41_, float f_42_, float f_43_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_41_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_42_ || ((Class115_Sub2) this).aFloatArray9432[i] != f_43_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_41_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_42_;
				((Class115_Sub2) this).aFloatArray9432[i] = f_43_;
				if (class282_sub21_sub1.method15457((byte) 81) != Class111.aClass111_1134)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform4f(i, f, f_41_, f_42_, f_43_);
			}
		}
	}

	void method1941(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_44_, float f_45_, float f_46_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_44_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_45_ || ((Class115_Sub2) this).aFloatArray9432[i] != f_46_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_44_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_45_;
				((Class115_Sub2) this).aFloatArray9432[i] = f_46_;
				if (class282_sub21_sub1.method15457((byte) 63) != Class111.aClass111_1134)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform4f(i, f, f_44_, f_45_, f_46_);
			}
		}
	}

	void method1919(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_47_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_47_ != -1)
			OpenGL.glUniform4fv(i_47_, i, fs, 0);
	}

	void method1908(int i, int i_48_, Interface30 interface30) {
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i_48_);
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
		OpenGL.glUniform1i(i, i_48_);
	}

	public boolean method1911() {
		if (((Class115_Sub2) this).aBool9425)
			return true;
		((Class505_Sub2_Sub1) ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419).aClass115_Sub2_10189 = null;
		((Class115_Sub2) this).anInt9435 = method14671(35633, ((Class115_Sub2) this).aString9434, aString1244);
		((Class115_Sub2) this).anInt9424 = method14671(35632, ((Class115_Sub2) this).aString9430, aString1246);
		if (((Class115_Sub2) this).anInt9435 == 0 || ((Class115_Sub2) this).anInt9424 == 0) {
			if (((Class115_Sub2) this).anInt9435 != 0)
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9435);
			if (((Class115_Sub2) this).anInt9424 != 0)
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9424);
			return false;
		}
		((Class115_Sub2) this).anInt9423 = OpenGL.glCreateProgram();
		if (((Class115_Sub2) this).anInt9435 != 0)
			OpenGL.glAttachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9435);
		if (((Class115_Sub2) this).anInt9424 != 0)
			OpenGL.glAttachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9424);
		OpenGL.glLinkProgram(((Class115_Sub2) this).anInt9423);
		OpenGL.glGetProgramiv(((Class115_Sub2) this).anInt9423, 35714, anIntArray9417, 0);
		if (anIntArray9417[0] == 0) {
			if (((Class115_Sub2) this).anInt9435 != 0) {
				OpenGL.glDetachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9435);
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9435);
			}
			if (((Class115_Sub2) this).anInt9424 != 0) {
				OpenGL.glDetachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9424);
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9424);
			}
			OpenGL.glDeleteProgram(((Class115_Sub2) this).anInt9423);
			return false;
		}
		OpenGL.glUseProgram(((Class115_Sub2) this).anInt9423);
		int i = -1;
		for (int i_49_ = 0; i_49_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1650(-219628565); i_49_++) {
			if (((Class115_Sub2) this).aClass101_Sub1_9421.method1652(i_49_, (byte) 83) == this) {
				i = i_49_;
				break;
			}
		}
		if (i == -1)
			return false;
		int i_50_ = 0;
		int i_51_ = 0;
		for (int i_52_ = 0; i_52_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1682(1113047146); i_52_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub2) this).aClass101_Sub1_9421.method1742(i_52_, -1229516858);
			if (class282_sub21_sub1 != null) {
				class282_sub21_sub1.method15471(i);
				Class111 class111 = class282_sub21_sub1.method15457((byte) 21);
				int i_53_ = (((Class282_Sub21_Sub1_Sub2) (Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).anIntArray10308[i]);
				if (class111 == Class111.aClass111_1219 || class111 == Class111.aClass111_1182 || class111 == Class111.aClass111_1132 || class111 == Class111.aClass111_1133 || class111 == Class111.aClass111_1134)
					i_50_ = Math.max(i_53_, i_50_);
				else
					i_51_ = Math.max(i_53_, i_51_);
			}
		}
		for (int i_54_ = 0; i_54_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1679(-1571283399); i_54_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub2) this).aClass101_Sub1_9421.method1705(i_54_, 741194215);
			if (class282_sub21_sub1 != null) {
				class282_sub21_sub1.method15471(i);
				Class111 class111 = class282_sub21_sub1.method15457((byte) 103);
				int i_55_ = (((Class282_Sub21_Sub1_Sub2) (Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).anIntArray10308[i]);
				if (class111 == Class111.aClass111_1219 || class111 == Class111.aClass111_1182 || class111 == Class111.aClass111_1132 || class111 == Class111.aClass111_1133 || class111 == Class111.aClass111_1134)
					i_50_ = Math.max(i_55_, i_50_);
				else
					i_51_ = Math.max(i_55_, i_51_);
			}
		}
		((Class115_Sub2) this).aFloatArray9429 = new float[i_50_ + 1];
		((Class115_Sub2) this).aFloatArray9422 = new float[i_50_ + 1];
		((Class115_Sub2) this).aFloatArray9431 = new float[i_50_ + 1];
		((Class115_Sub2) this).aFloatArray9432 = new float[i_50_ + 1];
		((Class115_Sub2) this).anIntArray9433 = new int[i_51_ + 1];
		for (int i_56_ = 0; i_56_ < ((Class115_Sub2) this).anIntArray9433.length; i_56_++)
			((Class115_Sub2) this).anIntArray9433[i_56_] = -1;
		((Class115_Sub2) this).aString9434 = null;
		((Class115_Sub2) this).aString9430 = null;
		((Class115_Sub2) this).aBool9425 = true;
		return true;
	}

	void method1925(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		if (!$assertionsDisabled && (class282_sub21_sub1.method15457((byte) 93) != Class111.aClass111_1168))
			throw new AssertionError();
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class384.method6551(aFloatArray9427), 0);
	}

	void method1924(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		if (!$assertionsDisabled && (class282_sub21_sub1.method15457((byte) 100) != Class111.aClass111_1168))
			throw new AssertionError();
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class384.method6551(aFloatArray9427), 0);
	}

	void method1917(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_57_, float f_58_, float f_59_) {
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1) {
			if (((Class115_Sub2) this).aFloatArray9429[i] != f || ((Class115_Sub2) this).aFloatArray9422[i] != f_57_ || ((Class115_Sub2) this).aFloatArray9431[i] != f_58_ || ((Class115_Sub2) this).aFloatArray9432[i] != f_59_) {
				((Class115_Sub2) this).aFloatArray9429[i] = f;
				((Class115_Sub2) this).aFloatArray9422[i] = f_57_;
				((Class115_Sub2) this).aFloatArray9431[i] = f_58_;
				((Class115_Sub2) this).aFloatArray9432[i] = f_59_;
				if (class282_sub21_sub1.method15457((byte) 76) != Class111.aClass111_1134)
					throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
				OpenGL.glUniform4f(i, f, f_57_, f_58_, f_59_);
			}
		}
	}

	void method1926(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		if (!$assertionsDisabled && (class282_sub21_sub1.method15457((byte) 117) != Class111.aClass111_1150))
			throw new AssertionError();
		int i = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class384.method6517(aFloatArray9427), 0);
	}

	void method1930(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		int i_60_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_60_ != -1) {
			if (interface30 == null)
				interface30 = (((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInterface6_8788);
			if (i < ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInt8825) {
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i);
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class319) (Class319) interface30).anInt3707), (((Class319) (Class319) interface30).anInt3706));
			}
			if (((Class115_Sub2) this).anIntArray9433[i_60_] != i) {
				((Class115_Sub2) this).anIntArray9433[i_60_] = i;
				OpenGL.glUniform1i(i_60_, i);
			}
		}
	}

	void method1904(int i, float[] fs, int i_61_) {
		OpenGL.glUniform4fv(i, i_61_, fs, 0);
	}

	void method1918(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_62_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_62_ != -1)
			OpenGL.glUniform4fv(i_62_, i, fs, 0);
	}

	void method1946(int i, int i_63_, Interface30 interface30) {
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i_63_);
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
		OpenGL.glUniform1i(i, i_63_);
	}

	void method1931(int i, float f, float f_64_, float f_65_) {
		OpenGL.glUniform3f(i, f, f_64_, f_65_);
	}

	void method1932(int i, float f, float f_66_, float f_67_, float f_68_) {
		OpenGL.glUniform4f(i, f, f_66_, f_67_, f_68_);
	}

	void method1933(int i, float f, float f_69_, float f_70_, float f_71_) {
		OpenGL.glUniform4f(i, f, f_69_, f_70_, f_71_);
	}

	void method1934(int i, float f, float f_72_, float f_73_, float f_74_) {
		OpenGL.glUniform4f(i, f, f_72_, f_73_, f_74_);
	}

	void method1935(int i, float f, float f_75_, float f_76_, float f_77_) {
		OpenGL.glUniform4f(i, f, f_75_, f_76_, f_77_);
	}

	void method1921(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_78_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_78_ != -1)
			OpenGL.glUniform4fv(i_78_, i, fs, 0);
	}

	void method1902(int i, Class384 class384) {
		OpenGL.glUniform3fv(i, 3, class384.method6544(aFloatArray9427), 0);
	}

	Class115_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1, Class101_Sub1 class101_sub1, Class99 class99) {
		this(class505_sub2_sub1, class99);
		((Class115_Sub2) this).aClass101_Sub1_9421 = class101_sub1;
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419 = class505_sub2_sub1;
	}

	public void method26() {
		if (((Class115_Sub2) this).anInt9423 != 0) {
			((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method15573(((Class115_Sub2) this).anInt9423);
			if (((Class115_Sub2) this).anInt9435 != 0)
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method15580((long) ((Class115_Sub2) this).anInt9435);
			if (((Class115_Sub2) this).anInt9424 != 0)
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method15580((long) ((Class115_Sub2) this).anInt9424);
			((Class115_Sub2) this).anInt9423 = 0;
			((Class115_Sub2) this).anInt9435 = 0;
			((Class115_Sub2) this).anInt9424 = 0;
		}
	}

	void method1940(int i, Class384 class384) {
		OpenGL.glUniform3fv(i, 3, class384.method6544(aFloatArray9427), 0);
	}

	void method1922(int i, Class384 class384) {
		OpenGL.glUniform3fv(i, 3, class384.method6544(aFloatArray9427), 0);
	}

	void method1942(int i, Class384 class384) {
		OpenGL.glUniform2fv(i, 4, class384.method6551(aFloatArray9427), 0);
	}

	void method1943(int i, Class384 class384) {
		OpenGL.glUniform4fv(i, 4, class384.method6517(aFloatArray9427), 0);
	}

	void method1910(int i, Class384 class384) {
		OpenGL.glUniform4fv(i, 4, class384.method6517(aFloatArray9427), 0);
	}

	public boolean method1899() {
		if (((Class115_Sub2) this).aBool9425)
			return true;
		((Class505_Sub2_Sub1) ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419).aClass115_Sub2_10189 = null;
		((Class115_Sub2) this).anInt9435 = method14671(35633, ((Class115_Sub2) this).aString9434, aString1244);
		((Class115_Sub2) this).anInt9424 = method14671(35632, ((Class115_Sub2) this).aString9430, aString1246);
		if (((Class115_Sub2) this).anInt9435 == 0 || ((Class115_Sub2) this).anInt9424 == 0) {
			if (((Class115_Sub2) this).anInt9435 != 0)
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9435);
			if (((Class115_Sub2) this).anInt9424 != 0)
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9424);
			return false;
		}
		((Class115_Sub2) this).anInt9423 = OpenGL.glCreateProgram();
		if (((Class115_Sub2) this).anInt9435 != 0)
			OpenGL.glAttachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9435);
		if (((Class115_Sub2) this).anInt9424 != 0)
			OpenGL.glAttachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9424);
		OpenGL.glLinkProgram(((Class115_Sub2) this).anInt9423);
		OpenGL.glGetProgramiv(((Class115_Sub2) this).anInt9423, 35714, anIntArray9417, 0);
		if (anIntArray9417[0] == 0) {
			if (((Class115_Sub2) this).anInt9435 != 0) {
				OpenGL.glDetachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9435);
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9435);
			}
			if (((Class115_Sub2) this).anInt9424 != 0) {
				OpenGL.glDetachShader(((Class115_Sub2) this).anInt9423, ((Class115_Sub2) this).anInt9424);
				OpenGL.glDeleteShader(((Class115_Sub2) this).anInt9424);
			}
			OpenGL.glDeleteProgram(((Class115_Sub2) this).anInt9423);
			return false;
		}
		OpenGL.glUseProgram(((Class115_Sub2) this).anInt9423);
		int i = -1;
		for (int i_79_ = 0; i_79_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1650(1699577818); i_79_++) {
			if (((Class115_Sub2) this).aClass101_Sub1_9421.method1652(i_79_, (byte) 68) == this) {
				i = i_79_;
				break;
			}
		}
		if (i == -1)
			return false;
		int i_80_ = 0;
		int i_81_ = 0;
		for (int i_82_ = 0; i_82_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1682(-225666639); i_82_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub2) this).aClass101_Sub1_9421.method1742(i_82_, -1517256754);
			if (class282_sub21_sub1 != null) {
				class282_sub21_sub1.method15471(i);
				Class111 class111 = class282_sub21_sub1.method15457((byte) 125);
				int i_83_ = (((Class282_Sub21_Sub1_Sub2) (Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).anIntArray10308[i]);
				if (class111 == Class111.aClass111_1219 || class111 == Class111.aClass111_1182 || class111 == Class111.aClass111_1132 || class111 == Class111.aClass111_1133 || class111 == Class111.aClass111_1134)
					i_80_ = Math.max(i_83_, i_80_);
				else
					i_81_ = Math.max(i_83_, i_81_);
			}
		}
		for (int i_84_ = 0; i_84_ < ((Class115_Sub2) this).aClass101_Sub1_9421.method1679(-1090966018); i_84_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub2) this).aClass101_Sub1_9421.method1705(i_84_, -565117281);
			if (class282_sub21_sub1 != null) {
				class282_sub21_sub1.method15471(i);
				Class111 class111 = class282_sub21_sub1.method15457((byte) 124);
				int i_85_ = (((Class282_Sub21_Sub1_Sub2) (Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).anIntArray10308[i]);
				if (class111 == Class111.aClass111_1219 || class111 == Class111.aClass111_1182 || class111 == Class111.aClass111_1132 || class111 == Class111.aClass111_1133 || class111 == Class111.aClass111_1134)
					i_80_ = Math.max(i_85_, i_80_);
				else
					i_81_ = Math.max(i_85_, i_81_);
			}
		}
		((Class115_Sub2) this).aFloatArray9429 = new float[i_80_ + 1];
		((Class115_Sub2) this).aFloatArray9422 = new float[i_80_ + 1];
		((Class115_Sub2) this).aFloatArray9431 = new float[i_80_ + 1];
		((Class115_Sub2) this).aFloatArray9432 = new float[i_80_ + 1];
		((Class115_Sub2) this).anIntArray9433 = new int[i_81_ + 1];
		for (int i_86_ = 0; i_86_ < ((Class115_Sub2) this).anIntArray9433.length; i_86_++)
			((Class115_Sub2) this).anIntArray9433[i_86_] = -1;
		((Class115_Sub2) this).aString9434 = null;
		((Class115_Sub2) this).aString9430 = null;
		((Class115_Sub2) this).aBool9425 = true;
		return true;
	}

	void method1907(int i, float f, float f_87_, float f_88_, float f_89_) {
		OpenGL.glUniform4f(i, f, f_87_, f_88_, f_89_);
	}

	void method1947(int i, int i_90_, Interface30 interface30) {
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i_90_);
		((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
		OpenGL.glUniform1i(i, i_90_);
	}

	void method14673() {
		method26();
	}

	int method14674(int i, String string, String string_91_) {
		if (string == null)
			return 0;
		int i_92_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_92_, string);
		OpenGL.glCompileShader(i_92_);
		OpenGL.glGetShaderiv(i_92_, 35713, anIntArray9417, 0);
		if (anIntArray9417[0] == 0) {
			OpenGL.glDeleteShader(i_92_);
			i_92_ = 0;
		}
		return i_92_;
	}

	void method1929(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		int i_93_ = ((Class282_Sub21_Sub1_Sub2) class282_sub21_sub1).method15788();
		if (i_93_ != -1) {
			if (interface30 == null)
				interface30 = (((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInterface6_8788);
			if (i < ((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.anInt8825) {
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14163(i);
				((Class115_Sub2) this).aClass505_Sub2_Sub1_9419.method14035(interface30);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class319) (Class319) interface30).anInt3707), (((Class319) (Class319) interface30).anInt3706));
			}
			if (((Class115_Sub2) this).anIntArray9433[i_93_] != i) {
				((Class115_Sub2) this).anIntArray9433[i_93_] = i;
				OpenGL.glUniform1i(i_93_, i);
			}
		}
	}
}
