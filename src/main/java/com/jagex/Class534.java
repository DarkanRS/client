package com.jagex;

import java.util.Iterator;

public abstract class Class534 {

    static short aShort7079;

    long aLong7074 = -1L;

    long aLong7076 = -1L;

    int anInt7075 = -1;

    int anInt7078 = -1;

    NodeCollection aClass482_7077 = new NodeCollection();

    static void method11441() {
        if (Class179.anInt2226 > 0) {
            int i_1 = 0;
            for (int i_2 = 0; i_2 < Class13.aStringArray129.length; i_2++) {
                if (Class13.aStringArray129[i_2].indexOf("--> ") != -1) {
                    ++i_1;
                    if (i_1 == Class179.anInt2226) {
                        Class179.aString2225 = Class13.aStringArray129[i_2].substring(Class13.aStringArray129[i_2].indexOf(62) + 2);
                        break;
                    }
                }
            }
        } else {
            Class179.aString2225 = "";
        }
    }

    int method11408(MouseRecord class282_sub53_1, int i_2) {
        long long_4;
        if (aLong7074 == -1L) {
            long_4 = i_2;
        } else {
            long_4 = class282_sub53_1.method13471() - aLong7074;
            if (long_4 > i_2) {
                long_4 = i_2;
            }
        }
        aLong7074 = class282_sub53_1.method13471();
        return (int) long_4;
    }

    void method11409() {
        aClass482_7077.removeAll();
        aLong7074 = -1L;
        aLong7076 = -1L;
        anInt7075 = -1;
        anInt7078 = -1;
    }

    void method11410(MouseRecord class282_sub53_1) {
        aClass482_7077.append(class282_sub53_1);
    }

    abstract int method11412();

    abstract void method11413(ByteBuf var1, MouseRecord var2);

    abstract void method11414();

    abstract int method11415();

    abstract TCPPacket method11416();

    void method11417() {
        if (method11423()) {
            TCPPacket tcpmessage_2 = null;
            int i_3 = 0;
            int i_4 = 0;
            int i_5 = 0;
            Iterator iterator_6 = aClass482_7077.iterator();
            label105:
            while (true) {
                while (true) {
                    if (!iterator_6.hasNext()) {
                        break label105;
                    }
                    MouseRecord class282_sub53_13 = (MouseRecord) iterator_6.next();
                    if (tcpmessage_2 != null && tcpmessage_2.buffer.index - i_3 >= 252 - (6 + method11412())) {
                        break label105;
                    }
                    class282_sub53_13.unlink();
                    int i_8 = class282_sub53_13.getY();
                    if (i_8 < -1) {
                        i_8 = -1;
                    } else if (i_8 > 65534) {
                        i_8 = 65534;
                    }
                    int i_9 = class282_sub53_13.getX();
                    if (i_9 < -1) {
                        i_9 = -1;
                    } else if (i_9 > 65534) {
                        i_9 = 65534;
                    }
                    if (i_9 != anInt7075 || i_8 != anInt7078) {
                        if (tcpmessage_2 == null) {
                            tcpmessage_2 = method11416();
                            tcpmessage_2.buffer.writeByte(0);
                            i_3 = tcpmessage_2.buffer.index;
                            tcpmessage_2.buffer.index += 2;
                            i_4 = 0;
                            i_5 = 0;
                        }
                        int i_10;
                        int i_11;
                        int i_12;
                        if (aLong7076 != -1L) {
                            i_10 = i_9 - anInt7075;
                            i_11 = i_8 - anInt7078;
                            i_12 = (int) ((class282_sub53_13.method13471() - aLong7076) / 20L);
                            i_4 = (int) (i_4 + (class282_sub53_13.method13471() - aLong7076) % 20L);
                        } else {
                            i_10 = i_9;
                            i_11 = i_8;
                            i_12 = Integer.MAX_VALUE;
                        }
                        anInt7075 = i_9;
                        anInt7078 = i_8;
                        if (i_12 < 8 && i_10 >= -32 && i_10 <= 31 && i_11 >= -32 && i_11 <= 31) {
                            i_10 += 32;
                            i_11 += 32;
                            tcpmessage_2.buffer.writeShort((i_12 << 12) + i_11 + (i_10 << 6));
                        } else if (i_12 < 32 && i_10 >= -128 && i_10 <= 127 && i_11 >= -128 && i_11 <= 127) {
                            i_10 += 128;
                            i_11 += 128;
                            tcpmessage_2.buffer.writeByte(i_12 + 128);
                            tcpmessage_2.buffer.writeShort(i_11 + (i_10 << 8));
                        } else if (i_12 < 32) {
                            tcpmessage_2.buffer.writeByte(i_12 + 192);
                            if (i_9 != -1 && i_8 != -1) {
                                tcpmessage_2.buffer.writeInt(i_9 | i_8 << 16);
                            } else {
                                tcpmessage_2.buffer.writeInt(Integer.MIN_VALUE);
                            }
                        } else {
                            tcpmessage_2.buffer.writeShort((i_12 & 0x1fff) + 57344);
                            if (i_9 != -1 && i_8 != -1) {
                                tcpmessage_2.buffer.writeInt(i_9 | i_8 << 16);
                            } else {
                                tcpmessage_2.buffer.writeInt(Integer.MIN_VALUE);
                            }
                        }
                        ++i_5;
                        method11413(tcpmessage_2.buffer, class282_sub53_13);
                        aLong7076 = class282_sub53_13.method13471();
                    }
                    class282_sub53_13.cache();
                }
            }
            if (tcpmessage_2 != null) {
                tcpmessage_2.buffer.writeIndex(tcpmessage_2.buffer.index - i_3);
                int i_7 = tcpmessage_2.buffer.index;
                tcpmessage_2.buffer.index = i_3;
                tcpmessage_2.buffer.writeByte(i_4 / i_5);
                tcpmessage_2.buffer.writeByte(i_4 % i_5);
                tcpmessage_2.buffer.index = i_7;
                client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
            }
        }
        method11414();
    }

    abstract void method11418();

    abstract TCPPacket method11420();

    abstract TCPPacket method11421();

    abstract TCPPacket method11422();

    abstract boolean method11423();

    abstract int method11424();

    abstract int method11425();

    abstract void method11426(ByteBuf var1, MouseRecord var2);

    abstract void method11427(ByteBuf var1, MouseRecord var2);

    abstract TCPPacket method11428();

    abstract void method11431();

    abstract boolean method11434();
}
