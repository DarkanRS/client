
/* Class282_Sub50_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.EventQueue;
import java.io.File;

public abstract class Class282_Sub50_Sub17 extends Class282_Sub50 {
	static EventQueue anEventQueue10074;

	Class282_Sub50_Sub17() {
		/* empty */
	}

	static void method15506(GraphicalRenderer class505, int i, int i_0_, Class118 class118, int i_1_) {
		int i_2_ = 63;
		int i_3_ = 7;
		for (int i_4_ = 63; i_4_ >= 0; i_4_--) {
			int i_5_ = (i_4_ & 0x3f) << 10 | (i_3_ & 0x7) << 7 | i_2_ & 0x7f;
			Class38.method854(false, true, -2145672761);
			int i_6_ = Class540.anIntArray7136[i_5_];
			Class13.method508(false, true, 425097305);
			class505.B(i, i_0_ + (-492594917 * class118.anInt1429 * (63 - i_4_) >> 6), 1506818197 * class118.anInt1301, 1 + (-492594917 * class118.anInt1429 >> 6), i_6_, 0);
		}
	}

	static int method15507(Class282_Sub50_Sub7 class282_sub50_sub7, Class414 class414, int i) {
		String string = IncomingPacket.method6380(class282_sub50_sub7, 594489701);
		int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -1355601435);
		if (is != null)
			string = new StringBuilder().append(string).append(Class15.method547(is, 1858331234)).toString();
		int i_7_ = class414.method6947(string, Class115.aClass160Array1248, -1437675103);
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9577)
			i_7_ += Exception_Sub1.aClass160_10075.method2747() + 4;
		return i_7_;
	}

	public static File method15508(int i) {
		return Class263.aFile3264;
	}

	static final void method15509(int i) {
		Class517.anInt5905 -= 1618802697;
	}

	static final void method15510(CS2Executor class527, int i) {
		int i_8_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_8_, (byte) 76);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_8_ >> 16];
		Class13.method506(class118, class98, class527, 73822298);
	}

	static final void method15511(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		class118.anInt1343 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -807852535);
		Class109.method1858(class118, (byte) 56);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class106.method1818(-1952846363 * class118.anInt1287, 438520847);
	}

	static final void method15512(CS2Executor class527, int i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i_9_, (byte) -1);
		int i_10_ = -1;
		if (null != class108)
			i_10_ = class108.anInt1092 * 1608788053;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_10_;
	}

	static final void method15513(CS2Executor class527, int i) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = method15508(-1026148530).toString();
	}

	static final void method15514(CS2Executor class527, int i) {
		int i_11_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_11_, (byte) 72);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_11_ >> 16];
		Class290.method5121(class118, class98, class527, (byte) 7);
	}
}
