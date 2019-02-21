
/* Class528_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class528_Sub1 extends MeshRasterizer {
	static int anInt8232;
	static boolean aBool8233;
	static final int anInt8234 = 1;
	static final int anInt8235 = 2;
	static final int anInt8236 = 4;
	static final int anInt8237 = 8;
	static final int anInt8238 = 16;
	Class505_Sub1 aClass505_Sub1_8239;
	int anInt8240;
	int anInt8241;
	byte aByte8242;
	short aShort8243;
	Class172[] aClass172Array8244;
	boolean aBool8245 = false;
	boolean aBool8246 = false;
	static int anInt8247;
	int anInt8248;
	int[] anIntArray8249;
	int[] anIntArray8250;
	int[] anIntArray8251;
	Class87[] aClass87Array8252;
	short[] aShortArray8253;
	boolean aBool8254;
	short[] aShortArray8255;
	short[] aShortArray8256;
	short aShort8257;
	Class145[] aClass145Array8258;
	Class166 aClass166_8259;
	short[] aShortArray8260;
	short[] aShortArray8261;
	int anInt8262;
	int[][] anIntArrayArray8263;
	byte[] aByteArray8264;
	byte[] aByteArray8265;
	short[] aShortArray8266;
	short[] aShortArray8267;
	static int[] anIntArray8268;
	short[] aShortArray8269;
	short[] aShortArray8270;
	static int anInt8271;
	Class143 aClass143_8272;
	Class143 aClass143_8273;
	Class143 aClass143_8274;
	Class143 aClass143_8275;
	Class132 aClass132_8276;
	Interface15 anInterface15_8277;
	int[][] anIntArrayArray8278;
	boolean aBool8279;
	int anInt8280;
	int anInt8281;
	int[][] anIntArrayArray8282;
	short aShort8283;
	short aShort8284;
	short aShort8285;
	short aShort8286;
	short aShort8287;
	short[] aShortArray8288;
	int[] anIntArray8289;
	int[] anIntArray8290;
	static final int anInt8291 = 4;
	float[] aFloatArray8292;
	static final int anInt8293 = 7;
	int anInt8294;
	Class162[] aClass162Array8295;
	static int[] anIntArray8296;
	float[] aFloatArray8297;
	static long[] aLongArray8298;
	static float[] aFloatArray8299 = new float[2];
	int anInt8300;
	static int[] anIntArray8301;
	int anInt8302;
	int anInt8303 = 0;
	short[] aShortArray8304;
	Interface14 anInterface14_8305;
	short aShort8306;

	public void bw(int i) {
		int i_0_ = Class382.anIntArray4657[i];
		int i_1_ = Class382.anIntArray4661[i];
		for (int i_2_ = 0; i_2_ < ((Class528_Sub1) this).anInt8248; i_2_++) {
			int i_3_ = ((((Class528_Sub1) this).anIntArray8251[i_2_] * i_0_ + ((Class528_Sub1) this).anIntArray8249[i_2_] * i_1_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_2_] = (((Class528_Sub1) this).anIntArray8251[i_2_] * i_1_ - ((Class528_Sub1) this).anIntArray8249[i_2_] * i_0_) >> 14;
			((Class528_Sub1) this).anIntArray8249[i_2_] = i_3_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	Class528_Sub1(Class505_Sub1 class505_sub1, RSMesh class157, int i, int i_4_, int i_5_, int i_6_) {
		((Class528_Sub1) this).anInt8248 = 0;
		((Class528_Sub1) this).anInt8300 = 0;
		((Class528_Sub1) this).anInt8262 = 0;
		((Class528_Sub1) this).anInt8302 = 0;
		((Class528_Sub1) this).aBool8279 = true;
		((Class528_Sub1) this).aBool8254 = false;
		((Class528_Sub1) this).aClass505_Sub1_8239 = class505_sub1;
		((Class528_Sub1) this).anInt8240 = i;
		((Class528_Sub1) this).anInt8241 = i_6_;
		if (Class129.method2192(i, i_6_))
			((Class528_Sub1) this).aClass143_8272 = new Class143(null, 5126, 3, 0);
		if (Class129.method2201(i, i_6_))
			((Class528_Sub1) this).aClass143_8275 = new Class143(null, 5126, 2, 0);
		if (Class129.method2193(i, i_6_))
			((Class528_Sub1) this).aClass143_8274 = new Class143(null, 5126, 3, 0);
		if (Class129.method2194(i, i_6_))
			((Class528_Sub1) this).aClass143_8273 = new Class143(null, 5121, 4, 0);
		if (Class129.method2196(i, i_6_))
			((Class528_Sub1) this).aClass132_8276 = new Class132();
		Interface22 interface22 = class505_sub1.anInterface22_5834;
		int[] is = new int[class157.anInt1973];
		((Class528_Sub1) this).anIntArray8290 = new int[class157.anInt1999 + 1];
		for (int i_7_ = 0; i_7_ < class157.anInt1973; i_7_++) {
			if (class157.aByteArray1985 == null || class157.aByteArray1985[i_7_] != 2) {
				if (class157.aShortArray1993 != null && class157.aShortArray1993[i_7_] != -1) {
					Class169 class169 = interface22.method144((class157.aShortArray1993[i_7_] & 0xffff), -1871308532);
					if (((((Class528_Sub1) this).anInt8241 & 0x40) == 0 || !class169.aBool2056) && class169.aBool2072)
						continue;
				}
				is[((Class528_Sub1) this).anInt8262++] = i_7_;
				((Class528_Sub1) this).anIntArray8290[(class157.aShortArray1982[i_7_])]++;
				((Class528_Sub1) this).anIntArray8290[(class157.aShortArray1983[i_7_])]++;
				((Class528_Sub1) this).anIntArray8290[(class157.aShortArray1984[i_7_])]++;
			}
		}
		((Class528_Sub1) this).anInt8302 = ((Class528_Sub1) this).anInt8262;
		long[] ls = new long[((Class528_Sub1) this).anInt8262];
		boolean bool = (((Class528_Sub1) this).anInt8240 & 0x100) != 0;
		for (int i_8_ = 0; i_8_ < ((Class528_Sub1) this).anInt8262; i_8_++) {
			int i_9_ = is[i_8_];
			Class169 class169 = null;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = 0;
			if (class157.aClass84Array2009 != null) {
				boolean bool_14_ = false;
				for (int i_15_ = 0; i_15_ < class157.aClass84Array2009.length; i_15_++) {
					Class84 class84 = class157.aClass84Array2009[i_15_];
					if (i_9_ == class84.anInt809 * 2110152423) {
						Class347 class347 = Class417.method7005((class84.anInt812 * -221586257), -2122599823);
						if (class347.aBool4059)
							bool_14_ = true;
						if (class347.anInt4055 * 117872423 != -1) {
							Class169 class169_16_ = interface22.method144((class347.anInt4055 * 117872423), -1845609255);
							if (class169_16_.anInt2074 * 1960017665 == 2)
								((Class528_Sub1) this).aBool8245 = true;
						}
					}
				}
				if (bool_14_) {
					ls[i_8_] = 9223372036854775807L;
					((Class528_Sub1) this).anInt8302--;
					continue;
				}
			}
			int i_17_ = -1;
			if (class157.aShortArray1993 != null) {
				i_17_ = class157.aShortArray1993[i_9_];
				if (i_17_ != -1) {
					class169 = interface22.method144(i_17_ & 0xffff, -1964447414);
					if ((((Class528_Sub1) this).anInt8241 & 0x40) == 0 || !class169.aBool2056) {
						i_12_ = class169.aByte2064;
						i_13_ = class169.aByte2076;
						if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
							((Class528_Sub1) this).aBool8246 = true;
					} else {
						i_17_ = -1;
						class169 = null;
					}
				}
			}
			boolean bool_18_ = ((class157.aByteArray1975 != null && class157.aByteArray1975[i_9_] != 0) || (class169 != null && class169.anInt2074 * 1960017665 != 0));
			if ((bool || bool_18_) && class157.aByteArray1977 != null)
				i_10_ += class157.aByteArray1977[i_9_] << 17;
			if (bool_18_)
				i_10_ += 65536;
			i_10_ += (i_12_ & 0xff) << 8;
			i_10_ += i_13_ & 0xff;
			i_11_ += (i_17_ & 0xffff) << 16;
			i_11_ += i_8_ & 0xffff;
			ls[i_8_] = ((long) i_10_ << 32) + (long) i_11_;
			((Class528_Sub1) this).aBool8245 |= bool_18_;
			Class528_Sub1 class528_sub1_19_ = this;
			((Class528_Sub1) class528_sub1_19_).aBool8246 = (((Class528_Sub1) class528_sub1_19_).aBool8246 | (class169 != null && (class169.aByte2081 != 0 || class169.aByte2090 != 0)));
		}
		Class159.method2736(ls, is, (byte) 8);
		((Class528_Sub1) this).anInt8303 = class157.anInt1974;
		((Class528_Sub1) this).anInt8248 = class157.anInt1999;
		((Class528_Sub1) this).anIntArray8249 = class157.anIntArray1976;
		((Class528_Sub1) this).anIntArray8250 = class157.anIntArray2003;
		((Class528_Sub1) this).anIntArray8251 = class157.anIntArray1978;
		((Class528_Sub1) this).aShortArray8253 = class157.aShortArray1980;
		Class126[] class126s = new Class126[((Class528_Sub1) this).anInt8248];
		((Class528_Sub1) this).aClass87Array8252 = class157.aClass87Array2007;
		((Class528_Sub1) this).aClass172Array8244 = class157.aClass172Array2008;
		if (class157.aClass84Array2009 != null) {
			((Class528_Sub1) this).anInt8294 = class157.aClass84Array2009.length;
			((Class528_Sub1) this).aClass162Array8295 = new Class162[((Class528_Sub1) this).anInt8294];
			((Class528_Sub1) this).aClass145Array8258 = new Class145[((Class528_Sub1) this).anInt8294];
			for (int i_20_ = 0; i_20_ < ((Class528_Sub1) this).anInt8294; i_20_++) {
				Class84 class84 = class157.aClass84Array2009[i_20_];
				Class347 class347 = Class417.method7005(class84.anInt812 * -221586257, -1304566702);
				int i_21_ = -1;
				for (int i_22_ = 0; i_22_ < ((Class528_Sub1) this).anInt8262; i_22_++) {
					if (is[i_22_] == class84.anInt809 * 2110152423) {
						i_21_ = i_22_;
						break;
					}
				}
				if (i_21_ == -1)
					throw new RuntimeException();
				int i_23_ = ((Class540.anIntArray7136[(class157.aShortArray2006[class84.anInt809 * 2110152423]) & 0xffff]) & 0xffffff);
				i_23_ = i_23_ | 255 - (class157.aByteArray1975 != null ? (class157.aByteArray1975[class84.anInt809 * 2110152423]) : 0) << 24;
				((Class528_Sub1) this).aClass162Array8295[i_20_] = new Class162(i_21_, (class157.aShortArray1982[class84.anInt809 * 2110152423]), (class157.aShortArray1983[class84.anInt809 * 2110152423]), (class157.aShortArray1984[class84.anInt809 * 2110152423]), class347.anInt4054 * -1720863327, class347.anInt4050 * -743047207, class347.anInt4055 * 117872423, class347.anInt4057 * 1007428267, class347.anInt4051 * -920295177, class347.aBool4059, class347.aBool4058, class84.anInt810 * 1823219025);
				((Class528_Sub1) this).aClass145Array8258[i_20_] = new Class145(i_23_);
			}
		}
		int i_24_ = ((Class528_Sub1) this).anInt8262 * 3;
		((Class528_Sub1) this).aShortArray8255 = new short[i_24_];
		((Class528_Sub1) this).aShortArray8270 = new short[i_24_];
		((Class528_Sub1) this).aShortArray8261 = new short[i_24_];
		((Class528_Sub1) this).aByteArray8264 = new byte[i_24_];
		((Class528_Sub1) this).aFloatArray8297 = new float[i_24_];
		((Class528_Sub1) this).aFloatArray8292 = new float[i_24_];
		((Class528_Sub1) this).aShortArray8260 = new short[((Class528_Sub1) this).anInt8262];
		((Class528_Sub1) this).aByteArray8265 = new byte[((Class528_Sub1) this).anInt8262];
		((Class528_Sub1) this).aShortArray8266 = new short[((Class528_Sub1) this).anInt8262];
		((Class528_Sub1) this).aShortArray8267 = new short[((Class528_Sub1) this).anInt8262];
		((Class528_Sub1) this).aShortArray8256 = new short[((Class528_Sub1) this).anInt8262];
		((Class528_Sub1) this).aShortArray8269 = new short[((Class528_Sub1) this).anInt8262];
		if (class157.aShortArray1981 != null)
			((Class528_Sub1) this).aShortArray8304 = new short[((Class528_Sub1) this).anInt8262];
		((Class528_Sub1) this).aShort8243 = (short) i_4_;
		((Class528_Sub1) this).aShort8257 = (short) i_5_;
		((Class528_Sub1) this).aShortArray8288 = new short[i_24_];
		aLongArray8298 = new long[i_24_];
		int i_25_ = 0;
		for (int i_26_ = 0; i_26_ < class157.anInt1999; i_26_++) {
			int i_27_ = ((Class528_Sub1) this).anIntArray8290[i_26_];
			((Class528_Sub1) this).anIntArray8290[i_26_] = i_25_;
			i_25_ += i_27_;
			class126s[i_26_] = new Class126();
		}
		((Class528_Sub1) this).anIntArray8290[class157.anInt1999] = i_25_;
		Class83 class83 = method11256(class157, is, ((Class528_Sub1) this).anInt8262);
		Class127[] class127s = new Class127[class157.anInt1973];
		for (int i_28_ = 0; i_28_ < class157.anInt1973; i_28_++) {
			short i_29_ = class157.aShortArray1982[i_28_];
			short i_30_ = class157.aShortArray1983[i_28_];
			short i_31_ = class157.aShortArray1984[i_28_];
			int i_32_ = (((Class528_Sub1) this).anIntArray8249[i_30_] - ((Class528_Sub1) this).anIntArray8249[i_29_]);
			int i_33_ = (((Class528_Sub1) this).anIntArray8250[i_30_] - ((Class528_Sub1) this).anIntArray8250[i_29_]);
			int i_34_ = (((Class528_Sub1) this).anIntArray8251[i_30_] - ((Class528_Sub1) this).anIntArray8251[i_29_]);
			int i_35_ = (((Class528_Sub1) this).anIntArray8249[i_31_] - ((Class528_Sub1) this).anIntArray8249[i_29_]);
			int i_36_ = (((Class528_Sub1) this).anIntArray8250[i_31_] - ((Class528_Sub1) this).anIntArray8250[i_29_]);
			int i_37_ = (((Class528_Sub1) this).anIntArray8251[i_31_] - ((Class528_Sub1) this).anIntArray8251[i_29_]);
			int i_38_ = i_33_ * i_37_ - i_36_ * i_34_;
			int i_39_ = i_34_ * i_35_ - i_37_ * i_32_;
			int i_40_;
			for (i_40_ = i_32_ * i_36_ - i_35_ * i_33_; (i_38_ > 8192 || i_39_ > 8192 || i_40_ > 8192 || i_38_ < -8192 || i_39_ < -8192 || i_40_ < -8192); i_40_ >>= 1) {
				i_38_ >>= 1;
				i_39_ >>= 1;
			}
			int i_41_ = (int) Math.sqrt((double) (i_38_ * i_38_ + i_39_ * i_39_ + i_40_ * i_40_));
			if (i_41_ <= 0)
				i_41_ = 1;
			i_38_ = i_38_ * 256 / i_41_;
			i_39_ = i_39_ * 256 / i_41_;
			i_40_ = i_40_ * 256 / i_41_;
			byte i_42_ = (class157.aByteArray1985 == null ? (byte) 0 : class157.aByteArray1985[i_28_]);
			if (i_42_ == 0) {
				Class126 class126 = class126s[i_29_];
				((Class126) class126).anInt1577 += i_38_;
				((Class126) class126).anInt1575 += i_39_;
				((Class126) class126).anInt1576 += i_40_;
				((Class126) class126).anInt1574++;
				class126 = class126s[i_30_];
				((Class126) class126).anInt1577 += i_38_;
				((Class126) class126).anInt1575 += i_39_;
				((Class126) class126).anInt1576 += i_40_;
				((Class126) class126).anInt1574++;
				class126 = class126s[i_31_];
				((Class126) class126).anInt1577 += i_38_;
				((Class126) class126).anInt1575 += i_39_;
				((Class126) class126).anInt1576 += i_40_;
				((Class126) class126).anInt1574++;
			} else if (i_42_ == 1) {
				Class127 class127 = class127s[i_28_] = new Class127();
				((Class127) class127).anInt1579 = i_38_;
				((Class127) class127).anInt1578 = i_39_;
				((Class127) class127).anInt1580 = i_40_;
			}
		}
		for (int i_43_ = 0; i_43_ < ((Class528_Sub1) this).anInt8262; i_43_++) {
			int i_44_ = is[i_43_];
			int i_45_ = class157.aShortArray2006[i_44_] & 0xffff;
			int i_46_;
			if (class157.aByteArray1988 == null)
				i_46_ = -1;
			else
				i_46_ = class157.aByteArray1988[i_44_];
			int i_47_;
			if (class157.aByteArray1975 == null)
				i_47_ = 0;
			else
				i_47_ = class157.aByteArray1975[i_44_] & 0xff;
			short i_48_ = (class157.aShortArray1993 == null ? (short) -1 : class157.aShortArray1993[i_44_]);
			if (i_48_ != -1 && (((Class528_Sub1) this).anInt8241 & 0x40) != 0) {
				Class169 class169 = interface22.method144(i_48_ & 0xffff, -1997959177);
				if (class169.aBool2056)
					i_48_ = (short) -1;
			}
			float f = 0.0F;
			float f_49_ = 0.0F;
			float f_50_ = 0.0F;
			float f_51_ = 0.0F;
			float f_52_ = 0.0F;
			float f_53_ = 0.0F;
			int i_54_ = 0;
			int i_55_ = 0;
			int i_56_ = 0;
			if (i_48_ != -1) {
				if (i_46_ == -1) {
					f = 0.0F;
					f_49_ = 1.0F;
					f_50_ = 1.0F;
					f_51_ = 1.0F;
					i_54_ = 1;
					f_52_ = 0.0F;
					f_53_ = 0.0F;
					i_55_ = 2;
				} else {
					i_46_ &= 0xff;
					byte i_57_ = class157.aByteArray1995[i_46_];
					if (i_57_ == 0) {
						short i_58_ = class157.aShortArray1982[i_44_];
						short i_59_ = class157.aShortArray1983[i_44_];
						short i_60_ = class157.aShortArray1984[i_44_];
						short i_61_ = class157.aShortArray1996[i_46_];
						short i_62_ = class157.aShortArray1987[i_46_];
						short i_63_ = class157.aShortArray1998[i_46_];
						float f_64_ = (float) class157.anIntArray1976[i_61_];
						float f_65_ = (float) class157.anIntArray2003[i_61_];
						float f_66_ = (float) class157.anIntArray1978[i_61_];
						float f_67_ = (float) class157.anIntArray1976[i_62_] - f_64_;
						float f_68_ = (float) class157.anIntArray2003[i_62_] - f_65_;
						float f_69_ = (float) class157.anIntArray1978[i_62_] - f_66_;
						float f_70_ = (float) class157.anIntArray1976[i_63_] - f_64_;
						float f_71_ = (float) class157.anIntArray2003[i_63_] - f_65_;
						float f_72_ = (float) class157.anIntArray1978[i_63_] - f_66_;
						float f_73_ = (float) class157.anIntArray1976[i_58_] - f_64_;
						float f_74_ = (float) class157.anIntArray2003[i_58_] - f_65_;
						float f_75_ = (float) class157.anIntArray1978[i_58_] - f_66_;
						float f_76_ = (float) class157.anIntArray1976[i_59_] - f_64_;
						float f_77_ = (float) class157.anIntArray2003[i_59_] - f_65_;
						float f_78_ = (float) class157.anIntArray1978[i_59_] - f_66_;
						float f_79_ = (float) class157.anIntArray1976[i_60_] - f_64_;
						float f_80_ = (float) class157.anIntArray2003[i_60_] - f_65_;
						float f_81_ = (float) class157.anIntArray1978[i_60_] - f_66_;
						float f_82_ = f_68_ * f_72_ - f_69_ * f_71_;
						float f_83_ = f_69_ * f_70_ - f_67_ * f_72_;
						float f_84_ = f_67_ * f_71_ - f_68_ * f_70_;
						float f_85_ = f_71_ * f_84_ - f_72_ * f_83_;
						float f_86_ = f_72_ * f_82_ - f_70_ * f_84_;
						float f_87_ = f_70_ * f_83_ - f_71_ * f_82_;
						float f_88_ = 1.0F / (f_85_ * f_67_ + f_86_ * f_68_ + f_87_ * f_69_);
						f = ((f_85_ * f_73_ + f_86_ * f_74_ + f_87_ * f_75_) * f_88_);
						f_50_ = (f_85_ * f_76_ + f_86_ * f_77_ + f_87_ * f_78_) * f_88_;
						f_52_ = (f_85_ * f_79_ + f_86_ * f_80_ + f_87_ * f_81_) * f_88_;
						f_85_ = f_68_ * f_84_ - f_69_ * f_83_;
						f_86_ = f_69_ * f_82_ - f_67_ * f_84_;
						f_87_ = f_67_ * f_83_ - f_68_ * f_82_;
						f_88_ = 1.0F / (f_85_ * f_70_ + f_86_ * f_71_ + f_87_ * f_72_);
						f_49_ = (f_85_ * f_73_ + f_86_ * f_74_ + f_87_ * f_75_) * f_88_;
						f_51_ = (f_85_ * f_76_ + f_86_ * f_77_ + f_87_ * f_78_) * f_88_;
						f_53_ = (f_85_ * f_79_ + f_86_ * f_80_ + f_87_ * f_81_) * f_88_;
					} else {
						short i_89_ = class157.aShortArray1982[i_44_];
						short i_90_ = class157.aShortArray1983[i_44_];
						short i_91_ = class157.aShortArray1984[i_44_];
						int i_92_ = class83.anIntArray808[i_46_];
						int i_93_ = class83.anIntArray805[i_46_];
						int i_94_ = class83.anIntArray807[i_46_];
						float[] fs = class83.aFloatArrayArray806[i_46_];
						byte i_95_ = class157.aByteArray1990[i_46_];
						float f_96_ = (float) class157.anIntArray1992[i_46_] / 256.0F;
						if (i_57_ == 1) {
							float f_97_ = ((float) class157.anIntArray2001[i_46_] / 1024.0F);
							method11306(class157.anIntArray1976[i_89_], class157.anIntArray2003[i_89_], class157.anIntArray1978[i_89_], i_92_, i_93_, i_94_, fs, f_97_, i_95_, f_96_, aFloatArray8299);
							f = aFloatArray8299[0];
							f_49_ = aFloatArray8299[1];
							method11306(class157.anIntArray1976[i_90_], class157.anIntArray2003[i_90_], class157.anIntArray1978[i_90_], i_92_, i_93_, i_94_, fs, f_97_, i_95_, f_96_, aFloatArray8299);
							f_50_ = aFloatArray8299[0];
							f_51_ = aFloatArray8299[1];
							method11306(class157.anIntArray1976[i_91_], class157.anIntArray2003[i_91_], class157.anIntArray1978[i_91_], i_92_, i_93_, i_94_, fs, f_97_, i_95_, f_96_, aFloatArray8299);
							f_52_ = aFloatArray8299[0];
							f_53_ = aFloatArray8299[1];
							float f_98_ = f_97_ / 2.0F;
							if ((i_95_ & 0x1) == 0) {
								if (f_50_ - f > f_98_) {
									f_50_ -= f_97_;
									i_54_ = 1;
								} else if (f - f_50_ > f_98_) {
									f_50_ += f_97_;
									i_54_ = 2;
								}
								if (f_52_ - f > f_98_) {
									f_52_ -= f_97_;
									i_55_ = 1;
								} else if (f - f_52_ > f_98_) {
									f_52_ += f_97_;
									i_55_ = 2;
								}
							} else {
								if (f_51_ - f_49_ > f_98_) {
									f_51_ -= f_97_;
									i_54_ = 1;
								} else if (f_49_ - f_51_ > f_98_) {
									f_51_ += f_97_;
									i_54_ = 2;
								}
								if (f_53_ - f_49_ > f_98_) {
									f_53_ -= f_97_;
									i_55_ = 1;
								} else if (f_49_ - f_53_ > f_98_) {
									f_53_ += f_97_;
									i_55_ = 2;
								}
							}
						} else if (i_57_ == 2) {
							float f_99_ = ((float) class157.anIntArray1997[i_46_] / 256.0F);
							float f_100_ = ((float) class157.anIntArray2004[i_46_] / 256.0F);
							int i_101_ = (class157.anIntArray1976[i_90_] - class157.anIntArray1976[i_89_]);
							int i_102_ = (class157.anIntArray2003[i_90_] - class157.anIntArray2003[i_89_]);
							int i_103_ = (class157.anIntArray1978[i_90_] - class157.anIntArray1978[i_89_]);
							int i_104_ = (class157.anIntArray1976[i_91_] - class157.anIntArray1976[i_89_]);
							int i_105_ = (class157.anIntArray2003[i_91_] - class157.anIntArray2003[i_89_]);
							int i_106_ = (class157.anIntArray1978[i_91_] - class157.anIntArray1978[i_89_]);
							int i_107_ = i_102_ * i_106_ - i_105_ * i_103_;
							int i_108_ = i_103_ * i_104_ - i_106_ * i_101_;
							int i_109_ = i_101_ * i_105_ - i_104_ * i_102_;
							float f_110_ = (64.0F / (float) class157.anIntArray1989[i_46_]);
							float f_111_ = (64.0F / (float) class157.anIntArray2000[i_46_]);
							float f_112_ = (64.0F / (float) class157.anIntArray2001[i_46_]);
							float f_113_ = (((float) i_107_ * fs[0] + (float) i_108_ * fs[1] + (float) i_109_ * fs[2]) / f_110_);
							float f_114_ = (((float) i_107_ * fs[3] + (float) i_108_ * fs[4] + (float) i_109_ * fs[5]) / f_111_);
							float f_115_ = (((float) i_107_ * fs[6] + (float) i_108_ * fs[7] + (float) i_109_ * fs[8]) / f_112_);
							i_56_ = method11254(f_113_, f_114_, f_115_);
							method11255(class157.anIntArray1976[i_89_], class157.anIntArray2003[i_89_], class157.anIntArray1978[i_89_], i_92_, i_93_, i_94_, i_56_, fs, i_95_, f_96_, f_99_, f_100_, aFloatArray8299);
							f = aFloatArray8299[0];
							f_49_ = aFloatArray8299[1];
							method11255(class157.anIntArray1976[i_90_], class157.anIntArray2003[i_90_], class157.anIntArray1978[i_90_], i_92_, i_93_, i_94_, i_56_, fs, i_95_, f_96_, f_99_, f_100_, aFloatArray8299);
							f_50_ = aFloatArray8299[0];
							f_51_ = aFloatArray8299[1];
							method11255(class157.anIntArray1976[i_91_], class157.anIntArray2003[i_91_], class157.anIntArray1978[i_91_], i_92_, i_93_, i_94_, i_56_, fs, i_95_, f_96_, f_99_, f_100_, aFloatArray8299);
							f_52_ = aFloatArray8299[0];
							f_53_ = aFloatArray8299[1];
						} else if (i_57_ == 3) {
							method11271(class157.anIntArray1976[i_89_], class157.anIntArray2003[i_89_], class157.anIntArray1978[i_89_], i_92_, i_93_, i_94_, fs, i_95_, f_96_, aFloatArray8299);
							f = aFloatArray8299[0];
							f_49_ = aFloatArray8299[1];
							method11271(class157.anIntArray1976[i_90_], class157.anIntArray2003[i_90_], class157.anIntArray1978[i_90_], i_92_, i_93_, i_94_, fs, i_95_, f_96_, aFloatArray8299);
							f_50_ = aFloatArray8299[0];
							f_51_ = aFloatArray8299[1];
							method11271(class157.anIntArray1976[i_91_], class157.anIntArray2003[i_91_], class157.anIntArray1978[i_91_], i_92_, i_93_, i_94_, fs, i_95_, f_96_, aFloatArray8299);
							f_52_ = aFloatArray8299[0];
							f_53_ = aFloatArray8299[1];
							if ((i_95_ & 0x1) == 0) {
								if (f_50_ - f > 0.5F) {
									f_50_--;
									i_54_ = 1;
								} else if (f - f_50_ > 0.5F) {
									f_50_++;
									i_54_ = 2;
								}
								if (f_52_ - f > 0.5F) {
									f_52_--;
									i_55_ = 1;
								} else if (f - f_52_ > 0.5F) {
									f_52_++;
									i_55_ = 2;
								}
							} else {
								if (f_51_ - f_49_ > 0.5F) {
									f_51_--;
									i_54_ = 1;
								} else if (f_49_ - f_51_ > 0.5F) {
									f_51_++;
									i_54_ = 2;
								}
								if (f_53_ - f_49_ > 0.5F) {
									f_53_--;
									i_55_ = 1;
								} else if (f_49_ - f_53_ > 0.5F) {
									f_53_++;
									i_55_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_116_;
			if (class157.aByteArray1985 == null)
				i_116_ = (byte) 0;
			else
				i_116_ = class157.aByteArray1985[i_44_];
			if (i_116_ == 0) {
				long l = ((long) (i_46_ << 2) + (((long) (i_56_ << 24) + (long) (i_45_ << 8) + (long) i_47_) << 32));
				short i_117_ = class157.aShortArray1982[i_44_];
				short i_118_ = class157.aShortArray1983[i_44_];
				short i_119_ = class157.aShortArray1984[i_44_];
				Class126 class126 = class126s[i_117_];
				((Class528_Sub1) this).aShortArray8266[i_43_] = method13542(class157, i_117_, l, ((Class126) class126).anInt1577, ((Class126) class126).anInt1575, ((Class126) class126).anInt1576, ((Class126) class126).anInt1574, f, f_49_);
				class126 = class126s[i_118_];
				((Class528_Sub1) this).aShortArray8267[i_43_] = method13542(class157, i_118_, l + (long) i_54_, ((Class126) class126).anInt1577, ((Class126) class126).anInt1575, ((Class126) class126).anInt1576, ((Class126) class126).anInt1574, f_50_, f_51_);
				class126 = class126s[i_119_];
				((Class528_Sub1) this).aShortArray8256[i_43_] = method13542(class157, i_119_, l + (long) i_55_, ((Class126) class126).anInt1577, ((Class126) class126).anInt1575, ((Class126) class126).anInt1576, ((Class126) class126).anInt1574, f_52_, f_53_);
			} else if (i_116_ == 1) {
				Class127 class127 = class127s[i_44_];
				long l = ((long) ((i_46_ << 2) + (((Class127) class127).anInt1579 > 0 ? 1024 : 2048) + (((Class127) class127).anInt1578 + 256 << 12) + (((Class127) class127).anInt1580 + 256 << 22)) + (((long) (i_56_ << 24) + (long) (i_45_ << 8) + (long) i_47_) << 32));
				((Class528_Sub1) this).aShortArray8266[i_43_] = method13542(class157, class157.aShortArray1982[i_44_], l, ((Class127) class127).anInt1579, ((Class127) class127).anInt1578, ((Class127) class127).anInt1580, 0, f, f_49_);
				((Class528_Sub1) this).aShortArray8267[i_43_] = method13542(class157, class157.aShortArray1983[i_44_], l + (long) i_54_, ((Class127) class127).anInt1579, ((Class127) class127).anInt1578, ((Class127) class127).anInt1580, 0, f_50_, f_51_);
				((Class528_Sub1) this).aShortArray8256[i_43_] = method13542(class157, class157.aShortArray1984[i_44_], l + (long) i_55_, ((Class127) class127).anInt1579, ((Class127) class127).anInt1578, ((Class127) class127).anInt1580, 0, f_52_, f_53_);
			}
			if (class157.aByteArray1975 != null)
				((Class528_Sub1) this).aByteArray8265[i_43_] = class157.aByteArray1975[i_44_];
			if (class157.aShortArray1981 != null)
				((Class528_Sub1) this).aShortArray8304[i_43_] = class157.aShortArray1981[i_44_];
			((Class528_Sub1) this).aShortArray8260[i_43_] = class157.aShortArray2006[i_44_];
			((Class528_Sub1) this).aShortArray8269[i_43_] = i_48_;
		}
		int i_120_ = 0;
		short i_121_ = -10000;
		for (int i_122_ = 0; i_122_ < ((Class528_Sub1) this).anInt8302; i_122_++) {
			short i_123_ = ((Class528_Sub1) this).aShortArray8269[i_122_];
			if (i_123_ != i_121_) {
				i_120_++;
				i_121_ = i_123_;
			}
		}
		((Class528_Sub1) this).anIntArray8289 = new int[i_120_ + 1];
		i_120_ = 0;
		i_121_ = (short) -10000;
		for (int i_124_ = 0; i_124_ < ((Class528_Sub1) this).anInt8302; i_124_++) {
			short i_125_ = ((Class528_Sub1) this).aShortArray8269[i_124_];
			if (i_125_ != i_121_) {
				((Class528_Sub1) this).anIntArray8289[i_120_++] = i_124_;
				i_121_ = i_125_;
			}
		}
		((Class528_Sub1) this).anIntArray8289[i_120_] = ((Class528_Sub1) this).anInt8302;
		aLongArray8298 = null;
		((Class528_Sub1) this).aShortArray8255 = method13526(((Class528_Sub1) this).aShortArray8255, ((Class528_Sub1) this).anInt8300);
		((Class528_Sub1) this).aShortArray8270 = method13526(((Class528_Sub1) this).aShortArray8270, ((Class528_Sub1) this).anInt8300);
		((Class528_Sub1) this).aShortArray8261 = method13526(((Class528_Sub1) this).aShortArray8261, ((Class528_Sub1) this).anInt8300);
		((Class528_Sub1) this).aByteArray8264 = method13555(((Class528_Sub1) this).aByteArray8264, ((Class528_Sub1) this).anInt8300);
		((Class528_Sub1) this).aFloatArray8297 = method13523(((Class528_Sub1) this).aFloatArray8297, ((Class528_Sub1) this).anInt8300);
		((Class528_Sub1) this).aFloatArray8292 = method13523(((Class528_Sub1) this).aFloatArray8292, ((Class528_Sub1) this).anInt8300);
		if (class157.anIntArray2002 != null && Class129.method2226(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) this).anIntArrayArray8263 = class157.method2665(false);
		if (class157.aClass84Array2009 != null && Class129.method2260(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) this).anIntArrayArray8278 = class157.method2667();
		if (class157.anIntArray1991 != null && Class129.method2208(i, ((Class528_Sub1) this).anInt8241)) {
			int i_126_ = 0;
			int[] is_127_ = new int[256];
			for (int i_128_ = 0; i_128_ < ((Class528_Sub1) this).anInt8262; i_128_++) {
				int i_129_ = class157.anIntArray1991[is[i_128_]];
				if (i_129_ >= 0) {
					is_127_[i_129_]++;
					if (i_129_ > i_126_)
						i_126_ = i_129_;
				}
			}
			((Class528_Sub1) this).anIntArrayArray8282 = new int[i_126_ + 1][];
			for (int i_130_ = 0; i_130_ <= i_126_; i_130_++) {
				((Class528_Sub1) this).anIntArrayArray8282[i_130_] = new int[is_127_[i_130_]];
				is_127_[i_130_] = 0;
			}
			for (int i_131_ = 0; i_131_ < ((Class528_Sub1) this).anInt8262; i_131_++) {
				int i_132_ = class157.anIntArray1991[is[i_131_]];
				if (i_132_ >= 0)
					((Class528_Sub1) this).anIntArrayArray8282[i_132_][is_127_[i_132_]++] = i_131_;
			}
		}
	}

	public void bx(int i) {
		int i_133_ = Class382.anIntArray4657[i];
		int i_134_ = Class382.anIntArray4661[i];
		for (int i_135_ = 0; i_135_ < ((Class528_Sub1) this).anInt8248; i_135_++) {
			int i_136_ = ((((Class528_Sub1) this).anIntArray8251[i_135_] * i_133_ + ((Class528_Sub1) this).anIntArray8249[i_135_] * i_134_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_135_] = ((((Class528_Sub1) this).anIntArray8251[i_135_] * i_134_ - ((Class528_Sub1) this).anIntArray8249[i_135_] * i_133_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_135_] = i_136_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	void method13522(Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1) {
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500).length < ((Class528_Sub1) this).anInt8300) {
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500 = new int[((Class528_Sub1) this).anInt8300];
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501 = new int[((Class528_Sub1) this).anInt8300];
		}
		int[] is = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500);
		int[] is_137_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501);
		for (int i = 0; i < ((Class528_Sub1) this).anInt8248; i++) {
			int i_138_ = (((((Class528_Sub1) this).anIntArray8249[i] - ((((Class528_Sub1) this).anIntArray8250[i] * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473) - (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293));
			int i_139_ = (((((Class528_Sub1) this).anIntArray8251[i] - ((((Class528_Sub1) this).anIntArray8250[i] * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473) - (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295));
			int i_140_ = ((Class528_Sub1) this).anIntArray8290[i];
			int i_141_ = ((Class528_Sub1) this).anIntArray8290[i + 1];
			for (int i_142_ = i_140_; i_142_ < i_141_; i_142_++) {
				int i_143_ = ((((Class528_Sub1) this).aShortArray8288[i_142_] & 0xffff) - 1);
				if (i_143_ == -1)
					break;
				is[i_143_] = i_138_;
				is_137_[i_143_] = i_139_;
			}
		}
		for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
			if (((Class528_Sub1) this).aByteArray8265 == null || ((Class528_Sub1) this).aByteArray8265[i] <= 128) {
				int i_144_ = ((Class528_Sub1) this).aShortArray8266[i] & 0xffff;
				int i_145_ = ((Class528_Sub1) this).aShortArray8267[i] & 0xffff;
				int i_146_ = ((Class528_Sub1) this).aShortArray8256[i] & 0xffff;
				int i_147_ = is[i_144_];
				int i_148_ = is[i_145_];
				int i_149_ = is[i_146_];
				int i_150_ = is_137_[i_144_];
				int i_151_ = is_137_[i_145_];
				int i_152_ = is_137_[i_146_];
				if (((i_147_ - i_148_) * (i_151_ - i_152_) - (i_151_ - i_150_) * (i_149_ - i_148_)) > 0)
					class282_sub50_sub17_sub1.method15713(i_150_, i_151_, i_152_, i_147_, i_148_, i_149_);
			}
		}
	}

	void method11285() {
		/* empty */
	}

	static float[] method13523(float[] fs, int i) {
		float[] fs_153_ = new float[i];
		System.arraycopy(fs, 0, fs_153_, 0, i);
		return fs_153_;
	}

	public void method11291(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub1) this).aShortArray8253 != null) {
			Matrix44Var class294_154_ = class294;
			if (bool) {
				class294_154_ = ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass294_8405;
				class294_154_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_155_ = 0; i_155_ < ((Class528_Sub1) this).anInt8248; i_155_++) {
				if ((i & ((Class528_Sub1) this).aShortArray8253[i_155_]) != 0) {
					class294_154_.method5226((float) ((Class528_Sub1) this).anIntArray8249[i_155_], (float) ((Class528_Sub1) this).anIntArray8250[i_155_], (float) ((Class528_Sub1) this).anIntArray8251[i_155_], fs);
					((Class528_Sub1) this).anIntArray8249[i_155_] = (int) fs[0];
					((Class528_Sub1) this).anIntArray8250[i_155_] = (int) fs[1];
					((Class528_Sub1) this).anIntArray8251[i_155_] = (int) fs[2];
				}
			}
		}
	}

	public void KA(int i) {
		((Class528_Sub1) this).anInt8240 = i;
		if (((Class528_Sub1) this).aClass166_8259 != null && (((Class528_Sub1) this).anInt8240 & 0x10000) == 0) {
			((Class528_Sub1) this).aShortArray8255 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
			((Class528_Sub1) this).aShortArray8270 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
			((Class528_Sub1) this).aShortArray8261 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
			((Class528_Sub1) this).aByteArray8264 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
			((Class528_Sub1) this).aClass166_8259 = null;
		}
		((Class528_Sub1) this).aBool8279 = true;
		method13525();
	}

	static {
		anIntArray8296 = new int[8];
		anIntArray8301 = new int[8];
		anIntArray8268 = new int[8];
	}

	public MeshRasterizer method11289(byte i, int i_156_, boolean bool) {
		boolean bool_157_ = false;
		Class528_Sub1 class528_sub1_158_;
		Class528_Sub1 class528_sub1_159_;
		if (i > 0 && i <= 7) {
			class528_sub1_159_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8492[i - 1]);
			class528_sub1_158_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8479[i - 1]);
			bool_157_ = true;
		} else
			class528_sub1_158_ = class528_sub1_159_ = new Class528_Sub1(((Class528_Sub1) this).aClass505_Sub1_8239);
		return method13524(class528_sub1_158_, class528_sub1_159_, i_156_, bool_157_, bool);
	}

	MeshRasterizer method13524(Class528_Sub1 class528_sub1_160_, Class528_Sub1 class528_sub1_161_, int i, boolean bool, boolean bool_162_) {
		((Class528_Sub1) class528_sub1_160_).aByte8242 = (byte) 0;
		((Class528_Sub1) class528_sub1_160_).anInt8240 = i;
		((Class528_Sub1) class528_sub1_160_).anInt8241 = ((Class528_Sub1) this).anInt8241;
		((Class528_Sub1) class528_sub1_160_).aShort8243 = ((Class528_Sub1) this).aShort8243;
		((Class528_Sub1) class528_sub1_160_).aShort8257 = ((Class528_Sub1) this).aShort8257;
		((Class528_Sub1) class528_sub1_160_).anInt8303 = ((Class528_Sub1) this).anInt8303;
		((Class528_Sub1) class528_sub1_160_).anInt8248 = ((Class528_Sub1) this).anInt8248;
		((Class528_Sub1) class528_sub1_160_).anInt8300 = ((Class528_Sub1) this).anInt8300;
		((Class528_Sub1) class528_sub1_160_).anInt8262 = ((Class528_Sub1) this).anInt8262;
		((Class528_Sub1) class528_sub1_160_).anInt8302 = ((Class528_Sub1) this).anInt8302;
		((Class528_Sub1) class528_sub1_160_).anInt8294 = ((Class528_Sub1) this).anInt8294;
		if ((i & 0x100) != 0)
			((Class528_Sub1) class528_sub1_160_).aBool8245 = true;
		else
			((Class528_Sub1) class528_sub1_160_).aBool8245 = ((Class528_Sub1) this).aBool8245;
		((Class528_Sub1) class528_sub1_160_).aBool8246 = ((Class528_Sub1) this).aBool8246;
		boolean bool_163_ = Class129.method2180(i, ((Class528_Sub1) this).anInt8241);
		boolean bool_164_ = Class129.method2181(i, ((Class528_Sub1) this).anInt8241);
		boolean bool_165_ = Class129.method2184(i, ((Class528_Sub1) this).anInt8241);
		boolean bool_166_ = bool_163_ | bool_164_ | bool_165_;
		if (bool_166_) {
			if (bool_163_) {
				if (((Class528_Sub1) class528_sub1_161_).anIntArray8249 == null || ((((Class528_Sub1) class528_sub1_161_).anIntArray8249).length < ((Class528_Sub1) this).anInt8303))
					((Class528_Sub1) class528_sub1_160_).anIntArray8249 = ((Class528_Sub1) class528_sub1_161_).anIntArray8249 = new int[((Class528_Sub1) this).anInt8303];
				else
					((Class528_Sub1) class528_sub1_160_).anIntArray8249 = ((Class528_Sub1) class528_sub1_161_).anIntArray8249;
			} else
				((Class528_Sub1) class528_sub1_160_).anIntArray8249 = ((Class528_Sub1) this).anIntArray8249;
			if (bool_164_) {
				if (((Class528_Sub1) class528_sub1_161_).anIntArray8250 == null || ((((Class528_Sub1) class528_sub1_161_).anIntArray8250).length < ((Class528_Sub1) this).anInt8303))
					((Class528_Sub1) class528_sub1_160_).anIntArray8250 = ((Class528_Sub1) class528_sub1_161_).anIntArray8250 = new int[((Class528_Sub1) this).anInt8303];
				else
					((Class528_Sub1) class528_sub1_160_).anIntArray8250 = ((Class528_Sub1) class528_sub1_161_).anIntArray8250;
			} else
				((Class528_Sub1) class528_sub1_160_).anIntArray8250 = ((Class528_Sub1) this).anIntArray8250;
			if (bool_165_) {
				if (((Class528_Sub1) class528_sub1_161_).anIntArray8251 == null || ((((Class528_Sub1) class528_sub1_161_).anIntArray8251).length < ((Class528_Sub1) this).anInt8303))
					((Class528_Sub1) class528_sub1_160_).anIntArray8251 = ((Class528_Sub1) class528_sub1_161_).anIntArray8251 = new int[((Class528_Sub1) this).anInt8303];
				else
					((Class528_Sub1) class528_sub1_160_).anIntArray8251 = ((Class528_Sub1) class528_sub1_161_).anIntArray8251;
			} else
				((Class528_Sub1) class528_sub1_160_).anIntArray8251 = ((Class528_Sub1) this).anIntArray8251;
			for (int i_167_ = 0; i_167_ < ((Class528_Sub1) this).anInt8303; i_167_++) {
				if (bool_163_)
					((Class528_Sub1) class528_sub1_160_).anIntArray8249[i_167_] = ((Class528_Sub1) this).anIntArray8249[i_167_];
				if (bool_164_)
					((Class528_Sub1) class528_sub1_160_).anIntArray8250[i_167_] = ((Class528_Sub1) this).anIntArray8250[i_167_];
				if (bool_165_)
					((Class528_Sub1) class528_sub1_160_).anIntArray8251[i_167_] = ((Class528_Sub1) this).anIntArray8251[i_167_];
			}
		} else {
			((Class528_Sub1) class528_sub1_160_).anIntArray8249 = ((Class528_Sub1) this).anIntArray8249;
			((Class528_Sub1) class528_sub1_160_).anIntArray8250 = ((Class528_Sub1) this).anIntArray8250;
			((Class528_Sub1) class528_sub1_160_).anIntArray8251 = ((Class528_Sub1) this).anIntArray8251;
		}
		if (Class129.method2197(i, ((Class528_Sub1) this).anInt8241)) {
			if (bool)
				((Class528_Sub1) class528_sub1_160_).aByte8242 |= 0x1;
			((Class528_Sub1) class528_sub1_160_).aClass143_8272 = ((Class528_Sub1) class528_sub1_161_).aClass143_8272;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8272).aByte1669 = ((Class143) ((Class528_Sub1) this).aClass143_8272).aByte1669;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8272).anInterface14_1667 = (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667);
		} else if (Class129.method2192(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) class528_sub1_160_).aClass143_8272 = ((Class528_Sub1) this).aClass143_8272;
		else
			((Class528_Sub1) class528_sub1_160_).aClass143_8272 = null;
		if (Class129.method2185(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aShortArray8260 == null || (((Class528_Sub1) class528_sub1_161_).aShortArray8260.length < ((Class528_Sub1) this).anInt8262))
				((Class528_Sub1) class528_sub1_160_).aShortArray8260 = ((Class528_Sub1) class528_sub1_161_).aShortArray8260 = new short[((Class528_Sub1) this).anInt8262];
			else
				((Class528_Sub1) class528_sub1_160_).aShortArray8260 = ((Class528_Sub1) class528_sub1_161_).aShortArray8260;
			for (int i_168_ = 0; i_168_ < ((Class528_Sub1) this).anInt8262; i_168_++)
				((Class528_Sub1) class528_sub1_160_).aShortArray8260[i_168_] = ((Class528_Sub1) this).aShortArray8260[i_168_];
		} else
			((Class528_Sub1) class528_sub1_160_).aShortArray8260 = ((Class528_Sub1) this).aShortArray8260;
		if (Class129.method2186(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aByteArray8265 == null || (((Class528_Sub1) class528_sub1_161_).aByteArray8265.length < ((Class528_Sub1) this).anInt8262))
				((Class528_Sub1) class528_sub1_160_).aByteArray8265 = ((Class528_Sub1) class528_sub1_161_).aByteArray8265 = new byte[((Class528_Sub1) this).anInt8262];
			else
				((Class528_Sub1) class528_sub1_160_).aByteArray8265 = ((Class528_Sub1) class528_sub1_161_).aByteArray8265;
			for (int i_169_ = 0; i_169_ < ((Class528_Sub1) this).anInt8262; i_169_++)
				((Class528_Sub1) class528_sub1_160_).aByteArray8265[i_169_] = ((Class528_Sub1) this).aByteArray8265[i_169_];
		} else
			((Class528_Sub1) class528_sub1_160_).aByteArray8265 = ((Class528_Sub1) this).aByteArray8265;
		if (Class129.method2199(i, ((Class528_Sub1) this).anInt8241)) {
			if (bool)
				((Class528_Sub1) class528_sub1_160_).aByte8242 |= 0x2;
			((Class528_Sub1) class528_sub1_160_).aClass143_8273 = ((Class528_Sub1) class528_sub1_161_).aClass143_8273;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8273).aByte1669 = ((Class143) ((Class528_Sub1) this).aClass143_8273).aByte1669;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8273).anInterface14_1667 = (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667);
		} else if (Class129.method2194(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) class528_sub1_160_).aClass143_8273 = ((Class528_Sub1) this).aClass143_8273;
		else
			((Class528_Sub1) class528_sub1_160_).aClass143_8273 = null;
		if (Class129.method2195(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aShortArray8255 == null || (((Class528_Sub1) class528_sub1_161_).aShortArray8255.length < ((Class528_Sub1) this).anInt8300)) {
				int i_170_ = ((Class528_Sub1) this).anInt8300;
				((Class528_Sub1) class528_sub1_160_).aShortArray8255 = ((Class528_Sub1) class528_sub1_161_).aShortArray8255 = new short[i_170_];
				((Class528_Sub1) class528_sub1_160_).aShortArray8270 = ((Class528_Sub1) class528_sub1_161_).aShortArray8270 = new short[i_170_];
				((Class528_Sub1) class528_sub1_160_).aShortArray8261 = ((Class528_Sub1) class528_sub1_161_).aShortArray8261 = new short[i_170_];
			} else {
				((Class528_Sub1) class528_sub1_160_).aShortArray8255 = ((Class528_Sub1) class528_sub1_161_).aShortArray8255;
				((Class528_Sub1) class528_sub1_160_).aShortArray8270 = ((Class528_Sub1) class528_sub1_161_).aShortArray8270;
				((Class528_Sub1) class528_sub1_160_).aShortArray8261 = ((Class528_Sub1) class528_sub1_161_).aShortArray8261;
			}
			if (((Class528_Sub1) this).aClass166_8259 != null) {
				if (((Class528_Sub1) class528_sub1_161_).aClass166_8259 == null)
					((Class528_Sub1) class528_sub1_161_).aClass166_8259 = new Class166();
				Class166 class166 = (((Class528_Sub1) class528_sub1_160_).aClass166_8259 = ((Class528_Sub1) class528_sub1_161_).aClass166_8259);
				if (((Class166) class166).aShortArray2038 == null || (((Class166) class166).aShortArray2038.length < ((Class528_Sub1) this).anInt8300)) {
					int i_171_ = ((Class528_Sub1) this).anInt8300;
					((Class166) class166).aShortArray2038 = new short[i_171_];
					((Class166) class166).aShortArray2039 = new short[i_171_];
					((Class166) class166).aShortArray2041 = new short[i_171_];
					((Class166) class166).aByteArray2040 = new byte[i_171_];
				}
				for (int i_172_ = 0; i_172_ < ((Class528_Sub1) this).anInt8300; i_172_++) {
					((Class528_Sub1) class528_sub1_160_).aShortArray8255[i_172_] = ((Class528_Sub1) this).aShortArray8255[i_172_];
					((Class528_Sub1) class528_sub1_160_).aShortArray8270[i_172_] = ((Class528_Sub1) this).aShortArray8270[i_172_];
					((Class528_Sub1) class528_sub1_160_).aShortArray8261[i_172_] = ((Class528_Sub1) this).aShortArray8261[i_172_];
					((Class166) class166).aShortArray2038[i_172_] = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038[i_172_]);
					((Class166) class166).aShortArray2039[i_172_] = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039[i_172_]);
					((Class166) class166).aShortArray2041[i_172_] = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041[i_172_]);
					((Class166) class166).aByteArray2040[i_172_] = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040[i_172_]);
				}
			} else {
				for (int i_173_ = 0; i_173_ < ((Class528_Sub1) this).anInt8300; i_173_++) {
					((Class528_Sub1) class528_sub1_160_).aShortArray8255[i_173_] = ((Class528_Sub1) this).aShortArray8255[i_173_];
					((Class528_Sub1) class528_sub1_160_).aShortArray8270[i_173_] = ((Class528_Sub1) this).aShortArray8270[i_173_];
					((Class528_Sub1) class528_sub1_160_).aShortArray8261[i_173_] = ((Class528_Sub1) this).aShortArray8261[i_173_];
				}
			}
			((Class528_Sub1) class528_sub1_160_).aByteArray8264 = ((Class528_Sub1) this).aByteArray8264;
		} else {
			((Class528_Sub1) class528_sub1_160_).aClass166_8259 = ((Class528_Sub1) this).aClass166_8259;
			((Class528_Sub1) class528_sub1_160_).aShortArray8255 = ((Class528_Sub1) this).aShortArray8255;
			((Class528_Sub1) class528_sub1_160_).aShortArray8270 = ((Class528_Sub1) this).aShortArray8270;
			((Class528_Sub1) class528_sub1_160_).aShortArray8261 = ((Class528_Sub1) this).aShortArray8261;
			((Class528_Sub1) class528_sub1_160_).aByteArray8264 = ((Class528_Sub1) this).aByteArray8264;
		}
		if (Class129.method2261(i, ((Class528_Sub1) this).anInt8241)) {
			if (bool)
				((Class528_Sub1) class528_sub1_160_).aByte8242 |= 0x4;
			((Class528_Sub1) class528_sub1_160_).aClass143_8274 = ((Class528_Sub1) class528_sub1_161_).aClass143_8274;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8274).aByte1669 = ((Class143) ((Class528_Sub1) this).aClass143_8274).aByte1669;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8274).anInterface14_1667 = (((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667);
		} else if (Class129.method2193(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) class528_sub1_160_).aClass143_8274 = ((Class528_Sub1) this).aClass143_8274;
		else
			((Class528_Sub1) class528_sub1_160_).aClass143_8274 = null;
		if (Class129.method2242(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aFloatArray8297 == null || (((Class528_Sub1) class528_sub1_161_).aFloatArray8297.length < ((Class528_Sub1) this).anInt8262)) {
				int i_174_ = ((Class528_Sub1) this).anInt8300;
				((Class528_Sub1) class528_sub1_160_).aFloatArray8297 = ((Class528_Sub1) class528_sub1_161_).aFloatArray8297 = new float[i_174_];
				((Class528_Sub1) class528_sub1_160_).aFloatArray8292 = ((Class528_Sub1) class528_sub1_161_).aFloatArray8292 = new float[i_174_];
			} else {
				((Class528_Sub1) class528_sub1_160_).aFloatArray8297 = ((Class528_Sub1) class528_sub1_161_).aFloatArray8297;
				((Class528_Sub1) class528_sub1_160_).aFloatArray8292 = ((Class528_Sub1) class528_sub1_161_).aFloatArray8292;
			}
			for (int i_175_ = 0; i_175_ < ((Class528_Sub1) this).anInt8300; i_175_++) {
				((Class528_Sub1) class528_sub1_160_).aFloatArray8297[i_175_] = ((Class528_Sub1) this).aFloatArray8297[i_175_];
				((Class528_Sub1) class528_sub1_160_).aFloatArray8292[i_175_] = ((Class528_Sub1) this).aFloatArray8292[i_175_];
			}
		} else {
			((Class528_Sub1) class528_sub1_160_).aFloatArray8297 = ((Class528_Sub1) this).aFloatArray8297;
			((Class528_Sub1) class528_sub1_160_).aFloatArray8292 = ((Class528_Sub1) this).aFloatArray8292;
		}
		if (Class129.method2200(i, ((Class528_Sub1) this).anInt8241)) {
			if (bool)
				((Class528_Sub1) class528_sub1_160_).aByte8242 |= 0x8;
			((Class528_Sub1) class528_sub1_160_).aClass143_8275 = ((Class528_Sub1) class528_sub1_161_).aClass143_8275;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8275).aByte1669 = ((Class143) ((Class528_Sub1) this).aClass143_8275).aByte1669;
			((Class143) ((Class528_Sub1) class528_sub1_160_).aClass143_8275).anInterface14_1667 = (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667);
		} else if (Class129.method2201(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) class528_sub1_160_).aClass143_8275 = ((Class528_Sub1) this).aClass143_8275;
		else
			((Class528_Sub1) class528_sub1_160_).aClass143_8275 = null;
		if (Class129.method2188(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aShortArray8266 == null || (((Class528_Sub1) class528_sub1_161_).aShortArray8266.length < ((Class528_Sub1) this).anInt8262)) {
				int i_176_ = ((Class528_Sub1) this).anInt8262;
				((Class528_Sub1) class528_sub1_160_).aShortArray8266 = ((Class528_Sub1) class528_sub1_161_).aShortArray8266 = new short[i_176_];
				((Class528_Sub1) class528_sub1_160_).aShortArray8267 = ((Class528_Sub1) class528_sub1_161_).aShortArray8267 = new short[i_176_];
				((Class528_Sub1) class528_sub1_160_).aShortArray8256 = ((Class528_Sub1) class528_sub1_161_).aShortArray8256 = new short[i_176_];
			} else {
				((Class528_Sub1) class528_sub1_160_).aShortArray8266 = ((Class528_Sub1) class528_sub1_161_).aShortArray8266;
				((Class528_Sub1) class528_sub1_160_).aShortArray8267 = ((Class528_Sub1) class528_sub1_161_).aShortArray8267;
				((Class528_Sub1) class528_sub1_160_).aShortArray8256 = ((Class528_Sub1) class528_sub1_161_).aShortArray8256;
			}
			for (int i_177_ = 0; i_177_ < ((Class528_Sub1) this).anInt8262; i_177_++) {
				((Class528_Sub1) class528_sub1_160_).aShortArray8266[i_177_] = ((Class528_Sub1) this).aShortArray8266[i_177_];
				((Class528_Sub1) class528_sub1_160_).aShortArray8267[i_177_] = ((Class528_Sub1) this).aShortArray8267[i_177_];
				((Class528_Sub1) class528_sub1_160_).aShortArray8256[i_177_] = ((Class528_Sub1) this).aShortArray8256[i_177_];
			}
		} else {
			((Class528_Sub1) class528_sub1_160_).aShortArray8266 = ((Class528_Sub1) this).aShortArray8266;
			((Class528_Sub1) class528_sub1_160_).aShortArray8267 = ((Class528_Sub1) this).aShortArray8267;
			((Class528_Sub1) class528_sub1_160_).aShortArray8256 = ((Class528_Sub1) this).aShortArray8256;
		}
		if (Class129.method2283(i, ((Class528_Sub1) this).anInt8241)) {
			if (bool)
				((Class528_Sub1) class528_sub1_160_).aByte8242 |= 0x10;
			((Class528_Sub1) class528_sub1_160_).aClass132_8276 = ((Class528_Sub1) class528_sub1_161_).aClass132_8276;
			((Class132) ((Class528_Sub1) class528_sub1_160_).aClass132_8276).anInterface15_1595 = (((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595);
		} else if (Class129.method2196(i, ((Class528_Sub1) this).anInt8241))
			((Class528_Sub1) class528_sub1_160_).aClass132_8276 = ((Class528_Sub1) this).aClass132_8276;
		else
			((Class528_Sub1) class528_sub1_160_).aClass132_8276 = null;
		if (Class129.method2189(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aShortArray8269 == null || (((Class528_Sub1) class528_sub1_161_).aShortArray8269.length < ((Class528_Sub1) this).anInt8262)) {
				int i_178_ = ((Class528_Sub1) this).anInt8262;
				((Class528_Sub1) class528_sub1_160_).aShortArray8269 = ((Class528_Sub1) class528_sub1_161_).aShortArray8269 = new short[i_178_];
			} else
				((Class528_Sub1) class528_sub1_160_).aShortArray8269 = ((Class528_Sub1) class528_sub1_161_).aShortArray8269;
			for (int i_179_ = 0; i_179_ < ((Class528_Sub1) this).anInt8262; i_179_++)
				((Class528_Sub1) class528_sub1_160_).aShortArray8269[i_179_] = ((Class528_Sub1) this).aShortArray8269[i_179_];
		} else
			((Class528_Sub1) class528_sub1_160_).aShortArray8269 = ((Class528_Sub1) this).aShortArray8269;
		if (Class129.method2190(i, ((Class528_Sub1) this).anInt8241)) {
			if (((Class528_Sub1) class528_sub1_161_).aClass145Array8258 == null || ((((Class528_Sub1) class528_sub1_161_).aClass145Array8258).length < ((Class528_Sub1) this).anInt8294)) {
				int i_180_ = ((Class528_Sub1) this).anInt8294;
				((Class528_Sub1) class528_sub1_160_).aClass145Array8258 = ((Class528_Sub1) class528_sub1_161_).aClass145Array8258 = new Class145[i_180_];
				for (int i_181_ = 0; i_181_ < ((Class528_Sub1) this).anInt8294; i_181_++)
					((Class528_Sub1) class528_sub1_160_).aClass145Array8258[i_181_] = ((Class528_Sub1) this).aClass145Array8258[i_181_].method2451();
			} else {
				((Class528_Sub1) class528_sub1_160_).aClass145Array8258 = ((Class528_Sub1) class528_sub1_161_).aClass145Array8258;
				for (int i_182_ = 0; i_182_ < ((Class528_Sub1) this).anInt8294; i_182_++)
					((Class528_Sub1) class528_sub1_160_).aClass145Array8258[i_182_].method2452(((Class528_Sub1) this).aClass145Array8258[i_182_]);
			}
		} else
			((Class528_Sub1) class528_sub1_160_).aClass145Array8258 = ((Class528_Sub1) this).aClass145Array8258;
		((Class528_Sub1) class528_sub1_160_).aClass162Array8295 = ((Class528_Sub1) this).aClass162Array8295;
		if (((Class528_Sub1) this).aBool8254) {
			((Class528_Sub1) class528_sub1_160_).anInt8280 = ((Class528_Sub1) this).anInt8280;
			((Class528_Sub1) class528_sub1_160_).anInt8281 = ((Class528_Sub1) this).anInt8281;
			((Class528_Sub1) class528_sub1_160_).aShort8285 = ((Class528_Sub1) this).aShort8285;
			((Class528_Sub1) class528_sub1_160_).aShort8286 = ((Class528_Sub1) this).aShort8286;
			((Class528_Sub1) class528_sub1_160_).aShort8283 = ((Class528_Sub1) this).aShort8283;
			((Class528_Sub1) class528_sub1_160_).aShort8284 = ((Class528_Sub1) this).aShort8284;
			((Class528_Sub1) class528_sub1_160_).aShort8287 = ((Class528_Sub1) this).aShort8287;
			((Class528_Sub1) class528_sub1_160_).aShort8306 = ((Class528_Sub1) this).aShort8306;
			((Class528_Sub1) class528_sub1_160_).aBool8254 = true;
		} else
			((Class528_Sub1) class528_sub1_160_).aBool8254 = false;
		((Class528_Sub1) class528_sub1_160_).anIntArrayArray8263 = ((Class528_Sub1) this).anIntArrayArray8263;
		((Class528_Sub1) class528_sub1_160_).anIntArrayArray8282 = ((Class528_Sub1) this).anIntArrayArray8282;
		((Class528_Sub1) class528_sub1_160_).anIntArrayArray8278 = ((Class528_Sub1) this).anIntArrayArray8278;
		((Class528_Sub1) class528_sub1_160_).aShortArray8288 = ((Class528_Sub1) this).aShortArray8288;
		((Class528_Sub1) class528_sub1_160_).anIntArray8290 = ((Class528_Sub1) this).anIntArray8290;
		((Class528_Sub1) class528_sub1_160_).aShortArray8253 = ((Class528_Sub1) this).aShortArray8253;
		((Class528_Sub1) class528_sub1_160_).aShortArray8304 = ((Class528_Sub1) this).aShortArray8304;
		((Class528_Sub1) class528_sub1_160_).anIntArray8289 = ((Class528_Sub1) this).anIntArray8289;
		((Class528_Sub1) class528_sub1_160_).aClass87Array8252 = ((Class528_Sub1) this).aClass87Array8252;
		((Class528_Sub1) class528_sub1_160_).aClass172Array8244 = ((Class528_Sub1) this).aClass172Array8244;
		return class528_sub1_160_;
	}

	void method13525() {
		if (((Class528_Sub1) this).aBool8279) {
			((Class528_Sub1) this).aBool8279 = false;
			if (((Class528_Sub1) this).aClass87Array8252 == null && ((Class528_Sub1) this).aClass172Array8244 == null && ((Class528_Sub1) this).aClass162Array8295 == null && !Class129.method2183(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				boolean bool = false;
				boolean bool_183_ = false;
				boolean bool_184_ = false;
				if (((Class528_Sub1) this).anIntArray8249 != null && !Class129.method2202(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (((Class528_Sub1) this).anIntArray8250 != null && !Class129.method2229(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool_183_ = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (((Class528_Sub1) this).anIntArray8251 != null && !Class129.method2252(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool_184_ = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (bool)
					((Class528_Sub1) this).anIntArray8249 = null;
				if (bool_183_)
					((Class528_Sub1) this).anIntArray8250 = null;
				if (bool_184_)
					((Class528_Sub1) this).anIntArray8251 = null;
			}
			if (((Class528_Sub1) this).aShortArray8288 != null && ((Class528_Sub1) this).anIntArray8249 == null && ((Class528_Sub1) this).anIntArray8250 == null && ((Class528_Sub1) this).anIntArray8251 == null) {
				((Class528_Sub1) this).aShortArray8288 = null;
				((Class528_Sub1) this).anIntArray8290 = null;
			}
			if (((Class528_Sub1) this).aByteArray8264 != null && !Class129.method2204(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8274 != null) {
					if ((((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) != null) {
						((Class528_Sub1) this).aShortArray8261 = null;
						((Class528_Sub1) this).aShortArray8270 = null;
						((Class528_Sub1) this).aShortArray8255 = null;
						((Class528_Sub1) this).aByteArray8264 = null;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				} else if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null) {
					((Class528_Sub1) this).aShortArray8261 = null;
					((Class528_Sub1) this).aShortArray8270 = null;
					((Class528_Sub1) this).aShortArray8255 = null;
					((Class528_Sub1) this).aByteArray8264 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8260 != null && !Class129.method2205(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aShortArray8260 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aByteArray8265 != null && !Class129.method2206(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aByteArray8265 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aFloatArray8297 != null && !Class129.method2241(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8275 == null || (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) != null) {
					((Class528_Sub1) this).aFloatArray8292 = null;
					((Class528_Sub1) this).aFloatArray8297 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8269 != null && !Class129.method2212(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aShortArray8269 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8266 != null && !Class129.method2211(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if ((((Class528_Sub1) this).aClass132_8276 == null || (((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) != null) && (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)) {
					((Class528_Sub1) this).aShortArray8256 = null;
					((Class528_Sub1) this).aShortArray8267 = null;
					((Class528_Sub1) this).aShortArray8266 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).anIntArrayArray8282 != null && !Class129.method2208(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				((Class528_Sub1) this).anIntArrayArray8282 = null;
				((Class528_Sub1) this).aShortArray8304 = null;
			}
			if (((Class528_Sub1) this).anIntArrayArray8263 != null && !Class129.method2226(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				((Class528_Sub1) this).anIntArrayArray8263 = null;
				((Class528_Sub1) this).aShortArray8253 = null;
			}
			if (((Class528_Sub1) this).anIntArrayArray8278 != null && !Class129.method2260(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241))
				((Class528_Sub1) this).anIntArrayArray8278 = null;
			if (((Class528_Sub1) this).anIntArray8289 != null && (((Class528_Sub1) this).anInt8240 & 0x800) == 0 && (((Class528_Sub1) this).anInt8240 & 0x40000) == 0)
				((Class528_Sub1) this).anIntArray8289 = null;
		}
	}

	public void f(int i) {
		int i_185_ = Class382.anIntArray4657[i];
		int i_186_ = Class382.anIntArray4661[i];
		for (int i_187_ = 0; i_187_ < ((Class528_Sub1) this).anInt8248; i_187_++) {
			int i_188_ = ((((Class528_Sub1) this).anIntArray8251[i_187_] * i_185_ + ((Class528_Sub1) this).anIntArray8249[i_187_] * i_186_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_187_] = ((((Class528_Sub1) this).anIntArray8251[i_187_] * i_186_ - ((Class528_Sub1) this).anIntArray8249[i_187_] * i_185_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_187_] = i_188_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void S(int i) {
		int i_189_ = Class382.anIntArray4657[i];
		int i_190_ = Class382.anIntArray4661[i];
		for (int i_191_ = 0; i_191_ < ((Class528_Sub1) this).anInt8248; i_191_++) {
			int i_192_ = ((((Class528_Sub1) this).anIntArray8251[i_191_] * i_189_ + ((Class528_Sub1) this).anIntArray8249[i_191_] * i_190_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_191_] = ((((Class528_Sub1) this).anIntArray8251[i_191_] * i_190_ - ((Class528_Sub1) this).anIntArray8249[i_191_] * i_189_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_191_] = i_192_;
		}
		for (int i_193_ = 0; i_193_ < ((Class528_Sub1) this).anInt8300; i_193_++) {
			int i_194_ = ((((Class528_Sub1) this).aShortArray8261[i_193_] * i_189_ + ((Class528_Sub1) this).aShortArray8255[i_193_] * i_190_) >> 14);
			((Class528_Sub1) this).aShortArray8261[i_193_] = (short) (((((Class528_Sub1) this).aShortArray8261[i_193_] * i_190_) - (((Class528_Sub1) this).aShortArray8255[i_193_] * i_189_)) >> 14);
			((Class528_Sub1) this).aShortArray8255[i_193_] = (short) i_194_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void t(int i) {
		int i_195_ = Class382.anIntArray4657[i];
		int i_196_ = Class382.anIntArray4661[i];
		for (int i_197_ = 0; i_197_ < ((Class528_Sub1) this).anInt8248; i_197_++) {
			int i_198_ = ((((Class528_Sub1) this).anIntArray8250[i_197_] * i_196_ - ((Class528_Sub1) this).anIntArray8251[i_197_] * i_195_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_197_] = ((((Class528_Sub1) this).anIntArray8250[i_197_] * i_195_ + ((Class528_Sub1) this).anIntArray8251[i_197_] * i_196_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_197_] = i_198_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	static short[] method13526(short[] is, int i) {
		short[] is_199_ = new short[i];
		System.arraycopy(is, 0, is_199_, 0, i);
		return is_199_;
	}

	short method13527(RSMesh class157, int i, long l, int i_200_, int i_201_, int i_202_, int i_203_, float f, float f_204_) {
		int i_205_ = ((Class528_Sub1) this).anIntArray8290[i];
		int i_206_ = ((Class528_Sub1) this).anIntArray8290[i + 1];
		int i_207_ = 0;
		for (int i_208_ = i_205_; i_208_ < i_206_; i_208_++) {
			short i_209_ = ((Class528_Sub1) this).aShortArray8288[i_208_];
			if (i_209_ == 0) {
				i_207_ = i_208_;
				break;
			}
			if (aLongArray8298[i_208_] == l)
				return (short) (i_209_ - 1);
		}
		((Class528_Sub1) this).aShortArray8288[i_207_] = (short) (((Class528_Sub1) this).anInt8300 + 1);
		aLongArray8298[i_207_] = l;
		((Class528_Sub1) this).aShortArray8255[(((Class528_Sub1) this).anInt8300)] = (short) i_200_;
		((Class528_Sub1) this).aShortArray8270[(((Class528_Sub1) this).anInt8300)] = (short) i_201_;
		((Class528_Sub1) this).aShortArray8261[(((Class528_Sub1) this).anInt8300)] = (short) i_202_;
		((Class528_Sub1) this).aByteArray8264[((Class528_Sub1) this).anInt8300] = (byte) i_203_;
		((Class528_Sub1) this).aFloatArray8297[(((Class528_Sub1) this).anInt8300)] = f;
		((Class528_Sub1) this).aFloatArray8292[(((Class528_Sub1) this).anInt8300)] = f_204_;
		return (short) ((Class528_Sub1) this).anInt8300++;
	}

	public void wa() {
		for (int i = 0; i < ((Class528_Sub1) this).anInt8248; i++)
			((Class528_Sub1) this).anIntArray8251[i] = -((Class528_Sub1) this).anIntArray8251[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8300; i++)
			((Class528_Sub1) this).aShortArray8261[i] = (short) -((Class528_Sub1) this).aShortArray8261[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8262; i++) {
			short i_210_ = ((Class528_Sub1) this).aShortArray8266[i];
			((Class528_Sub1) this).aShortArray8266[i] = ((Class528_Sub1) this).aShortArray8256[i];
			((Class528_Sub1) this).aShortArray8256[i] = i_210_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass132_8276 != null)
			((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void oa(int i, int i_211_, int i_212_) {
		for (int i_213_ = 0; i_213_ < ((Class528_Sub1) this).anInt8248; i_213_++) {
			if (i != 128)
				((Class528_Sub1) this).anIntArray8249[i_213_] = ((Class528_Sub1) this).anIntArray8249[i_213_] * i >> 7;
			if (i_211_ != 128)
				((Class528_Sub1) this).anIntArray8250[i_213_] = (((Class528_Sub1) this).anIntArray8250[i_213_] * i_211_ >> 7);
			if (i_212_ != 128)
				((Class528_Sub1) this).anIntArray8251[i_213_] = (((Class528_Sub1) this).anIntArray8251[i_213_] * i_212_ >> 7);
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void pa(int i, int i_214_, Class390 class390, Class390 class390_215_, int i_216_, int i_217_, int i_218_) {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i_219_ = i_216_ + ((Class528_Sub1) this).aShort8285;
		int i_220_ = i_216_ + ((Class528_Sub1) this).aShort8286;
		int i_221_ = i_218_ + ((Class528_Sub1) this).aShort8287;
		int i_222_ = i_218_ + ((Class528_Sub1) this).aShort8306;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_219_ >= 0 && ((i_220_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4776 * -1843860823) && i_221_ >= 0 && ((i_222_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4773 * 1826078169))) {
			if (i == 4 || i == 5) {
				if (class390_215_ == null || (i_219_ < 0 || ((i_220_ + class390_215_.anInt4774 * 750971439 >> class390_215_.anInt4775 * 1856651955) >= class390_215_.anInt4776 * -1843860823) || i_221_ < 0 || ((i_222_ + class390_215_.anInt4774 * 750971439 >> class390_215_.anInt4775 * 1856651955) >= class390_215_.anInt4773 * 1826078169)))
					return;
			} else {
				i_219_ >>= class390.anInt4775 * 1856651955;
				i_220_ = (i_220_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				i_221_ >>= class390.anInt4775 * 1856651955;
				i_222_ = (i_222_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				if (class390.method6722(i_219_, i_221_, 65280) == i_217_ && class390.method6722(i_220_, i_221_, 65280) == i_217_ && class390.method6722(i_219_, i_222_, 65280) == i_217_ && class390.method6722(i_220_, i_222_, 65280) == i_217_)
					return;
			}
			if (i == 1) {
				for (int i_223_ = 0; i_223_ < ((Class528_Sub1) this).anInt8248; i_223_++)
					((Class528_Sub1) this).anIntArray8250[i_223_] = (((Class528_Sub1) this).anIntArray8250[i_223_] + class390.method6709(((((Class528_Sub1) this).anIntArray8249[i_223_]) + i_216_), ((((Class528_Sub1) this).anIntArray8251[i_223_]) + i_218_), -1387107702) - i_217_);
			} else if (i == 2) {
				int i_224_ = ((Class528_Sub1) this).aShort8283;
				if (i_224_ == 0)
					return;
				for (int i_225_ = 0; i_225_ < ((Class528_Sub1) this).anInt8248; i_225_++) {
					int i_226_ = (((Class528_Sub1) this).anIntArray8250[i_225_] << 16) / i_224_;
					if (i_226_ < i_214_)
						((Class528_Sub1) this).anIntArray8250[i_225_] = (((Class528_Sub1) this).anIntArray8250[i_225_] + (class390.method6709((((Class528_Sub1) this).anIntArray8249[i_225_]) + i_216_, (((Class528_Sub1) this).anIntArray8251[i_225_]) + i_218_, -1521723837) - i_217_) * (i_214_ - i_226_) / i_214_);
				}
			} else if (i == 3) {
				int i_227_ = (i_214_ & 0xff) * 4;
				int i_228_ = (i_214_ >> 8 & 0xff) * 4;
				int i_229_ = (i_214_ >> 16 & 0xff) << 6;
				int i_230_ = (i_214_ >> 24 & 0xff) << 6;
				if (i_216_ - (i_227_ >> 1) < 0 || (i_216_ + (i_227_ >> 1) + class390.anInt4774 * 750971439 >= (class390.anInt4776 * -1843860823 << class390.anInt4775 * 1856651955)) || i_218_ - (i_228_ >> 1) < 0 || (i_218_ + (i_228_ >> 1) + class390.anInt4774 * 750971439 >= (class390.anInt4773 * 1826078169 << class390.anInt4775 * 1856651955)))
					return;
				method11281(class390, i_216_, i_217_, i_218_, i_227_, i_228_, i_229_, i_230_);
			} else if (i == 4) {
				int i_231_ = (((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283);
				for (int i_232_ = 0; i_232_ < ((Class528_Sub1) this).anInt8248; i_232_++)
					((Class528_Sub1) this).anIntArray8250[i_232_] = (((Class528_Sub1) this).anIntArray8250[i_232_] + (class390_215_.method6709((((Class528_Sub1) this).anIntArray8249[i_232_]) + i_216_, (((Class528_Sub1) this).anIntArray8251[i_232_]) + i_218_, -1198373770) - i_217_) + i_231_);
			} else if (i == 5) {
				int i_233_ = (((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283);
				for (int i_234_ = 0; i_234_ < ((Class528_Sub1) this).anInt8248; i_234_++) {
					int i_235_ = (((Class528_Sub1) this).anIntArray8249[i_234_] + i_216_);
					int i_236_ = (((Class528_Sub1) this).anIntArray8251[i_234_] + i_218_);
					int i_237_ = class390.method6709(i_235_, i_236_, 1985293645);
					int i_238_ = class390_215_.method6709(i_235_, i_236_, -1040497678);
					int i_239_ = i_237_ - i_238_ - i_214_;
					((Class528_Sub1) this).anIntArray8250[i_234_] = ((((Class528_Sub1) this).anIntArray8250[i_234_] << 8) / i_233_ * i_239_ >> 8) - (i_217_ - i_237_);
				}
			}
			if (((Class528_Sub1) this).aClass143_8272 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
			((Class528_Sub1) this).aBool8254 = false;
		}
	}

	void method13528() {
		int i = 32767;
		int i_240_ = 32767;
		int i_241_ = 32767;
		int i_242_ = -32768;
		int i_243_ = -32768;
		int i_244_ = -32768;
		int i_245_ = 0;
		int i_246_ = 0;
		for (int i_247_ = 0; i_247_ < ((Class528_Sub1) this).anInt8248; i_247_++) {
			int i_248_ = ((Class528_Sub1) this).anIntArray8249[i_247_];
			int i_249_ = ((Class528_Sub1) this).anIntArray8250[i_247_];
			int i_250_ = ((Class528_Sub1) this).anIntArray8251[i_247_];
			if (i_248_ < i)
				i = i_248_;
			if (i_248_ > i_242_)
				i_242_ = i_248_;
			if (i_249_ < i_240_)
				i_240_ = i_249_;
			if (i_249_ > i_243_)
				i_243_ = i_249_;
			if (i_250_ < i_241_)
				i_241_ = i_250_;
			if (i_250_ > i_244_)
				i_244_ = i_250_;
			int i_251_ = i_248_ * i_248_ + i_250_ * i_250_;
			if (i_251_ > i_245_)
				i_245_ = i_251_;
			i_251_ = i_248_ * i_248_ + i_250_ * i_250_ + i_249_ * i_249_;
			if (i_251_ > i_246_)
				i_246_ = i_251_;
		}
		((Class528_Sub1) this).aShort8285 = (short) i;
		((Class528_Sub1) this).aShort8286 = (short) i_242_;
		((Class528_Sub1) this).aShort8283 = (short) i_240_;
		((Class528_Sub1) this).aShort8284 = (short) i_243_;
		((Class528_Sub1) this).aShort8287 = (short) i_241_;
		((Class528_Sub1) this).aShort8306 = (short) i_244_;
		((Class528_Sub1) this).anInt8281 = (int) (Math.sqrt((double) i_245_) + 0.99);
		((Class528_Sub1) this).anInt8280 = (int) (Math.sqrt((double) i_246_) + 0.99);
		((Class528_Sub1) this).aBool8254 = true;
	}

	public int N() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8281;
	}

	public int n() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8280;
	}

	public int RA() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8285;
	}

	public void method11294(Matrix44Var class294) {
		Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
		class384.method6522(class294);
		if (((Class528_Sub1) this).aClass87Array8252 != null) {
			for (int i = 0; i < ((Class528_Sub1) this).aClass87Array8252.length; i++) {
				Class87 class87 = ((Class528_Sub1) this).aClass87Array8252[i];
				Class87 class87_252_ = class87;
				if (class87.aClass87_835 != null)
					class87_252_ = class87.aClass87_835;
				class87_252_.anInt844 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_252_.anInt841 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_252_.anInt847 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_252_.anInt834 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_252_.anInt843 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_252_.anInt845 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_252_.anInt846 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_252_.anInt840 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_252_.anInt848 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub1) this).aClass172Array8244 != null) {
			for (int i = 0; i < ((Class528_Sub1) this).aClass172Array8244.length; i++) {
				Class172 class172 = ((Class528_Sub1) this).aClass172Array8244[i];
				Class172 class172_253_ = class172;
				if (class172.aClass172_2114 != null)
					class172_253_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Matrix44Arr(class384);
				class172_253_.anInt2113 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_253_.anInt2117 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_253_.anInt2118 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	public int YA() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8283;
	}

	public int o() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8284;
	}

	public int AA() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8287;
	}

	static short[] method13529(short[] is, int i) {
		short[] is_254_ = new short[i];
		System.arraycopy(is, 0, is_254_, 0, i);
		return is_254_;
	}

	public void method11269(MeshRasterizer class528, int i, int i_255_, int i_256_, boolean bool) {
		Class528_Sub1 class528_sub1_257_ = (Class528_Sub1) class528;
		if (((Class528_Sub1) this).anInt8262 != 0 && ((Class528_Sub1) class528_sub1_257_).anInt8262 != 0) {
			int i_258_ = ((Class528_Sub1) class528_sub1_257_).anInt8248;
			int[] is = ((Class528_Sub1) class528_sub1_257_).anIntArray8249;
			int[] is_259_ = ((Class528_Sub1) class528_sub1_257_).anIntArray8250;
			int[] is_260_ = ((Class528_Sub1) class528_sub1_257_).anIntArray8251;
			short[] is_261_ = ((Class528_Sub1) class528_sub1_257_).aShortArray8255;
			short[] is_262_ = ((Class528_Sub1) class528_sub1_257_).aShortArray8270;
			short[] is_263_ = ((Class528_Sub1) class528_sub1_257_).aShortArray8261;
			byte[] is_264_ = ((Class528_Sub1) class528_sub1_257_).aByteArray8264;
			short[] is_265_;
			short[] is_266_;
			short[] is_267_;
			byte[] is_268_;
			if (((Class528_Sub1) this).aClass166_8259 != null) {
				is_265_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
				is_266_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
				is_267_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
				is_268_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
			} else {
				is_265_ = null;
				is_266_ = null;
				is_267_ = null;
				is_268_ = null;
			}
			short[] is_269_;
			short[] is_270_;
			short[] is_271_;
			byte[] is_272_;
			if (((Class528_Sub1) class528_sub1_257_).aClass166_8259 != null) {
				is_269_ = ((Class166) (((Class528_Sub1) class528_sub1_257_).aClass166_8259)).aShortArray2038;
				is_270_ = ((Class166) (((Class528_Sub1) class528_sub1_257_).aClass166_8259)).aShortArray2039;
				is_271_ = ((Class166) (((Class528_Sub1) class528_sub1_257_).aClass166_8259)).aShortArray2041;
				is_272_ = ((Class166) (((Class528_Sub1) class528_sub1_257_).aClass166_8259)).aByteArray2040;
			} else {
				is_269_ = null;
				is_270_ = null;
				is_271_ = null;
				is_272_ = null;
			}
			int[] is_273_ = ((Class528_Sub1) class528_sub1_257_).anIntArray8290;
			short[] is_274_ = ((Class528_Sub1) class528_sub1_257_).aShortArray8288;
			if (!((Class528_Sub1) class528_sub1_257_).aBool8254)
				class528_sub1_257_.method13528();
			int i_275_ = ((Class528_Sub1) class528_sub1_257_).aShort8283;
			int i_276_ = ((Class528_Sub1) class528_sub1_257_).aShort8284;
			int i_277_ = ((Class528_Sub1) class528_sub1_257_).aShort8285;
			int i_278_ = ((Class528_Sub1) class528_sub1_257_).aShort8286;
			int i_279_ = ((Class528_Sub1) class528_sub1_257_).aShort8287;
			int i_280_ = ((Class528_Sub1) class528_sub1_257_).aShort8306;
			for (int i_281_ = 0; i_281_ < ((Class528_Sub1) this).anInt8248; i_281_++) {
				int i_282_ = ((Class528_Sub1) this).anIntArray8250[i_281_] - i_255_;
				if (i_282_ >= i_275_ && i_282_ <= i_276_) {
					int i_283_ = ((Class528_Sub1) this).anIntArray8249[i_281_] - i;
					if (i_283_ >= i_277_ && i_283_ <= i_278_) {
						int i_284_ = (((Class528_Sub1) this).anIntArray8251[i_281_] - i_256_);
						if (i_284_ >= i_279_ && i_284_ <= i_280_) {
							int i_285_ = -1;
							int i_286_ = (((Class528_Sub1) this).anIntArray8290[i_281_]);
							int i_287_ = (((Class528_Sub1) this).anIntArray8290[i_281_ + 1]);
							for (int i_288_ = i_286_; i_288_ < i_287_; i_288_++) {
								i_285_ = (((Class528_Sub1) this).aShortArray8288[i_288_]) - 1;
								if (i_285_ == -1 || (((Class528_Sub1) this).aByteArray8264[i_285_]) != 0)
									break;
							}
							if (i_285_ != -1) {
								for (int i_289_ = 0; i_289_ < i_258_; i_289_++) {
									if (i_283_ == is[i_289_] && i_284_ == is_260_[i_289_] && i_282_ == is_259_[i_289_]) {
										int i_290_ = -1;
										i_286_ = is_273_[i_289_];
										i_287_ = is_273_[i_289_ + 1];
										for (int i_291_ = i_286_; i_291_ < i_287_; i_291_++) {
											i_290_ = is_274_[i_291_] - 1;
											if (i_290_ == -1 || is_264_[i_290_] != 0)
												break;
										}
										if (i_290_ != -1) {
											if (is_265_ == null) {
												((Class528_Sub1) this).aClass166_8259 = new Class166();
												is_265_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2038 = (Class512.method8761((((Class528_Sub1) this).aShortArray8255), 1163073804));
												is_266_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2039 = (Class512.method8761((((Class528_Sub1) this).aShortArray8270), 756820826));
												is_267_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2041 = (Class512.method8761((((Class528_Sub1) this).aShortArray8261), 330065192));
												is_268_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aByteArray2040 = (AnimationSkeleton.method15090((((Class528_Sub1) this).aByteArray8264), -2131769524));
											}
											if (is_269_ == null) {
												Class166 class166 = (((Class528_Sub1) class528_sub1_257_).aClass166_8259 = new Class166());
												is_269_ = ((Class166) class166).aShortArray2038 = (Class512.method8761(is_261_, 288283736));
												is_270_ = ((Class166) class166).aShortArray2039 = (Class512.method8761(is_262_, 1683067635));
												is_271_ = ((Class166) class166).aShortArray2041 = (Class512.method8761(is_263_, 22410603));
												is_272_ = ((Class166) class166).aByteArray2040 = (AnimationSkeleton.method15090(is_264_, -2141806379));
											}
											short i_292_ = (((Class528_Sub1) this).aShortArray8255[i_285_]);
											short i_293_ = (((Class528_Sub1) this).aShortArray8270[i_285_]);
											short i_294_ = (((Class528_Sub1) this).aShortArray8261[i_285_]);
											byte i_295_ = (((Class528_Sub1) this).aByteArray8264[i_285_]);
											i_286_ = is_273_[i_289_];
											i_287_ = is_273_[i_289_ + 1];
											for (int i_296_ = i_286_; i_296_ < i_287_; i_296_++) {
												int i_297_ = is_274_[i_296_] - 1;
												if (i_297_ == -1)
													break;
												if (is_272_[i_297_] != 0) {
													is_269_[i_297_] += i_292_;
													is_270_[i_297_] += i_293_;
													is_271_[i_297_] += i_294_;
													is_272_[i_297_] += i_295_;
												}
											}
											i_292_ = is_261_[i_290_];
											i_293_ = is_262_[i_290_];
											i_294_ = is_263_[i_290_];
											i_295_ = is_264_[i_290_];
											i_286_ = (((Class528_Sub1) this).anIntArray8290[i_281_]);
											i_287_ = (((Class528_Sub1) this).anIntArray8290[i_281_ + 1]);
											for (int i_298_ = i_286_; i_298_ < i_287_; i_298_++) {
												int i_299_ = ((((Class528_Sub1) this).aShortArray8288[i_298_]) - 1);
												if (i_299_ == -1)
													break;
												if (is_268_[i_299_] != 0) {
													is_265_[i_299_] += i_292_;
													is_266_[i_299_] += i_293_;
													is_267_[i_299_] += i_294_;
													is_268_[i_299_] += i_295_;
												}
											}
											if ((((Class528_Sub1) this).aClass143_8274) == null && (((Class528_Sub1) this).aClass143_8273) != null)
												((Class143) (((Class528_Sub1) this).aClass143_8273)).anInterface14_1667 = null;
											if ((((Class528_Sub1) this).aClass143_8274) != null)
												((Class143) (((Class528_Sub1) this).aClass143_8274)).anInterface14_1667 = null;
											if ((((Class528_Sub1) class528_sub1_257_).aClass143_8274) == null && (((Class528_Sub1) class528_sub1_257_).aClass143_8273) != null)
												((Class143) (((Class528_Sub1) class528_sub1_257_).aClass143_8273)).anInterface14_1667 = null;
											if ((((Class528_Sub1) class528_sub1_257_).aClass143_8274) != null)
												((Class143) (((Class528_Sub1) class528_sub1_257_).aClass143_8274)).anInterface14_1667 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void p(int i) {
		((Class528_Sub1) this).aShort8243 = (short) i;
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public void Q(int i) {
		((Class528_Sub1) this).aShort8257 = (short) i;
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
	}

	static final int method13530(int i, int i_300_) {
		i_300_ = i_300_ * (i & 0x7f) >> 7;
		if (i_300_ < 2)
			i_300_ = 2;
		else if (i_300_ > 126)
			i_300_ = 126;
		return (i & 0xff80) + i_300_;
	}

	public int Z() {
		return ((Class528_Sub1) this).aShort8257;
	}

	public void method11315(Matrix44Var class294) {
		Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
		class384.method6522(class294);
		if (((Class528_Sub1) this).aClass87Array8252 != null) {
			for (int i = 0; i < ((Class528_Sub1) this).aClass87Array8252.length; i++) {
				Class87 class87 = ((Class528_Sub1) this).aClass87Array8252[i];
				Class87 class87_301_ = class87;
				if (class87.aClass87_835 != null)
					class87_301_ = class87.aClass87_835;
				class87_301_.anInt844 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_301_.anInt841 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_301_.anInt847 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_301_.anInt834 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_301_.anInt843 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_301_.anInt845 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_301_.anInt846 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_301_.anInt840 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_301_.anInt848 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub1) this).aClass172Array8244 != null) {
			for (int i = 0; i < ((Class528_Sub1) this).aClass172Array8244.length; i++) {
				Class172 class172 = ((Class528_Sub1) this).aClass172Array8244[i];
				Class172 class172_302_ = class172;
				if (class172.aClass172_2114 != null)
					class172_302_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Matrix44Arr(class384);
				class172_302_.anInt2113 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_302_.anInt2117 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_302_.anInt2118 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	int method13531(int i, short i_303_, int i_304_, byte i_305_) {
		int i_306_ = Class540.anIntArray7136[method13538(i, i_304_)];
		if (i_303_ != -1) {
			Class169 class169 = ((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834.method144(i_303_ & 0xffff, -1794739592);
			int i_307_ = class169.aByte2079 & 0xff;
			if (i_307_ != 0) {
				int i_308_;
				if (i_304_ < 0)
					i_308_ = 0;
				else if (i_304_ > 127)
					i_308_ = 16777215;
				else
					i_308_ = 131586 * i_304_;
				if (i_307_ == 256)
					i_306_ = i_308_;
				else {
					int i_309_ = i_307_;
					int i_310_ = 256 - i_307_;
					i_306_ = ((((i_308_ & 0xff00ff) * i_309_ + (i_306_ & 0xff00ff) * i_310_) & ~0xff00ff) + (((i_308_ & 0xff00) * i_309_ + (i_306_ & 0xff00) * i_310_) & 0xff0000)) >> 8;
				}
			}
			int i_311_ = class169.aByte2080 & 0xff;
			if (i_311_ != 0) {
				i_311_ += 256;
				int i_312_ = ((i_306_ & 0xff0000) >> 16) * i_311_;
				if (i_312_ > 65535)
					i_312_ = 65535;
				int i_313_ = ((i_306_ & 0xff00) >> 8) * i_311_;
				if (i_313_ > 65535)
					i_313_ = 65535;
				int i_314_ = (i_306_ & 0xff) * i_311_;
				if (i_314_ > 65535)
					i_314_ = 65535;
				i_306_ = (i_312_ << 8 & 0xff0000) + (i_313_ & 0xff00) + (i_314_ >> 8);
			}
		}
		return i_306_ << 8 | 255 - (i_305_ & 0xff);
	}

	public void method11312(byte i, byte[] is) {
		if (is == null) {
			for (int i_315_ = 0; i_315_ < ((Class528_Sub1) this).anInt8262; i_315_++)
				((Class528_Sub1) this).aByteArray8265[i_315_] = i;
		} else {
			for (int i_316_ = 0; i_316_ < ((Class528_Sub1) this).anInt8262; i_316_++) {
				int i_317_ = 255 - ((255 - (is[i_316_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class528_Sub1) this).aByteArray8265[i_316_] = (byte) i_317_;
			}
		}
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public int ci() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8285;
	}

	public boolean method11303() {
		if (((Class528_Sub1) this).aShortArray8269 == null)
			return true;
		for (int i = 0; i < ((Class528_Sub1) this).aShortArray8269.length; i++) {
			if (((Class528_Sub1) this).aShortArray8269[i] != -1 && !(((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834.method139(((Class528_Sub1) this).aShortArray8269[i], -978810545)))
				return false;
		}
		return true;
	}

	void method11275(int i, int[] is, int i_318_, int i_319_, int i_320_, int i_321_, boolean bool) {
		int i_322_ = is.length;
		if (i == 0) {
			i_318_ <<= 4;
			i_319_ <<= 4;
			i_320_ <<= 4;
			int i_323_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_324_ = 0; i_324_ < i_322_; i_324_++) {
				int i_325_ = is[i_324_];
				if (i_325_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_326_ = ((Class528_Sub1) this).anIntArrayArray8263[i_325_];
					for (int i_327_ = 0; i_327_ < is_326_.length; i_327_++) {
						int i_328_ = is_326_[i_327_];
						anInt8271 += ((Class528_Sub1) this).anIntArray8249[i_328_];
						anInt8247 += ((Class528_Sub1) this).anIntArray8250[i_328_];
						anInt8232 += ((Class528_Sub1) this).anIntArray8251[i_328_];
						i_323_++;
					}
				}
			}
			if (i_323_ > 0) {
				anInt8271 = anInt8271 / i_323_ + i_318_;
				anInt8247 = anInt8247 / i_323_ + i_319_;
				anInt8232 = anInt8232 / i_323_ + i_320_;
			} else {
				anInt8271 = i_318_;
				anInt8247 = i_319_;
				anInt8232 = i_320_;
			}
		} else if (i == 1) {
			i_318_ <<= 4;
			i_319_ <<= 4;
			i_320_ <<= 4;
			for (int i_329_ = 0; i_329_ < i_322_; i_329_++) {
				int i_330_ = is[i_329_];
				if (i_330_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_331_ = ((Class528_Sub1) this).anIntArrayArray8263[i_330_];
					for (int i_332_ = 0; i_332_ < is_331_.length; i_332_++) {
						int i_333_ = is_331_[i_332_];
						((Class528_Sub1) this).anIntArray8249[i_333_] += i_318_;
						((Class528_Sub1) this).anIntArray8250[i_333_] += i_319_;
						((Class528_Sub1) this).anIntArray8251[i_333_] += i_320_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_334_ = 0; i_334_ < i_322_; i_334_++) {
				int i_335_ = is[i_334_];
				if (i_335_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_336_ = ((Class528_Sub1) this).anIntArrayArray8263[i_335_];
					if ((i_321_ & 0x1) == 0) {
						for (int i_337_ = 0; i_337_ < is_336_.length; i_337_++) {
							int i_338_ = is_336_[i_337_];
							((Class528_Sub1) this).anIntArray8249[i_338_] -= anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_338_] -= anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_338_] -= anInt8232;
							if (i_320_ != 0) {
								int i_339_ = Class382.anIntArray4657[i_320_];
								int i_340_ = Class382.anIntArray4661[i_320_];
								int i_341_ = (((((Class528_Sub1) this).anIntArray8250[i_338_]) * i_339_ + (((Class528_Sub1) this).anIntArray8249[i_338_]) * i_340_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8250[i_338_] = ((((Class528_Sub1) this).anIntArray8250[i_338_]) * i_340_ - (((Class528_Sub1) this).anIntArray8249[i_338_]) * i_339_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_338_] = i_341_;
							}
							if (i_318_ != 0) {
								int i_342_ = Class382.anIntArray4657[i_318_];
								int i_343_ = Class382.anIntArray4661[i_318_];
								int i_344_ = (((((Class528_Sub1) this).anIntArray8250[i_338_]) * i_343_ - (((Class528_Sub1) this).anIntArray8251[i_338_]) * i_342_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_338_] = ((((Class528_Sub1) this).anIntArray8250[i_338_]) * i_342_ + (((Class528_Sub1) this).anIntArray8251[i_338_]) * i_343_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8250[i_338_] = i_344_;
							}
							if (i_319_ != 0) {
								int i_345_ = Class382.anIntArray4657[i_319_];
								int i_346_ = Class382.anIntArray4661[i_319_];
								int i_347_ = (((((Class528_Sub1) this).anIntArray8251[i_338_]) * i_345_ + (((Class528_Sub1) this).anIntArray8249[i_338_]) * i_346_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_338_] = ((((Class528_Sub1) this).anIntArray8251[i_338_]) * i_346_ - (((Class528_Sub1) this).anIntArray8249[i_338_]) * i_345_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_338_] = i_347_;
							}
							((Class528_Sub1) this).anIntArray8249[i_338_] += anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_338_] += anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_338_] += anInt8232;
						}
					} else {
						for (int i_348_ = 0; i_348_ < is_336_.length; i_348_++) {
							int i_349_ = is_336_[i_348_];
							((Class528_Sub1) this).anIntArray8249[i_349_] -= anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_349_] -= anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_349_] -= anInt8232;
							if (i_318_ != 0) {
								int i_350_ = Class382.anIntArray4657[i_318_];
								int i_351_ = Class382.anIntArray4661[i_318_];
								int i_352_ = (((((Class528_Sub1) this).anIntArray8250[i_349_]) * i_351_ - (((Class528_Sub1) this).anIntArray8251[i_349_]) * i_350_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_349_] = ((((Class528_Sub1) this).anIntArray8250[i_349_]) * i_350_ + (((Class528_Sub1) this).anIntArray8251[i_349_]) * i_351_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8250[i_349_] = i_352_;
							}
							if (i_320_ != 0) {
								int i_353_ = Class382.anIntArray4657[i_320_];
								int i_354_ = Class382.anIntArray4661[i_320_];
								int i_355_ = (((((Class528_Sub1) this).anIntArray8250[i_349_]) * i_353_ + (((Class528_Sub1) this).anIntArray8249[i_349_]) * i_354_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8250[i_349_] = ((((Class528_Sub1) this).anIntArray8250[i_349_]) * i_354_ - (((Class528_Sub1) this).anIntArray8249[i_349_]) * i_353_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_349_] = i_355_;
							}
							if (i_319_ != 0) {
								int i_356_ = Class382.anIntArray4657[i_319_];
								int i_357_ = Class382.anIntArray4661[i_319_];
								int i_358_ = (((((Class528_Sub1) this).anIntArray8251[i_349_]) * i_356_ + (((Class528_Sub1) this).anIntArray8249[i_349_]) * i_357_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_349_] = ((((Class528_Sub1) this).anIntArray8251[i_349_]) * i_357_ - (((Class528_Sub1) this).anIntArray8249[i_349_]) * i_356_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_349_] = i_358_;
							}
							((Class528_Sub1) this).anIntArray8249[i_349_] += anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_349_] += anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_349_] += anInt8232;
						}
					}
				}
			}
			if (bool) {
				for (int i_359_ = 0; i_359_ < i_322_; i_359_++) {
					int i_360_ = is[i_359_];
					if (i_360_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_361_ = (((Class528_Sub1) this).anIntArrayArray8263[i_360_]);
						for (int i_362_ = 0; i_362_ < is_361_.length; i_362_++) {
							int i_363_ = is_361_[i_362_];
							int i_364_ = (((Class528_Sub1) this).anIntArray8290[i_363_]);
							int i_365_ = (((Class528_Sub1) this).anIntArray8290[i_363_ + 1]);
							for (int i_366_ = i_364_; i_366_ < i_365_; i_366_++) {
								int i_367_ = ((((Class528_Sub1) this).aShortArray8288[i_366_]) - 1);
								if (i_367_ == -1)
									break;
								if (i_320_ != 0) {
									int i_368_ = Class382.anIntArray4657[i_320_];
									int i_369_ = Class382.anIntArray4661[i_320_];
									int i_370_ = (((((Class528_Sub1) this).aShortArray8270[i_367_]) * i_368_ + ((((Class528_Sub1) this).aShortArray8255[i_367_]) * i_369_) + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8270[i_367_] = (short) ((((((Class528_Sub1) this).aShortArray8270[i_367_]) * i_369_) - (((Class528_Sub1) this).aShortArray8255[i_367_]) * i_368_ + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8255[i_367_] = (short) i_370_;
								}
								if (i_318_ != 0) {
									int i_371_ = Class382.anIntArray4657[i_318_];
									int i_372_ = Class382.anIntArray4661[i_318_];
									int i_373_ = (((((Class528_Sub1) this).aShortArray8270[i_367_]) * i_372_ - ((((Class528_Sub1) this).aShortArray8261[i_367_]) * i_371_) + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8261[i_367_] = (short) ((((((Class528_Sub1) this).aShortArray8270[i_367_]) * i_371_) + (((Class528_Sub1) this).aShortArray8261[i_367_]) * i_372_ + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8270[i_367_] = (short) i_373_;
								}
								if (i_319_ != 0) {
									int i_374_ = Class382.anIntArray4657[i_319_];
									int i_375_ = Class382.anIntArray4661[i_319_];
									int i_376_ = (((((Class528_Sub1) this).aShortArray8261[i_367_]) * i_374_ + ((((Class528_Sub1) this).aShortArray8255[i_367_]) * i_375_) + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8261[i_367_] = (short) ((((((Class528_Sub1) this).aShortArray8261[i_367_]) * i_375_) - (((Class528_Sub1) this).aShortArray8255[i_367_]) * i_374_ + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8255[i_367_] = (short) i_376_;
								}
							}
						}
					}
				}
				if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
					((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
				if (((Class528_Sub1) this).aClass143_8274 != null)
					((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
			}
		} else if (i == 3) {
			for (int i_377_ = 0; i_377_ < i_322_; i_377_++) {
				int i_378_ = is[i_377_];
				if (i_378_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_379_ = ((Class528_Sub1) this).anIntArrayArray8263[i_378_];
					for (int i_380_ = 0; i_380_ < is_379_.length; i_380_++) {
						int i_381_ = is_379_[i_380_];
						((Class528_Sub1) this).anIntArray8249[i_381_] -= anInt8271;
						((Class528_Sub1) this).anIntArray8250[i_381_] -= anInt8247;
						((Class528_Sub1) this).anIntArray8251[i_381_] -= anInt8232;
						((Class528_Sub1) this).anIntArray8249[i_381_] = (((Class528_Sub1) this).anIntArray8249[i_381_] * i_318_) >> 7;
						((Class528_Sub1) this).anIntArray8250[i_381_] = (((Class528_Sub1) this).anIntArray8250[i_381_] * i_319_) >> 7;
						((Class528_Sub1) this).anIntArray8251[i_381_] = (((Class528_Sub1) this).anIntArray8251[i_381_] * i_320_) >> 7;
						((Class528_Sub1) this).anIntArray8249[i_381_] += anInt8271;
						((Class528_Sub1) this).anIntArray8250[i_381_] += anInt8247;
						((Class528_Sub1) this).anIntArray8251[i_381_] += anInt8232;
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_382_ = 0; i_382_ < i_322_; i_382_++) {
					int i_383_ = is[i_382_];
					if (i_383_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_384_ = (((Class528_Sub1) this).anIntArrayArray8282[i_383_]);
						for (int i_385_ = 0; i_385_ < is_384_.length; i_385_++) {
							int i_386_ = is_384_[i_385_];
							int i_387_ = (((((Class528_Sub1) this).aByteArray8265[i_386_]) & 0xff) + i_318_ * 8);
							if (i_387_ < 0)
								i_387_ = 0;
							else if (i_387_ > 255)
								i_387_ = 255;
							((Class528_Sub1) this).aByteArray8265[i_386_] = (byte) i_387_;
						}
						if (is_384_.length > 0 && ((Class528_Sub1) this).aClass143_8273 != null)
							((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_388_ = 0; i_388_ < ((Class528_Sub1) this).anInt8294; i_388_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_388_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_388_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_389_ = 0; i_389_ < i_322_; i_389_++) {
					int i_390_ = is[i_389_];
					if (i_390_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_391_ = (((Class528_Sub1) this).anIntArrayArray8282[i_390_]);
						for (int i_392_ = 0; i_392_ < is_391_.length; i_392_++) {
							int i_393_ = is_391_[i_392_];
							int i_394_ = ((((Class528_Sub1) this).aShortArray8260[i_393_]) & 0xffff);
							int i_395_ = i_394_ >> 10 & 0x3f;
							int i_396_ = i_394_ >> 7 & 0x7;
							int i_397_ = i_394_ & 0x7f;
							i_395_ = i_395_ + i_318_ & 0x3f;
							i_396_ += i_319_ / 4;
							if (i_396_ < 0)
								i_396_ = 0;
							else if (i_396_ > 7)
								i_396_ = 7;
							i_397_ += i_320_;
							if (i_397_ < 0)
								i_397_ = 0;
							else if (i_397_ > 127)
								i_397_ = 127;
							((Class528_Sub1) this).aShortArray8260[i_393_] = (short) (i_395_ << 10 | i_396_ << 7 | i_397_);
						}
						if (is_391_.length > 0 && ((Class528_Sub1) this).aClass143_8273 != null)
							((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_398_ = 0; i_398_ < ((Class528_Sub1) this).anInt8294; i_398_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_398_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_398_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_399_ = 0; i_399_ < i_322_; i_399_++) {
					int i_400_ = is[i_399_];
					if (i_400_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_401_ = (((Class528_Sub1) this).anIntArrayArray8278[i_400_]);
						for (int i_402_ = 0; i_402_ < is_401_.length; i_402_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_401_[i_402_]]);
							((Class145) class145).anInt1709 += i_318_;
							((Class145) class145).anInt1713 += i_319_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_403_ = 0; i_403_ < i_322_; i_403_++) {
					int i_404_ = is[i_403_];
					if (i_404_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_405_ = (((Class528_Sub1) this).anIntArrayArray8278[i_404_]);
						for (int i_406_ = 0; i_406_ < is_405_.length; i_406_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_405_[i_406_]]);
							((Class145) class145).anInt1710 = (((Class145) class145).anInt1710 * i_318_ >> 7);
							((Class145) class145).anInt1711 = (((Class145) class145).anInt1711 * i_319_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_407_ = 0; i_407_ < i_322_; i_407_++) {
					int i_408_ = is[i_407_];
					if (i_408_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_409_ = (((Class528_Sub1) this).anIntArrayArray8278[i_408_]);
						for (int i_410_ = 0; i_410_ < is_409_.length; i_410_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_409_[i_410_]]);
							((Class145) class145).anInt1712 = (((Class145) class145).anInt1712 + i_318_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public boolean i() {
		return ((Class528_Sub1) this).aBool8245;
	}

	public int cv() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8285;
	}

	void method11260() {
		/* empty */
	}

	void method11261() {
		/* empty */
	}

	boolean ea() {
		if (((Class528_Sub1) this).anIntArrayArray8263 == null)
			return false;
		for (int i = 0; i < ((Class528_Sub1) this).anInt8303; i++) {
			((Class528_Sub1) this).anIntArray8249[i] <<= 4;
			((Class528_Sub1) this).anIntArray8250[i] <<= 4;
			((Class528_Sub1) this).anIntArray8251[i] <<= 4;
		}
		anInt8271 = 0;
		anInt8247 = 0;
		anInt8232 = 0;
		return true;
	}

	void e(int i, int[] is, int i_411_, int i_412_, int i_413_, boolean bool, int i_414_, int[] is_415_) {
		int i_416_ = is.length;
		if (i == 0) {
			i_411_ <<= 4;
			i_412_ <<= 4;
			i_413_ <<= 4;
			int i_417_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_418_ = 0; i_418_ < i_416_; i_418_++) {
				int i_419_ = is[i_418_];
				if (i_419_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_420_ = ((Class528_Sub1) this).anIntArrayArray8263[i_419_];
					for (int i_421_ = 0; i_421_ < is_420_.length; i_421_++) {
						int i_422_ = is_420_[i_421_];
						if (((Class528_Sub1) this).aShortArray8253 == null || (i_414_ & (((Class528_Sub1) this).aShortArray8253[i_422_])) != 0) {
							anInt8271 += (((Class528_Sub1) this).anIntArray8249[i_422_]);
							anInt8247 += (((Class528_Sub1) this).anIntArray8250[i_422_]);
							anInt8232 += (((Class528_Sub1) this).anIntArray8251[i_422_]);
							i_417_++;
						}
					}
				}
			}
			if (i_417_ > 0) {
				anInt8271 = anInt8271 / i_417_ + i_411_;
				anInt8247 = anInt8247 / i_417_ + i_412_;
				anInt8232 = anInt8232 / i_417_ + i_413_;
				aBool8233 = true;
			} else {
				anInt8271 = i_411_;
				anInt8247 = i_412_;
				anInt8232 = i_413_;
			}
		} else if (i == 1) {
			if (is_415_ != null) {
				int i_423_ = ((is_415_[0] * i_411_ + is_415_[1] * i_412_ + is_415_[2] * i_413_ + 8192) >> 14);
				int i_424_ = ((is_415_[3] * i_411_ + is_415_[4] * i_412_ + is_415_[5] * i_413_ + 8192) >> 14);
				int i_425_ = ((is_415_[6] * i_411_ + is_415_[7] * i_412_ + is_415_[8] * i_413_ + 8192) >> 14);
				i_411_ = i_423_;
				i_412_ = i_424_;
				i_413_ = i_425_;
			}
			i_411_ <<= 4;
			i_412_ <<= 4;
			i_413_ <<= 4;
			for (int i_426_ = 0; i_426_ < i_416_; i_426_++) {
				int i_427_ = is[i_426_];
				if (i_427_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_428_ = ((Class528_Sub1) this).anIntArrayArray8263[i_427_];
					for (int i_429_ = 0; i_429_ < is_428_.length; i_429_++) {
						int i_430_ = is_428_[i_429_];
						if (((Class528_Sub1) this).aShortArray8253 == null || (i_414_ & (((Class528_Sub1) this).aShortArray8253[i_430_])) != 0) {
							((Class528_Sub1) this).anIntArray8249[i_430_] += i_411_;
							((Class528_Sub1) this).anIntArray8250[i_430_] += i_412_;
							((Class528_Sub1) this).anIntArray8251[i_430_] += i_413_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_415_ != null) {
				int i_431_ = is_415_[9] << 4;
				int i_432_ = is_415_[10] << 4;
				int i_433_ = is_415_[11] << 4;
				int i_434_ = is_415_[12] << 4;
				int i_435_ = is_415_[13] << 4;
				int i_436_ = is_415_[14] << 4;
				if (aBool8233) {
					int i_437_ = ((is_415_[0] * anInt8271 + is_415_[3] * anInt8247 + is_415_[6] * anInt8232 + 8192) >> 14);
					int i_438_ = ((is_415_[1] * anInt8271 + is_415_[4] * anInt8247 + is_415_[7] * anInt8232 + 8192) >> 14);
					int i_439_ = ((is_415_[2] * anInt8271 + is_415_[5] * anInt8247 + is_415_[8] * anInt8232 + 8192) >> 14);
					i_437_ += i_434_;
					i_438_ += i_435_;
					i_439_ += i_436_;
					anInt8271 = i_437_;
					anInt8247 = i_438_;
					anInt8232 = i_439_;
					aBool8233 = false;
				}
				int[] is_440_ = new int[9];
				int i_441_ = Class382.anIntArray4661[i_411_];
				int i_442_ = Class382.anIntArray4657[i_411_];
				int i_443_ = Class382.anIntArray4661[i_412_];
				int i_444_ = Class382.anIntArray4657[i_412_];
				int i_445_ = Class382.anIntArray4661[i_413_];
				int i_446_ = Class382.anIntArray4657[i_413_];
				int i_447_ = i_442_ * i_445_ + 8192 >> 14;
				int i_448_ = i_442_ * i_446_ + 8192 >> 14;
				is_440_[0] = i_443_ * i_445_ + i_444_ * i_448_ + 8192 >> 14;
				is_440_[1] = -i_443_ * i_446_ + i_444_ * i_447_ + 8192 >> 14;
				is_440_[2] = i_444_ * i_441_ + 8192 >> 14;
				is_440_[3] = i_441_ * i_446_ + 8192 >> 14;
				is_440_[4] = i_441_ * i_445_ + 8192 >> 14;
				is_440_[5] = -i_442_;
				is_440_[6] = -i_444_ * i_445_ + i_443_ * i_448_ + 8192 >> 14;
				is_440_[7] = i_444_ * i_446_ + i_443_ * i_447_ + 8192 >> 14;
				is_440_[8] = i_443_ * i_441_ + 8192 >> 14;
				int i_449_ = (is_440_[0] * -anInt8271 + is_440_[1] * -anInt8247 + is_440_[2] * -anInt8232 + 8192) >> 14;
				int i_450_ = (is_440_[3] * -anInt8271 + is_440_[4] * -anInt8247 + is_440_[5] * -anInt8232 + 8192) >> 14;
				int i_451_ = (is_440_[6] * -anInt8271 + is_440_[7] * -anInt8247 + is_440_[8] * -anInt8232 + 8192) >> 14;
				int i_452_ = i_449_ + anInt8271;
				int i_453_ = i_450_ + anInt8247;
				int i_454_ = i_451_ + anInt8232;
				int[] is_455_ = new int[9];
				for (int i_456_ = 0; i_456_ < 3; i_456_++) {
					for (int i_457_ = 0; i_457_ < 3; i_457_++) {
						int i_458_ = 0;
						for (int i_459_ = 0; i_459_ < 3; i_459_++)
							i_458_ += (is_440_[i_456_ * 3 + i_459_] * is_415_[i_457_ * 3 + i_459_]);
						is_455_[i_456_ * 3 + i_457_] = i_458_ + 8192 >> 14;
					}
				}
				int i_460_ = ((is_440_[0] * i_434_ + is_440_[1] * i_435_ + is_440_[2] * i_436_ + 8192) >> 14);
				int i_461_ = ((is_440_[3] * i_434_ + is_440_[4] * i_435_ + is_440_[5] * i_436_ + 8192) >> 14);
				int i_462_ = ((is_440_[6] * i_434_ + is_440_[7] * i_435_ + is_440_[8] * i_436_ + 8192) >> 14);
				i_460_ += i_452_;
				i_461_ += i_453_;
				i_462_ += i_454_;
				int[] is_463_ = new int[9];
				for (int i_464_ = 0; i_464_ < 3; i_464_++) {
					for (int i_465_ = 0; i_465_ < 3; i_465_++) {
						int i_466_ = 0;
						for (int i_467_ = 0; i_467_ < 3; i_467_++)
							i_466_ += (is_415_[i_464_ * 3 + i_467_] * is_455_[i_465_ + i_467_ * 3]);
						is_463_[i_464_ * 3 + i_465_] = i_466_ + 8192 >> 14;
					}
				}
				int i_468_ = ((is_415_[0] * i_460_ + is_415_[1] * i_461_ + is_415_[2] * i_462_ + 8192) >> 14);
				int i_469_ = ((is_415_[3] * i_460_ + is_415_[4] * i_461_ + is_415_[5] * i_462_ + 8192) >> 14);
				int i_470_ = ((is_415_[6] * i_460_ + is_415_[7] * i_461_ + is_415_[8] * i_462_ + 8192) >> 14);
				i_468_ += i_431_;
				i_469_ += i_432_;
				i_470_ += i_433_;
				for (int i_471_ = 0; i_471_ < i_416_; i_471_++) {
					int i_472_ = is[i_471_];
					if (i_472_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_473_ = (((Class528_Sub1) this).anIntArrayArray8263[i_472_]);
						for (int i_474_ = 0; i_474_ < is_473_.length; i_474_++) {
							int i_475_ = is_473_[i_474_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_414_ & (((Class528_Sub1) this).aShortArray8253[i_475_])) != 0)) {
								int i_476_ = (is_463_[0] * (((Class528_Sub1) this).anIntArray8249[i_475_]) + is_463_[1] * (((Class528_Sub1) this).anIntArray8250[i_475_]) + is_463_[2] * (((Class528_Sub1) this).anIntArray8251[i_475_]) + 8192) >> 14;
								int i_477_ = (is_463_[3] * (((Class528_Sub1) this).anIntArray8249[i_475_]) + is_463_[4] * (((Class528_Sub1) this).anIntArray8250[i_475_]) + is_463_[5] * (((Class528_Sub1) this).anIntArray8251[i_475_]) + 8192) >> 14;
								int i_478_ = (is_463_[6] * (((Class528_Sub1) this).anIntArray8249[i_475_]) + is_463_[7] * (((Class528_Sub1) this).anIntArray8250[i_475_]) + is_463_[8] * (((Class528_Sub1) this).anIntArray8251[i_475_]) + 8192) >> 14;
								i_476_ += i_468_;
								i_477_ += i_469_;
								i_478_ += i_470_;
								((Class528_Sub1) this).anIntArray8249[i_475_] = i_476_;
								((Class528_Sub1) this).anIntArray8250[i_475_] = i_477_;
								((Class528_Sub1) this).anIntArray8251[i_475_] = i_478_;
							}
						}
					}
				}
			} else {
				for (int i_479_ = 0; i_479_ < i_416_; i_479_++) {
					int i_480_ = is[i_479_];
					if (i_480_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_481_ = (((Class528_Sub1) this).anIntArrayArray8263[i_480_]);
						for (int i_482_ = 0; i_482_ < is_481_.length; i_482_++) {
							int i_483_ = is_481_[i_482_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_414_ & (((Class528_Sub1) this).aShortArray8253[i_483_])) != 0)) {
								((Class528_Sub1) this).anIntArray8249[i_483_] -= anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_483_] -= anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_483_] -= anInt8232;
								if (i_413_ != 0) {
									int i_484_ = Class382.anIntArray4657[i_413_];
									int i_485_ = Class382.anIntArray4661[i_413_];
									int i_486_ = ((((Class528_Sub1) this).anIntArray8250[i_483_]) * i_484_ + (((Class528_Sub1) this).anIntArray8249[i_483_]) * i_485_ + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8250[i_483_] = ((((Class528_Sub1) this).anIntArray8250[i_483_]) * i_485_ - (((Class528_Sub1) this).anIntArray8249[i_483_]) * i_484_ + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8249[i_483_] = i_486_;
								}
								if (i_411_ != 0) {
									int i_487_ = Class382.anIntArray4657[i_411_];
									int i_488_ = Class382.anIntArray4661[i_411_];
									int i_489_ = ((((Class528_Sub1) this).anIntArray8250[i_483_]) * i_488_ - (((Class528_Sub1) this).anIntArray8251[i_483_]) * i_487_ + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8251[i_483_] = ((((Class528_Sub1) this).anIntArray8250[i_483_]) * i_487_ + (((Class528_Sub1) this).anIntArray8251[i_483_]) * i_488_ + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8250[i_483_] = i_489_;
								}
								if (i_412_ != 0) {
									int i_490_ = Class382.anIntArray4657[i_412_];
									int i_491_ = Class382.anIntArray4661[i_412_];
									int i_492_ = ((((Class528_Sub1) this).anIntArray8251[i_483_]) * i_490_ + (((Class528_Sub1) this).anIntArray8249[i_483_]) * i_491_ + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8251[i_483_] = ((((Class528_Sub1) this).anIntArray8251[i_483_]) * i_491_ - (((Class528_Sub1) this).anIntArray8249[i_483_]) * i_490_ + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8249[i_483_] = i_492_;
								}
								((Class528_Sub1) this).anIntArray8249[i_483_] += anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_483_] += anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_483_] += anInt8232;
							}
						}
					}
				}
				if (bool) {
					for (int i_493_ = 0; i_493_ < i_416_; i_493_++) {
						int i_494_ = is[i_493_];
						if (i_494_ < (((Class528_Sub1) this).anIntArrayArray8263).length) {
							int[] is_495_ = (((Class528_Sub1) this).anIntArrayArray8263[i_494_]);
							for (int i_496_ = 0; i_496_ < is_495_.length; i_496_++) {
								int i_497_ = is_495_[i_496_];
								if ((((Class528_Sub1) this).aShortArray8253 == null) || ((i_414_ & (((Class528_Sub1) this).aShortArray8253[i_497_])) != 0)) {
									int i_498_ = (((Class528_Sub1) this).anIntArray8290[i_497_]);
									int i_499_ = (((Class528_Sub1) this).anIntArray8290[i_497_ + 1]);
									for (int i_500_ = i_498_; i_500_ < i_499_; i_500_++) {
										int i_501_ = ((((Class528_Sub1) this).aShortArray8288[i_500_]) - 1);
										if (i_501_ == -1)
											break;
										if (i_413_ != 0) {
											int i_502_ = (Class382.anIntArray4657[i_413_]);
											int i_503_ = (Class382.anIntArray4661[i_413_]);
											int i_504_ = ((((((Class528_Sub1) this).aShortArray8270[i_501_]) * i_502_) + (((Class528_Sub1) this).aShortArray8255[i_501_]) * i_503_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8270[i_501_] = (short) (((((Class528_Sub1) this).aShortArray8270[i_501_]) * i_503_ - (((Class528_Sub1) this).aShortArray8255[i_501_]) * i_502_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8255[i_501_] = (short) i_504_;
										}
										if (i_411_ != 0) {
											int i_505_ = (Class382.anIntArray4657[i_411_]);
											int i_506_ = (Class382.anIntArray4661[i_411_]);
											int i_507_ = ((((((Class528_Sub1) this).aShortArray8270[i_501_]) * i_506_) - (((Class528_Sub1) this).aShortArray8261[i_501_]) * i_505_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8261[i_501_] = (short) (((((Class528_Sub1) this).aShortArray8270[i_501_]) * i_505_ + (((Class528_Sub1) this).aShortArray8261[i_501_]) * i_506_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8270[i_501_] = (short) i_507_;
										}
										if (i_412_ != 0) {
											int i_508_ = (Class382.anIntArray4657[i_412_]);
											int i_509_ = (Class382.anIntArray4661[i_412_]);
											int i_510_ = ((((((Class528_Sub1) this).aShortArray8261[i_501_]) * i_508_) + (((Class528_Sub1) this).aShortArray8255[i_501_]) * i_509_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8261[i_501_] = (short) (((((Class528_Sub1) this).aShortArray8261[i_501_]) * i_509_ - (((Class528_Sub1) this).aShortArray8255[i_501_]) * i_508_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8255[i_501_] = (short) i_510_;
										}
									}
								}
							}
						}
					}
					if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
						((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
					if (((Class528_Sub1) this).aClass143_8274 != null)
						((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
				}
			}
		} else if (i == 3) {
			if (is_415_ != null) {
				int i_511_ = is_415_[9] << 4;
				int i_512_ = is_415_[10] << 4;
				int i_513_ = is_415_[11] << 4;
				int i_514_ = is_415_[12] << 4;
				int i_515_ = is_415_[13] << 4;
				int i_516_ = is_415_[14] << 4;
				if (aBool8233) {
					int i_517_ = ((is_415_[0] * anInt8271 + is_415_[3] * anInt8247 + is_415_[6] * anInt8232 + 8192) >> 14);
					int i_518_ = ((is_415_[1] * anInt8271 + is_415_[4] * anInt8247 + is_415_[7] * anInt8232 + 8192) >> 14);
					int i_519_ = ((is_415_[2] * anInt8271 + is_415_[5] * anInt8247 + is_415_[8] * anInt8232 + 8192) >> 14);
					i_517_ += i_514_;
					i_518_ += i_515_;
					i_519_ += i_516_;
					anInt8271 = i_517_;
					anInt8247 = i_518_;
					anInt8232 = i_519_;
					aBool8233 = false;
				}
				int i_520_ = i_411_ << 15 >> 7;
				int i_521_ = i_412_ << 15 >> 7;
				int i_522_ = i_413_ << 15 >> 7;
				int i_523_ = i_520_ * -anInt8271 + 8192 >> 14;
				int i_524_ = i_521_ * -anInt8247 + 8192 >> 14;
				int i_525_ = i_522_ * -anInt8232 + 8192 >> 14;
				int i_526_ = i_523_ + anInt8271;
				int i_527_ = i_524_ + anInt8247;
				int i_528_ = i_525_ + anInt8232;
				int[] is_529_ = new int[9];
				is_529_[0] = i_520_ * is_415_[0] + 8192 >> 14;
				is_529_[1] = i_520_ * is_415_[3] + 8192 >> 14;
				is_529_[2] = i_520_ * is_415_[6] + 8192 >> 14;
				is_529_[3] = i_521_ * is_415_[1] + 8192 >> 14;
				is_529_[4] = i_521_ * is_415_[4] + 8192 >> 14;
				is_529_[5] = i_521_ * is_415_[7] + 8192 >> 14;
				is_529_[6] = i_522_ * is_415_[2] + 8192 >> 14;
				is_529_[7] = i_522_ * is_415_[5] + 8192 >> 14;
				is_529_[8] = i_522_ * is_415_[8] + 8192 >> 14;
				int i_530_ = i_520_ * i_514_ + 8192 >> 14;
				int i_531_ = i_521_ * i_515_ + 8192 >> 14;
				int i_532_ = i_522_ * i_516_ + 8192 >> 14;
				i_530_ += i_526_;
				i_531_ += i_527_;
				i_532_ += i_528_;
				int[] is_533_ = new int[9];
				for (int i_534_ = 0; i_534_ < 3; i_534_++) {
					for (int i_535_ = 0; i_535_ < 3; i_535_++) {
						int i_536_ = 0;
						for (int i_537_ = 0; i_537_ < 3; i_537_++)
							i_536_ += (is_415_[i_534_ * 3 + i_537_] * is_529_[i_535_ + i_537_ * 3]);
						is_533_[i_534_ * 3 + i_535_] = i_536_ + 8192 >> 14;
					}
				}
				int i_538_ = ((is_415_[0] * i_530_ + is_415_[1] * i_531_ + is_415_[2] * i_532_ + 8192) >> 14);
				int i_539_ = ((is_415_[3] * i_530_ + is_415_[4] * i_531_ + is_415_[5] * i_532_ + 8192) >> 14);
				int i_540_ = ((is_415_[6] * i_530_ + is_415_[7] * i_531_ + is_415_[8] * i_532_ + 8192) >> 14);
				i_538_ += i_511_;
				i_539_ += i_512_;
				i_540_ += i_513_;
				for (int i_541_ = 0; i_541_ < i_416_; i_541_++) {
					int i_542_ = is[i_541_];
					if (i_542_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_543_ = (((Class528_Sub1) this).anIntArrayArray8263[i_542_]);
						for (int i_544_ = 0; i_544_ < is_543_.length; i_544_++) {
							int i_545_ = is_543_[i_544_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_414_ & (((Class528_Sub1) this).aShortArray8253[i_545_])) != 0)) {
								int i_546_ = (is_533_[0] * (((Class528_Sub1) this).anIntArray8249[i_545_]) + is_533_[1] * (((Class528_Sub1) this).anIntArray8250[i_545_]) + is_533_[2] * (((Class528_Sub1) this).anIntArray8251[i_545_]) + 8192) >> 14;
								int i_547_ = (is_533_[3] * (((Class528_Sub1) this).anIntArray8249[i_545_]) + is_533_[4] * (((Class528_Sub1) this).anIntArray8250[i_545_]) + is_533_[5] * (((Class528_Sub1) this).anIntArray8251[i_545_]) + 8192) >> 14;
								int i_548_ = (is_533_[6] * (((Class528_Sub1) this).anIntArray8249[i_545_]) + is_533_[7] * (((Class528_Sub1) this).anIntArray8250[i_545_]) + is_533_[8] * (((Class528_Sub1) this).anIntArray8251[i_545_]) + 8192) >> 14;
								i_546_ += i_538_;
								i_547_ += i_539_;
								i_548_ += i_540_;
								((Class528_Sub1) this).anIntArray8249[i_545_] = i_546_;
								((Class528_Sub1) this).anIntArray8250[i_545_] = i_547_;
								((Class528_Sub1) this).anIntArray8251[i_545_] = i_548_;
							}
						}
					}
				}
			} else {
				for (int i_549_ = 0; i_549_ < i_416_; i_549_++) {
					int i_550_ = is[i_549_];
					if (i_550_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_551_ = (((Class528_Sub1) this).anIntArrayArray8263[i_550_]);
						for (int i_552_ = 0; i_552_ < is_551_.length; i_552_++) {
							int i_553_ = is_551_[i_552_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_414_ & (((Class528_Sub1) this).aShortArray8253[i_553_])) != 0)) {
								((Class528_Sub1) this).anIntArray8249[i_553_] -= anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_553_] -= anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_553_] -= anInt8232;
								((Class528_Sub1) this).anIntArray8249[i_553_] = (((Class528_Sub1) this).anIntArray8249[i_553_]) * i_411_ >> 7;
								((Class528_Sub1) this).anIntArray8250[i_553_] = (((Class528_Sub1) this).anIntArray8250[i_553_]) * i_412_ >> 7;
								((Class528_Sub1) this).anIntArray8251[i_553_] = (((Class528_Sub1) this).anIntArray8251[i_553_]) * i_413_ >> 7;
								((Class528_Sub1) this).anIntArray8249[i_553_] += anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_553_] += anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_553_] += anInt8232;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_554_ = 0; i_554_ < i_416_; i_554_++) {
					int i_555_ = is[i_554_];
					if (i_555_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_556_ = (((Class528_Sub1) this).anIntArrayArray8282[i_555_]);
						for (int i_557_ = 0; i_557_ < is_556_.length; i_557_++) {
							int i_558_ = is_556_[i_557_];
							if (((Class528_Sub1) this).aShortArray8304 == null || ((i_414_ & (((Class528_Sub1) this).aShortArray8304[i_558_])) != 0)) {
								int i_559_ = (((((Class528_Sub1) this).aByteArray8265[i_558_]) & 0xff) + i_411_ * 8);
								if (i_559_ < 0)
									i_559_ = 0;
								else if (i_559_ > 255)
									i_559_ = 255;
								((Class528_Sub1) this).aByteArray8265[i_558_] = (byte) i_559_;
								if (((Class528_Sub1) this).aClass143_8273 != null)
									((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
							}
						}
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_560_ = 0; i_560_ < ((Class528_Sub1) this).anInt8294; i_560_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_560_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_560_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_561_ = 0; i_561_ < i_416_; i_561_++) {
					int i_562_ = is[i_561_];
					if (i_562_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_563_ = (((Class528_Sub1) this).anIntArrayArray8282[i_562_]);
						for (int i_564_ = 0; i_564_ < is_563_.length; i_564_++) {
							int i_565_ = is_563_[i_564_];
							if (((Class528_Sub1) this).aShortArray8304 == null || ((i_414_ & (((Class528_Sub1) this).aShortArray8304[i_565_])) != 0)) {
								int i_566_ = ((((Class528_Sub1) this).aShortArray8260[i_565_]) & 0xffff);
								int i_567_ = i_566_ >> 10 & 0x3f;
								int i_568_ = i_566_ >> 7 & 0x7;
								int i_569_ = i_566_ & 0x7f;
								i_567_ = i_567_ + i_411_ & 0x3f;
								i_568_ += i_412_ / 4;
								if (i_568_ < 0)
									i_568_ = 0;
								else if (i_568_ > 7)
									i_568_ = 7;
								i_569_ += i_413_;
								if (i_569_ < 0)
									i_569_ = 0;
								else if (i_569_ > 127)
									i_569_ = 127;
								((Class528_Sub1) this).aShortArray8260[i_565_] = (short) (i_567_ << 10 | i_568_ << 7 | i_569_);
								if (((Class528_Sub1) this).aClass143_8273 != null)
									((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
							}
						}
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_570_ = 0; i_570_ < ((Class528_Sub1) this).anInt8294; i_570_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_570_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_570_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_571_ = 0; i_571_ < i_416_; i_571_++) {
					int i_572_ = is[i_571_];
					if (i_572_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_573_ = (((Class528_Sub1) this).anIntArrayArray8278[i_572_]);
						for (int i_574_ = 0; i_574_ < is_573_.length; i_574_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_573_[i_574_]]);
							((Class145) class145).anInt1709 += i_411_;
							((Class145) class145).anInt1713 += i_412_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_575_ = 0; i_575_ < i_416_; i_575_++) {
					int i_576_ = is[i_575_];
					if (i_576_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_577_ = (((Class528_Sub1) this).anIntArrayArray8278[i_576_]);
						for (int i_578_ = 0; i_578_ < is_577_.length; i_578_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_577_[i_578_]]);
							((Class145) class145).anInt1710 = (((Class145) class145).anInt1710 * i_411_ >> 7);
							((Class145) class145).anInt1711 = (((Class145) class145).anInt1711 * i_412_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_579_ = 0; i_579_ < i_416_; i_579_++) {
					int i_580_ = is[i_579_];
					if (i_580_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_581_ = (((Class528_Sub1) this).anIntArrayArray8278[i_580_]);
						for (int i_582_ = 0; i_582_ < is_581_.length; i_582_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_581_[i_582_]]);
							((Class145) class145).anInt1712 = (((Class145) class145).anInt1712 + i_411_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void w(int i, int i_583_, int i_584_, int i_585_) {
		if (i == 0) {
			int i_586_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_587_ = 0; i_587_ < ((Class528_Sub1) this).anInt8248; i_587_++) {
				anInt8271 += ((Class528_Sub1) this).anIntArray8249[i_587_];
				anInt8247 += ((Class528_Sub1) this).anIntArray8250[i_587_];
				anInt8232 += ((Class528_Sub1) this).anIntArray8251[i_587_];
				i_586_++;
			}
			if (i_586_ > 0) {
				anInt8271 = anInt8271 / i_586_ + i_583_;
				anInt8247 = anInt8247 / i_586_ + i_584_;
				anInt8232 = anInt8232 / i_586_ + i_585_;
			} else {
				anInt8271 = i_583_;
				anInt8247 = i_584_;
				anInt8232 = i_585_;
			}
		} else if (i == 1) {
			for (int i_588_ = 0; i_588_ < ((Class528_Sub1) this).anInt8248; i_588_++) {
				((Class528_Sub1) this).anIntArray8249[i_588_] += i_583_;
				((Class528_Sub1) this).anIntArray8250[i_588_] += i_584_;
				((Class528_Sub1) this).anIntArray8251[i_588_] += i_585_;
			}
		} else if (i == 2) {
			for (int i_589_ = 0; i_589_ < ((Class528_Sub1) this).anInt8248; i_589_++) {
				((Class528_Sub1) this).anIntArray8249[i_589_] -= anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_589_] -= anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_589_] -= anInt8232;
				if (i_585_ != 0) {
					int i_590_ = Class382.anIntArray4657[i_585_];
					int i_591_ = Class382.anIntArray4661[i_585_];
					int i_592_ = (((((Class528_Sub1) this).anIntArray8250[i_589_] * i_590_) + (((Class528_Sub1) this).anIntArray8249[i_589_] * i_591_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8250[i_589_] = ((((Class528_Sub1) this).anIntArray8250[i_589_] * i_591_) - (((Class528_Sub1) this).anIntArray8249[i_589_] * i_590_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8249[i_589_] = i_592_;
				}
				if (i_583_ != 0) {
					int i_593_ = Class382.anIntArray4657[i_583_];
					int i_594_ = Class382.anIntArray4661[i_583_];
					int i_595_ = (((((Class528_Sub1) this).anIntArray8250[i_589_] * i_594_) - (((Class528_Sub1) this).anIntArray8251[i_589_] * i_593_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8251[i_589_] = ((((Class528_Sub1) this).anIntArray8250[i_589_] * i_593_) + (((Class528_Sub1) this).anIntArray8251[i_589_] * i_594_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8250[i_589_] = i_595_;
				}
				if (i_584_ != 0) {
					int i_596_ = Class382.anIntArray4657[i_584_];
					int i_597_ = Class382.anIntArray4661[i_584_];
					int i_598_ = (((((Class528_Sub1) this).anIntArray8251[i_589_] * i_596_) + (((Class528_Sub1) this).anIntArray8249[i_589_] * i_597_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8251[i_589_] = ((((Class528_Sub1) this).anIntArray8251[i_589_] * i_597_) - (((Class528_Sub1) this).anIntArray8249[i_589_] * i_596_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8249[i_589_] = i_598_;
				}
				((Class528_Sub1) this).anIntArray8249[i_589_] += anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_589_] += anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_589_] += anInt8232;
			}
		} else if (i == 3) {
			for (int i_599_ = 0; i_599_ < ((Class528_Sub1) this).anInt8248; i_599_++) {
				((Class528_Sub1) this).anIntArray8249[i_599_] -= anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_599_] -= anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_599_] -= anInt8232;
				((Class528_Sub1) this).anIntArray8249[i_599_] = (((Class528_Sub1) this).anIntArray8249[i_599_] * i_583_ / 128);
				((Class528_Sub1) this).anIntArray8250[i_599_] = (((Class528_Sub1) this).anIntArray8250[i_599_] * i_584_ / 128);
				((Class528_Sub1) this).anIntArray8251[i_599_] = (((Class528_Sub1) this).anIntArray8251[i_599_] * i_585_ / 128);
				((Class528_Sub1) this).anIntArray8249[i_599_] += anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_599_] += anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_599_] += anInt8232;
			}
		} else if (i == 5) {
			for (int i_600_ = 0; i_600_ < ((Class528_Sub1) this).anInt8262; i_600_++) {
				int i_601_ = ((((Class528_Sub1) this).aByteArray8265[i_600_] & 0xff) + i_583_ * 8);
				if (i_601_ < 0)
					i_601_ = 0;
				else if (i_601_ > 255)
					i_601_ = 255;
				((Class528_Sub1) this).aByteArray8265[i_600_] = (byte) i_601_;
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_602_ = 0; i_602_ < ((Class528_Sub1) this).anInt8294; i_602_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_602_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_602_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_603_ = 0; i_603_ < ((Class528_Sub1) this).anInt8262; i_603_++) {
				int i_604_ = ((Class528_Sub1) this).aShortArray8260[i_603_] & 0xffff;
				int i_605_ = i_604_ >> 10 & 0x3f;
				int i_606_ = i_604_ >> 7 & 0x7;
				int i_607_ = i_604_ & 0x7f;
				i_605_ = i_605_ + i_583_ & 0x3f;
				i_606_ += i_584_ / 4;
				if (i_606_ < 0)
					i_606_ = 0;
				else if (i_606_ > 7)
					i_606_ = 7;
				i_607_ += i_585_;
				if (i_607_ < 0)
					i_607_ = 0;
				else if (i_607_ > 127)
					i_607_ = 127;
				((Class528_Sub1) this).aShortArray8260[i_603_] = (short) (i_605_ << 10 | i_606_ << 7 | i_607_);
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_608_ = 0; i_608_ < ((Class528_Sub1) this).anInt8294; i_608_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_608_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_608_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_609_ = 0; i_609_ < ((Class528_Sub1) this).anInt8294; i_609_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_609_];
				((Class145) class145).anInt1709 += i_583_;
				((Class145) class145).anInt1713 += i_584_;
			}
		} else if (i == 10) {
			for (int i_610_ = 0; i_610_ < ((Class528_Sub1) this).anInt8294; i_610_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_610_];
				((Class145) class145).anInt1710 = ((Class145) class145).anInt1710 * i_583_ >> 7;
				((Class145) class145).anInt1711 = ((Class145) class145).anInt1711 * i_584_ >> 7;
			}
		} else if (i == 9) {
			for (int i_611_ = 0; i_611_ < ((Class528_Sub1) this).anInt8294; i_611_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_611_];
				((Class145) class145).anInt1712 = ((Class145) class145).anInt1712 + i_583_ & 0x3fff;
			}
		}
	}

	void method11268(int i, int[] is, int i_612_, int i_613_, int i_614_, int i_615_, boolean bool) {
		int i_616_ = is.length;
		if (i == 0) {
			i_612_ <<= 4;
			i_613_ <<= 4;
			i_614_ <<= 4;
			int i_617_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_618_ = 0; i_618_ < i_616_; i_618_++) {
				int i_619_ = is[i_618_];
				if (i_619_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_620_ = ((Class528_Sub1) this).anIntArrayArray8263[i_619_];
					for (int i_621_ = 0; i_621_ < is_620_.length; i_621_++) {
						int i_622_ = is_620_[i_621_];
						anInt8271 += ((Class528_Sub1) this).anIntArray8249[i_622_];
						anInt8247 += ((Class528_Sub1) this).anIntArray8250[i_622_];
						anInt8232 += ((Class528_Sub1) this).anIntArray8251[i_622_];
						i_617_++;
					}
				}
			}
			if (i_617_ > 0) {
				anInt8271 = anInt8271 / i_617_ + i_612_;
				anInt8247 = anInt8247 / i_617_ + i_613_;
				anInt8232 = anInt8232 / i_617_ + i_614_;
			} else {
				anInt8271 = i_612_;
				anInt8247 = i_613_;
				anInt8232 = i_614_;
			}
		} else if (i == 1) {
			i_612_ <<= 4;
			i_613_ <<= 4;
			i_614_ <<= 4;
			for (int i_623_ = 0; i_623_ < i_616_; i_623_++) {
				int i_624_ = is[i_623_];
				if (i_624_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_625_ = ((Class528_Sub1) this).anIntArrayArray8263[i_624_];
					for (int i_626_ = 0; i_626_ < is_625_.length; i_626_++) {
						int i_627_ = is_625_[i_626_];
						((Class528_Sub1) this).anIntArray8249[i_627_] += i_612_;
						((Class528_Sub1) this).anIntArray8250[i_627_] += i_613_;
						((Class528_Sub1) this).anIntArray8251[i_627_] += i_614_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_628_ = 0; i_628_ < i_616_; i_628_++) {
				int i_629_ = is[i_628_];
				if (i_629_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_630_ = ((Class528_Sub1) this).anIntArrayArray8263[i_629_];
					if ((i_615_ & 0x1) == 0) {
						for (int i_631_ = 0; i_631_ < is_630_.length; i_631_++) {
							int i_632_ = is_630_[i_631_];
							((Class528_Sub1) this).anIntArray8249[i_632_] -= anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_632_] -= anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_632_] -= anInt8232;
							if (i_614_ != 0) {
								int i_633_ = Class382.anIntArray4657[i_614_];
								int i_634_ = Class382.anIntArray4661[i_614_];
								int i_635_ = (((((Class528_Sub1) this).anIntArray8250[i_632_]) * i_633_ + (((Class528_Sub1) this).anIntArray8249[i_632_]) * i_634_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8250[i_632_] = ((((Class528_Sub1) this).anIntArray8250[i_632_]) * i_634_ - (((Class528_Sub1) this).anIntArray8249[i_632_]) * i_633_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_632_] = i_635_;
							}
							if (i_612_ != 0) {
								int i_636_ = Class382.anIntArray4657[i_612_];
								int i_637_ = Class382.anIntArray4661[i_612_];
								int i_638_ = (((((Class528_Sub1) this).anIntArray8250[i_632_]) * i_637_ - (((Class528_Sub1) this).anIntArray8251[i_632_]) * i_636_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_632_] = ((((Class528_Sub1) this).anIntArray8250[i_632_]) * i_636_ + (((Class528_Sub1) this).anIntArray8251[i_632_]) * i_637_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8250[i_632_] = i_638_;
							}
							if (i_613_ != 0) {
								int i_639_ = Class382.anIntArray4657[i_613_];
								int i_640_ = Class382.anIntArray4661[i_613_];
								int i_641_ = (((((Class528_Sub1) this).anIntArray8251[i_632_]) * i_639_ + (((Class528_Sub1) this).anIntArray8249[i_632_]) * i_640_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_632_] = ((((Class528_Sub1) this).anIntArray8251[i_632_]) * i_640_ - (((Class528_Sub1) this).anIntArray8249[i_632_]) * i_639_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_632_] = i_641_;
							}
							((Class528_Sub1) this).anIntArray8249[i_632_] += anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_632_] += anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_632_] += anInt8232;
						}
					} else {
						for (int i_642_ = 0; i_642_ < is_630_.length; i_642_++) {
							int i_643_ = is_630_[i_642_];
							((Class528_Sub1) this).anIntArray8249[i_643_] -= anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_643_] -= anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_643_] -= anInt8232;
							if (i_612_ != 0) {
								int i_644_ = Class382.anIntArray4657[i_612_];
								int i_645_ = Class382.anIntArray4661[i_612_];
								int i_646_ = (((((Class528_Sub1) this).anIntArray8250[i_643_]) * i_645_ - (((Class528_Sub1) this).anIntArray8251[i_643_]) * i_644_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_643_] = ((((Class528_Sub1) this).anIntArray8250[i_643_]) * i_644_ + (((Class528_Sub1) this).anIntArray8251[i_643_]) * i_645_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8250[i_643_] = i_646_;
							}
							if (i_614_ != 0) {
								int i_647_ = Class382.anIntArray4657[i_614_];
								int i_648_ = Class382.anIntArray4661[i_614_];
								int i_649_ = (((((Class528_Sub1) this).anIntArray8250[i_643_]) * i_647_ + (((Class528_Sub1) this).anIntArray8249[i_643_]) * i_648_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8250[i_643_] = ((((Class528_Sub1) this).anIntArray8250[i_643_]) * i_648_ - (((Class528_Sub1) this).anIntArray8249[i_643_]) * i_647_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_643_] = i_649_;
							}
							if (i_613_ != 0) {
								int i_650_ = Class382.anIntArray4657[i_613_];
								int i_651_ = Class382.anIntArray4661[i_613_];
								int i_652_ = (((((Class528_Sub1) this).anIntArray8251[i_643_]) * i_650_ + (((Class528_Sub1) this).anIntArray8249[i_643_]) * i_651_ + 16383) >> 14);
								((Class528_Sub1) this).anIntArray8251[i_643_] = ((((Class528_Sub1) this).anIntArray8251[i_643_]) * i_651_ - (((Class528_Sub1) this).anIntArray8249[i_643_]) * i_650_ + 16383) >> 14;
								((Class528_Sub1) this).anIntArray8249[i_643_] = i_652_;
							}
							((Class528_Sub1) this).anIntArray8249[i_643_] += anInt8271;
							((Class528_Sub1) this).anIntArray8250[i_643_] += anInt8247;
							((Class528_Sub1) this).anIntArray8251[i_643_] += anInt8232;
						}
					}
				}
			}
			if (bool) {
				for (int i_653_ = 0; i_653_ < i_616_; i_653_++) {
					int i_654_ = is[i_653_];
					if (i_654_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_655_ = (((Class528_Sub1) this).anIntArrayArray8263[i_654_]);
						for (int i_656_ = 0; i_656_ < is_655_.length; i_656_++) {
							int i_657_ = is_655_[i_656_];
							int i_658_ = (((Class528_Sub1) this).anIntArray8290[i_657_]);
							int i_659_ = (((Class528_Sub1) this).anIntArray8290[i_657_ + 1]);
							for (int i_660_ = i_658_; i_660_ < i_659_; i_660_++) {
								int i_661_ = ((((Class528_Sub1) this).aShortArray8288[i_660_]) - 1);
								if (i_661_ == -1)
									break;
								if (i_614_ != 0) {
									int i_662_ = Class382.anIntArray4657[i_614_];
									int i_663_ = Class382.anIntArray4661[i_614_];
									int i_664_ = (((((Class528_Sub1) this).aShortArray8270[i_661_]) * i_662_ + ((((Class528_Sub1) this).aShortArray8255[i_661_]) * i_663_) + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8270[i_661_] = (short) ((((((Class528_Sub1) this).aShortArray8270[i_661_]) * i_663_) - (((Class528_Sub1) this).aShortArray8255[i_661_]) * i_662_ + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8255[i_661_] = (short) i_664_;
								}
								if (i_612_ != 0) {
									int i_665_ = Class382.anIntArray4657[i_612_];
									int i_666_ = Class382.anIntArray4661[i_612_];
									int i_667_ = (((((Class528_Sub1) this).aShortArray8270[i_661_]) * i_666_ - ((((Class528_Sub1) this).aShortArray8261[i_661_]) * i_665_) + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8261[i_661_] = (short) ((((((Class528_Sub1) this).aShortArray8270[i_661_]) * i_665_) + (((Class528_Sub1) this).aShortArray8261[i_661_]) * i_666_ + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8270[i_661_] = (short) i_667_;
								}
								if (i_613_ != 0) {
									int i_668_ = Class382.anIntArray4657[i_613_];
									int i_669_ = Class382.anIntArray4661[i_613_];
									int i_670_ = (((((Class528_Sub1) this).aShortArray8261[i_661_]) * i_668_ + ((((Class528_Sub1) this).aShortArray8255[i_661_]) * i_669_) + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8261[i_661_] = (short) ((((((Class528_Sub1) this).aShortArray8261[i_661_]) * i_669_) - (((Class528_Sub1) this).aShortArray8255[i_661_]) * i_668_ + 16383) >> 14);
									((Class528_Sub1) this).aShortArray8255[i_661_] = (short) i_670_;
								}
							}
						}
					}
				}
				if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
					((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
				if (((Class528_Sub1) this).aClass143_8274 != null)
					((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
			}
		} else if (i == 3) {
			for (int i_671_ = 0; i_671_ < i_616_; i_671_++) {
				int i_672_ = is[i_671_];
				if (i_672_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_673_ = ((Class528_Sub1) this).anIntArrayArray8263[i_672_];
					for (int i_674_ = 0; i_674_ < is_673_.length; i_674_++) {
						int i_675_ = is_673_[i_674_];
						((Class528_Sub1) this).anIntArray8249[i_675_] -= anInt8271;
						((Class528_Sub1) this).anIntArray8250[i_675_] -= anInt8247;
						((Class528_Sub1) this).anIntArray8251[i_675_] -= anInt8232;
						((Class528_Sub1) this).anIntArray8249[i_675_] = (((Class528_Sub1) this).anIntArray8249[i_675_] * i_612_) >> 7;
						((Class528_Sub1) this).anIntArray8250[i_675_] = (((Class528_Sub1) this).anIntArray8250[i_675_] * i_613_) >> 7;
						((Class528_Sub1) this).anIntArray8251[i_675_] = (((Class528_Sub1) this).anIntArray8251[i_675_] * i_614_) >> 7;
						((Class528_Sub1) this).anIntArray8249[i_675_] += anInt8271;
						((Class528_Sub1) this).anIntArray8250[i_675_] += anInt8247;
						((Class528_Sub1) this).anIntArray8251[i_675_] += anInt8232;
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_676_ = 0; i_676_ < i_616_; i_676_++) {
					int i_677_ = is[i_676_];
					if (i_677_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_678_ = (((Class528_Sub1) this).anIntArrayArray8282[i_677_]);
						for (int i_679_ = 0; i_679_ < is_678_.length; i_679_++) {
							int i_680_ = is_678_[i_679_];
							int i_681_ = (((((Class528_Sub1) this).aByteArray8265[i_680_]) & 0xff) + i_612_ * 8);
							if (i_681_ < 0)
								i_681_ = 0;
							else if (i_681_ > 255)
								i_681_ = 255;
							((Class528_Sub1) this).aByteArray8265[i_680_] = (byte) i_681_;
						}
						if (is_678_.length > 0 && ((Class528_Sub1) this).aClass143_8273 != null)
							((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_682_ = 0; i_682_ < ((Class528_Sub1) this).anInt8294; i_682_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_682_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_682_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_683_ = 0; i_683_ < i_616_; i_683_++) {
					int i_684_ = is[i_683_];
					if (i_684_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_685_ = (((Class528_Sub1) this).anIntArrayArray8282[i_684_]);
						for (int i_686_ = 0; i_686_ < is_685_.length; i_686_++) {
							int i_687_ = is_685_[i_686_];
							int i_688_ = ((((Class528_Sub1) this).aShortArray8260[i_687_]) & 0xffff);
							int i_689_ = i_688_ >> 10 & 0x3f;
							int i_690_ = i_688_ >> 7 & 0x7;
							int i_691_ = i_688_ & 0x7f;
							i_689_ = i_689_ + i_612_ & 0x3f;
							i_690_ += i_613_ / 4;
							if (i_690_ < 0)
								i_690_ = 0;
							else if (i_690_ > 7)
								i_690_ = 7;
							i_691_ += i_614_;
							if (i_691_ < 0)
								i_691_ = 0;
							else if (i_691_ > 127)
								i_691_ = 127;
							((Class528_Sub1) this).aShortArray8260[i_687_] = (short) (i_689_ << 10 | i_690_ << 7 | i_691_);
						}
						if (is_685_.length > 0 && ((Class528_Sub1) this).aClass143_8273 != null)
							((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_692_ = 0; i_692_ < ((Class528_Sub1) this).anInt8294; i_692_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_692_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_692_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_693_ = 0; i_693_ < i_616_; i_693_++) {
					int i_694_ = is[i_693_];
					if (i_694_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_695_ = (((Class528_Sub1) this).anIntArrayArray8278[i_694_]);
						for (int i_696_ = 0; i_696_ < is_695_.length; i_696_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_695_[i_696_]]);
							((Class145) class145).anInt1709 += i_612_;
							((Class145) class145).anInt1713 += i_613_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_697_ = 0; i_697_ < i_616_; i_697_++) {
					int i_698_ = is[i_697_];
					if (i_698_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_699_ = (((Class528_Sub1) this).anIntArrayArray8278[i_698_]);
						for (int i_700_ = 0; i_700_ < is_699_.length; i_700_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_699_[i_700_]]);
							((Class145) class145).anInt1710 = (((Class145) class145).anInt1710 * i_612_ >> 7);
							((Class145) class145).anInt1711 = (((Class145) class145).anInt1711 * i_613_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_701_ = 0; i_701_ < i_616_; i_701_++) {
					int i_702_ = is[i_701_];
					if (i_702_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_703_ = (((Class528_Sub1) this).anIntArrayArray8278[i_702_]);
						for (int i_704_ = 0; i_704_ < is_703_.length; i_704_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_703_[i_704_]]);
							((Class145) class145).anInt1712 = (((Class145) class145).anInt1712 + i_612_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void ka() {
		for (int i = 0; i < ((Class528_Sub1) this).anInt8303; i++) {
			((Class528_Sub1) this).anIntArray8249[i] = ((Class528_Sub1) this).anIntArray8249[i] + 7 >> 4;
			((Class528_Sub1) this).anIntArray8250[i] = ((Class528_Sub1) this).anIntArray8250[i] + 7 >> 4;
			((Class528_Sub1) this).anIntArray8251[i] = ((Class528_Sub1) this).anIntArray8251[i] + 7 >> 4;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void method11298(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub1) this).aShortArray8253 != null) {
			Matrix44Var class294_705_ = class294;
			if (bool) {
				class294_705_ = ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass294_8405;
				class294_705_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_706_ = 0; i_706_ < ((Class528_Sub1) this).anInt8248; i_706_++) {
				if ((i & ((Class528_Sub1) this).aShortArray8253[i_706_]) != 0) {
					class294_705_.method5226((float) ((Class528_Sub1) this).anIntArray8249[i_706_], (float) ((Class528_Sub1) this).anIntArray8250[i_706_], (float) ((Class528_Sub1) this).anIntArray8251[i_706_], fs);
					((Class528_Sub1) this).anIntArray8249[i_706_] = (int) fs[0];
					((Class528_Sub1) this).anIntArray8250[i_706_] = (int) fs[1];
					((Class528_Sub1) this).anIntArray8251[i_706_] = (int) fs[2];
				}
			}
		}
	}

	public Class172[] method11274() {
		return ((Class528_Sub1) this).aClass172Array8244;
	}

	public Class87[] method11253() {
		return ((Class528_Sub1) this).aClass87Array8252;
	}

	public void method11273(Matrix44Var class294) {
		Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
		class384.method6522(class294);
		if (((Class528_Sub1) this).aClass87Array8252 != null) {
			for (int i = 0; i < ((Class528_Sub1) this).aClass87Array8252.length; i++) {
				Class87 class87 = ((Class528_Sub1) this).aClass87Array8252[i];
				Class87 class87_707_ = class87;
				if (class87.aClass87_835 != null)
					class87_707_ = class87.aClass87_835;
				class87_707_.anInt844 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_707_.anInt841 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_707_.anInt847 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt836 * -1572033967])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt836 * -1572033967)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_707_.anInt834 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_707_.anInt843 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_707_.anInt845 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt837 * -1955014451])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt837 * -1955014451)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_707_.anInt846 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_707_.anInt840 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_707_.anInt848 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[class87.anInt838 * -2135413869])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class87.anInt838 * -2135413869)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub1) this).aClass172Array8244 != null) {
			for (int i = 0; i < ((Class528_Sub1) this).aClass172Array8244.length; i++) {
				Class172 class172 = ((Class528_Sub1) this).aClass172Array8244[i];
				Class172 class172_708_ = class172;
				if (class172.aClass172_2114 != null)
					class172_708_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Matrix44Arr(class384);
				class172_708_.anInt2113 = ((int) (class384.buf[12] + ((class384.buf[0] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[4] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[8] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_708_.anInt2117 = ((int) (class384.buf[13] + ((class384.buf[1] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[5] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[9] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_708_.anInt2118 = ((int) (class384.buf[14] + ((class384.buf[2] * (float) (((Class528_Sub1) this).anIntArray8249[(class172.anInt2119 * -1382123871)])) + (class384.buf[6] * (float) (((Class528_Sub1) this).anIntArray8250[(class172.anInt2119 * -1382123871)])) + (class384.buf[10] * (float) (((Class528_Sub1) this).anIntArray8251[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	public boolean method11270(int i, int i_709_, Matrix44Var class294, boolean bool, int i_710_) {
		Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
		class384.method6522(class294);
		class384.method6523(((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8394);
		boolean bool_711_ = false;
		int i_712_ = 2147483647;
		int i_713_ = -2147483648;
		int i_714_ = 2147483647;
		int i_715_ = -2147483648;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i_716_ = ((((Class528_Sub1) this).aShort8286 - ((Class528_Sub1) this).aShort8285) >> 1);
		int i_717_ = ((((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283) >> 1);
		int i_718_ = ((((Class528_Sub1) this).aShort8306 - ((Class528_Sub1) this).aShort8287) >> 1);
		int i_719_ = ((Class528_Sub1) this).aShort8285 + i_716_;
		int i_720_ = ((Class528_Sub1) this).aShort8283 + i_717_;
		int i_721_ = ((Class528_Sub1) this).aShort8287 + i_718_;
		int i_722_ = i_719_ - (i_716_ << i_710_);
		int i_723_ = i_720_ - (i_717_ << i_710_);
		int i_724_ = i_721_ - (i_718_ << i_710_);
		int i_725_ = i_719_ + (i_716_ << i_710_);
		int i_726_ = i_720_ + (i_717_ << i_710_);
		int i_727_ = i_721_ + (i_718_ << i_710_);
		anIntArray8296[0] = i_722_;
		anIntArray8301[0] = i_723_;
		anIntArray8268[0] = i_724_;
		anIntArray8296[1] = i_725_;
		anIntArray8301[1] = i_723_;
		anIntArray8268[1] = i_724_;
		anIntArray8296[2] = i_722_;
		anIntArray8301[2] = i_726_;
		anIntArray8268[2] = i_724_;
		anIntArray8296[3] = i_725_;
		anIntArray8301[3] = i_726_;
		anIntArray8268[3] = i_724_;
		anIntArray8296[4] = i_722_;
		anIntArray8301[4] = i_723_;
		anIntArray8268[4] = i_727_;
		anIntArray8296[5] = i_725_;
		anIntArray8301[5] = i_723_;
		anIntArray8268[5] = i_727_;
		anIntArray8296[6] = i_722_;
		anIntArray8301[6] = i_726_;
		anIntArray8268[6] = i_727_;
		anIntArray8296[7] = i_725_;
		anIntArray8301[7] = i_726_;
		anIntArray8268[7] = i_727_;
		for (int i_728_ = 0; i_728_ < 8; i_728_++) {
			int i_729_ = anIntArray8296[i_728_];
			int i_730_ = anIntArray8301[i_728_];
			int i_731_ = anIntArray8268[i_728_];
			float f = (class384.buf[2] * (float) i_729_ + class384.buf[6] * (float) i_730_ + class384.buf[10] * (float) i_731_ + class384.buf[14]);
			float f_732_ = (class384.buf[3] * (float) i_729_ + class384.buf[7] * (float) i_730_ + class384.buf[11] * (float) i_731_ + class384.buf[15]);
			if (f >= -f_732_) {
				float f_733_ = (class384.buf[0] * (float) i_729_ + class384.buf[4] * (float) i_730_ + class384.buf[8] * (float) i_731_ + class384.buf[12]);
				float f_734_ = (class384.buf[1] * (float) i_729_ + class384.buf[5] * (float) i_730_ + class384.buf[9] * (float) i_731_ + class384.buf[13]);
				int i_735_ = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398) * f_733_ / f_732_);
				int i_736_ = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400) * f_734_ / f_732_);
				if (i_735_ < i_712_)
					i_712_ = i_735_;
				if (i_735_ > i_713_)
					i_713_ = i_735_;
				if (i_736_ < i_714_)
					i_714_ = i_736_;
				if (i_736_ > i_715_)
					i_715_ = i_736_;
				bool_711_ = true;
			}
		}
		if (bool_711_ && i > i_712_ && i < i_713_ && i_709_ > i_714_ && i_709_ < i_715_) {
			if (bool)
				return true;
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500).length < ((Class528_Sub1) this).anInt8300) {
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500 = new int[((Class528_Sub1) this).anInt8300];
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501 = new int[((Class528_Sub1) this).anInt8300];
			}
			int[] is = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500);
			int[] is_737_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501);
			for (int i_738_ = 0; i_738_ < ((Class528_Sub1) this).anInt8248; i_738_++) {
				int i_739_ = ((Class528_Sub1) this).anIntArray8249[i_738_];
				int i_740_ = ((Class528_Sub1) this).anIntArray8250[i_738_];
				int i_741_ = ((Class528_Sub1) this).anIntArray8251[i_738_];
				float f = (class384.buf[2] * (float) i_739_ + class384.buf[6] * (float) i_740_ + class384.buf[10] * (float) i_741_ + class384.buf[14]);
				float f_742_ = (class384.buf[3] * (float) i_739_ + class384.buf[7] * (float) i_740_ + class384.buf[11] * (float) i_741_ + class384.buf[15]);
				if (f >= -f_742_) {
					float f_743_ = (class384.buf[0] * (float) i_739_ + class384.buf[4] * (float) i_740_ + class384.buf[8] * (float) i_741_ + class384.buf[12]);
					float f_744_ = (class384.buf[1] * (float) i_739_ + class384.buf[5] * (float) i_740_ + class384.buf[9] * (float) i_741_ + class384.buf[13]);
					int i_745_ = ((Class528_Sub1) this).anIntArray8290[i_738_];
					int i_746_ = ((Class528_Sub1) this).anIntArray8290[i_738_ + 1];
					for (int i_747_ = i_745_; i_747_ < i_746_; i_747_++) {
						int i_748_ = (((Class528_Sub1) this).aShortArray8288[i_747_] - 1);
						if (i_748_ == -1)
							break;
						is[i_748_] = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_743_ / f_742_));
						is_737_[i_748_] = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_744_ / f_742_));
					}
				} else {
					int i_749_ = ((Class528_Sub1) this).anIntArray8290[i_738_];
					int i_750_ = ((Class528_Sub1) this).anIntArray8290[i_738_ + 1];
					for (int i_751_ = i_749_; i_751_ < i_750_; i_751_++) {
						int i_752_ = (((Class528_Sub1) this).aShortArray8288[i_751_] - 1);
						if (i_752_ == -1)
							break;
						is[((Class528_Sub1) this).aShortArray8288[i_751_] - 1] = -999999;
					}
				}
			}
			for (int i_753_ = 0; i_753_ < ((Class528_Sub1) this).anInt8262; i_753_++) {
				if ((is[((Class528_Sub1) this).aShortArray8266[i_753_]] != -999999) && (is[((Class528_Sub1) this).aShortArray8267[i_753_]] != -999999) && (is[((Class528_Sub1) this).aShortArray8256[i_753_]] != -999999)
						&& method13532(i, i_709_, is_737_[(((Class528_Sub1) this).aShortArray8266[i_753_])], is_737_[(((Class528_Sub1) this).aShortArray8267[i_753_])], is_737_[(((Class528_Sub1) this).aShortArray8256[i_753_])], is[(((Class528_Sub1) this).aShortArray8266[i_753_])], is[(((Class528_Sub1) this).aShortArray8267[i_753_])], is[(((Class528_Sub1) this).aShortArray8256[i_753_])]))
					return true;
			}
		}
		return false;
	}

	boolean method13532(int i, int i_754_, int i_755_, int i_756_, int i_757_, int i_758_, int i_759_, int i_760_) {
		if (i_754_ < i_755_ && i_754_ < i_756_ && i_754_ < i_757_)
			return false;
		if (i_754_ > i_755_ && i_754_ > i_756_ && i_754_ > i_757_)
			return false;
		if (i < i_758_ && i < i_759_ && i < i_760_)
			return false;
		if (i > i_758_ && i > i_759_ && i > i_760_)
			return false;
		return true;
	}

	boolean method13533(int i, int i_761_, int i_762_, int i_763_, int i_764_, int i_765_, int i_766_, int i_767_) {
		if (i_761_ < i_762_ && i_761_ < i_763_ && i_761_ < i_764_)
			return false;
		if (i_761_ > i_762_ && i_761_ > i_763_ && i_761_ > i_764_)
			return false;
		if (i < i_765_ && i < i_766_ && i < i_767_)
			return false;
		if (i > i_765_ && i > i_766_ && i > i_767_)
			return false;
		return true;
	}

	public Class282_Sub50_Sub17 dn(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub1) this).anInt8300 == 0)
			return null;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i;
		int i_768_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) > 0) {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_768_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_768_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_769_;
		int i_770_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8439) > 0) {
			i_769_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_770_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i_769_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_770_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_771_ = i_768_ - i + 1;
		int i_772_ = i_770_ - i_769_ + 1;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_773_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_771_, i_772_)) {
			class282_sub50_sub17_sub1_773_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_773_.method15712();
		} else
			class282_sub50_sub17_sub1_773_ = new Class282_Sub50_Sub17_Sub1((((Class528_Sub1) this).aClass505_Sub1_8239), i_771_, i_772_);
		class282_sub50_sub17_sub1_773_.method15721(i, i_769_, i_768_, i_770_);
		method13522(class282_sub50_sub17_sub1_773_);
		return class282_sub50_sub17_sub1_773_;
	}

	public void method11282(Matrix44Var class294, Class275_Sub5 class275_sub5, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((Class528_Sub1) this).anInt8300 != 0) {
			Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8442);
			Matrix44Arr class384_774_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
			Matrix44Arr class384_775_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8407);
			class384_774_.method6522(class294);
			class384_775_.method6562(class384_774_);
			class384_775_.method6523(((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass384_8394);
			if (!((Class528_Sub1) this).aBool8254)
				method13528();
			float[] fs = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArray8396);
			class384_774_.method6527(0.0F, (float) ((Class528_Sub1) this).aShort8283, 0.0F, fs);
			float f = fs[0];
			float f_776_ = fs[1];
			float f_777_ = fs[2];
			class384_774_.method6527(0.0F, (float) ((Class528_Sub1) this).aShort8284, 0.0F, fs);
			float f_778_ = fs[0];
			float f_779_ = fs[1];
			float f_780_ = fs[2];
			for (int i_781_ = 0; i_781_ < 6; i_781_++) {
				float[] fs_782_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArrayArray8395[i_781_]);
				float f_783_ = (fs_782_[0] * f + fs_782_[1] * f_776_ + fs_782_[2] * f_777_ + fs_782_[3] + (float) ((Class528_Sub1) this).anInt8281);
				float f_784_ = (fs_782_[0] * f_778_ + fs_782_[1] * f_779_ + fs_782_[2] * f_780_ + fs_782_[3] + (float) ((Class528_Sub1) this).anInt8281);
				if (f_783_ < 0.0F && f_784_ < 0.0F)
					return;
			}
			if (class275_sub5 != null) {
				boolean bool = false;
				boolean bool_785_ = true;
				int i_786_ = ((((Class528_Sub1) this).aShort8285 + ((Class528_Sub1) this).aShort8286) >> 1);
				int i_787_ = ((((Class528_Sub1) this).aShort8287 + ((Class528_Sub1) this).aShort8306) >> 1);
				int i_788_ = i_786_;
				short i_789_ = ((Class528_Sub1) this).aShort8283;
				int i_790_ = i_787_;
				float f_791_ = (class384_775_.buf[0] * (float) i_788_ + class384_775_.buf[4] * (float) i_789_ + class384_775_.buf[8] * (float) i_790_ + class384_775_.buf[12]);
				float f_792_ = (class384_775_.buf[1] * (float) i_788_ + class384_775_.buf[5] * (float) i_789_ + class384_775_.buf[9] * (float) i_790_ + class384_775_.buf[13]);
				float f_793_ = (class384_775_.buf[2] * (float) i_788_ + class384_775_.buf[6] * (float) i_789_ + class384_775_.buf[10] * (float) i_790_ + class384_775_.buf[14]);
				float f_794_ = (class384_775_.buf[3] * (float) i_788_ + class384_775_.buf[7] * (float) i_789_ + class384_775_.buf[11] * (float) i_790_ + class384_775_.buf[15]);
				if (f_793_ >= -f_794_) {
					class275_sub5.anInt7847 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398) * f_791_ / f_794_);
					class275_sub5.anInt7848 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400) * f_792_ / f_794_);
				} else
					bool = true;
				i_788_ = i_786_;
				i_789_ = ((Class528_Sub1) this).aShort8284;
				i_790_ = i_787_;
				float f_795_ = (class384_775_.buf[0] * (float) i_788_ + class384_775_.buf[4] * (float) i_789_ + class384_775_.buf[8] * (float) i_790_ + class384_775_.buf[12]);
				float f_796_ = (class384_775_.buf[1] * (float) i_788_ + class384_775_.buf[5] * (float) i_789_ + class384_775_.buf[9] * (float) i_790_ + class384_775_.buf[13]);
				float f_797_ = (class384_775_.buf[2] * (float) i_788_ + class384_775_.buf[6] * (float) i_789_ + class384_775_.buf[10] * (float) i_790_ + class384_775_.buf[14]);
				float f_798_ = (class384_775_.buf[3] * (float) i_788_ + class384_775_.buf[7] * (float) i_789_ + class384_775_.buf[11] * (float) i_790_ + class384_775_.buf[15]);
				if (f_797_ >= -f_798_) {
					class275_sub5.anInt7850 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398) * f_795_ / f_798_);
					class275_sub5.anInt7846 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400) * f_796_ / f_798_);
				} else
					bool = true;
				if (bool) {
					if (f_793_ < -f_794_ && f_797_ < -f_798_)
						bool_785_ = false;
					else if (f_793_ < -f_794_) {
						float f_799_ = (f_793_ + f_794_) / (f_797_ + f_798_) - 1.0F;
						float f_800_ = f_791_ + f_799_ * (f_795_ - f_791_);
						float f_801_ = f_792_ + f_799_ * (f_796_ - f_792_);
						float f_802_ = f_794_ + f_799_ * (f_798_ - f_794_);
						class275_sub5.anInt7847 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_800_ / f_802_));
						class275_sub5.anInt7848 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_801_ / f_802_));
					} else if (f_797_ < -f_798_) {
						float f_803_ = (f_797_ + f_798_) / (f_793_ + f_794_) - 1.0F;
						float f_804_ = f_795_ + f_803_ * (f_791_ - f_795_);
						float f_805_ = f_796_ + f_803_ * (f_792_ - f_796_);
						float f_806_ = f_798_ + f_803_ * (f_794_ - f_798_);
						class275_sub5.anInt7850 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_804_ / f_806_));
						class275_sub5.anInt7846 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_805_ / f_806_));
					}
				}
				if (bool_785_) {
					if (f_793_ / f_794_ > f_797_ / f_798_) {
						float f_807_ = (f_791_ + (class384.buf[0] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[12]);
						float f_808_ = (f_794_ + (class384.buf[3] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) - (float) class275_sub5.anInt7847 + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_807_ / f_808_));
					} else {
						float f_809_ = (f_795_ + (class384.buf[0] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[12]);
						float f_810_ = (f_798_ + (class384.buf[3] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) - (float) class275_sub5.anInt7850 + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_809_ / f_810_));
					}
					class275_sub5.aBool7849 = true;
				}
			}
			((Class528_Sub1) this).aClass505_Sub1_8239.method13607();
			((Class528_Sub1) this).aClass505_Sub1_8239.method13633(class384_774_);
			method13534();
			((Class528_Sub1) this).aClass505_Sub1_8239.method13641();
			class384_774_.method6523(((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass384_8348);
			method13535(class384_774_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	void method13534() {
		if (((Class528_Sub1) this).anInt8302 != 0) {
			if (((Class528_Sub1) this).aByte8242 != 0)
				method13537(true);
			method13537(false);
			if (((Class528_Sub1) this).aClass132_8276 != null) {
				if ((((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) == null)
					method13536((((Class528_Sub1) this).aByte8242 & 0x10) != 0);
				if ((((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) != null) {
					((Class528_Sub1) this).aClass505_Sub1_8239.method13620(((Class528_Sub1) this).aClass143_8274 != null);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13647(((Class528_Sub1) this).aClass143_8272, ((Class528_Sub1) this).aClass143_8274, ((Class528_Sub1) this).aClass143_8273, ((Class528_Sub1) this).aClass143_8275);
					int i = ((Class528_Sub1) this).anIntArray8289.length - 1;
					for (int i_811_ = 0; i_811_ < i; i_811_++) {
						int i_812_ = ((Class528_Sub1) this).anIntArray8289[i_811_];
						int i_813_ = (((Class528_Sub1) this).anIntArray8289[i_811_ + 1]);
						int i_814_ = (((Class528_Sub1) this).aShortArray8269[i_812_] & 0xffff);
						if (i_814_ == 65535)
							i_814_ = -1;
						((Class528_Sub1) this).aClass505_Sub1_8239.method13608(i_814_, ((Class528_Sub1) this).aClass143_8274 != null);
						((Class528_Sub1) this).aClass505_Sub1_8239.method13611(((Class132) (((Class528_Sub1) this).aClass132_8276)).anInterface15_1595, 4, i_812_ * 3, (i_813_ - i_812_) * 3);
					}
				}
			}
			method13525();
		}
	}

	void method13535(Matrix44Arr class384) {
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			Matrix44Arr class384_815_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8361);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13576();
			((Class528_Sub1) this).aClass505_Sub1_8239.RA(!((Class528_Sub1) this).aBool8245);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13620(false);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13647((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass143_8494), null, null, (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass143_8495));
			for (int i = 0; i < ((Class528_Sub1) this).anInt8294; i++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i];
				if (!((Class162) class162).aBool2018 || !((Class528_Sub1) this).aClass505_Sub1_8239.method8471()) {
					float f = ((float) ((((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_816_ = ((float) ((((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_817_ = ((float) ((((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_818_ = (class384.buf[0] * f + class384.buf[4] * f_816_ + class384.buf[8] * f_817_ + class384.buf[12]);
					float f_819_ = (class384.buf[1] * f + class384.buf[5] * f_816_ + class384.buf[9] * f_817_ + class384.buf[13]);
					float f_820_ = (class384.buf[2] * f + class384.buf[6] * f_816_ + class384.buf[10] * f_817_ + class384.buf[14]);
					float f_821_ = ((float) (1.0 / Math.sqrt((double) (f_818_ * f_818_ + f_819_ * f_819_ + f_820_ * f_820_))) * (float) ((Class162) class162).anInt2025);
					class384_815_.method6549(((Class145) class145).anInt1712, (((Class145) class145).anInt1710 * ((Class162) class162).aShort2020) >> 7, (((Class145) class145).anInt1711 * ((Class162) class162).aShort2016) >> 7, (f_818_ + (float) ((Class145) class145).anInt1709 - f_818_ * f_821_), (f_819_ + (float) ((Class145) class145).anInt1713 - f_819_ * f_821_), f_820_ - f_820_ * f_821_);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13585(class384_815_);
					int i_822_ = ((Class145) class145).anInt1714;
					OpenGL.glColor4ub((byte) (i_822_ >> 16), (byte) (i_822_ >> 8), (byte) i_822_, (byte) (i_822_ >> 24));
					((Class528_Sub1) this).aClass505_Sub1_8239.method13581(((Class162) class162).aShort2022);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13624(((Class162) class162).aByte2024);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13603(7, 0, 4);
				}
			}
			((Class528_Sub1) this).aClass505_Sub1_8239.RA(true);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13641();
		}
	}

	void method13536(boolean bool) {
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8302 * 6)
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8302 + 100) * 6);
		else
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
		if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8266[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8267[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8256[i]), 1417031095);
			}
		} else {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8266[i]), (byte) -112);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8267[i]), (byte) -102);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8256[i]), (byte) -97);
			}
		}
		if (class282_sub35_sub1.index * -1990677291 != 0) {
			if (bool) {
				if (((Class528_Sub1) this).anInterface15_8277 == null)
					((Class528_Sub1) this).anInterface15_8277 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface15_8277.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = ((Class528_Sub1) this).anInterface15_8277;
			} else
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
			if (!bool)
				((Class528_Sub1) this).aBool8279 = true;
		}
	}

	void method13537(boolean bool) {
		boolean bool_823_ = (((Class528_Sub1) this).aClass143_8273 != null && (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) == null);
		boolean bool_824_ = (((Class528_Sub1) this).aClass143_8274 != null && (((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) == null);
		boolean bool_825_ = (((Class528_Sub1) this).aClass143_8272 != null && (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) == null);
		boolean bool_826_ = (((Class528_Sub1) this).aClass143_8275 != null && (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) == null);
		if (bool) {
			bool_823_ = bool_823_ & (((Class528_Sub1) this).aByte8242 & 0x2) != 0;
			bool_824_ = bool_824_ & (((Class528_Sub1) this).aByte8242 & 0x4) != 0;
			bool_825_ = bool_825_ & (((Class528_Sub1) this).aByte8242 & 0x1) != 0;
			bool_826_ = bool_826_ & (((Class528_Sub1) this).aByte8242 & 0x8) != 0;
		}
		byte i = 0;
		byte i_827_ = 0;
		byte i_828_ = 0;
		byte i_829_ = 0;
		byte i_830_ = 0;
		if (bool_825_) {
			i_827_ = i;
			i += 12;
		}
		if (bool_823_) {
			i_828_ = i;
			i += 4;
		}
		if (bool_824_) {
			i_829_ = i;
			i += 12;
		}
		if (bool_826_) {
			i_830_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8300 * i)
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8300 + 100) * i);
			else
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
			if (bool_825_) {
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_831_ = 0; i_831_ < ((Class528_Sub1) this).anInt8248; i_831_++) {
						int i_832_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_831_]);
						int i_833_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_831_]);
						int i_834_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_831_]);
						int i_835_ = ((Class528_Sub1) this).anIntArray8290[i_831_];
						int i_836_ = (((Class528_Sub1) this).anIntArray8290[i_831_ + 1]);
						for (int i_837_ = i_835_; i_837_ < i_836_; i_837_++) {
							int i_838_ = ((((Class528_Sub1) this).aShortArray8288[i_837_]) - 1);
							if (i_838_ == -1)
								break;
							class282_sub35_sub1.index = i_838_ * i * -1115476867;
							class282_sub35_sub1.writeInt(i_832_);
							class282_sub35_sub1.writeInt(i_833_);
							class282_sub35_sub1.writeInt(i_834_);
						}
					}
				} else {
					for (int i_839_ = 0; i_839_ < ((Class528_Sub1) this).anInt8248; i_839_++) {
						int i_840_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_839_]);
						int i_841_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_839_]);
						int i_842_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_839_]);
						int i_843_ = ((Class528_Sub1) this).anIntArray8290[i_839_];
						int i_844_ = (((Class528_Sub1) this).anIntArray8290[i_839_ + 1]);
						for (int i_845_ = i_843_; i_845_ < i_844_; i_845_++) {
							int i_846_ = (((((Class528_Sub1) this).aShortArray8288[i_845_]) & 0xffff) - 1);
							if (i_846_ == -1)
								break;
							class282_sub35_sub1.index = i_846_ * i * -1115476867;
							class282_sub35_sub1.method13232(i_840_, (byte) -45);
							class282_sub35_sub1.method13232(i_841_, (byte) -75);
							class282_sub35_sub1.method13232(i_842_, (byte) -88);
						}
					}
				}
			}
			if (bool_823_) {
				if (((Class528_Sub1) this).aClass143_8274 == null) {
					short[] is;
					short[] is_847_;
					short[] is_848_;
					byte[] is_849_;
					if (((Class528_Sub1) this).aClass166_8259 != null) {
						is = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2038;
						is_847_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2039;
						is_848_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2041;
						is_849_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aByteArray2040;
					} else {
						is = ((Class528_Sub1) this).aShortArray8255;
						is_847_ = ((Class528_Sub1) this).aShortArray8270;
						is_848_ = ((Class528_Sub1) this).aShortArray8261;
						is_849_ = ((Class528_Sub1) this).aByteArray8264;
					}
					float f = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArray8426[0]);
					float f_850_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[1]);
					float f_851_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[2]);
					float f_852_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8432);
					float f_853_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8433 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					float f_854_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8434 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					for (int i_855_ = 0; i_855_ < ((Class528_Sub1) this).anInt8262; i_855_++) {
						int i_856_ = method13531((((Class528_Sub1) this).aShortArray8260[i_855_]), (((Class528_Sub1) this).aShortArray8269[i_855_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_855_]));
						float f_857_ = ((float) (i_856_ >>> 24) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8429));
						float f_858_ = ((float) (i_856_ >> 16 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8430));
						float f_859_ = ((float) (i_856_ >> 8 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8431));
						int i_860_ = ((Class528_Sub1) this).aShortArray8266[i_855_];
						short i_861_ = (short) is_849_[i_860_];
						float f_862_;
						if (i_861_ == 0)
							f_862_ = ((f * (float) is[i_860_] + f_850_ * (float) is_847_[i_860_] + f_851_ * (float) is_848_[i_860_]) * 0.0026041667F);
						else
							f_862_ = ((f * (float) is[i_860_] + f_850_ * (float) is_847_[i_860_] + f_851_ * (float) is_848_[i_860_]) / (float) (i_861_ * 256));
						float f_863_ = f_852_ + f_862_ * (f_862_ < 0.0F ? f_854_ : f_853_);
						int i_864_ = (int) (f_857_ * f_863_);
						if (i_864_ < 0)
							i_864_ = 0;
						else if (i_864_ > 255)
							i_864_ = 255;
						int i_865_ = (int) (f_858_ * f_863_);
						if (i_865_ < 0)
							i_865_ = 0;
						else if (i_865_ > 255)
							i_865_ = 255;
						int i_866_ = (int) (f_859_ * f_863_);
						if (i_866_ < 0)
							i_866_ = 0;
						else if (i_866_ > 255)
							i_866_ = 255;
						class282_sub35_sub1.index = (i_828_ + i_860_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_864_);
						class282_sub35_sub1.writeByte(i_865_);
						class282_sub35_sub1.writeByte(i_866_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_855_]) & 0xff)));
						i_860_ = ((Class528_Sub1) this).aShortArray8267[i_855_];
						i_861_ = (short) is_849_[i_860_];
						if (i_861_ == 0)
							f_862_ = ((f * (float) is[i_860_] + f_850_ * (float) is_847_[i_860_] + f_851_ * (float) is_848_[i_860_]) * 0.0026041667F);
						else
							f_862_ = ((f * (float) is[i_860_] + f_850_ * (float) is_847_[i_860_] + f_851_ * (float) is_848_[i_860_]) / (float) (i_861_ * 256));
						f_863_ = f_852_ + f_862_ * (f_862_ < 0.0F ? f_854_ : f_853_);
						i_864_ = (int) (f_857_ * f_863_);
						if (i_864_ < 0)
							i_864_ = 0;
						else if (i_864_ > 255)
							i_864_ = 255;
						i_865_ = (int) (f_858_ * f_863_);
						if (i_865_ < 0)
							i_865_ = 0;
						else if (i_865_ > 255)
							i_865_ = 255;
						i_866_ = (int) (f_859_ * f_863_);
						if (i_866_ < 0)
							i_866_ = 0;
						else if (i_866_ > 255)
							i_866_ = 255;
						class282_sub35_sub1.index = (i_828_ + i_860_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_864_);
						class282_sub35_sub1.writeByte(i_865_);
						class282_sub35_sub1.writeByte(i_866_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_855_]) & 0xff)));
						i_860_ = ((Class528_Sub1) this).aShortArray8256[i_855_];
						i_861_ = (short) is_849_[i_860_];
						if (i_861_ == 0)
							f_862_ = ((f * (float) is[i_860_] + f_850_ * (float) is_847_[i_860_] + f_851_ * (float) is_848_[i_860_]) * 0.0026041667F);
						else
							f_862_ = ((f * (float) is[i_860_] + f_850_ * (float) is_847_[i_860_] + f_851_ * (float) is_848_[i_860_]) / (float) (i_861_ * 256));
						f_863_ = f_852_ + f_862_ * (f_862_ < 0.0F ? f_854_ : f_853_);
						i_864_ = (int) (f_857_ * f_863_);
						if (i_864_ < 0)
							i_864_ = 0;
						else if (i_864_ > 255)
							i_864_ = 255;
						i_865_ = (int) (f_858_ * f_863_);
						if (i_865_ < 0)
							i_865_ = 0;
						else if (i_865_ > 255)
							i_865_ = 255;
						i_866_ = (int) (f_859_ * f_863_);
						if (i_866_ < 0)
							i_866_ = 0;
						else if (i_866_ > 255)
							i_866_ = 255;
						class282_sub35_sub1.index = (i_828_ + i_860_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_864_);
						class282_sub35_sub1.writeByte(i_865_);
						class282_sub35_sub1.writeByte(i_866_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_855_]) & 0xff)));
					}
				} else {
					for (int i_867_ = 0; i_867_ < ((Class528_Sub1) this).anInt8262; i_867_++) {
						int i_868_ = method13531((((Class528_Sub1) this).aShortArray8260[i_867_]), (((Class528_Sub1) this).aShortArray8269[i_867_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_867_]));
						class282_sub35_sub1.index = (i_828_ + ((((Class528_Sub1) this).aShortArray8266[i_867_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_868_);
						class282_sub35_sub1.index = (i_828_ + ((((Class528_Sub1) this).aShortArray8267[i_867_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_868_);
						class282_sub35_sub1.index = (i_828_ + ((((Class528_Sub1) this).aShortArray8256[i_867_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_868_);
					}
				}
			}
			if (bool_824_) {
				short[] is;
				short[] is_869_;
				short[] is_870_;
				byte[] is_871_;
				if (((Class528_Sub1) this).aClass166_8259 != null) {
					is = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
					is_869_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
					is_870_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
					is_871_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
				} else {
					is = ((Class528_Sub1) this).aShortArray8255;
					is_869_ = ((Class528_Sub1) this).aShortArray8270;
					is_870_ = ((Class528_Sub1) this).aShortArray8261;
					is_871_ = ((Class528_Sub1) this).aByteArray8264;
				}
				float f = 3.0F / (float) ((Class528_Sub1) this).aShort8257;
				float f_872_ = 3.0F / (float) (((Class528_Sub1) this).aShort8257 + ((Class528_Sub1) this).aShort8257 / 2);
				class282_sub35_sub1.index = i_829_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_873_ = 0; i_873_ < ((Class528_Sub1) this).anInt8300; i_873_++) {
						int i_874_ = is_871_[i_873_] & 0xff;
						if (i_874_ == 0) {
							class282_sub35_sub1.method14688((float) is[i_873_] * f_872_);
							class282_sub35_sub1.method14688((float) is_869_[i_873_] * f_872_);
							class282_sub35_sub1.method14688((float) is_870_[i_873_] * f_872_);
						} else {
							float f_875_ = f / (float) i_874_;
							class282_sub35_sub1.method14688((float) is[i_873_] * f_875_);
							class282_sub35_sub1.method14688((float) is_869_[i_873_] * f_875_);
							class282_sub35_sub1.method14688((float) is_870_[i_873_] * f_875_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				} else {
					for (int i_876_ = 0; i_876_ < ((Class528_Sub1) this).anInt8300; i_876_++) {
						int i_877_ = is_871_[i_876_] & 0xff;
						if (i_877_ == 0) {
							class282_sub35_sub1.method14685((float) is[i_876_] * f_872_);
							class282_sub35_sub1.method14685((float) is_869_[i_876_] * f_872_);
							class282_sub35_sub1.method14685((float) is_870_[i_876_] * f_872_);
						} else {
							float f_878_ = f / (float) i_877_;
							class282_sub35_sub1.method14685((float) is[i_876_] * f_878_);
							class282_sub35_sub1.method14685((float) is_869_[i_876_] * f_878_);
							class282_sub35_sub1.method14685((float) is_870_[i_876_] * f_878_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				}
			}
			if (bool_826_) {
				class282_sub35_sub1.index = i_830_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_879_ = 0; i_879_ < ((Class528_Sub1) this).anInt8300; i_879_++) {
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8297[i_879_]);
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8292[i_879_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				} else {
					for (int i_880_ = 0; i_880_ < ((Class528_Sub1) this).anInt8300; i_880_++) {
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8297[i_880_]);
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8292[i_880_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				}
			}
			class282_sub35_sub1.index = i * ((Class528_Sub1) this).anInt8300 * -1115476867;
			Interface14 interface14;
			if (bool) {
				if (((Class528_Sub1) this).anInterface14_8305 == null)
					((Class528_Sub1) this).anInterface14_8305 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface14_8305.method106(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				interface14 = ((Class528_Sub1) this).anInterface14_8305;
				((Class528_Sub1) this).aByte8242 = (byte) 0;
			} else {
				interface14 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
				((Class528_Sub1) this).aBool8279 = true;
			}
			if (bool_825_) {
				((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8272).aByte1669 = i_827_;
			}
			if (bool_826_) {
				((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8275).aByte1669 = i_830_;
			}
			if (bool_823_) {
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8273).aByte1669 = i_828_;
			}
			if (bool_824_) {
				((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8274).aByte1669 = i_829_;
			}
		}
	}

	public void ce(int i) {
		((Class528_Sub1) this).aShort8243 = (short) i;
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	static final int method13538(int i, int i_881_) {
		i_881_ = i_881_ * (i & 0x7f) >> 7;
		if (i_881_ < 2)
			i_881_ = 2;
		else if (i_881_ > 126)
			i_881_ = 126;
		return (i & 0xff80) + i_881_;
	}

	public void method11292(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub1) this).aShortArray8253 != null) {
			Matrix44Var class294_882_ = class294;
			if (bool) {
				class294_882_ = ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass294_8405;
				class294_882_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_883_ = 0; i_883_ < ((Class528_Sub1) this).anInt8248; i_883_++) {
				if ((i & ((Class528_Sub1) this).aShortArray8253[i_883_]) != 0) {
					class294_882_.method5226((float) ((Class528_Sub1) this).anIntArray8249[i_883_], (float) ((Class528_Sub1) this).anIntArray8250[i_883_], (float) ((Class528_Sub1) this).anIntArray8251[i_883_], fs);
					((Class528_Sub1) this).anIntArray8249[i_883_] = (int) fs[0];
					((Class528_Sub1) this).anIntArray8250[i_883_] = (int) fs[1];
					((Class528_Sub1) this).anIntArray8251[i_883_] = (int) fs[2];
				}
			}
		}
	}

	public MeshRasterizer method11276(byte i, int i_884_, boolean bool) {
		boolean bool_885_ = false;
		Class528_Sub1 class528_sub1_886_;
		Class528_Sub1 class528_sub1_887_;
		if (i > 0 && i <= 7) {
			class528_sub1_887_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8492[i - 1]);
			class528_sub1_886_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8479[i - 1]);
			bool_885_ = true;
		} else
			class528_sub1_886_ = class528_sub1_887_ = new Class528_Sub1(((Class528_Sub1) this).aClass505_Sub1_8239);
		return method13524(class528_sub1_886_, class528_sub1_887_, i_884_, bool_885_, bool);
	}

	public void method11299(MeshRasterizer class528, int i, int i_888_, int i_889_, boolean bool) {
		Class528_Sub1 class528_sub1_890_ = (Class528_Sub1) class528;
		if (((Class528_Sub1) this).anInt8262 != 0 && ((Class528_Sub1) class528_sub1_890_).anInt8262 != 0) {
			int i_891_ = ((Class528_Sub1) class528_sub1_890_).anInt8248;
			int[] is = ((Class528_Sub1) class528_sub1_890_).anIntArray8249;
			int[] is_892_ = ((Class528_Sub1) class528_sub1_890_).anIntArray8250;
			int[] is_893_ = ((Class528_Sub1) class528_sub1_890_).anIntArray8251;
			short[] is_894_ = ((Class528_Sub1) class528_sub1_890_).aShortArray8255;
			short[] is_895_ = ((Class528_Sub1) class528_sub1_890_).aShortArray8270;
			short[] is_896_ = ((Class528_Sub1) class528_sub1_890_).aShortArray8261;
			byte[] is_897_ = ((Class528_Sub1) class528_sub1_890_).aByteArray8264;
			short[] is_898_;
			short[] is_899_;
			short[] is_900_;
			byte[] is_901_;
			if (((Class528_Sub1) this).aClass166_8259 != null) {
				is_898_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
				is_899_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
				is_900_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
				is_901_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
			} else {
				is_898_ = null;
				is_899_ = null;
				is_900_ = null;
				is_901_ = null;
			}
			short[] is_902_;
			short[] is_903_;
			short[] is_904_;
			byte[] is_905_;
			if (((Class528_Sub1) class528_sub1_890_).aClass166_8259 != null) {
				is_902_ = ((Class166) (((Class528_Sub1) class528_sub1_890_).aClass166_8259)).aShortArray2038;
				is_903_ = ((Class166) (((Class528_Sub1) class528_sub1_890_).aClass166_8259)).aShortArray2039;
				is_904_ = ((Class166) (((Class528_Sub1) class528_sub1_890_).aClass166_8259)).aShortArray2041;
				is_905_ = ((Class166) (((Class528_Sub1) class528_sub1_890_).aClass166_8259)).aByteArray2040;
			} else {
				is_902_ = null;
				is_903_ = null;
				is_904_ = null;
				is_905_ = null;
			}
			int[] is_906_ = ((Class528_Sub1) class528_sub1_890_).anIntArray8290;
			short[] is_907_ = ((Class528_Sub1) class528_sub1_890_).aShortArray8288;
			if (!((Class528_Sub1) class528_sub1_890_).aBool8254)
				class528_sub1_890_.method13528();
			int i_908_ = ((Class528_Sub1) class528_sub1_890_).aShort8283;
			int i_909_ = ((Class528_Sub1) class528_sub1_890_).aShort8284;
			int i_910_ = ((Class528_Sub1) class528_sub1_890_).aShort8285;
			int i_911_ = ((Class528_Sub1) class528_sub1_890_).aShort8286;
			int i_912_ = ((Class528_Sub1) class528_sub1_890_).aShort8287;
			int i_913_ = ((Class528_Sub1) class528_sub1_890_).aShort8306;
			for (int i_914_ = 0; i_914_ < ((Class528_Sub1) this).anInt8248; i_914_++) {
				int i_915_ = ((Class528_Sub1) this).anIntArray8250[i_914_] - i_888_;
				if (i_915_ >= i_908_ && i_915_ <= i_909_) {
					int i_916_ = ((Class528_Sub1) this).anIntArray8249[i_914_] - i;
					if (i_916_ >= i_910_ && i_916_ <= i_911_) {
						int i_917_ = (((Class528_Sub1) this).anIntArray8251[i_914_] - i_889_);
						if (i_917_ >= i_912_ && i_917_ <= i_913_) {
							int i_918_ = -1;
							int i_919_ = (((Class528_Sub1) this).anIntArray8290[i_914_]);
							int i_920_ = (((Class528_Sub1) this).anIntArray8290[i_914_ + 1]);
							for (int i_921_ = i_919_; i_921_ < i_920_; i_921_++) {
								i_918_ = (((Class528_Sub1) this).aShortArray8288[i_921_]) - 1;
								if (i_918_ == -1 || (((Class528_Sub1) this).aByteArray8264[i_918_]) != 0)
									break;
							}
							if (i_918_ != -1) {
								for (int i_922_ = 0; i_922_ < i_891_; i_922_++) {
									if (i_916_ == is[i_922_] && i_917_ == is_893_[i_922_] && i_915_ == is_892_[i_922_]) {
										int i_923_ = -1;
										i_919_ = is_906_[i_922_];
										i_920_ = is_906_[i_922_ + 1];
										for (int i_924_ = i_919_; i_924_ < i_920_; i_924_++) {
											i_923_ = is_907_[i_924_] - 1;
											if (i_923_ == -1 || is_897_[i_923_] != 0)
												break;
										}
										if (i_923_ != -1) {
											if (is_898_ == null) {
												((Class528_Sub1) this).aClass166_8259 = new Class166();
												is_898_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2038 = (Class512.method8761((((Class528_Sub1) this).aShortArray8255), 386966088));
												is_899_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2039 = (Class512.method8761((((Class528_Sub1) this).aShortArray8270), -249618007));
												is_900_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2041 = (Class512.method8761((((Class528_Sub1) this).aShortArray8261), -40836126));
												is_901_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aByteArray2040 = (AnimationSkeleton.method15090((((Class528_Sub1) this).aByteArray8264), -2143389284));
											}
											if (is_902_ == null) {
												Class166 class166 = (((Class528_Sub1) class528_sub1_890_).aClass166_8259 = new Class166());
												is_902_ = ((Class166) class166).aShortArray2038 = (Class512.method8761(is_894_, 1222177846));
												is_903_ = ((Class166) class166).aShortArray2039 = (Class512.method8761(is_895_, 22499234));
												is_904_ = ((Class166) class166).aShortArray2041 = (Class512.method8761(is_896_, -556022346));
												is_905_ = ((Class166) class166).aByteArray2040 = (AnimationSkeleton.method15090(is_897_, -2141733620));
											}
											short i_925_ = (((Class528_Sub1) this).aShortArray8255[i_918_]);
											short i_926_ = (((Class528_Sub1) this).aShortArray8270[i_918_]);
											short i_927_ = (((Class528_Sub1) this).aShortArray8261[i_918_]);
											byte i_928_ = (((Class528_Sub1) this).aByteArray8264[i_918_]);
											i_919_ = is_906_[i_922_];
											i_920_ = is_906_[i_922_ + 1];
											for (int i_929_ = i_919_; i_929_ < i_920_; i_929_++) {
												int i_930_ = is_907_[i_929_] - 1;
												if (i_930_ == -1)
													break;
												if (is_905_[i_930_] != 0) {
													is_902_[i_930_] += i_925_;
													is_903_[i_930_] += i_926_;
													is_904_[i_930_] += i_927_;
													is_905_[i_930_] += i_928_;
												}
											}
											i_925_ = is_894_[i_923_];
											i_926_ = is_895_[i_923_];
											i_927_ = is_896_[i_923_];
											i_928_ = is_897_[i_923_];
											i_919_ = (((Class528_Sub1) this).anIntArray8290[i_914_]);
											i_920_ = (((Class528_Sub1) this).anIntArray8290[i_914_ + 1]);
											for (int i_931_ = i_919_; i_931_ < i_920_; i_931_++) {
												int i_932_ = ((((Class528_Sub1) this).aShortArray8288[i_931_]) - 1);
												if (i_932_ == -1)
													break;
												if (is_901_[i_932_] != 0) {
													is_898_[i_932_] += i_925_;
													is_899_[i_932_] += i_926_;
													is_900_[i_932_] += i_927_;
													is_901_[i_932_] += i_928_;
												}
											}
											if ((((Class528_Sub1) this).aClass143_8274) == null && (((Class528_Sub1) this).aClass143_8273) != null)
												((Class143) (((Class528_Sub1) this).aClass143_8273)).anInterface14_1667 = null;
											if ((((Class528_Sub1) this).aClass143_8274) != null)
												((Class143) (((Class528_Sub1) this).aClass143_8274)).anInterface14_1667 = null;
											if ((((Class528_Sub1) class528_sub1_890_).aClass143_8274) == null && (((Class528_Sub1) class528_sub1_890_).aClass143_8273) != null)
												((Class143) (((Class528_Sub1) class528_sub1_890_).aClass143_8273)).anInterface14_1667 = null;
											if ((((Class528_Sub1) class528_sub1_890_).aClass143_8274) != null)
												((Class143) (((Class528_Sub1) class528_sub1_890_).aClass143_8274)).anInterface14_1667 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public MeshRasterizer method11277(byte i, int i_933_, boolean bool) {
		boolean bool_934_ = false;
		Class528_Sub1 class528_sub1_935_;
		Class528_Sub1 class528_sub1_936_;
		if (i > 0 && i <= 7) {
			class528_sub1_936_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8492[i - 1]);
			class528_sub1_935_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8479[i - 1]);
			bool_934_ = true;
		} else
			class528_sub1_935_ = class528_sub1_936_ = new Class528_Sub1(((Class528_Sub1) this).aClass505_Sub1_8239);
		return method13524(class528_sub1_935_, class528_sub1_936_, i_933_, bool_934_, bool);
	}

	public void bm(int i) {
		int i_937_ = Class382.anIntArray4657[i];
		int i_938_ = Class382.anIntArray4661[i];
		for (int i_939_ = 0; i_939_ < ((Class528_Sub1) this).anInt8248; i_939_++) {
			int i_940_ = ((((Class528_Sub1) this).anIntArray8250[i_939_] * i_938_ - ((Class528_Sub1) this).anIntArray8251[i_939_] * i_937_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_939_] = ((((Class528_Sub1) this).anIntArray8250[i_939_] * i_937_ + ((Class528_Sub1) this).anIntArray8251[i_939_] * i_938_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_939_] = i_940_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public MeshRasterizer method11296(byte i, int i_941_, boolean bool) {
		boolean bool_942_ = false;
		Class528_Sub1 class528_sub1_943_;
		Class528_Sub1 class528_sub1_944_;
		if (i > 0 && i <= 7) {
			class528_sub1_944_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8492[i - 1]);
			class528_sub1_943_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8479[i - 1]);
			bool_942_ = true;
		} else
			class528_sub1_943_ = class528_sub1_944_ = new Class528_Sub1(((Class528_Sub1) this).aClass505_Sub1_8239);
		return method13524(class528_sub1_943_, class528_sub1_944_, i_941_, bool_942_, bool);
	}

	public MeshRasterizer method11279(byte i, int i_945_, boolean bool) {
		boolean bool_946_ = false;
		Class528_Sub1 class528_sub1_947_;
		Class528_Sub1 class528_sub1_948_;
		if (i > 0 && i <= 7) {
			class528_sub1_948_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8492[i - 1]);
			class528_sub1_947_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8479[i - 1]);
			bool_946_ = true;
		} else
			class528_sub1_947_ = class528_sub1_948_ = new Class528_Sub1(((Class528_Sub1) this).aClass505_Sub1_8239);
		return method13524(class528_sub1_947_, class528_sub1_948_, i_945_, bool_946_, bool);
	}

	public int ca() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8283;
	}

	public int ae() {
		return ((Class528_Sub1) this).anInt8240;
	}

	boolean bv() {
		if (((Class528_Sub1) this).anIntArrayArray8263 == null)
			return false;
		for (int i = 0; i < ((Class528_Sub1) this).anInt8303; i++) {
			((Class528_Sub1) this).anIntArray8249[i] <<= 4;
			((Class528_Sub1) this).anIntArray8250[i] <<= 4;
			((Class528_Sub1) this).anIntArray8251[i] <<= 4;
		}
		anInt8271 = 0;
		anInt8247 = 0;
		anInt8232 = 0;
		return true;
	}

	public void method11295() {
		if (((Class528_Sub1) this).anInt8300 > 0 && ((Class528_Sub1) this).anInt8302 > 0) {
			method13537(false);
			if ((((Class528_Sub1) this).aByte8242 & 0x10) == 0 && (((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) == null)
				method13536(false);
			method13525();
		}
	}

	public boolean u() {
		return ((Class528_Sub1) this).aBool8246;
	}

	boolean method13539(int i, int i_949_, int i_950_, int i_951_, int i_952_, int i_953_, int i_954_, int i_955_) {
		if (i_949_ < i_950_ && i_949_ < i_951_ && i_949_ < i_952_)
			return false;
		if (i_949_ > i_950_ && i_949_ > i_951_ && i_949_ > i_952_)
			return false;
		if (i < i_953_ && i < i_954_ && i < i_955_)
			return false;
		if (i > i_953_ && i > i_954_ && i > i_955_)
			return false;
		return true;
	}

	public byte[] aw() {
		return ((Class528_Sub1) this).aByteArray8265;
	}

	public void bz(int i) {
		int i_956_ = Class382.anIntArray4657[i];
		int i_957_ = Class382.anIntArray4661[i];
		for (int i_958_ = 0; i_958_ < ((Class528_Sub1) this).anInt8248; i_958_++) {
			int i_959_ = ((((Class528_Sub1) this).anIntArray8251[i_958_] * i_956_ + ((Class528_Sub1) this).anIntArray8249[i_958_] * i_957_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_958_] = ((((Class528_Sub1) this).anIntArray8251[i_958_] * i_957_ - ((Class528_Sub1) this).anIntArray8249[i_958_] * i_956_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_958_] = i_959_;
		}
		for (int i_960_ = 0; i_960_ < ((Class528_Sub1) this).anInt8300; i_960_++) {
			int i_961_ = ((((Class528_Sub1) this).aShortArray8261[i_960_] * i_956_ + ((Class528_Sub1) this).aShortArray8255[i_960_] * i_957_) >> 14);
			((Class528_Sub1) this).aShortArray8261[i_960_] = (short) (((((Class528_Sub1) this).aShortArray8261[i_960_] * i_957_) - (((Class528_Sub1) this).aShortArray8255[i_960_] * i_956_)) >> 14);
			((Class528_Sub1) this).aShortArray8255[i_960_] = (short) i_961_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void bj(int i) {
		int i_962_ = Class382.anIntArray4657[i];
		int i_963_ = Class382.anIntArray4661[i];
		for (int i_964_ = 0; i_964_ < ((Class528_Sub1) this).anInt8248; i_964_++) {
			int i_965_ = ((((Class528_Sub1) this).anIntArray8251[i_964_] * i_962_ + ((Class528_Sub1) this).anIntArray8249[i_964_] * i_963_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_964_] = ((((Class528_Sub1) this).anIntArray8251[i_964_] * i_963_ - ((Class528_Sub1) this).anIntArray8249[i_964_] * i_962_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_964_] = i_965_;
		}
		for (int i_966_ = 0; i_966_ < ((Class528_Sub1) this).anInt8300; i_966_++) {
			int i_967_ = ((((Class528_Sub1) this).aShortArray8261[i_966_] * i_962_ + ((Class528_Sub1) this).aShortArray8255[i_966_] * i_963_) >> 14);
			((Class528_Sub1) this).aShortArray8261[i_966_] = (short) (((((Class528_Sub1) this).aShortArray8261[i_966_] * i_963_) - (((Class528_Sub1) this).aShortArray8255[i_966_] * i_962_)) >> 14);
			((Class528_Sub1) this).aShortArray8255[i_966_] = (short) i_967_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	void method13540(boolean bool) {
		boolean bool_968_ = (((Class528_Sub1) this).aClass143_8273 != null && (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) == null);
		boolean bool_969_ = (((Class528_Sub1) this).aClass143_8274 != null && (((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) == null);
		boolean bool_970_ = (((Class528_Sub1) this).aClass143_8272 != null && (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) == null);
		boolean bool_971_ = (((Class528_Sub1) this).aClass143_8275 != null && (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) == null);
		if (bool) {
			bool_968_ = bool_968_ & (((Class528_Sub1) this).aByte8242 & 0x2) != 0;
			bool_969_ = bool_969_ & (((Class528_Sub1) this).aByte8242 & 0x4) != 0;
			bool_970_ = bool_970_ & (((Class528_Sub1) this).aByte8242 & 0x1) != 0;
			bool_971_ = bool_971_ & (((Class528_Sub1) this).aByte8242 & 0x8) != 0;
		}
		byte i = 0;
		byte i_972_ = 0;
		byte i_973_ = 0;
		byte i_974_ = 0;
		byte i_975_ = 0;
		if (bool_970_) {
			i_972_ = i;
			i += 12;
		}
		if (bool_968_) {
			i_973_ = i;
			i += 4;
		}
		if (bool_969_) {
			i_974_ = i;
			i += 12;
		}
		if (bool_971_) {
			i_975_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8300 * i)
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8300 + 100) * i);
			else
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
			if (bool_970_) {
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_976_ = 0; i_976_ < ((Class528_Sub1) this).anInt8248; i_976_++) {
						int i_977_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_976_]);
						int i_978_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_976_]);
						int i_979_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_976_]);
						int i_980_ = ((Class528_Sub1) this).anIntArray8290[i_976_];
						int i_981_ = (((Class528_Sub1) this).anIntArray8290[i_976_ + 1]);
						for (int i_982_ = i_980_; i_982_ < i_981_; i_982_++) {
							int i_983_ = ((((Class528_Sub1) this).aShortArray8288[i_982_]) - 1);
							if (i_983_ == -1)
								break;
							class282_sub35_sub1.index = i_983_ * i * -1115476867;
							class282_sub35_sub1.writeInt(i_977_);
							class282_sub35_sub1.writeInt(i_978_);
							class282_sub35_sub1.writeInt(i_979_);
						}
					}
				} else {
					for (int i_984_ = 0; i_984_ < ((Class528_Sub1) this).anInt8248; i_984_++) {
						int i_985_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_984_]);
						int i_986_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_984_]);
						int i_987_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_984_]);
						int i_988_ = ((Class528_Sub1) this).anIntArray8290[i_984_];
						int i_989_ = (((Class528_Sub1) this).anIntArray8290[i_984_ + 1]);
						for (int i_990_ = i_988_; i_990_ < i_989_; i_990_++) {
							int i_991_ = (((((Class528_Sub1) this).aShortArray8288[i_990_]) & 0xffff) - 1);
							if (i_991_ == -1)
								break;
							class282_sub35_sub1.index = i_991_ * i * -1115476867;
							class282_sub35_sub1.method13232(i_985_, (byte) -95);
							class282_sub35_sub1.method13232(i_986_, (byte) -67);
							class282_sub35_sub1.method13232(i_987_, (byte) -68);
						}
					}
				}
			}
			if (bool_968_) {
				if (((Class528_Sub1) this).aClass143_8274 == null) {
					short[] is;
					short[] is_992_;
					short[] is_993_;
					byte[] is_994_;
					if (((Class528_Sub1) this).aClass166_8259 != null) {
						is = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2038;
						is_992_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2039;
						is_993_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2041;
						is_994_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aByteArray2040;
					} else {
						is = ((Class528_Sub1) this).aShortArray8255;
						is_992_ = ((Class528_Sub1) this).aShortArray8270;
						is_993_ = ((Class528_Sub1) this).aShortArray8261;
						is_994_ = ((Class528_Sub1) this).aByteArray8264;
					}
					float f = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArray8426[0]);
					float f_995_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[1]);
					float f_996_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[2]);
					float f_997_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8432);
					float f_998_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8433 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					float f_999_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8434 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					for (int i_1000_ = 0; i_1000_ < ((Class528_Sub1) this).anInt8262; i_1000_++) {
						int i_1001_ = method13531((((Class528_Sub1) this).aShortArray8260[i_1000_]), (((Class528_Sub1) this).aShortArray8269[i_1000_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_1000_]));
						float f_1002_ = ((float) (i_1001_ >>> 24) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8429));
						float f_1003_ = ((float) (i_1001_ >> 16 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8430));
						float f_1004_ = ((float) (i_1001_ >> 8 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8431));
						int i_1005_ = ((Class528_Sub1) this).aShortArray8266[i_1000_];
						short i_1006_ = (short) is_994_[i_1005_];
						float f_1007_;
						if (i_1006_ == 0)
							f_1007_ = ((f * (float) is[i_1005_] + f_995_ * (float) is_992_[i_1005_] + f_996_ * (float) is_993_[i_1005_]) * 0.0026041667F);
						else
							f_1007_ = ((f * (float) is[i_1005_] + f_995_ * (float) is_992_[i_1005_] + f_996_ * (float) is_993_[i_1005_]) / (float) (i_1006_ * 256));
						float f_1008_ = f_997_ + f_1007_ * (f_1007_ < 0.0F ? f_999_ : f_998_);
						int i_1009_ = (int) (f_1002_ * f_1008_);
						if (i_1009_ < 0)
							i_1009_ = 0;
						else if (i_1009_ > 255)
							i_1009_ = 255;
						int i_1010_ = (int) (f_1003_ * f_1008_);
						if (i_1010_ < 0)
							i_1010_ = 0;
						else if (i_1010_ > 255)
							i_1010_ = 255;
						int i_1011_ = (int) (f_1004_ * f_1008_);
						if (i_1011_ < 0)
							i_1011_ = 0;
						else if (i_1011_ > 255)
							i_1011_ = 255;
						class282_sub35_sub1.index = (i_973_ + i_1005_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1009_);
						class282_sub35_sub1.writeByte(i_1010_);
						class282_sub35_sub1.writeByte(i_1011_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1000_]) & 0xff)));
						i_1005_ = ((Class528_Sub1) this).aShortArray8267[i_1000_];
						i_1006_ = (short) is_994_[i_1005_];
						if (i_1006_ == 0)
							f_1007_ = ((f * (float) is[i_1005_] + f_995_ * (float) is_992_[i_1005_] + f_996_ * (float) is_993_[i_1005_]) * 0.0026041667F);
						else
							f_1007_ = ((f * (float) is[i_1005_] + f_995_ * (float) is_992_[i_1005_] + f_996_ * (float) is_993_[i_1005_]) / (float) (i_1006_ * 256));
						f_1008_ = f_997_ + f_1007_ * (f_1007_ < 0.0F ? f_999_ : f_998_);
						i_1009_ = (int) (f_1002_ * f_1008_);
						if (i_1009_ < 0)
							i_1009_ = 0;
						else if (i_1009_ > 255)
							i_1009_ = 255;
						i_1010_ = (int) (f_1003_ * f_1008_);
						if (i_1010_ < 0)
							i_1010_ = 0;
						else if (i_1010_ > 255)
							i_1010_ = 255;
						i_1011_ = (int) (f_1004_ * f_1008_);
						if (i_1011_ < 0)
							i_1011_ = 0;
						else if (i_1011_ > 255)
							i_1011_ = 255;
						class282_sub35_sub1.index = (i_973_ + i_1005_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1009_);
						class282_sub35_sub1.writeByte(i_1010_);
						class282_sub35_sub1.writeByte(i_1011_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1000_]) & 0xff)));
						i_1005_ = ((Class528_Sub1) this).aShortArray8256[i_1000_];
						i_1006_ = (short) is_994_[i_1005_];
						if (i_1006_ == 0)
							f_1007_ = ((f * (float) is[i_1005_] + f_995_ * (float) is_992_[i_1005_] + f_996_ * (float) is_993_[i_1005_]) * 0.0026041667F);
						else
							f_1007_ = ((f * (float) is[i_1005_] + f_995_ * (float) is_992_[i_1005_] + f_996_ * (float) is_993_[i_1005_]) / (float) (i_1006_ * 256));
						f_1008_ = f_997_ + f_1007_ * (f_1007_ < 0.0F ? f_999_ : f_998_);
						i_1009_ = (int) (f_1002_ * f_1008_);
						if (i_1009_ < 0)
							i_1009_ = 0;
						else if (i_1009_ > 255)
							i_1009_ = 255;
						i_1010_ = (int) (f_1003_ * f_1008_);
						if (i_1010_ < 0)
							i_1010_ = 0;
						else if (i_1010_ > 255)
							i_1010_ = 255;
						i_1011_ = (int) (f_1004_ * f_1008_);
						if (i_1011_ < 0)
							i_1011_ = 0;
						else if (i_1011_ > 255)
							i_1011_ = 255;
						class282_sub35_sub1.index = (i_973_ + i_1005_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1009_);
						class282_sub35_sub1.writeByte(i_1010_);
						class282_sub35_sub1.writeByte(i_1011_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1000_]) & 0xff)));
					}
				} else {
					for (int i_1012_ = 0; i_1012_ < ((Class528_Sub1) this).anInt8262; i_1012_++) {
						int i_1013_ = method13531((((Class528_Sub1) this).aShortArray8260[i_1012_]), (((Class528_Sub1) this).aShortArray8269[i_1012_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_1012_]));
						class282_sub35_sub1.index = (i_973_ + ((((Class528_Sub1) this).aShortArray8266[i_1012_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1013_);
						class282_sub35_sub1.index = (i_973_ + ((((Class528_Sub1) this).aShortArray8267[i_1012_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1013_);
						class282_sub35_sub1.index = (i_973_ + ((((Class528_Sub1) this).aShortArray8256[i_1012_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1013_);
					}
				}
			}
			if (bool_969_) {
				short[] is;
				short[] is_1014_;
				short[] is_1015_;
				byte[] is_1016_;
				if (((Class528_Sub1) this).aClass166_8259 != null) {
					is = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
					is_1014_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
					is_1015_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
					is_1016_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
				} else {
					is = ((Class528_Sub1) this).aShortArray8255;
					is_1014_ = ((Class528_Sub1) this).aShortArray8270;
					is_1015_ = ((Class528_Sub1) this).aShortArray8261;
					is_1016_ = ((Class528_Sub1) this).aByteArray8264;
				}
				float f = 3.0F / (float) ((Class528_Sub1) this).aShort8257;
				float f_1017_ = 3.0F / (float) (((Class528_Sub1) this).aShort8257 + ((Class528_Sub1) this).aShort8257 / 2);
				class282_sub35_sub1.index = i_974_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1018_ = 0; i_1018_ < ((Class528_Sub1) this).anInt8300; i_1018_++) {
						int i_1019_ = is_1016_[i_1018_] & 0xff;
						if (i_1019_ == 0) {
							class282_sub35_sub1.method14688((float) is[i_1018_] * f_1017_);
							class282_sub35_sub1.method14688((float) (is_1014_[i_1018_]) * f_1017_);
							class282_sub35_sub1.method14688((float) (is_1015_[i_1018_]) * f_1017_);
						} else {
							float f_1020_ = f / (float) i_1019_;
							class282_sub35_sub1.method14688((float) is[i_1018_] * f_1020_);
							class282_sub35_sub1.method14688((float) (is_1014_[i_1018_]) * f_1020_);
							class282_sub35_sub1.method14688((float) (is_1015_[i_1018_]) * f_1020_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				} else {
					for (int i_1021_ = 0; i_1021_ < ((Class528_Sub1) this).anInt8300; i_1021_++) {
						int i_1022_ = is_1016_[i_1021_] & 0xff;
						if (i_1022_ == 0) {
							class282_sub35_sub1.method14685((float) is[i_1021_] * f_1017_);
							class282_sub35_sub1.method14685((float) (is_1014_[i_1021_]) * f_1017_);
							class282_sub35_sub1.method14685((float) (is_1015_[i_1021_]) * f_1017_);
						} else {
							float f_1023_ = f / (float) i_1022_;
							class282_sub35_sub1.method14685((float) is[i_1021_] * f_1023_);
							class282_sub35_sub1.method14685((float) (is_1014_[i_1021_]) * f_1023_);
							class282_sub35_sub1.method14685((float) (is_1015_[i_1021_]) * f_1023_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				}
			}
			if (bool_971_) {
				class282_sub35_sub1.index = i_975_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1024_ = 0; i_1024_ < ((Class528_Sub1) this).anInt8300; i_1024_++) {
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8297[i_1024_]);
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8292[i_1024_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				} else {
					for (int i_1025_ = 0; i_1025_ < ((Class528_Sub1) this).anInt8300; i_1025_++) {
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8297[i_1025_]);
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8292[i_1025_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				}
			}
			class282_sub35_sub1.index = i * ((Class528_Sub1) this).anInt8300 * -1115476867;
			Interface14 interface14;
			if (bool) {
				if (((Class528_Sub1) this).anInterface14_8305 == null)
					((Class528_Sub1) this).anInterface14_8305 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface14_8305.method106(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				interface14 = ((Class528_Sub1) this).anInterface14_8305;
				((Class528_Sub1) this).aByte8242 = (byte) 0;
			} else {
				interface14 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
				((Class528_Sub1) this).aBool8279 = true;
			}
			if (bool_970_) {
				((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8272).aByte1669 = i_972_;
			}
			if (bool_971_) {
				((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8275).aByte1669 = i_975_;
			}
			if (bool_968_) {
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8273).aByte1669 = i_973_;
			}
			if (bool_969_) {
				((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8274).aByte1669 = i_974_;
			}
		}
	}

	void method13541() {
		if (((Class528_Sub1) this).aBool8279) {
			((Class528_Sub1) this).aBool8279 = false;
			if (((Class528_Sub1) this).aClass87Array8252 == null && ((Class528_Sub1) this).aClass172Array8244 == null && ((Class528_Sub1) this).aClass162Array8295 == null && !Class129.method2183(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				boolean bool = false;
				boolean bool_1026_ = false;
				boolean bool_1027_ = false;
				if (((Class528_Sub1) this).anIntArray8249 != null && !Class129.method2202(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (((Class528_Sub1) this).anIntArray8250 != null && !Class129.method2229(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool_1026_ = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (((Class528_Sub1) this).anIntArray8251 != null && !Class129.method2252(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool_1027_ = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (bool)
					((Class528_Sub1) this).anIntArray8249 = null;
				if (bool_1026_)
					((Class528_Sub1) this).anIntArray8250 = null;
				if (bool_1027_)
					((Class528_Sub1) this).anIntArray8251 = null;
			}
			if (((Class528_Sub1) this).aShortArray8288 != null && ((Class528_Sub1) this).anIntArray8249 == null && ((Class528_Sub1) this).anIntArray8250 == null && ((Class528_Sub1) this).anIntArray8251 == null) {
				((Class528_Sub1) this).aShortArray8288 = null;
				((Class528_Sub1) this).anIntArray8290 = null;
			}
			if (((Class528_Sub1) this).aByteArray8264 != null && !Class129.method2204(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8274 != null) {
					if ((((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) != null) {
						((Class528_Sub1) this).aShortArray8261 = null;
						((Class528_Sub1) this).aShortArray8270 = null;
						((Class528_Sub1) this).aShortArray8255 = null;
						((Class528_Sub1) this).aByteArray8264 = null;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				} else if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null) {
					((Class528_Sub1) this).aShortArray8261 = null;
					((Class528_Sub1) this).aShortArray8270 = null;
					((Class528_Sub1) this).aShortArray8255 = null;
					((Class528_Sub1) this).aByteArray8264 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8260 != null && !Class129.method2205(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aShortArray8260 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aByteArray8265 != null && !Class129.method2206(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aByteArray8265 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aFloatArray8297 != null && !Class129.method2241(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8275 == null || (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) != null) {
					((Class528_Sub1) this).aFloatArray8292 = null;
					((Class528_Sub1) this).aFloatArray8297 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8269 != null && !Class129.method2212(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aShortArray8269 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8266 != null && !Class129.method2211(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if ((((Class528_Sub1) this).aClass132_8276 == null || (((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) != null) && (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)) {
					((Class528_Sub1) this).aShortArray8256 = null;
					((Class528_Sub1) this).aShortArray8267 = null;
					((Class528_Sub1) this).aShortArray8266 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).anIntArrayArray8282 != null && !Class129.method2208(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				((Class528_Sub1) this).anIntArrayArray8282 = null;
				((Class528_Sub1) this).aShortArray8304 = null;
			}
			if (((Class528_Sub1) this).anIntArrayArray8263 != null && !Class129.method2226(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				((Class528_Sub1) this).anIntArrayArray8263 = null;
				((Class528_Sub1) this).aShortArray8253 = null;
			}
			if (((Class528_Sub1) this).anIntArrayArray8278 != null && !Class129.method2260(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241))
				((Class528_Sub1) this).anIntArrayArray8278 = null;
			if (((Class528_Sub1) this).anIntArray8289 != null && (((Class528_Sub1) this).anInt8240 & 0x800) == 0 && (((Class528_Sub1) this).anInt8240 & 0x40000) == 0)
				((Class528_Sub1) this).anIntArray8289 = null;
		}
	}

	public void bk(int i) {
		int i_1028_ = Class382.anIntArray4657[i];
		int i_1029_ = Class382.anIntArray4661[i];
		for (int i_1030_ = 0; i_1030_ < ((Class528_Sub1) this).anInt8248; i_1030_++) {
			int i_1031_ = ((((Class528_Sub1) this).anIntArray8250[i_1030_] * i_1029_ - ((Class528_Sub1) this).anIntArray8251[i_1030_] * i_1028_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_1030_] = ((((Class528_Sub1) this).anIntArray8250[i_1030_] * i_1028_ + ((Class528_Sub1) this).anIntArray8251[i_1030_] * i_1029_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_1030_] = i_1031_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void bf(int i) {
		int i_1032_ = Class382.anIntArray4657[i];
		int i_1033_ = Class382.anIntArray4661[i];
		for (int i_1034_ = 0; i_1034_ < ((Class528_Sub1) this).anInt8248; i_1034_++) {
			int i_1035_ = ((((Class528_Sub1) this).anIntArray8250[i_1034_] * i_1033_ - ((Class528_Sub1) this).anIntArray8251[i_1034_] * i_1032_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_1034_] = ((((Class528_Sub1) this).anIntArray8250[i_1034_] * i_1032_ + ((Class528_Sub1) this).anIntArray8251[i_1034_] * i_1033_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_1034_] = i_1035_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void bn(int i) {
		int i_1036_ = Class382.anIntArray4657[i];
		int i_1037_ = Class382.anIntArray4661[i];
		for (int i_1038_ = 0; i_1038_ < ((Class528_Sub1) this).anInt8248; i_1038_++) {
			int i_1039_ = ((((Class528_Sub1) this).anIntArray8250[i_1038_] * i_1037_ - ((Class528_Sub1) this).anIntArray8251[i_1038_] * i_1036_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_1038_] = ((((Class528_Sub1) this).anIntArray8250[i_1038_] * i_1036_ + ((Class528_Sub1) this).anIntArray8251[i_1038_] * i_1037_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_1038_] = i_1039_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void be() {
		for (int i = 0; i < ((Class528_Sub1) this).anInt8248; i++)
			((Class528_Sub1) this).anIntArray8251[i] = -((Class528_Sub1) this).anIntArray8251[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8300; i++)
			((Class528_Sub1) this).aShortArray8261[i] = (short) -((Class528_Sub1) this).aShortArray8261[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8262; i++) {
			short i_1040_ = ((Class528_Sub1) this).aShortArray8266[i];
			((Class528_Sub1) this).aShortArray8266[i] = ((Class528_Sub1) this).aShortArray8256[i];
			((Class528_Sub1) this).aShortArray8256[i] = i_1040_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass132_8276 != null)
			((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public boolean successful() {
		if (((Class528_Sub1) this).aShortArray8269 == null)
			return true;
		for (int i = 0; i < ((Class528_Sub1) this).aShortArray8269.length; i++) {
			if (((Class528_Sub1) this).aShortArray8269[i] != -1 && !(((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834.method139(((Class528_Sub1) this).aShortArray8269[i], -1537294900)))
				return false;
		}
		return true;
	}

	public void bq() {
		for (int i = 0; i < ((Class528_Sub1) this).anInt8248; i++)
			((Class528_Sub1) this).anIntArray8251[i] = -((Class528_Sub1) this).anIntArray8251[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8300; i++)
			((Class528_Sub1) this).aShortArray8261[i] = (short) -((Class528_Sub1) this).aShortArray8261[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8262; i++) {
			short i_1041_ = ((Class528_Sub1) this).aShortArray8266[i];
			((Class528_Sub1) this).aShortArray8266[i] = ((Class528_Sub1) this).aShortArray8256[i];
			((Class528_Sub1) this).aShortArray8256[i] = i_1041_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass132_8276 != null)
			((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void dk(int i, int i_1042_, int i_1043_) {
		for (int i_1044_ = 0; i_1044_ < ((Class528_Sub1) this).anInt8248; i_1044_++) {
			if (i != 0)
				((Class528_Sub1) this).anIntArray8249[i_1044_] += i;
			if (i_1042_ != 0)
				((Class528_Sub1) this).anIntArray8250[i_1044_] += i_1042_;
			if (i_1043_ != 0)
				((Class528_Sub1) this).anIntArray8251[i_1044_] += i_1043_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	void method11288() {
		/* empty */
	}

	short method13542(RSMesh class157, int i, long l, int i_1045_, int i_1046_, int i_1047_, int i_1048_, float f, float f_1049_) {
		int i_1050_ = ((Class528_Sub1) this).anIntArray8290[i];
		int i_1051_ = ((Class528_Sub1) this).anIntArray8290[i + 1];
		int i_1052_ = 0;
		for (int i_1053_ = i_1050_; i_1053_ < i_1051_; i_1053_++) {
			short i_1054_ = ((Class528_Sub1) this).aShortArray8288[i_1053_];
			if (i_1054_ == 0) {
				i_1052_ = i_1053_;
				break;
			}
			if (aLongArray8298[i_1053_] == l)
				return (short) (i_1054_ - 1);
		}
		((Class528_Sub1) this).aShortArray8288[i_1052_] = (short) (((Class528_Sub1) this).anInt8300 + 1);
		aLongArray8298[i_1052_] = l;
		((Class528_Sub1) this).aShortArray8255[(((Class528_Sub1) this).anInt8300)] = (short) i_1045_;
		((Class528_Sub1) this).aShortArray8270[(((Class528_Sub1) this).anInt8300)] = (short) i_1046_;
		((Class528_Sub1) this).aShortArray8261[(((Class528_Sub1) this).anInt8300)] = (short) i_1047_;
		((Class528_Sub1) this).aByteArray8264[((Class528_Sub1) this).anInt8300] = (byte) i_1048_;
		((Class528_Sub1) this).aFloatArray8297[(((Class528_Sub1) this).anInt8300)] = f;
		((Class528_Sub1) this).aFloatArray8292[(((Class528_Sub1) this).anInt8300)] = f_1049_;
		return (short) ((Class528_Sub1) this).anInt8300++;
	}

	boolean bh() {
		if (((Class528_Sub1) this).anIntArrayArray8263 == null)
			return false;
		for (int i = 0; i < ((Class528_Sub1) this).anInt8303; i++) {
			((Class528_Sub1) this).anIntArray8249[i] <<= 4;
			((Class528_Sub1) this).anIntArray8250[i] <<= 4;
			((Class528_Sub1) this).anIntArray8251[i] <<= 4;
		}
		anInt8271 = 0;
		anInt8247 = 0;
		anInt8232 = 0;
		return true;
	}

	public Class87[] method11300() {
		return ((Class528_Sub1) this).aClass87Array8252;
	}

	void bp() {
		for (int i = 0; i < ((Class528_Sub1) this).anInt8303; i++) {
			((Class528_Sub1) this).anIntArray8249[i] = ((Class528_Sub1) this).anIntArray8249[i] + 7 >> 4;
			((Class528_Sub1) this).anIntArray8250[i] = ((Class528_Sub1) this).anIntArray8250[i] + 7 >> 4;
			((Class528_Sub1) this).anIntArray8251[i] = ((Class528_Sub1) this).anIntArray8251[i] + 7 >> 4;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void ia(int i, int i_1055_, int i_1056_) {
		for (int i_1057_ = 0; i_1057_ < ((Class528_Sub1) this).anInt8248; i_1057_++) {
			if (i != 0)
				((Class528_Sub1) this).anIntArray8249[i_1057_] += i;
			if (i_1055_ != 0)
				((Class528_Sub1) this).anIntArray8250[i_1057_] += i_1055_;
			if (i_1056_ != 0)
				((Class528_Sub1) this).anIntArray8251[i_1057_] += i_1056_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	void bl(int i, int[] is, int i_1058_, int i_1059_, int i_1060_, boolean bool, int i_1061_, int[] is_1062_) {
		int i_1063_ = is.length;
		if (i == 0) {
			i_1058_ <<= 4;
			i_1059_ <<= 4;
			i_1060_ <<= 4;
			int i_1064_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_1065_ = 0; i_1065_ < i_1063_; i_1065_++) {
				int i_1066_ = is[i_1065_];
				if (i_1066_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_1067_ = ((Class528_Sub1) this).anIntArrayArray8263[i_1066_];
					for (int i_1068_ = 0; i_1068_ < is_1067_.length; i_1068_++) {
						int i_1069_ = is_1067_[i_1068_];
						if (((Class528_Sub1) this).aShortArray8253 == null || (i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1069_])) != 0) {
							anInt8271 += (((Class528_Sub1) this).anIntArray8249[i_1069_]);
							anInt8247 += (((Class528_Sub1) this).anIntArray8250[i_1069_]);
							anInt8232 += (((Class528_Sub1) this).anIntArray8251[i_1069_]);
							i_1064_++;
						}
					}
				}
			}
			if (i_1064_ > 0) {
				anInt8271 = anInt8271 / i_1064_ + i_1058_;
				anInt8247 = anInt8247 / i_1064_ + i_1059_;
				anInt8232 = anInt8232 / i_1064_ + i_1060_;
				aBool8233 = true;
			} else {
				anInt8271 = i_1058_;
				anInt8247 = i_1059_;
				anInt8232 = i_1060_;
			}
		} else if (i == 1) {
			if (is_1062_ != null) {
				int i_1070_ = ((is_1062_[0] * i_1058_ + is_1062_[1] * i_1059_ + is_1062_[2] * i_1060_ + 8192) >> 14);
				int i_1071_ = ((is_1062_[3] * i_1058_ + is_1062_[4] * i_1059_ + is_1062_[5] * i_1060_ + 8192) >> 14);
				int i_1072_ = ((is_1062_[6] * i_1058_ + is_1062_[7] * i_1059_ + is_1062_[8] * i_1060_ + 8192) >> 14);
				i_1058_ = i_1070_;
				i_1059_ = i_1071_;
				i_1060_ = i_1072_;
			}
			i_1058_ <<= 4;
			i_1059_ <<= 4;
			i_1060_ <<= 4;
			for (int i_1073_ = 0; i_1073_ < i_1063_; i_1073_++) {
				int i_1074_ = is[i_1073_];
				if (i_1074_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
					int[] is_1075_ = ((Class528_Sub1) this).anIntArrayArray8263[i_1074_];
					for (int i_1076_ = 0; i_1076_ < is_1075_.length; i_1076_++) {
						int i_1077_ = is_1075_[i_1076_];
						if (((Class528_Sub1) this).aShortArray8253 == null || (i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1077_])) != 0) {
							((Class528_Sub1) this).anIntArray8249[i_1077_] += i_1058_;
							((Class528_Sub1) this).anIntArray8250[i_1077_] += i_1059_;
							((Class528_Sub1) this).anIntArray8251[i_1077_] += i_1060_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1062_ != null) {
				int i_1078_ = is_1062_[9] << 4;
				int i_1079_ = is_1062_[10] << 4;
				int i_1080_ = is_1062_[11] << 4;
				int i_1081_ = is_1062_[12] << 4;
				int i_1082_ = is_1062_[13] << 4;
				int i_1083_ = is_1062_[14] << 4;
				if (aBool8233) {
					int i_1084_ = ((is_1062_[0] * anInt8271 + is_1062_[3] * anInt8247 + is_1062_[6] * anInt8232 + 8192) >> 14);
					int i_1085_ = ((is_1062_[1] * anInt8271 + is_1062_[4] * anInt8247 + is_1062_[7] * anInt8232 + 8192) >> 14);
					int i_1086_ = ((is_1062_[2] * anInt8271 + is_1062_[5] * anInt8247 + is_1062_[8] * anInt8232 + 8192) >> 14);
					i_1084_ += i_1081_;
					i_1085_ += i_1082_;
					i_1086_ += i_1083_;
					anInt8271 = i_1084_;
					anInt8247 = i_1085_;
					anInt8232 = i_1086_;
					aBool8233 = false;
				}
				int[] is_1087_ = new int[9];
				int i_1088_ = Class382.anIntArray4661[i_1058_];
				int i_1089_ = Class382.anIntArray4657[i_1058_];
				int i_1090_ = Class382.anIntArray4661[i_1059_];
				int i_1091_ = Class382.anIntArray4657[i_1059_];
				int i_1092_ = Class382.anIntArray4661[i_1060_];
				int i_1093_ = Class382.anIntArray4657[i_1060_];
				int i_1094_ = i_1089_ * i_1092_ + 8192 >> 14;
				int i_1095_ = i_1089_ * i_1093_ + 8192 >> 14;
				is_1087_[0] = i_1090_ * i_1092_ + i_1091_ * i_1095_ + 8192 >> 14;
				is_1087_[1] = -i_1090_ * i_1093_ + i_1091_ * i_1094_ + 8192 >> 14;
				is_1087_[2] = i_1091_ * i_1088_ + 8192 >> 14;
				is_1087_[3] = i_1088_ * i_1093_ + 8192 >> 14;
				is_1087_[4] = i_1088_ * i_1092_ + 8192 >> 14;
				is_1087_[5] = -i_1089_;
				is_1087_[6] = -i_1091_ * i_1092_ + i_1090_ * i_1095_ + 8192 >> 14;
				is_1087_[7] = i_1091_ * i_1093_ + i_1090_ * i_1094_ + 8192 >> 14;
				is_1087_[8] = i_1090_ * i_1088_ + 8192 >> 14;
				int i_1096_ = ((is_1087_[0] * -anInt8271 + is_1087_[1] * -anInt8247 + is_1087_[2] * -anInt8232 + 8192) >> 14);
				int i_1097_ = ((is_1087_[3] * -anInt8271 + is_1087_[4] * -anInt8247 + is_1087_[5] * -anInt8232 + 8192) >> 14);
				int i_1098_ = ((is_1087_[6] * -anInt8271 + is_1087_[7] * -anInt8247 + is_1087_[8] * -anInt8232 + 8192) >> 14);
				int i_1099_ = i_1096_ + anInt8271;
				int i_1100_ = i_1097_ + anInt8247;
				int i_1101_ = i_1098_ + anInt8232;
				int[] is_1102_ = new int[9];
				for (int i_1103_ = 0; i_1103_ < 3; i_1103_++) {
					for (int i_1104_ = 0; i_1104_ < 3; i_1104_++) {
						int i_1105_ = 0;
						for (int i_1106_ = 0; i_1106_ < 3; i_1106_++)
							i_1105_ += (is_1087_[i_1103_ * 3 + i_1106_] * is_1062_[i_1104_ * 3 + i_1106_]);
						is_1102_[i_1103_ * 3 + i_1104_] = i_1105_ + 8192 >> 14;
					}
				}
				int i_1107_ = ((is_1087_[0] * i_1081_ + is_1087_[1] * i_1082_ + is_1087_[2] * i_1083_ + 8192) >> 14);
				int i_1108_ = ((is_1087_[3] * i_1081_ + is_1087_[4] * i_1082_ + is_1087_[5] * i_1083_ + 8192) >> 14);
				int i_1109_ = ((is_1087_[6] * i_1081_ + is_1087_[7] * i_1082_ + is_1087_[8] * i_1083_ + 8192) >> 14);
				i_1107_ += i_1099_;
				i_1108_ += i_1100_;
				i_1109_ += i_1101_;
				int[] is_1110_ = new int[9];
				for (int i_1111_ = 0; i_1111_ < 3; i_1111_++) {
					for (int i_1112_ = 0; i_1112_ < 3; i_1112_++) {
						int i_1113_ = 0;
						for (int i_1114_ = 0; i_1114_ < 3; i_1114_++)
							i_1113_ += (is_1062_[i_1111_ * 3 + i_1114_] * is_1102_[i_1112_ + i_1114_ * 3]);
						is_1110_[i_1111_ * 3 + i_1112_] = i_1113_ + 8192 >> 14;
					}
				}
				int i_1115_ = ((is_1062_[0] * i_1107_ + is_1062_[1] * i_1108_ + is_1062_[2] * i_1109_ + 8192) >> 14);
				int i_1116_ = ((is_1062_[3] * i_1107_ + is_1062_[4] * i_1108_ + is_1062_[5] * i_1109_ + 8192) >> 14);
				int i_1117_ = ((is_1062_[6] * i_1107_ + is_1062_[7] * i_1108_ + is_1062_[8] * i_1109_ + 8192) >> 14);
				i_1115_ += i_1078_;
				i_1116_ += i_1079_;
				i_1117_ += i_1080_;
				for (int i_1118_ = 0; i_1118_ < i_1063_; i_1118_++) {
					int i_1119_ = is[i_1118_];
					if (i_1119_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_1120_ = (((Class528_Sub1) this).anIntArrayArray8263[i_1119_]);
						for (int i_1121_ = 0; i_1121_ < is_1120_.length; i_1121_++) {
							int i_1122_ = is_1120_[i_1121_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1122_])) != 0)) {
								int i_1123_ = (is_1110_[0] * (((Class528_Sub1) this).anIntArray8249[i_1122_]) + is_1110_[1] * (((Class528_Sub1) this).anIntArray8250[i_1122_]) + is_1110_[2] * (((Class528_Sub1) this).anIntArray8251[i_1122_]) + 8192) >> 14;
								int i_1124_ = (is_1110_[3] * (((Class528_Sub1) this).anIntArray8249[i_1122_]) + is_1110_[4] * (((Class528_Sub1) this).anIntArray8250[i_1122_]) + is_1110_[5] * (((Class528_Sub1) this).anIntArray8251[i_1122_]) + 8192) >> 14;
								int i_1125_ = (is_1110_[6] * (((Class528_Sub1) this).anIntArray8249[i_1122_]) + is_1110_[7] * (((Class528_Sub1) this).anIntArray8250[i_1122_]) + is_1110_[8] * (((Class528_Sub1) this).anIntArray8251[i_1122_]) + 8192) >> 14;
								i_1123_ += i_1115_;
								i_1124_ += i_1116_;
								i_1125_ += i_1117_;
								((Class528_Sub1) this).anIntArray8249[i_1122_] = i_1123_;
								((Class528_Sub1) this).anIntArray8250[i_1122_] = i_1124_;
								((Class528_Sub1) this).anIntArray8251[i_1122_] = i_1125_;
							}
						}
					}
				}
			} else {
				for (int i_1126_ = 0; i_1126_ < i_1063_; i_1126_++) {
					int i_1127_ = is[i_1126_];
					if (i_1127_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_1128_ = (((Class528_Sub1) this).anIntArrayArray8263[i_1127_]);
						for (int i_1129_ = 0; i_1129_ < is_1128_.length; i_1129_++) {
							int i_1130_ = is_1128_[i_1129_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1130_])) != 0)) {
								((Class528_Sub1) this).anIntArray8249[i_1130_] -= anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_1130_] -= anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_1130_] -= anInt8232;
								if (i_1060_ != 0) {
									int i_1131_ = Class382.anIntArray4657[i_1060_];
									int i_1132_ = Class382.anIntArray4661[i_1060_];
									int i_1133_ = ((((Class528_Sub1) this).anIntArray8250[i_1130_]) * i_1131_ + ((((Class528_Sub1) this).anIntArray8249[i_1130_]) * i_1132_) + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8250[i_1130_] = ((((Class528_Sub1) this).anIntArray8250[i_1130_]) * i_1132_ - ((((Class528_Sub1) this).anIntArray8249[i_1130_]) * i_1131_) + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8249[i_1130_] = i_1133_;
								}
								if (i_1058_ != 0) {
									int i_1134_ = Class382.anIntArray4657[i_1058_];
									int i_1135_ = Class382.anIntArray4661[i_1058_];
									int i_1136_ = ((((Class528_Sub1) this).anIntArray8250[i_1130_]) * i_1135_ - ((((Class528_Sub1) this).anIntArray8251[i_1130_]) * i_1134_) + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8251[i_1130_] = ((((Class528_Sub1) this).anIntArray8250[i_1130_]) * i_1134_ + ((((Class528_Sub1) this).anIntArray8251[i_1130_]) * i_1135_) + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8250[i_1130_] = i_1136_;
								}
								if (i_1059_ != 0) {
									int i_1137_ = Class382.anIntArray4657[i_1059_];
									int i_1138_ = Class382.anIntArray4661[i_1059_];
									int i_1139_ = ((((Class528_Sub1) this).anIntArray8251[i_1130_]) * i_1137_ + ((((Class528_Sub1) this).anIntArray8249[i_1130_]) * i_1138_) + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8251[i_1130_] = ((((Class528_Sub1) this).anIntArray8251[i_1130_]) * i_1138_ - ((((Class528_Sub1) this).anIntArray8249[i_1130_]) * i_1137_) + 16383) >> 14;
									((Class528_Sub1) this).anIntArray8249[i_1130_] = i_1139_;
								}
								((Class528_Sub1) this).anIntArray8249[i_1130_] += anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_1130_] += anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_1130_] += anInt8232;
							}
						}
					}
				}
				if (bool) {
					for (int i_1140_ = 0; i_1140_ < i_1063_; i_1140_++) {
						int i_1141_ = is[i_1140_];
						if (i_1141_ < (((Class528_Sub1) this).anIntArrayArray8263).length) {
							int[] is_1142_ = (((Class528_Sub1) this).anIntArrayArray8263[i_1141_]);
							for (int i_1143_ = 0; i_1143_ < is_1142_.length; i_1143_++) {
								int i_1144_ = is_1142_[i_1143_];
								if ((((Class528_Sub1) this).aShortArray8253 == null) || ((i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1144_])) != 0)) {
									int i_1145_ = (((Class528_Sub1) this).anIntArray8290[i_1144_]);
									int i_1146_ = (((Class528_Sub1) this).anIntArray8290[i_1144_ + 1]);
									for (int i_1147_ = i_1145_; i_1147_ < i_1146_; i_1147_++) {
										int i_1148_ = ((((Class528_Sub1) this).aShortArray8288[i_1147_]) - 1);
										if (i_1148_ == -1)
											break;
										if (i_1060_ != 0) {
											int i_1149_ = (Class382.anIntArray4657[i_1060_]);
											int i_1150_ = (Class382.anIntArray4661[i_1060_]);
											int i_1151_ = (((((Class528_Sub1) this).aShortArray8270[i_1148_]) * i_1149_ + (((Class528_Sub1) this).aShortArray8255[i_1148_]) * i_1150_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8270[i_1148_] = (short) ((((((Class528_Sub1) this).aShortArray8270[i_1148_]) * i_1150_) - ((((Class528_Sub1) this).aShortArray8255[i_1148_]) * i_1149_) + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8255[i_1148_] = (short) i_1151_;
										}
										if (i_1058_ != 0) {
											int i_1152_ = (Class382.anIntArray4657[i_1058_]);
											int i_1153_ = (Class382.anIntArray4661[i_1058_]);
											int i_1154_ = (((((Class528_Sub1) this).aShortArray8270[i_1148_]) * i_1153_ - (((Class528_Sub1) this).aShortArray8261[i_1148_]) * i_1152_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8261[i_1148_] = (short) ((((((Class528_Sub1) this).aShortArray8270[i_1148_]) * i_1152_) + ((((Class528_Sub1) this).aShortArray8261[i_1148_]) * i_1153_) + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8270[i_1148_] = (short) i_1154_;
										}
										if (i_1059_ != 0) {
											int i_1155_ = (Class382.anIntArray4657[i_1059_]);
											int i_1156_ = (Class382.anIntArray4661[i_1059_]);
											int i_1157_ = (((((Class528_Sub1) this).aShortArray8261[i_1148_]) * i_1155_ + (((Class528_Sub1) this).aShortArray8255[i_1148_]) * i_1156_ + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8261[i_1148_] = (short) ((((((Class528_Sub1) this).aShortArray8261[i_1148_]) * i_1156_) - ((((Class528_Sub1) this).aShortArray8255[i_1148_]) * i_1155_) + 16383) >> 14);
											((Class528_Sub1) this).aShortArray8255[i_1148_] = (short) i_1157_;
										}
									}
								}
							}
						}
					}
					if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
						((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
					if (((Class528_Sub1) this).aClass143_8274 != null)
						((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
				}
			}
		} else if (i == 3) {
			if (is_1062_ != null) {
				int i_1158_ = is_1062_[9] << 4;
				int i_1159_ = is_1062_[10] << 4;
				int i_1160_ = is_1062_[11] << 4;
				int i_1161_ = is_1062_[12] << 4;
				int i_1162_ = is_1062_[13] << 4;
				int i_1163_ = is_1062_[14] << 4;
				if (aBool8233) {
					int i_1164_ = ((is_1062_[0] * anInt8271 + is_1062_[3] * anInt8247 + is_1062_[6] * anInt8232 + 8192) >> 14);
					int i_1165_ = ((is_1062_[1] * anInt8271 + is_1062_[4] * anInt8247 + is_1062_[7] * anInt8232 + 8192) >> 14);
					int i_1166_ = ((is_1062_[2] * anInt8271 + is_1062_[5] * anInt8247 + is_1062_[8] * anInt8232 + 8192) >> 14);
					i_1164_ += i_1161_;
					i_1165_ += i_1162_;
					i_1166_ += i_1163_;
					anInt8271 = i_1164_;
					anInt8247 = i_1165_;
					anInt8232 = i_1166_;
					aBool8233 = false;
				}
				int i_1167_ = i_1058_ << 15 >> 7;
				int i_1168_ = i_1059_ << 15 >> 7;
				int i_1169_ = i_1060_ << 15 >> 7;
				int i_1170_ = i_1167_ * -anInt8271 + 8192 >> 14;
				int i_1171_ = i_1168_ * -anInt8247 + 8192 >> 14;
				int i_1172_ = i_1169_ * -anInt8232 + 8192 >> 14;
				int i_1173_ = i_1170_ + anInt8271;
				int i_1174_ = i_1171_ + anInt8247;
				int i_1175_ = i_1172_ + anInt8232;
				int[] is_1176_ = new int[9];
				is_1176_[0] = i_1167_ * is_1062_[0] + 8192 >> 14;
				is_1176_[1] = i_1167_ * is_1062_[3] + 8192 >> 14;
				is_1176_[2] = i_1167_ * is_1062_[6] + 8192 >> 14;
				is_1176_[3] = i_1168_ * is_1062_[1] + 8192 >> 14;
				is_1176_[4] = i_1168_ * is_1062_[4] + 8192 >> 14;
				is_1176_[5] = i_1168_ * is_1062_[7] + 8192 >> 14;
				is_1176_[6] = i_1169_ * is_1062_[2] + 8192 >> 14;
				is_1176_[7] = i_1169_ * is_1062_[5] + 8192 >> 14;
				is_1176_[8] = i_1169_ * is_1062_[8] + 8192 >> 14;
				int i_1177_ = i_1167_ * i_1161_ + 8192 >> 14;
				int i_1178_ = i_1168_ * i_1162_ + 8192 >> 14;
				int i_1179_ = i_1169_ * i_1163_ + 8192 >> 14;
				i_1177_ += i_1173_;
				i_1178_ += i_1174_;
				i_1179_ += i_1175_;
				int[] is_1180_ = new int[9];
				for (int i_1181_ = 0; i_1181_ < 3; i_1181_++) {
					for (int i_1182_ = 0; i_1182_ < 3; i_1182_++) {
						int i_1183_ = 0;
						for (int i_1184_ = 0; i_1184_ < 3; i_1184_++)
							i_1183_ += (is_1062_[i_1181_ * 3 + i_1184_] * is_1176_[i_1182_ + i_1184_ * 3]);
						is_1180_[i_1181_ * 3 + i_1182_] = i_1183_ + 8192 >> 14;
					}
				}
				int i_1185_ = ((is_1062_[0] * i_1177_ + is_1062_[1] * i_1178_ + is_1062_[2] * i_1179_ + 8192) >> 14);
				int i_1186_ = ((is_1062_[3] * i_1177_ + is_1062_[4] * i_1178_ + is_1062_[5] * i_1179_ + 8192) >> 14);
				int i_1187_ = ((is_1062_[6] * i_1177_ + is_1062_[7] * i_1178_ + is_1062_[8] * i_1179_ + 8192) >> 14);
				i_1185_ += i_1158_;
				i_1186_ += i_1159_;
				i_1187_ += i_1160_;
				for (int i_1188_ = 0; i_1188_ < i_1063_; i_1188_++) {
					int i_1189_ = is[i_1188_];
					if (i_1189_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_1190_ = (((Class528_Sub1) this).anIntArrayArray8263[i_1189_]);
						for (int i_1191_ = 0; i_1191_ < is_1190_.length; i_1191_++) {
							int i_1192_ = is_1190_[i_1191_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1192_])) != 0)) {
								int i_1193_ = (is_1180_[0] * (((Class528_Sub1) this).anIntArray8249[i_1192_]) + is_1180_[1] * (((Class528_Sub1) this).anIntArray8250[i_1192_]) + is_1180_[2] * (((Class528_Sub1) this).anIntArray8251[i_1192_]) + 8192) >> 14;
								int i_1194_ = (is_1180_[3] * (((Class528_Sub1) this).anIntArray8249[i_1192_]) + is_1180_[4] * (((Class528_Sub1) this).anIntArray8250[i_1192_]) + is_1180_[5] * (((Class528_Sub1) this).anIntArray8251[i_1192_]) + 8192) >> 14;
								int i_1195_ = (is_1180_[6] * (((Class528_Sub1) this).anIntArray8249[i_1192_]) + is_1180_[7] * (((Class528_Sub1) this).anIntArray8250[i_1192_]) + is_1180_[8] * (((Class528_Sub1) this).anIntArray8251[i_1192_]) + 8192) >> 14;
								i_1193_ += i_1185_;
								i_1194_ += i_1186_;
								i_1195_ += i_1187_;
								((Class528_Sub1) this).anIntArray8249[i_1192_] = i_1193_;
								((Class528_Sub1) this).anIntArray8250[i_1192_] = i_1194_;
								((Class528_Sub1) this).anIntArray8251[i_1192_] = i_1195_;
							}
						}
					}
				}
			} else {
				for (int i_1196_ = 0; i_1196_ < i_1063_; i_1196_++) {
					int i_1197_ = is[i_1196_];
					if (i_1197_ < ((Class528_Sub1) this).anIntArrayArray8263.length) {
						int[] is_1198_ = (((Class528_Sub1) this).anIntArrayArray8263[i_1197_]);
						for (int i_1199_ = 0; i_1199_ < is_1198_.length; i_1199_++) {
							int i_1200_ = is_1198_[i_1199_];
							if (((Class528_Sub1) this).aShortArray8253 == null || ((i_1061_ & (((Class528_Sub1) this).aShortArray8253[i_1200_])) != 0)) {
								((Class528_Sub1) this).anIntArray8249[i_1200_] -= anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_1200_] -= anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_1200_] -= anInt8232;
								((Class528_Sub1) this).anIntArray8249[i_1200_] = (((Class528_Sub1) this).anIntArray8249[i_1200_]) * i_1058_ >> 7;
								((Class528_Sub1) this).anIntArray8250[i_1200_] = (((Class528_Sub1) this).anIntArray8250[i_1200_]) * i_1059_ >> 7;
								((Class528_Sub1) this).anIntArray8251[i_1200_] = (((Class528_Sub1) this).anIntArray8251[i_1200_]) * i_1060_ >> 7;
								((Class528_Sub1) this).anIntArray8249[i_1200_] += anInt8271;
								((Class528_Sub1) this).anIntArray8250[i_1200_] += anInt8247;
								((Class528_Sub1) this).anIntArray8251[i_1200_] += anInt8232;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_1201_ = 0; i_1201_ < i_1063_; i_1201_++) {
					int i_1202_ = is[i_1201_];
					if (i_1202_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_1203_ = (((Class528_Sub1) this).anIntArrayArray8282[i_1202_]);
						for (int i_1204_ = 0; i_1204_ < is_1203_.length; i_1204_++) {
							int i_1205_ = is_1203_[i_1204_];
							if (((Class528_Sub1) this).aShortArray8304 == null || ((i_1061_ & (((Class528_Sub1) this).aShortArray8304[i_1205_])) != 0)) {
								int i_1206_ = (((((Class528_Sub1) this).aByteArray8265[i_1205_]) & 0xff) + i_1058_ * 8);
								if (i_1206_ < 0)
									i_1206_ = 0;
								else if (i_1206_ > 255)
									i_1206_ = 255;
								((Class528_Sub1) this).aByteArray8265[i_1205_] = (byte) i_1206_;
								if (((Class528_Sub1) this).aClass143_8273 != null)
									((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
							}
						}
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_1207_ = 0; i_1207_ < ((Class528_Sub1) this).anInt8294; i_1207_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_1207_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_1207_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub1) this).anIntArrayArray8282 != null) {
				for (int i_1208_ = 0; i_1208_ < i_1063_; i_1208_++) {
					int i_1209_ = is[i_1208_];
					if (i_1209_ < ((Class528_Sub1) this).anIntArrayArray8282.length) {
						int[] is_1210_ = (((Class528_Sub1) this).anIntArrayArray8282[i_1209_]);
						for (int i_1211_ = 0; i_1211_ < is_1210_.length; i_1211_++) {
							int i_1212_ = is_1210_[i_1211_];
							if (((Class528_Sub1) this).aShortArray8304 == null || ((i_1061_ & (((Class528_Sub1) this).aShortArray8304[i_1212_])) != 0)) {
								int i_1213_ = ((((Class528_Sub1) this).aShortArray8260[i_1212_]) & 0xffff);
								int i_1214_ = i_1213_ >> 10 & 0x3f;
								int i_1215_ = i_1213_ >> 7 & 0x7;
								int i_1216_ = i_1213_ & 0x7f;
								i_1214_ = i_1214_ + i_1058_ & 0x3f;
								i_1215_ += i_1059_ / 4;
								if (i_1215_ < 0)
									i_1215_ = 0;
								else if (i_1215_ > 7)
									i_1215_ = 7;
								i_1216_ += i_1060_;
								if (i_1216_ < 0)
									i_1216_ = 0;
								else if (i_1216_ > 127)
									i_1216_ = 127;
								((Class528_Sub1) this).aShortArray8260[i_1212_] = (short) (i_1214_ << 10 | i_1215_ << 7 | i_1216_);
								if (((Class528_Sub1) this).aClass143_8273 != null)
									((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
							}
						}
					}
				}
				if (((Class528_Sub1) this).aClass162Array8295 != null) {
					for (int i_1217_ = 0; i_1217_ < ((Class528_Sub1) this).anInt8294; i_1217_++) {
						Class162 class162 = (((Class528_Sub1) this).aClass162Array8295[i_1217_]);
						Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[i_1217_]);
						((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | (Class540.anIntArray7136[((((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_1218_ = 0; i_1218_ < i_1063_; i_1218_++) {
					int i_1219_ = is[i_1218_];
					if (i_1219_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_1220_ = (((Class528_Sub1) this).anIntArrayArray8278[i_1219_]);
						for (int i_1221_ = 0; i_1221_ < is_1220_.length; i_1221_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_1220_[i_1221_]]);
							((Class145) class145).anInt1709 += i_1058_;
							((Class145) class145).anInt1713 += i_1059_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_1222_ = 0; i_1222_ < i_1063_; i_1222_++) {
					int i_1223_ = is[i_1222_];
					if (i_1223_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_1224_ = (((Class528_Sub1) this).anIntArrayArray8278[i_1223_]);
						for (int i_1225_ = 0; i_1225_ < is_1224_.length; i_1225_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_1224_[i_1225_]]);
							((Class145) class145).anInt1710 = (((Class145) class145).anInt1710 * i_1058_ >> 7);
							((Class145) class145).anInt1711 = (((Class145) class145).anInt1711 * i_1059_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub1) this).anIntArrayArray8278 != null) {
				for (int i_1226_ = 0; i_1226_ < i_1063_; i_1226_++) {
					int i_1227_ = is[i_1226_];
					if (i_1227_ < ((Class528_Sub1) this).anIntArrayArray8278.length) {
						int[] is_1228_ = (((Class528_Sub1) this).anIntArrayArray8278[i_1227_]);
						for (int i_1229_ = 0; i_1229_ < is_1228_.length; i_1229_++) {
							Class145 class145 = (((Class528_Sub1) this).aClass145Array8258[is_1228_[i_1229_]]);
							((Class145) class145).anInt1712 = (((Class145) class145).anInt1712 + i_1058_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void bb(int i, int i_1230_, int i_1231_, int i_1232_) {
		if (i == 0) {
			int i_1233_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_1234_ = 0; i_1234_ < ((Class528_Sub1) this).anInt8248; i_1234_++) {
				anInt8271 += ((Class528_Sub1) this).anIntArray8249[i_1234_];
				anInt8247 += ((Class528_Sub1) this).anIntArray8250[i_1234_];
				anInt8232 += ((Class528_Sub1) this).anIntArray8251[i_1234_];
				i_1233_++;
			}
			if (i_1233_ > 0) {
				anInt8271 = anInt8271 / i_1233_ + i_1230_;
				anInt8247 = anInt8247 / i_1233_ + i_1231_;
				anInt8232 = anInt8232 / i_1233_ + i_1232_;
			} else {
				anInt8271 = i_1230_;
				anInt8247 = i_1231_;
				anInt8232 = i_1232_;
			}
		} else if (i == 1) {
			for (int i_1235_ = 0; i_1235_ < ((Class528_Sub1) this).anInt8248; i_1235_++) {
				((Class528_Sub1) this).anIntArray8249[i_1235_] += i_1230_;
				((Class528_Sub1) this).anIntArray8250[i_1235_] += i_1231_;
				((Class528_Sub1) this).anIntArray8251[i_1235_] += i_1232_;
			}
		} else if (i == 2) {
			for (int i_1236_ = 0; i_1236_ < ((Class528_Sub1) this).anInt8248; i_1236_++) {
				((Class528_Sub1) this).anIntArray8249[i_1236_] -= anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1236_] -= anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1236_] -= anInt8232;
				if (i_1232_ != 0) {
					int i_1237_ = Class382.anIntArray4657[i_1232_];
					int i_1238_ = Class382.anIntArray4661[i_1232_];
					int i_1239_ = (((((Class528_Sub1) this).anIntArray8250[i_1236_] * i_1237_) + (((Class528_Sub1) this).anIntArray8249[i_1236_] * i_1238_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8250[i_1236_] = ((((Class528_Sub1) this).anIntArray8250[i_1236_] * i_1238_) - (((Class528_Sub1) this).anIntArray8249[i_1236_] * i_1237_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8249[i_1236_] = i_1239_;
				}
				if (i_1230_ != 0) {
					int i_1240_ = Class382.anIntArray4657[i_1230_];
					int i_1241_ = Class382.anIntArray4661[i_1230_];
					int i_1242_ = (((((Class528_Sub1) this).anIntArray8250[i_1236_] * i_1241_) - (((Class528_Sub1) this).anIntArray8251[i_1236_] * i_1240_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8251[i_1236_] = ((((Class528_Sub1) this).anIntArray8250[i_1236_] * i_1240_) + (((Class528_Sub1) this).anIntArray8251[i_1236_] * i_1241_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8250[i_1236_] = i_1242_;
				}
				if (i_1231_ != 0) {
					int i_1243_ = Class382.anIntArray4657[i_1231_];
					int i_1244_ = Class382.anIntArray4661[i_1231_];
					int i_1245_ = (((((Class528_Sub1) this).anIntArray8251[i_1236_] * i_1243_) + (((Class528_Sub1) this).anIntArray8249[i_1236_] * i_1244_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8251[i_1236_] = ((((Class528_Sub1) this).anIntArray8251[i_1236_] * i_1244_) - (((Class528_Sub1) this).anIntArray8249[i_1236_] * i_1243_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8249[i_1236_] = i_1245_;
				}
				((Class528_Sub1) this).anIntArray8249[i_1236_] += anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1236_] += anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1236_] += anInt8232;
			}
		} else if (i == 3) {
			for (int i_1246_ = 0; i_1246_ < ((Class528_Sub1) this).anInt8248; i_1246_++) {
				((Class528_Sub1) this).anIntArray8249[i_1246_] -= anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1246_] -= anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1246_] -= anInt8232;
				((Class528_Sub1) this).anIntArray8249[i_1246_] = (((Class528_Sub1) this).anIntArray8249[i_1246_] * i_1230_ / 128);
				((Class528_Sub1) this).anIntArray8250[i_1246_] = (((Class528_Sub1) this).anIntArray8250[i_1246_] * i_1231_ / 128);
				((Class528_Sub1) this).anIntArray8251[i_1246_] = (((Class528_Sub1) this).anIntArray8251[i_1246_] * i_1232_ / 128);
				((Class528_Sub1) this).anIntArray8249[i_1246_] += anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1246_] += anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1246_] += anInt8232;
			}
		} else if (i == 5) {
			for (int i_1247_ = 0; i_1247_ < ((Class528_Sub1) this).anInt8262; i_1247_++) {
				int i_1248_ = ((((Class528_Sub1) this).aByteArray8265[i_1247_] & 0xff) + i_1230_ * 8);
				if (i_1248_ < 0)
					i_1248_ = 0;
				else if (i_1248_ > 255)
					i_1248_ = 255;
				((Class528_Sub1) this).aByteArray8265[i_1247_] = (byte) i_1248_;
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1249_ = 0; i_1249_ < ((Class528_Sub1) this).anInt8294; i_1249_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1249_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1249_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_1250_ = 0; i_1250_ < ((Class528_Sub1) this).anInt8262; i_1250_++) {
				int i_1251_ = ((Class528_Sub1) this).aShortArray8260[i_1250_] & 0xffff;
				int i_1252_ = i_1251_ >> 10 & 0x3f;
				int i_1253_ = i_1251_ >> 7 & 0x7;
				int i_1254_ = i_1251_ & 0x7f;
				i_1252_ = i_1252_ + i_1230_ & 0x3f;
				i_1253_ += i_1231_ / 4;
				if (i_1253_ < 0)
					i_1253_ = 0;
				else if (i_1253_ > 7)
					i_1253_ = 7;
				i_1254_ += i_1232_;
				if (i_1254_ < 0)
					i_1254_ = 0;
				else if (i_1254_ > 127)
					i_1254_ = 127;
				((Class528_Sub1) this).aShortArray8260[i_1250_] = (short) (i_1252_ << 10 | i_1253_ << 7 | i_1254_);
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1255_ = 0; i_1255_ < ((Class528_Sub1) this).anInt8294; i_1255_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1255_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1255_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1256_ = 0; i_1256_ < ((Class528_Sub1) this).anInt8294; i_1256_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1256_];
				((Class145) class145).anInt1709 += i_1230_;
				((Class145) class145).anInt1713 += i_1231_;
			}
		} else if (i == 10) {
			for (int i_1257_ = 0; i_1257_ < ((Class528_Sub1) this).anInt8294; i_1257_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1257_];
				((Class145) class145).anInt1710 = ((Class145) class145).anInt1710 * i_1230_ >> 7;
				((Class145) class145).anInt1711 = ((Class145) class145).anInt1711 * i_1231_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1258_ = 0; i_1258_ < ((Class528_Sub1) this).anInt8294; i_1258_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1258_];
				((Class145) class145).anInt1712 = ((Class145) class145).anInt1712 + i_1230_ & 0x3fff;
			}
		}
	}

	void bo(int i, int i_1259_, int i_1260_, int i_1261_) {
		if (i == 0) {
			int i_1262_ = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;
			for (int i_1263_ = 0; i_1263_ < ((Class528_Sub1) this).anInt8248; i_1263_++) {
				anInt8271 += ((Class528_Sub1) this).anIntArray8249[i_1263_];
				anInt8247 += ((Class528_Sub1) this).anIntArray8250[i_1263_];
				anInt8232 += ((Class528_Sub1) this).anIntArray8251[i_1263_];
				i_1262_++;
			}
			if (i_1262_ > 0) {
				anInt8271 = anInt8271 / i_1262_ + i_1259_;
				anInt8247 = anInt8247 / i_1262_ + i_1260_;
				anInt8232 = anInt8232 / i_1262_ + i_1261_;
			} else {
				anInt8271 = i_1259_;
				anInt8247 = i_1260_;
				anInt8232 = i_1261_;
			}
		} else if (i == 1) {
			for (int i_1264_ = 0; i_1264_ < ((Class528_Sub1) this).anInt8248; i_1264_++) {
				((Class528_Sub1) this).anIntArray8249[i_1264_] += i_1259_;
				((Class528_Sub1) this).anIntArray8250[i_1264_] += i_1260_;
				((Class528_Sub1) this).anIntArray8251[i_1264_] += i_1261_;
			}
		} else if (i == 2) {
			for (int i_1265_ = 0; i_1265_ < ((Class528_Sub1) this).anInt8248; i_1265_++) {
				((Class528_Sub1) this).anIntArray8249[i_1265_] -= anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1265_] -= anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1265_] -= anInt8232;
				if (i_1261_ != 0) {
					int i_1266_ = Class382.anIntArray4657[i_1261_];
					int i_1267_ = Class382.anIntArray4661[i_1261_];
					int i_1268_ = (((((Class528_Sub1) this).anIntArray8250[i_1265_] * i_1266_) + (((Class528_Sub1) this).anIntArray8249[i_1265_] * i_1267_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8250[i_1265_] = ((((Class528_Sub1) this).anIntArray8250[i_1265_] * i_1267_) - (((Class528_Sub1) this).anIntArray8249[i_1265_] * i_1266_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8249[i_1265_] = i_1268_;
				}
				if (i_1259_ != 0) {
					int i_1269_ = Class382.anIntArray4657[i_1259_];
					int i_1270_ = Class382.anIntArray4661[i_1259_];
					int i_1271_ = (((((Class528_Sub1) this).anIntArray8250[i_1265_] * i_1270_) - (((Class528_Sub1) this).anIntArray8251[i_1265_] * i_1269_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8251[i_1265_] = ((((Class528_Sub1) this).anIntArray8250[i_1265_] * i_1269_) + (((Class528_Sub1) this).anIntArray8251[i_1265_] * i_1270_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8250[i_1265_] = i_1271_;
				}
				if (i_1260_ != 0) {
					int i_1272_ = Class382.anIntArray4657[i_1260_];
					int i_1273_ = Class382.anIntArray4661[i_1260_];
					int i_1274_ = (((((Class528_Sub1) this).anIntArray8251[i_1265_] * i_1272_) + (((Class528_Sub1) this).anIntArray8249[i_1265_] * i_1273_) + 16383) >> 14);
					((Class528_Sub1) this).anIntArray8251[i_1265_] = ((((Class528_Sub1) this).anIntArray8251[i_1265_] * i_1273_) - (((Class528_Sub1) this).anIntArray8249[i_1265_] * i_1272_) + 16383) >> 14;
					((Class528_Sub1) this).anIntArray8249[i_1265_] = i_1274_;
				}
				((Class528_Sub1) this).anIntArray8249[i_1265_] += anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1265_] += anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1265_] += anInt8232;
			}
		} else if (i == 3) {
			for (int i_1275_ = 0; i_1275_ < ((Class528_Sub1) this).anInt8248; i_1275_++) {
				((Class528_Sub1) this).anIntArray8249[i_1275_] -= anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1275_] -= anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1275_] -= anInt8232;
				((Class528_Sub1) this).anIntArray8249[i_1275_] = (((Class528_Sub1) this).anIntArray8249[i_1275_] * i_1259_ / 128);
				((Class528_Sub1) this).anIntArray8250[i_1275_] = (((Class528_Sub1) this).anIntArray8250[i_1275_] * i_1260_ / 128);
				((Class528_Sub1) this).anIntArray8251[i_1275_] = (((Class528_Sub1) this).anIntArray8251[i_1275_] * i_1261_ / 128);
				((Class528_Sub1) this).anIntArray8249[i_1275_] += anInt8271;
				((Class528_Sub1) this).anIntArray8250[i_1275_] += anInt8247;
				((Class528_Sub1) this).anIntArray8251[i_1275_] += anInt8232;
			}
		} else if (i == 5) {
			for (int i_1276_ = 0; i_1276_ < ((Class528_Sub1) this).anInt8262; i_1276_++) {
				int i_1277_ = ((((Class528_Sub1) this).aByteArray8265[i_1276_] & 0xff) + i_1259_ * 8);
				if (i_1277_ < 0)
					i_1277_ = 0;
				else if (i_1277_ > 255)
					i_1277_ = 255;
				((Class528_Sub1) this).aByteArray8265[i_1276_] = (byte) i_1277_;
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1278_ = 0; i_1278_ < ((Class528_Sub1) this).anInt8294; i_1278_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1278_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1278_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & 0xffffff | 255 - ((((Class528_Sub1) this).aByteArray8265[((Class162) class162).anInt2023]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_1279_ = 0; i_1279_ < ((Class528_Sub1) this).anInt8262; i_1279_++) {
				int i_1280_ = ((Class528_Sub1) this).aShortArray8260[i_1279_] & 0xffff;
				int i_1281_ = i_1280_ >> 10 & 0x3f;
				int i_1282_ = i_1280_ >> 7 & 0x7;
				int i_1283_ = i_1280_ & 0x7f;
				i_1281_ = i_1281_ + i_1259_ & 0x3f;
				i_1282_ += i_1260_ / 4;
				if (i_1282_ < 0)
					i_1282_ = 0;
				else if (i_1282_ > 7)
					i_1282_ = 7;
				i_1283_ += i_1261_;
				if (i_1283_ < 0)
					i_1283_ = 0;
				else if (i_1283_ > 127)
					i_1283_ = 127;
				((Class528_Sub1) this).aShortArray8260[i_1279_] = (short) (i_1281_ << 10 | i_1282_ << 7 | i_1283_);
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1284_ = 0; i_1284_ < ((Class528_Sub1) this).anInt8294; i_1284_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1284_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1284_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1285_ = 0; i_1285_ < ((Class528_Sub1) this).anInt8294; i_1285_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1285_];
				((Class145) class145).anInt1709 += i_1259_;
				((Class145) class145).anInt1713 += i_1260_;
			}
		} else if (i == 10) {
			for (int i_1286_ = 0; i_1286_ < ((Class528_Sub1) this).anInt8294; i_1286_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1286_];
				((Class145) class145).anInt1710 = ((Class145) class145).anInt1710 * i_1259_ >> 7;
				((Class145) class145).anInt1711 = ((Class145) class145).anInt1711 * i_1260_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1287_ = 0; i_1287_ < ((Class528_Sub1) this).anInt8294; i_1287_++) {
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1287_];
				((Class145) class145).anInt1712 = ((Class145) class145).anInt1712 + i_1259_ & 0x3fff;
			}
		}
	}

	public void method11263(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub1) this).aShortArray8253 != null) {
			Matrix44Var class294_1288_ = class294;
			if (bool) {
				class294_1288_ = ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass294_8405;
				class294_1288_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_1289_ = 0; i_1289_ < ((Class528_Sub1) this).anInt8248; i_1289_++) {
				if ((i & ((Class528_Sub1) this).aShortArray8253[i_1289_]) != 0) {
					class294_1288_.method5226((float) (((Class528_Sub1) this).anIntArray8249[i_1289_]), (float) (((Class528_Sub1) this).anIntArray8250[i_1289_]), (float) (((Class528_Sub1) this).anIntArray8251[i_1289_]), fs);
					((Class528_Sub1) this).anIntArray8249[i_1289_] = (int) fs[0];
					((Class528_Sub1) this).anIntArray8250[i_1289_] = (int) fs[1];
					((Class528_Sub1) this).anIntArray8251[i_1289_] = (int) fs[2];
				}
			}
		}
	}

	public void method11290(Matrix44Var class294, int i, boolean bool) {
		if (((Class528_Sub1) this).aShortArray8253 != null) {
			Matrix44Var class294_1290_ = class294;
			if (bool) {
				class294_1290_ = ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass294_8405;
				class294_1290_.method5215(class294);
			}
			float[] fs = new float[3];
			for (int i_1291_ = 0; i_1291_ < ((Class528_Sub1) this).anInt8248; i_1291_++) {
				if ((i & ((Class528_Sub1) this).aShortArray8253[i_1291_]) != 0) {
					class294_1290_.method5226((float) (((Class528_Sub1) this).anIntArray8249[i_1291_]), (float) (((Class528_Sub1) this).anIntArray8250[i_1291_]), (float) (((Class528_Sub1) this).anIntArray8251[i_1291_]), fs);
					((Class528_Sub1) this).anIntArray8249[i_1291_] = (int) fs[0];
					((Class528_Sub1) this).anIntArray8250[i_1291_] = (int) fs[1];
					((Class528_Sub1) this).anIntArray8251[i_1291_] = (int) fs[2];
				}
			}
		}
	}

	public Class172[] method11283() {
		return ((Class528_Sub1) this).aClass172Array8244;
	}

	public int m() {
		return ((Class528_Sub1) this).anInt8240;
	}

	public void method11293(Matrix44Var class294, Class275_Sub5 class275_sub5, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (((Class528_Sub1) this).anInt8300 != 0) {
			Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8442);
			Matrix44Arr class384_1292_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
			Matrix44Arr class384_1293_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8407);
			class384_1292_.method6522(class294);
			class384_1293_.method6562(class384_1292_);
			class384_1293_.method6523(((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass384_8394);
			if (!((Class528_Sub1) this).aBool8254)
				method13528();
			float[] fs = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArray8396);
			class384_1292_.method6527(0.0F, (float) (((Class528_Sub1) this).aShort8283), 0.0F, fs);
			float f = fs[0];
			float f_1294_ = fs[1];
			float f_1295_ = fs[2];
			class384_1292_.method6527(0.0F, (float) (((Class528_Sub1) this).aShort8284), 0.0F, fs);
			float f_1296_ = fs[0];
			float f_1297_ = fs[1];
			float f_1298_ = fs[2];
			for (int i_1299_ = 0; i_1299_ < 6; i_1299_++) {
				float[] fs_1300_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArrayArray8395[i_1299_]);
				float f_1301_ = (fs_1300_[0] * f + fs_1300_[1] * f_1294_ + fs_1300_[2] * f_1295_ + fs_1300_[3] + (float) ((Class528_Sub1) this).anInt8281);
				float f_1302_ = (fs_1300_[0] * f_1296_ + fs_1300_[1] * f_1297_ + fs_1300_[2] * f_1298_ + fs_1300_[3] + (float) ((Class528_Sub1) this).anInt8281);
				if (f_1301_ < 0.0F && f_1302_ < 0.0F)
					return;
			}
			if (class275_sub5 != null) {
				boolean bool = false;
				boolean bool_1303_ = true;
				int i_1304_ = ((((Class528_Sub1) this).aShort8285 + ((Class528_Sub1) this).aShort8286) >> 1);
				int i_1305_ = ((((Class528_Sub1) this).aShort8287 + ((Class528_Sub1) this).aShort8306) >> 1);
				int i_1306_ = i_1304_;
				short i_1307_ = ((Class528_Sub1) this).aShort8283;
				int i_1308_ = i_1305_;
				float f_1309_ = (class384_1293_.buf[0] * (float) i_1306_ + class384_1293_.buf[4] * (float) i_1307_ + class384_1293_.buf[8] * (float) i_1308_ + class384_1293_.buf[12]);
				float f_1310_ = (class384_1293_.buf[1] * (float) i_1306_ + class384_1293_.buf[5] * (float) i_1307_ + class384_1293_.buf[9] * (float) i_1308_ + class384_1293_.buf[13]);
				float f_1311_ = (class384_1293_.buf[2] * (float) i_1306_ + class384_1293_.buf[6] * (float) i_1307_ + class384_1293_.buf[10] * (float) i_1308_ + class384_1293_.buf[14]);
				float f_1312_ = (class384_1293_.buf[3] * (float) i_1306_ + class384_1293_.buf[7] * (float) i_1307_ + class384_1293_.buf[11] * (float) i_1308_ + class384_1293_.buf[15]);
				if (f_1311_ >= -f_1312_) {
					class275_sub5.anInt7847 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398) * f_1309_ / f_1312_);
					class275_sub5.anInt7848 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400) * f_1310_ / f_1312_);
				} else
					bool = true;
				i_1306_ = i_1304_;
				i_1307_ = ((Class528_Sub1) this).aShort8284;
				i_1308_ = i_1305_;
				float f_1313_ = (class384_1293_.buf[0] * (float) i_1306_ + class384_1293_.buf[4] * (float) i_1307_ + class384_1293_.buf[8] * (float) i_1308_ + class384_1293_.buf[12]);
				float f_1314_ = (class384_1293_.buf[1] * (float) i_1306_ + class384_1293_.buf[5] * (float) i_1307_ + class384_1293_.buf[9] * (float) i_1308_ + class384_1293_.buf[13]);
				float f_1315_ = (class384_1293_.buf[2] * (float) i_1306_ + class384_1293_.buf[6] * (float) i_1307_ + class384_1293_.buf[10] * (float) i_1308_ + class384_1293_.buf[14]);
				float f_1316_ = (class384_1293_.buf[3] * (float) i_1306_ + class384_1293_.buf[7] * (float) i_1307_ + class384_1293_.buf[11] * (float) i_1308_ + class384_1293_.buf[15]);
				if (f_1315_ >= -f_1316_) {
					class275_sub5.anInt7850 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398) * f_1313_ / f_1316_);
					class275_sub5.anInt7846 = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400) * f_1314_ / f_1316_);
				} else
					bool = true;
				if (bool) {
					if (f_1311_ < -f_1312_ && f_1315_ < -f_1316_)
						bool_1303_ = false;
					else if (f_1311_ < -f_1312_) {
						float f_1317_ = (f_1311_ + f_1312_) / (f_1315_ + f_1316_) - 1.0F;
						float f_1318_ = f_1309_ + f_1317_ * (f_1313_ - f_1309_);
						float f_1319_ = f_1310_ + f_1317_ * (f_1314_ - f_1310_);
						float f_1320_ = f_1312_ + f_1317_ * (f_1316_ - f_1312_);
						class275_sub5.anInt7847 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_1318_ / f_1320_));
						class275_sub5.anInt7848 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_1319_ / f_1320_));
					} else if (f_1315_ < -f_1316_) {
						float f_1321_ = (f_1315_ + f_1316_) / (f_1311_ + f_1312_) - 1.0F;
						float f_1322_ = f_1313_ + f_1321_ * (f_1309_ - f_1313_);
						float f_1323_ = f_1314_ + f_1321_ * (f_1310_ - f_1314_);
						float f_1324_ = f_1316_ + f_1321_ * (f_1312_ - f_1316_);
						class275_sub5.anInt7850 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_1322_ / f_1324_));
						class275_sub5.anInt7846 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_1323_ / f_1324_));
					}
				}
				if (bool_1303_) {
					if (f_1311_ / f_1312_ > f_1315_ / f_1316_) {
						float f_1325_ = (f_1309_ + (class384.buf[0] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[12]);
						float f_1326_ = (f_1312_ + (class384.buf[3] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) - (float) class275_sub5.anInt7847 + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_1325_ / f_1326_));
					} else {
						float f_1327_ = (f_1313_ + (class384.buf[0] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[12]);
						float f_1328_ = (f_1316_ + (class384.buf[3] * (float) ((Class528_Sub1) this).anInt8281) + class384.buf[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) - (float) class275_sub5.anInt7850 + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_1327_ / f_1328_));
					}
					class275_sub5.aBool7849 = true;
				}
			}
			((Class528_Sub1) this).aClass505_Sub1_8239.method13607();
			((Class528_Sub1) this).aClass505_Sub1_8239.method13633(class384_1292_);
			method13534();
			((Class528_Sub1) this).aClass505_Sub1_8239.method13641();
			class384_1292_.method6523(((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aClass384_8348);
			method13535(class384_1292_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void EA(int i) {
		int i_1329_ = Class382.anIntArray4657[i];
		int i_1330_ = Class382.anIntArray4661[i];
		for (int i_1331_ = 0; i_1331_ < ((Class528_Sub1) this).anInt8248; i_1331_++) {
			int i_1332_ = ((((Class528_Sub1) this).anIntArray8250[i_1331_] * i_1329_ + ((Class528_Sub1) this).anIntArray8249[i_1331_] * i_1330_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_1331_] = ((((Class528_Sub1) this).anIntArray8250[i_1331_] * i_1330_ - ((Class528_Sub1) this).anIntArray8249[i_1331_] * i_1329_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_1331_] = i_1332_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	void method13543() {
		int i = 32767;
		int i_1333_ = 32767;
		int i_1334_ = 32767;
		int i_1335_ = -32768;
		int i_1336_ = -32768;
		int i_1337_ = -32768;
		int i_1338_ = 0;
		int i_1339_ = 0;
		for (int i_1340_ = 0; i_1340_ < ((Class528_Sub1) this).anInt8248; i_1340_++) {
			int i_1341_ = ((Class528_Sub1) this).anIntArray8249[i_1340_];
			int i_1342_ = ((Class528_Sub1) this).anIntArray8250[i_1340_];
			int i_1343_ = ((Class528_Sub1) this).anIntArray8251[i_1340_];
			if (i_1341_ < i)
				i = i_1341_;
			if (i_1341_ > i_1335_)
				i_1335_ = i_1341_;
			if (i_1342_ < i_1333_)
				i_1333_ = i_1342_;
			if (i_1342_ > i_1336_)
				i_1336_ = i_1342_;
			if (i_1343_ < i_1334_)
				i_1334_ = i_1343_;
			if (i_1343_ > i_1337_)
				i_1337_ = i_1343_;
			int i_1344_ = i_1341_ * i_1341_ + i_1343_ * i_1343_;
			if (i_1344_ > i_1338_)
				i_1338_ = i_1344_;
			i_1344_ = i_1341_ * i_1341_ + i_1343_ * i_1343_ + i_1342_ * i_1342_;
			if (i_1344_ > i_1339_)
				i_1339_ = i_1344_;
		}
		((Class528_Sub1) this).aShort8285 = (short) i;
		((Class528_Sub1) this).aShort8286 = (short) i_1335_;
		((Class528_Sub1) this).aShort8283 = (short) i_1333_;
		((Class528_Sub1) this).aShort8284 = (short) i_1336_;
		((Class528_Sub1) this).aShort8287 = (short) i_1334_;
		((Class528_Sub1) this).aShort8306 = (short) i_1337_;
		((Class528_Sub1) this).anInt8281 = (int) (Math.sqrt((double) i_1338_) + 0.99);
		((Class528_Sub1) this).anInt8280 = (int) (Math.sqrt((double) i_1339_) + 0.99);
		((Class528_Sub1) this).aBool8254 = true;
	}

	public void PA(int i, int i_1345_, int i_1346_, int i_1347_) {
		for (int i_1348_ = 0; i_1348_ < ((Class528_Sub1) this).anInt8262; i_1348_++) {
			int i_1349_ = ((Class528_Sub1) this).aShortArray8260[i_1348_] & 0xffff;
			int i_1350_ = i_1349_ >> 10 & 0x3f;
			int i_1351_ = i_1349_ >> 7 & 0x7;
			int i_1352_ = i_1349_ & 0x7f;
			if (i != -1)
				i_1350_ += (i - i_1350_) * i_1347_ >> 7;
			if (i_1345_ != -1)
				i_1351_ += (i_1345_ - i_1351_) * i_1347_ >> 7;
			if (i_1346_ != -1)
				i_1352_ += (i_1346_ - i_1352_) * i_1347_ >> 7;
			((Class528_Sub1) this).aShortArray8260[i_1348_] = (short) (i_1350_ << 10 | i_1351_ << 7 | i_1352_);
		}
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			for (int i_1353_ = 0; i_1353_ < ((Class528_Sub1) this).anInt8294; i_1353_++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1353_];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1353_];
				((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public int cp() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8285;
	}

	public int cc() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8285;
	}

	public void X(short i, short i_1354_) {
		for (int i_1355_ = 0; i_1355_ < ((Class528_Sub1) this).anInt8262; i_1355_++) {
			if (((Class528_Sub1) this).aShortArray8260[i_1355_] == i)
				((Class528_Sub1) this).aShortArray8260[i_1355_] = i_1354_;
		}
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			for (int i_1356_ = 0; i_1356_ < ((Class528_Sub1) this).anInt8294; i_1356_++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1356_];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1356_];
				((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public int ar() {
		return ((Class528_Sub1) this).anInt8240;
	}

	public int cu() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8286;
	}

	static final int method13544(int i, int i_1357_) {
		i_1357_ = i_1357_ * (i & 0x7f) >> 7;
		if (i_1357_ < 2)
			i_1357_ = 2;
		else if (i_1357_ > 126)
			i_1357_ = 126;
		return (i & 0xff80) + i_1357_;
	}

	public int cw() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8283;
	}

	public int cm() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8283;
	}

	static byte[] method13545(byte[] is, int i) {
		byte[] is_1358_ = new byte[i];
		System.arraycopy(is, 0, is_1358_, 0, i);
		return is_1358_;
	}

	public int ck() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8287;
	}

	public int co() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8306;
	}

	public int cd() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8306;
	}

	public Class282_Sub50_Sub17 da(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub1) this).anInt8300 == 0)
			return null;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i;
		int i_1359_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) > 0) {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1359_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1359_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1360_;
		int i_1361_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8439) > 0) {
			i_1360_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1361_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i_1360_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1361_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1362_ = i_1359_ - i + 1;
		int i_1363_ = i_1361_ - i_1360_ + 1;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_1364_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_1362_, i_1363_)) {
			class282_sub50_sub17_sub1_1364_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_1364_.method15712();
		} else
			class282_sub50_sub17_sub1_1364_ = new Class282_Sub50_Sub17_Sub1((((Class528_Sub1) this).aClass505_Sub1_8239), i_1362_, i_1363_);
		class282_sub50_sub17_sub1_1364_.method15721(i, i_1360_, i_1359_, i_1361_);
		method13522(class282_sub50_sub17_sub1_1364_);
		return class282_sub50_sub17_sub1_1364_;
	}

	public void cr(int i) {
		((Class528_Sub1) this).aShort8257 = (short) i;
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
	}

	public int ch() {
		return ((Class528_Sub1) this).aShort8257;
	}

	public byte[] cz() {
		return ((Class528_Sub1) this).aByteArray8265;
	}

	public void cq(short i, short i_1365_) {
		for (int i_1366_ = 0; i_1366_ < ((Class528_Sub1) this).anInt8262; i_1366_++) {
			if (((Class528_Sub1) this).aShortArray8260[i_1366_] == i)
				((Class528_Sub1) this).aShortArray8260[i_1366_] = i_1365_;
		}
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			for (int i_1367_ = 0; i_1367_ < ((Class528_Sub1) this).anInt8294; i_1367_++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1367_];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1367_];
				((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public void method11307(byte i, byte[] is) {
		if (is == null) {
			for (int i_1368_ = 0; i_1368_ < ((Class528_Sub1) this).anInt8262; i_1368_++)
				((Class528_Sub1) this).aByteArray8265[i_1368_] = i;
		} else {
			for (int i_1369_ = 0; i_1369_ < ((Class528_Sub1) this).anInt8262; i_1369_++) {
				int i_1370_ = 255 - ((255 - (is[i_1369_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class528_Sub1) this).aByteArray8265[i_1369_] = (byte) i_1370_;
			}
		}
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public void cy(int i, int i_1371_, int i_1372_, int i_1373_) {
		for (int i_1374_ = 0; i_1374_ < ((Class528_Sub1) this).anInt8262; i_1374_++) {
			int i_1375_ = ((Class528_Sub1) this).aShortArray8260[i_1374_] & 0xffff;
			int i_1376_ = i_1375_ >> 10 & 0x3f;
			int i_1377_ = i_1375_ >> 7 & 0x7;
			int i_1378_ = i_1375_ & 0x7f;
			if (i != -1)
				i_1376_ += (i - i_1376_) * i_1373_ >> 7;
			if (i_1371_ != -1)
				i_1377_ += (i_1371_ - i_1377_) * i_1373_ >> 7;
			if (i_1372_ != -1)
				i_1378_ += (i_1372_ - i_1378_) * i_1373_ >> 7;
			((Class528_Sub1) this).aShortArray8260[i_1374_] = (short) (i_1376_ << 10 | i_1377_ << 7 | i_1378_);
		}
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			for (int i_1379_ = 0; i_1379_ < ((Class528_Sub1) this).anInt8294; i_1379_++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1379_];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1379_];
				((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
			}
		}
		if (((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
	}

	public void method11259() {
		if (((Class528_Sub1) this).anInt8300 > 0 && ((Class528_Sub1) this).anInt8302 > 0) {
			method13537(false);
			if ((((Class528_Sub1) this).aByte8242 & 0x10) == 0 && (((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) == null)
				method13536(false);
			method13525();
		}
	}

	public Class172[] method11331() {
		return ((Class528_Sub1) this).aClass172Array8244;
	}

	public void W(short i, short i_1380_) {
		Interface22 interface22 = ((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834;
		for (int i_1381_ = 0; i_1381_ < ((Class528_Sub1) this).anInt8262; i_1381_++) {
			if (((Class528_Sub1) this).aShortArray8269[i_1381_] == i)
				((Class528_Sub1) this).aShortArray8269[i_1381_] = i_1380_;
		}
		byte i_1382_ = 0;
		byte i_1383_ = 0;
		if (i != -1) {
			Class169 class169 = interface22.method144(i & 0xffff, -1776053631);
			i_1382_ = class169.aByte2079;
			i_1383_ = class169.aByte2080;
		}
		byte i_1384_ = 0;
		byte i_1385_ = 0;
		if (i_1380_ != -1) {
			Class169 class169 = interface22.method144(i_1380_ & 0xffff, -1781439316);
			i_1384_ = class169.aByte2079;
			i_1385_ = class169.aByte2080;
			if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
				((Class528_Sub1) this).aBool8246 = true;
		}
		if (i_1382_ != i_1384_ | i_1383_ != i_1385_) {
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1386_ = 0; i_1386_ < ((Class528_Sub1) this).anInt8294; i_1386_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1386_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1386_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
				}
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		}
	}

	public Class172[] method11302() {
		return ((Class528_Sub1) this).aClass172Array8244;
	}

	static short[] method13546(short[] is, int i) {
		short[] is_1387_ = new short[i];
		System.arraycopy(is, 0, is_1387_, 0, i);
		return is_1387_;
	}

	public boolean dh() {
		return ((Class528_Sub1) this).aBool8246;
	}

	public void bs(int i) {
		int i_1388_ = Class382.anIntArray4657[i];
		int i_1389_ = Class382.anIntArray4661[i];
		for (int i_1390_ = 0; i_1390_ < ((Class528_Sub1) this).anInt8248; i_1390_++) {
			int i_1391_ = ((((Class528_Sub1) this).anIntArray8250[i_1390_] * i_1389_ - ((Class528_Sub1) this).anIntArray8251[i_1390_] * i_1388_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_1390_] = ((((Class528_Sub1) this).anIntArray8250[i_1390_] * i_1388_ + ((Class528_Sub1) this).anIntArray8251[i_1390_] * i_1389_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_1390_] = i_1391_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	short method13547(RSMesh class157, int i, long l, int i_1392_, int i_1393_, int i_1394_, int i_1395_, float f, float f_1396_) {
		int i_1397_ = ((Class528_Sub1) this).anIntArray8290[i];
		int i_1398_ = ((Class528_Sub1) this).anIntArray8290[i + 1];
		int i_1399_ = 0;
		for (int i_1400_ = i_1397_; i_1400_ < i_1398_; i_1400_++) {
			short i_1401_ = ((Class528_Sub1) this).aShortArray8288[i_1400_];
			if (i_1401_ == 0) {
				i_1399_ = i_1400_;
				break;
			}
			if (aLongArray8298[i_1400_] == l)
				return (short) (i_1401_ - 1);
		}
		((Class528_Sub1) this).aShortArray8288[i_1399_] = (short) (((Class528_Sub1) this).anInt8300 + 1);
		aLongArray8298[i_1399_] = l;
		((Class528_Sub1) this).aShortArray8255[(((Class528_Sub1) this).anInt8300)] = (short) i_1392_;
		((Class528_Sub1) this).aShortArray8270[(((Class528_Sub1) this).anInt8300)] = (short) i_1393_;
		((Class528_Sub1) this).aShortArray8261[(((Class528_Sub1) this).anInt8300)] = (short) i_1394_;
		((Class528_Sub1) this).aByteArray8264[((Class528_Sub1) this).anInt8300] = (byte) i_1395_;
		((Class528_Sub1) this).aFloatArray8297[(((Class528_Sub1) this).anInt8300)] = f;
		((Class528_Sub1) this).aFloatArray8292[(((Class528_Sub1) this).anInt8300)] = f_1396_;
		return (short) ((Class528_Sub1) this).anInt8300++;
	}

	short method13548(RSMesh class157, int i, long l, int i_1402_, int i_1403_, int i_1404_, int i_1405_, float f, float f_1406_) {
		int i_1407_ = ((Class528_Sub1) this).anIntArray8290[i];
		int i_1408_ = ((Class528_Sub1) this).anIntArray8290[i + 1];
		int i_1409_ = 0;
		for (int i_1410_ = i_1407_; i_1410_ < i_1408_; i_1410_++) {
			short i_1411_ = ((Class528_Sub1) this).aShortArray8288[i_1410_];
			if (i_1411_ == 0) {
				i_1409_ = i_1410_;
				break;
			}
			if (aLongArray8298[i_1410_] == l)
				return (short) (i_1411_ - 1);
		}
		((Class528_Sub1) this).aShortArray8288[i_1409_] = (short) (((Class528_Sub1) this).anInt8300 + 1);
		aLongArray8298[i_1409_] = l;
		((Class528_Sub1) this).aShortArray8255[(((Class528_Sub1) this).anInt8300)] = (short) i_1402_;
		((Class528_Sub1) this).aShortArray8270[(((Class528_Sub1) this).anInt8300)] = (short) i_1403_;
		((Class528_Sub1) this).aShortArray8261[(((Class528_Sub1) this).anInt8300)] = (short) i_1404_;
		((Class528_Sub1) this).aByteArray8264[((Class528_Sub1) this).anInt8300] = (byte) i_1405_;
		((Class528_Sub1) this).aFloatArray8297[(((Class528_Sub1) this).anInt8300)] = f;
		((Class528_Sub1) this).aFloatArray8292[(((Class528_Sub1) this).anInt8300)] = f_1406_;
		return (short) ((Class528_Sub1) this).anInt8300++;
	}

	static byte[] method13549(byte[] is, int i) {
		byte[] is_1412_ = new byte[i];
		System.arraycopy(is, 0, is_1412_, 0, i);
		return is_1412_;
	}

	Class528_Sub1(Class505_Sub1 class505_sub1) {
		((Class528_Sub1) this).anInt8248 = 0;
		((Class528_Sub1) this).anInt8300 = 0;
		((Class528_Sub1) this).anInt8262 = 0;
		((Class528_Sub1) this).anInt8302 = 0;
		((Class528_Sub1) this).aBool8279 = true;
		((Class528_Sub1) this).aBool8254 = false;
		((Class528_Sub1) this).aClass505_Sub1_8239 = class505_sub1;
		((Class528_Sub1) this).aClass143_8272 = new Class143(null, 5126, 3, 0);
		((Class528_Sub1) this).aClass143_8275 = new Class143(null, 5126, 2, 0);
		((Class528_Sub1) this).aClass143_8274 = new Class143(null, 5126, 3, 0);
		((Class528_Sub1) this).aClass143_8273 = new Class143(null, 5121, 4, 0);
		((Class528_Sub1) this).aClass132_8276 = new Class132();
	}

	public int ha() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8306;
	}

	static short[] method13550(short[] is, int i) {
		short[] is_1413_ = new short[i];
		System.arraycopy(is, 0, is_1413_, 0, i);
		return is_1413_;
	}

	static short[] method13551(short[] is, int i) {
		short[] is_1414_ = new short[i];
		System.arraycopy(is, 0, is_1414_, 0, i);
		return is_1414_;
	}

	static short[] method13552(short[] is, int i) {
		short[] is_1415_ = new short[i];
		System.arraycopy(is, 0, is_1415_, 0, i);
		return is_1415_;
	}

	public void aq(int i) {
		((Class528_Sub1) this).anInt8240 = i;
		if (((Class528_Sub1) this).aClass166_8259 != null && (((Class528_Sub1) this).anInt8240 & 0x10000) == 0) {
			((Class528_Sub1) this).aShortArray8255 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
			((Class528_Sub1) this).aShortArray8270 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
			((Class528_Sub1) this).aShortArray8261 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
			((Class528_Sub1) this).aByteArray8264 = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
			((Class528_Sub1) this).aClass166_8259 = null;
		}
		((Class528_Sub1) this).aBool8279 = true;
		method13525();
	}

	static float[] method13553(float[] fs, int i) {
		float[] fs_1416_ = new float[i];
		System.arraycopy(fs, 0, fs_1416_, 0, i);
		return fs_1416_;
	}

	void method13554() {
		if (((Class528_Sub1) this).aBool8279) {
			((Class528_Sub1) this).aBool8279 = false;
			if (((Class528_Sub1) this).aClass87Array8252 == null && ((Class528_Sub1) this).aClass172Array8244 == null && ((Class528_Sub1) this).aClass162Array8295 == null && !Class129.method2183(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				boolean bool = false;
				boolean bool_1417_ = false;
				boolean bool_1418_ = false;
				if (((Class528_Sub1) this).anIntArray8249 != null && !Class129.method2202(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (((Class528_Sub1) this).anIntArray8250 != null && !Class129.method2229(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool_1417_ = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (((Class528_Sub1) this).anIntArray8251 != null && !Class129.method2252(((Class528_Sub1) this).anInt8240, (((Class528_Sub1) this).anInt8241))) {
					if (((Class528_Sub1) this).aClass143_8272 == null || (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) != null) {
						if (!((Class528_Sub1) this).aBool8254)
							method13528();
						bool_1418_ = true;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				}
				if (bool)
					((Class528_Sub1) this).anIntArray8249 = null;
				if (bool_1417_)
					((Class528_Sub1) this).anIntArray8250 = null;
				if (bool_1418_)
					((Class528_Sub1) this).anIntArray8251 = null;
			}
			if (((Class528_Sub1) this).aShortArray8288 != null && ((Class528_Sub1) this).anIntArray8249 == null && ((Class528_Sub1) this).anIntArray8250 == null && ((Class528_Sub1) this).anIntArray8251 == null) {
				((Class528_Sub1) this).aShortArray8288 = null;
				((Class528_Sub1) this).anIntArray8290 = null;
			}
			if (((Class528_Sub1) this).aByteArray8264 != null && !Class129.method2204(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8274 != null) {
					if ((((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) != null) {
						((Class528_Sub1) this).aShortArray8261 = null;
						((Class528_Sub1) this).aShortArray8270 = null;
						((Class528_Sub1) this).aShortArray8255 = null;
						((Class528_Sub1) this).aByteArray8264 = null;
					} else
						((Class528_Sub1) this).aBool8279 = true;
				} else if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null) {
					((Class528_Sub1) this).aShortArray8261 = null;
					((Class528_Sub1) this).aShortArray8270 = null;
					((Class528_Sub1) this).aShortArray8255 = null;
					((Class528_Sub1) this).aByteArray8264 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8260 != null && !Class129.method2205(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aShortArray8260 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aByteArray8265 != null && !Class129.method2206(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aByteArray8265 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aFloatArray8297 != null && !Class129.method2241(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8275 == null || (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) != null) {
					((Class528_Sub1) this).aFloatArray8292 = null;
					((Class528_Sub1) this).aFloatArray8297 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8269 != null && !Class129.method2212(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)
					((Class528_Sub1) this).aShortArray8269 = null;
				else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).aShortArray8266 != null && !Class129.method2211(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				if ((((Class528_Sub1) this).aClass132_8276 == null || (((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) != null) && (((Class528_Sub1) this).aClass143_8273 == null || (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) != null)) {
					((Class528_Sub1) this).aShortArray8256 = null;
					((Class528_Sub1) this).aShortArray8267 = null;
					((Class528_Sub1) this).aShortArray8266 = null;
				} else
					((Class528_Sub1) this).aBool8279 = true;
			}
			if (((Class528_Sub1) this).anIntArrayArray8282 != null && !Class129.method2208(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				((Class528_Sub1) this).anIntArrayArray8282 = null;
				((Class528_Sub1) this).aShortArray8304 = null;
			}
			if (((Class528_Sub1) this).anIntArrayArray8263 != null && !Class129.method2226(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241)) {
				((Class528_Sub1) this).anIntArrayArray8263 = null;
				((Class528_Sub1) this).aShortArray8253 = null;
			}
			if (((Class528_Sub1) this).anIntArrayArray8278 != null && !Class129.method2260(((Class528_Sub1) this).anInt8240, ((Class528_Sub1) this).anInt8241))
				((Class528_Sub1) this).anIntArrayArray8278 = null;
			if (((Class528_Sub1) this).anIntArray8289 != null && (((Class528_Sub1) this).anInt8240 & 0x800) == 0 && (((Class528_Sub1) this).anInt8240 & 0x40000) == 0)
				((Class528_Sub1) this).anIntArray8289 = null;
		}
	}

	public int ct() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8286;
	}

	public void dl(int i) {
		int i_1419_ = Class382.anIntArray4657[i];
		int i_1420_ = Class382.anIntArray4661[i];
		for (int i_1421_ = 0; i_1421_ < ((Class528_Sub1) this).anInt8248; i_1421_++) {
			int i_1422_ = ((((Class528_Sub1) this).anIntArray8250[i_1421_] * i_1419_ + ((Class528_Sub1) this).anIntArray8249[i_1421_] * i_1420_) >> 14);
			((Class528_Sub1) this).anIntArray8250[i_1421_] = ((((Class528_Sub1) this).anIntArray8250[i_1421_] * i_1420_ - ((Class528_Sub1) this).anIntArray8249[i_1421_] * i_1419_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_1421_] = i_1422_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public MeshRasterizer method11278(byte i, int i_1423_, boolean bool) {
		boolean bool_1424_ = false;
		Class528_Sub1 class528_sub1_1425_;
		Class528_Sub1 class528_sub1_1426_;
		if (i > 0 && i <= 7) {
			class528_sub1_1426_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8492[i - 1]);
			class528_sub1_1425_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass528_Sub1Array8479[i - 1]);
			bool_1424_ = true;
		} else
			class528_sub1_1425_ = class528_sub1_1426_ = new Class528_Sub1(((Class528_Sub1) this).aClass505_Sub1_8239);
		return method13524(class528_sub1_1425_, class528_sub1_1426_, i_1423_, bool_1424_, bool);
	}

	public void bi(int i) {
		int i_1427_ = Class382.anIntArray4657[i];
		int i_1428_ = Class382.anIntArray4661[i];
		for (int i_1429_ = 0; i_1429_ < ((Class528_Sub1) this).anInt8248; i_1429_++) {
			int i_1430_ = ((((Class528_Sub1) this).anIntArray8251[i_1429_] * i_1427_ + ((Class528_Sub1) this).anIntArray8249[i_1429_] * i_1428_) >> 14);
			((Class528_Sub1) this).anIntArray8251[i_1429_] = ((((Class528_Sub1) this).anIntArray8251[i_1429_] * i_1428_ - ((Class528_Sub1) this).anIntArray8249[i_1429_] * i_1427_) >> 14);
			((Class528_Sub1) this).anIntArray8249[i_1429_] = i_1430_;
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public int dy() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8281;
	}

	public int dm() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8281;
	}

	public int dp() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8280;
	}

	static byte[] method13555(byte[] is, int i) {
		byte[] is_1431_ = new byte[i];
		System.arraycopy(is, 0, is_1431_, 0, i);
		return is_1431_;
	}

	public int dg() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8280;
	}

	public int dd() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8284;
	}

	public void di(short i, short i_1432_) {
		Interface22 interface22 = ((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834;
		for (int i_1433_ = 0; i_1433_ < ((Class528_Sub1) this).anInt8262; i_1433_++) {
			if (((Class528_Sub1) this).aShortArray8269[i_1433_] == i)
				((Class528_Sub1) this).aShortArray8269[i_1433_] = i_1432_;
		}
		byte i_1434_ = 0;
		byte i_1435_ = 0;
		if (i != -1) {
			Class169 class169 = interface22.method144(i & 0xffff, -2130992347);
			i_1434_ = class169.aByte2079;
			i_1435_ = class169.aByte2080;
		}
		byte i_1436_ = 0;
		byte i_1437_ = 0;
		if (i_1432_ != -1) {
			Class169 class169 = interface22.method144(i_1432_ & 0xffff, -1975477169);
			i_1436_ = class169.aByte2079;
			i_1437_ = class169.aByte2080;
			if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
				((Class528_Sub1) this).aBool8246 = true;
		}
		if (i_1434_ != i_1436_ | i_1435_ != i_1437_) {
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1438_ = 0; i_1438_ < ((Class528_Sub1) this).anInt8294; i_1438_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1438_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1438_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
				}
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		}
	}

	public void df(short i, short i_1439_) {
		Interface22 interface22 = ((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834;
		for (int i_1440_ = 0; i_1440_ < ((Class528_Sub1) this).anInt8262; i_1440_++) {
			if (((Class528_Sub1) this).aShortArray8269[i_1440_] == i)
				((Class528_Sub1) this).aShortArray8269[i_1440_] = i_1439_;
		}
		byte i_1441_ = 0;
		byte i_1442_ = 0;
		if (i != -1) {
			Class169 class169 = interface22.method144(i & 0xffff, -1809598695);
			i_1441_ = class169.aByte2079;
			i_1442_ = class169.aByte2080;
		}
		byte i_1443_ = 0;
		byte i_1444_ = 0;
		if (i_1439_ != -1) {
			Class169 class169 = interface22.method144(i_1439_ & 0xffff, -2110622212);
			i_1443_ = class169.aByte2079;
			i_1444_ = class169.aByte2080;
			if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
				((Class528_Sub1) this).aBool8246 = true;
		}
		if (i_1441_ != i_1443_ | i_1442_ != i_1444_) {
			if (((Class528_Sub1) this).aClass162Array8295 != null) {
				for (int i_1445_ = 0; i_1445_ < ((Class528_Sub1) this).anInt8294; i_1445_++) {
					Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i_1445_];
					Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i_1445_];
					((Class145) class145).anInt1714 = (((Class145) class145).anInt1714 & ~0xffffff | ((Class540.anIntArray7136[(((Class528_Sub1) this).aShortArray8260[((Class162) class162).anInt2023]) & 0xffff]) & 0xffffff));
				}
			}
			if (((Class528_Sub1) this).aClass143_8273 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		}
	}

	public boolean dv() {
		return ((Class528_Sub1) this).aBool8245;
	}

	void method11308() {
		/* empty */
	}

	void method11301() {
		/* empty */
	}

	public boolean method11309(int i, int i_1446_, Matrix44Var class294, boolean bool, int i_1447_) {
		Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
		class384.method6522(class294);
		class384.method6523(((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8394);
		boolean bool_1448_ = false;
		int i_1449_ = 2147483647;
		int i_1450_ = -2147483648;
		int i_1451_ = 2147483647;
		int i_1452_ = -2147483648;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i_1453_ = ((((Class528_Sub1) this).aShort8286 - ((Class528_Sub1) this).aShort8285) >> 1);
		int i_1454_ = ((((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283) >> 1);
		int i_1455_ = ((((Class528_Sub1) this).aShort8306 - ((Class528_Sub1) this).aShort8287) >> 1);
		int i_1456_ = ((Class528_Sub1) this).aShort8285 + i_1453_;
		int i_1457_ = ((Class528_Sub1) this).aShort8283 + i_1454_;
		int i_1458_ = ((Class528_Sub1) this).aShort8287 + i_1455_;
		int i_1459_ = i_1456_ - (i_1453_ << i_1447_);
		int i_1460_ = i_1457_ - (i_1454_ << i_1447_);
		int i_1461_ = i_1458_ - (i_1455_ << i_1447_);
		int i_1462_ = i_1456_ + (i_1453_ << i_1447_);
		int i_1463_ = i_1457_ + (i_1454_ << i_1447_);
		int i_1464_ = i_1458_ + (i_1455_ << i_1447_);
		anIntArray8296[0] = i_1459_;
		anIntArray8301[0] = i_1460_;
		anIntArray8268[0] = i_1461_;
		anIntArray8296[1] = i_1462_;
		anIntArray8301[1] = i_1460_;
		anIntArray8268[1] = i_1461_;
		anIntArray8296[2] = i_1459_;
		anIntArray8301[2] = i_1463_;
		anIntArray8268[2] = i_1461_;
		anIntArray8296[3] = i_1462_;
		anIntArray8301[3] = i_1463_;
		anIntArray8268[3] = i_1461_;
		anIntArray8296[4] = i_1459_;
		anIntArray8301[4] = i_1460_;
		anIntArray8268[4] = i_1464_;
		anIntArray8296[5] = i_1462_;
		anIntArray8301[5] = i_1460_;
		anIntArray8268[5] = i_1464_;
		anIntArray8296[6] = i_1459_;
		anIntArray8301[6] = i_1463_;
		anIntArray8268[6] = i_1464_;
		anIntArray8296[7] = i_1462_;
		anIntArray8301[7] = i_1463_;
		anIntArray8268[7] = i_1464_;
		for (int i_1465_ = 0; i_1465_ < 8; i_1465_++) {
			int i_1466_ = anIntArray8296[i_1465_];
			int i_1467_ = anIntArray8301[i_1465_];
			int i_1468_ = anIntArray8268[i_1465_];
			float f = (class384.buf[2] * (float) i_1466_ + class384.buf[6] * (float) i_1467_ + class384.buf[10] * (float) i_1468_ + class384.buf[14]);
			float f_1469_ = (class384.buf[3] * (float) i_1466_ + class384.buf[7] * (float) i_1467_ + class384.buf[11] * (float) i_1468_ + class384.buf[15]);
			if (f >= -f_1469_) {
				float f_1470_ = (class384.buf[0] * (float) i_1466_ + class384.buf[4] * (float) i_1467_ + class384.buf[8] * (float) i_1468_ + class384.buf[12]);
				float f_1471_ = (class384.buf[1] * (float) i_1466_ + class384.buf[5] * (float) i_1467_ + class384.buf[9] * (float) i_1468_ + class384.buf[13]);
				int i_1472_ = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8315) + (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8398) * f_1470_ / f_1469_);
				int i_1473_ = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8399) + (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8400) * f_1471_ / f_1469_);
				if (i_1472_ < i_1449_)
					i_1449_ = i_1472_;
				if (i_1472_ > i_1450_)
					i_1450_ = i_1472_;
				if (i_1473_ < i_1451_)
					i_1451_ = i_1473_;
				if (i_1473_ > i_1452_)
					i_1452_ = i_1473_;
				bool_1448_ = true;
			}
		}
		if (bool_1448_ && i > i_1449_ && i < i_1450_ && i_1446_ > i_1451_ && i_1446_ < i_1452_) {
			if (bool)
				return true;
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500).length < ((Class528_Sub1) this).anInt8300) {
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500 = new int[((Class528_Sub1) this).anInt8300];
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501 = new int[((Class528_Sub1) this).anInt8300];
			}
			int[] is = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500);
			int[] is_1474_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501);
			for (int i_1475_ = 0; i_1475_ < ((Class528_Sub1) this).anInt8248; i_1475_++) {
				int i_1476_ = ((Class528_Sub1) this).anIntArray8249[i_1475_];
				int i_1477_ = ((Class528_Sub1) this).anIntArray8250[i_1475_];
				int i_1478_ = ((Class528_Sub1) this).anIntArray8251[i_1475_];
				float f = (class384.buf[2] * (float) i_1476_ + class384.buf[6] * (float) i_1477_ + class384.buf[10] * (float) i_1478_ + class384.buf[14]);
				float f_1479_ = (class384.buf[3] * (float) i_1476_ + class384.buf[7] * (float) i_1477_ + class384.buf[11] * (float) i_1478_ + class384.buf[15]);
				if (f >= -f_1479_) {
					float f_1480_ = (class384.buf[0] * (float) i_1476_ + class384.buf[4] * (float) i_1477_ + class384.buf[8] * (float) i_1478_ + class384.buf[12]);
					float f_1481_ = (class384.buf[1] * (float) i_1476_ + class384.buf[5] * (float) i_1477_ + class384.buf[9] * (float) i_1478_ + class384.buf[13]);
					int i_1482_ = ((Class528_Sub1) this).anIntArray8290[i_1475_];
					int i_1483_ = ((Class528_Sub1) this).anIntArray8290[i_1475_ + 1];
					for (int i_1484_ = i_1482_; i_1484_ < i_1483_; i_1484_++) {
						int i_1485_ = (((Class528_Sub1) this).aShortArray8288[i_1484_] - 1);
						if (i_1485_ == -1)
							break;
						is[i_1485_] = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_1480_ / f_1479_));
						is_1474_[i_1485_] = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_1481_ / f_1479_));
					}
				} else {
					int i_1486_ = ((Class528_Sub1) this).anIntArray8290[i_1475_];
					int i_1487_ = ((Class528_Sub1) this).anIntArray8290[i_1475_ + 1];
					for (int i_1488_ = i_1486_; i_1488_ < i_1487_; i_1488_++) {
						int i_1489_ = (((Class528_Sub1) this).aShortArray8288[i_1488_] - 1);
						if (i_1489_ == -1)
							break;
						is[((Class528_Sub1) this).aShortArray8288[i_1488_] - 1] = -999999;
					}
				}
			}
			for (int i_1490_ = 0; i_1490_ < ((Class528_Sub1) this).anInt8262; i_1490_++) {
				if ((is[((Class528_Sub1) this).aShortArray8266[i_1490_]] != -999999) && (is[((Class528_Sub1) this).aShortArray8267[i_1490_]] != -999999) && (is[((Class528_Sub1) this).aShortArray8256[i_1490_]] != -999999)
						&& method13532(i, i_1446_, is_1474_[(((Class528_Sub1) this).aShortArray8266[i_1490_])], is_1474_[(((Class528_Sub1) this).aShortArray8267[i_1490_])], is_1474_[(((Class528_Sub1) this).aShortArray8256[i_1490_])], is[(((Class528_Sub1) this).aShortArray8266[i_1490_])], is[(((Class528_Sub1) this).aShortArray8267[i_1490_])], is[(((Class528_Sub1) this).aShortArray8256[i_1490_])]))
					return true;
			}
		}
		return false;
	}

	public int du() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).anInt8280;
	}

	boolean method13556(int i, int i_1491_, int i_1492_, int i_1493_, int i_1494_, int i_1495_, int i_1496_, int i_1497_) {
		if (i_1491_ < i_1492_ && i_1491_ < i_1493_ && i_1491_ < i_1494_)
			return false;
		if (i_1491_ > i_1492_ && i_1491_ > i_1493_ && i_1491_ > i_1494_)
			return false;
		if (i < i_1495_ && i < i_1496_ && i < i_1497_)
			return false;
		if (i > i_1495_ && i > i_1496_ && i > i_1497_)
			return false;
		return true;
	}

	public Class282_Sub50_Sub17 ga(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub1) this).anInt8300 == 0)
			return null;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i;
		int i_1498_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) > 0) {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1498_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1498_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1499_;
		int i_1500_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8439) > 0) {
			i_1499_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1500_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i_1499_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1500_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1501_ = i_1498_ - i + 1;
		int i_1502_ = i_1500_ - i_1499_ + 1;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_1503_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_1501_, i_1502_)) {
			class282_sub50_sub17_sub1_1503_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_1503_.method15712();
		} else
			class282_sub50_sub17_sub1_1503_ = new Class282_Sub50_Sub17_Sub1((((Class528_Sub1) this).aClass505_Sub1_8239), i_1501_, i_1502_);
		class282_sub50_sub17_sub1_1503_.method15721(i, i_1499_, i_1498_, i_1500_);
		method13522(class282_sub50_sub17_sub1_1503_);
		return class282_sub50_sub17_sub1_1503_;
	}

	static final int method13557(int i, int i_1504_) {
		i_1504_ = i_1504_ * (i & 0x7f) >> 7;
		if (i_1504_ < 2)
			i_1504_ = 2;
		else if (i_1504_ > 126)
			i_1504_ = 126;
		return (i & 0xff80) + i_1504_;
	}

	public int c() {
		return ((Class528_Sub1) this).aShort8243;
	}

	public boolean method11286(int i, int i_1505_, Matrix44Var class294, boolean bool, int i_1506_) {
		Matrix44Arr class384 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8380);
		class384.method6522(class294);
		class384.method6523(((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8394);
		boolean bool_1507_ = false;
		int i_1508_ = 2147483647;
		int i_1509_ = -2147483648;
		int i_1510_ = 2147483647;
		int i_1511_ = -2147483648;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i_1512_ = ((((Class528_Sub1) this).aShort8286 - ((Class528_Sub1) this).aShort8285) >> 1);
		int i_1513_ = ((((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283) >> 1);
		int i_1514_ = ((((Class528_Sub1) this).aShort8306 - ((Class528_Sub1) this).aShort8287) >> 1);
		int i_1515_ = ((Class528_Sub1) this).aShort8285 + i_1512_;
		int i_1516_ = ((Class528_Sub1) this).aShort8283 + i_1513_;
		int i_1517_ = ((Class528_Sub1) this).aShort8287 + i_1514_;
		int i_1518_ = i_1515_ - (i_1512_ << i_1506_);
		int i_1519_ = i_1516_ - (i_1513_ << i_1506_);
		int i_1520_ = i_1517_ - (i_1514_ << i_1506_);
		int i_1521_ = i_1515_ + (i_1512_ << i_1506_);
		int i_1522_ = i_1516_ + (i_1513_ << i_1506_);
		int i_1523_ = i_1517_ + (i_1514_ << i_1506_);
		anIntArray8296[0] = i_1518_;
		anIntArray8301[0] = i_1519_;
		anIntArray8268[0] = i_1520_;
		anIntArray8296[1] = i_1521_;
		anIntArray8301[1] = i_1519_;
		anIntArray8268[1] = i_1520_;
		anIntArray8296[2] = i_1518_;
		anIntArray8301[2] = i_1522_;
		anIntArray8268[2] = i_1520_;
		anIntArray8296[3] = i_1521_;
		anIntArray8301[3] = i_1522_;
		anIntArray8268[3] = i_1520_;
		anIntArray8296[4] = i_1518_;
		anIntArray8301[4] = i_1519_;
		anIntArray8268[4] = i_1523_;
		anIntArray8296[5] = i_1521_;
		anIntArray8301[5] = i_1519_;
		anIntArray8268[5] = i_1523_;
		anIntArray8296[6] = i_1518_;
		anIntArray8301[6] = i_1522_;
		anIntArray8268[6] = i_1523_;
		anIntArray8296[7] = i_1521_;
		anIntArray8301[7] = i_1522_;
		anIntArray8268[7] = i_1523_;
		for (int i_1524_ = 0; i_1524_ < 8; i_1524_++) {
			int i_1525_ = anIntArray8296[i_1524_];
			int i_1526_ = anIntArray8301[i_1524_];
			int i_1527_ = anIntArray8268[i_1524_];
			float f = (class384.buf[2] * (float) i_1525_ + class384.buf[6] * (float) i_1526_ + class384.buf[10] * (float) i_1527_ + class384.buf[14]);
			float f_1528_ = (class384.buf[3] * (float) i_1525_ + class384.buf[7] * (float) i_1526_ + class384.buf[11] * (float) i_1527_ + class384.buf[15]);
			if (f >= -f_1528_) {
				float f_1529_ = (class384.buf[0] * (float) i_1525_ + class384.buf[4] * (float) i_1526_ + class384.buf[8] * (float) i_1527_ + class384.buf[12]);
				float f_1530_ = (class384.buf[1] * (float) i_1525_ + class384.buf[5] * (float) i_1526_ + class384.buf[9] * (float) i_1527_ + class384.buf[13]);
				int i_1531_ = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8315) + (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8398) * f_1529_ / f_1528_);
				int i_1532_ = (int) ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8399) + (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8400) * f_1530_ / f_1528_);
				if (i_1531_ < i_1508_)
					i_1508_ = i_1531_;
				if (i_1531_ > i_1509_)
					i_1509_ = i_1531_;
				if (i_1532_ < i_1510_)
					i_1510_ = i_1532_;
				if (i_1532_ > i_1511_)
					i_1511_ = i_1532_;
				bool_1507_ = true;
			}
		}
		if (bool_1507_ && i > i_1508_ && i < i_1509_ && i_1505_ > i_1510_ && i_1505_ < i_1511_) {
			if (bool)
				return true;
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500).length < ((Class528_Sub1) this).anInt8300) {
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500 = new int[((Class528_Sub1) this).anInt8300];
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501 = new int[((Class528_Sub1) this).anInt8300];
			}
			int[] is = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8500);
			int[] is_1533_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anIntArray8501);
			for (int i_1534_ = 0; i_1534_ < ((Class528_Sub1) this).anInt8248; i_1534_++) {
				int i_1535_ = ((Class528_Sub1) this).anIntArray8249[i_1534_];
				int i_1536_ = ((Class528_Sub1) this).anIntArray8250[i_1534_];
				int i_1537_ = ((Class528_Sub1) this).anIntArray8251[i_1534_];
				float f = (class384.buf[2] * (float) i_1535_ + class384.buf[6] * (float) i_1536_ + class384.buf[10] * (float) i_1537_ + class384.buf[14]);
				float f_1538_ = (class384.buf[3] * (float) i_1535_ + class384.buf[7] * (float) i_1536_ + class384.buf[11] * (float) i_1537_ + class384.buf[15]);
				if (f >= -f_1538_) {
					float f_1539_ = (class384.buf[0] * (float) i_1535_ + class384.buf[4] * (float) i_1536_ + class384.buf[8] * (float) i_1537_ + class384.buf[12]);
					float f_1540_ = (class384.buf[1] * (float) i_1535_ + class384.buf[5] * (float) i_1536_ + class384.buf[9] * (float) i_1537_ + class384.buf[13]);
					int i_1541_ = ((Class528_Sub1) this).anIntArray8290[i_1534_];
					int i_1542_ = ((Class528_Sub1) this).anIntArray8290[i_1534_ + 1];
					for (int i_1543_ = i_1541_; i_1543_ < i_1542_; i_1543_++) {
						int i_1544_ = (((Class528_Sub1) this).aShortArray8288[i_1543_] - 1);
						if (i_1544_ == -1)
							break;
						is[i_1544_] = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8315) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8398 * f_1539_ / f_1538_));
						is_1533_[i_1544_] = (int) ((((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8399) + (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8400 * f_1540_ / f_1538_));
					}
				} else {
					int i_1545_ = ((Class528_Sub1) this).anIntArray8290[i_1534_];
					int i_1546_ = ((Class528_Sub1) this).anIntArray8290[i_1534_ + 1];
					for (int i_1547_ = i_1545_; i_1547_ < i_1546_; i_1547_++) {
						int i_1548_ = (((Class528_Sub1) this).aShortArray8288[i_1547_] - 1);
						if (i_1548_ == -1)
							break;
						is[((Class528_Sub1) this).aShortArray8288[i_1547_] - 1] = -999999;
					}
				}
			}
			for (int i_1549_ = 0; i_1549_ < ((Class528_Sub1) this).anInt8262; i_1549_++) {
				if ((is[((Class528_Sub1) this).aShortArray8266[i_1549_]] != -999999) && (is[((Class528_Sub1) this).aShortArray8267[i_1549_]] != -999999) && (is[((Class528_Sub1) this).aShortArray8256[i_1549_]] != -999999)
						&& method13532(i, i_1505_, is_1533_[(((Class528_Sub1) this).aShortArray8266[i_1549_])], is_1533_[(((Class528_Sub1) this).aShortArray8267[i_1549_])], is_1533_[(((Class528_Sub1) this).aShortArray8256[i_1549_])], is[(((Class528_Sub1) this).aShortArray8266[i_1549_])], is[(((Class528_Sub1) this).aShortArray8267[i_1549_])], is[(((Class528_Sub1) this).aShortArray8256[i_1549_])]))
					return true;
			}
		}
		return false;
	}

	public Class282_Sub50_Sub17 dw(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub1) this).anInt8300 == 0)
			return null;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i;
		int i_1550_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) > 0) {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1550_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1550_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1551_;
		int i_1552_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8439) > 0) {
			i_1551_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1552_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i_1551_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1552_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1553_ = i_1550_ - i + 1;
		int i_1554_ = i_1552_ - i_1551_ + 1;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_1555_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_1553_, i_1554_)) {
			class282_sub50_sub17_sub1_1555_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_1555_.method15712();
		} else
			class282_sub50_sub17_sub1_1555_ = new Class282_Sub50_Sub17_Sub1((((Class528_Sub1) this).aClass505_Sub1_8239), i_1553_, i_1554_);
		class282_sub50_sub17_sub1_1555_.method15721(i, i_1551_, i_1550_, i_1552_);
		method13522(class282_sub50_sub17_sub1_1555_);
		return class282_sub50_sub17_sub1_1555_;
	}

	public Class282_Sub50_Sub17 dr(Class282_Sub50_Sub17 class282_sub50_sub17) {
		if (((Class528_Sub1) this).anInt8300 == 0)
			return null;
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i;
		int i_1556_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) > 0) {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1556_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i = ((((Class528_Sub1) this).aShort8285 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1556_ = ((((Class528_Sub1) this).aShort8286 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8438) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1557_;
		int i_1558_;
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8439) > 0) {
			i_1557_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1558_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		} else {
			i_1557_ = ((((Class528_Sub1) this).aShort8287 - ((((Class528_Sub1) this).aShort8283 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
			i_1558_ = ((((Class528_Sub1) this).aShort8306 - ((((Class528_Sub1) this).aShort8284 * ((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).anInt8439) >> 8)) >> ((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).anInt8473);
		}
		int i_1559_ = i_1556_ - i + 1;
		int i_1560_ = i_1558_ - i_1557_ + 1;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1_1561_;
		if (class282_sub50_sub17_sub1 != null && class282_sub50_sub17_sub1.method15716(i_1559_, i_1560_)) {
			class282_sub50_sub17_sub1_1561_ = class282_sub50_sub17_sub1;
			class282_sub50_sub17_sub1_1561_.method15712();
		} else
			class282_sub50_sub17_sub1_1561_ = new Class282_Sub50_Sub17_Sub1((((Class528_Sub1) this).aClass505_Sub1_8239), i_1559_, i_1560_);
		class282_sub50_sub17_sub1_1561_.method15721(i, i_1557_, i_1556_, i_1558_);
		method13522(class282_sub50_sub17_sub1_1561_);
		return class282_sub50_sub17_sub1_1561_;
	}

	void method13558() {
		if (((Class528_Sub1) this).anInt8302 != 0) {
			if (((Class528_Sub1) this).aByte8242 != 0)
				method13537(true);
			method13537(false);
			if (((Class528_Sub1) this).aClass132_8276 != null) {
				if ((((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) == null)
					method13536((((Class528_Sub1) this).aByte8242 & 0x10) != 0);
				if ((((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) != null) {
					((Class528_Sub1) this).aClass505_Sub1_8239.method13620(((Class528_Sub1) this).aClass143_8274 != null);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13647(((Class528_Sub1) this).aClass143_8272, ((Class528_Sub1) this).aClass143_8274, ((Class528_Sub1) this).aClass143_8273, ((Class528_Sub1) this).aClass143_8275);
					int i = ((Class528_Sub1) this).anIntArray8289.length - 1;
					for (int i_1562_ = 0; i_1562_ < i; i_1562_++) {
						int i_1563_ = ((Class528_Sub1) this).anIntArray8289[i_1562_];
						int i_1564_ = (((Class528_Sub1) this).anIntArray8289[i_1562_ + 1]);
						int i_1565_ = (((Class528_Sub1) this).aShortArray8269[i_1563_] & 0xffff);
						if (i_1565_ == 65535)
							i_1565_ = -1;
						((Class528_Sub1) this).aClass505_Sub1_8239.method13608(i_1565_, ((Class528_Sub1) this).aClass143_8274 != null);
						((Class528_Sub1) this).aClass505_Sub1_8239.method13611(((Class132) (((Class528_Sub1) this).aClass132_8276)).anInterface15_1595, 4, i_1563_ * 3, (i_1564_ - i_1563_) * 3);
					}
				}
			}
			method13525();
		}
	}

	void method13559() {
		if (((Class528_Sub1) this).anInt8302 != 0) {
			if (((Class528_Sub1) this).aByte8242 != 0)
				method13537(true);
			method13537(false);
			if (((Class528_Sub1) this).aClass132_8276 != null) {
				if ((((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) == null)
					method13536((((Class528_Sub1) this).aByte8242 & 0x10) != 0);
				if ((((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595) != null) {
					((Class528_Sub1) this).aClass505_Sub1_8239.method13620(((Class528_Sub1) this).aClass143_8274 != null);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13647(((Class528_Sub1) this).aClass143_8272, ((Class528_Sub1) this).aClass143_8274, ((Class528_Sub1) this).aClass143_8273, ((Class528_Sub1) this).aClass143_8275);
					int i = ((Class528_Sub1) this).anIntArray8289.length - 1;
					for (int i_1566_ = 0; i_1566_ < i; i_1566_++) {
						int i_1567_ = ((Class528_Sub1) this).anIntArray8289[i_1566_];
						int i_1568_ = (((Class528_Sub1) this).anIntArray8289[i_1566_ + 1]);
						int i_1569_ = (((Class528_Sub1) this).aShortArray8269[i_1567_] & 0xffff);
						if (i_1569_ == 65535)
							i_1569_ = -1;
						((Class528_Sub1) this).aClass505_Sub1_8239.method13608(i_1569_, ((Class528_Sub1) this).aClass143_8274 != null);
						((Class528_Sub1) this).aClass505_Sub1_8239.method13611(((Class132) (((Class528_Sub1) this).aClass132_8276)).anInterface15_1595, 4, i_1567_ * 3, (i_1568_ - i_1567_) * 3);
					}
				}
			}
			method13525();
		}
	}

	void method13560(Matrix44Arr class384) {
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			Matrix44Arr class384_1570_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8361);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13576();
			((Class528_Sub1) this).aClass505_Sub1_8239.RA(!((Class528_Sub1) this).aBool8245);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13620(false);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13647((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass143_8494), null, null, (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass143_8495));
			for (int i = 0; i < ((Class528_Sub1) this).anInt8294; i++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i];
				if (!((Class162) class162).aBool2018 || !((Class528_Sub1) this).aClass505_Sub1_8239.method8471()) {
					float f = ((float) ((((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_1571_ = ((float) ((((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_1572_ = ((float) ((((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_1573_ = (class384.buf[0] * f + class384.buf[4] * f_1571_ + class384.buf[8] * f_1572_ + class384.buf[12]);
					float f_1574_ = (class384.buf[1] * f + class384.buf[5] * f_1571_ + class384.buf[9] * f_1572_ + class384.buf[13]);
					float f_1575_ = (class384.buf[2] * f + class384.buf[6] * f_1571_ + class384.buf[10] * f_1572_ + class384.buf[14]);
					float f_1576_ = ((float) (1.0 / Math.sqrt((double) (f_1573_ * f_1573_ + f_1574_ * f_1574_ + (f_1575_ * f_1575_)))) * (float) ((Class162) class162).anInt2025);
					class384_1570_.method6549(((Class145) class145).anInt1712, (((Class145) class145).anInt1710 * ((Class162) class162).aShort2020) >> 7, (((Class145) class145).anInt1711 * ((Class162) class162).aShort2016) >> 7, (f_1573_ + (float) ((Class145) class145).anInt1709 - f_1573_ * f_1576_), (f_1574_ + (float) ((Class145) class145).anInt1713 - f_1574_ * f_1576_), f_1575_ - f_1575_ * f_1576_);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13585(class384_1570_);
					int i_1577_ = ((Class145) class145).anInt1714;
					OpenGL.glColor4ub((byte) (i_1577_ >> 16), (byte) (i_1577_ >> 8), (byte) i_1577_, (byte) (i_1577_ >> 24));
					((Class528_Sub1) this).aClass505_Sub1_8239.method13581(((Class162) class162).aShort2022);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13624(((Class162) class162).aByte2024);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13603(7, 0, 4);
				}
			}
			((Class528_Sub1) this).aClass505_Sub1_8239.RA(true);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13641();
		}
	}

	void method13561(Matrix44Arr class384) {
		if (((Class528_Sub1) this).aClass162Array8295 != null) {
			Matrix44Arr class384_1578_ = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass384_8361);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13576();
			((Class528_Sub1) this).aClass505_Sub1_8239.RA(!((Class528_Sub1) this).aBool8245);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13620(false);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13647((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass143_8494), null, null, (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass143_8495));
			for (int i = 0; i < ((Class528_Sub1) this).anInt8294; i++) {
				Class162 class162 = ((Class528_Sub1) this).aClass162Array8295[i];
				Class145 class145 = ((Class528_Sub1) this).aClass145Array8258[i];
				if (!((Class162) class162).aBool2018 || !((Class528_Sub1) this).aClass505_Sub1_8239.method8471()) {
					float f = ((float) ((((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8249[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_1579_ = ((float) ((((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8250[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_1580_ = ((float) ((((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2017]) + (((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2019]) + (((Class528_Sub1) this).anIntArray8251[((Class162) class162).anInt2021])) * 0.3333333F);
					float f_1581_ = (class384.buf[0] * f + class384.buf[4] * f_1579_ + class384.buf[8] * f_1580_ + class384.buf[12]);
					float f_1582_ = (class384.buf[1] * f + class384.buf[5] * f_1579_ + class384.buf[9] * f_1580_ + class384.buf[13]);
					float f_1583_ = (class384.buf[2] * f + class384.buf[6] * f_1579_ + class384.buf[10] * f_1580_ + class384.buf[14]);
					float f_1584_ = ((float) (1.0 / Math.sqrt((double) (f_1581_ * f_1581_ + f_1582_ * f_1582_ + (f_1583_ * f_1583_)))) * (float) ((Class162) class162).anInt2025);
					class384_1578_.method6549(((Class145) class145).anInt1712, (((Class145) class145).anInt1710 * ((Class162) class162).aShort2020) >> 7, (((Class145) class145).anInt1711 * ((Class162) class162).aShort2016) >> 7, (f_1581_ + (float) ((Class145) class145).anInt1709 - f_1581_ * f_1584_), (f_1582_ + (float) ((Class145) class145).anInt1713 - f_1582_ * f_1584_), f_1583_ - f_1583_ * f_1584_);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13585(class384_1578_);
					int i_1585_ = ((Class145) class145).anInt1714;
					OpenGL.glColor4ub((byte) (i_1585_ >> 16), (byte) (i_1585_ >> 8), (byte) i_1585_, (byte) (i_1585_ >> 24));
					((Class528_Sub1) this).aClass505_Sub1_8239.method13581(((Class162) class162).aShort2022);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13624(((Class162) class162).aByte2024);
					((Class528_Sub1) this).aClass505_Sub1_8239.method13603(7, 0, 4);
				}
			}
			((Class528_Sub1) this).aClass505_Sub1_8239.RA(true);
			((Class528_Sub1) this).aClass505_Sub1_8239.method13641();
		}
	}

	void method13562(boolean bool) {
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8302 * 6)
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8302 + 100) * 6);
		else
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
		if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8266[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8267[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8256[i]), 1417031095);
			}
		} else {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8266[i]), (byte) -113);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8267[i]), (byte) -65);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8256[i]), (byte) -62);
			}
		}
		if (class282_sub35_sub1.index * -1990677291 != 0) {
			if (bool) {
				if (((Class528_Sub1) this).anInterface15_8277 == null)
					((Class528_Sub1) this).anInterface15_8277 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface15_8277.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = ((Class528_Sub1) this).anInterface15_8277;
			} else
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
			if (!bool)
				((Class528_Sub1) this).aBool8279 = true;
		}
	}

	void method13563(boolean bool) {
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8302 * 6)
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8302 + 100) * 6);
		else
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
		if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8266[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8267[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8256[i]), 1417031095);
			}
		} else {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8266[i]), (byte) -84);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8267[i]), (byte) -82);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8256[i]), (byte) 48);
			}
		}
		if (class282_sub35_sub1.index * -1990677291 != 0) {
			if (bool) {
				if (((Class528_Sub1) this).anInterface15_8277 == null)
					((Class528_Sub1) this).anInterface15_8277 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface15_8277.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = ((Class528_Sub1) this).anInterface15_8277;
			} else
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
			if (!bool)
				((Class528_Sub1) this).aBool8279 = true;
		}
	}

	void method13564(boolean bool) {
		if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8302 * 6)
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8302 + 100) * 6);
		else
			((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
		if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8266[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8267[i]), 1417031095);
				class282_sub35_sub1.writeShort((((Class528_Sub1) this).aShortArray8256[i]), 1417031095);
			}
		} else {
			for (int i = 0; i < ((Class528_Sub1) this).anInt8302; i++) {
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8266[i]), (byte) -60);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8267[i]), (byte) -119);
				class282_sub35_sub1.writeLEShort((((Class528_Sub1) this).aShortArray8256[i]), (byte) -17);
			}
		}
		if (class282_sub35_sub1.index * -1990677291 != 0) {
			if (bool) {
				if (((Class528_Sub1) this).anInterface15_8277 == null)
					((Class528_Sub1) this).anInterface15_8277 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface15_8277.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = ((Class528_Sub1) this).anInterface15_8277;
			} else
				((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13598(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
			if (!bool)
				((Class528_Sub1) this).aBool8279 = true;
		}
	}

	void method13565(boolean bool) {
		boolean bool_1586_ = (((Class528_Sub1) this).aClass143_8273 != null && (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) == null);
		boolean bool_1587_ = (((Class528_Sub1) this).aClass143_8274 != null && (((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) == null);
		boolean bool_1588_ = (((Class528_Sub1) this).aClass143_8272 != null && (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) == null);
		boolean bool_1589_ = (((Class528_Sub1) this).aClass143_8275 != null && (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) == null);
		if (bool) {
			bool_1586_ = bool_1586_ & (((Class528_Sub1) this).aByte8242 & 0x2) != 0;
			bool_1587_ = bool_1587_ & (((Class528_Sub1) this).aByte8242 & 0x4) != 0;
			bool_1588_ = bool_1588_ & (((Class528_Sub1) this).aByte8242 & 0x1) != 0;
			bool_1589_ = bool_1589_ & (((Class528_Sub1) this).aByte8242 & 0x8) != 0;
		}
		byte i = 0;
		byte i_1590_ = 0;
		byte i_1591_ = 0;
		byte i_1592_ = 0;
		byte i_1593_ = 0;
		if (bool_1588_) {
			i_1590_ = i;
			i += 12;
		}
		if (bool_1586_) {
			i_1591_ = i;
			i += 4;
		}
		if (bool_1587_) {
			i_1592_ = i;
			i += 12;
		}
		if (bool_1589_) {
			i_1593_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8300 * i)
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8300 + 100) * i);
			else
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
			if (bool_1588_) {
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1594_ = 0; i_1594_ < ((Class528_Sub1) this).anInt8248; i_1594_++) {
						int i_1595_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_1594_]);
						int i_1596_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_1594_]);
						int i_1597_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_1594_]);
						int i_1598_ = ((Class528_Sub1) this).anIntArray8290[i_1594_];
						int i_1599_ = (((Class528_Sub1) this).anIntArray8290[i_1594_ + 1]);
						for (int i_1600_ = i_1598_; i_1600_ < i_1599_; i_1600_++) {
							int i_1601_ = ((((Class528_Sub1) this).aShortArray8288[i_1600_]) - 1);
							if (i_1601_ == -1)
								break;
							class282_sub35_sub1.index = i_1601_ * i * -1115476867;
							class282_sub35_sub1.writeInt(i_1595_);
							class282_sub35_sub1.writeInt(i_1596_);
							class282_sub35_sub1.writeInt(i_1597_);
						}
					}
				} else {
					for (int i_1602_ = 0; i_1602_ < ((Class528_Sub1) this).anInt8248; i_1602_++) {
						int i_1603_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_1602_]);
						int i_1604_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_1602_]);
						int i_1605_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_1602_]);
						int i_1606_ = ((Class528_Sub1) this).anIntArray8290[i_1602_];
						int i_1607_ = (((Class528_Sub1) this).anIntArray8290[i_1602_ + 1]);
						for (int i_1608_ = i_1606_; i_1608_ < i_1607_; i_1608_++) {
							int i_1609_ = (((((Class528_Sub1) this).aShortArray8288[i_1608_]) & 0xffff) - 1);
							if (i_1609_ == -1)
								break;
							class282_sub35_sub1.index = i_1609_ * i * -1115476867;
							class282_sub35_sub1.method13232(i_1603_, (byte) -108);
							class282_sub35_sub1.method13232(i_1604_, (byte) -97);
							class282_sub35_sub1.method13232(i_1605_, (byte) -40);
						}
					}
				}
			}
			if (bool_1586_) {
				if (((Class528_Sub1) this).aClass143_8274 == null) {
					short[] is;
					short[] is_1610_;
					short[] is_1611_;
					byte[] is_1612_;
					if (((Class528_Sub1) this).aClass166_8259 != null) {
						is = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2038;
						is_1610_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2039;
						is_1611_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2041;
						is_1612_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aByteArray2040;
					} else {
						is = ((Class528_Sub1) this).aShortArray8255;
						is_1610_ = ((Class528_Sub1) this).aShortArray8270;
						is_1611_ = ((Class528_Sub1) this).aShortArray8261;
						is_1612_ = ((Class528_Sub1) this).aByteArray8264;
					}
					float f = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArray8426[0]);
					float f_1613_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[1]);
					float f_1614_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[2]);
					float f_1615_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8432);
					float f_1616_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8433 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					float f_1617_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8434 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					for (int i_1618_ = 0; i_1618_ < ((Class528_Sub1) this).anInt8262; i_1618_++) {
						int i_1619_ = method13531((((Class528_Sub1) this).aShortArray8260[i_1618_]), (((Class528_Sub1) this).aShortArray8269[i_1618_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_1618_]));
						float f_1620_ = ((float) (i_1619_ >>> 24) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8429));
						float f_1621_ = ((float) (i_1619_ >> 16 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8430));
						float f_1622_ = ((float) (i_1619_ >> 8 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8431));
						int i_1623_ = ((Class528_Sub1) this).aShortArray8266[i_1618_];
						short i_1624_ = (short) is_1612_[i_1623_];
						float f_1625_;
						if (i_1624_ == 0)
							f_1625_ = ((f * (float) is[i_1623_] + f_1613_ * (float) is_1610_[i_1623_] + f_1614_ * (float) is_1611_[i_1623_]) * 0.0026041667F);
						else
							f_1625_ = ((f * (float) is[i_1623_] + f_1613_ * (float) is_1610_[i_1623_] + f_1614_ * (float) is_1611_[i_1623_]) / (float) (i_1624_ * 256));
						float f_1626_ = f_1615_ + f_1625_ * (f_1625_ < 0.0F ? f_1617_ : f_1616_);
						int i_1627_ = (int) (f_1620_ * f_1626_);
						if (i_1627_ < 0)
							i_1627_ = 0;
						else if (i_1627_ > 255)
							i_1627_ = 255;
						int i_1628_ = (int) (f_1621_ * f_1626_);
						if (i_1628_ < 0)
							i_1628_ = 0;
						else if (i_1628_ > 255)
							i_1628_ = 255;
						int i_1629_ = (int) (f_1622_ * f_1626_);
						if (i_1629_ < 0)
							i_1629_ = 0;
						else if (i_1629_ > 255)
							i_1629_ = 255;
						class282_sub35_sub1.index = (i_1591_ + i_1623_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1627_);
						class282_sub35_sub1.writeByte(i_1628_);
						class282_sub35_sub1.writeByte(i_1629_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1618_]) & 0xff)));
						i_1623_ = ((Class528_Sub1) this).aShortArray8267[i_1618_];
						i_1624_ = (short) is_1612_[i_1623_];
						if (i_1624_ == 0)
							f_1625_ = ((f * (float) is[i_1623_] + f_1613_ * (float) is_1610_[i_1623_] + f_1614_ * (float) is_1611_[i_1623_]) * 0.0026041667F);
						else
							f_1625_ = ((f * (float) is[i_1623_] + f_1613_ * (float) is_1610_[i_1623_] + f_1614_ * (float) is_1611_[i_1623_]) / (float) (i_1624_ * 256));
						f_1626_ = f_1615_ + f_1625_ * (f_1625_ < 0.0F ? f_1617_ : f_1616_);
						i_1627_ = (int) (f_1620_ * f_1626_);
						if (i_1627_ < 0)
							i_1627_ = 0;
						else if (i_1627_ > 255)
							i_1627_ = 255;
						i_1628_ = (int) (f_1621_ * f_1626_);
						if (i_1628_ < 0)
							i_1628_ = 0;
						else if (i_1628_ > 255)
							i_1628_ = 255;
						i_1629_ = (int) (f_1622_ * f_1626_);
						if (i_1629_ < 0)
							i_1629_ = 0;
						else if (i_1629_ > 255)
							i_1629_ = 255;
						class282_sub35_sub1.index = (i_1591_ + i_1623_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1627_);
						class282_sub35_sub1.writeByte(i_1628_);
						class282_sub35_sub1.writeByte(i_1629_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1618_]) & 0xff)));
						i_1623_ = ((Class528_Sub1) this).aShortArray8256[i_1618_];
						i_1624_ = (short) is_1612_[i_1623_];
						if (i_1624_ == 0)
							f_1625_ = ((f * (float) is[i_1623_] + f_1613_ * (float) is_1610_[i_1623_] + f_1614_ * (float) is_1611_[i_1623_]) * 0.0026041667F);
						else
							f_1625_ = ((f * (float) is[i_1623_] + f_1613_ * (float) is_1610_[i_1623_] + f_1614_ * (float) is_1611_[i_1623_]) / (float) (i_1624_ * 256));
						f_1626_ = f_1615_ + f_1625_ * (f_1625_ < 0.0F ? f_1617_ : f_1616_);
						i_1627_ = (int) (f_1620_ * f_1626_);
						if (i_1627_ < 0)
							i_1627_ = 0;
						else if (i_1627_ > 255)
							i_1627_ = 255;
						i_1628_ = (int) (f_1621_ * f_1626_);
						if (i_1628_ < 0)
							i_1628_ = 0;
						else if (i_1628_ > 255)
							i_1628_ = 255;
						i_1629_ = (int) (f_1622_ * f_1626_);
						if (i_1629_ < 0)
							i_1629_ = 0;
						else if (i_1629_ > 255)
							i_1629_ = 255;
						class282_sub35_sub1.index = (i_1591_ + i_1623_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1627_);
						class282_sub35_sub1.writeByte(i_1628_);
						class282_sub35_sub1.writeByte(i_1629_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1618_]) & 0xff)));
					}
				} else {
					for (int i_1630_ = 0; i_1630_ < ((Class528_Sub1) this).anInt8262; i_1630_++) {
						int i_1631_ = method13531((((Class528_Sub1) this).aShortArray8260[i_1630_]), (((Class528_Sub1) this).aShortArray8269[i_1630_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_1630_]));
						class282_sub35_sub1.index = (i_1591_ + ((((Class528_Sub1) this).aShortArray8266[i_1630_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1631_);
						class282_sub35_sub1.index = (i_1591_ + ((((Class528_Sub1) this).aShortArray8267[i_1630_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1631_);
						class282_sub35_sub1.index = (i_1591_ + ((((Class528_Sub1) this).aShortArray8256[i_1630_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1631_);
					}
				}
			}
			if (bool_1587_) {
				short[] is;
				short[] is_1632_;
				short[] is_1633_;
				byte[] is_1634_;
				if (((Class528_Sub1) this).aClass166_8259 != null) {
					is = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
					is_1632_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
					is_1633_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
					is_1634_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
				} else {
					is = ((Class528_Sub1) this).aShortArray8255;
					is_1632_ = ((Class528_Sub1) this).aShortArray8270;
					is_1633_ = ((Class528_Sub1) this).aShortArray8261;
					is_1634_ = ((Class528_Sub1) this).aByteArray8264;
				}
				float f = 3.0F / (float) ((Class528_Sub1) this).aShort8257;
				float f_1635_ = 3.0F / (float) (((Class528_Sub1) this).aShort8257 + ((Class528_Sub1) this).aShort8257 / 2);
				class282_sub35_sub1.index = i_1592_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1636_ = 0; i_1636_ < ((Class528_Sub1) this).anInt8300; i_1636_++) {
						int i_1637_ = is_1634_[i_1636_] & 0xff;
						if (i_1637_ == 0) {
							class282_sub35_sub1.method14688((float) is[i_1636_] * f_1635_);
							class282_sub35_sub1.method14688((float) (is_1632_[i_1636_]) * f_1635_);
							class282_sub35_sub1.method14688((float) (is_1633_[i_1636_]) * f_1635_);
						} else {
							float f_1638_ = f / (float) i_1637_;
							class282_sub35_sub1.method14688((float) is[i_1636_] * f_1638_);
							class282_sub35_sub1.method14688((float) (is_1632_[i_1636_]) * f_1638_);
							class282_sub35_sub1.method14688((float) (is_1633_[i_1636_]) * f_1638_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				} else {
					for (int i_1639_ = 0; i_1639_ < ((Class528_Sub1) this).anInt8300; i_1639_++) {
						int i_1640_ = is_1634_[i_1639_] & 0xff;
						if (i_1640_ == 0) {
							class282_sub35_sub1.method14685((float) is[i_1639_] * f_1635_);
							class282_sub35_sub1.method14685((float) (is_1632_[i_1639_]) * f_1635_);
							class282_sub35_sub1.method14685((float) (is_1633_[i_1639_]) * f_1635_);
						} else {
							float f_1641_ = f / (float) i_1640_;
							class282_sub35_sub1.method14685((float) is[i_1639_] * f_1641_);
							class282_sub35_sub1.method14685((float) (is_1632_[i_1639_]) * f_1641_);
							class282_sub35_sub1.method14685((float) (is_1633_[i_1639_]) * f_1641_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				}
			}
			if (bool_1589_) {
				class282_sub35_sub1.index = i_1593_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1642_ = 0; i_1642_ < ((Class528_Sub1) this).anInt8300; i_1642_++) {
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8297[i_1642_]);
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8292[i_1642_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				} else {
					for (int i_1643_ = 0; i_1643_ < ((Class528_Sub1) this).anInt8300; i_1643_++) {
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8297[i_1643_]);
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8292[i_1643_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				}
			}
			class282_sub35_sub1.index = i * ((Class528_Sub1) this).anInt8300 * -1115476867;
			Interface14 interface14;
			if (bool) {
				if (((Class528_Sub1) this).anInterface14_8305 == null)
					((Class528_Sub1) this).anInterface14_8305 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface14_8305.method106(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				interface14 = ((Class528_Sub1) this).anInterface14_8305;
				((Class528_Sub1) this).aByte8242 = (byte) 0;
			} else {
				interface14 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
				((Class528_Sub1) this).aBool8279 = true;
			}
			if (bool_1588_) {
				((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8272).aByte1669 = i_1590_;
			}
			if (bool_1589_) {
				((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8275).aByte1669 = i_1593_;
			}
			if (bool_1586_) {
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8273).aByte1669 = i_1591_;
			}
			if (bool_1587_) {
				((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8274).aByte1669 = i_1592_;
			}
		}
	}

	void method13566(boolean bool) {
		boolean bool_1644_ = (((Class528_Sub1) this).aClass143_8273 != null && (((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667) == null);
		boolean bool_1645_ = (((Class528_Sub1) this).aClass143_8274 != null && (((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667) == null);
		boolean bool_1646_ = (((Class528_Sub1) this).aClass143_8272 != null && (((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667) == null);
		boolean bool_1647_ = (((Class528_Sub1) this).aClass143_8275 != null && (((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667) == null);
		if (bool) {
			bool_1644_ = bool_1644_ & (((Class528_Sub1) this).aByte8242 & 0x2) != 0;
			bool_1645_ = bool_1645_ & (((Class528_Sub1) this).aByte8242 & 0x4) != 0;
			bool_1646_ = bool_1646_ & (((Class528_Sub1) this).aByte8242 & 0x1) != 0;
			bool_1647_ = bool_1647_ & (((Class528_Sub1) this).aByte8242 & 0x8) != 0;
		}
		byte i = 0;
		byte i_1648_ = 0;
		byte i_1649_ = 0;
		byte i_1650_ = 0;
		byte i_1651_ = 0;
		if (bool_1646_) {
			i_1648_ = i;
			i += 12;
		}
		if (bool_1644_) {
			i_1649_ = i;
			i += 4;
		}
		if (bool_1645_) {
			i_1650_ = i;
			i += 12;
		}
		if (bool_1647_) {
			i_1651_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.buffer).length < ((Class528_Sub1) this).anInt8300 * i)
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499 = new Class282_Sub35_Sub1((((Class528_Sub1) this).anInt8300 + 100) * i);
			else
				((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499.index = 0;
			Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aClass282_Sub35_Sub1_8499);
			if (bool_1646_) {
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1652_ = 0; i_1652_ < ((Class528_Sub1) this).anInt8248; i_1652_++) {
						int i_1653_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_1652_]);
						int i_1654_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_1652_]);
						int i_1655_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_1652_]);
						int i_1656_ = ((Class528_Sub1) this).anIntArray8290[i_1652_];
						int i_1657_ = (((Class528_Sub1) this).anIntArray8290[i_1652_ + 1]);
						for (int i_1658_ = i_1656_; i_1658_ < i_1657_; i_1658_++) {
							int i_1659_ = ((((Class528_Sub1) this).aShortArray8288[i_1658_]) - 1);
							if (i_1659_ == -1)
								break;
							class282_sub35_sub1.index = i_1659_ * i * -1115476867;
							class282_sub35_sub1.writeInt(i_1653_);
							class282_sub35_sub1.writeInt(i_1654_);
							class282_sub35_sub1.writeInt(i_1655_);
						}
					}
				} else {
					for (int i_1660_ = 0; i_1660_ < ((Class528_Sub1) this).anInt8248; i_1660_++) {
						int i_1661_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8249[i_1660_]);
						int i_1662_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8250[i_1660_]);
						int i_1663_ = Stream.floatToRawIntBits((float) ((Class528_Sub1) this).anIntArray8251[i_1660_]);
						int i_1664_ = ((Class528_Sub1) this).anIntArray8290[i_1660_];
						int i_1665_ = (((Class528_Sub1) this).anIntArray8290[i_1660_ + 1]);
						for (int i_1666_ = i_1664_; i_1666_ < i_1665_; i_1666_++) {
							int i_1667_ = (((((Class528_Sub1) this).aShortArray8288[i_1666_]) & 0xffff) - 1);
							if (i_1667_ == -1)
								break;
							class282_sub35_sub1.index = i_1667_ * i * -1115476867;
							class282_sub35_sub1.method13232(i_1661_, (byte) -65);
							class282_sub35_sub1.method13232(i_1662_, (byte) -19);
							class282_sub35_sub1.method13232(i_1663_, (byte) -2);
						}
					}
				}
			}
			if (bool_1644_) {
				if (((Class528_Sub1) this).aClass143_8274 == null) {
					short[] is;
					short[] is_1668_;
					short[] is_1669_;
					byte[] is_1670_;
					if (((Class528_Sub1) this).aClass166_8259 != null) {
						is = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2038;
						is_1668_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2039;
						is_1669_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aShortArray2041;
						is_1670_ = ((Class166) (((Class528_Sub1) this).aClass166_8259)).aByteArray2040;
					} else {
						is = ((Class528_Sub1) this).aShortArray8255;
						is_1668_ = ((Class528_Sub1) this).aShortArray8270;
						is_1669_ = ((Class528_Sub1) this).aShortArray8261;
						is_1670_ = ((Class528_Sub1) this).aByteArray8264;
					}
					float f = (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloatArray8426[0]);
					float f_1671_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[1]);
					float f_1672_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloatArray8426[2]);
					float f_1673_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8432);
					float f_1674_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8433 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					float f_1675_ = (((Class505_Sub1) (((Class528_Sub1) this).aClass505_Sub1_8239)).aFloat8434 * 768.0F / (float) ((Class528_Sub1) this).aShort8257);
					for (int i_1676_ = 0; i_1676_ < ((Class528_Sub1) this).anInt8262; i_1676_++) {
						int i_1677_ = method13531((((Class528_Sub1) this).aShortArray8260[i_1676_]), (((Class528_Sub1) this).aShortArray8269[i_1676_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_1676_]));
						float f_1678_ = ((float) (i_1677_ >>> 24) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8429));
						float f_1679_ = ((float) (i_1677_ >> 16 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8430));
						float f_1680_ = ((float) (i_1677_ >> 8 & 0xff) * (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aFloat8431));
						int i_1681_ = ((Class528_Sub1) this).aShortArray8266[i_1676_];
						short i_1682_ = (short) is_1670_[i_1681_];
						float f_1683_;
						if (i_1682_ == 0)
							f_1683_ = ((f * (float) is[i_1681_] + f_1671_ * (float) is_1668_[i_1681_] + f_1672_ * (float) is_1669_[i_1681_]) * 0.0026041667F);
						else
							f_1683_ = ((f * (float) is[i_1681_] + f_1671_ * (float) is_1668_[i_1681_] + f_1672_ * (float) is_1669_[i_1681_]) / (float) (i_1682_ * 256));
						float f_1684_ = f_1673_ + f_1683_ * (f_1683_ < 0.0F ? f_1675_ : f_1674_);
						int i_1685_ = (int) (f_1678_ * f_1684_);
						if (i_1685_ < 0)
							i_1685_ = 0;
						else if (i_1685_ > 255)
							i_1685_ = 255;
						int i_1686_ = (int) (f_1679_ * f_1684_);
						if (i_1686_ < 0)
							i_1686_ = 0;
						else if (i_1686_ > 255)
							i_1686_ = 255;
						int i_1687_ = (int) (f_1680_ * f_1684_);
						if (i_1687_ < 0)
							i_1687_ = 0;
						else if (i_1687_ > 255)
							i_1687_ = 255;
						class282_sub35_sub1.index = (i_1649_ + i_1681_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1685_);
						class282_sub35_sub1.writeByte(i_1686_);
						class282_sub35_sub1.writeByte(i_1687_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1676_]) & 0xff)));
						i_1681_ = ((Class528_Sub1) this).aShortArray8267[i_1676_];
						i_1682_ = (short) is_1670_[i_1681_];
						if (i_1682_ == 0)
							f_1683_ = ((f * (float) is[i_1681_] + f_1671_ * (float) is_1668_[i_1681_] + f_1672_ * (float) is_1669_[i_1681_]) * 0.0026041667F);
						else
							f_1683_ = ((f * (float) is[i_1681_] + f_1671_ * (float) is_1668_[i_1681_] + f_1672_ * (float) is_1669_[i_1681_]) / (float) (i_1682_ * 256));
						f_1684_ = f_1673_ + f_1683_ * (f_1683_ < 0.0F ? f_1675_ : f_1674_);
						i_1685_ = (int) (f_1678_ * f_1684_);
						if (i_1685_ < 0)
							i_1685_ = 0;
						else if (i_1685_ > 255)
							i_1685_ = 255;
						i_1686_ = (int) (f_1679_ * f_1684_);
						if (i_1686_ < 0)
							i_1686_ = 0;
						else if (i_1686_ > 255)
							i_1686_ = 255;
						i_1687_ = (int) (f_1680_ * f_1684_);
						if (i_1687_ < 0)
							i_1687_ = 0;
						else if (i_1687_ > 255)
							i_1687_ = 255;
						class282_sub35_sub1.index = (i_1649_ + i_1681_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1685_);
						class282_sub35_sub1.writeByte(i_1686_);
						class282_sub35_sub1.writeByte(i_1687_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1676_]) & 0xff)));
						i_1681_ = ((Class528_Sub1) this).aShortArray8256[i_1676_];
						i_1682_ = (short) is_1670_[i_1681_];
						if (i_1682_ == 0)
							f_1683_ = ((f * (float) is[i_1681_] + f_1671_ * (float) is_1668_[i_1681_] + f_1672_ * (float) is_1669_[i_1681_]) * 0.0026041667F);
						else
							f_1683_ = ((f * (float) is[i_1681_] + f_1671_ * (float) is_1668_[i_1681_] + f_1672_ * (float) is_1669_[i_1681_]) / (float) (i_1682_ * 256));
						f_1684_ = f_1673_ + f_1683_ * (f_1683_ < 0.0F ? f_1675_ : f_1674_);
						i_1685_ = (int) (f_1678_ * f_1684_);
						if (i_1685_ < 0)
							i_1685_ = 0;
						else if (i_1685_ > 255)
							i_1685_ = 255;
						i_1686_ = (int) (f_1679_ * f_1684_);
						if (i_1686_ < 0)
							i_1686_ = 0;
						else if (i_1686_ > 255)
							i_1686_ = 255;
						i_1687_ = (int) (f_1680_ * f_1684_);
						if (i_1687_ < 0)
							i_1687_ = 0;
						else if (i_1687_ > 255)
							i_1687_ = 255;
						class282_sub35_sub1.index = (i_1649_ + i_1681_ * i) * -1115476867;
						class282_sub35_sub1.writeByte(i_1685_);
						class282_sub35_sub1.writeByte(i_1686_);
						class282_sub35_sub1.writeByte(i_1687_);
						class282_sub35_sub1.writeByte((255 - ((((Class528_Sub1) this).aByteArray8265[i_1676_]) & 0xff)));
					}
				} else {
					for (int i_1688_ = 0; i_1688_ < ((Class528_Sub1) this).anInt8262; i_1688_++) {
						int i_1689_ = method13531((((Class528_Sub1) this).aShortArray8260[i_1688_]), (((Class528_Sub1) this).aShortArray8269[i_1688_]), ((Class528_Sub1) this).aShort8243, (((Class528_Sub1) this).aByteArray8265[i_1688_]));
						class282_sub35_sub1.index = (i_1649_ + ((((Class528_Sub1) this).aShortArray8266[i_1688_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1689_);
						class282_sub35_sub1.index = (i_1649_ + ((((Class528_Sub1) this).aShortArray8267[i_1688_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1689_);
						class282_sub35_sub1.index = (i_1649_ + ((((Class528_Sub1) this).aShortArray8256[i_1688_]) & 0xffff) * i) * -1115476867;
						class282_sub35_sub1.writeInt(i_1689_);
					}
				}
			}
			if (bool_1645_) {
				short[] is;
				short[] is_1690_;
				short[] is_1691_;
				byte[] is_1692_;
				if (((Class528_Sub1) this).aClass166_8259 != null) {
					is = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2038);
					is_1690_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2039);
					is_1691_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aShortArray2041);
					is_1692_ = (((Class166) ((Class528_Sub1) this).aClass166_8259).aByteArray2040);
				} else {
					is = ((Class528_Sub1) this).aShortArray8255;
					is_1690_ = ((Class528_Sub1) this).aShortArray8270;
					is_1691_ = ((Class528_Sub1) this).aShortArray8261;
					is_1692_ = ((Class528_Sub1) this).aByteArray8264;
				}
				float f = 3.0F / (float) ((Class528_Sub1) this).aShort8257;
				float f_1693_ = 3.0F / (float) (((Class528_Sub1) this).aShort8257 + ((Class528_Sub1) this).aShort8257 / 2);
				class282_sub35_sub1.index = i_1650_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1694_ = 0; i_1694_ < ((Class528_Sub1) this).anInt8300; i_1694_++) {
						int i_1695_ = is_1692_[i_1694_] & 0xff;
						if (i_1695_ == 0) {
							class282_sub35_sub1.method14688((float) is[i_1694_] * f_1693_);
							class282_sub35_sub1.method14688((float) (is_1690_[i_1694_]) * f_1693_);
							class282_sub35_sub1.method14688((float) (is_1691_[i_1694_]) * f_1693_);
						} else {
							float f_1696_ = f / (float) i_1695_;
							class282_sub35_sub1.method14688((float) is[i_1694_] * f_1696_);
							class282_sub35_sub1.method14688((float) (is_1690_[i_1694_]) * f_1696_);
							class282_sub35_sub1.method14688((float) (is_1691_[i_1694_]) * f_1696_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				} else {
					for (int i_1697_ = 0; i_1697_ < ((Class528_Sub1) this).anInt8300; i_1697_++) {
						int i_1698_ = is_1692_[i_1697_] & 0xff;
						if (i_1698_ == 0) {
							class282_sub35_sub1.method14685((float) is[i_1697_] * f_1693_);
							class282_sub35_sub1.method14685((float) (is_1690_[i_1697_]) * f_1693_);
							class282_sub35_sub1.method14685((float) (is_1691_[i_1697_]) * f_1693_);
						} else {
							float f_1699_ = f / (float) i_1698_;
							class282_sub35_sub1.method14685((float) is[i_1697_] * f_1699_);
							class282_sub35_sub1.method14685((float) (is_1690_[i_1697_]) * f_1699_);
							class282_sub35_sub1.method14685((float) (is_1691_[i_1697_]) * f_1699_);
						}
						class282_sub35_sub1.index += (i - 12) * -1115476867;
					}
				}
			}
			if (bool_1647_) {
				class282_sub35_sub1.index = i_1651_ * -1115476867;
				if (((Class505_Sub1) ((Class528_Sub1) this).aClass505_Sub1_8239).aBool8467) {
					for (int i_1700_ = 0; i_1700_ < ((Class528_Sub1) this).anInt8300; i_1700_++) {
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8297[i_1700_]);
						class282_sub35_sub1.method14688(((Class528_Sub1) this).aFloatArray8292[i_1700_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				} else {
					for (int i_1701_ = 0; i_1701_ < ((Class528_Sub1) this).anInt8300; i_1701_++) {
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8297[i_1701_]);
						class282_sub35_sub1.method14685(((Class528_Sub1) this).aFloatArray8292[i_1701_]);
						class282_sub35_sub1.index += (i - 8) * -1115476867;
					}
				}
			}
			class282_sub35_sub1.index = i * ((Class528_Sub1) this).anInt8300 * -1115476867;
			Interface14 interface14;
			if (bool) {
				if (((Class528_Sub1) this).anInterface14_8305 == null)
					((Class528_Sub1) this).anInterface14_8305 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, true));
				else
					((Class528_Sub1) this).anInterface14_8305.method106(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
				interface14 = ((Class528_Sub1) this).anInterface14_8305;
				((Class528_Sub1) this).aByte8242 = (byte) 0;
			} else {
				interface14 = (((Class528_Sub1) this).aClass505_Sub1_8239.method13599(i, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291, false));
				((Class528_Sub1) this).aBool8279 = true;
			}
			if (bool_1646_) {
				((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8272).aByte1669 = i_1648_;
			}
			if (bool_1647_) {
				((Class143) ((Class528_Sub1) this).aClass143_8275).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8275).aByte1669 = i_1651_;
			}
			if (bool_1644_) {
				((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8273).aByte1669 = i_1649_;
			}
			if (bool_1645_) {
				((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = interface14;
				((Class143) ((Class528_Sub1) this).aClass143_8274).aByte1669 = i_1650_;
			}
		}
	}

	public int cb() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8283;
	}

	int method13567(int i, short i_1702_, int i_1703_, byte i_1704_) {
		int i_1705_ = Class540.anIntArray7136[method13538(i, i_1703_)];
		if (i_1702_ != -1) {
			Class169 class169 = ((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834.method144(i_1702_ & 0xffff, -2020428141);
			int i_1706_ = class169.aByte2079 & 0xff;
			if (i_1706_ != 0) {
				int i_1707_;
				if (i_1703_ < 0)
					i_1707_ = 0;
				else if (i_1703_ > 127)
					i_1707_ = 16777215;
				else
					i_1707_ = 131586 * i_1703_;
				if (i_1706_ == 256)
					i_1705_ = i_1707_;
				else {
					int i_1708_ = i_1706_;
					int i_1709_ = 256 - i_1706_;
					i_1705_ = ((((i_1707_ & 0xff00ff) * i_1708_ + (i_1705_ & 0xff00ff) * i_1709_) & ~0xff00ff) + (((i_1707_ & 0xff00) * i_1708_ + (i_1705_ & 0xff00) * i_1709_) & 0xff0000)) >> 8;
				}
			}
			int i_1710_ = class169.aByte2080 & 0xff;
			if (i_1710_ != 0) {
				i_1710_ += 256;
				int i_1711_ = ((i_1705_ & 0xff0000) >> 16) * i_1710_;
				if (i_1711_ > 65535)
					i_1711_ = 65535;
				int i_1712_ = ((i_1705_ & 0xff00) >> 8) * i_1710_;
				if (i_1712_ > 65535)
					i_1712_ = 65535;
				int i_1713_ = (i_1705_ & 0xff) * i_1710_;
				if (i_1713_ > 65535)
					i_1713_ = 65535;
				i_1705_ = (i_1711_ << 8 & 0xff0000) + (i_1712_ & 0xff00) + (i_1713_ >> 8);
			}
		}
		return i_1705_ << 8 | 255 - (i_1704_ & 0xff);
	}

	int method13568(int i, short i_1714_, int i_1715_, byte i_1716_) {
		int i_1717_ = Class540.anIntArray7136[method13538(i, i_1715_)];
		if (i_1714_ != -1) {
			Class169 class169 = ((Class528_Sub1) this).aClass505_Sub1_8239.anInterface22_5834.method144(i_1714_ & 0xffff, -1850604329);
			int i_1718_ = class169.aByte2079 & 0xff;
			if (i_1718_ != 0) {
				int i_1719_;
				if (i_1715_ < 0)
					i_1719_ = 0;
				else if (i_1715_ > 127)
					i_1719_ = 16777215;
				else
					i_1719_ = 131586 * i_1715_;
				if (i_1718_ == 256)
					i_1717_ = i_1719_;
				else {
					int i_1720_ = i_1718_;
					int i_1721_ = 256 - i_1718_;
					i_1717_ = ((((i_1719_ & 0xff00ff) * i_1720_ + (i_1717_ & 0xff00ff) * i_1721_) & ~0xff00ff) + (((i_1719_ & 0xff00) * i_1720_ + (i_1717_ & 0xff00) * i_1721_) & 0xff0000)) >> 8;
				}
			}
			int i_1722_ = class169.aByte2080 & 0xff;
			if (i_1722_ != 0) {
				i_1722_ += 256;
				int i_1723_ = ((i_1717_ & 0xff0000) >> 16) * i_1722_;
				if (i_1723_ > 65535)
					i_1723_ = 65535;
				int i_1724_ = ((i_1717_ & 0xff00) >> 8) * i_1722_;
				if (i_1724_ > 65535)
					i_1724_ = 65535;
				int i_1725_ = (i_1717_ & 0xff) * i_1722_;
				if (i_1725_ > 65535)
					i_1725_ = 65535;
				i_1717_ = (i_1723_ << 8 & 0xff0000) + (i_1724_ & 0xff00) + (i_1725_ >> 8);
			}
		}
		return i_1717_ << 8 | 255 - (i_1716_ & 0xff);
	}

	public void by() {
		for (int i = 0; i < ((Class528_Sub1) this).anInt8248; i++)
			((Class528_Sub1) this).anIntArray8251[i] = -((Class528_Sub1) this).anIntArray8251[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8300; i++)
			((Class528_Sub1) this).aShortArray8261[i] = (short) -((Class528_Sub1) this).aShortArray8261[i];
		for (int i = 0; i < ((Class528_Sub1) this).anInt8262; i++) {
			short i_1726_ = ((Class528_Sub1) this).aShortArray8266[i];
			((Class528_Sub1) this).aShortArray8266[i] = ((Class528_Sub1) this).aShortArray8256[i];
			((Class528_Sub1) this).aShortArray8256[i] = i_1726_;
		}
		if (((Class528_Sub1) this).aClass143_8274 == null && ((Class528_Sub1) this).aClass143_8273 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8273).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8274 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8274).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		if (((Class528_Sub1) this).aClass132_8276 != null)
			((Class132) ((Class528_Sub1) this).aClass132_8276).anInterface15_1595 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}

	public void bc(int i, int i_1727_, Class390 class390, Class390 class390_1728_, int i_1729_, int i_1730_, int i_1731_) {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		int i_1732_ = i_1729_ + ((Class528_Sub1) this).aShort8285;
		int i_1733_ = i_1729_ + ((Class528_Sub1) this).aShort8286;
		int i_1734_ = i_1731_ + ((Class528_Sub1) this).aShort8287;
		int i_1735_ = i_1731_ + ((Class528_Sub1) this).aShort8306;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1732_ >= 0 && ((i_1733_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4776 * -1843860823) && i_1734_ >= 0 && ((i_1735_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4773 * 1826078169))) {
			if (i == 4 || i == 5) {
				if (class390_1728_ == null || (i_1732_ < 0 || ((i_1733_ + class390_1728_.anInt4774 * 750971439 >> class390_1728_.anInt4775 * 1856651955) >= class390_1728_.anInt4776 * -1843860823) || i_1734_ < 0 || ((i_1735_ + class390_1728_.anInt4774 * 750971439 >> class390_1728_.anInt4775 * 1856651955) >= class390_1728_.anInt4773 * 1826078169)))
					return;
			} else {
				i_1732_ >>= class390.anInt4775 * 1856651955;
				i_1733_ = (i_1733_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				i_1734_ >>= class390.anInt4775 * 1856651955;
				i_1735_ = (i_1735_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				if (class390.method6722(i_1732_, i_1734_, 65280) == i_1730_ && class390.method6722(i_1733_, i_1734_, 65280) == i_1730_ && class390.method6722(i_1732_, i_1735_, 65280) == i_1730_ && class390.method6722(i_1733_, i_1735_, 65280) == i_1730_)
					return;
			}
			if (i == 1) {
				for (int i_1736_ = 0; i_1736_ < ((Class528_Sub1) this).anInt8248; i_1736_++)
					((Class528_Sub1) this).anIntArray8250[i_1736_] = (((Class528_Sub1) this).anIntArray8250[i_1736_] + class390.method6709(((((Class528_Sub1) this).anIntArray8249[i_1736_]) + i_1729_), ((((Class528_Sub1) this).anIntArray8251[i_1736_]) + i_1731_), -1056184474) - i_1730_);
			} else if (i == 2) {
				int i_1737_ = ((Class528_Sub1) this).aShort8283;
				if (i_1737_ == 0)
					return;
				for (int i_1738_ = 0; i_1738_ < ((Class528_Sub1) this).anInt8248; i_1738_++) {
					int i_1739_ = ((((Class528_Sub1) this).anIntArray8250[i_1738_] << 16) / i_1737_);
					if (i_1739_ < i_1727_)
						((Class528_Sub1) this).anIntArray8250[i_1738_] = (((Class528_Sub1) this).anIntArray8250[i_1738_] + (class390.method6709((((Class528_Sub1) this).anIntArray8249[i_1738_]) + i_1729_, (((Class528_Sub1) this).anIntArray8251[i_1738_]) + i_1731_, 864936016) - i_1730_) * (i_1727_ - i_1739_) / i_1727_);
				}
			} else if (i == 3) {
				int i_1740_ = (i_1727_ & 0xff) * 4;
				int i_1741_ = (i_1727_ >> 8 & 0xff) * 4;
				int i_1742_ = (i_1727_ >> 16 & 0xff) << 6;
				int i_1743_ = (i_1727_ >> 24 & 0xff) << 6;
				if (i_1729_ - (i_1740_ >> 1) < 0 || ((i_1729_ + (i_1740_ >> 1) + class390.anInt4774 * 750971439) >= (class390.anInt4776 * -1843860823 << class390.anInt4775 * 1856651955)) || i_1731_ - (i_1741_ >> 1) < 0 || ((i_1731_ + (i_1741_ >> 1) + class390.anInt4774 * 750971439) >= (class390.anInt4773 * 1826078169 << class390.anInt4775 * 1856651955)))
					return;
				method11281(class390, i_1729_, i_1730_, i_1731_, i_1740_, i_1741_, i_1742_, i_1743_);
			} else if (i == 4) {
				int i_1744_ = (((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283);
				for (int i_1745_ = 0; i_1745_ < ((Class528_Sub1) this).anInt8248; i_1745_++)
					((Class528_Sub1) this).anIntArray8250[i_1745_] = (((Class528_Sub1) this).anIntArray8250[i_1745_] + (class390_1728_.method6709((((Class528_Sub1) this).anIntArray8249[i_1745_]) + i_1729_, (((Class528_Sub1) this).anIntArray8251[i_1745_]) + i_1731_, 1472771802) - i_1730_) + i_1744_);
			} else if (i == 5) {
				int i_1746_ = (((Class528_Sub1) this).aShort8284 - ((Class528_Sub1) this).aShort8283);
				for (int i_1747_ = 0; i_1747_ < ((Class528_Sub1) this).anInt8248; i_1747_++) {
					int i_1748_ = (((Class528_Sub1) this).anIntArray8249[i_1747_] + i_1729_);
					int i_1749_ = (((Class528_Sub1) this).anIntArray8251[i_1747_] + i_1731_);
					int i_1750_ = class390.method6709(i_1748_, i_1749_, -266620726);
					int i_1751_ = class390_1728_.method6709(i_1748_, i_1749_, -1077357341);
					int i_1752_ = i_1750_ - i_1751_ - i_1727_;
					((Class528_Sub1) this).anIntArray8250[i_1747_] = ((((Class528_Sub1) this).anIntArray8250[i_1747_] << 8) / i_1746_ * i_1752_ >> 8) - (i_1730_ - i_1750_);
				}
			}
			if (((Class528_Sub1) this).aClass143_8272 != null)
				((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
			((Class528_Sub1) this).aBool8254 = false;
		}
	}

	public int ya() {
		if (!((Class528_Sub1) this).aBool8254)
			method13528();
		return ((Class528_Sub1) this).aShort8286;
	}

	static final int method13569(int i, int i_1753_) {
		i_1753_ = i_1753_ * (i & 0x7f) >> 7;
		if (i_1753_ < 2)
			i_1753_ = 2;
		else if (i_1753_ > 126)
			i_1753_ = 126;
		return (i & 0xff80) + i_1753_;
	}

	public int dq() {
		return ((Class528_Sub1) this).aShort8243;
	}

	public void ep(int i, int i_1754_, int i_1755_) {
		for (int i_1756_ = 0; i_1756_ < ((Class528_Sub1) this).anInt8248; i_1756_++) {
			if (i != 128)
				((Class528_Sub1) this).anIntArray8249[i_1756_] = ((Class528_Sub1) this).anIntArray8249[i_1756_] * i >> 7;
			if (i_1754_ != 128)
				((Class528_Sub1) this).anIntArray8250[i_1756_] = (((Class528_Sub1) this).anIntArray8250[i_1756_] * i_1754_ >> 7);
			if (i_1755_ != 128)
				((Class528_Sub1) this).anIntArray8251[i_1756_] = (((Class528_Sub1) this).anIntArray8251[i_1756_] * i_1755_ >> 7);
		}
		if (((Class528_Sub1) this).aClass143_8272 != null)
			((Class143) ((Class528_Sub1) this).aClass143_8272).anInterface14_1667 = null;
		((Class528_Sub1) this).aBool8254 = false;
	}
}
