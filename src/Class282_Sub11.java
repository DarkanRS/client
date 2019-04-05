public abstract class Class282_Sub11 extends Node {

    abstract void method12203(RsByteBuffer var1);

    abstract void method12204(ClanChannel var1);

    abstract void method12205(ClanChannel var1);

    abstract void method12206(RsByteBuffer var1);

    abstract void method12207(RsByteBuffer var1);

    abstract void method12208(RsByteBuffer var1);

    public static void method12211(int i_0) {
        Class442 class442_1 = null;
        try {
            class442_1 = Class345.method6137("2", client.CURRENT_GAME.aString5748, true);
            RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(client.anInt7399 * 6 + 3);
            rsbytebuffer_2.writeByte(1);
            rsbytebuffer_2.writeShort(client.anInt7399);
            for (int i_3 = 0; i_3 < Class320.anIntArray3724.length; i_3++) {
                if (Class282_Sub17_Sub2.aBoolArray9934[i_3]) {
                    rsbytebuffer_2.writeShort(i_3);
                    rsbytebuffer_2.writeInt(Class320.anIntArray3724[i_3]);
                }
            }
            class442_1.method7386(rsbytebuffer_2.buffer, 0, rsbytebuffer_2.index, 18074141);
        } catch (Exception exception_5) {
            ;
        }
        try {
            if (class442_1 != null) {
                class442_1.method7385((short) 27554);
            }
        } catch (Exception exception_4) {
            ;
        }
        client.aLong7401 = TextureDetails.time();
        client.aBool7400 = false;
    }
}
