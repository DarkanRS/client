/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77 {
	int[] anIntArray759;
	int[] anIntArray760;
	int[] anIntArray761;
	int[] anIntArray762;
	int[] anIntArray763;
	int[] anIntArray764;
	int[] anIntArray765;

	void method1363(int i, int i_0_) {
		int[][] is = new int[((Class77) this).anIntArray763.length << 1][4];
		for (int i_1_ = 0; i_1_ < ((Class77) this).anIntArray763.length; i_1_++) {
			is[i_1_ * 2][0] = ((Class77) this).anIntArray763[i_1_];
			is[2 * i_1_][1] = ((Class77) this).anIntArray760[i_1_];
			is[2 * i_1_][2] = ((Class77) this).anIntArray762[i_1_];
			is[2 * i_1_][3] = ((Class77) this).anIntArray759[i_1_];
			is[1 + 2 * i_1_][0] = ((Class77) this).anIntArray761[i_1_];
			is[1 + i_1_ * 2][1] = ((Class77) this).anIntArray764[i_1_];
			is[1 + i_1_ * 2][2] = ((Class77) this).anIntArray765[i_1_];
			is[2 * i_1_ + 1][3] = ((Class77) this).anIntArray759[i_1_];
		}
		client.anIntArrayArrayArray7302[i] = is;
	}

	void method1364(int i) {
		int[][] is = new int[((Class77) this).anIntArray763.length << 1][4];
		for (int i_2_ = 0; i_2_ < ((Class77) this).anIntArray763.length; i_2_++) {
			is[i_2_ * 2][0] = ((Class77) this).anIntArray763[i_2_];
			is[2 * i_2_][1] = ((Class77) this).anIntArray760[i_2_];
			is[2 * i_2_][2] = ((Class77) this).anIntArray762[i_2_];
			is[2 * i_2_][3] = ((Class77) this).anIntArray759[i_2_];
			is[1 + 2 * i_2_][0] = ((Class77) this).anIntArray761[i_2_];
			is[1 + i_2_ * 2][1] = ((Class77) this).anIntArray764[i_2_];
			is[1 + i_2_ * 2][2] = ((Class77) this).anIntArray765[i_2_];
			is[2 * i_2_ + 1][3] = ((Class77) this).anIntArray759[i_2_];
		}
		client.anIntArrayArrayArray7302[i] = is;
	}

	Class77(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedSmart(1773086739);
		((Class77) this).anIntArray763 = new int[i];
		((Class77) this).anIntArray760 = new int[i];
		((Class77) this).anIntArray762 = new int[i];
		((Class77) this).anIntArray759 = new int[i];
		((Class77) this).anIntArray761 = new int[i];
		((Class77) this).anIntArray764 = new int[i];
		((Class77) this).anIntArray765 = new int[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			((Class77) this).anIntArray763[i_3_] = class282_sub35.readUnsignedShort() - 5120;
			((Class77) this).anIntArray762[i_3_] = class282_sub35.readUnsignedShort() - 5120;
			((Class77) this).anIntArray760[i_3_] = class282_sub35.readShort(1941897532);
			((Class77) this).anIntArray761[i_3_] = class282_sub35.readUnsignedShort() - 5120;
			((Class77) this).anIntArray765[i_3_] = class282_sub35.readUnsignedShort() - 5120;
			((Class77) this).anIntArray764[i_3_] = class282_sub35.readShort(2115880943);
			((Class77) this).anIntArray759[i_3_] = class282_sub35.readShort(1760163828);
		}
	}

	static void method1365(int i) {
		if (Class540.anIntArray7136 == null) {
			Class540.anIntArray7136 = new int[65536];
			EnumIndexLoader.anIntArray5379 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i_4_ = 0; i_4_ < 65536; i_4_++) {
				double d_5_ = (double) (i_4_ >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_6_ = 0.0625 + (double) (i_4_ >> 7 & 0x7) / 8.0;
				double d_7_ = (double) (i_4_ & 0x7f) / 128.0;
				double d_8_ = d_7_;
				double d_9_ = d_7_;
				double d_10_ = d_7_;
				if (d_6_ != 0.0) {
					double d_11_;
					if (d_7_ < 0.5)
						d_11_ = d_7_ * (d_6_ + 1.0);
					else
						d_11_ = d_6_ + d_7_ - d_7_ * d_6_;
					double d_12_ = d_7_ * 2.0 - d_11_;
					double d_13_ = 0.3333333333333333 + d_5_;
					if (d_13_ > 1.0)
						d_13_--;
					double d_14_ = d_5_;
					double d_15_ = d_5_ - 0.3333333333333333;
					if (d_15_ < 0.0)
						d_15_++;
					if (d_13_ * 6.0 < 1.0)
						d_8_ = d_12_ + (d_11_ - d_12_) * 6.0 * d_13_;
					else if (2.0 * d_13_ < 1.0)
						d_8_ = d_11_;
					else if (3.0 * d_13_ < 2.0)
						d_8_ = d_12_ + 6.0 * ((0.6666666666666666 - d_13_) * (d_11_ - d_12_));
					else
						d_8_ = d_12_;
					if (6.0 * d_14_ < 1.0)
						d_9_ = d_12_ + 6.0 * (d_11_ - d_12_) * d_14_;
					else if (d_14_ * 2.0 < 1.0)
						d_9_ = d_11_;
					else if (3.0 * d_14_ < 2.0)
						d_9_ = 6.0 * ((0.6666666666666666 - d_14_) * (d_11_ - d_12_)) + d_12_;
					else
						d_9_ = d_12_;
					if (d_15_ * 6.0 < 1.0)
						d_10_ = d_15_ * (6.0 * (d_11_ - d_12_)) + d_12_;
					else if (d_15_ * 2.0 < 1.0)
						d_10_ = d_11_;
					else if (d_15_ * 3.0 < 2.0)
						d_10_ = 6.0 * ((0.6666666666666666 - d_15_) * (d_11_ - d_12_)) + d_12_;
					else
						d_10_ = d_12_;
				}
				d_8_ = Math.pow(d_8_, d);
				d_9_ = Math.pow(d_9_, d);
				d_10_ = Math.pow(d_10_, d);
				int i_16_ = (int) (d_8_ * 256.0);
				int i_17_ = (int) (d_9_ * 256.0);
				int i_18_ = (int) (256.0 * d_10_);
				int i_19_ = i_18_ + ((i_17_ << 8) + (i_16_ << 16));
				Class540.anIntArray7136[i_4_] = i_19_ & 0xffffff;
				int i_20_ = (i_18_ << 16) + (i_17_ << 8) + i_16_;
				EnumIndexLoader.anIntArray5379[i_4_] = i_20_;
			}
		}
	}

	static final void method1366(CS2Executor class527, byte i) {
		class527.intStackPtr -= 851346006;
		int i_21_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		if (i_21_ >= 2)
			throw new RuntimeException();
		client.anInt7277 = -158788875 * i_21_;
		int i_22_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		if (1 + i_22_ >= (client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123]).length >> 1)
			throw new RuntimeException();
		client.anInt7279 = i_22_ * -658404745;
		client.anInt7256 = 0;
		client.anInt7327 = 1423548691 * (class527.intStack[2 + (class527.intStackPtr * 1942118537)]);
		client.anInt7182 = 784091025 * (class527.intStack[1942118537 * class527.intStackPtr + 3]);
		int i_23_ = (class527.intStack[4 + 1942118537 * class527.intStackPtr]);
		if (i_23_ >= 2)
			throw new RuntimeException();
		client.anInt7448 = i_23_ * 1044733407;
		int i_24_ = (class527.intStack[class527.intStackPtr * 1942118537 + 5]);
		if (i_24_ + 1 >= (client.anIntArrayArrayArray7302[-74015201 * client.anInt7448]).length >> 1)
			throw new RuntimeException();
		client.anInt7280 = 1872958459 * i_24_;
		NativeLibraryLoader.anInt3240 = 1155732519;
		Class86.anInt833 = -1509271845;
		Class508.anInt5864 = 987778595;
	}

	static final void method1367(CS2Executor class527, short i) {
		int i_25_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (i_25_ < 0)
			i_25_ = 0;
		client.anInt7271 = 1364289201 * (-240868135 * client.anInt7270 + i_25_);
	}

	public static Class217_Sub1 method1368(int i) {
		if (Class448.anInt5427 * -1600221303 < Class448.aClass217_Sub1Array5426.length)
			return (Class448.aClass217_Sub1Array5426[(Class448.anInt5427 += -1227843911) * -1600221303 - 1]);
		return null;
	}

	public static void method1369(AnimationIndexLoader class523, int i) {
		NamedFileReference.aClass523_411 = class523;
	}

	static final void method1370(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloat7365 >> 3;
	}
}
