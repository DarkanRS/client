
/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

public class Class320 {
	int anInt3714 = 0;
	int anInt3715;
	int anInt3716;
	int[][] anIntArrayArray3717;
	int anInt3718 = -1723974065;
	static Class282_Sub25 aClass282_Sub25_3719 = new Class282_Sub25(0, 0);
	Class282_Sub25[] aClass282_Sub25Array3720;
	Class473 aClass473_3721 = new Class473();
	public boolean aBool3722 = false;
	public static Class253 aClass253_3723;
	public static int[] anIntArray3724;

	final void method5719() {
		for (int i = 0; i < 1293138991 * ((Class320) this).anInt3716; i++)
			((Class320) this).anIntArrayArray3717[i] = null;
		((Class320) this).aClass282_Sub25Array3720 = null;
		((Class320) this).anIntArrayArray3717 = null;
		((Class320) this).aClass473_3721.method7855((byte) 4);
		((Class320) this).aClass473_3721 = null;
	}

	final void method5720(byte i) {
		for (int i_0_ = 0; i_0_ < 1293138991 * ((Class320) this).anInt3716; i_0_++)
			((Class320) this).anIntArrayArray3717[i_0_] = null;
		((Class320) this).aClass282_Sub25Array3720 = null;
		((Class320) this).anIntArrayArray3717 = null;
		((Class320) this).aClass473_3721.method7855((byte) 4);
		((Class320) this).aClass473_3721 = null;
	}

	public final int[] method5721(int i, int i_1_) {
		if (366178711 * ((Class320) this).anInt3715 != ((Class320) this).anInt3716 * 1293138991) {
			if (1 != ((Class320) this).anInt3716 * 1293138991) {
				Class282_Sub25 class282_sub25 = ((Class320) this).aClass282_Sub25Array3720[i];
				if (class282_sub25 == null) {
					aBool3722 = true;
					if (-485828277 * ((Class320) this).anInt3714 >= ((Class320) this).anInt3716 * 1293138991) {
						Class282_Sub25 class282_sub25_2_ = (Class282_Sub25) ((Class320) this).aClass473_3721.method7869(-417377867);
						class282_sub25 = new Class282_Sub25(i, (((Class282_Sub25) class282_sub25_2_).anInt7689) * -501478123);
						((Class320) this).aClass282_Sub25Array3720[(((Class282_Sub25) class282_sub25_2_).anInt7688 * -968280871)] = null;
						class282_sub25_2_.unlink(-371378792);
					} else {
						class282_sub25 = new Class282_Sub25(i, (((Class320) this).anInt3714 * -485828277));
						((Class320) this).anInt3714 += 510060643;
					}
					((Class320) this).aClass282_Sub25Array3720[i] = class282_sub25;
				} else
					aBool3722 = false;
				((Class320) this).aClass473_3721.method7873(class282_sub25, (byte) 14);
				return (((Class320) this).anIntArrayArray3717[(-501478123 * ((Class282_Sub25) class282_sub25).anInt7689)]);
			}
			aBool3722 = ((Class320) this).anInt3718 * -581179567 != i;
			((Class320) this).anInt3718 = 1723974065 * i;
			return ((Class320) this).anIntArrayArray3717[0];
		}
		aBool3722 = ((Class320) this).aClass282_Sub25Array3720[i] == null;
		((Class320) this).aClass282_Sub25Array3720[i] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717[i];
	}

	public final int[][] method5722(byte i) {
		if (1293138991 * ((Class320) this).anInt3716 != 366178711 * ((Class320) this).anInt3715)
			throw new RuntimeException();
		for (int i_3_ = 0; i_3_ < 1293138991 * ((Class320) this).anInt3716; i_3_++)
			((Class320) this).aClass282_Sub25Array3720[i_3_] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717;
	}

	Class320(int i, int i_4_, int i_5_) {
		((Class320) this).anInt3715 = i_4_ * 1100357159;
		((Class320) this).anInt3716 = i * 1109330639;
		((Class320) this).anIntArrayArray3717 = new int[((Class320) this).anInt3716 * 1293138991][i_5_];
		((Class320) this).aClass282_Sub25Array3720 = new Class282_Sub25[((Class320) this).anInt3715 * 366178711];
	}

	final void method5723() {
		for (int i = 0; i < 1293138991 * ((Class320) this).anInt3716; i++)
			((Class320) this).anIntArrayArray3717[i] = null;
		((Class320) this).aClass282_Sub25Array3720 = null;
		((Class320) this).anIntArrayArray3717 = null;
		((Class320) this).aClass473_3721.method7855((byte) 4);
		((Class320) this).aClass473_3721 = null;
	}

