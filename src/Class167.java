/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class167 {
	Class505_Sub1 aClass505_Sub1_2042;
	Interface22 anInterface22_2043;
	SoftCache aClass229_2044 = new SoftCache(256);

	Class137_Sub1 method2857(int i, int i_0_) {
		Object object = ((Class167) this).aClass229_2044.method3865((long) i);
		if (object != null)
			return (Class137_Sub1) object;
		if (!((Class167) this).anInterface22_2043.method139(i, -1358664924))
			return null;
		Class169 class169 = ((Class167) this).anInterface22_2043.method144(i, -2078681696);
		if (i_0_ == -1)
			i_0_ = (class169.aBool2065 ? 64 : (((Class505_Sub1) ((Class167) this).aClass505_Sub1_2042).anInt8349));
		Class137_Sub1 class137_sub1;
		if (!class169.aBool2089 || !((Class167) this).aClass505_Sub1_2042.method8471()) {
			int[] is;
			if (class169.anInt2074 * 1960017665 == 2 || !Class282_Sub41.method13367(class169.aByte2064, (short) 8231))
				is = ((Class167) this).anInterface22_2043.method141(i, 0.7F, i_0_, i_0_, false, 1544969950);
			else
				is = ((Class167) this).anInterface22_2043.method140(i, 0.7F, i_0_, i_0_, true, (byte) 47);
			class137_sub1 = new Class137_Sub1(((Class167) this).aClass505_Sub1_2042, 3553, i_0_, i_0_, class169.aByte2088 != 0, is, 0, 0, false);
		} else {
			float[] fs = ((Class167) this).anInterface22_2043.method145(i, 0.7F, i_0_, i_0_, false, -1102656224);
			class137_sub1 = new Class137_Sub1(((Class167) this).aClass505_Sub1_2042, 3553, Class150.aClass150_1949, Class76.aClass76_755, i_0_, i_0_, class169.aByte2088 != 0, fs, Class150.aClass150_1949);
		}
		class137_sub1.method14445(class169.aBool2086, class169.aBool2059);
		((Class167) this).aClass229_2044.put(class137_sub1, (long) i);
		return class137_sub1;
	}

	Class137_Sub1 method2858(int i) {
		return method2857(i, -1);
	}

	Class137_Sub1 method2859(int i, int i_1_) {
		Object object = ((Class167) this).aClass229_2044.method3865((long) i);
		if (object != null)
			return (Class137_Sub1) object;
		if (!((Class167) this).anInterface22_2043.method139(i, -1949668054))
			return null;
		Class169 class169 = ((Class167) this).anInterface22_2043.method144(i, -1823334335);
		if (i_1_ == -1)
			i_1_ = (class169.aBool2065 ? 64 : (((Class505_Sub1) ((Class167) this).aClass505_Sub1_2042).anInt8349));
		Class137_Sub1 class137_sub1;
		if (!class169.aBool2089 || !((Class167) this).aClass505_Sub1_2042.method8471()) {
			int[] is;
			if (class169.anInt2074 * 1960017665 == 2 || !Class282_Sub41.method13367(class169.aByte2064, (short) 30782))
				is = ((Class167) this).anInterface22_2043.method141(i, 0.7F, i_1_, i_1_, false, 1691794786);
			else
				is = ((Class167) this).anInterface22_2043.method140(i, 0.7F, i_1_, i_1_, true, (byte) 126);
			class137_sub1 = new Class137_Sub1(((Class167) this).aClass505_Sub1_2042, 3553, i_1_, i_1_, class169.aByte2088 != 0, is, 0, 0, false);
		} else {
			float[] fs = ((Class167) this).anInterface22_2043.method145(i, 0.7F, i_1_, i_1_, false, -1102656224);
			class137_sub1 = new Class137_Sub1(((Class167) this).aClass505_Sub1_2042, 3553, Class150.aClass150_1949, Class76.aClass76_755, i_1_, i_1_, class169.aByte2088 != 0, fs, Class150.aClass150_1949);
		}
		class137_sub1.method14445(class169.aBool2086, class169.aBool2059);
		((Class167) this).aClass229_2044.put(class137_sub1, (long) i);
		return class137_sub1;
	}

	void method2860() {
		((Class167) this).aClass229_2044.method3858(5, (byte) 49);
	}

	void method2861() {
		((Class167) this).aClass229_2044.method3859(355316582);
	}

	void method2862() {
		((Class167) this).aClass229_2044.method3859(-2145235832);
	}

	void method2863() {
		((Class167) this).aClass229_2044.method3858(5, (byte) 25);
	}

	void method2864() {
		((Class167) this).aClass229_2044.method3859(-882988465);
	}

	Class167(Class505_Sub1 class505_sub1, Interface22 interface22) {
		((Class167) this).aClass505_Sub1_2042 = class505_sub1;
		((Class167) this).anInterface22_2043 = interface22;
	}
}
