
/* Class350_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public class Class350_Sub2 extends Class350 {
	public int anInt7813;
	public int anInt7814;
	public static int anInt7815;

	public Class60 method25() {
		return Class60.aClass60_602;
	}

	public Class60 method24(int i) {
		return Class60.aClass60_602;
	}

	public static Class350 method12570(RsByteBuffer class282_sub35) {
		Class350 class350 = Class383.method6512(class282_sub35, 88062096);
		int i = class282_sub35.readInt();
		int i_0_ = class282_sub35.readInt();
		return new Class350_Sub2(class350.aClass356_4094, class350.aClass353_4087, class350.anInt4090 * -1967081549, class350.anInt4089 * -1196256967, class350.anInt4093 * 329542577, 323608093 * class350.anInt4088, -1921815535 * class350.anInt4092, 985690519 * class350.anInt4086, class350.anInt4091 * -771513131, i, i_0_);
	}

	Class350_Sub2(Class356 class356, Class353 class353, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class356, class353, i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		anInt7813 = 1289847315 * i_7_;
		anInt7814 = i_8_ * 62176685;
	}

	static void method12571(int i) {
		if (Renderers.SOFTWARE_RENDERER.method8407()) {
			Renderers.SOFTWARE_RENDERER.method8410(Class351.aCanvas4096, -796091411);
			Class250.method4297(-1109644708);
			Dimension dimension = Class351.aCanvas4096.getSize();
			Renderers.SOFTWARE_RENDERER.method8524(Class351.aCanvas4096, dimension.width, dimension.height, (byte) -5);
			Renderers.SOFTWARE_RENDERER.method8412(Class351.aCanvas4096, (byte) 8);
		} else
			Class538.method11500(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1386089693), false, (byte) 24);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method12572(CS2Executor class527, int i) {
		int i_9_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1467773242);
		if (class282_sub50_sub6 != null) {
			boolean bool = class282_sub50_sub6.method14775(i_9_ >> 14 & 0x3fff, i_9_ & 0x3fff, Class517.anIntArray5900, -169630584);
			if (bool) {
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class517.anIntArray5900[1];
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class517.anIntArray5900[2];
			} else {
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}

	static final void method12573(CS2Executor class527, short i) {
		if (client.anInt7166 * -1741204137 == 0)
			Class448.aBool5419 = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) == 1;
	}
}
