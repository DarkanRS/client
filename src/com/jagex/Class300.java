package com.jagex;

import jaclib.memory.Source;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class300 implements Interface4 {

    int anInt3550;
    byte aByte3547;
    long aLong3549 = 0L;
    int anInt3548;
    GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_3551;
    boolean aBool3552;

    public boolean method27(int i_1, int i_2, Source source_3) {
        return this.method31(i_1, i_2) && Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(this.aLong3549, 0, this.anInt3550, this.aBool3552 ? 8192 : 0, source_3.method2()));
    }

    public boolean method29(int i_1, int i_2) {
        this.anInt3550 = i_1;
        this.aByte3547 = (byte) i_2;
        if (this.anInt3550 > this.anInt3548) {
            int i_3 = 8;
            byte b_4;
            if (this.aBool3552) {
                b_4 = 0;
                i_3 |= 0x200;
            } else {
                b_4 = 1;
            }

            if (this.aLong3549 != 0L) {
                IUnknown.Release(this.aLong3549);
            }

            this.aLong3549 = IDirect3DDevice.CreateVertexBuffer(this.aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, this.anInt3550, i_3, 0, b_4);
            this.anInt3548 = this.anInt3550;
        }

        return this.aLong3549 != 0L;
    }

    int method5317() {
        return this.aByte3547;
    }

    public boolean method31(int i_1, int i_2) {
        this.anInt3550 = i_1;
        this.aByte3547 = (byte) i_2;
        if (this.anInt3550 > this.anInt3548) {
            int i_3 = 8;
            byte b_4;
            if (this.aBool3552) {
                b_4 = 0;
                i_3 |= 0x200;
            } else {
                b_4 = 1;
            }

            if (this.aLong3549 != 0L) {
                IUnknown.Release(this.aLong3549);
            }

            this.aLong3549 = IDirect3DDevice.CreateVertexBuffer(this.aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, this.anInt3550, i_3, 0, b_4);
            this.anInt3548 = this.anInt3550;
        }

        return this.aLong3549 != 0L;
    }

    public long method40(int i_1, int i_2) {
        return IDirect3DVertexBuffer.Lock(this.aLong3549, i_1, i_2, this.aBool3552 ? 8192 : 0);
    }

    public void method38() {
        IDirect3DVertexBuffer.Unlock(this.aLong3549);
    }

    public boolean method42(int i_1, int i_2, long long_3) {
        return Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(this.aLong3549, i_1, i_2, this.aBool3552 ? 8192 : 0, long_3));
    }

    public void method26() {
        if (this.aLong3549 != 0L) {
            IUnknown.Release(this.aLong3549);
            this.aLong3549 = 0L;
        }

        this.anInt3548 = 0;
        this.anInt3550 = 0;
        this.aGraphicalRenderer_Sub2_Sub2_3551.method13885(this);
    }

    void method5319() {
        if (this.aLong3549 != 0L) {
            this.aGraphicalRenderer_Sub2_Sub2_3551.method15650(this.aLong3549);
            this.aLong3549 = 0L;
            this.anInt3548 = 0;
            this.anInt3550 = 0;
        }

    }

    public void method32() {
        if (this.aLong3549 != 0L) {
            IUnknown.Release(this.aLong3549);
            this.aLong3549 = 0L;
        }

        this.anInt3548 = 0;
        this.anInt3550 = 0;
        this.aGraphicalRenderer_Sub2_Sub2_3551.method13885(this);
    }

    public void finalize() {
        this.method5319();
    }

    public boolean method28(int i_1, int i_2) {
        this.anInt3550 = i_1;
        this.aByte3547 = (byte) i_2;
        if (this.anInt3550 > this.anInt3548) {
            int i_3 = 8;
            byte b_4;
            if (this.aBool3552) {
                b_4 = 0;
                i_3 |= 0x200;
            } else {
                b_4 = 1;
            }

            if (this.aLong3549 != 0L) {
                IUnknown.Release(this.aLong3549);
            }

            this.aLong3549 = IDirect3DDevice.CreateVertexBuffer(this.aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, this.anInt3550, i_3, 0, b_4);
            this.anInt3548 = this.anInt3550;
        }

        return this.aLong3549 != 0L;
    }

    public boolean method30(int i_1, int i_2) {
        this.anInt3550 = i_1;
        this.aByte3547 = (byte) i_2;
        if (this.anInt3550 > this.anInt3548) {
            int i_3 = 8;
            byte b_4;
            if (this.aBool3552) {
                b_4 = 0;
                i_3 |= 0x200;
            } else {
                b_4 = 1;
            }

            if (this.aLong3549 != 0L) {
                IUnknown.Release(this.aLong3549);
            }

            this.aLong3549 = IDirect3DDevice.CreateVertexBuffer(this.aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, this.anInt3550, i_3, 0, b_4);
            this.anInt3548 = this.anInt3550;
        }

        return this.aLong3549 != 0L;
    }

    Class300(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, boolean bool_2) {
        this.aGraphicalRenderer_Sub2_Sub2_3551 = class505_sub2_sub2_1;
        this.aBool3552 = bool_2;
        this.aGraphicalRenderer_Sub2_Sub2_3551.method13901(this);
    }

    public boolean method33(int i_1, int i_2, Source source_3) {
        return this.method31(i_1, i_2) && Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(this.aLong3549, 0, this.anInt3550, this.aBool3552 ? 8192 : 0, source_3.method2()));
    }

    public boolean method34(int i_1, int i_2, Source source_3) {
        return this.method31(i_1, i_2) && Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(this.aLong3549, 0, this.anInt3550, this.aBool3552 ? 8192 : 0, source_3.method2()));
    }

    public int method36() {
        return this.anInt3550;
    }

    public int method39() {
        return this.anInt3550;
    }

    public long method41(int i_1, int i_2) {
        return IDirect3DVertexBuffer.Lock(this.aLong3549, i_1, i_2, this.aBool3552 ? 8192 : 0);
    }

    public long method37(int i_1, int i_2) {
        return IDirect3DVertexBuffer.Lock(this.aLong3549, i_1, i_2, this.aBool3552 ? 8192 : 0);
    }

    public void method43() {
        IDirect3DVertexBuffer.Unlock(this.aLong3549);
    }

    public void method44() {
        IDirect3DVertexBuffer.Unlock(this.aLong3549);
    }

    public boolean method35(int i_1, int i_2, long long_3) {
        return Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(this.aLong3549, i_1, i_2, this.aBool3552 ? 8192 : 0, long_3));
    }

}
