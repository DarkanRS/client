package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class367 implements Interface32 {

    long aLong4238;
    int anInt4235;
    int anInt4237;
    AbstractRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_4234;
    Class76 aClass76_4233;
    boolean aBool4236;

    Class367(AbstractRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class76 class76_2, boolean bool_3) {
        aGraphicalRenderer_Sub2_Sub2_4234 = class505_sub2_sub2_1;
        aClass76_4233 = class76_2;
        aBool4236 = bool_3;
        aGraphicalRenderer_Sub2_Sub2_4234.method13901(this);
    }

    @Override
    public void method44() {
        IDirect3DIndexBuffer.Unlock(aLong4238);
    }

    @Override
    public int method39() {
        return anInt4237;
    }

    @Override
    public boolean method35(int i_1, int i_2, long long_3) {
        return Class25.gtOrEqualToZero(IDirect3DIndexBuffer.Upload(aLong4238, i_1, i_2, aBool4236 ? 8192 : 0, long_3));
    }

    @Override
    public long method40(int i_1, int i_2) {
        return IDirect3DIndexBuffer.Lock(aLong4238, i_1, i_2, aBool4236 ? 8192 : 0);
    }

    @Override
    public void method38() {
        IDirect3DIndexBuffer.Unlock(aLong4238);
    }

    @Override
    public int method36() {
        return anInt4237;
    }

    @Override
    public void method26() {
        if (aLong4238 != 0L) {
            IUnknown.Release(aLong4238);
            aLong4238 = 0L;
        }

        anInt4235 = 0;
        anInt4237 = 0;
        aGraphicalRenderer_Sub2_Sub2_4234.method13885(this);
    }

    @Override
    protected void finalize() {
        method6308();
    }

    @Override
    public void method32() {
        if (aLong4238 != 0L) {
            IUnknown.Release(aLong4238);
            aLong4238 = 0L;
        }

        anInt4235 = 0;
        anInt4237 = 0;
        aGraphicalRenderer_Sub2_Sub2_4234.method13885(this);
    }

    @Override
    public long method37(int i_1, int i_2) {
        return IDirect3DIndexBuffer.Lock(aLong4238, i_1, i_2, aBool4236 ? 8192 : 0);
    }

    @Override
    public void method208(int i_1) {
        anInt4237 = aClass76_4233.anInt748 * i_1;
        if (anInt4237 > anInt4235) {
            if (aLong4238 != 0L) {
                IUnknown.Release(aLong4238);
            }

            int i_2 = 8;
            byte b_3;
            if (aBool4236) {
                b_3 = 0;
                i_2 |= 0x200;
            } else {
                b_3 = 1;
            }

            aLong4238 = IDirect3DDevice.CreateIndexBuffer(aGraphicalRenderer_Sub2_Sub2_4234.aLong10252, anInt4237, i_2, aClass76_4233 == Class76.aClass76_752 ? 101 : 102, b_3);
            anInt4235 = anInt4237;
        }

    }

    @Override
    public void method43() {
        IDirect3DIndexBuffer.Unlock(aLong4238);
    }

    @Override
    public long method41(int i_1, int i_2) {
        return IDirect3DIndexBuffer.Lock(aLong4238, i_1, i_2, aBool4236 ? 8192 : 0);
    }

    @Override
    public boolean method42(int i_1, int i_2, long long_3) {
        return Class25.gtOrEqualToZero(IDirect3DIndexBuffer.Upload(aLong4238, i_1, i_2, aBool4236 ? 8192 : 0, long_3));
    }

    void method6308() {
        if (aLong4238 != 0L) {
            aGraphicalRenderer_Sub2_Sub2_4234.method15650(aLong4238);
            aLong4238 = 0L;
        }

        anInt4235 = 0;
        anInt4237 = 0;
    }

    @Override
    public void method209(int i_1) {
        anInt4237 = aClass76_4233.anInt748 * -704130985 * 971905895 * i_1;
        if (anInt4237 > anInt4235) {
            if (aLong4238 != 0L) {
                IUnknown.Release(aLong4238);
            }

            int i_2 = 8;
            byte b_3;
            if (aBool4236) {
                b_3 = 0;
                i_2 |= 0x200;
            } else {
                b_3 = 1;
            }

            aLong4238 = IDirect3DDevice.CreateIndexBuffer(aGraphicalRenderer_Sub2_Sub2_4234.aLong10252, anInt4237, i_2, aClass76_4233 == Class76.aClass76_752 ? 101 : 102, b_3);
            anInt4235 = anInt4237;
        }

    }

}
