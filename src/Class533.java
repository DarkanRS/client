/* Class533 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class533 {
	static JS5CacheFile aClass203_7073;

	static void method11381(long[] ls, int[] is, int i, int i_0_) {
		if (i < i_0_) {
			int i_1_ = (i_0_ + i) / 2;
			int i_2_ = i;
			long l = ls[i_1_];
			ls[i_1_] = ls[i_0_];
			ls[i_0_] = l;
			int i_3_ = is[i_1_];
			is[i_1_] = is[i_0_];
			is[i_0_] = i_3_;
			int i_4_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
				if (ls[i_5_] < (long) (i_5_ & i_4_) + l) {
					long l_6_ = ls[i_5_];
					ls[i_5_] = ls[i_2_];
					ls[i_2_] = l_6_;
					int i_7_ = is[i_5_];
					is[i_5_] = is[i_2_];
					is[i_2_++] = i_7_;
				}
			}
			ls[i_0_] = ls[i_2_];
			ls[i_2_] = l;
			is[i_0_] = is[i_2_];
			is[i_2_] = i_3_;
			Class497.method8316(ls, is, i, i_2_ - 1, -1763921861);
			Class497.method8316(ls, is, 1 + i_2_, i_0_, -1763921861);
		}
	}

	Class533() throws Throwable {
		throw new Error();
	}

	public static void method11382(String[] strings, int[] is) {
		Class101.method1773(strings, is, 0, strings.length - 1, 698486595);
	}

	static void method11383(String[] strings, short[] is, int i, int i_8_) {
		if (i < i_8_) {
			int i_9_ = (i + i_8_) / 2;
			int i_10_ = i;
			String string = strings[i_9_];
			strings[i_9_] = strings[i_8_];
			strings[i_8_] = string;
			short i_11_ = is[i_9_];
			is[i_9_] = is[i_8_];
			is[i_8_] = i_11_;
			for (int i_12_ = i; i_12_ < i_8_; i_12_++) {
				if (string == null || (null != strings[i_12_] && strings[i_12_].compareTo(string) < (i_12_ & 0x1))) {
					String string_13_ = strings[i_12_];
					strings[i_12_] = strings[i_10_];
					strings[i_10_] = string_13_;
					short i_14_ = is[i_12_];
					is[i_12_] = is[i_10_];
					is[i_10_++] = i_14_;
				}
			}
			strings[i_8_] = strings[i_10_];
			strings[i_10_] = string;
			is[i_8_] = is[i_10_];
			is[i_10_] = i_11_;
			Class88.method1495(strings, is, i, i_10_ - 1, 465054740);
			Class88.method1495(strings, is, 1 + i_10_, i_8_, 326946884);
		}
	}

	public static void method11384(String[] strings, int[] is) {
		Class101.method1773(strings, is, 0, strings.length - 1, 698486595);
	}

	public static void method11385(String[] strings, short[] is) {
		Class88.method1495(strings, is, 0, strings.length - 1, -379448274);
	}

	public static void method11386(String[] strings, int[] is) {
		Class101.method1773(strings, is, 0, strings.length - 1, 698486595);
	}

	static void method11387(String[] strings, short[] is, int i, int i_15_) {
		if (i < i_15_) {
			int i_16_ = (i + i_15_) / 2;
			int i_17_ = i;
			String string = strings[i_16_];
			strings[i_16_] = strings[i_15_];
			strings[i_15_] = string;
			short i_18_ = is[i_16_];
			is[i_16_] = is[i_15_];
			is[i_15_] = i_18_;
			for (int i_19_ = i; i_19_ < i_15_; i_19_++) {
				if (string == null || (null != strings[i_19_] && strings[i_19_].compareTo(string) < (i_19_ & 0x1))) {
					String string_20_ = strings[i_19_];
					strings[i_19_] = strings[i_17_];
					strings[i_17_] = string_20_;
					short i_21_ = is[i_19_];
					is[i_19_] = is[i_17_];
					is[i_17_++] = i_21_;
				}
			}
			strings[i_15_] = strings[i_17_];
			strings[i_17_] = string;
			is[i_15_] = is[i_17_];
			is[i_17_] = i_18_;
			Class88.method1495(strings, is, i, i_17_ - 1, 50126304);
			Class88.method1495(strings, is, 1 + i_17_, i_15_, -811363095);
		}
	}

	static void method11388(String[] strings, int[] is, int i, int i_22_) {
		if (i < i_22_) {
			int i_23_ = (i + i_22_) / 2;
			int i_24_ = i;
			String string = strings[i_23_];
			strings[i_23_] = strings[i_22_];
			strings[i_22_] = string;
			int i_25_ = is[i_23_];
			is[i_23_] = is[i_22_];
			is[i_22_] = i_25_;
			for (int i_26_ = i; i_26_ < i_22_; i_26_++) {
				if (string == null || (null != strings[i_26_] && strings[i_26_].compareTo(string) < (i_26_ & 0x1))) {
					String string_27_ = strings[i_26_];
					strings[i_26_] = strings[i_24_];
					strings[i_24_] = string_27_;
					int i_28_ = is[i_26_];
					is[i_26_] = is[i_24_];
					is[i_24_++] = i_28_;
				}
			}
			strings[i_22_] = strings[i_24_];
			strings[i_24_] = string;
			is[i_22_] = is[i_24_];
			is[i_24_] = i_25_;
			Class101.method1773(strings, is, i, i_24_ - 1, 698486595);
			Class101.method1773(strings, is, i_24_ + 1, i_22_, 698486595);
		}
	}

	static void method11389(String[] strings, int[] is, int i, int i_29_) {
		if (i < i_29_) {
			int i_30_ = (i + i_29_) / 2;
			int i_31_ = i;
			String string = strings[i_30_];
			strings[i_30_] = strings[i_29_];
			strings[i_29_] = string;
			int i_32_ = is[i_30_];
			is[i_30_] = is[i_29_];
			is[i_29_] = i_32_;
			for (int i_33_ = i; i_33_ < i_29_; i_33_++) {
				if (string == null || (null != strings[i_33_] && strings[i_33_].compareTo(string) < (i_33_ & 0x1))) {
					String string_34_ = strings[i_33_];
					strings[i_33_] = strings[i_31_];
					strings[i_31_] = string_34_;
					int i_35_ = is[i_33_];
					is[i_33_] = is[i_31_];
					is[i_31_++] = i_35_;
				}
			}
			strings[i_29_] = strings[i_31_];
			strings[i_31_] = string;
			is[i_29_] = is[i_31_];
			is[i_31_] = i_32_;
			Class101.method1773(strings, is, i, i_31_ - 1, 698486595);
			Class101.method1773(strings, is, i_31_ + 1, i_29_, 698486595);
		}
	}

	public static void method11390(long[] ls, Object[] objects) {
		Class114.method1890(ls, objects, 0, ls.length - 1, (short) 255);
	}

	static void method11391(String[] strings, int[] is, int i, int i_36_) {
		if (i < i_36_) {
			int i_37_ = (i + i_36_) / 2;
			int i_38_ = i;
			String string = strings[i_37_];
			strings[i_37_] = strings[i_36_];
			strings[i_36_] = string;
			int i_39_ = is[i_37_];
			is[i_37_] = is[i_36_];
			is[i_36_] = i_39_;
			for (int i_40_ = i; i_40_ < i_36_; i_40_++) {
				if (string == null || (null != strings[i_40_] && strings[i_40_].compareTo(string) < (i_40_ & 0x1))) {
					String string_41_ = strings[i_40_];
					strings[i_40_] = strings[i_38_];
					strings[i_38_] = string_41_;
					int i_42_ = is[i_40_];
					is[i_40_] = is[i_38_];
					is[i_38_++] = i_42_;
				}
			}
			strings[i_36_] = strings[i_38_];
			strings[i_38_] = string;
			is[i_36_] = is[i_38_];
			is[i_38_] = i_39_;
			Class101.method1773(strings, is, i, i_38_ - 1, 698486595);
			Class101.method1773(strings, is, i_38_ + 1, i_36_, 698486595);
		}
	}

	public static void method11392(long[] ls, int[] is) {
		Class497.method8316(ls, is, 0, ls.length - 1, -1763921861);
	}

	static void method11393(long[] ls, int[] is, int i, int i_43_) {
		if (i < i_43_) {
			int i_44_ = (i_43_ + i) / 2;
			int i_45_ = i;
			long l = ls[i_44_];
			ls[i_44_] = ls[i_43_];
			ls[i_43_] = l;
			int i_46_ = is[i_44_];
			is[i_44_] = is[i_43_];
			is[i_43_] = i_46_;
			int i_47_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_48_ = i; i_48_ < i_43_; i_48_++) {
				if (ls[i_48_] < (long) (i_48_ & i_47_) + l) {
					long l_49_ = ls[i_48_];
					ls[i_48_] = ls[i_45_];
					ls[i_45_] = l_49_;
					int i_50_ = is[i_48_];
					is[i_48_] = is[i_45_];
					is[i_45_++] = i_50_;
				}
			}
			ls[i_43_] = ls[i_45_];
			ls[i_45_] = l;
			is[i_43_] = is[i_45_];
			is[i_45_] = i_46_;
			Class497.method8316(ls, is, i, i_45_ - 1, -1763921861);
			Class497.method8316(ls, is, 1 + i_45_, i_43_, -1763921861);
		}
	}

	static void method11394(String[] strings, int[] is, int i, int i_51_) {
		if (i < i_51_) {
			int i_52_ = (i + i_51_) / 2;
			int i_53_ = i;
			String string = strings[i_52_];
			strings[i_52_] = strings[i_51_];
			strings[i_51_] = string;
			int i_54_ = is[i_52_];
			is[i_52_] = is[i_51_];
			is[i_51_] = i_54_;
			for (int i_55_ = i; i_55_ < i_51_; i_55_++) {
				if (string == null || (null != strings[i_55_] && strings[i_55_].compareTo(string) < (i_55_ & 0x1))) {
					String string_56_ = strings[i_55_];
					strings[i_55_] = strings[i_53_];
					strings[i_53_] = string_56_;
					int i_57_ = is[i_55_];
					is[i_55_] = is[i_53_];
					is[i_53_++] = i_57_;
				}
			}
			strings[i_51_] = strings[i_53_];
			strings[i_53_] = string;
			is[i_51_] = is[i_53_];
			is[i_53_] = i_54_;
			Class101.method1773(strings, is, i, i_53_ - 1, 698486595);
			Class101.method1773(strings, is, i_53_ + 1, i_51_, 698486595);
		}
	}

	static void method11395(long[] ls, int[] is, int i, int i_58_) {
		if (i < i_58_) {
			int i_59_ = (i_58_ + i) / 2;
			int i_60_ = i;
			long l = ls[i_59_];
			ls[i_59_] = ls[i_58_];
			ls[i_58_] = l;
			int i_61_ = is[i_59_];
			is[i_59_] = is[i_58_];
			is[i_58_] = i_61_;
			int i_62_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_63_ = i; i_63_ < i_58_; i_63_++) {
				if (ls[i_63_] < (long) (i_63_ & i_62_) + l) {
					long l_64_ = ls[i_63_];
					ls[i_63_] = ls[i_60_];
					ls[i_60_] = l_64_;
					int i_65_ = is[i_63_];
					is[i_63_] = is[i_60_];
					is[i_60_++] = i_65_;
				}
			}
			ls[i_58_] = ls[i_60_];
			ls[i_60_] = l;
			is[i_58_] = is[i_60_];
			is[i_60_] = i_61_;
			Class497.method8316(ls, is, i, i_60_ - 1, -1763921861);
			Class497.method8316(ls, is, 1 + i_60_, i_58_, -1763921861);
		}
	}

	public static void method11396(int[] is, Object[] objects, int i, int i_66_) {
		if (i < i_66_) {
			int i_67_ = (i + i_66_) / 2;
			int i_68_ = i;
			int i_69_ = is[i_67_];
			is[i_67_] = is[i_66_];
			is[i_66_] = i_69_;
			Object object = objects[i_67_];
			objects[i_67_] = objects[i_66_];
			objects[i_66_] = object;
			int i_70_ = i_69_ == 2147483647 ? 0 : 1;
			for (int i_71_ = i; i_71_ < i_66_; i_71_++) {
				if (is[i_71_] < (i_71_ & i_70_) + i_69_) {
					int i_72_ = is[i_71_];
					is[i_71_] = is[i_68_];
					is[i_68_] = i_72_;
					Object object_73_ = objects[i_71_];
					objects[i_71_] = objects[i_68_];
					objects[i_68_++] = object_73_;
				}
			}
			is[i_66_] = is[i_68_];
			is[i_68_] = i_69_;
			objects[i_66_] = objects[i_68_];
			objects[i_68_] = object;
			Class51.method1074(is, objects, i, i_68_ - 1, 712488543);
			Class51.method1074(is, objects, 1 + i_68_, i_66_, -1296289189);
		}
	}

	public static void method11397(int[] is, Object[] objects, int i, int i_74_) {
		if (i < i_74_) {
			int i_75_ = (i + i_74_) / 2;
			int i_76_ = i;
			int i_77_ = is[i_75_];
			is[i_75_] = is[i_74_];
			is[i_74_] = i_77_;
			Object object = objects[i_75_];
			objects[i_75_] = objects[i_74_];
			objects[i_74_] = object;
			int i_78_ = i_77_ == 2147483647 ? 0 : 1;
			for (int i_79_ = i; i_79_ < i_74_; i_79_++) {
				if (is[i_79_] < (i_79_ & i_78_) + i_77_) {
					int i_80_ = is[i_79_];
					is[i_79_] = is[i_76_];
					is[i_76_] = i_80_;
					Object object_81_ = objects[i_79_];
					objects[i_79_] = objects[i_76_];
					objects[i_76_++] = object_81_;
				}
			}
			is[i_74_] = is[i_76_];
			is[i_76_] = i_77_;
			objects[i_74_] = objects[i_76_];
			objects[i_76_] = object;
			Class51.method1074(is, objects, i, i_76_ - 1, 1999543834);
			Class51.method1074(is, objects, 1 + i_76_, i_74_, -391646346);
		}
	}

	public static void method11398(long[] ls, Object[] objects) {
		Class114.method1890(ls, objects, 0, ls.length - 1, (short) 255);
	}

	public static void method11399(int[] is, int[] is_82_, int i, int i_83_) {
		if (i < i_83_) {
			int i_84_ = (i + i_83_) / 2;
			int i_85_ = i;
			int i_86_ = is[i_84_];
			is[i_84_] = is[i_83_];
			is[i_83_] = i_86_;
			int i_87_ = is_82_[i_84_];
			is_82_[i_84_] = is_82_[i_83_];
			is_82_[i_83_] = i_87_;
			int i_88_ = i_86_ == 2147483647 ? 0 : 1;
			for (int i_89_ = i; i_89_ < i_83_; i_89_++) {
				if (is[i_89_] < i_86_ + (i_89_ & i_88_)) {
					int i_90_ = is[i_89_];
					is[i_89_] = is[i_85_];
					is[i_85_] = i_90_;
					int i_91_ = is_82_[i_89_];
					is_82_[i_89_] = is_82_[i_85_];
					is_82_[i_85_++] = i_91_;
				}
			}
			is[i_83_] = is[i_85_];
			is[i_85_] = i_86_;
			is_82_[i_83_] = is_82_[i_85_];
			is_82_[i_85_] = i_87_;
			Class225_Sub5.method13047(is, is_82_, i, i_85_ - 1, (byte) 19);
			Class225_Sub5.method13047(is, is_82_, 1 + i_85_, i_83_, (byte) 21);
		}
	}

	public static void method11400(long[] ls, Object[] objects) {
		Class114.method1890(ls, objects, 0, ls.length - 1, (short) 255);
	}

	public static void method11401(int[] is, Object[] objects, int i, int i_92_) {
		if (i < i_92_) {
			int i_93_ = (i + i_92_) / 2;
			int i_94_ = i;
			int i_95_ = is[i_93_];
			is[i_93_] = is[i_92_];
			is[i_92_] = i_95_;
			Object object = objects[i_93_];
			objects[i_93_] = objects[i_92_];
			objects[i_92_] = object;
			int i_96_ = i_95_ == 2147483647 ? 0 : 1;
			for (int i_97_ = i; i_97_ < i_92_; i_97_++) {
				if (is[i_97_] < (i_97_ & i_96_) + i_95_) {
					int i_98_ = is[i_97_];
					is[i_97_] = is[i_94_];
					is[i_94_] = i_98_;
					Object object_99_ = objects[i_97_];
					objects[i_97_] = objects[i_94_];
					objects[i_94_++] = object_99_;
				}
			}
			is[i_92_] = is[i_94_];
			is[i_94_] = i_95_;
			objects[i_92_] = objects[i_94_];
			objects[i_94_] = object;
			Class51.method1074(is, objects, i, i_94_ - 1, -1561986551);
			Class51.method1074(is, objects, 1 + i_94_, i_92_, -810132675);
		}
	}

	static void method11402(long[] ls, Object[] objects, int i, int i_100_) {
		if (i < i_100_) {
			int i_101_ = (i + i_100_) / 2;
			int i_102_ = i;
			long l = ls[i_101_];
			ls[i_101_] = ls[i_100_];
			ls[i_100_] = l;
			Object object = objects[i_101_];
			objects[i_101_] = objects[i_100_];
			objects[i_100_] = object;
			int i_103_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_104_ = i; i_104_ < i_100_; i_104_++) {
				if (ls[i_104_] < (long) (i_104_ & i_103_) + l) {
					long l_105_ = ls[i_104_];
					ls[i_104_] = ls[i_102_];
					ls[i_102_] = l_105_;
					Object object_106_ = objects[i_104_];
					objects[i_104_] = objects[i_102_];
					objects[i_102_++] = object_106_;
				}
			}
			ls[i_100_] = ls[i_102_];
			ls[i_102_] = l;
			objects[i_100_] = objects[i_102_];
			objects[i_102_] = object;
			Class114.method1890(ls, objects, i, i_102_ - 1, (short) 255);
			Class114.method1890(ls, objects, i_102_ + 1, i_100_, (short) 255);
		}
	}

	static final void method11403(CS2Executor class527, short i) {
		int i_107_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_107_, (byte) 25);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_107_ >> 16];
		Class237.method3987(class118, class98, class527, -599656695);
	}

	static void method11404(String string, String string_108_, String string_109_, boolean bool, boolean bool_110_, int i) {
		Class184 class184 = Class468_Sub20.method12807(-1561736689);
		if (class184.method3053((byte) -70) != null) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4543, class184.isaac, 666430203);
			class282_sub23.buffer.writeShort((ChatLine.getLength(string) + ChatLine.getLength(string_108_) + ChatLine.getLength(string_109_) + 1), 1417031095);
			class282_sub23.buffer.writeString(string);
			class282_sub23.buffer.writeString(string_108_);
			class282_sub23.buffer.writeString(string_109_);
			int i_111_ = 0;
			if (bool)
				i_111_ |= 0x1;
			if (bool_110_)
				i_111_ |= 0x2;
			class282_sub23.buffer.writeByte(i_111_);
			class184.method3049(class282_sub23, 1665621152);
		}
	}

	static final void method11405(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		client.anInt7340 = 96844955 * (class527.intStack[class527.intStackPtr * 1942118537]);
		client.anInt7342 = ((class527.intStack[1 + 1942118537 * class527.intStackPtr]) * 1244871605);
	}

	static final void method11406(CS2Executor class527, int i) {
		int i_112_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_112_, 1937289773).stackable * 318481945) == 1 ? 1 : 0;
	}
}
