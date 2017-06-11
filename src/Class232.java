/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class232 {
	public float aFloat2590;
	public float aFloat2591;
	public float aFloat2592;
	public float aFloat2593;

	public Class232(float f, float f_0_, float f_1_, float f_2_) {
		method2135(f, f_0_, f_1_, f_2_);
	}

	public void method2135(float f, float f_3_, float f_4_, float f_5_) {
		aFloat2593 = f;
		aFloat2592 = f_3_;
		aFloat2590 = f_4_;
		aFloat2591 = f_5_;
	}

	public void method2136(int i) {
		method2135((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void method2137() {
		aFloat2593 = -aFloat2593;
		aFloat2592 = -aFloat2592;
		aFloat2590 = -aFloat2590;
		aFloat2591 = -aFloat2591;
	}

	public final void method2138(Matrix4f class233) {
		float f = aFloat2593;
		float f_6_ = aFloat2592;
		float f_7_ = aFloat2590;
		float f_8_ = aFloat2591;
		aFloat2593 = (class233.aFloatArray2594[0] * f + class233.aFloatArray2594[4] * f_6_ + class233.aFloatArray2594[8] * f_7_ + class233.aFloatArray2594[12] * f_8_);
		aFloat2592 = (class233.aFloatArray2594[1] * f + class233.aFloatArray2594[5] * f_6_ + class233.aFloatArray2594[9] * f_7_ + class233.aFloatArray2594[13] * f_8_);
		aFloat2590 = (class233.aFloatArray2594[2] * f + class233.aFloatArray2594[6] * f_6_ + class233.aFloatArray2594[10] * f_7_ + class233.aFloatArray2594[14] * f_8_);
		aFloat2591 = (class233.aFloatArray2594[3] * f + class233.aFloatArray2594[7] * f_6_ + class233.aFloatArray2594[11] * f_7_ + class233.aFloatArray2594[15] * f_8_);
	}

	public Class232() {
		method2141();
	}

	public final void method2139(float f) {
		aFloat2593 *= f;
		aFloat2592 *= f;
		aFloat2590 *= f;
		aFloat2591 *= f;
	}

	public void method2140(Class232 class232_9_) {
		method2135(class232_9_.aFloat2593, class232_9_.aFloat2592, class232_9_.aFloat2590, class232_9_.aFloat2591);
	}

	final void method2141() {
		aFloat2591 = 0.0F;
		aFloat2590 = 0.0F;
		aFloat2592 = 0.0F;
		aFloat2593 = 0.0F;
	}
}
