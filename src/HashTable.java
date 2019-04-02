public final class HashTable {

	static int[] anIntArray5449;
	long retrievalKey;
	Node retrievableNode;
	int size;
	Node[] buckets;

	public Node get(long key) {
		this.retrievalKey = key;
		Node head = this.buckets[(int) (key & (long) (this.size - 1))];

		for (this.retrievableNode = head.next; head != this.retrievableNode; this.retrievableNode = this.retrievableNode.next) {
			if (key == this.retrievableNode.data) {
				Node value = this.retrievableNode;
				this.retrievableNode = this.retrievableNode.next;
				return value;
			}
		}

		this.retrievableNode = null;
		return null;
	}

	public int values(Node[] values) {
		int count = 0;

		for (int i = 0; i < this.size; i++) {
			Node head = this.buckets[i];
			for (Node next = head.next; head != next; next = next.next) {
				values[count++] = next;
			}
		}

		return count;
	}

	public void put(Node value, long key) {
		if (value.prev != null) {
			value.remove();
		}

		Node node = this.buckets[(int) (key & (long) (this.size - 1))];
		value.prev = node.prev;
		value.next = node;
		value.prev.next = value;
		value.next.prev = value;
		value.data = key;
	}

	public int method7540() {
		int i_2 = 0;

		for (int i_3 = 0; i_3 < this.size; i_3++) {
			Node node_4 = this.buckets[i_3];

			for (Node node_5 = node_4.next; node_4 != node_5; node_5 = node_5.next) {
				++i_2;
			}
		}
		return i_2;
	}

	public HashTable(int size) {
		this.size = size;
		this.buckets = new Node[size];

		for (int i = 0; i < size; i++) {
			Node node = this.buckets[i] = new Node();
			node.next = node;
			node.prev = node;
		}
	}

	public Node nextInBucket() {
		if (this.retrievableNode == null) {
			return null;
		} else {
			for (Node node = this.buckets[(int) (this.retrievalKey & (long) (this.size - 1))]; node != this.retrievableNode; this.retrievableNode = this.retrievableNode.next) {
				if (this.retrievableNode.data == this.retrievalKey) {
					Node value = this.retrievableNode;
					this.retrievableNode = this.retrievableNode.next;
					return value;
				}
			}

			this.retrievableNode = null;
			return null;
		}
	}

	static final void method7547(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aString1348 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

}
