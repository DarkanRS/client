/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class245 {
	public static final int anInt3009 = 42;
	public static final int anInt3010 = 45;
	public static final int anInt3011 = -4;
	public static final int anInt3012 = -5;
	public static final int anInt3013 = 1;
	public static final int anInt3014 = 6;
	public static final int anInt3015 = 3;
	public static final int anInt3016 = 2;
	public static final int anInt3017 = 7;
	public static final int anInt3018 = 9;
	public static final int anInt3019 = -3;
	public static final int anInt3020 = -2;
	public static final int anInt3021 = 23;
	public static final int anInt3022 = 29;
	public static final int anInt3023 = 35;
	public static final int anInt3024 = 15;
	public static final int anInt3025 = 21;
	public static final int anInt3026 = 48;
	static NativeSprite[] aClass160Array3027;

	Class245() throws Throwable {
		throw new Error();
	}

	static final void method4197(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4614, client.aClass184_7475.isaac, 1498065982);
		class282_sub23.buffer.writeByte(string.length() + 1);
		class282_sub23.buffer.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, 934266754);
	}

	static boolean method4198(int i, int i_0_) {
		return 5 == i || 14 == i || 19 == i || i == 3 || 8 == i || 9 == i;
	}
}
