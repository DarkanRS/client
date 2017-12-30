
/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;

public class Class371 {
	public static final int anInt4292 = 18;
	public static final int anInt4293 = 14;
	public static final int anInt4294 = 17;
	public static final int anInt4295 = 15;
	public static final int anInt4296 = 8;
	public static final int anInt4297 = 22;
	public static final int anInt4298 = 23;
	public static final int anInt4299 = 34;
	public static final int anInt4300 = 20;
	public static final int anInt4301 = 33;
	public static final int anInt4302 = 6;
	public static final int anInt4303 = 2;
	public static final int anInt4304 = 25;
	public static final int anInt4305 = 11;
	public static final int anInt4306 = 31;
	public static final int anInt4307 = 21;
	public static final int anInt4308 = 10;
	public static final int anInt4309 = 1;
	public static final int anInt4310 = 26;
	public static final int anInt4311 = 4;
	public static final int anInt4312 = 28;
	public static final int anInt4313 = 32;
	public static final int anInt4314 = 27;
	public static final int anInt4315 = 24;
	public static final int anInt4316 = 9;
	public static final int anInt4317 = 29;
	public static final int anInt4318 = 12;
	public static final int anInt4319 = 16;
	public static final int anInt4320 = 35;
	public static final int anInt4321 = 5;
	public static final int anInt4322 = 3;
	public static final int anInt4323 = 30;
	public static final int anInt4324 = 13;
	public static final int anInt4325 = 7;
	public static Class317 aClass317_4326;

	Class371() throws Throwable {
		throw new Error();
	}

	static final int method6347(int i, int i_0_, int i_1_, int i_2_) {
		if (i_0_ == i)
			return i;
		int i_3_ = 128 - i_1_;
		int i_4_ = i_1_ * (i_0_ & 0x7f) + (i & 0x7f) * i_3_ >> 7;
		int i_5_ = (i & 0x380) * i_3_ + (i_0_ & 0x380) * i_1_ >> 7;
		int i_6_ = i_3_ * (i & 0xfc00) + i_1_ * (i_0_ & 0xfc00) >> 7;
		return i_6_ & 0xfc00 | i_5_ & 0x380 | i_4_ & 0x7f;
	}

	public static final int method6348(int i, int i_7_, int i_8_, int i_9_) {
		if (i_8_ > 243)
			i_7_ >>= 4;
		else if (i_8_ > 217)
			i_7_ >>= 3;
		else if (i_8_ > 192)
			i_7_ >>= 2;
		else if (i_8_ > 179)
			i_7_ >>= 1;
		return (i_8_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_7_ >> 5 << 7));
	}

	public static int method6349(int i, int i_10_, int i_11_) {
		int i_12_ = i >>> 31;
		return (i_12_ + i) / i_10_ - i_12_;
	}

	static final void method6350(CS2Executor class527, byte i) {
		boolean bool = false;
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Object object = Class361.aClass361_4172.method6254(new Object[] { string }, (byte) -29);
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static void method6351(int i) {
		if (null == Class335.anIntArray3916)
			Class335.anIntArray3916 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < 512; i_14_++) {
			float f = 360.0F * ((float) (i_14_ >> 3) / 64.0F + 0.0078125F);
			float f_15_ = (float) (i_14_ & 0x7) / 8.0F + 0.0625F;
			for (int i_16_ = 0; i_16_ < 128; i_16_++) {
				float f_17_ = (float) i_16_ / 128.0F;
				float f_18_ = 0.0F;
				float f_19_ = 0.0F;
				float f_20_ = 0.0F;
				float f_21_ = f / 60.0F;
				int i_22_ = (int) f_21_;
				int i_23_ = i_22_ % 6;
				float f_24_ = f_21_ - (float) i_22_;
				float f_25_ = f_17_ * (1.0F - f_15_);
				float f_26_ = f_17_ * (1.0F - f_15_ * f_24_);
				float f_27_ = (1.0F - f_15_ * (1.0F - f_24_)) * f_17_;
				if (0 == i_23_) {
					f_18_ = f_17_;
					f_19_ = f_27_;
					f_20_ = f_25_;
				} else if (i_23_ == 1) {
					f_18_ = f_26_;
					f_19_ = f_17_;
					f_20_ = f_25_;
				} else if (2 == i_23_) {
					f_18_ = f_25_;
					f_19_ = f_17_;
					f_20_ = f_27_;
				} else if (i_23_ == 3) {
					f_18_ = f_25_;
					f_19_ = f_26_;
					f_20_ = f_17_;
				} else if (i_23_ == 4) {
					f_18_ = f_27_;
					f_19_ = f_25_;
					f_20_ = f_17_;
				} else if (5 == i_23_) {
					f_18_ = f_17_;
					f_19_ = f_25_;
					f_20_ = f_26_;
				}
				f_18_ = (float) Math.pow((double) f_18_, d);
				f_19_ = (float) Math.pow((double) f_19_, d);
				f_20_ = (float) Math.pow((double) f_20_, d);
				int i_28_ = (int) (f_18_ * 256.0F);
				int i_29_ = (int) (256.0F * f_19_);
				int i_30_ = (int) (256.0F * f_20_);
				int i_31_ = -16777216 + (i_28_ << 16) + (i_29_ << 8) + i_30_;
				Class335.anIntArray3916[i_13_++] = i_31_;
			}
		}
	}

	public static Class225 method6352(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		Class224.aClass225_Sub6_2774.anInt2779 = i * -726719813;
		Class224.aClass225_Sub6_2774.anInt2780 = 1767388707 * i_32_;
		Class224.aClass225_Sub6_2774.anInt2781 = i_33_ * -12808295;
		Class224.aClass225_Sub6_2774.anInt2782 = i_34_ * 1709796035;
		return Class224.aClass225_Sub6_2774;
	}

	public static final void method6353(short i) {
		Class184 class184 = Class468_Sub20.method12807(2071524191);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4598, class184.aClass432_2283, -585449353);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
		class184.method3049(class282_sub23, 963665082);
	}

	public static Container method6354(byte i) {
		if (null != Class263.aFrame3260)
			return Class263.aFrame3260;
		if (null != Class263.aFrame3261)
			return Class263.aFrame3261;
		return Class282_Sub44.anApplet8065;
	}
}
