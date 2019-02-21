
/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class539 {
	boolean aBool7119;
	Class275_Sub1_Sub1_Sub1[] aClass275_Sub1_Sub1_Sub1Array7120;
	int anInt7121;
	int anInt7122;
	long aLong7123;
	long aLong7124;
	int anInt7125;
	int anInt7126;
	List aList7127;
	boolean aBool7128;
	List aList7129;
	boolean aBool7130;
	Class151 aClass151_7131;
	public boolean aBool7132 = false;
	static boolean[] aBoolArray7133 = new boolean[32];
	static boolean[] aBoolArray7134 = new boolean[8];

	public void method11502() {
		((Class539) this).aBool7119 = true;
	}

	public static Class539 method11503(int i, boolean bool) {
		if (Class235.anInt2901 * 1765973211 != Class235.anInt2899 * -224341485) {
			Class539 class539 = Class477.aClass539Array5632[Class235.anInt2899 * -224341485];
			Class235.anInt2899 = ((Class235.anInt2899 * -224341485 + 1 & Class89.anIntArray931[Class235.anInt2906 * -391332475]) * 1556727835);
			class539.method11504(i, bool);
			return class539;
		}
		return new Class539(i, bool);
	}

	void method11504(int i, boolean bool) {
		Class235.aList2896.add(this);
		((Class539) this).aLong7124 = (long) i;
		((Class539) this).aLong7123 = (long) i;
		((Class539) this).aBool7119 = true;
		((Class539) this).aBool7130 = bool;
	}

	public void method11505() {
		((Class539) this).aBool7119 = true;
	}

	void method11506() {
		aBool7132 = true;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if ((((Class282_Sub40) class282_sub40).aClass345_8007.anInt4041 * -39568147) == 1)
				class282_sub40.remove();
		}
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null) {
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] = null;
			}
		}
		((Class539) this).anInt7125 = 0;
		((Class539) this).aList7129 = new LinkedList();
		((Class539) this).anInt7126 = 0;
		((Class539) this).aList7127 = new LinkedList();
		((Class539) this).anInt7121 = 0;
	}

	public void method11507(GraphicalRenderer class505, long l, Class87[] class87s, Class172[] class172s, boolean bool) {
		if (!aBool7132) {
			method11541(class505, class87s, bool);
			method11513(class172s, bool);
			((Class539) this).aLong7124 = l;
		}
	}

	void method11508() {
		((Class539) this).aBool7128 = false;
	}

	boolean method11509(GraphicalRenderer class505, long l) {
		if (((Class539) this).aLong7124 != ((Class539) this).aLong7123)
			method11527();
		else
			method11508();
		if (l - ((Class539) this).aLong7124 > 750L) {
			method11506();
			return false;
		}
		int i = (int) (l - ((Class539) this).aLong7123);
		if (((Class539) this).aBool7119) {
			Iterator iterator = ((Class539) this).aList7129.iterator();
			while (iterator.hasNext()) {
				Class538 class538 = (Class538) iterator.next();
				for (int i_0_ = 0; i_0_ < (((Class538) class538).aClass59_7101.anInt557 * 94809495); i_0_++)
					class538.method11493(class505, l, 1, !((Class539) this).aBool7128, 1874029066);
			}
			((Class539) this).aBool7119 = false;
		}
		Iterator iterator = ((Class539) this).aList7129.iterator();
		while (iterator.hasNext()) {
			Class538 class538 = (Class538) iterator.next();
			class538.method11493(class505, l, i, !((Class539) this).aBool7128, 1118195717);
		}
		((Class539) this).aLong7123 = l;
		return true;
	}

	public Class151 method11510() {
		return ((Class539) this).aClass151_7131;
	}

	public void method11511(GraphicalRenderer class505, long l, Class87[] class87s, Class172[] class172s, boolean bool) {
		if (!aBool7132) {
			method11541(class505, class87s, bool);
			method11513(class172s, bool);
			((Class539) this).aLong7124 = l;
		}
	}

	public void method11512(long l) {
		((Class539) this).aLong7124 = l;
	}

	void method11513(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_219_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) -28);
						continue while_219_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(1211562351)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-1744283986).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	public void method11514(long l) {
		((Class539) this).aLong7124 = l;
	}

	public void method11515(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class539) this).anInt7122 = i;
	}

	void method11516(SceneObjectManager class206, GraphicalRenderer class505) {
		((Class539) this).aClass151_7131.aClass464_1961.method7740(493536965);
		Iterator iterator = ((Class539) this).aList7129.iterator();
		while (iterator.hasNext()) {
			Class538 class538 = (Class538) iterator.next();
			class538.method11496(class206, class505, ((Class539) this).aLong7123);
		}
	}

	public Class151 method11517() {
		return ((Class539) this).aClass151_7131;
	}

	void method11518(int i, boolean bool) {
		Class235.aList2896.add(this);
		((Class539) this).aLong7124 = (long) i;
		((Class539) this).aLong7123 = (long) i;
		((Class539) this).aBool7119 = true;
		((Class539) this).aBool7130 = bool;
	}

	public static Class539 method11519(int i, boolean bool) {
		if (Class235.anInt2901 * 1765973211 != Class235.anInt2899 * -224341485) {
			Class539 class539 = Class477.aClass539Array5632[Class235.anInt2899 * -224341485];
			Class235.anInt2899 = ((Class235.anInt2899 * -224341485 + 1 & Class89.anIntArray931[Class235.anInt2906 * -391332475]) * 1556727835);
			class539.method11504(i, bool);
			return class539;
		}
		return new Class539(i, bool);
	}

	public static Class539 method11520(int i, boolean bool) {
		if (Class235.anInt2901 * 1765973211 != Class235.anInt2899 * -224341485) {
			Class539 class539 = Class477.aClass539Array5632[Class235.anInt2899 * -224341485];
			Class235.anInt2899 = ((Class235.anInt2899 * -224341485 + 1 & Class89.anIntArray931[Class235.anInt2906 * -391332475]) * 1556727835);
			class539.method11504(i, bool);
			return class539;
		}
		return new Class539(i, bool);
	}

	public static Class539 method11521(int i, boolean bool) {
		if (Class235.anInt2901 * 1765973211 != Class235.anInt2899 * -224341485) {
			Class539 class539 = Class477.aClass539Array5632[Class235.anInt2899 * -224341485];
			Class235.anInt2899 = ((Class235.anInt2899 * -224341485 + 1 & Class89.anIntArray931[Class235.anInt2906 * -391332475]) * 1556727835);
			class539.method11504(i, bool);
			return class539;
		}
		return new Class539(i, bool);
	}

	void method11522(int i, boolean bool) {
		Class235.aList2896.add(this);
		((Class539) this).aLong7124 = (long) i;
		((Class539) this).aLong7123 = (long) i;
		((Class539) this).aBool7119 = true;
		((Class539) this).aBool7130 = bool;
	}

	void method11523(int i, boolean bool) {
		Class235.aList2896.add(this);
		((Class539) this).aLong7124 = (long) i;
		((Class539) this).aLong7123 = (long) i;
		((Class539) this).aBool7119 = true;
		((Class539) this).aBool7130 = bool;
	}

	public void method11524() {
		((Class539) this).aBool7119 = true;
	}

	void method11525(int i, boolean bool) {
		Class235.aList2896.add(this);
		((Class539) this).aLong7124 = (long) i;
		((Class539) this).aLong7123 = (long) i;
		((Class539) this).aBool7119 = true;
		((Class539) this).aBool7130 = bool;
	}

	void method11526(int i, boolean bool) {
		Class235.aList2896.add(this);
		((Class539) this).aLong7124 = (long) i;
		((Class539) this).aLong7123 = (long) i;
		((Class539) this).aBool7119 = true;
		((Class539) this).aBool7130 = bool;
	}

	public void method11527() {
		((Class539) this).aBool7128 = true;
	}

	void method11528(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_220_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) -18);
						continue while_220_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(235210991)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-701636707).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	boolean method11529(GraphicalRenderer class505, long l) {
		if (((Class539) this).aLong7124 != ((Class539) this).aLong7123)
			method11527();
		else
			method11508();
		if (l - ((Class539) this).aLong7124 > 750L) {
			method11506();
			return false;
		}
		int i = (int) (l - ((Class539) this).aLong7123);
		if (((Class539) this).aBool7119) {
			Iterator iterator = ((Class539) this).aList7129.iterator();
			while (iterator.hasNext()) {
				Class538 class538 = (Class538) iterator.next();
				for (int i_5_ = 0; i_5_ < (((Class538) class538).aClass59_7101.anInt557 * 94809495); i_5_++)
					class538.method11493(class505, l, 1, !((Class539) this).aBool7128, 246804281);
			}
			((Class539) this).aBool7119 = false;
		}
		Iterator iterator = ((Class539) this).aList7129.iterator();
		while (iterator.hasNext()) {
			Class538 class538 = (Class538) iterator.next();
			class538.method11493(class505, l, i, !((Class539) this).aBool7128, 112662424);
		}
		((Class539) this).aLong7123 = l;
		return true;
	}

	public void method11530(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		((Class539) this).anInt7122 = i;
	}

	void method11531() {
		aBool7132 = true;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if ((((Class282_Sub40) class282_sub40).aClass345_8007.anInt4041 * -39568147) == 1)
				class282_sub40.remove();
		}
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null) {
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] = null;
			}
		}
		((Class539) this).anInt7125 = 0;
		((Class539) this).aList7129 = new LinkedList();
		((Class539) this).anInt7126 = 0;
		((Class539) this).aList7127 = new LinkedList();
		((Class539) this).anInt7121 = 0;
	}

	void method11532() {
		aBool7132 = true;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if ((((Class282_Sub40) class282_sub40).aClass345_8007.anInt4041 * -39568147) == 1)
				class282_sub40.remove();
		}
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null) {
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] = null;
			}
		}
		((Class539) this).anInt7125 = 0;
		((Class539) this).aList7129 = new LinkedList();
		((Class539) this).anInt7126 = 0;
		((Class539) this).aList7127 = new LinkedList();
		((Class539) this).anInt7121 = 0;
	}

	public Class151 method11533() {
		((Class539) this).aClass151_7131.aClass464_1961.method7740(493536965);
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null && (((Class275_Sub1_Sub1_Sub1) ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i]).aClass538_10428) != null)
				((Class539) this).aClass151_7131.aClass464_1961.method7735(((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i], -1474682277);
		}
		return ((Class539) this).aClass151_7131;
	}

	public void method11534() {
		((Class539) this).aBool7128 = true;
	}

	void method11535() {
		((Class539) this).aBool7128 = false;
	}

	void method11536() {
		((Class539) this).aBool7128 = false;
	}

	Class539(int i, boolean bool) {
		((Class539) this).aBool7128 = false;
		((Class539) this).anInt7125 = 0;
		((Class539) this).aList7129 = new LinkedList();
		((Class539) this).anInt7126 = 0;
		((Class539) this).aList7127 = new LinkedList();
		((Class539) this).anInt7121 = 0;
		((Class539) this).aBool7119 = false;
		((Class539) this).aBool7130 = false;
		((Class539) this).aClass151_7131 = new Class151();
		((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120 = new Class275_Sub1_Sub1_Sub1[8192];
		method11504(i, bool);
	}

	void method11537() {
		((Class539) this).aBool7128 = false;
	}

	boolean method11538(GraphicalRenderer class505, long l) {
		if (((Class539) this).aLong7124 != ((Class539) this).aLong7123)
			method11527();
		else
			method11508();
		if (l - ((Class539) this).aLong7124 > 750L) {
			method11506();
			return false;
		}
		int i = (int) (l - ((Class539) this).aLong7123);
		if (((Class539) this).aBool7119) {
			Iterator iterator = ((Class539) this).aList7129.iterator();
			while (iterator.hasNext()) {
				Class538 class538 = (Class538) iterator.next();
				for (int i_10_ = 0; i_10_ < (((Class538) class538).aClass59_7101.anInt557 * 94809495); i_10_++)
					class538.method11493(class505, l, 1, !((Class539) this).aBool7128, 579356538);
			}
			((Class539) this).aBool7119 = false;
		}
		Iterator iterator = ((Class539) this).aList7129.iterator();
		while (iterator.hasNext()) {
			Class538 class538 = (Class538) iterator.next();
			class538.method11493(class505, l, i, !((Class539) this).aBool7128, 425849729);
		}
		((Class539) this).aLong7123 = l;
		return true;
	}

	void method11539(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_221_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) 8);
						continue while_221_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(-1500004365)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-1218904637).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	public void method11540(long l) {
		((Class539) this).aLong7124 = l;
	}

	void method11541(GraphicalRenderer class505, Class87[] class87s, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBoolArray7133[i] = false;
		Iterator iterator = ((Class539) this).aList7129.iterator();
		while_222_: while (iterator.hasNext()) {
			Class538 class538 = (Class538) iterator.next();
			if (class87s != null) {
				for (int i = 0; i < class87s.length; i++) {
					if (((Class538) class538).aClass87_7110 == class87s[i] || (((Class538) class538).aClass87_7110 == class87s[i].aClass87_835)) {
						aBoolArray7133[i] = true;
						class538.method11494((byte) 5);
						((Class538) class538).aBool7107 = false;
						continue while_222_;
					}
				}
			}
			if (!bool) {
				if (((Class538) class538).anInt7104 * -633981049 == 0) {
					iterator.remove();
					((Class539) this).anInt7126--;
				} else
					((Class538) class538).aBool7107 = true;
			}
		}
		if (class87s != null) {
			for (int i = 0; (i < class87s.length && i != 32 && ((Class539) this).anInt7126 != 32); i++) {
				if (!aBoolArray7133[i]) {
					Class538 class538 = new Class538(class505, class87s[i], this, ((Class539) this).aLong7124);
					((Class539) this).aList7129.add(class538);
					((Class539) this).anInt7126++;
					aBoolArray7133[i] = true;
				}
			}
		}
	}

	public void method11542(long l) {
		((Class539) this).aLong7124 = l;
	}

	void method11543() {
		aBool7132 = true;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if ((((Class282_Sub40) class282_sub40).aClass345_8007.anInt4041 * -39568147) == 1)
				class282_sub40.remove();
		}
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null) {
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] = null;
			}
		}
		((Class539) this).anInt7125 = 0;
		((Class539) this).aList7129 = new LinkedList();
		((Class539) this).anInt7126 = 0;
		((Class539) this).aList7127 = new LinkedList();
		((Class539) this).anInt7121 = 0;
	}

	public void method11544(GraphicalRenderer class505, long l, Class87[] class87s, Class172[] class172s, boolean bool) {
		if (!aBool7132) {
			method11541(class505, class87s, bool);
			method11513(class172s, bool);
			((Class539) this).aLong7124 = l;
		}
	}

	public void method11545(GraphicalRenderer class505, long l, Class87[] class87s, Class172[] class172s, boolean bool) {
		if (!aBool7132) {
			method11541(class505, class87s, bool);
			method11513(class172s, bool);
			((Class539) this).aLong7124 = l;
		}
	}

	void method11546(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_223_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) -87);
						continue while_223_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(2033988889)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-2111191806).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	void method11547() {
		aBool7132 = true;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if ((((Class282_Sub40) class282_sub40).aClass345_8007.anInt4041 * -39568147) == 1)
				class282_sub40.remove();
		}
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null) {
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
				((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] = null;
			}
		}
		((Class539) this).anInt7125 = 0;
		((Class539) this).aList7129 = new LinkedList();
		((Class539) this).anInt7126 = 0;
		((Class539) this).aList7127 = new LinkedList();
		((Class539) this).anInt7121 = 0;
	}

	void method11548(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_224_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) -97);
						continue while_224_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(-1924991475)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-1219729064).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	void method11549(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_225_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) -105);
						continue while_225_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(512479777)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-717786356).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	void method11550() {
		((Class539) this).aBool7128 = false;
	}

	void method11551(Class172[] class172s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7134[i] = false;
		Iterator iterator = ((Class539) this).aList7127.iterator();
		while_226_: while (iterator.hasNext()) {
			Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
			if (class172s != null) {
				for (int i = 0; i < class172s.length; i++) {
					if ((((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i]) || (((Class282_Sub40) class282_sub40).aClass172_8009 == class172s[i].aClass172_2114)) {
						aBoolArray7134[i] = true;
						class282_sub40.method13298((byte) -43);
						continue while_226_;
					}
				}
			}
			if (!bool) {
				class282_sub40.remove();
				((Class539) this).anInt7121--;
				if (class282_sub40.method4994(-955146742)) {
					class282_sub40.remove();
					Class235.anInt2898 -= -50571805;
				}
			}
		}
		if (class172s != null) {
			for (int i = 0; (i < class172s.length && i != 8 && ((Class539) this).anInt7121 != 8); i++) {
				if (!aBoolArray7134[i]) {
					Class282_Sub40 class282_sub40 = null;
					if ((class172s[i].method2913(-1441828475).anInt4041 * -39568147) == 1 && Class235.anInt2898 * 703961035 < 32) {
						class282_sub40 = new Class282_Sub40(class172s[i], this);
						Class235.aClass465_2904.method7765(class282_sub40, (long) (class172s[i].anInt2115 * -1105042663));
						Class235.anInt2898 += -50571805;
					}
					if (class282_sub40 == null)
						class282_sub40 = new Class282_Sub40(class172s[i], this);
					((Class539) this).aList7127.add(class282_sub40);
					((Class539) this).anInt7121++;
					aBoolArray7134[i] = true;
				}
			}
		}
	}

	public Class151 method11552() {
		((Class539) this).aClass151_7131.aClass464_1961.method7740(493536965);
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null && (((Class275_Sub1_Sub1_Sub1) ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i]).aClass538_10428) != null)
				((Class539) this).aClass151_7131.aClass464_1961.method7735(((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i], -472034473);
		}
		return ((Class539) this).aClass151_7131;
	}

	public Class151 method11553() {
		((Class539) this).aClass151_7131.aClass464_1961.method7740(493536965);
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null && (((Class275_Sub1_Sub1_Sub1) ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i]).aClass538_10428) != null)
				((Class539) this).aClass151_7131.aClass464_1961.method7735(((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i], -858782);
		}
		return ((Class539) this).aClass151_7131;
	}

	public Class151 method11554() {
		((Class539) this).aClass151_7131.aClass464_1961.method7740(493536965);
		for (int i = 0; i < ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120.length; i++) {
			if (((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i] != null && (((Class275_Sub1_Sub1_Sub1) ((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i]).aClass538_10428) != null)
				((Class539) this).aClass151_7131.aClass464_1961.method7735(((Class539) this).aClass275_Sub1_Sub1_Sub1Array7120[i], -1430884429);
		}
		return ((Class539) this).aClass151_7131;
	}

	public void method11555() {
		((Class539) this).aBool7119 = true;
	}

	void method11556(SceneObjectManager class206, GraphicalRenderer class505) {
		((Class539) this).aClass151_7131.aClass464_1961.method7740(493536965);
		Iterator iterator = ((Class539) this).aList7129.iterator();
		while (iterator.hasNext()) {
			Class538 class538 = (Class538) iterator.next();
			class538.method11496(class206, class505, ((Class539) this).aLong7123);
		}
	}

	public static Class539 method11557(int i, boolean bool) {
		if (Class235.anInt2901 * 1765973211 != Class235.anInt2899 * -224341485) {
			Class539 class539 = Class477.aClass539Array5632[Class235.anInt2899 * -224341485];
			Class235.anInt2899 = ((Class235.anInt2899 * -224341485 + 1 & Class89.anIntArray931[Class235.anInt2906 * -391332475]) * 1556727835);
			class539.method11504(i, bool);
			return class539;
		}
		return new Class539(i, bool);
	}

	public Class151 method11558() {
		return ((Class539) this).aClass151_7131;
	}
}
