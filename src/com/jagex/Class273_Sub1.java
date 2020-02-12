package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;

public class Class273_Sub1 extends Class273 {

    long aLong7729 = 0L;
    long aLong7730 = 0L;
    long aLong7727 = 0L;
    int anInt7731 = 0;
    int anInt7732 = 1;
    long[] aLongArray7728 = new long[10];

    void method4855() {
        this.aLong7729 = 0L * -6584247789516626915L;
        if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L > 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
            this.aLong7730 = (this.aLong7730 * 2254354703093819015L + (-4112141439889806285L * this.aLong7727 * -8556059690873681827L - this.aLong7730 * 2254354703093819015L * 1L)) * 891199445578317623L;
        }

    }

    int method4854(long long_1) {
        if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L > 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
            this.aLong7729 = (this.aLong7729 * -934071361941275083L + (-8254760680807395399L * this.aLong7727 * -8556059690873681827L - -3418414235052152733L * this.aLong7730 * 2254354703093819015L)) * -6584247789516626915L;
            this.aLong7730 = (this.aLong7730 * 2254354703093819015L + (-4112141439889806285L * this.aLong7727 * -8556059690873681827L - this.aLong7730 * 2254354703093819015L * 1L)) * 891199445578317623L;
            this.aLong7727 = (this.aLong7727 * -8556059690873681827L + -8556059690873681827L * long_1) * -2348106799190078475L;
            return 1;
        } else {
            int i_3 = 0;

            do {
                ++i_3;
                this.aLong7727 = (this.aLong7727 * -8556059690873681827L + -8556059690873681827L * long_1) * -2348106799190078475L;
            } while (i_3 < 10 && -2348106799190078475L * this.aLong7727 * -8556059690873681827L < this.aLong7730 * 2254354703093819015L * 891199445578317623L);

            if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L < 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
                this.aLong7727 = this.aLong7730 * 2254354703093819015L * -6857759928070410501L * -2348106799190078475L;
            }

            return i_3;
        }
    }

    void method4848() {
        this.aLong7729 = 0L * -6584247789516626915L;
        if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L > 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
            this.aLong7730 = (this.aLong7730 * 2254354703093819015L + (-4112141439889806285L * this.aLong7727 * -8556059690873681827L - this.aLong7730 * 2254354703093819015L * 1L)) * 891199445578317623L;
        }

    }

    long method4844() {
        this.aLong7730 += this.method12493(-1471253742);
        return this.aLong7727 > this.aLong7730 ? (this.aLong7727 - this.aLong7730) / 1000000L : 0L;
    }

    long method4852() {
        return this.aLong7730;
    }

    long method12493(int i_1) {
        long long_2 = QueryPerformanceCounter.nanoTime();
        long long_4 = long_2 - this.aLong7729;
        this.aLong7729 = long_2;
        if (long_4 > -5000000000L && long_4 < 5000000000L) {
            this.aLongArray7728[this.anInt7731] = long_4;
            this.anInt7731 = (this.anInt7731 + 1) % 10;
            if (this.anInt7732 < 1) {
                ++this.anInt7732;
            }
        }

        long long_6 = 0L;

        for (int i_8 = 1; i_8 <= this.anInt7732; i_8++) {
            long_6 += this.aLongArray7728[(this.anInt7731 - i_8 + 10) % 10];
        }

        return long_6 / (long) this.anInt7732;
    }

    void method4847() {
        this.aLong7729 = 0L * -6584247789516626915L;
        if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L > 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
            this.aLong7730 = (this.aLong7730 * 2254354703093819015L + (-4112141439889806285L * this.aLong7727 * -8556059690873681827L - this.aLong7730 * 2254354703093819015L * 1L)) * 891199445578317623L;
        }

    }

    long method4851() {
        this.aLong7730 = (this.aLong7730 * 2254354703093819015L + this.method12493(854092285) * 2254354703093819015L) * 891199445578317623L;
        return this.aLong7727 * -8556059690873681827L * -2348106799190078475L > this.aLong7730 * 2254354703093819015L * 891199445578317623L ? (this.aLong7727 * -8556059690873681827L * -2348106799190078475L - this.aLong7730 * 2254354703093819015L * 891199445578317623L) / 1000000L : 0L;
    }

    void method4849() {
        this.aLong7729 = 0L * -6584247789516626915L;
        if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L > 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
            this.aLong7730 = (this.aLong7730 * 2254354703093819015L + (-4112141439889806285L * this.aLong7727 * -8556059690873681827L - this.aLong7730 * 2254354703093819015L * 1L)) * 891199445578317623L;
        }

    }

    int method4845(long long_1) {
        if (this.aLong7727 > this.aLong7730) {
            this.aLong7729 += this.aLong7727 - this.aLong7730;
            this.aLong7730 += this.aLong7727 - this.aLong7730;
            this.aLong7727 += long_1;
            return 1;
        } else {
            int i_3 = 0;

            do {
                ++i_3;
                this.aLong7727 += long_1;
            } while (i_3 < 10 && this.aLong7727 < this.aLong7730);

            if (this.aLong7727 < this.aLong7730) {
                this.aLong7727 = this.aLong7730;
            }

            return i_3;
        }
    }

    int method4862(long long_1) {
        if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L > 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
            this.aLong7729 = (this.aLong7729 * -934071361941275083L + (-8254760680807395399L * this.aLong7727 * -8556059690873681827L - -3418414235052152733L * this.aLong7730 * 2254354703093819015L)) * -6584247789516626915L;
            this.aLong7730 = (this.aLong7730 * 2254354703093819015L + (-4112141439889806285L * this.aLong7727 * -8556059690873681827L - this.aLong7730 * 2254354703093819015L * 1L)) * 891199445578317623L;
            this.aLong7727 = (this.aLong7727 * -8556059690873681827L + -8556059690873681827L * long_1) * -2348106799190078475L;
            return 1;
        } else {
            int i_3 = 0;

            do {
                ++i_3;
                this.aLong7727 = (this.aLong7727 * -8556059690873681827L + -8556059690873681827L * long_1) * -2348106799190078475L;
            } while (i_3 < 10 && -2348106799190078475L * this.aLong7727 * -8556059690873681827L < this.aLong7730 * 2254354703093819015L * 891199445578317623L);

            if (-2348106799190078475L * this.aLong7727 * -8556059690873681827L < 891199445578317623L * this.aLong7730 * 2254354703093819015L) {
                this.aLong7727 = this.aLong7730 * 2254354703093819015L * -6857759928070410501L * -2348106799190078475L;
            }

            return i_3;
        }
    }

    long method4846() {
        this.aLong7730 = (this.aLong7730 * 2254354703093819015L + this.method12493(419623543) * 2254354703093819015L) * 891199445578317623L;
        return this.aLong7727 * -8556059690873681827L * -2348106799190078475L > this.aLong7730 * 2254354703093819015L * 891199445578317623L ? (this.aLong7727 * -8556059690873681827L * -2348106799190078475L - this.aLong7730 * 2254354703093819015L * 891199445578317623L) / 1000000L : 0L;
    }

    void method4853() {
        this.aLong7729 = 0L;
        if (this.aLong7727 > this.aLong7730) {
            this.aLong7730 += this.aLong7727 - this.aLong7730;
        }

    }

    Class273_Sub1() {
        this.aLong7727 = this.aLong7730 = QueryPerformanceCounter.nanoTime();
        if (this.aLong7730 == 0L) {
            throw new RuntimeException();
        }
    }

    long method4861() {
        return 891199445578317623L * this.aLong7730 * 2254354703093819015L;
    }

    long method4856() {
        return 891199445578317623L * this.aLong7730 * 2254354703093819015L;
    }

    long method4857() {
        return 891199445578317623L * this.aLong7730 * 2254354703093819015L;
    }

}
