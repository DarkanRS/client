/* Class282_Sub15_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub15_Sub4 extends Class282_Sub15 {
	NodeCollection aClass482_9824 = new NodeCollection();
	NodeCollection aClass482_9825 = new NodeCollection();
	int anInt9826 = 0;
	int anInt9827 = -1;

	void method15274(Node class282, Class282_Sub22 class282_sub22) {
		for (/**/; ((class282 != ((Class282_Sub15_Sub4) this).aClass482_9825.head) && (((Class282_Sub22) (Class282_Sub22) class282).anInt7676 <= ((Class282_Sub22) class282_sub22).anInt7676)); class282 = class282.next) {
			/* empty */
		}
		Class446.method7430(class282_sub22, class282, -579151114);
		((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) (((Class282_Sub15_Sub4) this).aClass482_9825.head.next)).anInt7676;
	}

	public final synchronized void method15275(Class282_Sub15 class282_sub15) {
		((Class282_Sub15_Sub4) this).aClass482_9824.method8098(class282_sub15, (byte) 34);
	}

	public final synchronized void method15276(Class282_Sub15 class282_sub15) {
		class282_sub15.unlink(-371378792);
	}

	void method15277() {
		if (((Class282_Sub15_Sub4) this).anInt9826 > 0) {
			for (Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 96); class282_sub22 != null; class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.next(1387776965))
				((Class282_Sub22) class282_sub22).anInt7676 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9827 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9826 = 0;
		}
	}

	public final synchronized void method15278(Class282_Sub15 class282_sub15) {
		((Class282_Sub15_Sub4) this).aClass482_9824.method8098(class282_sub15, (byte) 61);
	}

	void method15279(Class282_Sub22 class282_sub22) {
		class282_sub22.unlink(-371378792);
		class282_sub22.method12355();
		Node class282 = (((Class282_Sub15_Sub4) this).aClass482_9825.head.next);
		if (class282 == ((Class282_Sub15_Sub4) this).aClass482_9825.head)
			((Class282_Sub15_Sub4) this).anInt9827 = -1;
		else
			((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) class282).anInt7676;
	}

	void method15280(int i) {
		for (Class282_Sub15 class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 41); class282_sub15 != null; class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(2051746601))
			class282_sub15.method12231(i);
	}

	void method15281() {
		if (((Class282_Sub15_Sub4) this).anInt9826 > 0) {
			for (Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 82); class282_sub22 != null; class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.next(-55813765))
				((Class282_Sub22) class282_sub22).anInt7676 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9827 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9826 = 0;
		}
	}

	int method12228() {
		return 0;
	}

	public final synchronized void method12230(int[] is, int i, int i_0_) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15282(is, i, i_0_);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i_0_ < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i_0_;
				method15282(is, i, i_0_);
				break;
			}
			int i_1_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15282(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_1_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 60);
			synchronized (class282_sub22) {
				int i_2_ = class282_sub22.method12354(this);
				if (i_2_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_2_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i_0_ != 0);
	}

	void method15282(int[] is, int i, int i_3_) {
		for (Class282_Sub15 class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 34); class282_sub15 != null; class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(-554485695))
			class282_sub15.method12237(is, i, i_3_);
	}

	public final synchronized void method12231(int i) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15280(i);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i;
				method15280(i);
				break;
			}
			int i_4_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15280(i_4_);
			i -= i_4_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_4_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 72);
			synchronized (class282_sub22) {
				int i_5_ = class282_sub22.method12354(this);
				if (i_5_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_5_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i != 0);
	}

	int method12224() {
		return 0;
	}

	public final synchronized void method12240(int[] is, int i, int i_6_) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15282(is, i, i_6_);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i_6_ < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i_6_;
				method15282(is, i, i_6_);
				break;
			}
			int i_7_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15282(is, i, i_7_);
			i += i_7_;
			i_6_ -= i_7_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_7_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 17);
			synchronized (class282_sub22) {
				int i_8_ = class282_sub22.method12354(this);
				if (i_8_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_8_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i_6_ != 0);
	}

	public final synchronized void method12241(int[] is, int i, int i_9_) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15282(is, i, i_9_);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i_9_ < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i_9_;
				method15282(is, i, i_9_);
				break;
			}
			int i_10_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15282(is, i, i_10_);
			i += i_10_;
			i_9_ -= i_10_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_10_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 50);
			synchronized (class282_sub22) {
				int i_11_ = class282_sub22.method12354(this);
				if (i_11_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_11_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i_9_ != 0);
	}

	Class282_Sub15 method12229() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(982164521);
	}

	Class282_Sub15 method12235() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(472610757);
	}

	Class282_Sub15 method12236() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(1730970362);
	}

	Class282_Sub15 method12232() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 126);
	}

	Class282_Sub15 method12239() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(-1222482007);
	}

	int method12238() {
		return 0;
	}

	int method12244() {
		return 0;
	}

	public final synchronized void method15283(Class282_Sub15 class282_sub15) {
		class282_sub15.unlink(-371378792);
	}

	int method12227() {
		return 0;
	}

	Class282_Sub15 method12233() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 42);
	}

	public final synchronized void method12243(int i) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15280(i);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i;
				method15280(i);
				break;
			}
			int i_12_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15280(i_12_);
			i -= i_12_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_12_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 12);
			synchronized (class282_sub22) {
				int i_13_ = class282_sub22.method12354(this);
				if (i_13_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_13_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i != 0);
	}

	public final synchronized void method12234(int i) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15280(i);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i;
				method15280(i);
				break;
			}
			int i_14_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15280(i_14_);
			i -= i_14_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_14_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 67);
			synchronized (class282_sub22) {
				int i_15_ = class282_sub22.method12354(this);
				if (i_15_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_15_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i != 0);
	}

	Class282_Sub15 method12226() {
		return (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 10);
	}

	public final synchronized void method15284(Class282_Sub15 class282_sub15) {
		((Class282_Sub15_Sub4) this).aClass482_9824.method8098(class282_sub15, (byte) 67);
	}

	public final synchronized void method15285(Class282_Sub15 class282_sub15) {
		((Class282_Sub15_Sub4) this).aClass482_9824.method8098(class282_sub15, (byte) 64);
	}

	public final synchronized void method15286(Class282_Sub15 class282_sub15) {
		class282_sub15.unlink(-371378792);
	}

	void method15287(int[] is, int i, int i_16_) {
		for (Class282_Sub15 class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 104); class282_sub15 != null; class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(-1028177962))
			class282_sub15.method12237(is, i, i_16_);
	}

	void method15288() {
		if (((Class282_Sub15_Sub4) this).anInt9826 > 0) {
			for (Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 76); class282_sub22 != null; class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.next(-731250462))
				((Class282_Sub22) class282_sub22).anInt7676 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9827 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9826 = 0;
		}
	}

	public final synchronized void method12242(int[] is, int i, int i_17_) {
		do {
			if (((Class282_Sub15_Sub4) this).anInt9827 < 0) {
				method15282(is, i, i_17_);
				break;
			}
			if (((Class282_Sub15_Sub4) this).anInt9826 + i_17_ < ((Class282_Sub15_Sub4) this).anInt9827) {
				((Class282_Sub15_Sub4) this).anInt9826 += i_17_;
				method15282(is, i, i_17_);
				break;
			}
			int i_18_ = (((Class282_Sub15_Sub4) this).anInt9827 - ((Class282_Sub15_Sub4) this).anInt9826);
			method15282(is, i, i_18_);
			i += i_18_;
			i_17_ -= i_18_;
			((Class282_Sub15_Sub4) this).anInt9826 += i_18_;
			method15277();
			Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 67);
			synchronized (class282_sub22) {
				int i_19_ = class282_sub22.method12354(this);
				if (i_19_ < 0) {
					((Class282_Sub22) class282_sub22).anInt7676 = 0;
					method15279(class282_sub22);
				} else {
					((Class282_Sub22) class282_sub22).anInt7676 = i_19_;
					method15274(class282_sub22.next, class282_sub22);
				}
			}
		} while (i_17_ != 0);
	}

	void method15289() {
		if (((Class282_Sub15_Sub4) this).anInt9826 > 0) {
			for (Class282_Sub22 class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.head((byte) 120); class282_sub22 != null; class282_sub22 = (Class282_Sub22) ((Class282_Sub15_Sub4) this).aClass482_9825.next(1270907971))
				((Class282_Sub22) class282_sub22).anInt7676 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9827 -= ((Class282_Sub15_Sub4) this).anInt9826;
			((Class282_Sub15_Sub4) this).anInt9826 = 0;
		}
	}

	public final synchronized void method15290(Class282_Sub15 class282_sub15) {
		class282_sub15.unlink(-371378792);
	}

	void method15291(Node class282, Class282_Sub22 class282_sub22) {
		for (/**/; ((class282 != ((Class282_Sub15_Sub4) this).aClass482_9825.head) && (((Class282_Sub22) (Class282_Sub22) class282).anInt7676 <= ((Class282_Sub22) class282_sub22).anInt7676)); class282 = class282.next) {
			/* empty */
		}
		Class446.method7430(class282_sub22, class282, 523352194);
		((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) (((Class282_Sub15_Sub4) this).aClass482_9825.head.next)).anInt7676;
	}

	void method15292(Node class282, Class282_Sub22 class282_sub22) {
		for (/**/; ((class282 != ((Class282_Sub15_Sub4) this).aClass482_9825.head) && (((Class282_Sub22) (Class282_Sub22) class282).anInt7676 <= ((Class282_Sub22) class282_sub22).anInt7676)); class282 = class282.next) {
			/* empty */
		}
		Class446.method7430(class282_sub22, class282, 8883937);
		((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) (((Class282_Sub15_Sub4) this).aClass482_9825.head.next)).anInt7676;
	}

	void method15293(Node class282, Class282_Sub22 class282_sub22) {
		for (/**/; ((class282 != ((Class282_Sub15_Sub4) this).aClass482_9825.head) && (((Class282_Sub22) (Class282_Sub22) class282).anInt7676 <= ((Class282_Sub22) class282_sub22).anInt7676)); class282 = class282.next) {
			/* empty */
		}
		Class446.method7430(class282_sub22, class282, -43715914);
		((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) (((Class282_Sub15_Sub4) this).aClass482_9825.head.next)).anInt7676;
	}

	void method15294(Node class282, Class282_Sub22 class282_sub22) {
		for (/**/; ((class282 != ((Class282_Sub15_Sub4) this).aClass482_9825.head) && (((Class282_Sub22) (Class282_Sub22) class282).anInt7676 <= ((Class282_Sub22) class282_sub22).anInt7676)); class282 = class282.next) {
			/* empty */
		}
		Class446.method7430(class282_sub22, class282, -1791235591);
		((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) (((Class282_Sub15_Sub4) this).aClass482_9825.head.next)).anInt7676;
	}

	void method15295(Node class282, Class282_Sub22 class282_sub22) {
		for (/**/; ((class282 != ((Class282_Sub15_Sub4) this).aClass482_9825.head) && (((Class282_Sub22) (Class282_Sub22) class282).anInt7676 <= ((Class282_Sub22) class282_sub22).anInt7676)); class282 = class282.next) {
			/* empty */
		}
		Class446.method7430(class282_sub22, class282, -28745580);
		((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) (((Class282_Sub15_Sub4) this).aClass482_9825.head.next)).anInt7676;
	}

	void method15296(int i) {
		for (Class282_Sub15 class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 105); class282_sub15 != null; class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(1489714615))
			class282_sub15.method12231(i);
	}

	void method15297(int[] is, int i, int i_20_) {
		for (Class282_Sub15 class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 116); class282_sub15 != null; class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(729258615))
			class282_sub15.method12237(is, i, i_20_);
	}

	void method15298(int i) {
		for (Class282_Sub15 class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.head((byte) 100); class282_sub15 != null; class282_sub15 = (Class282_Sub15) ((Class282_Sub15_Sub4) this).aClass482_9824.next(-577002482))
			class282_sub15.method12231(i);
	}

	void method15299(Class282_Sub22 class282_sub22) {
		class282_sub22.unlink(-371378792);
		class282_sub22.method12355();
		Node class282 = (((Class282_Sub15_Sub4) this).aClass482_9825.head.next);
		if (class282 == ((Class282_Sub15_Sub4) this).aClass482_9825.head)
			((Class282_Sub15_Sub4) this).anInt9827 = -1;
		else
			((Class282_Sub15_Sub4) this).anInt9827 = ((Class282_Sub22) (Class282_Sub22) class282).anInt7676;
	}
}
