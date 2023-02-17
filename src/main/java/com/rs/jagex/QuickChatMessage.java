package com.rs.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class QuickChatMessage {

	static NodeCollection aClass482_4049;
	public static byte[] method6154(Object object_0, boolean bool_1) {
		if (object_0 == null)
			return null;
		if (object_0 instanceof byte[] bytes_5) {
			return bool_1 ? Arrays.copyOf(bytes_5, bytes_5.length) : bytes_5;
		} else if (object_0 instanceof ByteBuffer bytebuffer_3) {
			byte[] bytes_4 = new byte[bytebuffer_3.capacity()];
			bytebuffer_3.position(0);
			bytebuffer_3.get(bytes_4);
			return bytes_4;
		} else
			throw new IllegalArgumentException();
	}
	public static CutsceneActionType method6156(int i_0) {
		CutsceneActionType[] arr_2 = HashTableIterator.method7519();
		CutsceneActionType[] arr_3 = arr_2;
		for (CutsceneActionType class411_5 : arr_3) {
			if (i_0 == class411_5.anInt4957)
				return class411_5;
		}
		return null;
	}

	static String method6157(IComponentDefinitions icomponentdefinitions_0) {
		return client.getIComponentSettings(icomponentdefinitions_0).getUseOptionFlags() == 0 ? null : (icomponentdefinitions_0.useOptionString != null && !icomponentdefinitions_0.useOptionString.trim().isEmpty() ? icomponentdefinitions_0.useOptionString : (client.aBool7168 ? "Hidden-use" : null));
	}

	public static void method6159(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_6 = i_2 - i_0;
		int i_7 = i_3 - i_1;
		if (i_6 == 0) {
			if (i_7 != 0)
				IdleAnimationsPreference.method12746(i_0, i_1, i_3, i_4);
		} else if (i_7 == 0)
			CS2Executor.method11250(i_0, i_2, i_1, i_4);
		else {
			int i_8 = (i_7 << 12) / i_6;
			int i_9 = i_1 - (i_0 * i_8 >> 12);
			int i_10;
			int i_11;
			if (i_0 < Class532.anInt7071) {
				i_10 = (i_8 * Class532.anInt7071 >> 12) + i_9;
				i_11 = Class532.anInt7071;
			} else if (i_0 > Class532.anInt7069) {
				i_10 = (i_8 * Class532.anInt7069 >> 12) + i_9;
				i_11 = Class532.anInt7069;
			} else {
				i_10 = i_1;
				i_11 = i_0;
			}
			int i_12;
			int i_13;
			if (i_2 < Class532.anInt7071) {
				i_12 = (i_8 * Class532.anInt7071 >> 12) + i_9;
				i_13 = Class532.anInt7071;
			} else if (i_2 > Class532.anInt7069) {
				i_12 = (i_8 * Class532.anInt7069 >> 12) + i_9;
				i_13 = Class532.anInt7069;
			} else {
				i_12 = i_3;
				i_13 = i_2;
			}
			if (i_10 < Class532.anInt7070) {
				i_10 = Class532.anInt7070;
				i_11 = (Class532.anInt7070 - i_9 << 12) / i_8;
			} else if (i_10 > Class532.anInt7068) {
				i_10 = Class532.anInt7068;
				i_11 = (Class532.anInt7068 - i_9 << 12) / i_8;
			}
			if (i_12 < Class532.anInt7070) {
				i_12 = Class532.anInt7070;
				i_13 = (Class532.anInt7070 - i_9 << 12) / i_8;
			} else if (i_12 > Class532.anInt7068) {
				i_12 = Class532.anInt7068;
				i_13 = (Class532.anInt7068 - i_9 << 12) / i_8;
			}
			AnimationIndexLoader.method11220(i_11, i_10, i_13, i_12, i_4);
		}
	}

	static void method6160() {
		Login.setLobbyStage(LobbyStage.LOGGING_IN_LOBBY);
		Class9.CURRENT_CONNECTION_CONTEXT = client.LOBBY_CONNECTION_CONTEXT;
		if (client.aByteArray7152 != null) {
			ByteBuf rsbytebuffer_1 = new ByteBuf(client.aByteArray7152);
			Class9.aLong77 = rsbytebuffer_1.readLong();
			Class9.aLong86 = rsbytebuffer_1.readLong();
		}
		if (Class9.aLong77 < 0L)
			FontRenderer_Sub1.method13784(35);
		else
			Class455.method7558(false, true, "", "", Class9.aLong77);
	}

	static void method6161(boolean bool_0) {
		if (bool_0) {
			if (client.BASE_WINDOW_ID != -1)
				Class337.unloadInterface(client.BASE_WINDOW_ID);
			for (SubInterface class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7750(); class282_sub44_2 != null; class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7751()) {
				if (!class282_sub44_2.linked()) {
					class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7750();
					if (class282_sub44_2 == null)
						break;
				}
				Class351.closeChildren(class282_sub44_2, true, false);
			}
			client.BASE_WINDOW_ID = -1;
			client.OPEN_INTERFACES = new IterableNodeMap(8);
			MeshModifier.method7041();
			client.BASE_WINDOW_ID = QuickchatFiller.ENTITY_DEFAULTS.lobbyWindow;
			Class516.method8867(false);
			Static.method6378();
			Class150.method2582(client.BASE_WINDOW_ID, null);
		}
		Class9.aBool71 = true;
	}

	public int[] anIntArray4046;

	public QuickchatMessageDefinitions qcMessageDefs;

	public int qcMessageId;
}
