
/* Class261_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class261_Sub1 extends Class261 {
	int[] anIntArray8042 = new int[512];
	static float[][] aFloatArrayArray8043 = { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	static final float method13368(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method13369(float f, float f_0_, float f_1_) {
		return f + (f_0_ - f) * f_1_;
	}

	static final float method13370(int i, float f, float f_2_, float f_3_) {
		float[] fs = aFloatArrayArray8043[i];
		return fs[0] * f + fs[1] * f_2_ + fs[2] * f_3_;
	}

	public Class261_Sub1(int i) {
		Random random = new Random((long) i);
		for (int i_4_ = 0; i_4_ < 256; i_4_++)
			((Class261_Sub1) this).anIntArray8042[i_4_] = ((Class261_Sub1) this).anIntArray8042[i_4_ + 256] = i_4_;
		for (int i_5_ = 0; i_5_ < 256; i_5_++) {
			int i_6_ = random.nextInt() & 0xff;
			int i_7_ = ((Class261_Sub1) this).anIntArray8042[i_6_];
			((Class261_Sub1) this).anIntArray8042[i_6_] = ((Class261_Sub1) this).anIntArray8042[i_6_ + 256] = ((Class261_Sub1) this).anIntArray8042[i_5_];
			((Class261_Sub1) this).anIntArray8042[i_5_] = ((Class261_Sub1) this).anIntArray8042[i_5_ + 256] = i_7_;
		}
	}

	void method4634(int i, int i_8_, int i_9_, int i_10_, float f, float f_11_, float f_12_, float f_13_, float[] fs, int i_14_) {
		int i_15_ = (int) ((float) i_8_ * f - 1.0F);
		i_15_ &= 0xff;
		int i_16_ = (int) ((float) i_9_ * f_11_ - 1.0F);
		i_16_ &= 0xff;
		int i_17_ = (int) ((float) i_10_ * f_12_ - 1.0F);
		i_17_ &= 0xff;
		float f_18_ = (float) i * f_12_;
		int i_19_ = (int) f_18_;
		int i_20_ = i_19_ + 1;
		float f_21_ = f_18_ - (float) i_19_;
		float f_22_ = 1.0F - f_21_;
		float f_23_ = method13372(f_21_);
		i_19_ &= i_17_;
		i_20_ &= i_17_;
		int i_24_ = ((Class261_Sub1) this).anIntArray8042[i_19_];
		int i_25_ = ((Class261_Sub1) this).anIntArray8042[i_20_];
		for (int i_26_ = 0; i_26_ < i_9_; i_26_++) {
			float f_27_ = (float) i_26_ * f_11_;
			int i_28_ = (int) f_27_;
			int i_29_ = i_28_ + 1;
			float f_30_ = f_27_ - (float) i_28_;
			float f_31_ = 1.0F - f_30_;
			float f_32_ = method13372(f_30_);
			i_28_ &= i_16_;
			i_29_ &= i_16_;
			int i_33_ = ((Class261_Sub1) this).anIntArray8042[i_28_ + i_24_];
			int i_34_ = ((Class261_Sub1) this).anIntArray8042[i_29_ + i_24_];
			int i_35_ = ((Class261_Sub1) this).anIntArray8042[i_28_ + i_25_];
			int i_36_ = ((Class261_Sub1) this).anIntArray8042[i_29_ + i_25_];
			for (int i_37_ = 0; i_37_ < i_8_; i_37_++) {
				float f_38_ = (float) i_37_ * f;
				int i_39_ = (int) f_38_;
				int i_40_ = i_39_ + 1;
				float f_41_ = f_38_ - (float) i_39_;
				float f_42_ = 1.0F - f_41_;
				float f_43_ = method13372(f_41_);
				i_39_ &= i_15_;
				i_40_ &= i_15_;
				fs[i_14_++] = (f_13_ * (method13369((method13369(method13369(method13370((((Class261_Sub1) this).anIntArray8042[i_39_ + i_33_]) & 0x7, f_42_, f_31_, f_22_), method13370((((Class261_Sub1) this).anIntArray8042[i_40_ + i_33_]) & 0x7, f_41_, f_31_, f_22_), f_43_), method13369(method13370((((Class261_Sub1) this).anIntArray8042[i_39_ + i_34_]) & 0x7, f_42_, f_30_, f_22_), method13370((((Class261_Sub1) this).anIntArray8042[i_40_ + i_34_]) & 0x7, f_41_, f_30_, f_22_), f_43_), f_32_)),
						(method13369(method13369(method13370((((Class261_Sub1) this).anIntArray8042[i_39_ + i_35_]) & 0x7, f_42_, f_31_, f_21_), method13370((((Class261_Sub1) this).anIntArray8042[i_40_ + i_35_]) & 0x7, f_41_, f_31_, f_21_), f_43_), method13369(method13370((((Class261_Sub1) this).anIntArray8042[i_39_ + i_36_]) & 0x7, f_42_, f_30_, f_21_), method13370((((Class261_Sub1) this).anIntArray8042[i_40_ + i_36_]) & 0x7, f_41_, f_30_, f_21_), f_43_), f_32_)), f_23_)));
			}
		}
	}

	static final float method13371(float f, float f_44_, float f_45_) {
		return f + (f_44_ - f) * f_45_;
	}

	static final float method13372(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method13373(int i, float f, float f_46_, float f_47_) {
		float[] fs = aFloatArrayArray8043[i];
		return fs[0] * f + fs[1] * f_46_ + fs[2] * f_47_;
	}
}
