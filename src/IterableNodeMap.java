
/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class IterableNodeMap implements Iterable {
	long aLong5557;
	Node[] aClass282Array5558;
	Node aClass282_5559;
	int anInt5560;
	Node aClass282_5561;
	int anInt5562 = 0;

	public Node method7745() {
		if (null == ((IterableNodeMap) this).aClass282_5561)
			return null;
		for (Node class282 = (((IterableNodeMap) this).aClass282Array5558[(int) (4504069746288158699L * ((IterableNodeMap) this).aLong5557 & (long) (((IterableNodeMap) this).anInt5560 * 25900449 - 1))]); class282 != ((IterableNodeMap) this).aClass282_5561; ((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next) {
			if ((((IterableNodeMap) this).aClass282_5561.data * -3442165056282524525L) == ((IterableNodeMap) this).aLong5557 * 4504069746288158699L) {
				Node class282_0_ = ((IterableNodeMap) this).aClass282_5561;
				((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next;
				return class282_0_;
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		return null;
	}

	public void method7746() {
		for (int i = 0; i < ((IterableNodeMap) this).anInt5560 * 25900449; i++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i];
			for (;;) {
				Node class282_1_ = class282.next;
				if (class282 == class282_1_)
					break;
				class282_1_.unlink(-371378792);
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		((IterableNodeMap) this).aClass282_5559 = null;
	}

	public Node method7747(int i) {
		if (null == ((IterableNodeMap) this).aClass282_5561)
			return null;
		for (Node class282 = (((IterableNodeMap) this).aClass282Array5558[(int) (4504069746288158699L * ((IterableNodeMap) this).aLong5557 & (long) (((IterableNodeMap) this).anInt5560 * 25900449 - 1))]); class282 != ((IterableNodeMap) this).aClass282_5561; ((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next) {
			if ((((IterableNodeMap) this).aClass282_5561.data * -3442165056282524525L) == ((IterableNodeMap) this).aLong5557 * 4504069746288158699L) {
				Node class282_2_ = ((IterableNodeMap) this).aClass282_5561;
				((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next;
				return class282_2_;
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		return null;
	}

	public int method7748(short i) {
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < 25900449 * ((IterableNodeMap) this).anInt5560; i_4_++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i_4_];
			for (Node class282_5_ = class282.next; class282 != class282_5_; class282_5_ = class282_5_.next)
				i_3_++;
		}
		return i_3_;
	}

	public Iterator iterator() {
		return new Class451(this);
	}

	public void method7749(int i) {
		for (int i_6_ = 0; i_6_ < ((IterableNodeMap) this).anInt5560 * 25900449; i_6_++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i_6_];
			for (;;) {
				Node class282_7_ = class282.next;
				if (class282 == class282_7_)
					break;
				class282_7_.unlink(-371378792);
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		((IterableNodeMap) this).aClass282_5559 = null;
	}

	public Node method7750(int i) {
		((IterableNodeMap) this).anInt5562 = 0;
		return method7751((byte) 63);
	}

	public Node method7751(byte i) {
		if (((IterableNodeMap) this).anInt5562 * 620631441 > 0 && ((((IterableNodeMap) this).aClass282Array5558[((IterableNodeMap) this).anInt5562 * 620631441 - 1]) != ((IterableNodeMap) this).aClass282_5559)) {
			Node class282 = ((IterableNodeMap) this).aClass282_5559;
			((IterableNodeMap) this).aClass282_5559 = class282.next;
			return class282;
		}
		while (((IterableNodeMap) this).anInt5562 * 620631441 < 25900449 * ((IterableNodeMap) this).anInt5560) {
			Node class282 = (((IterableNodeMap) this).aClass282Array5558[((((IterableNodeMap) this).anInt5562 += -745059471) * 620631441 - 1)].next);
			if ((((IterableNodeMap) this).aClass282Array5558[620631441 * ((IterableNodeMap) this).anInt5562 - 1]) != class282) {
				((IterableNodeMap) this).aClass282_5559 = class282.next;
				return class282;
			}
		}
		return null;
	}

	public Node method7752(long l) {
		((IterableNodeMap) this).aLong5557 = l * 7471503269310367939L;
		Node class282 = (((IterableNodeMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((IterableNodeMap) this).anInt5560 - 1))]);
		for (((IterableNodeMap) this).aClass282_5561 = class282.next; class282 != ((IterableNodeMap) this).aClass282_5561; ((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next) {
			if (l == (((IterableNodeMap) this).aClass282_5561.data * -3442165056282524525L)) {
				Node class282_8_ = ((IterableNodeMap) this).aClass282_5561;
				((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next;
				return class282_8_;
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		return null;
	}

	public Node method7753() {
		if (((IterableNodeMap) this).anInt5562 * 620631441 > 0 && ((((IterableNodeMap) this).aClass282Array5558[((IterableNodeMap) this).anInt5562 * 620631441 - 1]) != ((IterableNodeMap) this).aClass282_5559)) {
			Node class282 = ((IterableNodeMap) this).aClass282_5559;
			((IterableNodeMap) this).aClass282_5559 = class282.next;
			return class282;
		}
		while (((IterableNodeMap) this).anInt5562 * 620631441 < 25900449 * ((IterableNodeMap) this).anInt5560) {
			Node class282 = (((IterableNodeMap) this).aClass282Array5558[((((IterableNodeMap) this).anInt5562 += -745059471) * 620631441 - 1)].next);
			if ((((IterableNodeMap) this).aClass282Array5558[620631441 * ((IterableNodeMap) this).anInt5562 - 1]) != class282) {
				((IterableNodeMap) this).aClass282_5559 = class282.next;
				return class282;
			}
		}
		return null;
	}

	public Node method7754(long l) {
		((IterableNodeMap) this).aLong5557 = l * 7471503269310367939L;
		Node class282 = (((IterableNodeMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((IterableNodeMap) this).anInt5560 - 1))]);
		for (((IterableNodeMap) this).aClass282_5561 = class282.next; class282 != ((IterableNodeMap) this).aClass282_5561; ((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next) {
			if (l == (((IterableNodeMap) this).aClass282_5561.data * -3442165056282524525L)) {
				Node class282_9_ = ((IterableNodeMap) this).aClass282_5561;
				((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next;
				return class282_9_;
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		return null;
	}

	public void method7755() {
		for (int i = 0; i < ((IterableNodeMap) this).anInt5560 * 25900449; i++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i];
			for (;;) {
				Node class282_10_ = class282.next;
				if (class282 == class282_10_)
					break;
				class282_10_.unlink(-371378792);
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		((IterableNodeMap) this).aClass282_5559 = null;
	}

	public void method7756() {
		for (int i = 0; i < ((IterableNodeMap) this).anInt5560 * 25900449; i++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i];
			for (;;) {
				Node class282_11_ = class282.next;
				if (class282 == class282_11_)
					break;
				class282_11_.unlink(-371378792);
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		((IterableNodeMap) this).aClass282_5559 = null;
	}

	public Node method7757() {
		if (null == ((IterableNodeMap) this).aClass282_5561)
			return null;
		for (Node class282 = (((IterableNodeMap) this).aClass282Array5558[(int) (4504069746288158699L * ((IterableNodeMap) this).aLong5557 & (long) (((IterableNodeMap) this).anInt5560 * 25900449 - 1))]); class282 != ((IterableNodeMap) this).aClass282_5561; ((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next) {
			if ((((IterableNodeMap) this).aClass282_5561.data * -3442165056282524525L) == ((IterableNodeMap) this).aLong5557 * 4504069746288158699L) {
				Node class282_12_ = ((IterableNodeMap) this).aClass282_5561;
				((IterableNodeMap) this).aClass282_5561 = ((IterableNodeMap) this).aClass282_5561.next;
				return class282_12_;
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		return null;
	}

	public int method7758() {
		int i = 0;
		for (int i_13_ = 0; i_13_ < 25900449 * ((IterableNodeMap) this).anInt5560; i_13_++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i_13_];
			for (Node class282_14_ = class282.next; class282 != class282_14_; class282_14_ = class282_14_.next)
				i++;
		}
		return i;
	}

	public void method7759(Node class282, long l) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		Node class282_15_ = (((IterableNodeMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((IterableNodeMap) this).anInt5560 - 1))]);
		class282.prev = class282_15_.prev;
		class282.next = class282_15_;
		class282.prev.next = class282;
		class282.next.prev = class282;
		class282.data = -1253863389874800229L * l;
	}

	public void method7760(Node class282, long l) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		Node class282_16_ = (((IterableNodeMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((IterableNodeMap) this).anInt5560 - 1))]);
		class282.prev = class282_16_.prev;
		class282.next = class282_16_;
		class282.prev.next = class282;
		class282.next.prev = class282;
		class282.data = -1253863389874800229L * l;
	}

	public void method7761(Node class282, long l) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		Node class282_17_ = (((IterableNodeMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((IterableNodeMap) this).anInt5560 - 1))]);
		class282.prev = class282_17_.prev;
		class282.next = class282_17_;
		class282.prev.next = class282;
		class282.next.prev = class282;
		class282.data = -1253863389874800229L * l;
	}

	public Iterator method7762() {
		return new Class451(this);
	}

	public Iterator method7763() {
		return new Class451(this);
	}

	public void method7764() {
		for (int i = 0; i < ((IterableNodeMap) this).anInt5560 * 25900449; i++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i];
			for (;;) {
				Node class282_18_ = class282.next;
				if (class282 == class282_18_)
					break;
				class282_18_.unlink(-371378792);
			}
		}
		((IterableNodeMap) this).aClass282_5561 = null;
		((IterableNodeMap) this).aClass282_5559 = null;
	}

	public void method7765(Node class282, long l) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		Node class282_19_ = (((IterableNodeMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((IterableNodeMap) this).anInt5560 - 1))]);
		class282.prev = class282_19_.prev;
		class282.next = class282_19_;
		class282.prev.next = class282;
		class282.next.prev = class282;
		class282.data = -1253863389874800229L * l;
	}

	public Node method7766() {
		((IterableNodeMap) this).anInt5562 = 0;
		return method7751((byte) 101);
	}

	public Node method7767() {
		((IterableNodeMap) this).anInt5562 = 0;
		return method7751((byte) 6);
	}

	public Node method7768() {
		((IterableNodeMap) this).anInt5562 = 0;
		return method7751((byte) 110);
	}

	public Node method7769() {
		((IterableNodeMap) this).anInt5562 = 0;
		return method7751((byte) 14);
	}

	public IterableNodeMap(int i) {
		((IterableNodeMap) this).anInt5560 = i * 1246096993;
		((IterableNodeMap) this).aClass282Array5558 = new Node[i];
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			Node class282 = ((IterableNodeMap) this).aClass282Array5558[i_20_] = new Node();
			class282.next = class282;
			class282.prev = class282;
		}
	}

	public Node method7770() {
		if (((IterableNodeMap) this).anInt5562 * 620631441 > 0 && ((((IterableNodeMap) this).aClass282Array5558[((IterableNodeMap) this).anInt5562 * 620631441 - 1]) != ((IterableNodeMap) this).aClass282_5559)) {
			Node class282 = ((IterableNodeMap) this).aClass282_5559;
			((IterableNodeMap) this).aClass282_5559 = class282.next;
			return class282;
		}
		while (((IterableNodeMap) this).anInt5562 * 620631441 < 25900449 * ((IterableNodeMap) this).anInt5560) {
			Node class282 = (((IterableNodeMap) this).aClass282Array5558[((((IterableNodeMap) this).anInt5562 += -745059471) * 620631441 - 1)].next);
			if ((((IterableNodeMap) this).aClass282Array5558[620631441 * ((IterableNodeMap) this).anInt5562 - 1]) != class282) {
				((IterableNodeMap) this).aClass282_5559 = class282.next;
				return class282;
			}
		}
		return null;
	}

	static final void method7771(CS2Executor class527, int i) {
		String string;
		if (null != Class84.myPlayer && null != Class84.myPlayer.username)
			string = Class84.myPlayer.method16128(false, 1912893547);
		else
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method7772(Class282_Sub31 class282_sub31, boolean bool, int i) {
		if (((Class282_Sub31) class282_sub31).aBool7774) {
			if (-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765 < 0 || (Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(-1617066319), ((Class282_Sub31) class282_sub31).anInt7765 * -1369039751, -1307943861 * ((Class282_Sub31) class282_sub31).anInt7770, 1942118537))) {
				if (!bool)
					Class174.method2956((((Class282_Sub31) class282_sub31).anInt7764 * 1291499461), (((Class282_Sub31) class282_sub31).anInt7766 * -497894501), 37618455 * class282_sub31.anInt7762, class282_sub31.anInt7763 * -322610393, (((Class282_Sub31) class282_sub31).anInt7765 * -1369039751), (1421843241 * ((Class282_Sub31) class282_sub31).anInt7767), (-1307943861 * ((Class282_Sub31) class282_sub31).anInt7770), -1, -1133711870);
				else
					Class243.method4179((1291499461 * (((Class282_Sub31) class282_sub31).anInt7764)), (((Class282_Sub31) class282_sub31).anInt7766) * -497894501, class282_sub31.anInt7762 * 37618455, class282_sub31.anInt7763 * -322610393, null, (byte) 30);
				class282_sub31.unlink(-371378792);
			}
		} else if (((Class282_Sub31) class282_sub31).aBool7773 && 37618455 * class282_sub31.anInt7762 >= 1 && class282_sub31.anInt7763 * -322610393 >= 1 && (class282_sub31.anInt7762 * 37618455 <= IndexLoaders.MAP_REGION_DECODER.method4424(800318016) - 2) && (-322610393 * class282_sub31.anInt7763 <= IndexLoaders.MAP_REGION_DECODER.method4451(-349859539) - 2)
				&& ((-1809279077 * ((Class282_Sub31) class282_sub31).anInt7769) < 0 || (Class492.method8264(IndexLoaders.MAP_REGION_DECODER.method4436(-1528257548), (-1809279077 * ((Class282_Sub31) class282_sub31).anInt7769), (((Class282_Sub31) class282_sub31).anInt7771 * 965123467), 1942118537)))) {
			if (!bool)
				Class174.method2956(1291499461 * ((Class282_Sub31) class282_sub31).anInt7764, ((Class282_Sub31) class282_sub31).anInt7766 * -497894501, 37618455 * class282_sub31.anInt7762, class282_sub31.anInt7763 * -322610393, -1809279077 * ((Class282_Sub31) class282_sub31).anInt7769, ((Class282_Sub31) class282_sub31).anInt7772 * -818262241, 965123467 * ((Class282_Sub31) class282_sub31).anInt7771, -1, -1118636715);
			else
				Class243.method4179(1291499461 * ((Class282_Sub31) class282_sub31).anInt7764, ((Class282_Sub31) class282_sub31).anInt7766 * -497894501, class282_sub31.anInt7762 * 37618455, -322610393 * class282_sub31.anInt7763, ((Class282_Sub31) class282_sub31).aClass476_7768, (byte) 127);
			((Class282_Sub31) class282_sub31).aBool7773 = false;
			if (!bool && (-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765 == (((Class282_Sub31) class282_sub31).anInt7769 * -1809279077)) && (-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765 == -1))
				class282_sub31.unlink(-371378792);
			else if (!bool && ((-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765) == (((Class282_Sub31) class282_sub31).anInt7769 * -1809279077)) && ((1421843241 * ((Class282_Sub31) class282_sub31).anInt7767) == (-818262241 * ((Class282_Sub31) class282_sub31).anInt7772)) && ((((Class282_Sub31) class282_sub31).anInt7771 * 965123467) == (((Class282_Sub31) class282_sub31).anInt7770 * -1307943861)))
				class282_sub31.unlink(-371378792);
		}
	}

	static final void method7773(CS2Executor class527, int i) {
		Class282_Sub40.method13300(-1273704391);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -42);
		Class190.method3148((byte) 53);
		client.aBool7175 = false;
	}

	static final void method7774(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_21_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_22_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		Class515.method8862(i_21_, i_22_ >> 14 & 0x3fff, i_22_ & 0x3fff, true, -1732540658);
	}
}
