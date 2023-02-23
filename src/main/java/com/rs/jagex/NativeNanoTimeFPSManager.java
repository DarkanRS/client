package com.rs.jagex;

import jaclib.nanotime.QueryPerformanceCounter;

public class NativeNanoTimeFPSManager extends FPSManager {

	long prevTime;
	long aLong7730;
	long aLong7727;
	int currIdx;
	int currSize = 1;
	long[] loggedTimes = new long[10];

	NativeNanoTimeFPSManager() {
		aLong7727 = aLong7730 = QueryPerformanceCounter.nanoTime();
		if (aLong7730 == 0L)
			throw new RuntimeException();
	}

	long method12493() {
		long currTime = QueryPerformanceCounter.nanoTime();
		long elapsed = currTime - prevTime;
		prevTime = currTime;
		if (elapsed > -5000000000L && elapsed < 5000000000L) {
			loggedTimes[currIdx] = elapsed;
			currIdx = (currIdx + 1) % 10;
			if (currSize < 1)
				++currSize;
		}

		long long_6 = 0L;

		for (int i_8 = 1; i_8 <= currSize; i_8++)
			long_6 += loggedTimes[(currIdx - i_8 + 10) % 10];

		return long_6 / currSize;
	}

	@Override
	long method4844() {
		aLong7730 += method12493();
		return aLong7727 > aLong7730 ? (aLong7727 - aLong7730) / 1000000L : 0L;
	}

	@Override
	int method4845(long nanoSecondsPerFrame) {
		if (aLong7727 > aLong7730) {
			prevTime += aLong7727 - aLong7730;
			aLong7730 += aLong7727 - aLong7730;
			aLong7727 += nanoSecondsPerFrame;
			return 1;
		}
		int i_3 = 0;

		do {
			++i_3;
			aLong7727 += nanoSecondsPerFrame;
		} while (i_3 < 10 && aLong7727 < aLong7730);

		if (aLong7727 < aLong7730)
			aLong7727 = aLong7730;

		return i_3;
	}

	@Override
	long method4852() {
		return aLong7730;
	}

	@Override
	void method4853() {
		prevTime = 0L;
		if (aLong7727 > aLong7730)
			aLong7730 += aLong7727 - aLong7730;

	}
}
