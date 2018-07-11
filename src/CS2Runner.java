
import java.util.ArrayList;

public final class CS2Runner {
	static String aString5897;
	static boolean aBool5898;
	static int[] anIntArray5900;
	public static SoftCache aClass229_5901;
	static ArrayList CS2_EXECUTORS;
	static int anInt5904 = 0;
	static int CURRENT_CS2_EXEC_IDX;
	static int anInt5906;

	static {
		anIntArray5900 = new int[3];
		aClass229_5901 = new SoftCache(4);
		aBool5898 = false;
		aString5897 = null;
		CS2_EXECUTORS = new ArrayList();
		CURRENT_CS2_EXEC_IDX = 0;
		anInt5906 = 0;
	}

	CS2Runner() throws Throwable {
		throw new Error();
	}

	static final void method11125(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1311 * 276864765;
	}

	static final void method11126(CS2Executor class527, byte i) {
		int i_592_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_592_, (byte) 97);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_592_ >> 16];
		Class82.method1455(class118, class98, class527, -1784890209);
	}

	static Class282_Sub30 method11127(int i, boolean bool, int i_593_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		return (Class282_Sub30) Class282_Sub30.aClass465_7711.method7754(l);
	}

	static final void method11128(CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		int i_594_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_595_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		int i_596_ = (class527.intStack[2 + 1942118537 * class527.intStackPtr]);
		Class96_Sub10.method14603(2, i_594_ << 16 | i_595_, i_596_, "", (byte) 10);
	}
}
