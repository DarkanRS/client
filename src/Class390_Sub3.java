/* Class390_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class390_Sub3 extends Class390 {
	float aFloat9327;
	float aFloat9328;
	static final int anInt9329 = 1;
	static final int anInt9330 = 2;
	static final int anInt9331 = 4;
	Class183[][] aClass183ArrayArray9332;
	float aFloat9333;
	float aFloat9334;
	Class181[][] aClass181ArrayArray9335;
	Class177[][] aClass177ArrayArray9336;
	Class196[][] aClass196ArrayArray9337;
	float aFloat9338;
	float aFloat9339;
	float aFloat9340;
	float aFloat9341;
	float aFloat9342;
	float aFloat9343;
	float aFloat9344;
	int anInt9345;
	float aFloat9346;
	static final int anInt9347 = -1694498816;
	static final int anInt9348 = 64;
	float aFloat9349;
	float aFloat9350;
	float aFloat9351;
	Class178[][] aClass178ArrayArray9352;
	HardwareRenderer aClass505_Sub3_9353;
	float aFloat9354;
	byte[][] aByteArrayArray9355;
	byte[][] aByteArrayArray9356;
	static final boolean aBool9357 = true;
	static final boolean aBool9358 = true;
	static final boolean aBool9359 = false;

	void method14615(int i, int i_0_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_1_, float[] fs_2_, float[] fs_3_, float[] fs_4_, int i_5_) {
		Class177 class177 = ((Class390_Sub3) this).aClass177ArrayArray9336[i][i_0_];
		if (class177 != null) {
			if ((((Class177) class177).aByte2210 & 0x2) == 0) {
				if (i_5_ != 0) {
					if ((((Class177) class177).aByte2210 & 0x4) != 0) {
						if ((i_5_ & 0x1) != 0)
							return;
					} else if ((i_5_ & 0x2) != 0)
						return;
				}
				int i_6_ = i * (anInt4774 * 750971439);
				int i_7_ = i_6_ + anInt4774 * 750971439;
				int i_8_ = i_0_ * (anInt4774 * 750971439);
				int i_9_ = i_8_ + anInt4774 * 750971439;
				float f = 0.0F;
				float f_10_ = 0.0F;
				float f_11_ = 0.0F;
				float f_12_ = 0.0F;
				float f_13_;
				float f_14_;
				float f_15_;
				float f_16_;
				float f_17_;
				float f_18_;
				float f_19_;
				float f_20_;
				float f_21_;
				float f_22_;
				float f_23_;
				float f_24_;
				float f_25_;
				float f_26_;
				float f_27_;
				float f_28_;
				if ((((Class177) class177).aByte2210 & 0x1) != 0 && !bool) {
					int i_29_ = anIntArrayArray4772[i][i_0_];
					float f_30_ = ((Class390_Sub3) this).aFloat9334 * (float) i_29_;
					float f_31_ = ((Class390_Sub3) this).aFloat9346 * (float) i_29_;
					float f_32_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_6_ + f_30_ + (((Class390_Sub3) this).aFloat9349 * (float) i_8_)));
					f_13_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_6_ + f_31_ + (((Class390_Sub3) this).aFloat9350 * (float) i_8_)));
					if (f_32_ < -f_13_)
						return;
					float f_33_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_7_ + f_30_ + (((Class390_Sub3) this).aFloat9349 * (float) i_8_)));
					f_14_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_7_ + f_31_ + (((Class390_Sub3) this).aFloat9350 * (float) i_8_)));
					if (f_33_ < -f_14_)
						return;
					float f_34_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_7_ + f_30_ + (((Class390_Sub3) this).aFloat9349 * (float) i_9_)));
					f_15_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_7_ + f_31_ + (((Class390_Sub3) this).aFloat9350 * (float) i_9_)));
					if (f_34_ < -f_15_)
						return;
					float f_35_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_6_ + f_30_ + (((Class390_Sub3) this).aFloat9349 * (float) i_9_)));
					f_16_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_6_ + f_31_ + (((Class390_Sub3) this).aFloat9350 * (float) i_9_)));
					if (f_35_ < -f_16_)
						return;
					f_17_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_32_ / f_13_);
					f_18_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_33_ / f_14_);
					f_19_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_34_ / f_15_);
					f_20_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_35_ / f_16_);
					if (((Class185) class185).aBool2304) {
						float f_36_ = f_32_ - ((Class185) class185).aFloat2305;
						if (f_36_ > 0.0F) {
							f = f_36_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_36_ = f_33_ - ((Class185) class185).aFloat2305;
						if (f_36_ > 0.0F) {
							f_10_ = f_36_ / ((Class185) class185).aFloat2303;
							if (f_10_ > 1.0F)
								f_10_ = 1.0F;
						}
						f_36_ = f_34_ - ((Class185) class185).aFloat2305;
						if (f_36_ > 0.0F) {
							f_11_ = f_36_ / ((Class185) class185).aFloat2303;
							if (f_11_ > 1.0F)
								f_11_ = 1.0F;
						}
						f_36_ = f_35_ - ((Class185) class185).aFloat2305;
						if (f_36_ > 0.0F) {
							f_12_ = f_36_ / ((Class185) class185).aFloat2303;
							if (f_12_ > 1.0F)
								f_12_ = 1.0F;
						}
					}
					float f_37_ = ((Class390_Sub3) this).aFloat9343 * (float) i_29_;
					float f_38_ = ((Class390_Sub3) this).aFloat9344 * (float) i_29_;
					float f_39_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_6_ + f_37_ + (((Class390_Sub3) this).aFloat9339 * (float) i_8_)));
					f_21_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_39_ / f_13_);
					float f_40_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_6_ + f_38_ + (((Class390_Sub3) this).aFloat9327 * (float) i_8_)));
					f_22_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_40_ / f_13_);
					float f_41_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_7_ + f_37_ + (((Class390_Sub3) this).aFloat9339 * (float) i_8_)));
					f_23_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_41_ / f_14_);
					float f_42_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_7_ + f_38_ + (((Class390_Sub3) this).aFloat9327 * (float) i_8_)));
					f_24_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_42_ / f_14_);
					float f_43_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_7_ + f_37_ + (((Class390_Sub3) this).aFloat9339 * (float) i_9_)));
					f_25_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_43_ / f_15_);
					float f_44_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_7_ + f_38_ + (((Class390_Sub3) this).aFloat9327 * (float) i_9_)));
					f_26_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_44_ / f_15_);
					float f_45_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_6_ + f_37_ + (((Class390_Sub3) this).aFloat9339 * (float) i_9_)));
					f_27_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_45_ / f_16_);
					float f_46_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_6_ + f_38_ + (((Class390_Sub3) this).aFloat9327 * (float) i_9_)));
					f_28_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_46_ / f_16_);
				} else {
					int i_47_ = anIntArrayArray4772[i][i_0_];
					int i_48_ = anIntArrayArray4772[i + 1][i_0_];
					int i_49_ = anIntArrayArray4772[i + 1][i_0_ + 1];
					int i_50_ = anIntArrayArray4772[i][i_0_ + 1];
					float f_51_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_6_ + (((Class390_Sub3) this).aFloat9334 * (float) i_47_) + (((Class390_Sub3) this).aFloat9349 * (float) i_8_)));
					f_13_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_6_ + (((Class390_Sub3) this).aFloat9346 * (float) i_47_) + (((Class390_Sub3) this).aFloat9350 * (float) i_8_)));
					if (f_51_ < -f_13_)
						return;
					float f_52_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_7_ + (((Class390_Sub3) this).aFloat9334 * (float) i_48_) + (((Class390_Sub3) this).aFloat9349 * (float) i_8_)));
					f_14_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_7_ + (((Class390_Sub3) this).aFloat9346 * (float) i_48_) + (((Class390_Sub3) this).aFloat9350 * (float) i_8_)));
					if (f_52_ < -f_14_)
						return;
					float f_53_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_7_ + (((Class390_Sub3) this).aFloat9334 * (float) i_49_) + (((Class390_Sub3) this).aFloat9349 * (float) i_9_)));
					f_15_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_7_ + (((Class390_Sub3) this).aFloat9346 * (float) i_49_) + (((Class390_Sub3) this).aFloat9350 * (float) i_9_)));
					if (f_53_ < -f_15_)
						return;
					float f_54_ = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_6_ + (((Class390_Sub3) this).aFloat9334 * (float) i_50_) + (((Class390_Sub3) this).aFloat9349 * (float) i_9_)));
					f_16_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_6_ + (((Class390_Sub3) this).aFloat9346 * (float) i_50_) + (((Class390_Sub3) this).aFloat9350 * (float) i_9_)));
					if (f_54_ < -f_16_)
						return;
					f_17_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_51_ / f_13_);
					f_18_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_52_ / f_14_);
					f_19_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_53_ / f_15_);
					f_20_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_54_ / f_16_);
					if (bool) {
						float f_55_ = f_51_ - ((Class185) class185).aFloat2305;
						if (f_55_ > 0.0F) {
							f_55_ /= ((Class185) class185).aFloat2303;
							if (f_55_ > 1.0F)
								f_55_ = 1.0F;
							f = f_55_;
							int i_56_ = (int) ((float) (((Class177) class177).aShort2207) * f_55_);
							if (i_56_ > 0)
								i_47_ -= i_56_;
						}
						f_55_ = f_52_ - ((Class185) class185).aFloat2305;
						if (f_55_ > 0.0F) {
							f_55_ /= ((Class185) class185).aFloat2303;
							if (f_55_ > 1.0F)
								f_55_ = 1.0F;
							f_10_ = f_55_;
							int i_57_ = (int) ((float) (((Class177) class177).aShort2202) * f_55_);
							if (i_57_ > 0)
								i_48_ -= i_57_;
						}
						f_55_ = f_53_ - ((Class185) class185).aFloat2305;
						if (f_55_ > 0.0F) {
							f_55_ /= ((Class185) class185).aFloat2303;
							if (f_55_ > 1.0F)
								f_55_ = 1.0F;
							f_11_ = f_55_;
							int i_58_ = (int) ((float) (((Class177) class177).aShort2208) * f_55_);
							if (i_58_ > 0)
								i_49_ -= i_58_;
						}
						f_55_ = f_54_ - ((Class185) class185).aFloat2305;
						if (f_55_ > 0.0F) {
							f_55_ /= ((Class185) class185).aFloat2303;
							if (f_55_ > 1.0F)
								f_55_ = 1.0F;
							f_12_ = f_55_;
							int i_59_ = (int) ((float) (((Class177) class177).aShort2205) * f_55_);
							if (i_59_ > 0)
								i_50_ -= i_59_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_60_ = f_51_ - ((Class185) class185).aFloat2305;
						if (f_60_ > 0.0F) {
							f = f_60_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_60_ = f_52_ - ((Class185) class185).aFloat2305;
						if (f_60_ > 0.0F) {
							f_10_ = f_60_ / ((Class185) class185).aFloat2303;
							if (f_10_ > 1.0F)
								f_10_ = 1.0F;
						}
						f_60_ = f_53_ - ((Class185) class185).aFloat2305;
						if (f_60_ > 0.0F) {
							f_11_ = f_60_ / ((Class185) class185).aFloat2303;
							if (f_11_ > 1.0F)
								f_11_ = 1.0F;
						}
						f_60_ = f_54_ - ((Class185) class185).aFloat2305;
						if (f_60_ > 0.0F) {
							f_12_ = f_60_ / ((Class185) class185).aFloat2303;
							if (f_12_ > 1.0F)
								f_12_ = 1.0F;
						}
					}
					float f_61_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_6_ + (((Class390_Sub3) this).aFloat9343 * (float) i_47_) + (((Class390_Sub3) this).aFloat9339 * (float) i_8_)));
					f_21_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_61_ / f_13_);
					float f_62_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_6_ + (((Class390_Sub3) this).aFloat9344 * (float) i_47_) + (((Class390_Sub3) this).aFloat9327 * (float) i_8_)));
					f_22_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_62_ / f_13_);
					float f_63_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_7_ + (((Class390_Sub3) this).aFloat9343 * (float) i_48_) + (((Class390_Sub3) this).aFloat9339 * (float) i_8_)));
					f_23_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_63_ / f_14_);
					float f_64_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_7_ + (((Class390_Sub3) this).aFloat9344 * (float) i_48_) + (((Class390_Sub3) this).aFloat9327 * (float) i_8_)));
					f_24_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_64_ / f_14_);
					float f_65_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_7_ + (((Class390_Sub3) this).aFloat9343 * (float) i_49_) + (((Class390_Sub3) this).aFloat9339 * (float) i_9_)));
					f_25_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_65_ / f_15_);
					float f_66_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_7_ + (((Class390_Sub3) this).aFloat9344 * (float) i_49_) + (((Class390_Sub3) this).aFloat9327 * (float) i_9_)));
					f_26_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_66_ / f_15_);
					float f_67_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_6_ + (((Class390_Sub3) this).aFloat9343 * (float) i_50_) + (((Class390_Sub3) this).aFloat9339 * (float) i_9_)));
					f_27_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_67_ / f_16_);
					float f_68_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_6_ + (((Class390_Sub3) this).aFloat9344 * (float) i_50_) + (((Class390_Sub3) this).aFloat9327 * (float) i_9_)));
					f_28_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_68_ / f_16_);
				}
				boolean bool_69_ = (((Class177) class177).aShort2212 != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(((Class177) class177).aShort2212, -1752076649).aByte2064));
				float f_70_ = f_10_ + f_11_ + f_12_;
				if (((f_25_ - f_27_) * (f_24_ - f_28_) - (f_26_ - f_28_) * (f_23_ - f_27_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_25_ < 0.0F || f_27_ < 0.0F || f_23_ < 0.0F || f_25_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_27_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_23_ > (float) ((ChoppyItemFixClass) class144).anInt1684);
					if (f_70_ < 3.0F) {
						if (f_70_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_71_ = -16777216;
								if (bool_69_)
									i_71_ = -1694498816;
								class144.method2424(true, true, false, f_26_, f_28_, f_24_, f_25_, f_27_, f_23_, f_19_, f_20_, f_18_, f_15_, f_16_, f_14_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_71_ | (((Class177) class177).anInt2211 & 0xffffff), i_71_ | (((Class177) class177).anInt2206 & 0xffffff), i_71_ | (((Class177) class177).anInt2204 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f_11_ * 255.0F, f_12_ * 255.0F, f_10_ * 255.0F, ((Class177) class177).aShort2212);
							} else {
								if (bool_69_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_26_, f_28_, f_24_, f_25_, f_27_, f_23_, f_19_, f_20_, f_18_, (Class323.method5773(((Class177) class177).anInt2211, ((int) (f_11_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) 0)), (Class323.method5773(((Class177) class177).anInt2206, ((int) (f_12_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) 3)),
										(Class323.method5773(((Class177) class177).anInt2204, ((int) (f_10_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -46)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_72_ = -16777216;
							if (bool_69_)
								i_72_ = -1694498816;
							class144.method2424(true, true, false, f_26_, f_28_, f_24_, f_25_, f_27_, f_23_, f_19_, f_20_, f_18_, f_15_, f_16_, f_14_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_72_ | (((Class177) class177).anInt2211 & 0xffffff), i_72_ | (((Class177) class177).anInt2206 & 0xffffff), i_72_ | (((Class177) class177).anInt2204 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_69_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_26_, f_28_, f_24_, f_25_, f_27_, f_23_, f_19_, f_20_, f_18_, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_26_, f_28_, f_24_, f_25_, f_27_, f_23_, f_19_, f_20_, f_18_, (((Class185) class185).anInt2307 * 1402414887));
				}
				f_70_ = f + f_10_ + f_12_;
				if (((f_21_ - f_23_) * (f_28_ - f_24_) - (f_22_ - f_24_) * (f_27_ - f_23_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_21_ < 0.0F || f_23_ < 0.0F || f_27_ < 0.0F || f_21_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_23_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_27_ > (float) ((ChoppyItemFixClass) class144).anInt1684);
					if (f_70_ < 3.0F) {
						if (bool_69_)
							((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
						if (f_70_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_73_ = -16777216;
								if (bool_69_)
									i_73_ = -1694498816;
								class144.method2424(true, true, false, f_22_, f_24_, f_28_, f_21_, f_23_, f_27_, f_17_, f_18_, f_20_, f_13_, f_14_, f_16_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_73_ | (((Class177) class177).anInt2209 & 0xffffff), i_73_ | (((Class177) class177).anInt2204 & 0xffffff), i_73_ | (((Class177) class177).anInt2206 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f * 255.0F, f_10_ * 255.0F, f_12_ * 255.0F, ((Class177) class177).aShort2212);
							} else {
								if (bool_69_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_22_, f_24_, f_28_, f_21_, f_23_, f_27_, f_17_, f_18_, f_20_, (Class323.method5773(((Class177) class177).anInt2209, ((int) (f * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -15)), (Class323.method5773(((Class177) class177).anInt2204, ((int) (f_10_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -67)),
										(Class323.method5773(((Class177) class177).anInt2206, ((int) (f_12_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -21)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_74_ = -16777216;
							if (bool_69_)
								i_74_ = -1694498816;
							class144.method2424(true, true, false, f_22_, f_24_, f_28_, f_21_, f_23_, f_27_, f_17_, f_18_, f_20_, f_13_, f_14_, f_16_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_74_ | (((Class177) class177).anInt2209 & 0xffffff), i_74_ | (((Class177) class177).anInt2204 & 0xffffff), i_74_ | (((Class177) class177).anInt2206 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_69_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_22_, f_24_, f_28_, f_21_, f_23_, f_27_, f_17_, f_18_, f_20_, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_22_, f_24_, f_28_, f_21_, f_23_, f_27_, f_17_, f_18_, f_20_, (((Class185) class185).anInt2307 * 1402414887));
				}
			}
		} else {
			Class196 class196 = ((Class390_Sub3) this).aClass196ArrayArray9337[i][i_0_];
			if (class196 != null) {
				if (i_5_ != 0) {
					if ((((Class196) class196).aByte2414 & 0x4) != 0) {
						if ((i_5_ & 0x1) != 0)
							return;
					} else if ((i_5_ & 0x2) != 0)
						return;
				}
				for (int i_75_ = 0; i_75_ < ((Class196) class196).aShort2421; i_75_++) {
					int i_76_ = (((Class196) class196).aShortArray2416[i_75_] + (i << anInt4775 * 1856651955));
					int i_77_ = ((Class196) class196).aShortArray2417[i_75_];
					int i_78_ = (((Class196) class196).aShortArray2418[i_75_] + (i_0_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + (((Class390_Sub3) this).aFloat9341 * (float) i_76_ + (((Class390_Sub3) this).aFloat9334 * (float) i_77_) + (((Class390_Sub3) this).aFloat9349 * (float) i_78_)));
					float f_79_ = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_76_ + (((Class390_Sub3) this).aFloat9346 * (float) i_77_) + (((Class390_Sub3) this).aFloat9350 * (float) i_78_)));
					if (f < -f_79_)
						return;
					float f_80_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_79_);
					fs_4_[i_75_] = 0.0F;
					if (bool) {
						float f_81_ = f - ((Class185) class185).aFloat2305;
						if (f_81_ > 0.0F) {
							f_81_ /= ((Class185) class185).aFloat2303;
							if (f_81_ > 1.0F)
								f_81_ = 1.0F;
							fs_4_[i_75_] = f_81_;
							int i_82_ = (int) ((float) (((Class196) class196).aShortArray2419[i_75_]) * f_81_);
							if (i_82_ > 0)
								i_77_ -= i_82_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_83_ = f - ((Class185) class185).aFloat2305;
						if (f_83_ > 0.0F) {
							fs_4_[i_75_] = f_83_ / ((Class185) class185).aFloat2303;
							if (fs_4_[i_75_] > 1.0F)
								fs_4_[i_75_] = 1.0F;
						}
					}
					float f_84_ = (((Class390_Sub3) this).aFloat9351 + (((Class390_Sub3) this).aFloat9338 * (float) i_76_ + (((Class390_Sub3) this).aFloat9343 * (float) i_77_) + (((Class390_Sub3) this).aFloat9339 * (float) i_78_)));
					float f_85_ = (((Class390_Sub3) this).aFloat9328 + (((Class390_Sub3) this).aFloat9340 * (float) i_76_ + (((Class390_Sub3) this).aFloat9344 * (float) i_77_) + (((Class390_Sub3) this).aFloat9327 * (float) i_78_)));
					fs[i_75_] = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_84_ / f_79_);
					fs_1_[i_75_] = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_85_ / f_79_);
					fs_2_[i_75_] = f_80_;
					fs_3_[i_75_] = f_79_;
				}
				if (((Class196) class196).aShortArray2413 != null) {
					for (int i_86_ = 0; i_86_ < ((Class196) class196).aShort2415; i_86_++) {
						int i_87_ = i_86_ * 3;
						int i_88_ = i_87_ + 1;
						int i_89_ = i_88_ + 1;
						float f = fs[i_87_];
						float f_90_ = fs[i_88_];
						float f_91_ = fs[i_89_];
						float f_92_ = fs_1_[i_87_];
						float f_93_ = fs_1_[i_88_];
						float f_94_ = fs_1_[i_89_];
						float f_95_ = fs_4_[i_87_] + fs_4_[i_88_] + fs_4_[i_89_];
						if (((f - f_90_) * (f_94_ - f_93_) - (f_92_ - f_93_) * (f_91_ - f_90_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_90_ < 0.0F || f_91_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_90_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_91_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							short i_96_ = ((Class196) class196).aShortArray2413[i_86_];
							if (f_95_ < 3.0F) {
								if (f_95_ > 0.0F) {
									if (i_96_ != -1) {
										int i_97_ = -16777216;
										if (i_96_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_96_, -2016686782).aByte2064)))
											i_97_ = -1694498816;
										class144.method2424(true, true, false, f_92_, f_93_, f_94_, f, f_90_, f_91_, fs_2_[i_87_], fs_2_[i_88_], fs_2_[i_89_], fs_3_[i_87_], fs_3_[i_88_], fs_3_[i_89_], ((float) (((Class196) class196).aShortArray2416[i_87_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_88_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_89_]) / (float) (anInt4774 * 750971439)),
												((float) (((Class196) class196).aShortArray2418[i_87_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_88_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_89_]) / (float) (anInt4774 * 750971439)), i_97_ | ((((Class196) class196).anIntArray2420[i_87_]) & 0xffffff), i_97_ | ((((Class196) class196).anIntArray2420[i_88_]) & 0xffffff),
												i_97_ | ((((Class196) class196).anIntArray2420[i_89_]) & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), fs_4_[i_87_] * 255.0F, fs_4_[i_88_] * 255.0F, fs_4_[i_89_] * 255.0F, i_96_);
									} else if (((((Class196) class196).anIntArray2420[i_87_]) & 0xffffff) != 0) {
										if (i_96_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_96_, -1847341948).aByte2064)))
											((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
										class144.method2425(true, true, false, f_92_, f_93_, f_94_, f, f_90_, f_91_, fs_2_[i_87_], fs_2_[i_88_], fs_2_[i_89_], (Class323.method5773((((Class196) class196).anIntArray2420[i_87_]), (((int) (fs_4_[i_87_] * 255.0F) << 24) | (((Class185) class185).anInt2307) * 1402414887), (byte) -88)),
												(Class323.method5773((((Class196) class196).anIntArray2420[i_88_]), (((int) (fs_4_[i_88_] * 255.0F) << 24) | (((Class185) class185).anInt2307) * 1402414887), (byte) -78)), (Class323.method5773((((Class196) class196).anIntArray2420[i_89_]), (((int) (fs_4_[i_89_] * 255.0F) << 24) | (((Class185) class185).anInt2307) * 1402414887), (byte) -114)));
										((ChoppyItemFixClass) class144).anInt1674 = 0;
									}
								} else if (i_96_ != -1) {
									int i_98_ = -16777216;
									if (i_96_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_96_, -1852245514).aByte2064))
										i_98_ = -1694498816;
									class144.method2424(true, true, false, f_92_, f_93_, f_94_, f, f_90_, f_91_, fs_2_[i_87_], fs_2_[i_88_], fs_2_[i_89_], fs_3_[i_87_], fs_3_[i_88_], fs_3_[i_89_], ((float) (((Class196) class196).aShortArray2416[i_87_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_88_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_89_]) / (float) (anInt4774 * 750971439)),
											((float) (((Class196) class196).aShortArray2418[i_87_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_88_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_89_]) / (float) (anInt4774 * 750971439)), i_98_ | ((((Class196) class196).anIntArray2420[i_87_]) & 0xffffff), i_98_ | ((((Class196) class196).anIntArray2420[i_88_]) & 0xffffff),
											i_98_ | ((((Class196) class196).anIntArray2420[i_89_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_96_);
								} else if (((((Class196) class196).anIntArray2420[i_87_]) & 0xffffff) != 0) {
									if (i_96_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_96_, -1936792090).aByte2064))
										((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
									class144.method2425(true, true, false, f_92_, f_93_, f_94_, f, f_90_, f_91_, fs_2_[i_87_], fs_2_[i_88_], fs_2_[i_89_], (((Class196) class196).anIntArray2420[i_87_]), (((Class196) class196).anIntArray2420[i_88_]), (((Class196) class196).anIntArray2420[i_89_]));
									((ChoppyItemFixClass) class144).anInt1674 = 0;
								}
							} else
								class144.method2428(true, true, false, f_92_, f_93_, f_94_, f, f_90_, f_91_, fs_2_[i_87_], fs_2_[i_88_], fs_2_[i_89_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				} else {
					for (int i_99_ = 0; i_99_ < ((Class196) class196).aShort2415; i_99_++) {
						int i_100_ = i_99_ * 3;
						int i_101_ = i_100_ + 1;
						int i_102_ = i_101_ + 1;
						float f = fs[i_100_];
						float f_103_ = fs[i_101_];
						float f_104_ = fs[i_102_];
						float f_105_ = fs_1_[i_100_];
						float f_106_ = fs_1_[i_101_];
						float f_107_ = fs_1_[i_102_];
						float f_108_ = fs_4_[i_100_] + fs_4_[i_101_] + fs_4_[i_102_];
						if (((f - f_103_) * (f_107_ - f_106_) - (f_105_ - f_106_) * (f_104_ - f_103_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_103_ < 0.0F || f_104_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_103_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_104_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							if (f_108_ < 3.0F) {
								if (f_108_ > 0.0F) {
									if (((((Class196) class196).anIntArray2420[i_100_]) & 0xffffff) != 0)
										class144.method2425(true, true, false, f_105_, f_106_, f_107_, f, f_103_, f_104_, fs_2_[i_100_], fs_2_[i_101_], fs_2_[i_102_], (Class302.method5364((((Class196) class196).anIntArray2420[i_100_]), (((Class185) class185).anInt2307 * 1402414887), fs_4_[i_100_] * 255.0F, 833509259)), (Class302.method5364((((Class196) class196).anIntArray2420[i_101_]), (((Class185) class185).anInt2307 * 1402414887), fs_4_[i_101_] * 255.0F, 833509259)),
												(Class302.method5364((((Class196) class196).anIntArray2420[i_102_]), (((Class185) class185).anInt2307 * 1402414887), fs_4_[i_102_] * 255.0F, 833509259)));
								} else if (((((Class196) class196).anIntArray2420[i_100_]) & 0xffffff) != 0)
									class144.method2425(true, true, false, f_105_, f_106_, f_107_, f, f_103_, f_104_, fs_2_[i_100_], fs_2_[i_101_], fs_2_[i_102_], (((Class196) class196).anIntArray2420[i_100_]), (((Class196) class196).anIntArray2420[i_101_]), (((Class196) class196).anIntArray2420[i_102_]));
							} else
								class144.method2428(true, true, false, f_105_, f_106_, f_107_, f, f_103_, f_104_, fs_2_[i_100_], fs_2_[i_101_], fs_2_[i_102_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				}
			}
		}
	}

	public void LA(int i, int i_109_, int i_110_) {
		if (((Class390_Sub3) this).aByteArrayArray9356[i][i_109_] < i_110_)
			((Class390_Sub3) this).aByteArrayArray9356[i][i_109_] = (byte) i_110_;
	}

	public void method6708(int i, int i_111_, int[] is, int[] is_112_, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, int[] is_121_, Class90 class90, boolean bool) {
		if (((Class390_Sub3) this).aClass178ArrayArray9352 == null) {
			((Class390_Sub3) this).aClass178ArrayArray9352 = (new Class178[anInt4776 * -1843860823][anInt4773 * 1826078169]);
			((Class390_Sub3) this).aClass183ArrayArray9332 = (new Class183[anInt4776 * -1843860823][anInt4773 * 1826078169]);
		} else if (((Class390_Sub3) this).aClass177ArrayArray9336 != null || ((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			throw new IllegalStateException();
		boolean bool_122_ = false;
		if (is_118_.length == 2 && is_115_.length == 2 && (is_118_[0] == is_118_[1] || is_120_[0] != -1 && is_120_[0] == is_120_[1])) {
			bool_122_ = true;
			for (int i_123_ = 1; i_123_ < 2; i_123_++) {
				int i_124_ = is[is_115_[i_123_]];
				int i_125_ = is_113_[is_115_[i_123_]];
				if (i_124_ != 0 && i_124_ != anInt4774 * 750971439 || i_125_ != 0 && i_125_ != anInt4774 * 750971439) {
					bool_122_ = false;
					break;
				}
			}
		}
		if (!bool_122_) {
			Class183 class183 = new Class183();
			short i_126_ = (short) is.length;
			int i_127_ = (short) is_118_.length;
			((Class183) class183).aShort2265 = i_126_;
			((Class183) class183).aShortArray2274 = new short[i_126_];
			((Class183) class183).aShortArray2267 = new short[i_126_];
			((Class183) class183).aShortArray2268 = new short[i_126_];
			((Class183) class183).aShortArray2264 = new short[i_126_];
			for (int i_128_ = 0; i_128_ < i_126_; i_128_++) {
				int i_129_ = is[i_128_];
				int i_130_ = is_113_[i_128_];
				if (i_129_ == 0 && i_130_ == 0)
					((Class183) class183).aShortArray2274[i_128_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_]));
				else if (i_129_ == 0 && i_130_ == anInt4774 * 750971439)
					((Class183) class183).aShortArray2274[i_128_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_ + 1]));
				else if (i_129_ == anInt4774 * 750971439 && i_130_ == anInt4774 * 750971439)
					((Class183) class183).aShortArray2274[i_128_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_ + 1]));
				else if (i_129_ == anInt4774 * 750971439 && i_130_ == 0)
					((Class183) class183).aShortArray2274[i_128_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_]));
				else {
					int i_131_ = (((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_])) * (anInt4774 * 750971439 - i_129_) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_])) * i_129_);
					int i_132_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_ + 1])) * (anInt4774 * 750971439 - i_129_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_ + 1])) * i_129_);
					((Class183) class183).aShortArray2274[i_128_] = (short) ((i_131_ * (anInt4774 * 750971439 - i_130_) + i_132_ * i_130_) >> anInt4775 * -581663386);
				}
				int i_133_ = (i << anInt4775 * 1856651955) + i_129_;
				int i_134_ = (i_111_ << anInt4775 * 1856651955) + i_130_;
				((Class183) class183).aShortArray2267[i_128_] = (short) i_129_;
				((Class183) class183).aShortArray2264[i_128_] = (short) i_130_;
				((Class183) class183).aShortArray2268[i_128_] = (short) (method6709(i_133_, i_134_, -1373621150) + (is_112_ != null ? is_112_[i_128_] : 0));
				if (((Class183) class183).aShortArray2274[i_128_] < 2)
					((Class183) class183).aShortArray2274[i_128_] = (short) 2;
			}
			boolean bool_135_ = false;
			int i_136_ = 0;
			for (int i_137_ = 0; i_137_ < i_127_; i_137_++) {
				if (is_118_[i_137_] >= 0 || is_119_ != null && is_119_[i_137_] >= 0)
					i_136_++;
				int i_138_ = is_120_[i_137_];
				if (i_138_ != -1) {
					Class169 class169 = ((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_138_, -1855515623);
					if (!class169.aBool2056) {
						bool_135_ = true;
						if (method14620(class169.aByte2064) || class169.aByte2081 != 0 || class169.aByte2090 != 0)
							((Class183) class183).aByte2276 |= 0x4;
					}
				}
			}
			((Class183) class183).anIntArray2272 = new int[i_136_];
			if (is_119_ != null)
				((Class183) class183).anIntArray2277 = new int[i_136_];
			((Class183) class183).aShortArray2271 = new short[i_136_];
			((Class183) class183).aShortArray2266 = new short[i_136_];
			((Class183) class183).aShortArray2273 = new short[i_136_];
			if (bool_135_) {
				((Class183) class183).aShortArray2270 = new short[i_136_];
				((Class183) class183).aShortArray2275 = new short[i_136_];
			}
			for (int i_139_ = 0; i_139_ < i_127_; i_139_++) {
				if (is_118_[i_139_] >= 0 || is_119_ != null && is_119_[i_139_] >= 0) {
					if (is_118_[i_139_] >= 0)
						((Class183) class183).anIntArray2272[((Class183) class183).aShort2269] = Class372.method6362(is_118_[i_139_], 1089931848);
					else
						((Class183) class183).anIntArray2272[((Class183) class183).aShort2269] = -1;
					if (is_119_ != null) {
						if (is_119_[i_139_] != -1)
							((Class183) class183).anIntArray2277[((Class183) class183).aShort2269] = Class372.method6362(is_119_[i_139_], 587615367);
						else
							((Class183) class183).anIntArray2277[((Class183) class183).aShort2269] = -1;
					}
					((Class183) class183).aShortArray2271[((Class183) class183).aShort2269] = (short) is_115_[i_139_];
					((Class183) class183).aShortArray2266[((Class183) class183).aShort2269] = (short) is_116_[i_139_];
					((Class183) class183).aShortArray2273[((Class183) class183).aShort2269] = (short) is_117_[i_139_];
					if (bool_135_) {
						if (is_120_[i_139_] != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(is_120_[i_139_], -1965632762).aBool2056)) {
							((Class183) class183).aShortArray2270[((Class183) class183).aShort2269] = (short) is_120_[i_139_];
							((Class183) class183).aShortArray2275[((Class183) class183).aShort2269] = (short) is_121_[i_139_];
						} else
							((Class183) class183).aShortArray2270[((Class183) class183).aShort2269] = (short) -1;
					}
					((Class183) class183).aShort2269++;
				}
			}
			((Class390_Sub3) this).aClass183ArrayArray9332[i][i_111_] = class183;
		} else if (is_118_[0] >= 0 || is_119_ != null && is_119_[0] >= 0) {
			Class178 class178 = new Class178();
			int i_140_ = is_118_[0];
			int i_141_ = is_120_[0];
			if (is_119_ != null) {
				((Class178) class178).anInt2213 = (Class282_Sub20_Sub2.method15076(Class372.method6362(is_119_[0], 866250443), (((Class390_Sub3) this).aByteArrayArray9355[i][i_111_] - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_])), -1962172044));
				if (i_140_ == -1)
					((Class178) class178).aByte2219 |= 0x2;
			}
			if ((anIntArrayArray4772[i][i_111_] == anIntArrayArray4772[i + 1][i_111_]) && (anIntArrayArray4772[i][i_111_] == anIntArrayArray4772[i + 1][i_111_ + 1]) && (anIntArrayArray4772[i][i_111_] == anIntArrayArray4772[i][i_111_ + 1]))
				((Class178) class178).aByte2219 |= 0x1;
			Class169 class169 = null;
			if (i_141_ != -1)
				class169 = ((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_141_, -2054544452);
			if (class169 != null && (((Class178) class178).aByte2219 & 0x2) == 0 && !class169.aBool2056) {
				((Class178) class178).aShort2214 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_]));
				((Class178) class178).aShort2217 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_]));
				((Class178) class178).aShort2216 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_ + 1]));
				((Class178) class178).aShort2218 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_ + 1]));
				((Class178) class178).aShort2215 = (short) i_141_;
				if (method14620(class169.aByte2064) || class169.aByte2081 != 0 || class169.aByte2090 != 0)
					((Class178) class178).aByte2219 |= 0x4;
			} else {
				short i_142_ = Class372.method6362(i_140_, 737732806);
				((Class178) class178).aShort2214 = (short) (Class282_Sub20_Sub2.method15076(i_142_, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_])), -1738485590));
				((Class178) class178).aShort2217 = (short) (Class282_Sub20_Sub2.method15076(i_142_, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_])), -1271688896));
				((Class178) class178).aShort2216 = (short) (Class282_Sub20_Sub2.method15076(i_142_, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_111_ + 1])), -1529002876));
				((Class178) class178).aShort2218 = (short) (Class282_Sub20_Sub2.method15076(i_142_, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_111_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_111_ + 1])), -1592668079));
				((Class178) class178).aShort2215 = (short) -1;
			}
			((Class390_Sub3) this).aClass178ArrayArray9352[i][i_111_] = class178;
		}
	}

	public void method6707(int i, int i_143_, int[] is, int[] is_144_, int[] is_145_, int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_, int[] is_150_, Class90 class90, boolean bool) {
		boolean bool_151_ = (((Class390_Sub3) this).anInt9345 & 0x20) == 0;
		if (((Class390_Sub3) this).aClass177ArrayArray9336 == null && !bool_151_) {
			((Class390_Sub3) this).aClass177ArrayArray9336 = (new Class177[anInt4776 * -1843860823][anInt4773 * 1826078169]);
			((Class390_Sub3) this).aClass196ArrayArray9337 = (new Class196[anInt4776 * -1843860823][anInt4773 * 1826078169]);
		} else if (((Class390_Sub3) this).aClass181ArrayArray9335 == null && bool_151_)
			((Class390_Sub3) this).aClass181ArrayArray9335 = (new Class181[anInt4776 * -1843860823][anInt4773 * 1826078169]);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_152_ = 0; i_152_ < is_147_.length; i_152_++) {
				if (is_147_[i_152_] == -1)
					is_147_[i_152_] = 0;
				else
					is_147_[i_152_] = (Class335.anIntArray3916[(Class372.method6362(is_147_[i_152_], 1119030500) & 0xffff)]) << 8 | 0xff;
			}
			if (is_148_ != null) {
				for (int i_153_ = 0; i_153_ < is_148_.length; i_153_++) {
					if (is_148_[i_153_] == -1)
						is_148_[i_153_] = 0;
					else
						is_148_[i_153_] = ((Class335.anIntArray3916[Class372.method6362(is_148_[i_153_], 515492296) & 0xffff]) << 8 | 0xff);
				}
			}
			if (bool_151_) {
				Class181 class181 = new Class181();
				((Class181) class181).aShort2248 = (short) is.length;
				((Class181) class181).aShort2250 = (short) (is.length / 3);
				((Class181) class181).aShortArray2249 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2255 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2247 = new short[((Class181) class181).aShort2248];
				((Class181) class181).anIntArray2251 = new int[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2253 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2254 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aByteArray2256 = new byte[((Class181) class181).aShort2248];
				if (is_146_ != null)
					((Class181) class181).aShortArray2252 = new short[((Class181) class181).aShort2248];
				for (int i_154_ = 0; i_154_ < ((Class181) class181).aShort2248; i_154_++) {
					int i_155_ = is[i_154_];
					int i_156_ = is_145_[i_154_];
					boolean bool_157_ = false;
					int i_158_;
					if (i_155_ == 0 && i_156_ == 0)
						i_158_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_]));
					else if (i_155_ == 0 && i_156_ == anInt4774 * 750971439)
						i_158_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1]));
					else if (i_155_ == anInt4774 * 750971439 && i_156_ == anInt4774 * 750971439)
						i_158_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1]));
					else if (i_155_ == anInt4774 * 750971439 && i_156_ == 0)
						i_158_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_]));
					else {
						int i_159_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_])) * (anInt4774 * 750971439 - i_155_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_])) * i_155_);
						int i_160_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1])) * (anInt4774 * 750971439 - i_155_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1])) * i_155_);
						i_158_ = (i_159_ * (anInt4774 * 750971439 - i_156_) + i_160_ * i_156_) >> anInt4775 * -581663386;
					}
					int i_161_ = (i << anInt4775 * 1856651955) + i_155_;
					int i_162_ = (i_143_ << anInt4775 * 1856651955) + i_156_;
					((Class181) class181).aShortArray2249[i_154_] = (short) i_155_;
					((Class181) class181).aShortArray2247[i_154_] = (short) i_156_;
					((Class181) class181).aShortArray2255[i_154_] = (short) (method6709(i_161_, i_162_, 1805237344) + (is_144_ != null ? is_144_[i_154_] : 0));
					if (i_158_ < 0)
						i_158_ = 0;
					if (is_147_[i_154_] == 0) {
						((Class181) class181).anIntArray2251[i_154_] = 0;
						if (is_148_ != null)
							((Class181) class181).aByteArray2256[i_154_] = (byte) i_158_;
					} else {
						int i_163_ = 0;
						if (is_146_ != null) {
							int i_164_ = (((Class181) class181).aShortArray2252[i_154_] = (short) is_146_[i_154_]);
							if (class90.anInt945 * 973144081 != 0) {
								i_163_ = 255 * i_164_ / (class90.anInt945 * 973144081);
								if (i_163_ < 0)
									i_163_ = 0;
								else if (i_163_ > 255)
									i_163_ = 255;
							}
						}
						int i_165_ = -16777216;
						if (is_149_[i_154_] != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(is_149_[i_154_], -2116666161).aByte2064))
							i_165_ = -1694498816;
						((Class181) class181).anIntArray2251[i_154_] = i_165_ | (Class8_Sub3.method14337(method14616(is_147_[i_154_] >> 8, i_158_), class90.anInt946 * 1152775735, i_163_, 1385119855));
						if (is_148_ != null)
							((Class181) class181).aByteArray2256[i_154_] = (byte) i_158_;
					}
					((Class181) class181).aShortArray2253[i_154_] = (short) is_149_[i_154_];
					((Class181) class181).aShortArray2254[i_154_] = (short) is_150_[i_154_];
				}
				if (is_148_ != null)
					((Class181) class181).anIntArray2257 = new int[((Class181) class181).aShort2250];
				for (int i_166_ = 0; i_166_ < ((Class181) class181).aShort2250; i_166_++) {
					int i_167_ = i_166_ * 3;
					if (is_148_ != null && is_148_[i_167_] != 0)
						((Class181) class181).anIntArray2257[i_166_] = ~0xffffff | is_148_[i_167_] >> 8;
				}
				((Class390_Sub3) this).aClass181ArrayArray9335[i][i_143_] = class181;
			} else {
				boolean bool_168_ = true;
				int i_169_ = -1;
				int i_170_ = -1;
				int i_171_ = -1;
				int i_172_ = -1;
				if (is.length == 6) {
					for (int i_173_ = 0; i_173_ < 6; i_173_++) {
						if (is[i_173_] == 0 && is_145_[i_173_] == 0) {
							if (i_169_ != -1 && is_147_[i_169_] != is_147_[i_173_]) {
								bool_168_ = false;
								break;
							}
							i_169_ = i_173_;
						} else if (is[i_173_] == anInt4774 * 750971439 && is_145_[i_173_] == 0) {
							if (i_170_ != -1 && is_147_[i_170_] != is_147_[i_173_]) {
								bool_168_ = false;
								break;
							}
							i_170_ = i_173_;
						} else if (is[i_173_] == anInt4774 * 750971439 && (is_145_[i_173_] == anInt4774 * 750971439)) {
							if (i_171_ != -1 && is_147_[i_171_] != is_147_[i_173_]) {
								bool_168_ = false;
								break;
							}
							i_171_ = i_173_;
						} else if (is[i_173_] == 0 && (is_145_[i_173_] == anInt4774 * 750971439)) {
							if (i_172_ != -1 && is_147_[i_172_] != is_147_[i_173_]) {
								bool_168_ = false;
								break;
							}
							i_172_ = i_173_;
						}
					}
					if (i_169_ == -1 || i_170_ == -1 || i_171_ == -1 || i_172_ == -1)
						bool_168_ = false;
					if (bool_168_) {
						if (is_144_ != null) {
							for (int i_174_ = 0; i_174_ < 4; i_174_++) {
								if (is_144_[i_174_] != 0) {
									bool_168_ = false;
									break;
								}
							}
						}
						if (bool_168_) {
							for (int i_175_ = 1; i_175_ < 4; i_175_++) {
								if (is[i_175_] != is[0] && (is[i_175_] != is[0] + anInt4774 * 750971439) && (is[i_175_] != is[0] - anInt4774 * 750971439)) {
									bool_168_ = false;
									break;
								}
								if (is_145_[i_175_] != is_145_[0] && (is_145_[i_175_] != is_145_[0] + anInt4774 * 750971439) && (is_145_[i_175_] != (is_145_[0] - anInt4774 * 750971439))) {
									bool_168_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_168_ = false;
				if (bool_168_) {
					Class177 class177 = new Class177();
					int i_176_ = is_147_[0];
					int i_177_ = is_149_[0];
					if (is_148_ != null) {
						((Class177) class177).anInt2203 = is_148_[0] >> 8;
						if (i_176_ == 0)
							((Class177) class177).aByte2210 |= 0x2;
					} else if (i_176_ == 0)
						return;
					if ((anIntArrayArray4772[i][i_143_] == anIntArrayArray4772[i + 1][i_143_]) && (anIntArrayArray4772[i][i_143_] == anIntArrayArray4772[i + 1][i_143_ + 1]) && (anIntArrayArray4772[i][i_143_] == anIntArrayArray4772[i][i_143_ + 1]))
						((Class177) class177).aByte2210 |= 0x1;
					if (i_177_ != -1 && (((Class177) class177).aByte2210 & 0x2) == 0 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_177_, -2126168194).aBool2056)) {
						int i_178_;
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_178_ = 255 * is_146_[i_169_] / (class90.anInt945 * 973144081);
							if (i_178_ < 0)
								i_178_ = 0;
							else if (i_178_ > 255)
								i_178_ = 255;
						} else
							i_178_ = 0;
						((Class177) class177).anInt2209 = (Class8_Sub3.method14337(method14616(is_147_[i_169_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_]))), class90.anInt946 * 1152775735, i_178_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2209 |= (255 - ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_])) << 25);
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_178_ = 255 * is_146_[i_170_] / (class90.anInt945 * 973144081);
							if (i_178_ < 0)
								i_178_ = 0;
							else if (i_178_ > 255)
								i_178_ = 255;
						} else
							i_178_ = 0;
						((Class177) class177).anInt2204 = (Class8_Sub3.method14337(method14616(is_147_[i_170_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_]))), class90.anInt946 * 1152775735, i_178_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2204 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_])) << 25;
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_178_ = 255 * is_146_[i_171_] / (class90.anInt945 * 973144081);
							if (i_178_ < 0)
								i_178_ = 0;
							else if (i_178_ > 255)
								i_178_ = 255;
						} else
							i_178_ = 0;
						((Class177) class177).anInt2211 = (Class8_Sub3.method14337(method14616(is_147_[i_171_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1]))), class90.anInt946 * 1152775735, i_178_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2211 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1])) << 25;
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_178_ = 255 * is_146_[i_172_] / (class90.anInt945 * 973144081);
							if (i_178_ < 0)
								i_178_ = 0;
							else if (i_178_ > 255)
								i_178_ = 255;
						} else
							i_178_ = 0;
						((Class177) class177).anInt2206 = (Class8_Sub3.method14337(method14616(is_147_[i_172_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1]))), class90.anInt946 * 1152775735, i_178_, 1385119855));
						((Class177) class177).aShort2212 = (short) i_177_;
					} else {
						int i_179_;
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_179_ = 255 * is_146_[i_169_] / (class90.anInt945 * 973144081);
							if (i_179_ < 0)
								i_179_ = 0;
							else if (i_179_ > 255)
								i_179_ = 255;
						} else
							i_179_ = 0;
						((Class177) class177).anInt2209 = (Class8_Sub3.method14337(method14616(is_147_[i_169_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_]))), class90.anInt946 * 1152775735, i_179_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2209 |= (255 - ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_])) << 25);
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_179_ = 255 * is_146_[i_170_] / (class90.anInt945 * 973144081);
							if (i_179_ < 0)
								i_179_ = 0;
							else if (i_179_ > 255)
								i_179_ = 255;
						} else
							i_179_ = 0;
						((Class177) class177).anInt2204 = (Class8_Sub3.method14337(method14616(is_147_[i_170_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_]))), class90.anInt946 * 1152775735, i_179_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2204 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_])) << 25;
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_179_ = 255 * is_146_[i_171_] / (class90.anInt945 * 973144081);
							if (i_179_ < 0)
								i_179_ = 0;
							else if (i_179_ > 255)
								i_179_ = 255;
						} else
							i_179_ = 0;
						((Class177) class177).anInt2211 = (Class8_Sub3.method14337(method14616(is_147_[i_171_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1]))), class90.anInt946 * 1152775735, i_179_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2211 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1])) << 25;
						if (is_146_ != null && class90.anInt945 * 973144081 != 0) {
							i_179_ = 255 * is_146_[i_172_] / (class90.anInt945 * 973144081);
							if (i_179_ < 0)
								i_179_ = 0;
							else if (i_179_ > 255)
								i_179_ = 255;
						} else
							i_179_ = 0;
						((Class177) class177).anInt2206 = (Class8_Sub3.method14337(method14616(is_147_[i_172_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1]))), class90.anInt946 * 1152775735, i_179_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2206 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1])) << 25;
						((Class177) class177).aShort2212 = (short) -1;
					}
					if (is_146_ != null) {
						((Class177) class177).aShort2208 = (short) is_146_[i_171_];
						((Class177) class177).aShort2205 = (short) is_146_[i_172_];
						((Class177) class177).aShort2202 = (short) is_146_[i_170_];
						((Class177) class177).aShort2207 = (short) is_146_[i_169_];
					}
					((Class390_Sub3) this).aClass177ArrayArray9336[i][i_143_] = class177;
				} else {
					Class196 class196 = new Class196();
					((Class196) class196).aShort2421 = (short) is.length;
					((Class196) class196).aShort2415 = (short) (is.length / 3);
					((Class196) class196).aShortArray2416 = new short[((Class196) class196).aShort2421];
					((Class196) class196).aShortArray2417 = new short[((Class196) class196).aShort2421];
					((Class196) class196).aShortArray2418 = new short[((Class196) class196).aShort2421];
					((Class196) class196).anIntArray2420 = new int[((Class196) class196).aShort2421];
					if (is_146_ != null)
						((Class196) class196).aShortArray2419 = new short[((Class196) class196).aShort2421];
					for (int i_180_ = 0; i_180_ < ((Class196) class196).aShort2421; i_180_++) {
						int i_181_ = is[i_180_];
						int i_182_ = is_145_[i_180_];
						boolean bool_183_ = false;
						int i_184_;
						if (i_181_ == 0 && i_182_ == 0)
							i_184_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_]));
						else if (i_181_ == 0 && i_182_ == anInt4774 * 750971439)
							i_184_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1]));
						else if (i_181_ == anInt4774 * 750971439 && i_182_ == anInt4774 * 750971439)
							i_184_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1]));
						else if (i_181_ == anInt4774 * 750971439 && i_182_ == 0)
							i_184_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_]));
						else {
							int i_185_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_])) * (anInt4774 * 750971439 - i_181_)) + (((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_])) * i_181_));
							int i_186_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_143_ + 1])) * (anInt4774 * 750971439 - i_181_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_143_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_143_ + 1])) * i_181_);
							i_184_ = (i_185_ * (anInt4774 * 750971439 - i_182_) + i_186_ * i_182_ >> anInt4775 * -581663386);
						}
						int i_187_ = (i << anInt4775 * 1856651955) + i_181_;
						int i_188_ = (i_143_ << anInt4775 * 1856651955) + i_182_;
						((Class196) class196).aShortArray2416[i_180_] = (short) i_181_;
						((Class196) class196).aShortArray2418[i_180_] = (short) i_182_;
						((Class196) class196).aShortArray2417[i_180_] = (short) (method6709(i_187_, i_188_, -1651390978) + (is_144_ != null ? is_144_[i_180_] : 0));
						if (i_184_ < 0)
							i_184_ = 0;
						if (is_147_[i_180_] == 0) {
							if (is_148_ != null)
								((Class196) class196).anIntArray2420[i_180_] = i_184_ << 25;
							else
								((Class196) class196).anIntArray2420[i_180_] = 0;
						} else {
							int i_189_ = 0;
							if (is_146_ != null) {
								int i_190_ = (((Class196) class196).aShortArray2419[i_180_] = (short) is_146_[i_180_]);
								if (class90.anInt945 * 973144081 != 0) {
									i_189_ = 255 * i_190_ / (class90.anInt945 * 973144081);
									if (i_189_ < 0)
										i_189_ = 0;
									else if (i_189_ > 255)
										i_189_ = 255;
								}
							}
							((Class196) class196).anIntArray2420[i_180_] = (Class8_Sub3.method14337(method14616(is_147_[i_180_] >> 8, i_184_), class90.anInt946 * 1152775735, i_189_, 1385119855));
							if (is_148_ != null)
								((Class196) class196).anIntArray2420[i_180_] |= i_184_ << 25;
						}
					}
					boolean bool_191_ = false;
					for (int i_192_ = 0; i_192_ < ((Class196) class196).aShort2415; i_192_++) {
						if (is_149_[i_192_ * 3] != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(is_149_[i_192_ * 3], -2061377529).aBool2056))
							bool_191_ = true;
					}
					if (is_148_ != null)
						((Class196) class196).anIntArray2423 = new int[((Class196) class196).aShort2415];
					if (bool_191_) {
						((Class196) class196).aShortArray2413 = new short[((Class196) class196).aShort2415];
						((Class196) class196).aShortArray2422 = new short[((Class196) class196).aShort2415];
					}
					for (int i_193_ = 0; i_193_ < ((Class196) class196).aShort2415; i_193_++) {
						int i_194_ = i_193_ * 3;
						if (is_148_ != null && is_148_[i_194_] != 0)
							((Class196) class196).anIntArray2423[i_193_] = is_148_[i_194_] >> 8;
						if (bool_191_) {
							int i_195_ = i_194_ + 1;
							int i_196_ = i_195_ + 1;
							boolean bool_197_ = false;
							boolean bool_198_ = true;
							int i_199_ = is_149_[i_194_];
							if (i_199_ == -1 || (((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -2113458019).aBool2056))
								bool_198_ = false;
							else
								bool_197_ = true;
							i_199_ = is_149_[i_195_];
							if (i_199_ == -1 || (((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -2138478760).aBool2056))
								bool_198_ = false;
							else
								bool_197_ = true;
							i_199_ = is_149_[i_196_];
							if (i_199_ == -1 || (((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -1795000720).aBool2056))
								bool_198_ = false;
							else
								bool_197_ = true;
							if (bool_198_) {
								((Class196) class196).aShortArray2413[i_193_] = (short) i_199_;
								((Class196) class196).aShortArray2422[i_193_] = (short) is_150_[i_194_];
							} else {
								if (bool_197_) {
									i_199_ = is_149_[i_194_];
									if (i_199_ != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -2059619146).aBool2056))
										((Class196) class196).anIntArray2420[i_194_] = (Class335.anIntArray3916[(Class372.method6362((((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -1772200789).aShort2073) & 0xffff, 1039237710)) & 0xffff]);
									i_199_ = is_149_[i_195_];
									if (i_199_ != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -1826671319).aBool2056))
										((Class196) class196).anIntArray2420[i_195_] = (Class335.anIntArray3916[(Class372.method6362((((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -2021150704).aShort2073) & 0xffff, 197018698)) & 0xffff]);
									i_199_ = is_149_[i_196_];
									if (i_199_ != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -1942303448).aBool2056))
										((Class196) class196).anIntArray2420[i_196_] = (Class335.anIntArray3916[(Class372.method6362((((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_199_, -1884645239).aShort2073) & 0xffff, 2122916828)) & 0xffff]);
								}
								((Class196) class196).aShortArray2413[i_193_] = (short) -1;
							}
						}
					}
					((Class390_Sub3) this).aClass196ArrayArray9337[i][i_143_] = class196;
				}
			}
		}
	}

	static int method14616(int i, int i_200_) {
		int i_201_ = (i & 0xff0000) * i_200_ >> 23;
		if (i_201_ < 2)
			i_201_ = 2;
		else if (i_201_ > 253)
			i_201_ = 253;
		int i_202_ = (i & 0xff00) * i_200_ >> 15;
		if (i_202_ < 2)
			i_202_ = 2;
		else if (i_202_ > 253)
			i_202_ = 253;
		int i_203_ = (i & 0xff) * i_200_ >> 7;
		if (i_203_ < 2)
			i_203_ = 2;
		else if (i_203_ > 253)
			i_203_ = 253;
		return i_201_ << 16 | i_202_ << 8 | i_203_;
	}

	public void SA() {
		((Class390_Sub3) this).aByteArrayArray9355 = null;
		((Class390_Sub3) this).aByteArrayArray9356 = null;
	}

	void method14617(int i, int i_204_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_205_, float[] fs_206_, float[] fs_207_, float[] fs_208_, int i_209_) {
		Class177 class177 = ((Class390_Sub3) this).aClass177ArrayArray9336[i][i_204_];
		if (class177 != null) {
			if ((((Class177) class177).aByte2210 & 0x2) == 0) {
				if (i_209_ != 0) {
					if ((((Class177) class177).aByte2210 & 0x4) != 0) {
						if ((i_209_ & 0x1) != 0)
							return;
					} else if ((i_209_ & 0x2) != 0)
						return;
				}
				int i_210_ = i * (anInt4774 * 750971439);
				int i_211_ = i_210_ + anInt4774 * 750971439;
				int i_212_ = i_204_ * (anInt4774 * 750971439);
				int i_213_ = i_212_ + anInt4774 * 750971439;
				float f = 0.0F;
				float f_214_ = 0.0F;
				float f_215_ = 0.0F;
				float f_216_ = 0.0F;
				float f_217_;
				float f_218_;
				float f_219_;
				float f_220_;
				float f_221_;
				float f_222_;
				float f_223_;
				float f_224_;
				float f_225_;
				float f_226_;
				float f_227_;
				float f_228_;
				float f_229_;
				float f_230_;
				float f_231_;
				float f_232_;
				if ((((Class177) class177).aByte2210 & 0x1) != 0 && !bool) {
					int i_233_ = anIntArrayArray4772[i][i_204_];
					float f_234_ = ((Class390_Sub3) this).aFloat9334 * (float) i_233_;
					float f_235_ = ((Class390_Sub3) this).aFloat9346 * (float) i_233_;
					float f_236_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_210_) + f_234_ + (((Class390_Sub3) this).aFloat9349 * (float) i_212_)));
					f_217_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_210_) + f_235_ + (((Class390_Sub3) this).aFloat9350 * (float) i_212_)));
					if (f_236_ < -f_217_)
						return;
					float f_237_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_211_) + f_234_ + (((Class390_Sub3) this).aFloat9349 * (float) i_212_)));
					f_218_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_211_) + f_235_ + (((Class390_Sub3) this).aFloat9350 * (float) i_212_)));
					if (f_237_ < -f_218_)
						return;
					float f_238_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_211_) + f_234_ + (((Class390_Sub3) this).aFloat9349 * (float) i_213_)));
					f_219_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_211_) + f_235_ + (((Class390_Sub3) this).aFloat9350 * (float) i_213_)));
					if (f_238_ < -f_219_)
						return;
					float f_239_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_210_) + f_234_ + (((Class390_Sub3) this).aFloat9349 * (float) i_213_)));
					f_220_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_210_) + f_235_ + (((Class390_Sub3) this).aFloat9350 * (float) i_213_)));
					if (f_239_ < -f_220_)
						return;
					f_221_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_236_ / f_217_));
					f_222_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_237_ / f_218_));
					f_223_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_238_ / f_219_));
					f_224_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_239_ / f_220_));
					if (((Class185) class185).aBool2304) {
						float f_240_ = f_236_ - ((Class185) class185).aFloat2305;
						if (f_240_ > 0.0F) {
							f = f_240_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_240_ = f_237_ - ((Class185) class185).aFloat2305;
						if (f_240_ > 0.0F) {
							f_214_ = f_240_ / ((Class185) class185).aFloat2303;
							if (f_214_ > 1.0F)
								f_214_ = 1.0F;
						}
						f_240_ = f_238_ - ((Class185) class185).aFloat2305;
						if (f_240_ > 0.0F) {
							f_215_ = f_240_ / ((Class185) class185).aFloat2303;
							if (f_215_ > 1.0F)
								f_215_ = 1.0F;
						}
						f_240_ = f_239_ - ((Class185) class185).aFloat2305;
						if (f_240_ > 0.0F) {
							f_216_ = f_240_ / ((Class185) class185).aFloat2303;
							if (f_216_ > 1.0F)
								f_216_ = 1.0F;
						}
					}
					float f_241_ = ((Class390_Sub3) this).aFloat9343 * (float) i_233_;
					float f_242_ = ((Class390_Sub3) this).aFloat9344 * (float) i_233_;
					float f_243_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_210_) + f_241_ + (((Class390_Sub3) this).aFloat9339 * (float) i_212_)));
					f_225_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_243_ / f_217_));
					float f_244_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_210_) + f_242_ + (((Class390_Sub3) this).aFloat9327 * (float) i_212_)));
					f_226_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_244_ / f_217_));
					float f_245_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_211_) + f_241_ + (((Class390_Sub3) this).aFloat9339 * (float) i_212_)));
					f_227_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_245_ / f_218_));
					float f_246_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_211_) + f_242_ + (((Class390_Sub3) this).aFloat9327 * (float) i_212_)));
					f_228_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_246_ / f_218_));
					float f_247_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_211_) + f_241_ + (((Class390_Sub3) this).aFloat9339 * (float) i_213_)));
					f_229_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_247_ / f_219_));
					float f_248_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_211_) + f_242_ + (((Class390_Sub3) this).aFloat9327 * (float) i_213_)));
					f_230_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_248_ / f_219_));
					float f_249_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_210_) + f_241_ + (((Class390_Sub3) this).aFloat9339 * (float) i_213_)));
					f_231_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_249_ / f_220_));
					float f_250_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_210_) + f_242_ + (((Class390_Sub3) this).aFloat9327 * (float) i_213_)));
					f_232_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_250_ / f_220_));
				} else {
					int i_251_ = anIntArrayArray4772[i][i_204_];
					int i_252_ = anIntArrayArray4772[i + 1][i_204_];
					int i_253_ = anIntArrayArray4772[i + 1][i_204_ + 1];
					int i_254_ = anIntArrayArray4772[i][i_204_ + 1];
					float f_255_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_210_) + (((Class390_Sub3) this).aFloat9334 * (float) i_251_) + (((Class390_Sub3) this).aFloat9349 * (float) i_212_)));
					f_217_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_210_) + (((Class390_Sub3) this).aFloat9346 * (float) i_251_) + (((Class390_Sub3) this).aFloat9350 * (float) i_212_)));
					if (f_255_ < -f_217_)
						return;
					float f_256_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_211_) + (((Class390_Sub3) this).aFloat9334 * (float) i_252_) + (((Class390_Sub3) this).aFloat9349 * (float) i_212_)));
					f_218_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_211_) + (((Class390_Sub3) this).aFloat9346 * (float) i_252_) + (((Class390_Sub3) this).aFloat9350 * (float) i_212_)));
					if (f_256_ < -f_218_)
						return;
					float f_257_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_211_) + (((Class390_Sub3) this).aFloat9334 * (float) i_253_) + (((Class390_Sub3) this).aFloat9349 * (float) i_213_)));
					f_219_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_211_) + (((Class390_Sub3) this).aFloat9346 * (float) i_253_) + (((Class390_Sub3) this).aFloat9350 * (float) i_213_)));
					if (f_257_ < -f_219_)
						return;
					float f_258_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_210_) + (((Class390_Sub3) this).aFloat9334 * (float) i_254_) + (((Class390_Sub3) this).aFloat9349 * (float) i_213_)));
					f_220_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_210_) + (((Class390_Sub3) this).aFloat9346 * (float) i_254_) + (((Class390_Sub3) this).aFloat9350 * (float) i_213_)));
					if (f_258_ < -f_220_)
						return;
					f_221_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_255_ / f_217_));
					f_222_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_256_ / f_218_));
					f_223_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_257_ / f_219_));
					f_224_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_258_ / f_220_));
					if (bool) {
						float f_259_ = f_255_ - ((Class185) class185).aFloat2305;
						if (f_259_ > 0.0F) {
							f_259_ /= ((Class185) class185).aFloat2303;
							if (f_259_ > 1.0F)
								f_259_ = 1.0F;
							f = f_259_;
							int i_260_ = (int) ((float) (((Class177) class177).aShort2207) * f_259_);
							if (i_260_ > 0)
								i_251_ -= i_260_;
						}
						f_259_ = f_256_ - ((Class185) class185).aFloat2305;
						if (f_259_ > 0.0F) {
							f_259_ /= ((Class185) class185).aFloat2303;
							if (f_259_ > 1.0F)
								f_259_ = 1.0F;
							f_214_ = f_259_;
							int i_261_ = (int) ((float) (((Class177) class177).aShort2202) * f_259_);
							if (i_261_ > 0)
								i_252_ -= i_261_;
						}
						f_259_ = f_257_ - ((Class185) class185).aFloat2305;
						if (f_259_ > 0.0F) {
							f_259_ /= ((Class185) class185).aFloat2303;
							if (f_259_ > 1.0F)
								f_259_ = 1.0F;
							f_215_ = f_259_;
							int i_262_ = (int) ((float) (((Class177) class177).aShort2208) * f_259_);
							if (i_262_ > 0)
								i_253_ -= i_262_;
						}
						f_259_ = f_258_ - ((Class185) class185).aFloat2305;
						if (f_259_ > 0.0F) {
							f_259_ /= ((Class185) class185).aFloat2303;
							if (f_259_ > 1.0F)
								f_259_ = 1.0F;
							f_216_ = f_259_;
							int i_263_ = (int) ((float) (((Class177) class177).aShort2205) * f_259_);
							if (i_263_ > 0)
								i_254_ -= i_263_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_264_ = f_255_ - ((Class185) class185).aFloat2305;
						if (f_264_ > 0.0F) {
							f = f_264_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_264_ = f_256_ - ((Class185) class185).aFloat2305;
						if (f_264_ > 0.0F) {
							f_214_ = f_264_ / ((Class185) class185).aFloat2303;
							if (f_214_ > 1.0F)
								f_214_ = 1.0F;
						}
						f_264_ = f_257_ - ((Class185) class185).aFloat2305;
						if (f_264_ > 0.0F) {
							f_215_ = f_264_ / ((Class185) class185).aFloat2303;
							if (f_215_ > 1.0F)
								f_215_ = 1.0F;
						}
						f_264_ = f_258_ - ((Class185) class185).aFloat2305;
						if (f_264_ > 0.0F) {
							f_216_ = f_264_ / ((Class185) class185).aFloat2303;
							if (f_216_ > 1.0F)
								f_216_ = 1.0F;
						}
					}
					float f_265_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_210_) + (((Class390_Sub3) this).aFloat9343 * (float) i_251_) + (((Class390_Sub3) this).aFloat9339 * (float) i_212_)));
					f_225_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_265_ / f_217_));
					float f_266_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_210_) + (((Class390_Sub3) this).aFloat9344 * (float) i_251_) + (((Class390_Sub3) this).aFloat9327 * (float) i_212_)));
					f_226_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_266_ / f_217_));
					float f_267_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_211_) + (((Class390_Sub3) this).aFloat9343 * (float) i_252_) + (((Class390_Sub3) this).aFloat9339 * (float) i_212_)));
					f_227_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_267_ / f_218_));
					float f_268_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_211_) + (((Class390_Sub3) this).aFloat9344 * (float) i_252_) + (((Class390_Sub3) this).aFloat9327 * (float) i_212_)));
					f_228_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_268_ / f_218_));
					float f_269_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_211_) + (((Class390_Sub3) this).aFloat9343 * (float) i_253_) + (((Class390_Sub3) this).aFloat9339 * (float) i_213_)));
					f_229_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_269_ / f_219_));
					float f_270_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_211_) + (((Class390_Sub3) this).aFloat9344 * (float) i_253_) + (((Class390_Sub3) this).aFloat9327 * (float) i_213_)));
					f_230_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_270_ / f_219_));
					float f_271_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_210_) + (((Class390_Sub3) this).aFloat9343 * (float) i_254_) + (((Class390_Sub3) this).aFloat9339 * (float) i_213_)));
					f_231_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_271_ / f_220_));
					float f_272_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_210_) + (((Class390_Sub3) this).aFloat9344 * (float) i_254_) + (((Class390_Sub3) this).aFloat9327 * (float) i_213_)));
					f_232_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_272_ / f_220_));
				}
				boolean bool_273_ = (((Class177) class177).aShort2212 != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(((Class177) class177).aShort2212, -1802866112).aByte2064));
				float f_274_ = f_214_ + f_215_ + f_216_;
				if (((f_229_ - f_231_) * (f_228_ - f_232_) - (f_230_ - f_232_) * (f_227_ - f_231_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_229_ < 0.0F || f_231_ < 0.0F || f_227_ < 0.0F || f_229_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_231_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_227_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_274_ < 3.0F) {
						if (f_274_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_275_ = -16777216;
								if (bool_273_)
									i_275_ = -1694498816;
								class144.method2424(true, true, false, f_230_, f_232_, f_228_, f_229_, f_231_, f_227_, f_223_, f_224_, f_222_, f_219_, f_220_, f_218_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_275_ | (((Class177) class177).anInt2211 & 0xffffff), i_275_ | (((Class177) class177).anInt2206 & 0xffffff), i_275_ | (((Class177) class177).anInt2204 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f_215_ * 255.0F, f_216_ * 255.0F, f_214_ * 255.0F,
										((Class177) class177).aShort2212);
							} else {
								if (bool_273_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_230_, f_232_, f_228_, f_229_, f_231_, f_227_, f_223_, f_224_, f_222_, (Class323.method5773(((Class177) class177).anInt2211, ((int) (f_215_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -102)), (Class323.method5773(((Class177) class177).anInt2206, ((int) (f_216_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -111)),
										(Class323.method5773(((Class177) class177).anInt2204, ((int) (f_214_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -88)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_276_ = -16777216;
							if (bool_273_)
								i_276_ = -1694498816;
							class144.method2424(true, true, false, f_230_, f_232_, f_228_, f_229_, f_231_, f_227_, f_223_, f_224_, f_222_, f_219_, f_220_, f_218_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_276_ | (((Class177) class177).anInt2211 & 0xffffff), i_276_ | (((Class177) class177).anInt2206 & 0xffffff), i_276_ | (((Class177) class177).anInt2204 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_273_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_230_, f_232_, f_228_, f_229_, f_231_, f_227_, f_223_, f_224_, f_222_, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_230_, f_232_, f_228_, f_229_, f_231_, f_227_, f_223_, f_224_, f_222_, (((Class185) class185).anInt2307 * 1402414887));
				}
				f_274_ = f + f_214_ + f_216_;
				if (((f_225_ - f_227_) * (f_232_ - f_228_) - (f_226_ - f_228_) * (f_231_ - f_227_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_225_ < 0.0F || f_227_ < 0.0F || f_231_ < 0.0F || f_225_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_227_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_231_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_274_ < 3.0F) {
						if (bool_273_)
							((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
						if (f_274_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_277_ = -16777216;
								if (bool_273_)
									i_277_ = -1694498816;
								class144.method2424(true, true, false, f_226_, f_228_, f_232_, f_225_, f_227_, f_231_, f_221_, f_222_, f_224_, f_217_, f_218_, f_220_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_277_ | (((Class177) class177).anInt2209 & 0xffffff), i_277_ | (((Class177) class177).anInt2204 & 0xffffff), i_277_ | (((Class177) class177).anInt2206 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f * 255.0F, f_214_ * 255.0F, f_216_ * 255.0F, ((Class177) class177).aShort2212);
							} else {
								if (bool_273_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_226_, f_228_, f_232_, f_225_, f_227_, f_231_, f_221_, f_222_, f_224_, (Class323.method5773(((Class177) class177).anInt2209, ((int) (f * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -124)), (Class323.method5773(((Class177) class177).anInt2204, ((int) (f_214_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -78)),
										(Class323.method5773(((Class177) class177).anInt2206, ((int) (f_216_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -113)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_278_ = -16777216;
							if (bool_273_)
								i_278_ = -1694498816;
							class144.method2424(true, true, false, f_226_, f_228_, f_232_, f_225_, f_227_, f_231_, f_221_, f_222_, f_224_, f_217_, f_218_, f_220_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_278_ | (((Class177) class177).anInt2209 & 0xffffff), i_278_ | (((Class177) class177).anInt2204 & 0xffffff), i_278_ | (((Class177) class177).anInt2206 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_273_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_226_, f_228_, f_232_, f_225_, f_227_, f_231_, f_221_, f_222_, f_224_, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_226_, f_228_, f_232_, f_225_, f_227_, f_231_, f_221_, f_222_, f_224_, (((Class185) class185).anInt2307 * 1402414887));
				}
			}
		} else {
			Class196 class196 = ((Class390_Sub3) this).aClass196ArrayArray9337[i][i_204_];
			if (class196 != null) {
				if (i_209_ != 0) {
					if ((((Class196) class196).aByte2414 & 0x4) != 0) {
						if ((i_209_ & 0x1) != 0)
							return;
					} else if ((i_209_ & 0x2) != 0)
						return;
				}
				for (int i_279_ = 0; i_279_ < ((Class196) class196).aShort2421; i_279_++) {
					int i_280_ = (((Class196) class196).aShortArray2416[i_279_] + (i << anInt4775 * 1856651955));
					int i_281_ = ((Class196) class196).aShortArray2417[i_279_];
					int i_282_ = (((Class196) class196).aShortArray2418[i_279_] + (i_204_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_280_) + (((Class390_Sub3) this).aFloat9334 * (float) i_281_) + (((Class390_Sub3) this).aFloat9349 * (float) i_282_)));
					float f_283_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_280_) + (((Class390_Sub3) this).aFloat9346 * (float) i_281_) + (((Class390_Sub3) this).aFloat9350 * (float) i_282_)));
					if (f < -f_283_)
						return;
					float f_284_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_283_);
					fs_208_[i_279_] = 0.0F;
					if (bool) {
						float f_285_ = f - ((Class185) class185).aFloat2305;
						if (f_285_ > 0.0F) {
							f_285_ /= ((Class185) class185).aFloat2303;
							if (f_285_ > 1.0F)
								f_285_ = 1.0F;
							fs_208_[i_279_] = f_285_;
							int i_286_ = (int) ((float) (((Class196) class196).aShortArray2419[i_279_]) * f_285_);
							if (i_286_ > 0)
								i_281_ -= i_286_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_287_ = f - ((Class185) class185).aFloat2305;
						if (f_287_ > 0.0F) {
							fs_208_[i_279_] = f_287_ / ((Class185) class185).aFloat2303;
							if (fs_208_[i_279_] > 1.0F)
								fs_208_[i_279_] = 1.0F;
						}
					}
					float f_288_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_280_) + (((Class390_Sub3) this).aFloat9343 * (float) i_281_) + (((Class390_Sub3) this).aFloat9339 * (float) i_282_)));
					float f_289_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_280_) + (((Class390_Sub3) this).aFloat9344 * (float) i_281_) + (((Class390_Sub3) this).aFloat9327 * (float) i_282_)));
					fs[i_279_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_288_ / f_283_));
					fs_205_[i_279_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_289_ / f_283_));
					fs_206_[i_279_] = f_284_;
					fs_207_[i_279_] = f_283_;
				}
				if (((Class196) class196).aShortArray2413 != null) {
					for (int i_290_ = 0; i_290_ < ((Class196) class196).aShort2415; i_290_++) {
						int i_291_ = i_290_ * 3;
						int i_292_ = i_291_ + 1;
						int i_293_ = i_292_ + 1;
						float f = fs[i_291_];
						float f_294_ = fs[i_292_];
						float f_295_ = fs[i_293_];
						float f_296_ = fs_205_[i_291_];
						float f_297_ = fs_205_[i_292_];
						float f_298_ = fs_205_[i_293_];
						float f_299_ = (fs_208_[i_291_] + fs_208_[i_292_] + fs_208_[i_293_]);
						if (((f - f_294_) * (f_298_ - f_297_) - (f_296_ - f_297_) * (f_295_ - f_294_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_294_ < 0.0F || f_295_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_294_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_295_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							short i_300_ = (((Class196) class196).aShortArray2413[i_290_]);
							if (f_299_ < 3.0F) {
								if (f_299_ > 0.0F) {
									if (i_300_ != -1) {
										int i_301_ = -16777216;
										if (i_300_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_300_, -1814071616).aByte2064)))
											i_301_ = -1694498816;
										class144.method2424(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_206_[i_291_], fs_206_[i_292_], fs_206_[i_293_], fs_207_[i_291_], fs_207_[i_292_], fs_207_[i_293_], ((float) (((Class196) class196).aShortArray2416[i_291_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_292_]) / (float) (anInt4774 * 750971439)),
												((float) (((Class196) class196).aShortArray2416[i_293_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_291_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_292_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_293_]) / (float) (anInt4774 * 750971439)), i_301_ | (((Class196) class196).anIntArray2420[i_291_]) & 0xffffff,
												i_301_ | (((Class196) class196).anIntArray2420[i_292_]) & 0xffffff, i_301_ | (((Class196) class196).anIntArray2420[i_293_]) & 0xffffff, (((Class185) class185).anInt2307 * 1402414887), fs_208_[i_291_] * 255.0F, fs_208_[i_292_] * 255.0F, fs_208_[i_293_] * 255.0F, i_300_);
									} else if (((((Class196) class196).anIntArray2420[i_291_]) & 0xffffff) != 0) {
										if (i_300_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_300_, -1754108994).aByte2064)))
											((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
										class144.method2425(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_206_[i_291_], fs_206_[i_292_], fs_206_[i_293_], (Class323.method5773((((Class196) class196).anIntArray2420[i_291_]), ((int) (fs_208_[i_291_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -96)),
												(Class323.method5773((((Class196) class196).anIntArray2420[i_292_]), ((int) (fs_208_[i_292_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -18)), (Class323.method5773((((Class196) class196).anIntArray2420[i_293_]), ((int) (fs_208_[i_293_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -1)));
										((ChoppyItemFixClass) class144).anInt1674 = 0;
									}
								} else if (i_300_ != -1) {
									int i_302_ = -16777216;
									if (i_300_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_300_, -1763683877).aByte2064))
										i_302_ = -1694498816;
									class144.method2424(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_206_[i_291_], fs_206_[i_292_], fs_206_[i_293_], fs_207_[i_291_], fs_207_[i_292_], fs_207_[i_293_], ((float) (((Class196) class196).aShortArray2416[i_291_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_292_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_293_]) / (float) (anInt4774 * 750971439)),
											((float) (((Class196) class196).aShortArray2418[i_291_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_292_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_293_]) / (float) (anInt4774 * 750971439)), i_302_ | ((((Class196) class196).anIntArray2420[i_291_]) & 0xffffff), i_302_ | ((((Class196) class196).anIntArray2420[i_292_]) & 0xffffff),
											i_302_ | ((((Class196) class196).anIntArray2420[i_293_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_300_);
								} else if (((((Class196) class196).anIntArray2420[i_291_]) & 0xffffff) != 0) {
									if (i_300_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_300_, -1995458323).aByte2064))
										((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
									class144.method2425(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_206_[i_291_], fs_206_[i_292_], fs_206_[i_293_], (((Class196) class196).anIntArray2420[i_291_]), (((Class196) class196).anIntArray2420[i_292_]), (((Class196) class196).anIntArray2420[i_293_]));
									((ChoppyItemFixClass) class144).anInt1674 = 0;
								}
							} else
								class144.method2428(true, true, false, f_296_, f_297_, f_298_, f, f_294_, f_295_, fs_206_[i_291_], fs_206_[i_292_], fs_206_[i_293_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				} else {
					for (int i_303_ = 0; i_303_ < ((Class196) class196).aShort2415; i_303_++) {
						int i_304_ = i_303_ * 3;
						int i_305_ = i_304_ + 1;
						int i_306_ = i_305_ + 1;
						float f = fs[i_304_];
						float f_307_ = fs[i_305_];
						float f_308_ = fs[i_306_];
						float f_309_ = fs_205_[i_304_];
						float f_310_ = fs_205_[i_305_];
						float f_311_ = fs_205_[i_306_];
						float f_312_ = (fs_208_[i_304_] + fs_208_[i_305_] + fs_208_[i_306_]);
						if (((f - f_307_) * (f_311_ - f_310_) - (f_309_ - f_310_) * (f_308_ - f_307_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_307_ < 0.0F || f_308_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_307_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_308_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							if (f_312_ < 3.0F) {
								if (f_312_ > 0.0F) {
									if (((((Class196) class196).anIntArray2420[i_304_]) & 0xffffff) != 0)
										class144.method2425(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_206_[i_304_], fs_206_[i_305_], fs_206_[i_306_], (Class302.method5364((((Class196) class196).anIntArray2420[i_304_]), (((Class185) class185).anInt2307 * 1402414887), fs_208_[i_304_] * 255.0F, 833509259)), (Class302.method5364((((Class196) class196).anIntArray2420[i_305_]), (((Class185) class185).anInt2307 * 1402414887), fs_208_[i_305_] * 255.0F, 833509259)),
												(Class302.method5364((((Class196) class196).anIntArray2420[i_306_]), (((Class185) class185).anInt2307 * 1402414887), fs_208_[i_306_] * 255.0F, 833509259)));
								} else if (((((Class196) class196).anIntArray2420[i_304_]) & 0xffffff) != 0)
									class144.method2425(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_206_[i_304_], fs_206_[i_305_], fs_206_[i_306_], (((Class196) class196).anIntArray2420[i_304_]), (((Class196) class196).anIntArray2420[i_305_]), (((Class196) class196).anIntArray2420[i_306_]));
							} else
								class144.method2428(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_206_[i_304_], fs_206_[i_305_], fs_206_[i_306_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				}
			}
		}
	}

	public void z(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_313_, int i_314_, int i_315_, boolean bool) {
		/* empty */
	}

	public void method6717(int i, int i_316_, int i_317_, boolean[][] bools, boolean bool, int i_318_) {
		if ((((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).anIntArray8979) == null || (((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).aFloatArray9010) == null)
			throw new IllegalStateException("");
		Matrix44Arr class384 = (((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).aClass384_8996);
		((Class390_Sub3) this).aFloat9338 = class384.buf[0];
		((Class390_Sub3) this).aFloat9340 = class384.buf[1];
		((Class390_Sub3) this).aFloat9341 = class384.buf[2];
		((Class390_Sub3) this).aFloat9342 = class384.buf[3];
		((Class390_Sub3) this).aFloat9343 = class384.buf[4];
		((Class390_Sub3) this).aFloat9344 = class384.buf[5];
		((Class390_Sub3) this).aFloat9334 = class384.buf[6];
		((Class390_Sub3) this).aFloat9346 = class384.buf[7];
		((Class390_Sub3) this).aFloat9339 = class384.buf[8];
		((Class390_Sub3) this).aFloat9327 = class384.buf[9];
		((Class390_Sub3) this).aFloat9349 = class384.buf[10];
		((Class390_Sub3) this).aFloat9350 = class384.buf[11];
		((Class390_Sub3) this).aFloat9351 = class384.buf[12];
		((Class390_Sub3) this).aFloat9328 = class384.buf[13];
		((Class390_Sub3) this).aFloat9333 = class384.buf[14];
		((Class390_Sub3) this).aFloat9354 = class384.buf[15];
		for (int i_319_ = 0; i_319_ < i_317_ + i_317_; i_319_++) {
			for (int i_320_ = 0; i_320_ < i_317_ + i_317_; i_320_++) {
				if (bools[i_319_][i_320_]) {
					int i_321_ = i - i_317_ + i_319_;
					int i_322_ = i_316_ - i_317_ + i_320_;
					if (i_321_ >= 0 && i_321_ < anInt4776 * -1843860823 && i_322_ >= 0 && i_322_ < anInt4773 * 1826078169)
						method14638(i_321_, i_322_, i_318_);
				}
			}
		}
	}

	void method14618(int i, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, int i_328_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_329_) {
		int i_330_ = (i_328_ - i_326_) * i_324_ / 256;
		int i_331_ = i_324_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_332_ = i;
		int i_333_ = i_323_ + i_330_;
		for (int i_334_ = i_325_; i_334_ < i_327_; i_334_++) {
			for (int i_335_ = i_326_; i_335_ < i_328_; i_335_++) {
				if (bools[i_334_ - i_325_][i_335_ - i_326_]) {
					if (((Class390_Sub3) this).aClass177ArrayArray9336 != null) {
						if ((((Class390_Sub3) this).aClass177ArrayArray9336[i_334_][i_335_]) != null) {
							Class177 class177 = (((Class390_Sub3) this).aClass177ArrayArray9336[i_334_][i_335_]);
							if (((Class177) class177).aShort2212 != -1 && (((Class177) class177).aByte2210 & 0x2) == 0 && ((Class177) class177).anInt2203 == 0) {
								int i_336_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class177) class177).aShort2212));
								class144.method2426(true, true, false, (float) (i_333_ - i_331_), (float) (i_333_ - i_331_), (float) i_333_, (float) (i_332_ + i_331_), (float) i_332_, (float) (i_332_ + i_331_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_336_, ((Class177) class177).anInt2211, -1827436229)), (float) (Class282_Sub20_Sub2.method15076(i_336_, ((Class177) class177).anInt2206, -1440789808)),
										(float) (Class282_Sub20_Sub2.method15076(i_336_, ((Class177) class177).anInt2204, -1699690217)));
								class144.method2426(true, true, false, (float) i_333_, (float) i_333_, (float) (i_333_ - i_331_), (float) i_332_, (float) (i_332_ + i_331_), (float) i_332_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_336_, ((Class177) class177).anInt2209, -1603627148)), (float) (Class282_Sub20_Sub2.method15076(i_336_, ((Class177) class177).anInt2204, -1946394922)),
										(float) (Class282_Sub20_Sub2.method15076(i_336_, ((Class177) class177).anInt2206, -1527416514)));
							} else if (((Class177) class177).anInt2203 == 0) {
								class144.method2425(true, true, false, (float) (i_333_ - i_331_), (float) (i_333_ - i_331_), (float) i_333_, (float) (i_332_ + i_331_), (float) i_332_, (float) (i_332_ + i_331_), 100.0F, 100.0F, 100.0F, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
								class144.method2425(true, true, false, (float) i_333_, (float) i_333_, (float) (i_333_ - i_331_), (float) i_332_, (float) (i_332_ + i_331_), (float) i_332_, 100.0F, 100.0F, 100.0F, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							} else {
								int i_337_ = ((Class177) class177).anInt2203;
								class144.method2425(true, true, false, (float) (i_333_ - i_331_), (float) (i_333_ - i_331_), (float) i_333_, (float) (i_332_ + i_331_), (float) i_332_, (float) (i_332_ + i_331_), 100.0F, 100.0F, 100.0F, Class323.method5773(i_337_, (((Class177) class177).anInt2211 & ~0xffffff), (byte) -24), Class323.method5773(i_337_, (((Class177) class177).anInt2206 & ~0xffffff), (byte) -11), Class323.method5773(i_337_, (((Class177) class177).anInt2204 & ~0xffffff), (byte) -36));
								class144.method2425(true, true, false, (float) i_333_, (float) i_333_, (float) (i_333_ - i_331_), (float) i_332_, (float) (i_332_ + i_331_), (float) i_332_, 100.0F, 100.0F, 100.0F, Class323.method5773(i_337_, (((Class177) class177).anInt2209 & ~0xffffff), (byte) -41), Class323.method5773(i_337_, (((Class177) class177).anInt2204 & ~0xffffff), (byte) -120), Class323.method5773(i_337_, (((Class177) class177).anInt2206 & ~0xffffff), (byte) -105));
							}
						} else if ((((Class390_Sub3) this).aClass196ArrayArray9337[i_334_][i_335_]) != null) {
							Class196 class196 = (((Class390_Sub3) this).aClass196ArrayArray9337[i_334_][i_335_]);
							for (int i_338_ = 0; i_338_ < ((Class196) class196).aShort2421; i_338_++) {
								fs[i_338_] = (float) (i_332_ + ((((Class196) class196).aShortArray2416[i_338_]) * i_331_ / (anInt4774 * 750971439)));
								fs_329_[i_338_] = (float) (i_333_ - ((((Class196) class196).aShortArray2418[i_338_]) * i_331_ / (anInt4774 * 750971439)));
							}
							for (int i_339_ = 0; i_339_ < ((Class196) class196).aShort2415; i_339_++) {
								int i_340_ = i_339_ * 3;
								int i_341_ = i_340_ + 1;
								int i_342_ = i_341_ + 1;
								float f = fs[i_340_];
								float f_343_ = fs[i_341_];
								float f_344_ = fs[i_342_];
								float f_345_ = fs_329_[i_340_];
								float f_346_ = fs_329_[i_341_];
								float f_347_ = fs_329_[i_342_];
								if ((((Class196) class196).anIntArray2423 != null) && (((Class196) class196).anIntArray2423[i_339_]) != 0 && ((((Class196) class196).aShortArray2413 == null) || ((((Class196) class196).aShortArray2413) != null && ((((Class196) class196).aShortArray2413[i_339_]) == -1)))) {
									int i_348_ = (((Class196) class196).anIntArray2423[i_339_]);
									class144.method2425(true, true, false, f_345_, f_346_, f_347_, f, f_343_, f_344_, 100.0F, 100.0F, 100.0F, (Class323.method5773(i_348_, -16777216 - ((((Class196) class196).anIntArray2420[i_340_]) & ~0xffffff), (byte) -12)), (Class323.method5773(i_348_, -16777216 - ((((Class196) class196).anIntArray2420[i_341_]) & ~0xffffff), (byte) -34)), (Class323.method5773(i_348_, -16777216 - ((((Class196) class196).anIntArray2420[i_342_]) & ~0xffffff), (byte) -58)));
								} else if ((((Class196) class196).aShortArray2413) != null && ((((Class196) class196).aShortArray2413[i_339_]) != -1)) {
									int i_349_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class196) class196).aShortArray2413[i_339_]));
									class144.method2426(true, true, false, f_345_, f_346_, f_347_, f, f_343_, f_344_, 100.0F, 100.0F, 100.0F, (float) i_349_, (float) i_349_, (float) i_349_);
								} else
									class144.method2425(true, true, false, f_345_, f_346_, f_347_, f, f_343_, f_344_, 100.0F, 100.0F, 100.0F, (((Class196) class196).anIntArray2420[i_340_]), (((Class196) class196).anIntArray2420[i_341_]), (((Class196) class196).anIntArray2420[i_342_]));
							}
						}
					} else if ((((Class390_Sub3) this).aClass181ArrayArray9335[i_334_][i_335_]) != null) {
						Class181 class181 = (((Class390_Sub3) this).aClass181ArrayArray9335[i_334_][i_335_]);
						for (int i_350_ = 0; i_350_ < ((Class181) class181).aShort2248; i_350_++) {
							fs[i_350_] = (float) (i_332_ + ((((Class181) class181).aShortArray2249[i_350_]) * i_331_ / (anInt4774 * 750971439)));
							fs_329_[i_350_] = (float) (i_333_ - ((((Class181) class181).aShortArray2247[i_350_]) * i_331_ / (anInt4774 * 750971439)));
						}
						for (int i_351_ = 0; i_351_ < ((Class181) class181).aShort2250; i_351_++) {
							int i_352_ = i_351_ * 3;
							int i_353_ = i_352_ + 1;
							int i_354_ = i_353_ + 1;
							float f = fs[i_352_];
							float f_355_ = fs[i_353_];
							float f_356_ = fs[i_354_];
							float f_357_ = fs_329_[i_352_];
							float f_358_ = fs_329_[i_353_];
							float f_359_ = fs_329_[i_354_];
							if (((Class181) class181).anIntArray2257 != null && (((Class181) class181).anIntArray2257[i_351_]) != 0) {
								int i_360_ = (((Class181) class181).anIntArray2257[i_351_]);
								class144.method2425(true, true, false, f_357_, f_358_, f_359_, f, f_355_, f_356_, 100.0F, 100.0F, 100.0F, i_360_, i_360_, i_360_);
							} else
								class144.method2425(true, true, false, f_357_, f_358_, f_359_, f, f_355_, f_356_, 100.0F, 100.0F, 100.0F, (((Class181) class181).anIntArray2251[i_352_]), (((Class181) class181).anIntArray2251[i_353_]), (((Class181) class181).anIntArray2251[i_354_]));
						}
					}
				}
				i_333_ -= i_331_;
			}
			i_333_ = i_323_ + i_330_;
			i_332_ += i_331_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	void method14619(int i, int i_361_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_362_, float[] fs_363_, float[] fs_364_, float[] fs_365_, int i_366_) {
		Class181 class181 = ((Class390_Sub3) this).aClass181ArrayArray9335[i][i_361_];
		if (i_366_ == 0 || (i_366_ & 0x2) == 0) {
			if (class181 != null) {
				for (int i_367_ = 0; i_367_ < ((Class181) class181).aShort2248; i_367_++) {
					int i_368_ = (((Class181) class181).aShortArray2249[i_367_] + (i << anInt4775 * 1856651955));
					int i_369_ = ((Class181) class181).aShortArray2255[i_367_];
					int i_370_ = (((Class181) class181).aShortArray2247[i_367_] + (i_361_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_368_) + (((Class390_Sub3) this).aFloat9334 * (float) i_369_) + (((Class390_Sub3) this).aFloat9349 * (float) i_370_)));
					float f_371_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_368_) + (((Class390_Sub3) this).aFloat9346 * (float) i_369_) + (((Class390_Sub3) this).aFloat9350 * (float) i_370_)));
					if (f < -f_371_)
						return;
					fs_365_[i_367_] = 0.0F;
					if (bool) {
						float f_372_ = f - ((Class185) class185).aFloat2305;
						if (f_372_ > 0.0F) {
							f_372_ /= ((Class185) class185).aFloat2303;
							if (f_372_ > 1.0F)
								f_372_ = 1.0F;
							fs_365_[i_367_] = f_372_;
							int i_373_ = (int) ((float) (((Class181) class181).aShortArray2252[i_367_]) * f_372_);
							if (i_373_ > 0)
								i_369_ -= i_373_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_374_ = f - ((Class185) class185).aFloat2305;
						if (f_374_ > 0.0F) {
							fs_365_[i_367_] = f_374_ / ((Class185) class185).aFloat2303;
							if (fs_365_[i_367_] > 1.0F)
								fs_365_[i_367_] = 1.0F;
						}
					}
					float f_375_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_368_) + (((Class390_Sub3) this).aFloat9343 * (float) i_369_) + (((Class390_Sub3) this).aFloat9339 * (float) i_370_)));
					float f_376_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_368_) + (((Class390_Sub3) this).aFloat9344 * (float) i_369_) + (((Class390_Sub3) this).aFloat9327 * (float) i_370_)));
					fs[i_367_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_375_ / f_371_));
					fs_362_[i_367_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_376_ / f_371_));
					fs_363_[i_367_] = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_371_);
					fs_364_[i_367_] = f_371_;
				}
				float f = (float) (anInt4774 * 750971439);
				for (int i_377_ = 0; i_377_ < ((Class181) class181).aShort2250; i_377_++) {
					int i_378_ = i_377_ * 3;
					int i_379_ = i_378_ + 1;
					int i_380_ = i_379_ + 1;
					float f_381_ = fs[i_378_];
					float f_382_ = fs[i_379_];
					float f_383_ = fs[i_380_];
					float f_384_ = fs_362_[i_378_];
					float f_385_ = fs_362_[i_379_];
					float f_386_ = fs_362_[i_380_];
					if (((f_381_ - f_382_) * (f_386_ - f_385_) - (f_384_ - f_385_) * (f_383_ - f_382_)) > 0.0F) {
						((ChoppyItemFixClass) class144).aBool1708 = (f_381_ < 0.0F || f_382_ < 0.0F || f_383_ < 0.0F || (f_381_ > (float) ((ChoppyItemFixClass) class144).anInt1684) || (f_382_ > (float) ((ChoppyItemFixClass) class144).anInt1684) || (f_383_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
						if (fs_365_[i_378_] + fs_365_[i_379_] + fs_365_[i_380_] < 3.0F) {
							int i_387_ = i << anInt4775 * 1856651955;
							int i_388_ = i_361_ << anInt4775 * 1856651955;
							if ((((Class181) class181).anIntArray2251[i_378_] & 0xffffff) != 0) {
								if (((((Class181) class181).aShortArray2253[i_378_]) == (((Class181) class181).aShortArray2253[i_379_])) && ((((Class181) class181).aShortArray2253[i_378_]) == (((Class181) class181).aShortArray2253[i_380_])) && ((((Class181) class181).aShortArray2254[i_378_]) == (((Class181) class181).aShortArray2254[i_379_])) && ((((Class181) class181).aShortArray2254[i_378_]) == (((Class181) class181).aShortArray2254[i_380_])))
									class144.method2424(true, true, false, f_384_, f_385_, f_386_, f_381_, f_382_, f_383_, fs_363_[i_378_], fs_363_[i_379_], fs_363_[i_380_], fs_364_[i_378_], fs_364_[i_379_], fs_364_[i_380_], ((float) (i_387_ + (((Class181) class181).aShortArray2249[i_378_])) / (float) (((Class181) class181).aShortArray2254[i_378_])), ((float) (i_387_ + (((Class181) class181).aShortArray2249[i_379_])) / (float) (((Class181) class181).aShortArray2254[i_379_])),
											((float) (i_387_ + (((Class181) class181).aShortArray2249[i_380_])) / (float) (((Class181) class181).aShortArray2254[i_380_])), ((float) (i_388_ + (((Class181) class181).aShortArray2247[i_378_])) / (float) (((Class181) class181).aShortArray2254[i_378_])), ((float) (i_388_ + (((Class181) class181).aShortArray2247[i_379_])) / (float) (((Class181) class181).aShortArray2254[i_379_])),
											((float) (i_388_ + (((Class181) class181).aShortArray2247[i_380_])) / (float) (((Class181) class181).aShortArray2254[i_380_])), (((Class181) class181).anIntArray2251[i_378_]), (((Class181) class181).anIntArray2251[i_379_]), (((Class181) class181).anIntArray2251[i_380_]), (((Class185) class185).anInt2307 * 1402414887), fs_365_[i_378_] * 255.0F, fs_365_[i_379_] * 255.0F, fs_365_[i_380_] * 255.0F, (((Class181) class181).aShortArray2253[i_378_]));
								else
									class144.method2421(true, true, false, f_384_, f_385_, f_386_, f_381_, f_382_, f_383_, fs_363_[i_378_], fs_363_[i_379_], fs_363_[i_380_], fs_364_[i_378_], fs_364_[i_379_], fs_364_[i_380_], (float) (i_387_ + (((Class181) class181).aShortArray2249[i_378_])) / f, (float) (i_387_ + (((Class181) class181).aShortArray2249[i_379_])) / f, (float) (i_387_ + (((Class181) class181).aShortArray2249[i_380_])) / f,
											(float) (i_388_ + (((Class181) class181).aShortArray2247[i_378_])) / f, (float) (i_388_ + (((Class181) class181).aShortArray2247[i_379_])) / f, (float) (i_388_ + (((Class181) class181).aShortArray2247[i_380_])) / f, (((Class181) class181).anIntArray2251[i_378_]), (((Class181) class181).anIntArray2251[i_379_]), (((Class181) class181).anIntArray2251[i_380_]), (((Class185) class185).anInt2307 * 1402414887), fs_365_[i_378_] * 255.0F,
											fs_365_[i_379_] * 255.0F, fs_365_[i_380_] * 255.0F, (((Class181) class181).aShortArray2253[i_378_]), f / (float) (((Class181) class181).aShortArray2254[i_378_]), (((Class181) class181).aShortArray2253[i_379_]), f / (float) (((Class181) class181).aShortArray2254[i_379_]), (((Class181) class181).aShortArray2253[i_380_]), f / (float) (((Class181) class181).aShortArray2254[i_380_]));
							}
						} else
							class144.method2428(true, true, false, f_384_, f_385_, f_386_, f_381_, f_382_, f_383_, fs_363_[i_378_], fs_363_[i_379_], fs_363_[i_380_], (((Class185) class185).anInt2307) * 1402414887);
					}
				}
			}
		}
	}

	boolean method14620(int i) {
		if ((((Class390_Sub3) this).anInt9345 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	void method14621(int i, int i_389_, int i_390_) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		((ChoppyItemFixClass) ((Class185) class185).aClass144_2310).anInt1674 = 0;
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null)
			method14617(i, i_389_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_390_);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14636(i, i_389_, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_390_);
		else if (((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14619(i, i_389_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_390_);
	}

	void method14622(int i, int i_391_, int i_392_, int i_393_, int i_394_, int i_395_, int i_396_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_397_) {
		int i_398_ = (i_396_ - i_394_) * i_392_ / 256;
		int i_399_ = i_392_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_400_ = i;
		int i_401_ = i_391_ + i_398_;
		for (int i_402_ = i_393_; i_402_ < i_395_; i_402_++) {
			for (int i_403_ = i_394_; i_403_ < i_396_; i_403_++) {
				if (bools[i_402_ - i_393_][i_403_ - i_394_]) {
					if ((((Class390_Sub3) this).aClass178ArrayArray9352[i_402_][i_403_]) != null) {
						Class178 class178 = (((Class390_Sub3) this).aClass178ArrayArray9352[i_402_][i_403_]);
						if (((Class178) class178).aShort2215 != -1 && (((Class178) class178).aByte2219 & 0x2) == 0 && ((Class178) class178).anInt2213 == -1) {
							int i_404_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class178) class178).aShort2215));
							class144.method2426(true, true, false, (float) (i_401_ - i_399_), (float) (i_401_ - i_399_), (float) i_401_, (float) (i_400_ + i_399_), (float) i_400_, (float) (i_400_ + i_399_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_404_, (((Class178) class178).aShort2216 & 0xffff), -1425918442)), (float) (Class282_Sub20_Sub2.method15076(i_404_, (((Class178) class178).aShort2218 & 0xffff), -1439118140)),
									(float) (Class282_Sub20_Sub2.method15076(i_404_, (((Class178) class178).aShort2217 & 0xffff), -1530744036)));
							class144.method2426(true, true, false, (float) i_401_, (float) i_401_, (float) (i_401_ - i_399_), (float) i_400_, (float) (i_400_ + i_399_), (float) i_400_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_404_, (((Class178) class178).aShort2214 & 0xffff), -1392036644)), (float) (Class282_Sub20_Sub2.method15076(i_404_, (((Class178) class178).aShort2217 & 0xffff), -1288744310)),
									(float) (Class282_Sub20_Sub2.method15076(i_404_, (((Class178) class178).aShort2218 & 0xffff), -2095834541)));
						} else if (((Class178) class178).anInt2213 == -1) {
							class144.method2426(true, true, false, (float) (i_401_ - i_399_), (float) (i_401_ - i_399_), (float) i_401_, (float) (i_400_ + i_399_), (float) i_400_, (float) (i_400_ + i_399_), 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2216 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff));
							class144.method2426(true, true, false, (float) i_401_, (float) i_401_, (float) (i_401_ - i_399_), (float) i_400_, (float) (i_400_ + i_399_), (float) i_400_, 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2214 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff));
						} else {
							int i_405_ = ((Class178) class178).anInt2213;
							class144.method2426(true, true, false, (float) (i_401_ - i_399_), (float) (i_401_ - i_399_), (float) i_401_, (float) (i_400_ + i_399_), (float) i_400_, (float) (i_400_ + i_399_), 100.0F, 100.0F, 100.0F, (float) i_405_, (float) i_405_, (float) i_405_);
							class144.method2426(true, true, false, (float) i_401_, (float) i_401_, (float) (i_401_ - i_399_), (float) i_400_, (float) (i_400_ + i_399_), (float) i_400_, 100.0F, 100.0F, 100.0F, (float) i_405_, (float) i_405_, (float) i_405_);
						}
					} else if ((((Class390_Sub3) this).aClass183ArrayArray9332[i_402_][i_403_]) != null) {
						Class183 class183 = (((Class390_Sub3) this).aClass183ArrayArray9332[i_402_][i_403_]);
						for (int i_406_ = 0; i_406_ < ((Class183) class183).aShort2265; i_406_++) {
							fs[i_406_] = (float) (i_400_ + ((((Class183) class183).aShortArray2267[i_406_]) * i_399_ / (anInt4774 * 750971439)));
							fs_397_[i_406_] = (float) (i_401_ - ((((Class183) class183).aShortArray2264[i_406_]) * i_399_ / (anInt4774 * 750971439)));
						}
						for (int i_407_ = 0; i_407_ < ((Class183) class183).aShort2269; i_407_++) {
							short i_408_ = (((Class183) class183).aShortArray2271[i_407_]);
							short i_409_ = (((Class183) class183).aShortArray2266[i_407_]);
							short i_410_ = (((Class183) class183).aShortArray2273[i_407_]);
							float f = fs[i_408_];
							float f_411_ = fs[i_409_];
							float f_412_ = fs[i_410_];
							float f_413_ = fs_397_[i_408_];
							float f_414_ = fs_397_[i_409_];
							float f_415_ = fs_397_[i_410_];
							if (((Class183) class183).anIntArray2277 != null && (((Class183) class183).anIntArray2277[i_407_]) != -1) {
								int i_416_ = (((Class183) class183).anIntArray2277[i_407_]);
								class144.method2426(true, true, false, f_413_, f_414_, f_415_, f, f_411_, f_412_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_416_, (((Class183) class183).aShortArray2274[i_408_]), -1637318410)), (float) (Class282_Sub20_Sub2.method15076(i_416_, (((Class183) class183).aShortArray2274[i_409_]), -2083954388)), (float) (Class282_Sub20_Sub2.method15076(i_416_, (((Class183) class183).aShortArray2274[i_410_]), -2043217255)));
							} else if ((((Class183) class183).aShortArray2270 != null) && (((Class183) class183).aShortArray2270[i_407_]) != -1) {
								int i_417_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class183) class183).aShortArray2270[i_407_]));
								class144.method2426(true, true, false, f_413_, f_414_, f_415_, f, f_411_, f_412_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_417_, (((Class183) class183).aShortArray2274[i_408_]), -1565287282)), (float) (Class282_Sub20_Sub2.method15076(i_417_, (((Class183) class183).aShortArray2274[i_409_]), -2091262596)), (float) (Class282_Sub20_Sub2.method15076(i_417_, (((Class183) class183).aShortArray2274[i_410_]), -1960726262)));
							} else {
								int i_418_ = (((Class183) class183).anIntArray2272[i_407_]);
								class144.method2426(true, true, false, f_413_, f_414_, f_415_, f, f_411_, f_412_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_418_, (((Class183) class183).aShortArray2274[i_408_]), -1936732965)), (float) (Class282_Sub20_Sub2.method15076(i_418_, (((Class183) class183).aShortArray2274[i_409_]), -1514344836)), (float) (Class282_Sub20_Sub2.method15076(i_418_, (((Class183) class183).aShortArray2274[i_410_]), -1852411858)));
							}
						}
					}
				}
				i_401_ -= i_399_;
			}
			i_401_ = i_391_ + i_398_;
			i_400_ += i_399_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	public void method6716(int i, int i_419_, int i_420_, boolean[][] bools, boolean bool, int i_421_) {
		if ((((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).anIntArray8979) == null || (((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).aFloatArray9010) == null)
			throw new IllegalStateException("");
		Matrix44Arr class384 = (((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).aClass384_8996);
		((Class390_Sub3) this).aFloat9338 = class384.buf[0];
		((Class390_Sub3) this).aFloat9340 = class384.buf[1];
		((Class390_Sub3) this).aFloat9341 = class384.buf[2];
		((Class390_Sub3) this).aFloat9342 = class384.buf[3];
		((Class390_Sub3) this).aFloat9343 = class384.buf[4];
		((Class390_Sub3) this).aFloat9344 = class384.buf[5];
		((Class390_Sub3) this).aFloat9334 = class384.buf[6];
		((Class390_Sub3) this).aFloat9346 = class384.buf[7];
		((Class390_Sub3) this).aFloat9339 = class384.buf[8];
		((Class390_Sub3) this).aFloat9327 = class384.buf[9];
		((Class390_Sub3) this).aFloat9349 = class384.buf[10];
		((Class390_Sub3) this).aFloat9350 = class384.buf[11];
		((Class390_Sub3) this).aFloat9351 = class384.buf[12];
		((Class390_Sub3) this).aFloat9328 = class384.buf[13];
		((Class390_Sub3) this).aFloat9333 = class384.buf[14];
		((Class390_Sub3) this).aFloat9354 = class384.buf[15];
		for (int i_422_ = 0; i_422_ < i_420_ + i_420_; i_422_++) {
			for (int i_423_ = 0; i_423_ < i_420_ + i_420_; i_423_++) {
				if (bools[i_422_][i_423_]) {
					int i_424_ = i - i_420_ + i_422_;
					int i_425_ = i_419_ - i_420_ + i_423_;
					if (i_424_ >= 0 && i_424_ < anInt4776 * -1843860823 && i_425_ >= 0 && i_425_ < anInt4773 * 1826078169)
						method14638(i_424_, i_425_, i_421_);
				}
			}
		}
	}

	public Class282_Sub50_Sub17 w(int i, int i_426_, Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	public void UA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_427_, int i_428_, int i_429_, boolean bool) {
		/* empty */
	}

	public boolean method6712(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_430_, int i_431_, int i_432_, boolean bool) {
		return false;
	}

	public Class282_Sub50_Sub17 s(int i, int i_433_, Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	public void method6713(Class282_Sub24 class282_sub24, int[] is) {
		/* empty */
	}

	public void m(int i, int i_434_, int i_435_) {
		if (((Class390_Sub3) this).aByteArrayArray9356[i][i_434_] < i_435_)
			((Class390_Sub3) this).aByteArrayArray9356[i][i_434_] = (byte) i_435_;
	}

	void method14623(int i, int i_436_, int i_437_, int i_438_, int i_439_, int i_440_, int i_441_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_442_) {
		int i_443_ = (i_441_ - i_439_) * i_437_ / 256;
		int i_444_ = i_437_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_445_ = i;
		int i_446_ = i_436_ + i_443_;
		for (int i_447_ = i_438_; i_447_ < i_440_; i_447_++) {
			for (int i_448_ = i_439_; i_448_ < i_441_; i_448_++) {
				if (bools[i_447_ - i_438_][i_448_ - i_439_]) {
					if ((((Class390_Sub3) this).aClass178ArrayArray9352[i_447_][i_448_]) != null) {
						Class178 class178 = (((Class390_Sub3) this).aClass178ArrayArray9352[i_447_][i_448_]);
						if (((Class178) class178).aShort2215 != -1 && (((Class178) class178).aByte2219 & 0x2) == 0 && ((Class178) class178).anInt2213 == -1) {
							int i_449_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class178) class178).aShort2215));
							class144.method2426(true, true, false, (float) (i_446_ - i_444_), (float) (i_446_ - i_444_), (float) i_446_, (float) (i_445_ + i_444_), (float) i_445_, (float) (i_445_ + i_444_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_449_, (((Class178) class178).aShort2216 & 0xffff), -1370221195)), (float) (Class282_Sub20_Sub2.method15076(i_449_, (((Class178) class178).aShort2218 & 0xffff), -1863369076)),
									(float) (Class282_Sub20_Sub2.method15076(i_449_, (((Class178) class178).aShort2217 & 0xffff), -1282059536)));
							class144.method2426(true, true, false, (float) i_446_, (float) i_446_, (float) (i_446_ - i_444_), (float) i_445_, (float) (i_445_ + i_444_), (float) i_445_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_449_, (((Class178) class178).aShort2214 & 0xffff), -1950441310)), (float) (Class282_Sub20_Sub2.method15076(i_449_, (((Class178) class178).aShort2217 & 0xffff), -1759130217)),
									(float) (Class282_Sub20_Sub2.method15076(i_449_, (((Class178) class178).aShort2218 & 0xffff), -2107679587)));
						} else if (((Class178) class178).anInt2213 == -1) {
							class144.method2426(true, true, false, (float) (i_446_ - i_444_), (float) (i_446_ - i_444_), (float) i_446_, (float) (i_445_ + i_444_), (float) i_445_, (float) (i_445_ + i_444_), 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2216 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff));
							class144.method2426(true, true, false, (float) i_446_, (float) i_446_, (float) (i_446_ - i_444_), (float) i_445_, (float) (i_445_ + i_444_), (float) i_445_, 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2214 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff));
						} else {
							int i_450_ = ((Class178) class178).anInt2213;
							class144.method2426(true, true, false, (float) (i_446_ - i_444_), (float) (i_446_ - i_444_), (float) i_446_, (float) (i_445_ + i_444_), (float) i_445_, (float) (i_445_ + i_444_), 100.0F, 100.0F, 100.0F, (float) i_450_, (float) i_450_, (float) i_450_);
							class144.method2426(true, true, false, (float) i_446_, (float) i_446_, (float) (i_446_ - i_444_), (float) i_445_, (float) (i_445_ + i_444_), (float) i_445_, 100.0F, 100.0F, 100.0F, (float) i_450_, (float) i_450_, (float) i_450_);
						}
					} else if ((((Class390_Sub3) this).aClass183ArrayArray9332[i_447_][i_448_]) != null) {
						Class183 class183 = (((Class390_Sub3) this).aClass183ArrayArray9332[i_447_][i_448_]);
						for (int i_451_ = 0; i_451_ < ((Class183) class183).aShort2265; i_451_++) {
							fs[i_451_] = (float) (i_445_ + ((((Class183) class183).aShortArray2267[i_451_]) * i_444_ / (anInt4774 * 750971439)));
							fs_442_[i_451_] = (float) (i_446_ - ((((Class183) class183).aShortArray2264[i_451_]) * i_444_ / (anInt4774 * 750971439)));
						}
						for (int i_452_ = 0; i_452_ < ((Class183) class183).aShort2269; i_452_++) {
							short i_453_ = (((Class183) class183).aShortArray2271[i_452_]);
							short i_454_ = (((Class183) class183).aShortArray2266[i_452_]);
							short i_455_ = (((Class183) class183).aShortArray2273[i_452_]);
							float f = fs[i_453_];
							float f_456_ = fs[i_454_];
							float f_457_ = fs[i_455_];
							float f_458_ = fs_442_[i_453_];
							float f_459_ = fs_442_[i_454_];
							float f_460_ = fs_442_[i_455_];
							if (((Class183) class183).anIntArray2277 != null && (((Class183) class183).anIntArray2277[i_452_]) != -1) {
								int i_461_ = (((Class183) class183).anIntArray2277[i_452_]);
								class144.method2426(true, true, false, f_458_, f_459_, f_460_, f, f_456_, f_457_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_461_, (((Class183) class183).aShortArray2274[i_453_]), -1932658040)), (float) (Class282_Sub20_Sub2.method15076(i_461_, (((Class183) class183).aShortArray2274[i_454_]), -1625722305)), (float) (Class282_Sub20_Sub2.method15076(i_461_, (((Class183) class183).aShortArray2274[i_455_]), -1627570786)));
							} else if ((((Class183) class183).aShortArray2270 != null) && (((Class183) class183).aShortArray2270[i_452_]) != -1) {
								int i_462_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class183) class183).aShortArray2270[i_452_]));
								class144.method2426(true, true, false, f_458_, f_459_, f_460_, f, f_456_, f_457_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_462_, (((Class183) class183).aShortArray2274[i_453_]), -1440491610)), (float) (Class282_Sub20_Sub2.method15076(i_462_, (((Class183) class183).aShortArray2274[i_454_]), -1526747251)), (float) (Class282_Sub20_Sub2.method15076(i_462_, (((Class183) class183).aShortArray2274[i_455_]), -1311272661)));
							} else {
								int i_463_ = (((Class183) class183).anIntArray2272[i_452_]);
								class144.method2426(true, true, false, f_458_, f_459_, f_460_, f, f_456_, f_457_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_463_, (((Class183) class183).aShortArray2274[i_453_]), -1770556051)), (float) (Class282_Sub20_Sub2.method15076(i_463_, (((Class183) class183).aShortArray2274[i_454_]), -1389418227)), (float) (Class282_Sub20_Sub2.method15076(i_463_, (((Class183) class183).aShortArray2274[i_455_]), -1775936690)));
							}
						}
					}
				}
				i_446_ -= i_444_;
			}
			i_446_ = i_436_ + i_443_;
			i_445_ += i_444_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	public void method6706(int i, int i_464_, int[] is, int[] is_465_, int[] is_466_, int[] is_467_, int[] is_468_, int[] is_469_, int[] is_470_, int[] is_471_, Class90 class90, boolean bool) {
		boolean bool_472_ = (((Class390_Sub3) this).anInt9345 & 0x20) == 0;
		if (((Class390_Sub3) this).aClass177ArrayArray9336 == null && !bool_472_) {
			((Class390_Sub3) this).aClass177ArrayArray9336 = (new Class177[anInt4776 * -1843860823][anInt4773 * 1826078169]);
			((Class390_Sub3) this).aClass196ArrayArray9337 = (new Class196[anInt4776 * -1843860823][anInt4773 * 1826078169]);
		} else if (((Class390_Sub3) this).aClass181ArrayArray9335 == null && bool_472_)
			((Class390_Sub3) this).aClass181ArrayArray9335 = (new Class181[anInt4776 * -1843860823][anInt4773 * 1826078169]);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_473_ = 0; i_473_ < is_468_.length; i_473_++) {
				if (is_468_[i_473_] == -1)
					is_468_[i_473_] = 0;
				else
					is_468_[i_473_] = (Class335.anIntArray3916[(Class372.method6362(is_468_[i_473_], 590233248) & 0xffff)]) << 8 | 0xff;
			}
			if (is_469_ != null) {
				for (int i_474_ = 0; i_474_ < is_469_.length; i_474_++) {
					if (is_469_[i_474_] == -1)
						is_469_[i_474_] = 0;
					else
						is_469_[i_474_] = ((Class335.anIntArray3916[Class372.method6362(is_469_[i_474_], 1143254703) & 0xffff]) << 8) | 0xff;
				}
			}
			if (bool_472_) {
				Class181 class181 = new Class181();
				((Class181) class181).aShort2248 = (short) is.length;
				((Class181) class181).aShort2250 = (short) (is.length / 3);
				((Class181) class181).aShortArray2249 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2255 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2247 = new short[((Class181) class181).aShort2248];
				((Class181) class181).anIntArray2251 = new int[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2253 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aShortArray2254 = new short[((Class181) class181).aShort2248];
				((Class181) class181).aByteArray2256 = new byte[((Class181) class181).aShort2248];
				if (is_467_ != null)
					((Class181) class181).aShortArray2252 = new short[((Class181) class181).aShort2248];
				for (int i_475_ = 0; i_475_ < ((Class181) class181).aShort2248; i_475_++) {
					int i_476_ = is[i_475_];
					int i_477_ = is_466_[i_475_];
					boolean bool_478_ = false;
					int i_479_;
					if (i_476_ == 0 && i_477_ == 0)
						i_479_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_]));
					else if (i_476_ == 0 && i_477_ == anInt4774 * 750971439)
						i_479_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1]));
					else if (i_476_ == anInt4774 * 750971439 && i_477_ == anInt4774 * 750971439)
						i_479_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1]));
					else if (i_476_ == anInt4774 * 750971439 && i_477_ == 0)
						i_479_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_]));
					else {
						int i_480_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_])) * (anInt4774 * 750971439 - i_476_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_])) * i_476_);
						int i_481_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1])) * (anInt4774 * 750971439 - i_476_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1])) * i_476_);
						i_479_ = (i_480_ * (anInt4774 * 750971439 - i_477_) + i_481_ * i_477_) >> anInt4775 * -581663386;
					}
					int i_482_ = (i << anInt4775 * 1856651955) + i_476_;
					int i_483_ = (i_464_ << anInt4775 * 1856651955) + i_477_;
					((Class181) class181).aShortArray2249[i_475_] = (short) i_476_;
					((Class181) class181).aShortArray2247[i_475_] = (short) i_477_;
					((Class181) class181).aShortArray2255[i_475_] = (short) (method6709(i_482_, i_483_, -1295486739) + (is_465_ != null ? is_465_[i_475_] : 0));
					if (i_479_ < 0)
						i_479_ = 0;
					if (is_468_[i_475_] == 0) {
						((Class181) class181).anIntArray2251[i_475_] = 0;
						if (is_469_ != null)
							((Class181) class181).aByteArray2256[i_475_] = (byte) i_479_;
					} else {
						int i_484_ = 0;
						if (is_467_ != null) {
							int i_485_ = (((Class181) class181).aShortArray2252[i_475_] = (short) is_467_[i_475_]);
							if (class90.anInt945 * 973144081 != 0) {
								i_484_ = 255 * i_485_ / (class90.anInt945 * 973144081);
								if (i_484_ < 0)
									i_484_ = 0;
								else if (i_484_ > 255)
									i_484_ = 255;
							}
						}
						int i_486_ = -16777216;
						if (is_470_[i_475_] != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(is_470_[i_475_], -2026986104).aByte2064))
							i_486_ = -1694498816;
						((Class181) class181).anIntArray2251[i_475_] = i_486_ | (Class8_Sub3.method14337(method14616(is_468_[i_475_] >> 8, i_479_), class90.anInt946 * 1152775735, i_484_, 1385119855));
						if (is_469_ != null)
							((Class181) class181).aByteArray2256[i_475_] = (byte) i_479_;
					}
					((Class181) class181).aShortArray2253[i_475_] = (short) is_470_[i_475_];
					((Class181) class181).aShortArray2254[i_475_] = (short) is_471_[i_475_];
				}
				if (is_469_ != null)
					((Class181) class181).anIntArray2257 = new int[((Class181) class181).aShort2250];
				for (int i_487_ = 0; i_487_ < ((Class181) class181).aShort2250; i_487_++) {
					int i_488_ = i_487_ * 3;
					if (is_469_ != null && is_469_[i_488_] != 0)
						((Class181) class181).anIntArray2257[i_487_] = ~0xffffff | is_469_[i_488_] >> 8;
				}
				((Class390_Sub3) this).aClass181ArrayArray9335[i][i_464_] = class181;
			} else {
				boolean bool_489_ = true;
				int i_490_ = -1;
				int i_491_ = -1;
				int i_492_ = -1;
				int i_493_ = -1;
				if (is.length == 6) {
					for (int i_494_ = 0; i_494_ < 6; i_494_++) {
						if (is[i_494_] == 0 && is_466_[i_494_] == 0) {
							if (i_490_ != -1 && is_468_[i_490_] != is_468_[i_494_]) {
								bool_489_ = false;
								break;
							}
							i_490_ = i_494_;
						} else if (is[i_494_] == anInt4774 * 750971439 && is_466_[i_494_] == 0) {
							if (i_491_ != -1 && is_468_[i_491_] != is_468_[i_494_]) {
								bool_489_ = false;
								break;
							}
							i_491_ = i_494_;
						} else if (is[i_494_] == anInt4774 * 750971439 && (is_466_[i_494_] == anInt4774 * 750971439)) {
							if (i_492_ != -1 && is_468_[i_492_] != is_468_[i_494_]) {
								bool_489_ = false;
								break;
							}
							i_492_ = i_494_;
						} else if (is[i_494_] == 0 && (is_466_[i_494_] == anInt4774 * 750971439)) {
							if (i_493_ != -1 && is_468_[i_493_] != is_468_[i_494_]) {
								bool_489_ = false;
								break;
							}
							i_493_ = i_494_;
						}
					}
					if (i_490_ == -1 || i_491_ == -1 || i_492_ == -1 || i_493_ == -1)
						bool_489_ = false;
					if (bool_489_) {
						if (is_465_ != null) {
							for (int i_495_ = 0; i_495_ < 4; i_495_++) {
								if (is_465_[i_495_] != 0) {
									bool_489_ = false;
									break;
								}
							}
						}
						if (bool_489_) {
							for (int i_496_ = 1; i_496_ < 4; i_496_++) {
								if (is[i_496_] != is[0] && (is[i_496_] != is[0] + anInt4774 * 750971439) && (is[i_496_] != is[0] - anInt4774 * 750971439)) {
									bool_489_ = false;
									break;
								}
								if (is_466_[i_496_] != is_466_[0] && (is_466_[i_496_] != is_466_[0] + anInt4774 * 750971439) && (is_466_[i_496_] != (is_466_[0] - anInt4774 * 750971439))) {
									bool_489_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_489_ = false;
				if (bool_489_) {
					Class177 class177 = new Class177();
					int i_497_ = is_468_[0];
					int i_498_ = is_470_[0];
					if (is_469_ != null) {
						((Class177) class177).anInt2203 = is_469_[0] >> 8;
						if (i_497_ == 0)
							((Class177) class177).aByte2210 |= 0x2;
					} else if (i_497_ == 0)
						return;
					if ((anIntArrayArray4772[i][i_464_] == anIntArrayArray4772[i + 1][i_464_]) && (anIntArrayArray4772[i][i_464_] == anIntArrayArray4772[i + 1][i_464_ + 1]) && (anIntArrayArray4772[i][i_464_] == anIntArrayArray4772[i][i_464_ + 1]))
						((Class177) class177).aByte2210 |= 0x1;
					if (i_498_ != -1 && (((Class177) class177).aByte2210 & 0x2) == 0 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_498_, -1990349271).aBool2056)) {
						int i_499_;
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_499_ = 255 * is_467_[i_490_] / (class90.anInt945 * 973144081);
							if (i_499_ < 0)
								i_499_ = 0;
							else if (i_499_ > 255)
								i_499_ = 255;
						} else
							i_499_ = 0;
						((Class177) class177).anInt2209 = (Class8_Sub3.method14337(method14616(is_468_[i_490_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_]))), class90.anInt946 * 1152775735, i_499_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2209 |= (255 - ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_])) << 25);
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_499_ = 255 * is_467_[i_491_] / (class90.anInt945 * 973144081);
							if (i_499_ < 0)
								i_499_ = 0;
							else if (i_499_ > 255)
								i_499_ = 255;
						} else
							i_499_ = 0;
						((Class177) class177).anInt2204 = (Class8_Sub3.method14337(method14616(is_468_[i_491_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_]))), class90.anInt946 * 1152775735, i_499_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2204 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_])) << 25;
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_499_ = 255 * is_467_[i_492_] / (class90.anInt945 * 973144081);
							if (i_499_ < 0)
								i_499_ = 0;
							else if (i_499_ > 255)
								i_499_ = 255;
						} else
							i_499_ = 0;
						((Class177) class177).anInt2211 = (Class8_Sub3.method14337(method14616(is_468_[i_492_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1]))), class90.anInt946 * 1152775735, i_499_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2211 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1])) << 25;
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_499_ = 255 * is_467_[i_493_] / (class90.anInt945 * 973144081);
							if (i_499_ < 0)
								i_499_ = 0;
							else if (i_499_ > 255)
								i_499_ = 255;
						} else
							i_499_ = 0;
						((Class177) class177).anInt2206 = (Class8_Sub3.method14337(method14616(is_468_[i_493_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1]))), class90.anInt946 * 1152775735, i_499_, 1385119855));
						((Class177) class177).aShort2212 = (short) i_498_;
					} else {
						int i_500_;
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_500_ = 255 * is_467_[i_490_] / (class90.anInt945 * 973144081);
							if (i_500_ < 0)
								i_500_ = 0;
							else if (i_500_ > 255)
								i_500_ = 255;
						} else
							i_500_ = 0;
						((Class177) class177).anInt2209 = (Class8_Sub3.method14337(method14616(is_468_[i_490_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_]))), class90.anInt946 * 1152775735, i_500_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2209 |= (255 - ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_])) << 25);
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_500_ = 255 * is_467_[i_491_] / (class90.anInt945 * 973144081);
							if (i_500_ < 0)
								i_500_ = 0;
							else if (i_500_ > 255)
								i_500_ = 255;
						} else
							i_500_ = 0;
						((Class177) class177).anInt2204 = (Class8_Sub3.method14337(method14616(is_468_[i_491_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_]))), class90.anInt946 * 1152775735, i_500_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2204 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_])) << 25;
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_500_ = 255 * is_467_[i_492_] / (class90.anInt945 * 973144081);
							if (i_500_ < 0)
								i_500_ = 0;
							else if (i_500_ > 255)
								i_500_ = 255;
						} else
							i_500_ = 0;
						((Class177) class177).anInt2211 = (Class8_Sub3.method14337(method14616(is_468_[i_492_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1]))), class90.anInt946 * 1152775735, i_500_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2211 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1])) << 25;
						if (is_467_ != null && class90.anInt945 * 973144081 != 0) {
							i_500_ = 255 * is_467_[i_493_] / (class90.anInt945 * 973144081);
							if (i_500_ < 0)
								i_500_ = 0;
							else if (i_500_ > 255)
								i_500_ = 255;
						} else
							i_500_ = 0;
						((Class177) class177).anInt2206 = (Class8_Sub3.method14337(method14616(is_468_[i_493_] >> 8, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1]))), class90.anInt946 * 1152775735, i_500_, 1385119855));
						if (((Class177) class177).anInt2203 != 0)
							((Class177) class177).anInt2206 |= 255 - ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1])) << 25;
						((Class177) class177).aShort2212 = (short) -1;
					}
					if (is_467_ != null) {
						((Class177) class177).aShort2208 = (short) is_467_[i_492_];
						((Class177) class177).aShort2205 = (short) is_467_[i_493_];
						((Class177) class177).aShort2202 = (short) is_467_[i_491_];
						((Class177) class177).aShort2207 = (short) is_467_[i_490_];
					}
					((Class390_Sub3) this).aClass177ArrayArray9336[i][i_464_] = class177;
				} else {
					Class196 class196 = new Class196();
					((Class196) class196).aShort2421 = (short) is.length;
					((Class196) class196).aShort2415 = (short) (is.length / 3);
					((Class196) class196).aShortArray2416 = new short[((Class196) class196).aShort2421];
					((Class196) class196).aShortArray2417 = new short[((Class196) class196).aShort2421];
					((Class196) class196).aShortArray2418 = new short[((Class196) class196).aShort2421];
					((Class196) class196).anIntArray2420 = new int[((Class196) class196).aShort2421];
					if (is_467_ != null)
						((Class196) class196).aShortArray2419 = new short[((Class196) class196).aShort2421];
					for (int i_501_ = 0; i_501_ < ((Class196) class196).aShort2421; i_501_++) {
						int i_502_ = is[i_501_];
						int i_503_ = is_466_[i_501_];
						boolean bool_504_ = false;
						int i_505_;
						if (i_502_ == 0 && i_503_ == 0)
							i_505_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_]));
						else if (i_502_ == 0 && i_503_ == anInt4774 * 750971439)
							i_505_ = ((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1]));
						else if (i_502_ == anInt4774 * 750971439 && i_503_ == anInt4774 * 750971439)
							i_505_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1]));
						else if (i_502_ == anInt4774 * 750971439 && i_503_ == 0)
							i_505_ = ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_]));
						else {
							int i_506_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_])) * (anInt4774 * 750971439 - i_502_)) + (((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_])) * i_502_));
							int i_507_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_464_ + 1])) * (anInt4774 * 750971439 - i_502_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_464_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_464_ + 1])) * i_502_);
							i_505_ = (i_506_ * (anInt4774 * 750971439 - i_503_) + i_507_ * i_503_ >> anInt4775 * -581663386);
						}
						int i_508_ = (i << anInt4775 * 1856651955) + i_502_;
						int i_509_ = (i_464_ << anInt4775 * 1856651955) + i_503_;
						((Class196) class196).aShortArray2416[i_501_] = (short) i_502_;
						((Class196) class196).aShortArray2418[i_501_] = (short) i_503_;
						((Class196) class196).aShortArray2417[i_501_] = (short) (method6709(i_508_, i_509_, 661429982) + (is_465_ != null ? is_465_[i_501_] : 0));
						if (i_505_ < 0)
							i_505_ = 0;
						if (is_468_[i_501_] == 0) {
							if (is_469_ != null)
								((Class196) class196).anIntArray2420[i_501_] = i_505_ << 25;
							else
								((Class196) class196).anIntArray2420[i_501_] = 0;
						} else {
							int i_510_ = 0;
							if (is_467_ != null) {
								int i_511_ = (((Class196) class196).aShortArray2419[i_501_] = (short) is_467_[i_501_]);
								if (class90.anInt945 * 973144081 != 0) {
									i_510_ = 255 * i_511_ / (class90.anInt945 * 973144081);
									if (i_510_ < 0)
										i_510_ = 0;
									else if (i_510_ > 255)
										i_510_ = 255;
								}
							}
							((Class196) class196).anIntArray2420[i_501_] = (Class8_Sub3.method14337(method14616(is_468_[i_501_] >> 8, i_505_), class90.anInt946 * 1152775735, i_510_, 1385119855));
							if (is_469_ != null)
								((Class196) class196).anIntArray2420[i_501_] |= i_505_ << 25;
						}
					}
					boolean bool_512_ = false;
					for (int i_513_ = 0; i_513_ < ((Class196) class196).aShort2415; i_513_++) {
						if (is_470_[i_513_ * 3] != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(is_470_[i_513_ * 3], -1859755304).aBool2056))
							bool_512_ = true;
					}
					if (is_469_ != null)
						((Class196) class196).anIntArray2423 = new int[((Class196) class196).aShort2415];
					if (bool_512_) {
						((Class196) class196).aShortArray2413 = new short[((Class196) class196).aShort2415];
						((Class196) class196).aShortArray2422 = new short[((Class196) class196).aShort2415];
					}
					for (int i_514_ = 0; i_514_ < ((Class196) class196).aShort2415; i_514_++) {
						int i_515_ = i_514_ * 3;
						if (is_469_ != null && is_469_[i_515_] != 0)
							((Class196) class196).anIntArray2423[i_514_] = is_469_[i_515_] >> 8;
						if (bool_512_) {
							int i_516_ = i_515_ + 1;
							int i_517_ = i_516_ + 1;
							boolean bool_518_ = false;
							boolean bool_519_ = true;
							int i_520_ = is_470_[i_515_];
							if (i_520_ == -1 || (((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2131663479).aBool2056))
								bool_519_ = false;
							else
								bool_518_ = true;
							i_520_ = is_470_[i_516_];
							if (i_520_ == -1 || (((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2136397326).aBool2056))
								bool_519_ = false;
							else
								bool_518_ = true;
							i_520_ = is_470_[i_517_];
							if (i_520_ == -1 || (((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -1845712049).aBool2056))
								bool_519_ = false;
							else
								bool_518_ = true;
							if (bool_519_) {
								((Class196) class196).aShortArray2413[i_514_] = (short) i_520_;
								((Class196) class196).aShortArray2422[i_514_] = (short) is_471_[i_515_];
							} else {
								if (bool_518_) {
									i_520_ = is_470_[i_515_];
									if (i_520_ != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2123006974).aBool2056))
										((Class196) class196).anIntArray2420[i_515_] = (Class335.anIntArray3916[(Class372.method6362((((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2041191674).aShort2073) & 0xffff, 444597695)) & 0xffff]);
									i_520_ = is_470_[i_516_];
									if (i_520_ != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2063007331).aBool2056))
										((Class196) class196).anIntArray2420[i_516_] = (Class335.anIntArray3916[(Class372.method6362((((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -1779401981).aShort2073) & 0xffff, 2037998587)) & 0xffff]);
									i_520_ = is_470_[i_517_];
									if (i_520_ != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2085416975).aBool2056))
										((Class196) class196).anIntArray2420[i_517_] = (Class335.anIntArray3916[(Class372.method6362((((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_520_, -2141091437).aShort2073) & 0xffff, 818648524)) & 0xffff]);
								}
								((Class196) class196).aShortArray2413[i_514_] = (short) -1;
							}
						}
					}
					((Class390_Sub3) this).aClass196ArrayArray9337[i][i_464_] = class196;
				}
			}
		}
	}

	static int method14624(int i, int i_521_) {
		int i_522_ = (i & 0xff0000) * i_521_ >> 23;
		if (i_522_ < 2)
			i_522_ = 2;
		else if (i_522_ > 253)
			i_522_ = 253;
		int i_523_ = (i & 0xff00) * i_521_ >> 15;
		if (i_523_ < 2)
			i_523_ = 2;
		else if (i_523_ > 253)
			i_523_ = 253;
		int i_524_ = (i & 0xff) * i_521_ >> 7;
		if (i_524_ < 2)
			i_524_ = 2;
		else if (i_524_ > 253)
			i_524_ = 253;
		return i_522_ << 16 | i_523_ << 8 | i_524_;
	}

	public void method6720(Class282_Sub24 class282_sub24, int[] is) {
		/* empty */
	}

	public void p() {
		((Class390_Sub3) this).aByteArrayArray9355 = null;
		((Class390_Sub3) this).aByteArrayArray9356 = null;
	}

	public void e() {
		((Class390_Sub3) this).aByteArrayArray9355 = null;
		((Class390_Sub3) this).aByteArrayArray9356 = null;
	}

	public void method6710(int i, int i_525_, int i_526_, int i_527_, int i_528_, int i_529_, int i_530_, boolean[][] bools) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		ChoppyItemFixClass class144 = ((Class185) class185).aClass144_2310;
		((ChoppyItemFixClass) class144).anInt1674 = 0;
		((ChoppyItemFixClass) class144).aBool1708 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.method14410();
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null || ((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14618(i, i_525_, i_526_, i_527_, i_528_, i_529_, i_530_, bools, class185, class144, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14622(i, i_525_, i_526_, i_527_, i_528_, i_529_, i_530_, bools, class185, class144, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342);
	}

	public void method6715(int i, int i_531_, int i_532_, int i_533_, int i_534_, int i_535_, int i_536_, boolean[][] bools) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		ChoppyItemFixClass class144 = ((Class185) class185).aClass144_2310;
		((ChoppyItemFixClass) class144).anInt1674 = 0;
		((ChoppyItemFixClass) class144).aBool1708 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.method14410();
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null || ((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14618(i, i_531_, i_532_, i_533_, i_534_, i_535_, i_536_, bools, class185, class144, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14622(i, i_531_, i_532_, i_533_, i_534_, i_535_, i_536_, bools, class185, class144, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342);
	}

	void method14625(int i, int i_537_, int i_538_) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		((ChoppyItemFixClass) ((Class185) class185).aClass144_2310).anInt1674 = 0;
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null)
			method14617(i, i_537_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_538_);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14636(i, i_537_, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_538_);
		else if (((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14619(i, i_537_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_538_);
	}

	void method14626(int i, int i_539_, int i_540_) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		((ChoppyItemFixClass) ((Class185) class185).aClass144_2310).anInt1674 = 0;
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null)
			method14617(i, i_539_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_540_);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14636(i, i_539_, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_540_);
		else if (((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14619(i, i_539_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_540_);
	}

	void method14627(int i, int i_541_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_542_, float[] fs_543_, float[] fs_544_, float[] fs_545_, int i_546_) {
		Class177 class177 = ((Class390_Sub3) this).aClass177ArrayArray9336[i][i_541_];
		if (class177 != null) {
			if ((((Class177) class177).aByte2210 & 0x2) == 0) {
				if (i_546_ != 0) {
					if ((((Class177) class177).aByte2210 & 0x4) != 0) {
						if ((i_546_ & 0x1) != 0)
							return;
					} else if ((i_546_ & 0x2) != 0)
						return;
				}
				int i_547_ = i * (anInt4774 * 750971439);
				int i_548_ = i_547_ + anInt4774 * 750971439;
				int i_549_ = i_541_ * (anInt4774 * 750971439);
				int i_550_ = i_549_ + anInt4774 * 750971439;
				float f = 0.0F;
				float f_551_ = 0.0F;
				float f_552_ = 0.0F;
				float f_553_ = 0.0F;
				float f_554_;
				float f_555_;
				float f_556_;
				float f_557_;
				float f_558_;
				float f_559_;
				float f_560_;
				float f_561_;
				float f_562_;
				float f_563_;
				float f_564_;
				float f_565_;
				float f_566_;
				float f_567_;
				float f_568_;
				float f_569_;
				if ((((Class177) class177).aByte2210 & 0x1) != 0 && !bool) {
					int i_570_ = anIntArrayArray4772[i][i_541_];
					float f_571_ = ((Class390_Sub3) this).aFloat9334 * (float) i_570_;
					float f_572_ = ((Class390_Sub3) this).aFloat9346 * (float) i_570_;
					float f_573_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_547_) + f_571_ + (((Class390_Sub3) this).aFloat9349 * (float) i_549_)));
					f_554_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_547_) + f_572_ + (((Class390_Sub3) this).aFloat9350 * (float) i_549_)));
					if (f_573_ < -f_554_)
						return;
					float f_574_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_548_) + f_571_ + (((Class390_Sub3) this).aFloat9349 * (float) i_549_)));
					f_555_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_548_) + f_572_ + (((Class390_Sub3) this).aFloat9350 * (float) i_549_)));
					if (f_574_ < -f_555_)
						return;
					float f_575_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_548_) + f_571_ + (((Class390_Sub3) this).aFloat9349 * (float) i_550_)));
					f_556_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_548_) + f_572_ + (((Class390_Sub3) this).aFloat9350 * (float) i_550_)));
					if (f_575_ < -f_556_)
						return;
					float f_576_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_547_) + f_571_ + (((Class390_Sub3) this).aFloat9349 * (float) i_550_)));
					f_557_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_547_) + f_572_ + (((Class390_Sub3) this).aFloat9350 * (float) i_550_)));
					if (f_576_ < -f_557_)
						return;
					f_558_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_573_ / f_554_));
					f_559_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_574_ / f_555_));
					f_560_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_575_ / f_556_));
					f_561_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_576_ / f_557_));
					if (((Class185) class185).aBool2304) {
						float f_577_ = f_573_ - ((Class185) class185).aFloat2305;
						if (f_577_ > 0.0F) {
							f = f_577_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_577_ = f_574_ - ((Class185) class185).aFloat2305;
						if (f_577_ > 0.0F) {
							f_551_ = f_577_ / ((Class185) class185).aFloat2303;
							if (f_551_ > 1.0F)
								f_551_ = 1.0F;
						}
						f_577_ = f_575_ - ((Class185) class185).aFloat2305;
						if (f_577_ > 0.0F) {
							f_552_ = f_577_ / ((Class185) class185).aFloat2303;
							if (f_552_ > 1.0F)
								f_552_ = 1.0F;
						}
						f_577_ = f_576_ - ((Class185) class185).aFloat2305;
						if (f_577_ > 0.0F) {
							f_553_ = f_577_ / ((Class185) class185).aFloat2303;
							if (f_553_ > 1.0F)
								f_553_ = 1.0F;
						}
					}
					float f_578_ = ((Class390_Sub3) this).aFloat9343 * (float) i_570_;
					float f_579_ = ((Class390_Sub3) this).aFloat9344 * (float) i_570_;
					float f_580_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_547_) + f_578_ + (((Class390_Sub3) this).aFloat9339 * (float) i_549_)));
					f_562_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_580_ / f_554_));
					float f_581_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_547_) + f_579_ + (((Class390_Sub3) this).aFloat9327 * (float) i_549_)));
					f_563_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_581_ / f_554_));
					float f_582_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_548_) + f_578_ + (((Class390_Sub3) this).aFloat9339 * (float) i_549_)));
					f_564_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_582_ / f_555_));
					float f_583_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_548_) + f_579_ + (((Class390_Sub3) this).aFloat9327 * (float) i_549_)));
					f_565_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_583_ / f_555_));
					float f_584_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_548_) + f_578_ + (((Class390_Sub3) this).aFloat9339 * (float) i_550_)));
					f_566_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_584_ / f_556_));
					float f_585_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_548_) + f_579_ + (((Class390_Sub3) this).aFloat9327 * (float) i_550_)));
					f_567_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_585_ / f_556_));
					float f_586_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_547_) + f_578_ + (((Class390_Sub3) this).aFloat9339 * (float) i_550_)));
					f_568_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_586_ / f_557_));
					float f_587_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_547_) + f_579_ + (((Class390_Sub3) this).aFloat9327 * (float) i_550_)));
					f_569_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_587_ / f_557_));
				} else {
					int i_588_ = anIntArrayArray4772[i][i_541_];
					int i_589_ = anIntArrayArray4772[i + 1][i_541_];
					int i_590_ = anIntArrayArray4772[i + 1][i_541_ + 1];
					int i_591_ = anIntArrayArray4772[i][i_541_ + 1];
					float f_592_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_547_) + (((Class390_Sub3) this).aFloat9334 * (float) i_588_) + (((Class390_Sub3) this).aFloat9349 * (float) i_549_)));
					f_554_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_547_) + (((Class390_Sub3) this).aFloat9346 * (float) i_588_) + (((Class390_Sub3) this).aFloat9350 * (float) i_549_)));
					if (f_592_ < -f_554_)
						return;
					float f_593_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_548_) + (((Class390_Sub3) this).aFloat9334 * (float) i_589_) + (((Class390_Sub3) this).aFloat9349 * (float) i_549_)));
					f_555_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_548_) + (((Class390_Sub3) this).aFloat9346 * (float) i_589_) + (((Class390_Sub3) this).aFloat9350 * (float) i_549_)));
					if (f_593_ < -f_555_)
						return;
					float f_594_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_548_) + (((Class390_Sub3) this).aFloat9334 * (float) i_590_) + (((Class390_Sub3) this).aFloat9349 * (float) i_550_)));
					f_556_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_548_) + (((Class390_Sub3) this).aFloat9346 * (float) i_590_) + (((Class390_Sub3) this).aFloat9350 * (float) i_550_)));
					if (f_594_ < -f_556_)
						return;
					float f_595_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_547_) + (((Class390_Sub3) this).aFloat9334 * (float) i_591_) + (((Class390_Sub3) this).aFloat9349 * (float) i_550_)));
					f_557_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_547_) + (((Class390_Sub3) this).aFloat9346 * (float) i_591_) + (((Class390_Sub3) this).aFloat9350 * (float) i_550_)));
					if (f_595_ < -f_557_)
						return;
					f_558_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_592_ / f_554_));
					f_559_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_593_ / f_555_));
					f_560_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_594_ / f_556_));
					f_561_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_595_ / f_557_));
					if (bool) {
						float f_596_ = f_592_ - ((Class185) class185).aFloat2305;
						if (f_596_ > 0.0F) {
							f_596_ /= ((Class185) class185).aFloat2303;
							if (f_596_ > 1.0F)
								f_596_ = 1.0F;
							f = f_596_;
							int i_597_ = (int) ((float) (((Class177) class177).aShort2207) * f_596_);
							if (i_597_ > 0)
								i_588_ -= i_597_;
						}
						f_596_ = f_593_ - ((Class185) class185).aFloat2305;
						if (f_596_ > 0.0F) {
							f_596_ /= ((Class185) class185).aFloat2303;
							if (f_596_ > 1.0F)
								f_596_ = 1.0F;
							f_551_ = f_596_;
							int i_598_ = (int) ((float) (((Class177) class177).aShort2202) * f_596_);
							if (i_598_ > 0)
								i_589_ -= i_598_;
						}
						f_596_ = f_594_ - ((Class185) class185).aFloat2305;
						if (f_596_ > 0.0F) {
							f_596_ /= ((Class185) class185).aFloat2303;
							if (f_596_ > 1.0F)
								f_596_ = 1.0F;
							f_552_ = f_596_;
							int i_599_ = (int) ((float) (((Class177) class177).aShort2208) * f_596_);
							if (i_599_ > 0)
								i_590_ -= i_599_;
						}
						f_596_ = f_595_ - ((Class185) class185).aFloat2305;
						if (f_596_ > 0.0F) {
							f_596_ /= ((Class185) class185).aFloat2303;
							if (f_596_ > 1.0F)
								f_596_ = 1.0F;
							f_553_ = f_596_;
							int i_600_ = (int) ((float) (((Class177) class177).aShort2205) * f_596_);
							if (i_600_ > 0)
								i_591_ -= i_600_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_601_ = f_592_ - ((Class185) class185).aFloat2305;
						if (f_601_ > 0.0F) {
							f = f_601_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_601_ = f_593_ - ((Class185) class185).aFloat2305;
						if (f_601_ > 0.0F) {
							f_551_ = f_601_ / ((Class185) class185).aFloat2303;
							if (f_551_ > 1.0F)
								f_551_ = 1.0F;
						}
						f_601_ = f_594_ - ((Class185) class185).aFloat2305;
						if (f_601_ > 0.0F) {
							f_552_ = f_601_ / ((Class185) class185).aFloat2303;
							if (f_552_ > 1.0F)
								f_552_ = 1.0F;
						}
						f_601_ = f_595_ - ((Class185) class185).aFloat2305;
						if (f_601_ > 0.0F) {
							f_553_ = f_601_ / ((Class185) class185).aFloat2303;
							if (f_553_ > 1.0F)
								f_553_ = 1.0F;
						}
					}
					float f_602_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_547_) + (((Class390_Sub3) this).aFloat9343 * (float) i_588_) + (((Class390_Sub3) this).aFloat9339 * (float) i_549_)));
					f_562_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_602_ / f_554_));
					float f_603_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_547_) + (((Class390_Sub3) this).aFloat9344 * (float) i_588_) + (((Class390_Sub3) this).aFloat9327 * (float) i_549_)));
					f_563_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_603_ / f_554_));
					float f_604_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_548_) + (((Class390_Sub3) this).aFloat9343 * (float) i_589_) + (((Class390_Sub3) this).aFloat9339 * (float) i_549_)));
					f_564_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_604_ / f_555_));
					float f_605_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_548_) + (((Class390_Sub3) this).aFloat9344 * (float) i_589_) + (((Class390_Sub3) this).aFloat9327 * (float) i_549_)));
					f_565_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_605_ / f_555_));
					float f_606_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_548_) + (((Class390_Sub3) this).aFloat9343 * (float) i_590_) + (((Class390_Sub3) this).aFloat9339 * (float) i_550_)));
					f_566_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_606_ / f_556_));
					float f_607_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_548_) + (((Class390_Sub3) this).aFloat9344 * (float) i_590_) + (((Class390_Sub3) this).aFloat9327 * (float) i_550_)));
					f_567_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_607_ / f_556_));
					float f_608_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_547_) + (((Class390_Sub3) this).aFloat9343 * (float) i_591_) + (((Class390_Sub3) this).aFloat9339 * (float) i_550_)));
					f_568_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_608_ / f_557_));
					float f_609_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_547_) + (((Class390_Sub3) this).aFloat9344 * (float) i_591_) + (((Class390_Sub3) this).aFloat9327 * (float) i_550_)));
					f_569_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_609_ / f_557_));
				}
				boolean bool_610_ = (((Class177) class177).aShort2212 != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(((Class177) class177).aShort2212, -1855279147).aByte2064));
				float f_611_ = f_551_ + f_552_ + f_553_;
				if (((f_566_ - f_568_) * (f_565_ - f_569_) - (f_567_ - f_569_) * (f_564_ - f_568_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_566_ < 0.0F || f_568_ < 0.0F || f_564_ < 0.0F || f_566_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_568_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_564_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_611_ < 3.0F) {
						if (f_611_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_612_ = -16777216;
								if (bool_610_)
									i_612_ = -1694498816;
								class144.method2424(true, true, false, f_567_, f_569_, f_565_, f_566_, f_568_, f_564_, f_560_, f_561_, f_559_, f_556_, f_557_, f_555_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_612_ | (((Class177) class177).anInt2211 & 0xffffff), i_612_ | (((Class177) class177).anInt2206 & 0xffffff), i_612_ | (((Class177) class177).anInt2204 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f_552_ * 255.0F, f_553_ * 255.0F, f_551_ * 255.0F,
										((Class177) class177).aShort2212);
							} else {
								if (bool_610_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_567_, f_569_, f_565_, f_566_, f_568_, f_564_, f_560_, f_561_, f_559_, (Class323.method5773(((Class177) class177).anInt2211, ((int) (f_552_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -89)), (Class323.method5773(((Class177) class177).anInt2206, ((int) (f_553_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -51)),
										(Class323.method5773(((Class177) class177).anInt2204, ((int) (f_551_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) 4)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_613_ = -16777216;
							if (bool_610_)
								i_613_ = -1694498816;
							class144.method2424(true, true, false, f_567_, f_569_, f_565_, f_566_, f_568_, f_564_, f_560_, f_561_, f_559_, f_556_, f_557_, f_555_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_613_ | (((Class177) class177).anInt2211 & 0xffffff), i_613_ | (((Class177) class177).anInt2206 & 0xffffff), i_613_ | (((Class177) class177).anInt2204 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_610_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_567_, f_569_, f_565_, f_566_, f_568_, f_564_, f_560_, f_561_, f_559_, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_567_, f_569_, f_565_, f_566_, f_568_, f_564_, f_560_, f_561_, f_559_, (((Class185) class185).anInt2307 * 1402414887));
				}
				f_611_ = f + f_551_ + f_553_;
				if (((f_562_ - f_564_) * (f_569_ - f_565_) - (f_563_ - f_565_) * (f_568_ - f_564_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_562_ < 0.0F || f_564_ < 0.0F || f_568_ < 0.0F || f_562_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_564_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_568_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_611_ < 3.0F) {
						if (bool_610_)
							((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
						if (f_611_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_614_ = -16777216;
								if (bool_610_)
									i_614_ = -1694498816;
								class144.method2424(true, true, false, f_563_, f_565_, f_569_, f_562_, f_564_, f_568_, f_558_, f_559_, f_561_, f_554_, f_555_, f_557_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_614_ | (((Class177) class177).anInt2209 & 0xffffff), i_614_ | (((Class177) class177).anInt2204 & 0xffffff), i_614_ | (((Class177) class177).anInt2206 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f * 255.0F, f_551_ * 255.0F, f_553_ * 255.0F, ((Class177) class177).aShort2212);
							} else {
								if (bool_610_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_563_, f_565_, f_569_, f_562_, f_564_, f_568_, f_558_, f_559_, f_561_, (Class323.method5773(((Class177) class177).anInt2209, ((int) (f * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -99)), (Class323.method5773(((Class177) class177).anInt2204, ((int) (f_551_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -5)),
										(Class323.method5773(((Class177) class177).anInt2206, ((int) (f_553_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -61)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_615_ = -16777216;
							if (bool_610_)
								i_615_ = -1694498816;
							class144.method2424(true, true, false, f_563_, f_565_, f_569_, f_562_, f_564_, f_568_, f_558_, f_559_, f_561_, f_554_, f_555_, f_557_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_615_ | (((Class177) class177).anInt2209 & 0xffffff), i_615_ | (((Class177) class177).anInt2204 & 0xffffff), i_615_ | (((Class177) class177).anInt2206 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_610_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_563_, f_565_, f_569_, f_562_, f_564_, f_568_, f_558_, f_559_, f_561_, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_563_, f_565_, f_569_, f_562_, f_564_, f_568_, f_558_, f_559_, f_561_, (((Class185) class185).anInt2307 * 1402414887));
				}
			}
		} else {
			Class196 class196 = ((Class390_Sub3) this).aClass196ArrayArray9337[i][i_541_];
			if (class196 != null) {
				if (i_546_ != 0) {
					if ((((Class196) class196).aByte2414 & 0x4) != 0) {
						if ((i_546_ & 0x1) != 0)
							return;
					} else if ((i_546_ & 0x2) != 0)
						return;
				}
				for (int i_616_ = 0; i_616_ < ((Class196) class196).aShort2421; i_616_++) {
					int i_617_ = (((Class196) class196).aShortArray2416[i_616_] + (i << anInt4775 * 1856651955));
					int i_618_ = ((Class196) class196).aShortArray2417[i_616_];
					int i_619_ = (((Class196) class196).aShortArray2418[i_616_] + (i_541_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_617_) + (((Class390_Sub3) this).aFloat9334 * (float) i_618_) + (((Class390_Sub3) this).aFloat9349 * (float) i_619_)));
					float f_620_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_617_) + (((Class390_Sub3) this).aFloat9346 * (float) i_618_) + (((Class390_Sub3) this).aFloat9350 * (float) i_619_)));
					if (f < -f_620_)
						return;
					float f_621_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_620_);
					fs_545_[i_616_] = 0.0F;
					if (bool) {
						float f_622_ = f - ((Class185) class185).aFloat2305;
						if (f_622_ > 0.0F) {
							f_622_ /= ((Class185) class185).aFloat2303;
							if (f_622_ > 1.0F)
								f_622_ = 1.0F;
							fs_545_[i_616_] = f_622_;
							int i_623_ = (int) ((float) (((Class196) class196).aShortArray2419[i_616_]) * f_622_);
							if (i_623_ > 0)
								i_618_ -= i_623_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_624_ = f - ((Class185) class185).aFloat2305;
						if (f_624_ > 0.0F) {
							fs_545_[i_616_] = f_624_ / ((Class185) class185).aFloat2303;
							if (fs_545_[i_616_] > 1.0F)
								fs_545_[i_616_] = 1.0F;
						}
					}
					float f_625_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_617_) + (((Class390_Sub3) this).aFloat9343 * (float) i_618_) + (((Class390_Sub3) this).aFloat9339 * (float) i_619_)));
					float f_626_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_617_) + (((Class390_Sub3) this).aFloat9344 * (float) i_618_) + (((Class390_Sub3) this).aFloat9327 * (float) i_619_)));
					fs[i_616_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_625_ / f_620_));
					fs_542_[i_616_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_626_ / f_620_));
					fs_543_[i_616_] = f_621_;
					fs_544_[i_616_] = f_620_;
				}
				if (((Class196) class196).aShortArray2413 != null) {
					for (int i_627_ = 0; i_627_ < ((Class196) class196).aShort2415; i_627_++) {
						int i_628_ = i_627_ * 3;
						int i_629_ = i_628_ + 1;
						int i_630_ = i_629_ + 1;
						float f = fs[i_628_];
						float f_631_ = fs[i_629_];
						float f_632_ = fs[i_630_];
						float f_633_ = fs_542_[i_628_];
						float f_634_ = fs_542_[i_629_];
						float f_635_ = fs_542_[i_630_];
						float f_636_ = (fs_545_[i_628_] + fs_545_[i_629_] + fs_545_[i_630_]);
						if (((f - f_631_) * (f_635_ - f_634_) - (f_633_ - f_634_) * (f_632_ - f_631_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_631_ < 0.0F || f_632_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_631_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_632_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							short i_637_ = (((Class196) class196).aShortArray2413[i_627_]);
							if (f_636_ < 3.0F) {
								if (f_636_ > 0.0F) {
									if (i_637_ != -1) {
										int i_638_ = -16777216;
										if (i_637_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_637_, -1873464801).aByte2064)))
											i_638_ = -1694498816;
										class144.method2424(true, true, false, f_633_, f_634_, f_635_, f, f_631_, f_632_, fs_543_[i_628_], fs_543_[i_629_], fs_543_[i_630_], fs_544_[i_628_], fs_544_[i_629_], fs_544_[i_630_], ((float) (((Class196) class196).aShortArray2416[i_628_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_629_]) / (float) (anInt4774 * 750971439)),
												((float) (((Class196) class196).aShortArray2416[i_630_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_628_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_629_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_630_]) / (float) (anInt4774 * 750971439)), i_638_ | (((Class196) class196).anIntArray2420[i_628_]) & 0xffffff,
												i_638_ | (((Class196) class196).anIntArray2420[i_629_]) & 0xffffff, i_638_ | (((Class196) class196).anIntArray2420[i_630_]) & 0xffffff, (((Class185) class185).anInt2307 * 1402414887), fs_545_[i_628_] * 255.0F, fs_545_[i_629_] * 255.0F, fs_545_[i_630_] * 255.0F, i_637_);
									} else if (((((Class196) class196).anIntArray2420[i_628_]) & 0xffffff) != 0) {
										if (i_637_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_637_, -2098559247).aByte2064)))
											((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
										class144.method2425(true, true, false, f_633_, f_634_, f_635_, f, f_631_, f_632_, fs_543_[i_628_], fs_543_[i_629_], fs_543_[i_630_], (Class323.method5773((((Class196) class196).anIntArray2420[i_628_]), ((int) (fs_545_[i_628_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -115)),
												(Class323.method5773((((Class196) class196).anIntArray2420[i_629_]), ((int) (fs_545_[i_629_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -14)), (Class323.method5773((((Class196) class196).anIntArray2420[i_630_]), ((int) (fs_545_[i_630_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -89)));
										((ChoppyItemFixClass) class144).anInt1674 = 0;
									}
								} else if (i_637_ != -1) {
									int i_639_ = -16777216;
									if (i_637_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_637_, -1893399870).aByte2064))
										i_639_ = -1694498816;
									class144.method2424(true, true, false, f_633_, f_634_, f_635_, f, f_631_, f_632_, fs_543_[i_628_], fs_543_[i_629_], fs_543_[i_630_], fs_544_[i_628_], fs_544_[i_629_], fs_544_[i_630_], ((float) (((Class196) class196).aShortArray2416[i_628_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_629_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_630_]) / (float) (anInt4774 * 750971439)),
											((float) (((Class196) class196).aShortArray2418[i_628_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_629_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_630_]) / (float) (anInt4774 * 750971439)), i_639_ | ((((Class196) class196).anIntArray2420[i_628_]) & 0xffffff), i_639_ | ((((Class196) class196).anIntArray2420[i_629_]) & 0xffffff),
											i_639_ | ((((Class196) class196).anIntArray2420[i_630_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_637_);
								} else if (((((Class196) class196).anIntArray2420[i_628_]) & 0xffffff) != 0) {
									if (i_637_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_637_, -1884038768).aByte2064))
										((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
									class144.method2425(true, true, false, f_633_, f_634_, f_635_, f, f_631_, f_632_, fs_543_[i_628_], fs_543_[i_629_], fs_543_[i_630_], (((Class196) class196).anIntArray2420[i_628_]), (((Class196) class196).anIntArray2420[i_629_]), (((Class196) class196).anIntArray2420[i_630_]));
									((ChoppyItemFixClass) class144).anInt1674 = 0;
								}
							} else
								class144.method2428(true, true, false, f_633_, f_634_, f_635_, f, f_631_, f_632_, fs_543_[i_628_], fs_543_[i_629_], fs_543_[i_630_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				} else {
					for (int i_640_ = 0; i_640_ < ((Class196) class196).aShort2415; i_640_++) {
						int i_641_ = i_640_ * 3;
						int i_642_ = i_641_ + 1;
						int i_643_ = i_642_ + 1;
						float f = fs[i_641_];
						float f_644_ = fs[i_642_];
						float f_645_ = fs[i_643_];
						float f_646_ = fs_542_[i_641_];
						float f_647_ = fs_542_[i_642_];
						float f_648_ = fs_542_[i_643_];
						float f_649_ = (fs_545_[i_641_] + fs_545_[i_642_] + fs_545_[i_643_]);
						if (((f - f_644_) * (f_648_ - f_647_) - (f_646_ - f_647_) * (f_645_ - f_644_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_644_ < 0.0F || f_645_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_644_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_645_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							if (f_649_ < 3.0F) {
								if (f_649_ > 0.0F) {
									if (((((Class196) class196).anIntArray2420[i_641_]) & 0xffffff) != 0)
										class144.method2425(true, true, false, f_646_, f_647_, f_648_, f, f_644_, f_645_, fs_543_[i_641_], fs_543_[i_642_], fs_543_[i_643_], (Class302.method5364((((Class196) class196).anIntArray2420[i_641_]), (((Class185) class185).anInt2307 * 1402414887), fs_545_[i_641_] * 255.0F, 833509259)), (Class302.method5364((((Class196) class196).anIntArray2420[i_642_]), (((Class185) class185).anInt2307 * 1402414887), fs_545_[i_642_] * 255.0F, 833509259)),
												(Class302.method5364((((Class196) class196).anIntArray2420[i_643_]), (((Class185) class185).anInt2307 * 1402414887), fs_545_[i_643_] * 255.0F, 833509259)));
								} else if (((((Class196) class196).anIntArray2420[i_641_]) & 0xffffff) != 0)
									class144.method2425(true, true, false, f_646_, f_647_, f_648_, f, f_644_, f_645_, fs_543_[i_641_], fs_543_[i_642_], fs_543_[i_643_], (((Class196) class196).anIntArray2420[i_641_]), (((Class196) class196).anIntArray2420[i_642_]), (((Class196) class196).anIntArray2420[i_643_]));
							} else
								class144.method2428(true, true, false, f_646_, f_647_, f_648_, f, f_644_, f_645_, fs_543_[i_641_], fs_543_[i_642_], fs_543_[i_643_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				}
			}
		}
	}

	void method14628(int i, int i_650_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_651_, float[] fs_652_, float[] fs_653_, float[] fs_654_, int i_655_) {
		Class177 class177 = ((Class390_Sub3) this).aClass177ArrayArray9336[i][i_650_];
		if (class177 != null) {
			if ((((Class177) class177).aByte2210 & 0x2) == 0) {
				if (i_655_ != 0) {
					if ((((Class177) class177).aByte2210 & 0x4) != 0) {
						if ((i_655_ & 0x1) != 0)
							return;
					} else if ((i_655_ & 0x2) != 0)
						return;
				}
				int i_656_ = i * (anInt4774 * 750971439);
				int i_657_ = i_656_ + anInt4774 * 750971439;
				int i_658_ = i_650_ * (anInt4774 * 750971439);
				int i_659_ = i_658_ + anInt4774 * 750971439;
				float f = 0.0F;
				float f_660_ = 0.0F;
				float f_661_ = 0.0F;
				float f_662_ = 0.0F;
				float f_663_;
				float f_664_;
				float f_665_;
				float f_666_;
				float f_667_;
				float f_668_;
				float f_669_;
				float f_670_;
				float f_671_;
				float f_672_;
				float f_673_;
				float f_674_;
				float f_675_;
				float f_676_;
				float f_677_;
				float f_678_;
				if ((((Class177) class177).aByte2210 & 0x1) != 0 && !bool) {
					int i_679_ = anIntArrayArray4772[i][i_650_];
					float f_680_ = ((Class390_Sub3) this).aFloat9334 * (float) i_679_;
					float f_681_ = ((Class390_Sub3) this).aFloat9346 * (float) i_679_;
					float f_682_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_656_) + f_680_ + (((Class390_Sub3) this).aFloat9349 * (float) i_658_)));
					f_663_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_656_) + f_681_ + (((Class390_Sub3) this).aFloat9350 * (float) i_658_)));
					if (f_682_ < -f_663_)
						return;
					float f_683_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_657_) + f_680_ + (((Class390_Sub3) this).aFloat9349 * (float) i_658_)));
					f_664_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_657_) + f_681_ + (((Class390_Sub3) this).aFloat9350 * (float) i_658_)));
					if (f_683_ < -f_664_)
						return;
					float f_684_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_657_) + f_680_ + (((Class390_Sub3) this).aFloat9349 * (float) i_659_)));
					f_665_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_657_) + f_681_ + (((Class390_Sub3) this).aFloat9350 * (float) i_659_)));
					if (f_684_ < -f_665_)
						return;
					float f_685_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_656_) + f_680_ + (((Class390_Sub3) this).aFloat9349 * (float) i_659_)));
					f_666_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_656_) + f_681_ + (((Class390_Sub3) this).aFloat9350 * (float) i_659_)));
					if (f_685_ < -f_666_)
						return;
					f_667_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_682_ / f_663_));
					f_668_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_683_ / f_664_));
					f_669_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_684_ / f_665_));
					f_670_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_685_ / f_666_));
					if (((Class185) class185).aBool2304) {
						float f_686_ = f_682_ - ((Class185) class185).aFloat2305;
						if (f_686_ > 0.0F) {
							f = f_686_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_686_ = f_683_ - ((Class185) class185).aFloat2305;
						if (f_686_ > 0.0F) {
							f_660_ = f_686_ / ((Class185) class185).aFloat2303;
							if (f_660_ > 1.0F)
								f_660_ = 1.0F;
						}
						f_686_ = f_684_ - ((Class185) class185).aFloat2305;
						if (f_686_ > 0.0F) {
							f_661_ = f_686_ / ((Class185) class185).aFloat2303;
							if (f_661_ > 1.0F)
								f_661_ = 1.0F;
						}
						f_686_ = f_685_ - ((Class185) class185).aFloat2305;
						if (f_686_ > 0.0F) {
							f_662_ = f_686_ / ((Class185) class185).aFloat2303;
							if (f_662_ > 1.0F)
								f_662_ = 1.0F;
						}
					}
					float f_687_ = ((Class390_Sub3) this).aFloat9343 * (float) i_679_;
					float f_688_ = ((Class390_Sub3) this).aFloat9344 * (float) i_679_;
					float f_689_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_656_) + f_687_ + (((Class390_Sub3) this).aFloat9339 * (float) i_658_)));
					f_671_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_689_ / f_663_));
					float f_690_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_656_) + f_688_ + (((Class390_Sub3) this).aFloat9327 * (float) i_658_)));
					f_672_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_690_ / f_663_));
					float f_691_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_657_) + f_687_ + (((Class390_Sub3) this).aFloat9339 * (float) i_658_)));
					f_673_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_691_ / f_664_));
					float f_692_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_657_) + f_688_ + (((Class390_Sub3) this).aFloat9327 * (float) i_658_)));
					f_674_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_692_ / f_664_));
					float f_693_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_657_) + f_687_ + (((Class390_Sub3) this).aFloat9339 * (float) i_659_)));
					f_675_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_693_ / f_665_));
					float f_694_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_657_) + f_688_ + (((Class390_Sub3) this).aFloat9327 * (float) i_659_)));
					f_676_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_694_ / f_665_));
					float f_695_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_656_) + f_687_ + (((Class390_Sub3) this).aFloat9339 * (float) i_659_)));
					f_677_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_695_ / f_666_));
					float f_696_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_656_) + f_688_ + (((Class390_Sub3) this).aFloat9327 * (float) i_659_)));
					f_678_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_696_ / f_666_));
				} else {
					int i_697_ = anIntArrayArray4772[i][i_650_];
					int i_698_ = anIntArrayArray4772[i + 1][i_650_];
					int i_699_ = anIntArrayArray4772[i + 1][i_650_ + 1];
					int i_700_ = anIntArrayArray4772[i][i_650_ + 1];
					float f_701_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_656_) + (((Class390_Sub3) this).aFloat9334 * (float) i_697_) + (((Class390_Sub3) this).aFloat9349 * (float) i_658_)));
					f_663_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_656_) + (((Class390_Sub3) this).aFloat9346 * (float) i_697_) + (((Class390_Sub3) this).aFloat9350 * (float) i_658_)));
					if (f_701_ < -f_663_)
						return;
					float f_702_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_657_) + (((Class390_Sub3) this).aFloat9334 * (float) i_698_) + (((Class390_Sub3) this).aFloat9349 * (float) i_658_)));
					f_664_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_657_) + (((Class390_Sub3) this).aFloat9346 * (float) i_698_) + (((Class390_Sub3) this).aFloat9350 * (float) i_658_)));
					if (f_702_ < -f_664_)
						return;
					float f_703_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_657_) + (((Class390_Sub3) this).aFloat9334 * (float) i_699_) + (((Class390_Sub3) this).aFloat9349 * (float) i_659_)));
					f_665_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_657_) + (((Class390_Sub3) this).aFloat9346 * (float) i_699_) + (((Class390_Sub3) this).aFloat9350 * (float) i_659_)));
					if (f_703_ < -f_665_)
						return;
					float f_704_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_656_) + (((Class390_Sub3) this).aFloat9334 * (float) i_700_) + (((Class390_Sub3) this).aFloat9349 * (float) i_659_)));
					f_666_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_656_) + (((Class390_Sub3) this).aFloat9346 * (float) i_700_) + (((Class390_Sub3) this).aFloat9350 * (float) i_659_)));
					if (f_704_ < -f_666_)
						return;
					f_667_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_701_ / f_663_));
					f_668_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_702_ / f_664_));
					f_669_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_703_ / f_665_));
					f_670_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_704_ / f_666_));
					if (bool) {
						float f_705_ = f_701_ - ((Class185) class185).aFloat2305;
						if (f_705_ > 0.0F) {
							f_705_ /= ((Class185) class185).aFloat2303;
							if (f_705_ > 1.0F)
								f_705_ = 1.0F;
							f = f_705_;
							int i_706_ = (int) ((float) (((Class177) class177).aShort2207) * f_705_);
							if (i_706_ > 0)
								i_697_ -= i_706_;
						}
						f_705_ = f_702_ - ((Class185) class185).aFloat2305;
						if (f_705_ > 0.0F) {
							f_705_ /= ((Class185) class185).aFloat2303;
							if (f_705_ > 1.0F)
								f_705_ = 1.0F;
							f_660_ = f_705_;
							int i_707_ = (int) ((float) (((Class177) class177).aShort2202) * f_705_);
							if (i_707_ > 0)
								i_698_ -= i_707_;
						}
						f_705_ = f_703_ - ((Class185) class185).aFloat2305;
						if (f_705_ > 0.0F) {
							f_705_ /= ((Class185) class185).aFloat2303;
							if (f_705_ > 1.0F)
								f_705_ = 1.0F;
							f_661_ = f_705_;
							int i_708_ = (int) ((float) (((Class177) class177).aShort2208) * f_705_);
							if (i_708_ > 0)
								i_699_ -= i_708_;
						}
						f_705_ = f_704_ - ((Class185) class185).aFloat2305;
						if (f_705_ > 0.0F) {
							f_705_ /= ((Class185) class185).aFloat2303;
							if (f_705_ > 1.0F)
								f_705_ = 1.0F;
							f_662_ = f_705_;
							int i_709_ = (int) ((float) (((Class177) class177).aShort2205) * f_705_);
							if (i_709_ > 0)
								i_700_ -= i_709_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_710_ = f_701_ - ((Class185) class185).aFloat2305;
						if (f_710_ > 0.0F) {
							f = f_710_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_710_ = f_702_ - ((Class185) class185).aFloat2305;
						if (f_710_ > 0.0F) {
							f_660_ = f_710_ / ((Class185) class185).aFloat2303;
							if (f_660_ > 1.0F)
								f_660_ = 1.0F;
						}
						f_710_ = f_703_ - ((Class185) class185).aFloat2305;
						if (f_710_ > 0.0F) {
							f_661_ = f_710_ / ((Class185) class185).aFloat2303;
							if (f_661_ > 1.0F)
								f_661_ = 1.0F;
						}
						f_710_ = f_704_ - ((Class185) class185).aFloat2305;
						if (f_710_ > 0.0F) {
							f_662_ = f_710_ / ((Class185) class185).aFloat2303;
							if (f_662_ > 1.0F)
								f_662_ = 1.0F;
						}
					}
					float f_711_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_656_) + (((Class390_Sub3) this).aFloat9343 * (float) i_697_) + (((Class390_Sub3) this).aFloat9339 * (float) i_658_)));
					f_671_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_711_ / f_663_));
					float f_712_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_656_) + (((Class390_Sub3) this).aFloat9344 * (float) i_697_) + (((Class390_Sub3) this).aFloat9327 * (float) i_658_)));
					f_672_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_712_ / f_663_));
					float f_713_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_657_) + (((Class390_Sub3) this).aFloat9343 * (float) i_698_) + (((Class390_Sub3) this).aFloat9339 * (float) i_658_)));
					f_673_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_713_ / f_664_));
					float f_714_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_657_) + (((Class390_Sub3) this).aFloat9344 * (float) i_698_) + (((Class390_Sub3) this).aFloat9327 * (float) i_658_)));
					f_674_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_714_ / f_664_));
					float f_715_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_657_) + (((Class390_Sub3) this).aFloat9343 * (float) i_699_) + (((Class390_Sub3) this).aFloat9339 * (float) i_659_)));
					f_675_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_715_ / f_665_));
					float f_716_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_657_) + (((Class390_Sub3) this).aFloat9344 * (float) i_699_) + (((Class390_Sub3) this).aFloat9327 * (float) i_659_)));
					f_676_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_716_ / f_665_));
					float f_717_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_656_) + (((Class390_Sub3) this).aFloat9343 * (float) i_700_) + (((Class390_Sub3) this).aFloat9339 * (float) i_659_)));
					f_677_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_717_ / f_666_));
					float f_718_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_656_) + (((Class390_Sub3) this).aFloat9344 * (float) i_700_) + (((Class390_Sub3) this).aFloat9327 * (float) i_659_)));
					f_678_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_718_ / f_666_));
				}
				boolean bool_719_ = (((Class177) class177).aShort2212 != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(((Class177) class177).aShort2212, -2048506019).aByte2064));
				float f_720_ = f_660_ + f_661_ + f_662_;
				if (((f_675_ - f_677_) * (f_674_ - f_678_) - (f_676_ - f_678_) * (f_673_ - f_677_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_675_ < 0.0F || f_677_ < 0.0F || f_673_ < 0.0F || f_675_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_677_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_673_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_720_ < 3.0F) {
						if (f_720_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_721_ = -16777216;
								if (bool_719_)
									i_721_ = -1694498816;
								class144.method2424(true, true, false, f_676_, f_678_, f_674_, f_675_, f_677_, f_673_, f_669_, f_670_, f_668_, f_665_, f_666_, f_664_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_721_ | (((Class177) class177).anInt2211 & 0xffffff), i_721_ | (((Class177) class177).anInt2206 & 0xffffff), i_721_ | (((Class177) class177).anInt2204 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f_661_ * 255.0F, f_662_ * 255.0F, f_660_ * 255.0F,
										((Class177) class177).aShort2212);
							} else {
								if (bool_719_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_676_, f_678_, f_674_, f_675_, f_677_, f_673_, f_669_, f_670_, f_668_, (Class323.method5773(((Class177) class177).anInt2211, ((int) (f_661_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -83)), (Class323.method5773(((Class177) class177).anInt2206, ((int) (f_662_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -58)),
										(Class323.method5773(((Class177) class177).anInt2204, ((int) (f_660_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -83)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_722_ = -16777216;
							if (bool_719_)
								i_722_ = -1694498816;
							class144.method2424(true, true, false, f_676_, f_678_, f_674_, f_675_, f_677_, f_673_, f_669_, f_670_, f_668_, f_665_, f_666_, f_664_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_722_ | (((Class177) class177).anInt2211 & 0xffffff), i_722_ | (((Class177) class177).anInt2206 & 0xffffff), i_722_ | (((Class177) class177).anInt2204 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_719_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_676_, f_678_, f_674_, f_675_, f_677_, f_673_, f_669_, f_670_, f_668_, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_676_, f_678_, f_674_, f_675_, f_677_, f_673_, f_669_, f_670_, f_668_, (((Class185) class185).anInt2307 * 1402414887));
				}
				f_720_ = f + f_660_ + f_662_;
				if (((f_671_ - f_673_) * (f_678_ - f_674_) - (f_672_ - f_674_) * (f_677_ - f_673_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_671_ < 0.0F || f_673_ < 0.0F || f_677_ < 0.0F || f_671_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_673_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_677_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_720_ < 3.0F) {
						if (bool_719_)
							((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
						if (f_720_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_723_ = -16777216;
								if (bool_719_)
									i_723_ = -1694498816;
								class144.method2424(true, true, false, f_672_, f_674_, f_678_, f_671_, f_673_, f_677_, f_667_, f_668_, f_670_, f_663_, f_664_, f_666_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_723_ | (((Class177) class177).anInt2209 & 0xffffff), i_723_ | (((Class177) class177).anInt2204 & 0xffffff), i_723_ | (((Class177) class177).anInt2206 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f * 255.0F, f_660_ * 255.0F, f_662_ * 255.0F, ((Class177) class177).aShort2212);
							} else {
								if (bool_719_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_672_, f_674_, f_678_, f_671_, f_673_, f_677_, f_667_, f_668_, f_670_, (Class323.method5773(((Class177) class177).anInt2209, ((int) (f * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -18)), (Class323.method5773(((Class177) class177).anInt2204, ((int) (f_660_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -36)),
										(Class323.method5773(((Class177) class177).anInt2206, ((int) (f_662_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -83)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_724_ = -16777216;
							if (bool_719_)
								i_724_ = -1694498816;
							class144.method2424(true, true, false, f_672_, f_674_, f_678_, f_671_, f_673_, f_677_, f_667_, f_668_, f_670_, f_663_, f_664_, f_666_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_724_ | (((Class177) class177).anInt2209 & 0xffffff), i_724_ | (((Class177) class177).anInt2204 & 0xffffff), i_724_ | (((Class177) class177).anInt2206 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_719_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_672_, f_674_, f_678_, f_671_, f_673_, f_677_, f_667_, f_668_, f_670_, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_672_, f_674_, f_678_, f_671_, f_673_, f_677_, f_667_, f_668_, f_670_, (((Class185) class185).anInt2307 * 1402414887));
				}
			}
		} else {
			Class196 class196 = ((Class390_Sub3) this).aClass196ArrayArray9337[i][i_650_];
			if (class196 != null) {
				if (i_655_ != 0) {
					if ((((Class196) class196).aByte2414 & 0x4) != 0) {
						if ((i_655_ & 0x1) != 0)
							return;
					} else if ((i_655_ & 0x2) != 0)
						return;
				}
				for (int i_725_ = 0; i_725_ < ((Class196) class196).aShort2421; i_725_++) {
					int i_726_ = (((Class196) class196).aShortArray2416[i_725_] + (i << anInt4775 * 1856651955));
					int i_727_ = ((Class196) class196).aShortArray2417[i_725_];
					int i_728_ = (((Class196) class196).aShortArray2418[i_725_] + (i_650_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_726_) + (((Class390_Sub3) this).aFloat9334 * (float) i_727_) + (((Class390_Sub3) this).aFloat9349 * (float) i_728_)));
					float f_729_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_726_) + (((Class390_Sub3) this).aFloat9346 * (float) i_727_) + (((Class390_Sub3) this).aFloat9350 * (float) i_728_)));
					if (f < -f_729_)
						return;
					float f_730_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_729_);
					fs_654_[i_725_] = 0.0F;
					if (bool) {
						float f_731_ = f - ((Class185) class185).aFloat2305;
						if (f_731_ > 0.0F) {
							f_731_ /= ((Class185) class185).aFloat2303;
							if (f_731_ > 1.0F)
								f_731_ = 1.0F;
							fs_654_[i_725_] = f_731_;
							int i_732_ = (int) ((float) (((Class196) class196).aShortArray2419[i_725_]) * f_731_);
							if (i_732_ > 0)
								i_727_ -= i_732_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_733_ = f - ((Class185) class185).aFloat2305;
						if (f_733_ > 0.0F) {
							fs_654_[i_725_] = f_733_ / ((Class185) class185).aFloat2303;
							if (fs_654_[i_725_] > 1.0F)
								fs_654_[i_725_] = 1.0F;
						}
					}
					float f_734_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_726_) + (((Class390_Sub3) this).aFloat9343 * (float) i_727_) + (((Class390_Sub3) this).aFloat9339 * (float) i_728_)));
					float f_735_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_726_) + (((Class390_Sub3) this).aFloat9344 * (float) i_727_) + (((Class390_Sub3) this).aFloat9327 * (float) i_728_)));
					fs[i_725_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_734_ / f_729_));
					fs_651_[i_725_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_735_ / f_729_));
					fs_652_[i_725_] = f_730_;
					fs_653_[i_725_] = f_729_;
				}
				if (((Class196) class196).aShortArray2413 != null) {
					for (int i_736_ = 0; i_736_ < ((Class196) class196).aShort2415; i_736_++) {
						int i_737_ = i_736_ * 3;
						int i_738_ = i_737_ + 1;
						int i_739_ = i_738_ + 1;
						float f = fs[i_737_];
						float f_740_ = fs[i_738_];
						float f_741_ = fs[i_739_];
						float f_742_ = fs_651_[i_737_];
						float f_743_ = fs_651_[i_738_];
						float f_744_ = fs_651_[i_739_];
						float f_745_ = (fs_654_[i_737_] + fs_654_[i_738_] + fs_654_[i_739_]);
						if (((f - f_740_) * (f_744_ - f_743_) - (f_742_ - f_743_) * (f_741_ - f_740_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_740_ < 0.0F || f_741_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_740_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_741_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							short i_746_ = (((Class196) class196).aShortArray2413[i_736_]);
							if (f_745_ < 3.0F) {
								if (f_745_ > 0.0F) {
									if (i_746_ != -1) {
										int i_747_ = -16777216;
										if (i_746_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_746_, -2090146755).aByte2064)))
											i_747_ = -1694498816;
										class144.method2424(true, true, false, f_742_, f_743_, f_744_, f, f_740_, f_741_, fs_652_[i_737_], fs_652_[i_738_], fs_652_[i_739_], fs_653_[i_737_], fs_653_[i_738_], fs_653_[i_739_], ((float) (((Class196) class196).aShortArray2416[i_737_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_738_]) / (float) (anInt4774 * 750971439)),
												((float) (((Class196) class196).aShortArray2416[i_739_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_737_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_738_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_739_]) / (float) (anInt4774 * 750971439)), i_747_ | (((Class196) class196).anIntArray2420[i_737_]) & 0xffffff,
												i_747_ | (((Class196) class196).anIntArray2420[i_738_]) & 0xffffff, i_747_ | (((Class196) class196).anIntArray2420[i_739_]) & 0xffffff, (((Class185) class185).anInt2307 * 1402414887), fs_654_[i_737_] * 255.0F, fs_654_[i_738_] * 255.0F, fs_654_[i_739_] * 255.0F, i_746_);
									} else if (((((Class196) class196).anIntArray2420[i_737_]) & 0xffffff) != 0) {
										if (i_746_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_746_, -2004855127).aByte2064)))
											((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
										class144.method2425(true, true, false, f_742_, f_743_, f_744_, f, f_740_, f_741_, fs_652_[i_737_], fs_652_[i_738_], fs_652_[i_739_], (Class323.method5773((((Class196) class196).anIntArray2420[i_737_]), ((int) (fs_654_[i_737_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -19)),
												(Class323.method5773((((Class196) class196).anIntArray2420[i_738_]), ((int) (fs_654_[i_738_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -87)), (Class323.method5773((((Class196) class196).anIntArray2420[i_739_]), ((int) (fs_654_[i_739_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -72)));
										((ChoppyItemFixClass) class144).anInt1674 = 0;
									}
								} else if (i_746_ != -1) {
									int i_748_ = -16777216;
									if (i_746_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_746_, -1764338914).aByte2064))
										i_748_ = -1694498816;
									class144.method2424(true, true, false, f_742_, f_743_, f_744_, f, f_740_, f_741_, fs_652_[i_737_], fs_652_[i_738_], fs_652_[i_739_], fs_653_[i_737_], fs_653_[i_738_], fs_653_[i_739_], ((float) (((Class196) class196).aShortArray2416[i_737_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_738_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_739_]) / (float) (anInt4774 * 750971439)),
											((float) (((Class196) class196).aShortArray2418[i_737_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_738_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_739_]) / (float) (anInt4774 * 750971439)), i_748_ | ((((Class196) class196).anIntArray2420[i_737_]) & 0xffffff), i_748_ | ((((Class196) class196).anIntArray2420[i_738_]) & 0xffffff),
											i_748_ | ((((Class196) class196).anIntArray2420[i_739_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_746_);
								} else if (((((Class196) class196).anIntArray2420[i_737_]) & 0xffffff) != 0) {
									if (i_746_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_746_, -1987674831).aByte2064))
										((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
									class144.method2425(true, true, false, f_742_, f_743_, f_744_, f, f_740_, f_741_, fs_652_[i_737_], fs_652_[i_738_], fs_652_[i_739_], (((Class196) class196).anIntArray2420[i_737_]), (((Class196) class196).anIntArray2420[i_738_]), (((Class196) class196).anIntArray2420[i_739_]));
									((ChoppyItemFixClass) class144).anInt1674 = 0;
								}
							} else
								class144.method2428(true, true, false, f_742_, f_743_, f_744_, f, f_740_, f_741_, fs_652_[i_737_], fs_652_[i_738_], fs_652_[i_739_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				} else {
					for (int i_749_ = 0; i_749_ < ((Class196) class196).aShort2415; i_749_++) {
						int i_750_ = i_749_ * 3;
						int i_751_ = i_750_ + 1;
						int i_752_ = i_751_ + 1;
						float f = fs[i_750_];
						float f_753_ = fs[i_751_];
						float f_754_ = fs[i_752_];
						float f_755_ = fs_651_[i_750_];
						float f_756_ = fs_651_[i_751_];
						float f_757_ = fs_651_[i_752_];
						float f_758_ = (fs_654_[i_750_] + fs_654_[i_751_] + fs_654_[i_752_]);
						if (((f - f_753_) * (f_757_ - f_756_) - (f_755_ - f_756_) * (f_754_ - f_753_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_753_ < 0.0F || f_754_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_753_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_754_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							if (f_758_ < 3.0F) {
								if (f_758_ > 0.0F) {
									if (((((Class196) class196).anIntArray2420[i_750_]) & 0xffffff) != 0)
										class144.method2425(true, true, false, f_755_, f_756_, f_757_, f, f_753_, f_754_, fs_652_[i_750_], fs_652_[i_751_], fs_652_[i_752_], (Class302.method5364((((Class196) class196).anIntArray2420[i_750_]), (((Class185) class185).anInt2307 * 1402414887), fs_654_[i_750_] * 255.0F, 833509259)), (Class302.method5364((((Class196) class196).anIntArray2420[i_751_]), (((Class185) class185).anInt2307 * 1402414887), fs_654_[i_751_] * 255.0F, 833509259)),
												(Class302.method5364((((Class196) class196).anIntArray2420[i_752_]), (((Class185) class185).anInt2307 * 1402414887), fs_654_[i_752_] * 255.0F, 833509259)));
								} else if (((((Class196) class196).anIntArray2420[i_750_]) & 0xffffff) != 0)
									class144.method2425(true, true, false, f_755_, f_756_, f_757_, f, f_753_, f_754_, fs_652_[i_750_], fs_652_[i_751_], fs_652_[i_752_], (((Class196) class196).anIntArray2420[i_750_]), (((Class196) class196).anIntArray2420[i_751_]), (((Class196) class196).anIntArray2420[i_752_]));
							} else
								class144.method2428(true, true, false, f_755_, f_756_, f_757_, f, f_753_, f_754_, fs_652_[i_750_], fs_652_[i_751_], fs_652_[i_752_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				}
			}
		}
	}

	public boolean method6719(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_759_, int i_760_, int i_761_, boolean bool) {
		return false;
	}

	void method14629(int i, int i_762_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_763_, float[] fs_764_, float[] fs_765_, float[] fs_766_, int i_767_) {
		Class177 class177 = ((Class390_Sub3) this).aClass177ArrayArray9336[i][i_762_];
		if (class177 != null) {
			if ((((Class177) class177).aByte2210 & 0x2) == 0) {
				if (i_767_ != 0) {
					if ((((Class177) class177).aByte2210 & 0x4) != 0) {
						if ((i_767_ & 0x1) != 0)
							return;
					} else if ((i_767_ & 0x2) != 0)
						return;
				}
				int i_768_ = i * (anInt4774 * 750971439);
				int i_769_ = i_768_ + anInt4774 * 750971439;
				int i_770_ = i_762_ * (anInt4774 * 750971439);
				int i_771_ = i_770_ + anInt4774 * 750971439;
				float f = 0.0F;
				float f_772_ = 0.0F;
				float f_773_ = 0.0F;
				float f_774_ = 0.0F;
				float f_775_;
				float f_776_;
				float f_777_;
				float f_778_;
				float f_779_;
				float f_780_;
				float f_781_;
				float f_782_;
				float f_783_;
				float f_784_;
				float f_785_;
				float f_786_;
				float f_787_;
				float f_788_;
				float f_789_;
				float f_790_;
				if ((((Class177) class177).aByte2210 & 0x1) != 0 && !bool) {
					int i_791_ = anIntArrayArray4772[i][i_762_];
					float f_792_ = ((Class390_Sub3) this).aFloat9334 * (float) i_791_;
					float f_793_ = ((Class390_Sub3) this).aFloat9346 * (float) i_791_;
					float f_794_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_768_) + f_792_ + (((Class390_Sub3) this).aFloat9349 * (float) i_770_)));
					f_775_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_768_) + f_793_ + (((Class390_Sub3) this).aFloat9350 * (float) i_770_)));
					if (f_794_ < -f_775_)
						return;
					float f_795_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_769_) + f_792_ + (((Class390_Sub3) this).aFloat9349 * (float) i_770_)));
					f_776_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_769_) + f_793_ + (((Class390_Sub3) this).aFloat9350 * (float) i_770_)));
					if (f_795_ < -f_776_)
						return;
					float f_796_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_769_) + f_792_ + (((Class390_Sub3) this).aFloat9349 * (float) i_771_)));
					f_777_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_769_) + f_793_ + (((Class390_Sub3) this).aFloat9350 * (float) i_771_)));
					if (f_796_ < -f_777_)
						return;
					float f_797_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_768_) + f_792_ + (((Class390_Sub3) this).aFloat9349 * (float) i_771_)));
					f_778_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_768_) + f_793_ + (((Class390_Sub3) this).aFloat9350 * (float) i_771_)));
					if (f_797_ < -f_778_)
						return;
					f_779_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_794_ / f_775_));
					f_780_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_795_ / f_776_));
					f_781_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_796_ / f_777_));
					f_782_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_797_ / f_778_));
					if (((Class185) class185).aBool2304) {
						float f_798_ = f_794_ - ((Class185) class185).aFloat2305;
						if (f_798_ > 0.0F) {
							f = f_798_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_798_ = f_795_ - ((Class185) class185).aFloat2305;
						if (f_798_ > 0.0F) {
							f_772_ = f_798_ / ((Class185) class185).aFloat2303;
							if (f_772_ > 1.0F)
								f_772_ = 1.0F;
						}
						f_798_ = f_796_ - ((Class185) class185).aFloat2305;
						if (f_798_ > 0.0F) {
							f_773_ = f_798_ / ((Class185) class185).aFloat2303;
							if (f_773_ > 1.0F)
								f_773_ = 1.0F;
						}
						f_798_ = f_797_ - ((Class185) class185).aFloat2305;
						if (f_798_ > 0.0F) {
							f_774_ = f_798_ / ((Class185) class185).aFloat2303;
							if (f_774_ > 1.0F)
								f_774_ = 1.0F;
						}
					}
					float f_799_ = ((Class390_Sub3) this).aFloat9343 * (float) i_791_;
					float f_800_ = ((Class390_Sub3) this).aFloat9344 * (float) i_791_;
					float f_801_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_768_) + f_799_ + (((Class390_Sub3) this).aFloat9339 * (float) i_770_)));
					f_783_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_801_ / f_775_));
					float f_802_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_768_) + f_800_ + (((Class390_Sub3) this).aFloat9327 * (float) i_770_)));
					f_784_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_802_ / f_775_));
					float f_803_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_769_) + f_799_ + (((Class390_Sub3) this).aFloat9339 * (float) i_770_)));
					f_785_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_803_ / f_776_));
					float f_804_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_769_) + f_800_ + (((Class390_Sub3) this).aFloat9327 * (float) i_770_)));
					f_786_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_804_ / f_776_));
					float f_805_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_769_) + f_799_ + (((Class390_Sub3) this).aFloat9339 * (float) i_771_)));
					f_787_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_805_ / f_777_));
					float f_806_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_769_) + f_800_ + (((Class390_Sub3) this).aFloat9327 * (float) i_771_)));
					f_788_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_806_ / f_777_));
					float f_807_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_768_) + f_799_ + (((Class390_Sub3) this).aFloat9339 * (float) i_771_)));
					f_789_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_807_ / f_778_));
					float f_808_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_768_) + f_800_ + (((Class390_Sub3) this).aFloat9327 * (float) i_771_)));
					f_790_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_808_ / f_778_));
				} else {
					int i_809_ = anIntArrayArray4772[i][i_762_];
					int i_810_ = anIntArrayArray4772[i + 1][i_762_];
					int i_811_ = anIntArrayArray4772[i + 1][i_762_ + 1];
					int i_812_ = anIntArrayArray4772[i][i_762_ + 1];
					float f_813_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_768_) + (((Class390_Sub3) this).aFloat9334 * (float) i_809_) + (((Class390_Sub3) this).aFloat9349 * (float) i_770_)));
					f_775_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_768_) + (((Class390_Sub3) this).aFloat9346 * (float) i_809_) + (((Class390_Sub3) this).aFloat9350 * (float) i_770_)));
					if (f_813_ < -f_775_)
						return;
					float f_814_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_769_) + (((Class390_Sub3) this).aFloat9334 * (float) i_810_) + (((Class390_Sub3) this).aFloat9349 * (float) i_770_)));
					f_776_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_769_) + (((Class390_Sub3) this).aFloat9346 * (float) i_810_) + (((Class390_Sub3) this).aFloat9350 * (float) i_770_)));
					if (f_814_ < -f_776_)
						return;
					float f_815_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_769_) + (((Class390_Sub3) this).aFloat9334 * (float) i_811_) + (((Class390_Sub3) this).aFloat9349 * (float) i_771_)));
					f_777_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_769_) + (((Class390_Sub3) this).aFloat9346 * (float) i_811_) + (((Class390_Sub3) this).aFloat9350 * (float) i_771_)));
					if (f_815_ < -f_777_)
						return;
					float f_816_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_768_) + (((Class390_Sub3) this).aFloat9334 * (float) i_812_) + (((Class390_Sub3) this).aFloat9349 * (float) i_771_)));
					f_778_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_768_) + (((Class390_Sub3) this).aFloat9346 * (float) i_812_) + (((Class390_Sub3) this).aFloat9350 * (float) i_771_)));
					if (f_816_ < -f_778_)
						return;
					f_779_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_813_ / f_775_));
					f_780_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_814_ / f_776_));
					f_781_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_815_ / f_777_));
					f_782_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_816_ / f_778_));
					if (bool) {
						float f_817_ = f_813_ - ((Class185) class185).aFloat2305;
						if (f_817_ > 0.0F) {
							f_817_ /= ((Class185) class185).aFloat2303;
							if (f_817_ > 1.0F)
								f_817_ = 1.0F;
							f = f_817_;
							int i_818_ = (int) ((float) (((Class177) class177).aShort2207) * f_817_);
							if (i_818_ > 0)
								i_809_ -= i_818_;
						}
						f_817_ = f_814_ - ((Class185) class185).aFloat2305;
						if (f_817_ > 0.0F) {
							f_817_ /= ((Class185) class185).aFloat2303;
							if (f_817_ > 1.0F)
								f_817_ = 1.0F;
							f_772_ = f_817_;
							int i_819_ = (int) ((float) (((Class177) class177).aShort2202) * f_817_);
							if (i_819_ > 0)
								i_810_ -= i_819_;
						}
						f_817_ = f_815_ - ((Class185) class185).aFloat2305;
						if (f_817_ > 0.0F) {
							f_817_ /= ((Class185) class185).aFloat2303;
							if (f_817_ > 1.0F)
								f_817_ = 1.0F;
							f_773_ = f_817_;
							int i_820_ = (int) ((float) (((Class177) class177).aShort2208) * f_817_);
							if (i_820_ > 0)
								i_811_ -= i_820_;
						}
						f_817_ = f_816_ - ((Class185) class185).aFloat2305;
						if (f_817_ > 0.0F) {
							f_817_ /= ((Class185) class185).aFloat2303;
							if (f_817_ > 1.0F)
								f_817_ = 1.0F;
							f_774_ = f_817_;
							int i_821_ = (int) ((float) (((Class177) class177).aShort2205) * f_817_);
							if (i_821_ > 0)
								i_812_ -= i_821_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_822_ = f_813_ - ((Class185) class185).aFloat2305;
						if (f_822_ > 0.0F) {
							f = f_822_ / ((Class185) class185).aFloat2303;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_822_ = f_814_ - ((Class185) class185).aFloat2305;
						if (f_822_ > 0.0F) {
							f_772_ = f_822_ / ((Class185) class185).aFloat2303;
							if (f_772_ > 1.0F)
								f_772_ = 1.0F;
						}
						f_822_ = f_815_ - ((Class185) class185).aFloat2305;
						if (f_822_ > 0.0F) {
							f_773_ = f_822_ / ((Class185) class185).aFloat2303;
							if (f_773_ > 1.0F)
								f_773_ = 1.0F;
						}
						f_822_ = f_816_ - ((Class185) class185).aFloat2305;
						if (f_822_ > 0.0F) {
							f_774_ = f_822_ / ((Class185) class185).aFloat2303;
							if (f_774_ > 1.0F)
								f_774_ = 1.0F;
						}
					}
					float f_823_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_768_) + (((Class390_Sub3) this).aFloat9343 * (float) i_809_) + (((Class390_Sub3) this).aFloat9339 * (float) i_770_)));
					f_783_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_823_ / f_775_));
					float f_824_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_768_) + (((Class390_Sub3) this).aFloat9344 * (float) i_809_) + (((Class390_Sub3) this).aFloat9327 * (float) i_770_)));
					f_784_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_824_ / f_775_));
					float f_825_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_769_) + (((Class390_Sub3) this).aFloat9343 * (float) i_810_) + (((Class390_Sub3) this).aFloat9339 * (float) i_770_)));
					f_785_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_825_ / f_776_));
					float f_826_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_769_) + (((Class390_Sub3) this).aFloat9344 * (float) i_810_) + (((Class390_Sub3) this).aFloat9327 * (float) i_770_)));
					f_786_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_826_ / f_776_));
					float f_827_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_769_) + (((Class390_Sub3) this).aFloat9343 * (float) i_811_) + (((Class390_Sub3) this).aFloat9339 * (float) i_771_)));
					f_787_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_827_ / f_777_));
					float f_828_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_769_) + (((Class390_Sub3) this).aFloat9344 * (float) i_811_) + (((Class390_Sub3) this).aFloat9327 * (float) i_771_)));
					f_788_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_828_ / f_777_));
					float f_829_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_768_) + (((Class390_Sub3) this).aFloat9343 * (float) i_812_) + (((Class390_Sub3) this).aFloat9339 * (float) i_771_)));
					f_789_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_829_ / f_778_));
					float f_830_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_768_) + (((Class390_Sub3) this).aFloat9344 * (float) i_812_) + (((Class390_Sub3) this).aFloat9327 * (float) i_771_)));
					f_790_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_830_ / f_778_));
				}
				boolean bool_831_ = (((Class177) class177).aShort2212 != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(((Class177) class177).aShort2212, -2032112997).aByte2064));
				float f_832_ = f_772_ + f_773_ + f_774_;
				if (((f_787_ - f_789_) * (f_786_ - f_790_) - (f_788_ - f_790_) * (f_785_ - f_789_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_787_ < 0.0F || f_789_ < 0.0F || f_785_ < 0.0F || f_787_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_789_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_785_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_832_ < 3.0F) {
						if (f_832_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_833_ = -16777216;
								if (bool_831_)
									i_833_ = -1694498816;
								class144.method2424(true, true, false, f_788_, f_790_, f_786_, f_787_, f_789_, f_785_, f_781_, f_782_, f_780_, f_777_, f_778_, f_776_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_833_ | (((Class177) class177).anInt2211 & 0xffffff), i_833_ | (((Class177) class177).anInt2206 & 0xffffff), i_833_ | (((Class177) class177).anInt2204 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f_773_ * 255.0F, f_774_ * 255.0F, f_772_ * 255.0F,
										((Class177) class177).aShort2212);
							} else {
								if (bool_831_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_788_, f_790_, f_786_, f_787_, f_789_, f_785_, f_781_, f_782_, f_780_, (Class323.method5773(((Class177) class177).anInt2211, ((int) (f_773_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -86)), (Class323.method5773(((Class177) class177).anInt2206, ((int) (f_774_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -73)),
										(Class323.method5773(((Class177) class177).anInt2204, ((int) (f_772_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -81)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_834_ = -16777216;
							if (bool_831_)
								i_834_ = -1694498816;
							class144.method2424(true, true, false, f_788_, f_790_, f_786_, f_787_, f_789_, f_785_, f_781_, f_782_, f_780_, f_777_, f_778_, f_776_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_834_ | (((Class177) class177).anInt2211 & 0xffffff), i_834_ | (((Class177) class177).anInt2206 & 0xffffff), i_834_ | (((Class177) class177).anInt2204 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_831_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_788_, f_790_, f_786_, f_787_, f_789_, f_785_, f_781_, f_782_, f_780_, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_788_, f_790_, f_786_, f_787_, f_789_, f_785_, f_781_, f_782_, f_780_, (((Class185) class185).anInt2307 * 1402414887));
				}
				f_832_ = f + f_772_ + f_774_;
				if (((f_783_ - f_785_) * (f_790_ - f_786_) - (f_784_ - f_786_) * (f_789_ - f_785_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_783_ < 0.0F || f_785_ < 0.0F || f_789_ < 0.0F || f_783_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_785_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_789_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (f_832_ < 3.0F) {
						if (bool_831_)
							((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
						if (f_832_ > 0.0F) {
							if (((Class177) class177).aShort2212 >= 0) {
								int i_835_ = -16777216;
								if (bool_831_)
									i_835_ = -1694498816;
								class144.method2424(true, true, false, f_784_, f_786_, f_790_, f_783_, f_785_, f_789_, f_779_, f_780_, f_782_, f_775_, f_776_, f_778_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_835_ | (((Class177) class177).anInt2209 & 0xffffff), i_835_ | (((Class177) class177).anInt2204 & 0xffffff), i_835_ | (((Class177) class177).anInt2206 & 0xffffff), (((Class185) class185).anInt2307 * 1402414887), f * 255.0F, f_772_ * 255.0F, f_774_ * 255.0F, ((Class177) class177).aShort2212);
							} else {
								if (bool_831_)
									((ChoppyItemFixClass) class144).anInt1674 = 100;
								class144.method2425(true, true, false, f_784_, f_786_, f_790_, f_783_, f_785_, f_789_, f_779_, f_780_, f_782_, (Class323.method5773(((Class177) class177).anInt2209, ((int) (f * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -68)), (Class323.method5773(((Class177) class177).anInt2204, ((int) (f_772_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -90)),
										(Class323.method5773(((Class177) class177).anInt2206, ((int) (f_774_ * 255.0F) << 24 | (((Class185) class185).anInt2307 * 1402414887)), (byte) -55)));
								((ChoppyItemFixClass) class144).anInt1674 = 0;
							}
						} else if (((Class177) class177).aShort2212 >= 0) {
							int i_836_ = -16777216;
							if (bool_831_)
								i_836_ = -1694498816;
							class144.method2424(true, true, false, f_784_, f_786_, f_790_, f_783_, f_785_, f_789_, f_779_, f_780_, f_782_, f_775_, f_776_, f_778_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_836_ | (((Class177) class177).anInt2209 & 0xffffff), i_836_ | (((Class177) class177).anInt2204 & 0xffffff), i_836_ | (((Class177) class177).anInt2206 & 0xffffff), 0, 0.0F, 0.0F, 0.0F, ((Class177) class177).aShort2212);
						} else {
							if (bool_831_)
								((ChoppyItemFixClass) class144).anInt1674 = 100;
							class144.method2425(true, true, false, f_784_, f_786_, f_790_, f_783_, f_785_, f_789_, f_779_, f_780_, f_782_, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							((ChoppyItemFixClass) class144).anInt1674 = 0;
						}
					} else
						class144.method2428(true, true, false, f_784_, f_786_, f_790_, f_783_, f_785_, f_789_, f_779_, f_780_, f_782_, (((Class185) class185).anInt2307 * 1402414887));
				}
			}
		} else {
			Class196 class196 = ((Class390_Sub3) this).aClass196ArrayArray9337[i][i_762_];
			if (class196 != null) {
				if (i_767_ != 0) {
					if ((((Class196) class196).aByte2414 & 0x4) != 0) {
						if ((i_767_ & 0x1) != 0)
							return;
					} else if ((i_767_ & 0x2) != 0)
						return;
				}
				for (int i_837_ = 0; i_837_ < ((Class196) class196).aShort2421; i_837_++) {
					int i_838_ = (((Class196) class196).aShortArray2416[i_837_] + (i << anInt4775 * 1856651955));
					int i_839_ = ((Class196) class196).aShortArray2417[i_837_];
					int i_840_ = (((Class196) class196).aShortArray2418[i_837_] + (i_762_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_838_) + (((Class390_Sub3) this).aFloat9334 * (float) i_839_) + (((Class390_Sub3) this).aFloat9349 * (float) i_840_)));
					float f_841_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_838_) + (((Class390_Sub3) this).aFloat9346 * (float) i_839_) + (((Class390_Sub3) this).aFloat9350 * (float) i_840_)));
					if (f < -f_841_)
						return;
					float f_842_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_841_);
					fs_766_[i_837_] = 0.0F;
					if (bool) {
						float f_843_ = f - ((Class185) class185).aFloat2305;
						if (f_843_ > 0.0F) {
							f_843_ /= ((Class185) class185).aFloat2303;
							if (f_843_ > 1.0F)
								f_843_ = 1.0F;
							fs_766_[i_837_] = f_843_;
							int i_844_ = (int) ((float) (((Class196) class196).aShortArray2419[i_837_]) * f_843_);
							if (i_844_ > 0)
								i_839_ -= i_844_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_845_ = f - ((Class185) class185).aFloat2305;
						if (f_845_ > 0.0F) {
							fs_766_[i_837_] = f_845_ / ((Class185) class185).aFloat2303;
							if (fs_766_[i_837_] > 1.0F)
								fs_766_[i_837_] = 1.0F;
						}
					}
					float f_846_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_838_) + (((Class390_Sub3) this).aFloat9343 * (float) i_839_) + (((Class390_Sub3) this).aFloat9339 * (float) i_840_)));
					float f_847_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_838_) + (((Class390_Sub3) this).aFloat9344 * (float) i_839_) + (((Class390_Sub3) this).aFloat9327 * (float) i_840_)));
					fs[i_837_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_846_ / f_841_));
					fs_763_[i_837_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_847_ / f_841_));
					fs_764_[i_837_] = f_842_;
					fs_765_[i_837_] = f_841_;
				}
				if (((Class196) class196).aShortArray2413 != null) {
					for (int i_848_ = 0; i_848_ < ((Class196) class196).aShort2415; i_848_++) {
						int i_849_ = i_848_ * 3;
						int i_850_ = i_849_ + 1;
						int i_851_ = i_850_ + 1;
						float f = fs[i_849_];
						float f_852_ = fs[i_850_];
						float f_853_ = fs[i_851_];
						float f_854_ = fs_763_[i_849_];
						float f_855_ = fs_763_[i_850_];
						float f_856_ = fs_763_[i_851_];
						float f_857_ = (fs_766_[i_849_] + fs_766_[i_850_] + fs_766_[i_851_]);
						if (((f - f_852_) * (f_856_ - f_855_) - (f_854_ - f_855_) * (f_853_ - f_852_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_852_ < 0.0F || f_853_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_852_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_853_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							short i_858_ = (((Class196) class196).aShortArray2413[i_848_]);
							if (f_857_ < 3.0F) {
								if (f_857_ > 0.0F) {
									if (i_858_ != -1) {
										int i_859_ = -16777216;
										if (i_858_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_858_, -2079607001).aByte2064)))
											i_859_ = -1694498816;
										class144.method2424(true, true, false, f_854_, f_855_, f_856_, f, f_852_, f_853_, fs_764_[i_849_], fs_764_[i_850_], fs_764_[i_851_], fs_765_[i_849_], fs_765_[i_850_], fs_765_[i_851_], ((float) (((Class196) class196).aShortArray2416[i_849_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_850_]) / (float) (anInt4774 * 750971439)),
												((float) (((Class196) class196).aShortArray2416[i_851_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_849_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_850_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_851_]) / (float) (anInt4774 * 750971439)), i_859_ | (((Class196) class196).anIntArray2420[i_849_]) & 0xffffff,
												i_859_ | (((Class196) class196).anIntArray2420[i_850_]) & 0xffffff, i_859_ | (((Class196) class196).anIntArray2420[i_851_]) & 0xffffff, (((Class185) class185).anInt2307 * 1402414887), fs_766_[i_849_] * 255.0F, fs_766_[i_850_] * 255.0F, fs_766_[i_851_] * 255.0F, i_858_);
									} else if (((((Class196) class196).anIntArray2420[i_849_]) & 0xffffff) != 0) {
										if (i_858_ != -1 && (method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_858_, -2101307436).aByte2064)))
											((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
										class144.method2425(true, true, false, f_854_, f_855_, f_856_, f, f_852_, f_853_, fs_764_[i_849_], fs_764_[i_850_], fs_764_[i_851_], (Class323.method5773((((Class196) class196).anIntArray2420[i_849_]), ((int) (fs_766_[i_849_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -21)),
												(Class323.method5773((((Class196) class196).anIntArray2420[i_850_]), ((int) (fs_766_[i_850_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -42)), (Class323.method5773((((Class196) class196).anIntArray2420[i_851_]), ((int) (fs_766_[i_851_] * 255.0F) << 24 | (((Class185) class185).anInt2307) * 1402414887), (byte) -9)));
										((ChoppyItemFixClass) class144).anInt1674 = 0;
									}
								} else if (i_858_ != -1) {
									int i_860_ = -16777216;
									if (i_858_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_858_, -2014763066).aByte2064))
										i_860_ = -1694498816;
									class144.method2424(true, true, false, f_854_, f_855_, f_856_, f, f_852_, f_853_, fs_764_[i_849_], fs_764_[i_850_], fs_764_[i_851_], fs_765_[i_849_], fs_765_[i_850_], fs_765_[i_851_], ((float) (((Class196) class196).aShortArray2416[i_849_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_850_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2416[i_851_]) / (float) (anInt4774 * 750971439)),
											((float) (((Class196) class196).aShortArray2418[i_849_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_850_]) / (float) (anInt4774 * 750971439)), ((float) (((Class196) class196).aShortArray2418[i_851_]) / (float) (anInt4774 * 750971439)), i_860_ | ((((Class196) class196).anIntArray2420[i_849_]) & 0xffffff), i_860_ | ((((Class196) class196).anIntArray2420[i_850_]) & 0xffffff),
											i_860_ | ((((Class196) class196).anIntArray2420[i_851_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_858_);
								} else if (((((Class196) class196).anIntArray2420[i_849_]) & 0xffffff) != 0) {
									if (i_858_ != -1 && method14620(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_858_, -2113188613).aByte2064))
										((ChoppyItemFixClass) class144).anInt1674 = -1694498816;
									class144.method2425(true, true, false, f_854_, f_855_, f_856_, f, f_852_, f_853_, fs_764_[i_849_], fs_764_[i_850_], fs_764_[i_851_], (((Class196) class196).anIntArray2420[i_849_]), (((Class196) class196).anIntArray2420[i_850_]), (((Class196) class196).anIntArray2420[i_851_]));
									((ChoppyItemFixClass) class144).anInt1674 = 0;
								}
							} else
								class144.method2428(true, true, false, f_854_, f_855_, f_856_, f, f_852_, f_853_, fs_764_[i_849_], fs_764_[i_850_], fs_764_[i_851_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				} else {
					for (int i_861_ = 0; i_861_ < ((Class196) class196).aShort2415; i_861_++) {
						int i_862_ = i_861_ * 3;
						int i_863_ = i_862_ + 1;
						int i_864_ = i_863_ + 1;
						float f = fs[i_862_];
						float f_865_ = fs[i_863_];
						float f_866_ = fs[i_864_];
						float f_867_ = fs_763_[i_862_];
						float f_868_ = fs_763_[i_863_];
						float f_869_ = fs_763_[i_864_];
						float f_870_ = (fs_766_[i_862_] + fs_766_[i_863_] + fs_766_[i_864_]);
						if (((f - f_865_) * (f_869_ - f_868_) - (f_867_ - f_868_) * (f_866_ - f_865_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_865_ < 0.0F || f_866_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_865_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_866_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							if (f_870_ < 3.0F) {
								if (f_870_ > 0.0F) {
									if (((((Class196) class196).anIntArray2420[i_862_]) & 0xffffff) != 0)
										class144.method2425(true, true, false, f_867_, f_868_, f_869_, f, f_865_, f_866_, fs_764_[i_862_], fs_764_[i_863_], fs_764_[i_864_], (Class302.method5364((((Class196) class196).anIntArray2420[i_862_]), (((Class185) class185).anInt2307 * 1402414887), fs_766_[i_862_] * 255.0F, 833509259)), (Class302.method5364((((Class196) class196).anIntArray2420[i_863_]), (((Class185) class185).anInt2307 * 1402414887), fs_766_[i_863_] * 255.0F, 833509259)),
												(Class302.method5364((((Class196) class196).anIntArray2420[i_864_]), (((Class185) class185).anInt2307 * 1402414887), fs_766_[i_864_] * 255.0F, 833509259)));
								} else if (((((Class196) class196).anIntArray2420[i_862_]) & 0xffffff) != 0)
									class144.method2425(true, true, false, f_867_, f_868_, f_869_, f, f_865_, f_866_, fs_764_[i_862_], fs_764_[i_863_], fs_764_[i_864_], (((Class196) class196).anIntArray2420[i_862_]), (((Class196) class196).anIntArray2420[i_863_]), (((Class196) class196).anIntArray2420[i_864_]));
							} else
								class144.method2428(true, true, false, f_867_, f_868_, f_869_, f, f_865_, f_866_, fs_764_[i_862_], fs_764_[i_863_], fs_764_[i_864_], (((Class185) class185).anInt2307) * 1402414887);
						}
					}
				}
			}
		}
	}

	void method14630(int i, int i_871_, boolean bool, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_872_, float[] fs_873_, float[] fs_874_, float[] fs_875_, int i_876_) {
		Class181 class181 = ((Class390_Sub3) this).aClass181ArrayArray9335[i][i_871_];
		if (i_876_ == 0 || (i_876_ & 0x2) == 0) {
			if (class181 != null) {
				for (int i_877_ = 0; i_877_ < ((Class181) class181).aShort2248; i_877_++) {
					int i_878_ = (((Class181) class181).aShortArray2249[i_877_] + (i << anInt4775 * 1856651955));
					int i_879_ = ((Class181) class181).aShortArray2255[i_877_];
					int i_880_ = (((Class181) class181).aShortArray2247[i_877_] + (i_871_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_878_) + (((Class390_Sub3) this).aFloat9334 * (float) i_879_) + (((Class390_Sub3) this).aFloat9349 * (float) i_880_)));
					float f_881_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_878_) + (((Class390_Sub3) this).aFloat9346 * (float) i_879_) + (((Class390_Sub3) this).aFloat9350 * (float) i_880_)));
					if (f < -f_881_)
						return;
					fs_875_[i_877_] = 0.0F;
					if (bool) {
						float f_882_ = f - ((Class185) class185).aFloat2305;
						if (f_882_ > 0.0F) {
							f_882_ /= ((Class185) class185).aFloat2303;
							if (f_882_ > 1.0F)
								f_882_ = 1.0F;
							fs_875_[i_877_] = f_882_;
							int i_883_ = (int) ((float) (((Class181) class181).aShortArray2252[i_877_]) * f_882_);
							if (i_883_ > 0)
								i_879_ -= i_883_;
						}
					} else if (((Class185) class185).aBool2304) {
						float f_884_ = f - ((Class185) class185).aFloat2305;
						if (f_884_ > 0.0F) {
							fs_875_[i_877_] = f_884_ / ((Class185) class185).aFloat2303;
							if (fs_875_[i_877_] > 1.0F)
								fs_875_[i_877_] = 1.0F;
						}
					}
					float f_885_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_878_) + (((Class390_Sub3) this).aFloat9343 * (float) i_879_) + (((Class390_Sub3) this).aFloat9339 * (float) i_880_)));
					float f_886_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_878_) + (((Class390_Sub3) this).aFloat9344 * (float) i_879_) + (((Class390_Sub3) this).aFloat9327 * (float) i_880_)));
					fs[i_877_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_885_ / f_881_));
					fs_872_[i_877_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_886_ / f_881_));
					fs_873_[i_877_] = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_881_);
					fs_874_[i_877_] = f_881_;
				}
				float f = (float) (anInt4774 * 750971439);
				for (int i_887_ = 0; i_887_ < ((Class181) class181).aShort2250; i_887_++) {
					int i_888_ = i_887_ * 3;
					int i_889_ = i_888_ + 1;
					int i_890_ = i_889_ + 1;
					float f_891_ = fs[i_888_];
					float f_892_ = fs[i_889_];
					float f_893_ = fs[i_890_];
					float f_894_ = fs_872_[i_888_];
					float f_895_ = fs_872_[i_889_];
					float f_896_ = fs_872_[i_890_];
					if (((f_891_ - f_892_) * (f_896_ - f_895_) - (f_894_ - f_895_) * (f_893_ - f_892_)) > 0.0F) {
						((ChoppyItemFixClass) class144).aBool1708 = (f_891_ < 0.0F || f_892_ < 0.0F || f_893_ < 0.0F || (f_891_ > (float) ((ChoppyItemFixClass) class144).anInt1684) || (f_892_ > (float) ((ChoppyItemFixClass) class144).anInt1684) || (f_893_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
						if (fs_875_[i_888_] + fs_875_[i_889_] + fs_875_[i_890_] < 3.0F) {
							int i_897_ = i << anInt4775 * 1856651955;
							int i_898_ = i_871_ << anInt4775 * 1856651955;
							if ((((Class181) class181).anIntArray2251[i_888_] & 0xffffff) != 0) {
								if (((((Class181) class181).aShortArray2253[i_888_]) == (((Class181) class181).aShortArray2253[i_889_])) && ((((Class181) class181).aShortArray2253[i_888_]) == (((Class181) class181).aShortArray2253[i_890_])) && ((((Class181) class181).aShortArray2254[i_888_]) == (((Class181) class181).aShortArray2254[i_889_])) && ((((Class181) class181).aShortArray2254[i_888_]) == (((Class181) class181).aShortArray2254[i_890_])))
									class144.method2424(true, true, false, f_894_, f_895_, f_896_, f_891_, f_892_, f_893_, fs_873_[i_888_], fs_873_[i_889_], fs_873_[i_890_], fs_874_[i_888_], fs_874_[i_889_], fs_874_[i_890_], ((float) (i_897_ + (((Class181) class181).aShortArray2249[i_888_])) / (float) (((Class181) class181).aShortArray2254[i_888_])), ((float) (i_897_ + (((Class181) class181).aShortArray2249[i_889_])) / (float) (((Class181) class181).aShortArray2254[i_889_])),
											((float) (i_897_ + (((Class181) class181).aShortArray2249[i_890_])) / (float) (((Class181) class181).aShortArray2254[i_890_])), ((float) (i_898_ + (((Class181) class181).aShortArray2247[i_888_])) / (float) (((Class181) class181).aShortArray2254[i_888_])), ((float) (i_898_ + (((Class181) class181).aShortArray2247[i_889_])) / (float) (((Class181) class181).aShortArray2254[i_889_])),
											((float) (i_898_ + (((Class181) class181).aShortArray2247[i_890_])) / (float) (((Class181) class181).aShortArray2254[i_890_])), (((Class181) class181).anIntArray2251[i_888_]), (((Class181) class181).anIntArray2251[i_889_]), (((Class181) class181).anIntArray2251[i_890_]), (((Class185) class185).anInt2307 * 1402414887), fs_875_[i_888_] * 255.0F, fs_875_[i_889_] * 255.0F, fs_875_[i_890_] * 255.0F, (((Class181) class181).aShortArray2253[i_888_]));
								else
									class144.method2421(true, true, false, f_894_, f_895_, f_896_, f_891_, f_892_, f_893_, fs_873_[i_888_], fs_873_[i_889_], fs_873_[i_890_], fs_874_[i_888_], fs_874_[i_889_], fs_874_[i_890_], (float) (i_897_ + (((Class181) class181).aShortArray2249[i_888_])) / f, (float) (i_897_ + (((Class181) class181).aShortArray2249[i_889_])) / f, (float) (i_897_ + (((Class181) class181).aShortArray2249[i_890_])) / f,
											(float) (i_898_ + (((Class181) class181).aShortArray2247[i_888_])) / f, (float) (i_898_ + (((Class181) class181).aShortArray2247[i_889_])) / f, (float) (i_898_ + (((Class181) class181).aShortArray2247[i_890_])) / f, (((Class181) class181).anIntArray2251[i_888_]), (((Class181) class181).anIntArray2251[i_889_]), (((Class181) class181).anIntArray2251[i_890_]), (((Class185) class185).anInt2307 * 1402414887), fs_875_[i_888_] * 255.0F,
											fs_875_[i_889_] * 255.0F, fs_875_[i_890_] * 255.0F, (((Class181) class181).aShortArray2253[i_888_]), f / (float) (((Class181) class181).aShortArray2254[i_888_]), (((Class181) class181).aShortArray2253[i_889_]), f / (float) (((Class181) class181).aShortArray2254[i_889_]), (((Class181) class181).aShortArray2253[i_890_]), f / (float) (((Class181) class181).aShortArray2254[i_890_]));
							}
						} else
							class144.method2428(true, true, false, f_894_, f_895_, f_896_, f_891_, f_892_, f_893_, fs_873_[i_888_], fs_873_[i_889_], fs_873_[i_890_], (((Class185) class185).anInt2307) * 1402414887);
					}
				}
			}
		}
	}

	boolean method14631(int i) {
		if ((((Class390_Sub3) this).anInt9345 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public void NA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_899_, int i_900_, int i_901_, boolean bool) {
		/* empty */
	}

	void method14632(int i, int i_902_, int i_903_, int i_904_, int i_905_, int i_906_, int i_907_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_908_) {
		int i_909_ = (i_907_ - i_905_) * i_903_ / 256;
		int i_910_ = i_903_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_911_ = i;
		int i_912_ = i_902_ + i_909_;
		for (int i_913_ = i_904_; i_913_ < i_906_; i_913_++) {
			for (int i_914_ = i_905_; i_914_ < i_907_; i_914_++) {
				if (bools[i_913_ - i_904_][i_914_ - i_905_]) {
					if ((((Class390_Sub3) this).aClass178ArrayArray9352[i_913_][i_914_]) != null) {
						Class178 class178 = (((Class390_Sub3) this).aClass178ArrayArray9352[i_913_][i_914_]);
						if (((Class178) class178).aShort2215 != -1 && (((Class178) class178).aByte2219 & 0x2) == 0 && ((Class178) class178).anInt2213 == -1) {
							int i_915_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class178) class178).aShort2215));
							class144.method2426(true, true, false, (float) (i_912_ - i_910_), (float) (i_912_ - i_910_), (float) i_912_, (float) (i_911_ + i_910_), (float) i_911_, (float) (i_911_ + i_910_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_915_, (((Class178) class178).aShort2216 & 0xffff), -1868358883)), (float) (Class282_Sub20_Sub2.method15076(i_915_, (((Class178) class178).aShort2218 & 0xffff), -1434143184)),
									(float) (Class282_Sub20_Sub2.method15076(i_915_, (((Class178) class178).aShort2217 & 0xffff), -2083278215)));
							class144.method2426(true, true, false, (float) i_912_, (float) i_912_, (float) (i_912_ - i_910_), (float) i_911_, (float) (i_911_ + i_910_), (float) i_911_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_915_, (((Class178) class178).aShort2214 & 0xffff), -1326110388)), (float) (Class282_Sub20_Sub2.method15076(i_915_, (((Class178) class178).aShort2217 & 0xffff), -1360337250)),
									(float) (Class282_Sub20_Sub2.method15076(i_915_, (((Class178) class178).aShort2218 & 0xffff), -1517067640)));
						} else if (((Class178) class178).anInt2213 == -1) {
							class144.method2426(true, true, false, (float) (i_912_ - i_910_), (float) (i_912_ - i_910_), (float) i_912_, (float) (i_911_ + i_910_), (float) i_911_, (float) (i_911_ + i_910_), 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2216 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff));
							class144.method2426(true, true, false, (float) i_912_, (float) i_912_, (float) (i_912_ - i_910_), (float) i_911_, (float) (i_911_ + i_910_), (float) i_911_, 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2214 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff));
						} else {
							int i_916_ = ((Class178) class178).anInt2213;
							class144.method2426(true, true, false, (float) (i_912_ - i_910_), (float) (i_912_ - i_910_), (float) i_912_, (float) (i_911_ + i_910_), (float) i_911_, (float) (i_911_ + i_910_), 100.0F, 100.0F, 100.0F, (float) i_916_, (float) i_916_, (float) i_916_);
							class144.method2426(true, true, false, (float) i_912_, (float) i_912_, (float) (i_912_ - i_910_), (float) i_911_, (float) (i_911_ + i_910_), (float) i_911_, 100.0F, 100.0F, 100.0F, (float) i_916_, (float) i_916_, (float) i_916_);
						}
					} else if ((((Class390_Sub3) this).aClass183ArrayArray9332[i_913_][i_914_]) != null) {
						Class183 class183 = (((Class390_Sub3) this).aClass183ArrayArray9332[i_913_][i_914_]);
						for (int i_917_ = 0; i_917_ < ((Class183) class183).aShort2265; i_917_++) {
							fs[i_917_] = (float) (i_911_ + ((((Class183) class183).aShortArray2267[i_917_]) * i_910_ / (anInt4774 * 750971439)));
							fs_908_[i_917_] = (float) (i_912_ - ((((Class183) class183).aShortArray2264[i_917_]) * i_910_ / (anInt4774 * 750971439)));
						}
						for (int i_918_ = 0; i_918_ < ((Class183) class183).aShort2269; i_918_++) {
							short i_919_ = (((Class183) class183).aShortArray2271[i_918_]);
							short i_920_ = (((Class183) class183).aShortArray2266[i_918_]);
							short i_921_ = (((Class183) class183).aShortArray2273[i_918_]);
							float f = fs[i_919_];
							float f_922_ = fs[i_920_];
							float f_923_ = fs[i_921_];
							float f_924_ = fs_908_[i_919_];
							float f_925_ = fs_908_[i_920_];
							float f_926_ = fs_908_[i_921_];
							if (((Class183) class183).anIntArray2277 != null && (((Class183) class183).anIntArray2277[i_918_]) != -1) {
								int i_927_ = (((Class183) class183).anIntArray2277[i_918_]);
								class144.method2426(true, true, false, f_924_, f_925_, f_926_, f, f_922_, f_923_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_927_, (((Class183) class183).aShortArray2274[i_919_]), -1798078654)), (float) (Class282_Sub20_Sub2.method15076(i_927_, (((Class183) class183).aShortArray2274[i_920_]), -2129464169)), (float) (Class282_Sub20_Sub2.method15076(i_927_, (((Class183) class183).aShortArray2274[i_921_]), -1433580897)));
							} else if ((((Class183) class183).aShortArray2270 != null) && (((Class183) class183).aShortArray2270[i_918_]) != -1) {
								int i_928_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class183) class183).aShortArray2270[i_918_]));
								class144.method2426(true, true, false, f_924_, f_925_, f_926_, f, f_922_, f_923_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_928_, (((Class183) class183).aShortArray2274[i_919_]), -1586584842)), (float) (Class282_Sub20_Sub2.method15076(i_928_, (((Class183) class183).aShortArray2274[i_920_]), -1904676244)), (float) (Class282_Sub20_Sub2.method15076(i_928_, (((Class183) class183).aShortArray2274[i_921_]), -2012371931)));
							} else {
								int i_929_ = (((Class183) class183).anIntArray2272[i_918_]);
								class144.method2426(true, true, false, f_924_, f_925_, f_926_, f, f_922_, f_923_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_929_, (((Class183) class183).aShortArray2274[i_919_]), -1592511068)), (float) (Class282_Sub20_Sub2.method15076(i_929_, (((Class183) class183).aShortArray2274[i_920_]), -1731113698)), (float) (Class282_Sub20_Sub2.method15076(i_929_, (((Class183) class183).aShortArray2274[i_921_]), -1773463956)));
							}
						}
					}
				}
				i_912_ -= i_910_;
			}
			i_912_ = i_902_ + i_909_;
			i_911_ += i_910_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	void method14633(int i, int i_930_, int i_931_, int i_932_, int i_933_, int i_934_, int i_935_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_936_) {
		int i_937_ = (i_935_ - i_933_) * i_931_ / 256;
		int i_938_ = i_931_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_939_ = i;
		int i_940_ = i_930_ + i_937_;
		for (int i_941_ = i_932_; i_941_ < i_934_; i_941_++) {
			for (int i_942_ = i_933_; i_942_ < i_935_; i_942_++) {
				if (bools[i_941_ - i_932_][i_942_ - i_933_]) {
					if ((((Class390_Sub3) this).aClass178ArrayArray9352[i_941_][i_942_]) != null) {
						Class178 class178 = (((Class390_Sub3) this).aClass178ArrayArray9352[i_941_][i_942_]);
						if (((Class178) class178).aShort2215 != -1 && (((Class178) class178).aByte2219 & 0x2) == 0 && ((Class178) class178).anInt2213 == -1) {
							int i_943_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class178) class178).aShort2215));
							class144.method2426(true, true, false, (float) (i_940_ - i_938_), (float) (i_940_ - i_938_), (float) i_940_, (float) (i_939_ + i_938_), (float) i_939_, (float) (i_939_ + i_938_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_943_, (((Class178) class178).aShort2216 & 0xffff), -1440778695)), (float) (Class282_Sub20_Sub2.method15076(i_943_, (((Class178) class178).aShort2218 & 0xffff), -1342727762)),
									(float) (Class282_Sub20_Sub2.method15076(i_943_, (((Class178) class178).aShort2217 & 0xffff), -1608047667)));
							class144.method2426(true, true, false, (float) i_940_, (float) i_940_, (float) (i_940_ - i_938_), (float) i_939_, (float) (i_939_ + i_938_), (float) i_939_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_943_, (((Class178) class178).aShort2214 & 0xffff), -1998125125)), (float) (Class282_Sub20_Sub2.method15076(i_943_, (((Class178) class178).aShort2217 & 0xffff), -1631443156)),
									(float) (Class282_Sub20_Sub2.method15076(i_943_, (((Class178) class178).aShort2218 & 0xffff), -1271257689)));
						} else if (((Class178) class178).anInt2213 == -1) {
							class144.method2426(true, true, false, (float) (i_940_ - i_938_), (float) (i_940_ - i_938_), (float) i_940_, (float) (i_939_ + i_938_), (float) i_939_, (float) (i_939_ + i_938_), 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2216 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff));
							class144.method2426(true, true, false, (float) i_940_, (float) i_940_, (float) (i_940_ - i_938_), (float) i_939_, (float) (i_939_ + i_938_), (float) i_939_, 100.0F, 100.0F, 100.0F, (float) (((Class178) class178).aShort2214 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff));
						} else {
							int i_944_ = ((Class178) class178).anInt2213;
							class144.method2426(true, true, false, (float) (i_940_ - i_938_), (float) (i_940_ - i_938_), (float) i_940_, (float) (i_939_ + i_938_), (float) i_939_, (float) (i_939_ + i_938_), 100.0F, 100.0F, 100.0F, (float) i_944_, (float) i_944_, (float) i_944_);
							class144.method2426(true, true, false, (float) i_940_, (float) i_940_, (float) (i_940_ - i_938_), (float) i_939_, (float) (i_939_ + i_938_), (float) i_939_, 100.0F, 100.0F, 100.0F, (float) i_944_, (float) i_944_, (float) i_944_);
						}
					} else if ((((Class390_Sub3) this).aClass183ArrayArray9332[i_941_][i_942_]) != null) {
						Class183 class183 = (((Class390_Sub3) this).aClass183ArrayArray9332[i_941_][i_942_]);
						for (int i_945_ = 0; i_945_ < ((Class183) class183).aShort2265; i_945_++) {
							fs[i_945_] = (float) (i_939_ + ((((Class183) class183).aShortArray2267[i_945_]) * i_938_ / (anInt4774 * 750971439)));
							fs_936_[i_945_] = (float) (i_940_ - ((((Class183) class183).aShortArray2264[i_945_]) * i_938_ / (anInt4774 * 750971439)));
						}
						for (int i_946_ = 0; i_946_ < ((Class183) class183).aShort2269; i_946_++) {
							short i_947_ = (((Class183) class183).aShortArray2271[i_946_]);
							short i_948_ = (((Class183) class183).aShortArray2266[i_946_]);
							short i_949_ = (((Class183) class183).aShortArray2273[i_946_]);
							float f = fs[i_947_];
							float f_950_ = fs[i_948_];
							float f_951_ = fs[i_949_];
							float f_952_ = fs_936_[i_947_];
							float f_953_ = fs_936_[i_948_];
							float f_954_ = fs_936_[i_949_];
							if (((Class183) class183).anIntArray2277 != null && (((Class183) class183).anIntArray2277[i_946_]) != -1) {
								int i_955_ = (((Class183) class183).anIntArray2277[i_946_]);
								class144.method2426(true, true, false, f_952_, f_953_, f_954_, f, f_950_, f_951_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_955_, (((Class183) class183).aShortArray2274[i_947_]), -1867555607)), (float) (Class282_Sub20_Sub2.method15076(i_955_, (((Class183) class183).aShortArray2274[i_948_]), -1525107888)), (float) (Class282_Sub20_Sub2.method15076(i_955_, (((Class183) class183).aShortArray2274[i_949_]), -1596376135)));
							} else if ((((Class183) class183).aShortArray2270 != null) && (((Class183) class183).aShortArray2270[i_946_]) != -1) {
								int i_956_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class183) class183).aShortArray2270[i_946_]));
								class144.method2426(true, true, false, f_952_, f_953_, f_954_, f, f_950_, f_951_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_956_, (((Class183) class183).aShortArray2274[i_947_]), -1342609975)), (float) (Class282_Sub20_Sub2.method15076(i_956_, (((Class183) class183).aShortArray2274[i_948_]), -1906765782)), (float) (Class282_Sub20_Sub2.method15076(i_956_, (((Class183) class183).aShortArray2274[i_949_]), -1856453886)));
							} else {
								int i_957_ = (((Class183) class183).anIntArray2272[i_946_]);
								class144.method2426(true, true, false, f_952_, f_953_, f_954_, f, f_950_, f_951_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_957_, (((Class183) class183).aShortArray2274[i_947_]), -1486582261)), (float) (Class282_Sub20_Sub2.method15076(i_957_, (((Class183) class183).aShortArray2274[i_948_]), -1871455583)), (float) (Class282_Sub20_Sub2.method15076(i_957_, (((Class183) class183).aShortArray2274[i_949_]), -1998364595)));
							}
						}
					}
				}
				i_940_ -= i_938_;
			}
			i_940_ = i_930_ + i_937_;
			i_939_ += i_938_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	void method14634(int i, int i_958_, int i_959_, int i_960_, int i_961_, int i_962_, int i_963_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_964_) {
		int i_965_ = (i_963_ - i_961_) * i_959_ / 256;
		int i_966_ = i_959_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_967_ = i;
		int i_968_ = i_958_ + i_965_;
		for (int i_969_ = i_960_; i_969_ < i_962_; i_969_++) {
			for (int i_970_ = i_961_; i_970_ < i_963_; i_970_++) {
				if (bools[i_969_ - i_960_][i_970_ - i_961_]) {
					if (((Class390_Sub3) this).aClass177ArrayArray9336 != null) {
						if ((((Class390_Sub3) this).aClass177ArrayArray9336[i_969_][i_970_]) != null) {
							Class177 class177 = (((Class390_Sub3) this).aClass177ArrayArray9336[i_969_][i_970_]);
							if (((Class177) class177).aShort2212 != -1 && (((Class177) class177).aByte2210 & 0x2) == 0 && ((Class177) class177).anInt2203 == 0) {
								int i_971_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class177) class177).aShort2212));
								class144.method2426(true, true, false, (float) (i_968_ - i_966_), (float) (i_968_ - i_966_), (float) i_968_, (float) (i_967_ + i_966_), (float) i_967_, (float) (i_967_ + i_966_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_971_, ((Class177) class177).anInt2211, -1307682464)), (float) (Class282_Sub20_Sub2.method15076(i_971_, ((Class177) class177).anInt2206, -1942462395)),
										(float) (Class282_Sub20_Sub2.method15076(i_971_, ((Class177) class177).anInt2204, -1275467390)));
								class144.method2426(true, true, false, (float) i_968_, (float) i_968_, (float) (i_968_ - i_966_), (float) i_967_, (float) (i_967_ + i_966_), (float) i_967_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_971_, ((Class177) class177).anInt2209, -1707772870)), (float) (Class282_Sub20_Sub2.method15076(i_971_, ((Class177) class177).anInt2204, -1288039266)),
										(float) (Class282_Sub20_Sub2.method15076(i_971_, ((Class177) class177).anInt2206, -1663896732)));
							} else if (((Class177) class177).anInt2203 == 0) {
								class144.method2425(true, true, false, (float) (i_968_ - i_966_), (float) (i_968_ - i_966_), (float) i_968_, (float) (i_967_ + i_966_), (float) i_967_, (float) (i_967_ + i_966_), 100.0F, 100.0F, 100.0F, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
								class144.method2425(true, true, false, (float) i_968_, (float) i_968_, (float) (i_968_ - i_966_), (float) i_967_, (float) (i_967_ + i_966_), (float) i_967_, 100.0F, 100.0F, 100.0F, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							} else {
								int i_972_ = ((Class177) class177).anInt2203;
								class144.method2425(true, true, false, (float) (i_968_ - i_966_), (float) (i_968_ - i_966_), (float) i_968_, (float) (i_967_ + i_966_), (float) i_967_, (float) (i_967_ + i_966_), 100.0F, 100.0F, 100.0F, Class323.method5773(i_972_, (((Class177) class177).anInt2211 & ~0xffffff), (byte) -21), Class323.method5773(i_972_, (((Class177) class177).anInt2206 & ~0xffffff), (byte) 6), Class323.method5773(i_972_, (((Class177) class177).anInt2204 & ~0xffffff), (byte) -11));
								class144.method2425(true, true, false, (float) i_968_, (float) i_968_, (float) (i_968_ - i_966_), (float) i_967_, (float) (i_967_ + i_966_), (float) i_967_, 100.0F, 100.0F, 100.0F, Class323.method5773(i_972_, (((Class177) class177).anInt2209 & ~0xffffff), (byte) -57), Class323.method5773(i_972_, (((Class177) class177).anInt2204 & ~0xffffff), (byte) -2), Class323.method5773(i_972_, (((Class177) class177).anInt2206 & ~0xffffff), (byte) -43));
							}
						} else if ((((Class390_Sub3) this).aClass196ArrayArray9337[i_969_][i_970_]) != null) {
							Class196 class196 = (((Class390_Sub3) this).aClass196ArrayArray9337[i_969_][i_970_]);
							for (int i_973_ = 0; i_973_ < ((Class196) class196).aShort2421; i_973_++) {
								fs[i_973_] = (float) (i_967_ + ((((Class196) class196).aShortArray2416[i_973_]) * i_966_ / (anInt4774 * 750971439)));
								fs_964_[i_973_] = (float) (i_968_ - ((((Class196) class196).aShortArray2418[i_973_]) * i_966_ / (anInt4774 * 750971439)));
							}
							for (int i_974_ = 0; i_974_ < ((Class196) class196).aShort2415; i_974_++) {
								int i_975_ = i_974_ * 3;
								int i_976_ = i_975_ + 1;
								int i_977_ = i_976_ + 1;
								float f = fs[i_975_];
								float f_978_ = fs[i_976_];
								float f_979_ = fs[i_977_];
								float f_980_ = fs_964_[i_975_];
								float f_981_ = fs_964_[i_976_];
								float f_982_ = fs_964_[i_977_];
								if ((((Class196) class196).anIntArray2423 != null) && (((Class196) class196).anIntArray2423[i_974_]) != 0 && ((((Class196) class196).aShortArray2413 == null) || ((((Class196) class196).aShortArray2413) != null && ((((Class196) class196).aShortArray2413[i_974_]) == -1)))) {
									int i_983_ = (((Class196) class196).anIntArray2423[i_974_]);
									class144.method2425(true, true, false, f_980_, f_981_, f_982_, f, f_978_, f_979_, 100.0F, 100.0F, 100.0F, (Class323.method5773(i_983_, -16777216 - ((((Class196) class196).anIntArray2420[i_975_]) & ~0xffffff), (byte) -36)), (Class323.method5773(i_983_, -16777216 - ((((Class196) class196).anIntArray2420[i_976_]) & ~0xffffff), (byte) -42)), (Class323.method5773(i_983_, -16777216 - ((((Class196) class196).anIntArray2420[i_977_]) & ~0xffffff), (byte) -22)));
								} else if ((((Class196) class196).aShortArray2413) != null && ((((Class196) class196).aShortArray2413[i_974_]) != -1)) {
									int i_984_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class196) class196).aShortArray2413[i_974_]));
									class144.method2426(true, true, false, f_980_, f_981_, f_982_, f, f_978_, f_979_, 100.0F, 100.0F, 100.0F, (float) i_984_, (float) i_984_, (float) i_984_);
								} else
									class144.method2425(true, true, false, f_980_, f_981_, f_982_, f, f_978_, f_979_, 100.0F, 100.0F, 100.0F, (((Class196) class196).anIntArray2420[i_975_]), (((Class196) class196).anIntArray2420[i_976_]), (((Class196) class196).anIntArray2420[i_977_]));
							}
						}
					} else if ((((Class390_Sub3) this).aClass181ArrayArray9335[i_969_][i_970_]) != null) {
						Class181 class181 = (((Class390_Sub3) this).aClass181ArrayArray9335[i_969_][i_970_]);
						for (int i_985_ = 0; i_985_ < ((Class181) class181).aShort2248; i_985_++) {
							fs[i_985_] = (float) (i_967_ + ((((Class181) class181).aShortArray2249[i_985_]) * i_966_ / (anInt4774 * 750971439)));
							fs_964_[i_985_] = (float) (i_968_ - ((((Class181) class181).aShortArray2247[i_985_]) * i_966_ / (anInt4774 * 750971439)));
						}
						for (int i_986_ = 0; i_986_ < ((Class181) class181).aShort2250; i_986_++) {
							int i_987_ = i_986_ * 3;
							int i_988_ = i_987_ + 1;
							int i_989_ = i_988_ + 1;
							float f = fs[i_987_];
							float f_990_ = fs[i_988_];
							float f_991_ = fs[i_989_];
							float f_992_ = fs_964_[i_987_];
							float f_993_ = fs_964_[i_988_];
							float f_994_ = fs_964_[i_989_];
							if (((Class181) class181).anIntArray2257 != null && (((Class181) class181).anIntArray2257[i_986_]) != 0) {
								int i_995_ = (((Class181) class181).anIntArray2257[i_986_]);
								class144.method2425(true, true, false, f_992_, f_993_, f_994_, f, f_990_, f_991_, 100.0F, 100.0F, 100.0F, i_995_, i_995_, i_995_);
							} else
								class144.method2425(true, true, false, f_992_, f_993_, f_994_, f, f_990_, f_991_, 100.0F, 100.0F, 100.0F, (((Class181) class181).anIntArray2251[i_987_]), (((Class181) class181).anIntArray2251[i_988_]), (((Class181) class181).anIntArray2251[i_989_]));
						}
					}
				}
				i_968_ -= i_966_;
			}
			i_968_ = i_958_ + i_965_;
			i_967_ += i_966_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	void method14635(int i, int i_996_, int i_997_, int i_998_, int i_999_, int i_1000_, int i_1001_, boolean[][] bools, Class185 class185, ChoppyItemFixClass class144, float[] fs, float[] fs_1002_) {
		int i_1003_ = (i_1001_ - i_999_) * i_997_ / 256;
		int i_1004_ = i_997_ >> 8;
		boolean bool = ((Class185) class185).aBool2334;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(false);
		((ChoppyItemFixClass) class144).aBool1675 = false;
		((ChoppyItemFixClass) class144).aBool1672 = false;
		int i_1005_ = i;
		int i_1006_ = i_996_ + i_1003_;
		for (int i_1007_ = i_998_; i_1007_ < i_1000_; i_1007_++) {
			for (int i_1008_ = i_999_; i_1008_ < i_1001_; i_1008_++) {
				if (bools[i_1007_ - i_998_][i_1008_ - i_999_]) {
					if (((Class390_Sub3) this).aClass177ArrayArray9336 != null) {
						if ((((Class390_Sub3) this).aClass177ArrayArray9336[i_1007_][i_1008_]) != null) {
							Class177 class177 = (((Class390_Sub3) this).aClass177ArrayArray9336[i_1007_][i_1008_]);
							if (((Class177) class177).aShort2212 != -1 && (((Class177) class177).aByte2210 & 0x2) == 0 && ((Class177) class177).anInt2203 == 0) {
								int i_1009_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class177) class177).aShort2212));
								class144.method2426(true, true, false, (float) (i_1006_ - i_1004_), (float) (i_1006_ - i_1004_), (float) i_1006_, (float) (i_1005_ + i_1004_), (float) i_1005_, (float) (i_1005_ + i_1004_), 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_1009_, ((Class177) class177).anInt2211, -1535575688)), (float) (Class282_Sub20_Sub2.method15076(i_1009_, ((Class177) class177).anInt2206, -1869882270)),
										(float) (Class282_Sub20_Sub2.method15076(i_1009_, ((Class177) class177).anInt2204, -1343600856)));
								class144.method2426(true, true, false, (float) i_1006_, (float) i_1006_, (float) (i_1006_ - i_1004_), (float) i_1005_, (float) (i_1005_ + i_1004_), (float) i_1005_, 100.0F, 100.0F, 100.0F, (float) (Class282_Sub20_Sub2.method15076(i_1009_, ((Class177) class177).anInt2209, -1940903284)), (float) (Class282_Sub20_Sub2.method15076(i_1009_, ((Class177) class177).anInt2204, -1485144549)),
										(float) (Class282_Sub20_Sub2.method15076(i_1009_, ((Class177) class177).anInt2206, -1652129763)));
							} else if (((Class177) class177).anInt2203 == 0) {
								class144.method2425(true, true, false, (float) (i_1006_ - i_1004_), (float) (i_1006_ - i_1004_), (float) i_1006_, (float) (i_1005_ + i_1004_), (float) i_1005_, (float) (i_1005_ + i_1004_), 100.0F, 100.0F, 100.0F, ((Class177) class177).anInt2211, ((Class177) class177).anInt2206, ((Class177) class177).anInt2204);
								class144.method2425(true, true, false, (float) i_1006_, (float) i_1006_, (float) (i_1006_ - i_1004_), (float) i_1005_, (float) (i_1005_ + i_1004_), (float) i_1005_, 100.0F, 100.0F, 100.0F, ((Class177) class177).anInt2209, ((Class177) class177).anInt2204, ((Class177) class177).anInt2206);
							} else {
								int i_1010_ = ((Class177) class177).anInt2203;
								class144.method2425(true, true, false, (float) (i_1006_ - i_1004_), (float) (i_1006_ - i_1004_), (float) i_1006_, (float) (i_1005_ + i_1004_), (float) i_1005_, (float) (i_1005_ + i_1004_), 100.0F, 100.0F, 100.0F, Class323.method5773(i_1010_, (((Class177) class177).anInt2211 & ~0xffffff), (byte) -55), Class323.method5773(i_1010_, (((Class177) class177).anInt2206 & ~0xffffff), (byte) -81),
										Class323.method5773(i_1010_, (((Class177) class177).anInt2204 & ~0xffffff), (byte) -7));
								class144.method2425(true, true, false, (float) i_1006_, (float) i_1006_, (float) (i_1006_ - i_1004_), (float) i_1005_, (float) (i_1005_ + i_1004_), (float) i_1005_, 100.0F, 100.0F, 100.0F, Class323.method5773(i_1010_, (((Class177) class177).anInt2209 & ~0xffffff), (byte) -51), Class323.method5773(i_1010_, (((Class177) class177).anInt2204 & ~0xffffff), (byte) -34), Class323.method5773(i_1010_, (((Class177) class177).anInt2206 & ~0xffffff), (byte) -102));
							}
						} else if ((((Class390_Sub3) this).aClass196ArrayArray9337[i_1007_][i_1008_]) != null) {
							Class196 class196 = (((Class390_Sub3) this).aClass196ArrayArray9337[i_1007_][i_1008_]);
							for (int i_1011_ = 0; i_1011_ < ((Class196) class196).aShort2421; i_1011_++) {
								fs[i_1011_] = (float) (i_1005_ + ((((Class196) class196).aShortArray2416[i_1011_]) * i_1004_ / (anInt4774 * 750971439)));
								fs_1002_[i_1011_] = (float) (i_1006_ - ((((Class196) class196).aShortArray2418[i_1011_]) * i_1004_ / (anInt4774 * 750971439)));
							}
							for (int i_1012_ = 0; i_1012_ < ((Class196) class196).aShort2415; i_1012_++) {
								int i_1013_ = i_1012_ * 3;
								int i_1014_ = i_1013_ + 1;
								int i_1015_ = i_1014_ + 1;
								float f = fs[i_1013_];
								float f_1016_ = fs[i_1014_];
								float f_1017_ = fs[i_1015_];
								float f_1018_ = fs_1002_[i_1013_];
								float f_1019_ = fs_1002_[i_1014_];
								float f_1020_ = fs_1002_[i_1015_];
								if ((((Class196) class196).anIntArray2423 != null) && (((Class196) class196).anIntArray2423[i_1012_]) != 0 && ((((Class196) class196).aShortArray2413 == null) || ((((Class196) class196).aShortArray2413) != null && ((((Class196) class196).aShortArray2413[i_1012_]) == -1)))) {
									int i_1021_ = (((Class196) class196).anIntArray2423[i_1012_]);
									class144.method2425(true, true, false, f_1018_, f_1019_, f_1020_, f, f_1016_, f_1017_, 100.0F, 100.0F, 100.0F, (Class323.method5773(i_1021_, -16777216 - ((((Class196) class196).anIntArray2420[i_1013_]) & ~0xffffff), (byte) -125)), (Class323.method5773(i_1021_, -16777216 - ((((Class196) class196).anIntArray2420[i_1014_]) & ~0xffffff), (byte) -73)),
											(Class323.method5773(i_1021_, -16777216 - ((((Class196) class196).anIntArray2420[i_1015_]) & ~0xffffff), (byte) -70)));
								} else if ((((Class196) class196).aShortArray2413) != null && ((((Class196) class196).aShortArray2413[i_1012_]) != -1)) {
									int i_1022_ = (((Class390_Sub3) this).aClass505_Sub3_9353.method14362(((Class196) class196).aShortArray2413[i_1012_]));
									class144.method2426(true, true, false, f_1018_, f_1019_, f_1020_, f, f_1016_, f_1017_, 100.0F, 100.0F, 100.0F, (float) i_1022_, (float) i_1022_, (float) i_1022_);
								} else
									class144.method2425(true, true, false, f_1018_, f_1019_, f_1020_, f, f_1016_, f_1017_, 100.0F, 100.0F, 100.0F, (((Class196) class196).anIntArray2420[i_1013_]), (((Class196) class196).anIntArray2420[i_1014_]), (((Class196) class196).anIntArray2420[i_1015_]));
							}
						}
					} else if ((((Class390_Sub3) this).aClass181ArrayArray9335[i_1007_][i_1008_]) != null) {
						Class181 class181 = (((Class390_Sub3) this).aClass181ArrayArray9335[i_1007_][i_1008_]);
						for (int i_1023_ = 0; i_1023_ < ((Class181) class181).aShort2248; i_1023_++) {
							fs[i_1023_] = (float) (i_1005_ + ((((Class181) class181).aShortArray2249[i_1023_]) * i_1004_ / (anInt4774 * 750971439)));
							fs_1002_[i_1023_] = (float) (i_1006_ - ((((Class181) class181).aShortArray2247[i_1023_]) * i_1004_ / (anInt4774 * 750971439)));
						}
						for (int i_1024_ = 0; i_1024_ < ((Class181) class181).aShort2250; i_1024_++) {
							int i_1025_ = i_1024_ * 3;
							int i_1026_ = i_1025_ + 1;
							int i_1027_ = i_1026_ + 1;
							float f = fs[i_1025_];
							float f_1028_ = fs[i_1026_];
							float f_1029_ = fs[i_1027_];
							float f_1030_ = fs_1002_[i_1025_];
							float f_1031_ = fs_1002_[i_1026_];
							float f_1032_ = fs_1002_[i_1027_];
							if (((Class181) class181).anIntArray2257 != null && (((Class181) class181).anIntArray2257[i_1024_]) != 0) {
								int i_1033_ = (((Class181) class181).anIntArray2257[i_1024_]);
								class144.method2425(true, true, false, f_1030_, f_1031_, f_1032_, f, f_1028_, f_1029_, 100.0F, 100.0F, 100.0F, i_1033_, i_1033_, i_1033_);
							} else
								class144.method2425(true, true, false, f_1030_, f_1031_, f_1032_, f, f_1028_, f_1029_, 100.0F, 100.0F, 100.0F, (((Class181) class181).anIntArray2251[i_1025_]), (((Class181) class181).anIntArray2251[i_1026_]), (((Class181) class181).anIntArray2251[i_1027_]));
						}
					}
				}
				i_1006_ -= i_1004_;
			}
			i_1006_ = i_996_ + i_1003_;
			i_1005_ += i_1004_;
		}
		((ChoppyItemFixClass) class144).aBool1675 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.RA(bool);
	}

	public void method6714(int i, int i_1034_, int[] is, int[] is_1035_, int[] is_1036_, int[] is_1037_, int[] is_1038_, int[] is_1039_, int[] is_1040_, int[] is_1041_, int[] is_1042_, int[] is_1043_, int[] is_1044_, Class90 class90, boolean bool) {
		if (((Class390_Sub3) this).aClass178ArrayArray9352 == null) {
			((Class390_Sub3) this).aClass178ArrayArray9352 = (new Class178[anInt4776 * -1843860823][anInt4773 * 1826078169]);
			((Class390_Sub3) this).aClass183ArrayArray9332 = (new Class183[anInt4776 * -1843860823][anInt4773 * 1826078169]);
		} else if (((Class390_Sub3) this).aClass177ArrayArray9336 != null || ((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			throw new IllegalStateException();
		boolean bool_1045_ = false;
		if (is_1041_.length == 2 && is_1038_.length == 2 && (is_1041_[0] == is_1041_[1] || is_1043_[0] != -1 && is_1043_[0] == is_1043_[1])) {
			bool_1045_ = true;
			for (int i_1046_ = 1; i_1046_ < 2; i_1046_++) {
				int i_1047_ = is[is_1038_[i_1046_]];
				int i_1048_ = is_1036_[is_1038_[i_1046_]];
				if (i_1047_ != 0 && i_1047_ != anInt4774 * 750971439 || i_1048_ != 0 && i_1048_ != anInt4774 * 750971439) {
					bool_1045_ = false;
					break;
				}
			}
		}
		if (!bool_1045_) {
			Class183 class183 = new Class183();
			short i_1049_ = (short) is.length;
			int i_1050_ = (short) is_1041_.length;
			((Class183) class183).aShort2265 = i_1049_;
			((Class183) class183).aShortArray2274 = new short[i_1049_];
			((Class183) class183).aShortArray2267 = new short[i_1049_];
			((Class183) class183).aShortArray2268 = new short[i_1049_];
			((Class183) class183).aShortArray2264 = new short[i_1049_];
			for (int i_1051_ = 0; i_1051_ < i_1049_; i_1051_++) {
				int i_1052_ = is[i_1051_];
				int i_1053_ = is_1036_[i_1051_];
				if (i_1052_ == 0 && i_1053_ == 0)
					((Class183) class183).aShortArray2274[i_1051_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_]));
				else if (i_1052_ == 0 && i_1053_ == anInt4774 * 750971439)
					((Class183) class183).aShortArray2274[i_1051_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_ + 1]));
				else if (i_1052_ == anInt4774 * 750971439 && i_1053_ == anInt4774 * 750971439)
					((Class183) class183).aShortArray2274[i_1051_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_ + 1]));
				else if (i_1052_ == anInt4774 * 750971439 && i_1053_ == 0)
					((Class183) class183).aShortArray2274[i_1051_] = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_]));
				else {
					int i_1054_ = (((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_])) * (anInt4774 * 750971439 - i_1052_) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_])) * i_1052_);
					int i_1055_ = ((((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_ + 1])) * (anInt4774 * 750971439 - i_1052_)) + ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_ + 1])) * i_1052_);
					((Class183) class183).aShortArray2274[i_1051_] = (short) ((i_1054_ * (anInt4774 * 750971439 - i_1053_) + i_1055_ * i_1053_) >> anInt4775 * -581663386);
				}
				int i_1056_ = (i << anInt4775 * 1856651955) + i_1052_;
				int i_1057_ = (i_1034_ << anInt4775 * 1856651955) + i_1053_;
				((Class183) class183).aShortArray2267[i_1051_] = (short) i_1052_;
				((Class183) class183).aShortArray2264[i_1051_] = (short) i_1053_;
				((Class183) class183).aShortArray2268[i_1051_] = (short) (method6709(i_1056_, i_1057_, 234155680) + (is_1035_ != null ? is_1035_[i_1051_] : 0));
				if (((Class183) class183).aShortArray2274[i_1051_] < 2)
					((Class183) class183).aShortArray2274[i_1051_] = (short) 2;
			}
			boolean bool_1058_ = false;
			int i_1059_ = 0;
			for (int i_1060_ = 0; i_1060_ < i_1050_; i_1060_++) {
				if (is_1041_[i_1060_] >= 0 || is_1042_ != null && is_1042_[i_1060_] >= 0)
					i_1059_++;
				int i_1061_ = is_1043_[i_1060_];
				if (i_1061_ != -1) {
					Class169 class169 = ((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_1061_, -1812974887);
					if (!class169.aBool2056) {
						bool_1058_ = true;
						if (method14620(class169.aByte2064) || class169.aByte2081 != 0 || class169.aByte2090 != 0)
							((Class183) class183).aByte2276 |= 0x4;
					}
				}
			}
			((Class183) class183).anIntArray2272 = new int[i_1059_];
			if (is_1042_ != null)
				((Class183) class183).anIntArray2277 = new int[i_1059_];
			((Class183) class183).aShortArray2271 = new short[i_1059_];
			((Class183) class183).aShortArray2266 = new short[i_1059_];
			((Class183) class183).aShortArray2273 = new short[i_1059_];
			if (bool_1058_) {
				((Class183) class183).aShortArray2270 = new short[i_1059_];
				((Class183) class183).aShortArray2275 = new short[i_1059_];
			}
			for (int i_1062_ = 0; i_1062_ < i_1050_; i_1062_++) {
				if (is_1041_[i_1062_] >= 0 || is_1042_ != null && is_1042_[i_1062_] >= 0) {
					if (is_1041_[i_1062_] >= 0)
						((Class183) class183).anIntArray2272[((Class183) class183).aShort2269] = Class372.method6362(is_1041_[i_1062_], 1109238705);
					else
						((Class183) class183).anIntArray2272[((Class183) class183).aShort2269] = -1;
					if (is_1042_ != null) {
						if (is_1042_[i_1062_] != -1)
							((Class183) class183).anIntArray2277[((Class183) class183).aShort2269] = Class372.method6362(is_1042_[i_1062_], 994754060);
						else
							((Class183) class183).anIntArray2277[((Class183) class183).aShort2269] = -1;
					}
					((Class183) class183).aShortArray2271[((Class183) class183).aShort2269] = (short) is_1038_[i_1062_];
					((Class183) class183).aShortArray2266[((Class183) class183).aShort2269] = (short) is_1039_[i_1062_];
					((Class183) class183).aShortArray2273[((Class183) class183).aShort2269] = (short) is_1040_[i_1062_];
					if (bool_1058_) {
						if (is_1043_[i_1062_] != -1 && !(((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(is_1043_[i_1062_], -2128895777).aBool2056)) {
							((Class183) class183).aShortArray2270[((Class183) class183).aShort2269] = (short) is_1043_[i_1062_];
							((Class183) class183).aShortArray2275[((Class183) class183).aShort2269] = (short) is_1044_[i_1062_];
						} else
							((Class183) class183).aShortArray2270[((Class183) class183).aShort2269] = (short) -1;
					}
					((Class183) class183).aShort2269++;
				}
			}
			((Class390_Sub3) this).aClass183ArrayArray9332[i][i_1034_] = class183;
		} else if (is_1041_[0] >= 0 || is_1042_ != null && is_1042_[0] >= 0) {
			Class178 class178 = new Class178();
			int i_1063_ = is_1041_[0];
			int i_1064_ = is_1043_[0];
			if (is_1042_ != null) {
				((Class178) class178).anInt2213 = (Class282_Sub20_Sub2.method15076(Class372.method6362(is_1042_[0], 514771818), (((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_] - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_])), -1389743133));
				if (i_1063_ == -1)
					((Class178) class178).aByte2219 |= 0x2;
			}
			if ((anIntArrayArray4772[i][i_1034_] == anIntArrayArray4772[i + 1][i_1034_]) && (anIntArrayArray4772[i][i_1034_] == anIntArrayArray4772[i + 1][i_1034_ + 1]) && (anIntArrayArray4772[i][i_1034_] == anIntArrayArray4772[i][i_1034_ + 1]))
				((Class178) class178).aByte2219 |= 0x1;
			Class169 class169 = null;
			if (i_1064_ != -1)
				class169 = ((Class390_Sub3) this).aClass505_Sub3_9353.anInterface22_5834.method144(i_1064_, -1908852297);
			if (class169 != null && (((Class178) class178).aByte2219 & 0x2) == 0 && !class169.aBool2056) {
				((Class178) class178).aShort2214 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_]));
				((Class178) class178).aShort2217 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_]));
				((Class178) class178).aShort2216 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_ + 1]));
				((Class178) class178).aShort2218 = (short) ((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_ + 1]));
				((Class178) class178).aShort2215 = (short) i_1064_;
				if (method14620(class169.aByte2064) || class169.aByte2081 != 0 || class169.aByte2090 != 0)
					((Class178) class178).aByte2219 |= 0x4;
			} else {
				short i_1065_ = Class372.method6362(i_1063_, 1076045919);
				((Class178) class178).aShort2214 = (short) (Class282_Sub20_Sub2.method15076(i_1065_, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_])), -1603367966));
				((Class178) class178).aShort2217 = (short) (Class282_Sub20_Sub2.method15076(i_1065_, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_])), -1346997242));
				((Class178) class178).aShort2216 = (short) (Class282_Sub20_Sub2.method15076(i_1065_, ((((Class390_Sub3) this).aByteArrayArray9355[i + 1][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i + 1][i_1034_ + 1])), -1355549005));
				((Class178) class178).aShort2218 = (short) (Class282_Sub20_Sub2.method15076(i_1065_, ((((Class390_Sub3) this).aByteArrayArray9355[i][i_1034_ + 1]) - (((Class390_Sub3) this).aByteArrayArray9356[i][i_1034_ + 1])), -1809366427));
				((Class178) class178).aShort2215 = (short) -1;
			}
			((Class390_Sub3) this).aClass178ArrayArray9352[i][i_1034_] = class178;
		}
	}

	public void u(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_1066_, int i_1067_, int i_1068_, boolean bool) {
		/* empty */
	}

	public boolean method6718(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_1069_, int i_1070_, int i_1071_, boolean bool) {
		return false;
	}

	void method14636(int i, int i_1072_, ChoppyItemFixClass class144, float[] fs, float[] fs_1073_, float[] fs_1074_, float[] fs_1075_, float[] fs_1076_, int i_1077_) {
		Class178 class178 = ((Class390_Sub3) this).aClass178ArrayArray9352[i][i_1072_];
		if (class178 != null) {
			if ((((Class178) class178).aByte2219 & 0x2) == 0) {
				if (i_1077_ != 0) {
					if ((((Class178) class178).aByte2219 & 0x4) != 0) {
						if ((i_1077_ & 0x1) != 0)
							return;
					} else if ((i_1077_ & 0x2) != 0)
						return;
				}
				int i_1078_ = i * (anInt4774 * 750971439);
				int i_1079_ = i_1078_ + anInt4774 * 750971439;
				int i_1080_ = i_1072_ * (anInt4774 * 750971439);
				int i_1081_ = i_1080_ + anInt4774 * 750971439;
				float f;
				float f_1082_;
				float f_1083_;
				float f_1084_;
				float f_1085_;
				float f_1086_;
				float f_1087_;
				float f_1088_;
				float f_1089_;
				float f_1090_;
				float f_1091_;
				float f_1092_;
				float f_1093_;
				float f_1094_;
				float f_1095_;
				float f_1096_;
				if ((((Class178) class178).aByte2219 & 0x1) != 0) {
					int i_1097_ = anIntArrayArray4772[i][i_1072_];
					float f_1098_ = ((Class390_Sub3) this).aFloat9334 * (float) i_1097_;
					float f_1099_ = ((Class390_Sub3) this).aFloat9346 * (float) i_1097_;
					float f_1100_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1078_) + f_1098_ + (((Class390_Sub3) this).aFloat9349 * (float) i_1080_)));
					f = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_1078_ + f_1099_ + (((Class390_Sub3) this).aFloat9350 * (float) i_1080_)));
					if (f_1100_ < -f)
						return;
					float f_1101_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1079_) + f_1098_ + (((Class390_Sub3) this).aFloat9349 * (float) i_1080_)));
					f_1082_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1079_) + f_1099_ + (((Class390_Sub3) this).aFloat9350 * (float) i_1080_)));
					if (f_1101_ < -f_1082_)
						return;
					float f_1102_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1079_) + f_1098_ + (((Class390_Sub3) this).aFloat9349 * (float) i_1081_)));
					f_1083_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1079_) + f_1099_ + (((Class390_Sub3) this).aFloat9350 * (float) i_1081_)));
					if (f_1102_ < -f_1083_)
						return;
					float f_1103_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1078_) + f_1098_ + (((Class390_Sub3) this).aFloat9349 * (float) i_1081_)));
					f_1084_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1078_) + f_1099_ + (((Class390_Sub3) this).aFloat9350 * (float) i_1081_)));
					if (f_1103_ < -f_1084_)
						return;
					float f_1104_ = ((Class390_Sub3) this).aFloat9343 * (float) i_1097_;
					float f_1105_ = ((Class390_Sub3) this).aFloat9344 * (float) i_1097_;
					float f_1106_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1078_) + f_1104_ + (((Class390_Sub3) this).aFloat9339 * (float) i_1080_)));
					f_1085_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_1106_ / f);
					float f_1107_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1078_) + f_1105_ + (((Class390_Sub3) this).aFloat9327 * (float) i_1080_)));
					f_1086_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_1107_ / f);
					f_1087_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_1100_ / f);
					float f_1108_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1079_) + f_1104_ + (((Class390_Sub3) this).aFloat9339 * (float) i_1080_)));
					f_1088_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1108_ / f_1082_));
					float f_1109_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1079_) + f_1105_ + (((Class390_Sub3) this).aFloat9327 * (float) i_1080_)));
					f_1089_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1109_ / f_1082_));
					f_1090_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_1101_ / f_1082_));
					float f_1110_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1079_) + f_1104_ + (((Class390_Sub3) this).aFloat9339 * (float) i_1081_)));
					f_1091_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1110_ / f_1083_));
					float f_1111_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1079_) + f_1105_ + (((Class390_Sub3) this).aFloat9327 * (float) i_1081_)));
					f_1092_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1111_ / f_1083_));
					f_1093_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_1102_ / f_1083_));
					float f_1112_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1078_) + f_1104_ + (((Class390_Sub3) this).aFloat9339 * (float) i_1081_)));
					f_1094_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1112_ / f_1084_));
					float f_1113_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1078_) + f_1105_ + (((Class390_Sub3) this).aFloat9327 * (float) i_1081_)));
					f_1095_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1113_ / f_1084_));
					f_1096_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_1103_ / f_1084_));
				} else {
					int i_1114_ = anIntArrayArray4772[i][i_1072_];
					int i_1115_ = anIntArrayArray4772[i + 1][i_1072_];
					int i_1116_ = anIntArrayArray4772[i + 1][i_1072_ + 1];
					int i_1117_ = anIntArrayArray4772[i][i_1072_ + 1];
					float f_1118_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9334 * (float) i_1114_) + (((Class390_Sub3) this).aFloat9349 * (float) i_1080_)));
					f = (((Class390_Sub3) this).aFloat9354 + (((Class390_Sub3) this).aFloat9342 * (float) i_1078_ + (((Class390_Sub3) this).aFloat9346 * (float) i_1114_) + (((Class390_Sub3) this).aFloat9350 * (float) i_1080_)));
					if (f_1118_ < -f)
						return;
					float f_1119_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9334 * (float) i_1115_) + (((Class390_Sub3) this).aFloat9349 * (float) i_1080_)));
					f_1082_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9346 * (float) i_1115_) + (((Class390_Sub3) this).aFloat9350 * (float) i_1080_)));
					if (f_1119_ < -f_1082_)
						return;
					float f_1120_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9334 * (float) i_1116_) + (((Class390_Sub3) this).aFloat9349 * (float) i_1081_)));
					f_1083_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9346 * (float) i_1116_) + (((Class390_Sub3) this).aFloat9350 * (float) i_1081_)));
					if (f_1120_ < -f_1083_)
						return;
					float f_1121_ = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9334 * (float) i_1117_) + (((Class390_Sub3) this).aFloat9349 * (float) i_1081_)));
					f_1084_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9346 * (float) i_1117_) + (((Class390_Sub3) this).aFloat9350 * (float) i_1081_)));
					if (f_1121_ < -f_1084_)
						return;
					float f_1122_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9343 * (float) i_1114_) + (((Class390_Sub3) this).aFloat9339 * (float) i_1080_)));
					f_1085_ = (((ChoppyItemFixClass) class144).aFloat1678 + ((ChoppyItemFixClass) class144).aFloat1679 * f_1122_ / f);
					float f_1123_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9344 * (float) i_1114_) + (((Class390_Sub3) this).aFloat9327 * (float) i_1080_)));
					f_1086_ = (((ChoppyItemFixClass) class144).aFloat1680 + ((ChoppyItemFixClass) class144).aFloat1702 * f_1123_ / f);
					f_1087_ = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f_1118_ / f);
					float f_1124_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9343 * (float) i_1115_) + (((Class390_Sub3) this).aFloat9339 * (float) i_1080_)));
					f_1088_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1124_ / f_1082_));
					float f_1125_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9344 * (float) i_1115_) + (((Class390_Sub3) this).aFloat9327 * (float) i_1080_)));
					f_1089_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1125_ / f_1082_));
					f_1090_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_1119_ / f_1082_));
					float f_1126_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9343 * (float) i_1116_) + (((Class390_Sub3) this).aFloat9339 * (float) i_1081_)));
					f_1091_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1126_ / f_1083_));
					float f_1127_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1079_) + (((Class390_Sub3) this).aFloat9344 * (float) i_1116_) + (((Class390_Sub3) this).aFloat9327 * (float) i_1081_)));
					f_1092_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1127_ / f_1083_));
					f_1093_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_1120_ / f_1083_));
					float f_1128_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9343 * (float) i_1117_) + (((Class390_Sub3) this).aFloat9339 * (float) i_1081_)));
					f_1094_ = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1128_ / f_1084_));
					float f_1129_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1078_) + (((Class390_Sub3) this).aFloat9344 * (float) i_1117_) + (((Class390_Sub3) this).aFloat9327 * (float) i_1081_)));
					f_1095_ = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1129_ / f_1084_));
					f_1096_ = (((ChoppyItemFixClass) class144).aFloat1682 + (((ChoppyItemFixClass) class144).aFloat1683 * f_1121_ / f_1084_));
				}
				if (((f_1091_ - f_1094_) * (f_1089_ - f_1095_) - (f_1092_ - f_1095_) * (f_1088_ - f_1094_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_1091_ < 0.0F || f_1094_ < 0.0F || f_1088_ < 0.0F || f_1091_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_1094_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_1088_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (((Class178) class178).aShort2215 >= 0)
						class144.method2424(true, true, false, f_1092_, f_1095_, f_1089_, f_1091_, f_1094_, f_1088_, f_1093_, f_1096_, f_1090_, f_1083_, f_1084_, f_1082_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | (Class335.anIntArray3916[(((Class178) class178).aShort2216 & 0xffff)]) & 0xffffff, ~0xffffff | (Class335.anIntArray3916[(((Class178) class178).aShort2218 & 0xffff)]) & 0xffffff, ~0xffffff | (Class335.anIntArray3916[(((Class178) class178).aShort2217 & 0xffff)]) & 0xffffff, 0, 0.0F,
								0.0F, 0.0F, ((Class178) class178).aShort2215);
					else
						class144.method2426(true, true, false, f_1092_, f_1095_, f_1089_, f_1091_, f_1094_, f_1088_, f_1093_, f_1096_, f_1090_, (float) (((Class178) class178).aShort2216 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff));
				}
				if (((f_1085_ - f_1088_) * (f_1095_ - f_1089_) - (f_1086_ - f_1089_) * (f_1094_ - f_1088_)) > 0.0F) {
					((ChoppyItemFixClass) class144).aBool1708 = (f_1085_ < 0.0F || f_1088_ < 0.0F || f_1094_ < 0.0F || f_1085_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || f_1088_ > (float) ((ChoppyItemFixClass) class144).anInt1684 || (f_1094_ > (float) ((ChoppyItemFixClass) class144).anInt1684));
					if (((Class178) class178).aShort2215 >= 0)
						class144.method2424(true, true, false, f_1086_, f_1089_, f_1095_, f_1085_, f_1088_, f_1094_, f_1087_, f_1090_, f_1096_, f, f_1082_, f_1084_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | (Class335.anIntArray3916[(((Class178) class178).aShort2214 & 0xffff)]) & 0xffffff, ~0xffffff | (Class335.anIntArray3916[(((Class178) class178).aShort2217 & 0xffff)]) & 0xffffff, ~0xffffff | (Class335.anIntArray3916[(((Class178) class178).aShort2218 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F,
								0.0F, ((Class178) class178).aShort2215);
					else
						class144.method2426(true, true, false, f_1086_, f_1089_, f_1095_, f_1085_, f_1088_, f_1094_, f_1087_, f_1090_, f_1096_, (float) (((Class178) class178).aShort2214 & 0xffff), (float) (((Class178) class178).aShort2217 & 0xffff), (float) (((Class178) class178).aShort2218 & 0xffff));
				}
			}
		} else {
			Class183 class183 = ((Class390_Sub3) this).aClass183ArrayArray9332[i][i_1072_];
			if (class183 != null) {
				if (i_1077_ != 0) {
					if ((((Class183) class183).aByte2276 & 0x4) != 0) {
						if ((i_1077_ & 0x1) != 0)
							return;
					} else if ((i_1077_ & 0x2) != 0)
						return;
				}
				for (int i_1130_ = 0; i_1130_ < ((Class183) class183).aShort2265; i_1130_++) {
					int i_1131_ = (((Class183) class183).aShortArray2267[i_1130_] + (i << anInt4775 * 1856651955));
					short i_1132_ = ((Class183) class183).aShortArray2268[i_1130_];
					int i_1133_ = (((Class183) class183).aShortArray2264[i_1130_] + (i_1072_ << anInt4775 * 1856651955));
					float f = (((Class390_Sub3) this).aFloat9333 + ((((Class390_Sub3) this).aFloat9341 * (float) i_1131_) + (((Class390_Sub3) this).aFloat9334 * (float) i_1132_) + (((Class390_Sub3) this).aFloat9349 * (float) i_1133_)));
					float f_1134_ = (((Class390_Sub3) this).aFloat9354 + ((((Class390_Sub3) this).aFloat9342 * (float) i_1131_) + (((Class390_Sub3) this).aFloat9346 * (float) i_1132_) + (((Class390_Sub3) this).aFloat9350 * (float) i_1133_)));
					if (f < -f_1134_)
						return;
					float f_1135_ = (((Class390_Sub3) this).aFloat9351 + ((((Class390_Sub3) this).aFloat9338 * (float) i_1131_) + (((Class390_Sub3) this).aFloat9343 * (float) i_1132_) + (((Class390_Sub3) this).aFloat9339 * (float) i_1133_)));
					float f_1136_ = (((Class390_Sub3) this).aFloat9328 + ((((Class390_Sub3) this).aFloat9340 * (float) i_1131_) + (((Class390_Sub3) this).aFloat9344 * (float) i_1132_) + (((Class390_Sub3) this).aFloat9327 * (float) i_1133_)));
					fs[i_1130_] = (((ChoppyItemFixClass) class144).aFloat1678 + (((ChoppyItemFixClass) class144).aFloat1679 * f_1135_ / f_1134_));
					fs_1073_[i_1130_] = (((ChoppyItemFixClass) class144).aFloat1680 + (((ChoppyItemFixClass) class144).aFloat1702 * f_1136_ / f_1134_));
					fs_1074_[i_1130_] = (((ChoppyItemFixClass) class144).aFloat1682 + ((ChoppyItemFixClass) class144).aFloat1683 * f / f_1134_);
					fs_1075_[i_1130_] = f_1134_;
				}
				if (((Class183) class183).aShortArray2270 != null) {
					for (int i_1137_ = 0; i_1137_ < ((Class183) class183).aShort2269; i_1137_++) {
						short i_1138_ = ((Class183) class183).aShortArray2271[i_1137_];
						short i_1139_ = ((Class183) class183).aShortArray2266[i_1137_];
						short i_1140_ = ((Class183) class183).aShortArray2273[i_1137_];
						float f = fs[i_1138_];
						float f_1141_ = fs[i_1139_];
						float f_1142_ = fs[i_1140_];
						float f_1143_ = fs_1073_[i_1138_];
						float f_1144_ = fs_1073_[i_1139_];
						float f_1145_ = fs_1073_[i_1140_];
						if (((f - f_1141_) * (f_1145_ - f_1144_) - (f_1143_ - f_1144_) * (f_1142_ - f_1141_)) > 0.0F) {
							((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_1141_ < 0.0F || f_1142_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_1141_ > (float) (((ChoppyItemFixClass) class144).anInt1684) || f_1142_ > (float) (((ChoppyItemFixClass) class144).anInt1684));
							short i_1146_ = (((Class183) class183).aShortArray2270[i_1137_]);
							if (i_1146_ != -1)
								class144.method2424(true, true, false, f_1143_, f_1144_, f_1145_, f, f_1141_, f_1142_, fs_1074_[i_1138_], fs_1074_[i_1139_], fs_1074_[i_1140_], fs_1075_[i_1138_], fs_1075_[i_1139_], fs_1075_[i_1140_], ((float) (((Class183) class183).aShortArray2267[i_1138_]) / (float) (anInt4774 * 750971439)), ((float) (((Class183) class183).aShortArray2267[i_1139_]) / (float) (anInt4774 * 750971439)),
										((float) (((Class183) class183).aShortArray2267[i_1140_]) / (float) (anInt4774 * 750971439)), ((float) (((Class183) class183).aShortArray2264[i_1138_]) / (float) (anInt4774 * 750971439)), ((float) (((Class183) class183).aShortArray2264[i_1139_]) / (float) (anInt4774 * 750971439)), ((float) (((Class183) class183).aShortArray2264[i_1140_]) / (float) (anInt4774 * 750971439)),
										~0xffffff | (Class335.anIntArray3916[((((Class183) class183).aShortArray2274[i_1138_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class335.anIntArray3916[((((Class183) class183).aShortArray2274[i_1139_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Class335.anIntArray3916[((((Class183) class183).aShortArray2274[i_1140_]) & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, i_1146_);
							else {
								int i_1147_ = (((Class183) class183).anIntArray2272[i_1137_]);
								if (i_1147_ != -1)
									class144.method2426(true, true, false, f_1143_, f_1144_, f_1145_, f, f_1141_, f_1142_, fs_1074_[i_1138_], fs_1074_[i_1139_], fs_1074_[i_1140_], (float) (Class282_Sub20_Sub2.method15076(i_1147_, (((Class183) class183).aShortArray2274[i_1138_]), -1496789581)), (float) (Class282_Sub20_Sub2.method15076(i_1147_, (((Class183) class183).aShortArray2274[i_1139_]), -1887497744)),
											(float) (Class282_Sub20_Sub2.method15076(i_1147_, (((Class183) class183).aShortArray2274[i_1140_]), -2145258045)));
							}
						}
					}
				} else {
					for (int i_1148_ = 0; i_1148_ < ((Class183) class183).aShort2269; i_1148_++) {
						short i_1149_ = ((Class183) class183).aShortArray2271[i_1148_];
						short i_1150_ = ((Class183) class183).aShortArray2266[i_1148_];
						short i_1151_ = ((Class183) class183).aShortArray2273[i_1148_];
						float f = fs[i_1149_];
						float f_1152_ = fs[i_1150_];
						float f_1153_ = fs[i_1151_];
						float f_1154_ = fs_1073_[i_1149_];
						float f_1155_ = fs_1073_[i_1150_];
						float f_1156_ = fs_1073_[i_1151_];
						if (((f - f_1152_) * (f_1156_ - f_1155_) - (f_1154_ - f_1155_) * (f_1153_ - f_1152_)) > 0.0F) {
							int i_1157_ = (((Class183) class183).anIntArray2272[i_1148_]);
							if (i_1157_ != -1) {
								((ChoppyItemFixClass) class144).aBool1708 = (f < 0.0F || f_1152_ < 0.0F || f_1153_ < 0.0F || f > (float) (((ChoppyItemFixClass) class144).anInt1684) || (f_1152_ > (float) (((ChoppyItemFixClass) class144).anInt1684)) || (f_1153_ > (float) (((ChoppyItemFixClass) class144).anInt1684)));
								class144.method2426(true, true, false, f_1154_, f_1155_, f_1156_, f, f_1152_, f_1153_, fs_1074_[i_1149_], fs_1074_[i_1150_], fs_1074_[i_1151_], (float) (Class282_Sub20_Sub2.method15076(i_1157_, (((Class183) class183).aShortArray2274[i_1149_]), -1918290292)), (float) (Class282_Sub20_Sub2.method15076(i_1157_, (((Class183) class183).aShortArray2274[i_1150_]), -1603828878)),
										(float) (Class282_Sub20_Sub2.method15076(i_1157_, (((Class183) class183).aShortArray2274[i_1151_]), -2059468671)));
							}
						}
					}
				}
			}
		}
	}

	public void d(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_1158_, int i_1159_, int i_1160_, boolean bool) {
		/* empty */
	}

	public void a(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_1161_, int i_1162_, int i_1163_, boolean bool) {
		/* empty */
	}

	static int method14637(int i, int i_1164_) {
		int i_1165_ = (i & 0xff0000) * i_1164_ >> 23;
		if (i_1165_ < 2)
			i_1165_ = 2;
		else if (i_1165_ > 253)
			i_1165_ = 253;
		int i_1166_ = (i & 0xff00) * i_1164_ >> 15;
		if (i_1166_ < 2)
			i_1166_ = 2;
		else if (i_1166_ > 253)
			i_1166_ = 253;
		int i_1167_ = (i & 0xff) * i_1164_ >> 7;
		if (i_1167_ < 2)
			i_1167_ = 2;
		else if (i_1167_ > 253)
			i_1167_ = 253;
		return i_1165_ << 16 | i_1166_ << 8 | i_1167_;
	}

	void method14638(int i, int i_1168_, int i_1169_) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		((ChoppyItemFixClass) ((Class185) class185).aClass144_2310).anInt1674 = 0;
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null)
			method14617(i, i_1168_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_1169_);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14636(i, i_1168_, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_1169_);
		else if (((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14619(i, i_1168_, ((Class185) class185).aBool2309, class185, ((Class185) class185).aClass144_2310, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342, ((Class185) class185).aFloatArray2330, ((Class185) class185).aFloatArray2344, ((Class185) class185).aFloatArray2345, i_1169_);
	}

	public void b(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_1170_, int i_1171_, int i_1172_, boolean bool) {
		/* empty */
	}

	public void method6721(Class282_Sub24 class282_sub24, int[] is) {
		/* empty */
	}

	public void method6711(Class282_Sub24 class282_sub24, int[] is) {
		/* empty */
	}

	public void method6723(int i, int i_1173_, int i_1174_, int i_1175_, int i_1176_, int i_1177_, int i_1178_, boolean[][] bools) {
		Class185 class185 = ((Class390_Sub3) this).aClass505_Sub3_9353.method14370(Thread.currentThread());
		ChoppyItemFixClass class144 = ((Class185) class185).aClass144_2310;
		((ChoppyItemFixClass) class144).anInt1674 = 0;
		((ChoppyItemFixClass) class144).aBool1708 = true;
		((Class390_Sub3) this).aClass505_Sub3_9353.method14410();
		if (((Class390_Sub3) this).aClass177ArrayArray9336 != null || ((Class390_Sub3) this).aClass181ArrayArray9335 != null)
			method14618(i, i_1173_, i_1174_, i_1175_, i_1176_, i_1177_, i_1178_, bools, class185, class144, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342);
		else if (((Class390_Sub3) this).aClass178ArrayArray9352 != null)
			method14622(i, i_1173_, i_1174_, i_1175_, i_1176_, i_1177_, i_1178_, bools, class185, class144, ((Class185) class185).aFloatArray2315, ((Class185) class185).aFloatArray2342);
	}

	Class390_Sub3(HardwareRenderer class505_sub3, int i, int i_1179_, int i_1180_, int i_1181_, int[][] is, int[][] is_1182_, int i_1183_) {
		super(i_1180_, i_1181_, i_1183_, is);
		((Class390_Sub3) this).aClass505_Sub3_9353 = class505_sub3;
		((Class390_Sub3) this).anInt9345 = i_1179_;
		((Class390_Sub3) this).aByteArrayArray9355 = new byte[i_1180_ + 1][i_1181_ + 1];
		int i_1184_ = ((((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).anInt8992) * -456583957 >> 9);
		for (int i_1185_ = 1; i_1185_ < i_1181_; i_1185_++) {
			for (int i_1186_ = 1; i_1186_ < i_1180_; i_1186_++) {
				int i_1187_ = i_1184_;
				int i_1188_ = (is_1182_[i_1186_ + 1][i_1185_] - is_1182_[i_1186_ - 1][i_1185_]);
				int i_1189_ = (is_1182_[i_1186_][i_1185_ + 1] - is_1182_[i_1186_][i_1185_ - 1]);
				int i_1190_ = (int) Math.sqrt((double) (i_1188_ * i_1188_ + 512 * i_1183_ + i_1189_ * i_1189_));
				int i_1191_ = (i_1188_ << 8) / i_1190_;
				int i_1192_ = -512 * i_1183_ / i_1190_;
				int i_1193_ = (i_1189_ << 8) / i_1190_;
				i_1187_ += ((((HardwareRenderer) (((Class390_Sub3) this).aClass505_Sub3_9353)).anInt9011 * 1302966735 * i_1191_) + (((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).anInt8988) * -1947219005 * i_1192_ + (((HardwareRenderer) ((Class390_Sub3) this).aClass505_Sub3_9353).anInt9007) * 1237704411 * i_1193_) >> 17;
				i_1187_ >>= 1;
				if (i_1187_ < 2)
					i_1187_ = 2;
				else if (i_1187_ > 126)
					i_1187_ = 126;
				((Class390_Sub3) this).aByteArrayArray9355[i_1186_][i_1185_] = (byte) i_1187_;
			}
		}
		((Class390_Sub3) this).aByteArrayArray9356 = new byte[i_1180_ + 1][i_1181_ + 1];
	}
}
