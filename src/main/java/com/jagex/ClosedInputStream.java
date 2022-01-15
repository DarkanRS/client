package com.jagex;

import java.io.InputStream;

public class ClosedInputStream extends InputStream {

    @Override
    public int read() {
        Class89.sleep(30000L);
        return -1;
    }
}
