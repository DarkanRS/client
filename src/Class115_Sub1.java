
/* Class115_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class115_Sub1 extends Class115 {
	float[][] aFloatArrayArray9283;
	boolean aBool9284 = false;
	boolean[] aBoolArray9285;
	long aLong9286;
	long aLong9287;
	static float[] aFloatArray9288 = new float[16];
	byte[] aByteArray9289;
	byte[] aByteArray9290;
	static final int anInt9291 = 0;
	static final int anInt9292 = 1;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_9293;
	Class101_Sub2 aClass101_Sub2_9294;

	void method1912(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_0_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if ((class282_sub21_sub1.method15457((byte) 122) != Class111.aClass111_1219) && (class282_sub21_sub1.method15457((byte) 35) != Class111.aClass111_1182))
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i] = f;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_0_ >= 0) {
			i_0_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_0_] = f;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	Class115_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2, Class99 class99) {
		((Class115_Sub1) this).aFloatArrayArray9283 = new float[2][];
		((Class115_Sub1) this).aBoolArray9285 = new boolean[2];
		aString1245 = class99.aString1003;
		if (class99.aString1001 != null) {
			aString1244 = class99.aString1001;
			((Class115_Sub1) this).aByteArray9289 = class505_sub2_sub2.method15651(aString1244);
		}
		if (class99.aString1002 != null) {
			aString1246 = class99.aString1002;
			((Class115_Sub1) this).aByteArray9290 = class505_sub2_sub2.method15651(aString1246);
		}
		class505_sub2_sub2.method13901(this);
	}

	public boolean method1898() {
		if (((Class115_Sub1) this).aBool9284)
			return true;
		((Class115_Sub1) this).aLong9286 = (((Class115_Sub1) this).aByteArray9289 == null ? 0L : (IDirect3DDevice.CreateVertexShader((((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252), ((Class115_Sub1) this).aByteArray9289)));
		((Class115_Sub1) this).aLong9287 = (((Class115_Sub1) this).aByteArray9290 == null ? 0L : (IDirect3DDevice.CreatePixelShader((((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252), ((Class115_Sub1) this).aByteArray9290)));
		if (((Class115_Sub1) this).aLong9286 == 0L && ((Class115_Sub1) this).aLong9287 == 0L)
			return false;
		int i = -1;
		for (int i_1_ = 0; i_1_ < ((Class115_Sub1) this).aClass101_Sub2_9294.method1650(300449281); i_1_++) {
			if (((Class115_Sub1) this).aClass101_Sub2_9294.method1652(i_1_, (byte) 108) == this) {
				i = i_1_;
				break;
			}
		}
		int i_2_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1682(1481602803);
		int i_3_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1679(1445130884);
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub1) this).aClass101_Sub2_9294.method1742(i_4_, -41887126);
			class282_sub21_sub1.method15471(i);
		}
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub1) this).aClass101_Sub2_9294.method1705(i_5_, 289833629);
			class282_sub21_sub1.method15471(i);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1653(this, (byte) -15);
		for (int i_9_ = 0; i_9_ < i_2_ + i_3_; i_9_++) {
			Class282_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1 = ((Class282_Sub21_Sub1_Sub1) (i_9_ < i_2_ ? ((Class115_Sub1) this).aClass101_Sub2_9294.method1742(i_9_, -1079014826) : ((Class115_Sub1) this).aClass101_Sub2_9294.method1705(i_9_ - i_2_, 2108244742)));
			Class111 class111 = class282_sub21_sub1_sub1.method15457((byte) 40);
			int i_10_ = 1;
			if (class111 == Class111.aClass111_1109) {
				class111 = class282_sub21_sub1_sub1.method15458((byte) -103);
				i_10_ = class282_sub21_sub1_sub1.method15459((short) 3553);
			}
			switch (class111.anInt1232 * -278657439) {
			case 34:
			case 41:
			case 80:
			case 94:
				i_10_ *= 2;
				break;
			case 16:
			case 17:
			case 56:
			case 75:
				i_10_ *= 4;
				break;
			case 5:
			case 26:
			case 49:
			case 64:
				i_10_ *= 3;
				break;
			default:
				i_10_ = 0;
				break;
			case 8:
			case 10:
			case 54:
			case 95:
				/* empty */
			}
			if ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10306[i_8_]) >= 0) {
				int i_11_ = ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10306[i_8_]) + i_10_);
				if (i_6_ < i_11_)
					i_6_ = i_11_;
			}
			if ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10307[i_8_]) >= 0) {
				int i_12_ = ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10307[i_8_]) + i_10_);
				if (i_7_ < i_12_)
					i_7_ = i_12_;
			}
		}
		((Class115_Sub1) this).aFloatArrayArray9283[0] = new float[i_6_ * 4];
		((Class115_Sub1) this).aFloatArrayArray9283[1] = new float[i_7_ * 4];
		((Class115_Sub1) this).aBool9284 = true;
		return true;
	}

	void method1894(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_13_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if ((class282_sub21_sub1.method15457((byte) 28) != Class111.aClass111_1219) && (class282_sub21_sub1.method15457((byte) 56) != Class111.aClass111_1182))
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i] = f;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_13_ >= 0) {
			i_13_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_13_] = f;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1923(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_14_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_15_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 32) != Class111.aClass111_1132)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_14_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_15_ >= 0) {
			i_15_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_15_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_15_ + 1] = f_14_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1908(int i, int i_16_, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i_16_);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1942(int i, Class384 class384) {
		int i_17_ = i >> 16;
		int i_18_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6589(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_17_], i_18_, 8);
		((Class115_Sub1) this).aBoolArray9285[i_17_] = true;
	}

	void method1936(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_19_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 115) != Class111.aClass111_1168)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0)
			method14589(i, class384.method6589(aFloatArray9288), 8);
		if (i_19_ >= 0)
			method14590(i_19_, class384.method6589(aFloatArray9288), 8);
	}

	void method1891(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_20_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 27) != Class111.aClass111_1150)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0)
			method14589(i, class384.method6545(aFloatArray9288), 16);
		if (i_20_ >= 0)
			method14590(i_20_, class384.method6545(aFloatArray9288), 16);
	}

	final void method14588(int i, float[] fs, int i_21_) {
		Class503.method8356(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[1], i * 4, i_21_);
		((Class115_Sub1) this).aBoolArray9285[1] = true;
	}

	void method1948(int i, int i_22_, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i_22_);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1893(int i, float f, float f_23_, float f_24_) {
		int i_25_ = i >> 16;
		int i_26_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_25_][i_26_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_25_][i_26_ + 1] = f_23_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_25_][i_26_ + 2] = f_24_;
		((Class115_Sub1) this).aBoolArray9285[i_25_] = true;
	}

	void method1895(int i, float f, float f_27_, float f_28_, float f_29_) {
		int i_30_ = i >> 16;
		int i_31_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_30_][i_31_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_30_][i_31_ + 1] = f_27_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_30_][i_31_ + 2] = f_28_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_30_][i_31_ + 3] = f_29_;
		((Class115_Sub1) this).aBoolArray9285[i_30_] = true;
	}

	void method1905(int i, Class384 class384) {
		int i_32_ = i >> 16;
		int i_33_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_32_], i_33_, 12);
		((Class115_Sub1) this).aBoolArray9285[i_32_] = true;
	}

	void method1906(int i, Class384 class384) {
		int i_34_ = i >> 16;
		int i_35_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6589(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_34_], i_35_, 8);
		((Class115_Sub1) this).aBoolArray9285[i_34_] = true;
	}

	void method1900(int i, Class384 class384) {
		int i_36_ = i >> 16;
		int i_37_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_36_], i_37_, 16);
		((Class115_Sub1) this).aBoolArray9285[i_36_] = true;
	}

	void method1904(int i, float[] fs, int i_38_) {
		int i_39_ = i >> 16;
		int i_40_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_39_], i_40_, i_38_);
		((Class115_Sub1) this).aBoolArray9285[i_39_] = true;
	}

	final void method14589(int i, float[] fs, int i_41_) {
		Class503.method8356(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[0], i * 4, i_41_);
		((Class115_Sub1) this).aBoolArray9285[0] = true;
	}

	final void method14590(int i, float[] fs, int i_42_) {
		Class503.method8356(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[1], i * 4, i_42_);
		((Class115_Sub1) this).aBoolArray9285[1] = true;
	}

	void method1933(int i, float f, float f_43_, float f_44_, float f_45_) {
		int i_46_ = i >> 16;
		int i_47_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_46_][i_47_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_46_][i_47_ + 1] = f_43_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_46_][i_47_ + 2] = f_44_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_46_][i_47_ + 3] = f_45_;
		((Class115_Sub1) this).aBoolArray9285[i_46_] = true;
	}

	void method14591() {
		if (((Class115_Sub1) this).aBoolArray9285[0]) {
			for (int i = 0; i < ((Class115_Sub1) this).aFloatArrayArray9283[0].length; i++)
				((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.anUnsafe8830.putFloat((((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695 + (long) (i * 4)), ((Class115_Sub1) this).aFloatArrayArray9283[0][i]);
			IDirect3DDevice.SetVertexShaderConstantF(((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252, 0, ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695, ((Class115_Sub1) this).aFloatArrayArray9283[0].length / 4);
			((Class115_Sub1) this).aBoolArray9285[0] = false;
		}
		if (((Class115_Sub1) this).aBoolArray9285[1]) {
			for (int i = 0; i < ((Class115_Sub1) this).aFloatArrayArray9283[1].length; i++)
				((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.anUnsafe8830.putFloat((((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695 + (long) (i * 4)), ((Class115_Sub1) this).aFloatArrayArray9283[1][i]);
			IDirect3DDevice.SetPixelShaderConstantF(((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252, 0, ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695, ((Class115_Sub1) this).aFloatArrayArray9283[1].length / 4);
			((Class115_Sub1) this).aBoolArray9285[1] = false;
		}
	}

	public void method26() {
		if (((Class115_Sub1) this).aLong9286 != 0L) {
			IUnknown.Release(((Class115_Sub1) this).aLong9286);
			((Class115_Sub1) this).aLong9286 = 0L;
		}
		if (((Class115_Sub1) this).aLong9287 != 0L) {
			IUnknown.Release(((Class115_Sub1) this).aLong9287);
			((Class115_Sub1) this).aLong9287 = 0L;
		}
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method13885(this);
	}

	void method14592() {
		if (((Class115_Sub1) this).aLong9286 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9286);
			((Class115_Sub1) this).aLong9286 = 0L;
		}
		if (((Class115_Sub1) this).aLong9287 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9287);
			((Class115_Sub1) this).aLong9287 = 0L;
		}
	}

	public void finalize() {
		method14592();
	}

	void method1903(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_48_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_49_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 38) != Class111.aClass111_1109)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i_48_ >= 0)
			method14589(i_48_, fs, i);
		if (i_49_ >= 0)
			method14590(i_49_, fs, i);
	}

	public void method32() {
		if (((Class115_Sub1) this).aLong9286 != 0L) {
			IUnknown.Release(((Class115_Sub1) this).aLong9286);
			((Class115_Sub1) this).aLong9286 = 0L;
		}
		if (((Class115_Sub1) this).aLong9287 != 0L) {
			IUnknown.Release(((Class115_Sub1) this).aLong9287);
			((Class115_Sub1) this).aLong9287 = 0L;
		}
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method13885(this);
	}

	void method14593() {
		method14592();
	}

	void method14594() {
		method14592();
	}

	void method14595() {
		if (((Class115_Sub1) this).aLong9286 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9286);
			((Class115_Sub1) this).aLong9286 = 0L;
		}
		if (((Class115_Sub1) this).aLong9287 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9287);
			((Class115_Sub1) this).aLong9287 = 0L;
		}
	}

	public boolean method1911() {
		if (((Class115_Sub1) this).aBool9284)
			return true;
		((Class115_Sub1) this).aLong9286 = (((Class115_Sub1) this).aByteArray9289 == null ? 0L : (IDirect3DDevice.CreateVertexShader((((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252), ((Class115_Sub1) this).aByteArray9289)));
		((Class115_Sub1) this).aLong9287 = (((Class115_Sub1) this).aByteArray9290 == null ? 0L : (IDirect3DDevice.CreatePixelShader((((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252), ((Class115_Sub1) this).aByteArray9290)));
		if (((Class115_Sub1) this).aLong9286 == 0L && ((Class115_Sub1) this).aLong9287 == 0L)
			return false;
		int i = -1;
		for (int i_50_ = 0; i_50_ < ((Class115_Sub1) this).aClass101_Sub2_9294.method1650(1390005853); i_50_++) {
			if (((Class115_Sub1) this).aClass101_Sub2_9294.method1652(i_50_, (byte) 56) == this) {
				i = i_50_;
				break;
			}
		}
		int i_51_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1682(705004134);
		int i_52_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1679(-2110230326);
		for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub1) this).aClass101_Sub2_9294.method1742(i_53_, -1925781962);
			class282_sub21_sub1.method15471(i);
		}
		for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub1) this).aClass101_Sub2_9294.method1705(i_54_, 284619700);
			class282_sub21_sub1.method15471(i);
		}
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1653(this, (byte) -48);
		for (int i_58_ = 0; i_58_ < i_51_ + i_52_; i_58_++) {
			Class282_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1 = ((Class282_Sub21_Sub1_Sub1) (i_58_ < i_51_ ? ((Class115_Sub1) this).aClass101_Sub2_9294.method1742(i_58_, -381245659) : ((Class115_Sub1) this).aClass101_Sub2_9294.method1705(i_58_ - i_51_, -206996520)));
			Class111 class111 = class282_sub21_sub1_sub1.method15457((byte) 20);
			int i_59_ = 1;
			if (class111 == Class111.aClass111_1109) {
				class111 = class282_sub21_sub1_sub1.method15458((byte) -41);
				i_59_ = class282_sub21_sub1_sub1.method15459((short) 3553);
			}
			switch (class111.anInt1232 * -278657439) {
			case 34:
			case 41:
			case 80:
			case 94:
				i_59_ *= 2;
				break;
			case 16:
			case 17:
			case 56:
			case 75:
				i_59_ *= 4;
				break;
			case 5:
			case 26:
			case 49:
			case 64:
				i_59_ *= 3;
				break;
			default:
				i_59_ = 0;
				break;
			case 8:
			case 10:
			case 54:
			case 95:
				/* empty */
			}
			if ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10306[i_57_]) >= 0) {
				int i_60_ = ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10306[i_57_]) + i_59_);
				if (i_55_ < i_60_)
					i_55_ = i_60_;
			}
			if ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10307[i_57_]) >= 0) {
				int i_61_ = ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10307[i_57_]) + i_59_);
				if (i_56_ < i_61_)
					i_56_ = i_61_;
			}
		}
		((Class115_Sub1) this).aFloatArrayArray9283[0] = new float[i_55_ * 4];
		((Class115_Sub1) this).aFloatArrayArray9283[1] = new float[i_56_ * 4];
		((Class115_Sub1) this).aBool9284 = true;
		return true;
	}

	Class115_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2, Class101_Sub2 class101_sub2, Class99 class99) {
		this(class505_sub2_sub2, class99);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293 = class505_sub2_sub2;
		((Class115_Sub1) this).aClass101_Sub2_9294 = class101_sub2;
	}

	void method1897(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_62_, float f_63_, float f_64_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_65_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 45) != Class111.aClass111_1134)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_62_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_63_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 3] = f_64_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_65_ >= 0) {
			i_65_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_65_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_65_ + 1] = f_62_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_65_ + 2] = f_63_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_65_ + 3] = f_64_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method14596() {
		if (((Class115_Sub1) this).aLong9286 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9286);
			((Class115_Sub1) this).aLong9286 = 0L;
		}
		if (((Class115_Sub1) this).aLong9287 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9287);
			((Class115_Sub1) this).aLong9287 = 0L;
		}
	}

	void method1928(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1939(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_66_, float f_67_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_68_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 19) != Class111.aClass111_1133)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_66_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_67_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_68_ >= 0) {
			i_68_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_68_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_68_ + 1] = f_66_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_68_ + 2] = f_67_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1917(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_69_, float f_70_, float f_71_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_72_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 56) != Class111.aClass111_1134)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_69_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_70_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 3] = f_71_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_72_ >= 0) {
			i_72_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_72_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_72_ + 1] = f_69_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_72_ + 2] = f_70_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_72_ + 3] = f_71_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1901(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_73_, float f_74_, float f_75_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_76_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 111) != Class111.aClass111_1134)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_73_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_74_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 3] = f_75_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_76_ >= 0) {
			i_76_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_76_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_76_ + 1] = f_73_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_76_ + 2] = f_74_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_76_ + 3] = f_75_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1920(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_77_, float f_78_, float f_79_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_80_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 116) != Class111.aClass111_1134)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_77_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_78_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 3] = f_79_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_80_ >= 0) {
			i_80_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_80_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_80_ + 1] = f_77_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_80_ + 2] = f_78_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_80_ + 3] = f_79_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1925(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_81_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 127) != Class111.aClass111_1168)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0)
			method14589(i, class384.method6589(aFloatArray9288), 8);
		if (i_81_ >= 0)
			method14590(i_81_, class384.method6589(aFloatArray9288), 8);
	}

	void method1919(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_82_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_83_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 45) != Class111.aClass111_1109)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i_82_ >= 0)
			method14589(i_82_, fs, i);
		if (i_83_ >= 0)
			method14590(i_83_, fs, i);
	}

	void method1944(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_84_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_85_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 125) != Class111.aClass111_1109)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i_84_ >= 0)
			method14589(i_84_, fs, i);
		if (i_85_ >= 0)
			method14590(i_85_, fs, i);
	}

	void method1930(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1918(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_86_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_87_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 48) != Class111.aClass111_1109)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i_86_ >= 0)
			method14589(i_86_, fs, i);
		if (i_87_ >= 0)
			method14590(i_87_, fs, i);
	}

	void method1924(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_88_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 110) != Class111.aClass111_1168)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0)
			method14589(i, class384.method6589(aFloatArray9288), 8);
		if (i_88_ >= 0)
			method14590(i_88_, class384.method6589(aFloatArray9288), 8);
	}

	void method1921(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		int i_89_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_90_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 21) != Class111.aClass111_1109)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i_89_ >= 0)
			method14589(i_89_, fs, i);
		if (i_90_ >= 0)
			method14590(i_90_, fs, i);
	}

	void method1926(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_91_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 69) != Class111.aClass111_1150)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0)
			method14589(i, class384.method6545(aFloatArray9288), 16);
		if (i_91_ >= 0)
			method14590(i_91_, class384.method6545(aFloatArray9288), 16);
	}

	void method1927(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_92_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 44) != Class111.aClass111_1150)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0)
			method14589(i, class384.method6545(aFloatArray9288), 16);
		if (i_92_ >= 0)
			method14590(i_92_, class384.method6545(aFloatArray9288), 16);
	}

	void method1910(int i, Class384 class384) {
		int i_93_ = i >> 16;
		int i_94_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_93_], i_94_, 16);
		((Class115_Sub1) this).aBoolArray9285[i_93_] = true;
	}

	void method1929(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1922(int i, Class384 class384) {
		int i_95_ = i >> 16;
		int i_96_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_95_], i_96_, 12);
		((Class115_Sub1) this).aBoolArray9285[i_95_] = true;
	}

	void method1931(int i, float f, float f_97_, float f_98_) {
		int i_99_ = i >> 16;
		int i_100_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_99_][i_100_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_99_][i_100_ + 1] = f_97_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_99_][i_100_ + 2] = f_98_;
		((Class115_Sub1) this).aBoolArray9285[i_99_] = true;
	}

	void method1932(int i, float f, float f_101_, float f_102_, float f_103_) {
		int i_104_ = i >> 16;
		int i_105_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_104_][i_105_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_104_][i_105_ + 1] = f_101_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_104_][i_105_ + 2] = f_102_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_104_][i_105_ + 3] = f_103_;
		((Class115_Sub1) this).aBoolArray9285[i_104_] = true;
	}

	void method1935(int i, float f, float f_106_, float f_107_, float f_108_) {
		int i_109_ = i >> 16;
		int i_110_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_109_][i_110_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_109_][i_110_ + 1] = f_106_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_109_][i_110_ + 2] = f_107_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_109_][i_110_ + 3] = f_108_;
		((Class115_Sub1) this).aBoolArray9285[i_109_] = true;
	}

	void method1934(int i, float f, float f_111_, float f_112_, float f_113_) {
		int i_114_ = i >> 16;
		int i_115_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_114_][i_115_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_114_][i_115_ + 1] = f_111_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_114_][i_115_ + 2] = f_112_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_114_][i_115_ + 3] = f_113_;
		((Class115_Sub1) this).aBoolArray9285[i_114_] = true;
	}

	void method1914(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_116_, float f_117_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_118_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 57) != Class111.aClass111_1133)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_116_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_117_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_118_ >= 0) {
			i_118_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_118_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_118_ + 1] = f_116_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_118_ + 2] = f_117_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1907(int i, float f, float f_119_, float f_120_, float f_121_) {
		int i_122_ = i >> 16;
		int i_123_ = (i & 0xffff) * 4;
		((Class115_Sub1) this).aFloatArrayArray9283[i_122_][i_123_] = f;
		((Class115_Sub1) this).aFloatArrayArray9283[i_122_][i_123_ + 1] = f_119_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_122_][i_123_ + 2] = f_120_;
		((Class115_Sub1) this).aFloatArrayArray9283[i_122_][i_123_ + 3] = f_121_;
		((Class115_Sub1) this).aBoolArray9285[i_122_] = true;
	}

	void method1937(int i, float[] fs, int i_124_) {
		int i_125_ = i >> 16;
		int i_126_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_125_], i_126_, i_124_);
		((Class115_Sub1) this).aBoolArray9285[i_125_] = true;
	}

	void method1938(int i, float[] fs, int i_127_) {
		int i_128_ = i >> 16;
		int i_129_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_128_], i_129_, i_127_);
		((Class115_Sub1) this).aBoolArray9285[i_128_] = true;
	}

	void method1915(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_130_, float f_131_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_132_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 44) != Class111.aClass111_1133)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_130_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_131_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_132_ >= 0) {
			i_132_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_132_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_132_ + 1] = f_130_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_132_ + 2] = f_131_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1940(int i, Class384 class384) {
		int i_133_ = i >> 16;
		int i_134_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_133_], i_134_, 12);
		((Class115_Sub1) this).aBoolArray9285[i_133_] = true;
	}

	void method1913(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_135_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_136_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 40) != Class111.aClass111_1132)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_135_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_136_ >= 0) {
			i_136_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_136_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_136_ + 1] = f_135_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1943(int i, Class384 class384) {
		int i_137_ = i >> 16;
		int i_138_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_137_], i_138_, 16);
		((Class115_Sub1) this).aBoolArray9285[i_137_] = true;
	}

	void method1902(int i, Class384 class384) {
		int i_139_ = i >> 16;
		int i_140_ = (i & 0xffff) * 4;
		System.arraycopy(class384.method6545(aFloatArray9288), 0, ((Class115_Sub1) this).aFloatArrayArray9283[i_139_], i_140_, 12);
		((Class115_Sub1) this).aBoolArray9285[i_139_] = true;
	}

	void method1947(int i, int i_141_, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i_141_);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1945(int i, int i_142_, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i_142_);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	void method1946(int i, int i_143_, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i_143_);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}

	public boolean method1899() {
		if (((Class115_Sub1) this).aBool9284)
			return true;
		((Class115_Sub1) this).aLong9286 = (((Class115_Sub1) this).aByteArray9289 == null ? 0L : (IDirect3DDevice.CreateVertexShader((((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252), ((Class115_Sub1) this).aByteArray9289)));
		((Class115_Sub1) this).aLong9287 = (((Class115_Sub1) this).aByteArray9290 == null ? 0L : (IDirect3DDevice.CreatePixelShader((((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252), ((Class115_Sub1) this).aByteArray9290)));
		if (((Class115_Sub1) this).aLong9286 == 0L && ((Class115_Sub1) this).aLong9287 == 0L)
			return false;
		int i = -1;
		for (int i_144_ = 0; i_144_ < ((Class115_Sub1) this).aClass101_Sub2_9294.method1650(-184991496); i_144_++) {
			if (((Class115_Sub1) this).aClass101_Sub2_9294.method1652(i_144_, (byte) 38) == this) {
				i = i_144_;
				break;
			}
		}
		int i_145_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1682(-428364287);
		int i_146_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1679(56139267);
		for (int i_147_ = 0; i_147_ < i_145_; i_147_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub1) this).aClass101_Sub2_9294.method1742(i_147_, 689990162);
			class282_sub21_sub1.method15471(i);
		}
		for (int i_148_ = 0; i_148_ < i_146_; i_148_++) {
			Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class115_Sub1) this).aClass101_Sub2_9294.method1705(i_148_, 1150500722);
			class282_sub21_sub1.method15471(i);
		}
		int i_149_ = 0;
		int i_150_ = 0;
		int i_151_ = ((Class115_Sub1) this).aClass101_Sub2_9294.method1653(this, (byte) -120);
		for (int i_152_ = 0; i_152_ < i_145_ + i_146_; i_152_++) {
			Class282_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1 = ((Class282_Sub21_Sub1_Sub1) (i_152_ < i_145_ ? ((Class115_Sub1) this).aClass101_Sub2_9294.method1742(i_152_, -1199561098) : ((Class115_Sub1) this).aClass101_Sub2_9294.method1705(i_152_ - i_145_, 529548747)));
			Class111 class111 = class282_sub21_sub1_sub1.method15457((byte) 26);
			int i_153_ = 1;
			if (class111 == Class111.aClass111_1109) {
				class111 = class282_sub21_sub1_sub1.method15458((byte) -56);
				i_153_ = class282_sub21_sub1_sub1.method15459((short) 3553);
			}
			switch (class111.anInt1232 * -278657439) {
			case 34:
			case 41:
			case 80:
			case 94:
				i_153_ *= 2;
				break;
			case 16:
			case 17:
			case 56:
			case 75:
				i_153_ *= 4;
				break;
			case 5:
			case 26:
			case 49:
			case 64:
				i_153_ *= 3;
				break;
			default:
				i_153_ = 0;
				break;
			case 8:
			case 10:
			case 54:
			case 95:
				/* empty */
			}
			if ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10306[i_151_]) >= 0) {
				int i_154_ = ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10306[i_151_]) + i_153_);
				if (i_149_ < i_154_)
					i_149_ = i_154_;
			}
			if ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10307[i_151_]) >= 0) {
				int i_155_ = ((((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_sub1).anIntArray10307[i_151_]) + i_153_);
				if (i_150_ < i_155_)
					i_150_ = i_155_;
			}
		}
		((Class115_Sub1) this).aFloatArrayArray9283[0] = new float[i_149_ * 4];
		((Class115_Sub1) this).aFloatArrayArray9283[1] = new float[i_150_ * 4];
		((Class115_Sub1) this).aBool9284 = true;
		return true;
	}

	final void method14597(int i, float[] fs, int i_156_) {
		Class503.method8356(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[0], i * 4, i_156_);
		((Class115_Sub1) this).aBoolArray9285[0] = true;
	}

	final void method14598(int i, float[] fs, int i_157_) {
		Class503.method8356(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[0], i * 4, i_157_);
		((Class115_Sub1) this).aBoolArray9285[0] = true;
	}

	void method1916(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_158_, float f_159_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_160_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 46) != Class111.aClass111_1133)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_158_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_159_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_160_ >= 0) {
			i_160_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_160_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_160_ + 1] = f_158_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_160_ + 2] = f_159_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	final void method14599(int i, float[] fs, int i_161_) {
		Class503.method8356(fs, 0, ((Class115_Sub1) this).aFloatArrayArray9283[1], i * 4, i_161_);
		((Class115_Sub1) this).aBoolArray9285[1] = true;
	}

	void method14600() {
		if (((Class115_Sub1) this).aBoolArray9285[0]) {
			for (int i = 0; i < ((Class115_Sub1) this).aFloatArrayArray9283[0].length; i++)
				((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.anUnsafe8830.putFloat((((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695 + (long) (i * 4)), ((Class115_Sub1) this).aFloatArrayArray9283[0][i]);
			IDirect3DDevice.SetVertexShaderConstantF(((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252, 0, ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695, ((Class115_Sub1) this).aFloatArrayArray9283[0].length / 4);
			((Class115_Sub1) this).aBoolArray9285[0] = false;
		}
		if (((Class115_Sub1) this).aBoolArray9285[1]) {
			for (int i = 0; i < ((Class115_Sub1) this).aFloatArrayArray9283[1].length; i++)
				((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.anUnsafe8830.putFloat((((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695 + (long) (i * 4)), ((Class115_Sub1) this).aFloatArrayArray9283[1][i]);
			IDirect3DDevice.SetPixelShaderConstantF(((Class505_Sub2_Sub2) ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293).aLong10252, 0, ((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.aLong8695, ((Class115_Sub1) this).aFloatArrayArray9283[1].length / 4);
			((Class115_Sub1) this).aBoolArray9285[1] = false;
		}
	}

	void method14601() {
		if (((Class115_Sub1) this).aLong9286 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9286);
			((Class115_Sub1) this).aLong9286 = 0L;
		}
		if (((Class115_Sub1) this).aLong9287 != 0L) {
			((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method15650(((Class115_Sub1) this).aLong9287);
			((Class115_Sub1) this).aLong9287 = 0L;
		}
	}

	void method1941(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_162_, float f_163_, float f_164_) {
		int i = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15782();
		int i_165_ = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1).method15783();
		if (class282_sub21_sub1.method15457((byte) 60) != Class111.aClass111_1134)
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 1] = f_162_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 2] = f_163_;
			((Class115_Sub1) this).aFloatArrayArray9283[0][i + 3] = f_164_;
			((Class115_Sub1) this).aBoolArray9285[0] = true;
		}
		if (i_165_ >= 0) {
			i_165_ *= 4;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_165_ + 0] = f;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_165_ + 1] = f_162_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_165_ + 2] = f_163_;
			((Class115_Sub1) this).aFloatArrayArray9283[1][i_165_ + 3] = f_164_;
			((Class115_Sub1) this).aBoolArray9285[1] = true;
		}
	}

	void method1896(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14163(i);
		((Class115_Sub1) this).aClass505_Sub2_Sub2_9293.method14035(interface30);
	}
}
