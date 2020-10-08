package com.jagex;

public class MonoStereoPreference extends Preference {

    public MonoStereoPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public MonoStereoPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public static boolean decodeWorldList(byte[] data) {
        ByteBuf buffer = new ByteBuf(data);
        int two = buffer.readUnsignedByte();
        if (two != 2) {
            return false;
        } else {
            boolean create = buffer.readUnsignedByte() == 1;
            if (create) {
                CutsceneActionType.decodeWorldList(buffer);
            }

            Class359.decodePlayerCounts(buffer);
            return true;
        }
    }

    static void method12696(ByteBuf rsbytebuffer_0) {
        if (rsbytebuffer_0.buffer.length - rsbytebuffer_0.index >= 1) {
            int i_2 = rsbytebuffer_0.readUnsignedByte();
            if (i_2 >= 0 && i_2 <= 1 && rsbytebuffer_0.buffer.length - rsbytebuffer_0.index >= 2) {
                int i_3 = rsbytebuffer_0.readUnsignedShort();
                if (rsbytebuffer_0.buffer.length - rsbytebuffer_0.index >= i_3 * 6) {
                    for (int i_4 = 0; i_4 < i_3; i_4++) {
                        int i_5 = rsbytebuffer_0.readUnsignedShort();
                        int i_6 = rsbytebuffer_0.readInt();
                        if (i_5 < Class320.VARC_INT.length && Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[i_5] && (IndexLoaders.VARC_LOADER.method6873(i_5).aChar4984 != 49 || i_6 >= -1 && i_6 <= 1)) {
                            Class320.VARC_INT[i_5] = i_6;
                        }
                    }
                }
            }
        }

    }

    public int method12691() {
        return anInt5578;
    }

    public void method12692() {
        if (anInt5578 != 1 && anInt5578 != 0) {
            anInt5578 = getDefaultValue();
        }

    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    int method7787() {
        return 1;
    }

    int method7784() {
        return 1;
    }

    void method7780(int i_1) {
        anInt5578 = -754033619 * i_1 * -859024475;
    }

    int method7786() {
        return 1;
    }

    @Override
    int getDefaultValue() {
        return 1;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

}
