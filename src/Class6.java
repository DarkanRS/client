/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6 {
	public String aString37;
	public boolean aBool38;
	public int anInt39;
	public String aString40;
	public int anInt41;
	public int anInt42;
	public String aString43;
	public int anInt44;
	static int anInt46;

	Class6() {
		/* empty */
	}

	static final void method298(CS2Executor class527, byte i) {
		class527.intStackPtr -= 283782002;
		if ((class527.intStack[1942118537 * class527.intStackPtr]) >= (class527.intStack[1 + 1942118537 * class527.intStackPtr]))
			class527.instrPtr += ((class527.intOpValues[class527.instrPtr * 301123709]) * -1051529003);
	}

	static final void method299(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3570(756095591);
	}

	static final void method300(CS2Executor class527, byte i) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class527.animable);
		boolean bool = false;
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (class409.anIntArray4886 != null)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		if (class409 != null)
			bool = class409.aBool4893;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method301(CS2Executor class527, short i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class9.anInt106 * -1378127363;
	}

	static boolean method302(Interface17 interface17, Class282_Sub53 class282_sub53, int i) {
		return (interface17 != null && interface17.method127(class282_sub53, client.anInterface16Array7298, client.anInt7196 * -809233249, Class96_Sub21.aClass199_9438, (byte) 2));
	}

	static void method303(int i, int i_0_, int i_1_, int i_2_) {
		if (i == 1008)
			Class210.method3614(Class397.aClass397_4801, i_0_, i_1_, (byte) 87);
		else if (i == 1009)
			Class210.method3614(Class397.aClass397_4793, i_0_, i_1_, (byte) 9);
		else if (1010 == i)
			Class210.method3614(Class397.aClass397_4794, i_0_, i_1_, (byte) 89);
		else if (i == 1011)
			Class210.method3614(Class397.aClass397_4795, i_0_, i_1_, (byte) 66);
		else if (i == 1012)
			Class210.method3614(Class397.aClass397_4796, i_0_, i_1_, (byte) 21);
	}

	public static int method304(int i) {
		if ((double) Class291_Sub1.aFloat3462 == 3.0)
			return 37;
		if ((double) Class291_Sub1.aFloat3462 == 4.0)
			return 50;
		if (6.0 == (double) Class291_Sub1.aFloat3462)
			return 75;
		if ((double) Class291_Sub1.aFloat3462 == 8.0)
			return 100;
		return 200;
	}

	static final void method305(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_3_, (byte) 121);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_3_ >> 16];
		Class349.method6186(class118, class98, class527, -94301647);
	}
}
