
public class Class302 {
	static LoadingStage[] aClass387Array3557;
	static int[] anIntArray3558 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };
	static Interface27[] anInterface27Array3559;
	static int anInt3560 = -432660167;
	static int anInt3561;
	static long aLong3562;
	static int anInt3563;
	static int anInt3564 = -1146213815;

	Class302() throws Throwable {
		throw new Error();
	}

	static int method5360(int i, int i_17_, int i_18_) {
		int i_19_ = i >> 31 & i_17_ - 1;
		return i_19_ + ((i >>> 31) + i) % i_17_;
	}

	static void method5361(Animable animable, int i, int i_20_, int i_21_, int i_22_) {
		RenderAnimDefs renderDef = animable.getRenderAnimDefs((byte) -17);
		Class456_Sub3 animation = animable.aClass456_Sub3_10337;
		int faceDir = ((animable.anInt10361 * 1633416769 - 1040633965 * animable.aClass19_10359.anInt153) & 0x3fff);
		if (Class249.aClass249_3083.aByte3085 == i) {
			if (0 != faceDir || animable.anInt10357 * -1920915917 > 25) {
				if (i_21_ < 0 && -1 != renderDef.walkDir1 * 1350078131) {
					animation.method7570(renderDef.walkDir1 * 1350078131, false, true, -1480402548);
					animation.aBool7891 = false;
				} else if (i_21_ > 0 && -1 != renderDef.walkDir2 * 997445611) {
					animation.method7570(renderDef.walkDir2 * 997445611, false, true, -529478475);
					animation.aBool7891 = false;
				} else if (!animation.aBool7891 || !(renderDef.method3810(animation.method7597(-1676563676), -1546960795))) {
					animation.method7570(renderDef.method3809(711048554), false, true, -1671257670);
					animation.aBool7891 = animable.aClass456_Sub3_10337.hasDefs();
				}
			} else if (!animation.aBool7891 || !renderDef.method3810(animation.method7597(-457692749), -1546960795)) {
				animation.method7570(renderDef.method3809(346097495), false, true, -1633423132);
				animation.aBool7891 = animation.hasDefs();
			}
		} else if (-737324181 * animable.faceEntity != -1 && (faceDir >= 10240 || faceDir <= 2048)) {
			int dir = ((client.anIntArray7380[i_20_] - 1040633965 * (animable.aClass19_10359.anInt153)) & 0x3fff);
			if (Class249.aClass249_3086.aByte3085 == i && -474675041 * renderDef.anInt2797 != -1) {
				if (dir > 2048 && dir <= 6144 && renderDef.anInt2800 * -833477781 != -1)
					animation.method7570(-833477781 * renderDef.anInt2800, false, true, -744132293);
				else if (dir >= 10240 && dir < 14336 && renderDef.anInt2799 * 1642803439 != -1)
					animation.method7570(1642803439 * renderDef.anInt2799, false, true, -930326431);
				else if (dir > 6144 && dir < 10240 && 486149589 * renderDef.walkDir6 != -1)
					animation.method7570(486149589 * renderDef.walkDir6, false, true, -1031888720);
				else
					animation.method7570(renderDef.anInt2797 * -474675041, false, true, -1257308259);
			} else if (Class249.aClass249_3082.aByte3085 == i && renderDef.anInt2801 * 2055956425 != -1) {
				if (dir > 2048 && dir <= 6144 && -1 != renderDef.anInt2812 * 1489597113)
					animation.method7570(renderDef.anInt2812 * 1489597113, false, true, -173534330);
				else if (dir >= 10240 && dir < 14336 && -1 != 1879075923 * renderDef.anInt2803)
					animation.method7570(1879075923 * renderDef.anInt2803, false, true, -1986637657);
				else if (dir > 6144 && dir < 10240 && -1 != 1053306035 * renderDef.anInt2828)
					animation.method7570(1053306035 * renderDef.anInt2828, false, true, -1528009558);
				else
					animation.method7570(2055956425 * renderDef.anInt2801, false, true, -1259452142);
			} else if (dir > 2048 && dir <= 6144 && -1 != -762066591 * renderDef.walkDir5)
				animation.method7570(-762066591 * renderDef.walkDir5, false, true, -989017367);
			else if (dir >= 10240 && dir < 14336 && -1 != -1950693115 * renderDef.walkDir4)
				animation.method7570(renderDef.walkDir4 * -1950693115, false, true, -1349434432);
			else if (dir > 6144 && dir < 10240 && -1 != -670567583 * renderDef.walkDir3)
				animation.method7570(-670567583 * renderDef.walkDir3, false, true, -994621922);
			else
				animation.method7570(renderDef.walkAnimation * -1556707231, false, true, -883440567);
			animation.aBool7891 = false;
		} else if (faceDir != 0 || animable.anInt10357 * -1920915917 > 25) {
			if (Class249.aClass249_3086.aByte3085 == i && -1 != -474675041 * renderDef.anInt2797) {
				if (i_21_ < 0 && -1 != 1179359471 * renderDef.anInt2807)
					animation.method7570(1179359471 * renderDef.anInt2807, false, true, -484680989);
				else if (i_21_ > 0 && -578974199 * renderDef.anInt2808 != -1)
					animation.method7570(renderDef.anInt2808 * -578974199, false, true, -274851042);
				else
					animation.method7570(-474675041 * renderDef.anInt2797, false, true, -85228314);
			} else if (Class249.aClass249_3082.aByte3085 == i && -1 != 2055956425 * renderDef.anInt2801) {
				if (i_21_ < 0 && -1 != renderDef.anInt2830 * -1250601453)
					animation.method7570(-1250601453 * renderDef.anInt2830, false, true, -1720670633);
				else if (i_21_ > 0 && -1 != -1184599575 * renderDef.anInt2806)
					animation.method7570(renderDef.anInt2806 * -1184599575, false, true, -568161732);
				else
					animation.method7570(renderDef.anInt2801 * 2055956425, false, true, -1131572762);
			} else if (i_21_ < 0 && -1 != renderDef.anInt2809 * 871699017)
				animation.method7570(871699017 * renderDef.anInt2809, false, true, -443057729);
			else if (i_21_ > 0 && -1 != 1656950271 * renderDef.anInt2810)
				animation.method7570(renderDef.anInt2810 * 1656950271, false, true, -1335690885);
			else
				animation.method7570(-1556707231 * renderDef.walkAnimation, false, true, -1249670627);
			animation.aBool7891 = false;
		} else {
			if (Class249.aClass249_3086.aByte3085 == i && -1 != renderDef.anInt2797 * -474675041)
				animation.method7570(renderDef.anInt2797 * -474675041, false, true, -1921383310);
			else if (i == Class249.aClass249_3082.aByte3085 && renderDef.anInt2801 * 2055956425 != -1)
				animation.method7570(2055956425 * renderDef.anInt2801, false, true, -352623375);
			else
				animation.method7570(-1556707231 * renderDef.walkAnimation, false, true, -765983563);
			animation.aBool7891 = false;
		}
	}

	static final void method5362(CS2Executor class527, byte i) {
		class527.intStackPtr -= 425673003;
		int i_25_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_26_ = (class527.intStack[1942118537 * class527.intStackPtr + 1]);
		int i_27_ = (class527.intStack[2 + 1942118537 * class527.intStackPtr]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class527.aClass61_7010.method1198(i_25_, i_26_, i_27_, 1532957096);
	}

	public static long method5363(int i, int i_28_) {
		return (long) (11745 + i) * 86400000L;
	}

	public static int method5364(int i, int i_29_, float f, int i_30_) {
		return Class8_Sub3.method14337(i, i_29_, (int) f, 1385119855);
	}
}
