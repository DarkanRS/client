
/* Class360_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class360_Sub1 extends Class360 implements Interface1 {
	int anInt9121;
	int anInt9122;
	int anInt9123;

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	Class360_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class505_sub2_sub2, class150, Class76.aClass76_751, false, i * i_0_ * i_1_);
		((Class360_Sub1) this).anInt9123 = i;
		((Class360_Sub1) this).anInt9121 = i_0_;
		((Class360_Sub1) this).anInt9122 = i_1_;
		((Class360_Sub1) this).aLong4168 = (IDirect3DDevice.CreateVolumeTexture(((Class505_Sub2_Sub2) ((Class360_Sub1) this).aClass505_Sub2_Sub2_4165).aLong10252, i, i_0_, i_1_, 1, 0, Class505_Sub2_Sub2.method15652(class150, (((Class360_Sub1) this).aClass76_4164)), 1));
		ByteBuffer bytebuffer = ((Class360_Sub1) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(((Class360_Sub1) this).aLong4168, 0, 0, 0, 0, ((Class360_Sub1) this).anInt9123, ((Class360_Sub1) this).anInt9121, ((Class360_Sub1) this).anInt9122, (((Class360_Sub1) this).anInt9123 * (class150.anInt1959 * 351642797)), 0, (((Class360_Sub1) this).aClass505_Sub2_Sub2_4165.aLong8695));
	}

	public void method26() {
		super.method26();
	}

	long method6245() {
		return ((Class360_Sub1) this).aLong4168;
	}

	public void method32() {
		super.method26();
	}

	public void method207() {
		((Class360_Sub1) this).aClass505_Sub2_Sub2_4165.method15657(this);
	}

	public void method203() {
		((Class360_Sub1) this).aClass505_Sub2_Sub2_4165.method15657(this);
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	long method6249() {
		return ((Class360_Sub1) this).aLong4168;
	}
}
