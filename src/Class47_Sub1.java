public final class Class47_Sub1 extends Class47 {

    static Connection updateConnection;

    int[] anIntArray9139;

    Class101 aClass101_9124;

    Class115[] aClass115Array9137 = new Class115[3];

    int[][] anIntArrayArray9130 = new int[3][7];

    Vector4 aClass303_9140 = new Vector4(1.0F, 1.0F, 1.0F, 1.0F);

    Vector4 aClass303_9141 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);

    public void method936() {
        this.aClass101_9124.method1655(this.aClass115Array9137[0]);
        this.anIntArray9139 = this.anIntArrayArray9130[this.aClass101_9124.method1714(-2049604923)];
        this.method14476((byte) -60);
    }

    boolean method14475() throws Exception_Sub2 {
        this.aClass101_9124 = this.aClass505_Sub2_439.method13890("Sprite");
        Class282_Sub21_Sub1 class282_sub21_sub1_2 = this.aClass101_9124.method1691("WVPMatrix", (short) 15174);
        Class282_Sub21_Sub1 class282_sub21_sub1_3 = this.aClass101_9124.method1691("SpriteSampler", (short) 14030);
        Class282_Sub21_Sub1 class282_sub21_sub1_4 = this.aClass101_9124.method1691("MaskSampler", (short) 25732);
        Class282_Sub21_Sub1 class282_sub21_sub1_5 = this.aClass101_9124.method1691("MulColour", (short) 14326);
        Class282_Sub21_Sub1 class282_sub21_sub1_6 = this.aClass101_9124.method1691("AddColour", (short) 25922);
        Class282_Sub21_Sub1 class282_sub21_sub1_7 = this.aClass101_9124.method1691("SpriteTexCoordMatrix", (short) 30502);
        Class282_Sub21_Sub1 class282_sub21_sub1_8 = this.aClass101_9124.method1691("MaskTexCoordMatrix", (short) 12246);
        this.aClass115Array9137[0] = this.aClass101_9124.method1651("Normal", 1509292021);
        this.aClass115Array9137[1] = this.aClass101_9124.method1651("Masked", 1673746004);
        this.aClass115Array9137[2] = this.aClass101_9124.method1651("AlphaTex", -295690352);
        for (int i_9 = 0; i_9 < 3; i_9++) {
            int i_10 = this.aClass101_9124.method1653(this.aClass115Array9137[i_9], (byte) -39);
            this.anIntArrayArray9130[i_9][0] = class282_sub21_sub1_2.method15460(i_10);
            this.anIntArrayArray9130[i_9][1] = class282_sub21_sub1_3.method15460(i_10);
            this.anIntArrayArray9130[i_9][2] = class282_sub21_sub1_4.method15460(i_10);
            this.anIntArrayArray9130[i_9][5] = class282_sub21_sub1_5.method15460(i_10);
            this.anIntArrayArray9130[i_9][6] = class282_sub21_sub1_6.method15460(i_10);
            this.anIntArrayArray9130[i_9][3] = class282_sub21_sub1_7.method15460(i_10);
            this.anIntArrayArray9130[i_9][4] = class282_sub21_sub1_8.method15460(i_10);
        }
        this.aClass101_9124.method1655(this.aClass115Array9137[0]);
        return true;
    }

    public void method937(int i_1, int i_2) {
        switch(i_1) {
            case 0:
                this.aClass303_9140.fromInt(i_2);
                this.aClass303_9141.fromInt(0);
                break;
            case 1:
                this.aClass303_9140.fromInt(-1);
                this.aClass303_9141.fromInt(0);
                break;
            case 2:
                this.aClass303_9140.fromInt(i_2);
                this.aClass303_9141.fromInt(0);
                break;
            case 3:
                this.aClass303_9140.fromInt(0xffffff | i_2 & ~0xffffff);
                this.aClass303_9141.fromInt(i_2 & 0xffffff);
                break;
            case 4:
                this.aClass303_9140.fromInt(-1);
                this.aClass303_9141.fromInt(i_2);
                this.aClass303_9141.negate();
        }
    }

    public void method941() {
        this.aClass101_9124.method1655(this.aClass115Array9137[0]);
        this.anIntArray9139 = this.anIntArrayArray9130[this.aClass101_9124.method1714(-1970218669)];
        this.method14476((byte) -25);
    }

    void method14476(byte b_1) {
        this.aClass101_9124.method1646();
        this.aClass101_9124.method1677(this.anIntArray9139[1], 0, this.anInterface6_443, 243138244);
        this.aClass505_Sub2_439.method13933(this.aClass384_442);
        this.aClass101_9124.method1676(this.anIntArray9139[0], this.aClass384_442, -376306243);
        this.aClass101_9124.method1675(this.anIntArray9139[3], this.aClass384_440, (byte) 14);
        this.aClass101_9124.method1749(this.anIntArray9139[5], this.aClass303_9140.x, this.aClass303_9140.y, this.aClass303_9140.z, this.aClass303_9140.w, (byte) 38);
        this.aClass101_9124.method1749(this.anIntArray9139[6], this.aClass303_9141.x, this.aClass303_9141.y, this.aClass303_9141.z, this.aClass303_9141.w, (byte) 44);
        this.aClass505_Sub2_439.method14161(0, this.anInterface4_445);
        this.aClass505_Sub2_439.method13996(this.aClass70_447);
        this.aClass505_Sub2_439.method13923(Class352.aClass352_4104, this.anInt446, 2);
    }

    public void method938() {
        this.aClass101_9124.method1655(this.aClass115Array9137[1]);
        this.anIntArray9139 = this.anIntArrayArray9130[this.aClass101_9124.method1714(-1949611478)];
        this.aClass101_9124.method1677(this.anIntArray9139[2], 1, this.anInterface6_441, -352323720);
        this.aClass101_9124.method1675(this.anIntArray9139[4], this.aClass384_444, (byte) 43);
        this.method14476((byte) -28);
    }

    public void method939(int i_1, int i_2) {
        switch(i_1) {
            case 0:
                this.aClass303_9140.fromInt(i_2);
                this.aClass303_9141.fromInt(0);
                break;
            case 1:
                this.aClass303_9140.fromInt(-1);
                this.aClass303_9141.fromInt(0);
                break;
            case 2:
                this.aClass303_9140.fromInt(i_2);
                this.aClass303_9141.fromInt(0);
                break;
            case 3:
                this.aClass303_9140.fromInt(0xffffff | i_2 & ~0xffffff);
                this.aClass303_9141.fromInt(i_2 & 0xffffff);
                break;
            case 4:
                this.aClass303_9140.fromInt(-1);
                this.aClass303_9141.fromInt(i_2);
                this.aClass303_9141.negate();
        }
    }

    public void method940(int i_1, int i_2) {
        switch(i_1) {
            case 0:
                this.aClass303_9140.fromInt(i_2);
                this.aClass303_9141.fromInt(0);
                break;
            case 1:
                this.aClass303_9140.fromInt(-1);
                this.aClass303_9141.fromInt(0);
                break;
            case 2:
                this.aClass303_9140.fromInt(i_2);
                this.aClass303_9141.fromInt(0);
                break;
            case 3:
                this.aClass303_9140.fromInt(0xffffff | i_2 & ~0xffffff);
                this.aClass303_9141.fromInt(i_2 & 0xffffff);
                break;
            case 4:
                this.aClass303_9140.fromInt(-1);
                this.aClass303_9141.fromInt(i_2);
                this.aClass303_9141.negate();
        }
    }

    public Class47_Sub1(Class505_Sub2 class505_sub2_1) throws Exception_Sub2 {
        super(class505_sub2_1);
        this.method14475();
    }

    public void method942() {
        this.aClass101_9124.method1655(this.aClass115Array9137[1]);
        this.anIntArray9139 = this.anIntArrayArray9130[this.aClass101_9124.method1714(-2036352690)];
        this.aClass101_9124.method1677(this.anIntArray9139[2], 1, this.anInterface6_441, -2038457041);
        this.aClass101_9124.method1675(this.anIntArray9139[4], this.aClass384_444, (byte) 53);
        this.method14476((byte) -2);
    }
}
