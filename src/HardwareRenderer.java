
/* Class505_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class HardwareRenderer extends GraphicalRenderer {
	float aFloat8976;
	int anInt8977;
	float aFloat8978;
	int[] anIntArray8979;
	int anInt8980;
	int anInt8981;
	float aFloat8982;
	int anInt8983;
	Class185[] aClass185Array8984;
	float aFloat8985;
	int anInt8986;
	NativeSprite aClass160_8987;
	int anInt8988;
	float[][] aFloatArrayArray8989;
	int anInt8990;
	int anInt8991;
	int anInt8992;
	Class294 aClass294_8993;
	Class384 aClass384_8994;
	Class384 aClass384_8995;
	Class384 aClass384_8996;
	boolean aBool8997;
	int anInt8998;
	int anInt8999;
	int anInt9000;
	int anInt9001;
	int anInt9002;
	float aFloat9003;
	float aFloat9004;
	int anInt9005;
	SoftCache aClass229_9006;
	int anInt9007;
	int anInt9008;
	int anInt9009;
	float[] aFloatArray9010;
	int anInt9011;
	boolean aBool9012;
	SoftCache aClass229_9013;
	boolean aBool9014 = false;
	int anInt9015;

	int method14357(int i) {
		return (anInterface22_5834.method144(i, -1751667417).anInt2074 * 1960017665);
	}

	public boolean method8399() {
		return false;
	}

	public Class168 method8392() {
		return new Class168(0, "Pure Java", 1, "CPU", 0L);
	}

	public void method8507() {
		/* empty */
	}

	public void method8395() {
		/* empty */
	}

	void method14358(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < -1710988237 * ((HardwareRenderer) this).anInt9002)) {
			int i_7_ = i + i_0_ * (((HardwareRenderer) this).anInt8980 * 444800403);
			int i_8_ = i_2_ >>> 24;
			int i_9_ = i_5_ + i_4_;
			int i_10_ = i_6_ % i_9_;
			if (0 == i_3_ || i_3_ == 1 && i_8_ == 255) {
				int i_11_ = 0;
				while (i_11_ < i_1_) {
					if ((i_11_ + i_0_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_0_ + i_11_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_10_ < i_4_)
						((HardwareRenderer) this).anIntArray8979[i_7_ + i_11_ * (((HardwareRenderer) this).anInt8980 * 444800403)] = i_2_;
					i_11_++;
					i_10_ = ++i_10_ % i_9_;
				}
			} else if (1 == i_3_) {
				i_2_ = (i_8_ << 24) + ((i_8_ * (i_2_ & 0xff00) >> 8 & 0xff00) + (i_8_ * (i_2_ & 0xff00ff) >> 8 & 0xff00ff));
				int i_12_ = 256 - i_8_;
				int i_13_ = 0;
				while (i_13_ < i_1_) {
					if ((i_0_ + i_13_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_13_ + i_0_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_10_ < i_4_) {
						int i_14_ = (i_7_ + i_13_ * (444800403 * ((HardwareRenderer) this).anInt8980));
						int i_15_ = ((HardwareRenderer) this).anIntArray8979[i_14_];
						i_15_ = ((i_12_ * (i_15_ & 0xff00ff) >> 8 & 0xff00ff) + (i_12_ * (i_15_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[i_14_] = i_2_ + i_15_;
					}
					i_13_++;
					i_10_ = ++i_10_ % i_9_;
				}
			} else if (2 == i_3_) {
				int i_16_ = 0;
				while (i_16_ < i_1_) {
					if ((i_16_ + i_0_ >= ((HardwareRenderer) this).anInt9009 * 1516535457) && (i_0_ + i_16_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_10_ < i_4_) {
						int i_17_ = (i_16_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_7_);
						int i_18_ = ((HardwareRenderer) this).anIntArray8979[i_17_];
						int i_19_ = i_2_ + i_18_;
						int i_20_ = (i_18_ & 0xff00ff) + (i_2_ & 0xff00ff);
						i_18_ = (i_20_ & 0x1000100) + (i_19_ - i_20_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_17_] = i_19_ - i_18_ | i_18_ - (i_18_ >>> 8);
					}
					i_16_++;
					i_10_ = ++i_10_ % i_9_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method8398(int i) {
		int i_21_ = i - 1426154545 * ((HardwareRenderer) this).anInt8977;
		for (Class282_Sub27 class282_sub27 = (Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.method3866(1886478674); null != class282_sub27; class282_sub27 = (Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.method3867(297413420)) {
			if (((Class282_Sub27) class282_sub27).aBool7693) {
				((Class282_Sub27) class282_sub27).anInt7692 += i_21_;
				int i_22_ = ((Class282_Sub27) class282_sub27).anInt7692 / 50;
				if (i_22_ > 0) {
					Class169 class169 = anInterface22_5834.method144((((Class282_Sub27) class282_sub27).anInt7695), -2103446080);
					float f = class169.aBool2065 ? 64.0F : 128.0F;
					class282_sub27.method12403((int) (f * ((float) class169.aByte2081 * ((float) i_21_ / 1000.0F) / 64.0F)), (int) ((float) class169.aByte2090 * ((float) i_21_ / 1000.0F) / 64.0F * f));
					((Class282_Sub27) class282_sub27).anInt7692 -= 50 * i_22_;
				}
				((Class282_Sub27) class282_sub27).aBool7693 = false;
			}
		}
		((HardwareRenderer) this).anInt8977 = -987269935 * i;
		((HardwareRenderer) this).aClass229_9013.method3858(5, (byte) 24);
		((HardwareRenderer) this).aClass229_9006.method3858(5, (byte) -100);
	}

	public int method8443(int i, int i_23_) {
		i |= 0x20800;
		return i & i_23_ ^ i_23_;
	}

	void method8592(float f, float f_24_, float f_25_, float f_26_, float f_27_, float f_28_) {
		/* empty */
	}

	int[] method14359(int i) {
		Class282_Sub27 class282_sub27;
		synchronized (((HardwareRenderer) this).aClass229_9006) {
			class282_sub27 = ((Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.get((long) i | ~0x7fffffffffffffffL));
			if (class282_sub27 == null) {
				if (!anInterface22_5834.method139(i, -99337949)) {
					int[] is = null;
					return is;
				}
				Class169 class169 = anInterface22_5834.method144(i, -1891491096);
				int i_29_ = (class169.aBool2065 || ((HardwareRenderer) this).aBool8997 ? 64 : ((HardwareRenderer) this).anInt9005 * -1392111239);
				class282_sub27 = (new Class282_Sub27(i, i_29_, anInterface22_5834.method141(i, 0.7F, i_29_, i_29_, true, 1334254083), 1 != 1960017665 * class169.anInt2074));
				((HardwareRenderer) this).aClass229_9006.put(class282_sub27, (long) i | ~0x7fffffffffffffffL);
			}
		}
		((Class282_Sub27) class282_sub27).aBool7693 = true;
		return class282_sub27.method12406();
	}

	boolean method14360(int i) {
		return anInterface22_5834.method139(i, -976464344);
	}

	public boolean method8498() {
		return false;
	}

	int method14361(int i) {
		return (anInterface22_5834.method144(i, -1867342657).anInt2074 * 1960017665);
	}

	int method14362(int i) {
		return (anInterface22_5834.method144(i, -1888622730).aShort2073 & 0xffff);
	}

	public void method8598(Class152 class152) {
		/* empty */
	}

	void method14363(boolean bool, boolean bool_30_, boolean bool_31_, Class151 class151) {
		Class185 class185 = method14370(Thread.currentThread());
		Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
		for (Class275_Sub1 class275_sub1_32_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_32_ != class275_sub1; class275_sub1_32_ = class275_sub1_32_.aClass275_Sub1_7706) {
			Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_32_;
			int i = class275_sub1_sub1.anInt10205 >> 12;
			int i_33_ = class275_sub1_sub1.anInt10208 >> 12;
			int i_34_ = class275_sub1_sub1.anInt10202 >> 12;
			float f = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) * (float) i_34_ + ((float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]) + (float) i_33_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]))));
			float f_35_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * (float) i_33_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) * (float) i + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]) * (float) i_34_));
			if (!(f < -f_35_)) {
				float f_36_ = (((HardwareRenderer) this).aFloat8985 + f * ((HardwareRenderer) this).aFloat8978 / f_35_);
				if (!(f > ((Class185) class185).aFloat2305)) {
					float f_37_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) * (float) i + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) * (float) i_33_ + (float) i_34_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12]));
					float f_38_ = ((float) i_34_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) * (float) i + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) * (float) i_33_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]));
					if (!(f_37_ < -f_35_) && !(f_37_ > f_35_) && !(f_38_ < -f_35_) && !(f_38_ > f_35_)) {
						float f_39_ = (float) class275_sub1_sub1.anInt10206 / 4096.0F;
						float f_40_ = (f_39_ * (((HardwareRenderer) this).aClass384_8995.aFloatArray4667[0]) + f_37_);
						float f_41_ = f_35_ + (((HardwareRenderer) this).aClass384_8995.aFloatArray4667[3]) * f_39_;
						float f_42_ = (((HardwareRenderer) this).aFloat9003 + (f_37_ * ((HardwareRenderer) this).aFloat8976 / f_35_));
						float f_43_ = ((((HardwareRenderer) this).aFloat9004 * f_38_ / f_35_) + ((HardwareRenderer) this).aFloat8982);
						float f_44_ = (((HardwareRenderer) this).aFloat9003 + (f_40_ * ((HardwareRenderer) this).aFloat8976 / f_41_));
						method14371(bool, bool_30_, bool_31_, class275_sub1_sub1, (int) f_42_, (int) f_43_, f_36_, (int) (f_44_ < f_42_ ? f_42_ - f_44_ : f_44_ - f_42_));
					}
				}
			}
		}
	}

	public boolean method8465() {
		return false;
	}

	public boolean method8664() {
		return true;
	}

	public boolean method8403() {
		return false;
	}

	public boolean method8404() {
		return false;
	}

	public boolean method8402() {
		return false;
	}

	public boolean method8405() {
		return false;
	}

	public boolean method8406() {
		return false;
	}

	public boolean method8454() {
		return false;
	}

	public boolean method8407() {
		return true;
	}

	public int method8539(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		int i_50_ = 0;
		float f = (((float) i_46_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) + (((float) i_45_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]))));
		float f_51_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6] * (float) i_48_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] * (float) i_47_)) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * (float) i_49_));
		float f_52_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + ((float) i_45_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (float) i_46_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		float f_53_ = (((float) i_48_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * (float) i_47_)) + (float) i_49_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f < -f_52_ && f_51_ < -f_53_)
			i_50_ |= 0x10;
		else if (f > f_52_ && f_51_ > f_53_)
			i_50_ |= 0x20;
		float f_54_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_45_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + ((float) i_46_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]));
		float f_55_ = (((float) i_49_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((float) i_47_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_48_)));
		if (f_54_ < -f_52_ && f_55_ < -f_53_)
			i_50_ |= 0x1;
		if (f_54_ > f_52_ && f_55_ > f_53_)
			i_50_ |= 0x2;
		float f_56_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_45_) + (((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9] * (float) i_46_));
		float f_57_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] * (float) i_47_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_48_) + ((float) i_49_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		if (f_56_ < -f_52_ && f_57_ < -f_53_)
			i_50_ |= 0x4;
		if (f_56_ > f_52_ && f_57_ > f_53_)
			i_50_ |= 0x8;
		return i_50_;
	}

	Class158_Sub2 method8417(Canvas canvas, int i, int i_58_) {
		return Class52_Sub1.method14493(this, canvas, i, i_58_, -2066477984);
	}

	public void RA(boolean bool) {
		Class185 class185 = method14370(Thread.currentThread());
		((Class185) class185).aBool2334 = bool;
	}

	public int[] ab(int i, int i_59_, int i_60_, int i_61_) {
		if (((HardwareRenderer) this).anIntArray8979 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_61_ * i_60_];
		int i_62_ = 0;
		for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
			int i_64_ = i + (i_59_ + i_63_) * (((HardwareRenderer) this).anInt8980 * 444800403);
			for (int i_65_ = 0; i_65_ < i_60_; i_65_++)
				is[i_62_++] = ((HardwareRenderer) this).anIntArray8979[i_64_ + i_65_];
		}
		return is;
	}

	public void method8420() {
		/* empty */
	}

	public void method8408(int[] is) {
		is[0] = 444800403 * ((HardwareRenderer) this).anInt8980;
		is[1] = ((HardwareRenderer) this).anInt8981 * 2138511415;
	}

	public boolean method8600() {
		return false;
	}

	public void method8618(Class282_Sub1 class282_sub1) {
		/* empty */
	}

	public void method8421() {
		((HardwareRenderer) this).anInt8998 = 0;
		((HardwareRenderer) this).anInt8999 = 0;
		((HardwareRenderer) this).anInt9000 = ((HardwareRenderer) this).anInt8980 * -50906609;
		((HardwareRenderer) this).anInt9001 = ((HardwareRenderer) this).anInt8981 * 651224101;
		method14364();
	}

	public void method8617(int i, int i_66_, int i_67_, int i_68_) {
		((HardwareRenderer) this).anInt8998 = 1009607649 * i;
		((HardwareRenderer) this).anInt8999 = 117131383 * i_66_;
		((HardwareRenderer) this).anInt9000 = -1636098283 * i_67_;
		((HardwareRenderer) this).anInt9001 = i_68_ * 995917955;
		method14364();
	}

	void method8397() {
		if (((HardwareRenderer) this).aBool9012) {
			Class13.method508(true, false, 31830891);
			((HardwareRenderer) this).aBool9012 = false;
		}
		((HardwareRenderer) this).aBool9014 = true;
	}

	void method14364() {
		int i = (-1710988237 * ((HardwareRenderer) this).anInt9002 - ((HardwareRenderer) this).anInt8983 * 72550989);
		int i_69_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1516535457 * ((HardwareRenderer) this).anInt9009);
		float f = (((HardwareRenderer) this).aFloat8976 = ((float) (((HardwareRenderer) this).anInt9000 * -441894851) / 2.0F));
		float f_70_ = (((HardwareRenderer) this).aFloat9004 = (float) (3132971 * ((HardwareRenderer) this).anInt9001) / 2.0F);
		((HardwareRenderer) this).aFloat9003 = (float) (116006945 * ((HardwareRenderer) this).anInt8998) + f;
		((HardwareRenderer) this).aFloat8982 = (float) (842600775 * ((HardwareRenderer) this).anInt8999) + f_70_;
		for (int i_71_ = 0; i_71_ < 656550451 * ((HardwareRenderer) this).anInt9008; i_71_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_71_];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1679 = f;
			((Class144) class144).aFloat1702 = f_70_;
			((Class144) class144).aFloat1678 = (((HardwareRenderer) this).aFloat9003 - (float) (72550989 * ((HardwareRenderer) this).anInt8983));
			((Class144) class144).aFloat1680 = (((HardwareRenderer) this).aFloat8982 - (float) (((HardwareRenderer) this).anInt9009 * 1516535457));
			((Class144) class144).anInt1684 = i;
			((Class144) class144).anInt1700 = i_69_;
		}
		int i_72_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
		for (int i_73_ = ((HardwareRenderer) this).anInt9009 * 1516535457; i_73_ < 1383960921 * ((HardwareRenderer) this).anInt8986; i_73_++) {
			for (int i_74_ = 0; i_74_ < ((HardwareRenderer) this).anInt9008 * 656550451; i_74_++)
				((Class144) (((Class185) ((HardwareRenderer) this).aClass185Array8984[i_74_]).aClass144_2310)).anIntArray1685[i_73_ - ((HardwareRenderer) this).anInt9009 * 1516535457] = i_72_;
			i_72_ += 444800403 * ((HardwareRenderer) this).anInt8980;
		}
	}

	public NativeSprite method8442(int[] is, int i, int i_75_, int i_76_, int i_77_, boolean bool) {
		boolean bool_78_ = false;
		int i_79_ = i;
		while_227_: for (int i_80_ = 0; i_80_ < i_77_; i_80_++) {
			for (int i_81_ = 0; i_81_ < i_76_; i_81_++) {
				int i_82_ = is[i_79_++] >>> 24;
				if (0 != i_82_ && i_82_ != 255) {
					bool_78_ = true;
					break while_227_;
				}
			}
		}
		if (bool_78_)
			return new Class160_Sub1_Sub3(this, is, i, i_75_, i_76_, i_77_, bool);
		return new Class160_Sub1_Sub1(this, is, i, i_75_, i_76_, i_77_, bool);
	}

	public FontRenderer method8448(Class414 class414, Class91[] class91s, boolean bool) {
		int[] is = new int[class91s.length];
		int[] is_83_ = new int[class91s.length];
		boolean bool_84_ = false;
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].anInt957;
			is_83_[i] = class91s[i].anInt954;
			if (null != class91s[i].aByteArray961)
				bool_84_ = true;
		}
		if (bool) {
			if (bool_84_)
				return new Class8_Sub2(this, class414, class91s, is, is_83_);
			return new Class8_Sub1(this, class414, class91s, is, is_83_);
		}
		if (bool_84_)
			throw new IllegalArgumentException("");
		return new Class8_Sub3(this, class414, class91s, is, is_83_);
	}

	public void o(int i, int i_85_, int i_86_, int i_87_) {
		if (((HardwareRenderer) this).anInt8983 * 72550989 < i)
			((HardwareRenderer) this).anInt8983 = i * -363774331;
		if (((HardwareRenderer) this).anInt9009 * 1516535457 < i_85_)
			((HardwareRenderer) this).anInt9009 = i_85_ * 1457972577;
		if (-1710988237 * ((HardwareRenderer) this).anInt9002 > i_86_)
			((HardwareRenderer) this).anInt9002 = 1714763515 * i_86_;
		if (((HardwareRenderer) this).anInt8986 * 1383960921 > i_87_)
			((HardwareRenderer) this).anInt8986 = 760194793 * i_87_;
		method14364();
	}

	int method14365(int i) {
		return (anInterface22_5834.method144(i, -2078762256).aShort2073 & 0xffff);
	}

	void method8531() {
		if (((HardwareRenderer) this).aBool9012) {
			Class13.method508(true, false, -468399844);
			((HardwareRenderer) this).aBool9012 = false;
		}
		((HardwareRenderer) this).aBool9014 = true;
	}

	public NativeSprite method8548(int[] is, int i, int i_88_, int i_89_, int i_90_, boolean bool) {
		boolean bool_91_ = false;
		int i_92_ = i;
		while_228_: for (int i_93_ = 0; i_93_ < i_90_; i_93_++) {
			for (int i_94_ = 0; i_94_ < i_89_; i_94_++) {
				int i_95_ = is[i_92_++] >>> 24;
				if (0 != i_95_ && i_95_ != 255) {
					bool_91_ = true;
					break while_228_;
				}
			}
		}
		if (bool_91_)
			return new Class160_Sub1_Sub3(this, is, i, i_88_, i_89_, i_90_, bool);
		return new Class160_Sub1_Sub1(this, is, i, i_88_, i_89_, i_90_, bool);
	}

	public void B(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				i_97_ -= 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i = ((HardwareRenderer) this).anInt8983 * 72550989;
			}
			if (i_96_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
				i_98_ -= 1516535457 * ((HardwareRenderer) this).anInt9009 - i_96_;
				i_96_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
			}
			if (i + i_97_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
				i_97_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - i;
			if (i_96_ + i_98_ > 1383960921 * ((HardwareRenderer) this).anInt8986)
				i_98_ = 1383960921 * ((HardwareRenderer) this).anInt8986 - i_96_;
			if (i_97_ > 0 && i_98_ > 0 && i <= ((HardwareRenderer) this).anInt9002 * -1710988237 && i_96_ <= 1383960921 * ((HardwareRenderer) this).anInt8986) {
				int i_101_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i_97_;
				int i_102_ = i + i_96_ * (444800403 * ((HardwareRenderer) this).anInt8980);
				int i_103_ = i_99_ >>> 24;
				if (i_100_ == 0 || 1 == i_100_ && 255 == i_103_) {
					int i_104_ = i_97_ >> 3;
					int i_105_ = i_97_ & 0x7;
					i_97_ = i_102_ - 1;
					for (int i_106_ = -i_98_; i_106_ < 0; i_106_++) {
						if (i_104_ > 0) {
							i = i_104_;
							do {
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
							} while (--i > 0);
						}
						if (i_105_ > 0) {
							i = i_105_;
							do
								((HardwareRenderer) this).anIntArray8979[++i_97_] = i_99_;
							while (--i > 0);
						}
						i_97_ += i_101_;
					}
				} else if (i_100_ == 1) {
					i_99_ = ((((i_99_ & ~0xff00ff) >>> 8) * i_103_ & ~0xff00ff) + ((i_99_ & 0xff00ff) * i_103_ >> 8 & 0xff00ff));
					int i_107_ = 256 - i_103_;
					for (int i_108_ = 0; i_108_ < i_98_; i_108_++) {
						for (int i_109_ = -i_97_; i_109_ < 0; i_109_++) {
							int i_110_ = (((HardwareRenderer) this).anIntArray8979[i_102_]);
							i_110_ = ((i_107_ * ((i_110_ & ~0xff00ff) >>> 8) & ~0xff00ff) + (i_107_ * (i_110_ & 0xff00ff) >> 8 & 0xff00ff));
							((HardwareRenderer) this).anIntArray8979[i_102_++] = i_99_ + i_110_;
						}
						i_102_ += i_101_;
					}
				} else if (i_100_ == 2) {
					for (int i_111_ = 0; i_111_ < i_98_; i_111_++) {
						for (int i_112_ = -i_97_; i_112_ < 0; i_112_++) {
							int i_113_ = (((HardwareRenderer) this).anIntArray8979[i_102_]);
							int i_114_ = i_113_ + i_99_;
							int i_115_ = (i_99_ & 0xff00ff) + (i_113_ & 0xff00ff);
							i_113_ = (i_114_ - i_115_ & 0x10000) + (i_115_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_102_++] = i_114_ - i_113_ | i_113_ - (i_113_ >>> 8);
						}
						i_102_ += i_101_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void N(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, byte[] is, int i_121_, int i_122_) {
		if (((HardwareRenderer) this).anIntArray8979 != null && (i_117_ > 0 && i_118_ > 0)) {
			int i_123_ = 0;
			int i_124_ = 0;
			int i_125_ = (i_121_ << 16) / i_117_;
			int i_126_ = (is.length / i_121_ << 16) / i_118_;
			int i_127_ = i + 444800403 * ((HardwareRenderer) this).anInt8980 * i_116_;
			int i_128_ = ((HardwareRenderer) this).anInt8980 * 444800403 - i_117_;
			if (i_116_ + i_118_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_118_ -= (i_118_ + i_116_ - 1383960921 * ((HardwareRenderer) this).anInt8986);
			if (i_116_ < 1516535457 * ((HardwareRenderer) this).anInt9009) {
				int i_129_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_116_;
				i_118_ -= i_129_;
				i_127_ += ((HardwareRenderer) this).anInt8980 * 444800403 * i_129_;
				i_124_ += i_129_ * i_126_;
			}
			if (i + i_117_ > ((HardwareRenderer) this).anInt9002 * -1710988237) {
				int i_130_ = (i_117_ + i - ((HardwareRenderer) this).anInt9002 * -1710988237);
				i_117_ -= i_130_;
				i_128_ += i_130_;
			}
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				int i_131_ = 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i_117_ -= i_131_;
				i_127_ += i_131_;
				i_123_ += i_131_ * i_125_;
				i_128_ += i_131_;
			}
			int i_132_ = i_119_ >>> 24;
			int i_133_ = i_120_ >>> 24;
			if (0 == i_122_ || 1 == i_122_ && i_132_ == 255 && 255 == i_133_) {
				int i_134_ = i_123_;
				for (int i_135_ = -i_118_; i_135_ < 0; i_135_++) {
					int i_136_ = i_121_ * (i_124_ >> 16);
					for (int i_137_ = -i_117_; i_137_ < 0; i_137_++) {
						if (is[i_136_ + (i_123_ >> 16)] != 0)
							((HardwareRenderer) this).anIntArray8979[i_127_++] = i_120_;
						else
							((HardwareRenderer) this).anIntArray8979[i_127_++] = i_119_;
						i_123_ += i_125_;
					}
					i_124_ += i_126_;
					i_123_ = i_134_;
					i_127_ += i_128_;
				}
			} else if (i_122_ == 1) {
				int i_138_ = i_123_;
				for (int i_139_ = -i_118_; i_139_ < 0; i_139_++) {
					int i_140_ = (i_124_ >> 16) * i_121_;
					for (int i_141_ = -i_117_; i_141_ < 0; i_141_++) {
						int i_142_ = i_119_;
						if (is[i_140_ + (i_123_ >> 16)] != 0)
							i_142_ = i_120_;
						int i_143_ = i_142_ >>> 24;
						int i_144_ = 255 - i_143_;
						int i_145_ = ((HardwareRenderer) this).anIntArray8979[i_127_];
						((HardwareRenderer) this).anIntArray8979[i_127_++] = (((i_144_ * (i_145_ & 0xff00) + i_143_ * (i_142_ & 0xff00)) & 0xff0000) + ((i_143_ * (i_142_ & 0xff00ff) + (i_145_ & 0xff00ff) * i_144_) & ~0xff00ff)) >> 8;
						i_123_ += i_125_;
					}
					i_124_ += i_126_;
					i_123_ = i_138_;
					i_127_ += i_128_;
				}
			} else if (2 == i_122_) {
				int i_146_ = i_123_;
				for (int i_147_ = -i_118_; i_147_ < 0; i_147_++) {
					int i_148_ = i_121_ * (i_124_ >> 16);
					for (int i_149_ = -i_117_; i_149_ < 0; i_149_++) {
						int i_150_ = i_119_;
						if (is[(i_123_ >> 16) + i_148_] != 0)
							i_150_ = i_120_;
						if (i_150_ != 0) {
							int i_151_ = (((HardwareRenderer) this).anIntArray8979[i_127_]);
							int i_152_ = i_150_ + i_151_;
							int i_153_ = (i_151_ & 0xff00ff) + (i_150_ & 0xff00ff);
							i_151_ = (i_152_ - i_153_ & 0x10000) + (i_153_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_127_++] = i_152_ - i_151_ | i_151_ - (i_151_ >>> 8);
						} else
							i_127_++;
						i_123_ += i_125_;
					}
					i_124_ += i_126_;
					i_123_ = i_146_;
					i_127_ += i_128_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void CA(int i, int i_154_, int i_155_, int i_156_, int i_157_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i_155_ < 0)
				i_155_ = -i_155_;
			int i_158_ = i_154_ - i_155_;
			if (i_158_ < 1516535457 * ((HardwareRenderer) this).anInt9009)
				i_158_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			int i_159_ = 1 + (i_154_ + i_155_);
			if (i_159_ > 1383960921 * ((HardwareRenderer) this).anInt8986)
				i_159_ = 1383960921 * ((HardwareRenderer) this).anInt8986;
			int i_160_ = i_158_;
			int i_161_ = i_155_ * i_155_;
			int i_162_ = 0;
			int i_163_ = i_154_ - i_160_;
			int i_164_ = i_163_ * i_163_;
			int i_165_ = i_164_ - i_163_;
			if (i_154_ > i_159_)
				i_154_ = i_159_;
			int i_166_ = i_156_ >>> 24;
			if (i_157_ == 0 || 1 == i_157_ && i_166_ == 255) {
				while (i_160_ < i_154_) {
					for (/**/; i_165_ <= i_161_ || i_164_ <= i_161_; i_165_ += i_162_++ + i_162_)
						i_164_ += i_162_ + i_162_;
					int i_167_ = 1 + (i - i_162_);
					if (i_167_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_167_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_168_ = i_162_ + i;
					if (i_168_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_168_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_169_ = i_167_ + i_160_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_170_ = i_167_; i_170_ < i_168_; i_170_++)
						((HardwareRenderer) this).anIntArray8979[i_169_++] = i_156_;
					i_160_++;
					i_164_ -= i_163_-- + i_163_;
					i_165_ -= i_163_ + i_163_;
				}
				i_162_ = i_155_;
				i_163_ = i_160_ - i_154_;
				i_165_ = i_163_ * i_163_ + i_161_;
				i_164_ = i_165_ - i_162_;
				i_165_ -= i_163_;
				while (i_160_ < i_159_) {
					for (/**/; i_165_ > i_161_ && i_164_ > i_161_; i_164_ -= i_162_ + i_162_)
						i_165_ -= i_162_-- + i_162_;
					int i_171_ = i - i_162_;
					if (i_171_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_171_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_172_ = i + i_162_;
					if (i_172_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_172_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_173_ = i_171_ + i_160_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_174_ = i_171_; i_174_ <= i_172_; i_174_++)
						((HardwareRenderer) this).anIntArray8979[i_173_++] = i_156_;
					i_160_++;
					i_165_ += i_163_ + i_163_;
					i_164_ += i_163_++ + i_163_;
				}
			} else if (1 == i_157_) {
				i_156_ = ((i_166_ * (i_156_ & 0xff00) >> 8 & 0xff00) + (i_166_ * (i_156_ & 0xff00ff) >> 8 & 0xff00ff) + (i_166_ << 24));
				int i_175_ = 256 - i_166_;
				while (i_160_ < i_154_) {
					for (/**/; i_165_ <= i_161_ || i_164_ <= i_161_; i_165_ += i_162_++ + i_162_)
						i_164_ += i_162_ + i_162_;
					int i_176_ = i - i_162_ + 1;
					if (i_176_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_176_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_177_ = i + i_162_;
					if (i_177_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_177_ = -1710988237 * ((HardwareRenderer) this).anInt9002;
					int i_178_ = (i_176_ + i_160_ * (444800403 * ((HardwareRenderer) this).anInt8980));
					for (int i_179_ = i_176_; i_179_ < i_177_; i_179_++) {
						int i_180_ = ((HardwareRenderer) this).anIntArray8979[i_178_];
						i_180_ = (((i_180_ & 0xff00) * i_175_ >> 8 & 0xff00) + ((i_180_ & 0xff00ff) * i_175_ >> 8 & 0xff00ff));
						((HardwareRenderer) this).anIntArray8979[i_178_++] = i_156_ + i_180_;
					}
					i_160_++;
					i_164_ -= i_163_-- + i_163_;
					i_165_ -= i_163_ + i_163_;
				}
				i_162_ = i_155_;
				i_163_ = -i_163_;
				i_165_ = i_161_ + i_163_ * i_163_;
				i_164_ = i_165_ - i_162_;
				i_165_ -= i_163_;
				while (i_160_ < i_159_) {
					for (/**/; i_165_ > i_161_ && i_164_ > i_161_; i_164_ -= i_162_ + i_162_)
						i_165_ -= i_162_-- + i_162_;
					int i_181_ = i - i_162_;
					if (i_181_ < ((HardwareRenderer) this).anInt8983 * 72550989)
						i_181_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_182_ = i_162_ + i;
					if (i_182_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_182_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_183_ = i_181_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_160_);
					for (int i_184_ = i_181_; i_184_ <= i_182_; i_184_++) {
						int i_185_ = ((HardwareRenderer) this).anIntArray8979[i_183_];
						i_185_ = ((i_175_ * (i_185_ & 0xff00) >> 8 & 0xff00) + (i_175_ * (i_185_ & 0xff00ff) >> 8 & 0xff00ff));
						((HardwareRenderer) this).anIntArray8979[i_183_++] = i_156_ + i_185_;
					}
					i_160_++;
					i_165_ += i_163_ + i_163_;
					i_164_ += i_163_++ + i_163_;
				}
			} else if (i_157_ == 2) {
				while (i_160_ < i_154_) {
					for (/**/; i_165_ <= i_161_ || i_164_ <= i_161_; i_165_ += i_162_++ + i_162_)
						i_164_ += i_162_ + i_162_;
					int i_186_ = i - i_162_ + 1;
					if (i_186_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_186_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_187_ = i_162_ + i;
					if (i_187_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_187_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_188_ = i_186_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_160_);
					for (int i_189_ = i_186_; i_189_ < i_187_; i_189_++) {
						int i_190_ = ((HardwareRenderer) this).anIntArray8979[i_188_];
						int i_191_ = i_156_ + i_190_;
						int i_192_ = (i_156_ & 0xff00ff) + (i_190_ & 0xff00ff);
						i_190_ = (i_192_ & 0x1000100) + (i_191_ - i_192_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_188_++] = i_191_ - i_190_ | i_190_ - (i_190_ >>> 8);
					}
					i_160_++;
					i_164_ -= i_163_-- + i_163_;
					i_165_ -= i_163_ + i_163_;
				}
				i_162_ = i_155_;
				i_163_ = -i_163_;
				i_165_ = i_163_ * i_163_ + i_161_;
				i_164_ = i_165_ - i_162_;
				i_165_ -= i_163_;
				while (i_160_ < i_159_) {
					for (/**/; i_165_ > i_161_ && i_164_ > i_161_; i_164_ -= i_162_ + i_162_)
						i_165_ -= i_162_-- + i_162_;
					int i_193_ = i - i_162_;
					if (i_193_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_193_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_194_ = i_162_ + i;
					if (i_194_ > -1710988237 * ((HardwareRenderer) this).anInt9002 - 1)
						i_194_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_195_ = i_193_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_160_);
					for (int i_196_ = i_193_; i_196_ <= i_194_; i_196_++) {
						int i_197_ = ((HardwareRenderer) this).anIntArray8979[i_195_];
						int i_198_ = i_156_ + i_197_;
						int i_199_ = (i_197_ & 0xff00ff) + (i_156_ & 0xff00ff);
						i_197_ = (i_199_ & 0x1000100) + (i_198_ - i_199_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_195_++] = i_198_ - i_197_ | i_197_ - (i_197_ >>> 8);
					}
					i_160_++;
					i_165_ += i_163_ + i_163_;
					i_164_ += i_163_++ + i_163_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void XA(int i, int i_200_, int i_201_, int i_202_, int i_203_) {
		if (((HardwareRenderer) this).anIntArray8979 != null && (i_200_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_200_ < ((HardwareRenderer) this).anInt8986 * 1383960921)) {
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				i_201_ -= 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i = 72550989 * ((HardwareRenderer) this).anInt8983;
			}
			if (i_201_ + i > -1710988237 * ((HardwareRenderer) this).anInt9002)
				i_201_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - i;
			int i_204_ = i_200_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i;
			int i_205_ = i_202_ >>> 24;
			if (0 == i_203_ || 1 == i_203_ && i_205_ == 255) {
				for (int i_206_ = 0; i_206_ < i_201_; i_206_++)
					((HardwareRenderer) this).anIntArray8979[i_204_ + i_206_] = i_202_;
			} else if (1 == i_203_) {
				i_202_ = (((i_202_ & 0xff00) * i_205_ >> 8 & 0xff00) + ((i_202_ & 0xff00ff) * i_205_ >> 8 & 0xff00ff) + (i_205_ << 24));
				int i_207_ = 256 - i_205_;
				for (int i_208_ = 0; i_208_ < i_201_; i_208_++) {
					int i_209_ = (((HardwareRenderer) this).anIntArray8979[i_208_ + i_204_]);
					i_209_ = ((i_207_ * (i_209_ & 0xff00) >> 8 & 0xff00) + ((i_209_ & 0xff00ff) * i_207_ >> 8 & 0xff00ff));
					((HardwareRenderer) this).anIntArray8979[i_208_ + i_204_] = i_202_ + i_209_;
				}
			} else if (i_203_ == 2) {
				for (int i_210_ = 0; i_210_ < i_201_; i_210_++) {
					int i_211_ = (((HardwareRenderer) this).anIntArray8979[i_204_ + i_210_]);
					int i_212_ = i_211_ + i_202_;
					int i_213_ = (i_202_ & 0xff00ff) + (i_211_ & 0xff00ff);
					i_211_ = (i_212_ - i_213_ & 0x10000) + (i_213_ & 0x1000100);
					((HardwareRenderer) this).anIntArray8979[i_210_ + i_204_] = i_212_ - i_211_ | i_211_ - (i_211_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14366(int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i_214_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_214_ < 1383960921 * ((HardwareRenderer) this).anInt8986)) {
			int i_221_ = i_214_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_222_ = i_216_ >>> 24;
			int i_223_ = i_219_ + i_218_;
			int i_224_ = i_220_ % i_223_;
			if (i_217_ == 0 || 1 == i_217_ && 255 == i_222_) {
				int i_225_ = 0;
				while (i_225_ < i_215_) {
					if ((i_225_ + i >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_225_ < -1710988237 * ((HardwareRenderer) this).anInt9002) && i_224_ < i_218_)
						((HardwareRenderer) this).anIntArray8979[i_225_ + i_221_] = i_216_;
					i_225_++;
					i_224_ = ++i_224_ % i_223_;
				}
			} else if (i_217_ == 1) {
				i_216_ = (((i_216_ & 0xff00ff) * i_222_ >> 8 & 0xff00ff) + (i_222_ * (i_216_ & 0xff00) >> 8 & 0xff00) + (i_222_ << 24));
				int i_226_ = 256 - i_222_;
				int i_227_ = 0;
				while (i_227_ < i_215_) {
					if ((i + i_227_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_227_ < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_224_ < i_218_) {
						int i_228_ = (((HardwareRenderer) this).anIntArray8979[i_227_ + i_221_]);
						i_228_ = (((i_228_ & 0xff00ff) * i_226_ >> 8 & 0xff00ff) + (i_226_ * (i_228_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[i_227_ + i_221_] = i_228_ + i_216_;
					}
					i_227_++;
					i_224_ = ++i_224_ % i_223_;
				}
			} else if (i_217_ == 2) {
				int i_229_ = 0;
				while (i_229_ < i_215_) {
					if ((i + i_229_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && (i_229_ + i < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_224_ < i_218_) {
						int i_230_ = (((HardwareRenderer) this).anIntArray8979[i_229_ + i_221_]);
						int i_231_ = i_230_ + i_216_;
						int i_232_ = (i_230_ & 0xff00ff) + (i_216_ & 0xff00ff);
						i_230_ = (i_231_ - i_232_ & 0x10000) + (i_232_ & 0x1000100);
						((HardwareRenderer) this).anIntArray8979[i_221_ + i_229_] = i_231_ - i_230_ | i_230_ - (i_230_ >>> 8);
					}
					i_229_++;
					i_224_ = ++i_224_ % i_223_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void qa(int[] is) {
		is[0] = ((HardwareRenderer) this).anInt8983 * 72550989;
		is[1] = ((HardwareRenderer) this).anInt9009 * 1516535457;
		is[2] = -1710988237 * ((HardwareRenderer) this).anInt9002;
		is[3] = 1383960921 * ((HardwareRenderer) this).anInt8986;
	}

	public void method8519(int i, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_) {
		XA(i, i_233_, i_234_, i_236_, i_237_);
		XA(i, i_235_ + i_233_ - 1, i_234_, i_236_, i_237_);
		G(i, i_233_ + 1, i_235_ - 2, i_236_, i_237_);
		G(i + i_234_ - 1, 1 + i_233_, i_235_ - 2, i_236_, i_237_);
	}

	public void method8433(int i, int i_238_, int i_239_, int i_240_, int i_241_, int i_242_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			i_239_ -= i;
			i_240_ -= i_238_;
			if (i_240_ == 0) {
				if (i_239_ >= 0)
					XA(i, i_238_, 1 + i_239_, i_241_, i_242_);
				else
					XA(i + i_239_, i_238_, -i_239_ + 1, i_241_, i_242_);
			} else if (0 == i_239_) {
				if (i_240_ >= 0)
					G(i, i_238_, 1 + i_240_, i_241_, i_242_);
				else
					G(i, i_238_ + i_240_, -i_240_ + 1, i_241_, i_242_);
			} else {
				if (i_239_ + i_240_ < 0) {
					i += i_239_;
					i_239_ = -i_239_;
					i_238_ += i_240_;
					i_240_ = -i_240_;
				}
				if (i_239_ > i_240_) {
					i_238_ <<= 16;
					i_238_ += 32768;
					i_240_ <<= 16;
					int i_243_ = (int) Math.floor(0.5 + ((double) i_240_ / (double) i_239_));
					i_239_ += i;
					if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
						i_238_ += (72550989 * ((HardwareRenderer) this).anInt8983 - i) * i_243_;
						i = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (i_239_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_239_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_244_ = i_241_ >>> 24;
					if (i_242_ == 0 || 1 == i_242_ && i_244_ == 255) {
						for (/**/; i <= i_239_; i++) {
							int i_245_ = i_238_ >> 16;
							if (i_245_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_245_ < (((HardwareRenderer) this).anInt8986 * 1383960921))
								((HardwareRenderer) this).anIntArray8979[i + i_245_ * (444800403 * (((HardwareRenderer) this).anInt8980))] = i_241_;
							i_238_ += i_243_;
						}
					} else if (i_242_ == 1) {
						i_241_ = ((i_244_ << 24) + (((i_241_ & 0xff00) * i_244_ >> 8 & 0xff00) + ((i_241_ & 0xff00ff) * i_244_ >> 8 & 0xff00ff)));
						int i_246_ = 256 - i_244_;
						for (/**/; i <= i_239_; i++) {
							int i_247_ = i_238_ >> 16;
							if (i_247_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_247_ < 1383960921 * ((HardwareRenderer) this).anInt8986) {
								int i_248_ = i + (((HardwareRenderer) this).anInt8980 * 444800403 * i_247_);
								int i_249_ = (((HardwareRenderer) this).anIntArray8979[i_248_]);
								i_249_ = ((i_246_ * (i_249_ & 0xff00ff) >> 8 & 0xff00ff) + (i_246_ * (i_249_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_248_] = i_241_ + i_249_;
							}
							i_238_ += i_243_;
						}
					} else if (i_242_ == 2) {
						for (/**/; i <= i_239_; i++) {
							int i_250_ = i_238_ >> 16;
							if (i_250_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_250_ < 1383960921 * ((HardwareRenderer) this).anInt8986) {
								int i_251_ = i + (i_250_ * (((HardwareRenderer) this).anInt8980 * 444800403));
								int i_252_ = (((HardwareRenderer) this).anIntArray8979[i_251_]);
								int i_253_ = i_241_ + i_252_;
								int i_254_ = ((i_252_ & 0xff00ff) + (i_241_ & 0xff00ff));
								i_252_ = (i_254_ & 0x1000100) + (i_253_ - i_254_ & 0x10000);
								((HardwareRenderer) this).anIntArray8979[i_251_] = i_253_ - i_252_ | i_252_ - (i_252_ >>> 8);
							}
							i_238_ += i_243_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_239_ <<= 16;
					int i_255_ = (int) Math.floor((double) i_239_ / (double) i_240_ + 0.5);
					i_240_ += i_238_;
					if (i_238_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
						i += (1516535457 * ((HardwareRenderer) this).anInt9009 - i_238_) * i_255_;
						i_238_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
					}
					if (i_240_ >= 1383960921 * ((HardwareRenderer) this).anInt8986)
						i_240_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1);
					int i_256_ = i_241_ >>> 24;
					if (i_242_ == 0 || 1 == i_242_ && 255 == i_256_) {
						for (/**/; i_238_ <= i_240_; i_238_++) {
							int i_257_ = i >> 16;
							if (i_257_ >= (72550989 * ((HardwareRenderer) this).anInt8983) && i_257_ < -1710988237 * ((HardwareRenderer) this).anInt9002)
								((HardwareRenderer) this).anIntArray8979[(i_257_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_238_))] = i_241_;
							i += i_255_;
						}
					} else if (1 == i_242_) {
						i_241_ = ((i_256_ * (i_241_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_241_ & 0xff00) * i_256_ >> 8 & 0xff00) + (i_256_ << 24));
						int i_258_ = 256 - i_256_;
						for (/**/; i_238_ <= i_240_; i_238_++) {
							int i_259_ = i >> 16;
							if (i_259_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_259_ < (((HardwareRenderer) this).anInt9002 * -1710988237)) {
								int i_260_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * i_238_) + i_259_);
								int i_261_ = (((HardwareRenderer) this).anIntArray8979[i_260_]);
								i_261_ = (((i_261_ & 0xff00ff) * i_258_ >> 8 & 0xff00ff) + ((i_261_ & 0xff00) * i_258_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(((HardwareRenderer) this).anInt8980 * 444800403 * i_238_) + i_259_] = i_241_ + i_261_;
							}
							i += i_255_;
						}
					} else if (2 == i_242_) {
						for (/**/; i_238_ <= i_240_; i_238_++) {
							int i_262_ = i >> 16;
							if (i_262_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_262_ < -1710988237 * ((HardwareRenderer) this).anInt9002) {
								int i_263_ = (i_262_ + i_238_ * (444800403 * (((HardwareRenderer) this).anInt8980)));
								int i_264_ = (((HardwareRenderer) this).anIntArray8979[i_263_]);
								int i_265_ = i_264_ + i_241_;
								int i_266_ = ((i_264_ & 0xff00ff) + (i_241_ & 0xff00ff));
								i_264_ = ((i_265_ - i_266_ & 0x10000) + (i_266_ & 0x1000100));
								((HardwareRenderer) this).anIntArray8979[i_263_] = i_265_ - i_264_ | i_264_ - (i_264_ >>> 8);
							}
							i += i_255_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class384 method8449() {
		Class185 class185 = method14370(Thread.currentThread());
		return ((Class185) class185).aClass384_2346;
	}

	public void method8669(int i, int i_267_, int i_268_, int i_269_, int i_270_, int i_271_, Class455 class455, int i_272_, int i_273_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_274_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_275_ = (1516535457 * ((HardwareRenderer) this).anInt9009 > i_273_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_273_);
			int i_276_ = ((1383960921 * ((HardwareRenderer) this).anInt8986 < i_273_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : is.length + i_273_);
			i_268_ -= i;
			i_269_ -= i_267_;
			if (i_269_ + i_268_ < 0) {
				i += i_268_;
				i_268_ = -i_268_;
				i_267_ += i_269_;
				i_269_ = -i_269_;
			}
			if (i_268_ > i_269_) {
				i_267_ <<= 16;
				i_267_ += 32768;
				i_269_ <<= 16;
				int i_277_ = (int) Math.floor((double) i_269_ / (double) i_268_ + 0.5);
				i_268_ += i;
				if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
					i_267_ += (((HardwareRenderer) this).anInt8983 * 72550989 - i) * i_277_;
					i = ((HardwareRenderer) this).anInt8983 * 72550989;
				}
				if (i_268_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
					i_268_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - 1;
				int i_278_ = i_270_ >>> 24;
				if (0 == i_271_ || 1 == i_271_ && i_278_ == 255) {
					for (/**/; i <= i_268_; i++) {
						int i_279_ = i_267_ >> 16;
						int i_280_ = i_279_ - i_273_;
						if (i_279_ >= i_275_ && i_279_ < i_276_) {
							int i_281_ = is[i_280_] + i_272_;
							if (i >= i_281_ && i < is_274_[i_280_] + i_281_)
								((HardwareRenderer) this).anIntArray8979[i_279_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_270_;
						}
						i_267_ += i_277_;
					}
				} else if (1 == i_271_) {
					i_270_ = ((i_278_ * (i_270_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_270_ & 0xff00) * i_278_ >> 8 & 0xff00) + (i_278_ << 24));
					int i_282_ = 256 - i_278_;
					for (/**/; i <= i_268_; i++) {
						int i_283_ = i_267_ >> 16;
						int i_284_ = i_283_ - i_273_;
						if (i_283_ >= i_275_ && i_283_ < i_276_) {
							int i_285_ = is[i_284_] + i_272_;
							if (i >= i_285_ && i < i_285_ + is_274_[i_284_]) {
								int i_286_ = i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_283_);
								int i_287_ = (((HardwareRenderer) this).anIntArray8979[i_286_]);
								i_287_ = ((i_282_ * (i_287_ & 0xff00) >> 8 & 0xff00) + (i_282_ * (i_287_ & 0xff00ff) >> 8 & 0xff00ff));
								((HardwareRenderer) this).anIntArray8979[i_286_] = i_270_ + i_287_;
							}
						}
						i_267_ += i_277_;
					}
				} else if (i_271_ == 2) {
					for (/**/; i <= i_268_; i++) {
						int i_288_ = i_267_ >> 16;
						int i_289_ = i_288_ - i_273_;
						if (i_288_ >= i_275_ && i_288_ < i_276_) {
							int i_290_ = i_272_ + is[i_289_];
							if (i >= i_290_ && i < is_274_[i_289_] + i_290_) {
								int i_291_ = (i_288_ * ((((HardwareRenderer) this).anInt8980) * 444800403) + i);
								int i_292_ = (((HardwareRenderer) this).anIntArray8979[i_291_]);
								int i_293_ = i_292_ + i_270_;
								int i_294_ = ((i_270_ & 0xff00ff) + (i_292_ & 0xff00ff));
								i_292_ = (i_294_ & 0x1000100) + (i_293_ - i_294_ & 0x10000);
								((HardwareRenderer) this).anIntArray8979[i_291_] = i_293_ - i_292_ | i_292_ - (i_292_ >>> 8);
							}
						}
						i_267_ += i_277_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_268_ <<= 16;
				int i_295_ = (int) Math.floor(0.5 + ((double) i_268_ / (double) i_269_));
				i_269_ += i_267_;
				if (i_267_ < i_275_) {
					i += (i_275_ - i_267_) * i_295_;
					i_267_ = i_275_;
				}
				if (i_269_ >= i_276_)
					i_269_ = i_276_ - 1;
				int i_296_ = i_270_ >>> 24;
				if (0 == i_271_ || i_271_ == 1 && i_296_ == 255) {
					for (/**/; i_267_ <= i_269_; i_267_++) {
						int i_297_ = i >> 16;
						int i_298_ = i_267_ - i_273_;
						int i_299_ = is[i_298_] + i_272_;
						if ((i_297_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_297_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_297_ >= i_299_ && i_297_ < is_274_[i_298_] + i_299_)
							((HardwareRenderer) this).anIntArray8979[i_297_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_267_)] = i_270_;
						i += i_295_;
					}
				} else if (1 == i_271_) {
					i_270_ = ((i_296_ * (i_270_ & 0xff00) >> 8 & 0xff00) + ((i_270_ & 0xff00ff) * i_296_ >> 8 & 0xff00ff) + (i_296_ << 24));
					int i_300_ = 256 - i_296_;
					for (/**/; i_267_ <= i_269_; i_267_++) {
						int i_301_ = i >> 16;
						int i_302_ = i_267_ - i_273_;
						int i_303_ = i_272_ + is[i_302_];
						if ((i_301_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_301_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_301_ >= i_303_ && i_301_ < i_303_ + is_274_[i_302_]) {
							int i_304_ = (i_301_ + i_267_ * (((HardwareRenderer) this).anInt8980 * 444800403));
							int i_305_ = (((HardwareRenderer) this).anIntArray8979[i_304_]);
							i_305_ = ((i_300_ * (i_305_ & 0xff00ff) >> 8 & 0xff00ff) + (i_300_ * (i_305_ & 0xff00) >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[(i_301_ + i_267_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_305_ + i_270_;
						}
						i += i_295_;
					}
				} else if (2 == i_271_) {
					for (/**/; i_267_ <= i_269_; i_267_++) {
						int i_306_ = i >> 16;
						int i_307_ = i_267_ - i_273_;
						int i_308_ = is[i_307_] + i_272_;
						if ((i_306_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_306_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_306_ >= i_308_ && i_306_ < i_308_ + is_274_[i_307_]) {
							int i_309_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_267_) + i_306_;
							int i_310_ = (((HardwareRenderer) this).anIntArray8979[i_309_]);
							int i_311_ = i_270_ + i_310_;
							int i_312_ = (i_310_ & 0xff00ff) + (i_270_ & 0xff00ff);
							i_310_ = (i_311_ - i_312_ & 0x10000) + (i_312_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_309_] = i_311_ - i_310_ | i_310_ - (i_310_ >>> 8);
						}
						i += i_295_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method8563(int i, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, Class455 class455, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_323_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_324_ = (((HardwareRenderer) this).anInt9009 * 1516535457 > i_319_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_319_);
			int i_325_ = ((((HardwareRenderer) this).anInt8986 * 1383960921 < i_319_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : i_319_ + is.length);
			i_322_ <<= 8;
			i_320_ <<= 8;
			i_321_ <<= 8;
			int i_326_ = i_321_ + i_320_;
			i_322_ %= i_326_;
			i_314_ -= i;
			i_315_ -= i_313_;
			if (i_314_ + i_315_ < 0) {
				int i_327_ = (int) (Math.sqrt((double) (i_315_ * i_315_ + i_314_ * i_314_)) * 256.0);
				int i_328_ = i_327_ % i_326_;
				i_322_ = i_320_ + i_326_ - i_322_ - i_328_;
				i_322_ %= i_326_;
				if (i_322_ < 0)
					i_322_ += i_326_;
				i += i_314_;
				i_314_ = -i_314_;
				i_313_ += i_315_;
				i_315_ = -i_315_;
			}
			if (i_314_ > i_315_) {
				i_313_ <<= 16;
				i_313_ += 32768;
				i_315_ <<= 16;
				int i_329_ = (int) Math.floor((double) i_315_ / (double) i_314_ + 0.5);
				i_314_ += i;
				int i_330_ = i_316_ >>> 24;
				int i_331_ = (int) Math.sqrt((double) ((i_329_ >> 8) * (i_329_ >> 8) + 65536));
				if (i_317_ == 0 || 1 == i_317_ && 255 == i_330_) {
					while (i <= i_314_) {
						int i_332_ = i_313_ >> 16;
						int i_333_ = i_332_ - i_319_;
						if (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_332_ >= i_324_ && i_332_ < i_325_ && i_322_ < i_320_) {
							int i_334_ = i_318_ + is[i_333_];
							if (i >= i_334_ && i < is_323_[i_333_] + i_334_)
								((HardwareRenderer) this).anIntArray8979[i_332_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_316_;
						}
						i_313_ += i_329_;
						i++;
						i_322_ += i_331_;
						i_322_ %= i_326_;
					}
				} else if (1 == i_317_) {
					i_316_ = (((i_316_ & 0xff00ff) * i_330_ >> 8 & 0xff00ff) + ((i_316_ & 0xff00) * i_330_ >> 8 & 0xff00) + (i_330_ << 24));
					int i_335_ = 256 - i_330_;
					while (i <= i_314_) {
						int i_336_ = i_313_ >> 16;
						int i_337_ = i_336_ - i_319_;
						if (i >= 72550989 * ((HardwareRenderer) this).anInt8983 && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_336_ >= i_324_ && i_336_ < i_325_ && i_322_ < i_320_) {
							int i_338_ = i_318_ + is[i_337_];
							if (i >= i_338_ && i < i_338_ + is_323_[i_337_]) {
								int i_339_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * i_336_) + i);
								int i_340_ = (((HardwareRenderer) this).anIntArray8979[i_339_]);
								i_340_ = ((i_335_ * (i_340_ & 0xff00ff) >> 8 & 0xff00ff) + (i_335_ * (i_340_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_339_] = i_340_ + i_316_;
							}
						}
						i_313_ += i_329_;
						i++;
						i_322_ += i_331_;
						i_322_ %= i_326_;
					}
				} else if (2 == i_317_) {
					while (i <= i_314_) {
						int i_341_ = i_313_ >> 16;
						int i_342_ = i_341_ - i_319_;
						if (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_341_ >= i_324_ && i_341_ < i_325_ && i_322_ < i_320_) {
							int i_343_ = i_318_ + is[i_342_];
							if (i >= i_343_ && i < i_343_ + is_323_[i_342_]) {
								int i_344_ = i + (i_341_ * (((HardwareRenderer) this).anInt8980 * 444800403));
								int i_345_ = (((HardwareRenderer) this).anIntArray8979[i_344_]);
								int i_346_ = i_345_ + i_316_;
								int i_347_ = ((i_345_ & 0xff00ff) + (i_316_ & 0xff00ff));
								i_345_ = (i_347_ & 0x1000100) + (i_346_ - i_347_ & 0x10000);
								((HardwareRenderer) this).anIntArray8979[i_344_] = i_346_ - i_345_ | i_345_ - (i_345_ >>> 8);
							}
						}
						i_313_ += i_329_;
						i++;
						i_322_ += i_331_;
						i_322_ %= i_326_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_314_ <<= 16;
				int i_348_ = (int) Math.floor(0.5 + ((double) i_314_ / (double) i_315_));
				int i_349_ = (int) Math.sqrt((double) (65536 + (i_348_ >> 8) * (i_348_ >> 8)));
				i_315_ += i_313_;
				int i_350_ = i_316_ >>> 24;
				if (i_317_ == 0 || i_317_ == 1 && i_350_ == 255) {
					while (i_313_ <= i_315_) {
						int i_351_ = i >> 16;
						int i_352_ = i_313_ - i_319_;
						if (i_313_ >= i_324_ && i_313_ < i_325_ && (i_351_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_351_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_322_ < i_320_ && i_351_ >= i_318_ + is[i_352_] && i_351_ < is[i_352_] + i_318_ + is_323_[i_352_])
							((HardwareRenderer) this).anIntArray8979[(i_313_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_351_)] = i_316_;
						i += i_348_;
						i_313_++;
						i_322_ += i_349_;
						i_322_ %= i_326_;
					}
				} else if (i_317_ == 1) {
					i_316_ = ((i_350_ * (i_316_ & 0xff00) >> 8 & 0xff00) + (i_350_ * (i_316_ & 0xff00ff) >> 8 & 0xff00ff) + (i_350_ << 24));
					int i_353_ = 256 - i_350_;
					while (i_313_ <= i_315_) {
						int i_354_ = i >> 16;
						int i_355_ = i_313_ - i_319_;
						if (i_313_ >= i_324_ && i_313_ < i_325_ && (i_354_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_354_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_322_ < i_320_ && i_354_ >= i_318_ + is[i_355_] && (i_354_ < i_318_ + is[i_355_] + is_323_[i_355_])) {
							int i_356_ = (i_313_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i_354_);
							int i_357_ = (((HardwareRenderer) this).anIntArray8979[i_356_]);
							i_357_ = ((i_353_ * (i_357_ & 0xff00) >> 8 & 0xff00) + (i_353_ * (i_357_ & 0xff00ff) >> 8 & 0xff00ff));
							((HardwareRenderer) this).anIntArray8979[(((HardwareRenderer) this).anInt8980 * 444800403 * i_313_) + i_354_] = i_357_ + i_316_;
						}
						i += i_348_;
						i_313_++;
						i_322_ += i_349_;
						i_322_ %= i_326_;
					}
				} else if (i_317_ == 2) {
					while (i_313_ <= i_315_) {
						int i_358_ = i >> 16;
						int i_359_ = i_313_ - i_319_;
						if (i_313_ >= i_324_ && i_313_ < i_325_ && (i_358_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_358_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_322_ < i_320_ && i_358_ >= i_318_ + is[i_359_] && i_358_ < is_323_[i_359_] + (is[i_359_] + i_318_)) {
							int i_360_ = i_358_ + i_313_ * (444800403 * (((HardwareRenderer) this).anInt8980));
							int i_361_ = (((HardwareRenderer) this).anIntArray8979[i_360_]);
							int i_362_ = i_316_ + i_361_;
							int i_363_ = (i_361_ & 0xff00ff) + (i_316_ & 0xff00ff);
							i_361_ = (i_363_ & 0x1000100) + (i_362_ - i_363_ & 0x10000);
							((HardwareRenderer) this).anIntArray8979[i_360_] = i_362_ - i_361_ | i_361_ - (i_361_ >>> 8);
						}
						i += i_348_;
						i_313_++;
						i_322_ += i_349_;
						i_322_ %= i_326_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method8516(int i, int i_364_, float f, int i_365_, int i_366_, float f_367_, int i_368_, int i_369_, float f_370_, int i_371_, int i_372_, int i_373_, int i_374_) {
		boolean bool = ((HardwareRenderer) this).anIntArray8979 != null;
		boolean bool_375_ = ((HardwareRenderer) this).aFloatArray9010 != null;
		if (bool || bool_375_) {
			Class185 class185 = method14370(Thread.currentThread());
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aBool1675 = false;
			i -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_365_ -= 72550989 * ((HardwareRenderer) this).anInt8983;
			i_368_ -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_364_ -= ((HardwareRenderer) this).anInt9009 * 1516535457;
			i_366_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			i_369_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			((Class144) class144).aBool1708 = (i < 0 || i > ((Class144) class144).anInt1684 || i_365_ < 0 || i_365_ > ((Class144) class144).anInt1684 || i_368_ < 0 || i_368_ > ((Class144) class144).anInt1684);
			int i_376_ = i_371_ >>> 24;
			if (0 == i_374_ || 1 == i_374_ && i_376_ == 255) {
				((Class144) class144).anInt1674 = 0;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_375_, false, (float) i_364_, (float) i_366_, (float) i_369_, (float) i, (float) i_365_, (float) i_368_, f, f_367_, f_370_, i_371_, i_372_, i_373_);
			} else if (1 == i_374_) {
				((Class144) class144).anInt1674 = 255 - i_376_;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_375_, false, (float) i_364_, (float) i_366_, (float) i_369_, (float) i, (float) i_365_, (float) i_368_, f, f_367_, f_370_, i_371_, i_372_, i_373_);
			} else if (i_374_ == 2) {
				((Class144) class144).anInt1674 = 128;
				((Class144) class144).aBool1672 = true;
				class144.method2425(bool, bool_375_, false, (float) i_364_, (float) i_366_, (float) i_369_, (float) i, (float) i_365_, (float) i_368_, f, f_367_, f_370_, i_371_, i_372_, i_373_);
			} else
				throw new IllegalArgumentException();
			((Class144) class144).aBool1675 = true;
		}
	}

	public int method8437(int i, int i_377_, int i_378_, int i_379_, int i_380_, int i_381_) {
		int i_382_ = 0;
		float f = (((float) i_378_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) + (((float) i_377_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]))));
		float f_383_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6] * (float) i_380_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] * (float) i_379_)) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * (float) i_381_));
		float f_384_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + ((float) i_377_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (float) i_378_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		float f_385_ = (((float) i_380_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * (float) i_379_)) + (float) i_381_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f < -f_384_ && f_383_ < -f_385_)
			i_382_ |= 0x10;
		else if (f > f_384_ && f_383_ > f_385_)
			i_382_ |= 0x20;
		float f_386_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_377_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + ((float) i_378_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]));
		float f_387_ = (((float) i_381_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((float) i_379_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_380_)));
		if (f_386_ < -f_384_ && f_387_ < -f_385_)
			i_382_ |= 0x1;
		if (f_386_ > f_384_ && f_387_ > f_385_)
			i_382_ |= 0x2;
		float f_388_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_377_) + (((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9] * (float) i_378_));
		float f_389_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] * (float) i_379_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_380_) + ((float) i_381_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		if (f_388_ < -f_384_ && f_389_ < -f_385_)
			i_382_ |= 0x4;
		if (f_388_ > f_384_ && f_389_ > f_385_)
			i_382_ |= 0x8;
		return i_382_;
	}

	public void method8532(int i, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, Class455 class455, int i_395_, int i_396_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_397_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_398_ = (1516535457 * ((HardwareRenderer) this).anInt9009 > i_396_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_396_);
			int i_399_ = ((1383960921 * ((HardwareRenderer) this).anInt8986 < i_396_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : is.length + i_396_);
			i_391_ -= i;
			i_392_ -= i_390_;
			if (i_392_ + i_391_ < 0) {
				i += i_391_;
				i_391_ = -i_391_;
				i_390_ += i_392_;
				i_392_ = -i_392_;
			}
			if (i_391_ > i_392_) {
				i_390_ <<= 16;
				i_390_ += 32768;
				i_392_ <<= 16;
				int i_400_ = (int) Math.floor((double) i_392_ / (double) i_391_ + 0.5);
				i_391_ += i;
				if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
					i_390_ += (((HardwareRenderer) this).anInt8983 * 72550989 - i) * i_400_;
					i = ((HardwareRenderer) this).anInt8983 * 72550989;
				}
				if (i_391_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
					i_391_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - 1;
				int i_401_ = i_393_ >>> 24;
				if (0 == i_394_ || 1 == i_394_ && i_401_ == 255) {
					for (/**/; i <= i_391_; i++) {
						int i_402_ = i_390_ >> 16;
						int i_403_ = i_402_ - i_396_;
						if (i_402_ >= i_398_ && i_402_ < i_399_) {
							int i_404_ = is[i_403_] + i_395_;
							if (i >= i_404_ && i < is_397_[i_403_] + i_404_)
								((HardwareRenderer) this).anIntArray8979[i_402_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_393_;
						}
						i_390_ += i_400_;
					}
				} else if (1 == i_394_) {
					i_393_ = ((i_401_ * (i_393_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_393_ & 0xff00) * i_401_ >> 8 & 0xff00) + (i_401_ << 24));
					int i_405_ = 256 - i_401_;
					for (/**/; i <= i_391_; i++) {
						int i_406_ = i_390_ >> 16;
						int i_407_ = i_406_ - i_396_;
						if (i_406_ >= i_398_ && i_406_ < i_399_) {
							int i_408_ = is[i_407_] + i_395_;
							if (i >= i_408_ && i < i_408_ + is_397_[i_407_]) {
								int i_409_ = i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_406_);
								int i_410_ = (((HardwareRenderer) this).anIntArray8979[i_409_]);
								i_410_ = ((i_405_ * (i_410_ & 0xff00) >> 8 & 0xff00) + (i_405_ * (i_410_ & 0xff00ff) >> 8 & 0xff00ff));
								((HardwareRenderer) this).anIntArray8979[i_409_] = i_393_ + i_410_;
							}
						}
						i_390_ += i_400_;
					}
				} else if (i_394_ == 2) {
					for (/**/; i <= i_391_; i++) {
						int i_411_ = i_390_ >> 16;
						int i_412_ = i_411_ - i_396_;
						if (i_411_ >= i_398_ && i_411_ < i_399_) {
							int i_413_ = i_395_ + is[i_412_];
							if (i >= i_413_ && i < is_397_[i_412_] + i_413_) {
								int i_414_ = (i_411_ * ((((HardwareRenderer) this).anInt8980) * 444800403) + i);
								int i_415_ = (((HardwareRenderer) this).anIntArray8979[i_414_]);
								int i_416_ = i_415_ + i_393_;
								int i_417_ = ((i_393_ & 0xff00ff) + (i_415_ & 0xff00ff));
								i_415_ = (i_417_ & 0x1000100) + (i_416_ - i_417_ & 0x10000);
								((HardwareRenderer) this).anIntArray8979[i_414_] = i_416_ - i_415_ | i_415_ - (i_415_ >>> 8);
							}
						}
						i_390_ += i_400_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_391_ <<= 16;
				int i_418_ = (int) Math.floor(0.5 + ((double) i_391_ / (double) i_392_));
				i_392_ += i_390_;
				if (i_390_ < i_398_) {
					i += (i_398_ - i_390_) * i_418_;
					i_390_ = i_398_;
				}
				if (i_392_ >= i_399_)
					i_392_ = i_399_ - 1;
				int i_419_ = i_393_ >>> 24;
				if (0 == i_394_ || i_394_ == 1 && i_419_ == 255) {
					for (/**/; i_390_ <= i_392_; i_390_++) {
						int i_420_ = i >> 16;
						int i_421_ = i_390_ - i_396_;
						int i_422_ = is[i_421_] + i_395_;
						if ((i_420_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_420_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_420_ >= i_422_ && i_420_ < is_397_[i_421_] + i_422_)
							((HardwareRenderer) this).anIntArray8979[i_420_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_390_)] = i_393_;
						i += i_418_;
					}
				} else if (1 == i_394_) {
					i_393_ = ((i_419_ * (i_393_ & 0xff00) >> 8 & 0xff00) + ((i_393_ & 0xff00ff) * i_419_ >> 8 & 0xff00ff) + (i_419_ << 24));
					int i_423_ = 256 - i_419_;
					for (/**/; i_390_ <= i_392_; i_390_++) {
						int i_424_ = i >> 16;
						int i_425_ = i_390_ - i_396_;
						int i_426_ = i_395_ + is[i_425_];
						if ((i_424_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_424_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_424_ >= i_426_ && i_424_ < i_426_ + is_397_[i_425_]) {
							int i_427_ = (i_424_ + i_390_ * (((HardwareRenderer) this).anInt8980 * 444800403));
							int i_428_ = (((HardwareRenderer) this).anIntArray8979[i_427_]);
							i_428_ = ((i_423_ * (i_428_ & 0xff00ff) >> 8 & 0xff00ff) + (i_423_ * (i_428_ & 0xff00) >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[(i_424_ + i_390_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_428_ + i_393_;
						}
						i += i_418_;
					}
				} else if (2 == i_394_) {
					for (/**/; i_390_ <= i_392_; i_390_++) {
						int i_429_ = i >> 16;
						int i_430_ = i_390_ - i_396_;
						int i_431_ = is[i_430_] + i_395_;
						if ((i_429_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_429_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_429_ >= i_431_ && i_429_ < i_431_ + is_397_[i_430_]) {
							int i_432_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_390_) + i_429_;
							int i_433_ = (((HardwareRenderer) this).anIntArray8979[i_432_]);
							int i_434_ = i_393_ + i_433_;
							int i_435_ = (i_433_ & 0xff00ff) + (i_393_ & 0xff00ff);
							i_433_ = (i_434_ - i_435_ & 0x10000) + (i_435_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_432_] = i_434_ - i_433_ | i_433_ - (i_433_ >>> 8);
						}
						i += i_418_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method8439(Class282_Sub1 class282_sub1) {
		/* empty */
	}

	public NativeSprite method8654(int i, int i_436_, boolean bool, boolean bool_437_) {
		if (bool)
			return new Class160_Sub1_Sub3(this, i, i_436_);
		return new Class160_Sub1_Sub1(this, i, i_436_);
	}

	public void method8479(float f, float f_438_, float f_439_, float[] fs) {
		float f_440_ = ((f_439_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * f_438_) + (f * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15]))));
		float f_441_ = ((f_438_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8] * f_439_));
		float f_442_ = ((f_438_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (f_439_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		float f_443_ = ((f_439_ * ((HardwareRenderer) this).aClass384_8994.aFloatArray4667[10]) + ((((HardwareRenderer) this).aClass384_8994.aFloatArray4667[6] * f_438_) + (f * (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[2]) + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[14]))));
		fs[0] = (((HardwareRenderer) this).aFloat9003 + f_441_ * ((HardwareRenderer) this).aFloat8976 / f_440_);
		fs[1] = (((HardwareRenderer) this).aFloat8982 + f_442_ * ((HardwareRenderer) this).aFloat9004 / f_440_);
		fs[2] = f_443_;
	}

	Class185 method14367(Runnable runnable) {
		for (int i = 0; i < ((HardwareRenderer) this).anInt9008 * 656550451; i++) {
			if ((((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).aRunnable2343) == runnable)
				return ((HardwareRenderer) this).aClass185Array8984[i];
		}
		return null;
	}

	public NativeSprite method8668(int i, int i_444_, int i_445_, int i_446_, boolean bool) {
		if (null == ((HardwareRenderer) this).anIntArray8979)
			throw new IllegalStateException("");
		int[] is = new int[i_445_ * i_446_];
		int i_447_ = i_444_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
		int i_448_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i_445_;
		for (int i_449_ = 0; i_449_ < i_446_; i_449_++) {
			int i_450_ = i_449_ * i_445_;
			for (int i_451_ = 0; i_451_ < i_445_; i_451_++)
				is[i_450_ + i_451_] = ((HardwareRenderer) this).anIntArray8979[i_447_++];
			i_447_ += i_448_;
		}
		if (bool)
			return new Class160_Sub1_Sub3(this, is, i_445_, i_446_);
		return new Class160_Sub1_Sub1(this, is, i_445_, i_446_);
	}

	public Class455 method8624(int i, int i_452_, int[] is, int[] is_453_) {
		return new PacketsDecoder(i, i_452_, is, is_453_);
	}

	public void en(float f, float f_454_) {
		((HardwareRenderer) this).aFloat8978 = f_454_ - f;
		((HardwareRenderer) this).aFloat8985 = f_454_ + f - 1.0F;
		for (int i = 0; i < ((HardwareRenderer) this).anInt9008 * 656550451; i++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1683 = ((HardwareRenderer) this).aFloat8978;
			((Class144) class144).aFloat1682 = ((HardwareRenderer) this).aFloat8985;
		}
	}

	public void method8446(Class384 class384) {
		((HardwareRenderer) this).aClass384_8995.method6562(class384);
		method14374();
	}

	public void GA(float f, float f_455_) {
		((HardwareRenderer) this).aFloat8978 = f_455_ - f;
		((HardwareRenderer) this).aFloat8985 = f_455_ + f - 1.0F;
		for (int i = 0; i < ((HardwareRenderer) this).anInt9008 * 656550451; i++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1683 = ((HardwareRenderer) this).aFloat8978;
			((Class144) class144).aFloat1682 = ((HardwareRenderer) this).aFloat8985;
		}
	}

	public MeshRasterizer createMeshRasterizer(RSMesh class157, int i, int i_456_, int i_457_, int i_458_) {
		return new Class528_Sub2(this, class157, i, i_457_, i_458_, i_456_);
	}

	public int method8546(int i, int i_459_) {
		return i | i_459_;
	}

	void method14368(boolean bool, boolean bool_460_, boolean bool_461_, int i, int i_462_, float f, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_) {
		if (0 != i_463_ && 0 != i_464_) {
			if (i_465_ != 65535) {
				Class169 class169 = anInterface22_5834.method144(i_465_, -1995871102);
				if (!class169.aBool2056) {
					if (i_465_ != -1787613477 * ((HardwareRenderer) this).anInt9015) {
						NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_465_);
						if (null == class160) {
							int[] is = method14359(i_465_);
							if (null == is)
								return;
							int i_469_ = (method14377(i_465_) ? 64 : (((HardwareRenderer) this).anInt9005 * -1392111239));
							class160 = createNativeSprite(is, 0, i_469_, i_469_, i_469_, -1812944098);
							((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_465_);
						}
						((HardwareRenderer) this).anInt9015 = i_465_ * 1591418195;
						((HardwareRenderer) this).aClass160_8987 = class160;
					}
					((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_460_, bool_461_, i - i_463_, i_462_ - i_464_, f, i_463_ << 1, i_464_ << 1, i_467_, i_466_, i_468_, 1, 2 != class169.anInt2074 * 1960017665);
					return;
				}
			}
			method14373(bool_460_, i, i_462_, f, i_463_, i_466_, i_468_);
		}
	}

	public Class390 method8478(int i, int i_470_, int[][] is, int[][] is_471_, int i_472_, int i_473_, int i_474_) {
		return new Class390_Sub3(this, i_473_, i_474_, i, i_470_, is, is_471_, i_472_);
	}

	public void method8634() {
		((HardwareRenderer) this).anInt8998 = 0;
		((HardwareRenderer) this).anInt8999 = 0;
		((HardwareRenderer) this).anInt9000 = ((HardwareRenderer) this).anInt8980 * -50906609;
		((HardwareRenderer) this).anInt9001 = ((HardwareRenderer) this).anInt8981 * 651224101;
		method14364();
	}

	public Class294 method8450() {
		Class185 class185 = method14370(Thread.currentThread());
		return ((Class185) class185).aClass294_2314;
	}

	public boolean method8471() {
		return false;
	}

	public void iw(int i, float f, float f_475_, float f_476_, float f_477_, float f_478_) {
		((HardwareRenderer) this).anInt8990 = (int) (65535.0F * f) * 1216319887;
		((HardwareRenderer) this).anInt8991 = -1460403627 * (int) (65535.0F * f_475_);
		float f_479_ = (float) Math.sqrt((double) (f_478_ * f_478_ + (f_477_ * f_477_ + f_476_ * f_476_)));
		((HardwareRenderer) this).anInt9011 = (int) (f_476_ * 65535.0F / f_479_) * 672118063;
		((HardwareRenderer) this).anInt8988 = (int) (65535.0F * f_477_ / f_479_) * -1077609237;
		((HardwareRenderer) this).anInt9007 = 1394142547 * (int) (f_478_ * 65535.0F / f_479_);
	}

	public void method8547(int i, Class282_Sub24[] class282_sub24s) {
		/* empty */
	}

	public void method8535(int i, int i_480_, int i_481_, int i_482_, int i_483_, int i_484_, Class455 class455, int i_485_, int i_486_, int i_487_, int i_488_, int i_489_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_490_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_491_ = (((HardwareRenderer) this).anInt9009 * 1516535457 > i_486_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_486_);
			int i_492_ = ((((HardwareRenderer) this).anInt8986 * 1383960921 < i_486_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : i_486_ + is.length);
			i_489_ <<= 8;
			i_487_ <<= 8;
			i_488_ <<= 8;
			int i_493_ = i_488_ + i_487_;
			i_489_ %= i_493_;
			i_481_ -= i;
			i_482_ -= i_480_;
			if (i_481_ + i_482_ < 0) {
				int i_494_ = (int) (Math.sqrt((double) (i_482_ * i_482_ + i_481_ * i_481_)) * 256.0);
				int i_495_ = i_494_ % i_493_;
				i_489_ = i_487_ + i_493_ - i_489_ - i_495_;
				i_489_ %= i_493_;
				if (i_489_ < 0)
					i_489_ += i_493_;
				i += i_481_;
				i_481_ = -i_481_;
				i_480_ += i_482_;
				i_482_ = -i_482_;
			}
			if (i_481_ > i_482_) {
				i_480_ <<= 16;
				i_480_ += 32768;
				i_482_ <<= 16;
				int i_496_ = (int) Math.floor((double) i_482_ / (double) i_481_ + 0.5);
				i_481_ += i;
				int i_497_ = i_483_ >>> 24;
				int i_498_ = (int) Math.sqrt((double) ((i_496_ >> 8) * (i_496_ >> 8) + 65536));
				if (i_484_ == 0 || 1 == i_484_ && 255 == i_497_) {
					while (i <= i_481_) {
						int i_499_ = i_480_ >> 16;
						int i_500_ = i_499_ - i_486_;
						if (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_499_ >= i_491_ && i_499_ < i_492_ && i_489_ < i_487_) {
							int i_501_ = i_485_ + is[i_500_];
							if (i >= i_501_ && i < is_490_[i_500_] + i_501_)
								((HardwareRenderer) this).anIntArray8979[i_499_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_483_;
						}
						i_480_ += i_496_;
						i++;
						i_489_ += i_498_;
						i_489_ %= i_493_;
					}
				} else if (1 == i_484_) {
					i_483_ = (((i_483_ & 0xff00ff) * i_497_ >> 8 & 0xff00ff) + ((i_483_ & 0xff00) * i_497_ >> 8 & 0xff00) + (i_497_ << 24));
					int i_502_ = 256 - i_497_;
					while (i <= i_481_) {
						int i_503_ = i_480_ >> 16;
						int i_504_ = i_503_ - i_486_;
						if (i >= 72550989 * ((HardwareRenderer) this).anInt8983 && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_503_ >= i_491_ && i_503_ < i_492_ && i_489_ < i_487_) {
							int i_505_ = i_485_ + is[i_504_];
							if (i >= i_505_ && i < i_505_ + is_490_[i_504_]) {
								int i_506_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * i_503_) + i);
								int i_507_ = (((HardwareRenderer) this).anIntArray8979[i_506_]);
								i_507_ = ((i_502_ * (i_507_ & 0xff00ff) >> 8 & 0xff00ff) + (i_502_ * (i_507_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_506_] = i_507_ + i_483_;
							}
						}
						i_480_ += i_496_;
						i++;
						i_489_ += i_498_;
						i_489_ %= i_493_;
					}
				} else if (2 == i_484_) {
					while (i <= i_481_) {
						int i_508_ = i_480_ >> 16;
						int i_509_ = i_508_ - i_486_;
						if (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_508_ >= i_491_ && i_508_ < i_492_ && i_489_ < i_487_) {
							int i_510_ = i_485_ + is[i_509_];
							if (i >= i_510_ && i < i_510_ + is_490_[i_509_]) {
								int i_511_ = i + (i_508_ * (((HardwareRenderer) this).anInt8980 * 444800403));
								int i_512_ = (((HardwareRenderer) this).anIntArray8979[i_511_]);
								int i_513_ = i_512_ + i_483_;
								int i_514_ = ((i_512_ & 0xff00ff) + (i_483_ & 0xff00ff));
								i_512_ = (i_514_ & 0x1000100) + (i_513_ - i_514_ & 0x10000);
								((HardwareRenderer) this).anIntArray8979[i_511_] = i_513_ - i_512_ | i_512_ - (i_512_ >>> 8);
							}
						}
						i_480_ += i_496_;
						i++;
						i_489_ += i_498_;
						i_489_ %= i_493_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_481_ <<= 16;
				int i_515_ = (int) Math.floor(0.5 + ((double) i_481_ / (double) i_482_));
				int i_516_ = (int) Math.sqrt((double) (65536 + (i_515_ >> 8) * (i_515_ >> 8)));
				i_482_ += i_480_;
				int i_517_ = i_483_ >>> 24;
				if (i_484_ == 0 || i_484_ == 1 && i_517_ == 255) {
					while (i_480_ <= i_482_) {
						int i_518_ = i >> 16;
						int i_519_ = i_480_ - i_486_;
						if (i_480_ >= i_491_ && i_480_ < i_492_ && (i_518_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_518_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_489_ < i_487_ && i_518_ >= i_485_ + is[i_519_] && i_518_ < is[i_519_] + i_485_ + is_490_[i_519_])
							((HardwareRenderer) this).anIntArray8979[(i_480_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_518_)] = i_483_;
						i += i_515_;
						i_480_++;
						i_489_ += i_516_;
						i_489_ %= i_493_;
					}
				} else if (i_484_ == 1) {
					i_483_ = ((i_517_ * (i_483_ & 0xff00) >> 8 & 0xff00) + (i_517_ * (i_483_ & 0xff00ff) >> 8 & 0xff00ff) + (i_517_ << 24));
					int i_520_ = 256 - i_517_;
					while (i_480_ <= i_482_) {
						int i_521_ = i >> 16;
						int i_522_ = i_480_ - i_486_;
						if (i_480_ >= i_491_ && i_480_ < i_492_ && (i_521_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_521_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_489_ < i_487_ && i_521_ >= i_485_ + is[i_522_] && (i_521_ < i_485_ + is[i_522_] + is_490_[i_522_])) {
							int i_523_ = (i_480_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i_521_);
							int i_524_ = (((HardwareRenderer) this).anIntArray8979[i_523_]);
							i_524_ = ((i_520_ * (i_524_ & 0xff00) >> 8 & 0xff00) + (i_520_ * (i_524_ & 0xff00ff) >> 8 & 0xff00ff));
							((HardwareRenderer) this).anIntArray8979[(((HardwareRenderer) this).anInt8980 * 444800403 * i_480_) + i_521_] = i_524_ + i_483_;
						}
						i += i_515_;
						i_480_++;
						i_489_ += i_516_;
						i_489_ %= i_493_;
					}
				} else if (i_484_ == 2) {
					while (i_480_ <= i_482_) {
						int i_525_ = i >> 16;
						int i_526_ = i_480_ - i_486_;
						if (i_480_ >= i_491_ && i_480_ < i_492_ && (i_525_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_525_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_489_ < i_487_ && i_525_ >= i_485_ + is[i_526_] && i_525_ < is_490_[i_526_] + (is[i_526_] + i_485_)) {
							int i_527_ = i_525_ + i_480_ * (444800403 * (((HardwareRenderer) this).anInt8980));
							int i_528_ = (((HardwareRenderer) this).anIntArray8979[i_527_]);
							int i_529_ = i_483_ + i_528_;
							int i_530_ = (i_528_ & 0xff00ff) + (i_483_ & 0xff00ff);
							i_528_ = (i_530_ & 0x1000100) + (i_529_ - i_530_ & 0x10000);
							((HardwareRenderer) this).anIntArray8979[i_527_] = i_529_ - i_528_ | i_528_ - (i_528_ >>> 8);
						}
						i += i_515_;
						i_480_++;
						i_489_ += i_516_;
						i_489_ %= i_493_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14369(int i) {
		((HardwareRenderer) this).anInt9008 = 1696391419 * i;
		((HardwareRenderer) this).aClass185Array8984 = new Class185[((HardwareRenderer) this).anInt9008 * 656550451];
		for (int i_531_ = 0; i_531_ < 656550451 * ((HardwareRenderer) this).anInt9008; i_531_++)
			((HardwareRenderer) this).aClass185Array8984[i_531_] = new Class185(this);
	}

	Class185 method14370(Runnable runnable) {
		for (int i = 0; i < ((HardwareRenderer) this).anInt9008 * 656550451; i++) {
			if ((((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).aRunnable2343) == runnable)
				return ((HardwareRenderer) this).aClass185Array8984[i];
		}
		return null;
	}

	public void method8456(Class151 class151) {
		method14363(((HardwareRenderer) this).anIntArray8979 != null, null != ((HardwareRenderer) this).aFloatArray9010, false, class151);
	}

	public void method8611() {
		/* empty */
	}

	void method14371(boolean bool, boolean bool_532_, boolean bool_533_, Class275_Sub1_Sub1 class275_sub1_sub1, int i, int i_534_, float f, int i_535_) {
		int i_536_ = class275_sub1_sub1.anInt10207;
		int i_537_ = i_535_;
		i_535_ <<= 1;
		if (i_536_ == -1)
			method14373(bool_532_, i, i_534_, f, i_537_, class275_sub1_sub1.anInt10209, 1);
		else {
			if (i_536_ != ((HardwareRenderer) this).anInt9015 * -1787613477) {
				NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_536_);
				if (null == class160) {
					int[] is = method14359(i_536_);
					if (is != null) {
						int i_538_ = (method14377(i_536_) ? 64 : (-1392111239 * ((HardwareRenderer) this).anInt9005));
						class160 = createNativeSprite(is, 0, i_538_, i_538_, i_538_, 1598794306);
						((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_536_);
					} else
						return;
				}
				((HardwareRenderer) this).anInt9015 = 1591418195 * i_536_;
				((HardwareRenderer) this).aClass160_8987 = class160;
			}
			i_535_++;
			((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_532_, bool_533_, i - i_537_, i_534_ - i_537_, f, i_535_, i_535_, 0, class275_sub1_sub1.anInt10209, 1, 1, false);
		}
	}

	void method14372(boolean bool, boolean bool_539_, boolean bool_540_, int i, int i_541_, float f, int i_542_, int i_543_, int i_544_, int i_545_, int i_546_, int i_547_) {
		if (0 != i_542_ && 0 != i_543_) {
			if (i_544_ != 65535) {
				Class169 class169 = anInterface22_5834.method144(i_544_, -1758221080);
				if (!class169.aBool2056) {
					if (i_544_ != -1787613477 * ((HardwareRenderer) this).anInt9015) {
						NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_544_);
						if (null == class160) {
							int[] is = method14359(i_544_);
							if (null == is)
								return;
							int i_548_ = (method14377(i_544_) ? 64 : (((HardwareRenderer) this).anInt9005 * -1392111239));
							class160 = createNativeSprite(is, 0, i_548_, i_548_, i_548_, -1270335849);
							((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_544_);
						}
						((HardwareRenderer) this).anInt9015 = i_544_ * 1591418195;
						((HardwareRenderer) this).aClass160_8987 = class160;
					}
					((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_539_, bool_540_, i - i_542_, i_541_ - i_543_, f, i_542_ << 1, i_543_ << 1, i_546_, i_545_, i_547_, 1, 2 != class169.anInt2074 * 1960017665);
					return;
				}
			}
			method14373(bool_539_, i, i_541_, f, i_542_, i_545_, i_547_);
		}
	}

	void method14373(boolean bool, int i, int i_549_, float f, int i_550_, int i_551_, int i_552_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i_550_ < 0)
				i_550_ = -i_550_;
			int i_553_ = i_549_ - i_550_;
			if (i_553_ < 1516535457 * ((HardwareRenderer) this).anInt9009)
				i_553_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			int i_554_ = i_550_ + i_549_ + 1;
			if (i_554_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_554_ = 1383960921 * ((HardwareRenderer) this).anInt8986;
			int i_555_ = i_553_;
			int i_556_ = i_550_ * i_550_;
			int i_557_ = 0;
			int i_558_ = i_549_ - i_555_;
			int i_559_ = i_558_ * i_558_;
			int i_560_ = i_559_ - i_558_;
			if (i_549_ > i_554_)
				i_549_ = i_554_;
			int i_561_ = i_551_ >>> 24;
			if (i_552_ == 0 || i_552_ == 1 && i_561_ == 255) {
				while (i_555_ < i_549_) {
					for (/**/; i_560_ <= i_556_ || i_559_ <= i_556_; i_560_ += i_557_++ + i_557_)
						i_559_ += i_557_ + i_557_;
					int i_562_ = 1 + (i - i_557_);
					if (i_562_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_562_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					int i_563_ = i + i_557_;
					if (i_563_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_563_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_564_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * i_555_) + i_562_);
					for (int i_565_ = i_562_; i_565_ < i_563_; i_565_++) {
						if (!bool || f < (((HardwareRenderer) this).aFloatArray9010[i_564_]))
							((HardwareRenderer) this).anIntArray8979[i_564_] = i_551_;
						i_564_++;
					}
					i_555_++;
					i_559_ -= i_558_-- + i_558_;
					i_560_ -= i_558_ + i_558_;
				}
				i_557_ = i_550_;
				i_558_ = i_555_ - i_549_;
				i_560_ = i_556_ + i_558_ * i_558_;
				i_559_ = i_560_ - i_557_;
				i_560_ -= i_558_;
				while (i_555_ < i_554_) {
					for (/**/; i_560_ > i_556_ && i_559_ > i_556_; i_559_ -= i_557_ + i_557_)
						i_560_ -= i_557_-- + i_557_;
					int i_566_ = i - i_557_;
					if (i_566_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_566_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					int i_567_ = i + i_557_;
					if (i_567_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_567_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - 1);
					int i_568_ = (i_555_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_566_);
					for (int i_569_ = i_566_; i_569_ <= i_567_; i_569_++) {
						if (!bool || f < (((HardwareRenderer) this).aFloatArray9010[i_568_]))
							((HardwareRenderer) this).anIntArray8979[i_568_] = i_551_;
						i_568_++;
					}
					i_555_++;
					i_560_ += i_558_ + i_558_;
					i_559_ += i_558_++ + i_558_;
				}
			} else if (1 == i_552_) {
				i_551_ = ((i_561_ << 24) + ((i_561_ * (i_551_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_551_ & 0xff00) * i_561_ >> 8 & 0xff00)));
				int i_570_ = 256 - i_561_;
				while (i_555_ < i_549_) {
					for (/**/; i_560_ <= i_556_ || i_559_ <= i_556_; i_560_ += i_557_++ + i_557_)
						i_559_ += i_557_ + i_557_;
					int i_571_ = i - i_557_ + 1;
					if (i_571_ < ((HardwareRenderer) this).anInt8983 * 72550989)
						i_571_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_572_ = i + i_557_;
					if (i_572_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_572_ = -1710988237 * ((HardwareRenderer) this).anInt9002;
					int i_573_ = i_571_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_555_);
					for (int i_574_ = i_571_; i_574_ < i_572_; i_574_++) {
						if (!bool || f < (((HardwareRenderer) this).aFloatArray9010[i_573_])) {
							int i_575_ = (((HardwareRenderer) this).anIntArray8979[i_573_]);
							i_575_ = (((i_575_ & 0xff00ff) * i_570_ >> 8 & 0xff00ff) + ((i_575_ & 0xff00) * i_570_ >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[i_573_] = i_551_ + i_575_;
						}
						i_573_++;
					}
					i_555_++;
					i_559_ -= i_558_-- + i_558_;
					i_560_ -= i_558_ + i_558_;
				}
				i_557_ = i_550_;
				i_558_ = -i_558_;
				i_560_ = i_556_ + i_558_ * i_558_;
				i_559_ = i_560_ - i_557_;
				i_560_ -= i_558_;
				while (i_555_ < i_554_) {
					for (/**/; i_560_ > i_556_ && i_559_ > i_556_; i_559_ -= i_557_ + i_557_)
						i_560_ -= i_557_-- + i_557_;
					int i_576_ = i - i_557_;
					if (i_576_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_576_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_577_ = i_557_ + i;
					if (i_577_ > -1710988237 * ((HardwareRenderer) this).anInt9002 - 1)
						i_577_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - 1);
					int i_578_ = i_576_ + i_555_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_579_ = i_576_; i_579_ <= i_577_; i_579_++) {
						if (!bool || f < (((HardwareRenderer) this).aFloatArray9010[i_578_])) {
							int i_580_ = (((HardwareRenderer) this).anIntArray8979[i_578_]);
							i_580_ = (((i_580_ & 0xff00ff) * i_570_ >> 8 & 0xff00ff) + ((i_580_ & 0xff00) * i_570_ >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[i_578_] = i_551_ + i_580_;
						}
						i_578_++;
					}
					i_555_++;
					i_560_ += i_558_ + i_558_;
					i_559_ += i_558_++ + i_558_;
				}
			} else if (i_552_ == 2) {
				while (i_555_ < i_549_) {
					for (/**/; i_560_ <= i_556_ || i_559_ <= i_556_; i_560_ += i_557_++ + i_557_)
						i_559_ += i_557_ + i_557_;
					int i_581_ = 1 + (i - i_557_);
					if (i_581_ < ((HardwareRenderer) this).anInt8983 * 72550989)
						i_581_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_582_ = i_557_ + i;
					if (i_582_ > -1710988237 * ((HardwareRenderer) this).anInt9002)
						i_582_ = -1710988237 * ((HardwareRenderer) this).anInt9002;
					int i_583_ = (i_555_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i_581_);
					for (int i_584_ = i_581_; i_584_ < i_582_; i_584_++) {
						if (!bool || f < (((HardwareRenderer) this).aFloatArray9010[i_583_])) {
							int i_585_ = (((HardwareRenderer) this).anIntArray8979[i_583_]);
							int i_586_ = i_585_ + i_551_;
							int i_587_ = (i_551_ & 0xff00ff) + (i_585_ & 0xff00ff);
							i_585_ = (i_587_ & 0x1000100) + (i_586_ - i_587_ & 0x10000);
							((HardwareRenderer) this).anIntArray8979[i_583_] = i_586_ - i_585_ | i_585_ - (i_585_ >>> 8);
						}
						i_583_++;
					}
					i_555_++;
					i_559_ -= i_558_-- + i_558_;
					i_560_ -= i_558_ + i_558_;
				}
				i_557_ = i_550_;
				i_558_ = -i_558_;
				i_560_ = i_556_ + i_558_ * i_558_;
				i_559_ = i_560_ - i_557_;
				i_560_ -= i_558_;
				while (i_555_ < i_554_) {
					for (/**/; i_560_ > i_556_ && i_559_ > i_556_; i_559_ -= i_557_ + i_557_)
						i_560_ -= i_557_-- + i_557_;
					int i_588_ = i - i_557_;
					if (i_588_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_588_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					int i_589_ = i + i_557_;
					if (i_589_ > -1710988237 * ((HardwareRenderer) this).anInt9002 - 1)
						i_589_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - 1);
					int i_590_ = (i_555_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i_588_);
					for (int i_591_ = i_588_; i_591_ <= i_589_; i_591_++) {
						if (!bool || f < (((HardwareRenderer) this).aFloatArray9010[i_590_])) {
							int i_592_ = (((HardwareRenderer) this).anIntArray8979[i_590_]);
							int i_593_ = i_592_ + i_551_;
							int i_594_ = (i_551_ & 0xff00ff) + (i_592_ & 0xff00ff);
							i_592_ = (i_593_ - i_594_ & 0x10000) + (i_594_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_590_] = i_593_ - i_592_ | i_592_ - (i_592_ >>> 8);
						}
						i_590_++;
					}
					i_555_++;
					i_560_ += i_558_ + i_558_;
					i_559_ += i_558_++ + i_558_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method8457(Class294 class294) {
		((HardwareRenderer) this).aClass294_8993 = class294;
		method14374();
	}

	public Class294 method8458() {
		return new Class294(((HardwareRenderer) this).aClass294_8993);
	}

	public void method8521() {
		/* empty */
	}

	public Class384 method8453() {
		return new Class384(((HardwareRenderer) this).aClass384_8995);
	}

	HardwareRenderer(Interface22 interface22) {
		super(interface22);
		((HardwareRenderer) this).aBool9012 = false;
		((HardwareRenderer) this).anInt8983 = 0;
		((HardwareRenderer) this).anInt9002 = 0;
		((HardwareRenderer) this).anInt9009 = 0;
		((HardwareRenderer) this).anInt8986 = 0;
		((HardwareRenderer) this).anInt8990 = -364418191;
		((HardwareRenderer) this).anInt8991 = -1636539494;
		((HardwareRenderer) this).anInt8992 = 537382266;
		((HardwareRenderer) this).aFloatArrayArray8989 = new float[6][4];
		((HardwareRenderer) this).aFloat8978 = 1.0F;
		((HardwareRenderer) this).aFloat8985 = 0.0F;
		((HardwareRenderer) this).anInt9005 = -901487488;
		((HardwareRenderer) this).aBool8997 = false;
		((HardwareRenderer) this).aClass229_9013 = new SoftCache(16);
		((HardwareRenderer) this).anInt9015 = -1591418195;
		try {
			((HardwareRenderer) this).aClass229_9006 = new SoftCache(256);
			((HardwareRenderer) this).aClass294_8993 = new Class294();
			((HardwareRenderer) this).aClass384_8994 = new Class384();
			((HardwareRenderer) this).aClass384_8995 = new Class384();
			((HardwareRenderer) this).aClass384_8996 = new Class384();
			method14369(1);
			method14409(0);
			Class38.method854(true, true, -1425832759);
			((HardwareRenderer) this).aBool9012 = true;
			((HardwareRenderer) this).anInt8977 = (int) Class169.method2869(1594851121) * -987269935;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method8396(-752657427);
			throw new RuntimeException("");
		}
	}

	public void m(int i, float f, float f_595_, float f_596_, float f_597_, float f_598_) {
		((HardwareRenderer) this).anInt8990 = (int) (65535.0F * f) * 1216319887;
		((HardwareRenderer) this).anInt8991 = -1460403627 * (int) (65535.0F * f_595_);
		float f_599_ = (float) Math.sqrt((double) (f_598_ * f_598_ + (f_597_ * f_597_ + f_596_ * f_596_)));
		((HardwareRenderer) this).anInt9011 = (int) (f_596_ * 65535.0F / f_599_) * 672118063;
		((HardwareRenderer) this).anInt8988 = (int) (65535.0F * f_597_ / f_599_) * -1077609237;
		((HardwareRenderer) this).anInt9007 = 1394142547 * (int) (f_598_ * 65535.0F / f_599_);
	}

	public void J(int i) {
		/* empty */
	}

	public void c(int i, int i_600_, int i_601_) {
		for (int i_602_ = 0; i_602_ < ((HardwareRenderer) this).aClass185Array8984.length; i_602_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_602_];
			((Class185) class185).anInt2307 = (i & 0xffffff) * -1172711273;
			int i_603_ = ((Class185) class185).anInt2307 * 1402414887 >>> 16 & 0xff;
			if (i_603_ < 2)
				i_603_ = 2;
			int i_604_ = 1402414887 * ((Class185) class185).anInt2307 >> 8 & 0xff;
			if (i_604_ < 2)
				i_604_ = 2;
			int i_605_ = 1402414887 * ((Class185) class185).anInt2307 & 0xff;
			if (i_605_ < 2)
				i_605_ = 2;
			((Class185) class185).anInt2307 = -1172711273 * (i_603_ << 16 | i_604_ << 8 | i_605_);
			if (i_600_ < 0)
				((Class185) class185).aBool2304 = false;
			else
				((Class185) class185).aBool2304 = true;
		}
	}

	public void method8568(boolean bool) {
		((HardwareRenderer) this).aBool8997 = bool;
		((HardwareRenderer) this).aClass229_9006.method3859(-1268608854);
	}

	void method14374() {
		((HardwareRenderer) this).aClass384_8994.method6522(((HardwareRenderer) this).aClass294_8993);
		((HardwareRenderer) this).aClass384_8996.method6562(((HardwareRenderer) this).aClass384_8994);
		((HardwareRenderer) this).aClass384_8996.method6523(((HardwareRenderer) this).aClass384_8995);
		((HardwareRenderer) this).aClass384_8996.method6539(((HardwareRenderer) this).aFloatArrayArray8989[0]);
		((HardwareRenderer) this).aClass384_8996.method6540(((HardwareRenderer) this).aFloatArrayArray8989[1]);
		((HardwareRenderer) this).aClass384_8996.method6535(((HardwareRenderer) this).aFloatArrayArray8989[2]);
		((HardwareRenderer) this).aClass384_8996.method6536(((HardwareRenderer) this).aFloatArrayArray8989[3]);
		((HardwareRenderer) this).aClass384_8996.method6613(((HardwareRenderer) this).aFloatArrayArray8989[4]);
		((HardwareRenderer) this).aClass384_8996.method6538(((HardwareRenderer) this).aFloatArrayArray8989[5]);
		float f = ((HardwareRenderer) this).aClass384_8995.method6587();
		float f_606_ = ((((HardwareRenderer) this).aClass384_8995.aFloatArray4667[10] * (f - 255.0F)) + ((HardwareRenderer) this).aClass384_8995.aFloatArray4667[14]);
		float f_607_ = (((HardwareRenderer) this).aClass384_8995.aFloatArray4667[10] * f + ((HardwareRenderer) this).aClass384_8995.aFloatArray4667[14]);
		float f_608_ = f_607_ - f_606_;
		for (int i = 0; i < 656550451 * ((HardwareRenderer) this).anInt9008; i++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i];
			((Class185) class185).aFloat2305 = f_606_;
			((Class185) class185).aFloat2303 = f_608_;
		}
	}

	public Class152 method8466(int i, int i_609_, int i_610_, int i_611_, int i_612_, int i_613_) {
		return null;
	}

	public void ik(int i, int i_614_, int i_615_) {
		for (int i_616_ = 0; i_616_ < ((HardwareRenderer) this).aClass185Array8984.length; i_616_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_616_];
			((Class185) class185).anInt2307 = (i & 0xffffff) * -1172711273;
			int i_617_ = ((Class185) class185).anInt2307 * 1402414887 >>> 16 & 0xff;
			if (i_617_ < 2)
				i_617_ = 2;
			int i_618_ = 1402414887 * ((Class185) class185).anInt2307 >> 8 & 0xff;
			if (i_618_ < 2)
				i_618_ = 2;
			int i_619_ = 1402414887 * ((Class185) class185).anInt2307 & 0xff;
			if (i_619_ < 2)
				i_619_ = 2;
			((Class185) class185).anInt2307 = -1172711273 * (i_617_ << 16 | i_618_ << 8 | i_619_);
			if (i_614_ < 0)
				((Class185) class185).aBool2304 = false;
			else
				((Class185) class185).aBool2304 = true;
		}
	}

	public Class384 method8590() {
		return new Class384(((HardwareRenderer) this).aClass384_8995);
	}

	public int method8537(int i, int i_620_, int i_621_, int i_622_, int i_623_, int i_624_) {
		int i_625_ = 0;
		float f = (((float) i_621_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) + (((float) i_620_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]))));
		float f_626_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6] * (float) i_623_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] * (float) i_622_)) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * (float) i_624_));
		float f_627_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + ((float) i_620_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (float) i_621_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		float f_628_ = (((float) i_623_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * (float) i_622_)) + (float) i_624_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f < -f_627_ && f_626_ < -f_628_)
			i_625_ |= 0x10;
		else if (f > f_627_ && f_626_ > f_628_)
			i_625_ |= 0x20;
		float f_629_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_620_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + ((float) i_621_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]));
		float f_630_ = (((float) i_624_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((float) i_622_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_623_)));
		if (f_629_ < -f_627_ && f_630_ < -f_628_)
			i_625_ |= 0x1;
		if (f_629_ > f_627_ && f_630_ > f_628_)
			i_625_ |= 0x2;
		float f_631_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_620_) + (((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9] * (float) i_621_));
		float f_632_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] * (float) i_622_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_623_) + ((float) i_624_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		if (f_631_ < -f_627_ && f_632_ < -f_628_)
			i_625_ |= 0x4;
		if (f_631_ > f_627_ && f_632_ > f_628_)
			i_625_ |= 0x8;
		return i_625_;
	}

	public void method8490() {
		/* empty */
	}

	int method14375(int i) {
		return (anInterface22_5834.method144(i, -1854864850).anInt2074 * 1960017665);
	}

	public void fu(int i, int i_633_) {
		if ((i & 0x1) != 0)
			B(0, 0, 444800403 * ((HardwareRenderer) this).anInt8980, 2138511415 * ((HardwareRenderer) this).anInt8981, i_633_, 0);
		if (0 != (i & 0x2))
			method14410();
	}

	public void method8525(int i, int i_634_, int i_635_, int i_636_) {
		/* empty */
	}

	public boolean method8528() {
		return false;
	}

	void method14376(int i, int i_637_, int[] is, float[] fs) {
		((HardwareRenderer) this).anInt8980 = i * 299731099;
		((HardwareRenderer) this).anInt8981 = i_637_ * 1730944391;
		((HardwareRenderer) this).anIntArray8979 = is;
		((HardwareRenderer) this).aFloatArray9010 = fs;
		for (int i_638_ = 0; i_638_ < 656550451 * ((HardwareRenderer) this).anInt9008; i_638_++)
			((HardwareRenderer) this).aClass185Array8984[i_638_].method3071(2077515708);
		L();
		method8421();
	}

	public void method8476(int i, Class90 class90) {
		Class185 class185 = method14370(Thread.currentThread());
		((Class185) class185).anInt2306 = 473039441 * i;
		((Class185) class185).anInt2307 = 275882609 * class90.anInt946;
		((Class185) class185).anInt2313 = class90.anInt945 * 1456783305;
	}

	public void O() {
		for (int i = 0; i < ((HardwareRenderer) this).aClass185Array8984.length; i++) {
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).anInt2307 = (((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).anInt2336) * 1803205889;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).aBool2309 = false;
		}
	}

	public void method8658(int i, int i_639_, float f, int i_640_, int i_641_, float f_642_, int i_643_, int i_644_, float f_645_, int i_646_, int i_647_, int i_648_, int i_649_) {
		boolean bool = ((HardwareRenderer) this).anIntArray8979 != null;
		boolean bool_650_ = ((HardwareRenderer) this).aFloatArray9010 != null;
		if (bool || bool_650_) {
			Class185 class185 = method14370(Thread.currentThread());
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aBool1675 = false;
			i -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_640_ -= 72550989 * ((HardwareRenderer) this).anInt8983;
			i_643_ -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_639_ -= ((HardwareRenderer) this).anInt9009 * 1516535457;
			i_641_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			i_644_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			((Class144) class144).aBool1708 = (i < 0 || i > ((Class144) class144).anInt1684 || i_640_ < 0 || i_640_ > ((Class144) class144).anInt1684 || i_643_ < 0 || i_643_ > ((Class144) class144).anInt1684);
			int i_651_ = i_646_ >>> 24;
			if (0 == i_649_ || 1 == i_649_ && i_651_ == 255) {
				((Class144) class144).anInt1674 = 0;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_650_, false, (float) i_639_, (float) i_641_, (float) i_644_, (float) i, (float) i_640_, (float) i_643_, f, f_642_, f_645_, i_646_, i_647_, i_648_);
			} else if (1 == i_649_) {
				((Class144) class144).anInt1674 = 255 - i_651_;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_650_, false, (float) i_639_, (float) i_641_, (float) i_644_, (float) i, (float) i_640_, (float) i_643_, f, f_642_, f_645_, i_646_, i_647_, i_648_);
			} else if (i_649_ == 2) {
				((Class144) class144).anInt1674 = 128;
				((Class144) class144).aBool1672 = true;
				class144.method2425(bool, bool_650_, false, (float) i_639_, (float) i_641_, (float) i_644_, (float) i, (float) i_640_, (float) i_643_, f, f_642_, f_645_, i_646_, i_647_, i_648_);
			} else
				throw new IllegalArgumentException();
			((Class144) class144).aBool1675 = true;
		}
	}

	public Class384 method8587() {
		return new Class384(((HardwareRenderer) this).aClass384_8995);
	}

	public void method8536(int i, int i_652_, int i_653_, int i_654_, int i_655_, int i_656_, int i_657_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			Class185 class185 = method14370(Thread.currentThread());
			Class144 class144 = ((Class185) class185).aClass144_2310;
			int i_658_ = i_653_ - i;
			int i_659_ = i_654_ - i_652_;
			int i_660_ = i_658_ >= 0 ? i_658_ : -i_658_;
			int i_661_ = i_659_ >= 0 ? i_659_ : -i_659_;
			int i_662_ = i_660_;
			if (i_662_ < i_661_)
				i_662_ = i_661_;
			if (0 != i_662_) {
				int i_663_ = (i_658_ << 16) / i_662_;
				int i_664_ = (i_659_ << 16) / i_662_;
				i_658_ += i_663_ >> 16;
				i_659_ += i_664_ >> 16;
				if (i_664_ <= i_663_)
					i_663_ = -i_663_;
				else
					i_664_ = -i_664_;
				int i_665_ = i_664_ * i_656_ >> 17;
				int i_666_ = 1 + i_664_ * i_656_ >> 17;
				int i_667_ = i_663_ * i_656_ >> 17;
				int i_668_ = 1 + i_656_ * i_663_ >> 17;
				i -= class144.method2416();
				i_652_ -= class144.method2417();
				int i_669_ = i + i_665_;
				int i_670_ = i - i_666_;
				int i_671_ = i_658_ + i - i_666_;
				int i_672_ = i_658_ + i + i_665_;
				int i_673_ = i_667_ + i_652_;
				int i_674_ = i_652_ - i_668_;
				int i_675_ = i_652_ + i_659_ - i_668_;
				int i_676_ = i_659_ + i_652_ + i_667_;
				if (i_657_ == 0)
					((Class144) class144).anInt1674 = 0;
				else if (1 == i_657_)
					((Class144) class144).anInt1674 = 255 - (i_655_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class144) class144).aBool1708 = (i_669_ < 0 || i_669_ > ((Class144) class144).anInt1684 || i_670_ < 0 || i_670_ > ((Class144) class144).anInt1684 || i_671_ < 0 || i_671_ > ((Class144) class144).anInt1684);
				class144.method2428(true, false, false, (float) i_673_, (float) i_674_, (float) i_675_, (float) i_669_, (float) i_670_, (float) i_671_, 100.0F, 100.0F, 100.0F, i_655_);
				((Class144) class144).aBool1708 = (i_669_ < 0 || i_669_ > ((Class144) class144).anInt1684 || i_671_ < 0 || i_671_ > ((Class144) class144).anInt1684 || i_672_ < 0 || i_672_ > ((Class144) class144).anInt1684);
				class144.method2428(true, false, false, (float) i_673_, (float) i_675_, (float) i_676_, (float) i_669_, (float) i_671_, (float) i_672_, 100.0F, 100.0F, 100.0F, i_655_);
				RA(true);
			}
		}
	}

	public void method8459(int i) {
		Class528_Sub2.anInt8562 = Class528_Sub2.anInt8644 = i;
		if (656550451 * ((HardwareRenderer) this).anInt9008 > 1)
			throw new IllegalStateException();
		method14369(((HardwareRenderer) this).anInt9008 * 656550451);
		method14409(0);
	}

	public Interface8 method8419(int i, int i_677_) {
		return new Class125(i, i_677_);
	}

	public Class168 method8481() {
		return new Class168(0, "Pure Java", 1, "CPU", 0L);
	}

	void method8486() {
		if (((HardwareRenderer) this).aBool9012) {
			Class13.method508(true, false, -1632869233);
			((HardwareRenderer) this).aBool9012 = false;
		}
		((HardwareRenderer) this).aBool9014 = true;
	}

	public void method8483() {
		/* empty */
	}

	public void method8484() {
		/* empty */
	}

	public void method8515(float f, float f_678_, float f_679_, float[] fs) {
		float f_680_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * f_679_) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + f_678_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6])));
		float f_681_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * f + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * f_678_) + f_679_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f_680_ < -f_681_ || f_680_ > f_681_) {
			float[] fs_682_ = fs;
			float[] fs_683_ = fs;
			fs[2] = Float.NaN;
			fs_683_[1] = Float.NaN;
			fs_682_[0] = Float.NaN;
		} else {
			float f_684_ = ((f_678_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + f * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8] * f_679_));
			if (f_684_ < -f_681_ || f_684_ > f_681_) {
				float[] fs_685_ = fs;
				float[] fs_686_ = fs;
				fs[2] = Float.NaN;
				fs_686_[1] = Float.NaN;
				fs_685_[0] = Float.NaN;
			} else {
				float f_687_ = (f_679_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) * f + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) * f_678_));
				if (f_687_ < -f_681_ || f_687_ > f_681_) {
					float[] fs_688_ = fs;
					float[] fs_689_ = fs;
					fs[2] = Float.NaN;
					fs_689_[1] = Float.NaN;
					fs_688_[0] = Float.NaN;
				} else {
					float f_690_ = ((((HardwareRenderer) this).aClass384_8994.aFloatArray4667[14]) + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[2]) * f + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[6]) * f_678_ + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[10]) * f_679_);
					fs[0] = (((HardwareRenderer) this).aFloat9003 + (f_684_ * ((HardwareRenderer) this).aFloat8976 / f_681_));
					fs[1] = (f_687_ * ((HardwareRenderer) this).aFloat9004 / f_681_ + ((HardwareRenderer) this).aFloat8982);
					fs[2] = f_690_;
				}
			}
		}
	}

	public void DA(int i, Class455 class455, int i_691_, int i_692_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_693_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_694_;
			if (((HardwareRenderer) this).anInt8986 * 1383960921 < i_692_ + is.length)
				i_694_ = ((HardwareRenderer) this).anInt8986 * 1383960921 - i_692_;
			else
				i_694_ = is.length;
			int i_695_;
			if (((HardwareRenderer) this).anInt9009 * 1516535457 > i_692_) {
				i_695_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_692_;
				i_692_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			} else
				i_695_ = 0;
			if (i_694_ - i_695_ > 0) {
				int i_696_ = 444800403 * ((HardwareRenderer) this).anInt8980 * i_692_;
				for (int i_697_ = i_695_; i_697_ < i_694_; i_697_++) {
					int i_698_ = is[i_697_] + i_691_;
					int i_699_ = is_693_[i_697_];
					if (((HardwareRenderer) this).anInt8983 * 72550989 > i_698_) {
						i_699_ -= (72550989 * ((HardwareRenderer) this).anInt8983 - i_698_);
						i_698_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (-1710988237 * ((HardwareRenderer) this).anInt9002 < i_699_ + i_698_)
						i_699_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - i_698_);
					i_698_ += i_696_;
					for (int i_700_ = -i_699_; i_700_ < 0; i_700_++)
						((HardwareRenderer) this).anIntArray8979[i_698_++] = i;
					i_696_ += ((HardwareRenderer) this).anInt8980 * 444800403;
				}
			}
		}
	}

	boolean method14377(int i) {
		if (((HardwareRenderer) this).aBool8997 || anInterface22_5834.method144(i, -1984056091).aBool2065)
			return true;
		return false;
	}

	public void method8487(int i) {
		int i_701_ = i - 1426154545 * ((HardwareRenderer) this).anInt8977;
		for (Class282_Sub27 class282_sub27 = (Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.method3866(863387437); null != class282_sub27; class282_sub27 = (Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.method3867(297413420)) {
			if (((Class282_Sub27) class282_sub27).aBool7693) {
				((Class282_Sub27) class282_sub27).anInt7692 += i_701_;
				int i_702_ = ((Class282_Sub27) class282_sub27).anInt7692 / 50;
				if (i_702_ > 0) {
					Class169 class169 = anInterface22_5834.method144((((Class282_Sub27) class282_sub27).anInt7695), -1866470607);
					float f = class169.aBool2065 ? 64.0F : 128.0F;
					class282_sub27.method12403((int) (f * ((float) class169.aByte2081 * ((float) i_701_ / 1000.0F) / 64.0F)), (int) ((float) class169.aByte2090 * ((float) i_701_ / 1000.0F) / 64.0F * f));
					((Class282_Sub27) class282_sub27).anInt7692 -= 50 * i_702_;
				}
				((Class282_Sub27) class282_sub27).aBool7693 = false;
			}
		}
		((HardwareRenderer) this).anInt8977 = -987269935 * i;
		((HardwareRenderer) this).aClass229_9013.method3858(5, (byte) -11);
		((HardwareRenderer) this).aClass229_9006.method3858(5, (byte) -40);
	}

	public void fq(int i, int i_703_, int i_704_, int i_705_, int i_706_) {
		if (((HardwareRenderer) this).anIntArray8979 != null && (i_703_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_703_ < ((HardwareRenderer) this).anInt8986 * 1383960921)) {
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				i_704_ -= 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i = 72550989 * ((HardwareRenderer) this).anInt8983;
			}
			if (i_704_ + i > -1710988237 * ((HardwareRenderer) this).anInt9002)
				i_704_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - i;
			int i_707_ = i_703_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i;
			int i_708_ = i_705_ >>> 24;
			if (0 == i_706_ || 1 == i_706_ && i_708_ == 255) {
				for (int i_709_ = 0; i_709_ < i_704_; i_709_++)
					((HardwareRenderer) this).anIntArray8979[i_707_ + i_709_] = i_705_;
			} else if (1 == i_706_) {
				i_705_ = (((i_705_ & 0xff00) * i_708_ >> 8 & 0xff00) + ((i_705_ & 0xff00ff) * i_708_ >> 8 & 0xff00ff) + (i_708_ << 24));
				int i_710_ = 256 - i_708_;
				for (int i_711_ = 0; i_711_ < i_704_; i_711_++) {
					int i_712_ = (((HardwareRenderer) this).anIntArray8979[i_711_ + i_707_]);
					i_712_ = ((i_710_ * (i_712_ & 0xff00) >> 8 & 0xff00) + ((i_712_ & 0xff00ff) * i_710_ >> 8 & 0xff00ff));
					((HardwareRenderer) this).anIntArray8979[i_711_ + i_707_] = i_705_ + i_712_;
				}
			} else if (i_706_ == 2) {
				for (int i_713_ = 0; i_713_ < i_704_; i_713_++) {
					int i_714_ = (((HardwareRenderer) this).anIntArray8979[i_707_ + i_713_]);
					int i_715_ = i_714_ + i_705_;
					int i_716_ = (i_705_ & 0xff00ff) + (i_714_ & 0xff00ff);
					i_714_ = (i_715_ - i_716_ & 0x10000) + (i_716_ & 0x1000100);
					((HardwareRenderer) this).anIntArray8979[i_713_ + i_707_] = i_715_ - i_714_ | i_714_ - (i_714_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public int dd() {
		return 0;
	}

	public void method8509(int[] is) {
		is[0] = 444800403 * ((HardwareRenderer) this).anInt8980;
		is[1] = ((HardwareRenderer) this).anInt8981 * 2138511415;
	}

	public int df() {
		return 0;
	}

	public int dv() {
		return 0;
	}

	boolean method14378() {
		return ((HardwareRenderer) this).aBool9014;
	}

	boolean method14379() {
		return ((HardwareRenderer) this).aBool9014;
	}

	public FontRenderer method8660(Class414 class414, Class91[] class91s, boolean bool) {
		int[] is = new int[class91s.length];
		int[] is_717_ = new int[class91s.length];
		boolean bool_718_ = false;
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].anInt957;
			is_717_[i] = class91s[i].anInt954;
			if (null != class91s[i].aByteArray961)
				bool_718_ = true;
		}
		if (bool) {
			if (bool_718_)
				return new Class8_Sub2(this, class414, class91s, is, is_717_);
			return new Class8_Sub1(this, class414, class91s, is, is_717_);
		}
		if (bool_718_)
			throw new IllegalArgumentException("");
		return new Class8_Sub3(this, class414, class91s, is, is_717_);
	}

	boolean method14380(int i) {
		return anInterface22_5834.method139(i, -754571180);
	}

	boolean method14381(int i) {
		return anInterface22_5834.method139(i, -1703113836);
	}

	boolean method14382(int i) {
		if (((HardwareRenderer) this).aBool8997 || anInterface22_5834.method144(i, -2014832699).aBool2065)
			return true;
		return false;
	}

	int method14383(int i) {
		return (anInterface22_5834.method144(i, -1963948666).anInt2074 * 1960017665);
	}

	public boolean method8495() {
		return false;
	}

	public void method8477(Class152 class152) {
		/* empty */
	}

	void fw(int i, int i_719_, int i_720_, int i_721_, int i_722_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i_720_ < 0)
				i_720_ = -i_720_;
			int i_723_ = i_719_ - i_720_;
			if (i_723_ < 1516535457 * ((HardwareRenderer) this).anInt9009)
				i_723_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			int i_724_ = 1 + (i_719_ + i_720_);
			if (i_724_ > 1383960921 * ((HardwareRenderer) this).anInt8986)
				i_724_ = 1383960921 * ((HardwareRenderer) this).anInt8986;
			int i_725_ = i_723_;
			int i_726_ = i_720_ * i_720_;
			int i_727_ = 0;
			int i_728_ = i_719_ - i_725_;
			int i_729_ = i_728_ * i_728_;
			int i_730_ = i_729_ - i_728_;
			if (i_719_ > i_724_)
				i_719_ = i_724_;
			int i_731_ = i_721_ >>> 24;
			if (i_722_ == 0 || 1 == i_722_ && i_731_ == 255) {
				while (i_725_ < i_719_) {
					for (/**/; i_730_ <= i_726_ || i_729_ <= i_726_; i_730_ += i_727_++ + i_727_)
						i_729_ += i_727_ + i_727_;
					int i_732_ = 1 + (i - i_727_);
					if (i_732_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_732_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_733_ = i_727_ + i;
					if (i_733_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_733_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_734_ = i_732_ + i_725_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_735_ = i_732_; i_735_ < i_733_; i_735_++)
						((HardwareRenderer) this).anIntArray8979[i_734_++] = i_721_;
					i_725_++;
					i_729_ -= i_728_-- + i_728_;
					i_730_ -= i_728_ + i_728_;
				}
				i_727_ = i_720_;
				i_728_ = i_725_ - i_719_;
				i_730_ = i_728_ * i_728_ + i_726_;
				i_729_ = i_730_ - i_727_;
				i_730_ -= i_728_;
				while (i_725_ < i_724_) {
					for (/**/; i_730_ > i_726_ && i_729_ > i_726_; i_729_ -= i_727_ + i_727_)
						i_730_ -= i_727_-- + i_727_;
					int i_736_ = i - i_727_;
					if (i_736_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_736_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_737_ = i + i_727_;
					if (i_737_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_737_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_738_ = i_736_ + i_725_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_739_ = i_736_; i_739_ <= i_737_; i_739_++)
						((HardwareRenderer) this).anIntArray8979[i_738_++] = i_721_;
					i_725_++;
					i_730_ += i_728_ + i_728_;
					i_729_ += i_728_++ + i_728_;
				}
			} else if (1 == i_722_) {
				i_721_ = ((i_731_ * (i_721_ & 0xff00) >> 8 & 0xff00) + (i_731_ * (i_721_ & 0xff00ff) >> 8 & 0xff00ff) + (i_731_ << 24));
				int i_740_ = 256 - i_731_;
				while (i_725_ < i_719_) {
					for (/**/; i_730_ <= i_726_ || i_729_ <= i_726_; i_730_ += i_727_++ + i_727_)
						i_729_ += i_727_ + i_727_;
					int i_741_ = i - i_727_ + 1;
					if (i_741_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_741_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_742_ = i + i_727_;
					if (i_742_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_742_ = -1710988237 * ((HardwareRenderer) this).anInt9002;
					int i_743_ = (i_741_ + i_725_ * (444800403 * ((HardwareRenderer) this).anInt8980));
					for (int i_744_ = i_741_; i_744_ < i_742_; i_744_++) {
						int i_745_ = ((HardwareRenderer) this).anIntArray8979[i_743_];
						i_745_ = (((i_745_ & 0xff00) * i_740_ >> 8 & 0xff00) + ((i_745_ & 0xff00ff) * i_740_ >> 8 & 0xff00ff));
						((HardwareRenderer) this).anIntArray8979[i_743_++] = i_721_ + i_745_;
					}
					i_725_++;
					i_729_ -= i_728_-- + i_728_;
					i_730_ -= i_728_ + i_728_;
				}
				i_727_ = i_720_;
				i_728_ = -i_728_;
				i_730_ = i_726_ + i_728_ * i_728_;
				i_729_ = i_730_ - i_727_;
				i_730_ -= i_728_;
				while (i_725_ < i_724_) {
					for (/**/; i_730_ > i_726_ && i_729_ > i_726_; i_729_ -= i_727_ + i_727_)
						i_730_ -= i_727_-- + i_727_;
					int i_746_ = i - i_727_;
					if (i_746_ < ((HardwareRenderer) this).anInt8983 * 72550989)
						i_746_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_747_ = i_727_ + i;
					if (i_747_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_747_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_748_ = i_746_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_725_);
					for (int i_749_ = i_746_; i_749_ <= i_747_; i_749_++) {
						int i_750_ = ((HardwareRenderer) this).anIntArray8979[i_748_];
						i_750_ = ((i_740_ * (i_750_ & 0xff00) >> 8 & 0xff00) + (i_740_ * (i_750_ & 0xff00ff) >> 8 & 0xff00ff));
						((HardwareRenderer) this).anIntArray8979[i_748_++] = i_721_ + i_750_;
					}
					i_725_++;
					i_730_ += i_728_ + i_728_;
					i_729_ += i_728_++ + i_728_;
				}
			} else if (i_722_ == 2) {
				while (i_725_ < i_719_) {
					for (/**/; i_730_ <= i_726_ || i_729_ <= i_726_; i_730_ += i_727_++ + i_727_)
						i_729_ += i_727_ + i_727_;
					int i_751_ = i - i_727_ + 1;
					if (i_751_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_751_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_752_ = i_727_ + i;
					if (i_752_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_752_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_753_ = i_751_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_725_);
					for (int i_754_ = i_751_; i_754_ < i_752_; i_754_++) {
						int i_755_ = ((HardwareRenderer) this).anIntArray8979[i_753_];
						int i_756_ = i_721_ + i_755_;
						int i_757_ = (i_721_ & 0xff00ff) + (i_755_ & 0xff00ff);
						i_755_ = (i_757_ & 0x1000100) + (i_756_ - i_757_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_753_++] = i_756_ - i_755_ | i_755_ - (i_755_ >>> 8);
					}
					i_725_++;
					i_729_ -= i_728_-- + i_728_;
					i_730_ -= i_728_ + i_728_;
				}
				i_727_ = i_720_;
				i_728_ = -i_728_;
				i_730_ = i_728_ * i_728_ + i_726_;
				i_729_ = i_730_ - i_727_;
				i_730_ -= i_728_;
				while (i_725_ < i_724_) {
					for (/**/; i_730_ > i_726_ && i_729_ > i_726_; i_729_ -= i_727_ + i_727_)
						i_730_ -= i_727_-- + i_727_;
					int i_758_ = i - i_727_;
					if (i_758_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_758_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_759_ = i_727_ + i;
					if (i_759_ > -1710988237 * ((HardwareRenderer) this).anInt9002 - 1)
						i_759_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_760_ = i_758_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_725_);
					for (int i_761_ = i_758_; i_761_ <= i_759_; i_761_++) {
						int i_762_ = ((HardwareRenderer) this).anIntArray8979[i_760_];
						int i_763_ = i_721_ + i_762_;
						int i_764_ = (i_762_ & 0xff00ff) + (i_721_ & 0xff00ff);
						i_762_ = (i_764_ & 0x1000100) + (i_763_ - i_764_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_760_++] = i_763_ - i_762_ | i_762_ - (i_762_ >>> 8);
					}
					i_725_++;
					i_730_ += i_728_ + i_728_;
					i_729_ += i_728_++ + i_728_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	int method14384(int i) {
		return (anInterface22_5834.method144(i, -1954800491).aShort2073 & 0xffff);
	}

	int method14385(int i) {
		return (anInterface22_5834.method144(i, -2051206436).aShort2073 & 0xffff);
	}

	void method8485() {
		if (((HardwareRenderer) this).aBool9012) {
			Class13.method508(true, false, 208447629);
			((HardwareRenderer) this).aBool9012 = false;
		}
		((HardwareRenderer) this).aBool9014 = true;
	}

	boolean method14386(int i) {
		return (anInterface22_5834.method144(i, -1929341740).aBool2086 || anInterface22_5834.method144(i, -1808225525).aBool2059);
	}

	public boolean method8489() {
		return false;
	}

	public boolean method8674() {
		return false;
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub2(this);
	}

	public boolean method8492() {
		return true;
	}

	public boolean method8599() {
		return false;
	}

	public void method8520(int i, int i_765_, int i_766_, int i_767_, int i_768_, int i_769_) {
		XA(i, i_765_, i_766_, i_768_, i_769_);
		XA(i, i_767_ + i_765_ - 1, i_766_, i_768_, i_769_);
		G(i, i_765_ + 1, i_767_ - 2, i_768_, i_769_);
		G(i + i_766_ - 1, 1 + i_765_, i_767_ - 2, i_768_, i_769_);
	}

	public Class152 method8636(int i, int i_770_, int i_771_, int i_772_, int i_773_, int i_774_) {
		return null;
	}

	void method8555(int i, int i_775_) throws Exception_Sub3 {
		aClass158_Sub2_5841.method14353(i, i_775_);
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-1661310222);
	}

	public boolean method8431() {
		return false;
	}

	public boolean method8644() {
		return false;
	}

	public void method8475(int i, Class90 class90) {
		for (int i_776_ = 0; i_776_ < ((HardwareRenderer) this).aClass185Array8984.length; i_776_++) {
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_776_]).anInt2336 = ((Class185) (((HardwareRenderer) this).aClass185Array8984[i_776_])).anInt2307 * 521028353;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_776_]).anInt2306 = i * 473039441;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_776_]).anInt2307 = 275882609 * class90.anInt946;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_776_]).anInt2313 = 1456783305 * class90.anInt945;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_776_]).aBool2309 = true;
		}
	}

	public boolean method8578() {
		return false;
	}

	public boolean method8462() {
		return false;
	}

	public boolean method8501() {
		return false;
	}

	public void method8560(int i) {
		Class528_Sub2.anInt8562 = Class528_Sub2.anInt8644 = i;
		if (656550451 * ((HardwareRenderer) this).anInt9008 > 1)
			throw new IllegalStateException();
		method14369(((HardwareRenderer) this).anInt9008 * 656550451);
		method14409(0);
	}

	public boolean method8503() {
		return false;
	}

	public boolean method8614() {
		return false;
	}

	public boolean method8504() {
		return false;
	}

	public void method8491(boolean bool) {
		/* empty */
	}

	Class158_Sub2 method8558(Canvas canvas, int i, int i_777_) {
		return Class52_Sub1.method14493(this, canvas, i, i_777_, -2002710225);
	}

	public void fd(int i, int i_778_) {
		if ((i & 0x1) != 0)
			B(0, 0, 444800403 * ((HardwareRenderer) this).anInt8980, 2138511415 * ((HardwareRenderer) this).anInt8981, i_778_, 0);
		if (0 != (i & 0x2))
			method14410();
	}

	public void method8445() {
		/* empty */
	}

	public void method8497() {
		/* empty */
	}

	public void method8424(Class384 class384) {
		((HardwareRenderer) this).aClass384_8995.method6562(class384);
		method14374();
	}

	public void method8473(int[] is) {
		is[0] = 444800403 * ((HardwareRenderer) this).anInt8980;
		is[1] = ((HardwareRenderer) this).anInt8981 * 2138511415;
	}

	public void method8436(int[] is) {
		is[0] = 444800403 * ((HardwareRenderer) this).anInt8980;
		is[1] = ((HardwareRenderer) this).anInt8981 * 2138511415;
	}

	public void method8661(int[] is) {
		is[0] = 444800403 * ((HardwareRenderer) this).anInt8980;
		is[1] = ((HardwareRenderer) this).anInt8981 * 2138511415;
	}

	public void method8559(int i) {
		Class528_Sub2.anInt8562 = Class528_Sub2.anInt8644 = i;
		if (656550451 * ((HardwareRenderer) this).anInt9008 > 1)
			throw new IllegalStateException();
		method14369(((HardwareRenderer) this).anInt9008 * 656550451);
		method14409(0);
	}

	void method14387() {
		if (((HardwareRenderer) this).aFloatArray9010 != null) {
			if (72550989 * ((HardwareRenderer) this).anInt8983 == 0 && (((HardwareRenderer) this).anInt9002 * -1710988237 == ((HardwareRenderer) this).anInt8980 * 444800403) && ((HardwareRenderer) this).anInt9009 * 1516535457 == 0 && (((HardwareRenderer) this).anInt8986 * 1383960921 == 2138511415 * ((HardwareRenderer) this).anInt8981)) {
				int i = ((HardwareRenderer) this).aFloatArray9010.length;
				int i_779_ = i - (i & 0x7);
				int i_780_ = 0;
				while (i_780_ < i_779_) {
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
				}
				while (i_780_ < i)
					((HardwareRenderer) this).aFloatArray9010[i_780_++] = 2.14748365E9F;
			} else {
				int i = (((HardwareRenderer) this).anInt9002 * -1710988237 - ((HardwareRenderer) this).anInt8983 * 72550989);
				int i_781_ = (((HardwareRenderer) this).anInt8986 * 1383960921 - 1516535457 * ((HardwareRenderer) this).anInt9009);
				int i_782_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i;
				int i_783_ = ((444800403 * ((HardwareRenderer) this).anInt8980 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
				int i_784_ = i >> 3;
				int i_785_ = i & 0x7;
				i = i_783_ - 1;
				for (int i_786_ = -i_781_; i_786_ < 0; i_786_++) {
					if (i_784_ > 0) {
						int i_787_ = i_784_;
						do {
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
						} while (--i_787_ > 0);
					}
					if (i_785_ > 0) {
						int i_788_ = i_785_;
						do
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
						while (--i_788_ > 0);
					}
					i += i_782_;
				}
			}
		}
	}

	void method14388() {
		if (((HardwareRenderer) this).aFloatArray9010 != null) {
			if (72550989 * ((HardwareRenderer) this).anInt8983 == 0 && (((HardwareRenderer) this).anInt9002 * -1710988237 == ((HardwareRenderer) this).anInt8980 * 444800403) && ((HardwareRenderer) this).anInt9009 * 1516535457 == 0 && (((HardwareRenderer) this).anInt8986 * 1383960921 == 2138511415 * ((HardwareRenderer) this).anInt8981)) {
				int i = ((HardwareRenderer) this).aFloatArray9010.length;
				int i_789_ = i - (i & 0x7);
				int i_790_ = 0;
				while (i_790_ < i_789_) {
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
				}
				while (i_790_ < i)
					((HardwareRenderer) this).aFloatArray9010[i_790_++] = 2.14748365E9F;
			} else {
				int i = (((HardwareRenderer) this).anInt9002 * -1710988237 - ((HardwareRenderer) this).anInt8983 * 72550989);
				int i_791_ = (((HardwareRenderer) this).anInt8986 * 1383960921 - 1516535457 * ((HardwareRenderer) this).anInt9009);
				int i_792_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i;
				int i_793_ = ((444800403 * ((HardwareRenderer) this).anInt8980 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
				int i_794_ = i >> 3;
				int i_795_ = i & 0x7;
				i = i_793_ - 1;
				for (int i_796_ = -i_791_; i_796_ < 0; i_796_++) {
					if (i_794_ > 0) {
						int i_797_ = i_794_;
						do {
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
						} while (--i_797_ > 0);
					}
					if (i_795_ > 0) {
						int i_798_ = i_795_;
						do
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
						while (--i_798_ > 0);
					}
					i += i_792_;
				}
			}
		}
	}

	public void eq(boolean bool) {
		Class185 class185 = method14370(Thread.currentThread());
		((Class185) class185).aBool2334 = bool;
	}

	public void method8513(int i, int i_799_, int i_800_, int i_801_) {
		((HardwareRenderer) this).anInt8998 = 1009607649 * i;
		((HardwareRenderer) this).anInt8999 = 117131383 * i_799_;
		((HardwareRenderer) this).anInt9000 = -1636098283 * i_800_;
		((HardwareRenderer) this).anInt9001 = i_801_ * 995917955;
		method14364();
	}

	public void method8691() {
		/* empty */
	}

	public boolean method8502() {
		return false;
	}

	public NativeSprite method8518(Class91 class91, boolean bool) {
		int[] is = class91.anIntArray955;
		byte[] is_802_ = class91.aByteArray960;
		int i = class91.anInt957;
		int i_803_ = class91.anInt954;
		Class160_Sub1 class160_sub1;
		if (bool && null == class91.aByteArray961) {
			int[] is_804_ = new int[is.length];
			byte[] is_805_ = new byte[i * i_803_];
			for (int i_806_ = 0; i_806_ < i_803_; i_806_++) {
				int i_807_ = i_806_ * i;
				for (int i_808_ = 0; i_808_ < i; i_808_++)
					is_805_[i_808_ + i_807_] = is_802_[i_808_ + i_807_];
			}
			for (int i_809_ = 0; i_809_ < is.length; i_809_++)
				is_804_[i_809_] = is[i_809_];
			class160_sub1 = new Class160_Sub1_Sub2(this, is_805_, is_804_, i, i_803_);
		} else {
			int[] is_810_ = new int[i_803_ * i];
			byte[] is_811_ = class91.aByteArray961;
			if (is_811_ != null) {
				for (int i_812_ = 0; i_812_ < i_803_; i_812_++) {
					int i_813_ = i * i_812_;
					for (int i_814_ = 0; i_814_ < i; i_814_++)
						is_810_[i_814_ + i_813_] = (is[is_802_[i_814_ + i_813_] & 0xff] | is_811_[i_814_ + i_813_] << 24);
				}
				class160_sub1 = new Class160_Sub1_Sub3(this, is_810_, i, i_803_);
			} else {
				for (int i_815_ = 0; i_815_ < i_803_; i_815_++) {
					int i_816_ = i_815_ * i;
					for (int i_817_ = 0; i_817_ < i; i_817_++) {
						int i_818_ = is[is_802_[i_817_ + i_816_] & 0xff];
						is_810_[i_816_ + i_817_] = i_818_ != 0 ? ~0xffffff | i_818_ : 0;
					}
				}
				class160_sub1 = new Class160_Sub1_Sub1(this, is_810_, i, i_803_);
			}
		}
		class160_sub1.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return class160_sub1;
	}

	void method14389() {
		int i = (-1710988237 * ((HardwareRenderer) this).anInt9002 - ((HardwareRenderer) this).anInt8983 * 72550989);
		int i_819_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1516535457 * ((HardwareRenderer) this).anInt9009);
		float f = (((HardwareRenderer) this).aFloat8976 = ((float) (((HardwareRenderer) this).anInt9000 * -441894851) / 2.0F));
		float f_820_ = (((HardwareRenderer) this).aFloat9004 = (float) (3132971 * ((HardwareRenderer) this).anInt9001) / 2.0F);
		((HardwareRenderer) this).aFloat9003 = (float) (116006945 * ((HardwareRenderer) this).anInt8998) + f;
		((HardwareRenderer) this).aFloat8982 = (float) (842600775 * ((HardwareRenderer) this).anInt8999) + f_820_;
		for (int i_821_ = 0; i_821_ < 656550451 * ((HardwareRenderer) this).anInt9008; i_821_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_821_];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1679 = f;
			((Class144) class144).aFloat1702 = f_820_;
			((Class144) class144).aFloat1678 = (((HardwareRenderer) this).aFloat9003 - (float) (72550989 * ((HardwareRenderer) this).anInt8983));
			((Class144) class144).aFloat1680 = (((HardwareRenderer) this).aFloat8982 - (float) (((HardwareRenderer) this).anInt9009 * 1516535457));
			((Class144) class144).anInt1684 = i;
			((Class144) class144).anInt1700 = i_819_;
		}
		int i_822_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
		for (int i_823_ = ((HardwareRenderer) this).anInt9009 * 1516535457; i_823_ < 1383960921 * ((HardwareRenderer) this).anInt8986; i_823_++) {
			for (int i_824_ = 0; i_824_ < ((HardwareRenderer) this).anInt9008 * 656550451; i_824_++)
				((Class144) (((Class185) (((HardwareRenderer) this).aClass185Array8984[i_824_])).aClass144_2310)).anIntArray1685[i_823_ - ((HardwareRenderer) this).anInt9009 * 1516535457] = i_822_;
			i_822_ += 444800403 * ((HardwareRenderer) this).anInt8980;
		}
	}

	void method14390() {
		int i = (-1710988237 * ((HardwareRenderer) this).anInt9002 - ((HardwareRenderer) this).anInt8983 * 72550989);
		int i_825_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1516535457 * ((HardwareRenderer) this).anInt9009);
		float f = (((HardwareRenderer) this).aFloat8976 = ((float) (((HardwareRenderer) this).anInt9000 * -441894851) / 2.0F));
		float f_826_ = (((HardwareRenderer) this).aFloat9004 = (float) (3132971 * ((HardwareRenderer) this).anInt9001) / 2.0F);
		((HardwareRenderer) this).aFloat9003 = (float) (116006945 * ((HardwareRenderer) this).anInt8998) + f;
		((HardwareRenderer) this).aFloat8982 = (float) (842600775 * ((HardwareRenderer) this).anInt8999) + f_826_;
		for (int i_827_ = 0; i_827_ < 656550451 * ((HardwareRenderer) this).anInt9008; i_827_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_827_];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1679 = f;
			((Class144) class144).aFloat1702 = f_826_;
			((Class144) class144).aFloat1678 = (((HardwareRenderer) this).aFloat9003 - (float) (72550989 * ((HardwareRenderer) this).anInt8983));
			((Class144) class144).aFloat1680 = (((HardwareRenderer) this).aFloat8982 - (float) (((HardwareRenderer) this).anInt9009 * 1516535457));
			((Class144) class144).anInt1684 = i;
			((Class144) class144).anInt1700 = i_825_;
		}
		int i_828_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
		for (int i_829_ = ((HardwareRenderer) this).anInt9009 * 1516535457; i_829_ < 1383960921 * ((HardwareRenderer) this).anInt8986; i_829_++) {
			for (int i_830_ = 0; i_830_ < ((HardwareRenderer) this).anInt9008 * 656550451; i_830_++)
				((Class144) (((Class185) (((HardwareRenderer) this).aClass185Array8984[i_830_])).aClass144_2310)).anIntArray1685[i_829_ - ((HardwareRenderer) this).anInt9009 * 1516535457] = i_828_;
			i_828_ += 444800403 * ((HardwareRenderer) this).anInt8980;
		}
	}

	int method14391(int i) {
		return (anInterface22_5834.method144(i, -2065388903).anInt2074 * 1960017665);
	}

	public void ez() {
		((HardwareRenderer) this).anInt8983 = 0;
		((HardwareRenderer) this).anInt9009 = 0;
		((HardwareRenderer) this).anInt9002 = 1480196385 * ((HardwareRenderer) this).anInt8980;
		((HardwareRenderer) this).anInt8986 = ((HardwareRenderer) this).anInt8981 * 1628550159;
		method14364();
	}

	public void eh() {
		((HardwareRenderer) this).anInt8983 = 0;
		((HardwareRenderer) this).anInt9009 = 0;
		((HardwareRenderer) this).anInt9002 = 1480196385 * ((HardwareRenderer) this).anInt8980;
		((HardwareRenderer) this).anInt8986 = ((HardwareRenderer) this).anInt8981 * 1628550159;
		method14364();
	}

	public NativeSprite method8444(Class91 class91, boolean bool) {
		int[] is = class91.anIntArray955;
		byte[] is_831_ = class91.aByteArray960;
		int i = class91.anInt957;
		int i_832_ = class91.anInt954;
		Class160_Sub1 class160_sub1;
		if (bool && null == class91.aByteArray961) {
			int[] is_833_ = new int[is.length];
			byte[] is_834_ = new byte[i * i_832_];
			for (int i_835_ = 0; i_835_ < i_832_; i_835_++) {
				int i_836_ = i_835_ * i;
				for (int i_837_ = 0; i_837_ < i; i_837_++)
					is_834_[i_837_ + i_836_] = is_831_[i_837_ + i_836_];
			}
			for (int i_838_ = 0; i_838_ < is.length; i_838_++)
				is_833_[i_838_] = is[i_838_];
			class160_sub1 = new Class160_Sub1_Sub2(this, is_834_, is_833_, i, i_832_);
		} else {
			int[] is_839_ = new int[i_832_ * i];
			byte[] is_840_ = class91.aByteArray961;
			if (is_840_ != null) {
				for (int i_841_ = 0; i_841_ < i_832_; i_841_++) {
					int i_842_ = i * i_841_;
					for (int i_843_ = 0; i_843_ < i; i_843_++)
						is_839_[i_843_ + i_842_] = (is[is_831_[i_843_ + i_842_] & 0xff] | is_840_[i_843_ + i_842_] << 24);
				}
				class160_sub1 = new Class160_Sub1_Sub3(this, is_839_, i, i_832_);
			} else {
				for (int i_844_ = 0; i_844_ < i_832_; i_844_++) {
					int i_845_ = i_844_ * i;
					for (int i_846_ = 0; i_846_ < i; i_846_++) {
						int i_847_ = is[is_831_[i_846_ + i_845_] & 0xff];
						is_839_[i_845_ + i_846_] = i_847_ != 0 ? ~0xffffff | i_847_ : 0;
					}
				}
				class160_sub1 = new Class160_Sub1_Sub1(this, is_839_, i, i_832_);
			}
		}
		class160_sub1.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return class160_sub1;
	}

	public void fc(int i, int i_848_, int i_849_, int i_850_) {
		if (i < 0)
			i = 0;
		if (i_848_ < 0)
			i_848_ = 0;
		if (i_849_ > 444800403 * ((HardwareRenderer) this).anInt8980)
			i_849_ = ((HardwareRenderer) this).anInt8980 * 444800403;
		if (i_850_ > 2138511415 * ((HardwareRenderer) this).anInt8981)
			i_850_ = 2138511415 * ((HardwareRenderer) this).anInt8981;
		((HardwareRenderer) this).anInt8983 = i * -363774331;
		((HardwareRenderer) this).anInt9002 = i_849_ * 1714763515;
		((HardwareRenderer) this).anInt9009 = i_848_ * 1457972577;
		((HardwareRenderer) this).anInt8986 = 760194793 * i_850_;
		method14364();
	}

	public void fe(int i, int i_851_, int i_852_, int i_853_) {
		if (((HardwareRenderer) this).anInt8983 * 72550989 < i)
			((HardwareRenderer) this).anInt8983 = i * -363774331;
		if (((HardwareRenderer) this).anInt9009 * 1516535457 < i_851_)
			((HardwareRenderer) this).anInt9009 = i_851_ * 1457972577;
		if (-1710988237 * ((HardwareRenderer) this).anInt9002 > i_852_)
			((HardwareRenderer) this).anInt9002 = 1714763515 * i_852_;
		if (((HardwareRenderer) this).anInt8986 * 1383960921 > i_853_)
			((HardwareRenderer) this).anInt8986 = 760194793 * i_853_;
		method14364();
	}

	public MeshRasterizer method8564(RSMesh class157, int i, int i_854_, int i_855_, int i_856_) {
		return new Class528_Sub2(this, class157, i, i_855_, i_856_, i_854_);
	}

	void method8596(int i, int i_857_) throws Exception_Sub3 {
		aClass158_Sub2_5841.method14353(i, i_857_);
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-1963503773);
	}

	public Class294 method8685() {
		return new Class294(((HardwareRenderer) this).aClass294_8993);
	}

	public void method8496(int i, int i_858_, int i_859_, int i_860_, int i_861_, int i_862_, int i_863_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			Class185 class185 = method14370(Thread.currentThread());
			Class144 class144 = ((Class185) class185).aClass144_2310;
			int i_864_ = i_859_ - i;
			int i_865_ = i_860_ - i_858_;
			int i_866_ = i_864_ >= 0 ? i_864_ : -i_864_;
			int i_867_ = i_865_ >= 0 ? i_865_ : -i_865_;
			int i_868_ = i_866_;
			if (i_868_ < i_867_)
				i_868_ = i_867_;
			if (0 != i_868_) {
				int i_869_ = (i_864_ << 16) / i_868_;
				int i_870_ = (i_865_ << 16) / i_868_;
				i_864_ += i_869_ >> 16;
				i_865_ += i_870_ >> 16;
				if (i_870_ <= i_869_)
					i_869_ = -i_869_;
				else
					i_870_ = -i_870_;
				int i_871_ = i_870_ * i_862_ >> 17;
				int i_872_ = 1 + i_870_ * i_862_ >> 17;
				int i_873_ = i_869_ * i_862_ >> 17;
				int i_874_ = 1 + i_862_ * i_869_ >> 17;
				i -= class144.method2416();
				i_858_ -= class144.method2417();
				int i_875_ = i + i_871_;
				int i_876_ = i - i_872_;
				int i_877_ = i_864_ + i - i_872_;
				int i_878_ = i_864_ + i + i_871_;
				int i_879_ = i_873_ + i_858_;
				int i_880_ = i_858_ - i_874_;
				int i_881_ = i_858_ + i_865_ - i_874_;
				int i_882_ = i_865_ + i_858_ + i_873_;
				if (i_863_ == 0)
					((Class144) class144).anInt1674 = 0;
				else if (1 == i_863_)
					((Class144) class144).anInt1674 = 255 - (i_861_ >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				((Class144) class144).aBool1708 = (i_875_ < 0 || i_875_ > ((Class144) class144).anInt1684 || i_876_ < 0 || i_876_ > ((Class144) class144).anInt1684 || i_877_ < 0 || i_877_ > ((Class144) class144).anInt1684);
				class144.method2428(true, false, false, (float) i_879_, (float) i_880_, (float) i_881_, (float) i_875_, (float) i_876_, (float) i_877_, 100.0F, 100.0F, 100.0F, i_861_);
				((Class144) class144).aBool1708 = (i_875_ < 0 || i_875_ > ((Class144) class144).anInt1684 || i_877_ < 0 || i_877_ > ((Class144) class144).anInt1684 || i_878_ < 0 || i_878_ > ((Class144) class144).anInt1684);
				class144.method2428(true, false, false, (float) i_879_, (float) i_881_, (float) i_882_, (float) i_875_, (float) i_877_, (float) i_878_, 100.0F, 100.0F, 100.0F, i_861_);
				RA(true);
			}
		}
	}

	public MeshRasterizer method8561(RSMesh class157, int i, int i_883_, int i_884_, int i_885_) {
		return new Class528_Sub2(this, class157, i, i_884_, i_885_, i_883_);
	}

	public void fi(int i, int i_886_) {
		if ((i & 0x1) != 0)
			B(0, 0, 444800403 * ((HardwareRenderer) this).anInt8980, 2138511415 * ((HardwareRenderer) this).anInt8981, i_886_, 0);
		if (0 != (i & 0x2))
			method14410();
	}

	public void fk(int i, int i_887_, int i_888_, int i_889_) {
		if (((HardwareRenderer) this).anInt8983 * 72550989 < i)
			((HardwareRenderer) this).anInt8983 = i * -363774331;
		if (((HardwareRenderer) this).anInt9009 * 1516535457 < i_887_)
			((HardwareRenderer) this).anInt9009 = i_887_ * 1457972577;
		if (-1710988237 * ((HardwareRenderer) this).anInt9002 > i_888_)
			((HardwareRenderer) this).anInt9002 = 1714763515 * i_888_;
		if (((HardwareRenderer) this).anInt8986 * 1383960921 > i_889_)
			((HardwareRenderer) this).anInt8986 = 760194793 * i_889_;
		method14364();
	}

	public void method8511(int i, int i_890_, int i_891_, int i_892_, int i_893_, int i_894_) {
		XA(i, i_890_, i_891_, i_893_, i_894_);
		XA(i, i_892_ + i_890_ - 1, i_891_, i_893_, i_894_);
		G(i, i_890_ + 1, i_892_ - 2, i_893_, i_894_);
		G(i + i_891_ - 1, 1 + i_890_, i_892_ - 2, i_893_, i_894_);
	}

	int[] method14392(int i) {
		Class282_Sub27 class282_sub27;
		synchronized (((HardwareRenderer) this).aClass229_9006) {
			class282_sub27 = ((Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.get((long) i | ~0x7fffffffffffffffL));
			if (class282_sub27 == null) {
				if (!anInterface22_5834.method139(i, -677028064)) {
					int[] is = null;
					return is;
				}
				Class169 class169 = anInterface22_5834.method144(i, -2078345009);
				int i_895_ = (class169.aBool2065 || ((HardwareRenderer) this).aBool8997 ? 64 : ((HardwareRenderer) this).anInt9005 * -1392111239);
				class282_sub27 = (new Class282_Sub27(i, i_895_, anInterface22_5834.method141(i, 0.7F, i_895_, i_895_, true, -203677061), 1 != 1960017665 * class169.anInt2074));
				((HardwareRenderer) this).aClass229_9006.put(class282_sub27, (long) i | ~0x7fffffffffffffffL);
			}
		}
		((Class282_Sub27) class282_sub27).aBool7693 = true;
		return class282_sub27.method12406();
	}

	public void fp(int i, int i_896_, int i_897_, int i_898_, int i_899_, int i_900_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				i_897_ -= 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i = ((HardwareRenderer) this).anInt8983 * 72550989;
			}
			if (i_896_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
				i_898_ -= 1516535457 * ((HardwareRenderer) this).anInt9009 - i_896_;
				i_896_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
			}
			if (i + i_897_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
				i_897_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - i;
			if (i_896_ + i_898_ > 1383960921 * ((HardwareRenderer) this).anInt8986)
				i_898_ = 1383960921 * ((HardwareRenderer) this).anInt8986 - i_896_;
			if (i_897_ > 0 && i_898_ > 0 && i <= ((HardwareRenderer) this).anInt9002 * -1710988237 && i_896_ <= 1383960921 * ((HardwareRenderer) this).anInt8986) {
				int i_901_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i_897_;
				int i_902_ = i + i_896_ * (444800403 * ((HardwareRenderer) this).anInt8980);
				int i_903_ = i_899_ >>> 24;
				if (i_900_ == 0 || 1 == i_900_ && 255 == i_903_) {
					int i_904_ = i_897_ >> 3;
					int i_905_ = i_897_ & 0x7;
					i_897_ = i_902_ - 1;
					for (int i_906_ = -i_898_; i_906_ < 0; i_906_++) {
						if (i_904_ > 0) {
							i = i_904_;
							do {
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
							} while (--i > 0);
						}
						if (i_905_ > 0) {
							i = i_905_;
							do
								((HardwareRenderer) this).anIntArray8979[++i_897_] = i_899_;
							while (--i > 0);
						}
						i_897_ += i_901_;
					}
				} else if (i_900_ == 1) {
					i_899_ = ((((i_899_ & ~0xff00ff) >>> 8) * i_903_ & ~0xff00ff) + ((i_899_ & 0xff00ff) * i_903_ >> 8 & 0xff00ff));
					int i_907_ = 256 - i_903_;
					for (int i_908_ = 0; i_908_ < i_898_; i_908_++) {
						for (int i_909_ = -i_897_; i_909_ < 0; i_909_++) {
							int i_910_ = (((HardwareRenderer) this).anIntArray8979[i_902_]);
							i_910_ = ((i_907_ * ((i_910_ & ~0xff00ff) >>> 8) & ~0xff00ff) + (i_907_ * (i_910_ & 0xff00ff) >> 8 & 0xff00ff));
							((HardwareRenderer) this).anIntArray8979[i_902_++] = i_899_ + i_910_;
						}
						i_902_ += i_901_;
					}
				} else if (i_900_ == 2) {
					for (int i_911_ = 0; i_911_ < i_898_; i_911_++) {
						for (int i_912_ = -i_897_; i_912_ < 0; i_912_++) {
							int i_913_ = (((HardwareRenderer) this).anIntArray8979[i_902_]);
							int i_914_ = i_913_ + i_899_;
							int i_915_ = (i_899_ & 0xff00ff) + (i_913_ & 0xff00ff);
							i_913_ = (i_914_ - i_915_ & 0x10000) + (i_915_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_902_++] = i_914_ - i_913_ | i_913_ - (i_913_ >>> 8);
						}
						i_902_ += i_901_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void fb(int i, int i_916_, int i_917_, int i_918_, int i_919_, int i_920_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				i_917_ -= 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i = ((HardwareRenderer) this).anInt8983 * 72550989;
			}
			if (i_916_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
				i_918_ -= 1516535457 * ((HardwareRenderer) this).anInt9009 - i_916_;
				i_916_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
			}
			if (i + i_917_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
				i_917_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - i;
			if (i_916_ + i_918_ > 1383960921 * ((HardwareRenderer) this).anInt8986)
				i_918_ = 1383960921 * ((HardwareRenderer) this).anInt8986 - i_916_;
			if (i_917_ > 0 && i_918_ > 0 && i <= ((HardwareRenderer) this).anInt9002 * -1710988237 && i_916_ <= 1383960921 * ((HardwareRenderer) this).anInt8986) {
				int i_921_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i_917_;
				int i_922_ = i + i_916_ * (444800403 * ((HardwareRenderer) this).anInt8980);
				int i_923_ = i_919_ >>> 24;
				if (i_920_ == 0 || 1 == i_920_ && 255 == i_923_) {
					int i_924_ = i_917_ >> 3;
					int i_925_ = i_917_ & 0x7;
					i_917_ = i_922_ - 1;
					for (int i_926_ = -i_918_; i_926_ < 0; i_926_++) {
						if (i_924_ > 0) {
							i = i_924_;
							do {
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
							} while (--i > 0);
						}
						if (i_925_ > 0) {
							i = i_925_;
							do
								((HardwareRenderer) this).anIntArray8979[++i_917_] = i_919_;
							while (--i > 0);
						}
						i_917_ += i_921_;
					}
				} else if (i_920_ == 1) {
					i_919_ = ((((i_919_ & ~0xff00ff) >>> 8) * i_923_ & ~0xff00ff) + ((i_919_ & 0xff00ff) * i_923_ >> 8 & 0xff00ff));
					int i_927_ = 256 - i_923_;
					for (int i_928_ = 0; i_928_ < i_918_; i_928_++) {
						for (int i_929_ = -i_917_; i_929_ < 0; i_929_++) {
							int i_930_ = (((HardwareRenderer) this).anIntArray8979[i_922_]);
							i_930_ = ((i_927_ * ((i_930_ & ~0xff00ff) >>> 8) & ~0xff00ff) + (i_927_ * (i_930_ & 0xff00ff) >> 8 & 0xff00ff));
							((HardwareRenderer) this).anIntArray8979[i_922_++] = i_919_ + i_930_;
						}
						i_922_ += i_921_;
					}
				} else if (i_920_ == 2) {
					for (int i_931_ = 0; i_931_ < i_918_; i_931_++) {
						for (int i_932_ = -i_917_; i_932_ < 0; i_932_++) {
							int i_933_ = (((HardwareRenderer) this).anIntArray8979[i_922_]);
							int i_934_ = i_933_ + i_919_;
							int i_935_ = (i_919_ & 0xff00ff) + (i_933_ & 0xff00ff);
							i_933_ = (i_934_ - i_935_ & 0x10000) + (i_935_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_922_++] = i_934_ - i_933_ | i_933_ - (i_933_ >>> 8);
						}
						i_922_ += i_921_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void fv(int i, int i_936_, int i_937_, int i_938_, int i_939_, int i_940_, byte[] is, int i_941_, int i_942_) {
		if (((HardwareRenderer) this).anIntArray8979 != null && (i_937_ > 0 && i_938_ > 0)) {
			int i_943_ = 0;
			int i_944_ = 0;
			int i_945_ = (i_941_ << 16) / i_937_;
			int i_946_ = (is.length / i_941_ << 16) / i_938_;
			int i_947_ = i + 444800403 * ((HardwareRenderer) this).anInt8980 * i_936_;
			int i_948_ = ((HardwareRenderer) this).anInt8980 * 444800403 - i_937_;
			if (i_936_ + i_938_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_938_ -= (i_938_ + i_936_ - 1383960921 * ((HardwareRenderer) this).anInt8986);
			if (i_936_ < 1516535457 * ((HardwareRenderer) this).anInt9009) {
				int i_949_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_936_;
				i_938_ -= i_949_;
				i_947_ += ((HardwareRenderer) this).anInt8980 * 444800403 * i_949_;
				i_944_ += i_949_ * i_946_;
			}
			if (i + i_937_ > ((HardwareRenderer) this).anInt9002 * -1710988237) {
				int i_950_ = (i_937_ + i - ((HardwareRenderer) this).anInt9002 * -1710988237);
				i_937_ -= i_950_;
				i_948_ += i_950_;
			}
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				int i_951_ = 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i_937_ -= i_951_;
				i_947_ += i_951_;
				i_943_ += i_951_ * i_945_;
				i_948_ += i_951_;
			}
			int i_952_ = i_939_ >>> 24;
			int i_953_ = i_940_ >>> 24;
			if (0 == i_942_ || 1 == i_942_ && i_952_ == 255 && 255 == i_953_) {
				int i_954_ = i_943_;
				for (int i_955_ = -i_938_; i_955_ < 0; i_955_++) {
					int i_956_ = i_941_ * (i_944_ >> 16);
					for (int i_957_ = -i_937_; i_957_ < 0; i_957_++) {
						if (is[i_956_ + (i_943_ >> 16)] != 0)
							((HardwareRenderer) this).anIntArray8979[i_947_++] = i_940_;
						else
							((HardwareRenderer) this).anIntArray8979[i_947_++] = i_939_;
						i_943_ += i_945_;
					}
					i_944_ += i_946_;
					i_943_ = i_954_;
					i_947_ += i_948_;
				}
			} else if (i_942_ == 1) {
				int i_958_ = i_943_;
				for (int i_959_ = -i_938_; i_959_ < 0; i_959_++) {
					int i_960_ = (i_944_ >> 16) * i_941_;
					for (int i_961_ = -i_937_; i_961_ < 0; i_961_++) {
						int i_962_ = i_939_;
						if (is[i_960_ + (i_943_ >> 16)] != 0)
							i_962_ = i_940_;
						int i_963_ = i_962_ >>> 24;
						int i_964_ = 255 - i_963_;
						int i_965_ = ((HardwareRenderer) this).anIntArray8979[i_947_];
						((HardwareRenderer) this).anIntArray8979[i_947_++] = (((i_964_ * (i_965_ & 0xff00) + i_963_ * (i_962_ & 0xff00)) & 0xff0000) + ((i_963_ * (i_962_ & 0xff00ff) + (i_965_ & 0xff00ff) * i_964_) & ~0xff00ff)) >> 8;
						i_943_ += i_945_;
					}
					i_944_ += i_946_;
					i_943_ = i_958_;
					i_947_ += i_948_;
				}
			} else if (2 == i_942_) {
				int i_966_ = i_943_;
				for (int i_967_ = -i_938_; i_967_ < 0; i_967_++) {
					int i_968_ = i_941_ * (i_944_ >> 16);
					for (int i_969_ = -i_937_; i_969_ < 0; i_969_++) {
						int i_970_ = i_939_;
						if (is[(i_943_ >> 16) + i_968_] != 0)
							i_970_ = i_940_;
						if (i_970_ != 0) {
							int i_971_ = (((HardwareRenderer) this).anIntArray8979[i_947_]);
							int i_972_ = i_970_ + i_971_;
							int i_973_ = (i_971_ & 0xff00ff) + (i_970_ & 0xff00ff);
							i_971_ = (i_972_ - i_973_ & 0x10000) + (i_973_ & 0x1000100);
							((HardwareRenderer) this).anIntArray8979[i_947_++] = i_972_ - i_971_ | i_971_ - (i_971_ >>> 8);
						} else
							i_947_++;
						i_943_ += i_945_;
					}
					i_944_ += i_946_;
					i_943_ = i_966_;
					i_947_ += i_948_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void ff(int i, int i_974_, int i_975_, int i_976_, int i_977_, int i_978_, byte[] is, int i_979_, int i_980_) {
		if (((HardwareRenderer) this).anIntArray8979 != null && (i_975_ > 0 && i_976_ > 0)) {
			int i_981_ = 0;
			int i_982_ = 0;
			int i_983_ = (i_979_ << 16) / i_975_;
			int i_984_ = (is.length / i_979_ << 16) / i_976_;
			int i_985_ = i + 444800403 * ((HardwareRenderer) this).anInt8980 * i_974_;
			int i_986_ = ((HardwareRenderer) this).anInt8980 * 444800403 - i_975_;
			if (i_974_ + i_976_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_976_ -= (i_976_ + i_974_ - 1383960921 * ((HardwareRenderer) this).anInt8986);
			if (i_974_ < 1516535457 * ((HardwareRenderer) this).anInt9009) {
				int i_987_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_974_;
				i_976_ -= i_987_;
				i_985_ += ((HardwareRenderer) this).anInt8980 * 444800403 * i_987_;
				i_982_ += i_987_ * i_984_;
			}
			if (i + i_975_ > ((HardwareRenderer) this).anInt9002 * -1710988237) {
				int i_988_ = (i_975_ + i - ((HardwareRenderer) this).anInt9002 * -1710988237);
				i_975_ -= i_988_;
				i_986_ += i_988_;
			}
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				int i_989_ = 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i_975_ -= i_989_;
				i_985_ += i_989_;
				i_981_ += i_989_ * i_983_;
				i_986_ += i_989_;
			}
			int i_990_ = i_977_ >>> 24;
			int i_991_ = i_978_ >>> 24;
			if (0 == i_980_ || 1 == i_980_ && i_990_ == 255 && 255 == i_991_) {
				int i_992_ = i_981_;
				for (int i_993_ = -i_976_; i_993_ < 0; i_993_++) {
					int i_994_ = i_979_ * (i_982_ >> 16);
					for (int i_995_ = -i_975_; i_995_ < 0; i_995_++) {
						if (is[i_994_ + (i_981_ >> 16)] != 0)
							((HardwareRenderer) this).anIntArray8979[i_985_++] = i_978_;
						else
							((HardwareRenderer) this).anIntArray8979[i_985_++] = i_977_;
						i_981_ += i_983_;
					}
					i_982_ += i_984_;
					i_981_ = i_992_;
					i_985_ += i_986_;
				}
			} else if (i_980_ == 1) {
				int i_996_ = i_981_;
				for (int i_997_ = -i_976_; i_997_ < 0; i_997_++) {
					int i_998_ = (i_982_ >> 16) * i_979_;
					for (int i_999_ = -i_975_; i_999_ < 0; i_999_++) {
						int i_1000_ = i_977_;
						if (is[i_998_ + (i_981_ >> 16)] != 0)
							i_1000_ = i_978_;
						int i_1001_ = i_1000_ >>> 24;
						int i_1002_ = 255 - i_1001_;
						int i_1003_ = ((HardwareRenderer) this).anIntArray8979[i_985_];
						((HardwareRenderer) this).anIntArray8979[i_985_++] = (((i_1002_ * (i_1003_ & 0xff00) + i_1001_ * (i_1000_ & 0xff00)) & 0xff0000) + ((i_1001_ * (i_1000_ & 0xff00ff) + (i_1003_ & 0xff00ff) * i_1002_) & ~0xff00ff)) >> 8;
						i_981_ += i_983_;
					}
					i_982_ += i_984_;
					i_981_ = i_996_;
					i_985_ += i_986_;
				}
			} else if (2 == i_980_) {
				int i_1004_ = i_981_;
				for (int i_1005_ = -i_976_; i_1005_ < 0; i_1005_++) {
					int i_1006_ = i_979_ * (i_982_ >> 16);
					for (int i_1007_ = -i_975_; i_1007_ < 0; i_1007_++) {
						int i_1008_ = i_977_;
						if (is[(i_981_ >> 16) + i_1006_] != 0)
							i_1008_ = i_978_;
						if (i_1008_ != 0) {
							int i_1009_ = (((HardwareRenderer) this).anIntArray8979[i_985_]);
							int i_1010_ = i_1008_ + i_1009_;
							int i_1011_ = (i_1009_ & 0xff00ff) + (i_1008_ & 0xff00ff);
							i_1009_ = ((i_1010_ - i_1011_ & 0x10000) + (i_1011_ & 0x1000100));
							((HardwareRenderer) this).anIntArray8979[i_985_++] = i_1010_ - i_1009_ | i_1009_ - (i_1009_ >>> 8);
						} else
							i_985_++;
						i_981_ += i_983_;
					}
					i_982_ += i_984_;
					i_981_ = i_1004_;
					i_985_ += i_986_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void fr(int i, int i_1012_, int i_1013_, int i_1014_, int i_1015_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			if (i_1013_ < 0)
				i_1013_ = -i_1013_;
			int i_1016_ = i_1012_ - i_1013_;
			if (i_1016_ < 1516535457 * ((HardwareRenderer) this).anInt9009)
				i_1016_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			int i_1017_ = 1 + (i_1012_ + i_1013_);
			if (i_1017_ > 1383960921 * ((HardwareRenderer) this).anInt8986)
				i_1017_ = 1383960921 * ((HardwareRenderer) this).anInt8986;
			int i_1018_ = i_1016_;
			int i_1019_ = i_1013_ * i_1013_;
			int i_1020_ = 0;
			int i_1021_ = i_1012_ - i_1018_;
			int i_1022_ = i_1021_ * i_1021_;
			int i_1023_ = i_1022_ - i_1021_;
			if (i_1012_ > i_1017_)
				i_1012_ = i_1017_;
			int i_1024_ = i_1014_ >>> 24;
			if (i_1015_ == 0 || 1 == i_1015_ && i_1024_ == 255) {
				while (i_1018_ < i_1012_) {
					for (/**/; i_1023_ <= i_1019_ || i_1022_ <= i_1019_; i_1023_ += i_1020_++ + i_1020_)
						i_1022_ += i_1020_ + i_1020_;
					int i_1025_ = 1 + (i - i_1020_);
					if (i_1025_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_1025_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_1026_ = i_1020_ + i;
					if (i_1026_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_1026_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_1027_ = i_1025_ + i_1018_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_1028_ = i_1025_; i_1028_ < i_1026_; i_1028_++)
						((HardwareRenderer) this).anIntArray8979[i_1027_++] = i_1014_;
					i_1018_++;
					i_1022_ -= i_1021_-- + i_1021_;
					i_1023_ -= i_1021_ + i_1021_;
				}
				i_1020_ = i_1013_;
				i_1021_ = i_1018_ - i_1012_;
				i_1023_ = i_1021_ * i_1021_ + i_1019_;
				i_1022_ = i_1023_ - i_1020_;
				i_1023_ -= i_1021_;
				while (i_1018_ < i_1017_) {
					for (/**/; i_1023_ > i_1019_ && i_1022_ > i_1019_; i_1022_ -= i_1020_ + i_1020_)
						i_1023_ -= i_1020_-- + i_1020_;
					int i_1029_ = i - i_1020_;
					if (i_1029_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_1029_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_1030_ = i + i_1020_;
					if (i_1030_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_1030_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_1031_ = i_1029_ + i_1018_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					for (int i_1032_ = i_1029_; i_1032_ <= i_1030_; i_1032_++)
						((HardwareRenderer) this).anIntArray8979[i_1031_++] = i_1014_;
					i_1018_++;
					i_1023_ += i_1021_ + i_1021_;
					i_1022_ += i_1021_++ + i_1021_;
				}
			} else if (1 == i_1015_) {
				i_1014_ = ((i_1024_ * (i_1014_ & 0xff00) >> 8 & 0xff00) + (i_1024_ * (i_1014_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1024_ << 24));
				int i_1033_ = 256 - i_1024_;
				while (i_1018_ < i_1012_) {
					for (/**/; i_1023_ <= i_1019_ || i_1022_ <= i_1019_; i_1023_ += i_1020_++ + i_1020_)
						i_1022_ += i_1020_ + i_1020_;
					int i_1034_ = i - i_1020_ + 1;
					if (i_1034_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_1034_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_1035_ = i + i_1020_;
					if (i_1035_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_1035_ = -1710988237 * ((HardwareRenderer) this).anInt9002;
					int i_1036_ = (i_1034_ + i_1018_ * (444800403 * ((HardwareRenderer) this).anInt8980));
					for (int i_1037_ = i_1034_; i_1037_ < i_1035_; i_1037_++) {
						int i_1038_ = ((HardwareRenderer) this).anIntArray8979[i_1036_];
						i_1038_ = (((i_1038_ & 0xff00) * i_1033_ >> 8 & 0xff00) + ((i_1038_ & 0xff00ff) * i_1033_ >> 8 & 0xff00ff));
						((HardwareRenderer) this).anIntArray8979[i_1036_++] = i_1014_ + i_1038_;
					}
					i_1018_++;
					i_1022_ -= i_1021_-- + i_1021_;
					i_1023_ -= i_1021_ + i_1021_;
				}
				i_1020_ = i_1013_;
				i_1021_ = -i_1021_;
				i_1023_ = i_1019_ + i_1021_ * i_1021_;
				i_1022_ = i_1023_ - i_1020_;
				i_1023_ -= i_1021_;
				while (i_1018_ < i_1017_) {
					for (/**/; i_1023_ > i_1019_ && i_1022_ > i_1019_; i_1022_ -= i_1020_ + i_1020_)
						i_1023_ -= i_1020_-- + i_1020_;
					int i_1039_ = i - i_1020_;
					if (i_1039_ < ((HardwareRenderer) this).anInt8983 * 72550989)
						i_1039_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_1040_ = i_1020_ + i;
					if (i_1040_ > ((HardwareRenderer) this).anInt9002 * -1710988237 - 1)
						i_1040_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_1041_ = i_1039_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1018_);
					for (int i_1042_ = i_1039_; i_1042_ <= i_1040_; i_1042_++) {
						int i_1043_ = ((HardwareRenderer) this).anIntArray8979[i_1041_];
						i_1043_ = ((i_1033_ * (i_1043_ & 0xff00) >> 8 & 0xff00) + (i_1033_ * (i_1043_ & 0xff00ff) >> 8 & 0xff00ff));
						((HardwareRenderer) this).anIntArray8979[i_1041_++] = i_1014_ + i_1043_;
					}
					i_1018_++;
					i_1023_ += i_1021_ + i_1021_;
					i_1022_ += i_1021_++ + i_1021_;
				}
			} else if (i_1015_ == 2) {
				while (i_1018_ < i_1012_) {
					for (/**/; i_1023_ <= i_1019_ || i_1022_ <= i_1019_; i_1023_ += i_1020_++ + i_1020_)
						i_1022_ += i_1020_ + i_1020_;
					int i_1044_ = i - i_1020_ + 1;
					if (i_1044_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_1044_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_1045_ = i_1020_ + i;
					if (i_1045_ > ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_1045_ = ((HardwareRenderer) this).anInt9002 * -1710988237;
					int i_1046_ = i_1044_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1018_);
					for (int i_1047_ = i_1044_; i_1047_ < i_1045_; i_1047_++) {
						int i_1048_ = ((HardwareRenderer) this).anIntArray8979[i_1046_];
						int i_1049_ = i_1014_ + i_1048_;
						int i_1050_ = (i_1014_ & 0xff00ff) + (i_1048_ & 0xff00ff);
						i_1048_ = (i_1050_ & 0x1000100) + (i_1049_ - i_1050_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_1046_++] = i_1049_ - i_1048_ | i_1048_ - (i_1048_ >>> 8);
					}
					i_1018_++;
					i_1022_ -= i_1021_-- + i_1021_;
					i_1023_ -= i_1021_ + i_1021_;
				}
				i_1020_ = i_1013_;
				i_1021_ = -i_1021_;
				i_1023_ = i_1021_ * i_1021_ + i_1019_;
				i_1022_ = i_1023_ - i_1020_;
				i_1023_ -= i_1021_;
				while (i_1018_ < i_1017_) {
					for (/**/; i_1023_ > i_1019_ && i_1022_ > i_1019_; i_1022_ -= i_1020_ + i_1020_)
						i_1023_ -= i_1020_-- + i_1020_;
					int i_1051_ = i - i_1020_;
					if (i_1051_ < 72550989 * ((HardwareRenderer) this).anInt8983)
						i_1051_ = 72550989 * ((HardwareRenderer) this).anInt8983;
					int i_1052_ = i_1020_ + i;
					if (i_1052_ > -1710988237 * ((HardwareRenderer) this).anInt9002 - 1)
						i_1052_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_1053_ = i_1051_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1018_);
					for (int i_1054_ = i_1051_; i_1054_ <= i_1052_; i_1054_++) {
						int i_1055_ = ((HardwareRenderer) this).anIntArray8979[i_1053_];
						int i_1056_ = i_1014_ + i_1055_;
						int i_1057_ = (i_1055_ & 0xff00ff) + (i_1014_ & 0xff00ff);
						i_1055_ = (i_1057_ & 0x1000100) + (i_1056_ - i_1057_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_1053_++] = i_1056_ - i_1055_ | i_1055_ - (i_1055_ >>> 8);
					}
					i_1018_++;
					i_1023_ += i_1021_ + i_1021_;
					i_1022_ += i_1021_++ + i_1021_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method8514(int i, int i_1058_, int i_1059_, int i_1060_) {
		((HardwareRenderer) this).anInt8998 = 1009607649 * i;
		((HardwareRenderer) this).anInt8999 = 117131383 * i_1058_;
		((HardwareRenderer) this).anInt9000 = -1636098283 * i_1059_;
		((HardwareRenderer) this).anInt9001 = i_1060_ * 995917955;
		method14364();
	}

	public void fs(int i, int i_1061_, int i_1062_, int i_1063_, int i_1064_) {
		if (((HardwareRenderer) this).anIntArray8979 != null && (i_1061_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_1061_ < ((HardwareRenderer) this).anInt8986 * 1383960921)) {
			if (i < 72550989 * ((HardwareRenderer) this).anInt8983) {
				i_1062_ -= 72550989 * ((HardwareRenderer) this).anInt8983 - i;
				i = 72550989 * ((HardwareRenderer) this).anInt8983;
			}
			if (i_1062_ + i > -1710988237 * ((HardwareRenderer) this).anInt9002)
				i_1062_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - i;
			int i_1065_ = i_1061_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i;
			int i_1066_ = i_1063_ >>> 24;
			if (0 == i_1064_ || 1 == i_1064_ && i_1066_ == 255) {
				for (int i_1067_ = 0; i_1067_ < i_1062_; i_1067_++)
					((HardwareRenderer) this).anIntArray8979[i_1065_ + i_1067_] = i_1063_;
			} else if (1 == i_1064_) {
				i_1063_ = (((i_1063_ & 0xff00) * i_1066_ >> 8 & 0xff00) + ((i_1063_ & 0xff00ff) * i_1066_ >> 8 & 0xff00ff) + (i_1066_ << 24));
				int i_1068_ = 256 - i_1066_;
				for (int i_1069_ = 0; i_1069_ < i_1062_; i_1069_++) {
					int i_1070_ = (((HardwareRenderer) this).anIntArray8979[i_1069_ + i_1065_]);
					i_1070_ = ((i_1068_ * (i_1070_ & 0xff00) >> 8 & 0xff00) + ((i_1070_ & 0xff00ff) * i_1068_ >> 8 & 0xff00ff));
					((HardwareRenderer) this).anIntArray8979[i_1069_ + i_1065_] = i_1063_ + i_1070_;
				}
			} else if (i_1064_ == 2) {
				for (int i_1071_ = 0; i_1071_ < i_1062_; i_1071_++) {
					int i_1072_ = (((HardwareRenderer) this).anIntArray8979[i_1065_ + i_1071_]);
					int i_1073_ = i_1072_ + i_1063_;
					int i_1074_ = (i_1063_ & 0xff00ff) + (i_1072_ & 0xff00ff);
					i_1072_ = (i_1073_ - i_1074_ & 0x10000) + (i_1074_ & 0x1000100);
					((HardwareRenderer) this).anIntArray8979[i_1071_ + i_1065_] = i_1073_ - i_1072_ | i_1072_ - (i_1072_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method8605() {
		return false;
	}

	public void ej(float f, float f_1075_) {
		((HardwareRenderer) this).aFloat8978 = f_1075_ - f;
		((HardwareRenderer) this).aFloat8985 = f_1075_ + f - 1.0F;
		for (int i = 0; i < ((HardwareRenderer) this).anInt9008 * 656550451; i++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1683 = ((HardwareRenderer) this).aFloat8978;
			((Class144) class144).aFloat1682 = ((HardwareRenderer) this).aFloat8985;
		}
	}

	void method14393(int i, int i_1076_, int i_1077_, int i_1078_, int i_1079_, int i_1080_, int i_1081_, int i_1082_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i_1076_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_1076_ < 1383960921 * ((HardwareRenderer) this).anInt8986)) {
			int i_1083_ = i_1076_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1084_ = i_1078_ >>> 24;
			int i_1085_ = i_1081_ + i_1080_;
			int i_1086_ = i_1082_ % i_1085_;
			if (i_1079_ == 0 || 1 == i_1079_ && 255 == i_1084_) {
				int i_1087_ = 0;
				while (i_1087_ < i_1077_) {
					if ((i_1087_ + i >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1087_ < -1710988237 * ((HardwareRenderer) this).anInt9002) && i_1086_ < i_1080_)
						((HardwareRenderer) this).anIntArray8979[(i_1087_ + i_1083_)] = i_1078_;
					i_1087_++;
					i_1086_ = ++i_1086_ % i_1085_;
				}
			} else if (i_1079_ == 1) {
				i_1078_ = (((i_1078_ & 0xff00ff) * i_1084_ >> 8 & 0xff00ff) + (i_1084_ * (i_1078_ & 0xff00) >> 8 & 0xff00) + (i_1084_ << 24));
				int i_1088_ = 256 - i_1084_;
				int i_1089_ = 0;
				while (i_1089_ < i_1077_) {
					if ((i + i_1089_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1089_ < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1086_ < i_1080_) {
						int i_1090_ = (((HardwareRenderer) this).anIntArray8979[i_1089_ + i_1083_]);
						i_1090_ = (((i_1090_ & 0xff00ff) * i_1088_ >> 8 & 0xff00ff) + (i_1088_ * (i_1090_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[(i_1089_ + i_1083_)] = i_1090_ + i_1078_;
					}
					i_1089_++;
					i_1086_ = ++i_1086_ % i_1085_;
				}
			} else if (i_1079_ == 2) {
				int i_1091_ = 0;
				while (i_1091_ < i_1077_) {
					if ((i + i_1091_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && (i_1091_ + i < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1086_ < i_1080_) {
						int i_1092_ = (((HardwareRenderer) this).anIntArray8979[i_1091_ + i_1083_]);
						int i_1093_ = i_1092_ + i_1078_;
						int i_1094_ = (i_1092_ & 0xff00ff) + (i_1078_ & 0xff00ff);
						i_1092_ = (i_1093_ - i_1094_ & 0x10000) + (i_1094_ & 0x1000100);
						((HardwareRenderer) this).anIntArray8979[(i_1083_ + i_1091_)] = i_1093_ - i_1092_ | i_1092_ - (i_1092_ >>> 8);
					}
					i_1091_++;
					i_1086_ = ++i_1086_ % i_1085_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14394(int i, int i_1095_, int i_1096_, int i_1097_, int i_1098_, int i_1099_, int i_1100_, int i_1101_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i_1095_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_1095_ < 1383960921 * ((HardwareRenderer) this).anInt8986)) {
			int i_1102_ = i_1095_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1103_ = i_1097_ >>> 24;
			int i_1104_ = i_1100_ + i_1099_;
			int i_1105_ = i_1101_ % i_1104_;
			if (i_1098_ == 0 || 1 == i_1098_ && 255 == i_1103_) {
				int i_1106_ = 0;
				while (i_1106_ < i_1096_) {
					if ((i_1106_ + i >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1106_ < -1710988237 * ((HardwareRenderer) this).anInt9002) && i_1105_ < i_1099_)
						((HardwareRenderer) this).anIntArray8979[(i_1106_ + i_1102_)] = i_1097_;
					i_1106_++;
					i_1105_ = ++i_1105_ % i_1104_;
				}
			} else if (i_1098_ == 1) {
				i_1097_ = (((i_1097_ & 0xff00ff) * i_1103_ >> 8 & 0xff00ff) + (i_1103_ * (i_1097_ & 0xff00) >> 8 & 0xff00) + (i_1103_ << 24));
				int i_1107_ = 256 - i_1103_;
				int i_1108_ = 0;
				while (i_1108_ < i_1096_) {
					if ((i + i_1108_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1108_ < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1105_ < i_1099_) {
						int i_1109_ = (((HardwareRenderer) this).anIntArray8979[i_1108_ + i_1102_]);
						i_1109_ = (((i_1109_ & 0xff00ff) * i_1107_ >> 8 & 0xff00ff) + (i_1107_ * (i_1109_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[(i_1108_ + i_1102_)] = i_1109_ + i_1097_;
					}
					i_1108_++;
					i_1105_ = ++i_1105_ % i_1104_;
				}
			} else if (i_1098_ == 2) {
				int i_1110_ = 0;
				while (i_1110_ < i_1096_) {
					if ((i + i_1110_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && (i_1110_ + i < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1105_ < i_1099_) {
						int i_1111_ = (((HardwareRenderer) this).anIntArray8979[i_1110_ + i_1102_]);
						int i_1112_ = i_1111_ + i_1097_;
						int i_1113_ = (i_1111_ & 0xff00ff) + (i_1097_ & 0xff00ff);
						i_1111_ = (i_1112_ - i_1113_ & 0x10000) + (i_1113_ & 0x1000100);
						((HardwareRenderer) this).anIntArray8979[(i_1102_ + i_1110_)] = i_1112_ - i_1111_ | i_1111_ - (i_1111_ >>> 8);
					}
					i_1110_++;
					i_1105_ = ++i_1105_ % i_1104_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14395(int i, int i_1114_, int i_1115_, int i_1116_, int i_1117_, int i_1118_, int i_1119_, int i_1120_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i_1114_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_1114_ < 1383960921 * ((HardwareRenderer) this).anInt8986)) {
			int i_1121_ = i_1114_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1122_ = i_1116_ >>> 24;
			int i_1123_ = i_1119_ + i_1118_;
			int i_1124_ = i_1120_ % i_1123_;
			if (i_1117_ == 0 || 1 == i_1117_ && 255 == i_1122_) {
				int i_1125_ = 0;
				while (i_1125_ < i_1115_) {
					if ((i_1125_ + i >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1125_ < -1710988237 * ((HardwareRenderer) this).anInt9002) && i_1124_ < i_1118_)
						((HardwareRenderer) this).anIntArray8979[(i_1125_ + i_1121_)] = i_1116_;
					i_1125_++;
					i_1124_ = ++i_1124_ % i_1123_;
				}
			} else if (i_1117_ == 1) {
				i_1116_ = (((i_1116_ & 0xff00ff) * i_1122_ >> 8 & 0xff00ff) + (i_1122_ * (i_1116_ & 0xff00) >> 8 & 0xff00) + (i_1122_ << 24));
				int i_1126_ = 256 - i_1122_;
				int i_1127_ = 0;
				while (i_1127_ < i_1115_) {
					if ((i + i_1127_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1127_ < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1124_ < i_1118_) {
						int i_1128_ = (((HardwareRenderer) this).anIntArray8979[i_1127_ + i_1121_]);
						i_1128_ = (((i_1128_ & 0xff00ff) * i_1126_ >> 8 & 0xff00ff) + (i_1126_ * (i_1128_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[(i_1127_ + i_1121_)] = i_1128_ + i_1116_;
					}
					i_1127_++;
					i_1124_ = ++i_1124_ % i_1123_;
				}
			} else if (i_1117_ == 2) {
				int i_1129_ = 0;
				while (i_1129_ < i_1115_) {
					if ((i + i_1129_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && (i_1129_ + i < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1124_ < i_1118_) {
						int i_1130_ = (((HardwareRenderer) this).anIntArray8979[i_1129_ + i_1121_]);
						int i_1131_ = i_1130_ + i_1116_;
						int i_1132_ = (i_1130_ & 0xff00ff) + (i_1116_ & 0xff00ff);
						i_1130_ = (i_1131_ - i_1132_ & 0x10000) + (i_1132_ & 0x1000100);
						((HardwareRenderer) this).anIntArray8979[(i_1121_ + i_1129_)] = i_1131_ - i_1130_ | i_1130_ - (i_1130_ >>> 8);
					}
					i_1129_++;
					i_1124_ = ++i_1124_ % i_1123_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void fo(int i, int i_1133_, int i_1134_, int i_1135_, int i_1136_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < ((HardwareRenderer) this).anInt9002 * -1710988237)) {
			if (i_1133_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
				i_1134_ -= 1516535457 * ((HardwareRenderer) this).anInt9009 - i_1133_;
				i_1133_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
			}
			if (i_1133_ + i_1134_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_1134_ = 1383960921 * ((HardwareRenderer) this).anInt8986 - i_1133_;
			int i_1137_ = i_1133_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1138_ = i_1135_ >>> 24;
			if (0 == i_1136_ || i_1136_ == 1 && 255 == i_1138_) {
				for (int i_1139_ = 0; i_1139_ < i_1134_; i_1139_++)
					((HardwareRenderer) this).anIntArray8979[i_1137_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1139_)] = i_1135_;
			} else if (i_1136_ == 1) {
				i_1135_ = (((i_1135_ & 0xff00ff) * i_1138_ >> 8 & 0xff00ff) + ((i_1135_ & 0xff00) * i_1138_ >> 8 & 0xff00) + (i_1138_ << 24));
				int i_1140_ = 256 - i_1138_;
				for (int i_1141_ = 0; i_1141_ < i_1134_; i_1141_++) {
					int i_1142_ = i_1137_ + i_1141_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					int i_1143_ = ((HardwareRenderer) this).anIntArray8979[i_1142_];
					i_1143_ = (((i_1143_ & 0xff00ff) * i_1140_ >> 8 & 0xff00ff) + ((i_1143_ & 0xff00) * i_1140_ >> 8 & 0xff00));
					((HardwareRenderer) this).anIntArray8979[i_1142_] = i_1135_ + i_1143_;
				}
			} else if (2 == i_1136_) {
				for (int i_1144_ = 0; i_1144_ < i_1134_; i_1144_++) {
					int i_1145_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_1144_) + i_1137_;
					int i_1146_ = ((HardwareRenderer) this).anIntArray8979[i_1145_];
					int i_1147_ = i_1146_ + i_1135_;
					int i_1148_ = (i_1135_ & 0xff00ff) + (i_1146_ & 0xff00ff);
					i_1146_ = (i_1148_ & 0x1000100) + (i_1147_ - i_1148_ & 0x10000);
					((HardwareRenderer) this).anIntArray8979[i_1145_] = i_1147_ - i_1146_ | i_1146_ - (i_1146_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void fl(int i, int i_1149_, int i_1150_, int i_1151_, int i_1152_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < ((HardwareRenderer) this).anInt9002 * -1710988237)) {
			if (i_1149_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
				i_1150_ -= 1516535457 * ((HardwareRenderer) this).anInt9009 - i_1149_;
				i_1149_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
			}
			if (i_1149_ + i_1150_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_1150_ = 1383960921 * ((HardwareRenderer) this).anInt8986 - i_1149_;
			int i_1153_ = i_1149_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1154_ = i_1151_ >>> 24;
			if (0 == i_1152_ || i_1152_ == 1 && 255 == i_1154_) {
				for (int i_1155_ = 0; i_1155_ < i_1150_; i_1155_++)
					((HardwareRenderer) this).anIntArray8979[i_1153_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1155_)] = i_1151_;
			} else if (i_1152_ == 1) {
				i_1151_ = (((i_1151_ & 0xff00ff) * i_1154_ >> 8 & 0xff00ff) + ((i_1151_ & 0xff00) * i_1154_ >> 8 & 0xff00) + (i_1154_ << 24));
				int i_1156_ = 256 - i_1154_;
				for (int i_1157_ = 0; i_1157_ < i_1150_; i_1157_++) {
					int i_1158_ = i_1153_ + i_1157_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					int i_1159_ = ((HardwareRenderer) this).anIntArray8979[i_1158_];
					i_1159_ = (((i_1159_ & 0xff00ff) * i_1156_ >> 8 & 0xff00ff) + ((i_1159_ & 0xff00) * i_1156_ >> 8 & 0xff00));
					((HardwareRenderer) this).anIntArray8979[i_1158_] = i_1151_ + i_1159_;
				}
			} else if (2 == i_1152_) {
				for (int i_1160_ = 0; i_1160_ < i_1150_; i_1160_++) {
					int i_1161_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_1160_) + i_1153_;
					int i_1162_ = ((HardwareRenderer) this).anIntArray8979[i_1161_];
					int i_1163_ = i_1162_ + i_1151_;
					int i_1164_ = (i_1151_ & 0xff00ff) + (i_1162_ & 0xff00ff);
					i_1162_ = (i_1164_ & 0x1000100) + (i_1163_ - i_1164_ & 0x10000);
					((HardwareRenderer) this).anIntArray8979[i_1161_] = i_1163_ - i_1162_ | i_1162_ - (i_1162_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14396(int i, int i_1165_, int i_1166_, int i_1167_, int i_1168_, int i_1169_, int i_1170_, int i_1171_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < -1710988237 * ((HardwareRenderer) this).anInt9002)) {
			int i_1172_ = i + i_1165_ * (((HardwareRenderer) this).anInt8980 * 444800403);
			int i_1173_ = i_1167_ >>> 24;
			int i_1174_ = i_1170_ + i_1169_;
			int i_1175_ = i_1171_ % i_1174_;
			if (0 == i_1168_ || i_1168_ == 1 && i_1173_ == 255) {
				int i_1176_ = 0;
				while (i_1176_ < i_1166_) {
					if ((i_1176_ + i_1165_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_1165_ + i_1176_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1175_ < i_1169_)
						((HardwareRenderer) this).anIntArray8979[(i_1172_ + i_1176_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_1167_;
					i_1176_++;
					i_1175_ = ++i_1175_ % i_1174_;
				}
			} else if (1 == i_1168_) {
				i_1167_ = ((i_1173_ << 24) + ((i_1173_ * (i_1167_ & 0xff00) >> 8 & 0xff00) + (i_1173_ * (i_1167_ & 0xff00ff) >> 8 & 0xff00ff)));
				int i_1177_ = 256 - i_1173_;
				int i_1178_ = 0;
				while (i_1178_ < i_1166_) {
					if ((i_1165_ + i_1178_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_1178_ + i_1165_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1175_ < i_1169_) {
						int i_1179_ = (i_1172_ + i_1178_ * (444800403 * (((HardwareRenderer) this).anInt8980)));
						int i_1180_ = ((HardwareRenderer) this).anIntArray8979[i_1179_];
						i_1180_ = ((i_1177_ * (i_1180_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1177_ * (i_1180_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[i_1179_] = i_1167_ + i_1180_;
					}
					i_1178_++;
					i_1175_ = ++i_1175_ % i_1174_;
				}
			} else if (2 == i_1168_) {
				int i_1181_ = 0;
				while (i_1181_ < i_1166_) {
					if ((i_1181_ + i_1165_ >= ((HardwareRenderer) this).anInt9009 * 1516535457) && (i_1165_ + i_1181_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1175_ < i_1169_) {
						int i_1182_ = (i_1181_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_1172_);
						int i_1183_ = ((HardwareRenderer) this).anIntArray8979[i_1182_];
						int i_1184_ = i_1167_ + i_1183_;
						int i_1185_ = (i_1183_ & 0xff00ff) + (i_1167_ & 0xff00ff);
						i_1183_ = (i_1185_ & 0x1000100) + (i_1184_ - i_1185_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_1182_] = i_1184_ - i_1183_ | i_1183_ - (i_1183_ >>> 8);
					}
					i_1181_++;
					i_1175_ = ++i_1175_ % i_1174_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class455 method8553(int i, int i_1186_, int[] is, int[] is_1187_) {
		return new PacketsDecoder(i, i_1186_, is, is_1187_);
	}

	void method14397(int i, int i_1188_, int i_1189_, int i_1190_, int i_1191_, int i_1192_, int i_1193_, int i_1194_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < -1710988237 * ((HardwareRenderer) this).anInt9002)) {
			int i_1195_ = i + i_1188_ * (((HardwareRenderer) this).anInt8980 * 444800403);
			int i_1196_ = i_1190_ >>> 24;
			int i_1197_ = i_1193_ + i_1192_;
			int i_1198_ = i_1194_ % i_1197_;
			if (0 == i_1191_ || i_1191_ == 1 && i_1196_ == 255) {
				int i_1199_ = 0;
				while (i_1199_ < i_1189_) {
					if ((i_1199_ + i_1188_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_1188_ + i_1199_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1198_ < i_1192_)
						((HardwareRenderer) this).anIntArray8979[(i_1195_ + i_1199_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_1190_;
					i_1199_++;
					i_1198_ = ++i_1198_ % i_1197_;
				}
			} else if (1 == i_1191_) {
				i_1190_ = ((i_1196_ << 24) + ((i_1196_ * (i_1190_ & 0xff00) >> 8 & 0xff00) + (i_1196_ * (i_1190_ & 0xff00ff) >> 8 & 0xff00ff)));
				int i_1200_ = 256 - i_1196_;
				int i_1201_ = 0;
				while (i_1201_ < i_1189_) {
					if ((i_1188_ + i_1201_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_1201_ + i_1188_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1198_ < i_1192_) {
						int i_1202_ = (i_1195_ + i_1201_ * (444800403 * (((HardwareRenderer) this).anInt8980)));
						int i_1203_ = ((HardwareRenderer) this).anIntArray8979[i_1202_];
						i_1203_ = ((i_1200_ * (i_1203_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1200_ * (i_1203_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[i_1202_] = i_1190_ + i_1203_;
					}
					i_1201_++;
					i_1198_ = ++i_1198_ % i_1197_;
				}
			} else if (2 == i_1191_) {
				int i_1204_ = 0;
				while (i_1204_ < i_1189_) {
					if ((i_1204_ + i_1188_ >= ((HardwareRenderer) this).anInt9009 * 1516535457) && (i_1188_ + i_1204_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1198_ < i_1192_) {
						int i_1205_ = (i_1204_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_1195_);
						int i_1206_ = ((HardwareRenderer) this).anIntArray8979[i_1205_];
						int i_1207_ = i_1190_ + i_1206_;
						int i_1208_ = (i_1206_ & 0xff00ff) + (i_1190_ & 0xff00ff);
						i_1206_ = (i_1208_ & 0x1000100) + (i_1207_ - i_1208_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_1205_] = i_1207_ - i_1206_ | i_1206_ - (i_1206_ >>> 8);
					}
					i_1204_++;
					i_1198_ = ++i_1198_ % i_1197_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method8415(int i, int i_1209_, int i_1210_, int i_1211_, int i_1212_, int i_1213_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			i_1210_ -= i;
			i_1211_ -= i_1209_;
			if (i_1211_ == 0) {
				if (i_1210_ >= 0)
					XA(i, i_1209_, 1 + i_1210_, i_1212_, i_1213_);
				else
					XA(i + i_1210_, i_1209_, -i_1210_ + 1, i_1212_, i_1213_);
			} else if (0 == i_1210_) {
				if (i_1211_ >= 0)
					G(i, i_1209_, 1 + i_1211_, i_1212_, i_1213_);
				else
					G(i, i_1209_ + i_1211_, -i_1211_ + 1, i_1212_, i_1213_);
			} else {
				if (i_1210_ + i_1211_ < 0) {
					i += i_1210_;
					i_1210_ = -i_1210_;
					i_1209_ += i_1211_;
					i_1211_ = -i_1211_;
				}
				if (i_1210_ > i_1211_) {
					i_1209_ <<= 16;
					i_1209_ += 32768;
					i_1211_ <<= 16;
					int i_1214_ = (int) Math.floor(0.5 + ((double) i_1211_ / (double) i_1210_));
					i_1210_ += i;
					if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
						i_1209_ += (72550989 * ((HardwareRenderer) this).anInt8983 - i) * i_1214_;
						i = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (i_1210_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_1210_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_1215_ = i_1212_ >>> 24;
					if (i_1213_ == 0 || 1 == i_1213_ && i_1215_ == 255) {
						for (/**/; i <= i_1210_; i++) {
							int i_1216_ = i_1209_ >> 16;
							if (i_1216_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1216_ < (((HardwareRenderer) this).anInt8986 * 1383960921))
								((HardwareRenderer) this).anIntArray8979[i + i_1216_ * (444800403 * (((HardwareRenderer) this).anInt8980))] = i_1212_;
							i_1209_ += i_1214_;
						}
					} else if (i_1213_ == 1) {
						i_1212_ = ((i_1215_ << 24) + (((i_1212_ & 0xff00) * i_1215_ >> 8 & 0xff00) + ((i_1212_ & 0xff00ff) * i_1215_ >> 8 & 0xff00ff)));
						int i_1217_ = 256 - i_1215_;
						for (/**/; i <= i_1210_; i++) {
							int i_1218_ = i_1209_ >> 16;
							if (i_1218_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1218_ < 1383960921 * ((HardwareRenderer) this).anInt8986) {
								int i_1219_ = i + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1218_);
								int i_1220_ = (((HardwareRenderer) this).anIntArray8979[i_1219_]);
								i_1220_ = ((i_1217_ * (i_1220_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1217_ * (i_1220_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1219_] = i_1212_ + i_1220_;
							}
							i_1209_ += i_1214_;
						}
					} else if (i_1213_ == 2) {
						for (/**/; i <= i_1210_; i++) {
							int i_1221_ = i_1209_ >> 16;
							if (i_1221_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1221_ < 1383960921 * ((HardwareRenderer) this).anInt8986) {
								int i_1222_ = i + (i_1221_ * (((HardwareRenderer) this).anInt8980 * 444800403));
								int i_1223_ = (((HardwareRenderer) this).anIntArray8979[i_1222_]);
								int i_1224_ = i_1212_ + i_1223_;
								int i_1225_ = ((i_1223_ & 0xff00ff) + (i_1212_ & 0xff00ff));
								i_1223_ = ((i_1225_ & 0x1000100) + (i_1224_ - i_1225_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1222_] = i_1224_ - i_1223_ | i_1223_ - (i_1223_ >>> 8);
							}
							i_1209_ += i_1214_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1210_ <<= 16;
					int i_1226_ = (int) Math.floor((double) i_1210_ / (double) i_1211_ + 0.5);
					i_1211_ += i_1209_;
					if (i_1209_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
						i += (1516535457 * ((HardwareRenderer) this).anInt9009 - i_1209_) * i_1226_;
						i_1209_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
					}
					if (i_1211_ >= 1383960921 * ((HardwareRenderer) this).anInt8986)
						i_1211_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1);
					int i_1227_ = i_1212_ >>> 24;
					if (i_1213_ == 0 || 1 == i_1213_ && 255 == i_1227_) {
						for (/**/; i_1209_ <= i_1211_; i_1209_++) {
							int i_1228_ = i >> 16;
							if (i_1228_ >= (72550989 * ((HardwareRenderer) this).anInt8983) && i_1228_ < -1710988237 * ((HardwareRenderer) this).anInt9002)
								((HardwareRenderer) this).anIntArray8979[(i_1228_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1209_))] = i_1212_;
							i += i_1226_;
						}
					} else if (1 == i_1213_) {
						i_1212_ = ((i_1227_ * (i_1212_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1212_ & 0xff00) * i_1227_ >> 8 & 0xff00) + (i_1227_ << 24));
						int i_1229_ = 256 - i_1227_;
						for (/**/; i_1209_ <= i_1211_; i_1209_++) {
							int i_1230_ = i >> 16;
							if (i_1230_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1230_ < (((HardwareRenderer) this).anInt9002 * -1710988237)) {
								int i_1231_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * i_1209_) + i_1230_);
								int i_1232_ = (((HardwareRenderer) this).anIntArray8979[i_1231_]);
								i_1232_ = (((i_1232_ & 0xff00ff) * i_1229_ >> 8 & 0xff00ff) + ((i_1232_ & 0xff00) * i_1229_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(((HardwareRenderer) this).anInt8980 * 444800403 * i_1209_) + i_1230_] = i_1212_ + i_1232_;
							}
							i += i_1226_;
						}
					} else if (2 == i_1213_) {
						for (/**/; i_1209_ <= i_1211_; i_1209_++) {
							int i_1233_ = i >> 16;
							if (i_1233_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1233_ < -1710988237 * ((HardwareRenderer) this).anInt9002) {
								int i_1234_ = (i_1233_ + i_1209_ * (444800403 * (((HardwareRenderer) this).anInt8980)));
								int i_1235_ = (((HardwareRenderer) this).anIntArray8979[i_1234_]);
								int i_1236_ = i_1235_ + i_1212_;
								int i_1237_ = ((i_1235_ & 0xff00ff) + (i_1212_ & 0xff00ff));
								i_1235_ = ((i_1236_ - i_1237_ & 0x10000) + (i_1237_ & 0x1000100));
								((HardwareRenderer) this).anIntArray8979[i_1234_] = i_1236_ - i_1235_ | i_1235_ - (i_1235_ >>> 8);
							}
							i += i_1226_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method8526(int i, int i_1238_, int i_1239_, int i_1240_, int i_1241_, int i_1242_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			i_1239_ -= i;
			i_1240_ -= i_1238_;
			if (i_1240_ == 0) {
				if (i_1239_ >= 0)
					XA(i, i_1238_, 1 + i_1239_, i_1241_, i_1242_);
				else
					XA(i + i_1239_, i_1238_, -i_1239_ + 1, i_1241_, i_1242_);
			} else if (0 == i_1239_) {
				if (i_1240_ >= 0)
					G(i, i_1238_, 1 + i_1240_, i_1241_, i_1242_);
				else
					G(i, i_1238_ + i_1240_, -i_1240_ + 1, i_1241_, i_1242_);
			} else {
				if (i_1239_ + i_1240_ < 0) {
					i += i_1239_;
					i_1239_ = -i_1239_;
					i_1238_ += i_1240_;
					i_1240_ = -i_1240_;
				}
				if (i_1239_ > i_1240_) {
					i_1238_ <<= 16;
					i_1238_ += 32768;
					i_1240_ <<= 16;
					int i_1243_ = (int) Math.floor(0.5 + ((double) i_1240_ / (double) i_1239_));
					i_1239_ += i;
					if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
						i_1238_ += (72550989 * ((HardwareRenderer) this).anInt8983 - i) * i_1243_;
						i = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (i_1239_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
						i_1239_ = (((HardwareRenderer) this).anInt9002 * -1710988237 - 1);
					int i_1244_ = i_1241_ >>> 24;
					if (i_1242_ == 0 || 1 == i_1242_ && i_1244_ == 255) {
						for (/**/; i <= i_1239_; i++) {
							int i_1245_ = i_1238_ >> 16;
							if (i_1245_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1245_ < (((HardwareRenderer) this).anInt8986 * 1383960921))
								((HardwareRenderer) this).anIntArray8979[i + i_1245_ * (444800403 * (((HardwareRenderer) this).anInt8980))] = i_1241_;
							i_1238_ += i_1243_;
						}
					} else if (i_1242_ == 1) {
						i_1241_ = ((i_1244_ << 24) + (((i_1241_ & 0xff00) * i_1244_ >> 8 & 0xff00) + ((i_1241_ & 0xff00ff) * i_1244_ >> 8 & 0xff00ff)));
						int i_1246_ = 256 - i_1244_;
						for (/**/; i <= i_1239_; i++) {
							int i_1247_ = i_1238_ >> 16;
							if (i_1247_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1247_ < 1383960921 * ((HardwareRenderer) this).anInt8986) {
								int i_1248_ = i + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1247_);
								int i_1249_ = (((HardwareRenderer) this).anIntArray8979[i_1248_]);
								i_1249_ = ((i_1246_ * (i_1249_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1246_ * (i_1249_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1248_] = i_1241_ + i_1249_;
							}
							i_1238_ += i_1243_;
						}
					} else if (i_1242_ == 2) {
						for (/**/; i <= i_1239_; i++) {
							int i_1250_ = i_1238_ >> 16;
							if (i_1250_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1250_ < 1383960921 * ((HardwareRenderer) this).anInt8986) {
								int i_1251_ = i + (i_1250_ * (((HardwareRenderer) this).anInt8980 * 444800403));
								int i_1252_ = (((HardwareRenderer) this).anIntArray8979[i_1251_]);
								int i_1253_ = i_1241_ + i_1252_;
								int i_1254_ = ((i_1252_ & 0xff00ff) + (i_1241_ & 0xff00ff));
								i_1252_ = ((i_1254_ & 0x1000100) + (i_1253_ - i_1254_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1251_] = i_1253_ - i_1252_ | i_1252_ - (i_1252_ >>> 8);
							}
							i_1238_ += i_1243_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1239_ <<= 16;
					int i_1255_ = (int) Math.floor((double) i_1239_ / (double) i_1240_ + 0.5);
					i_1240_ += i_1238_;
					if (i_1238_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
						i += (1516535457 * ((HardwareRenderer) this).anInt9009 - i_1238_) * i_1255_;
						i_1238_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
					}
					if (i_1240_ >= 1383960921 * ((HardwareRenderer) this).anInt8986)
						i_1240_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1);
					int i_1256_ = i_1241_ >>> 24;
					if (i_1242_ == 0 || 1 == i_1242_ && 255 == i_1256_) {
						for (/**/; i_1238_ <= i_1240_; i_1238_++) {
							int i_1257_ = i >> 16;
							if (i_1257_ >= (72550989 * ((HardwareRenderer) this).anInt8983) && i_1257_ < -1710988237 * ((HardwareRenderer) this).anInt9002)
								((HardwareRenderer) this).anIntArray8979[(i_1257_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1238_))] = i_1241_;
							i += i_1255_;
						}
					} else if (1 == i_1242_) {
						i_1241_ = ((i_1256_ * (i_1241_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1241_ & 0xff00) * i_1256_ >> 8 & 0xff00) + (i_1256_ << 24));
						int i_1258_ = 256 - i_1256_;
						for (/**/; i_1238_ <= i_1240_; i_1238_++) {
							int i_1259_ = i >> 16;
							if (i_1259_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1259_ < (((HardwareRenderer) this).anInt9002 * -1710988237)) {
								int i_1260_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * i_1238_) + i_1259_);
								int i_1261_ = (((HardwareRenderer) this).anIntArray8979[i_1260_]);
								i_1261_ = (((i_1261_ & 0xff00ff) * i_1258_ >> 8 & 0xff00ff) + ((i_1261_ & 0xff00) * i_1258_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(((HardwareRenderer) this).anInt8980 * 444800403 * i_1238_) + i_1259_] = i_1241_ + i_1261_;
							}
							i += i_1255_;
						}
					} else if (2 == i_1242_) {
						for (/**/; i_1238_ <= i_1240_; i_1238_++) {
							int i_1262_ = i >> 16;
							if (i_1262_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1262_ < -1710988237 * ((HardwareRenderer) this).anInt9002) {
								int i_1263_ = (i_1262_ + i_1238_ * (444800403 * (((HardwareRenderer) this).anInt8980)));
								int i_1264_ = (((HardwareRenderer) this).anIntArray8979[i_1263_]);
								int i_1265_ = i_1264_ + i_1241_;
								int i_1266_ = ((i_1264_ & 0xff00ff) + (i_1241_ & 0xff00ff));
								i_1264_ = ((i_1265_ - i_1266_ & 0x10000) + (i_1266_ & 0x1000100));
								((HardwareRenderer) this).anIntArray8979[i_1263_] = i_1265_ - i_1264_ | i_1264_ - (i_1264_ >>> 8);
							}
							i += i_1255_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class384 method8588() {
		return new Class384(((HardwareRenderer) this).aClass384_8995);
	}

	public void method8494(int i, int i_1267_, int i_1268_, int i_1269_, int i_1270_, int i_1271_, int i_1272_, int i_1273_, int i_1274_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			i_1268_ -= i;
			i_1269_ -= i_1267_;
			if (i_1269_ == 0) {
				if (i_1268_ >= 0)
					method14366(i, i_1267_, 1 + i_1268_, i_1270_, i_1271_, i_1272_, i_1273_, i_1274_);
				else {
					int i_1275_ = i_1272_ + i_1273_;
					i_1274_ %= i_1275_;
					i_1274_ = (i_1275_ + i_1272_ - i_1274_ - (1 + -i_1268_) % i_1275_);
					i_1274_ %= i_1275_;
					if (i_1274_ < 0)
						i_1274_ += i_1275_;
					method14366(i + i_1268_, i_1267_, -i_1268_ + 1, i_1270_, i_1271_, i_1272_, i_1273_, i_1274_);
				}
			} else if (0 == i_1268_) {
				if (i_1269_ >= 0)
					method14399(i, i_1267_, 1 + i_1269_, i_1270_, i_1271_, i_1272_, i_1273_, i_1274_);
				else {
					int i_1276_ = i_1273_ + i_1272_;
					i_1274_ %= i_1276_;
					i_1274_ = (i_1272_ + i_1276_ - i_1274_ - (-i_1269_ + 1) % i_1276_);
					i_1274_ %= i_1276_;
					if (i_1274_ < 0)
						i_1274_ += i_1276_;
					method14399(i, i_1267_ + i_1269_, 1 + -i_1269_, i_1270_, i_1271_, i_1272_, i_1273_, i_1274_);
				}
			} else {
				i_1274_ <<= 8;
				i_1272_ <<= 8;
				i_1273_ <<= 8;
				int i_1277_ = i_1273_ + i_1272_;
				i_1274_ %= i_1277_;
				if (i_1268_ + i_1269_ < 0) {
					int i_1278_ = (int) (Math.sqrt((double) (i_1268_ * i_1268_ + i_1269_ * i_1269_)) * 256.0);
					int i_1279_ = i_1278_ % i_1277_;
					i_1274_ = i_1272_ + i_1277_ - i_1274_ - i_1279_;
					i_1274_ %= i_1277_;
					if (i_1274_ < 0)
						i_1274_ += i_1277_;
					i += i_1268_;
					i_1268_ = -i_1268_;
					i_1267_ += i_1269_;
					i_1269_ = -i_1269_;
				}
				if (i_1268_ > i_1269_) {
					i_1267_ <<= 16;
					i_1267_ += 32768;
					i_1269_ <<= 16;
					int i_1280_ = (int) Math.floor((double) i_1269_ / (double) i_1268_ + 0.5);
					i_1268_ += i;
					int i_1281_ = i_1270_ >>> 24;
					int i_1282_ = (int) Math.sqrt((double) ((i_1280_ >> 8) * (i_1280_ >> 8) + 65536));
					if (i_1271_ == 0 || 1 == i_1271_ && i_1281_ == 255) {
						while (i <= i_1268_) {
							int i_1283_ = i_1267_ >> 16;
							if (i >= (72550989 * ((HardwareRenderer) this).anInt8983) && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1283_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1283_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1274_ < i_1272_)
								((HardwareRenderer) this).anIntArray8979[i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1283_)] = i_1270_;
							i_1267_ += i_1280_;
							i++;
							i_1274_ += i_1282_;
							i_1274_ %= i_1277_;
						}
					} else if (1 == i_1271_) {
						i_1270_ = ((i_1281_ << 24) + (((i_1270_ & 0xff00) * i_1281_ >> 8 & 0xff00) + (i_1281_ * (i_1270_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1284_ = 256 - i_1281_;
						while (i <= i_1268_) {
							int i_1285_ = i_1267_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1285_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1285_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1274_ < i_1272_) {
								int i_1286_ = ((i_1285_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1287_ = (((HardwareRenderer) this).anIntArray8979[i_1286_]);
								i_1287_ = (((i_1287_ & 0xff00ff) * i_1284_ >> 8 & 0xff00ff) + (i_1284_ * (i_1287_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1286_] = i_1287_ + i_1270_;
							}
							i_1267_ += i_1280_;
							i++;
							i_1274_ += i_1282_;
							i_1274_ %= i_1277_;
						}
					} else if (i_1271_ == 2) {
						while (i <= i_1268_) {
							int i_1288_ = i_1267_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1288_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1288_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1274_ < i_1272_) {
								int i_1289_ = i + i_1288_ * (444800403 * (((HardwareRenderer) this).anInt8980));
								int i_1290_ = (((HardwareRenderer) this).anIntArray8979[i_1289_]);
								int i_1291_ = i_1290_ + i_1270_;
								int i_1292_ = ((i_1290_ & 0xff00ff) + (i_1270_ & 0xff00ff));
								i_1290_ = ((i_1292_ & 0x1000100) + (i_1291_ - i_1292_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1289_] = i_1291_ - i_1290_ | i_1290_ - (i_1290_ >>> 8);
							}
							i_1267_ += i_1280_;
							i++;
							i_1274_ += i_1282_;
							i_1274_ %= i_1277_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1268_ <<= 16;
					int i_1293_ = (int) Math.floor((double) i_1268_ / (double) i_1269_ + 0.5);
					i_1269_ += i_1267_;
					int i_1294_ = i_1270_ >>> 24;
					int i_1295_ = (int) Math.sqrt((double) ((i_1293_ >> 8) * (i_1293_ >> 8) + 65536));
					if (0 == i_1271_ || 1 == i_1271_ && i_1294_ == 255) {
						while (i_1267_ <= i_1269_) {
							int i_1296_ = i >> 16;
							if (i_1267_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1267_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1296_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1296_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1274_ < i_1272_)
								((HardwareRenderer) this).anIntArray8979[i_1296_ + i_1267_ * (((HardwareRenderer) this).anInt8980 * 444800403)] = i_1270_;
							i += i_1293_;
							i_1267_++;
							i_1274_ += i_1295_;
							i_1274_ %= i_1277_;
						}
					} else if (i_1271_ == 1) {
						i_1270_ = ((i_1294_ << 24) + (((i_1270_ & 0xff00ff) * i_1294_ >> 8 & 0xff00ff) + ((i_1270_ & 0xff00) * i_1294_ >> 8 & 0xff00)));
						int i_1297_ = 256 - i_1294_;
						while (i_1267_ <= i_1269_) {
							int i_1298_ = i >> 16;
							if (i_1267_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1267_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1298_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1298_ < -1710988237 * ((HardwareRenderer) this).anInt9002 && i_1274_ < i_1272_) {
								int i_1299_ = ((i_1267_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1298_);
								int i_1300_ = (((HardwareRenderer) this).anIntArray8979[i_1299_]);
								i_1300_ = ((i_1297_ * (i_1300_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1300_ & 0xff00) * i_1297_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(i_1298_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1267_))] = i_1300_ + i_1270_;
							}
							i += i_1293_;
							i_1267_++;
							i_1274_ += i_1295_;
							i_1274_ %= i_1277_;
						}
					} else if (2 == i_1271_) {
						while (i_1267_ <= i_1269_) {
							int i_1301_ = i >> 16;
							if (i_1267_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1267_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1301_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1301_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1274_ < i_1272_) {
								int i_1302_ = ((i_1267_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1301_);
								int i_1303_ = (((HardwareRenderer) this).anIntArray8979[i_1302_]);
								int i_1304_ = i_1303_ + i_1270_;
								int i_1305_ = ((i_1270_ & 0xff00ff) + (i_1303_ & 0xff00ff));
								i_1303_ = ((i_1305_ & 0x1000100) + (i_1304_ - i_1305_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1302_] = i_1304_ - i_1303_ | i_1303_ - (i_1303_ >>> 8);
							}
							i += i_1293_;
							i_1267_++;
							i_1274_ += i_1295_;
							i_1274_ %= i_1277_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method8529(int i, int i_1306_, int i_1307_, int i_1308_, int i_1309_, int i_1310_, int i_1311_, int i_1312_, int i_1313_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			i_1307_ -= i;
			i_1308_ -= i_1306_;
			if (i_1308_ == 0) {
				if (i_1307_ >= 0)
					method14366(i, i_1306_, 1 + i_1307_, i_1309_, i_1310_, i_1311_, i_1312_, i_1313_);
				else {
					int i_1314_ = i_1311_ + i_1312_;
					i_1313_ %= i_1314_;
					i_1313_ = (i_1314_ + i_1311_ - i_1313_ - (1 + -i_1307_) % i_1314_);
					i_1313_ %= i_1314_;
					if (i_1313_ < 0)
						i_1313_ += i_1314_;
					method14366(i + i_1307_, i_1306_, -i_1307_ + 1, i_1309_, i_1310_, i_1311_, i_1312_, i_1313_);
				}
			} else if (0 == i_1307_) {
				if (i_1308_ >= 0)
					method14399(i, i_1306_, 1 + i_1308_, i_1309_, i_1310_, i_1311_, i_1312_, i_1313_);
				else {
					int i_1315_ = i_1312_ + i_1311_;
					i_1313_ %= i_1315_;
					i_1313_ = (i_1311_ + i_1315_ - i_1313_ - (-i_1308_ + 1) % i_1315_);
					i_1313_ %= i_1315_;
					if (i_1313_ < 0)
						i_1313_ += i_1315_;
					method14399(i, i_1306_ + i_1308_, 1 + -i_1308_, i_1309_, i_1310_, i_1311_, i_1312_, i_1313_);
				}
			} else {
				i_1313_ <<= 8;
				i_1311_ <<= 8;
				i_1312_ <<= 8;
				int i_1316_ = i_1312_ + i_1311_;
				i_1313_ %= i_1316_;
				if (i_1307_ + i_1308_ < 0) {
					int i_1317_ = (int) (Math.sqrt((double) (i_1307_ * i_1307_ + i_1308_ * i_1308_)) * 256.0);
					int i_1318_ = i_1317_ % i_1316_;
					i_1313_ = i_1311_ + i_1316_ - i_1313_ - i_1318_;
					i_1313_ %= i_1316_;
					if (i_1313_ < 0)
						i_1313_ += i_1316_;
					i += i_1307_;
					i_1307_ = -i_1307_;
					i_1306_ += i_1308_;
					i_1308_ = -i_1308_;
				}
				if (i_1307_ > i_1308_) {
					i_1306_ <<= 16;
					i_1306_ += 32768;
					i_1308_ <<= 16;
					int i_1319_ = (int) Math.floor((double) i_1308_ / (double) i_1307_ + 0.5);
					i_1307_ += i;
					int i_1320_ = i_1309_ >>> 24;
					int i_1321_ = (int) Math.sqrt((double) ((i_1319_ >> 8) * (i_1319_ >> 8) + 65536));
					if (i_1310_ == 0 || 1 == i_1310_ && i_1320_ == 255) {
						while (i <= i_1307_) {
							int i_1322_ = i_1306_ >> 16;
							if (i >= (72550989 * ((HardwareRenderer) this).anInt8983) && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1322_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1322_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1313_ < i_1311_)
								((HardwareRenderer) this).anIntArray8979[i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1322_)] = i_1309_;
							i_1306_ += i_1319_;
							i++;
							i_1313_ += i_1321_;
							i_1313_ %= i_1316_;
						}
					} else if (1 == i_1310_) {
						i_1309_ = ((i_1320_ << 24) + (((i_1309_ & 0xff00) * i_1320_ >> 8 & 0xff00) + (i_1320_ * (i_1309_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1323_ = 256 - i_1320_;
						while (i <= i_1307_) {
							int i_1324_ = i_1306_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1324_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1324_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1313_ < i_1311_) {
								int i_1325_ = ((i_1324_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1326_ = (((HardwareRenderer) this).anIntArray8979[i_1325_]);
								i_1326_ = (((i_1326_ & 0xff00ff) * i_1323_ >> 8 & 0xff00ff) + (i_1323_ * (i_1326_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1325_] = i_1326_ + i_1309_;
							}
							i_1306_ += i_1319_;
							i++;
							i_1313_ += i_1321_;
							i_1313_ %= i_1316_;
						}
					} else if (i_1310_ == 2) {
						while (i <= i_1307_) {
							int i_1327_ = i_1306_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1327_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1327_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1313_ < i_1311_) {
								int i_1328_ = i + i_1327_ * (444800403 * (((HardwareRenderer) this).anInt8980));
								int i_1329_ = (((HardwareRenderer) this).anIntArray8979[i_1328_]);
								int i_1330_ = i_1329_ + i_1309_;
								int i_1331_ = ((i_1329_ & 0xff00ff) + (i_1309_ & 0xff00ff));
								i_1329_ = ((i_1331_ & 0x1000100) + (i_1330_ - i_1331_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1328_] = i_1330_ - i_1329_ | i_1329_ - (i_1329_ >>> 8);
							}
							i_1306_ += i_1319_;
							i++;
							i_1313_ += i_1321_;
							i_1313_ %= i_1316_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1307_ <<= 16;
					int i_1332_ = (int) Math.floor((double) i_1307_ / (double) i_1308_ + 0.5);
					i_1308_ += i_1306_;
					int i_1333_ = i_1309_ >>> 24;
					int i_1334_ = (int) Math.sqrt((double) ((i_1332_ >> 8) * (i_1332_ >> 8) + 65536));
					if (0 == i_1310_ || 1 == i_1310_ && i_1333_ == 255) {
						while (i_1306_ <= i_1308_) {
							int i_1335_ = i >> 16;
							if (i_1306_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1306_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1335_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1335_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1313_ < i_1311_)
								((HardwareRenderer) this).anIntArray8979[i_1335_ + i_1306_ * (((HardwareRenderer) this).anInt8980 * 444800403)] = i_1309_;
							i += i_1332_;
							i_1306_++;
							i_1313_ += i_1334_;
							i_1313_ %= i_1316_;
						}
					} else if (i_1310_ == 1) {
						i_1309_ = ((i_1333_ << 24) + (((i_1309_ & 0xff00ff) * i_1333_ >> 8 & 0xff00ff) + ((i_1309_ & 0xff00) * i_1333_ >> 8 & 0xff00)));
						int i_1336_ = 256 - i_1333_;
						while (i_1306_ <= i_1308_) {
							int i_1337_ = i >> 16;
							if (i_1306_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1306_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1337_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1337_ < -1710988237 * ((HardwareRenderer) this).anInt9002 && i_1313_ < i_1311_) {
								int i_1338_ = ((i_1306_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1337_);
								int i_1339_ = (((HardwareRenderer) this).anIntArray8979[i_1338_]);
								i_1339_ = ((i_1336_ * (i_1339_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1339_ & 0xff00) * i_1336_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(i_1337_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1306_))] = i_1339_ + i_1309_;
							}
							i += i_1332_;
							i_1306_++;
							i_1313_ += i_1334_;
							i_1313_ %= i_1316_;
						}
					} else if (2 == i_1310_) {
						while (i_1306_ <= i_1308_) {
							int i_1340_ = i >> 16;
							if (i_1306_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1306_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1340_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1340_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1313_ < i_1311_) {
								int i_1341_ = ((i_1306_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1340_);
								int i_1342_ = (((HardwareRenderer) this).anIntArray8979[i_1341_]);
								int i_1343_ = i_1342_ + i_1309_;
								int i_1344_ = ((i_1309_ & 0xff00ff) + (i_1342_ & 0xff00ff));
								i_1342_ = ((i_1344_ & 0x1000100) + (i_1343_ - i_1344_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1341_] = i_1343_ - i_1342_ | i_1342_ - (i_1342_ >>> 8);
							}
							i += i_1332_;
							i_1306_++;
							i_1313_ += i_1334_;
							i_1313_ %= i_1316_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method8530(int i, int i_1345_, int i_1346_, int i_1347_, int i_1348_, int i_1349_, int i_1350_, int i_1351_, int i_1352_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			i_1346_ -= i;
			i_1347_ -= i_1345_;
			if (i_1347_ == 0) {
				if (i_1346_ >= 0)
					method14366(i, i_1345_, 1 + i_1346_, i_1348_, i_1349_, i_1350_, i_1351_, i_1352_);
				else {
					int i_1353_ = i_1350_ + i_1351_;
					i_1352_ %= i_1353_;
					i_1352_ = (i_1353_ + i_1350_ - i_1352_ - (1 + -i_1346_) % i_1353_);
					i_1352_ %= i_1353_;
					if (i_1352_ < 0)
						i_1352_ += i_1353_;
					method14366(i + i_1346_, i_1345_, -i_1346_ + 1, i_1348_, i_1349_, i_1350_, i_1351_, i_1352_);
				}
			} else if (0 == i_1346_) {
				if (i_1347_ >= 0)
					method14399(i, i_1345_, 1 + i_1347_, i_1348_, i_1349_, i_1350_, i_1351_, i_1352_);
				else {
					int i_1354_ = i_1351_ + i_1350_;
					i_1352_ %= i_1354_;
					i_1352_ = (i_1350_ + i_1354_ - i_1352_ - (-i_1347_ + 1) % i_1354_);
					i_1352_ %= i_1354_;
					if (i_1352_ < 0)
						i_1352_ += i_1354_;
					method14399(i, i_1345_ + i_1347_, 1 + -i_1347_, i_1348_, i_1349_, i_1350_, i_1351_, i_1352_);
				}
			} else {
				i_1352_ <<= 8;
				i_1350_ <<= 8;
				i_1351_ <<= 8;
				int i_1355_ = i_1351_ + i_1350_;
				i_1352_ %= i_1355_;
				if (i_1346_ + i_1347_ < 0) {
					int i_1356_ = (int) (Math.sqrt((double) (i_1346_ * i_1346_ + i_1347_ * i_1347_)) * 256.0);
					int i_1357_ = i_1356_ % i_1355_;
					i_1352_ = i_1350_ + i_1355_ - i_1352_ - i_1357_;
					i_1352_ %= i_1355_;
					if (i_1352_ < 0)
						i_1352_ += i_1355_;
					i += i_1346_;
					i_1346_ = -i_1346_;
					i_1345_ += i_1347_;
					i_1347_ = -i_1347_;
				}
				if (i_1346_ > i_1347_) {
					i_1345_ <<= 16;
					i_1345_ += 32768;
					i_1347_ <<= 16;
					int i_1358_ = (int) Math.floor((double) i_1347_ / (double) i_1346_ + 0.5);
					i_1346_ += i;
					int i_1359_ = i_1348_ >>> 24;
					int i_1360_ = (int) Math.sqrt((double) ((i_1358_ >> 8) * (i_1358_ >> 8) + 65536));
					if (i_1349_ == 0 || 1 == i_1349_ && i_1359_ == 255) {
						while (i <= i_1346_) {
							int i_1361_ = i_1345_ >> 16;
							if (i >= (72550989 * ((HardwareRenderer) this).anInt8983) && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1361_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1361_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1352_ < i_1350_)
								((HardwareRenderer) this).anIntArray8979[i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1361_)] = i_1348_;
							i_1345_ += i_1358_;
							i++;
							i_1352_ += i_1360_;
							i_1352_ %= i_1355_;
						}
					} else if (1 == i_1349_) {
						i_1348_ = ((i_1359_ << 24) + (((i_1348_ & 0xff00) * i_1359_ >> 8 & 0xff00) + (i_1359_ * (i_1348_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1362_ = 256 - i_1359_;
						while (i <= i_1346_) {
							int i_1363_ = i_1345_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1363_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1363_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1352_ < i_1350_) {
								int i_1364_ = ((i_1363_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1365_ = (((HardwareRenderer) this).anIntArray8979[i_1364_]);
								i_1365_ = (((i_1365_ & 0xff00ff) * i_1362_ >> 8 & 0xff00ff) + (i_1362_ * (i_1365_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1364_] = i_1365_ + i_1348_;
							}
							i_1345_ += i_1358_;
							i++;
							i_1352_ += i_1360_;
							i_1352_ %= i_1355_;
						}
					} else if (i_1349_ == 2) {
						while (i <= i_1346_) {
							int i_1366_ = i_1345_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1366_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1366_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1352_ < i_1350_) {
								int i_1367_ = i + i_1366_ * (444800403 * (((HardwareRenderer) this).anInt8980));
								int i_1368_ = (((HardwareRenderer) this).anIntArray8979[i_1367_]);
								int i_1369_ = i_1368_ + i_1348_;
								int i_1370_ = ((i_1368_ & 0xff00ff) + (i_1348_ & 0xff00ff));
								i_1368_ = ((i_1370_ & 0x1000100) + (i_1369_ - i_1370_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1367_] = i_1369_ - i_1368_ | i_1368_ - (i_1368_ >>> 8);
							}
							i_1345_ += i_1358_;
							i++;
							i_1352_ += i_1360_;
							i_1352_ %= i_1355_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1346_ <<= 16;
					int i_1371_ = (int) Math.floor((double) i_1346_ / (double) i_1347_ + 0.5);
					i_1347_ += i_1345_;
					int i_1372_ = i_1348_ >>> 24;
					int i_1373_ = (int) Math.sqrt((double) ((i_1371_ >> 8) * (i_1371_ >> 8) + 65536));
					if (0 == i_1349_ || 1 == i_1349_ && i_1372_ == 255) {
						while (i_1345_ <= i_1347_) {
							int i_1374_ = i >> 16;
							if (i_1345_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1345_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1374_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1374_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1352_ < i_1350_)
								((HardwareRenderer) this).anIntArray8979[i_1374_ + i_1345_ * (((HardwareRenderer) this).anInt8980 * 444800403)] = i_1348_;
							i += i_1371_;
							i_1345_++;
							i_1352_ += i_1373_;
							i_1352_ %= i_1355_;
						}
					} else if (i_1349_ == 1) {
						i_1348_ = ((i_1372_ << 24) + (((i_1348_ & 0xff00ff) * i_1372_ >> 8 & 0xff00ff) + ((i_1348_ & 0xff00) * i_1372_ >> 8 & 0xff00)));
						int i_1375_ = 256 - i_1372_;
						while (i_1345_ <= i_1347_) {
							int i_1376_ = i >> 16;
							if (i_1345_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1345_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1376_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1376_ < -1710988237 * ((HardwareRenderer) this).anInt9002 && i_1352_ < i_1350_) {
								int i_1377_ = ((i_1345_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1376_);
								int i_1378_ = (((HardwareRenderer) this).anIntArray8979[i_1377_]);
								i_1378_ = ((i_1375_ * (i_1378_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1378_ & 0xff00) * i_1375_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(i_1376_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1345_))] = i_1378_ + i_1348_;
							}
							i += i_1371_;
							i_1345_++;
							i_1352_ += i_1373_;
							i_1352_ %= i_1355_;
						}
					} else if (2 == i_1349_) {
						while (i_1345_ <= i_1347_) {
							int i_1379_ = i >> 16;
							if (i_1345_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1345_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1379_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1379_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1352_ < i_1350_) {
								int i_1380_ = ((i_1345_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1379_);
								int i_1381_ = (((HardwareRenderer) this).anIntArray8979[i_1380_]);
								int i_1382_ = i_1381_ + i_1348_;
								int i_1383_ = ((i_1348_ & 0xff00ff) + (i_1381_ & 0xff00ff));
								i_1381_ = ((i_1383_ & 0x1000100) + (i_1382_ - i_1383_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1380_] = i_1382_ - i_1381_ | i_1381_ - (i_1381_ >>> 8);
							}
							i += i_1371_;
							i_1345_++;
							i_1352_ += i_1373_;
							i_1352_ %= i_1355_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method8576(int i, int i_1384_, int i_1385_, int i_1386_, int i_1387_, int i_1388_, Class455 class455, int i_1389_, int i_1390_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_1391_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_1392_ = (1516535457 * ((HardwareRenderer) this).anInt9009 > i_1390_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_1390_);
			int i_1393_ = ((1383960921 * ((HardwareRenderer) this).anInt8986 < i_1390_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : is.length + i_1390_);
			i_1385_ -= i;
			i_1386_ -= i_1384_;
			if (i_1386_ + i_1385_ < 0) {
				i += i_1385_;
				i_1385_ = -i_1385_;
				i_1384_ += i_1386_;
				i_1386_ = -i_1386_;
			}
			if (i_1385_ > i_1386_) {
				i_1384_ <<= 16;
				i_1384_ += 32768;
				i_1386_ <<= 16;
				int i_1394_ = (int) Math.floor((double) i_1386_ / (double) i_1385_ + 0.5);
				i_1385_ += i;
				if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
					i_1384_ += (((HardwareRenderer) this).anInt8983 * 72550989 - i) * i_1394_;
					i = ((HardwareRenderer) this).anInt8983 * 72550989;
				}
				if (i_1385_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
					i_1385_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - 1;
				int i_1395_ = i_1387_ >>> 24;
				if (0 == i_1388_ || 1 == i_1388_ && i_1395_ == 255) {
					for (/**/; i <= i_1385_; i++) {
						int i_1396_ = i_1384_ >> 16;
						int i_1397_ = i_1396_ - i_1390_;
						if (i_1396_ >= i_1392_ && i_1396_ < i_1393_) {
							int i_1398_ = is[i_1397_] + i_1389_;
							if (i >= i_1398_ && i < is_1391_[i_1397_] + i_1398_)
								((HardwareRenderer) this).anIntArray8979[i_1396_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_1387_;
						}
						i_1384_ += i_1394_;
					}
				} else if (1 == i_1388_) {
					i_1387_ = ((i_1395_ * (i_1387_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1387_ & 0xff00) * i_1395_ >> 8 & 0xff00) + (i_1395_ << 24));
					int i_1399_ = 256 - i_1395_;
					for (/**/; i <= i_1385_; i++) {
						int i_1400_ = i_1384_ >> 16;
						int i_1401_ = i_1400_ - i_1390_;
						if (i_1400_ >= i_1392_ && i_1400_ < i_1393_) {
							int i_1402_ = is[i_1401_] + i_1389_;
							if (i >= i_1402_ && i < i_1402_ + is_1391_[i_1401_]) {
								int i_1403_ = i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1400_);
								int i_1404_ = (((HardwareRenderer) this).anIntArray8979[i_1403_]);
								i_1404_ = ((i_1399_ * (i_1404_ & 0xff00) >> 8 & 0xff00) + (i_1399_ * (i_1404_ & 0xff00ff) >> 8 & 0xff00ff));
								((HardwareRenderer) this).anIntArray8979[i_1403_] = i_1387_ + i_1404_;
							}
						}
						i_1384_ += i_1394_;
					}
				} else if (i_1388_ == 2) {
					for (/**/; i <= i_1385_; i++) {
						int i_1405_ = i_1384_ >> 16;
						int i_1406_ = i_1405_ - i_1390_;
						if (i_1405_ >= i_1392_ && i_1405_ < i_1393_) {
							int i_1407_ = i_1389_ + is[i_1406_];
							if (i >= i_1407_ && i < is_1391_[i_1406_] + i_1407_) {
								int i_1408_ = ((i_1405_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1409_ = (((HardwareRenderer) this).anIntArray8979[i_1408_]);
								int i_1410_ = i_1409_ + i_1387_;
								int i_1411_ = ((i_1387_ & 0xff00ff) + (i_1409_ & 0xff00ff));
								i_1409_ = ((i_1411_ & 0x1000100) + (i_1410_ - i_1411_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1408_] = i_1410_ - i_1409_ | i_1409_ - (i_1409_ >>> 8);
							}
						}
						i_1384_ += i_1394_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1385_ <<= 16;
				int i_1412_ = (int) Math.floor(0.5 + ((double) i_1385_ / (double) i_1386_));
				i_1386_ += i_1384_;
				if (i_1384_ < i_1392_) {
					i += (i_1392_ - i_1384_) * i_1412_;
					i_1384_ = i_1392_;
				}
				if (i_1386_ >= i_1393_)
					i_1386_ = i_1393_ - 1;
				int i_1413_ = i_1387_ >>> 24;
				if (0 == i_1388_ || i_1388_ == 1 && i_1413_ == 255) {
					for (/**/; i_1384_ <= i_1386_; i_1384_++) {
						int i_1414_ = i >> 16;
						int i_1415_ = i_1384_ - i_1390_;
						int i_1416_ = is[i_1415_] + i_1389_;
						if ((i_1414_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_1414_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1414_ >= i_1416_ && i_1414_ < is_1391_[i_1415_] + i_1416_)
							((HardwareRenderer) this).anIntArray8979[i_1414_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1384_)] = i_1387_;
						i += i_1412_;
					}
				} else if (1 == i_1388_) {
					i_1387_ = ((i_1413_ * (i_1387_ & 0xff00) >> 8 & 0xff00) + ((i_1387_ & 0xff00ff) * i_1413_ >> 8 & 0xff00ff) + (i_1413_ << 24));
					int i_1417_ = 256 - i_1413_;
					for (/**/; i_1384_ <= i_1386_; i_1384_++) {
						int i_1418_ = i >> 16;
						int i_1419_ = i_1384_ - i_1390_;
						int i_1420_ = i_1389_ + is[i_1419_];
						if ((i_1418_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_1418_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1418_ >= i_1420_ && i_1418_ < i_1420_ + is_1391_[i_1419_]) {
							int i_1421_ = i_1418_ + i_1384_ * ((((HardwareRenderer) this).anInt8980) * 444800403);
							int i_1422_ = (((HardwareRenderer) this).anIntArray8979[i_1421_]);
							i_1422_ = ((i_1417_ * (i_1422_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1417_ * (i_1422_ & 0xff00) >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[(i_1418_ + i_1384_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_1422_ + i_1387_;
						}
						i += i_1412_;
					}
				} else if (2 == i_1388_) {
					for (/**/; i_1384_ <= i_1386_; i_1384_++) {
						int i_1423_ = i >> 16;
						int i_1424_ = i_1384_ - i_1390_;
						int i_1425_ = is[i_1424_] + i_1389_;
						if ((i_1423_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_1423_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1423_ >= i_1425_ && i_1423_ < i_1425_ + is_1391_[i_1424_]) {
							int i_1426_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_1384_) + i_1423_;
							int i_1427_ = (((HardwareRenderer) this).anIntArray8979[i_1426_]);
							int i_1428_ = i_1387_ + i_1427_;
							int i_1429_ = (i_1427_ & 0xff00ff) + (i_1387_ & 0xff00ff);
							i_1427_ = ((i_1428_ - i_1429_ & 0x10000) + (i_1429_ & 0x1000100));
							((HardwareRenderer) this).anIntArray8979[i_1426_] = i_1428_ - i_1427_ | i_1427_ - (i_1427_ >>> 8);
						}
						i += i_1412_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void jf() {
		for (int i = 0; i < ((HardwareRenderer) this).aClass185Array8984.length; i++) {
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).anInt2307 = (((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).anInt2336) * 1803205889;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).aBool2309 = false;
		}
	}

	public void method8533(int i, int i_1430_, int i_1431_, int i_1432_, int i_1433_, int i_1434_, Class455 class455, int i_1435_, int i_1436_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_1437_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_1438_ = (1516535457 * ((HardwareRenderer) this).anInt9009 > i_1436_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_1436_);
			int i_1439_ = ((1383960921 * ((HardwareRenderer) this).anInt8986 < i_1436_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : is.length + i_1436_);
			i_1431_ -= i;
			i_1432_ -= i_1430_;
			if (i_1432_ + i_1431_ < 0) {
				i += i_1431_;
				i_1431_ = -i_1431_;
				i_1430_ += i_1432_;
				i_1432_ = -i_1432_;
			}
			if (i_1431_ > i_1432_) {
				i_1430_ <<= 16;
				i_1430_ += 32768;
				i_1432_ <<= 16;
				int i_1440_ = (int) Math.floor((double) i_1432_ / (double) i_1431_ + 0.5);
				i_1431_ += i;
				if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
					i_1430_ += (((HardwareRenderer) this).anInt8983 * 72550989 - i) * i_1440_;
					i = ((HardwareRenderer) this).anInt8983 * 72550989;
				}
				if (i_1431_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
					i_1431_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - 1;
				int i_1441_ = i_1433_ >>> 24;
				if (0 == i_1434_ || 1 == i_1434_ && i_1441_ == 255) {
					for (/**/; i <= i_1431_; i++) {
						int i_1442_ = i_1430_ >> 16;
						int i_1443_ = i_1442_ - i_1436_;
						if (i_1442_ >= i_1438_ && i_1442_ < i_1439_) {
							int i_1444_ = is[i_1443_] + i_1435_;
							if (i >= i_1444_ && i < is_1437_[i_1443_] + i_1444_)
								((HardwareRenderer) this).anIntArray8979[i_1442_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_1433_;
						}
						i_1430_ += i_1440_;
					}
				} else if (1 == i_1434_) {
					i_1433_ = ((i_1441_ * (i_1433_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1433_ & 0xff00) * i_1441_ >> 8 & 0xff00) + (i_1441_ << 24));
					int i_1445_ = 256 - i_1441_;
					for (/**/; i <= i_1431_; i++) {
						int i_1446_ = i_1430_ >> 16;
						int i_1447_ = i_1446_ - i_1436_;
						if (i_1446_ >= i_1438_ && i_1446_ < i_1439_) {
							int i_1448_ = is[i_1447_] + i_1435_;
							if (i >= i_1448_ && i < i_1448_ + is_1437_[i_1447_]) {
								int i_1449_ = i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1446_);
								int i_1450_ = (((HardwareRenderer) this).anIntArray8979[i_1449_]);
								i_1450_ = ((i_1445_ * (i_1450_ & 0xff00) >> 8 & 0xff00) + (i_1445_ * (i_1450_ & 0xff00ff) >> 8 & 0xff00ff));
								((HardwareRenderer) this).anIntArray8979[i_1449_] = i_1433_ + i_1450_;
							}
						}
						i_1430_ += i_1440_;
					}
				} else if (i_1434_ == 2) {
					for (/**/; i <= i_1431_; i++) {
						int i_1451_ = i_1430_ >> 16;
						int i_1452_ = i_1451_ - i_1436_;
						if (i_1451_ >= i_1438_ && i_1451_ < i_1439_) {
							int i_1453_ = i_1435_ + is[i_1452_];
							if (i >= i_1453_ && i < is_1437_[i_1452_] + i_1453_) {
								int i_1454_ = ((i_1451_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1455_ = (((HardwareRenderer) this).anIntArray8979[i_1454_]);
								int i_1456_ = i_1455_ + i_1433_;
								int i_1457_ = ((i_1433_ & 0xff00ff) + (i_1455_ & 0xff00ff));
								i_1455_ = ((i_1457_ & 0x1000100) + (i_1456_ - i_1457_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1454_] = i_1456_ - i_1455_ | i_1455_ - (i_1455_ >>> 8);
							}
						}
						i_1430_ += i_1440_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1431_ <<= 16;
				int i_1458_ = (int) Math.floor(0.5 + ((double) i_1431_ / (double) i_1432_));
				i_1432_ += i_1430_;
				if (i_1430_ < i_1438_) {
					i += (i_1438_ - i_1430_) * i_1458_;
					i_1430_ = i_1438_;
				}
				if (i_1432_ >= i_1439_)
					i_1432_ = i_1439_ - 1;
				int i_1459_ = i_1433_ >>> 24;
				if (0 == i_1434_ || i_1434_ == 1 && i_1459_ == 255) {
					for (/**/; i_1430_ <= i_1432_; i_1430_++) {
						int i_1460_ = i >> 16;
						int i_1461_ = i_1430_ - i_1436_;
						int i_1462_ = is[i_1461_] + i_1435_;
						if ((i_1460_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_1460_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1460_ >= i_1462_ && i_1460_ < is_1437_[i_1461_] + i_1462_)
							((HardwareRenderer) this).anIntArray8979[i_1460_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1430_)] = i_1433_;
						i += i_1458_;
					}
				} else if (1 == i_1434_) {
					i_1433_ = ((i_1459_ * (i_1433_ & 0xff00) >> 8 & 0xff00) + ((i_1433_ & 0xff00ff) * i_1459_ >> 8 & 0xff00ff) + (i_1459_ << 24));
					int i_1463_ = 256 - i_1459_;
					for (/**/; i_1430_ <= i_1432_; i_1430_++) {
						int i_1464_ = i >> 16;
						int i_1465_ = i_1430_ - i_1436_;
						int i_1466_ = i_1435_ + is[i_1465_];
						if ((i_1464_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_1464_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1464_ >= i_1466_ && i_1464_ < i_1466_ + is_1437_[i_1465_]) {
							int i_1467_ = i_1464_ + i_1430_ * ((((HardwareRenderer) this).anInt8980) * 444800403);
							int i_1468_ = (((HardwareRenderer) this).anIntArray8979[i_1467_]);
							i_1468_ = ((i_1463_ * (i_1468_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1463_ * (i_1468_ & 0xff00) >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[(i_1464_ + i_1430_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_1468_ + i_1433_;
						}
						i += i_1458_;
					}
				} else if (2 == i_1434_) {
					for (/**/; i_1430_ <= i_1432_; i_1430_++) {
						int i_1469_ = i >> 16;
						int i_1470_ = i_1430_ - i_1436_;
						int i_1471_ = is[i_1470_] + i_1435_;
						if ((i_1469_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_1469_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1469_ >= i_1471_ && i_1469_ < i_1471_ + is_1437_[i_1470_]) {
							int i_1472_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_1430_) + i_1469_;
							int i_1473_ = (((HardwareRenderer) this).anIntArray8979[i_1472_]);
							int i_1474_ = i_1433_ + i_1473_;
							int i_1475_ = (i_1473_ & 0xff00ff) + (i_1433_ & 0xff00ff);
							i_1473_ = ((i_1474_ - i_1475_ & 0x10000) + (i_1475_ & 0x1000100));
							((HardwareRenderer) this).anIntArray8979[i_1472_] = i_1474_ - i_1473_ | i_1473_ - (i_1473_ >>> 8);
						}
						i += i_1458_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method8575(int i, int i_1476_, int i_1477_, int i_1478_, int i_1479_, int i_1480_, Class455 class455, int i_1481_, int i_1482_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_1483_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_1484_ = (1516535457 * ((HardwareRenderer) this).anInt9009 > i_1482_ ? ((HardwareRenderer) this).anInt9009 * 1516535457 : i_1482_);
			int i_1485_ = ((1383960921 * ((HardwareRenderer) this).anInt8986 < i_1482_ + is.length) ? ((HardwareRenderer) this).anInt8986 * 1383960921 : is.length + i_1482_);
			i_1477_ -= i;
			i_1478_ -= i_1476_;
			if (i_1478_ + i_1477_ < 0) {
				i += i_1477_;
				i_1477_ = -i_1477_;
				i_1476_ += i_1478_;
				i_1478_ = -i_1478_;
			}
			if (i_1477_ > i_1478_) {
				i_1476_ <<= 16;
				i_1476_ += 32768;
				i_1478_ <<= 16;
				int i_1486_ = (int) Math.floor((double) i_1478_ / (double) i_1477_ + 0.5);
				i_1477_ += i;
				if (i < ((HardwareRenderer) this).anInt8983 * 72550989) {
					i_1476_ += (((HardwareRenderer) this).anInt8983 * 72550989 - i) * i_1486_;
					i = ((HardwareRenderer) this).anInt8983 * 72550989;
				}
				if (i_1477_ >= ((HardwareRenderer) this).anInt9002 * -1710988237)
					i_1477_ = -1710988237 * ((HardwareRenderer) this).anInt9002 - 1;
				int i_1487_ = i_1479_ >>> 24;
				if (0 == i_1480_ || 1 == i_1480_ && i_1487_ == 255) {
					for (/**/; i <= i_1477_; i++) {
						int i_1488_ = i_1476_ >> 16;
						int i_1489_ = i_1488_ - i_1482_;
						if (i_1488_ >= i_1484_ && i_1488_ < i_1485_) {
							int i_1490_ = is[i_1489_] + i_1481_;
							if (i >= i_1490_ && i < is_1483_[i_1489_] + i_1490_)
								((HardwareRenderer) this).anIntArray8979[i_1488_ * (444800403 * (((HardwareRenderer) this).anInt8980)) + i] = i_1479_;
						}
						i_1476_ += i_1486_;
					}
				} else if (1 == i_1480_) {
					i_1479_ = ((i_1487_ * (i_1479_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1479_ & 0xff00) * i_1487_ >> 8 & 0xff00) + (i_1487_ << 24));
					int i_1491_ = 256 - i_1487_;
					for (/**/; i <= i_1477_; i++) {
						int i_1492_ = i_1476_ >> 16;
						int i_1493_ = i_1492_ - i_1482_;
						if (i_1492_ >= i_1484_ && i_1492_ < i_1485_) {
							int i_1494_ = is[i_1493_] + i_1481_;
							if (i >= i_1494_ && i < i_1494_ + is_1483_[i_1493_]) {
								int i_1495_ = i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1492_);
								int i_1496_ = (((HardwareRenderer) this).anIntArray8979[i_1495_]);
								i_1496_ = ((i_1491_ * (i_1496_ & 0xff00) >> 8 & 0xff00) + (i_1491_ * (i_1496_ & 0xff00ff) >> 8 & 0xff00ff));
								((HardwareRenderer) this).anIntArray8979[i_1495_] = i_1479_ + i_1496_;
							}
						}
						i_1476_ += i_1486_;
					}
				} else if (i_1480_ == 2) {
					for (/**/; i <= i_1477_; i++) {
						int i_1497_ = i_1476_ >> 16;
						int i_1498_ = i_1497_ - i_1482_;
						if (i_1497_ >= i_1484_ && i_1497_ < i_1485_) {
							int i_1499_ = i_1481_ + is[i_1498_];
							if (i >= i_1499_ && i < is_1483_[i_1498_] + i_1499_) {
								int i_1500_ = ((i_1497_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1501_ = (((HardwareRenderer) this).anIntArray8979[i_1500_]);
								int i_1502_ = i_1501_ + i_1479_;
								int i_1503_ = ((i_1479_ & 0xff00ff) + (i_1501_ & 0xff00ff));
								i_1501_ = ((i_1503_ & 0x1000100) + (i_1502_ - i_1503_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1500_] = i_1502_ - i_1501_ | i_1501_ - (i_1501_ >>> 8);
							}
						}
						i_1476_ += i_1486_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1477_ <<= 16;
				int i_1504_ = (int) Math.floor(0.5 + ((double) i_1477_ / (double) i_1478_));
				i_1478_ += i_1476_;
				if (i_1476_ < i_1484_) {
					i += (i_1484_ - i_1476_) * i_1504_;
					i_1476_ = i_1484_;
				}
				if (i_1478_ >= i_1485_)
					i_1478_ = i_1485_ - 1;
				int i_1505_ = i_1479_ >>> 24;
				if (0 == i_1480_ || i_1480_ == 1 && i_1505_ == 255) {
					for (/**/; i_1476_ <= i_1478_; i_1476_++) {
						int i_1506_ = i >> 16;
						int i_1507_ = i_1476_ - i_1482_;
						int i_1508_ = is[i_1507_] + i_1481_;
						if ((i_1506_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_1506_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1506_ >= i_1508_ && i_1506_ < is_1483_[i_1507_] + i_1508_)
							((HardwareRenderer) this).anIntArray8979[i_1506_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1476_)] = i_1479_;
						i += i_1504_;
					}
				} else if (1 == i_1480_) {
					i_1479_ = ((i_1505_ * (i_1479_ & 0xff00) >> 8 & 0xff00) + ((i_1479_ & 0xff00ff) * i_1505_ >> 8 & 0xff00ff) + (i_1505_ << 24));
					int i_1509_ = 256 - i_1505_;
					for (/**/; i_1476_ <= i_1478_; i_1476_++) {
						int i_1510_ = i >> 16;
						int i_1511_ = i_1476_ - i_1482_;
						int i_1512_ = i_1481_ + is[i_1511_];
						if ((i_1510_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && i_1510_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1510_ >= i_1512_ && i_1510_ < i_1512_ + is_1483_[i_1511_]) {
							int i_1513_ = i_1510_ + i_1476_ * ((((HardwareRenderer) this).anInt8980) * 444800403);
							int i_1514_ = (((HardwareRenderer) this).anIntArray8979[i_1513_]);
							i_1514_ = ((i_1509_ * (i_1514_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1509_ * (i_1514_ & 0xff00) >> 8 & 0xff00));
							((HardwareRenderer) this).anIntArray8979[(i_1510_ + i_1476_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_1514_ + i_1479_;
						}
						i += i_1504_;
					}
				} else if (2 == i_1480_) {
					for (/**/; i_1476_ <= i_1478_; i_1476_++) {
						int i_1515_ = i >> 16;
						int i_1516_ = i_1476_ - i_1482_;
						int i_1517_ = is[i_1516_] + i_1481_;
						if ((i_1515_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && i_1515_ < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1515_ >= i_1517_ && i_1515_ < i_1517_ + is_1483_[i_1516_]) {
							int i_1518_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_1476_) + i_1515_;
							int i_1519_ = (((HardwareRenderer) this).anIntArray8979[i_1518_]);
							int i_1520_ = i_1479_ + i_1519_;
							int i_1521_ = (i_1519_ & 0xff00ff) + (i_1479_ & 0xff00ff);
							i_1519_ = ((i_1520_ - i_1521_ & 0x10000) + (i_1521_ & 0x1000100));
							((HardwareRenderer) this).anIntArray8979[i_1518_] = i_1520_ - i_1519_ | i_1519_ - (i_1519_ >>> 8);
						}
						i += i_1504_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public int[] kh(int i, int i_1522_, int i_1523_, int i_1524_) {
		if (((HardwareRenderer) this).anIntArray8979 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_1524_ * i_1523_];
		int i_1525_ = 0;
		for (int i_1526_ = 0; i_1526_ < i_1524_; i_1526_++) {
			int i_1527_ = i + (i_1522_ + i_1526_) * (((HardwareRenderer) this).anInt8980 * 444800403);
			for (int i_1528_ = 0; i_1528_ < i_1523_; i_1528_++)
				is[i_1525_++] = ((HardwareRenderer) this).anIntArray8979[i_1527_ + i_1528_];
		}
		return is;
	}

	public void method8480(boolean bool) {
		/* empty */
	}

	public Class282_Sub1 method8438(int i) {
		return null;
	}

	public int method8538(int i, int i_1529_, int i_1530_, int i_1531_, int i_1532_, int i_1533_) {
		int i_1534_ = 0;
		float f = (((float) i_1530_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) + (((float) i_1529_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]))));
		float f_1535_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6] * (float) i_1532_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] * (float) i_1531_)) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * (float) i_1533_));
		float f_1536_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + ((float) i_1529_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (float) i_1530_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		float f_1537_ = (((float) i_1532_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * (float) i_1531_)) + (float) i_1533_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f < -f_1536_ && f_1535_ < -f_1537_)
			i_1534_ |= 0x10;
		else if (f > f_1536_ && f_1535_ > f_1537_)
			i_1534_ |= 0x20;
		float f_1538_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_1529_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + ((float) i_1530_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]));
		float f_1539_ = (((float) i_1533_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((float) i_1531_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_1532_)));
		if (f_1538_ < -f_1536_ && f_1539_ < -f_1537_)
			i_1534_ |= 0x1;
		if (f_1538_ > f_1536_ && f_1539_ > f_1537_)
			i_1534_ |= 0x2;
		float f_1540_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_1529_) + (((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9] * (float) i_1530_));
		float f_1541_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] * (float) i_1531_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_1532_) + ((float) i_1533_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		if (f_1540_ < -f_1536_ && f_1541_ < -f_1537_)
			i_1534_ |= 0x4;
		if (f_1540_ > f_1536_ && f_1541_ > f_1537_)
			i_1534_ |= 0x8;
		return i_1534_;
	}

	public void method8629(int i, int i_1542_, float f, int i_1543_, int i_1544_, float f_1545_, int i_1546_, int i_1547_, float f_1548_, int i_1549_, int i_1550_, int i_1551_, int i_1552_) {
		boolean bool = ((HardwareRenderer) this).anIntArray8979 != null;
		boolean bool_1553_ = ((HardwareRenderer) this).aFloatArray9010 != null;
		if (bool || bool_1553_) {
			Class185 class185 = method14370(Thread.currentThread());
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aBool1675 = false;
			i -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_1543_ -= 72550989 * ((HardwareRenderer) this).anInt8983;
			i_1546_ -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_1542_ -= ((HardwareRenderer) this).anInt9009 * 1516535457;
			i_1544_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			i_1547_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			((Class144) class144).aBool1708 = (i < 0 || i > ((Class144) class144).anInt1684 || i_1543_ < 0 || i_1543_ > ((Class144) class144).anInt1684 || i_1546_ < 0 || i_1546_ > ((Class144) class144).anInt1684);
			int i_1554_ = i_1549_ >>> 24;
			if (0 == i_1552_ || 1 == i_1552_ && i_1554_ == 255) {
				((Class144) class144).anInt1674 = 0;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_1553_, false, (float) i_1542_, (float) i_1544_, (float) i_1547_, (float) i, (float) i_1543_, (float) i_1546_, f, f_1545_, f_1548_, i_1549_, i_1550_, i_1551_);
			} else if (1 == i_1552_) {
				((Class144) class144).anInt1674 = 255 - i_1554_;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_1553_, false, (float) i_1542_, (float) i_1544_, (float) i_1547_, (float) i, (float) i_1543_, (float) i_1546_, f, f_1545_, f_1548_, i_1549_, i_1550_, i_1551_);
			} else if (i_1552_ == 2) {
				((Class144) class144).anInt1674 = 128;
				((Class144) class144).aBool1672 = true;
				class144.method2425(bool, bool_1553_, false, (float) i_1542_, (float) i_1544_, (float) i_1547_, (float) i, (float) i_1543_, (float) i_1546_, f, f_1545_, f_1548_, i_1549_, i_1550_, i_1551_);
			} else
				throw new IllegalArgumentException();
			((Class144) class144).aBool1675 = true;
		}
	}

	public int method8540(int i, int i_1555_, int i_1556_, int i_1557_, int i_1558_, int i_1559_) {
		int i_1560_ = 0;
		float f = (((float) i_1556_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) + (((float) i_1555_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]))));
		float f_1561_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6] * (float) i_1558_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] * (float) i_1557_)) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * (float) i_1559_));
		float f_1562_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + ((float) i_1555_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (float) i_1556_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		float f_1563_ = (((float) i_1558_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * (float) i_1557_)) + (float) i_1559_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f < -f_1562_ && f_1561_ < -f_1563_)
			i_1560_ |= 0x10;
		else if (f > f_1562_ && f_1561_ > f_1563_)
			i_1560_ |= 0x20;
		float f_1564_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_1555_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + ((float) i_1556_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]));
		float f_1565_ = (((float) i_1559_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((float) i_1557_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4] * (float) i_1558_)));
		if (f_1564_ < -f_1562_ && f_1565_ < -f_1563_)
			i_1560_ |= 0x1;
		if (f_1564_ > f_1562_ && f_1565_ > f_1563_)
			i_1560_ |= 0x2;
		float f_1566_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_1555_) + (((float) i * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9] * (float) i_1556_));
		float f_1567_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] * (float) i_1557_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5] * (float) i_1558_) + ((float) i_1559_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		if (f_1566_ < -f_1562_ && f_1567_ < -f_1563_)
			i_1560_ |= 0x4;
		if (f_1566_ > f_1562_ && f_1567_ > f_1563_)
			i_1560_ |= 0x8;
		return i_1560_;
	}

	public Class282_Sub1 method8570(int i) {
		return null;
	}

	public Class282_Sub1 method8541(int i) {
		return null;
	}

	void method14398(boolean bool, boolean bool_1568_, boolean bool_1569_, Class151 class151) {
		Class185 class185 = method14370(Thread.currentThread());
		Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
		for (Class275_Sub1 class275_sub1_1570_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_1570_ != class275_sub1; class275_sub1_1570_ = class275_sub1_1570_.aClass275_Sub1_7706) {
			Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_1570_;
			int i = class275_sub1_sub1.anInt10205 >> 12;
			int i_1571_ = class275_sub1_sub1.anInt10208 >> 12;
			int i_1572_ = class275_sub1_sub1.anInt10202 >> 12;
			float f = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10]) * (float) i_1572_ + ((float) i * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2]) + (float) i_1571_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6]))));
			float f_1573_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * (float) i_1571_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) * (float) i + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]) * (float) i_1572_));
			if (!(f < -f_1573_)) {
				float f_1574_ = (((HardwareRenderer) this).aFloat8985 + f * ((HardwareRenderer) this).aFloat8978 / f_1573_);
				if (!(f > ((Class185) class185).aFloat2305)) {
					float f_1575_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0]) * (float) i + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) * (float) i_1571_ + (float) i_1572_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12]));
					float f_1576_ = ((float) i_1572_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) * (float) i + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) * (float) i_1571_) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]));
					if (!(f_1575_ < -f_1573_) && !(f_1575_ > f_1573_) && !(f_1576_ < -f_1573_) && !(f_1576_ > f_1573_)) {
						float f_1577_ = (float) class275_sub1_sub1.anInt10206 / 4096.0F;
						float f_1578_ = (f_1577_ * (((HardwareRenderer) this).aClass384_8995.aFloatArray4667[0]) + f_1575_);
						float f_1579_ = f_1573_ + (((HardwareRenderer) this).aClass384_8995.aFloatArray4667[3]) * f_1577_;
						float f_1580_ = (((HardwareRenderer) this).aFloat9003 + (f_1575_ * ((HardwareRenderer) this).aFloat8976 / f_1573_));
						float f_1581_ = ((((HardwareRenderer) this).aFloat9004 * f_1576_ / f_1573_) + ((HardwareRenderer) this).aFloat8982);
						float f_1582_ = (((HardwareRenderer) this).aFloat9003 + (f_1578_ * ((HardwareRenderer) this).aFloat8976 / f_1579_));
						method14371(bool, bool_1568_, bool_1569_, class275_sub1_sub1, (int) f_1580_, (int) f_1581_, f_1574_, (int) (f_1582_ < f_1580_ ? f_1580_ - f_1582_ : f_1582_ - f_1580_));
					}
				}
			}
		}
	}

	HardwareRenderer(Canvas canvas, Interface22 interface22, int i, int i_1583_) {
		this(interface22);
		try {
			method8524(canvas, i, i_1583_, (byte) -11);
			method8412(canvas, (byte) 8);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method8396(1612503193);
			throw new RuntimeException("");
		}
	}

	public void method8544(Class282_Sub1 class282_sub1) {
		/* empty */
	}

	public NativeSprite method8461(int i, int i_1584_, boolean bool, boolean bool_1585_) {
		if (bool)
			return new Class160_Sub1_Sub3(this, i, i_1584_);
		return new Class160_Sub1_Sub1(this, i, i_1584_);
	}

	public NativeSprite method8577(int i, int i_1586_, boolean bool, boolean bool_1587_) {
		if (bool)
			return new Class160_Sub1_Sub3(this, i, i_1586_);
		return new Class160_Sub1_Sub1(this, i, i_1586_);
	}

	public NativeSprite method8543(int[] is, int i, int i_1588_, int i_1589_, int i_1590_, boolean bool) {
		boolean bool_1591_ = false;
		int i_1592_ = i;
		while_229_: for (int i_1593_ = 0; i_1593_ < i_1590_; i_1593_++) {
			for (int i_1594_ = 0; i_1594_ < i_1589_; i_1594_++) {
				int i_1595_ = is[i_1592_++] >>> 24;
				if (0 != i_1595_ && i_1595_ != 255) {
					bool_1591_ = true;
					break while_229_;
				}
			}
		}
		if (bool_1591_)
			return new Class160_Sub1_Sub3(this, is, i, i_1588_, i_1589_, i_1590_, bool);
		return new Class160_Sub1_Sub1(this, is, i, i_1588_, i_1589_, i_1590_, bool);
	}

	public void method8673(int i, int i_1596_, int i_1597_, int i_1598_) {
		/* empty */
	}

	public NativeSprite method8612(Class91 class91, boolean bool) {
		int[] is = class91.anIntArray955;
		byte[] is_1599_ = class91.aByteArray960;
		int i = class91.anInt957;
		int i_1600_ = class91.anInt954;
		Class160_Sub1 class160_sub1;
		if (bool && null == class91.aByteArray961) {
			int[] is_1601_ = new int[is.length];
			byte[] is_1602_ = new byte[i * i_1600_];
			for (int i_1603_ = 0; i_1603_ < i_1600_; i_1603_++) {
				int i_1604_ = i_1603_ * i;
				for (int i_1605_ = 0; i_1605_ < i; i_1605_++)
					is_1602_[i_1605_ + i_1604_] = is_1599_[i_1605_ + i_1604_];
			}
			for (int i_1606_ = 0; i_1606_ < is.length; i_1606_++)
				is_1601_[i_1606_] = is[i_1606_];
			class160_sub1 = new Class160_Sub1_Sub2(this, is_1602_, is_1601_, i, i_1600_);
		} else {
			int[] is_1607_ = new int[i_1600_ * i];
			byte[] is_1608_ = class91.aByteArray961;
			if (is_1608_ != null) {
				for (int i_1609_ = 0; i_1609_ < i_1600_; i_1609_++) {
					int i_1610_ = i * i_1609_;
					for (int i_1611_ = 0; i_1611_ < i; i_1611_++)
						is_1607_[i_1611_ + i_1610_] = (is[is_1599_[i_1611_ + i_1610_] & 0xff] | is_1608_[i_1611_ + i_1610_] << 24);
				}
				class160_sub1 = new Class160_Sub1_Sub3(this, is_1607_, i, i_1600_);
			} else {
				for (int i_1612_ = 0; i_1612_ < i_1600_; i_1612_++) {
					int i_1613_ = i_1612_ * i;
					for (int i_1614_ = 0; i_1614_ < i; i_1614_++) {
						int i_1615_ = is[is_1599_[i_1614_ + i_1613_] & 0xff];
						is_1607_[i_1613_ + i_1614_] = i_1615_ != 0 ? ~0xffffff | i_1615_ : 0;
					}
				}
				class160_sub1 = new Class160_Sub1_Sub1(this, is_1607_, i, i_1600_);
			}
		}
		class160_sub1.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return class160_sub1;
	}

	public int method8463() {
		return 0;
	}

	public boolean method8464() {
		return false;
	}

	public NativeSprite method8552(int i, int i_1616_, int i_1617_, int i_1618_, boolean bool) {
		if (null == ((HardwareRenderer) this).anIntArray8979)
			throw new IllegalStateException("");
		int[] is = new int[i_1617_ * i_1618_];
		int i_1619_ = i_1616_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
		int i_1620_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i_1617_;
		for (int i_1621_ = 0; i_1621_ < i_1618_; i_1621_++) {
			int i_1622_ = i_1621_ * i_1617_;
			for (int i_1623_ = 0; i_1623_ < i_1617_; i_1623_++)
				is[i_1622_ + i_1623_] = ((HardwareRenderer) this).anIntArray8979[i_1619_++];
			i_1619_ += i_1620_;
		}
		if (bool)
			return new Class160_Sub1_Sub3(this, is, i_1617_, i_1618_);
		return new Class160_Sub1_Sub1(this, is, i_1617_, i_1618_);
	}

	public void method8542(Class282_Sub1 class282_sub1) {
		/* empty */
	}

	public Class455 method8554(int i, int i_1624_, int[] is, int[] is_1625_) {
		return new PacketsDecoder(i, i_1624_, is, is_1625_);
	}

	public Class455 method8427(int i, int i_1626_, int[] is, int[] is_1627_) {
		return new PacketsDecoder(i, i_1626_, is, is_1627_);
	}

	void method14399(int i, int i_1628_, int i_1629_, int i_1630_, int i_1631_, int i_1632_, int i_1633_, int i_1634_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < -1710988237 * ((HardwareRenderer) this).anInt9002)) {
			int i_1635_ = i + i_1628_ * (((HardwareRenderer) this).anInt8980 * 444800403);
			int i_1636_ = i_1630_ >>> 24;
			int i_1637_ = i_1633_ + i_1632_;
			int i_1638_ = i_1634_ % i_1637_;
			if (0 == i_1631_ || i_1631_ == 1 && i_1636_ == 255) {
				int i_1639_ = 0;
				while (i_1639_ < i_1629_) {
					if ((i_1639_ + i_1628_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_1628_ + i_1639_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1638_ < i_1632_)
						((HardwareRenderer) this).anIntArray8979[(i_1635_ + i_1639_ * (((HardwareRenderer) this).anInt8980 * 444800403))] = i_1630_;
					i_1639_++;
					i_1638_ = ++i_1638_ % i_1637_;
				}
			} else if (1 == i_1631_) {
				i_1630_ = ((i_1636_ << 24) + ((i_1636_ * (i_1630_ & 0xff00) >> 8 & 0xff00) + (i_1636_ * (i_1630_ & 0xff00ff) >> 8 & 0xff00ff)));
				int i_1640_ = 256 - i_1636_;
				int i_1641_ = 0;
				while (i_1641_ < i_1629_) {
					if ((i_1628_ + i_1641_ >= 1516535457 * ((HardwareRenderer) this).anInt9009) && (i_1641_ + i_1628_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1638_ < i_1632_) {
						int i_1642_ = (i_1635_ + i_1641_ * (444800403 * (((HardwareRenderer) this).anInt8980)));
						int i_1643_ = ((HardwareRenderer) this).anIntArray8979[i_1642_];
						i_1643_ = ((i_1640_ * (i_1643_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1640_ * (i_1643_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[i_1642_] = i_1630_ + i_1643_;
					}
					i_1641_++;
					i_1638_ = ++i_1638_ % i_1637_;
				}
			} else if (2 == i_1631_) {
				int i_1644_ = 0;
				while (i_1644_ < i_1629_) {
					if ((i_1644_ + i_1628_ >= ((HardwareRenderer) this).anInt9009 * 1516535457) && (i_1628_ + i_1644_ < ((HardwareRenderer) this).anInt8986 * 1383960921) && i_1638_ < i_1632_) {
						int i_1645_ = (i_1644_ * (444800403 * ((HardwareRenderer) this).anInt8980) + i_1635_);
						int i_1646_ = ((HardwareRenderer) this).anIntArray8979[i_1645_];
						int i_1647_ = i_1630_ + i_1646_;
						int i_1648_ = (i_1646_ & 0xff00ff) + (i_1630_ & 0xff00ff);
						i_1646_ = (i_1648_ & 0x1000100) + (i_1647_ - i_1648_ & 0x10000);
						((HardwareRenderer) this).anIntArray8979[i_1645_] = i_1647_ - i_1646_ | i_1646_ - (i_1646_ >>> 8);
					}
					i_1644_++;
					i_1638_ = ++i_1638_ % i_1637_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void hr(int i, Class455 class455, int i_1649_, int i_1650_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_1651_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_1652_;
			if (((HardwareRenderer) this).anInt8986 * 1383960921 < i_1650_ + is.length)
				i_1652_ = ((HardwareRenderer) this).anInt8986 * 1383960921 - i_1650_;
			else
				i_1652_ = is.length;
			int i_1653_;
			if (((HardwareRenderer) this).anInt9009 * 1516535457 > i_1650_) {
				i_1653_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_1650_;
				i_1650_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			} else
				i_1653_ = 0;
			if (i_1652_ - i_1653_ > 0) {
				int i_1654_ = 444800403 * ((HardwareRenderer) this).anInt8980 * i_1650_;
				for (int i_1655_ = i_1653_; i_1655_ < i_1652_; i_1655_++) {
					int i_1656_ = is[i_1655_] + i_1649_;
					int i_1657_ = is_1651_[i_1655_];
					if (((HardwareRenderer) this).anInt8983 * 72550989 > i_1656_) {
						i_1657_ -= (72550989 * ((HardwareRenderer) this).anInt8983 - i_1656_);
						i_1656_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (-1710988237 * ((HardwareRenderer) this).anInt9002 < i_1657_ + i_1656_)
						i_1657_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - i_1656_);
					i_1656_ += i_1654_;
					for (int i_1658_ = -i_1657_; i_1658_ < 0; i_1658_++)
						((HardwareRenderer) this).anIntArray8979[i_1656_++] = i;
					i_1654_ += ((HardwareRenderer) this).anInt8980 * 444800403;
				}
			}
		}
	}

	void method14400() {
		int i = (-1710988237 * ((HardwareRenderer) this).anInt9002 - ((HardwareRenderer) this).anInt8983 * 72550989);
		int i_1659_ = (1383960921 * ((HardwareRenderer) this).anInt8986 - 1516535457 * ((HardwareRenderer) this).anInt9009);
		float f = (((HardwareRenderer) this).aFloat8976 = ((float) (((HardwareRenderer) this).anInt9000 * -441894851) / 2.0F));
		float f_1660_ = (((HardwareRenderer) this).aFloat9004 = (float) (3132971 * ((HardwareRenderer) this).anInt9001) / 2.0F);
		((HardwareRenderer) this).aFloat9003 = (float) (116006945 * ((HardwareRenderer) this).anInt8998) + f;
		((HardwareRenderer) this).aFloat8982 = (float) (842600775 * ((HardwareRenderer) this).anInt8999) + f_1660_;
		for (int i_1661_ = 0; i_1661_ < 656550451 * ((HardwareRenderer) this).anInt9008; i_1661_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_1661_];
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aFloat1679 = f;
			((Class144) class144).aFloat1702 = f_1660_;
			((Class144) class144).aFloat1678 = (((HardwareRenderer) this).aFloat9003 - (float) (72550989 * ((HardwareRenderer) this).anInt8983));
			((Class144) class144).aFloat1680 = (((HardwareRenderer) this).aFloat8982 - (float) (((HardwareRenderer) this).anInt9009 * 1516535457));
			((Class144) class144).anInt1684 = i;
			((Class144) class144).anInt1700 = i_1659_;
		}
		int i_1662_ = ((((HardwareRenderer) this).anInt8980 * 444800403 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
		for (int i_1663_ = ((HardwareRenderer) this).anInt9009 * 1516535457; i_1663_ < 1383960921 * ((HardwareRenderer) this).anInt8986; i_1663_++) {
			for (int i_1664_ = 0; i_1664_ < ((HardwareRenderer) this).anInt9008 * 656550451; i_1664_++)
				((Class144) (((Class185) (((HardwareRenderer) this).aClass185Array8984[i_1664_])).aClass144_2310)).anIntArray1685[i_1663_ - ((HardwareRenderer) this).anInt9009 * 1516535457] = i_1662_;
			i_1662_ += 444800403 * ((HardwareRenderer) this).anInt8980;
		}
	}

	public void hi(int i, Class455 class455, int i_1665_, int i_1666_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_1667_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_1668_;
			if (((HardwareRenderer) this).anInt8986 * 1383960921 < i_1666_ + is.length)
				i_1668_ = ((HardwareRenderer) this).anInt8986 * 1383960921 - i_1666_;
			else
				i_1668_ = is.length;
			int i_1669_;
			if (((HardwareRenderer) this).anInt9009 * 1516535457 > i_1666_) {
				i_1669_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_1666_;
				i_1666_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			} else
				i_1669_ = 0;
			if (i_1668_ - i_1669_ > 0) {
				int i_1670_ = 444800403 * ((HardwareRenderer) this).anInt8980 * i_1666_;
				for (int i_1671_ = i_1669_; i_1671_ < i_1668_; i_1671_++) {
					int i_1672_ = is[i_1671_] + i_1665_;
					int i_1673_ = is_1667_[i_1671_];
					if (((HardwareRenderer) this).anInt8983 * 72550989 > i_1672_) {
						i_1673_ -= (72550989 * ((HardwareRenderer) this).anInt8983 - i_1672_);
						i_1672_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (-1710988237 * ((HardwareRenderer) this).anInt9002 < i_1673_ + i_1672_)
						i_1673_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - i_1672_);
					i_1672_ += i_1670_;
					for (int i_1674_ = -i_1673_; i_1674_ < 0; i_1674_++)
						((HardwareRenderer) this).anIntArray8979[i_1672_++] = i;
					i_1670_ += ((HardwareRenderer) this).anInt8980 * 444800403;
				}
			}
		}
	}

	public void method8601() {
		/* empty */
	}

	public FontRenderer method8625(Class414 class414, Class91[] class91s, boolean bool) {
		int[] is = new int[class91s.length];
		int[] is_1675_ = new int[class91s.length];
		boolean bool_1676_ = false;
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].anInt957;
			is_1675_[i] = class91s[i].anInt954;
			if (null != class91s[i].aByteArray961)
				bool_1676_ = true;
		}
		if (bool) {
			if (bool_1676_)
				return new Class8_Sub2(this, class414, class91s, is, is_1675_);
			return new Class8_Sub1(this, class414, class91s, is, is_1675_);
		}
		if (bool_1676_)
			throw new IllegalArgumentException("");
		return new Class8_Sub3(this, class414, class91s, is, is_1675_);
	}

	public void method8586(Class384 class384) {
		((HardwareRenderer) this).aClass384_8995.method6562(class384);
		method14374();
	}

	public void ba(int i, int i_1677_) {
		if ((i & 0x1) != 0)
			B(0, 0, 444800403 * ((HardwareRenderer) this).anInt8980, 2138511415 * ((HardwareRenderer) this).anInt8981, i_1677_, 0);
		if (0 != (i & 0x2))
			method14410();
	}

	public void fh(int[] is) {
		is[0] = ((HardwareRenderer) this).anInt8983 * 72550989;
		is[1] = ((HardwareRenderer) this).anInt9009 * 1516535457;
		is[2] = -1710988237 * ((HardwareRenderer) this).anInt9002;
		is[3] = 1383960921 * ((HardwareRenderer) this).anInt8986;
	}

	public MeshRasterizer method8623(RSMesh class157, int i, int i_1678_, int i_1679_, int i_1680_) {
		return new Class528_Sub2(this, class157, i, i_1679_, i_1680_, i_1678_);
	}

	public MeshRasterizer method8505(RSMesh class157, int i, int i_1681_, int i_1682_, int i_1683_) {
		return new Class528_Sub2(this, class157, i, i_1682_, i_1683_, i_1681_);
	}

	public void L() {
		((HardwareRenderer) this).anInt8983 = 0;
		((HardwareRenderer) this).anInt9009 = 0;
		((HardwareRenderer) this).anInt9002 = 1480196385 * ((HardwareRenderer) this).anInt8980;
		((HardwareRenderer) this).anInt8986 = ((HardwareRenderer) this).anInt8981 * 1628550159;
		method14364();
	}

	public int method8565(int i, int i_1684_) {
		i |= 0x20800;
		return i & i_1684_ ^ i_1684_;
	}

	Class185 method14401(Runnable runnable) {
		for (int i = 0; i < ((HardwareRenderer) this).anInt9008 * 656550451; i++) {
			if ((((Class185) ((HardwareRenderer) this).aClass185Array8984[i]).aRunnable2343) == runnable)
				return ((HardwareRenderer) this).aClass185Array8984[i];
		}
		return null;
	}

	public void method8581(Class151 class151) {
		method14363(((HardwareRenderer) this).anIntArray8979 != null, null != ((HardwareRenderer) this).aFloatArray9010, false, class151);
	}

	void method14402(int i, int i_1685_, int i_1686_, int i_1687_, int i_1688_, int i_1689_, int i_1690_, int i_1691_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i_1685_ >= ((HardwareRenderer) this).anInt9009 * 1516535457 && i_1685_ < 1383960921 * ((HardwareRenderer) this).anInt8986)) {
			int i_1692_ = i_1685_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1693_ = i_1687_ >>> 24;
			int i_1694_ = i_1690_ + i_1689_;
			int i_1695_ = i_1691_ % i_1694_;
			if (i_1688_ == 0 || 1 == i_1688_ && 255 == i_1693_) {
				int i_1696_ = 0;
				while (i_1696_ < i_1686_) {
					if ((i_1696_ + i >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1696_ < -1710988237 * ((HardwareRenderer) this).anInt9002) && i_1695_ < i_1689_)
						((HardwareRenderer) this).anIntArray8979[(i_1696_ + i_1692_)] = i_1687_;
					i_1696_++;
					i_1695_ = ++i_1695_ % i_1694_;
				}
			} else if (i_1688_ == 1) {
				i_1687_ = (((i_1687_ & 0xff00ff) * i_1693_ >> 8 & 0xff00ff) + (i_1693_ * (i_1687_ & 0xff00) >> 8 & 0xff00) + (i_1693_ << 24));
				int i_1697_ = 256 - i_1693_;
				int i_1698_ = 0;
				while (i_1698_ < i_1686_) {
					if ((i + i_1698_ >= ((HardwareRenderer) this).anInt8983 * 72550989) && (i + i_1698_ < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1695_ < i_1689_) {
						int i_1699_ = (((HardwareRenderer) this).anIntArray8979[i_1698_ + i_1692_]);
						i_1699_ = (((i_1699_ & 0xff00ff) * i_1697_ >> 8 & 0xff00ff) + (i_1697_ * (i_1699_ & 0xff00) >> 8 & 0xff00));
						((HardwareRenderer) this).anIntArray8979[(i_1698_ + i_1692_)] = i_1699_ + i_1687_;
					}
					i_1698_++;
					i_1695_ = ++i_1695_ % i_1694_;
				}
			} else if (i_1688_ == 2) {
				int i_1700_ = 0;
				while (i_1700_ < i_1686_) {
					if ((i + i_1700_ >= 72550989 * ((HardwareRenderer) this).anInt8983) && (i_1700_ + i < ((HardwareRenderer) this).anInt9002 * -1710988237) && i_1695_ < i_1689_) {
						int i_1701_ = (((HardwareRenderer) this).anIntArray8979[i_1700_ + i_1692_]);
						int i_1702_ = i_1701_ + i_1687_;
						int i_1703_ = (i_1701_ & 0xff00ff) + (i_1687_ & 0xff00ff);
						i_1701_ = (i_1702_ - i_1703_ & 0x10000) + (i_1703_ & 0x1000100);
						((HardwareRenderer) this).anIntArray8979[(i_1692_ + i_1700_)] = i_1702_ - i_1701_ | i_1701_ - (i_1701_ >>> 8);
					}
					i_1700_++;
					i_1695_ = ++i_1695_ % i_1694_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class390 method8569(int i, int i_1704_, int[][] is, int[][] is_1705_, int i_1706_, int i_1707_, int i_1708_) {
		return new Class390_Sub3(this, i_1707_, i_1708_, i, i_1704_, is, is_1705_, i_1706_);
	}

	public Class384 method8517() {
		Class185 class185 = method14370(Thread.currentThread());
		return ((Class185) class185).aClass384_2346;
	}

	public Class384 method8571() {
		Class185 class185 = method14370(Thread.currentThread());
		return ((Class185) class185).aClass384_2346;
	}

	public void method8580(Class151 class151) {
		method14363(((HardwareRenderer) this).anIntArray8979 != null, null != ((HardwareRenderer) this).aFloatArray9010, false, class151);
	}

	public Class294 method8626() {
		Class185 class185 = method14370(Thread.currentThread());
		return ((Class185) class185).aClass294_2314;
	}

	public int method8574() {
		return 0;
	}

	public Class282_Sub24 method8508(int i, int i_1709_, int i_1710_, int i_1711_, int i_1712_, float f) {
		return null;
	}

	public Class282_Sub24 method8500(int i, int i_1713_, int i_1714_, int i_1715_, int i_1716_, float f) {
		return null;
	}

	public void fm(int i, int i_1717_, int i_1718_, int i_1719_) {
		if (i < 0)
			i = 0;
		if (i_1717_ < 0)
			i_1717_ = 0;
		if (i_1718_ > 444800403 * ((HardwareRenderer) this).anInt8980)
			i_1718_ = ((HardwareRenderer) this).anInt8980 * 444800403;
		if (i_1719_ > 2138511415 * ((HardwareRenderer) this).anInt8981)
			i_1719_ = 2138511415 * ((HardwareRenderer) this).anInt8981;
		((HardwareRenderer) this).anInt8983 = i * -363774331;
		((HardwareRenderer) this).anInt9002 = i_1718_ * 1714763515;
		((HardwareRenderer) this).anInt9009 = i_1717_ * 1457972577;
		((HardwareRenderer) this).anInt8986 = 760194793 * i_1719_;
		method14364();
	}

	public void method8426(int i, Class282_Sub24[] class282_sub24s) {
		/* empty */
	}

	public void method8579(int i, Class282_Sub24[] class282_sub24s) {
		/* empty */
	}

	public int[] ke(int i, int i_1720_, int i_1721_, int i_1722_) {
		if (((HardwareRenderer) this).anIntArray8979 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_1722_ * i_1721_];
		int i_1723_ = 0;
		for (int i_1724_ = 0; i_1724_ < i_1722_; i_1724_++) {
			int i_1725_ = i + (i_1720_ + i_1724_) * (((HardwareRenderer) this).anInt8980 * 444800403);
			for (int i_1726_ = 0; i_1726_ < i_1721_; i_1726_++)
				is[i_1723_++] = ((HardwareRenderer) this).anIntArray8979[i_1725_ + i_1726_];
		}
		return is;
	}

	public void G(int i, int i_1727_, int i_1728_, int i_1729_, int i_1730_) {
		if (null != ((HardwareRenderer) this).anIntArray8979 && (i >= ((HardwareRenderer) this).anInt8983 * 72550989 && i < ((HardwareRenderer) this).anInt9002 * -1710988237)) {
			if (i_1727_ < ((HardwareRenderer) this).anInt9009 * 1516535457) {
				i_1728_ -= 1516535457 * ((HardwareRenderer) this).anInt9009 - i_1727_;
				i_1727_ = 1516535457 * ((HardwareRenderer) this).anInt9009;
			}
			if (i_1727_ + i_1728_ > ((HardwareRenderer) this).anInt8986 * 1383960921)
				i_1728_ = 1383960921 * ((HardwareRenderer) this).anInt8986 - i_1727_;
			int i_1731_ = i_1727_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
			int i_1732_ = i_1729_ >>> 24;
			if (0 == i_1730_ || i_1730_ == 1 && 255 == i_1732_) {
				for (int i_1733_ = 0; i_1733_ < i_1728_; i_1733_++)
					((HardwareRenderer) this).anIntArray8979[i_1731_ + (((HardwareRenderer) this).anInt8980 * 444800403 * i_1733_)] = i_1729_;
			} else if (i_1730_ == 1) {
				i_1729_ = (((i_1729_ & 0xff00ff) * i_1732_ >> 8 & 0xff00ff) + ((i_1729_ & 0xff00) * i_1732_ >> 8 & 0xff00) + (i_1732_ << 24));
				int i_1734_ = 256 - i_1732_;
				for (int i_1735_ = 0; i_1735_ < i_1728_; i_1735_++) {
					int i_1736_ = i_1731_ + i_1735_ * (((HardwareRenderer) this).anInt8980 * 444800403);
					int i_1737_ = ((HardwareRenderer) this).anIntArray8979[i_1736_];
					i_1737_ = (((i_1737_ & 0xff00ff) * i_1734_ >> 8 & 0xff00ff) + ((i_1737_ & 0xff00) * i_1734_ >> 8 & 0xff00));
					((HardwareRenderer) this).anIntArray8979[i_1736_] = i_1729_ + i_1737_;
				}
			} else if (2 == i_1730_) {
				for (int i_1738_ = 0; i_1738_ < i_1728_; i_1738_++) {
					int i_1739_ = (444800403 * ((HardwareRenderer) this).anInt8980 * i_1738_) + i_1731_;
					int i_1740_ = ((HardwareRenderer) this).anIntArray8979[i_1739_];
					int i_1741_ = i_1740_ + i_1729_;
					int i_1742_ = (i_1729_ & 0xff00ff) + (i_1740_ & 0xff00ff);
					i_1740_ = (i_1742_ & 0x1000100) + (i_1741_ - i_1742_ & 0x10000);
					((HardwareRenderer) this).anIntArray8979[i_1739_] = i_1741_ - i_1740_ | i_1740_ - (i_1740_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	boolean method14403(int i) {
		return (anInterface22_5834.method144(i, -1887414575).aBool2086 || anInterface22_5834.method144(i, -2055266628).aBool2059);
	}

	public void method8430(int i, int i_1743_, int i_1744_, int i_1745_, int i_1746_, int i_1747_) {
		XA(i, i_1743_, i_1744_, i_1746_, i_1747_);
		XA(i, i_1745_ + i_1743_ - 1, i_1744_, i_1746_, i_1747_);
		G(i, i_1743_ + 1, i_1745_ - 2, i_1746_, i_1747_);
		G(i + i_1744_ - 1, 1 + i_1743_, i_1745_ - 2, i_1746_, i_1747_);
	}

	public void method8474() {
		/* empty */
	}

	void method14404(boolean bool, boolean bool_1748_, boolean bool_1749_, Class275_Sub1_Sub1 class275_sub1_sub1, int i, int i_1750_, float f, int i_1751_) {
		int i_1752_ = class275_sub1_sub1.anInt10207;
		int i_1753_ = i_1751_;
		i_1751_ <<= 1;
		if (i_1752_ == -1)
			method14373(bool_1748_, i, i_1750_, f, i_1753_, class275_sub1_sub1.anInt10209, 1);
		else {
			if (i_1752_ != ((HardwareRenderer) this).anInt9015 * -1787613477) {
				NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_1752_);
				if (null == class160) {
					int[] is = method14359(i_1752_);
					if (is != null) {
						int i_1754_ = (method14377(i_1752_) ? 64 : (-1392111239 * ((HardwareRenderer) this).anInt9005));
						class160 = createNativeSprite(is, 0, i_1754_, i_1754_, i_1754_, 1057976864);
						((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_1752_);
					} else
						return;
				}
				((HardwareRenderer) this).anInt9015 = 1591418195 * i_1752_;
				((HardwareRenderer) this).aClass160_8987 = class160;
			}
			i_1751_++;
			((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_1748_, bool_1749_, i - i_1753_, i_1750_ - i_1753_, f, i_1751_, i_1751_, 0, class275_sub1_sub1.anInt10209, 1, 1, false);
		}
	}

	void method14405(boolean bool, boolean bool_1755_, boolean bool_1756_, Class275_Sub1_Sub1 class275_sub1_sub1, int i, int i_1757_, float f, int i_1758_) {
		int i_1759_ = class275_sub1_sub1.anInt10207;
		int i_1760_ = i_1758_;
		i_1758_ <<= 1;
		if (i_1759_ == -1)
			method14373(bool_1755_, i, i_1757_, f, i_1760_, class275_sub1_sub1.anInt10209, 1);
		else {
			if (i_1759_ != ((HardwareRenderer) this).anInt9015 * -1787613477) {
				NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_1759_);
				if (null == class160) {
					int[] is = method14359(i_1759_);
					if (is != null) {
						int i_1761_ = (method14377(i_1759_) ? 64 : (-1392111239 * ((HardwareRenderer) this).anInt9005));
						class160 = createNativeSprite(is, 0, i_1761_, i_1761_, i_1761_, 908080167);
						((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_1759_);
					} else
						return;
				}
				((HardwareRenderer) this).anInt9015 = 1591418195 * i_1759_;
				((HardwareRenderer) this).aClass160_8987 = class160;
			}
			i_1758_++;
			((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_1755_, bool_1756_, i - i_1760_, i_1757_ - i_1760_, f, i_1758_, i_1758_, 0, class275_sub1_sub1.anInt10209, 1, 1, false);
		}
	}

	void method14406(boolean bool, boolean bool_1762_, boolean bool_1763_, Class275_Sub1_Sub1 class275_sub1_sub1, int i, int i_1764_, float f, int i_1765_) {
		int i_1766_ = class275_sub1_sub1.anInt10207;
		int i_1767_ = i_1765_;
		i_1765_ <<= 1;
		if (i_1766_ == -1)
			method14373(bool_1762_, i, i_1764_, f, i_1767_, class275_sub1_sub1.anInt10209, 1);
		else {
			if (i_1766_ != ((HardwareRenderer) this).anInt9015 * -1787613477) {
				NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_1766_);
				if (null == class160) {
					int[] is = method14359(i_1766_);
					if (is != null) {
						int i_1768_ = (method14377(i_1766_) ? 64 : (-1392111239 * ((HardwareRenderer) this).anInt9005));
						class160 = createNativeSprite(is, 0, i_1768_, i_1768_, i_1768_, 226270289);
						((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_1766_);
					} else
						return;
				}
				((HardwareRenderer) this).anInt9015 = 1591418195 * i_1766_;
				((HardwareRenderer) this).aClass160_8987 = class160;
			}
			i_1765_++;
			((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_1762_, bool_1763_, i - i_1767_, i_1764_ - i_1767_, f, i_1765_, i_1765_, 0, class275_sub1_sub1.anInt10209, 1, 1, false);
		}
	}

	public void IA(float f) {
		((HardwareRenderer) this).anInt8992 = -579931197 * (int) (f * 65535.0F);
	}

	void method14407(boolean bool, boolean bool_1769_, boolean bool_1770_, int i, int i_1771_, float f, int i_1772_, int i_1773_, int i_1774_, int i_1775_, int i_1776_, int i_1777_) {
		if (0 != i_1772_ && 0 != i_1773_) {
			if (i_1774_ != 65535) {
				Class169 class169 = anInterface22_5834.method144(i_1774_, -1931241045);
				if (!class169.aBool2056) {
					if (i_1774_ != -1787613477 * ((HardwareRenderer) this).anInt9015) {
						NativeSprite class160 = (NativeSprite) ((HardwareRenderer) this).aClass229_9013.get((long) i_1774_);
						if (null == class160) {
							int[] is = method14359(i_1774_);
							if (null == is)
								return;
							int i_1778_ = (method14377(i_1774_) ? 64 : (((HardwareRenderer) this).anInt9005 * -1392111239));
							class160 = createNativeSprite(is, 0, i_1778_, i_1778_, i_1778_, -2027128261);
							((HardwareRenderer) this).aClass229_9013.put(class160, (long) i_1774_);
						}
						((HardwareRenderer) this).anInt9015 = i_1774_ * 1591418195;
						((HardwareRenderer) this).aClass160_8987 = class160;
					}
					((Class160_Sub1) ((HardwareRenderer) this).aClass160_8987).method14247(bool, bool_1769_, bool_1770_, i - i_1772_, i_1771_ - i_1773_, f, i_1772_ << 1, i_1773_ << 1, i_1776_, i_1775_, i_1777_, 1, 2 != class169.anInt2074 * 1960017665);
					return;
				}
			}
			method14373(bool_1769_, i, i_1771_, f, i_1772_, i_1775_, i_1777_);
		}
	}

	public void method8423(Class294 class294) {
		((HardwareRenderer) this).aClass294_8993 = class294;
		method14374();
	}

	public Class294 method8583() {
		return new Class294(((HardwareRenderer) this).aClass294_8993);
	}

	public int method8566(int i, int i_1779_) {
		i |= 0x20800;
		return i & i_1779_ ^ i_1779_;
	}

	public void method8394(int i, Class282_Sub24[] class282_sub24s) {
		/* empty */
	}

	public int method8567(int i, int i_1780_) {
		i |= 0x20800;
		return i & i_1780_ ^ i_1780_;
	}

	public void method8527(int i, int i_1781_, int i_1782_, int i_1783_, int i_1784_, int i_1785_, int i_1786_, int i_1787_, int i_1788_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			i_1782_ -= i;
			i_1783_ -= i_1781_;
			if (i_1783_ == 0) {
				if (i_1782_ >= 0)
					method14366(i, i_1781_, 1 + i_1782_, i_1784_, i_1785_, i_1786_, i_1787_, i_1788_);
				else {
					int i_1789_ = i_1786_ + i_1787_;
					i_1788_ %= i_1789_;
					i_1788_ = (i_1789_ + i_1786_ - i_1788_ - (1 + -i_1782_) % i_1789_);
					i_1788_ %= i_1789_;
					if (i_1788_ < 0)
						i_1788_ += i_1789_;
					method14366(i + i_1782_, i_1781_, -i_1782_ + 1, i_1784_, i_1785_, i_1786_, i_1787_, i_1788_);
				}
			} else if (0 == i_1782_) {
				if (i_1783_ >= 0)
					method14399(i, i_1781_, 1 + i_1783_, i_1784_, i_1785_, i_1786_, i_1787_, i_1788_);
				else {
					int i_1790_ = i_1787_ + i_1786_;
					i_1788_ %= i_1790_;
					i_1788_ = (i_1786_ + i_1790_ - i_1788_ - (-i_1783_ + 1) % i_1790_);
					i_1788_ %= i_1790_;
					if (i_1788_ < 0)
						i_1788_ += i_1790_;
					method14399(i, i_1781_ + i_1783_, 1 + -i_1783_, i_1784_, i_1785_, i_1786_, i_1787_, i_1788_);
				}
			} else {
				i_1788_ <<= 8;
				i_1786_ <<= 8;
				i_1787_ <<= 8;
				int i_1791_ = i_1787_ + i_1786_;
				i_1788_ %= i_1791_;
				if (i_1782_ + i_1783_ < 0) {
					int i_1792_ = (int) (Math.sqrt((double) (i_1782_ * i_1782_ + i_1783_ * i_1783_)) * 256.0);
					int i_1793_ = i_1792_ % i_1791_;
					i_1788_ = i_1786_ + i_1791_ - i_1788_ - i_1793_;
					i_1788_ %= i_1791_;
					if (i_1788_ < 0)
						i_1788_ += i_1791_;
					i += i_1782_;
					i_1782_ = -i_1782_;
					i_1781_ += i_1783_;
					i_1783_ = -i_1783_;
				}
				if (i_1782_ > i_1783_) {
					i_1781_ <<= 16;
					i_1781_ += 32768;
					i_1783_ <<= 16;
					int i_1794_ = (int) Math.floor((double) i_1783_ / (double) i_1782_ + 0.5);
					i_1782_ += i;
					int i_1795_ = i_1784_ >>> 24;
					int i_1796_ = (int) Math.sqrt((double) ((i_1794_ >> 8) * (i_1794_ >> 8) + 65536));
					if (i_1785_ == 0 || 1 == i_1785_ && i_1795_ == 255) {
						while (i <= i_1782_) {
							int i_1797_ = i_1781_ >> 16;
							if (i >= (72550989 * ((HardwareRenderer) this).anInt8983) && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1797_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1797_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1788_ < i_1786_)
								((HardwareRenderer) this).anIntArray8979[i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1797_)] = i_1784_;
							i_1781_ += i_1794_;
							i++;
							i_1788_ += i_1796_;
							i_1788_ %= i_1791_;
						}
					} else if (1 == i_1785_) {
						i_1784_ = ((i_1795_ << 24) + (((i_1784_ & 0xff00) * i_1795_ >> 8 & 0xff00) + (i_1795_ * (i_1784_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1798_ = 256 - i_1795_;
						while (i <= i_1782_) {
							int i_1799_ = i_1781_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1799_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1799_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1788_ < i_1786_) {
								int i_1800_ = ((i_1799_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1801_ = (((HardwareRenderer) this).anIntArray8979[i_1800_]);
								i_1801_ = (((i_1801_ & 0xff00ff) * i_1798_ >> 8 & 0xff00ff) + (i_1798_ * (i_1801_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1800_] = i_1801_ + i_1784_;
							}
							i_1781_ += i_1794_;
							i++;
							i_1788_ += i_1796_;
							i_1788_ %= i_1791_;
						}
					} else if (i_1785_ == 2) {
						while (i <= i_1782_) {
							int i_1802_ = i_1781_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1802_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1802_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1788_ < i_1786_) {
								int i_1803_ = i + i_1802_ * (444800403 * (((HardwareRenderer) this).anInt8980));
								int i_1804_ = (((HardwareRenderer) this).anIntArray8979[i_1803_]);
								int i_1805_ = i_1804_ + i_1784_;
								int i_1806_ = ((i_1804_ & 0xff00ff) + (i_1784_ & 0xff00ff));
								i_1804_ = ((i_1806_ & 0x1000100) + (i_1805_ - i_1806_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1803_] = i_1805_ - i_1804_ | i_1804_ - (i_1804_ >>> 8);
							}
							i_1781_ += i_1794_;
							i++;
							i_1788_ += i_1796_;
							i_1788_ %= i_1791_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1782_ <<= 16;
					int i_1807_ = (int) Math.floor((double) i_1782_ / (double) i_1783_ + 0.5);
					i_1783_ += i_1781_;
					int i_1808_ = i_1784_ >>> 24;
					int i_1809_ = (int) Math.sqrt((double) ((i_1807_ >> 8) * (i_1807_ >> 8) + 65536));
					if (0 == i_1785_ || 1 == i_1785_ && i_1808_ == 255) {
						while (i_1781_ <= i_1783_) {
							int i_1810_ = i >> 16;
							if (i_1781_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1781_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1810_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1810_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1788_ < i_1786_)
								((HardwareRenderer) this).anIntArray8979[i_1810_ + i_1781_ * (((HardwareRenderer) this).anInt8980 * 444800403)] = i_1784_;
							i += i_1807_;
							i_1781_++;
							i_1788_ += i_1809_;
							i_1788_ %= i_1791_;
						}
					} else if (i_1785_ == 1) {
						i_1784_ = ((i_1808_ << 24) + (((i_1784_ & 0xff00ff) * i_1808_ >> 8 & 0xff00ff) + ((i_1784_ & 0xff00) * i_1808_ >> 8 & 0xff00)));
						int i_1811_ = 256 - i_1808_;
						while (i_1781_ <= i_1783_) {
							int i_1812_ = i >> 16;
							if (i_1781_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1781_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1812_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1812_ < -1710988237 * ((HardwareRenderer) this).anInt9002 && i_1788_ < i_1786_) {
								int i_1813_ = ((i_1781_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1812_);
								int i_1814_ = (((HardwareRenderer) this).anIntArray8979[i_1813_]);
								i_1814_ = ((i_1811_ * (i_1814_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1814_ & 0xff00) * i_1811_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(i_1812_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1781_))] = i_1814_ + i_1784_;
							}
							i += i_1807_;
							i_1781_++;
							i_1788_ += i_1809_;
							i_1788_ %= i_1791_;
						}
					} else if (2 == i_1785_) {
						while (i_1781_ <= i_1783_) {
							int i_1815_ = i >> 16;
							if (i_1781_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1781_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1815_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1815_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1788_ < i_1786_) {
								int i_1816_ = ((i_1781_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1815_);
								int i_1817_ = (((HardwareRenderer) this).anIntArray8979[i_1816_]);
								int i_1818_ = i_1817_ + i_1784_;
								int i_1819_ = ((i_1784_ & 0xff00ff) + (i_1817_ & 0xff00ff));
								i_1817_ = ((i_1819_ & 0x1000100) + (i_1818_ - i_1819_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1816_] = i_1818_ - i_1817_ | i_1817_ - (i_1817_ >>> 8);
							}
							i += i_1807_;
							i_1781_++;
							i_1788_ += i_1809_;
							i_1788_ %= i_1791_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void r(int i, int i_1820_, int i_1821_, int i_1822_) {
		if (i < 0)
			i = 0;
		if (i_1820_ < 0)
			i_1820_ = 0;
		if (i_1821_ > 444800403 * ((HardwareRenderer) this).anInt8980)
			i_1821_ = ((HardwareRenderer) this).anInt8980 * 444800403;
		if (i_1822_ > 2138511415 * ((HardwareRenderer) this).anInt8981)
			i_1822_ = 2138511415 * ((HardwareRenderer) this).anInt8981;
		((HardwareRenderer) this).anInt8983 = i * -363774331;
		((HardwareRenderer) this).anInt9002 = i_1821_ * 1714763515;
		((HardwareRenderer) this).anInt9009 = i_1820_ * 1457972577;
		((HardwareRenderer) this).anInt8986 = 760194793 * i_1822_;
		method14364();
	}

	public Class384 method8589() {
		return new Class384(((HardwareRenderer) this).aClass384_8995);
	}

	public Class152 method8467(Class152 class152, Class152 class152_1823_, float f, Class152 class152_1824_) {
		return null;
	}

	public void iz(float f) {
		((HardwareRenderer) this).anInt8992 = -579931197 * (int) (f * 65535.0F);
	}

	public void in(float f) {
		((HardwareRenderer) this).anInt8992 = -579931197 * (int) (f * 65535.0F);
	}

	boolean method14408() {
		return ((HardwareRenderer) this).aBool9014;
	}

	public void im(int i, float f, float f_1825_, float f_1826_, float f_1827_, float f_1828_) {
		((HardwareRenderer) this).anInt8990 = (int) (65535.0F * f) * 1216319887;
		((HardwareRenderer) this).anInt8991 = -1460403627 * (int) (65535.0F * f_1825_);
		float f_1829_ = (float) Math.sqrt((double) (f_1828_ * f_1828_ + (f_1827_ * f_1827_ + f_1826_ * f_1826_)));
		((HardwareRenderer) this).anInt9011 = (int) (f_1826_ * 65535.0F / f_1829_) * 672118063;
		((HardwareRenderer) this).anInt8988 = (int) (65535.0F * f_1827_ / f_1829_) * -1077609237;
		((HardwareRenderer) this).anInt9007 = 1394142547 * (int) (f_1828_ * 65535.0F / f_1829_);
	}

	public void iq(int i) {
		/* empty */
	}

	public void il(int i) {
		/* empty */
	}

	public void ii(int i) {
		/* empty */
	}

	public void is(int i, int i_1830_, int i_1831_) {
		for (int i_1832_ = 0; i_1832_ < ((HardwareRenderer) this).aClass185Array8984.length; i_1832_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_1832_];
			((Class185) class185).anInt2307 = (i & 0xffffff) * -1172711273;
			int i_1833_ = ((Class185) class185).anInt2307 * 1402414887 >>> 16 & 0xff;
			if (i_1833_ < 2)
				i_1833_ = 2;
			int i_1834_ = 1402414887 * ((Class185) class185).anInt2307 >> 8 & 0xff;
			if (i_1834_ < 2)
				i_1834_ = 2;
			int i_1835_ = 1402414887 * ((Class185) class185).anInt2307 & 0xff;
			if (i_1835_ < 2)
				i_1835_ = 2;
			((Class185) class185).anInt2307 = -1172711273 * (i_1833_ << 16 | i_1834_ << 8 | i_1835_);
			if (i_1830_ < 0)
				((Class185) class185).aBool2304 = false;
			else
				((Class185) class185).aBool2304 = true;
		}
	}

	public void method8435(int i, int i_1836_, int i_1837_, int i_1838_, int i_1839_, int i_1840_, int i_1841_, int i_1842_, int i_1843_) {
		if (null != ((HardwareRenderer) this).anIntArray8979) {
			i_1837_ -= i;
			i_1838_ -= i_1836_;
			if (i_1838_ == 0) {
				if (i_1837_ >= 0)
					method14366(i, i_1836_, 1 + i_1837_, i_1839_, i_1840_, i_1841_, i_1842_, i_1843_);
				else {
					int i_1844_ = i_1841_ + i_1842_;
					i_1843_ %= i_1844_;
					i_1843_ = (i_1844_ + i_1841_ - i_1843_ - (1 + -i_1837_) % i_1844_);
					i_1843_ %= i_1844_;
					if (i_1843_ < 0)
						i_1843_ += i_1844_;
					method14366(i + i_1837_, i_1836_, -i_1837_ + 1, i_1839_, i_1840_, i_1841_, i_1842_, i_1843_);
				}
			} else if (0 == i_1837_) {
				if (i_1838_ >= 0)
					method14399(i, i_1836_, 1 + i_1838_, i_1839_, i_1840_, i_1841_, i_1842_, i_1843_);
				else {
					int i_1845_ = i_1842_ + i_1841_;
					i_1843_ %= i_1845_;
					i_1843_ = (i_1841_ + i_1845_ - i_1843_ - (-i_1838_ + 1) % i_1845_);
					i_1843_ %= i_1845_;
					if (i_1843_ < 0)
						i_1843_ += i_1845_;
					method14399(i, i_1836_ + i_1838_, 1 + -i_1838_, i_1839_, i_1840_, i_1841_, i_1842_, i_1843_);
				}
			} else {
				i_1843_ <<= 8;
				i_1841_ <<= 8;
				i_1842_ <<= 8;
				int i_1846_ = i_1842_ + i_1841_;
				i_1843_ %= i_1846_;
				if (i_1837_ + i_1838_ < 0) {
					int i_1847_ = (int) (Math.sqrt((double) (i_1837_ * i_1837_ + i_1838_ * i_1838_)) * 256.0);
					int i_1848_ = i_1847_ % i_1846_;
					i_1843_ = i_1841_ + i_1846_ - i_1843_ - i_1848_;
					i_1843_ %= i_1846_;
					if (i_1843_ < 0)
						i_1843_ += i_1846_;
					i += i_1837_;
					i_1837_ = -i_1837_;
					i_1836_ += i_1838_;
					i_1838_ = -i_1838_;
				}
				if (i_1837_ > i_1838_) {
					i_1836_ <<= 16;
					i_1836_ += 32768;
					i_1838_ <<= 16;
					int i_1849_ = (int) Math.floor((double) i_1838_ / (double) i_1837_ + 0.5);
					i_1837_ += i;
					int i_1850_ = i_1839_ >>> 24;
					int i_1851_ = (int) Math.sqrt((double) ((i_1849_ >> 8) * (i_1849_ >> 8) + 65536));
					if (i_1840_ == 0 || 1 == i_1840_ && i_1850_ == 255) {
						while (i <= i_1837_) {
							int i_1852_ = i_1836_ >> 16;
							if (i >= (72550989 * ((HardwareRenderer) this).anInt8983) && i < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1852_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1852_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1843_ < i_1841_)
								((HardwareRenderer) this).anIntArray8979[i + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1852_)] = i_1839_;
							i_1836_ += i_1849_;
							i++;
							i_1843_ += i_1851_;
							i_1843_ %= i_1846_;
						}
					} else if (1 == i_1840_) {
						i_1839_ = ((i_1850_ << 24) + (((i_1839_ & 0xff00) * i_1850_ >> 8 & 0xff00) + (i_1850_ * (i_1839_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1853_ = 256 - i_1850_;
						while (i <= i_1837_) {
							int i_1854_ = i_1836_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1854_ >= 1516535457 * ((HardwareRenderer) this).anInt9009 && i_1854_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1843_ < i_1841_) {
								int i_1855_ = ((i_1854_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i);
								int i_1856_ = (((HardwareRenderer) this).anIntArray8979[i_1855_]);
								i_1856_ = (((i_1856_ & 0xff00ff) * i_1853_ >> 8 & 0xff00ff) + (i_1853_ * (i_1856_ & 0xff00) >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[i_1855_] = i_1856_ + i_1839_;
							}
							i_1836_ += i_1849_;
							i++;
							i_1843_ += i_1851_;
							i_1843_ %= i_1846_;
						}
					} else if (i_1840_ == 2) {
						while (i <= i_1837_) {
							int i_1857_ = i_1836_ >> 16;
							if (i >= (((HardwareRenderer) this).anInt8983 * 72550989) && i < (-1710988237 * ((HardwareRenderer) this).anInt9002) && i_1857_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1857_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1843_ < i_1841_) {
								int i_1858_ = i + i_1857_ * (444800403 * (((HardwareRenderer) this).anInt8980));
								int i_1859_ = (((HardwareRenderer) this).anIntArray8979[i_1858_]);
								int i_1860_ = i_1859_ + i_1839_;
								int i_1861_ = ((i_1859_ & 0xff00ff) + (i_1839_ & 0xff00ff));
								i_1859_ = ((i_1861_ & 0x1000100) + (i_1860_ - i_1861_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1858_] = i_1860_ - i_1859_ | i_1859_ - (i_1859_ >>> 8);
							}
							i_1836_ += i_1849_;
							i++;
							i_1843_ += i_1851_;
							i_1843_ %= i_1846_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1837_ <<= 16;
					int i_1862_ = (int) Math.floor((double) i_1837_ / (double) i_1838_ + 0.5);
					i_1838_ += i_1836_;
					int i_1863_ = i_1839_ >>> 24;
					int i_1864_ = (int) Math.sqrt((double) ((i_1862_ >> 8) * (i_1862_ >> 8) + 65536));
					if (0 == i_1840_ || 1 == i_1840_ && i_1863_ == 255) {
						while (i_1836_ <= i_1838_) {
							int i_1865_ = i >> 16;
							if (i_1836_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1836_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1865_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1865_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1843_ < i_1841_)
								((HardwareRenderer) this).anIntArray8979[i_1865_ + i_1836_ * (((HardwareRenderer) this).anInt8980 * 444800403)] = i_1839_;
							i += i_1862_;
							i_1836_++;
							i_1843_ += i_1864_;
							i_1843_ %= i_1846_;
						}
					} else if (i_1840_ == 1) {
						i_1839_ = ((i_1863_ << 24) + (((i_1839_ & 0xff00ff) * i_1863_ >> 8 & 0xff00ff) + ((i_1839_ & 0xff00) * i_1863_ >> 8 & 0xff00)));
						int i_1866_ = 256 - i_1863_;
						while (i_1836_ <= i_1838_) {
							int i_1867_ = i >> 16;
							if (i_1836_ >= (((HardwareRenderer) this).anInt9009 * 1516535457) && i_1836_ < (((HardwareRenderer) this).anInt8986 * 1383960921) && i_1867_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1867_ < -1710988237 * ((HardwareRenderer) this).anInt9002 && i_1843_ < i_1841_) {
								int i_1868_ = ((i_1836_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1867_);
								int i_1869_ = (((HardwareRenderer) this).anIntArray8979[i_1868_]);
								i_1869_ = ((i_1866_ * (i_1869_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1869_ & 0xff00) * i_1866_ >> 8 & 0xff00));
								((HardwareRenderer) this).anIntArray8979[(i_1867_ + (444800403 * ((HardwareRenderer) this).anInt8980 * i_1836_))] = i_1869_ + i_1839_;
							}
							i += i_1862_;
							i_1836_++;
							i_1843_ += i_1864_;
							i_1843_ %= i_1846_;
						}
					} else if (2 == i_1840_) {
						while (i_1836_ <= i_1838_) {
							int i_1870_ = i >> 16;
							if (i_1836_ >= (1516535457 * ((HardwareRenderer) this).anInt9009) && i_1836_ < 1383960921 * ((HardwareRenderer) this).anInt8986 && i_1870_ >= (((HardwareRenderer) this).anInt8983 * 72550989) && i_1870_ < (((HardwareRenderer) this).anInt9002 * -1710988237) && i_1843_ < i_1841_) {
								int i_1871_ = ((i_1836_ * (((HardwareRenderer) this).anInt8980 * 444800403)) + i_1870_);
								int i_1872_ = (((HardwareRenderer) this).anIntArray8979[i_1871_]);
								int i_1873_ = i_1872_ + i_1839_;
								int i_1874_ = ((i_1839_ & 0xff00ff) + (i_1872_ & 0xff00ff));
								i_1872_ = ((i_1874_ & 0x1000100) + (i_1873_ - i_1874_ & 0x10000));
								((HardwareRenderer) this).anIntArray8979[i_1871_] = i_1873_ - i_1872_ | i_1872_ - (i_1872_ >>> 8);
							}
							i += i_1862_;
							i_1836_++;
							i_1843_ += i_1864_;
							i_1843_ %= i_1846_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void ib(int i, int i_1875_, int i_1876_) {
		for (int i_1877_ = 0; i_1877_ < ((HardwareRenderer) this).aClass185Array8984.length; i_1877_++) {
			Class185 class185 = ((HardwareRenderer) this).aClass185Array8984[i_1877_];
			((Class185) class185).anInt2307 = (i & 0xffffff) * -1172711273;
			int i_1878_ = ((Class185) class185).anInt2307 * 1402414887 >>> 16 & 0xff;
			if (i_1878_ < 2)
				i_1878_ = 2;
			int i_1879_ = 1402414887 * ((Class185) class185).anInt2307 >> 8 & 0xff;
			if (i_1879_ < 2)
				i_1879_ = 2;
			int i_1880_ = 1402414887 * ((Class185) class185).anInt2307 & 0xff;
			if (i_1880_ < 2)
				i_1880_ = 2;
			((Class185) class185).anInt2307 = -1172711273 * (i_1878_ << 16 | i_1879_ << 8 | i_1880_);
			if (i_1875_ < 0)
				((Class185) class185).aBool2304 = false;
			else
				((Class185) class185).aBool2304 = true;
		}
	}

	public Class282_Sub24 method8593(int i, int i_1881_, int i_1882_, int i_1883_, int i_1884_, float f) {
		return null;
	}

	public void method8595(boolean bool) {
		((HardwareRenderer) this).aBool8997 = bool;
		((HardwareRenderer) this).aClass229_9006.method3859(-1919539148);
	}

	public Class152 method8557(Class152 class152, Class152 class152_1885_, float f, Class152 class152_1886_) {
		return null;
	}

	public void method8584(Class152 class152) {
		/* empty */
	}

	public boolean method8469() {
		return false;
	}

	public boolean method8628() {
		return false;
	}

	public void method8602() {
		/* empty */
	}

	public Class294 method8572() {
		Class185 class185 = method14370(Thread.currentThread());
		return ((Class185) class185).aClass294_2314;
	}

	public Class455 method8556(int i, int i_1887_, int[] is, int[] is_1888_) {
		return new PacketsDecoder(i, i_1887_, is, is_1888_);
	}

	public NativeSprite method8604(int i, int i_1889_, int i_1890_, int i_1891_, boolean bool) {
		if (null == ((HardwareRenderer) this).anIntArray8979)
			throw new IllegalStateException("");
		int[] is = new int[i_1890_ * i_1891_];
		int i_1892_ = i_1889_ * (((HardwareRenderer) this).anInt8980 * 444800403) + i;
		int i_1893_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i_1890_;
		for (int i_1894_ = 0; i_1894_ < i_1891_; i_1894_++) {
			int i_1895_ = i_1894_ * i_1890_;
			for (int i_1896_ = 0; i_1896_ < i_1890_; i_1896_++)
				is[i_1895_ + i_1896_] = ((HardwareRenderer) this).anIntArray8979[i_1892_++];
			i_1892_ += i_1893_;
		}
		if (bool)
			return new Class160_Sub1_Sub3(this, is, i_1890_, i_1891_);
		return new Class160_Sub1_Sub1(this, is, i_1890_, i_1891_);
	}

	public boolean method8679() {
		return false;
	}

	public boolean method8649() {
		return false;
	}

	public boolean method8606() {
		return false;
	}

	public boolean method8607() {
		return false;
	}

	void method8608(float f, float f_1897_, float f_1898_, float f_1899_, float f_1900_, float f_1901_) {
		/* empty */
	}

	public int method8452(int i, int i_1902_) {
		i |= 0x20800;
		return i & i_1902_ ^ i_1902_;
	}

	public void method8603(int i, int i_1903_, int i_1904_, int i_1905_) {
		/* empty */
	}

	public int za() {
		return 0;
	}

	public void method8594(boolean bool) {
		((HardwareRenderer) this).aBool8997 = bool;
		((HardwareRenderer) this).aClass229_9006.method3859(586880417);
	}

	public void method8613() {
		/* empty */
	}

	public void method8585(int i, Class90 class90) {
		for (int i_1906_ = 0; i_1906_ < ((HardwareRenderer) this).aClass185Array8984.length; i_1906_++) {
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_1906_]).anInt2336 = ((Class185) (((HardwareRenderer) this).aClass185Array8984[i_1906_])).anInt2307 * 521028353;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_1906_]).anInt2306 = i * 473039441;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_1906_]).anInt2307 = 275882609 * class90.anInt946;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_1906_]).anInt2313 = 1456783305 * class90.anInt945;
			((Class185) ((HardwareRenderer) this).aClass185Array8984[i_1906_]).aBool2309 = true;
		}
	}

	public void method8615(int i, Class90 class90) {
		Class185 class185 = method14370(Thread.currentThread());
		((Class185) class185).anInt2306 = 473039441 * i;
		((Class185) class185).anInt2307 = 275882609 * class90.anInt946;
		((Class185) class185).anInt2313 = class90.anInt945 * 1456783305;
	}

	public void method8616(int i, Class90 class90) {
		Class185 class185 = method14370(Thread.currentThread());
		((Class185) class185).anInt2306 = 473039441 * i;
		((Class185) class185).anInt2307 = 275882609 * class90.anInt946;
		((Class185) class185).anInt2313 = class90.anInt945 * 1456783305;
	}

	public void method8488(int i) {
		int i_1907_ = i - 1426154545 * ((HardwareRenderer) this).anInt8977;
		for (Class282_Sub27 class282_sub27 = (Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.method3866(514216110); null != class282_sub27; class282_sub27 = (Class282_Sub27) ((HardwareRenderer) this).aClass229_9006.method3867(297413420)) {
			if (((Class282_Sub27) class282_sub27).aBool7693) {
				((Class282_Sub27) class282_sub27).anInt7692 += i_1907_;
				int i_1908_ = ((Class282_Sub27) class282_sub27).anInt7692 / 50;
				if (i_1908_ > 0) {
					Class169 class169 = anInterface22_5834.method144((((Class282_Sub27) class282_sub27).anInt7695), -1956198689);
					float f = class169.aBool2065 ? 64.0F : 128.0F;
					class282_sub27.method12403((int) (f * ((float) class169.aByte2081 * ((float) i_1907_ / 1000.0F) / 64.0F)), (int) ((float) class169.aByte2090 * ((float) i_1907_ / 1000.0F) / 64.0F * f));
					((Class282_Sub27) class282_sub27).anInt7692 -= 50 * i_1908_;
				}
				((Class282_Sub27) class282_sub27).aBool7693 = false;
			}
		}
		((HardwareRenderer) this).anInt8977 = -987269935 * i;
		((HardwareRenderer) this).aClass229_9013.method3858(5, (byte) -94);
		((HardwareRenderer) this).aClass229_9006.method3858(5, (byte) 3);
	}

	public void method8573(float f, float f_1909_, float f_1910_, float[] fs) {
		float f_1911_ = ((f_1910_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * f_1909_) + (f * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15]))));
		float f_1912_ = ((f_1909_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8] * f_1910_));
		float f_1913_ = ((f_1909_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (f_1910_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		float f_1914_ = ((f_1910_ * ((HardwareRenderer) this).aClass384_8994.aFloatArray4667[10]) + ((((HardwareRenderer) this).aClass384_8994.aFloatArray4667[6] * f_1909_) + (f * (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[2]) + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[14]))));
		fs[0] = (((HardwareRenderer) this).aFloat9003 + f_1912_ * ((HardwareRenderer) this).aFloat8976 / f_1911_);
		fs[1] = (((HardwareRenderer) this).aFloat8982 + f_1913_ * ((HardwareRenderer) this).aFloat9004 / f_1911_);
		fs[2] = f_1914_;
	}

	public void method8650(float f, float f_1915_, float f_1916_, float[] fs) {
		float f_1917_ = ((f_1916_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * f_1915_) + (f * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15]))));
		float f_1918_ = ((f_1915_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8] * f_1916_));
		float f_1919_ = ((f_1915_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (f_1916_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]));
		float f_1920_ = ((f_1916_ * ((HardwareRenderer) this).aClass384_8994.aFloatArray4667[10]) + ((((HardwareRenderer) this).aClass384_8994.aFloatArray4667[6] * f_1915_) + (f * (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[2]) + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[14]))));
		fs[0] = (((HardwareRenderer) this).aFloat9003 + f_1918_ * ((HardwareRenderer) this).aFloat8976 / f_1917_);
		fs[1] = (((HardwareRenderer) this).aFloat8982 + f_1919_ * ((HardwareRenderer) this).aFloat9004 / f_1917_);
		fs[2] = f_1920_;
	}

	public void method8619(float f, float f_1921_, float f_1922_, float[] fs) {
		float f_1923_ = ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[10] * f_1922_) + (f * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[2] + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[14] + f_1921_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[6])));
		float f_1924_ = (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[3] * f + ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[15] + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[7] * f_1921_) + f_1922_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[11]));
		if (f_1923_ < -f_1924_ || f_1923_ > f_1924_) {
			float[] fs_1925_ = fs;
			float[] fs_1926_ = fs;
			fs[2] = Float.NaN;
			fs_1926_[1] = Float.NaN;
			fs_1925_[0] = Float.NaN;
		} else {
			float f_1927_ = ((f_1921_ * ((HardwareRenderer) this).aClass384_8996.aFloatArray4667[4]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[12] + f * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[0])) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[8] * f_1922_));
			if (f_1927_ < -f_1924_ || f_1927_ > f_1924_) {
				float[] fs_1928_ = fs;
				float[] fs_1929_ = fs;
				fs[2] = Float.NaN;
				fs_1929_[1] = Float.NaN;
				fs_1928_[0] = Float.NaN;
			} else {
				float f_1930_ = (f_1922_ * (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[9]) + ((((HardwareRenderer) this).aClass384_8996.aFloatArray4667[13]) + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[1]) * f + (((HardwareRenderer) this).aClass384_8996.aFloatArray4667[5]) * f_1921_));
				if (f_1930_ < -f_1924_ || f_1930_ > f_1924_) {
					float[] fs_1931_ = fs;
					float[] fs_1932_ = fs;
					fs[2] = Float.NaN;
					fs_1932_[1] = Float.NaN;
					fs_1931_[0] = Float.NaN;
				} else {
					float f_1933_ = ((((HardwareRenderer) this).aClass384_8994.aFloatArray4667[14]) + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[2]) * f + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[6]) * f_1921_ + (((HardwareRenderer) this).aClass384_8994.aFloatArray4667[10]) * f_1922_);
					fs[0] = (((HardwareRenderer) this).aFloat9003 + (f_1927_ * ((HardwareRenderer) this).aFloat8976 / f_1924_));
					fs[1] = (f_1930_ * ((HardwareRenderer) this).aFloat9004 / f_1924_) + ((HardwareRenderer) this).aFloat8982;
					fs[2] = f_1933_;
				}
			}
		}
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub2(this);
	}

	public Interface8 method8621(int i, int i_1934_) {
		return new Class125(i, i_1934_);
	}

	public boolean method8609() {
		return true;
	}

	public void ft(int[] is) {
		is[0] = ((HardwareRenderer) this).anInt8983 * 72550989;
		is[1] = ((HardwareRenderer) this).anInt9009 * 1516535457;
		is[2] = -1710988237 * ((HardwareRenderer) this).anInt9002;
		is[3] = 1383960921 * ((HardwareRenderer) this).anInt8986;
	}

	void method14409(int i) {
		((HardwareRenderer) this).aClass185Array8984[i].method3070(Thread.currentThread(), 1036854416);
	}

	public int[] kf(int i, int i_1935_, int i_1936_, int i_1937_) {
		if (((HardwareRenderer) this).anIntArray8979 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_1937_ * i_1936_];
		int i_1938_ = 0;
		for (int i_1939_ = 0; i_1939_ < i_1937_; i_1939_++) {
			int i_1940_ = i + (i_1935_ + i_1939_) * (((HardwareRenderer) this).anInt8980 * 444800403);
			for (int i_1941_ = 0; i_1941_ < i_1936_; i_1941_++)
				is[i_1938_++] = ((HardwareRenderer) this).anIntArray8979[i_1940_ + i_1941_];
		}
		return is;
	}

	public void method8627(int i, int i_1942_, float f, int i_1943_, int i_1944_, float f_1945_, int i_1946_, int i_1947_, float f_1948_, int i_1949_, int i_1950_, int i_1951_, int i_1952_) {
		boolean bool = ((HardwareRenderer) this).anIntArray8979 != null;
		boolean bool_1953_ = ((HardwareRenderer) this).aFloatArray9010 != null;
		if (bool || bool_1953_) {
			Class185 class185 = method14370(Thread.currentThread());
			Class144 class144 = ((Class185) class185).aClass144_2310;
			((Class144) class144).aBool1675 = false;
			i -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_1943_ -= 72550989 * ((HardwareRenderer) this).anInt8983;
			i_1946_ -= ((HardwareRenderer) this).anInt8983 * 72550989;
			i_1942_ -= ((HardwareRenderer) this).anInt9009 * 1516535457;
			i_1944_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			i_1947_ -= 1516535457 * ((HardwareRenderer) this).anInt9009;
			((Class144) class144).aBool1708 = (i < 0 || i > ((Class144) class144).anInt1684 || i_1943_ < 0 || i_1943_ > ((Class144) class144).anInt1684 || i_1946_ < 0 || i_1946_ > ((Class144) class144).anInt1684);
			int i_1954_ = i_1949_ >>> 24;
			if (0 == i_1952_ || 1 == i_1952_ && i_1954_ == 255) {
				((Class144) class144).anInt1674 = 0;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_1953_, false, (float) i_1942_, (float) i_1944_, (float) i_1947_, (float) i, (float) i_1943_, (float) i_1946_, f, f_1945_, f_1948_, i_1949_, i_1950_, i_1951_);
			} else if (1 == i_1952_) {
				((Class144) class144).anInt1674 = 255 - i_1954_;
				((Class144) class144).aBool1672 = false;
				class144.method2425(bool, bool_1953_, false, (float) i_1942_, (float) i_1944_, (float) i_1947_, (float) i, (float) i_1943_, (float) i_1946_, f, f_1945_, f_1948_, i_1949_, i_1950_, i_1951_);
			} else if (i_1952_ == 2) {
				((Class144) class144).anInt1674 = 128;
				((Class144) class144).aBool1672 = true;
				class144.method2425(bool, bool_1953_, false, (float) i_1942_, (float) i_1944_, (float) i_1947_, (float) i, (float) i_1943_, (float) i_1946_, f, f_1945_, f_1948_, i_1949_, i_1950_, i_1951_);
			} else
				throw new IllegalArgumentException();
			((Class144) class144).aBool1675 = true;
		}
	}

	public void hz(int i, Class455 class455, int i_1955_, int i_1956_) {
		if (((HardwareRenderer) this).anIntArray8979 != null) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			int[] is = ((PacketsDecoder) class455_sub3).anIntArray9077;
			int[] is_1957_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
			int i_1958_;
			if (((HardwareRenderer) this).anInt8986 * 1383960921 < i_1956_ + is.length)
				i_1958_ = ((HardwareRenderer) this).anInt8986 * 1383960921 - i_1956_;
			else
				i_1958_ = is.length;
			int i_1959_;
			if (((HardwareRenderer) this).anInt9009 * 1516535457 > i_1956_) {
				i_1959_ = 1516535457 * ((HardwareRenderer) this).anInt9009 - i_1956_;
				i_1956_ = ((HardwareRenderer) this).anInt9009 * 1516535457;
			} else
				i_1959_ = 0;
			if (i_1958_ - i_1959_ > 0) {
				int i_1960_ = 444800403 * ((HardwareRenderer) this).anInt8980 * i_1956_;
				for (int i_1961_ = i_1959_; i_1961_ < i_1958_; i_1961_++) {
					int i_1962_ = is[i_1961_] + i_1955_;
					int i_1963_ = is_1957_[i_1961_];
					if (((HardwareRenderer) this).anInt8983 * 72550989 > i_1962_) {
						i_1963_ -= (72550989 * ((HardwareRenderer) this).anInt8983 - i_1962_);
						i_1962_ = ((HardwareRenderer) this).anInt8983 * 72550989;
					}
					if (-1710988237 * ((HardwareRenderer) this).anInt9002 < i_1963_ + i_1962_)
						i_1963_ = (-1710988237 * ((HardwareRenderer) this).anInt9002 - i_1962_);
					i_1962_ += i_1960_;
					for (int i_1964_ = -i_1963_; i_1964_ < 0; i_1964_++)
						((HardwareRenderer) this).anIntArray8979[i_1962_++] = i;
					i_1960_ += ((HardwareRenderer) this).anInt8980 * 444800403;
				}
			}
		}
	}

	void method14410() {
		if (((HardwareRenderer) this).aFloatArray9010 != null) {
			if (72550989 * ((HardwareRenderer) this).anInt8983 == 0 && (((HardwareRenderer) this).anInt9002 * -1710988237 == ((HardwareRenderer) this).anInt8980 * 444800403) && ((HardwareRenderer) this).anInt9009 * 1516535457 == 0 && (((HardwareRenderer) this).anInt8986 * 1383960921 == 2138511415 * ((HardwareRenderer) this).anInt8981)) {
				int i = ((HardwareRenderer) this).aFloatArray9010.length;
				int i_1965_ = i - (i & 0x7);
				int i_1966_ = 0;
				while (i_1966_ < i_1965_) {
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
				}
				while (i_1966_ < i)
					((HardwareRenderer) this).aFloatArray9010[i_1966_++] = 2.14748365E9F;
			} else {
				int i = (((HardwareRenderer) this).anInt9002 * -1710988237 - ((HardwareRenderer) this).anInt8983 * 72550989);
				int i_1967_ = (((HardwareRenderer) this).anInt8986 * 1383960921 - 1516535457 * ((HardwareRenderer) this).anInt9009);
				int i_1968_ = 444800403 * ((HardwareRenderer) this).anInt8980 - i;
				int i_1969_ = ((444800403 * ((HardwareRenderer) this).anInt8980 * (1516535457 * ((HardwareRenderer) this).anInt9009)) + 72550989 * ((HardwareRenderer) this).anInt8983);
				int i_1970_ = i >> 3;
				int i_1971_ = i & 0x7;
				i = i_1969_ - 1;
				for (int i_1972_ = -i_1967_; i_1972_ < 0; i_1972_++) {
					if (i_1970_ > 0) {
						int i_1973_ = i_1970_;
						do {
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
						} while (--i_1973_ > 0);
					}
					if (i_1971_ > 0) {
						int i_1974_ = i_1971_;
						do
							((HardwareRenderer) this).aFloatArray9010[++i] = 2.14748365E9F;
						while (--i_1974_ > 0);
					}
					i += i_1968_;
				}
			}
		}
	}

	public int method8630(int i, int i_1975_) {
		return i | i_1975_;
	}

	public int method8434(int i, int i_1976_) {
		return i | i_1976_;
	}

	public int method8632(int i, int i_1977_) {
		return i | i_1977_;
	}

	public void method8633() {
		((HardwareRenderer) this).anInt8998 = 0;
		((HardwareRenderer) this).anInt8999 = 0;
		((HardwareRenderer) this).anInt9000 = ((HardwareRenderer) this).anInt8980 * -50906609;
		((HardwareRenderer) this).anInt9001 = ((HardwareRenderer) this).anInt8981 * 651224101;
		method14364();
	}

	public void method8482(int[] is) {
		is[0] = 444800403 * ((HardwareRenderer) this).anInt8980;
		is[1] = ((HardwareRenderer) this).anInt8981 * 2138511415;
	}

	public void method8635() {
		((HardwareRenderer) this).anInt8998 = 0;
		((HardwareRenderer) this).anInt8999 = 0;
		((HardwareRenderer) this).anInt9000 = ((HardwareRenderer) this).anInt8980 * -50906609;
		((HardwareRenderer) this).anInt9001 = ((HardwareRenderer) this).anInt8981 * 651224101;
		method14364();
	}

	public int di() {
		return 0;
	}

	public Class152 method8400(int i, int i_1978_, int i_1979_, int i_1980_, int i_1981_, int i_1982_) {
		return null;
	}
}
