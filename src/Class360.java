
/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IUnknown;

public abstract class Class360 implements Interface7 {
	Class76 aClass76_4164;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_4165;
	boolean aBool4166;
	Class150 aClass150_4167;
	long aLong4168 = 0L;

	public void method202(Class35 class35) {
		/* empty */
	}

	long method6245() {
		return ((Class360) this).aLong4168;
	}

	public void method205(Class35 class35) {
		/* empty */
	}

	public void method26() {
		if (((Class360) this).aLong4168 != 0L) {
			IUnknown.Release(((Class360) this).aLong4168);
			((Class360) this).aLong4168 = 0L;
		}
		((Class360) this).aClass505_Sub2_Sub2_4165.method13885(this);
	}

	void method6246() {
		if (((Class360) this).aLong4168 != 0L) {
			((Class360) this).aClass505_Sub2_Sub2_4165.method15650(((Class360) this).aLong4168);
			((Class360) this).aLong4168 = 0L;
		}
	}

	Class360(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, Class76 class76, boolean bool, int i) {
		((Class360) this).aClass505_Sub2_Sub2_4165 = class505_sub2_sub2;
		((Class360) this).aClass150_4167 = class150;
		((Class360) this).aClass76_4164 = class76;
		((Class360) this).aBool4166 = bool;
		((Class360) this).aClass505_Sub2_Sub2_4165.method13901(this);
	}

	public void method32() {
		if (((Class360) this).aLong4168 != 0L) {
			IUnknown.Release(((Class360) this).aLong4168);
			((Class360) this).aLong4168 = 0L;
		}
		((Class360) this).aClass505_Sub2_Sub2_4165.method13885(this);
	}

	public void method206(Class35 class35) {
		/* empty */
	}

	void method6247() {
		method6246();
	}

	public void finalize() {
		method6246();
	}

	public void method204(Class35 class35) {
		/* empty */
	}

	void method6248() {
		method6246();
	}

	public void method201(Class35 class35) {
		/* empty */
	}

	long method6249() {
		return ((Class360) this).aLong4168;
	}

	void method6250() {
		if (((Class360) this).aLong4168 != 0L) {
			((Class360) this).aClass505_Sub2_Sub2_4165.method15650(((Class360) this).aLong4168);
			((Class360) this).aLong4168 = 0L;
		}
	}

	void method6251() {
		if (((Class360) this).aLong4168 != 0L) {
			((Class360) this).aClass505_Sub2_Sub2_4165.method15650(((Class360) this).aLong4168);
			((Class360) this).aLong4168 = 0L;
		}
	}
}
