/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38 {
	static final boolean method443(int i, int i_0_) {
		return (i & 0x21) != 0;
	}

	static final boolean method444(int i, int i_1_) {
		return (i & 0x22) != 0;
	}

	static final boolean method445(int i, int i_2_) {
		return (i & 0x34) != 0;
	}

	static final boolean method446(int i, int i_3_) {
		return (i & 0x37) != 0;
	}

	static final boolean method447(int i, int i_4_) {
		return method468(i, i_4_) & method456(i, i_4_);
	}

	static final boolean method448(int i, int i_5_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method449(int i, int i_6_) {
		return ((i & 0x60000) != 0 | method468(i, i_6_) || method470(i, i_6_) || method447(i, i_6_));
	}

	static final boolean method450(int i, int i_7_) {
		return false;
	}

	static final boolean method451(int i, int i_8_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method452(int i, int i_9_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method453(int i, int i_10_) {
		return (i & 0x40000) != 0 | method467(i, i_10_) || method470(i, i_10_);
	}

	static final boolean method454(int i, int i_11_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method455(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method456(int i, int i_13_) {
		return (i & 0x800) != 0;
	}

	static final boolean method457(int i, int i_14_) {
		return ((method443(i, i_14_) | method444(i, i_14_) | method445(i, i_14_)) & method471(i, i_14_));
	}

	static final boolean method458(int i, int i_15_) {
		return (i & 0x800) != 0;
	}

	static final boolean method459(int i, int i_16_) {
		return (i & 0x20) != 0;
	}

	static final boolean method460(int i, int i_17_) {
		return (i & 0x70000) != 0 | method444(i, i_17_) || method457(i, i_17_);
	}

	static final boolean method461(int i, int i_18_) {
		if ((i & 0x10000) != 0 | method474(i, i_18_) || method464(i, i_18_))
			return true;
		return (i_18_ & 0x37) == 0 && method470(i, i_18_);
	}

	static final boolean method462(int i, int i_19_) {
		return method450(i, i_19_) || method476(i, i_19_);
	}

	static final boolean method463(int i, int i_20_) {
		return (i & 0x180) != 0;
	}

	static final boolean method464(int i, int i_21_) {
		return (((i & 0x2000) != 0 | method474(i, i_21_) | method454(i, i_21_)) & method475(i, i_21_));
	}

	static final boolean method465(int i, int i_22_) {
		return (i & 0x400) != 0;
	}

	static final boolean method466(int i, int i_23_) {
		return (i & 0x800) != 0 | method451(i, i_23_) || method470(i, i_23_);
	}

	static final boolean method467(int i, int i_24_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method468(int i, int i_25_) {
		return (i & 0x10) != 0;
	}

	static final boolean method469(int i, int i_26_) {
		return (i & 0x70000) != 0 | method443(i, i_26_) || method457(i, i_26_);
	}

	static final boolean method470(int i, int i_27_) {
		if (!method458(i, i_27_))
			return false;
		if ((i & 0xb000) != 0 | method448(i, i_27_) | method467(i, i_27_))
			return true;
		return ((i_27_ & 0x37) == 0 & (method474(i, i_27_) | method454(i, i_27_)));
	}

	static final boolean method471(int i, int i_28_) {
		return (i & 0x800) != 0;
	}

	static final boolean method472(int i, int i_29_) {
		return method448(i, i_29_) || method470(i, i_29_);
	}

	static final boolean method473(int i, int i_30_) {
		return (i & 0x70000) != 0 | method445(i, i_30_) || method457(i, i_30_);
	}

	static final boolean method474(int i, int i_31_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method475(int i, int i_32_) {
		return (i & 0x800) != 0 && (i_32_ & 0x37) != 0;
	}

	static final boolean method476(int i, int i_33_) {
		return method450(i, i_33_) & method455(i, i_33_);
	}

	Class38() throws Throwable {
		throw new Error();
	}
}
