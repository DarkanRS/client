/* Class_ra_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class_ra_Sub1 extends GraphicsToolkit {
	int[] anIntArray7967;
	int anInt7968;
	int anInt7969;
	Class348 aClass348_7970;
	int anInt7971;
	int anInt7972;
	float[] aFloatArray7973;
	int anInt7974;
	Class348 aClass348_7975;
	int anInt7976;
	int anInt7977;
	int anInt7978;
	int anInt7979;
	int anInt7980;
	int anInt7981;
	int anInt7982;
	int anInt7983;
	Matrix3f aClass222_7984;
	boolean aBoolean7985 = false;
	Matrix4f aClass233_7986;
	Matrix4f aClass233_7987;
	float[][] aFloatArrayArray7988;
	int anInt7989;
	int anInt7990;
	int anInt7991;
	Class57 aClass57_7992;
	float aFloat7993;
	boolean aBoolean7994 = false;
	float aFloat7995;
	float aFloat7996;
	float aFloat7997;
	int anInt7998;
	int anInt7999;
	Matrix4f aClass233_8000;
	Class15[] aClass15Array8001;
	int anInt8002;
	boolean aBoolean8003;
	float aFloat8004;
	float aFloat8005;
	int anInt8006;

	public void m(int i, float f, float f_0_, float f_1_, float f_2_, float f_3_) {
		((Class_ra_Sub1) this).anInt7998 = (int) (f * 65535.0F) * 295067571;
		((Class_ra_Sub1) this).anInt7982 = -2064023785 * (int) (f_0_ * 65535.0F);
		float f_4_ = (float) Math.sqrt((double) (f_2_ * f_2_ + f_1_ * f_1_ + f_3_ * f_3_));
		((Class_ra_Sub1) this).anInt7978 = (int) (f_1_ * 65535.0F / f_4_) * -666627277;
		((Class_ra_Sub1) this).anInt7979 = (int) (65535.0F * f_2_ / f_4_) * 1031065997;
		((Class_ra_Sub1) this).anInt7981 = 1231602687 * (int) (f_3_ * 65535.0F / f_4_);
	}
	
	public void method5042_cp(Class69 class69, al ccat, int ci, int ca) {
		method5203(null != ((Class_ra_Sub1) this).anIntArray7967,
				((Class_ra_Sub1) this).aFloatArray7973 != null, false, class69);
	}

	Class_ra_Sub1(Interface_ma interface_ma) {
		super(interface_ma);
		((Class_ra_Sub1) this).anInt7974 = 0;
		((Class_ra_Sub1) this).anInt7991 = 0;
		((Class_ra_Sub1) this).anInt7976 = 0;
		((Class_ra_Sub1) this).anInt7977 = 0;
		((Class_ra_Sub1) this).anInt7998 = 324258125;
		((Class_ra_Sub1) this).anInt7982 = 740517758;
		((Class_ra_Sub1) this).anInt7983 = -1151176370;
		((Class_ra_Sub1) this).aFloatArrayArray7988 = new float[6][4];
		((Class_ra_Sub1) this).aFloat7997 = 1.0F;
		((Class_ra_Sub1) this).aFloat8004 = 0.0F;
		((Class_ra_Sub1) this).anInt8002 = -169217664;
		((Class_ra_Sub1) this).aBoolean8003 = false;
		((Class_ra_Sub1) this).aClass348_7970 = new Class348(16);
		((Class_ra_Sub1) this).anInt8006 = -2116530773;
		try {
			((Class_ra_Sub1) this).aClass348_7975 = new Class348(256);
			((Class_ra_Sub1) this).aClass222_7984 = new Matrix3f();
			((Class_ra_Sub1) this).aClass233_8000 = new Matrix4f();
			((Class_ra_Sub1) this).aClass233_7986 = new Matrix4f();
			((Class_ra_Sub1) this).aClass233_7987 = new Matrix4f();
			method5210(1);
			method5201(0);
			Class374_Sub1.method4640(true, true, -162450455);
			((Class_ra_Sub1) this).aBoolean7994 = true;
			((Class_ra_Sub1) this).anInt7968 = (int) Class122.method1319((byte) 1) * -1260974911;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method5136(2022818790);
			throw new RuntimeException("");
		}
	}

	void method4989(int i, int i_5_) throws Exception_Sub1 {
		aClass52_Sub2_5312.method581(i, i_5_);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(-119853711);
	}

	public void hb(int i) {
		/* empty */
	}

	void method5023() {
		if (((Class_ra_Sub1) this).aBoolean7994) {
			Class216.method2000(true, false, (short) 7077);
			((Class_ra_Sub1) this).aBoolean7994 = false;
		}
		((Class_ra_Sub1) this).aBoolean7985 = true;
	}

	public Class264 method5114(Class505 class505, Class89[] class89s, boolean bool) {
		int[] is = new int[class89s.length];
		int[] is_6_ = new int[class89s.length];
		boolean bool_7_ = false;
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].anInt812;
			is_6_[i] = class89s[i].anInt816;
			if (class89s[i].aByteArray819 != null)
				bool_7_ = true;
		}
		if (bool) {
			if (bool_7_)
				return new Class264_Sub2(this, class505, class89s, is, is_6_);
			return new Class264_Sub4(this, class505, class89s, is, is_6_);
		}
		if (bool_7_)
			throw new IllegalArgumentException("");
		return new Class264_Sub1(this, class505, class89s, is, is_6_);
	}

	boolean method5196() {
		return ((Class_ra_Sub1) this).aBoolean7985;
	}

	int[] method5197(int i) {
		Class298_Sub4 class298_sub4;
		synchronized (((Class_ra_Sub1) this).aClass348_7975) {
			class298_sub4 = ((Class298_Sub4) ((Class_ra_Sub1) this).aClass348_7975.method4184((long) i | ~0x7fffffffffffffffL));
			if (class298_sub4 == null) {
				if (!anInterface_ma5299.method170(i, (short) 2824)) {
					int[] is = null;
					return is;
				}
				Class53 class53 = anInterface_ma5299.method174(i, 2098775003);
				int i_8_ = ((class53.aBoolean518 || ((Class_ra_Sub1) this).aBoolean8003) ? 64 : 1107560907 * ((Class_ra_Sub1) this).anInt8002);
				class298_sub4 = new Class298_Sub4(i, i_8_, anInterface_ma5299.method172(i, 0.7F, i_8_, i_8_, true, (byte) 2), 1 != -2138060883 * class53.anInt528);
				((Class_ra_Sub1) this).aClass348_7975.method4194(class298_sub4, (long) i | ~0x7fffffffffffffffL);
			}
		}
		((Class298_Sub4) class298_sub4).aBoolean7189 = true;
		return class298_sub4.method2854();
	}

	public int method5135(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		int i_14_ = 0;
		float f = ((float) i_10_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_9_) + ((float) i * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14]))));
		float f_15_ = (((float) i_13_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_12_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (float) i_11_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]))));
		float f_16_ = (((float) i * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_9_) + (float) i_10_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]));
		float f_17_ = (((float) i_11_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_12_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * (float) i_13_));
		if (f < -f_16_ && f_15_ < -f_17_)
			i_14_ |= 0x10;
		else if (f > f_16_ && f_15_ > f_17_)
			i_14_ |= 0x20;
		float f_18_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_9_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * (float) i)) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_10_));
		float f_19_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_13_) + (((float) i_11_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_12_)));
		if (f_18_ < -f_16_ && f_19_ < -f_17_)
			i_14_ |= 0x1;
		if (f_18_ > f_16_ && f_19_ > f_17_)
			i_14_ |= 0x2;
		float f_20_ = (((float) i_9_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * (float) i) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_10_));
		float f_21_ = (((float) i_11_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13] + ((float) i_12_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_13_));
		if (f_20_ < -f_16_ && f_21_ < -f_17_)
			i_14_ |= 0x4;
		if (f_20_ > f_16_ && f_21_ > f_17_)
			i_14_ |= 0x8;
		return i_14_;
	}

	public void method5089(int i, Class78 class78) {
		Class15 class15 = method5202(Thread.currentThread());
		((Class15) class15).anInt196 = 1450505545 * i;
		((Class15) class15).anInt184 = -1634857629 * class78.anInt726;
		((Class15) class15).anInt215 = -296597081 * class78.anInt725;
	}

	public void hv(int i, int i_22_, int i_23_) {
		for (int i_24_ = 0; i_24_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_24_++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i_24_];
			((Class15) class15).anInt184 = 1903335279 * (i & 0xffffff);
			int i_25_ = 688695183 * ((Class15) class15).anInt184 >>> 16 & 0xff;
			if (i_25_ < 2)
				i_25_ = 2;
			int i_26_ = 688695183 * ((Class15) class15).anInt184 >> 8 & 0xff;
			if (i_26_ < 2)
				i_26_ = 2;
			int i_27_ = ((Class15) class15).anInt184 * 688695183 & 0xff;
			if (i_27_ < 2)
				i_27_ = 2;
			((Class15) class15).anInt184 = (i_25_ << 16 | i_26_ << 8 | i_27_) * 1903335279;
			if (i_22_ < 0)
				((Class15) class15).aBoolean216 = false;
			else
				((Class15) class15).aBoolean216 = true;
		}
	}

	public void ey(float f, float f_28_) {
		((Class_ra_Sub1) this).aFloat7997 = f_28_ - f;
		((Class_ra_Sub1) this).aFloat8004 = f_28_ + f - 1.0F;
		for (int i = 0; i < ((Class_ra_Sub1) this).anInt7999 * -922307687; i++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i];
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aFloat46 = ((Class_ra_Sub1) this).aFloat7997;
			((Class2) class2).aFloat27 = ((Class_ra_Sub1) this).aFloat8004;
		}
	}

	public boolean method5001() {
		return false;
	}

	public void fy(int i, int i_29_) {
		if ((i & 0x1) != 0)
			B(0, 0, 692106883 * ((Class_ra_Sub1) this).anInt7971, ((Class_ra_Sub1) this).anInt7972 * 918677455, i_29_, 0);
		if ((i & 0x2) != 0)
			method5198();
	}

	public boolean method4995() {
		return true;
	}

	public boolean method5050() {
		return false;
	}

	public boolean method4996() {
		return false;
	}

	public boolean method5082() {
		return false;
	}

	public boolean method5032() {
		return false;
	}

	public boolean method5144() {
		return false;
	}

	public boolean method4998() {
		return false;
	}

	public boolean method5051() {
		return true;
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	Class52_Sub2 method5006(Canvas canvas, int i, int i_30_) {
		return IsaacCipher.method5919(this, canvas, i, i_30_, -1465343898);
	}

	public void method4997(int i, Class298_Sub10[] class298_sub10s) {
		/* empty */
	}

	public void hj(int i, int i_31_, int i_32_) {
		for (int i_33_ = 0; i_33_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_33_++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i_33_];
			((Class15) class15).anInt184 = 1903335279 * (i & 0xffffff);
			int i_34_ = 688695183 * ((Class15) class15).anInt184 >>> 16 & 0xff;
			if (i_34_ < 2)
				i_34_ = 2;
			int i_35_ = 688695183 * ((Class15) class15).anInt184 >> 8 & 0xff;
			if (i_35_ < 2)
				i_35_ = 2;
			int i_36_ = ((Class15) class15).anInt184 * 688695183 & 0xff;
			if (i_36_ < 2)
				i_36_ = 2;
			((Class15) class15).anInt184 = (i_34_ << 16 | i_35_ << 8 | i_36_) * 1903335279;
			if (i_31_ < 0)
				((Class15) class15).aBoolean216 = false;
			else
				((Class15) class15).aBoolean216 = true;
		}
	}

	public void method5000(int[] is) {
		is[0] = 692106883 * ((Class_ra_Sub1) this).anInt7971;
		is[1] = ((Class_ra_Sub1) this).anInt7972 * 918677455;
	}

	void method5198() {
		if (null != ((Class_ra_Sub1) this).aFloatArray7973) {
			if (0 == -912871679 * ((Class_ra_Sub1) this).anInt7974 && (((Class_ra_Sub1) this).anInt7991 * -1416794725 == ((Class_ra_Sub1) this).anInt7971 * 692106883) && -1278653805 * ((Class_ra_Sub1) this).anInt7976 == 0 && (63686679 * ((Class_ra_Sub1) this).anInt7977 == 918677455 * ((Class_ra_Sub1) this).anInt7972)) {
				int i = ((Class_ra_Sub1) this).aFloatArray7973.length;
				int i_37_ = i - (i & 0x7);
				int i_38_ = 0;
				while (i_38_ < i_37_) {
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
				}
				while (i_38_ < i)
					((Class_ra_Sub1) this).aFloatArray7973[i_38_++] = 2.14748365E9F;
			} else {
				int i = (((Class_ra_Sub1) this).anInt7991 * -1416794725 - ((Class_ra_Sub1) this).anInt7974 * -912871679);
				int i_39_ = (((Class_ra_Sub1) this).anInt7977 * 63686679 - -1278653805 * ((Class_ra_Sub1) this).anInt7976);
				int i_40_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 - i;
				int i_41_ = ((-1278653805 * ((Class_ra_Sub1) this).anInt7976 * (692106883 * ((Class_ra_Sub1) this).anInt7971)) + ((Class_ra_Sub1) this).anInt7974 * -912871679);
				int i_42_ = i >> 3;
				int i_43_ = i & 0x7;
				i = i_41_ - 1;
				for (int i_44_ = -i_39_; i_44_ < 0; i_44_++) {
					if (i_42_ > 0) {
						int i_45_ = i_42_;
						do {
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
						} while (--i_45_ > 0);
					}
					if (i_43_ > 0) {
						int i_46_ = i_43_;
						do
							((Class_ra_Sub1) this).aFloatArray7973[++i] = 2.14748365E9F;
						while (--i_46_ > 0);
					}
					i += i_40_;
				}
			}
		}
	}

	public void RA(boolean bool) {
		Class15 class15 = method5202(Thread.currentThread());
		((Class15) class15).aBoolean207 = bool;
	}

	public void method5011() {
		((Class_ra_Sub1) this).anInt7989 = 0;
		((Class_ra_Sub1) this).anInt7990 = 0;
		((Class_ra_Sub1) this).anInt7980 = 845086741 * ((Class_ra_Sub1) this).anInt7971;
		((Class_ra_Sub1) this).anInt7969 = -1768491203 * ((Class_ra_Sub1) this).anInt7972;
		method5209();
	}

	public void method5112() {
		/* empty */
	}

	public void GA(float f, float f_47_) {
		((Class_ra_Sub1) this).aFloat7997 = f_47_ - f;
		((Class_ra_Sub1) this).aFloat8004 = f_47_ + f - 1.0F;
		for (int i = 0; i < ((Class_ra_Sub1) this).anInt7999 * -922307687; i++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i];
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aFloat46 = ((Class_ra_Sub1) this).aFloat7997;
			((Class2) class2).aFloat27 = ((Class_ra_Sub1) this).aFloat8004;
		}
	}

	public void er(int[] is) {
		is[0] = -912871679 * ((Class_ra_Sub1) this).anInt7974;
		is[1] = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
		is[2] = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
		is[3] = ((Class_ra_Sub1) this).anInt7977 * 63686679;
	}

	public void L() {
		((Class_ra_Sub1) this).anInt7974 = 0;
		((Class_ra_Sub1) this).anInt7976 = 0;
		((Class_ra_Sub1) this).anInt7991 = 2046188857 * ((Class_ra_Sub1) this).anInt7971;
		((Class_ra_Sub1) this).anInt7977 = -482117367 * ((Class_ra_Sub1) this).anInt7972;
		method5209();
	}

	public void r(int i, int i_48_, int i_49_, int i_50_) {
		if (i < 0)
			i = 0;
		if (i_48_ < 0)
			i_48_ = 0;
		if (i_49_ > 692106883 * ((Class_ra_Sub1) this).anInt7971)
			i_49_ = 692106883 * ((Class_ra_Sub1) this).anInt7971;
		if (i_50_ > ((Class_ra_Sub1) this).anInt7972 * 918677455)
			i_50_ = 918677455 * ((Class_ra_Sub1) this).anInt7972;
		((Class_ra_Sub1) this).anInt7974 = i * -1291169535;
		((Class_ra_Sub1) this).anInt7991 = i_49_ * -1912131437;
		((Class_ra_Sub1) this).anInt7976 = i_48_ * 104031131;
		((Class_ra_Sub1) this).anInt7977 = 1656090535 * i_50_;
		method5209();
	}

	public int method5024(int i, int i_51_) {
		i |= 0x20800;
		return i & i_51_ ^ i_51_;
	}

	boolean method5199(int i) {
		if (((Class_ra_Sub1) this).aBoolean8003 || anInterface_ma5299.method174(i, 507704159).aBoolean518)
			return true;
		return false;
	}

	public void XA(int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i_52_ >= -1278653805 * ((Class_ra_Sub1) this).anInt7976 && i_52_ < 63686679 * ((Class_ra_Sub1) this).anInt7977)) {
			if (i < -912871679 * ((Class_ra_Sub1) this).anInt7974) {
				i_53_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
			}
			if (i + i_53_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
				i_53_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - i;
			int i_56_ = i + 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_52_;
			int i_57_ = i_54_ >>> 24;
			if (i_55_ == 0 || i_55_ == 1 && i_57_ == 255) {
				for (int i_58_ = 0; i_58_ < i_53_; i_58_++)
					((Class_ra_Sub1) this).anIntArray7967[i_56_ + i_58_] = i_54_;
			} else if (i_55_ == 1) {
				i_54_ = (i_57_ << 24) + (((i_54_ & 0xff00) * i_57_ >> 8 & 0xff00) + (i_57_ * (i_54_ & 0xff00ff) >> 8 & 0xff00ff));
				int i_59_ = 256 - i_57_;
				for (int i_60_ = 0; i_60_ < i_53_; i_60_++) {
					int i_61_ = ((Class_ra_Sub1) this).anIntArray7967[i_60_ + i_56_];
					i_61_ = ((i_59_ * (i_61_ & 0xff00) >> 8 & 0xff00) + (i_59_ * (i_61_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub1) this).anIntArray7967[i_60_ + i_56_] = i_54_ + i_61_;
				}
			} else if (i_55_ == 2) {
				for (int i_62_ = 0; i_62_ < i_53_; i_62_++) {
					int i_63_ = ((Class_ra_Sub1) this).anIntArray7967[i_56_ + i_62_];
					int i_64_ = i_54_ + i_63_;
					int i_65_ = (i_63_ & 0xff00ff) + (i_54_ & 0xff00ff);
					i_63_ = (i_65_ & 0x1000100) + (i_64_ - i_65_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_56_ + i_62_] = i_64_ - i_63_ | i_63_ - (i_63_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method5019(int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		XA(i, i_66_, i_67_, i_69_, i_70_);
		XA(i, i_68_ + i_66_ - 1, i_67_, i_69_, i_70_);
		G(i, 1 + i_66_, i_68_ - 2, i_69_, i_70_);
		G(i + i_67_ - 1, 1 + i_66_, i_68_ - 2, i_69_, i_70_);
	}

	public void B(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
				i_72_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
			}
			if (i_71_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976) {
				i_73_ -= -1278653805 * ((Class_ra_Sub1) this).anInt7976 - i_71_;
				i_71_ = -1278653805 * ((Class_ra_Sub1) this).anInt7976;
			}
			if (i + i_72_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
				i_72_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - i;
			if (i_73_ + i_71_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_73_ = 63686679 * ((Class_ra_Sub1) this).anInt7977 - i_71_;
			if (i_72_ > 0 && i_73_ > 0 && i <= ((Class_ra_Sub1) this).anInt7991 * -1416794725 && i_71_ <= ((Class_ra_Sub1) this).anInt7977 * 63686679) {
				int i_76_ = ((Class_ra_Sub1) this).anInt7971 * 692106883 - i_72_;
				int i_77_ = (i_71_ * (((Class_ra_Sub1) this).anInt7971 * 692106883) + i);
				int i_78_ = i_74_ >>> 24;
				if (0 == i_75_ || i_75_ == 1 && 255 == i_78_) {
					int i_79_ = i_72_ >> 3;
					int i_80_ = i_72_ & 0x7;
					i_72_ = i_77_ - 1;
					for (int i_81_ = -i_73_; i_81_ < 0; i_81_++) {
						if (i_79_ > 0) {
							i = i_79_;
							do {
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
							} while (--i > 0);
						}
						if (i_80_ > 0) {
							i = i_80_;
							do
								((Class_ra_Sub1) this).anIntArray7967[++i_72_] = i_74_;
							while (--i > 0);
						}
						i_72_ += i_76_;
					}
				} else if (1 == i_75_) {
					i_74_ = ((i_78_ * (i_74_ & 0xff00ff) >> 8 & 0xff00ff) + (i_78_ * ((i_74_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_82_ = 256 - i_78_;
					for (int i_83_ = 0; i_83_ < i_73_; i_83_++) {
						for (int i_84_ = -i_72_; i_84_ < 0; i_84_++) {
							int i_85_ = ((Class_ra_Sub1) this).anIntArray7967[i_77_];
							i_85_ = (((i_85_ & 0xff00ff) * i_82_ >> 8 & 0xff00ff) + (i_82_ * ((i_85_ & ~0xff00ff) >>> 8) & ~0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[i_77_++] = i_85_ + i_74_;
						}
						i_77_ += i_76_;
					}
				} else if (i_75_ == 2) {
					for (int i_86_ = 0; i_86_ < i_73_; i_86_++) {
						for (int i_87_ = -i_72_; i_87_ < 0; i_87_++) {
							int i_88_ = ((Class_ra_Sub1) this).anIntArray7967[i_77_];
							int i_89_ = i_74_ + i_88_;
							int i_90_ = (i_74_ & 0xff00ff) + (i_88_ & 0xff00ff);
							i_88_ = (i_89_ - i_90_ & 0x10000) + (i_90_ & 0x1000100);
							((Class_ra_Sub1) this).anIntArray7967[i_77_++] = i_89_ - i_88_ | i_88_ - (i_88_ >>> 8);
						}
						i_77_ += i_76_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void N(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, byte[] is, int i_96_, int i_97_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null && (i_92_ > 0 && i_93_ > 0)) {
			int i_98_ = 0;
			int i_99_ = 0;
			int i_100_ = (i_96_ << 16) / i_92_;
			int i_101_ = (is.length / i_96_ << 16) / i_93_;
			int i_102_ = i + i_91_ * (692106883 * ((Class_ra_Sub1) this).anInt7971);
			int i_103_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 - i_92_;
			if (i_93_ + i_91_ > ((Class_ra_Sub1) this).anInt7977 * 63686679)
				i_93_ -= (i_91_ + i_93_ - 63686679 * ((Class_ra_Sub1) this).anInt7977);
			if (i_91_ < ((Class_ra_Sub1) this).anInt7976 * -1278653805) {
				int i_104_ = -1278653805 * ((Class_ra_Sub1) this).anInt7976 - i_91_;
				i_93_ -= i_104_;
				i_102_ += i_104_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
				i_99_ += i_104_ * i_101_;
			}
			if (i + i_92_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991) {
				int i_105_ = (i + i_92_ - ((Class_ra_Sub1) this).anInt7991 * -1416794725);
				i_92_ -= i_105_;
				i_103_ += i_105_;
			}
			if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
				int i_106_ = -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i_92_ -= i_106_;
				i_102_ += i_106_;
				i_98_ += i_100_ * i_106_;
				i_103_ += i_106_;
			}
			int i_107_ = i_94_ >>> 24;
			int i_108_ = i_95_ >>> 24;
			if (0 == i_97_ || 1 == i_97_ && i_107_ == 255 && i_108_ == 255) {
				int i_109_ = i_98_;
				for (int i_110_ = -i_93_; i_110_ < 0; i_110_++) {
					int i_111_ = (i_99_ >> 16) * i_96_;
					for (int i_112_ = -i_92_; i_112_ < 0; i_112_++) {
						if (is[(i_98_ >> 16) + i_111_] != 0)
							((Class_ra_Sub1) this).anIntArray7967[i_102_++] = i_95_;
						else
							((Class_ra_Sub1) this).anIntArray7967[i_102_++] = i_94_;
						i_98_ += i_100_;
					}
					i_99_ += i_101_;
					i_98_ = i_109_;
					i_102_ += i_103_;
				}
			} else if (1 == i_97_) {
				int i_113_ = i_98_;
				for (int i_114_ = -i_93_; i_114_ < 0; i_114_++) {
					int i_115_ = (i_99_ >> 16) * i_96_;
					for (int i_116_ = -i_92_; i_116_ < 0; i_116_++) {
						int i_117_ = i_94_;
						if (is[(i_98_ >> 16) + i_115_] != 0)
							i_117_ = i_95_;
						int i_118_ = i_117_ >>> 24;
						int i_119_ = 255 - i_118_;
						int i_120_ = ((Class_ra_Sub1) this).anIntArray7967[i_102_];
						((Class_ra_Sub1) this).anIntArray7967[i_102_++] = (((i_118_ * (i_117_ & 0xff00) + (i_120_ & 0xff00) * i_119_) & 0xff0000) + (((i_120_ & 0xff00ff) * i_119_ + (i_117_ & 0xff00ff) * i_118_) & ~0xff00ff)) >> 8;
						i_98_ += i_100_;
					}
					i_99_ += i_101_;
					i_98_ = i_113_;
					i_102_ += i_103_;
				}
			} else if (i_97_ == 2) {
				int i_121_ = i_98_;
				for (int i_122_ = -i_93_; i_122_ < 0; i_122_++) {
					int i_123_ = i_96_ * (i_99_ >> 16);
					for (int i_124_ = -i_92_; i_124_ < 0; i_124_++) {
						int i_125_ = i_94_;
						if (is[(i_98_ >> 16) + i_123_] != 0)
							i_125_ = i_95_;
						if (i_125_ != 0) {
							int i_126_ = (((Class_ra_Sub1) this).anIntArray7967[i_102_]);
							int i_127_ = i_126_ + i_125_;
							int i_128_ = (i_126_ & 0xff00ff) + (i_125_ & 0xff00ff);
							i_126_ = (i_128_ & 0x1000100) + (i_127_ - i_128_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_102_++] = i_127_ - i_126_ | i_126_ - (i_126_ >>> 8);
						} else
							i_102_++;
						i_98_ += i_100_;
					}
					i_99_ += i_101_;
					i_98_ = i_121_;
					i_102_ += i_103_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void CA(int i, int i_129_, int i_130_, int i_131_, int i_132_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			if (i_130_ < 0)
				i_130_ = -i_130_;
			int i_133_ = i_129_ - i_130_;
			if (i_133_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976)
				i_133_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			int i_134_ = i_130_ + i_129_ + 1;
			if (i_134_ > ((Class_ra_Sub1) this).anInt7977 * 63686679)
				i_134_ = 63686679 * ((Class_ra_Sub1) this).anInt7977;
			int i_135_ = i_133_;
			int i_136_ = i_130_ * i_130_;
			int i_137_ = 0;
			int i_138_ = i_129_ - i_135_;
			int i_139_ = i_138_ * i_138_;
			int i_140_ = i_139_ - i_138_;
			if (i_129_ > i_134_)
				i_129_ = i_134_;
			int i_141_ = i_131_ >>> 24;
			if (0 == i_132_ || i_132_ == 1 && i_141_ == 255) {
				while (i_135_ < i_129_) {
					for (/**/; i_140_ <= i_136_ || i_139_ <= i_136_; i_140_ += i_137_++ + i_137_)
						i_139_ += i_137_ + i_137_;
					int i_142_ = i - i_137_ + 1;
					if (i_142_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_142_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_143_ = i_137_ + i;
					if (i_143_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_143_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_144_ = i_142_ + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_135_);
					for (int i_145_ = i_142_; i_145_ < i_143_; i_145_++)
						((Class_ra_Sub1) this).anIntArray7967[i_144_++] = i_131_;
					i_135_++;
					i_139_ -= i_138_-- + i_138_;
					i_140_ -= i_138_ + i_138_;
				}
				i_137_ = i_130_;
				i_138_ = i_135_ - i_129_;
				i_140_ = i_138_ * i_138_ + i_136_;
				i_139_ = i_140_ - i_137_;
				i_140_ -= i_138_;
				while (i_135_ < i_134_) {
					for (/**/; i_140_ > i_136_ && i_139_ > i_136_; i_139_ -= i_137_ + i_137_)
						i_140_ -= i_137_-- + i_137_;
					int i_146_ = i - i_137_;
					if (i_146_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_146_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_147_ = i + i_137_;
					if (i_147_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1)
						i_147_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_148_ = (i_135_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_146_);
					for (int i_149_ = i_146_; i_149_ <= i_147_; i_149_++)
						((Class_ra_Sub1) this).anIntArray7967[i_148_++] = i_131_;
					i_135_++;
					i_140_ += i_138_ + i_138_;
					i_139_ += i_138_++ + i_138_;
				}
			} else if (i_132_ == 1) {
				i_131_ = ((i_141_ << 24) + ((i_141_ * (i_131_ & 0xff00ff) >> 8 & 0xff00ff) + (i_141_ * (i_131_ & 0xff00) >> 8 & 0xff00)));
				int i_150_ = 256 - i_141_;
				while (i_135_ < i_129_) {
					for (/**/; i_140_ <= i_136_ || i_139_ <= i_136_; i_140_ += i_137_++ + i_137_)
						i_139_ += i_137_ + i_137_;
					int i_151_ = 1 + (i - i_137_);
					if (i_151_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_151_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_152_ = i + i_137_;
					if (i_152_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_152_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_153_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_135_) + i_151_);
					for (int i_154_ = i_151_; i_154_ < i_152_; i_154_++) {
						int i_155_ = ((Class_ra_Sub1) this).anIntArray7967[i_153_];
						i_155_ = (((i_155_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff) + (i_150_ * (i_155_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_153_++] = i_131_ + i_155_;
					}
					i_135_++;
					i_139_ -= i_138_-- + i_138_;
					i_140_ -= i_138_ + i_138_;
				}
				i_137_ = i_130_;
				i_138_ = -i_138_;
				i_140_ = i_136_ + i_138_ * i_138_;
				i_139_ = i_140_ - i_137_;
				i_140_ -= i_138_;
				while (i_135_ < i_134_) {
					for (/**/; i_140_ > i_136_ && i_139_ > i_136_; i_139_ -= i_137_ + i_137_)
						i_140_ -= i_137_-- + i_137_;
					int i_156_ = i - i_137_;
					if (i_156_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_156_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_157_ = i + i_137_;
					if (i_157_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_157_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_158_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_135_) + i_156_);
					for (int i_159_ = i_156_; i_159_ <= i_157_; i_159_++) {
						int i_160_ = ((Class_ra_Sub1) this).anIntArray7967[i_158_];
						i_160_ = (((i_160_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff) + (i_150_ * (i_160_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_158_++] = i_131_ + i_160_;
					}
					i_135_++;
					i_140_ += i_138_ + i_138_;
					i_139_ += i_138_++ + i_138_;
				}
			} else if (i_132_ == 2) {
				while (i_135_ < i_129_) {
					for (/**/; i_140_ <= i_136_ || i_139_ <= i_136_; i_140_ += i_137_++ + i_137_)
						i_139_ += i_137_ + i_137_;
					int i_161_ = i - i_137_ + 1;
					if (i_161_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_161_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_162_ = i + i_137_;
					if (i_162_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_162_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_163_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_135_) + i_161_);
					for (int i_164_ = i_161_; i_164_ < i_162_; i_164_++) {
						int i_165_ = ((Class_ra_Sub1) this).anIntArray7967[i_163_];
						int i_166_ = i_131_ + i_165_;
						int i_167_ = (i_131_ & 0xff00ff) + (i_165_ & 0xff00ff);
						i_165_ = (i_167_ & 0x1000100) + (i_166_ - i_167_ & 0x10000);
						((Class_ra_Sub1) this).anIntArray7967[i_163_++] = i_166_ - i_165_ | i_165_ - (i_165_ >>> 8);
					}
					i_135_++;
					i_139_ -= i_138_-- + i_138_;
					i_140_ -= i_138_ + i_138_;
				}
				i_137_ = i_130_;
				i_138_ = -i_138_;
				i_140_ = i_138_ * i_138_ + i_136_;
				i_139_ = i_140_ - i_137_;
				i_140_ -= i_138_;
				while (i_135_ < i_134_) {
					for (/**/; i_140_ > i_136_ && i_139_ > i_136_; i_139_ -= i_137_ + i_137_)
						i_140_ -= i_137_-- + i_137_;
					int i_168_ = i - i_137_;
					if (i_168_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_168_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_169_ = i + i_137_;
					if (i_169_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_169_ = (((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1);
					int i_170_ = i_168_ + i_135_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
					for (int i_171_ = i_168_; i_171_ <= i_169_; i_171_++) {
						int i_172_ = ((Class_ra_Sub1) this).anIntArray7967[i_170_];
						int i_173_ = i_172_ + i_131_;
						int i_174_ = (i_172_ & 0xff00ff) + (i_131_ & 0xff00ff);
						i_172_ = (i_173_ - i_174_ & 0x10000) + (i_174_ & 0x1000100);
						((Class_ra_Sub1) this).anIntArray7967[i_170_++] = i_173_ - i_172_ | i_172_ - (i_172_ >>> 8);
					}
					i_135_++;
					i_140_ += i_138_ + i_138_;
					i_139_ += i_138_++ + i_138_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class57 method5108(int i, int i_175_, int i_176_, int i_177_, boolean bool) {
		if (((Class_ra_Sub1) this).anIntArray7967 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_176_ * i_177_];
		int i_178_ = i_175_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i;
		int i_179_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 - i_176_;
		for (int i_180_ = 0; i_180_ < i_177_; i_180_++) {
			int i_181_ = i_176_ * i_180_;
			for (int i_182_ = 0; i_182_ < i_176_; i_182_++)
				is[i_182_ + i_181_] = ((Class_ra_Sub1) this).anIntArray7967[i_178_++];
			i_178_ += i_179_;
		}
		if (bool)
			return new Class57_Sub1_Sub1(this, is, i_176_, i_177_);
		return new Class57_Sub1_Sub2(this, is, i_176_, i_177_);
	}

	public boolean method5077() {
		return false;
	}

	public void G(int i, int i_183_, int i_184_, int i_185_, int i_186_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < ((Class_ra_Sub1) this).anInt7991 * -1416794725)) {
			if (i_183_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976) {
				i_184_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_183_;
				i_183_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			}
			if (i_184_ + i_183_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_184_ = 63686679 * ((Class_ra_Sub1) this).anInt7977 - i_183_;
			int i_187_ = i + i_183_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
			int i_188_ = i_185_ >>> 24;
			if (i_186_ == 0 || 1 == i_186_ && 255 == i_188_) {
				for (int i_189_ = 0; i_189_ < i_184_; i_189_++)
					((Class_ra_Sub1) this).anIntArray7967[i_187_ + i_189_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)] = i_185_;
			} else if (i_186_ == 1) {
				i_185_ = ((i_188_ * (i_185_ & 0xff00) >> 8 & 0xff00) + ((i_185_ & 0xff00ff) * i_188_ >> 8 & 0xff00ff) + (i_188_ << 24));
				int i_190_ = 256 - i_188_;
				for (int i_191_ = 0; i_191_ < i_184_; i_191_++) {
					int i_192_ = (i_191_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_187_);
					int i_193_ = ((Class_ra_Sub1) this).anIntArray7967[i_192_];
					i_193_ = ((i_190_ * (i_193_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_193_ & 0xff00) * i_190_ >> 8 & 0xff00));
					((Class_ra_Sub1) this).anIntArray7967[i_192_] = i_193_ + i_185_;
				}
			} else if (2 == i_186_) {
				for (int i_194_ = 0; i_194_ < i_184_; i_194_++) {
					int i_195_ = (i_194_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_187_);
					int i_196_ = ((Class_ra_Sub1) this).anIntArray7967[i_195_];
					int i_197_ = i_185_ + i_196_;
					int i_198_ = (i_196_ & 0xff00ff) + (i_185_ & 0xff00ff);
					i_196_ = (i_198_ & 0x1000100) + (i_197_ - i_198_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_195_] = i_197_ - i_196_ | i_196_ - (i_196_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method5187(int i, int i_199_, int i_200_, int i_201_) {
		((Class_ra_Sub1) this).anInt7989 = 1021645229 * i;
		((Class_ra_Sub1) this).anInt7990 = i_199_ * 574739315;
		((Class_ra_Sub1) this).anInt7980 = 626158471 * i_200_;
		((Class_ra_Sub1) this).anInt7969 = 370599731 * i_201_;
		method5209();
	}

	public void es(int[] is) {
		is[0] = -912871679 * ((Class_ra_Sub1) this).anInt7974;
		is[1] = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
		is[2] = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
		is[3] = ((Class_ra_Sub1) this).anInt7977 * 63686679;
	}

	public void method5039(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			i_203_ -= i;
			i_204_ -= i_202_;
			if (i_204_ == 0) {
				if (i_203_ >= 0)
					method5217(i, i_202_, 1 + i_203_, i_205_, i_206_, i_207_, i_208_, i_209_);
				else {
					int i_210_ = i_208_ + i_207_;
					i_209_ %= i_210_;
					i_209_ = i_207_ + i_210_ - i_209_ - (1 + -i_203_) % i_210_;
					i_209_ %= i_210_;
					if (i_209_ < 0)
						i_209_ += i_210_;
					method5217(i_203_ + i, i_202_, 1 + -i_203_, i_205_, i_206_, i_207_, i_208_, i_209_);
				}
			} else if (i_203_ == 0) {
				if (i_204_ >= 0)
					method5215(i, i_202_, i_204_ + 1, i_205_, i_206_, i_207_, i_208_, i_209_);
				else {
					int i_211_ = i_208_ + i_207_;
					i_209_ %= i_211_;
					i_209_ = i_207_ + i_211_ - i_209_ - (-i_204_ + 1) % i_211_;
					i_209_ %= i_211_;
					if (i_209_ < 0)
						i_209_ += i_211_;
					method5215(i, i_204_ + i_202_, 1 + -i_204_, i_205_, i_206_, i_207_, i_208_, i_209_);
				}
			} else {
				i_209_ <<= 8;
				i_207_ <<= 8;
				i_208_ <<= 8;
				int i_212_ = i_208_ + i_207_;
				i_209_ %= i_212_;
				if (i_204_ + i_203_ < 0) {
					int i_213_ = (int) (Math.sqrt((double) (i_204_ * i_204_ + i_203_ * i_203_)) * 256.0);
					int i_214_ = i_213_ % i_212_;
					i_209_ = i_212_ + i_207_ - i_209_ - i_214_;
					i_209_ %= i_212_;
					if (i_209_ < 0)
						i_209_ += i_212_;
					i += i_203_;
					i_203_ = -i_203_;
					i_202_ += i_204_;
					i_204_ = -i_204_;
				}
				if (i_203_ > i_204_) {
					i_202_ <<= 16;
					i_202_ += 32768;
					i_204_ <<= 16;
					int i_215_ = (int) Math.floor(0.5 + ((double) i_204_ / (double) i_203_));
					i_203_ += i;
					int i_216_ = i_205_ >>> 24;
					int i_217_ = (int) Math.sqrt((double) (65536 + (i_215_ >> 8) * (i_215_ >> 8)));
					if (0 == i_206_ || 1 == i_206_ && i_216_ == 255) {
						while (i <= i_203_) {
							int i_218_ = i_202_ >> 16;
							if (i >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_218_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_218_ < (((Class_ra_Sub1) this).anInt7977 * 63686679) && i_209_ < i_207_)
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_218_) + i] = i_205_;
							i_202_ += i_215_;
							i++;
							i_209_ += i_217_;
							i_209_ %= i_212_;
						}
					} else if (i_206_ == 1) {
						i_205_ = ((i_216_ << 24) + (((i_205_ & 0xff00) * i_216_ >> 8 & 0xff00) + (i_216_ * (i_205_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_219_ = 256 - i_216_;
						while (i <= i_203_) {
							int i_220_ = i_202_ >> 16;
							if (i >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_220_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_220_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_209_ < i_207_) {
								int i_221_ = i + i_220_ * (692106883 * (((Class_ra_Sub1) this).anInt7971));
								int i_222_ = (((Class_ra_Sub1) this).anIntArray7967[i_221_]);
								i_222_ = (((i_222_ & 0xff00ff) * i_219_ >> 8 & 0xff00ff) + (i_219_ * (i_222_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub1) this).anIntArray7967[i_221_] = i_222_ + i_205_;
							}
							i_202_ += i_215_;
							i++;
							i_209_ += i_217_;
							i_209_ %= i_212_;
						}
					} else if (2 == i_206_) {
						while (i <= i_203_) {
							int i_223_ = i_202_ >> 16;
							if (i >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_223_ >= -1278653805 * ((Class_ra_Sub1) this).anInt7976 && i_223_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_209_ < i_207_) {
								int i_224_ = i + (i_223_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_225_ = (((Class_ra_Sub1) this).anIntArray7967[i_224_]);
								int i_226_ = i_225_ + i_205_;
								int i_227_ = ((i_225_ & 0xff00ff) + (i_205_ & 0xff00ff));
								i_225_ = (i_227_ & 0x1000100) + (i_226_ - i_227_ & 0x10000);
								((Class_ra_Sub1) this).anIntArray7967[i_224_] = i_226_ - i_225_ | i_225_ - (i_225_ >>> 8);
							}
							i_202_ += i_215_;
							i++;
							i_209_ += i_217_;
							i_209_ %= i_212_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_203_ <<= 16;
					int i_228_ = (int) Math.floor((double) i_203_ / (double) i_204_ + 0.5);
					i_204_ += i_202_;
					int i_229_ = i_205_ >>> 24;
					int i_230_ = (int) Math.sqrt((double) ((i_228_ >> 8) * (i_228_ >> 8) + 65536));
					if (i_206_ == 0 || 1 == i_206_ && i_229_ == 255) {
						while (i_202_ <= i_204_) {
							int i_231_ = i >> 16;
							if (i_202_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_202_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_231_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i_231_ < -1416794725 * ((Class_ra_Sub1) this).anInt7991 && i_209_ < i_207_)
								((Class_ra_Sub1) this).anIntArray7967[i_202_ * (((Class_ra_Sub1) this).anInt7971 * 692106883) + i_231_] = i_205_;
							i += i_228_;
							i_202_++;
							i_209_ += i_230_;
							i_209_ %= i_212_;
						}
					} else if (i_206_ == 1) {
						i_205_ = ((i_229_ << 24) + (((i_205_ & 0xff00ff) * i_229_ >> 8 & 0xff00ff) + ((i_205_ & 0xff00) * i_229_ >> 8 & 0xff00)));
						int i_232_ = 256 - i_229_;
						while (i_202_ <= i_204_) {
							int i_233_ = i >> 16;
							if (i_202_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_202_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_233_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i_233_ < -1416794725 * ((Class_ra_Sub1) this).anInt7991 && i_209_ < i_207_) {
								int i_234_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_202_) + i_233_);
								int i_235_ = (((Class_ra_Sub1) this).anIntArray7967[i_234_]);
								i_235_ = ((i_232_ * (i_235_ & 0xff00) >> 8 & 0xff00) + (i_232_ * (i_235_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[(692106883 * ((Class_ra_Sub1) this).anInt7971 * i_202_) + i_233_] = i_205_ + i_235_;
							}
							i += i_228_;
							i_202_++;
							i_209_ += i_230_;
							i_209_ %= i_212_;
						}
					} else if (2 == i_206_) {
						while (i_202_ <= i_204_) {
							int i_236_ = i >> 16;
							if (i_202_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_202_ < (((Class_ra_Sub1) this).anInt7977 * 63686679) && i_236_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i_236_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_209_ < i_207_) {
								int i_237_ = (i_236_ + i_202_ * (692106883 * (((Class_ra_Sub1) this).anInt7971)));
								int i_238_ = (((Class_ra_Sub1) this).anIntArray7967[i_237_]);
								int i_239_ = i_238_ + i_205_;
								int i_240_ = ((i_238_ & 0xff00ff) + (i_205_ & 0xff00ff));
								i_238_ = (i_240_ & 0x1000100) + (i_239_ - i_240_ & 0x10000);
								((Class_ra_Sub1) this).anIntArray7967[i_237_] = i_239_ - i_238_ | i_238_ - (i_238_ >>> 8);
							}
							i += i_228_;
							i_202_++;
							i_209_ += i_230_;
							i_209_ %= i_212_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class58 method4987() {
		return new Class58(0, "Pure Java", 1, "CPU", 0L);
	}

	public void method5007(int i, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, Class_ta class_ta, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_251_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_252_ = (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_247_ ? -1278653805 * ((Class_ra_Sub1) this).anInt7976 : i_247_);
			int i_253_ = ((((Class_ra_Sub1) this).anInt7977 * 63686679 < i_247_ + is.length) ? ((Class_ra_Sub1) this).anInt7977 * 63686679 : i_247_ + is.length);
			i_250_ <<= 8;
			i_248_ <<= 8;
			i_249_ <<= 8;
			int i_254_ = i_248_ + i_249_;
			i_250_ %= i_254_;
			i_242_ -= i;
			i_243_ -= i_241_;
			if (i_243_ + i_242_ < 0) {
				int i_255_ = (int) (Math.sqrt((double) (i_243_ * i_243_ + i_242_ * i_242_)) * 256.0);
				int i_256_ = i_255_ % i_254_;
				i_250_ = i_248_ + i_254_ - i_250_ - i_256_;
				i_250_ %= i_254_;
				if (i_250_ < 0)
					i_250_ += i_254_;
				i += i_242_;
				i_242_ = -i_242_;
				i_241_ += i_243_;
				i_243_ = -i_243_;
			}
			if (i_242_ > i_243_) {
				i_241_ <<= 16;
				i_241_ += 32768;
				i_243_ <<= 16;
				int i_257_ = (int) Math.floor((double) i_243_ / (double) i_242_ + 0.5);
				i_242_ += i;
				int i_258_ = i_244_ >>> 24;
				int i_259_ = (int) Math.sqrt((double) (65536 + (i_257_ >> 8) * (i_257_ >> 8)));
				if (0 == i_245_ || i_245_ == 1 && 255 == i_258_) {
					while (i <= i_242_) {
						int i_260_ = i_241_ >> 16;
						int i_261_ = i_260_ - i_247_;
						if (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_260_ >= i_252_ && i_260_ < i_253_ && i_250_ < i_248_) {
							int i_262_ = is[i_261_] + i_246_;
							if (i >= i_262_ && i < i_262_ + is_251_[i_261_])
								((Class_ra_Sub1) this).anIntArray7967[i + (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_260_)] = i_244_;
						}
						i_241_ += i_257_;
						i++;
						i_250_ += i_259_;
						i_250_ %= i_254_;
					}
				} else if (1 == i_245_) {
					i_244_ = ((i_258_ << 24) + ((i_258_ * (i_244_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_244_ & 0xff00) * i_258_ >> 8 & 0xff00)));
					int i_263_ = 256 - i_258_;
					while (i <= i_242_) {
						int i_264_ = i_241_ >> 16;
						int i_265_ = i_264_ - i_247_;
						if (i >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_264_ >= i_252_ && i_264_ < i_253_ && i_250_ < i_248_) {
							int i_266_ = i_246_ + is[i_265_];
							if (i >= i_266_ && i < is_251_[i_265_] + i_266_) {
								int i_267_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_264_);
								int i_268_ = (((Class_ra_Sub1) this).anIntArray7967[i_267_]);
								i_268_ = ((i_263_ * (i_268_ & 0xff00) >> 8 & 0xff00) + (i_263_ * (i_268_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_267_] = i_268_ + i_244_;
							}
						}
						i_241_ += i_257_;
						i++;
						i_250_ += i_259_;
						i_250_ %= i_254_;
					}
				} else if (i_245_ == 2) {
					while (i <= i_242_) {
						int i_269_ = i_241_ >> 16;
						int i_270_ = i_269_ - i_247_;
						if (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_269_ >= i_252_ && i_269_ < i_253_ && i_250_ < i_248_) {
							int i_271_ = is[i_270_] + i_246_;
							if (i >= i_271_ && i < i_271_ + is_251_[i_270_]) {
								int i_272_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_269_) + i);
								int i_273_ = (((Class_ra_Sub1) this).anIntArray7967[i_272_]);
								int i_274_ = i_244_ + i_273_;
								int i_275_ = ((i_244_ & 0xff00ff) + (i_273_ & 0xff00ff));
								i_273_ = ((i_274_ - i_275_ & 0x10000) + (i_275_ & 0x1000100));
								((Class_ra_Sub1) this).anIntArray7967[i_272_] = i_274_ - i_273_ | i_273_ - (i_273_ >>> 8);
							}
						}
						i_241_ += i_257_;
						i++;
						i_250_ += i_259_;
						i_250_ %= i_254_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_242_ <<= 16;
				int i_276_ = (int) Math.floor(0.5 + ((double) i_242_ / (double) i_243_));
				int i_277_ = (int) Math.sqrt((double) ((i_276_ >> 8) * (i_276_ >> 8) + 65536));
				i_243_ += i_241_;
				int i_278_ = i_244_ >>> 24;
				if (i_245_ == 0 || i_245_ == 1 && i_278_ == 255) {
					while (i_241_ <= i_243_) {
						int i_279_ = i >> 16;
						int i_280_ = i_241_ - i_247_;
						if (i_241_ >= i_252_ && i_241_ < i_253_ && i_279_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_279_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_250_ < i_248_ && i_279_ >= i_246_ + is[i_280_] && i_279_ < is_251_[i_280_] + (i_246_ + is[i_280_]))
							((Class_ra_Sub1) this).anIntArray7967[(i_241_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_279_)] = i_244_;
						i += i_276_;
						i_241_++;
						i_250_ += i_277_;
						i_250_ %= i_254_;
					}
				} else if (1 == i_245_) {
					i_244_ = (((i_244_ & 0xff00ff) * i_278_ >> 8 & 0xff00ff) + ((i_244_ & 0xff00) * i_278_ >> 8 & 0xff00) + (i_278_ << 24));
					int i_281_ = 256 - i_278_;
					while (i_241_ <= i_243_) {
						int i_282_ = i >> 16;
						int i_283_ = i_241_ - i_247_;
						if (i_241_ >= i_252_ && i_241_ < i_253_ && i_282_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_282_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_250_ < i_248_ && i_282_ >= i_246_ + is[i_283_] && (i_282_ < is[i_283_] + i_246_ + is_251_[i_283_])) {
							int i_284_ = (i_282_ + i_241_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
							int i_285_ = (((Class_ra_Sub1) this).anIntArray7967[i_284_]);
							i_285_ = ((i_281_ * (i_285_ & 0xff00) >> 8 & 0xff00) + ((i_285_ & 0xff00ff) * i_281_ >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[(i_282_ + i_241_ * (((Class_ra_Sub1) this).anInt7971 * 692106883))] = i_244_ + i_285_;
						}
						i += i_276_;
						i_241_++;
						i_250_ += i_277_;
						i_250_ %= i_254_;
					}
				} else if (2 == i_245_) {
					while (i_241_ <= i_243_) {
						int i_286_ = i >> 16;
						int i_287_ = i_241_ - i_247_;
						if (i_241_ >= i_252_ && i_241_ < i_253_ && i_286_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_286_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_250_ < i_248_ && i_286_ >= i_246_ + is[i_287_] && (i_286_ < is[i_287_] + i_246_ + is_251_[i_287_])) {
							int i_288_ = (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_241_) + i_286_;
							int i_289_ = (((Class_ra_Sub1) this).anIntArray7967[i_288_]);
							int i_290_ = i_289_ + i_244_;
							int i_291_ = (i_244_ & 0xff00ff) + (i_289_ & 0xff00ff);
							i_289_ = (i_291_ & 0x1000100) + (i_290_ - i_291_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_288_] = i_290_ - i_289_ | i_289_ - (i_289_ >>> 8);
						}
						i += i_276_;
						i_241_++;
						i_250_ += i_277_;
						i_250_ %= i_254_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method4999(int i, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, int i_297_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			int i_298_ = i_293_ - i;
			int i_299_ = i_294_ - i_292_;
			int i_300_ = i_298_ >= 0 ? i_298_ : -i_298_;
			int i_301_ = i_299_ >= 0 ? i_299_ : -i_299_;
			int i_302_ = i_300_;
			if (i_302_ < i_301_)
				i_302_ = i_301_;
			if (0 != i_302_) {
				int i_303_ = (i_298_ << 16) / i_302_;
				int i_304_ = (i_299_ << 16) / i_302_;
				i_298_ += i_303_ >> 16;
				i_299_ += i_304_ >> 16;
				if (i_304_ <= i_303_)
					i_303_ = -i_303_;
				else
					i_304_ = -i_304_;
				int i_305_ = i_304_ * i_296_ >> 17;
				int i_306_ = i_304_ * i_296_ + 1 >> 17;
				int i_307_ = i_303_ * i_296_ >> 17;
				int i_308_ = 1 + i_296_ * i_303_ >> 17;
				i -= class2.method287();
				i_292_ -= class2.method288();
				int i_309_ = i_305_ + i;
				int i_310_ = i - i_306_;
				int i_311_ = i + i_298_ - i_306_;
				int i_312_ = i_305_ + (i + i_298_);
				int i_313_ = i_292_ + i_307_;
				int i_314_ = i_292_ - i_308_;
				int i_315_ = i_299_ + i_292_ - i_308_;
				int i_316_ = i_292_ + i_299_ + i_307_;
				if (i_297_ == 0)
					((Class2) class2).anInt19 = 0;
				else if (i_297_ == 1)
					((Class2) class2).anInt19 = 255 - (i_295_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class2) class2).aBoolean20 = (i_309_ < 0 || i_309_ > ((Class2) class2).anInt22 || i_310_ < 0 || i_310_ > ((Class2) class2).anInt22 || i_311_ < 0 || i_311_ > ((Class2) class2).anInt22);
				class2.method293(true, false, false, (float) i_313_, (float) i_314_, (float) i_315_, (float) i_309_, (float) i_310_, (float) i_311_, 100.0F, 100.0F, 100.0F, i_295_);
				((Class2) class2).aBoolean20 = (i_309_ < 0 || i_309_ > ((Class2) class2).anInt22 || i_311_ < 0 || i_311_ > ((Class2) class2).anInt22 || i_312_ < 0 || i_312_ > ((Class2) class2).anInt22);
				class2.method293(true, false, false, (float) i_313_, (float) i_315_, (float) i_316_, (float) i_309_, (float) i_311_, (float) i_312_, 100.0F, 100.0F, 100.0F, i_295_);
				RA(true);
			}
		}
	}

	boolean method5200(int i) {
		return anInterface_ma5299.method170(i, (short) 19583);
	}

	public Class_v method5026(int i) {
		return null;
	}

	public void method5027(Class_v class_v) {
		/* empty */
	}

	public boolean method5052() {
		return false;
	}

	public Class_ta method5034(int i, int i_317_, int[] is, int[] is_318_) {
		return new Class_ta_Sub2(i, i_317_, is, is_318_);
	}

	public Class66 method5181(int i, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_) {
		return null;
	}

	public Class57 method5033(int i, int i_324_, int i_325_, int i_326_, boolean bool) {
		if (((Class_ra_Sub1) this).anIntArray7967 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_325_ * i_326_];
		int i_327_ = i_324_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i;
		int i_328_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 - i_325_;
		for (int i_329_ = 0; i_329_ < i_326_; i_329_++) {
			int i_330_ = i_325_ * i_329_;
			for (int i_331_ = 0; i_331_ < i_325_; i_331_++)
				is[i_331_ + i_330_] = ((Class_ra_Sub1) this).anIntArray7967[i_327_++];
			i_327_ += i_328_;
		}
		if (bool)
			return new Class57_Sub1_Sub1(this, is, i_325_, i_326_);
		return new Class57_Sub1_Sub2(this, is, i_325_, i_326_);
	}

	public boolean method5146() {
		return false;
	}

	public void DA(int i, Class_ta class_ta, int i_332_, int i_333_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_334_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_335_;
			if (63686679 * ((Class_ra_Sub1) this).anInt7977 < is.length + i_333_)
				i_335_ = ((Class_ra_Sub1) this).anInt7977 * 63686679 - i_333_;
			else
				i_335_ = is.length;
			int i_336_;
			if (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_333_) {
				i_336_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_333_;
				i_333_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			} else
				i_336_ = 0;
			if (i_335_ - i_336_ > 0) {
				int i_337_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_333_;
				for (int i_338_ = i_336_; i_338_ < i_335_; i_338_++) {
					int i_339_ = i_332_ + is[i_338_];
					int i_340_ = is_334_[i_338_];
					if (((Class_ra_Sub1) this).anInt7974 * -912871679 > i_339_) {
						i_340_ -= (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i_339_);
						i_339_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					}
					if (-1416794725 * ((Class_ra_Sub1) this).anInt7991 < i_339_ + i_340_)
						i_340_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - i_339_);
					i_339_ += i_337_;
					for (int i_341_ = -i_340_; i_341_ < 0; i_341_++)
						((Class_ra_Sub1) this).anIntArray7967[i_339_++] = i;
					i_337_ += ((Class_ra_Sub1) this).anInt7971 * 692106883;
				}
			}
		}
	}

	public void method5128(Class69 class69) {
		method5203(null != ((Class_ra_Sub1) this).anIntArray7967, ((Class_ra_Sub1) this).aFloatArray7973 != null, false, class69);
	}

	public Class66 method5185(int i, int i_342_, int i_343_, int i_344_, int i_345_, int i_346_) {
		return null;
	}

	public void hn(int i, int i_347_, int i_348_) {
		for (int i_349_ = 0; i_349_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_349_++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i_349_];
			((Class15) class15).anInt184 = 1903335279 * (i & 0xffffff);
			int i_350_ = 688695183 * ((Class15) class15).anInt184 >>> 16 & 0xff;
			if (i_350_ < 2)
				i_350_ = 2;
			int i_351_ = 688695183 * ((Class15) class15).anInt184 >> 8 & 0xff;
			if (i_351_ < 2)
				i_351_ = 2;
			int i_352_ = ((Class15) class15).anInt184 * 688695183 & 0xff;
			if (i_352_ < 2)
				i_352_ = 2;
			((Class15) class15).anInt184 = (i_350_ << 16 | i_351_ << 8 | i_352_) * 1903335279;
			if (i_347_ < 0)
				((Class15) class15).aBoolean216 = false;
			else
				((Class15) class15).aBoolean216 = true;
		}
	}

	public void method5066() {
		/* empty */
	}

	public int method5004(int i, int i_353_) {
		return i | i_353_;
	}

	public Class_xa method5040(int i, int i_354_, int[][] is, int[][] is_355_, int i_356_, int i_357_, int i_358_) {
		return new Class_xa_Sub2(this, i_357_, i_358_, i, i_354_, is, is_355_, i_356_);
	}

	public Matrix3f method5178() {
		Class15 class15 = method5202(Thread.currentThread());
		return ((Class15) class15).aClass222_219;
	}

	public void method5132(Matrix3f class222) {
		((Class_ra_Sub1) this).aClass222_7984 = class222;
		method5208();
	}

	public Class298_Sub10 method5049(int i, int i_359_, int i_360_, int i_361_, int i_362_, float f) {
		return null;
	}

	public void method5021(int i, Class298_Sub10[] class298_sub10s) {
		/* empty */
	}

	void method5201(int i) {
		((Class_ra_Sub1) this).aClass15Array8001[i].method347(Thread.currentThread(), (byte) -84);
	}

	public boolean method5127() {
		return false;
	}

	Class15 method5202(Runnable runnable) {
		for (int i = 0; i < -922307687 * ((Class_ra_Sub1) this).anInt7999; i++) {
			if ((((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).aRunnable179) == runnable)
				return ((Class_ra_Sub1) this).aClass15Array8001[i];
		}
		return null;
	}

	public void method5042(Class69 class69) {
		method5203(null != ((Class_ra_Sub1) this).anIntArray7967, ((Class_ra_Sub1) this).aFloatArray7973 != null, false, class69);
	}

	void method5203(boolean bool, boolean bool_363_, boolean bool_364_, Class69 class69) {
		Class15 class15 = method5202(Thread.currentThread());
		Class302_Sub3 class302_sub3 = class69.aClass448_680.aClass302_Sub3_5621;
		for (Class302_Sub3 class302_sub3_365_ = class302_sub3.aClass302_Sub3_7650; class302_sub3_365_ != class302_sub3; class302_sub3_365_ = class302_sub3_365_.aClass302_Sub3_7650) {
			Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_365_;
			int i = class302_sub3_sub1.anInt9785 >> 12;
			int i_366_ = class302_sub3_sub1.anInt9789 >> 12;
			int i_367_ = class302_sub3_sub1.anInt9790 >> 12;
			float f = (((float) i * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]) + (float) i_366_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10] * (float) i_367_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14]));
			float f_368_ = (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]) * (float) i_367_ + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7]) * (float) i_366_ + (float) i * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]))));
			if (!(f < -f_368_)) {
				float f_369_ = (((Class_ra_Sub1) this).aFloat7997 * f / f_368_ + ((Class_ra_Sub1) this).aFloat8004);
				if (!(f > ((Class15) class15).aFloat205)) {
					float f_370_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12]) + ((float) i_366_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4]) + (float) i * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]) * (float) i_367_));
					float f_371_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + ((float) i_367_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9]) + ((float) i_366_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1]) * (float) i)));
					if (!(f_370_ < -f_368_) && !(f_370_ > f_368_) && !(f_371_ < -f_368_) && !(f_371_ > f_368_)) {
						float f_372_ = (float) class302_sub3_sub1.anInt9791 / 4096.0F;
						float f_373_ = f_370_ + (((Class_ra_Sub1) this).aClass233_7986.aFloatArray2594[0]) * f_372_;
						float f_374_ = (f_372_ * (((Class_ra_Sub1) this).aClass233_7986.aFloatArray2594[3]) + f_368_);
						float f_375_ = (((Class_ra_Sub1) this).aFloat8005 + (f_370_ * ((Class_ra_Sub1) this).aFloat7993 / f_368_));
						float f_376_ = ((f_371_ * ((Class_ra_Sub1) this).aFloat7995 / f_368_) + ((Class_ra_Sub1) this).aFloat7996);
						float f_377_ = (((Class_ra_Sub1) this).aFloat8005 + (f_373_ * ((Class_ra_Sub1) this).aFloat7993 / f_374_));
						method5204(bool, bool_363_, bool_364_, class302_sub3_sub1, (int) f_375_, (int) f_376_, f_369_, (int) (f_377_ < f_375_ ? f_375_ - f_377_ : f_377_ - f_375_));
					}
				}
			}
		}
	}

	void method5204(boolean bool, boolean bool_378_, boolean bool_379_, Class302_Sub3_Sub1 class302_sub3_sub1, int i, int i_380_, float f, int i_381_) {
		int i_382_ = class302_sub3_sub1.anInt9794;
		int i_383_ = i_381_;
		i_381_ <<= 1;
		if (-1 == i_382_)
			method5219(bool_378_, i, i_380_, f, i_383_, class302_sub3_sub1.flags, 1);
		else {
			if (i_382_ != ((Class_ra_Sub1) this).anInt8006 * -815285507) {
				Class57 class57 = (Class57) ((Class_ra_Sub1) this).aClass348_7970.method4184((long) i_382_);
				if (class57 == null) {
					int[] is = method5197(i_382_);
					if (is != null) {
						int i_384_ = (method5199(i_382_) ? 64 : (1107560907 * ((Class_ra_Sub1) this).anInt8002));
						class57 = method5031(is, 0, i_384_, i_384_, i_384_, 105789167);
						((Class_ra_Sub1) this).aClass348_7970.method4194(class57, (long) i_382_);
					} else
						return;
				}
				((Class_ra_Sub1) this).anInt8006 = 2116530773 * i_382_;
				((Class_ra_Sub1) this).aClass57_7992 = class57;
			}
			i_381_++;
			((Class57_Sub1) ((Class_ra_Sub1) this).aClass57_7992).method678(bool, bool_378_, bool_379_, i - i_383_, i_380_ - i_383_, f, i_381_, i_381_, 0, class302_sub3_sub1.flags, 1, 1, false);
		}
	}

	void method5205(boolean bool, boolean bool_385_, boolean bool_386_, int i, int i_387_, float f, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_) {
		if (i_388_ != 0 && i_389_ != 0) {
			if (i_390_ != 65535) {
				Class53 class53 = anInterface_ma5299.method174(i_390_, 1695034515);
				if (!class53.aBoolean524) {
					if (i_390_ != ((Class_ra_Sub1) this).anInt8006 * -815285507) {
						Class57 class57 = (Class57) ((Class_ra_Sub1) this).aClass348_7970.method4184((long) i_390_);
						if (null == class57) {
							int[] is = method5197(i_390_);
							if (null == is)
								return;
							int i_394_ = (method5199(i_390_) ? 64 : (((Class_ra_Sub1) this).anInt8002 * 1107560907));
							class57 = method5031(is, 0, i_394_, i_394_, i_394_, 2014032256);
							((Class_ra_Sub1) this).aClass348_7970.method4194(class57, (long) i_390_);
						}
						((Class_ra_Sub1) this).anInt8006 = i_390_ * 2116530773;
						((Class_ra_Sub1) this).aClass57_7992 = class57;
					}
					((Class57_Sub1) ((Class_ra_Sub1) this).aClass57_7992).method678(bool, bool_385_, bool_386_, i - i_388_, i_387_ - i_389_, f, i_388_ << 1, i_389_ << 1, i_392_, i_391_, i_393_, 1, -2138060883 * class53.anInt528 != 2);
					return;
				}
			}
			method5219(bool_385_, i, i_387_, f, i_388_, i_391_, i_393_);
		}
	}

	int method5206(int i) {
		return anInterface_ma5299.method174(i, 2099649978).aShort532 & 0xffff;
	}

	void method5207(int i, int i_395_, int[] is, float[] fs) {
		((Class_ra_Sub1) this).anInt7971 = -1336293333 * i;
		((Class_ra_Sub1) this).anInt7972 = i_395_ * -1138901201;
		((Class_ra_Sub1) this).anIntArray7967 = is;
		((Class_ra_Sub1) this).aFloatArray7973 = fs;
		for (int i_396_ = 0; i_396_ < ((Class_ra_Sub1) this).anInt7999 * -922307687; i_396_++)
			((Class_ra_Sub1) this).aClass15Array8001[i_396_].method348(-455629367);
		L();
		method5011();
	}

	public void method5161(float f, float f_397_, float f_398_, float[] fs) {
		float f_399_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * f_398_) + (f * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + f_397_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		float f_400_ = ((f_398_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * f) + f_397_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4])));
		float f_401_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5] * f_397_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * f_398_));
		float f_402_ = (f * ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2] + ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6] * f_397_) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10] * f_398_));
		fs[0] = (f_400_ * ((Class_ra_Sub1) this).aFloat7993 / f_399_ + ((Class_ra_Sub1) this).aFloat8005);
		fs[1] = (((Class_ra_Sub1) this).aFloat7996 + ((Class_ra_Sub1) this).aFloat7995 * f_401_ / f_399_);
		fs[2] = f_402_;
	}

	public void method5182(Matrix4f class233) {
		((Class_ra_Sub1) this).aClass233_7986.method2142(class233);
		method5208();
	}

	public Matrix4f method5045() {
		return new Matrix4f(((Class_ra_Sub1) this).aClass233_7986);
	}

	public void IA(float f) {
		((Class_ra_Sub1) this).anInt7983 = -1954754855 * (int) (65535.0F * f);
	}

	public int method5048() {
		return 0;
	}

	public void J(int i) {
		/* empty */
	}

	public Matrix3f method5008() {
		Class15 class15 = method5202(Thread.currentThread());
		return ((Class15) class15).aClass222_219;
	}

	void method5208() {
		((Class_ra_Sub1) this).aClass233_8000.method2145(((Class_ra_Sub1) this).aClass222_7984);
		((Class_ra_Sub1) this).aClass233_7987.method2142(((Class_ra_Sub1) this).aClass233_8000);
		((Class_ra_Sub1) this).aClass233_7987.method2144(((Class_ra_Sub1) this).aClass233_7986);
		((Class_ra_Sub1) this).aClass233_7987.method2157(((Class_ra_Sub1) this).aFloatArrayArray7988[0]);
		((Class_ra_Sub1) this).aClass233_7987.method2158(((Class_ra_Sub1) this).aFloatArrayArray7988[1]);
		((Class_ra_Sub1) this).aClass233_7987.method2156(((Class_ra_Sub1) this).aFloatArrayArray7988[2]);
		((Class_ra_Sub1) this).aClass233_7987.method2170(((Class_ra_Sub1) this).aFloatArrayArray7988[3]);
		((Class_ra_Sub1) this).aClass233_7987.method2171(((Class_ra_Sub1) this).aFloatArrayArray7988[4]);
		((Class_ra_Sub1) this).aClass233_7987.method2163(((Class_ra_Sub1) this).aFloatArrayArray7988[5]);
		float f = ((Class_ra_Sub1) this).aClass233_7986.method2155();
		float f_403_ = ((((Class_ra_Sub1) this).aClass233_7986.aFloatArray2594[10] * (f - 255.0F)) + ((Class_ra_Sub1) this).aClass233_7986.aFloatArray2594[14]);
		float f_404_ = (((Class_ra_Sub1) this).aClass233_7986.aFloatArray2594[10] * f + ((Class_ra_Sub1) this).aClass233_7986.aFloatArray2594[14]);
		float f_405_ = f_404_ - f_403_;
		for (int i = 0; i < -922307687 * ((Class_ra_Sub1) this).anInt7999; i++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i];
			((Class15) class15).aFloat205 = f_403_;
			((Class15) class15).aFloat183 = f_405_;
		}
	}

	public void method5043(Matrix3f class222) {
		((Class_ra_Sub1) this).aClass222_7984 = class222;
		method5208();
	}

	public int[] ev(int i, int i_406_, int i_407_, int i_408_) {
		if (null == ((Class_ra_Sub1) this).anIntArray7967)
			throw new IllegalStateException("");
		int[] is = new int[i_407_ * i_408_];
		int i_409_ = 0;
		for (int i_410_ = 0; i_410_ < i_408_; i_410_++) {
			int i_411_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * (i_406_ + i_410_));
			for (int i_412_ = 0; i_412_ < i_407_; i_412_++)
				is[i_409_++] = ((Class_ra_Sub1) this).anIntArray7967[i_412_ + i_411_];
		}
		return is;
	}

	public void method5095(Class66 class66) {
		/* empty */
	}

	void method5209() {
		int i = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - ((Class_ra_Sub1) this).anInt7974 * -912871679);
		int i_413_ = (((Class_ra_Sub1) this).anInt7977 * 63686679 - -1278653805 * ((Class_ra_Sub1) this).anInt7976);
		float f = (((Class_ra_Sub1) this).aFloat7993 = ((float) (-1840027081 * ((Class_ra_Sub1) this).anInt7980) / 2.0F));
		float f_414_ = (((Class_ra_Sub1) this).aFloat7995 = (float) (((Class_ra_Sub1) this).anInt7969 * 1936944123) / 2.0F);
		((Class_ra_Sub1) this).aFloat8005 = f + (float) (((Class_ra_Sub1) this).anInt7989 * 1767406117);
		((Class_ra_Sub1) this).aFloat7996 = f_414_ + (float) (-457799237 * ((Class_ra_Sub1) this).anInt7990);
		for (int i_415_ = 0; i_415_ < -922307687 * ((Class_ra_Sub1) this).anInt7999; i_415_++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i_415_];
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aFloat17 = f;
			((Class2) class2).aFloat26 = f_414_;
			((Class2) class2).aFloat23 = (((Class_ra_Sub1) this).aFloat8005 - (float) (-912871679 * ((Class_ra_Sub1) this).anInt7974));
			((Class2) class2).aFloat25 = (((Class_ra_Sub1) this).aFloat7996 - (float) (-1278653805 * ((Class_ra_Sub1) this).anInt7976));
			((Class2) class2).anInt22 = i;
			((Class2) class2).anInt38 = i_413_;
		}
		int i_416_ = ((-1278653805 * ((Class_ra_Sub1) this).anInt7976 * (((Class_ra_Sub1) this).anInt7971 * 692106883)) + -912871679 * ((Class_ra_Sub1) this).anInt7974);
		for (int i_417_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805; i_417_ < 63686679 * ((Class_ra_Sub1) this).anInt7977; i_417_++) {
			for (int i_418_ = 0; i_418_ < -922307687 * ((Class_ra_Sub1) this).anInt7999; i_418_++)
				((Class2) ((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i_418_])).aClass2_192).anIntArray47[i_417_ - ((Class_ra_Sub1) this).anInt7976 * -1278653805] = i_416_;
			i_416_ += 692106883 * ((Class_ra_Sub1) this).anInt7971;
		}
	}

	public void method5053() {
		/* empty */
	}

	public boolean method5054() {
		return false;
	}

	public void method5022(int i, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, Class_ta class_ta, int i_424_, int i_425_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_426_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_427_ = (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_425_ ? ((Class_ra_Sub1) this).anInt7976 * -1278653805 : i_425_);
			int i_428_ = ((63686679 * ((Class_ra_Sub1) this).anInt7977 < i_425_ + is.length) ? 63686679 * ((Class_ra_Sub1) this).anInt7977 : i_425_ + is.length);
			i_420_ -= i;
			i_421_ -= i_419_;
			if (i_420_ + i_421_ < 0) {
				i += i_420_;
				i_420_ = -i_420_;
				i_419_ += i_421_;
				i_421_ = -i_421_;
			}
			if (i_420_ > i_421_) {
				i_419_ <<= 16;
				i_419_ += 32768;
				i_421_ <<= 16;
				int i_429_ = (int) Math.floor(0.5 + ((double) i_421_ / (double) i_420_));
				i_420_ += i;
				if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
					i_419_ += (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i) * i_429_;
					i = -912871679 * ((Class_ra_Sub1) this).anInt7974;
				}
				if (i_420_ >= -1416794725 * ((Class_ra_Sub1) this).anInt7991)
					i_420_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1;
				int i_430_ = i_422_ >>> 24;
				if (0 == i_423_ || i_423_ == 1 && 255 == i_430_) {
					for (/**/; i <= i_420_; i++) {
						int i_431_ = i_419_ >> 16;
						int i_432_ = i_431_ - i_425_;
						if (i_431_ >= i_427_ && i_431_ < i_428_) {
							int i_433_ = is[i_432_] + i_424_;
							if (i >= i_433_ && i < is_426_[i_432_] + i_433_)
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_431_) + i] = i_422_;
						}
						i_419_ += i_429_;
					}
				} else if (1 == i_423_) {
					i_422_ = ((i_430_ << 24) + ((i_430_ * (i_422_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_422_ & 0xff00) * i_430_ >> 8 & 0xff00)));
					int i_434_ = 256 - i_430_;
					for (/**/; i <= i_420_; i++) {
						int i_435_ = i_419_ >> 16;
						int i_436_ = i_435_ - i_425_;
						if (i_435_ >= i_427_ && i_435_ < i_428_) {
							int i_437_ = is[i_436_] + i_424_;
							if (i >= i_437_ && i < is_426_[i_436_] + i_437_) {
								int i_438_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_435_);
								int i_439_ = (((Class_ra_Sub1) this).anIntArray7967[i_438_]);
								i_439_ = (((i_439_ & 0xff00) * i_434_ >> 8 & 0xff00) + (i_434_ * (i_439_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_438_] = i_439_ + i_422_;
							}
						}
						i_419_ += i_429_;
					}
				} else if (2 == i_423_) {
					for (/**/; i <= i_420_; i++) {
						int i_440_ = i_419_ >> 16;
						int i_441_ = i_440_ - i_425_;
						if (i_440_ >= i_427_ && i_440_ < i_428_) {
							int i_442_ = is[i_441_] + i_424_;
							if (i >= i_442_ && i < i_442_ + is_426_[i_441_]) {
								int i_443_ = i + (i_440_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_444_ = (((Class_ra_Sub1) this).anIntArray7967[i_443_]);
								int i_445_ = i_422_ + i_444_;
								int i_446_ = ((i_422_ & 0xff00ff) + (i_444_ & 0xff00ff));
								i_444_ = (i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000);
								((Class_ra_Sub1) this).anIntArray7967[i_443_] = i_445_ - i_444_ | i_444_ - (i_444_ >>> 8);
							}
						}
						i_419_ += i_429_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_420_ <<= 16;
				int i_447_ = (int) Math.floor((double) i_420_ / (double) i_421_ + 0.5);
				i_421_ += i_419_;
				if (i_419_ < i_427_) {
					i += (i_427_ - i_419_) * i_447_;
					i_419_ = i_427_;
				}
				if (i_421_ >= i_428_)
					i_421_ = i_428_ - 1;
				int i_448_ = i_422_ >>> 24;
				if (i_423_ == 0 || 1 == i_423_ && i_448_ == 255) {
					for (/**/; i_419_ <= i_421_; i_419_++) {
						int i_449_ = i >> 16;
						int i_450_ = i_419_ - i_425_;
						int i_451_ = is[i_450_] + i_424_;
						if ((i_449_ >= ((Class_ra_Sub1) this).anInt7974 * -912871679) && i_449_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_449_ >= i_451_ && i_449_ < is_426_[i_450_] + i_451_)
							((Class_ra_Sub1) this).anIntArray7967[(692106883 * ((Class_ra_Sub1) this).anInt7971 * i_419_) + i_449_] = i_422_;
						i += i_447_;
					}
				} else if (i_423_ == 1) {
					i_422_ = ((i_448_ * (i_422_ & 0xff00ff) >> 8 & 0xff00ff) + (i_448_ * (i_422_ & 0xff00) >> 8 & 0xff00) + (i_448_ << 24));
					int i_452_ = 256 - i_448_;
					for (/**/; i_419_ <= i_421_; i_419_++) {
						int i_453_ = i >> 16;
						int i_454_ = i_419_ - i_425_;
						int i_455_ = i_424_ + is[i_454_];
						if ((i_453_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_453_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_453_ >= i_455_ && i_453_ < is_426_[i_454_] + i_455_) {
							int i_456_ = (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_419_) + i_453_;
							int i_457_ = (((Class_ra_Sub1) this).anIntArray7967[i_456_]);
							i_457_ = (((i_457_ & 0xff00) * i_452_ >> 8 & 0xff00) + (i_452_ * (i_457_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[(i_419_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_453_)] = i_457_ + i_422_;
						}
						i += i_447_;
					}
				} else if (i_423_ == 2) {
					for (/**/; i_419_ <= i_421_; i_419_++) {
						int i_458_ = i >> 16;
						int i_459_ = i_419_ - i_425_;
						int i_460_ = i_424_ + is[i_459_];
						if ((i_458_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_458_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_458_ >= i_460_ && i_458_ < i_460_ + is_426_[i_459_]) {
							int i_461_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_419_) + i_458_);
							int i_462_ = (((Class_ra_Sub1) this).anIntArray7967[i_461_]);
							int i_463_ = i_462_ + i_422_;
							int i_464_ = (i_422_ & 0xff00ff) + (i_462_ & 0xff00ff);
							i_462_ = (i_463_ - i_464_ & 0x10000) + (i_464_ & 0x1000100);
							((Class_ra_Sub1) this).anIntArray7967[i_461_] = i_463_ - i_462_ | i_462_ - (i_462_ >>> 8);
						}
						i += i_447_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method5047(boolean bool) {
		((Class_ra_Sub1) this).aBoolean8003 = bool;
		((Class_ra_Sub1) this).aClass348_7975.method4187();
	}

	public Matrix4f method5036() {
		Class15 class15 = method5202(Thread.currentThread());
		return ((Class15) class15).aClass233_190;
	}

	public Class66 method5179(Class66 class66, Class66 class66_465_, float f, Class66 class66_466_) {
		return null;
	}

	public void O() {
		for (int i = 0; i < ((Class_ra_Sub1) this).aClass15Array8001.length; i++) {
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).anInt184 = 950886337 * ((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i])).anInt185;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).aBoolean186 = false;
		}
	}

	public void method5020(int i, int i_467_, float f, int i_468_, int i_469_, float f_470_, int i_471_, int i_472_, float f_473_, int i_474_, int i_475_, int i_476_, int i_477_) {
		boolean bool = null != ((Class_ra_Sub1) this).anIntArray7967;
		boolean bool_478_ = ((Class_ra_Sub1) this).aFloatArray7973 != null;
		if (bool || bool_478_) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aBoolean16 = false;
			i -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_468_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_471_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_467_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_469_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_472_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			((Class2) class2).aBoolean20 = (i < 0 || i > ((Class2) class2).anInt22 || i_468_ < 0 || i_468_ > ((Class2) class2).anInt22 || i_471_ < 0 || i_471_ > ((Class2) class2).anInt22);
			int i_479_ = i_474_ >>> 24;
			if (0 == i_477_ || i_477_ == 1 && 255 == i_479_) {
				((Class2) class2).anInt19 = 0;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_478_, false, (float) i_467_, (float) i_469_, (float) i_472_, (float) i, (float) i_468_, (float) i_471_, f, f_470_, f_473_, i_474_, i_475_, i_476_);
			} else if (1 == i_477_) {
				((Class2) class2).anInt19 = 255 - i_479_;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_478_, false, (float) i_467_, (float) i_469_, (float) i_472_, (float) i, (float) i_468_, (float) i_471_, f, f_470_, f_473_, i_474_, i_475_, i_476_);
			} else if (2 == i_477_) {
				((Class2) class2).anInt19 = 128;
				((Class2) class2).aBoolean48 = true;
				class2.method292(bool, bool_478_, false, (float) i_467_, (float) i_469_, (float) i_472_, (float) i, (float) i_468_, (float) i_471_, f, f_470_, f_473_, i_474_, i_475_, i_476_);
			} else
				throw new IllegalArgumentException();
			((Class2) class2).aBoolean16 = true;
		}
	}

	public void method5060(float f, float f_480_, float f_481_, float[] fs) {
		float f_482_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * f_481_) + (f * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + f_480_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		float f_483_ = ((f_481_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * f) + f_480_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4])));
		float f_484_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5] * f_480_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * f_481_));
		float f_485_ = (f * ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2] + ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6] * f_480_) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10] * f_481_));
		fs[0] = (f_483_ * ((Class_ra_Sub1) this).aFloat7993 / f_482_ + ((Class_ra_Sub1) this).aFloat8005);
		fs[1] = (((Class_ra_Sub1) this).aFloat7996 + ((Class_ra_Sub1) this).aFloat7995 * f_484_ / f_482_);
		fs[2] = f_485_;
	}

	public void method5059(float f, float f_486_, float f_487_, float[] fs) {
		float f_488_ = ((f_487_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * f_486_)));
		float f_489_ = ((f_487_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] * f) + f_486_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		if (f_488_ < -f_489_ || f_488_ > f_489_) {
			float[] fs_490_ = fs;
			float[] fs_491_ = fs;
			fs[2] = Float.NaN;
			fs_491_[1] = Float.NaN;
			fs_490_[0] = Float.NaN;
		} else {
			float f_492_ = (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + f * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + f_486_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4]) + f_487_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]));
			if (f_492_ < -f_489_ || f_492_ > f_489_) {
				float[] fs_493_ = fs;
				float[] fs_494_ = fs;
				fs[2] = Float.NaN;
				fs_494_[1] = Float.NaN;
				fs_493_[0] = Float.NaN;
			} else {
				float f_495_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) * f_486_ + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + f * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1])) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9]) * f_487_);
				if (f_495_ < -f_489_ || f_495_ > f_489_) {
					float[] fs_496_ = fs;
					float[] fs_497_ = fs;
					fs[2] = Float.NaN;
					fs_497_[1] = Float.NaN;
					fs_496_[0] = Float.NaN;
				} else {
					float f_498_ = ((((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10]) * f_487_ + (f * (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14]) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6]) * f_486_));
					fs[0] = (((Class_ra_Sub1) this).aFloat8005 + (f_492_ * ((Class_ra_Sub1) this).aFloat7993 / f_489_));
					fs[1] = (((Class_ra_Sub1) this).aFloat7995 * f_495_ / f_489_ + ((Class_ra_Sub1) this).aFloat7996);
					fs[2] = f_498_;
				}
			}
		}
	}

	public void method5058(int i, Class78 class78) {
		Class15 class15 = method5202(Thread.currentThread());
		((Class15) class15).anInt196 = 1450505545 * i;
		((Class15) class15).anInt184 = -1634857629 * class78.anInt726;
		((Class15) class15).anInt215 = -296597081 * class78.anInt725;
	}

	public void method5139(int i, int i_499_, float f, int i_500_, int i_501_, float f_502_, int i_503_, int i_504_, float f_505_, int i_506_, int i_507_, int i_508_, int i_509_) {
		boolean bool = null != ((Class_ra_Sub1) this).anIntArray7967;
		boolean bool_510_ = ((Class_ra_Sub1) this).aFloatArray7973 != null;
		if (bool || bool_510_) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aBoolean16 = false;
			i -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_500_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_503_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_499_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_501_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_504_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			((Class2) class2).aBoolean20 = (i < 0 || i > ((Class2) class2).anInt22 || i_500_ < 0 || i_500_ > ((Class2) class2).anInt22 || i_503_ < 0 || i_503_ > ((Class2) class2).anInt22);
			int i_511_ = i_506_ >>> 24;
			if (0 == i_509_ || i_509_ == 1 && 255 == i_511_) {
				((Class2) class2).anInt19 = 0;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_510_, false, (float) i_499_, (float) i_501_, (float) i_504_, (float) i, (float) i_500_, (float) i_503_, f, f_502_, f_505_, i_506_, i_507_, i_508_);
			} else if (1 == i_509_) {
				((Class2) class2).anInt19 = 255 - i_511_;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_510_, false, (float) i_499_, (float) i_501_, (float) i_504_, (float) i, (float) i_500_, (float) i_503_, f, f_502_, f_505_, i_506_, i_507_, i_508_);
			} else if (2 == i_509_) {
				((Class2) class2).anInt19 = 128;
				((Class2) class2).aBoolean48 = true;
				class2.method292(bool, bool_510_, false, (float) i_499_, (float) i_501_, (float) i_504_, (float) i, (float) i_500_, (float) i_503_, f, f_502_, f_505_, i_506_, i_507_, i_508_);
			} else
				throw new IllegalArgumentException();
			((Class2) class2).aBoolean16 = true;
		}
	}

	public Class58 method5062() {
		return new Class58(0, "Pure Java", 1, "CPU", 0L);
	}

	public Class58 method5063() {
		return new Class58(0, "Pure Java", 1, "CPU", 0L);
	}

	void method5064(int i, int i_512_) throws Exception_Sub1 {
		aClass52_Sub2_5312.method581(i, i_512_);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(1621358608);
	}

	void method5065(int i, int i_513_) throws Exception_Sub1 {
		aClass52_Sub2_5312.method581(i, i_513_);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(557326992);
	}

	void method5210(int i) {
		((Class_ra_Sub1) this).anInt7999 = i * 877981865;
		((Class_ra_Sub1) this).aClass15Array8001 = new Class15[-922307687 * ((Class_ra_Sub1) this).anInt7999];
		for (int i_514_ = 0; i_514_ < ((Class_ra_Sub1) this).anInt7999 * -922307687; i_514_++)
			((Class_ra_Sub1) this).aClass15Array8001[i_514_] = new Class15(this);
	}

	public void method5067() {
		/* empty */
	}

	void method5009() {
		if (((Class_ra_Sub1) this).aBoolean7994) {
			Class216.method2000(true, false, (short) 20421);
			((Class_ra_Sub1) this).aBoolean7994 = false;
		}
		((Class_ra_Sub1) this).aBoolean7985 = true;
	}

	void method5141() {
		if (((Class_ra_Sub1) this).aBoolean7994) {
			Class216.method2000(true, false, (short) -10994);
			((Class_ra_Sub1) this).aBoolean7994 = false;
		}
		((Class_ra_Sub1) this).aBoolean7985 = true;
	}

	void method5068() {
		if (((Class_ra_Sub1) this).aBoolean7994) {
			Class216.method2000(true, false, (short) 17485);
			((Class_ra_Sub1) this).aBoolean7994 = false;
		}
		((Class_ra_Sub1) this).aBoolean7985 = true;
	}

	void method5069() {
		if (((Class_ra_Sub1) this).aBoolean7994) {
			Class216.method2000(true, false, (short) 2760);
			((Class_ra_Sub1) this).aBoolean7994 = false;
		}
		((Class_ra_Sub1) this).aBoolean7985 = true;
	}

	public void method5174(int i) {
		int i_515_ = i - -1633713343 * ((Class_ra_Sub1) this).anInt7968;
		for (Class298_Sub4 class298_sub4 = (Class298_Sub4) ((Class_ra_Sub1) this).aClass348_7975.method4190(2090581524); null != class298_sub4; class298_sub4 = (Class298_Sub4) ((Class_ra_Sub1) this).aClass348_7975.method4191(-1973419432)) {
			if (((Class298_Sub4) class298_sub4).aBoolean7189) {
				((Class298_Sub4) class298_sub4).anInt7188 += i_515_;
				int i_516_ = ((Class298_Sub4) class298_sub4).anInt7188 / 50;
				if (i_516_ > 0) {
					Class53 class53 = anInterface_ma5299.method174((((Class298_Sub4) class298_sub4).anInt7190), 2122690510);
					float f = class53.aBoolean518 ? 64.0F : 128.0F;
					class298_sub4.method2855((int) ((float) i_515_ / 1000.0F * (float) class53.aByte535 / 64.0F * f), (int) (f * ((float) class53.aByte509 * ((float) i_515_ / 1000.0F) / 64.0F)));
					((Class298_Sub4) class298_sub4).anInt7188 -= 50 * i_516_;
				}
				((Class298_Sub4) class298_sub4).aBoolean7189 = false;
			}
		}
		((Class_ra_Sub1) this).anInt7968 = -1260974911 * i;
		((Class_ra_Sub1) this).aClass348_7970.method4186(5, -574753301);
		((Class_ra_Sub1) this).aClass348_7975.method4186(5, -271424616);
	}

	public int dm() {
		return 0;
	}

	public void eh(int i, int i_517_, int i_518_, int i_519_) {
		if (-912871679 * ((Class_ra_Sub1) this).anInt7974 < i)
			((Class_ra_Sub1) this).anInt7974 = i * -1291169535;
		if (((Class_ra_Sub1) this).anInt7976 * -1278653805 < i_517_)
			((Class_ra_Sub1) this).anInt7976 = i_517_ * 104031131;
		if (((Class_ra_Sub1) this).anInt7991 * -1416794725 > i_518_)
			((Class_ra_Sub1) this).anInt7991 = i_518_ * -1912131437;
		if (63686679 * ((Class_ra_Sub1) this).anInt7977 > i_519_)
			((Class_ra_Sub1) this).anInt7977 = i_519_ * 1656090535;
		method5209();
	}

	public void method5130(Matrix3f class222) {
		((Class_ra_Sub1) this).aClass222_7984 = class222;
		method5208();
	}

	public void ba(int i, int i_520_) {
		if ((i & 0x1) != 0)
			B(0, 0, 692106883 * ((Class_ra_Sub1) this).anInt7971, ((Class_ra_Sub1) this).anInt7972 * 918677455, i_520_, 0);
		if ((i & 0x2) != 0)
			method5198();
	}

	public void method5010(int i, int i_521_, int i_522_, int i_523_, int i_524_, int i_525_, int i_526_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			int i_527_ = i_522_ - i;
			int i_528_ = i_523_ - i_521_;
			int i_529_ = i_527_ >= 0 ? i_527_ : -i_527_;
			int i_530_ = i_528_ >= 0 ? i_528_ : -i_528_;
			int i_531_ = i_529_;
			if (i_531_ < i_530_)
				i_531_ = i_530_;
			if (0 != i_531_) {
				int i_532_ = (i_527_ << 16) / i_531_;
				int i_533_ = (i_528_ << 16) / i_531_;
				i_527_ += i_532_ >> 16;
				i_528_ += i_533_ >> 16;
				if (i_533_ <= i_532_)
					i_532_ = -i_532_;
				else
					i_533_ = -i_533_;
				int i_534_ = i_533_ * i_525_ >> 17;
				int i_535_ = i_533_ * i_525_ + 1 >> 17;
				int i_536_ = i_532_ * i_525_ >> 17;
				int i_537_ = 1 + i_525_ * i_532_ >> 17;
				i -= class2.method287();
				i_521_ -= class2.method288();
				int i_538_ = i_534_ + i;
				int i_539_ = i - i_535_;
				int i_540_ = i + i_527_ - i_535_;
				int i_541_ = i_534_ + (i + i_527_);
				int i_542_ = i_521_ + i_536_;
				int i_543_ = i_521_ - i_537_;
				int i_544_ = i_528_ + i_521_ - i_537_;
				int i_545_ = i_521_ + i_528_ + i_536_;
				if (i_526_ == 0)
					((Class2) class2).anInt19 = 0;
				else if (i_526_ == 1)
					((Class2) class2).anInt19 = 255 - (i_524_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class2) class2).aBoolean20 = (i_538_ < 0 || i_538_ > ((Class2) class2).anInt22 || i_539_ < 0 || i_539_ > ((Class2) class2).anInt22 || i_540_ < 0 || i_540_ > ((Class2) class2).anInt22);
				class2.method293(true, false, false, (float) i_542_, (float) i_543_, (float) i_544_, (float) i_538_, (float) i_539_, (float) i_540_, 100.0F, 100.0F, 100.0F, i_524_);
				((Class2) class2).aBoolean20 = (i_538_ < 0 || i_538_ > ((Class2) class2).anInt22 || i_540_ < 0 || i_540_ > ((Class2) class2).anInt22 || i_541_ < 0 || i_541_ > ((Class2) class2).anInt22);
				class2.method293(true, false, false, (float) i_542_, (float) i_544_, (float) i_545_, (float) i_538_, (float) i_540_, (float) i_541_, 100.0F, 100.0F, 100.0F, i_524_);
				RA(true);
			}
		}
	}

	public Class298_Sub10 method5211(int i, int i_546_, int i_547_, int i_548_, int i_549_, float f) {
		return null;
	}

	public void fn(int i, int i_550_) {
		if ((i & 0x1) != 0)
			B(0, 0, 692106883 * ((Class_ra_Sub1) this).anInt7971, ((Class_ra_Sub1) this).anInt7972 * 918677455, i_550_, 0);
		if ((i & 0x2) != 0)
			method5198();
	}

	public void method5157(int i, int i_551_, float f, int i_552_, int i_553_, float f_554_, int i_555_, int i_556_, float f_557_, int i_558_, int i_559_, int i_560_, int i_561_) {
		boolean bool = null != ((Class_ra_Sub1) this).anIntArray7967;
		boolean bool_562_ = ((Class_ra_Sub1) this).aFloatArray7973 != null;
		if (bool || bool_562_) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aBoolean16 = false;
			i -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_552_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_555_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_551_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_553_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_556_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			((Class2) class2).aBoolean20 = (i < 0 || i > ((Class2) class2).anInt22 || i_552_ < 0 || i_552_ > ((Class2) class2).anInt22 || i_555_ < 0 || i_555_ > ((Class2) class2).anInt22);
			int i_563_ = i_558_ >>> 24;
			if (0 == i_561_ || i_561_ == 1 && 255 == i_563_) {
				((Class2) class2).anInt19 = 0;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_562_, false, (float) i_551_, (float) i_553_, (float) i_556_, (float) i, (float) i_552_, (float) i_555_, f, f_554_, f_557_, i_558_, i_559_, i_560_);
			} else if (1 == i_561_) {
				((Class2) class2).anInt19 = 255 - i_563_;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_562_, false, (float) i_551_, (float) i_553_, (float) i_556_, (float) i, (float) i_552_, (float) i_555_, f, f_554_, f_557_, i_558_, i_559_, i_560_);
			} else if (2 == i_561_) {
				((Class2) class2).anInt19 = 128;
				((Class2) class2).aBoolean48 = true;
				class2.method292(bool, bool_562_, false, (float) i_551_, (float) i_553_, (float) i_556_, (float) i, (float) i_552_, (float) i_555_, f, f_554_, f_557_, i_558_, i_559_, i_560_);
			} else
				throw new IllegalArgumentException();
			((Class2) class2).aBoolean16 = true;
		}
	}

	public boolean method5072() {
		return false;
	}

	public boolean method5070() {
		return false;
	}

	public boolean method5071() {
		return false;
	}

	public void method5160(float f, float f_564_, float f_565_, float[] fs) {
		float f_566_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * f_565_) + (f * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + f_564_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		float f_567_ = ((f_565_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * f) + f_564_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4])));
		float f_568_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5] * f_564_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * f_565_));
		float f_569_ = (f * ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2] + ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6] * f_564_) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10] * f_565_));
		fs[0] = (f_567_ * ((Class_ra_Sub1) this).aFloat7993 / f_566_ + ((Class_ra_Sub1) this).aFloat8005);
		fs[1] = (((Class_ra_Sub1) this).aFloat7996 + ((Class_ra_Sub1) this).aFloat7995 * f_568_ / f_566_);
		fs[2] = f_569_;
	}

	public boolean method5073() {
		return true;
	}

	void method5188(float f, float f_570_, float f_571_, float f_572_, float f_573_, float f_574_) {
		/* empty */
	}

	public void qa(int[] is) {
		is[0] = -912871679 * ((Class_ra_Sub1) this).anInt7974;
		is[1] = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
		is[2] = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
		is[3] = ((Class_ra_Sub1) this).anInt7977 * 63686679;
	}

	public boolean method5111() {
		return false;
	}

	public boolean method5076() {
		return false;
	}

	boolean method5212(int i) {
		return (anInterface_ma5299.method174(i, 212515321).aBoolean540 || anInterface_ma5299.method174(i, 1397930760).aBoolean541);
	}

	public boolean method5078() {
		return false;
	}

	public boolean method5079() {
		return false;
	}

	public boolean method4994() {
		return false;
	}

	public Class264 method5092(Class505 class505, Class89[] class89s, boolean bool) {
		int[] is = new int[class89s.length];
		int[] is_575_ = new int[class89s.length];
		boolean bool_576_ = false;
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].anInt812;
			is_575_[i] = class89s[i].anInt816;
			if (class89s[i].aByteArray819 != null)
				bool_576_ = true;
		}
		if (bool) {
			if (bool_576_)
				return new Class264_Sub2(this, class505, class89s, is, is_575_);
			return new Class264_Sub4(this, class505, class89s, is, is_575_);
		}
		if (bool_576_)
			throw new IllegalArgumentException("");
		return new Class264_Sub1(this, class505, class89s, is, is_575_);
	}

	public void method5012(boolean bool) {
		/* empty */
	}

	public void method5085(boolean bool) {
		/* empty */
	}

	Class52_Sub2 method5117(Canvas canvas, int i, int i_577_) {
		return IsaacCipher.method5919(this, canvas, i, i_577_, -1693880696);
	}

	public int[] aq(int i, int i_578_, int i_579_, int i_580_) {
		if (null == ((Class_ra_Sub1) this).anIntArray7967)
			throw new IllegalStateException("");
		int[] is = new int[i_579_ * i_580_];
		int i_581_ = 0;
		for (int i_582_ = 0; i_582_ < i_580_; i_582_++) {
			int i_583_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * (i_578_ + i_582_));
			for (int i_584_ = 0; i_584_ < i_579_; i_584_++)
				is[i_581_++] = ((Class_ra_Sub1) this).anIntArray7967[i_584_ + i_583_];
		}
		return is;
	}

	public int[] eg(int i, int i_585_, int i_586_, int i_587_) {
		if (null == ((Class_ra_Sub1) this).anIntArray7967)
			throw new IllegalStateException("");
		int[] is = new int[i_586_ * i_587_];
		int i_588_ = 0;
		for (int i_589_ = 0; i_589_ < i_587_; i_589_++) {
			int i_590_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * (i_585_ + i_589_));
			for (int i_591_ = 0; i_591_ < i_586_; i_591_++)
				is[i_588_++] = ((Class_ra_Sub1) this).anIntArray7967[i_591_ + i_590_];
		}
		return is;
	}

	public void method5080() {
		/* empty */
	}

	public void el(float f, float f_592_) {
		((Class_ra_Sub1) this).aFloat7997 = f_592_ - f;
		((Class_ra_Sub1) this).aFloat8004 = f_592_ + f - 1.0F;
		for (int i = 0; i < ((Class_ra_Sub1) this).anInt7999 * -922307687; i++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i];
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aFloat46 = ((Class_ra_Sub1) this).aFloat7997;
			((Class2) class2).aFloat27 = ((Class_ra_Sub1) this).aFloat8004;
		}
	}

	public Class298_Sub10 method5213(int i, int i_593_, int i_594_, int i_595_, int i_596_, float f) {
		return null;
	}

	public void ec(boolean bool) {
		Class15 class15 = method5202(Thread.currentThread());
		((Class15) class15).aBoolean207 = bool;
	}

	public void method5086() {
		((Class_ra_Sub1) this).anInt7989 = 0;
		((Class_ra_Sub1) this).anInt7990 = 0;
		((Class_ra_Sub1) this).anInt7980 = 845086741 * ((Class_ra_Sub1) this).anInt7971;
		((Class_ra_Sub1) this).anInt7969 = -1768491203 * ((Class_ra_Sub1) this).anInt7972;
		method5209();
	}

	public void gv(int i, Class_ta class_ta, int i_597_, int i_598_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_599_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_600_;
			if (63686679 * ((Class_ra_Sub1) this).anInt7977 < is.length + i_598_)
				i_600_ = ((Class_ra_Sub1) this).anInt7977 * 63686679 - i_598_;
			else
				i_600_ = is.length;
			int i_601_;
			if (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_598_) {
				i_601_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_598_;
				i_598_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			} else
				i_601_ = 0;
			if (i_600_ - i_601_ > 0) {
				int i_602_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_598_;
				for (int i_603_ = i_601_; i_603_ < i_600_; i_603_++) {
					int i_604_ = i_597_ + is[i_603_];
					int i_605_ = is_599_[i_603_];
					if (((Class_ra_Sub1) this).anInt7974 * -912871679 > i_604_) {
						i_605_ -= (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i_604_);
						i_604_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					}
					if (-1416794725 * ((Class_ra_Sub1) this).anInt7991 < i_604_ + i_605_)
						i_605_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - i_604_);
					i_604_ += i_602_;
					for (int i_606_ = -i_605_; i_606_ < 0; i_606_++)
						((Class_ra_Sub1) this).anIntArray7967[i_604_++] = i;
					i_602_ += ((Class_ra_Sub1) this).anInt7971 * 692106883;
				}
			}
		}
	}

	public void ez(float f, float f_607_) {
		((Class_ra_Sub1) this).aFloat7997 = f_607_ - f;
		((Class_ra_Sub1) this).aFloat8004 = f_607_ + f - 1.0F;
		for (int i = 0; i < ((Class_ra_Sub1) this).anInt7999 * -922307687; i++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i];
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aFloat46 = ((Class_ra_Sub1) this).aFloat7997;
			((Class2) class2).aFloat27 = ((Class_ra_Sub1) this).aFloat8004;
		}
	}

	public void fi(int i, int i_608_, int i_609_, int i_610_, int i_611_, int i_612_, byte[] is, int i_613_, int i_614_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null && (i_609_ > 0 && i_610_ > 0)) {
			int i_615_ = 0;
			int i_616_ = 0;
			int i_617_ = (i_613_ << 16) / i_609_;
			int i_618_ = (is.length / i_613_ << 16) / i_610_;
			int i_619_ = i + i_608_ * (692106883 * ((Class_ra_Sub1) this).anInt7971);
			int i_620_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 - i_609_;
			if (i_610_ + i_608_ > ((Class_ra_Sub1) this).anInt7977 * 63686679)
				i_610_ -= (i_608_ + i_610_ - 63686679 * ((Class_ra_Sub1) this).anInt7977);
			if (i_608_ < ((Class_ra_Sub1) this).anInt7976 * -1278653805) {
				int i_621_ = -1278653805 * ((Class_ra_Sub1) this).anInt7976 - i_608_;
				i_610_ -= i_621_;
				i_619_ += i_621_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
				i_616_ += i_621_ * i_618_;
			}
			if (i + i_609_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991) {
				int i_622_ = (i + i_609_ - ((Class_ra_Sub1) this).anInt7991 * -1416794725);
				i_609_ -= i_622_;
				i_620_ += i_622_;
			}
			if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
				int i_623_ = -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i_609_ -= i_623_;
				i_619_ += i_623_;
				i_615_ += i_617_ * i_623_;
				i_620_ += i_623_;
			}
			int i_624_ = i_611_ >>> 24;
			int i_625_ = i_612_ >>> 24;
			if (0 == i_614_ || 1 == i_614_ && i_624_ == 255 && i_625_ == 255) {
				int i_626_ = i_615_;
				for (int i_627_ = -i_610_; i_627_ < 0; i_627_++) {
					int i_628_ = (i_616_ >> 16) * i_613_;
					for (int i_629_ = -i_609_; i_629_ < 0; i_629_++) {
						if (is[(i_615_ >> 16) + i_628_] != 0)
							((Class_ra_Sub1) this).anIntArray7967[i_619_++] = i_612_;
						else
							((Class_ra_Sub1) this).anIntArray7967[i_619_++] = i_611_;
						i_615_ += i_617_;
					}
					i_616_ += i_618_;
					i_615_ = i_626_;
					i_619_ += i_620_;
				}
			} else if (1 == i_614_) {
				int i_630_ = i_615_;
				for (int i_631_ = -i_610_; i_631_ < 0; i_631_++) {
					int i_632_ = (i_616_ >> 16) * i_613_;
					for (int i_633_ = -i_609_; i_633_ < 0; i_633_++) {
						int i_634_ = i_611_;
						if (is[(i_615_ >> 16) + i_632_] != 0)
							i_634_ = i_612_;
						int i_635_ = i_634_ >>> 24;
						int i_636_ = 255 - i_635_;
						int i_637_ = ((Class_ra_Sub1) this).anIntArray7967[i_619_];
						((Class_ra_Sub1) this).anIntArray7967[i_619_++] = (((i_635_ * (i_634_ & 0xff00) + (i_637_ & 0xff00) * i_636_) & 0xff0000) + (((i_637_ & 0xff00ff) * i_636_ + (i_634_ & 0xff00ff) * i_635_) & ~0xff00ff)) >> 8;
						i_615_ += i_617_;
					}
					i_616_ += i_618_;
					i_615_ = i_630_;
					i_619_ += i_620_;
				}
			} else if (i_614_ == 2) {
				int i_638_ = i_615_;
				for (int i_639_ = -i_610_; i_639_ < 0; i_639_++) {
					int i_640_ = i_613_ * (i_616_ >> 16);
					for (int i_641_ = -i_609_; i_641_ < 0; i_641_++) {
						int i_642_ = i_611_;
						if (is[(i_615_ >> 16) + i_640_] != 0)
							i_642_ = i_612_;
						if (i_642_ != 0) {
							int i_643_ = (((Class_ra_Sub1) this).anIntArray7967[i_619_]);
							int i_644_ = i_643_ + i_642_;
							int i_645_ = (i_643_ & 0xff00ff) + (i_642_ & 0xff00ff);
							i_643_ = (i_645_ & 0x1000100) + (i_644_ - i_645_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_619_++] = i_644_ - i_643_ | i_643_ - (i_643_ >>> 8);
						} else
							i_619_++;
						i_615_ += i_617_;
					}
					i_616_ += i_618_;
					i_615_ = i_638_;
					i_619_ += i_620_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method5180() {
		return true;
	}

	public void method5055(float f, float f_646_, float f_647_, float[] fs) {
		float f_648_ = ((f_647_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * f_646_)));
		float f_649_ = ((f_647_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] * f) + f_646_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		if (f_648_ < -f_649_ || f_648_ > f_649_) {
			float[] fs_650_ = fs;
			float[] fs_651_ = fs;
			fs[2] = Float.NaN;
			fs_651_[1] = Float.NaN;
			fs_650_[0] = Float.NaN;
		} else {
			float f_652_ = (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + f * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + f_646_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4]) + f_647_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]));
			if (f_652_ < -f_649_ || f_652_ > f_649_) {
				float[] fs_653_ = fs;
				float[] fs_654_ = fs;
				fs[2] = Float.NaN;
				fs_654_[1] = Float.NaN;
				fs_653_[0] = Float.NaN;
			} else {
				float f_655_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) * f_646_ + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + f * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1])) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9]) * f_647_);
				if (f_655_ < -f_649_ || f_655_ > f_649_) {
					float[] fs_656_ = fs;
					float[] fs_657_ = fs;
					fs[2] = Float.NaN;
					fs_657_[1] = Float.NaN;
					fs_656_[0] = Float.NaN;
				} else {
					float f_658_ = ((((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10]) * f_647_ + (f * (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14]) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6]) * f_646_));
					fs[0] = (((Class_ra_Sub1) this).aFloat8005 + (f_652_ * ((Class_ra_Sub1) this).aFloat7993 / f_649_));
					fs[1] = (((Class_ra_Sub1) this).aFloat7995 * f_655_ / f_649_ + ((Class_ra_Sub1) this).aFloat7996);
					fs[2] = f_658_;
				}
			}
		}
	}

	public void eq() {
		((Class_ra_Sub1) this).anInt7974 = 0;
		((Class_ra_Sub1) this).anInt7976 = 0;
		((Class_ra_Sub1) this).anInt7991 = 2046188857 * ((Class_ra_Sub1) this).anInt7971;
		((Class_ra_Sub1) this).anInt7977 = -482117367 * ((Class_ra_Sub1) this).anInt7972;
		method5209();
	}

	public void ep() {
		((Class_ra_Sub1) this).anInt7974 = 0;
		((Class_ra_Sub1) this).anInt7976 = 0;
		((Class_ra_Sub1) this).anInt7991 = 2046188857 * ((Class_ra_Sub1) this).anInt7971;
		((Class_ra_Sub1) this).anInt7977 = -482117367 * ((Class_ra_Sub1) this).anInt7972;
		method5209();
	}

	public void method5176() {
		/* empty */
	}

	public void ej(int i, int i_659_, int i_660_, int i_661_) {
		if (i < 0)
			i = 0;
		if (i_659_ < 0)
			i_659_ = 0;
		if (i_660_ > 692106883 * ((Class_ra_Sub1) this).anInt7971)
			i_660_ = 692106883 * ((Class_ra_Sub1) this).anInt7971;
		if (i_661_ > ((Class_ra_Sub1) this).anInt7972 * 918677455)
			i_661_ = 918677455 * ((Class_ra_Sub1) this).anInt7972;
		((Class_ra_Sub1) this).anInt7974 = i * -1291169535;
		((Class_ra_Sub1) this).anInt7991 = i_660_ * -1912131437;
		((Class_ra_Sub1) this).anInt7976 = i_659_ * 104031131;
		((Class_ra_Sub1) this).anInt7977 = 1656090535 * i_661_;
		method5209();
	}

	public void ed(int i, int i_662_, int i_663_, int i_664_) {
		if (i < 0)
			i = 0;
		if (i_662_ < 0)
			i_662_ = 0;
		if (i_663_ > 692106883 * ((Class_ra_Sub1) this).anInt7971)
			i_663_ = 692106883 * ((Class_ra_Sub1) this).anInt7971;
		if (i_664_ > ((Class_ra_Sub1) this).anInt7972 * 918677455)
			i_664_ = 918677455 * ((Class_ra_Sub1) this).anInt7972;
		((Class_ra_Sub1) this).anInt7974 = i * -1291169535;
		((Class_ra_Sub1) this).anInt7991 = i_663_ * -1912131437;
		((Class_ra_Sub1) this).anInt7976 = i_662_ * 104031131;
		((Class_ra_Sub1) this).anInt7977 = 1656090535 * i_664_;
		method5209();
	}

	public Class_xa method5122(int i, int i_665_, int[][] is, int[][] is_666_, int i_667_, int i_668_, int i_669_) {
		return new Class_xa_Sub2(this, i_668_, i_669_, i, i_665_, is, is_666_, i_667_);
	}

	public void method5057(int i, Class78 class78) {
		for (int i_670_ = 0; i_670_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_670_++) {
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_670_]).anInt185 = 329691201 * (((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i_670_])).anInt184);
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_670_]).anInt196 = 1450505545 * i;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_670_]).anInt184 = class78.anInt726 * -1634857629;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_670_]).anInt215 = class78.anInt725 * -296597081;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_670_]).aBoolean186 = true;
		}
	}

	public void eo(int[] is) {
		is[0] = -912871679 * ((Class_ra_Sub1) this).anInt7974;
		is[1] = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
		is[2] = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
		is[3] = ((Class_ra_Sub1) this).anInt7977 * 63686679;
	}

	public void method5075() {
		/* empty */
	}

	public boolean method5149() {
		return false;
	}

	public void fb(int i, int i_671_) {
		if ((i & 0x1) != 0)
			B(0, 0, 692106883 * ((Class_ra_Sub1) this).anInt7971, ((Class_ra_Sub1) this).anInt7972 * 918677455, i_671_, 0);
		if ((i & 0x2) != 0)
			method5198();
	}

	public void fh(int i, int i_672_) {
		if ((i & 0x1) != 0)
			B(0, 0, 692106883 * ((Class_ra_Sub1) this).anInt7971, ((Class_ra_Sub1) this).anInt7972 * 918677455, i_672_, 0);
		if ((i & 0x2) != 0)
			method5198();
	}

	public void method5056(int i, int i_673_, int i_674_, int i_675_) {
		/* empty */
	}

	public void fa(int i, int i_676_, int i_677_, int i_678_, int i_679_, int i_680_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
				i_677_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
			}
			if (i_676_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976) {
				i_678_ -= -1278653805 * ((Class_ra_Sub1) this).anInt7976 - i_676_;
				i_676_ = -1278653805 * ((Class_ra_Sub1) this).anInt7976;
			}
			if (i + i_677_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
				i_677_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - i;
			if (i_678_ + i_676_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_678_ = 63686679 * ((Class_ra_Sub1) this).anInt7977 - i_676_;
			if (i_677_ > 0 && i_678_ > 0 && i <= ((Class_ra_Sub1) this).anInt7991 * -1416794725 && i_676_ <= ((Class_ra_Sub1) this).anInt7977 * 63686679) {
				int i_681_ = ((Class_ra_Sub1) this).anInt7971 * 692106883 - i_677_;
				int i_682_ = (i_676_ * (((Class_ra_Sub1) this).anInt7971 * 692106883) + i);
				int i_683_ = i_679_ >>> 24;
				if (0 == i_680_ || i_680_ == 1 && 255 == i_683_) {
					int i_684_ = i_677_ >> 3;
					int i_685_ = i_677_ & 0x7;
					i_677_ = i_682_ - 1;
					for (int i_686_ = -i_678_; i_686_ < 0; i_686_++) {
						if (i_684_ > 0) {
							i = i_684_;
							do {
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
							} while (--i > 0);
						}
						if (i_685_ > 0) {
							i = i_685_;
							do
								((Class_ra_Sub1) this).anIntArray7967[++i_677_] = i_679_;
							while (--i > 0);
						}
						i_677_ += i_681_;
					}
				} else if (1 == i_680_) {
					i_679_ = ((i_683_ * (i_679_ & 0xff00ff) >> 8 & 0xff00ff) + (i_683_ * ((i_679_ & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_687_ = 256 - i_683_;
					for (int i_688_ = 0; i_688_ < i_678_; i_688_++) {
						for (int i_689_ = -i_677_; i_689_ < 0; i_689_++) {
							int i_690_ = (((Class_ra_Sub1) this).anIntArray7967[i_682_]);
							i_690_ = (((i_690_ & 0xff00ff) * i_687_ >> 8 & 0xff00ff) + (i_687_ * ((i_690_ & ~0xff00ff) >>> 8) & ~0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[i_682_++] = i_690_ + i_679_;
						}
						i_682_ += i_681_;
					}
				} else if (i_680_ == 2) {
					for (int i_691_ = 0; i_691_ < i_678_; i_691_++) {
						for (int i_692_ = -i_677_; i_692_ < 0; i_692_++) {
							int i_693_ = (((Class_ra_Sub1) this).anIntArray7967[i_682_]);
							int i_694_ = i_679_ + i_693_;
							int i_695_ = (i_679_ & 0xff00ff) + (i_693_ & 0xff00ff);
							i_693_ = (i_694_ - i_695_ & 0x10000) + (i_695_ & 0x1000100);
							((Class_ra_Sub1) this).anIntArray7967[i_682_++] = i_694_ - i_693_ | i_693_ - (i_693_ >>> 8);
						}
						i_682_ += i_681_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void fo(int i, int i_696_, int i_697_, int i_698_, int i_699_, int i_700_, byte[] is, int i_701_, int i_702_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null && (i_697_ > 0 && i_698_ > 0)) {
			int i_703_ = 0;
			int i_704_ = 0;
			int i_705_ = (i_701_ << 16) / i_697_;
			int i_706_ = (is.length / i_701_ << 16) / i_698_;
			int i_707_ = i + i_696_ * (692106883 * ((Class_ra_Sub1) this).anInt7971);
			int i_708_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 - i_697_;
			if (i_698_ + i_696_ > ((Class_ra_Sub1) this).anInt7977 * 63686679)
				i_698_ -= (i_696_ + i_698_ - 63686679 * ((Class_ra_Sub1) this).anInt7977);
			if (i_696_ < ((Class_ra_Sub1) this).anInt7976 * -1278653805) {
				int i_709_ = -1278653805 * ((Class_ra_Sub1) this).anInt7976 - i_696_;
				i_698_ -= i_709_;
				i_707_ += i_709_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
				i_704_ += i_709_ * i_706_;
			}
			if (i + i_697_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991) {
				int i_710_ = (i + i_697_ - ((Class_ra_Sub1) this).anInt7991 * -1416794725);
				i_697_ -= i_710_;
				i_708_ += i_710_;
			}
			if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
				int i_711_ = -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i_697_ -= i_711_;
				i_707_ += i_711_;
				i_703_ += i_705_ * i_711_;
				i_708_ += i_711_;
			}
			int i_712_ = i_699_ >>> 24;
			int i_713_ = i_700_ >>> 24;
			if (0 == i_702_ || 1 == i_702_ && i_712_ == 255 && i_713_ == 255) {
				int i_714_ = i_703_;
				for (int i_715_ = -i_698_; i_715_ < 0; i_715_++) {
					int i_716_ = (i_704_ >> 16) * i_701_;
					for (int i_717_ = -i_697_; i_717_ < 0; i_717_++) {
						if (is[(i_703_ >> 16) + i_716_] != 0)
							((Class_ra_Sub1) this).anIntArray7967[i_707_++] = i_700_;
						else
							((Class_ra_Sub1) this).anIntArray7967[i_707_++] = i_699_;
						i_703_ += i_705_;
					}
					i_704_ += i_706_;
					i_703_ = i_714_;
					i_707_ += i_708_;
				}
			} else if (1 == i_702_) {
				int i_718_ = i_703_;
				for (int i_719_ = -i_698_; i_719_ < 0; i_719_++) {
					int i_720_ = (i_704_ >> 16) * i_701_;
					for (int i_721_ = -i_697_; i_721_ < 0; i_721_++) {
						int i_722_ = i_699_;
						if (is[(i_703_ >> 16) + i_720_] != 0)
							i_722_ = i_700_;
						int i_723_ = i_722_ >>> 24;
						int i_724_ = 255 - i_723_;
						int i_725_ = ((Class_ra_Sub1) this).anIntArray7967[i_707_];
						((Class_ra_Sub1) this).anIntArray7967[i_707_++] = (((i_723_ * (i_722_ & 0xff00) + (i_725_ & 0xff00) * i_724_) & 0xff0000) + (((i_725_ & 0xff00ff) * i_724_ + (i_722_ & 0xff00ff) * i_723_) & ~0xff00ff)) >> 8;
						i_703_ += i_705_;
					}
					i_704_ += i_706_;
					i_703_ = i_718_;
					i_707_ += i_708_;
				}
			} else if (i_702_ == 2) {
				int i_726_ = i_703_;
				for (int i_727_ = -i_698_; i_727_ < 0; i_727_++) {
					int i_728_ = i_701_ * (i_704_ >> 16);
					for (int i_729_ = -i_697_; i_729_ < 0; i_729_++) {
						int i_730_ = i_699_;
						if (is[(i_703_ >> 16) + i_728_] != 0)
							i_730_ = i_700_;
						if (i_730_ != 0) {
							int i_731_ = (((Class_ra_Sub1) this).anIntArray7967[i_707_]);
							int i_732_ = i_731_ + i_730_;
							int i_733_ = (i_731_ & 0xff00ff) + (i_730_ & 0xff00ff);
							i_731_ = (i_733_ & 0x1000100) + (i_732_ - i_733_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_707_++] = i_732_ - i_731_ | i_731_ - (i_731_ >>> 8);
						} else
							i_707_++;
						i_703_ += i_705_;
					}
					i_704_ += i_706_;
					i_703_ = i_726_;
					i_707_ += i_708_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public int method5118(int i, int i_734_) {
		i |= 0x20800;
		return i & i_734_ ^ i_734_;
	}

	void fv(int i, int i_735_, int i_736_, int i_737_, int i_738_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			if (i_736_ < 0)
				i_736_ = -i_736_;
			int i_739_ = i_735_ - i_736_;
			if (i_739_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976)
				i_739_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			int i_740_ = i_736_ + i_735_ + 1;
			if (i_740_ > ((Class_ra_Sub1) this).anInt7977 * 63686679)
				i_740_ = 63686679 * ((Class_ra_Sub1) this).anInt7977;
			int i_741_ = i_739_;
			int i_742_ = i_736_ * i_736_;
			int i_743_ = 0;
			int i_744_ = i_735_ - i_741_;
			int i_745_ = i_744_ * i_744_;
			int i_746_ = i_745_ - i_744_;
			if (i_735_ > i_740_)
				i_735_ = i_740_;
			int i_747_ = i_737_ >>> 24;
			if (0 == i_738_ || i_738_ == 1 && i_747_ == 255) {
				while (i_741_ < i_735_) {
					for (/**/; i_746_ <= i_742_ || i_745_ <= i_742_; i_746_ += i_743_++ + i_743_)
						i_745_ += i_743_ + i_743_;
					int i_748_ = i - i_743_ + 1;
					if (i_748_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_748_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_749_ = i_743_ + i;
					if (i_749_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_749_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_750_ = i_748_ + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_741_);
					for (int i_751_ = i_748_; i_751_ < i_749_; i_751_++)
						((Class_ra_Sub1) this).anIntArray7967[i_750_++] = i_737_;
					i_741_++;
					i_745_ -= i_744_-- + i_744_;
					i_746_ -= i_744_ + i_744_;
				}
				i_743_ = i_736_;
				i_744_ = i_741_ - i_735_;
				i_746_ = i_744_ * i_744_ + i_742_;
				i_745_ = i_746_ - i_743_;
				i_746_ -= i_744_;
				while (i_741_ < i_740_) {
					for (/**/; i_746_ > i_742_ && i_745_ > i_742_; i_745_ -= i_743_ + i_743_)
						i_746_ -= i_743_-- + i_743_;
					int i_752_ = i - i_743_;
					if (i_752_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_752_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_753_ = i + i_743_;
					if (i_753_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1)
						i_753_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_754_ = (i_741_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_752_);
					for (int i_755_ = i_752_; i_755_ <= i_753_; i_755_++)
						((Class_ra_Sub1) this).anIntArray7967[i_754_++] = i_737_;
					i_741_++;
					i_746_ += i_744_ + i_744_;
					i_745_ += i_744_++ + i_744_;
				}
			} else if (i_738_ == 1) {
				i_737_ = ((i_747_ << 24) + ((i_747_ * (i_737_ & 0xff00ff) >> 8 & 0xff00ff) + (i_747_ * (i_737_ & 0xff00) >> 8 & 0xff00)));
				int i_756_ = 256 - i_747_;
				while (i_741_ < i_735_) {
					for (/**/; i_746_ <= i_742_ || i_745_ <= i_742_; i_746_ += i_743_++ + i_743_)
						i_745_ += i_743_ + i_743_;
					int i_757_ = 1 + (i - i_743_);
					if (i_757_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_757_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_758_ = i + i_743_;
					if (i_758_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_758_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_759_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_741_) + i_757_);
					for (int i_760_ = i_757_; i_760_ < i_758_; i_760_++) {
						int i_761_ = ((Class_ra_Sub1) this).anIntArray7967[i_759_];
						i_761_ = (((i_761_ & 0xff00ff) * i_756_ >> 8 & 0xff00ff) + (i_756_ * (i_761_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_759_++] = i_737_ + i_761_;
					}
					i_741_++;
					i_745_ -= i_744_-- + i_744_;
					i_746_ -= i_744_ + i_744_;
				}
				i_743_ = i_736_;
				i_744_ = -i_744_;
				i_746_ = i_742_ + i_744_ * i_744_;
				i_745_ = i_746_ - i_743_;
				i_746_ -= i_744_;
				while (i_741_ < i_740_) {
					for (/**/; i_746_ > i_742_ && i_745_ > i_742_; i_745_ -= i_743_ + i_743_)
						i_746_ -= i_743_-- + i_743_;
					int i_762_ = i - i_743_;
					if (i_762_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_762_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_763_ = i + i_743_;
					if (i_763_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_763_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_764_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_741_) + i_762_);
					for (int i_765_ = i_762_; i_765_ <= i_763_; i_765_++) {
						int i_766_ = ((Class_ra_Sub1) this).anIntArray7967[i_764_];
						i_766_ = (((i_766_ & 0xff00ff) * i_756_ >> 8 & 0xff00ff) + (i_756_ * (i_766_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_764_++] = i_737_ + i_766_;
					}
					i_741_++;
					i_746_ += i_744_ + i_744_;
					i_745_ += i_744_++ + i_744_;
				}
			} else if (i_738_ == 2) {
				while (i_741_ < i_735_) {
					for (/**/; i_746_ <= i_742_ || i_745_ <= i_742_; i_746_ += i_743_++ + i_743_)
						i_745_ += i_743_ + i_743_;
					int i_767_ = i - i_743_ + 1;
					if (i_767_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_767_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_768_ = i + i_743_;
					if (i_768_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_768_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_769_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_741_) + i_767_);
					for (int i_770_ = i_767_; i_770_ < i_768_; i_770_++) {
						int i_771_ = ((Class_ra_Sub1) this).anIntArray7967[i_769_];
						int i_772_ = i_737_ + i_771_;
						int i_773_ = (i_737_ & 0xff00ff) + (i_771_ & 0xff00ff);
						i_771_ = (i_773_ & 0x1000100) + (i_772_ - i_773_ & 0x10000);
						((Class_ra_Sub1) this).anIntArray7967[i_769_++] = i_772_ - i_771_ | i_771_ - (i_771_ >>> 8);
					}
					i_741_++;
					i_745_ -= i_744_-- + i_744_;
					i_746_ -= i_744_ + i_744_;
				}
				i_743_ = i_736_;
				i_744_ = -i_744_;
				i_746_ = i_744_ * i_744_ + i_742_;
				i_745_ = i_746_ - i_743_;
				i_746_ -= i_744_;
				while (i_741_ < i_740_) {
					for (/**/; i_746_ > i_742_ && i_745_ > i_742_; i_745_ -= i_743_ + i_743_)
						i_746_ -= i_743_-- + i_743_;
					int i_774_ = i - i_743_;
					if (i_774_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_774_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_775_ = i + i_743_;
					if (i_775_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_775_ = (((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1);
					int i_776_ = i_774_ + i_741_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
					for (int i_777_ = i_774_; i_777_ <= i_775_; i_777_++) {
						int i_778_ = ((Class_ra_Sub1) this).anIntArray7967[i_776_];
						int i_779_ = i_778_ + i_737_;
						int i_780_ = (i_778_ & 0xff00ff) + (i_737_ & 0xff00ff);
						i_778_ = (i_779_ - i_780_ & 0x10000) + (i_780_ & 0x1000100);
						((Class_ra_Sub1) this).anIntArray7967[i_776_++] = i_779_ - i_778_ | i_778_ - (i_778_ >>> 8);
					}
					i_741_++;
					i_746_ += i_744_ + i_744_;
					i_745_ += i_744_++ + i_744_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void fm(int i, int i_781_, int i_782_, int i_783_, int i_784_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			if (i_782_ < 0)
				i_782_ = -i_782_;
			int i_785_ = i_781_ - i_782_;
			if (i_785_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976)
				i_785_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			int i_786_ = i_782_ + i_781_ + 1;
			if (i_786_ > ((Class_ra_Sub1) this).anInt7977 * 63686679)
				i_786_ = 63686679 * ((Class_ra_Sub1) this).anInt7977;
			int i_787_ = i_785_;
			int i_788_ = i_782_ * i_782_;
			int i_789_ = 0;
			int i_790_ = i_781_ - i_787_;
			int i_791_ = i_790_ * i_790_;
			int i_792_ = i_791_ - i_790_;
			if (i_781_ > i_786_)
				i_781_ = i_786_;
			int i_793_ = i_783_ >>> 24;
			if (0 == i_784_ || i_784_ == 1 && i_793_ == 255) {
				while (i_787_ < i_781_) {
					for (/**/; i_792_ <= i_788_ || i_791_ <= i_788_; i_792_ += i_789_++ + i_789_)
						i_791_ += i_789_ + i_789_;
					int i_794_ = i - i_789_ + 1;
					if (i_794_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_794_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_795_ = i_789_ + i;
					if (i_795_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_795_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_796_ = i_794_ + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_787_);
					for (int i_797_ = i_794_; i_797_ < i_795_; i_797_++)
						((Class_ra_Sub1) this).anIntArray7967[i_796_++] = i_783_;
					i_787_++;
					i_791_ -= i_790_-- + i_790_;
					i_792_ -= i_790_ + i_790_;
				}
				i_789_ = i_782_;
				i_790_ = i_787_ - i_781_;
				i_792_ = i_790_ * i_790_ + i_788_;
				i_791_ = i_792_ - i_789_;
				i_792_ -= i_790_;
				while (i_787_ < i_786_) {
					for (/**/; i_792_ > i_788_ && i_791_ > i_788_; i_791_ -= i_789_ + i_789_)
						i_792_ -= i_789_-- + i_789_;
					int i_798_ = i - i_789_;
					if (i_798_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_798_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_799_ = i + i_789_;
					if (i_799_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1)
						i_799_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_800_ = (i_787_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_798_);
					for (int i_801_ = i_798_; i_801_ <= i_799_; i_801_++)
						((Class_ra_Sub1) this).anIntArray7967[i_800_++] = i_783_;
					i_787_++;
					i_792_ += i_790_ + i_790_;
					i_791_ += i_790_++ + i_790_;
				}
			} else if (i_784_ == 1) {
				i_783_ = ((i_793_ << 24) + ((i_793_ * (i_783_ & 0xff00ff) >> 8 & 0xff00ff) + (i_793_ * (i_783_ & 0xff00) >> 8 & 0xff00)));
				int i_802_ = 256 - i_793_;
				while (i_787_ < i_781_) {
					for (/**/; i_792_ <= i_788_ || i_791_ <= i_788_; i_792_ += i_789_++ + i_789_)
						i_791_ += i_789_ + i_789_;
					int i_803_ = 1 + (i - i_789_);
					if (i_803_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_803_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_804_ = i + i_789_;
					if (i_804_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_804_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_805_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_787_) + i_803_);
					for (int i_806_ = i_803_; i_806_ < i_804_; i_806_++) {
						int i_807_ = ((Class_ra_Sub1) this).anIntArray7967[i_805_];
						i_807_ = (((i_807_ & 0xff00ff) * i_802_ >> 8 & 0xff00ff) + (i_802_ * (i_807_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_805_++] = i_783_ + i_807_;
					}
					i_787_++;
					i_791_ -= i_790_-- + i_790_;
					i_792_ -= i_790_ + i_790_;
				}
				i_789_ = i_782_;
				i_790_ = -i_790_;
				i_792_ = i_788_ + i_790_ * i_790_;
				i_791_ = i_792_ - i_789_;
				i_792_ -= i_790_;
				while (i_787_ < i_786_) {
					for (/**/; i_792_ > i_788_ && i_791_ > i_788_; i_791_ -= i_789_ + i_789_)
						i_792_ -= i_789_-- + i_789_;
					int i_808_ = i - i_789_;
					if (i_808_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_808_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_809_ = i + i_789_;
					if (i_809_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_809_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_810_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_787_) + i_808_);
					for (int i_811_ = i_808_; i_811_ <= i_809_; i_811_++) {
						int i_812_ = ((Class_ra_Sub1) this).anIntArray7967[i_810_];
						i_812_ = (((i_812_ & 0xff00ff) * i_802_ >> 8 & 0xff00ff) + (i_802_ * (i_812_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_810_++] = i_783_ + i_812_;
					}
					i_787_++;
					i_792_ += i_790_ + i_790_;
					i_791_ += i_790_++ + i_790_;
				}
			} else if (i_784_ == 2) {
				while (i_787_ < i_781_) {
					for (/**/; i_792_ <= i_788_ || i_791_ <= i_788_; i_792_ += i_789_++ + i_789_)
						i_791_ += i_789_ + i_789_;
					int i_813_ = i - i_789_ + 1;
					if (i_813_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_813_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_814_ = i + i_789_;
					if (i_814_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_814_ = ((Class_ra_Sub1) this).anInt7991 * -1416794725;
					int i_815_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_787_) + i_813_);
					for (int i_816_ = i_813_; i_816_ < i_814_; i_816_++) {
						int i_817_ = ((Class_ra_Sub1) this).anIntArray7967[i_815_];
						int i_818_ = i_783_ + i_817_;
						int i_819_ = (i_783_ & 0xff00ff) + (i_817_ & 0xff00ff);
						i_817_ = (i_819_ & 0x1000100) + (i_818_ - i_819_ & 0x10000);
						((Class_ra_Sub1) this).anIntArray7967[i_815_++] = i_818_ - i_817_ | i_817_ - (i_817_ >>> 8);
					}
					i_787_++;
					i_791_ -= i_790_-- + i_790_;
					i_792_ -= i_790_ + i_790_;
				}
				i_789_ = i_782_;
				i_790_ = -i_790_;
				i_792_ = i_790_ * i_790_ + i_788_;
				i_791_ = i_792_ - i_789_;
				i_792_ -= i_790_;
				while (i_787_ < i_786_) {
					for (/**/; i_792_ > i_788_ && i_791_ > i_788_; i_791_ -= i_789_ + i_789_)
						i_792_ -= i_789_-- + i_789_;
					int i_820_ = i - i_789_;
					if (i_820_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_820_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_821_ = i + i_789_;
					if (i_821_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_821_ = (((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1);
					int i_822_ = i_820_ + i_787_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
					for (int i_823_ = i_820_; i_823_ <= i_821_; i_823_++) {
						int i_824_ = ((Class_ra_Sub1) this).anIntArray7967[i_822_];
						int i_825_ = i_824_ + i_783_;
						int i_826_ = (i_824_ & 0xff00ff) + (i_783_ & 0xff00ff);
						i_824_ = (i_825_ - i_826_ & 0x10000) + (i_826_ & 0x1000100);
						((Class_ra_Sub1) this).anIntArray7967[i_822_++] = i_825_ - i_824_ | i_824_ - (i_824_ >>> 8);
					}
					i_787_++;
					i_792_ += i_790_ + i_790_;
					i_791_ += i_790_++ + i_790_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void ff(int i, int i_827_, int i_828_, int i_829_, int i_830_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i_827_ >= -1278653805 * ((Class_ra_Sub1) this).anInt7976 && i_827_ < 63686679 * ((Class_ra_Sub1) this).anInt7977)) {
			if (i < -912871679 * ((Class_ra_Sub1) this).anInt7974) {
				i_828_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
			}
			if (i + i_828_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
				i_828_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - i;
			int i_831_ = i + 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_827_;
			int i_832_ = i_829_ >>> 24;
			if (i_830_ == 0 || i_830_ == 1 && i_832_ == 255) {
				for (int i_833_ = 0; i_833_ < i_828_; i_833_++)
					((Class_ra_Sub1) this).anIntArray7967[i_831_ + i_833_] = i_829_;
			} else if (i_830_ == 1) {
				i_829_ = (i_832_ << 24) + (((i_829_ & 0xff00) * i_832_ >> 8 & 0xff00) + (i_832_ * (i_829_ & 0xff00ff) >> 8 & 0xff00ff));
				int i_834_ = 256 - i_832_;
				for (int i_835_ = 0; i_835_ < i_828_; i_835_++) {
					int i_836_ = (((Class_ra_Sub1) this).anIntArray7967[i_835_ + i_831_]);
					i_836_ = ((i_834_ * (i_836_ & 0xff00) >> 8 & 0xff00) + (i_834_ * (i_836_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub1) this).anIntArray7967[i_835_ + i_831_] = i_829_ + i_836_;
				}
			} else if (i_830_ == 2) {
				for (int i_837_ = 0; i_837_ < i_828_; i_837_++) {
					int i_838_ = (((Class_ra_Sub1) this).anIntArray7967[i_831_ + i_837_]);
					int i_839_ = i_829_ + i_838_;
					int i_840_ = (i_838_ & 0xff00ff) + (i_829_ & 0xff00ff);
					i_838_ = (i_840_ & 0x1000100) + (i_839_ - i_840_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_831_ + i_837_] = i_839_ - i_838_ | i_838_ - (i_838_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void fd(int i, int i_841_, int i_842_, int i_843_, int i_844_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i_841_ >= -1278653805 * ((Class_ra_Sub1) this).anInt7976 && i_841_ < 63686679 * ((Class_ra_Sub1) this).anInt7977)) {
			if (i < -912871679 * ((Class_ra_Sub1) this).anInt7974) {
				i_842_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974 - i;
				i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
			}
			if (i + i_842_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
				i_842_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - i;
			int i_845_ = i + 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_841_;
			int i_846_ = i_843_ >>> 24;
			if (i_844_ == 0 || i_844_ == 1 && i_846_ == 255) {
				for (int i_847_ = 0; i_847_ < i_842_; i_847_++)
					((Class_ra_Sub1) this).anIntArray7967[i_845_ + i_847_] = i_843_;
			} else if (i_844_ == 1) {
				i_843_ = (i_846_ << 24) + (((i_843_ & 0xff00) * i_846_ >> 8 & 0xff00) + (i_846_ * (i_843_ & 0xff00ff) >> 8 & 0xff00ff));
				int i_848_ = 256 - i_846_;
				for (int i_849_ = 0; i_849_ < i_842_; i_849_++) {
					int i_850_ = (((Class_ra_Sub1) this).anIntArray7967[i_849_ + i_845_]);
					i_850_ = ((i_848_ * (i_850_ & 0xff00) >> 8 & 0xff00) + (i_848_ * (i_850_ & 0xff00ff) >> 8 & 0xff00ff));
					((Class_ra_Sub1) this).anIntArray7967[i_849_ + i_845_] = i_843_ + i_850_;
				}
			} else if (i_844_ == 2) {
				for (int i_851_ = 0; i_851_ < i_842_; i_851_++) {
					int i_852_ = (((Class_ra_Sub1) this).anIntArray7967[i_845_ + i_851_]);
					int i_853_ = i_843_ + i_852_;
					int i_854_ = (i_852_ & 0xff00ff) + (i_843_ & 0xff00ff);
					i_852_ = (i_854_ & 0x1000100) + (i_853_ - i_854_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_845_ + i_851_] = i_853_ - i_852_ | i_852_ - (i_852_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void ft(int i, int i_855_, int i_856_, int i_857_, int i_858_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < ((Class_ra_Sub1) this).anInt7991 * -1416794725)) {
			if (i_855_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976) {
				i_856_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_855_;
				i_855_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			}
			if (i_856_ + i_855_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_856_ = 63686679 * ((Class_ra_Sub1) this).anInt7977 - i_855_;
			int i_859_ = i + i_855_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
			int i_860_ = i_857_ >>> 24;
			if (i_858_ == 0 || 1 == i_858_ && 255 == i_860_) {
				for (int i_861_ = 0; i_861_ < i_856_; i_861_++)
					((Class_ra_Sub1) this).anIntArray7967[i_859_ + i_861_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)] = i_857_;
			} else if (i_858_ == 1) {
				i_857_ = ((i_860_ * (i_857_ & 0xff00) >> 8 & 0xff00) + ((i_857_ & 0xff00ff) * i_860_ >> 8 & 0xff00ff) + (i_860_ << 24));
				int i_862_ = 256 - i_860_;
				for (int i_863_ = 0; i_863_ < i_856_; i_863_++) {
					int i_864_ = (i_863_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_859_);
					int i_865_ = ((Class_ra_Sub1) this).anIntArray7967[i_864_];
					i_865_ = ((i_862_ * (i_865_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_865_ & 0xff00) * i_862_ >> 8 & 0xff00));
					((Class_ra_Sub1) this).anIntArray7967[i_864_] = i_865_ + i_857_;
				}
			} else if (2 == i_858_) {
				for (int i_866_ = 0; i_866_ < i_856_; i_866_++) {
					int i_867_ = (i_866_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_859_);
					int i_868_ = ((Class_ra_Sub1) this).anIntArray7967[i_867_];
					int i_869_ = i_857_ + i_868_;
					int i_870_ = (i_868_ & 0xff00ff) + (i_857_ & 0xff00ff);
					i_868_ = (i_870_ & 0x1000100) + (i_869_ - i_870_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_867_] = i_869_ - i_868_ | i_868_ - (i_868_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void ea(int i, int i_871_, int i_872_, int i_873_) {
		if (-912871679 * ((Class_ra_Sub1) this).anInt7974 < i)
			((Class_ra_Sub1) this).anInt7974 = i * -1291169535;
		if (((Class_ra_Sub1) this).anInt7976 * -1278653805 < i_871_)
			((Class_ra_Sub1) this).anInt7976 = i_871_ * 104031131;
		if (((Class_ra_Sub1) this).anInt7991 * -1416794725 > i_872_)
			((Class_ra_Sub1) this).anInt7991 = i_872_ * -1912131437;
		if (63686679 * ((Class_ra_Sub1) this).anInt7977 > i_873_)
			((Class_ra_Sub1) this).anInt7977 = i_873_ * 1656090535;
		method5209();
	}

	public void fl(int i, int i_874_, int i_875_, int i_876_, int i_877_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < ((Class_ra_Sub1) this).anInt7991 * -1416794725)) {
			if (i_874_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976) {
				i_875_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_874_;
				i_874_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			}
			if (i_875_ + i_874_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_875_ = 63686679 * ((Class_ra_Sub1) this).anInt7977 - i_874_;
			int i_878_ = i + i_874_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
			int i_879_ = i_876_ >>> 24;
			if (i_877_ == 0 || 1 == i_877_ && 255 == i_879_) {
				for (int i_880_ = 0; i_880_ < i_875_; i_880_++)
					((Class_ra_Sub1) this).anIntArray7967[i_878_ + i_880_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)] = i_876_;
			} else if (i_877_ == 1) {
				i_876_ = ((i_879_ * (i_876_ & 0xff00) >> 8 & 0xff00) + ((i_876_ & 0xff00ff) * i_879_ >> 8 & 0xff00ff) + (i_879_ << 24));
				int i_881_ = 256 - i_879_;
				for (int i_882_ = 0; i_882_ < i_875_; i_882_++) {
					int i_883_ = (i_882_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_878_);
					int i_884_ = ((Class_ra_Sub1) this).anIntArray7967[i_883_];
					i_884_ = ((i_881_ * (i_884_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_884_ & 0xff00) * i_881_ >> 8 & 0xff00));
					((Class_ra_Sub1) this).anIntArray7967[i_883_] = i_884_ + i_876_;
				}
			} else if (2 == i_877_) {
				for (int i_885_ = 0; i_885_ < i_875_; i_885_++) {
					int i_886_ = (i_885_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_878_);
					int i_887_ = ((Class_ra_Sub1) this).anIntArray7967[i_886_];
					int i_888_ = i_876_ + i_887_;
					int i_889_ = (i_887_ & 0xff00ff) + (i_876_ & 0xff00ff);
					i_887_ = (i_889_ & 0x1000100) + (i_888_ - i_889_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_886_] = i_888_ - i_887_ | i_887_ - (i_887_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public int du() {
		return 0;
	}

	public void method5088(int i, int i_890_, int i_891_, int i_892_, int i_893_, int i_894_, Class_ta class_ta, int i_895_, int i_896_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_897_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_898_ = (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_896_ ? ((Class_ra_Sub1) this).anInt7976 * -1278653805 : i_896_);
			int i_899_ = ((63686679 * ((Class_ra_Sub1) this).anInt7977 < i_896_ + is.length) ? 63686679 * ((Class_ra_Sub1) this).anInt7977 : i_896_ + is.length);
			i_891_ -= i;
			i_892_ -= i_890_;
			if (i_891_ + i_892_ < 0) {
				i += i_891_;
				i_891_ = -i_891_;
				i_890_ += i_892_;
				i_892_ = -i_892_;
			}
			if (i_891_ > i_892_) {
				i_890_ <<= 16;
				i_890_ += 32768;
				i_892_ <<= 16;
				int i_900_ = (int) Math.floor(0.5 + ((double) i_892_ / (double) i_891_));
				i_891_ += i;
				if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
					i_890_ += (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i) * i_900_;
					i = -912871679 * ((Class_ra_Sub1) this).anInt7974;
				}
				if (i_891_ >= -1416794725 * ((Class_ra_Sub1) this).anInt7991)
					i_891_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1;
				int i_901_ = i_893_ >>> 24;
				if (0 == i_894_ || i_894_ == 1 && 255 == i_901_) {
					for (/**/; i <= i_891_; i++) {
						int i_902_ = i_890_ >> 16;
						int i_903_ = i_902_ - i_896_;
						if (i_902_ >= i_898_ && i_902_ < i_899_) {
							int i_904_ = is[i_903_] + i_895_;
							if (i >= i_904_ && i < is_897_[i_903_] + i_904_)
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_902_) + i] = i_893_;
						}
						i_890_ += i_900_;
					}
				} else if (1 == i_894_) {
					i_893_ = ((i_901_ << 24) + ((i_901_ * (i_893_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_893_ & 0xff00) * i_901_ >> 8 & 0xff00)));
					int i_905_ = 256 - i_901_;
					for (/**/; i <= i_891_; i++) {
						int i_906_ = i_890_ >> 16;
						int i_907_ = i_906_ - i_896_;
						if (i_906_ >= i_898_ && i_906_ < i_899_) {
							int i_908_ = is[i_907_] + i_895_;
							if (i >= i_908_ && i < is_897_[i_907_] + i_908_) {
								int i_909_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_906_);
								int i_910_ = (((Class_ra_Sub1) this).anIntArray7967[i_909_]);
								i_910_ = (((i_910_ & 0xff00) * i_905_ >> 8 & 0xff00) + (i_905_ * (i_910_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_909_] = i_910_ + i_893_;
							}
						}
						i_890_ += i_900_;
					}
				} else if (2 == i_894_) {
					for (/**/; i <= i_891_; i++) {
						int i_911_ = i_890_ >> 16;
						int i_912_ = i_911_ - i_896_;
						if (i_911_ >= i_898_ && i_911_ < i_899_) {
							int i_913_ = is[i_912_] + i_895_;
							if (i >= i_913_ && i < i_913_ + is_897_[i_912_]) {
								int i_914_ = i + (i_911_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_915_ = (((Class_ra_Sub1) this).anIntArray7967[i_914_]);
								int i_916_ = i_893_ + i_915_;
								int i_917_ = ((i_893_ & 0xff00ff) + (i_915_ & 0xff00ff));
								i_915_ = (i_917_ & 0x1000100) + (i_916_ - i_917_ & 0x10000);
								((Class_ra_Sub1) this).anIntArray7967[i_914_] = i_916_ - i_915_ | i_915_ - (i_915_ >>> 8);
							}
						}
						i_890_ += i_900_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_891_ <<= 16;
				int i_918_ = (int) Math.floor((double) i_891_ / (double) i_892_ + 0.5);
				i_892_ += i_890_;
				if (i_890_ < i_898_) {
					i += (i_898_ - i_890_) * i_918_;
					i_890_ = i_898_;
				}
				if (i_892_ >= i_899_)
					i_892_ = i_899_ - 1;
				int i_919_ = i_893_ >>> 24;
				if (i_894_ == 0 || 1 == i_894_ && i_919_ == 255) {
					for (/**/; i_890_ <= i_892_; i_890_++) {
						int i_920_ = i >> 16;
						int i_921_ = i_890_ - i_896_;
						int i_922_ = is[i_921_] + i_895_;
						if ((i_920_ >= ((Class_ra_Sub1) this).anInt7974 * -912871679) && i_920_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_920_ >= i_922_ && i_920_ < is_897_[i_921_] + i_922_)
							((Class_ra_Sub1) this).anIntArray7967[(692106883 * ((Class_ra_Sub1) this).anInt7971 * i_890_) + i_920_] = i_893_;
						i += i_918_;
					}
				} else if (i_894_ == 1) {
					i_893_ = ((i_919_ * (i_893_ & 0xff00ff) >> 8 & 0xff00ff) + (i_919_ * (i_893_ & 0xff00) >> 8 & 0xff00) + (i_919_ << 24));
					int i_923_ = 256 - i_919_;
					for (/**/; i_890_ <= i_892_; i_890_++) {
						int i_924_ = i >> 16;
						int i_925_ = i_890_ - i_896_;
						int i_926_ = i_895_ + is[i_925_];
						if ((i_924_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_924_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_924_ >= i_926_ && i_924_ < is_897_[i_925_] + i_926_) {
							int i_927_ = (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_890_) + i_924_;
							int i_928_ = (((Class_ra_Sub1) this).anIntArray7967[i_927_]);
							i_928_ = (((i_928_ & 0xff00) * i_923_ >> 8 & 0xff00) + (i_923_ * (i_928_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[(i_890_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_924_)] = i_928_ + i_893_;
						}
						i += i_918_;
					}
				} else if (i_894_ == 2) {
					for (/**/; i_890_ <= i_892_; i_890_++) {
						int i_929_ = i >> 16;
						int i_930_ = i_890_ - i_896_;
						int i_931_ = i_895_ + is[i_930_];
						if ((i_929_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_929_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_929_ >= i_931_ && i_929_ < i_931_ + is_897_[i_930_]) {
							int i_932_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_890_) + i_929_);
							int i_933_ = (((Class_ra_Sub1) this).anIntArray7967[i_932_]);
							int i_934_ = i_933_ + i_893_;
							int i_935_ = (i_893_ & 0xff00ff) + (i_933_ & 0xff00ff);
							i_933_ = (i_934_ - i_935_ & 0x10000) + (i_935_ & 0x1000100);
							((Class_ra_Sub1) this).anIntArray7967[i_932_] = i_934_ - i_933_ | i_933_ - (i_933_ >>> 8);
						}
						i += i_918_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method5096(int i, int i_936_, int i_937_, int i_938_, int i_939_, int i_940_, Class_ta class_ta, int i_941_, int i_942_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_943_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_944_ = (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_942_ ? ((Class_ra_Sub1) this).anInt7976 * -1278653805 : i_942_);
			int i_945_ = ((63686679 * ((Class_ra_Sub1) this).anInt7977 < i_942_ + is.length) ? 63686679 * ((Class_ra_Sub1) this).anInt7977 : i_942_ + is.length);
			i_937_ -= i;
			i_938_ -= i_936_;
			if (i_937_ + i_938_ < 0) {
				i += i_937_;
				i_937_ = -i_937_;
				i_936_ += i_938_;
				i_938_ = -i_938_;
			}
			if (i_937_ > i_938_) {
				i_936_ <<= 16;
				i_936_ += 32768;
				i_938_ <<= 16;
				int i_946_ = (int) Math.floor(0.5 + ((double) i_938_ / (double) i_937_));
				i_937_ += i;
				if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
					i_936_ += (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i) * i_946_;
					i = -912871679 * ((Class_ra_Sub1) this).anInt7974;
				}
				if (i_937_ >= -1416794725 * ((Class_ra_Sub1) this).anInt7991)
					i_937_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1;
				int i_947_ = i_939_ >>> 24;
				if (0 == i_940_ || i_940_ == 1 && 255 == i_947_) {
					for (/**/; i <= i_937_; i++) {
						int i_948_ = i_936_ >> 16;
						int i_949_ = i_948_ - i_942_;
						if (i_948_ >= i_944_ && i_948_ < i_945_) {
							int i_950_ = is[i_949_] + i_941_;
							if (i >= i_950_ && i < is_943_[i_949_] + i_950_)
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_948_) + i] = i_939_;
						}
						i_936_ += i_946_;
					}
				} else if (1 == i_940_) {
					i_939_ = ((i_947_ << 24) + ((i_947_ * (i_939_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_939_ & 0xff00) * i_947_ >> 8 & 0xff00)));
					int i_951_ = 256 - i_947_;
					for (/**/; i <= i_937_; i++) {
						int i_952_ = i_936_ >> 16;
						int i_953_ = i_952_ - i_942_;
						if (i_952_ >= i_944_ && i_952_ < i_945_) {
							int i_954_ = is[i_953_] + i_941_;
							if (i >= i_954_ && i < is_943_[i_953_] + i_954_) {
								int i_955_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_952_);
								int i_956_ = (((Class_ra_Sub1) this).anIntArray7967[i_955_]);
								i_956_ = (((i_956_ & 0xff00) * i_951_ >> 8 & 0xff00) + (i_951_ * (i_956_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_955_] = i_956_ + i_939_;
							}
						}
						i_936_ += i_946_;
					}
				} else if (2 == i_940_) {
					for (/**/; i <= i_937_; i++) {
						int i_957_ = i_936_ >> 16;
						int i_958_ = i_957_ - i_942_;
						if (i_957_ >= i_944_ && i_957_ < i_945_) {
							int i_959_ = is[i_958_] + i_941_;
							if (i >= i_959_ && i < i_959_ + is_943_[i_958_]) {
								int i_960_ = i + (i_957_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_961_ = (((Class_ra_Sub1) this).anIntArray7967[i_960_]);
								int i_962_ = i_939_ + i_961_;
								int i_963_ = ((i_939_ & 0xff00ff) + (i_961_ & 0xff00ff));
								i_961_ = (i_963_ & 0x1000100) + (i_962_ - i_963_ & 0x10000);
								((Class_ra_Sub1) this).anIntArray7967[i_960_] = i_962_ - i_961_ | i_961_ - (i_961_ >>> 8);
							}
						}
						i_936_ += i_946_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_937_ <<= 16;
				int i_964_ = (int) Math.floor((double) i_937_ / (double) i_938_ + 0.5);
				i_938_ += i_936_;
				if (i_936_ < i_944_) {
					i += (i_944_ - i_936_) * i_964_;
					i_936_ = i_944_;
				}
				if (i_938_ >= i_945_)
					i_938_ = i_945_ - 1;
				int i_965_ = i_939_ >>> 24;
				if (i_940_ == 0 || 1 == i_940_ && i_965_ == 255) {
					for (/**/; i_936_ <= i_938_; i_936_++) {
						int i_966_ = i >> 16;
						int i_967_ = i_936_ - i_942_;
						int i_968_ = is[i_967_] + i_941_;
						if ((i_966_ >= ((Class_ra_Sub1) this).anInt7974 * -912871679) && i_966_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_966_ >= i_968_ && i_966_ < is_943_[i_967_] + i_968_)
							((Class_ra_Sub1) this).anIntArray7967[(692106883 * ((Class_ra_Sub1) this).anInt7971 * i_936_) + i_966_] = i_939_;
						i += i_964_;
					}
				} else if (i_940_ == 1) {
					i_939_ = ((i_965_ * (i_939_ & 0xff00ff) >> 8 & 0xff00ff) + (i_965_ * (i_939_ & 0xff00) >> 8 & 0xff00) + (i_965_ << 24));
					int i_969_ = 256 - i_965_;
					for (/**/; i_936_ <= i_938_; i_936_++) {
						int i_970_ = i >> 16;
						int i_971_ = i_936_ - i_942_;
						int i_972_ = i_941_ + is[i_971_];
						if ((i_970_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_970_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_970_ >= i_972_ && i_970_ < is_943_[i_971_] + i_972_) {
							int i_973_ = (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_936_) + i_970_;
							int i_974_ = (((Class_ra_Sub1) this).anIntArray7967[i_973_]);
							i_974_ = (((i_974_ & 0xff00) * i_969_ >> 8 & 0xff00) + (i_969_ * (i_974_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[(i_936_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_970_)] = i_974_ + i_939_;
						}
						i += i_964_;
					}
				} else if (i_940_ == 2) {
					for (/**/; i_936_ <= i_938_; i_936_++) {
						int i_975_ = i >> 16;
						int i_976_ = i_936_ - i_942_;
						int i_977_ = i_941_ + is[i_976_];
						if ((i_975_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_975_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_975_ >= i_977_ && i_975_ < i_977_ + is_943_[i_976_]) {
							int i_978_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_936_) + i_975_);
							int i_979_ = (((Class_ra_Sub1) this).anIntArray7967[i_978_]);
							int i_980_ = i_979_ + i_939_;
							int i_981_ = (i_939_ & 0xff00ff) + (i_979_ & 0xff00ff);
							i_979_ = (i_980_ - i_981_ & 0x10000) + (i_981_ & 0x1000100);
							((Class_ra_Sub1) this).anIntArray7967[i_978_] = i_980_ - i_979_ | i_979_ - (i_979_ >>> 8);
						}
						i += i_964_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method5097(int i, int i_982_, int i_983_, int i_984_, int i_985_, int i_986_, Class_ta class_ta, int i_987_, int i_988_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_989_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_990_ = (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_988_ ? ((Class_ra_Sub1) this).anInt7976 * -1278653805 : i_988_);
			int i_991_ = ((63686679 * ((Class_ra_Sub1) this).anInt7977 < i_988_ + is.length) ? 63686679 * ((Class_ra_Sub1) this).anInt7977 : i_988_ + is.length);
			i_983_ -= i;
			i_984_ -= i_982_;
			if (i_983_ + i_984_ < 0) {
				i += i_983_;
				i_983_ = -i_983_;
				i_982_ += i_984_;
				i_984_ = -i_984_;
			}
			if (i_983_ > i_984_) {
				i_982_ <<= 16;
				i_982_ += 32768;
				i_984_ <<= 16;
				int i_992_ = (int) Math.floor(0.5 + ((double) i_984_ / (double) i_983_));
				i_983_ += i;
				if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
					i_982_ += (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i) * i_992_;
					i = -912871679 * ((Class_ra_Sub1) this).anInt7974;
				}
				if (i_983_ >= -1416794725 * ((Class_ra_Sub1) this).anInt7991)
					i_983_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1;
				int i_993_ = i_985_ >>> 24;
				if (0 == i_986_ || i_986_ == 1 && 255 == i_993_) {
					for (/**/; i <= i_983_; i++) {
						int i_994_ = i_982_ >> 16;
						int i_995_ = i_994_ - i_988_;
						if (i_994_ >= i_990_ && i_994_ < i_991_) {
							int i_996_ = is[i_995_] + i_987_;
							if (i >= i_996_ && i < is_989_[i_995_] + i_996_)
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_994_) + i] = i_985_;
						}
						i_982_ += i_992_;
					}
				} else if (1 == i_986_) {
					i_985_ = ((i_993_ << 24) + ((i_993_ * (i_985_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_985_ & 0xff00) * i_993_ >> 8 & 0xff00)));
					int i_997_ = 256 - i_993_;
					for (/**/; i <= i_983_; i++) {
						int i_998_ = i_982_ >> 16;
						int i_999_ = i_998_ - i_988_;
						if (i_998_ >= i_990_ && i_998_ < i_991_) {
							int i_1000_ = is[i_999_] + i_987_;
							if (i >= i_1000_ && i < is_989_[i_999_] + i_1000_) {
								int i_1001_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_998_);
								int i_1002_ = (((Class_ra_Sub1) this).anIntArray7967[i_1001_]);
								i_1002_ = (((i_1002_ & 0xff00) * i_997_ >> 8 & 0xff00) + (i_997_ * (i_1002_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_1001_] = i_1002_ + i_985_;
							}
						}
						i_982_ += i_992_;
					}
				} else if (2 == i_986_) {
					for (/**/; i <= i_983_; i++) {
						int i_1003_ = i_982_ >> 16;
						int i_1004_ = i_1003_ - i_988_;
						if (i_1003_ >= i_990_ && i_1003_ < i_991_) {
							int i_1005_ = is[i_1004_] + i_987_;
							if (i >= i_1005_ && i < i_1005_ + is_989_[i_1004_]) {
								int i_1006_ = i + (i_1003_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_1007_ = (((Class_ra_Sub1) this).anIntArray7967[i_1006_]);
								int i_1008_ = i_985_ + i_1007_;
								int i_1009_ = ((i_985_ & 0xff00ff) + (i_1007_ & 0xff00ff));
								i_1007_ = ((i_1009_ & 0x1000100) + (i_1008_ - i_1009_ & 0x10000));
								((Class_ra_Sub1) this).anIntArray7967[i_1006_] = i_1008_ - i_1007_ | i_1007_ - (i_1007_ >>> 8);
							}
						}
						i_982_ += i_992_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_983_ <<= 16;
				int i_1010_ = (int) Math.floor((double) i_983_ / (double) i_984_ + 0.5);
				i_984_ += i_982_;
				if (i_982_ < i_990_) {
					i += (i_990_ - i_982_) * i_1010_;
					i_982_ = i_990_;
				}
				if (i_984_ >= i_991_)
					i_984_ = i_991_ - 1;
				int i_1011_ = i_985_ >>> 24;
				if (i_986_ == 0 || 1 == i_986_ && i_1011_ == 255) {
					for (/**/; i_982_ <= i_984_; i_982_++) {
						int i_1012_ = i >> 16;
						int i_1013_ = i_982_ - i_988_;
						int i_1014_ = is[i_1013_] + i_987_;
						if ((i_1012_ >= ((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1012_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1012_ >= i_1014_ && i_1012_ < is_989_[i_1013_] + i_1014_)
							((Class_ra_Sub1) this).anIntArray7967[(692106883 * ((Class_ra_Sub1) this).anInt7971 * i_982_) + i_1012_] = i_985_;
						i += i_1010_;
					}
				} else if (i_986_ == 1) {
					i_985_ = ((i_1011_ * (i_985_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1011_ * (i_985_ & 0xff00) >> 8 & 0xff00) + (i_1011_ << 24));
					int i_1015_ = 256 - i_1011_;
					for (/**/; i_982_ <= i_984_; i_982_++) {
						int i_1016_ = i >> 16;
						int i_1017_ = i_982_ - i_988_;
						int i_1018_ = i_987_ + is[i_1017_];
						if ((i_1016_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_1016_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1016_ >= i_1018_ && i_1016_ < is_989_[i_1017_] + i_1018_) {
							int i_1019_ = (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_982_) + i_1016_;
							int i_1020_ = (((Class_ra_Sub1) this).anIntArray7967[i_1019_]);
							i_1020_ = (((i_1020_ & 0xff00) * i_1015_ >> 8 & 0xff00) + (i_1015_ * (i_1020_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[(i_982_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1016_)] = i_1020_ + i_985_;
						}
						i += i_1010_;
					}
				} else if (i_986_ == 2) {
					for (/**/; i_982_ <= i_984_; i_982_++) {
						int i_1021_ = i >> 16;
						int i_1022_ = i_982_ - i_988_;
						int i_1023_ = i_987_ + is[i_1022_];
						if ((i_1021_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && i_1021_ < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1021_ >= i_1023_ && i_1021_ < i_1023_ + is_989_[i_1022_]) {
							int i_1024_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_982_) + i_1021_);
							int i_1025_ = (((Class_ra_Sub1) this).anIntArray7967[i_1024_]);
							int i_1026_ = i_1025_ + i_985_;
							int i_1027_ = (i_985_ & 0xff00ff) + (i_1025_ & 0xff00ff);
							i_1025_ = ((i_1026_ - i_1027_ & 0x10000) + (i_1027_ & 0x1000100));
							((Class_ra_Sub1) this).anIntArray7967[i_1024_] = i_1026_ - i_1025_ | i_1025_ - (i_1025_ >>> 8);
						}
						i += i_1010_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method5098(int i, int i_1028_, int i_1029_, int i_1030_, int i_1031_, int i_1032_, Class_ta class_ta, int i_1033_, int i_1034_, int i_1035_, int i_1036_, int i_1037_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_1038_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_1039_ = (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_1034_ ? -1278653805 * ((Class_ra_Sub1) this).anInt7976 : i_1034_);
			int i_1040_ = ((((Class_ra_Sub1) this).anInt7977 * 63686679 < i_1034_ + is.length) ? ((Class_ra_Sub1) this).anInt7977 * 63686679 : i_1034_ + is.length);
			i_1037_ <<= 8;
			i_1035_ <<= 8;
			i_1036_ <<= 8;
			int i_1041_ = i_1035_ + i_1036_;
			i_1037_ %= i_1041_;
			i_1029_ -= i;
			i_1030_ -= i_1028_;
			if (i_1030_ + i_1029_ < 0) {
				int i_1042_ = (int) (Math.sqrt((double) (i_1030_ * i_1030_ + i_1029_ * i_1029_)) * 256.0);
				int i_1043_ = i_1042_ % i_1041_;
				i_1037_ = i_1035_ + i_1041_ - i_1037_ - i_1043_;
				i_1037_ %= i_1041_;
				if (i_1037_ < 0)
					i_1037_ += i_1041_;
				i += i_1029_;
				i_1029_ = -i_1029_;
				i_1028_ += i_1030_;
				i_1030_ = -i_1030_;
			}
			if (i_1029_ > i_1030_) {
				i_1028_ <<= 16;
				i_1028_ += 32768;
				i_1030_ <<= 16;
				int i_1044_ = (int) Math.floor((double) i_1030_ / (double) i_1029_ + 0.5);
				i_1029_ += i;
				int i_1045_ = i_1031_ >>> 24;
				int i_1046_ = (int) Math.sqrt((double) (65536 + (i_1044_ >> 8) * (i_1044_ >> 8)));
				if (0 == i_1032_ || i_1032_ == 1 && 255 == i_1045_) {
					while (i <= i_1029_) {
						int i_1047_ = i_1028_ >> 16;
						int i_1048_ = i_1047_ - i_1034_;
						if (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1047_ >= i_1039_ && i_1047_ < i_1040_ && i_1037_ < i_1035_) {
							int i_1049_ = is[i_1048_] + i_1033_;
							if (i >= i_1049_ && i < i_1049_ + is_1038_[i_1048_])
								((Class_ra_Sub1) this).anIntArray7967[i + (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1047_)] = i_1031_;
						}
						i_1028_ += i_1044_;
						i++;
						i_1037_ += i_1046_;
						i_1037_ %= i_1041_;
					}
				} else if (1 == i_1032_) {
					i_1031_ = ((i_1045_ << 24) + ((i_1045_ * (i_1031_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1031_ & 0xff00) * i_1045_ >> 8 & 0xff00)));
					int i_1050_ = 256 - i_1045_;
					while (i <= i_1029_) {
						int i_1051_ = i_1028_ >> 16;
						int i_1052_ = i_1051_ - i_1034_;
						if (i >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_1051_ >= i_1039_ && i_1051_ < i_1040_ && i_1037_ < i_1035_) {
							int i_1053_ = i_1033_ + is[i_1052_];
							if (i >= i_1053_ && i < is_1038_[i_1052_] + i_1053_) {
								int i_1054_ = i + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1051_);
								int i_1055_ = (((Class_ra_Sub1) this).anIntArray7967[i_1054_]);
								i_1055_ = ((i_1050_ * (i_1055_ & 0xff00) >> 8 & 0xff00) + (i_1050_ * (i_1055_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_1054_] = i_1055_ + i_1031_;
							}
						}
						i_1028_ += i_1044_;
						i++;
						i_1037_ += i_1046_;
						i_1037_ %= i_1041_;
					}
				} else if (i_1032_ == 2) {
					while (i <= i_1029_) {
						int i_1056_ = i_1028_ >> 16;
						int i_1057_ = i_1056_ - i_1034_;
						if (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1056_ >= i_1039_ && i_1056_ < i_1040_ && i_1037_ < i_1035_) {
							int i_1058_ = is[i_1057_] + i_1033_;
							if (i >= i_1058_ && i < i_1058_ + is_1038_[i_1057_]) {
								int i_1059_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1056_) + i);
								int i_1060_ = (((Class_ra_Sub1) this).anIntArray7967[i_1059_]);
								int i_1061_ = i_1031_ + i_1060_;
								int i_1062_ = ((i_1031_ & 0xff00ff) + (i_1060_ & 0xff00ff));
								i_1060_ = ((i_1061_ - i_1062_ & 0x10000) + (i_1062_ & 0x1000100));
								((Class_ra_Sub1) this).anIntArray7967[i_1059_] = i_1061_ - i_1060_ | i_1060_ - (i_1060_ >>> 8);
							}
						}
						i_1028_ += i_1044_;
						i++;
						i_1037_ += i_1046_;
						i_1037_ %= i_1041_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1029_ <<= 16;
				int i_1063_ = (int) Math.floor(0.5 + ((double) i_1029_ / (double) i_1030_));
				int i_1064_ = (int) Math.sqrt((double) ((i_1063_ >> 8) * (i_1063_ >> 8) + 65536));
				i_1030_ += i_1028_;
				int i_1065_ = i_1031_ >>> 24;
				if (i_1032_ == 0 || i_1032_ == 1 && i_1065_ == 255) {
					while (i_1028_ <= i_1030_) {
						int i_1066_ = i >> 16;
						int i_1067_ = i_1028_ - i_1034_;
						if (i_1028_ >= i_1039_ && i_1028_ < i_1040_ && i_1066_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1066_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_1037_ < i_1035_ && i_1066_ >= i_1033_ + is[i_1067_] && i_1066_ < is_1038_[i_1067_] + (i_1033_ + is[i_1067_]))
							((Class_ra_Sub1) this).anIntArray7967[i_1028_ * (692106883 * (((Class_ra_Sub1) this).anInt7971)) + i_1066_] = i_1031_;
						i += i_1063_;
						i_1028_++;
						i_1037_ += i_1064_;
						i_1037_ %= i_1041_;
					}
				} else if (1 == i_1032_) {
					i_1031_ = (((i_1031_ & 0xff00ff) * i_1065_ >> 8 & 0xff00ff) + ((i_1031_ & 0xff00) * i_1065_ >> 8 & 0xff00) + (i_1065_ << 24));
					int i_1068_ = 256 - i_1065_;
					while (i_1028_ <= i_1030_) {
						int i_1069_ = i >> 16;
						int i_1070_ = i_1028_ - i_1034_;
						if (i_1028_ >= i_1039_ && i_1028_ < i_1040_ && i_1069_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1069_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_1037_ < i_1035_ && i_1069_ >= i_1033_ + is[i_1070_] && (i_1069_ < is[i_1070_] + i_1033_ + is_1038_[i_1070_])) {
							int i_1071_ = i_1069_ + i_1028_ * ((((Class_ra_Sub1) this).anInt7971) * 692106883);
							int i_1072_ = (((Class_ra_Sub1) this).anIntArray7967[i_1071_]);
							i_1072_ = ((i_1068_ * (i_1072_ & 0xff00) >> 8 & 0xff00) + ((i_1072_ & 0xff00ff) * i_1068_ >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[(i_1069_ + i_1028_ * (((Class_ra_Sub1) this).anInt7971 * 692106883))] = i_1031_ + i_1072_;
						}
						i += i_1063_;
						i_1028_++;
						i_1037_ += i_1064_;
						i_1037_ %= i_1041_;
					}
				} else if (2 == i_1032_) {
					while (i_1028_ <= i_1030_) {
						int i_1073_ = i >> 16;
						int i_1074_ = i_1028_ - i_1034_;
						if (i_1028_ >= i_1039_ && i_1028_ < i_1040_ && i_1073_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1073_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_1037_ < i_1035_ && i_1073_ >= i_1033_ + is[i_1074_] && (i_1073_ < is[i_1074_] + i_1033_ + is_1038_[i_1074_])) {
							int i_1075_ = (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1028_) + i_1073_;
							int i_1076_ = (((Class_ra_Sub1) this).anIntArray7967[i_1075_]);
							int i_1077_ = i_1076_ + i_1031_;
							int i_1078_ = (i_1031_ & 0xff00ff) + (i_1076_ & 0xff00ff);
							i_1076_ = (i_1078_ & 0x1000100) + (i_1077_ - i_1078_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_1075_] = i_1077_ - i_1076_ | i_1076_ - (i_1076_ >>> 8);
						}
						i += i_1063_;
						i_1028_++;
						i_1037_ += i_1064_;
						i_1037_ %= i_1041_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public int method5099(int i, int i_1079_, int i_1080_, int i_1081_, int i_1082_, int i_1083_) {
		int i_1084_ = 0;
		float f = ((float) i_1080_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_1079_) + ((float) i * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14]))));
		float f_1085_ = (((float) i_1083_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_1082_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (float) i_1081_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]))));
		float f_1086_ = (((float) i * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_1079_) + (float) i_1080_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]));
		float f_1087_ = (((float) i_1081_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_1082_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * (float) i_1083_));
		if (f < -f_1086_ && f_1085_ < -f_1087_)
			i_1084_ |= 0x10;
		else if (f > f_1086_ && f_1085_ > f_1087_)
			i_1084_ |= 0x20;
		float f_1088_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_1079_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * (float) i)) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_1080_));
		float f_1089_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_1083_) + (((float) i_1081_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_1082_)));
		if (f_1088_ < -f_1086_ && f_1089_ < -f_1087_)
			i_1084_ |= 0x1;
		if (f_1088_ > f_1086_ && f_1089_ > f_1087_)
			i_1084_ |= 0x2;
		float f_1090_ = (((float) i_1079_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * (float) i) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_1080_));
		float f_1091_ = (((float) i_1081_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13] + ((float) i_1082_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_1083_));
		if (f_1090_ < -f_1086_ && f_1091_ < -f_1087_)
			i_1084_ |= 0x4;
		if (f_1090_ > f_1086_ && f_1091_ > f_1087_)
			i_1084_ |= 0x8;
		return i_1084_;
	}

	public void method4993(int i) {
		int i_1092_ = i - -1633713343 * ((Class_ra_Sub1) this).anInt7968;
		for (Class298_Sub4 class298_sub4 = (Class298_Sub4) ((Class_ra_Sub1) this).aClass348_7975.method4190(1895439164); null != class298_sub4; class298_sub4 = (Class298_Sub4) ((Class_ra_Sub1) this).aClass348_7975.method4191(-150689583)) {
			if (((Class298_Sub4) class298_sub4).aBoolean7189) {
				((Class298_Sub4) class298_sub4).anInt7188 += i_1092_;
				int i_1093_ = ((Class298_Sub4) class298_sub4).anInt7188 / 50;
				if (i_1093_ > 0) {
					Class53 class53 = anInterface_ma5299.method174((((Class298_Sub4) class298_sub4).anInt7190), 1049472051);
					float f = class53.aBoolean518 ? 64.0F : 128.0F;
					class298_sub4.method2855((int) ((float) i_1092_ / 1000.0F * (float) class53.aByte535 / 64.0F * f), (int) (f * ((float) class53.aByte509 * ((float) i_1092_ / 1000.0F) / 64.0F)));
					((Class298_Sub4) class298_sub4).anInt7188 -= 50 * i_1093_;
				}
				((Class298_Sub4) class298_sub4).aBoolean7189 = false;
			}
		}
		((Class_ra_Sub1) this).anInt7968 = -1260974911 * i;
		((Class_ra_Sub1) this).aClass348_7970.method4186(5, -253785523);
		((Class_ra_Sub1) this).aClass348_7975.method4186(5, -559517412);
	}

	public Class_v method5102(int i) {
		return null;
	}

	public void method5103(Class_v class_v) {
		/* empty */
	}

	public Class57 method5104(int i, int i_1094_, boolean bool, boolean bool_1095_) {
		if (bool)
			return new Class57_Sub1_Sub1(this, i, i_1094_);
		return new Class57_Sub1_Sub2(this, i, i_1094_);
	}

	public Class57 method5105(int[] is, int i, int i_1096_, int i_1097_, int i_1098_, boolean bool) {
		boolean bool_1099_ = false;
		int i_1100_ = i;
		while_117_: for (int i_1101_ = 0; i_1101_ < i_1098_; i_1101_++) {
			for (int i_1102_ = 0; i_1102_ < i_1097_; i_1102_++) {
				int i_1103_ = is[i_1100_++] >>> 24;
				if (i_1103_ != 0 && 255 != i_1103_) {
					bool_1099_ = true;
					break while_117_;
				}
			}
		}
		if (bool_1099_)
			return new Class57_Sub1_Sub1(this, is, i, i_1096_, i_1097_, i_1098_, bool);
		return new Class57_Sub1_Sub2(this, is, i, i_1096_, i_1097_, i_1098_, bool);
	}

	public Class57 method5106(int[] is, int i, int i_1104_, int i_1105_, int i_1106_, boolean bool) {
		boolean bool_1107_ = false;
		int i_1108_ = i;
		while_118_: for (int i_1109_ = 0; i_1109_ < i_1106_; i_1109_++) {
			for (int i_1110_ = 0; i_1110_ < i_1105_; i_1110_++) {
				int i_1111_ = is[i_1108_++] >>> 24;
				if (i_1111_ != 0 && 255 != i_1111_) {
					bool_1107_ = true;
					break while_118_;
				}
			}
		}
		if (bool_1107_)
			return new Class57_Sub1_Sub1(this, is, i, i_1104_, i_1105_, i_1106_, bool);
		return new Class57_Sub1_Sub2(this, is, i, i_1104_, i_1105_, i_1106_, bool);
	}

	public Class57 method5190(int[] is, int i, int i_1112_, int i_1113_, int i_1114_, boolean bool) {
		boolean bool_1115_ = false;
		int i_1116_ = i;
		while_119_: for (int i_1117_ = 0; i_1117_ < i_1114_; i_1117_++) {
			for (int i_1118_ = 0; i_1118_ < i_1113_; i_1118_++) {
				int i_1119_ = is[i_1116_++] >>> 24;
				if (i_1119_ != 0 && 255 != i_1119_) {
					bool_1115_ = true;
					break while_119_;
				}
			}
		}
		if (bool_1115_)
			return new Class57_Sub1_Sub1(this, is, i, i_1112_, i_1113_, i_1114_, bool);
		return new Class57_Sub1_Sub2(this, is, i, i_1112_, i_1113_, i_1114_, bool);
	}

	public Class57 method5107(Class89 class89, boolean bool) {
		int[] is = class89.anIntArray817;
		byte[] is_1120_ = class89.aByteArray818;
		int i = class89.anInt812;
		int i_1121_ = class89.anInt816;
		Class57_Sub1 class57_sub1;
		if (bool && null == class89.aByteArray819) {
			int[] is_1122_ = new int[is.length];
			byte[] is_1123_ = new byte[i_1121_ * i];
			for (int i_1124_ = 0; i_1124_ < i_1121_; i_1124_++) {
				int i_1125_ = i_1124_ * i;
				for (int i_1126_ = 0; i_1126_ < i; i_1126_++)
					is_1123_[i_1125_ + i_1126_] = is_1120_[i_1126_ + i_1125_];
			}
			for (int i_1127_ = 0; i_1127_ < is.length; i_1127_++)
				is_1122_[i_1127_] = is[i_1127_];
			class57_sub1 = new Class57_Sub1_Sub3(this, is_1123_, is_1122_, i, i_1121_);
		} else {
			int[] is_1128_ = new int[i_1121_ * i];
			byte[] is_1129_ = class89.aByteArray819;
			if (is_1129_ != null) {
				for (int i_1130_ = 0; i_1130_ < i_1121_; i_1130_++) {
					int i_1131_ = i * i_1130_;
					for (int i_1132_ = 0; i_1132_ < i; i_1132_++)
						is_1128_[i_1131_ + i_1132_] = (is[is_1120_[i_1131_ + i_1132_] & 0xff] | is_1129_[i_1132_ + i_1131_] << 24);
				}
				class57_sub1 = new Class57_Sub1_Sub1(this, is_1128_, i, i_1121_);
			} else {
				for (int i_1133_ = 0; i_1133_ < i_1121_; i_1133_++) {
					int i_1134_ = i_1133_ * i;
					for (int i_1135_ = 0; i_1135_ < i; i_1135_++) {
						int i_1136_ = is[is_1120_[i_1135_ + i_1134_] & 0xff];
						is_1128_[i_1134_ + i_1135_] = 0 != i_1136_ ? ~0xffffff | i_1136_ : 0;
					}
				}
				class57_sub1 = new Class57_Sub1_Sub2(this, is_1128_, i, i_1121_);
			}
		}
		class57_sub1.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return class57_sub1;
	}

	public Class57 method5101(Class89 class89, boolean bool) {
		int[] is = class89.anIntArray817;
		byte[] is_1137_ = class89.aByteArray818;
		int i = class89.anInt812;
		int i_1138_ = class89.anInt816;
		Class57_Sub1 class57_sub1;
		if (bool && null == class89.aByteArray819) {
			int[] is_1139_ = new int[is.length];
			byte[] is_1140_ = new byte[i_1138_ * i];
			for (int i_1141_ = 0; i_1141_ < i_1138_; i_1141_++) {
				int i_1142_ = i_1141_ * i;
				for (int i_1143_ = 0; i_1143_ < i; i_1143_++)
					is_1140_[i_1142_ + i_1143_] = is_1137_[i_1143_ + i_1142_];
			}
			for (int i_1144_ = 0; i_1144_ < is.length; i_1144_++)
				is_1139_[i_1144_] = is[i_1144_];
			class57_sub1 = new Class57_Sub1_Sub3(this, is_1140_, is_1139_, i, i_1138_);
		} else {
			int[] is_1145_ = new int[i_1138_ * i];
			byte[] is_1146_ = class89.aByteArray819;
			if (is_1146_ != null) {
				for (int i_1147_ = 0; i_1147_ < i_1138_; i_1147_++) {
					int i_1148_ = i * i_1147_;
					for (int i_1149_ = 0; i_1149_ < i; i_1149_++)
						is_1145_[i_1148_ + i_1149_] = (is[is_1137_[i_1148_ + i_1149_] & 0xff] | is_1146_[i_1149_ + i_1148_] << 24);
				}
				class57_sub1 = new Class57_Sub1_Sub1(this, is_1145_, i, i_1138_);
			} else {
				for (int i_1150_ = 0; i_1150_ < i_1138_; i_1150_++) {
					int i_1151_ = i_1150_ * i;
					for (int i_1152_ = 0; i_1152_ < i; i_1152_++) {
						int i_1153_ = is[is_1137_[i_1152_ + i_1151_] & 0xff];
						is_1145_[i_1151_ + i_1152_] = 0 != i_1153_ ? ~0xffffff | i_1153_ : 0;
					}
				}
				class57_sub1 = new Class57_Sub1_Sub2(this, is_1145_, i, i_1138_);
			}
		}
		class57_sub1.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return class57_sub1;
	}

	public void method5091(int i, int i_1154_, int i_1155_, int i_1156_, int i_1157_, int i_1158_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			i_1155_ -= i;
			i_1156_ -= i_1154_;
			if (0 == i_1156_) {
				if (i_1155_ >= 0)
					XA(i, i_1154_, 1 + i_1155_, i_1157_, i_1158_);
				else
					XA(i + i_1155_, i_1154_, -i_1155_ + 1, i_1157_, i_1158_);
			} else if (i_1155_ == 0) {
				if (i_1156_ >= 0)
					G(i, i_1154_, 1 + i_1156_, i_1157_, i_1158_);
				else
					G(i, i_1154_ + i_1156_, 1 + -i_1156_, i_1157_, i_1158_);
			} else {
				if (i_1155_ + i_1156_ < 0) {
					i += i_1155_;
					i_1155_ = -i_1155_;
					i_1154_ += i_1156_;
					i_1156_ = -i_1156_;
				}
				if (i_1155_ > i_1156_) {
					i_1154_ <<= 16;
					i_1154_ += 32768;
					i_1156_ <<= 16;
					int i_1159_ = (int) Math.floor(0.5 + ((double) i_1156_ / (double) i_1155_));
					i_1155_ += i;
					if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
						i_1154_ += i_1159_ * ((((Class_ra_Sub1) this).anInt7974 * -912871679) - i);
						i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					}
					if (i_1155_ >= ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_1155_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_1160_ = i_1157_ >>> 24;
					if (i_1158_ == 0 || i_1158_ == 1 && i_1160_ == 255) {
						for (/**/; i <= i_1155_; i++) {
							int i_1161_ = i_1154_ >> 16;
							if (i_1161_ >= (-1278653805 * ((Class_ra_Sub1) this).anInt7976) && i_1161_ < (((Class_ra_Sub1) this).anInt7977 * 63686679))
								((Class_ra_Sub1) this).anIntArray7967[i + i_1161_ * (692106883 * (((Class_ra_Sub1) this).anInt7971))] = i_1157_;
							i_1154_ += i_1159_;
						}
					} else if (1 == i_1158_) {
						i_1157_ = ((i_1160_ << 24) + ((i_1160_ * (i_1157_ & 0xff00) >> 8 & 0xff00) + (i_1160_ * (i_1157_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1162_ = 256 - i_1160_;
						for (/**/; i <= i_1155_; i++) {
							int i_1163_ = i_1154_ >> 16;
							if (i_1163_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1163_ < (((Class_ra_Sub1) this).anInt7977 * 63686679)) {
								int i_1164_ = i + (i_1163_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_1165_ = (((Class_ra_Sub1) this).anIntArray7967[i_1164_]);
								i_1165_ = ((i_1162_ * (i_1165_ & 0xff00) >> 8 & 0xff00) + ((i_1165_ & 0xff00ff) * i_1162_ >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_1164_] = i_1157_ + i_1165_;
							}
							i_1154_ += i_1159_;
						}
					} else if (2 == i_1158_) {
						for (/**/; i <= i_1155_; i++) {
							int i_1166_ = i_1154_ >> 16;
							if (i_1166_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1166_ < (((Class_ra_Sub1) this).anInt7977 * 63686679)) {
								int i_1167_ = ((i_1166_ * (692106883 * ((Class_ra_Sub1) this).anInt7971)) + i);
								int i_1168_ = (((Class_ra_Sub1) this).anIntArray7967[i_1167_]);
								int i_1169_ = i_1157_ + i_1168_;
								int i_1170_ = ((i_1168_ & 0xff00ff) + (i_1157_ & 0xff00ff));
								i_1168_ = ((i_1169_ - i_1170_ & 0x10000) + (i_1170_ & 0x1000100));
								((Class_ra_Sub1) this).anIntArray7967[i_1167_] = i_1169_ - i_1168_ | i_1168_ - (i_1168_ >>> 8);
							}
							i_1154_ += i_1159_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1155_ <<= 16;
					int i_1171_ = (int) Math.floor(0.5 + ((double) i_1155_ / (double) i_1156_));
					i_1156_ += i_1154_;
					if (i_1154_ < ((Class_ra_Sub1) this).anInt7976 * -1278653805) {
						i += (((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_1154_) * i_1171_;
						i_1154_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
					}
					if (i_1156_ >= 63686679 * ((Class_ra_Sub1) this).anInt7977)
						i_1156_ = ((Class_ra_Sub1) this).anInt7977 * 63686679 - 1;
					int i_1172_ = i_1157_ >>> 24;
					if (i_1158_ == 0 || i_1158_ == 1 && i_1172_ == 255) {
						for (/**/; i_1154_ <= i_1156_; i_1154_++) {
							int i_1173_ = i >> 16;
							if (i_1173_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1173_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725))
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1154_) + i_1173_] = i_1157_;
							i += i_1171_;
						}
					} else if (1 == i_1158_) {
						i_1157_ = (((i_1157_ & 0xff00ff) * i_1172_ >> 8 & 0xff00ff) + ((i_1157_ & 0xff00) * i_1172_ >> 8 & 0xff00) + (i_1172_ << 24));
						int i_1174_ = 256 - i_1172_;
						for (/**/; i_1154_ <= i_1156_; i_1154_++) {
							int i_1175_ = i >> 16;
							if (i_1175_ >= (-912871679 * ((Class_ra_Sub1) this).anInt7974) && i_1175_ < -1416794725 * ((Class_ra_Sub1) this).anInt7991) {
								int i_1176_ = (i_1175_ + (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1154_));
								int i_1177_ = (((Class_ra_Sub1) this).anIntArray7967[i_1176_]);
								i_1177_ = ((i_1174_ * (i_1177_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1174_ * (i_1177_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub1) this).anIntArray7967[i_1175_ + i_1154_ * (692106883 * ((Class_ra_Sub1) this).anInt7971)] = i_1157_ + i_1177_;
							}
							i += i_1171_;
						}
					} else if (2 == i_1158_) {
						for (/**/; i_1154_ <= i_1156_; i_1154_++) {
							int i_1178_ = i >> 16;
							if (i_1178_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1178_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725)) {
								int i_1179_ = (i_1178_ + (i_1154_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)));
								int i_1180_ = (((Class_ra_Sub1) this).anIntArray7967[i_1179_]);
								int i_1181_ = i_1157_ + i_1180_;
								int i_1182_ = ((i_1180_ & 0xff00ff) + (i_1157_ & 0xff00ff));
								i_1180_ = ((i_1181_ - i_1182_ & 0x10000) + (i_1182_ & 0x1000100));
								((Class_ra_Sub1) this).anIntArray7967[i_1179_] = i_1181_ - i_1180_ | i_1180_ - (i_1180_ >>> 8);
							}
							i += i_1171_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class_ta method5109(int i, int i_1183_, int[] is, int[] is_1184_) {
		return new Class_ta_Sub2(i, i_1183_, is, is_1184_);
	}

	public Class_ta method5110(int i, int i_1185_, int[] is, int[] is_1186_) {
		return new Class_ta_Sub2(i, i_1185_, is, is_1186_);
	}

	public void go(int i, Class_ta class_ta, int i_1187_, int i_1188_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_1189_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_1190_;
			if (63686679 * ((Class_ra_Sub1) this).anInt7977 < is.length + i_1188_)
				i_1190_ = ((Class_ra_Sub1) this).anInt7977 * 63686679 - i_1188_;
			else
				i_1190_ = is.length;
			int i_1191_;
			if (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_1188_) {
				i_1191_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_1188_;
				i_1188_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			} else
				i_1191_ = 0;
			if (i_1190_ - i_1191_ > 0) {
				int i_1192_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1188_;
				for (int i_1193_ = i_1191_; i_1193_ < i_1190_; i_1193_++) {
					int i_1194_ = i_1187_ + is[i_1193_];
					int i_1195_ = is_1189_[i_1193_];
					if (((Class_ra_Sub1) this).anInt7974 * -912871679 > i_1194_) {
						i_1195_ -= (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i_1194_);
						i_1194_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					}
					if (-1416794725 * ((Class_ra_Sub1) this).anInt7991 < i_1194_ + i_1195_)
						i_1195_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - i_1194_);
					i_1194_ += i_1192_;
					for (int i_1196_ = -i_1195_; i_1196_ < 0; i_1196_++)
						((Class_ra_Sub1) this).anIntArray7967[i_1194_++] = i;
					i_1192_ += ((Class_ra_Sub1) this).anInt7971 * 692106883;
				}
			}
		}
	}

	public void gg(int i, Class_ta class_ta, int i_1197_, int i_1198_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			int[] is = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
			int[] is_1199_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
			int i_1200_;
			if (63686679 * ((Class_ra_Sub1) this).anInt7977 < is.length + i_1198_)
				i_1200_ = ((Class_ra_Sub1) this).anInt7977 * 63686679 - i_1198_;
			else
				i_1200_ = is.length;
			int i_1201_;
			if (((Class_ra_Sub1) this).anInt7976 * -1278653805 > i_1198_) {
				i_1201_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_1198_;
				i_1198_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			} else
				i_1201_ = 0;
			if (i_1200_ - i_1201_ > 0) {
				int i_1202_ = 692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1198_;
				for (int i_1203_ = i_1201_; i_1203_ < i_1200_; i_1203_++) {
					int i_1204_ = i_1197_ + is[i_1203_];
					int i_1205_ = is_1199_[i_1203_];
					if (((Class_ra_Sub1) this).anInt7974 * -912871679 > i_1204_) {
						i_1205_ -= (-912871679 * ((Class_ra_Sub1) this).anInt7974 - i_1204_);
						i_1204_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					}
					if (-1416794725 * ((Class_ra_Sub1) this).anInt7991 < i_1204_ + i_1205_)
						i_1205_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - i_1204_);
					i_1204_ += i_1202_;
					for (int i_1206_ = -i_1205_; i_1206_ < 0; i_1206_++)
						((Class_ra_Sub1) this).anIntArray7967[i_1204_++] = i;
					i_1202_ += ((Class_ra_Sub1) this).anInt7971 * 692106883;
				}
			}
		}
	}

	public Class_xa method5087(int i, int i_1207_, int[][] is, int[][] is_1208_, int i_1209_, int i_1210_, int i_1211_) {
		return new Class_xa_Sub2(this, i_1210_, i_1211_, i, i_1207_, is, is_1208_, i_1209_);
	}

	public Class264 method5113(Class505 class505, Class89[] class89s, boolean bool) {
		int[] is = new int[class89s.length];
		int[] is_1212_ = new int[class89s.length];
		boolean bool_1213_ = false;
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].anInt812;
			is_1212_[i] = class89s[i].anInt816;
			if (class89s[i].aByteArray819 != null)
				bool_1213_ = true;
		}
		if (bool) {
			if (bool_1213_)
				return new Class264_Sub2(this, class505, class89s, is, is_1212_);
			return new Class264_Sub4(this, class505, class89s, is, is_1212_);
		}
		if (bool_1213_)
			throw new IllegalArgumentException("");
		return new Class264_Sub1(this, class505, class89s, is, is_1212_);
	}

	public void method5115(int i) {
		Class387_Sub1.anInt7787 = Class387_Sub1.anInt7810 = i;
		if (-922307687 * ((Class_ra_Sub1) this).anInt7999 > 1)
			throw new IllegalStateException();
		method5210(((Class_ra_Sub1) this).anInt7999 * -922307687);
		method5201(0);
	}

	public Class387 method5116(Model model, int i, int i_1214_, int i_1215_, int i_1216_) {
		return new Class387_Sub1(this, model, i, i_1215_, i_1216_, i_1214_);
	}

	public int method5126(int i, int i_1217_) {
		i |= 0x20800;
		return i & i_1217_ ^ i_1217_;
	}

	int method5214(int i) {
		return (anInterface_ma5299.method174(i, 1059221897).anInt528 * -2138060883);
	}

	public int method5120(int i, int i_1218_) {
		i |= 0x20800;
		return i & i_1218_ ^ i_1218_;
	}

	public Class_xa method5121(int i, int i_1219_, int[][] is, int[][] is_1220_, int i_1221_, int i_1222_, int i_1223_) {
		return new Class_xa_Sub2(this, i_1222_, i_1223_, i, i_1219_, is, is_1220_, i_1221_);
	}

	public void method5093(int i, int i_1224_, int i_1225_, int i_1226_, int i_1227_, int i_1228_) {
		XA(i, i_1224_, i_1225_, i_1227_, i_1228_);
		XA(i, i_1226_ + i_1224_ - 1, i_1225_, i_1227_, i_1228_);
		G(i, 1 + i_1224_, i_1226_ - 2, i_1227_, i_1228_);
		G(i + i_1225_ - 1, 1 + i_1224_, i_1226_ - 2, i_1227_, i_1228_);
	}

	public Class_xa method5123(int i, int i_1229_, int[][] is, int[][] is_1230_, int i_1231_, int i_1232_, int i_1233_) {
		return new Class_xa_Sub2(this, i_1232_, i_1233_, i, i_1229_, is, is_1230_, i_1231_);
	}

	public Matrix3f method5044() {
		return new Matrix3f(((Class_ra_Sub1) this).aClass222_7984);
	}

	public Matrix4f method5083() {
		Class15 class15 = method5202(Thread.currentThread());
		return ((Class15) class15).aClass233_190;
	}

	public Matrix3f method5183() {
		Class15 class15 = method5202(Thread.currentThread());
		return ((Class15) class15).aClass222_219;
	}

	void method5215(int i, int i_1234_, int i_1235_, int i_1236_, int i_1237_, int i_1238_, int i_1239_, int i_1240_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < -1416794725 * ((Class_ra_Sub1) this).anInt7991)) {
			int i_1241_ = ((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1234_ + i;
			int i_1242_ = i_1236_ >>> 24;
			int i_1243_ = i_1239_ + i_1238_;
			int i_1244_ = i_1240_ % i_1243_;
			if (0 == i_1237_ || 1 == i_1237_ && 255 == i_1242_) {
				int i_1245_ = 0;
				while (i_1245_ < i_1235_) {
					if ((i_1245_ + i_1234_ >= -1278653805 * ((Class_ra_Sub1) this).anInt7976) && (i_1234_ + i_1245_ < ((Class_ra_Sub1) this).anInt7977 * 63686679) && i_1244_ < i_1238_)
						((Class_ra_Sub1) this).anIntArray7967[(i_1245_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1241_)] = i_1236_;
					i_1245_++;
					i_1244_ = ++i_1244_ % i_1243_;
				}
			} else if (1 == i_1237_) {
				i_1236_ = ((i_1242_ * (i_1236_ & 0xff00) >> 8 & 0xff00) + ((i_1236_ & 0xff00ff) * i_1242_ >> 8 & 0xff00ff) + (i_1242_ << 24));
				int i_1246_ = 256 - i_1242_;
				int i_1247_ = 0;
				while (i_1247_ < i_1235_) {
					if ((i_1247_ + i_1234_ >= ((Class_ra_Sub1) this).anInt7976 * -1278653805) && (i_1247_ + i_1234_ < 63686679 * ((Class_ra_Sub1) this).anInt7977) && i_1244_ < i_1238_) {
						int i_1248_ = (i_1247_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1241_);
						int i_1249_ = ((Class_ra_Sub1) this).anIntArray7967[i_1248_];
						i_1249_ = (((i_1249_ & 0xff00ff) * i_1246_ >> 8 & 0xff00ff) + ((i_1249_ & 0xff00) * i_1246_ >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[i_1248_] = i_1236_ + i_1249_;
					}
					i_1247_++;
					i_1244_ = ++i_1244_ % i_1243_;
				}
			} else if (i_1237_ == 2) {
				int i_1250_ = 0;
				while (i_1250_ < i_1235_) {
					if ((i_1250_ + i_1234_ >= ((Class_ra_Sub1) this).anInt7976 * -1278653805) && (i_1234_ + i_1250_ < ((Class_ra_Sub1) this).anInt7977 * 63686679) && i_1244_ < i_1238_) {
						int i_1251_ = (i_1250_ * (((Class_ra_Sub1) this).anInt7971 * 692106883) + i_1241_);
						int i_1252_ = ((Class_ra_Sub1) this).anIntArray7967[i_1251_];
						int i_1253_ = i_1236_ + i_1252_;
						int i_1254_ = (i_1252_ & 0xff00ff) + (i_1236_ & 0xff00ff);
						i_1252_ = (i_1254_ & 0x1000100) + (i_1253_ - i_1254_ & 0x10000);
						((Class_ra_Sub1) this).anIntArray7967[i_1251_] = i_1253_ - i_1252_ | i_1252_ - (i_1252_ >>> 8);
					}
					i_1250_++;
					i_1244_ = ++i_1244_ % i_1243_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Matrix3f method5013() {
		Class15 class15 = method5202(Thread.currentThread());
		return ((Class15) class15).aClass222_219;
	}

	public int method5100(int i, int i_1255_, int i_1256_, int i_1257_, int i_1258_, int i_1259_) {
		int i_1260_ = 0;
		float f = ((float) i_1256_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_1255_) + ((float) i * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14]))));
		float f_1261_ = (((float) i_1259_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_1258_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (float) i_1257_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]))));
		float f_1262_ = (((float) i * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_1255_) + (float) i_1256_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]));
		float f_1263_ = (((float) i_1257_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_1258_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * (float) i_1259_));
		if (f < -f_1262_ && f_1261_ < -f_1263_)
			i_1260_ |= 0x10;
		else if (f > f_1262_ && f_1261_ > f_1263_)
			i_1260_ |= 0x20;
		float f_1264_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_1255_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * (float) i)) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_1256_));
		float f_1265_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_1259_) + (((float) i_1257_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_1258_)));
		if (f_1264_ < -f_1262_ && f_1265_ < -f_1263_)
			i_1260_ |= 0x1;
		if (f_1264_ > f_1262_ && f_1265_ > f_1263_)
			i_1260_ |= 0x2;
		float f_1266_ = (((float) i_1255_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * (float) i) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_1256_));
		float f_1267_ = (((float) i_1257_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13] + ((float) i_1258_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_1259_));
		if (f_1266_ < -f_1262_ && f_1267_ < -f_1263_)
			i_1260_ |= 0x4;
		if (f_1266_ > f_1262_ && f_1267_ > f_1263_)
			i_1260_ |= 0x8;
		return i_1260_;
	}

	public void o(int i, int i_1268_, int i_1269_, int i_1270_) {
		if (-912871679 * ((Class_ra_Sub1) this).anInt7974 < i)
			((Class_ra_Sub1) this).anInt7974 = i * -1291169535;
		if (((Class_ra_Sub1) this).anInt7976 * -1278653805 < i_1268_)
			((Class_ra_Sub1) this).anInt7976 = i_1268_ * 104031131;
		if (((Class_ra_Sub1) this).anInt7991 * -1416794725 > i_1269_)
			((Class_ra_Sub1) this).anInt7991 = i_1269_ * -1912131437;
		if (63686679 * ((Class_ra_Sub1) this).anInt7977 > i_1270_)
			((Class_ra_Sub1) this).anInt7977 = i_1270_ * 1656090535;
		method5209();
	}

	public Class298_Sub10 method5216(int i, int i_1271_, int i_1272_, int i_1273_, int i_1274_, float f) {
		return null;
	}

	void method5217(int i, int i_1275_, int i_1276_, int i_1277_, int i_1278_, int i_1279_, int i_1280_, int i_1281_) {
		if (((Class_ra_Sub1) this).anIntArray7967 != null && (i_1275_ >= ((Class_ra_Sub1) this).anInt7976 * -1278653805 && i_1275_ < 63686679 * ((Class_ra_Sub1) this).anInt7977)) {
			int i_1282_ = i_1275_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i;
			int i_1283_ = i_1277_ >>> 24;
			int i_1284_ = i_1280_ + i_1279_;
			int i_1285_ = i_1281_ % i_1284_;
			if (0 == i_1278_ || i_1278_ == 1 && 255 == i_1283_) {
				int i_1286_ = 0;
				while (i_1286_ < i_1276_) {
					if ((i_1286_ + i >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && (i_1286_ + i < -1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1285_ < i_1279_)
						((Class_ra_Sub1) this).anIntArray7967[(i_1286_ + i_1282_)] = i_1277_;
					i_1286_++;
					i_1285_ = ++i_1285_ % i_1284_;
				}
			} else if (1 == i_1278_) {
				i_1277_ = ((i_1283_ << 24) + (((i_1277_ & 0xff00ff) * i_1283_ >> 8 & 0xff00ff) + ((i_1277_ & 0xff00) * i_1283_ >> 8 & 0xff00)));
				int i_1287_ = 256 - i_1283_;
				int i_1288_ = 0;
				while (i_1288_ < i_1276_) {
					if ((i_1288_ + i >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && (i_1288_ + i < -1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1285_ < i_1279_) {
						int i_1289_ = (((Class_ra_Sub1) this).anIntArray7967[i_1282_ + i_1288_]);
						i_1289_ = (((i_1289_ & 0xff00ff) * i_1287_ >> 8 & 0xff00ff) + (i_1287_ * (i_1289_ & 0xff00) >> 8 & 0xff00));
						((Class_ra_Sub1) this).anIntArray7967[(i_1282_ + i_1288_)] = i_1277_ + i_1289_;
					}
					i_1288_++;
					i_1285_ = ++i_1285_ % i_1284_;
				}
			} else if (i_1278_ == 2) {
				int i_1290_ = 0;
				while (i_1290_ < i_1276_) {
					if ((i + i_1290_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974) && (i_1290_ + i < -1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1285_ < i_1279_) {
						int i_1291_ = (((Class_ra_Sub1) this).anIntArray7967[i_1282_ + i_1290_]);
						int i_1292_ = i_1277_ + i_1291_;
						int i_1293_ = (i_1277_ & 0xff00ff) + (i_1291_ & 0xff00ff);
						i_1291_ = (i_1292_ - i_1293_ & 0x10000) + (i_1293_ & 0x1000100);
						((Class_ra_Sub1) this).anIntArray7967[(i_1282_ + i_1290_)] = i_1292_ - i_1291_ | i_1291_ - (i_1291_ >>> 8);
					}
					i_1290_++;
					i_1285_ = ++i_1285_ % i_1284_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_1294_) {
		return new Class12(i, i_1294_);
	}

	public int za() {
		return 0;
	}

	public void em(boolean bool) {
		Class15 class15 = method5202(Thread.currentThread());
		((Class15) class15).aBoolean207 = bool;
	}

	public void fu(int i, int i_1295_, int i_1296_, int i_1297_, int i_1298_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967 && (i >= ((Class_ra_Sub1) this).anInt7974 * -912871679 && i < ((Class_ra_Sub1) this).anInt7991 * -1416794725)) {
			if (i_1295_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976) {
				i_1296_ -= (((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_1295_);
				i_1295_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			}
			if (i_1296_ + i_1295_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_1296_ = 63686679 * ((Class_ra_Sub1) this).anInt7977 - i_1295_;
			int i_1299_ = i + i_1295_ * (((Class_ra_Sub1) this).anInt7971 * 692106883);
			int i_1300_ = i_1297_ >>> 24;
			if (i_1298_ == 0 || 1 == i_1298_ && 255 == i_1300_) {
				for (int i_1301_ = 0; i_1301_ < i_1296_; i_1301_++)
					((Class_ra_Sub1) this).anIntArray7967[i_1299_ + i_1301_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)] = i_1297_;
			} else if (i_1298_ == 1) {
				i_1297_ = ((i_1300_ * (i_1297_ & 0xff00) >> 8 & 0xff00) + ((i_1297_ & 0xff00ff) * i_1300_ >> 8 & 0xff00ff) + (i_1300_ << 24));
				int i_1302_ = 256 - i_1300_;
				for (int i_1303_ = 0; i_1303_ < i_1296_; i_1303_++) {
					int i_1304_ = (i_1303_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1299_);
					int i_1305_ = ((Class_ra_Sub1) this).anIntArray7967[i_1304_];
					i_1305_ = ((i_1302_ * (i_1305_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1305_ & 0xff00) * i_1302_ >> 8 & 0xff00));
					((Class_ra_Sub1) this).anIntArray7967[i_1304_] = i_1305_ + i_1297_;
				}
			} else if (2 == i_1298_) {
				for (int i_1306_ = 0; i_1306_ < i_1296_; i_1306_++) {
					int i_1307_ = (i_1306_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1299_);
					int i_1308_ = ((Class_ra_Sub1) this).anIntArray7967[i_1307_];
					int i_1309_ = i_1297_ + i_1308_;
					int i_1310_ = (i_1308_ & 0xff00ff) + (i_1297_ & 0xff00ff);
					i_1308_ = (i_1310_ & 0x1000100) + (i_1309_ - i_1310_ & 0x10000);
					((Class_ra_Sub1) this).anIntArray7967[i_1307_] = i_1309_ - i_1308_ | i_1308_ - (i_1308_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method5129(Matrix3f class222) {
		((Class_ra_Sub1) this).aClass222_7984 = class222;
		method5208();
	}

	public boolean method5159() {
		return false;
	}

	public void method5131(Matrix3f class222) {
		((Class_ra_Sub1) this).aClass222_7984 = class222;
		method5208();
	}

	public void method5169(int i) {
		Class387_Sub1.anInt7787 = Class387_Sub1.anInt7810 = i;
		if (-922307687 * ((Class_ra_Sub1) this).anInt7999 > 1)
			throw new IllegalStateException();
		method5210(((Class_ra_Sub1) this).anInt7999 * -922307687);
		method5201(0);
	}

	public void method5133(Matrix4f class233) {
		((Class_ra_Sub1) this).aClass233_7986.method2142(class233);
		method5208();
	}

	public void method5134(Matrix4f class233) {
		((Class_ra_Sub1) this).aClass233_7986.method2142(class233);
		method5208();
	}

	public void hu(float f) {
		((Class_ra_Sub1) this).anInt7983 = -1954754855 * (int) (65535.0F * f);
	}

	public void hs(float f) {
		((Class_ra_Sub1) this).anInt7983 = -1954754855 * (int) (65535.0F * f);
	}

	public Class387 method5037(Model model, int i, int i_1311_, int i_1312_, int i_1313_) {
		return new Class387_Sub1(this, model, i, i_1312_, i_1313_, i_1311_);
	}

	public Class57 method5030(int[] is, int i, int i_1314_, int i_1315_, int i_1316_, boolean bool) {
		boolean bool_1317_ = false;
		int i_1318_ = i;
		while_120_: for (int i_1319_ = 0; i_1319_ < i_1316_; i_1319_++) {
			for (int i_1320_ = 0; i_1320_ < i_1315_; i_1320_++) {
				int i_1321_ = is[i_1318_++] >>> 24;
				if (i_1321_ != 0 && 255 != i_1321_) {
					bool_1317_ = true;
					break while_120_;
				}
			}
		}
		if (bool_1317_)
			return new Class57_Sub1_Sub1(this, is, i, i_1314_, i_1315_, i_1316_, bool);
		return new Class57_Sub1_Sub2(this, is, i, i_1314_, i_1315_, i_1316_, bool);
	}

	public Class52_Sub1 method5094() {
		return new Class52_Sub1_Sub1(this);
	}

	public void method5038(int i, int i_1322_, int i_1323_, int i_1324_, int i_1325_, int i_1326_, int i_1327_, int i_1328_, int i_1329_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			i_1323_ -= i;
			i_1324_ -= i_1322_;
			if (i_1324_ == 0) {
				if (i_1323_ >= 0)
					method5217(i, i_1322_, 1 + i_1323_, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				else {
					int i_1330_ = i_1328_ + i_1327_;
					i_1329_ %= i_1330_;
					i_1329_ = (i_1327_ + i_1330_ - i_1329_ - (1 + -i_1323_) % i_1330_);
					i_1329_ %= i_1330_;
					if (i_1329_ < 0)
						i_1329_ += i_1330_;
					method5217(i_1323_ + i, i_1322_, 1 + -i_1323_, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				}
			} else if (i_1323_ == 0) {
				if (i_1324_ >= 0)
					method5215(i, i_1322_, i_1324_ + 1, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				else {
					int i_1331_ = i_1328_ + i_1327_;
					i_1329_ %= i_1331_;
					i_1329_ = (i_1327_ + i_1331_ - i_1329_ - (-i_1324_ + 1) % i_1331_);
					i_1329_ %= i_1331_;
					if (i_1329_ < 0)
						i_1329_ += i_1331_;
					method5215(i, i_1324_ + i_1322_, 1 + -i_1324_, i_1325_, i_1326_, i_1327_, i_1328_, i_1329_);
				}
			} else {
				i_1329_ <<= 8;
				i_1327_ <<= 8;
				i_1328_ <<= 8;
				int i_1332_ = i_1328_ + i_1327_;
				i_1329_ %= i_1332_;
				if (i_1324_ + i_1323_ < 0) {
					int i_1333_ = (int) (Math.sqrt((double) (i_1324_ * i_1324_ + i_1323_ * i_1323_)) * 256.0);
					int i_1334_ = i_1333_ % i_1332_;
					i_1329_ = i_1332_ + i_1327_ - i_1329_ - i_1334_;
					i_1329_ %= i_1332_;
					if (i_1329_ < 0)
						i_1329_ += i_1332_;
					i += i_1323_;
					i_1323_ = -i_1323_;
					i_1322_ += i_1324_;
					i_1324_ = -i_1324_;
				}
				if (i_1323_ > i_1324_) {
					i_1322_ <<= 16;
					i_1322_ += 32768;
					i_1324_ <<= 16;
					int i_1335_ = (int) Math.floor(0.5 + ((double) i_1324_ / (double) i_1323_));
					i_1323_ += i;
					int i_1336_ = i_1325_ >>> 24;
					int i_1337_ = (int) Math.sqrt((double) (65536 + ((i_1335_ >> 8) * (i_1335_ >> 8))));
					if (0 == i_1326_ || 1 == i_1326_ && i_1336_ == 255) {
						while (i <= i_1323_) {
							int i_1338_ = i_1322_ >> 16;
							if (i >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1338_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1338_ < (((Class_ra_Sub1) this).anInt7977 * 63686679) && i_1329_ < i_1327_)
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1338_) + i] = i_1325_;
							i_1322_ += i_1335_;
							i++;
							i_1329_ += i_1337_;
							i_1329_ %= i_1332_;
						}
					} else if (i_1326_ == 1) {
						i_1325_ = ((i_1336_ << 24) + (((i_1325_ & 0xff00) * i_1336_ >> 8 & 0xff00) + (i_1336_ * (i_1325_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1339_ = 256 - i_1336_;
						while (i <= i_1323_) {
							int i_1340_ = i_1322_ >> 16;
							if (i >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_1340_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1340_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_1329_ < i_1327_) {
								int i_1341_ = i + i_1340_ * (692106883 * (((Class_ra_Sub1) this).anInt7971));
								int i_1342_ = (((Class_ra_Sub1) this).anIntArray7967[i_1341_]);
								i_1342_ = (((i_1342_ & 0xff00ff) * i_1339_ >> 8 & 0xff00ff) + (i_1339_ * (i_1342_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub1) this).anIntArray7967[i_1341_] = i_1342_ + i_1325_;
							}
							i_1322_ += i_1335_;
							i++;
							i_1329_ += i_1337_;
							i_1329_ %= i_1332_;
						}
					} else if (2 == i_1326_) {
						while (i <= i_1323_) {
							int i_1343_ = i_1322_ >> 16;
							if (i >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i < (-1416794725 * ((Class_ra_Sub1) this).anInt7991) && i_1343_ >= -1278653805 * ((Class_ra_Sub1) this).anInt7976 && i_1343_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_1329_ < i_1327_) {
								int i_1344_ = i + (i_1343_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_1345_ = (((Class_ra_Sub1) this).anIntArray7967[i_1344_]);
								int i_1346_ = i_1345_ + i_1325_;
								int i_1347_ = ((i_1345_ & 0xff00ff) + (i_1325_ & 0xff00ff));
								i_1345_ = ((i_1347_ & 0x1000100) + (i_1346_ - i_1347_ & 0x10000));
								((Class_ra_Sub1) this).anIntArray7967[i_1344_] = i_1346_ - i_1345_ | i_1345_ - (i_1345_ >>> 8);
							}
							i_1322_ += i_1335_;
							i++;
							i_1329_ += i_1337_;
							i_1329_ %= i_1332_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1323_ <<= 16;
					int i_1348_ = (int) Math.floor((double) i_1323_ / (double) i_1324_ + 0.5);
					i_1324_ += i_1322_;
					int i_1349_ = i_1325_ >>> 24;
					int i_1350_ = (int) Math.sqrt((double) ((i_1348_ >> 8) * (i_1348_ >> 8) + 65536));
					if (i_1326_ == 0 || 1 == i_1326_ && i_1349_ == 255) {
						while (i_1322_ <= i_1324_) {
							int i_1351_ = i >> 16;
							if (i_1322_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1322_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_1351_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i_1351_ < -1416794725 * ((Class_ra_Sub1) this).anInt7991 && i_1329_ < i_1327_)
								((Class_ra_Sub1) this).anIntArray7967[(i_1322_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)) + i_1351_] = i_1325_;
							i += i_1348_;
							i_1322_++;
							i_1329_ += i_1350_;
							i_1329_ %= i_1332_;
						}
					} else if (i_1326_ == 1) {
						i_1325_ = ((i_1349_ << 24) + (((i_1325_ & 0xff00ff) * i_1349_ >> 8 & 0xff00ff) + ((i_1325_ & 0xff00) * i_1349_ >> 8 & 0xff00)));
						int i_1352_ = 256 - i_1349_;
						while (i_1322_ <= i_1324_) {
							int i_1353_ = i >> 16;
							if (i_1322_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1322_ < 63686679 * (((Class_ra_Sub1) this).anInt7977) && i_1353_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i_1353_ < -1416794725 * ((Class_ra_Sub1) this).anInt7991 && i_1329_ < i_1327_) {
								int i_1354_ = ((692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1322_) + i_1353_);
								int i_1355_ = (((Class_ra_Sub1) this).anIntArray7967[i_1354_]);
								i_1355_ = ((i_1352_ * (i_1355_ & 0xff00) >> 8 & 0xff00) + (i_1352_ * (i_1355_ & 0xff00ff) >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[(692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1322_) + i_1353_] = i_1325_ + i_1355_;
							}
							i += i_1348_;
							i_1322_++;
							i_1329_ += i_1350_;
							i_1329_ %= i_1332_;
						}
					} else if (2 == i_1326_) {
						while (i_1322_ <= i_1324_) {
							int i_1356_ = i >> 16;
							if (i_1322_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1322_ < (((Class_ra_Sub1) this).anInt7977 * 63686679) && i_1356_ >= -912871679 * ((Class_ra_Sub1) this).anInt7974 && i_1356_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725) && i_1329_ < i_1327_) {
								int i_1357_ = (i_1356_ + i_1322_ * (692106883 * (((Class_ra_Sub1) this).anInt7971)));
								int i_1358_ = (((Class_ra_Sub1) this).anIntArray7967[i_1357_]);
								int i_1359_ = i_1358_ + i_1325_;
								int i_1360_ = ((i_1358_ & 0xff00ff) + (i_1325_ & 0xff00ff));
								i_1358_ = ((i_1360_ & 0x1000100) + (i_1359_ - i_1360_ & 0x10000));
								((Class_ra_Sub1) this).anIntArray7967[i_1357_] = i_1359_ - i_1358_ | i_1358_ - (i_1358_ >>> 8);
							}
							i += i_1348_;
							i_1322_++;
							i_1329_ += i_1350_;
							i_1329_ %= i_1332_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void he(int i, int i_1361_, int i_1362_) {
		for (int i_1363_ = 0; i_1363_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_1363_++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i_1363_];
			((Class15) class15).anInt184 = 1903335279 * (i & 0xffffff);
			int i_1364_ = 688695183 * ((Class15) class15).anInt184 >>> 16 & 0xff;
			if (i_1364_ < 2)
				i_1364_ = 2;
			int i_1365_ = 688695183 * ((Class15) class15).anInt184 >> 8 & 0xff;
			if (i_1365_ < 2)
				i_1365_ = 2;
			int i_1366_ = ((Class15) class15).anInt184 * 688695183 & 0xff;
			if (i_1366_ < 2)
				i_1366_ = 2;
			((Class15) class15).anInt184 = (i_1364_ << 16 | i_1365_ << 8 | i_1366_) * 1903335279;
			if (i_1361_ < 0)
				((Class15) class15).aBoolean216 = false;
			else
				((Class15) class15).aBoolean216 = true;
		}
	}

	public void method5137(boolean bool) {
		((Class_ra_Sub1) this).aBoolean8003 = bool;
		((Class_ra_Sub1) this).aClass348_7975.method4187();
	}

	public void method5184(boolean bool) {
		((Class_ra_Sub1) this).aBoolean8003 = bool;
		((Class_ra_Sub1) this).aClass348_7975.method4187();
	}

	public boolean method5074() {
		return false;
	}

	public void hg(int i, float f, float f_1367_, float f_1368_, float f_1369_, float f_1370_) {
		((Class_ra_Sub1) this).anInt7998 = (int) (f * 65535.0F) * 295067571;
		((Class_ra_Sub1) this).anInt7982 = -2064023785 * (int) (f_1367_ * 65535.0F);
		float f_1371_ = (float) Math.sqrt((double) (f_1369_ * f_1369_ + f_1368_ * f_1368_ + f_1370_ * f_1370_));
		((Class_ra_Sub1) this).anInt7978 = (int) (f_1368_ * 65535.0F / f_1371_) * -666627277;
		((Class_ra_Sub1) this).anInt7979 = (int) (65535.0F * f_1369_ / f_1371_) * 1031065997;
		((Class_ra_Sub1) this).anInt7981 = 1231602687 * (int) (f_1370_ * 65535.0F / f_1371_);
	}

	public Class66 method5140(int i, int i_1372_, int i_1373_, int i_1374_, int i_1375_, int i_1376_) {
		return null;
	}

	public boolean method5081() {
		return false;
	}

	public Class66 method5084(int i, int i_1377_, int i_1378_, int i_1379_, int i_1380_, int i_1381_) {
		return null;
	}

	public Class66 method4986(Class66 class66, Class66 class66_1382_, float f, Class66 class66_1383_) {
		return null;
	}

	public Class66 method5142(Class66 class66, Class66 class66_1384_, float f, Class66 class66_1385_) {
		return null;
	}

	public void method5189(Class66 class66) {
		/* empty */
	}

	public int method5025(int i, int i_1386_, int i_1387_, int i_1388_, int i_1389_, int i_1390_) {
		int i_1391_ = 0;
		float f = ((float) i_1387_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_1386_) + ((float) i * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14]))));
		float f_1392_ = (((float) i_1390_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * (float) i_1389_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (float) i_1388_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2]))));
		float f_1393_ = (((float) i * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_1386_) + (float) i_1387_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]));
		float f_1394_ = (((float) i_1388_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7] * (float) i_1389_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * (float) i_1390_));
		if (f < -f_1393_ && f_1392_ < -f_1394_)
			i_1391_ |= 0x10;
		else if (f > f_1393_ && f_1392_ > f_1394_)
			i_1391_ |= 0x20;
		float f_1395_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_1386_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * (float) i)) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_1387_));
		float f_1396_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8] * (float) i_1390_) + (((float) i_1388_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4] * (float) i_1389_)));
		if (f_1395_ < -f_1393_ && f_1396_ < -f_1394_)
			i_1391_ |= 0x1;
		if (f_1395_ > f_1393_ && f_1396_ > f_1394_)
			i_1391_ |= 0x2;
		float f_1397_ = (((float) i_1386_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * (float) i) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_1387_));
		float f_1398_ = (((float) i_1388_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1]) + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13] + ((float) i_1389_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * (float) i_1390_));
		if (f_1397_ < -f_1393_ && f_1398_ < -f_1394_)
			i_1391_ |= 0x4;
		if (f_1397_ > f_1393_ && f_1398_ > f_1394_)
			i_1391_ |= 0x8;
		return i_1391_;
	}

	public void method5145() {
		/* empty */
	}

	public void c(int i, int i_1399_, int i_1400_) {
		for (int i_1401_ = 0; i_1401_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_1401_++) {
			Class15 class15 = ((Class_ra_Sub1) this).aClass15Array8001[i_1401_];
			((Class15) class15).anInt184 = 1903335279 * (i & 0xffffff);
			int i_1402_ = 688695183 * ((Class15) class15).anInt184 >>> 16 & 0xff;
			if (i_1402_ < 2)
				i_1402_ = 2;
			int i_1403_ = 688695183 * ((Class15) class15).anInt184 >> 8 & 0xff;
			if (i_1403_ < 2)
				i_1403_ = 2;
			int i_1404_ = ((Class15) class15).anInt184 * 688695183 & 0xff;
			if (i_1404_ < 2)
				i_1404_ = 2;
			((Class15) class15).anInt184 = (i_1402_ << 16 | i_1403_ << 8 | i_1404_) * 1903335279;
			if (i_1399_ < 0)
				((Class15) class15).aBoolean216 = false;
			else
				((Class15) class15).aBoolean216 = true;
		}
	}

	public boolean method5119() {
		return false;
	}

	public int method5170(int i, int i_1405_) {
		return i | i_1405_;
	}

	public void method5218(int[] is) {
		is[0] = 692106883 * ((Class_ra_Sub1) this).anInt7971;
		is[1] = ((Class_ra_Sub1) this).anInt7972 * 918677455;
	}

	void method5150(float f, float f_1406_, float f_1407_, float f_1408_, float f_1409_, float f_1410_) {
		/* empty */
	}

	public void method4991(int i, int i_1411_, int i_1412_, int i_1413_) {
		/* empty */
	}

	public void method5175() {
		/* empty */
	}

	public void method5153() {
		/* empty */
	}

	public void method5154() {
		/* empty */
	}

	public void method5155(int i, Class78 class78) {
		for (int i_1414_ = 0; i_1414_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_1414_++) {
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1414_]).anInt185 = 329691201 * (((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i_1414_])).anInt184);
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1414_]).anInt196 = 1450505545 * i;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1414_]).anInt184 = class78.anInt726 * -1634857629;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1414_]).anInt215 = class78.anInt725 * -296597081;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1414_]).aBoolean186 = true;
		}
	}

	public void method5156(int i, Class78 class78) {
		for (int i_1415_ = 0; i_1415_ < ((Class_ra_Sub1) this).aClass15Array8001.length; i_1415_++) {
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1415_]).anInt185 = 329691201 * (((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i_1415_])).anInt184);
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1415_]).anInt196 = 1450505545 * i;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1415_]).anInt184 = class78.anInt726 * -1634857629;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1415_]).anInt215 = class78.anInt725 * -296597081;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i_1415_]).aBoolean186 = true;
		}
	}

	public Class57 method5125(Class89 class89, boolean bool) {
		int[] is = class89.anIntArray817;
		byte[] is_1416_ = class89.aByteArray818;
		int i = class89.anInt812;
		int i_1417_ = class89.anInt816;
		Class57_Sub1 class57_sub1;
		if (bool && null == class89.aByteArray819) {
			int[] is_1418_ = new int[is.length];
			byte[] is_1419_ = new byte[i_1417_ * i];
			for (int i_1420_ = 0; i_1420_ < i_1417_; i_1420_++) {
				int i_1421_ = i_1420_ * i;
				for (int i_1422_ = 0; i_1422_ < i; i_1422_++)
					is_1419_[i_1421_ + i_1422_] = is_1416_[i_1422_ + i_1421_];
			}
			for (int i_1423_ = 0; i_1423_ < is.length; i_1423_++)
				is_1418_[i_1423_] = is[i_1423_];
			class57_sub1 = new Class57_Sub1_Sub3(this, is_1419_, is_1418_, i, i_1417_);
		} else {
			int[] is_1424_ = new int[i_1417_ * i];
			byte[] is_1425_ = class89.aByteArray819;
			if (is_1425_ != null) {
				for (int i_1426_ = 0; i_1426_ < i_1417_; i_1426_++) {
					int i_1427_ = i * i_1426_;
					for (int i_1428_ = 0; i_1428_ < i; i_1428_++)
						is_1424_[i_1427_ + i_1428_] = (is[is_1416_[i_1427_ + i_1428_] & 0xff] | is_1425_[i_1428_ + i_1427_] << 24);
				}
				class57_sub1 = new Class57_Sub1_Sub1(this, is_1424_, i, i_1417_);
			} else {
				for (int i_1429_ = 0; i_1429_ < i_1417_; i_1429_++) {
					int i_1430_ = i_1429_ * i;
					for (int i_1431_ = 0; i_1431_ < i; i_1431_++) {
						int i_1432_ = is[is_1416_[i_1431_ + i_1430_] & 0xff];
						is_1424_[i_1430_ + i_1431_] = 0 != i_1432_ ? ~0xffffff | i_1432_ : 0;
					}
				}
				class57_sub1 = new Class57_Sub1_Sub2(this, is_1424_, i, i_1417_);
			}
		}
		class57_sub1.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return class57_sub1;
	}

	public void ih() {
		for (int i = 0; i < ((Class_ra_Sub1) this).aClass15Array8001.length; i++) {
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).anInt184 = 950886337 * ((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i])).anInt185;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).aBoolean186 = false;
		}
	}

	public void iv() {
		for (int i = 0; i < ((Class_ra_Sub1) this).aClass15Array8001.length; i++) {
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).anInt184 = 950886337 * ((Class15) (((Class_ra_Sub1) this).aClass15Array8001[i])).anInt185;
			((Class15) ((Class_ra_Sub1) this).aClass15Array8001[i]).aBoolean186 = false;
		}
	}

	public Class57 method5029(int i, int i_1433_, boolean bool, boolean bool_1434_) {
		if (bool)
			return new Class57_Sub1_Sub1(this, i, i_1433_);
		return new Class57_Sub1_Sub2(this, i, i_1433_);
	}

	public void method5158(int i, int i_1435_, float f, int i_1436_, int i_1437_, float f_1438_, int i_1439_, int i_1440_, float f_1441_, int i_1442_, int i_1443_, int i_1444_, int i_1445_) {
		boolean bool = null != ((Class_ra_Sub1) this).anIntArray7967;
		boolean bool_1446_ = ((Class_ra_Sub1) this).aFloatArray7973 != null;
		if (bool || bool_1446_) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			((Class2) class2).aBoolean16 = false;
			i -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_1436_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_1439_ -= -912871679 * ((Class_ra_Sub1) this).anInt7974;
			i_1435_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_1437_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			i_1440_ -= ((Class_ra_Sub1) this).anInt7976 * -1278653805;
			((Class2) class2).aBoolean20 = (i < 0 || i > ((Class2) class2).anInt22 || i_1436_ < 0 || i_1436_ > ((Class2) class2).anInt22 || i_1439_ < 0 || i_1439_ > ((Class2) class2).anInt22);
			int i_1447_ = i_1442_ >>> 24;
			if (0 == i_1445_ || i_1445_ == 1 && 255 == i_1447_) {
				((Class2) class2).anInt19 = 0;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_1446_, false, (float) i_1435_, (float) i_1437_, (float) i_1440_, (float) i, (float) i_1436_, (float) i_1439_, f, f_1438_, f_1441_, i_1442_, i_1443_, i_1444_);
			} else if (1 == i_1445_) {
				((Class2) class2).anInt19 = 255 - i_1447_;
				((Class2) class2).aBoolean48 = false;
				class2.method292(bool, bool_1446_, false, (float) i_1435_, (float) i_1437_, (float) i_1440_, (float) i, (float) i_1436_, (float) i_1439_, f, f_1438_, f_1441_, i_1442_, i_1443_, i_1444_);
			} else if (2 == i_1445_) {
				((Class2) class2).anInt19 = 128;
				((Class2) class2).aBoolean48 = true;
				class2.method292(bool, bool_1446_, false, (float) i_1435_, (float) i_1437_, (float) i_1440_, (float) i, (float) i_1436_, (float) i_1439_, f, f_1438_, f_1441_, i_1442_, i_1443_, i_1444_);
			} else
				throw new IllegalArgumentException();
			((Class2) class2).aBoolean16 = true;
		}
	}

	public void ei() {
		((Class_ra_Sub1) this).anInt7974 = 0;
		((Class_ra_Sub1) this).anInt7976 = 0;
		((Class_ra_Sub1) this).anInt7991 = 2046188857 * ((Class_ra_Sub1) this).anInt7971;
		((Class_ra_Sub1) this).anInt7977 = -482117367 * ((Class_ra_Sub1) this).anInt7972;
		method5209();
	}

	public Class66 method5028(int i, int i_1448_, int i_1449_, int i_1450_, int i_1451_, int i_1452_) {
		return null;
	}

	public int method5017(int i, int i_1453_) {
		i |= 0x20800;
		return i & i_1453_ ^ i_1453_;
	}

	public void method5162(float f, float f_1454_, float f_1455_, float[] fs) {
		float f_1456_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11] * f_1455_) + (f * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + f_1454_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		float f_1457_ = ((f_1455_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0] * f) + f_1454_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4])));
		float f_1458_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5] * f_1454_) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9] * f_1455_));
		float f_1459_ = (f * ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2] + ((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6] * f_1454_) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10] * f_1455_));
		fs[0] = (f_1457_ * ((Class_ra_Sub1) this).aFloat7993 / f_1456_ + ((Class_ra_Sub1) this).aFloat8005);
		fs[1] = (((Class_ra_Sub1) this).aFloat7996 + ((Class_ra_Sub1) this).aFloat7995 * f_1458_ / f_1456_);
		fs[2] = f_1459_;
	}

	Class_ra_Sub1(Canvas canvas, Interface_ma interface_ma, int i, int i_1460_) {
		this(interface_ma);
		try {
			method5163(canvas, i, i_1460_, 288309230);
			method5003(canvas, (byte) -11);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method5136(565330132);
			throw new RuntimeException("");
		}
	}

	public void method5164(float f, float f_1461_, float f_1462_, float[] fs) {
		float f_1463_ = ((f_1462_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[10]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[2] * f + ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[14] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[6] * f_1461_)));
		float f_1464_ = ((f_1462_ * ((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[11]) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[15] + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[3] * f) + f_1461_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[7])));
		if (f_1463_ < -f_1464_ || f_1463_ > f_1464_) {
			float[] fs_1465_ = fs;
			float[] fs_1466_ = fs;
			fs[2] = Float.NaN;
			fs_1466_[1] = Float.NaN;
			fs_1465_[0] = Float.NaN;
		} else {
			float f_1467_ = (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[12] + f * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[0]) + f_1461_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[4]) + f_1462_ * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[8]));
			if (f_1467_ < -f_1464_ || f_1467_ > f_1464_) {
				float[] fs_1468_ = fs;
				float[] fs_1469_ = fs;
				fs[2] = Float.NaN;
				fs_1469_[1] = Float.NaN;
				fs_1468_[0] = Float.NaN;
			} else {
				float f_1470_ = ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[5]) * f_1461_ + ((((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[13]) + f * (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[1])) + (((Class_ra_Sub1) this).aClass233_7987.aFloatArray2594[9]) * f_1462_);
				if (f_1470_ < -f_1464_ || f_1470_ > f_1464_) {
					float[] fs_1471_ = fs;
					float[] fs_1472_ = fs;
					fs[2] = Float.NaN;
					fs_1472_[1] = Float.NaN;
					fs_1471_[0] = Float.NaN;
				} else {
					float f_1473_ = ((((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[10]) * f_1462_ + (f * (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[2]) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[14]) + (((Class_ra_Sub1) this).aClass233_8000.aFloatArray2594[6]) * f_1461_));
					fs[0] = (((Class_ra_Sub1) this).aFloat8005 + (f_1467_ * ((Class_ra_Sub1) this).aFloat7993 / f_1464_));
					fs[1] = (((Class_ra_Sub1) this).aFloat7995 * f_1470_ / f_1464_) + ((Class_ra_Sub1) this).aFloat7996;
					fs[2] = f_1473_;
				}
			}
		}
	}

	public Class52_Sub1 method5138() {
		return new Class52_Sub1_Sub1(this);
	}

	public Interface8_Impl1_Impl2 method5165(int i, int i_1474_) {
		return new Class12(i, i_1474_);
	}

	public boolean method5166() {
		return false;
	}

	public void method5167(int i, int i_1475_, int i_1476_, int i_1477_, int i_1478_, int i_1479_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			i_1476_ -= i;
			i_1477_ -= i_1475_;
			if (0 == i_1477_) {
				if (i_1476_ >= 0)
					XA(i, i_1475_, 1 + i_1476_, i_1478_, i_1479_);
				else
					XA(i + i_1476_, i_1475_, -i_1476_ + 1, i_1478_, i_1479_);
			} else if (i_1476_ == 0) {
				if (i_1477_ >= 0)
					G(i, i_1475_, 1 + i_1477_, i_1478_, i_1479_);
				else
					G(i, i_1475_ + i_1477_, 1 + -i_1477_, i_1478_, i_1479_);
			} else {
				if (i_1476_ + i_1477_ < 0) {
					i += i_1476_;
					i_1476_ = -i_1476_;
					i_1475_ += i_1477_;
					i_1477_ = -i_1477_;
				}
				if (i_1476_ > i_1477_) {
					i_1475_ <<= 16;
					i_1475_ += 32768;
					i_1477_ <<= 16;
					int i_1480_ = (int) Math.floor(0.5 + ((double) i_1477_ / (double) i_1476_));
					i_1476_ += i;
					if (i < ((Class_ra_Sub1) this).anInt7974 * -912871679) {
						i_1475_ += i_1480_ * ((((Class_ra_Sub1) this).anInt7974 * -912871679) - i);
						i = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					}
					if (i_1476_ >= ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_1476_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_1481_ = i_1478_ >>> 24;
					if (i_1479_ == 0 || i_1479_ == 1 && i_1481_ == 255) {
						for (/**/; i <= i_1476_; i++) {
							int i_1482_ = i_1475_ >> 16;
							if (i_1482_ >= (-1278653805 * ((Class_ra_Sub1) this).anInt7976) && i_1482_ < (((Class_ra_Sub1) this).anInt7977 * 63686679))
								((Class_ra_Sub1) this).anIntArray7967[i + i_1482_ * (692106883 * (((Class_ra_Sub1) this).anInt7971))] = i_1478_;
							i_1475_ += i_1480_;
						}
					} else if (1 == i_1479_) {
						i_1478_ = ((i_1481_ << 24) + ((i_1481_ * (i_1478_ & 0xff00) >> 8 & 0xff00) + (i_1481_ * (i_1478_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1483_ = 256 - i_1481_;
						for (/**/; i <= i_1476_; i++) {
							int i_1484_ = i_1475_ >> 16;
							if (i_1484_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1484_ < (((Class_ra_Sub1) this).anInt7977 * 63686679)) {
								int i_1485_ = i + (i_1484_ * (((Class_ra_Sub1) this).anInt7971 * 692106883));
								int i_1486_ = (((Class_ra_Sub1) this).anIntArray7967[i_1485_]);
								i_1486_ = ((i_1483_ * (i_1486_ & 0xff00) >> 8 & 0xff00) + ((i_1486_ & 0xff00ff) * i_1483_ >> 8 & 0xff00ff));
								((Class_ra_Sub1) this).anIntArray7967[i_1485_] = i_1478_ + i_1486_;
							}
							i_1475_ += i_1480_;
						}
					} else if (2 == i_1479_) {
						for (/**/; i <= i_1476_; i++) {
							int i_1487_ = i_1475_ >> 16;
							if (i_1487_ >= (((Class_ra_Sub1) this).anInt7976 * -1278653805) && i_1487_ < (((Class_ra_Sub1) this).anInt7977 * 63686679)) {
								int i_1488_ = ((i_1487_ * (692106883 * ((Class_ra_Sub1) this).anInt7971)) + i);
								int i_1489_ = (((Class_ra_Sub1) this).anIntArray7967[i_1488_]);
								int i_1490_ = i_1478_ + i_1489_;
								int i_1491_ = ((i_1489_ & 0xff00ff) + (i_1478_ & 0xff00ff));
								i_1489_ = ((i_1490_ - i_1491_ & 0x10000) + (i_1491_ & 0x1000100));
								((Class_ra_Sub1) this).anIntArray7967[i_1488_] = i_1490_ - i_1489_ | i_1489_ - (i_1489_ >>> 8);
							}
							i_1475_ += i_1480_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1476_ <<= 16;
					int i_1492_ = (int) Math.floor(0.5 + ((double) i_1476_ / (double) i_1477_));
					i_1477_ += i_1475_;
					if (i_1475_ < ((Class_ra_Sub1) this).anInt7976 * -1278653805) {
						i += (((Class_ra_Sub1) this).anInt7976 * -1278653805 - i_1475_) * i_1492_;
						i_1475_ = ((Class_ra_Sub1) this).anInt7976 * -1278653805;
					}
					if (i_1477_ >= 63686679 * ((Class_ra_Sub1) this).anInt7977)
						i_1477_ = ((Class_ra_Sub1) this).anInt7977 * 63686679 - 1;
					int i_1493_ = i_1478_ >>> 24;
					if (i_1479_ == 0 || i_1479_ == 1 && i_1493_ == 255) {
						for (/**/; i_1475_ <= i_1477_; i_1475_++) {
							int i_1494_ = i >> 16;
							if (i_1494_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1494_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725))
								((Class_ra_Sub1) this).anIntArray7967[(((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1475_) + i_1494_] = i_1478_;
							i += i_1492_;
						}
					} else if (1 == i_1479_) {
						i_1478_ = (((i_1478_ & 0xff00ff) * i_1493_ >> 8 & 0xff00ff) + ((i_1478_ & 0xff00) * i_1493_ >> 8 & 0xff00) + (i_1493_ << 24));
						int i_1495_ = 256 - i_1493_;
						for (/**/; i_1475_ <= i_1477_; i_1475_++) {
							int i_1496_ = i >> 16;
							if (i_1496_ >= (-912871679 * ((Class_ra_Sub1) this).anInt7974) && i_1496_ < -1416794725 * ((Class_ra_Sub1) this).anInt7991) {
								int i_1497_ = (i_1496_ + (692106883 * ((Class_ra_Sub1) this).anInt7971 * i_1475_));
								int i_1498_ = (((Class_ra_Sub1) this).anIntArray7967[i_1497_]);
								i_1498_ = ((i_1495_ * (i_1498_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1495_ * (i_1498_ & 0xff00) >> 8 & 0xff00));
								((Class_ra_Sub1) this).anIntArray7967[i_1496_ + i_1475_ * (692106883 * ((Class_ra_Sub1) this).anInt7971)] = i_1478_ + i_1498_;
							}
							i += i_1492_;
						}
					} else if (2 == i_1479_) {
						for (/**/; i_1475_ <= i_1477_; i_1475_++) {
							int i_1499_ = i >> 16;
							if (i_1499_ >= (((Class_ra_Sub1) this).anInt7974 * -912871679) && i_1499_ < (((Class_ra_Sub1) this).anInt7991 * -1416794725)) {
								int i_1500_ = (i_1499_ + (i_1475_ * (((Class_ra_Sub1) this).anInt7971 * 692106883)));
								int i_1501_ = (((Class_ra_Sub1) this).anIntArray7967[i_1500_]);
								int i_1502_ = i_1478_ + i_1501_;
								int i_1503_ = ((i_1501_ & 0xff00ff) + (i_1478_ & 0xff00ff));
								i_1501_ = ((i_1502_ - i_1503_ & 0x10000) + (i_1503_ & 0x1000100));
								((Class_ra_Sub1) this).anIntArray7967[i_1500_] = i_1502_ - i_1501_ | i_1501_ - (i_1501_ >>> 8);
							}
							i += i_1492_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method5168(int i, int i_1504_, int i_1505_, int i_1506_, int i_1507_, int i_1508_, int i_1509_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = ((Class15) class15).aClass2_192;
			int i_1510_ = i_1505_ - i;
			int i_1511_ = i_1506_ - i_1504_;
			int i_1512_ = i_1510_ >= 0 ? i_1510_ : -i_1510_;
			int i_1513_ = i_1511_ >= 0 ? i_1511_ : -i_1511_;
			int i_1514_ = i_1512_;
			if (i_1514_ < i_1513_)
				i_1514_ = i_1513_;
			if (0 != i_1514_) {
				int i_1515_ = (i_1510_ << 16) / i_1514_;
				int i_1516_ = (i_1511_ << 16) / i_1514_;
				i_1510_ += i_1515_ >> 16;
				i_1511_ += i_1516_ >> 16;
				if (i_1516_ <= i_1515_)
					i_1515_ = -i_1515_;
				else
					i_1516_ = -i_1516_;
				int i_1517_ = i_1516_ * i_1508_ >> 17;
				int i_1518_ = i_1516_ * i_1508_ + 1 >> 17;
				int i_1519_ = i_1515_ * i_1508_ >> 17;
				int i_1520_ = 1 + i_1508_ * i_1515_ >> 17;
				i -= class2.method287();
				i_1504_ -= class2.method288();
				int i_1521_ = i_1517_ + i;
				int i_1522_ = i - i_1518_;
				int i_1523_ = i + i_1510_ - i_1518_;
				int i_1524_ = i_1517_ + (i + i_1510_);
				int i_1525_ = i_1504_ + i_1519_;
				int i_1526_ = i_1504_ - i_1520_;
				int i_1527_ = i_1511_ + i_1504_ - i_1520_;
				int i_1528_ = i_1504_ + i_1511_ + i_1519_;
				if (i_1509_ == 0)
					((Class2) class2).anInt19 = 0;
				else if (i_1509_ == 1)
					((Class2) class2).anInt19 = 255 - (i_1507_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class2) class2).aBoolean20 = (i_1521_ < 0 || i_1521_ > ((Class2) class2).anInt22 || i_1522_ < 0 || i_1522_ > ((Class2) class2).anInt22 || i_1523_ < 0 || i_1523_ > ((Class2) class2).anInt22);
				class2.method293(true, false, false, (float) i_1525_, (float) i_1526_, (float) i_1527_, (float) i_1521_, (float) i_1522_, (float) i_1523_, 100.0F, 100.0F, 100.0F, i_1507_);
				((Class2) class2).aBoolean20 = (i_1521_ < 0 || i_1521_ > ((Class2) class2).anInt22 || i_1523_ < 0 || i_1523_ > ((Class2) class2).anInt22 || i_1524_ < 0 || i_1524_ > ((Class2) class2).anInt22);
				class2.method293(true, false, false, (float) i_1525_, (float) i_1527_, (float) i_1528_, (float) i_1521_, (float) i_1523_, (float) i_1524_, 100.0F, 100.0F, 100.0F, i_1507_);
				RA(true);
			}
		}
	}

	public boolean method5148() {
		return false;
	}

	void method5219(boolean bool, int i, int i_1529_, float f, int i_1530_, int i_1531_, int i_1532_) {
		if (null != ((Class_ra_Sub1) this).anIntArray7967) {
			if (i_1530_ < 0)
				i_1530_ = -i_1530_;
			int i_1533_ = i_1529_ - i_1530_;
			if (i_1533_ < -1278653805 * ((Class_ra_Sub1) this).anInt7976)
				i_1533_ = -1278653805 * ((Class_ra_Sub1) this).anInt7976;
			int i_1534_ = 1 + (i_1530_ + i_1529_);
			if (i_1534_ > 63686679 * ((Class_ra_Sub1) this).anInt7977)
				i_1534_ = 63686679 * ((Class_ra_Sub1) this).anInt7977;
			int i_1535_ = i_1533_;
			int i_1536_ = i_1530_ * i_1530_;
			int i_1537_ = 0;
			int i_1538_ = i_1529_ - i_1535_;
			int i_1539_ = i_1538_ * i_1538_;
			int i_1540_ = i_1539_ - i_1538_;
			if (i_1529_ > i_1534_)
				i_1529_ = i_1534_;
			int i_1541_ = i_1531_ >>> 24;
			if (i_1532_ == 0 || 1 == i_1532_ && 255 == i_1541_) {
				while (i_1535_ < i_1529_) {
					for (/**/; i_1540_ <= i_1536_ || i_1539_ <= i_1536_; i_1540_ += i_1537_++ + i_1537_)
						i_1539_ += i_1537_ + i_1537_;
					int i_1542_ = 1 + (i - i_1537_);
					if (i_1542_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_1542_ = ((Class_ra_Sub1) this).anInt7974 * -912871679;
					int i_1543_ = i_1537_ + i;
					if (i_1543_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_1543_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
					int i_1544_ = (i_1535_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1542_);
					for (int i_1545_ = i_1542_; i_1545_ < i_1543_; i_1545_++) {
						if (!bool || f < (((Class_ra_Sub1) this).aFloatArray7973[i_1544_]))
							((Class_ra_Sub1) this).anIntArray7967[i_1544_] = i_1531_;
						i_1544_++;
					}
					i_1535_++;
					i_1539_ -= i_1538_-- + i_1538_;
					i_1540_ -= i_1538_ + i_1538_;
				}
				i_1537_ = i_1530_;
				i_1538_ = i_1535_ - i_1529_;
				i_1540_ = i_1538_ * i_1538_ + i_1536_;
				i_1539_ = i_1540_ - i_1537_;
				i_1540_ -= i_1538_;
				while (i_1535_ < i_1534_) {
					for (/**/; i_1540_ > i_1536_ && i_1539_ > i_1536_; i_1539_ -= i_1537_ + i_1537_)
						i_1540_ -= i_1537_-- + i_1537_;
					int i_1546_ = i - i_1537_;
					if (i_1546_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_1546_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_1547_ = i + i_1537_;
					if (i_1547_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1)
						i_1547_ = (((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1);
					int i_1548_ = (i_1546_ + i_1535_ * (692106883 * ((Class_ra_Sub1) this).anInt7971));
					for (int i_1549_ = i_1546_; i_1549_ <= i_1547_; i_1549_++) {
						if (!bool || f < (((Class_ra_Sub1) this).aFloatArray7973[i_1548_]))
							((Class_ra_Sub1) this).anIntArray7967[i_1548_] = i_1531_;
						i_1548_++;
					}
					i_1535_++;
					i_1540_ += i_1538_ + i_1538_;
					i_1539_ += i_1538_++ + i_1538_;
				}
			} else if (1 == i_1532_) {
				i_1531_ = ((i_1541_ * (i_1531_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1531_ & 0xff00) * i_1541_ >> 8 & 0xff00) + (i_1541_ << 24));
				int i_1550_ = 256 - i_1541_;
				while (i_1535_ < i_1529_) {
					for (/**/; i_1540_ <= i_1536_ || i_1539_ <= i_1536_; i_1540_ += i_1537_++ + i_1537_)
						i_1539_ += i_1537_ + i_1537_;
					int i_1551_ = i - i_1537_ + 1;
					if (i_1551_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_1551_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_1552_ = i + i_1537_;
					if (i_1552_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725)
						i_1552_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
					int i_1553_ = (i_1551_ + i_1535_ * (692106883 * ((Class_ra_Sub1) this).anInt7971));
					for (int i_1554_ = i_1551_; i_1554_ < i_1552_; i_1554_++) {
						if (!bool || f < (((Class_ra_Sub1) this).aFloatArray7973[i_1553_])) {
							int i_1555_ = (((Class_ra_Sub1) this).anIntArray7967[i_1553_]);
							i_1555_ = (((i_1555_ & 0xff00) * i_1550_ >> 8 & 0xff00) + (i_1550_ * (i_1555_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[i_1553_] = i_1555_ + i_1531_;
						}
						i_1553_++;
					}
					i_1535_++;
					i_1539_ -= i_1538_-- + i_1538_;
					i_1540_ -= i_1538_ + i_1538_;
				}
				i_1537_ = i_1530_;
				i_1538_ = -i_1538_;
				i_1540_ = i_1538_ * i_1538_ + i_1536_;
				i_1539_ = i_1540_ - i_1537_;
				i_1540_ -= i_1538_;
				while (i_1535_ < i_1534_) {
					for (/**/; i_1540_ > i_1536_ && i_1539_ > i_1536_; i_1539_ -= i_1537_ + i_1537_)
						i_1540_ -= i_1537_-- + i_1537_;
					int i_1556_ = i - i_1537_;
					if (i_1556_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_1556_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_1557_ = i_1537_ + i;
					if (i_1557_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1)
						i_1557_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_1558_ = (i_1535_ * (692106883 * ((Class_ra_Sub1) this).anInt7971) + i_1556_);
					for (int i_1559_ = i_1556_; i_1559_ <= i_1557_; i_1559_++) {
						if (!bool || f < (((Class_ra_Sub1) this).aFloatArray7973[i_1558_])) {
							int i_1560_ = (((Class_ra_Sub1) this).anIntArray7967[i_1558_]);
							i_1560_ = (((i_1560_ & 0xff00) * i_1550_ >> 8 & 0xff00) + (i_1550_ * (i_1560_ & 0xff00ff) >> 8 & 0xff00ff));
							((Class_ra_Sub1) this).anIntArray7967[i_1558_] = i_1560_ + i_1531_;
						}
						i_1558_++;
					}
					i_1535_++;
					i_1540_ += i_1538_ + i_1538_;
					i_1539_ += i_1538_++ + i_1538_;
				}
			} else if (2 == i_1532_) {
				while (i_1535_ < i_1529_) {
					for (/**/; i_1540_ <= i_1536_ || i_1539_ <= i_1536_; i_1540_ += i_1537_++ + i_1537_)
						i_1539_ += i_1537_ + i_1537_;
					int i_1561_ = i - i_1537_ + 1;
					if (i_1561_ < -912871679 * ((Class_ra_Sub1) this).anInt7974)
						i_1561_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_1562_ = i + i_1537_;
					if (i_1562_ > -1416794725 * ((Class_ra_Sub1) this).anInt7991)
						i_1562_ = -1416794725 * ((Class_ra_Sub1) this).anInt7991;
					int i_1563_ = i_1561_ + (((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1535_);
					for (int i_1564_ = i_1561_; i_1564_ < i_1562_; i_1564_++) {
						if (!bool || f < (((Class_ra_Sub1) this).aFloatArray7973[i_1563_])) {
							int i_1565_ = (((Class_ra_Sub1) this).anIntArray7967[i_1563_]);
							int i_1566_ = i_1565_ + i_1531_;
							int i_1567_ = (i_1565_ & 0xff00ff) + (i_1531_ & 0xff00ff);
							i_1565_ = (i_1567_ & 0x1000100) + (i_1566_ - i_1567_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_1563_] = i_1566_ - i_1565_ | i_1565_ - (i_1565_ >>> 8);
						}
						i_1563_++;
					}
					i_1535_++;
					i_1539_ -= i_1538_-- + i_1538_;
					i_1540_ -= i_1538_ + i_1538_;
				}
				i_1537_ = i_1530_;
				i_1538_ = -i_1538_;
				i_1540_ = i_1536_ + i_1538_ * i_1538_;
				i_1539_ = i_1540_ - i_1537_;
				i_1540_ -= i_1538_;
				while (i_1535_ < i_1534_) {
					for (/**/; i_1540_ > i_1536_ && i_1539_ > i_1536_; i_1539_ -= i_1537_ + i_1537_)
						i_1540_ -= i_1537_-- + i_1537_;
					int i_1568_ = i - i_1537_;
					if (i_1568_ < ((Class_ra_Sub1) this).anInt7974 * -912871679)
						i_1568_ = -912871679 * ((Class_ra_Sub1) this).anInt7974;
					int i_1569_ = i_1537_ + i;
					if (i_1569_ > ((Class_ra_Sub1) this).anInt7991 * -1416794725 - 1)
						i_1569_ = (-1416794725 * ((Class_ra_Sub1) this).anInt7991 - 1);
					int i_1570_ = ((((Class_ra_Sub1) this).anInt7971 * 692106883 * i_1535_) + i_1568_);
					for (int i_1571_ = i_1568_; i_1571_ <= i_1569_; i_1571_++) {
						if (!bool || f < (((Class_ra_Sub1) this).aFloatArray7973[i_1570_])) {
							int i_1572_ = (((Class_ra_Sub1) this).anIntArray7967[i_1570_]);
							int i_1573_ = i_1572_ + i_1531_;
							int i_1574_ = (i_1531_ & 0xff00ff) + (i_1572_ & 0xff00ff);
							i_1572_ = (i_1574_ & 0x1000100) + (i_1573_ - i_1574_ & 0x10000);
							((Class_ra_Sub1) this).anIntArray7967[i_1570_] = i_1573_ - i_1572_ | i_1572_ - (i_1572_ >>> 8);
						}
						i_1570_++;
					}
					i_1535_++;
					i_1540_ += i_1538_ + i_1538_;
					i_1539_ += i_1538_++ + i_1538_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method5090(int i, int i_1575_, int i_1576_, int i_1577_) {
		((Class_ra_Sub1) this).anInt7989 = 1021645229 * i;
		((Class_ra_Sub1) this).anInt7990 = i_1575_ * 574739315;
		((Class_ra_Sub1) this).anInt7980 = 626158471 * i_1576_;
		((Class_ra_Sub1) this).anInt7969 = 370599731 * i_1577_;
		method5209();
	}

	public Matrix3f method5171() {
		return new Matrix3f(((Class_ra_Sub1) this).aClass222_7984);
	}

	public Matrix4f method5172() {
		return new Matrix4f(((Class_ra_Sub1) this).aClass233_7986);
	}

	public Matrix4f method5124() {
		return new Matrix4f(((Class_ra_Sub1) this).aClass233_7986);
	}

	public int method5177() {
		return 0;
	}
}
