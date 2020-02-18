package com.jagex;

public class Node_Sub15_Sub4 extends Node_Sub15 {

    NodeCollection aClass482_9824 = new NodeCollection();
    NodeCollection aClass482_9825 = new NodeCollection();
    int anInt9826;
    int anInt9827 = -1;

    void method15274(Node node_1, Node_Sub22 class282_sub22_2) {
        while (aClass482_9825.tail != node_1 && ((Node_Sub22) node_1).anInt7676 <= class282_sub22_2.anInt7676) {
            node_1 = node_1.next;
        }

        Class446.method7430(class282_sub22_2, node_1);
        anInt9827 = ((Node_Sub22) aClass482_9825.tail.next).anInt7676;
    }

    public synchronized void method15275(Node_Sub15 class282_sub15_1) {
        aClass482_9824.method8098(class282_sub15_1);
    }

    public synchronized void method15276(Node_Sub15 class282_sub15_1) {
        class282_sub15_1.unlink();
    }

    void method15277() {
        if (anInt9826 > 0) {
            for (Node_Sub22 class282_sub22_1 = (Node_Sub22) aClass482_9825.head(); class282_sub22_1 != null; class282_sub22_1 = (Node_Sub22) aClass482_9825.next()) {
                class282_sub22_1.anInt7676 -= anInt9826;
            }

            anInt9827 -= anInt9826;
            anInt9826 = 0;
        }

    }

    void method15279(Node_Sub22 class282_sub22_1) {
        class282_sub22_1.unlink();
        class282_sub22_1.method12355();
        Node node_2 = aClass482_9825.tail.next;
        if (node_2 == aClass482_9825.tail) {
            anInt9827 = -1;
        } else {
            anInt9827 = ((Node_Sub22) node_2).anInt7676;
        }

    }

    void method15280(int i_1) {
        for (Node_Sub15 class282_sub15_2 = (Node_Sub15) aClass482_9824.head(); class282_sub15_2 != null; class282_sub15_2 = (Node_Sub15) aClass482_9824.next()) {
            class282_sub15_2.method12231(i_1);
        }

    }

    @Override
    int method12228() {
        return 0;
    }

