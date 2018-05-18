/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class180 {
	public int anInt2235;
	public int anInt2236;
	public int anInt2237;
	public int anInt2238;
	int anInt2239;
	int anInt2240;
	int anInt2241;
	public int anInt2242 = 669014749;
	public int anInt2243;
	int anInt2244;
	static Class229 aClass229_2245 = new Class229(4);
	static int anInt2246;

	static void method3022(int i) {
		anInt2246 = -1709646095 * i;
		aClass229_2245.method3859(-791032658);
	}

	static void method3023(int i) {
		aClass229_2245.method3858(i, (byte) 91);
	}

	static void method3024(int i) {
		anInt2246 = -1709646095 * i;
		aClass229_2245.method3859(-1564178152);
	}

	static void method3025(int i) {
		anInt2246 = -1709646095 * i;
		aClass229_2245.method3859(-522517905);
	}

	static void method3026(int i) {
		anInt2246 = -1709646095 * i;
		aClass229_2245.method3859(947665900);
	}

	static void method3027() {
		aClass229_2245.method3859(-1317027746);
	}

	Class180() {
		/* empty */
	}

	public static MeshRasterizer method3028(GraphicalRenderer class505, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		long l = (long) i_3_;
		MeshRasterizer class528 = (MeshRasterizer) aClass229_2245.method3865(l);
		int i_4_ = 2055;
		if (null == class528) {
			RSMesh class157 = RSMesh.method2689(Class110.aClass317_1106, i_3_, 0);
			if (null == class157)
				return null;
			if (class157.anInt1986 < 13)
				class157.method2679(2);
			class528 = class505.createMeshRasterizer(class157, i_4_, 2079347217 * anInt2246, 64, 768);
			aClass229_2245.method3856(class528, l);
		}
		class528 = class528.method11289((byte) 6, i_4_, true);
		if (i != 0)
			class528.f(i);
		if (i_0_ != 0)
			class528.t(i_0_);
		if (0 != i_1_)
			class528.EA(i_1_);
		if (0 != i_2_)
			class528.ia(0, i_2_, 0);
		return class528;
	}

	static void method3029() {
		aClass229_2245.method3863(1912999243);
	}

	static final void method3030(CS2Executor class527, int i) {
		int i_5_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		ItemDefinitions class425 = Class119.aClass426_1463.getItemDefinitions(i_5_, 504897377);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class425.aBool5101 ? 1 : 0;
	}

	static final void method3031(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class82.method1454(class118, class98, class527, (byte) 111);
	}

	public static Class108 method3032(int i, byte i_6_) {
		do {
			if (i >= 0) {
				if (i_6_ != -1) {
					for (;;) {
						/* empty */
					}
				}
				if (i < 100)
					break;
				if (i_6_ != -1)
					throw new IllegalStateException();
			}
			return null;
		} while (false);
		return Class81.aClass108Array798[i];
	}

	static final void method3033(CS2Executor class527, byte i) {
		if (-1353302673 * client.anInt7319 >= 5 && -1353302673 * client.anInt7319 <= 9)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7319 * -1353302673;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}
}
