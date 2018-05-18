
/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class309 {
	BigInteger aBigInteger3622;
	JS5LocalRequester aClass313_3623;
	JS5StandardRequester aClass312_3624;
	BigInteger aBigInteger3625;
	Class282_Sub50_Sub11_Sub1 aClass282_Sub50_Sub11_Sub1_3626;
	RsByteBuffer aClass282_Sub35_3627;
	JS5GrabWorker[] aClass327_Sub1Array3628;

	public JS5GrabWorker method5475(int i, JS5CacheFile class203, JS5CacheFile class203_0_) {
		return method5478(i, class203, class203_0_, true, -241166262);
	}

	public boolean method5476(byte i) {
		if (null != this.aClass282_Sub35_3627) {
			return true;
		}
		if (null == this.aClass282_Sub50_Sub11_Sub1_3626) {
			if (this.aClass312_3624.method5517(-1826319794)) {
				return false;
			}
			this.aClass282_Sub50_Sub11_Sub1_3626 = this.aClass312_3624.method5515(255, 255, (byte) 0, true, (byte) 26);
		}
		if (this.aClass282_Sub50_Sub11_Sub1_3626.incomplete) {
			return false;
		}
		RsByteBuffer class282_sub35 = new RsByteBuffer(this.aClass282_Sub50_Sub11_Sub1_3626.getData(-1991458699));
		class282_sub35.index = -1282417039;
		int i_1_ = class282_sub35.readUnsignedByte();
		class282_sub35.index += i_1_ * 1290044200;
		byte[] is = new byte[(class282_sub35.buffer.length - class282_sub35.index * -1990677291)];
		class282_sub35.readBytes(is, 0, is.length, -24451515);
		byte[] is_2_;
		if (null == this.aBigInteger3625 || this.aBigInteger3622 == null) {
			is_2_ = is;
		} else {
			BigInteger biginteger = new BigInteger(is);
			BigInteger biginteger_3_ = biginteger.modPow(this.aBigInteger3625, this.aBigInteger3622);
			is_2_ = biginteger_3_.toByteArray();
		}
		if (is_2_.length != 64 && is_2_.length != 65) {
			throw new RuntimeException();
		}
		byte[] is_4_ = Class361.method6273(class282_sub35.buffer, 5, (-1990677291 * class282_sub35.index - is.length - 5), (byte) 56);
		for (int i_5_ = 0; i_5_ < 64; i_5_++) {
			/*
			 * if (is_2_[1 + i_5_] != is_4_[i_5_]) { throw new
			 * RuntimeException(); }
			 */
		}
		this.aClass327_Sub1Array3628 = new JS5GrabWorker[i_1_];
		this.aClass282_Sub35_3627 = class282_sub35;
		return true;
	}

	public boolean method5477() {
		if (null != this.aClass282_Sub35_3627) {
			return true;
		}
		if (null == this.aClass282_Sub50_Sub11_Sub1_3626) {
			if (this.aClass312_3624.method5517(-546076436)) {
				return false;
			}
			this.aClass282_Sub50_Sub11_Sub1_3626 = this.aClass312_3624.method5515(255, 255, (byte) 0, true, (byte) 80);
		}
		if (this.aClass282_Sub50_Sub11_Sub1_3626.incomplete) {
			return false;
		}
		RsByteBuffer class282_sub35 = new RsByteBuffer(this.aClass282_Sub50_Sub11_Sub1_3626.getData(2059938695));
		class282_sub35.index = -1282417039;
		int i = class282_sub35.readUnsignedByte();
		class282_sub35.index += i * 1290044200;
		byte[] is = new byte[(class282_sub35.buffer.length - class282_sub35.index * -1990677291)];
		class282_sub35.readBytes(is, 0, is.length, -144625654);
		byte[] is_6_;
		if (null == this.aBigInteger3625 || this.aBigInteger3622 == null) {
			is_6_ = is;
		} else {
			BigInteger biginteger = new BigInteger(is);
			BigInteger biginteger_7_ = biginteger.modPow(this.aBigInteger3625, this.aBigInteger3622);
			is_6_ = biginteger_7_.toByteArray();
		}
		if (is_6_.length != 65) {
			throw new RuntimeException();
		}
		byte[] is_8_ = Class361.method6273(class282_sub35.buffer, 5, (-1990677291 * class282_sub35.index - is.length - 5), (byte) -67);
		for (int i_9_ = 0; i_9_ < 64; i_9_++) {
			if (is_6_[1 + i_9_] != is_8_[i_9_]) {
				throw new RuntimeException();
			}
		}
		this.aClass327_Sub1Array3628 = new JS5GrabWorker[i];
		this.aClass282_Sub35_3627 = class282_sub35;
		return true;
	}

	public Class309(JS5StandardRequester class312, JS5LocalRequester class313, BigInteger biginteger, BigInteger biginteger_10_) {
		this.aClass312_3624 = class312;
		this.aClass313_3623 = class313;
		this.aBigInteger3625 = biginteger;
		this.aBigInteger3622 = biginteger_10_;
		if (!this.aClass312_3624.method5517(-630500434)) {
			this.aClass282_Sub50_Sub11_Sub1_3626 = this.aClass312_3624.method5515(255, 255, (byte) 0, true, (byte) 58);
		}
	}

	JS5GrabWorker method5478(int i, JS5CacheFile class203, JS5CacheFile class203_11_, boolean bool, int i_12_) {
		if (this.aClass282_Sub35_3627 == null) {
			throw new RuntimeException();
		}
		if (i < 0 || i >= this.aClass327_Sub1Array3628.length) {
			throw new RuntimeException();
		}
		if (null != this.aClass327_Sub1Array3628[i]) {
			return this.aClass327_Sub1Array3628[i];
		}
		this.aClass282_Sub35_3627.index = 1897073390 + i * 1290044200;
		int i_13_ = this.aClass282_Sub35_3627.readInt();
		int i_14_ = this.aClass282_Sub35_3627.readInt();
		byte[] is = new byte[64];
		this.aClass282_Sub35_3627.readBytes(is, 0, 64, 1722880167);
		JS5GrabWorker class327_sub1 = new JS5GrabWorker(i, class203, class203_11_, this.aClass312_3624, this.aClass313_3623, i_13_, is, i_14_, bool);
		this.aClass327_Sub1Array3628[i] = class327_sub1;
		return class327_sub1;
	}

	public boolean method5479() {
		if (null != this.aClass282_Sub35_3627) {
			return true;
		}
		if (null == this.aClass282_Sub50_Sub11_Sub1_3626) {
			if (this.aClass312_3624.method5517(-2011599687)) {
				return false;
			}
			this.aClass282_Sub50_Sub11_Sub1_3626 = this.aClass312_3624.method5515(255, 255, (byte) 0, true, (byte) -12);
		}
		if (this.aClass282_Sub50_Sub11_Sub1_3626.incomplete) {
			return false;
		}
		RsByteBuffer class282_sub35 = new RsByteBuffer(this.aClass282_Sub50_Sub11_Sub1_3626.getData(382414133));
		class282_sub35.index = -1282417039;
		int i = class282_sub35.readUnsignedByte();
		class282_sub35.index += i * 1290044200;
		byte[] is = new byte[(class282_sub35.buffer.length - class282_sub35.index * -1990677291)];
		class282_sub35.readBytes(is, 0, is.length, 2105976326);
		byte[] is_15_;
		if (null == this.aBigInteger3625 || this.aBigInteger3622 == null) {
			is_15_ = is;
		} else {
			BigInteger biginteger = new BigInteger(is);
			BigInteger biginteger_16_ = biginteger.modPow(this.aBigInteger3625, this.aBigInteger3622);
			is_15_ = biginteger_16_.toByteArray();
		}
		if (is_15_.length != 65) {
			throw new RuntimeException();
		}
		byte[] is_17_ = Class361.method6273(class282_sub35.buffer, 5, (-1990677291 * class282_sub35.index - is.length - 5), (byte) 65);
		for (int i_18_ = 0; i_18_ < 64; i_18_++) {
			if (is_15_[1 + i_18_] != is_17_[i_18_]) {
				throw new RuntimeException();
			}
		}
		this.aClass327_Sub1Array3628 = new JS5GrabWorker[i];
		this.aClass282_Sub35_3627 = class282_sub35;
		return true;
	}

	public JS5GrabWorker method5480(int i, JS5CacheFile class203, JS5CacheFile class203_19_, byte i_20_) {
		return method5478(i, class203, class203_19_, true, -84077622);
	}

	public JS5GrabWorker method5481(int i, JS5CacheFile class203, JS5CacheFile class203_21_) {
		return method5478(i, class203, class203_21_, true, -1340379943);
	}

	public void method5482(int i) {
		if (null != this.aClass327_Sub1Array3628) {
			for (int i_22_ = 0; i_22_ < this.aClass327_Sub1Array3628.length; i_22_++) {
				if (this.aClass327_Sub1Array3628[i_22_] != null) {
					this.aClass327_Sub1Array3628[i_22_].processCheck((byte) -47);
				}
			}
			for (int i_23_ = 0; i_23_ < this.aClass327_Sub1Array3628.length; i_23_++) {
				if (this.aClass327_Sub1Array3628[i_23_] != null) {
					this.aClass327_Sub1Array3628[i_23_].method12552(808893293);
				}
			}
		}
	}

	JS5GrabWorker method5483(int i, JS5CacheFile class203, JS5CacheFile class203_24_, boolean bool) {
		if (this.aClass282_Sub35_3627 == null) {
			throw new RuntimeException();
		}
		if (i < 0 || i >= this.aClass327_Sub1Array3628.length) {
			throw new RuntimeException();
		}
		if (null != this.aClass327_Sub1Array3628[i]) {
			return this.aClass327_Sub1Array3628[i];
		}
		this.aClass282_Sub35_3627.index = 1897073390 + i * 1290044200;
		int i_25_ = this.aClass282_Sub35_3627.readInt();
		int i_26_ = this.aClass282_Sub35_3627.readInt();
		byte[] is = new byte[64];
		this.aClass282_Sub35_3627.readBytes(is, 0, 64, -94736033);
		JS5GrabWorker class327_sub1 = new JS5GrabWorker(i, class203, class203_24_, this.aClass312_3624, this.aClass313_3623, i_25_, is, i_26_, bool);
		this.aClass327_Sub1Array3628[i] = class327_sub1;
		return class327_sub1;
	}

	JS5GrabWorker method5484(int i, JS5CacheFile class203, JS5CacheFile class203_27_, boolean bool) {
		if (this.aClass282_Sub35_3627 == null) {
			throw new RuntimeException();
		}
		if (i < 0 || i >= this.aClass327_Sub1Array3628.length) {
			throw new RuntimeException();
		}
		if (null != this.aClass327_Sub1Array3628[i]) {
			return this.aClass327_Sub1Array3628[i];
		}
		this.aClass282_Sub35_3627.index = 1897073390 + i * 1290044200;
		int i_28_ = this.aClass282_Sub35_3627.readInt();
		int i_29_ = this.aClass282_Sub35_3627.readInt();
		byte[] is = new byte[64];
		this.aClass282_Sub35_3627.readBytes(is, 0, 64, 1694292510);
		JS5GrabWorker class327_sub1 = new JS5GrabWorker(i, class203, class203_27_, this.aClass312_3624, this.aClass313_3623, i_28_, is, i_29_, bool);
		this.aClass327_Sub1Array3628[i] = class327_sub1;
		return class327_sub1;
	}

	JS5GrabWorker method5485(int i, JS5CacheFile class203, JS5CacheFile class203_30_, boolean bool) {
		if (this.aClass282_Sub35_3627 == null) {
			throw new RuntimeException();
		}
		if (i < 0 || i >= this.aClass327_Sub1Array3628.length) {
			throw new RuntimeException();
		}
		if (null != this.aClass327_Sub1Array3628[i]) {
			return this.aClass327_Sub1Array3628[i];
		}
		this.aClass282_Sub35_3627.index = 1897073390 + i * 1290044200;
		int i_31_ = this.aClass282_Sub35_3627.readInt();
		int i_32_ = this.aClass282_Sub35_3627.readInt();
		byte[] is = new byte[64];
		this.aClass282_Sub35_3627.readBytes(is, 0, 64, 91942893);
		JS5GrabWorker class327_sub1 = new JS5GrabWorker(i, class203, class203_30_, this.aClass312_3624, this.aClass313_3623, i_31_, is, i_32_, bool);
		this.aClass327_Sub1Array3628[i] = class327_sub1;
		return class327_sub1;
	}

	JS5GrabWorker method5486(int i, JS5CacheFile class203, JS5CacheFile class203_33_, boolean bool) {
		if (this.aClass282_Sub35_3627 == null) {
			throw new RuntimeException();
		}
		if (i < 0 || i >= this.aClass327_Sub1Array3628.length) {
			throw new RuntimeException();
		}
		if (null != this.aClass327_Sub1Array3628[i]) {
			return this.aClass327_Sub1Array3628[i];
		}
		this.aClass282_Sub35_3627.index = 1897073390 + i * 1290044200;
		int i_34_ = this.aClass282_Sub35_3627.readInt();
		int i_35_ = this.aClass282_Sub35_3627.readInt();
		byte[] is = new byte[64];
		this.aClass282_Sub35_3627.readBytes(is, 0, 64, 793428477);
		JS5GrabWorker class327_sub1 = new JS5GrabWorker(i, class203, class203_33_, this.aClass312_3624, this.aClass313_3623, i_34_, is, i_35_, bool);
		this.aClass327_Sub1Array3628[i] = class327_sub1;
		return class327_sub1;
	}

	static final void method5487(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = class513.aClass118_5886;
		Class98 class98 = class513.aClass98_5885;
		Class306.method5453(class118, class98, class527, -218121128);
	}

	static final void method5488(CS2Executor class527, int i) {
		int i_36_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_36_, (byte) 80);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_36_ >> 16];
		Class282_Sub20_Sub9.method15256(class118, class98, class527, -1115547958);
	}

	static final void method5489(CS2Executor class527, int i) {
		int i_37_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (0 != 1609086245 * client.anInt7434 && i_37_ < client.anInt7373 * -1754449153) {
			Class10 class10 = client.aClass10Array7456[i_37_];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class10.aString115;
			if (class10.aString116 != null) {
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class10.aString116;
			} else {
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
			}
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static final void method5490(CS2Executor class527, byte i) {
		class527.anInt7012 -= 283782002;
		int i_38_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_39_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class117.method1980(i_38_, i_39_, true, 1580023895);
	}

	static final boolean method5491(char c, int i) {
		if (Character.isISOControl(c)) {
			return false;
		}
		if (Class380.method6450(c, 1746553260)) {
			return true;
		}
		char[] cs = Class412.aCharArray4960;
		for (int i_40_ = 0; i_40_ < cs.length; i_40_++) {
			char c_41_ = cs[i_40_];
			if (c_41_ == c) {
				return true;
			}
		}
		cs = Class412.aCharArray4961;
		for (int i_42_ = 0; i_42_ < cs.length; i_42_++) {
			char c_43_ = cs[i_42_];
			if (c_43_ == c) {
				return true;
			}
		}
		return false;
	}

	static final boolean method5492(Class293[][][] class293s, int i, int i_44_, int i_45_, boolean bool, byte i_46_) {
		byte[][][] is = client.aClass257_7353.method4532(1227540505);
		byte i_47_ = bool ? (byte) 1 : (byte) (48374445 * client.anInt7286 & 0xff);
		if (is[Class4.anInt35 * 675588453][i_44_][i_45_] == i_47_) {
			return false;
		}
		Class311 class311 = client.aClass257_7353.method4433(33386298);
		if (((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_44_][i_45_]) & 0x4) == 0) {
			return false;
		}
		int i_48_ = 0;
		int i_49_ = 0;
		client.anIntArray7243[i_48_] = i_44_;
		client.anIntArray7425[i_48_++] = i_45_;
		is[Class4.anInt35 * 675588453][i_44_][i_45_] = i_47_;
		while (i_48_ != i_49_) {
			int i_50_ = client.anIntArray7243[i_49_] & 0xffff;
			int i_51_ = client.anIntArray7243[i_49_] >> 16 & 0xff;
			int i_52_ = client.anIntArray7243[i_49_] >> 24 & 0xff;
			int i_53_ = client.anIntArray7425[i_49_] & 0xffff;
			int i_54_ = client.anIntArray7425[i_49_] >> 16 & 0xff;
			i_49_ = 1 + i_49_ & 0xfff;
			boolean bool_55_ = false;
			if (((class311.aByteArrayArrayArray3638[Class4.anInt35 * 675588453][i_50_][i_53_]) & 0x4) == 0) {
				bool_55_ = true;
			}
			boolean bool_56_ = false;
			if (class293s != null) {
				int i_57_ = Class4.anInt35 * 675588453 + 1;
				while_214_: for (/**/; i_57_ <= 3; i_57_++) {
					if (null != class293s[i_57_] && ((class311.aByteArrayArrayArray3638[i_57_][i_50_][i_53_]) & 0x8) == 0) {
						if (bool_55_ && null != class293s[i_57_][i_50_][i_53_]) {
							if ((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3505) != null) {
								int i_58_ = Class125.method2172(i_51_, 2134977651);
								if (((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3505.aShort9615) == i_58_) || ((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3502) != null && (class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3502.aShort9615) == i_58_)) {
									continue;
								}
								if (0 != i_52_) {
									int i_59_ = Class125.method2172(i_52_, 2134977651);
									if (((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3505.aShort9615) == i_59_) || ((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3502) != null && (i_59_ == (class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3502.aShort9615)))) {
										continue;
									}
								}
								if (i_54_ != 0) {
									int i_60_ = Class125.method2172(i_54_, 2134977651);
									if (((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3505.aShort9615) == i_60_) || ((class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3502) != null && (i_60_ == (class293s[i_57_][i_50_][i_53_].aClass521_Sub1_Sub5_3502.aShort9615)))) {
										continue;
									}
								}
							}
							Class293 class293 = class293s[i_57_][i_50_][i_53_];
							if (class293.aClass208_3504 != null) {
								for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
									Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
									if (class521_sub1_sub1 instanceof Interface12) {
										Interface12 interface12 = (Interface12) class521_sub1_sub1;
										int i_61_ = interface12.method89(1472550307);
										int i_62_ = interface12.method92(522021412);
										if (i_61_ == 21) {
											i_61_ = 19;
										}
										int i_63_ = i_61_ | i_62_ << 6;
										if (i_51_ == i_63_ || i_52_ != 0 && i_52_ == i_63_ || i_54_ != 0 && i_54_ == i_63_) {
											continue while_214_;
										}
									}
								}
							}
						}
						Class293 class293 = class293s[i_57_][i_50_][i_53_];
						if (class293 != null && class293.aClass208_3504 != null) {
							for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
								Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
								if ((class521_sub1_sub1.aShort9455 != class521_sub1_sub1.aShort9458) || (class521_sub1_sub1.aShort9457 != class521_sub1_sub1.aShort9456)) {
									for (int i_64_ = class521_sub1_sub1.aShort9458; (i_64_ <= class521_sub1_sub1.aShort9455); i_64_++) {
										for (int i_65_ = (class521_sub1_sub1.aShort9456); i_65_ <= (class521_sub1_sub1.aShort9457); i_65_++) {
											is[i_57_][i_64_][i_65_] = i_47_;
										}
									}
								}
							}
						}
						is[i_57_][i_50_][i_53_] = i_47_;
						bool_56_ = true;
					}
				}
			}
			if (bool_56_) {
				int i_66_ = client.aClass257_7353.method4430(-1297702822).aClass390Array2591[Class4.anInt35 * 675588453 + 1].method6722(i_50_, i_53_, 65280);
				if (client.anIntArray7198[i] < i_66_) {
					client.anIntArray7198[i] = i_66_;
				}
				int i_67_ = i_50_ << 9;
				int i_68_ = i_53_ << 9;
				if (client.anIntArray7303[i] > i_67_) {
					client.anIntArray7303[i] = i_67_;
				} else if (client.anIntArray7194[i] < i_67_) {
					client.anIntArray7194[i] = i_67_;
				}
				if (client.anIntArray7306[i] > i_68_) {
					client.anIntArray7306[i] = i_68_;
				} else if (client.anIntArray7305[i] < i_68_) {
					client.anIntArray7305[i] = i_68_;
				}
			}
			if (!bool_55_) {
				if (i_50_ >= 1 && (is[675588453 * Class4.anInt35][i_50_ - 1][i_53_] != i_47_)) {
					client.anIntArray7243[i_48_] = i_50_ - 1 | 0x120000 | ~0x2cffffff;
					client.anIntArray7425[i_48_] = i_53_ | 0x130000;
					i_48_ = i_48_ + 1 & 0xfff;
					is[Class4.anInt35 * 675588453][i_50_ - 1][i_53_] = i_47_;
				}
				if (++i_53_ < client.aClass257_7353.method4451(-333277529)) {
					if (i_50_ - 1 >= 0 && (is[Class4.anInt35 * 675588453][i_50_ - 1][i_53_] != i_47_) && ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_50_][i_53_]) & 0x4) == 0 && ((class311.aByteArrayArrayArray3638[Class4.anInt35 * 675588453][i_50_ - 1][i_53_ - 1]) & 0x4) == 0) {
						client.anIntArray7243[i_48_] = i_50_ - 1 | 0x120000 | 0x52000000;
						client.anIntArray7425[i_48_] = i_53_ | 0x130000;
						i_48_ = i_48_ + 1 & 0xfff;
						is[675588453 * Class4.anInt35][i_50_ - 1][i_53_] = i_47_;
					}
					if (is[Class4.anInt35 * 675588453][i_50_][i_53_] != i_47_) {
						client.anIntArray7243[i_48_] = i_50_ | 0x520000 | 0x13000000;
						client.anIntArray7425[i_48_] = i_53_ | 0x530000;
						i_48_ = i_48_ + 1 & 0xfff;
						is[675588453 * Class4.anInt35][i_50_][i_53_] = i_47_;
					}
					if ((1 + i_50_ < client.aClass257_7353.method4424(-1412257249)) && (is[Class4.anInt35 * 675588453][1 + i_50_][i_53_] != i_47_) && 0 == ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_50_][i_53_]) & 0x4) && ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][1 + i_50_][i_53_ - 1]) & 0x4) == 0) {
						client.anIntArray7243[i_48_] = 1 + i_50_ | 0x520000 | ~0x6dffffff;
						client.anIntArray7425[i_48_] = i_53_ | 0x530000;
						i_48_ = i_48_ + 1 & 0xfff;
						is[Class4.anInt35 * 675588453][i_50_ + 1][i_53_] = i_47_;
					}
				}
				i_53_--;
				if (i_50_ + 1 < client.aClass257_7353.method4424(-1831553983) && (i_47_ != is[Class4.anInt35 * 675588453][i_50_ + 1][i_53_])) {
					client.anIntArray7243[i_48_] = 1 + i_50_ | 0x920000 | 0x53000000;
					client.anIntArray7425[i_48_] = i_53_ | 0x930000;
					i_48_ = i_48_ + 1 & 0xfff;
					is[Class4.anInt35 * 675588453][1 + i_50_][i_53_] = i_47_;
				}
				if (--i_53_ >= 0) {
					if (i_50_ - 1 >= 0 && (is[675588453 * Class4.anInt35][i_50_ - 1][i_53_] != i_47_) && ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_50_][i_53_]) & 0x4) == 0 && 0 == ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_50_ - 1][i_53_ + 1]) & 0x4)) {
						client.anIntArray7243[i_48_] = i_50_ - 1 | 0xd20000 | 0x12000000;
						client.anIntArray7425[i_48_] = i_53_ | 0xd30000;
						i_48_ = i_48_ + 1 & 0xfff;
						is[675588453 * Class4.anInt35][i_50_ - 1][i_53_] = i_47_;
					}
					if (is[675588453 * Class4.anInt35][i_50_][i_53_] != i_47_) {
						client.anIntArray7243[i_48_] = i_50_ | 0xd20000 | ~0x6cffffff;
						client.anIntArray7425[i_48_] = i_53_ | 0xd30000;
						i_48_ = 1 + i_48_ & 0xfff;
						is[Class4.anInt35 * 675588453][i_50_][i_53_] = i_47_;
					}
					if ((i_50_ + 1 < client.aClass257_7353.method4424(1761187382)) && (is[675588453 * Class4.anInt35][1 + i_50_][i_53_] != i_47_) && 0 == ((class311.aByteArrayArrayArray3638[Class4.anInt35 * 675588453][i_50_][i_53_]) & 0x4) && ((class311.aByteArrayArrayArray3638[Class4.anInt35 * 675588453][1 + i_50_][1 + i_53_]) & 0x4) == 0) {
						client.anIntArray7243[i_48_] = i_50_ + 1 | 0x920000 | ~0x2dffffff;
						client.anIntArray7425[i_48_] = i_53_ | 0x930000;
						i_48_ = 1 + i_48_ & 0xfff;
						is[675588453 * Class4.anInt35][1 + i_50_][i_53_] = i_47_;
					}
				}
			}
		}
		if (client.anIntArray7198[i] != -1000000) {
			client.anIntArray7198[i] += 40;
			client.anIntArray7303[i] -= 512;
			client.anIntArray7194[i] += 512;
			client.anIntArray7305[i] += 512;
			client.anIntArray7306[i] -= 512;
		}
		return true;
	}

	public static Object method5493(byte[] is, boolean bool, byte i) {
		if (null == is) {
			return null;
		}
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool) {
			return Arrays.copyOf(is, is.length);
		}
		return is;
	}
}
