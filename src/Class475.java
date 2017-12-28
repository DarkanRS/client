
/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public final class Class475 {
	static int anInt5622;
	public static boolean aBool5623 = true;
	public static int anInt5624;

	public static Class467[] method7918(Class470 class470) {
		int[] is = class470.method7807((byte) 0);
		Class467[] class467s = new Class467[is.length >> 2];
		for (int i = 0; i < class467s.length; i++) {
			Class467 class467 = new Class467();
			class467s[i] = class467;
			class467.anInt5571 = is[i << 2] * -1043730883;
			class467.anInt5574 = -31601497 * is[(i << 2) + 1];
			class467.anInt5573 = 1709553599 * is[2 + (i << 2)];
			((Class467) class467).anInt5572 = 1483782025 * is[3 + (i << 2)];
		}
		return class467s;
	}

	public static Class467[] method7919(Class470 class470) {
		int[] is = class470.method7807((byte) 0);
		Class467[] class467s = new Class467[is.length >> 2];
		for (int i = 0; i < class467s.length; i++) {
			Class467 class467 = new Class467();
			class467s[i] = class467;
			class467.anInt5571 = is[i << 2] * -1043730883;
			class467.anInt5574 = -31601497 * is[(i << 2) + 1];
			class467.anInt5573 = 1709553599 * is[2 + (i << 2)];
			((Class467) class467).anInt5572 = 1483782025 * is[3 + (i << 2)];
		}
		return class467s;
	}

	public static Frame method7920(Class470 class470, int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ == 0) {
			Class467[] class467s = Class386.method6671(class470, -1229267038);
			if (class467s == null)
				return null;
			boolean bool = false;
			for (int i_3_ = 0; i_3_ < class467s.length; i_3_++) {
				if (class467s[i_3_].anInt5571 * -1928226539 == i && i_0_ == class467s[i_3_].anInt5574 * -1980032233 && (i_2_ == 0 || i_2_ == (((Class467) class467s[i_3_]).anInt5572 * 1746595513)) && (!bool || -1254475713 * class467s[i_3_].anInt5573 > i_1_)) {
					i_1_ = class467s[i_3_].anInt5573 * -1254475713;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class470.method7808(frame, i, i_0_, i_1_, i_2_, 2039986360);
		return frame;
	}

	public static Class467[] method7921(Class470 class470) {
		int[] is = class470.method7807((byte) 0);
		Class467[] class467s = new Class467[is.length >> 2];
		for (int i = 0; i < class467s.length; i++) {
			Class467 class467 = new Class467();
			class467s[i] = class467;
			class467.anInt5571 = is[i << 2] * -1043730883;
			class467.anInt5574 = -31601497 * is[(i << 2) + 1];
			class467.anInt5573 = 1709553599 * is[2 + (i << 2)];
			((Class467) class467).anInt5572 = 1483782025 * is[3 + (i << 2)];
		}
		return class467s;
	}

	public static Class467[] method7922(Class470 class470) {
		int[] is = class470.method7807((byte) 0);
		Class467[] class467s = new Class467[is.length >> 2];
		for (int i = 0; i < class467s.length; i++) {
			Class467 class467 = new Class467();
			class467s[i] = class467;
			class467.anInt5571 = is[i << 2] * -1043730883;
			class467.anInt5574 = -31601497 * is[(i << 2) + 1];
			class467.anInt5573 = 1709553599 * is[2 + (i << 2)];
			((Class467) class467).anInt5572 = 1483782025 * is[3 + (i << 2)];
		}
		return class467s;
	}

	Class475() throws Throwable {
		throw new Error();
	}

	public static void method7923(Class470 class470, Frame frame) {
		class470.method7820((byte) 1);
		frame.setVisible(false);
		frame.dispose();
	}

	public static void method7924(Class470 class470, Frame frame) {
		class470.method7820((byte) 1);
		frame.setVisible(false);
		frame.dispose();
	}

	public static void method7925(Class470 class470, Frame frame) {
		class470.method7820((byte) 1);
		frame.setVisible(false);
		frame.dispose();
	}

	public static String method7926(CharSequence charsequence, int i) {
		int i_4_ = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i_4_);
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			char c = charsequence.charAt(i_5_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || '-' == c || '*' == c || c == '_')
				stringbuilder.append(c);
			else if (' ' == c)
				stringbuilder.append('+');
			else {
				int i_6_ = Class242.method4163(c, (byte) 115);
				stringbuilder.append('%');
				int i_7_ = i_6_ >> 4 & 0xf;
				if (i_7_ >= 10)
					stringbuilder.append((char) (i_7_ + 55));
				else
					stringbuilder.append((char) (48 + i_7_));
				i_7_ = i_6_ & 0xf;
				if (i_7_ >= 10)
					stringbuilder.append((char) (55 + i_7_));
				else
					stringbuilder.append((char) (i_7_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	static final void method7927(Class118 class118, Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_8_ = ((((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]) - 1);
		int i_9_ = (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]);
		if (i_8_ < 0 || i_8_ > 9)
			throw new RuntimeException();
		Class274.method4883(class118, i_8_, i_9_, class527, -838566564);
	}

	static final void method7928(Class527 class527, byte i) {
		Class371.method6353((short) 255);
	}
}
