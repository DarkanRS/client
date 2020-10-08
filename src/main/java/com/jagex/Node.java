package com.jagex;

/**
 * The most basic entry used by any data structure in the engine. By default it operates
 * as a circular doubly linked list and is capable of storing ids, packed bitsets, hashs, and more.
 * When extended, it is able to function as a multi-purpose entry in most common data structures such
 * as HashMaps, Deques, and Caches (specifically LRUCaches in RuneTek)
 *
 * @param <T> The type of data contained by the Node.
 *            This restoration greatly enhances the iterator and general type inference abilities.
 */
public class Node<T> {
    /**
     * Often used as an id, a bitset, a hash, and also serves dozens of other purposes.
     * Named 'pointer' because it serves to point/refer to many objects in various situations.
     */
    public long pointer;
    public Node<T> next;
    public Node<T> previous;

    /**
     * Detaches this Node from one LinkedList to be discarded or inserted elsewhere.
     */
    public void unlink() {
        if (previous != null) {
            previous.next = next;
            next.previous = previous;
            next = null;
            previous = null;
        }
    }

    /**
     * Checks whether or not this node is connected to other nodes and has formed a valid list.
     *
     * @return true if the previous node isn't null, otherwise false
     */
    public boolean linked() {
        return previous != null;
    }
}
