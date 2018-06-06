/* Class96_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub21 extends Class96 {
	int anInt9436;
	int anInt9437;
	public static Class199 aClass199_9438;

	public void method1592(int i) {
		Class117.method1978(((Class96_Sub21) this).anInt9437 * 865366913, 0, 1859517477 * ((Class96_Sub21) this).anInt9436, (byte) 1);
	}

	Class96_Sub21(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub21) this).anInt9437 = class282_sub35.readUnsignedShort() * -576205695;
		((Class96_Sub21) this).anInt9436 = class282_sub35.readUnsignedByte() * -1281245267;
	}

	public void method1601() {
		Class117.method1978(((Class96_Sub21) this).anInt9437 * 865366913, 0, 1859517477 * ((Class96_Sub21) this).anInt9436, (byte) 1);
	}

	public static void method14675(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8073.head((byte) 76)); null != class282_sub48; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(1744342009))
			Class175.method2964(class282_sub48, i, i_0_, i_1_, i_2_, -1230088474);
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 64)); class282_sub48 != null; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(1161440846)) {
			int i_4_ = 1;
			Class227 class227 = ((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.method15855((byte) -17);
			int i_5_ = ((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.aClass456_Sub3_10337.method7597(-1141371259);
			if (i_5_ == -1 || (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.aClass456_Sub3_10337.aBool7891))
				i_4_ = 0;
			else if (i_5_ == class227.anInt2797 * -474675041 || i_5_ == 486149589 * class227.anInt2817 || -833477781 * class227.anInt2800 == i_5_ || 1642803439 * class227.anInt2799 == i_5_)
				i_4_ = 2;
			else if (class227.anInt2801 * 2055956425 == i_5_ || i_5_ == class227.anInt2828 * 1053306035 || class227.anInt2812 * 1489597113 == i_5_ || i_5_ == 1879075923 * class227.anInt2803)
				i_4_ = 3;
			if (((Class282_Sub48) class282_sub48).anInt8091 * -1881404979 != i_4_) {
				int i_6_ = (Class282_Sub11_Sub1.method15433((((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085), 912866554));
				NPCDefinitions class409 = (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.aClass409_10580);
				if (null != class409.anIntArray4886)
					class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (class409 == null || i_6_ == -1) {
					((Class282_Sub48) class282_sub48).anInt8095 = 569710251;
					((Class282_Sub48) class282_sub48).aBool8098 = false;
					((Class282_Sub48) class282_sub48).anInt8091 = -983037179 * i_4_;
				} else if (1399704573 * (((Class282_Sub48) class282_sub48).anInt8095) != i_6_ || (((Class282_Sub48) class282_sub48).aBool8098 != class409.aBool4872)) {
					boolean bool = false;
					if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099)) {
						((Class282_Sub48) class282_sub48).anInt8089 -= 241694208;
						if ((-301211853 * ((Class282_Sub48) class282_sub48).anInt8089) <= 0) {
							Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
							((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						((Class282_Sub48) class282_sub48).anInt8089 = class409.anInt4909 * 51937289;
						((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082 = null;
						((Class282_Sub48) class282_sub48).aClass282_Sub18_8097 = null;
						((Class282_Sub48) class282_sub48).anInt8095 = -569710251 * i_6_;
						((Class282_Sub48) class282_sub48).aBool8098 = class409.aBool4872;
						((Class282_Sub48) class282_sub48).anInt8091 = i_4_ * -983037179;
					}
				} else {
					((Class282_Sub48) class282_sub48).anInt8091 = i_4_ * -983037179;
					((Class282_Sub48) class282_sub48).anInt8089 = 51937289 * class409.anInt4909;
				}
			}
			Vector3 class385 = (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.method11166().aClass385_3595);
			((Class282_Sub48) class282_sub48).anInt8107 = (int) class385.x * 80768833;
			((Class282_Sub48) class282_sub48).anInt8079 = ((int) class385.x + (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.method15805(828768449) << 8)) * 1480845005;
			((Class282_Sub48) class282_sub48).anInt8078 = (int) class385.z * 1225707357;
			((Class282_Sub48) class282_sub48).anInt8077 = ((int) class385.z + (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.method15805(828768449) << 8)) * 1710236473;
			((Class282_Sub48) class282_sub48).anInt8076 = 1589843113 * (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085.aByte7967);
			Class175.method2964(class282_sub48, i, i_0_, i_1_, i_2_, -1411599519);
		}
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass465_8075.method7750(524790011)); class282_sub48 != null; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass465_8075.method7751((byte) 99)) {
			int i_7_ = 1;
			Class227 class227 = ((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.method15855((byte) -17);
			int i_8_ = ((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.aClass456_Sub3_10337.method7597(-527861768);
			if (i_8_ == -1 || (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.aClass456_Sub3_10337.aBool7891))
				i_7_ = 0;
			else if (class227.anInt2797 * -474675041 == i_8_ || i_8_ == 486149589 * class227.anInt2817 || i_8_ == class227.anInt2800 * -833477781 || 1642803439 * class227.anInt2799 == i_8_)
				i_7_ = 2;
			else if (i_8_ == class227.anInt2801 * 2055956425 || class227.anInt2828 * 1053306035 == i_8_ || 1489597113 * class227.anInt2812 == i_8_ || i_8_ == 1879075923 * class227.anInt2803)
				i_7_ = 3;
			if (i_7_ != -1881404979 * ((Class282_Sub48) class282_sub48).anInt8091) {
				int i_9_ = (Class149_Sub2.method14610((((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086), 1504837662));
				if (i_9_ != (1399704573 * ((Class282_Sub48) class282_sub48).anInt8095) || (((Class282_Sub48) class282_sub48).aBool8098 != (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.isTransformedNPC))) {
					boolean bool = false;
					if ((((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099) != null) {
						((Class282_Sub48) class282_sub48).anInt8089 -= 241694208;
						if ((((Class282_Sub48) class282_sub48).anInt8089 * -301211853) <= 0) {
							Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
							((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						((Class282_Sub48) class282_sub48).anInt8089 = ((((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.anInt10566) * -1517226111);
						((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082 = null;
						((Class282_Sub48) class282_sub48).aClass282_Sub18_8097 = null;
						((Class282_Sub48) class282_sub48).anInt8095 = i_9_ * -569710251;
						((Class282_Sub48) class282_sub48).aBool8098 = (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.isTransformedNPC);
						((Class282_Sub48) class282_sub48).anInt8091 = -983037179 * i_7_;
					}
				} else {
					((Class282_Sub48) class282_sub48).anInt8089 = ((((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.anInt10566) * -1517226111);
					((Class282_Sub48) class282_sub48).anInt8091 = i_7_ * -983037179;
				}
			}
			Vector3 class385 = (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.method11166().aClass385_3595);
			((Class282_Sub48) class282_sub48).anInt8107 = 80768833 * (int) class385.x;
			((Class282_Sub48) class282_sub48).anInt8079 = ((int) class385.x + (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.method15805(828768449) << 8)) * 1480845005;
			((Class282_Sub48) class282_sub48).anInt8078 = 1225707357 * (int) class385.z;
			((Class282_Sub48) class282_sub48).anInt8077 = ((int) class385.z + (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.method15805(828768449) << 8)) * 1710236473;
			((Class282_Sub48) class282_sub48).anInt8076 = (((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086.aByte7967) * 1589843113;
			Class175.method2964(class282_sub48, i, i_0_, i_1_, i_2_, -2031057762);
		}
	}

	static Class282_Sub14 method14676(Index class317, int i, int i_10_) {
		byte[] is = class317.getFile(i, -2092539323);
		if (is == null)
			return null;
		return new Class282_Sub14(is);
	}

	public static final int method14677(int i, int i_11_, int i_12_) {
		if (i == -1)
			return 12345678;
		i_11_ = (i & 0x7f) * i_11_ >> 7;
		if (i_11_ < 2)
			i_11_ = 2;
		else if (i_11_ > 126)
			i_11_ = 126;
		return i_11_ + (i & 0xff80);
	}
}
