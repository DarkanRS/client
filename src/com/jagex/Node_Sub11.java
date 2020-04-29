package com.jagex;

public abstract class Node_Sub11 extends Node {

    public static void method12211() {
        Class442 class442_1 = null;
        try {
            class442_1 = ParticleArchive1Def.method6137("2", client.CURRENT_GAME.name, true);
            ByteBuf rsbytebuffer_2 = new ByteBuf(client.anInt7399 * 6 + 3);
            rsbytebuffer_2.writeByte(1);
            rsbytebuffer_2.writeShort(client.anInt7399);
            for (int i_3 = 0; i_3 < Class320.VARC_INT.length; i_3++) {
                if (Node_Sub17_Sub2.VARC_BOOL[i_3]) {
                    rsbytebuffer_2.writeShort(i_3);
                    rsbytebuffer_2.writeInt(Class320.VARC_INT[i_3]);
                }
            }
            class442_1.method7386(rsbytebuffer_2.buffer, 0, rsbytebuffer_2.index);
        } catch (Exception ignored) {
        }
        try {
            if (class442_1 != null) {
                class442_1.method7385();
            }
        } catch (Exception ignored) {
        }
        client.aLong7401 = Utils.time();
        client.aBool7400 = false;
    }

    abstract void method12203(ByteBuf var1);

    abstract void method12204(ClanChannel var1);

    abstract void method12205(ClanChannel var1);

    abstract void method12206(ByteBuf var1);

    abstract void method12207(ByteBuf var1);

    abstract void method12208(ByteBuf var1);
}
