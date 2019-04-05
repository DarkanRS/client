import java.util.Iterator;

public final class IterableNodeMap implements Iterable {

	Node aClass282_5561;

	Node aClass282_5559;

	int anInt5562 = 0;

	long aLong5557;

	int anInt5560;

	Node[] aClass282Array5558;

	public Node method7747(int i_1) {
		if (this.aClass282_5561 == null) {
			return null;
		} else {
			for (Node node_2 = this.aClass282Array5558[(int) (this.aLong5557 & (long) (this.anInt5560 - 1))]; node_2 != this.aClass282_5561; this.aClass282_5561 = this.aClass282_5561.next) {
				if (this.aClass282_5561.data == this.aLong5557) {
					Node node_3 = this.aClass282_5561;
					this.aClass282_5561 = this.aClass282_5561.next;
					return node_3;
				}
			}
			this.aClass282_5561 = null;
			return null;
		}
	}

	public int method7748(short s_1) {
		int i_2 = 0;
		for (int i_3 = 0; i_3 < this.anInt5560; i_3++) {
			Node node_4 = this.aClass282Array5558[i_3];
			for (Node node_5 = node_4.next; node_4 != node_5; node_5 = node_5.next) {
				++i_2;
			}
		}
		return i_2;
	}

	public Iterator iterator() {
		return new HashTableIterator(this);
	}

	public void method7749(int i_1) {
		for (int i_2 = 0; i_2 < this.anInt5560; i_2++) {
			Node node_3 = this.aClass282Array5558[i_2];
			while (true) {
				Node node_4 = node_3.next;
				if (node_3 == node_4) {
					break;
				}
				node_4.remove();
			}
		}
		this.aClass282_5561 = null;
		this.aClass282_5559 = null;
	}

	public Node method7750(int i_1) {
		this.anInt5562 = 0;
		return this.method7751((byte) 63);
	}

	public Node method7751(byte b_1) {
		Node node_2;
		if (this.anInt5562 > 0 && this.aClass282Array5558[this.anInt5562 - 1] != this.aClass282_5559) {
			node_2 = this.aClass282_5559;
			this.aClass282_5559 = node_2.next;
			return node_2;
		} else {
			while (this.anInt5562 < this.anInt5560) {
				node_2 = this.aClass282Array5558[++this.anInt5562 - 1].next;
				if (node_2 != this.aClass282Array5558[this.anInt5562 - 1]) {
					this.aClass282_5559 = node_2.next;
					return node_2;
				}
			}
			return null;
		}
	}

	public Node get(long long_1) {
		this.aLong5557 = long_1;
		Node node_3 = this.aClass282Array5558[(int) (long_1 & (long) (this.anInt5560 - 1))];
		for (this.aClass282_5561 = node_3.next; node_3 != this.aClass282_5561; this.aClass282_5561 = this.aClass282_5561.next) {
			if (long_1 == this.aClass282_5561.data) {
				Node node_4 = this.aClass282_5561;
				this.aClass282_5561 = this.aClass282_5561.next;
				return node_4;
			}
		}
		this.aClass282_5561 = null;
		return null;
	}

	public void put(Node node_1, long long_2) {
		if (node_1.prev != null) {
			node_1.remove();
		}
		Node node_4 = this.aClass282Array5558[(int) (long_2 & (long) (this.anInt5560 - 1))];
		node_1.prev = node_4.prev;
		node_1.next = node_4;
		node_1.prev.next = node_1;
		node_1.next.prev = node_1;
		node_1.data = long_2;
	}

	public IterableNodeMap(int i_1) {
		this.anInt5560 = i_1;
		this.aClass282Array5558 = new Node[i_1];
		for (int i_2 = 0; i_2 < i_1; i_2++) {
			Node node_3 = this.aClass282Array5558[i_2] = new Node();
			node_3.next = node_3;
			node_3.prev = node_3;
		}
	}

	static final void method7772(Class282_Sub31 class282_sub31_0, boolean bool_1) {
		if (class282_sub31_0.aBool7774) {
			if (class282_sub31_0.anInt7765 < 0 || Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(-1617066319), class282_sub31_0.anInt7765, class282_sub31_0.anInt7770)) {
				if (!bool_1) {
					Class174.animateObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.anInt7765, class282_sub31_0.anInt7767, class282_sub31_0.anInt7770, -1, -1133711870);
				} else {
					QuickChatValueType.method4179(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, (Class476) null, (byte) 30);
				}
				class282_sub31_0.remove();
			}
		} else if (class282_sub31_0.aBool7773 && class282_sub31_0.anInt7762 >= 1 && class282_sub31_0.anInt7763 >= 1 && class282_sub31_0.anInt7762 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && class282_sub31_0.anInt7763 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2 && (class282_sub31_0.anInt7769 < 0 || Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(-1528257548), class282_sub31_0.anInt7769, class282_sub31_0.anInt7771))) {
			if (!bool_1) {
				Class174.animateObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.anInt7769, class282_sub31_0.anInt7772, class282_sub31_0.anInt7771, -1, -1118636715);
			} else {
				QuickChatValueType.method4179(class282_sub31_0.anInt7764, class282_sub31_0.anInt7766, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, class282_sub31_0.aClass476_7768, (byte) 127);
			}
			class282_sub31_0.aBool7773 = false;
			if (!bool_1 && class282_sub31_0.anInt7765 == class282_sub31_0.anInt7769 && class282_sub31_0.anInt7765 == -1) {
				class282_sub31_0.remove();
			} else if (!bool_1 && class282_sub31_0.anInt7765 == class282_sub31_0.anInt7769 && class282_sub31_0.anInt7767 == class282_sub31_0.anInt7772 && class282_sub31_0.anInt7771 == class282_sub31_0.anInt7770) {
				class282_sub31_0.remove();
			}
		}
	}
}
