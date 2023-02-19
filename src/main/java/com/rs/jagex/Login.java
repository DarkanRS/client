package com.rs.jagex;

import com.rs.jagex.clans.settings.ChangeClanSetting;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Login {
	private static LoginStage loginStage = LoginStage.NONE_2;
	private static LobbyStage lobbyStage = LobbyStage.LOGGED_OUT;

	public static void setLoginStage(LoginStage loginStage) {
		System.out.println("Login stage: " + Login.loginStage + " -> " + loginStage);
		Login.loginStage = loginStage;
	}

	public static LoginStage getLoginStage() {
		return loginStage;
	}

	public static LobbyStage getLobbyStage() {
		return lobbyStage;
	}

	public static void setLobbyStage(LobbyStage lobbyStage) {
		System.out.println("Lobby stage: " + Login.lobbyStage + " -> " + lobbyStage);
		Login.lobbyStage = lobbyStage;
	}

	static void handleAccountCreationLogin() {
		if (Class192.ACCOUNT_CREATION_STAGE != null) {
			try {
				short s_1;
				if (Class14.anInt134 == 0)
					s_1 = 250;
				else
					s_1 = 2000;

				++Class14.anInt133;
				if (Class14.anInt133 > s_1)
					Class5.method297();

				int rsaIndex;
				if (Class192.ACCOUNT_CREATION_STAGE == AccountCreationStage.REQUEST) {
					client.LOBBY_CONNECTION_CONTEXT.init(SunDefinitions.createAsyncConnection(ConnectionInfo.LOBBY_CONNECTION_INFO.createSocket(), 15000), ConnectionInfo.LOBBY_CONNECTION_INFO.host);
					client.LOBBY_CONNECTION_CONTEXT.clearAllQueuedPackets();
					TCPPacket packet = TCPPacket.create();
					packet.buffer.writeByte(LoginProt.CREATE_ACCOUNT_CONNECT.id);
					packet.buffer.writeShort(0);
					rsaIndex = packet.buffer.index;
					packet.buffer.writeShort(727);
					packet.buffer.writeShort(1);
					Class14.ACCOUNT_CREATION_ISAAC_KEYS = ProcessorSpecs.method7725(packet);
					int i_4 = packet.buffer.index;
					packet.buffer.writeString(client.aString7164);
					packet.buffer.writeShort(client.AFFILIATE);
					packet.buffer.writeLong(client.aLong7153);
					packet.buffer.writeString(Class464.aString5555);
					packet.buffer.writeByte(Class223.CURRENT_LANGUAGE.getValue());
					packet.buffer.writeByte(client.CURRENT_GAME.id);
					IdentiKitIndexLoader.method809(packet.buffer);
					String string_5 = client.aString7156;
					packet.buffer.writeByte(string_5 == null ? 0 : 1);
					if (string_5 != null)
						packet.buffer.writeString(string_5);

					Class11.SYSTEM_INFO.writeMachineInformation(packet.buffer);
					packet.buffer.index += 7;
					packet.buffer.encryptWithXtea(Class14.ACCOUNT_CREATION_ISAAC_KEYS, i_4, packet.buffer.index);
					packet.buffer.writeLength(packet.buffer.index - rsaIndex);
					client.LOBBY_CONNECTION_CONTEXT.queuePacket(packet);
					client.LOBBY_CONNECTION_CONTEXT.flush();
					Class192.ACCOUNT_CREATION_STAGE = AccountCreationStage.RESPONSE;
				}

				if (AccountCreationStage.RESPONSE == Class192.ACCOUNT_CREATION_STAGE) {
					if (client.LOBBY_CONNECTION_CONTEXT.getConnection() == null)
						Class5.method297();
					else if (client.LOBBY_CONNECTION_CONTEXT.getConnection().available(1)) {
						client.LOBBY_CONNECTION_CONTEXT.getConnection().read(client.LOBBY_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
						CutsceneAction_Sub9.RECIEVED_RESPONSE = (AccountCreationResponseOpcodes) Class386.identify(Interface.method1626(), client.LOBBY_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff);
						if (CutsceneAction_Sub9.RECIEVED_RESPONSE == AccountCreationResponseOpcodes.CONTINUE) {
							client.LOBBY_CONNECTION_CONTEXT.outKeys = new ISAACCipher(Class14.ACCOUNT_CREATION_ISAAC_KEYS);
							int[] ints_8 = new int[4];

							for (rsaIndex = 0; rsaIndex < 4; rsaIndex++)
								ints_8[rsaIndex] = Class14.ACCOUNT_CREATION_ISAAC_KEYS[rsaIndex] + 50;
							client.LOBBY_CONNECTION_CONTEXT.inKeys = new ISAACCipher(ints_8);
							client.LOBBY_CONNECTION_CONTEXT.recievedBuffer.setIsaacCipher(client.LOBBY_CONNECTION_CONTEXT.inKeys);
							GameState.setGameState(GameState.IN_ACCOUNT_CREATION);
							client.LOBBY_CONNECTION_CONTEXT.clearAllQueuedPackets();
							client.LOBBY_CONNECTION_CONTEXT.recievedBuffer.index = 0;
							client.LOBBY_CONNECTION_CONTEXT.lastPacket = null;
							client.LOBBY_CONNECTION_CONTEXT.secondLastPacket = null;
							client.LOBBY_CONNECTION_CONTEXT.thirdLastPacket = null;
							client.LOBBY_CONNECTION_CONTEXT.idleReadPulses = 0;
						} else
							client.LOBBY_CONNECTION_CONTEXT.end();

						client.LOBBY_CONNECTION_CONTEXT.currentPacket = null;
						Class192.ACCOUNT_CREATION_STAGE = null;
					}
				}
			} catch (IOException ex) {
				Class5.method297();
			}
		}
	}

	static void pulseLogin() {
		if (getLoginStage() != LoginStage.NONE_2 && getLoginStage() != LoginStage.UNK9_105) {
			try {
				short s_1;
				if (Class9.anInt104 == 0)
					s_1 = 250;
				else
					s_1 = 2000;
				if (Class9.socialNetworkLogin && getLoginStage().ordinal() >= LoginStage.UNK5_65.ordinal())
					s_1 = 6000;
				if (getLobbyStage() != LobbyStage.LOBBY_TO_WORLD || getLoginStage() != LoginStage.UNK19_201 && Class9.anInt106 != 42)
					++Class9.anInt90;
				if (Class9.anInt90 > s_1) {
					Class9.CURRENT_CONNECTION_CONTEXT.end();
					if (Class9.anInt104 >= 3) {
						setLoginStage(LoginStage.NONE_2);
						FontRenderer_Sub1.method13784(-5);
						return;
					}
					if (getLobbyStage() == LobbyStage.LOBBY_TO_WORLD)
						ConnectionInfo.GAME_CONNECTION_INFO.swap();
					else
						ConnectionInfo.LOBBY_CONNECTION_INFO.swap();
					Class9.anInt90 = 0;
					++Class9.anInt104;
					setLoginStage(LoginStage.UNK1_18);
				}
				TCPPacket tcpmessage_2;
				int i_3;
				int i_5;
				if (getLoginStage() == LoginStage.UNK1_18) {
					if (getLobbyStage() == LobbyStage.LOBBY_TO_WORLD)
						Class9.CURRENT_CONNECTION_CONTEXT.init(SunDefinitions.createAsyncConnection(ConnectionInfo.GAME_CONNECTION_INFO.createSocket(), 15000), ConnectionInfo.GAME_CONNECTION_INFO.host);
					else
						Class9.CURRENT_CONNECTION_CONTEXT.init(SunDefinitions.createAsyncConnection(ConnectionInfo.LOBBY_CONNECTION_INFO.createSocket(), 15000), ConnectionInfo.LOBBY_CONNECTION_INFO.host);
					Class9.CURRENT_CONNECTION_CONTEXT.clearAllQueuedPackets();
					tcpmessage_2 = TCPPacket.create();
					if (Class9.socialNetworkLogin) {
						tcpmessage_2.buffer.writeByte(LoginProt.INIT_SOCIAL_NETWORK_CONNECTION.id);
						tcpmessage_2.buffer.writeShort(0);
						i_3 = tcpmessage_2.buffer.index;
						tcpmessage_2.buffer.writeInt(727);
						tcpmessage_2.buffer.writeInt(1);
						if (getLobbyStage() == LobbyStage.LOBBY_TO_WORLD)
							tcpmessage_2.buffer.writeByte(client.GAME_STATE == GameState.UNK_10 ? 1 : 0);
						ByteBuf rsbytebuffer_4 = Class94.method1587();
						rsbytebuffer_4.writeByte(Class9.anInt76);
						rsbytebuffer_4.writeShort((int) (Math.random() * 9.9999999E7D));
						rsbytebuffer_4.writeByte(Class223.CURRENT_LANGUAGE.getValue());
						rsbytebuffer_4.writeInt(client.AFFILIATE);
						for (i_5 = 0; i_5 < 6; i_5++)
							rsbytebuffer_4.writeInt((int) (Math.random() * 9.9999999E7D));
						rsbytebuffer_4.writeLong(client.aLong7409);
						rsbytebuffer_4.writeByte(client.CURRENT_GAME.id);
						rsbytebuffer_4.writeByte((int) (Math.random() * 9.9999999E7D));
						rsbytebuffer_4.applyRSA();
						tcpmessage_2.buffer.writeBytes(rsbytebuffer_4.buffer, 0, rsbytebuffer_4.index);
						tcpmessage_2.buffer.writeLength(tcpmessage_2.buffer.index - i_3);
					} else
						tcpmessage_2.buffer.writeByte(LoginProt.INIT_GAME_CONNECTION.id);
					Class9.CURRENT_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
					Class9.CURRENT_CONNECTION_CONTEXT.flush();
					setLoginStage(LoginStage.UNK2_35);
				}
				int i_10;
				if (getLoginStage() == LoginStage.UNK2_35) {
					if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1))
						return;
					Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
					i_10 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff;
					if (i_10 != 0) {
						setLoginStage(LoginStage.NONE_2);
						FontRenderer_Sub1.method13784(i_10);
						Class9.CURRENT_CONNECTION_CONTEXT.end();
						Class361.method6270();
						return;
					}
					if (Class9.socialNetworkLogin)
						setLoginStage(LoginStage.UNK3_46);
					else
						setLoginStage(LoginStage.UNK7_80);
				}
				if (getLoginStage() == LoginStage.UNK3_46) {
					if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(2))
						return;
					Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 2);
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.readUnsignedShort();
					setLoginStage(LoginStage.UNK4_57);
				}
				if (getLoginStage() == LoginStage.UNK4_57) {
					if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index))
						return;
					Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index);
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.encryptXtea(Class500.ISAAC_SEED);
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
					String string_18 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.readGJString();
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
					String string_11 = Class361.aClass361_4176.method6253();
					if (!client.aBool7310 || !Class186.method3082(string_18, 1, string_11))
						PingRequester.method8736(string_18, true, string_11, client.aBool7158);
					setLoginStage(LoginStage.UNK5_65);
				}
				if (getLoginStage() == LoginStage.UNK5_65) {
					if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1))
						return;
					Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
					if ((Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff) == 1)
						setLoginStage(LoginStage.UNK6_75);
				}
				if (getLoginStage() == LoginStage.UNK6_75) {
					if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(16))
						return;
					Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 16);
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 16;
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.encryptXtea(Class500.ISAAC_SEED);
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
					Class9.aLong77 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.readLong();
					Class9.aLong86 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.readLong();
					setLoginStage(LoginStage.UNK7_80);
				}
				ByteBuf.Bit rsBB;
				if (getLoginStage() == LoginStage.UNK7_80) {
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
					Class9.CURRENT_CONNECTION_CONTEXT.clearAllQueuedPackets();
					tcpmessage_2 = TCPPacket.create();
					rsBB = tcpmessage_2.buffer;
					int i_6;
					ByteBuf rsbytebuffer_7;
					LoginProt opcode;
					if (getLobbyStage() == LobbyStage.LOBBY_TO_WORLD) {
						if (Class9.socialNetworkLogin)
							opcode = LoginProt.SOCIAL_NETWORK_LOGIN;
						else
							opcode = LoginProt.GAMELOGIN;
						rsBB.writeByte(opcode.id);
						rsBB.writeShort(0);
						i_5 = rsBB.index;
						i_6 = rsBB.index;
						if (!Class9.socialNetworkLogin) {
							rsBB.writeInt(727);
							rsBB.writeInt(1);
							rsBB.writeByte(client.GAME_STATE == GameState.UNK_10 ? 1 : 0);
							i_6 = rsBB.index;
							rsbytebuffer_7 = ChatLine.getLoginMod(false);
							rsBB.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
							i_6 = rsBB.index;
							rsBB.writeByte(Class9.aLong77 == -1L ? 1 : 0);
							if (Class9.aLong77 == -1L)
								rsBB.writeString(Class9.aString99);
							else
								rsBB.writeLong(Class9.aLong77);
						}
						rsBB.writeByte(Class158.getScreenMode());
						rsBB.writeShort(ChangeClanSetting.BASE_WINDOW_WIDTH);
						rsBB.writeShort(Engine.BASE_WINDOW_HEIGHT * -969250379);
						rsBB.writeByte(Class393.preferences.aPreference_Sub4_8223.method12641());
						IdentiKitIndexLoader.method809(rsBB);
						rsBB.writeString(client.aString7281);
						rsBB.writeInt(client.AFFILIATE);
						rsbytebuffer_7 = Class393.preferences.encode();
						rsBB.writeByte(rsbytebuffer_7.index);
						rsBB.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
						client.aBool7175 = true;
						ByteBuf rsbytebuffer_8 = new ByteBuf(Class11.SYSTEM_INFO.method13454());
						Class11.SYSTEM_INFO.writeMachineInformation(rsbytebuffer_8);
						rsBB.writeBytes(rsbytebuffer_8.buffer, 0, rsbytebuffer_8.buffer.length);
						rsBB.writeInt(client.anInt7221);
						rsBB.writeLong(client.aLong7153);
						rsBB.writeString(Class464.aString5555);
						rsBB.writeByte(client.aString7156 == null ? 0 : 1);
						if (client.aString7156 != null)
							rsBB.writeString(client.aString7156);
						rsBB.writeByte(IndexLoaders.NATIVE_LIBRARY_LOADER.hasTheoraLibrary() ? 1 : 0);
						rsBB.writeByte(client.aBool7310 ? 1 : 0);
						rsBB.writeByte(client.aBool7160 ? 1 : 0);
						rsBB.writeByte(BASDefinitions.anInt2831);
						rsBB.writeInt(client.anInt7163);
						rsBB.writeString(client.aString7164);
						rsBB.writeByte(ConnectionInfo.NEWS_CONNECTION_INFO != null && ConnectionInfo.GAME_CONNECTION_INFO.worldId == ConnectionInfo.NEWS_CONNECTION_INFO.worldId ? 0 : 1);
						int i_9 = ConnectionInfo.GAME_CONNECTION_INFO.worldId;
						rsBB.writeInt(i_9);
						QuestDefinitions.writeCRCs(rsBB);
					} else {
						if (Class9.socialNetworkLogin)
							opcode = LoginProt.SOCIAL_NETWORK_LOGIN;
						else
							opcode = LoginProt.LOBBYLOGIN;
						rsBB.writeByte(opcode.id);
						rsBB.writeShort(0);
						i_5 = rsBB.index;
						i_6 = rsBB.index;
						if (!Class9.socialNetworkLogin) {
							rsBB.writeInt(727);
							rsBB.writeInt(1);
							rsbytebuffer_7 = ChatLine.getLoginMod(true);
							rsBB.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
							i_6 = rsBB.index;
							rsBB.writeByte(Class9.aLong77 == -1L ? 1 : 0);
							if (Class9.aLong77 == -1L)
								rsBB.writeString(Class9.aString99);
							else
								rsBB.writeLong(Class9.aLong77);
						}
						rsBB.writeByte(client.CURRENT_GAME.id);
						rsBB.writeByte(Class223.CURRENT_LANGUAGE.getValue());
						IdentiKitIndexLoader.method809(rsBB);
						rsBB.writeString(client.aString7281);
						rsbytebuffer_7 = Class393.preferences.encode();
						rsBB.writeByte(rsbytebuffer_7.index);
						rsBB.writeBytes(rsbytebuffer_7.buffer, 0, rsbytebuffer_7.index);
						rsBB.writeString(Class464.aString5555);
						rsBB.writeInt(client.AFFILIATE);
						rsBB.writeInt(client.anInt7163);
						rsBB.writeString(client.aString7164);
						QuestDefinitions.writeCRCs(rsBB);
					}
					rsBB.encryptWithXtea(Class500.ISAAC_SEED, i_6, rsBB.index);
					rsBB.writeLength(rsBB.index - i_5);
					Class9.CURRENT_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
					Class9.CURRENT_CONNECTION_CONTEXT.flush();
					Class9.CURRENT_CONNECTION_CONTEXT.outKeys = new ISAACCipher(Class500.ISAAC_SEED);
					for (int i_12 = 0; i_12 < 4; i_12++)
						Class500.ISAAC_SEED[i_12] += 50;
					Class9.CURRENT_CONNECTION_CONTEXT.inKeys = new ISAACCipher(Class500.ISAAC_SEED);
					new ISAACCipher(Class500.ISAAC_SEED);
					Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.setIsaacCipher(Class9.CURRENT_CONNECTION_CONTEXT.inKeys);
					Class500.ISAAC_SEED = null;
					setLoginStage(LoginStage.UNK8_97);
				}
				if (getLoginStage() == LoginStage.UNK8_97) {
					if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1))
						return;
					Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
					i_10 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff;
					if (i_10 == 21)
						setLoginStage(LoginStage.UNK11_128);
					else if (i_10 != 29 && i_10 != 45) {
						if (i_10 == 1) {
							setLoginStage(LoginStage.UNK9_105);
							FontRenderer_Sub1.method13784(1);
							return;
						}
						if (i_10 == 2)
							setLoginStage(LoginStage.UNK12_133);
						else {
							if (i_10 != 15)
								if (i_10 == 23 && Class9.anInt104 < 3) {
									Class9.anInt90 = 0;
									++Class9.anInt104;
									setLoginStage(LoginStage.UNK1_18);
									Class9.CURRENT_CONNECTION_CONTEXT.end();
									return;
								} else if (i_10 == 42) {
									setLoginStage(LoginStage.UNK19_201);
									FontRenderer_Sub1.method13784(42);
									return;
								} else {
									if (Class9.aBool74 && !Class9.socialNetworkLogin && Class9.anInt76 != -1 && i_10 == 35) {
										Class9.socialNetworkLogin = true;
										Class9.anInt90 = 0;
										setLoginStage(LoginStage.UNK1_18);
										Class9.CURRENT_CONNECTION_CONTEXT.end();
									} else {
										setLoginStage(LoginStage.NONE_2);
										FontRenderer_Sub1.method13784(i_10);
										Class9.CURRENT_CONNECTION_CONTEXT.end();
										Class361.method6270();
									}
									return;
								}
							Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize = -2;
							setLoginStage(LoginStage.UNK18_196);
						}
					} else {
						Class110.anInt1105 = i_10;
						setLoginStage(LoginStage.UNK17_180);
					}
				}
				if (getLoginStage() == LoginStage.UNK10_115) {
					Class9.CURRENT_CONNECTION_CONTEXT.clearAllQueuedPackets();
					tcpmessage_2 = TCPPacket.create();
					rsBB = tcpmessage_2.buffer;
					rsBB.setIsaacCipher(Class9.CURRENT_CONNECTION_CONTEXT.outKeys);
					rsBB.writeIsaacByte(LoginProt.GAMELOGIN_CONTINUE.id);
					Class9.CURRENT_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
					Class9.CURRENT_CONNECTION_CONTEXT.flush();
					setLoginStage(LoginStage.UNK8_97);
				} else if (getLoginStage() == LoginStage.UNK11_128) {
					if (Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1)) {
						Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
						i_10 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff;
						Class9.anInt103 = i_10 * 50;
						setLoginStage(LoginStage.NONE_2);
						FontRenderer_Sub1.method13784(21);
						Class9.CURRENT_CONNECTION_CONTEXT.end();
						Class361.method6270();
					}
				} else if (getLoginStage() == LoginStage.UNK19_201) {
					if (Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(2)) {
						Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 2);
						Class9.anInt113 = ((Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff) << 8) + (Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[1] & 0xff);
						setLoginStage(LoginStage.UNK8_97);
					}
				} else if (getLoginStage() == LoginStage.UNK17_180) {
					if (Class110.anInt1105 == 29) {
						if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1))
							return;
						Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
						Class9.anInt112 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff;
					} else {
						if (Class110.anInt1105 != 45)
							throw new IllegalStateException();
						if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(3))
							return;
						Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 3);
						Class9.anInt112 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff;
						Class9.anInt94 = (Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[2] & 0xff) + ((Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[1] & 0xff) << 8);
					}
					setLoginStage(LoginStage.NONE_2);
					FontRenderer_Sub1.method13784(Class110.anInt1105);
					Class9.CURRENT_CONNECTION_CONTEXT.end();
					Class361.method6270();
				} else if (getLoginStage() == LoginStage.UNK12_133) {
					if (Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1)) {
						Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 1);
						VarNPCMap.anInt1965 = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer[0] & 0xff;
						setLoginStage(LoginStage.UNK13_140);
					}
				} else {
					ByteBuf.Bit buffer;
					if (getLoginStage() == LoginStage.UNK13_140) {
						buffer = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer;
						if (getLobbyStage() == LobbyStage.LOBBY_TO_WORLD) {
							if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(VarNPCMap.anInt1965))
								return;
							Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(buffer.buffer, 0, VarNPCMap.anInt1965);
							buffer.index = 0;
							client.PLAYER_RIGHTS = buffer.readUnsignedByte();
							client.PLAYER_MOD_LEVEL = buffer.readUnsignedByte();
							client.USERDETAIL_QUICKCHAT = buffer.readUnsignedByte() == 1;
							client.VERIFIED_EMAIL_ADDRESS = buffer.readUnsignedByte() == 1;
							client.aBool7322 = buffer.readUnsignedByte() == 1;
							client.IS_QUICKCHAT_ONLY = buffer.readUnsignedByte() == 1;
							client.myPlayerIndex = buffer.readUnsignedShort();
							client.IS_MEMBER = buffer.readUnsignedByte() == 1;
							Class504.PLAYER_DOB = buffer.read24BitInteger();
							client.membersWorld = buffer.readUnsignedByte() == 1;
							RenderFlagMap.aString3643 = buffer.readString();
							IndexLoaders.MAP_REGION_DECODER.method4436().method7912(client.membersWorld);
							IndexLoaders.MAP_REGION_LOADER_THREAD.method6052().method4436().method7912(client.membersWorld);
							IndexLoaders.ITEM_LOADER.method7148(client.membersWorld);
							IndexLoaders.NPC_INDEX_LOADER.method6847(client.membersWorld);
						} else {
							if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(VarNPCMap.anInt1965))
								return;
							Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(buffer.buffer, 0, VarNPCMap.anInt1965);
							buffer.index = 0;
							client.PLAYER_RIGHTS = buffer.readUnsignedByte();
							client.PLAYER_MOD_LEVEL = buffer.readUnsignedByte();
							client.USERDETAIL_QUICKCHAT = buffer.readUnsignedByte() == 1;
							Class504.PLAYER_DOB = buffer.read24BitInteger();
							VertexNormal.MY_PLAYER.male = (byte) buffer.readUnsignedByte();
							client.VERIFIED_EMAIL_ADDRESS = buffer.readUnsignedByte() == 1;
							client.aBool7322 = buffer.readUnsignedByte() == 1;
							SongReference.MEMBERSHIP_END = buffer.readLong();
							Class43.aLong420 = SongReference.MEMBERSHIP_END - Utils.time() - buffer.read5ByteInteger();
							i_3 = buffer.readUnsignedByte();
							client.IS_MEMBER = (i_3 & 0x1) != 0;
							CS2ReturnValue.IS_MEMBER_SUBSCRIPTION = (i_3 & 0x2) != 0;
							Class354.JCOINS = buffer.readInt();
							Class469.LOYALTY_ENABLED = buffer.readUnsignedByte() == 1;
							KeyHoldInputSubscriber.LOYALTY_BALANCE = buffer.readInt();
							Class115.RECOVERYQUESTIONSSETDATE = buffer.readUnsignedShort();
							NPCMeshModifier.MESSAGES = buffer.readUnsignedShort();
							Preference_Sub28.LASTLOGINLDAY = buffer.readUnsignedShort();
							Class125.LAST_IP_ADDRESS = buffer.readInt();
							Static.LOBBY_AUTH_TOKEN = buffer.readString();
							Class119.HOSTNAME_IDENTIFIER = new HostNameIdentifier(Class125.LAST_IP_ADDRESS);
							(new Thread(Class119.HOSTNAME_IDENTIFIER)).start();
							InputSubscriberType.EMAIL_STATUS = buffer.readUnsignedByte();
							SendFinishedCutsceneAction.anInt8307 = buffer.readUnsignedShort();
							UID192.anInt5357 = buffer.readUnsignedShort();
							Class464.aBool5556 = buffer.readUnsignedByte() == 1;
							VertexNormal.MY_PLAYER.displayName = VertexNormal.MY_PLAYER.username = RuntimeException_Sub3.MY_PLAYER_USERNAME = buffer.readGJString();
							RenderFlagMap.anInt3644 = buffer.readUnsignedByte();
							Class121.anInt1526 = buffer.readInt();
							client.aBool7323 = buffer.readUnsignedByte() == 1;
							ConnectionInfo.NEWS_CONNECTION_INFO = new ConnectionInfo();
							ConnectionInfo.NEWS_CONNECTION_INFO.worldId = buffer.readUnsignedShort();
							if (ConnectionInfo.NEWS_CONNECTION_INFO.worldId == 65535)
								ConnectionInfo.NEWS_CONNECTION_INFO.worldId = -1;
							ConnectionInfo.NEWS_CONNECTION_INFO.host = buffer.readGJString();
							if (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.LIVE) {
								ConnectionInfo.NEWS_CONNECTION_INFO.anInt5434 = ConnectionInfo.NEWS_CONNECTION_INFO.worldId;
								ConnectionInfo.NEWS_CONNECTION_INFO.anInt5437 = ConnectionInfo.NEWS_CONNECTION_INFO.worldId;
							}
							if (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.LOCAL && (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.WTQA || client.PLAYER_RIGHTS < 2) && ConnectionInfo.GAME_CONNECTION_INFO.equals(ConnectionInfo.JS5_CONNECTION_INFO))
								GameDetails.method4884();
						}
						if (ConnectionInfo.SERVER_ENVIRONMENT == ServerEnvironment.LIVE)
							Class361.aClass361_4170.method6257();
						if (getLobbyStage() != LobbyStage.LOBBY_TO_WORLD) {
							setLoginStage(LoginStage.NONE_2);
							FontRenderer_Sub1.method13784(2);
							Static.method6377();
							GameState.setGameState(GameState.UNK_0);
							Class9.CURRENT_CONNECTION_CONTEXT.currentPacket = null;
							return;
						}
						setLoginStage(LoginStage.UNK15_167);
					}
					if (getLoginStage() == LoginStage.UNK15_167) {
						if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(3))
							return;
						Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 3);
						setLoginStage(LoginStage.UNK16_173);
					}
					if (getLoginStage() == LoginStage.UNK16_173) {
						buffer = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer;
						buffer.index = 0;
						if (buffer.peekIsIsaacSmart()) {
							if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(1))
								return;
							Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(buffer.buffer, 3, 1);
						}
						i_3 = buffer.readEncryptedSmart();
						Class9.CURRENT_CONNECTION_CONTEXT.currentPacket = ServerProt.forId(i_3);
						Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize = buffer.readUnsignedShort();
						setLoginStage(LoginStage.UNK14_157);
					}
					if (getLoginStage() == LoginStage.UNK14_157) {
						if (Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize)) {
							Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize);
							Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
							i_10 = Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize;
							setLoginStage(LoginStage.NONE_2);
							FontRenderer_Sub1.method13784(2);
							Class190.method3152();
							Class197.readLSWP(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer);
							i_3 = i_10 - Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index;
							ByteBuf.Bit rsbitsbuffer_21 = new ByteBuf.Bit(i_3);
							System.arraycopy(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index, rsbitsbuffer_21.buffer, 0, i_3);
							Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index += i_3;
							if (Class9.CURRENT_CONNECTION_CONTEXT.currentPacket == ServerProt.DYNAMIC_MAP_REGION)
								IndexLoaders.MAP_REGION_DECODER.loadMapScene(new Class335(RegionLoadType.aRegionLoadType_3155, rsbitsbuffer_21));
							else
								IndexLoaders.MAP_REGION_DECODER.loadMapScene(new Class335(RegionLoadType.LOAD_MAP_SCENE_NORMAL, rsbitsbuffer_21));
							if (Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index != i_10)
								throw new RuntimeException(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index + " " + i_10);
							Class9.CURRENT_CONNECTION_CONTEXT.currentPacket = null;
						}
					} else if (getLoginStage() == LoginStage.UNK18_196) {
						if (Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize == -2) {
							if (!Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(2))
								return;
							Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, 2);
							Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
							Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize = Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.readUnsignedShort();
						}
						if (Class9.CURRENT_CONNECTION_CONTEXT.getConnection().available(Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize)) {
							Class9.CURRENT_CONNECTION_CONTEXT.getConnection().read(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.buffer, 0, Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize);
							Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
							i_10 = Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize;
							setLoginStage(LoginStage.NONE_2);
							FontRenderer_Sub1.method13784(15);
							Class501.method8350();
							Class197.readLSWP(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer);
							if (Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index != i_10)
								throw new RuntimeException(Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index + " " + i_10);
							Class9.CURRENT_CONNECTION_CONTEXT.currentPacket = null;
						}
					}
				}
			} catch (IOException ioexception_17) {
				Class9.CURRENT_CONNECTION_CONTEXT.end();
				if (Class9.anInt104 < 3) {
					if (getLobbyStage() == LobbyStage.LOBBY_TO_WORLD)
						ConnectionInfo.GAME_CONNECTION_INFO.swap();
					else
						ConnectionInfo.LOBBY_CONNECTION_INFO.swap();
					Class9.anInt90 = 0;
					++Class9.anInt104;
					setLoginStage(LoginStage.UNK1_18);
				} else {
					setLoginStage(LoginStage.NONE_2);
					FontRenderer_Sub1.method13784(-4);
					Class361.method6270();
				}
			}
		}
	}

	public List<Class285> aList3388 = new LinkedList<>();

	boolean aBool3386;

	int anInt3387;

	int anInt3385;

	Login() {
		aBool3386 = false;
	}

	public void method5012() {
		Iterator<Class285> iterator_2 = aList3388.iterator();
		while (iterator_2.hasNext()) {
			Class285 class285_3 = iterator_2.next();
			iterator_2.remove();
			Class279.method4969(class285_3);
		}
	}

	void method5013(Class285 class285_1) {
		GraphNode_Sub1 class521_sub1_3 = class285_1.aTransform_Sub1_3391;
		boolean bool_4 = true;
		EntityNode_Sub5[] arr_5 = class285_1.aTransform_Sub1_3391.boundingBoxPolygons;
		for (EntityNode_Sub5 element : arr_5)
			if (element.aBool7849) {
				bool_4 = false;
				break;
			}
		if (!bool_4) {
			class285_1.aClass284_3393 = this;
			Class285 class285_7;
			if (aBool3386) {
				Iterator<Class285> iterator_8 = aList3388.iterator();
				while (iterator_8.hasNext()) {
					class285_7 = iterator_8.next();
					if (class521_sub1_3 == class285_7.aTransform_Sub1_3391) {
						iterator_8.remove();
						Class279.method4969(class285_7);
					}
				}
			}
			ListIterator<Class285> listiterator_9 = aList3388.listIterator();
			while (listiterator_9.hasNext()) {
				class285_7 = listiterator_9.next();
				if (class521_sub1_3.anInt7969 >= class285_7.aTransform_Sub1_3391.anInt7969) {
					listiterator_9.previous();
					listiterator_9.add(class285_1);
					return;
				}
			}
			aList3388.add(class285_1);
		}
	}
}
