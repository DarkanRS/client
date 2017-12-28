/* Class273_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class273_Sub2 extends Class273 {
	long[] aLongArray7733;
	long aLong7734;
	long aLong7735;
	int anInt7736;
	int anInt7737;
	long aLong7738 = 0L;

	void method4849() {
		((Class273_Sub2) this).aLong7735 = 0L;
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L > 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - 1L * ((Class273_Sub2) this).aLong7738);
	}

	long method4852(int i) {
		return 7583209133476053025L * ((Class273_Sub2) this).aLong7738;
	}

	long method4844(int i) {
		((Class273_Sub2) this).aLong7738 += method12495((byte) -18) * 5078792902668780513L;
		if (4090131977032338601L * ((Class273_Sub2) this).aLong7734 > ((Class273_Sub2) this).aLong7738 * 7583209133476053025L)
			return ((4090131977032338601L * ((Class273_Sub2) this).aLong7734 - ((Class273_Sub2) this).aLong7738 * 7583209133476053025L) / 1000000L);
		return 0L;
	}

	int method4845(long l) {
		if (4090131977032338601L * ((Class273_Sub2) this).aLong7734 > ((Class273_Sub2) this).aLong7738 * 7583209133476053025L) {
			((Class273_Sub2) this).aLong7735 += (((Class273_Sub2) this).aLong7734 * 3289928719522015019L - ((Class273_Sub2) this).aLong7738 * 648117299666467859L);
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - ((Class273_Sub2) this).aLong7738 * 1L);
			((Class273_Sub2) this).aLong7734 += l * 6386115007194650521L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class273_Sub2) this).aLong7734 += 6386115007194650521L * l;
		} while (i < 10 && (4090131977032338601L * ((Class273_Sub2) this).aLong7734 < (((Class273_Sub2) this).aLong7738 * 7583209133476053025L)));
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L < 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7734 = ((Class273_Sub2) this).aLong7738 * 8517965755372686009L;
		return i;
	}

	void method4853(int i) {
		((Class273_Sub2) this).aLong7735 = 0L;
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L > 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - 1L * ((Class273_Sub2) this).aLong7738);
	}

	long method12495(byte i) {
		long l = System.nanoTime();
		long l_0_ = l - 8551596073145250171L * ((Class273_Sub2) this).aLong7735;
		((Class273_Sub2) this).aLong7735 = l * -8335677826573564493L;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			((Class273_Sub2) this).aLongArray7733[((Class273_Sub2) this).anInt7737 * -995522099] = l_0_;
			((Class273_Sub2) this).anInt7737 = (274107141 * ((1 + -995522099 * ((Class273_Sub2) this).anInt7737) % 10));
			if (((Class273_Sub2) this).anInt7736 * -1416641941 < 1)
				((Class273_Sub2) this).anInt7736 += 2008275523;
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= ((Class273_Sub2) this).anInt7736 * -1416641941; i_2_++)
			l_1_ += (((Class273_Sub2) this).aLongArray7733[(10 + (((Class273_Sub2) this).anInt7737 * -995522099 - i_2_)) % 10]);
		return l_1_ / (long) (((Class273_Sub2) this).anInt7736 * -1416641941);
	}

	void method4847() {
		((Class273_Sub2) this).aLong7735 = 0L;
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L > 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - 1L * ((Class273_Sub2) this).aLong7738);
	}

	void method4848() {
		((Class273_Sub2) this).aLong7735 = 0L;
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L > 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - 1L * ((Class273_Sub2) this).aLong7738);
	}

	Class273_Sub2() {
		((Class273_Sub2) this).aLong7734 = 0L;
		((Class273_Sub2) this).aLong7735 = 0L;
		((Class273_Sub2) this).aLongArray7733 = new long[10];
		((Class273_Sub2) this).anInt7737 = 0;
		((Class273_Sub2) this).anInt7736 = 2008275523;
		((Class273_Sub2) this).aLong7738 = System.nanoTime() * 5078792902668780513L;
		((Class273_Sub2) this).aLong7734 = System.nanoTime() * 6386115007194650521L;
	}

	void method4855() {
		((Class273_Sub2) this).aLong7735 = 0L;
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L > 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - 1L * ((Class273_Sub2) this).aLong7738);
	}

	long method4851() {
		((Class273_Sub2) this).aLong7738 += method12495((byte) -80) * 5078792902668780513L;
		if (4090131977032338601L * ((Class273_Sub2) this).aLong7734 > ((Class273_Sub2) this).aLong7738 * 7583209133476053025L)
			return ((4090131977032338601L * ((Class273_Sub2) this).aLong7734 - ((Class273_Sub2) this).aLong7738 * 7583209133476053025L) / 1000000L);
		return 0L;
	}

	long method4846() {
		((Class273_Sub2) this).aLong7738 += method12495((byte) -8) * 5078792902668780513L;
		if (4090131977032338601L * ((Class273_Sub2) this).aLong7734 > ((Class273_Sub2) this).aLong7738 * 7583209133476053025L)
			return ((4090131977032338601L * ((Class273_Sub2) this).aLong7734 - ((Class273_Sub2) this).aLong7738 * 7583209133476053025L) / 1000000L);
		return 0L;
	}

	int method4862(long l) {
		if (4090131977032338601L * ((Class273_Sub2) this).aLong7734 > ((Class273_Sub2) this).aLong7738 * 7583209133476053025L) {
			((Class273_Sub2) this).aLong7735 += (((Class273_Sub2) this).aLong7734 * 3289928719522015019L - ((Class273_Sub2) this).aLong7738 * 648117299666467859L);
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - ((Class273_Sub2) this).aLong7738 * 1L);
			((Class273_Sub2) this).aLong7734 += l * 6386115007194650521L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class273_Sub2) this).aLong7734 += 6386115007194650521L * l;
		} while (i < 10 && (4090131977032338601L * ((Class273_Sub2) this).aLong7734 < (((Class273_Sub2) this).aLong7738 * 7583209133476053025L)));
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L < 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7734 = ((Class273_Sub2) this).aLong7738 * 8517965755372686009L;
		return i;
	}

	int method4854(long l) {
		if (4090131977032338601L * ((Class273_Sub2) this).aLong7734 > ((Class273_Sub2) this).aLong7738 * 7583209133476053025L) {
			((Class273_Sub2) this).aLong7735 += (((Class273_Sub2) this).aLong7734 * 3289928719522015019L - ((Class273_Sub2) this).aLong7738 * 648117299666467859L);
			((Class273_Sub2) this).aLong7738 += (-3466426661587870839L * ((Class273_Sub2) this).aLong7734 - ((Class273_Sub2) this).aLong7738 * 1L);
			((Class273_Sub2) this).aLong7734 += l * 6386115007194650521L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class273_Sub2) this).aLong7734 += 6386115007194650521L * l;
		} while (i < 10 && (4090131977032338601L * ((Class273_Sub2) this).aLong7734 < (((Class273_Sub2) this).aLong7738 * 7583209133476053025L)));
		if (((Class273_Sub2) this).aLong7734 * 4090131977032338601L < 7583209133476053025L * ((Class273_Sub2) this).aLong7738)
			((Class273_Sub2) this).aLong7734 = ((Class273_Sub2) this).aLong7738 * 8517965755372686009L;
		return i;
	}

	long method4857() {
		return 7583209133476053025L * ((Class273_Sub2) this).aLong7738;
	}

	long method4861() {
		return 7583209133476053025L * ((Class273_Sub2) this).aLong7738;
	}

	long method12496() {
		long l = System.nanoTime();
		long l_3_ = l - 8551596073145250171L * ((Class273_Sub2) this).aLong7735;
		((Class273_Sub2) this).aLong7735 = l * -8335677826573564493L;
		if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
			((Class273_Sub2) this).aLongArray7733[((Class273_Sub2) this).anInt7737 * -995522099] = l_3_;
			((Class273_Sub2) this).anInt7737 = (274107141 * ((1 + -995522099 * ((Class273_Sub2) this).anInt7737) % 10));
			if (((Class273_Sub2) this).anInt7736 * -1416641941 < 1)
				((Class273_Sub2) this).anInt7736 += 2008275523;
		}
		long l_4_ = 0L;
		for (int i = 1; i <= ((Class273_Sub2) this).anInt7736 * -1416641941; i++)
			l_4_ += (((Class273_Sub2) this).aLongArray7733[(10 + (((Class273_Sub2) this).anInt7737 * -995522099 - i)) % 10]);
		return l_4_ / (long) (((Class273_Sub2) this).anInt7736 * -1416641941);
	}

	long method12497() {
		long l = System.nanoTime();
		long l_5_ = l - 8551596073145250171L * ((Class273_Sub2) this).aLong7735;
		((Class273_Sub2) this).aLong7735 = l * -8335677826573564493L;
		if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
			((Class273_Sub2) this).aLongArray7733[((Class273_Sub2) this).anInt7737 * -995522099] = l_5_;
			((Class273_Sub2) this).anInt7737 = (274107141 * ((1 + -995522099 * ((Class273_Sub2) this).anInt7737) % 10));
			if (((Class273_Sub2) this).anInt7736 * -1416641941 < 1)
				((Class273_Sub2) this).anInt7736 += 2008275523;
		}
		long l_6_ = 0L;
		for (int i = 1; i <= ((Class273_Sub2) this).anInt7736 * -1416641941; i++)
			l_6_ += (((Class273_Sub2) this).aLongArray7733[(10 + (((Class273_Sub2) this).anInt7737 * -995522099 - i)) % 10]);
		return l_6_ / (long) (((Class273_Sub2) this).anInt7736 * -1416641941);
	}

	long method4856() {
		return 7583209133476053025L * ((Class273_Sub2) this).aLong7738;
	}

	long method12498() {
		long l = System.nanoTime();
		long l_7_ = l - 8551596073145250171L * ((Class273_Sub2) this).aLong7735;
		((Class273_Sub2) this).aLong7735 = l * -8335677826573564493L;
		if (l_7_ > -5000000000L && l_7_ < 5000000000L) {
			((Class273_Sub2) this).aLongArray7733[((Class273_Sub2) this).anInt7737 * -995522099] = l_7_;
			((Class273_Sub2) this).anInt7737 = (274107141 * ((1 + -995522099 * ((Class273_Sub2) this).anInt7737) % 10));
			if (((Class273_Sub2) this).anInt7736 * -1416641941 < 1)
				((Class273_Sub2) this).anInt7736 += 2008275523;
		}
		long l_8_ = 0L;
		for (int i = 1; i <= ((Class273_Sub2) this).anInt7736 * -1416641941; i++)
			l_8_ += (((Class273_Sub2) this).aLongArray7733[(10 + (((Class273_Sub2) this).anInt7737 * -995522099 - i)) % 10]);
		return l_8_ / (long) (((Class273_Sub2) this).anInt7736 * -1416641941);
	}

	static final void method12499(Class527 class527, int i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		Class215.method3672(class118, class98, class527, (short) 10267);
	}
}
