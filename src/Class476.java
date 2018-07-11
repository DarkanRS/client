
/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class476 {
	short[] aShortArray5625;
	int[] anIntArray5626;
	long aLong5627;
	short[] aShortArray5628;

	public Class476(long l, int[] is, short[] is_0_, short[] is_1_) {
		((Class476) this).aLong5627 = 4871301677747952249L * l;
		((Class476) this).anIntArray5626 = is;
		((Class476) this).aShortArray5628 = is_0_;
		((Class476) this).aShortArray5625 = is_1_;
	}

	static final void method7929(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method506(class118, class98, class527, -1252434200);
	}

	static final void method7930(CS2Executor class527, byte i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_2_, (byte) 18);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 1506818197 * class118.anInt1301;
	}

	public static int method7931(Random random, int i, int i_3_) {
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class96_Sub9.method14585(i, 1942118537))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_4_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_5_;
		do
			i_5_ = random.nextInt();
		while (i_5_ >= i_4_);
		return Class302.method5360(i_5_, i, -120645567);
	}

	static final void method7932(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.getCrown(0)) || string.startsWith(Class76.getCrown(1)))
			string = string.substring(7);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class249.method4282(string, (byte) 0) ? 1 : 0;
	}

	static final void method7933(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class159.method2741(class118, class98, class527, (byte) 5);
	}
}
