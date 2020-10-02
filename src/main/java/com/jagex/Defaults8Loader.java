package com.jagex;

import java.util.Stack;

public class Defaults8Loader {

    static int anInt5932;
    public InputSubscriber inputSubscriber;

    public Defaults8Loader(Index index_1) {
        byte[] bytes_2 = index_1.getFile(DefaultsFile.FILE_8.fileId);
        method11149(new ByteBuf(bytes_2));
    }

    public static void method11156() {
        Stack<Class285> stack_1 = Class285.aStack3390;
        synchronized (Class285.aStack3390) {
            Class285.aStack3390 = new Stack<>();
        }
    }

    void method11149(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            if (i_3 == 1) {
                inputSubscriber = InputSubscriber.decode(rsbytebuffer_1);
            }
        }
    }
}
