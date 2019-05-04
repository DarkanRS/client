public class Class105 {

	static int anInt1069;

	String aString1067;

	String aString1066;

	String aString1068;

	Class105(String string_1, String string_2, String string_3) {
		this.aString1067 = string_1;
		this.aString1066 = string_2;
		this.aString1068 = string_3;
	}

	static void method1804(int i_0, String string_1, String string_2) {
		if (client.outputContext != null) {
			TCPPacket tcpmessage_4 = Class271.createPacket(OutgoingPacket.BUG_REPORT, client.outputContext.isaac);
			tcpmessage_4.buffer.writeShort(1 + Utils.stringLengthPlus2(string_1) + Utils.stringLengthPlus2(string_2));
			tcpmessage_4.buffer.writeByte(i_0);
			tcpmessage_4.buffer.writeJagString(string_2);
			tcpmessage_4.buffer.writeJagString(string_1);
			client.outputContext.queuePacket(tcpmessage_4);
		}
	}

	public static final void method1805(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_0 >= Class532_Sub1.anInt7071 && i_1 <= Class532_Sub1.anInt7069 && i_2 >= Class532_Sub1.anInt7070 && i_3 <= Class532_Sub1.anInt7068) {
			if (i_5 == 1) {
				Class48_Sub2.method14572(i_0, i_1, i_2, i_3, i_4);
			} else {
				MapRegion.method4561(i_0, i_1, i_2, i_3, i_4, i_5);
			}
		} else if (i_5 == 1) {
			Class78.method1388(i_0, i_1, i_2, i_3, i_4);
		} else {
			Class20.method744(i_0, i_1, i_2, i_3, i_4, i_5);
		}
	}

	static void method1806(RsBitsBuffer rsbitsbuffer_0, int i_1, int i_2) {
		CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		boolean bool_4 = rsbitsbuffer_0.readBits(1) == 1;
		if (bool_4) {
			Class197.anIntArray2435[++Class197.anInt2434 - 1] = i_1;
		}
		int i_5 = rsbitsbuffer_0.readBits(2);
		Player player_6 = client.players[i_1];
		if (i_5 == 0) {
			if (bool_4) {
				player_6.aBool10568 = false;
			} else {
				if (client.myPlayerIndex == i_1) {
					throw new RuntimeException();
				}
				Class4 class4_14 = Class197.aClass4Array2430[i_1] = new Class4();
				class4_14.anInt31 = (player_6.plane << 28) + (coordgrid_3.y + player_6.regionBaseY[0] >> 6) + (coordgrid_3.x + player_6.regionBaseX[0] >> 6 << 14);
				if (player_6.faceDirection != -1) {
					class4_14.anInt30 = player_6.faceDirection;
				} else {
					class4_14.anInt30 = player_6.aClass19_10359.method578();
				}
				class4_14.anInt32 = player_6.faceEntity;
				class4_14.aBool29 = player_6.aBool10571;
				class4_14.aBool33 = player_6.aBool10550;
				if (player_6.isNpc > 0) {
					Class149_Sub2.method14609(player_6);
				}
				client.players[i_1] = null;
				if (rsbitsbuffer_0.readBits(1) != 0) {
					QuickChatMessage.method6155(rsbitsbuffer_0, i_1);
				}
			}
		} else {
			int i_7;
			int i_8;
			int i_9;
			if (i_5 == 1) {
				i_7 = rsbitsbuffer_0.readBits(3);
				i_8 = player_6.regionBaseX[0];
				i_9 = player_6.regionBaseY[0];
				if (i_7 == 0) {
					--i_8;
					--i_9;
				} else if (i_7 == 1) {
					--i_9;
				} else if (i_7 == 2) {
					++i_8;
					--i_9;
				} else if (i_7 == 3) {
					--i_8;
				} else if (i_7 == 4) {
					++i_8;
				} else if (i_7 == 5) {
					--i_8;
					++i_9;
				} else if (i_7 == 6) {
					++i_9;
				} else if (i_7 == 7) {
					++i_8;
					++i_9;
				}
				if (bool_4) {
					player_6.anInt10569 = i_8;
					player_6.anInt10570 = i_9;
					player_6.aBool10568 = true;
				} else {
					player_6.method16129(i_8, i_9, Class197.playerMovementTypes[i_1], 750897153);
				}
			} else if (i_5 == 2) {
				i_7 = rsbitsbuffer_0.readBits(4);
				i_8 = player_6.regionBaseX[0];
				i_9 = player_6.regionBaseY[0];
				if (i_7 == 0) {
					i_8 -= 2;
					i_9 -= 2;
				} else if (i_7 == 1) {
					--i_8;
					i_9 -= 2;
				} else if (i_7 == 2) {
					i_9 -= 2;
				} else if (i_7 == 3) {
					++i_8;
					i_9 -= 2;
				} else if (i_7 == 4) {
					i_8 += 2;
					i_9 -= 2;
				} else if (i_7 == 5) {
					i_8 -= 2;
					--i_9;
				} else if (i_7 == 6) {
					i_8 += 2;
					--i_9;
				} else if (i_7 == 7) {
					i_8 -= 2;
				} else if (i_7 == 8) {
					i_8 += 2;
				} else if (i_7 == 9) {
					i_8 -= 2;
					++i_9;
				} else if (i_7 == 10) {
					i_8 += 2;
					++i_9;
				} else if (i_7 == 11) {
					i_8 -= 2;
					i_9 += 2;
				} else if (i_7 == 12) {
					--i_8;
					i_9 += 2;
				} else if (i_7 == 13) {
					i_9 += 2;
				} else if (i_7 == 14) {
					++i_8;
					i_9 += 2;
				} else if (i_7 == 15) {
					i_8 += 2;
					i_9 += 2;
				}
				if (bool_4) {
					player_6.anInt10569 = i_8;
					player_6.anInt10570 = i_9;
					player_6.aBool10568 = true;
				} else {
					player_6.method16129(i_8, i_9, Class197.playerMovementTypes[i_1], -1678489989);
				}
			} else {
				i_7 = rsbitsbuffer_0.readBits(1);
				int i_10;
				int i_11;
				int i_12;
				int i_13;
				if (i_7 == 0) {
					i_8 = rsbitsbuffer_0.readBits(12);
					i_9 = i_8 >> 10;
					i_10 = i_8 >> 5 & 0x1f;
					if (i_10 > 15) {
						i_10 -= 32;
					}
					i_11 = i_8 & 0x1f;
					if (i_11 > 15) {
						i_11 -= 32;
					}
					i_12 = i_10 + player_6.regionBaseX[0];
					i_13 = i_11 + player_6.regionBaseY[0];
					if (bool_4) {
						player_6.anInt10569 = i_12;
						player_6.anInt10570 = i_13;
						player_6.aBool10568 = true;
					} else {
						player_6.method16129(i_12, i_13, Class197.playerMovementTypes[i_1], -1262996328);
					}
					player_6.plane = player_6.collisionPlane = (byte) (i_9 + player_6.plane & 0x3);
					if (IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_12, i_13, 1753987250)) {
						player_6.collisionPlane = (byte) (player_6.collisionPlane + 1);
					}
					if (client.myPlayerIndex == i_1 && player_6.plane != Class4.anInt35) {
						Class4.anInt35 = player_6.plane;
					}
				} else {
					i_8 = rsbitsbuffer_0.readBits(30);
					i_9 = i_8 >> 28;
					i_10 = i_8 >> 14 & 0x3fff;
					i_11 = i_8 & 0x3fff;
					i_12 = (i_10 + coordgrid_3.x + player_6.regionBaseX[0] & 0x3fff) - coordgrid_3.x;
					i_13 = (i_11 + coordgrid_3.y + player_6.regionBaseY[0] & 0x3fff) - coordgrid_3.y;
					if (bool_4) {
						player_6.anInt10569 = i_12;
						player_6.anInt10570 = i_13;
						player_6.aBool10568 = true;
					} else {
						player_6.method16129(i_12, i_13, Class197.playerMovementTypes[i_1], -106492270);
					}
					player_6.plane = player_6.collisionPlane = (byte) (i_9 + player_6.plane & 0x3);
					if (IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_12, i_13, 1539369664)) {
						player_6.collisionPlane = (byte) (player_6.collisionPlane + 1);
					}
					if (client.myPlayerIndex == i_1) {
						Class4.anInt35 = player_6.plane;
					}
				}
			}
		}
	}

	public static void method1807(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(14, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 94);
	}
}
