import java.util.Iterator;

public class NodeIterator implements Iterator {

    Node aClass282_5536;

    Node aClass282_5537 = null;

    NodeCollection collection;

    public Node method7683(int i_1) {
        this.method7697((short) -14367);
        return (Node) this.next();
    }

    public Object next() {
        Node node_1 = this.aClass282_5536;
        if (node_1 == this.collection.tail) {
            node_1 = null;
            this.aClass282_5536 = null;
        } else {
            this.aClass282_5536 = node_1.next;
        }
        this.aClass282_5537 = node_1;
        return node_1;
    }

    public boolean hasNext() {
        return this.collection.tail != this.aClass282_5536;
    }

    public void method7684(NodeCollection nodecollection_1, byte b_2) {
        this.collection = nodecollection_1;
        this.aClass282_5536 = this.collection.tail.next;
        this.aClass282_5537 = null;
    }

    public NodeIterator(NodeCollection nodecollection_1) {
        this.collection = nodecollection_1;
        this.aClass282_5536 = this.collection.tail.next;
        this.aClass282_5537 = null;
    }

    public void remove() {
        if (this.aClass282_5537 == null) {
            throw new IllegalStateException();
        } else {
            this.aClass282_5537.remove();
            this.aClass282_5537 = null;
        }
    }

    void method7697(short s_1) {
        this.aClass282_5536 = this.collection.tail.next;
        this.aClass282_5537 = null;
    }
}
