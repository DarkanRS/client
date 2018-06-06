/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class453 {
	int anInt5445;
	Node[] aClass282Array5446;
	long aLong5447;
	Node aClass282_5448;
	static int[] anIntArray5449;

	public Node method7529() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_0_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_0_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public Node method7530(long l) {
		((Class453) this).aLong5447 = -3885405380164673631L * l;
		Node class282 = (((Class453) this).aClass282Array5446[(int) (l & (long) (948624889 * ((Class453) this).anInt5445 - 1))]);
		for (((Class453) this).aClass282_5448 = class282.next; ((Class453) this).aClass282_5448 != class282; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if (l == (((Class453) this).aClass282_5448.data * -3442165056282524525L)) {
				Node class282_1_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_1_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public Node method7531() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_2_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_2_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public int method7532(Node[] class282s, byte i) {
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < ((Class453) this).anInt5445 * 948624889; i_4_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_4_];
			for (Node class282_5_ = class282.next; class282 != class282_5_; class282_5_ = class282_5_.next)
				class282s[i_3_++] = class282_5_;
		}
		return i_3_;
	}

	public Node method7533() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_6_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_6_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public void method7534(Node class282, long l) {
		if (null != class282.prev)
			class282.unlink(-371378792);
		Node class282_7_ = (((Class453) this).aClass282Array5446[(int) (l & (long) (948624889 * ((Class453) this).anInt5445 - 1))]);
		class282.prev = class282_7_.prev;
		class282.next = class282_7_;
		class282.prev.next = class282;
		class282.next.prev = class282;
		class282.data = l * -1253863389874800229L;
	}

	public Node method7535(long l) {
		((Class453) this).aLong5447 = -3885405380164673631L * l;
		Node class282 = (((Class453) this).aClass282Array5446[(int) (l & (long) (948624889 * ((Class453) this).anInt5445 - 1))]);
		for (((Class453) this).aClass282_5448 = class282.next; ((Class453) this).aClass282_5448 != class282; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if (l == (((Class453) this).aClass282_5448.data * -3442165056282524525L)) {
				Node class282_8_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_8_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public Node method7536(long l) {
		((Class453) this).aLong5447 = -3885405380164673631L * l;
		Node class282 = (((Class453) this).aClass282Array5446[(int) (l & (long) (948624889 * ((Class453) this).anInt5445 - 1))]);
		for (((Class453) this).aClass282_5448 = class282.next; ((Class453) this).aClass282_5448 != class282; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if (l == (((Class453) this).aClass282_5448.data * -3442165056282524525L)) {
				Node class282_9_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_9_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public Node method7537() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_10_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_10_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public Node method7538() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_11_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_11_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public Node method7539() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_12_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_12_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public int method7540(int i) {
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < ((Class453) this).anInt5445 * 948624889; i_14_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_14_];
			for (Node class282_15_ = class282.next; class282 != class282_15_; class282_15_ = class282_15_.next)
				i_13_++;
		}
		return i_13_;
	}

	public Class453(int i) {
		((Class453) this).anInt5445 = 1146704969 * i;
		((Class453) this).aClass282Array5446 = new Node[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_16_] = new Node();
			class282.next = class282;
			class282.prev = class282;
		}
	}

	public Node method7541() {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_17_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_17_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public int method7542(Node[] class282s) {
		int i = 0;
		for (int i_18_ = 0; i_18_ < ((Class453) this).anInt5445 * 948624889; i_18_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_18_];
			for (Node class282_19_ = class282.next; class282 != class282_19_; class282_19_ = class282_19_.next)
				class282s[i++] = class282_19_;
		}
		return i;
	}

	public int method7543(Node[] class282s) {
		int i = 0;
		for (int i_20_ = 0; i_20_ < ((Class453) this).anInt5445 * 948624889; i_20_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_20_];
			for (Node class282_21_ = class282.next; class282 != class282_21_; class282_21_ = class282_21_.next)
				class282s[i++] = class282_21_;
		}
		return i;
	}

	public Node method7544(int i) {
		if (null == ((Class453) this).aClass282_5448)
			return null;
		for (Node class282 = (((Class453) this).aClass282Array5446[(int) (((Class453) this).aLong5447 * -1090233634234760095L & (long) (948624889 * ((Class453) this).anInt5445 - 1))]); class282 != ((Class453) this).aClass282_5448; ((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next) {
			if ((((Class453) this).aClass282_5448.data * -3442165056282524525L) == ((Class453) this).aLong5447 * -1090233634234760095L) {
				Node class282_22_ = ((Class453) this).aClass282_5448;
				((Class453) this).aClass282_5448 = ((Class453) this).aClass282_5448.next;
				return class282_22_;
			}
		}
		((Class453) this).aClass282_5448 = null;
		return null;
	}

	public int method7545() {
		int i = 0;
		for (int i_23_ = 0; i_23_ < ((Class453) this).anInt5445 * 948624889; i_23_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_23_];
			for (Node class282_24_ = class282.next; class282 != class282_24_; class282_24_ = class282_24_.next)
				i++;
		}
		return i;
	}

	public int method7546() {
		int i = 0;
		for (int i_25_ = 0; i_25_ < ((Class453) this).anInt5445 * 948624889; i_25_++) {
			Node class282 = ((Class453) this).aClass282Array5446[i_25_];
			for (Node class282_26_ = class282.next; class282 != class282_26_; class282_26_ = class282_26_.next)
				i++;
		}
		return i;
	}

	static final void method7547(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class118.aString1348 = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
	}
}
