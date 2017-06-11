/* Class298_Sub31_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class298_Sub31_Sub1_Sub1 extends Class298_Sub31_Sub1 {
	Class123_Sub2 aClass123_Sub2_9993;
	int[] anIntArray9994 = null;

	public final int method3119(int i) {
		return ((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i];
	}

	final int method3125() {
		return (((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[((Class298_Sub31_Sub1_Sub1) this).aClass123_Sub2_9993.method1333(1643025495)]);
	}

	public boolean method3124(int i) {
		if (((Class298_Sub31_Sub1_Sub1) this).anIntArray9994 == null)
			((Class298_Sub31_Sub1_Sub1) this).anIntArray9994 = new int[((Class298_Sub31_Sub1_Sub1) this).aClass123_Sub2_9993.method1328(-1467018991)];
		Class110_Sub2 class110_sub2 = ((Class110_Sub2) ((Class298_Sub31_Sub1_Sub1) this).aClass123_Sub2_9993.method1369(i, 1345565445));
		((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i] = OpenGL.glGetUniformLocation((((Class110_Sub2) class110_sub2).anInt8608), method3121((byte) 1));
		return ((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i] != -1;
	}

	Class298_Sub31_Sub1_Sub1(Class123_Sub2 class123_sub2, Class114 class114) {
		super(class114);
		((Class298_Sub31_Sub1_Sub1) this).aClass123_Sub2_9993 = class123_sub2;
	}

	public final int method3117(int i) {
		return ((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i];
	}

	public final int method3123(int i) {
		return ((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i];
	}

	public boolean method3116(int i) {
		if (((Class298_Sub31_Sub1_Sub1) this).anIntArray9994 == null)
			((Class298_Sub31_Sub1_Sub1) this).anIntArray9994 = new int[((Class298_Sub31_Sub1_Sub1) this).aClass123_Sub2_9993.method1328(-1467018991)];
		Class110_Sub2 class110_sub2 = ((Class110_Sub2) ((Class298_Sub31_Sub1_Sub1) this).aClass123_Sub2_9993.method1369(i, 1367202390));
		((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i] = OpenGL.glGetUniformLocation((((Class110_Sub2) class110_sub2).anInt8608), method3121((byte) 1));
		return ((Class298_Sub31_Sub1_Sub1) this).anIntArray9994[i] != -1;
	}
}
