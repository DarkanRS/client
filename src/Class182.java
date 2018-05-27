
/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

public class Class182 {
	static GraphicalRenderer HARDWARE_RENDERER;
	static FontRenderer aClass8_2259;
	static NodeCollection ITEMS = new NodeCollection();
	public static NativeSprite[] aClass160Array2261;
	public static int anInt2262;
	public static Clipboard aClipboard2263;

	Class182() throws Throwable {
		throw new Error();
	}

	static void method3034(GraphicalRenderer class505, Class118 class118) {
		boolean bool = ((IndexLoaders.ITEM_INDEX_LOADER.softwareRender(class505, class118.anInt1426 * -56249735, 6040081 * class118.anInt1427, class118.anInt1323 * -346307573, ~0xffffff | class118.anInt1324 * 1279397863, 71935343 * class118.anInt1335, (class118.aBool1388 ? Class84.myPlayer.playerAppearance : null), 206421629)) == null);
		if (bool) {
			ITEMS.append(new Item(-56249735 * class118.anInt1426, 6040081 * class118.anInt1427, -346307573 * class118.anInt1323, (~0xffffff | 1279397863 * class118.anInt1324), 71935343 * class118.anInt1335, class118.aBool1388), -2006343484);
			Class109.method1858(class118, (byte) -22);
		}
	}

	static void method3035(GraphicalRenderer class505, Class118 class118) {
		boolean bool = ((IndexLoaders.ITEM_INDEX_LOADER.softwareRender(class505, class118.anInt1426 * -56249735, 6040081 * class118.anInt1427, class118.anInt1323 * -346307573, ~0xffffff | class118.anInt1324 * 1279397863, 71935343 * class118.anInt1335, (class118.aBool1388 ? Class84.myPlayer.playerAppearance : null), 206421629)) == null);
		if (bool) {
			ITEMS.append(new Item(-56249735 * class118.anInt1426, 6040081 * class118.anInt1427, -346307573 * class118.anInt1323, (~0xffffff | 1279397863 * class118.anInt1324), 71935343 * class118.anInt1335, class118.aBool1388), 949305639);
			Class109.method1858(class118, (byte) 12);
		}
	}

	static void method3036() {
		if (null != HARDWARE_RENDERER) {
			HARDWARE_RENDERER.method8396(-519725943);
			HARDWARE_RENDERER = null;
			aClass8_2259 = null;
		}
	}

	static void method3037() {
		if (null != HARDWARE_RENDERER) {
			HARDWARE_RENDERER.method8396(-1785069741);
			HARDWARE_RENDERER = null;
			aClass8_2259 = null;
		}
	}

	static final void method3038(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_0_ == -1) {
			int i_1_ = i_0_ >> 14 & 0x3fff;
			int i_2_ = i_0_ & 0x3fff;
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(660934001);
			i_1_ -= class219.anInt2711 * 1948093437;
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ >= IndexLoaders.MAP_REGION_DECODER.method4424(-1010474219))
				i_1_ = IndexLoaders.MAP_REGION_DECODER.method4424(-751193521);
			i_2_ -= class219.anInt2712 * -1002240017;
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-281530054))
				i_2_ = IndexLoaders.MAP_REGION_DECODER.method4451(-206286214);
			Class508.anInt5864 = -987778595 * ((i_1_ << 9) + 256);
			Class86.anInt833 = 1509271845 * (256 + (i_2_ << 9));
		} else {
			Class508.anInt5864 = 987778595;
			Class86.anInt833 = -1509271845;
		}
	}

	static final void method3039(CS2Executor class527, byte i) {
		Class217_Sub1 class217_sub1 = IsaacCipher.method7266(2114553677);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = null == class217_sub1 ? 0 : 1203083985 * class217_sub1.anInt2700;
	}

	public static Class472 method3040(int i, byte i_3_) {
		Class472[] class472s = Class275_Sub6.method12598(-1242125969);
		for (int i_4_ = 0; i_4_ < class472s.length; i_4_++) {
			Class472 class472 = class472s[i_4_];
			if (-2001827121 * class472.anInt5602 == i)
				return class472;
		}
		return null;
	}

	static final void method3041(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class108.method1845(class118, class98, class527, -1951994229);
	}

	static final void method3042(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_5_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_6_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_5_, 1029070809);
		if (i_6_ >= 1 && i_6_ <= 5 && null != class425.groundOptions[i_6_ - 1])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class425.groundOptions[i_6_ - 1];
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method3043(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.method12098((String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]), 1952889687));
	}

	public static String method3044(String string, int i) {
		int i_7_ = string.length();
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
			char c = string.charAt(i_9_);
			if ('<' == c || c == '>')
				i_8_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_8_ + i_7_);
		for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
			char c = string.charAt(i_10_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if ('>' == c)
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}
}
