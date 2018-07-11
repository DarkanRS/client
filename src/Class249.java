/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class249 implements Interface43 {
	public static final int anInt3081 = 4;
	public static Class249 aClass249_3082;
	public static Class249 aClass249_3083 = new Class249((byte) -1);
	public static Class249 aClass249_3084;
	public byte aByte3085;
	public static Class249 aClass249_3086;

	public static Class249[] method4267() {
		return new Class249[] { aClass249_3082, aClass249_3084, aClass249_3086, aClass249_3083 };
	}

	public int method243(byte i) {
		return aByte3085;
	}

	public int method4268(int i) {
		return 1 + aByte3085;
	}

	static {
		aClass249_3082 = new Class249((byte) 0);
		aClass249_3084 = new Class249((byte) 1);
		aClass249_3086 = new Class249((byte) 2);
	}

	public int method76() {
		return aByte3085;
	}

	public int method4269() {
		return 1 + aByte3085;
	}

	public int method75() {
		return aByte3085;
	}

	public static Class249[] method4270() {
		return new Class249[] { aClass249_3082, aClass249_3084, aClass249_3086, aClass249_3083 };
	}

	public static Class249[] method4271() {
		return new Class249[] { aClass249_3082, aClass249_3084, aClass249_3086, aClass249_3083 };
	}

	Class249(byte i) {
		aByte3085 = i;
	}

	public static Class249[] method4272() {
		return new Class249[] { aClass249_3082, aClass249_3084, aClass249_3086, aClass249_3083 };
	}

	public int method4273() {
		return 1 + aByte3085;
	}

	public int method4274() {
		return 1 + aByte3085;
	}

	public int method4275() {
		return 1 + aByte3085;
	}

	static final void method4276(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class527.intStackPtr -= 851346006;
		class118.anInt1293 = -1312401539 * (class527.intStack[1942118537 * class527.intStackPtr]);
		class118.anInt1334 = ((class527.intStack[1 + 1942118537 * class527.intStackPtr]) * -2054115939);
		class118.anInt1385 = ((class527.intStack[1942118537 * class527.intStackPtr + 2]) * 1229969471);
		class118.anInt1336 = ((class527.intStack[3 + class527.intStackPtr * 1942118537]) * -140036259);
		class118.anInt1337 = (-906963849 * (class527.intStack[4 + 1942118537 * class527.intStackPtr]));
		class118.anInt1343 = ((class527.intStack[5 + class527.intStackPtr * 1942118537]) * -807852535);
		Class109.method1858(class118, (byte) 60);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999) {
			Class106.method1818(-1952846363 * class118.idHash, -1101705065);
			Item.method12575(class118.idHash * -1952846363, (byte) 9);
		}
	}

	static final void method4277(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	static final void method4278(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class402.method6798(string, (short) -15782);
	}

	static final void method4279(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class293.method5206(-2045199626);
	}

	static final void method4280(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		IComponentDefinitions class118_0_ = class118;
		boolean bool;
		if ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1) {
			if (i <= 32)
				return;
			bool = true;
		} else
			bool = false;
		class118_0_.aBool1325 = bool;
		Class109.method1858(class118, (byte) 40);
	}

	static final void method4281(Animable class521_sub1_sub1_sub2, int i) {
		int i_1_ = (class521_sub1_sub1_sub2.anInt10342 * 403949281 - -1809259861 * client.cycles);
		int i_2_ = (class521_sub1_sub1_sub2.anInt10326 * 1204164096 + class521_sub1_sub1_sub2.getSize(828768449) * 256);
		int i_3_ = (-699068928 * class521_sub1_sub1_sub2.anInt10328 + class521_sub1_sub1_sub2.getSize(828768449) * 256);
		Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
		class521_sub1_sub1_sub2.method11172((float) ((int) class385.x + (i_2_ - (int) class385.x) / i_1_), (float) (int) class385.y, (float) ((int) class385.z + (i_3_ - (int) class385.z) / i_1_));
		class521_sub1_sub1_sub2.anInt10366 = 0;
		class521_sub1_sub1_sub2.method15863((-445026593 * (class521_sub1_sub1_sub2.anInt10346)), 1692779087);
	}

	public static boolean method4282(String string, byte i) {
		if (string == null)
			return false;
		for (int i_4_ = 0; i_4_ < 493536965 * client.anInt7449; i_4_++) {
			if (string.equalsIgnoreCase(client.aClass6Array7452[i_4_].aString37))
				return true;
		}
		if (string.equalsIgnoreCase(Class84.myPlayer.displayName))
			return true;
		return false;
	}

	static final void method4283(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		DefaultsFile.method11221(class118, class98, class527, -2007218506);
	}
}
