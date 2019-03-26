import java.io.DataInputStream;
import java.net.URL;

public class Class151 {

	public Class464 aClass464_1961 = new Class464();

	public static void decodeWorldList(boolean refresh, byte[] data) {
		if (Class96_Sub20.WORLD_LIST_BUFFER == null) {
			Class96_Sub20.WORLD_LIST_BUFFER = new RsByteBuffer(20000);
		}
		Class96_Sub20.WORLD_LIST_BUFFER.writeBytes(data, 0, data.length);
		if (refresh) {
			Class468_Sub10.decodeWorldList(Class96_Sub20.WORLD_LIST_BUFFER.buffer);
			Class448.WORLD_DESCRIPTORS_BYID = new WorldDescriptor[Class4.WORLD_LIST_SIZE];
			int i_3 = 0;
			for (int i_4 = Class485.WORLD_LIST_START; i_4 <= Class244.WORLD_LIST_SIZEPLUS1; i_4++) {
				WorldDescriptor world = ObjectIndexLoader.method7916(i_4, 241978983);
				if (world != null) {
					Class448.WORLD_DESCRIPTORS_BYID[i_3++] = world;
				}
			}
			Class448.aBool5422 = false;
			Class448.aLong5425 = TextureDetails.time();
			Class96_Sub20.WORLD_LIST_BUFFER = null;
		}
	}

	static void method2590(IComponentDefinitions icomponentdefinitions_0) {
		if (client.aBool7344) {
			if (icomponentdefinitions_0.anObjectArray1393 != null) {
				IComponentDefinitions icomponentdefinitions_2 = Index.method5694(Class7.anInt56, client.anInt7345, -1264111799);
				if (icomponentdefinitions_2 != null) {
					HookRequest hookrequest_3 = new HookRequest();
					hookrequest_3.iComponentDefs = icomponentdefinitions_0;
					hookrequest_3.aClass118_8057 = icomponentdefinitions_2;
					hookrequest_3.params = icomponentdefinitions_0.anObjectArray1393;
					Class96_Sub4.executeHookInner200k(hookrequest_3, 1791224764);
				}
			}
			TCPPacket tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4573, client.aClass184_7475.isaac, 891007251);
			tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.anInt1288);
			tcpmessage_4.buffer.writeShortLE(client.anInt7345, (short) -9723);
			tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.anInt1426);
			tcpmessage_4.buffer.writeLEInt(icomponentdefinitions_0.idHash, (byte) 89);
			tcpmessage_4.buffer.writeIntV2(Class7.anInt56);
			tcpmessage_4.buffer.writeShortLE(client.anInt7346, (short) -1117);
			client.aClass184_7475.queuePacket(tcpmessage_4);
		}
	}

	static final void method2591(IComponentDefinitions[] arr_0, int i_1, byte b_2) {
		for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
			IComponentDefinitions icomponentdefinitions_4 = arr_0[i_3];
			if (icomponentdefinitions_4 != null) {
				if (icomponentdefinitions_4.type == 0) {
					if (icomponentdefinitions_4.aClass118Array1439 != null) {
						method2591(icomponentdefinitions_4.aClass118Array1439, i_1, (byte) -28);
					}
					Class282_Sub44 class282_sub44_5 = (Class282_Sub44) client.aClass465_7442.get((long) icomponentdefinitions_4.idHash);
					if (class282_sub44_5 != null) {
						Class383.method6514(class282_sub44_5.anInt8063, i_1, -138211954);
					}
				}
				HookRequest hookrequest_6;
				if (i_1 == 0 && icomponentdefinitions_4.anObjectArray1421 != null) {
					hookrequest_6 = new HookRequest();
					hookrequest_6.iComponentDefs = icomponentdefinitions_4;
					hookrequest_6.params = icomponentdefinitions_4.anObjectArray1421;
					Class96_Sub4.executeHookInner200k(hookrequest_6, 506526261);
				}
				if (i_1 == 1 && icomponentdefinitions_4.anObjectArray1346 != null) {
					if (icomponentdefinitions_4.anInt1288 >= 0) {
						IComponentDefinitions icomponentdefinitions_7 = Class117.getInterfaceComponent(icomponentdefinitions_4.idHash);
						if (icomponentdefinitions_7 == null || icomponentdefinitions_7.aClass118Array1438 == null || icomponentdefinitions_4.anInt1288 >= icomponentdefinitions_7.aClass118Array1438.length || icomponentdefinitions_4 != icomponentdefinitions_7.aClass118Array1438[icomponentdefinitions_4.anInt1288]) {
							continue;
						}
					}
					hookrequest_6 = new HookRequest();
					hookrequest_6.iComponentDefs = icomponentdefinitions_4;
					hookrequest_6.params = icomponentdefinitions_4.anObjectArray1346;
					Class96_Sub4.executeHookInner200k(hookrequest_6, 2094989397);
				}
			}
		}
	}

	static final void method2592(byte b_0) {
		if (!Class282_Sub17.lobbyState(client.gameState, -632153862) && !Class97.loggedOutState(client.gameState)) {
			Class233.aClass202_2883 = client.aClass184_7475.getConnection();
			client.aClass184_7475.method3061(-1872117357);
			Class365.setGameState(10);
		} else {
			Class438.method7333(false, 2084407063);
		}
	}

	static final void method2593(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1647551269) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1394 = Class351.method6193(string_4, cs2executor_2, 1442904775);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static void method2594(String string_0, Throwable throwable_1, byte b_2) {
		try {
			String str_3 = "";
			if (throwable_1 != null) {
				str_3 = Class96_Sub3.method13787(throwable_1);
			}
			if (string_0 != null) {
				if (throwable_1 != null) {
					str_3 = str_3 + " | ";
				}
				str_3 = str_3 + string_0;
			}
			CS2Executor.method11251(str_3);
			str_3 = Class475.method7926(str_3, -53160653);
			if (RuntimeException_Sub3.anApplet10460 != null) {
				String str_4 = "Unknown";
				String str_5 = "1.1";
				try {
					str_4 = System.getProperty("java.vendor");
					str_5 = System.getProperty("java.version");
				} catch (Exception exception_8) {
					;
				}
				URL url_6 = new URL(RuntimeException_Sub3.anApplet10460.getCodeBase(), "clienterror.ws?c=" + RuntimeException_Sub3.anInt10457 + "&cs=" + InventoriesIndexLoader.anInt4781 + "&u=" + (RuntimeException_Sub3.aString10458 != null ? Class475.method7926(RuntimeException_Sub3.aString10458, -790911814) : "" + RuntimeException_Sub3.aLong10459) + "&v1=" + Class475.method7926(str_4, 553035872) + "&v2=" + Class475.method7926(str_5, 72672054) + "&e=" + str_3);
				DataInputStream datainputstream_7 = new DataInputStream(url_6.openStream());
				datainputstream_7.read();
				datainputstream_7.close();
			}
		} catch (Exception exception_9) {
			exception_9.printStackTrace();
		}
	}
}
