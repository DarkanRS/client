/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66 {
	Class229 aClass229_674 = new Class229(256);
	Interface22 anInterface22_675;
	Class505_Sub2 aClass505_Sub2_676;

	Class66(Class505_Sub2 class505_sub2, Interface22 interface22) {
		((Class66) this).aClass505_Sub2_676 = class505_sub2;
		((Class66) this).anInterface22_675 = interface22;
	}

	Interface6 method1276(int i, int i_0_) {
		long l = (long) (i_0_ << 16 | i);
		Object object = ((Class66) this).aClass229_674.method3865(l);
		if (object != null)
			return (Interface6) object;
		if (!((Class66) this).anInterface22_675.method139(i, -186930877))
			return null;
		Class169 class169 = ((Class66) this).anInterface22_675.method144(i, -1888091298);
		if (i_0_ == -1)
			i_0_ = (class169.aBool2065 ? 64 : (((Class505_Sub2) ((Class66) this).aClass505_Sub2_676).anInt8821));
		Interface6 interface6;
		if (!class169.aBool2089 || !((Class66) this).aClass505_Sub2_676.method8471()) {
			int[] is;
			if (class169.anInt2074 * 1960017665 == 2 || !Class282_Sub41.method13367(class169.aByte2064, (short) 26936))
				is = ((Class66) this).anInterface22_675.method141(i, 0.7F, i_0_, i_0_, false, -1625863057);
			else
				is = ((Class66) this).anInterface22_675.method140(i, 0.7F, i_0_, i_0_, true, (byte) 105);
			interface6 = ((Class66) this).aClass505_Sub2_676.method14024(i_0_, i_0_, true, is);
		} else {
			float[] fs = ((Class66) this).anInterface22_675.method145(i, 0.7F, i_0_, i_0_, false, -1102656224);
			interface6 = (((Class66) this).aClass505_Sub2_676.method13958(Class150.aClass150_1949, i_0_, i_0_, true, fs));
		}
		interface6.method50(class169.aBool2086, class169.aBool2059);
		((Class66) this).aClass229_674.method3856(interface6, l);
		return interface6;
	}

	Interface6 method1277(int i, int i_1_) {
		long l = (long) (i_1_ << 16 | i);
		Object object = ((Class66) this).aClass229_674.method3865(l);
		if (object != null)
			return (Interface6) object;
		if (!((Class66) this).anInterface22_675.method139(i, -1820036483))
			return null;
		Class169 class169 = ((Class66) this).anInterface22_675.method144(i, -1825061587);
		if (i_1_ == -1)
			i_1_ = (class169.aBool2065 ? 64 : (((Class505_Sub2) ((Class66) this).aClass505_Sub2_676).anInt8821));
		Interface6 interface6;
		if (!class169.aBool2089 || !((Class66) this).aClass505_Sub2_676.method8471()) {
			int[] is;
			if (class169.anInt2074 * 1960017665 == 2 || !Class282_Sub41.method13367(class169.aByte2064, (short) 10824))
				is = ((Class66) this).anInterface22_675.method141(i, 0.7F, i_1_, i_1_, false, 1385198087);
			else
				is = ((Class66) this).anInterface22_675.method140(i, 0.7F, i_1_, i_1_, true, (byte) 124);
			interface6 = ((Class66) this).aClass505_Sub2_676.method14024(i_1_, i_1_, true, is);
		} else {
			float[] fs = ((Class66) this).anInterface22_675.method145(i, 0.7F, i_1_, i_1_, false, -1102656224);
			interface6 = (((Class66) this).aClass505_Sub2_676.method13958(Class150.aClass150_1949, i_1_, i_1_, true, fs));
		}
		interface6.method50(class169.aBool2086, class169.aBool2059);
		((Class66) this).aClass229_674.method3856(interface6, l);
		return interface6;
	}

	void method1278() {
		((Class66) this).aClass229_674.method3858(5, (byte) -10);
	}

	void method1279() {
		((Class66) this).aClass229_674.method3859(-906241221);
	}

	Interface6 method1280(int i) {
		return method1277(i, -1);
	}

	Interface6 method1281(int i) {
		return method1277(i, -1);
	}

	Interface6 method1282(int i) {
		return method1277(i, -1);
	}

	Interface6 method1283(int i) {
		return method1277(i, -1);
	}
}
