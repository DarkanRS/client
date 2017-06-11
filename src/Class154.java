/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class154 {
	static final boolean method1659(int i, int i_0_) {
		return (i & 0x21) != 0;
	}

	static final boolean method1660(int i, int i_1_) {
		return (i & 0x34) != 0;
	}

	static final boolean method1661(int i, int i_2_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method1662(int i, int i_3_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method1663(int i, int i_4_) {
		return (i & 0x100) != 0;
	}

	static final boolean method1664(int i, int i_5_) {
		return false;
	}

	static final boolean method1665(int i, int i_6_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method1666(int i, int i_7_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1667(int i, int i_8_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1668(int i, int i_9_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1669(int i, int i_10_) {
		return method1690(i, i_10_) & ((i & 0x2000) != 0 | method1661(i, i_10_) | method1684(i, i_10_));
	}

	static final boolean method1670(int i, int i_11_) {
		return (i & 0x22) != 0;
	}

	static final boolean method1671(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1672(int i, int i_13_) {
		return ((i & 0x70000) != 0 || method1659(i, i_13_) || method1685(i, i_13_));
	}

	static final boolean method1673(int i, int i_14_) {
		return ((i & 0x70000) != 0 || method1670(i, i_14_) || method1685(i, i_14_));
	}

	static final boolean method1674(int i, int i_15_) {
		return ((i & 0x70000) != 0 || method1660(i, i_15_) || method1685(i, i_15_));
	}

	static final boolean method1675(int i, int i_16_) {
		boolean bool = ((i_16_ & 0x37) != 0 ? method1669(i, i_16_) : method1680(i, i_16_));
		return (i & 0x10000) != 0 | method1661(i, i_16_) | bool;
	}

	static final boolean method1676(int i, int i_17_) {
		return method1664(i, i_17_) || method1692(i, i_17_);
	}

	static final boolean method1677(int i, int i_18_) {
		return (i & 0x180) != 0;
	}

	static final boolean method1678(int i, int i_19_) {
		return (i & 0x20) != 0;
	}

	static final boolean method1679(int i, int i_20_) {
		return (i & 0x400) != 0;
	}

	static final boolean method1680(int i, int i_21_) {
		if (!method1667(i, i_21_))
			return false;
		if ((i & 0x9000) != 0 | method1662(i, i_21_) | method1663(i, i_21_))
			return true;
		return (i_21_ & 0x37) == 0 & ((i & 0x2000) != 0 | method1661(i, i_21_) | method1684(i, i_21_));
	}

	static final boolean method1681(int i, int i_22_) {
		return (i & 0x800) != 0 | method1665(i, i_22_) || method1680(i, i_22_);
	}

	static final boolean method1682(int i, int i_23_) {
		return (i & 0x10) != 0;
	}

	static final boolean method1683(int i, int i_24_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1684(int i, int i_25_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method1685(int i, int i_26_) {
		return ((method1659(i, i_26_) | method1670(i, i_26_) | method1660(i, i_26_)) & method1671(i, i_26_));
	}

	static final boolean method1686(int i, int i_27_) {
		return method1682(i, i_27_) & method1668(i, i_27_);
	}

	static final boolean method1687(int i, int i_28_) {
		return ((i & 0x40000) != 0 | method1663(i, i_28_) || method1680(i, i_28_));
	}

	static final boolean method1688(int i, int i_29_) {
		return method1662(i, i_29_) || method1680(i, i_29_);
	}

	static final boolean method1689(int i, int i_30_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1690(int i, int i_31_) {
		return (i & 0x800) != 0 && (i_31_ & 0x37) != 0;
	}

	Class154() throws Throwable {
		throw new Error();
	}

	static final boolean method1691(int i, int i_32_) {
		return ((i & 0x60000) != 0 | method1682(i, i_32_) || method1686(i, i_32_));
	}

	static final boolean method1692(int i, int i_33_) {
		return method1664(i, i_33_) & method1683(i, i_33_);
	}
}
