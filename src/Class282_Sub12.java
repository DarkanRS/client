/* Class282_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub12 extends Node {
	public static final int anInt7549 = 7;
	public static final int anInt7550 = 1;
	public static final int anInt7551 = 2;
	public static final int anInt7552 = 3;
	public static final int anInt7553 = 5;
	static final int anInt7554 = 6;
	public static final int anInt7555 = 0;
	public static final int anInt7556 = 8;
	public static final int anInt7557 = 9;
	public static final int anInt7558 = 10;
	int anInt7559;
	int[][] anIntArrayArray7560;
	int[] anIntArray7561;
	int[] anIntArray7562;
	boolean[] aBoolArray7563;
	int anInt7564;

	Class282_Sub12(int i, byte[] is) {
		((Class282_Sub12) this).anInt7559 = i * 886409209;
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		((Class282_Sub12) this).anInt7564 = class282_sub35.readUnsignedByte() * 558271661;
		((Class282_Sub12) this).anIntArray7562 = new int[1693890341 * ((Class282_Sub12) this).anInt7564];
		((Class282_Sub12) this).anIntArrayArray7560 = new int[1693890341 * ((Class282_Sub12) this).anInt7564][];
		((Class282_Sub12) this).aBoolArray7563 = new boolean[1693890341 * ((Class282_Sub12) this).anInt7564];
		((Class282_Sub12) this).anIntArray7561 = new int[((Class282_Sub12) this).anInt7564 * 1693890341];
		for (int i_0_ = 0; i_0_ < ((Class282_Sub12) this).anInt7564 * 1693890341; i_0_++) {
			((Class282_Sub12) this).anIntArray7562[i_0_] = class282_sub35.readUnsignedByte();
			if (((Class282_Sub12) this).anIntArray7562[i_0_] == 6)
				((Class282_Sub12) this).anIntArray7562[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < 1693890341 * ((Class282_Sub12) this).anInt7564; i_1_++)
			((Class282_Sub12) this).aBoolArray7563[i_1_] = class282_sub35.readUnsignedByte() == 1;
		for (int i_2_ = 0; i_2_ < 1693890341 * ((Class282_Sub12) this).anInt7564; i_2_++)
			((Class282_Sub12) this).anIntArray7561[i_2_] = class282_sub35.readUnsignedShort();
		for (int i_3_ = 0; i_3_ < ((Class282_Sub12) this).anInt7564 * 1693890341; i_3_++)
			((Class282_Sub12) this).anIntArrayArray7560[i_3_] = new int[class282_sub35.readUnsignedByte()];
		for (int i_4_ = 0; i_4_ < 1693890341 * ((Class282_Sub12) this).anInt7564; i_4_++) {
			for (int i_5_ = 0; (i_5_ < ((Class282_Sub12) this).anIntArrayArray7560[i_4_].length); i_5_++)
				((Class282_Sub12) this).anIntArrayArray7560[i_4_][i_5_] = class282_sub35.readUnsignedByte();
		}
	}

	static void method12212(Class282_Sub50_Sub15 class282_sub50_sub15, int i, int i_6_) {
		if (Class20.aBool161) {
			FontMetrics class414 = Class114.method1887(-1200220753);
			int i_7_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(-726833918))) {
				int i_8_ = Class282_Sub50_Sub17.method15507(class282_sub50_sub7, class414, 943671530);
				if (i_8_ > i_7_)
					i_7_ = i_8_;
			}
			i_7_ += 8;
			int i_9_ = ((997766473 * Class20.anInt178 * (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253)) + 21);
			Class521_Sub1_Sub5_Sub1.anInt10526 = -628178221 * ((Class20.aBool187 ? 26 : 22) + (Class20.anInt178 * 997766473 * (2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)));
			int i_10_ = (1742345613 * Class301.anInt3555 + Class158_Sub2.anInt8975 * -13788709);
			if (i_7_ + i_10_ > Class349.anInt4083 * -418109423)
				i_10_ = 1742345613 * Class301.anInt3555 - i_7_;
			if (i_10_ < 0)
				i_10_ = 0;
			int i_11_ = (Class20.aBool187 ? 1 + (20 + 397683159 * class414.anInt4978) : 31);
			int i_12_ = class414.anInt4978 * 397683159 + (i - i_11_) + 1;
			if (i_9_ + i_12_ > Engine.anInt3243 * -969250379)
				i_12_ = Engine.anInt3243 * -969250379 - i_9_;
			if (i_12_ < 0)
				i_12_ = 0;
			Class341.anInt3996 = -1046325159 * i_10_;
			Class282_Sub50_Sub2.anInt9471 = i_12_ * 442655807;
			Class96_Sub3.anInt8518 = i_7_ * 694445155;
			Class20.aClass282_Sub50_Sub15_163 = class282_sub50_sub15;
		}
	}
}
