package com.jagex;

public class Class370_Sub1 extends Class370 {

    byte[] aByteArray7752;
    int anInt7750;
    int anInt7749;
    int anInt7751;
    int anInt7747;
    int anInt7746;
    int anInt7748;
    int anInt7753;
    int anInt7754;

    void method6337(int i_1, int i_2) {
        if (i_1 != 0) {
            this.anInt7750 = this.anInt7749 * this.anInt7748 >> 12;
            if (this.anInt7750 < 0) {
                this.anInt7750 = 0;
            } else if (this.anInt7750 > 4096) {
                this.anInt7750 = 4096;
            }

            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7749 = this.anInt7749 * this.anInt7750 >> 12;
            this.anInt7751 += this.anInt7749 * this.anInt7747 >> 12;
            this.anInt7747 = this.anInt7747 * this.anInt7754 >> 12;
        } else {
            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7750 = 4096;
            this.anInt7751 = this.anInt7749;
        }

    }

    void method12508(int i_1, byte b_2) {
        this.aByteArray7752[i_1] = b_2;
    }

    void method6321() {
        this.anInt7747 = this.anInt7754;
        this.anInt7751 >>= 4;
        if (this.anInt7751 < 0) {
            this.anInt7751 = 0;
        } else if (this.anInt7751 > 255) {
            this.anInt7751 = 255;
        }

        this.method12508(this.anInt7746++, (byte) this.anInt7751);
        this.anInt7751 = 0;
    }

    void method6327(int i_1, int i_2) {
        if (i_1 != 0) {
            this.anInt7750 = this.anInt7749 * this.anInt7748 >> 12;
            if (this.anInt7750 < 0) {
                this.anInt7750 = 0;
            } else if (this.anInt7750 > 4096) {
                this.anInt7750 = 4096;
            }

            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7749 = this.anInt7749 * this.anInt7750 >> 12;
            this.anInt7751 += this.anInt7749 * this.anInt7747 >> 12;
            this.anInt7747 = this.anInt7747 * this.anInt7754 >> 12;
        } else {
            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7750 = 4096;
            this.anInt7751 = this.anInt7749;
        }

    }

    Class370_Sub1() {
        super(8, 8, 8);
        this.anInt7748 = (int) ((float) 3.0 * 4096.0F);
        this.anInt7753 = (int) ((float) 0.55 * 4096.0F);
        this.anInt7747 = this.anInt7754 = (int) (Math.pow(0.5D, -(float) 0.1) * 4096.0D);
    }

    void method6330() {
        this.anInt7746 = 0;
        this.anInt7751 = 0;
    }

    void method6331() {
        this.anInt7746 = 0;
        this.anInt7751 = 0;
    }

    void method6344() {
        this.anInt7747 = this.anInt7754;
        this.anInt7751 >>= 4;
        if (this.anInt7751 < 0) {
            this.anInt7751 = 0;
        } else if (this.anInt7751 > 255) {
            this.anInt7751 = 255;
        }

        this.method12508(this.anInt7746++, (byte) this.anInt7751);
        this.anInt7751 = 0;
    }

    void method6333(int i_1, int i_2) {
        if (i_1 != 0) {
            this.anInt7750 = this.anInt7749 * this.anInt7748 >> 12;
            if (this.anInt7750 < 0) {
                this.anInt7750 = 0;
            } else if (this.anInt7750 > 4096) {
                this.anInt7750 = 4096;
            }

            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7749 = this.anInt7749 * this.anInt7750 >> 12;
            this.anInt7751 += this.anInt7749 * this.anInt7747 >> 12;
            this.anInt7747 = this.anInt7747 * this.anInt7754 >> 12;
        } else {
            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7750 = 4096;
            this.anInt7751 = this.anInt7749;
        }

    }

    void method6334(int i_1, int i_2) {
        if (i_1 != 0) {
            this.anInt7750 = this.anInt7749 * this.anInt7748 >> 12;
            if (this.anInt7750 < 0) {
                this.anInt7750 = 0;
            } else if (this.anInt7750 > 4096) {
                this.anInt7750 = 4096;
            }

            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7749 = this.anInt7749 * this.anInt7750 >> 12;
            this.anInt7751 += this.anInt7749 * this.anInt7747 >> 12;
            this.anInt7747 = this.anInt7747 * this.anInt7754 >> 12;
        } else {
            this.anInt7749 = this.anInt7753 - (i_2 < 0 ? -i_2 : i_2);
            this.anInt7749 = this.anInt7749 * this.anInt7749 >> 12;
            this.anInt7750 = 4096;
            this.anInt7751 = this.anInt7749;
        }

    }

    void method6332() {
        this.anInt7746 = 0;
        this.anInt7751 = 0;
    }

    void method6345() {
        this.anInt7747 = this.anInt7754;
        this.anInt7751 >>= 4;
        if (this.anInt7751 < 0) {
            this.anInt7751 = 0;
        } else if (this.anInt7751 > 255) {
            this.anInt7751 = 255;
        }

        this.method12508(this.anInt7746++, (byte) this.anInt7751);
        this.anInt7751 = 0;
    }

    void method6340() {
        this.anInt7747 = this.anInt7754;
        this.anInt7751 >>= 4;
        if (this.anInt7751 < 0) {
            this.anInt7751 = 0;
        } else if (this.anInt7751 > 255) {
            this.anInt7751 = 255;
        }

        this.method12508(this.anInt7746++, (byte) this.anInt7751);
        this.anInt7751 = 0;
    }

}
