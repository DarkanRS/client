
/* Class282_Sub20_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class282_Sub20_Sub34 extends Class282_Sub20 {
	static final int anInt9944 = 4;
	static final int anInt9945 = 0;
	static final int anInt9946 = 2;
	static final int anInt9947 = 1;
	static final int anInt9948 = 2;
	int anInt9949;
	static final int anInt9950 = 0;
	static final int anInt9951 = 3;
	static final int anInt9952 = 4;
	static final int anInt9953 = 5;
	static final int anInt9954 = 2;
	static final int anInt9955 = 2048;
	static final int anInt9956 = 3;
	static final int anInt9957 = 5;
	static final int anInt9958 = 1;
	int anInt9959 = 0;
	int anInt9960 = -762140672;
	int anInt9961 = 2063794081;
	int anInt9962 = -337310717;
	int anInt9963 = -807914438;
	static final int anInt9964 = 1;
	byte[] aByteArray9965;
	short[] aShortArray9966;
	public static String aString9967;

	void method12318() {
		((Class282_Sub20_Sub34) this).aByteArray9965 = Class316.method5588((1710257715 * ((Class282_Sub20_Sub34) this).anInt9959), 1567906594);
		method15412(1475454393);
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -956244470);
		if (aClass320_7667.aBool3722) {
			int i_1_ = 2048 + (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319 * Class316.anIntArray3668[i]);
			int i_2_ = i_1_ >> 12;
			int i_3_ = 1 + i_2_;
			for (int i_4_ = 0; i_4_ < -402153223 * Class316.anInt3670; i_4_++) {
				Class282_Sub11_Sub2.anInt10003 = 1812780851;
				Class390.anInt4777 = 8865191;
				Class10.anInt118 = 417846953;
				Class368.anInt4266 = 373952301;
				int i_5_ = ((Class316.anIntArray3672[i_4_] * (-783993371 * ((Class282_Sub20_Sub34) this).anInt9961)) + 2048);
				int i_6_ = i_5_ >> 12;
				int i_7_ = i_6_ + 1;
				for (int i_8_ = i_2_ - 1; i_8_ <= i_3_; i_8_++) {
					int i_9_ = ((((Class282_Sub20_Sub34) this).aByteArray9965[(i_8_ >= (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) ? i_8_ - (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) : i_8_) & 0xff]) & 0xff);
					for (int i_10_ = i_6_ - 1; i_10_ <= i_7_; i_10_++) {
						int i_11_ = (2 * ((((Class282_Sub20_Sub34) this).aByteArray9965[(i_9_ + (i_10_ >= (((Class282_Sub20_Sub34) this).anInt9961) * -783993371 ? i_10_ - ((Class282_Sub20_Sub34) this).anInt9961 * -783993371 : i_10_)) & 0xff]) & 0xff));
						int i_12_ = i_5_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_11_++]) + (i_10_ << 12));
						int i_13_ = i_1_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_11_]) + (i_8_ << 12));
						int i_14_;
						switch (1296392313 * ((Class282_Sub20_Sub34) this).anInt9949) {
						case 1:
							i_14_ = i_13_ * i_13_ + i_12_ * i_12_ >> 12;
							break;
						case 5:
							i_12_ *= i_12_;
							i_13_ *= i_13_;
							i_14_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_13_ + i_12_) / 1.6777216E7F))) * 4096.0);
							break;
						case 4:
							i_12_ = (int) (Math.sqrt((double) ((float) (i_12_ < 0 ? -i_12_ : i_12_) / 4096.0F)) * 4096.0);
							i_13_ = (int) (Math.sqrt((double) ((float) (i_13_ < 0 ? -i_13_ : i_13_) / 4096.0F)) * 4096.0);
							i_14_ = i_12_ + i_13_;
							i_14_ = i_14_ * i_14_ >> 12;
							break;
						case 2:
							i_14_ = ((i_12_ < 0 ? -i_12_ : i_12_) + (i_13_ < 0 ? -i_13_ : i_13_));
							break;
						default:
							i_14_ = (int) ((Math.sqrt((double) ((float) (i_12_ * i_12_ + i_13_ * i_13_) / 1.6777216E7F))) * 4096.0);
							break;
						case 3:
							i_12_ = i_12_ < 0 ? -i_12_ : i_12_;
							i_13_ = i_13_ < 0 ? -i_13_ : i_13_;
							i_14_ = i_12_ > i_13_ ? i_12_ : i_13_;
						}
						if (i_14_ < 1153951579 * Class368.anInt4266) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = -2056127537 * Class10.anInt118;
							Class10.anInt118 = Class368.anInt4266 * -1316670739;
							Class368.anInt4266 = i_14_ * 1773531347;
						} else if (i_14_ < Class10.anInt118 * 1188221543) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = Class10.anInt118 * -2056127537;
							Class10.anInt118 = 1729636695 * i_14_;
						} else if (i_14_ < 1143664105 * Class390.anInt4777) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777 * 1790438293;
							Class390.anInt4777 = i_14_ * 2138618457;
						} else if (i_14_ < (-2112814075 * Class282_Sub11_Sub2.anInt10003))
							Class282_Sub11_Sub2.anInt10003 = 334702797 * i_14_;
					}
				}
				switch (((Class282_Sub20_Sub34) this).anInt9963 * 26572853) {
				case 1:
					is[i_4_] = Class10.anInt118 * 1188221543;
					break;
				case 4:
					is[i_4_] = Class282_Sub11_Sub2.anInt10003 * -2112814075;
					break;
				case 0:
					is[i_4_] = Class368.anInt4266 * 1153951579;
					break;
				case 3:
					is[i_4_] = 1143664105 * Class390.anInt4777;
					break;
				case 2:
					is[i_4_] = (1188221543 * Class10.anInt118 - Class368.anInt4266 * 1153951579);
					break;
				}
			}
		}
		return is;
	}

	void method12321(int i) {
		((Class282_Sub20_Sub34) this).aByteArray9965 = Class316.method5588((1710257715 * ((Class282_Sub20_Sub34) this).anInt9959), -602501951);
		method15412(957138741);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub34) this).anInt9963 = class282_sub35.readUnsignedByte() * -403957219;
			break;
		case 4:
			((Class282_Sub20_Sub34) this).anInt9949 = class282_sub35.readUnsignedByte() * 1518012873;
			break;
		case 2:
			((Class282_Sub20_Sub34) this).anInt9960 = class282_sub35.readUnsignedShort() * -1929751979;
			break;
		case 5:
			((Class282_Sub20_Sub34) this).anInt9961 = class282_sub35.readUnsignedByte() * -446234643;
			break;
		case 0:
			((Class282_Sub20_Sub34) this).anInt9961 = ((((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775) * -392921461);
			break;
		case 1:
			((Class282_Sub20_Sub34) this).anInt9959 = class282_sub35.readUnsignedByte() * -1700825861;
			break;
		case 6:
			((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775;
			break;
		}
	}

	void method15412(int i) {
		Random random = new Random((long) (1710257715 * ((Class282_Sub20_Sub34) this).anInt9959));
		((Class282_Sub20_Sub34) this).aShortArray9966 = new short[512];
		if (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960 > 0) {
			for (int i_15_ = 0; i_15_ < 512; i_15_++)
				((Class282_Sub20_Sub34) this).aShortArray9966[i_15_] = (short) Class476.method7931(random, (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960), 1534079645);
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -2026135122);
		if (aClass320_7667.aBool3722) {
			int i_16_ = 2048 + (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319 * Class316.anIntArray3668[i]);
			int i_17_ = i_16_ >> 12;
			int i_18_ = 1 + i_17_;
			for (int i_19_ = 0; i_19_ < -402153223 * Class316.anInt3670; i_19_++) {
				Class282_Sub11_Sub2.anInt10003 = 1812780851;
				Class390.anInt4777 = 8865191;
				Class10.anInt118 = 417846953;
				Class368.anInt4266 = 373952301;
				int i_20_ = ((Class316.anIntArray3672[i_19_] * (-783993371 * ((Class282_Sub20_Sub34) this).anInt9961)) + 2048);
				int i_21_ = i_20_ >> 12;
				int i_22_ = i_21_ + 1;
				for (int i_23_ = i_17_ - 1; i_23_ <= i_18_; i_23_++) {
					int i_24_ = (((Class282_Sub20_Sub34) this).aByteArray9965[(i_23_ >= (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) ? i_23_ - (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) : i_23_) & 0xff]) & 0xff;
					for (int i_25_ = i_21_ - 1; i_25_ <= i_22_; i_25_++) {
						int i_26_ = (2 * ((((Class282_Sub20_Sub34) this).aByteArray9965[(i_24_ + (i_25_ >= (((Class282_Sub20_Sub34) this).anInt9961) * -783993371 ? i_25_ - ((Class282_Sub20_Sub34) this).anInt9961 * -783993371 : i_25_)) & 0xff]) & 0xff));
						int i_27_ = i_20_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_26_++]) + (i_25_ << 12));
						int i_28_ = i_16_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_26_]) + (i_23_ << 12));
						int i_29_;
						switch (1296392313 * ((Class282_Sub20_Sub34) this).anInt9949) {
						case 1:
							i_29_ = i_28_ * i_28_ + i_27_ * i_27_ >> 12;
							break;
						case 5:
							i_27_ *= i_27_;
							i_28_ *= i_28_;
							i_29_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_28_ + i_27_) / 1.6777216E7F))) * 4096.0);
							break;
						case 4:
							i_27_ = (int) (Math.sqrt((double) ((float) (i_27_ < 0 ? -i_27_ : i_27_) / 4096.0F)) * 4096.0);
							i_28_ = (int) (Math.sqrt((double) ((float) (i_28_ < 0 ? -i_28_ : i_28_) / 4096.0F)) * 4096.0);
							i_29_ = i_27_ + i_28_;
							i_29_ = i_29_ * i_29_ >> 12;
							break;
						case 2:
							i_29_ = ((i_27_ < 0 ? -i_27_ : i_27_) + (i_28_ < 0 ? -i_28_ : i_28_));
							break;
						default:
							i_29_ = (int) ((Math.sqrt((double) ((float) (i_27_ * i_27_ + i_28_ * i_28_) / 1.6777216E7F))) * 4096.0);
							break;
						case 3:
							i_27_ = i_27_ < 0 ? -i_27_ : i_27_;
							i_28_ = i_28_ < 0 ? -i_28_ : i_28_;
							i_29_ = i_27_ > i_28_ ? i_27_ : i_28_;
						}
						if (i_29_ < 1153951579 * Class368.anInt4266) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = -2056127537 * Class10.anInt118;
							Class10.anInt118 = Class368.anInt4266 * -1316670739;
							Class368.anInt4266 = i_29_ * 1773531347;
						} else if (i_29_ < Class10.anInt118 * 1188221543) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = Class10.anInt118 * -2056127537;
							Class10.anInt118 = 1729636695 * i_29_;
						} else if (i_29_ < 1143664105 * Class390.anInt4777) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777 * 1790438293;
							Class390.anInt4777 = i_29_ * 2138618457;
						} else if (i_29_ < (-2112814075 * Class282_Sub11_Sub2.anInt10003))
							Class282_Sub11_Sub2.anInt10003 = 334702797 * i_29_;
					}
				}
				switch (((Class282_Sub20_Sub34) this).anInt9963 * 26572853) {
				case 1:
					is[i_19_] = Class10.anInt118 * 1188221543;
					break;
				case 4:
					is[i_19_] = Class282_Sub11_Sub2.anInt10003 * -2112814075;
					break;
				case 0:
					is[i_19_] = Class368.anInt4266 * 1153951579;
					break;
				case 3:
					is[i_19_] = 1143664105 * Class390.anInt4777;
					break;
				case 2:
					is[i_19_] = (1188221543 * Class10.anInt118 - Class368.anInt4266 * 1153951579);
					break;
				}
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1077993223);
		if (aClass320_7667.aBool3722) {
			int i_30_ = 2048 + (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319 * Class316.anIntArray3668[i]);
			int i_31_ = i_30_ >> 12;
			int i_32_ = 1 + i_31_;
			for (int i_33_ = 0; i_33_ < -402153223 * Class316.anInt3670; i_33_++) {
				Class282_Sub11_Sub2.anInt10003 = 1812780851;
				Class390.anInt4777 = 8865191;
				Class10.anInt118 = 417846953;
				Class368.anInt4266 = 373952301;
				int i_34_ = ((Class316.anIntArray3672[i_33_] * (-783993371 * ((Class282_Sub20_Sub34) this).anInt9961)) + 2048);
				int i_35_ = i_34_ >> 12;
				int i_36_ = i_35_ + 1;
				for (int i_37_ = i_31_ - 1; i_37_ <= i_32_; i_37_++) {
					int i_38_ = (((Class282_Sub20_Sub34) this).aByteArray9965[(i_37_ >= (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) ? i_37_ - (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) : i_37_) & 0xff]) & 0xff;
					for (int i_39_ = i_35_ - 1; i_39_ <= i_36_; i_39_++) {
						int i_40_ = (2 * ((((Class282_Sub20_Sub34) this).aByteArray9965[(i_38_ + (i_39_ >= (((Class282_Sub20_Sub34) this).anInt9961) * -783993371 ? i_39_ - ((Class282_Sub20_Sub34) this).anInt9961 * -783993371 : i_39_)) & 0xff]) & 0xff));
						int i_41_ = i_34_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_40_++]) + (i_39_ << 12));
						int i_42_ = i_30_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_40_]) + (i_37_ << 12));
						int i_43_;
						switch (1296392313 * ((Class282_Sub20_Sub34) this).anInt9949) {
						case 1:
							i_43_ = i_42_ * i_42_ + i_41_ * i_41_ >> 12;
							break;
						case 5:
							i_41_ *= i_41_;
							i_42_ *= i_42_;
							i_43_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_42_ + i_41_) / 1.6777216E7F))) * 4096.0);
							break;
						case 4:
							i_41_ = (int) (Math.sqrt((double) ((float) (i_41_ < 0 ? -i_41_ : i_41_) / 4096.0F)) * 4096.0);
							i_42_ = (int) (Math.sqrt((double) ((float) (i_42_ < 0 ? -i_42_ : i_42_) / 4096.0F)) * 4096.0);
							i_43_ = i_41_ + i_42_;
							i_43_ = i_43_ * i_43_ >> 12;
							break;
						case 2:
							i_43_ = ((i_41_ < 0 ? -i_41_ : i_41_) + (i_42_ < 0 ? -i_42_ : i_42_));
							break;
						default:
							i_43_ = (int) ((Math.sqrt((double) ((float) (i_41_ * i_41_ + i_42_ * i_42_) / 1.6777216E7F))) * 4096.0);
							break;
						case 3:
							i_41_ = i_41_ < 0 ? -i_41_ : i_41_;
							i_42_ = i_42_ < 0 ? -i_42_ : i_42_;
							i_43_ = i_41_ > i_42_ ? i_41_ : i_42_;
						}
						if (i_43_ < 1153951579 * Class368.anInt4266) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = -2056127537 * Class10.anInt118;
							Class10.anInt118 = Class368.anInt4266 * -1316670739;
							Class368.anInt4266 = i_43_ * 1773531347;
						} else if (i_43_ < Class10.anInt118 * 1188221543) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = Class10.anInt118 * -2056127537;
							Class10.anInt118 = 1729636695 * i_43_;
						} else if (i_43_ < 1143664105 * Class390.anInt4777) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777 * 1790438293;
							Class390.anInt4777 = i_43_ * 2138618457;
						} else if (i_43_ < (-2112814075 * Class282_Sub11_Sub2.anInt10003))
							Class282_Sub11_Sub2.anInt10003 = 334702797 * i_43_;
					}
				}
				switch (((Class282_Sub20_Sub34) this).anInt9963 * 26572853) {
				case 1:
					is[i_33_] = Class10.anInt118 * 1188221543;
					break;
				case 4:
					is[i_33_] = Class282_Sub11_Sub2.anInt10003 * -2112814075;
					break;
				case 0:
					is[i_33_] = Class368.anInt4266 * 1153951579;
					break;
				case 3:
					is[i_33_] = 1143664105 * Class390.anInt4777;
					break;
				case 2:
					is[i_33_] = (1188221543 * Class10.anInt118 - Class368.anInt4266 * 1153951579);
					break;
				}
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -2122334548);
		if (aClass320_7667.aBool3722) {
			int i_44_ = 2048 + (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319 * Class316.anIntArray3668[i]);
			int i_45_ = i_44_ >> 12;
			int i_46_ = 1 + i_45_;
			for (int i_47_ = 0; i_47_ < -402153223 * Class316.anInt3670; i_47_++) {
				Class282_Sub11_Sub2.anInt10003 = 1812780851;
				Class390.anInt4777 = 8865191;
				Class10.anInt118 = 417846953;
				Class368.anInt4266 = 373952301;
				int i_48_ = ((Class316.anIntArray3672[i_47_] * (-783993371 * ((Class282_Sub20_Sub34) this).anInt9961)) + 2048);
				int i_49_ = i_48_ >> 12;
				int i_50_ = i_49_ + 1;
				for (int i_51_ = i_45_ - 1; i_51_ <= i_46_; i_51_++) {
					int i_52_ = (((Class282_Sub20_Sub34) this).aByteArray9965[(i_51_ >= (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) ? i_51_ - (((Class282_Sub20_Sub34) this).anInt9962 * 1635711319) : i_51_) & 0xff]) & 0xff;
					for (int i_53_ = i_49_ - 1; i_53_ <= i_50_; i_53_++) {
						int i_54_ = (2 * ((((Class282_Sub20_Sub34) this).aByteArray9965[(i_52_ + (i_53_ >= (((Class282_Sub20_Sub34) this).anInt9961) * -783993371 ? i_53_ - ((Class282_Sub20_Sub34) this).anInt9961 * -783993371 : i_53_)) & 0xff]) & 0xff));
						int i_55_ = i_48_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_54_++]) + (i_53_ << 12));
						int i_56_ = i_44_ - ((((Class282_Sub20_Sub34) this).aShortArray9966[i_54_]) + (i_51_ << 12));
						int i_57_;
						switch (1296392313 * ((Class282_Sub20_Sub34) this).anInt9949) {
						case 1:
							i_57_ = i_56_ * i_56_ + i_55_ * i_55_ >> 12;
							break;
						case 5:
							i_55_ *= i_55_;
							i_56_ *= i_56_;
							i_57_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_56_ + i_55_) / 1.6777216E7F))) * 4096.0);
							break;
						case 4:
							i_55_ = (int) (Math.sqrt((double) ((float) (i_55_ < 0 ? -i_55_ : i_55_) / 4096.0F)) * 4096.0);
							i_56_ = (int) (Math.sqrt((double) ((float) (i_56_ < 0 ? -i_56_ : i_56_) / 4096.0F)) * 4096.0);
							i_57_ = i_55_ + i_56_;
							i_57_ = i_57_ * i_57_ >> 12;
							break;
						case 2:
							i_57_ = ((i_55_ < 0 ? -i_55_ : i_55_) + (i_56_ < 0 ? -i_56_ : i_56_));
							break;
						default:
							i_57_ = (int) ((Math.sqrt((double) ((float) (i_55_ * i_55_ + i_56_ * i_56_) / 1.6777216E7F))) * 4096.0);
							break;
						case 3:
							i_55_ = i_55_ < 0 ? -i_55_ : i_55_;
							i_56_ = i_56_ < 0 ? -i_56_ : i_56_;
							i_57_ = i_55_ > i_56_ ? i_55_ : i_56_;
						}
						if (i_57_ < 1153951579 * Class368.anInt4266) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = -2056127537 * Class10.anInt118;
							Class10.anInt118 = Class368.anInt4266 * -1316670739;
							Class368.anInt4266 = i_57_ * 1773531347;
						} else if (i_57_ < Class10.anInt118 * 1188221543) {
							Class282_Sub11_Sub2.anInt10003 = 1790438293 * Class390.anInt4777;
							Class390.anInt4777 = Class10.anInt118 * -2056127537;
							Class10.anInt118 = 1729636695 * i_57_;
						} else if (i_57_ < 1143664105 * Class390.anInt4777) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777 * 1790438293;
							Class390.anInt4777 = i_57_ * 2138618457;
						} else if (i_57_ < (-2112814075 * Class282_Sub11_Sub2.anInt10003))
							Class282_Sub11_Sub2.anInt10003 = 334702797 * i_57_;
					}
				}
				switch (((Class282_Sub20_Sub34) this).anInt9963 * 26572853) {
				case 1:
					is[i_47_] = Class10.anInt118 * 1188221543;
					break;
				case 4:
					is[i_47_] = Class282_Sub11_Sub2.anInt10003 * -2112814075;
					break;
				case 0:
					is[i_47_] = Class368.anInt4266 * 1153951579;
					break;
				case 3:
					is[i_47_] = 1143664105 * Class390.anInt4777;
					break;
				case 2:
					is[i_47_] = (1188221543 * Class10.anInt118 - Class368.anInt4266 * 1153951579);
					break;
				}
			}
		}
		return is;
	}

	void method12328() {
		((Class282_Sub20_Sub34) this).aByteArray9965 = Class316.method5588((1710257715 * ((Class282_Sub20_Sub34) this).anInt9959), 67721357);
		method15412(609718364);
	}

	void method12329() {
		((Class282_Sub20_Sub34) this).aByteArray9965 = Class316.method5588((1710257715 * ((Class282_Sub20_Sub34) this).anInt9959), -1052789489);
		method15412(1892294156);
	}

	void method12350() {
		((Class282_Sub20_Sub34) this).aByteArray9965 = Class316.method5588((1710257715 * ((Class282_Sub20_Sub34) this).anInt9959), -1675361819);
		method15412(146513115);
	}

	public Class282_Sub20_Sub34() {
		super(0, true);
		((Class282_Sub20_Sub34) this).anInt9949 = 1518012873;
		((Class282_Sub20_Sub34) this).aByteArray9965 = new byte[512];
		((Class282_Sub20_Sub34) this).aShortArray9966 = new short[512];
	}

	void method15413() {
		Random random = new Random((long) (1710257715 * ((Class282_Sub20_Sub34) this).anInt9959));
		((Class282_Sub20_Sub34) this).aShortArray9966 = new short[512];
		if (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960 > 0) {
			for (int i = 0; i < 512; i++)
				((Class282_Sub20_Sub34) this).aShortArray9966[i] = (short) Class476.method7931(random, (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960), -656230878);
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub34) this).anInt9963 = class282_sub35.readUnsignedByte() * -403957219;
			break;
		case 4:
			((Class282_Sub20_Sub34) this).anInt9949 = class282_sub35.readUnsignedByte() * 1518012873;
			break;
		case 2:
			((Class282_Sub20_Sub34) this).anInt9960 = class282_sub35.readUnsignedShort() * -1929751979;
			break;
		case 5:
			((Class282_Sub20_Sub34) this).anInt9961 = class282_sub35.readUnsignedByte() * -446234643;
			break;
		case 0:
			((Class282_Sub20_Sub34) this).anInt9961 = ((((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775) * -392921461);
			break;
		case 1:
			((Class282_Sub20_Sub34) this).anInt9959 = class282_sub35.readUnsignedByte() * -1700825861;
			break;
		case 6:
			((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub34) this).anInt9963 = class282_sub35.readUnsignedByte() * -403957219;
			break;
		case 4:
			((Class282_Sub20_Sub34) this).anInt9949 = class282_sub35.readUnsignedByte() * 1518012873;
			break;
		case 2:
			((Class282_Sub20_Sub34) this).anInt9960 = class282_sub35.readUnsignedShort() * -1929751979;
			break;
		case 5:
			((Class282_Sub20_Sub34) this).anInt9961 = class282_sub35.readUnsignedByte() * -446234643;
			break;
		case 0:
			((Class282_Sub20_Sub34) this).anInt9961 = ((((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775) * -392921461);
			break;
		case 1:
			((Class282_Sub20_Sub34) this).anInt9959 = class282_sub35.readUnsignedByte() * -1700825861;
			break;
		case 6:
			((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775;
			break;
		}
	}

	void method15414() {
		Random random = new Random((long) (1710257715 * ((Class282_Sub20_Sub34) this).anInt9959));
		((Class282_Sub20_Sub34) this).aShortArray9966 = new short[512];
		if (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960 > 0) {
			for (int i = 0; i < 512; i++)
				((Class282_Sub20_Sub34) this).aShortArray9966[i] = (short) Class476.method7931(random, (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960), 1505570744);
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_58_) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub34) this).anInt9963 = class282_sub35.readUnsignedByte() * -403957219;
			break;
		case 4:
			((Class282_Sub20_Sub34) this).anInt9949 = class282_sub35.readUnsignedByte() * 1518012873;
			break;
		case 2:
			((Class282_Sub20_Sub34) this).anInt9960 = class282_sub35.readUnsignedShort() * -1929751979;
			break;
		case 5:
			((Class282_Sub20_Sub34) this).anInt9961 = class282_sub35.readUnsignedByte() * -446234643;
			break;
		case 0:
			((Class282_Sub20_Sub34) this).anInt9961 = ((((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775) * -392921461);
			break;
		case 1:
			((Class282_Sub20_Sub34) this).anInt9959 = class282_sub35.readUnsignedByte() * -1700825861;
			break;
		case 6:
			((Class282_Sub20_Sub34) this).anInt9962 = class282_sub35.readUnsignedByte() * 1650524775;
			break;
		}
	}

	void method15415() {
		Random random = new Random((long) (1710257715 * ((Class282_Sub20_Sub34) this).anInt9959));
		((Class282_Sub20_Sub34) this).aShortArray9966 = new short[512];
		if (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960 > 0) {
			for (int i = 0; i < 512; i++)
				((Class282_Sub20_Sub34) this).aShortArray9966[i] = (short) Class476.method7931(random, (-12576003 * ((Class282_Sub20_Sub34) this).anInt9960), 2013445108);
		}
	}

	static final void method15416(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub11.method12209(class118, class98, class527, 1467575804);
	}
}
