public class Class119 {

	static Class344 aClass344_1460;
	public static HostNameIdentifier HOSTNAME_IDENTIFIER;
	public static JS5StandardRequester JS5_STANDARD_REQUESTER;
	public int anInt1458;
	public int anInt1454;
	public int[] anIntArray1455;
	public int[] anIntArray1457;
	public Class455 aClass455_1456;
	int anInt1459;

	public boolean method2073(int i_1, int i_2, int i_3) {
		if (i_2 >= 0 && i_2 < this.anIntArray1457.length) {
			int i_4 = this.anIntArray1457[i_2];
			if (i_1 >= i_4 && i_1 <= i_4 + this.anIntArray1455[i_2]) {
				return true;
			}
		}

		return false;
	}

	Class119(int i_1, int i_2, int[] ints_3, int[] ints_4, Class455 class455_5, int i_6) {
		this.anInt1458 = i_1;
		this.anInt1454 = i_2;
		this.anIntArray1455 = ints_3;
		this.anIntArray1457 = ints_4;
		this.aClass455_1456 = class455_5;
		this.anInt1459 = i_6;
	}

	public static void method2074(String string_0, String string_1, int i_2, boolean bool_3) {
		if (client.gameState == 3) {
			TCPPacket tcpmessage_5 = Class271.method4828(OutgoingPacket.aClass379_4628, client.connectionContext.isaac, 94516093);
			tcpmessage_5.buffer.writeShort(0);
			int i_6 = tcpmessage_5.buffer.index;
			tcpmessage_5.buffer.writeString(string_0);
			tcpmessage_5.buffer.writeString(string_1);
			tcpmessage_5.buffer.writeByte(i_2);
			tcpmessage_5.buffer.writeByte(bool_3 ? 1 : 0);
			tcpmessage_5.buffer.index += 7;
			tcpmessage_5.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, i_6, tcpmessage_5.buffer.index);
			tcpmessage_5.buffer.method13281(tcpmessage_5.buffer.index - i_6);
			client.connectionContext.queuePacket(tcpmessage_5);
			if (i_2 < 13) {
				client.aBool7189 = true;
				Class188.method3142(-1273118938);
			}

			Class237.aClass494_2916 = Class494.aClass494_5790;
		}

	}

	public static void method2075(int i_0, String string_1) {
		int i_3 = Class197.NUM_PLAYER_INDICES;
		int[] ints_4 = Class197.PLAYER_INDICES;
		boolean bool_5 = false;

		for (int i_6 = 0; i_6 < i_3; i_6++) {
			Player player_7 = client.players[ints_4[i_6]];
			if (player_7 != null && player_7 != VertexNormal.myPlayer && player_7.displayName != null && player_7.displayName.equalsIgnoreCase(string_1)) {
				OutgoingPacket outgoingpacket_8 = null;
				if (i_0 == 1) {
					outgoingpacket_8 = OutgoingPacket.aClass379_4539;
				} else if (i_0 == 4) {
					outgoingpacket_8 = OutgoingPacket.aClass379_4616;
				} else if (i_0 == 5) {
					outgoingpacket_8 = OutgoingPacket.aClass379_4610;
				} else if (i_0 == 6) {
					outgoingpacket_8 = OutgoingPacket.aClass379_4528;
				} else if (i_0 == 7) {
					outgoingpacket_8 = OutgoingPacket.aClass379_4594;
				} else if (i_0 == 9) {
					outgoingpacket_8 = OutgoingPacket.aClass379_4580;
				}

				if (outgoingpacket_8 != null) {
					TCPPacket tcpmessage_9 = Class271.method4828(outgoingpacket_8, client.aClass184_7475.isaac, -147657643);
					tcpmessage_9.buffer.writeShort(ints_4[i_6]);
					tcpmessage_9.buffer.write128Byte(0, 1653548844);
					client.aClass184_7475.queuePacket(tcpmessage_9);
				}

				bool_5 = true;
				break;
			}
		}

		if (!bool_5) {
			LoadingStage.method6681(Message.UNABLE_TO_FIND.translate(Class223.CURRENT_LANGUAGE, -774222111) + string_1, (byte) -65);
		}

	}

	static void method2076(IComponentDefinitions icomponentdefinitions_0, IComponentDefinitions icomponentdefinitions_1) {
		TCPPacket tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4601, client.aClass184_7475.isaac, -3887603);
		tcpmessage_3.buffer.writeShortLE128(icomponentdefinitions_1.anInt1288);
		tcpmessage_3.buffer.writeShortLE(icomponentdefinitions_0.anInt1288, (short) -28348);
		tcpmessage_3.buffer.writeShort(icomponentdefinitions_1.anInt1426);
		tcpmessage_3.buffer.writeShortLE128(icomponentdefinitions_0.anInt1426);
		tcpmessage_3.buffer.writeIntV1(icomponentdefinitions_0.idHash, -1596162032);
		tcpmessage_3.buffer.writeLEInt(icomponentdefinitions_1.idHash, (byte) 77);
		client.aClass184_7475.queuePacket(tcpmessage_3);
	}

	public static void method2077(int i_0) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8208, 1, -879331586);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, 1, -1380077307);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub23_8202, 1, 748663457);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub17_8200, 1, 2086914701);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 0, -480234174);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub26_8224, 0, -1904588686);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub28_8212, 0, 213575590);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub2_8205, 0, 665870482);
		Class393.preferences.setValue(Class393.preferences.textures, 0, -1952612636);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub19_8204, 0, -998359039);
		Class393.preferences.setValue(Class393.preferences.water, 0, 812339318);
		Class393.preferences.setValue(Class393.preferences.fog, 0, 926852510);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8187, 0, -561555646);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8223, 0, -1744988767);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub20_8207, 0, -1860208204);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071, -1298876886);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub12_8195, 0, -1771298616);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub14_8211, 0, -1247353645);
		ImageIndexLoader.method5777(1139653705);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub7_8210, 2, 2126000152);
		Class393.preferences.setValue(Class393.preferences.graphics, 2, -761948866);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048(572282036);
		client.aBool7185 = true;
	}

}
