/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class401 {
	public int anInt4823;
	Index aClass317_4824;
	static Class118 aClass118_4825;

	public Class401(Game class486, Class495 class495, Index class317) {
		new Class229(64);
		((Class401) this).aClass317_4824 = class317;
		anInt4823 = (((Class401) this).aClass317_4824.filesCount(((Class120.aClass120_1478.anInt1521) * -71319279), 1857735004) * -1443669577);
	}

	static final void method6796(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1428 * 198275475;
	}

	static final void method6797(CS2Executor class527, byte i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_1_ = client.aClass330Array7428[i_0_].method5908(-1939537694);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_1_ == 0 ? 1 : 0;
	}
}
