package com.jagex;

import java.util.Iterator;

public class NodeIterator implements Iterator {

	Node aNode_5536;

	Node aNode_5537;

	NodeCollection collection;

	public NodeIterator(NodeCollection nodecollection_1) {
		collection = nodecollection_1;
		aNode_5536 = collection.tail.next;
		aNode_5537 = null;
	}

	@Override
	public boolean hasNext() {
		return collection.tail != aNode_5536;
	}

	public Node method7683() {
		method7697();
		return (Node) next();
	}

	public void method7684(NodeCollection nodecollection_1) {
		collection = nodecollection_1;
		aNode_5536 = collection.tail.next;
		aNode_5537 = null;
	}

	void method7697() {
		aNode_5536 = collection.tail.next;
		aNode_5537 = null;
	}

	@Override
	public Object next() {
		Node node_1 = aNode_5536;
		if (node_1 == collection.tail) {
			node_1 = null;
			aNode_5536 = null;
		} else
			aNode_5536 = node_1.next;
		aNode_5537 = node_1;
		return node_1;
	}

	@Override
	public void remove() {
		if (aNode_5537 == null)
			throw new IllegalStateException();
		aNode_5537.unlink();
		aNode_5537 = null;
	}
}
