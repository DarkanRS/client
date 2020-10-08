package com.jagex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Comparable_Sub1 implements Comparable {

    public static Class306 aClass306_3771;
    static IComponentDefinitions[] aClass118Array3772;
    long aLong3767;
    long aLong3769;
    Node_Sub39 anObject3768;

    Long anObject3770;

    Comparable_Sub1(Node_Sub39 object_1, Long object_2) {
        anObject3768 = object_1;
        anObject3770 = object_2;
    }

    static void method5827() {
        try {
            File file_1 = new File(Class110.aString1103, "random.dat");
            int i_3;
            if (file_1.exists()) {
                Engine.PLAYER_UID192 = new UID192(new Class442(file_1, 25L), 24);
            } else {
                label34:
                for (int i_2 = 0; i_2 < MapSize.aStringArray1077.length; i_2++) {
                    for (i_3 = 0; i_3 < Class246.aStringArray3028.length; i_3++) {
                        File file_4 = new File(Class246.aStringArray3028[i_3] + MapSize.aStringArray1077[i_2] + File.separatorChar + "random.dat");
                        if (file_4.exists()) {
                            Engine.PLAYER_UID192 = new UID192(new Class442(file_4, 25L), 24);
                            break label34;
                        }
                    }
                }
            }
            if (Engine.PLAYER_UID192 == null) {
                RandomAccessFile randomaccessfile_5 = new RandomAccessFile(file_1, "rw");
                i_3 = randomaccessfile_5.read();
                randomaccessfile_5.seek(0L);
                randomaccessfile_5.write(i_3);
                randomaccessfile_5.seek(0L);
                randomaccessfile_5.close();
                Engine.PLAYER_UID192 = new UID192(new Class442(file_1, 25L), 24);
            }
        } catch (IOException ignored) {
        }
    }

    public boolean equals(Object object_1) {
        if (object_1 instanceof Comparable_Sub1) {
            return anObject3770.equals(((Comparable_Sub1) object_1).anObject3770);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int compareTo(Object object_1) {
        return method5822((Comparable_Sub1) object_1);
    }

    int method5822(Comparable_Sub1 class328_1) {
        return aLong3769 < class328_1.aLong3769 ? -1 : (aLong3769 > class328_1.aLong3769 ? 1 : 0);
    }
}
