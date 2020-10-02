package com.jagex;

import com.jagex.clans.ClanChannel;

public abstract class ChangeClanSetting extends Node {

    public static void saveVarcsToFile() {
        Class442 class442_1 = null;
        try {
            class442_1 = ParticleArchive1Def.method6137("2", client.CURRENT_GAME.name, true);
            ByteBuf rsbytebuffer_2 = new ByteBuf(client.anInt7399 * 6 + 3);
            rsbytebuffer_2.writeByte(1);
            rsbytebuffer_2.writeShort(client.anInt7399);
            for (int varcId = 0; varcId < Class320.VARC_INT.length; varcId++) {
                if (Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[varcId]) {
                    rsbytebuffer_2.writeShort(varcId);
                    rsbytebuffer_2.writeInt(Class320.VARC_INT[varcId]);
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
        client.NEEDS_VARC_SAVE = false;
    }

    public abstract void readSettings(ByteBuf buffer);

    public abstract void applySettings(ClanChannel channel);

}
