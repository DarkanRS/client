import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import sun.misc.Unsafe;

public abstract class Class505_Sub2 extends GraphicalRenderer {

	public int anInt8701;
	public int anInt8702;
	public boolean aBool8718;
	protected int anInt8761;
	protected int anInt8799;
	protected float aFloat8813;
	protected float aFloat8819;
	public int anInt8825;
	protected boolean aBool8827;
	protected boolean aBool8828;
	static Object anObject8711 = new Object();
	static Matrix44Arr aClass384_8712 = new Matrix44Arr();
	int anInt8696 = 4194304;
	Class428 aClass428_8772 = new Class428();
	LinkedNodeList aClass473_8700;
	Matrix44Var aClass294_8704;
	Matrix44Arr aClass384_8705;
	Matrix44Var aClass294_8706;
	Matrix44Var aClass294_8804;
	public Matrix44Arr aClass384_8740;
	Matrix44Arr aClass384_8814;
	Matrix44Var aClass294_8710;
	Matrix44Arr aClass384_8685;
	Matrix44Var aClass294_8713;
	protected Matrix44Arr aClass384_8683;
	Matrix44Arr aClass384_8715;
	Vector3 aClass385_8707;
	float[] aFloatArray8717;
	boolean aBool8829;
	Class33 aClass33_8719;
	boolean aBool8720;
	Matrix44Arr aClass384_8774;
	Matrix44Arr aClass384_8812;
	boolean aBool8723;
	Matrix44Arr aClass384_8724;
	Matrix44Arr aClass384_8725;
	Matrix44Arr aClass384_8708;
	public Matrix44Arr aClass384_8727;
	Matrix44Arr aClass384_8728;
	public Matrix44Arr aClass384_8729;
	float[][] aFloatArrayArray8730;
	protected float aFloat8735;
	protected float aFloat8736;
	float aFloat8737;
	float aFloat8738;
	protected float aFloat8726;
	protected float aFloat8697;
	protected int anInt8822;
	protected int anInt8742;
	protected int anInt8743;
	protected int anInt8744;
	int anInt8745;
	int anInt8835;
	int anInt8722;
	int anInt8748;
	protected int anInt8749;
	protected int anInt8776;
	protected int anInt8751;
	protected int anInt8752;
	protected int anInt8823;
	protected int anInt8754;
	protected boolean aBool8755;
	protected boolean aBool8756;
	protected boolean aBool8757;
	protected boolean aBool8684;
	protected boolean aBool8759;
	protected boolean aBool8760;
	public float[] aFloatArray8747;
	protected float[] aFloatArray8762;
	float[] aFloatArray8763;
	float[] aFloatArray8764;
	int anInt8765;
	public float aFloat8766;
	public float aFloat8767;
	public float aFloat8768;
	protected float aFloat8769;
	public float aFloat8770;
	protected float aFloat8826;
	int anInt8775;
	int anInt8806;
	int anInt8821;
	protected int anInt8780;
	Class41[] aClass41Array8793;
	Class55[] aClass55Array8802;
	boolean aBool8805;
	protected boolean aBool8809;
	protected int anInt8810;
	protected int anInt8811;
	protected int anInt8680;
	int anInt8815;
	protected Class73 aClass73_8733;
	protected boolean aBool8817;
	protected boolean aBool8818;
	boolean aBool8681;
	Class528_Sub3[] aClass528_Sub3Array8839;
	Class528_Sub3[] aClass528_Sub3Array8840;
	Matrix44Arr aClass384_8841;
	Matrix44Var aClass294_8842;
	protected int anInt8844;
	Index aClass317_8789;
	public int anInt8709;
	int anInt8824;
	Class66 aClass66_8787;
	int[] anIntArray8803;
	public Unsafe anUnsafe8830;
	public ByteBuffer aByteBuffer8838;
	public long aLong8695;
	Class49 aClass49_8694;
	protected boolean aBool8692;
	Class48 aClass48_8794;
	Class47 aClass47_8698;
	Class103 aClass103_8796;
	Class41_Sub1_Sub1 aClass41_Sub1_Sub1_8691;
	Class41_Sub1_Sub2 aClass41_Sub1_Sub2_8798;
	Class32 aClass32_8714;
	Class41 aClass41_8753;
	Class54 aClass54_8837;
	protected boolean aBool8843;
	protected int anInt8831;
	protected int anInt8773;
	int anInt8703;
	int anInt8777;
	int anInt8778;
	public int anInt8820;
	NativeHeap aNativeHeap8699;
	Class152_Sub2 aClass152_Sub2_8731;
	float aFloat8732;
	float aFloat8734;
	float aFloat8797;
	float aFloat8741;
	Interface4 anInterface4_8746;
	Class70 aClass70_8786;
	protected int anInt8758;
	int anInt8739;
	Class90 aClass90_8807;
	boolean aBool8779;
	protected boolean aBool8808;
	Interface4 anInterface4_8682;
	Class70 aClass70_8833;
	Interface30[] anInterface30Array8781;
	protected Matrix44Arr[] aClass384Array8782;
	protected Class37[] aClass37Array8783;
	protected Class68[] aClass68Array8784;
	protected Class68[] aClass68Array8785;
	protected Class282_Sub24[] aClass282_Sub24Array8716;
	public Interface6 anInterface6_8788;
	Interface6 anInterface6_8795;
	Class70 aClass70_8832;
	Class70 aClass70_8836;
	Class70 aClass70_8721;
	Interface32 anInterface32_8834;
	Class160_Sub3 aClass160_Sub3_8790;
	Class160_Sub3 aClass160_Sub3_8791;
	Interface4 anInterface4_8693;

	final Matrix44Arr method13884() {
		return this.aClass384Array8782[this.anInt8780];
	}

	public void method13885(Interface7 interface7_1) {
		this.aClass428_8772.method7191(interface7_1);
	}

	void method13886() {
		ArrayList arraylist_1 = this.aClass428_8772.method7193();
		Iterator iterator_2 = arraylist_1.iterator();

		while (iterator_2.hasNext()) {
			Interface7 interface7_3 = (Interface7) iterator_2.next();
			interface7_3.method26();
		}

	}

	public abstract boolean method13887();

	public abstract boolean method13888();

	final boolean method13889() {
		return this.aBool8692;
	}

	public abstract Class101 method13890(String var1);

