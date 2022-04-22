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

    static void method12696(ByteBuf buffer) {
        if (buffer.buffer.length - buffer.index >= 1) {
            int i_2 = buffer.readUnsignedByte();
            if (i_2 >= 0 && i_2 <= 1 && buffer.buffer.length - buffer.index >= 2) {
                int i_3 = buffer.readUnsignedShort();
                if (buffer.buffer.length - buffer.index >= i_3 * 6) {
                    for (int i_4 = 0; i_4 < i_3; i_4++) {
                        int i_5 = buffer.readUnsignedShort();
                        int i_6 = buffer.readInt();
                        if (i_5 < Class320.VARC_INT.length && Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[i_5] && (IndexLoaders.VARC_LOADER.method6873(i_5).aChar4984 != 49 || i_6 >= -1 && i_6 <= 1)) {
                            Class320.VARC_INT[i_5] = i_6;
                        }
                    }
                }
            }
        }

    }

    public int getPref() {
        return value;
    }

    public void validatePref() {
        if (value != 1 && value != 0) {
            value = getDefaultValue();
        }

    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    int getStereo() {
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
