/* Class527 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CS2Executor {
	UnderlayDefinition aClass513_6994;
	int[] intLocals;
	long[] longLocals;
	int[] globalArrayLengths = new int[5];
	int[][] globalArrays = new int[5][5000];
	int[] intStack = new int[1000];
	int anInt7000;
	int anInt7001;
	int anInt7002;
	long[] aLongArray7003;
	int anInt7004;
	CS2OpInfo[] operations;
	Animable animable;
	UnderlayDefinition aClass513_7007;
	Class191 aClass191_7008;
	Class346 aClass346_7009;
	Class61 aClass61_7010;
	Class282_Sub4 aClass282_Sub4_7011;
	int anInt7012 = 0;
	SceneObject anInterface12_7013;
	Class521_Sub1_Sub2_Sub1 aClass521_Sub1_Sub2_Sub1_7014;
	int anInt7015;
	Class509[] aClass509Array7016;
	Object[] objectLocals;
	int[] intOpValues;
	Object[] objectStack = new Object[1000];
	int instrPtr;
	CS2Script current;
	boolean aBool7022;

	CS2Executor() {
		((CS2Executor) this).anInt7000 = 0;
		((CS2Executor) this).aLongArray7003 = new long[1000];
		((CS2Executor) this).anInt7001 = 0;
		((CS2Executor) this).anInt7002 = 0;
		((CS2Executor) this).aClass509Array7016 = new Class509[50];
		((CS2Executor) this).aClass513_7007 = new UnderlayDefinition();
		((CS2Executor) this).aClass513_6994 = new UnderlayDefinition();
		((CS2Executor) this).anInt7015 = 0;
		((CS2Executor) this).instrPtr = 1051529003;
	}

	static final void method11250(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (i_1_ >= 324226563 * Class532_Sub2.anInt7070 && i_1_ <= Class532_Sub2.anInt7068 * -348932735) {
			i = Class275.method4890(i, -612590951 * Class532_Sub2.anInt7071, Class532_Sub2.anInt7069 * -1345107225, -1202150111);
			i_0_ = Class275.method4890(i_0_, -612590951 * Class532_Sub2.anInt7071, -1345107225 * Class532_Sub2.anInt7069, 23945710);
			Class16.method568(i, i_0_, i_1_, i_2_, (short) 128);
		}
	}

	static final void method11251(String string, int i) {
		System.out.println(new StringBuilder().append("Error: ").append(Class96.method1609(string, "%0a", "\n", -566437916)).toString());
	}

	static final void method11252(CS2Executor class527, int i) {
		int i_4_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_4_, (byte) 112);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_4_ >> 16];
		Class159.method2741(class118, class98, class527, (byte) 59);
	}
}
