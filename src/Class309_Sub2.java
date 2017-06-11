/* Class309_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

public class Class309_Sub2 extends Class309 {
	int anInt7682;
	long aLong7683;
	int anInt7684;
	long[] aLongArray7685;
	long aLong7686 = 0L;
	long aLong7687;

	long method3790() {
		return ((Class309_Sub2) this).aLong7686 * 7092803054136495365L;
	}

	long method3794(int i) {
		try {
			return ((Class309_Sub2) this).aLong7686 * 7092803054136495365L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aau.k(").append(')').toString());
		}
	}

	long method3795() {
		((Class309_Sub2) this).aLong7686 += method3808(970605565) * 805490578470680525L;
		if (((Class309_Sub2) this).aLong7683 * 2528788777947664827L > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			return ((((Class309_Sub2) this).aLong7683 * 2528788777947664827L - ((Class309_Sub2) this).aLong7686 * 7092803054136495365L) / 1000000L);
		return 0L;
	}

	void method3793() {
		((Class309_Sub2) this).aLong7687 = 0L;
		if (2528788777947664827L * ((Class309_Sub2) this).aLong7683 > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			((Class309_Sub2) this).aLong7686 += (((Class309_Sub2) this).aLong7683 * -1445719683822198849L - 1L * ((Class309_Sub2) this).aLong7686);
	}

	int method3791(long l) {
		try {
			if (2528788777947664827L * ((Class309_Sub2) this).aLong7683 > 7092803054136495365L * ((Class309_Sub2) this).aLong7686) {
				((Class309_Sub2) this).aLong7687 += (-266790697308425433L * ((Class309_Sub2) this).aLong7683 - (((Class309_Sub2) this).aLong7686 * -8298770624837138791L));
				((Class309_Sub2) this).aLong7686 += ((-1445719683822198849L * ((Class309_Sub2) this).aLong7683) - 1L * ((Class309_Sub2) this).aLong7686);
				((Class309_Sub2) this).aLong7683 += l * -8587934381355922573L;
				return 1;
			}
			int i = 0;
			do {
				i++;
				((Class309_Sub2) this).aLong7683 += -8587934381355922573L * l;
			} while (i < 10 && ((((Class309_Sub2) this).aLong7683 * 2528788777947664827L) < (7092803054136495365L * ((Class309_Sub2) this).aLong7686)));
			if (((Class309_Sub2) this).aLong7683 * 2528788777947664827L < ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
				((Class309_Sub2) this).aLong7683 = ((Class309_Sub2) this).aLong7686 * -3947023160226410433L;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aau.i(").append(')').toString());
		}
	}

	void method3788(int i) {
		try {
			((Class309_Sub2) this).aLong7687 = 0L;
			if (2528788777947664827L * ((Class309_Sub2) this).aLong7683 > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
				((Class309_Sub2) this).aLong7686 += ((((Class309_Sub2) this).aLong7683 * -1445719683822198849L) - 1L * ((Class309_Sub2) this).aLong7686);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aau.b(").append(')').toString());
		}
	}

	void method3798() {
		((Class309_Sub2) this).aLong7687 = 0L;
		if (2528788777947664827L * ((Class309_Sub2) this).aLong7683 > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			((Class309_Sub2) this).aLong7686 += (((Class309_Sub2) this).aLong7683 * -1445719683822198849L - 1L * ((Class309_Sub2) this).aLong7686);
	}

	void method3792() {
		((Class309_Sub2) this).aLong7687 = 0L;
		if (2528788777947664827L * ((Class309_Sub2) this).aLong7683 > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			((Class309_Sub2) this).aLong7686 += (((Class309_Sub2) this).aLong7683 * -1445719683822198849L - 1L * ((Class309_Sub2) this).aLong7686);
	}

	long method3789(int i) {
		try {
			((Class309_Sub2) this).aLong7686 += method3808(970605565) * 805490578470680525L;
			if (((Class309_Sub2) this).aLong7683 * 2528788777947664827L > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
				return (((Class309_Sub2) this).aLong7683 * 2528788777947664827L - (((Class309_Sub2) this).aLong7686 * 7092803054136495365L)) / 1000000L;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aau.p(").append(')').toString());
		}
	}

	long method3797() {
		((Class309_Sub2) this).aLong7686 += method3808(970605565) * 805490578470680525L;
		if (((Class309_Sub2) this).aLong7683 * 2528788777947664827L > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			return ((((Class309_Sub2) this).aLong7683 * 2528788777947664827L - ((Class309_Sub2) this).aLong7686 * 7092803054136495365L) / 1000000L);
		return 0L;
	}

	long method3808(int i) {
		try {
			long l = QueryPerformanceCounter.nanoTime();
			long l_0_ = l - ((Class309_Sub2) this).aLong7687 * -749596307049612979L;
			((Class309_Sub2) this).aLong7687 = l * -809283569091942523L;
			if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
				((Class309_Sub2) this).aLongArray7685[((Class309_Sub2) this).anInt7684 * -683538483] = l_0_;
				((Class309_Sub2) this).anInt7684 = (1094860037 * ((1 + ((Class309_Sub2) this).anInt7684 * -683538483) % 10));
				if (((Class309_Sub2) this).anInt7682 * 769935805 < 1)
					((Class309_Sub2) this).anInt7682 += 149830037;
			}
			long l_1_ = 0L;
			for (int i_2_ = 1; i_2_ <= ((Class309_Sub2) this).anInt7682 * 769935805; i_2_++)
				l_1_ += (((Class309_Sub2) this).aLongArray7685[(10 + (((Class309_Sub2) this).anInt7684 * -683538483 - i_2_)) % 10]);
			return (l_1_ / (long) (((Class309_Sub2) this).anInt7682 * 769935805));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aau.e(").append(')').toString());
		}
	}

	long method3796() {
		((Class309_Sub2) this).aLong7686 += method3808(970605565) * 805490578470680525L;
		if (((Class309_Sub2) this).aLong7683 * 2528788777947664827L > ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			return ((((Class309_Sub2) this).aLong7683 * 2528788777947664827L - ((Class309_Sub2) this).aLong7686 * 7092803054136495365L) / 1000000L);
		return 0L;
	}

	int method3799(long l) {
		if (2528788777947664827L * ((Class309_Sub2) this).aLong7683 > 7092803054136495365L * ((Class309_Sub2) this).aLong7686) {
			((Class309_Sub2) this).aLong7687 += (-266790697308425433L * ((Class309_Sub2) this).aLong7683 - (((Class309_Sub2) this).aLong7686 * -8298770624837138791L));
			((Class309_Sub2) this).aLong7686 += (-1445719683822198849L * ((Class309_Sub2) this).aLong7683 - 1L * ((Class309_Sub2) this).aLong7686);
			((Class309_Sub2) this).aLong7683 += l * -8587934381355922573L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class309_Sub2) this).aLong7683 += -8587934381355922573L * l;
		} while (i < 10 && (((Class309_Sub2) this).aLong7683 * 2528788777947664827L < (7092803054136495365L * ((Class309_Sub2) this).aLong7686)));
		if (((Class309_Sub2) this).aLong7683 * 2528788777947664827L < ((Class309_Sub2) this).aLong7686 * 7092803054136495365L)
			((Class309_Sub2) this).aLong7683 = ((Class309_Sub2) this).aLong7686 * -3947023160226410433L;
		return i;
	}

	Class309_Sub2() {
		((Class309_Sub2) this).aLong7683 = 0L;
		((Class309_Sub2) this).aLong7687 = 0L;
		((Class309_Sub2) this).aLongArray7685 = new long[10];
		((Class309_Sub2) this).anInt7684 = 0;
		((Class309_Sub2) this).anInt7682 = 149830037;
		((Class309_Sub2) this).aLong7683 = ((((Class309_Sub2) this).aLong7686 = QueryPerformanceCounter.nanoTime() * 805490578470680525L) * -3947023160226410433L);
		if (((Class309_Sub2) this).aLong7686 * 7092803054136495365L == 0L)
			throw new RuntimeException();
	}
}
