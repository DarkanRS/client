/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class306 {
	static void method3754(int i, int i_0_, int i_1_, int i_2_, int i_3_, Class307 class307, float f, float f_4_, float f_5_, float f_6_, float f_7_, byte[] is, int i_8_) {
		int i_9_ = i_0_ * i_1_;
		float[] fs = new float[i_9_];
		for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
			int i_11_ = i_8_;
			class307.method3757(i, i_0_, i_1_, i_2_, f / (float) i_0_, f_4_ / (float) i_1_, f_5_ / (float) i_2_, f_6_ * 127.0F, fs, 0);
			for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
				is[i_11_] += fs[i_12_];
				i_11_++;
			}
			f *= 2.0F;
			f_4_ *= 2.0F;
			f_5_ *= 2.0F;
			f_6_ *= f_7_;
		}
		int i_13_ = i_8_;
		for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
			is[i_13_] = (byte) (is[i_13_] + 127);
			i_13_++;
		}
	}

	Class306() throws Throwable {
		throw new Error();
	}

	static void method3755(int i, int i_15_, int i_16_, int i_17_, Class307 class307, float f, float f_18_, float f_19_, float f_20_, float f_21_, byte[] is, int i_22_) {
		for (int i_23_ = 0; i_23_ < i_16_; i_23_++) {
			method3754(i_23_, i, i_15_, i_16_, i_17_, class307, f, f_18_, f_19_, f_20_, f_21_, is, i_22_);
			i_22_ += i * i_15_;
		}
	}

	public static byte[] method3756(int i, int i_24_, int i_25_, int i_26_, Class307 class307, float f, float f_27_, float f_28_, float f_29_, float f_30_) {
		byte[] is = new byte[i * i_24_ * i_25_];
		method3755(i, i_24_, i_25_, i_26_, class307, f, f_27_, f_28_, f_29_, f_30_, is, 0);
		return is;
	}
}
