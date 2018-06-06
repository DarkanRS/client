/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 implements Interface35 {
	public Object method216(byte[] is, FontMetrics class414, boolean bool, int i) {
		return Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1517(is), bool);
	}

	public Object method215(byte[] is, FontMetrics class414, boolean bool) {
		return Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1517(is), bool);
	}

	public Object method214(byte[] is, FontMetrics class414, boolean bool) {
		return Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1517(is), bool);
	}

	public static void method540(int i, byte i_0_) {
		if (i < 0 || i > 2)
			i = 0;
		Class235.anInt2906 = 1285272397 * i;
		Class477.aClass539Array5632 = (new Class539[1 + Class89.anIntArray931[-391332475 * Class235.anInt2906]]);
		Class235.anInt2899 = 0;
		Class235.anInt2901 = 0;
	}

	static final void method541(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class453.method7547(class118, class98, class527, -996229805);
	}

	static final void method542(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 876649685) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1407 = Class351.method6193(string, class527, -479801764);
		class118.aBool1384 = true;
	}

	static final void method543(CS2Executor class527, int i) {
		class527.animable.method15813((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 109);
	}

	static void method544(IComponentDefinitions class118, int i, int i_1_, int i_2_) {
		Class20.aClass118_183 = class118;
		Class20.anInt195 = i * 1511257025;
		Class20.anInt179 = -248935111 * i_1_;
	}

	static final void method545(CS2Executor class527, byte i) {
		class527.anInt7012 -= 283782002;
		int i_3_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_4_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_3_ | 1 << i_4_;
	}

	static final void method546(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aByte7458;
		if (client.aByte7458 != -1)
			client.aByte7458 = (byte) -6;
	}

	static String method547(int[] is, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		int i_5_ = 1104058571 * Class20.anInt186;
		for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
			Class240 class240 = IndexLoaders.aClass242_4922.method4156(is[i_6_], -1396181317);
			if (-1230505599 * class240.anInt2977 != -1) {
				NativeSprite class160 = (NativeSprite) (Class20.aClass229_191.get((long) (-1230505599 * class240.anInt2977)));
				if (null == class160) {
					Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, class240.anInt2977 * -1230505599, 0);
					if (class91 != null) {
						class160 = Renderers.SOFTWARE_RENDERER.method8444(class91, true);
						Class20.aClass229_191.put(class160, (long) (-1230505599 * class240.anInt2977));
					}
				}
				if (class160 != null) {
					Class115.aClass160Array1248[i_5_] = class160;
					stringbuilder.append(" <img=").append(i_5_).append(">");
					i_5_++;
				}
			}
		}
		return stringbuilder.toString();
	}

	static final void method548(CS2Executor class527, int i) {
		class527.anInt7012 -= 425673003;
		int i_7_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_8_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_9_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		Class96_Sub10.method14603(9, i_7_ << 16 | i_8_, i_9_, "", (byte) 54);
	}

	public static void method549(Class397 class397, int i, int i_10_, SceneObject interface12, int i_11_) {
		CS2Executor class527 = Class125.getNextScriptExecutor(1408358423);
		class527.anInterface12_7013 = interface12;
		Class107.method1834(class397, i, i_10_, class527, (byte) 23);
		class527.anInterface12_7013 = null;
	}

	static final void method550(CS2Executor class527, int i) {
		int i_12_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class523.method11219((char) i_12_, -2126211908) ? 1 : 0;
	}
}
