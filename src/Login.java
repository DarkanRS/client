import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Login {

	public List aList3388 = new LinkedList();

	boolean aBool3386 = false;

	int anInt3387 = 0;

	int anInt3385 = 0;

	public void method5012(int i_1) {
		Iterator iterator_2 = this.aList3388.iterator();
		while (iterator_2.hasNext()) {
			Class285 class285_3 = (Class285) iterator_2.next();
			iterator_2.remove();
			Class279.method4969(class285_3, 1362412061);
		}
	}

	void method5013(Class285 class285_1, int i_2) {
		Class521_Sub1 class521_sub1_3 = class285_1.aClass521_Sub1_3391;
		boolean bool_4 = true;
		Class275_Sub5[] arr_5 = class285_1.aClass521_Sub1_3391.aClass275_Sub5Array7965;
		for (int i_6 = 0; i_6 < arr_5.length; i_6++) {
			if (arr_5[i_6].aBool7849) {
				bool_4 = false;
				break;
			}
		}
		if (!bool_4) {
			class285_1.aClass284_3393 = this;
			Class285 class285_7;
			if (this.aBool3386) {
				Iterator iterator_8 = this.aList3388.iterator();
				while (iterator_8.hasNext()) {
					class285_7 = (Class285) iterator_8.next();
					if (class521_sub1_3 == class285_7.aClass521_Sub1_3391) {
						iterator_8.remove();
						Class279.method4969(class285_7, 1362412061);
					}
				}
			}
			ListIterator listiterator_9 = this.aList3388.listIterator();
			while (listiterator_9.hasNext()) {
				class285_7 = (Class285) listiterator_9.next();
				if (class521_sub1_3.anInt7969 >= class285_7.aClass521_Sub1_3391.anInt7969) {
					listiterator_9.previous();
					listiterator_9.add(class285_1);
					return;
				}
			}
			this.aList3388.add(class285_1);
		}
	}

	Login(boolean bool_1) {
		this.aBool3386 = bool_1;
	}

	static final void method5017(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, -305873852) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1383 = Class351.method6193(string_4, cs2executor_2, -186222410);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method5018(byte b_0) {
		if (Class9.loginStage != 2 && Class9.loginStage != 105) {
			try {
				short s_1;
				if (Class9.anInt104 == 0) {
					s_1 = 250;
				} else {
					s_1 = 2000;
				}
				if (Class9.socialNetworkLogin && Class9.loginStage >= 65) {
					s_1 = 6000;
				}
				if (Class9.lobbyStage != 273 || Class9.loginStage != 201 && Class9.anInt106 != 42) {
					++Class9.anInt90;
				}
				if (Class9.anInt90 > s_1) {
					Class9.aClass184_73.method3051((byte) -84);
					if (Class9.anInt104 >= 3) {
						Class9.loginStage = 2;
						Class8_Sub1.method13784(-5, -1415589664);
						return;
					}
					if (Class9.lobbyStage == 273) {
						Class159.aClass450_2010.method7493(-541259802);
					} else {
						Class448.aClass450_5424.method7493(-1978908431);
					}
					Class9.anInt90 = 0;
					++Class9.anInt104;
					Class9.loginStage = 18;
				}
				TCPMessage tcpmessage_2;
				int i_3;
				int i_5;
				if (Class9.loginStage == 18) {
					if (Class9.lobbyStage == 273) {
						Class9.aClass184_73.method3050(Class38.createAsyncConnection(Class159.aClass450_2010.method7494((byte) 91), 15000, -215151896), Class159.aClass450_2010.aString5433, (byte) -112);
					} else {
						Class9.aClass184_73.method3050(Class38.createAsyncConnection(Class448.aClass450_5424.method7494((byte) 75), 15000, 1248559901), Class448.aClass450_5424.aString5433, (byte) -64);
					}
					Class9.aClass184_73.method3054((short) -6917);
					tcpmessage_2 = Class207.method3558((byte) 88);
					if (Class9.socialNetworkLogin) {
						tcpmessage_2.buffer.writeByte(OutgoingLoginPacket.INIT_SOCIAL_NETWORK_CONNECTION.id);
						tcpmessage_2.buffer.writeShort(0, 1417031095);
						i_3 = tcpmessage_2.buffer.index;
						tcpmessage_2.buffer.writeInt(727);
						tcpmessage_2.buffer.writeInt(1);
						if (Class9.lobbyStage == 273) {
							tcpmessage_2.buffer.writeByte(client.gameState == 10 ? 1 : 0);
						}
						RsByteBuffer rsbytebuffer_4 = Class94.method1587((byte) -40);
						rsbytebuffer_4.writeByte(Class9.anInt76);
						rsbytebuffer_4.writeShort((int) (Math.random() * 9.9999999E7D), 1417031095);
						rsbytebuffer_4.writeByte(Class223.CURRENT_LANGUAGE.method243((byte) 1));
						rsbytebuffer_4.writeInt(client.anInt7149);
						for (i_5 = 0; i_5 < 6; i_5++) {
							rsbytebuffer_4.writeInt((int) (Math.random() * 9.9999999E7D));
						}
						rsbytebuffer_4.writeLong(client.aLong7409);
						rsbytebuffer_4.writeByte(client.CURRENT_GAME.anInt5746);
						rsbytebuffer_4.writeByte((int) (Math.random() * 9.9999999E7D));
						rsbytebuffer_4.applyRSA(Loader.RSA_PUBLIC_EXPONENT, Loader.RSA_PUBLIC_MODULUS);
						tcpmessage_2.buffer.writeBytes(rsbytebuffer_4.buffer, 0, rsbytebuffer_4.index);
						tcpmessage_2.buffer.method13281(tcpmessage_2.buffer.index - i_3, 1201423895);
					} else {
						tcpmessage_2.buffer.writeByte(OutgoingLoginPacket.INIT_GAME_CONNECTION.id);
					}
					Class9.aClass184_73.method3049(tcpmessage_2, 1846695910);
					Class9.aClass184_73.method3047(146720590);
					Class9.loginStage = 35;
				}
				int i_10;
				if (Class9.loginStage == 35) {
					if (!Class9.aClass184_73.method3053((byte) -38).available(1, (byte) 74)) {
						return;
					}
					Class9.aClass184_73.method3053((byte) -94).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 1, -824634075);
					i_10 = Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff;
					if (i_10 != 0) {
						Class9.loginStage = 2;
						Class8_Sub1.method13784(i_10, -2100127470);
						Class9.aClass184_73.method3051((byte) -115);
						Class361.method6270((byte) 36);
						return;
					}
					if (Class9.socialNetworkLogin) {
						Class9.loginStage = 46;
					} else {
						Class9.loginStage = 80;
					}
				}
				if (Class9.loginStage == 46) {
					if (!Class9.aClass184_73.method3053((byte) -18).available(2, (byte) 112)) {
						return;
					}
					Class9.aClass184_73.method3053((byte) -61).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 2, -1471346817);
					Class9.aClass184_73.recievedBuffer.index = 0;
					Class9.aClass184_73.recievedBuffer.index = Class9.aClass184_73.recievedBuffer.readUnsignedShort();
					Class9.loginStage = 57;
				}
				if (Class9.loginStage == 57) {
					if (!Class9.aClass184_73.method3053((byte) -87).available(Class9.aClass184_73.recievedBuffer.index, (byte) 29)) {
						return;
					}
					Class9.aClass184_73.method3053((byte) -97).read(Class9.aClass184_73.recievedBuffer.buffer, 0, Class9.aClass184_73.recievedBuffer.index, -1629870171);
					Class9.aClass184_73.recievedBuffer.method13100(Class500.anIntArray5827, 1168221158);
					Class9.aClass184_73.recievedBuffer.index = 0;
					String string_18 = Class9.aClass184_73.recievedBuffer.readGJString(-1864555618);
					Class9.aClass184_73.recievedBuffer.index = 0;
					String string_11 = Class361.aClass361_4176.method6253((byte) -35);
					if (!client.aBool7310 || !Class186.method3082(string_18, 1, string_11, 145298920)) {
						Class508.method8736(string_18, true, Class393.preferences.currentToolkit.getValue(-778399292) == 5, string_11, client.aBool7158, client.aBool7159, (byte) -110);
					}
					Class9.loginStage = 65;
				}
				if (Class9.loginStage == 65) {
					if (!Class9.aClass184_73.method3053((byte) -20).available(1, (byte) 54)) {
						return;
					}
					Class9.aClass184_73.method3053((byte) -23).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 1, -2143110299);
					if ((Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff) == 1) {
						Class9.loginStage = 75;
					}
				}
				if (Class9.loginStage == 75) {
					if (!Class9.aClass184_73.method3053((byte) -32).available(16, (byte) 108)) {
						return;
					}
					Class9.aClass184_73.method3053((byte) -21).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 16, -1653161098);
					Class9.aClass184_73.recievedBuffer.index = 16;
					Class9.aClass184_73.recievedBuffer.method13100(Class500.anIntArray5827, 1118777738);
					Class9.aClass184_73.recievedBuffer.index = 0;
					Class9.aLong77 = Class9.aClass184_73.recievedBuffer.readLong();
					Class9.aLong86 = Class9.aClass184_73.recievedBuffer.readLong();
					Class9.loginStage = 80;
				}
				RsBitsBuffer rsbitsbuffer_22;
				if (Class9.loginStage == 80) {
					Class9.aClass184_73.recievedBuffer.index = 0;
					Class9.aClass184_73.method3054((short) -24062);
					tcpmessage_2 = Class207.method3558((byte) 82);
					rsbitsbuffer_22 = tcpmessage_2.buffer;
					int i_6;
					RsByteBuffer rsbytebuffer_7;
					OutgoingLoginPacket outgoingloginpacket_20;
					if (Class9.lobbyStage == 273) {
						if (Class9.socialNetworkLogin) {
							outgoingloginpacket_20 = OutgoingLoginPacket.SOCIAL_NETWORK_LOGIN;
						} else {
							outgoingloginpacket_20 = OutgoingLoginPacket.GAMELOGIN;
						}
						rsbitsbuffer_22.writeByte(outgoingloginpacket_20.id);
						rsbitsbuffer_22.writeShort(0, 1417031095);
						i_5 = rsbitsbuffer_22.index;
						i_6 = rsbitsbuffer_22.index;
						if (!Class9.socialNetworkLogin) {
							rsbitsbuffer_22.writeInt(727);
							rsbitsbuffer_22.writeInt(1);
							rsbitsbuffer_22.writeByte(client.gameState == 10 ? 1 : 0);
							i_6 = rsbitsbuffer_22.index;
							rsbytebuffer_7 = ChatLine.getLoginMod();
							rsbitsbuffer_22.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
							i_6 = rsbitsbuffer_22.index;
							rsbitsbuffer_22.writeByte(Class9.aLong77 == -1L ? 1 : 0);
							if (Class9.aLong77 == -1L) {
								rsbitsbuffer_22.writeString(Class9.aString99);
							} else {
								rsbitsbuffer_22.writeLong(Class9.aLong77);
							}
						}
						rsbitsbuffer_22.writeByte(Class158.windowedMode());
						rsbitsbuffer_22.writeShort(Class349.anInt4083, 1417031095);
						rsbitsbuffer_22.writeShort(Engine.anInt3243 * -969250379, 1417031095);
						rsbitsbuffer_22.writeByte(Class393.preferences.aClass468_Sub4_8223.method12641(919663007));
						Class31.method809(rsbitsbuffer_22, 972141670);
						rsbitsbuffer_22.writeString(client.aString7281);
						rsbitsbuffer_22.writeInt(client.anInt7149);
						rsbytebuffer_7 = Class393.preferences.method13499(-1147561842);
						rsbitsbuffer_22.writeByte(rsbytebuffer_7.index);
						rsbitsbuffer_22.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
						client.aBool7175 = true;
						RsByteBuffer rsbytebuffer_8 = new RsByteBuffer(Class11.SYSTEM_INFO.method13454(1537607861));
						Class11.SYSTEM_INFO.writeMachineInformation(rsbytebuffer_8, 419814551);
						rsbitsbuffer_22.writeBytes(rsbytebuffer_8.buffer, 0, rsbytebuffer_8.buffer.length);
						rsbitsbuffer_22.writeInt(client.anInt7221);
						rsbitsbuffer_22.writeLong(client.aLong7153);
						rsbitsbuffer_22.writeString(Class464.aString5555);
						rsbitsbuffer_22.writeByte(client.aString7156 == null ? 0 : 1);
						if (client.aString7156 != null) {
							rsbitsbuffer_22.writeString(client.aString7156);
						}
						rsbitsbuffer_22.writeByte(IndexLoaders.NATIVE_LIBRARY_LOADER.method4639("jagtheora", (short) 255) ? 1 : 0);
						rsbitsbuffer_22.writeByte(client.aBool7310 ? 1 : 0);
						rsbitsbuffer_22.writeByte(client.aBool7160 ? 1 : 0);
						rsbitsbuffer_22.writeByte(RenderAnimDefs.anInt2831);
						rsbitsbuffer_22.writeInt(client.anInt7163);
						rsbitsbuffer_22.writeString(client.aString7164);
						rsbitsbuffer_22.writeByte(Class448.aClass450_5421 != null && Class159.aClass450_2010.worldId == Class448.aClass450_5421.worldId ? 0 : 1);
						int i_9 = Class159.aClass450_2010.worldId;
						rsbitsbuffer_22.writeInt(i_9);
						QuestDefinitions.writeCRCs(rsbitsbuffer_22, 1259367589);
						rsbitsbuffer_22.encryptWithXtea(Class500.anIntArray5827, i_6, rsbitsbuffer_22.index, 1754334967);
						rsbitsbuffer_22.method13281(rsbitsbuffer_22.index - i_5, 1201423895);
					} else {
						if (Class9.socialNetworkLogin) {
							outgoingloginpacket_20 = OutgoingLoginPacket.SOCIAL_NETWORK_LOGIN;
						} else {
							outgoingloginpacket_20 = OutgoingLoginPacket.LOBBYLOGIN;
						}
						rsbitsbuffer_22.writeByte(outgoingloginpacket_20.id);
						rsbitsbuffer_22.writeShort(0, 1417031095);
						i_5 = rsbitsbuffer_22.index;
						i_6 = rsbitsbuffer_22.index;
						if (!Class9.socialNetworkLogin) {
							rsbitsbuffer_22.writeInt(727);
							rsbitsbuffer_22.writeInt(1);
							rsbytebuffer_7 = ChatLine.getLoginMod();
							rsbitsbuffer_22.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
							i_6 = rsbitsbuffer_22.index;
							rsbitsbuffer_22.writeByte(Class9.aLong77 == -1L ? 1 : 0);
							if (Class9.aLong77 == -1L) {
								rsbitsbuffer_22.writeString(Class9.aString99);
							} else {
								rsbitsbuffer_22.writeLong(Class9.aLong77);
							}
						}
						rsbitsbuffer_22.writeByte(client.CURRENT_GAME.anInt5746);
						rsbitsbuffer_22.writeByte(Class223.CURRENT_LANGUAGE.method243((byte) 1));
						Class31.method809(rsbitsbuffer_22, -378154884);
						rsbitsbuffer_22.writeString(client.aString7281);
						rsbytebuffer_7 = Class393.preferences.method13499(-1147561842);
						rsbitsbuffer_22.writeByte(rsbytebuffer_7.index);
						rsbitsbuffer_22.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
						rsbitsbuffer_22.writeString(Class464.aString5555);
						rsbitsbuffer_22.writeInt(client.anInt7149);
						rsbitsbuffer_22.writeInt(client.anInt7163);
						rsbitsbuffer_22.writeString(client.aString7164);
						QuestDefinitions.writeCRCs(rsbitsbuffer_22, 860014211);
						rsbitsbuffer_22.encryptWithXtea(Class500.anIntArray5827, i_6, rsbitsbuffer_22.index, 1203865118);
						rsbitsbuffer_22.method13281(rsbitsbuffer_22.index - i_5, 1201423895);
					}
					Class9.aClass184_73.method3049(tcpmessage_2, 96752034);
					Class9.aClass184_73.method3047(124172931);
					Class9.aClass184_73.isaac = new IsaacCipher(Class500.anIntArray5827);
					for (int i_12 = 0; i_12 < 4; i_12++) {
						Class500.anIntArray5827[i_12] += 50;
					}
					Class9.aClass184_73.aClass432_2295 = new IsaacCipher(Class500.anIntArray5827);
					new IsaacCipher(Class500.anIntArray5827);
					Class9.aClass184_73.recievedBuffer.setIsaacCipher(Class9.aClass184_73.aClass432_2295, 1851257503);
					Class500.anIntArray5827 = null;
					Class9.loginStage = 97;
				}
				if (Class9.loginStage == 97) {
					if (!Class9.aClass184_73.method3053((byte) -12).available(1, (byte) 99)) {
						return;
					}
					Class9.aClass184_73.method3053((byte) -109).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 1, -973047243);
					i_10 = Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff;
					if (i_10 == 21) {
						Class9.loginStage = 128;
					} else if (i_10 != 29 && i_10 != 45) {
						if (i_10 == 1) {
							Class9.loginStage = 105;
							Class8_Sub1.method13784(i_10, -1633539224);
							return;
						}
						if (i_10 == 2) {
							Class9.loginStage = 133;
						} else {
							if (i_10 != 15) {
								if (i_10 == 23 && Class9.anInt104 < 3) {
									Class9.anInt90 = 0;
									++Class9.anInt104;
									Class9.loginStage = 18;
									Class9.aClass184_73.method3051((byte) -29);
									return;
								} else if (i_10 == 42) {
									Class9.loginStage = 201;
									Class8_Sub1.method13784(i_10, -1894609821);
									return;
								} else {
									if (Class9.aBool74 && !Class9.socialNetworkLogin && Class9.anInt76 != -1 && i_10 == 35) {
										Class9.socialNetworkLogin = true;
										Class9.anInt90 = 0;
										Class9.loginStage = 18;
										Class9.aClass184_73.method3051((byte) -19);
									} else {
										Class9.loginStage = 2;
										Class8_Sub1.method13784(i_10, -476487061);
										Class9.aClass184_73.method3051((byte) -84);
										Class361.method6270((byte) 102);
									}
									return;
								}
							}
							Class9.aClass184_73.anInt2287 = -2;
							Class9.loginStage = 196;
						}
					} else {
						Class110.anInt1105 = i_10;
						Class9.loginStage = 180;
					}
				}
				if (Class9.loginStage == 115) {
					Class9.aClass184_73.method3054((short) 7627);
					tcpmessage_2 = Class207.method3558((byte) 32);
					rsbitsbuffer_22 = tcpmessage_2.buffer;
					rsbitsbuffer_22.setIsaacCipher(Class9.aClass184_73.isaac, 271369997);
					rsbitsbuffer_22.writeIsaacByte(OutgoingLoginPacket.GAMELOGIN_CONTINUE.id, 264695091);
					Class9.aClass184_73.method3049(tcpmessage_2, 132701015);
					Class9.aClass184_73.method3047(-692056530);
					Class9.loginStage = 97;
				} else if (Class9.loginStage == 128) {
					if (Class9.aClass184_73.method3053((byte) -36).available(1, (byte) 47)) {
						Class9.aClass184_73.method3053((byte) -43).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 1, -587532919);
						i_10 = Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff;
						Class9.anInt103 = i_10 * 50;
						Class9.loginStage = 2;
						Class8_Sub1.method13784(21, 17799798);
						Class9.aClass184_73.method3051((byte) -76);
						Class361.method6270((byte) 74);
					}
				} else if (Class9.loginStage == 201) {
					if (Class9.aClass184_73.method3053((byte) -102).available(2, (byte) 20)) {
						Class9.aClass184_73.method3053((byte) -21).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 2, -579379615);
						Class9.anInt113 = ((Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff) << 8) + (Class9.aClass184_73.recievedBuffer.buffer[1] & 0xff);
						Class9.loginStage = 97;
					}
				} else if (Class9.loginStage == 180) {
					if (Class110.anInt1105 == 29) {
						if (!Class9.aClass184_73.method3053((byte) -54).available(1, (byte) 23)) {
							return;
						}
						Class9.aClass184_73.method3053((byte) -29).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 1, -1191779145);
						Class9.anInt112 = Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff;
					} else {
						if (Class110.anInt1105 != 45) {
							throw new IllegalStateException();
						}
						if (!Class9.aClass184_73.method3053((byte) -110).available(3, (byte) 26)) {
							return;
						}
						Class9.aClass184_73.method3053((byte) -123).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 3, -1876355319);
						Class9.anInt112 = Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff;
						Class9.anInt94 = (Class9.aClass184_73.recievedBuffer.buffer[2] & 0xff) + ((Class9.aClass184_73.recievedBuffer.buffer[1] & 0xff) << 8);
					}
					Class9.loginStage = 2;
					Class8_Sub1.method13784(Class110.anInt1105, -612160283);
					Class9.aClass184_73.method3051((byte) -74);
					Class361.method6270((byte) 89);
				} else if (Class9.loginStage == 133) {
					if (Class9.aClass184_73.method3053((byte) -85).available(1, (byte) 60)) {
						Class9.aClass184_73.method3053((byte) -2).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 1, -1154230735);
						Class153.anInt1965 = Class9.aClass184_73.recievedBuffer.buffer[0] & 0xff;
						Class9.loginStage = 140;
					}
				} else {
					RsBitsBuffer rsbitsbuffer_19;
					if (Class9.loginStage == 140) {
						rsbitsbuffer_19 = Class9.aClass184_73.recievedBuffer;
						if (Class9.lobbyStage == 273) {
							if (!Class9.aClass184_73.method3053((byte) -4).available(Class153.anInt1965, (byte) 38)) {
								return;
							}
							Class9.aClass184_73.method3053((byte) -24).read(rsbitsbuffer_19.buffer, 0, Class153.anInt1965, -1595148052);
							rsbitsbuffer_19.index = 0;
							client.rights = rsbitsbuffer_19.readUnsignedByte();
							client.anInt7319 = rsbitsbuffer_19.readUnsignedByte();
							client.aBool7224 = rsbitsbuffer_19.readUnsignedByte() == 1;
							client.aBool7244 = rsbitsbuffer_19.readUnsignedByte() == 1;
							client.aBool7322 = rsbitsbuffer_19.readUnsignedByte() == 1;
							client.aBool7325 = rsbitsbuffer_19.readUnsignedByte() == 1;
							client.anInt7315 = rsbitsbuffer_19.readUnsignedShort();
							client.aBool7316 = rsbitsbuffer_19.readUnsignedByte() == 1;
							Class504.anInt5832 = rsbitsbuffer_19.read24BitInteger(1818887431);
							client.membersWorld = rsbitsbuffer_19.readUnsignedByte() == 1;
							RegionMap.aString3643 = rsbitsbuffer_19.readString();
							IndexLoaders.MAP_REGION_DECODER.method4436(-1683757670).method7912(client.membersWorld, 65280);
							IndexLoaders.MAP_REGION_LOADER_THREAD.method6052((short) 2983).method4436(-1487690474).method7912(client.membersWorld, 65280);
							IndexLoaders.ITEM_INDEX_LOADER.method7148(client.membersWorld, -1605655563);
							IndexLoaders.NPC_INDEX_LOADER.method6847(client.membersWorld, (byte) 53);
						} else {
							if (!Class9.aClass184_73.method3053((byte) -33).available(Class153.anInt1965, (byte) 63)) {
								return;
							}
							Class9.aClass184_73.method3053((byte) -48).read(rsbitsbuffer_19.buffer, 0, Class153.anInt1965, -1443269131);
							rsbitsbuffer_19.index = 0;
							client.rights = rsbitsbuffer_19.readUnsignedByte();
							client.anInt7319 = rsbitsbuffer_19.readUnsignedByte();
							client.aBool7224 = rsbitsbuffer_19.readUnsignedByte() == 1;
							Class504.anInt5832 = rsbitsbuffer_19.read24BitInteger(979570289);
							Class84.myPlayer.male = (byte) rsbitsbuffer_19.readUnsignedByte();
							client.aBool7244 = rsbitsbuffer_19.readUnsignedByte() == 1;
							client.aBool7322 = rsbitsbuffer_19.readUnsignedByte() == 1;
							Class116.aLong1259 = rsbitsbuffer_19.readLong();
							Class43.aLong420 = Class116.aLong1259 - Class169.time() - rsbitsbuffer_19.read5ByteInteger(-315353616);
							i_3 = rsbitsbuffer_19.readUnsignedByte();
							client.aBool7316 = (i_3 & 0x1) != 0;
							Class509.aBool5870 = (i_3 & 0x2) != 0;
							Class354.anInt4112 = rsbitsbuffer_19.readInt();
							Class469.aBool5585 = rsbitsbuffer_19.readUnsignedByte() == 1;
							Class232.anInt2879 = rsbitsbuffer_19.readInt();
							Class115.anInt1247 = rsbitsbuffer_19.readUnsignedShort();
							Class417.anInt4994 = rsbitsbuffer_19.readUnsignedShort();
							Class468_Sub28.anInt7961 = rsbitsbuffer_19.readUnsignedShort();
							Class125.anInt1572 = rsbitsbuffer_19.readInt();
							Class119.aClass12_1461 = new Class12(Class125.anInt1572);
							(new Thread(Class119.aClass12_1461)).start();
							Class221.anInt2762 = rsbitsbuffer_19.readUnsignedByte();
							Class96_Sub1.anInt8307 = rsbitsbuffer_19.readUnsignedShort();
							Class440.anInt5357 = rsbitsbuffer_19.readUnsignedShort();
							Class464.aBool5556 = rsbitsbuffer_19.readUnsignedByte() == 1;
							Class84.myPlayer.displayName = Class84.myPlayer.username = RuntimeException_Sub3.aString10458 = rsbitsbuffer_19.readGJString(540818903);
							RegionMap.anInt3644 = rsbitsbuffer_19.readUnsignedByte();
							Class121.anInt1526 = rsbitsbuffer_19.readInt();
							client.aBool7323 = rsbitsbuffer_19.readUnsignedByte() == 1;
							Class448.aClass450_5421 = new Class450();
							Class448.aClass450_5421.worldId = rsbitsbuffer_19.readUnsignedShort();
							if (Class448.aClass450_5421.worldId == 65535) {
								Class448.aClass450_5421.worldId = -1;
							}
							Class448.aClass450_5421.aString5433 = rsbitsbuffer_19.readGJString(-1718279524);
							if (Class90.aClass496_952 != Class496.aClass496_5813) {
								Class448.aClass450_5421.anInt5434 = Class448.aClass450_5421.worldId * -1708079975 + 1140744768;
								Class448.aClass450_5421.anInt5437 = Class448.aClass450_5421.worldId * -1473668237 + 1047080176;
							}
							if (Class90.aClass496_952 != Class496.aClass496_5810 && (Class90.aClass496_952 != Class496.aClass496_5808 || client.rights < 2) && Class159.aClass450_2010.method7491(Class448.aClass450_5420, 240325775)) {
								Class274.method4884((byte) 74);
							}
						}
						if ((!client.aBool7224 || client.aBool7322) && !client.aBool7316) {
							try {
								Class441.method7377(Class282_Sub44.anApplet8065, "unzap", 1103714597);
							} catch (Throwable throwable_14) {
								;
							}
						} else {
							try {
								Class441.method7377(Class282_Sub44.anApplet8065, "zap", 1696424400);
							} catch (Throwable throwable_16) {
								if (client.aBool7147) {
									try {
										Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), "blank.ws"), "tbi");
									} catch (Exception exception_15) {
										;
									}
								}
							}
						}
						if (Class496.aClass496_5813 == Class90.aClass496_952) {
							Class361.aClass361_4170.method6257(1331971946);
						}
						if (Class9.lobbyStage != 273) {
							Class9.loginStage = 2;
							Class8_Sub1.method13784(2, -1482799);
							IncomingPacket.method6377(-180656847);
							Class365.setGameState(0);
							Class9.aClass184_73.aClass375_2286 = null;
							return;
						}
						Class9.loginStage = 167;
					}
					if (Class9.loginStage == 167) {
						if (!Class9.aClass184_73.method3053((byte) -128).available(3, (byte) 82)) {
							return;
						}
						Class9.aClass184_73.method3053((byte) -81).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 3, -2132354813);
						Class9.loginStage = 173;
					}
					if (Class9.loginStage == 173) {
						rsbitsbuffer_19 = Class9.aClass184_73.recievedBuffer;
						rsbitsbuffer_19.index = 0;
						if (rsbitsbuffer_19.method14869((short) -4782)) {
							if (!Class9.aClass184_73.method3053((byte) -118).available(1, (byte) 83)) {
								return;
							}
							Class9.aClass184_73.method3053((byte) -78).read(rsbitsbuffer_19.buffer, 3, 1, -1787426101);
						}
						i_3 = rsbitsbuffer_19.method14870();
						Class9.aClass184_73.aClass375_2286 = Class60.getIncommingPacket()[i_3];
						Class9.aClass184_73.anInt2287 = rsbitsbuffer_19.readUnsignedShort();
						Class9.loginStage = 156;
					}
					if (Class9.loginStage == 156) {
						if (Class9.aClass184_73.method3053((byte) -89).available(Class9.aClass184_73.anInt2287, (byte) 24)) {
							Class9.aClass184_73.method3053((byte) -99).read(Class9.aClass184_73.recievedBuffer.buffer, 0, Class9.aClass184_73.anInt2287, -1845568103);
							Class9.aClass184_73.recievedBuffer.index = 0;
							i_10 = Class9.aClass184_73.anInt2287;
							Class9.loginStage = 2;
							Class8_Sub1.method13784(2, -293580682);
							Class190.method3152((byte) 50);
							Class197.method3203(Class9.aClass184_73.recievedBuffer, (byte) 87);
							i_3 = i_10 - Class9.aClass184_73.recievedBuffer.index;
							RsBitsBuffer rsbitsbuffer_21 = new RsBitsBuffer(i_3);
							System.arraycopy(Class9.aClass184_73.recievedBuffer.buffer, Class9.aClass184_73.recievedBuffer.index, rsbitsbuffer_21.buffer, 0, i_3);
							Class9.aClass184_73.recievedBuffer.index += i_3;
							if (IncomingPacket.DYNAMIC_MAP_REGION == Class9.aClass184_73.aClass375_2286) {
								IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3155, rsbitsbuffer_21), 356381544);
							} else {
								IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3158, rsbitsbuffer_21), 1199163537);
							}
							if (Class9.aClass184_73.recievedBuffer.index != i_10) {
								throw new RuntimeException(Class9.aClass184_73.recievedBuffer.index + " " + i_10);
							}
							Class9.aClass184_73.aClass375_2286 = null;
						}
					} else if (Class9.loginStage == 196) {
						if (Class9.aClass184_73.anInt2287 == -2) {
							if (!Class9.aClass184_73.method3053((byte) -123).available(2, (byte) 42)) {
								return;
							}
							Class9.aClass184_73.method3053((byte) -35).read(Class9.aClass184_73.recievedBuffer.buffer, 0, 2, -698163042);
							Class9.aClass184_73.recievedBuffer.index = 0;
							Class9.aClass184_73.anInt2287 = Class9.aClass184_73.recievedBuffer.readUnsignedShort();
						}
						if (Class9.aClass184_73.method3053((byte) -40).available(Class9.aClass184_73.anInt2287, (byte) 74)) {
							Class9.aClass184_73.method3053((byte) -30).read(Class9.aClass184_73.recievedBuffer.buffer, 0, Class9.aClass184_73.anInt2287, -1006309637);
							Class9.aClass184_73.recievedBuffer.index = 0;
							i_10 = Class9.aClass184_73.anInt2287;
							Class9.loginStage = 2;
							Class8_Sub1.method13784(15, 481770271);
							Class501.method8350(2119490701);
							Class197.method3203(Class9.aClass184_73.recievedBuffer, (byte) 72);
							if (Class9.aClass184_73.recievedBuffer.index != i_10) {
								throw new RuntimeException(Class9.aClass184_73.recievedBuffer.index + " " + i_10);
							}
							Class9.aClass184_73.aClass375_2286 = null;
						}
					}
				}
			} catch (IOException ioexception_17) {
				Class9.aClass184_73.method3051((byte) -32);
				if (Class9.anInt104 < 3) {
					if (Class9.lobbyStage == 273) {
						Class159.aClass450_2010.method7493(-803067892);
					} else {
						Class448.aClass450_5424.method7493(1578091404);
					}
					Class9.anInt90 = 0;
					++Class9.anInt104;
					Class9.loginStage = 18;
				} else {
					Class9.loginStage = 2;
					Class8_Sub1.method13784(-4, -1690933680);
					Class361.method6270((byte) 123);
				}
			}
		}
	}
}
