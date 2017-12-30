
/* Class96_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class96_Sub12 extends Class96 {
	int anInt9317;
	String aString9318;
	static int anInt9319;

	public void method1592(int i) {
		if (-1638311881 * client.anInt7231 != -1)
			Class213.method3661(-1638311881 * client.anInt7231, ((Class96_Sub12) this).aString9318, ((Class96_Sub12) this).anInt9317 * 1635620553, (byte) -117);
	}

	public void method1601() {
		if (-1638311881 * client.anInt7231 != -1)
			Class213.method3661(-1638311881 * client.anInt7231, ((Class96_Sub12) this).aString9318, ((Class96_Sub12) this).anInt9317 * 1635620553, (byte) -111);
	}

	Class96_Sub12(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub12) this).aString9318 = class282_sub35.readString(29090501);
		((Class96_Sub12) this).anInt9317 = class282_sub35.readUnsignedShort() * 766796665;
	}

	static final void method14611(CS2Executor class527, short i) {
		int[] is = ((CS2Executor) class527).intStack;
		int i_0_ = (((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1;
		int i_1_;
		if (Class530.aBool7050) {
			if (i <= 541)
				return;
			i_1_ = 1;
		} else
			i_1_ = 0;
		is[i_0_] = i_1_;
	}

	static final void method14612(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		Class180[] class180s = client.aClass180Array7348;
		for (int i_8_ = 0; i_8_ < class180s.length; i_8_++) {
			Class180 class180 = class180s[i_8_];
			if (null != class180 && -379447335 * class180.anInt2236 == 2) {
				Class407.method6871((((Class180) class180).anInt2239 * -833881757), class180.anInt2243 * -51612493, class180.anInt2235 * -1074026889, (((Class180) class180).anInt2241 * 1606941506), -1913137620);
				if (client.aFloatArray7292[0] > -1.0F && -1809259861 * client.cycles % 20 < 10) {
					Class160 class160 = (Class391.aClass160Array4778[-1923151643 * ((Class180) class180).anInt2240]);
					int i_9_ = (int) (client.aFloatArray7292[0] + (float) i - 12.0F);
					int i_10_ = (int) (client.aFloatArray7292[1] + (float) i_2_ - 28.0F);
					class160.method2752(i_9_, i_10_);
				}
			}
		}
	}

	public static int method14613(Class282_Sub50_Sub7 class282_sub50_sub7, int i) {
		if (Class20.aBool161)
			return 6;
		if (class282_sub50_sub7 == null)
			return 0;
		int i_11_ = (-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587);
		if (Class14.method539(i_11_, 85195047))
			return 1;
		if (Class38.method859(i_11_, -1682057624))
			return 2;
		if (Class431.method7252(i_11_, (byte) 0))
			return 3;
		if (Class237.method3989(i_11_, (byte) 0))
			return 4;
		if (Class348.method6176(i_11_, -1754643726))
			return 7;
		if (i_11_ == 16)
			return 8;
		return 5;
	}

	public static void method14614(Class505 class505, long l) {
		Class235.anInt2903 = 417412323 * Class235.anInt2900;
		Class235.anInt2900 = 0;
		Class169.method2869(1533515778);
		Iterator iterator = Class235.aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			boolean bool = class539.method11509(class505, l);
			if (!bool) {
				iterator.remove();
				Class477.aClass539Array5632[1765973211 * Class235.anInt2901] = class539;
				Class235.anInt2901 = 55312211 * (1 + Class235.anInt2901 * 1765973211 & (Class89.anIntArray931[-391332475 * Class235.anInt2906]));
			}
		}
	}
}
