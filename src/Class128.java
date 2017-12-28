
/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class128 {
	Class505_Sub1 aClass505_Sub1_1581;
	static int[] anIntArray1582 = new int[2];
	int anInt1583;

	static Class128 method2174(Class505_Sub1 class505_sub1, Class140[] class140s) {
		for (int i = 0; i < class140s.length; i++) {
			if (class140s[i] == null || ((Class140) class140s[i]).anInt1663 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class140s.length; i_0_++)
			OpenGL.glAttachShader(i, ((Class140) class140s[i_0_]).anInt1663);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1582, 0);
		if (anIntArray1582[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1582, 1);
			if (anIntArray1582[1] > 1) {
				byte[] is = new byte[anIntArray1582[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1582[1], anIntArray1582, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1582[0] == 0) {
				for (int i_1_ = 0; i_1_ < class140s.length; i_1_++)
					OpenGL.glDetachShader(i, (((Class140) class140s[i_1_]).anInt1663));
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class128(class505_sub1, i, class140s);
	}

	void method2175() throws Throwable {
		((Class128) this).aClass505_Sub1_1581.method13627((long) ((Class128) this).anInt1583);
		super.finalize();
	}

	public void finalize() throws Throwable {
		((Class128) this).aClass505_Sub1_1581.method13627((long) ((Class128) this).anInt1583);
		super.finalize();
	}

	static Class128 method2176(Class505_Sub1 class505_sub1, Class140[] class140s) {
		for (int i = 0; i < class140s.length; i++) {
			if (class140s[i] == null || ((Class140) class140s[i]).anInt1663 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_2_ = 0; i_2_ < class140s.length; i_2_++)
			OpenGL.glAttachShader(i, ((Class140) class140s[i_2_]).anInt1663);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1582, 0);
		if (anIntArray1582[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1582, 1);
			if (anIntArray1582[1] > 1) {
				byte[] is = new byte[anIntArray1582[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1582[1], anIntArray1582, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1582[0] == 0) {
				for (int i_3_ = 0; i_3_ < class140s.length; i_3_++)
					OpenGL.glDetachShader(i, (((Class140) class140s[i_3_]).anInt1663));
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class128(class505_sub1, i, class140s);
	}

	static Class128 method2177(Class505_Sub1 class505_sub1, Class140[] class140s) {
		for (int i = 0; i < class140s.length; i++) {
			if (class140s[i] == null || ((Class140) class140s[i]).anInt1663 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_4_ = 0; i_4_ < class140s.length; i_4_++)
			OpenGL.glAttachShader(i, ((Class140) class140s[i_4_]).anInt1663);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1582, 0);
		if (anIntArray1582[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1582, 1);
			if (anIntArray1582[1] > 1) {
				byte[] is = new byte[anIntArray1582[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1582[1], anIntArray1582, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1582[0] == 0) {
				for (int i_5_ = 0; i_5_ < class140s.length; i_5_++)
					OpenGL.glDetachShader(i, (((Class140) class140s[i_5_]).anInt1663));
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class128(class505_sub1, i, class140s);
	}

	void method2178() throws Throwable {
		((Class128) this).aClass505_Sub1_1581.method13627((long) ((Class128) this).anInt1583);
		super.finalize();
	}

	Class128(Class505_Sub1 class505_sub1, int i, Class140[] class140s) {
		((Class128) this).aClass505_Sub1_1581 = class505_sub1;
		((Class128) this).anInt1583 = i;
	}
}
