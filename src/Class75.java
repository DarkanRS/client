/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class75 {
	public int anInt739;
	int anInt740;
	NPC aClass521_Sub1_Sub1_Sub2_Sub2_741;
	public boolean aBool742 = false;
	static final int anInt743 = 25;
	Player aClass521_Sub1_Sub1_Sub2_Sub1_744;
	int[] anIntArray745;
	static Index aClass317_746;
	static int anInt747;

	void method1335() {
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741 = null;
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744 = null;
		aBool742 = false;
	}

	void method1336(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (!aBool742) {
			aBool742 = true;
			if (anInt739 * 62352723 >= 0) {
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741 = (new NPC(client.aClass257_7353.method4430(-1965384058), 25));
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10314 = 892633931 * ((Class75) this).anInt740;
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10353 = -537541873 * client.cycles;
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method16166(Class350_Sub1.aClass406_7757.method6828(anInt739 * 62352723, (byte) 5), 687087501);
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15836(1203434505 * (((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.aClass409_10580.anInt4858), (byte) -96);
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10340 = -222526911 * ((((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.aClass409_10580.anInt4889) * 1913503455 << 3);
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10321 = (((Class86.anInt819 += 523556513) * 272928097 - 1) * -2027750001);
			} else {
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744 = (new Player(client.aClass257_7353.method4430(-1995345801), 25));
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.decodeAppearance(Class276.aClass282_Sub35_3346, 1925099603);
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.anInt10314 = ((Class75) this).anInt740 * 892633931;
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.anInt10353 = -537541873 * client.cycles;
				((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.anInt10321 = (((Class86.anInt819 += 523556513) * 272928097 - 1) * -2027750001);
			}
		}
		if (62352723 * anInt739 >= 0) {
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i_1_, i, i_0_, true, ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15805(828768449), -1440996136);
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15791(i_2_, true, (byte) -89);
		} else {
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7967 = ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i_1_;
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i, i_0_, 87845463);
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.method15791(i_2_, true, (byte) -27);
		}
	}

	void method1337(int i) {
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741 = null;
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744 = null;
		aBool742 = false;
	}

	void method1338(int i, int i_4_, int i_5_, int i_6_) {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i, i_4_, i_5_, true, ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15805(828768449), -1226948828);
		else {
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7967 = ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i;
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i_4_, i_5_, -909985689);
		}
	}

	boolean method1339(short i) {
		if (62352723 * anInt739 >= 0) {
			Class409 class409 = Class350_Sub1.aClass406_7757.method6828(anInt739 * 62352723, (byte) 53);
			boolean bool = class409.method6881(-1593262415);
			if (null == ((Class75) this).anIntArray745) {
				Class227 class227 = Class96_Sub16.aClass211_9383.method3616((-490908695 * (class409.anInt4898)), (byte) -42);
				((Class75) this).anIntArray745 = class227.method3828(163665015);
			}
			int[] is = ((Class75) this).anIntArray745;
			for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
				int i_8_ = is[i_7_];
				bool &= Class330.aClass523_3868.method11205(i_8_, (byte) 91).method11132(2032064128);
			}
			return bool;
		}
		return true;
	}

	void method1340(int i, int i_9_, int i_10_) {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i, i_9_, i_10_, true, ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15805(828768449), -1385564747);
		else {
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7967 = ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i;
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i_9_, i_10_, -464682481);
		}
	}

	void method1341() {
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741 = null;
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744 = null;
		aBool742 = false;
	}

	public Animable method1342(byte i) {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			return ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741;
		return ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744;
	}

	void method1343(int i, int i_11_, int i_12_) {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i, i_11_, i_12_, true, ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15805(828768449), -2031635469);
		else {
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7967 = ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i;
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i_11_, i_12_, -2032113554);
		}
	}

	void method1344(int i, int i_13_, int i_14_) {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i, i_13_, i_14_, true, ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741.method15805(828768449), -1016301929);
		else {
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7967 = ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i;
			((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i_13_, i_14_, -1484268247);
		}
	}

	boolean method1345() {
		if (62352723 * anInt739 >= 0) {
			Class409 class409 = Class350_Sub1.aClass406_7757.method6828(anInt739 * 62352723, (byte) 3);
			boolean bool = class409.method6881(-1593262415);
			if (null == ((Class75) this).anIntArray745) {
				Class227 class227 = Class96_Sub16.aClass211_9383.method3616((-490908695 * (class409.anInt4898)), (byte) 74);
				((Class75) this).anIntArray745 = class227.method3828(1387373100);
			}
			int[] is = ((Class75) this).anIntArray745;
			for (int i = 0; i < is.length; i++) {
				int i_15_ = is[i];
				bool &= Class330.aClass523_3868.method11205(i_15_, (byte) 36).method11132(2014877096);
			}
			return bool;
		}
		return true;
	}

	public Animable method1346() {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			return ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741;
		return ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744;
	}

	public Animable method1347() {
		if (null != ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741)
			return ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741;
		return ((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744;
	}

	Class75(RsByteBuffer class282_sub35, int i) {
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub2_741 = null;
		((Class75) this).aClass521_Sub1_Sub1_Sub2_Sub1_744 = null;
		((Class75) this).anInt740 = -1139196233 * i;
		int i_16_ = class282_sub35.readUnsignedByte();
		switch (i_16_) {
		case 1:
			anInt739 = -422272731;
			break;
		case 0:
			anInt739 = class282_sub35.readBigSmart(1948571213) * 422272731;
			break;
		default:
			anInt739 = -422272731;
		}
		class282_sub35.readString(-463148700);
	}

	boolean method1348() {
		if (62352723 * anInt739 >= 0) {
			Class409 class409 = Class350_Sub1.aClass406_7757.method6828(anInt739 * 62352723, (byte) -33);
			boolean bool = class409.method6881(-1593262415);
			if (null == ((Class75) this).anIntArray745) {
				Class227 class227 = Class96_Sub16.aClass211_9383.method3616((-490908695 * (class409.anInt4898)), (byte) -106);
				((Class75) this).anIntArray745 = class227.method3828(1137772138);
			}
			int[] is = ((Class75) this).anIntArray745;
			for (int i = 0; i < is.length; i++) {
				int i_17_ = is[i];
				bool &= Class330.aClass523_3868.method11205(i_17_, (byte) 39).method11132(1898468081);
			}
			return bool;
		}
		return true;
	}

	static final void method1349(CS2Executor class527, int i) {
		int i_18_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_18_, (byte) 104);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_18_ >> 16];
		Class174.method2955(class118, class98, class527, (byte) 0);
	}

	static final void method1350(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -16) == 1 ? 1 : 0;
	}

	static final void method1351(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class469.aBool5585 ? 1 : 0;
	}

	static final void method1352(CS2Executor class527, int i) {
		int i_19_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method7785(i_19_, -332063758);
	}

	public static String method1353(String string, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		int i_20_ = string.length();
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
			char c = string.charAt(i_21_);
			if (c == 37 && i_20_ > i_21_ + 2) {
				c = string.charAt(i_21_ + 1);
				boolean bool = false;
				int i_22_;
				if (c >= 48 && c <= 57)
					i_22_ = c - 48;
				else if (c >= 97 && c <= 102)
					i_22_ = 10 + c - 97;
				else if (c >= 65 && c <= 70)
					i_22_ = 10 + c - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				i_22_ *= 16;
				int i_23_ = string.charAt(2 + i_21_);
				if (i_23_ >= 48 && i_23_ <= 57)
					i_22_ += i_23_ - 48;
				else if (i_23_ >= 97 && i_23_ <= 102)
					i_22_ += i_23_ + 10 - 97;
				else if (i_23_ >= 65 && i_23_ <= 70)
					i_22_ += 10 + i_23_ - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				if (0 != i_22_ && Class209.method3600((byte) i_22_, 1053306035))
					stringbuilder.append(Class11.method470((byte) i_22_, -847887616));
				i_21_ += 2;
			} else if (43 == c)
				stringbuilder.append(' ');
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	static String method1354(Class282_Sub50_Sub15 class282_sub50_sub15, int i) {
		return new StringBuilder().append(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771).append(Class59.method1163(16777215, 619010179)).append(" >").toString();
	}

	static final void method1355(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_24_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_25_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		Class31.method812(i_24_, new Class282_Sub44(i_25_, 3), null, true, (byte) 92);
	}
}
