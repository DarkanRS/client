package com.jagex;

public class Class348 {

    long aLong4073;

    int anInt4060 = -1;

    NodeCollection aClass482_4062 = new NodeCollection();

    public Class348(ByteBuf rsbytebuffer_1) {
        method6171(rsbytebuffer_1);
    }

    public static void method6175(boolean bool_0) {
        if (bool_0) {
            if (client.BASE_WINDOW_ID != -1) {
                Class337.unloadInterface(client.BASE_WINDOW_ID);
            }
            for (SubInterface class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7750(); class282_sub44_2 != null; class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7751()) {
                if (!class282_sub44_2.linked()) {
                    class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7750();
                    if (class282_sub44_2 == null) {
                        break;
                    }
                }
                Class351.closeChildren(class282_sub44_2, true, false);
            }
            client.BASE_WINDOW_ID = -1;
            client.OPEN_INTERFACES = new IterableNodeMap(8);
            MeshModifier.method7041();
            client.BASE_WINDOW_ID = QuickchatFiller.ENTITY_DEFAULTS.loginWindow;
            Class516.method8867(false);
            Static.method6378();
            Class150.method2582(client.BASE_WINDOW_ID, null);
        }
        BloomPreference.method12708();
        Class9.aBool71 = false;
        CS2ReturnValue.method8739();
        client.anInt7427 = -1;
        UnderlayIndexLoader.method8036(client.anInt7340);
        VertexNormal.MY_PLAYER = new PlayerEntity(null);
        VertexNormal.MY_PLAYER.method11172((IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 / 2), 0.0F, (IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512 / 2));
        VertexNormal.MY_PLAYER.regionBaseX[0] = IndexLoaders.MAP_REGION_DECODER.getSizeX() / 2;
        VertexNormal.MY_PLAYER.regionBaseY[0] = IndexLoaders.MAP_REGION_DECODER.getSizeY() / 2;
        Class246.CAM_MOVE_ABSOLUTEY = 0;
        IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = 0;
        if (NativeLibraryLoader.anInt3240 == 5) {
            IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = Class296.CAM_MOVE_LOCALX << 9;
            Class246.CAM_MOVE_ABSOLUTEY = SubInterface.CAM_MOVE_LOCALY << 9;
        } else {
            SpotAnimIndexLoader.method8860();
        }
        IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
    }

    static boolean method6176(int i_0) {
        return i_0 == 44 || i_0 == 45 || i_0 == 46 || i_0 == 47 || i_0 == 48 || i_0 == 49 || i_0 == 50 || i_0 == 51 || i_0 == 52 || i_0 == 53 || i_0 == 15;
    }

    void method6171(ByteBuf rsbytebuffer_1) {
        aLong4073 = rsbytebuffer_1.readLong();
        anInt4060 = rsbytebuffer_1.readInt();
        for (int i_3 = rsbytebuffer_1.readUnsignedByte(); i_3 != 0; i_3 = rsbytebuffer_1.readUnsignedByte()) {
            Object obj_4;
            if (i_3 == 3) {
                obj_4 = new Node_Sub17_Sub10(this);
            } else if (i_3 == 1) {
                obj_4 = new Node_Sub17_Sub1(this);
            } else if (i_3 == 13) {
                obj_4 = new Node_Sub17_Sub9(this);
            } else if (i_3 == 4) {
                obj_4 = new Node_Sub17_Sub6(this);
            } else if (i_3 == 6) {
                obj_4 = new Node_Sub17_Sub8(this);
            } else if (i_3 == 5) {
                obj_4 = new Node_Sub17_Sub2(this);
            } else if (i_3 == 2) {
                obj_4 = new Node_Sub17_Sub7(this);
            } else if (i_3 == 7) {
                obj_4 = new Node_Sub17_Sub12(this);
            } else if (i_3 == 8) {
                obj_4 = new Node_Sub17_Sub13(this);
            } else if (i_3 == 9) {
                obj_4 = new Node_Sub17_Sub11(this);
            } else if (i_3 == 10) {
                obj_4 = new Node_Sub17_Sub5(this);
            } else if (i_3 == 11) {
                obj_4 = new Node_Sub17_Sub4(this);
            } else {
                if (i_3 != 12) {
                    throw new RuntimeException("");
                }
                obj_4 = new Node_Sub17_Sub3(this);
            }
            ((Node_Sub17) obj_4).method12250(rsbytebuffer_1);
            aClass482_4062.append((Node) obj_4);
        }
    }

    public void method6173(ClanSettings class61_1) {
        if (class61_1.aLong631 == aLong4073 && anInt4060 == class61_1.updateCount) {
            for (Node_Sub17 class282_sub17_3 = (Node_Sub17) aClass482_4062.head(); class282_sub17_3 != null; class282_sub17_3 = (Node_Sub17) aClass482_4062.next()) {
                class282_sub17_3.method12251(class61_1);
            }
            ++class61_1.updateCount;
        } else {
            throw new RuntimeException("");
        }
    }
}
