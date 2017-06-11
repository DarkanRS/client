/* Class298_Sub32_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class298_Sub32_Sub17 extends Class298_Sub32 {
	static int anInt9411 = 3;
	static int anInt9412 = 1;
	static int anInt9413 = 2;
	static int anInt9414 = 2048;
	short[] aShortArray9415;
	static int anInt9416 = 1;
	static int anInt9417 = 2;
	byte[] aByteArray9418;
	static int anInt9419 = 0;
	static int anInt9420 = 5;
	static int anInt9421 = 0;
	static int anInt9422 = 2;
	static int anInt9423 = 5;
	static int anInt9424 = 4;
	static int anInt9425 = 1;
	int anInt9426 = 0;
	int anInt9427 = -1678309376;
	int anInt9428 = 1054806071;
	int anInt9429 = 1710056533;
	int anInt9430 = 1239043726;
	int anInt9431 = -1784051459;
	static int anInt9432 = 4;
	static int anInt9433 = 3;

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1076087457);
			if (aClass257_7384.aBoolean2810) {
				int i_1_ = ((-1818338063 * ((Class298_Sub32_Sub17) this).anInt9429 * Class250.anIntArray2760[i]) + 2048);
				int i_2_ = i_1_ >> 12;
				int i_3_ = 1 + i_2_;
				for (int i_4_ = 0; i_4_ < Class250.anInt2755 * -1474554145; i_4_++) {
					Class484.anInt6057 = 1648440697;
					Class358.anInt3865 = -495419991;
					Class411.anInt5325 = -586878723;
					Class298_Sub32_Sub23.anInt9477 = -1158324685;
					int i_5_ = ((883178403 * ((Class298_Sub32_Sub17) this).anInt9428 * Class250.anIntArray2762[i_4_]) + 2048);
					int i_6_ = i_5_ >> 12;
					int i_7_ = 1 + i_6_;
					for (int i_8_ = i_2_ - 1; i_8_ <= i_3_; i_8_++) {
						int i_9_ = ((((Class298_Sub32_Sub17) this).aByteArray9418[(i_8_ >= -1818338063 * ((Class298_Sub32_Sub17) this).anInt9429 ? i_8_ - (((Class298_Sub32_Sub17) this).anInt9429) * -1818338063 : i_8_) & 0xff]) & 0xff);
						for (int i_10_ = i_6_ - 1; i_10_ <= i_7_; i_10_++) {
							int i_11_ = (((((Class298_Sub32_Sub17) this).aByteArray9418[(i_10_ >= (((Class298_Sub32_Sub17) this).anInt9428) * 883178403 ? i_10_ - (((Class298_Sub32_Sub17) this).anInt9428) * 883178403 : i_10_) + i_9_ & 0xff]) & 0xff) * 2);
							int i_12_ = i_5_ - ((((Class298_Sub32_Sub17) this).aShortArray9415[i_11_++]) + (i_10_ << 12));
							int i_13_ = i_1_ - ((i_8_ << 12) + (((Class298_Sub32_Sub17) this).aShortArray9415[i_11_]));
							int i_14_;
							switch (((Class298_Sub32_Sub17) this).anInt9431 * -1013656491) {
							case 5:
								i_12_ *= i_12_;
								i_13_ *= i_13_;
								i_14_ = (int) ((Math.sqrt(Math.sqrt((double) ((float) (i_12_ + i_13_) / 1.6777216E7F)))) * 4096.0);
								break;
							default:
								i_14_ = (int) ((Math.sqrt((double) ((float) (i_13_ * i_13_ + (i_12_ * i_12_)) / 1.6777216E7F))) * 4096.0);
								break;
							case 1:
								i_14_ = i_12_ * i_12_ + i_13_ * i_13_ >> 12;
								break;
							case 4:
								i_12_ = (int) ((Math.sqrt((double) ((float) (i_12_ < 0 ? -i_12_ : i_12_) / 4096.0F))) * 4096.0);
								i_13_ = (int) ((Math.sqrt((double) ((float) (i_13_ < 0 ? -i_13_ : i_13_) / 4096.0F))) * 4096.0);
								i_14_ = i_13_ + i_12_;
								i_14_ = i_14_ * i_14_ >> 12;
								break;
							case 3:
								i_12_ = i_12_ < 0 ? -i_12_ : i_12_;
								i_13_ = i_13_ < 0 ? -i_13_ : i_13_;
								i_14_ = i_12_ > i_13_ ? i_12_ : i_13_;
								break;
							case 2:
								i_14_ = ((i_13_ < 0 ? -i_13_ : i_13_) + (i_12_ < 0 ? -i_12_ : i_12_));
							}
							if (i_14_ < (-1479855355 * Class298_Sub32_Sub23.anInt9477)) {
								Class484.anInt6057 = Class358.anInt3865 * 335526737;
								Class358.anInt3865 = Class411.anInt5325 * 1817789725;
								Class411.anInt5325 = (Class298_Sub32_Sub23.anInt9477 * 256238607);
								Class298_Sub32_Sub23.anInt9477 = -989158963 * i_14_;
							} else if (i_14_ < -618310741 * Class411.anInt5325) {
								Class484.anInt6057 = Class358.anInt3865 * 335526737;
								Class358.anInt3865 = 1817789725 * Class411.anInt5325;
								Class411.anInt5325 = -1560604925 * i_14_;
							} else if (i_14_ < -472479385 * Class358.anInt3865) {
								Class484.anInt6057 = Class358.anInt3865 * 335526737;
								Class358.anInt3865 = -1652063657 * i_14_;
							} else if (i_14_ < Class484.anInt6057 * -1065886921)
								Class484.anInt6057 = i_14_ * 499042951;
						}
					}
					switch (-94219657 * ((Class298_Sub32_Sub17) this).anInt9430) {
					case 1:
						is[i_4_] = Class411.anInt5325 * -618310741;
						break;
					case 2:
						is[i_4_] = (-618310741 * Class411.anInt5325 - -1479855355 * Class298_Sub32_Sub23.anInt9477);
						break;
					case 3:
						is[i_4_] = -472479385 * Class358.anInt3865;
						break;
					case 4:
						is[i_4_] = -1065886921 * Class484.anInt6057;
						break;
					case 0:
						is[i_4_] = -1479855355 * Class298_Sub32_Sub23.anInt9477;
						break;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahf.i(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			((Class298_Sub32_Sub17) this).aByteArray9418 = Class250.method2395(35399273 * (((Class298_Sub32_Sub17) this).anInt9426), (byte) 47);
			method3236(-804707257);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahf.x(").append(')').toString());
		}
	}

	void method3235() {
		((Class298_Sub32_Sub17) this).aByteArray9418 = Class250.method2395((35399273 * ((Class298_Sub32_Sub17) this).anInt9426), (byte) 50);
		method3236(-975250951);
	}

	void method3236(int i) {
		try {
			Random random = new Random((long) (((Class298_Sub32_Sub17) this).anInt9426 * 35399273));
			((Class298_Sub32_Sub17) this).aShortArray9415 = new short[512];
			if (((Class298_Sub32_Sub17) this).anInt9427 * -1261812447 > 0) {
				for (int i_15_ = 0; i_15_ < 512; i_15_++)
					((Class298_Sub32_Sub17) this).aShortArray9415[i_15_] = (short) (Class298_Sub19_Sub3.method3039(random, -1261812447 * ((Class298_Sub32_Sub17) this).anInt9427, (byte) 14));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahf.ac(").append(')').toString());
		}
	}

	int[] method3237(int i) {
		int[] is = aClass257_7384.method2448(i, 538924530);
		if (aClass257_7384.aBoolean2810) {
			int i_16_ = ((-1818338063 * ((Class298_Sub32_Sub17) this).anInt9429 * Class250.anIntArray2760[i]) + 2048);
			int i_17_ = i_16_ >> 12;
			int i_18_ = 1 + i_17_;
			for (int i_19_ = 0; i_19_ < Class250.anInt2755 * -1474554145; i_19_++) {
				Class484.anInt6057 = 1648440697;
				Class358.anInt3865 = -495419991;
				Class411.anInt5325 = -586878723;
				Class298_Sub32_Sub23.anInt9477 = -1158324685;
				int i_20_ = ((883178403 * ((Class298_Sub32_Sub17) this).anInt9428 * Class250.anIntArray2762[i_19_]) + 2048);
				int i_21_ = i_20_ >> 12;
				int i_22_ = 1 + i_21_;
				for (int i_23_ = i_17_ - 1; i_23_ <= i_18_; i_23_++) {
					int i_24_ = (((Class298_Sub32_Sub17) this).aByteArray9418[(i_23_ >= -1818338063 * ((Class298_Sub32_Sub17) this).anInt9429 ? i_23_ - (((Class298_Sub32_Sub17) this).anInt9429 * -1818338063) : i_23_) & 0xff]) & 0xff;
					for (int i_25_ = i_21_ - 1; i_25_ <= i_22_; i_25_++) {
						int i_26_ = (((((Class298_Sub32_Sub17) this).aByteArray9418[(i_25_ >= (((Class298_Sub32_Sub17) this).anInt9428) * 883178403 ? i_25_ - (((Class298_Sub32_Sub17) this).anInt9428) * 883178403 : i_25_) + i_24_ & 0xff]) & 0xff) * 2);
						int i_27_ = i_20_ - ((((Class298_Sub32_Sub17) this).aShortArray9415[i_26_++]) + (i_25_ << 12));
						int i_28_ = i_16_ - ((i_23_ << 12) + (((Class298_Sub32_Sub17) this).aShortArray9415[i_26_]));
						int i_29_;
						switch (((Class298_Sub32_Sub17) this).anInt9431 * -1013656491) {
						case 5:
							i_27_ *= i_27_;
							i_28_ *= i_28_;
							i_29_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_27_ + i_28_) / 1.6777216E7F))) * 4096.0);
							break;
						default:
							i_29_ = (int) ((Math.sqrt((double) ((float) (i_28_ * i_28_ + i_27_ * i_27_) / 1.6777216E7F))) * 4096.0);
							break;
						case 1:
							i_29_ = i_27_ * i_27_ + i_28_ * i_28_ >> 12;
							break;
						case 4:
							i_27_ = (int) (Math.sqrt((double) ((float) (i_27_ < 0 ? -i_27_ : i_27_) / 4096.0F)) * 4096.0);
							i_28_ = (int) (Math.sqrt((double) ((float) (i_28_ < 0 ? -i_28_ : i_28_) / 4096.0F)) * 4096.0);
							i_29_ = i_28_ + i_27_;
							i_29_ = i_29_ * i_29_ >> 12;
							break;
						case 3:
							i_27_ = i_27_ < 0 ? -i_27_ : i_27_;
							i_28_ = i_28_ < 0 ? -i_28_ : i_28_;
							i_29_ = i_27_ > i_28_ ? i_27_ : i_28_;
							break;
						case 2:
							i_29_ = ((i_28_ < 0 ? -i_28_ : i_28_) + (i_27_ < 0 ? -i_27_ : i_27_));
						}
						if (i_29_ < -1479855355 * Class298_Sub32_Sub23.anInt9477) {
							Class484.anInt6057 = Class358.anInt3865 * 335526737;
							Class358.anInt3865 = Class411.anInt5325 * 1817789725;
							Class411.anInt5325 = Class298_Sub32_Sub23.anInt9477 * 256238607;
							Class298_Sub32_Sub23.anInt9477 = -989158963 * i_29_;
						} else if (i_29_ < -618310741 * Class411.anInt5325) {
							Class484.anInt6057 = Class358.anInt3865 * 335526737;
							Class358.anInt3865 = 1817789725 * Class411.anInt5325;
							Class411.anInt5325 = -1560604925 * i_29_;
						} else if (i_29_ < -472479385 * Class358.anInt3865) {
							Class484.anInt6057 = Class358.anInt3865 * 335526737;
							Class358.anInt3865 = -1652063657 * i_29_;
						} else if (i_29_ < Class484.anInt6057 * -1065886921)
							Class484.anInt6057 = i_29_ * 499042951;
					}
				}
				switch (-94219657 * ((Class298_Sub32_Sub17) this).anInt9430) {
				case 1:
					is[i_19_] = Class411.anInt5325 * -618310741;
					break;
				case 2:
					is[i_19_] = (-618310741 * Class411.anInt5325 - -1479855355 * Class298_Sub32_Sub23.anInt9477);
					break;
				case 3:
					is[i_19_] = -472479385 * Class358.anInt3865;
					break;
				case 4:
					is[i_19_] = -1065886921 * Class484.anInt6057;
					break;
				case 0:
					is[i_19_] = -1479855355 * Class298_Sub32_Sub23.anInt9477;
					break;
				}
			}
		}
		return is;
	}

	int[] method3238(int i) {
		int[] is = aClass257_7384.method2448(i, 1191732037);
		if (aClass257_7384.aBoolean2810) {
			int i_30_ = ((-1818338063 * ((Class298_Sub32_Sub17) this).anInt9429 * Class250.anIntArray2760[i]) + 2048);
			int i_31_ = i_30_ >> 12;
			int i_32_ = 1 + i_31_;
			for (int i_33_ = 0; i_33_ < Class250.anInt2755 * -1474554145; i_33_++) {
				Class484.anInt6057 = 1648440697;
				Class358.anInt3865 = -495419991;
				Class411.anInt5325 = -586878723;
				Class298_Sub32_Sub23.anInt9477 = -1158324685;
				int i_34_ = ((883178403 * ((Class298_Sub32_Sub17) this).anInt9428 * Class250.anIntArray2762[i_33_]) + 2048);
				int i_35_ = i_34_ >> 12;
				int i_36_ = 1 + i_35_;
				for (int i_37_ = i_31_ - 1; i_37_ <= i_32_; i_37_++) {
					int i_38_ = (((Class298_Sub32_Sub17) this).aByteArray9418[(i_37_ >= -1818338063 * ((Class298_Sub32_Sub17) this).anInt9429 ? i_37_ - (((Class298_Sub32_Sub17) this).anInt9429 * -1818338063) : i_37_) & 0xff]) & 0xff;
					for (int i_39_ = i_35_ - 1; i_39_ <= i_36_; i_39_++) {
						int i_40_ = (((((Class298_Sub32_Sub17) this).aByteArray9418[(i_39_ >= (((Class298_Sub32_Sub17) this).anInt9428) * 883178403 ? i_39_ - (((Class298_Sub32_Sub17) this).anInt9428) * 883178403 : i_39_) + i_38_ & 0xff]) & 0xff) * 2);
						int i_41_ = i_34_ - ((((Class298_Sub32_Sub17) this).aShortArray9415[i_40_++]) + (i_39_ << 12));
						int i_42_ = i_30_ - ((i_37_ << 12) + (((Class298_Sub32_Sub17) this).aShortArray9415[i_40_]));
						int i_43_;
						switch (((Class298_Sub32_Sub17) this).anInt9431 * -1013656491) {
						case 5:
							i_41_ *= i_41_;
							i_42_ *= i_42_;
							i_43_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_41_ + i_42_) / 1.6777216E7F))) * 4096.0);
							break;
						default:
							i_43_ = (int) ((Math.sqrt((double) ((float) (i_42_ * i_42_ + i_41_ * i_41_) / 1.6777216E7F))) * 4096.0);
							break;
						case 1:
							i_43_ = i_41_ * i_41_ + i_42_ * i_42_ >> 12;
							break;
						case 4:
							i_41_ = (int) (Math.sqrt((double) ((float) (i_41_ < 0 ? -i_41_ : i_41_) / 4096.0F)) * 4096.0);
							i_42_ = (int) (Math.sqrt((double) ((float) (i_42_ < 0 ? -i_42_ : i_42_) / 4096.0F)) * 4096.0);
							i_43_ = i_42_ + i_41_;
							i_43_ = i_43_ * i_43_ >> 12;
							break;
						case 3:
							i_41_ = i_41_ < 0 ? -i_41_ : i_41_;
							i_42_ = i_42_ < 0 ? -i_42_ : i_42_;
							i_43_ = i_41_ > i_42_ ? i_41_ : i_42_;
							break;
						case 2:
							i_43_ = ((i_42_ < 0 ? -i_42_ : i_42_) + (i_41_ < 0 ? -i_41_ : i_41_));
						}
						if (i_43_ < -1479855355 * Class298_Sub32_Sub23.anInt9477) {
							Class484.anInt6057 = Class358.anInt3865 * 335526737;
							Class358.anInt3865 = Class411.anInt5325 * 1817789725;
							Class411.anInt5325 = Class298_Sub32_Sub23.anInt9477 * 256238607;
							Class298_Sub32_Sub23.anInt9477 = -989158963 * i_43_;
						} else if (i_43_ < -618310741 * Class411.anInt5325) {
							Class484.anInt6057 = Class358.anInt3865 * 335526737;
							Class358.anInt3865 = 1817789725 * Class411.anInt5325;
							Class411.anInt5325 = -1560604925 * i_43_;
						} else if (i_43_ < -472479385 * Class358.anInt3865) {
							Class484.anInt6057 = Class358.anInt3865 * 335526737;
							Class358.anInt3865 = -1652063657 * i_43_;
						} else if (i_43_ < Class484.anInt6057 * -1065886921)
							Class484.anInt6057 = i_43_ * 499042951;
					}
				}
				switch (-94219657 * ((Class298_Sub32_Sub17) this).anInt9430) {
				case 1:
					is[i_33_] = Class411.anInt5325 * -618310741;
					break;
				case 2:
					is[i_33_] = (-618310741 * Class411.anInt5325 - -1479855355 * Class298_Sub32_Sub23.anInt9477);
					break;
				case 3:
					is[i_33_] = -472479385 * Class358.anInt3865;
					break;
				case 4:
					is[i_33_] = -1065886921 * Class484.anInt6057;
					break;
				case 0:
					is[i_33_] = -1479855355 * Class298_Sub32_Sub23.anInt9477;
					break;
				}
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_44_) {
		try {
			switch (i) {
			case 5:
				((Class298_Sub32_Sub17) this).anInt9428 = class298_sub53.readUnsignedByte() * -648032245;
				break;
			case 6:
				((Class298_Sub32_Sub17) this).anInt9429 = class298_sub53.readUnsignedByte() * 2059998225;
				break;
			case 4:
				((Class298_Sub32_Sub17) this).anInt9431 = class298_sub53.readUnsignedByte() * -1784051459;
				break;
			case 2:
				((Class298_Sub32_Sub17) this).anInt9427 = class298_sub53.readUnsignedShort() * 1389592289;
				break;
			case 3:
				((Class298_Sub32_Sub17) this).anInt9430 = class298_sub53.readUnsignedByte() * -1527961785;
				break;
			case 1:
				((Class298_Sub32_Sub17) this).anInt9426 = class298_sub53.readUnsignedByte() * -893138471;
				break;
			case 0:
				((Class298_Sub32_Sub17) this).anInt9428 = ((((Class298_Sub32_Sub17) this).anInt9429 = class298_sub53.readUnsignedByte() * 2059998225) * -910111141);
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahf.r(").append(')').toString());
		}
	}

	void method3239() {
		((Class298_Sub32_Sub17) this).aByteArray9418 = Class250.method2395((35399273 * ((Class298_Sub32_Sub17) this).anInt9426), (byte) -59);
		method3236(1419756353);
	}

	public Class298_Sub32_Sub17() {
		super(0, true);
		((Class298_Sub32_Sub17) this).aByteArray9418 = new byte[512];
		((Class298_Sub32_Sub17) this).aShortArray9415 = new short[512];
	}

	void method3240(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 5:
			((Class298_Sub32_Sub17) this).anInt9428 = class298_sub53.readUnsignedByte() * -648032245;
			break;
		case 6:
			((Class298_Sub32_Sub17) this).anInt9429 = class298_sub53.readUnsignedByte() * 2059998225;
			break;
		case 4:
			((Class298_Sub32_Sub17) this).anInt9431 = class298_sub53.readUnsignedByte() * -1784051459;
			break;
		case 2:
			((Class298_Sub32_Sub17) this).anInt9427 = class298_sub53.readUnsignedShort() * 1389592289;
			break;
		case 3:
			((Class298_Sub32_Sub17) this).anInt9430 = class298_sub53.readUnsignedByte() * -1527961785;
			break;
		case 1:
			((Class298_Sub32_Sub17) this).anInt9426 = class298_sub53.readUnsignedByte() * -893138471;
			break;
		case 0:
			((Class298_Sub32_Sub17) this).anInt9428 = ((((Class298_Sub32_Sub17) this).anInt9429 = class298_sub53.readUnsignedByte() * 2059998225) * -910111141);
			break;
		}
	}

	void method3241(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 5:
			((Class298_Sub32_Sub17) this).anInt9428 = class298_sub53.readUnsignedByte() * -648032245;
			break;
		case 6:
			((Class298_Sub32_Sub17) this).anInt9429 = class298_sub53.readUnsignedByte() * 2059998225;
			break;
		case 4:
			((Class298_Sub32_Sub17) this).anInt9431 = class298_sub53.readUnsignedByte() * -1784051459;
			break;
		case 2:
			((Class298_Sub32_Sub17) this).anInt9427 = class298_sub53.readUnsignedShort() * 1389592289;
			break;
		case 3:
			((Class298_Sub32_Sub17) this).anInt9430 = class298_sub53.readUnsignedByte() * -1527961785;
			break;
		case 1:
			((Class298_Sub32_Sub17) this).anInt9426 = class298_sub53.readUnsignedByte() * -893138471;
			break;
		case 0:
			((Class298_Sub32_Sub17) this).anInt9428 = ((((Class298_Sub32_Sub17) this).anInt9429 = class298_sub53.readUnsignedByte() * 2059998225) * -910111141);
			break;
		}
	}

	void method3242() {
		((Class298_Sub32_Sub17) this).aByteArray9418 = Class250.method2395((35399273 * ((Class298_Sub32_Sub17) this).anInt9426), (byte) -39);
		method3236(-1703391466);
	}
}
