package com.jagex;

public class CacheableNode_Sub11_Sub2 extends JS5CacheRequest {

    JS5CacheFile aClass203_10464;
    int anInt10467;
    byte[] aByteArray10469;

    int getCompletion(int i_1) {
        return this.waiting ? 0 : 100;
    }

    byte[] method14944() {
        if (this.waiting) {
            throw new RuntimeException();
        } else {
            return this.aByteArray10469;
        }
    }

    int method14947() {
        return this.waiting ? 0 : 100;
    }

    byte[] getData(int i_1) {
        if (this.waiting) {
            throw new RuntimeException();
        } else {
            return this.aByteArray10469;
        }
    }

    byte[] method14941() {
        if (this.waiting) {
            throw new RuntimeException();
        } else {
            return this.aByteArray10469;
        }
    }

    byte[] method14945() {
        if (this.waiting) {
            throw new RuntimeException();
        } else {
            return this.aByteArray10469;
        }
    }

    int method14946() {
        return this.waiting ? 0 : 100;
    }

    int method14948() {
        return this.waiting ? 0 : 100;
    }

}
