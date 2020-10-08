package com.jagex;

import java.util.Iterator;

public class IterableNodeMap<T> implements Iterable<T> {

    Node<T> aNode_5561;
    Node<T> aNode_5559;
    int anInt5562;
    long aLong5557;
    int size;
    Node<T>[] nodes;

    public IterableNodeMap(int size) {
        this.size = size;
        nodes = new Node[size];
        for (int i_2 = 0; i_2 < size; i_2++) {
            Node<T> node_3 = nodes[i_2] = new Node<T>();
            node_3.next = node_3;
            node_3.previous = node_3;
        }
    }

    static void method7772(Node_Sub31 class282_sub31_0, boolean bool_1) {
        if (class282_sub31_0.aBool7774) {
            if (class282_sub31_0.anInt7765 < 0 || Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(), class282_sub31_0.anInt7765, class282_sub31_0.anInt7770)) {
                if (bool_1) {
                    QuickChatValueType.method4179(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, null);
                } else {
                    Class174.animateObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.anInt7765, class282_sub31_0.anInt7767, class282_sub31_0.anInt7770, -1);
                }
                class282_sub31_0.unlink();
            }
        } else if (class282_sub31_0.aBool7773 && class282_sub31_0.anInt7762 >= 1 && class282_sub31_0.anInt7763 >= 1 && class282_sub31_0.anInt7762 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && class282_sub31_0.anInt7763 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2 && (class282_sub31_0.anInt7769 < 0 || Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(), class282_sub31_0.anInt7769, class282_sub31_0.anInt7771))) {
            if (bool_1) {
                QuickChatValueType.method4179(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.aClass476_7768);
            } else {
                Class174.animateObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.anInt7769, class282_sub31_0.anInt7772, class282_sub31_0.anInt7771, -1);
            }
            class282_sub31_0.aBool7773 = false;
            if (!bool_1 && class282_sub31_0.anInt7765 == class282_sub31_0.anInt7769 && class282_sub31_0.anInt7765 == -1) {
                class282_sub31_0.unlink();
            } else if (!bool_1 && class282_sub31_0.anInt7765 == class282_sub31_0.anInt7769 && class282_sub31_0.anInt7767 == class282_sub31_0.anInt7772 && class282_sub31_0.anInt7771 == class282_sub31_0.anInt7770) {
                class282_sub31_0.unlink();
            }
        }
    }

    public Node<T> method7747() {
        if (aNode_5561 == null) {
            return null;
        } else {
            for (Node node_2 = nodes[(int) (aLong5557 & (size - 1))]; node_2 != aNode_5561; aNode_5561 = aNode_5561.next) {
                if (aNode_5561.pointer == aLong5557) {
                    Node node_3 = aNode_5561;
                    aNode_5561 = aNode_5561.next;
                    return node_3;
                }
            }
            aNode_5561 = null;
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

    public void method7749() {
        for (int i_2 = 0; i_2 < size; i_2++) {
            Node<T> node_3 = nodes[i_2];
            while (true) {
                Node<T> node_4 = node_3.next;
                if (node_3 == node_4) {
                    break;
                }
                node_4.unlink();
            }
        }
        aNode_5561 = null;
        aNode_5559 = null;
    }

    public Node<T> method7750() {
        anInt5562 = 0;
        return method7751();
    }

    public Node<T> method7751() {
        Node<T> node_2;
        if (anInt5562 > 0 && nodes[anInt5562 - 1] != aNode_5559) {
            node_2 = aNode_5559;
            aNode_5559 = node_2.next;
            return node_2;
        } else {
            while (anInt5562 < size) {
                node_2 = nodes[++anInt5562 - 1].next;
                if (node_2 != nodes[anInt5562 - 1]) {
                    aNode_5559 = node_2.next;
                    return node_2;
                }
            }
            return null;
        }
    }

    public Node<T> get(long long_1) {
        aLong5557 = long_1;
        Node<T> node_3 = nodes[(int) (long_1 & (size - 1))];
        for (aNode_5561 = node_3.next; node_3 != aNode_5561; aNode_5561 = aNode_5561.next) {
            if (long_1 == aNode_5561.pointer) {
                Node<T> node_4 = aNode_5561;
                aNode_5561 = aNode_5561.next;
                return node_4;
            }
        }
        aNode_5561 = null;
        return null;
    }

    public void put(Node<T> node_1, long long_2) {
        if (node_1.previous != null) {
            node_1.unlink();
        }
        Node<T> node_4 = nodes[(int) (long_2 & (size - 1))];
        node_1.previous = node_4.previous;
        node_1.next = node_4;
        node_1.previous.next = node_1;
        node_1.next.previous = node_1;
        node_1.pointer = long_2;
    }
}
