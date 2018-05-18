
/* Class390_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaclib.memory.Stream;

public class Class390_Sub1 extends Class390 {
	int anInt8525;
	static final int anInt8526 = 74;
	int anInt8527;
	Class505_Sub2 aClass505_Sub2_8528;
	int anInt8529;
	int anInt8530;
	byte[][] aByteArrayArray8531;
	int[][][] anIntArrayArrayArray8532;
	int[][][] anIntArrayArrayArray8533;
	short[][] aShortArrayArray8534;
	float aFloat8535 = 3.4028235E38F;
	int anInt8536;
	Class453 aClass453_8537;
	int[][][] anIntArrayArrayArray8538;
	int anInt8539;
	int[][][] anIntArrayArrayArray8540;
	Class282_Sub6[][][] aClass282_Sub6ArrayArrayArray8541;
	int anInt8542;
	int[][][] anIntArrayArrayArray8543;
	float aFloat8544 = -3.4028235E38F;
	Class74 aClass74_8545;
	Class473 aClass473_8546 = new Class473();
	Node[] aClass282Array8547;
	Interface4 anInterface4_8548;
	float[][] aFloatArrayArray8549;
	Class70 aClass70_8550;
	float[][] aFloatArrayArray8551;
	int anInt8552;
	byte[][] aByteArrayArray8553;
	float[][] aFloatArrayArray8554;
	static final int anInt8555 = 1;
	int[][][] anIntArrayArrayArray8556;
	Interface4 anInterface4_8557;
	static int[] anIntArray8558 = new int[1];
	static int[] anIntArray8559 = new int[1];
	static int anInt8560;
	static int[] anIntArray8561 = new int[1];

	public void method6723(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean[][] bools) {
		if (((Class390_Sub1) this).anInt8542 > 0) {
			Interface32 interface32 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13911(((Class390_Sub1) this).anInt8527);
			int i_6_ = 0;
			int i_7_ = 32767;
			int i_8_ = -32768;
			ByteBuffer bytebuffer = ((Class390_Sub1) this).aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer.clear();
			for (int i_9_ = i_3_; i_9_ < i_5_; i_9_++) {
				int i_10_ = i_9_ * (anInt4776 * -1843860823) + i_2_;
				for (int i_11_ = i_2_; i_11_ < i_4_; i_11_++) {
					if (bools[i_11_ - i_2_][i_9_ - i_3_]) {
						short[] is = (((Class390_Sub1) this).aShortArrayArray8534[i_10_]);
						if (is != null) {
							for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
								int i_13_ = is[i_12_] & 0xffff;
								if (i_13_ > i_8_)
									i_8_ = i_13_;
								if (i_13_ < i_7_)
									i_7_ = i_13_;
								bytebuffer.putShort((short) i_13_);
								i_6_++;
							}
						}
					}
					i_10_++;
				}
			}
			interface32.method42(0, bytebuffer.position(), (((Class390_Sub1) this).aClass505_Sub2_8528.aLong8695));
			if (i_6_ > 0) {
				((Class390_Sub1) this).aClass505_Sub2_8528.method14004();
				Class48 class48 = (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass48_8794);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, ((Class390_Sub1) this).anInterface4_8557);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13997(interface32);
				((Class390_Sub1) this).aClass505_Sub2_8528.method8457(Class294.aClass294_3518);
				float f = (float) ((Class390_Sub1) this).aClass505_Sub2_8528.method8523((byte) 126).method2714();
				float f_14_ = (float) ((Class390_Sub1) this).aClass505_Sub2_8528.method8523((byte) 127).method2716();
				Class294 class294 = new Class294();
				Class294 class294_15_ = new Class294();
				class294.method5214(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class294_15_.method5259((float) i_1_ / (256.0F * (float) (anInt4774 * 750971439)), (float) -i_1_ / (256.0F * (float) (anInt4774 * 750971439)), 1.0F / (((Class390_Sub1) this).aFloat8544 - ((Class390_Sub1) this).aFloat8535));
				class294_15_.method5219((float) i - (float) (i_2_ * i_1_) / 256.0F, (float) i_0_ + (float) (i_5_ * i_1_) / 256.0F, (-((Class390_Sub1) this).aFloat8535 / (((Class390_Sub1) this).aFloat8544 - ((Class390_Sub1) this).aFloat8535)));
				class294_15_.method5247(2.0F / f, 2.0F / f_14_, 1.0F);
				class294_15_.method5219(-1.0F, -1.0F, 0.0F);
				((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass294_8713.method5261(class294, class294_15_);
				((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6522(((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass294_8713);
				((Class390_Sub1) this).aClass505_Sub2_8528.method8424(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
				class48.method957(Class384.aClass384_4666);
				class48.aClass303_460.method5366(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.method6626(0.0F, 0.0F, 0.0F);
				class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
				class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
				class48.aClass384_454.method6518();
				class48.anInt467 = i_7_;
				class48.anInt468 = i_8_ - i_7_ + 1;
				class48.anInt469 = 0;
				class48.anInt470 = i_6_ / 3;
				class48.method946(false);
			}
		}
	}

	public void LA(int i, int i_16_, int i_17_) {
		if ((((Class390_Sub1) this).aByteArrayArray8553[i][i_16_] & 0xff) < i_17_)
			((Class390_Sub1) this).aByteArrayArray8553[i][i_16_] = (byte) i_17_;
	}

	public void method6707(int i, int i_18_, int[] is, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, Class90 class90, boolean bool) {
		Interface22 interface22 = ((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834;
		if (is_21_ != null && ((Class390_Sub1) this).anIntArrayArrayArray8543 == null)
			((Class390_Sub1) this).anIntArrayArrayArray8543 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		if (is_19_ != null && ((Class390_Sub1) this).anIntArrayArrayArray8532 == null)
			((Class390_Sub1) this).anIntArrayArrayArray8532 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		((Class390_Sub1) this).anIntArrayArrayArray8540[i][i_18_] = is;
		((Class390_Sub1) this).anIntArrayArrayArray8533[i][i_18_] = is_20_;
		((Class390_Sub1) this).anIntArrayArrayArray8538[i][i_18_] = is_22_;
		((Class390_Sub1) this).anIntArrayArrayArray8556[i][i_18_] = is_23_;
		if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
			((Class390_Sub1) this).anIntArrayArrayArray8543[i][i_18_] = is_21_;
		if (((Class390_Sub1) this).anIntArrayArrayArray8532 != null)
			((Class390_Sub1) this).anIntArrayArrayArray8532[i][i_18_] = is_19_;
		Class282_Sub6[] class282_sub6s = (((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541[i][i_18_] = new Class282_Sub6[is_22_.length]);
		for (int i_26_ = 0; i_26_ < is_22_.length; i_26_++) {
			int i_27_ = is_24_[i_26_];
			int i_28_ = is_25_[i_26_];
			if ((((Class390_Sub1) this).anInt8539 & 0x20) != 0 && i_27_ != -1 && interface22.method144(i_27_, -1764984087).aBool2056) {
				i_28_ = 128;
				i_27_ = -1;
			}
			long l = ((long) (class90.anInt947 * -732614481) << 48 | (long) (class90.anInt945 * 973144081) << 42 | (long) (class90.anInt946 * 1152775735) << 28 | (long) (i_28_ << 14) | (long) i_27_);
			Node class282;
			for (class282 = ((Class390_Sub1) this).aClass453_8537.method7530(l); class282 != null; class282 = ((Class390_Sub1) this).aClass453_8537.method7544(1200593705)) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282;
				if (((Class282_Sub6) class282_sub6).anInt7510 == i_27_ && (((Class282_Sub6) class282_sub6).aFloat7511 == (float) i_28_) && ((Class282_Sub6) class282_sub6).aClass90_7512.method1506(class90, -120742780))
					break;
			}
			if (class282 == null) {
				class282_sub6s[i_26_] = new Class282_Sub6(this, i_27_, i_28_, class90);
				((Class390_Sub1) this).aClass453_8537.method7534(class282_sub6s[i_26_], l);
			} else
				class282_sub6s[i_26_] = (Class282_Sub6) class282;
		}
		if (bool)
			((Class390_Sub1) this).aByteArrayArray8531[i][i_18_] |= 0x1;
		if (is_22_.length > ((Class390_Sub1) this).anInt8552)
			((Class390_Sub1) this).anInt8552 = is_22_.length;
		((Class390_Sub1) this).anInt8542 += is_22_.length;
	}

	public void z(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_29_, int i_30_, int i_31_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_32_ = (i - (i_29_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_33_ = (i_30_ - (i_29_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1315(class282_sub50_sub17, i_32_, i_33_);
		}
	}

	public boolean method6712(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_34_, int i_35_, int i_36_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 == null || class282_sub50_sub17 == null)
			return false;
		int i_37_ = (i - (i_34_ * ((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8777 >> 8) >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		int i_38_ = (i_35_ - (i_34_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8778) >> 8) >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		return ((Class390_Sub1) this).aClass74_8545.method1316(class282_sub50_sub17, i_37_, i_38_);
	}

	public boolean method6718(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_39_, int i_40_, int i_41_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 == null || class282_sub50_sub17 == null)
			return false;
		int i_42_ = (i - (i_39_ * ((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8777 >> 8) >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		int i_43_ = (i_40_ - (i_39_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8778) >> 8) >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		return ((Class390_Sub1) this).aClass74_8545.method1316(class282_sub50_sub17, i_42_, i_43_);
	}

	public void method6715(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, boolean[][] bools) {
		if (((Class390_Sub1) this).anInt8542 > 0) {
			Interface32 interface32 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13911(((Class390_Sub1) this).anInt8527);
			int i_50_ = 0;
			int i_51_ = 32767;
			int i_52_ = -32768;
			ByteBuffer bytebuffer = ((Class390_Sub1) this).aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer.clear();
			for (int i_53_ = i_47_; i_53_ < i_49_; i_53_++) {
				int i_54_ = i_53_ * (anInt4776 * -1843860823) + i_46_;
				for (int i_55_ = i_46_; i_55_ < i_48_; i_55_++) {
					if (bools[i_55_ - i_46_][i_53_ - i_47_]) {
						short[] is = (((Class390_Sub1) this).aShortArrayArray8534[i_54_]);
						if (is != null) {
							for (int i_56_ = 0; i_56_ < is.length; i_56_++) {
								int i_57_ = is[i_56_] & 0xffff;
								if (i_57_ > i_52_)
									i_52_ = i_57_;
								if (i_57_ < i_51_)
									i_51_ = i_57_;
								bytebuffer.putShort((short) i_57_);
								i_50_++;
							}
						}
					}
					i_54_++;
				}
			}
			interface32.method42(0, bytebuffer.position(), (((Class390_Sub1) this).aClass505_Sub2_8528.aLong8695));
			if (i_50_ > 0) {
				((Class390_Sub1) this).aClass505_Sub2_8528.method14004();
				Class48 class48 = (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass48_8794);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, ((Class390_Sub1) this).anInterface4_8557);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13997(interface32);
				((Class390_Sub1) this).aClass505_Sub2_8528.method8457(Class294.aClass294_3518);
				float f = (float) ((Class390_Sub1) this).aClass505_Sub2_8528.method8523((byte) 109).method2714();
				float f_58_ = (float) ((Class390_Sub1) this).aClass505_Sub2_8528.method8523((byte) 122).method2716();
				Class294 class294 = new Class294();
				Class294 class294_59_ = new Class294();
				class294.method5214(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class294_59_.method5259((float) i_45_ / (256.0F * (float) (anInt4774 * 750971439)), (float) -i_45_ / (256.0F * (float) (anInt4774 * 750971439)), 1.0F / (((Class390_Sub1) this).aFloat8544 - ((Class390_Sub1) this).aFloat8535));
				class294_59_.method5219((float) i - (float) (i_46_ * i_45_) / 256.0F, (float) i_44_ + (float) (i_49_ * i_45_) / 256.0F, (-((Class390_Sub1) this).aFloat8535 / (((Class390_Sub1) this).aFloat8544 - ((Class390_Sub1) this).aFloat8535)));
				class294_59_.method5247(2.0F / f, 2.0F / f_58_, 1.0F);
				class294_59_.method5219(-1.0F, -1.0F, 0.0F);
				((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass294_8713.method5261(class294, class294_59_);
				((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6522(((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass294_8713);
				((Class390_Sub1) this).aClass505_Sub2_8528.method8424(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
				class48.method957(Class384.aClass384_4666);
				class48.aClass303_460.method5366(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.method6626(0.0F, 0.0F, 0.0F);
				class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
				class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
				class48.aClass384_454.method6518();
				class48.anInt467 = i_51_;
				class48.anInt468 = i_52_ - i_51_ + 1;
				class48.anInt469 = 0;
				class48.anInt470 = i_50_ / 3;
				class48.method946(false);
			}
		}
	}

	public Class282_Sub50_Sub17 w(int i, int i_60_, Class282_Sub50_Sub17 class282_sub50_sub17) {
		if ((((Class390_Sub1) this).aByteArrayArray8531[i][i_60_] & 0x1) == 0)
			return null;
		int i_61_ = (anInt4774 * 750971439 >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_62_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_61_, i_61_)) {
			class282_sub50_sub17_sub2_62_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_62_.method16042();
		} else
			class282_sub50_sub17_sub2_62_ = new Class282_Sub50_Sub17_Sub2((((Class390_Sub1) this).aClass505_Sub2_8528), i_61_, i_61_);
		class282_sub50_sub17_sub2_62_.method16040(0, 0, i_61_, i_61_);
		method13791(class282_sub50_sub17_sub2_62_, i, i_60_);
		return class282_sub50_sub17_sub2_62_;
	}

	void method13791(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2, int i, int i_63_) {
		int[] is = ((Class390_Sub1) this).anIntArrayArrayArray8540[i][i_63_];
		int[] is_64_ = ((Class390_Sub1) this).anIntArrayArrayArray8533[i][i_63_];
		int i_65_ = is.length;
		if (anIntArray8558.length < i_65_) {
			anIntArray8558 = new int[i_65_];
			anIntArray8559 = new int[i_65_];
		}
		for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
			anIntArray8558[i_66_] = is[i_66_] >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			anIntArray8559[i_66_] = is_64_[i_66_] >> (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8806);
		}
		int i_67_ = 0;
		while (i_67_ < i_65_) {
			int i_68_ = anIntArray8558[i_67_];
			int i_69_ = anIntArray8559[i_67_++];
			int i_70_ = anIntArray8558[i_67_];
			int i_71_ = anIntArray8559[i_67_++];
			int i_72_ = anIntArray8558[i_67_];
			int i_73_ = anIntArray8559[i_67_++];
			if ((i_68_ - i_70_) * (i_71_ - i_73_) - (i_71_ - i_69_) * (i_72_ - i_70_) > 0)
				class282_sub50_sub17_sub2.method16043(i_69_, i_71_, i_73_, i_68_, i_70_, i_72_);
		}
	}

	public Class282_Sub50_Sub17 s(int i, int i_74_, Class282_Sub50_Sub17 class282_sub50_sub17) {
		if ((((Class390_Sub1) this).aByteArrayArray8531[i][i_74_] & 0x1) == 0)
			return null;
		int i_75_ = (anInt4774 * 750971439 >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_76_;
		if (class282_sub50_sub17_sub2 != null && class282_sub50_sub17_sub2.method16039(i_75_, i_75_)) {
			class282_sub50_sub17_sub2_76_ = class282_sub50_sub17_sub2;
			class282_sub50_sub17_sub2_76_.method16042();
		} else
			class282_sub50_sub17_sub2_76_ = new Class282_Sub50_Sub17_Sub2((((Class390_Sub1) this).aClass505_Sub2_8528), i_75_, i_75_);
		class282_sub50_sub17_sub2_76_.method16040(0, 0, i_75_, i_75_);
		method13791(class282_sub50_sub17_sub2_76_, i, i_74_);
		return class282_sub50_sub17_sub2_76_;
	}

	public void method6716(int i, int i_77_, int i_78_, boolean[][] bools, boolean bool, int i_79_) {
		if (((Class390_Sub1) this).aClass282Array8547 != null) {
			int i_80_ = i_78_ + i_78_ + 1;
			i_80_ *= i_80_;
			if (anIntArray8561.length < i_80_)
				anIntArray8561 = new int[i_80_];
			int i_81_ = i - i_78_;
			int i_82_ = i_81_;
			if (i_81_ < 0)
				i_81_ = 0;
			int i_83_ = i_77_ - i_78_;
			int i_84_ = i_83_;
			if (i_83_ < 0)
				i_83_ = 0;
			int i_85_ = i + i_78_;
			if (i_85_ > anInt4776 * -1843860823 - 1)
				i_85_ = anInt4776 * -1843860823 - 1;
			int i_86_ = i_77_ + i_78_;
			if (i_86_ > anInt4773 * 1826078169 - 1)
				i_86_ = anInt4773 * 1826078169 - 1;
			anInt8560 = 0;
			for (int i_87_ = i_81_; i_87_ <= i_85_; i_87_++) {
				boolean[] bools_88_ = bools[i_87_ - i_82_];
				for (int i_89_ = i_83_; i_89_ <= i_86_; i_89_++) {
					if (bools_88_[i_89_ - i_84_])
						anIntArray8561[anInt8560++] = i_89_ * (anInt4776 * -1843860823) + i_87_;
				}
			}
			ByteBuffer bytebuffer = ((Class390_Sub1) this).aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer.clear();
			for (int i_90_ = 0; i_90_ < ((Class390_Sub1) this).aClass282Array8547.length; i_90_++) {
				Class282_Sub6 class282_sub6 = ((Class282_Sub6) ((Class390_Sub1) this).aClass282Array8547[i_90_]);
				class282_sub6.method12147(anIntArray8561, anInt8560);
			}
			int i_91_ = bytebuffer.position();
			Class48 class48 = (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass48_8794);
			if (i_91_ != 0) {
				Interface32 interface32 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13911(i_91_ / 2);
				interface32.method42(0, i_91_, (((Class390_Sub1) this).aClass505_Sub2_8528.aLong8695));
				((Class390_Sub1) this).aClass505_Sub2_8528.method14004();
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13997(interface32);
				class48.method957(Class384.aClass384_4666);
				if (((Class390_Sub1) this).aClass505_Sub2_8528.anInt8811 > 0) {
					class48.aClass303_460.method5366(0.0F, 0.0F, 1.0F, -(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8813));
					class48.aClass385_457.method6626((float) ((((Class390_Sub1) this).aClass505_Sub2_8528.anInt8810) >> 16 & 0xff) / 255.0F, (float) ((((Class390_Sub1) this).aClass505_Sub2_8528.anInt8810) >> 8 & 0xff) / 255.0F, (float) ((((Class390_Sub1) this).aClass505_Sub2_8528.anInt8810) >> 0 & 0xff) / 255.0F);
					((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6562(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8740);
					((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6520();
					class48.aClass303_460.method5377(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
					class48.aClass303_460.method5387(1.0F / ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8819) - (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8813)));
				} else {
					class48.aClass303_460.method5366(0.0F, 0.0F, 0.0F, 0.0F);
					class48.aClass385_457.method6626(0.0F, 0.0F, 0.0F);
				}
				if ((((Class390_Sub1) this).anInt8539 & 0x37) == 0) {
					int i_92_ = 0;
					for (int i_93_ = 0; (i_93_ < ((Class390_Sub1) this).aClass282Array8547.length); i_93_++) {
						Class282_Sub6 class282_sub6 = (Class282_Sub6) (((Class390_Sub1) this).aClass282Array8547[i_93_]);
						if (((Class282_Sub6) class282_sub6).anInt7514 != 0) {
							if (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aBool8779) {
								((Class390_Sub1) this).aClass505_Sub2_8528.method8476(0, (((Class282_Sub6) class282_sub6).aClass90_7512));
								class48.aClass303_458.method5366(0.0F, 1.0F, 0.0F, ((float) (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8739) + ((float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt947) * -732614481) / 255.0F * (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081))));
								class48.aClass303_458.method5387(1.0F / (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081));
								class48.aClass385_459.method6626((float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 16 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 8 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 0 & 0xff) / 255.0F);
							} else {
								class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
								class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
							}
							boolean bool_94_ = false;
							if (((Class282_Sub6) class282_sub6).anInt7510 != -1) {
								class48.anInterface6_452 = (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass66_8787.method1283(((Class282_Sub6) class282_sub6).anInt7510));
								Class169 class169 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834.method144((((Class282_Sub6) class282_sub6).anInt7510), -2012208347));
								bool_94_ = !(Class282_Sub41.method13367(class169.aByte2064, (short) 16046));
							} else
								class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
							((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, (((Class282_Sub6) class282_sub6).anInterface4_7516));
							((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
							class48.aClass384_454.method6525(1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F, 1.0F);
							class48.anInt467 = ((Class282_Sub6) class282_sub6).anInt7519;
							class48.anInt468 = (((Class282_Sub6) class282_sub6).anInt7517 - ((Class282_Sub6) class282_sub6).anInt7519 + 1);
							class48.anInt469 = i_92_;
							class48.anInt470 = (((Class282_Sub6) class282_sub6).anInt7514 / 3);
							class48.method946(bool_94_);
							i_92_ += ((Class282_Sub6) class282_sub6).anInt7514;
						}
					}
				} else {
					class48.aClass385_466.method6626((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]));
					class48.aClass385_448.method6626((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8766)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8767)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8768)));
					class48.aClass385_464.method6626((-(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826) * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8766)), (-(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826) * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8767)), (-(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826) * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8768)));
					class48.aClass385_461.method6626((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8766)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8767)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8768)));
					int i_95_ = 0;
					for (int i_96_ = 0; (i_96_ < ((Class390_Sub1) this).aClass282Array8547.length); i_96_++) {
						Class282_Sub6 class282_sub6 = (Class282_Sub6) (((Class390_Sub1) this).aClass282Array8547[i_96_]);
						if (((Class282_Sub6) class282_sub6).anInt7514 > 0) {
							if (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aBool8779) {
								((Class390_Sub1) this).aClass505_Sub2_8528.method8476(0, (((Class282_Sub6) class282_sub6).aClass90_7512));
								float f = 0.15F;
								class48.aClass303_458.method5366(0.0F, 1.0F / ((float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081) * f), 0.0F, 256.0F / ((float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081) * f));
								class48.aClass385_459.method6626((float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 16 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 8 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 0 & 0xff) / 255.0F);
							} else {
								class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
								class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
							}
							byte i_97_ = 11;
							if (((Class282_Sub6) class282_sub6).anInt7510 != -1) {
								Class169 class169 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834.method144((((Class282_Sub6) class282_sub6).anInt7510), -1968208071));
								i_97_ = class169.aByte2064;
								class48.anInterface6_452 = (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass66_8787.method1283(((Class282_Sub6) class282_sub6).anInt7510));
								class48.method944(class169);
							} else
								class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
							((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, (((Class282_Sub6) class282_sub6).anInterface4_7516));
							((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
							class48.aClass384_454.method6525(1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F, 1.0F);
							class48.anInt467 = ((Class282_Sub6) class282_sub6).anInt7519;
							class48.anInt468 = (((Class282_Sub6) class282_sub6).anInt7517 - ((Class282_Sub6) class282_sub6).anInt7519 + 1);
							class48.anInt469 = i_95_;
							class48.anInt470 = (((Class282_Sub6) class282_sub6).anInt7514 / 3);
							switch (i_97_) {
							case 1:
								class48.aClass385_455.method6626((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[12]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[13]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[14]));
								class48.method948(0);
								break;
							case 6:
								class48.method946(!Class282_Sub41.method13367(i_97_, (short) 8402));
								break;
							case 7:
								class48.aClass385_455.method6626((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[12]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[13]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[14]));
								class48.aClass384_465.method6518();
								class48.anInterface31_451 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13965();
								class48.method949(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class390_Sub1) this).aClass505_Sub2_8528.aBool8692) && (((Class390_Sub1) this).anInt8539 & 0x8) != 0) {
									Class41_Sub1_Sub1 class41_sub1_sub1 = (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass41_Sub1_Sub1_8691);
									class41_sub1_sub1.aClass384_10090.method6562(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8729);
									class41_sub1_sub1.aClass384_10091.method6525(1.0F / (((Class282_Sub6) class282_sub6).aFloat7511 * (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt949) * -323415275)), 1.0F / (((Class282_Sub6) class282_sub6).aFloat7511 * (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt949) * -323415275)), 1.0F, 1.0F);
									class41_sub1_sub1.aClass385_10089.method6626((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[12]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[13]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[14]));
									Class169 class169 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834.method144((((Class282_Sub6) class282_sub6).anInt7510), -1774392494));
									class41_sub1_sub1.anInt10095 = class169.aByte2076 * -430601887;
									class41_sub1_sub1.anInt10110 = (((Class282_Sub6) class282_sub6).anInt7519) * -939296569;
									class41_sub1_sub1.anInt10111 = ((((Class282_Sub6) class282_sub6).anInt7517) - (((Class282_Sub6) class282_sub6).anInt7519) + 1) * -1096006599;
									class41_sub1_sub1.anInt10094 = i_95_ * -1526620181;
									class41_sub1_sub1.anInt10112 = (((Class282_Sub6) class282_sub6).anInt7514) / 3 * -1855853283;
									class41_sub1_sub1.aClass303_10103.method5367(class48.aClass303_458);
									class41_sub1_sub1.aClass385_10086.method6627(class48.aClass385_459);
									class41_sub1_sub1.aClass303_10107.method5367(class48.aClass303_460);
									class41_sub1_sub1.aClass385_10109.method6627(class48.aClass385_457);
									class41_sub1_sub1.method15520(-648647139);
								} else
									class48.method965(0);
								break;
							default:
								if (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aBool8779)
									class48.method950();
								else
									class48.method965(0);
							}
							i_95_ += ((Class282_Sub6) class282_sub6).anInt7514;
						}
					}
				}
			}
			if (((Class390_Sub1) this).aClass74_8545 != null) {
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, ((Class390_Sub1) this).anInterface4_8557);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
				Class384 class384 = (((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
				class384.method6518();
				class384.aFloatArray4667[13] = -1.0F;
				class48.method957(class384);
				((Class390_Sub1) this).aClass74_8545.method1314(class48, i, i_77_, i_78_, bools, bool);
			}
		}
	}

	public void NA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_98_, int i_99_, int i_100_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_101_ = (i - (i_98_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_102_ = (i_99_ - (i_98_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1315(class282_sub50_sub17, i_101_, i_102_);
		}
	}

	public void method6711(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub1) this).aClass473_8546.method7877(new Class282_Sub8(((Class390_Sub1) this).aClass505_Sub2_8528, this, class282_sub24, is), 961726999);
	}

	public void d(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_103_, int i_104_, int i_105_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_106_ = (i - (i_103_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_107_ = (i_104_ - (i_103_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1315(class282_sub50_sub17, i_106_, i_107_);
		}
	}

	public void m(int i, int i_108_, int i_109_) {
		if ((((Class390_Sub1) this).aByteArrayArray8553[i][i_108_] & 0xff) < i_109_)
			((Class390_Sub1) this).aByteArrayArray8553[i][i_108_] = (byte) i_109_;
	}

	public void method6714(int i, int i_110_, int[] is, int[] is_111_, int[] is_112_, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, Class90 class90, boolean bool) {
		int i_121_ = is_117_.length;
		int[] is_122_ = new int[i_121_ * 3];
		int[] is_123_ = new int[i_121_ * 3];
		int[] is_124_ = new int[i_121_ * 3];
		int[] is_125_ = new int[i_121_ * 3];
		int[] is_126_ = new int[i_121_ * 3];
		int[] is_127_ = new int[i_121_ * 3];
		int[] is_128_ = is_111_ != null ? new int[i_121_ * 3] : null;
		int[] is_129_ = is_113_ != null ? new int[i_121_ * 3] : null;
		int i_130_ = 0;
		for (int i_131_ = 0; i_131_ < i_121_; i_131_++) {
			int i_132_ = is_114_[i_131_];
			int i_133_ = is_115_[i_131_];
			int i_134_ = is_116_[i_131_];
			is_122_[i_130_] = is[i_132_];
			is_123_[i_130_] = is_112_[i_132_];
			is_124_[i_130_] = is_117_[i_131_];
			is_126_[i_130_] = is_119_[i_131_];
			is_127_[i_130_] = is_120_[i_131_];
			is_125_[i_130_] = is_118_ != null ? is_118_[i_131_] : is_117_[i_131_];
			if (is_111_ != null)
				is_128_[i_130_] = is_111_[i_132_];
			if (is_113_ != null)
				is_129_[i_130_] = is_113_[i_132_];
			i_130_++;
			is_122_[i_130_] = is[i_133_];
			is_123_[i_130_] = is_112_[i_133_];
			is_124_[i_130_] = is_117_[i_131_];
			is_126_[i_130_] = is_119_[i_131_];
			is_127_[i_130_] = is_120_[i_131_];
			is_125_[i_130_] = is_118_ != null ? is_118_[i_131_] : is_117_[i_131_];
			if (is_111_ != null)
				is_128_[i_130_] = is_111_[i_133_];
			if (is_113_ != null)
				is_129_[i_130_] = is_113_[i_133_];
			i_130_++;
			is_122_[i_130_] = is[i_134_];
			is_123_[i_130_] = is_112_[i_134_];
			is_124_[i_130_] = is_117_[i_131_];
			is_126_[i_130_] = is_119_[i_131_];
			is_127_[i_130_] = is_120_[i_131_];
			is_125_[i_130_] = is_118_ != null ? is_118_[i_131_] : is_117_[i_131_];
			if (is_111_ != null)
				is_128_[i_130_] = is_111_[i_134_];
			if (is_113_ != null)
				is_129_[i_130_] = is_113_[i_134_];
			i_130_++;
		}
		method6707(i, i_110_, is_122_, is_128_, is_123_, is_129_, is_124_, is_125_, is_126_, is_127_, class90, bool);
	}

	public void method6706(int i, int i_135_, int[] is, int[] is_136_, int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_, int[] is_141_, int[] is_142_, Class90 class90, boolean bool) {
		Interface22 interface22 = ((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834;
		if (is_138_ != null && ((Class390_Sub1) this).anIntArrayArrayArray8543 == null)
			((Class390_Sub1) this).anIntArrayArrayArray8543 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		if (is_136_ != null && ((Class390_Sub1) this).anIntArrayArrayArray8532 == null)
			((Class390_Sub1) this).anIntArrayArrayArray8532 = new int[anInt4776 * -1843860823][anInt4773 * 1826078169][];
		((Class390_Sub1) this).anIntArrayArrayArray8540[i][i_135_] = is;
		((Class390_Sub1) this).anIntArrayArrayArray8533[i][i_135_] = is_137_;
		((Class390_Sub1) this).anIntArrayArrayArray8538[i][i_135_] = is_139_;
		((Class390_Sub1) this).anIntArrayArrayArray8556[i][i_135_] = is_140_;
		if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
			((Class390_Sub1) this).anIntArrayArrayArray8543[i][i_135_] = is_138_;
		if (((Class390_Sub1) this).anIntArrayArrayArray8532 != null)
			((Class390_Sub1) this).anIntArrayArrayArray8532[i][i_135_] = is_136_;
		Class282_Sub6[] class282_sub6s = (((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541[i][i_135_] = new Class282_Sub6[is_139_.length]);
		for (int i_143_ = 0; i_143_ < is_139_.length; i_143_++) {
			int i_144_ = is_141_[i_143_];
			int i_145_ = is_142_[i_143_];
			if ((((Class390_Sub1) this).anInt8539 & 0x20) != 0 && i_144_ != -1 && interface22.method144(i_144_, -2017855605).aBool2056) {
				i_145_ = 128;
				i_144_ = -1;
			}
			long l = ((long) (class90.anInt947 * -732614481) << 48 | (long) (class90.anInt945 * 973144081) << 42 | (long) (class90.anInt946 * 1152775735) << 28 | (long) (i_145_ << 14) | (long) i_144_);
			Node class282;
			for (class282 = ((Class390_Sub1) this).aClass453_8537.method7530(l); class282 != null; class282 = ((Class390_Sub1) this).aClass453_8537.method7544(2090773608)) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282;
				if (((Class282_Sub6) class282_sub6).anInt7510 == i_144_ && (((Class282_Sub6) class282_sub6).aFloat7511 == (float) i_145_) && ((Class282_Sub6) class282_sub6).aClass90_7512.method1506(class90, 224170917))
					break;
			}
			if (class282 == null) {
				class282_sub6s[i_143_] = new Class282_Sub6(this, i_144_, i_145_, class90);
				((Class390_Sub1) this).aClass453_8537.method7534(class282_sub6s[i_143_], l);
			} else
				class282_sub6s[i_143_] = (Class282_Sub6) class282;
		}
		if (bool)
			((Class390_Sub1) this).aByteArrayArray8531[i][i_135_] |= 0x1;
		if (is_139_.length > ((Class390_Sub1) this).anInt8552)
			((Class390_Sub1) this).anInt8552 = is_139_.length;
		((Class390_Sub1) this).anInt8542 += is_139_.length;
	}

	public void p() {
		if (((Class390_Sub1) this).anInt8542 > 0) {
			byte[][] is = (new byte[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
			for (int i = 1; i < anInt4776 * -1843860823; i++) {
				for (int i_146_ = 1; i_146_ < anInt4773 * 1826078169; i_146_++)
					is[i][i_146_] = (byte) (((((Class390_Sub1) this).aByteArrayArray8553[i - 1][i_146_]) >> 2) + ((((Class390_Sub1) this).aByteArrayArray8553[i + 1][i_146_]) >> 3) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_146_ - 1]) >> 2) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_146_ + 1]) >> 3) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_146_]) >> 1));
			}
			Node[] class282s = new Node[((Class390_Sub1) this).aClass453_8537.method7540(-975751825)];
			((Class390_Sub1) this).aClass453_8537.method7532(class282s, (byte) 122);
			for (int i = 0; i < class282s.length; i++)
				((Class282_Sub6) class282s[i]).method12150(((Class390_Sub1) this).anInt8542);
			int i = 20;
			if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
				i += 4;
			if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0)
				i += 12;
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aNativeHeap8699.method759(((Class390_Sub1) this).anInt8542 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_147_ = ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aNativeHeap8699.method759(((Class390_Sub1) this).anInt8542 * i, false);
			Stream stream = new Stream(nativeheapbuffer_147_);
			Stream stream_148_ = new Stream(nativeheapbuffer);
			Class282_Sub6[] class282_sub6s = new Class282_Sub6[((Class390_Sub1) this).anInt8542];
			int i_149_ = Class51.method1072(((Class390_Sub1) this).anInt8542 / 4, 2136936903);
			if (i_149_ < 1)
				i_149_ = 1;
			Class453 class453 = new Class453(i_149_);
			Class282_Sub6[] class282_sub6s_150_ = new Class282_Sub6[((Class390_Sub1) this).anInt8552];
			for (int i_151_ = 0; i_151_ < anInt4776 * -1843860823; i_151_++) {
				for (int i_152_ = 0; i_152_ < anInt4773 * 1826078169; i_152_++) {
					if ((((Class390_Sub1) this).anIntArrayArrayArray8538[i_151_][i_152_]) != null) {
						Class282_Sub6[] class282_sub6s_153_ = (((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541[i_151_][i_152_]);
						int[] is_154_ = (((Class390_Sub1) this).anIntArrayArrayArray8540[i_151_][i_152_]);
						int[] is_155_ = (((Class390_Sub1) this).anIntArrayArrayArray8533[i_151_][i_152_]);
						int[] is_156_ = (((Class390_Sub1) this).anIntArrayArrayArray8556[i_151_][i_152_]);
						int[] is_157_ = (((Class390_Sub1) this).anIntArrayArrayArray8538[i_151_][i_152_]);
						int[] is_158_ = ((((Class390_Sub1) this).anIntArrayArrayArray8532 != null) ? (((Class390_Sub1) this).anIntArrayArrayArray8532[i_151_][i_152_]) : null);
						int[] is_159_ = ((((Class390_Sub1) this).anIntArrayArrayArray8543 != null) ? (((Class390_Sub1) this).anIntArrayArrayArray8543[i_151_][i_152_]) : null);
						if (is_156_ == null)
							is_156_ = is_157_;
						float f = (((Class390_Sub1) this).aFloatArrayArray8554[i_151_][i_152_]);
						float f_160_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_151_][i_152_]);
						float f_161_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_151_][i_152_]);
						float f_162_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_151_][i_152_ + 1]);
						float f_163_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_151_][i_152_ + 1]);
						float f_164_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_151_][i_152_ + 1]);
						float f_165_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_151_ + 1][i_152_ + 1]);
						float f_166_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_151_ + 1][i_152_ + 1]);
						float f_167_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_151_ + 1][i_152_ + 1]);
						float f_168_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_151_ + 1][i_152_]);
						float f_169_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_151_ + 1][i_152_]);
						float f_170_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_151_ + 1][i_152_]);
						int i_171_ = is[i_151_][i_152_] & 0xff;
						int i_172_ = is[i_151_][i_152_ + 1] & 0xff;
						int i_173_ = is[i_151_ + 1][i_152_ + 1] & 0xff;
						int i_174_ = is[i_151_ + 1][i_152_] & 0xff;
						int i_175_ = 0;
						while_166_: for (int i_176_ = 0; i_176_ < is_157_.length; i_176_++) {
							Class282_Sub6 class282_sub6 = class282_sub6s_153_[i_176_];
							for (int i_177_ = 0; i_177_ < i_175_; i_177_++) {
								if (class282_sub6s_150_[i_177_] == class282_sub6)
									continue while_166_;
							}
							class282_sub6s_150_[i_175_++] = class282_sub6;
						}
						short[] is_178_ = (((Class390_Sub1) this).aShortArrayArray8534[(i_152_ * (anInt4776 * -1843860823) + i_151_)] = new short[is_157_.length]);
						for (int i_179_ = 0; i_179_ < is_157_.length; i_179_++) {
							int i_180_ = ((i_151_ << anInt4775 * 1856651955) + is_154_[i_179_]);
							int i_181_ = ((i_152_ << anInt4775 * 1856651955) + is_155_[i_179_]);
							int i_182_ = i_180_ >> ((Class390_Sub1) this).anInt8536;
							int i_183_ = i_181_ >> ((Class390_Sub1) this).anInt8536;
							int i_184_ = is_157_[i_179_];
							int i_185_ = is_156_[i_179_];
							int i_186_ = is_158_ != null ? is_158_[i_179_] : 0;
							long l = ((long) i_185_ << 48 | (long) i_184_ << 32 | (long) (i_182_ << 16) | (long) i_183_);
							int i_187_ = is_154_[i_179_];
							int i_188_ = is_155_[i_179_];
							int i_189_ = 74;
							int i_190_ = 0;
							float f_191_ = 1.0F;
							float f_192_;
							float f_193_;
							float f_194_;
							if (i_187_ == 0 && i_188_ == 0) {
								f_192_ = f;
								f_193_ = f_160_;
								f_194_ = f_161_;
								i_189_ -= i_171_;
							} else if (i_187_ == 0 && i_188_ == anInt4774 * 750971439) {
								f_192_ = f_162_;
								f_193_ = f_163_;
								f_194_ = f_164_;
								i_189_ -= i_172_;
							} else if (i_187_ == anInt4774 * 750971439 && i_188_ == anInt4774 * 750971439) {
								f_192_ = f_165_;
								f_193_ = f_166_;
								f_194_ = f_167_;
								i_189_ -= i_173_;
							} else if (i_187_ == anInt4774 * 750971439 && i_188_ == 0) {
								f_192_ = f_168_;
								f_193_ = f_169_;
								f_194_ = f_170_;
								i_189_ -= i_174_;
							} else {
								float f_195_ = ((float) i_187_ / (float) (anInt4774 * 750971439));
								float f_196_ = ((float) i_188_ / (float) (anInt4774 * 750971439));
								float f_197_ = f + (f_168_ - f) * f_195_;
								float f_198_ = f_160_ + (f_169_ - f_160_) * f_195_;
								float f_199_ = f_161_ + (f_170_ - f_161_) * f_195_;
								float f_200_ = f_162_ + (f_165_ - f_162_) * f_195_;
								float f_201_ = f_163_ + (f_166_ - f_163_) * f_195_;
								float f_202_ = f_164_ + (f_167_ - f_164_) * f_195_;
								f_192_ = f_197_ + (f_200_ - f_197_) * f_196_;
								f_193_ = f_198_ + (f_201_ - f_198_) * f_196_;
								f_194_ = f_199_ + (f_202_ - f_199_) * f_196_;
								int i_203_ = i_171_ + ((i_174_ - i_171_) * i_187_ >> anInt4775 * 1856651955);
								int i_204_ = i_172_ + ((i_173_ - i_172_) * i_187_ >> anInt4775 * 1856651955);
								i_189_ -= i_203_ + ((i_204_ - i_203_) * i_188_ >> anInt4775 * 1856651955);
							}
							if (i_184_ != -1) {
								int i_205_ = (i_184_ & 0x7f) * i_189_ >> 7;
								if (i_205_ < 2)
									i_205_ = 2;
								else if (i_205_ > 126)
									i_205_ = 126;
								i_190_ = (Class540.anIntArray7136[i_184_ & 0xff80 | i_205_]);
								if ((((Class390_Sub1) this).anInt8539 & 0x7) == 0) {
									f_191_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]) * f_192_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]) * f_193_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]) * f_194_);
									f_191_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769) + (f_191_ * (f_191_ > 0.0F ? (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770) : (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826))));
								}
							}
							Node class282 = null;
							if ((i_180_ & ((Class390_Sub1) this).anInt8529 - 1) == 0 && ((i_181_ & ((Class390_Sub1) this).anInt8529 - 1) == 0))
								class282 = class453.method7530(l);
							int i_206_;
							if (class282 == null) {
								int i_207_;
								if (i_185_ != i_184_) {
									int i_208_ = (i_185_ & 0x7f) * i_189_ >> 7;
									if (i_208_ < 2)
										i_208_ = 2;
									else if (i_208_ > 126)
										i_208_ = 126;
									i_207_ = (Class540.anIntArray7136[i_185_ & 0xff80 | i_208_]);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) == 0) {
										float f_209_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]) * f_192_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]) * f_193_ + ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]) * f_194_));
										f_209_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769) + (f_191_ * (f_191_ > 0.0F ? (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770) : (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826))));
										int i_210_ = i_207_ >> 16 & 0xff;
										int i_211_ = i_207_ >> 8 & 0xff;
										int i_212_ = i_207_ & 0xff;
										i_210_ *= f_209_;
										if (i_210_ < 0)
											i_210_ = 0;
										else if (i_210_ > 255)
											i_210_ = 255;
										i_211_ *= f_209_;
										if (i_211_ < 0)
											i_211_ = 0;
										else if (i_211_ > 255)
											i_211_ = 255;
										i_212_ *= f_209_;
										if (i_212_ < 0)
											i_212_ = 0;
										else if (i_212_ > 255)
											i_212_ = 255;
										i_207_ = (i_210_ << 16 | i_211_ << 8 | i_212_);
									}
								} else
									i_207_ = i_190_;
								if (Stream.method2926()) {
									stream.method2923((float) i_180_);
									stream.method2923((float) (method6709(i_180_, i_181_, 1763341485) + i_186_));
									stream.method2923((float) i_181_);
									stream.method2923((float) i_180_);
									stream.method2923((float) i_181_);
									if ((((Class390_Sub1) this).anIntArrayArrayArray8543) != null)
										stream.method2923(is_159_ != null ? (float) ((is_159_[i_179_]) - 1) : 0.0F);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
										stream.method2923(f_192_);
										stream.method2923(f_193_);
										stream.method2923(f_194_);
									}
								} else {
									stream.method2924((float) i_180_);
									stream.method2924((float) (method6709(i_180_, i_181_, 763165425) + i_186_));
									stream.method2924((float) i_181_);
									stream.method2924((float) i_180_);
									stream.method2924((float) i_181_);
									if ((((Class390_Sub1) this).anIntArrayArrayArray8543) != null)
										stream.method2924(is_159_ != null ? (float) ((is_159_[i_179_]) - 1) : 0.0F);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
										stream.method2924(f_192_);
										stream.method2924(f_193_);
										stream.method2924(f_194_);
									}
								}
								if ((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8824) == 0)
									stream_148_.method2921(~0xffffff | i_207_);
								else
									stream_148_.method2922(~0xffffff | i_207_);
								i_206_ = ((Class390_Sub1) this).anInt8525++;
								is_178_[i_179_] = (short) i_206_;
								if (i_184_ != -1)
									class282_sub6s[i_206_] = class282_sub6s_153_[i_179_];
								class453.method7534(new Class282_Sub46(is_178_[i_179_]), l);
							} else {
								is_178_[i_179_] = ((Class282_Sub46) class282).aShort8067;
								i_206_ = is_178_[i_179_] & 0xffff;
								if (i_184_ != -1 && ((class282_sub6s_153_[i_179_].aLong3379 * -3442165056282524525L) < (class282_sub6s[i_206_].aLong3379 * -3442165056282524525L)))
									class282_sub6s[i_206_] = class282_sub6s_153_[i_179_];
							}
							for (int i_213_ = 0; i_213_ < i_175_; i_213_++)
								class282_sub6s_150_[i_213_].method12145(i_206_, i_190_, i_189_, f_191_);
							((Class390_Sub1) this).anInt8527++;
						}
					}
				}
			}
			for (int i_214_ = 0; i_214_ < ((Class390_Sub1) this).anInt8525; i_214_++) {
				Class282_Sub6 class282_sub6 = class282_sub6s[i_214_];
				if (class282_sub6 != null)
					class282_sub6.method12143(i_214_);
			}
			for (int i_215_ = 0; i_215_ < anInt4776 * -1843860823; i_215_++) {
				for (int i_216_ = 0; i_216_ < anInt4773 * 1826078169; i_216_++) {
					short[] is_217_ = (((Class390_Sub1) this).aShortArrayArray8534[i_216_ * (anInt4776 * -1843860823) + i_215_]);
					if (is_217_ != null) {
						int i_218_ = 0;
						int i_219_ = 0;
						while (i_219_ < is_217_.length) {
							int i_220_ = is_217_[i_219_++] & 0xffff;
							int i_221_ = is_217_[i_219_++] & 0xffff;
							int i_222_ = is_217_[i_219_++] & 0xffff;
							Class282_Sub6 class282_sub6 = class282_sub6s[i_220_];
							Class282_Sub6 class282_sub6_223_ = class282_sub6s[i_221_];
							Class282_Sub6 class282_sub6_224_ = class282_sub6s[i_222_];
							Class282_Sub6 class282_sub6_225_ = null;
							if (class282_sub6 != null) {
								class282_sub6.method12152(i_215_, i_216_, i_218_);
								class282_sub6_225_ = class282_sub6;
							}
							if (class282_sub6_223_ != null) {
								class282_sub6_223_.method12152(i_215_, i_216_, i_218_);
								if (class282_sub6_225_ == null || ((class282_sub6_223_.aLong3379 * -3442165056282524525L) < (class282_sub6_225_.aLong3379 * -3442165056282524525L)))
									class282_sub6_225_ = class282_sub6_223_;
							}
							if (class282_sub6_224_ != null) {
								class282_sub6_224_.method12152(i_215_, i_216_, i_218_);
								if (class282_sub6_225_ == null || ((class282_sub6_224_.aLong3379 * -3442165056282524525L) < (class282_sub6_225_.aLong3379 * -3442165056282524525L)))
									class282_sub6_225_ = class282_sub6_224_;
							}
							if (class282_sub6_225_ != null) {
								if (class282_sub6 != null)
									class282_sub6_225_.method12143(i_220_);
								if (class282_sub6_223_ != null)
									class282_sub6_225_.method12143(i_221_);
								if (class282_sub6_224_ != null)
									class282_sub6_225_.method12143(i_222_);
								class282_sub6_225_.method12152(i_215_, i_216_, i_218_);
							}
							i_218_++;
						}
					}
				}
			}
			stream.method2925();
			stream_148_.method2925();
			((Class390_Sub1) this).anInterface4_8557 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13994(false);
			((Class390_Sub1) this).anInterface4_8557.method27(((Class390_Sub1) this).anInt8525 * 4, 4, nativeheapbuffer);
			((Class390_Sub1) this).anInterface4_8548 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13994(false);
			((Class390_Sub1) this).anInterface4_8548.method27(((Class390_Sub1) this).anInt8525 * i, i, nativeheapbuffer_147_);
			if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
				if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
					((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) }));
				else
					((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) }));
			} else if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
				((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691 }), new Class72(Class69.aClass69_690) }));
			else
				((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }), new Class72(Class69.aClass69_690) }));
			int i_226_ = 0;
			for (int i_227_ = 0; i_227_ < class282s.length; i_227_++) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282s[i_227_];
				if (((Class282_Sub6) class282_sub6).anInt7508 > 0)
					class282s[i_226_++] = class282_sub6;
			}
			((Class390_Sub1) this).aClass282Array8547 = new Node[i_226_];
			long[] ls = new long[i_226_];
			for (int i_228_ = 0; i_228_ < i_226_; i_228_++) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282s[i_228_];
				ls[i_228_] = class282_sub6.aLong3379 * -3442165056282524525L;
				((Class390_Sub1) this).aClass282Array8547[i_228_] = class282_sub6;
				class282_sub6.method12146(((Class390_Sub1) this).anInt8525);
			}
			Class214.method3669(ls, ((Class390_Sub1) this).aClass282Array8547, 1515187812);
			if (((Class390_Sub1) this).aClass74_8545 != null)
				((Class390_Sub1) this).aClass74_8545.method1312();
		} else
			((Class390_Sub1) this).aClass74_8545 = null;
		if ((((Class390_Sub1) this).anInt8530 & 0x2) == 0) {
			((Class390_Sub1) this).anIntArrayArrayArray8533 = null;
			((Class390_Sub1) this).anIntArrayArrayArray8540 = null;
			((Class390_Sub1) this).anIntArrayArrayArray8538 = null;
		}
		((Class390_Sub1) this).anIntArrayArrayArray8543 = null;
		((Class390_Sub1) this).anIntArrayArrayArray8556 = null;
		((Class390_Sub1) this).anIntArrayArrayArray8532 = null;
		((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541 = null;
		((Class390_Sub1) this).aByteArrayArray8553 = null;
		((Class390_Sub1) this).aClass453_8537 = null;
		((Class390_Sub1) this).aFloatArrayArray8549 = null;
		((Class390_Sub1) this).aFloatArrayArray8551 = null;
		((Class390_Sub1) this).aFloatArrayArray8554 = null;
	}

	public void e() {
		if (((Class390_Sub1) this).anInt8542 > 0) {
			byte[][] is = (new byte[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
			for (int i = 1; i < anInt4776 * -1843860823; i++) {
				for (int i_229_ = 1; i_229_ < anInt4773 * 1826078169; i_229_++)
					is[i][i_229_] = (byte) (((((Class390_Sub1) this).aByteArrayArray8553[i - 1][i_229_]) >> 2) + ((((Class390_Sub1) this).aByteArrayArray8553[i + 1][i_229_]) >> 3) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_229_ - 1]) >> 2) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_229_ + 1]) >> 3) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_229_]) >> 1));
			}
			Node[] class282s = new Node[((Class390_Sub1) this).aClass453_8537.method7540(-975751825)];
			((Class390_Sub1) this).aClass453_8537.method7532(class282s, (byte) 32);
			for (int i = 0; i < class282s.length; i++)
				((Class282_Sub6) class282s[i]).method12150(((Class390_Sub1) this).anInt8542);
			int i = 20;
			if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
				i += 4;
			if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0)
				i += 12;
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aNativeHeap8699.method759(((Class390_Sub1) this).anInt8542 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_230_ = ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aNativeHeap8699.method759(((Class390_Sub1) this).anInt8542 * i, false);
			Stream stream = new Stream(nativeheapbuffer_230_);
			Stream stream_231_ = new Stream(nativeheapbuffer);
			Class282_Sub6[] class282_sub6s = new Class282_Sub6[((Class390_Sub1) this).anInt8542];
			int i_232_ = Class51.method1072(((Class390_Sub1) this).anInt8542 / 4, 1403155536);
			if (i_232_ < 1)
				i_232_ = 1;
			Class453 class453 = new Class453(i_232_);
			Class282_Sub6[] class282_sub6s_233_ = new Class282_Sub6[((Class390_Sub1) this).anInt8552];
			for (int i_234_ = 0; i_234_ < anInt4776 * -1843860823; i_234_++) {
				for (int i_235_ = 0; i_235_ < anInt4773 * 1826078169; i_235_++) {
					if ((((Class390_Sub1) this).anIntArrayArrayArray8538[i_234_][i_235_]) != null) {
						Class282_Sub6[] class282_sub6s_236_ = (((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541[i_234_][i_235_]);
						int[] is_237_ = (((Class390_Sub1) this).anIntArrayArrayArray8540[i_234_][i_235_]);
						int[] is_238_ = (((Class390_Sub1) this).anIntArrayArrayArray8533[i_234_][i_235_]);
						int[] is_239_ = (((Class390_Sub1) this).anIntArrayArrayArray8556[i_234_][i_235_]);
						int[] is_240_ = (((Class390_Sub1) this).anIntArrayArrayArray8538[i_234_][i_235_]);
						int[] is_241_ = ((((Class390_Sub1) this).anIntArrayArrayArray8532 != null) ? (((Class390_Sub1) this).anIntArrayArrayArray8532[i_234_][i_235_]) : null);
						int[] is_242_ = ((((Class390_Sub1) this).anIntArrayArrayArray8543 != null) ? (((Class390_Sub1) this).anIntArrayArrayArray8543[i_234_][i_235_]) : null);
						if (is_239_ == null)
							is_239_ = is_240_;
						float f = (((Class390_Sub1) this).aFloatArrayArray8554[i_234_][i_235_]);
						float f_243_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_234_][i_235_]);
						float f_244_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_234_][i_235_]);
						float f_245_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_234_][i_235_ + 1]);
						float f_246_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_234_][i_235_ + 1]);
						float f_247_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_234_][i_235_ + 1]);
						float f_248_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_234_ + 1][i_235_ + 1]);
						float f_249_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_234_ + 1][i_235_ + 1]);
						float f_250_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_234_ + 1][i_235_ + 1]);
						float f_251_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_234_ + 1][i_235_]);
						float f_252_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_234_ + 1][i_235_]);
						float f_253_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_234_ + 1][i_235_]);
						int i_254_ = is[i_234_][i_235_] & 0xff;
						int i_255_ = is[i_234_][i_235_ + 1] & 0xff;
						int i_256_ = is[i_234_ + 1][i_235_ + 1] & 0xff;
						int i_257_ = is[i_234_ + 1][i_235_] & 0xff;
						int i_258_ = 0;
						while_168_: for (int i_259_ = 0; i_259_ < is_240_.length; i_259_++) {
							Class282_Sub6 class282_sub6 = class282_sub6s_236_[i_259_];
							for (int i_260_ = 0; i_260_ < i_258_; i_260_++) {
								if (class282_sub6s_233_[i_260_] == class282_sub6)
									continue while_168_;
							}
							class282_sub6s_233_[i_258_++] = class282_sub6;
						}
						short[] is_261_ = (((Class390_Sub1) this).aShortArrayArray8534[(i_235_ * (anInt4776 * -1843860823) + i_234_)] = new short[is_240_.length]);
						for (int i_262_ = 0; i_262_ < is_240_.length; i_262_++) {
							int i_263_ = ((i_234_ << anInt4775 * 1856651955) + is_237_[i_262_]);
							int i_264_ = ((i_235_ << anInt4775 * 1856651955) + is_238_[i_262_]);
							int i_265_ = i_263_ >> ((Class390_Sub1) this).anInt8536;
							int i_266_ = i_264_ >> ((Class390_Sub1) this).anInt8536;
							int i_267_ = is_240_[i_262_];
							int i_268_ = is_239_[i_262_];
							int i_269_ = is_241_ != null ? is_241_[i_262_] : 0;
							long l = ((long) i_268_ << 48 | (long) i_267_ << 32 | (long) (i_265_ << 16) | (long) i_266_);
							int i_270_ = is_237_[i_262_];
							int i_271_ = is_238_[i_262_];
							int i_272_ = 74;
							int i_273_ = 0;
							float f_274_ = 1.0F;
							float f_275_;
							float f_276_;
							float f_277_;
							if (i_270_ == 0 && i_271_ == 0) {
								f_275_ = f;
								f_276_ = f_243_;
								f_277_ = f_244_;
								i_272_ -= i_254_;
							} else if (i_270_ == 0 && i_271_ == anInt4774 * 750971439) {
								f_275_ = f_245_;
								f_276_ = f_246_;
								f_277_ = f_247_;
								i_272_ -= i_255_;
							} else if (i_270_ == anInt4774 * 750971439 && i_271_ == anInt4774 * 750971439) {
								f_275_ = f_248_;
								f_276_ = f_249_;
								f_277_ = f_250_;
								i_272_ -= i_256_;
							} else if (i_270_ == anInt4774 * 750971439 && i_271_ == 0) {
								f_275_ = f_251_;
								f_276_ = f_252_;
								f_277_ = f_253_;
								i_272_ -= i_257_;
							} else {
								float f_278_ = ((float) i_270_ / (float) (anInt4774 * 750971439));
								float f_279_ = ((float) i_271_ / (float) (anInt4774 * 750971439));
								float f_280_ = f + (f_251_ - f) * f_278_;
								float f_281_ = f_243_ + (f_252_ - f_243_) * f_278_;
								float f_282_ = f_244_ + (f_253_ - f_244_) * f_278_;
								float f_283_ = f_245_ + (f_248_ - f_245_) * f_278_;
								float f_284_ = f_246_ + (f_249_ - f_246_) * f_278_;
								float f_285_ = f_247_ + (f_250_ - f_247_) * f_278_;
								f_275_ = f_280_ + (f_283_ - f_280_) * f_279_;
								f_276_ = f_281_ + (f_284_ - f_281_) * f_279_;
								f_277_ = f_282_ + (f_285_ - f_282_) * f_279_;
								int i_286_ = i_254_ + ((i_257_ - i_254_) * i_270_ >> anInt4775 * 1856651955);
								int i_287_ = i_255_ + ((i_256_ - i_255_) * i_270_ >> anInt4775 * 1856651955);
								i_272_ -= i_286_ + ((i_287_ - i_286_) * i_271_ >> anInt4775 * 1856651955);
							}
							if (i_267_ != -1) {
								int i_288_ = (i_267_ & 0x7f) * i_272_ >> 7;
								if (i_288_ < 2)
									i_288_ = 2;
								else if (i_288_ > 126)
									i_288_ = 126;
								i_273_ = (Class540.anIntArray7136[i_267_ & 0xff80 | i_288_]);
								if ((((Class390_Sub1) this).anInt8539 & 0x7) == 0) {
									f_274_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]) * f_275_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]) * f_276_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]) * f_277_);
									f_274_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769) + (f_274_ * (f_274_ > 0.0F ? (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770) : (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826))));
								}
							}
							Node class282 = null;
							if ((i_263_ & ((Class390_Sub1) this).anInt8529 - 1) == 0 && ((i_264_ & ((Class390_Sub1) this).anInt8529 - 1) == 0))
								class282 = class453.method7530(l);
							int i_289_;
							if (class282 == null) {
								int i_290_;
								if (i_268_ != i_267_) {
									int i_291_ = (i_268_ & 0x7f) * i_272_ >> 7;
									if (i_291_ < 2)
										i_291_ = 2;
									else if (i_291_ > 126)
										i_291_ = 126;
									i_290_ = (Class540.anIntArray7136[i_268_ & 0xff80 | i_291_]);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) == 0) {
										float f_292_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]) * f_275_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]) * f_276_ + ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]) * f_277_));
										f_292_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769) + (f_274_ * (f_274_ > 0.0F ? (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770) : (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826))));
										int i_293_ = i_290_ >> 16 & 0xff;
										int i_294_ = i_290_ >> 8 & 0xff;
										int i_295_ = i_290_ & 0xff;
										i_293_ *= f_292_;
										if (i_293_ < 0)
											i_293_ = 0;
										else if (i_293_ > 255)
											i_293_ = 255;
										i_294_ *= f_292_;
										if (i_294_ < 0)
											i_294_ = 0;
										else if (i_294_ > 255)
											i_294_ = 255;
										i_295_ *= f_292_;
										if (i_295_ < 0)
											i_295_ = 0;
										else if (i_295_ > 255)
											i_295_ = 255;
										i_290_ = (i_293_ << 16 | i_294_ << 8 | i_295_);
									}
								} else
									i_290_ = i_273_;
								if (Stream.method2926()) {
									stream.method2923((float) i_263_);
									stream.method2923((float) (method6709(i_263_, i_264_, -1027450257) + i_269_));
									stream.method2923((float) i_264_);
									stream.method2923((float) i_263_);
									stream.method2923((float) i_264_);
									if ((((Class390_Sub1) this).anIntArrayArrayArray8543) != null)
										stream.method2923(is_242_ != null ? (float) ((is_242_[i_262_]) - 1) : 0.0F);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
										stream.method2923(f_275_);
										stream.method2923(f_276_);
										stream.method2923(f_277_);
									}
								} else {
									stream.method2924((float) i_263_);
									stream.method2924((float) (method6709(i_263_, i_264_, -2114498022) + i_269_));
									stream.method2924((float) i_264_);
									stream.method2924((float) i_263_);
									stream.method2924((float) i_264_);
									if ((((Class390_Sub1) this).anIntArrayArrayArray8543) != null)
										stream.method2924(is_242_ != null ? (float) ((is_242_[i_262_]) - 1) : 0.0F);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
										stream.method2924(f_275_);
										stream.method2924(f_276_);
										stream.method2924(f_277_);
									}
								}
								if ((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8824) == 0)
									stream_231_.method2921(~0xffffff | i_290_);
								else
									stream_231_.method2922(~0xffffff | i_290_);
								i_289_ = ((Class390_Sub1) this).anInt8525++;
								is_261_[i_262_] = (short) i_289_;
								if (i_267_ != -1)
									class282_sub6s[i_289_] = class282_sub6s_236_[i_262_];
								class453.method7534(new Class282_Sub46(is_261_[i_262_]), l);
							} else {
								is_261_[i_262_] = ((Class282_Sub46) class282).aShort8067;
								i_289_ = is_261_[i_262_] & 0xffff;
								if (i_267_ != -1 && ((class282_sub6s_236_[i_262_].aLong3379 * -3442165056282524525L) < (class282_sub6s[i_289_].aLong3379 * -3442165056282524525L)))
									class282_sub6s[i_289_] = class282_sub6s_236_[i_262_];
							}
							for (int i_296_ = 0; i_296_ < i_258_; i_296_++)
								class282_sub6s_233_[i_296_].method12145(i_289_, i_273_, i_272_, f_274_);
							((Class390_Sub1) this).anInt8527++;
						}
					}
				}
			}
			for (int i_297_ = 0; i_297_ < ((Class390_Sub1) this).anInt8525; i_297_++) {
				Class282_Sub6 class282_sub6 = class282_sub6s[i_297_];
				if (class282_sub6 != null)
					class282_sub6.method12143(i_297_);
			}
			for (int i_298_ = 0; i_298_ < anInt4776 * -1843860823; i_298_++) {
				for (int i_299_ = 0; i_299_ < anInt4773 * 1826078169; i_299_++) {
					short[] is_300_ = (((Class390_Sub1) this).aShortArrayArray8534[i_299_ * (anInt4776 * -1843860823) + i_298_]);
					if (is_300_ != null) {
						int i_301_ = 0;
						int i_302_ = 0;
						while (i_302_ < is_300_.length) {
							int i_303_ = is_300_[i_302_++] & 0xffff;
							int i_304_ = is_300_[i_302_++] & 0xffff;
							int i_305_ = is_300_[i_302_++] & 0xffff;
							Class282_Sub6 class282_sub6 = class282_sub6s[i_303_];
							Class282_Sub6 class282_sub6_306_ = class282_sub6s[i_304_];
							Class282_Sub6 class282_sub6_307_ = class282_sub6s[i_305_];
							Class282_Sub6 class282_sub6_308_ = null;
							if (class282_sub6 != null) {
								class282_sub6.method12152(i_298_, i_299_, i_301_);
								class282_sub6_308_ = class282_sub6;
							}
							if (class282_sub6_306_ != null) {
								class282_sub6_306_.method12152(i_298_, i_299_, i_301_);
								if (class282_sub6_308_ == null || ((class282_sub6_306_.aLong3379 * -3442165056282524525L) < (class282_sub6_308_.aLong3379 * -3442165056282524525L)))
									class282_sub6_308_ = class282_sub6_306_;
							}
							if (class282_sub6_307_ != null) {
								class282_sub6_307_.method12152(i_298_, i_299_, i_301_);
								if (class282_sub6_308_ == null || ((class282_sub6_307_.aLong3379 * -3442165056282524525L) < (class282_sub6_308_.aLong3379 * -3442165056282524525L)))
									class282_sub6_308_ = class282_sub6_307_;
							}
							if (class282_sub6_308_ != null) {
								if (class282_sub6 != null)
									class282_sub6_308_.method12143(i_303_);
								if (class282_sub6_306_ != null)
									class282_sub6_308_.method12143(i_304_);
								if (class282_sub6_307_ != null)
									class282_sub6_308_.method12143(i_305_);
								class282_sub6_308_.method12152(i_298_, i_299_, i_301_);
							}
							i_301_++;
						}
					}
				}
			}
			stream.method2925();
			stream_231_.method2925();
			((Class390_Sub1) this).anInterface4_8557 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13994(false);
			((Class390_Sub1) this).anInterface4_8557.method27(((Class390_Sub1) this).anInt8525 * 4, 4, nativeheapbuffer);
			((Class390_Sub1) this).anInterface4_8548 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13994(false);
			((Class390_Sub1) this).anInterface4_8548.method27(((Class390_Sub1) this).anInt8525 * i, i, nativeheapbuffer_230_);
			if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
				if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
					((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) }));
				else
					((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) }));
			} else if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
				((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691 }), new Class72(Class69.aClass69_690) }));
			else
				((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }), new Class72(Class69.aClass69_690) }));
			int i_309_ = 0;
			for (int i_310_ = 0; i_310_ < class282s.length; i_310_++) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282s[i_310_];
				if (((Class282_Sub6) class282_sub6).anInt7508 > 0)
					class282s[i_309_++] = class282_sub6;
			}
			((Class390_Sub1) this).aClass282Array8547 = new Node[i_309_];
			long[] ls = new long[i_309_];
			for (int i_311_ = 0; i_311_ < i_309_; i_311_++) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282s[i_311_];
				ls[i_311_] = class282_sub6.aLong3379 * -3442165056282524525L;
				((Class390_Sub1) this).aClass282Array8547[i_311_] = class282_sub6;
				class282_sub6.method12146(((Class390_Sub1) this).anInt8525);
			}
			Class214.method3669(ls, ((Class390_Sub1) this).aClass282Array8547, 2070243142);
			if (((Class390_Sub1) this).aClass74_8545 != null)
				((Class390_Sub1) this).aClass74_8545.method1312();
		} else
			((Class390_Sub1) this).aClass74_8545 = null;
		if ((((Class390_Sub1) this).anInt8530 & 0x2) == 0) {
			((Class390_Sub1) this).anIntArrayArrayArray8533 = null;
			((Class390_Sub1) this).anIntArrayArrayArray8540 = null;
			((Class390_Sub1) this).anIntArrayArrayArray8538 = null;
		}
		((Class390_Sub1) this).anIntArrayArrayArray8543 = null;
		((Class390_Sub1) this).anIntArrayArrayArray8556 = null;
		((Class390_Sub1) this).anIntArrayArrayArray8532 = null;
		((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541 = null;
		((Class390_Sub1) this).aByteArrayArray8553 = null;
		((Class390_Sub1) this).aClass453_8537 = null;
		((Class390_Sub1) this).aFloatArrayArray8549 = null;
		((Class390_Sub1) this).aFloatArrayArray8551 = null;
		((Class390_Sub1) this).aFloatArrayArray8554 = null;
	}

	public void SA() {
		if (((Class390_Sub1) this).anInt8542 > 0) {
			byte[][] is = (new byte[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
			for (int i = 1; i < anInt4776 * -1843860823; i++) {
				for (int i_312_ = 1; i_312_ < anInt4773 * 1826078169; i_312_++)
					is[i][i_312_] = (byte) (((((Class390_Sub1) this).aByteArrayArray8553[i - 1][i_312_]) >> 2) + ((((Class390_Sub1) this).aByteArrayArray8553[i + 1][i_312_]) >> 3) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_312_ - 1]) >> 2) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_312_ + 1]) >> 3) + ((((Class390_Sub1) this).aByteArrayArray8553[i][i_312_]) >> 1));
			}
			Node[] class282s = new Node[((Class390_Sub1) this).aClass453_8537.method7540(-975751825)];
			((Class390_Sub1) this).aClass453_8537.method7532(class282s, (byte) 55);
			for (int i = 0; i < class282s.length; i++)
				((Class282_Sub6) class282s[i]).method12150(((Class390_Sub1) this).anInt8542);
			int i = 20;
			if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
				i += 4;
			if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0)
				i += 12;
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aNativeHeap8699.method759(((Class390_Sub1) this).anInt8542 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_313_ = ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aNativeHeap8699.method759(((Class390_Sub1) this).anInt8542 * i, false);
			Stream stream = new Stream(nativeheapbuffer_313_);
			Stream stream_314_ = new Stream(nativeheapbuffer);
			Class282_Sub6[] class282_sub6s = new Class282_Sub6[((Class390_Sub1) this).anInt8542];
			int i_315_ = Class51.method1072(((Class390_Sub1) this).anInt8542 / 4, 942119232);
			if (i_315_ < 1)
				i_315_ = 1;
			Class453 class453 = new Class453(i_315_);
			Class282_Sub6[] class282_sub6s_316_ = new Class282_Sub6[((Class390_Sub1) this).anInt8552];
			for (int i_317_ = 0; i_317_ < anInt4776 * -1843860823; i_317_++) {
				for (int i_318_ = 0; i_318_ < anInt4773 * 1826078169; i_318_++) {
					if ((((Class390_Sub1) this).anIntArrayArrayArray8538[i_317_][i_318_]) != null) {
						Class282_Sub6[] class282_sub6s_319_ = (((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541[i_317_][i_318_]);
						int[] is_320_ = (((Class390_Sub1) this).anIntArrayArrayArray8540[i_317_][i_318_]);
						int[] is_321_ = (((Class390_Sub1) this).anIntArrayArrayArray8533[i_317_][i_318_]);
						int[] is_322_ = (((Class390_Sub1) this).anIntArrayArrayArray8556[i_317_][i_318_]);
						int[] is_323_ = (((Class390_Sub1) this).anIntArrayArrayArray8538[i_317_][i_318_]);
						int[] is_324_ = ((((Class390_Sub1) this).anIntArrayArrayArray8532 != null) ? (((Class390_Sub1) this).anIntArrayArrayArray8532[i_317_][i_318_]) : null);
						int[] is_325_ = ((((Class390_Sub1) this).anIntArrayArrayArray8543 != null) ? (((Class390_Sub1) this).anIntArrayArrayArray8543[i_317_][i_318_]) : null);
						if (is_322_ == null)
							is_322_ = is_323_;
						float f = (((Class390_Sub1) this).aFloatArrayArray8554[i_317_][i_318_]);
						float f_326_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_317_][i_318_]);
						float f_327_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_317_][i_318_]);
						float f_328_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_317_][i_318_ + 1]);
						float f_329_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_317_][i_318_ + 1]);
						float f_330_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_317_][i_318_ + 1]);
						float f_331_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_317_ + 1][i_318_ + 1]);
						float f_332_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_317_ + 1][i_318_ + 1]);
						float f_333_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_317_ + 1][i_318_ + 1]);
						float f_334_ = (((Class390_Sub1) this).aFloatArrayArray8554[i_317_ + 1][i_318_]);
						float f_335_ = (((Class390_Sub1) this).aFloatArrayArray8551[i_317_ + 1][i_318_]);
						float f_336_ = (((Class390_Sub1) this).aFloatArrayArray8549[i_317_ + 1][i_318_]);
						int i_337_ = is[i_317_][i_318_] & 0xff;
						int i_338_ = is[i_317_][i_318_ + 1] & 0xff;
						int i_339_ = is[i_317_ + 1][i_318_ + 1] & 0xff;
						int i_340_ = is[i_317_ + 1][i_318_] & 0xff;
						int i_341_ = 0;
						while_170_: for (int i_342_ = 0; i_342_ < is_323_.length; i_342_++) {
							Class282_Sub6 class282_sub6 = class282_sub6s_319_[i_342_];
							for (int i_343_ = 0; i_343_ < i_341_; i_343_++) {
								if (class282_sub6s_316_[i_343_] == class282_sub6)
									continue while_170_;
							}
							class282_sub6s_316_[i_341_++] = class282_sub6;
						}
						short[] is_344_ = (((Class390_Sub1) this).aShortArrayArray8534[(i_318_ * (anInt4776 * -1843860823) + i_317_)] = new short[is_323_.length]);
						for (int i_345_ = 0; i_345_ < is_323_.length; i_345_++) {
							int i_346_ = ((i_317_ << anInt4775 * 1856651955) + is_320_[i_345_]);
							int i_347_ = ((i_318_ << anInt4775 * 1856651955) + is_321_[i_345_]);
							int i_348_ = i_346_ >> ((Class390_Sub1) this).anInt8536;
							int i_349_ = i_347_ >> ((Class390_Sub1) this).anInt8536;
							int i_350_ = is_323_[i_345_];
							int i_351_ = is_322_[i_345_];
							int i_352_ = is_324_ != null ? is_324_[i_345_] : 0;
							long l = ((long) i_351_ << 48 | (long) i_350_ << 32 | (long) (i_348_ << 16) | (long) i_349_);
							int i_353_ = is_320_[i_345_];
							int i_354_ = is_321_[i_345_];
							int i_355_ = 74;
							int i_356_ = 0;
							float f_357_ = 1.0F;
							float f_358_;
							float f_359_;
							float f_360_;
							if (i_353_ == 0 && i_354_ == 0) {
								f_358_ = f;
								f_359_ = f_326_;
								f_360_ = f_327_;
								i_355_ -= i_337_;
							} else if (i_353_ == 0 && i_354_ == anInt4774 * 750971439) {
								f_358_ = f_328_;
								f_359_ = f_329_;
								f_360_ = f_330_;
								i_355_ -= i_338_;
							} else if (i_353_ == anInt4774 * 750971439 && i_354_ == anInt4774 * 750971439) {
								f_358_ = f_331_;
								f_359_ = f_332_;
								f_360_ = f_333_;
								i_355_ -= i_339_;
							} else if (i_353_ == anInt4774 * 750971439 && i_354_ == 0) {
								f_358_ = f_334_;
								f_359_ = f_335_;
								f_360_ = f_336_;
								i_355_ -= i_340_;
							} else {
								float f_361_ = ((float) i_353_ / (float) (anInt4774 * 750971439));
								float f_362_ = ((float) i_354_ / (float) (anInt4774 * 750971439));
								float f_363_ = f + (f_334_ - f) * f_361_;
								float f_364_ = f_326_ + (f_335_ - f_326_) * f_361_;
								float f_365_ = f_327_ + (f_336_ - f_327_) * f_361_;
								float f_366_ = f_328_ + (f_331_ - f_328_) * f_361_;
								float f_367_ = f_329_ + (f_332_ - f_329_) * f_361_;
								float f_368_ = f_330_ + (f_333_ - f_330_) * f_361_;
								f_358_ = f_363_ + (f_366_ - f_363_) * f_362_;
								f_359_ = f_364_ + (f_367_ - f_364_) * f_362_;
								f_360_ = f_365_ + (f_368_ - f_365_) * f_362_;
								int i_369_ = i_337_ + ((i_340_ - i_337_) * i_353_ >> anInt4775 * 1856651955);
								int i_370_ = i_338_ + ((i_339_ - i_338_) * i_353_ >> anInt4775 * 1856651955);
								i_355_ -= i_369_ + ((i_370_ - i_369_) * i_354_ >> anInt4775 * 1856651955);
							}
							if (i_350_ != -1) {
								int i_371_ = (i_350_ & 0x7f) * i_355_ >> 7;
								if (i_371_ < 2)
									i_371_ = 2;
								else if (i_371_ > 126)
									i_371_ = 126;
								i_356_ = (Class540.anIntArray7136[i_350_ & 0xff80 | i_371_]);
								if ((((Class390_Sub1) this).anInt8539 & 0x7) == 0) {
									f_357_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]) * f_358_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]) * f_359_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]) * f_360_);
									f_357_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769) + (f_357_ * (f_357_ > 0.0F ? (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770) : (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826))));
								}
							}
							Node class282 = null;
							if ((i_346_ & ((Class390_Sub1) this).anInt8529 - 1) == 0 && ((i_347_ & ((Class390_Sub1) this).anInt8529 - 1) == 0))
								class282 = class453.method7530(l);
							int i_372_;
							if (class282 == null) {
								int i_373_;
								if (i_351_ != i_350_) {
									int i_374_ = (i_351_ & 0x7f) * i_355_ >> 7;
									if (i_374_ < 2)
										i_374_ = 2;
									else if (i_374_ > 126)
										i_374_ = 126;
									i_373_ = (Class540.anIntArray7136[i_351_ & 0xff80 | i_374_]);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) == 0) {
										float f_375_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]) * f_358_ + (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]) * f_359_ + ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]) * f_360_));
										f_375_ = ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769) + (f_357_ * (f_357_ > 0.0F ? (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770) : (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826))));
										int i_376_ = i_373_ >> 16 & 0xff;
										int i_377_ = i_373_ >> 8 & 0xff;
										int i_378_ = i_373_ & 0xff;
										i_376_ *= f_375_;
										if (i_376_ < 0)
											i_376_ = 0;
										else if (i_376_ > 255)
											i_376_ = 255;
										i_377_ *= f_375_;
										if (i_377_ < 0)
											i_377_ = 0;
										else if (i_377_ > 255)
											i_377_ = 255;
										i_378_ *= f_375_;
										if (i_378_ < 0)
											i_378_ = 0;
										else if (i_378_ > 255)
											i_378_ = 255;
										i_373_ = (i_376_ << 16 | i_377_ << 8 | i_378_);
									}
								} else
									i_373_ = i_356_;
								if (Stream.method2926()) {
									stream.method2923((float) i_346_);
									stream.method2923((float) (method6709(i_346_, i_347_, 2064894909) + i_352_));
									stream.method2923((float) i_347_);
									stream.method2923((float) i_346_);
									stream.method2923((float) i_347_);
									if ((((Class390_Sub1) this).anIntArrayArrayArray8543) != null)
										stream.method2923(is_325_ != null ? (float) ((is_325_[i_345_]) - 1) : 0.0F);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
										stream.method2923(f_358_);
										stream.method2923(f_359_);
										stream.method2923(f_360_);
									}
								} else {
									stream.method2924((float) i_346_);
									stream.method2924((float) (method6709(i_346_, i_347_, 2124462689) + i_352_));
									stream.method2924((float) i_347_);
									stream.method2924((float) i_346_);
									stream.method2924((float) i_347_);
									if ((((Class390_Sub1) this).anIntArrayArrayArray8543) != null)
										stream.method2924(is_325_ != null ? (float) ((is_325_[i_345_]) - 1) : 0.0F);
									if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
										stream.method2924(f_358_);
										stream.method2924(f_359_);
										stream.method2924(f_360_);
									}
								}
								if ((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8824) == 0)
									stream_314_.method2921(~0xffffff | i_373_);
								else
									stream_314_.method2922(~0xffffff | i_373_);
								i_372_ = ((Class390_Sub1) this).anInt8525++;
								is_344_[i_345_] = (short) i_372_;
								if (i_350_ != -1)
									class282_sub6s[i_372_] = class282_sub6s_319_[i_345_];
								class453.method7534(new Class282_Sub46(is_344_[i_345_]), l);
							} else {
								is_344_[i_345_] = ((Class282_Sub46) class282).aShort8067;
								i_372_ = is_344_[i_345_] & 0xffff;
								if (i_350_ != -1 && ((class282_sub6s_319_[i_345_].aLong3379 * -3442165056282524525L) < (class282_sub6s[i_372_].aLong3379 * -3442165056282524525L)))
									class282_sub6s[i_372_] = class282_sub6s_319_[i_345_];
							}
							for (int i_379_ = 0; i_379_ < i_341_; i_379_++)
								class282_sub6s_316_[i_379_].method12145(i_372_, i_356_, i_355_, f_357_);
							((Class390_Sub1) this).anInt8527++;
						}
					}
				}
			}
			for (int i_380_ = 0; i_380_ < ((Class390_Sub1) this).anInt8525; i_380_++) {
				Class282_Sub6 class282_sub6 = class282_sub6s[i_380_];
				if (class282_sub6 != null)
					class282_sub6.method12143(i_380_);
			}
			for (int i_381_ = 0; i_381_ < anInt4776 * -1843860823; i_381_++) {
				for (int i_382_ = 0; i_382_ < anInt4773 * 1826078169; i_382_++) {
					short[] is_383_ = (((Class390_Sub1) this).aShortArrayArray8534[i_382_ * (anInt4776 * -1843860823) + i_381_]);
					if (is_383_ != null) {
						int i_384_ = 0;
						int i_385_ = 0;
						while (i_385_ < is_383_.length) {
							int i_386_ = is_383_[i_385_++] & 0xffff;
							int i_387_ = is_383_[i_385_++] & 0xffff;
							int i_388_ = is_383_[i_385_++] & 0xffff;
							Class282_Sub6 class282_sub6 = class282_sub6s[i_386_];
							Class282_Sub6 class282_sub6_389_ = class282_sub6s[i_387_];
							Class282_Sub6 class282_sub6_390_ = class282_sub6s[i_388_];
							Class282_Sub6 class282_sub6_391_ = null;
							if (class282_sub6 != null) {
								class282_sub6.method12152(i_381_, i_382_, i_384_);
								class282_sub6_391_ = class282_sub6;
							}
							if (class282_sub6_389_ != null) {
								class282_sub6_389_.method12152(i_381_, i_382_, i_384_);
								if (class282_sub6_391_ == null || ((class282_sub6_389_.aLong3379 * -3442165056282524525L) < (class282_sub6_391_.aLong3379 * -3442165056282524525L)))
									class282_sub6_391_ = class282_sub6_389_;
							}
							if (class282_sub6_390_ != null) {
								class282_sub6_390_.method12152(i_381_, i_382_, i_384_);
								if (class282_sub6_391_ == null || ((class282_sub6_390_.aLong3379 * -3442165056282524525L) < (class282_sub6_391_.aLong3379 * -3442165056282524525L)))
									class282_sub6_391_ = class282_sub6_390_;
							}
							if (class282_sub6_391_ != null) {
								if (class282_sub6 != null)
									class282_sub6_391_.method12143(i_386_);
								if (class282_sub6_389_ != null)
									class282_sub6_391_.method12143(i_387_);
								if (class282_sub6_390_ != null)
									class282_sub6_391_.method12143(i_388_);
								class282_sub6_391_.method12152(i_381_, i_382_, i_384_);
							}
							i_384_++;
						}
					}
				}
			}
			stream.method2925();
			stream_314_.method2925();
			((Class390_Sub1) this).anInterface4_8557 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13994(false);
			((Class390_Sub1) this).anInterface4_8557.method27(((Class390_Sub1) this).anInt8525 * 4, 4, nativeheapbuffer);
			((Class390_Sub1) this).anInterface4_8548 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13994(false);
			((Class390_Sub1) this).anInterface4_8548.method27(((Class390_Sub1) this).anInt8525 * i, i, nativeheapbuffer_313_);
			if ((((Class390_Sub1) this).anInt8539 & 0x7) != 0) {
				if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
					((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) }));
				else
					((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) }));
			} else if (((Class390_Sub1) this).anIntArrayArrayArray8543 != null)
				((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691 }), new Class72(Class69.aClass69_690) }));
			else
				((Class390_Sub1) this).aClass70_8550 = (((Class390_Sub1) this).aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }), new Class72(Class69.aClass69_690) }));
			int i_392_ = 0;
			for (int i_393_ = 0; i_393_ < class282s.length; i_393_++) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282s[i_393_];
				if (((Class282_Sub6) class282_sub6).anInt7508 > 0)
					class282s[i_392_++] = class282_sub6;
			}
			((Class390_Sub1) this).aClass282Array8547 = new Node[i_392_];
			long[] ls = new long[i_392_];
			for (int i_394_ = 0; i_394_ < i_392_; i_394_++) {
				Class282_Sub6 class282_sub6 = (Class282_Sub6) class282s[i_394_];
				ls[i_394_] = class282_sub6.aLong3379 * -3442165056282524525L;
				((Class390_Sub1) this).aClass282Array8547[i_394_] = class282_sub6;
				class282_sub6.method12146(((Class390_Sub1) this).anInt8525);
			}
			Class214.method3669(ls, ((Class390_Sub1) this).aClass282Array8547, 1879958043);
			if (((Class390_Sub1) this).aClass74_8545 != null)
				((Class390_Sub1) this).aClass74_8545.method1312();
		} else
			((Class390_Sub1) this).aClass74_8545 = null;
		if ((((Class390_Sub1) this).anInt8530 & 0x2) == 0) {
			((Class390_Sub1) this).anIntArrayArrayArray8533 = null;
			((Class390_Sub1) this).anIntArrayArrayArray8540 = null;
			((Class390_Sub1) this).anIntArrayArrayArray8538 = null;
		}
		((Class390_Sub1) this).anIntArrayArrayArray8543 = null;
		((Class390_Sub1) this).anIntArrayArrayArray8556 = null;
		((Class390_Sub1) this).anIntArrayArrayArray8532 = null;
		((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541 = null;
		((Class390_Sub1) this).aByteArrayArray8553 = null;
		((Class390_Sub1) this).aClass453_8537 = null;
		((Class390_Sub1) this).aFloatArrayArray8549 = null;
		((Class390_Sub1) this).aFloatArrayArray8551 = null;
		((Class390_Sub1) this).aFloatArrayArray8554 = null;
	}

	public void method6720(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub1) this).aClass473_8546.method7877(new Class282_Sub8(((Class390_Sub1) this).aClass505_Sub2_8528, this, class282_sub24, is), 381670108);
	}

	public void u(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_395_, int i_396_, int i_397_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_398_ = (i - (i_395_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_399_ = (i_396_ - (i_395_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1317(class282_sub50_sub17, i_398_, i_399_);
		}
	}

	public void method6717(int i, int i_400_, int i_401_, boolean[][] bools, boolean bool, int i_402_) {
		if (((Class390_Sub1) this).aClass282Array8547 != null) {
			int i_403_ = i_401_ + i_401_ + 1;
			i_403_ *= i_403_;
			if (anIntArray8561.length < i_403_)
				anIntArray8561 = new int[i_403_];
			int i_404_ = i - i_401_;
			int i_405_ = i_404_;
			if (i_404_ < 0)
				i_404_ = 0;
			int i_406_ = i_400_ - i_401_;
			int i_407_ = i_406_;
			if (i_406_ < 0)
				i_406_ = 0;
			int i_408_ = i + i_401_;
			if (i_408_ > anInt4776 * -1843860823 - 1)
				i_408_ = anInt4776 * -1843860823 - 1;
			int i_409_ = i_400_ + i_401_;
			if (i_409_ > anInt4773 * 1826078169 - 1)
				i_409_ = anInt4773 * 1826078169 - 1;
			anInt8560 = 0;
			for (int i_410_ = i_404_; i_410_ <= i_408_; i_410_++) {
				boolean[] bools_411_ = bools[i_410_ - i_405_];
				for (int i_412_ = i_406_; i_412_ <= i_409_; i_412_++) {
					if (bools_411_[i_412_ - i_407_])
						anIntArray8561[anInt8560++] = i_412_ * (anInt4776 * -1843860823) + i_410_;
				}
			}
			ByteBuffer bytebuffer = ((Class390_Sub1) this).aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer.clear();
			for (int i_413_ = 0; i_413_ < ((Class390_Sub1) this).aClass282Array8547.length; i_413_++) {
				Class282_Sub6 class282_sub6 = ((Class282_Sub6) ((Class390_Sub1) this).aClass282Array8547[i_413_]);
				class282_sub6.method12147(anIntArray8561, anInt8560);
			}
			int i_414_ = bytebuffer.position();
			Class48 class48 = (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass48_8794);
			if (i_414_ != 0) {
				Interface32 interface32 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13911(i_414_ / 2);
				interface32.method42(0, i_414_, (((Class390_Sub1) this).aClass505_Sub2_8528.aLong8695));
				((Class390_Sub1) this).aClass505_Sub2_8528.method14004();
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13997(interface32);
				class48.method957(Class384.aClass384_4666);
				if (((Class390_Sub1) this).aClass505_Sub2_8528.anInt8811 > 0) {
					class48.aClass303_460.method5366(0.0F, 0.0F, 1.0F, -(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8813));
					class48.aClass385_457.method6626((float) ((((Class390_Sub1) this).aClass505_Sub2_8528.anInt8810) >> 16 & 0xff) / 255.0F, (float) ((((Class390_Sub1) this).aClass505_Sub2_8528.anInt8810) >> 8 & 0xff) / 255.0F, (float) ((((Class390_Sub1) this).aClass505_Sub2_8528.anInt8810) >> 0 & 0xff) / 255.0F);
					((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6562(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8740);
					((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6520();
					class48.aClass303_460.method5377(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
					class48.aClass303_460.method5387(1.0F / ((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8819) - (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8813)));
				} else {
					class48.aClass303_460.method5366(0.0F, 0.0F, 0.0F, 0.0F);
					class48.aClass385_457.method6626(0.0F, 0.0F, 0.0F);
				}
				if ((((Class390_Sub1) this).anInt8539 & 0x37) == 0) {
					int i_415_ = 0;
					for (int i_416_ = 0; (i_416_ < ((Class390_Sub1) this).aClass282Array8547.length); i_416_++) {
						Class282_Sub6 class282_sub6 = (Class282_Sub6) (((Class390_Sub1) this).aClass282Array8547[i_416_]);
						if (((Class282_Sub6) class282_sub6).anInt7514 != 0) {
							if (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aBool8779) {
								((Class390_Sub1) this).aClass505_Sub2_8528.method8476(0, (((Class282_Sub6) class282_sub6).aClass90_7512));
								class48.aClass303_458.method5366(0.0F, 1.0F, 0.0F, ((float) (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8739) + ((float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt947) * -732614481) / 255.0F * (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081))));
								class48.aClass303_458.method5387(1.0F / (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081));
								class48.aClass385_459.method6626((float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 16 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 8 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 0 & 0xff) / 255.0F);
							} else {
								class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
								class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
							}
							boolean bool_417_ = false;
							if (((Class282_Sub6) class282_sub6).anInt7510 != -1) {
								class48.anInterface6_452 = (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass66_8787.method1283(((Class282_Sub6) class282_sub6).anInt7510));
								Class169 class169 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834.method144((((Class282_Sub6) class282_sub6).anInt7510), -1934981615));
								bool_417_ = !(Class282_Sub41.method13367(class169.aByte2064, (short) 17932));
							} else
								class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
							((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, (((Class282_Sub6) class282_sub6).anInterface4_7516));
							((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
							class48.aClass384_454.method6525(1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F, 1.0F);
							class48.anInt467 = ((Class282_Sub6) class282_sub6).anInt7519;
							class48.anInt468 = (((Class282_Sub6) class282_sub6).anInt7517 - ((Class282_Sub6) class282_sub6).anInt7519 + 1);
							class48.anInt469 = i_415_;
							class48.anInt470 = (((Class282_Sub6) class282_sub6).anInt7514 / 3);
							class48.method946(bool_417_);
							i_415_ += ((Class282_Sub6) class282_sub6).anInt7514;
						}
					}
				} else {
					class48.aClass385_466.method6626((((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[0]), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[1]), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloatArray8747[2]));
					class48.aClass385_448.method6626((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8766)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8767)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8770 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8768)));
					class48.aClass385_464.method6626((-(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826) * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8766)), (-(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826) * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8767)), (-(((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8826) * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8768)));
					class48.aClass385_461.method6626((((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8766)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8767)), (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8769 * (((Class390_Sub1) this).aClass505_Sub2_8528.aFloat8768)));
					int i_418_ = 0;
					for (int i_419_ = 0; (i_419_ < ((Class390_Sub1) this).aClass282Array8547.length); i_419_++) {
						Class282_Sub6 class282_sub6 = (Class282_Sub6) (((Class390_Sub1) this).aClass282Array8547[i_419_]);
						if (((Class282_Sub6) class282_sub6).anInt7514 > 0) {
							if (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aBool8779) {
								((Class390_Sub1) this).aClass505_Sub2_8528.method8476(0, (((Class282_Sub6) class282_sub6).aClass90_7512));
								float f = 0.15F;
								class48.aClass303_458.method5366(0.0F, 1.0F / ((float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081) * f), 0.0F, 256.0F / ((float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt945) * 973144081) * f));
								class48.aClass385_459.method6626((float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 16 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 8 & 0xff) / 255.0F, (float) (((((Class282_Sub6) class282_sub6).aClass90_7512.anInt946) * 1152775735) >> 0 & 0xff) / 255.0F);
							} else {
								class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
								class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
							}
							byte i_420_ = 11;
							if (((Class282_Sub6) class282_sub6).anInt7510 != -1) {
								Class169 class169 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834.method144((((Class282_Sub6) class282_sub6).anInt7510), -1784475659));
								i_420_ = class169.aByte2064;
								class48.anInterface6_452 = (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass66_8787.method1283(((Class282_Sub6) class282_sub6).anInt7510));
								class48.method944(class169);
							} else
								class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
							((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, (((Class282_Sub6) class282_sub6).anInterface4_7516));
							((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
							class48.aClass384_454.method6525(1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F / (((Class282_Sub6) class282_sub6).aFloat7511), 1.0F, 1.0F);
							class48.anInt467 = ((Class282_Sub6) class282_sub6).anInt7519;
							class48.anInt468 = (((Class282_Sub6) class282_sub6).anInt7517 - ((Class282_Sub6) class282_sub6).anInt7519 + 1);
							class48.anInt469 = i_418_;
							class48.anInt470 = (((Class282_Sub6) class282_sub6).anInt7514 / 3);
							switch (i_420_) {
							case 1:
								class48.aClass385_455.method6626((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[12]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[13]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[14]));
								class48.method948(0);
								break;
							case 6:
								class48.method946(!Class282_Sub41.method13367(i_420_, (short) 27875));
								break;
							case 7:
								class48.aClass385_455.method6626((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[12]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[13]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[14]));
								class48.aClass384_465.method6518();
								class48.anInterface31_451 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13965();
								class48.method949(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class390_Sub1) this).aClass505_Sub2_8528.aBool8692) && (((Class390_Sub1) this).anInt8539 & 0x8) != 0) {
									Class41_Sub1_Sub1 class41_sub1_sub1 = (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass41_Sub1_Sub1_8691);
									class41_sub1_sub1.aClass384_10090.method6562(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8729);
									class41_sub1_sub1.aClass384_10091.method6525(1.0F / (((Class282_Sub6) class282_sub6).aFloat7511 * (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt949) * -323415275)), 1.0F / (((Class282_Sub6) class282_sub6).aFloat7511 * (float) ((((Class282_Sub6) class282_sub6).aClass90_7512.anInt949) * -323415275)), 1.0F, 1.0F);
									class41_sub1_sub1.aClass385_10089.method6626((((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[12]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[13]), (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass384_8814.aFloatArray4667[14]));
									Class169 class169 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface22_5834.method144((((Class282_Sub6) class282_sub6).anInt7510), -2062913457));
									class41_sub1_sub1.anInt10095 = class169.aByte2076 * -430601887;
									class41_sub1_sub1.anInt10110 = (((Class282_Sub6) class282_sub6).anInt7519) * -939296569;
									class41_sub1_sub1.anInt10111 = ((((Class282_Sub6) class282_sub6).anInt7517) - (((Class282_Sub6) class282_sub6).anInt7519) + 1) * -1096006599;
									class41_sub1_sub1.anInt10094 = i_418_ * -1526620181;
									class41_sub1_sub1.anInt10112 = (((Class282_Sub6) class282_sub6).anInt7514) / 3 * -1855853283;
									class41_sub1_sub1.aClass303_10103.method5367(class48.aClass303_458);
									class41_sub1_sub1.aClass385_10086.method6627(class48.aClass385_459);
									class41_sub1_sub1.aClass303_10107.method5367(class48.aClass303_460);
									class41_sub1_sub1.aClass385_10109.method6627(class48.aClass385_457);
									class41_sub1_sub1.method15520(-1989775919);
								} else
									class48.method965(0);
								break;
							default:
								if (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aBool8779)
									class48.method950();
								else
									class48.method965(0);
							}
							i_418_ += ((Class282_Sub6) class282_sub6).anInt7514;
						}
					}
				}
			}
			if (((Class390_Sub1) this).aClass74_8545 != null) {
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, ((Class390_Sub1) this).anInterface4_8557);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
				Class384 class384 = (((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
				class384.method6518();
				class384.aFloatArray4667[13] = -1.0F;
				class48.method957(class384);
				((Class390_Sub1) this).aClass74_8545.method1314(class48, i, i_400_, i_401_, bools, bool);
			}
		}
	}

	public boolean method6719(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_421_, int i_422_, int i_423_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 == null || class282_sub50_sub17 == null)
			return false;
		int i_424_ = (i - (i_421_ * ((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8777 >> 8) >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		int i_425_ = (i_422_ - (i_421_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8778) >> 8) >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806));
		return ((Class390_Sub1) this).aClass74_8545.method1316(class282_sub50_sub17, i_424_, i_425_);
	}

	Class390_Sub1(Class505_Sub2 class505_sub2, int i, int i_426_, int i_427_, int i_428_, int[][] is, int[][] is_429_, int i_430_) {
		super(i_427_, i_428_, i_430_, is);
		((Class390_Sub1) this).aClass505_Sub2_8528 = class505_sub2;
		((Class390_Sub1) this).anInt8536 = anInt4775 * 1856651955 - 2;
		((Class390_Sub1) this).anInt8529 = 1 << ((Class390_Sub1) this).anInt8536;
		((Class390_Sub1) this).anInt8530 = i;
		((Class390_Sub1) this).anInt8539 = i_426_;
		((Class390_Sub1) this).anIntArrayArrayArray8532 = new int[i_427_][i_428_][];
		((Class390_Sub1) this).aClass282_Sub6ArrayArrayArray8541 = new Class282_Sub6[i_427_][i_428_][];
		((Class390_Sub1) this).anIntArrayArrayArray8540 = new int[i_427_][i_428_][];
		((Class390_Sub1) this).anIntArrayArrayArray8533 = new int[i_427_][i_428_][];
		((Class390_Sub1) this).anIntArrayArrayArray8538 = new int[i_427_][i_428_][];
		((Class390_Sub1) this).anIntArrayArrayArray8556 = new int[i_427_][i_428_][];
		((Class390_Sub1) this).aShortArrayArray8534 = new short[i_427_ * i_428_][];
		((Class390_Sub1) this).aByteArrayArray8531 = new byte[i_427_][i_428_];
		((Class390_Sub1) this).aByteArrayArray8553 = new byte[i_427_ + 1][i_428_ + 1];
		((Class390_Sub1) this).aFloatArrayArray8554 = (new float[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
		((Class390_Sub1) this).aFloatArrayArray8551 = (new float[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
		((Class390_Sub1) this).aFloatArrayArray8549 = (new float[anInt4776 * -1843860823 + 1][anInt4773 * 1826078169 + 1]);
		for (int i_431_ = 0; i_431_ <= anInt4773 * 1826078169; i_431_++) {
			for (int i_432_ = 0; i_432_ <= anInt4776 * -1843860823; i_432_++) {
				int i_433_ = anIntArrayArray4772[i_432_][i_431_];
				if ((float) i_433_ < ((Class390_Sub1) this).aFloat8535)
					((Class390_Sub1) this).aFloat8535 = (float) i_433_;
				if ((float) i_433_ > ((Class390_Sub1) this).aFloat8544)
					((Class390_Sub1) this).aFloat8544 = (float) i_433_;
				if (i_432_ > 0 && i_431_ > 0 && i_432_ < anInt4776 * -1843860823 && i_431_ < anInt4773 * 1826078169) {
					int i_434_ = (is_429_[i_432_ + 1][i_431_] - is_429_[i_432_ - 1][i_431_]);
					int i_435_ = (is_429_[i_432_][i_431_ + 1] - is_429_[i_432_][i_431_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_434_ * i_434_ + 4 * i_430_ * i_430_ + i_435_ * i_435_)));
					((Class390_Sub1) this).aFloatArrayArray8554[i_432_][i_431_] = (float) i_434_ * f;
					((Class390_Sub1) this).aFloatArrayArray8551[i_432_][i_431_] = (float) (-i_430_ * 2) * f;
					((Class390_Sub1) this).aFloatArrayArray8549[i_432_][i_431_] = (float) i_435_ * f;
				}
			}
		}
		((Class390_Sub1) this).aFloat8535--;
		((Class390_Sub1) this).aFloat8544++;
		((Class390_Sub1) this).aClass453_8537 = new Class453(128);
		if ((((Class390_Sub1) this).anInt8539 & 0x10) != 0)
			((Class390_Sub1) this).aClass74_8545 = new Class74(((Class390_Sub1) this).aClass505_Sub2_8528, this);
	}

	public void a(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_436_, int i_437_, int i_438_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_439_ = (i - (i_436_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_440_ = (i_437_ - (i_436_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1315(class282_sub50_sub17, i_439_, i_440_);
		}
	}

	public void b(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_441_, int i_442_, int i_443_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_444_ = (i - (i_441_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_445_ = (i_442_ - (i_441_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1315(class282_sub50_sub17, i_444_, i_445_);
		}
	}

	public void method6708(int i, int i_446_, int[] is, int[] is_447_, int[] is_448_, int[] is_449_, int[] is_450_, int[] is_451_, int[] is_452_, int[] is_453_, int[] is_454_, int[] is_455_, int[] is_456_, Class90 class90, boolean bool) {
		int i_457_ = is_453_.length;
		int[] is_458_ = new int[i_457_ * 3];
		int[] is_459_ = new int[i_457_ * 3];
		int[] is_460_ = new int[i_457_ * 3];
		int[] is_461_ = new int[i_457_ * 3];
		int[] is_462_ = new int[i_457_ * 3];
		int[] is_463_ = new int[i_457_ * 3];
		int[] is_464_ = is_447_ != null ? new int[i_457_ * 3] : null;
		int[] is_465_ = is_449_ != null ? new int[i_457_ * 3] : null;
		int i_466_ = 0;
		for (int i_467_ = 0; i_467_ < i_457_; i_467_++) {
			int i_468_ = is_450_[i_467_];
			int i_469_ = is_451_[i_467_];
			int i_470_ = is_452_[i_467_];
			is_458_[i_466_] = is[i_468_];
			is_459_[i_466_] = is_448_[i_468_];
			is_460_[i_466_] = is_453_[i_467_];
			is_462_[i_466_] = is_455_[i_467_];
			is_463_[i_466_] = is_456_[i_467_];
			is_461_[i_466_] = is_454_ != null ? is_454_[i_467_] : is_453_[i_467_];
			if (is_447_ != null)
				is_464_[i_466_] = is_447_[i_468_];
			if (is_449_ != null)
				is_465_[i_466_] = is_449_[i_468_];
			i_466_++;
			is_458_[i_466_] = is[i_469_];
			is_459_[i_466_] = is_448_[i_469_];
			is_460_[i_466_] = is_453_[i_467_];
			is_462_[i_466_] = is_455_[i_467_];
			is_463_[i_466_] = is_456_[i_467_];
			is_461_[i_466_] = is_454_ != null ? is_454_[i_467_] : is_453_[i_467_];
			if (is_447_ != null)
				is_464_[i_466_] = is_447_[i_469_];
			if (is_449_ != null)
				is_465_[i_466_] = is_449_[i_469_];
			i_466_++;
			is_458_[i_466_] = is[i_470_];
			is_459_[i_466_] = is_448_[i_470_];
			is_460_[i_466_] = is_453_[i_467_];
			is_462_[i_466_] = is_455_[i_467_];
			is_463_[i_466_] = is_456_[i_467_];
			is_461_[i_466_] = is_454_ != null ? is_454_[i_467_] : is_453_[i_467_];
			if (is_447_ != null)
				is_464_[i_466_] = is_447_[i_470_];
			if (is_449_ != null)
				is_465_[i_466_] = is_449_[i_470_];
			i_466_++;
		}
		method6707(i, i_446_, is_458_, is_464_, is_459_, is_465_, is_460_, is_461_, is_462_, is_463_, class90, bool);
	}

	public void method6713(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub1) this).aClass473_8546.method7877(new Class282_Sub8(((Class390_Sub1) this).aClass505_Sub2_8528, this, class282_sub24, is), 246185889);
	}

	public void method6721(Class282_Sub24 class282_sub24, int[] is) {
		((Class390_Sub1) this).aClass473_8546.method7877(new Class282_Sub8(((Class390_Sub1) this).aClass505_Sub2_8528, this, class282_sub24, is), 468694400);
	}

	public void UA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_471_, int i_472_, int i_473_, boolean bool) {
		if (((Class390_Sub1) this).aClass74_8545 != null && class282_sub50_sub17 != null) {
			int i_474_ = (i - (i_471_ * (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8777) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			int i_475_ = (i_472_ - (i_471_ * (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8778) >> 8) >> ((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			((Class390_Sub1) this).aClass74_8545.method1317(class282_sub50_sub17, i_474_, i_475_);
		}
	}

	public void method6710(int i, int i_476_, int i_477_, int i_478_, int i_479_, int i_480_, int i_481_, boolean[][] bools) {
		if (((Class390_Sub1) this).anInt8542 > 0) {
			Interface32 interface32 = ((Class390_Sub1) this).aClass505_Sub2_8528.method13911(((Class390_Sub1) this).anInt8527);
			int i_482_ = 0;
			int i_483_ = 32767;
			int i_484_ = -32768;
			ByteBuffer bytebuffer = ((Class390_Sub1) this).aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer.clear();
			for (int i_485_ = i_479_; i_485_ < i_481_; i_485_++) {
				int i_486_ = i_485_ * (anInt4776 * -1843860823) + i_478_;
				for (int i_487_ = i_478_; i_487_ < i_480_; i_487_++) {
					if (bools[i_487_ - i_478_][i_485_ - i_479_]) {
						short[] is = (((Class390_Sub1) this).aShortArrayArray8534[i_486_]);
						if (is != null) {
							for (int i_488_ = 0; i_488_ < is.length; i_488_++) {
								int i_489_ = is[i_488_] & 0xffff;
								if (i_489_ > i_484_)
									i_484_ = i_489_;
								if (i_489_ < i_483_)
									i_483_ = i_489_;
								bytebuffer.putShort((short) i_489_);
								i_482_++;
							}
						}
					}
					i_486_++;
				}
			}
			interface32.method42(0, bytebuffer.position(), (((Class390_Sub1) this).aClass505_Sub2_8528.aLong8695));
			if (i_482_ > 0) {
				((Class390_Sub1) this).aClass505_Sub2_8528.method14004();
				Class48 class48 = (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass48_8794);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(0, ((Class390_Sub1) this).anInterface4_8548);
				((Class390_Sub1) this).aClass505_Sub2_8528.method14161(1, ((Class390_Sub1) this).anInterface4_8557);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13996(((Class390_Sub1) this).aClass70_8550);
				((Class390_Sub1) this).aClass505_Sub2_8528.method13997(interface32);
				((Class390_Sub1) this).aClass505_Sub2_8528.method8457(Class294.aClass294_3518);
				float f = (float) ((Class390_Sub1) this).aClass505_Sub2_8528.method8523((byte) 105).method2714();
				float f_490_ = (float) ((Class390_Sub1) this).aClass505_Sub2_8528.method8523((byte) 126).method2716();
				Class294 class294 = new Class294();
				Class294 class294_491_ = new Class294();
				class294.method5214(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class294_491_.method5259((float) i_477_ / (256.0F * (float) (anInt4774 * 750971439)), (float) -i_477_ / (256.0F * (float) (anInt4774 * 750971439)), 1.0F / (((Class390_Sub1) this).aFloat8544 - ((Class390_Sub1) this).aFloat8535));
				class294_491_.method5219((float) i - (float) (i_478_ * i_477_) / 256.0F, (float) i_476_ + (float) (i_481_ * i_477_) / 256.0F, (-((Class390_Sub1) this).aFloat8535 / (((Class390_Sub1) this).aFloat8544 - ((Class390_Sub1) this).aFloat8535)));
				class294_491_.method5247(2.0F / f, 2.0F / f_490_, 1.0F);
				class294_491_.method5219(-1.0F, -1.0F, 0.0F);
				((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).aClass294_8713.method5261(class294, class294_491_);
				((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683.method6522(((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).aClass294_8713);
				((Class390_Sub1) this).aClass505_Sub2_8528.method8424(((Class390_Sub1) this).aClass505_Sub2_8528.aClass384_8683);
				class48.method957(Class384.aClass384_4666);
				class48.aClass303_460.method5366(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_457.method6626(0.0F, 0.0F, 0.0F);
				class48.aClass303_458.method5366(0.0F, 0.0F, 0.0F, 0.0F);
				class48.aClass385_459.method6626(0.0F, 0.0F, 0.0F);
				class48.anInterface6_452 = (((Class390_Sub1) this).aClass505_Sub2_8528.anInterface6_8788);
				class48.aClass384_454.method6518();
				class48.anInt467 = i_483_;
				class48.anInt468 = i_484_ - i_483_ + 1;
				class48.anInt469 = 0;
				class48.anInt470 = i_482_ / 3;
				class48.method946(false);
			}
		}
	}

	void method13792(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2, int i, int i_492_) {
		int[] is = ((Class390_Sub1) this).anIntArrayArrayArray8540[i][i_492_];
		int[] is_493_ = ((Class390_Sub1) this).anIntArrayArrayArray8533[i][i_492_];
		int i_494_ = is.length;
		if (anIntArray8558.length < i_494_) {
			anIntArray8558 = new int[i_494_];
			anIntArray8559 = new int[i_494_];
		}
		for (int i_495_ = 0; i_495_ < i_494_; i_495_++) {
			anIntArray8558[i_495_] = is[i_495_] >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			anIntArray8559[i_495_] = is_493_[i_495_] >> (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8806);
		}
		int i_496_ = 0;
		while (i_496_ < i_494_) {
			int i_497_ = anIntArray8558[i_496_];
			int i_498_ = anIntArray8559[i_496_++];
			int i_499_ = anIntArray8558[i_496_];
			int i_500_ = anIntArray8559[i_496_++];
			int i_501_ = anIntArray8558[i_496_];
			int i_502_ = anIntArray8559[i_496_++];
			if (((i_497_ - i_499_) * (i_500_ - i_502_) - (i_500_ - i_498_) * (i_501_ - i_499_)) > 0)
				class282_sub50_sub17_sub2.method16043(i_498_, i_500_, i_502_, i_497_, i_499_, i_501_);
		}
	}

	void method13793(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2, int i, int i_503_) {
		int[] is = ((Class390_Sub1) this).anIntArrayArrayArray8540[i][i_503_];
		int[] is_504_ = ((Class390_Sub1) this).anIntArrayArrayArray8533[i][i_503_];
		int i_505_ = is.length;
		if (anIntArray8558.length < i_505_) {
			anIntArray8558 = new int[i_505_];
			anIntArray8559 = new int[i_505_];
		}
		for (int i_506_ = 0; i_506_ < i_505_; i_506_++) {
			anIntArray8558[i_506_] = is[i_506_] >> (((Class505_Sub2) ((Class390_Sub1) this).aClass505_Sub2_8528).anInt8806);
			anIntArray8559[i_506_] = is_504_[i_506_] >> (((Class505_Sub2) (((Class390_Sub1) this).aClass505_Sub2_8528)).anInt8806);
		}
		int i_507_ = 0;
		while (i_507_ < i_505_) {
			int i_508_ = anIntArray8558[i_507_];
			int i_509_ = anIntArray8559[i_507_++];
			int i_510_ = anIntArray8558[i_507_];
			int i_511_ = anIntArray8559[i_507_++];
			int i_512_ = anIntArray8558[i_507_];
			int i_513_ = anIntArray8559[i_507_++];
			if (((i_508_ - i_510_) * (i_511_ - i_513_) - (i_511_ - i_509_) * (i_512_ - i_510_)) > 0)
				class282_sub50_sub17_sub2.method16043(i_509_, i_511_, i_513_, i_508_, i_510_, i_512_);
		}
	}
}
