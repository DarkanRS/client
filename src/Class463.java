public class Class463 {

    static Index SPRITES_INDEX;

    int anInt5551;

    int anInt5550;

    boolean aBool5552;

    public boolean method7719() {
        return this.aBool5552;
    }

    public int method7720(int i_1) {
        return this.anInt5550;
    }

    public int method7721(int i_1) {
        return this.anInt5551;
    }

    Class463(int i_1, int i_2, boolean bool_3) {
        this.anInt5551 = i_1;
        this.anInt5550 = i_2;
        this.aBool5552 = bool_3;
    }

    static void method7724(Animable animable_0) {
        if (animable_0 instanceof NPC) {
            NPC npc_2 = (NPC) animable_0;
            if (npc_2.definitions != null) {
                MapAreaDefinitions.method3736(npc_2, npc_2.plane != VertexNormal.myPlayer.plane, 2058310476);
            }
        } else if (animable_0 instanceof Player) {
            Player player_3 = (Player) animable_0;
            Class96_Sub22.method14678(player_3, player_3.plane != VertexNormal.myPlayer.plane);
        }
    }

    static int[] method7725(TCPPacket tcpmessage_0) {
        RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(518);
        int[] ints_3 = new int[4];
        int i_4;
        for (i_4 = 0; i_4 < 4; i_4++) {
            ints_3[i_4] = (int) (Math.random() * 9.9999999E7D);
        }
        rsbytebuffer_2.writeByte(10);
        rsbytebuffer_2.writeInt(ints_3[0]);
        rsbytebuffer_2.writeInt(ints_3[1]);
        rsbytebuffer_2.writeInt(ints_3[2]);
        rsbytebuffer_2.writeInt(ints_3[3]);
        for (i_4 = 0; i_4 < 10; i_4++) {
            rsbytebuffer_2.writeInt((int) (Math.random() * 9.9999999E7D));
        }
        rsbytebuffer_2.writeShort((int) (Math.random() * 9.9999999E7D));
        rsbytebuffer_2.applyRSA();
        tcpmessage_0.buffer.writeBytes(rsbytebuffer_2.buffer, 0, rsbytebuffer_2.index);
        return ints_3;
    }

    static final void method7727(Animable animable_0) {
        Animation animation_2 = animable_0.currentAnimation;
        if (animable_0.anInt10345 == client.cycles || !animation_2.hasDefs() || animation_2.method7585(1)) {
            int i_3 = animable_0.anInt10345 - animable_0.anInt10342;
            int i_4 = client.cycles - animable_0.anInt10342;
            int i_5 = animable_0.anInt10326 * 512 + animable_0.getSize() * 256;
            int i_6 = animable_0.anInt10328 * 512 + animable_0.getSize() * 256;
            int i_7 = animable_0.anInt10341 * 512 + animable_0.getSize() * 256;
            int i_8 = animable_0.anInt10343 * 512 + animable_0.getSize() * 256;
            Vector3 vector3_9 = animable_0.method11166().aClass385_3595;
            animable_0.method11172((float) ((i_7 * i_4 + i_5 * (i_3 - i_4)) / i_3), (float) ((int) vector3_9.y), (float) ((i_4 * i_8 + i_6 * (i_3 - i_4)) / i_3));
        }
        animable_0.anInt10366 = 0;
        animable_0.turn(animable_0.anInt10346, false);
    }

    static void method7728(int i_0, int i_1, int i_2, int i_3, int i_4) {
        int i_6 = EntityNode.method4890(i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, 1554015251);
        int i_7 = EntityNode.method4890(i_3, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -1560210090);
        int i_8 = EntityNode.method4890(i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -63131658);
        int i_9 = EntityNode.method4890(i_1, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1596186955);
        for (int i_10 = i_6; i_10 <= i_7; i_10++) {
            Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_10], i_8, i_9, i_4, (byte) 2);
        }
    }

    public static boolean method7730() {
        try {
            if (Class148.anInt1730 == 2) {
                if (Class282_Sub44_Sub3.aClass282_Sub7_9563 == null) {
                    Class282_Sub44_Sub3.aClass282_Sub7_9563 = Class282_Sub7.method12164(CutsceneEntity.aClass317_746, Class6.anInt46, Class148.anInt1738);
                    if (Class282_Sub44_Sub3.aClass282_Sub7_9563 == null) {
                        return false;
                    }
                }
                if (Class454.aClass250_5450 == null) {
                    Class454.aClass250_5450 = new Class250(Class148.aClass317_1732, Class148.aClass317_1731);
                }
                Class282_Sub15_Sub2 class282_sub15_sub2_2 = Class148.aClass282_Sub15_Sub2_1735;
                if (Class282_Sub33.aClass282_Sub15_Sub2_7836 != null) {
                    class282_sub15_sub2_2 = Class282_Sub33.aClass282_Sub15_Sub2_7836;
                }
                if (class282_sub15_sub2_2.method15182(Class282_Sub44_Sub3.aClass282_Sub7_9563, Class148.aClass317_1737, Class454.aClass250_5450, 796081686)) {
                    Class148.aClass282_Sub15_Sub2_1735 = class282_sub15_sub2_2;
                    Class148.aClass282_Sub15_Sub2_1735.method15096();
                    int i_3;
                    if (Class383.anInt4664 > 0) {
                        Class148.anInt1730 = 3;
                        Class148.aClass282_Sub15_Sub2_1735.method15144(Class383.anInt4664 > Class158_Sub2_Sub3.anInt10243 ? Class158_Sub2_Sub3.anInt10243 : Class383.anInt4664, -21624698);
                        for (i_3 = 0; i_3 < HashTable.anIntArray5449.length; i_3++) {
                            Class148.aClass282_Sub15_Sub2_1735.method15095(i_3, HashTable.anIntArray5449[i_3], 2144704341);
                            HashTable.anIntArray5449[i_3] = 255;
                        }
                    } else {
                        Class148.anInt1730 = 0;
                        Class148.aClass282_Sub15_Sub2_1735.method15144(Class158_Sub2_Sub3.anInt10243, 1350898514);
                        for (i_3 = 0; i_3 < HashTable.anIntArray5449.length; i_3++) {
                            Class148.aClass282_Sub15_Sub2_1735.method15095(i_3, HashTable.anIntArray5449[i_3], 1431081574);
                            HashTable.anIntArray5449[i_3] = 255;
                        }
                    }
                    if (Class282_Sub33.aClass282_Sub15_Sub2_7836 == null) {
                        if (Class148.aLong1740 > 0L) {
                            Class148.aClass282_Sub15_Sub2_1735.method15100(Class282_Sub44_Sub3.aClass282_Sub7_9563, Class152.aBool1962, Class148.aLong1740);
                        } else {
                            Class148.aClass282_Sub15_Sub2_1735.method15098(Class282_Sub44_Sub3.aClass282_Sub7_9563, Class152.aBool1962, 1246043203);
                        }
                        if (Class11.aClass109_121 != null) {
                            Class11.aClass109_121.method1849((byte) -123);
                        }
                    }
                    if (Class502.aClass253_5830 != null) {
                        Class502.aClass253_5830.method4329(Class148.aClass282_Sub15_Sub2_1735);
                    }
                    Class282_Sub44_Sub3.aClass282_Sub7_9563 = null;
                    Class454.aClass250_5450 = null;
                    CutsceneEntity.aClass317_746 = null;
                    Class148.aLong1740 = 0L;
                    Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
                    Class11.aClass109_121 = null;
                    boolean bool_1 = true;
                    return bool_1;
                }
            }
        } catch (Exception exception_4) {
            exception_4.printStackTrace();
            Class148.aClass282_Sub15_Sub2_1735.method15101((short) 3647);
            Class332.method5929(-1000210951);
        }
        return false;
    }
}
