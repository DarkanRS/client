/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Js5FileWorker {
	abstract ReferenceTable getReferenceTable(int i);

	Js5FileWorker() {
		/* empty */
	}

	abstract byte[] method5804(int i, int i_0_);

	abstract void method5805(int i, int i_1_);

	abstract int method5806(int i, byte i_2_);

	abstract ReferenceTable method5807();

	abstract void method5808(int i);

	abstract byte[] method5809(int i);

	abstract int method5810(int i);

	abstract byte[] method5811(int i);

	abstract void method5812(int i);

	abstract byte[] method5813(int i);

	static final void method5814(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_3_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_4_ = (((CS2Executor) class527).intStack[1 + 1942118537 * ((CS2Executor) class527).anInt7012]);
		UnderlayDefinition class513;
		if (((CS2Executor) class527).aBool7022)
			class513 = ((CS2Executor) class527).aClass513_6994;
		else
			class513 = ((CS2Executor) class527).aClass513_7007;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class513.method8766((((CS2Executor) class527).animable.aClass98_10324), i_3_, i_4_, (byte) 1) ? 1 : 0;
	}

	static Class221[] method5815(int i) {
		return (new Class221[] { Class221.aClass221_2760, Class221.aClass221_2761, Class221.aClass221_2759 });
	}

	static final void method5816(CS2Executor class527, int i) {
		Class274.method4884((byte) 13);
	}
}
