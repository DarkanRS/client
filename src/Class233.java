/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class233 {
	public static int anInt2880;
	SoftCache aClass229_2881 = new SoftCache(64);
	Index aClass317_2882;
	static Class202 aClass202_2883;

	public void method3923(int i, int i_0_) {
		synchronized (((Class233) this).aClass229_2881) {
			((Class233) this).aClass229_2881.method3858(i, (byte) -46);
		}
	}

	public Class233(Game class486, XLanguage class495, Index class317) {
		((Class233) this).aClass317_2882 = class317;
		if (null != ((Class233) this).aClass317_2882)
			((Class233) this).aClass317_2882.filesCount(-71319279 * SharedConfigsType.aClass120_1464.id);
	}

	public void method3924(int i) {
		synchronized (((Class233) this).aClass229_2881) {
			((Class233) this).aClass229_2881.method3859(122018948);
		}
	}

	public void method3926(byte i) {
		synchronized (((Class233) this).aClass229_2881) {
			((Class233) this).aClass229_2881.method3863(733385638);
		}
	}

	public Class537 method3933(int i, int i_1_) {
		Class537 class537;
		synchronized (((Class233) this).aClass229_2881) {
			class537 = ((Class537) ((Class233) this).aClass229_2881.get((long) i));
		}
		if (null != class537)
			return class537;
		byte[] is;
		synchronized (((Class233) this).aClass317_2882) {
			is = (((Class233) this).aClass317_2882.getFile(-71319279 * SharedConfigsType.aClass120_1464.id, i));
		}
		class537 = new Class537();
		if (is != null)
			class537.method11487(new RsByteBuffer(is), (byte) -105);
		synchronized (((Class233) this).aClass229_2881) {
			((Class233) this).aClass229_2881.put(class537, (long) i);
		}
		return class537;
	}

	public static void method3936(int[][] is, int i) {
		Class532.anIntArrayArray7072 = is;
	}

	static final void method3937(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
			char c = string.charAt(i_2_);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = stringbuilder.toString();
	}

	static final void method3938(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
	}

	static final void method3939(CS2Executor class527, int i) {
		XLinkedNodeList.method7886(true, 1516035825);
	}

	static final void method3940(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_3_, (byte) 105);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_3_ >> 16];
		Class388.method6689(class118, class98, class527, -1054634282);
	}

	static final void method3941(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		WorldMapAreaDefs.method3738(class118, class98, class527, (byte) -2);
	}

	static final void method3942(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub10_8215, ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1) ? 1 : 0, -989964873);
		Class282_Sub20_Sub36.method15418(668850119);
		Class190.method3148((byte) 44);
		client.aBool7175 = false;
	}
}
