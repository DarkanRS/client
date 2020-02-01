package com.jagex;


public class Node<T> {
    public long data;
    public Node<T> next;
    public Node<T> prev;

    public void remove() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }

    public boolean isLinked() {
        return this.prev != null;
    }
}
