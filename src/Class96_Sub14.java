/* Class96_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub14 extends Class96 {
	int anInt9369;
	int anInt9370;
	int anInt9371;
	int anInt9372;
	int anInt9373;

	public void method1592(int i) {
		Animable class521_sub1_sub1_sub2 = Class82.aClass75Array804[1276816799 * ((Class96_Sub14) this).anInt9369].method1342((byte) 83);
		class521_sub1_sub1_sub2.applyHit(-2146354133 * ((Class96_Sub14) this).anInt9370, 2002383587 * ((Class96_Sub14) this).anInt9371, ((Class96_Sub14) this).anInt9373 * 117044297, ((Class96_Sub14) this).anInt9372 * 1810377009, client.cycles * -1809259861, 0, 288203406);
	}

	Class96_Sub14(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub14) this).anInt9369 = class282_sub35.readUnsignedShort() * 565784159;
		int i = class282_sub35.readUnsignedByte();
		if ((i & 0x1) != 0) {
			((Class96_Sub14) this).anInt9370 = class282_sub35.readUnsignedShort() * 1355915907;
			((Class96_Sub14) this).anInt9371 = class282_sub35.readUnsignedShort() * 1673585355;
		} else {
			((Class96_Sub14) this).anInt9370 = -1355915907;
			((Class96_Sub14) this).anInt9371 = -1673585355;
		}
		if (0 != (i & 0x2)) {
			((Class96_Sub14) this).anInt9373 = class282_sub35.readUnsignedShort() * 306986489;
			((Class96_Sub14) this).anInt9372 = class282_sub35.readUnsignedShort() * -491483183;
		} else {
			((Class96_Sub14) this).anInt9373 = -306986489;
			((Class96_Sub14) this).anInt9372 = 491483183;
		}
		if (0 != (i & 0x4)) {
			int i_0_ = class282_sub35.readUnsignedShort();
			int i_1_ = class282_sub35.readUnsignedShort();
			int i_2_ = 255 * i_0_ / i_1_;
			if (i_0_ > 0 && i_2_ < 1) {
				boolean bool = true;
			}
		}
	}

	public void method1601() {
		Animable class521_sub1_sub1_sub2 = Class82.aClass75Array804[1276816799 * ((Class96_Sub14) this).anInt9369].method1342((byte) 111);
		class521_sub1_sub1_sub2.applyHit(-2146354133 * ((Class96_Sub14) this).anInt9370, 2002383587 * ((Class96_Sub14) this).anInt9371, ((Class96_Sub14) this).anInt9373 * 117044297, ((Class96_Sub14) this).anInt9372 * 1810377009, client.cycles * -1809259861, 0, 2138718580);
	}

	public static int method14641(int i) {
		boolean bool = true;
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		if (Class11.aClass282_Sub51_124.anInt8167 * -79546877 < 512 && -79546877 * Class11.aClass282_Sub51_124.anInt8167 != 0)
			bool = false;
		if (Class225_Sub6.aString8069.startsWith("win")) {
			bool_4_ = true;
			bool_3_ = true;
		} else
			bool_3_ = true;
		if (Class188.aBool2378)
			bool = false;
		if (Class188.aBool2377)
			bool_3_ = false;
		if (Class188.aBool2372)
			bool_4_ = false;
		if (!bool && !bool_3_ && !bool_4_)
			return Class496.method8313((byte) 1);
		int i_5_ = -1;
		int i_6_ = -1;
		int i_7_ = -1;
		if (bool) {
			try {
				i_5_ = Class383.method6513(2, 1000, 398662792);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (bool_4_) {
			try {
				i_7_ = Class383.method6513(3, 1000, 1356532046);
				if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(525522056) == 3) {
					Class168 class168 = Renderers.SOFTWARE_RENDERER.method8392();
					long l = (class168.aLong2049 * -3062896818026551219L & 0xffffffffffffL);
					switch (1681700525 * class168.anInt2052) {
					case 4318:
						bool_3_ = bool_3_ & l >= 64425238954L;
						break;
					case 4098:
						bool_3_ = bool_3_ & l >= 60129613779L;
						break;
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (bool_3_) {
			try {
				i_6_ = Class383.method6513(1, 1000, 762994065);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (i_5_ == -1 && -1 == i_6_ && i_7_ == -1)
			return Class496.method8313((byte) 1);
		i_7_ *= 1.1F;
		i_6_ *= 1.1F;
		if (i_5_ > i_7_ && i_5_ > i_6_)
			return Class470.method7823(i_5_, -395691636);
		if (i_7_ > i_6_)
			return Class8_Sub1.method13782(3, i_7_, -2005172435);
		return Class8_Sub1.method13782(1, i_6_, -2005172435);
	}

	static final int[] method14642(String string, CS2Executor class527, int i) {
		int[] is = null;
		if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
			int i_8_ = (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]);
			if (i_8_ > 0) {
				is = new int[i_8_];
				while (i_8_-- > 0)
					is[i_8_] = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
			}
		}
		return is;
	}

	static boolean method14643(Class118 class118, int i) {
		Class282_Sub10 class282_sub10 = client.method11633(class118);
		if (class282_sub10.method12180((byte) 102) > 0)
			return true;
		if (class282_sub10.method12196(1802223164))
			return true;
		if (null != class118.aClass118_1379)
			return true;
		return false;
	}

	static final void method14644(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass282_Sub4_7011.aByte7497;
	}
}
