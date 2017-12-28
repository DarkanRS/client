/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class287 {
	static final int anInt3403 = 14;
	static final int anInt3404 = 1;
	static final int anInt3405 = 2;
	static final int anInt3406 = 12;
	static final int anInt3407 = 4;
	static final int anInt3408 = 5;
	int anInt3409;
	static final int anInt3410 = 3;
	static final int anInt3411 = 10;
	static final int anInt3412 = 5;
	static final int anInt3413 = 6;
	static final int anInt3414 = 7;
	static final int anInt3415 = 3;
	static final int anInt3416 = 9;
	public static final int anInt3417 = 0;
	static final int anInt3418 = 11;
	public int anInt3419;
	static final int anInt3420 = 8;
	static final int anInt3421 = 4;
	static final int anInt3422 = 15;
	static final int anInt3423 = 16;
	public static final int anInt3424 = 31;
	public Class282_Sub24 aClass282_Sub24_3425;
	boolean aBool3426;
	boolean aBool3427;
	static final int anInt3428 = 2;
	short[] aShortArray3429;
	public int anInt3430;
	int anInt3431;
	int anInt3432;
	int anInt3433;
	static final int anInt3434 = 13;
	int anInt3435;

	public Class287(Class505 class505, int i, RsByteBuffer class282_sub35, int i_0_) {
		if (null == Class468_Sub20.anIntArray7920)
			Class8_Sub1.method13783(-1231486985);
		anInt3419 = class282_sub35.readUnsignedByte() * -337736817;
		((Class287) this).aBool3426 = 0 != (-2046020753 * anInt3419 & 0x8);
		((Class287) this).aBool3427 = 0 != (anInt3419 * -2046020753 & 0x10);
		anInt3419 = -337736817 * (anInt3419 * -2046020753 & 0x7);
		int i_1_ = class282_sub35.readUnsignedShort() << i_0_;
		int i_2_ = class282_sub35.readUnsignedShort() << i_0_;
		int i_3_ = class282_sub35.readUnsignedShort() << i_0_;
		int i_4_ = class282_sub35.readUnsignedByte();
		int i_5_ = 1 + i_4_ * 2;
		((Class287) this).aShortArray3429 = new short[i_5_];
		for (int i_6_ = 0; i_6_ < ((Class287) this).aShortArray3429.length; i_6_++) {
			int i_7_ = (short) class282_sub35.readUnsignedShort();
			int i_8_ = i_7_ >>> 8;
			int i_9_ = i_7_ & 0xff;
			if (i_8_ >= i_5_)
				i_8_ = i_5_ - 1;
			if (i_9_ > i_5_ - i_8_)
				i_9_ = i_5_ - i_8_;
			((Class287) this).aShortArray3429[i_6_] = (short) (i_8_ << 8 | i_9_);
		}
		i_4_ = (i_4_ << i) + (1 << i >> 1);
		int i_10_ = (null != Class540.anIntArray7136 ? (Class540.anIntArray7136[class282_sub35.readUnsignedShort()]) : (Class335.anIntArray3916[Class372.method6362(class282_sub35.readUnsignedShort(), 1418422481) & 0xffff]));
		int i_11_ = class282_sub35.readUnsignedByte();
		anInt3430 = (i_11_ & 0x1f) * 1258008977;
		((Class287) this).anInt3433 = ((i_11_ & 0xe0) << 3) * 1831775269;
		if (anInt3430 * 1711091569 != 31)
			method5052((byte) -17);
		method5050(class505, i_1_, i_3_, i_2_, i_4_, i_10_, 1680062514);
	}

	void method5050(Class505 class505, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		aClass282_Sub24_3425 = class505.method8593(i, i_12_, i_13_, i_14_, i_15_, 1.0F);
	}

	void method5051(int i, boolean bool) {
		int i_17_;
		if (!bool) {
			int i_18_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_17_ = 1024 + (Class382.anIntArray4657[i_18_ << 3] >> 4);
				break;
			case 2:
				i_17_ = i_18_;
				break;
			default:
				i_17_ = 2048;
				break;
			case 4:
				i_17_ = i_18_ >> 10 << 11;
				break;
			case 5:
				i_17_ = (i_18_ < 1024 ? i_18_ : 2048 - i_18_) << 1;
				break;
			case 3:
				i_17_ = Class468_Sub20.anIntArray7920[i_18_] >> 1;
			}
		} else
			i_17_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_17_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	void method5052(byte i) {
		switch (1711091569 * anInt3430) {
		case 4:
			((Class287) this).anInt3431 = -461449140;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 3:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 9:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = -1913803776;
			((Class287) this).anInt3409 = 2092110848;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 5:
			((Class287) this).anInt3431 = -461449140;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = -1264312320;
			break;
		case 14:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 1902712576;
			((Class287) this).anInt3409 = 1569083136;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 6:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1902712576;
			((Class287) this).anInt3409 = 1569083136;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 7:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1902712576;
			((Class287) this).anInt3409 = 1569083136;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 12:
			((Class287) this).anInt3431 = 1916759078;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 16:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 945810688;
			((Class287) this).anInt3409 = 523027712;
			((Class287) this).anInt3432 = -1264312320;
			break;
		case 2:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 15:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 1424261632;
			((Class287) this).anInt3409 = 1046055424;
			((Class287) this).anInt3432 = -632156160;
			break;
		default:
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3431 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 10:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1424261632;
			((Class287) this).anInt3409 = 1046055424;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 11:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1424261632;
			((Class287) this).anInt3409 = 1046055424;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 13:
			((Class287) this).anInt3431 = 1916759078;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = -1264312320;
			break;
		case 8:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = -1913803776;
			((Class287) this).anInt3409 = 2092110848;
			((Class287) this).anInt3432 = 1831405568;
		}
	}

	void method5053(int i, boolean bool, int i_19_) {
		int i_20_;
		if (!bool) {
			int i_21_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_20_ = 1024 + (Class382.anIntArray4657[i_21_ << 3] >> 4);
				break;
			case 2:
				i_20_ = i_21_;
				break;
			default:
				i_20_ = 2048;
				break;
			case 4:
				i_20_ = i_21_ >> 10 << 11;
				break;
			case 5:
				i_20_ = (i_21_ < 1024 ? i_21_ : 2048 - i_21_) << 1;
				break;
			case 3:
				i_20_ = Class468_Sub20.anIntArray7920[i_21_] >> 1;
			}
		} else
			i_20_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_20_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	void method5054(int i, boolean bool) {
		int i_22_;
		if (!bool) {
			int i_23_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_22_ = 1024 + (Class382.anIntArray4657[i_23_ << 3] >> 4);
				break;
			case 2:
				i_22_ = i_23_;
				break;
			default:
				i_22_ = 2048;
				break;
			case 4:
				i_22_ = i_23_ >> 10 << 11;
				break;
			case 5:
				i_22_ = (i_23_ < 1024 ? i_23_ : 2048 - i_23_) << 1;
				break;
			case 3:
				i_22_ = Class468_Sub20.anIntArray7920[i_23_] >> 1;
			}
		} else
			i_22_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_22_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	public void method5055(int i, int i_24_, int i_25_, int i_26_) {
		((Class287) this).anInt3431 = -1189104109 * i;
		((Class287) this).anInt3435 = i_26_ * -1981580437;
		((Class287) this).anInt3409 = i_25_ * -1155584827;
		((Class287) this).anInt3432 = i_24_ * -531782367;
	}

	public void method5056(int i, int i_27_, int i_28_, int i_29_) {
		((Class287) this).anInt3431 = -1189104109 * i;
		((Class287) this).anInt3435 = i_29_ * -1981580437;
		((Class287) this).anInt3409 = i_28_ * -1155584827;
		((Class287) this).anInt3432 = i_27_ * -531782367;
	}

	void method5057() {
		switch (1711091569 * anInt3430) {
		case 4:
			((Class287) this).anInt3431 = -461449140;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 3:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 9:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = -1913803776;
			((Class287) this).anInt3409 = 2092110848;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 5:
			((Class287) this).anInt3431 = -461449140;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = -1264312320;
			break;
		case 14:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 1902712576;
			((Class287) this).anInt3409 = 1569083136;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 6:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1902712576;
			((Class287) this).anInt3409 = 1569083136;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 7:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1902712576;
			((Class287) this).anInt3409 = 1569083136;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 12:
			((Class287) this).anInt3431 = 1916759078;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 16:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 945810688;
			((Class287) this).anInt3409 = 523027712;
			((Class287) this).anInt3432 = -1264312320;
			break;
		case 2:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 15:
			((Class287) this).anInt3431 = -1189104109;
			((Class287) this).anInt3435 = 1424261632;
			((Class287) this).anInt3409 = 1046055424;
			((Class287) this).anInt3432 = -632156160;
			break;
		default:
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3431 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 10:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1424261632;
			((Class287) this).anInt3409 = 1046055424;
			((Class287) this).anInt3432 = 1831405568;
			break;
		case 11:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = 1424261632;
			((Class287) this).anInt3409 = 1046055424;
			((Class287) this).anInt3432 = -632156160;
			break;
		case 13:
			((Class287) this).anInt3431 = 1916759078;
			((Class287) this).anInt3435 = 0;
			((Class287) this).anInt3409 = -110745600;
			((Class287) this).anInt3432 = -1264312320;
			break;
		case 8:
			((Class287) this).anInt3431 = 727654969;
			((Class287) this).anInt3435 = -1913803776;
			((Class287) this).anInt3409 = 2092110848;
			((Class287) this).anInt3432 = 1831405568;
		}
	}

	void method5058(int i, boolean bool) {
		int i_30_;
		if (!bool) {
			int i_31_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_30_ = 1024 + (Class382.anIntArray4657[i_31_ << 3] >> 4);
				break;
			case 2:
				i_30_ = i_31_;
				break;
			default:
				i_30_ = 2048;
				break;
			case 4:
				i_30_ = i_31_ >> 10 << 11;
				break;
			case 5:
				i_30_ = (i_31_ < 1024 ? i_31_ : 2048 - i_31_) << 1;
				break;
			case 3:
				i_30_ = Class468_Sub20.anIntArray7920[i_31_] >> 1;
			}
		} else
			i_30_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_30_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	void method5059(int i, boolean bool) {
		int i_32_;
		if (!bool) {
			int i_33_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_32_ = 1024 + (Class382.anIntArray4657[i_33_ << 3] >> 4);
				break;
			case 2:
				i_32_ = i_33_;
				break;
			default:
				i_32_ = 2048;
				break;
			case 4:
				i_32_ = i_33_ >> 10 << 11;
				break;
			case 5:
				i_32_ = (i_33_ < 1024 ? i_33_ : 2048 - i_33_) << 1;
				break;
			case 3:
				i_32_ = Class468_Sub20.anIntArray7920[i_33_] >> 1;
			}
		} else
			i_32_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_32_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	public void method5060(int i, int i_34_, int i_35_, int i_36_) {
		((Class287) this).anInt3431 = -1189104109 * i;
		((Class287) this).anInt3435 = i_36_ * -1981580437;
		((Class287) this).anInt3409 = i_35_ * -1155584827;
		((Class287) this).anInt3432 = i_34_ * -531782367;
	}

	public void method5061(int i, int i_37_, int i_38_, int i_39_, byte i_40_) {
		((Class287) this).anInt3431 = -1189104109 * i;
		((Class287) this).anInt3435 = i_39_ * -1981580437;
		((Class287) this).anInt3409 = i_38_ * -1155584827;
		((Class287) this).anInt3432 = i_37_ * -531782367;
	}

	void method5062(int i, boolean bool) {
		int i_41_;
		if (!bool) {
			int i_42_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_41_ = 1024 + (Class382.anIntArray4657[i_42_ << 3] >> 4);
				break;
			case 2:
				i_41_ = i_42_;
				break;
			default:
				i_41_ = 2048;
				break;
			case 4:
				i_41_ = i_42_ >> 10 << 11;
				break;
			case 5:
				i_41_ = (i_42_ < 1024 ? i_42_ : 2048 - i_42_) << 1;
				break;
			case 3:
				i_41_ = Class468_Sub20.anIntArray7920[i_42_] >> 1;
			}
		} else
			i_41_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_41_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	void method5063(int i, boolean bool) {
		int i_43_;
		if (!bool) {
			int i_44_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_43_ = 1024 + (Class382.anIntArray4657[i_44_ << 3] >> 4);
				break;
			case 2:
				i_43_ = i_44_;
				break;
			default:
				i_43_ = 2048;
				break;
			case 4:
				i_43_ = i_44_ >> 10 << 11;
				break;
			case 5:
				i_43_ = (i_44_ < 1024 ? i_44_ : 2048 - i_44_) << 1;
				break;
			case 3:
				i_43_ = Class468_Sub20.anIntArray7920[i_44_] >> 1;
			}
		} else
			i_43_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_43_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	void method5064(int i, boolean bool) {
		int i_45_;
		if (!bool) {
			int i_46_ = ((((Class287) this).anInt3432 * 224927457 * i / 50 + ((Class287) this).anInt3433 * 940150701) & 0x7ff);
			switch (1910670363 * ((Class287) this).anInt3431) {
			case 1:
				i_45_ = 1024 + (Class382.anIntArray4657[i_46_ << 3] >> 4);
				break;
			case 2:
				i_45_ = i_46_;
				break;
			default:
				i_45_ = 2048;
				break;
			case 4:
				i_45_ = i_46_ >> 10 << 11;
				break;
			case 5:
				i_45_ = (i_46_ < 1024 ? i_46_ : 2048 - i_46_) << 1;
				break;
			case 3:
				i_45_ = Class468_Sub20.anIntArray7920[i_46_] >> 1;
			}
		} else
			i_45_ = 2048;
		aClass282_Sub24_3425.method12373((float) ((((Class287) this).anInt3409 * -985697779 * i_45_ >> 11) + -1463035581 * ((Class287) this).anInt3435) / 2048.0F, 2036382095);
	}

	static final void method5065(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13421(635605552) ? 1 : 0;
	}

	static final void method5066(Class118 class118, Class98 class98, Class527 class527, int i) {
		class118.anInt1329 = -1346216911;
		class118.anInt1330 = ((((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(-1952846363 * class118.anInt1287, 1743541888);
	}
}
