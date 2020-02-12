package com.jagex;

public class Class273_Sub2 extends Class273 {

    long aLong7735 = 0L;

    long aLong7738 = 0L;

    long aLong7734 = 0L;

    int anInt7737 = 0;

    int anInt7736 = 1;

    long[] aLongArray7733 = new long[10];

    void method4849() {
        this.aLong7735 = 0L * 8551596073145250171L;
        if (this.aLong7734 * 6386115007194650521L * 4090131977032338601L > 7583209133476053025L * this.aLong7738 * 5078792902668780513L) {
            this.aLong7738 = (this.aLong7738 * 5078792902668780513L + (-3466426661587870839L * this.aLong7734 * 6386115007194650521L - 1L * this.aLong7738 * 5078792902668780513L)) * 7583209133476053025L;
        }
    }

    long method4852() {
        return this.aLong7738;
    }

    long method4844() {
        this.aLong7738 += this.method12495((byte) -18);
        return this.aLong7734 > this.aLong7738 ? (this.aLong7734 - this.aLong7738) / 1000000L : 0L;
    }

    int method4845(long long_1) {
        if (this.aLong7734 > this.aLong7738) {
            this.aLong7735 += this.aLong7734 - this.aLong7738;
            this.aLong7738 += this.aLong7734 - this.aLong7738;
            this.aLong7734 += long_1;
            return 1;
        } else {
            int i_3 = 0;
            do {
                ++i_3;
                this.aLong7734 += long_1;
            } while (i_3 < 10 && this.aLong7734 < this.aLong7738);
            if (this.aLong7734 < this.aLong7738) {
                this.aLong7734 = this.aLong7738;
            }
            return i_3;
        }
    }

    void method4853() {
        this.aLong7735 = 0L;
        if (this.aLong7734 > this.aLong7738) {
            this.aLong7738 += this.aLong7734 - this.aLong7738;
        }
    }

    long method12495(byte b_1) {
        long long_2 = System.nanoTime();
        long long_4 = long_2 - this.aLong7735;
        this.aLong7735 = long_2;
        if (long_4 > -5000000000L && long_4 < 5000000000L) {
            this.aLongArray7733[this.anInt7737] = long_4;
            this.anInt7737 = (this.anInt7737 + 1) % 10;
            if (this.anInt7736 < 1) {
                ++this.anInt7736;
            }
        }
        long long_6 = 0L;
        for (int i_8 = 1; i_8 <= this.anInt7736; i_8++) {
            long_6 += this.aLongArray7733[(this.anInt7737 - i_8 + 10) % 10];
        }
        return long_6 / (long) this.anInt7736;
    }

    void method4847() {
        this.aLong7735 = 0L * 8551596073145250171L;
        if (this.aLong7734 * 6386115007194650521L * 4090131977032338601L > 7583209133476053025L * this.aLong7738 * 5078792902668780513L) {
            this.aLong7738 = (this.aLong7738 * 5078792902668780513L + (-3466426661587870839L * this.aLong7734 * 6386115007194650521L - 1L * this.aLong7738 * 5078792902668780513L)) * 7583209133476053025L;
        }
    }

    void method4848() {
        this.aLong7735 = 0L * 8551596073145250171L;
        if (this.aLong7734 * 6386115007194650521L * 4090131977032338601L > 7583209133476053025L * this.aLong7738 * 5078792902668780513L) {
            this.aLong7738 = (this.aLong7738 * 5078792902668780513L + (-3466426661587870839L * this.aLong7734 * 6386115007194650521L - 1L * this.aLong7738 * 5078792902668780513L)) * 7583209133476053025L;
        }
    }

    Class273_Sub2() {
        this.aLong7738 = System.nanoTime();
        this.aLong7734 = System.nanoTime();
    }

    void method4855() {
        this.aLong7735 = 0L * 8551596073145250171L;
        if (this.aLong7734 * 6386115007194650521L * 4090131977032338601L > 7583209133476053025L * this.aLong7738 * 5078792902668780513L) {
            this.aLong7738 = (this.aLong7738 * 5078792902668780513L + (-3466426661587870839L * this.aLong7734 * 6386115007194650521L - 1L * this.aLong7738 * 5078792902668780513L)) * 7583209133476053025L;
        }
    }

