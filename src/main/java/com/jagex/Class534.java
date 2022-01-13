package com.jagex;

import java.util.Iterator;

public abstract class Class534 {

    static short aShort7079;

    long aLong7074 = -1L;

    long aLong7076 = -1L;

    int lastX = -1;

    int lastY = -1;

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
        lastX = -1;
        lastY = -1;
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
            TCPPacket packet = null;
            int sizeIndex = 0;
            int i_4 = 0;
            int i_5 = 0;
            Iterator iterator_6 = aClass482_7077.iterator();
            label105:
            while (true) {
                while (true) {
                    if (!iterator_6.hasNext()) {
                        break label105;
                    }
                    MouseRecord mouse = (MouseRecord) iterator_6.next();
                    if (packet != null && packet.buffer.index - sizeIndex >= 252 - (6 + method11412())) {
                        break label105;
                    }
                    mouse.unlink();
                    int mouseY = mouse.getY();
                    if (mouseY < -1) {
                        mouseY = -1;
                    } else if (mouseY > 65534) {
                        mouseY = 65534;
                    }
                    int mouseX = mouse.getX();
                    if (mouseX < -1) {
                        mouseX = -1;
                    } else if (mouseX > 65534) {
                        mouseX = 65534;
                    }
                    if (mouseX != lastX || mouseY != lastY) {
                        if (packet == null) {
                            packet = method11416();
                            packet.buffer.writeByte(0);
                            sizeIndex = packet.buffer.index;
                            packet.buffer.index += 2;
                            i_4 = 0;
                            i_5 = 0;
                        }
                        int dX;
                        int dY;
                        int unkVal;
                        if (aLong7076 != -1L) {
                            dX = mouseX - lastX;
                            dY = mouseY - lastY;
                            unkVal = (int) ((mouse.method13471() - aLong7076) / 20L);
                            i_4 = (int) (i_4 + (mouse.method13471() - aLong7076) % 20L);
                        } else {
                            dX = mouseX;
                            dY = mouseY;
                            unkVal = Integer.MAX_VALUE;
                        }
                        lastX = mouseX;
                        lastY = mouseY;
                        if (unkVal < 8 && dX >= -32 && dX <= 31 && dY >= -32 && dY <= 31) {
                            dX += 32;
                            dY += 32;
                            packet.buffer.writeShort((unkVal << 12) + dY + (dX << 6));
                        } else if (unkVal < 32 && dX >= -128 && dX <= 127 && dY >= -128 && dY <= 127) {
                            dX += 128;
                            dY += 128;
                            packet.buffer.writeByte(unkVal + 128);
                            packet.buffer.writeShort(dY + (dX << 8));
                        } else if (unkVal < 32) {
                            packet.buffer.writeByte(unkVal + 192);
                            if (mouseX != -1 && mouseY != -1) {
                                packet.buffer.writeInt(mouseX | mouseY << 16);
                            } else {
                                packet.buffer.writeInt(Integer.MIN_VALUE);
                            }
                        } else {
                            packet.buffer.writeShort((unkVal & 0x1fff) + 57344);
                            if (mouseX != -1 && mouseY != -1) {
                                packet.buffer.writeInt(mouseX | mouseY << 16);
                            } else {
                                packet.buffer.writeInt(Integer.MIN_VALUE);
                            }
                        }
                        ++i_5;
                        method11413(packet.buffer, mouse);
                        aLong7076 = mouse.method13471();
                    }
                    mouse.cache();
                }
            }
            if (packet != null) {
                packet.buffer.writeIndex(packet.buffer.index - sizeIndex);
                int i_7 = packet.buffer.index;
                packet.buffer.index = sizeIndex;
                packet.buffer.writeByte(i_4 / i_5);
                packet.buffer.writeByte(i_4 % i_5);
                packet.buffer.index = i_7;
                client.GAME_CONNECTION_CONTEXT.queuePacket(packet);
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
