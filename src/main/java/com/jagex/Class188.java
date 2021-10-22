package com.jagex;

public class Class188 {

    public static boolean aBool2378;

    public static boolean aBool2377;

    public static boolean aBool2372;

    Class188() throws Throwable {
        throw new Error();
    }

    public static void method3139(AbstractRenderer graphicalrenderer_0, Index index_1) {
        SpriteDefinitions[] arr_3 = SpriteDefinitions.method1514(index_1, Class165.anInt2035);
        Node_Sub21.aNativeSpriteArray7673 = new NativeSprite[arr_3.length];
        int i_4;
        for (i_4 = 0; i_4 < arr_3.length; i_4++) {
            Node_Sub21.aNativeSpriteArray7673[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, Class475.anInt5622);
        Class16.aNativeSpriteArray138 = new NativeSprite[arr_3.length];
        for (i_4 = 0; i_4 < arr_3.length; i_4++) {
            Class16.aNativeSpriteArray138[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, Class16.anInt135);
        Class391.HINT_ARROW_SPRITES = new NativeSprite[arr_3.length];
        for (i_4 = 0; i_4 < arr_3.length; i_4++) {
            Class391.HINT_ARROW_SPRITES[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, Class16.anInt142);
        MaterialProp19.aNativeSpriteArray9838 = new NativeSprite[arr_3.length];
        for (i_4 = 0; i_4 < arr_3.length; i_4++) {
            MaterialProp19.aNativeSpriteArray9838[i_4] = graphicalrenderer_0.method8444(arr_3[i_4], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, Class16.anInt137);
        Class16.aNativeSpriteArray145 = new NativeSprite[arr_3.length];
        byte b_6 = 25;
        int i_5;
        for (i_5 = 0; i_5 < arr_3.length; i_5++) {
            arr_3[i_5].method1529(-b_6 + (int) (Math.random() * b_6 * 2.0D), -b_6 + (int) (Math.random() * b_6 * 2.0D), -b_6 + (int) (Math.random() * b_6 * 2.0D));
            Class16.aNativeSpriteArray145[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, BloomPreference.anInt7899);
        Node_Sub36.aNativeSpriteArray7994 = new NativeSprite[arr_3.length];
        for (i_5 = 0; i_5 < arr_3.length; i_5++) {
            Node_Sub36.aNativeSpriteArray7994[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, Class13.anInt130);
        Class250.aNativeSpriteArray3092 = new NativeSprite[arr_3.length];
        b_6 = 12;
        for (i_5 = 0; i_5 < arr_3.length; i_5++) {
            arr_3[i_5].method1529(-b_6 + (int) (Math.random() * b_6 * 2.0D), -b_6 + (int) (Math.random() * b_6 * 2.0D), -b_6 + (int) (Math.random() * b_6 * 2.0D));
            Class250.aNativeSpriteArray3092[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
        }
        arr_3 = SpriteDefinitions.method1514(index_1, Class16.anInt143);
        Class182.aNativeSpriteArray2261 = new NativeSprite[arr_3.length];
        b_6 = 12;
        for (i_5 = 0; i_5 < arr_3.length; i_5++) {
            arr_3[i_5].method1529(-b_6 + (int) (Math.random() * b_6 * 2.0D), -b_6 + (int) (Math.random() * b_6 * 2.0D), -b_6 + (int) (Math.random() * b_6 * 2.0D));
            Class182.aNativeSpriteArray2261[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
        }
        Class16.aNativeSprite_146 = graphicalrenderer_0.method8444(SpriteDefinitions.getSprite(index_1, Class16.anInt141, 0), true);
        Exception_Sub1.aNativeSprite_10075 = graphicalrenderer_0.method8444(SpriteDefinitions.getSprite(index_1, Class165.anInt2037, 0), true);
        arr_3 = SpriteDefinitions.method1514(index_1, Class271.anInt3330);
        Class245.aNativeSpriteArray3027 = new NativeSprite[arr_3.length];
        for (i_5 = 0; i_5 < arr_3.length; i_5++) {
            Class245.aNativeSpriteArray3027[i_5] = graphicalrenderer_0.method8444(arr_3[i_5], true);
        }
    }

    static void method3140() {
        LRUCache softcache_1 = Class13.aClass229_127;
        synchronized (Class13.aClass229_127) {
            Class13.aClass229_127.method3859();
        }
    }

    public static void method3142() {
        if (NamedFileReference.method867() != Class279.aClass279_3368) {
            try {
                String string_1 = SubInterface.suppliedApplet.getParameter(Class358.aClass358_4144.aString4159);
                int i_2 = (int) (Utils.time() / 86400000L) - 11745;
                String string_3 = "usrdob=" + i_2 + "; version=1; path=/; domain=" + string_1;
                //Class441.method7376(SubInterface.suppliedApplet, "document.cookie=\"" + string_3 + "\"");
            } catch (Throwable ignored) {
            }
        }
    }
}
