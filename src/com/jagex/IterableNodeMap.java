package com.jagex;

import java.util.Iterator;

public final class IterableNodeMap<T> implements Iterable<T> {

    Node<T> aNode_5561;
    Node<T> aNode_5559;
    int anInt5562 = 0;
    long aLong5557;
    int size;
    Node<T>[] nodes;

    public Node<T> method7747(int i_1) {
        if (this.aNode_5561 == null) {
            return null;
        } else {
            for (Node node_2 = this.nodes[(int) (this.aLong5557 & (long) (this.size - 1))]; node_2 != this.aNode_5561; this.aNode_5561 = this.aNode_5561.next) {
                if (this.aNode_5561.data == this.aLong5557) {
                    Node node_3 = this.aNode_5561;
                    this.aNode_5561 = this.aNode_5561.next;
                    return node_3;
                }
            }
            this.aNode_5561 = null;
            return null;
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Node<T> nodes = this.nodes[i];
            for (Node<T> node = nodes.next; nodes != node; node = node.next) {
                ++size;
            }
        }
        return size;
    }

    public Iterator<T> iterator() {
        return new HashTableIterator(this);
    }

    public void method7749(int i_1) {
        for (int i_2 = 0; i_2 < this.size; i_2++) {
            Node<T> node_3 = this.nodes[i_2];
            while (true) {
                Node<T> node_4 = node_3.next;
                if (node_3 == node_4) {
                    break;
                }
                node_4.remove();
            }
        }
        this.aNode_5561 = null;
        this.aNode_5559 = null;
    }

    public Node<T> method7750(int i_1) {
        this.anInt5562 = 0;
        return this.method7751((byte) 63);
    }

    public Node<T> method7751(byte b_1) {
        Node<T> node_2;
        if (this.anInt5562 > 0 && this.nodes[this.anInt5562 - 1] != this.aNode_5559) {
            node_2 = this.aNode_5559;
            this.aNode_5559 = node_2.next;
            return node_2;
        } else {
            while (this.anInt5562 < this.size) {
                node_2 = this.nodes[++this.anInt5562 - 1].next;
                if (node_2 != this.nodes[this.anInt5562 - 1]) {
                    this.aNode_5559 = node_2.next;
                    return node_2;
                }
            }
            return null;
        }
    }

    public Node<T> get(long long_1) {
        this.aLong5557 = long_1;
        Node<T> node_3 = this.nodes[(int) (long_1 & (long) (this.size - 1))];
        for (this.aNode_5561 = node_3.next; node_3 != this.aNode_5561; this.aNode_5561 = this.aNode_5561.next) {
            if (long_1 == this.aNode_5561.data) {
                Node<T> node_4 = this.aNode_5561;
                this.aNode_5561 = this.aNode_5561.next;
                return node_4;
            }
        }
        this.aNode_5561 = null;
        return null;
    }

    public void put(Node<T> node_1, long long_2) {
        if (node_1.prev != null) {
            node_1.remove();
        }
        Node<T> node_4 = this.nodes[(int) (long_2 & (long) (this.size - 1))];
        node_1.prev = node_4.prev;
        node_1.next = node_4;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
        node_1.data = long_2;
    }

    public IterableNodeMap(int size) {
        this.size = size;
        this.nodes = new Node[size];
        for (int i_2 = 0; i_2 < size; i_2++) {
            Node<T> node_3 = this.nodes[i_2] = new Node<T>();
            node_3.next = node_3;
            node_3.prev = node_3;
        }
    }

    static final void method7772(Node_Sub31 class282_sub31_0, boolean bool_1) {
        if (class282_sub31_0.aBool7774) {
            if (class282_sub31_0.anInt7765 < 0 || Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(), class282_sub31_0.anInt7765, class282_sub31_0.anInt7770)) {
                if (!bool_1) {
                    Class174.animateObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.anInt7765, class282_sub31_0.anInt7767, class282_sub31_0.anInt7770, -1, -1133711870);
                } else {
                    QuickChatValueType.method4179(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, null, (byte) 30);
                }
                class282_sub31_0.remove();
            }
        } else if (class282_sub31_0.aBool7773 && class282_sub31_0.anInt7762 >= 1 && class282_sub31_0.anInt7763 >= 1 && class282_sub31_0.anInt7762 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && class282_sub31_0.anInt7763 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2 && (class282_sub31_0.anInt7769 < 0 || Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(), class282_sub31_0.anInt7769, class282_sub31_0.anInt7771))) {
            if (!bool_1) {
                Class174.animateObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.anInt7769, class282_sub31_0.anInt7772, class282_sub31_0.anInt7771, -1, -1118636715);
            } else {
                QuickChatValueType.method4179(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.aClass476_7768, (byte) 127);
            }
            class282_sub31_0.aBool7773 = false;
            if (!bool_1 && class282_sub31_0.anInt7765 == class282_sub31_0.anInt7769 && class282_sub31_0.anInt7765 == -1) {
                class282_sub31_0.remove();
            } else if (!bool_1 && class282_sub31_0.anInt7765 == class282_sub31_0.anInt7769 && class282_sub31_0.anInt7767 == class282_sub31_0.anInt7772 && class282_sub31_0.anInt7771 == class282_sub31_0.anInt7770) {
                class282_sub31_0.remove();
            }
        }
    }
}
