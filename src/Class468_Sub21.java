/* Class468_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468_Sub21 extends Class468 {
	public void method12860() {
		if (-859024475 * anInt5578 < 0 || anInt5578 * -859024475 > 4)
			anInt5578 = method7781(2101968720) * -754033619;
	}

	public Class468_Sub21(int i, Class282_Sub54 class282_sub54) {
		super(i, class282_sub54);
	}

	public void method12861(int i) {
		if (-859024475 * anInt5578 < 0 || anInt5578 * -859024475 > 4)
			anInt5578 = method7781(1833294862) * -754033619;
	}

	public int method12862() {
		return -859024475 * anInt5578;
	}

	int method7785(int i, int i_0_) {
		return 1;
	}

	public void method12863() {
		if (-859024475 * anInt5578 < 0 || anInt5578 * -859024475 > 4)
			anInt5578 = method7781(1957622901) * -754033619;
	}

	public Class468_Sub21(Class282_Sub54 class282_sub54) {
		super(class282_sub54);
	}

	int method7784(int i) {
		return 1;
	}

	void method7780(int i) {
		anInt5578 = -754033619 * i;
	}

	public void method12864() {
		if (-859024475 * anInt5578 < 0 || anInt5578 * -859024475 > 4)
			anInt5578 = method7781(1973489766) * -754033619;
	}

	public int method12865(int i) {
		return -859024475 * anInt5578;
	}

	int method7781(int i) {
		return 3;
	}

	public int method12866() {
		return -859024475 * anInt5578;
	}

	public int method12867() {
		return -859024475 * anInt5578;
	}

	void method7783(int i, int i_1_) {
		anInt5578 = -754033619 * i;
	}

	public int method12868() {
		return -859024475 * anInt5578;
	}

	int method7786() {
		return 3;
	}

	int method7787() {
		return 3;
	}

	public static void method12869(boolean bool, int i) {
		if (2 != -891719545 * client.anInt7341 && 1 != client.anInt7341 * -891719545) {
			if (!bool) {
				Class96[] class96s = Class86.aClass96Array822;
				for (int i_2_ = 0; i_2_ < class96s.length; i_2_++) {
					Class96 class96 = class96s[i_2_];
					class96.method1593((byte) 1);
				}
			}
			client.anInt7341 = 761834094;
			NativeLibraryLoader.anIntArrayArray3239 = null;
			Class276.aClass282_Sub35_3346 = null;
			client.aBool7321 = false;
			Class79.method1390(2119033925);
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4572, client.aClass184_7475.isaac, 775399982);
			class282_sub23.buffer.writeByte(bool ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, 663784831);
		}
	}
}
