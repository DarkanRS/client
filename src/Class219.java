/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class219 {
	static Index aClass317_2710;
	public int anInt2711;
	public int anInt2712;
	public int anInt2713;
	
	public String method3711() {
		return new StringBuilder().append(298538453 * anInt2713).append(",").append(1948093437 * anInt2711 >> 6).append(",").append(-1002240017 * anInt2712 >> 6).append(",").append(1948093437 * anInt2711 & 0x3f).append(",").append(anInt2712 * -1002240017 & 0x3f).toString();
	}

	public String toString() {
		return new StringBuilder().append(298538453 * anInt2713).append(",").append(1948093437 * anInt2711 >> 6).append(",").append(-1002240017 * anInt2712 >> 6).append(",").append(1948093437 * anInt2711 & 0x3f).append(",").append(anInt2712 * -1002240017 & 0x3f).toString();
	}

	public Class219(int i) {
		if (-1 == i)
			anInt2713 = -867384189;
		else {
			anInt2713 = (i >> 28 & 0x3) * 867384189;
			anInt2711 = (i >> 14 & 0x3fff) * 1013524821;
			anInt2712 = -2816241 * (i & 0x3fff);
		}
	}

	public String method3712() {
		return new StringBuilder().append(298538453 * anInt2713).append(",").append(1948093437 * anInt2711 >> 6).append(",").append(-1002240017 * anInt2712 >> 6).append(",").append(1948093437 * anInt2711 & 0x3f).append(",").append(anInt2712 * -1002240017 & 0x3f).toString();
	}

	public Class219() {
		anInt2713 = -867384189;
	}

	public Class219(int i, int i_0_, int i_1_) {
		anInt2713 = i * 867384189;
		anInt2711 = 1013524821 * i_0_;
		anInt2712 = i_1_ * -2816241;
	}

	static final void method3713(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method7785(i_2_, 618850580);
	}

	static final void method3714(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		int i_3_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_4_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_5_ = (((CS2Executor) class527).intStack[2 + 1942118537 * ((CS2Executor) class527).anInt7012]);
		Class96_Sub10.method14603(8, i_3_ << 16 | i_4_, i_5_, "", (byte) 81);
	}
}
