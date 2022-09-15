package com.jagex;

public class HashTable {

	static int[] anIntArray5449;
	long retrievalKey;
	Node retrievableNode;
	int size;
	Node[] buckets;

	public HashTable(int size) {
		this.size = size;
		buckets = new Node[size];
		for (int i = 0; i < size; i++) {
			Node node = buckets[i] = new Node();
			node.next = node;
			node.previous = node;
		}
	}

	public Node get(long key) {
		retrievalKey = key;
		Node head = buckets[(int) (key & (size - 1))];
		for (retrievableNode = head.next; head != retrievableNode; retrievableNode = retrievableNode.next)
			if (key == retrievableNode.pointer) {
				Node value = retrievableNode;
				retrievableNode = retrievableNode.next;
				return value;
			}
		retrievableNode = null;
		return null;
	}

	public int method7540() {
		int i_2 = 0;
		for (int i_3 = 0; i_3 < size; i_3++) {
			Node node_4 = buckets[i_3];
			for (Node node_5 = node_4.next; node_4 != node_5; node_5 = node_5.next)
				++i_2;
		}
		return i_2;
	}

	public Node nextInBucket() {
		if (retrievableNode != null) {
			for (Node node = buckets[(int) (retrievalKey & (size - 1))]; node != retrievableNode; retrievableNode = retrievableNode.next)
				if (retrievableNode.pointer == retrievalKey) {
					Node value = retrievableNode;
					retrievableNode = retrievableNode.next;
					return value;
				}
			retrievableNode = null;
		}
		return null;
	}

	public void put(Node value, long key) {
		if (value.previous != null)
			value.unlink();
		Node node = buckets[(int) (key & (size - 1))];
		value.previous = node.previous;
		value.next = node;
		value.previous.next = value;
		value.next.previous = value;
		value.pointer = key;
	}

	public int values(Node[] values) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			Node head = buckets[i];
			for (Node next = head.next; head != next; next = next.next)
				values[count++] = next;
		}
		return count;
	}
}
