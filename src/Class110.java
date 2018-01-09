/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class110 {
	byte[] aByteArray1094;
	int anInt1095;
	int anInt1096;
	byte[] aByteArray1097;
	int anInt1098;
	int anInt1099;
	int anInt1100;
	int anInt1101;
	int anInt1102;
	static String aString1103;
	static int anInt1104;
	static int anInt1105;
	public static Index aClass317_1106;

	Class110() {
		/* empty */
	}

	static final void method1860(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -644057819 * client.rights || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			String string_0_ = string.toLowerCase();
			int i_1_ = 0;
			if (string_0_.startsWith(Message.aClass433_5310.translate(Language.aClass495_5795, -2011565304))) {
				i_1_ = 0;
				string = string.substring(Message.aClass433_5310.translate(Language.aClass495_5795, -1474574192).length());
			} else if (string_0_.startsWith(Message.aClass433_5224.translate(Language.aClass495_5795, -1018725645))) {
				i_1_ = 1;
				string = string.substring(Message.aClass433_5224.translate(Language.aClass495_5795, -728158667).length());
			} else if (string_0_.startsWith(Message.aClass433_5312.translate(Language.aClass495_5795, -421866122))) {
				i_1_ = 2;
				string = string.substring(Message.aClass433_5312.translate(Language.aClass495_5795, -1190421734).length());
			} else if (string_0_.startsWith(Message.aClass433_5313.translate(Language.aClass495_5795, -1865274206))) {
				i_1_ = 3;
				string = string.substring(Message.aClass433_5313.translate(Language.aClass495_5795, -885173587).length());
			} else if (string_0_.startsWith(Message.aClass433_5314.translate(Language.aClass495_5795, -915262147))) {
				i_1_ = 4;
				string = string.substring(Message.aClass433_5314.translate(Language.aClass495_5795, -588425222).length());
			} else if (string_0_.startsWith(Message.aClass433_5221.translate(Language.aClass495_5795, -741938249))) {
				i_1_ = 5;
				string = string.substring(Message.aClass433_5221.translate(Language.aClass495_5795, -1332685832).length());
			} else if (string_0_.startsWith(Message.aClass433_5194.translate(Language.aClass495_5795, -893060110))) {
				i_1_ = 6;
				string = string.substring(Message.aClass433_5194.translate(Language.aClass495_5795, -1212621971).length());
			} else if (string_0_.startsWith(Message.aClass433_5317.translate(Language.aClass495_5795, -2087693192))) {
				i_1_ = 7;
				string = string.substring(Message.aClass433_5317.translate(Language.aClass495_5795, -1840274123).length());
			} else if (string_0_.startsWith(Message.aClass433_5318.translate(Language.aClass495_5795, -1925786826))) {
				i_1_ = 8;
				string = string.substring(Message.aClass433_5318.translate(Language.aClass495_5795, -605242854).length());
			} else if (string_0_.startsWith(Message.aClass433_5319.translate(Language.aClass495_5795, -685127730))) {
				i_1_ = 9;
				string = string.substring(Message.aClass433_5319.translate(Language.aClass495_5795, -1671757341).length());
			} else if (string_0_.startsWith(Message.aClass433_5320.translate(Language.aClass495_5795, -2082715119))) {
				i_1_ = 10;
				string = string.substring(Message.aClass433_5320.translate(Language.aClass495_5795, -893838603).length());
			} else if (string_0_.startsWith(Message.aClass433_5199.translate(Language.aClass495_5795, -1011038702))) {
				i_1_ = 11;
				string = string.substring(Message.aClass433_5199.translate(Language.aClass495_5795, -705460695).length());
			} else if (Class223.aClass495_2772 != Language.aClass495_5795) {
				if (string_0_.startsWith(Message.aClass433_5310.translate(Class223.aClass495_2772, -1967698860))) {
					i_1_ = 0;
					string = string.substring(Message.aClass433_5310.translate(Class223.aClass495_2772, -931333964).length());
				} else if (string_0_.startsWith(Message.aClass433_5224.translate(Class223.aClass495_2772, -1211635984))) {
					i_1_ = 1;
					string = string.substring(Message.aClass433_5224.translate(Class223.aClass495_2772, -1312881079).length());
				} else if (string_0_.startsWith(Message.aClass433_5312.translate(Class223.aClass495_2772, -392031535))) {
					i_1_ = 2;
					string = string.substring(Message.aClass433_5312.translate(Class223.aClass495_2772, -243965545).length());
				} else if (string_0_.startsWith(Message.aClass433_5313.translate(Class223.aClass495_2772, -366331193))) {
					i_1_ = 3;
					string = string.substring(Message.aClass433_5313.translate(Class223.aClass495_2772, -564963965).length());
				} else if (string_0_.startsWith(Message.aClass433_5314.translate(Class223.aClass495_2772, -2131562051))) {
					i_1_ = 4;
					string = string.substring(Message.aClass433_5314.translate(Class223.aClass495_2772, -1233253928).length());
				} else if (string_0_.startsWith(Message.aClass433_5221.translate(Class223.aClass495_2772, -1423052187))) {
					i_1_ = 5;
					string = string.substring(Message.aClass433_5221.translate(Class223.aClass495_2772, -2041202369).length());
				} else if (string_0_.startsWith(Message.aClass433_5194.translate(Class223.aClass495_2772, -1085733103))) {
					i_1_ = 6;
					string = string.substring(Message.aClass433_5194.translate(Class223.aClass495_2772, -840616776).length());
				} else if (string_0_.startsWith(Message.aClass433_5317.translate(Class223.aClass495_2772, -1915496954))) {
					i_1_ = 7;
					string = string.substring(Message.aClass433_5317.translate(Class223.aClass495_2772, -1395321722).length());
				} else if (string_0_.startsWith(Message.aClass433_5318.translate(Class223.aClass495_2772, -257492430))) {
					i_1_ = 8;
					string = string.substring(Message.aClass433_5318.translate(Class223.aClass495_2772, -686511373).length());
				} else if (string_0_.startsWith(Message.aClass433_5319.translate(Class223.aClass495_2772, -1394465272))) {
					i_1_ = 9;
					string = string.substring(Message.aClass433_5319.translate(Class223.aClass495_2772, -1753131121).length());
				} else if (string_0_.startsWith(Message.aClass433_5320.translate(Class223.aClass495_2772, -654352038))) {
					i_1_ = 10;
					string = string.substring(Message.aClass433_5320.translate(Class223.aClass495_2772, -235801765).length());
				} else if (string_0_.startsWith(Message.aClass433_5199.translate(Class223.aClass495_2772, -2110850814))) {
					i_1_ = 11;
					string = string.substring(Message.aClass433_5199.translate(Class223.aClass495_2772, -1600723987).length());
				}
			}
			string_0_ = string.toLowerCase();
			int i_2_ = 0;
			if (string_0_.startsWith(Message.aClass433_5292.translate(Language.aClass495_5795, -305628261))) {
				i_2_ = 1;
				string = string.substring(Message.aClass433_5292.translate(Language.aClass495_5795, -834692667).length());
			} else if (string_0_.startsWith(Message.aClass433_5323.translate(Language.aClass495_5795, -242214370))) {
				i_2_ = 2;
				string = string.substring(Message.aClass433_5323.translate(Language.aClass495_5795, -2038369408).length());
			} else if (string_0_.startsWith(Message.aClass433_5324.translate(Language.aClass495_5795, -1649524008))) {
				i_2_ = 3;
				string = string.substring(Message.aClass433_5324.translate(Language.aClass495_5795, -1763068646).length());
			} else if (string_0_.startsWith(Message.aClass433_5325.translate(Language.aClass495_5795, -870525017))) {
				i_2_ = 4;
				string = string.substring(Message.aClass433_5325.translate(Language.aClass495_5795, -2012994574).length());
			} else if (string_0_.startsWith(Message.aClass433_5326.translate(Language.aClass495_5795, -663048228))) {
				i_2_ = 5;
				string = string.substring(Message.aClass433_5326.translate(Language.aClass495_5795, -242529694).length());
			} else if (Language.aClass495_5795 != Class223.aClass495_2772) {
				if (string_0_.startsWith(Message.aClass433_5292.translate(Class223.aClass495_2772, -1825511899))) {
					i_2_ = 1;
					string = string.substring(Message.aClass433_5292.translate(Class223.aClass495_2772, -600018624).length());
				} else if (string_0_.startsWith(Message.aClass433_5323.translate(Class223.aClass495_2772, -1604558277))) {
					i_2_ = 2;
					string = string.substring(Message.aClass433_5323.translate(Class223.aClass495_2772, -1592623584).length());
				} else if (string_0_.startsWith(Message.aClass433_5324.translate(Class223.aClass495_2772, -270607277))) {
					i_2_ = 3;
					string = string.substring(Message.aClass433_5324.translate(Class223.aClass495_2772, -1627000504).length());
				} else if (string_0_.startsWith(Message.aClass433_5325.translate(Class223.aClass495_2772, -370181299))) {
					i_2_ = 4;
					string = string.substring(Message.aClass433_5325.translate(Class223.aClass495_2772, -1502824305).length());
				} else if (string_0_.startsWith(Message.aClass433_5326.translate(Class223.aClass495_2772, -741710586))) {
					i_2_ = 5;
					string = string.substring(Message.aClass433_5326.translate(Class223.aClass495_2772, -1032612070).length());
				}
			}
			Class184 class184 = Class468_Sub20.method12807(-1317872697);
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4538, class184.aClass432_2283, 1631130061);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
			int i_3_ = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_1_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_2_);
			Class427.method7189(class282_sub23.aClass282_Sub35_Sub2_7682, string, 151728977);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i_3_, -918882679);
			class184.method3049(class282_sub23, 1177303743);
		}
	}

	static final void method1861(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		Class455.aShortArray5452[(((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 * 1942118537)])] = (short) Class5.method294((((CS2Executor) class527).intStack[(1 + 1942118537 * (((CS2Executor) class527).anInt7012))]), (byte) -4);
		Class119.aClass426_1463.method7152(-2142762956);
		Class119.aClass426_1463.method7151((byte) -24);
		Class350_Sub1.aClass406_7757.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method1862(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12899(-386531740) ? 1 : 0;
	}
}
