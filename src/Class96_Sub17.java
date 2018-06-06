/* Class96_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub17 extends Class96 {
	int anInt9385;
	int anInt9386;
	String aString9387;
	int anInt9388;
	int anInt9389;

	Class96_Sub17(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub17) this).anInt9385 = class282_sub35.readUnsignedShort() * -1930592711;
		((Class96_Sub17) this).anInt9386 = class282_sub35.readUnsignedShort() * -621881623;
		((Class96_Sub17) this).aString9387 = class282_sub35.readString();
		((Class96_Sub17) this).anInt9388 = class282_sub35.readInt() * -1475639137;
		((Class96_Sub17) this).anInt9389 = class282_sub35.readUnsignedShort() * -159499065;
	}

	public void method1592(int i) {
		Class59.method1161(Class4.anInt35 * 675588453, 31133705 * ((Class96_Sub17) this).anInt9385, ((Class96_Sub17) this).anInt9386 * -2086575783, (Class504.method8389(31133705 * ((Class96_Sub17) this).anInt9385, -2086575783 * ((Class96_Sub17) this).anInt9386, 675588453 * Class4.anInt35, (byte) 47)), ((Class96_Sub17) this).anInt9389 * -469908233, ((Class96_Sub17) this).anInt9388 * 882611039, ((Class96_Sub17) this).aString9387, (short) 12244);
	}

	public void method1601() {
		Class59.method1161(Class4.anInt35 * 675588453, 31133705 * ((Class96_Sub17) this).anInt9385, ((Class96_Sub17) this).anInt9386 * -2086575783, (Class504.method8389(31133705 * ((Class96_Sub17) this).anInt9385, -2086575783 * ((Class96_Sub17) this).anInt9386, 675588453 * Class4.anInt35, (byte) 93)), ((Class96_Sub17) this).anInt9389 * -469908233, ((Class96_Sub17) this).anInt9388 * 882611039, ((Class96_Sub17) this).aString9387, (short) 20309);
	}

	static final void method14653(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -271288407) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1353 = Class351.method6193(string, class527, 1245386660);
		class118.aBool1384 = true;
	}

	static final boolean method14654(int i, int i_0_, Class225 class225, Class336 class336, int i_1_) {
		int i_2_ = i;
		int i_3_ = i_0_;
		int i_4_ = 64;
		int i_5_ = 64;
		int i_6_ = i - i_4_;
		int i_7_ = i_0_ - i_5_;
		Class251.anIntArrayArray3096[i_4_][i_5_] = 99;
		Class251.anIntArrayArray3102[i_4_][i_5_] = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		Class251.anIntArray3101[i_8_] = i_2_;
		Class251.anIntArray3099[i_8_++] = i_3_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_9_ != i_8_) {
			i_2_ = Class251.anIntArray3101[i_9_];
			i_3_ = Class251.anIntArray3099[i_9_];
			i_9_ = 1 + i_9_ & 0xfff;
			i_4_ = i_2_ - i_6_;
			i_5_ = i_3_ - i_7_;
			int i_10_ = i_2_ - -1969357273 * class336.anInt3931;
			int i_11_ = i_3_ - 1503444365 * class336.anInt3964;
			if (class225.method3787(1, i_2_, i_3_, class336, (byte) -1)) {
				Class251.anInt3098 = i_2_ * -1071145131;
				Class251.anInt3095 = -1330567915 * i_3_;
				return true;
			}
			int i_12_ = Class251.anIntArrayArray3102[i_4_][i_5_] + 1;
			if (i_4_ > 0 && Class251.anIntArrayArray3096[i_4_ - 1][i_5_] == 0 && (is[i_10_ - 1][i_11_] & 0x42240000) == 0) {
				Class251.anIntArray3101[i_8_] = i_2_ - 1;
				Class251.anIntArray3099[i_8_] = i_3_;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[i_4_ - 1][i_5_] = 2;
				Class251.anIntArrayArray3102[i_4_ - 1][i_5_] = i_12_;
			}
			if (i_4_ < 127 && Class251.anIntArrayArray3096[i_4_ + 1][i_5_] == 0 && 0 == (is[1 + i_10_][i_11_] & 0x60240000)) {
				Class251.anIntArray3101[i_8_] = 1 + i_2_;
				Class251.anIntArray3099[i_8_] = i_3_;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[1 + i_4_][i_5_] = 8;
				Class251.anIntArrayArray3102[i_4_ + 1][i_5_] = i_12_;
			}
			if (i_5_ > 0 && 0 == Class251.anIntArrayArray3096[i_4_][i_5_ - 1] && 0 == (is[i_10_][i_11_ - 1] & 0x40a40000)) {
				Class251.anIntArray3101[i_8_] = i_2_;
				Class251.anIntArray3099[i_8_] = i_3_ - 1;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[i_4_][i_5_ - 1] = 1;
				Class251.anIntArrayArray3102[i_4_][i_5_ - 1] = i_12_;
			}
			if (i_5_ < 127 && 0 == Class251.anIntArrayArray3096[i_4_][i_5_ + 1] && (is[i_10_][i_11_ + 1] & 0x48240000) == 0) {
				Class251.anIntArray3101[i_8_] = i_2_;
				Class251.anIntArray3099[i_8_] = i_3_ + 1;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[i_4_][1 + i_5_] = 4;
				Class251.anIntArrayArray3102[i_4_][1 + i_5_] = i_12_;
			}
			if (i_4_ > 0 && i_5_ > 0 && Class251.anIntArrayArray3096[i_4_ - 1][i_5_ - 1] == 0 && 0 == (is[i_10_ - 1][i_11_ - 1] & 0x43a40000) && (is[i_10_ - 1][i_11_] & 0x42240000) == 0 && 0 == (is[i_10_][i_11_ - 1] & 0x40a40000)) {
				Class251.anIntArray3101[i_8_] = i_2_ - 1;
				Class251.anIntArray3099[i_8_] = i_3_ - 1;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[i_4_ - 1][i_5_ - 1] = 3;
				Class251.anIntArrayArray3102[i_4_ - 1][i_5_ - 1] = i_12_;
			}
			if (i_4_ < 127 && i_5_ > 0 && 0 == Class251.anIntArrayArray3096[i_4_ + 1][i_5_ - 1] && (is[1 + i_10_][i_11_ - 1] & 0x60e40000) == 0 && 0 == (is[1 + i_10_][i_11_] & 0x60240000) && (is[i_10_][i_11_ - 1] & 0x40a40000) == 0) {
				Class251.anIntArray3101[i_8_] = i_2_ + 1;
				Class251.anIntArray3099[i_8_] = i_3_ - 1;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[1 + i_4_][i_5_ - 1] = 9;
				Class251.anIntArrayArray3102[1 + i_4_][i_5_ - 1] = i_12_;
			}
			if (i_4_ > 0 && i_5_ < 127 && Class251.anIntArrayArray3096[i_4_ - 1][1 + i_5_] == 0 && 0 == (is[i_10_ - 1][1 + i_11_] & 0x4e240000) && (is[i_10_ - 1][i_11_] & 0x42240000) == 0 && 0 == (is[i_10_][1 + i_11_] & 0x48240000)) {
				Class251.anIntArray3101[i_8_] = i_2_ - 1;
				Class251.anIntArray3099[i_8_] = i_3_ + 1;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[i_4_ - 1][i_5_ + 1] = 6;
				Class251.anIntArrayArray3102[i_4_ - 1][1 + i_5_] = i_12_;
			}
			if (i_4_ < 127 && i_5_ < 127 && 0 == Class251.anIntArrayArray3096[1 + i_4_][1 + i_5_] && (is[i_10_ + 1][1 + i_11_] & 0x78240000) == 0 && (is[1 + i_10_][i_11_] & 0x60240000) == 0 && (is[i_10_][1 + i_11_] & 0x48240000) == 0) {
				Class251.anIntArray3101[i_8_] = 1 + i_2_;
				Class251.anIntArray3099[i_8_] = 1 + i_3_;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[1 + i_4_][1 + i_5_] = 12;
				Class251.anIntArrayArray3102[i_4_ + 1][1 + i_5_] = i_12_;
			}
		}
		Class251.anInt3098 = i_2_ * -1071145131;
		Class251.anInt3095 = i_3_ * -1330567915;
		return false;
	}

	static final void method14655(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class115.anInt1247 * 842593263;
	}

	public static void method14656(int i, int i_13_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(20, (long) i);
		class282_sub50_sub12.method14965((byte) 40);
	}
}
