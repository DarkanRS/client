package com.jagex;

public class ProjectileCutsceneAction extends CutsceneAction {

    int anInt9403;

    int anInt9404;

    int anInt9402;

    int anInt9407;

    int anInt9408;

    int anInt9400;

    int anInt9401;

    int anInt9410;

    int anInt9405;

    int anInt9413;

    int anInt9409;

    int anInt9412;

    int anInt9399;

    ProjectileCutsceneAction(ByteBuf rsbytebuffer_1, int i_2, int i_3) {
        super(rsbytebuffer_1);
        int i_4;
        if (i_2 == 0) {
            i_4 = rsbytebuffer_1.readInt();
            anInt9403 = i_4 >>> 16;
            anInt9404 = i_4 & 0xffff;
            anInt9402 = -1;
        } else {
            anInt9403 = -1;
            anInt9404 = -1;
            anInt9402 = rsbytebuffer_1.readUnsignedShort();
        }
        if (i_3 == 0) {
            i_4 = rsbytebuffer_1.readInt();
            anInt9407 = i_4 >>> 16;
            anInt9408 = i_4 & 0xffff;
            anInt9400 = -1;
        } else {
            anInt9407 = -1;
            anInt9408 = -1;
            anInt9400 = rsbytebuffer_1.readUnsignedShort();
        }
        if (i_2 == 0 && i_3 == 0) {
            anInt9401 = rsbytebuffer_1.readUnsignedByte();
        } else {
            anInt9401 = -1;
        }
        anInt9410 = rsbytebuffer_1.readUnsignedShort();
        anInt9405 = rsbytebuffer_1.readUnsignedByte();
        anInt9413 = rsbytebuffer_1.readUnsignedByte();
        anInt9409 = rsbytebuffer_1.read24BitUnsignedInteger();
        anInt9412 = rsbytebuffer_1.readUnsignedShort();
        anInt9399 = rsbytebuffer_1.readUnsignedByte();
    }

    public static void deleteIgnore(String string_0) {
        if (string_0 != null) {
            String string_2 = Class383.method6515(string_0);
            if (string_2 != null) {
                for (int i_3 = 0; i_3 < client.IGNORE_LIST_COUNT; i_3++) {
                    IgnoredPlayer class10_4 = client.IGNORED_PLAYERS[i_3];
                    String string_5 = class10_4.displayName;
                    String string_6 = Class383.method6515(string_5);
                    if (Class159.method2734(string_0, string_2, string_5, string_6, (byte) -110)) {
                        --client.IGNORE_LIST_COUNT;
                        if (client.IGNORE_LIST_COUNT - i_3 >= 0)
                            System.arraycopy(client.IGNORED_PLAYERS, i_3 + 1, client.IGNORED_PLAYERS, i_3, client.IGNORE_LIST_COUNT - i_3);
                        client.anInt7386 = client.anInt7347;
                        BufferedConnectionContext class184_9 = BufferedConnectionContext.getConnectionContext();
                        TCPPacket tcpmessage_8 = TCPPacket.createPacket(ClientProt.REMOVE_IGNORE, class184_9.outKeys);
                        tcpmessage_8.buffer.writeByte(ChatLine.getLength(string_0));
                        tcpmessage_8.buffer.writeString(string_0);
                        class184_9.queuePacket(tcpmessage_8);
                        break;
                    }
                }
            }
        }
    }

    public static void queryItemParamString(String itemName, boolean tradeableOnly, int paramId, String paramString) {
        CombinedInputSubscriber.queryItem(itemName, tradeableOnly, paramId, -1, paramString, true);
    }

