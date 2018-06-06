/* Class468_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468_Sub19 extends Class468 {
	public static final int anInt7915 = 0;
	public static final int anInt7916 = 1;

	void method7783(int i, int i_0_) {
		anInt5578 = i * -754033619;
	}

	public Class468_Sub19(int i, Class282_Sub54 class282_sub54) {
		super(i, class282_sub54);
	}

	public void method12785(int i) {
		if (1 != anInt5578 * -859024475 && 0 != anInt5578 * -859024475)
			anInt5578 = method7781(1848490325) * -754033619;
	}

	int method7781(int i) {
		return 1;
	}

	int method7785(int i, int i_1_) {
		return 1;
	}

	int method7786() {
		return 1;
	}

	public int method12786(int i) {
		return anInt5578 * -859024475;
	}

	void method7780(int i) {
		anInt5578 = i * -754033619;
	}

	int method7784(int i) {
		return 1;
	}

	public Class468_Sub19(Class282_Sub54 class282_sub54) {
		super(class282_sub54);
	}

	public int method12787() {
		return anInt5578 * -859024475;
	}

	public int method12788() {
		return anInt5578 * -859024475;
	}

	public void method12789() {
		if (1 != anInt5578 * -859024475 && 0 != anInt5578 * -859024475)
			anInt5578 = method7781(1970100188) * -754033619;
	}

	int method7787() {
		return 1;
	}

	public static final void method12790(boolean bool, int i, int i_2_) {
		Class282_Sub4 class282_sub4 = (bool ? Class113.aClass282_Sub4_1235 : Class202_Sub1.aClass282_Sub4_8186);
		if (class282_sub4 != null && i >= 0 && i < class282_sub4.anInt7503 * 1014406051) {
			Class57 class57 = class282_sub4.aClass57Array7499[i];
			if (-1 == class57.aByte525) {
				String string = class57.aString524;
				Class184 class184 = Class468_Sub20.method12807(-1321489648);
				TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4617, class184.isaac, 1070287495);
				class282_sub23.buffer.writeByte(3 + ChatLine.getLength(string));
				class282_sub23.buffer.writeByte(bool ? 1 : 0);
				class282_sub23.buffer.writeShort(i, 1417031095);
				class282_sub23.buffer.writeString(string);
				class184.method3049(class282_sub23, -920214831);
			}
		}
	}
}
