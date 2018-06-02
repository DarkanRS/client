/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4 {
	boolean aBool29;
	int anInt30;
	int anInt31;
	int anInt32;
	boolean aBool33;
	public static int anInt34;
	public static int anInt35;

	Class4() {
		/* empty */
	}

	static float method288(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, int i_5_) {
		float f_6_ = 0.0F;
		float f_7_ = f_2_ - f;
		float f_8_ = f_3_ - f_0_;
		float f_9_ = f_4_ - f_1_;
		float f_10_ = 0.0F;
		float f_11_ = 0.0F;
		float f_12_ = 0.0F;
		SceneObjectManager class206 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-956350211);
		for (/**/; f_6_ < 1.1F; f_6_ += 0.1F) {
			float f_13_ = f_6_ * f_7_ + f;
			float f_14_ = f_8_ * f_6_ + f_0_;
			float f_15_ = f_1_ + f_6_ * f_9_;
			int i_16_ = (int) f_13_ >> 9;
			int i_17_ = (int) f_15_ >> 9;
			if (i_16_ > 0 && i_17_ > 0 && i_16_ < IndexLoaders.MAP_REGION_DECODER.method4424(-964294290) && i_17_ < IndexLoaders.MAP_REGION_DECODER.method4451(-1282893956)) {
				int i_18_ = Class84.myPlayer.aByte7967;
				if (i_18_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_16_][i_17_]) & 0x2) != 0)
					i_18_++;
				int i_19_ = class206.aClass390Array2607[i_18_].method6709((int) f_13_, (int) f_15_, 1453959191);
				if ((float) i_19_ < f_14_) {
					if (i >= 2)
						return (f_6_ - 0.1F + method288(f_10_, f_11_, f_12_, f_13_, f_14_, f_15_, i - 1, -1906772657) * 0.1F);
					return f_6_;
				}
			}
			f_10_ = f_13_;
			f_11_ = f_14_;
			f_12_ = f_15_;
		}
		return -1.0F;
	}

	static final void method289(CS2Executor class527, byte i) {
		int i_20_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_20_, (byte) 125);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}

	static final void method290(CS2Executor class527, byte i) {
		int i_21_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_21_, 174714290);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 781329827 * class220.anInt2718;
	}

	static final void method291(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_22_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_23_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.aClass331_3535.method5918(i_22_, -1111901377).aCharArray9745[i_23_]);
	}

	static final void method292(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub27_8208.method12952((byte) 83) == 2 ? 1 : 0;
	}
}
