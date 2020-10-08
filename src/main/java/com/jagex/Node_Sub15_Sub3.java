package com.jagex;

public class Node_Sub15_Sub3 extends Node_Sub15 {

    NodeCollection aClass482_9754 = new NodeCollection();
    Node_Sub15_Sub4 aNode_Sub15_Sub4_9755 = new Node_Sub15_Sub4();
    Node_Sub15_Sub2 aNode_Sub15_Sub2_9753;

    Node_Sub15_Sub3(Node_Sub15_Sub2 class282_sub15_sub2_1) {
        aNode_Sub15_Sub2_9753 = class282_sub15_sub2_1;
    }

    public static void method15239(Class356 class356_0, Class353 class353_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        Class174.aClass356_2139 = class356_0;
        Class174.aClass353_2140 = class353_1;
        Class174.anInt2134 = i_2;
        Class174.anInt2133 = i_3;
        Class174.anInt2136 = i_4;
        Class208.anInt2662 = i_5;
        KeyHoldInputSubscriber.anInt2878 = i_6;
        Queue.anInt5630 = i_7;
        Class359.anInt4163 = i_8;
        Class174.aClass91_2141 = null;
        Class174.aClass91_2138 = null;
        QuestIndexLoader.aClass91_2981 = null;
        Class434.anInt5329 = i_9;
        Class174.anInt2137 = i_10;
        Class174.method2954();
        Class174.aBool2135 = true;
    }

