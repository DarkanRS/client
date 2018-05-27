/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class417 {
	public short[] aShortArray4990;
	public short[] aShortArray4991;
	public int[] anIntArray4992;
	public long aLong4993;
	public static int anInt4994;

	public Class417(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong4993 = l * 7197667099348947907L;
		anIntArray4992 = is;
		aShortArray4990 = is_0_;
		aShortArray4991 = is_1_;
	}

	public Class417(NPCDefinitions class409, boolean bool) {
		if (bool) {
			anIntArray4992 = new int[class409.anIntArray4859.length];
			System.arraycopy(class409.anIntArray4859, 0, anIntArray4992, 0, anIntArray4992.length);
		} else {
			anIntArray4992 = new int[class409.anIntArray4860.length];
			System.arraycopy(class409.anIntArray4860, 0, anIntArray4992, 0, anIntArray4992.length);
		}
		if (null != class409.aShortArray4892) {
			aShortArray4990 = new short[class409.aShortArray4892.length];
			System.arraycopy(class409.aShortArray4892, 0, aShortArray4990, 0, aShortArray4990.length);
		}
		if (null != class409.aShortArray4867) {
			aShortArray4991 = new short[class409.aShortArray4867.length];
			System.arraycopy(class409.aShortArray4867, 0, aShortArray4991, 0, aShortArray4991.length);
		}
	}

	public static Class347 method7005(int i, int i_2_) {
		Class347 class347 = (Class347) Class347.aClass229_4052.get((long) i);
		if (null != class347)
			return class347;
		byte[] is = Class347.aClass317_4053.getFile(0, i, -2049012023);
		class347 = new Class347();
		if (null != is)
			class347.method6163(new RsByteBuffer(is), i, (short) 257);
		Class347.aClass229_4052.put(class347, (long) i);
		return class347;
	}

	static final void method7006(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (null == Class468_Sub8.aClass98Array7889[i_3_])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else {
			String string = (Class468_Sub8.aClass98Array7889[i_3_].aClass118Array998[0].aString1285);
			if (string == null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = string.substring(0, string.indexOf(':'));
		}
	}
}
