/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class207 {
	int anInt2653 = 1679369983;
	int anInt2654 = -244535397;
	int[] anIntArray2655;
	Class204 aClass204_2656 = Class204.aClass204_2579;
	int anInt2657 = -580872743;
	public static Class421 aClass421_2658;

	void method3548(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((Class207) this).anInt2653 = class282_sub35.readUnsignedShort() * -1679369983;
		else if (2 == i) {
			((Class207) this).anIntArray2655 = new int[class282_sub35.readUnsignedByte()];
			for (int i_0_ = 0; i_0_ < ((Class207) this).anIntArray2655.length; i_0_++)
				((Class207) this).anIntArray2655[i_0_] = class282_sub35.readUnsignedShort();
		} else if (i == 3)
			((Class207) this).anInt2654 = class282_sub35.readUnsignedByte() * 244535397;
		else if (i == 4)
			((Class207) this).aClass204_2656 = ((Class204) Class386.method6672(Class530.method11353(-987111968), class282_sub35.readUnsignedByte(), -1655373565));
		else if (5 == i)
			((Class207) this).anInt2657 = class282_sub35.readBigSmart(2032060376) * 580872743;
	}

	void method3549(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method3552(class282_sub35, i_1_, (byte) 127);
		}
	}

	void method3550(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((Class207) this).anInt2653 = class282_sub35.readUnsignedShort() * -1679369983;
		else if (2 == i) {
			((Class207) this).anIntArray2655 = new int[class282_sub35.readUnsignedByte()];
			for (int i_2_ = 0; i_2_ < ((Class207) this).anIntArray2655.length; i_2_++)
				((Class207) this).anIntArray2655[i_2_] = class282_sub35.readUnsignedShort();
		} else if (i == 3)
			((Class207) this).anInt2654 = class282_sub35.readUnsignedByte() * 244535397;
		else if (i == 4)
			((Class207) this).aClass204_2656 = ((Class204) Class386.method6672(Class530.method11353(-973471054), class282_sub35.readUnsignedByte(), -2111624137));
		else if (5 == i)
			((Class207) this).anInt2657 = class282_sub35.readBigSmart(1982058382) * 580872743;
	}

	Class207() {
		/* empty */
	}

	void method3551(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((Class207) this).anInt2653 = class282_sub35.readUnsignedShort() * -1679369983;
		else if (2 == i) {
			((Class207) this).anIntArray2655 = new int[class282_sub35.readUnsignedByte()];
			for (int i_3_ = 0; i_3_ < ((Class207) this).anIntArray2655.length; i_3_++)
				((Class207) this).anIntArray2655[i_3_] = class282_sub35.readUnsignedShort();
		} else if (i == 3)
			((Class207) this).anInt2654 = class282_sub35.readUnsignedByte() * 244535397;
		else if (i == 4)
			((Class207) this).aClass204_2656 = ((Class204) Class386.method6672(Class530.method11353(-970645072), class282_sub35.readUnsignedByte(), -888813501));
		else if (5 == i)
			((Class207) this).anInt2657 = class282_sub35.readBigSmart(2121397366) * 580872743;
	}

	void method3552(RsByteBuffer class282_sub35, int i, byte i_4_) {
		if (i == 1)
			((Class207) this).anInt2653 = class282_sub35.readUnsignedShort() * -1679369983;
		else if (2 == i) {
			((Class207) this).anIntArray2655 = new int[class282_sub35.readUnsignedByte()];
			for (int i_5_ = 0; i_5_ < ((Class207) this).anIntArray2655.length; i_5_++)
				((Class207) this).anIntArray2655[i_5_] = class282_sub35.readUnsignedShort();
		} else if (i == 3)
			((Class207) this).anInt2654 = class282_sub35.readUnsignedByte() * 244535397;
		else if (i == 4)
			((Class207) this).aClass204_2656 = ((Class204) Class386.method6672(Class530.method11353(-430210137), class282_sub35.readUnsignedByte(), -1538541275));
		else if (5 == i)
			((Class207) this).anInt2657 = class282_sub35.readBigSmart(2015977415) * 580872743;
	}

	static void method3553(CS2Executor class527, byte i) {
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = (Class409.aClass242_4922.method4156((((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 - 2]), -1396181317).aStringArray2971[(((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 - 1])]);
		((CS2Executor) class527).anInt7012 -= 283782002;
	}

	static final void method3554(CS2Executor class527, int i) {
		int i_6_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_6_, (byte) 71);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_6_ >> 16];
		Class511.method8754(class118, class98, class527, 1449946769);
	}

	static final void method3555(CS2Executor class527, int i) {
		Class42.method890((((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537)]), 255, 50, (byte) 39);
	}

	static final void method3556(CS2Executor class527, int i) {
		int i_7_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1333145388);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14778(i_7_ >> 28 & 0x3, i_7_ >> 14 & 0x3fff, i_7_ & 0x3fff, Class517.anIntArray5900, -1889413502);
			if (bool)
				Class8_Sub2.method14263(Class517.anIntArray5900[1], Class517.anIntArray5900[2], (byte) 0);
		}
	}

	static final void method3557(CS2Executor class527, byte i) {
		int i_8_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (null != Class291_Sub1.aClass465_8025) {
			Class282 class282 = Class291_Sub1.aClass465_8025.method7754((long) i_8_);
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	public static Class282_Sub23 method3558(byte i) {
		Class282_Sub23 class282_sub23 = Class158_Sub2.method14356((short) 2048);
		((Class282_Sub23) class282_sub23).aClass379_7681 = null;
		((Class282_Sub23) class282_sub23).anInt7678 = 0;
		class282_sub23.aClass282_Sub35_Sub2_7682 = new RsBitsBuffer(5000);
		return class282_sub23;
	}
}
