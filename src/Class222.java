/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class222 implements Interface17 {
	int anInt2764;
	int anInt2765;
	
	public boolean method129(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		for (int i_0_ = 0; i_0_ < i && i_0_ < interface16s.length; i_0_++) {
			Interface16 interface16 = interface16s[i_0_];
			if (interface16 != null && (interface16.method92(317240429) == -954825461 * ((Class222) this).anInt2764) && (interface16.method125(2136691793) == 534615765 * ((Class222) this).anInt2765))
				return true;
		}
		return false;
	}

	public boolean method127(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199, byte i_1_) {
		for (int i_2_ = 0; i_2_ < i && i_2_ < interface16s.length; i_2_++) {
			Interface16 interface16 = interface16s[i_2_];
			if (interface16 != null && (interface16.method92(317240429) == -954825461 * ((Class222) this).anInt2764) && (interface16.method125(938641210) == 534615765 * ((Class222) this).anInt2765))
				return true;
		}
		return false;
	}

	public boolean method128(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		for (int i_3_ = 0; i_3_ < i && i_3_ < interface16s.length; i_3_++) {
			Interface16 interface16 = interface16s[i_3_];
			if (interface16 != null && (interface16.method92(317240429) == -954825461 * ((Class222) this).anInt2764) && (interface16.method125(898626927) == 534615765 * ((Class222) this).anInt2765))
				return true;
		}
		return false;
	}

	Class222(int i, int i_4_) {
		((Class222) this).anInt2764 = i * -1837752669;
		((Class222) this).anInt2765 = 593031805 * i_4_;
	}

	public boolean method126(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		for (int i_5_ = 0; i_5_ < i && i_5_ < interface16s.length; i_5_++) {
			Interface16 interface16 = interface16s[i_5_];
			if (interface16 != null && (interface16.method92(317240429) == -954825461 * ((Class222) this).anInt2764) && (interface16.method125(1229951069) == 534615765 * ((Class222) this).anInt2765))
				return true;
		}
		return false;
	}

	static void method3753(CS2Executor class527, int i) {
		class527.intStack[1942118537 * class527.anInt7012 - 1] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[1942118537 * class527.anInt7012 - 1]), -1396181317).anInt2973) * -985547275;
	}

	static String method3754(CharSequence charsequence, Class413 class413, int i) {
		if (charsequence == null)
			return null;
		int i_6_ = 0;
		int i_7_;
		for (i_7_ = charsequence.length(); (i_6_ < i_7_ && SoftwareItemRender.method7035(charsequence.charAt(i_6_), 1817858874)); i_6_++) {
			/* empty */
		}
		for (/**/; i_7_ > i_6_ && SoftwareItemRender.method7035(charsequence.charAt(i_7_ - 1), 1764637813); i_7_--) {
			/* empty */
		}
		int i_8_ = i_7_ - i_6_;
		if (i_8_ < 1 || i_8_ > Class78.method1386(class413, -1795366239))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_8_);
		for (int i_9_ = i_6_; i_9_ < i_7_; i_9_++) {
			char c = charsequence.charAt(i_9_);
			if (JS5Manager.method5491(c, 1531464997)) {
				char c_10_ = ItemDefaultsLoader.method7080(c, -1416509112);
				if (c_10_ != 0)
					stringbuilder.append(c_10_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static final void method3755(CS2Executor class527, byte i) {
		int i_11_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_11_, 262031096);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class220.anInt2722 * 1172439539;
	}

	public static int method3756(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, byte i_17_) {
		if (1 == (i_16_ & 0x1)) {
			int i_18_ = i_14_;
			i_14_ = i_15_;
			i_15_ = i_18_;
		}
		i_13_ &= 0x3;
		if (0 == i_13_)
			return i;
		if (i_13_ == 1)
			return i_12_;
		if (i_13_ == 2)
			return 7 - i - (i_14_ - 1);
		return 7 - i_12_ - (i_15_ - 1);
	}
}
