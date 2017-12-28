/* Class282_Sub20_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub8 extends Class282_Sub20 {
	int anInt9762 = -478619535;
	static final int anInt9763 = 1;
	static final int anInt9764 = 1;
	static final int anInt9765 = 4;
	static final int anInt9766 = 204;
	int anInt9767 = -447554859;
	int anInt9768 = -482542844;

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -1132312868);
		if (aClass320_7667.aBool3722) {
			int i_0_ = 0;
			for (/**/; i_0_ < Class316.anInt3670 * -402153223; i_0_++) {
				int i_1_ = Class316.anIntArray3672[i_0_];
				int i_2_ = Class316.anIntArray3668[i];
				int i_3_ = ((1985472657 * ((Class282_Sub20_Sub8) this).anInt9762 * i_1_) >> 12);
				int i_4_ = ((520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * i_2_) >> 12);
				int i_5_ = (i_1_ % (4096 / (1985472657 * ((Class282_Sub20_Sub8) this).anInt9762)) * (((Class282_Sub20_Sub8) this).anInt9762 * 1985472657));
				int i_6_ = (520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * (i_2_ % (4096 / (((Class282_Sub20_Sub8) this).anInt9767 * 520457853))));
				if (i_6_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
					for (i_3_ -= i_4_; i_3_ < 0; i_3_ += 4) {
						/* empty */
					}
					for (/**/; i_3_ > 3; i_3_ -= 4) {
						/* empty */
					}
					if (1 != i_3_) {
						is[i_0_] = 0;
						continue;
					}
					if (i_5_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
						is[i_0_] = 0;
						continue;
					}
				}
				if (i_5_ < ((Class282_Sub20_Sub8) this).anInt9768 * 423768051) {
					for (i_3_ -= i_4_; i_3_ < 0; i_3_ += 4) {
						/* empty */
					}
					for (/**/; i_3_ > 3; i_3_ -= 4) {
						/* empty */
					}
					if (i_3_ > 0) {
						is[i_0_] = 0;
						continue;
					}
				}
				is[i_0_] = 4096;
			}
		}
		return is;
	}

	int[] method12319(int i, int i_7_) {
		int[] is = aClass320_7667.method5721(i, 177740780);
		if (aClass320_7667.aBool3722) {
			int i_8_ = 0;
			for (/**/; i_8_ < Class316.anInt3670 * -402153223; i_8_++) {
				int i_9_ = Class316.anIntArray3672[i_8_];
				int i_10_ = Class316.anIntArray3668[i];
				int i_11_ = ((1985472657 * ((Class282_Sub20_Sub8) this).anInt9762 * i_9_) >> 12);
				int i_12_ = ((520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * i_10_) >> 12);
				int i_13_ = (i_9_ % (4096 / (1985472657 * ((Class282_Sub20_Sub8) this).anInt9762)) * (((Class282_Sub20_Sub8) this).anInt9762 * 1985472657));
				int i_14_ = (520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * (i_10_ % (4096 / (((Class282_Sub20_Sub8) this).anInt9767 * 520457853))));
				if (i_14_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
					for (i_11_ -= i_12_; i_11_ < 0; i_11_ += 4) {
						/* empty */
					}
					for (/**/; i_11_ > 3; i_11_ -= 4) {
						/* empty */
					}
					if (1 != i_11_) {
						is[i_8_] = 0;
						continue;
					}
					if (i_13_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
						is[i_8_] = 0;
						continue;
					}
				}
				if (i_13_ < ((Class282_Sub20_Sub8) this).anInt9768 * 423768051) {
					for (i_11_ -= i_12_; i_11_ < 0; i_11_ += 4) {
						/* empty */
					}
					for (/**/; i_11_ > 3; i_11_ -= 4) {
						/* empty */
					}
					if (i_11_ > 0) {
						is[i_8_] = 0;
						continue;
					}
				}
				is[i_8_] = 4096;
			}
		}
		return is;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_15_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub8) this).anInt9762 = class282_sub35.readUnsignedByte() * -478619535;
			break;
		case 1:
			((Class282_Sub20_Sub8) this).anInt9767 = class282_sub35.readUnsignedByte() * -447554859;
			break;
		case 2:
			((Class282_Sub20_Sub8) this).anInt9768 = class282_sub35.readUnsignedShort() * -655032005;
			break;
		}
	}

	public Class282_Sub20_Sub8() {
		super(0, true);
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -790110640);
		if (aClass320_7667.aBool3722) {
			int i_16_ = 0;
			for (/**/; i_16_ < Class316.anInt3670 * -402153223; i_16_++) {
				int i_17_ = Class316.anIntArray3672[i_16_];
				int i_18_ = Class316.anIntArray3668[i];
				int i_19_ = ((1985472657 * ((Class282_Sub20_Sub8) this).anInt9762 * i_17_) >> 12);
				int i_20_ = ((520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * i_18_) >> 12);
				int i_21_ = (i_17_ % (4096 / (1985472657 * ((Class282_Sub20_Sub8) this).anInt9762)) * (((Class282_Sub20_Sub8) this).anInt9762 * 1985472657));
				int i_22_ = (520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * (i_18_ % (4096 / (((Class282_Sub20_Sub8) this).anInt9767 * 520457853))));
				if (i_22_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
					for (i_19_ -= i_20_; i_19_ < 0; i_19_ += 4) {
						/* empty */
					}
					for (/**/; i_19_ > 3; i_19_ -= 4) {
						/* empty */
					}
					if (1 != i_19_) {
						is[i_16_] = 0;
						continue;
					}
					if (i_21_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
						is[i_16_] = 0;
						continue;
					}
				}
				if (i_21_ < ((Class282_Sub20_Sub8) this).anInt9768 * 423768051) {
					for (i_19_ -= i_20_; i_19_ < 0; i_19_ += 4) {
						/* empty */
					}
					for (/**/; i_19_ > 3; i_19_ -= 4) {
						/* empty */
					}
					if (i_19_ > 0) {
						is[i_16_] = 0;
						continue;
					}
				}
				is[i_16_] = 4096;
			}
		}
		return is;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub8) this).anInt9762 = class282_sub35.readUnsignedByte() * -478619535;
			break;
		case 1:
			((Class282_Sub20_Sub8) this).anInt9767 = class282_sub35.readUnsignedByte() * -447554859;
			break;
		case 2:
			((Class282_Sub20_Sub8) this).anInt9768 = class282_sub35.readUnsignedShort() * -655032005;
			break;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub8) this).anInt9762 = class282_sub35.readUnsignedByte() * -478619535;
			break;
		case 1:
			((Class282_Sub20_Sub8) this).anInt9767 = class282_sub35.readUnsignedByte() * -447554859;
			break;
		case 2:
			((Class282_Sub20_Sub8) this).anInt9768 = class282_sub35.readUnsignedShort() * -655032005;
			break;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -271832509);
		if (aClass320_7667.aBool3722) {
			int i_23_ = 0;
			for (/**/; i_23_ < Class316.anInt3670 * -402153223; i_23_++) {
				int i_24_ = Class316.anIntArray3672[i_23_];
				int i_25_ = Class316.anIntArray3668[i];
				int i_26_ = ((1985472657 * ((Class282_Sub20_Sub8) this).anInt9762 * i_24_) >> 12);
				int i_27_ = ((520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * i_25_) >> 12);
				int i_28_ = (i_24_ % (4096 / (1985472657 * ((Class282_Sub20_Sub8) this).anInt9762)) * (((Class282_Sub20_Sub8) this).anInt9762 * 1985472657));
				int i_29_ = (520457853 * ((Class282_Sub20_Sub8) this).anInt9767 * (i_25_ % (4096 / (((Class282_Sub20_Sub8) this).anInt9767 * 520457853))));
				if (i_29_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
					for (i_26_ -= i_27_; i_26_ < 0; i_26_ += 4) {
						/* empty */
					}
					for (/**/; i_26_ > 3; i_26_ -= 4) {
						/* empty */
					}
					if (1 != i_26_) {
						is[i_23_] = 0;
						continue;
					}
					if (i_28_ < 423768051 * ((Class282_Sub20_Sub8) this).anInt9768) {
						is[i_23_] = 0;
						continue;
					}
				}
				if (i_28_ < ((Class282_Sub20_Sub8) this).anInt9768 * 423768051) {
					for (i_26_ -= i_27_; i_26_ < 0; i_26_ += 4) {
						/* empty */
					}
					for (/**/; i_26_ > 3; i_26_ -= 4) {
						/* empty */
					}
					if (i_26_ > 0) {
						is[i_23_] = 0;
						continue;
					}
				}
				is[i_23_] = 4096;
			}
		}
		return is;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub8) this).anInt9762 = class282_sub35.readUnsignedByte() * -478619535;
			break;
		case 1:
			((Class282_Sub20_Sub8) this).anInt9767 = class282_sub35.readUnsignedByte() * -447554859;
			break;
		case 2:
			((Class282_Sub20_Sub8) this).anInt9768 = class282_sub35.readUnsignedShort() * -655032005;
			break;
		}
	}

	public static void method15242(String string, boolean bool, int i, int i_30_, int i_31_) {
		Class215.method3673(string, bool, i, i_30_, null, false, -857703512);
	}
}
