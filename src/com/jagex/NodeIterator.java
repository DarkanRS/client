package com.jagex;

import java.util.Iterator;

public class NodeIterator implements Iterator {

    Node aNode_5536;

    Node aNode_5537 = null;

    NodeCollection collection;

    public Node method7683(int i_1) {
        this.method7697();
        return (Node) this.next();
    }

    public Object next() {
        Node node_1 = this.aNode_5536;
        if (node_1 == this.collection.tail) {
            node_1 = null;
            this.aNode_5536 = null;
        } else {
            this.aNode_5536 = node_1.next;
        }
        this.aNode_5537 = node_1;
        return node_1;
    }

    public boolean hasNext() {
        return this.collection.tail != this.aNode_5536;
    }

    public void method7684(NodeCollection nodecollection_1) {
        this.collection = nodecollection_1;
        this.aNode_5536 = this.collection.tail.next;
        this.aNode_5537 = null;
    }

    public NodeIterator(NodeCollection nodecollection_1) {
        this.collection = nodecollection_1;
        this.aNode_5536 = this.collection.tail.next;
        this.aNode_5537 = null;
    }

    public void remove() {
        if (this.aNode_5537 == null) {
            throw new IllegalStateException();
        } else {
            this.aNode_5537.remove();
            this.aNode_5537 = null;
        }
    }

    void method7697() {
        this.aNode_5536 = this.collection.tail.next;
        this.aNode_5537 = null;
    }
}
