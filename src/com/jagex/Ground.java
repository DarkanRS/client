package com.jagex;

public abstract class Ground {

    static int anInt4777;

    public int width;

    public int length;

    public int tileUnits;

    public int tileScale;

    public int[][] tileHeights;

    Ground(int i_1, int i_2, int i_3, int[][] ints_4) {
        width = i_1;
        length = i_2;
        int scale;
        for (scale = 0; i_3 > 1; i_3 >>= 1) {
            ++scale;
        }
        tileUnits = 1 << scale;
        tileScale = scale;
        tileHeights = ints_4;
    }

    static void method6728(Component icomponentdefinitions_0, Class119 class119_1, int i_2, int i_3, int i_4, int i_5, int i_6, long long_7) {
        int i_9 = i_5 * i_5 + i_4 * i_4;
        if (i_9 <= long_7) {
            int i_10;
            if (NativeLibraryLoader.anInt3240 == 4) {
                i_10 = (int) client.camAngleY & 0x3fff;
            } else {
                i_10 = (int) client.camAngleY + client.anInt7255 & 0x3fff;
            }
            int i_11 = Class382.SINE[i_10];
            int i_12 = Class382.COSINE[i_10];
            if (NativeLibraryLoader.anInt3240 != 4) {
                i_11 = i_11 * 256 / (client.anInt7203 + 256);
                i_12 = i_12 * 256 / (client.anInt7203 + 256);
            }
            int i_13 = i_12 * i_4 + i_5 * i_11 >> 14;
            int i_14 = i_5 * i_12 - i_11 * i_4 >> 14;
            NativeSprite nativesprite_15 = Node_Sub20_Sub15.aNativeSpriteArray9838[i_6];
            int i_16 = nativesprite_15.method2747();
            int i_17 = nativesprite_15.method2793();
            int i_18 = i_13 + icomponentdefinitions_0.width / 2 - i_16 / 2;
            int i_19 = i_16 + i_18;
            int i_20 = -i_14 + icomponentdefinitions_0.height / 2 - i_17;
            int i_21 = i_20 + i_17;
            if (class119_1.method2073(i_18, i_20) && class119_1.method2073(i_19, i_20) && class119_1.method2073(i_18, i_21) && class119_1.method2073(i_19, i_21)) {
                nativesprite_15.method2773(i_18 + i_2, i_3 + i_20, class119_1.aClass455_1456, i_2, i_3);
            } else {
                double d_22 = Math.atan2(i_13, i_14);
                int i_24 = Math.min(icomponentdefinitions_0.width / 2, icomponentdefinitions_0.height / 2);
                i_24 -= 6;
                int i_25 = (int) (Math.sin(d_22) * i_24);
                int i_26 = (int) (Math.cos(d_22) * i_24);
                Class245.aNativeSpriteArray3027[i_6].method2758(i_2 + icomponentdefinitions_0.width / 2.0F + i_25, i_3 + icomponentdefinitions_0.height / 2.0F - i_26, 4096, (int) (65535.0D * (-d_22 / 6.283185307179586D)));
            }
        }
    }

    public static void method6731(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (i_0 >= Class532_Sub1.anInt7071 && i_1 <= Class532_Sub1.anInt7069 && i_2 >= Class532_Sub1.anInt7070 && i_3 <= Class532_Sub1.anInt7068) {
            HitbarDefinitions.method3230(i_0, i_1, i_2, i_3, i_4, i_5, i_6);
        } else {
            PlayerModel.method4034(i_0, i_1, i_2, i_3, i_4, i_5, i_6);
        }
    }

    public abstract void method6706(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, HDWaterTile var11, boolean var12);

    public abstract void LA(int var1, int var2, int var3);

    public abstract void method6707(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, HDWaterTile var11, boolean var12);

    public abstract void method6708(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, HDWaterTile var14);

    public abstract void SA();

    public abstract void p();

    public int averageHeight(int i_1, int i_2) {
        int i_4 = i_1 >> tileScale;
        int i_5 = i_2 >> tileScale;
        if (i_4 >= 0 && i_5 >= 0 && i_4 <= width - 1 && i_5 <= length - 1) {
            int i_6 = i_1 & tileUnits - 1;
            int i_7 = i_2 & tileUnits - 1;
            int i_8 = tileHeights[i_4][i_5] * (tileUnits - i_6) + i_6 * tileHeights[i_4 + 1][i_5] >> tileScale;
            int i_9 = tileHeights[i_4][i_5 + 1] * (tileUnits - i_6) + tileHeights[i_4 + 1][i_5 + 1] * i_6 >> tileScale;
            return i_9 * i_7 + i_8 * (tileUnits - i_7) >> tileScale;
        } else {
            return 0;
        }
    }

    public abstract void method6710(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

    public abstract void z(Shadow var1, int var2, int var3, int var4);

    public abstract void method6711(Node_Sub24 var1, int[] var2);

    public abstract void UA(Shadow var1, int var2, int var3, int var4);

    public abstract void NA(Shadow var1, int var2, int var3, int var4);

    public abstract boolean method6712(Shadow var1, int var2, int var3, int var4);

    public abstract void method6713(Node_Sub24 var1, int[] var2);

    public abstract void m(int var1, int var2, int var3);

    public abstract void method6714(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, HDWaterTile var14, boolean var15);

    public abstract void b(Shadow var1, int var2, int var3, int var4);

    public abstract void method6715(int var1, int var2, int var4, int var5, int var6, int var7, boolean[][] var8);

    public abstract void e();

    public abstract void method6716(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

    public abstract void method6717(int var1, int var2, int var3, boolean[][] var4, boolean var5);

    public abstract void u(Shadow var1, int var2, int var3, int var4);

    public abstract boolean method6718(Shadow var1, int var2, int var3, int var4);

    public abstract boolean method6719(Shadow var1, int var2, int var3, int var4);

    public abstract void d(Shadow var1, int var2, int var3, int var4);

    public abstract void a(Shadow var1, int var2, int var3, int var4);

    public abstract void method6720(Node_Sub24 var1, int[] var2);

    public abstract Shadow s(int var1, int var2, Shadow var3);

    public abstract void method6721(Node_Sub24 var1, int[] var2);

    public int getHeight(int i_1, int i_2) {
        return tileHeights[i_1][i_2];
    }

    public abstract void method6723(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

    public abstract Shadow w(int var1, int var2, Shadow var3);
}
