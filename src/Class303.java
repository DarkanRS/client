/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class303 {
	public float aFloat3565;
	public float aFloat3566;
	public float aFloat3567;
	public float aFloat3568;

	public final void method5365(float f) {
		aFloat3568 *= f;
		aFloat3566 *= f;
		aFloat3565 *= f;
		aFloat3567 *= f;
	}

	public Class303(float f, float f_0_, float f_1_, float f_2_) {
		method5366(f, f_0_, f_1_, f_2_);
	}

	public void method5366(float f, float f_3_, float f_4_, float f_5_) {
		aFloat3568 = f;
		aFloat3566 = f_3_;
		aFloat3565 = f_4_;
		aFloat3567 = f_5_;
	}

	public void method5367(Class303 class303_6_) {
		method5366(class303_6_.aFloat3568, class303_6_.aFloat3566, class303_6_.aFloat3565, class303_6_.aFloat3567);
	}

	public void method5368(int i) {
		method5366((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void method5369(Class384 class384) {
		float f = aFloat3568;
		float f_7_ = aFloat3566;
		float f_8_ = aFloat3565;
		float f_9_ = aFloat3567;
		aFloat3568 = (class384.aFloatArray4667[0] * f + class384.aFloatArray4667[4] * f_7_ + class384.aFloatArray4667[8] * f_8_ + class384.aFloatArray4667[12] * f_9_);
		aFloat3566 = (class384.aFloatArray4667[1] * f + class384.aFloatArray4667[5] * f_7_ + class384.aFloatArray4667[9] * f_8_ + class384.aFloatArray4667[13] * f_9_);
		aFloat3565 = (class384.aFloatArray4667[2] * f + class384.aFloatArray4667[6] * f_7_ + class384.aFloatArray4667[10] * f_8_ + class384.aFloatArray4667[14] * f_9_);
		aFloat3567 = (class384.aFloatArray4667[3] * f + class384.aFloatArray4667[7] * f_7_ + class384.aFloatArray4667[11] * f_8_ + class384.aFloatArray4667[15] * f_9_);
	}

	public final void method5370() {
		aFloat3568 = -aFloat3568;
		aFloat3566 = -aFloat3566;
		aFloat3565 = -aFloat3565;
		aFloat3567 = -aFloat3567;
	}

	public Class303() {
		method5371();
	}

	final void method5371() {
		aFloat3567 = 0.0F;
		aFloat3565 = 0.0F;
		aFloat3566 = 0.0F;
		aFloat3568 = 0.0F;
	}

	public String toString() {
		return new StringBuilder().append(aFloat3568).append(",").append(aFloat3566).append(",").append(aFloat3565).append(",").append(aFloat3567).toString();
	}

	public String method5372() {
		return new StringBuilder().append(aFloat3568).append(",").append(aFloat3566).append(",").append(aFloat3565).append(",").append(aFloat3567).toString();
	}

	public final void method5373() {
		aFloat3568 = -aFloat3568;
		aFloat3566 = -aFloat3566;
		aFloat3565 = -aFloat3565;
		aFloat3567 = -aFloat3567;
	}

	public void method5374(float f, float f_10_, float f_11_, float f_12_) {
		aFloat3568 = f;
		aFloat3566 = f_10_;
		aFloat3565 = f_11_;
		aFloat3567 = f_12_;
	}

	public void method5375(float f, float f_13_, float f_14_, float f_15_) {
		aFloat3568 = f;
		aFloat3566 = f_13_;
		aFloat3565 = f_14_;
		aFloat3567 = f_15_;
	}

	public void method5376(float f, float f_16_, float f_17_, float f_18_) {
		aFloat3568 = f;
		aFloat3566 = f_16_;
		aFloat3565 = f_17_;
		aFloat3567 = f_18_;
	}

	public final void method5377(Class384 class384) {
		float f = aFloat3568;
		float f_19_ = aFloat3566;
		float f_20_ = aFloat3565;
		float f_21_ = aFloat3567;
		aFloat3568 = (class384.aFloatArray4667[0] * f + class384.aFloatArray4667[4] * f_19_ + class384.aFloatArray4667[8] * f_20_ + class384.aFloatArray4667[12] * f_21_);
		aFloat3566 = (class384.aFloatArray4667[1] * f + class384.aFloatArray4667[5] * f_19_ + class384.aFloatArray4667[9] * f_20_ + class384.aFloatArray4667[13] * f_21_);
		aFloat3565 = (class384.aFloatArray4667[2] * f + class384.aFloatArray4667[6] * f_19_ + class384.aFloatArray4667[10] * f_20_ + class384.aFloatArray4667[14] * f_21_);
		aFloat3567 = (class384.aFloatArray4667[3] * f + class384.aFloatArray4667[7] * f_19_ + class384.aFloatArray4667[11] * f_20_ + class384.aFloatArray4667[15] * f_21_);
	}

	public void method5378(Class303 class303_22_) {
		method5366(class303_22_.aFloat3568, class303_22_.aFloat3566, class303_22_.aFloat3565, class303_22_.aFloat3567);
	}

	final void method5379() {
		aFloat3567 = 0.0F;
		aFloat3565 = 0.0F;
		aFloat3566 = 0.0F;
		aFloat3568 = 0.0F;
	}

	public void method5380(int i) {
		method5366((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public void method5381(int i) {
		method5366((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public void method5382(float f, float f_23_, float f_24_, float f_25_) {
		aFloat3568 = f;
		aFloat3566 = f_23_;
		aFloat3565 = f_24_;
		aFloat3567 = f_25_;
	}

	public void method5383(Class303 class303_26_) {
		method5366(class303_26_.aFloat3568, class303_26_.aFloat3566, class303_26_.aFloat3565, class303_26_.aFloat3567);
	}

	final void method5384() {
		aFloat3567 = 0.0F;
		aFloat3565 = 0.0F;
		aFloat3566 = 0.0F;
		aFloat3568 = 0.0F;
	}

	final void method5385() {
		aFloat3567 = 0.0F;
		aFloat3565 = 0.0F;
		aFloat3566 = 0.0F;
		aFloat3568 = 0.0F;
	}

	public String method5386() {
		return new StringBuilder().append(aFloat3568).append(",").append(aFloat3566).append(",").append(aFloat3565).append(",").append(aFloat3567).toString();
	}

	public final void method5387(float f) {
		aFloat3568 *= f;
		aFloat3566 *= f;
		aFloat3565 *= f;
		aFloat3567 *= f;
	}

	public final void method5388() {
		aFloat3568 = -aFloat3568;
		aFloat3566 = -aFloat3566;
		aFloat3565 = -aFloat3565;
		aFloat3567 = -aFloat3567;
	}

	public final void method5389(float f) {
		aFloat3568 *= f;
		aFloat3566 *= f;
		aFloat3565 *= f;
		aFloat3567 *= f;
	}

	public void method5390(int i) {
		method5366((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void method5391(float f) {
		aFloat3568 *= f;
		aFloat3566 *= f;
		aFloat3565 *= f;
		aFloat3567 *= f;
	}

	final void method5392() {
		aFloat3567 = 0.0F;
		aFloat3565 = 0.0F;
		aFloat3566 = 0.0F;
		aFloat3568 = 0.0F;
	}

	public final void method5393(Class384 class384) {
		float f = aFloat3568;
		float f_27_ = aFloat3566;
		float f_28_ = aFloat3565;
		float f_29_ = aFloat3567;
		aFloat3568 = (class384.aFloatArray4667[0] * f + class384.aFloatArray4667[4] * f_27_ + class384.aFloatArray4667[8] * f_28_ + class384.aFloatArray4667[12] * f_29_);
		aFloat3566 = (class384.aFloatArray4667[1] * f + class384.aFloatArray4667[5] * f_27_ + class384.aFloatArray4667[9] * f_28_ + class384.aFloatArray4667[13] * f_29_);
		aFloat3565 = (class384.aFloatArray4667[2] * f + class384.aFloatArray4667[6] * f_27_ + class384.aFloatArray4667[10] * f_28_ + class384.aFloatArray4667[14] * f_29_);
		aFloat3567 = (class384.aFloatArray4667[3] * f + class384.aFloatArray4667[7] * f_27_ + class384.aFloatArray4667[11] * f_28_ + class384.aFloatArray4667[15] * f_29_);
	}

	public final void method5394(Class384 class384) {
		float f = aFloat3568;
		float f_30_ = aFloat3566;
		float f_31_ = aFloat3565;
		float f_32_ = aFloat3567;
		aFloat3568 = (class384.aFloatArray4667[0] * f + class384.aFloatArray4667[4] * f_30_ + class384.aFloatArray4667[8] * f_31_ + class384.aFloatArray4667[12] * f_32_);
		aFloat3566 = (class384.aFloatArray4667[1] * f + class384.aFloatArray4667[5] * f_30_ + class384.aFloatArray4667[9] * f_31_ + class384.aFloatArray4667[13] * f_32_);
		aFloat3565 = (class384.aFloatArray4667[2] * f + class384.aFloatArray4667[6] * f_30_ + class384.aFloatArray4667[10] * f_31_ + class384.aFloatArray4667[14] * f_32_);
		aFloat3567 = (class384.aFloatArray4667[3] * f + class384.aFloatArray4667[7] * f_30_ + class384.aFloatArray4667[11] * f_31_ + class384.aFloatArray4667[15] * f_32_);
	}
}
