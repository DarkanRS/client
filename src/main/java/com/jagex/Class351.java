package com.jagex;

import java.awt.Canvas;

public class Class351 implements Interface3 {

    public static Canvas gameCanvas;

    public static int anInt4097;

    public int anInt4095;

    Class351(int i_1) {
        anInt4095 = i_1;
    }

    public static void closeChildren(SubInterface parentInterface, boolean unload, boolean bool_2) {
        int i_4 = parentInterface.interfaceId;
        int interfaceHash = (int) parentInterface.pointer;
        parentInterface.unlink();
        if (unload) {
            Class337.unloadInterface(i_4);
        }
        Class109_Sub1.method14650(i_4);
        IComponentDefinitions component = IComponentDefinitions.getDefs(interfaceHash);
        if (component != null) {
            IComponentDefinitions.redrawComponent(component);
        }
        OutputStream_Sub1.method12938();
        if (!bool_2 && client.BASE_WINDOW_ID != -1) {
            Class383.method6514(client.BASE_WINDOW_ID, 1);
        }
        HashTableIterator itr = new HashTableIterator(client.OPEN_INTERFACES);
        for (SubInterface class282_sub44_8 = (SubInterface) itr.first(); class282_sub44_8 != null; class282_sub44_8 = (SubInterface) itr.next()) {
            if (!class282_sub44_8.linked()) {
                class282_sub44_8 = (SubInterface) itr.first();
                if (class282_sub44_8 == null) {
                    break;
                }
            }
            if (class282_sub44_8.overlay == 3) {
                int i_9 = (int) class282_sub44_8.pointer;
                if (i_9 >>> 16 == i_4) {
                    closeChildren(class282_sub44_8, true, bool_2);
                }
            }
        }
    }

    public static synchronized void method6197(byte[] data) {
        if (data.length == 100 && CircularBuffer.anInt5768 < 1000) {
            CircularBuffer.aByteArrayArray5767[++CircularBuffer.anInt5768 - 1] = data;
        } else if (data.length == 5000 && CircularBuffer.anInt5769 < 250) {
            CircularBuffer.aByteArrayArray5771[++CircularBuffer.anInt5769 - 1] = data;
        } else if (data.length == 30000 && CircularBuffer.anInt5772 < 50) {
            CircularBuffer.aByteArrayArray5770[++CircularBuffer.anInt5772 - 1] = data;
        } else if (IcmpService_Sub1.aByteArrayArrayArray7963 != null) {
            for (int i_2 = 0; i_2 < CircularBuffer.anIntArray5773.length; i_2++) {
                if (data.length == CircularBuffer.anIntArray5773[i_2] && Class412.anIntArray4962[i_2] < IcmpService_Sub1.aByteArrayArrayArray7963[i_2].length) {
                    IcmpService_Sub1.aByteArrayArrayArray7963[i_2][Class412.anIntArray4962[i_2]++] = data;
                    break;
                }
            }
        }
    }

    @Override
    public Class60 method25() {
        return Class60.aClass60_601;
    }

    @Override
    public Class60 method24() {
        return Class60.aClass60_601;
    }
}
