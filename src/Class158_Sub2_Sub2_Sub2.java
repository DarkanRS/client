
/* Class158_Sub2_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class158_Sub2_Sub2_Sub2 extends Class158_Sub2_Sub2 implements Interface33 {
	int anInt10471;
	Canvas aCanvas10472;
	long aLong10473;
	long aLong10474;
	long aLong10475;
	int anInt10476;
	boolean aBool10477;
	boolean aBool10478 = false;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_10479;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10480;

	void method14348(int i, int i_0_) {
		method212();
		((Class158_Sub2_Sub2_Sub2) this).anInt10476 = i;
		((Class158_Sub2_Sub2_Sub2) this).anInt10471 = i_0_;
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10477)
			((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15639();
		method210();
		super.method14354(i, i_0_);
	}

	public void method210() {
		method212();
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480 = new D3DPRESENT_PARAMETERS(((Class158_Sub2_Sub2_Sub2) this).aCanvas10472);
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.Windowed = true;
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.BackBufferCount = 1;
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.BackBufferWidth = ((Class158_Sub2_Sub2_Sub2) this).anInt10476;
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.BackBufferHeight = ((Class158_Sub2_Sub2_Sub2) this).anInt10471;
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10477) {
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = IDirect3DDevice.GetSwapChain((((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252), 0);
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = IDirect3DSwapChain.GetBackBuffer(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0, 0);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = (IDirect3DDevice.GetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252));
		} else {
			if (!Class505_Sub2_Sub2.method15656((((Class505_Sub2_Sub2) ((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479).anInt10260), (((Class505_Sub2_Sub2) ((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479).anInt10244), (((Class505_Sub2_Sub2) ((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479).aLong10246), (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.anInt8709), (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480)))
				throw new RuntimeException();
			int i = (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.AutoDepthStencilFormat);
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252), (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480)));
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = IDirect3DSwapChain.GetBackBuffer(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0, 0);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = (IDirect3DDevice.CreateDepthStencilSurface((((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252), ((Class158_Sub2_Sub2_Sub2) this).anInt10476, ((Class158_Sub2_Sub2_Sub2) this).anInt10471, i, (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.MultiSampleType), (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.MultiSampleQuality), false));
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10478)
			method213();
	}

	void method14347(int i, int i_1_) {
		method212();
		((Class158_Sub2_Sub2_Sub2) this).anInt10476 = i;
		((Class158_Sub2_Sub2_Sub2) this).anInt10471 = i_1_;
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10477)
			((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15639();
		method210();
		super.method14354(i, i_1_);
	}

	public int method2716() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10471;
	}

	void method16064() throws Throwable {
		method16065();
		super.finalize();
	}

	boolean method2718() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	public int method14349() {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	public int method14353(int i, int i_2_) {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	void method14354(int i, int i_3_) {
		method212();
		((Class158_Sub2_Sub2_Sub2) this).anInt10476 = i;
		((Class158_Sub2_Sub2_Sub2) this).anInt10471 = i_3_;
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10477)
			((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15639();
		method210();
		super.method14354(i, i_3_);
	}

	public void method212() {
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10475 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10475);
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10474 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10474);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10473 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10473);
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = 0L;
		}
		((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15643(this);
	}

	void method16065() {
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10475 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10475);
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10474 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10474);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10473 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10473);
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = 0L;
		}
		((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15643(this);
	}

	public void finalize() throws Throwable {
		method16065();
		super.finalize();
	}

	public int method2719() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10476;
	}

	boolean method2725() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	public int method2726() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10476;
	}

	void method16066() {
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10475 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10475);
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10474 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10474);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10473 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10473);
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = 0L;
		}
		((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15643(this);
	}

	public boolean method54() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = true;
		if (Class25.method750(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0, ((Class158_Sub2_Sub2_Sub2) this).aLong10475)))
			return false;
		if (Class25.method750(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, ((Class158_Sub2_Sub2_Sub2) this).aLong10474)))
			return false;
		return super.method213();
	}

	boolean method2723() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	boolean method2715() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	boolean method2717() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	public int method2714() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10476;
	}

	public int method14346() {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	boolean method2722() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	void method16067() throws Throwable {
		method16065();
		super.finalize();
	}

	public int method2720() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10476;
	}

	public int method2721() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10471;
	}

	public int method2727() {
		return ((Class158_Sub2_Sub2_Sub2) this).anInt10471;
	}

	public int method14350() {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	boolean method2724() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = false;
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0L));
	}

	public int method14351(int i, int i_4_) {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	public void method186() {
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10475 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10475);
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10474 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10474);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = 0L;
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aLong10473 != 0L) {
			IUnknown.Release(((Class158_Sub2_Sub2_Sub2) this).aLong10473);
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = 0L;
		}
		((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15643(this);
	}

	public int method14344() {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	Class158_Sub2_Sub2_Sub2(Class505_Sub2_Sub2 class505_sub2_sub2, Canvas canvas, int i, int i_5_, boolean bool) {
		super(class505_sub2_sub2);
		((Class158_Sub2_Sub2_Sub2) this).aBool10477 = false;
		((Class158_Sub2_Sub2_Sub2) this).aCanvas10472 = canvas;
		((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479 = class505_sub2_sub2;
		((Class158_Sub2_Sub2_Sub2) this).anInt10476 = i;
		((Class158_Sub2_Sub2_Sub2) this).anInt10471 = i_5_;
		((Class158_Sub2_Sub2_Sub2) this).aBool10477 = bool;
		method210();
		((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.method15642(this);
	}

	public int method14352(int i, int i_6_) {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	public boolean method213() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = true;
		if (Class25.method750(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0, ((Class158_Sub2_Sub2_Sub2) this).aLong10475)))
			return false;
		if (Class25.method750(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, ((Class158_Sub2_Sub2_Sub2) this).aLong10474)))
			return false;
		return super.method213();
	}

	public int method14345(int i, int i_7_) {
		return IDirect3DSwapChain.Present(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0);
	}

	public void method96() {
		method212();
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480 = new D3DPRESENT_PARAMETERS(((Class158_Sub2_Sub2_Sub2) this).aCanvas10472);
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.Windowed = true;
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.BackBufferCount = 1;
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.BackBufferWidth = ((Class158_Sub2_Sub2_Sub2) this).anInt10476;
		((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.BackBufferHeight = ((Class158_Sub2_Sub2_Sub2) this).anInt10471;
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10477) {
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = IDirect3DDevice.GetSwapChain((((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252), 0);
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = IDirect3DSwapChain.GetBackBuffer(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0, 0);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = (IDirect3DDevice.GetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252));
		} else {
			if (!Class505_Sub2_Sub2.method15656((((Class505_Sub2_Sub2) ((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479).anInt10260), (((Class505_Sub2_Sub2) ((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479).anInt10244), (((Class505_Sub2_Sub2) ((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479).aLong10246), (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479.anInt8709), (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480)))
				throw new RuntimeException();
			int i = (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.AutoDepthStencilFormat);
			((Class158_Sub2_Sub2_Sub2) this).aLong10473 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252), (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480)));
			((Class158_Sub2_Sub2_Sub2) this).aLong10475 = IDirect3DSwapChain.GetBackBuffer(((Class158_Sub2_Sub2_Sub2) this).aLong10473, 0, 0);
			((Class158_Sub2_Sub2_Sub2) this).aLong10474 = (IDirect3DDevice.CreateDepthStencilSurface((((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252), ((Class158_Sub2_Sub2_Sub2) this).anInt10476, ((Class158_Sub2_Sub2_Sub2) this).anInt10471, i, (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.MultiSampleType), (((Class158_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10480.MultiSampleQuality), false));
		}
		if (((Class158_Sub2_Sub2_Sub2) this).aBool10478)
			method213();
	}

	public boolean method211() {
		((Class158_Sub2_Sub2_Sub2) this).aBool10478 = true;
		if (Class25.method750(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, 0, ((Class158_Sub2_Sub2_Sub2) this).aLong10475)))
			return false;
		if (Class25.method750(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub2_Sub2_Sub2) this).aClass505_Sub2_Sub2_10479)).aLong10252, ((Class158_Sub2_Sub2_Sub2) this).aLong10474)))
			return false;
		return super.method213();
	}
}
