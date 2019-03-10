public class Class308 {

	public static client aclient3620;

	public static short[] aShortArray3621;

	static Class282_Sub16 aClass282_Sub16_3618 = new Class282_Sub16(0, 0);

	Class282_Sub16[] aClass282_Sub16Array3615;

	int[][][] anIntArrayArrayArray3614;

	LinkedNodeList aClass473_3612 = new LinkedNodeList();

	public boolean aBool3619 = false;

	int anInt3617 = 0;

	int anInt3616 = -1;

	int anInt3611;

	int anInt3613;

	final void method5462(byte b_1) {
		for (int i_2 = 0; i_2 < this.anInt3613; i_2++) {
			this.anIntArrayArrayArray3614[i_2][0] = null;
			this.anIntArrayArrayArray3614[i_2][1] = null;
			this.anIntArrayArrayArray3614[i_2][2] = null;
			this.anIntArrayArrayArray3614[i_2] = null;
		}
		this.aClass282_Sub16Array3615 = null;
		this.anIntArrayArrayArray3614 = null;
		this.aClass473_3612.clear();
		this.aClass473_3612 = null;
	}

	public final int[][] method5463(int i_1, int i_2) {
		if (this.anInt3611 != this.anInt3613) {
			if (this.anInt3613 != 1) {
				Class282_Sub16 class282_sub16_3 = this.aClass282_Sub16Array3615[i_1];
				if (class282_sub16_3 == null) {
					this.aBool3619 = true;
					if (this.anInt3617 >= this.anInt3613) {
						Class282_Sub16 class282_sub16_4 = (Class282_Sub16) this.aClass473_3612.getNext();
						class282_sub16_3 = new Class282_Sub16(i_1, class282_sub16_4.anInt7602);
						this.aClass282_Sub16Array3615[class282_sub16_4.anInt7603] = null;
						class282_sub16_4.remove();
					} else {
						class282_sub16_3 = new Class282_Sub16(i_1, this.anInt3617);
						++this.anInt3617;
					}
					this.aClass282_Sub16Array3615[i_1] = class282_sub16_3;
				} else {
					this.aBool3619 = false;
				}
				this.aClass473_3612.insertFront(class282_sub16_3);
				return this.anIntArrayArrayArray3614[class282_sub16_3.anInt7602];
			} else {
				this.aBool3619 = this.anInt3616 != i_1;
				this.anInt3616 = i_1;
				return this.anIntArrayArrayArray3614[0];
			}
		} else {
			this.aBool3619 = this.aClass282_Sub16Array3615[i_1] == null;
			this.aClass282_Sub16Array3615[i_1] = aClass282_Sub16_3618;
			return this.anIntArrayArrayArray3614[i_1];
		}
	}

	public final int[][][] method5464(int i_1) {
		if (this.anInt3613 != this.anInt3611) {
			throw new RuntimeException();
		} else {
			for (int i_2 = 0; i_2 < this.anInt3613; i_2++) {
				this.aClass282_Sub16Array3615[i_2] = aClass282_Sub16_3618;
			}
			return this.anIntArrayArrayArray3614;
		}
	}

	Class308(int i_1, int i_2, int i_3) {
		this.anInt3611 = i_2;
		this.anInt3613 = i_1;
		this.anIntArrayArrayArray3614 = new int[this.anInt3613][3][i_3];
		this.aClass282_Sub16Array3615 = new Class282_Sub16[this.anInt3611];
	}

	public static boolean isWall(int i_0, int i_1) {
		return i_0 >= SceneObjectType.WALL_STRAIGHT.type && i_0 <= SceneObjectType.WALL_STRAIGHT_CORNER.type || i_0 == SceneObjectType.WALL_INTERACT.type;
	}
}
