package com.jagex;

import java.util.Collection;
import java.util.Iterator;

public class NodeCollection implements Collection {

    public Node tail = new Node();
    Node current;

    public NodeCollection() {
        tail.next = tail;
        tail.previous = tail;
    }

    public static void method8144(boolean bool_0) {
        if (Comparable_Sub1.aClass306_3771 == null) {
            Class165.method2852();
        }
        if (bool_0) {
            Comparable_Sub1.aClass306_3771.method5419();
        }
    }

    static boolean method8145() {
        try {
            Class395 class395_2 = new Class395();
            byte[] bytes_3 = class395_2.method6764(Class299.aByteArray3543);
            Class103_Sub1.method14490(bytes_3);
            boolean bool_1 = true;
            return bool_1;
        } catch (Exception exception_4) {
            return false;
        }
    }

    public static void method8146() {
        if (!client.aBool7269) {
            client.aFloat7266 += (-24.0f - client.aFloat7266) / 2.0F;
            client.aBool7371 = true;
            client.aBool7269 = true;
        }
    }

    public static void method8148() {
        Class253.setAudioToStereo(Class393.preferences.monoStereo.getPref() == 1);
        Class320.aClass253_3723 = Class253.method4331(0, 22050);
        Class42_Sub1.method14563(MaterialProp8.method15262(null));
        ShaderDecoder.aClass253_1008 = Class253.method4331(1, 2048);
        Class79.aNode_Sub15_Sub4_783 = new Node_Sub15_Sub4();
        ShaderDecoder.aClass253_1008.method4329(Class79.aNode_Sub15_Sub4_783);
        Class119.aClass344_1460 = new Class344(22050, Class253.hertz);
        GraphicsPreference.method12658();
    }

    public void append(Node node_1) {
        if (node_1.previous != null) {
            node_1.unlink();
        }
        node_1.previous = tail.previous;
        node_1.next = tail;
        node_1.previous.next = node_1;
        node_1.next.previous = node_1;
    }

    public Node popHead() {
        Node node_2 = tail.next;
        if (node_2 == tail) {
            return null;
        } else {
            node_2.unlink();
            return node_2;
        }
    }

    void method8062(NodeCollection nodecollection_1, Node node_2) {
        Node node_4 = tail.previous;
        tail.previous = node_2.previous;
        node_2.previous.next = tail;
        if (node_2 != tail) {
            node_2.previous = nodecollection_1.tail.previous;
            node_2.previous.next = node_2;
            node_4.next = nodecollection_1.tail;
            nodecollection_1.tail.previous = node_4;
        }
    }

    public void method8063(NodeCollection nodecollection_1) {
        if (tail.next != tail) {
            method8062(nodecollection_1, tail.next);
        }
    }

    @Override
    public Iterator iterator() {
        return new NodeIterator(this);
    }

    public Node method8065() {
        return method8066(null);
    }

    Node method8066(Node node_1) {
        Node node_3;
        if (node_1 == null) {
            node_3 = tail.previous;
        } else {
            node_3 = node_1;
        }
        if (node_3 == tail) {
            current = null;
            return null;
        } else {
            current = node_3.previous;
            return node_3;
        }
    }

    public Node next() {
        Node node_2 = current;
        if (node_2 == tail) {
            current = null;
            return null;
        } else {
            current = node_2.next;
            return node_2;
        }
    }

    public Node method8068() {
        Node node_2 = current;
        if (node_2 == tail) {
            current = null;
            return null;
        } else {
            current = node_2.previous;
            return node_2;
        }
    }

    @Override
    public int size() {
        int i_2 = 0;
        for (Node node_3 = tail.next; node_3 != tail; node_3 = node_3.next) {
            ++i_2;
        }
        return i_2;
    }

    @Override
    public boolean add(Object object_1) {
        return add((Node) object_1);
    }

    Node[] method8070() {
        Node[] arr_2 = new Node[size()];
        int i_3 = 0;
        for (Node node_4 = tail.next; node_4 != tail; node_4 = node_4.next) {
            arr_2[i_3++] = node_4;
        }
        return arr_2;
    }

    @Override
    public void clear() {
        removeAll();
    }

    @Override
    public boolean isEmpty() {
        return hasNext();
    }

    @Override
    public boolean contains(Object object_1) {
        throw new RuntimeException();
    }

    @Override
    public Object[] toArray() {
        return method8070();
    }

    @Override
    public Object[] toArray(Object[] arr_1) {
        int i_2 = 0;
        for (Node node_3 = tail.next; node_3 != tail; node_3 = node_3.next) {
            arr_1[i_2++] = node_3;
        }
        return arr_1;
    }

    boolean add(Node node_1) {
        append(node_1);
        return true;
    }

    @Override
    public boolean containsAll(Collection collection_1) {
        throw new RuntimeException();
    }

    @Override
    public boolean addAll(Collection collection_1) {
        throw new RuntimeException();
    }

    @Override
    public boolean removeAll(Collection collection_1) {
        throw new RuntimeException();
    }

    @Override
    public boolean retainAll(Collection collection_1) {
        throw new RuntimeException();
    }

    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

    public int hashCode() {
        return super.hashCode();
    }

    Node method8076(Node node_1) {
        Node node_3;
        if (node_1 == null) {
            node_3 = tail.next;
        } else {
            node_3 = node_1;
        }
        if (node_3 == tail) {
            current = null;
            return null;
        } else {
            current = node_3.next;
            return node_3;
        }
    }

    public boolean hasNext() {
        return tail.next == tail;
    }

    public Node head() {
        return method8076(null);
    }

    public void method8098(Node node_1) {
        if (node_1.previous != null) {
            node_1.unlink();
        }
        node_1.previous = tail;
        node_1.next = tail.next;
        node_1.previous.next = node_1;
        node_1.next.previous = node_1;
    }

    public void removeAll() {
        while (tail.next != tail) {
            tail.next.unlink();
        }
    }

    @Override
    public boolean remove(Object object_1) {
        throw new RuntimeException();
    }
}
