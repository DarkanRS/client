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

	static final void method7699(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aBool7151 ? 1 : 0;
	}

	static final void method7700(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		Class537 class537_3 = IndexLoaders.aClass233_5822.method3933(i_2, 1537794608);
		if (class537_3 == null) {
			throw new RuntimeException();
		} else {
			Integer integer_4 = cs2executor_0.aClass61_7010.method1225(client.CURRENT_GAME.anInt5746 << 16 | class537_3.anInt7097, class537_3.anInt7098, class537_3.anInt7099, (byte) 116);
			int i_5;
			if (integer_4 == null) {
				i_5 = 0;
			} else {
				i_5 = integer_4.intValue();
			}

			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_5;
		}
	}

}
