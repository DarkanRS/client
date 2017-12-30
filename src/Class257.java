
/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class257 {
	byte[][][] aByteArrayArrayArray3162;
	Class256 aClass256_3163;
	Class256 aClass256_3164;
	Class106 aClass106_3165;
	Class329_Sub1 aClass329_Sub1_3166;
	Class329_Sub1 aClass329_Sub1_3167;
	Class219 aClass219_3168 = new Class219();
	Class219 aClass219_3169 = new Class219();
	int anInt3170;
	boolean aBool3171;
	int anInt3172;
	float aFloat3173;
	byte[][] landscapeDataBuffer;
	Class239 aClass239_3175;
	Class282_Sub50_Sub6 aClass282_Sub50_Sub6_3176;
	int anInt3177;
	byte[][] aByteArrayArray3178;
	int anInt3179;
	Class283 aClass283_3180;
	Class341 aClass341_3181 = new Class341(0, 0, 0, 0);
	Class336[] aClass336Array3182 = new Class336[4];
	public long aLong3183;
	byte[][] aByteArrayArray3184;
	int[][] anIntArrayArray3185;
	int[][] anIntArrayArray3186;
	int[] landscapeDataArchiveIds;
	Class339 aClass339_3188;
	int anInt3189 = 0;
	int anInt3190 = -114061103;
	int anInt3191 = 0;
	int anInt3192 = 380702315;
	byte[][] aByteArrayArray3193;
	int anInt3194;
	int[] anIntArray3195;
	int[] anIntArray3196;
	int[] anIntArray3197;
	int[] anIntArray3198;
	int[][] xteas;
	byte[][] aByteArrayArray3200;
	Class474 aClass474_3201;
	Class311 aClass311_3202;
	Class206 aClass206_3203;
	int[] mapDataArchiveIds;
	int[][][] anIntArrayArrayArray3205;
	public boolean aBool3206 = false;
	int anInt3207;

	void method4418(Class257 class257_0_, int i) {
		boolean bool = class257_0_.aBool3171;
		class257_0_.aBool3171 = this.aBool3171;
		this.aBool3171 = bool;
		Class256 class256 = class257_0_.aClass256_3164;
		class257_0_.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256;
		class257_0_.aClass219_3169 = this.aClass219_3168;
		this.aClass219_3169 = class257_0_.aClass219_3168;
		this.aClass239_3175.method4039(class257_0_.method4435((byte) 1), (byte) 60);
	}

	public Class256 method4419(int i) {
		return this.aClass256_3163;
	}

	public Class339 method4420(byte i) {
		return this.aClass339_3188;
	}

	public int method4421(byte i) {
		return 100 - (this.anInt3189 * 1023846956 / (866043953 * this.anInt3190));
	}

	void method4422(byte i) {
		method4456(Class480.method8046(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-765902295), (byte) 100), 375022217);
		int i_1_ = this.aClass219_3168.anInt2711 * 1948093437;
		int i_2_ = this.aClass219_3168.anInt2712 * -1002240017;
		int i_3_ = (-360258135 * Class31.anInt361 >> 12) + (i_1_ >> 3);
		int i_4_ = (i_2_ >> 3) + (Class246.anInt3029 * 413271601 >> 12);
		Class84.myPlayer.aByte7967 = (byte) 0;
		Class4.anInt35 = 0;
		Class84.myPlayer.method16130(8, 8, 210697228);
		int i_5_ = 18;
		this.xteas = new int[i_5_][4];
		this.anIntArray3195 = new int[i_5_];
		this.mapDataArchiveIds = new int[i_5_];
		this.landscapeDataArchiveIds = new int[i_5_];
		this.anIntArray3196 = new int[i_5_];
		this.aByteArrayArray3200 = new byte[i_5_][];
		this.landscapeDataBuffer = new byte[i_5_][];
		this.aByteArrayArray3184 = new byte[i_5_][];
		this.anIntArray3197 = new int[i_5_];
		this.anIntArray3198 = new int[i_5_];
		this.aByteArrayArray3178 = new byte[i_5_][];
		this.aByteArrayArray3193 = new byte[i_5_][];
		i_5_ = 0;
		for (int i_6_ = (i_3_ - (-2082656295 * this.anInt3172 >> 4)) / 8; i_6_ <= ((i_3_ + (-2082656295 * this.anInt3172 >> 4)) / 8); i_6_++) {
			for (int i_7_ = (i_4_ - (this.anInt3194 * 315871463 >> 4)) / 8; i_7_ <= ((315871463 * this.anInt3194 >> 4) + i_4_) / 8; i_7_++) {
				int i_8_ = (i_6_ << 8) + i_7_;
				this.anIntArray3195[i_5_] = i_8_;
				this.mapDataArchiveIds[i_5_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_6_, i_7_, -286852871), -1088666299));
				this.landscapeDataArchiveIds[i_5_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_6_, i_7_, 1453665209), -524022891));
				this.anIntArray3196[i_5_] = Class149.aClass317_1745.method5610(new StringBuilder().append("n").append(i_6_).append('_').append(i_7_).toString(), 247066516);
				this.anIntArray3197[i_5_] = Class149.aClass317_1745.method5610(method4455(true, true, i_6_, i_7_, 300279978), 319811182);
				this.anIntArray3198[i_5_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_6_, i_7_, -101880645), 599535507));
				if (this.anIntArray3196[i_5_] == -1) {
					this.mapDataArchiveIds[i_5_] = -1;
					this.landscapeDataArchiveIds[i_5_] = -1;
					this.anIntArray3197[i_5_] = -1;
					this.anIntArray3198[i_5_] = -1;
				}
				i_5_++;
			}
		}
		for (int i_9_ = i_5_; i_9_ < this.anIntArray3196.length; i_9_++) {
			this.anIntArray3196[i_9_] = -1;
			this.mapDataArchiveIds[i_9_] = -1;
			this.landscapeDataArchiveIds[i_9_] = -1;
			this.anIntArray3197[i_9_] = -1;
			this.anIntArray3198[i_9_] = -1;
		}
		int i_10_;
		if (client.anInt7166 * -1741204137 == 5) {
			i_10_ = 11;
		} else if (7 == -1741204137 * client.anInt7166) {
			i_10_ = 6;
		} else if (0 == -1741204137 * client.anInt7166) {
			i_10_ = 2;
		} else if (-1741204137 * client.anInt7166 == 3) {
			i_10_ = 9;
		} else {
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt7166 * -1741204137).toString());
		}
		method4458(i_3_, i_4_, i_10_, false, 1473478915);
	}

	void method4423(RsBitsBuffer class282_sub35_sub2) {
		int i = class282_sub35_sub2.readUnsignedByteC(147103491);
		boolean bool = (i & 0x1) != 0;
		int i_11_ = class282_sub35_sub2.readUnsigned128Byte();
		if (1 == i_11_) {
			this.aClass256_3163 = Class256.aClass256_3155;
		} else if (2 == i_11_) {
			this.aClass256_3163 = Class256.aClass256_3156;
		} else if (3 == i_11_) {
			this.aClass256_3163 = Class256.aClass256_3157;
		} else if (i_11_ == 4) {
			this.aClass256_3163 = Class256.aClass256_3161;
		}
		int i_12_ = class282_sub35_sub2.readUnsignedByte128(-1731543446);
		int i_13_ = class282_sub35_sub2.readUnsignedShort128();
		int i_14_ = class282_sub35_sub2.readUnsignedShort();
		if (!this.aBool3171) {
			method4457(-1797378420);
		}
		method4456(Class480.method8046(i_12_, (byte) 117), 1675451762);
		class282_sub35_sub2.initBitAccess((byte) -38);
		for (int i_15_ = 0; i_15_ < 4; i_15_++) {
			for (int i_16_ = 0; i_16_ < this.anInt3172 * -2082656295 >> 3; i_16_++) {
				for (int i_17_ = 0; i_17_ < 315871463 * this.anInt3194 >> 3; i_17_++) {
					int i_18_ = class282_sub35_sub2.readBits(1, (byte) -57);
					if (i_18_ == 1) {
						this.anIntArrayArrayArray3205[i_15_][i_16_][i_17_] = class282_sub35_sub2.readBits(26, (byte) 24);
					} else {
						this.anIntArrayArrayArray3205[i_15_][i_16_][i_17_] = -1;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 34);
		int i_19_ = ((class282_sub35_sub2.buffer.length - class282_sub35_sub2.index * -1990677291) / 16);
		this.xteas = new int[i_19_][4];
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			for (int i_21_ = 0; i_21_ < 4; i_21_++) {
				this.xteas[i_20_][i_21_] = class282_sub35_sub2.readInt();
			}
		}
		this.anIntArray3195 = new int[i_19_];
		this.mapDataArchiveIds = new int[i_19_];
		this.landscapeDataArchiveIds = new int[i_19_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_19_][];
		this.landscapeDataBuffer = new byte[i_19_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_19_];
		this.anIntArray3198 = new int[i_19_];
		this.aByteArrayArray3178 = new byte[i_19_][];
		this.aByteArrayArray3193 = new byte[i_19_][];
		i_19_ = 0;
		for (int i_22_ = 0; i_22_ < 4; i_22_++) {
			for (int i_23_ = 0; i_23_ < this.anInt3172 * -2082656295 >> 3; i_23_++) {
				for (int i_24_ = 0; i_24_ < 315871463 * this.anInt3194 >> 3; i_24_++) {
					int i_25_ = (this.anIntArrayArrayArray3205[i_22_][i_23_][i_24_]);
					if (i_25_ != -1) {
						int i_26_ = i_25_ >> 14 & 0x3ff;
						int i_27_ = i_25_ >> 3 & 0x7ff;
						int i_28_ = (i_26_ / 8 << 8) + i_27_ / 8;
						for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
							if (i_28_ == this.anIntArray3195[i_29_]) {
								i_28_ = -1;
								break;
							}
						}
						if (-1 != i_28_) {
							this.anIntArray3195[i_19_] = i_28_;
							int i_30_ = i_28_ >> 8 & 0xff;
							int i_31_ = i_28_ & 0xff;
							this.mapDataArchiveIds[i_19_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_30_, i_31_, 1307994554), 702007582));
							this.landscapeDataArchiveIds[i_19_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_30_, i_31_, -1954936162), 1415883141));
							this.anIntArray3197[i_19_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_30_, i_31_, 1841044168), 646491723));
							this.anIntArray3198[i_19_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_30_, i_31_, -2109819617), -1141860895));
							i_19_++;
						}
					}
				}
			}
		}
		method4458(i_14_, i_13_, 18, bool, 1473478915);
	}

	public int method4424(int i) {
		return this.anInt3172 * -2082656295;
	}

	public int method4425() {
		return 100 - (this.anInt3189 * 1023846956 / (866043953 * this.anInt3190));
	}

	public Class341 method4426(int i) {
		return this.aClass341_3181;
	}

	public int method4427() {
		return this.anInt3194 * 315871463;
	}

	public float method4428(int i) {
		return this.aFloat3173;
	}

	void method4429(RsBitsBuffer class282_sub35_sub2) {
		int i = class282_sub35_sub2.readUnsignedByte();
		int i_32_ = class282_sub35_sub2.readShortLE((byte) -112);
		int i_33_ = class282_sub35_sub2.readUnsignedShort();
		boolean bool = class282_sub35_sub2.readUnsignedByte() == 1;
		if (!this.aBool3171) {
			method4457(1457620652);
		}
		method4456(Class480.method8046(i, (byte) 121), -1154245498);
		int i_34_ = ((class282_sub35_sub2.buffer.length - class282_sub35_sub2.index * -1990677291) / 16);
		this.xteas = new int[i_34_][4];
		for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
			for (int i_36_ = 0; i_36_ < 4; i_36_++) {
				this.xteas[i_35_][i_36_] = class282_sub35_sub2.readInt();
			}
		}
		this.anIntArray3195 = new int[i_34_];
		this.mapDataArchiveIds = new int[i_34_];
		this.landscapeDataArchiveIds = new int[i_34_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_34_][];
		this.landscapeDataBuffer = new byte[i_34_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_34_];
		this.anIntArray3198 = new int[i_34_];
		this.aByteArrayArray3178 = new byte[i_34_][];
		this.aByteArrayArray3193 = new byte[i_34_][];
		i_34_ = 0;
		for (int i_37_ = (i_33_ - (-2082656295 * this.anInt3172 >> 4)) / 8; i_37_ <= ((-2082656295 * this.anInt3172 >> 4) + i_33_) / 8; i_37_++) {
			for (int i_38_ = (i_32_ - (this.anInt3194 * 315871463 >> 4)) / 8; i_38_ <= (i_32_ + (this.anInt3194 * 315871463 >> 4)) / 8; i_38_++) {
				this.anIntArray3195[i_34_] = i_38_ + (i_37_ << 8);
				this.mapDataArchiveIds[i_34_] = Class149.aClass317_1745.method5610(method4455(true, false, i_37_, i_38_, 902628018), 166417152);
				this.landscapeDataArchiveIds[i_34_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_37_, i_38_, 1348267098), 694659312));
				this.anIntArray3197[i_34_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_37_, i_38_, -1736157708), -371507014));
				this.anIntArray3198[i_34_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_37_, i_38_, 1055776206), -2113931700));
				i_34_++;
			}
		}
		method4458(i_33_, i_32_, 18, bool, 1473478915);
	}

	public Class206 method4430(int i) {
		return this.aClass206_3203;
	}

	public int method4431() {
		return -552598147 * this.anInt3179;
	}

	void method4432(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		for (int i_39_ = 0; i_39_ < 1599084401 * class329_sub1.anInt3845; i_39_++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(132958805);
			}
			for (int i_40_ = 0; i_40_ < this.anInt3172 * -2082656295 >> 3; i_40_++) {
				for (int i_41_ = 0; i_41_ < this.anInt3194 * 315871463 >> 3; i_41_++) {
					int i_42_ = (this.anIntArrayArrayArray3205[i_39_][i_40_][i_41_]);
					if (-1 != i_42_) {
						int i_43_ = i_42_ >> 24 & 0x3;
						if (!class329_sub1.aBool3786 || 0 == i_43_) {
							int i_44_ = i_42_ >> 1 & 0x3;
							int i_45_ = i_42_ >> 14 & 0x3ff;
							int i_46_ = i_42_ >> 3 & 0x7ff;
							int i_47_ = (i_45_ / 8 << 8) + i_46_ / 8;
							for (int i_48_ = 0; (i_48_ < this.anIntArray3195.length); i_48_++) {
								if ((this.anIntArray3195[i_48_] == i_47_) && null != is[i_48_]) {
									class329_sub1.method12462(Class316.aClass505_3680, is[i_48_], i_39_, 8 * i_40_, 8 * i_41_, i_43_, (i_45_ & 0x7) * 8, (i_46_ & 0x7) * 8, i_44_, this.aClass336Array3182, 108280215);
									break;
								}
							}
						}
					}
					if (this.aBool3171) {
						method4462(5, (byte) -21);
					}
				}
			}
		}
	}

	public Class311 method4433(int i) {
		return this.aClass311_3202;
	}

	public Class474 method4434() {
		return this.aClass474_3201;
	}

	public Class239 method4435(byte i) {
		return this.aClass239_3175;
	}

	public Class474 method4436(int i) {
		return this.aClass474_3201;
	}

	public int[][] method4437(byte i) {
		return this.anIntArrayArray3185;
	}

	public int[][] method4438(int i) {
		return this.anIntArrayArray3186;
	}

	void method4439(RsBitsBuffer class282_sub35_sub2, int i) {
		int i_49_ = class282_sub35_sub2.readUnsignedByteC(19053846);
		boolean bool = (i_49_ & 0x1) != 0;
		int i_50_ = class282_sub35_sub2.readUnsigned128Byte();
		if (1 == i_50_) {
			this.aClass256_3163 = Class256.aClass256_3155;
		} else if (2 == i_50_) {
			this.aClass256_3163 = Class256.aClass256_3156;
		} else if (3 == i_50_) {
			this.aClass256_3163 = Class256.aClass256_3157;
		} else if (i_50_ == 4) {
			this.aClass256_3163 = Class256.aClass256_3161;
		}
		int i_51_ = class282_sub35_sub2.readUnsignedByte128(-1236952914);
		int i_52_ = class282_sub35_sub2.readUnsignedShort128();
		int i_53_ = class282_sub35_sub2.readUnsignedShort();
		if (!this.aBool3171) {
			method4457(-1079730027);
		}
		method4456(Class480.method8046(i_51_, (byte) 66), -1665469325);
		class282_sub35_sub2.initBitAccess((byte) 76);
		for (int i_54_ = 0; i_54_ < 4; i_54_++) {
			for (int i_55_ = 0; i_55_ < this.anInt3172 * -2082656295 >> 3; i_55_++) {
				for (int i_56_ = 0; i_56_ < 315871463 * this.anInt3194 >> 3; i_56_++) {
					int i_57_ = class282_sub35_sub2.readBits(1, (byte) 74);
					if (i_57_ == 1) {
						this.anIntArrayArrayArray3205[i_54_][i_55_][i_56_] = class282_sub35_sub2.readBits(26, (byte) 1);
					} else {
						this.anIntArrayArrayArray3205[i_54_][i_55_][i_56_] = -1;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 26);
		int i_58_ = ((class282_sub35_sub2.buffer.length - class282_sub35_sub2.index * -1990677291) / 16);
		this.xteas = new int[i_58_][4];
		for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
			for (int i_60_ = 0; i_60_ < 4; i_60_++) {
				this.xteas[i_59_][i_60_] = class282_sub35_sub2.readInt();
			}
		}
		this.anIntArray3195 = new int[i_58_];
		this.mapDataArchiveIds = new int[i_58_];
		this.landscapeDataArchiveIds = new int[i_58_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_58_][];
		this.landscapeDataBuffer = new byte[i_58_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_58_];
		this.anIntArray3198 = new int[i_58_];
		this.aByteArrayArray3178 = new byte[i_58_][];
		this.aByteArrayArray3193 = new byte[i_58_][];
		i_58_ = 0;
		for (int i_61_ = 0; i_61_ < 4; i_61_++) {
			for (int i_62_ = 0; i_62_ < this.anInt3172 * -2082656295 >> 3; i_62_++) {
				for (int i_63_ = 0; i_63_ < 315871463 * this.anInt3194 >> 3; i_63_++) {
					int i_64_ = (this.anIntArrayArrayArray3205[i_61_][i_62_][i_63_]);
					if (i_64_ != -1) {
						int i_65_ = i_64_ >> 14 & 0x3ff;
						int i_66_ = i_64_ >> 3 & 0x7ff;
						int i_67_ = (i_65_ / 8 << 8) + i_66_ / 8;
						for (int i_68_ = 0; i_68_ < i_58_; i_68_++) {
							if (i_67_ == this.anIntArray3195[i_68_]) {
								i_67_ = -1;
								break;
							}
						}
						if (-1 != i_67_) {
							this.anIntArray3195[i_58_] = i_67_;
							int i_69_ = i_67_ >> 8 & 0xff;
							int i_70_ = i_67_ & 0xff;
							this.mapDataArchiveIds[i_58_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_69_, i_70_, 1790890938), 1374310784));
							this.landscapeDataArchiveIds[i_58_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_69_, i_70_, 1151902743), 1638287218));
							this.anIntArray3197[i_58_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_69_, i_70_, -111942668), -1393791426));
							this.anIntArray3198[i_58_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_69_, i_70_, -1970990697), 1691526385));
							i_58_++;
						}
					}
				}
			}
		}
		method4458(i_53_, i_52_, 18, bool, 1473478915);
	}

	public void method4440(byte[][][] is, byte i) {
		this.aByteArrayArrayArray3162 = is;
	}

	public Class329_Sub1 method4441(int i) {
		return this.aClass329_Sub1_3167;
	}

	public void method4442(Class474 class474, int i) {
		this.aClass474_3201 = class474;
	}

	void method4443() {
		method4456(Class480.method8046(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-971390014), (byte) 25), -1187648656);
		int i = this.aClass219_3168.anInt2711 * 1948093437;
		int i_71_ = this.aClass219_3168.anInt2712 * -1002240017;
		int i_72_ = (-360258135 * Class31.anInt361 >> 12) + (i >> 3);
		int i_73_ = (i_71_ >> 3) + (Class246.anInt3029 * 413271601 >> 12);
		Class84.myPlayer.aByte7967 = (byte) 0;
		Class4.anInt35 = 0;
		Class84.myPlayer.method16130(8, 8, -953962998);
		int i_74_ = 18;
		this.xteas = new int[i_74_][4];
		this.anIntArray3195 = new int[i_74_];
		this.mapDataArchiveIds = new int[i_74_];
		this.landscapeDataArchiveIds = new int[i_74_];
		this.anIntArray3196 = new int[i_74_];
		this.aByteArrayArray3200 = new byte[i_74_][];
		this.landscapeDataBuffer = new byte[i_74_][];
		this.aByteArrayArray3184 = new byte[i_74_][];
		this.anIntArray3197 = new int[i_74_];
		this.anIntArray3198 = new int[i_74_];
		this.aByteArrayArray3178 = new byte[i_74_][];
		this.aByteArrayArray3193 = new byte[i_74_][];
		i_74_ = 0;
		for (int i_75_ = (i_72_ - (-2082656295 * this.anInt3172 >> 4)) / 8; i_75_ <= (i_72_ + (-2082656295 * this.anInt3172 >> 4)) / 8; i_75_++) {
			for (int i_76_ = (i_73_ - (this.anInt3194 * 315871463 >> 4)) / 8; i_76_ <= ((315871463 * this.anInt3194 >> 4) + i_73_) / 8; i_76_++) {
				int i_77_ = (i_75_ << 8) + i_76_;
				this.anIntArray3195[i_74_] = i_77_;
				this.mapDataArchiveIds[i_74_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_75_, i_76_, 1222237471), 106224114));
				this.landscapeDataArchiveIds[i_74_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_75_, i_76_, -1909070673), 242738727));
				this.anIntArray3196[i_74_] = Class149.aClass317_1745.method5610(new StringBuilder().append("n").append(i_75_).append('_').append(i_76_).toString(), -892428227);
				this.anIntArray3197[i_74_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_75_, i_76_, -1724955975), -629099096));
				this.anIntArray3198[i_74_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_75_, i_76_, 1113724310), -1066578807));
				if (this.anIntArray3196[i_74_] == -1) {
					this.mapDataArchiveIds[i_74_] = -1;
					this.landscapeDataArchiveIds[i_74_] = -1;
					this.anIntArray3197[i_74_] = -1;
					this.anIntArray3198[i_74_] = -1;
				}
				i_74_++;
			}
		}
		for (int i_78_ = i_74_; i_78_ < this.anIntArray3196.length; i_78_++) {
			this.anIntArray3196[i_78_] = -1;
			this.mapDataArchiveIds[i_78_] = -1;
			this.landscapeDataArchiveIds[i_78_] = -1;
			this.anIntArray3197[i_78_] = -1;
			this.anIntArray3198[i_78_] = -1;
		}
		int i_79_;
		if (client.anInt7166 * -1741204137 == 5) {
			i_79_ = 11;
		} else if (7 == -1741204137 * client.anInt7166) {
			i_79_ = 6;
		} else if (0 == -1741204137 * client.anInt7166) {
			i_79_ = 2;
		} else if (-1741204137 * client.anInt7166 == 3) {
			i_79_ = 9;
		} else {
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt7166 * -1741204137).toString());
		}
		method4458(i_72_, i_73_, i_79_, false, 1473478915);
	}

	public void method4444(int i) {
		if (this.aClass206_3203 != null) {
			Class519.method11156(895822959);
			this.aClass206_3203.aClass284_2648.method5012(-1037153971);
			this.aClass206_3203 = null;
		}
	}

	public void method4445(byte i) {
		this.aClass339_3188 = Class339.aClass339_3984;
		this.anInt3189 = 0;
		this.anInt3190 = -114061103;
		this.anInt3191 = 0;
		this.anInt3192 = 380702315;
	}

	public void method4446(byte i) {
		this.aClass239_3175 = new Class239(Class316.aClass505_3680, this.anInt3172 * -2082656295 >> 3, this.anInt3194 * 315871463 >> 3);
	}

	public void method4447(int i) {
		this.anInt3177 = 840435000;
		this.anInt3179 = (int) (34.46 * (this.anInt3172 * -2082656295)) * -1709679659;
		this.anInt3179 = -1709679659 * (-552598147 * this.anInt3179 << 2);
		if (Class316.aClass505_3680.method8454()) {
			this.anInt3179 += 817342976;
		}
	}

	void method4448(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method4449(Class257 class257_80_) {
		boolean bool = class257_80_.aBool3171;
		class257_80_.aBool3171 = this.aBool3171;
		this.aBool3171 = bool;
		Class256 class256 = class257_80_.aClass256_3164;
		class257_80_.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256;
		class257_80_.aClass219_3169 = this.aClass219_3168;
		this.aClass219_3169 = class257_80_.aClass219_3168;
		this.aClass239_3175.method4039(class257_80_.method4435((byte) 1), (byte) -80);
	}

	public Class206 method4450() {
		return this.aClass206_3203;
	}

	public int method4451(int i) {
		return this.anInt3194 * 315871463;
	}

	void method4452(RsBitsBuffer stream) {
		int i_81_ = stream.readUnsignedByte();
		int chunkX = stream.readUnsignedShort();
		int chunkY = stream.readUnsignedShort();// method13118((byte) -75);
		boolean bool = stream.readUnsignedByte() == 1;
		if (!this.aBool3171) {
			method4457(1460285779);
		}
		method4456(Class480.method8046(i_81_, (byte) 107), 1375320268);
		int i_84_ = ((stream.buffer.length - stream.index * -1990677291) / 16);
		this.xteas = new int[i_84_][4];
		for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
			for (int i_86_ = 0; i_86_ < 4; i_86_++) {
				this.xteas[i_85_][i_86_] = stream.readInt();
			}
		}
		this.anIntArray3195 = new int[i_84_];
		this.mapDataArchiveIds = new int[i_84_];
		this.landscapeDataArchiveIds = new int[i_84_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_84_][];
		this.landscapeDataBuffer = new byte[i_84_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_84_];
		this.anIntArray3198 = new int[i_84_];
		this.aByteArrayArray3178 = new byte[i_84_][];
		this.aByteArrayArray3193 = new byte[i_84_][];
		i_84_ = 0;
		for (int i_87_ = (chunkX - (-2082656295 * this.anInt3172 >> 4)) / 8; i_87_ <= ((-2082656295 * this.anInt3172 >> 4) + chunkX) / 8; i_87_++) {
			for (int i_88_ = (chunkY - (this.anInt3194 * 315871463 >> 4)) / 8; i_88_ <= (chunkY + (this.anInt3194 * 315871463 >> 4)) / 8; i_88_++) {
				this.anIntArray3195[i_84_] = i_88_ + (i_87_ << 8);
				this.mapDataArchiveIds[i_84_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_87_, i_88_, -615462383), -254692349));
				this.landscapeDataArchiveIds[i_84_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_87_, i_88_, -1193360263), -153507048));
				this.anIntArray3197[i_84_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_87_, i_88_, 1995328827), -2019708282));
				this.anIntArray3198[i_84_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_87_, i_88_, -1407849075), -1217650768));
				i_84_++;
			}
		}
		method4458(chunkX, chunkY, 18, bool, 1473478915);
	}

	void method4453(Class329_Sub1 class329_sub1, byte[][] is) {
		int i = this.aByteArrayArray3200.length;
		for (int i_89_ = 0; i_89_ < i; i_89_++) {
			byte[] is_90_ = is[i_89_];
			if (is_90_ != null) {
				int i_91_ = ((this.anIntArray3195[i_89_] >> 8) * 64 - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_92_ = ((this.anIntArray3195[i_89_] & 0xff) * 64 - (-1002240017 * this.aClass219_3168.anInt2712));
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(1364283715);
				}
				class329_sub1.method12461(Class316.aClass505_3680, is_90_, i_91_, i_92_, this.aClass336Array3182, 2033709168);
				if (this.aBool3171) {
					method4462(10, (byte) -55);
				}
			}
		}
	}

	void method4454(Class329_Sub1 class329_sub1, byte[][] is) {
		int i = this.aByteArrayArray3200.length;
		for (int i_93_ = 0; i_93_ < i; i_93_++) {
			byte[] is_94_ = is[i_93_];
			if (is_94_ != null) {
				int i_95_ = ((this.anIntArray3195[i_93_] >> 8) * 64 - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_96_ = ((this.anIntArray3195[i_93_] & 0xff) * 64 - (-1002240017 * this.aClass219_3168.anInt2712));
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(1561739975);
				}
				class329_sub1.method12461(Class316.aClass505_3680, is_94_, i_95_, i_96_, this.aClass336Array3182, 2075155842);
				if (this.aBool3171) {
					method4462(10, (byte) -84);
				}
			}
		}
	}

	String method4455(boolean bool, boolean bool_97_, int i, int i_98_, int i_99_) {
		String string = "";
		if (bool) {
			string = new StringBuilder().append(string).append("m").append(i).append('_').append(i_98_).toString();
		} else {
			string = new StringBuilder().append(string).append("l").append(i).append('_').append(i_98_).toString();
		}
		if (bool_97_) {
			string = new StringBuilder().append('u').append(string).toString();
		}
		return string;
	}

	void method4456(Class106 class106, int i) {
		if (this.aClass106_3165 != class106) {
			this.anInt3172 = (this.anInt3194 = -740200865 * class106.anInt1076) * -1553903937;
			this.anIntArrayArrayArray3205 = (new int[4][-2082656295 * this.anInt3172 >> 3][this.anInt3194 * 315871463 >> 3]);
			this.anIntArrayArray3185 = (new int[-2082656295 * this.anInt3172][315871463 * this.anInt3194]);
			this.anIntArrayArray3186 = (new int[-2082656295 * this.anInt3172][this.anInt3194 * 315871463]);
			for (int i_100_ = 0; i_100_ < 4; i_100_++) {
				this.aClass336Array3182[i_100_] = Class403.method6801((this.anInt3172 * -2082656295), (this.anInt3194 * 315871463), (byte) 120);
			}
			this.aByteArrayArrayArray3162 = (new byte[4][this.anInt3172 * -2082656295][this.anInt3194 * 315871463]);
			this.aClass311_3202 = new Class311(4, -2082656295 * this.anInt3172, this.anInt3194 * 315871463);
			method4446((byte) -52);
			this.aClass106_3165 = class106;
		}
	}

	void method4457(int i) {
		if (this.aClass256_3163 != Class256.aClass256_3153 && this.aClass256_3164 != Class256.aClass256_3153) {
			if (Class256.aClass256_3155 == this.aClass256_3163 || Class256.aClass256_3157 == this.aClass256_3163 || ((this.aClass256_3164 != this.aClass256_3163) && ((Class256.aClass256_3158 == this.aClass256_3163) || (this.aClass256_3164 == Class256.aClass256_3158)))) {
				client.anInt7211 = 0;
				client.anInt7210 = 0;
				client.aClass465_7208.method7749(-1318045853);
			}
			this.aClass256_3164 = this.aClass256_3163;
		}
	}

	void method4458(int i, int i_101_, int i_102_, boolean bool, int i_103_) {
		if (2 == client.anInt7341 * -891719545) {
			if (this.aBool3171) {
				throw new IllegalStateException();
			}
			client.anInt7341 = -1766566601;
			client.anInt7231 = 593633913;
		}
		if (bool || i != -1892499075 * this.anInt3170 || this.anInt3207 * -975658881 != i_101_) {
			this.anInt3170 = -93814827 * i;
			this.anInt3207 = 1969692543 * i_101_;
			if (!this.aBool3171) {
				Class365.method6298(i_102_, 1265357038);
				Class446.method7447(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -532223437), true, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -29);
			}
			if (this.aClass219_3168 != null) {
				this.aClass219_3169 = this.aClass219_3168;
			} else {
				this.aClass219_3169 = new Class219(0, 0, 0);
			}
			this.aClass219_3168 = new Class219(0, (-1892499075 * this.anInt3170 - (-2082656295 * this.anInt3172 >> 4)) * 8, (this.anInt3207 * -975658881 - (315871463 * this.anInt3194 >> 4)) * 8);
			this.aClass282_Sub50_Sub6_3176 = Class291.method5175(1948093437 * (this.aClass219_3168.anInt2711), (this.aClass219_3168.anInt2712) * -1002240017);
			this.aClass283_3180 = null;
			if (!this.aBool3171) {
				method4459(i_102_, (byte) 119);
			}
		}
	}

	void method4459(int i, byte i_104_) {
		int i_105_ = (this.aClass219_3168.anInt2711 * 1948093437 - 1948093437 * this.aClass219_3169.anInt2711);
		int i_106_ = (this.aClass219_3168.anInt2712 * -1002240017 - this.aClass219_3169.anInt2712 * -1002240017);
		if (18 == i) {
			for (int i_107_ = 0; i_107_ < 1658163325 * client.anInt7210; i_107_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_107_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					for (int i_108_ = 0; i_108_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_108_++) {
						class521_sub1_sub1_sub2_sub2.regionBaseX[i_108_] -= i_105_;
						class521_sub1_sub1_sub2_sub2.regionBaseY[i_108_] -= i_106_;
					}
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_105_ * 512;
					class385.aFloat4673 -= 512 * i_106_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					class385.method6624();
				}
			}
		} else {
			boolean bool = false;
			client.anInt7211 = 0;
			int i_109_ = -1168133632 * this.anInt3172 - 512;
			int i_110_ = this.anInt3194 * -1482568192 - 512;
			for (int i_111_ = 0; i_111_ < client.anInt7210 * 1658163325; i_111_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_111_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_105_ * 512;
					class385.aFloat4673 -= 512 * i_106_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					if ((int) class385.aFloat4671 < 0 || (int) class385.aFloat4671 > i_109_ || (int) class385.aFloat4673 < 0 || (int) class385.aFloat4673 > i_110_) {
						class521_sub1_sub1_sub2_sub2.method16166(null, -1796042830);
						class282_sub47.method4991(-371378792);
						bool = true;
					} else {
						boolean bool_112_ = true;
						for (int i_113_ = 0; i_113_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_113_++) {
							class521_sub1_sub1_sub2_sub2.regionBaseX[i_113_] -= i_105_;
							class521_sub1_sub1_sub2_sub2.regionBaseY[i_113_] -= i_106_;
							if ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_113_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_113_]) >= (this.anInt3172 * -2082656295)) || (class521_sub1_sub1_sub2_sub2.regionBaseY[i_113_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseY[i_113_]) >= (this.anInt3194 * 315871463))) {
								bool_112_ = false;
							}
						}
						if (bool_112_) {
							client.anIntArray7212[((client.anInt7211 += 1568892417) * -685729279 - 1)] = (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299);
						} else {
							class521_sub1_sub1_sub2_sub2.method16166(null, -163238630);
							class282_sub47.method4991(-371378792);
							bool = true;
						}
					}
					class385.method6624();
				}
			}
			if (bool) {
				client.anInt7210 = (client.aClass465_7208.method7748((short) 292) * -1228117803);
				int i_114_ = 0;
				Iterator iterator = client.aClass465_7208.iterator();
				while (iterator.hasNext()) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
					client.aClass282_Sub47Array7209[i_114_++] = class282_sub47;
				}
			}
		}
		for (int i_115_ = 0; i_115_ < 2048; i_115_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_115_];
			if (null != class521_sub1_sub1_sub2_sub1) {
				for (int i_116_ = 0; (i_116_ < class521_sub1_sub1_sub2_sub1.regionBaseX.length); i_116_++) {
					class521_sub1_sub1_sub2_sub1.regionBaseX[i_116_] -= i_105_;
					class521_sub1_sub1_sub2_sub1.regionBaseY[i_116_] -= i_106_;
				}
				Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				class385.aFloat4671 -= i_105_ * 512;
				class385.aFloat4673 -= i_106_ * 512;
				class521_sub1_sub1_sub2_sub1.method11171(class385);
				class385.method6624();
			}
		}
		Class180[] class180s = client.aClass180Array7348;
		for (int i_117_ = 0; i_117_ < class180s.length; i_117_++) {
			Class180 class180 = class180s[i_117_];
			if (null != class180) {
				class180.anInt2243 -= i_105_ * 1588917760;
				class180.anInt2235 -= -333017600 * i_106_;
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.method8097((byte) 77)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.method8067(-298997053)) {
			class282_sub31.anInt7762 -= 1690395815 * i_105_;
			class282_sub31.anInt7763 -= 765748375 * i_106_;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= this.anInt3172 * -2082656295) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.method8097((byte) 67)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7776.method8067(270479135)) {
			class282_sub31.anInt7762 -= i_105_ * 1690395815;
			class282_sub31.anInt7763 -= i_106_ * 765748375;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= -2082656295 * this.anInt3172) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-1570433820)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 4))) {
			int i_118_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L >> 28 & 0x3L);
			int i_119_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L & 0x3fffL);
			int i_120_ = (i_119_ - this.aClass219_3168.anInt2711 * 1948093437);
			int i_121_ = (int) (-3442165056282524525L * class282_sub29.aLong3379 >> 14 & 0x3fffL);
			int i_122_ = (i_121_ - this.aClass219_3168.anInt2712 * -1002240017);
			if (null != this.aClass206_3203) {
				if (i_120_ < 0 || i_122_ < 0 || i_120_ >= -2082656295 * this.anInt3172 || i_122_ >= this.anInt3194 * 315871463 || i_120_ >= (this.aClass206_3203.anInt2617 * -1912960305) || i_122_ >= -18177099 * (this.aClass206_3203.anInt2603)) {
					if (this.aClass256_3163 != Class256.aClass256_3161) {
						class282_sub29.method4991(-371378792);
					}
				} else if ((this.aClass206_3203.aClass293ArrayArrayArray2604) != null) {
					this.aClass206_3203.method3405(i_118_, i_120_, i_122_, -1311217260);
				}
			}
		}
		if (Class187.anInt2361 * 895508675 != 0) {
			Class187.anInt2361 -= -134656021 * i_105_;
			Class187.anInt2359 -= -818291313 * i_106_;
		}
		Class16.method566(1954373372);
		Class336.method6008(false, (byte) 8);
		if (i == 18) {
			client.anInt7262 -= -631700992 * i_105_;
			client.anInt7376 -= i_106_ * 1139486208;
			Class11.anInt122 -= -1024929280 * i_105_;
			Class266.anInt3289 -= 1261918720 * i_106_;
			if (-672443707 * Class262.anInt3240 != 4) {
				Class262.anInt3240 = 770488346;
				Class86.anInt833 = -1509271845;
				Class508.anInt5864 = 987778595;
			}
		} else {
			Class296.anInt3534 -= 39297289 * i_105_;
			Class282_Sub44.anInt8064 -= i_106_ * -1587752955;
			Class96_Sub13.anInt9368 -= -2005398665 * i_105_;
			Class369.anInt4280 -= i_106_ * -772343735;
			Class31.anInt361 -= 1797075456 * i_105_;
			Class246.anInt3029 -= i_106_ * 52797952;
			if (Math.abs(i_105_) > -2082656295 * this.anInt3172 || Math.abs(i_106_) > this.anInt3194 * 315871463) {
				this.aClass239_3175.method4048(1347425088);
			}
		}
		Class350.method6189((byte) 120);
		Class58.method1139(-1725445379);
		client.aClass465_7334.method7749(189639583);
		client.aClass482_7333.method8118(-886454007);
		client.aClass457_7335.method7651((byte) 5);
		Class30.method795((byte) -81);
	}

	void method4460(int i) {
		this.aClass329_Sub1_3166 = null;
		this.aClass329_Sub1_3167 = null;
		for (int i_123_ = 0; i_123_ < 4; i_123_++) {
			if (null != this.aClass336Array3182[i_123_]) {
				this.aClass336Array3182[i_123_].method5965((byte) 5);
			}
		}
		if (this.aClass311_3202 != null) {
			this.aClass311_3202.method5495(-1587163480);
		}
		if (this.aClass239_3175 != null) {
			this.aClass239_3175.method4044(-1299057732);
		}
		if (this.aClass206_3203 != null) {
			this.aClass206_3203.aClass284_2648.method5012(-1037153971);
			this.aClass206_3203 = null;
		}
	}

	public boolean method4461(byte i) {
		if (!this.aBool3171) {
			Exception_Sub3.method15619(false, 2049702399);
		}
		this.anInt3189 = 0;
		for (int i_124_ = 0; i_124_ < this.aByteArrayArray3200.length; i_124_++) {
			if (-1 != this.mapDataArchiveIds[i_124_] && null == this.aByteArrayArray3200[i_124_]) {
				this.aByteArrayArray3200[i_124_] = Class149.aClass317_1745.getFile((this.mapDataArchiveIds[i_124_]), 0, -1737111035);
				if (null == this.aByteArrayArray3200[i_124_]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.landscapeDataArchiveIds[i_124_] && null == this.landscapeDataBuffer[i_124_]) {
				this.landscapeDataBuffer[i_124_] = (Class149.aClass317_1745.method5643(this.landscapeDataArchiveIds[i_124_], 0, this.xteas[i_124_], -1821547334));
				if (null == this.landscapeDataBuffer[i_124_]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3197[i_124_] != -1 && this.aByteArrayArray3178[i_124_] == null) {
				this.aByteArrayArray3178[i_124_] = Class149.aClass317_1745.getFile((this.anIntArray3197[i_124_]), 0, -1629073645);
				if (null == this.aByteArrayArray3178[i_124_]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.anIntArray3198[i_124_] && this.aByteArrayArray3193[i_124_] == null) {
				this.aByteArrayArray3193[i_124_] = Class149.aClass317_1745.getFile((this.anIntArray3198[i_124_]), 0, -1660643984);
				if (null == this.aByteArrayArray3193[i_124_]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3196 != null && this.aByteArrayArray3184[i_124_] == null && -1 != this.anIntArray3196[i_124_]) {
				this.aByteArrayArray3184[i_124_] = (Class149.aClass317_1745.method5643(this.anIntArray3196[i_124_], 0, this.xteas[i_124_], -1355054839));
				if (this.aByteArrayArray3184[i_124_] == null) {
					this.anInt3189 += -1145558933;
				}
			}
		}
		if (this.aClass283_3180 == null) {
			if (null != this.aClass282_Sub50_Sub6_3176 && (Class192.worldMap.validFile(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 1280235556))) {
				if (!Class192.worldMap.method5629(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 71472045)) {
					this.anInt3189 += -1145558933;
				} else {
					this.aClass283_3180 = Class301.method5331(Class192.worldMap, new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				}
			} else {
				this.aClass283_3180 = new Class283(0);
			}
		}
		if (1685275715 * this.anInt3189 > 0) {
			if (this.anInt3190 * 866043953 < this.anInt3189 * 1685275715) {
				this.anInt3190 = this.anInt3189 * -1663472973;
			}
			this.aClass339_3188 = Class339.aClass339_3985;
			return false;
		}
		this.anInt3191 = 0;
		for (int i_125_ = 0; i_125_ < this.aByteArrayArray3200.length; i_125_++) {
			byte[] is = this.landscapeDataBuffer[i_125_];
			if (null != is) {
				int i_126_ = (64 * (this.anIntArray3195[i_125_] >> 8) - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_127_ = ((this.anIntArray3195[i_125_] & 0xff) * 64 - (this.aClass219_3168.anInt2712 * -1002240017));
				if (this.aClass256_3163.method4410((byte) 64)) {
					i_126_ = 10;
					i_127_ = 10;
				}
				int i_128_ = Class251.method4316(this.aClass474_3201, is, i_126_, i_127_, (this.anInt3172 * -2082656295), (315871463 * this.anInt3194), (short) 8448);
				if (i_128_ > 0) {
					this.anInt3191 += i_128_ * -591712385;
				}
			}
			is = this.aByteArrayArray3193[i_125_];
			if (is != null) {
				int i_129_ = (64 * (this.anIntArray3195[i_125_] >> 8) - (1948093437 * this.aClass219_3168.anInt2711));
				int i_130_ = ((this.anIntArray3195[i_125_] & 0xff) * 64 - (-1002240017 * this.aClass219_3168.anInt2712));
				if (this.aClass256_3163.method4410((byte) 9)) {
					i_129_ = 10;
					i_130_ = 10;
				}
				int i_131_ = Class251.method4316(this.aClass474_3201, is, i_129_, i_130_, (this.anInt3172 * -2082656295), (this.anInt3194 * 315871463), (short) 8448);
				if (i_131_ > 0) {
					this.anInt3191 += -591712385 * i_131_;
				}
			}
		}
		if (-1047228289 * this.anInt3191 > 0) {
			if (-1112134077 * this.anInt3192 < this.anInt3191 * -1047228289) {
				this.anInt3192 = -624011499 * this.anInt3191;
			}
			this.aClass339_3188 = Class339.aClass339_3983;
			return false;
		}
		if (!this.aBool3171 && Class339.aClass339_3984 != this.aClass339_3188) {
			Class446.method7447(new StringBuilder().append(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -414285039)).append(Class2.aString16).append("(100%)").toString(), true, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -26);
		}
		this.aClass339_3188 = Class339.aClass339_3982;
		if (!this.aBool3171) {
			Class282_Sub20_Sub24.method15391(67917795);
		}
		if (!this.aBool3171) {
			for (int i_132_ = 0; i_132_ < 2048; i_132_++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_132_];
				if (null != class521_sub1_sub1_sub2_sub1) {
					class521_sub1_sub1_sub2_sub1.aClass206_7970 = null;
				}
			}
			for (int i_133_ = 0; i_133_ < client.aClass282_Sub47Array7209.length; i_133_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_133_];
				if (class282_sub47 != null) {
					((Class521_Sub1) class282_sub47.anObject8068).aClass206_7970 = null;
				}
			}
		}
		if (!this.aBool3171) {
			Class356.method6227(true, (byte) -87);
		}
		if (!this.aBool3171) {
			Class247.method4250((byte) -72);
		}
		boolean bool = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-2143596575) == 2) {
			for (int i_134_ = 0; i_134_ < this.aByteArrayArray3200.length; i_134_++) {
				if (this.aByteArrayArray3193[i_134_] != null || this.aByteArrayArray3178[i_134_] != null) {
					bool = true;
					break;
				}
			}
		}
		int i_135_ = (Class5.method295(Class393.aClass282_Sub54_4783.aClass468_Sub16_8198.method12750((byte) 32), 44628475).anInt1064 * 793844040);
		if (Class316.aClass505_3680.method8454()) {
			i_135_++;
		}
		method4447(1045268791);
		method4460(1219957593);
		this.aClass206_3203 = new Class206(Class316.aClass505_3680, 9, 4, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, i_135_, bool, Class316.aClass505_3680.method8463() > 0);
		this.aClass206_3203.method3380(false, -914334995);
		this.aClass206_3203.method3378(647281963 * client.anInt7240, -1193950137);
		if (647281963 * client.anInt7240 != 0) {
			this.aClass206_3203.method3379(Class540.aClass8_7138, (byte) -68);
		} else {
			this.aClass206_3203.method3379(null, (byte) -47);
		}
		this.aClass341_3181 = new Class341();
		this.aFloat3173 = -0.05F + (float) (Math.random() / 10.0);
		this.aClass329_Sub1_3167 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 4, this.anInt3172 * -2082656295, 315871463 * this.anInt3194, false, this.aClass311_3202, this.aClass239_3175);
		this.aClass329_Sub1_3167.method5835(1920682092);
		this.aClass329_Sub1_3167.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -19) * 2141862047;
		this.aClass329_Sub1_3167.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-1025705953) == 2;
		this.aClass329_Sub1_3167.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
		this.aClass329_Sub1_3167.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-267054469) == 1;
		this.aClass329_Sub1_3167.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1377050121) == 1;
		if (!this.aClass256_3163.method4410((byte) -32)) {
			method4463(this.aClass329_Sub1_3167, this.aByteArrayArray3200, 1315892185);
		} else {
			method4464(this.aClass329_Sub1_3167, this.aByteArrayArray3200, 1987015126);
		}
		if (this.aBool3171) {
			method4462(50, (byte) -7);
		}
		this.aClass239_3175.method4045(this.anInt3172 * -2082656295 >> 4, this.anInt3194 * 315871463 >> 4, -1230013231);
		this.aClass239_3175.method4037(this, (byte) 122);
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			this.aClass329_Sub1_3166 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 1, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, true, this.aClass311_3202, this.aClass239_3175);
			this.aClass329_Sub1_3166.method5835(1973869970);
			this.aClass329_Sub1_3166.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -93) * 2141862047;
			this.aClass329_Sub1_3166.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-962367192) == 2;
			this.aClass329_Sub1_3166.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
			this.aClass329_Sub1_3166.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(1666715266) == 1;
			this.aClass329_Sub1_3166.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-332126301) == 1;
			if (!this.aClass256_3163.method4410((byte) 46)) {
				method4463(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 500096938);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -1068785077);
				}
			} else {
				method4464(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 1544003060);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -466489103);
				}
			}
			this.aClass329_Sub1_3166.method5853(0, (this.aClass329_Sub1_3167.anIntArrayArrayArray3818[0]), -1156911590);
			this.aClass329_Sub1_3166.method5843(Class316.aClass505_3680, null, null, (byte) 11);
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -1);
			}
		}
		this.aClass329_Sub1_3167.method5843(Class316.aClass505_3680, (bool ? this.aClass329_Sub1_3166.anIntArrayArrayArray3818 : null), this.aClass336Array3182, (byte) 44);
		if (!this.aClass256_3163.method4410((byte) -39)) {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1924347583);
			}
			method4465(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -1228514951);
			if (null != this.aByteArrayArray3184) {
				method4467(-128453160);
			}
		} else {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -152609388);
			}
			method4432(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -389537380);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, -665945100);
		}
		this.aClass329_Sub1_3167.method5837(Class316.aClass505_3680, (bool ? this.aClass206_3203.aClass390Array2614[0] : null), null, 111695504);
		if (this.aBool3171) {
			method4462(75, (byte) -2);
		}
		this.aClass329_Sub1_3167.method12463(Class316.aClass505_3680, false, -770561854);
		if (this.aBool3171) {
			method4462(75, (byte) -37);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, 2049102512);
		}
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1689569657);
			}
			if (!this.aClass256_3163.method4410((byte) -69)) {
				method4465(this.aClass329_Sub1_3166, this.aByteArrayArray3193, -1228514951);
			} else {
				method4432(this.aClass329_Sub1_3166, this.aByteArrayArray3193, 346534701);
			}
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1264882543);
			}
			this.aClass329_Sub1_3166.method5837(Class316.aClass505_3680, null, this.aClass206_3203.aClass390Array2607[0], -1009930272);
			this.aClass329_Sub1_3166.method12463(Class316.aClass505_3680, true, 454950063);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 163262675);
			}
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -74);
			}
		}
		this.aClass329_Sub1_3167.method5891((short) -9701);
		if (this.aClass329_Sub1_3166 != null) {
			this.aClass329_Sub1_3166.method5891((short) -22349);
		}
		this.aClass206_3203.method3428(1203434505);
		if (this.aBool3171) {
			Class169.method2869(1612700146);
			while (!Class316.aClass505_3680.method8455(-203069693)) {
				method4462(1, (byte) -98);
			}
		}
		boolean bool_136_ = false;
		if (this.aBool3171) {
			Class257 class257_137_ = client.aClass257_7353;
			method4418(class257_137_, 16711935);
			Class6.aClass340_45.method6050(class257_137_, (byte) -54);
			bool_136_ = true;
			Class169.method2869(1958706553);
			synchronized (client.anObject7227) {
				client.aBool7225 = true;
				try {
					client.anObject7227.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass257_7353 = this;
			class257_137_.method4460(1219957593);
			method4459(18, (byte) 106);
			method4457(-974464846);
		} else {
			Class282_Sub20_Sub24.method15391(1595654016);
			this.aClass239_3175.method4075(-1340857896);
			Class282_Sub15_Sub1.method14840((byte) -73);
		}
		for (int i_138_ = 0; i_138_ < 4; i_138_++) {
			for (int i_139_ = 0; i_139_ < this.anInt3172 * -2082656295; i_139_++) {
				for (int i_140_ = 0; i_140_ < 315871463 * this.anInt3194; i_140_++) {
					Class434_Sub1.method12760(i_138_, i_139_, i_140_, -1380263584);
				}
			}
		}
		for (int i_141_ = 0; i_141_ < client.aClass281Array7180.length; i_141_++) {
			if (client.aClass281Array7180[i_141_] != null) {
				client.aClass281Array7180[i_141_].method4978(this.aClass206_3203, (byte) -1);
			}
		}
		Class405.method6823(-734889653);
		Class48_Sub2.method14571((byte) 0);
		if (Class40.method867(-1009865629) == Class279.aClass279_3368 && client.aClass184_7475.method3053((byte) -27) != null && -1741204137 * client.anInt7166 == 18) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4609, client.aClass184_7475.aClass432_2283, 582872651);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(1057001181);
			client.aClass184_7475.method3049(class282_sub23, 278728590);
		}
		if (!this.aClass256_3163.method4410((byte) 29)) {
			int i_142_ = ((-1892499075 * this.anInt3170 - (-2082656295 * this.anInt3172 >> 4)) / 8);
			int i_143_ = (((this.anInt3172 * -2082656295 >> 4) + -1892499075 * this.anInt3170) / 8);
			int i_144_ = ((-975658881 * this.anInt3207 - (315871463 * this.anInt3194 >> 4)) / 8);
			int i_145_ = ((this.anInt3207 * -975658881 + (this.anInt3194 * 315871463 >> 4)) / 8);
			for (int i_146_ = i_142_ - 1; i_146_ <= 1 + i_143_; i_146_++) {
				for (int i_147_ = i_144_ - 1; i_147_ <= i_145_ + 1; i_147_++) {
					if (i_146_ < i_142_ || i_146_ > i_143_ || i_147_ < i_144_ || i_147_ > i_145_) {
						Class149.aClass317_1745.method5630(method4455(true, false, i_146_, i_147_, 407877919), -1674080210);
						Class149.aClass317_1745.method5630(method4455(false, false, i_146_, i_147_, 205123425), 1691833527);
						Class149.aClass317_1745.method5630(method4455(true, true, i_146_, i_147_, -174543641), 761921723);
						Class149.aClass317_1745.method5630(method4455(false, true, i_146_, i_147_, -346179473), -994629113);
					}
				}
			}
		}
		if (-1741204137 * client.anInt7166 == 11) {
			Class365.method6298(5, 897954436);
		} else if (2 == client.anInt7166 * -1741204137) {
			Class365.method6298(0, 1905920660);
		} else if (-1741204137 * client.anInt7166 == 6) {
			Class365.method6298(7, 1471410444);
		} else if (9 == -1741204137 * client.anInt7166) {
			Class365.method6298(3, 1843758807);
		} else {
			Class365.method6298(13, 850026987);
			if (client.aClass184_7475.method3053((byte) -84) != null) {
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4603, client.aClass184_7475.aClass432_2283, 1466063096);
				client.aClass184_7475.method3049(class282_sub23, 1512043524);
			}
		}
		Class59.method1160(-1437458578);
		if (aBool3206) {
			Class209.method3598(Long.toString(Class169.method2869(1592227857) - (-404972914729282941L * aLong3183)), -1857188149);
			aBool3206 = false;
		}
		if (bool_136_) {
			synchronized (client.anObject7226) {
				client.anObject7226.notify();
			}
		}
		return true;
	}

	void method4462(int i, byte i_148_) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method4463(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		int i_149_ = is.length;
		for (int i_150_ = 0; i_150_ < i_149_; i_150_++) {
			byte[] is_151_ = is[i_150_];
			if (null != is_151_) {
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_151_);
				int i_152_ = this.anIntArray3195[i_150_] >> 8;
				int i_153_ = this.anIntArray3195[i_150_] & 0xff;
				int i_154_ = i_152_ * 64 - 1948093437 * (this.aClass219_3168.anInt2711);
				int i_155_ = i_153_ * 64 - (this.aClass219_3168.anInt2712 * -1002240017);
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-1503224937);
				}
				class329_sub1.method5839(class282_sub35, i_154_, i_155_, 1948093437 * this.aClass219_3168.anInt2711, -1002240017 * this.aClass219_3168.anInt2712, this.aClass336Array3182, (byte) -77);
				class329_sub1.method12471(Class316.aClass505_3680, class282_sub35, i_154_, i_155_, -885428044);
			}
		}
		for (int i_156_ = 0; i_156_ < i_149_; i_156_++) {
			int i_157_ = (64 * (this.anIntArray3195[i_156_] >> 8) - this.aClass219_3168.anInt2711 * 1948093437);
			int i_158_ = ((this.anIntArray3195[i_156_] & 0xff) * 64 - this.aClass219_3168.anInt2712 * -1002240017);
			byte[] is_159_ = is[i_156_];
			if (null == is_159_ && this.anInt3207 * -975658881 < 800) {
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(556095910);
				}
				class329_sub1.method5890(i_157_, i_158_, 64, 64, (byte) 45);
			}
		}
	}

	void method4464(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		for (int i_160_ = 0; i_160_ < class329_sub1.anInt3845 * 1599084401; i_160_++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(-84440023);
			}
			for (int i_161_ = 0; i_161_ < this.anInt3172 * -2082656295 >> 3; i_161_++) {
				for (int i_162_ = 0; i_162_ < this.anInt3194 * 315871463 >> 3; i_162_++) {
					int i_163_ = (this.anIntArrayArrayArray3205[i_160_][i_161_][i_162_]);
					if (-1 != i_163_) {
						int i_164_ = i_163_ >> 24 & 0x3;
						if (!class329_sub1.aBool3786 || i_164_ == 0) {
							int i_165_ = i_163_ >> 1 & 0x3;
							int i_166_ = i_163_ >> 14 & 0x3ff;
							int i_167_ = i_163_ >> 3 & 0x7ff;
							int i_168_ = (i_166_ / 8 << 8) + i_167_ / 8;
							for (int i_169_ = 0; (i_169_ < this.anIntArray3195.length); i_169_++) {
								if ((this.anIntArray3195[i_169_] == i_168_) && null != is[i_169_]) {
									RsByteBuffer class282_sub35 = new RsByteBuffer(is[i_169_]);
									class329_sub1.method5841(class282_sub35, i_160_, i_161_ * 8, 8 * i_162_, i_164_, i_166_, i_167_, i_165_, this.aClass336Array3182, 67301674);
									class329_sub1.method12460(Class316.aClass505_3680, class282_sub35, i_160_, 8 * i_161_, i_162_ * 8, i_164_, i_166_, i_167_, i_165_, 46695829);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_170_ = 0; i_170_ < class329_sub1.anInt3845 * 1599084401; i_170_++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(-1748836752);
			}
			for (int i_171_ = 0; i_171_ < this.anInt3172 * -2082656295 >> 3; i_171_++) {
				for (int i_172_ = 0; i_172_ < this.anInt3194 * 315871463 >> 3; i_172_++) {
					int i_173_ = (this.anIntArrayArrayArray3205[i_170_][i_171_][i_172_]);
					if (i_173_ == -1) {
						class329_sub1.method5838(i_170_, 8 * i_171_, i_172_ * 8, 8, 8, -1337783095);
					}
				}
			}
		}
	}

	void method4465(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		int i_174_ = this.aByteArrayArray3200.length;
		for (int i_175_ = 0; i_175_ < i_174_; i_175_++) {
			byte[] is_176_ = is[i_175_];
			if (is_176_ != null) {
				int i_177_ = ((this.anIntArray3195[i_175_] >> 8) * 64 - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_178_ = ((this.anIntArray3195[i_175_] & 0xff) * 64 - (-1002240017 * this.aClass219_3168.anInt2712));
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-233080678);
				}
				class329_sub1.method12461(Class316.aClass505_3680, is_176_, i_177_, i_178_, this.aClass336Array3182, 1901261567);
				if (this.aBool3171) {
					method4462(10, (byte) -37);
				}
			}
		}
	}

	public Class339 method4466() {
		return this.aClass339_3188;
	}

	void method4467(int i) {
		int i_179_ = this.aByteArrayArray3184.length;
		for (int i_180_ = 0; i_180_ < i_179_; i_180_++) {
			if (null != this.aByteArrayArray3184[i_180_]) {
				int i_181_ = -1;
				for (int i_182_ = 0; i_182_ < -1021495055 * client.anInt7234; i_182_++) {
					if (this.anIntArray3195[i_180_] == client.anIntArray7228[i_182_]) {
						i_181_ = i_182_;
						break;
					}
				}
				if (-1 == i_181_) {
					client.anIntArray7228[client.anInt7234 * -1021495055] = this.anIntArray3195[i_180_];
					i_181_ = (client.anInt7234 += 474134545) * -1021495055 - 1;
				}
				RsByteBuffer class282_sub35 = new RsByteBuffer(this.aByteArrayArray3184[i_180_]);
				int i_183_ = 0;
				while ((class282_sub35.index * -1990677291 < this.aByteArrayArray3184[i_180_].length) && i_183_ < 511 && client.anInt7211 * -685729279 < 1023) {
					int i_184_ = i_181_ | i_183_++ << 6;
					int i_185_ = class282_sub35.readUnsignedShort();
					int i_186_ = i_185_ >> 14;
					int i_187_ = i_185_ >> 7 & 0x3f;
					int i_188_ = i_185_ & 0x3f;
					int i_189_ = ((this.anIntArray3195[i_180_] >> 8) * 64 - (1948093437 * this.aClass219_3168.anInt2711) + i_187_);
					int i_190_ = (64 * (this.anIntArray3195[i_180_] & 0xff) - (this.aClass219_3168.anInt2712 * -1002240017) + i_188_);
					Class409 class409 = (Class350_Sub1.aClass406_7757.method6828(class282_sub35.readUnsignedShort(), (byte) -4));
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754(i_184_));
					if (null == class282_sub47 && (class409.aByte4900 & 0x1) > 0 && i_189_ >= 0 && (i_189_ + class409.anInt4858 * 1203434505 < -2082656295 * this.anInt3172) && i_190_ >= 0 && (class409.anInt4858 * 1203434505 + i_190_ < this.anInt3194 * 315871463)) {
						NPC class521_sub1_sub1_sub2_sub2 = (new NPC(this.aClass206_3203));
						class521_sub1_sub1_sub2_sub2.anInt10314 = -1498872675 * i_184_;
						Class282_Sub47 class282_sub47_191_ = new Class282_Sub47(class521_sub1_sub1_sub2_sub2);
						client.aClass465_7208.method7765(class282_sub47_191_, i_184_);
						client.aClass282_Sub47Array7209[((client.anInt7210 += -1228117803) * 1658163325) - 1] = class282_sub47_191_;
						client.anIntArray7212[(client.anInt7211 += 1568892417) * -685729279 - 1] = i_184_;
						class521_sub1_sub1_sub2_sub2.anInt10353 = client.cycles * -537541873;
						class521_sub1_sub1_sub2_sub2.method16166(class409, 2038282269);
						class521_sub1_sub1_sub2_sub2.method15836(1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858), (byte) -20);
						class521_sub1_sub1_sub2_sub2.anInt10340 = (-222526911 * (1913503455 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4889) << 3));
						class521_sub1_sub1_sub2_sub2.method15791((class521_sub1_sub1_sub2_sub2.aClass409_10580.aClass252_4910.method4317((short) 18632).method243((byte) 1) << 11 & 0x3fff), true, (byte) -122);
						class521_sub1_sub1_sub2_sub2.method16159(i_186_, i_189_, i_190_, true, class521_sub1_sub1_sub2_sub2.method15805(828768449), -1215667141);
					}
				}
			}
		}
	}

	public Class336 method4468(int i) {
		return this.aClass336Array3182[i];
	}

	public Class339 method4469() {
		return this.aClass339_3188;
	}

	public Class341 method4470() {
		return this.aClass341_3181;
	}

	public Class339 method4471() {
		return this.aClass339_3188;
	}

	public int method4472() {
		return 100 - (this.anInt3189 * 1023846956 / (866043953 * this.anInt3190));
	}

	public int method4473() {
		return 100 - (this.anInt3189 * 1023846956 / (866043953 * this.anInt3190));
	}

	void method4474(RsBitsBuffer class282_sub35_sub2) {
		int i = class282_sub35_sub2.readUnsignedByte();
		int i_192_ = class282_sub35_sub2.readShortLE((byte) -17);
		int i_193_ = class282_sub35_sub2.readUnsignedShort();
		boolean bool = class282_sub35_sub2.readUnsignedByte() == 1;
		if (!this.aBool3171) {
			method4457(-2132383896);
		}
		method4456(Class480.method8046(i, (byte) 40), 165239938);
		int i_194_ = ((class282_sub35_sub2.buffer.length - class282_sub35_sub2.index * -1990677291) / 16);
		this.xteas = new int[i_194_][4];
		for (int i_195_ = 0; i_195_ < i_194_; i_195_++) {
			for (int i_196_ = 0; i_196_ < 4; i_196_++) {
				this.xteas[i_195_][i_196_] = class282_sub35_sub2.readInt();
			}
		}
		this.anIntArray3195 = new int[i_194_];
		this.mapDataArchiveIds = new int[i_194_];
		this.landscapeDataArchiveIds = new int[i_194_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_194_][];
		this.landscapeDataBuffer = new byte[i_194_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_194_];
		this.anIntArray3198 = new int[i_194_];
		this.aByteArrayArray3178 = new byte[i_194_][];
		this.aByteArrayArray3193 = new byte[i_194_][];
		i_194_ = 0;
		for (int i_197_ = (i_193_ - (-2082656295 * this.anInt3172 >> 4)) / 8; i_197_ <= ((-2082656295 * this.anInt3172 >> 4) + i_193_) / 8; i_197_++) {
			for (int i_198_ = (i_192_ - (this.anInt3194 * 315871463 >> 4)) / 8; i_198_ <= (i_192_ + (this.anInt3194 * 315871463 >> 4)) / 8; i_198_++) {
				this.anIntArray3195[i_194_] = i_198_ + (i_197_ << 8);
				this.mapDataArchiveIds[i_194_] = Class149.aClass317_1745.method5610(method4455(true, false, i_197_, i_198_, 681728172), 1534239322);
				this.landscapeDataArchiveIds[i_194_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_197_, i_198_, -1855109103), -740427373));
				this.anIntArray3197[i_194_] = Class149.aClass317_1745.method5610(method4455(true, true, i_197_, i_198_, 786487709), 368669739);
				this.anIntArray3198[i_194_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_197_, i_198_, 1000512095), -558117700));
				i_194_++;
			}
		}
		method4458(i_193_, i_192_, 18, bool, 1473478915);
	}

	public int method4475() {
		return 100 - (this.anInt3191 * -1643613796 / (this.anInt3192 * -1112134077));
	}

	public Class219 method4476() {
		return this.aClass219_3168;
	}

	public Class219 method4477() {
		return this.aClass219_3168;
	}

	public Class219 method4478() {
		return this.aClass219_3168;
	}

	public int method4479() {
		return this.anInt3172 * -2082656295;
	}

	void method4480(int i) {
		int i_199_ = (this.aClass219_3168.anInt2711 * 1948093437 - 1948093437 * this.aClass219_3169.anInt2711);
		int i_200_ = (this.aClass219_3168.anInt2712 * -1002240017 - this.aClass219_3169.anInt2712 * -1002240017);
		if (18 == i) {
			for (int i_201_ = 0; i_201_ < 1658163325 * client.anInt7210; i_201_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_201_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					for (int i_202_ = 0; i_202_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_202_++) {
						class521_sub1_sub1_sub2_sub2.regionBaseX[i_202_] -= i_199_;
						class521_sub1_sub1_sub2_sub2.regionBaseY[i_202_] -= i_200_;
					}
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_199_ * 512;
					class385.aFloat4673 -= 512 * i_200_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					class385.method6624();
				}
			}
		} else {
			boolean bool = false;
			client.anInt7211 = 0;
			int i_203_ = -1168133632 * this.anInt3172 - 512;
			int i_204_ = this.anInt3194 * -1482568192 - 512;
			for (int i_205_ = 0; i_205_ < client.anInt7210 * 1658163325; i_205_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_205_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_199_ * 512;
					class385.aFloat4673 -= 512 * i_200_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					if ((int) class385.aFloat4671 < 0 || (int) class385.aFloat4671 > i_203_ || (int) class385.aFloat4673 < 0 || (int) class385.aFloat4673 > i_204_) {
						class521_sub1_sub1_sub2_sub2.method16166(null, 569524648);
						class282_sub47.method4991(-371378792);
						bool = true;
					} else {
						boolean bool_206_ = true;
						for (int i_207_ = 0; i_207_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_207_++) {
							class521_sub1_sub1_sub2_sub2.regionBaseX[i_207_] -= i_199_;
							class521_sub1_sub1_sub2_sub2.regionBaseY[i_207_] -= i_200_;
							if ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_207_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_207_]) >= (this.anInt3172 * -2082656295)) || (class521_sub1_sub1_sub2_sub2.regionBaseY[i_207_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseY[i_207_]) >= (this.anInt3194 * 315871463))) {
								bool_206_ = false;
							}
						}
						if (bool_206_) {
							client.anIntArray7212[((client.anInt7211 += 1568892417) * -685729279 - 1)] = (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299);
						} else {
							class521_sub1_sub1_sub2_sub2.method16166(null, 880915099);
							class282_sub47.method4991(-371378792);
							bool = true;
						}
					}
					class385.method6624();
				}
			}
			if (bool) {
				client.anInt7210 = (client.aClass465_7208.method7748((short) -11422) * -1228117803);
				int i_208_ = 0;
				Iterator iterator = client.aClass465_7208.iterator();
				while (iterator.hasNext()) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
					client.aClass282_Sub47Array7209[i_208_++] = class282_sub47;
				}
			}
		}
		for (int i_209_ = 0; i_209_ < 2048; i_209_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_209_];
			if (null != class521_sub1_sub1_sub2_sub1) {
				for (int i_210_ = 0; (i_210_ < class521_sub1_sub1_sub2_sub1.regionBaseX.length); i_210_++) {
					class521_sub1_sub1_sub2_sub1.regionBaseX[i_210_] -= i_199_;
					class521_sub1_sub1_sub2_sub1.regionBaseY[i_210_] -= i_200_;
				}
				Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				class385.aFloat4671 -= i_199_ * 512;
				class385.aFloat4673 -= i_200_ * 512;
				class521_sub1_sub1_sub2_sub1.method11171(class385);
				class385.method6624();
			}
		}
		Class180[] class180s = client.aClass180Array7348;
		for (int i_211_ = 0; i_211_ < class180s.length; i_211_++) {
			Class180 class180 = class180s[i_211_];
			if (null != class180) {
				class180.anInt2243 -= i_199_ * 1588917760;
				class180.anInt2235 -= -333017600 * i_200_;
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.method8097((byte) 96)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.method8067(-773618059)) {
			class282_sub31.anInt7762 -= 1690395815 * i_199_;
			class282_sub31.anInt7763 -= 765748375 * i_200_;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= this.anInt3172 * -2082656295) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.method8097((byte) 60)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7776.method8067(1267662095)) {
			class282_sub31.anInt7762 -= i_199_ * 1690395815;
			class282_sub31.anInt7763 -= i_200_ * 765748375;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= -2082656295 * this.anInt3172) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-1317680417)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 48))) {
			int i_212_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L >> 28 & 0x3L);
			int i_213_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L & 0x3fffL);
			int i_214_ = (i_213_ - this.aClass219_3168.anInt2711 * 1948093437);
			int i_215_ = (int) (-3442165056282524525L * class282_sub29.aLong3379 >> 14 & 0x3fffL);
			int i_216_ = (i_215_ - this.aClass219_3168.anInt2712 * -1002240017);
			if (null != this.aClass206_3203) {
				if (i_214_ < 0 || i_216_ < 0 || i_214_ >= -2082656295 * this.anInt3172 || i_216_ >= this.anInt3194 * 315871463 || i_214_ >= (this.aClass206_3203.anInt2617 * -1912960305) || i_216_ >= -18177099 * (this.aClass206_3203.anInt2603)) {
					if (this.aClass256_3163 != Class256.aClass256_3161) {
						class282_sub29.method4991(-371378792);
					}
				} else if ((this.aClass206_3203.aClass293ArrayArrayArray2604) != null) {
					this.aClass206_3203.method3405(i_212_, i_214_, i_216_, -1904082761);
				}
			}
		}
		if (Class187.anInt2361 * 895508675 != 0) {
			Class187.anInt2361 -= -134656021 * i_199_;
			Class187.anInt2359 -= -818291313 * i_200_;
		}
		Class16.method566(2067249021);
		Class336.method6008(false, (byte) 8);
		if (i == 18) {
			client.anInt7262 -= -631700992 * i_199_;
			client.anInt7376 -= i_200_ * 1139486208;
			Class11.anInt122 -= -1024929280 * i_199_;
			Class266.anInt3289 -= 1261918720 * i_200_;
			if (-672443707 * Class262.anInt3240 != 4) {
				Class262.anInt3240 = 770488346;
				Class86.anInt833 = -1509271845;
				Class508.anInt5864 = 987778595;
			}
		} else {
			Class296.anInt3534 -= 39297289 * i_199_;
			Class282_Sub44.anInt8064 -= i_200_ * -1587752955;
			Class96_Sub13.anInt9368 -= -2005398665 * i_199_;
			Class369.anInt4280 -= i_200_ * -772343735;
			Class31.anInt361 -= 1797075456 * i_199_;
			Class246.anInt3029 -= i_200_ * 52797952;
			if (Math.abs(i_199_) > -2082656295 * this.anInt3172 || Math.abs(i_200_) > this.anInt3194 * 315871463) {
				this.aClass239_3175.method4048(-30700247);
			}
		}
		Class350.method6189((byte) 122);
		Class58.method1139(-2023370923);
		client.aClass465_7334.method7749(-167210462);
		client.aClass482_7333.method8118(-147259070);
		client.aClass457_7335.method7651((byte) 5);
		Class30.method795((byte) 13);
	}

	public int method4481() {
		return this.anInt3194 * 315871463;
	}

	public Class283 method4482() {
		return this.aClass283_3180;
	}

	public Class283 method4483() {
		return this.aClass283_3180;
	}

	public Class283 method4484() {
		return this.aClass283_3180;
	}

	public void method4485(int i) {
		this.aClass219_3168 = new Class219();
		this.anInt3207 = 0;
		this.anInt3170 = 0;
	}

	public Class341 method4486() {
		return this.aClass341_3181;
	}

	public Class341 method4487() {
		return this.aClass341_3181;
	}

	public Class341 method4488() {
		return this.aClass341_3181;
	}

	public int[][] method4489() {
		return this.anIntArrayArray3185;
	}

	void method4490(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public int method4491() {
		return -687713985 * this.anInt3177;
	}

	String method4492(boolean bool, boolean bool_217_, int i, int i_218_) {
		String string = "";
		if (bool) {
			string = new StringBuilder().append(string).append("m").append(i).append('_').append(i_218_).toString();
		} else {
			string = new StringBuilder().append(string).append("l").append(i).append('_').append(i_218_).toString();
		}
		if (bool_217_) {
			string = new StringBuilder().append('u').append(string).toString();
		}
		return string;
	}

	public int method4493() {
		return -552598147 * this.anInt3179;
	}

	public boolean method4494() {
		if (!this.aBool3171) {
			Exception_Sub3.method15619(false, 1176782864);
		}
		this.anInt3189 = 0;
		for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
			if (-1 != this.mapDataArchiveIds[i] && null == this.aByteArrayArray3200[i]) {
				this.aByteArrayArray3200[i] = Class149.aClass317_1745.getFile((this.mapDataArchiveIds[i]), 0, -1921523326);
				if (null == this.aByteArrayArray3200[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.landscapeDataArchiveIds[i] && null == this.landscapeDataBuffer[i]) {
				this.landscapeDataBuffer[i] = (Class149.aClass317_1745.method5643(this.landscapeDataArchiveIds[i], 0, this.xteas[i], -672128414));
				if (null == this.landscapeDataBuffer[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3197[i] != -1 && this.aByteArrayArray3178[i] == null) {
				this.aByteArrayArray3178[i] = Class149.aClass317_1745.getFile((this.anIntArray3197[i]), 0, -1406584223);
				if (null == this.aByteArrayArray3178[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.anIntArray3198[i] && this.aByteArrayArray3193[i] == null) {
				this.aByteArrayArray3193[i] = Class149.aClass317_1745.getFile((this.anIntArray3198[i]), 0, -1648303609);
				if (null == this.aByteArrayArray3193[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3196 != null && this.aByteArrayArray3184[i] == null && -1 != this.anIntArray3196[i]) {
				this.aByteArrayArray3184[i] = (Class149.aClass317_1745.method5643(this.anIntArray3196[i], 0, this.xteas[i], -338834922));
				if (this.aByteArrayArray3184[i] == null) {
					this.anInt3189 += -1145558933;
				}
			}
		}
		if (this.aClass283_3180 == null) {
			if (null != this.aClass282_Sub50_Sub6_3176 && (Class192.worldMap.validFile(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 2036522079))) {
				if (!Class192.worldMap.method5629(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 71472045)) {
					this.anInt3189 += -1145558933;
				} else {
					this.aClass283_3180 = Class301.method5331(Class192.worldMap, new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				}
			} else {
				this.aClass283_3180 = new Class283(0);
			}
		}
		if (1685275715 * this.anInt3189 > 0) {
			if (this.anInt3190 * 866043953 < this.anInt3189 * 1685275715) {
				this.anInt3190 = this.anInt3189 * -1663472973;
			}
			this.aClass339_3188 = Class339.aClass339_3985;
			return false;
		}
		this.anInt3191 = 0;
		for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
			byte[] is = this.landscapeDataBuffer[i];
			if (null != is) {
				int i_219_ = (64 * (this.anIntArray3195[i] >> 8) - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_220_ = ((this.anIntArray3195[i] & 0xff) * 64 - (this.aClass219_3168.anInt2712 * -1002240017));
				if (this.aClass256_3163.method4410((byte) 12)) {
					i_219_ = 10;
					i_220_ = 10;
				}
				int i_221_ = Class251.method4316(this.aClass474_3201, is, i_219_, i_220_, (this.anInt3172 * -2082656295), (315871463 * this.anInt3194), (short) 8448);
				if (i_221_ > 0) {
					this.anInt3191 += i_221_ * -591712385;
				}
			}
			is = this.aByteArrayArray3193[i];
			if (is != null) {
				int i_222_ = (64 * (this.anIntArray3195[i] >> 8) - 1948093437 * (this.aClass219_3168.anInt2711));
				int i_223_ = ((this.anIntArray3195[i] & 0xff) * 64 - -1002240017 * (this.aClass219_3168.anInt2712));
				if (this.aClass256_3163.method4410((byte) 89)) {
					i_222_ = 10;
					i_223_ = 10;
				}
				int i_224_ = Class251.method4316(this.aClass474_3201, is, i_222_, i_223_, (this.anInt3172 * -2082656295), (this.anInt3194 * 315871463), (short) 8448);
				if (i_224_ > 0) {
					this.anInt3191 += -591712385 * i_224_;
				}
			}
		}
		if (-1047228289 * this.anInt3191 > 0) {
			if (-1112134077 * this.anInt3192 < this.anInt3191 * -1047228289) {
				this.anInt3192 = -624011499 * this.anInt3191;
			}
			this.aClass339_3188 = Class339.aClass339_3983;
			return false;
		}
		if (!this.aBool3171 && Class339.aClass339_3984 != this.aClass339_3188) {
			Class446.method7447(new StringBuilder().append(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -1127640948)).append(Class2.aString16).append("(100%)").toString(), true, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -11);
		}
		this.aClass339_3188 = Class339.aClass339_3982;
		if (!this.aBool3171) {
			Class282_Sub20_Sub24.method15391(-49273859);
		}
		if (!this.aBool3171) {
			for (int i = 0; i < 2048; i++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i];
				if (null != class521_sub1_sub1_sub2_sub1) {
					class521_sub1_sub1_sub2_sub1.aClass206_7970 = null;
				}
			}
			for (int i = 0; i < client.aClass282_Sub47Array7209.length; i++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i];
				if (class282_sub47 != null) {
					((Class521_Sub1) class282_sub47.anObject8068).aClass206_7970 = null;
				}
			}
		}
		if (!this.aBool3171) {
			Class356.method6227(true, (byte) 2);
		}
		if (!this.aBool3171) {
			Class247.method4250((byte) -92);
		}
		boolean bool = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-1660228829) == 2) {
			for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
				if (this.aByteArrayArray3193[i] != null || this.aByteArrayArray3178[i] != null) {
					bool = true;
					break;
				}
			}
		}
		int i = (Class5.method295(Class393.aClass282_Sub54_4783.aClass468_Sub16_8198.method12750((byte) 32), 44628475).anInt1064 * 793844040);
		if (Class316.aClass505_3680.method8454()) {
			i++;
		}
		method4447(1430006617);
		method4460(1219957593);
		this.aClass206_3203 = new Class206(Class316.aClass505_3680, 9, 4, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, i, bool, Class316.aClass505_3680.method8463() > 0);
		this.aClass206_3203.method3380(false, -914334995);
		this.aClass206_3203.method3378(647281963 * client.anInt7240, -269921666);
		if (647281963 * client.anInt7240 != 0) {
			this.aClass206_3203.method3379(Class540.aClass8_7138, (byte) -100);
		} else {
			this.aClass206_3203.method3379(null, (byte) -114);
		}
		this.aClass341_3181 = new Class341();
		this.aFloat3173 = -0.05F + (float) (Math.random() / 10.0);
		this.aClass329_Sub1_3167 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 4, this.anInt3172 * -2082656295, 315871463 * this.anInt3194, false, this.aClass311_3202, this.aClass239_3175);
		this.aClass329_Sub1_3167.method5835(2140263735);
		this.aClass329_Sub1_3167.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -15) * 2141862047;
		this.aClass329_Sub1_3167.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1007698640) == 2;
		this.aClass329_Sub1_3167.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
		this.aClass329_Sub1_3167.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(1675142546) == 1;
		this.aClass329_Sub1_3167.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(2021658112) == 1;
		if (!this.aClass256_3163.method4410((byte) 4)) {
			method4463(this.aClass329_Sub1_3167, this.aByteArrayArray3200, -2111248397);
		} else {
			method4464(this.aClass329_Sub1_3167, this.aByteArrayArray3200, 1610051571);
		}
		if (this.aBool3171) {
			method4462(50, (byte) -124);
		}
		this.aClass239_3175.method4045(this.anInt3172 * -2082656295 >> 4, this.anInt3194 * 315871463 >> 4, -1230013231);
		this.aClass239_3175.method4037(this, (byte) 6);
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			this.aClass329_Sub1_3166 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 1, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, true, this.aClass311_3202, this.aClass239_3175);
			this.aClass329_Sub1_3166.method5835(1668247075);
			this.aClass329_Sub1_3166.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -12) * 2141862047;
			this.aClass329_Sub1_3166.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-1602526404) == 2;
			this.aClass329_Sub1_3166.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
			this.aClass329_Sub1_3166.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(585733903) == 1;
			this.aClass329_Sub1_3166.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1639955994) == 1;
			if (!this.aClass256_3163.method4410((byte) -23)) {
				method4463(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 1068670868);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, 1837045371);
				}
			} else {
				method4464(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 1866900942);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -1651615061);
				}
			}
			this.aClass329_Sub1_3166.method5853(0, (this.aClass329_Sub1_3167.anIntArrayArrayArray3818[0]), -1424044260);
			this.aClass329_Sub1_3166.method5843(Class316.aClass505_3680, null, null, (byte) 11);
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -11);
			}
		}
		this.aClass329_Sub1_3167.method5843(Class316.aClass505_3680, (bool ? this.aClass329_Sub1_3166.anIntArrayArrayArray3818 : null), this.aClass336Array3182, (byte) 25);
		if (!this.aClass256_3163.method4410((byte) 95)) {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1997669106);
			}
			method4465(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -1228514951);
			if (null != this.aByteArrayArray3184) {
				method4467(1465425499);
			}
		} else {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 781564813);
			}
			method4432(this.aClass329_Sub1_3167, this.landscapeDataBuffer, 931633590);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, 1470577238);
		}
		this.aClass329_Sub1_3167.method5837(Class316.aClass505_3680, (bool ? this.aClass206_3203.aClass390Array2614[0] : null), null, -243585947);
		if (this.aBool3171) {
			method4462(75, (byte) -67);
		}
		this.aClass329_Sub1_3167.method12463(Class316.aClass505_3680, false, -1228405295);
		if (this.aBool3171) {
			method4462(75, (byte) -27);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, 327183780);
		}
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 244923626);
			}
			if (!this.aClass256_3163.method4410((byte) 19)) {
				method4465(this.aClass329_Sub1_3166, this.aByteArrayArray3193, -1228514951);
			} else {
				method4432(this.aClass329_Sub1_3166, this.aByteArrayArray3193, 659195621);
			}
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -530203983);
			}
			this.aClass329_Sub1_3166.method5837(Class316.aClass505_3680, null, this.aClass206_3203.aClass390Array2607[0], -1585066784);
			this.aClass329_Sub1_3166.method12463(Class316.aClass505_3680, true, -43965366);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1094500524);
			}
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -2);
			}
		}
		this.aClass329_Sub1_3167.method5891((short) -4887);
		if (this.aClass329_Sub1_3166 != null) {
			this.aClass329_Sub1_3166.method5891((short) -10338);
		}
		this.aClass206_3203.method3428(1203434505);
		if (this.aBool3171) {
			Class169.method2869(1746895792);
			while (!Class316.aClass505_3680.method8455(-641927814)) {
				method4462(1, (byte) -59);
			}
		}
		boolean bool_225_ = false;
		if (this.aBool3171) {
			Class257 class257_226_ = client.aClass257_7353;
			method4418(class257_226_, 16711935);
			Class6.aClass340_45.method6050(class257_226_, (byte) -107);
			bool_225_ = true;
			Class169.method2869(2006245008);
			synchronized (client.anObject7227) {
				client.aBool7225 = true;
				try {
					client.anObject7227.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass257_7353 = this;
			class257_226_.method4460(1219957593);
			method4459(18, (byte) 29);
			method4457(12974806);
		} else {
			Class282_Sub20_Sub24.method15391(-604184889);
			this.aClass239_3175.method4075(-287055975);
			Class282_Sub15_Sub1.method14840((byte) 3);
		}
		for (int i_227_ = 0; i_227_ < 4; i_227_++) {
			for (int i_228_ = 0; i_228_ < this.anInt3172 * -2082656295; i_228_++) {
				for (int i_229_ = 0; i_229_ < 315871463 * this.anInt3194; i_229_++) {
					Class434_Sub1.method12760(i_227_, i_228_, i_229_, -1380263584);
				}
			}
		}
		for (int i_230_ = 0; i_230_ < client.aClass281Array7180.length; i_230_++) {
			if (client.aClass281Array7180[i_230_] != null) {
				client.aClass281Array7180[i_230_].method4978(this.aClass206_3203, (byte) -1);
			}
		}
		Class405.method6823(-734889653);
		Class48_Sub2.method14571((byte) 0);
		if (Class40.method867(1172351871) == Class279.aClass279_3368 && client.aClass184_7475.method3053((byte) -108) != null && -1741204137 * client.anInt7166 == 18) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4609, client.aClass184_7475.aClass432_2283, 1086570416);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(1057001181);
			client.aClass184_7475.method3049(class282_sub23, 2101119613);
		}
		if (!this.aClass256_3163.method4410((byte) 80)) {
			int i_231_ = ((-1892499075 * this.anInt3170 - (-2082656295 * this.anInt3172 >> 4)) / 8);
			int i_232_ = (((this.anInt3172 * -2082656295 >> 4) + -1892499075 * this.anInt3170) / 8);
			int i_233_ = ((-975658881 * this.anInt3207 - (315871463 * this.anInt3194 >> 4)) / 8);
			int i_234_ = ((this.anInt3207 * -975658881 + (this.anInt3194 * 315871463 >> 4)) / 8);
			for (int i_235_ = i_231_ - 1; i_235_ <= 1 + i_232_; i_235_++) {
				for (int i_236_ = i_233_ - 1; i_236_ <= i_234_ + 1; i_236_++) {
					if (i_235_ < i_231_ || i_235_ > i_232_ || i_236_ < i_233_ || i_236_ > i_234_) {
						Class149.aClass317_1745.method5630(method4455(true, false, i_235_, i_236_, 259961660), -1214256209);
						Class149.aClass317_1745.method5630(method4455(false, false, i_235_, i_236_, 1231325801), 797968441);
						Class149.aClass317_1745.method5630(method4455(true, true, i_235_, i_236_, 425485420), 1080700392);
						Class149.aClass317_1745.method5630(method4455(false, true, i_235_, i_236_, 1176375594), 583748205);
					}
				}
			}
		}
		if (-1741204137 * client.anInt7166 == 11) {
			Class365.method6298(5, 910787325);
		} else if (2 == client.anInt7166 * -1741204137) {
			Class365.method6298(0, 2097012130);
		} else if (-1741204137 * client.anInt7166 == 6) {
			Class365.method6298(7, 1302683100);
		} else if (9 == -1741204137 * client.anInt7166) {
			Class365.method6298(3, 1540879179);
		} else {
			Class365.method6298(13, 1539401030);
			if (client.aClass184_7475.method3053((byte) -121) != null) {
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4603, client.aClass184_7475.aClass432_2283, 1444416128);
				client.aClass184_7475.method3049(class282_sub23, -239881731);
			}
		}
		Class59.method1160(-338060744);
		if (aBool3206) {
			Class209.method3598(Long.toString(Class169.method2869(1930437090) - (-404972914729282941L * aLong3183)), -304139288);
			aBool3206 = false;
		}
		if (bool_225_) {
			synchronized (client.anObject7226) {
				client.anObject7226.notify();
			}
		}
		return true;
	}

	public byte[][] method4495(int i) {
		if (this.aClass329_Sub1_3167 != null && (this.aClass329_Sub1_3167.aByteArrayArrayArray3788 != null) && null != (this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i])) {
			return (this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i]);
		}
		return null;
	}

	public Class311 method4496() {
		return this.aClass311_3202;
	}

	public void method4497() {
		if (this.aBool3171) {
			method4445((byte) -61);
			Class122.method2111(true, 662490589);
			Class257 class257_237_ = client.aClass257_7353;
			this.anIntArray3195 = class257_237_.anIntArray3195;
			this.mapDataArchiveIds = class257_237_.mapDataArchiveIds;
			this.landscapeDataArchiveIds = class257_237_.landscapeDataArchiveIds;
			this.anIntArray3196 = class257_237_.anIntArray3196;
			this.anIntArray3197 = class257_237_.anIntArray3197;
			this.anIntArray3198 = class257_237_.anIntArray3198;
			this.xteas = class257_237_.xteas;
			this.aByteArrayArray3200 = class257_237_.aByteArrayArray3200;
			this.landscapeDataBuffer = class257_237_.landscapeDataBuffer;
			this.aByteArrayArray3184 = class257_237_.aByteArrayArray3184;
			this.aByteArrayArray3178 = class257_237_.aByteArrayArray3178;
			this.aByteArrayArray3193 = class257_237_.aByteArrayArray3193;
			this.aClass336Array3182 = class257_237_.aClass336Array3182;
			this.aClass311_3202 = class257_237_.aClass311_3202;
			this.aClass239_3175 = class257_237_.aClass239_3175;
			this.anIntArrayArrayArray3205 = class257_237_.anIntArrayArrayArray3205;
			this.anInt3177 = 1 * class257_237_.anInt3177;
			this.anInt3179 = class257_237_.anInt3179 * 1;
			this.aClass282_Sub50_Sub6_3176 = class257_237_.aClass282_Sub50_Sub6_3176;
			this.aClass283_3180 = class257_237_.aClass283_3180;
			this.anIntArrayArray3185 = class257_237_.anIntArrayArray3185;
			this.anIntArrayArray3186 = class257_237_.anIntArrayArray3186;
			this.aByteArrayArrayArray3162 = class257_237_.aByteArrayArrayArray3162;
			this.aClass256_3163 = class257_237_.aClass256_3163;
			this.aClass106_3165 = class257_237_.aClass106_3165;
			this.aClass219_3168 = class257_237_.aClass219_3168;
			this.aClass219_3169 = class257_237_.aClass219_3169;
			this.anInt3170 = class257_237_.anInt3170 * 1;
			this.anInt3207 = 1 * class257_237_.anInt3207;
			this.anInt3172 = 1 * class257_237_.anInt3172;
			this.anInt3194 = 1 * class257_237_.anInt3194;
		} else if (5 == -1741204137 * client.anInt7166) {
			Class365.method6298(11, 891487733);
		} else if (-1741204137 * client.anInt7166 == 0) {
			Class365.method6298(2, 1385603482);
		} else if (-1741204137 * client.anInt7166 == 7) {
			Class365.method6298(6, 1773365580);
		} else if (13 == -1741204137 * client.anInt7166) {
			Class365.method6298(18, 1421364662);
		} else if (-1741204137 * client.anInt7166 == 3) {
			Class365.method6298(9, 1221523304);
		}
	}

	void method4498(int i) {
		this.aClass256_3164 = this.aClass256_3163;
		method4456(Class106.aClass106_1075, -1398023418);
		for (int i_238_ = 0; i_238_ < 4; i_238_++) {
			for (int i_239_ = 0; i_239_ < -2082656295 * this.anInt3172 >> 3; i_239_++) {
				for (int i_240_ = 0; i_240_ < 315871463 * this.anInt3194 >> 3; i_240_++) {
					this.anIntArrayArrayArray3205[i_238_][i_239_][i_240_] = -1;
				}
			}
		}
		for (Class282_Sub2 class282_sub2 = (Class282_Sub2) Class86.aClass482_827.method8097((byte) 76); class282_sub2 != null; class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.method8067(832197045))) {
			int i_241_ = -2049294537 * class282_sub2.anInt7486;
			boolean bool = 1 == (i_241_ & 0x1);
			int i_242_ = class282_sub2.anInt7479 * 1966632557 >> 3;
			int i_243_ = -1331660813 * class282_sub2.anInt7482 >> 3;
			int i_244_ = class282_sub2.anInt7480 * -141709603;
			int i_245_ = class282_sub2.anInt7483 * -1848312469;
			int i_246_ = class282_sub2.anInt7478 * 1325453341;
			int i_247_ = class282_sub2.anInt7481 * -1852461269;
			int i_248_ = 2090121559 * class282_sub2.anInt7484;
			int i_249_ = class282_sub2.anInt7485 * -1320761179;
			int i_250_ = 0;
			int i_251_ = 0;
			int i_252_ = 1;
			int i_253_ = 1;
			if (1 == i_241_) {
				i_251_ = i_248_ - 1;
				i_252_ = -1;
			} else if (i_241_ == 2) {
				i_251_ = i_248_ - 1;
				i_250_ = i_249_ - 1;
				i_252_ = -1;
				i_253_ = -1;
			} else if (i_241_ == 3) {
				i_250_ = i_249_ - 1;
				i_252_ = 1;
				i_253_ = -1;
			}
			int i_254_ = i_243_;
			while (i_254_ < i_249_ + i_243_) {
				int i_255_ = i_251_;
				int i_256_ = i_242_;
				while (i_256_ < i_248_ + i_242_) {
					if (bool) {
						this.anIntArrayArrayArray3205[i_247_][i_244_ + i_250_][i_255_ + i_245_] = ((i_256_ << 14) + (i_246_ << 24) + (i_254_ << 3) + (i_241_ << 1));
					} else {
						this.anIntArrayArrayArray3205[i_247_][i_255_ + i_244_][i_245_ + i_250_] = (i_241_ << 1) + ((i_254_ << 3) + ((i_256_ << 14) + (i_246_ << 24)));
					}
					i_256_++;
					i_255_ += i_252_;
				}
				i_254_++;
				i_250_ += i_253_;
			}
		}
		int i_257_ = Class262.anIntArrayArray3239.length;
		this.anIntArray3195 = new int[i_257_];
		this.mapDataArchiveIds = new int[i_257_];
		this.landscapeDataArchiveIds = new int[i_257_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_257_][];
		this.landscapeDataBuffer = new byte[i_257_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_257_];
		this.anIntArray3198 = new int[i_257_];
		this.aByteArrayArray3178 = new byte[i_257_][];
		this.aByteArrayArray3193 = new byte[i_257_][];
		i_257_ = 0;
		for (Class282_Sub2 class282_sub2 = (Class282_Sub2) Class86.aClass482_827.method8097((byte) 29); class282_sub2 != null; class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.method8067(2076366148))) {
			int i_258_ = 1966632557 * class282_sub2.anInt7479 >>> 3;
			int i_259_ = -1331660813 * class282_sub2.anInt7482 >>> 3;
			int i_260_ = 2090121559 * class282_sub2.anInt7484 + i_258_;
			if (0 == (i_260_ & 0x7)) {
				i_260_--;
			}
			i_260_ >>>= 3;
			int i_261_ = i_259_ + class282_sub2.anInt7485 * -1320761179;
			if ((i_261_ & 0x7) == 0) {
				i_261_--;
			}
			i_261_ >>>= 3;
			for (int i_262_ = i_258_ >>> 3; i_262_ <= i_260_; i_262_++) {
				while_78_: for (int i_263_ = i_259_ >>> 3; i_263_ <= i_261_; i_263_++) {
					int i_264_ = i_262_ << 8 | i_263_;
					for (int i_265_ = 0; i_265_ < i_257_; i_265_++) {
						if (this.anIntArray3195[i_265_] == i_264_) {
							continue while_78_;
						}
					}
					this.anIntArray3195[i_257_] = i_264_;
					this.mapDataArchiveIds[i_257_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_262_, i_263_, 522813814), 1557648612));
					this.landscapeDataArchiveIds[i_257_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_262_, i_263_, -511040069), -1519841497));
					this.anIntArray3197[i_257_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_262_, i_263_, -350569917), -115943179));
					this.anIntArray3198[i_257_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_262_, i_263_, 484092973), -402307347));
					i_257_++;
				}
			}
		}
		this.xteas = Class262.anIntArrayArray3239;
		Class262.anIntArrayArray3239 = null;
		method4458(-2082656295 * this.anInt3172 >> 4, this.anInt3194 * 315871463 >> 4, 18, false, 1473478915);
	}

	public void method4499(Class335 class335, int i) {
		this.aClass256_3163 = class335.aClass256_3915;
		if (Class256.aClass256_3154 == this.aClass256_3163) {
			method4422((byte) -92);
		} else if (this.aClass256_3163 == Class256.aClass256_3158) {
			method4452(class335.buffer);
		} else if (this.aClass256_3163 == Class256.aClass256_3153) {
			method4498(1176717163);
		} else if (this.aClass256_3163.method4410((byte) -13)) {
			method4439(class335.buffer, -220620310);
		}
	}

	public int[][] method4500() {
		return this.anIntArrayArray3185;
	}

	public Class336 method4501(int i) {
		return this.aClass336Array3182[i];
	}

	public Class239 method4502() {
		return this.aClass239_3175;
	}

	public Class474 method4503() {
		return this.aClass474_3201;
	}

	public Class311 method4504() {
		return this.aClass311_3202;
	}

	void method4505(int i) {
		int i_266_ = (this.aClass219_3168.anInt2711 * 1948093437 - 1948093437 * this.aClass219_3169.anInt2711);
		int i_267_ = (this.aClass219_3168.anInt2712 * -1002240017 - this.aClass219_3169.anInt2712 * -1002240017);
		if (18 == i) {
			for (int i_268_ = 0; i_268_ < 1658163325 * client.anInt7210; i_268_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_268_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					for (int i_269_ = 0; i_269_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_269_++) {
						class521_sub1_sub1_sub2_sub2.regionBaseX[i_269_] -= i_266_;
						class521_sub1_sub1_sub2_sub2.regionBaseY[i_269_] -= i_267_;
					}
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_266_ * 512;
					class385.aFloat4673 -= 512 * i_267_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					class385.method6624();
				}
			}
		} else {
			boolean bool = false;
			client.anInt7211 = 0;
			int i_270_ = -1168133632 * this.anInt3172 - 512;
			int i_271_ = this.anInt3194 * -1482568192 - 512;
			for (int i_272_ = 0; i_272_ < client.anInt7210 * 1658163325; i_272_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_272_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_266_ * 512;
					class385.aFloat4673 -= 512 * i_267_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					if ((int) class385.aFloat4671 < 0 || (int) class385.aFloat4671 > i_270_ || (int) class385.aFloat4673 < 0 || (int) class385.aFloat4673 > i_271_) {
						class521_sub1_sub1_sub2_sub2.method16166(null, 1302927201);
						class282_sub47.method4991(-371378792);
						bool = true;
					} else {
						boolean bool_273_ = true;
						for (int i_274_ = 0; i_274_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_274_++) {
							class521_sub1_sub1_sub2_sub2.regionBaseX[i_274_] -= i_266_;
							class521_sub1_sub1_sub2_sub2.regionBaseY[i_274_] -= i_267_;
							if ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_274_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_274_]) >= (this.anInt3172 * -2082656295)) || (class521_sub1_sub1_sub2_sub2.regionBaseY[i_274_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseY[i_274_]) >= (this.anInt3194 * 315871463))) {
								bool_273_ = false;
							}
						}
						if (bool_273_) {
							client.anIntArray7212[((client.anInt7211 += 1568892417) * -685729279 - 1)] = (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299);
						} else {
							class521_sub1_sub1_sub2_sub2.method16166(null, 115567828);
							class282_sub47.method4991(-371378792);
							bool = true;
						}
					}
					class385.method6624();
				}
			}
			if (bool) {
				client.anInt7210 = (client.aClass465_7208.method7748((short) 14859) * -1228117803);
				int i_275_ = 0;
				Iterator iterator = client.aClass465_7208.iterator();
				while (iterator.hasNext()) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
					client.aClass282_Sub47Array7209[i_275_++] = class282_sub47;
				}
			}
		}
		for (int i_276_ = 0; i_276_ < 2048; i_276_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_276_];
			if (null != class521_sub1_sub1_sub2_sub1) {
				for (int i_277_ = 0; (i_277_ < class521_sub1_sub1_sub2_sub1.regionBaseX.length); i_277_++) {
					class521_sub1_sub1_sub2_sub1.regionBaseX[i_277_] -= i_266_;
					class521_sub1_sub1_sub2_sub1.regionBaseY[i_277_] -= i_267_;
				}
				Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				class385.aFloat4671 -= i_266_ * 512;
				class385.aFloat4673 -= i_267_ * 512;
				class521_sub1_sub1_sub2_sub1.method11171(class385);
				class385.method6624();
			}
		}
		Class180[] class180s = client.aClass180Array7348;
		for (int i_278_ = 0; i_278_ < class180s.length; i_278_++) {
			Class180 class180 = class180s[i_278_];
			if (null != class180) {
				class180.anInt2243 -= i_266_ * 1588917760;
				class180.anInt2235 -= -333017600 * i_267_;
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.method8097((byte) 74)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.method8067(-1140230737)) {
			class282_sub31.anInt7762 -= 1690395815 * i_266_;
			class282_sub31.anInt7763 -= 765748375 * i_267_;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= this.anInt3172 * -2082656295) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.method8097((byte) 12)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7776.method8067(1483730308)) {
			class282_sub31.anInt7762 -= i_266_ * 1690395815;
			class282_sub31.anInt7763 -= i_267_ * 765748375;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= -2082656295 * this.anInt3172) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-1095167535)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 91))) {
			int i_279_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L >> 28 & 0x3L);
			int i_280_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L & 0x3fffL);
			int i_281_ = (i_280_ - this.aClass219_3168.anInt2711 * 1948093437);
			int i_282_ = (int) (-3442165056282524525L * class282_sub29.aLong3379 >> 14 & 0x3fffL);
			int i_283_ = (i_282_ - this.aClass219_3168.anInt2712 * -1002240017);
			if (null != this.aClass206_3203) {
				if (i_281_ < 0 || i_283_ < 0 || i_281_ >= -2082656295 * this.anInt3172 || i_283_ >= this.anInt3194 * 315871463 || i_281_ >= (this.aClass206_3203.anInt2617 * -1912960305) || i_283_ >= -18177099 * (this.aClass206_3203.anInt2603)) {
					if (this.aClass256_3163 != Class256.aClass256_3161) {
						class282_sub29.method4991(-371378792);
					}
				} else if ((this.aClass206_3203.aClass293ArrayArrayArray2604) != null) {
					this.aClass206_3203.method3405(i_279_, i_281_, i_283_, -1029539458);
				}
			}
		}
		if (Class187.anInt2361 * 895508675 != 0) {
			Class187.anInt2361 -= -134656021 * i_266_;
			Class187.anInt2359 -= -818291313 * i_267_;
		}
		Class16.method566(2125889183);
		Class336.method6008(false, (byte) 8);
		if (i == 18) {
			client.anInt7262 -= -631700992 * i_266_;
			client.anInt7376 -= i_267_ * 1139486208;
			Class11.anInt122 -= -1024929280 * i_266_;
			Class266.anInt3289 -= 1261918720 * i_267_;
			if (-672443707 * Class262.anInt3240 != 4) {
				Class262.anInt3240 = 770488346;
				Class86.anInt833 = -1509271845;
				Class508.anInt5864 = 987778595;
			}
		} else {
			Class296.anInt3534 -= 39297289 * i_266_;
			Class282_Sub44.anInt8064 -= i_267_ * -1587752955;
			Class96_Sub13.anInt9368 -= -2005398665 * i_266_;
			Class369.anInt4280 -= i_267_ * -772343735;
			Class31.anInt361 -= 1797075456 * i_266_;
			Class246.anInt3029 -= i_267_ * 52797952;
			if (Math.abs(i_266_) > -2082656295 * this.anInt3172 || Math.abs(i_267_) > this.anInt3194 * 315871463) {
				this.aClass239_3175.method4048(1930434420);
			}
		}
		Class350.method6189((byte) 127);
		Class58.method1139(-2060490725);
		client.aClass465_7334.method7749(852565161);
		client.aClass482_7333.method8118(-404077342);
		client.aClass457_7335.method7651((byte) 5);
		Class30.method795((byte) 61);
	}

	public Class336 method4506(int i) {
		return this.aClass336Array3182[i];
	}

	public byte[][] method4507(int i, byte i_284_) {
		if (this.aClass329_Sub1_3167 != null && (this.aClass329_Sub1_3167.aByteArrayArrayArray3788 != null) && null != (this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i])) {
			return (this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i]);
		}
		return null;
	}

	public int[][] method4508() {
		return this.anIntArrayArray3185;
	}

	public byte[][][] method4509() {
		return this.aByteArrayArrayArray3162;
	}

	public byte[][][] method4510() {
		return this.aByteArrayArrayArray3162;
	}

	public void method4511(byte[][][] is) {
		this.aByteArrayArrayArray3162 = is;
	}

	public void method4512(byte[][][] is) {
		this.aByteArrayArrayArray3162 = is;
	}

	public void method4513(Class474 class474) {
		this.aClass474_3201 = class474;
	}

	public void method4514() {
		this.aClass219_3168 = new Class219();
		this.anInt3207 = 0;
		this.anInt3170 = 0;
	}

	public void method4515() {
		if (this.aClass206_3203 != null) {
			Class519.method11156(471770673);
			this.aClass206_3203.aClass284_2648.method5012(-1037153971);
			this.aClass206_3203 = null;
		}
	}

	public void method4516() {
		this.aClass339_3188 = Class339.aClass339_3984;
		this.anInt3189 = 0;
		this.anInt3190 = -114061103;
		this.anInt3191 = 0;
		this.anInt3192 = 380702315;
	}

	public void method4517() {
		this.aClass339_3188 = Class339.aClass339_3984;
		this.anInt3189 = 0;
		this.anInt3190 = -114061103;
		this.anInt3191 = 0;
		this.anInt3192 = 380702315;
	}

	public void method4518() {
		this.aClass239_3175 = new Class239(Class316.aClass505_3680, this.anInt3172 * -2082656295 >> 3, this.anInt3194 * 315871463 >> 3);
	}

	public Class219 method4519(int i) {
		return this.aClass219_3168;
	}

	public Class311 method4520() {
		return this.aClass311_3202;
	}

	void method4521(Class257 class257_285_) {
		boolean bool = class257_285_.aBool3171;
		class257_285_.aBool3171 = this.aBool3171;
		this.aBool3171 = bool;
		Class256 class256 = class257_285_.aClass256_3164;
		class257_285_.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256;
		class257_285_.aClass219_3169 = this.aClass219_3168;
		this.aClass219_3169 = class257_285_.aClass219_3168;
		this.aClass239_3175.method4039(class257_285_.method4435((byte) 1), (byte) 77);
	}

	public int method4522(int i) {
		return -552598147 * this.anInt3179;
	}

	void method4523(Class257 class257_286_) {
		boolean bool = class257_286_.aBool3171;
		class257_286_.aBool3171 = this.aBool3171;
		this.aBool3171 = bool;
		Class256 class256 = class257_286_.aClass256_3164;
		class257_286_.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256;
		class257_286_.aClass219_3169 = this.aClass219_3168;
		this.aClass219_3169 = class257_286_.aClass219_3168;
		this.aClass239_3175.method4039(class257_286_.method4435((byte) 1), (byte) -6);
	}

	public float method4524() {
		return this.aFloat3173;
	}

	public void method4525() {
		if (this.aBool3171) {
			method4445((byte) -42);
			Class122.method2111(true, 662490589);
			Class257 class257_287_ = client.aClass257_7353;
			this.anIntArray3195 = class257_287_.anIntArray3195;
			this.mapDataArchiveIds = class257_287_.mapDataArchiveIds;
			this.landscapeDataArchiveIds = class257_287_.landscapeDataArchiveIds;
			this.anIntArray3196 = class257_287_.anIntArray3196;
			this.anIntArray3197 = class257_287_.anIntArray3197;
			this.anIntArray3198 = class257_287_.anIntArray3198;
			this.xteas = class257_287_.xteas;
			this.aByteArrayArray3200 = class257_287_.aByteArrayArray3200;
			this.landscapeDataBuffer = class257_287_.landscapeDataBuffer;
			this.aByteArrayArray3184 = class257_287_.aByteArrayArray3184;
			this.aByteArrayArray3178 = class257_287_.aByteArrayArray3178;
			this.aByteArrayArray3193 = class257_287_.aByteArrayArray3193;
			this.aClass336Array3182 = class257_287_.aClass336Array3182;
			this.aClass311_3202 = class257_287_.aClass311_3202;
			this.aClass239_3175 = class257_287_.aClass239_3175;
			this.anIntArrayArrayArray3205 = class257_287_.anIntArrayArrayArray3205;
			this.anInt3177 = 1 * class257_287_.anInt3177;
			this.anInt3179 = class257_287_.anInt3179 * 1;
			this.aClass282_Sub50_Sub6_3176 = class257_287_.aClass282_Sub50_Sub6_3176;
			this.aClass283_3180 = class257_287_.aClass283_3180;
			this.anIntArrayArray3185 = class257_287_.anIntArrayArray3185;
			this.anIntArrayArray3186 = class257_287_.anIntArrayArray3186;
			this.aByteArrayArrayArray3162 = class257_287_.aByteArrayArrayArray3162;
			this.aClass256_3163 = class257_287_.aClass256_3163;
			this.aClass106_3165 = class257_287_.aClass106_3165;
			this.aClass219_3168 = class257_287_.aClass219_3168;
			this.aClass219_3169 = class257_287_.aClass219_3169;
			this.anInt3170 = class257_287_.anInt3170 * 1;
			this.anInt3207 = 1 * class257_287_.anInt3207;
			this.anInt3172 = 1 * class257_287_.anInt3172;
			this.anInt3194 = 1 * class257_287_.anInt3194;
		} else if (5 == -1741204137 * client.anInt7166) {
			Class365.method6298(11, 1219583741);
		} else if (-1741204137 * client.anInt7166 == 0) {
			Class365.method6298(2, 1305208411);
		} else if (-1741204137 * client.anInt7166 == 7) {
			Class365.method6298(6, 2066145053);
		} else if (13 == -1741204137 * client.anInt7166) {
			Class365.method6298(18, 1595615666);
		} else if (-1741204137 * client.anInt7166 == 3) {
			Class365.method6298(9, 1205569045);
		}
	}

	public void method4526(Class335 class335) {
		this.aClass256_3163 = class335.aClass256_3915;
		if (Class256.aClass256_3154 == this.aClass256_3163) {
			method4422((byte) -7);
		} else if (this.aClass256_3163 == Class256.aClass256_3158) {
			method4452(class335.buffer);
		} else if (this.aClass256_3163 == Class256.aClass256_3153) {
			method4498(1554322173);
		} else if (this.aClass256_3163.method4410((byte) 7)) {
			method4439(class335.buffer, -901686218);
		}
	}

	void method4527() {
		method4456(Class480.method8046(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-1678709169), (byte) 26), -604728587);
		int i = this.aClass219_3168.anInt2711 * 1948093437;
		int i_288_ = this.aClass219_3168.anInt2712 * -1002240017;
		int i_289_ = (-360258135 * Class31.anInt361 >> 12) + (i >> 3);
		int i_290_ = (i_288_ >> 3) + (Class246.anInt3029 * 413271601 >> 12);
		Class84.myPlayer.aByte7967 = (byte) 0;
		Class4.anInt35 = 0;
		Class84.myPlayer.method16130(8, 8, -1919804649);
		int i_291_ = 18;
		this.xteas = new int[i_291_][4];
		this.anIntArray3195 = new int[i_291_];
		this.mapDataArchiveIds = new int[i_291_];
		this.landscapeDataArchiveIds = new int[i_291_];
		this.anIntArray3196 = new int[i_291_];
		this.aByteArrayArray3200 = new byte[i_291_][];
		this.landscapeDataBuffer = new byte[i_291_][];
		this.aByteArrayArray3184 = new byte[i_291_][];
		this.anIntArray3197 = new int[i_291_];
		this.anIntArray3198 = new int[i_291_];
		this.aByteArrayArray3178 = new byte[i_291_][];
		this.aByteArrayArray3193 = new byte[i_291_][];
		i_291_ = 0;
		for (int i_292_ = (i_289_ - (-2082656295 * this.anInt3172 >> 4)) / 8; i_292_ <= (i_289_ + (-2082656295 * this.anInt3172 >> 4)) / 8; i_292_++) {
			for (int i_293_ = (i_290_ - (this.anInt3194 * 315871463 >> 4)) / 8; i_293_ <= ((315871463 * this.anInt3194 >> 4) + i_290_) / 8; i_293_++) {
				int i_294_ = (i_292_ << 8) + i_293_;
				this.anIntArray3195[i_291_] = i_294_;
				this.mapDataArchiveIds[i_291_] = (Class149.aClass317_1745.method5610(method4455(true, false, i_292_, i_293_, 1879954651), 506845178));
				this.landscapeDataArchiveIds[i_291_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_292_, i_293_, -603030571), -471414768));
				this.anIntArray3196[i_291_] = Class149.aClass317_1745.method5610(new StringBuilder().append("n").append(i_292_).append('_').append(i_293_).toString(), 1399488592);
				this.anIntArray3197[i_291_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_292_, i_293_, 2046951919), 1715259989));
				this.anIntArray3198[i_291_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_292_, i_293_, 1454080850), 715710845));
				if (this.anIntArray3196[i_291_] == -1) {
					this.mapDataArchiveIds[i_291_] = -1;
					this.landscapeDataArchiveIds[i_291_] = -1;
					this.anIntArray3197[i_291_] = -1;
					this.anIntArray3198[i_291_] = -1;
				}
				i_291_++;
			}
		}
		for (int i_295_ = i_291_; i_295_ < this.anIntArray3196.length; i_295_++) {
			this.anIntArray3196[i_295_] = -1;
			this.mapDataArchiveIds[i_295_] = -1;
			this.landscapeDataArchiveIds[i_295_] = -1;
			this.anIntArray3197[i_295_] = -1;
			this.anIntArray3198[i_295_] = -1;
		}
		int i_296_;
		if (client.anInt7166 * -1741204137 == 5) {
			i_296_ = 11;
		} else if (7 == -1741204137 * client.anInt7166) {
			i_296_ = 6;
		} else if (0 == -1741204137 * client.anInt7166) {
			i_296_ = 2;
		} else if (-1741204137 * client.anInt7166 == 3) {
			i_296_ = 9;
		} else {
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt7166 * -1741204137).toString());
		}
		method4458(i_289_, i_290_, i_296_, false, 1473478915);
	}

	public Class257(boolean bool) {
		this.aBool3171 = bool;
	}

	public Class283 method4528(byte i) {
		return this.aClass283_3180;
	}

	void method4529(Class106 class106) {
		if (this.aClass106_3165 != class106) {
			this.anInt3172 = (this.anInt3194 = -740200865 * class106.anInt1076) * -1553903937;
			this.anIntArrayArrayArray3205 = (new int[4][-2082656295 * this.anInt3172 >> 3][this.anInt3194 * 315871463 >> 3]);
			this.anIntArrayArray3185 = (new int[-2082656295 * this.anInt3172][315871463 * this.anInt3194]);
			this.anIntArrayArray3186 = (new int[-2082656295 * this.anInt3172][this.anInt3194 * 315871463]);
			for (int i = 0; i < 4; i++) {
				this.aClass336Array3182[i] = Class403.method6801((this.anInt3172 * -2082656295), (this.anInt3194 * 315871463), (byte) 74);
			}
			this.aByteArrayArrayArray3162 = (new byte[4][this.anInt3172 * -2082656295][this.anInt3194 * 315871463]);
			this.aClass311_3202 = new Class311(4, -2082656295 * this.anInt3172, this.anInt3194 * 315871463);
			method4446((byte) 24);
			this.aClass106_3165 = class106;
		}
	}

	void method4530(RsBitsBuffer class282_sub35_sub2) {
		int i = class282_sub35_sub2.readUnsignedByte();
		int i_297_ = class282_sub35_sub2.readShortLE((byte) -77);
		int i_298_ = class282_sub35_sub2.readUnsignedShort();
		boolean bool = class282_sub35_sub2.readUnsignedByte() == 1;
		if (!this.aBool3171) {
			method4457(-372533265);
		}
		method4456(Class480.method8046(i, (byte) 40), -1521042221);
		int i_299_ = ((class282_sub35_sub2.buffer.length - class282_sub35_sub2.index * -1990677291) / 16);
		this.xteas = new int[i_299_][4];
		for (int i_300_ = 0; i_300_ < i_299_; i_300_++) {
			for (int i_301_ = 0; i_301_ < 4; i_301_++) {
				this.xteas[i_300_][i_301_] = class282_sub35_sub2.readInt();
			}
		}
		this.anIntArray3195 = new int[i_299_];
		this.mapDataArchiveIds = new int[i_299_];
		this.landscapeDataArchiveIds = new int[i_299_];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i_299_][];
		this.landscapeDataBuffer = new byte[i_299_][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i_299_];
		this.anIntArray3198 = new int[i_299_];
		this.aByteArrayArray3178 = new byte[i_299_][];
		this.aByteArrayArray3193 = new byte[i_299_][];
		i_299_ = 0;
		for (int i_302_ = (i_298_ - (-2082656295 * this.anInt3172 >> 4)) / 8; i_302_ <= ((-2082656295 * this.anInt3172 >> 4) + i_298_) / 8; i_302_++) {
			for (int i_303_ = (i_297_ - (this.anInt3194 * 315871463 >> 4)) / 8; i_303_ <= (i_297_ + (this.anInt3194 * 315871463 >> 4)) / 8; i_303_++) {
				this.anIntArray3195[i_299_] = i_303_ + (i_302_ << 8);
				this.mapDataArchiveIds[i_299_] = Class149.aClass317_1745.method5610(method4455(true, false, i_302_, i_303_, 923979377), 496029970);
				this.landscapeDataArchiveIds[i_299_] = (Class149.aClass317_1745.method5610(method4455(false, false, i_302_, i_303_, 1275800031), 1675709955));
				this.anIntArray3197[i_299_] = (Class149.aClass317_1745.method5610(method4455(true, true, i_302_, i_303_, -1182679804), 1474998256));
				this.anIntArray3198[i_299_] = (Class149.aClass317_1745.method5610(method4455(false, true, i_302_, i_303_, -951614600), -1897571270));
				i_299_++;
			}
		}
		method4458(i_298_, i_297_, 18, bool, 1473478915);
	}

	void method4531(Class257 class257_304_) {
		boolean bool = class257_304_.aBool3171;
		class257_304_.aBool3171 = this.aBool3171;
		this.aBool3171 = bool;
		Class256 class256 = class257_304_.aClass256_3164;
		class257_304_.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256;
		class257_304_.aClass219_3169 = this.aClass219_3168;
		this.aClass219_3169 = class257_304_.aClass219_3168;
		this.aClass239_3175.method4039(class257_304_.method4435((byte) 1), (byte) 42);
	}

	public byte[][][] method4532(int i) {
		return this.aByteArrayArrayArray3162;
	}

	String method4533(boolean bool, boolean bool_305_, int i, int i_306_) {
		String string = "";
		if (bool) {
			string = new StringBuilder().append(string).append("m").append(i).append('_').append(i_306_).toString();
		} else {
			string = new StringBuilder().append(string).append("l").append(i).append('_').append(i_306_).toString();
		}
		if (bool_305_) {
			string = new StringBuilder().append('u').append(string).toString();
		}
		return string;
	}

	public void method4534() {
		this.aClass239_3175 = new Class239(Class316.aClass505_3680, this.anInt3172 * -2082656295 >> 3, this.anInt3194 * 315871463 >> 3);
	}

	void method4535() {
		this.aClass256_3164 = this.aClass256_3163;
		method4456(Class106.aClass106_1075, -690590962);
		for (int i = 0; i < 4; i++) {
			for (int i_307_ = 0; i_307_ < -2082656295 * this.anInt3172 >> 3; i_307_++) {
				for (int i_308_ = 0; i_308_ < 315871463 * this.anInt3194 >> 3; i_308_++) {
					this.anIntArrayArrayArray3205[i][i_307_][i_308_] = -1;
				}
			}
		}
		for (Class282_Sub2 class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.method8097((byte) 114)); class282_sub2 != null; class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.method8067(461460207))) {
			int i = -2049294537 * class282_sub2.anInt7486;
			boolean bool = 1 == (i & 0x1);
			int i_309_ = class282_sub2.anInt7479 * 1966632557 >> 3;
			int i_310_ = -1331660813 * class282_sub2.anInt7482 >> 3;
			int i_311_ = class282_sub2.anInt7480 * -141709603;
			int i_312_ = class282_sub2.anInt7483 * -1848312469;
			int i_313_ = class282_sub2.anInt7478 * 1325453341;
			int i_314_ = class282_sub2.anInt7481 * -1852461269;
			int i_315_ = 2090121559 * class282_sub2.anInt7484;
			int i_316_ = class282_sub2.anInt7485 * -1320761179;
			int i_317_ = 0;
			int i_318_ = 0;
			int i_319_ = 1;
			int i_320_ = 1;
			if (1 == i) {
				i_318_ = i_315_ - 1;
				i_319_ = -1;
			} else if (i == 2) {
				i_318_ = i_315_ - 1;
				i_317_ = i_316_ - 1;
				i_319_ = -1;
				i_320_ = -1;
			} else if (i == 3) {
				i_317_ = i_316_ - 1;
				i_319_ = 1;
				i_320_ = -1;
			}
			int i_321_ = i_310_;
			while (i_321_ < i_316_ + i_310_) {
				int i_322_ = i_318_;
				int i_323_ = i_309_;
				while (i_323_ < i_315_ + i_309_) {
					if (bool) {
						this.anIntArrayArrayArray3205[i_314_][i_311_ + i_317_][i_322_ + i_312_] = ((i_323_ << 14) + (i_313_ << 24) + (i_321_ << 3) + (i << 1));
					} else {
						this.anIntArrayArrayArray3205[i_314_][i_322_ + i_311_][i_312_ + i_317_] = (i << 1) + ((i_321_ << 3) + ((i_323_ << 14) + (i_313_ << 24)));
					}
					i_323_++;
					i_322_ += i_319_;
				}
				i_321_++;
				i_317_ += i_320_;
			}
		}
		int i = Class262.anIntArrayArray3239.length;
		this.anIntArray3195 = new int[i];
		this.mapDataArchiveIds = new int[i];
		this.landscapeDataArchiveIds = new int[i];
		this.anIntArray3196 = null;
		this.aByteArrayArray3200 = new byte[i][];
		this.landscapeDataBuffer = new byte[i][];
		this.aByteArrayArray3184 = null;
		this.anIntArray3197 = new int[i];
		this.anIntArray3198 = new int[i];
		this.aByteArrayArray3178 = new byte[i][];
		this.aByteArrayArray3193 = new byte[i][];
		i = 0;
		for (Class282_Sub2 class282_sub2 = (Class282_Sub2) Class86.aClass482_827.method8097((byte) 27); class282_sub2 != null; class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.method8067(-875473622))) {
			int i_324_ = 1966632557 * class282_sub2.anInt7479 >>> 3;
			int i_325_ = -1331660813 * class282_sub2.anInt7482 >>> 3;
			int i_326_ = 2090121559 * class282_sub2.anInt7484 + i_324_;
			if (0 == (i_326_ & 0x7)) {
				i_326_--;
			}
			i_326_ >>>= 3;
			int i_327_ = i_325_ + class282_sub2.anInt7485 * -1320761179;
			if ((i_327_ & 0x7) == 0) {
				i_327_--;
			}
			i_327_ >>>= 3;
			for (int i_328_ = i_324_ >>> 3; i_328_ <= i_326_; i_328_++) {
				while_80_: for (int i_329_ = i_325_ >>> 3; i_329_ <= i_327_; i_329_++) {
					int i_330_ = i_328_ << 8 | i_329_;
					for (int i_331_ = 0; i_331_ < i; i_331_++) {
						if (this.anIntArray3195[i_331_] == i_330_) {
							continue while_80_;
						}
					}
					this.anIntArray3195[i] = i_330_;
					this.mapDataArchiveIds[i] = (Class149.aClass317_1745.method5610(method4455(true, false, i_328_, i_329_, 1301463179), -1033877798));
					this.landscapeDataArchiveIds[i] = (Class149.aClass317_1745.method5610(method4455(false, false, i_328_, i_329_, -661605384), 1647182937));
					this.anIntArray3197[i] = (Class149.aClass317_1745.method5610(method4455(true, true, i_328_, i_329_, 1366905558), 1623217304));
					this.anIntArray3198[i] = (Class149.aClass317_1745.method5610(method4455(false, true, i_328_, i_329_, -1569728220), -1100172144));
					i++;
				}
			}
		}
		this.xteas = Class262.anIntArrayArray3239;
		Class262.anIntArrayArray3239 = null;
		method4458(-2082656295 * this.anInt3172 >> 4, this.anInt3194 * 315871463 >> 4, 18, false, 1473478915);
	}

	void method4536() {
		if (this.aClass256_3163 != Class256.aClass256_3153 && this.aClass256_3164 != Class256.aClass256_3153) {
			if (Class256.aClass256_3155 == this.aClass256_3163 || Class256.aClass256_3157 == this.aClass256_3163 || ((this.aClass256_3164 != this.aClass256_3163) && ((Class256.aClass256_3158 == this.aClass256_3163) || (this.aClass256_3164 == Class256.aClass256_3158)))) {
				client.anInt7211 = 0;
				client.anInt7210 = 0;
				client.aClass465_7208.method7749(-1615056939);
			}
			this.aClass256_3164 = this.aClass256_3163;
		}
	}

	void method4537(int i, int i_332_, int i_333_, boolean bool) {
		if (2 == client.anInt7341 * -891719545) {
			if (this.aBool3171) {
				throw new IllegalStateException();
			}
			client.anInt7341 = -1766566601;
			client.anInt7231 = 593633913;
		}
		if (bool || i != -1892499075 * this.anInt3170 || this.anInt3207 * -975658881 != i_332_) {
			this.anInt3170 = -93814827 * i;
			this.anInt3207 = 1969692543 * i_332_;
			if (!this.aBool3171) {
				Class365.method6298(i_333_, 2086287673);
				Class446.method7447(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -1305729127), true, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -63);
			}
			if (this.aClass219_3168 != null) {
				this.aClass219_3169 = this.aClass219_3168;
			} else {
				this.aClass219_3169 = new Class219(0, 0, 0);
			}
			this.aClass219_3168 = new Class219(0, (-1892499075 * this.anInt3170 - (-2082656295 * this.anInt3172 >> 4)) * 8, (this.anInt3207 * -975658881 - (315871463 * this.anInt3194 >> 4)) * 8);
			this.aClass282_Sub50_Sub6_3176 = Class291.method5175(1948093437 * (this.aClass219_3168.anInt2711), (this.aClass219_3168.anInt2712) * -1002240017);
			this.aClass283_3180 = null;
			if (!this.aBool3171) {
				method4459(i_333_, (byte) 6);
			}
		}
	}

	public int method4538(byte i) {
		return 100 - (this.anInt3191 * -1643613796 / (this.anInt3192 * -1112134077));
	}

	public float method4539() {
		return this.aFloat3173;
	}

	void method4540(int i) {
		int i_334_ = (this.aClass219_3168.anInt2711 * 1948093437 - 1948093437 * this.aClass219_3169.anInt2711);
		int i_335_ = (this.aClass219_3168.anInt2712 * -1002240017 - this.aClass219_3169.anInt2712 * -1002240017);
		if (18 == i) {
			for (int i_336_ = 0; i_336_ < 1658163325 * client.anInt7210; i_336_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_336_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					for (int i_337_ = 0; i_337_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_337_++) {
						class521_sub1_sub1_sub2_sub2.regionBaseX[i_337_] -= i_334_;
						class521_sub1_sub1_sub2_sub2.regionBaseY[i_337_] -= i_335_;
					}
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_334_ * 512;
					class385.aFloat4673 -= 512 * i_335_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					class385.method6624();
				}
			}
		} else {
			boolean bool = false;
			client.anInt7211 = 0;
			int i_338_ = -1168133632 * this.anInt3172 - 512;
			int i_339_ = this.anInt3194 * -1482568192 - 512;
			for (int i_340_ = 0; i_340_ < client.anInt7210 * 1658163325; i_340_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_340_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_334_ * 512;
					class385.aFloat4673 -= 512 * i_335_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					if ((int) class385.aFloat4671 < 0 || (int) class385.aFloat4671 > i_338_ || (int) class385.aFloat4673 < 0 || (int) class385.aFloat4673 > i_339_) {
						class521_sub1_sub1_sub2_sub2.method16166(null, -635060064);
						class282_sub47.method4991(-371378792);
						bool = true;
					} else {
						boolean bool_341_ = true;
						for (int i_342_ = 0; i_342_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_342_++) {
							class521_sub1_sub1_sub2_sub2.regionBaseX[i_342_] -= i_334_;
							class521_sub1_sub1_sub2_sub2.regionBaseY[i_342_] -= i_335_;
							if ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_342_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_342_]) >= (this.anInt3172 * -2082656295)) || (class521_sub1_sub1_sub2_sub2.regionBaseY[i_342_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseY[i_342_]) >= (this.anInt3194 * 315871463))) {
								bool_341_ = false;
							}
						}
						if (bool_341_) {
							client.anIntArray7212[((client.anInt7211 += 1568892417) * -685729279 - 1)] = (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299);
						} else {
							class521_sub1_sub1_sub2_sub2.method16166(null, 1975260206);
							class282_sub47.method4991(-371378792);
							bool = true;
						}
					}
					class385.method6624();
				}
			}
			if (bool) {
				client.anInt7210 = (client.aClass465_7208.method7748((short) 21556) * -1228117803);
				int i_343_ = 0;
				Iterator iterator = client.aClass465_7208.iterator();
				while (iterator.hasNext()) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
					client.aClass282_Sub47Array7209[i_343_++] = class282_sub47;
				}
			}
		}
		for (int i_344_ = 0; i_344_ < 2048; i_344_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_344_];
			if (null != class521_sub1_sub1_sub2_sub1) {
				for (int i_345_ = 0; (i_345_ < class521_sub1_sub1_sub2_sub1.regionBaseX.length); i_345_++) {
					class521_sub1_sub1_sub2_sub1.regionBaseX[i_345_] -= i_334_;
					class521_sub1_sub1_sub2_sub1.regionBaseY[i_345_] -= i_335_;
				}
				Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				class385.aFloat4671 -= i_334_ * 512;
				class385.aFloat4673 -= i_335_ * 512;
				class521_sub1_sub1_sub2_sub1.method11171(class385);
				class385.method6624();
			}
		}
		Class180[] class180s = client.aClass180Array7348;
		for (int i_346_ = 0; i_346_ < class180s.length; i_346_++) {
			Class180 class180 = class180s[i_346_];
			if (null != class180) {
				class180.anInt2243 -= i_334_ * 1588917760;
				class180.anInt2235 -= -333017600 * i_335_;
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.method8097((byte) 105)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.method8067(403048068)) {
			class282_sub31.anInt7762 -= 1690395815 * i_334_;
			class282_sub31.anInt7763 -= 765748375 * i_335_;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= this.anInt3172 * -2082656295) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.method8097((byte) 119)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7776.method8067(-684034883)) {
			class282_sub31.anInt7762 -= i_334_ * 1690395815;
			class282_sub31.anInt7763 -= i_335_ * 765748375;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= -2082656295 * this.anInt3172) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(126082594)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 91))) {
			int i_347_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L >> 28 & 0x3L);
			int i_348_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L & 0x3fffL);
			int i_349_ = (i_348_ - this.aClass219_3168.anInt2711 * 1948093437);
			int i_350_ = (int) (-3442165056282524525L * class282_sub29.aLong3379 >> 14 & 0x3fffL);
			int i_351_ = (i_350_ - this.aClass219_3168.anInt2712 * -1002240017);
			if (null != this.aClass206_3203) {
				if (i_349_ < 0 || i_351_ < 0 || i_349_ >= -2082656295 * this.anInt3172 || i_351_ >= this.anInt3194 * 315871463 || i_349_ >= (this.aClass206_3203.anInt2617 * -1912960305) || i_351_ >= -18177099 * (this.aClass206_3203.anInt2603)) {
					if (this.aClass256_3163 != Class256.aClass256_3161) {
						class282_sub29.method4991(-371378792);
					}
				} else if ((this.aClass206_3203.aClass293ArrayArrayArray2604) != null) {
					this.aClass206_3203.method3405(i_347_, i_349_, i_351_, -1872784132);
				}
			}
		}
		if (Class187.anInt2361 * 895508675 != 0) {
			Class187.anInt2361 -= -134656021 * i_334_;
			Class187.anInt2359 -= -818291313 * i_335_;
		}
		Class16.method566(2075566826);
		Class336.method6008(false, (byte) 8);
		if (i == 18) {
			client.anInt7262 -= -631700992 * i_334_;
			client.anInt7376 -= i_335_ * 1139486208;
			Class11.anInt122 -= -1024929280 * i_334_;
			Class266.anInt3289 -= 1261918720 * i_335_;
			if (-672443707 * Class262.anInt3240 != 4) {
				Class262.anInt3240 = 770488346;
				Class86.anInt833 = -1509271845;
				Class508.anInt5864 = 987778595;
			}
		} else {
			Class296.anInt3534 -= 39297289 * i_334_;
			Class282_Sub44.anInt8064 -= i_335_ * -1587752955;
			Class96_Sub13.anInt9368 -= -2005398665 * i_334_;
			Class369.anInt4280 -= i_335_ * -772343735;
			Class31.anInt361 -= 1797075456 * i_334_;
			Class246.anInt3029 -= i_335_ * 52797952;
			if (Math.abs(i_334_) > -2082656295 * this.anInt3172 || Math.abs(i_335_) > this.anInt3194 * 315871463) {
				this.aClass239_3175.method4048(-435423608);
			}
		}
		Class350.method6189((byte) 126);
		Class58.method1139(-2140292852);
		client.aClass465_7334.method7749(1313236510);
		client.aClass482_7333.method8118(623182541);
		client.aClass457_7335.method7651((byte) 5);
		Class30.method795((byte) 4);
	}

	void method4541(int i) {
		int i_352_ = (this.aClass219_3168.anInt2711 * 1948093437 - 1948093437 * this.aClass219_3169.anInt2711);
		int i_353_ = (this.aClass219_3168.anInt2712 * -1002240017 - this.aClass219_3169.anInt2712 * -1002240017);
		if (18 == i) {
			for (int i_354_ = 0; i_354_ < 1658163325 * client.anInt7210; i_354_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_354_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					for (int i_355_ = 0; i_355_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_355_++) {
						class521_sub1_sub1_sub2_sub2.regionBaseX[i_355_] -= i_352_;
						class521_sub1_sub1_sub2_sub2.regionBaseY[i_355_] -= i_353_;
					}
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_352_ * 512;
					class385.aFloat4673 -= 512 * i_353_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					class385.method6624();
				}
			}
		} else {
			boolean bool = false;
			client.anInt7211 = 0;
			int i_356_ = -1168133632 * this.anInt3172 - 512;
			int i_357_ = this.anInt3194 * -1482568192 - 512;
			for (int i_358_ = 0; i_358_ < client.anInt7210 * 1658163325; i_358_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_358_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.aFloat4671 -= i_352_ * 512;
					class385.aFloat4673 -= 512 * i_353_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					if ((int) class385.aFloat4671 < 0 || (int) class385.aFloat4671 > i_356_ || (int) class385.aFloat4673 < 0 || (int) class385.aFloat4673 > i_357_) {
						class521_sub1_sub1_sub2_sub2.method16166(null, -152054199);
						class282_sub47.method4991(-371378792);
						bool = true;
					} else {
						boolean bool_359_ = true;
						for (int i_360_ = 0; i_360_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_360_++) {
							class521_sub1_sub1_sub2_sub2.regionBaseX[i_360_] -= i_352_;
							class521_sub1_sub1_sub2_sub2.regionBaseY[i_360_] -= i_353_;
							if ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_360_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_360_]) >= (this.anInt3172 * -2082656295)) || (class521_sub1_sub1_sub2_sub2.regionBaseY[i_360_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseY[i_360_]) >= (this.anInt3194 * 315871463))) {
								bool_359_ = false;
							}
						}
						if (bool_359_) {
							client.anIntArray7212[((client.anInt7211 += 1568892417) * -685729279 - 1)] = (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299);
						} else {
							class521_sub1_sub1_sub2_sub2.method16166(null, -1061145445);
							class282_sub47.method4991(-371378792);
							bool = true;
						}
					}
					class385.method6624();
				}
			}
			if (bool) {
				client.anInt7210 = (client.aClass465_7208.method7748((short) 5578) * -1228117803);
				int i_361_ = 0;
				Iterator iterator = client.aClass465_7208.iterator();
				while (iterator.hasNext()) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
					client.aClass282_Sub47Array7209[i_361_++] = class282_sub47;
				}
			}
		}
		for (int i_362_ = 0; i_362_ < 2048; i_362_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_362_];
			if (null != class521_sub1_sub1_sub2_sub1) {
				for (int i_363_ = 0; (i_363_ < class521_sub1_sub1_sub2_sub1.regionBaseX.length); i_363_++) {
					class521_sub1_sub1_sub2_sub1.regionBaseX[i_363_] -= i_352_;
					class521_sub1_sub1_sub2_sub1.regionBaseY[i_363_] -= i_353_;
				}
				Class385 class385 = Class385.method6623(class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				class385.aFloat4671 -= i_352_ * 512;
				class385.aFloat4673 -= i_353_ * 512;
				class521_sub1_sub1_sub2_sub1.method11171(class385);
				class385.method6624();
			}
		}
		Class180[] class180s = client.aClass180Array7348;
		for (int i_364_ = 0; i_364_ < class180s.length; i_364_++) {
			Class180 class180 = class180s[i_364_];
			if (null != class180) {
				class180.anInt2243 -= i_352_ * 1588917760;
				class180.anInt2235 -= -333017600 * i_353_;
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.method8097((byte) 75)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.method8067(-223870973)) {
			class282_sub31.anInt7762 -= 1690395815 * i_352_;
			class282_sub31.anInt7763 -= 765748375 * i_353_;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= this.anInt3172 * -2082656295) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.method8097((byte) 98)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7776.method8067(532813471)) {
			class282_sub31.anInt7762 -= i_352_ * 1690395815;
			class282_sub31.anInt7763 -= i_353_ * 765748375;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= -2082656295 * this.anInt3172) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.anInt3194))) {
				class282_sub31.method4991(-371378792);
			}
		}
		for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-283423855)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 45))) {
			int i_365_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L >> 28 & 0x3L);
			int i_366_ = (int) (class282_sub29.aLong3379 * -3442165056282524525L & 0x3fffL);
			int i_367_ = (i_366_ - this.aClass219_3168.anInt2711 * 1948093437);
			int i_368_ = (int) (-3442165056282524525L * class282_sub29.aLong3379 >> 14 & 0x3fffL);
			int i_369_ = (i_368_ - this.aClass219_3168.anInt2712 * -1002240017);
			if (null != this.aClass206_3203) {
				if (i_367_ < 0 || i_369_ < 0 || i_367_ >= -2082656295 * this.anInt3172 || i_369_ >= this.anInt3194 * 315871463 || i_367_ >= (this.aClass206_3203.anInt2617 * -1912960305) || i_369_ >= -18177099 * (this.aClass206_3203.anInt2603)) {
					if (this.aClass256_3163 != Class256.aClass256_3161) {
						class282_sub29.method4991(-371378792);
					}
				} else if ((this.aClass206_3203.aClass293ArrayArrayArray2604) != null) {
					this.aClass206_3203.method3405(i_365_, i_367_, i_369_, -220725471);
				}
			}
		}
		if (Class187.anInt2361 * 895508675 != 0) {
			Class187.anInt2361 -= -134656021 * i_352_;
			Class187.anInt2359 -= -818291313 * i_353_;
		}
		Class16.method566(2106820929);
		Class336.method6008(false, (byte) 8);
		if (i == 18) {
			client.anInt7262 -= -631700992 * i_352_;
			client.anInt7376 -= i_353_ * 1139486208;
			Class11.anInt122 -= -1024929280 * i_352_;
			Class266.anInt3289 -= 1261918720 * i_353_;
			if (-672443707 * Class262.anInt3240 != 4) {
				Class262.anInt3240 = 770488346;
				Class86.anInt833 = -1509271845;
				Class508.anInt5864 = 987778595;
			}
		} else {
			Class296.anInt3534 -= 39297289 * i_352_;
			Class282_Sub44.anInt8064 -= i_353_ * -1587752955;
			Class96_Sub13.anInt9368 -= -2005398665 * i_352_;
			Class369.anInt4280 -= i_353_ * -772343735;
			Class31.anInt361 -= 1797075456 * i_352_;
			Class246.anInt3029 -= i_353_ * 52797952;
			if (Math.abs(i_352_) > -2082656295 * this.anInt3172 || Math.abs(i_353_) > this.anInt3194 * 315871463) {
				this.aClass239_3175.method4048(1262843040);
			}
		}
		Class350.method6189((byte) 125);
		Class58.method1139(-1976072620);
		client.aClass465_7334.method7749(949355805);
		client.aClass482_7333.method8118(-2122573085);
		client.aClass457_7335.method7651((byte) 5);
		Class30.method795((byte) 32);
	}

	void method4542() {
		this.aClass329_Sub1_3166 = null;
		this.aClass329_Sub1_3167 = null;
		for (int i = 0; i < 4; i++) {
			if (null != this.aClass336Array3182[i]) {
				this.aClass336Array3182[i].method5965((byte) 5);
			}
		}
		if (this.aClass311_3202 != null) {
			this.aClass311_3202.method5495(-916710268);
		}
		if (this.aClass239_3175 != null) {
			this.aClass239_3175.method4044(-1299057732);
		}
		if (this.aClass206_3203 != null) {
			this.aClass206_3203.aClass284_2648.method5012(-1037153971);
			this.aClass206_3203 = null;
		}
	}

	void method4543() {
		this.aClass329_Sub1_3166 = null;
		this.aClass329_Sub1_3167 = null;
		for (int i = 0; i < 4; i++) {
			if (null != this.aClass336Array3182[i]) {
				this.aClass336Array3182[i].method5965((byte) 5);
			}
		}
		if (this.aClass311_3202 != null) {
			this.aClass311_3202.method5495(-183753677);
		}
		if (this.aClass239_3175 != null) {
			this.aClass239_3175.method4044(-1299057732);
		}
		if (this.aClass206_3203 != null) {
			this.aClass206_3203.aClass284_2648.method5012(-1037153971);
			this.aClass206_3203 = null;
		}
	}

	public int method4544(int i) {
		return -687713985 * this.anInt3177;
	}

	public boolean method4545() {
		if (!this.aBool3171) {
			Exception_Sub3.method15619(false, 1014378324);
		}
		this.anInt3189 = 0;
		for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
			if (-1 != this.mapDataArchiveIds[i] && null == this.aByteArrayArray3200[i]) {
				this.aByteArrayArray3200[i] = Class149.aClass317_1745.getFile((this.mapDataArchiveIds[i]), 0, -1804869799);
				if (null == this.aByteArrayArray3200[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.landscapeDataArchiveIds[i] && null == this.landscapeDataBuffer[i]) {
				this.landscapeDataBuffer[i] = (Class149.aClass317_1745.method5643(this.landscapeDataArchiveIds[i], 0, this.xteas[i], -348958075));
				if (null == this.landscapeDataBuffer[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3197[i] != -1 && this.aByteArrayArray3178[i] == null) {
				this.aByteArrayArray3178[i] = Class149.aClass317_1745.getFile((this.anIntArray3197[i]), 0, -2083571680);
				if (null == this.aByteArrayArray3178[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.anIntArray3198[i] && this.aByteArrayArray3193[i] == null) {
				this.aByteArrayArray3193[i] = Class149.aClass317_1745.getFile((this.anIntArray3198[i]), 0, -1573971712);
				if (null == this.aByteArrayArray3193[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3196 != null && this.aByteArrayArray3184[i] == null && -1 != this.anIntArray3196[i]) {
				this.aByteArrayArray3184[i] = Class149.aClass317_1745.method5643((this.anIntArray3196[i]), 0, (this.xteas[i]), -1767402985);
				if (this.aByteArrayArray3184[i] == null) {
					this.anInt3189 += -1145558933;
				}
			}
		}
		if (this.aClass283_3180 == null) {
			if (null != this.aClass282_Sub50_Sub6_3176 && (Class192.worldMap.validFile(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 2117814705))) {
				if (!Class192.worldMap.method5629(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 71472045)) {
					this.anInt3189 += -1145558933;
				} else {
					this.aClass283_3180 = Class301.method5331(Class192.worldMap, new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				}
			} else {
				this.aClass283_3180 = new Class283(0);
			}
		}
		if (1685275715 * this.anInt3189 > 0) {
			if (this.anInt3190 * 866043953 < this.anInt3189 * 1685275715) {
				this.anInt3190 = this.anInt3189 * -1663472973;
			}
			this.aClass339_3188 = Class339.aClass339_3985;
			return false;
		}
		this.anInt3191 = 0;
		for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
			byte[] is = this.landscapeDataBuffer[i];
			if (null != is) {
				int i_370_ = (64 * (this.anIntArray3195[i] >> 8) - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_371_ = ((this.anIntArray3195[i] & 0xff) * 64 - (this.aClass219_3168.anInt2712 * -1002240017));
				if (this.aClass256_3163.method4410((byte) 52)) {
					i_370_ = 10;
					i_371_ = 10;
				}
				int i_372_ = Class251.method4316(this.aClass474_3201, is, i_370_, i_371_, (this.anInt3172 * -2082656295), (315871463 * this.anInt3194), (short) 8448);
				if (i_372_ > 0) {
					this.anInt3191 += i_372_ * -591712385;
				}
			}
			is = this.aByteArrayArray3193[i];
			if (is != null) {
				int i_373_ = (64 * (this.anIntArray3195[i] >> 8) - 1948093437 * (this.aClass219_3168.anInt2711));
				int i_374_ = ((this.anIntArray3195[i] & 0xff) * 64 - -1002240017 * (this.aClass219_3168.anInt2712));
				if (this.aClass256_3163.method4410((byte) 96)) {
					i_373_ = 10;
					i_374_ = 10;
				}
				int i_375_ = Class251.method4316(this.aClass474_3201, is, i_373_, i_374_, (this.anInt3172 * -2082656295), (this.anInt3194 * 315871463), (short) 8448);
				if (i_375_ > 0) {
					this.anInt3191 += -591712385 * i_375_;
				}
			}
		}
		if (-1047228289 * this.anInt3191 > 0) {
			if (-1112134077 * this.anInt3192 < this.anInt3191 * -1047228289) {
				this.anInt3192 = -624011499 * this.anInt3191;
			}
			this.aClass339_3188 = Class339.aClass339_3983;
			return false;
		}
		if (!this.aBool3171 && Class339.aClass339_3984 != this.aClass339_3188) {
			Class446.method7447(new StringBuilder().append(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -1224843213)).append(Class2.aString16).append("(100%)").toString(), true, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -119);
		}
		this.aClass339_3188 = Class339.aClass339_3982;
		if (!this.aBool3171) {
			Class282_Sub20_Sub24.method15391(-1609935480);
		}
		if (!this.aBool3171) {
			for (int i = 0; i < 2048; i++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i];
				if (null != class521_sub1_sub1_sub2_sub1) {
					class521_sub1_sub1_sub2_sub1.aClass206_7970 = null;
				}
			}
			for (int i = 0; i < client.aClass282_Sub47Array7209.length; i++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i];
				if (class282_sub47 != null) {
					((Class521_Sub1) class282_sub47.anObject8068).aClass206_7970 = null;
				}
			}
		}
		if (!this.aBool3171) {
			Class356.method6227(true, (byte) -9);
		}
		if (!this.aBool3171) {
			Class247.method4250((byte) -27);
		}
		boolean bool = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1990317055) == 2) {
			for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
				if (this.aByteArrayArray3193[i] != null || this.aByteArrayArray3178[i] != null) {
					bool = true;
					break;
				}
			}
		}
		int i = (Class5.method295(Class393.aClass282_Sub54_4783.aClass468_Sub16_8198.method12750((byte) 32), 44628475).anInt1064 * 793844040);
		if (Class316.aClass505_3680.method8454()) {
			i++;
		}
		method4447(1438850988);
		method4460(1219957593);
		this.aClass206_3203 = new Class206(Class316.aClass505_3680, 9, 4, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, i, bool, Class316.aClass505_3680.method8463() > 0);
		this.aClass206_3203.method3380(false, -914334995);
		this.aClass206_3203.method3378(647281963 * client.anInt7240, -1390436621);
		if (647281963 * client.anInt7240 != 0) {
			this.aClass206_3203.method3379(Class540.aClass8_7138, (byte) -119);
		} else {
			this.aClass206_3203.method3379(null, (byte) -74);
		}
		this.aClass341_3181 = new Class341();
		this.aFloat3173 = -0.05F + (float) (Math.random() / 10.0);
		this.aClass329_Sub1_3167 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 4, this.anInt3172 * -2082656295, 315871463 * this.anInt3194, false, this.aClass311_3202, this.aClass239_3175);
		this.aClass329_Sub1_3167.method5835(1689480906);
		this.aClass329_Sub1_3167.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -99) * 2141862047;
		this.aClass329_Sub1_3167.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-1447952684) == 2;
		this.aClass329_Sub1_3167.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
		this.aClass329_Sub1_3167.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-694280220) == 1;
		this.aClass329_Sub1_3167.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1354965076) == 1;
		if (!this.aClass256_3163.method4410((byte) -11)) {
			method4463(this.aClass329_Sub1_3167, this.aByteArrayArray3200, -1960638059);
		} else {
			method4464(this.aClass329_Sub1_3167, this.aByteArrayArray3200, 2042242387);
		}
		if (this.aBool3171) {
			method4462(50, (byte) -60);
		}
		this.aClass239_3175.method4045(this.anInt3172 * -2082656295 >> 4, this.anInt3194 * 315871463 >> 4, -1230013231);
		this.aClass239_3175.method4037(this, (byte) 126);
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			this.aClass329_Sub1_3166 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 1, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, true, this.aClass311_3202, this.aClass239_3175);
			this.aClass329_Sub1_3166.method5835(1971363502);
			this.aClass329_Sub1_3166.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -82) * 2141862047;
			this.aClass329_Sub1_3166.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1639598087) == 2;
			this.aClass329_Sub1_3166.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
			this.aClass329_Sub1_3166.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-1594742633) == 1;
			this.aClass329_Sub1_3166.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(692976127) == 1;
			if (!this.aClass256_3163.method4410((byte) -37)) {
				method4463(this.aClass329_Sub1_3166, this.aByteArrayArray3178, -1402180395);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -1354779677);
				}
			} else {
				method4464(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 1694642205);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -1995618276);
				}
			}
			this.aClass329_Sub1_3166.method5853(0, (this.aClass329_Sub1_3167.anIntArrayArrayArray3818[0]), -1808704221);
			this.aClass329_Sub1_3166.method5843(Class316.aClass505_3680, null, null, (byte) -47);
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -93);
			}
		}
		this.aClass329_Sub1_3167.method5843(Class316.aClass505_3680, (bool ? this.aClass329_Sub1_3166.anIntArrayArrayArray3818 : null), this.aClass336Array3182, (byte) 6);
		if (!this.aClass256_3163.method4410((byte) 97)) {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1884563283);
			}
			method4465(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -1228514951);
			if (null != this.aByteArrayArray3184) {
				method4467(224581035);
			}
		} else {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1210654819);
			}
			method4432(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -2039683948);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, 1653442964);
		}
		this.aClass329_Sub1_3167.method5837(Class316.aClass505_3680, (bool ? this.aClass206_3203.aClass390Array2614[0] : null), null, -1472337492);
		if (this.aBool3171) {
			method4462(75, (byte) -19);
		}
		this.aClass329_Sub1_3167.method12463(Class316.aClass505_3680, false, -506470427);
		if (this.aBool3171) {
			method4462(75, (byte) -96);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, -1042059911);
		}
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 2025338650);
			}
			if (!this.aClass256_3163.method4410((byte) -43)) {
				method4465(this.aClass329_Sub1_3166, this.aByteArrayArray3193, -1228514951);
			} else {
				method4432(this.aClass329_Sub1_3166, this.aByteArrayArray3193, 234312265);
			}
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1512515189);
			}
			this.aClass329_Sub1_3166.method5837(Class316.aClass505_3680, null, this.aClass206_3203.aClass390Array2607[0], -508174249);
			this.aClass329_Sub1_3166.method12463(Class316.aClass505_3680, true, -1827397928);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1730883144);
			}
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -12);
			}
		}
		this.aClass329_Sub1_3167.method5891((short) -16652);
		if (this.aClass329_Sub1_3166 != null) {
			this.aClass329_Sub1_3166.method5891((short) -16722);
		}
		this.aClass206_3203.method3428(1203434505);
		if (this.aBool3171) {
			Class169.method2869(1996608962);
			while (!Class316.aClass505_3680.method8455(1090915883)) {
				method4462(1, (byte) -72);
			}
		}
		boolean bool_376_ = false;
		if (this.aBool3171) {
			Class257 class257_377_ = client.aClass257_7353;
			method4418(class257_377_, 16711935);
			Class6.aClass340_45.method6050(class257_377_, (byte) -40);
			bool_376_ = true;
			Class169.method2869(1998724115);
			synchronized (client.anObject7227) {
				client.aBool7225 = true;
				try {
					client.anObject7227.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass257_7353 = this;
			class257_377_.method4460(1219957593);
			method4459(18, (byte) 55);
			method4457(-193214510);
		} else {
			Class282_Sub20_Sub24.method15391(-1406740286);
			this.aClass239_3175.method4075(-61306537);
			Class282_Sub15_Sub1.method14840((byte) -17);
		}
		for (int i_378_ = 0; i_378_ < 4; i_378_++) {
			for (int i_379_ = 0; i_379_ < this.anInt3172 * -2082656295; i_379_++) {
				for (int i_380_ = 0; i_380_ < 315871463 * this.anInt3194; i_380_++) {
					Class434_Sub1.method12760(i_378_, i_379_, i_380_, -1380263584);
				}
			}
		}
		for (int i_381_ = 0; i_381_ < client.aClass281Array7180.length; i_381_++) {
			if (client.aClass281Array7180[i_381_] != null) {
				client.aClass281Array7180[i_381_].method4978(this.aClass206_3203, (byte) -1);
			}
		}
		Class405.method6823(-734889653);
		Class48_Sub2.method14571((byte) 0);
		if (Class40.method867(-1748559956) == Class279.aClass279_3368 && client.aClass184_7475.method3053((byte) -9) != null && -1741204137 * client.anInt7166 == 18) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4609, client.aClass184_7475.aClass432_2283, 1528755259);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(1057001181);
			client.aClass184_7475.method3049(class282_sub23, 30023853);
		}
		if (!this.aClass256_3163.method4410((byte) -62)) {
			int i_382_ = ((-1892499075 * this.anInt3170 - (-2082656295 * this.anInt3172 >> 4)) / 8);
			int i_383_ = (((this.anInt3172 * -2082656295 >> 4) + -1892499075 * this.anInt3170) / 8);
			int i_384_ = ((-975658881 * this.anInt3207 - (315871463 * this.anInt3194 >> 4)) / 8);
			int i_385_ = ((this.anInt3207 * -975658881 + (this.anInt3194 * 315871463 >> 4)) / 8);
			for (int i_386_ = i_382_ - 1; i_386_ <= 1 + i_383_; i_386_++) {
				for (int i_387_ = i_384_ - 1; i_387_ <= i_385_ + 1; i_387_++) {
					if (i_386_ < i_382_ || i_386_ > i_383_ || i_387_ < i_384_ || i_387_ > i_385_) {
						Class149.aClass317_1745.method5630(method4455(true, false, i_386_, i_387_, 2072209013), -1810075652);
						Class149.aClass317_1745.method5630(method4455(false, false, i_386_, i_387_, -1688987847), -443749630);
						Class149.aClass317_1745.method5630(method4455(true, true, i_386_, i_387_, 7899163), 565054598);
						Class149.aClass317_1745.method5630(method4455(false, true, i_386_, i_387_, -808378204), 519117411);
					}
				}
			}
		}
		if (-1741204137 * client.anInt7166 == 11) {
			Class365.method6298(5, 1231179451);
		} else if (2 == client.anInt7166 * -1741204137) {
			Class365.method6298(0, 897309863);
		} else if (-1741204137 * client.anInt7166 == 6) {
			Class365.method6298(7, 1310171553);
		} else if (9 == -1741204137 * client.anInt7166) {
			Class365.method6298(3, 1442359379);
		} else {
			Class365.method6298(13, 2122202903);
			if (client.aClass184_7475.method3053((byte) -14) != null) {
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4603, client.aClass184_7475.aClass432_2283, -513463410);
				client.aClass184_7475.method3049(class282_sub23, -630708929);
			}
		}
		Class59.method1160(1650682831);
		if (aBool3206) {
			Class209.method3598(Long.toString(Class169.method2869(1574222520) - (-404972914729282941L * aLong3183)), -480992160);
			aBool3206 = false;
		}
		if (bool_376_) {
			synchronized (client.anObject7226) {
				client.anObject7226.notify();
			}
		}
		return true;
	}

	public boolean method4546() {
		if (!this.aBool3171) {
			Exception_Sub3.method15619(false, -409924220);
		}
		this.anInt3189 = 0;
		for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
			if (-1 != this.mapDataArchiveIds[i] && null == this.aByteArrayArray3200[i]) {
				this.aByteArrayArray3200[i] = Class149.aClass317_1745.getFile((this.mapDataArchiveIds[i]), 0, -1347393421);
				if (null == this.aByteArrayArray3200[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.landscapeDataArchiveIds[i] && null == this.landscapeDataBuffer[i]) {
				this.landscapeDataBuffer[i] = Class149.aClass317_1745.method5643((this.landscapeDataArchiveIds[i]), 0, (this.xteas[i]), -1549240899);
				if (null == this.landscapeDataBuffer[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3197[i] != -1 && this.aByteArrayArray3178[i] == null) {
				this.aByteArrayArray3178[i] = Class149.aClass317_1745.getFile((this.anIntArray3197[i]), 0, -1962414723);
				if (null == this.aByteArrayArray3178[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (-1 != this.anIntArray3198[i] && this.aByteArrayArray3193[i] == null) {
				this.aByteArrayArray3193[i] = Class149.aClass317_1745.getFile((this.anIntArray3198[i]), 0, -1212323272);
				if (null == this.aByteArrayArray3193[i]) {
					this.anInt3189 += -1145558933;
				}
			}
			if (this.anIntArray3196 != null && this.aByteArrayArray3184[i] == null && -1 != this.anIntArray3196[i]) {
				this.aByteArrayArray3184[i] = (Class149.aClass317_1745.method5643(this.anIntArray3196[i], 0, this.xteas[i], -791526390));
				if (this.aByteArrayArray3184[i] == null) {
					this.anInt3189 += -1145558933;
				}
			}
		}
		if (this.aClass283_3180 == null) {
			if (null != this.aClass282_Sub50_Sub6_3176 && (Class192.worldMap.validFile(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 1256396574))) {
				if (!Class192.worldMap.method5629(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 71472045)) {
					this.anInt3189 += -1145558933;
				} else {
					this.aClass283_3180 = Class301.method5331(Class192.worldMap, new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				}
			} else {
				this.aClass283_3180 = new Class283(0);
			}
		}
		if (1685275715 * this.anInt3189 > 0) {
			if (this.anInt3190 * 866043953 < this.anInt3189 * 1685275715) {
				this.anInt3190 = this.anInt3189 * -1663472973;
			}
			this.aClass339_3188 = Class339.aClass339_3985;
			return false;
		}
		this.anInt3191 = 0;
		for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
			byte[] is = this.landscapeDataBuffer[i];
			if (null != is) {
				int i_388_ = (64 * (this.anIntArray3195[i] >> 8) - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_389_ = ((this.anIntArray3195[i] & 0xff) * 64 - (this.aClass219_3168.anInt2712 * -1002240017));
				if (this.aClass256_3163.method4410((byte) -96)) {
					i_388_ = 10;
					i_389_ = 10;
				}
				int i_390_ = Class251.method4316(this.aClass474_3201, is, i_388_, i_389_, (this.anInt3172 * -2082656295), (315871463 * this.anInt3194), (short) 8448);
				if (i_390_ > 0) {
					this.anInt3191 += i_390_ * -591712385;
				}
			}
			is = this.aByteArrayArray3193[i];
			if (is != null) {
				int i_391_ = (64 * (this.anIntArray3195[i] >> 8) - 1948093437 * (this.aClass219_3168.anInt2711));
				int i_392_ = ((this.anIntArray3195[i] & 0xff) * 64 - -1002240017 * (this.aClass219_3168.anInt2712));
				if (this.aClass256_3163.method4410((byte) -58)) {
					i_391_ = 10;
					i_392_ = 10;
				}
				int i_393_ = Class251.method4316(this.aClass474_3201, is, i_391_, i_392_, (this.anInt3172 * -2082656295), (this.anInt3194 * 315871463), (short) 8448);
				if (i_393_ > 0) {
					this.anInt3191 += -591712385 * i_393_;
				}
			}
		}
		if (-1047228289 * this.anInt3191 > 0) {
			if (-1112134077 * this.anInt3192 < this.anInt3191 * -1047228289) {
				this.anInt3192 = -624011499 * this.anInt3191;
			}
			this.aClass339_3188 = Class339.aClass339_3983;
			return false;
		}
		if (!this.aBool3171 && Class339.aClass339_3984 != this.aClass339_3188) {
			Class446.method7447(new StringBuilder().append(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -890587300)).append(Class2.aString16).append("(100%)").toString(), true, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -72);
		}
		this.aClass339_3188 = Class339.aClass339_3982;
		if (!this.aBool3171) {
			Class282_Sub20_Sub24.method15391(1490704796);
		}
		if (!this.aBool3171) {
			for (int i = 0; i < 2048; i++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i];
				if (null != class521_sub1_sub1_sub2_sub1) {
					class521_sub1_sub1_sub2_sub1.aClass206_7970 = null;
				}
			}
			for (int i = 0; i < client.aClass282_Sub47Array7209.length; i++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i];
				if (class282_sub47 != null) {
					((Class521_Sub1) class282_sub47.anObject8068).aClass206_7970 = null;
				}
			}
		}
		if (!this.aBool3171) {
			Class356.method6227(true, (byte) 31);
		}
		if (!this.aBool3171) {
			Class247.method4250((byte) -99);
		}
		boolean bool = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(678858350) == 2) {
			for (int i = 0; i < this.aByteArrayArray3200.length; i++) {
				if (this.aByteArrayArray3193[i] != null || this.aByteArrayArray3178[i] != null) {
					bool = true;
					break;
				}
			}
		}
		int i = (Class5.method295(Class393.aClass282_Sub54_4783.aClass468_Sub16_8198.method12750((byte) 32), 44628475).anInt1064 * 793844040);
		if (Class316.aClass505_3680.method8454()) {
			i++;
		}
		method4447(1522785778);
		method4460(1219957593);
		this.aClass206_3203 = new Class206(Class316.aClass505_3680, 9, 4, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, i, bool, Class316.aClass505_3680.method8463() > 0);
		this.aClass206_3203.method3380(false, -914334995);
		this.aClass206_3203.method3378(647281963 * client.anInt7240, -480923263);
		if (647281963 * client.anInt7240 != 0) {
			this.aClass206_3203.method3379(Class540.aClass8_7138, (byte) -28);
		} else {
			this.aClass206_3203.method3379(null, (byte) -51);
		}
		this.aClass341_3181 = new Class341();
		this.aFloat3173 = -0.05F + (float) (Math.random() / 10.0);
		this.aClass329_Sub1_3167 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 4, this.anInt3172 * -2082656295, 315871463 * this.anInt3194, false, this.aClass311_3202, this.aClass239_3175);
		this.aClass329_Sub1_3167.method5835(1922206120);
		this.aClass329_Sub1_3167.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -105) * 2141862047;
		this.aClass329_Sub1_3167.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1460226176) == 2;
		this.aClass329_Sub1_3167.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
		this.aClass329_Sub1_3167.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-1564346197) == 1;
		this.aClass329_Sub1_3167.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(481241808) == 1;
		if (!this.aClass256_3163.method4410((byte) 20)) {
			method4463(this.aClass329_Sub1_3167, this.aByteArrayArray3200, -461608631);
		} else {
			method4464(this.aClass329_Sub1_3167, this.aByteArrayArray3200, 2067256461);
		}
		if (this.aBool3171) {
			method4462(50, (byte) -16);
		}
		this.aClass239_3175.method4045(this.anInt3172 * -2082656295 >> 4, this.anInt3194 * 315871463 >> 4, -1230013231);
		this.aClass239_3175.method4037(this, (byte) 84);
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			this.aClass329_Sub1_3166 = new Class329_Sub1(this.aClass206_3203, this.aClass474_3201, 1, -2082656295 * this.anInt3172, 315871463 * this.anInt3194, true, this.aClass311_3202, this.aClass239_3175);
			this.aClass329_Sub1_3166.method5835(1881261500);
			this.aClass329_Sub1_3166.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -4) * 2141862047;
			this.aClass329_Sub1_3166.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-570720969) == 2;
			this.aClass329_Sub1_3166.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
			this.aClass329_Sub1_3166.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(831840646) == 1;
			this.aClass329_Sub1_3166.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(968043201) == 1;
			if (!this.aClass256_3163.method4410((byte) -42)) {
				method4463(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 1883819083);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, 657602626);
				}
			} else {
				method4464(this.aClass329_Sub1_3166, this.aByteArrayArray3178, 1977190736);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, 245892575);
				}
			}
			this.aClass329_Sub1_3166.method5853(0, (this.aClass329_Sub1_3167.anIntArrayArrayArray3818[0]), -1832449045);
			this.aClass329_Sub1_3166.method5843(Class316.aClass505_3680, null, null, (byte) 111);
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -93);
			}
		}
		this.aClass329_Sub1_3167.method5843(Class316.aClass505_3680, (bool ? this.aClass329_Sub1_3166.anIntArrayArrayArray3818 : null), this.aClass336Array3182, (byte) -53);
		if (!this.aClass256_3163.method4410((byte) -122)) {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1333353770);
			}
			method4465(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -1228514951);
			if (null != this.aByteArrayArray3184) {
				method4467(-1455909620);
			}
		} else {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1452476917);
			}
			method4432(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -1769255532);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, -529645048);
		}
		this.aClass329_Sub1_3167.method5837(Class316.aClass505_3680, (bool ? this.aClass206_3203.aClass390Array2614[0] : null), null, -908853993);
		if (this.aBool3171) {
			method4462(75, (byte) -7);
		}
		this.aClass329_Sub1_3167.method12463(Class316.aClass505_3680, false, 73840221);
		if (this.aBool3171) {
			method4462(75, (byte) -67);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, -1625158671);
		}
		if (bool) {
			this.aClass206_3203.method3380(true, -914334995);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1994458456);
			}
			if (!this.aClass256_3163.method4410((byte) 63)) {
				method4465(this.aClass329_Sub1_3166, this.aByteArrayArray3193, -1228514951);
			} else {
				method4432(this.aClass329_Sub1_3166, this.aByteArrayArray3193, -1470647462);
			}
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1300771305);
			}
			this.aClass329_Sub1_3166.method5837(Class316.aClass505_3680, null, this.aClass206_3203.aClass390Array2607[0], -1501234235);
			this.aClass329_Sub1_3166.method12463(Class316.aClass505_3680, true, 753114577);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 679896539);
			}
			this.aClass206_3203.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -61);
			}
		}
		this.aClass329_Sub1_3167.method5891((short) 181);
		if (this.aClass329_Sub1_3166 != null) {
			this.aClass329_Sub1_3166.method5891((short) -4995);
		}
		this.aClass206_3203.method3428(1203434505);
		if (this.aBool3171) {
			Class169.method2869(1542783833);
			while (!Class316.aClass505_3680.method8455(-1263374901)) {
				method4462(1, (byte) -8);
			}
		}
		boolean bool_394_ = false;
		if (this.aBool3171) {
			Class257 class257_395_ = client.aClass257_7353;
			method4418(class257_395_, 16711935);
			Class6.aClass340_45.method6050(class257_395_, (byte) -111);
			bool_394_ = true;
			Class169.method2869(1833246369);
			synchronized (client.anObject7227) {
				client.aBool7225 = true;
				try {
					client.anObject7227.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass257_7353 = this;
			class257_395_.method4460(1219957593);
			method4459(18, (byte) 62);
			method4457(-720388029);
		} else {
			Class282_Sub20_Sub24.method15391(-352583593);
			this.aClass239_3175.method4075(-1542531674);
			Class282_Sub15_Sub1.method14840((byte) -74);
		}
		for (int i_396_ = 0; i_396_ < 4; i_396_++) {
			for (int i_397_ = 0; i_397_ < this.anInt3172 * -2082656295; i_397_++) {
				for (int i_398_ = 0; i_398_ < 315871463 * this.anInt3194; i_398_++) {
					Class434_Sub1.method12760(i_396_, i_397_, i_398_, -1380263584);
				}
			}
		}
		for (int i_399_ = 0; i_399_ < client.aClass281Array7180.length; i_399_++) {
			if (client.aClass281Array7180[i_399_] != null) {
				client.aClass281Array7180[i_399_].method4978(this.aClass206_3203, (byte) -1);
			}
		}
		Class405.method6823(-734889653);
		Class48_Sub2.method14571((byte) 0);
		if (Class40.method867(-576916738) == Class279.aClass279_3368 && client.aClass184_7475.method3053((byte) -111) != null && -1741204137 * client.anInt7166 == 18) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4609, client.aClass184_7475.aClass432_2283, 1248373364);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(1057001181);
			client.aClass184_7475.method3049(class282_sub23, 1079004443);
		}
		if (!this.aClass256_3163.method4410((byte) 97)) {
			int i_400_ = ((-1892499075 * this.anInt3170 - (-2082656295 * this.anInt3172 >> 4)) / 8);
			int i_401_ = (((this.anInt3172 * -2082656295 >> 4) + -1892499075 * this.anInt3170) / 8);
			int i_402_ = ((-975658881 * this.anInt3207 - (315871463 * this.anInt3194 >> 4)) / 8);
			int i_403_ = ((this.anInt3207 * -975658881 + (this.anInt3194 * 315871463 >> 4)) / 8);
			for (int i_404_ = i_400_ - 1; i_404_ <= 1 + i_401_; i_404_++) {
				for (int i_405_ = i_402_ - 1; i_405_ <= i_403_ + 1; i_405_++) {
					if (i_404_ < i_400_ || i_404_ > i_401_ || i_405_ < i_402_ || i_405_ > i_403_) {
						Class149.aClass317_1745.method5630(method4455(true, false, i_404_, i_405_, 367164713), -807335053);
						Class149.aClass317_1745.method5630(method4455(false, false, i_404_, i_405_, 202953349), 1188721365);
						Class149.aClass317_1745.method5630(method4455(true, true, i_404_, i_405_, 1115752895), -35945893);
						Class149.aClass317_1745.method5630(method4455(false, true, i_404_, i_405_, -1569073452), 1084070225);
					}
				}
			}
		}
		if (-1741204137 * client.anInt7166 == 11) {
			Class365.method6298(5, 704656781);
		} else if (2 == client.anInt7166 * -1741204137) {
			Class365.method6298(0, 2015960269);
		} else if (-1741204137 * client.anInt7166 == 6) {
			Class365.method6298(7, 1366188227);
		} else if (9 == -1741204137 * client.anInt7166) {
			Class365.method6298(3, 1044642514);
		} else {
			Class365.method6298(13, 2127072418);
			if (client.aClass184_7475.method3053((byte) -15) != null) {
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4603, client.aClass184_7475.aClass432_2283, 263705400);
				client.aClass184_7475.method3049(class282_sub23, 1019819328);
			}
		}
		Class59.method1160(1287831700);
		if (aBool3206) {
			Class209.method3598(Long.toString(Class169.method2869(1655269880) - (-404972914729282941L * aLong3183)), -1071717049);
			aBool3206 = false;
		}
		if (bool_394_) {
			synchronized (client.anObject7226) {
				client.anObject7226.notify();
			}
		}
		return true;
	}

	public void method4547(byte i) {
		if (this.aBool3171) {
			method4445((byte) -48);
			Class122.method2111(true, 662490589);
			Class257 class257_406_ = client.aClass257_7353;
			this.anIntArray3195 = class257_406_.anIntArray3195;
			this.mapDataArchiveIds = class257_406_.mapDataArchiveIds;
			this.landscapeDataArchiveIds = class257_406_.landscapeDataArchiveIds;
			this.anIntArray3196 = class257_406_.anIntArray3196;
			this.anIntArray3197 = class257_406_.anIntArray3197;
			this.anIntArray3198 = class257_406_.anIntArray3198;
			this.xteas = class257_406_.xteas;
			this.aByteArrayArray3200 = class257_406_.aByteArrayArray3200;
			this.landscapeDataBuffer = class257_406_.landscapeDataBuffer;
			this.aByteArrayArray3184 = class257_406_.aByteArrayArray3184;
			this.aByteArrayArray3178 = class257_406_.aByteArrayArray3178;
			this.aByteArrayArray3193 = class257_406_.aByteArrayArray3193;
			this.aClass336Array3182 = class257_406_.aClass336Array3182;
			this.aClass311_3202 = class257_406_.aClass311_3202;
			this.aClass239_3175 = class257_406_.aClass239_3175;
			this.anIntArrayArrayArray3205 = class257_406_.anIntArrayArrayArray3205;
			this.anInt3177 = 1 * class257_406_.anInt3177;
			this.anInt3179 = class257_406_.anInt3179 * 1;
			this.aClass282_Sub50_Sub6_3176 = class257_406_.aClass282_Sub50_Sub6_3176;
			this.aClass283_3180 = class257_406_.aClass283_3180;
			this.anIntArrayArray3185 = class257_406_.anIntArrayArray3185;
			this.anIntArrayArray3186 = class257_406_.anIntArrayArray3186;
			this.aByteArrayArrayArray3162 = class257_406_.aByteArrayArrayArray3162;
			this.aClass256_3163 = class257_406_.aClass256_3163;
			this.aClass106_3165 = class257_406_.aClass106_3165;
			this.aClass219_3168 = class257_406_.aClass219_3168;
			this.aClass219_3169 = class257_406_.aClass219_3169;
			this.anInt3170 = class257_406_.anInt3170 * 1;
			this.anInt3207 = 1 * class257_406_.anInt3207;
			this.anInt3172 = 1 * class257_406_.anInt3172;
			this.anInt3194 = 1 * class257_406_.anInt3194;
		} else if (5 == -1741204137 * client.anInt7166) {
			Class365.method6298(11, 1377312199);
		} else if (-1741204137 * client.anInt7166 == 0) {
			Class365.method6298(2, 1244371600);
		} else if (-1741204137 * client.anInt7166 == 7) {
			Class365.method6298(6, 1707832511);
		} else if (13 == -1741204137 * client.anInt7166) {
			Class365.method6298(18, 706362895);
		} else if (-1741204137 * client.anInt7166 == 3) {
			Class365.method6298(9, 1330863416);
		}
	}

	void method4548(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public Class339 method4549() {
		return this.aClass339_3188;
	}

	void method4550(Class329_Sub1 class329_sub1, byte[][] is) {
		int i = is.length;
		for (int i_407_ = 0; i_407_ < i; i_407_++) {
			byte[] is_408_ = is[i_407_];
			if (null != is_408_) {
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_408_);
				int i_409_ = this.anIntArray3195[i_407_] >> 8;
				int i_410_ = this.anIntArray3195[i_407_] & 0xff;
				int i_411_ = i_409_ * 64 - 1948093437 * (this.aClass219_3168.anInt2711);
				int i_412_ = i_410_ * 64 - (this.aClass219_3168.anInt2712 * -1002240017);
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-1703050268);
				}
				class329_sub1.method5839(class282_sub35, i_411_, i_412_, 1948093437 * this.aClass219_3168.anInt2711, -1002240017 * this.aClass219_3168.anInt2712, this.aClass336Array3182, (byte) -7);
				class329_sub1.method12471(Class316.aClass505_3680, class282_sub35, i_411_, i_412_, -264061808);
			}
		}
		for (int i_413_ = 0; i_413_ < i; i_413_++) {
			int i_414_ = (64 * (this.anIntArray3195[i_413_] >> 8) - this.aClass219_3168.anInt2711 * 1948093437);
			int i_415_ = ((this.anIntArray3195[i_413_] & 0xff) * 64 - this.aClass219_3168.anInt2712 * -1002240017);
			byte[] is_416_ = is[i_413_];
			if (null == is_416_ && this.anInt3207 * -975658881 < 800) {
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-919723707);
				}
				class329_sub1.method5890(i_414_, i_415_, 64, 64, (byte) 106);
			}
		}
	}

	void method4551(Class329_Sub1 class329_sub1, byte[][] is) {
		for (int i = 0; i < class329_sub1.anInt3845 * 1599084401; i++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(1271644754);
			}
			for (int i_417_ = 0; i_417_ < this.anInt3172 * -2082656295 >> 3; i_417_++) {
				for (int i_418_ = 0; i_418_ < this.anInt3194 * 315871463 >> 3; i_418_++) {
					int i_419_ = (this.anIntArrayArrayArray3205[i][i_417_][i_418_]);
					if (-1 != i_419_) {
						int i_420_ = i_419_ >> 24 & 0x3;
						if (!class329_sub1.aBool3786 || i_420_ == 0) {
							int i_421_ = i_419_ >> 1 & 0x3;
							int i_422_ = i_419_ >> 14 & 0x3ff;
							int i_423_ = i_419_ >> 3 & 0x7ff;
							int i_424_ = (i_422_ / 8 << 8) + i_423_ / 8;
							for (int i_425_ = 0; (i_425_ < this.anIntArray3195.length); i_425_++) {
								if ((this.anIntArray3195[i_425_] == i_424_) && null != is[i_425_]) {
									RsByteBuffer class282_sub35 = new RsByteBuffer(is[i_425_]);
									class329_sub1.method5841(class282_sub35, i, i_417_ * 8, 8 * i_418_, i_420_, i_422_, i_423_, i_421_, this.aClass336Array3182, 67301674);
									class329_sub1.method12460(Class316.aClass505_3680, class282_sub35, i, 8 * i_417_, i_418_ * 8, i_420_, i_422_, i_423_, i_421_, 809491224);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < class329_sub1.anInt3845 * 1599084401; i++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(1484749952);
			}
			for (int i_426_ = 0; i_426_ < this.anInt3172 * -2082656295 >> 3; i_426_++) {
				for (int i_427_ = 0; i_427_ < this.anInt3194 * 315871463 >> 3; i_427_++) {
					int i_428_ = (this.anIntArrayArrayArray3205[i][i_426_][i_427_]);
					if (i_428_ == -1) {
						class329_sub1.method5838(i, 8 * i_426_, i_427_ * 8, 8, 8, -1337783095);
					}
				}
			}
		}
	}

	public Class336 method4552(int i, int i_429_) {
		return this.aClass336Array3182[i];
	}

	public Class474 method4553() {
		return this.aClass474_3201;
	}

	void method4554(Class329_Sub1 class329_sub1, byte[][] is) {
		int i = this.aByteArrayArray3200.length;
		for (int i_430_ = 0; i_430_ < i; i_430_++) {
			byte[] is_431_ = is[i_430_];
			if (is_431_ != null) {
				int i_432_ = ((this.anIntArray3195[i_430_] >> 8) * 64 - (this.aClass219_3168.anInt2711 * 1948093437));
				int i_433_ = ((this.anIntArray3195[i_430_] & 0xff) * 64 - (-1002240017 * this.aClass219_3168.anInt2712));
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-514482052);
				}
				class329_sub1.method12461(Class316.aClass505_3680, is_431_, i_432_, i_433_, this.aClass336Array3182, 1918468503);
				if (this.aBool3171) {
					method4462(10, (byte) -59);
				}
			}
		}
	}

	void method4555() {
		int i = this.aByteArrayArray3184.length;
		for (int i_434_ = 0; i_434_ < i; i_434_++) {
			if (null != this.aByteArrayArray3184[i_434_]) {
				int i_435_ = -1;
				for (int i_436_ = 0; i_436_ < -1021495055 * client.anInt7234; i_436_++) {
					if (this.anIntArray3195[i_434_] == client.anIntArray7228[i_436_]) {
						i_435_ = i_436_;
						break;
					}
				}
				if (-1 == i_435_) {
					client.anIntArray7228[client.anInt7234 * -1021495055] = this.anIntArray3195[i_434_];
					i_435_ = (client.anInt7234 += 474134545) * -1021495055 - 1;
				}
				RsByteBuffer class282_sub35 = new RsByteBuffer(this.aByteArrayArray3184[i_434_]);
				int i_437_ = 0;
				while ((class282_sub35.index * -1990677291 < this.aByteArrayArray3184[i_434_].length) && i_437_ < 511 && client.anInt7211 * -685729279 < 1023) {
					int i_438_ = i_435_ | i_437_++ << 6;
					int i_439_ = class282_sub35.readUnsignedShort();
					int i_440_ = i_439_ >> 14;
					int i_441_ = i_439_ >> 7 & 0x3f;
					int i_442_ = i_439_ & 0x3f;
					int i_443_ = ((this.anIntArray3195[i_434_] >> 8) * 64 - (1948093437 * this.aClass219_3168.anInt2711) + i_441_);
					int i_444_ = (64 * (this.anIntArray3195[i_434_] & 0xff) - (this.aClass219_3168.anInt2712 * -1002240017) + i_442_);
					Class409 class409 = (Class350_Sub1.aClass406_7757.method6828(class282_sub35.readUnsignedShort(), (byte) 97));
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754(i_438_));
					if (null == class282_sub47 && (class409.aByte4900 & 0x1) > 0 && i_443_ >= 0 && (i_443_ + class409.anInt4858 * 1203434505 < -2082656295 * this.anInt3172) && i_444_ >= 0 && (class409.anInt4858 * 1203434505 + i_444_ < this.anInt3194 * 315871463)) {
						NPC class521_sub1_sub1_sub2_sub2 = (new NPC(this.aClass206_3203));
						class521_sub1_sub1_sub2_sub2.anInt10314 = -1498872675 * i_438_;
						Class282_Sub47 class282_sub47_445_ = new Class282_Sub47(class521_sub1_sub1_sub2_sub2);
						client.aClass465_7208.method7765(class282_sub47_445_, i_438_);
						client.aClass282_Sub47Array7209[((client.anInt7210 += -1228117803) * 1658163325) - 1] = class282_sub47_445_;
						client.anIntArray7212[(client.anInt7211 += 1568892417) * -685729279 - 1] = i_438_;
						class521_sub1_sub1_sub2_sub2.anInt10353 = client.cycles * -537541873;
						class521_sub1_sub1_sub2_sub2.method16166(class409, 131742484);
						class521_sub1_sub1_sub2_sub2.method15836(1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858), (byte) -95);
						class521_sub1_sub1_sub2_sub2.anInt10340 = (-222526911 * (1913503455 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4889) << 3));
						class521_sub1_sub1_sub2_sub2.method15791((class521_sub1_sub1_sub2_sub2.aClass409_10580.aClass252_4910.method4317((short) 27581).method243((byte) 1) << 11 & 0x3fff), true, (byte) -113);
						class521_sub1_sub1_sub2_sub2.method16159(i_440_, i_443_, i_444_, true, class521_sub1_sub1_sub2_sub2.method15805(828768449), -1829065684);
					}
				}
			}
		}
	}

	static void method4556(CS2Executor class527, byte i) {
		class527.intStack[class527.anInt7012 * 1942118537 - 1] = (Class409.aClass242_4922.method4156((class527.intStack[1942118537 * class527.anInt7012 - 1]), -1396181317).method4093(Class158_Sub1.aClass3_8507, client.anIntArray7337, 1568436027)) ? 1 : 0;
	}

	static final void method4557(CS2Executor class527, byte i) {
		class527.anInt7012 -= 425673003;
		Class42.method890((class527.intStack[1942118537 * class527.anInt7012]), (class527.intStack[1 + class527.anInt7012 * 1942118537]), (class527.intStack[class527.anInt7012 * 1942118537 + 2]), (byte) -2);
	}

	static final void method4558(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = class513.aClass118_5886;
		Class98 class98 = class513.aClass98_5885;
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	static final boolean method4559(int i, int i_446_, boolean bool, Class225 class225, int i_447_) {
		int i_448_ = Class84.myPlayer.regionBaseX[0];
		int i_449_ = Class84.myPlayer.regionBaseY[0];
		if (i_448_ < 0 || i_448_ >= client.aClass257_7353.method4424(-988054561) || i_449_ < 0 || i_449_ >= client.aClass257_7353.method4451(-525068831)) {
			return false;
		}
		if (i < 0 || i >= client.aClass257_7353.method4424(-914892622) || i_446_ < 0 || i_446_ >= client.aClass257_7353.method4451(-1924417648)) {
			return false;
		}
		int i_450_ = Class112.method1873(i_448_, i_449_, Class84.myPlayer.method15805(828768449), class225, (client.aClass257_7353.method4552((Class84.myPlayer.aByte7967), 1801793645)), bool, client.anIntArray7245, client.anIntArray7246, -1311698246);
		if (i_450_ < 1) {
			return false;
		}
		Class187.anInt2361 = -134656021 * client.anIntArray7245[i_450_ - 1];
		Class187.anInt2359 = client.anIntArray7246[i_450_ - 1] * -818291313;
		Class187.aBool2360 = false;
		Class282_Sub20_Sub9.method15255((short) -9235);
		return true;
	}

	static final void method4560(CS2Executor class527, byte i) {
		class527.anInt7000 -= -1341717846;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class455.method7557((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), Class223.aClass495_2772, 1341608337));
	}

	static void method4561(int i, int i_451_, int i_452_, int i_453_, int i_454_, int i_455_, int i_456_) {
		int i_457_ = i_452_ + i_455_;
		int i_458_ = i_453_ - i_455_;
		for (int i_459_ = i_452_; i_459_ < i_457_; i_459_++) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_459_], i, i_451_, i_454_, (byte) -10);
		}
		for (int i_460_ = i_453_; i_460_ > i_458_; i_460_--) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_460_], i, i_451_, i_454_, (byte) -46);
		}
		int i_461_ = i + i_455_;
		int i_462_ = i_451_ - i_455_;
		for (int i_463_ = i_457_; i_463_ <= i_458_; i_463_++) {
			int[] is = Class532_Sub1.anIntArrayArray7072[i_463_];
			Class232.method3922(is, i, i_461_, i_454_, (byte) 79);
			Class232.method3922(is, i_462_, i_451_, i_454_, (byte) 31);
		}
	}

	static void method4562(int i, String string, int i_464_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(2, i);
		class282_sub50_sub12.method14995(860950307);
		class282_sub50_sub12.aString9640 = string;
	}

	static final void method4563(CS2Executor class527, short i) {
		int i_465_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Integer.toString(i_465_);
	}

	public static Class350 method4564(RsByteBuffer class282_sub35, int i) {
		Class350 class350 = Class383.method6512(class282_sub35, 88062096);
		int i_466_ = class282_sub35.readInt();
		int i_467_ = class282_sub35.readInt();
		int i_468_ = class282_sub35.readBigSmart(2023575331);
		return new Class350_Sub1(class350.aClass356_4094, class350.aClass353_4087, class350.anInt4090 * -1967081549, class350.anInt4089 * -1196256967, 329542577 * class350.anInt4093, class350.anInt4088 * 323608093, -1921815535 * class350.anInt4092, 985690519 * class350.anInt4086, -771513131 * class350.anInt4091, i_466_, i_467_, i_468_);
	}
}
