/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CoordGrid {
	static Index aClass317_2710;
	public int x;
	public int y;
	public int level;

	public String toString() {
		return new StringBuilder().append(298538453 * level).append(",").append(1948093437 * x >> 6).append(",").append(-1002240017 * y >> 6).append(",").append(1948093437 * x & 0x3f).append(",").append(y * -1002240017 & 0x3f).toString();
	}

	public CoordGrid(int i) {
		if (-1 == i)
			level = -867384189;
		else {
			level = (i >> 28 & 0x3) * 867384189;
			x = (i >> 14 & 0x3fff) * 1013524821;
			y = -2816241 * (i & 0x3fff);
		}
	}

	public CoordGrid() {
		level = -867384189;
	}

	public CoordGrid(int i, int i_0_, int i_1_) {
		level = i * 867384189;
		x = 1013524821 * i_0_;
		y = i_1_ * -2816241;
	}

	static final void method3713(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method7785(i_2_, 618850580);
	}

	static final void method3714(CS2Executor class527, int i) {
		class527.anInt7012 -= 425673003;
		int i_3_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_4_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_5_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class96_Sub10.method14603(8, i_3_ << 16 | i_4_, i_5_, "", (byte) 81);
	}
}
