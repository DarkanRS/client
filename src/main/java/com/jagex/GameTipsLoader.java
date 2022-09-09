package com.jagex;

import java.util.Random;

import com.jagex.clans.settings.ChangeClanSetting;

public class GameTipsLoader {

    static int anInt4821;
    static int anInt4822;
    Index tipsIndex;
    Class402[] aClass402Array4818;
    int anInt4820;

    public GameTipsLoader(Index index_3) {
        tipsIndex = index_3;
        ByteBuf buffer = new ByteBuf(tipsIndex.getFile(0, 0));
        int i_5 = buffer.buffer != null && buffer.buffer.length >= 1 ? buffer.readUnsignedByte() : -1;
        if (i_5 < 4) {
            aClass402Array4818 = new Class402[0];
            anInt4820 = -1;
        } else {
            int i_6 = buffer.readUnsignedByte();
            Class60[] arr_7 = Class112.method1870();
            boolean bool_8 = true;
            int i_9;
            int i_10;
            if (arr_7.length != i_6) {
                bool_8 = false;
            } else {
                for (i_9 = 0; i_9 < arr_7.length; i_9++) {
                    i_10 = buffer.readUnsignedByte();
                    if (i_10 != arr_7[i_9].anInt611) {
                        bool_8 = false;
                        break;
                    }
                }
            }

            if (bool_8) {
                i_9 = buffer.readUnsignedByte();
                i_10 = buffer.readUnsignedByte();
                int i_11;
                int i_12;
                if (i_5 > 2) {
                    anInt4820 = buffer.readShort();
                    i_11 = buffer.read24BitUnsignedInteger();
                    i_12 = buffer.readUnsignedShort();
                } else {
                    anInt4820 = -1;
                    i_11 = 0;
                    i_12 = 0;
                }

                aClass402Array4818 = new Class402[i_10 + 1];

                int i_13;
                for (i_13 = 0; i_13 < i_9; i_13++) {
                    int i_14 = buffer.readUnsignedByte();
                    boolean bool_15 = buffer.readUnsignedByte() == 1;
                    int i_16 = buffer.readUnsignedShort();
                    Class399[] arr_17;
                    int i_18;
                    int i_19;
                    int i_20;
                    int i_21;
                    if (anInt4820 != -1) {
                        arr_17 = new Class399[i_16 + 1];
                        arr_17[0] = new Class399(anInt4820, i_11, i_12);

                        for (i_18 = 0; i_18 < i_16; i_18++) {
                            i_19 = buffer.readUnsignedShort();
                            i_20 = buffer.read24BitUnsignedInteger();
                            i_21 = buffer.readUnsignedShort();
                            arr_17[i_18 + 1] = new Class399(i_19, i_20, i_21);
                        }
                    } else {
                        arr_17 = new Class399[i_16];

                        for (i_18 = 0; i_18 < i_16; i_18++) {
                            i_19 = buffer.readUnsignedShort();
                            i_20 = buffer.read24BitUnsignedInteger();
                            i_21 = buffer.readUnsignedShort();
                            arr_17[i_18] = new Class399(i_19, i_20, i_21);
                        }

                        aClass402Array4818[i_14] = new Class402(bool_15, arr_17);
                    }

                    aClass402Array4818[i_14] = new Class402(bool_15, arr_17);
                }

                for (i_13 = 0; i_13 < i_10 + 1; i_13++) {
                    if (aClass402Array4818[i_13] == null) {
                        aClass402Array4818[i_13] = method6784(i_11, i_12);
                    }
                }
            } else {
                aClass402Array4818 = new Class402[0];
                anInt4820 = -1;
            }
        }

    }

    static String method6793(String string_0) {
        String string_2 = null;
        int i_3 = string_0.indexOf("--> ");
        if (i_3 >= 0) {
            string_2 = string_0.substring(0, i_3 + 4);
            string_0 = string_0.substring(i_3 + 4);
        }

        if (string_0.startsWith("directlogin ")) {
            int i_4 = string_0.indexOf(' ', "directlogin ".length());
            if (i_4 >= 0) {
                int i_5 = string_0.length();
                string_0 = string_0.substring(0, i_4) + " ";

                for (int i_6 = i_4 + 1; i_6 < i_5; i_6++) {
                    string_0 += "*";
                }
            }
        }

        return string_2 != null ? string_2 + string_0 : string_0;
    }

    static void method6795() {
        int i_1 = ChangeClanSetting.BASE_WINDOW_WIDTH;
        int i_2 = client.BASE_WINDOW_HEIGHT * -969250379;
        if (SunIndexLoader.anInt434 < i_1) {
            i_1 = SunIndexLoader.anInt434;
        }

        if (Class107.anInt1082 < i_2) {
            i_2 = Class107.anInt1082;
        }

        try {
            Class361.aClass361_4173.method6256(new Object[]{Integer.valueOf(i_1), Integer.valueOf(i_2), Integer.valueOf(Class158.getScreenMode()), Integer.valueOf(Class393.preferences.maxScreenSize.method12666())});
        } catch (Throwable ignored) {
        }

    }

    Class402 method6784(int i_1, int i_2) {
        if (anInt4820 == -1) {
            return new Class402(false, new Class399[0]);
        } else {
            Class399 class399_4 = new Class399(anInt4820, i_1, i_2);
            return new Class402(false, new Class399[]{class399_4});
        }
    }

    public Class393 method6785(int i_1) {
        byte[] bytes_3 = tipsIndex.getFile(i_1, 0);
        Class393 class393_4 = new Class393();
        class393_4.method6743(new ByteBuf(bytes_3));
        return class393_4;
    }

    public Class399[] method6786(int i_1) {
        if (i_1 >= 0 && i_1 < aClass402Array4818.length) {
            Class402 class402_3 = aClass402Array4818[i_1];
            if (class402_3.aBool4826 && class402_3.aClass399Array4827.length > 1) {
                int i_4 = anInt4820 == -1 ? 0 : 1;
                Random random_5 = new Random();
                Class399[] arr_6 = new Class399[class402_3.aClass399Array4827.length];
                System.arraycopy(class402_3.aClass399Array4827, 0, arr_6, 0, arr_6.length);

                for (int i_7 = i_4; i_7 < arr_6.length; i_7++) {
                    int i_8 = ObjectMeshModifier.method7931(random_5, arr_6.length - i_4) + i_4;
                    Class399 class399_9 = class402_3.aClass399Array4827[i_7];
                    arr_6[i_7] = arr_6[i_8];
                    arr_6[i_8] = class399_9;
                }

                return arr_6;
            } else {
                return class402_3.aClass399Array4827;
            }
        } else {
            return method6784(0, 0).aClass399Array4827;
        }
    }

    public boolean method6790() {
        return anInt4820 != -1;
    }

}
