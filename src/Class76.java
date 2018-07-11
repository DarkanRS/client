/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76 {
	public int anInt748;
	public static Class76 aClass76_749;
	static Class76 aClass76_750;
	public static Class76 aClass76_751;
	public static Class76 aClass76_752;
	static Class76 aClass76_753 = new Class76(6, 1);
	static Class76 aClass76_754;
	public static Class76 aClass76_755;
	static Class76 aClass76_756 = new Class76(0, 2);
	public int anInt757;
	public static Class76 aClass76_758;

	Class76(int i, int i_0_) {
		anInt757 = i * 968808761;
		anInt748 = i_0_ * -704130985;
	}

	static {
		aClass76_750 = new Class76(7, 4);
		aClass76_751 = new Class76(4, 1);
		aClass76_752 = new Class76(5, 2);
		aClass76_749 = new Class76(1, 3);
		aClass76_754 = new Class76(2, 4);
		aClass76_755 = new Class76(8, 2);
		aClass76_758 = new Class76(3, 4);
	}

	static int method1356(int i, int i_1_, int i_2_) {
		double d = Math.log(i_1_) / Math.log(2.0);
		double d_3_ = Math.log(i) / Math.log(2.0);
		double d_4_ = Math.random() * (d - d_3_) + d_3_;
		return (int) (Math.pow(2.0, d_4_) + 0.5);
	}

	static final void method1357(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class96_Sub1.anInt8307 * -993852069;
	}

	public static String getCrown(int id) {
		return new StringBuilder().append("<img=").append(id).append(">").toString();
	}

	public static void method1360(String string, boolean bool, byte i) {
		string = string.toLowerCase();
		short[] is = new short[16];
		int i_19_ = 0;
		int i_20_ = bool ? 32768 : 0;
		int i_21_ = ((bool ? IndexLoaders.QUICK_CHAT_INDEX_LOADER2.anInt5133 * 748884943 : IndexLoaders.QUICK_CHAT_INDEX_LOADER2.anInt5130 * 1033695499) + i_20_);
		for (int i_22_ = i_20_; i_22_ < i_21_; i_22_++) {
			QuickchatDefinitions class282_sub50_sub9 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_22_, -1918466805);
			if (class282_sub50_sub9.aBool9628 && class282_sub50_sub9.method14898(409119349).toLowerCase().indexOf(string) != -1) {
				if (i_19_ >= 50) {
					Class415.anInt4985 = -1978366005;
					Class308.aShortArray3621 = null;
					return;
				}
				if (i_19_ >= is.length) {
					short[] is_23_ = new short[2 * is.length];
					for (int i_24_ = 0; i_24_ < i_19_; i_24_++) {
						is_23_[i_24_] = is[i_24_];
					}
					is = is_23_;
				}
				is[i_19_++] = (short) i_22_;
			}
		}
		Class308.aShortArray3621 = is;
		Class283.anInt3384 = 0;
		Class415.anInt4985 = i_19_ * 1978366005;
		String[] strings = new String[560339485 * Class415.anInt4985];
		for (int i_25_ = 0; i_25_ < 560339485 * Class415.anInt4985; i_25_++) {
			strings[i_25_] = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(is[i_25_], -1792601455).method14898(-47369611);
		}
		Class100.method1644(strings, Class308.aShortArray3621, (short) 30307);
	}

	public static void method1361(byte i) {
		Class96.method1607((byte) 74);
		Class115.aClass160Array1248 = null;
	}

	static final void method1362(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_26_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_27_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_26_, -2012754494).anIntArray9624[i_27_]);
	}
}
