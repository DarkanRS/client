/* Class47_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class47_Sub1 extends Class47 {
	Class101 aClass101_9124;
	static final int anInt9125 = 4;
	static final int anInt9126 = 1;
	static final int anInt9127 = 2;
	static final int anInt9128 = 3;
	static final int anInt9129 = 3;
	int[][] anIntArrayArray9130;
	static final int anInt9131 = 6;
	static final int anInt9132 = 7;
	static final int anInt9133 = 0;
	static final int anInt9134 = 1;
	static final int anInt9135 = 0;
	static final int anInt9136 = 5;
	Class115[] aClass115Array9137 = new Class115[3];
	static final int anInt9138 = 2;
	int[] anIntArray9139;
	Vector4 aClass303_9140;
	Vector4 aClass303_9141;
	static Class202 aClass202_9142;
	
	public void method936() {
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[0]);
		((Class47_Sub1) this).anIntArray9139 = (((Class47_Sub1) this).anIntArrayArray9130[((Class47_Sub1) this).aClass101_9124.method1714(-2049604923)]);
		method14476((byte) -60);
	}

	boolean method14475(byte i) throws Exception_Sub2 {
		((Class47_Sub1) this).aClass101_9124 = aClass505_Sub2_439.method13890("Sprite");
		Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class47_Sub1) this).aClass101_9124.method1691("WVPMatrix", (short) 15174);
		Class282_Sub21_Sub1 class282_sub21_sub1_0_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteSampler", (short) 14030);
		Class282_Sub21_Sub1 class282_sub21_sub1_1_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskSampler", (short) 25732);
		Class282_Sub21_Sub1 class282_sub21_sub1_2_ = ((Class47_Sub1) this).aClass101_9124.method1691("MulColour", (short) 14326);
		Class282_Sub21_Sub1 class282_sub21_sub1_3_ = ((Class47_Sub1) this).aClass101_9124.method1691("AddColour", (short) 25922);
		Class282_Sub21_Sub1 class282_sub21_sub1_4_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteTexCoordMatrix", (short) 30502);
		Class282_Sub21_Sub1 class282_sub21_sub1_5_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskTexCoordMatrix", (short) 12246);
		((Class47_Sub1) this).aClass115Array9137[0] = ((Class47_Sub1) this).aClass101_9124.method1651("Normal", 1509292021);
		((Class47_Sub1) this).aClass115Array9137[1] = ((Class47_Sub1) this).aClass101_9124.method1651("Masked", 1673746004);
		((Class47_Sub1) this).aClass115Array9137[2] = ((Class47_Sub1) this).aClass101_9124.method1651("AlphaTex", -295690352);
		for (int i_6_ = 0; i_6_ < 3; i_6_++) {
			int i_7_ = (((Class47_Sub1) this).aClass101_9124.method1653(((Class47_Sub1) this).aClass115Array9137[i_6_], (byte) -39));
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][0] = class282_sub21_sub1.method15460(i_7_);
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][1] = class282_sub21_sub1_0_.method15460(i_7_);
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][2] = class282_sub21_sub1_1_.method15460(i_7_);
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][5] = class282_sub21_sub1_2_.method15460(i_7_);
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][6] = class282_sub21_sub1_3_.method15460(i_7_);
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][3] = class282_sub21_sub1_4_.method15460(i_7_);
			((Class47_Sub1) this).anIntArrayArray9130[i_6_][4] = class282_sub21_sub1_5_.method15460(i_7_);
		}
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[0]);
		return true;
	}

	public void method937(int i, int i_8_) {
		switch (i) {
		case 3:
			((Class47_Sub1) this).aClass303_9140.fromInt(0xffffff | i_8_ & ~0xffffff);
			((Class47_Sub1) this).aClass303_9141.fromInt(i_8_ & 0xffffff);
			break;
		case 1:
			((Class47_Sub1) this).aClass303_9140.fromInt(-1);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		case 0:
			((Class47_Sub1) this).aClass303_9140.fromInt(i_8_);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		case 4:
			((Class47_Sub1) this).aClass303_9140.fromInt(-1);
			((Class47_Sub1) this).aClass303_9141.fromInt(i_8_);
			((Class47_Sub1) this).aClass303_9141.negate();
			break;
		case 2:
			((Class47_Sub1) this).aClass303_9140.fromInt(i_8_);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		}
	}

	public void method941() {
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[0]);
		((Class47_Sub1) this).anIntArray9139 = (((Class47_Sub1) this).anIntArrayArray9130[((Class47_Sub1) this).aClass101_9124.method1714(-1970218669)]);
		method14476((byte) -25);
	}

	void method14476(byte i) {
		((Class47_Sub1) this).aClass101_9124.method1646();
		((Class47_Sub1) this).aClass101_9124.method1677((((Class47_Sub1) this).anIntArray9139[1]), 0, anInterface6_443, 243138244);
		aClass505_Sub2_439.method13933(aClass384_442);
		((Class47_Sub1) this).aClass101_9124.method1676((((Class47_Sub1) this).anIntArray9139[0]), aClass384_442, -376306243);
		((Class47_Sub1) this).aClass101_9124.method1675((((Class47_Sub1) this).anIntArray9139[3]), aClass384_440, (byte) 14);
		((Class47_Sub1) this).aClass101_9124.method1749(((Class47_Sub1) this).anIntArray9139[5], ((Class47_Sub1) this).aClass303_9140.x, ((Class47_Sub1) this).aClass303_9140.y, ((Class47_Sub1) this).aClass303_9140.z, ((Class47_Sub1) this).aClass303_9140.w, (byte) 38);
		((Class47_Sub1) this).aClass101_9124.method1749(((Class47_Sub1) this).anIntArray9139[6], ((Class47_Sub1) this).aClass303_9141.x, ((Class47_Sub1) this).aClass303_9141.y, ((Class47_Sub1) this).aClass303_9141.z, ((Class47_Sub1) this).aClass303_9141.w, (byte) 44);
		aClass505_Sub2_439.method14161(0, anInterface4_445);
		aClass505_Sub2_439.method13996(aClass70_447);
		aClass505_Sub2_439.method13923(Class352.aClass352_4104, anInt446, 2);
	}

	public void method938() {
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[1]);
		((Class47_Sub1) this).anIntArray9139 = (((Class47_Sub1) this).anIntArrayArray9130[((Class47_Sub1) this).aClass101_9124.method1714(-1949611478)]);
		((Class47_Sub1) this).aClass101_9124.method1677((((Class47_Sub1) this).anIntArray9139[2]), 1, anInterface6_441, -352323720);
		((Class47_Sub1) this).aClass101_9124.method1675((((Class47_Sub1) this).anIntArray9139[4]), aClass384_444, (byte) 43);
		method14476((byte) -28);
	}

	public void method939(int i, int i_9_) {
		switch (i) {
		case 3:
			((Class47_Sub1) this).aClass303_9140.fromInt(0xffffff | i_9_ & ~0xffffff);
			((Class47_Sub1) this).aClass303_9141.fromInt(i_9_ & 0xffffff);
			break;
		case 1:
			((Class47_Sub1) this).aClass303_9140.fromInt(-1);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		case 0:
			((Class47_Sub1) this).aClass303_9140.fromInt(i_9_);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		case 4:
			((Class47_Sub1) this).aClass303_9140.fromInt(-1);
			((Class47_Sub1) this).aClass303_9141.fromInt(i_9_);
			((Class47_Sub1) this).aClass303_9141.negate();
			break;
		case 2:
			((Class47_Sub1) this).aClass303_9140.fromInt(i_9_);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		}
	}

	public void method940(int i, int i_10_) {
		switch (i) {
		case 3:
			((Class47_Sub1) this).aClass303_9140.fromInt(0xffffff | i_10_ & ~0xffffff);
			((Class47_Sub1) this).aClass303_9141.fromInt(i_10_ & 0xffffff);
			break;
		case 1:
			((Class47_Sub1) this).aClass303_9140.fromInt(-1);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		case 0:
			((Class47_Sub1) this).aClass303_9140.fromInt(i_10_);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		case 4:
			((Class47_Sub1) this).aClass303_9140.fromInt(-1);
			((Class47_Sub1) this).aClass303_9141.fromInt(i_10_);
			((Class47_Sub1) this).aClass303_9141.negate();
			break;
		case 2:
			((Class47_Sub1) this).aClass303_9140.fromInt(i_10_);
			((Class47_Sub1) this).aClass303_9141.fromInt(0);
			break;
		}
	}

	boolean method14477() throws Exception_Sub2 {
		((Class47_Sub1) this).aClass101_9124 = aClass505_Sub2_439.method13890("Sprite");
		Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class47_Sub1) this).aClass101_9124.method1691("WVPMatrix", (short) 17226);
		Class282_Sub21_Sub1 class282_sub21_sub1_11_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteSampler", (short) 12038);
		Class282_Sub21_Sub1 class282_sub21_sub1_12_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskSampler", (short) 26835);
		Class282_Sub21_Sub1 class282_sub21_sub1_13_ = ((Class47_Sub1) this).aClass101_9124.method1691("MulColour", (short) 9837);
		Class282_Sub21_Sub1 class282_sub21_sub1_14_ = ((Class47_Sub1) this).aClass101_9124.method1691("AddColour", (short) 17159);
		Class282_Sub21_Sub1 class282_sub21_sub1_15_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteTexCoordMatrix", (short) 10007);
		Class282_Sub21_Sub1 class282_sub21_sub1_16_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskTexCoordMatrix", (short) 27451);
		((Class47_Sub1) this).aClass115Array9137[0] = ((Class47_Sub1) this).aClass101_9124.method1651("Normal", 41386228);
		((Class47_Sub1) this).aClass115Array9137[1] = ((Class47_Sub1) this).aClass101_9124.method1651("Masked", -86462681);
		((Class47_Sub1) this).aClass115Array9137[2] = ((Class47_Sub1) this).aClass101_9124.method1651("AlphaTex", 1054032870);
		for (int i = 0; i < 3; i++) {
			int i_17_ = (((Class47_Sub1) this).aClass101_9124.method1653(((Class47_Sub1) this).aClass115Array9137[i], (byte) -45));
			((Class47_Sub1) this).anIntArrayArray9130[i][0] = class282_sub21_sub1.method15460(i_17_);
			((Class47_Sub1) this).anIntArrayArray9130[i][1] = class282_sub21_sub1_11_.method15460(i_17_);
			((Class47_Sub1) this).anIntArrayArray9130[i][2] = class282_sub21_sub1_12_.method15460(i_17_);
			((Class47_Sub1) this).anIntArrayArray9130[i][5] = class282_sub21_sub1_13_.method15460(i_17_);
			((Class47_Sub1) this).anIntArrayArray9130[i][6] = class282_sub21_sub1_14_.method15460(i_17_);
			((Class47_Sub1) this).anIntArrayArray9130[i][3] = class282_sub21_sub1_15_.method15460(i_17_);
			((Class47_Sub1) this).anIntArrayArray9130[i][4] = class282_sub21_sub1_16_.method15460(i_17_);
		}
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[0]);
		return true;
	}

	public Class47_Sub1(Class505_Sub2 class505_sub2) throws Exception_Sub2 {
		super(class505_sub2);
		((Class47_Sub1) this).anIntArrayArray9130 = new int[3][7];
		((Class47_Sub1) this).aClass303_9140 = new Vector4(1.0F, 1.0F, 1.0F, 1.0F);
		((Class47_Sub1) this).aClass303_9141 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);
		method14475((byte) 0);
	}

	public void method942() {
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[1]);
		((Class47_Sub1) this).anIntArray9139 = (((Class47_Sub1) this).anIntArrayArray9130[((Class47_Sub1) this).aClass101_9124.method1714(-2036352690)]);
		((Class47_Sub1) this).aClass101_9124.method1677((((Class47_Sub1) this).anIntArray9139[2]), 1, anInterface6_441, -2038457041);
		((Class47_Sub1) this).aClass101_9124.method1675((((Class47_Sub1) this).anIntArray9139[4]), aClass384_444, (byte) 53);
		method14476((byte) -2);
	}

	void method14478() {
		((Class47_Sub1) this).aClass101_9124.method1646();
		((Class47_Sub1) this).aClass101_9124.method1677((((Class47_Sub1) this).anIntArray9139[1]), 0, anInterface6_443, -1672122134);
		aClass505_Sub2_439.method13933(aClass384_442);
		((Class47_Sub1) this).aClass101_9124.method1676((((Class47_Sub1) this).anIntArray9139[0]), aClass384_442, 731170241);
		((Class47_Sub1) this).aClass101_9124.method1675((((Class47_Sub1) this).anIntArray9139[3]), aClass384_440, (byte) 56);
		((Class47_Sub1) this).aClass101_9124.method1749(((Class47_Sub1) this).anIntArray9139[5], ((Class47_Sub1) this).aClass303_9140.x, ((Class47_Sub1) this).aClass303_9140.y, ((Class47_Sub1) this).aClass303_9140.z, ((Class47_Sub1) this).aClass303_9140.w, (byte) 35);
		((Class47_Sub1) this).aClass101_9124.method1749(((Class47_Sub1) this).anIntArray9139[6], ((Class47_Sub1) this).aClass303_9141.x, ((Class47_Sub1) this).aClass303_9141.y, ((Class47_Sub1) this).aClass303_9141.z, ((Class47_Sub1) this).aClass303_9141.w, (byte) 30);
		aClass505_Sub2_439.method14161(0, anInterface4_445);
		aClass505_Sub2_439.method13996(aClass70_447);
		aClass505_Sub2_439.method13923(Class352.aClass352_4104, anInt446, 2);
	}

	boolean method14479() throws Exception_Sub2 {
		((Class47_Sub1) this).aClass101_9124 = aClass505_Sub2_439.method13890("Sprite");
		Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class47_Sub1) this).aClass101_9124.method1691("WVPMatrix", (short) 6844);
		Class282_Sub21_Sub1 class282_sub21_sub1_18_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteSampler", (short) 28248);
		Class282_Sub21_Sub1 class282_sub21_sub1_19_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskSampler", (short) 31140);
		Class282_Sub21_Sub1 class282_sub21_sub1_20_ = ((Class47_Sub1) this).aClass101_9124.method1691("MulColour", (short) 27482);
		Class282_Sub21_Sub1 class282_sub21_sub1_21_ = ((Class47_Sub1) this).aClass101_9124.method1691("AddColour", (short) 18364);
		Class282_Sub21_Sub1 class282_sub21_sub1_22_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteTexCoordMatrix", (short) 27457);
		Class282_Sub21_Sub1 class282_sub21_sub1_23_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskTexCoordMatrix", (short) 18402);
		((Class47_Sub1) this).aClass115Array9137[0] = ((Class47_Sub1) this).aClass101_9124.method1651("Normal", -511161178);
		((Class47_Sub1) this).aClass115Array9137[1] = ((Class47_Sub1) this).aClass101_9124.method1651("Masked", -1262401972);
		((Class47_Sub1) this).aClass115Array9137[2] = ((Class47_Sub1) this).aClass101_9124.method1651("AlphaTex", 1636783284);
		for (int i = 0; i < 3; i++) {
			int i_24_ = (((Class47_Sub1) this).aClass101_9124.method1653(((Class47_Sub1) this).aClass115Array9137[i], (byte) -52));
			((Class47_Sub1) this).anIntArrayArray9130[i][0] = class282_sub21_sub1.method15460(i_24_);
			((Class47_Sub1) this).anIntArrayArray9130[i][1] = class282_sub21_sub1_18_.method15460(i_24_);
			((Class47_Sub1) this).anIntArrayArray9130[i][2] = class282_sub21_sub1_19_.method15460(i_24_);
			((Class47_Sub1) this).anIntArrayArray9130[i][5] = class282_sub21_sub1_20_.method15460(i_24_);
			((Class47_Sub1) this).anIntArrayArray9130[i][6] = class282_sub21_sub1_21_.method15460(i_24_);
			((Class47_Sub1) this).anIntArrayArray9130[i][3] = class282_sub21_sub1_22_.method15460(i_24_);
			((Class47_Sub1) this).anIntArrayArray9130[i][4] = class282_sub21_sub1_23_.method15460(i_24_);
		}
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[0]);
		return true;
	}

	void method14480() {
		((Class47_Sub1) this).aClass101_9124.method1646();
		((Class47_Sub1) this).aClass101_9124.method1677((((Class47_Sub1) this).anIntArray9139[1]), 0, anInterface6_443, 1643054507);
		aClass505_Sub2_439.method13933(aClass384_442);
		((Class47_Sub1) this).aClass101_9124.method1676((((Class47_Sub1) this).anIntArray9139[0]), aClass384_442, -1760623207);
		((Class47_Sub1) this).aClass101_9124.method1675((((Class47_Sub1) this).anIntArray9139[3]), aClass384_440, (byte) 7);
		((Class47_Sub1) this).aClass101_9124.method1749(((Class47_Sub1) this).anIntArray9139[5], ((Class47_Sub1) this).aClass303_9140.x, ((Class47_Sub1) this).aClass303_9140.y, ((Class47_Sub1) this).aClass303_9140.z, ((Class47_Sub1) this).aClass303_9140.w, (byte) 110);
		((Class47_Sub1) this).aClass101_9124.method1749(((Class47_Sub1) this).anIntArray9139[6], ((Class47_Sub1) this).aClass303_9141.x, ((Class47_Sub1) this).aClass303_9141.y, ((Class47_Sub1) this).aClass303_9141.z, ((Class47_Sub1) this).aClass303_9141.w, (byte) 47);
		aClass505_Sub2_439.method14161(0, anInterface4_445);
		aClass505_Sub2_439.method13996(aClass70_447);
		aClass505_Sub2_439.method13923(Class352.aClass352_4104, anInt446, 2);
	}

	boolean method14481() throws Exception_Sub2 {
		((Class47_Sub1) this).aClass101_9124 = aClass505_Sub2_439.method13890("Sprite");
		Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class47_Sub1) this).aClass101_9124.method1691("WVPMatrix", (short) 28609);
		Class282_Sub21_Sub1 class282_sub21_sub1_25_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteSampler", (short) 31997);
		Class282_Sub21_Sub1 class282_sub21_sub1_26_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskSampler", (short) 32638);
		Class282_Sub21_Sub1 class282_sub21_sub1_27_ = ((Class47_Sub1) this).aClass101_9124.method1691("MulColour", (short) 22955);
		Class282_Sub21_Sub1 class282_sub21_sub1_28_ = ((Class47_Sub1) this).aClass101_9124.method1691("AddColour", (short) 18538);
		Class282_Sub21_Sub1 class282_sub21_sub1_29_ = ((Class47_Sub1) this).aClass101_9124.method1691("SpriteTexCoordMatrix", (short) 19033);
		Class282_Sub21_Sub1 class282_sub21_sub1_30_ = ((Class47_Sub1) this).aClass101_9124.method1691("MaskTexCoordMatrix", (short) 12636);
		((Class47_Sub1) this).aClass115Array9137[0] = ((Class47_Sub1) this).aClass101_9124.method1651("Normal", -262736063);
		((Class47_Sub1) this).aClass115Array9137[1] = ((Class47_Sub1) this).aClass101_9124.method1651("Masked", -197062230);
		((Class47_Sub1) this).aClass115Array9137[2] = ((Class47_Sub1) this).aClass101_9124.method1651("AlphaTex", 1960746486);
		for (int i = 0; i < 3; i++) {
			int i_31_ = (((Class47_Sub1) this).aClass101_9124.method1653(((Class47_Sub1) this).aClass115Array9137[i], (byte) -70));
			((Class47_Sub1) this).anIntArrayArray9130[i][0] = class282_sub21_sub1.method15460(i_31_);
			((Class47_Sub1) this).anIntArrayArray9130[i][1] = class282_sub21_sub1_25_.method15460(i_31_);
			((Class47_Sub1) this).anIntArrayArray9130[i][2] = class282_sub21_sub1_26_.method15460(i_31_);
			((Class47_Sub1) this).anIntArrayArray9130[i][5] = class282_sub21_sub1_27_.method15460(i_31_);
			((Class47_Sub1) this).anIntArrayArray9130[i][6] = class282_sub21_sub1_28_.method15460(i_31_);
			((Class47_Sub1) this).anIntArrayArray9130[i][3] = class282_sub21_sub1_29_.method15460(i_31_);
			((Class47_Sub1) this).anIntArrayArray9130[i][4] = class282_sub21_sub1_30_.method15460(i_31_);
		}
		((Class47_Sub1) this).aClass101_9124.method1655(((Class47_Sub1) this).aClass115Array9137[0]);
		return true;
	}

	static final void method14482(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		int i_32_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_33_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_33_ >= 1 && i_33_ <= 10)
			class118.method2039(i_33_ - 1, i_32_, 1711719581);
	}
}
