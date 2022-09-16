package com.jagex;

import java.io.DataInputStream;
import java.net.URL;

public class Class151 {

	public static void decodeWorldList(boolean refresh, byte[] data) {
		if (CutsceneAction_Sub20.WORLD_LIST_BUFFER == null)
			CutsceneAction_Sub20.WORLD_LIST_BUFFER = new ByteBuf(20000);
		CutsceneAction_Sub20.WORLD_LIST_BUFFER.writeBytes(data, 0, data.length);
		if (refresh) {
			MonoStereoPreference.decodeWorldList(CutsceneAction_Sub20.WORLD_LIST_BUFFER.buffer);
			ConnectionInfo.WORLD_DESCRIPTORS_BYID = new WorldDescriptor[Class4.WORLD_LIST_SIZE];
			int i_3 = 0;
			for (int i_4 = Class485.WORLD_LIST_START; i_4 <= Class244.WORLD_LIST_SIZEPLUS1; i_4++) {
				WorldDescriptor world = WorldDescriptor.getWorld(i_4);
				if (world != null)
					ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_3++] = world;
			}
			ConnectionInfo.aBool5422 = false;
			ConnectionInfo.aLong5425 = Utils.time();
			CutsceneAction_Sub20.WORLD_LIST_BUFFER = null;
		}
	}

	static void killConnections() {
		if (!GameState.inLobby(client.GAME_STATE) && !GameState.loggedOut(client.GAME_STATE)) {
			ClanVarSettingsIndexLoader.aClass202_2883 = client.GAME_CONNECTION_CONTEXT.getConnection();
			client.GAME_CONNECTION_CONTEXT.reset();
			GameState.setGameState(GameState.UNK_10);
		} else
			CursorIndexLoader.killConnections(false);
	}

	static void method2590(IComponentDefinitions icomponentdefinitions_0) {
		if (client.IS_USE_SELECTED) {
			if (icomponentdefinitions_0.anObjectArray1393 != null) {
				IComponentDefinitions icomponentdefinitions_2 = Index.getIComponentDefinitions(client.anInt56, client.anInt7345);
				if (icomponentdefinitions_2 != null) {
					HookRequest hookrequest_3 = new HookRequest();
					hookrequest_3.source = icomponentdefinitions_0;
					hookrequest_3.aClass118_8057 = icomponentdefinitions_2;
					hookrequest_3.params = icomponentdefinitions_0.anObjectArray1393;
					CS2Executor.executeHookInner(hookrequest_3);
				}
			}
			TCPPacket tcpmessage_4 = TCPPacket.createPacket(ClientProt.IF_ON_IF, client.GAME_CONNECTION_CONTEXT.outKeys);
			tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.slotId);
			tcpmessage_4.buffer.writeShortLE(client.anInt7345);
			tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.containerItemId);
			tcpmessage_4.buffer.writeIntLE(icomponentdefinitions_0.idHash);
			tcpmessage_4.buffer.writeIntV2(client.anInt56);
			tcpmessage_4.buffer.writeShortLE(client.anInt7346);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
		}
	}

	static void method2591(IComponentDefinitions[] components, int type) {
		for (IComponentDefinitions icomponentdefinitions_4 : components) {
			if (icomponentdefinitions_4 != null) {
				if (icomponentdefinitions_4.type == ComponentType.CONTAINER) {
					if (icomponentdefinitions_4.itemSlots != null)
						method2591(icomponentdefinitions_4.itemSlots, type);
					SubInterface class282_sub44_5 = (SubInterface) client.OPEN_INTERFACES.get(icomponentdefinitions_4.idHash);
					if (class282_sub44_5 != null)
						Class383.triggerDialogAbort(class282_sub44_5.interfaceId, type);
				}
				HookRequest hookrequest_6;
				if (type == 0 && icomponentdefinitions_4.anObjectArray1421 != null) {
					hookrequest_6 = new HookRequest();
					hookrequest_6.source = icomponentdefinitions_4;
					hookrequest_6.params = icomponentdefinitions_4.anObjectArray1421;
					CS2Executor.executeHookInner(hookrequest_6);
				}
				if (type == 1 && icomponentdefinitions_4.anObjectArray1346 != null) {
					if (icomponentdefinitions_4.slotId >= 0) {
						IComponentDefinitions icomponentdefinitions_7 = IComponentDefinitions.getDefs(icomponentdefinitions_4.idHash);
						if (icomponentdefinitions_7 == null || icomponentdefinitions_7.slotChildren == null || icomponentdefinitions_4.slotId >= icomponentdefinitions_7.slotChildren.length || icomponentdefinitions_4 != icomponentdefinitions_7.slotChildren[icomponentdefinitions_4.slotId])
							continue;
					}
					hookrequest_6 = new HookRequest();
					hookrequest_6.source = icomponentdefinitions_4;
					hookrequest_6.params = icomponentdefinitions_4.anObjectArray1346;
					CS2Executor.executeHookInner(hookrequest_6);
				}
			}
		}
	}

	public static void method2594(String string_0, Throwable throwable_1) {
		try {
			String str_3 = "";
			if (throwable_1 != null)
				str_3 = ObjectAnimationCutsceneAction.method13787(throwable_1);
			if (string_0 != null) {
				if (throwable_1 != null)
					str_3 += "|";
				str_3 += string_0;
			}
			CS2Executor.printError(str_3);
			str_3 = Class475.method7926(str_3);
			if (RuntimeException_Sub3.anApplet10460 != null) {
				String str_4 = "Unknown";
				String str_5 = "1.1";
				try {
					str_4 = System.getProperty("java.vendor");
					str_5 = System.getProperty("java.version");
				} catch (Exception ignored) {
				}
				URL url_6 = new URL(RuntimeException_Sub3.anApplet10460.getCodeBase(), "clienterror.ws?c=" + RuntimeException_Sub3.anInt10457 + "&cs=" + InventoriesIndexLoader.anInt4781 + "&u=" + (RuntimeException_Sub3.MY_PLAYER_USERNAME != null ? Class475.method7926(RuntimeException_Sub3.MY_PLAYER_USERNAME) : "" + RuntimeException_Sub3.aLong10459) + "&v1=" + Class475.method7926(str_4) + "&v2=" + Class475.method7926(str_5) + "&e=" + str_3);
				DataInputStream datainputstream_7 = new DataInputStream(url_6.openStream());
				datainputstream_7.read();
				datainputstream_7.close();
			}
		} catch (Exception exception_9) {
			exception_9.printStackTrace();
		}
	}

	public Class464 aClass464_1961 = new Class464();
}
