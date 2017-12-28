
/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class140 {
	static final int anInt1659 = 35632;
	static final int anInt1660 = 35633;
	static int[] anIntArray1661 = new int[2];
	Class505_Sub1 aClass505_Sub1_1662;
	int anInt1663;

	static Class140 method2388(Class505_Sub1 class505_sub1, int i, String string) {
		int i_0_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_0_, string);
		OpenGL.glCompileShader(i_0_);
		OpenGL.glGetShaderiv(i_0_, 35713, anIntArray1661, 0);
		if (anIntArray1661[0] == 0) {
			if (anIntArray1661[0] == 0)
				System.out.println("");
			OpenGL.glGetShaderiv(i_0_, 35716, anIntArray1661, 1);
			if (anIntArray1661[1] > 1) {
				byte[] is = new byte[anIntArray1661[1]];
				OpenGL.glGetShaderInfoLog(i_0_, anIntArray1661[1], anIntArray1661, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1661[0] == 0) {
				OpenGL.glDeleteShader(i_0_);
				return null;
			}
		}
		return new Class140(class505_sub1, i_0_, i);
	}

	Class140(Class505_Sub1 class505_sub1, int i, int i_1_) {
		((Class140) this).aClass505_Sub1_1662 = class505_sub1;
		((Class140) this).anInt1663 = i;
	}

	public void finalize() throws Throwable {
		((Class140) this).aClass505_Sub1_1662.method13627((long) ((Class140) this).anInt1663);
		super.finalize();
	}

	void method2389() throws Throwable {
		((Class140) this).aClass505_Sub1_1662.method13627((long) ((Class140) this).anInt1663);
		super.finalize();
	}

	void method2390() throws Throwable {
		((Class140) this).aClass505_Sub1_1662.method13627((long) ((Class140) this).anInt1663);
		super.finalize();
	}

	static Class140 method2391(Class505_Sub1 class505_sub1, int i, String string) {
		int i_2_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_2_, string);
		OpenGL.glCompileShader(i_2_);
		OpenGL.glGetShaderiv(i_2_, 35713, anIntArray1661, 0);
		if (anIntArray1661[0] == 0) {
			if (anIntArray1661[0] == 0)
				System.out.println("");
			OpenGL.glGetShaderiv(i_2_, 35716, anIntArray1661, 1);
			if (anIntArray1661[1] > 1) {
				byte[] is = new byte[anIntArray1661[1]];
				OpenGL.glGetShaderInfoLog(i_2_, anIntArray1661[1], anIntArray1661, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1661[0] == 0) {
				OpenGL.glDeleteShader(i_2_);
				return null;
			}
		}
		return new Class140(class505_sub1, i_2_, i);
	}

	static Class140 method2392(Class505_Sub1 class505_sub1, int i, String string) {
		int i_3_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_3_, string);
		OpenGL.glCompileShader(i_3_);
		OpenGL.glGetShaderiv(i_3_, 35713, anIntArray1661, 0);
		if (anIntArray1661[0] == 0) {
			if (anIntArray1661[0] == 0)
				System.out.println("");
			OpenGL.glGetShaderiv(i_3_, 35716, anIntArray1661, 1);
			if (anIntArray1661[1] > 1) {
				byte[] is = new byte[anIntArray1661[1]];
				OpenGL.glGetShaderInfoLog(i_3_, anIntArray1661[1], anIntArray1661, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1661[0] == 0) {
				OpenGL.glDeleteShader(i_3_);
				return null;
			}
		}
		return new Class140(class505_sub1, i_3_, i);
	}

	static Class140 method2393(Class505_Sub1 class505_sub1, int i, String string) {
		int i_4_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_4_, string);
		OpenGL.glCompileShader(i_4_);
		OpenGL.glGetShaderiv(i_4_, 35713, anIntArray1661, 0);
		if (anIntArray1661[0] == 0) {
			if (anIntArray1661[0] == 0)
				System.out.println("");
			OpenGL.glGetShaderiv(i_4_, 35716, anIntArray1661, 1);
			if (anIntArray1661[1] > 1) {
				byte[] is = new byte[anIntArray1661[1]];
				OpenGL.glGetShaderInfoLog(i_4_, anIntArray1661[1], anIntArray1661, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1661[0] == 0) {
				OpenGL.glDeleteShader(i_4_);
				return null;
			}
		}
		return new Class140(class505_sub1, i_4_, i);
	}
}