    @Override
    public synchronized void method12230(int[] ints_1, int i_2, int i_3) {
        while (true) {
            if (anInt9827 < 0) {
                method15282(ints_1, i_2, i_3);
            } else if (i_3 + anInt9826 < anInt9827) {
                anInt9826 += i_3;
                method15282(ints_1, i_2, i_3);
            } else {
                int i_4 = anInt9827 - anInt9826;
                method15282(ints_1, i_2, i_4);
                i_2 += i_4;
                i_3 -= i_4;
                anInt9826 += i_4;
                method15277();
                Node_Sub22 class282_sub22_5 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_5) {
                    int i_7 = class282_sub22_5.method12354(this);
                    if (i_7 < 0) {
                        class282_sub22_5.anInt7676 = 0;
                        method15279(class282_sub22_5);
                    } else {
                        class282_sub22_5.anInt7676 = i_7;
                        method15274(class282_sub22_5.next, class282_sub22_5);
                    }
                }

                if (i_3 != 0) {
                    continue;
                }
            }

            return;
        }
    }

    void method15282(int[] ints_1, int i_2, int i_3) {
        for (Node_Sub15 class282_sub15_4 = (Node_Sub15) aClass482_9824.head(); class282_sub15_4 != null; class282_sub15_4 = (Node_Sub15) aClass482_9824.next()) {
            class282_sub15_4.method12237(ints_1, i_2, i_3);
        }

    }

    @Override
    public synchronized void method12231(int i_1) {
        while (true) {
            if (anInt9827 < 0) {
                method15280(i_1);
            } else if (anInt9826 + i_1 < anInt9827) {
                anInt9826 += i_1;
                method15280(i_1);
            } else {
                int i_2 = anInt9827 - anInt9826;
                method15280(i_2);
                i_1 -= i_2;
                anInt9826 += i_2;
                method15277();
                Node_Sub22 class282_sub22_3 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_3) {
                    int i_5 = class282_sub22_3.method12354(this);
                    if (i_5 < 0) {
                        class282_sub22_3.anInt7676 = 0;
                        method15279(class282_sub22_3);
                    } else {
                        class282_sub22_3.anInt7676 = i_5;
                        method15274(class282_sub22_3.next, class282_sub22_3);
                    }
                }

                if (i_1 != 0) {
                    continue;
                }
            }

            return;
        }
    }

    @Override
    int method12224() {
        return 0;
    }

    @Override
    public synchronized void method12240(int[] ints_1, int i_2, int i_3) {
        while (true) {
            if (anInt9827 < 0) {
                method15282(ints_1, i_2, i_3);
            } else if (anInt9826 + i_3 < anInt9827) {
                anInt9826 += i_3;
                method15282(ints_1, i_2, i_3);
            } else {
                int i_4 = anInt9827 - anInt9826;
                method15282(ints_1, i_2, i_4);
                i_2 += i_4;
                i_3 -= i_4;
                anInt9826 += i_4;
                method15277();
                Node_Sub22 class282_sub22_5 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_5) {
                    int i_7 = class282_sub22_5.method12354(this);
                    if (i_7 < 0) {
                        class282_sub22_5.anInt7676 = 0;
                        method15279(class282_sub22_5);
                    } else {
                        class282_sub22_5.anInt7676 = i_7;
                        method15274(class282_sub22_5.next, class282_sub22_5);
                    }
                }

                if (i_3 != 0) {
                    continue;
                }
            }

            return;
        }
    }

    @Override
    public synchronized void method12241(int[] ints_1, int i_2, int i_3) {
        while (true) {
            if (anInt9827 < 0) {
                method15282(ints_1, i_2, i_3);
            } else if (anInt9826 + i_3 < anInt9827) {
                anInt9826 += i_3;
                method15282(ints_1, i_2, i_3);
            } else {
                int i_4 = anInt9827 - anInt9826;
                method15282(ints_1, i_2, i_4);
                i_2 += i_4;
                i_3 -= i_4;
                anInt9826 += i_4;
                method15277();
                Node_Sub22 class282_sub22_5 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_5) {
                    int i_7 = class282_sub22_5.method12354(this);
                    if (i_7 < 0) {
                        class282_sub22_5.anInt7676 = 0;
                        method15279(class282_sub22_5);
                    } else {
                        class282_sub22_5.anInt7676 = i_7;
                        method15274(class282_sub22_5.next, class282_sub22_5);
                    }
                }

                if (i_3 != 0) {
                    continue;
                }
            }

            return;
        }
    }

    @Override
    Node_Sub15 method12229() {
        return (Node_Sub15) aClass482_9824.next();
    }

    @Override
    Node_Sub15 method12235() {
        return (Node_Sub15) aClass482_9824.next();
    }

    @Override
    Node_Sub15 method12236() {
        return (Node_Sub15) aClass482_9824.next();
    }

    @Override
    Node_Sub15 method12232() {
        return (Node_Sub15) aClass482_9824.head();
    }

    @Override
    Node_Sub15 method12239() {
        return (Node_Sub15) aClass482_9824.next();
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
    int method12227() {
        return 0;
    }

    @Override
    Node_Sub15 method12233() {
        return (Node_Sub15) aClass482_9824.head();
    }

    @Override
    public synchronized void method12243(int i_1) {
        while (true) {
            if (anInt9827 < 0) {
                method15280(i_1);
            } else if (anInt9826 + i_1 < anInt9827) {
                anInt9826 += i_1;
                method15280(i_1);
            } else {
                int i_2 = anInt9827 - anInt9826;
                method15280(i_2);
                i_1 -= i_2;
                anInt9826 += i_2;
                method15277();
                Node_Sub22 class282_sub22_3 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_3) {
                    int i_5 = class282_sub22_3.method12354(this);
                    if (i_5 < 0) {
                        class282_sub22_3.anInt7676 = 0;
                        method15279(class282_sub22_3);
                    } else {
                        class282_sub22_3.anInt7676 = i_5;
                        method15274(class282_sub22_3.next, class282_sub22_3);
                    }
                }

                if (i_1 != 0) {
                    continue;
                }
            }

            return;
        }
    }

    @Override
    public synchronized void method12234(int i_1) {
        while (true) {
            if (anInt9827 < 0) {
                method15280(i_1);
            } else if (anInt9826 + i_1 < anInt9827) {
                anInt9826 += i_1;
                method15280(i_1);
            } else {
                int i_2 = anInt9827 - anInt9826;
                method15280(i_2);
                i_1 -= i_2;
                anInt9826 += i_2;
                method15277();
                Node_Sub22 class282_sub22_3 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_3) {
                    int i_5 = class282_sub22_3.method12354(this);
                    if (i_5 < 0) {
                        class282_sub22_3.anInt7676 = 0;
                        method15279(class282_sub22_3);
                    } else {
                        class282_sub22_3.anInt7676 = i_5;
                        method15274(class282_sub22_3.next, class282_sub22_3);
                    }
                }

                if (i_1 != 0) {
                    continue;
                }
            }

            return;
        }
    }

    @Override
    Node_Sub15 method12226() {
        return (Node_Sub15) aClass482_9824.head();
    }

    @Override
    public synchronized void method12242(int[] ints_1, int i_2, int i_3) {
        while (true) {
            if (anInt9827 < 0) {
                method15282(ints_1, i_2, i_3);
            } else if (anInt9826 + i_3 < anInt9827) {
                anInt9826 += i_3;
                method15282(ints_1, i_2, i_3);
            } else {
                int i_4 = anInt9827 - anInt9826;
                method15282(ints_1, i_2, i_4);
                i_2 += i_4;
                i_3 -= i_4;
                anInt9826 += i_4;
                method15277();
                Node_Sub22 class282_sub22_5 = (Node_Sub22) aClass482_9825.head();
                synchronized (class282_sub22_5) {
                    int i_7 = class282_sub22_5.method12354(this);
                    if (i_7 < 0) {
                        class282_sub22_5.anInt7676 = 0;
                        method15279(class282_sub22_5);
                    } else {
                        class282_sub22_5.anInt7676 = i_7;
                        method15274(class282_sub22_5.next, class282_sub22_5);
                    }
                }

                if (i_3 != 0) {
                    continue;
                }
            }

            return;
        }
    }

}
