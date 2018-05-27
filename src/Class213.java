/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213 {
	public String aString2679;
	public int anInt2680;

	Class213() {
		/* empty */
	}

	public static void method3661(int i, String string, int i_0_, byte i_1_) {
		CS2Script class282_sub50_sub5 = Class225_Sub1.method12792(Class397.aClass397_4792, i, -1, 856735933);
		if (null != class282_sub50_sub5) {
			CS2Executor class527 = Class125.method2167(2125481004);
			class527.intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			class527.objectLocals = new String[1886892247 * class282_sub50_sub5.stringLocalsCount];
			class527.objectLocals[0] = string;
			class527.intLocals[0] = i_0_;
			Class51.method1068(class282_sub50_sub5, 200000, class527, -625116466);
		}
	}

	public static void method3662(AnimationDefinitions class518, int i, Class521_Sub1 class521_sub1, short i_2_) {
		if (Class260.anInt3219 * -458827259 < 50 && (class518 != null && class518.anIntArrayArray5913 != null && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i]) && (class521_sub1.aByte7967 == Class84.myPlayer.aByte7967)) {
			int i_3_ = class518.anIntArrayArray5913[i][0];
			int i_4_ = i_3_ >> 8;
			int i_5_ = i_3_ >> 5 & 0x7;
			int i_6_ = i_3_ & 0x1f;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_7_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_7_ > 0)
					i_4_ = class518.anIntArrayArray5913[i][i_7_];
			}
			int i_8_ = 256;
			if (null != class518.anIntArray5927 && null != class518.anIntArray5919)
				i_8_ = ((int) (Math.random() * (double) (class518.anIntArray5919[i] - class518.anIntArray5927[i])) + class518.anIntArray5927[i]);
			int i_9_ = (null == class518.anIntArray5926 ? 255 : class518.anIntArray5926[i]);
			if (i_6_ == 0) {
				if (Class84.myPlayer == class521_sub1) {
					if (class518.aBool5928)
						Class435.method7300(i_4_, i_5_, 0, i_9_, false, i_8_, 1449989045);
					else
						Class153.method2618(i_4_, i_5_, 0, i_9_, i_8_, 1889559384);
				}
			} else {
				if (Class84.myPlayer == class521_sub1) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-1858915479) == 0)
						return;
				} else if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8193.method12714(70703320) == 0)
					return;
				Class385 class385 = class521_sub1.method11166().aClass385_3595;
				int i_10_ = (int) class385.aFloat4671 - 256 >> 9;
				int i_11_ = (int) class385.aFloat4673 - 256 >> 9;
				int i_12_ = ((class521_sub1 == Class84.myPlayer) ? 0 : i_6_ + ((i_10_ << 16) + (class521_sub1.aByte7967 << 24) + (i_11_ << 8)));
				Class260.aClass268Array3232[(Class260.anInt3219 += -1221598515) * -458827259 - 1] = new Class268(class518.aBool5928 ? (byte) 2 : (byte) 1, i_4_, i_5_, 0, i_9_, i_12_, i_8_, class521_sub1);
			}
		}
	}
}
