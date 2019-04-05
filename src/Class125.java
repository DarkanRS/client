public class Class125 implements Interface8 {

    public static NativeSprite aClass160_1571;

    static int anInt1572;

    int anInt1568;

    int anInt1569;

    float[] aFloatArray1570;

    public void method32() {
    }

    public int method1() {
        return this.anInt1568;
    }

    public int method74() {
        return this.anInt1569;
    }

    public void method26() {
    }

    Class125(int i_1, int i_2) {
        this.anInt1568 = i_1;
        this.anInt1569 = i_2;
        this.aFloatArray1570 = new float[this.anInt1568 * this.anInt1569];
    }

    public int method76() {
        return this.anInt1568 * -1553362033 * -2020594833;
    }

    public int method75() {
        return this.anInt1568 * -1553362033 * -2020594833;
    }

    public int method73() {
        return this.anInt1569 * -2091052327 * 946359657;
    }

    public int method77() {
        return this.anInt1569 * -2091052327 * 946359657;
    }

    public int method39() {
        return this.anInt1569 * -2091052327 * 946359657;
    }

    static final CS2Executor getNextScriptExecutor() {
        if (CS2Runner.CURRENT_CS2_EXEC_IDX == CS2Runner.CS2_EXECUTORS.size()) {
            CS2Runner.CS2_EXECUTORS.add(new CS2Executor());
        }
        CS2Executor cs2executor_1 = (CS2Executor) CS2Runner.CS2_EXECUTORS.get(CS2Runner.CURRENT_CS2_EXEC_IDX);
        ++CS2Runner.CURRENT_CS2_EXEC_IDX;
        return cs2executor_1;
    }

    static final int method2172(int i_0) {
        int i_2 = i_0 & 0x3f;
        int i_3 = i_0 >> 6 & 0x3;
        if (i_2 == 18) {
            if (i_3 == 0) {
                return 1;
            }
            if (i_3 == 1) {
                return 2;
            }
            if (i_3 == 2) {
                return 4;
            }
            if (i_3 == 3) {
                return 8;
            }
        } else if (i_2 == 19 || i_2 == 21) {
            if (i_3 == 0) {
                return 16;
            }
            if (i_3 == 1) {
                return 32;
            }
            if (i_3 == 2) {
                return 64;
            }
            if (i_3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    public static Class282_Sub50_Sub6 method2173(int i_0) {
        return Class291_Sub1.aClass282_Sub50_Sub6_3491;
    }
}
