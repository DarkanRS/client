/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class48 {
	int anInt492;
	static int anInt493 = 35632;
	static int anInt494 = 35633;
	Class_ra_Sub2 aClass_ra_Sub2_495;
	static int[] anIntArray496 = new int[2];

	Class48(Class_ra_Sub2 class_ra_sub2, int i, int i_0_) {
		((Class48) this).aClass_ra_Sub2_495 = class_ra_sub2;
		((Class48) this).anInt492 = i;
	}

	static Class48 method526(Class_ra_Sub2 class_ra_sub2, int i, String string) {
		int i_1_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_1_, string);
		OpenGL.glCompileShader(i_1_);
		OpenGL.glGetShaderiv(i_1_, 35713, anIntArray496, 0);
		if (anIntArray496[0] == 0) {
			if (anIntArray496[0] == 0)
				System.out.println("");
			OpenGL.glGetShaderiv(i_1_, 35716, anIntArray496, 1);
			if (anIntArray496[1] > 1) {
				byte[] is = new byte[anIntArray496[1]];
				OpenGL.glGetShaderInfoLog(i_1_, anIntArray496[1], anIntArray496, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray496[0] == 0) {
				OpenGL.glDeleteShader(i_1_);
				return null;
			}
		}
		return new Class48(class_ra_sub2, i_1_, i);
	}
}
