import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import java.awt.Canvas;

public class Class158_Sub2_Sub2_Sub2 extends Class158_Sub2_Sub2 implements Interface33 {

	int anInt10476;
	int anInt10471;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10480;
	long aLong10473;
	long aLong10475;
	long aLong10474;
	boolean aBool10478 = false;
	boolean aBool10477 = false;
	Canvas aCanvas10472;
	GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_10479;

	void method14348(int i_1, int i_2) {
		this.method212();
		this.anInt10476 = i_1;
		this.anInt10471 = i_2;
		if (this.aBool10477) {
			this.aGraphicalRenderer_Sub2_Sub2_10479.method15639();
		}

		this.method210();
		super.method14354(i_1, i_2);
	}

	public void method210() {
		this.method212();
		this.aD3DPRESENT_PARAMETERS10480 = new D3DPRESENT_PARAMETERS(this.aCanvas10472);
		this.aD3DPRESENT_PARAMETERS10480.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10480.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10480.BackBufferWidth = this.anInt10476;
		this.aD3DPRESENT_PARAMETERS10480.BackBufferHeight = this.anInt10471;
		if (this.aBool10477) {
			this.aLong10473 = IDirect3DDevice.GetSwapChain(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0);
			this.aLong10475 = IDirect3DSwapChain.GetBackBuffer(this.aLong10473, 0, 0);
			this.aLong10474 = IDirect3DDevice.GetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252);
		} else {
			if (!GraphicalRenderer_Sub2_Sub2.method15656(this.aGraphicalRenderer_Sub2_Sub2_10479.anInt10260, this.aGraphicalRenderer_Sub2_Sub2_10479.anInt10244, this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10246, this.aGraphicalRenderer_Sub2_Sub2_10479.anInt8709, this.aD3DPRESENT_PARAMETERS10480)) {
				throw new RuntimeException();
			}

			int i_1 = this.aD3DPRESENT_PARAMETERS10480.AutoDepthStencilFormat;
			this.aLong10473 = IDirect3DDevice.CreateAdditionalSwapChain(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.aD3DPRESENT_PARAMETERS10480);
			this.aLong10475 = IDirect3DSwapChain.GetBackBuffer(this.aLong10473, 0, 0);
			this.aLong10474 = IDirect3DDevice.CreateDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.anInt10476, this.anInt10471, i_1, this.aD3DPRESENT_PARAMETERS10480.MultiSampleType, this.aD3DPRESENT_PARAMETERS10480.MultiSampleQuality, false);
		}

		if (this.aBool10478) {
			this.method213();
		}

	}

	void method14347(int i_1, int i_2) {
		this.method212();
		this.anInt10476 = i_1;
		this.anInt10471 = i_2;
		if (this.aBool10477) {
			this.aGraphicalRenderer_Sub2_Sub2_10479.method15639();
		}

		this.method210();
		super.method14354(i_1, i_2);
	}

	public int method2716() {
		return this.anInt10471;
	}

	boolean method2718() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	public int method14349() {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	public int method14353(int i_1, int i_2) {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	void method14354(int i_1, int i_2) {
		this.method212();
		this.anInt10476 = i_1;
		this.anInt10471 = i_2;
		if (this.aBool10477) {
			this.aGraphicalRenderer_Sub2_Sub2_10479.method15639();
		}

		this.method210();
		super.method14354(i_1, i_2);
	}

	public void method212() {
		if (this.aLong10475 != 0L) {
			IUnknown.Release(this.aLong10475);
			this.aLong10475 = 0L;
		}

		if (this.aLong10474 != 0L) {
			IUnknown.Release(this.aLong10474);
			this.aLong10474 = 0L;
		}

		if (this.aLong10473 != 0L) {
			IUnknown.Release(this.aLong10473);
			this.aLong10473 = 0L;
		}

		this.aGraphicalRenderer_Sub2_Sub2_10479.method15643(this);
	}

	void method16065() {
		if (this.aLong10475 != 0L) {
			IUnknown.Release(this.aLong10475);
			this.aLong10475 = 0L;
		}

		if (this.aLong10474 != 0L) {
			IUnknown.Release(this.aLong10474);
			this.aLong10474 = 0L;
		}

		if (this.aLong10473 != 0L) {
			IUnknown.Release(this.aLong10473);
			this.aLong10473 = 0L;
		}

		this.aGraphicalRenderer_Sub2_Sub2_10479.method15643(this);
	}

	public void finalize() throws Throwable {
		this.method16065();
		super.finalize();
	}

	public int method2719() {
		return this.anInt10476;
	}

	boolean method2725() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	public int method2726() {
		return this.anInt10476;
	}

	public boolean method54() {
		this.aBool10478 = true;
		return Class25.lessThanZero(IDirect3DDevice.SetRenderTarget(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0, this.aLong10475)) ? false : (Class25.lessThanZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.aLong10474)) ? false : super.method213());
	}

	boolean method2723() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	boolean method2715() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	boolean method2717() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	public int method2714() {
		return this.anInt10476;
	}

	public int method14346() {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	boolean method2722() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	public int method2720() {
		return this.anInt10476;
	}

	public int method2721() {
		return this.anInt10471;
	}

	public int method2727() {
		return this.anInt10471;
	}

	public int method14350() {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	boolean method2724() {
		this.aBool10478 = false;
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0L));
	}

	public int method14351(int i_1, int i_2) {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	public void method186() {
		if (this.aLong10475 != 0L) {
			IUnknown.Release(this.aLong10475);
			this.aLong10475 = 0L;
		}

		if (this.aLong10474 != 0L) {
			IUnknown.Release(this.aLong10474);
			this.aLong10474 = 0L;
		}

		if (this.aLong10473 != 0L) {
			IUnknown.Release(this.aLong10473);
			this.aLong10473 = 0L;
		}

		this.aGraphicalRenderer_Sub2_Sub2_10479.method15643(this);
	}

	public int method14344() {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	Class158_Sub2_Sub2_Sub2(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Canvas canvas_2, int i_3, int i_4, boolean bool_5) {
		super(class505_sub2_sub2_1);
		this.aCanvas10472 = canvas_2;
		this.aGraphicalRenderer_Sub2_Sub2_10479 = class505_sub2_sub2_1;
		this.anInt10476 = i_3;
		this.anInt10471 = i_4;
		this.aBool10477 = bool_5;
		this.method210();
		this.aGraphicalRenderer_Sub2_Sub2_10479.method15642(this);
	}

	public int method14352(int i_1, int i_2) {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	public boolean method213() {
		this.aBool10478 = true;
		return Class25.lessThanZero(IDirect3DDevice.SetRenderTarget(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0, this.aLong10475)) ? false : (Class25.lessThanZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.aLong10474)) ? false : super.method213());
	}

	public int method14345(int i_1, int i_2) {
		return IDirect3DSwapChain.Present(this.aLong10473, 0);
	}

	public void method96() {
		this.method212();
		this.aD3DPRESENT_PARAMETERS10480 = new D3DPRESENT_PARAMETERS(this.aCanvas10472);
		this.aD3DPRESENT_PARAMETERS10480.Windowed = true;
		this.aD3DPRESENT_PARAMETERS10480.BackBufferCount = 1;
		this.aD3DPRESENT_PARAMETERS10480.BackBufferWidth = this.anInt10476;
		this.aD3DPRESENT_PARAMETERS10480.BackBufferHeight = this.anInt10471;
		if (this.aBool10477) {
			this.aLong10473 = IDirect3DDevice.GetSwapChain(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0);
			this.aLong10475 = IDirect3DSwapChain.GetBackBuffer(this.aLong10473, 0, 0);
			this.aLong10474 = IDirect3DDevice.GetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252);
		} else {
			if (!GraphicalRenderer_Sub2_Sub2.method15656(this.aGraphicalRenderer_Sub2_Sub2_10479.anInt10260, this.aGraphicalRenderer_Sub2_Sub2_10479.anInt10244, this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10246, this.aGraphicalRenderer_Sub2_Sub2_10479.anInt8709, this.aD3DPRESENT_PARAMETERS10480)) {
				throw new RuntimeException();
			}

			int i_1 = this.aD3DPRESENT_PARAMETERS10480.AutoDepthStencilFormat;
			this.aLong10473 = IDirect3DDevice.CreateAdditionalSwapChain(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.aD3DPRESENT_PARAMETERS10480);
			this.aLong10475 = IDirect3DSwapChain.GetBackBuffer(this.aLong10473, 0, 0);
			this.aLong10474 = IDirect3DDevice.CreateDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.anInt10476, this.anInt10471, i_1, this.aD3DPRESENT_PARAMETERS10480.MultiSampleType, this.aD3DPRESENT_PARAMETERS10480.MultiSampleQuality, false);
		}

		if (this.aBool10478) {
			this.method213();
		}

	}

	public boolean method211() {
		this.aBool10478 = true;
		return Class25.lessThanZero(IDirect3DDevice.SetRenderTarget(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, 0, this.aLong10475)) ? false : (Class25.lessThanZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10479.aLong10252, this.aLong10474)) ? false : super.method213());
	}

}
