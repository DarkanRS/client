/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365 {
	Class365 aClass365_3956;
	Class235 aClass235_3957;
	Class235 aClass235_3958 = new Class235();
	Class235 aClass235_3959;
	boolean aBoolean3960;
	boolean aBoolean3961;
	Matrix3f aClass222_3962;
	Class365 aClass365_3963;
	boolean aBoolean3964;
	Class365 aClass365_3965;

	public final Class235 method4337() {
		if (((Class365) this).aBoolean3964) {
			((Class365) this).aBoolean3964 = false;
			if (((Class365) this).aClass365_3963 != null) {
				((Class365) this).aClass235_3957.method2186(((Class365) this).aClass235_3958);
				((Class365) this).aClass235_3957.method2187(((Class365) this).aClass365_3963.method4337());
			} else
				((Class365) this).aClass235_3957.method2186(((Class365) this).aClass235_3958);
		}
		return ((Class365) this).aClass235_3957;
	}

	final Class235 method4338() {
		if (((Class365) this).aBoolean3960) {
			((Class365) this).aBoolean3960 = false;
			((Class365) this).aClass235_3959.method2186(method4337());
			((Class365) this).aClass235_3959.method2185();
		}
		return ((Class365) this).aClass235_3957;
	}

	final void method4339(Class235 class235) {
		if (((Class365) this).aClass365_3963 != null) {
			Class235 class235_0_ = new Class235(class235);
			class235_0_.method2187(((Class365) this).aClass365_3963.method4338());
			method4348(class235_0_);
		} else
			method4348(class235);
	}

	public final void method4340(Class217 class217) {
		((Class365) this).aClass235_3958.aClass217_2599.method2013(class217);
		method4344();
		if (((Class365) this).aClass365_3956 != null)
			((Class365) this).aClass365_3956.method4342();
	}

	public final void method4341(float f, float f_1_, float f_2_) {
		((Class365) this).aClass235_3958.aClass217_2599.method2007(f, f_1_, f_2_);
		method4344();
		if (((Class365) this).aClass365_3956 != null)
			((Class365) this).aClass365_3956.method4342();
	}

	final void method4342() {
		method4344();
		if (((Class365) this).aClass365_3956 != null)
			((Class365) this).aClass365_3956.method4342();
		if (((Class365) this).aClass365_3965 != null)
			((Class365) this).aClass365_3965.method4342();
	}

	public final Class235 method4343() {
		return ((Class365) this).aClass235_3958;
	}

	final void method4344() {
		((Class365) this).aBoolean3964 = true;
		((Class365) this).aBoolean3960 = true;
		((Class365) this).aBoolean3961 = true;
	}

	public final void method4345() {
		if (((Class365) this).aClass365_3963 != null) {
			Class365 class365_3_ = ((Class365) ((Class365) this).aClass365_3963).aClass365_3956;
			if (class365_3_ == this)
				((Class365) ((Class365) this).aClass365_3963).aClass365_3956 = ((Class365) this).aClass365_3965;
			else {
				for (/**/; ((Class365) class365_3_).aClass365_3965 != this; class365_3_ = ((Class365) class365_3_).aClass365_3965) {
					/* empty */
				}
				((Class365) class365_3_).aClass365_3965 = ((Class365) this).aClass365_3965;
			}
		}
		method4344();
		if (((Class365) this).aClass365_3956 != null) {
			((Class365) this).aClass365_3956.method4342();
			Class365 class365_4_ = ((Class365) this).aClass365_3956;
			for (;;) {
				((Class365) class365_4_).aClass235_3958.method2187(((Class365) this).aClass235_3958);
				((Class365) class365_4_).aClass365_3963 = ((Class365) this).aClass365_3963;
				if (((Class365) class365_4_).aClass365_3965 == null) {
					((Class365) class365_4_).aClass365_3965 = (((Class365) ((Class365) this).aClass365_3963).aClass365_3956);
					break;
				}
				class365_4_ = ((Class365) class365_4_).aClass365_3965;
			}
			((Class365) ((Class365) this).aClass365_3963).aClass365_3956 = ((Class365) this).aClass365_3956;
		}
		((Class365) this).aClass365_3963 = null;
		((Class365) this).aClass365_3965 = null;
		((Class365) this).aClass365_3956 = null;
	}

	public final void method4346(Class218 class218) {
		((Class365) this).aClass235_3958.aClass218_2600.method2022(class218);
		method4344();
		if (((Class365) this).aClass365_3956 != null)
			((Class365) this).aClass365_3956.method4342();
	}

	final Matrix3f method4347() {
		if (((Class365) this).aBoolean3961) {
			((Class365) this).aBoolean3961 = false;
			((Class365) this).aClass222_3962.method2076(method4337());
		}
		return ((Class365) this).aClass222_3962;
	}

	Class365() {
		((Class365) this).aClass235_3957 = new Class235();
		((Class365) this).aBoolean3964 = true;
		((Class365) this).aClass235_3959 = new Class235();
		((Class365) this).aBoolean3960 = true;
		new Matrix4f();
		new Matrix4f();
		((Class365) this).aClass222_3962 = new Matrix3f();
		((Class365) this).aBoolean3961 = true;
		((Class365) this).aClass365_3963 = null;
		((Class365) this).aClass365_3956 = null;
		((Class365) this).aClass365_3965 = null;
	}

	final void method4348(Class235 class235) {
		((Class365) this).aClass235_3958.method2186(class235);
		method4344();
		if (((Class365) this).aClass365_3956 != null)
			((Class365) this).aClass365_3956.method4342();
	}
}
