/* Class282_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub23 extends Class282 {
	static Class282_Sub23[] aClass282_Sub23Array7677 = new Class282_Sub23[300];
	int anInt7678;
	static int anInt7679 = 0;
	public int anInt7680;
	OutgoingPacket aClass379_7681;
	public RsBitsBuffer aClass282_Sub35_Sub2_7682;
	public static Class436 aClass436_7683;

	public void method12359() {
		if (anInt7679 * -918638833 < aClass282_Sub23Array7677.length)
			aClass282_Sub23Array7677[((anInt7679 += -331587601) * -918638833 - 1)] = this;
	}

	public void method12360(int i) {
		if (anInt7679 * -918638833 < aClass282_Sub23Array7677.length)
			aClass282_Sub23Array7677[((anInt7679 += -331587601) * -918638833 - 1)] = this;
	}

	static Class282_Sub23 method12361() {
		if (-918638833 * anInt7679 == 0)
			return new Class282_Sub23();
		return (aClass282_Sub23Array7677[(anInt7679 -= -331587601) * -918638833]);
	}

	static Class282_Sub23 method12362() {
		if (-918638833 * anInt7679 == 0)
			return new Class282_Sub23();
		return (aClass282_Sub23Array7677[(anInt7679 -= -331587601) * -918638833]);
	}

	public static Class282_Sub23 method12363() {
		Class282_Sub23 class282_sub23 = Class158_Sub2.method14356((short) 2048);
		((Class282_Sub23) class282_sub23).aClass379_7681 = null;
		((Class282_Sub23) class282_sub23).anInt7678 = 0;
		class282_sub23.aClass282_Sub35_Sub2_7682 = new RsBitsBuffer(5000);
		return class282_sub23;
	}

	Class282_Sub23() {
		/* empty */
	}

	public void method12364() {
		if (anInt7679 * -918638833 < aClass282_Sub23Array7677.length)
			aClass282_Sub23Array7677[((anInt7679 += -331587601) * -918638833 - 1)] = this;
	}

	public void method12365() {
		if (anInt7679 * -918638833 < aClass282_Sub23Array7677.length)
			aClass282_Sub23Array7677[((anInt7679 += -331587601) * -918638833 - 1)] = this;
	}

	static final void method12366(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (1 == client.anInt7341 * -891719545) {
			int i_7_ = -963499271 * Class197.NUM_PLAYER_INDICES;
			int[] is = Class197.PLAYER_INDICES;
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[is[i_8_]];
				if (class521_sub1_sub1_sub2_sub1 != null)
					class521_sub1_sub1_sub2_sub1.method15818(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, 331033522);
			}
			for (int i_9_ = 0; i_9_ < -685729279 * client.anInt7211; i_9_++) {
				int i_10_ = client.anIntArray7212[i_9_];
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_10_));
				if (null != class282_sub47)
					((Animable) class282_sub47.anObject8068).method15818(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, 1391480104);
			}
		}
	}
}
