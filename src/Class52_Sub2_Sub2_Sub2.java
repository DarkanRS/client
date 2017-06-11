/* Class52_Sub2_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class52_Sub2_Sub2_Sub2 extends Class52_Sub2_Sub2 implements Interface11 {
	boolean aBoolean9955;
	Canvas aCanvas9956;
	long aLong9957;
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_9958;
	boolean aBoolean9959 = false;
	int anInt9960;
	int anInt9961;
	long aLong9962;
	long aLong9963;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9964;

	void method582(int i, int i_0_) {
		method135();
		((Class52_Sub2_Sub2_Sub2) this).anInt9960 = i;
		((Class52_Sub2_Sub2_Sub2) this).anInt9961 = i_0_;
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9955)
			((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5539();
		method133();
		super.method582(i, i_0_);
	}

	public void method133() {
		method135();
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964 = new D3DPRESENT_PARAMETERS(((Class52_Sub2_Sub2_Sub2) this).aCanvas9956);
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.Windowed = true;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferCount = 1;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferWidth = ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferHeight = ((Class52_Sub2_Sub2_Sub2) this).anInt9961;
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9955) {
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = IDirect3DSwapChain.GetBackBuffer(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0, 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847));
		} else {
			if (!Class_ra_Sub3_Sub2.method5551(((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).anInt9844, ((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).anInt9871, ((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9852, (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.anInt8341), ((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964))
				throw new RuntimeException();
			int i = (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.AutoDepthStencilFormat);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847), (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964)));
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = IDirect3DSwapChain.GetBackBuffer(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0, 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847), ((Class52_Sub2_Sub2_Sub2) this).anInt9960, ((Class52_Sub2_Sub2_Sub2) this).anInt9961, i, (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.MultiSampleType), (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.MultiSampleQuality), false));
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9959)
			method136();
	}

	public int method544() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9961;
	}

	public int method552() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9961;
	}

	public int method581(int i, int i_1_) {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	public int method580() {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	void method596() {
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9963 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9963);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9962 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9962);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9957 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9957);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = 0L;
		}
		((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5565(this);
	}

	public int method545() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
	}

	Class52_Sub2_Sub2_Sub2(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Canvas canvas, int i, int i_2_, boolean bool) {
		super(class_ra_sub3_sub2);
		((Class52_Sub2_Sub2_Sub2) this).aBoolean9955 = false;
		((Class52_Sub2_Sub2_Sub2) this).aCanvas9956 = canvas;
		((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958 = class_ra_sub3_sub2;
		((Class52_Sub2_Sub2_Sub2) this).anInt9960 = i;
		((Class52_Sub2_Sub2_Sub2) this).anInt9961 = i_2_;
		((Class52_Sub2_Sub2_Sub2) this).aBoolean9955 = bool;
		method133();
		((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5542(this);
	}

	public boolean method136() {
		((Class52_Sub2_Sub2_Sub2) this).aBoolean9959 = true;
		if (jagdx.a.a(IDirect3DDevice.SetRenderTarget((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), 0, ((Class52_Sub2_Sub2_Sub2) this).aLong9963)))
			return false;
		if (jagdx.a.a(IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), ((Class52_Sub2_Sub2_Sub2) this).aLong9962)))
			return false;
		return super.method136();
	}

	public void method138() {
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9963 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9963);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9962 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9962);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9957 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9957);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = 0L;
		}
		((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5565(this);
	}

	public boolean method134() {
		((Class52_Sub2_Sub2_Sub2) this).aBoolean9959 = true;
		if (jagdx.a.a(IDirect3DDevice.SetRenderTarget((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), 0, ((Class52_Sub2_Sub2_Sub2) this).aLong9963)))
			return false;
		if (jagdx.a.a(IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), ((Class52_Sub2_Sub2_Sub2) this).aLong9962)))
			return false;
		return super.method136();
	}

	boolean method548() {
		((Class52_Sub2_Sub2_Sub2) this).aBoolean9959 = false;
		return jagdx.a.f(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847, 0L));
	}

	boolean method546() {
		((Class52_Sub2_Sub2_Sub2) this).aBoolean9959 = false;
		return jagdx.a.f(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847, 0L));
	}

	public int method547() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
	}

	void method583(int i, int i_3_) {
		method135();
		((Class52_Sub2_Sub2_Sub2) this).anInt9960 = i;
		((Class52_Sub2_Sub2_Sub2) this).anInt9961 = i_3_;
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9955)
			((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5539();
		method133();
		super.method582(i, i_3_);
	}

	public void method135() {
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9963 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9963);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9962 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9962);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9957 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9957);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = 0L;
		}
		((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5565(this);
	}

	public int method550() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
	}

	public int method551() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
	}

	public void method137() {
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9963 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9963);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9962 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9962);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = 0L;
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aLong9957 != 0L) {
			IUnknown.Release(((Class52_Sub2_Sub2_Sub2) this).aLong9957);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = 0L;
		}
		((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.method5565(this);
	}

	public int method579() {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	public int method584(int i, int i_4_) {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	public int method585(int i, int i_5_) {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	public int method586(int i, int i_6_) {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	public int method587(int i, int i_7_) {
		return IDirect3DSwapChain.Present(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0);
	}

	public int method549() {
		return ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
	}

	public void method139() {
		method135();
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964 = new D3DPRESENT_PARAMETERS(((Class52_Sub2_Sub2_Sub2) this).aCanvas9956);
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.Windowed = true;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferCount = 1;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferWidth = ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferHeight = ((Class52_Sub2_Sub2_Sub2) this).anInt9961;
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9955) {
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = IDirect3DSwapChain.GetBackBuffer(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0, 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847));
		} else {
			if (!Class_ra_Sub3_Sub2.method5551(((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).anInt9844, ((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).anInt9871, ((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9852, (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.anInt8341), ((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964))
				throw new RuntimeException();
			int i = (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.AutoDepthStencilFormat);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847), (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964)));
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = IDirect3DSwapChain.GetBackBuffer(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0, 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847), ((Class52_Sub2_Sub2_Sub2) this).anInt9960, ((Class52_Sub2_Sub2_Sub2) this).anInt9961, i, (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.MultiSampleType), (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.MultiSampleQuality), false));
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9959)
			method136();
	}

	public void method140() {
		method135();
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964 = new D3DPRESENT_PARAMETERS(((Class52_Sub2_Sub2_Sub2) this).aCanvas9956);
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.Windowed = true;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferCount = 1;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferWidth = ((Class52_Sub2_Sub2_Sub2) this).anInt9960;
		((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.BackBufferHeight = ((Class52_Sub2_Sub2_Sub2) this).anInt9961;
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9955) {
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9847), 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = IDirect3DSwapChain.GetBackBuffer(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0, 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847));
		} else {
			if (!Class_ra_Sub3_Sub2.method5551(((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).anInt9844, ((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).anInt9871, ((Class_ra_Sub3_Sub2) (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958)).aLong9852, (((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958.anInt8341), ((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964))
				throw new RuntimeException();
			int i = (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.AutoDepthStencilFormat);
			((Class52_Sub2_Sub2_Sub2) this).aLong9957 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847), (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964)));
			((Class52_Sub2_Sub2_Sub2) this).aLong9963 = IDirect3DSwapChain.GetBackBuffer(((Class52_Sub2_Sub2_Sub2) this).aLong9957, 0, 0);
			((Class52_Sub2_Sub2_Sub2) this).aLong9962 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub3_Sub2) ((Class52_Sub2_Sub2_Sub2) this).aClass_ra_Sub3_Sub2_9958).aLong9847), ((Class52_Sub2_Sub2_Sub2) this).anInt9960, ((Class52_Sub2_Sub2_Sub2) this).anInt9961, i, (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.MultiSampleType), (((Class52_Sub2_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9964.MultiSampleQuality), false));
		}
		if (((Class52_Sub2_Sub2_Sub2) this).aBoolean9959)
			method136();
	}
}
