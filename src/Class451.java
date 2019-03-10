import java.util.Iterator;

public class Class451 implements Iterator {

    Node aClass282_5441 = null;

    IterableNodeMap aClass465_5439;

    int anInt5442;

    Node aClass282_5440;

    public Node method7503(int i_1) {
        this.method7512(789041827);
        return (Node) this.next();
    }

    public Class451(IterableNodeMap iterablenodemap_1) {
        this.aClass465_5439 = iterablenodemap_1;
        this.method7512(-303095976);
    }

    public boolean hasNext() {
        if (this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1] != this.aClass282_5440) {
            return true;
        } else {
            while (this.anInt5442 < this.aClass465_5439.anInt5560) {
                if (this.aClass465_5439.aClass282Array5558[++this.anInt5442 - 1].next != this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1]) {
                    this.aClass282_5440 = this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1].next;
                    return true;
                }
                this.aClass282_5440 = this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1];
            }
            return false;
        }
    }

    public void remove() {
        if (this.aClass282_5441 == null) {
            throw new IllegalStateException();
        } else {
            this.aClass282_5441.remove();
            this.aClass282_5441 = null;
        }
    }

    public Object next() {
        Node node_1;
        if (this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1] != this.aClass282_5440) {
            node_1 = this.aClass282_5440;
            this.aClass282_5440 = node_1.next;
            this.aClass282_5441 = node_1;
            return node_1;
        } else {
            while (this.anInt5442 < this.aClass465_5439.anInt5560) {
                node_1 = this.aClass465_5439.aClass282Array5558[++this.anInt5442 - 1].next;
                if (node_1 != this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1]) {
                    this.aClass282_5440 = node_1.next;
                    this.aClass282_5441 = node_1;
                    return node_1;
                }
            }
            return null;
        }
    }

    void method7512(int i_1) {
        this.aClass282_5440 = this.aClass465_5439.aClass282Array5558[0].next;
        this.anInt5442 = 1;
        this.aClass282_5441 = null;
    }

    public static boolean method7517(byte b_0) {
        Class282_Sub42 class282_sub42_1 = (Class282_Sub42) Class435.aClass482_5332.head((byte) 42);
        return class282_sub42_1 != null;
    }

    static Class411[] method7519(short s_0) {
        return new Class411[] { Class411.aClass411_4928, Class411.aClass411_4952, Class411.aClass411_4939, Class411.aClass411_4954, Class411.aClass411_4942, Class411.aClass411_4948, Class411.aClass411_4941, Class411.aClass411_4953, Class411.aClass411_4934, Class411.aClass411_4926, Class411.aClass411_4951, Class411.aClass411_4930, Class411.aClass411_4935, Class411.aClass411_4946, Class411.aClass411_4927, Class411.aClass411_4944, Class411.aClass411_4943, Class411.aClass411_4931, Class411.aClass411_4949, Class411.aClass411_4940, Class411.aClass411_4936, Class411.aClass411_4947, Class411.aClass411_4925, Class411.aClass411_4929, Class411.aClass411_4955, Class411.aClass411_4950, Class411.aClass411_4937, Class411.aClass411_4932, Class411.aClass411_4933, Class411.aClass411_4938, Class411.aClass411_4945 };
    }
}
