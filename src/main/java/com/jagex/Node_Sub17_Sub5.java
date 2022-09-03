package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub5 extends ClanSettingDeltaUpdate {

    int anInt9941;
    String aString9942;
    ClanSettingsDelta this$0;

    Node_Sub17_Sub5(ClanSettingsDelta class348_1) {
        this$0 = class348_1;
    }

    public static byte[] method15410(Object object_0, int i_1) {
        if (object_0 == null) {
            return null;
        } else if (object_0 instanceof byte[]) {
            byte[] bytes_6 = (byte[]) object_0;
            return Arrays.copyOfRange(bytes_6, i_1, 32768 + i_1);
        } else if (object_0 instanceof ByteBuffer) {
            ByteBuffer bytebuffer_4 = (ByteBuffer) object_0;
            byte[] bytes_5 = new byte[32768];
            bytebuffer_4.position(i_1);
            bytebuffer_4.get(bytes_5, 0, 32768);
            return bytes_5;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    void applyUpdate(ClanSettings class61_1) {
        class61_1.setVarString(anInt9941, aString9942);
    }

    @Override
    void decode(ByteBuf rsbytebuffer_1) {
        anInt9941 = rsbytebuffer_1.readInt();
        aString9942 = rsbytebuffer_1.readString();
    }

}
