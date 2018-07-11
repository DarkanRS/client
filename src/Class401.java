/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class401 {
	public int anInt4823;
	Index aClass317_4824;
	static IComponentDefinitions aClass118_4825;

	public Class401(Game class486, Language class495, Index class317) {
		new SoftCache(64);
		((Class401) this).aClass317_4824 = class317;
		anInt4823 = (((Class401) this).aClass317_4824.filesCount(((SharedConfigsType.aClass120_1478.id) * -71319279), 1857735004) * -1443669577);
	}

	static final void method6796(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1428 * 198275475;
	}

	static final void method6797(CS2Executor class527, byte i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		int i_1_ = client.aClass330Array7428[i_0_].method5908(-1939537694);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_1_ == 0 ? 1 : 0;
	}
}
