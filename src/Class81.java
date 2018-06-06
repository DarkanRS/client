/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81 {
	static ChatLine[] CHAT_LINES = new ChatLine[100];
	static int NUM_CHAT_LINES;
	static int anInt801 = 0;
	static Class152 aClass152_802;
	static int anInt803;

	Class81() throws Throwable {
		throw new Error();
	}
	
	static final void method1452(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class16.method567(string, false, (byte) -20);
	}

	static final boolean method1453(int[][] is, int[][] is_11_, int i, int i_12_, int i_13_, int i_14_, int i_15_, byte i_16_) {
		for (int i_17_ = i_12_; i_17_ <= i_14_; i_17_++) {
			for (int i_18_ = i_13_; i_18_ <= i_15_; i_18_++) {
				if (i == is[i_17_][i_18_] && is_11_[i_17_][i_18_] <= 1)
					return true;
			}
		}
		return false;
	}
}
