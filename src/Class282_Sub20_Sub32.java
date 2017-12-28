/* Class282_Sub20_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub32 extends Class282_Sub20 {
	int anInt9918 = 0;
	int anInt9919 = 0;
	static final int anInt9920 = 0;
	int anInt9921;
	int anInt9922;
	int anInt9923 = 0;
	int anInt9924;
	int anInt9925;
	int anInt9926;
	int anInt9927;
	static final int anInt9928 = 0;
	static final int anInt9929 = 0;

	int[][] method12320(int i, int i_0_) {
		int[][] is = aClass308_7670.method5463(i, 1739849302);
		if (aClass308_7670.aBool3619) {
			int[][] is_1_ = method12333(0, i, (byte) 3);
			int[] is_2_ = is_1_[0];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			int[] is_5_ = is[0];
			int[] is_6_ = is[1];
			int[] is_7_ = is[2];
			for (int i_8_ = 0; i_8_ < -402153223 * Class316.anInt3670; i_8_++) {
				method15400(is_2_[i_8_], is_3_[i_8_], is_4_[i_8_], 2137436885);
				((Class282_Sub20_Sub32) this).anInt9922 += ((Class282_Sub20_Sub32) this).anInt9918 * 1296259937;
				((Class282_Sub20_Sub32) this).anInt9925 += -519301681 * ((Class282_Sub20_Sub32) this).anInt9919;
				((Class282_Sub20_Sub32) this).anInt9926 += ((Class282_Sub20_Sub32) this).anInt9923 * 1817235929;
				for (/**/; ((Class282_Sub20_Sub32) this).anInt9922 * 1624510419 < 0; ((Class282_Sub20_Sub32) this).anInt9922 += -1039814656) {
					/* empty */
				}
				for (/**/; (((Class282_Sub20_Sub32) this).anInt9922 * 1624510419 > 4096); ((Class282_Sub20_Sub32) this).anInt9922 -= -1039814656) {
					/* empty */
				}
				if (((Class282_Sub20_Sub32) this).anInt9925 * 1295894125 < 0)
					((Class282_Sub20_Sub32) this).anInt9925 = 0;
				if (((Class282_Sub20_Sub32) this).anInt9925 * 1295894125 > 4096)
					((Class282_Sub20_Sub32) this).anInt9925 = -751415296;
				if (((Class282_Sub20_Sub32) this).anInt9926 * 436200993 < 0)
					((Class282_Sub20_Sub32) this).anInt9926 = 0;
				if (((Class282_Sub20_Sub32) this).anInt9926 * 436200993 > 4096)
					((Class282_Sub20_Sub32) this).anInt9926 = 1373507584;
				method15401(((Class282_Sub20_Sub32) this).anInt9922 * 1624510419, 1295894125 * ((Class282_Sub20_Sub32) this).anInt9925, ((Class282_Sub20_Sub32) this).anInt9926 * 436200993, (byte) 101);
				is_5_[i_8_] = -1638446381 * ((Class282_Sub20_Sub32) this).anInt9927;
				is_6_[i_8_] = ((Class282_Sub20_Sub32) this).anInt9921 * -649442587;
				is_7_[i_8_] = -680551435 * ((Class282_Sub20_Sub32) this).anInt9924;
			}
		}
		return is;
	}

	public Class282_Sub20_Sub32() {
		super(1, false);
	}

	void method15400(int i, int i_9_, int i_10_, int i_11_) {
		int i_12_ = i > i_9_ ? i : i_9_;
		i_12_ = i_10_ > i_12_ ? i_10_ : i_12_;
		int i_13_ = i < i_9_ ? i : i_9_;
		i_13_ = i_10_ < i_13_ ? i_10_ : i_13_;
		int i_14_ = i_12_ - i_13_;
		((Class282_Sub20_Sub32) this).anInt9926 = -1637540383 * ((i_13_ + i_12_) / 2);
		if (436200993 * ((Class282_Sub20_Sub32) this).anInt9926 > 0 && 436200993 * ((Class282_Sub20_Sub32) this).anInt9926 < 4096)
			((Class282_Sub20_Sub32) this).anInt9925 = ((i_14_ << 12) / ((((Class282_Sub20_Sub32) this).anInt9926 * 436200993 <= 2048) ? ((Class282_Sub20_Sub32) this).anInt9926 * 872401986 : 8192 - (((Class282_Sub20_Sub32) this).anInt9926 * 872401986)) * 484258661);
		else
			((Class282_Sub20_Sub32) this).anInt9925 = 0;
		if (i_14_ > 0) {
			int i_15_ = (i_12_ - i << 12) / i_14_;
			int i_16_ = (i_12_ - i_9_ << 12) / i_14_;
			int i_17_ = (i_12_ - i_10_ << 12) / i_14_;
			if (i_12_ == i)
				((Class282_Sub20_Sub32) this).anInt9922 = 541859931 * (i_13_ == i_9_ ? 20480 + i_17_ : 4096 - i_16_);
			else if (i_12_ == i_9_)
				((Class282_Sub20_Sub32) this).anInt9922 = 541859931 * (i_10_ == i_13_ ? 4096 + i_15_ : 12288 - i_17_);
			else
				((Class282_Sub20_Sub32) this).anInt9922 = 541859931 * (i_13_ == i ? i_16_ + 12288 : 20480 - i_15_);
			((Class282_Sub20_Sub32) this).anInt9922 = (((Class282_Sub20_Sub32) this).anInt9922 * 1624510419 / 6 * 541859931);
		} else
			((Class282_Sub20_Sub32) this).anInt9922 = 0;
	}

	void method15401(int i, int i_18_, int i_19_, byte i_20_) {
		int i_21_ = (i_19_ <= 2048 ? i_19_ * (i_18_ + 4096) >> 12 : i_19_ + i_18_ - (i_19_ * i_18_ >> 12));
		if (i_21_ > 0) {
			i *= 6;
			int i_22_ = i_19_ + i_19_ - i_21_;
			int i_23_ = (i_21_ - i_22_ << 12) / i_21_;
			int i_24_ = i >> 12;
			int i_25_ = i - (i_24_ << 12);
			int i_26_ = i_21_;
			i_26_ = i_23_ * i_26_ >> 12;
			i_26_ = i_25_ * i_26_ >> 12;
			int i_27_ = i_22_ + i_26_;
			int i_28_ = i_21_ - i_26_;
			switch (i_24_) {
			case 3:
				((Class282_Sub20_Sub32) this).anInt9927 = i_22_ * 1115135323;
				((Class282_Sub20_Sub32) this).anInt9921 = -41327891 * i_28_;
				((Class282_Sub20_Sub32) this).anInt9924 = 864286813 * i_21_;
				break;
			case 0:
				((Class282_Sub20_Sub32) this).anInt9927 = i_21_ * 1115135323;
				((Class282_Sub20_Sub32) this).anInt9921 = i_27_ * -41327891;
				((Class282_Sub20_Sub32) this).anInt9924 = 864286813 * i_22_;
				break;
			case 2:
				((Class282_Sub20_Sub32) this).anInt9927 = i_22_ * 1115135323;
				((Class282_Sub20_Sub32) this).anInt9921 = i_21_ * -41327891;
				((Class282_Sub20_Sub32) this).anInt9924 = i_27_ * 864286813;
				break;
			case 4:
				((Class282_Sub20_Sub32) this).anInt9927 = 1115135323 * i_27_;
				((Class282_Sub20_Sub32) this).anInt9921 = -41327891 * i_22_;
				((Class282_Sub20_Sub32) this).anInt9924 = i_21_ * 864286813;
				break;
			case 1:
				((Class282_Sub20_Sub32) this).anInt9927 = i_28_ * 1115135323;
				((Class282_Sub20_Sub32) this).anInt9921 = -41327891 * i_21_;
				((Class282_Sub20_Sub32) this).anInt9924 = 864286813 * i_22_;
				break;
			case 5:
				((Class282_Sub20_Sub32) this).anInt9927 = 1115135323 * i_21_;
				((Class282_Sub20_Sub32) this).anInt9921 = i_22_ * -41327891;
				((Class282_Sub20_Sub32) this).anInt9924 = i_28_ * 864286813;
				break;
			}
		} else
			((Class282_Sub20_Sub32) this).anInt9927 = (((Class282_Sub20_Sub32) this).anInt9921 = (((Class282_Sub20_Sub32) this).anInt9924 = i_19_ * 864286813) * -1021039663) * -1479929753;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_29_) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub32) this).anInt9919 = ((class282_sub35.readByte((short) -12324) << 12) / 100 * 55567499);
			break;
		case 2:
			((Class282_Sub20_Sub32) this).anInt9923 = ((class282_sub35.readByte((short) -14943) << 12) / 100 * 1534074697);
			break;
		case 0:
			((Class282_Sub20_Sub32) this).anInt9918 = class282_sub35.readShort(2037252957) * 1050194235;
			break;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub32) this).anInt9919 = ((class282_sub35.readByte((short) -22896) << 12) / 100 * 55567499);
			break;
		case 2:
			((Class282_Sub20_Sub32) this).anInt9923 = ((class282_sub35.readByte((short) -14520) << 12) / 100 * 1534074697);
			break;
		case 0:
			((Class282_Sub20_Sub32) this).anInt9918 = class282_sub35.readShort(1616498821) * 1050194235;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub32) this).anInt9919 = ((class282_sub35.readByte((short) -31784) << 12) / 100 * 55567499);
			break;
		case 2:
			((Class282_Sub20_Sub32) this).anInt9923 = ((class282_sub35.readByte((short) -26352) << 12) / 100 * 1534074697);
			break;
		case 0:
			((Class282_Sub20_Sub32) this).anInt9918 = class282_sub35.readShort(2091282143) * 1050194235;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub32) this).anInt9919 = ((class282_sub35.readByte((short) -26723) << 12) / 100 * 55567499);
			break;
		case 2:
			((Class282_Sub20_Sub32) this).anInt9923 = ((class282_sub35.readByte((short) -10470) << 12) / 100 * 1534074697);
			break;
		case 0:
			((Class282_Sub20_Sub32) this).anInt9918 = class282_sub35.readShort(1837363752) * 1050194235;
			break;
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 2064254664);
		if (aClass308_7670.aBool3619) {
			int[][] is_30_ = method12333(0, i, (byte) 3);
			int[] is_31_ = is_30_[0];
			int[] is_32_ = is_30_[1];
			int[] is_33_ = is_30_[2];
			int[] is_34_ = is[0];
			int[] is_35_ = is[1];
			int[] is_36_ = is[2];
			for (int i_37_ = 0; i_37_ < -402153223 * Class316.anInt3670; i_37_++) {
				method15400(is_31_[i_37_], is_32_[i_37_], is_33_[i_37_], 1988723353);
				((Class282_Sub20_Sub32) this).anInt9922 += ((Class282_Sub20_Sub32) this).anInt9918 * 1296259937;
				((Class282_Sub20_Sub32) this).anInt9925 += -519301681 * ((Class282_Sub20_Sub32) this).anInt9919;
				((Class282_Sub20_Sub32) this).anInt9926 += ((Class282_Sub20_Sub32) this).anInt9923 * 1817235929;
				for (/**/; ((Class282_Sub20_Sub32) this).anInt9922 * 1624510419 < 0; ((Class282_Sub20_Sub32) this).anInt9922 += -1039814656) {
					/* empty */
				}
				for (/**/; (((Class282_Sub20_Sub32) this).anInt9922 * 1624510419 > 4096); ((Class282_Sub20_Sub32) this).anInt9922 -= -1039814656) {
					/* empty */
				}
				if (((Class282_Sub20_Sub32) this).anInt9925 * 1295894125 < 0)
					((Class282_Sub20_Sub32) this).anInt9925 = 0;
				if (((Class282_Sub20_Sub32) this).anInt9925 * 1295894125 > 4096)
					((Class282_Sub20_Sub32) this).anInt9925 = -751415296;
				if (((Class282_Sub20_Sub32) this).anInt9926 * 436200993 < 0)
					((Class282_Sub20_Sub32) this).anInt9926 = 0;
				if (((Class282_Sub20_Sub32) this).anInt9926 * 436200993 > 4096)
					((Class282_Sub20_Sub32) this).anInt9926 = 1373507584;
				method15401(((Class282_Sub20_Sub32) this).anInt9922 * 1624510419, 1295894125 * ((Class282_Sub20_Sub32) this).anInt9925, ((Class282_Sub20_Sub32) this).anInt9926 * 436200993, (byte) 109);
				is_34_[i_37_] = -1638446381 * ((Class282_Sub20_Sub32) this).anInt9927;
				is_35_[i_37_] = ((Class282_Sub20_Sub32) this).anInt9921 * -649442587;
				is_36_[i_37_] = -680551435 * ((Class282_Sub20_Sub32) this).anInt9924;
			}
		}
		return is;
	}
}
