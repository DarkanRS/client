import java.awt.Canvas;
import java.awt.Component;
import java.util.Random;

public abstract class FontRenderer {

    static int anInt61 = -1;

    static int anInt62 = -1;

    static int anInt63 = 0;

    static int anInt64 = 0;

    static int anInt65 = 0;

    static int anInt57 = 0;

    static int anInt67 = 0;

    static int anInt68 = 0;

    static String[] aStringArray69 = new String[100];

    GraphicalRenderer renderer;

    FontMetrics fontMetrics;

    public void renderText(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            this.method365(i_4, i_5, -52680990);
            this.method371(string_1, i_2, i_3, (NativeSprite[]) null, (int[]) null, (Class455) null, 0, 0, (byte) 3);
        }
    }

    public void method359(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            this.method365(i_4, i_5, 248909725);
            this.method371(string_1, i_2 - this.fontMetrics.getWidthNoSprites(string_1, -1967833701), i_3, (NativeSprite[]) null, (int[]) null, (Class455) null, 0, 0, (byte) 3);
        }
    }

    public void method360(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            this.method365(i_4, i_5, 289850430);
            this.method371(string_1, i_2 - this.fontMetrics.getWidthNoSprites(string_1, -1967833701) / 2, i_3, (NativeSprite[]) null, (int[]) null, (Class455) null, 0, 0, (byte) 3);
        }
    }

    abstract void method362(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

    void method365(int i_1, int i_2, int i_3) {
        anInt61 = -1;
        anInt62 = -1;
        anInt63 = i_1;
        anInt64 = i_1;
        anInt67 = 0;
        anInt68 = 0;
        if (i_2 == -1) {
            i_2 = 0;
        }
        anInt65 = i_2;
        anInt57 = i_2;
    }

    public int method367(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, Random random_10, int i_11, int[] ints_12, NativeSprite[] arr_13, int[] ints_14, int i_15) {
        if (string_1 == null) {
            return 0;
        } else {
            random_10.setSeed((long) i_11);
            int i_16 = 192 + (random_10.nextInt() & 0x1f);
            this.method365(i_16 << 24 | i_6 & 0xffffff, i_7 == -1 ? 0 : i_16 << 24 | i_7 & 0xffffff, 1360524651);
            int i_17 = string_1.length();
            int[] ints_18 = new int[i_17];
            int i_19 = 0;
            int i_20;
            for (i_20 = 0; i_20 < i_17; i_20++) {
                ints_18[i_20] = i_19;
                if ((random_10.nextInt() & 0x3) == 0) {
                    ++i_19;
                }
            }
            i_20 = i_2;
            int i_21 = i_3 + this.fontMetrics.anInt4978;
            int i_22 = -1;
            if (i_9 == 1) {
                i_21 += (i_5 - this.fontMetrics.anInt4978 - this.fontMetrics.anInt4979) / 2;
            } else if (i_9 == 2) {
                i_21 = i_3 + i_5 - this.fontMetrics.anInt4979;
            }
            if (i_8 == 1) {
                i_22 = this.fontMetrics.getWidthNoSprites(string_1, -1967833701) + i_19;
                i_20 = (i_4 - i_22) / 2 + i_2;
            } else if (i_8 == 2) {
                i_22 = this.fontMetrics.getWidthNoSprites(string_1, -1967833701) + i_19;
                i_20 = i_2 + (i_4 - i_22);
            }
            this.method372(string_1, i_20, i_21, arr_13, ints_14, ints_18, (int[]) null, 1660900204);
            if (ints_12 != null) {
                if (i_22 == -1) {
                    i_22 = this.fontMetrics.getWidthNoSprites(string_1, -1967833701) + i_19;
                }
                ints_12[0] = i_20;
                ints_12[1] = i_21 - this.fontMetrics.anInt4978;
                ints_12[2] = i_22;
                ints_12[3] = this.fontMetrics.anInt4979 + this.fontMetrics.anInt4978;
            }
            return i_19;
        }
    }

    public void method368(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte b_7) {
        if (string_1 != null) {
            this.method365(i_4, i_5, 1182633518);
            int i_8 = string_1.length();
            int[] ints_9 = new int[i_8];
            int[] ints_10 = new int[i_8];
            for (int i_11 = 0; i_11 < i_8; i_11++) {
                ints_9[i_11] = (int) (Math.sin((double) i_6 / 5.0D + (double) i_11 / 5.0D) * 5.0D);
                ints_10[i_11] = (int) (Math.sin((double) i_6 / 5.0D + (double) i_11 / 3.0D) * 5.0D);
            }
            this.method372(string_1, i_2 - this.fontMetrics.getWidthNoSprites(string_1, -1967833701) / 2, i_3, (NativeSprite[]) null, (int[]) null, ints_9, ints_10, 1888974579);
        }
    }

    void method369(String string_1, byte b_2) {
        try {
            if (string_1.startsWith("col=")) {
                anInt64 = anInt64 & ~0xffffff | Class285.method5026(string_1.substring(4), 16, (byte) 40) & 0xffffff;
            } else if (string_1.equals("/col")) {
                anInt64 = anInt64 & ~0xffffff | anInt63 & 0xffffff;
            }
            if (string_1.startsWith("argb=")) {
                anInt64 = Class285.method5026(string_1.substring(5), 16, (byte) -59);
            } else if (string_1.equals("/argb")) {
                anInt64 = anInt63;
            } else if (string_1.startsWith("str=")) {
                anInt61 = anInt64 & ~0xffffff | Class285.method5026(string_1.substring(4), 16, (byte) 1);
            } else if (string_1.equals("str")) {
                anInt61 = anInt64 & ~0xffffff | 0x800000;
            } else if (string_1.equals("/str")) {
                anInt61 = -1;
            } else if (string_1.startsWith("u=")) {
                anInt62 = anInt64 & ~0xffffff | Class285.method5026(string_1.substring(2), 16, (byte) 7);
            } else if (string_1.equals("u")) {
                anInt62 = anInt64 & ~0xffffff;
            } else if (string_1.equals("/u")) {
                anInt62 = -1;
            } else if (string_1.equalsIgnoreCase("shad=-1")) {
                anInt57 = 0;
            } else if (string_1.startsWith("shad=")) {
                anInt57 = anInt64 & ~0xffffff | Class285.method5026(string_1.substring(5), 16, (byte) 100);
            } else if (string_1.equals("shad")) {
                anInt57 = anInt64 & ~0xffffff;
            } else if (string_1.equals("/shad")) {
                anInt57 = anInt65;
            } else if (string_1.equals("br")) {
                this.method365(anInt63, anInt65, -571655303);
            }
        } catch (Exception exception_4) {
            ;
        }
    }

    void method370(String string_1, int i_2, int i_3) {
        int i_4 = 0;
        boolean bool_5 = false;
        for (int i_6 = 0; i_6 < string_1.length(); i_6++) {
            char var_7 = string_1.charAt(i_6);
            if (var_7 == 60) {
                bool_5 = true;
            } else if (var_7 == 62) {
                bool_5 = false;
            } else if (!bool_5 && var_7 == 32) {
                ++i_4;
            }
        }
        if (i_4 > 0) {
            anInt67 = (i_2 - this.fontMetrics.getWidthNoSprites(string_1, -1967833701) << 8) / i_4;
        }
    }

    void method371(String string_1, int i_2, int i_3, NativeSprite[] arr_4, int[] ints_5, Class455 class455_6, int i_7, int i_8, byte b_9) {
        i_3 -= this.fontMetrics.anInt4975;
        int i_10 = -1;
        int i_11 = -1;
        int i_12 = string_1.length();
        for (int i_13 = 0; i_13 < i_12; i_13++) {
            char var_14 = (char) (Class242.getByteForChar(string_1.charAt(i_13)) & 0xff);
            if (var_14 == 60) {
                i_10 = i_13;
            } else {
                if (var_14 == 62 && i_10 != -1) {
                    String string_15 = string_1.substring(i_10 + 1, i_13);
                    i_10 = -1;
                    if (string_15.equals("lt")) {
                        var_14 = 60;
                    } else if (string_15.equals("gt")) {
                        var_14 = 62;
                    } else if (string_15.equals("nbsp")) {
                        var_14 = 160;
                    } else if (string_15.equals("shy")) {
                        var_14 = 173;
                    } else if (string_15.equals("times")) {
                        var_14 = 215;
                    } else if (string_15.equals("euro")) {
                        var_14 = 8364;
                    } else if (string_15.equals("copy")) {
                        var_14 = 169;
                    } else {
                        if (!string_15.equals("reg")) {
                            if (string_15.startsWith("img=")) {
                                try {
                                    int i_16 = Class328.parseInt(string_15.substring(4), -1416049939);
                                    NativeSprite nativesprite_17 = arr_4[i_16];
                                    int i_18 = ints_5 != null ? ints_5[i_16] : nativesprite_17.method2748();
                                    if ((anInt64 & ~0xffffff) == -16777216) {
                                        nativesprite_17.method2742(i_2, i_3 + this.fontMetrics.anInt4975 - i_18, 1, 0, 1);
                                    } else {
                                        nativesprite_17.method2742(i_2, i_3 + this.fontMetrics.anInt4975 - i_18, 0, anInt64 & ~0xffffff | 0xffffff, 1);
                                    }
                                    i_2 += arr_4[i_16].method228();
                                    i_11 = -1;
                                } catch (Exception exception_21) {
                                    ;
                                }
                            } else {
                                this.method369(string_15, (byte) 85);
                            }
                            continue;
                        }
                        var_14 = 174;
                    }
                }
                if (i_10 == -1) {
                    if (i_11 != -1) {
                        i_2 += this.fontMetrics.getKerning(i_11, var_14, 202656295);
                    }
                    if (var_14 != 32) {
                        if (class455_6 == null) {
                            if ((anInt57 & ~0xffffff) != 0) {
                                this.UA(var_14, i_2 + 1, i_3 + 1, anInt57, true);
                            }
                            this.UA(var_14, i_2, i_3, anInt64, false);
                        } else {
                            if ((anInt57 & ~0xffffff) != 0) {
                                this.method374(var_14, i_2 + 1, i_3 + 1, anInt57, true, class455_6, i_7, i_8);
                            }
                            this.method374(var_14, i_2, i_3, anInt64, false, class455_6, i_7, i_8);
                        }
                    } else if (anInt67 > 0) {
                        anInt68 += anInt67;
                        i_2 += anInt68 >> 8;
                        anInt68 &= 0xff;
                    }
                    int i_20 = this.fontMetrics.method6945(var_14, (byte) -117);
                    if (anInt61 != -1) {
                        this.renderer.method8659(i_2, i_3 + (int) (0.7D * (double) this.fontMetrics.anInt4975), i_20, anInt61, -1221933071);
                    }
                    if (anInt62 != -1) {
                        this.renderer.method8659(i_2, i_3 + this.fontMetrics.anInt4975 + 1, i_20, anInt62, 435318936);
                    }
                    i_2 += i_20;
                    i_11 = var_14;
                }
            }
        }
    }

    void method372(String string_1, int i_2, int i_3, NativeSprite[] arr_4, int[] ints_5, int[] ints_6, int[] ints_7, int i_8) {
        i_3 -= this.fontMetrics.anInt4975;
        int i_9 = -1;
        int i_10 = -1;
        int i_11 = 0;
        int i_12 = string_1.length();
        for (int i_13 = 0; i_13 < i_12; i_13++) {
            char var_14 = (char) (Class242.getByteForChar(string_1.charAt(i_13)) & 0xff);
            if (var_14 == 60) {
                i_9 = i_13;
            } else {
                int i_16;
                int i_17;
                if (var_14 == 62 && i_9 != -1) {
                    String string_15 = string_1.substring(i_9 + 1, i_13);
                    i_9 = -1;
                    if (string_15.equals("lt")) {
                        var_14 = 60;
                    } else if (string_15.equals("gt")) {
                        var_14 = 62;
                    } else if (string_15.equals("nbsp")) {
                        var_14 = 160;
                    } else if (string_15.equals("shy")) {
                        var_14 = 173;
                    } else if (string_15.equals("times")) {
                        var_14 = 215;
                    } else if (string_15.equals("euro")) {
                        var_14 = 8364;
                    } else if (string_15.equals("copy")) {
                        var_14 = 169;
                    } else {
                        if (!string_15.equals("reg")) {
                            if (string_15.startsWith("img=")) {
                                try {
                                    if (ints_6 != null) {
                                        i_16 = ints_6[i_11];
                                    } else {
                                        i_16 = 0;
                                    }
                                    if (ints_7 != null) {
                                        i_17 = ints_7[i_11];
                                    } else {
                                        i_17 = 0;
                                    }
                                    ++i_11;
                                    int i_18 = Class328.parseInt(string_15.substring(4), 1488511496);
                                    NativeSprite nativesprite_19 = arr_4[i_18];
                                    int i_20 = ints_5 != null ? ints_5[i_18] : nativesprite_19.method2748();
                                    nativesprite_19.method2742(i_16 + i_2, i_3 + this.fontMetrics.anInt4975 - i_20 + i_17, 1, 0, 1);
                                    i_2 += arr_4[i_18].method228();
                                    i_10 = -1;
                                } catch (Exception exception_23) {
                                    ;
                                }
                            } else {
                                this.method369(string_15, (byte) 115);
                            }
                            continue;
                        }
                        var_14 = 174;
                    }
                }
                if (i_9 == -1) {
                    if (i_10 != -1) {
                        i_2 += this.fontMetrics.getKerning(i_10, var_14, -646964881);
                    }
                    int i_22;
                    if (ints_6 != null) {
                        i_22 = ints_6[i_11];
                    } else {
                        i_22 = 0;
                    }
                    if (ints_7 != null) {
                        i_16 = ints_7[i_11];
                    } else {
                        i_16 = 0;
                    }
                    ++i_11;
                    if (var_14 != 32) {
                        if ((anInt57 & ~0xffffff) != 0) {
                            this.UA(var_14, i_22 + i_2 + 1, i_3 + i_16 + 1, anInt57, true);
                        }
                        this.UA(var_14, i_22 + i_2, i_3 + i_16, anInt64, false);
                    } else if (anInt67 > 0) {
                        anInt68 += anInt67;
                        i_2 += anInt68 >> 8;
                        anInt68 &= 0xff;
                    }
                    i_17 = this.fontMetrics.method6945(var_14, (byte) -20);
                    if (anInt61 != -1) {
                        this.renderer.method8659(i_2, i_3 + (int) ((double) this.fontMetrics.anInt4975 * 0.7D), i_17, anInt61, -645910355);
                    }
                    if (anInt62 != -1) {
                        this.renderer.method8659(i_2, i_3 + this.fontMetrics.anInt4975, i_17, anInt62, -510924109);
                    }
                    i_2 += i_17;
                    i_10 = var_14;
                }
            }
        }
    }

    abstract void UA(char var1, int var2, int var3, int var4, boolean var5);

    public int method373(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, NativeSprite[] arr_12, int[] ints_13, Class455 class455_14, int i_15, int i_16, byte b_17) {
        if (string_1 == null) {
            return 0;
        } else {
            this.method365(i_6, i_7, 745766148);
            if (i_10 == 0) {
                i_10 = this.fontMetrics.anInt4975;
            }
            int[] ints_18;
            if (i_5 < i_10 + this.fontMetrics.anInt4979 + this.fontMetrics.anInt4978 && i_5 < i_10 + i_10) {
                ints_18 = null;
            } else {
                ints_18 = new int[] { i_4 };
            }
            int i_19 = this.fontMetrics.method6987(string_1, ints_18, aStringArray69, arr_12, (byte) 0);
            if (i_11 == -1) {
                i_11 = i_5 / i_10;
                if (i_11 <= 0) {
                    i_11 = 1;
                }
            }
            if (i_11 > 0 && i_19 >= i_11) {
                aStringArray69[i_11 - 1] = this.fontMetrics.method6959(aStringArray69[i_11 - 1], i_4, arr_12, 1987203414);
                i_19 = i_11;
            }
            if (i_9 == 3 && i_19 == 1) {
                i_9 = 1;
            }
            int i_20;
            int i_21;
            if (i_9 == 0) {
                i_20 = i_3 + this.fontMetrics.anInt4978;
            } else if (i_9 == 1) {
                i_20 = (i_5 - this.fontMetrics.anInt4978 - this.fontMetrics.anInt4979 - i_10 * (i_19 - 1)) / 2 + i_3 + this.fontMetrics.anInt4978;
            } else if (i_9 == 2) {
                i_20 = i_3 + i_5 - this.fontMetrics.anInt4979 - i_10 * (i_19 - 1);
            } else {
                i_21 = (i_5 - this.fontMetrics.anInt4978 - this.fontMetrics.anInt4979 - i_10 * (i_19 - 1)) / (i_19 + 1);
                if (i_21 < 0) {
                    i_21 = 0;
                }
                i_20 = i_3 + this.fontMetrics.anInt4978 + i_21;
                i_10 += i_21;
            }
            for (i_21 = 0; i_21 < i_19; i_21++) {
                if (i_8 == 0) {
                    this.method371(aStringArray69[i_21], i_2, i_20, arr_12, ints_13, class455_14, i_15, i_16, (byte) 3);
                } else if (i_8 == 1) {
                    this.method371(aStringArray69[i_21], i_2 + (i_4 - this.fontMetrics.getWidthNoSprites(aStringArray69[i_21], -1967833701)) / 2, i_20, arr_12, ints_13, class455_14, i_15, i_16, (byte) 3);
                } else if (i_8 == 2) {
                    this.method371(aStringArray69[i_21], i_2 + i_4 - this.fontMetrics.getWidthNoSprites(aStringArray69[i_21], -1967833701), i_20, arr_12, ints_13, class455_14, i_15, i_16, (byte) 3);
                } else if (i_21 == i_19 - 1) {
                    this.method371(aStringArray69[i_21], i_2, i_20, arr_12, ints_13, class455_14, i_15, i_16, (byte) 3);
                } else {
                    this.method370(aStringArray69[i_21], i_4, 946973547);
                    this.method371(aStringArray69[i_21], i_2, i_20, arr_12, ints_13, class455_14, i_15, i_16, (byte) 3);
                    anInt67 = 0;
                }
                i_20 += i_10;
            }
            return i_19;
        }
    }

    abstract void method374(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

    abstract void c(char var1, int var2, int var3, int var4, boolean var5);

    abstract void t(char var1, int var2, int var3, int var4, boolean var5);

    public int method378(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, NativeSprite[] arr_11, int[] ints_12, Class455 class455_13, int i_14, int i_15, byte b_16) {
        return this.method373(string_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, 0, arr_11, ints_12, class455_13, i_14, i_15, (byte) 0);
    }

    public void method381(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (string_1 != null) {
            this.method365(i_4, i_5, -813864617);
            double d_9 = 7.0D - (double) i_7 / 8.0D;
            if (d_9 < 0.0D) {
                d_9 = 0.0D;
            }
            int i_11 = string_1.length();
            int[] ints_12 = new int[i_11];
            for (int i_13 = 0; i_13 < i_11; i_13++) {
                ints_12[i_13] = (int) (Math.sin((double) i_6 / 1.0D + (double) i_13 / 1.5D) * d_9);
            }
            this.method372(string_1, i_2 - this.fontMetrics.getWidthNoSprites(string_1, -1967833701) / 2, i_3, (NativeSprite[]) null, (int[]) null, (int[]) null, ints_12, 1742290741);
        }
    }

    public int method386(String string_1, int i_2, int i_3, int i_4, int i_5, Random random_6, int i_7, NativeSprite[] arr_8, int[] ints_9, int i_10) {
        if (string_1 == null) {
            return 0;
        } else {
            random_6.setSeed((long) i_7);
            int i_11 = 192 + (random_6.nextInt() & 0x1f);
            this.method365(i_11 << 24 | i_4 & 0xffffff, i_11 << 24 | i_5 & 0xffffff, -761696495);
            int i_12 = string_1.length();
            int[] ints_13 = new int[i_12];
            int i_14 = 0;
            for (int i_15 = 0; i_15 < i_12; i_15++) {
                ints_13[i_15] = i_14;
                if ((random_6.nextInt() & 0x3) == 0) {
                    ++i_14;
                }
            }
            this.method372(string_1, i_2, i_3, arr_8, ints_9, ints_13, (int[]) null, 1983305186);
            return i_14;
        }
    }

    public void method387(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (string_1 != null) {
            this.method365(i_4, i_5, 347132916);
            int i_8 = string_1.length();
            int[] ints_9 = new int[i_8];
            for (int i_10 = 0; i_10 < i_8; i_10++) {
                ints_9[i_10] = (int) (Math.sin((double) i_6 / 5.0D + (double) i_10 / 2.0D) * 5.0D);
            }
            this.method372(string_1, i_2 - this.fontMetrics.getWidthNoSprites(string_1, -1967833701) / 2, i_3, (NativeSprite[]) null, (int[]) null, (int[]) null, ints_9, 1737737512);
        }
    }

    FontRenderer(GraphicalRenderer graphicalrenderer_1, FontMetrics fontmetrics_2) {
        this.renderer = graphicalrenderer_1;
        this.fontMetrics = fontmetrics_2;
    }

    public static Class209 method400(Component component_0, boolean bool_1, byte b_2) {
        return new Class209_Sub1(component_0, bool_1);
    }

    static void method402(int i_0) {
        Class179.anInt2230 = Class288.aClass414_3438.anInt4978 + Class288.aClass414_3438.anInt4979 + 2;
        Class179.anInt2222 = Class16.aClass414_139.anInt4978 + Class16.aClass414_139.anInt4979 + 2;
        Class13.aStringArray129 = new String[500];
        for (int i_1 = 0; i_1 < Class13.aStringArray129.length; i_1++) {
            Class13.aStringArray129[i_1] = "";
        }
        Class209.method3598(Message.DEVELOPER_CONSOLE_INTRO.translate(Class223.CURRENT_LANGUAGE, -1940277002), -1694092142);
    }

    static final void method403(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
        icomponentdefinitions_0.aBool1291 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
    }

    public static GraphicalRenderer method404(Canvas canvas_0, Interface22 interface22_1, int i_2, int i_3, int i_4) {
        return new ja(canvas_0, interface22_1, i_2, i_3);
    }
}
