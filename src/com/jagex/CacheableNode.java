package com.jagex;
public class CacheableNode extends Node {

	public long key;
	public CacheableNode aCacheableNode_8119;
	public CacheableNode current;

	public void method13452() {
		if (this.current != null) {
			this.current.aCacheableNode_8119 = this.aCacheableNode_8119;
			this.aCacheableNode_8119.current = this.current;
			this.aCacheableNode_8119 = null;
			this.current = null;
		}

	}

}
