
/* Class273_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

public class Class273_Sub1 extends Class273 {
	long aLong7727;
	long[] aLongArray7728;
	long aLong7729;
	long aLong7730 = 0L;
	int anInt7731;
	int anInt7732;

	void method4855() {
		((Class273_Sub1) this).aLong7729 = 0L;
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
	}

	int method4854(long l) {
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730) {
			((Class273_Sub1) this).aLong7729 += (-8254760680807395399L * ((Class273_Sub1) this).aLong7727 - (-3418414235052152733L * ((Class273_Sub1) this).aLong7730));
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
			((Class273_Sub1) this).aLong7727 += -8556059690873681827L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class273_Sub1) this).aLong7727 += -8556059690873681827L * l;
		} while (i < 10 && (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 < (((Class273_Sub1) this).aLong7730 * 891199445578317623L)));
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 < 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7727 = ((Class273_Sub1) this).aLong7730 * -6857759928070410501L;
		return i;
	}

	void method4848() {
		((Class273_Sub1) this).aLong7729 = 0L;
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
	}

	long method4844(int i) {
		((Class273_Sub1) this).aLong7730 += method12493(-1471253742) * 2254354703093819015L;
		if (((Class273_Sub1) this).aLong7727 * -2348106799190078475L > ((Class273_Sub1) this).aLong7730 * 891199445578317623L)
			return ((((Class273_Sub1) this).aLong7727 * -2348106799190078475L - ((Class273_Sub1) this).aLong7730 * 891199445578317623L) / 1000000L);
		return 0L;
	}

	long method4852(int i) {
		return 891199445578317623L * ((Class273_Sub1) this).aLong7730;
	}

	long method12493(int i) {
		long l = QueryPerformanceCounter.nanoTime();
		long l_0_ = l - ((Class273_Sub1) this).aLong7729 * -6584247789516626915L;
		((Class273_Sub1) this).aLong7729 = l * -934071361941275083L;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			((Class273_Sub1) this).aLongArray7728[((Class273_Sub1) this).anInt7731 * -657283283] = l_0_;
			((Class273_Sub1) this).anInt7731 = -1249165147 * ((((Class273_Sub1) this).anInt7731 * -657283283 + 1) % 10);
			if (-1775058097 * ((Class273_Sub1) this).anInt7732 < 1)
				((Class273_Sub1) this).anInt7732 += -42962001;
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= -1775058097 * ((Class273_Sub1) this).anInt7732; i_2_++)
			l_1_ += (((Class273_Sub1) this).aLongArray7728[(((Class273_Sub1) this).anInt7731 * -657283283 - i_2_ + 10) % 10]);
		return l_1_ / (long) (((Class273_Sub1) this).anInt7732 * -1775058097);
	}

	void method4847() {
		((Class273_Sub1) this).aLong7729 = 0L;
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
	}

	long method4851() {
		((Class273_Sub1) this).aLong7730 += method12493(854092285) * 2254354703093819015L;
		if (((Class273_Sub1) this).aLong7727 * -2348106799190078475L > ((Class273_Sub1) this).aLong7730 * 891199445578317623L)
			return ((((Class273_Sub1) this).aLong7727 * -2348106799190078475L - ((Class273_Sub1) this).aLong7730 * 891199445578317623L) / 1000000L);
		return 0L;
	}

	void method4849() {
		((Class273_Sub1) this).aLong7729 = 0L;
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
	}

	int method4845(long l) {
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730) {
			((Class273_Sub1) this).aLong7729 += (-8254760680807395399L * ((Class273_Sub1) this).aLong7727 - (-3418414235052152733L * ((Class273_Sub1) this).aLong7730));
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
			((Class273_Sub1) this).aLong7727 += -8556059690873681827L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class273_Sub1) this).aLong7727 += -8556059690873681827L * l;
		} while (i < 10 && (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 < (((Class273_Sub1) this).aLong7730 * 891199445578317623L)));
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 < 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7727 = ((Class273_Sub1) this).aLong7730 * -6857759928070410501L;
		return i;
	}

	int method4862(long l) {
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730) {
			((Class273_Sub1) this).aLong7729 += (-8254760680807395399L * ((Class273_Sub1) this).aLong7727 - (-3418414235052152733L * ((Class273_Sub1) this).aLong7730));
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
			((Class273_Sub1) this).aLong7727 += -8556059690873681827L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class273_Sub1) this).aLong7727 += -8556059690873681827L * l;
		} while (i < 10 && (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 < (((Class273_Sub1) this).aLong7730 * 891199445578317623L)));
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 < 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7727 = ((Class273_Sub1) this).aLong7730 * -6857759928070410501L;
		return i;
	}

	long method4846() {
		((Class273_Sub1) this).aLong7730 += method12493(419623543) * 2254354703093819015L;
		if (((Class273_Sub1) this).aLong7727 * -2348106799190078475L > ((Class273_Sub1) this).aLong7730 * 891199445578317623L)
			return ((((Class273_Sub1) this).aLong7727 * -2348106799190078475L - ((Class273_Sub1) this).aLong7730 * 891199445578317623L) / 1000000L);
		return 0L;
	}

	void method4853(int i) {
		((Class273_Sub1) this).aLong7729 = 0L;
		if (-2348106799190078475L * ((Class273_Sub1) this).aLong7727 > 891199445578317623L * ((Class273_Sub1) this).aLong7730)
			((Class273_Sub1) this).aLong7730 += (-4112141439889806285L * ((Class273_Sub1) this).aLong7727 - ((Class273_Sub1) this).aLong7730 * 1L);
	}

	Class273_Sub1() {
		((Class273_Sub1) this).aLong7727 = 0L;
		((Class273_Sub1) this).aLong7729 = 0L;
		((Class273_Sub1) this).aLongArray7728 = new long[10];
		((Class273_Sub1) this).anInt7731 = 0;
		((Class273_Sub1) this).anInt7732 = -42962001;
		((Class273_Sub1) this).aLong7727 = ((((Class273_Sub1) this).aLong7730 = QueryPerformanceCounter.nanoTime() * 2254354703093819015L) * -6857759928070410501L);
		if (891199445578317623L * ((Class273_Sub1) this).aLong7730 == 0L)
			throw new RuntimeException();
	}

	long method4861() {
		return 891199445578317623L * ((Class273_Sub1) this).aLong7730;
	}

	long method4856() {
		return 891199445578317623L * ((Class273_Sub1) this).aLong7730;
	}

	long method4857() {
		return 891199445578317623L * ((Class273_Sub1) this).aLong7730;
	}

	long method12494() {
		long l = QueryPerformanceCounter.nanoTime();
		long l_3_ = l - ((Class273_Sub1) this).aLong7729 * -6584247789516626915L;
		((Class273_Sub1) this).aLong7729 = l * -934071361941275083L;
		if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
			((Class273_Sub1) this).aLongArray7728[((Class273_Sub1) this).anInt7731 * -657283283] = l_3_;
			((Class273_Sub1) this).anInt7731 = -1249165147 * ((((Class273_Sub1) this).anInt7731 * -657283283 + 1) % 10);
			if (-1775058097 * ((Class273_Sub1) this).anInt7732 < 1)
				((Class273_Sub1) this).anInt7732 += -42962001;
		}
		long l_4_ = 0L;
		for (int i = 1; i <= -1775058097 * ((Class273_Sub1) this).anInt7732; i++)
			l_4_ += (((Class273_Sub1) this).aLongArray7728[((((Class273_Sub1) this).anInt7731 * -657283283 - i + 10) % 10)]);
		return l_4_ / (long) (((Class273_Sub1) this).anInt7732 * -1775058097);
	}
}
