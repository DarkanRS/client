package com.jagex;

public class CacheableNode extends Node {

    public long key;
    public CacheableNode aCacheableNode_8119;
    public CacheableNode current;

    public void method13452() {
        if (current != null) {
            current.aCacheableNode_8119 = aCacheableNode_8119;
            aCacheableNode_8119.current = current;
            aCacheableNode_8119 = null;
            current = null;
        }
    }
}
