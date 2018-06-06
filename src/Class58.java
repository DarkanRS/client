/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58 implements Interface19 {
	public static Class529 aClass529_527;
	public static Class61 aClass61_528;

	public String method135(QuickChatDynamicValue class243, int[] is, long l) {
		if (class243 == QuickChatDynamicValue.LISTDIALOG) {
			Class431 class431 = IndexLoaders.aClass444_5570.method7424(is[0], (byte) 8);
			return class431.method7226((int) l, -64424168);
		}
		if (class243 == QuickChatDynamicValue.OBJDIALOG || class243 == QuickChatDynamicValue.OBJTRADEDIALOG) {
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) l, 1575511012);
			return class425.aString5043;
		}
		if (class243 == QuickChatDynamicValue.ENUM_STRING || class243 == QuickChatDynamicValue.ENUM_STRING_CLAN || QuickChatDynamicValue.ENUM_STRING_STATBASE == class243)
			return IndexLoaders.aClass444_5570.method7424(is[0], (byte) 8).method7226((int) l, 2106456977);
		return null;
	}

	public String method136(QuickChatDynamicValue class243, int[] is, long l) {
		if (class243 == QuickChatDynamicValue.LISTDIALOG) {
			Class431 class431 = IndexLoaders.aClass444_5570.method7424(is[0], (byte) 8);
			return class431.method7226((int) l, -451172927);
		}
		if (class243 == QuickChatDynamicValue.OBJDIALOG || class243 == QuickChatDynamicValue.OBJTRADEDIALOG) {
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) l, 1001383169);
			return class425.aString5043;
		}
		if (class243 == QuickChatDynamicValue.ENUM_STRING || class243 == QuickChatDynamicValue.ENUM_STRING_CLAN || QuickChatDynamicValue.ENUM_STRING_STATBASE == class243)
			return IndexLoaders.aClass444_5570.method7424(is[0], (byte) 8).method7226((int) l, 579863966);
		return null;
	}

	public String method137(QuickChatDynamicValue class243, int[] is, long l) {
		if (class243 == QuickChatDynamicValue.LISTDIALOG) {
			Class431 class431 = IndexLoaders.aClass444_5570.method7424(is[0], (byte) 8);
			return class431.method7226((int) l, 1807301402);
		}
		if (class243 == QuickChatDynamicValue.OBJDIALOG || class243 == QuickChatDynamicValue.OBJTRADEDIALOG) {
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) l, 980580063);
			return class425.aString5043;
		}
		if (class243 == QuickChatDynamicValue.ENUM_STRING || class243 == QuickChatDynamicValue.ENUM_STRING_CLAN || QuickChatDynamicValue.ENUM_STRING_STATBASE == class243)
			return IndexLoaders.aClass444_5570.method7424(is[0], (byte) 8).method7226((int) l, 870502499);
		return null;
	}

	static final void method1136(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 50);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method1137(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7316 ? 1 : 0;
	}

	static final void method1138(CS2Executor class527, int i) {
		class527.anInt7012 -= 425673003;
		int i_1_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_2_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_3_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		IComponentDefinitions class118 = Index.method5694(i_1_ << 16 | i_2_, i_3_, -1458346299);
		Class60.method1170(-609337146);
		Class282_Sub10 class282_sub10 = client.method11633(class118);
		Class304.method5409(class118, class282_sub10.method12179(-995475092), 1831058647 * class282_sub10.anInt7541, (byte) -101);
	}

	public static void method1139(int i) {
		Class419.aClass160_5004 = null;
		Class187.anInt2351 = -1481335827;
	}

	static final void method1140(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-283512869) == 1 ? 1 : 0;
	}

	static int method1141(int i) {
		if (null == client.aClass118_7257) {
			if (!Class20.aBool161) {
				if (Class149_Sub2.DEFAULTS_LOADER_7.aBool5876) {
					if (Class20.aClass282_Sub50_Sub7_168 != null)
						return (((Class282_Sub50_Sub7) Class20.aClass282_Sub50_Sub7_168).anInt9578 * -1332134173);
				} else if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445)
					return (-1332134173 * (((Class282_Sub50_Sub7) Class96_Sub23.aClass282_Sub50_Sub7_9445).anInt9578));
			} else {
				FontMetrics class414 = Class114.method1887(466263588);
				int i_4_ = Class163.aClass209_2031.method3569(1973979950);
				int i_5_ = Class163.aClass209_2031.method3570(756095591);
				if (!Class20.aBool162) {
					if (i_4_ > 1742345613 * Class301.anInt3555 && i_4_ < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
						int i_6_ = -1;
						for (int i_7_ = 0; i_7_ < Class20.anInt169 * 2144330291; i_7_++) {
							if (Class20.aBool187) {
								int i_8_ = ((Class20.anInt178 * 997766473 * (2144330291 * Class20.anInt169 - 1 - i_7_)) + (1 + (397683159 * class414.anInt4978 + (Class184.anInt2300 * 815250613 + 20))));
								if (i_5_ > (i_8_ - class414.anInt4978 * 397683159 - 1) && i_5_ < i_8_ + (-1518951631 * class414.anInt4979))
									i_6_ = i_7_;
							} else {
								int i_9_ = ((997766473 * Class20.anInt178 * (2144330291 * Class20.anInt169 - 1 - i_7_)) + (31 + Class184.anInt2300 * 815250613));
								if (i_5_ > (i_9_ - class414.anInt4978 * 397683159 - 1) && i_5_ < i_9_ + (class414.anInt4979 * -1518951631))
									i_6_ = i_7_;
							}
						}
						if (-1 != i_6_) {
							int i_10_ = 0;
							NodeIterator class460 = new NodeIterator(Class20.aClass482_171);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(1195046637)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class460.next()) {
								if (i_10_++ == i_6_)
									return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
							}
						}
					}
				} else if (i_4_ > 1742345613 * Class301.anInt3555 && i_4_ < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
					int i_11_ = -1;
					for (int i_12_ = 0; i_12_ < Class20.anInt170 * 292682521; i_12_++) {
						if (Class20.aBool187) {
							int i_13_ = (815250613 * Class184.anInt2300 + 20 + class414.anInt4978 * 397683159 + 1 + 997766473 * Class20.anInt178 * i_12_);
							if ((i_5_ > i_13_ - 397683159 * class414.anInt4978 - 1) && i_5_ < (class414.anInt4979 * -1518951631 + i_13_))
								i_11_ = i_12_;
						} else {
							int i_14_ = (31 + 815250613 * Class184.anInt2300 + i_12_ * (997766473 * Class20.anInt178));
							if ((i_5_ > i_14_ - 397683159 * class414.anInt4978 - 1) && i_5_ < (i_14_ + -1518951631 * class414.anInt4979))
								i_11_ = i_12_;
						}
					}
					if (-1 != i_11_) {
						int i_15_ = 0;
						Class469 class469 = new Class469(Class20.aClass477_182);
						for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); null != class282_sub50_sub15; class282_sub50_sub15 = (Class282_Sub50_Sub15) class469.next()) {
							if (i_15_++ == i_11_)
								return (-1332134173 * ((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).anInt9578);
						}
					}
				} else if (Class20.aClass282_Sub50_Sub15_163 != null && i_4_ > 143093737 * Class341.anInt3996 && i_4_ < (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996)) {
					int i_16_ = -1;
					for (int i_17_ = 0; i_17_ < (((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).anInt9769 * 2026887253); i_17_++) {
						if (Class20.aBool187) {
							int i_18_ = (i_17_ * (997766473 * Class20.anInt178) + (20 + (2107083711 * Class282_Sub50_Sub2.anInt9471) + 397683159 * class414.anInt4978 + 1));
							if ((i_5_ > i_18_ - class414.anInt4978 * 397683159 - 1) && i_5_ < (-1518951631 * class414.anInt4979 + i_18_))
								i_16_ = i_17_;
						} else {
							int i_19_ = (Class20.anInt178 * 997766473 * i_17_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
							if ((i_5_ > i_19_ - 397683159 * class414.anInt4978 - 1) && i_5_ < (-1518951631 * class414.anInt4979 + i_19_))
								i_16_ = i_17_;
						}
					}
					if (i_16_ != -1) {
						int i_20_ = 0;
						Class469 class469 = new Class469(((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770);
						for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
							if (i_20_++ == i_16_)
								return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
						}
					}
				}
			}
		}
		return -1;
	}

	public static void method1142(Class268 class268, int i) {
		if (((Class268) class268).aClass282_Sub15_Sub5_3304 != null)
			Class79.aClass282_Sub15_Sub4_783.method15276(((Class268) class268).aClass282_Sub15_Sub5_3304);
		else
			((Class268) class268).anInt3297 = -2147483648;
	}
}
