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

	static final void method1860(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (client.rights != 0 || (!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
			String string_3 = string_2.toLowerCase();
			byte b_4 = 0;
			if (string_3.startsWith(Message.aClass433_5310.translate(Language.aClass495_5795, -2011565304))) {
				b_4 = 0;
				string_2 = string_2.substring(Message.aClass433_5310.translate(Language.aClass495_5795, -1474574192).length());
			} else if (string_3.startsWith(Message.aClass433_5224.translate(Language.aClass495_5795, -1018725645))) {
				b_4 = 1;
				string_2 = string_2.substring(Message.aClass433_5224.translate(Language.aClass495_5795, -728158667).length());
			} else if (string_3.startsWith(Message.aClass433_5312.translate(Language.aClass495_5795, -421866122))) {
				b_4 = 2;
				string_2 = string_2.substring(Message.aClass433_5312.translate(Language.aClass495_5795, -1190421734).length());
			} else if (string_3.startsWith(Message.aClass433_5313.translate(Language.aClass495_5795, -1865274206))) {
				b_4 = 3;
				string_2 = string_2.substring(Message.aClass433_5313.translate(Language.aClass495_5795, -885173587).length());
			} else if (string_3.startsWith(Message.aClass433_5314.translate(Language.aClass495_5795, -915262147))) {
				b_4 = 4;
				string_2 = string_2.substring(Message.aClass433_5314.translate(Language.aClass495_5795, -588425222).length());
			} else if (string_3.startsWith(Message.aClass433_5221.translate(Language.aClass495_5795, -741938249))) {
				b_4 = 5;
				string_2 = string_2.substring(Message.aClass433_5221.translate(Language.aClass495_5795, -1332685832).length());
			} else if (string_3.startsWith(Message.aClass433_5194.translate(Language.aClass495_5795, -893060110))) {
				b_4 = 6;
				string_2 = string_2.substring(Message.aClass433_5194.translate(Language.aClass495_5795, -1212621971).length());
			} else if (string_3.startsWith(Message.aClass433_5317.translate(Language.aClass495_5795, -2087693192))) {
				b_4 = 7;
				string_2 = string_2.substring(Message.aClass433_5317.translate(Language.aClass495_5795, -1840274123).length());
			} else if (string_3.startsWith(Message.aClass433_5318.translate(Language.aClass495_5795, -1925786826))) {
				b_4 = 8;
				string_2 = string_2.substring(Message.aClass433_5318.translate(Language.aClass495_5795, -605242854).length());
			} else if (string_3.startsWith(Message.aClass433_5319.translate(Language.aClass495_5795, -685127730))) {
				b_4 = 9;
				string_2 = string_2.substring(Message.aClass433_5319.translate(Language.aClass495_5795, -1671757341).length());
			} else if (string_3.startsWith(Message.aClass433_5320.translate(Language.aClass495_5795, -2082715119))) {
				b_4 = 10;
				string_2 = string_2.substring(Message.aClass433_5320.translate(Language.aClass495_5795, -893838603).length());
			} else if (string_3.startsWith(Message.aClass433_5199.translate(Language.aClass495_5795, -1011038702))) {
				b_4 = 11;
				string_2 = string_2.substring(Message.aClass433_5199.translate(Language.aClass495_5795, -705460695).length());
			} else if (Class223.CURRENT_LANGUAGE != Language.aClass495_5795) {
				if (string_3.startsWith(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -1967698860))) {
					b_4 = 0;
					string_2 = string_2.substring(Message.aClass433_5310.translate(Class223.CURRENT_LANGUAGE, -931333964).length());
				} else if (string_3.startsWith(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -1211635984))) {
					b_4 = 1;
					string_2 = string_2.substring(Message.aClass433_5224.translate(Class223.CURRENT_LANGUAGE, -1312881079).length());
				} else if (string_3.startsWith(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -392031535))) {
					b_4 = 2;
					string_2 = string_2.substring(Message.aClass433_5312.translate(Class223.CURRENT_LANGUAGE, -243965545).length());
				} else if (string_3.startsWith(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -366331193))) {
					b_4 = 3;
					string_2 = string_2.substring(Message.aClass433_5313.translate(Class223.CURRENT_LANGUAGE, -564963965).length());
				} else if (string_3.startsWith(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -2131562051))) {
					b_4 = 4;
					string_2 = string_2.substring(Message.aClass433_5314.translate(Class223.CURRENT_LANGUAGE, -1233253928).length());
				} else if (string_3.startsWith(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -1423052187))) {
					b_4 = 5;
					string_2 = string_2.substring(Message.aClass433_5221.translate(Class223.CURRENT_LANGUAGE, -2041202369).length());
				} else if (string_3.startsWith(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -1085733103))) {
					b_4 = 6;
					string_2 = string_2.substring(Message.aClass433_5194.translate(Class223.CURRENT_LANGUAGE, -840616776).length());
				} else if (string_3.startsWith(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -1915496954))) {
					b_4 = 7;
					string_2 = string_2.substring(Message.aClass433_5317.translate(Class223.CURRENT_LANGUAGE, -1395321722).length());
				} else if (string_3.startsWith(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -257492430))) {
					b_4 = 8;
					string_2 = string_2.substring(Message.aClass433_5318.translate(Class223.CURRENT_LANGUAGE, -686511373).length());
				} else if (string_3.startsWith(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -1394465272))) {
					b_4 = 9;
					string_2 = string_2.substring(Message.aClass433_5319.translate(Class223.CURRENT_LANGUAGE, -1753131121).length());
				} else if (string_3.startsWith(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -654352038))) {
					b_4 = 10;
					string_2 = string_2.substring(Message.aClass433_5320.translate(Class223.CURRENT_LANGUAGE, -235801765).length());
				} else if (string_3.startsWith(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -2110850814))) {
					b_4 = 11;
					string_2 = string_2.substring(Message.aClass433_5199.translate(Class223.CURRENT_LANGUAGE, -1600723987).length());
				}
			}

			string_3 = string_2.toLowerCase();
			byte b_5 = 0;
			if (string_3.startsWith(Message.aClass433_5292.translate(Language.aClass495_5795, -305628261))) {
				b_5 = 1;
				string_2 = string_2.substring(Message.aClass433_5292.translate(Language.aClass495_5795, -834692667).length());
			} else if (string_3.startsWith(Message.aClass433_5323.translate(Language.aClass495_5795, -242214370))) {
				b_5 = 2;
				string_2 = string_2.substring(Message.aClass433_5323.translate(Language.aClass495_5795, -2038369408).length());
			} else if (string_3.startsWith(Message.aClass433_5324.translate(Language.aClass495_5795, -1649524008))) {
				b_5 = 3;
				string_2 = string_2.substring(Message.aClass433_5324.translate(Language.aClass495_5795, -1763068646).length());
			} else if (string_3.startsWith(Message.aClass433_5325.translate(Language.aClass495_5795, -870525017))) {
				b_5 = 4;
				string_2 = string_2.substring(Message.aClass433_5325.translate(Language.aClass495_5795, -2012994574).length());
			} else if (string_3.startsWith(Message.aClass433_5326.translate(Language.aClass495_5795, -663048228))) {
				b_5 = 5;
				string_2 = string_2.substring(Message.aClass433_5326.translate(Language.aClass495_5795, -242529694).length());
			} else if (Language.aClass495_5795 != Class223.CURRENT_LANGUAGE) {
				if (string_3.startsWith(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -1825511899))) {
					b_5 = 1;
					string_2 = string_2.substring(Message.aClass433_5292.translate(Class223.CURRENT_LANGUAGE, -600018624).length());
				} else if (string_3.startsWith(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -1604558277))) {
					b_5 = 2;
					string_2 = string_2.substring(Message.aClass433_5323.translate(Class223.CURRENT_LANGUAGE, -1592623584).length());
				} else if (string_3.startsWith(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -270607277))) {
					b_5 = 3;
					string_2 = string_2.substring(Message.aClass433_5324.translate(Class223.CURRENT_LANGUAGE, -1627000504).length());
				} else if (string_3.startsWith(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -370181299))) {
					b_5 = 4;
					string_2 = string_2.substring(Message.aClass433_5325.translate(Class223.CURRENT_LANGUAGE, -1502824305).length());
				} else if (string_3.startsWith(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -741710586))) {
					b_5 = 5;
					string_2 = string_2.substring(Message.aClass433_5326.translate(Class223.CURRENT_LANGUAGE, -1032612070).length());
				}
			}

			Class184 class184_6 = Class468_Sub20.method12807(-1317872697);
			TCPMessage tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4538, class184_6.isaac, 1631130061);
			tcpmessage_7.buffer.writeByte(0);
			int i_8 = tcpmessage_7.buffer.index;
			tcpmessage_7.buffer.writeByte(b_4);
			tcpmessage_7.buffer.writeByte(b_5);
			Class427.method7189(tcpmessage_7.buffer, string_2, 151728977);
			tcpmessage_7.buffer.method13061(tcpmessage_7.buffer.index - i_8, -918882679);
			class184_6.method3049(tcpmessage_7, 1177303743);
		}

	}

	static final void method1861(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		Class455.aShortArray5452[cs2executor_0.intStack[cs2executor_0.intStackPtr]] = (short) Class5.method294(cs2executor_0.intStack[cs2executor_0.intStackPtr + 1], (byte) -4);
		IndexLoaders.ITEM_INDEX_LOADER.method7152(-2142762956);
		IndexLoaders.ITEM_INDEX_LOADER.method7151((byte) -24);
		IndexLoaders.NPC_INDEX_LOADER.method6831(-1083280039);
		IncomingPacket.method6378(-1538407760);
	}

	static final void method1862(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub23_8202.method12899(-386531740) ? 1 : 0;
	}

}
