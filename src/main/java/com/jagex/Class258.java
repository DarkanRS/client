package com.jagex;

public class Class258 {

    Class258() throws Throwable {
        throw new Error();
    }

    static void method4569() {
        for (Object o : client.aClass465_7334) {
            CacheableNode_Sub10 class282_sub50_sub10_2 = (CacheableNode_Sub10) o;
            SpotAnimation class521_sub1_sub1_sub4_3 = class282_sub50_sub10_2.aTransform_Sub1_Sub1_Sub4_9636;
            if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null && class521_sub1_sub1_sub4_3.method15927()) {
                IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3397(class521_sub1_sub1_sub4_3, true);
            }
        }
    }

    public static Class357 method4570(ByteBuf rsbytebuffer_0) {
        int i_2 = rsbytebuffer_0.readBigSmart();
        Class356 class356_3 = Class356.values()[rsbytebuffer_0.readUnsignedByte()];
        Class353 class353_4 = Class353.values()[rsbytebuffer_0.readUnsignedByte()];
        int i_5 = rsbytebuffer_0.readShort();
        int i_6 = rsbytebuffer_0.readShort();
        return new Class357(i_2, class356_3, class353_4, i_5, i_6);
    }
}
