/* Class298_Sub31_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class298_Sub31_Sub1_Sub2 extends Class298_Sub31_Sub1 {
	int[] anIntArray9995 = null;
	Class123_Sub1 aClass123_Sub1_9996;
	int[] anIntArray9997 = null;

	final int method3126() {
		return (((Class298_Sub31_Sub1_Sub2) this).anIntArray9997[((Class298_Sub31_Sub1_Sub2) this).aClass123_Sub1_9996.method1333(1457769061)]);
	}

	final int method3127() {
		return (((Class298_Sub31_Sub1_Sub2) this).anIntArray9995[((Class298_Sub31_Sub1_Sub2) this).aClass123_Sub1_9996.method1333(1410617434)]);
	}

	public boolean method3124(int i) {
		return true;
	}

	public final int method3117(int i) {
		int i_0_ = ((Class298_Sub31_Sub1_Sub2) this).anIntArray9995[i];
		int i_1_ = ((Class298_Sub31_Sub1_Sub2) this).anIntArray9997[i];
		if (i_0_ != -1)
			return i_0_;
		if (i_1_ != -1)
			return i_1_ | 0x10000;
		return -1;
	}

	public final int method3123(int i) {
		int i_2_ = ((Class298_Sub31_Sub1_Sub2) this).anIntArray9995[i];
		int i_3_ = ((Class298_Sub31_Sub1_Sub2) this).anIntArray9997[i];
		if (i_2_ != -1)
			return i_2_;
		if (i_3_ != -1)
			return i_3_ | 0x10000;
		return -1;
	}

	public boolean method3116(int i) {
		return true;
	}

	public final int method3119(int i) {
		int i_4_ = ((Class298_Sub31_Sub1_Sub2) this).anIntArray9995[i];
		int i_5_ = ((Class298_Sub31_Sub1_Sub2) this).anIntArray9997[i];
		if (i_4_ != -1)
			return i_4_;
		if (i_5_ != -1)
			return i_5_ | 0x10000;
		return -1;
	}

	Class298_Sub31_Sub1_Sub2(Class123_Sub1 class123_sub1, Class114 class114) {
		super(class114);
		((Class298_Sub31_Sub1_Sub2) this).aClass123_Sub1_9996 = class123_sub1;
		((Class298_Sub31_Sub1_Sub2) this).anIntArray9995 = class114.anIntArray1379;
		((Class298_Sub31_Sub1_Sub2) this).anIntArray9997 = class114.anIntArray1380;
	}
}
