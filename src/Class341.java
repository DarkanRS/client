/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class341 {
	public int anInt3992;
	public int anInt3993;
	public int anInt3994;
	public int anInt3995;
	static int anInt3996;

	Class341(int i, int i_0_, int i_1_, int i_2_) {
		anInt3992 = i * -577893869;
		anInt3993 = -1744394261 * i_0_;
		anInt3994 = i_1_ * -2096937841;
		anInt3995 = i_2_ * -1365206601;
	}

	Class341() {
		anInt3992 = (32 + (int) (Math.random() * 4.0)) * -577893869;
		anInt3993 = (3 + (int) (Math.random() * 2.0)) * -1744394261;
		anInt3994 = (16 + (int) (Math.random() * 3.0)) * -2096937841;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1888881077) == 1)
			anInt3995 = (int) (Math.random() * 6.0) * -1365206601;
		else
			anInt3995 = (int) (Math.random() * 12.0) * -1365206601;
	}

	static final void method6073(CS2Executor class527, byte i) {
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		while_191_: do {
			while_190_: do {
				do {
					if (class282_sub50_sub6 != null) {
						if (i == -1)
							throw new IllegalStateException();
						if (class282_sub50_sub6.aString9534 != null)
							break while_190_;
						if (i != -1)
							break;
					}
				} while (false);
				((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141) - 1] = "";
				break while_191_;
			} while (false);
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = class282_sub50_sub6.aString9534;
		} while (false);
	}

	static void method6074(String[] strings, int i) {
		if (strings.length > 1) {
			for (int i_3_ = 0; i_3_ < strings.length; i_3_++) {
				if (strings[i_3_].startsWith("pause")) {
					int i_4_ = 5;
					try {
						i_4_ = Integer.parseInt(strings[i_3_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class209.method3598(new StringBuilder().append("Pausing for ").append(i_4_).append(" seconds...").toString(), -1904731219);
					Class276.aStringArray3345 = strings;
					Class179.anInt2231 = -479843653 * (1 + i_3_);
					Class179.aLong2232 = (Class169.method2869(1670266818) + (long) (i_4_ * 1000)) * 5591849346017053157L;
					break;
				}
				Class179.aString2225 = strings[i_3_];
				Class165.method2853(false, -76104076);
			}
		} else {
			Class179.aString2225 = new StringBuilder().append(Class179.aString2225).append(strings[0]).toString();
			Class179.anInt2220 += strings[0].length() * -1996461669;
		}
	}
}
