package com.jagex;

public class Class185 {
    boolean aBool2304;
    float aFloat2326;
    float aFloat2331;
    float aFloat2332;
    float aFloat2333;
    int anInt2337;
    Runnable aRunnable2343;
    ChoppyItemFixClass aClass144_2310;
    float aFloat2305 = 0.85F;
    float aFloat2303;
    int anInt2307;
    int anInt2336;
    boolean aBool2309;
    int anInt2306;
    int anInt2313;
    boolean aBool2334;
    Matrix44 aClass384_2346;
    Matrix44Var aClass294_2314;
    Matrix44Var aClass294_2316;
    Matrix44 aClass384_2317;
    Matrix44 aClass384_2318;
    int[] anIntArray2319;
    float[] aFloatArray2302;
    float[] aFloatArray2341;
    float[] aFloatArray2322;
    float[] aFloatArray2323;
    int[] anIntArray2321;
    int[] anIntArray2325;
    int[] anIntArray2312;
    int[] anIntArray2327;
    int[] anIntArray2328;
    float aFloat2311;
    float aFloat2335;
    float aFloat2308;
    float[] aFloatArray2338;
    MeshRasterizer_Sub2[] aMeshRasterizer_Sub2Array2339;
    MeshRasterizer_Sub2[] aMeshRasterizer_Sub2Array2340;
    float[] aFloatArray2315;
    float[] aFloatArray2342;
    float[] aFloatArray2330;
    float[] aFloatArray2344;
    float[] aFloatArray2345;
    float[] aFloatArray2324;
    JavaRenderer aGraphicalRenderer_Sub3_2320;
    int[] anIntArray2329;

    Class185(JavaRenderer hardwarerenderer_1) {
        aFloat2303 = 1.0F - aFloat2305;
        anInt2307 = 0;
        anInt2336 = 0;
        aBool2309 = false;
        anInt2306 = 0;
        anInt2313 = 0;
        aBool2334 = true;
        aClass384_2346 = new Matrix44();
        aClass294_2314 = new Matrix44Var();
        aClass294_2316 = new Matrix44Var();
        aClass384_2317 = new Matrix44();
        aClass384_2318 = new Matrix44();
        anIntArray2319 = new int[MeshRasterizer_Sub2.anInt8644];
        aFloatArray2302 = new float[MeshRasterizer_Sub2.anInt8644];
        aFloatArray2341 = new float[MeshRasterizer_Sub2.anInt8644];
        aFloatArray2322 = new float[MeshRasterizer_Sub2.anInt8644];
        aFloatArray2323 = new float[MeshRasterizer_Sub2.anInt8644];
        anIntArray2321 = new int[8];
        anIntArray2325 = new int[8];
        anIntArray2312 = new int[8];
        anIntArray2327 = new int[10000];
        anIntArray2328 = new int[10000];
        aFloat2311 = 1.0F;
        aFloat2335 = 0.0F;
        aFloat2308 = 1.0F;
        aFloatArray2338 = new float[2];
        aMeshRasterizer_Sub2Array2339 = new MeshRasterizer_Sub2[7];
        aMeshRasterizer_Sub2Array2340 = new MeshRasterizer_Sub2[7];
        aFloatArray2315 = new float[64];
        aFloatArray2342 = new float[64];
        aFloatArray2330 = new float[64];
        aFloatArray2344 = new float[64];
        aFloatArray2345 = new float[64];
        aFloatArray2324 = new float[3];
        aGraphicalRenderer_Sub3_2320 = hardwarerenderer_1;
        aClass144_2310 = new ChoppyItemFixClass(hardwarerenderer_1, this);
        int i_2;
        for (i_2 = 0; i_2 < 7; i_2++) {
            aMeshRasterizer_Sub2Array2339[i_2] = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_2320);
            aMeshRasterizer_Sub2Array2340[i_2] = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_2320);
        }
        anIntArray2329 = new int[MeshRasterizer_Sub2.anInt8562];
        for (i_2 = 0; i_2 < MeshRasterizer_Sub2.anInt8562; i_2++) {
            anIntArray2329[i_2] = -1;
        }
    }

    public static void resetSounds() {
        for (int i_1 = 0; i_1 < Class260.SOUNDS_SIZE; i_1++) {
            AreadSound sound = Class260.SOUNDS[i_1];
            if (sound.type == 3) {
                QuickchatFiller.method1142(sound);
            }
        }
    }

    void method3070(Runnable runnable_1) {
        aRunnable2343 = runnable_1;
    }

    void method3071() {
        aClass144_2310 = new ChoppyItemFixClass(aGraphicalRenderer_Sub3_2320, this);
    }
}
