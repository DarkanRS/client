public class Class96_Sub4 extends Class96 {

	int anInt8520;
	int anInt8519;
	int anInt8521;
	int anInt8522;
	int anInt8523;

	Class96_Sub4(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt8520 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readInt();
		this.anInt8519 = i_2 >>> 16;
		this.anInt8521 = i_2 & 0xffff;
		this.anInt8522 = rsbytebuffer_1.readUnsignedByte();
		this.anInt8523 = rsbytebuffer_1.readSmart();
	}

	public void method1592(int i_1) {
		Class82.aClass75Array804[this.anInt8520].method1336(this.anInt8519, this.anInt8521, this.anInt8522, this.anInt8523, 1433918687);
	}

	public void method1601() {
		Class82.aClass75Array804[this.anInt8520 * 2062001331 * 2144840315].method1336(1910720287 * this.anInt8519 * 517305567, this.anInt8521 * -1845072575 * -194698559, 1760322517 * this.anInt8522 * 1440988541, 1015183835 * this.anInt8523 * 1479203411, 1626481262);
	}

	static boolean method13788(int i_0, int i_1) {
		return i_0 == 59 || i_0 == 2 || i_0 == 8 || i_0 == 17 || i_0 == 15 || i_0 == 16 || i_0 == 58;
	}

	static void method13789(Class282_Sub50_Sub7 class282_sub50_sub7_0, int i_1, int i_2, int i_3) {
		if (class282_sub50_sub7_0 != null && Class20.aClass482_171.tail != class282_sub50_sub7_0) {
			int i_4 = class282_sub50_sub7_0.anInt9581;
			int i_5 = class282_sub50_sub7_0.anInt9582;
			int i_6 = class282_sub50_sub7_0.anInt9587;
			int i_7 = (int) class282_sub50_sub7_0.aLong9584;
			long long_8 = class282_sub50_sub7_0.aLong9584;
			if (i_6 >= 2000) {
				i_6 -= 2000;
			}

			CoordGrid coordgrid_10 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1872189276);
			OutgoingPacket outgoingpacket_11 = null;
			if (i_6 == 44) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4539;
			} else if (i_6 == 45) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4571;
			} else if (i_6 == 46) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4623;
			} else if (i_6 == 47) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4616;
			} else if (i_6 == 48) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4610;
			} else if (i_6 == 49) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4528;
			} else if (i_6 == 50) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4594;
			} else if (i_6 == 51) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4621;
			} else if (i_6 == 52) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4580;
			} else if (i_6 == 53) {
				outgoingpacket_11 = OutgoingPacket.aClass379_4629;
			}

			Player player_12;
			TCPMessage tcpmessage_13;
			if (outgoingpacket_11 != null) {
				player_12 = client.players[i_7];
				if (player_12 != null) {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					tcpmessage_13 = Class271.method4828(outgoingpacket_11, client.aClass184_7475.isaac, -38973320);
					tcpmessage_13.buffer.writeShort(i_7, 1417031095);
					tcpmessage_13.buffer.write128Byte(Class84.method1465(-1893602887) ? 1 : 0, -1708065557);
					client.aClass184_7475.method3049(tcpmessage_13, 67860298);
					MapRegion.routeTo(player_12.regionBaseX[0], player_12.regionBaseY[0], true, Class344.method6115(player_12.regionBaseX[0], player_12.regionBaseY[0], player_12.getSize(828768449), player_12.getSize(828768449), 0, 971339209), 1593350845);
				}
			}

			TCPMessage tcpmessage_17;
			if (i_6 == 16) {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				tcpmessage_17 = Class271.method4828(OutgoingPacket.aClass379_4540, client.aClass184_7475.isaac, -70783895);
				tcpmessage_17.buffer.writeShort(client.anInt7345, 1417031095);
				tcpmessage_17.buffer.writeShortLE(Class84.myPlayer.anInt10314, (short) -7319);
				tcpmessage_17.buffer.write128Byte(Class84.method1465(-1700744259) ? 1 : 0, 2138987650);
				tcpmessage_17.buffer.writeIntV2(Class7.anInt56, (byte) 104);
				tcpmessage_17.buffer.writeShortLE(client.anInt7346, (short) -21214);
				client.aClass184_7475.method3049(tcpmessage_17, -436533109);
			}

			if (i_6 == 57 || i_6 == 1007) {
				Class96_Sub10.method14603(i_7, i_5, i_4, class282_sub50_sub7_0.aString9588, (byte) 9);
			}

			if (i_6 == 15) {
				player_12 = client.players[i_7];
				if (player_12 != null) {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					tcpmessage_13 = Class271.method4828(OutgoingPacket.aClass379_4540, client.aClass184_7475.isaac, 2077499926);
					tcpmessage_13.buffer.writeShort(client.anInt7345, 1417031095);
					tcpmessage_13.buffer.writeShortLE(i_7, (short) -12854);
					tcpmessage_13.buffer.write128Byte(Class84.method1465(-1642883449) ? 1 : 0, -1169068214);
					tcpmessage_13.buffer.writeIntV2(Class7.anInt56, (byte) 104);
					tcpmessage_13.buffer.writeShortLE(client.anInt7346, (short) -2375);
					client.aClass184_7475.method3049(tcpmessage_13, -111115308);
					MapRegion.routeTo(player_12.regionBaseX[0], player_12.regionBaseY[0], true, Class344.method6115(player_12.regionBaseX[0], player_12.regionBaseY[0], player_12.getSize(828768449), player_12.getSize(828768449), 0, 971339209), 1255775546);
				}
			}

			if (i_6 == 2) {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				tcpmessage_17 = Class271.method4828(OutgoingPacket.aClass379_4625, client.aClass184_7475.isaac, 787993622);
				tcpmessage_17.buffer.writeShortLE128(i_4 + coordgrid_10.x, -1183932171);
				tcpmessage_17.buffer.write128Byte(Class84.method1465(-1875320207) ? 1 : 0, -728413963);
				tcpmessage_17.buffer.writeIntV1((int) (long_8 >>> 32) & 0x7fffffff, 1535840012);
				tcpmessage_17.buffer.writeInt(Class7.anInt56);
				tcpmessage_17.buffer.writeShortLE(client.anInt7346, (short) -20075);
				tcpmessage_17.buffer.writeShort128(client.anInt7345, -800257688);
				tcpmessage_17.buffer.writeShortLE(i_5 + coordgrid_10.y, (short) -19304);
				client.aClass184_7475.method3049(tcpmessage_17, -886113840);
				Class439.routeToSceneObject(i_4, i_5, long_8);
			}

			OutgoingPacket outgoingpacket_18 = null;
			if (i_6 == 9) {
				outgoingpacket_18 = OutgoingPacket.aClass379_4592;
			} else if (i_6 == 10) {
				outgoingpacket_18 = OutgoingPacket.aClass379_4532;
			} else if (i_6 == 11) {
				outgoingpacket_18 = OutgoingPacket.aClass379_4577;
			} else if (i_6 == 12) {
				outgoingpacket_18 = OutgoingPacket.aClass379_4599;
			} else if (i_6 == 13) {
				outgoingpacket_18 = OutgoingPacket.aClass379_4622;
			} else if (i_6 == 1003) {
				outgoingpacket_18 = OutgoingPacket.aClass379_4530;
			}

			TCPMessage tcpmessage_15;
			if (outgoingpacket_18 != null) {
				Class282_Sub47 class282_sub47_19 = (Class282_Sub47) client.NPCS.get((long) i_7);
				if (class282_sub47_19 != null) {
					NPC npc_14 = (NPC) class282_sub47_19.anObject8068;
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					tcpmessage_15 = Class271.method4828(outgoingpacket_18, client.aClass184_7475.isaac, 1353629602);
					tcpmessage_15.buffer.writeShort(i_7, 1417031095);
					tcpmessage_15.buffer.writeByte(Class84.method1465(-1762610857) ? 1 : 0);
					client.aClass184_7475.method3049(tcpmessage_15, -688965453);
					MapRegion.routeTo(npc_14.regionBaseX[0], npc_14.regionBaseY[0], true, Class344.method6115(npc_14.regionBaseX[0], npc_14.regionBaseY[0], npc_14.getSize(828768449), npc_14.getSize(828768449), 0, 971339209), 907331887);
				}
			}

			if (i_6 == 60) {
				if (client.rights > 0 && Class96_Sub8.method14577(1203434505)) {
					Class447.method7460(Class84.myPlayer.plane, i_4 + coordgrid_10.x, i_5 + coordgrid_10.y, -1797867076);
				} else {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 1;
					client.anInt7295 = 0;
					tcpmessage_13 = Class271.method4828(OutgoingPacket.aClass379_4590, client.aClass184_7475.isaac, 340096638);
					tcpmessage_13.buffer.writeShort128(i_4 + coordgrid_10.x, -800257688);
					tcpmessage_13.buffer.writeShort(i_5 + coordgrid_10.y, 1417031095);
					client.aClass184_7475.method3049(tcpmessage_13, -258838494);
				}
			}

			if (i_6 == 23) {
				if (client.rights > 0 && Class96_Sub8.method14577(1203434505)) {
					Class447.method7460(Class84.myPlayer.plane, i_4 + coordgrid_10.x, i_5 + coordgrid_10.y, -1328310024);
				} else {
					tcpmessage_13 = Class282_Sub2.method12078(i_4, i_5, i_7, -1751804483);
					if (i_7 == 1) {
						tcpmessage_13.buffer.writeByte(-1);
						tcpmessage_13.buffer.writeByte(-1);
						tcpmessage_13.buffer.writeShort((int) client.aFloat7365, 1417031095);
						tcpmessage_13.buffer.writeByte(57);
						tcpmessage_13.buffer.writeByte(client.anInt7255);
						tcpmessage_13.buffer.writeByte(client.anInt7203);
						tcpmessage_13.buffer.writeByte(89);
						Vector3 vector3_20 = Class84.myPlayer.method11166().aClass385_3595;
						tcpmessage_13.buffer.writeShort((int) vector3_20.x, 1417031095);
						tcpmessage_13.buffer.writeShort((int) vector3_20.z, 1417031095);
						tcpmessage_13.buffer.writeByte(63);
					} else {
						client.anInt7293 = i_1;
						client.anInt7294 = i_2;
						client.anInt7296 = 1;
						client.anInt7295 = 0;
					}

					client.aClass184_7475.method3049(tcpmessage_13, -1144629676);
					MapRegion.routeTo(i_4, i_5, true, Class38.method853(i_4, i_5, 1597401587), 1072484880);
				}
			}

			if (i_6 == 17) {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				tcpmessage_13 = Class271.method4828(OutgoingPacket.aClass379_4583, client.aClass184_7475.isaac, -30824193);
				tcpmessage_13.buffer.writeShort128(client.anInt7346, -800257688);
				tcpmessage_13.buffer.writeIntV2(Class7.anInt56, (byte) 104);
				tcpmessage_13.buffer.writeShort(i_7, 1417031095);
				tcpmessage_13.buffer.write128Byte(Class84.method1465(-2067403858) ? 1 : 0, 614309811);
				tcpmessage_13.buffer.writeShortLE128(client.anInt7345, -1183932171);
				tcpmessage_13.buffer.writeShortLE128(i_5 + coordgrid_10.y, -1183932171);
				tcpmessage_13.buffer.writeShortLE(i_4 + coordgrid_10.x, (short) -574);
				client.aClass184_7475.method3049(tcpmessage_13, 1026705629);
				client.method12073(i_4, i_5, 693787765);
			}

			if (i_6 == 59) {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 1;
				client.anInt7295 = 0;
				tcpmessage_13 = Class271.method4828(OutgoingPacket.aClass379_4589, client.aClass184_7475.isaac, 1709499240);
				tcpmessage_13.buffer.writeShortLE(client.anInt7346, (short) -18202);
				tcpmessage_13.buffer.writeShortLE(i_5 + coordgrid_10.y, (short) -5938);
				tcpmessage_13.buffer.writeIntV1(Class7.anInt56, 362432766);
				tcpmessage_13.buffer.writeShort128(client.anInt7345, -800257688);
				tcpmessage_13.buffer.writeShortLE(i_4 + coordgrid_10.x, (short) -8634);
				client.aClass184_7475.method3049(tcpmessage_13, -311032746);
				MapRegion.routeTo(i_4, i_5, true, Class38.method853(i_4, i_5, -795317623), 1870869554);
			}

			if (i_6 == 30 && client.aClass118_7352 == null) {
				Class158_Sub2.method14355(i_5, i_4, 382043562);
				client.aClass118_7352 = Index.method5694(i_5, i_4, -702392131);
				if (client.aClass118_7352 != null) {
					Class109.method1858(client.aClass118_7352, (byte) -7);
				}
			}

			IComponentDefinitions icomponentdefinitions_23;
			if (i_6 == 58) {
				icomponentdefinitions_23 = Index.method5694(i_5, i_4, 1636358419);
				if (icomponentdefinitions_23 != null) {
					Class151.method2590(icomponentdefinitions_23, (byte) 30);
				}
			}

			if (i_6 == 25) {
				icomponentdefinitions_23 = Index.method5694(i_5, i_4, 1215515572);
				if (icomponentdefinitions_23 != null) {
					Class60.method1170(-609337146);
					IComponentSettings class282_sub10_21 = client.method11633(icomponentdefinitions_23);
					Class304.method5409(icomponentdefinitions_23, class282_sub10_21.getUseOptionFlags(), class282_sub10_21.interfaceId, (byte) -114);
					client.aString7275 = Class346.method6157(icomponentdefinitions_23, -252673863);
					if (client.aString7275 == null) {
						client.aString7275 = "Null";
					}

					client.aString7356 = icomponentdefinitions_23.aString1369 + ParticleProducerDefinition.method1163(16777215, 619010179);
				}
			} else {
				OutgoingPacket outgoingpacket_27 = null;
				if (i_6 == 18) {
					outgoingpacket_27 = OutgoingPacket.aClass379_4559;
				} else if (i_6 == 19) {
					outgoingpacket_27 = OutgoingPacket.aClass379_4552;
				} else if (i_6 == 20) {
					outgoingpacket_27 = OutgoingPacket.aClass379_4581;
				} else if (i_6 == 21) {
					outgoingpacket_27 = OutgoingPacket.aClass379_4535;
				} else if (i_6 == 22) {
					outgoingpacket_27 = OutgoingPacket.aClass379_4564;
				} else if (i_6 == 1004) {
					outgoingpacket_27 = OutgoingPacket.aClass379_4588;
				}

				if (outgoingpacket_27 != null) {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					TCPMessage tcpmessage_22 = Class271.method4828(outgoingpacket_27, client.aClass184_7475.isaac, 934209488);
					tcpmessage_22.buffer.writeShortLE128(i_7, -1183932171);
					tcpmessage_22.buffer.writeByteC(Class84.method1465(-1708313818) ? 1 : 0, 1203558743);
					tcpmessage_22.buffer.writeShort(i_5 + coordgrid_10.y, 1417031095);
					tcpmessage_22.buffer.writeShort128(i_4 + coordgrid_10.x, -800257688);
					client.aClass184_7475.method3049(tcpmessage_22, 1582161852);
					client.method12073(i_4, i_5, 633151820);
				}

				if (i_6 == 8) {
					Class282_Sub47 class282_sub47_24 = (Class282_Sub47) client.NPCS.get((long) i_7);
					if (class282_sub47_24 != null) {
						NPC npc_25 = (NPC) class282_sub47_24.anObject8068;
						client.anInt7293 = i_1;
						client.anInt7294 = i_2;
						client.anInt7296 = 2;
						client.anInt7295 = 0;
						TCPMessage tcpmessage_16 = Class271.method4828(OutgoingPacket.aClass379_4568, client.aClass184_7475.isaac, -608363088);
						tcpmessage_16.buffer.writeIntV2(Class7.anInt56, (byte) 104);
						tcpmessage_16.buffer.writeShortLE128(i_7, -1183932171);
						tcpmessage_16.buffer.write128Byte(Class84.method1465(-1846955130) ? 1 : 0, 1376249266);
						tcpmessage_16.buffer.writeShortLE128(client.anInt7346, -1183932171);
						tcpmessage_16.buffer.writeShort128(client.anInt7345, -800257688);
						client.aClass184_7475.method3049(tcpmessage_16, -86724265);
						MapRegion.routeTo(npc_25.regionBaseX[0], npc_25.regionBaseY[0], true, Class344.method6115(npc_25.regionBaseX[0], npc_25.regionBaseY[0], npc_25.getSize(828768449), npc_25.getSize(828768449), 0, 971339209), 1130929855);
					}
				}

				OutgoingPacket outgoingpacket_26 = null;
				if (i_6 == 3) {
					outgoingpacket_26 = OutgoingPacket.aClass379_4602;
				} else if (i_6 == 4) {
					outgoingpacket_26 = OutgoingPacket.aClass379_4620;
				} else if (i_6 == 5) {
					outgoingpacket_26 = OutgoingPacket.aClass379_4565;
				} else if (i_6 == 6) {
					outgoingpacket_26 = OutgoingPacket.aClass379_4626;
				} else if (i_6 == 1001) {
					outgoingpacket_26 = OutgoingPacket.aClass379_4575;
				} else if (i_6 == 1002) {
					outgoingpacket_26 = OutgoingPacket.OBJECT_EXAMINE;
				}

				if (outgoingpacket_26 != null) {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					tcpmessage_15 = Class271.method4828(outgoingpacket_26, client.aClass184_7475.isaac, 1341329905);
					tcpmessage_15.buffer.writeShort(i_5 + coordgrid_10.y, 1417031095);
					tcpmessage_15.buffer.writeShort(i_4 + coordgrid_10.x, 1417031095);
					tcpmessage_15.buffer.writeInt((int) (long_8 >>> 32) & 0x7fffffff);
					tcpmessage_15.buffer.writeByte128(Class84.method1465(-1734216598) ? 1 : 0, 784835211);
					client.aClass184_7475.method3049(tcpmessage_15, -1242179380);
					Class439.routeToSceneObject(i_4, i_5, long_8);
				}

				if (i_6 == 1008 || i_6 == 1009 || i_6 == 1010 || i_6 == 1011 || i_6 == 1012) {
					Class6.method303(i_6, i_7, i_4, -1949289541);
				}

				if (client.aBool7344) {
					Class60.method1170(-609337146);
				}

				if (Class401.aClass118_4825 != null && client.anInt7297 == 0) {
					Class109.method1858(Class401.aClass118_4825, (byte) -103);
				}
			}
		}

	}

	public static void executeHookInner200k(HookRequest hookrequest_0, int i_1) {
		Class400.executeHookInner(hookrequest_0, 200000, (byte) 44);
	}

}
