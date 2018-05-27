/* Class282_Sub20_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub36 extends Class282_Sub20 {
	static final boolean aBool9972 = true;
	static final int anInt9973 = 4096;
	boolean aBool9974 = true;
	int anInt9975 = 1929416704;

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub36) this).aBool9974 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub36) this).anInt9975 = class282_sub35.readUnsignedShort() * -328781815;
			break;
		}
	}

	int[][] method12320(int i, int i_0_) {
		int[][] is = aClass308_7670.method5463(i, 1953509763);
		if (aClass308_7670.aBool3619) {
			int[] is_1_ = method12317(0, i - 1 & Class316.anInt3673 * 543225399, 2146768171);
			int[] is_2_ = method12317(0, i, 2052173603);
			int[] is_3_ = method12317(0, i + 1 & Class316.anInt3673 * 543225399, 2106736762);
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			for (int i_7_ = 0; i_7_ < Class316.anInt3670 * -402153223; i_7_++) {
				int i_8_ = (((Class282_Sub20_Sub36) this).anInt9975 * 1628134969 * (is_3_[i_7_] - is_1_[i_7_]));
				int i_9_ = (((Class282_Sub20_Sub36) this).anInt9975 * 1628134969 * (is_2_[1 + i_7_ & Class316.anInt3669 * 1201532175] - (is_2_[i_7_ - 1 & Class316.anInt3669 * 1201532175])));
				int i_10_ = i_9_ >> 12;
				int i_11_ = i_8_ >> 12;
				int i_12_ = i_10_ * i_10_ >> 12;
				int i_13_ = i_11_ * i_11_ >> 12;
				int i_14_ = (int) (Math.sqrt((double) ((float) (i_12_ + i_13_ + 4096) / 4096.0F)) * 4096.0);
				int i_15_;
				int i_16_;
				int i_17_;
				if (0 != i_14_) {
					i_15_ = i_9_ / i_14_;
					i_16_ = i_8_ / i_14_;
					i_17_ = 16777216 / i_14_;
				} else {
					i_15_ = 0;
					i_16_ = 0;
					i_17_ = 0;
				}
				if (((Class282_Sub20_Sub36) this).aBool9974) {
					i_15_ = (i_15_ >> 1) + 2048;
					i_16_ = (i_16_ >> 1) + 2048;
					i_17_ = 2048 + (i_17_ >> 1);
				}
				is_4_[i_7_] = i_15_;
				is_5_[i_7_] = i_16_;
				is_6_[i_7_] = i_17_;
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub36) this).aBool9974 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub36) this).anInt9975 = class282_sub35.readUnsignedShort() * -328781815;
			break;
		}
	}

	public Class282_Sub20_Sub36() {
		super(1, false);
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub36) this).aBool9974 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub36) this).anInt9975 = class282_sub35.readUnsignedShort() * -328781815;
			break;
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_18_) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub36) this).aBool9974 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub36) this).anInt9975 = class282_sub35.readUnsignedShort() * -328781815;
			break;
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1396503990);
		if (aClass308_7670.aBool3619) {
			int[] is_19_ = method12317(0, i - 1 & Class316.anInt3673 * 543225399, 2032481886);
			int[] is_20_ = method12317(0, i, 1983785655);
			int[] is_21_ = method12317(0, i + 1 & Class316.anInt3673 * 543225399, 2114637138);
			int[] is_22_ = is[0];
			int[] is_23_ = is[1];
			int[] is_24_ = is[2];
			for (int i_25_ = 0; i_25_ < Class316.anInt3670 * -402153223; i_25_++) {
				int i_26_ = (((Class282_Sub20_Sub36) this).anInt9975 * 1628134969 * (is_21_[i_25_] - is_19_[i_25_]));
				int i_27_ = (((Class282_Sub20_Sub36) this).anInt9975 * 1628134969 * (is_20_[1 + i_25_ & Class316.anInt3669 * 1201532175] - (is_20_[i_25_ - 1 & Class316.anInt3669 * 1201532175])));
				int i_28_ = i_27_ >> 12;
				int i_29_ = i_26_ >> 12;
				int i_30_ = i_28_ * i_28_ >> 12;
				int i_31_ = i_29_ * i_29_ >> 12;
				int i_32_ = (int) (Math.sqrt((double) ((float) (i_30_ + i_31_ + 4096) / 4096.0F)) * 4096.0);
				int i_33_;
				int i_34_;
				int i_35_;
				if (0 != i_32_) {
					i_33_ = i_27_ / i_32_;
					i_34_ = i_26_ / i_32_;
					i_35_ = 16777216 / i_32_;
				} else {
					i_33_ = 0;
					i_34_ = 0;
					i_35_ = 0;
				}
				if (((Class282_Sub20_Sub36) this).aBool9974) {
					i_33_ = (i_33_ >> 1) + 2048;
					i_34_ = (i_34_ >> 1) + 2048;
					i_35_ = 2048 + (i_35_ >> 1);
				}
				is_22_[i_25_] = i_33_;
				is_23_[i_25_] = i_34_;
				is_24_[i_25_] = i_35_;
			}
		}
		return is;
	}

	static final void method15417(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class6.method304(-1443843795);
	}

	public static void method15418(int i) {
		Class278_Sub1.method13449((byte) -118);
		Class253.method4330(22050, Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(-490218326) == 1, 2);
		Class320.aClass253_3723 = Class253.method4331(Class351.LOAD_CANVAS, 0, 22050);
		Class42_Sub1.method14563(true, Class282_Sub20_Sub10.method15262(null, 1928117026), (short) 11196);
		Class100.aClass253_1008 = Class253.method4331(Class351.LOAD_CANVAS, 1, 2048);
		Class100.aClass253_1008.method4329(Class79.aClass282_Sub15_Sub4_783);
	}

	public static void method15419(String string, boolean bool, int i) {
		Class282_Sub20_Sub8.method15242(string, bool, -1, -1, -1618689115);
	}

	public static void method15420(byte i) {
		try {
			if (1 == Class148.anInt1730 * -1423242349) {
				int i_36_ = Class148.aClass282_Sub15_Sub2_1735.method15123(-1985280884);
				if (i_36_ > 0 && Class148.aClass282_Sub15_Sub2_1735.method15103(1537744639)) {
					i_36_ -= -1553319257 * Class96_Sub22.anInt9440;
					if (i_36_ < 0)
						i_36_ = 0;
					Class148.aClass282_Sub15_Sub2_1735.method15144(i_36_, -610431115);
					return;
				}
				Class148.aClass282_Sub15_Sub2_1735.method15101((short) 15315);
				Class148.aClass282_Sub15_Sub2_1735.method15097((short) 256);
				if (null != Class75.aClass317_746)
					Class148.anInt1730 = 1601541430;
				else
					Class148.anInt1730 = 0;
				Class282_Sub44_Sub3.aClass282_Sub7_9563 = null;
				Class454.aClass250_5450 = null;
			}
			if (3 == -1423242349 * Class148.anInt1730) {
				int i_37_ = Class148.aClass282_Sub15_Sub2_1735.method15123(-2016232970);
				if (i_37_ < -609094685 * Class158_Sub2_Sub3.anInt10243 && Class148.aClass282_Sub15_Sub2_1735.method15103(1772482571)) {
					i_37_ += -2027356711 * Class383.anInt4664;
					if (i_37_ > Class158_Sub2_Sub3.anInt10243 * -609094685)
						i_37_ = -609094685 * Class158_Sub2_Sub3.anInt10243;
					Class148.aClass282_Sub15_Sub2_1735.method15144(i_37_, -348021123);
				} else {
					Class383.anInt4664 = 0;
					Class148.anInt1730 = 0;
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			Class148.aClass282_Sub15_Sub2_1735.method15101((short) -2196);
			Class332.method5929(-554410710);
		}
	}
}
