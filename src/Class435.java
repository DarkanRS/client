/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class435 {
	long aLong5460;
	short[] aShortArray5461;
	short[] aShortArray5462;
	int[] anIntArray5463;

	public Class435(long l, int[] is, short[] is_0_, short[] is_1_) {
		((Class435) this).aLong5460 = l * 8069314464859468115L;
		((Class435) this).anIntArray5463 = is;
		((Class435) this).aShortArray5462 = is_0_;
		((Class435) this).aShortArray5461 = is_1_;
	}

	public static boolean method5804(int i, byte i_2_) {
		try {
			return 0 == i || i == 17 || 6 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rz.ff(").append(')').toString());
		}
	}
}
