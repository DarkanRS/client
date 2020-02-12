package com.jagex;

public class KeyPressInputSubscriber implements InputSubscriber {
    int code;
    int flags;

    public boolean valid(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, KeyRecorder class199_4) {
        for (int i_6 = 0; i_6 < i_3 && i_6 < arr_2.length; i_6++) {
            KeyRecord interface16_7 = arr_2[i_6];
            if (interface16_7 != null && interface16_7.getCode() == this.code && interface16_7.getFlags() == this.flags) {
                return true;
            }
        }
        return false;
    }

    KeyPressInputSubscriber(int i_1, int i_2) {
        this.code = i_1;
        this.flags = i_2;
    }

    static KeyPressInputSubscriber decode(RsByteBuffer rsbytebuffer_0) {
        int code = rsbytebuffer_0.readUnsignedByte();
        int flags = rsbytebuffer_0.readUnsignedByte();
        return new KeyPressInputSubscriber(code, flags);
    }

    static String method3754(CharSequence charsequence_0, Class413 class413_1) {
        if (charsequence_0 == null) {
            return null;
        } else {
            int i_3 = 0;
            int i_4;
            for (i_4 = charsequence_0.length(); i_3 < i_4 && SoftwareItemRender.method7035(charsequence_0.charAt(i_3), 1817858874); i_3++) {
            }
            while (i_4 > i_3 && SoftwareItemRender.method7035(charsequence_0.charAt(i_4 - 1), 1764637813)) {
                --i_4;
            }
            int i_5 = i_4 - i_3;
            if (i_5 >= 1 && i_5 <= Class78.method1386(class413_1)) {
                StringBuilder stringbuilder_6 = new StringBuilder(i_5);
                for (int i_7 = i_3; i_7 < i_4; i_7++) {
                    char var_8 = charsequence_0.charAt(i_7);
                    if (JS5Manager.method5491(var_8)) {
                        char var_9 = ParamIndexLoader.method7080(var_8);
                        if (var_9 != 0) {
                            stringbuilder_6.append(var_9);
                        }
                    }
                }
                if (stringbuilder_6.length() == 0) {
                    return null;
                } else {
                    return stringbuilder_6.toString();
                }
            } else {
                return null;
            }
        }
    }

    public static int method3756(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if ((i_5 & 0x1) == 1) {
            int i_7 = i_3;
            i_3 = i_4;
            i_4 = i_7;
        }
        i_2 &= 0x3;
        return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 7 - i_0 - (i_3 - 1) : 7 - i_1 - (i_4 - 1)));
    }
}
