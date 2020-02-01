package com.jagex;
public abstract class Class217 {

	int worldIndex;
	public int flags;
	public int playerCount;

	public boolean isMembers() {
		return (this.flags & 0x1) != 0;
	}

	public boolean is0x2() {
		return (this.flags & 0x2) != 0;
	}

	public boolean is0x4() {
		return (this.flags & 0x4) != 0;
	}

	public boolean isLootshare() {
		return (this.flags & 0x8) != 0;
	}

	public static void method3690(Index index_0, int i_1, int i_3, Node_Sub15_Sub2 class282_sub15_sub2_5) {
		Class11.method13400(index_0, i_1, i_3, (byte) -86);
		Node_Sub33.aNode_Sub15_Sub2_7836 = class282_sub15_sub2_5;
	}

	public static MouseRecord_Sub1 method3694(int x, int y, int i_2, int i_3, int i_4) {
		MouseRecord_Sub1[] arr_5 = MouseRecord_Sub1.aMouseRecord_Sub1Array9497;
		synchronized (MouseRecord_Sub1.aMouseRecord_Sub1Array9497) {
			MouseRecord_Sub1 class282_sub53_sub1_6;
			if (Class81.anInt803 == 0) {
				class282_sub53_sub1_6 = new MouseRecord_Sub1();
			} else {
				class282_sub53_sub1_6 = MouseRecord_Sub1.aMouseRecord_Sub1Array9497[--Class81.anInt803];
			}
			class282_sub53_sub1_6.x = x;
			class282_sub53_sub1_6.y = y;
			class282_sub53_sub1_6.anInt9513 = i_2;
			class282_sub53_sub1_6.anInt9514 = i_3;
			class282_sub53_sub1_6.time = Utils.time();
			return class282_sub53_sub1_6;
		}
	}
}
