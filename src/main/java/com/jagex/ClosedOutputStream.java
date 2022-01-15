package com.jagex;

import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;

public class ClosedOutputStream extends OutputStream {

    public static Image anImage7953;

    static void method12938() {
        for (CacheableNode_Sub7 class282_sub50_sub7_1 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_1 != null; class282_sub50_sub7_1 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
            if (Class14.method539(class282_sub50_sub7_1.clickType)) {
                Static.method2095(class282_sub50_sub7_1);
            }
        }

    }

    @Override
    public void write(int i_1) throws IOException {
        throw new IOException();
    }

}
