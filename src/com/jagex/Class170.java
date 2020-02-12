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
    int anInt2096 = 0;
    int anInt2097 = 0;
    Class76 aClass76_2102;
    boolean aBool2110 = false;
    int anInt2111 = 0;
    LinkedNodeList aClass473_2108 = new LinkedNodeList();
    Class137_Sub1[] aClass137_Sub1Array2106 = new Class137_Sub1[2];
    OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_2112;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2092;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2095;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2101;

    boolean method2881() {
        if (this.aBool2103) {
            if (this.aCacheableNode_Sub19_2093 != null) {
                this.aCacheableNode_Sub19_2093.method26();
                this.aCacheableNode_Sub19_2093 = null;
            }

            if (this.aClass137_Sub1_2104 != null) {
                this.aClass137_Sub1_2104.method2355();
                this.aClass137_Sub1_2104 = null;
            }
        }

        if (this.aBool2094) {
            if (this.aCacheableNode_Sub19_2107 != null) {
                this.aCacheableNode_Sub19_2107.method26();
                this.aCacheableNode_Sub19_2107 = null;
            }

            if (this.aClass137_Sub1Array2106[0] != null) {
                this.aClass137_Sub1Array2106[0].method2355();
                this.aClass137_Sub1Array2106[0] = null;
            }

            if (this.aClass137_Sub1Array2106[1] != null) {
                this.aClass137_Sub1Array2106[1].method2355();
                this.aClass137_Sub1Array2106[1] = null;
            }
        }

        if (this.aBool2103) {
            if (this.aClass158_Sub1_Sub4_2101 != null) {
                this.aCacheableNode_Sub19_2093 = new CacheableNode_Sub19(this.aGraphicalRenderer_Sub1_2112, Class150.aClass150_1953, Class76.aClass76_749, this.anInt2098, this.anInt2099, this.aGraphicalRenderer_Sub1_2112.anInt8475);
            }

            if (this.aBool2110) {
                this.aClass137_Sub1_2104 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, this.anInt2098, this.anInt2099);
            } else if (this.aCacheableNode_Sub19_2093 == null) {
                this.aCacheableNode_Sub19_2093 = new CacheableNode_Sub19(this.aGraphicalRenderer_Sub1_2112, Class150.aClass150_1953, Class76.aClass76_749, this.anInt2098, this.anInt2099);
            }

            this.aBool2103 = false;
            this.aBool2109 = true;
            this.aBool2105 = true;
        }

        if (this.aBool2094) {
            if (this.aClass158_Sub1_Sub4_2101 != null) {
                this.aCacheableNode_Sub19_2107 = new CacheableNode_Sub19(this.aGraphicalRenderer_Sub1_2112, Class150.aClass150_1949, this.aClass76_2102, this.anInt2098, this.anInt2099, this.aGraphicalRenderer_Sub1_2112.anInt8475);
            }

            this.aClass137_Sub1Array2106[0] = new Class137_Sub1(this.aGraphicalRenderer_Sub1_2112, 34037, Class150.aClass150_1949, this.aClass76_2102, this.anInt2098, this.anInt2099);
            this.aClass137_Sub1Array2106[1] = this.anInt2111 > 1 ? new Class137_Sub1(this.aGraphicalRenderer_Sub1_2112, 34037, Class150.aClass150_1949, this.aClass76_2102, this.anInt2098, this.anInt2099) : null;
            this.aBool2094 = false;
            this.aBool2109 = true;
            this.aBool2105 = true;
        }

        if (this.aBool2109) {
            if (this.aClass158_Sub1_Sub4_2101 != null) {
                this.aGraphicalRenderer_Sub1_2112.method8637(this.aClass158_Sub1_Sub4_2092, 101972141);
                this.aClass158_Sub1_Sub4_2092.method13765(null);
                this.aClass158_Sub1_Sub4_2092.method13759(0, null);
                this.aClass158_Sub1_Sub4_2092.method13759(1, null);
                this.aClass158_Sub1_Sub4_2092.method13759(0, this.aClass137_Sub1Array2106[0].method14441());
                this.aClass158_Sub1_Sub4_2092.method13759(1, this.anInt2111 > 1 ? this.aClass137_Sub1Array2106[1].method14441() : null);
                if (this.aBool2110) {
                    this.aClass158_Sub1_Sub4_2092.method13765(this.aClass137_Sub1_2104.method14440());
                }

                this.aGraphicalRenderer_Sub1_2112.method8416(this.aClass158_Sub1_Sub4_2092, (byte) -62);
                this.aGraphicalRenderer_Sub1_2112.method8637(this.aClass158_Sub1_Sub4_2101, 825356298);
                this.aClass158_Sub1_Sub4_2101.method13765(null);
                this.aClass158_Sub1_Sub4_2101.method13759(0, null);
                this.aClass158_Sub1_Sub4_2101.method13759(0, this.aCacheableNode_Sub19_2107);
                this.aClass158_Sub1_Sub4_2101.method13765(this.aCacheableNode_Sub19_2093);
                this.aGraphicalRenderer_Sub1_2112.method8416(this.aClass158_Sub1_Sub4_2101, (byte) -71);
            } else {
                this.aGraphicalRenderer_Sub1_2112.method8637(this.aClass158_Sub1_Sub4_2092, 196803450);
                this.aClass158_Sub1_Sub4_2092.method13765(null);
                this.aClass158_Sub1_Sub4_2092.method13759(0, null);
                this.aClass158_Sub1_Sub4_2092.method13759(1, null);
                this.aClass158_Sub1_Sub4_2092.method13759(0, this.aClass137_Sub1Array2106[0].method14441());
                this.aClass158_Sub1_Sub4_2092.method13759(1, this.anInt2111 > 1 ? this.aClass137_Sub1Array2106[1].method14441() : null);
                if (this.aBool2110) {
                    this.aClass158_Sub1_Sub4_2092.method13765(this.aClass137_Sub1_2104.method14440());
                } else {
                    this.aClass158_Sub1_Sub4_2092.method13765(this.aCacheableNode_Sub19_2093);
                }

                this.aGraphicalRenderer_Sub1_2112.method8416(this.aClass158_Sub1_Sub4_2092, (byte) -89);
            }

            this.aBool2109 = false;
            this.aBool2105 = true;
        }

        if (this.aBool2105) {
            this.aGraphicalRenderer_Sub1_2112.method8637(this.aClass158_Sub1_Sub4_2095, 1305416413);
            this.aBool2105 = !this.aClass158_Sub1_Sub4_2095.method13764();
            this.aGraphicalRenderer_Sub1_2112.method8416(this.aClass158_Sub1_Sub4_2095, (byte) -48);
        }

        return !this.aBool2105;
    }

    void method2883() {
        if (this.aBool2100) {
            if (this.aClass158_Sub1_Sub4_2101 != null) {
                this.aGraphicalRenderer_Sub1_2112.method8416(this.aClass158_Sub1_Sub4_2101, (byte) -56);
                this.aGraphicalRenderer_Sub1_2112.method8637(this.aClass158_Sub1_Sub4_2092, 1705377997);
                this.aClass158_Sub1_Sub4_2092.method15628(0);
                this.aClass158_Sub1_Sub4_2101.method15624(this.anInt2098, this.anInt2099, this.aBool2110);
            }

            this.aGraphicalRenderer_Sub1_2112.method13637();
            this.aGraphicalRenderer_Sub1_2112.method13624(0);
            this.aGraphicalRenderer_Sub1_2112.method13612(1);
            this.aGraphicalRenderer_Sub1_2112.L();
            int i_1 = 0;
            int i_2 = 1;

            Node_Sub5 class282_sub5_3;
            for (Node_Sub5 class282_sub5_4 = (Node_Sub5) this.aClass473_2108.getBack(); class282_sub5_4 != null; class282_sub5_4 = class282_sub5_3) {
                class282_sub5_3 = (Node_Sub5) this.aClass473_2108.getPrevious();
                int i_5 = class282_sub5_4.method12125();

                for (int i_6 = 0; i_6 < i_5; i_6++) {
                    class282_sub5_4.method12119(i_6, this.aClass137_Sub1Array2106[i_1], this.aClass137_Sub1_2104);
                    if (class282_sub5_3 == null && i_6 == i_5 - 1) {
                        this.aGraphicalRenderer_Sub1_2112.method8416(this.aClass158_Sub1_Sub4_2092, (byte) -53);
                        this.aGraphicalRenderer_Sub1_2112.method13640(0, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) this.anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt2096, this.anInt2097);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt2096, this.anInt2097 + this.anInt2099);
                        OpenGL.glTexCoord2f((float) this.anInt2098, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt2096 + this.anInt2098, this.anInt2097 + this.anInt2099);
                        OpenGL.glTexCoord2f((float) this.anInt2098, (float) this.anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt2096 + this.anInt2098, this.anInt2097);
                        OpenGL.glEnd();
                    } else {
                        this.aClass158_Sub1_Sub4_2092.method15628(i_2);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) this.anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, this.anInt2099);
                        OpenGL.glTexCoord2f((float) this.anInt2098, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt2098, this.anInt2099);
                        OpenGL.glTexCoord2f((float) this.anInt2098, (float) this.anInt2099);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt2098, 0);
                        OpenGL.glEnd();
                    }

                    class282_sub5_4.method12121(i_6);
                    i_2 = i_2 + 1 & 0x1;
                    i_1 = i_1 + 1 & 0x1;
                }
            }

            this.aBool2100 = false;
        }

    }

    boolean method2884(int i_1, int i_2, int i_3, int i_4) {
        if (this.aClass158_Sub1_Sub4_2095 != null && !this.aClass473_2108.method7861()) {
            if (i_3 != this.anInt2098 || i_4 != this.anInt2099) {
                this.anInt2098 = i_3;
                this.anInt2099 = i_4;

                for (Node node_5 = this.aClass473_2108.getBack(); node_5 != this.aClass473_2108.head; node_5 = node_5.next) {
                    ((Node_Sub5) node_5).method12122(this.anInt2098, this.anInt2099);
                }

                this.aBool2094 = true;
                this.aBool2103 = true;
                this.aBool2109 = true;
            }

            if (this.method2881()) {
                this.anInt2096 = i_1;
                this.anInt2097 = i_2;
                this.aBool2100 = true;
                this.aGraphicalRenderer_Sub1_2112.method13640(-this.anInt2096, this.anInt2099 + this.anInt2097 - this.aGraphicalRenderer_Sub1_2112.method8523((byte) 112).method2716());
                this.aGraphicalRenderer_Sub1_2112.method8637(this.aClass158_Sub1_Sub4_2095, -2104794592);
                this.aGraphicalRenderer_Sub1_2112.ba(3, 0);
                this.aClass158_Sub1_Sub4_2095.method15628(0);
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
        class282_sub5_1.remove();
        this.method2886();
    }

    void method2886() {
        int i_1 = 0;
        boolean bool_2 = false;
        Class76 class76_3 = Class76.aClass76_751;

        for (Node_Sub5 class282_sub5_4 = (Node_Sub5) this.aClass473_2108.getBack(); class282_sub5_4 != null; class282_sub5_4 = (Node_Sub5) this.aClass473_2108.getPrevious()) {
            Class76 class76_7 = class282_sub5_4.method12127();
            if (class76_7.anInt748 > class76_3.anInt748) {
                class76_3 = class76_7;
            }

            bool_2 |= class282_sub5_4.method12126();
            i_1 += class282_sub5_4.method12125();
        }

        if (class76_3 != this.aClass76_2102) {
            this.aClass76_2102 = class76_3;
            this.aBool2094 = true;
        }

        int i_6 = this.anInt2111 > 2 ? 2 : this.anInt2111;
        int i_5 = i_1 > 2 ? 2 : i_1;
        if (i_6 != i_5) {
            this.aBool2094 = true;
            this.aBool2109 = true;
        }

        if (bool_2 != this.aBool2110) {
            this.aBool2110 = bool_2;
            this.aBool2103 = true;
        }

        this.anInt2111 = i_1;
    }

    Class170(OpenGLGraphicalRenderer class505_sub1_1) {
        this.aClass76_2102 = Class76.aClass76_751;
        this.aGraphicalRenderer_Sub1_2112 = class505_sub1_1;
        if (this.aGraphicalRenderer_Sub1_2112.aBool8472 && this.aGraphicalRenderer_Sub1_2112.aBool8401) {
            this.aClass158_Sub1_Sub4_2095 = this.aClass158_Sub1_Sub4_2092 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_2112);
            if (this.aGraphicalRenderer_Sub1_2112.anInt8475 > 1 && this.aGraphicalRenderer_Sub1_2112.aBool8338 && this.aGraphicalRenderer_Sub1_2112.aBool8488) {
                this.aClass158_Sub1_Sub4_2095 = this.aClass158_Sub1_Sub4_2101 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_2112);
            }
        }

    }

    boolean method2896() {
        return this.aClass158_Sub1_Sub4_2095 != null;
    }

    void method2898() {
        this.aClass158_Sub1_Sub4_2092 = null;
        this.aClass158_Sub1_Sub4_2101 = null;
        this.aClass158_Sub1_Sub4_2095 = null;
        this.aCacheableNode_Sub19_2093 = null;
        this.aClass137_Sub1_2104 = null;
        this.aClass137_Sub1Array2106 = null;
        this.aCacheableNode_Sub19_2107 = null;
        if (!this.aClass473_2108.method7861()) {
            for (Node node_1 = this.aClass473_2108.getBack(); node_1 != this.aClass473_2108.head; node_1 = node_1.next) {
                ((Node_Sub5) node_1).method12120();
            }
        }

        this.anInt2099 = 1;
        this.anInt2098 = 1;
    }

    boolean method2900(Node_Sub5 class282_sub5_1) {
        if (this.aClass158_Sub1_Sub4_2095 != null) {
            if (class282_sub5_1.method12141() || class282_sub5_1.method12136()) {
                this.aClass473_2108.insertBack(class282_sub5_1);
                this.method2886();
                if (this.method2881()) {
                    if (this.anInt2098 != -1 && this.anInt2099 != -1) {
                        class282_sub5_1.method12122(this.anInt2098, this.anInt2099);
                    }

                    class282_sub5_1.aBool7506 = true;
                    return true;
                }
            }

            this.method2885(class282_sub5_1);
        }

        return false;
    }

}
