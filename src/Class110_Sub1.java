/* Class110_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class110_Sub1 extends Class110 {
	static float[] aFloatArray8591 = new float[16];
	long aLong8592;
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_8593;
	boolean[] aBooleanArray8594;
	byte[] aByteArray8595;
	boolean aBoolean8596 = false;
	long aLong8597;
	byte[] aByteArray8598;
	static int anInt8599 = 0;
	static int anInt8600 = 1;
	float[][] aFloatArrayArray8601 = new float[2][];
	Class123_Sub1 aClass123_Sub1_8602;

	void method1206(int i, float f, float f_0_, float f_1_) {
		int i_2_ = i >> 16;
		int i_3_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_2_][i_3_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_2_][i_3_ + 1] = f_0_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_2_][i_3_ + 2] = f_1_;
		((Class110_Sub1) this).aBooleanArray8594[i_2_] = true;
	}

	Class110_Sub1(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class108 class108) {
		((Class110_Sub1) this).aBooleanArray8594 = new boolean[2];
		aString6402 = class108.aString1317;
		if (class108.aString1316 != null) {
			aString6400 = class108.aString1316;
			((Class110_Sub1) this).aByteArray8595 = class_ra_sub3_sub2.method5549(aString6400);
		}
		if (class108.aString1318 != null) {
			aString6401 = class108.aString1318;
			((Class110_Sub1) this).aByteArray8598 = class_ra_sub3_sub2.method5549(aString6401);
		}
		class_ra_sub3_sub2.method5323(this);
	}

	void method1183(Class298_Sub31_Sub1 class298_sub31_sub1, float f) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_4_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if ((class298_sub31_sub1.method3118(-1063269058) != Class100.aClass100_977) && (class298_sub31_sub1.method3118(409974303) != Class100.aClass100_1023))
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i] = f;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_4_ >= 0) {
			i_4_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_4_] = f;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1176(Class298_Sub31_Sub1 class298_sub31_sub1, float f) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_5_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if ((class298_sub31_sub1.method3118(-1090776718) != Class100.aClass100_977) && (class298_sub31_sub1.method3118(956470989) != Class100.aClass100_1023))
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i] = f;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_5_ >= 0) {
			i_5_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_5_] = f;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1161(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_6_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_7_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1803935344) != Class100.aClass100_1049)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_6_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_7_ >= 0) {
			i_7_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_7_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_7_ + 1] = f_6_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1228() {
		if (((Class110_Sub1) this).aLong8597 != 0L) {
			((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5552(((Class110_Sub1) this).aLong8597);
			((Class110_Sub1) this).aLong8597 = 0L;
		}
		if (((Class110_Sub1) this).aLong8592 != 0L) {
			((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5552(((Class110_Sub1) this).aLong8592);
			((Class110_Sub1) this).aLong8592 = 0L;
		}
	}

	void method1192(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_8_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(1027907149) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_8_ >= 0)
			method1230(i_8_, class233.method2150(aFloatArray8591), 8);
	}

	void method1174(int i, int i_9_, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i_9_);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1166(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_10_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(974168980) != Class100.aClass100_996)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2161(aFloatArray8591), 16);
		if (i_10_ >= 0)
			method1230(i_10_, class233.method2161(aFloatArray8591), 16);
	}

	void method1164(Class298_Sub31_Sub1 class298_sub31_sub1, float[] fs, int i) {
		int i_11_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_12_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-603785931) != Class100.aClass100_1076)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i_11_ >= 0)
			method1231(i_11_, fs, i);
		if (i_12_ >= 0)
			method1230(i_12_, fs, i);
	}

	void method1167(Class298_Sub31_Sub1 class298_sub31_sub1, int i, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1168(int i, float f, float f_13_, float f_14_) {
		int i_15_ = i >> 16;
		int i_16_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_15_][i_16_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_15_][i_16_ + 1] = f_13_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_15_][i_16_ + 2] = f_14_;
		((Class110_Sub1) this).aBooleanArray8594[i_15_] = true;
	}

	void method1169(int i, float f, float f_17_, float f_18_, float f_19_) {
		int i_20_ = i >> 16;
		int i_21_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_20_][i_21_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_20_][i_21_ + 1] = f_17_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_20_][i_21_ + 2] = f_18_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_20_][i_21_ + 3] = f_19_;
		((Class110_Sub1) this).aBooleanArray8594[i_20_] = true;
	}

	Class110_Sub1(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class123_Sub1 class123_sub1, Class108 class108) {
		this(class_ra_sub3_sub2, class108);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593 = class_ra_sub3_sub2;
		((Class110_Sub1) this).aClass123_Sub1_8602 = class123_sub1;
	}

	void method1159(int i, Matrix4f class233) {
		int i_22_ = i >> 16;
		int i_23_ = (i & 0xffff) * 4;
		System.arraycopy(class233.method2150(aFloatArray8591), 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_22_], i_23_, 8);
		((Class110_Sub1) this).aBooleanArray8594[i_22_] = true;
	}

	void method1173(int i, Matrix4f class233) {
		int i_24_ = i >> 16;
		int i_25_ = (i & 0xffff) * 4;
		System.arraycopy(class233.method2161(aFloatArray8591), 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_24_], i_25_, 16);
		((Class110_Sub1) this).aBooleanArray8594[i_24_] = true;
	}

	void method1229() {
		if (((Class110_Sub1) this).aBooleanArray8594[0]) {
			for (int i = 0; i < ((Class110_Sub1) this).aFloatArrayArray8601[0].length; i++)
				((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.anUnsafe8219.putFloat((((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.aLong8217 + (long) (i * 4)), ((Class110_Sub1) this).aFloatArrayArray8601[0][i]);
			IDirect3DDevice.SetVertexShaderConstantF(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, 0, ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.aLong8217, ((Class110_Sub1) this).aFloatArrayArray8601[0].length / 4);
			((Class110_Sub1) this).aBooleanArray8594[0] = false;
		}
		if (((Class110_Sub1) this).aBooleanArray8594[1]) {
			for (int i = 0; i < ((Class110_Sub1) this).aFloatArrayArray8601[1].length; i++)
				((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.anUnsafe8219.putFloat((((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.aLong8217 + (long) (i * 4)), ((Class110_Sub1) this).aFloatArrayArray8601[1][i]);
			IDirect3DDevice.SetPixelShaderConstantF(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, 0, ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.aLong8217, ((Class110_Sub1) this).aFloatArrayArray8601[1].length / 4);
			((Class110_Sub1) this).aBooleanArray8594[1] = false;
		}
	}

	void method1187(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_26_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-648960412) != Class100.aClass100_996)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2161(aFloatArray8591), 16);
		if (i_26_ >= 0)
			method1230(i_26_, class233.method2161(aFloatArray8591), 16);
	}

	final void method1230(int i, float[] fs, int i_27_) {
		Class425.method5739(fs, 0, ((Class110_Sub1) this).aFloatArrayArray8601[1], i * 4, i_27_);
		((Class110_Sub1) this).aBooleanArray8594[1] = true;
	}

	public void b() {
		if (((Class110_Sub1) this).aLong8597 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8597);
			((Class110_Sub1) this).aLong8597 = 0L;
		}
		if (((Class110_Sub1) this).aLong8592 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8592);
			((Class110_Sub1) this).aLong8592 = 0L;
		}
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5293(this);
	}

	public void u() {
		if (((Class110_Sub1) this).aLong8597 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8597);
			((Class110_Sub1) this).aLong8597 = 0L;
		}
		if (((Class110_Sub1) this).aLong8592 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8592);
			((Class110_Sub1) this).aLong8592 = 0L;
		}
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5293(this);
	}

	void method1197(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_28_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-979479099) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_28_ >= 0)
			method1230(i_28_, class233.method2150(aFloatArray8591), 8);
	}

	void method1170(int i, float[] fs, int i_29_) {
		int i_30_ = i >> 16;
		int i_31_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_30_], i_31_, i_29_);
		((Class110_Sub1) this).aBooleanArray8594[i_30_] = true;
	}

	void method1177(Class298_Sub31_Sub1 class298_sub31_sub1, float[] fs, int i) {
		int i_32_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_33_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1056858806) != Class100.aClass100_1076)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i_32_ >= 0)
			method1231(i_32_, fs, i);
		if (i_33_ >= 0)
			method1230(i_33_, fs, i);
	}

	public void d() {
		if (((Class110_Sub1) this).aLong8597 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8597);
			((Class110_Sub1) this).aLong8597 = 0L;
		}
		if (((Class110_Sub1) this).aLong8592 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8592);
			((Class110_Sub1) this).aLong8592 = 0L;
		}
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5293(this);
	}

	void method1194(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_34_, float f_35_, float f_36_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_37_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(1032139609) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_34_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_35_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_36_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_37_ >= 0) {
			i_37_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_37_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_37_ + 1] = f_34_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_37_ + 2] = f_35_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_37_ + 3] = f_36_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	public void x() {
		if (((Class110_Sub1) this).aLong8597 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8597);
			((Class110_Sub1) this).aLong8597 = 0L;
		}
		if (((Class110_Sub1) this).aLong8592 != 0L) {
			IUnknown.Release(((Class110_Sub1) this).aLong8592);
			((Class110_Sub1) this).aLong8592 = 0L;
		}
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5293(this);
	}

	public boolean method1209() {
		if (((Class110_Sub1) this).aBoolean8596)
			return true;
		((Class110_Sub1) this).aLong8597 = (((Class110_Sub1) this).aByteArray8595 == null ? 0L : (IDirect3DDevice.CreateVertexShader(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, ((Class110_Sub1) this).aByteArray8595)));
		((Class110_Sub1) this).aLong8592 = (((Class110_Sub1) this).aByteArray8598 == null ? 0L : (IDirect3DDevice.CreatePixelShader(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, ((Class110_Sub1) this).aByteArray8598)));
		if (((Class110_Sub1) this).aLong8597 == 0L && ((Class110_Sub1) this).aLong8592 == 0L)
			return false;
		int i = -1;
		for (int i_38_ = 0; i_38_ < ((Class110_Sub1) this).aClass123_Sub1_8602.method1328(-1467018991); i_38_++) {
			if (((Class110_Sub1) this).aClass123_Sub1_8602.method1369(i_38_, 1821569575) == this) {
				i = i_38_;
				break;
			}
		}
		int i_39_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1323(133923918);
		int i_40_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1350((byte) -91);
		for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class110_Sub1) this).aClass123_Sub1_8602.method1352(i_41_, 444661617);
			class298_sub31_sub1.method3124(i);
		}
		for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class110_Sub1) this).aClass123_Sub1_8602.method1370(i_42_, 1888215794);
			class298_sub31_sub1.method3124(i);
		}
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1329(this, -180449856);
		for (int i_46_ = 0; i_46_ < i_39_ + i_40_; i_46_++) {
			Class298_Sub31_Sub1_Sub2 class298_sub31_sub1_sub2 = ((Class298_Sub31_Sub1_Sub2) (i_46_ < i_39_ ? ((Class110_Sub1) this).aClass123_Sub1_8602.method1352(i_46_, 444661617) : ((Class110_Sub1) this).aClass123_Sub1_8602.method1370(i_46_ - i_39_, 1888215794)));
			Class100 class100 = class298_sub31_sub1_sub2.method3118(-2138623189);
			int i_47_ = 1;
			if (class100 == Class100.aClass100_1076) {
				class100 = class298_sub31_sub1_sub2.method3122(-1110226130);
				i_47_ = class298_sub31_sub1_sub2.method3120(67648031);
			}
			switch (class100.anInt1072 * -1254304775) {
			case 2:
			case 13:
			case 111:
			case 122:
				i_47_ *= 2;
				break;
			case 25:
			case 28:
			case 29:
			case 87:
				i_47_ *= 3;
				break;
			case 1:
			case 80:
			case 82:
			case 104:
				break;
			default:
				i_47_ = 0;
				break;
			case 15:
			case 31:
			case 77:
			case 91:
				i_47_ *= 4;
			}
			if ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9995[i_45_]) >= 0) {
				int i_48_ = ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9995[i_45_]) + i_47_);
				if (i_43_ < i_48_)
					i_43_ = i_48_;
			}
			if ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9997[i_45_]) >= 0) {
				int i_49_ = ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9997[i_45_]) + i_47_);
				if (i_44_ < i_49_)
					i_44_ = i_49_;
			}
		}
		((Class110_Sub1) this).aFloatArrayArray8601[0] = new float[i_43_ * 4];
		((Class110_Sub1) this).aFloatArrayArray8601[1] = new float[i_44_ * 4];
		((Class110_Sub1) this).aBoolean8596 = true;
		return true;
	}

	public boolean method1180() {
		if (((Class110_Sub1) this).aBoolean8596)
			return true;
		((Class110_Sub1) this).aLong8597 = (((Class110_Sub1) this).aByteArray8595 == null ? 0L : (IDirect3DDevice.CreateVertexShader(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, ((Class110_Sub1) this).aByteArray8595)));
		((Class110_Sub1) this).aLong8592 = (((Class110_Sub1) this).aByteArray8598 == null ? 0L : (IDirect3DDevice.CreatePixelShader(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, ((Class110_Sub1) this).aByteArray8598)));
		if (((Class110_Sub1) this).aLong8597 == 0L && ((Class110_Sub1) this).aLong8592 == 0L)
			return false;
		int i = -1;
		for (int i_50_ = 0; i_50_ < ((Class110_Sub1) this).aClass123_Sub1_8602.method1328(-1467018991); i_50_++) {
			if (((Class110_Sub1) this).aClass123_Sub1_8602.method1369(i_50_, 2080771859) == this) {
				i = i_50_;
				break;
			}
		}
		int i_51_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1323(278153909);
		int i_52_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1350((byte) -124);
		for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class110_Sub1) this).aClass123_Sub1_8602.method1352(i_53_, 444661617);
			class298_sub31_sub1.method3124(i);
		}
		for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class110_Sub1) this).aClass123_Sub1_8602.method1370(i_54_, 1888215794);
			class298_sub31_sub1.method3124(i);
		}
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1329(this, -180449856);
		for (int i_58_ = 0; i_58_ < i_51_ + i_52_; i_58_++) {
			Class298_Sub31_Sub1_Sub2 class298_sub31_sub1_sub2 = ((Class298_Sub31_Sub1_Sub2) (i_58_ < i_51_ ? ((Class110_Sub1) this).aClass123_Sub1_8602.method1352(i_58_, 444661617) : ((Class110_Sub1) this).aClass123_Sub1_8602.method1370(i_58_ - i_51_, 1888215794)));
			Class100 class100 = class298_sub31_sub1_sub2.method3118(226045819);
			int i_59_ = 1;
			if (class100 == Class100.aClass100_1076) {
				class100 = class298_sub31_sub1_sub2.method3122(-1840299126);
				i_59_ = class298_sub31_sub1_sub2.method3120(67648031);
			}
			switch (class100.anInt1072 * -1254304775) {
			case 2:
			case 13:
			case 111:
			case 122:
				i_59_ *= 2;
				break;
			case 25:
			case 28:
			case 29:
			case 87:
				i_59_ *= 3;
				break;
			case 1:
			case 80:
			case 82:
			case 104:
				break;
			default:
				i_59_ = 0;
				break;
			case 15:
			case 31:
			case 77:
			case 91:
				i_59_ *= 4;
			}
			if ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9995[i_57_]) >= 0) {
				int i_60_ = ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9995[i_57_]) + i_59_);
				if (i_55_ < i_60_)
					i_55_ = i_60_;
			}
			if ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9997[i_57_]) >= 0) {
				int i_61_ = ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9997[i_57_]) + i_59_);
				if (i_56_ < i_61_)
					i_56_ = i_61_;
			}
		}
		((Class110_Sub1) this).aFloatArrayArray8601[0] = new float[i_55_ * 4];
		((Class110_Sub1) this).aFloatArrayArray8601[1] = new float[i_56_ * 4];
		((Class110_Sub1) this).aBoolean8596 = true;
		return true;
	}

	void method1181(Class298_Sub31_Sub1 class298_sub31_sub1, float f) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_62_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if ((class298_sub31_sub1.method3118(-1979696183) != Class100.aClass100_977) && (class298_sub31_sub1.method3118(-196021409) != Class100.aClass100_1023))
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i] = f;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_62_ >= 0) {
			i_62_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_62_] = f;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1205(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_63_, float f_64_, float f_65_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_66_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1361950712) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_63_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_64_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_65_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_66_ >= 0) {
			i_66_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_66_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_66_ + 1] = f_63_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_66_ + 2] = f_64_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_66_ + 3] = f_65_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1219(int i, float f, float f_67_, float f_68_) {
		int i_69_ = i >> 16;
		int i_70_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_69_][i_70_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_69_][i_70_ + 1] = f_67_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_69_][i_70_ + 2] = f_68_;
		((Class110_Sub1) this).aBooleanArray8594[i_69_] = true;
	}

	void method1207(Class298_Sub31_Sub1 class298_sub31_sub1, float f) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_71_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if ((class298_sub31_sub1.method3118(-1298917022) != Class100.aClass100_977) && (class298_sub31_sub1.method3118(-1343105912) != Class100.aClass100_1023))
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i] = f;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_71_ >= 0) {
			i_71_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_71_] = f;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1191(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_72_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_73_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1615360178) != Class100.aClass100_1049)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_72_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_73_ >= 0) {
			i_73_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_73_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_73_ + 1] = f_72_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1185(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_74_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_75_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(1033983981) != Class100.aClass100_1049)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_74_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_75_ >= 0) {
			i_75_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_75_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_75_ + 1] = f_74_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1186(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_76_, float f_77_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_78_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-553928016) != Class100.aClass100_995)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_76_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_77_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_78_ >= 0) {
			i_78_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_78_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_78_ + 1] = f_76_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_78_ + 2] = f_77_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1188(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_79_, float f_80_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_81_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-697203048) != Class100.aClass100_995)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_79_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_80_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_81_ >= 0) {
			i_81_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_81_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_81_ + 1] = f_79_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_81_ + 2] = f_80_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1179(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_82_, float f_83_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_84_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1244714914) != Class100.aClass100_995)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_82_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_83_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_84_ >= 0) {
			i_84_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_84_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_84_ + 1] = f_82_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_84_ + 2] = f_83_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1208(Class298_Sub31_Sub1 class298_sub31_sub1, int i, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1165(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_85_, float f_86_, float f_87_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_88_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(1106960406) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_85_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_86_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_87_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_88_ >= 0) {
			i_88_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_88_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_88_ + 1] = f_85_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_88_ + 2] = f_86_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_88_ + 3] = f_87_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1178(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_89_, float f_90_, float f_91_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_92_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-475332723) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_89_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_90_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_91_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_92_ >= 0) {
			i_92_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_92_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_92_ + 1] = f_89_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_92_ + 2] = f_90_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_92_ + 3] = f_91_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1193(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_93_, float f_94_, float f_95_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_96_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(239396827) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_93_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_94_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_95_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_96_ >= 0) {
			i_96_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_96_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_96_ + 1] = f_93_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_96_ + 2] = f_94_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_96_ + 3] = f_95_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1199(int i, int i_97_, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i_97_);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1211(int i, float f, float f_98_, float f_99_) {
		int i_100_ = i >> 16;
		int i_101_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_100_][i_101_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_100_][i_101_ + 1] = f_98_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_100_][i_101_ + 2] = f_99_;
		((Class110_Sub1) this).aBooleanArray8594[i_100_] = true;
	}

	void method1196(Class298_Sub31_Sub1 class298_sub31_sub1, float[] fs, int i) {
		int i_102_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_103_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1246208906) != Class100.aClass100_1076)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i_102_ >= 0)
			method1231(i_102_, fs, i);
		if (i_103_ >= 0)
			method1230(i_103_, fs, i);
	}

	void method1190(Class298_Sub31_Sub1 class298_sub31_sub1, float f) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_104_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(740951808) != Class100.aClass100_977 && (class298_sub31_sub1.method3118(926014118) != Class100.aClass100_1023))
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i] = f;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_104_ >= 0) {
			i_104_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_104_] = f;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1215(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_105_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1684307951) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_105_ >= 0)
			method1230(i_105_, class233.method2150(aFloatArray8591), 8);
	}

	void method1200(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_106_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(938636550) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_106_ >= 0)
			method1230(i_106_, class233.method2150(aFloatArray8591), 8);
	}

	void method1216(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_107_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(140548894) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_107_ >= 0)
			method1230(i_107_, class233.method2150(aFloatArray8591), 8);
	}

	void method1162(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_108_, float f_109_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_110_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1928021635) != Class100.aClass100_995)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_108_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_109_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_110_ >= 0) {
			i_110_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_110_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_110_ + 1] = f_108_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_110_ + 2] = f_109_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	void method1171(int i, Matrix4f class233) {
		int i_111_ = i >> 16;
		int i_112_ = (i & 0xffff) * 4;
		System.arraycopy(class233.method2161(aFloatArray8591), 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_111_], i_112_, 12);
		((Class110_Sub1) this).aBooleanArray8594[i_111_] = true;
	}

	void method1203(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_113_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-66230128) != Class100.aClass100_996)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2161(aFloatArray8591), 16);
		if (i_113_ >= 0)
			method1230(i_113_, class233.method2161(aFloatArray8591), 16);
	}

	void method1204(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_114_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(851136988) != Class100.aClass100_996)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2161(aFloatArray8591), 16);
		if (i_114_ >= 0)
			method1230(i_114_, class233.method2161(aFloatArray8591), 16);
	}

	void method1198(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_115_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(115706075) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_115_ >= 0)
			method1230(i_115_, class233.method2150(aFloatArray8591), 8);
	}

	void method1184(Class298_Sub31_Sub1 class298_sub31_sub1, int i, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1212(Class298_Sub31_Sub1 class298_sub31_sub1, int i, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1213(int i, float f, float f_116_, float f_117_) {
		int i_118_ = i >> 16;
		int i_119_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_118_][i_119_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_118_][i_119_ + 1] = f_116_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_118_][i_119_ + 2] = f_117_;
		((Class110_Sub1) this).aBooleanArray8594[i_118_] = true;
	}

	void method1195(int i, float f, float f_120_, float f_121_) {
		int i_122_ = i >> 16;
		int i_123_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_122_][i_123_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_122_][i_123_ + 1] = f_120_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_122_][i_123_ + 2] = f_121_;
		((Class110_Sub1) this).aBooleanArray8594[i_122_] = true;
	}

	void method1210(int i, float f, float f_124_, float f_125_) {
		int i_126_ = i >> 16;
		int i_127_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_126_][i_127_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_126_][i_127_ + 1] = f_124_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_126_][i_127_ + 2] = f_125_;
		((Class110_Sub1) this).aBooleanArray8594[i_126_] = true;
	}

	final void method1231(int i, float[] fs, int i_128_) {
		Class425.method5739(fs, 0, ((Class110_Sub1) this).aFloatArrayArray8601[0], i * 4, i_128_);
		((Class110_Sub1) this).aBooleanArray8594[0] = true;
	}

	void method1189(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_129_, float f_130_, float f_131_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_132_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(788971213) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_129_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_130_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_131_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_132_ >= 0) {
			i_132_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_132_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_132_ + 1] = f_129_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_132_ + 2] = f_130_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_132_ + 3] = f_131_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}

	public boolean method1221() {
		if (((Class110_Sub1) this).aBoolean8596)
			return true;
		((Class110_Sub1) this).aLong8597 = (((Class110_Sub1) this).aByteArray8595 == null ? 0L : (IDirect3DDevice.CreateVertexShader(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, ((Class110_Sub1) this).aByteArray8595)));
		((Class110_Sub1) this).aLong8592 = (((Class110_Sub1) this).aByteArray8598 == null ? 0L : (IDirect3DDevice.CreatePixelShader(((Class_ra_Sub3_Sub2) ((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593).aLong9847, ((Class110_Sub1) this).aByteArray8598)));
		if (((Class110_Sub1) this).aLong8597 == 0L && ((Class110_Sub1) this).aLong8592 == 0L)
			return false;
		int i = -1;
		for (int i_133_ = 0; i_133_ < ((Class110_Sub1) this).aClass123_Sub1_8602.method1328(-1467018991); i_133_++) {
			if (((Class110_Sub1) this).aClass123_Sub1_8602.method1369(i_133_, 1470064186) == this) {
				i = i_133_;
				break;
			}
		}
		int i_134_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1323(718541068);
		int i_135_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1350((byte) -77);
		for (int i_136_ = 0; i_136_ < i_134_; i_136_++) {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class110_Sub1) this).aClass123_Sub1_8602.method1352(i_136_, 444661617);
			class298_sub31_sub1.method3124(i);
		}
		for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class110_Sub1) this).aClass123_Sub1_8602.method1370(i_137_, 1888215794);
			class298_sub31_sub1.method3124(i);
		}
		int i_138_ = 0;
		int i_139_ = 0;
		int i_140_ = ((Class110_Sub1) this).aClass123_Sub1_8602.method1329(this, -180449856);
		for (int i_141_ = 0; i_141_ < i_134_ + i_135_; i_141_++) {
			Class298_Sub31_Sub1_Sub2 class298_sub31_sub1_sub2 = ((Class298_Sub31_Sub1_Sub2) (i_141_ < i_134_ ? ((Class110_Sub1) this).aClass123_Sub1_8602.method1352(i_141_, 444661617) : ((Class110_Sub1) this).aClass123_Sub1_8602.method1370(i_141_ - i_134_, 1888215794)));
			Class100 class100 = class298_sub31_sub1_sub2.method3118(-1943776793);
			int i_142_ = 1;
			if (class100 == Class100.aClass100_1076) {
				class100 = class298_sub31_sub1_sub2.method3122(-682657979);
				i_142_ = class298_sub31_sub1_sub2.method3120(67648031);
			}
			switch (class100.anInt1072 * -1254304775) {
			case 2:
			case 13:
			case 111:
			case 122:
				i_142_ *= 2;
				break;
			case 25:
			case 28:
			case 29:
			case 87:
				i_142_ *= 3;
				break;
			case 1:
			case 80:
			case 82:
			case 104:
				break;
			default:
				i_142_ = 0;
				break;
			case 15:
			case 31:
			case 77:
			case 91:
				i_142_ *= 4;
			}
			if ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9995[i_140_]) >= 0) {
				int i_143_ = ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9995[i_140_]) + i_142_);
				if (i_138_ < i_143_)
					i_138_ = i_143_;
			}
			if ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9997[i_140_]) >= 0) {
				int i_144_ = ((((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1_sub2).anIntArray9997[i_140_]) + i_142_);
				if (i_139_ < i_144_)
					i_139_ = i_144_;
			}
		}
		((Class110_Sub1) this).aFloatArrayArray8601[0] = new float[i_138_ * 4];
		((Class110_Sub1) this).aFloatArrayArray8601[1] = new float[i_139_ * 4];
		((Class110_Sub1) this).aBoolean8596 = true;
		return true;
	}

	void method1202(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_145_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-1417347445) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_145_ >= 0)
			method1230(i_145_, class233.method2150(aFloatArray8591), 8);
	}

	void method1214(int i, float[] fs, int i_146_) {
		int i_147_ = i >> 16;
		int i_148_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_147_], i_148_, i_146_);
		((Class110_Sub1) this).aBooleanArray8594[i_147_] = true;
	}

	void method1182(int i, float[] fs, int i_149_) {
		int i_150_ = i >> 16;
		int i_151_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_150_], i_151_, i_149_);
		((Class110_Sub1) this).aBooleanArray8594[i_150_] = true;
	}

	void method1172(int i, Matrix4f class233) {
		int i_152_ = i >> 16;
		int i_153_ = (i & 0xffff) * 4;
		System.arraycopy(class233.method2161(aFloatArray8591), 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_152_], i_153_, 12);
		((Class110_Sub1) this).aBooleanArray8594[i_152_] = true;
	}

	void method1175(int i, Matrix4f class233) {
		int i_154_ = i >> 16;
		int i_155_ = (i & 0xffff) * 4;
		System.arraycopy(class233.method2150(aFloatArray8591), 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_154_], i_155_, 8);
		((Class110_Sub1) this).aBooleanArray8594[i_154_] = true;
	}

	void method1217(int i, Matrix4f class233) {
		int i_156_ = i >> 16;
		int i_157_ = (i & 0xffff) * 4;
		System.arraycopy(class233.method2161(aFloatArray8591), 0, ((Class110_Sub1) this).aFloatArrayArray8601[i_156_], i_157_, 16);
		((Class110_Sub1) this).aBooleanArray8594[i_156_] = true;
	}

	void method1218(int i, int i_158_, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i_158_);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1158(int i, int i_159_, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i_159_);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1201(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_160_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-42583724) != Class100.aClass100_963)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0)
			method1231(i, class233.method2150(aFloatArray8591), 8);
		if (i_160_ >= 0)
			method1230(i_160_, class233.method2150(aFloatArray8591), 8);
	}

	void method1222(int i, float f, float f_161_, float f_162_, float f_163_) {
		int i_164_ = i >> 16;
		int i_165_ = (i & 0xffff) * 4;
		((Class110_Sub1) this).aFloatArrayArray8601[i_164_][i_165_] = f;
		((Class110_Sub1) this).aFloatArrayArray8601[i_164_][i_165_ + 1] = f_161_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_164_][i_165_ + 2] = f_162_;
		((Class110_Sub1) this).aFloatArrayArray8601[i_164_][i_165_ + 3] = f_163_;
		((Class110_Sub1) this).aBooleanArray8594[i_164_] = true;
	}

	void method1220(int i, int i_166_, Interface9 interface9) {
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5357(i_166_);
		((Class110_Sub1) this).aClass_ra_Sub3_Sub2_8593.method5358(interface9);
	}

	void method1163(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_167_, float f_168_, float f_169_) {
		int i = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3127();
		int i_170_ = ((Class298_Sub31_Sub1_Sub2) class298_sub31_sub1).method3126();
		if (class298_sub31_sub1.method3118(-895076841) != Class100.aClass100_1001)
			throw new IllegalArgumentException_Sub1(class298_sub31_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 1] = f_167_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 2] = f_168_;
			((Class110_Sub1) this).aFloatArrayArray8601[0][i + 3] = f_169_;
			((Class110_Sub1) this).aBooleanArray8594[0] = true;
		}
		if (i_170_ >= 0) {
			i_170_ *= 4;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_170_ + 0] = f;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_170_ + 1] = f_167_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_170_ + 2] = f_168_;
			((Class110_Sub1) this).aFloatArrayArray8601[1][i_170_ + 3] = f_169_;
			((Class110_Sub1) this).aBooleanArray8594[1] = true;
		}
	}
}
