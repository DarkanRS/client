package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class442 {

    RandomAccessFile aRandomAccessFile5359;
    long aLong5360;
    long aLong5358;

    public Class442(File file_1, long long_3) throws IOException {
        long long_31 = long_3;
        if (long_31 == -1L) {
            long_31 = Long.MAX_VALUE;
        }

        if (file_1.length() > long_31) {
            file_1.delete();
        }

        aRandomAccessFile5359 = new RandomAccessFile(file_1, "rw");
        aLong5358 = long_31;
        aLong5360 = 0L;
        int i_5 = aRandomAccessFile5359.read();
        if (i_5 != -1 && !"rw".equals("r")) {
            aRandomAccessFile5359.seek(0L);
            aRandomAccessFile5359.write(i_5);
        }

        aRandomAccessFile5359.seek(0L);
    }

    static void method7403(int i_0, int i_1, int i_2, boolean bool_3) {
        if (MovingAnimation.isInterfaceLoaded(i_0, null)) {
            InteractableObject.method16099(CustomCursorsPreference.INTERFACES[i_0].components, -1, i_1, i_2, bool_3);
        }

    }

    public void method7385() throws IOException {
        if (aRandomAccessFile5359 != null) {
            aRandomAccessFile5359.close();
            aRandomAccessFile5359 = null;
        }

    }

    public void method7386(byte[] bytes_1, int i_2, int i_3) throws IOException {
        if (aLong5360 + i_3 > aLong5358) {
            aRandomAccessFile5359.seek(aLong5358);
            aRandomAccessFile5359.write(1);
            throw new EOFException();
        } else {
            aRandomAccessFile5359.write(bytes_1, i_2, i_3);
            aLong5360 += i_3;
        }
    }

    public long method7388() throws IOException {
        return aRandomAccessFile5359.length();
    }

    public int method7389(byte[] bytes_1, int i_2, int i_3) throws IOException {
        int i_5 = aRandomAccessFile5359.read(bytes_1, i_2, i_3);
        if (i_5 > 0) {
            aLong5360 += i_5;
        }

        return i_5;
    }

    @Override
    protected void finalize() throws Throwable {
        if (aRandomAccessFile5359 != null) {
            System.out.println();
            method7385();
        }

    }

    void method7390(long long_1) throws IOException {
        aRandomAccessFile5359.seek(long_1);
        aLong5360 = long_1;
    }

}
