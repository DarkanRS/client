package com.jagex;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FontRenderer_Sub2 extends FontRenderer {

    JavaRenderer aGraphicalRenderer_Sub3_8889;
    int[] anIntArray8886;
    int[] anIntArray8888;
    byte[][] aByteArrayArray8887;
    int[] anIntArray8890;
    int[] anIntArray8891;

    FontRenderer_Sub2(JavaRenderer hardwarerenderer_1, FontMetrics fontmetrics_2, SpriteDefinitions[] arr_3, int[] ints_4, int[] ints_5) {
        super(hardwarerenderer_1, fontmetrics_2);
        aGraphicalRenderer_Sub3_8889 = hardwarerenderer_1;
        aGraphicalRenderer_Sub3_8889 = hardwarerenderer_1;
        anIntArray8886 = ints_4;
        anIntArray8888 = ints_5;
        aByteArrayArray8887 = new byte[arr_3.length][];
        anIntArray8890 = new int[arr_3.length];
        anIntArray8891 = new int[arr_3.length];

        for (int i_6 = 0; i_6 < arr_3.length; i_6++) {
            SpriteDefinitions class91_7 = arr_3[i_6];
            if (class91_7.alpha != null) {
                aByteArrayArray8887[i_6] = class91_7.alpha;
            } else {
                byte[] bytes_8 = class91_7.pixels;
                byte[] bytes_9 = aByteArrayArray8887[i_6] = new byte[bytes_8.length];

                for (int i_10 = 0; i_10 < bytes_8.length; i_10++) {
                    bytes_9[i_10] = (byte) (bytes_8[i_10] == 0 ? 0 : -1);
                }
            }

            anIntArray8890[i_6] = class91_7.minY;
            anIntArray8891[i_6] = class91_7.minX;
        }

    }

    static void method14262() {
        ItemContainer.CONTAINER_MAP.method7749();
    }

    public static void method14263(int i_0, int i_1) {
        Class291_Sub1.anInt8014 = i_0 - Class291_Sub1.anInt3472;
        Class291_Sub1.anInt8016 = i_1 - Class291_Sub1.anInt3473;
    }

    public static void method14264(ByteBuf.Bit rsbitsbuffer_0) {
        ReflectionCheck class282_sub42_2 = (ReflectionCheck) Class435.PENDING_REFLECTION_CHECKS.head();
        if (class282_sub42_2 != null) {
            int i_3 = rsbitsbuffer_0.index;
            rsbitsbuffer_0.writeInt(class282_sub42_2.anInt8038);

            for (int i_4 = 0; i_4 < class282_sub42_2.anInt8033; i_4++) {
                if (class282_sub42_2.anIntArray8036[i_4] != 0) {
                    rsbitsbuffer_0.writeByte(class282_sub42_2.anIntArray8036[i_4]);
                } else {
                    try {
                        int i_5 = class282_sub42_2.anIntArray8035[i_4];
                        Field field_6;
                        int i_7;
                        if (i_5 == 0) {
                            field_6 = class282_sub42_2.aFieldArray8037[i_4];
                            i_7 = field_6.getInt(null);
                            rsbitsbuffer_0.writeByte(0);
                            rsbitsbuffer_0.writeInt(i_7);
                        } else if (i_5 == 1) {
                            field_6 = class282_sub42_2.aFieldArray8037[i_4];
                            field_6.setInt(null, class282_sub42_2.anIntArray8040[i_4]);
                            rsbitsbuffer_0.writeByte(0);
                        } else if (i_5 == 2) {
                            field_6 = class282_sub42_2.aFieldArray8037[i_4];
                            i_7 = field_6.getModifiers();
                            rsbitsbuffer_0.writeByte(0);
                            rsbitsbuffer_0.writeInt(i_7);
                        }

                        Method method_26;
                        if (i_5 != 3) {
                            if (i_5 == 4) {
                                method_26 = class282_sub42_2.aMethodArray8034[i_4];
                                i_7 = method_26.getModifiers();
                                rsbitsbuffer_0.writeByte(0);
                                rsbitsbuffer_0.writeInt(i_7);
                            }
                        } else {
                            method_26 = class282_sub42_2.aMethodArray8034[i_4];
                            byte[][] bytes_11 = class282_sub42_2.aByteArrayArrayArray8041[i_4];
                            Object[] arr_8 = new Object[bytes_11.length];

                            for (int i_9 = 0; i_9 < bytes_11.length; i_9++) {
                                ObjectInputStream objectinputstream_10 = new ObjectInputStream(new ByteArrayInputStream(bytes_11[i_9]));
                                arr_8[i_9] = objectinputstream_10.readObject();
                            }

                            Object object_12 = method_26.invoke(null, arr_8);
                            if (object_12 == null) {
                                rsbitsbuffer_0.writeByte(0);
                            } else if (object_12 instanceof Number) {
                                rsbitsbuffer_0.writeByte(1);
                                rsbitsbuffer_0.writeLong(((Number) object_12).longValue());
                            } else if (object_12 instanceof String) {
                                rsbitsbuffer_0.writeByte(2);
                                rsbitsbuffer_0.writeString((String) object_12);
                            } else {
                                rsbitsbuffer_0.writeByte(4);
                            }
                        }
                    } catch (ClassNotFoundException classnotfoundexception_14) {
                        rsbitsbuffer_0.writeByte(-10);
                    } catch (InvalidClassException invalidclassexception_15) {
                        rsbitsbuffer_0.writeByte(-11);
                    } catch (StreamCorruptedException streamcorruptedexception_16) {
                        rsbitsbuffer_0.writeByte(-12);
                    } catch (OptionalDataException optionaldataexception_17) {
                        rsbitsbuffer_0.writeByte(-13);
                    } catch (IllegalAccessException illegalaccessexception_18) {
                        rsbitsbuffer_0.writeByte(-14);
                    } catch (IllegalArgumentException illegalargumentexception_19) {
                        rsbitsbuffer_0.writeByte(-15);
                    } catch (InvocationTargetException invocationtargetexception_20) {
                        rsbitsbuffer_0.writeByte(-16);
                    } catch (SecurityException securityexception_21) {
                        rsbitsbuffer_0.writeByte(-17);
                    } catch (IOException ioexception_22) {
                        rsbitsbuffer_0.writeByte(-18);
                    } catch (NullPointerException nullpointerexception_23) {
                        rsbitsbuffer_0.writeByte(-19);
                    } catch (Exception exception_24) {
                        rsbitsbuffer_0.writeByte(-20);
                    } catch (Throwable throwable_25) {
                        rsbitsbuffer_0.writeByte(-21);
                    }
                }
            }

            rsbitsbuffer_0.writeCRC(i_3);
            class282_sub42_2.unlink();
        }

    }

    @Override
    void c(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8889.anIntArray8979 != null) {
            i_21 += anIntArray8891[var_1];
            i_31 += anIntArray8890[var_1];
            int i_6 = anIntArray8886[var_1];
            int i_7 = anIntArray8888[var_1];
            int i_8 = 444800403 * aGraphicalRenderer_Sub3_8889.anInt8980 * 299731099;
            int i_9 = i_21 + i_31 * i_8;
            int i_10 = i_8 - i_6;
            int i_11 = 0;
            int i_12 = 0;
            int i_13;
            if (i_31 < 1516535457 * aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577) {
                i_13 = 1516535457 * aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577 - i_31;
                i_7 -= i_13;
                i_31 = aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577 * 1516535457;
                i_12 += i_6 * i_13;
                i_9 += i_8 * i_13;
            }

            if (i_7 + i_31 > 1383960921 * aGraphicalRenderer_Sub3_8889.anInt8986 * 760194793) {
                i_7 -= i_7 + i_31 - aGraphicalRenderer_Sub3_8889.anInt8986 * 760194793 * 1383960921;
            }

            if (i_21 < 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331) {
                i_13 = 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331 - i_21;
                i_6 -= i_13;
                i_21 = aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331 * 72550989;
                i_12 += i_13;
                i_9 += i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 + i_21 > -1710988237 * aGraphicalRenderer_Sub3_8889.anInt9002 * 1714763515) {
                i_13 = i_6 + i_21 - -1710988237 * aGraphicalRenderer_Sub3_8889.anInt9002 * 1714763515;
                i_6 -= i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 > 0 && i_7 > 0) {
                method14257(aByteArrayArray8887[var_1], aGraphicalRenderer_Sub3_8889.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
            }
        }

    }

    @Override
    void UA(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8889.anIntArray8979 != null) {
            i_21 += anIntArray8891[var_1];
            i_31 += anIntArray8890[var_1];
            int i_6 = anIntArray8886[var_1];
            int i_7 = anIntArray8888[var_1];
            int i_8 = aGraphicalRenderer_Sub3_8889.anInt8980;
            int i_9 = i_21 + i_31 * i_8;
            int i_10 = i_8 - i_6;
            int i_11 = 0;
            int i_12 = 0;
            int i_13;
            if (i_31 < aGraphicalRenderer_Sub3_8889.anInt9009) {
                i_13 = aGraphicalRenderer_Sub3_8889.anInt9009 - i_31;
                i_7 -= i_13;
                i_31 = aGraphicalRenderer_Sub3_8889.anInt9009;
                i_12 += i_6 * i_13;
                i_9 += i_8 * i_13;
            }

            if (i_31 + i_7 > aGraphicalRenderer_Sub3_8889.anInt8986) {
                i_7 -= i_31 + i_7 - aGraphicalRenderer_Sub3_8889.anInt8986;
            }

            if (i_21 < aGraphicalRenderer_Sub3_8889.anInt8983) {
                i_13 = aGraphicalRenderer_Sub3_8889.anInt8983 - i_21;
                i_6 -= i_13;
                i_21 = aGraphicalRenderer_Sub3_8889.anInt8983;
                i_12 += i_13;
                i_9 += i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 + i_21 > aGraphicalRenderer_Sub3_8889.anInt9002) {
                i_13 = i_6 + i_21 - aGraphicalRenderer_Sub3_8889.anInt9002;
                i_6 -= i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 > 0 && i_7 > 0) {
                method14257(aByteArrayArray8887[var_1], aGraphicalRenderer_Sub3_8889.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
            }
        }

    }

    void method14257(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        for (int i_10 = -i_7; i_10 < 0; i_10++) {
            for (int i_11 = -i_6; i_11 < 0; i_11++) {
                int i_12 = bytes_1[i_4++] & 0xff;
                if (i_12 != 0) {
                    int i_13 = (i_12 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_12 & -16711936) >> 8;
                    i_12 = 256 - i_12;
                    int i_14 = ints_2[i_5];
                    ints_2[i_5++] = i_13 + ((i_12 * (i_14 & 0xff00) & 0xff0000) + ((i_14 & 0xff00ff) * i_12 & -16711936) >> 8);
                } else {
                    ++i_5;
                }
            }

            i_5 += i_8;
            i_4 += i_9;
        }

    }

    @Override
    void t(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8889.anIntArray8979 != null) {
            i_21 += anIntArray8891[var_1];
            i_31 += anIntArray8890[var_1];
            int i_6 = anIntArray8886[var_1];
            int i_7 = anIntArray8888[var_1];
            int i_8 = 444800403 * aGraphicalRenderer_Sub3_8889.anInt8980 * 299731099;
            int i_9 = i_21 + i_31 * i_8;
            int i_10 = i_8 - i_6;
            int i_11 = 0;
            int i_12 = 0;
            int i_13;
            if (i_31 < 1516535457 * aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577) {
                i_13 = 1516535457 * aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577 - i_31;
                i_7 -= i_13;
                i_31 = aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577 * 1516535457;
                i_12 += i_6 * i_13;
                i_9 += i_8 * i_13;
            }

            if (i_7 + i_31 > 1383960921 * aGraphicalRenderer_Sub3_8889.anInt8986 * 760194793) {
                i_7 -= i_7 + i_31 - aGraphicalRenderer_Sub3_8889.anInt8986 * 760194793 * 1383960921;
            }

            if (i_21 < 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331) {
                i_13 = 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331 - i_21;
                i_6 -= i_13;
                i_21 = aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331 * 72550989;
                i_12 += i_13;
                i_9 += i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 + i_21 > -1710988237 * aGraphicalRenderer_Sub3_8889.anInt9002 * 1714763515) {
                i_13 = i_6 + i_21 - -1710988237 * aGraphicalRenderer_Sub3_8889.anInt9002 * 1714763515;
                i_6 -= i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 > 0 && i_7 > 0) {
                method14257(aByteArrayArray8887[var_1], aGraphicalRenderer_Sub3_8889.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
            }
        }

    }

    void method14258(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Class455 class455_13, int i_14, int i_15) {
        Class455_Sub3 packetsdecoder_16 = (Class455_Sub3) class455_13;
        int[] ints_17 = packetsdecoder_16.anIntArray9077;
        int[] ints_18 = packetsdecoder_16.anIntArray9078;
        int i_19 = i_10 - aGraphicalRenderer_Sub3_8889.anInt8983;
        int i_20 = i_11;
        if (i_15 > i_11) {
            i_20 = i_15;
            i_5 += aGraphicalRenderer_Sub3_8889.anInt8980 * (i_15 - i_11);
            i_4 += (i_15 - i_11) * i_12;
        }

        int i_21 = Math.min(ints_17.length + i_15, i_11 + i_7);

        for (int i_22 = i_20; i_22 < i_21; i_22++) {
            int i_23 = ints_17[i_22 - i_15] + i_14;
            int i_24 = ints_18[i_22 - i_15];
            int i_25 = i_6;
            int i_26;
            if (i_19 > i_23) {
                i_26 = i_19 - i_23;
                if (i_26 >= i_24) {
                    i_4 += i_9 + i_6;
                    i_5 += i_8 + i_6;
                    continue;
                }

                i_24 -= i_26;
            } else {
                i_26 = i_23 - i_19;
                if (i_26 >= i_6) {
                    i_4 += i_9 + i_6;
                    i_5 += i_8 + i_6;
                    continue;
                }

                i_4 += i_26;
                i_25 = i_6 - i_26;
                i_5 += i_26;
            }

            i_26 = 0;
            if (i_25 < i_24) {
                i_24 = i_25;
            } else {
                i_26 = i_25 - i_24;
            }

            for (int i_27 = -i_24; i_27 < 0; i_27++) {
                int i_28 = bytes_1[i_4++] & 0xff;
                if (i_28 != 0) {
                    int i_29 = (i_28 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_28 & -16711936) >> 8;
                    i_28 = 256 - i_28;
                    int i_30 = ints_2[i_5];
                    ints_2[i_5++] = (((i_30 & 0xff00ff) * i_28 & -16711936) + (i_28 * (i_30 & 0xff00) & 0xff0000) >> 8) + i_29;
                } else {
                    ++i_5;
                }
            }

            i_4 = i_26 + i_4 + i_9;
            i_5 += i_26 + i_8;
        }

    }

    @Override
    void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8889.anIntArray8979 != null) {
            if (class455_6 == null) {
                UA(var_1, i_21, i_31, i_4, bool_5);
            } else {
                i_21 += anIntArray8891[var_1];
                i_31 += anIntArray8890[var_1];
                int i_9 = anIntArray8886[var_1];
                int i_10 = anIntArray8888[var_1];
                int i_11 = 444800403 * aGraphicalRenderer_Sub3_8889.anInt8980 * 299731099;
                int i_12 = i_21 + i_31 * i_11;
                int i_13 = i_11 - i_9;
                int i_14 = 0;
                int i_15 = 0;
                int i_16;
                if (i_31 < 1516535457 * aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577) {
                    i_16 = 1516535457 * aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577 - i_31;
                    i_10 -= i_16;
                    i_31 = aGraphicalRenderer_Sub3_8889.anInt9009 * 1457972577 * 1516535457;
                    i_15 += i_16 * i_9;
                    i_12 += i_16 * i_11;
                }

                if (i_10 + i_31 > aGraphicalRenderer_Sub3_8889.anInt8986 * 760194793 * 1383960921) {
                    i_10 -= i_10 + i_31 - 1383960921 * aGraphicalRenderer_Sub3_8889.anInt8986 * 760194793;
                }

                if (i_21 < 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331) {
                    i_16 = 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331 - i_21;
                    i_9 -= i_16;
                    i_21 = 72550989 * aGraphicalRenderer_Sub3_8889.anInt8983 * -363774331;
                    i_15 += i_16;
                    i_12 += i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 + i_21 > aGraphicalRenderer_Sub3_8889.anInt9002 * 1714763515 * -1710988237) {
                    i_16 = i_21 + i_9 - -1710988237 * aGraphicalRenderer_Sub3_8889.anInt9002 * 1714763515;
                    i_9 -= i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 > 0 && i_10 > 0) {
                    method14258(aByteArrayArray8887[var_1], aGraphicalRenderer_Sub3_8889.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_21, i_31, anIntArray8886[var_1], class455_6, i_7, i_8);
                }
            }
        }

    }

    @Override
    void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8889.anIntArray8979 != null) {
            if (class455_6 == null) {
                UA(var_1, i_21, i_31, i_4, bool_5);
            } else {
                i_21 += anIntArray8891[var_1];
                i_31 += anIntArray8890[var_1];
                int i_9 = anIntArray8886[var_1];
                int i_10 = anIntArray8888[var_1];
                int i_11 = aGraphicalRenderer_Sub3_8889.anInt8980;
                int i_12 = i_21 + i_31 * i_11;
                int i_13 = i_11 - i_9;
                int i_14 = 0;
                int i_15 = 0;
                int i_16;
                if (i_31 < aGraphicalRenderer_Sub3_8889.anInt9009) {
                    i_16 = aGraphicalRenderer_Sub3_8889.anInt9009 - i_31;
                    i_10 -= i_16;
                    i_31 = aGraphicalRenderer_Sub3_8889.anInt9009;
                    i_15 += i_16 * i_9;
                    i_12 += i_16 * i_11;
                }

                if (i_31 + i_10 > aGraphicalRenderer_Sub3_8889.anInt8986) {
                    i_10 -= i_31 + i_10 - aGraphicalRenderer_Sub3_8889.anInt8986;
                }

                if (i_21 < aGraphicalRenderer_Sub3_8889.anInt8983) {
                    i_16 = aGraphicalRenderer_Sub3_8889.anInt8983 - i_21;
                    i_9 -= i_16;
                    i_21 = aGraphicalRenderer_Sub3_8889.anInt8983;
                    i_15 += i_16;
                    i_12 += i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 + i_21 > aGraphicalRenderer_Sub3_8889.anInt9002) {
                    i_16 = i_9 + i_21 - aGraphicalRenderer_Sub3_8889.anInt9002;
                    i_9 -= i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 > 0 && i_10 > 0) {
                    method14258(aByteArrayArray8887[var_1], aGraphicalRenderer_Sub3_8889.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_21, i_31, anIntArray8886[var_1], class455_6, i_7, i_8);
                }
            }
        }

    }

}
