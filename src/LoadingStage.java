/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LoadingStage {
	boolean aBool4694;
	static LoadingStage aClass387_4695;
	static LoadingStage aClass387_4696;
	static LoadingStage aClass387_4697 = new LoadingStage(0, Message.CHECKING_FOR_UPDATES, 2);
	static LoadingStage aClass387_4698;
	static LoadingStage aClass387_4699;
	static LoadingStage aClass387_4700;
	static LoadingStage aClass387_4701;
	static LoadingStage aClass387_4702;
	int anInt4703;
	static LoadingStage aClass387_4704;
	static LoadingStage aClass387_4705;
	static LoadingStage aClass387_4706;
	static LoadingStage aClass387_4707;
	static LoadingStage aClass387_4708;
	static LoadingStage aClass387_4709;
	static LoadingStage aClass387_4710;
	Message aClass433_4711;
	public int anInt4712;
	static LoadingStage aClass387_4713;
	Message aClass433_4714;
	int anInt4715;
	static LoadingStage aClass387_4716;
	static LoadingStage aClass387_4717;
	boolean aBool4718;

	LoadingStage(int i, Message class433, Message class433_0_, int i_1_, int i_2_, boolean bool, boolean bool_3_) {
		anInt4712 = 2061403819 * i;
		((LoadingStage) this).aClass433_4711 = class433;
		((LoadingStage) this).aClass433_4714 = class433_0_;
		((LoadingStage) this).anInt4715 = -786455353 * i_1_;
		((LoadingStage) this).anInt4703 = -1800347625 * i_2_;
		((LoadingStage) this).aBool4694 = bool;
		((LoadingStage) this).aBool4718 = bool_3_;
	}

	LoadingStage(int i, Message class433, int i_4_) {
		this(i, class433, class433, i_4_, i_4_, true, false);
	}

	LoadingStage(int i, Message class433, Message class433_5_, int i_6_, int i_7_) {
		this(i, class433, class433_5_, i_6_, i_7_, true, false);
	}

	static {
		aClass387_4695 = new LoadingStage(1, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 2, 3);
		aClass387_4696 = new LoadingStage(2, Message.CHECKING_FOR_UPDATES, 3);
		aClass387_4702 = new LoadingStage(3, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 3, 4);
		aClass387_4708 = new LoadingStage(4, Message.CHECKING_FOR_UPDATES, 4);
		aClass387_4699 = new LoadingStage(5, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 4, 5);
		aClass387_4700 = new LoadingStage(6, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 5, 98, true, true);
		aClass387_4717 = new LoadingStage(7, Message.CHECKING_FOR_UPDATES, 99);
		aClass387_4709 = new LoadingStage(8, Message.CHECKING_FOR_UPDATES, 100);
		aClass387_4716 = new LoadingStage(9, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 0, 92, true, true);
		aClass387_4704 = new LoadingStage(10, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 92, 93);
		aClass387_4705 = new LoadingStage(11, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 94, 95);
		aClass387_4706 = new LoadingStage(12, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 96, 97);
		aClass387_4707 = new LoadingStage(13, Message.FETCHING_UPDATES, 97);
		aClass387_4713 = new LoadingStage(14, Message.FETCHING_UPDATES, 97);
		aClass387_4698 = new LoadingStage(15, Message.FETCHING_UPDATES, 100);
		aClass387_4710 = new LoadingStage(16, Message.FETCHING_UPDATES, 100);
		aClass387_4701 = new LoadingStage(17, Message.FETCHING_UPDATES, 100);
	}

	static LoadingStage[] method6676(int i) {
		return (new LoadingStage[] { aClass387_4697, aClass387_4695, aClass387_4696, aClass387_4702, aClass387_4708, aClass387_4699, aClass387_4700, aClass387_4717, aClass387_4709, aClass387_4716, aClass387_4704, aClass387_4705, aClass387_4706, aClass387_4707, aClass387_4713, aClass387_4698, aClass387_4710, aClass387_4701 });
	}

	static final void method6677(CS2Executor class527, int i) {
		int i_8_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i_8_].aByte525);
	}

	static final void method6678(CS2Executor class527, byte i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_9_ < 0 || i_9_ > 5)
			i_9_ = 2;
		Class538.method11500(i_9_, false, (byte) 24);
	}

	static final void decodeUpdate(RsBitsBuffer buffer, int i) {
		int i_10_ = 0;
		buffer.initBitAccess((byte) 8);
		for (int i_11_ = 0; i_11_ < Class197.NUM_PLAYER_INDICES * -963499271; i_11_++) {
			int i_12_ = Class197.PLAYER_INDICES[i_11_];
			if ((Class197.aByteArray2424[i_12_] & 0x1) == 0) {
				if (i_10_ > 0) {
					i_10_--;
					Class197.aByteArray2424[i_12_] |= 0x2;
				} else {
					int needsUpdate = buffer.readBits(1, (byte) 65);
					if (0 == needsUpdate) {
						i_10_ = Class399.decodeSkip(buffer, -1089696060);
						Class197.aByteArray2424[i_12_] |= 0x2;
					} else
						Class105.method1806(buffer, i_12_, 1605181338);
				}
			}
		}
		buffer.finishBitAccess((byte) 118);
		if (i_10_ != 0)
			throw new RuntimeException();
		buffer.initBitAccess((byte) 18);
		for (int i_14_ = 0; i_14_ < Class197.NUM_PLAYER_INDICES * -963499271; i_14_++) {
			int i_15_ = Class197.PLAYER_INDICES[i_14_];
			if ((Class197.aByteArray2424[i_15_] & 0x1) != 0) {
				if (i_10_ > 0) {
					i_10_--;
					Class197.aByteArray2424[i_15_] |= 0x2;
				} else {
					int i_16_ = buffer.readBits(1, (byte) -13);
					if (0 == i_16_) {
						i_10_ = Class399.decodeSkip(buffer, -1089696060);
						Class197.aByteArray2424[i_15_] |= 0x2;
					} else
						Class105.method1806(buffer, i_15_, 1591127292);
				}
			}
		}
		buffer.finishBitAccess((byte) 89);
		if (i_10_ != 0)
			throw new RuntimeException();
		buffer.initBitAccess((byte) 3);
		for (int i_17_ = 0; i_17_ < 1265369243 * Class197.anInt2431; i_17_++) {
			int i_18_ = Class197.anIntArray2426[i_17_];
			if (0 != (Class197.aByteArray2424[i_18_] & 0x1)) {
				if (i_10_ > 0) {
					i_10_--;
					Class197.aByteArray2424[i_18_] |= 0x2;
				} else {
					int i_19_ = buffer.readBits(1, (byte) -39);
					if (0 == i_19_) {
						i_10_ = Class399.decodeSkip(buffer, -1089696060);
						Class197.aByteArray2424[i_18_] |= 0x2;
					} else if (Class346.method6155(buffer, i_18_, (short) 371))
						Class197.aByteArray2424[i_18_] |= 0x2;
				}
			}
		}
		buffer.finishBitAccess((byte) 28);
		if (i_10_ != 0)
			throw new RuntimeException();
		buffer.initBitAccess((byte) -48);
		for (int i_20_ = 0; i_20_ < Class197.anInt2431 * 1265369243; i_20_++) {
			int i_21_ = Class197.anIntArray2426[i_20_];
			if ((Class197.aByteArray2424[i_21_] & 0x1) == 0) {
				if (i_10_ > 0) {
					i_10_--;
					Class197.aByteArray2424[i_21_] |= 0x2;
				} else {
					int i_22_ = buffer.readBits(1, (byte) 28);
					if (i_22_ == 0) {
						i_10_ = Class399.decodeSkip(buffer, -1089696060);
						Class197.aByteArray2424[i_21_] |= 0x2;
					} else if (Class346.method6155(buffer, i_21_, (short) 371))
						Class197.aByteArray2424[i_21_] |= 0x2;
				}
			}
		}
		buffer.finishBitAccess((byte) 126);
		if (i_10_ != 0)
			throw new RuntimeException();
		Class197.NUM_PLAYER_INDICES = 0;
		Class197.anInt2431 = 0;
		for (int i_23_ = 1; i_23_ < 2048; i_23_++) {
			Class197.aByteArray2424[i_23_] >>= 1;
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_23_];
			if (class521_sub1_sub1_sub2_sub1 != null)
				Class197.PLAYER_INDICES[(Class197.NUM_PLAYER_INDICES += 1595438921) * -963499271 - 1] = i_23_;
			else
				Class197.anIntArray2426[(Class197.anInt2431 += -773593709) * 1265369243 - 1] = i_23_;
		}
	}

	static final void method6680(CS2Executor class527, int i) {
		if (client.aString7426 != null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1772444859 * Class459.anInt5534;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void method6681(int i, String string, byte i_24_) {
		Class191.method3167(i, 0, "", "", "", string, 146573843);
	}

	static final void renderMiniMiniMap(GraphicalRenderer class505, int i, int i_25_, int i_26_, int i_27_, short i_28_) {
		class505.r(i, i_25_, i_26_ + i, i_25_ + i_27_);
		class505.method8425(i, i_25_, i_26_, i_27_, -16777216, (byte) -58);
		if (-8084891 * Class291_Sub1.anInt8015 >= 100) {
			float f = ((float) Class291_Sub1.yLength / (float) Class291_Sub1.xLength);
			int i_29_ = i_26_;
			int i_30_ = i_27_;
			if (f < 1.0F)
				i_30_ = (int) (f * (float) i_26_);
			else
				i_29_ = (int) ((float) i_27_ / f);
			i += (i_26_ - i_29_) / 2;
			i_25_ += (i_27_ - i_30_) / 2;
			if (null == Defaults7Loader.aClass160_5883 || Defaults7Loader.aClass160_5883.method2747() != i_26_ || Defaults7Loader.aClass160_5883.method2793() != i_27_) {
				Class291_Sub1.method5139(Class291_Sub1.anInt3472, (Class291_Sub1.anInt3473 + Class291_Sub1.yLength), (Class291_Sub1.xLength + Class291_Sub1.anInt3472), Class291_Sub1.anInt3473, i, i_25_, i_29_ + i, i_25_ + i_30_);
				Class291_Sub1.renderMap(class505);
				Defaults7Loader.aClass160_5883 = class505.method8668(i, i_25_, i_29_, i_30_, false);
			}
			Defaults7Loader.aClass160_5883.method2752(i, i_25_);
			int i_31_ = (i_29_ * (Class488.anInt5760 * 1448596553) / Class291_Sub1.xLength);
			int i_32_ = (i_30_ * (Class351.anInt4097 * -1845665331) / Class291_Sub1.yLength);
			int i_33_ = i + (i_29_ * (MapRegionLoaderTask.anInt3991 * -517876187) / Class291_Sub1.xLength);
			int i_34_ = i_30_ + i_25_ - (i_30_ * (Class489.anInt5765 * -1586888337) / Class291_Sub1.yLength) - i_32_;
			int i_35_ = -1996554240;
			if (Game.stellarDawn == client.CURRENT_GAME)
				i_35_ = -1996488705;
			class505.B(i_33_, i_34_, i_31_, i_32_, i_35_, 1);
			class505.method8430(i_33_, i_34_, i_31_, i_32_, i_35_, 0);
			if (Class361.anInt4185 * 750747217 > 0) {
				int i_36_;
				if (Class96_Sub9.anInt9282 * 896422831 > 50)
					i_36_ = 500 - Class96_Sub9.anInt9282 * 187146859;
				else
					i_36_ = 187146859 * Class96_Sub9.anInt9282;
				for (Class282_Sub36 class282_sub36 = ((Class282_Sub36) Class291_Sub1.aClass482_3459.head((byte) 9)); class282_sub36 != null; class282_sub36 = (Class282_Sub36) Class291_Sub1.aClass482_3459.next(-387502259)) {
					WorldMapAreaDefs class220 = (Class291_Sub1.aClass218_3456.getWorldMapDefs(class282_sub36.anInt7991 * -1798678621, 1043671083));
					if (Class282_Sub16.method12248(class220, -2066566460)) {
						if (-1798678621 * class282_sub36.anInt7991 == 2089227969 * Class291_Sub1.anInt8018) {
							int i_37_ = ((i_29_ * (-1306535747 * class282_sub36.anInt7987) / Class291_Sub1.xLength) + i);
							int i_38_ = i_25_ + (i_30_ * (Class291_Sub1.yLength - (1012301095 * class282_sub36.anInt7993)) / Class291_Sub1.yLength);
							class505.method8425(i_37_ - 2, i_38_ - 2, 4, 4, i_36_ << 24 | 0xffff00, (byte) -94);
						} else if (-1 != Class291_Sub1.anInt8026 * 614736923 && (Class291_Sub1.anInt8026 * 614736923 == 781329827 * class220.anInt2718)) {
							int i_39_ = ((i_29_ * (-1306535747 * class282_sub36.anInt7987) / Class291_Sub1.xLength) + i);
							int i_40_ = (i_25_ + ((Class291_Sub1.yLength - class282_sub36.anInt7993 * 1012301095) * i_30_ / Class291_Sub1.yLength));
							class505.method8425(i_39_ - 2, i_40_ - 2, 4, 4, i_36_ << 24 | 0xffff00, (byte) -94);
						}
					}
				}
			}
		}
	}

	static final void method6683(int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		int i_48_ = i_46_ - 334;
		if (i_48_ < 0)
			i_48_ = 0;
		else if (i_48_ > 100)
			i_48_ = 100;
		int i_49_ = ((client.aShort7324 - client.aShort7394) * i_48_ / 100 + client.aShort7394);
		i_45_ = i_49_ * i_45_ >> 8;
		int i_50_ = 16384 - i_43_ & 0x3fff;
		int i_51_ = 16384 - i_44_ & 0x3fff;
		int i_52_ = 0;
		int i_53_ = 0;
		int i_54_ = i_45_;
		if (0 != i_50_) {
			i_53_ = -i_54_ * Class382.anIntArray4657[i_50_] >> 14;
			i_54_ = Class382.anIntArray4661[i_50_] * i_54_ >> 14;
		}
		if (0 != i_51_) {
			i_52_ = i_54_ * Class382.anIntArray4657[i_51_] >> 14;
			i_54_ = Class382.anIntArray4661[i_51_] * i_54_ >> 14;
		}
		Class31.anInt361 = (i - i_52_) * -2043310439;
		Class109_Sub1.anInt9384 = -126779709 * (i_41_ - i_53_);
		Class246.anInt3029 = 1442943697 * (i_42_ - i_54_);
		Class293.anInt3512 = -647467135 * i_43_;
		AnimationDefinitions.anInt5930 = i_44_ * 1898253385;
		Class121.anInt1525 = 0;
	}

	public static boolean method6684(int i, byte i_55_) {
		if (i != Class86.anInt831 * -436703373 || null == Class282_Sub42.aClass85_8039) {
			Class79.method1390(769951591);
			Class282_Sub42.aClass85_8039 = Class85.aClass85_815;
			Class86.anInt831 = i * 1539001787;
		}
		if (Class282_Sub42.aClass85_8039 == Class85.aClass85_815) {
			byte[] is = IndexLoaders.CUTSCENE_INDEX.getFile(i, -130725112);
			if (null == is)
				return false;
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			Class176.method2976(class282_sub35, -1081790752);
			int i_56_ = class282_sub35.readUnsignedByte();
			for (int i_57_ = 0; i_57_ < i_56_; i_57_++)
				Class86.aClass482_827.append(new Class282_Sub2(class282_sub35), -1970601217);
			int i_58_ = class282_sub35.readUnsignedSmart(2048992685);
			Class86.aClass77Array818 = new Class77[i_58_];
			for (int i_59_ = 0; i_59_ < i_58_; i_59_++)
				Class86.aClass77Array818[i_59_] = new Class77(class282_sub35);
			int i_60_ = class282_sub35.readUnsignedSmart(1675978634);
			Class82.aClass75Array804 = new Class75[i_60_];
			for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
				Class82.aClass75Array804[i_61_] = new Class75(class282_sub35, i_61_);
			int i_62_ = class282_sub35.readUnsignedSmart(1640275890);
			Class86.aClass92Array820 = new Class92[i_62_];
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
				Class86.aClass92Array820[i_63_] = new Class92(class282_sub35);
			int i_64_ = class282_sub35.readUnsignedSmart(1483471350);
			Class86.aClass93Array821 = new Class93[i_64_];
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++)
				Class86.aClass93Array821[i_65_] = new Class93(class282_sub35);
			int i_66_ = class282_sub35.readUnsignedSmart(2014961540);
			Class86.aClass96Array822 = new Class96[i_66_];
			for (int i_67_ = 0; i_67_ < i_66_; i_67_++)
				Class86.aClass96Array822[i_67_] = Class16.method562(class282_sub35, 1972468902);
			Class282_Sub42.aClass85_8039 = Class85.aClass85_816;
		}
		if (Class85.aClass85_816 == Class282_Sub42.aClass85_8039) {
			boolean bool = true;
			Class75[] class75s = Class82.aClass75Array804;
			for (int i_68_ = 0; i_68_ < class75s.length; i_68_++) {
				Class75 class75 = class75s[i_68_];
				if (!class75.method1339((short) -5159))
					bool = false;
			}
			Class96[] class96s = Class86.aClass96Array822;
			for (int i_69_ = 0; i_69_ < class96s.length; i_69_++) {
				Class96 class96 = class96s[i_69_];
				if (!class96.method1599(-161742461))
					bool = false;
			}
			Class92[] class92s = Class86.aClass92Array820;
			for (int i_70_ = 0; i_70_ < class92s.length; i_70_++) {
				Class92 class92 = class92s[i_70_];
				if (!class92.method1557(-1863501604))
					bool = false;
			}
			if (!bool)
				return false;
			Class282_Sub42.aClass85_8039 = Class85.aClass85_814;
		}
		return true;
	}

	static final void method6685(CS2Executor class527, int i) {
		int i_71_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_71_, (byte) 18);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_71_ >> 16];
		Class13.method502(class118, class98, class527, 577432492);
	}

	static void method6686(GraphicalRenderer class505, byte[][][] is, int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		if (i_78_ != 0 && i != 0) {
			if (9 == i_78_) {
				i_78_ = 1;
				i_79_ = i_79_ + 1 & 0x3;
			}
			if (10 == i_78_) {
				i_78_ = 1;
				i_79_ = 3 + i_79_ & 0x3;
			}
			if (i_78_ == 11) {
				i_78_ = 8;
				i_79_ = 3 + i_79_ & 0x3;
			}
			class505.N(i_72_, i_73_, i_76_, i_77_, i_74_, i_75_, is[i_78_ - 1][i_79_], i, i_80_);
		}
	}
}
