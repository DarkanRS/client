
/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class NodeIterator implements Iterator {
	NodeCollection collection;
	Node aClass282_5536;
	Node aClass282_5537 = null;

	public Node method7680() {
		method7697((short) -18109);
		return (Node) next();
	}

	public Object method7681() {
		Node class282 = ((NodeIterator) this).aClass282_5536;
		if (class282 == ((NodeIterator) this).collection.head) {
			class282 = null;
			((NodeIterator) this).aClass282_5536 = null;
		} else
			((NodeIterator) this).aClass282_5536 = class282.next;
		((NodeIterator) this).aClass282_5537 = class282;
		return class282;
	}

	public Node method7682() {
		method7697((short) -10835);
		return (Node) next();
	}

	public Node method7683(int i) {
		method7697((short) -14367);
		return (Node) next();
	}

	public Object next() {
		Node class282 = ((NodeIterator) this).aClass282_5536;
		if (class282 == ((NodeIterator) this).collection.head) {
			class282 = null;
			((NodeIterator) this).aClass282_5536 = null;
		} else
			((NodeIterator) this).aClass282_5536 = class282.next;
		((NodeIterator) this).aClass282_5537 = class282;
		return class282;
	}

	public boolean hasNext() {
		return (((NodeIterator) this).collection.head != ((NodeIterator) this).aClass282_5536);
	}

	public void method7684(NodeCollection class482, byte i) {
		((NodeIterator) this).collection = class482;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public boolean method7685() {
		return (((NodeIterator) this).collection.head != ((NodeIterator) this).aClass282_5536);
	}

	public boolean method7686() {
		return (((NodeIterator) this).collection.head != ((NodeIterator) this).aClass282_5536);
	}

	public boolean method7687() {
		return (((NodeIterator) this).collection.head != ((NodeIterator) this).aClass282_5536);
	}

	public NodeIterator(NodeCollection collection) {
		((NodeIterator) this).collection = collection;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public Object method7688() {
		Node class282 = ((NodeIterator) this).aClass282_5536;
		if (class282 == ((NodeIterator) this).collection.head) {
			class282 = null;
			((NodeIterator) this).aClass282_5536 = null;
		} else
			((NodeIterator) this).aClass282_5536 = class282.next;
		((NodeIterator) this).aClass282_5537 = class282;
		return class282;
	}

	public Object method7689() {
		Node class282 = ((NodeIterator) this).aClass282_5536;
		if (class282 == ((NodeIterator) this).collection.head) {
			class282 = null;
			((NodeIterator) this).aClass282_5536 = null;
		} else
			((NodeIterator) this).aClass282_5536 = class282.next;
		((NodeIterator) this).aClass282_5537 = class282;
		return class282;
	}

	public void remove() {
		if (((NodeIterator) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((NodeIterator) this).aClass282_5537.unlink(-371378792);
		((NodeIterator) this).aClass282_5537 = null;
	}

	public void method7690() {
		if (((NodeIterator) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((NodeIterator) this).aClass282_5537.unlink(-371378792);
		((NodeIterator) this).aClass282_5537 = null;
	}

	public void method7691(NodeCollection class482) {
		((NodeIterator) this).collection = class482;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public void method7692(NodeCollection class482) {
		((NodeIterator) this).collection = class482;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	void method7693() {
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public void method7694() {
		if (((NodeIterator) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((NodeIterator) this).aClass282_5537.unlink(-371378792);
		((NodeIterator) this).aClass282_5537 = null;
	}

	void method7695() {
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public void method7696(NodeCollection class482) {
		((NodeIterator) this).collection = class482;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	void method7697(short i) {
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.next;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public Node method7698() {
		method7697((short) -19395);
		return (Node) next();
	}

	static final void method7699(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7151 ? 1 : 0;
	}

	static final void method7700(CS2Executor class527, int i) {
		int i_0_ = (class527.intOpValues[class527.instrPtr * 301123709]);
		Class537 class537 = IndexLoaders.aClass233_5822.method3933(i_0_, 1537794608);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (class527.aClass61_7010.method1225((1648080491 * client.CURRENT_GAME.anInt5746 << 16 | -1659474903 * class537.anInt7097), class537.anInt7098 * 1866356493, -47997093 * class537.anInt7099, (byte) 116));
		int i_1_;
		if (null == integer)
			i_1_ = 0;
		else
			i_1_ = integer.intValue();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_1_;
	}
}
