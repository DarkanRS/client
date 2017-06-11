/* Class200_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class200_Sub3 extends Class200 implements Interface9_Impl2 {
	int anInt8629;
	int anInt8630;
	boolean aBoolean8631;
	boolean aBoolean8632;

	public float method94(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8630;
	}

	public boolean method103() {
		return false;
	}

	Class200_Sub3(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(class_ra_sub3_sub2, Class55.aClass55_557, Class77.aClass77_717, bool && ((Class_ra_Sub3_Sub2) class_ra_sub3_sub2).aBoolean9846, i * i_0_);
		if (!((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aBoolean9865) {
			((Class200_Sub3) this).anInt8629 = Class416.method5590(i, (byte) 16);
			((Class200_Sub3) this).anInt8630 = Class416.method5590(i_0_, (byte) 16);
		} else {
			((Class200_Sub3) this).anInt8629 = i;
			((Class200_Sub3) this).anInt8630 = i_0_;
		}
		if (bool)
			((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847), ((Class200_Sub3) this).anInt8629, ((Class200_Sub3) this).anInt8630, 0, 1024, 21, 1));
		else
			((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847), ((Class200_Sub3) this).anInt8629, ((Class200_Sub3) this).anInt8630, 1, 0, 21, 1));
		if (i_2_ == 0)
			i_2_ = i;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_1_, i_2_ * i_0_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, 0, 0, i, i_0_, i_2_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	Class200_Sub3(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class55 class55, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(class_ra_sub3_sub2, class55, Class77.aClass77_717, bool && ((Class_ra_Sub3_Sub2) class_ra_sub3_sub2).aBoolean9846, i * i_3_);
		if (!((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aBoolean9865) {
			((Class200_Sub3) this).anInt8629 = Class416.method5590(i, (byte) 16);
			((Class200_Sub3) this).anInt8630 = Class416.method5590(i_3_, (byte) 16);
		} else {
			((Class200_Sub3) this).anInt8629 = i;
			((Class200_Sub3) this).anInt8630 = i_3_;
		}
		if (bool)
			((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847), ((Class200_Sub3) this).anInt8629, ((Class200_Sub3) this).anInt8630, 0, 1024, Class_ra_Sub3_Sub2.method5546((((Class200_Sub3) this).aClass55_6409), Class77.aClass77_717), 1));
		else
			((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847), ((Class200_Sub3) this).anInt8629, ((Class200_Sub3) this).anInt8630, 1, 0, Class_ra_Sub3_Sub2.method5546((((Class200_Sub3) this).aClass55_6409), Class77.aClass77_717), 1));
		if (i_5_ == 0)
			i_5_ = i;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		Class55 class55_6_ = ((Class200_Sub3) this).aClass55_6409;
		if (((Class200_Sub3) this).aClass55_6409 != null) {
			/* empty */
		}
		if (class55_6_ == Class55.aClass55_564) {
			bytebuffer.put(is, i_4_, i_3_ * i / 2);
			IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, 0, 0, i, i_3_ / 4, i / 4 * 8, 0, (((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
		} else {
			Class55 class55_7_ = ((Class200_Sub3) this).aClass55_6409;
			if (((Class200_Sub3) this).aClass55_6409 != null) {
				/* empty */
			}
			if (class55_7_ == Class55.aClass55_558) {
				bytebuffer.put(is, i_4_, i_3_ * i);
				IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, 0, 0, i, i_3_ / 4, i / 4 * 16, 0, (((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
			} else {
				bytebuffer.put(is, i_4_, i_5_ * i_3_);
				IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, 0, 0, i, i_3_, i_5_ * ((((Class200_Sub3) this).aClass55_6409.anInt556) * 845115459), 0, (((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
			}
		}
	}

	Class200_Sub3(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class55 class55, int i, int i_8_, boolean bool, float[] fs, int i_9_, int i_10_) {
		super(class_ra_sub3_sub2, class55, Class77.aClass77_717, bool && ((Class_ra_Sub3_Sub2) class_ra_sub3_sub2).aBoolean9846, i * i_8_);
		if (!((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aBoolean9865) {
			((Class200_Sub3) this).anInt8629 = Class416.method5590(i, (byte) 16);
			((Class200_Sub3) this).anInt8630 = Class416.method5590(i_8_, (byte) 16);
		} else {
			((Class200_Sub3) this).anInt8629 = i;
			((Class200_Sub3) this).anInt8630 = i_8_;
		}
		if (bool)
			((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847), ((Class200_Sub3) this).anInt8629, ((Class200_Sub3) this).anInt8630, 0, 1024, Class_ra_Sub3_Sub2.method5546((((Class200_Sub3) this).aClass55_6409), Class77.aClass77_721), 1));
		else
			((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847), ((Class200_Sub3) this).anInt8629, ((Class200_Sub3) this).anInt8630, 1, 0, Class_ra_Sub3_Sub2.method5546((((Class200_Sub3) this).aClass55_6409), Class77.aClass77_721), 1));
		if (i_10_ == 0)
			i_10_ = i;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_9_, i_10_ * i_8_ * ((((Class200_Sub3) this).aClass55_6409.anInt556) * 845115459));
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, 0, 0, i, i_8_, i_10_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459) * 4, 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public int method92() {
		return ((Class200_Sub3) this).anInt8629;
	}

	public void method126() {
		((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.method5562(this);
	}

	public float method77(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8629;
	}

	public float method78(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8630;
	}

	public void method97(boolean bool, boolean bool_11_) {
		((Class200_Sub3) this).aBoolean8631 = bool;
		((Class200_Sub3) this).aBoolean8632 = bool_11_;
	}

	long method1894() {
		return ((Class200_Sub3) this).aLong6407;
	}

	public boolean method79() {
		return true;
	}

	public void method80(boolean bool, boolean bool_12_) {
		((Class200_Sub3) this).aBoolean8631 = bool;
		((Class200_Sub3) this).aBoolean8632 = bool_12_;
	}

	public void method101(int i, int i_13_, int i_14_, int i_15_, int[] is, int i_16_, int i_17_) {
		if (((Class200_Sub3) this).aClass55_6409 != Class55.aClass55_557 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_17_ == 0)
			i_17_ = i_14_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_16_, i_17_ * i_15_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_13_, i_14_, i_15_, i_17_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public void method82(int i, int i_18_, int i_19_, int i_20_, byte[] is, Class55 class55, int i_21_, int i_22_) {
		if (((Class200_Sub3) this).aClass55_6409 != class55 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_22_ == 0)
			i_22_ = i_19_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is, i_21_, i_22_ * i_20_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_18_, i_19_, i_20_, i_22_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public void method83(int i, int i_23_, int i_24_, int i_25_, int[] is, int i_26_) {
		if (((Class200_Sub3) this).aClass55_6409 != Class55.aClass55_557 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class200_Sub3) this).aLong6407, 0, i, i_23_, i_24_, i_25_, i_24_ * 4, 0, (((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
		bytebuffer.asIntBuffer().get(is, i_26_, i_24_ * i_25_);
	}

	public int method86() {
		return ((Class200_Sub3) this).anInt8629;
	}

	public void method107(int i, int i_27_, int i_28_, int i_29_, int[] is, int i_30_) {
		if (((Class200_Sub3) this).aClass55_6409 != Class55.aClass55_557 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class200_Sub3) this).aLong6407, 0, i, i_27_, i_28_, i_29_, i_28_ * 4, 0, (((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
		bytebuffer.asIntBuffer().get(is, i_30_, i_28_ * i_29_);
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

	long method1898() {
		return ((Class200_Sub3) this).aLong6407;
	}

	public void method99(boolean bool, boolean bool_31_) {
		((Class200_Sub3) this).aBoolean8631 = bool;
		((Class200_Sub3) this).aBoolean8632 = bool_31_;
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public int method84() {
		return ((Class200_Sub3) this).anInt8630;
	}

	public int method88() {
		return ((Class200_Sub3) this).anInt8630;
	}

	public float method89(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8629;
	}

	public float method90(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8629;
	}

	public float method91(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8629;
	}

	public float method105(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8630;
	}

	public float method109(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8630;
	}

	public void method93(int i, int i_32_, int i_33_, int i_34_, int[] is, int i_35_) {
		if (((Class200_Sub3) this).aClass55_6409 != Class55.aClass55_557 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class200_Sub3) this).aLong6407, 0, i, i_32_, i_33_, i_34_, i_33_ * 4, 0, (((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
		bytebuffer.asIntBuffer().get(is, i_35_, i_33_ * i_34_);
	}

	public float method95(float f) {
		return f / (float) ((Class200_Sub3) this).anInt8630;
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method128() {
		((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.method5562(this);
	}

	public void method98(boolean bool, boolean bool_36_) {
		((Class200_Sub3) this).aBoolean8631 = bool;
		((Class200_Sub3) this).aBoolean8632 = bool_36_;
	}

	public void method106(boolean bool, boolean bool_37_) {
		((Class200_Sub3) this).aBoolean8631 = bool;
		((Class200_Sub3) this).aBoolean8632 = bool_37_;
	}

	Class200_Sub3(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class55 class55, Class77 class77, int i, int i_38_) {
		this(class_ra_sub3_sub2, class55, class77, i, i_38_, 0, 1);
	}

	public int method76() {
		return ((Class200_Sub3) this).anInt8630;
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method100(int i, int i_39_, int i_40_, int i_41_, byte[] is, Class55 class55, int i_42_, int i_43_) {
		if (((Class200_Sub3) this).aClass55_6409 != class55 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_43_ == 0)
			i_43_ = i_40_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is, i_42_, i_43_ * i_41_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_39_, i_40_, i_41_, i_43_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public void method104(int i, int i_44_, int i_45_, int i_46_, byte[] is, Class55 class55, int i_47_, int i_48_) {
		if (((Class200_Sub3) this).aClass55_6409 != class55 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_48_ == 0)
			i_48_ = i_45_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is, i_47_, i_48_ * i_46_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_44_, i_45_, i_46_, i_48_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public void method87(int i, int i_49_, int i_50_, int i_51_, byte[] is, Class55 class55, int i_52_, int i_53_) {
		if (((Class200_Sub3) this).aClass55_6409 != class55 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_53_ == 0)
			i_53_ = i_50_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.put(is, i_52_, i_53_ * i_51_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_49_, i_50_, i_51_, i_53_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	Class200_Sub3(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class55 class55, Class77 class77, int i, int i_54_, int i_55_, int i_56_) {
		super(class_ra_sub3_sub2, class55, class77, false, i * i_54_);
		if (!((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aBoolean9865) {
			((Class200_Sub3) this).anInt8629 = Class416.method5590(i, (byte) 16);
			((Class200_Sub3) this).anInt8630 = Class416.method5590(i_54_, (byte) 16);
		} else {
			((Class200_Sub3) this).anInt8629 = i;
			((Class200_Sub3) this).anInt8630 = i_54_;
		}
		((Class200_Sub3) this).aLong6407 = (IDirect3DDevice.CreateTexture(((Class_ra_Sub3_Sub2) ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410).aLong9847, i, i_54_, 0, i_55_, Class_ra_Sub3_Sub2.method5546((((Class200_Sub3) this).aClass55_6409), (((Class200_Sub3) this).aClass77_6408)), i_56_));
	}

	public void method96(boolean bool, boolean bool_57_) {
		((Class200_Sub3) this).aBoolean8631 = bool;
		((Class200_Sub3) this).aBoolean8632 = bool_57_;
	}

	public boolean method108() {
		return false;
	}

	public boolean method111() {
		return false;
	}

	public void method125() {
		((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.method5562(this);
	}

	public void x() {
		super.b();
	}

	public void method123() {
		((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.method5562(this);
	}

	public void method102(int i, int i_58_, int i_59_, int i_60_, int[] is, int i_61_, int i_62_) {
		if (((Class200_Sub3) this).aClass55_6409 != Class55.aClass55_557 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_62_ == 0)
			i_62_ = i_59_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_61_, i_62_ * i_60_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_58_, i_59_, i_60_, i_62_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method81(int i, int i_63_, int i_64_, int i_65_, int[] is, int i_66_, int i_67_) {
		if (((Class200_Sub3) this).aClass55_6409 != Class55.aClass55_557 || ((Class200_Sub3) this).aClass77_6408 != Class77.aClass77_717)
			throw new RuntimeException();
		if (i_67_ == 0)
			i_67_ = i_64_;
		ByteBuffer bytebuffer = ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_66_, i_67_ * i_65_);
		IDirect3DTexture.Upload(((Class200_Sub3) this).aLong6407, 0, i, i_63_, i_64_, i_65_, i_67_ * (((Class200_Sub3) this).aClass55_6409.anInt556 * 845115459), 0, ((Class200_Sub3) this).aClass_ra_Sub3_Sub2_6410.aLong8217);
	}

	public boolean method110() {
		return true;
	}

	public boolean method85() {
		return true;
	}

	long method1899() {
		return ((Class200_Sub3) this).aLong6407;
	}

	public int method75() {
		return ((Class200_Sub3) this).anInt8630;
	}
}