	public final int[] method5724(int i) {
		if (366178711 * ((Class320) this).anInt3715 != ((Class320) this).anInt3716 * 1293138991) {
			if (1 != ((Class320) this).anInt3716 * 1293138991) {
				Class282_Sub25 class282_sub25 = ((Class320) this).aClass282_Sub25Array3720[i];
				if (class282_sub25 == null) {
					aBool3722 = true;
					if (-485828277 * ((Class320) this).anInt3714 >= ((Class320) this).anInt3716 * 1293138991) {
						Class282_Sub25 class282_sub25_6_ = (Class282_Sub25) ((Class320) this).aClass473_3721.method7869(-417377867);
						class282_sub25 = new Class282_Sub25(i, (((Class282_Sub25) class282_sub25_6_).anInt7689) * -501478123);
						((Class320) this).aClass282_Sub25Array3720[(((Class282_Sub25) class282_sub25_6_).anInt7688 * -968280871)] = null;
						class282_sub25_6_.unlink(-371378792);
					} else {
						class282_sub25 = new Class282_Sub25(i, (((Class320) this).anInt3714 * -485828277));
						((Class320) this).anInt3714 += 510060643;
					}
					((Class320) this).aClass282_Sub25Array3720[i] = class282_sub25;
				} else
					aBool3722 = false;
				((Class320) this).aClass473_3721.method7873(class282_sub25, (byte) -77);
				return (((Class320) this).anIntArrayArray3717[(-501478123 * ((Class282_Sub25) class282_sub25).anInt7689)]);
			}
			aBool3722 = ((Class320) this).anInt3718 * -581179567 != i;
			((Class320) this).anInt3718 = 1723974065 * i;
			return ((Class320) this).anIntArrayArray3717[0];
		}
		aBool3722 = ((Class320) this).aClass282_Sub25Array3720[i] == null;
		((Class320) this).aClass282_Sub25Array3720[i] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717[i];
	}

	final void method5725() {
		for (int i = 0; i < 1293138991 * ((Class320) this).anInt3716; i++)
			((Class320) this).anIntArrayArray3717[i] = null;
		((Class320) this).aClass282_Sub25Array3720 = null;
		((Class320) this).anIntArrayArray3717 = null;
		((Class320) this).aClass473_3721.method7855((byte) 4);
		((Class320) this).aClass473_3721 = null;
	}

	final void method5726() {
		for (int i = 0; i < 1293138991 * ((Class320) this).anInt3716; i++)
			((Class320) this).anIntArrayArray3717[i] = null;
		((Class320) this).aClass282_Sub25Array3720 = null;
		((Class320) this).anIntArrayArray3717 = null;
		((Class320) this).aClass473_3721.method7855((byte) 4);
		((Class320) this).aClass473_3721 = null;
	}

	public final int[] method5727(int i) {
		if (366178711 * ((Class320) this).anInt3715 != ((Class320) this).anInt3716 * 1293138991) {
			if (1 != ((Class320) this).anInt3716 * 1293138991) {
				Class282_Sub25 class282_sub25 = ((Class320) this).aClass282_Sub25Array3720[i];
				if (class282_sub25 == null) {
					aBool3722 = true;
					if (-485828277 * ((Class320) this).anInt3714 >= ((Class320) this).anInt3716 * 1293138991) {
						Class282_Sub25 class282_sub25_7_ = (Class282_Sub25) ((Class320) this).aClass473_3721.method7869(-417377867);
						class282_sub25 = new Class282_Sub25(i, (((Class282_Sub25) class282_sub25_7_).anInt7689) * -501478123);
						((Class320) this).aClass282_Sub25Array3720[(((Class282_Sub25) class282_sub25_7_).anInt7688 * -968280871)] = null;
						class282_sub25_7_.unlink(-371378792);
					} else {
						class282_sub25 = new Class282_Sub25(i, (((Class320) this).anInt3714 * -485828277));
						((Class320) this).anInt3714 += 510060643;
					}
					((Class320) this).aClass282_Sub25Array3720[i] = class282_sub25;
				} else
					aBool3722 = false;
				((Class320) this).aClass473_3721.method7873(class282_sub25, (byte) -127);
				return (((Class320) this).anIntArrayArray3717[(-501478123 * ((Class282_Sub25) class282_sub25).anInt7689)]);
			}
			aBool3722 = ((Class320) this).anInt3718 * -581179567 != i;
			((Class320) this).anInt3718 = 1723974065 * i;
			return ((Class320) this).anIntArrayArray3717[0];
		}
		aBool3722 = ((Class320) this).aClass282_Sub25Array3720[i] == null;
		((Class320) this).aClass282_Sub25Array3720[i] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717[i];
	}

