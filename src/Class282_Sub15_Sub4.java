public class Class282_Sub15_Sub4 extends Class282_Sub15 {

	NodeCollection aClass482_9824 = new NodeCollection();
	NodeCollection aClass482_9825 = new NodeCollection();
	int anInt9826 = 0;
	int anInt9827 = -1;

	void method15274(Node node_1, Class282_Sub22 class282_sub22_2) {
		while (this.aClass482_9825.tail != node_1 && ((Class282_Sub22) node_1).anInt7676 <= class282_sub22_2.anInt7676) {
			node_1 = node_1.next;
		}

		Class446.method7430(class282_sub22_2, node_1, -579151114);
		this.anInt9827 = ((Class282_Sub22) this.aClass482_9825.tail.next).anInt7676;
	}

	public final synchronized void method15275(Class282_Sub15 class282_sub15_1) {
		this.aClass482_9824.method8098(class282_sub15_1);
	}

	public final synchronized void method15276(Class282_Sub15 class282_sub15_1) {
		class282_sub15_1.remove();
	}

	void method15277() {
		if (this.anInt9826 > 0) {
			for (Class282_Sub22 class282_sub22_1 = (Class282_Sub22) this.aClass482_9825.head((byte) 96); class282_sub22_1 != null; class282_sub22_1 = (Class282_Sub22) this.aClass482_9825.next(1387776965)) {
				class282_sub22_1.anInt7676 -= this.anInt9826;
			}

			this.anInt9827 -= this.anInt9826;
			this.anInt9826 = 0;
		}

	}

	void method15279(Class282_Sub22 class282_sub22_1) {
		class282_sub22_1.remove();
		class282_sub22_1.method12355();
		Node node_2 = this.aClass482_9825.tail.next;
		if (node_2 == this.aClass482_9825.tail) {
			this.anInt9827 = -1;
		} else {
			this.anInt9827 = ((Class282_Sub22) node_2).anInt7676;
		}

	}

	void method15280(int i_1) {
		for (Class282_Sub15 class282_sub15_2 = (Class282_Sub15) this.aClass482_9824.head((byte) 41); class282_sub15_2 != null; class282_sub15_2 = (Class282_Sub15) this.aClass482_9824.next(2051746601)) {
			class282_sub15_2.method12231(i_1);
		}

	}

	int method12228() {
		return 0;
	}

	public final synchronized void method12230(int[] ints_1, int i_2, int i_3) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15282(ints_1, i_2, i_3);
			} else if (i_3 + this.anInt9826 < this.anInt9827) {
				this.anInt9826 += i_3;
				this.method15282(ints_1, i_2, i_3);
			} else {
				int i_4 = this.anInt9827 - this.anInt9826;
				this.method15282(ints_1, i_2, i_4);
				i_2 += i_4;
				i_3 -= i_4;
				this.anInt9826 += i_4;
				this.method15277();
				Class282_Sub22 class282_sub22_5 = (Class282_Sub22) this.aClass482_9825.head((byte) 60);
				synchronized (class282_sub22_5) {
					int i_7 = class282_sub22_5.method12354(this);
					if (i_7 < 0) {
						class282_sub22_5.anInt7676 = 0;
						this.method15279(class282_sub22_5);
					} else {
						class282_sub22_5.anInt7676 = i_7;
						this.method15274(class282_sub22_5.next, class282_sub22_5);
					}
				}

				if (i_3 != 0) {
					continue;
				}
			}

			return;
		}
	}

	void method15282(int[] ints_1, int i_2, int i_3) {
		for (Class282_Sub15 class282_sub15_4 = (Class282_Sub15) this.aClass482_9824.head((byte) 34); class282_sub15_4 != null; class282_sub15_4 = (Class282_Sub15) this.aClass482_9824.next(-554485695)) {
			class282_sub15_4.method12237(ints_1, i_2, i_3);
		}

	}

	public final synchronized void method12231(int i_1) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15280(i_1);
			} else if (this.anInt9826 + i_1 < this.anInt9827) {
				this.anInt9826 += i_1;
				this.method15280(i_1);
			} else {
				int i_2 = this.anInt9827 - this.anInt9826;
				this.method15280(i_2);
				i_1 -= i_2;
				this.anInt9826 += i_2;
				this.method15277();
				Class282_Sub22 class282_sub22_3 = (Class282_Sub22) this.aClass482_9825.head((byte) 72);
				synchronized (class282_sub22_3) {
					int i_5 = class282_sub22_3.method12354(this);
					if (i_5 < 0) {
						class282_sub22_3.anInt7676 = 0;
						this.method15279(class282_sub22_3);
					} else {
						class282_sub22_3.anInt7676 = i_5;
						this.method15274(class282_sub22_3.next, class282_sub22_3);
					}
				}

				if (i_1 != 0) {
					continue;
				}
			}

			return;
		}
	}

	int method12224() {
		return 0;
	}

	public final synchronized void method12240(int[] ints_1, int i_2, int i_3) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15282(ints_1, i_2, i_3);
			} else if (this.anInt9826 + i_3 < this.anInt9827) {
				this.anInt9826 += i_3;
				this.method15282(ints_1, i_2, i_3);
			} else {
				int i_4 = this.anInt9827 - this.anInt9826;
				this.method15282(ints_1, i_2, i_4);
				i_2 += i_4;
				i_3 -= i_4;
				this.anInt9826 += i_4;
				this.method15277();
				Class282_Sub22 class282_sub22_5 = (Class282_Sub22) this.aClass482_9825.head((byte) 17);
				synchronized (class282_sub22_5) {
					int i_7 = class282_sub22_5.method12354(this);
					if (i_7 < 0) {
						class282_sub22_5.anInt7676 = 0;
						this.method15279(class282_sub22_5);
					} else {
						class282_sub22_5.anInt7676 = i_7;
						this.method15274(class282_sub22_5.next, class282_sub22_5);
					}
				}

				if (i_3 != 0) {
					continue;
				}
			}

			return;
		}
	}

	public final synchronized void method12241(int[] ints_1, int i_2, int i_3) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15282(ints_1, i_2, i_3);
			} else if (this.anInt9826 + i_3 < this.anInt9827) {
				this.anInt9826 += i_3;
				this.method15282(ints_1, i_2, i_3);
			} else {
				int i_4 = this.anInt9827 - this.anInt9826;
				this.method15282(ints_1, i_2, i_4);
				i_2 += i_4;
				i_3 -= i_4;
				this.anInt9826 += i_4;
				this.method15277();
				Class282_Sub22 class282_sub22_5 = (Class282_Sub22) this.aClass482_9825.head((byte) 50);
				synchronized (class282_sub22_5) {
					int i_7 = class282_sub22_5.method12354(this);
					if (i_7 < 0) {
						class282_sub22_5.anInt7676 = 0;
						this.method15279(class282_sub22_5);
					} else {
						class282_sub22_5.anInt7676 = i_7;
						this.method15274(class282_sub22_5.next, class282_sub22_5);
					}
				}

				if (i_3 != 0) {
					continue;
				}
			}

			return;
		}
	}

	Class282_Sub15 method12229() {
		return (Class282_Sub15) this.aClass482_9824.next(982164521);
	}

	Class282_Sub15 method12235() {
		return (Class282_Sub15) this.aClass482_9824.next(472610757);
	}

	Class282_Sub15 method12236() {
		return (Class282_Sub15) this.aClass482_9824.next(1730970362);
	}

	Class282_Sub15 method12232() {
		return (Class282_Sub15) this.aClass482_9824.head((byte) 126);
	}

	Class282_Sub15 method12239() {
		return (Class282_Sub15) this.aClass482_9824.next(-1222482007);
	}

	int method12238() {
		return 0;
	}

	int method12244() {
		return 0;
	}

	int method12227() {
		return 0;
	}

	Class282_Sub15 method12233() {
		return (Class282_Sub15) this.aClass482_9824.head((byte) 42);
	}

	public final synchronized void method12243(int i_1) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15280(i_1);
			} else if (this.anInt9826 + i_1 < this.anInt9827) {
				this.anInt9826 += i_1;
				this.method15280(i_1);
			} else {
				int i_2 = this.anInt9827 - this.anInt9826;
				this.method15280(i_2);
				i_1 -= i_2;
				this.anInt9826 += i_2;
				this.method15277();
				Class282_Sub22 class282_sub22_3 = (Class282_Sub22) this.aClass482_9825.head((byte) 12);
				synchronized (class282_sub22_3) {
					int i_5 = class282_sub22_3.method12354(this);
					if (i_5 < 0) {
						class282_sub22_3.anInt7676 = 0;
						this.method15279(class282_sub22_3);
					} else {
						class282_sub22_3.anInt7676 = i_5;
						this.method15274(class282_sub22_3.next, class282_sub22_3);
					}
				}

				if (i_1 != 0) {
					continue;
				}
			}

			return;
		}
	}

	public final synchronized void method12234(int i_1) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15280(i_1);
			} else if (this.anInt9826 + i_1 < this.anInt9827) {
				this.anInt9826 += i_1;
				this.method15280(i_1);
			} else {
				int i_2 = this.anInt9827 - this.anInt9826;
				this.method15280(i_2);
				i_1 -= i_2;
				this.anInt9826 += i_2;
				this.method15277();
				Class282_Sub22 class282_sub22_3 = (Class282_Sub22) this.aClass482_9825.head((byte) 67);
				synchronized (class282_sub22_3) {
					int i_5 = class282_sub22_3.method12354(this);
					if (i_5 < 0) {
						class282_sub22_3.anInt7676 = 0;
						this.method15279(class282_sub22_3);
					} else {
						class282_sub22_3.anInt7676 = i_5;
						this.method15274(class282_sub22_3.next, class282_sub22_3);
					}
				}

				if (i_1 != 0) {
					continue;
				}
			}

			return;
		}
	}

	Class282_Sub15 method12226() {
		return (Class282_Sub15) this.aClass482_9824.head((byte) 10);
	}

	public final synchronized void method12242(int[] ints_1, int i_2, int i_3) {
		while (true) {
			if (this.anInt9827 < 0) {
				this.method15282(ints_1, i_2, i_3);
			} else if (this.anInt9826 + i_3 < this.anInt9827) {
				this.anInt9826 += i_3;
				this.method15282(ints_1, i_2, i_3);
			} else {
				int i_4 = this.anInt9827 - this.anInt9826;
				this.method15282(ints_1, i_2, i_4);
				i_2 += i_4;
				i_3 -= i_4;
				this.anInt9826 += i_4;
				this.method15277();
				Class282_Sub22 class282_sub22_5 = (Class282_Sub22) this.aClass482_9825.head((byte) 67);
				synchronized (class282_sub22_5) {
					int i_7 = class282_sub22_5.method12354(this);
					if (i_7 < 0) {
						class282_sub22_5.anInt7676 = 0;
						this.method15279(class282_sub22_5);
					} else {
						class282_sub22_5.anInt7676 = i_7;
						this.method15274(class282_sub22_5.next, class282_sub22_5);
					}
				}

				if (i_3 != 0) {
					continue;
				}
			}

			return;
		}
	}

}
