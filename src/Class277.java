
/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class277 {
	int anInt3347;
	int anInt3348;
	int anInt3349;
	int anInt3350;
	int anInt3351;

	Class277(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		((Class277) this).anInt3349 = i_0_ * -1011937663;
		((Class277) this).anInt3348 = i_1_ * 827811819;
		((Class277) this).anInt3351 = 2125840687 * i_2_;
		((Class277) this).anInt3350 = i_3_ * -1013199911;
		((Class277) this).anInt3347 = (486353273 * ((Class277) this).anInt3350 - -1145999297 * ((Class277) this).anInt3351);
	}

	static final void method4904(CS2Executor class527, byte i) {
		int i_4_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_4_, (byte) 74);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_4_ >> 16];
		Class204.method3365(class118, class98, class527, -1548245230);
	}

	static final void method4905(CS2Executor class527, byte i) {
		int i_5_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		do {
			if (null != client.aString7426) {
				if (i == -1) {
					for (;;) {
						/* empty */
					}
				}
				if (i_5_ < -1772444859 * Class459.anInt5534) {
					if (i == -1) {
						/* empty */
					}
					class527.intStack[((class527.intStackPtr += 141891001) * 1942118537) - 1] = (-774562077 * Class467.aClass173Array5575[i_5_].anInt2131);
					break;
				}
			}
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
		} while (false);
	}

	public static int method4906(int i, int i_6_, byte i_7_) {
		int i_8_ = 1;
		for (/**/; i_6_ > 1; i_6_ >>= 1) {
			if (0 != (i_6_ & 0x1))
				i_8_ *= i;
			i *= i;
		}
		if (1 == i_6_)
			return i_8_ * i;
		return i_8_;
	}

	static void method4907(int i) {
		if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
			try {
				Class282_Sub50_Sub3.aFileOutputStream9481.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class282_Sub50_Sub3.aFileOutputStream9481 = null;
	}

	static void method4908(GraphicalRenderer class505, int i) {
		int i_9_ = -10660793;
		Class377.method6394(class505, Class301.anInt3555 * 1742345613, 815250613 * Class184.anInt2300, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_9_, -16777216, -68635316);
		Class285.aClass8_3394.renderText(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -384363737), 3 + 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300 + 14, i_9_, -1, -418109423);
		int i_10_ = Class163.aClass209_2031.method3569(1993106311);
		int i_11_ = Class163.aClass209_2031.method3570(756095591);
		if (!Class20.aBool162) {
			int i_12_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 45)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(980795881))) {
				int i_13_ = ((Class20.anInt178 * 997766473 * (Class20.anInt169 * 2144330291 - 1 - i_12_)) + (815250613 * Class184.anInt2300 + 31));
				Class282_Sub25.method12400(i_10_, i_11_, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, Class158_Sub2.anInt8975 * -13788709, Class110.anInt1104 * -1488439617, i_13_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -786945772);
				i_12_++;
			}
		} else {
			int i_14_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15; class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-1913703770))) {
				int i_15_ = (31 + Class184.anInt2300 * 815250613 + i_14_ * (Class20.anInt178 * 997766473));
				if (1 == 2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)
					Class282_Sub25.method12400(i_10_, i_11_, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, -1488439617 * Class110.anInt1104, i_15_, ((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -1056594399);
				else
					Class99.method1630(i_10_, i_11_, Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_15_, class282_sub50_sub15, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -2123555932);
				i_14_++;
			}
			if (Class20.aClass282_Sub50_Sub15_163 != null) {
				Class377.method6394(class505, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, (Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845), i_9_, -16777216, 1059677445);
				Class285.aClass8_3394.renderText(((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aString9771, 143093737 * Class341.anInt3996 + 3, 2107083711 * Class282_Sub50_Sub2.anInt9471 + 14, i_9_, -1, -418109423);
				i_14_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770.method7955(969047918))) {
					int i_16_ = (i_14_ * (997766473 * Class20.anInt178) + (2107083711 * Class282_Sub50_Sub2.anInt9471 + 31));
					Class282_Sub25.method12400(i_10_, i_11_, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, -1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526, i_16_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -1459940203);
					i_14_++;
				}
			}
		}
	}
}
