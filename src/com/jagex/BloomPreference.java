package com.jagex;

public class BloomPreference extends Preference {

    static int anInt7899;

    public void method12703() {
        if (this.manager.currentToolkit.method12777() && !Class60.method1166(this.manager.currentToolkit.getValue(-1858254285), -1873449120)) {
            this.anInt5578 = 0;
        }

        if (this.anInt5578 < 0 || this.anInt5578 > 1) {
            this.anInt5578 = this.getDefaultValue();
        }

    }

    public BloomPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    int getDefaultValue() {
        return 0;
    }

    public BloomPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    public int method12706(byte b_1) {
        return this.anInt5578;
    }

    public int method7784(int i_1) {
        return !Class60.method1166(this.manager.currentToolkit.getValue(1997051125), -790341890) ? 3 : 1;
    }

    void method7780(int i_1) {
        this.anInt5578 = -754033619 * i_1 * -859024475;
    }

    int method7786() {
        return 0;
    }

    int method7787() {
        return 0;
    }

    public boolean method12707() {
        return Class60.method1166(this.manager.currentToolkit.getValue(-1301268154), -1253259438);
    }

    public int checkValid(int i_1) {
        return !Class60.method1166(this.manager.currentToolkit.getValue(-2032316540), -1020408311) ? 3 : 1;
    }

    static void method12708() {
        Class9.aString102 = "";
        Class9.aString99 = "";
    }

    public static void method12709(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(12, i_0);
        class282_sub50_sub12_2.method14965((byte) 7);
    }

    public static void method12710(int i_0) {
        Node_Sub14.anInt7597 = i_0;
        IComponentDefinitions.aClass229_1341.method3859();
    }

}
