package com.jagex;

import jaggl.OpenGL;

public class Class170 {

    CacheableNode_Sub19 aCacheableNode_Sub19_2093;
    Class137_Sub1 aClass137_Sub1_2104;
    CacheableNode_Sub19 aCacheableNode_Sub19_2107;
    boolean aBool2103 = true;
    boolean aBool2109 = true;
    boolean aBool2105 = true;
    boolean aBool2094 = true;
    boolean aBool2100;
    int anInt2098 = 1;
    int anInt2099 = 1;
    int anInt2096;
    int anInt2097;
    Class76 aClass76_2102;
    boolean aBool2110;
    int anInt2111;
    LinkedNodeList aClass473_2108 = new LinkedNodeList();
    Class137_Sub1[] aClass137_Sub1Array2106 = new Class137_Sub1[2];
    OpenGLHardwareRenderer aGraphicalRenderer_Sub1_2112;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2092;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2095;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2101;

    Class170(OpenGLHardwareRenderer class505_sub1_1) {
        aClass76_2102 = Class76.aClass76_751;
        aGraphicalRenderer_Sub1_2112 = class505_sub1_1;
        if (aGraphicalRenderer_Sub1_2112.aBool8472 && aGraphicalRenderer_Sub1_2112.aBool8401) {
            aClass158_Sub1_Sub4_2095 = aClass158_Sub1_Sub4_2092 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_2112);
            if (aGraphicalRenderer_Sub1_2112.anInt8475 > 1 && aGraphicalRenderer_Sub1_2112.aBool8338 && aGraphicalRenderer_Sub1_2112.aBool8488) {
                aClass158_Sub1_Sub4_2095 = aClass158_Sub1_Sub4_2101 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_2112);
            }
        }

    }

    boolean method2881() {
        if (aBool2103) {
            if (aCacheableNode_Sub19_2093 != null) {
                aCacheableNode_Sub19_2093.method26();
                aCacheableNode_Sub19_2093 = null;
            }

            if (aClass137_Sub1_2104 != null) {
                aClass137_Sub1_2104.method2355();
                aClass137_Sub1_2104 = null;
            }
        }

        if (aBool2094) {
            if (aCacheableNode_Sub19_2107 != null) {
                aCacheableNode_Sub19_2107.method26();
                aCacheableNode_Sub19_2107 = null;
            }

            if (aClass137_Sub1Array2106[0] != null) {
                aClass137_Sub1Array2106[0].method2355();
                aClass137_Sub1Array2106[0] = null;
            }

            if (aClass137_Sub1Array2106[1] != null) {
                aClass137_Sub1Array2106[1].method2355();
                aClass137_Sub1Array2106[1] = null;
            }
        }

        if (aBool2103) {
            if (aClass158_Sub1_Sub4_2101 != null) {
                aCacheableNode_Sub19_2093 = new CacheableNode_Sub19(aGraphicalRenderer_Sub1_2112, Class150.aClass150_1953, Class76.aClass76_749, anInt2098, anInt2099, aGraphicalRenderer_Sub1_2112.anInt8475);
            }

            if (aBool2110) {
                aClass137_Sub1_2104 = new Class137_Sub1(aGraphicalRenderer_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, anInt2098, anInt2099);
            } else if (aCacheableNode_Sub19_2093 == null) {
                aCacheableNode_Sub19_2093 = new CacheableNode_Sub19(aGraphicalRenderer_Sub1_2112, Class150.aClass150_1953, Class76.aClass76_749, anInt2098, anInt2099);
            }

            aBool2103 = false;
            aBool2109 = true;
            aBool2105 = true;
        }

        if (aBool2094) {
            if (aClass158_Sub1_Sub4_2101 != null) {
                aCacheableNode_Sub19_2107 = new CacheableNode_Sub19(aGraphicalRenderer_Sub1_2112, Class150.aClass150_1949, aClass76_2102, anInt2098, anInt2099, aGraphicalRenderer_Sub1_2112.anInt8475);
            }

            aClass137_Sub1Array2106[0] = new Class137_Sub1(aGraphicalRenderer_Sub1_2112, 34037, Class150.aClass150_1949, aClass76_2102, anInt2098, anInt2099);
            aClass137_Sub1Array2106[1] = anInt2111 > 1 ? new Class137_Sub1(aGraphicalRenderer_Sub1_2112, 34037, Class150.aClass150_1949, aClass76_2102, anInt2098, anInt2099) : null;
            aBool2094 = false;
            aBool2109 = true;
            aBool2105 = true;
        }

        if (aBool2109) {
            if (aClass158_Sub1_Sub4_2101 != null) {
                aGraphicalRenderer_Sub1_2112.method8637(aClass158_Sub1_Sub4_2092);
                aClass158_Sub1_Sub4_2092.method13765(null);
                aClass158_Sub1_Sub4_2092.method13759(0, null);
                aClass158_Sub1_Sub4_2092.method13759(1, null);
                aClass158_Sub1_Sub4_2092.method13759(0, aClass137_Sub1Array2106[0].method14441());
                aClass158_Sub1_Sub4_2092.method13759(1, anInt2111 > 1 ? aClass137_Sub1Array2106[1].method14441() : null);
                if (aBool2110) {
                    aClass158_Sub1_Sub4_2092.method13765(aClass137_Sub1_2104.method14440());
                }

                aGraphicalRenderer_Sub1_2112.method8416(aClass158_Sub1_Sub4_2092);
                aGraphicalRenderer_Sub1_2112.method8637(aClass158_Sub1_Sub4_2101);
                aClass158_Sub1_Sub4_2101.method13765(null);
                aClass158_Sub1_Sub4_2101.method13759(0, null);
                aClass158_Sub1_Sub4_2101.method13759(0, aCacheableNode_Sub19_2107);
                aClass158_Sub1_Sub4_2101.method13765(aCacheableNode_Sub19_2093);
                aGraphicalRenderer_Sub1_2112.method8416(aClass158_Sub1_Sub4_2101);
            } else {
                aGraphicalRenderer_Sub1_2112.method8637(aClass158_Sub1_Sub4_2092);
                aClass158_Sub1_Sub4_2092.method13765(null);
                aClass158_Sub1_Sub4_2092.method13759(0, null);
                aClass158_Sub1_Sub4_2092.method13759(1, null);
                aClass158_Sub1_Sub4_2092.method13759(0, aClass137_Sub1Array2106[0].method14441());
                aClass158_Sub1_Sub4_2092.method13759(1, anInt2111 > 1 ? aClass137_Sub1Array2106[1].method14441() : null);
                if (aBool2110) {
                    aClass158_Sub1_Sub4_2092.method13765(aClass137_Sub1_2104.method14440());
                } else {
                    aClass158_Sub1_Sub4_2092.method13765(aCacheableNode_Sub19_2093);
                }

                aGraphicalRenderer_Sub1_2112.method8416(aClass158_Sub1_Sub4_2092);
            }

            aBool2109 = false;
            aBool2105 = true;
        }

        if (aBool2105) {
            aGraphicalRenderer_Sub1_2112.method8637(aClass158_Sub1_Sub4_2095);
            aBool2105 = !aClass158_Sub1_Sub4_2095.method13764();
            aGraphicalRenderer_Sub1_2112.method8416(aClass158_Sub1_Sub4_2095);
        }

        return !aBool2105;
    }

    void method2883() {
        if (aBool2100) {
            if (aClass158_Sub1_Sub4_2101 != null) {
                aGraphicalRenderer_Sub1_2112.method8416(aClass158_Sub1_Sub4_2101);
                aGraphicalRenderer_Sub1_2112.method8637(aClass158_Sub1_Sub4_2092);
                aClass158_Sub1_Sub4_2092.method15628(0);
                aClass158_Sub1_Sub4_2101.method15624(anInt2098, anInt2099, aBool2110);
            }

            aGraphicalRenderer_Sub1_2112.method13637();
            aGraphicalRenderer_Sub1_2112.method13624(0);
            aGraphicalRenderer_Sub1_2112.method13612(1);
            aGraphicalRenderer_Sub1_2112.L();
            int i_1 = 0;
            int i_2 = 1;

            Node_Sub5 class282_sub5_3;
            for (Node_Sub5 class282_sub5_4 = (Node_Sub5) aClass473_2108.getBack(); class282_sub5_4 != null; class282_sub5_4 = class282_sub5_3) {
                class282_sub5_3 = (Node_Sub5) aClass473_2108.getPrevious();
                int i_5 = class282_sub5_4.method12125();

                for (int i_6 = 0; i_6 < i_5; i_6++) {
                    class282_sub5_4.method12119(aClass137_Sub1Array2106[i_1]);
                    if (class282_sub5_3 == null && i_6 == i_5 - 1) {
                        aGraphicalRenderer_Sub1_2112.method8416(aClass158_Sub1_Sub4_2092);
                        aGraphicalRenderer_Sub1_2112.method13640(0, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(anInt2096, anInt2097);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(anInt2096, anInt2097 + anInt2099);
                        OpenGL.glTexCoord2f(anInt2098, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt2096 + anInt2098, anInt2097 + anInt2099);
                        OpenGL.glTexCoord2f(anInt2098, anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt2096 + anInt2098, anInt2097);
                    } else {
                        aClass158_Sub1_Sub4_2092.method15628(i_2);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, anInt2099);
                        OpenGL.glTexCoord2f(anInt2098, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt2098, anInt2099);
                        OpenGL.glTexCoord2f(anInt2098, anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt2098, 0);
                    }
                    OpenGL.glEnd();

                    class282_sub5_4.method12121();
                    i_2 = i_2 + 1 & 0x1;
                    i_1 = i_1 + 1 & 0x1;
                }
            }

            aBool2100 = false;
        }

    }

    boolean method2884(int i_1, int i_2, int i_3, int i_4) {
        if (aClass158_Sub1_Sub4_2095 != null && !aClass473_2108.method7861()) {
            if (i_3 != anInt2098 || i_4 != anInt2099) {
                anInt2098 = i_3;
                anInt2099 = i_4;

                for (Node node_5 = aClass473_2108.getBack(); node_5 != aClass473_2108.head; node_5 = node_5.next) {
                    ((Node_Sub5) node_5).method12122(anInt2098, anInt2099);
                }

                aBool2094 = true;
                aBool2103 = true;
                aBool2109 = true;
            }

            if (method2881()) {
                anInt2096 = i_1;
                anInt2097 = i_2;
                aBool2100 = true;
                aGraphicalRenderer_Sub1_2112.method13640(-anInt2096, anInt2099 + anInt2097 - aGraphicalRenderer_Sub1_2112.method8523().method2716());
                aGraphicalRenderer_Sub1_2112.method8637(aClass158_Sub1_Sub4_2095);
                aGraphicalRenderer_Sub1_2112.ba(3, 0);
                aClass158_Sub1_Sub4_2095.method15628(0);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    void method2885(Node_Sub5 class282_sub5_1) {
        class282_sub5_1.aBool7506 = false;
        class282_sub5_1.method12120();
        class282_sub5_1.unlink();
        method2886();
    }

    void method2886() {
        int i_1 = 0;
        boolean bool_2 = false;
        Class76 class76_3 = Class76.aClass76_751;

        for (Node_Sub5 class282_sub5_4 = (Node_Sub5) aClass473_2108.getBack(); class282_sub5_4 != null; class282_sub5_4 = (Node_Sub5) aClass473_2108.getPrevious()) {
            Class76 class76_7 = class282_sub5_4.method12127();
            if (class76_7.anInt748 > class76_3.anInt748) {
                class76_3 = class76_7;
            }

            bool_2 |= class282_sub5_4.method12126();
            i_1 += class282_sub5_4.method12125();
        }

        if (class76_3 != aClass76_2102) {
            aClass76_2102 = class76_3;
            aBool2094 = true;
        }

        int i_6 = Math.min(2, anInt2111);
        int i_5 = Math.min(2, i_1);
        if (i_6 != i_5) {
            aBool2094 = true;
            aBool2109 = true;
        }

        if (bool_2 != aBool2110) {
            aBool2110 = bool_2;
            aBool2103 = true;
        }

        anInt2111 = i_1;
    }

    boolean method2896() {
        return aClass158_Sub1_Sub4_2095 != null;
    }

    void method2898() {
        aClass158_Sub1_Sub4_2092 = null;
        aClass158_Sub1_Sub4_2101 = null;
        aClass158_Sub1_Sub4_2095 = null;
        aCacheableNode_Sub19_2093 = null;
        aClass137_Sub1_2104 = null;
        aClass137_Sub1Array2106 = null;
        aCacheableNode_Sub19_2107 = null;
        if (!aClass473_2108.method7861()) {
            for (Node node_1 = aClass473_2108.getBack(); node_1 != aClass473_2108.head; node_1 = node_1.next) {
                ((Node_Sub5) node_1).method12120();
            }
        }

        anInt2099 = 1;
        anInt2098 = 1;
    }

    boolean method2900(Node_Sub5 class282_sub5_1) {
        if (aClass158_Sub1_Sub4_2095 != null) {
            if (class282_sub5_1.method12141() || class282_sub5_1.method12136()) {
                aClass473_2108.insertBack(class282_sub5_1);
                method2886();
                if (method2881()) {
                    if (anInt2098 != -1 && anInt2099 != -1) {
                        class282_sub5_1.method12122(anInt2098, anInt2099);
                    }

                    class282_sub5_1.aBool7506 = true;
                    return true;
                }
            }

            method2885(class282_sub5_1);
        }

        return false;
    }

}
