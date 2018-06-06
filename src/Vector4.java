/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Vector4 {
	public float z;
	public float y;
	public float w;
	public float x;

	public Vector4(float f, float f_0_, float f_1_, float f_2_) {
		set(f, f_0_, f_1_, f_2_);
	}

	public void set(float f, float f_3_, float f_4_, float f_5_) {
		x = f;
		y = f_3_;
		z = f_4_;
		w = f_5_;
	}

	public void copy(Vector4 class303_6_) {
		set(class303_6_.x, class303_6_.y, class303_6_.z, class303_6_.w);
	}

	public void fromInt(int i) {
		set((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void negate() {
		x = -x;
		y = -y;
		z = -z;
		w = -w;
	}

	public Vector4() {
		reset();
	}

	final void reset() {
		w = 0.0F;
		z = 0.0F;
		y = 0.0F;
		x = 0.0F;
	}

	public String toString() {
		return new StringBuilder().append(x).append(",").append(y).append(",").append(z).append(",").append(w).toString();
	}

	public final void concat(Matrix44Arr matrix) {
		float f = x;
		float f_19_ = y;
		float f_20_ = z;
		float f_21_ = w;
		x = (matrix.buf[0] * f + matrix.buf[4] * f_19_ + matrix.buf[8] * f_20_ + matrix.buf[12] * f_21_);
		y = (matrix.buf[1] * f + matrix.buf[5] * f_19_ + matrix.buf[9] * f_20_ + matrix.buf[13] * f_21_);
		z = (matrix.buf[2] * f + matrix.buf[6] * f_19_ + matrix.buf[10] * f_20_ + matrix.buf[14] * f_21_);
		w = (matrix.buf[3] * f + matrix.buf[7] * f_19_ + matrix.buf[11] * f_20_ + matrix.buf[15] * f_21_);
	}

	public final void scale(float f) {
		x *= f;
		y *= f;
		z *= f;
		w *= f;
	}
}
