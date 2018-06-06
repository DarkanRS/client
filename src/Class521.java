/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521 {
	Class305 aClass305_5936 = new Class305();
	Class305 aClass305_5937 = new Class305();
	boolean aBool5938 = true;
	Class305 aClass305_5939 = new Class305();
	Class521 aClass521_5940;
	Matrix44Var aClass294_5941;
	boolean aBool5942;
	Class521 aClass521_5943;
	Class521 aClass521_5944;
	boolean aBool5945 = true;

	public final void method11164() {
		if (((Class521) this).aClass521_5943 != null) {
			Class521 class521_0_ = ((Class521) ((Class521) this).aClass521_5943).aClass521_5944;
			if (class521_0_ == this)
				((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5940;
			else {
				for (/**/; ((Class521) class521_0_).aClass521_5940 != this; class521_0_ = ((Class521) class521_0_).aClass521_5940) {
					/* empty */
				}
				((Class521) class521_0_).aClass521_5940 = ((Class521) this).aClass521_5940;
			}
		}
		method11174();
		if (((Class521) this).aClass521_5944 != null) {
			((Class521) this).aClass521_5944.method11188();
			Class521 class521_1_ = ((Class521) this).aClass521_5944;
			for (;;) {
				((Class521) class521_1_).aClass305_5936.method5414(((Class521) this).aClass305_5936);
				((Class521) class521_1_).aClass521_5943 = ((Class521) this).aClass521_5943;
				if (((Class521) class521_1_).aClass521_5940 == null) {
					((Class521) class521_1_).aClass521_5940 = (((Class521) ((Class521) this).aClass521_5943).aClass521_5944);
					break;
				}
				class521_1_ = ((Class521) class521_1_).aClass521_5940;
			}
			((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5944;
		}
		((Class521) this).aClass521_5943 = null;
		((Class521) this).aClass521_5940 = null;
		((Class521) this).aClass521_5944 = null;
	}

	public final Class305 method11165() {
		return ((Class521) this).aClass305_5936;
	}

	public final Class305 method11166() {
		if (((Class521) this).aBool5938) {
			((Class521) this).aBool5938 = false;
			if (((Class521) this).aClass521_5943 != null) {
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
				((Class521) this).aClass305_5937.method5414(((Class521) this).aClass521_5943.method11166());
			} else
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
		}
		return ((Class521) this).aClass305_5937;
	}

	final Class305 method11167() {
		if (((Class521) this).aBool5945) {
			((Class521) this).aBool5945 = false;
			((Class521) this).aClass305_5939.method5411(method11166());
			((Class521) this).aClass305_5939.method5413();
		}
		return ((Class521) this).aClass305_5937;
	}

	final Matrix44Var method11168() {
		if (((Class521) this).aBool5942) {
			((Class521) this).aBool5942 = false;
			((Class521) this).aClass294_5941.method5279(method11166());
		}
		return ((Class521) this).aClass294_5941;
	}

	final void method11169(Class305 class305) {
		if (((Class521) this).aClass521_5943 != null) {
			Class305 class305_2_ = new Class305(class305);
			class305_2_.method5414(((Class521) this).aClass521_5943.method11167());
			method11175(class305_2_);
		} else
			method11175(class305);
	}

	public final void method11170(float f, float f_3_, float f_4_) {
		((Class521) this).aClass305_5936.aClass385_3595.set(f, f_3_, f_4_);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final void method11171(Vector3 class385) {
		((Class521) this).aClass305_5936.aClass385_3595.copy(class385);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final void method11172(float f, float f_5_, float f_6_) {
		((Class521) this).aClass305_5936.aClass385_3595.set(f, f_5_, f_6_);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final Class305 method11173() {
		if (((Class521) this).aBool5938) {
			((Class521) this).aBool5938 = false;
			if (((Class521) this).aClass521_5943 != null) {
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
				((Class521) this).aClass305_5937.method5414(((Class521) this).aClass521_5943.method11166());
			} else
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
		}
		return ((Class521) this).aClass305_5937;
	}

	final void method11174() {
		((Class521) this).aBool5938 = true;
		((Class521) this).aBool5945 = true;
		((Class521) this).aBool5942 = true;
	}

	final void method11175(Class305 class305) {
		((Class521) this).aClass305_5936.method5411(class305);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final void method11176() {
		if (((Class521) this).aClass521_5943 != null) {
			Class521 class521_7_ = ((Class521) ((Class521) this).aClass521_5943).aClass521_5944;
			if (class521_7_ == this)
				((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5940;
			else {
				for (/**/; ((Class521) class521_7_).aClass521_5940 != this; class521_7_ = ((Class521) class521_7_).aClass521_5940) {
					/* empty */
				}
				((Class521) class521_7_).aClass521_5940 = ((Class521) this).aClass521_5940;
			}
		}
		method11174();
		if (((Class521) this).aClass521_5944 != null) {
			((Class521) this).aClass521_5944.method11188();
			Class521 class521_8_ = ((Class521) this).aClass521_5944;
			for (;;) {
				((Class521) class521_8_).aClass305_5936.method5414(((Class521) this).aClass305_5936);
				((Class521) class521_8_).aClass521_5943 = ((Class521) this).aClass521_5943;
				if (((Class521) class521_8_).aClass521_5940 == null) {
					((Class521) class521_8_).aClass521_5940 = (((Class521) ((Class521) this).aClass521_5943).aClass521_5944);
					break;
				}
				class521_8_ = ((Class521) class521_8_).aClass521_5940;
			}
			((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5944;
		}
		((Class521) this).aClass521_5943 = null;
		((Class521) this).aClass521_5940 = null;
		((Class521) this).aClass521_5944 = null;
	}

	public final Class305 method11177() {
		return ((Class521) this).aClass305_5936;
	}

	public final Class305 method11178() {
		return ((Class521) this).aClass305_5936;
	}

	public final void method11179(Vector3 class385) {
		((Class521) this).aClass305_5936.aClass385_3595.copy(class385);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final Class305 method11180() {
		if (((Class521) this).aBool5938) {
			((Class521) this).aBool5938 = false;
			if (((Class521) this).aClass521_5943 != null) {
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
				((Class521) this).aClass305_5937.method5414(((Class521) this).aClass521_5943.method11166());
			} else
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
		}
		return ((Class521) this).aClass305_5937;
	}

	public final Class305 method11181() {
		if (((Class521) this).aBool5938) {
			((Class521) this).aBool5938 = false;
			if (((Class521) this).aClass521_5943 != null) {
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
				((Class521) this).aClass305_5937.method5414(((Class521) this).aClass521_5943.method11166());
			} else
				((Class521) this).aClass305_5937.method5411(((Class521) this).aClass305_5936);
		}
		return ((Class521) this).aClass305_5937;
	}

	final Class305 method11182() {
		if (((Class521) this).aBool5945) {
			((Class521) this).aBool5945 = false;
			((Class521) this).aClass305_5939.method5411(method11166());
			((Class521) this).aClass305_5939.method5413();
		}
		return ((Class521) this).aClass305_5937;
	}

	final Class305 method11183() {
		if (((Class521) this).aBool5945) {
			((Class521) this).aBool5945 = false;
			((Class521) this).aClass305_5939.method5411(method11166());
			((Class521) this).aClass305_5939.method5413();
		}
		return ((Class521) this).aClass305_5937;
	}

	final Class305 method11184() {
		if (((Class521) this).aBool5945) {
			((Class521) this).aBool5945 = false;
			((Class521) this).aClass305_5939.method5411(method11166());
			((Class521) this).aClass305_5939.method5413();
		}
		return ((Class521) this).aClass305_5937;
	}

	final void method11185(Class305 class305) {
		((Class521) this).aClass305_5936.method5411(class305);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final void method11186() {
		if (((Class521) this).aClass521_5943 != null) {
			Class521 class521_9_ = ((Class521) ((Class521) this).aClass521_5943).aClass521_5944;
			if (class521_9_ == this)
				((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5940;
			else {
				for (/**/; ((Class521) class521_9_).aClass521_5940 != this; class521_9_ = ((Class521) class521_9_).aClass521_5940) {
					/* empty */
				}
				((Class521) class521_9_).aClass521_5940 = ((Class521) this).aClass521_5940;
			}
		}
		method11174();
		if (((Class521) this).aClass521_5944 != null) {
			((Class521) this).aClass521_5944.method11188();
			Class521 class521_10_ = ((Class521) this).aClass521_5944;
			for (;;) {
				((Class521) class521_10_).aClass305_5936.method5414(((Class521) this).aClass305_5936);
				((Class521) class521_10_).aClass521_5943 = ((Class521) this).aClass521_5943;
				if (((Class521) class521_10_).aClass521_5940 == null) {
					((Class521) class521_10_).aClass521_5940 = (((Class521) ((Class521) this).aClass521_5943).aClass521_5944);
					break;
				}
				class521_10_ = ((Class521) class521_10_).aClass521_5940;
			}
			((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5944;
		}
		((Class521) this).aClass521_5943 = null;
		((Class521) this).aClass521_5940 = null;
		((Class521) this).aClass521_5944 = null;
	}

	public final void method11187(Quaternion class381) {
		((Class521) this).aClass305_5936.aClass381_3594.copy(class381);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	final void method11188() {
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
		if (((Class521) this).aClass521_5940 != null)
			((Class521) this).aClass521_5940.method11188();
	}

	public final void method11189(Vector3 class385) {
		((Class521) this).aClass305_5936.aClass385_3595.copy(class385);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	Class521() {
		new Matrix44Arr();
		new Matrix44Arr();
		((Class521) this).aClass294_5941 = new Matrix44Var();
		((Class521) this).aBool5942 = true;
		((Class521) this).aClass521_5943 = null;
		((Class521) this).aClass521_5944 = null;
		((Class521) this).aClass521_5940 = null;
	}

	public final void method11190(Vector3 class385) {
		((Class521) this).aClass305_5936.aClass385_3595.copy(class385);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	final void method11191(Class305 class305) {
		if (((Class521) this).aClass521_5943 != null) {
			Class305 class305_11_ = new Class305(class305);
			class305_11_.method5414(((Class521) this).aClass521_5943.method11167());
			method11175(class305_11_);
		} else
			method11175(class305);
	}

	public final void method11192(Vector3 class385) {
		((Class521) this).aClass305_5936.aClass385_3595.copy(class385);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	final void method11193(Class305 class305) {
		if (((Class521) this).aClass521_5943 != null) {
			Class305 class305_12_ = new Class305(class305);
			class305_12_.method5414(((Class521) this).aClass521_5943.method11167());
			method11175(class305_12_);
		} else
			method11175(class305);
	}

	public final void method11194(Vector3 class385) {
		((Class521) this).aClass305_5936.aClass385_3595.copy(class385);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	final void method11195() {
		((Class521) this).aBool5938 = true;
		((Class521) this).aBool5945 = true;
		((Class521) this).aBool5942 = true;
	}

	final void method11196() {
		((Class521) this).aBool5938 = true;
		((Class521) this).aBool5945 = true;
		((Class521) this).aBool5942 = true;
	}

	final void method11197() {
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
		if (((Class521) this).aClass521_5940 != null)
			((Class521) this).aClass521_5940.method11188();
	}

	public final void method11198(Quaternion class381) {
		((Class521) this).aClass305_5936.aClass381_3594.copy(class381);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	final void method11199(Class305 class305) {
		((Class521) this).aClass305_5936.method5411(class305);
		method11174();
		if (((Class521) this).aClass521_5944 != null)
			((Class521) this).aClass521_5944.method11188();
	}

	public final void method11200() {
		if (((Class521) this).aClass521_5943 != null) {
			Class521 class521_13_ = ((Class521) ((Class521) this).aClass521_5943).aClass521_5944;
			if (class521_13_ == this)
				((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5940;
			else {
				for (/**/; ((Class521) class521_13_).aClass521_5940 != this; class521_13_ = ((Class521) class521_13_).aClass521_5940) {
					/* empty */
				}
				((Class521) class521_13_).aClass521_5940 = ((Class521) this).aClass521_5940;
			}
		}
		method11174();
		if (((Class521) this).aClass521_5944 != null) {
			((Class521) this).aClass521_5944.method11188();
			Class521 class521_14_ = ((Class521) this).aClass521_5944;
			for (;;) {
				((Class521) class521_14_).aClass305_5936.method5414(((Class521) this).aClass305_5936);
				((Class521) class521_14_).aClass521_5943 = ((Class521) this).aClass521_5943;
				if (((Class521) class521_14_).aClass521_5940 == null) {
					((Class521) class521_14_).aClass521_5940 = (((Class521) ((Class521) this).aClass521_5943).aClass521_5944);
					break;
				}
				class521_14_ = ((Class521) class521_14_).aClass521_5940;
			}
			((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5944;
		}
		((Class521) this).aClass521_5943 = null;
		((Class521) this).aClass521_5940 = null;
		((Class521) this).aClass521_5944 = null;
	}

	public final void method11201() {
		if (((Class521) this).aClass521_5943 != null) {
			Class521 class521_15_ = ((Class521) ((Class521) this).aClass521_5943).aClass521_5944;
			if (class521_15_ == this)
				((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5940;
			else {
				for (/**/; ((Class521) class521_15_).aClass521_5940 != this; class521_15_ = ((Class521) class521_15_).aClass521_5940) {
					/* empty */
				}
				((Class521) class521_15_).aClass521_5940 = ((Class521) this).aClass521_5940;
			}
		}
		method11174();
		if (((Class521) this).aClass521_5944 != null) {
			((Class521) this).aClass521_5944.method11188();
			Class521 class521_16_ = ((Class521) this).aClass521_5944;
			for (;;) {
				((Class521) class521_16_).aClass305_5936.method5414(((Class521) this).aClass305_5936);
				((Class521) class521_16_).aClass521_5943 = ((Class521) this).aClass521_5943;
				if (((Class521) class521_16_).aClass521_5940 == null) {
					((Class521) class521_16_).aClass521_5940 = (((Class521) ((Class521) this).aClass521_5943).aClass521_5944);
					break;
				}
				class521_16_ = ((Class521) class521_16_).aClass521_5940;
			}
			((Class521) ((Class521) this).aClass521_5943).aClass521_5944 = ((Class521) this).aClass521_5944;
		}
		((Class521) this).aClass521_5943 = null;
		((Class521) this).aClass521_5940 = null;
		((Class521) this).aClass521_5944 = null;
	}
}
