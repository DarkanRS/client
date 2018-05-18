
/* Class505_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import sun.misc.Unsafe;

public abstract class Class505_Sub2 extends GraphicalRenderer {
	protected int anInt8680;
	boolean aBool8681;
	Interface4 anInterface4_8682;
	protected Class384 aClass384_8683;
	protected boolean aBool8684;
	Class384 aClass384_8685;
	static final int anInt8686 = 4;
	static final int anInt8687 = 8;
	static final int anInt8688 = 55;
	static final int anInt8689 = 7;
	protected static final int anInt8690 = 100663296;
	Class41_Sub1_Sub1 aClass41_Sub1_Sub1_8691;
	protected boolean aBool8692;
	Interface4 anInterface4_8693;
	Class49 aClass49_8694;
	public long aLong8695;
	int anInt8696 = 4194304;
	protected float aFloat8697;
	Class47 aClass47_8698;
	NativeHeap aNativeHeap8699;
	Class473 aClass473_8700;
	public int anInt8701;
	public int anInt8702;
	int anInt8703;
	Class294 aClass294_8704;
	Class384 aClass384_8705;
	Class294 aClass294_8706;
	Class385 aClass385_8707;
	Class384 aClass384_8708;
	public int anInt8709;
	Class294 aClass294_8710;
	static Object anObject8711 = new Object();
	static Class384 aClass384_8712 = new Class384();
	Class294 aClass294_8713;
	Class32 aClass32_8714;
	Class384 aClass384_8715;
	protected Class282_Sub24[] aClass282_Sub24Array8716;
	float[] aFloatArray8717;
	public boolean aBool8718;
	Class33 aClass33_8719;
	boolean aBool8720;
	Class70 aClass70_8721;
	int anInt8722;
	boolean aBool8723;
	Class384 aClass384_8724;
	Class384 aClass384_8725;
	protected float aFloat8726;
	public Class384 aClass384_8727;
	Class384 aClass384_8728;
	public Class384 aClass384_8729;
	float[][] aFloatArrayArray8730;
	Class152_Sub2 aClass152_Sub2_8731;
	float aFloat8732;
	protected Class73 aClass73_8733;
	float aFloat8734;
	protected float aFloat8735;
	protected float aFloat8736;
	float aFloat8737;
	float aFloat8738;
	int anInt8739;
	public Class384 aClass384_8740;
	float aFloat8741;
	protected int anInt8742;
	protected int anInt8743;
	protected int anInt8744;
	int anInt8745;
	Interface4 anInterface4_8746;
	public float[] aFloatArray8747;
	int anInt8748;
	protected int anInt8749;
	static final int anInt8750 = 128;
	protected int anInt8751;
	protected int anInt8752;
	Class41 aClass41_8753;
	protected int anInt8754;
	protected boolean aBool8755;
	protected boolean aBool8756;
	protected boolean aBool8757;
	protected int anInt8758;
	protected boolean aBool8759;
	protected boolean aBool8760;
	protected int anInt8761;
	protected float[] aFloatArray8762;
	float[] aFloatArray8763;
	float[] aFloatArray8764;
	int anInt8765;
	public float aFloat8766;
	public float aFloat8767;
	public float aFloat8768;
	protected float aFloat8769;
	public float aFloat8770;
	static final int anInt8771 = -1;
	Class428 aClass428_8772 = new Class428();
	protected int anInt8773;
	Class384 aClass384_8774;
	int anInt8775;
	protected int anInt8776;
	int anInt8777;
	int anInt8778;
	boolean aBool8779;
	protected int anInt8780;
	Interface30[] anInterface30Array8781;
	protected Class384[] aClass384Array8782;
	protected Class37[] aClass37Array8783;
	protected Class68[] aClass68Array8784;
	protected Class68[] aClass68Array8785;
	Class70 aClass70_8786;
	Class66 aClass66_8787;
	public Interface6 anInterface6_8788;
	Index aClass317_8789;
	Class160_Sub3 aClass160_Sub3_8790;
	Class160_Sub3 aClass160_Sub3_8791;
	static final int anInt8792 = 2;
	Class41[] aClass41Array8793;
	Class48 aClass48_8794;
	Interface6 anInterface6_8795;
	Class103 aClass103_8796;
	float aFloat8797;
	Class41_Sub1_Sub2 aClass41_Sub1_Sub2_8798;
	protected int anInt8799;
	static final int anInt8800 = 1;
	static final int anInt8801 = 2;
	Class55[] aClass55Array8802;
	int[] anIntArray8803;
	Class294 aClass294_8804;
	boolean aBool8805;
	int anInt8806;
	Class90 aClass90_8807;
	protected boolean aBool8808;
	protected boolean aBool8809;
	protected int anInt8810;
	protected int anInt8811;
	Class384 aClass384_8812;
	protected float aFloat8813;
	Class384 aClass384_8814;
	int anInt8815;
	static final int anInt8816 = 1;
	protected boolean aBool8817;
	protected boolean aBool8818;
	protected float aFloat8819;
	public int anInt8820;
	int anInt8821;
	protected int anInt8822;
	protected int anInt8823;
	int anInt8824;
	public int anInt8825;
	protected float aFloat8826;
	protected boolean aBool8827;
	protected boolean aBool8828;
	boolean aBool8829;
	public Unsafe anUnsafe8830;
	protected int anInt8831;
	Class70 aClass70_8832;
	Class70 aClass70_8833;
	Interface32 anInterface32_8834;
	int anInt8835;
	Class70 aClass70_8836;
	Class54 aClass54_8837;
	public ByteBuffer aByteBuffer8838;
	Class528_Sub3[] aClass528_Sub3Array8839;
	Class528_Sub3[] aClass528_Sub3Array8840;
	Class384 aClass384_8841;
	Class294 aClass294_8842;
	protected boolean aBool8843;
	protected int anInt8844;

	final Class384 method13884() {
		return aClass384Array8782[anInt8780];
	}

	public void method13885(Interface7 interface7) {
		((Class505_Sub2) this).aClass428_8772.method7191(interface7, (byte) 7);
	}

	void method13886() {
		ArrayList arraylist = ((Class505_Sub2) this).aClass428_8772.method7193((byte) 66);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface7 interface7 = (Interface7) iterator.next();
			interface7.method26();
		}
	}

	public abstract boolean method13887();

	public abstract boolean method13888();

	final boolean method13889() {
		return aBool8692;
	}

	public abstract Class101 method13890(String string);

	public final void method8586(Class384 class384) {
		((Class505_Sub2) this).aClass384_8724.method6562(class384);
		method13926();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method14030();
	}

	Class114 method13891(byte[] is) {
		if (is == null)
			return null;
		Class114 class114;
		try {
			class114 = new Class114(is);
		} catch (Exception exception) {
			return null;
		}
		return class114;
	}

	public abstract void method13892(Class384 class384, Class384 class384_0_, Class384 class384_1_);

	public static boolean method13893() {
		return Class362.method6278(616047582).method222("jaclib", 879905383);
	}

	Class505_Sub2(Interface22 interface22, Index class317, int i, int i_2_) {
		super(interface22);
		((Class505_Sub2) this).anInt8696 = 4194304;
		((Class505_Sub2) this).aClass473_8700 = new Class473();
		((Class505_Sub2) this).aClass294_8704 = new Class294();
		((Class505_Sub2) this).aClass384_8705 = new Class384();
		((Class505_Sub2) this).aClass294_8706 = new Class294();
		((Class505_Sub2) this).aClass294_8804 = new Class294();
		aClass384_8740 = new Class384();
		((Class505_Sub2) this).aClass384_8814 = new Class384();
		((Class505_Sub2) this).aClass294_8710 = new Class294();
		((Class505_Sub2) this).aClass384_8685 = new Class384();
		((Class505_Sub2) this).aClass294_8713 = new Class294();
		aClass384_8683 = new Class384();
		((Class505_Sub2) this).aClass384_8715 = new Class384();
		((Class505_Sub2) this).aClass385_8707 = new Class385();
		((Class505_Sub2) this).aFloatArray8717 = new float[4];
		((Class505_Sub2) this).aBool8829 = false;
		((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_380;
		((Class505_Sub2) this).aBool8720 = false;
		((Class505_Sub2) this).aClass384_8774 = new Class384();
		((Class505_Sub2) this).aClass384_8812 = new Class384();
		((Class505_Sub2) this).aBool8723 = false;
		((Class505_Sub2) this).aClass384_8724 = new Class384();
		((Class505_Sub2) this).aClass384_8725 = new Class384();
		((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8725;
		aClass384_8727 = new Class384();
		((Class505_Sub2) this).aClass384_8728 = new Class384();
		aClass384_8729 = new Class384();
		((Class505_Sub2) this).aFloatArrayArray8730 = new float[6][4];
		aFloat8735 = 0.0F;
		aFloat8736 = 1.0F;
		((Class505_Sub2) this).aFloat8737 = 0.0F;
		((Class505_Sub2) this).aFloat8738 = 1.0F;
		aFloat8726 = 50.0F;
		aFloat8697 = 3584.0F;
		anInt8822 = 0;
		anInt8742 = 0;
		anInt8743 = 0;
		anInt8744 = 0;
		((Class505_Sub2) this).anInt8745 = 0;
		((Class505_Sub2) this).anInt8835 = 0;
		((Class505_Sub2) this).anInt8722 = 0;
		((Class505_Sub2) this).anInt8748 = 0;
		anInt8749 = 0;
		anInt8776 = 0;
		anInt8751 = 0;
		anInt8752 = 0;
		anInt8823 = 0;
		anInt8754 = 0;
		aBool8755 = true;
		aBool8756 = false;
		aBool8757 = false;
		aBool8684 = false;
		aBool8759 = true;
		aBool8760 = false;
		aFloatArray8747 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray8762 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		((Class505_Sub2) this).aFloatArray8763 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class505_Sub2) this).aFloatArray8764 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class505_Sub2) this).anInt8765 = 16777215;
		aFloat8766 = 1.0F;
		aFloat8767 = 1.0F;
		aFloat8768 = 1.0F;
		aFloat8769 = 1.0F;
		aFloat8770 = -1.0F;
		aFloat8826 = -1.0F;
		((Class505_Sub2) this).anInt8775 = 8;
		((Class505_Sub2) this).anInt8806 = 3;
		((Class505_Sub2) this).anInt8821 = 128;
		anInt8780 = 0;
		((Class505_Sub2) this).aClass41Array8793 = new Class41[16];
		((Class505_Sub2) this).aClass55Array8802 = new Class55[2];
		((Class505_Sub2) this).aBool8805 = false;
		aBool8809 = true;
		anInt8810 = -1;
		anInt8811 = -1;
		anInt8680 = 0;
		((Class505_Sub2) this).anInt8815 = 1;
		aClass73_8733 = Class73.aClass73_727;
		aBool8817 = true;
		aBool8818 = true;
		((Class505_Sub2) this).aBool8681 = false;
		new Stream();
		((Class505_Sub2) this).aClass528_Sub3Array8839 = new Class528_Sub3[7];
		((Class505_Sub2) this).aClass528_Sub3Array8840 = new Class528_Sub3[7];
		((Class505_Sub2) this).aClass384_8841 = new Class384();
		((Class505_Sub2) this).aClass294_8842 = new Class294();
		anInt8844 = -1;
		try {
			((Class505_Sub2) this).aClass317_8789 = class317;
			anInt8709 = i;
			((Class505_Sub2) this).anInt8824 = i_2_;
			Class38.method854(false, true, -1368886840);
			if (anInterface22_5834 != null)
				((Class505_Sub2) this).aClass66_8787 = new Class66(this, anInterface22_5834);
			else
				((Class505_Sub2) this).aClass66_8787 = null;
			if (((Class505_Sub2) this).anInt8824 == 0)
				((Class505_Sub2) this).anIntArray8803 = Class540.anIntArray7136;
			else
				((Class505_Sub2) this).anIntArray8803 = Class444.anIntArray5379;
			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				anUnsafe8830 = (Unsafe) field.get(null);
			} catch (Exception exception) {
				/* empty */
			}
			aByteBuffer8838 = ByteBuffer.allocateDirect(4194304);
			aByteBuffer8838.order(ByteOrder.nativeOrder());
			aLong8695 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer8838);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method8396(-1513744370);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
		method8439(method8438(131072));
	}

	abstract void method13894();

	final void method13895() {
		((Class505_Sub2) this).aClass49_8694 = new Class49(this);
		aBool8692 = false;
		try {
			((Class505_Sub2) this).aClass48_8794 = new Class48_Sub2(this);
			((Class505_Sub2) this).aClass47_8698 = new Class47_Sub1(this);
			((Class505_Sub2) this).aClass103_8796 = new Class103_Sub1(this);
			((Class505_Sub2) this).aClass41_Sub1_Sub1_8691 = new Class41_Sub1_Sub1(this, ((Class505_Sub2) this).aClass49_8694, true);
			((Class505_Sub2) this).aClass41_Sub1_Sub2_8798 = new Class41_Sub1_Sub2(this, ((Class505_Sub2) this).aClass49_8694);
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class505_Sub2) this).aClass48_8794 = new Class48_Sub1(this);
			((Class505_Sub2) this).aClass47_8698 = new Class47_Sub2(this);
			((Class505_Sub2) this).aClass103_8796 = new Class103_Sub2(this);
			((Class505_Sub2) this).aClass41_Sub1_Sub1_8691 = null;
			((Class505_Sub2) this).aClass41_Sub1_Sub2_8798 = null;
			aBool8692 = true;
		}
		int i;
		int i_3_;
		if (aClass158_5853 != null) {
			i_3_ = aClass158_5853.method2714();
			i = aClass158_5853.method2716();
		} else {
			i = 0;
			i_3_ = 0;
		}
		((Class505_Sub2) this).aClass32_8714 = new Class32(this, i_3_, i);
		if (!aBool8692) {
			((Class505_Sub2) this).aClass55Array8802[1] = new Class55_Sub1(this);
			((Class505_Sub2) this).aClass32_8714.method816(((Class505_Sub2) this).aClass55Array8802[1]);
		}
		if (((Class505_Sub2) this).aClass41_8753 != null) {
			((Class505_Sub2) this).aClass41_8753.method885();
			((Class505_Sub2) this).aClass41_8753 = null;
		}
		method13899();
	}

	Class41 method13896(int i) {
		return ((Class505_Sub2) this).aClass41Array8793[i];
	}

	void method13897() {
		method13986(7);
		method13976();
	}

	public void method8573(float f, float f_4_, float f_5_, float[] fs) {
		float f_6_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * f_4_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * f_5_));
		float f_7_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * f_4_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * f_5_));
		float f_8_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * f_4_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * f_5_));
		float f_9_ = (aClass384_8740.aFloatArray4667[14] + aClass384_8740.aFloatArray4667[2] * f + aClass384_8740.aFloatArray4667[6] * f_4_ + aClass384_8740.aFloatArray4667[10] * f_5_);
		fs[0] = (((Class505_Sub2) this).aFloat8797 + ((Class505_Sub2) this).aFloat8732 * f_7_ / f_6_);
		fs[1] = (((Class505_Sub2) this).aFloat8741 + ((Class505_Sub2) this).aFloat8734 * f_8_ / f_6_);
		fs[2] = f_9_;
	}

	Class90 method13898() {
		return ((Class505_Sub2) this).aClass90_8807;
	}

	void method13899() {
		((Class505_Sub2) this).aClass32_8714.method819();
		for (int i = 0; i < ((Class505_Sub2) this).aClass55Array8802.length; i++) {
			if (((Class505_Sub2) this).aClass55Array8802[i] != null && ((Class505_Sub2) this).aClass55Array8802[i].method1107())
				((Class505_Sub2) this).aClass55Array8802[i].method1099();
		}
		((Class505_Sub2) this).aClass54_8837 = new Class54(this);
		method13944();
		method14009();
		method14177();
		((Class505_Sub2) this).aClass54_8837.method1089(this);
	}

	void method13900() {
		((Class505_Sub2) this).aClass32_8714.method818();
		((Class505_Sub2) this).anInterface4_8746.method26();
		((Class505_Sub2) this).anInterface4_8682.method26();
		((Class505_Sub2) this).anInterface4_8693.method26();
		for (int i = 0; i < 7; i++)
			((Class505_Sub2) this).aClass528_Sub3Array8840[i].method14280();
		((Class505_Sub2) this).aClass54_8837.method1090();
		((Class505_Sub2) this).anInterface32_8834.method26();
	}

	public final NativeSprite method8668(int i, int i_10_, int i_11_, int i_12_, boolean bool) {
		Class160_Sub3 class160_sub3 = new Class160_Sub3(this, i_11_, i_12_, bool, false);
		class160_sub3.method2750(0, 0, i_11_, i_12_, i, i_10_);
		return class160_sub3;
	}

	public final boolean method8399() {
		return true;
	}

	public final void fm(int i, int i_13_, int i_14_, int i_15_) {
		int i_16_;
		int i_17_;
		if (aClass158_5853 != null) {
			i_17_ = aClass158_5853.method2714();
			i_16_ = aClass158_5853.method2716();
		} else {
			i_16_ = 0;
			i_17_ = 0;
		}
		if (i <= 0 && i_14_ >= i_17_ - 1 && i_13_ <= 0 && i_15_ >= i_16_ - 1)
			L();
		else {
			anInt8743 = i >= 0 ? i : 0;
			anInt8744 = i_14_ <= i_17_ ? i_14_ : i_17_;
			anInt8822 = i_13_ >= 0 ? i_13_ : 0;
			anInt8742 = i_15_ <= i_16_ ? i_15_ : i_16_;
			if (!aBool8843) {
				aBool8843 = true;
				method13922();
			}
			method13921();
		}
	}

	void method8397() {
		if (!((Class505_Sub2) this).aBool8681) {
			method13900();
			((Class505_Sub2) this).aClass66_8787.method1279();
			for (Node class282 = ((Class505_Sub2) this).aClass473_8700.method7859(1582659351); class282 != null; class282 = ((Class505_Sub2) this).aClass473_8700.method7857((byte) -126))
				((Class282_Sub1_Sub2) class282).method15609();
			Class13.method508(false, true, 254704194);
			for (int i = 0; i < ((Class505_Sub2) this).aClass41Array8793.length; i++) {
				if (((Class505_Sub2) this).aClass41Array8793[i] != null) {
					((Class505_Sub2) this).aClass41Array8793[i].method878();
					((Class505_Sub2) this).aClass41Array8793[i] = null;
				}
			}
			for (int i = 0; i < ((Class505_Sub2) this).aClass55Array8802.length; i++) {
				if (((Class505_Sub2) this).aClass55Array8802[i] != null) {
					((Class505_Sub2) this).aClass55Array8802[i].method1105();
					((Class505_Sub2) this).aClass55Array8802[i] = null;
				}
			}
			method13886();
			method8398(0);
			((Class505_Sub2) this).aBool8681 = true;
		}
	}

	public void method13901(Interface7 interface7) {
		((Class505_Sub2) this).aClass428_8772.method7201(interface7, anObject8711, 1933309391);
	}

	public static boolean method13902() {
		return Class362.method6278(616047582).method222("jaclib", 350069186);
	}

	public final boolean method8664() {
		return true;
	}

	public final boolean method8403() {
		return ((Class505_Sub2) this).aClass55Array8802[1] != null;
	}

	final void method13903() {
		if (method13889())
			method13953();
		anInt8831 = anInt8773;
		anInt8773 = 0;
	}

	final void method13904(int i) {
		if (((Class505_Sub2) this).anInt8815 != i) {
			Class73 class73;
			boolean bool;
			boolean bool_18_;
			if (i == 1) {
				class73 = Class73.aClass73_727;
				bool = true;
				bool_18_ = true;
			} else if (i == 2) {
				class73 = Class73.aClass73_725;
				bool = false;
				bool_18_ = true;
			} else if (i == 128) {
				class73 = Class73.aClass73_726;
				bool = true;
				bool_18_ = true;
			} else {
				class73 = Class73.aClass73_728;
				bool = false;
				bool_18_ = false;
			}
			if (bool != aBool8818) {
				aBool8818 = bool;
				method14238();
			}
			if (bool_18_ != aBool8817) {
				aBool8817 = bool_18_;
				method13914();
			}
			if (class73 != aClass73_8733) {
				aClass73_8733 = class73;
				method13894();
			}
			((Class505_Sub2) this).anInt8815 = i;
			((Class505_Sub2) this).anInt8703 &= ~0xc;
		}
	}

	public final void iw(int i, float f, float f_19_, float f_20_, float f_21_, float f_22_) {
		boolean bool = ((Class505_Sub2) this).anInt8765 != i;
		if (bool || aFloat8770 != f || aFloat8826 != f_19_) {
			((Class505_Sub2) this).anInt8765 = i;
			aFloat8770 = f;
			aFloat8826 = f_19_;
			if (bool) {
				aFloat8766 = (float) (((Class505_Sub2) this).anInt8765 & 0xff0000) / 1.671168E7F;
				aFloat8767 = (float) (((Class505_Sub2) this).anInt8765 & 0xff00) / 65280.0F;
				aFloat8768 = ((float) (((Class505_Sub2) this).anInt8765 & 0xff) / 255.0F);
				method13948();
			}
			method13949();
		}
		if (((Class505_Sub2) this).aFloatArray8763[0] != f_20_ || ((Class505_Sub2) this).aFloatArray8763[1] != f_21_ || ((Class505_Sub2) this).aFloatArray8763[2] != f_22_) {
			((Class505_Sub2) this).aFloatArray8763[0] = f_20_;
			((Class505_Sub2) this).aFloatArray8763[1] = f_21_;
			((Class505_Sub2) this).aFloatArray8763[2] = f_22_;
			((Class505_Sub2) this).aFloatArray8764[0] = -f_20_;
			((Class505_Sub2) this).aFloatArray8764[1] = -f_21_;
			((Class505_Sub2) this).aFloatArray8764[2] = -f_22_;
			float f_23_ = (float) (1.0 / Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_ + f_22_ * f_22_)));
			aFloatArray8747[0] = f_20_ * f_23_;
			aFloatArray8747[1] = f_21_ * f_23_;
			aFloatArray8747[2] = f_22_ * f_23_;
			aFloatArray8762[0] = -aFloatArray8747[0];
			aFloatArray8762[1] = -aFloatArray8747[1];
			aFloatArray8762[2] = -aFloatArray8747[2];
			method13950();
			((Class505_Sub2) this).anInt8777 = (int) (f_20_ * 256.0F / f_21_);
			((Class505_Sub2) this).anInt8778 = (int) (f_22_ * 256.0F / f_21_);
		}
		method13951();
	}

	public final boolean method8454() {
		return true;
	}

	public final boolean method8407() {
		return false;
	}

	public final boolean method8405() {
		return aBool8828;
	}

	public abstract float method13905();

	public void method8398(int i) {
		if (((Class505_Sub2) this).aClass66_8787 != null)
			((Class505_Sub2) this).aClass66_8787.method1278();
		anInt8820 = i & 0x7fffffff;
	}

	void method13906() {
		method13907();
	}

	void method13907() {
		method13936();
		method13938();
		method13934();
		method8421();
		L();
	}

	public final boolean method8469() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && !((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			boolean bool = ((Class505_Sub2) this).aClass32_8714.method816(((Class505_Sub2) this).aClass55Array8802[1]);
			if (bool)
				((Class505_Sub2) this).aClass66_8787.method1279();
			return bool;
		}
		return false;
	}

	public final void method8490() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			((Class505_Sub2) this).aClass32_8714.method822(((Class505_Sub2) this).aClass55Array8802[1]);
			((Class505_Sub2) this).aClass66_8787.method1279();
		}
	}

	public final boolean method8471() {
		return (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107());
	}

	final void method8592(float f, float f_24_, float f_25_, float f_26_, float f_27_, float f_28_) {
		Class55_Sub1.aFloat9188 = f;
		Class55_Sub1.aFloat9184 = f_24_;
		Class55_Sub1.aFloat9189 = f_25_;
		Class55_Sub1.aFloat9186 = f_28_;
	}

	boolean method13908(float f, float f_29_, float f_30_, float f_31_, float f_32_, float f_33_) {
		aByteBuffer8838.clear();
		aByteBuffer8838.putFloat(f);
		aByteBuffer8838.putFloat(f_29_);
		aByteBuffer8838.putFloat(f_30_);
		aByteBuffer8838.putFloat(f_31_);
		aByteBuffer8838.putFloat(f_32_);
		aByteBuffer8838.putFloat(f_33_);
		return ((Class505_Sub2) this).anInterface4_8682.method42(0, aByteBuffer8838.position(), aLong8695);
	}

	abstract void method13909();

	public final Class282_Sub1 method8438(int i) {
		Class282_Sub1_Sub2 class282_sub1_sub2 = new Class282_Sub1_Sub2(i);
		((Class505_Sub2) this).aClass473_8700.method7877(class282_sub1_sub2, 2122832173);
		return class282_sub1_sub2;
	}

	public final void method8439(Class282_Sub1 class282_sub1) {
		((Class505_Sub2) this).aNativeHeap8699 = (((Class282_Sub1_Sub2) (Class282_Sub1_Sub2) class282_sub1).aNativeHeap10212);
	}

	public final NativeHeapBuffer method13910(int i, boolean bool) {
		return ((Class505_Sub2) this).aNativeHeap8699.method759(i, bool);
	}

	final Interface32 method13911(int i) {
		if (((Class505_Sub2) this).anInterface32_8834.method39() < i * 2)
			((Class505_Sub2) this).anInterface32_8834.method208(i);
		return ((Class505_Sub2) this).anInterface32_8834;
	}

	public final int za() {
		return anInt8702 + anInt8701 + anInt8761;
	}

	public final FontRenderer method8660(Class414 class414, Class91[] class91s, boolean bool) {
		return new Class8_Sub4(this, class414, class91s, bool);
	}

	public final NativeSprite method8444(Class91 class91, boolean bool) {
		NativeSprite class160;
		if (class91.anInt957 != 0 && class91.anInt954 != 0) {
			int[] is = new int[class91.anInt957 * class91.anInt954];
			int i = 0;
			int i_34_ = 0;
			if (class91.aByteArray961 != null) {
				for (int i_35_ = 0; i_35_ < class91.anInt954; i_35_++) {
					for (int i_36_ = 0; i_36_ < class91.anInt957; i_36_++) {
						is[i_34_++] = (class91.aByteArray961[i] << 24 | (class91.anIntArray955[class91.aByteArray960[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_37_ = 0; i_37_ < class91.anInt954; i_37_++) {
					for (int i_38_ = 0; i_38_ < class91.anInt957; i_38_++) {
						int i_39_ = (class91.anIntArray955[class91.aByteArray960[i++] & 0xff]);
						is[i_34_++] = i_39_ != 0 ? ~0xffffff | i_39_ : 0;
					}
				}
			}
			class160 = createNativeSprite(is, 0, class91.anInt957, class91.anInt957, class91.anInt954, 228280722);
		} else
			class160 = createNativeSprite(new int[] { 0 }, 0, 1, 1, 1, -51231437);
		class160.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return class160;
	}

	public final NativeSprite method8442(int[] is, int i, int i_40_, int i_41_, int i_42_, boolean bool) {
		return new Class160_Sub3(this, i_41_, i_42_, is, i, i_40_);
	}

	final Class384 method13912() {
		return aClass384_8727;
	}

	abstract void method13913();

	public final Class455 method8624(int i, int i_43_, int[] is, int[] is_44_) {
		return Class455_Sub1.method13769(this, i, i_43_, is, is_44_);
	}

	abstract void method13914();

	public final MeshRasterizer createMeshRasterizer(RSMesh class157, int i, int i_45_, int i_46_, int i_47_) {
		return new Class528_Sub3(this, class157, i, i_46_, i_47_, i_45_);
	}

	public final void method8542(Class282_Sub1 class282_sub1) {
		((Class505_Sub2) this).aNativeHeap8699 = (((Class282_Sub1_Sub2) (Class282_Sub1_Sub2) class282_sub1).aNativeHeap10212);
	}

	public final int method8546(int i, int i_48_) {
		return i | i_48_;
	}

	public final Class390 method8478(int i, int i_49_, int[][] is, int[][] is_50_, int i_51_, int i_52_, int i_53_) {
		return new Class390_Sub1(this, i_52_, i_53_, i, i_49_, is, is_50_, i_51_);
	}

	abstract void method13915();

	public final Class294 method8450() {
		return ((Class505_Sub2) this).aClass294_8842;
	}

	abstract void method13916();

	public final void method8477(Class152 class152) {
		((Class505_Sub2) this).aClass152_Sub2_8731 = (Class152_Sub2) class152;
	}

	abstract Interface1 method13917(Class150 class150, int i, int i_54_, int i_55_, boolean bool, byte[] is);

	public void method8421() {
		((Class505_Sub2) this).anInt8745 = 0;
		((Class505_Sub2) this).anInt8835 = 0;
		((Class505_Sub2) this).anInt8722 = aClass158_5853.method2714();
		((Class505_Sub2) this).anInt8748 = aClass158_5853.method2716();
		method13918();
	}

	public void method8617(int i, int i_56_, int i_57_, int i_58_) {
		((Class505_Sub2) this).anInt8745 = i;
		((Class505_Sub2) this).anInt8835 = i_56_;
		((Class505_Sub2) this).anInt8722 = i_57_;
		((Class505_Sub2) this).anInt8748 = i_58_;
		method13918();
	}

	final void method13918() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			anInt8749 = ((Class505_Sub2) this).anInt8745;
			anInt8776 = ((Class505_Sub2) this).anInt8835;
			anInt8751 = ((Class505_Sub2) this).anInt8722;
			anInt8752 = ((Class505_Sub2) this).anInt8748;
			aFloat8735 = ((Class505_Sub2) this).aFloat8737;
			aFloat8736 = ((Class505_Sub2) this).aFloat8738;
		} else {
			anInt8749 = 0;
			anInt8776 = 0;
			anInt8751 = aClass158_5853.method2714();
			anInt8752 = aClass158_5853.method2716();
			aFloat8735 = 0.0F;
			aFloat8736 = 1.0F;
		}
		method13920();
		((Class505_Sub2) this).aFloat8732 = (float) ((Class505_Sub2) this).anInt8722 / 2.0F;
		((Class505_Sub2) this).aFloat8734 = (float) ((Class505_Sub2) this).anInt8748 / 2.0F;
		((Class505_Sub2) this).aFloat8797 = ((float) ((Class505_Sub2) this).anInt8745 + ((Class505_Sub2) this).aFloat8732);
		((Class505_Sub2) this).aFloat8741 = ((float) ((Class505_Sub2) this).anInt8835 + ((Class505_Sub2) this).aFloat8734);
	}

	public final boolean method8674() {
		return true;
	}

	public final void qa(int[] is) {
		is[0] = anInt8743;
		is[1] = anInt8822;
		is[2] = anInt8744;
		is[3] = anInt8742;
	}

	public void en(float f, float f_59_) {
		((Class505_Sub2) this).aFloat8737 = f;
		((Class505_Sub2) this).aFloat8738 = f_59_;
		method13918();
	}

	public final void fq(int i, int i_60_, int i_61_, int i_62_, int i_63_) {
		method8433(i, i_60_, i + i_61_, i_60_, i_62_, i_63_);
	}

	public final void o(int i, int i_64_, int i_65_, int i_66_) {
		int i_67_;
		int i_68_;
		if (aClass158_5853 != null) {
			i_68_ = aClass158_5853.method2714();
			i_67_ = aClass158_5853.method2716();
		} else {
			i_67_ = 0;
			i_68_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_65_ = i_65_ <= i_68_ ? i_65_ : i_68_;
		i_64_ = i_64_ >= 0 ? i_64_ : 0;
		i_66_ = i_66_ <= i_67_ ? i_66_ : i_67_;
		boolean bool = false;
		if (anInt8743 < i) {
			anInt8743 = i;
			bool = true;
		}
		if (anInt8744 > i_65_) {
			anInt8744 = i_65_;
			bool = true;
		}
		if (anInt8822 < i_64_) {
			anInt8822 = i_64_;
			bool = true;
		}
		if (anInt8742 > i_66_) {
			anInt8742 = i_66_;
			bool = true;
		}
		if (bool) {
			if (!aBool8843) {
				aBool8843 = true;
				method13922();
			}
			method13921();
		}
	}

	final void method13919(int i, int i_69_) {
		anInt8823 = i;
		anInt8754 = i_69_;
		method13920();
		method13921();
	}

	abstract void method13920();

	abstract void method13921();

	abstract void method13922();

	public abstract void method13923(Class352 class352, int i, int i_70_);

	void method8485() {
		if (!((Class505_Sub2) this).aBool8681) {
			method13900();
			((Class505_Sub2) this).aClass66_8787.method1279();
			for (Node class282 = ((Class505_Sub2) this).aClass473_8700.method7859(484146027); class282 != null; class282 = ((Class505_Sub2) this).aClass473_8700.method7857((byte) -21))
				((Class282_Sub1_Sub2) class282).method15609();
			Class13.method508(false, true, 1160906359);
			for (int i = 0; i < ((Class505_Sub2) this).aClass41Array8793.length; i++) {
				if (((Class505_Sub2) this).aClass41Array8793[i] != null) {
					((Class505_Sub2) this).aClass41Array8793[i].method878();
					((Class505_Sub2) this).aClass41Array8793[i] = null;
				}
			}
			for (int i = 0; i < ((Class505_Sub2) this).aClass55Array8802.length; i++) {
				if (((Class505_Sub2) this).aClass55Array8802[i] != null) {
					((Class505_Sub2) this).aClass55Array8802[i].method1105();
					((Class505_Sub2) this).aClass55Array8802[i] = null;
				}
			}
			method13886();
			method8398(0);
			((Class505_Sub2) this).aBool8681 = true;
		}
	}

	abstract void method13924();

	abstract Interface4 method13925(boolean bool);

	public void method8650(float f, float f_71_, float f_72_, float[] fs) {
		float f_73_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * f_71_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * f_72_));
		float f_74_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * f_71_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * f_72_));
		float f_75_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * f_71_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * f_72_));
		float f_76_ = (aClass384_8740.aFloatArray4667[14] + aClass384_8740.aFloatArray4667[2] * f + aClass384_8740.aFloatArray4667[6] * f_71_ + aClass384_8740.aFloatArray4667[10] * f_72_);
		fs[0] = (((Class505_Sub2) this).aFloat8797 + ((Class505_Sub2) this).aFloat8732 * f_74_ / f_73_);
		fs[1] = (((Class505_Sub2) this).aFloat8741 + ((Class505_Sub2) this).aFloat8734 * f_75_ / f_73_);
		fs[2] = f_76_;
	}

	final void method13926() {
		((Class505_Sub2) this).aClass384_8728.method6562(aClass384_8740);
		((Class505_Sub2) this).aClass384_8728.method6523(((Class505_Sub2) this).aClass384_8724);
		((Class505_Sub2) this).aClass384_8728.method6539(((Class505_Sub2) this).aFloatArrayArray8730[0]);
		((Class505_Sub2) this).aClass384_8728.method6540(((Class505_Sub2) this).aFloatArrayArray8730[1]);
		((Class505_Sub2) this).aClass384_8728.method6535(((Class505_Sub2) this).aFloatArrayArray8730[2]);
		((Class505_Sub2) this).aClass384_8728.method6536(((Class505_Sub2) this).aFloatArrayArray8730[3]);
		((Class505_Sub2) this).aClass384_8728.method6613(((Class505_Sub2) this).aFloatArrayArray8730[4]);
		((Class505_Sub2) this).aClass384_8728.method6538(((Class505_Sub2) this).aFloatArrayArray8730[5]);
		aClass384_8729.method6562(((Class505_Sub2) this).aClass384_8728);
		method13933(aClass384_8729);
	}

	public final Class384 method8453() {
		return ((Class505_Sub2) this).aClass384_8724;
	}

	final void method13927() {
		((Class505_Sub2) this).aBool8829 = false;
	}

	final Class384 method13928() {
		return aClass384_8729;
	}

	void method13929() {
		method13986(7);
		method13976();
	}

	Class384 method13930() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			if (!((Class505_Sub2) this).aBool8829)
				method14130();
			return ((Class505_Sub2) this).aClass384_8685;
		}
		return ((Class505_Sub2) this).aClass384_8705;
	}

	final Class384 method13931() {
		return aClass384_8729;
	}

	final void method13932() {
		if (!((Class505_Sub2) this).aBool8720) {
			int i;
			int i_77_;
			if (aClass158_5853 != null) {
				i_77_ = aClass158_5853.method2714();
				i = aClass158_5853.method2716();
			} else {
				i = 0;
				i_77_ = 0;
			}
			Class384 class384 = ((Class505_Sub2) this).aClass384_8774;
			if (i_77_ != 0 && i != 0)
				class384.method6530(0.0F, (float) i_77_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				class384.method6518();
			((Class505_Sub2) this).aClass384_8812.method6562(class384);
			method13933(((Class505_Sub2) this).aClass384_8812);
			((Class505_Sub2) this).aBool8720 = true;
		}
	}

	public abstract void method13933(Class384 class384);

	final void method13934() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_380) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_380;
			if (class33 == Class33.aClass33_381)
				method13927();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8725;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method13935() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_379) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_379;
			if (class33 == Class33.aClass33_381)
				method13927();
			method13932();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8774;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0x8;
		}
	}

	final void method13936() {
		((Class505_Sub2) this).aBool8720 = false;
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_379) {
			method13932();
			method14030();
		}
	}

	final void method13937() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_381) {
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_381;
			method13927();
			method13940();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8724;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0x7;
		}
	}

	final void method13938() {
		((Class505_Sub2) this).aBool8723 = false;
		method13940();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method14030();
	}

	final void method13939(Class352 class352, int i) {
		method14161(0, ((Class505_Sub2) this).anInterface4_8746);
		method13996(((Class505_Sub2) this).aClass70_8786);
		method13923(class352, 0, i);
	}

	final void method13940() {
		if (!((Class505_Sub2) this).aBool8723)
			((Class505_Sub2) this).aBool8723 = true;
	}

	public final boolean method8644() {
		return true;
	}

	public final void RA(boolean bool) {
		aBool8755 = bool;
		method14054();
	}

	final void method13941(boolean bool) {
		if (bool != aBool8757) {
			aBool8757 = bool;
			method13956();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method13942(boolean bool) {
		if (bool != aBool8756) {
			aBool8756 = bool;
			method14054();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method13943(boolean bool) {
		if (bool != aBool8757) {
			aBool8757 = bool;
			method13956();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method13944() {
		((Class505_Sub2) this).anInterface4_8746 = method13994(false);
		int i = 160;
		((Class505_Sub2) this).anInterface4_8746.method31(i, 32);
		aByteBuffer8838.clear();
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putInt(-1);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putInt(-1);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putInt(-1);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putInt(-1);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(1.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putInt(-1);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		((Class505_Sub2) this).anInterface4_8746.method42(0, aByteBuffer8838.position(), aLong8695);
		((Class505_Sub2) this).aClass70_8786 = method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_690, Class69.aClass69_692, Class69.aClass69_692 }) });
	}

	public void method8479(float f, float f_78_, float f_79_, float[] fs) {
		float f_80_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * f_78_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * f_79_));
		float f_81_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * f_78_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * f_79_));
		float f_82_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * f_78_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * f_79_));
		float f_83_ = (aClass384_8740.aFloatArray4667[14] + aClass384_8740.aFloatArray4667[2] * f + aClass384_8740.aFloatArray4667[6] * f_78_ + aClass384_8740.aFloatArray4667[10] * f_79_);
		fs[0] = (((Class505_Sub2) this).aFloat8797 + ((Class505_Sub2) this).aFloat8732 * f_81_ / f_80_);
		fs[1] = (((Class505_Sub2) this).aFloat8741 + ((Class505_Sub2) this).aFloat8734 * f_82_ / f_80_);
		fs[2] = f_83_;
	}

	public void method8515(float f, float f_84_, float f_85_, float[] fs) {
		float f_86_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * f_84_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * f_85_));
		float f_87_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * f_84_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * f_85_));
		if (f_86_ < -f_87_ || f_86_ > f_87_) {
			float[] fs_88_ = fs;
			float[] fs_89_ = fs;
			fs[2] = Float.NaN;
			fs_89_[1] = Float.NaN;
			fs_88_[0] = Float.NaN;
		} else {
			float f_90_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * f) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * f_84_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * f_85_));
			if (f_90_ < -f_87_ || f_90_ > f_87_) {
				float[] fs_91_ = fs;
				float[] fs_92_ = fs;
				fs[2] = Float.NaN;
				fs_92_[1] = Float.NaN;
				fs_91_[0] = Float.NaN;
			} else {
				float f_93_ = ((((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13]) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1]) * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5]) * f_84_ + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9]) * f_85_);
				if (f_93_ < -f_87_ || f_93_ > f_87_) {
					float[] fs_94_ = fs;
					float[] fs_95_ = fs;
					fs[2] = Float.NaN;
					fs_95_[1] = Float.NaN;
					fs_94_[0] = Float.NaN;
				} else {
					float f_96_ = (aClass384_8740.aFloatArray4667[14] + aClass384_8740.aFloatArray4667[2] * f + aClass384_8740.aFloatArray4667[6] * f_84_ + aClass384_8740.aFloatArray4667[10] * f_85_);
					fs[0] = (((Class505_Sub2) this).aFloat8797 + (((Class505_Sub2) this).aFloat8732 * f_90_ / f_87_));
					fs[1] = (((Class505_Sub2) this).aFloat8741 + (((Class505_Sub2) this).aFloat8734 * f_93_ / f_87_));
					fs[2] = f_96_;
				}
			}
		}
	}

	abstract void method13945();

	public final void method8516(int i, int i_97_, float f, int i_98_, int i_99_, float f_100_, int i_101_, int i_102_, float f_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		/* empty */
	}

	final void method13946(boolean bool) {
		if (bool != aBool8684) {
			aBool8684 = bool;
			method14204();
			((Class505_Sub2) this).anInt8703 &= ~0x7;
		}
	}

	public final void method8547(int i, Class282_Sub24[] class282_sub24s) {
		for (int i_108_ = 0; i_108_ < i; i_108_++)
			aClass282_Sub24Array8716[i_108_] = class282_sub24s[i_108_];
		anInt8773 = i;
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method13903();
	}

	public final void IA(float f) {
		if (aFloat8769 != f) {
			aFloat8769 = f;
			method13948();
			method13951();
		}
	}

	public final void m(int i, float f, float f_109_, float f_110_, float f_111_, float f_112_) {
		boolean bool = ((Class505_Sub2) this).anInt8765 != i;
		if (bool || aFloat8770 != f || aFloat8826 != f_109_) {
			((Class505_Sub2) this).anInt8765 = i;
			aFloat8770 = f;
			aFloat8826 = f_109_;
			if (bool) {
				aFloat8766 = (float) (((Class505_Sub2) this).anInt8765 & 0xff0000) / 1.671168E7F;
				aFloat8767 = (float) (((Class505_Sub2) this).anInt8765 & 0xff00) / 65280.0F;
				aFloat8768 = ((float) (((Class505_Sub2) this).anInt8765 & 0xff) / 255.0F);
				method13948();
			}
			method13949();
		}
		if (((Class505_Sub2) this).aFloatArray8763[0] != f_110_ || ((Class505_Sub2) this).aFloatArray8763[1] != f_111_ || ((Class505_Sub2) this).aFloatArray8763[2] != f_112_) {
			((Class505_Sub2) this).aFloatArray8763[0] = f_110_;
			((Class505_Sub2) this).aFloatArray8763[1] = f_111_;
			((Class505_Sub2) this).aFloatArray8763[2] = f_112_;
			((Class505_Sub2) this).aFloatArray8764[0] = -f_110_;
			((Class505_Sub2) this).aFloatArray8764[1] = -f_111_;
			((Class505_Sub2) this).aFloatArray8764[2] = -f_112_;
			float f_113_ = (float) (1.0 / Math.sqrt((double) (f_110_ * f_110_ + f_111_ * f_111_ + f_112_ * f_112_)));
			aFloatArray8747[0] = f_110_ * f_113_;
			aFloatArray8747[1] = f_111_ * f_113_;
			aFloatArray8747[2] = f_112_ * f_113_;
			aFloatArray8762[0] = -aFloatArray8747[0];
			aFloatArray8762[1] = -aFloatArray8747[1];
			aFloatArray8762[2] = -aFloatArray8747[2];
			method13950();
			((Class505_Sub2) this).anInt8777 = (int) (f_110_ * 256.0F / f_111_);
			((Class505_Sub2) this).anInt8778 = (int) (f_112_ * 256.0F / f_111_);
		}
		method13951();
	}

	public final int method8452(int i, int i_114_) {
		return i & i_114_ ^ i_114_;
	}

	public final void method13947(int i) {
		switch (i) {
		case 0:
			method13966(Class68.aClass68_683, Class68.aClass68_683);
			break;
		case 4:
			method13966(Class68.aClass68_685, Class68.aClass68_685);
			break;
		case 2:
			method13966(Class68.aClass68_682, Class68.aClass68_687);
			break;
		case 1:
			method13966(Class68.aClass68_687, Class68.aClass68_687);
			break;
		case 3:
			method13966(Class68.aClass68_684, Class68.aClass68_683);
			break;
		}
	}

	abstract void method13948();

	abstract void method13949();

	abstract void method13950();

	abstract void method13951();

	public final int method8463() {
		return anInt8799 - 2;
	}

	abstract void method13952();

	abstract void method13953();

	abstract boolean method13954(Class150 class150, Class76 class76);

	abstract boolean method13955(Class150 class150, Class76 class76);

	abstract void method13956();

	final Interface6 method13957(Class150 class150, int i, int i_115_, boolean bool, byte[] is) {
		return method14143(class150, i, i_115_, bool, is, 0, 0);
	}

	final Interface6 method13958(Class150 class150, int i, int i_116_, boolean bool, float[] fs) {
		return method13961(class150, i, i_116_, bool, fs, 0, 0);
	}

	public abstract void method13959(Class352 class352, int i, int i_117_);

	final void method13960() {
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			aClass37Array8783[anInt8780] = Class37.aClass37_393;
			aClass384Array8782[anInt8780].method6518();
			method14133();
		}
	}

	abstract Interface6 method13961(Class150 class150, int i, int i_118_, boolean bool, float[] fs, int i_119_, int i_120_);

	public Class294 method8458() {
		return ((Class505_Sub2) this).aClass294_8706;
	}

	public final void il(int i) {
		((Class505_Sub2) this).anInt8806 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class505_Sub2) this).anInt8806++;
		((Class505_Sub2) this).anInt8775 = 1 << ((Class505_Sub2) this).anInt8806;
	}

	abstract Interface1 method13962(Class150 class150, int i, int i_121_, int i_122_, boolean bool, byte[] is);

	public final void method8426(int i, Class282_Sub24[] class282_sub24s) {
		for (int i_123_ = 0; i_123_ < i; i_123_++)
			aClass282_Sub24Array8716[i_123_] = class282_sub24s[i_123_];
		anInt8773 = i;
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method13903();
	}

	public final void method8568(boolean bool) {
		/* empty */
	}

	public final int method13963() {
		return anInt8780;
	}

	public final void XA(int i, int i_124_, int i_125_, int i_126_, int i_127_) {
		method8433(i, i_124_, i + i_125_, i_124_, i_126_, i_127_);
	}

	final void fr(int i, int i_128_, int i_129_, int i_130_, int i_131_) {
		/* empty */
	}

	public abstract void method13964();

	public final Interface31 method13965() {
		return (((Class505_Sub2) this).aClass152_Sub2_8731 != null ? ((Class505_Sub2) this).aClass152_Sub2_8731.method14241() : null);
	}

	public final void method13966(Class68 class68, Class68 class68_132_) {
		boolean bool = false;
		if (aClass68Array8784[anInt8780] != class68) {
			aClass68Array8784[anInt8780] = class68;
			method13979();
			bool = true;
		}
		if (aClass68Array8785[anInt8780] != class68_132_) {
			aClass68Array8785[anInt8780] = class68_132_;
			method13980();
			bool = true;
		}
		if (bool)
			((Class505_Sub2) this).anInt8703 &= ~0xd;
	}

	public final void method13967(int i, Class67 class67) {
		method13968(i, class67, false, false);
	}

	abstract void method13968(int i, Class67 class67, boolean bool, boolean bool_133_);

	public final void method13969(int i, Class67 class67) {
		method13970(i, class67, false);
	}

	abstract void method13970(int i, Class67 class67, boolean bool);

	public void method13971(int i) {
		if (i != anInt8758) {
			anInt8758 = i;
			method13987();
		}
	}

	final void method13972() {
		((Class505_Sub2) this).anInterface4_8693 = method13994(false);
		((Class505_Sub2) this).anInterface4_8693.method31(3096, 12);
		aByteBuffer8838.clear();
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_134_ = (float) Math.sin(d);
			aByteBuffer8838.putFloat(f_134_);
			aByteBuffer8838.putFloat(f);
			aByteBuffer8838.putFloat(0.0F);
		}
		((Class505_Sub2) this).anInterface4_8693.method42(0, aByteBuffer8838.position(), aLong8695);
	}

	public final Class384 method13973() {
		return aClass384Array8782[anInt8780];
	}

	public final void method13974(Class37 class37) {
		aClass37Array8783[anInt8780] = class37;
		method14133();
	}

	abstract boolean method13975(Class150 class150, Class76 class76);

	public final void method8585(int i, Class90 class90) {
		((Class505_Sub2) this).anInt8739 = i;
		((Class505_Sub2) this).aClass90_8807 = class90;
		((Class505_Sub2) this).aBool8779 = true;
	}

	final void method13976() {
		method13948();
		method13949();
		method14204();
		method13903();
		method13950();
		method13951();
		method13952();
		method13956();
		method14054();
		method13991();
		method14013();
		method13914();
		method13894();
		method14238();
		for (int i = anInt8825 - 1; i >= 0; i--) {
			method14163(i);
			method13979();
			method13980();
			method13960();
		}
		method13987();
		method13920();
	}

	final void method13977() {
		if (method13889())
			method13953();
		anInt8831 = anInt8773;
		anInt8773 = 0;
	}

	abstract void method13978();

	abstract void method13979();

	abstract void method13980();

	final void method13981(boolean bool) {
		if (bool != aBool8684) {
			aBool8684 = bool;
			method14204();
			((Class505_Sub2) this).anInt8703 &= ~0x7;
		}
	}

	public final void method8475(int i, Class90 class90) {
		((Class505_Sub2) this).anInt8739 = i;
		((Class505_Sub2) this).aClass90_8807 = class90;
		((Class505_Sub2) this).aBool8779 = true;
	}

	abstract void method13982();

	public abstract void method13983(Class352 class352, int i, int i_135_, int i_136_, int i_137_);

	Class114 method13984(byte[] is) {
		if (is == null)
			return null;
		Class114 class114;
		try {
			class114 = new Class114(is);
		} catch (Exception exception) {
			return null;
		}
		return class114;
	}

	final void method13985(int i) {
		if (anInt8844 != i) {
			anInt8844 = i;
			method13894();
		}
	}

	abstract void method13986(int i);

	public final void L() {
		if (aClass158_5853 != null) {
			anInt8822 = 0;
			anInt8743 = 0;
			anInt8744 = aClass158_5853.method2714();
			anInt8742 = aClass158_5853.method2716();
		} else {
			anInt8742 = 0;
			anInt8744 = 0;
			anInt8822 = 0;
			anInt8743 = 0;
		}
		if (aBool8843) {
			aBool8843 = false;
			method13922();
		}
	}

	abstract void method13987();

	final Class384 method13988() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			return aClass384_8740;
		return aClass384_8712;
	}

	final void method13989(boolean bool) {
		if (bool != aBool8808) {
			aBool8808 = bool;
			method13991();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	public final void c(int i, int i_138_, int i_139_) {
		if (anInt8810 != i || anInt8811 != i_138_ || anInt8680 != i_139_) {
			anInt8810 = i;
			anInt8811 = i_138_;
			anInt8680 = i_139_;
			method14062();
			method13991();
		}
	}

	public final void method8457(Class294 class294) {
		((Class505_Sub2) this).aClass294_8706 = class294;
		aClass384_8740.method6522(((Class505_Sub2) this).aClass294_8706);
		((Class505_Sub2) this).aClass294_8804.method5209(class294);
		((Class505_Sub2) this).aClass294_8804.method5207();
		((Class505_Sub2) this).aClass384_8814.method6522(((Class505_Sub2) this).aClass294_8804);
		method13926();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method13927();
	}

	final void method13990() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			anInt8749 = ((Class505_Sub2) this).anInt8745;
			anInt8776 = ((Class505_Sub2) this).anInt8835;
			anInt8751 = ((Class505_Sub2) this).anInt8722;
			anInt8752 = ((Class505_Sub2) this).anInt8748;
			aFloat8735 = ((Class505_Sub2) this).aFloat8737;
			aFloat8736 = ((Class505_Sub2) this).aFloat8738;
		} else {
			anInt8749 = 0;
			anInt8776 = 0;
			anInt8751 = aClass158_5853.method2714();
			anInt8752 = aClass158_5853.method2716();
			aFloat8735 = 0.0F;
			aFloat8736 = 1.0F;
		}
		method13920();
		((Class505_Sub2) this).aFloat8732 = (float) ((Class505_Sub2) this).anInt8722 / 2.0F;
		((Class505_Sub2) this).aFloat8734 = (float) ((Class505_Sub2) this).anInt8748 / 2.0F;
		((Class505_Sub2) this).aFloat8797 = ((float) ((Class505_Sub2) this).anInt8745 + ((Class505_Sub2) this).aFloat8732);
		((Class505_Sub2) this).aFloat8741 = ((float) ((Class505_Sub2) this).anInt8835 + ((Class505_Sub2) this).aFloat8734);
	}

	abstract void method13991();

	abstract void method13992(boolean bool);

	abstract Interface32 method13993(boolean bool);

	abstract Interface4 method13994(boolean bool);

	abstract Class70 method13995(Class72[] class72s);

	public abstract void method13996(Class70 class70);

	public final void DA(int i, Class455 class455, int i_140_, int i_141_) {
		RA(false);
		((Class505_Sub2) this).aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) method8523((byte) 111).method2714(), 0.0F, 0.0F, (float) method8523((byte) 117).method2716(), 0, class455, i_140_, i_141_);
		RA(true);
	}

	abstract void method13997(Interface32 interface32);

	final Class384 method13998() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			return ((Class505_Sub2) this).aClass384_8814;
		return aClass384_8712;
	}

	public final void method8595(boolean bool) {
		/* empty */
	}

	public final void method8430(int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_) {
		method8433(i, i_142_, i + i_143_, i_142_, i_145_, i_146_);
		method8433(i, i_142_ + i_144_, i + i_143_, i_142_ + i_144_, i_145_, i_146_);
		method8433(i, i_142_, i, i_142_ + i_144_, i_145_, i_146_);
		method8433(i + i_143_, i_142_, i + i_143_, i_142_ + i_144_, i_145_, i_146_);
	}

	public final void N(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, byte[] is, int i_152_, int i_153_) {
		/* empty */
	}

	public final void method8658(int i, int i_154_, float f, int i_155_, int i_156_, float f_157_, int i_158_, int i_159_, float f_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		/* empty */
	}

	final void CA(int i, int i_165_, int i_166_, int i_167_, int i_168_) {
		/* empty */
	}

	public final void fo(int i, int i_169_, int i_170_, int i_171_, int i_172_) {
		method8433(i, i_169_, i, i_169_ + i_170_, i_171_, i_172_);
	}

	public final void ez() {
		if (aClass158_5853 != null) {
			anInt8822 = 0;
			anInt8743 = 0;
			anInt8744 = aClass158_5853.method2714();
			anInt8742 = aClass158_5853.method2716();
		} else {
			anInt8742 = 0;
			anInt8744 = 0;
			anInt8822 = 0;
			anInt8743 = 0;
		}
		if (aBool8843) {
			aBool8843 = false;
			method13922();
		}
	}

	public final void method8433(int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_) {
		method8496(i, i_173_, i_174_, i_175_, i_176_, 1, i_177_);
	}

	public void method8435(int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_) {
		float f = (float) i_179_ - (float) i;
		float f_186_ = (float) i_180_ - (float) i_178_;
		if (f == 0.0F && f_186_ == 0.0F)
			f = 1.0F;
		else {
			float f_187_ = (float) (1.0 / Math.sqrt((double) (f * f + f_186_ * f_186_)));
			f *= f_187_;
			f_186_ *= f_187_;
		}
		method13935();
		Class41 class41 = ((Class505_Sub2) this).aClass41Array8793[13];
		class41.method873();
		class41.method875(i_181_);
		method13904(i_182_);
		class41.method879();
		method13992(false);
		i_185_ %= i_184_ + i_183_;
		float f_188_ = f * (float) i_183_;
		float f_189_ = f_186_ * (float) i_183_;
		float f_190_ = 0.0F;
		float f_191_ = 0.0F;
		float f_192_ = f_188_;
		float f_193_ = f_189_;
		if (i_185_ > i_183_) {
			f_190_ = f * (float) (i_183_ + i_184_ - i_185_);
			f_191_ = f_186_ * (float) (i_183_ + i_184_ - i_185_);
		} else {
			f_192_ = f * (float) (i_183_ - i_185_);
			f_193_ = f_186_ * (float) (i_183_ - i_185_);
		}
		float f_194_ = (float) i + f_190_;
		float f_195_ = (float) i_178_ + f_191_;
		float f_196_ = f * (float) i_184_;
		float f_197_ = f_186_ * (float) i_184_;
		for (;;) {
			if (i_179_ > i) {
				if (f_194_ > (float) i_179_)
					break;
				if (f_194_ + f_192_ > (float) i_179_)
					f_192_ = (float) i_179_ - f_194_;
			} else {
				if (f_194_ < (float) i_179_)
					break;
				if (f_194_ + f_192_ < (float) i_179_)
					f_192_ = (float) i_179_ - f_194_;
			}
			if (i_180_ > i_178_) {
				if (f_195_ > (float) i_180_)
					break;
				if (f_195_ + f_193_ > (float) i_180_)
					f_193_ = (float) i_180_ - f_195_;
			} else {
				if (f_195_ < (float) i_180_)
					break;
				if (f_195_ + f_193_ < (float) i_180_)
					f_193_ = (float) i_180_ - f_195_;
			}
			if (!method13908(f_194_, f_195_, 0.0F, f_194_ + f_192_, f_195_ + f_193_, 0.0F))
				return;
			method14000();
			f_194_ += f_196_ + f_192_;
			f_195_ += f_197_ + f_193_;
			f_192_ = f_188_;
			f_193_ = f_189_;
		}
		method13992(true);
		class41.method885();
	}

	public void method8563(int i, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, Class455 class455, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_) {
		/* empty */
	}

	abstract void method13999();

	public final void method8496(int i, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_) {
		i += 1.0F;
		i_208_ += 1.0F;
		i_209_ += 1.0F;
		i_210_ += 1.0F;
		float f = (float) (i_209_ - i);
		float f_214_ = (float) (i_210_ - i_208_);
		float f_215_ = 1.0F / (float) Math.sqrt((double) (f * f + f_214_ * f_214_));
		f *= f_215_;
		f_214_ *= f_215_;
		i -= f;
		i_208_ -= f_214_;
		float f_216_ = -f_214_;
		float f_217_ = f;
		f_216_ *= 0.5F * (float) i_212_;
		f_217_ *= 0.5F * (float) i_212_;
		((Class505_Sub2) this).aClass160_Sub3_8790.method2763((float) i - f_216_, (float) i_208_ - f_217_, (float) i_209_ - f_216_, (float) i_210_ - f_217_, (float) i + f_216_, (float) i_208_ + f_217_, 0, i_211_, i_213_);
	}

	public final void method8456(Class151 class151) {
		((Class505_Sub2) this).aClass54_8837.method1091(this, class151);
	}

	final void method14000() {
		method14161(0, ((Class505_Sub2) this).anInterface4_8682);
		method13996(((Class505_Sub2) this).aClass70_8833);
		method13923(Class352.aClass352_4099, 0, 1);
	}

	public final void hi(int i, Class455 class455, int i_218_, int i_219_) {
		RA(false);
		((Class505_Sub2) this).aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) method8523((byte) 105).method2714(), 0.0F, 0.0F, (float) method8523((byte) 119).method2716(), 0, class455, i_218_, i_219_);
		RA(true);
	}

	final void method14001(Class352 class352, int i) {
		method14161(0, ((Class505_Sub2) this).anInterface4_8746);
		method13996(((Class505_Sub2) this).aClass70_8786);
		method13923(class352, 0, i);
	}

	public void method8619(float f, float f_220_, float f_221_, float[] fs) {
		float f_222_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * f_220_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * f_221_));
		float f_223_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + ((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * f_220_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * f_221_));
		if (f_222_ < -f_223_ || f_222_ > f_223_) {
			float[] fs_224_ = fs;
			float[] fs_225_ = fs;
			fs[2] = Float.NaN;
			fs_225_[1] = Float.NaN;
			fs_224_[0] = Float.NaN;
		} else {
			float f_226_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * f) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * f_220_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * f_221_));
			if (f_226_ < -f_223_ || f_226_ > f_223_) {
				float[] fs_227_ = fs;
				float[] fs_228_ = fs;
				fs[2] = Float.NaN;
				fs_228_[1] = Float.NaN;
				fs_227_[0] = Float.NaN;
			} else {
				float f_229_ = ((((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13]) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1]) * f + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5]) * f_220_ + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9]) * f_221_);
				if (f_229_ < -f_223_ || f_229_ > f_223_) {
					float[] fs_230_ = fs;
					float[] fs_231_ = fs;
					fs[2] = Float.NaN;
					fs_231_[1] = Float.NaN;
					fs_230_[0] = Float.NaN;
				} else {
					float f_232_ = (aClass384_8740.aFloatArray4667[14] + aClass384_8740.aFloatArray4667[2] * f + aClass384_8740.aFloatArray4667[6] * f_220_ + aClass384_8740.aFloatArray4667[10] * f_221_);
					fs[0] = (((Class505_Sub2) this).aFloat8797 + (((Class505_Sub2) this).aFloat8732 * f_226_ / f_223_));
					fs[1] = (((Class505_Sub2) this).aFloat8741 + (((Class505_Sub2) this).aFloat8734 * f_229_ / f_223_));
					fs[2] = f_232_;
				}
			}
		}
	}

	public abstract void method14002(Class352 class352, int i, int i_233_, int i_234_, int i_235_);

	public final void method14003() {
		if (((Class505_Sub2) this).anInt8703 != 2) {
			method13935();
			method13989(false);
			method13946(false);
			method13941(false);
			method13942(false);
			((Class505_Sub2) this).anInt8703 = 2;
		}
	}

	final void method14004() {
		if (((Class505_Sub2) this).anInt8703 != 8) {
			method13937();
			method13989(true);
			method13941(true);
			method13942(true);
			method13904(1);
			((Class505_Sub2) this).anInt8703 = 8;
		}
	}

	final void method14005() {
		method14226();
	}

	void method8531() {
		if (!((Class505_Sub2) this).aBool8681) {
			method13900();
			((Class505_Sub2) this).aClass66_8787.method1279();
			for (Node class282 = ((Class505_Sub2) this).aClass473_8700.method7859(648505294); class282 != null; class282 = ((Class505_Sub2) this).aClass473_8700.method7857((byte) -94))
				((Class282_Sub1_Sub2) class282).method15609();
			Class13.method508(false, true, -1983988311);
			for (int i = 0; i < ((Class505_Sub2) this).aClass41Array8793.length; i++) {
				if (((Class505_Sub2) this).aClass41Array8793[i] != null) {
					((Class505_Sub2) this).aClass41Array8793[i].method878();
					((Class505_Sub2) this).aClass41Array8793[i] = null;
				}
			}
			for (int i = 0; i < ((Class505_Sub2) this).aClass55Array8802.length; i++) {
				if (((Class505_Sub2) this).aClass55Array8802[i] != null) {
					((Class505_Sub2) this).aClass55Array8802[i].method1105();
					((Class505_Sub2) this).aClass55Array8802[i] = null;
				}
			}
			method13886();
			method8398(0);
			((Class505_Sub2) this).aBool8681 = true;
		}
	}

	final void method14006(boolean bool) {
		if (bool != aBool8756) {
			aBool8756 = bool;
			method14054();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	void method8486() {
		if (!((Class505_Sub2) this).aBool8681) {
			method13900();
			((Class505_Sub2) this).aClass66_8787.method1279();
			for (Node class282 = ((Class505_Sub2) this).aClass473_8700.method7859(1197266143); class282 != null; class282 = ((Class505_Sub2) this).aClass473_8700.method7857((byte) -117))
				((Class282_Sub1_Sub2) class282).method15609();
			Class13.method508(false, true, 116257248);
			for (int i = 0; i < ((Class505_Sub2) this).aClass41Array8793.length; i++) {
				if (((Class505_Sub2) this).aClass41Array8793[i] != null) {
					((Class505_Sub2) this).aClass41Array8793[i].method878();
					((Class505_Sub2) this).aClass41Array8793[i] = null;
				}
			}
			for (int i = 0; i < ((Class505_Sub2) this).aClass55Array8802.length; i++) {
				if (((Class505_Sub2) this).aClass55Array8802[i] != null) {
					((Class505_Sub2) this).aClass55Array8802[i].method1105();
					((Class505_Sub2) this).aClass55Array8802[i] = null;
				}
			}
			method13886();
			method8398(0);
			((Class505_Sub2) this).aBool8681 = true;
		}
	}

	public void method8487(int i) {
		if (((Class505_Sub2) this).aClass66_8787 != null)
			((Class505_Sub2) this).aClass66_8787.method1278();
		anInt8820 = i & 0x7fffffff;
	}

	public final Class455 method8553(int i, int i_236_, int[] is, int[] is_237_) {
		return Class455_Sub1.method13769(this, i, i_236_, is, is_237_);
	}

	public final int dd() {
		return anInt8702 + anInt8701 + anInt8761;
	}

	public final void method8424(Class384 class384) {
		((Class505_Sub2) this).aClass384_8724.method6562(class384);
		method13926();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method14030();
	}

	public final Class384 method8571() {
		return ((Class505_Sub2) this).aClass384_8841;
	}

	public final int dv() {
		return anInt8702 + anInt8701 + anInt8761;
	}

	public final boolean method8489() {
		return true;
	}

	final void method14007() {
		((Class505_Sub2) this).anInterface4_8682 = method13994(true);
		((Class505_Sub2) this).anInterface4_8682.method31(24, 12);
		((Class505_Sub2) this).aClass70_8833 = method13995(new Class72[] { new Class72(Class69.aClass69_695) });
	}

	public final boolean method8528() {
		return true;
	}

	public final void method8581(Class151 class151) {
		((Class505_Sub2) this).aClass54_8837.method1091(this, class151);
	}

	public final boolean method8599() {
		return ((Class505_Sub2) this).aClass55Array8802[1] != null;
	}

	public final boolean method8464() {
		return ((Class505_Sub2) this).aClass55Array8802[1] != null;
	}

	public final boolean method8649() {
		return ((Class505_Sub2) this).aClass55Array8802[1] != null;
	}

	abstract Interface6 method14008(int i, int i_238_, boolean bool, int[] is, int i_239_, int i_240_);

	public final boolean method8431() {
		return true;
	}

	final void method14009() {
		((Class505_Sub2) this).anInterface4_8682 = method13994(true);
		((Class505_Sub2) this).anInterface4_8682.method31(24, 12);
		((Class505_Sub2) this).aClass70_8833 = method13995(new Class72[] { new Class72(Class69.aClass69_695) });
	}

	public final boolean method8498() {
		return true;
	}

	Class41 method14010(int i) {
		return ((Class505_Sub2) this).aClass41Array8793[i];
	}

	abstract Interface31 method14011(int i, boolean bool, int[][] is);

	public final NativeHeapBuffer method14012(int i, boolean bool) {
		return ((Class505_Sub2) this).aNativeHeap8699.method759(i, bool);
	}

	abstract void method14013();

	public final boolean method8503() {
		return true;
	}

	public final void fh(int[] is) {
		is[0] = anInt8743;
		is[1] = anInt8822;
		is[2] = anInt8744;
		is[3] = anInt8742;
	}

	final void method14014() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_379) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_379;
			if (class33 == Class33.aClass33_381)
				method13927();
			method13932();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8774;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0x8;
		}
	}

	public final void eq(boolean bool) {
		aBool8755 = bool;
		method14054();
	}

	public void method8513(int i, int i_241_, int i_242_, int i_243_) {
		((Class505_Sub2) this).anInt8745 = i;
		((Class505_Sub2) this).anInt8835 = i_241_;
		((Class505_Sub2) this).anInt8722 = i_242_;
		((Class505_Sub2) this).anInt8748 = i_243_;
		method13918();
	}

	abstract void method14015();

	public final void ft(int[] is) {
		is[0] = anInt8743;
		is[1] = anInt8822;
		is[2] = anInt8744;
		is[3] = anInt8742;
	}

	public void ej(float f, float f_244_) {
		((Class505_Sub2) this).aFloat8737 = f;
		((Class505_Sub2) this).aFloat8738 = f_244_;
		method13918();
	}

	void method14016() {
		method13936();
		method13938();
		method13934();
		method8421();
		L();
	}

	public final void eh() {
		if (aClass158_5853 != null) {
			anInt8822 = 0;
			anInt8743 = 0;
			anInt8744 = aClass158_5853.method2714();
			anInt8742 = aClass158_5853.method2716();
		} else {
			anInt8742 = 0;
			anInt8744 = 0;
			anInt8822 = 0;
			anInt8743 = 0;
		}
		if (aBool8843) {
			aBool8843 = false;
			method13922();
		}
	}

	abstract Class70 method14017(Class72[] class72s);

	public final boolean method8404() {
		return true;
	}

	public final void fe(int i, int i_245_, int i_246_, int i_247_) {
		int i_248_;
		int i_249_;
		if (aClass158_5853 != null) {
			i_249_ = aClass158_5853.method2714();
			i_248_ = aClass158_5853.method2716();
		} else {
			i_248_ = 0;
			i_249_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_246_ = i_246_ <= i_249_ ? i_246_ : i_249_;
		i_245_ = i_245_ >= 0 ? i_245_ : 0;
		i_247_ = i_247_ <= i_248_ ? i_247_ : i_248_;
		boolean bool = false;
		if (anInt8743 < i) {
			anInt8743 = i;
			bool = true;
		}
		if (anInt8744 > i_246_) {
			anInt8744 = i_246_;
			bool = true;
		}
		if (anInt8822 < i_245_) {
			anInt8822 = i_245_;
			bool = true;
		}
		if (anInt8742 > i_247_) {
			anInt8742 = i_247_;
			bool = true;
		}
		if (bool) {
			if (!aBool8843) {
				aBool8843 = true;
				method13922();
			}
			method13921();
		}
	}

	public final void fk(int i, int i_250_, int i_251_, int i_252_) {
		int i_253_;
		int i_254_;
		if (aClass158_5853 != null) {
			i_254_ = aClass158_5853.method2714();
			i_253_ = aClass158_5853.method2716();
		} else {
			i_253_ = 0;
			i_254_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_251_ = i_251_ <= i_254_ ? i_251_ : i_254_;
		i_250_ = i_250_ >= 0 ? i_250_ : 0;
		i_252_ = i_252_ <= i_253_ ? i_252_ : i_253_;
		boolean bool = false;
		if (anInt8743 < i) {
			anInt8743 = i;
			bool = true;
		}
		if (anInt8744 > i_251_) {
			anInt8744 = i_251_;
			bool = true;
		}
		if (anInt8822 < i_250_) {
			anInt8822 = i_250_;
			bool = true;
		}
		if (anInt8742 > i_252_) {
			anInt8742 = i_252_;
			bool = true;
		}
		if (bool) {
			if (!aBool8843) {
				aBool8843 = true;
				method13922();
			}
			method13921();
		}
	}

	public static boolean method14018() {
		return Class362.method6278(616047582).method222("jaclib", -1607557208);
	}

	abstract void method14019();

	public final Class152 method8466(int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_) {
		return new Class152_Sub2_Sub1(this, i, i_255_, i_256_, i_257_, i_258_, i_259_);
	}

	public final void method8511(int i, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_) {
		method8433(i, i_260_, i + i_261_, i_260_, i_263_, i_264_);
		method8433(i, i_260_ + i_262_, i + i_261_, i_260_ + i_262_, i_263_, i_264_);
		method8433(i, i_260_, i, i_260_ + i_262_, i_263_, i_264_);
		method8433(i + i_261_, i_260_, i + i_261_, i_260_ + i_262_, i_263_, i_264_);
	}

	public final void method8520(int i, int i_265_, int i_266_, int i_267_, int i_268_, int i_269_) {
		method8433(i, i_265_, i + i_266_, i_265_, i_268_, i_269_);
		method8433(i, i_265_ + i_267_, i + i_266_, i_265_ + i_267_, i_268_, i_269_);
		method8433(i, i_265_, i, i_265_ + i_267_, i_268_, i_269_);
		method8433(i + i_266_, i_265_, i + i_266_, i_265_ + i_267_, i_268_, i_269_);
	}

	public final void fp(int i, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_) {
		if (aBool8755) {
			RA(false);
			((Class505_Sub2) this).aClass160_Sub3_8790.method2754(i, i_270_, i_271_, i_272_, 0, i_273_, i_274_);
			RA(true);
		} else
			((Class505_Sub2) this).aClass160_Sub3_8790.method2754(i, i_270_, i_271_, i_272_, 0, i_273_, i_274_);
	}

	public final void fb(int i, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_) {
		if (aBool8755) {
			RA(false);
			((Class505_Sub2) this).aClass160_Sub3_8790.method2754(i, i_275_, i_276_, i_277_, 0, i_278_, i_279_);
			RA(true);
		} else
			((Class505_Sub2) this).aClass160_Sub3_8790.method2754(i, i_275_, i_276_, i_277_, 0, i_278_, i_279_);
	}

	public final void fv(int i, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_, byte[] is, int i_285_, int i_286_) {
		/* empty */
	}

	public final void ff(int i, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, byte[] is, int i_292_, int i_293_) {
		/* empty */
	}

	public final void method8611() {
		((Class505_Sub2) this).aClass32_8714.method833();
	}

	final void fw(int i, int i_294_, int i_295_, int i_296_, int i_297_) {
		/* empty */
	}

	abstract void method14020();

	final void method14021() {
		((Class505_Sub2) this).aClass384_8728.method6562(aClass384_8740);
		((Class505_Sub2) this).aClass384_8728.method6523(((Class505_Sub2) this).aClass384_8724);
		((Class505_Sub2) this).aClass384_8728.method6539(((Class505_Sub2) this).aFloatArrayArray8730[0]);
		((Class505_Sub2) this).aClass384_8728.method6540(((Class505_Sub2) this).aFloatArrayArray8730[1]);
		((Class505_Sub2) this).aClass384_8728.method6535(((Class505_Sub2) this).aFloatArrayArray8730[2]);
		((Class505_Sub2) this).aClass384_8728.method6536(((Class505_Sub2) this).aFloatArrayArray8730[3]);
		((Class505_Sub2) this).aClass384_8728.method6613(((Class505_Sub2) this).aFloatArrayArray8730[4]);
		((Class505_Sub2) this).aClass384_8728.method6538(((Class505_Sub2) this).aFloatArrayArray8730[5]);
		aClass384_8729.method6562(((Class505_Sub2) this).aClass384_8728);
		method13933(aClass384_8729);
	}

	abstract Interface29 method14022(Class150 class150, Class76 class76, int i, int i_298_);

	public final void fl(int i, int i_299_, int i_300_, int i_301_, int i_302_) {
		method8433(i, i_299_, i, i_299_ + i_300_, i_301_, i_302_);
	}

	public final void method8415(int i, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_) {
		method8496(i, i_303_, i_304_, i_305_, i_306_, 1, i_307_);
	}

	public final void method8526(int i, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_) {
		method8496(i, i_308_, i_309_, i_310_, i_311_, 1, i_312_);
	}

	public void method8527(int i, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_) {
		float f = (float) i_314_ - (float) i;
		float f_321_ = (float) i_315_ - (float) i_313_;
		if (f == 0.0F && f_321_ == 0.0F)
			f = 1.0F;
		else {
			float f_322_ = (float) (1.0 / Math.sqrt((double) (f * f + f_321_ * f_321_)));
			f *= f_322_;
			f_321_ *= f_322_;
		}
		method13935();
		Class41 class41 = ((Class505_Sub2) this).aClass41Array8793[13];
		class41.method873();
		class41.method875(i_316_);
		method13904(i_317_);
		class41.method879();
		method13992(false);
		i_320_ %= i_319_ + i_318_;
		float f_323_ = f * (float) i_318_;
		float f_324_ = f_321_ * (float) i_318_;
		float f_325_ = 0.0F;
		float f_326_ = 0.0F;
		float f_327_ = f_323_;
		float f_328_ = f_324_;
		if (i_320_ > i_318_) {
			f_325_ = f * (float) (i_318_ + i_319_ - i_320_);
			f_326_ = f_321_ * (float) (i_318_ + i_319_ - i_320_);
		} else {
			f_327_ = f * (float) (i_318_ - i_320_);
			f_328_ = f_321_ * (float) (i_318_ - i_320_);
		}
		float f_329_ = (float) i + f_325_;
		float f_330_ = (float) i_313_ + f_326_;
		float f_331_ = f * (float) i_319_;
		float f_332_ = f_321_ * (float) i_319_;
		for (;;) {
			if (i_314_ > i) {
				if (f_329_ > (float) i_314_)
					break;
				if (f_329_ + f_327_ > (float) i_314_)
					f_327_ = (float) i_314_ - f_329_;
			} else {
				if (f_329_ < (float) i_314_)
					break;
				if (f_329_ + f_327_ < (float) i_314_)
					f_327_ = (float) i_314_ - f_329_;
			}
			if (i_315_ > i_313_) {
				if (f_330_ > (float) i_315_)
					break;
				if (f_330_ + f_328_ > (float) i_315_)
					f_328_ = (float) i_315_ - f_330_;
			} else {
				if (f_330_ < (float) i_315_)
					break;
				if (f_330_ + f_328_ < (float) i_315_)
					f_328_ = (float) i_315_ - f_330_;
			}
			if (!method13908(f_329_, f_330_, 0.0F, f_329_ + f_327_, f_330_ + f_328_, 0.0F))
				return;
			method14000();
			f_329_ += f_331_ + f_327_;
			f_330_ += f_332_ + f_328_;
			f_327_ = f_323_;
			f_328_ = f_324_;
		}
		method13992(true);
		class41.method885();
	}

	public final NativeSprite method8548(int[] is, int i, int i_333_, int i_334_, int i_335_, boolean bool) {
		return new Class160_Sub3(this, i_334_, i_335_, is, i, i_333_);
	}

	public void method8529(int i, int i_336_, int i_337_, int i_338_, int i_339_, int i_340_, int i_341_, int i_342_, int i_343_) {
		float f = (float) i_337_ - (float) i;
		float f_344_ = (float) i_338_ - (float) i_336_;
		if (f == 0.0F && f_344_ == 0.0F)
			f = 1.0F;
		else {
			float f_345_ = (float) (1.0 / Math.sqrt((double) (f * f + f_344_ * f_344_)));
			f *= f_345_;
			f_344_ *= f_345_;
		}
		method13935();
		Class41 class41 = ((Class505_Sub2) this).aClass41Array8793[13];
		class41.method873();
		class41.method875(i_339_);
		method13904(i_340_);
		class41.method879();
		method13992(false);
		i_343_ %= i_342_ + i_341_;
		float f_346_ = f * (float) i_341_;
		float f_347_ = f_344_ * (float) i_341_;
		float f_348_ = 0.0F;
		float f_349_ = 0.0F;
		float f_350_ = f_346_;
		float f_351_ = f_347_;
		if (i_343_ > i_341_) {
			f_348_ = f * (float) (i_341_ + i_342_ - i_343_);
			f_349_ = f_344_ * (float) (i_341_ + i_342_ - i_343_);
		} else {
			f_350_ = f * (float) (i_341_ - i_343_);
			f_351_ = f_344_ * (float) (i_341_ - i_343_);
		}
		float f_352_ = (float) i + f_348_;
		float f_353_ = (float) i_336_ + f_349_;
		float f_354_ = f * (float) i_342_;
		float f_355_ = f_344_ * (float) i_342_;
		for (;;) {
			if (i_337_ > i) {
				if (f_352_ > (float) i_337_)
					break;
				if (f_352_ + f_350_ > (float) i_337_)
					f_350_ = (float) i_337_ - f_352_;
			} else {
				if (f_352_ < (float) i_337_)
					break;
				if (f_352_ + f_350_ < (float) i_337_)
					f_350_ = (float) i_337_ - f_352_;
			}
			if (i_338_ > i_336_) {
				if (f_353_ > (float) i_338_)
					break;
				if (f_353_ + f_351_ > (float) i_338_)
					f_351_ = (float) i_338_ - f_353_;
			} else {
				if (f_353_ < (float) i_338_)
					break;
				if (f_353_ + f_351_ < (float) i_338_)
					f_351_ = (float) i_338_ - f_353_;
			}
			if (!method13908(f_352_, f_353_, 0.0F, f_352_ + f_350_, f_353_ + f_351_, 0.0F))
				return;
			method14000();
			f_352_ += f_354_ + f_350_;
			f_353_ += f_355_ + f_351_;
			f_350_ = f_346_;
			f_351_ = f_347_;
		}
		method13992(true);
		class41.method885();
	}

	public void method8530(int i, int i_356_, int i_357_, int i_358_, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_) {
		float f = (float) i_357_ - (float) i;
		float f_364_ = (float) i_358_ - (float) i_356_;
		if (f == 0.0F && f_364_ == 0.0F)
			f = 1.0F;
		else {
			float f_365_ = (float) (1.0 / Math.sqrt((double) (f * f + f_364_ * f_364_)));
			f *= f_365_;
			f_364_ *= f_365_;
		}
		method13935();
		Class41 class41 = ((Class505_Sub2) this).aClass41Array8793[13];
		class41.method873();
		class41.method875(i_359_);
		method13904(i_360_);
		class41.method879();
		method13992(false);
		i_363_ %= i_362_ + i_361_;
		float f_366_ = f * (float) i_361_;
		float f_367_ = f_364_ * (float) i_361_;
		float f_368_ = 0.0F;
		float f_369_ = 0.0F;
		float f_370_ = f_366_;
		float f_371_ = f_367_;
		if (i_363_ > i_361_) {
			f_368_ = f * (float) (i_361_ + i_362_ - i_363_);
			f_369_ = f_364_ * (float) (i_361_ + i_362_ - i_363_);
		} else {
			f_370_ = f * (float) (i_361_ - i_363_);
			f_371_ = f_364_ * (float) (i_361_ - i_363_);
		}
		float f_372_ = (float) i + f_368_;
		float f_373_ = (float) i_356_ + f_369_;
		float f_374_ = f * (float) i_362_;
		float f_375_ = f_364_ * (float) i_362_;
		for (;;) {
			if (i_357_ > i) {
				if (f_372_ > (float) i_357_)
					break;
				if (f_372_ + f_370_ > (float) i_357_)
					f_370_ = (float) i_357_ - f_372_;
			} else {
				if (f_372_ < (float) i_357_)
					break;
				if (f_372_ + f_370_ < (float) i_357_)
					f_370_ = (float) i_357_ - f_372_;
			}
			if (i_358_ > i_356_) {
				if (f_373_ > (float) i_358_)
					break;
				if (f_373_ + f_371_ > (float) i_358_)
					f_371_ = (float) i_358_ - f_373_;
			} else {
				if (f_373_ < (float) i_358_)
					break;
				if (f_373_ + f_371_ < (float) i_358_)
					f_371_ = (float) i_358_ - f_373_;
			}
			if (!method13908(f_372_, f_373_, 0.0F, f_372_ + f_370_, f_373_ + f_371_, 0.0F))
				return;
			method14000();
			f_372_ += f_374_ + f_370_;
			f_373_ += f_375_ + f_371_;
			f_370_ = f_366_;
			f_371_ = f_367_;
		}
		method13992(true);
		class41.method885();
	}

	public final void method8576(int i, int i_376_, int i_377_, int i_378_, int i_379_, int i_380_, Class455 class455, int i_381_, int i_382_) {
		/* empty */
	}

	public final void method8532(int i, int i_383_, int i_384_, int i_385_, int i_386_, int i_387_, Class455 class455, int i_388_, int i_389_) {
		/* empty */
	}

	public final void method8533(int i, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, Class455 class455, int i_395_, int i_396_) {
		/* empty */
	}

	public final void method8575(int i, int i_397_, int i_398_, int i_399_, int i_400_, int i_401_, Class455 class455, int i_402_, int i_403_) {
		/* empty */
	}

	public void method8535(int i, int i_404_, int i_405_, int i_406_, int i_407_, int i_408_, Class455 class455, int i_409_, int i_410_, int i_411_, int i_412_, int i_413_) {
		/* empty */
	}

	public static boolean method14023() {
		return Class362.method6278(616047582).method222("jaclib", -1840086140);
	}

	final Interface6 method14024(int i, int i_414_, boolean bool, int[] is) {
		return method14094(i, i_414_, bool, is, 0, 0);
	}

	public int method8538(int i, int i_415_, int i_416_, int i_417_, int i_418_, int i_419_) {
		int i_420_ = 0;
		float f = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_415_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_416_));
		float f_421_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i_417_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_418_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_419_));
		float f_422_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_415_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_416_));
		float f_423_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i_417_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_418_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_419_));
		if (f < -f_422_ && f_421_ < -f_423_)
			i_420_ |= 0x10;
		else if (f > f_422_ && f_421_ > f_423_)
			i_420_ |= 0x20;
		float f_424_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_415_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_416_));
		float f_425_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i_417_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_418_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_419_));
		if (f_424_ < -f_422_ && f_425_ < -f_423_)
			i_420_ |= 0x1;
		if (f_424_ > f_422_ && f_425_ > f_423_)
			i_420_ |= 0x2;
		float f_426_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_415_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_416_));
		float f_427_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i_417_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_418_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_419_));
		if (f_426_ < -f_422_ && f_427_ < -f_423_)
			i_420_ |= 0x4;
		if (f_426_ > f_422_ && f_427_ > f_423_)
			i_420_ |= 0x8;
		return i_420_;
	}

	public int method8539(int i, int i_428_, int i_429_, int i_430_, int i_431_, int i_432_) {
		int i_433_ = 0;
		float f = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_428_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_429_));
		float f_434_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i_430_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_431_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_432_));
		float f_435_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_428_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_429_));
		float f_436_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i_430_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_431_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_432_));
		if (f < -f_435_ && f_434_ < -f_436_)
			i_433_ |= 0x10;
		else if (f > f_435_ && f_434_ > f_436_)
			i_433_ |= 0x20;
		float f_437_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_428_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_429_));
		float f_438_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i_430_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_431_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_432_));
		if (f_437_ < -f_435_ && f_438_ < -f_436_)
			i_433_ |= 0x1;
		if (f_437_ > f_435_ && f_438_ > f_436_)
			i_433_ |= 0x2;
		float f_439_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_428_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_429_));
		float f_440_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i_430_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_431_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_432_));
		if (f_439_ < -f_435_ && f_440_ < -f_436_)
			i_433_ |= 0x4;
		if (f_439_ > f_435_ && f_440_ > f_436_)
			i_433_ |= 0x8;
		return i_433_;
	}

	public int method8540(int i, int i_441_, int i_442_, int i_443_, int i_444_, int i_445_) {
		int i_446_ = 0;
		float f = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_441_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_442_));
		float f_447_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i_443_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_444_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_445_));
		float f_448_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_441_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_442_));
		float f_449_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i_443_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_444_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_445_));
		if (f < -f_448_ && f_447_ < -f_449_)
			i_446_ |= 0x10;
		else if (f > f_448_ && f_447_ > f_449_)
			i_446_ |= 0x20;
		float f_450_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_441_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_442_));
		float f_451_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i_443_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_444_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_445_));
		if (f_450_ < -f_448_ && f_451_ < -f_449_)
			i_446_ |= 0x1;
		if (f_450_ > f_448_ && f_451_ > f_449_)
			i_446_ |= 0x2;
		float f_452_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_441_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_442_));
		float f_453_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i_443_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_444_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_445_));
		if (f_452_ < -f_448_ && f_453_ < -f_449_)
			i_446_ |= 0x4;
		if (f_452_ > f_448_ && f_453_ > f_449_)
			i_446_ |= 0x8;
		return i_446_;
	}

	public final Class282_Sub1 method8570(int i) {
		Class282_Sub1_Sub2 class282_sub1_sub2 = new Class282_Sub1_Sub2(i);
		((Class505_Sub2) this).aClass473_8700.method7877(class282_sub1_sub2, 993854822);
		return class282_sub1_sub2;
	}

	public final Class282_Sub1 method8541(int i) {
		Class282_Sub1_Sub2 class282_sub1_sub2 = new Class282_Sub1_Sub2(i);
		((Class505_Sub2) this).aClass473_8700.method7877(class282_sub1_sub2, 1136818441);
		return class282_sub1_sub2;
	}

	abstract void method14025();

	public final void method8618(Class282_Sub1 class282_sub1) {
		((Class505_Sub2) this).aNativeHeap8699 = (((Class282_Sub1_Sub2) (Class282_Sub1_Sub2) class282_sub1).aNativeHeap10212);
	}

	public final void method8544(Class282_Sub1 class282_sub1) {
		((Class505_Sub2) this).aNativeHeap8699 = (((Class282_Sub1_Sub2) (Class282_Sub1_Sub2) class282_sub1).aNativeHeap10212);
	}

	public final boolean method8578() {
		return aBool8828;
	}

	public final void fc(int i, int i_454_, int i_455_, int i_456_) {
		int i_457_;
		int i_458_;
		if (aClass158_5853 != null) {
			i_458_ = aClass158_5853.method2714();
			i_457_ = aClass158_5853.method2716();
		} else {
			i_457_ = 0;
			i_458_ = 0;
		}
		if (i <= 0 && i_455_ >= i_458_ - 1 && i_454_ <= 0 && i_456_ >= i_457_ - 1)
			L();
		else {
			anInt8743 = i >= 0 ? i : 0;
			anInt8744 = i_455_ <= i_458_ ? i_455_ : i_458_;
			anInt8822 = i_454_ >= 0 ? i_454_ : 0;
			anInt8742 = i_456_ <= i_457_ ? i_456_ : i_457_;
			if (!aBool8843) {
				aBool8843 = true;
				method13922();
			}
			method13921();
		}
	}

	public final NativeSprite method8543(int[] is, int i, int i_459_, int i_460_, int i_461_, boolean bool) {
		return new Class160_Sub3(this, i_460_, i_461_, is, i, i_459_);
	}

	abstract void method14026();

	public final NativeSprite method8612(Class91 class91, boolean bool) {
		NativeSprite class160;
		if (class91.anInt957 != 0 && class91.anInt954 != 0) {
			int[] is = new int[class91.anInt957 * class91.anInt954];
			int i = 0;
			int i_462_ = 0;
			if (class91.aByteArray961 != null) {
				for (int i_463_ = 0; i_463_ < class91.anInt954; i_463_++) {
					for (int i_464_ = 0; i_464_ < class91.anInt957; i_464_++) {
						is[i_462_++] = (class91.aByteArray961[i] << 24 | (class91.anIntArray955[class91.aByteArray960[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_465_ = 0; i_465_ < class91.anInt954; i_465_++) {
					for (int i_466_ = 0; i_466_ < class91.anInt957; i_466_++) {
						int i_467_ = (class91.anIntArray955[class91.aByteArray960[i++] & 0xff]);
						is[i_462_++] = i_467_ != 0 ? ~0xffffff | i_467_ : 0;
					}
				}
			}
			class160 = createNativeSprite(is, 0, class91.anInt957, class91.anInt957, class91.anInt954, 243468915);
		} else
			class160 = createNativeSprite(new int[] { 0 }, 0, 1, 1, 1, -1837569571);
		class160.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return class160;
	}

	public final NativeSprite method8518(Class91 class91, boolean bool) {
		NativeSprite class160;
		if (class91.anInt957 != 0 && class91.anInt954 != 0) {
			int[] is = new int[class91.anInt957 * class91.anInt954];
			int i = 0;
			int i_468_ = 0;
			if (class91.aByteArray961 != null) {
				for (int i_469_ = 0; i_469_ < class91.anInt954; i_469_++) {
					for (int i_470_ = 0; i_470_ < class91.anInt957; i_470_++) {
						is[i_468_++] = (class91.aByteArray961[i] << 24 | (class91.anIntArray955[class91.aByteArray960[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_471_ = 0; i_471_ < class91.anInt954; i_471_++) {
					for (int i_472_ = 0; i_472_ < class91.anInt957; i_472_++) {
						int i_473_ = (class91.anIntArray955[class91.aByteArray960[i++] & 0xff]);
						is[i_468_++] = i_473_ != 0 ? ~0xffffff | i_473_ : 0;
					}
				}
			}
			class160 = createNativeSprite(is, 0, class91.anInt957, class91.anInt957, class91.anInt954, 216802714);
		} else
			class160 = createNativeSprite(new int[] { 0 }, 0, 1, 1, 1, 1578248610);
		class160.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return class160;
	}

	public final NativeSprite method8604(int i, int i_474_, int i_475_, int i_476_, boolean bool) {
		Class160_Sub3 class160_sub3 = new Class160_Sub3(this, i_475_, i_476_, bool, false);
		class160_sub3.method2750(0, 0, i_475_, i_476_, i, i_474_);
		return class160_sub3;
	}

	public final NativeSprite method8552(int i, int i_477_, int i_478_, int i_479_, boolean bool) {
		Class160_Sub3 class160_sub3 = new Class160_Sub3(this, i_478_, i_479_, bool, false);
		class160_sub3.method2750(0, 0, i_478_, i_479_, i, i_477_);
		return class160_sub3;
	}

	public final void iz(float f) {
		if (aFloat8769 != f) {
			aFloat8769 = f;
			method13948();
			method13951();
		}
	}

	public final Class455 method8554(int i, int i_480_, int[] is, int[] is_481_) {
		return Class455_Sub1.method13769(this, i, i_480_, is, is_481_);
	}

	public final Class455 method8427(int i, int i_482_, int[] is, int[] is_483_) {
		return Class455_Sub1.method13769(this, i, i_482_, is, is_483_);
	}

	public final Class455 method8556(int i, int i_484_, int[] is, int[] is_485_) {
		return Class455_Sub1.method13769(this, i, i_484_, is, is_485_);
	}

	public final void hr(int i, Class455 class455, int i_486_, int i_487_) {
		RA(false);
		((Class505_Sub2) this).aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) method8523((byte) 124).method2714(), 0.0F, 0.0F, (float) method8523((byte) 110).method2716(), 0, class455, i_486_, i_487_);
		RA(true);
	}

	public final void hz(int i, Class455 class455, int i_488_, int i_489_) {
		RA(false);
		((Class505_Sub2) this).aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) method8523((byte) 126).method2714(), 0.0F, 0.0F, (float) method8523((byte) 110).method2716(), 0, class455, i_488_, i_489_);
		RA(true);
	}

	public final Class384 method8588() {
		return ((Class505_Sub2) this).aClass384_8724;
	}

	final void method14027(boolean bool) {
		if (bool != aBool8756) {
			aBool8756 = bool;
			method14054();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	public final Class294 method8626() {
		return ((Class505_Sub2) this).aClass294_8842;
	}

	public final void method8559(int i) {
		/* empty */
	}

	public final MeshRasterizer method8561(RSMesh class157, int i, int i_490_, int i_491_, int i_492_) {
		return new Class528_Sub3(this, class157, i, i_491_, i_492_, i_490_);
	}

	public final boolean method8614() {
		return true;
	}

	public void GA(float f, float f_493_) {
		((Class505_Sub2) this).aFloat8737 = f;
		((Class505_Sub2) this).aFloat8738 = f_493_;
		method13918();
	}

	public final MeshRasterizer method8505(RSMesh class157, int i, int i_494_, int i_495_, int i_496_) {
		return new Class528_Sub3(this, class157, i, i_495_, i_496_, i_494_);
	}

	public final MeshRasterizer method8564(RSMesh class157, int i, int i_497_, int i_498_, int i_499_) {
		return new Class528_Sub3(this, class157, i, i_498_, i_499_, i_497_);
	}

	public final int method8565(int i, int i_500_) {
		return i & i_500_ ^ i_500_;
	}

	public final int method8566(int i, int i_501_) {
		return i & i_501_ ^ i_501_;
	}

	public final int method8567(int i, int i_502_) {
		return i & i_502_ ^ i_502_;
	}

	final Class384 method14028() {
		return aClass384Array8782[anInt8780];
	}

	public final Class390 method8569(int i, int i_503_, int[][] is, int[][] is_504_, int i_505_, int i_506_, int i_507_) {
		return new Class390_Sub1(this, i_506_, i_507_, i, i_503_, is, is_504_, i_505_);
	}

	public final Class384 method8517() {
		return ((Class505_Sub2) this).aClass384_8841;
	}

	public final void method8629(int i, int i_508_, float f, int i_509_, int i_510_, float f_511_, int i_512_, int i_513_, float f_514_, int i_515_, int i_516_, int i_517_, int i_518_) {
		/* empty */
	}

	public final Class294 method8572() {
		return ((Class505_Sub2) this).aClass294_8842;
	}

	public final void J(int i) {
		((Class505_Sub2) this).anInt8806 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class505_Sub2) this).anInt8806++;
		((Class505_Sub2) this).anInt8775 = 1 << ((Class505_Sub2) this).anInt8806;
	}

	public final int method8574() {
		return anInt8799 - 2;
	}

	public final void method8394(int i, Class282_Sub24[] class282_sub24s) {
		for (int i_519_ = 0; i_519_ < i; i_519_++)
			aClass282_Sub24Array8716[i_519_] = class282_sub24s[i_519_];
		anInt8773 = i;
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method13903();
	}

	public final NativeSprite method8461(int i, int i_520_, boolean bool, boolean bool_521_) {
		return new Class160_Sub3(this, i, i_520_, bool, bool_521_);
	}

	public final void method8579(int i, Class282_Sub24[] class282_sub24s) {
		for (int i_522_ = 0; i_522_ < i; i_522_++)
			aClass282_Sub24Array8716[i_522_] = class282_sub24s[i_522_];
		anInt8773 = i;
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method13903();
	}

	public final void method8580(Class151 class151) {
		((Class505_Sub2) this).aClass54_8837.method1091(this, class151);
	}

	public Class294 method8685() {
		return ((Class505_Sub2) this).aClass294_8706;
	}

	public final void method8423(Class294 class294) {
		((Class505_Sub2) this).aClass294_8706 = class294;
		aClass384_8740.method6522(((Class505_Sub2) this).aClass294_8706);
		((Class505_Sub2) this).aClass294_8804.method5209(class294);
		((Class505_Sub2) this).aClass294_8804.method5207();
		((Class505_Sub2) this).aClass384_8814.method6522(((Class505_Sub2) this).aClass294_8804);
		method13926();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method13927();
	}

	public Class294 method8583() {
		return ((Class505_Sub2) this).aClass294_8706;
	}

	public final boolean method8462() {
		return aBool8828;
	}

	public final void method8446(Class384 class384) {
		((Class505_Sub2) this).aClass384_8724.method6562(class384);
		method13926();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method14030();
	}

	public final boolean method8502() {
		return true;
	}

	public final Class384 method8449() {
		return ((Class505_Sub2) this).aClass384_8841;
	}

	final void method14029(boolean bool) {
		if (bool != aBool8756) {
			aBool8756 = bool;
			method14054();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method14030() {
		aClass384_8727.method6562(((Class505_Sub2) this).aClass384_8708);
		method13933(aClass384_8727);
		aFloat8697 = ((aClass384_8727.aFloatArray4667[14] - aClass384_8727.aFloatArray4667[15]) / (aClass384_8727.aFloatArray4667[11] - aClass384_8727.aFloatArray4667[10]));
		aFloat8726 = (-aClass384_8727.aFloatArray4667[14] / aClass384_8727.aFloatArray4667[10]);
		method14062();
	}

	public final Class384 method8590() {
		return ((Class505_Sub2) this).aClass384_8724;
	}

	public final boolean method8504() {
		return true;
	}

	public final void in(float f) {
		if (aFloat8769 != f) {
			aFloat8769 = f;
			method13948();
			method13951();
		}
	}

	public final Class152 method8400(int i, int i_523_, int i_524_, int i_525_, int i_526_, int i_527_) {
		return new Class152_Sub2_Sub1(this, i, i_523_, i_524_, i_525_, i_526_, i_527_);
	}

	public final void im(int i, float f, float f_528_, float f_529_, float f_530_, float f_531_) {
		boolean bool = ((Class505_Sub2) this).anInt8765 != i;
		if (bool || aFloat8770 != f || aFloat8826 != f_528_) {
			((Class505_Sub2) this).anInt8765 = i;
			aFloat8770 = f;
			aFloat8826 = f_528_;
			if (bool) {
				aFloat8766 = (float) (((Class505_Sub2) this).anInt8765 & 0xff0000) / 1.671168E7F;
				aFloat8767 = (float) (((Class505_Sub2) this).anInt8765 & 0xff00) / 65280.0F;
				aFloat8768 = ((float) (((Class505_Sub2) this).anInt8765 & 0xff) / 255.0F);
				method13948();
			}
			method13949();
		}
		if (((Class505_Sub2) this).aFloatArray8763[0] != f_529_ || ((Class505_Sub2) this).aFloatArray8763[1] != f_530_ || ((Class505_Sub2) this).aFloatArray8763[2] != f_531_) {
			((Class505_Sub2) this).aFloatArray8763[0] = f_529_;
			((Class505_Sub2) this).aFloatArray8763[1] = f_530_;
			((Class505_Sub2) this).aFloatArray8763[2] = f_531_;
			((Class505_Sub2) this).aFloatArray8764[0] = -f_529_;
			((Class505_Sub2) this).aFloatArray8764[1] = -f_530_;
			((Class505_Sub2) this).aFloatArray8764[2] = -f_531_;
			float f_532_ = (float) (1.0 / Math.sqrt((double) (f_529_ * f_529_ + f_530_ * f_530_ + f_531_ * f_531_)));
			aFloatArray8747[0] = f_529_ * f_532_;
			aFloatArray8747[1] = f_530_ * f_532_;
			aFloatArray8747[2] = f_531_ * f_532_;
			aFloatArray8762[0] = -aFloatArray8747[0];
			aFloatArray8762[1] = -aFloatArray8747[1];
			aFloatArray8762[2] = -aFloatArray8747[2];
			method13950();
			((Class505_Sub2) this).anInt8777 = (int) (f_529_ * 256.0F / f_530_);
			((Class505_Sub2) this).anInt8778 = (int) (f_531_ * 256.0F / f_530_);
		}
		method13951();
	}

	public final void iq(int i) {
		((Class505_Sub2) this).anInt8806 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class505_Sub2) this).anInt8806++;
		((Class505_Sub2) this).anInt8775 = 1 << ((Class505_Sub2) this).anInt8806;
	}

	public final void method14031(int i, Class67 class67) {
		method13970(i, class67, false);
	}

	public final void ii(int i) {
		((Class505_Sub2) this).anInt8806 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class505_Sub2) this).anInt8806++;
		((Class505_Sub2) this).anInt8775 = 1 << ((Class505_Sub2) this).anInt8806;
	}

	public final FontRenderer method8448(Class414 class414, Class91[] class91s, boolean bool) {
		return new Class8_Sub4(this, class414, class91s, bool);
	}

	public final void ik(int i, int i_533_, int i_534_) {
		if (anInt8810 != i || anInt8811 != i_533_ || anInt8680 != i_534_) {
			anInt8810 = i;
			anInt8811 = i_533_;
			anInt8680 = i_534_;
			method14062();
			method13991();
		}
	}

	public final MeshRasterizer method8623(RSMesh class157, int i, int i_535_, int i_536_, int i_537_) {
		return new Class528_Sub3(this, class157, i, i_536_, i_537_, i_535_);
	}

	public final void method8594(boolean bool) {
		/* empty */
	}

	public final boolean method8501() {
		return aBool8828;
	}

	public final void method8584(Class152 class152) {
		((Class505_Sub2) this).aClass152_Sub2_8731 = (Class152_Sub2) class152;
	}

	public final void method8598(Class152 class152) {
		((Class505_Sub2) this).aClass152_Sub2_8731 = (Class152_Sub2) class152;
	}

	public final boolean method8628() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && !((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			boolean bool = ((Class505_Sub2) this).aClass32_8714.method816(((Class505_Sub2) this).aClass55Array8802[1]);
			if (bool)
				((Class505_Sub2) this).aClass66_8787.method1279();
			return bool;
		}
		return false;
	}

	public final boolean method8600() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && !((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			boolean bool = ((Class505_Sub2) this).aClass32_8714.method816(((Class505_Sub2) this).aClass55Array8802[1]);
			if (bool)
				((Class505_Sub2) this).aClass66_8787.method1279();
			return bool;
		}
		return false;
	}

	public final void method8601() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			((Class505_Sub2) this).aClass32_8714.method822(((Class505_Sub2) this).aClass55Array8802[1]);
			((Class505_Sub2) this).aClass66_8787.method1279();
		}
	}

	public final void method8602() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			((Class505_Sub2) this).aClass32_8714.method822(((Class505_Sub2) this).aClass55Array8802[1]);
			((Class505_Sub2) this).aClass66_8787.method1279();
		}
	}

	public final void method8521() {
		if (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107()) {
			((Class505_Sub2) this).aClass32_8714.method822(((Class505_Sub2) this).aClass55Array8802[1]);
			((Class505_Sub2) this).aClass66_8787.method1279();
		}
	}

	public final boolean method8679() {
		return (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107());
	}

	public final boolean method8605() {
		return (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107());
	}

	public final boolean method8606() {
		return (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107());
	}

	public final boolean method8607() {
		return (((Class505_Sub2) this).aClass55Array8802[1] != null && ((Class505_Sub2) this).aClass55Array8802[1].method1107());
	}

	final void method8608(float f, float f_538_, float f_539_, float f_540_, float f_541_, float f_542_) {
		Class55_Sub1.aFloat9188 = f;
		Class55_Sub1.aFloat9184 = f_538_;
		Class55_Sub1.aFloat9189 = f_539_;
		Class55_Sub1.aFloat9186 = f_542_;
	}

	public final void method8673(int i, int i_543_, int i_544_, int i_545_) {
		((Class505_Sub2) this).aClass32_8714.method830(i, i_543_, i_544_, i_545_);
	}

	public final void method8603(int i, int i_546_, int i_547_, int i_548_) {
		((Class505_Sub2) this).aClass32_8714.method830(i, i_546_, i_547_, i_548_);
	}

	Class41 method14032(int i) {
		return ((Class505_Sub2) this).aClass41Array8793[i];
	}

	public final void method8691() {
		((Class505_Sub2) this).aClass32_8714.method833();
	}

	public final void method8613() {
		((Class505_Sub2) this).aClass32_8714.method833();
	}

	public final int df() {
		return anInt8702 + anInt8701 + anInt8761;
	}

	public final void method8615(int i, Class90 class90) {
		if (!((Class505_Sub2) this).aBool8779)
			throw new RuntimeException("");
		((Class505_Sub2) this).anInt8739 = i;
		((Class505_Sub2) this).aClass90_8807 = class90;
		if (((Class505_Sub2) this).aBool8805) {
			((Class505_Sub2) this).aClass41Array8793[3].method876();
			((Class505_Sub2) this).aClass41Array8793[3].method877();
		}
	}

	public final void method8616(int i, Class90 class90) {
		if (!((Class505_Sub2) this).aBool8779)
			throw new RuntimeException("");
		((Class505_Sub2) this).anInt8739 = i;
		((Class505_Sub2) this).aClass90_8807 = class90;
		if (((Class505_Sub2) this).aBool8805) {
			((Class505_Sub2) this).aClass41Array8793[3].method876();
			((Class505_Sub2) this).aClass41Array8793[3].method877();
		}
	}

	final boolean method14033() {
		return aBool8692;
	}

	abstract Interface31 method14034(int i, boolean bool, int[][] is);

	public final void method14035(Interface30 interface30) {
		if (((Class505_Sub2) this).anInterface30Array8781[anInt8780] != interface30) {
			((Class505_Sub2) this).anInterface30Array8781[anInt8780] = interface30;
			if (interface30 != null)
				interface30.method207();
			else
				anInterface6_8788.method207();
			((Class505_Sub2) this).anInt8703 &= ~0x1;
		}
	}

	Class384 method14036() {
		return ((Class505_Sub2) this).aClass384_8705;
	}

	final void method14037() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			anInt8749 = ((Class505_Sub2) this).anInt8745;
			anInt8776 = ((Class505_Sub2) this).anInt8835;
			anInt8751 = ((Class505_Sub2) this).anInt8722;
			anInt8752 = ((Class505_Sub2) this).anInt8748;
			aFloat8735 = ((Class505_Sub2) this).aFloat8737;
			aFloat8736 = ((Class505_Sub2) this).aFloat8738;
		} else {
			anInt8749 = 0;
			anInt8776 = 0;
			anInt8751 = aClass158_5853.method2714();
			anInt8752 = aClass158_5853.method2716();
			aFloat8735 = 0.0F;
			aFloat8736 = 1.0F;
		}
		method13920();
		((Class505_Sub2) this).aFloat8732 = (float) ((Class505_Sub2) this).anInt8722 / 2.0F;
		((Class505_Sub2) this).aFloat8734 = (float) ((Class505_Sub2) this).anInt8748 / 2.0F;
		((Class505_Sub2) this).aFloat8797 = ((float) ((Class505_Sub2) this).anInt8745 + ((Class505_Sub2) this).aFloat8732);
		((Class505_Sub2) this).aFloat8741 = ((float) ((Class505_Sub2) this).anInt8835 + ((Class505_Sub2) this).aFloat8734);
	}

	public final void method8627(int i, int i_549_, float f, int i_550_, int i_551_, float f_552_, int i_553_, int i_554_, float f_555_, int i_556_, int i_557_, int i_558_, int i_559_) {
		/* empty */
	}

	public void method8488(int i) {
		if (((Class505_Sub2) this).aClass66_8787 != null)
			((Class505_Sub2) this).aClass66_8787.method1278();
		anInt8820 = i & 0x7fffffff;
	}

	public final void r(int i, int i_560_, int i_561_, int i_562_) {
		int i_563_;
		int i_564_;
		if (aClass158_5853 != null) {
			i_564_ = aClass158_5853.method2714();
			i_563_ = aClass158_5853.method2716();
		} else {
			i_563_ = 0;
			i_564_ = 0;
		}
		if (i <= 0 && i_561_ >= i_564_ - 1 && i_560_ <= 0 && i_562_ >= i_563_ - 1)
			L();
		else {
			anInt8743 = i >= 0 ? i : 0;
			anInt8744 = i_561_ <= i_564_ ? i_561_ : i_564_;
			anInt8822 = i_560_ >= 0 ? i_560_ : 0;
			anInt8742 = i_562_ <= i_563_ ? i_562_ : i_563_;
			if (!aBool8843) {
				aBool8843 = true;
				method13922();
			}
			method13921();
		}
	}

	final Class384 method14038() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			return ((Class505_Sub2) this).aClass384_8814;
		return aClass384_8712;
	}

	public final int method8434(int i, int i_565_) {
		return i | i_565_;
	}

	Class90 method14039() {
		return ((Class505_Sub2) this).aClass90_8807;
	}

	public void method8633() {
		((Class505_Sub2) this).anInt8745 = 0;
		((Class505_Sub2) this).anInt8835 = 0;
		((Class505_Sub2) this).anInt8722 = aClass158_5853.method2714();
		((Class505_Sub2) this).anInt8748 = aClass158_5853.method2716();
		method13918();
	}

	public final Class384 method8589() {
		return ((Class505_Sub2) this).aClass384_8724;
	}

	public final boolean method8402() {
		return true;
	}

	public void method14040(int i) {
		if (i != anInt8758) {
			anInt8758 = i;
			method13987();
		}
	}

	void method14041() {
		method13986(7);
		method13976();
	}

	public void method14042(Interface7 interface7) {
		((Class505_Sub2) this).aClass428_8772.method7201(interface7, anObject8711, 1853966274);
	}

	void method14043() {
		ArrayList arraylist = ((Class505_Sub2) this).aClass428_8772.method7193((byte) 38);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface7 interface7 = (Interface7) iterator.next();
			interface7.method26();
		}
	}

	void method14044() {
		ArrayList arraylist = ((Class505_Sub2) this).aClass428_8772.method7193((byte) 112);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface7 interface7 = (Interface7) iterator.next();
			interface7.method26();
		}
	}

	public final FontRenderer method8625(Class414 class414, Class91[] class91s, boolean bool) {
		return new Class8_Sub4(this, class414, class91s, bool);
	}

	public abstract boolean method14045();

	final boolean method14046() {
		return aBool8692;
	}

	abstract void method14047();

	abstract Interface6 method14048(int i, int i_566_, boolean bool, int[] is, int i_567_, int i_568_);

	public abstract Class101 method14049(String string);

	byte[] method14050(String string, String string_569_) {
		return ((Class505_Sub2) this).aClass317_8789.method5626(string, string_569_, (byte) 1);
	}

	void method14051() {
		method13986(7);
		method13976();
	}

	public final void method14052() {
		method14001(Class352.aClass352_4104, 2);
	}

	Class114 method14053(byte[] is) {
		if (is == null)
			return null;
		Class114 class114;
		try {
			class114 = new Class114(is);
		} catch (Exception exception) {
			return null;
		}
		return class114;
	}

	public int method8537(int i, int i_570_, int i_571_, int i_572_, int i_573_, int i_574_) {
		int i_575_ = 0;
		float f = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_570_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_571_));
		float f_576_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i_572_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_573_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_574_));
		float f_577_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_570_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_571_));
		float f_578_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i_572_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_573_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_574_));
		if (f < -f_577_ && f_576_ < -f_578_)
			i_575_ |= 0x10;
		else if (f > f_577_ && f_576_ > f_578_)
			i_575_ |= 0x20;
		float f_579_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_570_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_571_));
		float f_580_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i_572_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_573_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_574_));
		if (f_579_ < -f_577_ && f_580_ < -f_578_)
			i_575_ |= 0x1;
		if (f_579_ > f_577_ && f_580_ > f_578_)
			i_575_ |= 0x2;
		float f_581_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_570_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_571_));
		float f_582_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i_572_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_573_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_574_));
		if (f_581_ < -f_577_ && f_582_ < -f_578_)
			i_575_ |= 0x4;
		if (f_581_ > f_577_ && f_582_ > f_578_)
			i_575_ |= 0x8;
		return i_575_;
	}

	abstract void method14054();

	Class114 method14055(byte[] is) {
		if (is == null)
			return null;
		Class114 class114;
		try {
			class114 = new Class114(is);
		} catch (Exception exception) {
			return null;
		}
		return class114;
	}

	public abstract void method14056(Class384 class384, Class384 class384_583_, Class384 class384_584_);

	public abstract void method14057(Class384 class384, Class384 class384_585_, Class384 class384_586_);

	public abstract void method14058(Class384 class384, Class384 class384_587_, Class384 class384_588_);

	public final Class384 method8587() {
		return ((Class505_Sub2) this).aClass384_8724;
	}

	public final int method8443(int i, int i_589_) {
		return i & i_589_ ^ i_589_;
	}

	public static boolean method14059() {
		return Class362.method6278(616047582).method222("jaclib", 542600630);
	}

	Class114 method14060(byte[] is) {
		if (is == null)
			return null;
		Class114 class114;
		try {
			class114 = new Class114(is);
		} catch (Exception exception) {
			return null;
		}
		return class114;
	}

	public final void method14061() {
		((Class505_Sub2) this).anInterface30Array8781 = new Interface30[anInt8825];
		aClass384Array8782 = new Class384[anInt8825];
		aClass37Array8783 = new Class37[anInt8825];
		aClass68Array8784 = new Class68[anInt8825];
		aClass68Array8785 = new Class68[anInt8825];
		for (int i = 0; i < anInt8825; i++) {
			aClass68Array8785[i] = Class68.aClass68_683;
			aClass68Array8784[i] = Class68.aClass68_683;
			aClass37Array8783[i] = Class37.aClass37_393;
			aClass384Array8782[i] = new Class384();
		}
		aClass282_Sub24Array8716 = new Class282_Sub24[anInt8799 - 2];
		int[] is = { -1 };
		anInterface6_8788 = method14094(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class505_Sub2) this).anInterface6_8795 = method14094(1, 1, false, is, 0, 0);
		method8439(new Class282_Sub1_Sub2(262144));
		((Class505_Sub2) this).aClass70_8832 = method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }) });
		method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_690 }) });
		((Class505_Sub2) this).aClass70_8836 = method13995(new Class72[] { new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692), new Class72(Class69.aClass69_689) });
		((Class505_Sub2) this).aClass70_8721 = method13995(new Class72[] { new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692) });
		for (int i = 0; i < 7; i++) {
			((Class505_Sub2) this).aClass528_Sub3Array8839[i] = new Class528_Sub3(this, 0, 0, false, false);
			((Class505_Sub2) this).aClass528_Sub3Array8840[i] = new Class528_Sub3(this, 0, 0, true, true);
		}
		method13895();
		((Class505_Sub2) this).anInterface32_8834 = method13993(true);
		method13897();
		method8418();
		L();
		method8420();
		((Class505_Sub2) this).aClass160_Sub3_8790 = new Class160_Sub3(this, anInterface6_8788);
		((Class505_Sub2) this).aClass160_Sub3_8791 = new Class160_Sub3(this, ((Class505_Sub2) this).anInterface6_8795);
		ba(3, 0);
	}

	public final void method8525(int i, int i_590_, int i_591_, int i_592_) {
		((Class505_Sub2) this).aClass32_8714.method830(i, i_590_, i_591_, i_592_);
	}

	public void method8494(int i, int i_593_, int i_594_, int i_595_, int i_596_, int i_597_, int i_598_, int i_599_, int i_600_) {
		float f = (float) i_594_ - (float) i;
		float f_601_ = (float) i_595_ - (float) i_593_;
		if (f == 0.0F && f_601_ == 0.0F)
			f = 1.0F;
		else {
			float f_602_ = (float) (1.0 / Math.sqrt((double) (f * f + f_601_ * f_601_)));
			f *= f_602_;
			f_601_ *= f_602_;
		}
		method13935();
		Class41 class41 = ((Class505_Sub2) this).aClass41Array8793[13];
		class41.method873();
		class41.method875(i_596_);
		method13904(i_597_);
		class41.method879();
		method13992(false);
		i_600_ %= i_599_ + i_598_;
		float f_603_ = f * (float) i_598_;
		float f_604_ = f_601_ * (float) i_598_;
		float f_605_ = 0.0F;
		float f_606_ = 0.0F;
		float f_607_ = f_603_;
		float f_608_ = f_604_;
		if (i_600_ > i_598_) {
			f_605_ = f * (float) (i_598_ + i_599_ - i_600_);
			f_606_ = f_601_ * (float) (i_598_ + i_599_ - i_600_);
		} else {
			f_607_ = f * (float) (i_598_ - i_600_);
			f_608_ = f_601_ * (float) (i_598_ - i_600_);
		}
		float f_609_ = (float) i + f_605_;
		float f_610_ = (float) i_593_ + f_606_;
		float f_611_ = f * (float) i_599_;
		float f_612_ = f_601_ * (float) i_599_;
		for (;;) {
			if (i_594_ > i) {
				if (f_609_ > (float) i_594_)
					break;
				if (f_609_ + f_607_ > (float) i_594_)
					f_607_ = (float) i_594_ - f_609_;
			} else {
				if (f_609_ < (float) i_594_)
					break;
				if (f_609_ + f_607_ < (float) i_594_)
					f_607_ = (float) i_594_ - f_609_;
			}
			if (i_595_ > i_593_) {
				if (f_610_ > (float) i_595_)
					break;
				if (f_610_ + f_608_ > (float) i_595_)
					f_608_ = (float) i_595_ - f_610_;
			} else {
				if (f_610_ < (float) i_595_)
					break;
				if (f_610_ + f_608_ < (float) i_595_)
					f_608_ = (float) i_595_ - f_610_;
			}
			if (!method13908(f_609_, f_610_, 0.0F, f_609_ + f_607_, f_610_ + f_608_, 0.0F))
				return;
			method14000();
			f_609_ += f_611_ + f_607_;
			f_610_ += f_612_ + f_608_;
			f_607_ = f_603_;
			f_608_ = f_604_;
		}
		method13992(true);
		class41.method885();
	}

	public final int method8632(int i, int i_613_) {
		return i | i_613_;
	}

	final void method14062() {
		if (((Class505_Sub2) this).aClass41_8753 != null)
			((Class505_Sub2) this).aClass41_8753.method877();
		method14013();
	}

	abstract void method14063();

	abstract Interface29 method14064(Class150 class150, Class76 class76, int i, int i_614_);

	final void method14065() {
		method13948();
		method13949();
		method14204();
		method13903();
		method13950();
		method13951();
		method13952();
		method13956();
		method14054();
		method13991();
		method14013();
		method13914();
		method13894();
		method14238();
		for (int i = anInt8825 - 1; i >= 0; i--) {
			method14163(i);
			method13979();
			method13980();
			method13960();
		}
		method13987();
		method13920();
	}

	final void method14066() {
		method13948();
		method13949();
		method14204();
		method13903();
		method13950();
		method13951();
		method13952();
		method13956();
		method14054();
		method13991();
		method14013();
		method13914();
		method13894();
		method14238();
		for (int i = anInt8825 - 1; i >= 0; i--) {
			method14163(i);
			method13979();
			method13980();
			method13960();
		}
		method13987();
		method13920();
	}

	final void method14067() {
		method13948();
		method13949();
		method14204();
		method13903();
		method13950();
		method13951();
		method13952();
		method13956();
		method14054();
		method13991();
		method14013();
		method13914();
		method13894();
		method14238();
		for (int i = anInt8825 - 1; i >= 0; i--) {
			method14163(i);
			method13979();
			method13980();
			method13960();
		}
		method13987();
		method13920();
	}

	Class384 method14068() {
		return ((Class505_Sub2) this).aClass384_8705;
	}

	void method14069() {
		((Class505_Sub2) this).aClass32_8714.method819();
		for (int i = 0; i < ((Class505_Sub2) this).aClass55Array8802.length; i++) {
			if (((Class505_Sub2) this).aClass55Array8802[i] != null && ((Class505_Sub2) this).aClass55Array8802[i].method1107())
				((Class505_Sub2) this).aClass55Array8802[i].method1099();
		}
		((Class505_Sub2) this).aClass54_8837 = new Class54(this);
		method13944();
		method14009();
		method14177();
		((Class505_Sub2) this).aClass54_8837.method1089(this);
	}

	final boolean method14070() {
		return aBool8692;
	}

	final void method14071() {
		((Class505_Sub2) this).anInterface4_8682 = method13994(true);
		((Class505_Sub2) this).anInterface4_8682.method31(24, 12);
		((Class505_Sub2) this).aClass70_8833 = method13995(new Class72[] { new Class72(Class69.aClass69_695) });
	}

	abstract Interface6 method14072(Class150 class150, Class76 class76, int i, int i_615_);

	final void method14073() {
		((Class505_Sub2) this).anInterface4_8693 = method13994(false);
		((Class505_Sub2) this).anInterface4_8693.method31(3096, 12);
		aByteBuffer8838.clear();
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_616_ = (float) Math.sin(d);
			aByteBuffer8838.putFloat(f_616_);
			aByteBuffer8838.putFloat(f);
			aByteBuffer8838.putFloat(0.0F);
		}
		((Class505_Sub2) this).anInterface4_8693.method42(0, aByteBuffer8838.position(), aLong8695);
	}

	boolean method14074(float f, float f_617_, float f_618_, float f_619_, float f_620_, float f_621_) {
		aByteBuffer8838.clear();
		aByteBuffer8838.putFloat(f);
		aByteBuffer8838.putFloat(f_617_);
		aByteBuffer8838.putFloat(f_618_);
		aByteBuffer8838.putFloat(f_619_);
		aByteBuffer8838.putFloat(f_620_);
		aByteBuffer8838.putFloat(f_621_);
		return ((Class505_Sub2) this).anInterface4_8682.method42(0, aByteBuffer8838.position(), aLong8695);
	}

	byte[] method14075(String string, String string_622_) {
		return ((Class505_Sub2) this).aClass317_8789.method5626(string, string_622_, (byte) 1);
	}

	void method14076() {
		method13907();
	}

	abstract Interface1 method14077(Class150 class150, int i, int i_623_, int i_624_, boolean bool, byte[] is);

	public final void fs(int i, int i_625_, int i_626_, int i_627_, int i_628_) {
		method8433(i, i_625_, i + i_626_, i_625_, i_627_, i_628_);
	}

	final Interface32 method14078(int i) {
		if (((Class505_Sub2) this).anInterface32_8834.method39() < i * 2)
			((Class505_Sub2) this).anInterface32_8834.method208(i);
		return ((Class505_Sub2) this).anInterface32_8834;
	}

	final Interface32 method14079(int i) {
		if (((Class505_Sub2) this).anInterface32_8834.method39() < i * 2)
			((Class505_Sub2) this).anInterface32_8834.method208(i);
		return ((Class505_Sub2) this).anInterface32_8834;
	}

	final Interface32 method14080(int i) {
		if (((Class505_Sub2) this).anInterface32_8834.method39() < i * 2)
			((Class505_Sub2) this).anInterface32_8834.method208(i);
		return ((Class505_Sub2) this).anInterface32_8834;
	}

	public final Interface31 method14081() {
		return (((Class505_Sub2) this).aClass152_Sub2_8731 != null ? ((Class505_Sub2) this).aClass152_Sub2_8731.method14241() : null);
	}

	public final Interface31 method14082() {
		return (((Class505_Sub2) this).aClass152_Sub2_8731 != null ? ((Class505_Sub2) this).aClass152_Sub2_8731.method14241() : null);
	}

	final void method14083() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			anInt8749 = ((Class505_Sub2) this).anInt8745;
			anInt8776 = ((Class505_Sub2) this).anInt8835;
			anInt8751 = ((Class505_Sub2) this).anInt8722;
			anInt8752 = ((Class505_Sub2) this).anInt8748;
			aFloat8735 = ((Class505_Sub2) this).aFloat8737;
			aFloat8736 = ((Class505_Sub2) this).aFloat8738;
		} else {
			anInt8749 = 0;
			anInt8776 = 0;
			anInt8751 = aClass158_5853.method2714();
			anInt8752 = aClass158_5853.method2716();
			aFloat8735 = 0.0F;
			aFloat8736 = 1.0F;
		}
		method13920();
		((Class505_Sub2) this).aFloat8732 = (float) ((Class505_Sub2) this).anInt8722 / 2.0F;
		((Class505_Sub2) this).aFloat8734 = (float) ((Class505_Sub2) this).anInt8748 / 2.0F;
		((Class505_Sub2) this).aFloat8797 = ((float) ((Class505_Sub2) this).anInt8745 + ((Class505_Sub2) this).aFloat8732);
		((Class505_Sub2) this).aFloat8741 = ((float) ((Class505_Sub2) this).anInt8835 + ((Class505_Sub2) this).aFloat8734);
	}

	public final void method8476(int i, Class90 class90) {
		if (!((Class505_Sub2) this).aBool8779)
			throw new RuntimeException("");
		((Class505_Sub2) this).anInt8739 = i;
		((Class505_Sub2) this).aClass90_8807 = class90;
		if (((Class505_Sub2) this).aBool8805) {
			((Class505_Sub2) this).aClass41Array8793[3].method876();
			((Class505_Sub2) this).aClass41Array8793[3].method877();
		}
	}

	final void method14084() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			anInt8749 = ((Class505_Sub2) this).anInt8745;
			anInt8776 = ((Class505_Sub2) this).anInt8835;
			anInt8751 = ((Class505_Sub2) this).anInt8722;
			anInt8752 = ((Class505_Sub2) this).anInt8748;
			aFloat8735 = ((Class505_Sub2) this).aFloat8737;
			aFloat8736 = ((Class505_Sub2) this).aFloat8738;
		} else {
			anInt8749 = 0;
			anInt8776 = 0;
			anInt8751 = aClass158_5853.method2714();
			anInt8752 = aClass158_5853.method2716();
			aFloat8735 = 0.0F;
			aFloat8736 = 1.0F;
		}
		method13920();
		((Class505_Sub2) this).aFloat8732 = (float) ((Class505_Sub2) this).anInt8722 / 2.0F;
		((Class505_Sub2) this).aFloat8734 = (float) ((Class505_Sub2) this).anInt8748 / 2.0F;
		((Class505_Sub2) this).aFloat8797 = ((float) ((Class505_Sub2) this).anInt8745 + ((Class505_Sub2) this).aFloat8732);
		((Class505_Sub2) this).aFloat8741 = ((float) ((Class505_Sub2) this).anInt8835 + ((Class505_Sub2) this).aFloat8734);
	}

	public void method8634() {
		((Class505_Sub2) this).anInt8745 = 0;
		((Class505_Sub2) this).anInt8835 = 0;
		((Class505_Sub2) this).anInt8722 = aClass158_5853.method2714();
		((Class505_Sub2) this).anInt8748 = aClass158_5853.method2716();
		method13918();
	}

	final void method14085(int i, int i_629_) {
		anInt8823 = i;
		anInt8754 = i_629_;
		method13920();
		method13921();
	}

	final void method14086(int i, int i_630_) {
		anInt8823 = i;
		anInt8754 = i_630_;
		method13920();
		method13921();
	}

	abstract void method14087();

	public final int method8630(int i, int i_631_) {
		return i | i_631_;
	}

	abstract void method14088();

	public final void method8536(int i, int i_632_, int i_633_, int i_634_, int i_635_, int i_636_, int i_637_) {
		i += 1.0F;
		i_632_ += 1.0F;
		i_633_ += 1.0F;
		i_634_ += 1.0F;
		float f = (float) (i_633_ - i);
		float f_638_ = (float) (i_634_ - i_632_);
		float f_639_ = 1.0F / (float) Math.sqrt((double) (f * f + f_638_ * f_638_));
		f *= f_639_;
		f_638_ *= f_639_;
		i -= f;
		i_632_ -= f_638_;
		float f_640_ = -f_638_;
		float f_641_ = f;
		f_640_ *= 0.5F * (float) i_636_;
		f_641_ *= 0.5F * (float) i_636_;
		((Class505_Sub2) this).aClass160_Sub3_8790.method2763((float) i - f_640_, (float) i_632_ - f_641_, (float) i_633_ - f_640_, (float) i_634_ - f_641_, (float) i + f_640_, (float) i_632_ + f_641_, 0, i_635_, i_637_);
	}

	void method14089() {
		((Class505_Sub2) this).aClass32_8714.method818();
		((Class505_Sub2) this).anInterface4_8746.method26();
		((Class505_Sub2) this).anInterface4_8682.method26();
		((Class505_Sub2) this).anInterface4_8693.method26();
		for (int i = 0; i < 7; i++)
			((Class505_Sub2) this).aClass528_Sub3Array8840[i].method14280();
		((Class505_Sub2) this).aClass54_8837.method1090();
		((Class505_Sub2) this).anInterface32_8834.method26();
	}

	abstract Interface6 method14090(Class150 class150, int i, int i_642_, boolean bool, float[] fs, int i_643_, int i_644_);

	public abstract float method14091();

	abstract void method14092(boolean bool);

	final void method14093() {
		((Class505_Sub2) this).aClass384_8728.method6562(aClass384_8740);
		((Class505_Sub2) this).aClass384_8728.method6523(((Class505_Sub2) this).aClass384_8724);
		((Class505_Sub2) this).aClass384_8728.method6539(((Class505_Sub2) this).aFloatArrayArray8730[0]);
		((Class505_Sub2) this).aClass384_8728.method6540(((Class505_Sub2) this).aFloatArrayArray8730[1]);
		((Class505_Sub2) this).aClass384_8728.method6535(((Class505_Sub2) this).aFloatArrayArray8730[2]);
		((Class505_Sub2) this).aClass384_8728.method6536(((Class505_Sub2) this).aFloatArrayArray8730[3]);
		((Class505_Sub2) this).aClass384_8728.method6613(((Class505_Sub2) this).aFloatArrayArray8730[4]);
		((Class505_Sub2) this).aClass384_8728.method6538(((Class505_Sub2) this).aFloatArrayArray8730[5]);
		aClass384_8729.method6562(((Class505_Sub2) this).aClass384_8728);
		method13933(aClass384_8729);
	}

	abstract Interface6 method14094(int i, int i_645_, boolean bool, int[] is, int i_646_, int i_647_);

	Class294 method14095() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			if (!((Class505_Sub2) this).aBool8829) {
				((Class505_Sub2) this).aClass294_8710.method5209(((Class505_Sub2) this).aClass294_8704);
				((Class505_Sub2) this).aClass294_8710.method5208(((Class505_Sub2) this).aClass294_8706);
				((Class505_Sub2) this).aClass384_8685.method6522(((Class505_Sub2) this).aClass294_8710);
				((Class505_Sub2) this).aBool8829 = true;
			}
			return ((Class505_Sub2) this).aClass294_8710;
		}
		return ((Class505_Sub2) this).aClass294_8704;
	}

	Class384 method14096() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			if (!((Class505_Sub2) this).aBool8829)
				method14130();
			return ((Class505_Sub2) this).aClass384_8685;
		}
		return ((Class505_Sub2) this).aClass384_8705;
	}

	Class384 method14097() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			if (!((Class505_Sub2) this).aBool8829)
				method14130();
			return ((Class505_Sub2) this).aClass384_8685;
		}
		return ((Class505_Sub2) this).aClass384_8705;
	}

	abstract void method14098(int i);

	final Class384 method14099() {
		return aClass384_8729;
	}

	final Class384 method14100() {
		return aClass384_8729;
	}

	public abstract void method14101(Class352 class352, int i, int i_648_, int i_649_, int i_650_);

	final Class384 method14102() {
		return aClass384_8727;
	}

	public final void method8669(int i, int i_651_, int i_652_, int i_653_, int i_654_, int i_655_, Class455 class455, int i_656_, int i_657_) {
		/* empty */
	}

	final void method14103() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_380) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_380;
			if (class33 == Class33.aClass33_381)
				method13927();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8725;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method14104() {
		aClass384_8727.method6562(((Class505_Sub2) this).aClass384_8708);
		method13933(aClass384_8727);
		aFloat8697 = ((aClass384_8727.aFloatArray4667[14] - aClass384_8727.aFloatArray4667[15]) / (aClass384_8727.aFloatArray4667[11] - aClass384_8727.aFloatArray4667[10]));
		aFloat8726 = (-aClass384_8727.aFloatArray4667[14] / aClass384_8727.aFloatArray4667[10]);
		method14062();
	}

	final void method14105() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_380) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_380;
			if (class33 == Class33.aClass33_381)
				method13927();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8725;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method14106() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_379) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_379;
			if (class33 == Class33.aClass33_381)
				method13927();
			method13932();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8774;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0x8;
		}
	}

	public abstract void method14107(Class384 class384);

	final void method14108() {
		((Class505_Sub2) this).aBool8720 = false;
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_379) {
			method13932();
			method14030();
		}
	}

	final void method14109() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_381) {
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_381;
			method13927();
			method13940();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8724;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0x7;
		}
	}

	final void method14110() {
		((Class505_Sub2) this).aBool8723 = false;
		method13940();
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			method14030();
	}

	final void method14111() {
		if (!((Class505_Sub2) this).aBool8720) {
			int i;
			int i_658_;
			if (aClass158_5853 != null) {
				i_658_ = aClass158_5853.method2714();
				i = aClass158_5853.method2716();
			} else {
				i = 0;
				i_658_ = 0;
			}
			Class384 class384 = ((Class505_Sub2) this).aClass384_8774;
			if (i_658_ != 0 && i != 0)
				class384.method6530(0.0F, (float) i_658_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				class384.method6518();
			((Class505_Sub2) this).aClass384_8812.method6562(class384);
			method13933(((Class505_Sub2) this).aClass384_8812);
			((Class505_Sub2) this).aBool8720 = true;
		}
	}

	final void method14112() {
		if (!((Class505_Sub2) this).aBool8720) {
			int i;
			int i_659_;
			if (aClass158_5853 != null) {
				i_659_ = aClass158_5853.method2714();
				i = aClass158_5853.method2716();
			} else {
				i = 0;
				i_659_ = 0;
			}
			Class384 class384 = ((Class505_Sub2) this).aClass384_8774;
			if (i_659_ != 0 && i != 0)
				class384.method6530(0.0F, (float) i_659_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				class384.method6518();
			((Class505_Sub2) this).aClass384_8812.method6562(class384);
			method13933(((Class505_Sub2) this).aClass384_8812);
			((Class505_Sub2) this).aBool8720 = true;
		}
	}

	public final void O() {
		((Class505_Sub2) this).aBool8779 = false;
	}

	final void method14113() {
		aClass384_8727.method6562(((Class505_Sub2) this).aClass384_8708);
		method13933(aClass384_8727);
		aFloat8697 = ((aClass384_8727.aFloatArray4667[14] - aClass384_8727.aFloatArray4667[15]) / (aClass384_8727.aFloatArray4667[11] - aClass384_8727.aFloatArray4667[10]));
		aFloat8726 = (-aClass384_8727.aFloatArray4667[14] / aClass384_8727.aFloatArray4667[10]);
		method14062();
	}

	final void method14114() {
		aClass384_8727.method6562(((Class505_Sub2) this).aClass384_8708);
		method13933(aClass384_8727);
		aFloat8697 = ((aClass384_8727.aFloatArray4667[14] - aClass384_8727.aFloatArray4667[15]) / (aClass384_8727.aFloatArray4667[11] - aClass384_8727.aFloatArray4667[10]));
		aFloat8726 = (-aClass384_8727.aFloatArray4667[14] / aClass384_8727.aFloatArray4667[10]);
		method14062();
	}

	final void method14115(boolean bool) {
		if (bool != aBool8757) {
			aBool8757 = bool;
			method13956();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method14116(boolean bool) {
		if (bool != aBool8757) {
			aBool8757 = bool;
			method13956();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	abstract void method14117();

	public final void ib(int i, int i_660_, int i_661_) {
		if (anInt8810 != i || anInt8811 != i_660_ || anInt8680 != i_661_) {
			anInt8810 = i;
			anInt8811 = i_660_;
			anInt8680 = i_661_;
			method14062();
			method13991();
		}
	}

	public void method8635() {
		((Class505_Sub2) this).anInt8745 = 0;
		((Class505_Sub2) this).anInt8835 = 0;
		((Class505_Sub2) this).anInt8722 = aClass158_5853.method2714();
		((Class505_Sub2) this).anInt8748 = aClass158_5853.method2716();
		method13918();
	}

	public final boolean method8495() {
		return true;
	}

	final void method14118(boolean bool) {
		if (bool != aBool8756) {
			aBool8756 = bool;
			method14054();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	public final int di() {
		return anInt8702 + anInt8701 + anInt8761;
	}

	abstract void method14119();

	abstract void method14120();

	public int method8437(int i, int i_662_, int i_663_, int i_664_, int i_665_, int i_666_) {
		int i_667_ = 0;
		float f = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_662_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_663_));
		float f_668_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[14] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[2] * (float) i_664_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[6] * (float) i_665_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[10] * (float) i_666_));
		float f_669_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_662_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_663_));
		float f_670_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[15] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[3] * (float) i_664_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[7] * (float) i_665_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[11] * (float) i_666_));
		if (f < -f_669_ && f_668_ < -f_670_)
			i_667_ |= 0x10;
		else if (f > f_669_ && f_668_ > f_670_)
			i_667_ |= 0x20;
		float f_671_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_662_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_663_));
		float f_672_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[12] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[0] * (float) i_664_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[4] * (float) i_665_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[8] * (float) i_666_));
		if (f_671_ < -f_669_ && f_672_ < -f_670_)
			i_667_ |= 0x1;
		if (f_671_ > f_669_ && f_672_ > f_670_)
			i_667_ |= 0x2;
		float f_673_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_662_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_663_));
		float f_674_ = (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[13] + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[1] * (float) i_664_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[5] * (float) i_665_) + (((Class505_Sub2) this).aClass384_8728.aFloatArray4667[9] * (float) i_666_));
		if (f_673_ < -f_669_ && f_674_ < -f_670_)
			i_667_ |= 0x4;
		if (f_673_ > f_669_ && f_674_ > f_670_)
			i_667_ |= 0x8;
		return i_667_;
	}

	public final void is(int i, int i_675_, int i_676_) {
		if (anInt8810 != i || anInt8811 != i_675_ || anInt8680 != i_676_) {
			anInt8810 = i;
			anInt8811 = i_675_;
			anInt8680 = i_676_;
			method14062();
			method13991();
		}
	}

	abstract void method14121();

	abstract void method14122();

	Class41 method14123(int i) {
		return ((Class505_Sub2) this).aClass41Array8793[i];
	}

	public final boolean method8492() {
		return true;
	}

	abstract void method14124();

	abstract void method14125();

	final Class384 method14126() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381)
			return aClass384_8740;
		return aClass384_8712;
	}

	abstract void method14127();

	public final boolean method8406() {
		return true;
	}

	public final void method8459(int i) {
		/* empty */
	}

	public final void method14128(Class37 class37) {
		aClass37Array8783[anInt8780] = class37;
		method14133();
	}

	final Class384 method14129() {
		return aClass384_8729;
	}

	Class294 method14130() {
		if (((Class505_Sub2) this).aClass33_8719 == Class33.aClass33_381) {
			if (!((Class505_Sub2) this).aBool8829) {
				((Class505_Sub2) this).aClass294_8710.method5209(((Class505_Sub2) this).aClass294_8704);
				((Class505_Sub2) this).aClass294_8710.method5208(((Class505_Sub2) this).aClass294_8706);
				((Class505_Sub2) this).aClass384_8685.method6522(((Class505_Sub2) this).aClass294_8710);
				((Class505_Sub2) this).aBool8829 = true;
			}
			return ((Class505_Sub2) this).aClass294_8710;
		}
		return ((Class505_Sub2) this).aClass294_8704;
	}

	public void method8514(int i, int i_677_, int i_678_, int i_679_) {
		((Class505_Sub2) this).anInt8745 = i;
		((Class505_Sub2) this).anInt8835 = i_677_;
		((Class505_Sub2) this).anInt8722 = i_678_;
		((Class505_Sub2) this).anInt8748 = i_679_;
		method13918();
	}

	final void method14131() {
		if (method13889())
			method13953();
		anInt8831 = anInt8773;
		anInt8773 = 0;
	}

	abstract void method14132();

	final void method14133() {
		method14226();
	}

	abstract boolean method14134(Class150 class150, Class76 class76);

	abstract boolean method14135(Class150 class150, Class76 class76);

	abstract boolean method14136(Class150 class150, Class76 class76);

	abstract boolean method14137(Class150 class150, Class76 class76);

	public final void jf() {
		((Class505_Sub2) this).aBool8779 = false;
	}

	final Interface6 method14138(int i, int i_680_, boolean bool, int[] is) {
		return method14094(i, i_680_, bool, is, 0, 0);
	}

	final Interface6 method14139(Class150 class150, int i, int i_681_, boolean bool, byte[] is) {
		return method14143(class150, i, i_681_, bool, is, 0, 0);
	}

	final Interface6 method14140(Class150 class150, int i, int i_682_, boolean bool, float[] fs) {
		return method13961(class150, i, i_682_, bool, fs, 0, 0);
	}

	abstract Interface6 method14141(Class150 class150, Class76 class76, int i, int i_683_);

	abstract Interface6 method14142(Class150 class150, Class76 class76, int i, int i_684_);

	abstract Interface6 method14143(Class150 class150, int i, int i_685_, boolean bool, byte[] is, int i_686_, int i_687_);

	abstract Interface6 method14144(Class150 class150, int i, int i_688_, boolean bool, byte[] is, int i_689_, int i_690_);

	public final boolean method8465() {
		return true;
	}

	abstract Interface6 method14145(Class150 class150, int i, int i_691_, boolean bool, float[] fs, int i_692_, int i_693_);

	public final NativeSprite method8654(int i, int i_694_, boolean bool, boolean bool_695_) {
		return new Class160_Sub3(this, i, i_694_, bool, bool_695_);
	}

	public abstract boolean method14146();

	public final NativeSprite method8577(int i, int i_696_, boolean bool, boolean bool_697_) {
		return new Class160_Sub3(this, i, i_696_, bool, bool_697_);
	}

	public final void method8519(int i, int i_698_, int i_699_, int i_700_, int i_701_, int i_702_) {
		method8433(i, i_698_, i + i_699_, i_698_, i_701_, i_702_);
		method8433(i, i_698_ + i_700_, i + i_699_, i_698_ + i_700_, i_701_, i_702_);
		method8433(i, i_698_, i, i_698_ + i_700_, i_701_, i_702_);
		method8433(i + i_699_, i_698_, i + i_699_, i_698_ + i_700_, i_701_, i_702_);
	}

	public final void method14147() {
		((Class505_Sub2) this).anInterface30Array8781 = new Interface30[anInt8825];
		aClass384Array8782 = new Class384[anInt8825];
		aClass37Array8783 = new Class37[anInt8825];
		aClass68Array8784 = new Class68[anInt8825];
		aClass68Array8785 = new Class68[anInt8825];
		for (int i = 0; i < anInt8825; i++) {
			aClass68Array8785[i] = Class68.aClass68_683;
			aClass68Array8784[i] = Class68.aClass68_683;
			aClass37Array8783[i] = Class37.aClass37_393;
			aClass384Array8782[i] = new Class384();
		}
		aClass282_Sub24Array8716 = new Class282_Sub24[anInt8799 - 2];
		int[] is = { -1 };
		anInterface6_8788 = method14094(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class505_Sub2) this).anInterface6_8795 = method14094(1, 1, false, is, 0, 0);
		method8439(new Class282_Sub1_Sub2(262144));
		((Class505_Sub2) this).aClass70_8832 = method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }) });
		method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_690 }) });
		((Class505_Sub2) this).aClass70_8836 = method13995(new Class72[] { new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692), new Class72(Class69.aClass69_689) });
		((Class505_Sub2) this).aClass70_8721 = method13995(new Class72[] { new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692) });
		for (int i = 0; i < 7; i++) {
			((Class505_Sub2) this).aClass528_Sub3Array8839[i] = new Class528_Sub3(this, 0, 0, false, false);
			((Class505_Sub2) this).aClass528_Sub3Array8840[i] = new Class528_Sub3(this, 0, 0, true, true);
		}
		method13895();
		((Class505_Sub2) this).anInterface32_8834 = method13993(true);
		method13897();
		method8418();
		L();
		method8420();
		((Class505_Sub2) this).aClass160_Sub3_8790 = new Class160_Sub3(this, anInterface6_8788);
		((Class505_Sub2) this).aClass160_Sub3_8791 = new Class160_Sub3(this, ((Class505_Sub2) this).anInterface6_8795);
		ba(3, 0);
	}

	abstract Interface29 method14148(Class150 class150, Class76 class76, int i, int i_703_);

	abstract Interface29 method14149(Class150 class150, Class76 class76, int i, int i_704_);

	public final void method14150() {
		method14001(Class352.aClass352_4104, 2);
	}

	public final int method14151() {
		return anInt8780;
	}

	public final void method14152(int i) {
		if (anInt8780 != i) {
			anInt8780 = i;
			method13978();
		}
	}

	public abstract void method14153();

	public abstract void method14154();

	public final void method14155(int i) {
		switch (i) {
		case 0:
			method13966(Class68.aClass68_683, Class68.aClass68_683);
			break;
		case 4:
			method13966(Class68.aClass68_685, Class68.aClass68_685);
			break;
		case 2:
			method13966(Class68.aClass68_682, Class68.aClass68_687);
			break;
		case 1:
			method13966(Class68.aClass68_687, Class68.aClass68_687);
			break;
		case 3:
			method13966(Class68.aClass68_684, Class68.aClass68_683);
			break;
		}
	}

	public final void method14156(Class68 class68, Class68 class68_705_) {
		boolean bool = false;
		if (aClass68Array8784[anInt8780] != class68) {
			aClass68Array8784[anInt8780] = class68;
			method13979();
			bool = true;
		}
		if (aClass68Array8785[anInt8780] != class68_705_) {
			aClass68Array8785[anInt8780] = class68_705_;
			method13980();
			bool = true;
		}
		if (bool)
			((Class505_Sub2) this).anInt8703 &= ~0xd;
	}

	public final void method14157(Class68 class68, Class68 class68_706_) {
		boolean bool = false;
		if (aClass68Array8784[anInt8780] != class68) {
			aClass68Array8784[anInt8780] = class68;
			method13979();
			bool = true;
		}
		if (aClass68Array8785[anInt8780] != class68_706_) {
			aClass68Array8785[anInt8780] = class68_706_;
			method13980();
			bool = true;
		}
		if (bool)
			((Class505_Sub2) this).anInt8703 &= ~0xd;
	}

	public final void method14158(Class68 class68, Class68 class68_707_) {
		boolean bool = false;
		if (aClass68Array8784[anInt8780] != class68) {
			aClass68Array8784[anInt8780] = class68;
			method13979();
			bool = true;
		}
		if (aClass68Array8785[anInt8780] != class68_707_) {
			aClass68Array8785[anInt8780] = class68_707_;
			method13980();
			bool = true;
		}
		if (bool)
			((Class505_Sub2) this).anInt8703 &= ~0xd;
	}

	public final void method14159(int i, Class67 class67) {
		method13968(i, class67, false, false);
	}

	public final void method14160(int i, Class67 class67) {
		method13968(i, class67, false, false);
	}

	public abstract void method14161(int i, Interface4 interface4);

	abstract void method14162(int i, Class67 class67, boolean bool, boolean bool_708_);

	public final void method14163(int i) {
		if (anInt8780 != i) {
			anInt8780 = i;
			method13978();
		}
	}

	public final void method14164(int i, Class67 class67) {
		method13970(i, class67, false);
	}

	public final void method14165(int i, Class67 class67) {
		method13970(i, class67, false);
	}

	abstract void method14166(int i, Class67 class67, boolean bool);

	public void method14167(int i) {
		if (i != anInt8758) {
			anInt8758 = i;
			method13987();
		}
	}

	public void method14168(int i) {
		if (i != anInt8758) {
			anInt8758 = i;
			method13987();
		}
	}

	abstract void method14169();

	final Class384 method14170() {
		return aClass384Array8782[anInt8780];
	}

	public final void method8560(int i) {
		/* empty */
	}

	public final Class384 method14171() {
		return aClass384Array8782[anInt8780];
	}

	abstract void method14172();

	abstract void method14173(Interface32 interface32);

	public final void method14174(Class37 class37) {
		aClass37Array8783[anInt8780] = class37;
		method14133();
	}

	final void method14175() {
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			aClass37Array8783[anInt8780] = Class37.aClass37_393;
			aClass384Array8782[anInt8780].method6518();
			method14133();
		}
	}

	Class114 method14176(byte[] is) {
		if (is == null)
			return null;
		Class114 class114;
		try {
			class114 = new Class114(is);
		} catch (Exception exception) {
			return null;
		}
		return class114;
	}

	final void method14177() {
		((Class505_Sub2) this).anInterface4_8693 = method13994(false);
		((Class505_Sub2) this).anInterface4_8693.method31(3096, 12);
		aByteBuffer8838.clear();
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		aByteBuffer8838.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_709_ = (float) Math.sin(d);
			aByteBuffer8838.putFloat(f_709_);
			aByteBuffer8838.putFloat(f);
			aByteBuffer8838.putFloat(0.0F);
		}
		((Class505_Sub2) this).anInterface4_8693.method42(0, aByteBuffer8838.position(), aLong8695);
	}

	final void method14178() {
		method14226();
	}

	abstract void method14179();

	abstract void method14180();

	public final Class152 method8636(int i, int i_710_, int i_711_, int i_712_, int i_713_, int i_714_) {
		return new Class152_Sub2_Sub1(this, i, i_710_, i_711_, i_712_, i_713_, i_714_);
	}

	abstract void method14181();

	abstract void method14182();

	abstract void method14183();

	abstract void method14184();

	abstract void method14185();

	abstract void method14186();

	abstract void method14187();

	abstract void method14188();

	public final int method14189() {
		return anInt8780;
	}

	abstract void method14190();

	Class90 method14191() {
		return ((Class505_Sub2) this).aClass90_8807;
	}

	public final void B(int i, int i_715_, int i_716_, int i_717_, int i_718_, int i_719_) {
		if (aBool8755) {
			RA(false);
			((Class505_Sub2) this).aClass160_Sub3_8790.method2754(i, i_715_, i_716_, i_717_, 0, i_718_, i_719_);
			RA(true);
		} else
			((Class505_Sub2) this).aClass160_Sub3_8790.method2754(i, i_715_, i_716_, i_717_, 0, i_718_, i_719_);
	}

	Class90 method14192() {
		return ((Class505_Sub2) this).aClass90_8807;
	}

	final void method14193(int i) {
		if (((Class505_Sub2) this).anInt8815 != i) {
			Class73 class73;
			boolean bool;
			boolean bool_720_;
			if (i == 1) {
				class73 = Class73.aClass73_727;
				bool = true;
				bool_720_ = true;
			} else if (i == 2) {
				class73 = Class73.aClass73_725;
				bool = false;
				bool_720_ = true;
			} else if (i == 128) {
				class73 = Class73.aClass73_726;
				bool = true;
				bool_720_ = true;
			} else {
				class73 = Class73.aClass73_728;
				bool = false;
				bool_720_ = false;
			}
			if (bool != aBool8818) {
				aBool8818 = bool;
				method14238();
			}
			if (bool_720_ != aBool8817) {
				aBool8817 = bool_720_;
				method13914();
			}
			if (class73 != aClass73_8733) {
				aClass73_8733 = class73;
				method13894();
			}
			((Class505_Sub2) this).anInt8815 = i;
			((Class505_Sub2) this).anInt8703 &= ~0xc;
		}
	}

	final void method14194(int i) {
		if (((Class505_Sub2) this).anInt8815 != i) {
			Class73 class73;
			boolean bool;
			boolean bool_721_;
			if (i == 1) {
				class73 = Class73.aClass73_727;
				bool = true;
				bool_721_ = true;
			} else if (i == 2) {
				class73 = Class73.aClass73_725;
				bool = false;
				bool_721_ = true;
			} else if (i == 128) {
				class73 = Class73.aClass73_726;
				bool = true;
				bool_721_ = true;
			} else {
				class73 = Class73.aClass73_728;
				bool = false;
				bool_721_ = false;
			}
			if (bool != aBool8818) {
				aBool8818 = bool;
				method14238();
			}
			if (bool_721_ != aBool8817) {
				aBool8817 = bool_721_;
				method13914();
			}
			if (class73 != aClass73_8733) {
				aClass73_8733 = class73;
				method13894();
			}
			((Class505_Sub2) this).anInt8815 = i;
			((Class505_Sub2) this).anInt8703 &= ~0xc;
		}
	}

	final void method14195(int i) {
		if (((Class505_Sub2) this).anInt8815 != i) {
			Class73 class73;
			boolean bool;
			boolean bool_722_;
			if (i == 1) {
				class73 = Class73.aClass73_727;
				bool = true;
				bool_722_ = true;
			} else if (i == 2) {
				class73 = Class73.aClass73_725;
				bool = false;
				bool_722_ = true;
			} else if (i == 128) {
				class73 = Class73.aClass73_726;
				bool = true;
				bool_722_ = true;
			} else {
				class73 = Class73.aClass73_728;
				bool = false;
				bool_722_ = false;
			}
			if (bool != aBool8818) {
				aBool8818 = bool;
				method14238();
			}
			if (bool_722_ != aBool8817) {
				aBool8817 = bool_722_;
				method13914();
			}
			if (class73 != aClass73_8733) {
				aClass73_8733 = class73;
				method13894();
			}
			((Class505_Sub2) this).anInt8815 = i;
			((Class505_Sub2) this).anInt8703 &= ~0xc;
		}
	}

	final void method14196(int i) {
		if (anInt8844 != i) {
			anInt8844 = i;
			method13894();
		}
	}

	abstract void method14197();

	public final void method14198(Class37 class37) {
		aClass37Array8783[anInt8780] = class37;
		method14133();
	}

	public final void G(int i, int i_723_, int i_724_, int i_725_, int i_726_) {
		method8433(i, i_723_, i, i_723_ + i_724_, i_725_, i_726_);
	}

	abstract void method14199();

	abstract void method14200();

	final void method14201(boolean bool) {
		if (bool != aBool8808) {
			aBool8808 = bool;
			method13991();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	final void method14202() {
		if (((Class505_Sub2) this).aClass41_8753 != null)
			((Class505_Sub2) this).aClass41_8753.method877();
		method14013();
	}

	public final void method8474() {
		((Class505_Sub2) this).aClass32_8714.method833();
	}

	abstract void method14203();

	abstract void method14204();

	abstract void method14205();

	abstract Interface32 method14206(boolean bool);

	abstract Interface32 method14207(boolean bool);

	byte[] method14208(String string, String string_727_) {
		return ((Class505_Sub2) this).aClass317_8789.method5626(string, string_727_, (byte) 1);
	}

	abstract Class70 method14209(Class72[] class72s);

	abstract Class70 method14210(Class72[] class72s);

	final void method14211() {
		if (((Class505_Sub2) this).aClass33_8719 != Class33.aClass33_380) {
			Class33 class33 = ((Class505_Sub2) this).aClass33_8719;
			((Class505_Sub2) this).aClass33_8719 = Class33.aClass33_380;
			if (class33 == Class33.aClass33_381)
				method13927();
			((Class505_Sub2) this).aClass384_8708 = ((Class505_Sub2) this).aClass384_8725;
			method14030();
			method13918();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	public abstract void method14212(Class70 class70);

	public abstract void method14213(int i, Interface4 interface4);

	public abstract void method14214(int i, Interface4 interface4);

	abstract void method14215(Interface32 interface32);

	abstract Interface6 method14216(Class150 class150, Class76 class76, int i, int i_728_);

	abstract void method14217(Interface32 interface32);

	final void method14218() {
		method14161(0, ((Class505_Sub2) this).anInterface4_8682);
		method13996(((Class505_Sub2) this).aClass70_8833);
		method13923(Class352.aClass352_4099, 0, 1);
	}

	final void method14219() {
		method14161(0, ((Class505_Sub2) this).anInterface4_8682);
		method13996(((Class505_Sub2) this).aClass70_8833);
		method13923(Class352.aClass352_4099, 0, 1);
	}

	final void method14220() {
		method14161(0, ((Class505_Sub2) this).anInterface4_8682);
		method13996(((Class505_Sub2) this).aClass70_8833);
		method13923(Class352.aClass352_4099, 0, 1);
	}

	final void method14221() {
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			aClass37Array8783[anInt8780] = Class37.aClass37_393;
			aClass384Array8782[anInt8780].method6518();
			method14133();
		}
	}

	public final void method14222() {
		method14001(Class352.aClass352_4104, 2);
	}

	public final void method14223() {
		method14001(Class352.aClass352_4104, 2);
	}

	abstract void method14224(int i, Class67 class67, boolean bool, boolean bool_729_);

	final void method14225(Class352 class352, int i) {
		method14161(0, ((Class505_Sub2) this).anInterface4_8746);
		method13996(((Class505_Sub2) this).aClass70_8786);
		method13923(class352, 0, i);
	}

	abstract void method14226();

	public final boolean method8609() {
		return false;
	}

	final void method14227(boolean bool) {
		if (bool != aBool8756) {
			aBool8756 = bool;
			method14054();
			((Class505_Sub2) this).anInt8703 &= ~0xf;
		}
	}

	public abstract void method14228(Class352 class352, int i, int i_730_, int i_731_, int i_732_);

	public abstract void method14229(Class352 class352, int i, int i_733_, int i_734_, int i_735_);

	public abstract void method14230(Class352 class352, int i, int i_736_, int i_737_, int i_738_);

	public final void method14231() {
		if (((Class505_Sub2) this).anInt8703 != 2) {
			method13935();
			method13989(false);
			method13946(false);
			method13941(false);
			method13942(false);
			((Class505_Sub2) this).anInt8703 = 2;
		}
	}

	public final void method14232() {
		if (((Class505_Sub2) this).anInt8703 != 2) {
			method13935();
			method13989(false);
			method13946(false);
			method13941(false);
			method13942(false);
			((Class505_Sub2) this).anInt8703 = 2;
		}
	}

	public final void method14233() {
		if (((Class505_Sub2) this).anInt8703 != 2) {
			method13935();
			method13989(false);
			method13946(false);
			method13941(false);
			method13942(false);
			((Class505_Sub2) this).anInt8703 = 2;
		}
	}

	final void method14234() {
		if (((Class505_Sub2) this).anInt8703 != 8) {
			method13937();
			method13989(true);
			method13941(true);
			method13942(true);
			method13904(1);
			((Class505_Sub2) this).anInt8703 = 8;
		}
	}

	abstract void method14235(int i);

	abstract void method14236(int i);

	abstract Interface31 method14237(int i, boolean bool, int[][] is);

	abstract void method14238();

	abstract Interface31 method14239(int i, boolean bool, int[][] is);

	abstract void method14240(int i);
}
