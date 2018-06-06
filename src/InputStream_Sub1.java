
/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

public class InputStream_Sub1 extends InputStream {
	public int read() {
		Class89.method1504(30000L);
		return -1;
	}

	public int method12720() {
		Class89.method1504(30000L);
		return -1;
	}

	public int method12721() {
		Class89.method1504(30000L);
		return -1;
	}

	public int method12722() {
		Class89.method1504(30000L);
		return -1;
	}

	InputStream_Sub1() {
		/* empty */
	}

	static final void method12723(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method12724(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_0_, 527591750);
		if (class425.certTemplateId * -722914683 >= 0 && 1416589415 * class425.certId >= 0)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1416589415 * class425.certId;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i_0_;
	}
}