    @Override
    void method12242(int[] ints_1, int i_2, int i_3) {
        aNode_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

        for (Node_Sub13 class282_sub13_4 = (Node_Sub13) aClass482_9754.head(); class282_sub13_4 != null; class282_sub13_4 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_4)) {
                int i_5 = i_2;
                int i_6 = i_3;

                do {
                    if (i_6 <= 1985703289 * class282_sub13_4.anInt7584 * -431461175) {
                        method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5);
                        class282_sub13_4.anInt7584 = (class282_sub13_4.anInt7584 * -431461175 - i_6 * -431461175) * 1985703289;
                        break;
                    }

                    method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584 * -431461175 * 1985703289, i_5 + i_6);
                    i_5 += class282_sub13_4.anInt7584 * -431461175 * 1985703289;
                    i_6 -= 1985703289 * class282_sub13_4.anInt7584 * -431461175;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6));
            }
        }

    }

    @Override
    Node_Sub15 method12226() {
        Node_Sub13 class282_sub13_1 = (Node_Sub13) aClass482_9754.head();
        return class282_sub13_1 == null ? null : (class282_sub13_1.aNode_Sub15_Sub5_7568 != null ? class282_sub13_1.aNode_Sub15_Sub5_7568 : method12239());
    }

    @Override
    int method12224() {
        return 0;
    }

    @Override
    void method12230(int[] ints_1, int i_2, int i_3) {
        aNode_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

        for (Node_Sub13 class282_sub13_4 = (Node_Sub13) aClass482_9754.head(); class282_sub13_4 != null; class282_sub13_4 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_4)) {
                int i_5 = i_2;
                int i_6 = i_3;

                do {
                    if (i_6 <= class282_sub13_4.anInt7584) {
                        method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5);
                        class282_sub13_4.anInt7584 -= i_6;
                        break;
                    }

                    method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584, i_5 + i_6);
                    i_5 += class282_sub13_4.anInt7584;
                    i_6 -= class282_sub13_4.anInt7584;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6));
            }
        }

    }

    @Override
    Node_Sub15 method12233() {
        Node_Sub13 class282_sub13_1 = (Node_Sub13) aClass482_9754.head();
        return class282_sub13_1 == null ? null : (class282_sub13_1.aNode_Sub15_Sub5_7568 != null ? class282_sub13_1.aNode_Sub15_Sub5_7568 : method12239());
    }

    void method15233(Node_Sub13 class282_sub13_1, int i_2) {
        int i_21 = i_2;
        if ((aNode_Sub15_Sub2_9753.anIntArray9707[class282_sub13_1.anInt7582] & 0x4) != 0 && class282_sub13_1.anInt7579 < 0) {
            int i_4 = aNode_Sub15_Sub2_9753.anIntArray9712[class282_sub13_1.anInt7582] / Class253.anInt3129;
            int i_5 = (i_4 + 1048575 - class282_sub13_1.anInt7583) / i_4;
            class282_sub13_1.anInt7583 = i_4 * i_21 + class282_sub13_1.anInt7583 & 0xfffff;
            if (i_5 <= i_21) {
                Node_Sub15_Sub5 class282_sub15_sub5_6 = class282_sub13_1.aNode_Sub15_Sub5_7568;
                if (aNode_Sub15_Sub2_9753.anIntArray9704[class282_sub13_1.anInt7582] == 0) {
                    class282_sub13_1.aNode_Sub15_Sub5_7568 = class282_sub13_1.aNode_Sub26_Sub1_7565.method15225(class282_sub15_sub5_6.method15323(), class282_sub15_sub5_6.method15315(), class282_sub15_sub5_6.method15316());
                } else {
                    class282_sub13_1.aNode_Sub15_Sub5_7568 = class282_sub13_1.aNode_Sub26_Sub1_7565.method15225(class282_sub15_sub5_6.method15323(), 0, class282_sub15_sub5_6.method15316());
                    aNode_Sub15_Sub2_9753.method15099(class282_sub13_1, class282_sub13_1.aNode_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0);
                }

                if (class282_sub13_1.aNode_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0) {
                    class282_sub13_1.aNode_Sub15_Sub5_7568.method15325(-1);
                }

                i_21 = class282_sub13_1.anInt7583 / i_4;
            }
        }

        class282_sub13_1.aNode_Sub15_Sub5_7568.method12231(i_21);
    }

    @Override
    Node_Sub15 method12232() {
        Node_Sub13 class282_sub13_1 = (Node_Sub13) aClass482_9754.head();
        return class282_sub13_1 == null ? null : (class282_sub13_1.aNode_Sub15_Sub5_7568 != null ? class282_sub13_1.aNode_Sub15_Sub5_7568 : method12239());
    }

    void method15234(Node_Sub13 class282_sub13_1, int[] ints_2, int i_3, int i_4, int i_5) {
        if ((aNode_Sub15_Sub2_9753.anIntArray9707[class282_sub13_1.anInt7582] & 0x4) != 0 && class282_sub13_1.anInt7579 < 0) {
            int i_7 = aNode_Sub15_Sub2_9753.anIntArray9712[class282_sub13_1.anInt7582] / Class253.anInt3129;

            while (true) {
                int i_8 = (i_7 + 1048575 - class282_sub13_1.anInt7583) / i_7;
                if (i_8 > i_4) {
                    class282_sub13_1.anInt7583 += i_4 * i_7;
                    break;
                }

                class282_sub13_1.aNode_Sub15_Sub5_7568.method12230(ints_2, i_3, i_8);
                i_3 += i_8;
                i_4 -= i_8;
                class282_sub13_1.anInt7583 += i_7 * i_8 - 1048576;
                int i_9 = Class253.anInt3129 / 100;
                int i_10 = 262144 / i_7;
                if (i_10 < i_9) {
                    i_9 = i_10;
                }

                Node_Sub15_Sub5 class282_sub15_sub5_11 = class282_sub13_1.aNode_Sub15_Sub5_7568;
                if (aNode_Sub15_Sub2_9753.anIntArray9704[class282_sub13_1.anInt7582] == 0) {
                    class282_sub13_1.aNode_Sub15_Sub5_7568 = class282_sub13_1.aNode_Sub26_Sub1_7565.method15225(class282_sub15_sub5_11.method15323(), class282_sub15_sub5_11.method15315(), class282_sub15_sub5_11.method15316());
                } else {
                    class282_sub13_1.aNode_Sub15_Sub5_7568 = class282_sub13_1.aNode_Sub26_Sub1_7565.method15225(class282_sub15_sub5_11.method15323(), 0, class282_sub15_sub5_11.method15316());
                    aNode_Sub15_Sub2_9753.method15099(class282_sub13_1, class282_sub13_1.aNode_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0);
                    class282_sub13_1.aNode_Sub15_Sub5_7568.method15320(i_9, class282_sub15_sub5_11.method15315());
                }

                if (class282_sub13_1.aNode_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0) {
                    class282_sub13_1.aNode_Sub15_Sub5_7568.method15325(-1);
                }

                class282_sub15_sub5_11.method15322(i_9);
                class282_sub15_sub5_11.method12230(ints_2, i_3, i_5 - i_3);
                if (class282_sub15_sub5_11.method15311()) {
                    aNode_Sub15_Sub4_9755.method15275(class282_sub15_sub5_11);
                }
            }
        }

        class282_sub13_1.aNode_Sub15_Sub5_7568.method12230(ints_2, i_3, i_4);
    }

    @Override
    Node_Sub15 method12229() {
        Node_Sub13 class282_sub13_1;
        do {
            class282_sub13_1 = (Node_Sub13) aClass482_9754.next();
            if (class282_sub13_1 == null) {
                return null;
            }
        } while (class282_sub13_1.aNode_Sub15_Sub5_7568 == null);

        return class282_sub13_1.aNode_Sub15_Sub5_7568;
    }

    @Override
    Node_Sub15 method12235() {
        Node_Sub13 class282_sub13_1;
        do {
            class282_sub13_1 = (Node_Sub13) aClass482_9754.next();
            if (class282_sub13_1 == null) {
                return null;
            }
        } while (class282_sub13_1.aNode_Sub15_Sub5_7568 == null);

        return class282_sub13_1.aNode_Sub15_Sub5_7568;
    }

    @Override
    Node_Sub15 method12236() {
        Node_Sub13 class282_sub13_1;
        do {
            class282_sub13_1 = (Node_Sub13) aClass482_9754.next();
            if (class282_sub13_1 == null) {
                return null;
            }
        } while (class282_sub13_1.aNode_Sub15_Sub5_7568 == null);

        return class282_sub13_1.aNode_Sub15_Sub5_7568;
    }

    @Override
    int method12227() {
        return 0;
    }

    @Override
    int method12238() {
        return 0;
    }

    @Override
    int method12244() {
        return 0;
    }

    @Override
    void method12241(int[] ints_1, int i_2, int i_3) {
        aNode_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

        for (Node_Sub13 class282_sub13_4 = (Node_Sub13) aClass482_9754.head(); class282_sub13_4 != null; class282_sub13_4 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_4)) {
                int i_5 = i_2;
                int i_6 = i_3;

                do {
                    if (i_6 <= 1985703289 * class282_sub13_4.anInt7584 * -431461175) {
                        method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5);
                        class282_sub13_4.anInt7584 = (class282_sub13_4.anInt7584 * -431461175 - i_6 * -431461175) * 1985703289;
                        break;
                    }

                    method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584 * -431461175 * 1985703289, i_5 + i_6);
                    i_5 += class282_sub13_4.anInt7584 * -431461175 * 1985703289;
                    i_6 -= 1985703289 * class282_sub13_4.anInt7584 * -431461175;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6));
            }
        }

    }

    @Override
    Node_Sub15 method12239() {
        Node_Sub13 class282_sub13_1;
        do {
            class282_sub13_1 = (Node_Sub13) aClass482_9754.next();
            if (class282_sub13_1 == null) {
                return null;
            }
        } while (class282_sub13_1.aNode_Sub15_Sub5_7568 == null);

        return class282_sub13_1.aNode_Sub15_Sub5_7568;
    }

    @Override
    void method12243(int i_1) {
        aNode_Sub15_Sub4_9755.method12231(i_1);

        for (Node_Sub13 class282_sub13_2 = (Node_Sub13) aClass482_9754.head(); class282_sub13_2 != null; class282_sub13_2 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_2)) {
                int i_3 = i_1;

                do {
                    if (i_3 <= 1985703289 * class282_sub13_2.anInt7584 * -431461175) {
                        method15233(class282_sub13_2, i_3);
                        class282_sub13_2.anInt7584 = (class282_sub13_2.anInt7584 * -431461175 - -431461175 * i_3) * 1985703289;
                        break;
                    }

                    method15233(class282_sub13_2, class282_sub13_2.anInt7584 * -431461175 * 1985703289);
                    i_3 -= 1985703289 * class282_sub13_2.anInt7584 * -431461175;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_2, null, 0, i_3));
            }
        }

    }

    @Override
    void method12234(int i_1) {
        aNode_Sub15_Sub4_9755.method12231(i_1);

        for (Node_Sub13 class282_sub13_2 = (Node_Sub13) aClass482_9754.head(); class282_sub13_2 != null; class282_sub13_2 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_2)) {
                int i_3 = i_1;

                do {
                    if (i_3 <= 1985703289 * class282_sub13_2.anInt7584 * -431461175) {
                        method15233(class282_sub13_2, i_3);
                        class282_sub13_2.anInt7584 = (class282_sub13_2.anInt7584 * -431461175 - -431461175 * i_3) * 1985703289;
                        break;
                    }

                    method15233(class282_sub13_2, class282_sub13_2.anInt7584 * -431461175 * 1985703289);
                    i_3 -= 1985703289 * class282_sub13_2.anInt7584 * -431461175;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_2, null, 0, i_3));
            }
        }

    }

    @Override
    int method12228() {
        return 0;
    }

    @Override
    void method12231(int i_1) {
        aNode_Sub15_Sub4_9755.method12231(i_1);

        for (Node_Sub13 class282_sub13_2 = (Node_Sub13) aClass482_9754.head(); class282_sub13_2 != null; class282_sub13_2 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_2)) {
                int i_3 = i_1;

                do {
                    if (i_3 <= class282_sub13_2.anInt7584) {
                        method15233(class282_sub13_2, i_3);
                        class282_sub13_2.anInt7584 -= i_3;
                        break;
                    }

                    method15233(class282_sub13_2, class282_sub13_2.anInt7584);
                    i_3 -= class282_sub13_2.anInt7584;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_2, null, 0, i_3));
            }
        }

    }

    @Override
    void method12240(int[] ints_1, int i_2, int i_3) {
        aNode_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

        for (Node_Sub13 class282_sub13_4 = (Node_Sub13) aClass482_9754.head(); class282_sub13_4 != null; class282_sub13_4 = (Node_Sub13) aClass482_9754.next()) {
            if (!aNode_Sub15_Sub2_9753.method15115(class282_sub13_4)) {
                int i_5 = i_2;
                int i_6 = i_3;

                do {
                    if (i_6 <= 1985703289 * class282_sub13_4.anInt7584 * -431461175) {
                        method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5);
                        class282_sub13_4.anInt7584 = (class282_sub13_4.anInt7584 * -431461175 - i_6 * -431461175) * 1985703289;
                        break;
                    }

                    method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584 * -431461175 * 1985703289, i_5 + i_6);
                    i_5 += class282_sub13_4.anInt7584 * -431461175 * 1985703289;
                    i_6 -= 1985703289 * class282_sub13_4.anInt7584 * -431461175;
                } while (!aNode_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6));
            }
        }

    }

}
