/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class174 {
	static Class91[] aClass91Array2132;
	static int anInt2133;
	static int anInt2134;
	static boolean aBool2135;
	static int anInt2136;
	static int anInt2137;
	static Class91 aClass91_2138;
	static Class356 aClass356_2139;
	static Class353 aClass353_2140;
	static Class91 aClass91_2141;

	public static void method2946(Class356 class356, Class353 class353, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		aClass356_2139 = class356;
		aClass353_2140 = class353;
		anInt2134 = -773373219 * i;
		anInt2133 = 1089378155 * i_0_;
		anInt2136 = 1954124527 * i_1_;
		Class208.anInt2662 = i_2_ * -1130345879;
		Class232.anInt2878 = i_3_ * -3876747;
		Class477.anInt5630 = -964486071 * i_4_;
		Class359.anInt4163 = i_5_ * 1622687971;
		aClass91_2141 = null;
		aClass91_2138 = null;
		Class242.aClass91_2981 = null;
		Class434.anInt5329 = i_6_ * 564282469;
		anInt2137 = -2088983635 * i_7_;
		method2954(1420950788);
		aBool2135 = true;
	}

	Class174() throws Throwable {
		throw new Error();
	}

	public static void method2947(String string, boolean bool, GraphicalRenderer class505, FontRenderer class8, Class414 class414) {
		boolean bool_8_ = !aBool2135 || method2954(1412758933);
		if (bool_8_) {
			if (aBool2135 && bool_8_) {
				class414 = Class197.aClass414_2436;
				class8 = class505.method8448(class414, aClass91Array2132, true);
				int i = class414.method6951(string, 250, null, (byte) 114);
				int i_9_ = class414.method6972(string, 250, 1200654985 * class414.anInt4975, null, 258805318);
				int i_10_ = aClass91_2138.anInt957;
				int i_11_ = 4 + i_10_;
				i += i_11_ * 2;
				i_9_ += i_11_ * 2;
				if (i < -1424630769 * anInt2136)
					i = -1424630769 * anInt2136;
				if (i_9_ < Class208.anInt2662 * 15328729)
					i_9_ = Class208.anInt2662 * 15328729;
				int i_12_ = (aClass356_2139.method6221(i, client.anInt7439 * 150480619, 1118177104) + anInt2134 * 1169073525);
				int i_13_ = (aClass353_2140.method6198(i_9_, client.anInt7312 * 1176039023, 2134733941) + -347742909 * anInt2133);
				class505.method8444(Class242.aClass91_2981, false).method2772(aClass91_2141.anInt957 + i_12_, aClass91_2141.anInt954 + i_13_, i - aClass91_2141.anInt957 * 2, i_9_ - 2 * aClass91_2141.anInt954, 1, 0, 0);
				class505.method8444(aClass91_2141, true).method2752(i_12_, i_13_);
				aClass91_2141.method1525();
				class505.method8444(aClass91_2141, true).method2752(i + i_12_ - i_10_, i_13_);
				aClass91_2141.method1526();
				class505.method8444(aClass91_2141, true).method2752(i + i_12_ - i_10_, i_9_ + i_13_ - i_10_);
				aClass91_2141.method1525();
				class505.method8444(aClass91_2141, true).method2752(i_12_, i_9_ + i_13_ - i_10_);
				aClass91_2141.method1526();
				class505.method8444(aClass91_2138, true).method2756(i_12_, aClass91_2141.anInt954 + i_13_, i_10_, i_9_ - aClass91_2141.anInt954 * 2);
				aClass91_2138.method1527();
				class505.method8444(aClass91_2138, true).method2756(aClass91_2141.anInt957 + i_12_, i_13_, i - aClass91_2141.anInt957 * 2, i_10_);
				aClass91_2138.method1527();
				class505.method8444(aClass91_2138, true).method2756(i_12_ + i - i_10_, i_13_ + aClass91_2141.anInt954, i_10_, i_9_ - 2 * aClass91_2141.anInt954);
				aClass91_2138.method1527();
				class505.method8444(aClass91_2138, true).method2756(aClass91_2141.anInt957 + i_12_, i_9_ + i_13_ - i_10_, i - 2 * aClass91_2141.anInt957, i_10_);
				aClass91_2138.method1527();
				class8.method378(string, i_12_ + i_11_, i_13_ + i_11_, i - i_11_ * 2, i_9_ - 2 * i_11_, Class434.anInt5329 * 1549061485 | ~0xffffff, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 16);
				Class292.method5201(i_12_, i_13_, i, i_9_, (byte) 12);
			} else {
				int i = class414.method6951(string, 250, null, (byte) 103);
				int i_14_ = class414.method6949(string, 250, null, 437013959) * 13;
				int i_15_ = 4;
				int i_16_ = i_15_ + 6;
				int i_17_ = 6 + i_15_;
				class505.B(i_16_ - i_15_, i_17_ - i_15_, i_15_ + i + i_15_, i_14_ + i_15_ + i_15_, -16777216, 0);
				class505.method8430(i_16_ - i_15_, i_17_ - i_15_, i_15_ + (i + i_15_), i_15_ + i_14_ + i_15_, -1, 0);
				class8.method378(string, i_16_, i_17_, i, i_14_, -1, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 115);
				Class292.method5201(i_16_ - i_15_, i_17_ - i_15_, i_15_ + i + i_15_, i_15_ + i_14_ + i_15_, (byte) 12);
			}
			if (bool) {
				try {
					class505.method8393((short) 18732);
				} catch (Exception_Sub3 exception_sub3) {
					/* empty */
				}
			}
		}
	}

	public static void method2948(Class356 class356, Class353 class353, int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		aClass356_2139 = class356;
		aClass353_2140 = class353;
		anInt2134 = -773373219 * i;
		anInt2133 = 1089378155 * i_18_;
		anInt2136 = 1954124527 * i_19_;
		Class208.anInt2662 = i_20_ * -1130345879;
		Class232.anInt2878 = i_21_ * -3876747;
		Class477.anInt5630 = -964486071 * i_22_;
		Class359.anInt4163 = i_23_ * 1622687971;
		aClass91_2141 = null;
		aClass91_2138 = null;
		Class242.aClass91_2981 = null;
		Class434.anInt5329 = i_24_ * 564282469;
		anInt2137 = -2088983635 * i_25_;
		method2954(784858401);
		aBool2135 = true;
	}

	static boolean method2949() {
		boolean bool = true;
		if (null == aClass91_2141) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class232.anInt2878 * -1269811235, 400063033))
				aClass91_2141 = Class91.method1515(IndexLoaders.SPRITES_INDEX, Class232.anInt2878 * -1269811235);
			else
				bool = false;
		}
		if (aClass91_2138 == null) {
			if (IndexLoaders.SPRITES_INDEX.method5661(-2064935431 * Class477.anInt5630, -515093526))
				aClass91_2138 = Class91.method1515(IndexLoaders.SPRITES_INDEX, -2064935431 * Class477.anInt5630);
			else
				bool = false;
		}
		if (null == Class242.aClass91_2981) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class359.anInt4163 * -630520629, -550560759))
				Class242.aClass91_2981 = Class91.method1515(IndexLoaders.SPRITES_INDEX, Class359.anInt4163 * -630520629);
			else
				bool = false;
		}
		if (null == Class197.aClass414_2436) {
			if (IndexLoaders.FONT_METRICS_INDEX.method5661(anInt2137 * 2042148901, 697702154))
				Class197.aClass414_2436 = Class163.method2845(IndexLoaders.FONT_METRICS_INDEX, 2042148901 * anInt2137, (byte) 71);
			else
				bool = false;
		}
		if (null == aClass91Array2132) {
			if (IndexLoaders.SPRITES_INDEX.method5661(anInt2137 * 2042148901, -1995068478))
				aClass91Array2132 = Class91.method1534(IndexLoaders.SPRITES_INDEX, 2042148901 * anInt2137);
			else
				bool = false;
		}
		return bool;
	}

	static boolean method2950() {
		boolean bool = true;
		if (null == aClass91_2141) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class232.anInt2878 * -1269811235, -350587773))
				aClass91_2141 = Class91.method1515(IndexLoaders.SPRITES_INDEX, Class232.anInt2878 * -1269811235);
			else
				bool = false;
		}
		if (aClass91_2138 == null) {
			if (IndexLoaders.SPRITES_INDEX.method5661(-2064935431 * Class477.anInt5630, 1697357181))
				aClass91_2138 = Class91.method1515(IndexLoaders.SPRITES_INDEX, -2064935431 * Class477.anInt5630);
			else
				bool = false;
		}
		if (null == Class242.aClass91_2981) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class359.anInt4163 * -630520629, 72809123))
				Class242.aClass91_2981 = Class91.method1515(IndexLoaders.SPRITES_INDEX, Class359.anInt4163 * -630520629);
			else
				bool = false;
		}
		if (null == Class197.aClass414_2436) {
			if (IndexLoaders.FONT_METRICS_INDEX.method5661(anInt2137 * 2042148901, 1443929105))
				Class197.aClass414_2436 = Class163.method2845(IndexLoaders.FONT_METRICS_INDEX, 2042148901 * anInt2137, (byte) 44);
			else
				bool = false;
		}
		if (null == aClass91Array2132) {
			if (IndexLoaders.SPRITES_INDEX.method5661(anInt2137 * 2042148901, 199431483))
				aClass91Array2132 = Class91.method1534(IndexLoaders.SPRITES_INDEX, 2042148901 * anInt2137);
			else
				bool = false;
		}
		return bool;
	}

	public static void method2951(Class356 class356, Class353 class353, int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		aClass356_2139 = class356;
		aClass353_2140 = class353;
		anInt2134 = -773373219 * i;
		anInt2133 = 1089378155 * i_26_;
		anInt2136 = 1954124527 * i_27_;
		Class208.anInt2662 = i_28_ * -1130345879;
		Class232.anInt2878 = i_29_ * -3876747;
		Class477.anInt5630 = -964486071 * i_30_;
		Class359.anInt4163 = i_31_ * 1622687971;
		aClass91_2141 = null;
		aClass91_2138 = null;
		Class242.aClass91_2981 = null;
		Class434.anInt5329 = i_32_ * 564282469;
		anInt2137 = -2088983635 * i_33_;
		method2954(112677036);
		aBool2135 = true;
	}

	public static void method2952(String string, boolean bool, GraphicalRenderer class505, FontRenderer class8, Class414 class414) {
		boolean bool_34_ = !aBool2135 || method2954(762227546);
		if (bool_34_) {
			if (aBool2135 && bool_34_) {
				class414 = Class197.aClass414_2436;
				class8 = class505.method8448(class414, aClass91Array2132, true);
				int i = class414.method6951(string, 250, null, (byte) 106);
				int i_35_ = class414.method6972(string, 250, 1200654985 * class414.anInt4975, null, -202475606);
				int i_36_ = aClass91_2138.anInt957;
				int i_37_ = 4 + i_36_;
				i += i_37_ * 2;
				i_35_ += i_37_ * 2;
				if (i < -1424630769 * anInt2136)
					i = -1424630769 * anInt2136;
				if (i_35_ < Class208.anInt2662 * 15328729)
					i_35_ = Class208.anInt2662 * 15328729;
				int i_38_ = (aClass356_2139.method6221(i, client.anInt7439 * 150480619, 1988754029) + anInt2134 * 1169073525);
				int i_39_ = (aClass353_2140.method6198(i_35_, client.anInt7312 * 1176039023, 617450168) + -347742909 * anInt2133);
				class505.method8444(Class242.aClass91_2981, false).method2772(aClass91_2141.anInt957 + i_38_, aClass91_2141.anInt954 + i_39_, i - aClass91_2141.anInt957 * 2, i_35_ - 2 * aClass91_2141.anInt954, 1, 0, 0);
				class505.method8444(aClass91_2141, true).method2752(i_38_, i_39_);
				aClass91_2141.method1525();
				class505.method8444(aClass91_2141, true).method2752(i + i_38_ - i_36_, i_39_);
				aClass91_2141.method1526();
				class505.method8444(aClass91_2141, true).method2752(i + i_38_ - i_36_, i_35_ + i_39_ - i_36_);
				aClass91_2141.method1525();
				class505.method8444(aClass91_2141, true).method2752(i_38_, i_35_ + i_39_ - i_36_);
				aClass91_2141.method1526();
				class505.method8444(aClass91_2138, true).method2756(i_38_, aClass91_2141.anInt954 + i_39_, i_36_, i_35_ - aClass91_2141.anInt954 * 2);
				aClass91_2138.method1527();
				class505.method8444(aClass91_2138, true).method2756(aClass91_2141.anInt957 + i_38_, i_39_, i - aClass91_2141.anInt957 * 2, i_36_);
				aClass91_2138.method1527();
				class505.method8444(aClass91_2138, true).method2756(i_38_ + i - i_36_, i_39_ + aClass91_2141.anInt954, i_36_, i_35_ - 2 * aClass91_2141.anInt954);
				aClass91_2138.method1527();
				class505.method8444(aClass91_2138, true).method2756(aClass91_2141.anInt957 + i_38_, i_35_ + i_39_ - i_36_, i - 2 * aClass91_2141.anInt957, i_36_);
				aClass91_2138.method1527();
				class8.method378(string, i_38_ + i_37_, i_39_ + i_37_, i - i_37_ * 2, i_35_ - 2 * i_37_, Class434.anInt5329 * 1549061485 | ~0xffffff, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 84);
				Class292.method5201(i_38_, i_39_, i, i_35_, (byte) 12);
			} else {
				int i = class414.method6951(string, 250, null, (byte) 108);
				int i_40_ = class414.method6949(string, 250, null, 437013959) * 13;
				int i_41_ = 4;
				int i_42_ = i_41_ + 6;
				int i_43_ = 6 + i_41_;
				class505.B(i_42_ - i_41_, i_43_ - i_41_, i_41_ + i + i_41_, i_40_ + i_41_ + i_41_, -16777216, 0);
				class505.method8430(i_42_ - i_41_, i_43_ - i_41_, i_41_ + (i + i_41_), i_41_ + i_40_ + i_41_, -1, 0);
				class8.method378(string, i_42_, i_43_, i, i_40_, -1, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 102);
				Class292.method5201(i_42_ - i_41_, i_43_ - i_41_, i_41_ + i + i_41_, i_41_ + i_40_ + i_41_, (byte) 12);
			}
			if (bool) {
				try {
					class505.method8393((short) 8478);
				} catch (Exception_Sub3 exception_sub3) {
					/* empty */
				}
			}
		}
	}

	static void method2953(CS2Executor class527, byte i) {
		Class240 class240 = IndexLoaders.aClass242_4922.method4156((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -1396181317);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class240.anIntArrayArray2966 == null ? 0 : class240.anIntArrayArray2966.length);
	}

	static boolean method2954(int i) {
		boolean bool = true;
		if (null == aClass91_2141) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class232.anInt2878 * -1269811235, -1408691498))
				aClass91_2141 = Class91.method1515(IndexLoaders.SPRITES_INDEX, Class232.anInt2878 * -1269811235);
			else
				bool = false;
		}
		if (aClass91_2138 == null) {
			if (IndexLoaders.SPRITES_INDEX.method5661(-2064935431 * Class477.anInt5630, -743951421))
				aClass91_2138 = Class91.method1515(IndexLoaders.SPRITES_INDEX, -2064935431 * Class477.anInt5630);
			else
				bool = false;
		}
		if (null == Class242.aClass91_2981) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class359.anInt4163 * -630520629, -88289735))
				Class242.aClass91_2981 = Class91.method1515(IndexLoaders.SPRITES_INDEX, Class359.anInt4163 * -630520629);
			else
				bool = false;
		}
		if (null == Class197.aClass414_2436) {
			if (IndexLoaders.FONT_METRICS_INDEX.method5661(anInt2137 * 2042148901, 851658535))
				Class197.aClass414_2436 = Class163.method2845(IndexLoaders.FONT_METRICS_INDEX, 2042148901 * anInt2137, (byte) 18);
			else
				bool = false;
		}
		if (null == aClass91Array2132) {
			if (IndexLoaders.SPRITES_INDEX.method5661(anInt2137 * 2042148901, 1650799626))
				aClass91Array2132 = Class91.method1534(IndexLoaders.SPRITES_INDEX, 2042148901 * anInt2137);
			else
				bool = false;
		}
		return bool;
	}

	static final void method2955(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		class118.anInt1309 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -511891533);
	}

	static final void method2956(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_) {
		if (i_45_ >= 1 && i_46_ >= 1 && i_45_ <= IndexLoaders.MAP_REGION_DECODER.method4424(607754892) - 2 && i_46_ <= IndexLoaders.MAP_REGION_DECODER.method4451(-1534289910) - 2) {
			int i_52_ = i;
			if (i_52_ < 3 && IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(i_45_, i_46_, 2056160372))
				i_52_++;
			if (IndexLoaders.MAP_REGION_DECODER.method4430(-1735262041) != null) {
				IndexLoaders.MAP_REGION_DECODER.method4441(1508379413).method12475(Renderers.SOFTWARE_RENDERER, i, i_44_, i_45_, i_46_, IndexLoaders.MAP_REGION_DECODER.method4552(i, 1801793645), -1251785888);
				if (i_47_ >= 0) {
					int i_53_ = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 28);
					Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub23_8202, 1, -1662895154);
					IndexLoaders.MAP_REGION_DECODER.method4441(1508379413).method12459(Renderers.SOFTWARE_RENDERER, i_52_, i, i_45_, i_46_, i_47_, i_48_, i_49_, IndexLoaders.MAP_REGION_DECODER.method4552(i, 1801793645), i_50_, -1045787010);
					Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub23_8202, i_53_, -1533283163);
				}
			}
		}
	}

	static final void executeOperation(CS2OpInfo operation, CS2Executor executor, int i) {
		switch (-2026890351 * operation.opcode) {
		case 634:
			Class6.method300(executor, (byte) -25);
			break;
		case 276:
			Class148.method2554(executor, (byte) -100);
			break;
		case 482:
			Class106.method1814(executor, 2146298011);
			break;
		case 430:
			Class15.method543(executor, -1116495804);
			break;
		case 910:
			Class516.method8864(executor, (byte) 24);
			break;
		case 584:
			Class292.method5200(false, executor, (byte) 104);
			break;
		case 911:
			Class289.method5099(executor, 1469022729);
			break;
		case 545:
			SoftwareItemRender.method7032(executor, (short) 2048);
			break;
		case 548:
			Class282_Sub15_Sub1.method14818(executor, 2052773395);
			break;
		case 135:
			Class286.method5045(executor, -660316243);
			break;
		case 952:
			Class12.method481(executor, (byte) -34);
			break;
		case 134:
			Class110.method1860(executor, 424878904);
			break;
		case 684:
			Class461.method7704(executor, 1470241483);
			break;
		case 349:
			SharedConfigsType.method2091(executor, (byte) -128);
			break;
		case 398:
			Class198.method3233(executor, 1606647230);
			break;
		case 311:
			Class121.method2104(executor, (short) 6914);
			break;
		case 479:
			Class8_Sub3.method14342(executor, (byte) 22);
			break;
		case 8:
			Class451.method7518(executor, (byte) 110);
			break;
		case 437:
			Class13.method504(executor, (byte) -59);
			break;
		case 354:
			Class412.method6935(executor, -1926271873);
			break;
		case 980:
			Class148.method2552(executor, (byte) 127);
			break;
		case 569:
			Class9.method453(executor, -1939716577);
			break;
		case 594:
			Class123.method2151(executor, -1491014025);
			break;
		case 953:
			Class241.method4147(executor, 1288121175);
			break;
		case 672:
			Class19.method587(executor, (byte) 0);
			break;
		case 622:
			Class391.method6733(executor, -1968584575);
			break;
		case 800:
			Index.method5691(executor, (byte) 61);
			break;
		case 827:
			Class281.method4986(executor, -1873864599);
			break;
		case 471:
			Class202.method3339(executor, (byte) -40);
			break;
		case 643:
			Class321.method5755(executor, -607903231);
			break;
		case 459:
			Class109.method1854(executor, -55825312);
			break;
		case 841:
			Class521_Sub1_Sub3_Sub2.method16095(executor, -1845576037);
			break;
		case 504:
			Class514.method8844(executor, 1206150202);
			break;
		case 794:
			Class282_Sub40.method13301(executor, -1804603173);
			break;
		case 893:
			Class263.method4775(executor, 1845242660);
			break;
		case 967:
			Class11.method466(executor, -1305434793);
			break;
		case 701:
			Class344.method6117(executor, (byte) 2);
			break;
		case 798:
			Class9.method454(executor, (short) -21438);
			break;
		case 456:
			Class282_Sub17_Sub4.method15408(executor, -685194609);
			break;
		case 998:
			Class96_Sub10_Sub1.method15552(executor, 2088367245);
			break;
		case 235:
			Class175.method2959(executor, -1886053583);
			break;
		case 742:
			Class290.method5119(executor, (byte) 46);
			break;
		case 970:
			Class31.method810(executor, -1547469871);
			break;
		case 709:
			Class359.method6243(executor, -666642130);
			break;
		case 705:
			Class344.method6120(executor, 1661153095);
			break;
		case 392:
			Class282_Sub53_Sub1.method14746(executor, (byte) -29);
			break;
		case 934:
			Class15.method550(executor, -165949702);
			break;
		case 628:
			Class282_Sub50_Sub17.method15510(executor, -1046810016);
			break;
		case 24:
			Class43.method893(executor, (byte) 112);
			break;
		case 859:
			Class506.method8720(executor, 1049052056);
			break;
		case 580:
			Class258.method4566(executor, 676534483);
			break;
		case 592:
			Class282_Sub15_Sub1.method14841(executor, (byte) 28);
			break;
		case 801:
			Class184.method3068(executor, -1537265152);
			break;
		case 320:
			JS5Manager.method5487(executor, -1180439421);
			break;
		case 217:
			Class52.method1085(executor, (byte) 1);
			break;
		case 216:
			Class325.method5786(executor, -2134478984);
			break;
		case 968:
			Class87.method1490(executor, (byte) -22);
			break;
		case 269:
			Class96_Sub16.method14647(executor, (byte) -103);
			break;
		case 336:
			Class320.method5733(executor, (short) -148);
			break;
		case 319:
			Class6.method298(executor, (byte) 73);
			break;
		case 944:
			Class96_Sub19.method14667(executor, -1073987916);
			break;
		case 399:
			Class282_Sub47.method13410(executor, -1565159777);
			break;
		case 289:
			Class368.method6310(executor, (byte) 29);
			break;
		case 419:
			Class58.method1140(executor, (byte) -44);
			break;
		case 390:
			Class386.method6675(executor, 1942118537);
			break;
		case 767:
			Class169.method2871(executor, 1374246322);
			break;
		case 335:
			Class224.method3783(executor, -35571356);
			break;
		case 507:
			Class477.method7962(executor, (byte) -1);
			break;
		case 463:
			Class389.method6696(executor, -1724482391);
			break;
		case 914:
			Class249.method4278(executor, -452491100);
			break;
		case 725:
			Class214.method3667(executor, (byte) 125);
			break;
		case 257:
			Class211.method3628(executor, -1952929458);
			break;
		case 153:
			IncomingPacket.method6373(executor, 676845986);
			break;
		case 446:
			Class454.method7552(executor, 1655788745);
			break;
		case 221:
			AnimationDefinitions.method11147(executor, -730384213);
			break;
		case 756:
			ReferenceTable.method5765(executor, -1146292184);
			break;
		case 978:
			Class149_Sub4.method14659(executor, (byte) -119);
			break;
		case 698:
			NamedFileReference.method868(executor, (byte) 2);
			break;
		case 67:
			Class282_Sub20_Sub34.method15416(executor, (byte) -72);
			break;
		case 2:
			Index.method5696(executor, -1293199501);
			break;
		case 241:
			ObjectIndexLoader.method7915(executor, (byte) 98);
			break;
		case 113:
			Class335.method5962(executor, (byte) 100);
			break;
		case 445:
			Class58.method1138(executor, 464964387);
			break;
		case 695:
			Class468_Sub20.method12802(executor, -1448690702);
			break;
		case 180:
			Class458.method7675(executor, (byte) 110);
			break;
		case 3:
			Class258.method4565(executor, 1407413762);
			break;
		case 340:
			Class536.method11486(executor, (byte) 8);
			break;
		case 519:
			Class3.method287(executor, -827990966);
			break;
		case 141:
			Class184.method3066(executor, 1594200406);
			break;
		case 665:
			Class283.method5008(executor, 498867995);
			break;
		case 677:
			Class386.method6668(executor, 2016128779);
			break;
		case 884:
			Class89.method1501(executor, (byte) -7);
			break;
		case 499:
			Class187.method3117(executor, (byte) 8);
			break;
		case 782:
			Class351.method6195(executor, 2080762835);
			break;
		case 466:
			Class90.method1511(executor, 1420591471);
			break;
		case 461:
			Class173.method2945(executor, (byte) -86);
			break;
		case 1003:
			Class496.method8303(executor, (byte) -79);
			break;
		case 621:
			Class500.method8343(executor, (byte) -115);
			break;
		case 870:
			Class96_Sub10.method14602(executor, 150793073);
			break;
		case 394:
			Defaults7Loader.method8756(executor, 2026269331);
			break;
		case 635:
			Class151.method2588(executor, -1348128897);
			break;
		case 305:
			Class534.method11440(executor, 2107000818);
			break;
		case 554:
			Class427.method7186(executor, -1280411622);
			break;
		case 170:
			Class346.method6151(executor, -361441917);
			break;
		case 547:
			Class90.method1510(executor, (short) 255);
			break;
		case 423:
			Class20.method745(executor, -1563028695);
			break;
		case 529:
			Class58.method1136(executor, -1826018092);
			break;
		case 472:
			Class459.method7676(executor, (byte) -4);
			break;
		case 674:
			Class29.method787(executor, (byte) 65);
			break;
		case 506:
			Class377.method6396(executor, (byte) 0);
			break;
		case 324:
			OutgoingPacket.method6439(executor, -2092570667);
			break;
		case 583:
			Class260.method4633(executor, (byte) 105);
			break;
		case 318:
			Class96.method1604(executor, (byte) -67);
			break;
		case 988:
			Class224.method3780(executor, (byte) 1);
			break;
		case 4:
			Class245.method4197(executor, -1500312404);
			break;
		case 602:
			Class369.method6316(executor, 670685920);
			break;
		case 969:
			Class529.method11339(executor, 2145994396);
			break;
		case 107:
			Class77.method1366(executor, (byte) 58);
			break;
		case 736:
			Class193.method3171(executor, (byte) 0);
			break;
		case 601:
			Class282_Sub33.method12584(executor, 283782002);
			break;
		case 863:
			Class447.method7461(executor, (byte) -97);
			break;
		case 330:
			Class350.method6190(executor, (byte) 1);
			break;
		case 109:
			Class260.method4631(executor, 2086871736);
			break;
		case 962:
			Class46.method933(executor, -1874904461);
			break;
		case 328:
			Class318.method5697(executor, (short) 12292);
			break;
		case 116:
			Class308.method5474(executor, 1982073191);
			break;
		case 219:
			Class397.method6776(executor, 468691792);
			break;
		case 931:
			Game.method8205(executor, (byte) 0);
			break;
		case 836:
			WorldMapAreaDefs.method3737(executor, (short) -22190);
			break;
		case 840:
			Class323.method5776(executor, (short) 2575);
			break;
		case 610:
			MapRegionLoaderTask.method6072(executor, -1780791284);
			break;
		case 469:
			Class202.method3346(executor, -431872395);
			break;
		case 86:
			Class14.method536(executor, (byte) -94);
			break;
		case 201:
			Class328.method5832(executor, 1562481333);
			break;
		case 739:
			Class413.method6938(executor, (byte) 2);
			break;
		case 20:
			Class236.method3984(executor, -1870467933);
			break;
		case 676:
			Class159.method2737(executor, -117974588);
			break;
		case 958:
			Class516.method8865(executor, (byte) 52);
			break;
		default:
			throw new RuntimeException();
		case 913:
			Class357.method6229(executor, -1908305189);
			break;
		case 818:
			Class468_Sub25.method12933(executor, (short) 20877);
			break;
		case 738:
			Class417.method7006(executor, 402898305);
			break;
		case 422:
			Class6.method301(executor, (short) 23634);
			break;
		case 268:
			Class96_Sub10_Sub1.method15555(executor, (byte) 11);
			break;
		case 449:
			Class369.method6314(executor, (short) -943);
			break;
		case 551:
			Class271.method4826(executor, 1815223167);
			break;
		case 285:
			Class11.method468(executor, 750971439);
			break;
		case 248:
			Class155.method2639(executor, (short) -21213);
			break;
		case 351:
			Class225_Sub6.method13412(executor, -448360254);
			break;
		case 713:
			Class4.method291(executor, 1759451492);
			break;
		case 312:
			Class263.method4776(executor, -1764845485);
			break;
		case 348:
			LoadingStage.method6678(executor, (byte) 1);
			break;
		case 661:
			Class76.method1362(executor, 1736509021);
			break;
		case 174:
			TilestreamPacket.method6290(executor, 403949281);
			break;
		case 854:
			Class52_Sub1.method14491(executor, (byte) -21);
			break;
		case 0:
			Defaults6Loader.method11249(executor, -523975261);
			break;
		case 902:
			Class299.method5315(executor, 141891001);
			break;
		case 195:
			Class410.method6909(executor, 16777472);
			break;
		case 139:
			Class411.method6916(executor, (byte) 39);
			break;
		case 838:
			InventoriesIndexLoader.method6741(executor, 2018655804);
			break;
		case 155:
			Class77.method1367(executor, (short) 12053);
			break;
		case 917:
			Class464.method7744(executor, -247424395);
			break;
		case 300:
			Defaults6Loader.method11246(executor, (byte) -94);
			break;
		case 447:
			Class161.method2825(executor, (byte) -101);
			break;
		case 106:
			Class282_Sub17_Sub4.method15406(executor, 1518588622);
			break;
		case 40:
			Class202.method3341(executor, (byte) 88);
			break;
		case 391:
			Class275_Sub6.method12597(executor, (byte) -97);
			break;
		case 731:
			Class282_Sub20_Sub36.method15417(executor, -1388586770);
			break;
		case 907:
			Class96_Sub14.method14644(executor, -390705283);
			break;
		case 642:
			Class28.method777(executor, (byte) 0);
			break;
		case 313:
			InputStream_Sub1.method12724(executor, -1400786117);
			break;
		case 416:
			Class540.method11593(executor, -1883162750);
			break;
		case 188:
			IndexReference.method1783(executor, 978567760);
			break;
		case 750:
			Class258.method4567(executor, (short) 25929);
			break;
		case 450:
			Class240.method4137(executor, (byte) 78);
			break;
		case 404:
			Class216.method3674(executor, -496810681);
			break;
		case 686:
			Class258.method4568(executor, 1613923439);
			break;
		case 886:
			Class507.method8723(executor, -483917368);
			break;
		case 704:
			Class339.method6041(executor, (short) -18363);
			break;
		case 647:
			Class100.method1641(executor, 1805177610);
			break;
		case 495:
			Class123.method2150(executor, (byte) 5);
			break;
		case 386:
			Class268.method4798(executor, -135059604);
			break;
		case 283:
			Class151.method2587(executor, (byte) -15);
			break;
		case 415:
			MapRegionLoaderTask.method6071(executor, (byte) 0);
			break;
		case 940:
			Class107.method1837(executor, 1811088132);
			break;
		case 306:
			Class281.method4988(executor, -1086132036);
			break;
		case 651:
			Class184.method3064(executor, (short) -23810);
			break;
		case 157:
			Class158.method2729(executor, -2083866455);
			break;
		case 176:
			Class293.method5203(executor, -1859060063);
			break;
		case 797:
			Class515.method8863(executor, 1642166574);
			break;
		case 264:
			Class377.method6400(executor, (byte) 0);
			break;
		case 477:
			Class125.method2171(executor, (byte) 127);
			break;
		case 82:
			Class90.method1509(executor, 1050439044);
			break;
		case 712:
			Class249.method4279(executor, -354761268);
			break;
		case 72:
			IncomingPacket.method6381(executor, (byte) 28);
			break;
		case 239:
			Class283.method5010(executor, -699339710);
			break;
		case 25:
			Class402.method6799(executor, (byte) 0);
			break;
		case 122:
			Class483.method8152(executor, 1606867880);
			break;
		case 291:
			Class272.method4839(executor, (byte) 0);
			break;
		case 675:
			Class353.method6207(executor, (byte) 11);
			break;
		case 658:
			JS5FileWorker.method5816(executor, 2144210152);
			break;
		case 488:
			Class251.method4311(executor, -1761461567);
			break;
		case 78:
			Class447.method7462(executor, -1027798859);
			break;
		case 557:
			JS5CacheFile.method3361(executor, (byte) -122);
			break;
		case 682:
			Class475.method7928(executor, (byte) 34);
			break;
		case 307:
			Class507.method8724(executor, -1436290903);
			break;
		case 757:
			Class222.method3755(executor, (byte) 69);
			break;
		case 666:
			Class187.method3119(executor, (byte) 31);
			break;
		case 796:
			Class316.method5598(executor, -645812865);
			break;
		case 146:
			Class251.method4315(executor, -2008668778);
			break;
		case 730:
			Class16.method564(executor, (byte) 114);
			break;
		case 460:
			Class199.method3250(executor, -2138919485);
			break;
		case 242:
			Class28.method775(executor, -1498612955);
			break;
		case 653:
			Class517.method11128(executor, 459456376);
			break;
		case 727:
			Class251.method4312(executor, (byte) 76);
			break;
		case 205:
			Class10.method460(executor, -2132201205);
			break;
		case 740:
			JS5FileWorker.method5814(executor, 1360977559);
			break;
		case 68:
			Class233.method3941(executor, 2039402379);
			break;
		case 759:
			Class45.method928(executor, 955065537);
			break;
		case 322:
			WorldMapAreaDefs.method3740(executor, 2023679996);
			break;
		case 45:
			Class260.method4630(executor, 2082268722);
			break;
		case 663:
			Class96.method1603(executor, 543673057);
			break;
		case 431:
			Message.method7277(executor, (byte) 23);
			break;
		case 441:
			Class207.method3556(executor, -86803725);
			break;
		case 923:
			Class38.method856(executor, (byte) 8);
			break;
		case 641:
			IterableNodeMap.method7774(executor, -1275891056);
			break;
		case 309:
			IterableNodeMap.method7771(executor, 1936925515);
			break;
		case 706:
			Class105.method1802(executor, (byte) -19);
			break;
		case 233:
			Class282_Sub17_Sub6.method15437(executor, (short) -24038);
			break;
		case 520:
			Class101.method1775(executor, (byte) 2);
			break;
		case 848:
			Class483.method8156(executor, -302588228);
			break;
		case 778:
			Class219.method3714(executor, 630870713);
			break;
		case 737:
			Class46.method934(executor, -1679015333);
			break;
		case 760:
			InventoriesIndexLoader.method6738(executor, 1048816069);
			break;
		case 535:
			Class114.method1888(executor, (byte) -1);
			break;
		case 366:
			AttributeDefault.method7322(executor, 603410124);
			break;
		case 891:
			Class19.method585(executor, -600527643);
			break;
		case 889:
			Class320.method5736(executor, -2041206298);
			break;
		case 555:
			Class358.method6236(executor, (byte) 44);
			break;
		case 942:
			Class217.method3692(executor, 1791737608);
			break;
		case 830:
			Class236.method3986(executor, -837283633);
			break;
		case 378:
			Class362.method6281(executor, 1144689103);
			break;
		case 425:
			Class521_Sub1_Sub1_Sub5.method16100(executor, 486138707);
			break;
		case 571:
			Class96_Sub16.method14649(executor, (byte) 0);
			break;
		case 481:
			Class180.method3030(executor, -1607006115);
			break;
		case 110:
			Class533.method11405(executor, 2004569096);
			break;
		case 816:
			Class282_Sub50_Sub17.method15514(executor, -1523081403);
			break;
		case 73:
			Class199_Sub1.method13399(executor, 609107398);
			break;
		case 961:
			Class289.method5100(executor, -1446218393);
			break;
		case 793:
			Class296.method5299(executor, 1940133484);
			break;
		case 451:
			Class430.method7219(executor, 1468047587);
			break;
		case 949:
			Class246.method4202(executor, -1989471919);
			break;
		case 489:
			Class179.method3021(executor, 624071071);
			break;
		case 373:
			Class246.method4201(executor, 1292702055);
			break;
		case 521:
			Class291_Sub1.method13359(executor, -606792870);
			break;
		case 11:
			ItemDefaultsLoader.method7083(executor, 1766104988);
			break;
		case 606:
			Defaults7Loader.method8753(executor, (byte) -22);
			break;
		case 687:
			Class353.method6206(executor, -2118897868);
			break;
		case 626:
			Class191.method3168(executor, 1630461232);
			break;
		case 708:
			Class268.method4797(executor, 1966060446);
			break;
		case 544:
			Class204.method3370(executor, (byte) 12);
			break;
		case 275:
			Class451.method7522(executor, -80882377);
			break;
		case 876:
			Class362.method6279(executor, 1167212431);
			break;
		case 659:
			Class282_Sub4.method12118(executor, -1895011337);
			break;
		case 964:
			Class428.method7209(executor, -1248201672);
			break;
		case 55:
			Class454.method7551(executor, (short) 30);
			break;
		case 200:
			Class57.method1135(executor, -1504422807);
			break;
		case 428:
			Class535.method11473(executor, -77968139);
			break;
		case 253:
			Class282_Sub51.method13467(executor, 1986428818);
			break;
		case 616:
			Class122.method2108(executor, -492399173);
			break;
		case 786:
			Class75.method1349(executor, 1550916300);
			break;
		case 678:
			Class350_Sub2.method12573(executor, (short) 255);
			break;
		case 611:
			Language.method8298(executor, (byte) -1);
			break;
		case 124:
			Class388.method6687(executor, 841786428);
			break;
		case 699:
			Class516.method8870(executor, (byte) -25);
			break;
		case 657:
			InventoryDef.method15696(executor, 873457785);
			break;
		case 286:
			Class353.method6211(executor, -571474604);
			break;
		case 573:
			Class45.method926(executor, -1824187032);
			break;
		case 197:
			Class506.method8715(executor, 540209259);
			break;
		case 900:
			Class430.method7218(executor, -1065364389);
			break;
		case 314:
			Class149.method2567(executor, 1033294898);
			break;
		case 688:
			MapRegion.method4563(executor, (short) -23347);
			break;
		case 408:
			Class293.method5202(executor, -262118400);
			break;
		case 154:
			Class373.method6363(executor, 2047067207);
			break;
		case 9:
			Class256.method4417(executor, -2001433508);
			break;
		case 173:
			Class149.method2563(executor, (byte) -45);
			break;
		case 550:
			Class96_Sub13.method14640(executor, -386492747);
			break;
		case 638:
			Class247.method4252(executor, (byte) 51);
			break;
		case 670:
			Class293.method5204(executor, 170184033);
			break;
		case 70:
			Class323.method5775(executor, -2078698405);
			break;
		case 483:
			Class51.method1071(executor, -693579703);
			break;
		case 593:
			Class330.method5915(executor, (byte) -81);
			break;
		case 344:
			Class12.method484(executor, 1971382836);
			break;
		case 644:
			Class506.method8714(executor, (byte) -44);
			break;
		case 960:
			Class78.method1387(executor, (byte) -5);
			break;
		case 734:
			NPCDefinitions.method6908(executor, 102188294);
			break;
		case 346:
			Class227.method3829(executor, -123607634);
			break;
		case 888:
			Class172.method2914(executor, (byte) 18);
			break;
		case 279:
			NamedFileReference.method871(executor, 768852277);
			break;
		case 679:
			Class76.method1357(executor, (byte) 24);
			break;
		case 130:
			Class175.method2961(executor, 283782002);
			break;
		case 61:
			Class1.method254(executor, (byte) -5);
			break;
		case 207:
			Class2.method260(executor, (byte) 121);
			break;
		case 524:
			Class112.method1872(executor, -1325787266);
			break;
		case 325:
			Class251.method4310(executor, 464639686);
			break;
		case 484:
			Class3.method284(executor, -1236761109);
			break;
		case 975:
			Class165.method2856(executor, -1402584137);
			break;
		case 803:
			ReferenceTable.method5767(executor, -956710167);
			break;
		case 156:
			Class107.method1835(executor, (short) -1089);
			break;
		case 763:
			Class282_Sub29.method12425(executor, (byte) -2);
			break;
		case 598:
			Class329_Sub1.method12492(executor, (byte) 26);
			break;
		case 163:
			Class38.method855(executor, (byte) -9);
			break;
		case 403:
			Class280.method4973(executor, (byte) 58);
			break;
		case 808:
			Class282_Sub20_Sub25.method15392(executor, -2026931897);
			break;
		case 443:
			Class254.method4381(executor, (byte) -45);
			break;
		case 424:
			Class531.method11371(executor, 293420205);
			break;
		case 509:
			Class187.method3120(executor, (byte) -87);
			break;
		case 590:
			Class298.method5301(executor, -1937069113);
			break;
		case 872:
			Class498.method8327(executor, 2011004777);
			break;
		case 145:
			Class282_Sub1.method11612(executor, -182628811);
			break;
		case 729:
			Class356.method6226(executor, (byte) 0);
			break;
		case 879:
			Class476.method7932(executor, (byte) -42);
			break;
		case 648:
			Class488.method8211(executor, 1775735357);
			break;
		case 671:
			Class380.method6452(executor, -1250835479);
			break;
		case 847:
			Class455.method7561(executor, -1256360853);
			break;
		case 563:
			Class287.method5065(executor, 1306185943);
			break;
		case 600:
			Class225.method3791(executor, (byte) 37);
			break;
		case 183:
			Class263.method4773(executor, -2026809420);
			break;
		case 945:
			Class363.method6285(executor, 1345832973);
			break;
		case 95:
			Class184.method3067(executor, -1384830113);
			break;
		case 866:
			Class282_Sub20_Sub19.method15376(executor, 1350983532);
			break;
		case 575:
			Class521_Sub1.method13040(executor, (byte) 43);
			break;
		case 956:
			Class353.method6205(executor, (byte) 3);
			break;
		case 158:
			SoftCache.method3892(executor, 461356591);
			break;
		case 691:
			Class96_Sub5.method14244(executor, 2027041853);
			break;
		case 331:
			Class96_Sub22.method14679(executor, 1310735387);
			break;
		case 538:
			Class466.method7779(executor, -1113335579);
			break;
		case 904:
			Class359.method6242(executor, -1670225184);
			break;
		case 941:
			Class386.method6670(executor, 749111645);
			break;
		case 142:
			Class473.method7888(executor, -355473345);
			break;
		case 18:
			NamedFileReference.method870(executor, 1718249177);
			break;
		case 381:
			Class428.method7210(executor, -1645120486);
			break;
		case 861:
			Class302.method5362(executor, (byte) 18);
			break;
		case 516:
			Class161.method2823(executor, 243394020);
			break;
		case 212:
			IncomingPacket.method6374(executor, -1541456845);
			break;
		case 825:
			Class298.method5302(executor, (byte) 47);
			break;
		case 633:
			Class330.method5912(executor, (byte) 80);
			break;
		case 655:
			NodeIterator.method7699(executor, 954683755);
			break;
		case 965:
			Class62.method1259(executor, 1799228526);
			break;
		case 262:
			Class58.method1137(executor, 1990422976);
			break;
		case 414:
			Class357.method6231(executor, -1977048463);
			break;
		case 251:
			Class413.method6940(executor, -2081449969);
			break;
		case 292:
			Class506.method8717(executor, 439409567);
			break;
		case 186:
			Class403.method6802(executor, 2114493844);
			break;
		case 933:
			Class250.method4299(executor, 986104852);
			break;
		case 244:
			Class233.method3940(executor, 2095943536);
			break;
		case 465:
			Class282_Sub45.method13406(executor, -204800587);
			break;
		case 102:
			method2953(executor, (byte) -80);
			break;
		case 924:
			Class328.method5833(executor, (byte) -46);
			break;
		case 514:
			Class468_Sub6.method12660(executor, -1965111692);
			break;
		case 619:
			Class377.method6399(executor, (byte) -126);
			break;
		case 814:
			Class361.method6275(executor, (byte) -84);
			break;
		case 817:
			Class94.method1586(executor, 1772986490);
			break;
		case 692:
			Class489.method8220(executor, (byte) 0);
			break;
		case 981:
			Class225.method3790(executor, -174996314);
			break;
		case 100:
			Class500.method8344(executor, (byte) -19);
			break;
		case 379:
			Class96_Sub17.method14655(executor, (byte) -92);
			break;
		case 955:
			Class358.method6239(executor, 973144081);
			break;
		case 812:
			Class390.method6730(executor, 1558469536);
			break;
		case 916:
			Class206.method3546(executor, (byte) -128);
			break;
		case 299:
			Class51.method1067(executor, -1190866994);
			break;
		case 317:
			Class279.method4965(executor, 1413517764);
			break;
		case 629:
			Class191.method3164(executor, -1986400390);
			break;
		case 833:
			GraphicalRenderer.method8698(executor, -755706942);
			break;
		case 255:
			Class282_Sub11_Sub3.method15475(executor, -1674898010);
			break;
		case 259:
			Class288.method5082(executor, -199853817);
			break;
		case 673:
			LoadingStage.method6677(executor, -1272408202);
			break;
		case 360:
			Class75.method1355(executor, 1158012743);
			break;
		case 566:
			Defaults7Loader.method8749(executor, 34336);
			break;
		case 526:
			SharedConfigsType.method2093(executor, (byte) -50);
			break;
		case 560:
			Class79.method1391(executor, -1800964332);
			break;
		case 215:
			Class221.method3747(executor, 1723930007);
			break;
		case 75:
			Class28.method779(executor, (byte) 53);
			break;
		case 630:
			PlayerAppearance.method4033(executor, (byte) -57);
			break;
		case 280:
			Class388.method6691(executor, 614904861);
			break;
		case 332:
			Class9.method452(executor, (byte) 27);
			break;
		case 433:
			Class339.method6042(executor, (byte) -76);
			break;
		case 895:
			Class246.method4200(executor, (byte) -60);
			break;
		case 855:
			Class207.method3555(executor, 119173939);
			break;
		case 136:
			Class329.method5904(executor, (short) 588);
			break;
		case 726:
			Class341.method6073(executor, (byte) -2);
			break;
		case 13:
			Class185.method3080(executor, (byte) -49);
			break;
		case 636:
			Class243.method4178(executor, (byte) 42);
			break;
		case 370:
			Class31.method811(executor, -1685060774);
			break;
		case 999:
			Class273.method4865(executor, 290465422);
			break;
		case 254:
			Class396.method6773(executor, 563877281);
			break;
		case 834:
			Class93.method1570(executor, (byte) 5);
			break;
		case 561:
			Class208.method3562(executor, (byte) -93);
			break;
		case 149:
			Class109.method1853(executor, -2012344999);
			break;
		case 96:
			Class348.method6174(executor, -1847995992);
			break;
		case 358:
			Class209.method3599(executor, -933228880);
			break;
		case 897:
			Class182.method3043(executor, (byte) -6);
			break;
		case 926:
			Class209.method3596(executor, -327506035);
			break;
		case 623:
			Class168.method2868(executor, (byte) 3);
			break;
		case 927:
			Class468_Sub9.method12689(executor, -1236806941);
			break;
		case 604:
			Class52_Sub1.method14492(executor, -123437245);
			break;
		case 572:
			Class230.method3909(executor, (byte) 124);
			break;
		case 696:
			Class198.method3228(executor, (byte) 49);
			break;
		case 143:
			Class534.method11438(executor, (byte) -27);
			break;
		case 883:
			Class208.method3561(executor, 322369286);
			break;
		case 685:
			Class468_Sub20.method12803(executor, 141891001);
			break;
		case 396:
			Class510.method8742(executor, 1673525190);
			break;
		case 345:
			Class125.method2169(executor, (byte) 39);
			break;
		case 500:
			Class275_Sub2.method12504(executor, 1755736793);
			break;
		case 680:
			Class276.method4901(executor, (byte) 1);
			break;
		case 182:
			Class122.method2107(executor, 65280);
			break;
		case 359:
			Class339.method6044(executor, 1599084401);
			break;
		case 270:
			Class210.method3611(executor, -785507298);
			break;
		case 869:
			Class347.method6169(executor, (byte) -108);
			break;
		case 985:
			Class282_Sub11_Sub4.method15616(executor, -2127027018);
			break;
		case 703:
			Class523.method11218(executor, (byte) 117);
			break;
		case 16:
			Class489.method8219(executor, 454655223);
			break;
		case 755:
			Class290.method5123(executor, (byte) -50);
			break;
		case 377:
			Class299.method5312(executor, -972993647);
			break;
		case 758:
			Class282_Sub46.method13408(executor, (byte) 7);
			break;
		case 773:
			Class415.method6998(executor, (byte) 25);
			break;
		case 711:
			Class51.method1070(executor, (byte) 0);
			break;
		case 983:
			Class4.method292(executor, 1216542126);
			break;
		case 582:
			SoftCache.method3893(executor, -1634634570);
			break;
		case 813:
			Class96.method1606(executor, -1612733757);
			break;
		case 979:
			Class450.method7502(executor, (byte) -108);
			break;
		case 930:
			Class179.method3017(executor, -782665428);
			break;
		case 748:
			Class521_Sub1.method13041(executor, 1234006962);
			break;
		case 417:
			Class468_Sub13.method12718(executor, -649992375);
			break;
		case 862:
			Class16.method563(executor, -1644019649);
			break;
		case 105:
			IncomingPacket.method6372(executor, 506981131);
			break;
		case 297:
			Class484.method8199(executor, (byte) -78);
			break;
		case 853:
			OutgoingPacket.method6440(executor, -320968192);
			break;
		case 76:
			Class529.method11338(executor, 1916576796);
			break;
		case 765:
			Class235.method3966(executor, 65536);
			break;
		case 284:
			JS5Manager.method5489(executor, -1739453306);
			break;
		case 355:
			Class492.method8263(executor, -1780236117);
			break;
		case 44:
			Class123.method2153(executor, -2146932291);
			break;
		case 249:
			Class198.method3229(executor, -289314013);
			break;
		case 568:
			PlayerAppearance.method4035(executor, -187921647);
			break;
		case 581:
			Class169.method2873(executor, -1640835133);
			break;
		case 295:
			Class223.method3769(executor, (byte) -60);
			break;
		case 177:
			Class81.method1452(executor, -1429624703);
			break;
		case 637:
			Class282_Sub20_Sub30.method15399(executor, 193842794);
			break;
		case 789:
			Class358.method6237(executor, -1561197255);
			break;
		case 972:
			TilestreamPacket.method6291(executor, (byte) 1);
			break;
		case 537:
			Class450.method7500(executor, 1148169573);
			break;
		case 108:
			Class514.method8839(executor, -1473704469);
			break;
		case 624:
			Class184.method3065(executor, 1574707317);
			break;
		case 735:
			Class271.method4829(executor, (short) 255);
			break;
		case 780:
			MapRegion.method4557(executor, (byte) 34);
			break;
		case 32:
			Class507.method8726(executor, (short) -24027);
			break;
		case 159:
			Class282_Sub4.method12116(executor, (byte) 18);
			break;
		case 225:
			Class282_Sub20_Sub15.method15306(executor, -892589803);
			break;
		case 494:
			Class517.method11125(executor, -217266584);
			break;
		case 570:
			Class243.method4177(executor, (byte) -36);
			break;
		case 766:
			Class193.method3170(executor, -1825853988);
			break;
		case 376:
			ReferenceTable.method5766(executor, 2075151438);
			break;
		case 746:
			Class224.method3779(executor, -1207503470);
			break;
		case 387:
			Class438.method7334(executor, -1562939023);
			break;
		case 540:
			Class329.method5901(executor, 223655224);
			break;
		case 769:
			Class282_Sub20.method12352(executor, (byte) -73);
			break;
		case 620:
			Class268.method4802(executor, -931710214);
			break;
		case 745:
			Class106.method1815(executor, 155579826);
			break;
		case 559:
			Class96_Sub13.method14639(executor, (byte) 1);
			break;
		case 123:
			Class61.method1254(executor, 649938355);
			break;
		case 815:
			Class331.method5922(executor, -503207112);
			break;
		case 384:
			Class398.method6781(executor, 1991137495);
			break;
		case 435:
			Class418.method7021(executor, 1923898617);
			break;
		case 434:
			Class3.method283(executor, -869673745);
			break;
		case 761:
			Class110.method1862(executor, -119267827);
			break;
		case 453:
			PlayerAppearance.method4031(executor, (short) 28947);
			break;
		case 452:
			Class225_Sub2.method12881(executor, -1317003956);
			break;
		case 823:
			MeshModifier.method7043(executor, 1878547484);
			break;
		case 510:
			Class289.method5098(executor, 1396509563);
			break;
		case 83:
			Class152.method2605(executor, 1391596567);
			break;
		case 250:
			Class282_Sub33.method12583(executor, 1345568342);
			break;
		case 388:
			Class285.method5024(executor, 1609201901);
			break;
		case 615:
			Class273_Sub2.method12499(executor, -1091484518);
			break;
		case 775:
			Class239.method4091(executor, -1704916630);
			break;
		case 178:
			Class534_Sub1.method12816(executor, 1708113799);
			break;
		case 462:
			Class282_Sub15_Sub1.method14835(executor, (byte) 86);
			break;
		case 119:
			Class15.method545(executor, (byte) -113);
			break;
		case 448:
			Node.method5002(executor, 1340326579);
			break;
		case 329:
			Class369.method6315(executor, (byte) -7);
			break;
		case 193:
			Class290.method5122(executor, (short) 25029);
			break;
		case 333:
			Class153.method2620(executor, 2023133498);
			break;
		case 118:
			Class336.method6005(executor, (byte) 5);
			break;
		case 272:
			Class43.method894(executor, -515879800);
			break;
		case 93:
			Class217_Sub1.method13057(executor, -1675313900);
			break;
		case 326:
			Class243.method4173(executor, -83055370);
			break;
		case 947:
			GraphicalRenderer.method8694(executor, -1324558334);
			break;
		case 341:
			Class363.method6282(executor, 1916443315);
			break;
		case 436:
			Class93.method1571(executor, (short) 13253);
			break;
		case 138:
			Class292.method5197(executor, (byte) -24);
			break;
		case 771:
			JS5Manager.method5490(executor, (byte) 61);
			break;
		case 894:
			Class114.method1889(executor, 1839110462);
			break;
		case 534:
			Class282_Sub48.method13446(executor, 814107150);
			break;
		case 1:
			Language.method8285(executor, -1206071745);
			break;
		case 984:
			Class115.method1951(executor, (byte) 41);
			break;
		case 458:
			Class176.method2978(executor, 2109665442);
			break;
		case 227:
			Class234.method3950(executor, -1574810438);
			break;
		case 234:
			Class110.method1861(executor, 1806726141);
			break;
		case 843:
			GraphicalRenderer.method8701(executor, (byte) 24);
			break;
		case 389:
			Class304.method5408(executor, -2025663839);
			break;
		case 282:
			Class2.method261(executor, (byte) 0);
			break;
		case 65:
			Class233.method3938(executor, -2038379922);
			break;
		case 776:
			Class310.method5494(executor, 1861359636);
			break;
		case 117:
			Class275.method4889(executor, 141891001);
			break;
		case 528:
			Class373.method6364(executor, -685758415);
			break;
		case 959:
			Class483.method8153(executor, 440050047);
			break;
		case 267:
			Class445.method7428(executor, (byte) 54);
			break;
		case 103:
			Class468_Sub6.method12659(executor, (byte) -99);
			break;
		case 468:
			Class446.method7434(executor, (short) 13476);
			break;
		case 308:
			Class6.method299(executor, -611712298);
			break;
		case 191:
			Class339.method6043(executor, -2052326762);
			break;
		case 986:
			Class271.method4830(executor, 1801797508);
			break;
		case 296:
			Class463.method7726(executor, -1995630500);
			break;
		case 935:
			DefaultsFile.method11222(executor, 1532350722);
			break;
		case 273:
			Class388.method6695(executor, 16711935);
			break;
		case 887:
			Class106.method1816(executor, (byte) 125);
			break;
		case 169:
			Class354.method6212(executor, (byte) 79);
			break;
		case 779:
			Class116.method1968(executor, (byte) -11);
			break;
		case 54:
			SoftCache.method3894(executor, -1300899221);
			break;
		case 574:
			Class233.method3939(executor, -1748085723);
			break;
		case 393:
			Class516.method8869(executor, -1149582252);
			break;
		case 369:
			Class321.method5756(executor, (byte) 99);
			break;
		case 294:
			Class282_Sub20_Sub22.method15387(executor, -1352958939);
			break;
		case 896:
			Class531.method11373(executor, -2109366002);
			break;
		case 172:
			Class149.method2564(executor, (byte) 61);
			break;
		case 62:
			Class247.method4249(executor, -181903823);
			break;
		case 401:
			Class165.method2855(executor, (byte) 35);
			break;
		case 171:
			Class204.method3368(executor, -66320892);
			break;
		case 702:
			Class402.method6800(executor, -1914347232);
			break;
		case 175:
			Class210.method3613(executor, 635936728);
			break;
		case 717:
			Class252.method4323(executor, (byte) 1);
			break;
		case 238:
			Class118.method2072(executor, 404608407);
			break;
		case 632:
			Class197.method3200(executor, 931421496);
			break;
		case 963:
			Class295.method5290(executor, (byte) -29);
			break;
		case 21:
			Class298.method5300(executor, -1241667260);
			break;
		case 467:
			Class92.method1562(executor, -1764030423);
			break;
		case 846:
			Class222.method3753(executor, 1873489366);
			break;
		case 645:
			Class262.method4652(executor, -1281775789);
			break;
		case 260:
			Class350_Sub2.method12572(executor, 693718550);
			break;
		case 167:
			Class285.method5029(executor, (short) 658);
			break;
		case 909:
			Language.method8296(executor, (byte) 25);
			break;
		case 464:
			Class105.method1803(executor, -1693230634);
			break;
		case 603:
			Class172.method2916(executor, -92439065);
			break;
		case 490:
			Node.method5004(executor, -177030687);
			break;
		case 476:
			Class534_Sub2.method12846(executor, -921380561);
			break;
		case 491:
			Class468_Sub24.method12925(executor, 1504818470);
			break;
		case 111:
			Class260.method4629(executor, 536909451);
			break;
		case 41:
			Class233.method3937(executor, (byte) 116);
			break;
		case 162:
			Class351.method6194(executor, -523919691);
			break;
		case 161:
			Class77.method1370(executor, -373798838);
			break;
		case 744:
			Class517.method11126(executor, (byte) 52);
			break;
		case 921:
			Class275_Sub6.method12596(executor, -1202444535);
			break;
		case 81:
			Class85.method1467(executor, 65280);
			break;
		case 362:
			Class193.method3172(executor, 841662052);
			break;
		case 37:
			ObjectDefinitions.method8019(executor, (short) 1088);
			break;
		case 707:
			Class515.method8859(executor, (byte) -59);
			break;
		case 50:
			Class344.method6121(executor, (byte) -81);
			break;
		case 493:
			Class82.method1456(executor, 1656391964);
			break;
		case 587:
			Class277.method4905(executor, (byte) 24);
			break;
		case 29:
			Class275_Sub4.method12586(executor, (short) 24471);
			break;
		case 189:
			LoadingStage.method6685(executor, 1119021125);
			break;
		case 203:
			Defaults7Loader.method8750(executor, 1840991775);
			break;
		case 237:
			Class216.method3678(executor, 1839222621);
			break;
		case 874:
			Class106.method1817(executor, (byte) -21);
			break;
		case 951:
			Class263.method4774(executor, 1570940877);
			break;
		case 831:
			Class386.method6674(executor, -1793200224);
			break;
		case 5:
			Class11.method471(executor, (byte) -72);
			break;
		case 908:
			Class165.method2854(executor, (byte) 46);
			break;
		case 298:
			Class444.method7427(executor, 1378397507);
			break;
		case 46:
			Class122.method2112(executor, -743598106);
			break;
		case 243:
			Class225.method3792(executor, (byte) 0);
			break;
		case 681:
			Class282_Sub50_Sub17.method15512(executor, 265164609);
			break;
		case 92:
			Class242.method4161(executor, 1833750204);
			break;
		case 525:
			Class249.method4283(executor, (short) -3255);
			break;
		case 353:
			ItemDefinitions.method7143(executor, 990784531);
			break;
		case 258:
			Class443.method7420(executor, -1275463203);
			break;
		case 667:
			Class282_Sub15_Sub1.method14833(executor, -320513089);
			break;
		case 790:
			Class345.method6141(executor, -2038145040);
			break;
		case 271:
			Class45.method927(executor, 141891001);
			break;
		case 783:
			Class533.method11403(executor, (short) 256);
			break;
		case 715:
			Class221.method3752(executor, (byte) 14);
			break;
		case 140:
			Class344.method6116(executor, (byte) 41);
			break;
		case 857:
			Class273.method4863(executor, -469908233);
			break;
		case 231:
			Class161.method2824(executor, (byte) -10);
			break;
		case 39:
			Class163.method2841(executor, 608785741);
			break;
		case 22:
			Class446.method7445(executor, -1005058189);
			break;
		case 597:
			Class11.method467(executor, (byte) -58);
			break;
		case 811:
			Class96_Sub11.method14606(executor, -573390475);
			break;
		case 383:
			Class233.method3942(executor, -121061115);
			break;
		case 496:
			Class38.method858(executor, 1588240839);
			break;
		case 209:
			Class476.method7933(executor, (byte) 127);
			break;
		case 724:
			Class356.method6224(executor, -959578307);
			break;
		case 991:
			Class12.method485(executor, (byte) 106);
			break;
		case 290:
			Class237.method3988(executor, (byte) 40);
			break;
		case 764:
			Class175.method2965(executor, (byte) 35);
			break;
		case 33:
			Class93.method1572(executor, (byte) 40);
			break;
		case 104:
			Class282_Sub50_Sub12.method15075(executor, -1030055634);
			break;
		case 578:
			Class357.method6232(executor, 164996039);
			break;
		case 427:
			WorldMapAreaDefs.method3743(executor, -1869335657);
			break;
		case 576:
			Class282_Sub15_Sub1.method14839(executor, (byte) 0);
			break;
		case 577:
			PacketsDecoder.method14434(executor, -543185727);
			break;
		case 57:
			Class104.method1800(executor, 378924675);
			break;
		case 553:
			Class221.method3750(executor, (byte) -50);
			break;
		case 639:
			MapRegion.method4558(executor, -23177306);
			break;
		case 181:
			Class109.method1857(executor, -13769492);
			break;
		case 400:
			Class506.method8718(executor, (byte) 16);
			break;
		case 532:
			Class531.method11372(executor, -1660682202);
			break;
		case 523:
			Class401.method6796(executor, -2050698245);
			break;
		case 613:
			DefaultsFile.method11224(executor, -2037498814);
			break;
		case 43:
			Class320.method5735(executor, (byte) 1);
			break;
		case 421:
			Class346.method6152(executor, 772291189);
			break;
		case 918:
			Class207.method3554(executor, 1945989061);
			break;
		case 293:
			Class276.method4902(executor, -466152026);
			break;
		case 654:
			Class336.method6006(executor, -2023043481);
			break;
		case 693:
			Class316.method5597(executor, -1887560863);
			break;
		case 266:
			Class15.method548(executor, -467257679);
			break;
		case 91:
			Class329.method5902(executor, -1050206980);
			break;
		case 84:
			Class457.method7668(executor, 488455804);
			break;
		case 147:
			NodeIterator.method7700(executor, -1958961558);
			break;
		case 977:
			Class234.method3951(executor, -217803069);
			break;
		case 406:
			Class323.method5774(executor, -665815463);
			break;
		case 418:
			Class276.method4900(executor, (byte) -30);
			break;
		case 829:
			Class96_Sub8.method14578(executor, 153442126);
			break;
		case 151:
			Class282_Sub4.method12115(executor, 140930361);
			break;
		case 925:
			Class28.method773(executor, -1755111389);
			break;
		case 892:
			Class99.method1631(executor, (byte) 1);
			break;
		case 826:
			Class393.method6750(executor, -753498818);
			break;
		case 505:
			Class20.method741(executor, (short) 5705);
			break;
		case 542:
			JS5CacheFile.method3356(executor, (byte) -8);
			break;
		case 131:
			Class278.method4960(executor, (short) 10243);
			break;
		case 522:
			Class109.method1855(executor, -1431357070);
			break;
		case 792:
			Class286.method5046(executor, (byte) -91);
			break;
		case 585:
			JS5GrabWorker.method12560(executor, (short) 722);
			break;
		case 230:
			Defaults7Loader.method8758(executor, 1578634410);
			break;
		case 849:
			Class286.method5047(executor, -1283869997);
			break;
		case 612:
			Class271.method4825(executor, 771324207);
			break;
		case 261:
			Class390.method6729(executor, 177606197);
			break;
		case 920:
			Class285.method5027(executor, -1958989390);
			break;
		case 184:
			Class510.method8743(executor, 1917535707);
			break;
		case 222:
			Class321.method5758(executor, (byte) -45);
			break;
		case 7:
			Class250.method4295(executor, -437336469);
			break;
		case 608:
			Class104.method1799(executor, (byte) -9);
			break;
		case 954:
			Class84.method1462(executor, -256792844);
			break;
		case 12:
			Class489.method8216(executor, -1457229722);
			break;
		case 591:
			Class279.method4970(executor, 1203434505);
			break;
		case 860:
			Class169.method2872(executor, 781348598);
			break;
		case 454:
			Class345.method6139(executor, -1211259595);
			break;
		case 752:
			Class282_Sub17_Sub11.method15449(executor, 33985);
			break;
		case 873:
			Class113.method1882(executor, (short) -12654);
			break;
		case 240:
			Class346.method6153(executor, 632990585);
			break;
		case 714:
			Class84.method1463(executor, 1667043503);
			break;
		case 795:
			Class366.method6304(executor, -344266463);
			break;
		case 127:
			NPCIndexLoader.method6851(executor, -1384792690);
			break;
		case 49:
			Class306.method5456(executor, -1384937123);
			break;
		case 774:
			Class87.method1492(executor, 2038026780);
			break;
		case 835:
			Class540.method11592(executor, (byte) 7);
			break;
		case 224:
			Class51.method1069(executor, 1593699029);
			break;
		case 497:
			Class180.method3031(executor, -1910597016);
			break;
		case 501:
			Class256.method4413(executor, -849214514);
			break;
		case 987:
			Class498.method8328(executor, 1776875985);
			break;
		case 842:
			Class7.method356(executor, -1219033412);
			break;
		case 302:
			Class207.method3553(executor, (byte) -49);
			break;
		case 339:
			Class227.method3830(executor, (byte) 24);
			break;
		case 164:
			Class480.method8045(executor, (byte) 95);
			break;
		case 277:
			Class506.method8719(executor, (byte) 105);
			break;
		case 115:
			Class104.method1801(executor, 2040390674);
			break;
		case 407:
			Class19.method586(executor, (byte) -95);
			break;
		case 412:
			Class468_Sub13.method12719(executor, (byte) -37);
			break;
		case 19:
			Class331.method5925(executor, 595474183);
			break;
		case 865:
			Class75.method1352(executor, 205530966);
			break;
		case 586:
			Class295.method5292(executor, (byte) 85);
			break;
		case 52:
			Class413.method6941(executor, -910146013);
			break;
		case 474:
			Class217.method3691(executor, 1650741585);
			break;
		case 903:
			Class451.method7520(executor, -587084187);
			break;
		case 492:
			Class221.method3749(executor, -1613504232);
			break;
		case 99:
			Class59.method1162(executor, -1999288658);
			break;
		case 992:
			Class377.method6397(executor, 1248637998);
			break;
		case 558:
			Class296.method5298(executor, -1985152108);
			break;
		case 80:
			Class10.method456(executor, (byte) 79);
			break;
		case 543:
			Class345.method6142(executor, 610011504);
			break;
		case 192:
			Class521_Sub1_Sub4_Sub2.method16089(executor, 495509474);
			break;
		case 74:
			Class175.method2963(executor, 1724737651);
			break;
		case 697:
			Class306.method5454(executor, (byte) -17);
			break;
		case 503:
			Class386.method6669(executor, -1094136580);
			break;
		case 475:
			Class232.method3919(executor, -1876179563);
			break;
		case 867:
			Class16.method565(executor, -1891765425);
			break;
		case 38:
			Class4.method289(executor, (byte) -51);
			break;
		case 614:
			SharedConfigsType.method2092(executor, (byte) 0);
			break;
		case 101:
			Class169.method2870(executor, -1579310255);
			break;
		case 27:
			Class226.method3802(executor, 2060002089);
			break;
		case 929:
			Class51.method1073(executor, (byte) -114);
			break;
		case 733:
			Class506.method8716(executor, (byte) -21);
			break;
		case 382:
			Class277.method4904(executor, (byte) -105);
			break;
		case 71:
			Class149.method2568(executor, (byte) 8);
			break;
		case 718:
			Class180.method3033(executor, (byte) -31);
			break;
		case 877:
			Class86.method1479(executor, 1942118537);
			break;
		case 365:
			Class182.method3038(executor, 972314211);
			break;
		case 48:
			Class97.method1613(executor, -1839239802);
			break;
		case 190:
			Class447.method7463(executor, -636710441);
			break;
		case 723:
			InputStream_Sub1.method12723(executor, 530387581);
			break;
		case 60:
			Class96_Sub6.method14503(executor, -1666430419);
			break;
		case 375:
			Class339.method6046(executor, 1974414640);
			break;
		case 588:
			Class116.method1967(executor, 1449768589);
			break;
		case 287:
			Class311.method5511(executor, -1504750167);
			break;
		case 871:
			Class243.method4181(executor, (byte) -39);
			break;
		case 303:
			Class182.method3039(executor, (byte) 1);
			break;
		case 517:
			Class30.method798(executor, 787475908);
			break;
		case 51:
			Index.method5695(executor, (byte) 105);
			break;
		case 97:
			Class530.method11350(executor, -1280205893);
			break;
		case 368:
			CS2Executor.method11252(executor, 608961500);
			break;
		case 410:
			Class223.method3768(executor, 36575498);
			break;
		case 498:
			Class293.method5205(executor, 1650871983);
			break;
		case 361:
			Class296.method5297(executor, (byte) 125);
			break;
		case 890:
			Class378.method6437(executor, 214874993);
			break;
		case 129:
			Class282_Sub20_Sub18.method15371(executor, 557125833);
			break;
		case 901:
			Class282_Sub15_Sub1.method14836(executor, (byte) -91);
			break;
		case 478:
			Class118.method2071(executor, -671434661);
			break;
		case 196:
			Class301.method5332(executor, (byte) 1);
			break;
		case 66:
			Class366.method6305(executor, 1749125215);
			break;
		case 768:
			Class514.method8843(executor, (byte) -125);
			break;
		case 187:
			Defaults8Loader.method11154(executor, -530312338);
			break;
		case 549:
			Message.method7274(executor, -457875811);
			break;
		case 327:
			Class226.method3803(executor, (short) -8258);
			break;
		case 809:
			Class151.method2595(executor, 1250181079);
			break;
		case 640:
			Class281.method4989(executor, -1687858375);
			break;
		case 787:
			Class191.method3163(executor, 486431590);
			break;
		case 821:
			Class93.method1574(executor, (byte) -85);
			break;
		case 881:
			Class101.method1777(executor, 20145833);
			break;
		case 402:
			Class232.method3918(executor, (byte) 41);
			break;
		case 229:
			Class391.method6734(executor, 785557682);
			break;
		case 152:
			MapRegion.method4556(executor, (byte) -116);
			break;
		case 989:
			Class345.method6138(executor, -2054191113);
			break;
		case 420:
			Class18.method572(executor, 1914285965);
			break;
		case 539:
			Class346.method6149(executor, (byte) 0);
			break;
		case 819:
			ObjectDefinitions.method8021(executor, (short) 4096);
			break;
		case 518:
			Class278.method4961(executor, -1936963236);
			break;
		case 87:
			GraphicalRenderer.method8700(executor, (byte) -25);
			break;
		case 536:
			Node.method5003(executor, (byte) 0);
			break;
		case 948:
			Class149_Sub4.method14660(executor, -1269801212);
			break;
		case 137:
			Class483.method8154(executor, 587626901);
			break;
		case 144:
			Class521_Sub1_Sub3_Sub1.method16079(executor, (short) 17688);
			break;
		case 485:
			Class282_Sub20_Sub23.method15389(executor, (byte) 15);
			break;
		case 905:
			Class533.method11406(executor, 595456640);
			break;
		case 85:
			Class198.method3232(executor, -1033910256);
			break;
		case 397:
			Class96_Sub2.method13756(executor, (short) 23541);
			break;
		case 530:
			Class337.method6016(executor, 1922586110);
			break;
		case 762:
			Class292.method5199(executor, (byte) 65);
			break;
		case 607:
			Class100.method1643(executor, (short) 255);
			break;
		case 851:
			Class328.method5831(executor, 1448188332);
			break;
		case 236:
			Class532_Sub2.method12859(executor, (byte) 8);
			break;
		case 997:
			Class456.method7643(executor, (byte) -110);
			break;
		case 878:
			Class369.method6318(executor, 1973091635);
			break;
		case 719:
			Class216.method3676(executor, (byte) -114);
			break;
		case 10:
			Class31.method814(executor, -97676583);
			break;
		case 413:
			JS5Manager.method5488(executor, 2089687639);
			break;
		case 1001:
			Class41_Sub1_Sub2.method15551(executor, -694571839);
			break;
		case 728:
			Class89.method1498(executor, -1945170999);
			break;
		case 211:
			NodeCollection.method8147(executor, 875978174);
			break;
		case 527:
			Class428.method7208(executor, 1696005112);
			break;
		case 753:
			Class496.method8311(executor, 1940422489);
			break;
		case 206:
			Class6.method305(executor, 1935981604);
			break;
		case 777:
			Class15.method546(executor, 1172469523);
			break;
		case 438:
			Defaults7Loader.method8757(executor, -842877301);
			break;
		case 89:
			Class363.method6284(executor, -1108257435);
			break;
		case 208:
			Class241.method4148(executor, 769397160);
			break;
		case 486:
			Class394.method6762(executor, -1493190257);
			break;
		case 533:
			Class390.method6732(executor, (byte) 51);
			break;
		case 596:
			ReferenceTable.method5769(executor, (byte) 9);
			break;
		case 342:
			Class282_Sub1.method11613(executor, 723102941);
			break;
		case 512:
			Class273.method4864(executor, 1067371800);
			break;
		case 69:
			Class438.method7332(executor, (byte) 10);
			break;
		case 35:
			Class207.method3557(executor, (byte) 1);
			break;
		case 656:
			WorldMapAreaDefs.method3739(executor, -1137290569);
			break;
		case 133:
			Class363.method6283(executor, -1247121939);
			break;
		case 411:
			Class60.method1171(executor, (byte) 17);
			break;
		case 912:
			Defaults6Loader.method11247(executor, -1522658074);
			break;
		case 128:
			Class182.method3042(executor, 1169201301);
			break;
		case 971:
			Class320.method5734(executor, 210495212);
			break;
		case 668:
			Class60.method1167(executor, -1900438526);
			break;
		case 799:
			Class204.method3364(executor, 1673910816);
			break;
		case 824:
			Class537.method11492(executor, -800009751);
			break;
		case 367:
			Class282_Sub20_Sub22.method15385(executor, (short) -7872);
			break;
		case 1005:
			Class94.method1590(executor, 457142236);
			break;
		case 660:
			Class209_Sub1.method12915(executor, 1913633361);
			break;
		case 784:
			Class52_Sub3.method14520(executor, -597471512);
			break;
		case 609:
			Class89.method1500(executor, 2107931431);
			break;
		case 868:
			Class98.method1627(executor, -1274376736);
			break;
		case 1002:
			LoadingStage.method6680(executor, -1814887621);
			break;
		case 179:
			Class243.method4175(executor, (short) 14459);
			break;
		case 627:
			Class346.method6150(executor, (short) 245);
			break;
		case 689:
			ObjectDefinitions.method8018(executor, 1439142071);
			break;
		case 852:
			Class202.method3344(executor, 262144);
			break;
		case 754:
			Class239.method4089(executor, 431252288);
			break;
		case 338:
			Class225_Sub5.method13044(executor, -1857713701);
			break;
		case 112:
			Class155.method2638(executor, (byte) 101);
			break;
		case 662:
			Class328.method5829(executor, 306057132);
			break;
		case 807:
			Class377.method6395(executor, (short) 9728);
			break;
		case 936:
			Class274.method4882(executor, -2137935616);
			break;
		case 994:
			Class470.method7826(executor, (byte) 1);
			break;
		case 252:
			SharedConfigsType.method2096(executor, (byte) 1);
			break;
		case 350:
			Class279.method4968(executor, 2029357327);
			break;
		case 395:
			Class301.method5335(executor, (byte) 3);
			break;
		case 915:
			Class525.method11244(executor, -783443053);
			break;
		case 125:
			Class111.method1864(executor, -2034294635);
			break;
		case 885:
			Class362.method6280(executor, -190782595);
			break;
		case 168:
			Class188.method3138(executor, 1362823245);
			break;
		case 502:
			Class31.method815(executor, (short) 12130);
			break;
		case 98:
			Class487.method8208(executor, (byte) -50);
			break;
		case 508:
			Class106.method1813(executor, (byte) 86);
			break;
		case 218:
			Class185.method3079(executor, -171652606);
			break;
		case 772:
			Class446.method7444(executor, 1445428658);
			break;
		case 828:
			Class274.method4881(executor, 1833062191);
			break;
		case 47:
			Class282_Sub17_Sub3.method15404(executor, 321795442);
			break;
		case 429:
			Class427.method7187(executor, 333025518);
			break;
		case 63:
			Class152.method2597(executor, (byte) 1);
			break;
		case 278:
			Class354.method6213(executor, -950758985);
			break;
		case 513:
			Class353.method6210(executor, 682970055);
			break;
		case 515:
			Class96_Sub10_Sub1.method15553(true, executor, -28803240);
			break;
		case 204:
			Class282_Sub53.method13491(executor, -69545373);
			break;
		case 856:
			Class251.method4314(executor, -2138926072);
			break;
		case 565:
			Class19.method584(executor, (byte) -18);
			break;
		case 625:
			Class477.method7961(executor, -1647619870);
			break;
		case 256:
			Class244.method4194(executor, -823255003);
			break;
		case 304:
			Class532_Sub1.method12841(executor, -1297821718);
			break;
		case 274:
			Class299.method5314(executor, (byte) 0);
			break;
		case 15:
			Class455.method7556(executor, 1337684220);
			break;
		case 36:
			Class249.method4277(executor, (byte) -127);
			break;
		case 646:
			Class75.method1350(executor, -817080343);
			break;
		case 210:
			Class282_Sub17_Sub1.method15403(executor, -106244134);
			break;
		case 922:
			Class232.method3921(executor, 221883935);
			break;
		case 690:
			Class510.method8741(executor, -1830533687);
			break;
		case 356:
			Class282_Sub31.method12535(executor, 325864145);
			break;
		case 567:
			Class5.method296(executor, 367897202);
			break;
		case 579:
			Class388.method6688(executor, (byte) 63);
			break;
		case 562:
			Class531.method11370(executor, 55275098);
			break;
		case 906:
			Class230.method3911(executor, -2014304254);
			break;
		case 223:
			Class268.method4801(executor, -1254700923);
			break;
		case 832:
			Class57.method1134(executor, (byte) 0);
			break;
		case 804:
			Class446.method7448(executor, (byte) 6);
			break;
		case 321:
			Class316.method5595(executor, -130867028);
			break;
		case 426:
			Class202.method3340(executor, -1621526005);
			break;
		case 442:
			Class219.method3713(executor, -2105172211);
			break;
		case 720:
			Class357.method6230(executor, 459118110);
			break;
		case 94:
			Class282_Sub13.method12215(executor, -1735501688);
			break;
		case 880:
			Class98.method1625(executor, 1911957981);
			break;
		case 30:
			Class148.method2549(executor, -1130456570);
			break;
		case 721:
			Class331.method5926(executor, 385320656);
			break;
		case 28:
			Class476.method7929(executor, -2057044148);
			break;
		case 64:
			Class339.method6040(executor, (byte) 14);
			break;
		case 938:
			Class20.method743(executor, (byte) 59);
			break;
		case 946:
			Class20.method742(executor, -1627687853);
			break;
		case 531:
			Class96_Sub3.method13785(executor, 557904365);
			break;
		case 875:
			Class96_Sub20.method14669(executor, -1957810843);
			break;
		case 457:
			Class279.method4971(executor, 1562222534);
			break;
		case 166:
			Class121.method2102(executor, (short) 255);
			break;
		case 850:
			Class224.method3781(executor, (byte) 96);
			break;
		case 194:
			Class243.method4174(executor, -1364305642);
			break;
		case 14:
			Login.method5016(executor, -1796150682);
			break;
		case 882:
			Class197.method3201(executor, -1383408514);
			break;
		case 363:
			Class41_Sub1_Sub1.method15523(executor, 1929155662);
			break;
		case 246:
			Class96_Sub10_Sub1.method15553(false, executor, -200336846);
			break;
		case 844:
			Class206.method3547(executor, -828684786);
			break;
		case 649:
			Class509.method8738(executor, 42229655);
			break;
		case 405:
			Message.method7276(executor, (byte) 0);
			break;
		case 56:
			ReferenceTable.method5764(executor, (short) -4973);
			break;
		case 228:
			Class150.method2584(executor, 1465832902);
			break;
		case 455:
			Class276.method4899(executor, -1889023236);
			break;
		case 974:
			Class121.method2103(executor, (byte) 74);
			break;
		case 245:
			Class107.method1836(executor, (byte) 0);
			break;
		case 899:
			Class272.method4838(executor, (short) -11829);
			break;
		case 710:
			Class241.method4146(executor, -703340086);
			break;
		case 683:
			Node.method5000(executor, -1719578928);
			break;
		case 631:
			Class61.method1255(executor, -1876797077);
			break;
		case 79:
			Class468_Sub20.method12804(executor, -1961027060);
			break;
		case 214:
			Class202_Sub1.method13494(executor, 673234512);
			break;
		case 281:
			Class9.method451(executor, 754299082);
			break;
		case 605:
			Class179.method3020(executor, -1540023306);
			break;
		case 995:
			JS5CacheFile.method3355(executor, 1124965062);
			break;
		case 364:
			Class540.method11594(executor, 1803338491);
			break;
		case 160:
			Class350_Sub3_Sub1.method15559(executor, -1120734203);
			break;
		case 617:
			JS5CacheFile.method3358(executor, (byte) 2);
			break;
		case 53:
			Class273.method4867(executor, 1156940422);
			break;
		case 213:
			Class44.method911(executor, 1598874470);
			break;
		case 334:
			Language.method8297(executor, (byte) 13);
			break;
		case 564:
			Class90.method1508(executor, 384852083);
			break;
		case 6:
			Game.method8206(executor, 1713430236);
			break;
		case 371:
			Class512.method8763(executor, -1688047816);
			break;
		case 932:
			Class443.method7422(executor, -891094646);
			break;
		case 220:
			Class152.method2602(executor, 1641483926);
			break;
		case 993:
			Class292.method5200(true, executor, (byte) 127);
			break;
		case 26:
			ItemDefaultsLoader.method7082(executor, 334319155);
			break;
		case 247:
			Class109.method1856(executor, -347767228);
			break;
		case 357:
			Class221.method3748(executor, -613537380);
			break;
		case 837:
			IterableNodeMap.method7773(executor, 666143203);
			break;
		case 943:
			Class530.method11355(executor, (short) -3286);
			break;
		case 976:
			Class4.method290(executor, (byte) -32);
			break;
		case 552:
			Class278.method4962(executor, 1942118537);
			break;
		case 805:
			Class78.method1385(executor, 2085242349);
			break;
		case 380:
			Class242.method4168(executor, 1942118537);
			break;
		case 618:
			Class279.method4967(executor, 1592761996);
			break;
		case 556:
			Class225.method3793(executor, (byte) 8);
			break;
		case 198:
			Class532_Sub1.method12839(executor, -842587868);
			break;
		case 722:
			Class534.method11439(executor, 2107015851);
			break;
		case 939:
			Class282_Sub20_Sub16.method15307(executor, 2138279256);
			break;
		case 1000:
			Class276.method4898(executor, 832133430);
			break;
		case 34:
			Class508.method8735(executor, (byte) 105);
			break;
		case 957:
			Class52_Sub3.method14521(executor, (byte) -110);
			break;
		case 652:
			Class182.method3041(executor, 361960939);
			break;
		case 374:
			PlayerAppearance.method4030(executor, 688699952);
			break;
		case 232:
			Class217.method3693(executor, (short) -20677);
			break;
		case 973:
			Class282_Sub50_Sub17.method15513(executor, 287550285);
			break;
		case 42:
			Class358.method6238(executor, (byte) 112);
			break;
		case 845:
			Class168.method2865(executor, 447680993);
			break;
		case 148:
			Class89.method1499(executor, 1219321887);
			break;
		case 770:
			JS5CacheFile.method3357(executor, (byte) 64);
			break;
		case 409:
			Class282_Sub17_Sub4.method15407(executor, -1573433365);
			break;
		case 185:
			Class282_Sub17_Sub9.method15448(executor, (byte) 0);
			break;
		case 59:
			Class296.method5296(executor, (byte) 23);
			break;
		case 858:
			Class275_Sub4.method12587(executor, (byte) 35);
			break;
		case 301:
			Class231.method3913(executor, 209838773);
			break;
		case 541:
			UnderlayIndexLoader.method8037(executor, 965815114);
			break;
		case 480:
			Class462.method7715(executor, 1987696395);
			break;
		case 747:
			Class42.method892(executor, -1539143119);
			break;
		case 751:
			Class89.method1497(executor, -24212459);
			break;
		case 996:
			Class489.method8215(executor, 1851435580);
			break;
		case 700:
			Class112.method1874(executor, -25079946);
			break;
		case 785:
			Class226.method3804(executor, 205569752);
			break;
		case 694:
			FontRenderer.method401(executor, -820388650);
			break;
		case 58:
			Class530.method11351(executor, 1943263783);
			break;
		case 150:
			Class489.method8218(executor, (byte) 12);
			break;
		case 716:
			Class168.method2866(executor, (byte) 70);
			break;
		case 650:
			Class401.method6797(executor, (byte) -116);
			break;
		case 265:
			Class75.method1351(executor, 307970796);
			break;
		case 788:
			Class325.method5788(executor, 1718947819);
			break;
		case 1004:
			Class369.method6317(executor, 1070444161);
			break;
		case 226:
			Class282_Sub41_Sub4.method14857(executor, 1781356630);
			break;
		case 589:
			Class532.method11380(executor, -1039594890);
			break;
		case 595:
			Class243.method4176(executor, -891282015);
			break;
		case 990:
			Class149.method2566(executor, 1935420646);
			break;
		case 90:
			Class151.method2586(executor, 1053519892);
			break;
		case 444:
			Class117.method1979(executor, -921004907);
			break;
		case 439:
			Index.method5692(executor, -10665240);
			break;
		case 432:
			Class98.method1624(executor, 1894794212);
			break;
		case 511:
			Class328.method5828(executor, -2101571012);
			break;
		case 88:
			JS5GrabWorker.method12561(executor, 1144052841);
			break;
		case 337:
			Class371.method6350(executor, (byte) 100);
			break;
		case 664:
			Class380.method6449(executor, 875478798);
			break;
		case 810:
			MapRegion.method4560(executor, (byte) -31);
			break;
		case 165:
			IndexReference.method1784(executor, (byte) -36);
			break;
		case 546:
			Class361.method6271(executor, -659323543);
			break;
		case 372:
			Class10.method457(executor, -1012831073);
			break;
		case 120:
			Class158.method2728(executor, 341042619);
			break;
		case 310:
			Class281.method4987(executor, 1654272591);
			break;
		case 323:
			Class52.method1084(executor, 2084394473);
			break;
		case 315:
			Message.method7270(executor, -104209121);
			break;
		case 749:
			Class311.method5512(executor, -837844602);
			break;
		case 352:
			Language.method8295(executor, 313566380);
			break;
		case 126:
			Class10.method459(executor, 1762286892);
			break;
		case 487:
			Class451.method7521(executor, -793117810);
			break;
		case 347:
			Class225_Sub5.method13046(executor, -1376895737);
			break;
		case 898:
			Class226.method3806(executor, -939046667);
			break;
		case 199:
			Class96_Sub10.method14604(executor, (byte) 0);
			break;
		case 791:
			Class121.method2101(executor, -348134092);
			break;
		case 31:
			Class529.method11340(executor, 559947220);
			break;
		case 470:
			Class488.method8212(executor, (byte) -41);
			break;
		case 288:
			Class275_Sub2.method12506(executor, 745705787);
			break;
		case 802:
			Class96.method1608(executor, (byte) 6);
			break;
		case 743:
			Class411.method6913(executor, 76076943);
			break;
		case 202:
			Class244.method4193(executor, 852188841);
			break;
		case 17:
			Class361.method6272(executor, (byte) -45);
			break;
		case 732:
			Class209.method3597(executor, (byte) -30);
			break;
		case 864:
			Class90.method1512(executor, -200113028);
			break;
		case 263:
			Class476.method7930(executor, (byte) 87);
			break;
		case 316:
			Class234.method3949(executor, 1525549828);
			break;
		case 343:
			Class282_Sub11.method12210(executor, (byte) -33);
			break;
		case 822:
			Class292.method5198(executor, 1854398598);
			break;
		case 928:
			Class383.method6510(executor, (byte) 48);
			break;
		case 121:
			Class450.method7501(executor, -1635232939);
			break;
		case 806:
			Class15.method541(executor, (byte) -35);
			break;
		case 473:
			Class282_Sub20_Sub17.method15370(executor, 1689527279);
			break;
		case 599:
			Class93.method1569(executor, (byte) -1);
			break;
		case 839:
			Class60.method1173(executor, 857983009);
			break;
		case 781:
			Class96_Sub12.method14611(executor, (short) 13727);
			break;
		case 132:
			Class252.method4324(executor, (byte) -106);
			break;
		case 440:
			Class8_Sub3.method14340(executor, (byte) 46);
			break;
		case 820:
			Class279.method4966(executor, 1340197997);
			break;
		case 77:
			Class115.method1949(executor, -1501334315);
			break;
		case 950:
			Class455.method7560(executor, -1101994672);
			break;
		case 669:
			Class168.method2867(executor, 566468076);
			break;
		case 982:
			Class161.method2826(executor, 2145538475);
			break;
		case 919:
			Class282_Sub44.method13404(executor, 1810965111);
			break;
		case 937:
			Class96_Sub8.method14579(executor, -1613718443);
			break;
		case 385:
			Class247.method4247(executor, -1859200665);
			break;
		case 114:
			Class529.method11341(executor, -1146169828);
			break;
		case 23:
			Class192.method3169(executor, -1549169231);
			break;
		case 741:
			Class246.method4205(executor, 699455409);
			break;
		case 966:
			Class521_Sub1_Sub1_Sub6.method16124(executor, (short) 128);
		}
	}
}
