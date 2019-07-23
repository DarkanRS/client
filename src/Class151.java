import java.io.DataInputStream;
import java.net.URL;

public class Class151 {

    public Class464 aClass464_1961 = new Class464();

    public static void decodeWorldList(boolean refresh, byte[] data) {
        if (CutsceneAction_Sub20.WORLD_LIST_BUFFER == null) {
            CutsceneAction_Sub20.WORLD_LIST_BUFFER = new RsByteBuffer(20000);
        }
        CutsceneAction_Sub20.WORLD_LIST_BUFFER.writeBytes(data, 0, data.length);
        if (refresh) {
            Preference_Sub10.decodeWorldList(CutsceneAction_Sub20.WORLD_LIST_BUFFER.buffer);
            Class448.WORLD_DESCRIPTORS_BYID = new WorldDescriptor[Class4.WORLD_LIST_SIZE];
            int i_3 = 0;
            for (int i_4 = Class485.WORLD_LIST_START; i_4 <= Class244.WORLD_LIST_SIZEPLUS1; i_4++) {
                WorldDescriptor world = ObjectIndexLoader.getWorld(i_4);
                if (world != null) {
                    Class448.WORLD_DESCRIPTORS_BYID[i_3++] = world;
                }
            }
            Class448.aBool5422 = false;
            Class448.aLong5425 = Utils.time();
            CutsceneAction_Sub20.WORLD_LIST_BUFFER = null;
        }
    }

    static void method2590(IComponentDefinitions icomponentdefinitions_0) {
        if (client.aBool7344) {
            if (icomponentdefinitions_0.anObjectArray1393 != null) {
                IComponentDefinitions icomponentdefinitions_2 = Index.getIComponentDefinitions(client.anInt56, client.anInt7345);
                if (icomponentdefinitions_2 != null) {
                    HookRequest hookrequest_3 = new HookRequest();
                    hookrequest_3.source = icomponentdefinitions_0;
                    hookrequest_3.aClass118_8057 = icomponentdefinitions_2;
                    hookrequest_3.params = icomponentdefinitions_0.anObjectArray1393;
                    CS2Executor.executeHookInner200k(hookrequest_3, 1791224764);
                }
            }
            TCPPacket tcpmessage_4 = Class271.createPacket(OutgoingPacket.ICOMPONENT_ON_ICOMPONENT, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.anInt1288);
            tcpmessage_4.buffer.writeShortLE(client.anInt7345);
            tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.anInt1426);
            tcpmessage_4.buffer.writeLEInt(icomponentdefinitions_0.idHash, (byte) 89);
            tcpmessage_4.buffer.writeIntV2(client.anInt56);
            tcpmessage_4.buffer.writeShortLE(client.anInt7346);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
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
                    Node_Sub44 class282_sub44_5 = (Node_Sub44) client.aClass465_7442.get((long) icomponentdefinitions_4.idHash);
                    if (class282_sub44_5 != null) {
                        Class383.method6514(class282_sub44_5.anInt8063, i_1, -138211954);
                    }
                }
                HookRequest hookrequest_6;
                if (i_1 == 0 && icomponentdefinitions_4.anObjectArray1421 != null) {
                    hookrequest_6 = new HookRequest();
                    hookrequest_6.source = icomponentdefinitions_4;
                    hookrequest_6.params = icomponentdefinitions_4.anObjectArray1421;
                    CS2Executor.executeHookInner200k(hookrequest_6, 506526261);
                }
                if (i_1 == 1 && icomponentdefinitions_4.anObjectArray1346 != null) {
                    if (icomponentdefinitions_4.anInt1288 >= 0) {
                        IComponentDefinitions icomponentdefinitions_7 = IComponentDefinitions.getDefs(icomponentdefinitions_4.idHash);
                        if (icomponentdefinitions_7 == null || icomponentdefinitions_7.aClass118Array1438 == null || icomponentdefinitions_4.anInt1288 >= icomponentdefinitions_7.aClass118Array1438.length || icomponentdefinitions_4 != icomponentdefinitions_7.aClass118Array1438[icomponentdefinitions_4.anInt1288]) {
                            continue;
                        }
                    }
                    hookrequest_6 = new HookRequest();
                    hookrequest_6.source = icomponentdefinitions_4;
                    hookrequest_6.params = icomponentdefinitions_4.anObjectArray1346;
                    CS2Executor.executeHookInner200k(hookrequest_6, 2094989397);
                }
            }
        }
    }

    static final void method2592(byte b_0) {
        if (!Node_Sub17.lobbyState(client.gameState, -632153862) && !Class97.loggedOutState(client.gameState)) {
            ClanVarSettingsIndexLoader.aClass202_2883 = client.GAME_CONNECTION_CONTEXT.getConnection();
            client.GAME_CONNECTION_CONTEXT.reset();
            Class365.setGameState(10);
        } else {
            CursorIndexLoader.method7333(false, 2084407063);
        }
    }

    public static void method2594(String string_0, Throwable throwable_1, byte b_2) {
        try {
            String str_3 = "";
            if (throwable_1 != null) {
                str_3 = ObjectAnimationCutsceneAction.method13787(throwable_1);
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
