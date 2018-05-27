
/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class NodeCollection implements Iterable, Collection {
	Node aClass282_5727;
	public Node head = new Node();

	public void append(Node node, int i) {
		if (null != node.prev)
			node.unlink(-371378792);
		node.prev = head.prev;
		node.next = head;
		node.prev.next = node;
		node.next.prev = node;
	}

	public Node method8061(byte i) {
		Node class282 = head.next;
		if (head == class282)
			return null;
		class282.unlink(-371378792);
		return class282;
	}

	void method8062(NodeCollection class482_0_, Node class282, int i) {
		Node class282_1_ = head.prev;
		head.prev = class282.prev;
		class282.prev.next = head;
		if (class282 != head) {
			class282.prev = class482_0_.head.prev;
			class282.prev.next = class282;
			class282_1_.next = class482_0_.head;
			class482_0_.head.prev = class282_1_;
		}
	}

	public void method8063(NodeCollection class482_2_, int i) {
		if (head.next != head)
			method8062(class482_2_, head.next, -1691020971);
	}

	public Iterator iterator() {
		return new NodeIterator(this);
	}

	public Node method8065(int i) {
		return method8066(null, (byte) -32);
	}

	Node method8066(Node class282, byte i) {
		Node class282_4_;
		if (class282 == null)
			class282_4_ = head.prev;
		else
			class282_4_ = class282;
		if (head == class282_4_) {
			((NodeCollection) this).aClass282_5727 = null;
			return null;
		}
		((NodeCollection) this).aClass282_5727 = class282_4_.prev;
		return class282_4_;
	}

	public Node next(int i) {
		Node class282 = ((NodeCollection) this).aClass282_5727;
		if (class282 == head) {
			((NodeCollection) this).aClass282_5727 = null;
			return null;
		}
		((NodeCollection) this).aClass282_5727 = class282.next;
		return class282;
	}

	public Node method8068(byte i) {
		Node class282 = ((NodeCollection) this).aClass282_5727;
		if (head == class282) {
			((NodeCollection) this).aClass282_5727 = null;
			return null;
		}
		((NodeCollection) this).aClass282_5727 = class282.prev;
		return class282;
	}

	public int size(int i) {
		int amount = 0;
		for (Node n = head.next; head != n; n = n.next)
			amount++;
		return amount;
	}

	public boolean add(Object node) {
		return add((Node) node, -4100975);
	}

	Node[] method8070(int i) {
		Node[] class282s = new Node[size(-1374254477)];
		int i_6_ = 0;
		for (Node class282 = head.next; class282 != head; class282 = class282.next)
			class282s[i_6_++] = class282;
		return class282s;
	}

	public void clear() {
		method8118(913774407);
	}

	public boolean isEmpty() {
		return hasNext(2128482398);
	}

	public boolean contains(Object object) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return method8070(2108497561);
	}

	public Object[] toArray(Object[] objects) {
		int i = 0;
		for (Node class282 = head.next; class282 != head; class282 = class282.next)
			objects[i++] = class282;
		return objects;
	}

	boolean add(Node node, int i) {
		append(node, 1651650132);
		return true;
	}

	public boolean containsAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int hashCode() {
		return super.hashCode();
	}

	Node method8076(Node class282, int i) {
		Node class282_7_;
		if (null == class282)
			class282_7_ = head.next;
		else
			class282_7_ = class282;
		if (head == class282_7_) {
			((NodeCollection) this).aClass282_5727 = null;
			return null;
		}
		((NodeCollection) this).aClass282_5727 = class282_7_.next;
		return class282_7_;
	}

	public boolean hasNext(int i) {
		return head.next == head;
	}

	public Node head(byte i) {
		return method8076(null, -1858764882);
	}

	public void method8098(Node class282, byte i) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		class282.prev = head;
		class282.next = head.next;
		class282.prev.next = class282;
		class282.next.prev = class282;
	}

	public NodeCollection() {
		head.next = head;
		head.prev = head;
	}

	public void method8118(int i) {
		while (head.next != head)
			head.next.unlink(-371378792);
	}

	public int size() {
		return size(-1374254477);
	}

	public boolean remove(Object object) {
		throw new RuntimeException();
	}

	public static void method8144(boolean bool, int i) {
		if (Class328.aClass306_3771 == null)
			Class165.method2852(-1959846530);
		if (bool)
			Class328.aClass306_3771.method5419((byte) 44);
	}

	static boolean method8145(int i) {
		boolean bool;
		try {
			Class395 class395 = new Class395();
			byte[] is = class395.method6764(Class299.aByteArray3543, (byte) -76);
			Class103_Sub1.method14490(is, (byte) -104);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	public static final void method8146(int i) {
		if (!client.aBool7269) {
			client.aFloat7266 += (-24.0F - client.aFloat7266) / 2.0F;
			client.aBool7371 = true;
			client.aBool7269 = true;
		}
	}

	static final void method8147(CS2Executor class527, int i) {
		class527.anInt7012 -= 1560801011;
		Class356[] class356s = Class350_Sub3_Sub1.method15558(418447133);
		Class353[] class353s = Class483.method8155(152314627);
		Class282_Sub15_Sub3.method15239(class356s[(class527.intStack[class527.anInt7012 * 1942118537])], class353s[(class527.intStack[class527.anInt7012 * 1942118537 + 1])], (class527.intStack[1942118537 * class527.anInt7012 + 2]), (class527.intStack[3 + class527.anInt7012 * 1942118537]),
				(class527.intStack[4 + class527.anInt7012 * 1942118537]), (class527.intStack[5 + class527.anInt7012 * 1942118537]), (class527.intStack[class527.anInt7012 * 1942118537 + 6]), (class527.intStack[class527.anInt7012 * 1942118537 + 7]), (class527.intStack[8 + 1942118537 * class527.anInt7012]),
				(class527.intStack[class527.anInt7012 * 1942118537 + 9]), (class527.intStack[10 + class527.anInt7012 * 1942118537]), (byte) -64);
	}

	public static void method8148(byte i) {
		Class253.method4330(22050, Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(722134232) == 1, 2);
		Class320.aClass253_3723 = Class253.method4331(Class351.LOAD_CANVAS, 0, 22050);
		Class42_Sub1.method14563(true, Class282_Sub20_Sub10.method15262(null, 191335579), (short) 27702);
		Class100.aClass253_1008 = Class253.method4331(Class351.LOAD_CANVAS, 1, 2048);
		Class79.aClass282_Sub15_Sub4_783 = new Class282_Sub15_Sub4();
		Class100.aClass253_1008.method4329(Class79.aClass282_Sub15_Sub4_783);
		Class119.aClass344_1460 = new Class344(22050, Class253.anInt3129);
		Class468_Sub6.method12658(552328415);
	}
}
