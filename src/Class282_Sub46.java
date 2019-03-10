public class Class282_Sub46 extends Node {

    public short aShort8067;

    public Class282_Sub46(short s_1) {
        this.aShort8067 = s_1;
    }

    static void method13407(GraphicalRenderer graphicalrenderer_0, Interface22 interface22_1, int i_2, int i_3, int i_4, int i_5, byte b_6) {
        if (Class291_Sub1.anInt8015 < 100) {
            Class435.method7302(graphicalrenderer_0, interface22_1, (byte) 37);
        }
        graphicalrenderer_0.r(i_2, i_3, i_2 + i_4, i_3 + i_5);
        int i_8;
        int i_9;
        if (Class291_Sub1.anInt8015 < 100) {
            byte b_7 = 20;
            i_8 = i_4 / 2 + i_2;
            i_9 = i_3 + i_5 / 2 - 18 - b_7;
            graphicalrenderer_0.B(i_2, i_3, i_4, i_5, -16777216, 0);
            graphicalrenderer_0.method8430(i_8 - 152, i_9, 304, 34, client.aColorArray7199[client.anInt7447].getRGB(), 0);
            graphicalrenderer_0.B(i_8 - 150, i_9 + 2, Class291_Sub1.anInt8015 * 3, 30, client.aColorArray7186[client.anInt7447].getRGB(), 0);
            Class285.aClass8_3394.method360(Message.LOADING.translate(Class223.CURRENT_LANGUAGE, -895351629), i_8, b_7 + i_9, client.aColorArray7200[client.anInt7447].getRGB(), -1, 768492991);
        } else {
            int i_17 = Class427.anInt5123 - (int) ((float) i_4 / Class291_Sub1.aFloat3468);
            i_8 = (int) ((float) i_5 / Class291_Sub1.aFloat3468) + Class475.anInt5624;
            i_9 = (int) ((float) i_4 / Class291_Sub1.aFloat3468) + Class427.anInt5123;
            int i_10 = Class475.anInt5624 - (int) ((float) i_5 / Class291_Sub1.aFloat3468);
            MapRegionLoaderTask.anInt3991 = Class427.anInt5123 - (int) ((float) i_4 / Class291_Sub1.aFloat3468);
            Class489.anInt5765 = Class475.anInt5624 - (int) ((float) i_5 / Class291_Sub1.aFloat3468);
            Class488.anInt5760 = (int) ((float) (i_4 * 2) / Class291_Sub1.aFloat3468);
            Class351.anInt4097 = (int) ((float) (i_5 * 2) / Class291_Sub1.aFloat3468);
            Class291_Sub1.method5139(i_17 + Class291_Sub1.anInt3472, i_8 + Class291_Sub1.anInt3473, i_9 + Class291_Sub1.anInt3472, i_10 + Class291_Sub1.anInt3473, i_2, i_3, i_2 + i_4, i_3 + i_5 + 1);
            Class291_Sub1.renderMap(graphicalrenderer_0);
            NodeCollection nodecollection_11 = Class291_Sub1.method5135(graphicalrenderer_0);
            Class18.renderInformation(graphicalrenderer_0, nodecollection_11, 0, 0, (byte) 2);
            if (Class361.anInt4185 > 0) {
                --Class96_Sub9.anInt9282;
                if (Class96_Sub9.anInt9282 == 0) {
                    --Class361.anInt4185;
                    Class96_Sub9.anInt9282 = 20;
                }
            }
            if (client.aBool7176) {
                int i_12 = i_2 + i_4 - 5;
                int i_13 = i_3 + i_5 - 8;
                Class16.aClass8_144.method359("Fps:" + Engine.FPS, i_12, i_13, 16776960, -1, 1878721557);
                i_13 -= 15;
                Runtime runtime_14 = Runtime.getRuntime();
                int i_15 = (int) ((runtime_14.totalMemory() - runtime_14.freeMemory()) / 1024L);
                int i_16 = 16776960;
                if (i_15 > 65536) {
                    i_16 = 16711680;
                }
                Class16.aClass8_144.method359("Mem:" + i_15 + "k", i_12, i_13, i_16, -1, 1878721557);
                i_13 -= 15;
            }
        }
    }
}
