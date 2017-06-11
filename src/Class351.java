/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class351 {
	int anInt3760;
	boolean aBoolean3761;
	Class302_Sub3_Sub1_Sub1[] aClass302_Sub3_Sub1_Sub1Array3762;
	int anInt3763;
	long aLong3764;
	Class69 aClass69_3765;
	List aList3766;
	int anInt3767;
	List aList3768;
	int anInt3769;
	boolean aBoolean3770;
	boolean aBoolean3771;
	public boolean aBoolean3772 = false;
	long aLong3773;
	static boolean[] aBooleanArray3774 = new boolean[32];
	static boolean[] aBooleanArray3775 = new boolean[8];

	Class351(int i, boolean bool) {
		((Class351) this).aBoolean3761 = false;
		((Class351) this).anInt3763 = 0;
		((Class351) this).aList3766 = new LinkedList();
		((Class351) this).anInt3760 = 0;
		((Class351) this).aList3768 = new LinkedList();
		((Class351) this).anInt3769 = 0;
		((Class351) this).aBoolean3770 = false;
		((Class351) this).aBoolean3771 = false;
		((Class351) this).aClass69_3765 = new Class69();
		((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762 = new Class302_Sub3_Sub1_Sub1[8192];
		method4219(i, bool);
	}

	void method4219(int i, boolean bool) {
		Class344.aList3683.add(this);
		((Class351) this).aLong3773 = (long) i;
		((Class351) this).aLong3764 = (long) i;
		((Class351) this).aBoolean3770 = true;
		((Class351) this).aBoolean3771 = bool;
	}

	public void method4220() {
		((Class351) this).aBoolean3770 = true;
	}

	public void method4221() {
		((Class351) this).aBoolean3761 = true;
	}

	boolean method4222(GraphicsToolkit class_ra, long l) {
		if (((Class351) this).aLong3773 != ((Class351) this).aLong3764)
			method4221();
		else
			method4230();
		if (l - ((Class351) this).aLong3773 > 750L) {
			method4223();
			return false;
		}
		int i = (int) (l - ((Class351) this).aLong3764);
		if (((Class351) this).aBoolean3770) {
			Iterator iterator = ((Class351) this).aList3766.iterator();
			while (iterator.hasNext()) {
				Class342 class342 = (Class342) iterator.next();
				for (int i_0_ = 0; i_0_ < (((Class342) class342).aClass182_3656.anInt1852 * 1095253617); i_0_++)
					class342.method4147(class_ra, l, 1, !((Class351) this).aBoolean3761, (byte) 63);
			}
			((Class351) this).aBoolean3770 = false;
		}
		Iterator iterator = ((Class351) this).aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4147(class_ra, l, i, !((Class351) this).aBoolean3761, (byte) 45);
		}
		((Class351) this).aLong3764 = l;
		return true;
	}

	void method4223() {
		aBoolean3772 = true;
		Iterator iterator = ((Class351) this).aList3768.iterator();
		while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if ((((Class298_Sub45) class298_sub45).aClass190_7514.anInt1940 * -1955592777) == 1)
				class298_sub45.unlink(-1460969981);
		}
		for (int i = 0; i < ((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762[i] != null) {
				((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762[i].method3726();
				((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762[i] = null;
			}
		}
		((Class351) this).anInt3763 = 0;
		((Class351) this).aList3766 = new LinkedList();
		((Class351) this).anInt3760 = 0;
		((Class351) this).aList3768 = new LinkedList();
		((Class351) this).anInt3769 = 0;
	}

	void method4224(GraphicsToolkit class_ra, Class85[] class85s, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBooleanArray3774[i] = false;
		Iterator iterator = ((Class351) this).aList3766.iterator();
		while_84_: while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			if (class85s != null) {
				for (int i = 0; i < class85s.length; i++) {
					if (((Class342) class342).aClass85_3662 == class85s[i] || (((Class342) class342).aClass85_3662 == class85s[i].aClass85_776)) {
						aBooleanArray3774[i] = true;
						class342.method4146((byte) -40);
						((Class342) class342).aBoolean3664 = false;
						continue while_84_;
					}
				}
			}
			if (!bool) {
				if (((Class342) class342).anInt3652 * -917784967 == 0) {
					iterator.remove();
					((Class351) this).anInt3760--;
				} else
					((Class342) class342).aBoolean3664 = true;
			}
		}
		if (class85s != null) {
			for (int i = 0; (i < class85s.length && i != 32 && ((Class351) this).anInt3760 != 32); i++) {
				if (!aBooleanArray3774[i]) {
					Class342 class342 = new Class342(class_ra, class85s[i], this, ((Class351) this).aLong3773);
					((Class351) this).aList3766.add(class342);
					((Class351) this).anInt3760++;
					aBooleanArray3774[i] = true;
				}
			}
		}
	}

	void method4225(Class68[] class68s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBooleanArray3775[i] = false;
		Iterator iterator = ((Class351) this).aList3768.iterator();
		while_85_: while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if (class68s != null) {
				for (int i = 0; i < class68s.length; i++) {
					if ((((Class298_Sub45) class298_sub45).aClass68_7518 == class68s[i]) || (((Class298_Sub45) class298_sub45).aClass68_7518 == class68s[i].aClass68_672)) {
						aBooleanArray3775[i] = true;
						class298_sub45.method3532(-219401060);
						continue while_85_;
					}
				}
			}
			if (!bool) {
				class298_sub45.unlink(-1460969981);
				((Class351) this).anInt3769--;
				if (class298_sub45.method2840(-629325116)) {
					class298_sub45.unlink(-1460969981);
					Class344.anInt3685 -= 817588661;
				}
			}
		}
		if (class68s != null) {
			for (int i = 0; (i < class68s.length && i != 8 && ((Class351) this).anInt3769 != 8); i++) {
				if (!aBooleanArray3775[i]) {
					Class298_Sub45 class298_sub45 = null;
					if ((class68s[i].method775((byte) 3).anInt1940 * -1955592777) == 1 && Class344.anInt3685 * -1237648227 < 32) {
						class298_sub45 = new Class298_Sub45(class68s[i], this);
						Class344.aClass437_3684.method5817(class298_sub45, (long) (class68s[i].anInt673 * 617796067));
						Class344.anInt3685 += 817588661;
					}
					if (class298_sub45 == null)
						class298_sub45 = new Class298_Sub45(class68s[i], this);
					((Class351) this).aList3768.add(class298_sub45);
					((Class351) this).anInt3769++;
					aBooleanArray3775[i] = true;
				}
			}
		}
	}

	public Class69 method4226() {
		((Class351) this).aClass69_3765.aClass448_680.method5907(198538836);
		for (int i = 0; i < ((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762[i] != null && (((Class302_Sub3_Sub1_Sub1) ((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762[i]).aClass342_10037) != null)
				((Class351) this).aClass69_3765.aClass448_680.method5908(((Class351) this).aClass302_Sub3_Sub1_Sub1Array3762[i], (byte) -89);
		}
		return ((Class351) this).aClass69_3765;
	}

	public void method4227(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class351) this).anInt3767 = i;
	}

	void method4228(Class331 class331, GraphicsToolkit class_ra) {
		((Class351) this).aClass69_3765.aClass448_680.method5907(-1313547025);
		Iterator iterator = ((Class351) this).aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4148(class331, class_ra, ((Class351) this).aLong3764);
		}
	}

	public Class69 method4229() {
		return ((Class351) this).aClass69_3765;
	}

	void method4230() {
		((Class351) this).aBoolean3761 = false;
	}

	public void method4231(GraphicsToolkit class_ra, long l, Class85[] class85s, Class68[] class68s, boolean bool) {
		if (!aBoolean3772) {
			method4224(class_ra, class85s, bool);
			method4225(class68s, bool);
			((Class351) this).aLong3773 = l;
		}
	}

	public static Class351 method4232(int i, boolean bool) {
		if (Class344.anInt3681 * -1264407527 != Class344.anInt3680 * 274948937) {
			Class351 class351 = Class344.aClass351Array3679[Class344.anInt3680 * 274948937];
			Class344.anInt3680 = ((Class344.anInt3680 * 274948937 + 1 & Class65.anIntArray658[Class344.anInt3675 * 1197525581]) * 172162809);
			class351.method4219(i, bool);
			return class351;
		}
		return new Class351(i, bool);
	}

	public void method4233(long l) {
		((Class351) this).aLong3773 = l;
	}
}
