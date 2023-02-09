package com.rs.jagex;

public class JavaNanoTimeFPSManager extends FPSManager {

	long aLong7735;

	long aLong7738;

	long aLong7734;

	int anInt7737;

	int anInt7736 = 1;

	long[] aLongArray7733 = new long[10];

	JavaNanoTimeFPSManager() {
		aLong7738 = System.nanoTime();
		aLong7734 = System.nanoTime();
	}

	long method12495() {
		long long_2 = System.nanoTime();
		long long_4 = long_2 - aLong7735;
		aLong7735 = long_2;
		if (long_4 > -5000000000L && long_4 < 5000000000L) {
			aLongArray7733[anInt7737] = long_4;
			anInt7737 = (anInt7737 + 1) % 10;
			if (anInt7736 < 1)
				++anInt7736;
		}
		long long_6 = 0L;
		for (int i_8 = 1; i_8 <= anInt7736; i_8++)
			long_6 += aLongArray7733[(anInt7737 - i_8 + 10) % 10];
		return long_6 / anInt7736;
	}

	@Override
	long method4844() {
		aLong7738 += method12495();
		return aLong7734 > aLong7738 ? (aLong7734 - aLong7738) / 1000000L : 0L;
	}

	@Override
	int method4845(long long_1) {
		if (aLong7734 > aLong7738) {
			aLong7735 += aLong7734 - aLong7738;
			aLong7738 += aLong7734 - aLong7738;
			aLong7734 += long_1;
			return 1;
		}
		int i_3 = 0;
		do {
			++i_3;
			aLong7734 += long_1;
		} while (i_3 < 10 && aLong7734 < aLong7738);
		if (aLong7734 < aLong7738)
			aLong7734 = aLong7738;
		return i_3;
	}

	@Override
	long method4852() {
		return aLong7738;
	}

	@Override
	void method4853() {
		aLong7735 = 0L;
		if (aLong7734 > aLong7738)
			aLong7738 += aLong7734 - aLong7738;
	}
}
