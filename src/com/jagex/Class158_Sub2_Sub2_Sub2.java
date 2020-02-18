package com.jagex;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

import java.awt.*;

public class Class158_Sub2_Sub2_Sub2 extends Class158_Sub2_Sub2 implements Interface33 {

    int anInt10476;
    int anInt10471;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10480;
    long aLong10473;
    long aLong10475;
    long aLong10474;
    boolean aBool10478;
    boolean aBool10477;
    Canvas aCanvas10472;
    AbstractRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_10479;

    Class158_Sub2_Sub2_Sub2(AbstractRenderer_Sub2_Sub2 class505_sub2_sub2_1, Canvas canvas_2, int i_3, int i_4, boolean bool_5) {
        super(class505_sub2_sub2_1);
        aCanvas10472 = canvas_2;
        aGraphicalRenderer_Sub2_Sub2_10479 = class505_sub2_sub2_1;
        anInt10476 = i_3;
        anInt10471 = i_4;
        aBool10477 = bool_5;
        method210();
        aGraphicalRenderer_Sub2_Sub2_10479.method15642(this);
    }

    @Override
    void method14348(int i_1, int i_2) {
        method212();
        anInt10476 = i_1;
        anInt10471 = i_2;
        if (aBool10477) {
            aGraphicalRenderer_Sub2_Sub2_10479.method15639();
        }

        method210();
        super.method14354(i_1, i_2);
    }

