
/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class NodeIterator implements Iterator<Object> {
	NodeCollection collection;
	Node aClass282_5536;
	Node aClass282_5537 = null;

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
			((NodeIterator) this).aClass282_5536 = class282.prev;
		((NodeIterator) this).aClass282_5537 = class282;
		return class282;
	}

	public boolean hasNext() {
		return (((NodeIterator) this).collection.head != ((NodeIterator) this).aClass282_5536);
	}

	public void method7684(NodeCollection class482, byte i) {
		((NodeIterator) this).collection = class482;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.prev;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public NodeIterator(NodeCollection collection) {
		((NodeIterator) this).collection = collection;
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.prev;
		((NodeIterator) this).aClass282_5537 = null;
	}

	public void remove() {
		if (((NodeIterator) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((NodeIterator) this).aClass282_5537.remove();
		((NodeIterator) this).aClass282_5537 = null;
	}

	void method7697(short i) {
		((NodeIterator) this).aClass282_5536 = ((NodeIterator) this).collection.head.prev;
		((NodeIterator) this).aClass282_5537 = null;
	}

	static final void method7699(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.aBool7151 ? 1 : 0;
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
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_1_;
	}
}
