public class Class393 {

    public static Class282_Sub54 preferences;

    public Interface3[] anInterface3Array4782;

    void method6743(RsByteBuffer rsbytebuffer_1, int i_2) {
        this.anInterface3Array4782 = new Interface3[rsbytebuffer_1.readUnsignedByte()];
        Class60[] arr_3 = Class112.method1870(-738775405);
        for (int i_4 = 0; i_4 < this.anInterface3Array4782.length; i_4++) {
            this.anInterface3Array4782[i_4] = this.method6745(rsbytebuffer_1, arr_3[rsbytebuffer_1.readUnsignedByte()], 1487656629);
        }
    }

    Interface3 method6745(RsByteBuffer rsbytebuffer_1, Class60 class60_2, int i_3) {
        return (Interface3) (class60_2 == Class60.aClass60_609 ? Class224.method3784(rsbytebuffer_1, 1656057564) : (class60_2 == Class60.aClass60_602 ? Class411.method6915(rsbytebuffer_1, 1563512392) : (class60_2 == Class60.aClass60_605 ? Class366.method6303(rsbytebuffer_1, (byte) 77) : (class60_2 == Class60.aClass60_607 ? Class530.method11354(rsbytebuffer_1, -2136819343) : (class60_2 == Class60.aClass60_606 ? Class258.method4570(rsbytebuffer_1, 2086694291) : (class60_2 == Class60.aClass60_603 ? MapRegion.method4564(rsbytebuffer_1, 1637673154) : (class60_2 == Class60.aClass60_608 ? Class163.method2843(rsbytebuffer_1, 1348878542) : (class60_2 == Class60.aClass60_604 ? Class377.method6401(rsbytebuffer_1, (byte) -44) : (class60_2 == Class60.aClass60_601 ? Class214.method3668(rsbytebuffer_1, (byte) -11) : (class60_2 == Class60.aClass60_610 ? Class332.method5928(rsbytebuffer_1, -1017315787) : null))))))))));
    }

    static void method6751(int i_0, int i_1, int i_2) {
        Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(1, (long) i_0);
        class282_sub50_sub12_3.method14995(1483198520);
        class282_sub50_sub12_3.anInt9668 = i_1;
    }
}