	public final int[] method5728(int i) {
		if (366178711 * ((Class320) this).anInt3715 != ((Class320) this).anInt3716 * 1293138991) {
			if (1 != ((Class320) this).anInt3716 * 1293138991) {
				Class282_Sub25 class282_sub25 = ((Class320) this).aClass282_Sub25Array3720[i];
				if (class282_sub25 == null) {
					aBool3722 = true;
					if (-485828277 * ((Class320) this).anInt3714 >= ((Class320) this).anInt3716 * 1293138991) {
						Class282_Sub25 class282_sub25_8_ = (Class282_Sub25) ((Class320) this).aClass473_3721.method7869(-417377867);
						class282_sub25 = new Class282_Sub25(i, (((Class282_Sub25) class282_sub25_8_).anInt7689) * -501478123);
						((Class320) this).aClass282_Sub25Array3720[(((Class282_Sub25) class282_sub25_8_).anInt7688 * -968280871)] = null;
						class282_sub25_8_.unlink(-371378792);
					} else {
						class282_sub25 = new Class282_Sub25(i, (((Class320) this).anInt3714 * -485828277));
						((Class320) this).anInt3714 += 510060643;
					}
					((Class320) this).aClass282_Sub25Array3720[i] = class282_sub25;
				} else
					aBool3722 = false;
				((Class320) this).aClass473_3721.method7873(class282_sub25, (byte) 0);
				return (((Class320) this).anIntArrayArray3717[(-501478123 * ((Class282_Sub25) class282_sub25).anInt7689)]);
			}
			aBool3722 = ((Class320) this).anInt3718 * -581179567 != i;
			((Class320) this).anInt3718 = 1723974065 * i;
			return ((Class320) this).anIntArrayArray3717[0];
		}
		aBool3722 = ((Class320) this).aClass282_Sub25Array3720[i] == null;
		((Class320) this).aClass282_Sub25Array3720[i] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717[i];
	}

	public final int[] method5729(int i) {
		if (366178711 * ((Class320) this).anInt3715 != ((Class320) this).anInt3716 * 1293138991) {
			if (1 != ((Class320) this).anInt3716 * 1293138991) {
				Class282_Sub25 class282_sub25 = ((Class320) this).aClass282_Sub25Array3720[i];
				if (class282_sub25 == null) {
					aBool3722 = true;
					if (-485828277 * ((Class320) this).anInt3714 >= ((Class320) this).anInt3716 * 1293138991) {
						Class282_Sub25 class282_sub25_9_ = (Class282_Sub25) ((Class320) this).aClass473_3721.method7869(-417377867);
						class282_sub25 = new Class282_Sub25(i, (((Class282_Sub25) class282_sub25_9_).anInt7689) * -501478123);
						((Class320) this).aClass282_Sub25Array3720[(((Class282_Sub25) class282_sub25_9_).anInt7688 * -968280871)] = null;
						class282_sub25_9_.unlink(-371378792);
					} else {
						class282_sub25 = new Class282_Sub25(i, (((Class320) this).anInt3714 * -485828277));
						((Class320) this).anInt3714 += 510060643;
					}
					((Class320) this).aClass282_Sub25Array3720[i] = class282_sub25;
				} else
					aBool3722 = false;
				((Class320) this).aClass473_3721.method7873(class282_sub25, (byte) -67);
				return (((Class320) this).anIntArrayArray3717[(-501478123 * ((Class282_Sub25) class282_sub25).anInt7689)]);
			}
			aBool3722 = ((Class320) this).anInt3718 * -581179567 != i;
			((Class320) this).anInt3718 = 1723974065 * i;
			return ((Class320) this).anIntArrayArray3717[0];
		}
		aBool3722 = ((Class320) this).aClass282_Sub25Array3720[i] == null;
		((Class320) this).aClass282_Sub25Array3720[i] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717[i];
	}

	public final int[][] method5730() {
		if (1293138991 * ((Class320) this).anInt3716 != 366178711 * ((Class320) this).anInt3715)
			throw new RuntimeException();
		for (int i = 0; i < 1293138991 * ((Class320) this).anInt3716; i++)
			((Class320) this).aClass282_Sub25Array3720[i] = aClass282_Sub25_3719;
		return ((Class320) this).anIntArrayArray3717;
	}

	public static void method5731(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		Class42.method890(i_14_, i_15_, 100, (byte) -118);
		Class260.aClass277_3234 = new Class277(i, i_10_ << 9, i_11_ << 9, i_12_ << 8, 8 * i_13_);
	}

	public static GraphicalRenderer method5732(int i, Canvas canvas, Interface22 interface22, Index class317, int i_17_, int i_18_) {
		int i_19_ = 0;
		int i_20_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_19_ = dimension.width;
			i_20_ = dimension.height;
		}
		return Class88.method1493(i, canvas, interface22, class317, i_17_, i_19_, i_20_, (byte) 73);
	}

	static final void method5733(CS2Executor class527, short i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method5734(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1068541972);
	}

	static final void method5735(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.intStackPtr -= 283782002;
		int i_21_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_22_ = (class527.intStack[class527.intStackPtr * 1942118537 + 1]);
		FontMetrics class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_22_, 0, 1444002710);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class414.method6951(string, i_21_, Class182.aClass160Array2261, (byte) 76);
	}

	static void method5736(CS2Executor class527, int i) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[((class527.intStackPtr -= 141891001) * 1942118537)]), -1396181317).altName);
	}
}
