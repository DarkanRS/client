/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330 {
	public int anInt3862;
	public int anInt3863;
	byte aByte3864;
	public int anInt3865;
	public int anInt3866;
	public int anInt3867;
	
	public Class330() {
		/* empty */
	}

	public int method5907() {
		return 8 == (((Class330) this).aByte3864 & 0x8) ? 1 : 0;
	}

	public int method5908(int i) {
		return ((Class330) this).aByte3864 & 0x7;
	}

	public int method5909(int i) {
		return 8 == (((Class330) this).aByte3864 & 0x8) ? 1 : 0;
	}

	public int method5910() {
		return ((Class330) this).aByte3864 & 0x7;
	}

	public int method5911() {
		return ((Class330) this).aByte3864 & 0x7;
	}

	public Class330(RsByteBuffer class282_sub35) {
		((Class330) this).aByte3864 = class282_sub35.readByte((short) -10980);
		anInt3863 = class282_sub35.readUnsignedShort() * -789603523;
		anInt3866 = class282_sub35.readInt() * -1480881931;
		anInt3865 = class282_sub35.readInt() * -219759493;
		anInt3862 = class282_sub35.readInt() * 1782651397;
		anInt3867 = class282_sub35.readInt() * -2027073377;
	}

	static final void method5912(CS2Executor class527, byte i) {
		class527.aLongArray7003[(class527.anInt7001 += -1188480575) * 1820448321 - 1] = (class527.current.longOpValues[301123709 * class527.instrPtr]);
	}

	public static void method5913(int i) {
		Class118.aClass229_1280.method3863(1550469296);
		Class118.aClass229_1341.method3863(986985015);
		Class118.aClass229_1303.method3863(759496379);
		Class118.aClass229_1282.method3863(726939878);
	}

	public static int method5914(byte[] is, int i, CharSequence charsequence, int i_0_) {
		int i_1_ = charsequence.length();
		int i_2_ = i;
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
			int i_4_ = charsequence.charAt(i_3_);
			if (i_4_ <= 127)
				is[i_2_++] = (byte) i_4_;
			else if (i_4_ <= 2047) {
				is[i_2_++] = (byte) (0xc0 | i_4_ >> 6);
				is[i_2_++] = (byte) (0x80 | i_4_ & 0x3f);
			} else {
				is[i_2_++] = (byte) (0xe0 | i_4_ >> 12);
				is[i_2_++] = (byte) (0x80 | i_4_ >> 6 & 0x3f);
				is[i_2_++] = (byte) (0x80 | i_4_ & 0x3f);
			}
		}
		return i_2_ - i;
	}

	static final void method5915(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.anInt7012 -= 283782002;
		int i_5_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_6_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = string.indexOf(i_5_, i_6_);
	}

	static final void method5916(int i) {
		for (int i_7_ = 0; i_7_ < -685729279 * client.anInt7211; i_7_++) {
			int i_8_ = client.anIntArray7212[i_7_];
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_8_));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				Class363.method6287(class521_sub1_sub1_sub2_sub2, false, -496404861);
			}
		}
	}
}