    long method4851() {
        this.aLong7738 = (this.aLong7738 * 5078792902668780513L + this.method12495((byte) -80) * 5078792902668780513L) * 7583209133476053025L;
        return 4090131977032338601L * this.aLong7734 * 6386115007194650521L > this.aLong7738 * 5078792902668780513L * 7583209133476053025L ? (4090131977032338601L * this.aLong7734 * 6386115007194650521L - this.aLong7738 * 5078792902668780513L * 7583209133476053025L) / 1000000L : 0L;
    }

    long method4846() {
        this.aLong7738 = (this.aLong7738 * 5078792902668780513L + this.method12495((byte) -8) * 5078792902668780513L) * 7583209133476053025L;
        return 4090131977032338601L * this.aLong7734 * 6386115007194650521L > this.aLong7738 * 5078792902668780513L * 7583209133476053025L ? (4090131977032338601L * this.aLong7734 * 6386115007194650521L - this.aLong7738 * 5078792902668780513L * 7583209133476053025L) / 1000000L : 0L;
    }

    int method4862(long long_1) {
        if (4090131977032338601L * this.aLong7734 * 6386115007194650521L > this.aLong7738 * 5078792902668780513L * 7583209133476053025L) {
            this.aLong7735 = (this.aLong7735 * -8335677826573564493L + (this.aLong7734 * 6386115007194650521L * 3289928719522015019L - this.aLong7738 * 5078792902668780513L * 648117299666467859L)) * 8551596073145250171L;
            this.aLong7738 = (this.aLong7738 * 5078792902668780513L + (-3466426661587870839L * this.aLong7734 * 6386115007194650521L - this.aLong7738 * 5078792902668780513L * 1L)) * 7583209133476053025L;
            this.aLong7734 = (this.aLong7734 * 6386115007194650521L + long_1 * 6386115007194650521L) * 4090131977032338601L;
            return 1;
        } else {
            int i_3 = 0;
            do {
                ++i_3;
                this.aLong7734 = (this.aLong7734 * 6386115007194650521L + 6386115007194650521L * long_1) * 4090131977032338601L;
            } while (i_3 < 10 && 4090131977032338601L * this.aLong7734 * 6386115007194650521L < this.aLong7738 * 5078792902668780513L * 7583209133476053025L);
            if (this.aLong7734 * 6386115007194650521L * 4090131977032338601L < 7583209133476053025L * this.aLong7738 * 5078792902668780513L) {
                this.aLong7734 = this.aLong7738 * 5078792902668780513L * 8517965755372686009L * 4090131977032338601L;
            }
            return i_3;
        }
    }

    int method4854(long long_1) {
        if (4090131977032338601L * this.aLong7734 * 6386115007194650521L > this.aLong7738 * 5078792902668780513L * 7583209133476053025L) {
            this.aLong7735 = (this.aLong7735 * -8335677826573564493L + (this.aLong7734 * 6386115007194650521L * 3289928719522015019L - this.aLong7738 * 5078792902668780513L * 648117299666467859L)) * 8551596073145250171L;
            this.aLong7738 = (this.aLong7738 * 5078792902668780513L + (-3466426661587870839L * this.aLong7734 * 6386115007194650521L - this.aLong7738 * 5078792902668780513L * 1L)) * 7583209133476053025L;
            this.aLong7734 = (this.aLong7734 * 6386115007194650521L + long_1 * 6386115007194650521L) * 4090131977032338601L;
            return 1;
        } else {
            int i_3 = 0;
            do {
                ++i_3;
                this.aLong7734 = (this.aLong7734 * 6386115007194650521L + 6386115007194650521L * long_1) * 4090131977032338601L;
            } while (i_3 < 10 && 4090131977032338601L * this.aLong7734 * 6386115007194650521L < this.aLong7738 * 5078792902668780513L * 7583209133476053025L);
            if (this.aLong7734 * 6386115007194650521L * 4090131977032338601L < 7583209133476053025L * this.aLong7738 * 5078792902668780513L) {
                this.aLong7734 = this.aLong7738 * 5078792902668780513L * 8517965755372686009L * 4090131977032338601L;
            }
            return i_3;
        }
    }

    long method4857() {
        return 7583209133476053025L * this.aLong7738 * 5078792902668780513L;
    }

    long method4861() {
        return 7583209133476053025L * this.aLong7738 * 5078792902668780513L;
    }

    long method4856() {
        return 7583209133476053025L * this.aLong7738 * 5078792902668780513L;
    }
}
