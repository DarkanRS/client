/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
	Interface_ma anInterface_ma604;
	Class348 aClass348_605 = new Class348(256);
	Class_ra_Sub2 aClass_ra_Sub2_606;

	Class30_Sub2 method715(int i) {
		return method716(i, -1);
	}

	Class30_Sub2 method716(int i, int i_0_) {
		Object object = ((Class61) this).aClass348_605.method4184((long) i);
		if (object != null)
			return (Class30_Sub2) object;
		if (!((Class61) this).anInterface_ma604.method170(i, (short) 25920))
			return null;
		Class53 class53 = ((Class61) this).anInterface_ma604.method174(i, 107897040);
		if (i_0_ == -1)
			i_0_ = (class53.aBoolean518 ? 64 : (((Class_ra_Sub2) ((Class61) this).aClass_ra_Sub2_606).anInt8118));
		Class30_Sub2 class30_sub2;
		if (!class53.aBoolean543 || !((Class61) this).aClass_ra_Sub2_606.method5054()) {
			int[] is;
			if (class53.anInt528 * -2138060883 == 2 || !Class298_Sub32_Sub31.method3339(class53.aByte529, -769385379))
				is = ((Class61) this).anInterface_ma604.method172(i, 0.7F, i_0_, i_0_, false, (byte) 2);
			else
				is = ((Class61) this).anInterface_ma604.method171(i, 0.7F, i_0_, i_0_, true, 1090878298);
			class30_sub2 = new Class30_Sub2(((Class61) this).aClass_ra_Sub2_606, 3553, i_0_, i_0_, class53.aByte537 != 0, is, 0, 0, false);
		} else {
			float[] fs = ((Class61) this).anInterface_ma604.method181(i, 0.7F, i_0_, i_0_, false, (byte) -119);
			class30_sub2 = new Class30_Sub2(((Class61) this).aClass_ra_Sub2_606, 3553, Class55.aClass55_557, Class77.aClass77_714, i_0_, i_0_, class53.aByte537 != 0, fs, Class55.aClass55_557);
		}
		class30_sub2.method420(class53.aBoolean540, class53.aBoolean541);
		((Class61) this).aClass348_605.method4194(class30_sub2, (long) i);
		return class30_sub2;
	}

	void method717() {
		((Class61) this).aClass348_605.method4186(5, -56778652);
	}

	void method718() {
		((Class61) this).aClass348_605.method4187();
	}

	Class61(Class_ra_Sub2 class_ra_sub2, Interface_ma interface_ma) {
		((Class61) this).aClass_ra_Sub2_606 = class_ra_sub2;
		((Class61) this).anInterface_ma604 = interface_ma;
	}
}