	public final void method8586(Matrix44Arr matrix44arr_1) {
		this.aClass384_8724.method6562(matrix44arr_1);
		this.method13926();
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method14030();
		}

	}

	Class114 method13891(byte[] bytes_1) {
		if (bytes_1 == null) {
			return null;
		} else {
			try {
				Class114 class114_2 = new Class114(bytes_1);
				return class114_2;
			} catch (Exception exception_4) {
				return null;
			}
		}
	}

	public abstract void method13892(Matrix44Arr var1, Matrix44Arr var2, Matrix44Arr var3);

	public static boolean method13893() {
		return Class362.getNativeLibraryLoader().loadLibrary("jaclib", 879905383);
	}

	Class505_Sub2(Interface22 interface22_1, Index index_2, int i_3, int i_4) {
		super(interface22_1);
		this.anInt8696 = 4194304;
		this.aClass473_8700 = new LinkedNodeList();
		this.aClass294_8704 = new Matrix44Var();
		this.aClass384_8705 = new Matrix44Arr();
		this.aClass294_8706 = new Matrix44Var();
		this.aClass294_8804 = new Matrix44Var();
		this.aClass384_8740 = new Matrix44Arr();
		this.aClass384_8814 = new Matrix44Arr();
		this.aClass294_8710 = new Matrix44Var();
		this.aClass384_8685 = new Matrix44Arr();
		this.aClass294_8713 = new Matrix44Var();
		this.aClass384_8683 = new Matrix44Arr();
		this.aClass384_8715 = new Matrix44Arr();
		this.aClass385_8707 = new Vector3();
		this.aFloatArray8717 = new float[4];
		this.aBool8829 = false;
		this.aClass33_8719 = Class33.aClass33_380;
		this.aBool8720 = false;
		this.aClass384_8774 = new Matrix44Arr();
		this.aClass384_8812 = new Matrix44Arr();
		this.aBool8723 = false;
		this.aClass384_8724 = new Matrix44Arr();
		this.aClass384_8725 = new Matrix44Arr();
		this.aClass384_8708 = this.aClass384_8725;
		this.aClass384_8727 = new Matrix44Arr();
		this.aClass384_8728 = new Matrix44Arr();
		this.aClass384_8729 = new Matrix44Arr();
		this.aFloatArrayArray8730 = new float[6][4];
		this.aFloat8735 = 0.0F;
		this.aFloat8736 = 1.0F;
		this.aFloat8737 = 0.0F;
		this.aFloat8738 = 1.0F;
		this.aFloat8726 = 50.0F;
		this.aFloat8697 = 3584.0F;
		this.anInt8822 = 0;
		this.anInt8742 = 0;
		this.anInt8743 = 0;
		this.anInt8744 = 0;
		this.anInt8745 = 0;
		this.anInt8835 = 0;
		this.anInt8722 = 0;
		this.anInt8748 = 0;
		this.anInt8749 = 0;
		this.anInt8776 = 0;
		this.anInt8751 = 0;
		this.anInt8752 = 0;
		this.anInt8823 = 0;
		this.anInt8754 = 0;
		this.aBool8755 = true;
		this.aBool8756 = false;
		this.aBool8757 = false;
		this.aBool8684 = false;
		this.aBool8759 = true;
		this.aBool8760 = false;
		this.aFloatArray8747 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.aFloatArray8762 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		this.aFloatArray8763 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.aFloatArray8764 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		this.anInt8765 = 16777215;
		this.aFloat8766 = 1.0F;
		this.aFloat8767 = 1.0F;
		this.aFloat8768 = 1.0F;
		this.aFloat8769 = 1.0F;
		this.aFloat8770 = -1.0F;
		this.aFloat8826 = -1.0F;
		this.anInt8775 = 8;
		this.anInt8806 = 3;
		this.anInt8821 = 128;
		this.anInt8780 = 0;
		this.aClass41Array8793 = new Class41[16];
		this.aClass55Array8802 = new Class55[2];
		this.aBool8805 = false;
		this.aBool8809 = true;
		this.anInt8810 = -1;
		this.anInt8811 = -1;
		this.anInt8680 = 0;
		this.anInt8815 = 1;
		this.aClass73_8733 = Class73.aClass73_727;
		this.aBool8817 = true;
		this.aBool8818 = true;
		this.aBool8681 = false;
		new Stream();
		this.aClass528_Sub3Array8839 = new Class528_Sub3[7];
		this.aClass528_Sub3Array8840 = new Class528_Sub3[7];
		this.aClass384_8841 = new Matrix44Arr();
		this.aClass294_8842 = new Matrix44Var();
		this.anInt8844 = -1;

		try {
			this.aClass317_8789 = index_2;
			this.anInt8709 = i_3;
			this.anInt8824 = i_4;
			Class38.method854(false, true, -1368886840);
			if (this.anInterface22_5834 != null) {
				this.aClass66_8787 = new Class66(this, this.anInterface22_5834);
			} else {
				this.aClass66_8787 = null;
			}

			if (this.anInt8824 == 0) {
				this.anIntArray8803 = Class540.anIntArray7136;
			} else {
				this.anIntArray8803 = EnumIndexLoader.anIntArray5379;
			}

			try {
				Field field_5 = Unsafe.class.getDeclaredField("theUnsafe");
				field_5.setAccessible(true);
				this.anUnsafe8830 = (Unsafe) field_5.get((Object) null);
			} catch (Exception exception_6) {
				;
			}

			this.aByteBuffer8838 = ByteBuffer.allocateDirect(4194304);
			this.aByteBuffer8838.order(ByteOrder.nativeOrder());
			this.aLong8695 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer8838);
		} catch (Throwable throwable_7) {
			throwable_7.printStackTrace();
			this.method8396(-1513744370);
			if (throwable_7 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) throwable_7;
			}

			throw new RuntimeException("");
		}

		this.method8439(this.method8438(131072));
	}

	abstract void method13894();

	final void method13895() {
		this.aClass49_8694 = new Class49(this);
		this.aBool8692 = false;

		try {
			this.aClass48_8794 = new Class48_Sub2(this);
			this.aClass47_8698 = new Class47_Sub1(this);
			this.aClass103_8796 = new Class103_Sub1(this);
			this.aClass41_Sub1_Sub1_8691 = new Class41_Sub1_Sub1(this, this.aClass49_8694);
			this.aClass41_Sub1_Sub2_8798 = new Class41_Sub1_Sub2(this, this.aClass49_8694);
		} catch (Exception exception_4) {
			exception_4.printStackTrace();
			this.aClass48_8794 = new Class48_Sub1(this);
			this.aClass47_8698 = new Class47_Sub2(this);
			this.aClass103_8796 = new Class103_Sub2(this);
			this.aClass41_Sub1_Sub1_8691 = null;
			this.aClass41_Sub1_Sub2_8798 = null;
			this.aBool8692 = true;
		}

		int i_2;
		int i_3;
		if (this.aClass158_5853 != null) {
			i_2 = this.aClass158_5853.method2714();
			i_3 = this.aClass158_5853.method2716();
		} else {
			i_3 = 0;
			i_2 = 0;
		}

		this.aClass32_8714 = new Class32(this, i_2, i_3);
		if (!this.aBool8692) {
			this.aClass55Array8802[1] = new Class55_Sub1(this);
			this.aClass32_8714.method816(this.aClass55Array8802[1]);
		}

		if (this.aClass41_8753 != null) {
			this.aClass41_8753.method885();
			this.aClass41_8753 = null;
		}

		this.method13899();
	}

	Class41 method13896(int i_1) {
		return this.aClass41Array8793[i_1];
	}

	void method13897() {
		this.method13986(7);
		this.method13976();
	}

	public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * f_1 + this.aClass384_8728.buf[7] * f_2 + this.aClass384_8728.buf[11] * f_3;
		float f_6 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * f_1 + this.aClass384_8728.buf[4] * f_2 + this.aClass384_8728.buf[8] * f_3;
		float f_7 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * f_1 + this.aClass384_8728.buf[5] * f_2 + this.aClass384_8728.buf[9] * f_3;
		float f_8 = this.aClass384_8740.buf[14] + this.aClass384_8740.buf[2] * f_1 + this.aClass384_8740.buf[6] * f_2 + this.aClass384_8740.buf[10] * f_3;
		floats_4[0] = this.aFloat8797 + this.aFloat8732 * f_6 / f_5;
		floats_4[1] = this.aFloat8741 + this.aFloat8734 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	Class90 method13898() {
		return this.aClass90_8807;
	}

	void method13899() {
		this.aClass32_8714.method819();

		for (int i_1 = 0; i_1 < this.aClass55Array8802.length; i_1++) {
			if (this.aClass55Array8802[i_1] != null && this.aClass55Array8802[i_1].method1107()) {
				this.aClass55Array8802[i_1].method1099();
			}
		}

		this.aClass54_8837 = new Class54(this);
		this.method13944();
		this.method14009();
		this.method14177();
		this.aClass54_8837.method1089(this);
	}

	void method13900() {
		this.aClass32_8714.method818();
		this.anInterface4_8746.method26();
		this.anInterface4_8682.method26();
		this.anInterface4_8693.method26();

		for (int i_1 = 0; i_1 < 7; i_1++) {
			this.aClass528_Sub3Array8840[i_1].method14280();
		}

		this.aClass54_8837.method1090();
		this.anInterface32_8834.method26();
	}

	public final NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class160_Sub3 class160_sub3_6 = new Class160_Sub3(this, i_3, i_4, bool_5, false);
		class160_sub3_6.method2750(0, 0, i_3, i_4, i_1, i_2);
		return class160_sub3_6;
	}

	public final boolean method8399() {
		return true;
	}

	public final void fm(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (this.aClass158_5853 != null) {
			i_6 = this.aClass158_5853.method2714();
			i_5 = this.aClass158_5853.method2716();
		} else {
			i_5 = 0;
			i_6 = 0;
		}

		if (i_1 <= 0 && i_3 >= i_6 - 1 && i_2 <= 0 && i_4 >= i_5 - 1) {
			this.L();
		} else {
			this.anInt8743 = i_1 >= 0 ? i_1 : 0;
			this.anInt8744 = i_3 <= i_6 ? i_3 : i_6;
			this.anInt8822 = i_2 >= 0 ? i_2 : 0;
			this.anInt8742 = i_4 <= i_5 ? i_4 : i_5;
			if (!this.aBool8843) {
				this.aBool8843 = true;
				this.method13922();
			}

			this.method13921();
		}

	}

	void method8397() {
		if (!this.aBool8681) {
			this.method13900();
			this.aClass66_8787.method1279();

			for (Node node_1 = this.aClass473_8700.getBack(); node_1 != null; node_1 = this.aClass473_8700.getPrevious()) {
				((Class282_Sub1_Sub2) node_1).method15609();
			}

			Class13.method508(false, true, 254704194);

			int i_2;
			for (i_2 = 0; i_2 < this.aClass41Array8793.length; i_2++) {
				if (this.aClass41Array8793[i_2] != null) {
					this.aClass41Array8793[i_2].method878();
					this.aClass41Array8793[i_2] = null;
				}
			}

			for (i_2 = 0; i_2 < this.aClass55Array8802.length; i_2++) {
				if (this.aClass55Array8802[i_2] != null) {
					this.aClass55Array8802[i_2].method1105();
					this.aClass55Array8802[i_2] = null;
				}
			}

			this.method13886();
			this.method8398(0);
			this.aBool8681 = true;
		}

	}

	public void method13901(Interface7 interface7_1) {
		this.aClass428_8772.method7201(interface7_1, anObject8711);
	}

	public final boolean method8664() {
		return true;
	}

	public final boolean method8403() {
		return this.aClass55Array8802[1] != null;
	}

	final void method13903() {
		if (this.method13889()) {
			this.method13953();
		}

		this.anInt8831 = this.anInt8773;
		this.anInt8773 = 0;
	}

	final void method13904(int i_1) {
		if (this.anInt8815 != i_1) {
			Class73 class73_2;
			boolean bool_3;
			boolean bool_4;
			if (i_1 == 1) {
				class73_2 = Class73.aClass73_727;
				bool_3 = true;
				bool_4 = true;
			} else if (i_1 == 2) {
				class73_2 = Class73.aClass73_725;
				bool_3 = false;
				bool_4 = true;
			} else if (i_1 == 128) {
				class73_2 = Class73.aClass73_726;
				bool_3 = true;
				bool_4 = true;
			} else {
				class73_2 = Class73.aClass73_728;
				bool_3 = false;
				bool_4 = false;
			}

			if (bool_3 != this.aBool8818) {
				this.aBool8818 = bool_3;
				this.method14238();
			}

			if (bool_4 != this.aBool8817) {
				this.aBool8817 = bool_4;
				this.method13914();
			}

			if (class73_2 != this.aClass73_8733) {
				this.aClass73_8733 = class73_2;
				this.method13894();
			}

			this.anInt8815 = i_1;
			this.anInt8703 &= ~0xc;
		}

	}

	public final void iw(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = this.anInt8765 != i_1;
		if (bool_7 || this.aFloat8770 != f_2 || this.aFloat8826 != f_3) {
			this.anInt8765 = i_1;
			this.aFloat8770 = f_2;
			this.aFloat8826 = f_3;
			if (bool_7) {
				this.aFloat8766 = (float) (this.anInt8765 & 0xff0000) / 1.671168E7F;
				this.aFloat8767 = (float) (this.anInt8765 & 0xff00) / 65280.0F;
				this.aFloat8768 = (float) (this.anInt8765 & 0xff) / 255.0F;
				this.method13948();
			}

			this.method13949();
		}

		if (this.aFloatArray8763[0] != f_4 || this.aFloatArray8763[1] != f_5 || this.aFloatArray8763[2] != f_6) {
			this.aFloatArray8763[0] = f_4;
			this.aFloatArray8763[1] = f_5;
			this.aFloatArray8763[2] = f_6;
			this.aFloatArray8764[0] = -f_4;
			this.aFloatArray8764[1] = -f_5;
			this.aFloatArray8764[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt((double) (f_4 * f_4 + f_5 * f_5 + f_6 * f_6)));
			this.aFloatArray8747[0] = f_4 * f_8;
			this.aFloatArray8747[1] = f_5 * f_8;
			this.aFloatArray8747[2] = f_6 * f_8;
			this.aFloatArray8762[0] = -this.aFloatArray8747[0];
			this.aFloatArray8762[1] = -this.aFloatArray8747[1];
			this.aFloatArray8762[2] = -this.aFloatArray8747[2];
			this.method13950();
			this.anInt8777 = (int) (f_4 * 256.0F / f_5);
			this.anInt8778 = (int) (f_6 * 256.0F / f_5);
		}

		this.method13951();
	}

	public final boolean method8454() {
		return true;
	}

	public final boolean method8407() {
		return false;
	}

	public final boolean method8405() {
		return this.aBool8828;
	}

	public abstract float method13905();

	public void method8398(int i_1) {
		if (this.aClass66_8787 != null) {
			this.aClass66_8787.method1278();
		}

		this.anInt8820 = i_1 & 0x7fffffff;
	}

	void method13906() {
		this.method13907();
	}

	void method13907() {
		this.method13936();
		this.method13938();
		this.method13934();
		this.method8421();
		this.L();
	}

	public final boolean method8469() {
		if (this.aClass55Array8802[1] != null && !this.aClass55Array8802[1].method1107()) {
			boolean bool_1 = this.aClass32_8714.method816(this.aClass55Array8802[1]);
			if (bool_1) {
				this.aClass66_8787.method1279();
			}

			return bool_1;
		} else {
			return false;
		}
	}

	public final void method8490() {
		if (this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107()) {
			this.aClass32_8714.method822(this.aClass55Array8802[1]);
			this.aClass66_8787.method1279();
		}

	}

	public final boolean method8471() {
		return this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107();
	}

	final void method8592(float f_1, float f_2, float f_3) {
		Class55_Sub1.aFloat9188 = f_1;
		Class55_Sub1.aFloat9184 = f_2;
		Class55_Sub1.aFloat9189 = f_3;
		Class55_Sub1.aFloat9186 = (float) 1.0;
	}

	boolean method13908(float f_1, float f_2, float f_4, float f_5) {
		this.aByteBuffer8838.clear();
		this.aByteBuffer8838.putFloat(f_1);
		this.aByteBuffer8838.putFloat(f_2);
		this.aByteBuffer8838.putFloat((float) 0.0);
		this.aByteBuffer8838.putFloat(f_4);
		this.aByteBuffer8838.putFloat(f_5);
		this.aByteBuffer8838.putFloat((float) 0.0);
		return this.anInterface4_8682.method42(0, this.aByteBuffer8838.position(), this.aLong8695);
	}

	abstract void method13909();

	public final Class282_Sub1 method8438(int i_1) {
		Class282_Sub1_Sub2 class282_sub1_sub2_2 = new Class282_Sub1_Sub2(i_1);
		this.aClass473_8700.insertBack(class282_sub1_sub2_2);
		return class282_sub1_sub2_2;
	}

	public final void method8439(Class282_Sub1 class282_sub1_1) {
		this.aNativeHeap8699 = ((Class282_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
	}

	public final NativeHeapBuffer method13910(int i_1, boolean bool_2) {
		return this.aNativeHeap8699.method759(i_1, bool_2);
	}

	final Interface32 method13911(int i_1) {
		if (this.anInterface32_8834.method39() < i_1 * 2) {
			this.anInterface32_8834.method208(i_1);
		}

		return this.anInterface32_8834;
	}

	public final int za() {
		return this.anInt8702 + this.anInt8701 + this.anInt8761;
	}

	public final FontRenderer method8660(FontMetrics fontmetrics_1, Class91[] arr_2, boolean bool_3) {
		return new Class8_Sub4(this, fontmetrics_1, arr_2, bool_3);
	}

	public final NativeSprite method8444(Class91 class91_1, boolean bool_2) {
		NativeSprite nativesprite_3;
		if (class91_1.anInt957 != 0 && class91_1.anInt954 != 0) {
			int[] ints_4 = new int[class91_1.anInt957 * class91_1.anInt954];
			int i_5 = 0;
			int i_6 = 0;
			int i_7;
			int i_8;
			if (class91_1.aByteArray961 != null) {
				for (i_7 = 0; i_7 < class91_1.anInt954; i_7++) {
					for (i_8 = 0; i_8 < class91_1.anInt957; i_8++) {
						ints_4[i_6++] = class91_1.aByteArray961[i_5] << 24 | class91_1.anIntArray955[class91_1.aByteArray960[i_5] & 0xff];
						++i_5;
					}
				}
			} else {
				for (i_7 = 0; i_7 < class91_1.anInt954; i_7++) {
					for (i_8 = 0; i_8 < class91_1.anInt957; i_8++) {
						int i_9 = class91_1.anIntArray955[class91_1.aByteArray960[i_5++] & 0xff];
						ints_4[i_6++] = i_9 != 0 ? ~0xffffff | i_9 : 0;
					}
				}
			}

			nativesprite_3 = this.createNativeSprite(ints_4, class91_1.anInt957, class91_1.anInt957, class91_1.anInt954, 228280722);
		} else {
			nativesprite_3 = this.createNativeSprite(new int[1], 1, 1, 1, -51231437);
		}

		nativesprite_3.method2743(class91_1.anInt956, class91_1.anInt959, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_3;
	}

	public final NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new Class160_Sub3(this, i_4, i_5, ints_1, i_2, i_3);
	}

	final Matrix44Arr method13912() {
		return this.aClass384_8727;
	}

	abstract void method13913();

	public final Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
	}

	abstract void method13914();

	public final MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new Class528_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public final void method8542(Class282_Sub1 class282_sub1_1) {
		this.aNativeHeap8699 = ((Class282_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
	}

	public final int method8546(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public final Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
		return new HardwareGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, 512);
	}

	abstract void method13915();

	public final Matrix44Var method8450() {
		return this.aClass294_8842;
	}

	abstract void method13916();

	public final void method8477(Class152 class152_1) {
		this.aClass152_Sub2_8731 = (Class152_Sub2) class152_1;
	}

	abstract Interface1 method13917(Class150 var1, int var2, int var3, int var4, boolean var5, byte[] var6);

	public void method8421() {
		this.anInt8745 = 0;
		this.anInt8835 = 0;
		this.anInt8722 = this.aClass158_5853.method2714();
		this.anInt8748 = this.aClass158_5853.method2716();
		this.method13918();
	}

	public void method8617(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8745 = i_1;
		this.anInt8835 = i_2;
		this.anInt8722 = i_3;
		this.anInt8748 = i_4;
		this.method13918();
	}

	final void method13918() {
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.anInt8749 = this.anInt8745;
			this.anInt8776 = this.anInt8835;
			this.anInt8751 = this.anInt8722;
			this.anInt8752 = this.anInt8748;
			this.aFloat8735 = this.aFloat8737;
			this.aFloat8736 = this.aFloat8738;
		} else {
			this.anInt8749 = 0;
			this.anInt8776 = 0;
			this.anInt8751 = this.aClass158_5853.method2714();
			this.anInt8752 = this.aClass158_5853.method2716();
			this.aFloat8735 = 0.0F;
			this.aFloat8736 = 1.0F;
		}

		this.method13920();
		this.aFloat8732 = (float) this.anInt8722 / 2.0F;
		this.aFloat8734 = (float) this.anInt8748 / 2.0F;
		this.aFloat8797 = (float) this.anInt8745 + this.aFloat8732;
		this.aFloat8741 = (float) this.anInt8835 + this.aFloat8734;
	}

	public final boolean method8674() {
		return true;
	}

	public final void qa(int[] ints_1) {
		ints_1[0] = this.anInt8743;
		ints_1[1] = this.anInt8822;
		ints_1[2] = this.anInt8744;
		ints_1[3] = this.anInt8742;
	}

	public void en(float f_1, float f_2) {
		this.aFloat8737 = f_1;
		this.aFloat8738 = f_2;
		this.method13918();
	}

	public final void fq(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method8433(i_1, i_2, i_1 + i_3, i_2, i_4, i_5);
	}

	public final void o(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (this.aClass158_5853 != null) {
			i_6 = this.aClass158_5853.method2714();
			i_5 = this.aClass158_5853.method2716();
		} else {
			i_5 = 0;
			i_6 = 0;
		}

		i_1 = i_1 >= 0 ? i_1 : 0;
		i_3 = i_3 <= i_6 ? i_3 : i_6;
		i_2 = i_2 >= 0 ? i_2 : 0;
		i_4 = i_4 <= i_5 ? i_4 : i_5;
		boolean bool_7 = false;
		if (this.anInt8743 < i_1) {
			this.anInt8743 = i_1;
			bool_7 = true;
		}

		if (this.anInt8744 > i_3) {
			this.anInt8744 = i_3;
			bool_7 = true;
		}

		if (this.anInt8822 < i_2) {
			this.anInt8822 = i_2;
			bool_7 = true;
		}

		if (this.anInt8742 > i_4) {
			this.anInt8742 = i_4;
			bool_7 = true;
		}

		if (bool_7) {
			if (!this.aBool8843) {
				this.aBool8843 = true;
				this.method13922();
			}

			this.method13921();
		}

	}

	final void method13919() {
		this.anInt8823 = 0;
		this.anInt8754 = 0;
		this.method13920();
		this.method13921();
	}

	abstract void method13920();

	abstract void method13921();

	abstract void method13922();

	public abstract void method13923(Class352 var1, int var2, int var3);

	void method8485() {
		if (!this.aBool8681) {
			this.method13900();
			this.aClass66_8787.method1279();

			for (Node node_1 = this.aClass473_8700.getBack(); node_1 != null; node_1 = this.aClass473_8700.getPrevious()) {
				((Class282_Sub1_Sub2) node_1).method15609();
			}

			Class13.method508(false, true, 1160906359);

			int i_2;
			for (i_2 = 0; i_2 < this.aClass41Array8793.length; i_2++) {
				if (this.aClass41Array8793[i_2] != null) {
					this.aClass41Array8793[i_2].method878();
					this.aClass41Array8793[i_2] = null;
				}
			}

			for (i_2 = 0; i_2 < this.aClass55Array8802.length; i_2++) {
				if (this.aClass55Array8802[i_2] != null) {
					this.aClass55Array8802[i_2].method1105();
					this.aClass55Array8802[i_2] = null;
				}
			}

			this.method13886();
			this.method8398(0);
			this.aBool8681 = true;
		}

	}

	abstract void method13924();

	abstract Interface4 method13925(boolean var1);

	public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * f_1 + this.aClass384_8728.buf[7] * f_2 + this.aClass384_8728.buf[11] * f_3;
		float f_6 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * f_1 + this.aClass384_8728.buf[4] * f_2 + this.aClass384_8728.buf[8] * f_3;
		float f_7 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * f_1 + this.aClass384_8728.buf[5] * f_2 + this.aClass384_8728.buf[9] * f_3;
		float f_8 = this.aClass384_8740.buf[14] + this.aClass384_8740.buf[2] * f_1 + this.aClass384_8740.buf[6] * f_2 + this.aClass384_8740.buf[10] * f_3;
		floats_4[0] = this.aFloat8797 + this.aFloat8732 * f_6 / f_5;
		floats_4[1] = this.aFloat8741 + this.aFloat8734 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	final void method13926() {
		this.aClass384_8728.method6562(this.aClass384_8740);
		this.aClass384_8728.method6523(this.aClass384_8724);
		this.aClass384_8728.method6539(this.aFloatArrayArray8730[0]);
		this.aClass384_8728.method6540(this.aFloatArrayArray8730[1]);
		this.aClass384_8728.method6535(this.aFloatArrayArray8730[2]);
		this.aClass384_8728.method6536(this.aFloatArrayArray8730[3]);
		this.aClass384_8728.method6613(this.aFloatArrayArray8730[4]);
		this.aClass384_8728.method6538(this.aFloatArrayArray8730[5]);
		this.aClass384_8729.method6562(this.aClass384_8728);
		this.method13933(this.aClass384_8729);
	}

	public final Matrix44Arr method8453() {
		return this.aClass384_8724;
	}

	final void method13927() {
		this.aBool8829 = false;
	}

	Matrix44Arr method13930() {
		if (this.aClass33_8719 == Class33.aClass33_381) {
			if (!this.aBool8829) {
				this.method14130();
			}

			return this.aClass384_8685;
		} else {
			return this.aClass384_8705;
		}
	}

	final Matrix44Arr method13931() {
		return this.aClass384_8729;
	}

	final void method13932() {
		if (!this.aBool8720) {
			int i_1;
			int i_2;
			if (this.aClass158_5853 != null) {
				i_2 = this.aClass158_5853.method2714();
				i_1 = this.aClass158_5853.method2716();
			} else {
				i_1 = 0;
				i_2 = 0;
			}

			Matrix44Arr matrix44arr_3 = this.aClass384_8774;
			if (i_2 != 0 && i_1 != 0) {
				matrix44arr_3.method6530(0.0F, (float) i_2, 0.0F, (float) i_1, -1.0F, 1.0F);
			} else {
				matrix44arr_3.identity();
			}

			this.aClass384_8812.method6562(matrix44arr_3);
			this.method13933(this.aClass384_8812);
			this.aBool8720 = true;
		}

	}

	public abstract void method13933(Matrix44Arr var1);

	final void method13934() {
		if (this.aClass33_8719 != Class33.aClass33_380) {
			Class33 class33_1 = this.aClass33_8719;
			this.aClass33_8719 = Class33.aClass33_380;
			if (class33_1 == Class33.aClass33_381) {
				this.method13927();
			}

			this.aClass384_8708 = this.aClass384_8725;
			this.method14030();
			this.method13918();
			this.anInt8703 &= ~0xf;
		}

	}

	final void method13935() {
		if (this.aClass33_8719 != Class33.aClass33_379) {
			Class33 class33_1 = this.aClass33_8719;
			this.aClass33_8719 = Class33.aClass33_379;
			if (class33_1 == Class33.aClass33_381) {
				this.method13927();
			}

			this.method13932();
			this.aClass384_8708 = this.aClass384_8774;
			this.method14030();
			this.method13918();
			this.anInt8703 &= ~0x8;
		}

	}

	final void method13936() {
		this.aBool8720 = false;
		if (this.aClass33_8719 == Class33.aClass33_379) {
			this.method13932();
			this.method14030();
		}

	}

	final void method13937() {
		if (this.aClass33_8719 != Class33.aClass33_381) {
			this.aClass33_8719 = Class33.aClass33_381;
			this.method13927();
			this.method13940();
			this.aClass384_8708 = this.aClass384_8724;
			this.method14030();
			this.method13918();
			this.anInt8703 &= ~0x7;
		}

	}

	final void method13938() {
		this.aBool8723 = false;
		this.method13940();
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method14030();
		}

	}

	final void method13940() {
		if (!this.aBool8723) {
			this.aBool8723 = true;
		}

	}

	public final boolean method8644() {
		return true;
	}

	public final void RA(boolean bool_1) {
		this.aBool8755 = bool_1;
		this.method14054();
	}

	final void method13941(boolean bool_1) {
		if (this.aBool8757 != bool_1) {
			this.aBool8757 = bool_1;
			this.method13956();
			this.anInt8703 &= ~0xf;
		}

	}

	final void method13942(boolean bool_1) {
		if (this.aBool8756 != bool_1) {
			this.aBool8756 = bool_1;
			this.method14054();
			this.anInt8703 &= ~0xf;
		}

	}

	final void method13944() {
		this.anInterface4_8746 = this.method13994(false);
		short s_1 = 160;
		this.anInterface4_8746.method31(s_1, 32);
		this.aByteBuffer8838.clear();
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putInt(-1);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putInt(-1);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putInt(-1);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putInt(-1);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(1.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putInt(-1);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.anInterface4_8746.method42(0, this.aByteBuffer8838.position(), this.aLong8695);
		this.aClass70_8786 = this.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_690, Class69.aClass69_692, Class69.aClass69_692 }) });
	}

	public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * f_1 + this.aClass384_8728.buf[7] * f_2 + this.aClass384_8728.buf[11] * f_3;
		float f_6 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * f_1 + this.aClass384_8728.buf[4] * f_2 + this.aClass384_8728.buf[8] * f_3;
		float f_7 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * f_1 + this.aClass384_8728.buf[5] * f_2 + this.aClass384_8728.buf[9] * f_3;
		float f_8 = this.aClass384_8740.buf[14] + this.aClass384_8740.buf[2] * f_1 + this.aClass384_8740.buf[6] * f_2 + this.aClass384_8740.buf[10] * f_3;
		floats_4[0] = this.aFloat8797 + this.aFloat8732 * f_6 / f_5;
		floats_4[1] = this.aFloat8741 + this.aFloat8734 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * f_1 + this.aClass384_8728.buf[6] * f_2 + this.aClass384_8728.buf[10] * f_3;
		float f_6 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * f_1 + this.aClass384_8728.buf[7] * f_2 + this.aClass384_8728.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * f_1 + this.aClass384_8728.buf[4] * f_2 + this.aClass384_8728.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * f_1 + this.aClass384_8728.buf[5] * f_2 + this.aClass384_8728.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.aClass384_8740.buf[14] + this.aClass384_8740.buf[2] * f_1 + this.aClass384_8740.buf[6] * f_2 + this.aClass384_8740.buf[10] * f_3;
					floats_4[0] = this.aFloat8797 + this.aFloat8732 * f_7 / f_6;
					floats_4[1] = this.aFloat8741 + this.aFloat8734 * f_8 / f_6;
					floats_4[2] = f_9;
				} else {
					floats_4[2] = Float.NaN;
					floats_4[1] = Float.NaN;
					floats_4[0] = Float.NaN;
				}
			} else {
				floats_4[2] = Float.NaN;
				floats_4[1] = Float.NaN;
				floats_4[0] = Float.NaN;
			}
		} else {
			floats_4[2] = Float.NaN;
			floats_4[1] = Float.NaN;
			floats_4[0] = Float.NaN;
		}

	}

	abstract void method13945();

	public final void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
	}

	final void method13946(boolean bool_1) {
		if (this.aBool8684 != bool_1) {
			this.aBool8684 = bool_1;
			this.method14204();
			this.anInt8703 &= ~0x7;
		}

	}

	public final void method8547(int i_1, Class282_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aClass282_Sub24Array8716[i_3] = arr_2[i_3];
		}

		this.anInt8773 = i_1;
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method13903();
		}

	}

	public final void IA(float f_1) {
		if (this.aFloat8769 != f_1) {
			this.aFloat8769 = f_1;
			this.method13948();
			this.method13951();
		}

	}

	public final void m(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = this.anInt8765 != i_1;
		if (bool_7 || this.aFloat8770 != f_2 || this.aFloat8826 != f_3) {
			this.anInt8765 = i_1;
			this.aFloat8770 = f_2;
			this.aFloat8826 = f_3;
			if (bool_7) {
				this.aFloat8766 = (float) (this.anInt8765 & 0xff0000) / 1.671168E7F;
				this.aFloat8767 = (float) (this.anInt8765 & 0xff00) / 65280.0F;
				this.aFloat8768 = (float) (this.anInt8765 & 0xff) / 255.0F;
				this.method13948();
			}

			this.method13949();
		}

		if (this.aFloatArray8763[0] != f_4 || this.aFloatArray8763[1] != f_5 || this.aFloatArray8763[2] != f_6) {
			this.aFloatArray8763[0] = f_4;
			this.aFloatArray8763[1] = f_5;
			this.aFloatArray8763[2] = f_6;
			this.aFloatArray8764[0] = -f_4;
			this.aFloatArray8764[1] = -f_5;
			this.aFloatArray8764[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt((double) (f_4 * f_4 + f_5 * f_5 + f_6 * f_6)));
			this.aFloatArray8747[0] = f_4 * f_8;
			this.aFloatArray8747[1] = f_5 * f_8;
			this.aFloatArray8747[2] = f_6 * f_8;
			this.aFloatArray8762[0] = -this.aFloatArray8747[0];
			this.aFloatArray8762[1] = -this.aFloatArray8747[1];
			this.aFloatArray8762[2] = -this.aFloatArray8747[2];
			this.method13950();
			this.anInt8777 = (int) (f_4 * 256.0F / f_5);
			this.anInt8778 = (int) (f_6 * 256.0F / f_5);
		}

		this.method13951();
	}

	public final int method8452(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public final void method13947(int i_1) {
		switch (i_1) {
		case 0:
			this.method13966(Class68.aClass68_683, Class68.aClass68_683);
			break;
		case 1:
			this.method13966(Class68.aClass68_687, Class68.aClass68_687);
			break;
		case 2:
			this.method13966(Class68.aClass68_682, Class68.aClass68_687);
			break;
		case 3:
			this.method13966(Class68.aClass68_684, Class68.aClass68_683);
			break;
		case 4:
			this.method13966(Class68.aClass68_685, Class68.aClass68_685);
		}

	}

	abstract void method13948();

	abstract void method13949();

	abstract void method13950();

	abstract void method13951();

	public final int method8463() {
		return this.anInt8799 - 2;
	}

	abstract void method13952();

	abstract void method13953();

	abstract boolean method13954(Class150 var1, Class76 var2);

	abstract boolean method13955(Class150 var1, Class76 var2);

	abstract void method13956();

	final Interface6 method13957(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5) {
		return this.method14143(class150_1, i_2, i_3, bool_4, bytes_5);
	}

	final Interface6 method13958(Class150 class150_1, int i_2, int i_3, float[] floats_5) {
		return this.method13961(class150_1, i_2, i_3, floats_5);
	}

	public abstract void method13959(Class352 var1, int var2, int var3);

	final void method13960() {
		if (this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			this.aClass37Array8783[this.anInt8780] = Class37.aClass37_393;
			this.aClass384Array8782[this.anInt8780].identity();
			this.method14133();
		}

	}

	abstract Interface6 method13961(Class150 var1, int var2, int var3, float[] var5);

	public Matrix44Var method8458() {
		return this.aClass294_8706;
	}

	public final void il(int i_1) {
		for (this.anInt8806 = 0; i_1 > 1; i_1 >>= 1) {
			this.anInt8806 = (this.anInt8806 + 1);
		}

		this.anInt8775 = 1 << this.anInt8806;
	}

	abstract Interface1 method13962(Class150 var1, byte[] var6);

	public final void method8426(int i_1, Class282_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aClass282_Sub24Array8716[i_3] = arr_2[i_3];
		}

		this.anInt8773 = i_1;
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method13903();
		}

	}

	public final void method8568() {
	}

	public final int method13963() {
		return this.anInt8780;
	}

	public final void XA(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method8433(i_1, i_2, i_3 + i_1, i_2, i_4, i_5);
	}

	final void fr(int i_1, int i_2, int i_3, int i_4, int i_5) {
	}

	public abstract void method13964();

	public final Interface31 method13965() {
		return this.aClass152_Sub2_8731 != null ? this.aClass152_Sub2_8731.method14241() : null;
	}

	public final void method13966(Class68 class68_1, Class68 class68_2) {
		boolean bool_3 = false;
		if (class68_1 != this.aClass68Array8784[this.anInt8780]) {
			this.aClass68Array8784[this.anInt8780] = class68_1;
			this.method13979();
			bool_3 = true;
		}

		if (class68_2 != this.aClass68Array8785[this.anInt8780]) {
			this.aClass68Array8785[this.anInt8780] = class68_2;
			this.method13980();
			bool_3 = true;
		}

		if (bool_3) {
			this.anInt8703 &= ~0xd;
		}

	}

	public final void method13967(int i_1, Class67 class67_2) {
		this.method13968(i_1, class67_2);
	}

	abstract void method13968(int var1, Class67 var2);

	public final void method13969(int i_1, Class67 class67_2) {
		this.method13970(i_1, class67_2);
	}

	abstract void method13970(int var1, Class67 var2);

	public void method13971(int i_1) {
		if (this.anInt8758 != i_1) {
			this.anInt8758 = i_1;
			this.method13987();
		}

	}

	public final Matrix44Arr method13973() {
		return this.aClass384Array8782[this.anInt8780];
	}

	public final void method13974(Class37 class37_1) {
		this.aClass37Array8783[this.anInt8780] = class37_1;
		this.method14133();
	}

	abstract boolean method13975(Class150 var1, Class76 var2);

	public final void method8585(int i_1, Class90 class90_2) {
		this.anInt8739 = i_1;
		this.aClass90_8807 = class90_2;
		this.aBool8779 = true;
	}

	final void method13976() {
		this.method13948();
		this.method13949();
		this.method14204();
		this.method13903();
		this.method13950();
		this.method13951();
		this.method13952();
		this.method13956();
		this.method14054();
		this.method13991();
		this.method14013();
		this.method13914();
		this.method13894();
		this.method14238();

		for (int i_1 = this.anInt8825 - 1; i_1 >= 0; --i_1) {
			this.method14163(i_1);
			this.method13979();
			this.method13980();
			this.method13960();
		}

		this.method13987();
		this.method13920();
	}

	abstract void method13978();

	abstract void method13979();

	abstract void method13980();

	public final void method8475(Class90 class90_2) {
		this.anInt8739 = -1;
		this.aClass90_8807 = class90_2;
		this.aBool8779 = true;
	}

	abstract void method13982();

	public abstract void method13983(Class352 var1, int var2, int var3, int var4, int var5);

	final void method13985() {
		if (this.anInt8844 != 0) {
			this.anInt8844 = 0;
			this.method13894();
		}

	}

	abstract void method13986(int var1);

	public final void L() {
		if (this.aClass158_5853 != null) {
			this.anInt8822 = 0;
			this.anInt8743 = 0;
			this.anInt8744 = this.aClass158_5853.method2714();
			this.anInt8742 = this.aClass158_5853.method2716();
		} else {
			this.anInt8742 = 0;
			this.anInt8744 = 0;
			this.anInt8822 = 0;
			this.anInt8743 = 0;
		}

		if (this.aBool8843) {
			this.aBool8843 = false;
			this.method13922();
		}

	}

	abstract void method13987();

	final void method13989(boolean bool_1) {
		if (this.aBool8808 != bool_1) {
			this.aBool8808 = bool_1;
			this.method13991();
			this.anInt8703 &= ~0xf;
		}

	}

	public final void c(int i_1, int i_2, int i_3) {
		if (this.anInt8810 != i_1 || i_2 != this.anInt8811 || i_3 != this.anInt8680) {
			this.anInt8810 = i_1;
			this.anInt8811 = i_2;
			this.anInt8680 = i_3;
			this.method14062();
			this.method13991();
		}

	}

	public final void method8457(Matrix44Var matrix44var_1) {
		this.aClass294_8706 = matrix44var_1;
		this.aClass384_8740.fromVarMatrix44(this.aClass294_8706);
		this.aClass294_8804.method5209(matrix44var_1);
		this.aClass294_8804.method5207();
		this.aClass384_8814.fromVarMatrix44(this.aClass294_8804);
		this.method13926();
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method13927();
		}

	}

	abstract void method13991();

	abstract void method13992(boolean var1);

	abstract Interface32 method13993(boolean var1);

	abstract Interface4 method13994(boolean var1);

	abstract Class70 method13995(Class72[] var1);

	public abstract void method13996(Class70 var1);

	public final void DA(Class455 class455_2, int i_3, int i_4) {
		this.RA(false);
		this.aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) this.method8523((byte) 111).method2714(), 0.0F, 0.0F, (float) this.method8523((byte) 117).method2716(), 0, class455_2, i_3, i_4);
		this.RA(true);
	}

	abstract void method13997(Interface32 var1);

	final Matrix44Arr method13998() {
		return this.aClass33_8719 == Class33.aClass33_381 ? this.aClass384_8814 : aClass384_8712;
	}

	public final void method8595(boolean bool_1) {
	}

	public final void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8433(i_1, i_2, i_3 + i_1, i_2, i_5, i_6);
		this.method8433(i_1, i_2 + i_4, i_3 + i_1, i_2 + i_4, i_5, i_6);
		this.method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
		this.method8433(i_3 + i_1, i_2, i_3 + i_1, i_2 + i_4, i_5, i_6);
	}

	public final void N(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
	}

	public final void method8658() {
	}

	final void CA(int i_1, int i_2, int i_3, int i_4) {
	}

	public final void fo(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method8433(i_1, i_2, i_1, i_2 + i_3, i_4, i_5);
	}

	public final void ez() {
		if (this.aClass158_5853 != null) {
			this.anInt8822 = 0;
			this.anInt8743 = 0;
			this.anInt8744 = this.aClass158_5853.method2714();
			this.anInt8742 = this.aClass158_5853.method2716();
		} else {
			this.anInt8742 = 0;
			this.anInt8744 = 0;
			this.anInt8822 = 0;
			this.anInt8743 = 0;
		}

		if (this.aBool8843) {
			this.aBool8843 = false;
			this.method13922();
		}

	}

	public final void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8496(i_1, i_2, i_3, i_4, i_5, 1, i_6);
	}

	public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
		float f_10 = (float) i_3 - (float) i_1;
		float f_11 = (float) i_4 - (float) i_2;
		if (f_10 == 0.0F && f_11 == 0.0F) {
			f_10 = 1.0F;
		} else {
			float f_23 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_23;
			f_11 *= f_23;
		}

		this.method13935();
		Class41 class41_12 = this.aClass41Array8793[13];
		class41_12.method873();
		class41_12.method875(i_5);
		this.method13904(1);
		class41_12.method879();
		this.method13992(false);
		i_9 %= i_8 + i_7;
		float f_13 = f_10 * (float) i_7;
		float f_14 = f_11 * (float) i_7;
		float f_15 = 0.0F;
		float f_16 = 0.0F;
		float f_17 = f_13;
		float f_18 = f_14;
		if (i_9 > i_7) {
			f_15 = f_10 * (float) (i_8 + i_7 - i_9);
			f_16 = f_11 * (float) (i_8 + i_7 - i_9);
		} else {
			f_17 = f_10 * (float) (i_7 - i_9);
			f_18 = f_11 * (float) (i_7 - i_9);
		}

		float f_19 = (float) i_1 + f_15;
		float f_20 = (float) i_2 + f_16;
		float f_21 = f_10 * (float) i_8;
		float f_22 = f_11 * (float) i_8;

		while (true) {
			if (i_3 > i_1) {
				if (f_19 > (float) i_3) {
					break;
				}

				if (f_19 + f_17 > (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			} else {
				if (f_19 < (float) i_3) {
					break;
				}

				if (f_19 + f_17 < (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			}

			if (i_4 > i_2) {
				if (f_20 > (float) i_4) {
					break;
				}

				if (f_20 + f_18 > (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			} else {
				if (f_20 < (float) i_4) {
					break;
				}

				if (f_20 + f_18 < (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			}

			if (!this.method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
				return;
			}

			this.method14000();
			f_19 += f_21 + f_17;
			f_20 += f_22 + f_18;
			f_17 = f_13;
			f_18 = f_14;
		}

		this.method13992(true);
		class41_12.method885();
	}

	public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
	}

	abstract void method13999();

	public final void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		i_1 = (int) ((float) i_1 + 1.0F);
		i_2 = (int) ((float) i_2 + 1.0F);
		i_3 = (int) ((float) i_3 + 1.0F);
		i_4 = (int) ((float) i_4 + 1.0F);
		float f_8 = (float) (i_3 - i_1);
		float f_9 = (float) (i_4 - i_2);
		float f_10 = 1.0F / (float) Math.sqrt((double) (f_8 * f_8 + f_9 * f_9));
		f_8 *= f_10;
		f_9 *= f_10;
		i_1 = (int) ((float) i_1 - f_8);
		i_2 = (int) ((float) i_2 - f_9);
		float f_11 = -f_9;
		f_11 *= 0.5F * (float) i_6;
		float f_12 = f_8 * 0.5F * (float) i_6;
		this.aClass160_Sub3_8790.method2763((float) i_1 - f_11, (float) i_2 - f_12, (float) i_3 - f_11, (float) i_4 - f_12, (float) i_1 + f_11, (float) i_2 + f_12, 0, i_5, i_7);
	}

	public final void method8456(Class151 class151_1) {
		this.aClass54_8837.method1091(this, class151_1);
	}

	final void method14000() {
		this.method14161(0, this.anInterface4_8682);
		this.method13996(this.aClass70_8833);
		this.method13923(Class352.aClass352_4099, 0, 1);
	}

	public final void hi(int i_1, Class455 class455_2, int i_3, int i_4) {
		this.RA(false);
		this.aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) this.method8523((byte) 105).method2714(), 0.0F, 0.0F, (float) this.method8523((byte) 119).method2716(), 0, class455_2, i_3, i_4);
		this.RA(true);
	}

	final void method14001(Class352 class352_1) {
		this.method14161(0, this.anInterface4_8746);
		this.method13996(this.aClass70_8786);
		this.method13923(class352_1, 0, 2);
	}

	public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * f_1 + this.aClass384_8728.buf[6] * f_2 + this.aClass384_8728.buf[10] * f_3;
		float f_6 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * f_1 + this.aClass384_8728.buf[7] * f_2 + this.aClass384_8728.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * f_1 + this.aClass384_8728.buf[4] * f_2 + this.aClass384_8728.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * f_1 + this.aClass384_8728.buf[5] * f_2 + this.aClass384_8728.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.aClass384_8740.buf[14] + this.aClass384_8740.buf[2] * f_1 + this.aClass384_8740.buf[6] * f_2 + this.aClass384_8740.buf[10] * f_3;
					floats_4[0] = this.aFloat8797 + this.aFloat8732 * f_7 / f_6;
					floats_4[1] = this.aFloat8741 + this.aFloat8734 * f_8 / f_6;
					floats_4[2] = f_9;
				} else {
					floats_4[2] = Float.NaN;
					floats_4[1] = Float.NaN;
					floats_4[0] = Float.NaN;
				}
			} else {
				floats_4[2] = Float.NaN;
				floats_4[1] = Float.NaN;
				floats_4[0] = Float.NaN;
			}
		} else {
			floats_4[2] = Float.NaN;
			floats_4[1] = Float.NaN;
			floats_4[0] = Float.NaN;
		}

	}

	public abstract void method14002(Class352 var1, int var2, int var3, int var4, int var5);

	public final void method14003() {
		if (this.anInt8703 != 2) {
			this.method13935();
			this.method13989(false);
			this.method13946(false);
			this.method13941(false);
			this.method13942(false);
			this.anInt8703 = 2;
		}

	}

	final void method14004() {
		if (this.anInt8703 != 8) {
			this.method13937();
			this.method13989(true);
			this.method13941(true);
			this.method13942(true);
			this.method13904(1);
			this.anInt8703 = 8;
		}

	}

	void method8531() {
		if (!this.aBool8681) {
			this.method13900();
			this.aClass66_8787.method1279();

			for (Node node_1 = this.aClass473_8700.getBack(); node_1 != null; node_1 = this.aClass473_8700.getPrevious()) {
				((Class282_Sub1_Sub2) node_1).method15609();
			}

			Class13.method508(false, true, -1983988311);

			int i_2;
			for (i_2 = 0; i_2 < this.aClass41Array8793.length; i_2++) {
				if (this.aClass41Array8793[i_2] != null) {
					this.aClass41Array8793[i_2].method878();
					this.aClass41Array8793[i_2] = null;
				}
			}

			for (i_2 = 0; i_2 < this.aClass55Array8802.length; i_2++) {
				if (this.aClass55Array8802[i_2] != null) {
					this.aClass55Array8802[i_2].method1105();
					this.aClass55Array8802[i_2] = null;
				}
			}

			this.method13886();
			this.method8398(0);
			this.aBool8681 = true;
		}

	}

	void method8486() {
		if (!this.aBool8681) {
			this.method13900();
			this.aClass66_8787.method1279();

			for (Node node_1 = this.aClass473_8700.getBack(); node_1 != null; node_1 = this.aClass473_8700.getPrevious()) {
				((Class282_Sub1_Sub2) node_1).method15609();
			}

			Class13.method508(false, true, 116257248);

			int i_2;
			for (i_2 = 0; i_2 < this.aClass41Array8793.length; i_2++) {
				if (this.aClass41Array8793[i_2] != null) {
					this.aClass41Array8793[i_2].method878();
					this.aClass41Array8793[i_2] = null;
				}
			}

			for (i_2 = 0; i_2 < this.aClass55Array8802.length; i_2++) {
				if (this.aClass55Array8802[i_2] != null) {
					this.aClass55Array8802[i_2].method1105();
					this.aClass55Array8802[i_2] = null;
				}
			}

			this.method13886();
			this.method8398(0);
			this.aBool8681 = true;
		}

	}

	public void method8487(int i_1) {
		if (this.aClass66_8787 != null) {
			this.aClass66_8787.method1278();
		}

		this.anInt8820 = i_1 & 0x7fffffff;
	}

	public final Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
	}

	public final int dd() {
		return this.anInt8702 + this.anInt8701 + this.anInt8761;
	}

	public final void method8424(Matrix44Arr matrix44arr_1) {
		this.aClass384_8724.method6562(matrix44arr_1);
		this.method13926();
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method14030();
		}

	}

	public final Matrix44Arr method8571() {
		return this.aClass384_8841;
	}

	public final int dv() {
		return this.anInt8702 + this.anInt8701 + this.anInt8761;
	}

	public final boolean method8489() {
		return true;
	}

	public final boolean method8528() {
		return true;
	}

	public final void method8581(Class151 class151_1) {
		this.aClass54_8837.method1091(this, class151_1);
	}

	public final boolean method8599() {
		return this.aClass55Array8802[1] != null;
	}

	public final boolean method8464() {
		return this.aClass55Array8802[1] != null;
	}

	public final boolean method8649() {
		return this.aClass55Array8802[1] != null;
	}

	abstract Interface6 method14008(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

	public final boolean method8431() {
		return true;
	}

	final void method14009() {
		this.anInterface4_8682 = this.method13994(true);
		this.anInterface4_8682.method31(24, 12);
		this.aClass70_8833 = this.method13995(new Class72[] { new Class72(Class69.aClass69_695) });
	}

	public final boolean method8498() {
		return true;
	}

	abstract Interface31 method14011(int var1, boolean var2, int[][] var3);

	abstract void method14013();

	public final boolean method8503() {
		return true;
	}

	public final void fh(int[] ints_1) {
		ints_1[0] = this.anInt8743;
		ints_1[1] = this.anInt8822;
		ints_1[2] = this.anInt8744;
		ints_1[3] = this.anInt8742;
	}

	public final void eq(boolean bool_1) {
		this.aBool8755 = bool_1;
		this.method14054();
	}

	public void method8513(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8745 = i_1;
		this.anInt8835 = i_2;
		this.anInt8722 = i_3;
		this.anInt8748 = i_4;
		this.method13918();
	}

	abstract void method14015();

	public final void ft(int[] ints_1) {
		ints_1[0] = this.anInt8743;
		ints_1[1] = this.anInt8822;
		ints_1[2] = this.anInt8744;
		ints_1[3] = this.anInt8742;
	}

	public void ej(float f_1, float f_2) {
		this.aFloat8737 = f_1;
		this.aFloat8738 = f_2;
		this.method13918();
	}

	public final void eh() {
		if (this.aClass158_5853 != null) {
			this.anInt8822 = 0;
			this.anInt8743 = 0;
			this.anInt8744 = this.aClass158_5853.method2714();
			this.anInt8742 = this.aClass158_5853.method2716();
		} else {
			this.anInt8742 = 0;
			this.anInt8744 = 0;
			this.anInt8822 = 0;
			this.anInt8743 = 0;
		}

		if (this.aBool8843) {
			this.aBool8843 = false;
			this.method13922();
		}

	}

	abstract Class70 method14017(Class72[] var1);

	public final boolean method8404() {
		return true;
	}

	public final void fe(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (this.aClass158_5853 != null) {
			i_6 = this.aClass158_5853.method2714();
			i_5 = this.aClass158_5853.method2716();
		} else {
			i_5 = 0;
			i_6 = 0;
		}

		i_1 = i_1 >= 0 ? i_1 : 0;
		i_3 = i_3 <= i_6 ? i_3 : i_6;
		i_2 = i_2 >= 0 ? i_2 : 0;
		i_4 = i_4 <= i_5 ? i_4 : i_5;
		boolean bool_7 = false;
		if (this.anInt8743 < i_1) {
			this.anInt8743 = i_1;
			bool_7 = true;
		}

		if (this.anInt8744 > i_3) {
			this.anInt8744 = i_3;
			bool_7 = true;
		}

		if (this.anInt8822 < i_2) {
			this.anInt8822 = i_2;
			bool_7 = true;
		}

		if (this.anInt8742 > i_4) {
			this.anInt8742 = i_4;
			bool_7 = true;
		}

		if (bool_7) {
			if (!this.aBool8843) {
				this.aBool8843 = true;
				this.method13922();
			}

			this.method13921();
		}

	}

	public final void fk(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (this.aClass158_5853 != null) {
			i_6 = this.aClass158_5853.method2714();
			i_5 = this.aClass158_5853.method2716();
		} else {
			i_5 = 0;
			i_6 = 0;
		}

		i_1 = i_1 >= 0 ? i_1 : 0;
		i_3 = i_3 <= i_6 ? i_3 : i_6;
		i_2 = i_2 >= 0 ? i_2 : 0;
		i_4 = i_4 <= i_5 ? i_4 : i_5;
		boolean bool_7 = false;
		if (this.anInt8743 < i_1) {
			this.anInt8743 = i_1;
			bool_7 = true;
		}

		if (this.anInt8744 > i_3) {
			this.anInt8744 = i_3;
			bool_7 = true;
		}

		if (this.anInt8822 < i_2) {
			this.anInt8822 = i_2;
			bool_7 = true;
		}

		if (this.anInt8742 > i_4) {
			this.anInt8742 = i_4;
			bool_7 = true;
		}

		if (bool_7) {
			if (!this.aBool8843) {
				this.aBool8843 = true;
				this.method13922();
			}

			this.method13921();
		}

	}

	abstract void method14019();

	public final Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return new Class152_Sub2_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public final void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8433(i_1, i_2, i_1 + i_3, i_2, i_5, i_6);
		this.method8433(i_1, i_2 + i_4, i_1 + i_3, i_2 + i_4, i_5, i_6);
		this.method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
		this.method8433(i_1 + i_3, i_2, i_1 + i_3, i_2 + i_4, i_5, i_6);
	}

	public final void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8433(i_1, i_2, i_1 + i_3, i_2, i_5, i_6);
		this.method8433(i_1, i_2 + i_4, i_1 + i_3, i_2 + i_4, i_5, i_6);
		this.method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
		this.method8433(i_1 + i_3, i_2, i_1 + i_3, i_2 + i_4, i_5, i_6);
	}

	public final void fp(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aBool8755) {
			this.RA(false);
			this.aClass160_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
			this.RA(true);
		} else {
			this.aClass160_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
		}

	}

	public final void fb(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aBool8755) {
			this.RA(false);
			this.aClass160_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
			this.RA(true);
		} else {
			this.aClass160_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
		}

	}

	public final void fv(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
	}

	public final void ff(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
	}

	public final void method8611() {
		this.aClass32_8714.method833();
	}

	final void fw(int i_1, int i_2, int i_3, int i_4, int i_5) {
	}

	abstract void method14020();

	abstract Interface29 method14022(Class150 var1, Class76 var2, int var3, int var4);

	public final void fl(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method8433(i_1, i_2, i_1, i_2 + i_3, i_4, i_5);
	}

	public final void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8496(i_1, i_2, i_3, i_4, i_5, 1, i_6);
	}

	public final void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8496(i_1, i_2, i_3, i_4, i_5, 1, i_6);
	}

	public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		float f_10 = (float) i_3 - (float) i_1;
		float f_11 = (float) i_4 - (float) i_2;
		if (f_10 == 0.0F && f_11 == 0.0F) {
			f_10 = 1.0F;
		} else {
			float f_23 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_23;
			f_11 *= f_23;
		}

		this.method13935();
		Class41 class41_12 = this.aClass41Array8793[13];
		class41_12.method873();
		class41_12.method875(i_5);
		this.method13904(i_6);
		class41_12.method879();
		this.method13992(false);
		i_9 %= i_8 + i_7;
		float f_13 = f_10 * (float) i_7;
		float f_14 = f_11 * (float) i_7;
		float f_15 = 0.0F;
		float f_16 = 0.0F;
		float f_17 = f_13;
		float f_18 = f_14;
		if (i_9 > i_7) {
			f_15 = f_10 * (float) (i_7 + i_8 - i_9);
			f_16 = f_11 * (float) (i_7 + i_8 - i_9);
		} else {
			f_17 = f_10 * (float) (i_7 - i_9);
			f_18 = f_11 * (float) (i_7 - i_9);
		}

		float f_19 = (float) i_1 + f_15;
		float f_20 = (float) i_2 + f_16;
		float f_21 = f_10 * (float) i_8;
		float f_22 = f_11 * (float) i_8;

		while (true) {
			if (i_3 > i_1) {
				if (f_19 > (float) i_3) {
					break;
				}

				if (f_19 + f_17 > (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			} else {
				if (f_19 < (float) i_3) {
					break;
				}

				if (f_19 + f_17 < (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			}

			if (i_4 > i_2) {
				if (f_20 > (float) i_4) {
					break;
				}

				if (f_20 + f_18 > (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			} else {
				if (f_20 < (float) i_4) {
					break;
				}

				if (f_20 + f_18 < (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			}

			if (!this.method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
				return;
			}

			this.method14000();
			f_19 += f_21 + f_17;
			f_20 += f_22 + f_18;
			f_17 = f_13;
			f_18 = f_14;
		}

		this.method13992(true);
		class41_12.method885();
	}

	public final NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new Class160_Sub3(this, i_4, i_5, ints_1, i_2, i_3);
	}

	public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		float f_10 = (float) i_3 - (float) i_1;
		float f_11 = (float) i_4 - (float) i_2;
		if (f_10 == 0.0F && f_11 == 0.0F) {
			f_10 = 1.0F;
		} else {
			float f_23 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_23;
			f_11 *= f_23;
		}

		this.method13935();
		Class41 class41_12 = this.aClass41Array8793[13];
		class41_12.method873();
		class41_12.method875(i_5);
		this.method13904(i_6);
		class41_12.method879();
		this.method13992(false);
		i_9 %= i_8 + i_7;
		float f_13 = f_10 * (float) i_7;
		float f_14 = f_11 * (float) i_7;
		float f_15 = 0.0F;
		float f_16 = 0.0F;
		float f_17 = f_13;
		float f_18 = f_14;
		if (i_9 > i_7) {
			f_15 = f_10 * (float) (i_7 + i_8 - i_9);
			f_16 = f_11 * (float) (i_7 + i_8 - i_9);
		} else {
			f_17 = f_10 * (float) (i_7 - i_9);
			f_18 = f_11 * (float) (i_7 - i_9);
		}

		float f_19 = (float) i_1 + f_15;
		float f_20 = (float) i_2 + f_16;
		float f_21 = f_10 * (float) i_8;
		float f_22 = f_11 * (float) i_8;

		while (true) {
			if (i_3 > i_1) {
				if (f_19 > (float) i_3) {
					break;
				}

				if (f_19 + f_17 > (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			} else {
				if (f_19 < (float) i_3) {
					break;
				}

				if (f_19 + f_17 < (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			}

			if (i_4 > i_2) {
				if (f_20 > (float) i_4) {
					break;
				}

				if (f_20 + f_18 > (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			} else {
				if (f_20 < (float) i_4) {
					break;
				}

				if (f_20 + f_18 < (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			}

			if (!this.method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
				return;
			}

			this.method14000();
			f_19 += f_21 + f_17;
			f_20 += f_22 + f_18;
			f_17 = f_13;
			f_18 = f_14;
		}

		this.method13992(true);
		class41_12.method885();
	}

	public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		float f_10 = (float) i_3 - (float) i_1;
		float f_11 = (float) i_4 - (float) i_2;
		if (f_10 == 0.0F && f_11 == 0.0F) {
			f_10 = 1.0F;
		} else {
			float f_23 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_23;
			f_11 *= f_23;
		}

		this.method13935();
		Class41 class41_12 = this.aClass41Array8793[13];
		class41_12.method873();
		class41_12.method875(i_5);
		this.method13904(i_6);
		class41_12.method879();
		this.method13992(false);
		i_9 %= i_8 + i_7;
		float f_13 = f_10 * (float) i_7;
		float f_14 = f_11 * (float) i_7;
		float f_15 = 0.0F;
		float f_16 = 0.0F;
		float f_17 = f_13;
		float f_18 = f_14;
		if (i_9 > i_7) {
			f_15 = f_10 * (float) (i_7 + i_8 - i_9);
			f_16 = f_11 * (float) (i_7 + i_8 - i_9);
		} else {
			f_17 = f_10 * (float) (i_7 - i_9);
			f_18 = f_11 * (float) (i_7 - i_9);
		}

		float f_19 = (float) i_1 + f_15;
		float f_20 = (float) i_2 + f_16;
		float f_21 = f_10 * (float) i_8;
		float f_22 = f_11 * (float) i_8;

		while (true) {
			if (i_3 > i_1) {
				if (f_19 > (float) i_3) {
					break;
				}

				if (f_19 + f_17 > (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			} else {
				if (f_19 < (float) i_3) {
					break;
				}

				if (f_19 + f_17 < (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			}

			if (i_4 > i_2) {
				if (f_20 > (float) i_4) {
					break;
				}

				if (f_20 + f_18 > (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			} else {
				if (f_20 < (float) i_4) {
					break;
				}

				if (f_20 + f_18 < (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			}

			if (!this.method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
				return;
			}

			this.method14000();
			f_19 += f_21 + f_17;
			f_20 += f_22 + f_18;
			f_17 = f_13;
			f_18 = f_14;
		}

		this.method13992(true);
		class41_12.method885();
	}

	public final void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
	}

	public final void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
	}

	public final void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
	}

	public final void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
	}

	public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
	}

	final Interface6 method14024(int i_1, int i_2, boolean bool_3, int[] ints_4) {
		return this.method14094(i_1, i_2, bool_3, ints_4, 0, 0);
	}

	public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_1 + this.aClass384_8728.buf[6] * (float) i_2 + this.aClass384_8728.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_4 + this.aClass384_8728.buf[6] * (float) i_5 + this.aClass384_8728.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_1 + this.aClass384_8728.buf[7] * (float) i_2 + this.aClass384_8728.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_4 + this.aClass384_8728.buf[7] * (float) i_5 + this.aClass384_8728.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_1 + this.aClass384_8728.buf[4] * (float) i_2 + this.aClass384_8728.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_4 + this.aClass384_8728.buf[4] * (float) i_5 + this.aClass384_8728.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_1 + this.aClass384_8728.buf[5] * (float) i_2 + this.aClass384_8728.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_4 + this.aClass384_8728.buf[5] * (float) i_5 + this.aClass384_8728.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_1 + this.aClass384_8728.buf[6] * (float) i_2 + this.aClass384_8728.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_4 + this.aClass384_8728.buf[6] * (float) i_5 + this.aClass384_8728.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_1 + this.aClass384_8728.buf[7] * (float) i_2 + this.aClass384_8728.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_4 + this.aClass384_8728.buf[7] * (float) i_5 + this.aClass384_8728.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_1 + this.aClass384_8728.buf[4] * (float) i_2 + this.aClass384_8728.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_4 + this.aClass384_8728.buf[4] * (float) i_5 + this.aClass384_8728.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_1 + this.aClass384_8728.buf[5] * (float) i_2 + this.aClass384_8728.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_4 + this.aClass384_8728.buf[5] * (float) i_5 + this.aClass384_8728.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_1 + this.aClass384_8728.buf[6] * (float) i_2 + this.aClass384_8728.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_4 + this.aClass384_8728.buf[6] * (float) i_5 + this.aClass384_8728.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_1 + this.aClass384_8728.buf[7] * (float) i_2 + this.aClass384_8728.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_4 + this.aClass384_8728.buf[7] * (float) i_5 + this.aClass384_8728.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_1 + this.aClass384_8728.buf[4] * (float) i_2 + this.aClass384_8728.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_4 + this.aClass384_8728.buf[4] * (float) i_5 + this.aClass384_8728.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_1 + this.aClass384_8728.buf[5] * (float) i_2 + this.aClass384_8728.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_4 + this.aClass384_8728.buf[5] * (float) i_5 + this.aClass384_8728.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public final Class282_Sub1 method8570(int i_1) {
		Class282_Sub1_Sub2 class282_sub1_sub2_2 = new Class282_Sub1_Sub2(i_1);
		this.aClass473_8700.insertBack(class282_sub1_sub2_2);
		return class282_sub1_sub2_2;
	}

	public final Class282_Sub1 method8541(int i_1) {
		Class282_Sub1_Sub2 class282_sub1_sub2_2 = new Class282_Sub1_Sub2(i_1);
		this.aClass473_8700.insertBack(class282_sub1_sub2_2);
		return class282_sub1_sub2_2;
	}

	abstract void method14025();

	public final void method8618(Class282_Sub1 class282_sub1_1) {
		this.aNativeHeap8699 = ((Class282_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
	}

	public final void method8544(Class282_Sub1 class282_sub1_1) {
		this.aNativeHeap8699 = ((Class282_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
	}

	public final boolean method8578() {
		return this.aBool8828;
	}

	public final void fc(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (this.aClass158_5853 != null) {
			i_6 = this.aClass158_5853.method2714();
			i_5 = this.aClass158_5853.method2716();
		} else {
			i_5 = 0;
			i_6 = 0;
		}

		if (i_1 <= 0 && i_3 >= i_6 - 1 && i_2 <= 0 && i_4 >= i_5 - 1) {
			this.L();
		} else {
			this.anInt8743 = i_1 >= 0 ? i_1 : 0;
			this.anInt8744 = i_3 <= i_6 ? i_3 : i_6;
			this.anInt8822 = i_2 >= 0 ? i_2 : 0;
			this.anInt8742 = i_4 <= i_5 ? i_4 : i_5;
			if (!this.aBool8843) {
				this.aBool8843 = true;
				this.method13922();
			}

			this.method13921();
		}

	}

	public final NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new Class160_Sub3(this, i_4, i_5, ints_1, i_2, i_3);
	}

	abstract void method14026();

	public final NativeSprite method8612(Class91 class91_1, boolean bool_2) {
		NativeSprite nativesprite_3;
		if (class91_1.anInt957 != 0 && class91_1.anInt954 != 0) {
			int[] ints_4 = new int[class91_1.anInt957 * class91_1.anInt954];
			int i_5 = 0;
			int i_6 = 0;
			int i_7;
			int i_8;
			if (class91_1.aByteArray961 != null) {
				for (i_7 = 0; i_7 < class91_1.anInt954; i_7++) {
					for (i_8 = 0; i_8 < class91_1.anInt957; i_8++) {
						ints_4[i_6++] = class91_1.aByteArray961[i_5] << 24 | class91_1.anIntArray955[class91_1.aByteArray960[i_5] & 0xff];
						++i_5;
					}
				}
			} else {
				for (i_7 = 0; i_7 < class91_1.anInt954; i_7++) {
					for (i_8 = 0; i_8 < class91_1.anInt957; i_8++) {
						int i_9 = class91_1.anIntArray955[class91_1.aByteArray960[i_5++] & 0xff];
						ints_4[i_6++] = i_9 != 0 ? ~0xffffff | i_9 : 0;
					}
				}
			}

			nativesprite_3 = this.createNativeSprite(ints_4, class91_1.anInt957, class91_1.anInt957, class91_1.anInt954, 243468915);
		} else {
			nativesprite_3 = this.createNativeSprite(new int[1], 1, 1, 1, -1837569571);
		}

		nativesprite_3.method2743(class91_1.anInt956, class91_1.anInt959, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_3;
	}

	public final NativeSprite method8518(Class91 class91_1, boolean bool_2) {
		NativeSprite nativesprite_3;
		if (class91_1.anInt957 != 0 && class91_1.anInt954 != 0) {
			int[] ints_4 = new int[class91_1.anInt957 * class91_1.anInt954];
			int i_5 = 0;
			int i_6 = 0;
			int i_7;
			int i_8;
			if (class91_1.aByteArray961 != null) {
				for (i_7 = 0; i_7 < class91_1.anInt954; i_7++) {
					for (i_8 = 0; i_8 < class91_1.anInt957; i_8++) {
						ints_4[i_6++] = class91_1.aByteArray961[i_5] << 24 | class91_1.anIntArray955[class91_1.aByteArray960[i_5] & 0xff];
						++i_5;
					}
				}
			} else {
				for (i_7 = 0; i_7 < class91_1.anInt954; i_7++) {
					for (i_8 = 0; i_8 < class91_1.anInt957; i_8++) {
						int i_9 = class91_1.anIntArray955[class91_1.aByteArray960[i_5++] & 0xff];
						ints_4[i_6++] = i_9 != 0 ? ~0xffffff | i_9 : 0;
					}
				}
			}

			nativesprite_3 = this.createNativeSprite(ints_4, class91_1.anInt957, class91_1.anInt957, class91_1.anInt954, 216802714);
		} else {
			nativesprite_3 = this.createNativeSprite(new int[1], 1, 1, 1, 1578248610);
		}

		nativesprite_3.method2743(class91_1.anInt956, class91_1.anInt959, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_3;
	}

	public final NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class160_Sub3 class160_sub3_6 = new Class160_Sub3(this, i_3, i_4, bool_5, false);
		class160_sub3_6.method2750(0, 0, i_3, i_4, i_1, i_2);
		return class160_sub3_6;
	}

	public final NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class160_Sub3 class160_sub3_6 = new Class160_Sub3(this, i_3, i_4, bool_5, false);
		class160_sub3_6.method2750(0, 0, i_3, i_4, i_1, i_2);
		return class160_sub3_6;
	}

	public final void iz(float f_1) {
		if (this.aFloat8769 != f_1) {
			this.aFloat8769 = f_1;
			this.method13948();
			this.method13951();
		}

	}

	public final Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
	}

	public final Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
	}

	public final Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
	}

	public final void hr(int i_1, Class455 class455_2, int i_3, int i_4) {
		this.RA(false);
		this.aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) this.method8523((byte) 124).method2714(), 0.0F, 0.0F, (float) this.method8523((byte) 110).method2716(), 0, class455_2, i_3, i_4);
		this.RA(true);
	}

	public final void hz(int i_1, Class455 class455_2, int i_3, int i_4) {
		this.RA(false);
		this.aClass160_Sub3_8791.method2766(0.0F, 0.0F, (float) this.method8523((byte) 126).method2714(), 0.0F, 0.0F, (float) this.method8523((byte) 110).method2716(), 0, class455_2, i_3, i_4);
		this.RA(true);
	}

	public final Matrix44Arr method8588() {
		return this.aClass384_8724;
	}

	public final Matrix44Var method8626() {
		return this.aClass294_8842;
	}

	public final void method8559(int i_1) {
	}

	public final MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new Class528_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public final boolean method8614() {
		return true;
	}

	public void GA() {
		this.aFloat8737 = (float) 0.0;
		this.aFloat8738 = (float) 1.0;
		this.method13918();
	}

	public final MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new Class528_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public final MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new Class528_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public final int method8565(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public final int method8566(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public final int method8567(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public final Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
		return new HardwareGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, i_5);
	}

	public final Matrix44Arr method8517() {
		return this.aClass384_8841;
	}

	public final void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
	}

	public final Matrix44Var method8572() {
		return this.aClass294_8842;
	}

	public final void J() {
		int meme = 32;
		for (this.anInt8806 = 0; meme > 1; meme >>= 1) {
			++this.anInt8806;
		}

		this.anInt8775 = 1 << this.anInt8806;
	}

	public final int method8574() {
		return this.anInt8799 - 2;
	}

	public final void method8394(int i_1, Class282_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aClass282_Sub24Array8716[i_3] = arr_2[i_3];
		}

		this.anInt8773 = i_1;
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method13903();
		}

	}

	public final NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new Class160_Sub3(this, i_1, i_2, bool_3, bool_4);
	}

	public final void method8579(int i_1, Class282_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aClass282_Sub24Array8716[i_3] = arr_2[i_3];
		}

		this.anInt8773 = i_1;
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method13903();
		}

	}

	public final void method8580(Class151 class151_1) {
		this.aClass54_8837.method1091(this, class151_1);
	}

	public Matrix44Var method8685() {
		return this.aClass294_8706;
	}

	public final void method8423(Matrix44Var matrix44var_1) {
		this.aClass294_8706 = matrix44var_1;
		this.aClass384_8740.fromVarMatrix44(this.aClass294_8706);
		this.aClass294_8804.method5209(matrix44var_1);
		this.aClass294_8804.method5207();
		this.aClass384_8814.fromVarMatrix44(this.aClass294_8804);
		this.method13926();
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method13927();
		}

	}

	public Matrix44Var method8583() {
		return this.aClass294_8706;
	}

	public final boolean method8462() {
		return this.aBool8828;
	}

	public final void method8446(Matrix44Arr matrix44arr_1) {
		this.aClass384_8724.method6562(matrix44arr_1);
		this.method13926();
		if (this.aClass33_8719 == Class33.aClass33_381) {
			this.method14030();
		}

	}

	public final boolean method8502() {
		return true;
	}

	public final Matrix44Arr method8449() {
		return this.aClass384_8841;
	}

	final void method14030() {
		this.aClass384_8727.method6562(this.aClass384_8708);
		this.method13933(this.aClass384_8727);
		this.aFloat8697 = (this.aClass384_8727.buf[14] - this.aClass384_8727.buf[15]) / (this.aClass384_8727.buf[11] - this.aClass384_8727.buf[10]);
		this.aFloat8726 = -this.aClass384_8727.buf[14] / this.aClass384_8727.buf[10];
		this.method14062();
	}

	public final Matrix44Arr method8590() {
		return this.aClass384_8724;
	}

	public final boolean method8504() {
		return true;
	}

	public final void in(float f_1) {
		if (this.aFloat8769 != f_1) {
			this.aFloat8769 = f_1;
			this.method13948();
			this.method13951();
		}

	}

	public final Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return new Class152_Sub2_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public final void im(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = this.anInt8765 != i_1;
		if (bool_7 || this.aFloat8770 != f_2 || this.aFloat8826 != f_3) {
			this.anInt8765 = i_1;
			this.aFloat8770 = f_2;
			this.aFloat8826 = f_3;
			if (bool_7) {
				this.aFloat8766 = (float) (this.anInt8765 & 0xff0000) / 1.671168E7F;
				this.aFloat8767 = (float) (this.anInt8765 & 0xff00) / 65280.0F;
				this.aFloat8768 = (float) (this.anInt8765 & 0xff) / 255.0F;
				this.method13948();
			}

			this.method13949();
		}

		if (this.aFloatArray8763[0] != f_4 || this.aFloatArray8763[1] != f_5 || this.aFloatArray8763[2] != f_6) {
			this.aFloatArray8763[0] = f_4;
			this.aFloatArray8763[1] = f_5;
			this.aFloatArray8763[2] = f_6;
			this.aFloatArray8764[0] = -f_4;
			this.aFloatArray8764[1] = -f_5;
			this.aFloatArray8764[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt((double) (f_4 * f_4 + f_5 * f_5 + f_6 * f_6)));
			this.aFloatArray8747[0] = f_4 * f_8;
			this.aFloatArray8747[1] = f_5 * f_8;
			this.aFloatArray8747[2] = f_6 * f_8;
			this.aFloatArray8762[0] = -this.aFloatArray8747[0];
			this.aFloatArray8762[1] = -this.aFloatArray8747[1];
			this.aFloatArray8762[2] = -this.aFloatArray8747[2];
			this.method13950();
			this.anInt8777 = (int) (f_4 * 256.0F / f_5);
			this.anInt8778 = (int) (f_6 * 256.0F / f_5);
		}

		this.method13951();
	}

	public final void iq(int i_1) {
		for (this.anInt8806 = 0; i_1 > 1; i_1 >>= 1) {
			this.anInt8806 = (this.anInt8806 + 1);
		}

		this.anInt8775 = 1 << this.anInt8806;
	}

	public final void ii(int i_1) {
		for (this.anInt8806 = 0; i_1 > 1; i_1 >>= 1) {
			this.anInt8806 = (this.anInt8806 + 1);
		}

		this.anInt8775 = 1 << this.anInt8806;
	}

	public final FontRenderer createFont(FontMetrics fontmetrics_1, Class91[] arr_2, boolean bool_3) {
		return new Class8_Sub4(this, fontmetrics_1, arr_2, bool_3);
	}

	public final void ik(int i_1, int i_2, int i_3) {
		if (this.anInt8810 != i_1 || this.anInt8811 != i_2 || this.anInt8680 != i_3) {
			this.anInt8810 = i_1;
			this.anInt8811 = i_2;
			this.anInt8680 = i_3;
			this.method14062();
			this.method13991();
		}

	}

	public final MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new Class528_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public final void method8594(boolean bool_1) {
	}

	public final boolean method8501() {
		return this.aBool8828;
	}

	public final void method8584(Class152 class152_1) {
		this.aClass152_Sub2_8731 = (Class152_Sub2) class152_1;
	}

	public final void method8598(Class152 class152_1) {
		this.aClass152_Sub2_8731 = (Class152_Sub2) class152_1;
	}

	public final boolean method8628() {
		if (this.aClass55Array8802[1] != null && !this.aClass55Array8802[1].method1107()) {
			boolean bool_1 = this.aClass32_8714.method816(this.aClass55Array8802[1]);
			if (bool_1) {
				this.aClass66_8787.method1279();
			}

			return bool_1;
		} else {
			return false;
		}
	}

	public final boolean method8600() {
		if (this.aClass55Array8802[1] != null && !this.aClass55Array8802[1].method1107()) {
			boolean bool_1 = this.aClass32_8714.method816(this.aClass55Array8802[1]);
			if (bool_1) {
				this.aClass66_8787.method1279();
			}

			return bool_1;
		} else {
			return false;
		}
	}

	public final void method8601() {
		if (this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107()) {
			this.aClass32_8714.method822(this.aClass55Array8802[1]);
			this.aClass66_8787.method1279();
		}

	}

	public final void method8602() {
		if (this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107()) {
			this.aClass32_8714.method822(this.aClass55Array8802[1]);
			this.aClass66_8787.method1279();
		}

	}

	public final void method8521() {
		if (this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107()) {
			this.aClass32_8714.method822(this.aClass55Array8802[1]);
			this.aClass66_8787.method1279();
		}

	}

	public final boolean method8679() {
		return this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107();
	}

	public final boolean method8605() {
		return this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107();
	}

	public final boolean method8606() {
		return this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107();
	}

	public final boolean method8607() {
		return this.aClass55Array8802[1] != null && this.aClass55Array8802[1].method1107();
	}

	final void method8608(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		Class55_Sub1.aFloat9188 = f_1;
		Class55_Sub1.aFloat9184 = f_2;
		Class55_Sub1.aFloat9189 = f_3;
		Class55_Sub1.aFloat9186 = f_6;
	}

	public final void method8673(int i_1, int i_2, int i_3, int i_4) {
		this.aClass32_8714.method830(i_1, i_2, i_3, i_4);
	}

	public final void method8603(int i_1, int i_2, int i_3, int i_4) {
		this.aClass32_8714.method830(i_1, i_2, i_3, i_4);
	}

	public final void method8691() {
		this.aClass32_8714.method833();
	}

	public final void method8613() {
		this.aClass32_8714.method833();
	}

	public final int df() {
		return this.anInt8702 + this.anInt8701 + this.anInt8761;
	}

	public final void method8615(int i_1, Class90 class90_2) {
		if (!this.aBool8779) {
			throw new RuntimeException("");
		} else {
			this.anInt8739 = i_1;
			this.aClass90_8807 = class90_2;
			if (this.aBool8805) {
				this.aClass41Array8793[3].method876();
				this.aClass41Array8793[3].method877();
			}

		}
	}

	public final void method8616(int i_1, Class90 class90_2) {
		if (!this.aBool8779) {
			throw new RuntimeException("");
		} else {
			this.anInt8739 = i_1;
			this.aClass90_8807 = class90_2;
			if (this.aBool8805) {
				this.aClass41Array8793[3].method876();
				this.aClass41Array8793[3].method877();
			}

		}
	}

	abstract Interface31 method14034(int var1, boolean var2, int[][] var3);

	public final void method14035(Interface30 interface30_1) {
		if (interface30_1 != this.anInterface30Array8781[this.anInt8780]) {
			this.anInterface30Array8781[this.anInt8780] = interface30_1;
			if (interface30_1 != null) {
				interface30_1.method207();
			} else {
				this.anInterface6_8788.method207();
			}

			this.anInt8703 &= ~0x1;
		}

	}

	Matrix44Arr method14036() {
		return this.aClass384_8705;
	}

	public final void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
	}

	public void method8488(int i_1) {
		if (this.aClass66_8787 != null) {
			this.aClass66_8787.method1278();
		}

		this.anInt8820 = i_1 & 0x7fffffff;
	}

	public final void r(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (this.aClass158_5853 != null) {
			i_6 = this.aClass158_5853.method2714();
			i_5 = this.aClass158_5853.method2716();
		} else {
			i_5 = 0;
			i_6 = 0;
		}

		if (i_1 <= 0 && i_3 >= i_6 - 1 && i_2 <= 0 && i_4 >= i_5 - 1) {
			this.L();
		} else {
			this.anInt8743 = i_1 >= 0 ? i_1 : 0;
			this.anInt8744 = i_3 <= i_6 ? i_3 : i_6;
			this.anInt8822 = i_2 >= 0 ? i_2 : 0;
			this.anInt8742 = i_4 <= i_5 ? i_4 : i_5;
			if (!this.aBool8843) {
				this.aBool8843 = true;
				this.method13922();
			}

			this.method13921();
		}

	}

	public final int method8434(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public void method8633() {
		this.anInt8745 = 0;
		this.anInt8835 = 0;
		this.anInt8722 = this.aClass158_5853.method2714();
		this.anInt8748 = this.aClass158_5853.method2716();
		this.method13918();
	}

	public final Matrix44Arr method8589() {
		return this.aClass384_8724;
	}

	public final boolean method8402() {
		return true;
	}

	public final FontRenderer method8625(FontMetrics fontmetrics_1, Class91[] arr_2, boolean bool_3) {
		return new Class8_Sub4(this, fontmetrics_1, arr_2, bool_3);
	}

	public abstract boolean method14045();

	abstract void method14047();

	abstract Interface6 method14048(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

	public abstract Class101 method14049(String var1);

	public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_1 + this.aClass384_8728.buf[6] * (float) i_2 + this.aClass384_8728.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_4 + this.aClass384_8728.buf[6] * (float) i_5 + this.aClass384_8728.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_1 + this.aClass384_8728.buf[7] * (float) i_2 + this.aClass384_8728.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_4 + this.aClass384_8728.buf[7] * (float) i_5 + this.aClass384_8728.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_1 + this.aClass384_8728.buf[4] * (float) i_2 + this.aClass384_8728.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_4 + this.aClass384_8728.buf[4] * (float) i_5 + this.aClass384_8728.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_1 + this.aClass384_8728.buf[5] * (float) i_2 + this.aClass384_8728.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_4 + this.aClass384_8728.buf[5] * (float) i_5 + this.aClass384_8728.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	abstract void method14054();

	public abstract void method14056(Matrix44Arr var1, Matrix44Arr var2, Matrix44Arr var3);

	public abstract void method14057(Matrix44Arr var1, Matrix44Arr var2, Matrix44Arr var3);

	public abstract void method14058(Matrix44Arr var1, Matrix44Arr var2, Matrix44Arr var3);

	public final Matrix44Arr method8587() {
		return this.aClass384_8724;
	}

	public final int method8443(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public final void method8525(int i_3, int i_4) {
		this.aClass32_8714.method830(0, 0, i_3, i_4);
	}

	public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		float f_10 = (float) i_3 - (float) i_1;
		float f_11 = (float) i_4 - (float) i_2;
		if (f_10 == 0.0F && f_11 == 0.0F) {
			f_10 = 1.0F;
		} else {
			float f_23 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_23;
			f_11 *= f_23;
		}

		this.method13935();
		Class41 class41_12 = this.aClass41Array8793[13];
		class41_12.method873();
		class41_12.method875(i_5);
		this.method13904(i_6);
		class41_12.method879();
		this.method13992(false);
		i_9 %= i_8 + i_7;
		float f_13 = f_10 * (float) i_7;
		float f_14 = f_11 * (float) i_7;
		float f_15 = 0.0F;
		float f_16 = 0.0F;
		float f_17 = f_13;
		float f_18 = f_14;
		if (i_9 > i_7) {
			f_15 = f_10 * (float) (i_7 + i_8 - i_9);
			f_16 = f_11 * (float) (i_7 + i_8 - i_9);
		} else {
			f_17 = f_10 * (float) (i_7 - i_9);
			f_18 = f_11 * (float) (i_7 - i_9);
		}

		float f_19 = (float) i_1 + f_15;
		float f_20 = (float) i_2 + f_16;
		float f_21 = f_10 * (float) i_8;
		float f_22 = f_11 * (float) i_8;

		while (true) {
			if (i_3 > i_1) {
				if (f_19 > (float) i_3) {
					break;
				}

				if (f_19 + f_17 > (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			} else {
				if (f_19 < (float) i_3) {
					break;
				}

				if (f_19 + f_17 < (float) i_3) {
					f_17 = (float) i_3 - f_19;
				}
			}

			if (i_4 > i_2) {
				if (f_20 > (float) i_4) {
					break;
				}

				if (f_20 + f_18 > (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			} else {
				if (f_20 < (float) i_4) {
					break;
				}

				if (f_20 + f_18 < (float) i_4) {
					f_18 = (float) i_4 - f_20;
				}
			}

			if (!this.method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
				return;
			}

			this.method14000();
			f_19 += f_21 + f_17;
			f_20 += f_22 + f_18;
			f_17 = f_13;
			f_18 = f_14;
		}

		this.method13992(true);
		class41_12.method885();
	}

	public final int method8632(int i_1, int i_2) {
		return i_1 | i_2;
	}

	final void method14062() {
		if (this.aClass41_8753 != null) {
			this.aClass41_8753.method877();
		}

		this.method14013();
	}

	abstract void method14063();

	abstract Interface29 method14064(Class150 var1, Class76 var2, int var3, int var4);

	abstract Interface6 method14072(Class150 var1, Class76 var2, int var3, int var4);

	byte[] method14075(String string_1, String string_2) {
		return this.aClass317_8789.method5626(string_1, string_2);
	}

	abstract Interface1 method14077(Class150 var1, int var2, int var3, int var4, boolean var5, byte[] var6);

	public final void fs(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method8433(i_1, i_2, i_1 + i_3, i_2, i_4, i_5);
	}

	public final void method8476(int i_1, Class90 class90_2) {
		if (!this.aBool8779) {
			throw new RuntimeException("");
		} else {
			this.anInt8739 = i_1;
			this.aClass90_8807 = class90_2;
			if (this.aBool8805) {
				this.aClass41Array8793[3].method876();
				this.aClass41Array8793[3].method877();
			}

		}
	}

	public void method8634() {
		this.anInt8745 = 0;
		this.anInt8835 = 0;
		this.anInt8722 = this.aClass158_5853.method2714();
		this.anInt8748 = this.aClass158_5853.method2716();
		this.method13918();
	}

	abstract void method14087();

	public final int method8630(int i_1, int i_2) {
		return i_1 | i_2;
	}

	abstract void method14088();

	public final void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		i_1 = (int) ((float) i_1 + 1.0F);
		i_2 = (int) ((float) i_2 + 1.0F);
		i_3 = (int) ((float) i_3 + 1.0F);
		i_4 = (int) ((float) i_4 + 1.0F);
		float f_8 = (float) (i_3 - i_1);
		float f_9 = (float) (i_4 - i_2);
		float f_10 = 1.0F / (float) Math.sqrt((double) (f_8 * f_8 + f_9 * f_9));
		f_8 *= f_10;
		f_9 *= f_10;
		i_1 = (int) ((float) i_1 - f_8);
		i_2 = (int) ((float) i_2 - f_9);
		float f_11 = -f_9;
		f_11 *= 0.5F * (float) i_6;
		float f_12 = f_8 * 0.5F * (float) i_6;
		this.aClass160_Sub3_8790.method2763((float) i_1 - f_11, (float) i_2 - f_12, (float) i_3 - f_11, (float) i_4 - f_12, (float) i_1 + f_11, (float) i_2 + f_12, 0, i_5, i_7);
	}

	abstract Interface6 method14090(Class150 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7);

	public abstract float method14091();

	abstract void method14092(boolean var1);

	abstract Interface6 method14094(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

	abstract void method14098(int var1);

	public abstract void method14101(Class352 var1, int var2, int var3, int var4, int var5);

	public final void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
	}

	public abstract void method14107(Matrix44Arr var1);

	public final void O() {
		this.aBool8779 = false;
	}

	abstract void method14117();

	public final void ib(int i_1, int i_2, int i_3) {
		if (this.anInt8810 != i_1 || this.anInt8811 != i_2 || this.anInt8680 != i_3) {
			this.anInt8810 = i_1;
			this.anInt8811 = i_2;
			this.anInt8680 = i_3;
			this.method14062();
			this.method13991();
		}

	}

	public void method8635() {
		this.anInt8745 = 0;
		this.anInt8835 = 0;
		this.anInt8722 = this.aClass158_5853.method2714();
		this.anInt8748 = this.aClass158_5853.method2716();
		this.method13918();
	}

	public final boolean method8495() {
		return true;
	}

	public final int di() {
		return this.anInt8702 + this.anInt8701 + this.anInt8761;
	}

	abstract void method14119();

	abstract void method14120();

	public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_1 + this.aClass384_8728.buf[6] * (float) i_2 + this.aClass384_8728.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8728.buf[14] + this.aClass384_8728.buf[2] * (float) i_4 + this.aClass384_8728.buf[6] * (float) i_5 + this.aClass384_8728.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_1 + this.aClass384_8728.buf[7] * (float) i_2 + this.aClass384_8728.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8728.buf[15] + this.aClass384_8728.buf[3] * (float) i_4 + this.aClass384_8728.buf[7] * (float) i_5 + this.aClass384_8728.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_1 + this.aClass384_8728.buf[4] * (float) i_2 + this.aClass384_8728.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8728.buf[12] + this.aClass384_8728.buf[0] * (float) i_4 + this.aClass384_8728.buf[4] * (float) i_5 + this.aClass384_8728.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_1 + this.aClass384_8728.buf[5] * (float) i_2 + this.aClass384_8728.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8728.buf[13] + this.aClass384_8728.buf[1] * (float) i_4 + this.aClass384_8728.buf[5] * (float) i_5 + this.aClass384_8728.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public final void is(int i_1, int i_2, int i_3) {
		if (this.anInt8810 != i_1 || this.anInt8811 != i_2 || this.anInt8680 != i_3) {
			this.anInt8810 = i_1;
			this.anInt8811 = i_2;
			this.anInt8680 = i_3;
			this.method14062();
			this.method13991();
		}

	}

	abstract void method14121();

	abstract void method14122();

	public final boolean method8492() {
		return true;
	}

	abstract void method14124();

	abstract void method14125();

	final Matrix44Arr method14126() {
		return this.aClass33_8719 == Class33.aClass33_381 ? this.aClass384_8740 : aClass384_8712;
	}

	abstract void method14127();

	public final boolean method8406() {
		return true;
	}

	public final void method8459() {
	}

	Matrix44Var method14130() {
		if (this.aClass33_8719 == Class33.aClass33_381) {
			if (!this.aBool8829) {
				this.aClass294_8710.method5209(this.aClass294_8704);
				this.aClass294_8710.method5208(this.aClass294_8706);
				this.aClass384_8685.fromVarMatrix44(this.aClass294_8710);
				this.aBool8829 = true;
			}

			return this.aClass294_8710;
		} else {
			return this.aClass294_8704;
		}
	}

	public void method8514(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8745 = i_1;
		this.anInt8835 = i_2;
		this.anInt8722 = i_3;
		this.anInt8748 = i_4;
		this.method13918();
	}

	abstract void method14132();

	final void method14133() {
		this.method14226();
	}

	abstract boolean method14134(Class150 var1, Class76 var2);

	abstract boolean method14135(Class150 var1, Class76 var2);

	abstract boolean method14136(Class150 var1, Class76 var2);

	abstract boolean method14137(Class150 var1, Class76 var2);

	public final void jf() {
		this.aBool8779 = false;
	}

	abstract Interface6 method14141(Class150 var1, Class76 var2, int var3, int var4);

	abstract Interface6 method14142(Class150 var1, Class76 var2, int var3, int var4);

	abstract Interface6 method14143(Class150 var1, int var2, int var3, boolean var4, byte[] var5);

	abstract Interface6 method14144(Class150 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7);

	public final boolean method8465() {
		return true;
	}

	abstract Interface6 method14145(Class150 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7);

	public final NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new Class160_Sub3(this, i_1, i_2, bool_3, bool_4);
	}

	public abstract boolean method14146();

	public final NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new Class160_Sub3(this, i_1, i_2, bool_3, bool_4);
	}

	public final void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method8433(i_1, i_2, i_1 + i_3, i_2, i_5, i_6);
		this.method8433(i_1, i_2 + i_4, i_1 + i_3, i_2 + i_4, i_5, i_6);
		this.method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
		this.method8433(i_1 + i_3, i_2, i_1 + i_3, i_2 + i_4, i_5, i_6);
	}

	public final void method14147() {
		this.anInterface30Array8781 = new Interface30[this.anInt8825];
		this.aClass384Array8782 = new Matrix44Arr[this.anInt8825];
		this.aClass37Array8783 = new Class37[this.anInt8825];
		this.aClass68Array8784 = new Class68[this.anInt8825];
		this.aClass68Array8785 = new Class68[this.anInt8825];

		for (int i_1 = 0; i_1 < this.anInt8825; i_1++) {
			this.aClass68Array8785[i_1] = Class68.aClass68_683;
			this.aClass68Array8784[i_1] = Class68.aClass68_683;
			this.aClass37Array8783[i_1] = Class37.aClass37_393;
			this.aClass384Array8782[i_1] = new Matrix44Arr();
		}

		this.aClass282_Sub24Array8716 = new Class282_Sub24[this.anInt8799 - 2];
		int[] ints_3 = new int[] { -1 };
		this.anInterface6_8788 = this.method14094(1, 1, false, ints_3, 0, 0);
		ints_3[0] = -16777216;
		this.anInterface6_8795 = this.method14094(1, 1, false, ints_3, 0, 0);
		this.method8439(new Class282_Sub1_Sub2(262144));
		this.aClass70_8832 = this.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }) });
		this.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_690 }) });
		this.aClass70_8836 = this.method13995(new Class72[] { new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692), new Class72(Class69.aClass69_689) });
		this.aClass70_8721 = this.method13995(new Class72[] { new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692) });

		for (int i_2 = 0; i_2 < 7; i_2++) {
			this.aClass528_Sub3Array8839[i_2] = new Class528_Sub3(this, 0, 0, false, false);
			this.aClass528_Sub3Array8840[i_2] = new Class528_Sub3(this, 0, 0, true, true);
		}

		this.method13895();
		this.anInterface32_8834 = this.method13993(true);
		this.method13897();
		this.method8418();
		this.L();
		this.method8420();
		this.aClass160_Sub3_8790 = new Class160_Sub3(this, this.anInterface6_8788);
		this.aClass160_Sub3_8791 = new Class160_Sub3(this, this.anInterface6_8795);
		this.ba(3, 0);
	}

	abstract Interface29 method14148(Class150 var1, Class76 var2, int var3, int var4);

	abstract Interface29 method14149(Class150 var1, Class76 var2, int var3, int var4);

	public final void method14150() {
		this.method14001(Class352.aClass352_4104);
	}

	public abstract void method14153();

	public abstract void method14154();

	public abstract void method14161(int var1, Interface4 var2);

	abstract void method14162(int var1, Class67 var2, boolean var3, boolean var4);

	public final void method14163(int i_1) {
		if (this.anInt8780 != i_1) {
			this.anInt8780 = i_1;
			this.method13978();
		}

	}

	abstract void method14166(int var1, Class67 var2, boolean var3);

	abstract void method14169();

	public final void method8560(int i_1) {
	}

	abstract void method14172();

	abstract void method14173(Interface32 var1);

	final void method14177() {
		this.anInterface4_8693 = this.method13994(false);
		this.anInterface4_8693.method31(3096, 12);
		this.aByteBuffer8838.clear();
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);
		this.aByteBuffer8838.putFloat(0.0F);

		for (int i_1 = 0; i_1 <= 256; i_1++) {
			double d_2 = (double) (i_1 * 2) * 3.141592653589793D / 256.0D;
			float f_4 = (float) Math.cos(d_2);
			float f_5 = (float) Math.sin(d_2);
			this.aByteBuffer8838.putFloat(f_5);
			this.aByteBuffer8838.putFloat(f_4);
			this.aByteBuffer8838.putFloat(0.0F);
		}

		this.anInterface4_8693.method42(0, this.aByteBuffer8838.position(), this.aLong8695);
	}

	abstract void method14179();

	abstract void method14180();

	public final Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return new Class152_Sub2_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	abstract void method14181();

	abstract void method14182();

	abstract void method14183();

	abstract void method14184();

	abstract void method14185();

	abstract void method14186();

	abstract void method14187();

	abstract void method14188();

	abstract void method14190();

	public final void B(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aBool8755) {
			this.RA(false);
			this.aClass160_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
			this.RA(true);
		} else {
			this.aClass160_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
		}

	}

	abstract void method14197();

	public final void G(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method8433(i_1, i_2, i_1, i_3 + i_2, i_4, i_5);
	}

	abstract void method14199();

	abstract void method14200();

	public final void method8474() {
		this.aClass32_8714.method833();
	}

	abstract void method14203();

	abstract void method14204();

	abstract void method14205();

	abstract Interface32 method14206(boolean var1);

	abstract Interface32 method14207(boolean var1);

	abstract Class70 method14209(Class72[] var1);

	abstract Class70 method14210(Class72[] var1);

	public abstract void method14212(Class70 var1);

	public abstract void method14213(int var1, Interface4 var2);

	public abstract void method14214(int var1, Interface4 var2);

	abstract void method14215(Interface32 var1);

	abstract Interface6 method14216(Class150 var1, Class76 var2, int var3, int var4);

	abstract void method14217(Interface32 var1);

	abstract void method14224(int var1, Class67 var2, boolean var3, boolean var4);

	abstract void method14226();

	public final boolean method8609() {
		return false;
	}

	public abstract void method14228(Class352 var1, int var2, int var3, int var4, int var5);

	public abstract void method14229(Class352 var1, int var2, int var3, int var4, int var5);

	public abstract void method14230(Class352 var1, int var2, int var3, int var4, int var5);

	abstract void method14235(int var1);

	abstract void method14236(int var1);

	abstract Interface31 method14237(int var1, boolean var2, int[][] var3);

	abstract void method14238();

	abstract Interface31 method14239(int var1, boolean var2, int[][] var3);

	abstract void method14240(int var1);

}
