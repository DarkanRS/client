/* Class468_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468_Sub10 extends Class468 {
	public static final int anInt7897 = 1;
	public static final int anInt7898 = 0;

	public int method12690() {
		return -859024475 * anInt5578;
	}

	public Class468_Sub10(int i, Class282_Sub54 class282_sub54) {
		super(i, class282_sub54);
	}

	public int method12691(int i) {
		return -859024475 * anInt5578;
	}

	public Class468_Sub10(Class282_Sub54 class282_sub54) {
		super(class282_sub54);
	}

	public void method12692(int i) {
		if (anInt5578 * -859024475 != 1 && -859024475 * anInt5578 != 0)
			anInt5578 = method7781(2089221504) * -754033619;
	}

	void method7783(int i, int i_0_) {
		anInt5578 = -754033619 * i;
	}

	int method7787() {
		return 1;
	}

	int method7784(int i) {
		return 1;
	}

	void method7780(int i) {
		anInt5578 = -754033619 * i;
	}

	int method7786() {
		return 1;
	}

	public int method12693() {
		return -859024475 * anInt5578;
	}

	public void method12694() {
		if (anInt5578 * -859024475 != 1 && -859024475 * anInt5578 != 0)
			anInt5578 = method7781(2142304494) * -754033619;
	}

	int method7781(int i) {
		return 1;
	}

	int method7785(int i, int i_1_) {
		return 1;
	}

	public static boolean method12695(byte[] is, byte i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i_2_ = class282_sub35.readUnsignedByte();
		if (i_2_ != 2)
			return false;
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		if (bool)
			Class411.method6912(class282_sub35, 1288904902);
		Class359.method6241(class282_sub35, 587524029);
		return true;
	}

	static void method12696(RsByteBuffer class282_sub35, int i) {
		if ((class282_sub35.buffer.length - -1990677291 * class282_sub35.index) >= 1) {
			int i_3_ = class282_sub35.readUnsignedByte();
			if (i_3_ >= 0 && i_3_ <= 1 && (class282_sub35.buffer.length - -1990677291 * class282_sub35.index) >= 2) {
				int i_4_ = class282_sub35.readUnsignedShort();
				if ((class282_sub35.buffer.length - -1990677291 * class282_sub35.index) >= 6 * i_4_) {
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						int i_6_ = class282_sub35.readUnsignedShort();
						int i_7_ = class282_sub35.readInt();
						if (i_6_ < Class320.anIntArray3724.length && Class282_Sub17_Sub2.aBoolArray9934[i_6_] && ((client.aClass408_7207.method6873(i_6_, (byte) 37).aChar4984) != '1' || i_7_ >= -1 && i_7_ <= 1))
							Class320.anIntArray3724[i_6_] = i_7_;
					}
				}
			}
		}
	}
}
