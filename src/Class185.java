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

    Matrix44Arr aClass384_2346;

    Matrix44Var aClass294_2314;

    Matrix44Var aClass294_2316;

    Matrix44Arr aClass384_2317;

    Matrix44Arr aClass384_2318;

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

    Class528_Sub2[] aClass528_Sub2Array2339;

    Class528_Sub2[] aClass528_Sub2Array2340;

    float[] aFloatArray2315;

    float[] aFloatArray2342;

    float[] aFloatArray2330;

    float[] aFloatArray2344;

    float[] aFloatArray2345;

    float[] aFloatArray2324;

    HardwareRenderer aClass505_Sub3_2320;

    int[] anIntArray2329;

    void method3070(Runnable runnable_1, int i_2) {
        this.aRunnable2343 = runnable_1;
    }

    void method3071(int i_1) {
        this.aClass144_2310 = new ChoppyItemFixClass(this.aClass505_Sub3_2320, this);
    }

    Class185(HardwareRenderer hardwarerenderer_1) {
        this.aFloat2303 = 1.0F - this.aFloat2305;
        this.anInt2307 = 0;
        this.anInt2336 = 0;
        this.aBool2309 = false;
        this.anInt2306 = 0;
        this.anInt2313 = 0;
        this.aBool2334 = true;
        this.aClass384_2346 = new Matrix44Arr();
        this.aClass294_2314 = new Matrix44Var();
        this.aClass294_2316 = new Matrix44Var();
        this.aClass384_2317 = new Matrix44Arr();
        this.aClass384_2318 = new Matrix44Arr();
        this.anIntArray2319 = new int[Class528_Sub2.anInt8644];
        this.aFloatArray2302 = new float[Class528_Sub2.anInt8644];
        this.aFloatArray2341 = new float[Class528_Sub2.anInt8644];
        this.aFloatArray2322 = new float[Class528_Sub2.anInt8644];
        this.aFloatArray2323 = new float[Class528_Sub2.anInt8644];
        this.anIntArray2321 = new int[8];
        this.anIntArray2325 = new int[8];
        this.anIntArray2312 = new int[8];
        this.anIntArray2327 = new int[10000];
        this.anIntArray2328 = new int[10000];
        this.aFloat2311 = 1.0F;
        this.aFloat2335 = 0.0F;
        this.aFloat2308 = 1.0F;
        this.aFloatArray2338 = new float[2];
        this.aClass528_Sub2Array2339 = new Class528_Sub2[7];
        this.aClass528_Sub2Array2340 = new Class528_Sub2[7];
        this.aFloatArray2315 = new float[64];
        this.aFloatArray2342 = new float[64];
        this.aFloatArray2330 = new float[64];
        this.aFloatArray2344 = new float[64];
        this.aFloatArray2345 = new float[64];
        this.aFloatArray2324 = new float[3];
        this.aClass505_Sub3_2320 = hardwarerenderer_1;
        this.aClass144_2310 = new ChoppyItemFixClass(hardwarerenderer_1, this);
        int i_2;
        for (i_2 = 0; i_2 < 7; i_2++) {
            this.aClass528_Sub2Array2339[i_2] = new Class528_Sub2(this.aClass505_Sub3_2320);
            this.aClass528_Sub2Array2340[i_2] = new Class528_Sub2(this.aClass505_Sub3_2320);
        }
        this.anIntArray2329 = new int[Class528_Sub2.anInt8562];
        for (i_2 = 0; i_2 < Class528_Sub2.anInt8562; i_2++) {
            this.anIntArray2329[i_2] = -1;
        }
    }

    public static void method3077(int i_0) {
        for (int i_1 = 0; i_1 < Class260.anInt3219; i_1++) {
            Class268 class268_2 = Class260.aClass268Array3232[i_1];
            if (class268_2.aByte3300 == 3) {
                Class58.method1142(class268_2, 1716467770);
            }
        }
    }

    static final void method3078(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (Class96_Sub14.method14642(string_4, cs2executor_2, 198501911) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1389 = Class351.method6193(string_4, cs2executor_2, 81409636);
        icomponentdefinitions_0.aBool1384 = true;
    }
}