    @Override
    public void method1592() {
        int i_2;
        int i_3;
        int i_4;
        if (anInt9403 >= 0) {
            i_2 = anInt9403 * 512 + 256;
            i_3 = anInt9404 * 512 + 256;
            i_4 = anInt9401;
        } else {
            PathingEntity animable_9 = Class82.CUTSCENE_ENTITIES[anInt9402].method1342();
            Vector3 vector3_10 = animable_9.method11166().coords;
            i_2 = (int) vector3_10.x;
            i_3 = (int) vector3_10.z;
            i_4 = animable_9.plane;
        }
        int i_5;
        int i_6;
        if (anInt9404 >= 0) {
            i_5 = anInt9407 * 512 + 256;
            i_6 = anInt9408 * 512 + 256;
        } else {
            PathingEntity animable_11 = Class82.CUTSCENE_ENTITIES[anInt9400].method1342();
            Vector3 vector3_8 = animable_11.method11166().coords;
            i_5 = (int) vector3_8.x;
            i_6 = (int) vector3_8.z;
            if (i_4 < 0) {
                i_4 = animable_11.plane;
            }
        }
        int i_7 = anInt9399 << 2;
        ProjectileAnimation class521_sub1_sub1_sub3_12 = new ProjectileAnimation(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), anInt9410, i_4, i_4, i_2, i_3, anInt9405 << 2, client.FRAME_COUNT, anInt9409 + client.FRAME_COUNT, anInt9412, i_7, anInt9402 + 1, anInt9400 + 1, anInt9413 << 2, false, 0);
        class521_sub1_sub1_sub3_12.start(i_5, i_6, anInt9413 << 2, anInt9409 + client.FRAME_COUNT);
        client.PROJECTILES.append(new ProjectileNode(class521_sub1_sub1_sub3_12));
    }

    public void method1601() {
        int i_1;
        int i_2;
        int i_3;
        if (anInt9403 * -895580983 * 1708709241 >= 0) {
            i_1 = -1314196992 * anInt9403 * -895580983 + 256;
            i_2 = 256 + 1197836800 * anInt9404 * -943784947;
            i_3 = 1713842129 * anInt9401 * 1723109681;
        } else {
            PathingEntity animable_8 = Class82.CUTSCENE_ENTITIES[-772738915 * anInt9402 * -37939787].method1342();
            Vector3 vector3_9 = animable_8.method11166().coords;
            i_1 = (int) vector3_9.x;
            i_2 = (int) vector3_9.z;
            i_3 = animable_8.plane;
        }
        int i_4;
        int i_5;
        if (anInt9404 * -943784947 * -316427579 >= 0) {
            i_4 = anInt9407 * -1660550435 * -875894272 + 256;
            i_5 = anInt9408 * 11223535 * -2078663168 + 256;
        } else {
            PathingEntity animable_10 = Class82.CUTSCENE_ENTITIES[anInt9400 * 857868507 * 1060287315].method1342();
            Vector3 vector3_7 = animable_10.method11166().coords;
            i_4 = (int) vector3_7.x;
            i_5 = (int) vector3_7.z;
            if (i_3 < 0) {
                i_3 = animable_10.plane;
            }
        }
        int i_6 = -716833811 * anInt9399 * 2139724261 << 2;
        ProjectileAnimation class521_sub1_sub1_sub3_11 = new ProjectileAnimation(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), anInt9410 * 2035189521 * 899631601, i_3, i_3, i_1, i_2, anInt9405 * 2127134041 * -1118504215 << 2, client.FRAME_COUNT * 1968179203 * -1809259861, -1809259861 * client.FRAME_COUNT * 1968179203 + anInt9409 * -229470439 * -511484631, anInt9412 * -1446164009 * 1829419495, i_6, 1 + anInt9402 * -37939787 * -772738915, anInt9400 * 857868507 * 1060287315 + 1, -209777139 * anInt9413 * 885452997 << 2, false, 0);
        class521_sub1_sub1_sub3_11.start(i_4, i_5, -209777139 * anInt9413 * 885452997 << 2, -511484631 * anInt9409 * -229470439 + client.FRAME_COUNT * 1968179203 * -1809259861);
        client.PROJECTILES.append(new ProjectileNode(class521_sub1_sub1_sub3_11));
    }

    @Override
    boolean method1599() {
        SpotAnimDefinitions spotanimdefinitions_2 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(anInt9410);
        boolean bool_3 = spotanimdefinitions_2.method11230();
        AnimationDefinitions animationdefinitions_4 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_2.animationId);
        bool_3 &= animationdefinitions_4.ready();
        return bool_3;
    }
}
