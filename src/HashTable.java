public final class HashTable {

	static int[] anIntArray5449;
	long aLong5447;
	Node aClass282_5448;
	int anInt5445;
	Node[] aClass282Array5446;

	public Node method7530(long long_1) {
		this.aLong5447 = long_1;
		Node node_3 = this.aClass282Array5446[(int) (long_1 & (long) (this.anInt5445 - 1))];

		for (this.aClass282_5448 = node_3.next; node_3 != this.aClass282_5448; this.aClass282_5448 = this.aClass282_5448.next) {
			if (long_1 == this.aClass282_5448.data) {
				Node node_4 = this.aClass282_5448;
				this.aClass282_5448 = this.aClass282_5448.next;
				return node_4;
			}
		}

		this.aClass282_5448 = null;
		return null;
	}

	public int method7532(Node[] arr_1, byte b_2) {
		int i_3 = 0;

		for (int i_4 = 0; i_4 < this.anInt5445; i_4++) {
			Node node_5 = this.aClass282Array5446[i_4];

			for (Node node_6 = node_5.next; node_5 != node_6; node_6 = node_6.next) {
				arr_1[i_3++] = node_6;
			}
		}

		return i_3;
	}

	public void method7534(Node node_1, long long_2) {
		if (node_1.prev != null) {
			node_1.remove();
		}

		Node node_4 = this.aClass282Array5446[(int) (long_2 & (long) (this.anInt5445 - 1))];
		node_1.prev = node_4.prev;
		node_1.next = node_4;
		node_1.prev.next = node_1;
		node_1.next.prev = node_1;
		node_1.data = long_2;
	}

	public int method7540(int i_1) {
		int i_2 = 0;

		for (int i_3 = 0; i_3 < this.anInt5445; i_3++) {
			Node node_4 = this.aClass282Array5446[i_3];

			for (Node node_5 = node_4.next; node_4 != node_5; node_5 = node_5.next) {
				++i_2;
			}
		}

		return i_2;
	}

	public HashTable(int i_1) {
		this.anInt5445 = i_1;
		this.aClass282Array5446 = new Node[i_1];

		for (int i_2 = 0; i_2 < i_1; i_2++) {
			Node node_3 = this.aClass282Array5446[i_2] = new Node();
			node_3.next = node_3;
			node_3.prev = node_3;
		}

	}

	public Node method7544(int i_1) {
		if (this.aClass282_5448 == null) {
			return null;
		} else {
			for (Node node_2 = this.aClass282Array5446[(int) (this.aLong5447 & (long) (this.anInt5445 - 1))]; node_2 != this.aClass282_5448; this.aClass282_5448 = this.aClass282_5448.next) {
				if (this.aClass282_5448.data == this.aLong5447) {
					Node node_3 = this.aClass282_5448;
					this.aClass282_5448 = this.aClass282_5448.next;
					return node_3;
				}
			}

			this.aClass282_5448 = null;
			return null;
		}
	}

	static final void method7547(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aString1348 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
	}

}
