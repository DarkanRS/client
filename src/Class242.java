public class Class242 {

	static Class91 aClass91_2981;

	public static int anInt2982;

	Index aClass317_2979;

	int size;

	QuestDefinitions[] questDefinitions;

	int method4154(Interface42 interface42_1, int i_2) {
		int i_3 = 0;
		for (int i_4 = 0; i_4 < this.size; i_4++) {
			QuestDefinitions questdefinitions_5 = this.method4156(i_4, -1396181317);
			if (questdefinitions_5.method4099(interface42_1, 490029588)) {
				i_3 += questdefinitions_5.anInt2963;
			}
		}
		return i_3;
	}

	public Class242(Game game_1, Language xlanguage_2, Index index_3, boolean bool_4) {
		this.aClass317_2979 = index_3;
		if (this.aClass317_2979 != null) {
			this.size = this.aClass317_2979.filesCount(SharedConfigsType.aClass120_1498.id);
		} else {
			this.size = 0;
		}
		this.questDefinitions = new QuestDefinitions[this.size];
		for (int i_5 = 0; i_5 < this.size; i_5++) {
			Index index_7 = this.aClass317_2979;
			byte[] bytes_6;
			synchronized (this.aClass317_2979) {
				bytes_6 = this.aClass317_2979.getFile(SharedConfigsType.aClass120_1498.id, i_5);
			}
			QuestDefinitions questdefinitions_9 = new QuestDefinitions();
			if (bytes_6 != null) {
				questdefinitions_9.method4119(new RsByteBuffer(bytes_6), -1345439646);
			}
			questdefinitions_9.method4095((byte) 43);
			this.questDefinitions[i_5] = questdefinitions_9;
			this.questDefinitions[i_5].aClass242_2976 = this;
		}
	}

	public QuestDefinitions method4156(int i_1, int i_2) {
		return this.questDefinitions[i_1];
	}

	static final void method4159(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1340 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1350 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1281 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.anInt1354 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		Class109.method1858(icomponentdefinitions_0, (byte) -26);
	}

	static final void method4160(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, short s_3) {
		icomponentdefinitions_0.anInt1323 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.method1858(icomponentdefinitions_0, (byte) -6);
	}

	public static final int method4162(int i_0, int i_1, byte b_2) {
		if (i_0 == -2) {
			return 12345678;
		} else if (i_0 == -1) {
			if (i_1 < 2) {
				i_1 = 2;
			} else if (i_1 > 126) {
				i_1 = 126;
			}
			return i_1;
		} else {
			i_1 = (i_0 & 0x7f) * i_1 >> 7;
			if (i_1 < 2) {
				i_1 = 2;
			} else if (i_1 > 126) {
				i_1 = 126;
			}
			return (i_0 & 0xff80) + i_1;
		}
	}

	public static byte getByteForChar(char var_0) {
		byte b_1;
		if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
			if (var_0 == 8364) {
				b_1 = -128;
			} else if (var_0 == 8218) {
				b_1 = -126;
			} else if (var_0 == 402) {
				b_1 = -125;
			} else if (var_0 == 8222) {
				b_1 = -124;
			} else if (var_0 == 8230) {
				b_1 = -123;
			} else if (var_0 == 8224) {
				b_1 = -122;
			} else if (var_0 == 8225) {
				b_1 = -121;
			} else if (var_0 == 710) {
				b_1 = -120;
			} else if (var_0 == 8240) {
				b_1 = -119;
			} else if (var_0 == 352) {
				b_1 = -118;
			} else if (var_0 == 8249) {
				b_1 = -117;
			} else if (var_0 == 338) {
				b_1 = -116;
			} else if (var_0 == 381) {
				b_1 = -114;
			} else if (var_0 == 8216) {
				b_1 = -111;
			} else if (var_0 == 8217) {
				b_1 = -110;
			} else if (var_0 == 8220) {
				b_1 = -109;
			} else if (var_0 == 8221) {
				b_1 = -108;
			} else if (var_0 == 8226) {
				b_1 = -107;
			} else if (var_0 == 8211) {
				b_1 = -106;
			} else if (var_0 == 8212) {
				b_1 = -105;
			} else if (var_0 == 732) {
				b_1 = -104;
			} else if (var_0 == 8482) {
				b_1 = -103;
			} else if (var_0 == 353) {
				b_1 = -102;
			} else if (var_0 == 8250) {
				b_1 = -101;
			} else if (var_0 == 339) {
				b_1 = -100;
			} else if (var_0 == 382) {
				b_1 = -98;
			} else if (var_0 == 376) {
				b_1 = -97;
			} else {
				b_1 = 63;
			}
		} else {
			b_1 = (byte) var_0;
		}
		return b_1;
	}

	static void method4164(int i_0, int i_1, int i_2) {
		if (Class20.anInt167 == 1) {
			Class96_Sub4.method13789(Class46.aClass282_Sub50_Sub7_438, i_0, i_1, -549787245);
		} else if (Class20.anInt167 == 2) {
			NativeLibraryLoader.method4653(i_0, i_1, -769540795);
		}
		Class20.anInt167 = 0;
		Class46.aClass282_Sub50_Sub7_438 = null;
	}

	static Class149_Sub3 method4165(RsByteBuffer rsbytebuffer_0, int i_1) {
		return new Class149_Sub3(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}

	public static final void method4166(int i_0) {
		if (!client.aBool7331) {
			client.aFloat7284 += (12.0F - client.aFloat7284) / 2.0F;
			client.aBool7371 = true;
			client.aBool7331 = true;
		}
	}

	public static void method4167(String string_0, int i_1) {
		if (client.aBool7344 && (Class506.anInt5858 & 0x18) != 0) {
			boolean bool_2 = false;
			int i_3 = Class197.NUM_PLAYER_INDICES;
			int[] ints_4 = Class197.PLAYER_INDICES;
			for (int i_5 = 0; i_5 < i_3; i_5++) {
				Player player_6 = client.players[ints_4[i_5]];
				if (player_6.displayName != null && player_6.displayName.equalsIgnoreCase(string_0) && (player_6 == Class84.myPlayer && (Class506.anInt5858 & 0x10) != 0 || (Class506.anInt5858 & 0x8) != 0)) {
					TCPMessage tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4540, client.aClass184_7475.isaac, 623584347);
					tcpmessage_7.buffer.writeShort(client.anInt7345, 1417031095);
					tcpmessage_7.buffer.writeShortLE(ints_4[i_5], (short) -11612);
					tcpmessage_7.buffer.write128Byte(0, -2130241701);
					tcpmessage_7.buffer.writeIntV2(Class7.anInt56, (byte) 104);
					tcpmessage_7.buffer.writeShortLE(client.anInt7346, (short) -16837);
					client.aClass184_7475.method3049(tcpmessage_7, 2109181627);
					int i_8 = player_6.getSize(828768449);
					MapRegion.routeTo(player_6.regionBaseX[0], player_6.regionBaseY[0], true, Class344.method6115(player_6.regionBaseX[0], player_6.regionBaseY[0], i_8, i_8, 0, 971339209), 1352975566);
					bool_2 = true;
					break;
				}
			}
			if (!bool_2) {
				LoadingStage.method6681(4, Message.UNABLE_TO_FIND.translate(Class223.CURRENT_LANGUAGE, -1621273158) + string_0, (byte) -49);
			}
			if (client.aBool7344) {
				Class60.method1170(-609337146);
			}
		}
	}
}
