package com.jagex;

public class Quaternion {

    static Quaternion[] aClass381Array4641 = new Quaternion[0];
    static int anInt4639;
    static int anInt4638;

    static {
        new Quaternion();
    }

    float i;
    float j;
    float k;
    float scalar;

    public Quaternion() {
        reset();
    }

    Quaternion(float f_1, float f_2, float f_3) {
        set(f_1, f_2, f_3, 0.0f);
    }

    Quaternion(Quaternion quaternion_1) {
        copy(quaternion_1);
    }

    public static Quaternion create() {
        Quaternion[] arr_0 = aClass381Array4641;
        synchronized (aClass381Array4641) {
            Quaternion quaternion_1;
            if (anInt4639 == 0) {
                quaternion_1 = new Quaternion();
            } else {
                aClass381Array4641[--anInt4639].reset();
                quaternion_1 = aClass381Array4641[anInt4639];
            }
            return quaternion_1;
        }
    }

    static Quaternion method6457(Quaternion quaternion_0) {
        Quaternion[] arr_1 = aClass381Array4641;
        synchronized (aClass381Array4641) {
            Quaternion quaternion_2;
            if (anInt4639 == 0) {
                quaternion_2 = new Quaternion(quaternion_0);
            } else {
                aClass381Array4641[--anInt4639].copy(quaternion_0);
                quaternion_2 = aClass381Array4641[anInt4639];
            }
            return quaternion_2;
        }
    }

    static Quaternion method6465(Quaternion quaternion_0) {
        Quaternion quaternion_1 = method6457(quaternion_0);
        quaternion_1.negate();
        return quaternion_1;
    }

    static Quaternion method6485(float f_0, float f_1, float f_2) {
        Quaternion[] arr_4 = aClass381Array4641;
        synchronized (aClass381Array4641) {
            Quaternion quaternion_5;
            if (anInt4639 == 0) {
                quaternion_5 = new Quaternion(f_0, f_1, f_2);
            } else {
                aClass381Array4641[--anInt4639].set(f_0, f_1, f_2, (float) 0.0);
                quaternion_5 = aClass381Array4641[anInt4639];
            }
            return quaternion_5;
        }
    }

    public static void method6493() {
        anInt4638 = 10;
        aClass381Array4641 = new Quaternion[10];
        anInt4639 = 0;
    }

    static Quaternion method6497(Quaternion quaternion_0, Quaternion quaternion_1) {
        Quaternion quaternion_2 = method6457(quaternion_0);
        quaternion_2.multiply(quaternion_1);
        return quaternion_2;
    }

    void set(float f_1, float f_2, float f_3, float f_4) {
        i = f_1;
        j = f_2;
        k = f_3;
        scalar = f_4;
    }

    public void angle(float f_1, float f_2, float f_3, float f_4) {
        float f_5 = (float) StrictMath.sin(f_4 * 0.5F);
        float f_6 = (float) StrictMath.cos(f_4 * 0.5F);
        i = f_1 * f_5;
        j = f_2 * f_5;
        k = f_3 * f_5;
        scalar = f_6;
    }

    void reset() {
        k = 0.0F;
        j = 0.0F;
        i = 0.0F;
        scalar = 1.0F;
    }

    void negate() {
        i = -i;
        j = -j;
        k = -k;
    }

    public void multiply(Quaternion quaternion_1) {
        set(quaternion_1.scalar * i + quaternion_1.i * scalar + quaternion_1.j * k - quaternion_1.k * j, quaternion_1.scalar * j - quaternion_1.i * k + quaternion_1.j * scalar + quaternion_1.k * i, quaternion_1.scalar * k + quaternion_1.i * j - quaternion_1.j * i + quaternion_1.k * scalar, quaternion_1.scalar * scalar - quaternion_1.i * i - quaternion_1.j * j - quaternion_1.k * k);
    }

    public String toString() {
        return i + "," + j + "," + k + "," + scalar;
    }

    public void cache() {
        Quaternion[] arr_1 = aClass381Array4641;
        synchronized (aClass381Array4641) {
            if (anInt4639 < anInt4638 - 1) {
                aClass381Array4641[anInt4639++] = this;
            }

        }
    }

    public void romYawPitchRoll(float f_1, float f_2, float f_3) {
        angle(0.0F, 1.0F, 0.0F, f_1);
        Quaternion quaternion_4 = create();
        quaternion_4.angle(1.0F, 0.0F, 0.0F, f_2);
        multiply(quaternion_4);
        quaternion_4.angle(0.0F, 0.0F, 1.0F, f_3);
        multiply(quaternion_4);
        quaternion_4.cache();
    }

    public void copy(Quaternion quaternion_1) {
        i = quaternion_1.i;
        j = quaternion_1.j;
        k = quaternion_1.k;
        scalar = quaternion_1.scalar;
    }

}
