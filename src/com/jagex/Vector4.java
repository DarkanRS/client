package com.jagex;

public class Vector4 {

    public float x;
    public float y;
    public float z;
    public float w;

    public Vector4(float f_1, float f_2, float f_3, float f_4) {
        this.set(f_1, f_2, f_3, f_4);
    }

    public void set(float f_1, float f_2, float f_3, float f_4) {
        this.x = f_1;
        this.y = f_2;
        this.z = f_3;
        this.w = f_4;
    }

    public void copy(Vector4 vector4_1) {
        this.set(vector4_1.x, vector4_1.y, vector4_1.z, vector4_1.w);
    }

    public void fromInt(int i_1) {
        this.set((float) (i_1 >> 16 & 0xff) * 0.003921569F, (float) (i_1 >> 8 & 0xff) * 0.003921569F, (float) (i_1 >> 0 & 0xff) * 0.003921569F, (float) (i_1 >> 24 & 0xff) * 0.003921569F);
    }

    public final void negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
        this.w = -this.w;
    }

    public Vector4() {
        this.reset();
    }

    final void reset() {
        this.w = 0.0F;
        this.z = 0.0F;
        this.y = 0.0F;
        this.x = 0.0F;
    }

    public String toString() {
        return this.x + "," + this.y + "," + this.z + "," + this.w;
    }

    public final void concat(Matrix44Arr matrix44arr_1) {
        float f_2 = this.x;
        float f_3 = this.y;
        float f_4 = this.z;
        float f_5 = this.w;
        this.x = matrix44arr_1.buf[0] * f_2 + matrix44arr_1.buf[4] * f_3 + matrix44arr_1.buf[8] * f_4 + matrix44arr_1.buf[12] * f_5;
        this.y = matrix44arr_1.buf[1] * f_2 + matrix44arr_1.buf[5] * f_3 + matrix44arr_1.buf[9] * f_4 + matrix44arr_1.buf[13] * f_5;
        this.z = matrix44arr_1.buf[2] * f_2 + matrix44arr_1.buf[6] * f_3 + matrix44arr_1.buf[10] * f_4 + matrix44arr_1.buf[14] * f_5;
        this.w = matrix44arr_1.buf[3] * f_2 + matrix44arr_1.buf[7] * f_3 + matrix44arr_1.buf[11] * f_4 + matrix44arr_1.buf[15] * f_5;
    }

    public final void scale(float f_1) {
        this.x *= f_1;
        this.y *= f_1;
        this.z *= f_1;
        this.w *= f_1;
    }

}
