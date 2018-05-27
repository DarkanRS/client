
/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class165 {
	static int anInt2035;
	static int anInt2036;
	static int anInt2037;

	Class165() throws Throwable {
		throw new Error();
	}

	public static GraphicalRenderer method2851(Canvas canvas, Interface22 interface22, int i, int i_0_) {
		return new ja(canvas, interface22, i, i_0_);
	}

	static void method2852(int i) {
		if (null != IndexLoaders.LOADING_STAGE) {
			Class328.aClass306_3771 = new Class306();
			Class328.aClass306_3771.method5422(5158573110282126937L * Class302.aLong3562, ((LoadingStage) IndexLoaders.LOADING_STAGE).aClass433_4711.translate(Class223.CURRENT_LANGUAGE, -1960746007), ((LoadingStage) IndexLoaders.LOADING_STAGE).anInt4715 * 2033966327, IndexLoaders.LOADING_STAGE, 2034622208);
			Class377.aThread4520 = new Thread(Class328.aClass306_3771, "");
			Class377.aThread4520.start();
		}
	}

	static void method2853(boolean bool, int i) {
		if (Class179.aString2225.length() != 0) {
			Class209.method3598(new StringBuilder().append("--> ").append(Class179.aString2225).toString(), -1362570363);
			Class251.handleCommand(Class179.aString2225, false, bool, -354697449);
			Class179.anInt2226 = 0;
			if (!bool) {
				Class179.anInt2220 = 0;
				Class179.aString2225 = "";
			}
		}
	}

	static final void method2854(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7001 -= 1918006146;
		if ((((CS2Executor) class527).aLongArray7003[1820448321 * ((CS2Executor) class527).anInt7001]) != (((CS2Executor) class527).aLongArray7003[1 + ((CS2Executor) class527).anInt7001 * 1820448321]))
			((CS2Executor) class527).instrPtr += (-1051529003 * (((CS2Executor) class527).unknown[((CS2Executor) class527).instrPtr * 301123709]));
	}

	static final void method2855(CS2Executor class527, byte i) {
		int i_1_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_1_, (byte) 59);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_1_ >> 16];
		Login.method5017(class118, class98, class527, -974856399);
	}

	static final void method2856(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_2_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_3_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		Class477 class477 = Class291.method5127(i_2_ >> 14 & 0x3fff, i_2_ & 0x3fff);
		boolean bool = false;
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) class477.method7941((byte) 4); class282_sub50_sub6 != null; class282_sub50_sub6 = (Class282_Sub50_Sub6) class477.method7955(-1429079098)) {
			if (i_3_ == 1864297169 * class282_sub50_sub6.anInt9536) {
				bool = true;
				break;
			}
		}
		if (bool)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}
}
