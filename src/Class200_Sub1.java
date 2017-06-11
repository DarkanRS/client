/* Class200_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class200_Sub1 extends Class200 implements Interface9_Impl3 {
	int pie;
	int sven;
	int jeoffrey;

	long method1894() {
		return ((Class200_Sub1) this).aLong6407;
	}

	Class200_Sub1(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class55 class55, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class_ra_sub3_sub2, class55, Class77.aClass77_717, false, i * i_0_ * i_1_);
		((Class200_Sub1) this).pie = i;
		((Class200_Sub1) this).sven = i_0_;
		((Class200_Sub1) this).jeoffrey = i_1_;
		((Class200_Sub1) this).aLong6407 = (IDirect3DDevice.CreateVolumeTexture(((Class_ra_Sub3_Sub2) ((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410).aLong9847, i, i_0_, i_1_, 1, 0, Class_ra_Sub3_Sub2.method5546(class55, ((Class200_Sub1) this).aClass77_6408), 1));
		ByteBuffer bytebuffer = ((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(((Class200_Sub1) this).aLong6407, 0, 0, 0, 0, ((Class200_Sub1) this).pie, ((Class200_Sub1) this).sven, ((Class200_Sub1) this).jeoffrey, (((Class200_Sub1) this).pie * (class55.anInt556 * 845115459)), 0, (((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
	}

	public void method126() {
		((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410.method5564(this);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void b() {
		super.b();
	}

	public void d() {
		super.b();
	}

	public void u() {
		super.b();
	}

	public void x() {
		super.b();
	}

	public void method125() {
		((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410.method5564(this);
	}

	public void method128() {
		((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410.method5564(this);
	}

	public void method123() {
		((Class200_Sub1) this).aClass_ra_Sub3_Sub2_6410.method5564(this);
	}

	long method1896() {
		return ((Class200_Sub1) this).aLong6407;
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	long method1897() {
		return ((Class200_Sub1) this).aLong6407;
	}
}
