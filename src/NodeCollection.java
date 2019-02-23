import java.util.Collection;
import java.util.Iterator;

public class NodeCollection implements Iterable, Collection {

	Node aClass282_5727;
	public Node head = new Node();

	public void append(Node node_1, int i_2) {
		if (node_1.next != null) {
			node_1.remove();
		}

		node_1.next = this.head.next;
		node_1.prev = this.head;
		node_1.next.prev = node_1;
		node_1.prev.next = node_1;
	}

	public Node method8061(byte b_1) {
		Node node_2 = this.head.prev;
		if (node_2 == this.head) {
			return null;
		} else {
			node_2.remove();
			return node_2;
		}
	}

	void method8062(NodeCollection nodecollection_1, Node node_2, int i_3) {
		Node node_4 = this.head.next;
		this.head.next = node_2.next;
		node_2.next.prev = this.head;
		if (node_2 != this.head) {
			node_2.next = nodecollection_1.head.next;
			node_2.next.prev = node_2;
			node_4.prev = nodecollection_1.head;
			nodecollection_1.head.next = node_4;
		}

	}

	public void method8063(NodeCollection nodecollection_1, int i_2) {
		if (this.head.prev != this.head) {
			this.method8062(nodecollection_1, this.head.prev, -1691020971);
		}

	}

	public Iterator iterator() {
		return new NodeIterator(this);
	}

	public Node method8065(int i_1) {
		return this.method8066((Node) null, (byte) -32);
	}

	Node method8066(Node node_1, byte b_2) {
		Node node_3;
		if (node_1 == null) {
			node_3 = this.head.next;
		} else {
			node_3 = node_1;
		}

		if (node_3 == this.head) {
			this.aClass282_5727 = null;
			return null;
		} else {
			this.aClass282_5727 = node_3.next;
			return node_3;
		}
	}

	public Node next(int i_1) {
		Node node_2 = this.aClass282_5727;
		if (node_2 == this.head) {
			this.aClass282_5727 = null;
			return null;
		} else {
			this.aClass282_5727 = node_2.prev;
			return node_2;
		}
	}

	public Node method8068(byte b_1) {
		Node node_2 = this.aClass282_5727;
		if (node_2 == this.head) {
			this.aClass282_5727 = null;
			return null;
		} else {
			this.aClass282_5727 = node_2.next;
			return node_2;
		}
	}

	public int size(int i_1) {
		int i_2 = 0;

		for (Node node_3 = this.head.prev; node_3 != this.head; node_3 = node_3.prev) {
			++i_2;
		}

		return i_2;
	}

	public boolean add(Object object_1) {
		return this.add((Node) object_1, -4100975);
	}

	Node[] method8070(int i_1) {
		Node[] arr_2 = new Node[this.size(-1374254477)];
		int i_3 = 0;

		for (Node node_4 = this.head.prev; node_4 != this.head; node_4 = node_4.prev) {
			arr_2[i_3++] = node_4;
		}

		return arr_2;
	}

	public void clear() {
		this.method8118(913774407);
	}

	public boolean isEmpty() {
		return this.hasNext(2128482398);
	}

	public boolean contains(Object object_1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method8070(2108497561);
	}

	public Object[] toArray(Object[] arr_1) {
		int i_2 = 0;

		for (Node node_3 = this.head.prev; node_3 != this.head; node_3 = node_3.prev) {
			arr_1[i_2++] = node_3;
		}

		return arr_1;
	}

	boolean add(Node node_1, int i_2) {
		this.append(node_1, 1651650132);
		return true;
	}

	public boolean containsAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean equals(Object object_1) {
		return super.equals(object_1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	Node method8076(Node node_1, int i_2) {
		Node node_3;
		if (node_1 == null) {
			node_3 = this.head.prev;
		} else {
			node_3 = node_1;
		}

		if (node_3 == this.head) {
			this.aClass282_5727 = null;
			return null;
		} else {
			this.aClass282_5727 = node_3.prev;
			return node_3;
		}
	}

	public boolean hasNext(int i_1) {
		return this.head.prev == this.head;
	}

	public Node head(byte b_1) {
		return this.method8076((Node) null, -1858764882);
	}

	public void method8098(Node node_1, byte b_2) {
		if (node_1.next != null) {
			node_1.remove();
		}

		node_1.next = this.head;
		node_1.prev = this.head.prev;
		node_1.next.prev = node_1;
		node_1.prev.next = node_1;
	}

	public NodeCollection() {
		this.head.prev = this.head;
		this.head.next = this.head;
	}

	public void method8118(int i_1) {
		while (this.head.prev != this.head) {
			this.head.prev.remove();
		}

	}

	public int size() {
		return this.size(-1374254477);
	}

	public boolean remove(Object object_1) {
		throw new RuntimeException();
	}

	public static void method8144(boolean bool_0, int i_1) {
		if (Class328.aClass306_3771 == null) {
			Class165.method2852(-1959846530);
		}

		if (bool_0) {
			Class328.aClass306_3771.method5419((byte) 44);
		}

	}

	static boolean method8145(int i_0) {
		try {
			Class395 class395_2 = new Class395();
			byte[] bytes_3 = class395_2.method6764(Class299.aByteArray3543, (byte) -76);
			Class103_Sub1.method14490(bytes_3, (byte) -104);
			boolean bool_1 = true;
			return bool_1;
		} catch (Exception exception_4) {
			return false;
		}
	}

	public static final void method8146(int i_0) {
		if (!client.aBool7269) {
			client.aFloat7266 += (-24.0F - client.aFloat7266) / 2.0F;
			client.aBool7371 = true;
			client.aBool7269 = true;
		}

	}

	static final void method8147(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 11;
		Class356[] arr_2 = Class350_Sub3_Sub1.method15558(418447133);
		Class353[] arr_3 = AccountCreationResponseOpcodes.method8155(152314627);
		Class282_Sub15_Sub3.method15239(arr_2[cs2executor_0.intStack[cs2executor_0.intStackPtr]], arr_3[cs2executor_0.intStack[cs2executor_0.intStackPtr + 1]], cs2executor_0.intStack[cs2executor_0.intStackPtr + 2], cs2executor_0.intStack[cs2executor_0.intStackPtr + 3], cs2executor_0.intStack[cs2executor_0.intStackPtr + 4], cs2executor_0.intStack[cs2executor_0.intStackPtr + 5], cs2executor_0.intStack[cs2executor_0.intStackPtr + 6], cs2executor_0.intStack[cs2executor_0.intStackPtr + 7], cs2executor_0.intStack[cs2executor_0.intStackPtr + 8], cs2executor_0.intStack[cs2executor_0.intStackPtr + 9], cs2executor_0.intStack[cs2executor_0.intStackPtr + 10], (byte) -64);
	}

	public static void method8148(byte b_0) {
		Class253.method4330(22050, Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(722134232) == 1, 2);
		Class320.aClass253_3723 = Class253.method4331(Class351.gameCanvas, 0, 22050);
		Class42_Sub1.method14563(true, Class282_Sub20_Sub10.method15262((Class282_Sub15_Sub2) null, 191335579), (short) 27702);
		Class100.aClass253_1008 = Class253.method4331(Class351.gameCanvas, 1, 2048);
		Class79.aClass282_Sub15_Sub4_783 = new Class282_Sub15_Sub4();
		Class100.aClass253_1008.method4329(Class79.aClass282_Sub15_Sub4_783);
		Class119.aClass344_1460 = new Class344(22050, Class253.anInt3129);
		Class468_Sub6.method12658(552328415);
	}

}
