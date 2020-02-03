package com.jagex;
public abstract class CutsceneAction_Sub10 extends CutsceneAction {

    int anInt9296;

    int anInt9297;

    int anInt9295;

    CutsceneAction_Sub10(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9296 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9297 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9295 = rsbytebuffer_1.readUnsignedByte();
    }

    boolean method1599() {
        SpotAnimDefinitions spotanimdefinitions_2 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.anInt9296, (byte) 90);
        boolean bool_3 = spotanimdefinitions_2.method11230(-1104094093);
        AnimationDefinitions animationdefinitions_4 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_2.animationId, (byte) -39);
        bool_3 &= animationdefinitions_4.ready();
        return bool_3;
    }

    public static void method14603(int i_0, int interfaceHash, int slotId, String string_3, byte b_4) {
        IComponentDefinitions icomponentdefinitions_5 = Index.getIComponentDefinitions(interfaceHash, slotId);
        if (icomponentdefinitions_5 != null) {
            if (icomponentdefinitions_5.params != null) {
                HookRequest hookrequest_6 = new HookRequest();
                hookrequest_6.source = icomponentdefinitions_5;
                hookrequest_6.anInt8051 = i_0;
                hookrequest_6.opName = string_3;
                hookrequest_6.params = icomponentdefinitions_5.params;
                CS2Executor.executeHookInner(hookrequest_6);
            }
            if (client.getIComponentSettings(icomponentdefinitions_5).clickOptionEnabled(i_0 - 1)) {
                BufferedConnectionContext class184_8 = Preference_Sub20.getConnectionContext();
                if (client.gameState == 0 || client.gameState == 13) {
                    TCPPacket tcpmessage_7;
                    if (i_0 == 1) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP1, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 2) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP2, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 3) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP3, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 4) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP4, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 5) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP5, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 6) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP6, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 7) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP7, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 8) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP8, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 9) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP9, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                    if (i_0 == 10) {
                        tcpmessage_7 = Class271.createPacket(ClientPacket.IF_OP10, class184_8.isaac);
                        Class350_Sub3.method12590(tcpmessage_7, interfaceHash, slotId, icomponentdefinitions_5.containerItemId);
                        class184_8.queuePacket(tcpmessage_7);
                    }
                }
            }
        }
    }
}
