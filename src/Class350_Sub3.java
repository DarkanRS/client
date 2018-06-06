/* Class350_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class350_Sub3 extends Class350 {
	public int anInt7840;
	public int anInt7841;
	public int anInt7842;
	public int anInt7843;
	public int anInt7844;
	public int anInt7845;

	public static Class350 method12588(RsByteBuffer class282_sub35) {
		Class350 class350 = Class383.method6512(class282_sub35, 88062096);
		int i = class282_sub35.readBigSmart();
		int i_0_ = class282_sub35.readBigSmart();
		int i_1_ = class282_sub35.readBigSmart();
		int i_2_ = class282_sub35.readBigSmart();
		int i_3_ = class282_sub35.readBigSmart();
		int i_4_ = class282_sub35.readBigSmart();
		return new Class350_Sub3(class350.aClass356_4094, class350.aClass353_4087, class350.anInt4090 * -1967081549, class350.anInt4089 * -1196256967, class350.anInt4093 * 329542577, class350.anInt4088 * 323608093, class350.anInt4092 * -1921815535, class350.anInt4086 * 985690519, -771513131 * class350.anInt4091, i, i_0_, i_1_, i_2_, i_3_, i_4_);
	}

	Class350_Sub3(Class356 class356, Class353 class353, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		super(class356, class353, i, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_);
		anInt7844 = 1903394671 * i_11_;
		anInt7840 = i_12_ * 2096034523;
		anInt7842 = -1010155381 * i_13_;
		anInt7843 = -1461400443 * i_14_;
		anInt7841 = i_15_ * -141394789;
		anInt7845 = 1560773125 * i_16_;
	}

	public Class60 method25() {
		return Class60.aClass60_608;
	}

	public Class60 method24(int i) {
		return Class60.aClass60_608;
	}

	public static Class350 method12589(RsByteBuffer class282_sub35) {
		Class350 class350 = Class383.method6512(class282_sub35, 88062096);
		int i = class282_sub35.readBigSmart();
		int i_17_ = class282_sub35.readBigSmart();
		int i_18_ = class282_sub35.readBigSmart();
		int i_19_ = class282_sub35.readBigSmart();
		int i_20_ = class282_sub35.readBigSmart();
		int i_21_ = class282_sub35.readBigSmart();
		return new Class350_Sub3(class350.aClass356_4094, class350.aClass353_4087, class350.anInt4090 * -1967081549, class350.anInt4089 * -1196256967, class350.anInt4093 * 329542577, class350.anInt4088 * 323608093, class350.anInt4092 * -1921815535, class350.anInt4086 * 985690519, -771513131 * class350.anInt4091, i, i_17_, i_18_, i_19_, i_20_, i_21_);
	}

	static void method12590(TCPMessage class282_sub23, int i, int i_22_, int i_23_, int i_24_) {
		class282_sub23.buffer.writeLEInt(i, (byte) -5);
		class282_sub23.buffer.writeShort(i_23_, 1417031095);
		class282_sub23.buffer.writeShort128(i_22_, -800257688);
	}
}
