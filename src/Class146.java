/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class146 {
	Class141_Sub4 aClass141_Sub4_1715;
	int anInt1716 = 0;
	int anInt1717 = 0;
	int anInt1718 = 0;
	Class505_Sub1 aClass505_Sub1_1719;
	Class136 aClass136_1720;
	Class141[] aClass141Array1721;

	void method2460(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= ((Class146) this).aClass505_Sub1_1719.method13704();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class146) this).anInt1718 != i) {
			if (((Class146) this).anInt1718 != 0)
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2398();
			if (i != 0) {
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2397(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2408(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2399(i_0_, i_1_);
			}
			((Class146) this).anInt1718 = i;
			((Class146) this).anInt1716 = i_0_;
			((Class146) this).anInt1717 = i_1_;
		} else if (((Class146) this).anInt1718 != 0) {
			((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2408(bool);
			if (((Class146) this).anInt1716 != i_0_ || ((Class146) this).anInt1717 != i_1_) {
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2399(i_0_, i_1_);
				((Class146) this).anInt1716 = i_0_;
				((Class146) this).anInt1717 = i_1_;
			}
		}
	}

	boolean method2461(int i) {
		return ((Class146) this).aClass141Array1721[i].method2395();
	}

	void method2462(int i, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		bool_5_ &= ((Class146) this).aClass505_Sub1_1719.method13704();
		if (!bool_5_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_4_ = i_3_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class146) this).anInt1718 != i) {
			if (((Class146) this).anInt1718 != 0)
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2398();
			if (i != 0) {
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2397(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2408(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2399(i_3_, i_4_);
			}
			((Class146) this).anInt1718 = i;
			((Class146) this).anInt1716 = i_3_;
			((Class146) this).anInt1717 = i_4_;
		} else if (((Class146) this).anInt1718 != 0) {
			((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2408(bool);
			if (((Class146) this).anInt1716 != i_3_ || ((Class146) this).anInt1717 != i_4_) {
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2399(i_3_, i_4_);
				((Class146) this).anInt1716 = i_3_;
				((Class146) this).anInt1717 = i_4_;
			}
		}
	}

	boolean method2463(Class137 class137, int i) {
		if (((Class146) this).anInt1718 == 0)
			return false;
		((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2400(class137, i);
		return true;
	}

	boolean method2464(int i) {
		return ((Class146) this).aClass141Array1721[i].method2395();
	}

	boolean method2465(int i) {
		return ((Class146) this).aClass141Array1721[i].method2395();
	}

	Class146(Class505_Sub1 class505_sub1) {
		((Class146) this).aClass505_Sub1_1719 = class505_sub1;
		((Class146) this).aClass136_1720 = new Class136(class505_sub1);
		((Class146) this).aClass141Array1721 = new Class141[16];
		((Class146) this).aClass141Array1721[1] = new Class141_Sub1(class505_sub1);
		((Class146) this).aClass141Array1721[2] = new Class141_Sub9(class505_sub1, ((Class146) this).aClass136_1720);
		((Class146) this).aClass141Array1721[4] = new Class141_Sub3(class505_sub1, ((Class146) this).aClass136_1720);
		((Class146) this).aClass141Array1721[5] = new Class141_Sub5(class505_sub1, ((Class146) this).aClass136_1720);
		((Class146) this).aClass141Array1721[6] = new Class141_Sub6(class505_sub1);
		((Class146) this).aClass141Array1721[7] = new Class141_Sub7(class505_sub1);
		((Class146) this).aClass141Array1721[3] = ((Class146) this).aClass141_Sub4_1715 = new Class141_Sub4(class505_sub1);
		((Class146) this).aClass141Array1721[8] = new Class141_Sub2(class505_sub1, ((Class146) this).aClass136_1720);
		((Class146) this).aClass141Array1721[9] = new Class141_Sub8(class505_sub1, ((Class146) this).aClass136_1720);
		if (!((Class146) this).aClass141Array1721[8].method2395())
			((Class146) this).aClass141Array1721[8] = ((Class146) this).aClass141Array1721[4];
		if (!((Class146) this).aClass141Array1721[9].method2395())
			((Class146) this).aClass141Array1721[9] = ((Class146) this).aClass141Array1721[8];
	}

	boolean method2466(int i) {
		return ((Class146) this).aClass141Array1721[i].method2395();
	}

	void method2467(int i, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
		bool_8_ &= ((Class146) this).aClass505_Sub1_1719.method13704();
		if (!bool_8_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_7_ = i_6_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class146) this).anInt1718 != i) {
			if (((Class146) this).anInt1718 != 0)
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2398();
			if (i != 0) {
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2397(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2408(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2399(i_6_, i_7_);
			}
			((Class146) this).anInt1718 = i;
			((Class146) this).anInt1716 = i_6_;
			((Class146) this).anInt1717 = i_7_;
		} else if (((Class146) this).anInt1718 != 0) {
			((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2408(bool);
			if (((Class146) this).anInt1716 != i_6_ || ((Class146) this).anInt1717 != i_7_) {
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2399(i_6_, i_7_);
				((Class146) this).anInt1716 = i_6_;
				((Class146) this).anInt1717 = i_7_;
			}
		}
	}

	void method2468(int i, int i_9_, int i_10_, boolean bool, boolean bool_11_) {
		bool_11_ &= ((Class146) this).aClass505_Sub1_1719.method13704();
		if (!bool_11_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_10_ = i_9_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class146) this).anInt1718 != i) {
			if (((Class146) this).anInt1718 != 0)
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2398();
			if (i != 0) {
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2397(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2408(bool);
				((Class146) this).aClass141Array1721[i & 0x7fffffff].method2399(i_9_, i_10_);
			}
			((Class146) this).anInt1718 = i;
			((Class146) this).anInt1716 = i_9_;
			((Class146) this).anInt1717 = i_10_;
		} else if (((Class146) this).anInt1718 != 0) {
			((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2408(bool);
			if (((Class146) this).anInt1716 != i_9_ || ((Class146) this).anInt1717 != i_10_) {
				((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2399(i_9_, i_10_);
				((Class146) this).anInt1716 = i_9_;
				((Class146) this).anInt1717 = i_10_;
			}
		}
	}

	boolean method2469(Class137 class137, int i) {
		if (((Class146) this).anInt1718 == 0)
			return false;
		((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2400(class137, i);
		return true;
	}

	boolean method2470(Class137 class137, int i) {
		if (((Class146) this).anInt1718 == 0)
			return false;
		((Class146) this).aClass141Array1721[((Class146) this).anInt1718 & 0x7fffffff].method2400(class137, i);
		return true;
	}
}
