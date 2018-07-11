/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class308 {
	int anInt3611;
	Class473 aClass473_3612;
	int anInt3613;
	int[][][] anIntArrayArrayArray3614;
	Class282_Sub16[] aClass282_Sub16Array3615;
	int anInt3616;
	int anInt3617 = 0;
	static Class282_Sub16 aClass282_Sub16_3618 = new Class282_Sub16(0, 0);
	public boolean aBool3619;
	public static client aclient3620;
	public static short[] aShortArray3621;

	final void method5462(byte i) {
		for (int i_0_ = 0; i_0_ < -68706765 * ((Class308) this).anInt3613; i_0_++) {
			((Class308) this).anIntArrayArrayArray3614[i_0_][0] = null;
			((Class308) this).anIntArrayArrayArray3614[i_0_][1] = null;
			((Class308) this).anIntArrayArrayArray3614[i_0_][2] = null;
			((Class308) this).anIntArrayArrayArray3614[i_0_] = null;
		}
		((Class308) this).aClass282_Sub16Array3615 = null;
		((Class308) this).anIntArrayArrayArray3614 = null;
		((Class308) this).aClass473_3612.method7855((byte) 4);
		((Class308) this).aClass473_3612 = null;
	}

	public final int[][] method5463(int i, int i_1_) {
		if (-602074803 * ((Class308) this).anInt3611 != ((Class308) this).anInt3613 * -68706765) {
			if (1 != ((Class308) this).anInt3613 * -68706765) {
				Class282_Sub16 class282_sub16 = ((Class308) this).aClass282_Sub16Array3615[i];
				if (null == class282_sub16) {
					aBool3619 = true;
					if (-719606331 * ((Class308) this).anInt3617 >= ((Class308) this).anInt3613 * -68706765) {
						Class282_Sub16 class282_sub16_2_ = (Class282_Sub16) ((Class308) this).aClass473_3612.method7869(-417377867);
						class282_sub16 = new Class282_Sub16(i, (((Class282_Sub16) class282_sub16_2_).anInt7602) * 1598441707);
						((Class308) this).aClass282_Sub16Array3615[(((Class282_Sub16) class282_sub16_2_).anInt7603 * 1516507657)] = null;
						class282_sub16_2_.unlink(-371378792);
					} else {
						class282_sub16 = new Class282_Sub16(i, (((Class308) this).anInt3617 * -719606331));
						((Class308) this).anInt3617 += -661698291;
					}
					((Class308) this).aClass282_Sub16Array3615[i] = class282_sub16;
				} else
					aBool3619 = false;
				((Class308) this).aClass473_3612.method7873(class282_sub16, (byte) -49);
				return (((Class308) this).anIntArrayArrayArray3614[(((Class282_Sub16) class282_sub16).anInt7602 * 1598441707)]);
			}
			aBool3619 = ((Class308) this).anInt3616 * -280749065 != i;
			((Class308) this).anInt3616 = i * -1013639737;
			return ((Class308) this).anIntArrayArrayArray3614[0];
		}
		aBool3619 = null == ((Class308) this).aClass282_Sub16Array3615[i];
		((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614[i];
	}

	public final int[][][] method5464(int i) {
		if (-68706765 * ((Class308) this).anInt3613 != ((Class308) this).anInt3611 * -602074803)
			throw new RuntimeException();
		for (int i_3_ = 0; i_3_ < ((Class308) this).anInt3613 * -68706765; i_3_++)
			((Class308) this).aClass282_Sub16Array3615[i_3_] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614;
	}

	public final int[][][] method5465() {
		if (-68706765 * ((Class308) this).anInt3613 != ((Class308) this).anInt3611 * -602074803)
			throw new RuntimeException();
		for (int i = 0; i < ((Class308) this).anInt3613 * -68706765; i++)
			((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614;
	}

	Class308(int i, int i_4_, int i_5_) {
		((Class308) this).anInt3616 = 1013639737;
		((Class308) this).aClass473_3612 = new Class473();
		aBool3619 = false;
		((Class308) this).anInt3611 = -1423143035 * i_4_;
		((Class308) this).anInt3613 = i * 1426885883;
		((Class308) this).anIntArrayArrayArray3614 = new int[-68706765 * ((Class308) this).anInt3613][3][i_5_];
		((Class308) this).aClass282_Sub16Array3615 = new Class282_Sub16[-602074803 * ((Class308) this).anInt3611];
	}

	final void method5466() {
		for (int i = 0; i < -68706765 * ((Class308) this).anInt3613; i++) {
			((Class308) this).anIntArrayArrayArray3614[i][0] = null;
			((Class308) this).anIntArrayArrayArray3614[i][1] = null;
			((Class308) this).anIntArrayArrayArray3614[i][2] = null;
			((Class308) this).anIntArrayArrayArray3614[i] = null;
		}
		((Class308) this).aClass282_Sub16Array3615 = null;
		((Class308) this).anIntArrayArrayArray3614 = null;
		((Class308) this).aClass473_3612.method7855((byte) 4);
		((Class308) this).aClass473_3612 = null;
	}

	public final int[][] method5467(int i) {
		if (-602074803 * ((Class308) this).anInt3611 != ((Class308) this).anInt3613 * -68706765) {
			if (1 != ((Class308) this).anInt3613 * -68706765) {
				Class282_Sub16 class282_sub16 = ((Class308) this).aClass282_Sub16Array3615[i];
				if (null == class282_sub16) {
					aBool3619 = true;
					if (-719606331 * ((Class308) this).anInt3617 >= ((Class308) this).anInt3613 * -68706765) {
						Class282_Sub16 class282_sub16_6_ = (Class282_Sub16) ((Class308) this).aClass473_3612.method7869(-417377867);
						class282_sub16 = new Class282_Sub16(i, (((Class282_Sub16) class282_sub16_6_).anInt7602) * 1598441707);
						((Class308) this).aClass282_Sub16Array3615[(((Class282_Sub16) class282_sub16_6_).anInt7603 * 1516507657)] = null;
						class282_sub16_6_.unlink(-371378792);
					} else {
						class282_sub16 = new Class282_Sub16(i, (((Class308) this).anInt3617 * -719606331));
						((Class308) this).anInt3617 += -661698291;
					}
					((Class308) this).aClass282_Sub16Array3615[i] = class282_sub16;
				} else
					aBool3619 = false;
				((Class308) this).aClass473_3612.method7873(class282_sub16, (byte) -55);
				return (((Class308) this).anIntArrayArrayArray3614[(((Class282_Sub16) class282_sub16).anInt7602 * 1598441707)]);
			}
			aBool3619 = ((Class308) this).anInt3616 * -280749065 != i;
			((Class308) this).anInt3616 = i * -1013639737;
			return ((Class308) this).anIntArrayArrayArray3614[0];
		}
		aBool3619 = null == ((Class308) this).aClass282_Sub16Array3615[i];
		((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614[i];
	}

	public final int[][][] method5468() {
		if (-68706765 * ((Class308) this).anInt3613 != ((Class308) this).anInt3611 * -602074803)
			throw new RuntimeException();
		for (int i = 0; i < ((Class308) this).anInt3613 * -68706765; i++)
			((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614;
	}

	final void method5469() {
		for (int i = 0; i < -68706765 * ((Class308) this).anInt3613; i++) {
			((Class308) this).anIntArrayArrayArray3614[i][0] = null;
			((Class308) this).anIntArrayArrayArray3614[i][1] = null;
			((Class308) this).anIntArrayArrayArray3614[i][2] = null;
			((Class308) this).anIntArrayArrayArray3614[i] = null;
		}
		((Class308) this).aClass282_Sub16Array3615 = null;
		((Class308) this).anIntArrayArrayArray3614 = null;
		((Class308) this).aClass473_3612.method7855((byte) 4);
		((Class308) this).aClass473_3612 = null;
	}

	public final int[][][] method5470() {
		if (-68706765 * ((Class308) this).anInt3613 != ((Class308) this).anInt3611 * -602074803)
			throw new RuntimeException();
		for (int i = 0; i < ((Class308) this).anInt3613 * -68706765; i++)
			((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614;
	}

	public final int[][][] method5471() {
		if (-68706765 * ((Class308) this).anInt3613 != ((Class308) this).anInt3611 * -602074803)
			throw new RuntimeException();
		for (int i = 0; i < ((Class308) this).anInt3613 * -68706765; i++)
			((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614;
	}

	public final int[][][] method5472() {
		if (-68706765 * ((Class308) this).anInt3613 != ((Class308) this).anInt3611 * -602074803)
			throw new RuntimeException();
		for (int i = 0; i < ((Class308) this).anInt3613 * -68706765; i++)
			((Class308) this).aClass282_Sub16Array3615[i] = aClass282_Sub16_3618;
		return ((Class308) this).anIntArrayArrayArray3614;
	}

	public static boolean isWall(int i, int i_7_) {
		return ((i >= 1109376893 * SceneObjectType.WALL_STRAIGHT.type && i <= 1109376893 * SceneObjectType.WALL_STRAIGHT_CORNER.type) || i == 1109376893 * SceneObjectType.WALL_INTERACT.type);
	}

	static final void method5474(CS2Executor class527, int i) {
		int i_8_ = (class527.intOpValues[301123709 * class527.instrPtr]);
		class527.intStackPtr -= 283782002;
		int i_9_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		if (i_9_ < 0 || i_9_ >= class527.globalArrayLengths[i_8_])
			throw new RuntimeException();
		class527.globalArrays[i_8_][i_9_] = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
	}
}