    @Override
    public void method210() {
        method212();
        aD3DPRESENT_PARAMETERS10480 = new D3DPRESENT_PARAMETERS(aCanvas10472);
        aD3DPRESENT_PARAMETERS10480.Windowed = true;
        aD3DPRESENT_PARAMETERS10480.BackBufferCount = 1;
        aD3DPRESENT_PARAMETERS10480.BackBufferWidth = anInt10476;
        aD3DPRESENT_PARAMETERS10480.BackBufferHeight = anInt10471;
        if (aBool10477) {
            aLong10473 = IDirect3DDevice.GetSwapChain(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0);
            aLong10475 = IDirect3DSwapChain.GetBackBuffer(aLong10473, 0, 0);
            aLong10474 = IDirect3DDevice.GetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252);
        } else {
            if (!AbstractRenderer_Sub2_Sub2.method15656(aGraphicalRenderer_Sub2_Sub2_10479.anInt10260, aGraphicalRenderer_Sub2_Sub2_10479.anInt10244, aGraphicalRenderer_Sub2_Sub2_10479.aLong10246, aGraphicalRenderer_Sub2_Sub2_10479.anInt8709, aD3DPRESENT_PARAMETERS10480)) {
                throw new RuntimeException();
            }

            int i_1 = aD3DPRESENT_PARAMETERS10480.AutoDepthStencilFormat;
            aLong10473 = IDirect3DDevice.CreateAdditionalSwapChain(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, aD3DPRESENT_PARAMETERS10480);
            aLong10475 = IDirect3DSwapChain.GetBackBuffer(aLong10473, 0, 0);
            aLong10474 = IDirect3DDevice.CreateDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, anInt10476, anInt10471, i_1, aD3DPRESENT_PARAMETERS10480.MultiSampleType, aD3DPRESENT_PARAMETERS10480.MultiSampleQuality, false);
        }

        if (aBool10478) {
            method213();
        }

    }

    @Override
    void method14347(int i_1, int i_2) {
        method212();
        anInt10476 = i_1;
        anInt10471 = i_2;
        if (aBool10477) {
            aGraphicalRenderer_Sub2_Sub2_10479.method15639();
        }

        method210();
        super.method14354(i_1, i_2);
    }

    @Override
    public int method2716() {
        return anInt10471;
    }

    @Override
    boolean method2718() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    public int method14349() {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    public int method14353(int i_1, int i_2) {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    void method14354(int i_1, int i_2) {
        method212();
        anInt10476 = i_1;
        anInt10471 = i_2;
        if (aBool10477) {
            aGraphicalRenderer_Sub2_Sub2_10479.method15639();
        }

        method210();
        super.method14354(i_1, i_2);
    }

    @Override
    public void method212() {
        if (aLong10475 != 0L) {
            IUnknown.Release(aLong10475);
            aLong10475 = 0L;
        }

        if (aLong10474 != 0L) {
            IUnknown.Release(aLong10474);
            aLong10474 = 0L;
        }

        if (aLong10473 != 0L) {
            IUnknown.Release(aLong10473);
            aLong10473 = 0L;
        }

        aGraphicalRenderer_Sub2_Sub2_10479.method15643(this);
    }

    void method16065() {
        if (aLong10475 != 0L) {
            IUnknown.Release(aLong10475);
            aLong10475 = 0L;
        }

        if (aLong10474 != 0L) {
            IUnknown.Release(aLong10474);
            aLong10474 = 0L;
        }

        if (aLong10473 != 0L) {
            IUnknown.Release(aLong10473);
            aLong10473 = 0L;
        }

        aGraphicalRenderer_Sub2_Sub2_10479.method15643(this);
    }

    @Override
    protected void finalize() throws Throwable {
        method16065();
        super.finalize();
    }

    @Override
    public int method2719() {
        return anInt10476;
    }

    @Override
    boolean method2725() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    public int method2726() {
        return anInt10476;
    }

    @Override
    public boolean method54() {
        aBool10478 = true;
        return !Class25.lessThanZero(IDirect3DDevice.SetRenderTarget(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0, aLong10475)) && (!Class25.lessThanZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, aLong10474)) && super.method213());
    }

    @Override
    boolean method2723() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    boolean method2715() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    boolean method2717() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    public int method2714() {
        return anInt10476;
    }

    @Override
    public int method14346() {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    boolean method2722() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    public int method2720() {
        return anInt10476;
    }

    @Override
    public int method2721() {
        return anInt10471;
    }

    @Override
    public int method2727() {
        return anInt10471;
    }

    @Override
    public int method14350() {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    boolean method2724() {
        aBool10478 = false;
        return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
    }

    @Override
    public int method14351(int i_1, int i_2) {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    public void method186() {
        if (aLong10475 != 0L) {
            IUnknown.Release(aLong10475);
            aLong10475 = 0L;
        }

        if (aLong10474 != 0L) {
            IUnknown.Release(aLong10474);
            aLong10474 = 0L;
        }

        if (aLong10473 != 0L) {
            IUnknown.Release(aLong10473);
            aLong10473 = 0L;
        }

        aGraphicalRenderer_Sub2_Sub2_10479.method15643(this);
    }

    @Override
    public int method14344() {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    public int method14352(int i_1, int i_2) {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    public boolean method213() {
        aBool10478 = true;
        return !Class25.lessThanZero(IDirect3DDevice.SetRenderTarget(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0, aLong10475)) && (!Class25.lessThanZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, aLong10474)) && super.method213());
    }

    @Override
    public int method14345(int i_1, int i_2) {
        return IDirect3DSwapChain.Present(aLong10473, 0);
    }

    @Override
    public void method96() {
        method212();
        aD3DPRESENT_PARAMETERS10480 = new D3DPRESENT_PARAMETERS(aCanvas10472);
        aD3DPRESENT_PARAMETERS10480.Windowed = true;
        aD3DPRESENT_PARAMETERS10480.BackBufferCount = 1;
        aD3DPRESENT_PARAMETERS10480.BackBufferWidth = anInt10476;
        aD3DPRESENT_PARAMETERS10480.BackBufferHeight = anInt10471;
        if (aBool10477) {
            aLong10473 = IDirect3DDevice.GetSwapChain(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0);
            aLong10475 = IDirect3DSwapChain.GetBackBuffer(aLong10473, 0, 0);
            aLong10474 = IDirect3DDevice.GetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252);
        } else {
            if (!AbstractRenderer_Sub2_Sub2.method15656(aGraphicalRenderer_Sub2_Sub2_10479.anInt10260, aGraphicalRenderer_Sub2_Sub2_10479.anInt10244, aGraphicalRenderer_Sub2_Sub2_10479.aLong10246, aGraphicalRenderer_Sub2_Sub2_10479.anInt8709, aD3DPRESENT_PARAMETERS10480)) {
                throw new RuntimeException();
            }

            int i_1 = aD3DPRESENT_PARAMETERS10480.AutoDepthStencilFormat;
            aLong10473 = IDirect3DDevice.CreateAdditionalSwapChain(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, aD3DPRESENT_PARAMETERS10480);
            aLong10475 = IDirect3DSwapChain.GetBackBuffer(aLong10473, 0, 0);
            aLong10474 = IDirect3DDevice.CreateDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, anInt10476, anInt10471, i_1, aD3DPRESENT_PARAMETERS10480.MultiSampleType, aD3DPRESENT_PARAMETERS10480.MultiSampleQuality, false);
        }

        if (aBool10478) {
            method213();
        }

    }

    @Override
    public boolean method211() {
        aBool10478 = true;
        return !Class25.lessThanZero(IDirect3DDevice.SetRenderTarget(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0, aLong10475)) && (!Class25.lessThanZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, aLong10474)) && super.method213());
    }

}
