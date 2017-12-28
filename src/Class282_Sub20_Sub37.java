
/* Class282_Sub20_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class282_Sub20_Sub37 extends Class282_Sub20 {
	static final int anInt9976 = 0;
	static final int anInt9977 = 8;
	static final int anInt9978 = 1024;
	int[][] anIntArrayArray9979;
	static final int anInt9980 = 1024;
	static final int anInt9981 = 409;
	int anInt9982 = -1317063452;
	static final int anInt9983 = 4;
	int anInt9984;
	static final int anInt9985 = 81;
	int anInt9986;
	int anInt9987;
	int anInt9988;
	int anInt9989;
	int anInt9990;
	int anInt9991;
	int[][] anIntArrayArray9992;
	int anInt9993;
	int anInt9994 = 2091472472;
	int anInt9995;
	int[] anIntArray9996;
	static final int anInt9997 = 204;

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -318596352);
		if (aClass320_7667.aBool3722) {
			int i_1_ = 0;
			int i_2_;
			for (i_2_ = (((Class282_Sub20_Sub37) this).anInt9986 * 1746808675 + Class316.anIntArray3668[i]); i_2_ < 0; i_2_ += 4096) {
				/* empty */
			}
			for (/**/; i_2_ > 4096; i_2_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_1_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163 && (i_2_ >= ((Class282_Sub20_Sub37) this).anIntArray9996[i_1_])); i_1_++) {
				/* empty */
			}
			int i_3_ = i_1_ - 1;
			boolean bool = (i_1_ & 0x1) == 0;
			int i_4_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_1_];
			int i_5_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_1_ - 1];
			if ((i_2_ > i_5_ + ((Class282_Sub20_Sub37) this).anInt9993 * 2139008593) && i_2_ < i_4_ - (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593)) {
				for (int i_6_ = 0; i_6_ < -402153223 * Class316.anInt3670; i_6_++) {
					int i_7_ = 0;
					int i_8_ = (bool ? (((Class282_Sub20_Sub37) this).anInt9987 * -531060773) : -(-531060773 * ((Class282_Sub20_Sub37) this).anInt9987));
					int i_9_;
					for (i_9_ = (Class316.anIntArray3672[i_6_] + (i_8_ * (-733622621 * (((Class282_Sub20_Sub37) this).anInt9988)) >> 12)); i_9_ < 0; i_9_ += 4096) {
						/* empty */
					}
					for (/**/; i_9_ > 4096; i_9_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_7_ < (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) && i_9_ >= (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_3_][i_7_])); i_7_++) {
						/* empty */
					}
					int i_10_ = i_7_ - 1;
					int i_11_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_3_][i_10_]);
					int i_12_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_3_][i_7_]);
					if (i_9_ > 2139008593 * (((Class282_Sub20_Sub37) this).anInt9993) + i_11_ && i_9_ < i_12_ - (((Class282_Sub20_Sub37) this).anInt9993) * 2139008593)
						is[i_6_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_3_][i_10_]);
					else
						is[i_6_] = 0;
				}
			} else
				Class503.method8365(is, 0, Class316.anInt3670 * -402153223, 0);
		}
		return is;
	}

	public Class282_Sub20_Sub37() {
		super(0, true);
		((Class282_Sub20_Sub37) this).anInt9986 = 0;
		((Class282_Sub20_Sub37) this).anInt9987 = -873378816;
		((Class282_Sub20_Sub37) this).anInt9984 = -1923132416;
		((Class282_Sub20_Sub37) this).anInt9989 = -1884930415;
		((Class282_Sub20_Sub37) this).anInt9990 = 540626436;
		((Class282_Sub20_Sub37) this).anInt9991 = -1396657265;
	}

	void method15421() {
		Random random = new Random((long) (((Class282_Sub20_Sub37) this).anInt9994 * 27880163));
		((Class282_Sub20_Sub37) this).anInt9993 = (-1331126753 * ((Class282_Sub20_Sub37) this).anInt9991 / 2 * 13720241);
		((Class282_Sub20_Sub37) this).anInt9988 = (4096 / (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) * -380873461);
		((Class282_Sub20_Sub37) this).anInt9995 = (4096 / (27880163 * ((Class282_Sub20_Sub37) this).anInt9994) * 185306597);
		int i = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621 / 2;
		int i_13_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995 / 2;
		((Class282_Sub20_Sub37) this).anIntArray9996 = new int[27880163 * ((Class282_Sub20_Sub37) this).anInt9994 + 1];
		((Class282_Sub20_Sub37) this).anIntArrayArray9979 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][1 + ((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArrayArray9992 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArray9996[0] = 0;
		for (int i_14_ = 0; i_14_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163; i_14_++) {
			if (i_14_ > 0) {
				int i_15_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995;
				int i_16_ = (((Class476.method7931(random, 4096, 487709440) - 2048) * (((Class282_Sub20_Sub37) this).anInt9990 * -1987699277)) >> 12);
				i_15_ += i_16_ * i_13_ >> 12;
				((Class282_Sub20_Sub37) this).anIntArray9996[i_14_] = (((Class282_Sub20_Sub37) this).anIntArray9996[i_14_ - 1] + i_15_);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_14_][0] = 0;
			for (int i_17_ = 0; i_17_ < 1158222089 * ((Class282_Sub20_Sub37) this).anInt9982; i_17_++) {
				if (i_17_ > 0) {
					int i_18_ = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621;
					int i_19_ = (((Class476.method7931(random, 4096, -2028810142) - 2048) * (-464574839 * ((Class282_Sub20_Sub37) this).anInt9989)) >> 12);
					i_18_ += i_19_ * i >> 12;
					((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_14_][i_17_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_14_][i_17_ - 1]) + i_18_;
				}
				((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_14_][i_17_] = (((Class282_Sub20_Sub37) this).anInt9984 * 213461373 > 0 ? 4096 - Class476.method7931(random, (213461373 * ((Class282_Sub20_Sub37) this).anInt9984), 377921157) : 4096);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_14_][1158222089 * ((Class282_Sub20_Sub37) this).anInt9982] = 4096;
		}
		((Class282_Sub20_Sub37) this).anIntArray9996[27880163 * ((Class282_Sub20_Sub37) this).anInt9994] = 4096;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_20_) {
		switch (i) {
		case 5:
			((Class282_Sub20_Sub37) this).anInt9986 = class282_sub35.readUnsignedShort() * -1871918517;
			break;
		case 2:
			((Class282_Sub20_Sub37) this).anInt9989 = class282_sub35.readUnsignedShort() * -697684039;
			break;
		case 6:
			((Class282_Sub20_Sub37) this).anInt9991 = class282_sub35.readUnsignedShort() * 884170207;
			break;
		case 4:
			((Class282_Sub20_Sub37) this).anInt9987 = class282_sub35.readUnsignedShort() * 1139997779;
			break;
		case 0:
			((Class282_Sub20_Sub37) this).anInt9982 = class282_sub35.readUnsignedByte() * -1403007687;
			break;
		case 7:
			((Class282_Sub20_Sub37) this).anInt9984 = class282_sub35.readUnsignedShort() * -270313515;
			break;
		case 1:
			((Class282_Sub20_Sub37) this).anInt9994 = class282_sub35.readUnsignedByte() * 798304971;
			break;
		case 3:
			((Class282_Sub20_Sub37) this).anInt9990 = class282_sub35.readUnsignedShort() * 1771166075;
			break;
		}
	}

	void method15422(int i) {
		Random random = new Random((long) (((Class282_Sub20_Sub37) this).anInt9994 * 27880163));
		((Class282_Sub20_Sub37) this).anInt9993 = (-1331126753 * ((Class282_Sub20_Sub37) this).anInt9991 / 2 * 13720241);
		((Class282_Sub20_Sub37) this).anInt9988 = (4096 / (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) * -380873461);
		((Class282_Sub20_Sub37) this).anInt9995 = (4096 / (27880163 * ((Class282_Sub20_Sub37) this).anInt9994) * 185306597);
		int i_21_ = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621 / 2;
		int i_22_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995 / 2;
		((Class282_Sub20_Sub37) this).anIntArray9996 = new int[27880163 * ((Class282_Sub20_Sub37) this).anInt9994 + 1];
		((Class282_Sub20_Sub37) this).anIntArrayArray9979 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][1 + ((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArrayArray9992 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArray9996[0] = 0;
		for (int i_23_ = 0; i_23_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163; i_23_++) {
			if (i_23_ > 0) {
				int i_24_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995;
				int i_25_ = (((Class476.method7931(random, 4096, -2075817064) - 2048) * (((Class282_Sub20_Sub37) this).anInt9990 * -1987699277)) >> 12);
				i_24_ += i_25_ * i_22_ >> 12;
				((Class282_Sub20_Sub37) this).anIntArray9996[i_23_] = (((Class282_Sub20_Sub37) this).anIntArray9996[i_23_ - 1] + i_24_);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_23_][0] = 0;
			for (int i_26_ = 0; i_26_ < 1158222089 * ((Class282_Sub20_Sub37) this).anInt9982; i_26_++) {
				if (i_26_ > 0) {
					int i_27_ = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621;
					int i_28_ = (((Class476.method7931(random, 4096, -750360310) - 2048) * (-464574839 * ((Class282_Sub20_Sub37) this).anInt9989)) >> 12);
					i_27_ += i_28_ * i_21_ >> 12;
					((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_23_][i_26_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_23_][i_26_ - 1]) + i_27_;
				}
				((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_23_][i_26_] = (((Class282_Sub20_Sub37) this).anInt9984 * 213461373 > 0 ? 4096 - Class476.method7931(random, (213461373 * ((Class282_Sub20_Sub37) this).anInt9984), 1473657007) : 4096);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_23_][1158222089 * ((Class282_Sub20_Sub37) this).anInt9982] = 4096;
		}
		((Class282_Sub20_Sub37) this).anIntArray9996[27880163 * ((Class282_Sub20_Sub37) this).anInt9994] = 4096;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1344995477);
		if (aClass320_7667.aBool3722) {
			int i_29_ = 0;
			int i_30_;
			for (i_30_ = (((Class282_Sub20_Sub37) this).anInt9986 * 1746808675 + Class316.anIntArray3668[i]); i_30_ < 0; i_30_ += 4096) {
				/* empty */
			}
			for (/**/; i_30_ > 4096; i_30_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_29_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163 && (i_30_ >= ((Class282_Sub20_Sub37) this).anIntArray9996[i_29_])); i_29_++) {
				/* empty */
			}
			int i_31_ = i_29_ - 1;
			boolean bool = (i_29_ & 0x1) == 0;
			int i_32_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_29_];
			int i_33_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_29_ - 1];
			if (i_30_ > i_33_ + (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593) && i_30_ < i_32_ - (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593)) {
				for (int i_34_ = 0; i_34_ < -402153223 * Class316.anInt3670; i_34_++) {
					int i_35_ = 0;
					int i_36_ = (bool ? (((Class282_Sub20_Sub37) this).anInt9987 * -531060773) : -(-531060773 * ((Class282_Sub20_Sub37) this).anInt9987));
					int i_37_;
					for (i_37_ = (Class316.anIntArray3672[i_34_] + (i_36_ * (-733622621 * (((Class282_Sub20_Sub37) this).anInt9988)) >> 12)); i_37_ < 0; i_37_ += 4096) {
						/* empty */
					}
					for (/**/; i_37_ > 4096; i_37_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_35_ < (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) && i_37_ >= (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_31_][i_35_])); i_35_++) {
						/* empty */
					}
					int i_38_ = i_35_ - 1;
					int i_39_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_31_][i_38_]);
					int i_40_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_31_][i_35_]);
					if (i_37_ > 2139008593 * (((Class282_Sub20_Sub37) this).anInt9993) + i_39_ && i_37_ < i_40_ - (((Class282_Sub20_Sub37) this).anInt9993) * 2139008593)
						is[i_34_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_31_][i_38_]);
					else
						is[i_34_] = 0;
				}
			} else
				Class503.method8365(is, 0, Class316.anInt3670 * -402153223, 0);
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -736152206);
		if (aClass320_7667.aBool3722) {
			int i_41_ = 0;
			int i_42_;
			for (i_42_ = (((Class282_Sub20_Sub37) this).anInt9986 * 1746808675 + Class316.anIntArray3668[i]); i_42_ < 0; i_42_ += 4096) {
				/* empty */
			}
			for (/**/; i_42_ > 4096; i_42_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_41_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163 && (i_42_ >= ((Class282_Sub20_Sub37) this).anIntArray9996[i_41_])); i_41_++) {
				/* empty */
			}
			int i_43_ = i_41_ - 1;
			boolean bool = (i_41_ & 0x1) == 0;
			int i_44_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_41_];
			int i_45_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_41_ - 1];
			if (i_42_ > i_45_ + (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593) && i_42_ < i_44_ - (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593)) {
				for (int i_46_ = 0; i_46_ < -402153223 * Class316.anInt3670; i_46_++) {
					int i_47_ = 0;
					int i_48_ = (bool ? (((Class282_Sub20_Sub37) this).anInt9987 * -531060773) : -(-531060773 * ((Class282_Sub20_Sub37) this).anInt9987));
					int i_49_;
					for (i_49_ = (Class316.anIntArray3672[i_46_] + (i_48_ * (-733622621 * (((Class282_Sub20_Sub37) this).anInt9988)) >> 12)); i_49_ < 0; i_49_ += 4096) {
						/* empty */
					}
					for (/**/; i_49_ > 4096; i_49_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_47_ < (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) && i_49_ >= (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_43_][i_47_])); i_47_++) {
						/* empty */
					}
					int i_50_ = i_47_ - 1;
					int i_51_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_43_][i_50_]);
					int i_52_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_43_][i_47_]);
					if (i_49_ > 2139008593 * (((Class282_Sub20_Sub37) this).anInt9993) + i_51_ && i_49_ < i_52_ - (((Class282_Sub20_Sub37) this).anInt9993) * 2139008593)
						is[i_46_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_43_][i_50_]);
					else
						is[i_46_] = 0;
				}
			} else
				Class503.method8365(is, 0, Class316.anInt3670 * -402153223, 0);
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -241815355);
		if (aClass320_7667.aBool3722) {
			int i_53_ = 0;
			int i_54_;
			for (i_54_ = (((Class282_Sub20_Sub37) this).anInt9986 * 1746808675 + Class316.anIntArray3668[i]); i_54_ < 0; i_54_ += 4096) {
				/* empty */
			}
			for (/**/; i_54_ > 4096; i_54_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_53_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163 && (i_54_ >= ((Class282_Sub20_Sub37) this).anIntArray9996[i_53_])); i_53_++) {
				/* empty */
			}
			int i_55_ = i_53_ - 1;
			boolean bool = (i_53_ & 0x1) == 0;
			int i_56_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_53_];
			int i_57_ = ((Class282_Sub20_Sub37) this).anIntArray9996[i_53_ - 1];
			if (i_54_ > i_57_ + (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593) && i_54_ < i_56_ - (((Class282_Sub20_Sub37) this).anInt9993 * 2139008593)) {
				for (int i_58_ = 0; i_58_ < -402153223 * Class316.anInt3670; i_58_++) {
					int i_59_ = 0;
					int i_60_ = (bool ? (((Class282_Sub20_Sub37) this).anInt9987 * -531060773) : -(-531060773 * ((Class282_Sub20_Sub37) this).anInt9987));
					int i_61_;
					for (i_61_ = (Class316.anIntArray3672[i_58_] + (i_60_ * (-733622621 * (((Class282_Sub20_Sub37) this).anInt9988)) >> 12)); i_61_ < 0; i_61_ += 4096) {
						/* empty */
					}
					for (/**/; i_61_ > 4096; i_61_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_59_ < (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) && i_61_ >= (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_55_][i_59_])); i_59_++) {
						/* empty */
					}
					int i_62_ = i_59_ - 1;
					int i_63_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_55_][i_62_]);
					int i_64_ = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_55_][i_59_]);
					if (i_61_ > 2139008593 * (((Class282_Sub20_Sub37) this).anInt9993) + i_63_ && i_61_ < i_64_ - (((Class282_Sub20_Sub37) this).anInt9993) * 2139008593)
						is[i_58_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_55_][i_62_]);
					else
						is[i_58_] = 0;
				}
			} else
				Class503.method8365(is, 0, Class316.anInt3670 * -402153223, 0);
		}
		return is;
	}

	void method12328() {
		method15422(-2142019203);
	}

	void method12329() {
		method15422(792747881);
	}

	void method12350() {
		method15422(1447739412);
	}

	void method12318() {
		method15422(486468837);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 5:
			((Class282_Sub20_Sub37) this).anInt9986 = class282_sub35.readUnsignedShort() * -1871918517;
			break;
		case 2:
			((Class282_Sub20_Sub37) this).anInt9989 = class282_sub35.readUnsignedShort() * -697684039;
			break;
		case 6:
			((Class282_Sub20_Sub37) this).anInt9991 = class282_sub35.readUnsignedShort() * 884170207;
			break;
		case 4:
			((Class282_Sub20_Sub37) this).anInt9987 = class282_sub35.readUnsignedShort() * 1139997779;
			break;
		case 0:
			((Class282_Sub20_Sub37) this).anInt9982 = class282_sub35.readUnsignedByte() * -1403007687;
			break;
		case 7:
			((Class282_Sub20_Sub37) this).anInt9984 = class282_sub35.readUnsignedShort() * -270313515;
			break;
		case 1:
			((Class282_Sub20_Sub37) this).anInt9994 = class282_sub35.readUnsignedByte() * 798304971;
			break;
		case 3:
			((Class282_Sub20_Sub37) this).anInt9990 = class282_sub35.readUnsignedShort() * 1771166075;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 5:
			((Class282_Sub20_Sub37) this).anInt9986 = class282_sub35.readUnsignedShort() * -1871918517;
			break;
		case 2:
			((Class282_Sub20_Sub37) this).anInt9989 = class282_sub35.readUnsignedShort() * -697684039;
			break;
		case 6:
			((Class282_Sub20_Sub37) this).anInt9991 = class282_sub35.readUnsignedShort() * 884170207;
			break;
		case 4:
			((Class282_Sub20_Sub37) this).anInt9987 = class282_sub35.readUnsignedShort() * 1139997779;
			break;
		case 0:
			((Class282_Sub20_Sub37) this).anInt9982 = class282_sub35.readUnsignedByte() * -1403007687;
			break;
		case 7:
			((Class282_Sub20_Sub37) this).anInt9984 = class282_sub35.readUnsignedShort() * -270313515;
			break;
		case 1:
			((Class282_Sub20_Sub37) this).anInt9994 = class282_sub35.readUnsignedByte() * 798304971;
			break;
		case 3:
			((Class282_Sub20_Sub37) this).anInt9990 = class282_sub35.readUnsignedShort() * 1771166075;
			break;
		}
	}

	void method15423() {
		Random random = new Random((long) (((Class282_Sub20_Sub37) this).anInt9994 * 27880163));
		((Class282_Sub20_Sub37) this).anInt9993 = (-1331126753 * ((Class282_Sub20_Sub37) this).anInt9991 / 2 * 13720241);
		((Class282_Sub20_Sub37) this).anInt9988 = (4096 / (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) * -380873461);
		((Class282_Sub20_Sub37) this).anInt9995 = (4096 / (27880163 * ((Class282_Sub20_Sub37) this).anInt9994) * 185306597);
		int i = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621 / 2;
		int i_65_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995 / 2;
		((Class282_Sub20_Sub37) this).anIntArray9996 = new int[27880163 * ((Class282_Sub20_Sub37) this).anInt9994 + 1];
		((Class282_Sub20_Sub37) this).anIntArrayArray9979 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][1 + ((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArrayArray9992 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArray9996[0] = 0;
		for (int i_66_ = 0; i_66_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163; i_66_++) {
			if (i_66_ > 0) {
				int i_67_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995;
				int i_68_ = (((Class476.method7931(random, 4096, -184711884) - 2048) * (((Class282_Sub20_Sub37) this).anInt9990 * -1987699277)) >> 12);
				i_67_ += i_68_ * i_65_ >> 12;
				((Class282_Sub20_Sub37) this).anIntArray9996[i_66_] = (((Class282_Sub20_Sub37) this).anIntArray9996[i_66_ - 1] + i_67_);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_66_][0] = 0;
			for (int i_69_ = 0; i_69_ < 1158222089 * ((Class282_Sub20_Sub37) this).anInt9982; i_69_++) {
				if (i_69_ > 0) {
					int i_70_ = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621;
					int i_71_ = (((Class476.method7931(random, 4096, -878604091) - 2048) * (-464574839 * ((Class282_Sub20_Sub37) this).anInt9989)) >> 12);
					i_70_ += i_71_ * i >> 12;
					((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_66_][i_69_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_66_][i_69_ - 1]) + i_70_;
				}
				((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_66_][i_69_] = (((Class282_Sub20_Sub37) this).anInt9984 * 213461373 > 0 ? 4096 - Class476.method7931(random, (213461373 * ((Class282_Sub20_Sub37) this).anInt9984), 38801553) : 4096);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_66_][1158222089 * ((Class282_Sub20_Sub37) this).anInt9982] = 4096;
		}
		((Class282_Sub20_Sub37) this).anIntArray9996[27880163 * ((Class282_Sub20_Sub37) this).anInt9994] = 4096;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 5:
			((Class282_Sub20_Sub37) this).anInt9986 = class282_sub35.readUnsignedShort() * -1871918517;
			break;
		case 2:
			((Class282_Sub20_Sub37) this).anInt9989 = class282_sub35.readUnsignedShort() * -697684039;
			break;
		case 6:
			((Class282_Sub20_Sub37) this).anInt9991 = class282_sub35.readUnsignedShort() * 884170207;
			break;
		case 4:
			((Class282_Sub20_Sub37) this).anInt9987 = class282_sub35.readUnsignedShort() * 1139997779;
			break;
		case 0:
			((Class282_Sub20_Sub37) this).anInt9982 = class282_sub35.readUnsignedByte() * -1403007687;
			break;
		case 7:
			((Class282_Sub20_Sub37) this).anInt9984 = class282_sub35.readUnsignedShort() * -270313515;
			break;
		case 1:
			((Class282_Sub20_Sub37) this).anInt9994 = class282_sub35.readUnsignedByte() * 798304971;
			break;
		case 3:
			((Class282_Sub20_Sub37) this).anInt9990 = class282_sub35.readUnsignedShort() * 1771166075;
			break;
		}
	}

	void method12321(int i) {
		method15422(-333836282);
	}

	void method15424() {
		Random random = new Random((long) (((Class282_Sub20_Sub37) this).anInt9994 * 27880163));
		((Class282_Sub20_Sub37) this).anInt9993 = (-1331126753 * ((Class282_Sub20_Sub37) this).anInt9991 / 2 * 13720241);
		((Class282_Sub20_Sub37) this).anInt9988 = (4096 / (((Class282_Sub20_Sub37) this).anInt9982 * 1158222089) * -380873461);
		((Class282_Sub20_Sub37) this).anInt9995 = (4096 / (27880163 * ((Class282_Sub20_Sub37) this).anInt9994) * 185306597);
		int i = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621 / 2;
		int i_72_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995 / 2;
		((Class282_Sub20_Sub37) this).anIntArray9996 = new int[27880163 * ((Class282_Sub20_Sub37) this).anInt9994 + 1];
		((Class282_Sub20_Sub37) this).anIntArrayArray9979 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][1 + ((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArrayArray9992 = (new int[((Class282_Sub20_Sub37) this).anInt9994 * 27880163][((Class282_Sub20_Sub37) this).anInt9982 * 1158222089]);
		((Class282_Sub20_Sub37) this).anIntArray9996[0] = 0;
		for (int i_73_ = 0; i_73_ < ((Class282_Sub20_Sub37) this).anInt9994 * 27880163; i_73_++) {
			if (i_73_ > 0) {
				int i_74_ = -727059 * ((Class282_Sub20_Sub37) this).anInt9995;
				int i_75_ = (((Class476.method7931(random, 4096, -2054061812) - 2048) * (((Class282_Sub20_Sub37) this).anInt9990 * -1987699277)) >> 12);
				i_74_ += i_75_ * i_72_ >> 12;
				((Class282_Sub20_Sub37) this).anIntArray9996[i_73_] = (((Class282_Sub20_Sub37) this).anIntArray9996[i_73_ - 1] + i_74_);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_73_][0] = 0;
			for (int i_76_ = 0; i_76_ < 1158222089 * ((Class282_Sub20_Sub37) this).anInt9982; i_76_++) {
				if (i_76_ > 0) {
					int i_77_ = ((Class282_Sub20_Sub37) this).anInt9988 * -733622621;
					int i_78_ = (((Class476.method7931(random, 4096, -1624110852) - 2048) * (-464574839 * ((Class282_Sub20_Sub37) this).anInt9989)) >> 12);
					i_77_ += i_78_ * i >> 12;
					((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_73_][i_76_] = (((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_73_][i_76_ - 1]) + i_77_;
				}
				((Class282_Sub20_Sub37) this).anIntArrayArray9992[i_73_][i_76_] = (((Class282_Sub20_Sub37) this).anInt9984 * 213461373 > 0 ? 4096 - Class476.method7931(random, (213461373 * ((Class282_Sub20_Sub37) this).anInt9984), -731936986) : 4096);
			}
			((Class282_Sub20_Sub37) this).anIntArrayArray9979[i_73_][1158222089 * ((Class282_Sub20_Sub37) this).anInt9982] = 4096;
		}
		((Class282_Sub20_Sub37) this).anIntArray9996[27880163 * ((Class282_Sub20_Sub37) this).anInt9994] = 4096;
	}
}
