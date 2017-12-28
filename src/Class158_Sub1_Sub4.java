
/* Class158_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class158_Sub1_Sub4 extends Class158_Sub1 {
	int anInt10226;
	Class505_Sub1 aClass505_Sub1_10227;
	int anInt10228;
	int anInt10229;
	int anInt10230;
	int anInt10231;
	Interface13 anInterface13_10232;
	Interface13[] anInterface13Array10233 = new Interface13[4];
	static final int anInt10234 = 16;

	public void method186() {
		if (((Class158_Sub1_Sub4) this).anInt10228 != 0) {
			((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13678(((Class158_Sub1_Sub4) this).anInt10228);
			((Class158_Sub1_Sub4) this).anInt10228 = 0;
		}
	}

	void method15620() {
		if (((Class158_Sub1_Sub4) this).anInterface13_10232 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class158_Sub1_Sub4) this).anInterface13_10232.method99(36096);
	}

	boolean method213() {
		OpenGL.glBindFramebufferEXT(36160, ((Class158_Sub1_Sub4) this).anInt10228);
		for (int i = 0; i < 4; i++) {
			if ((((Class158_Sub1_Sub4) this).anInt10226 & 1 << i) != 0)
				method15622(i);
		}
		if ((((Class158_Sub1_Sub4) this).anInt10226 & 0x10) != 0)
			method15625();
		((Class158_Sub1_Sub4) this).anInt10226 = 0;
		((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13578();
		return true;
	}

	public void method13759(int i, Interface9 interface9) {
		int i_0_ = 1 << i;
		Interface13 interface13 = (Interface13) interface9;
		if (interface9 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | i_0_) != i_0_) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 126))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= i_0_;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= i_0_ ^ 0xffffffff;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 120))
			method15622(i);
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= i_0_;
	}

	void method15621() throws Throwable {
		super.finalize();
		method212();
	}

	void method15622(int i) {
		Interface13 interface13 = ((Class158_Sub1_Sub4) this).anInterface13Array10233[i];
		if (interface13 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface13.method99(36064 + i);
	}

	void method15623() throws Throwable {
		super.finalize();
		method212();
	}

	public boolean method13764() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	void method15624(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool | bool_6_) {
			int i_7_ = ((Class158_Sub1_Sub4) this).anInt10230;
			int i_8_ = ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 123).method2716();
			int i_9_ = 0;
			if (bool_6_)
				i_9_ |= 0x100;
			if (bool)
				i_9_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class158_Sub1_Sub4) this).anInt10228));
			OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_, i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_, i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	boolean method2718() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method13761(int i, Interface9 interface9) {
		int i_10_ = 1 << i;
		Interface13 interface13 = (Interface13) interface9;
		if (interface9 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | i_10_) != i_10_) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 126))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= i_10_;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= i_10_ ^ 0xffffffff;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 111))
			method15622(i);
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= i_10_;
	}

	Class158_Sub1_Sub4(Class505_Sub1 class505_sub1) {
		if (!((Class505_Sub1) class505_sub1).aBool8472)
			throw new IllegalStateException("");
		((Class158_Sub1_Sub4) this).aClass505_Sub1_10227 = class505_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class158_Sub1_Sub4) this).anInt10228 = is[0];
	}

	public void method212() {
		if (((Class158_Sub1_Sub4) this).anInt10228 != 0) {
			((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13678(((Class158_Sub1_Sub4) this).anInt10228);
			((Class158_Sub1_Sub4) this).anInt10228 = 0;
		}
	}

	public int method2719() {
		return ((Class158_Sub1_Sub4) this).anInt10229;
	}

	void method15625() {
		if (((Class158_Sub1_Sub4) this).anInterface13_10232 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class158_Sub1_Sub4) this).anInterface13_10232.method99(36096);
	}

	public int method2720() {
		return ((Class158_Sub1_Sub4) this).anInt10229;
	}

	public int method2716() {
		return ((Class158_Sub1_Sub4) this).anInt10230;
	}

	public void method13760(int i, Interface9 interface9) {
		int i_11_ = 1 << i;
		Interface13 interface13 = (Interface13) interface9;
		if (interface9 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | i_11_) != i_11_) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 105))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= i_11_;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= i_11_ ^ 0xffffffff;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 117))
			method15622(i);
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= i_11_;
	}

	boolean method211() {
		OpenGL.glBindFramebufferEXT(36160, ((Class158_Sub1_Sub4) this).anInt10228);
		for (int i = 0; i < 4; i++) {
			if ((((Class158_Sub1_Sub4) this).anInt10226 & 1 << i) != 0)
				method15622(i);
		}
		if ((((Class158_Sub1_Sub4) this).anInt10226 & 0x10) != 0)
			method15625();
		((Class158_Sub1_Sub4) this).anInt10226 = 0;
		((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13578();
		return true;
	}

	public void method13762(int i, Interface9 interface9) {
		int i_12_ = 1 << i;
		Interface13 interface13 = (Interface13) interface9;
		if (interface9 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | i_12_) != i_12_) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 116))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= i_12_;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= i_12_ ^ 0xffffffff;
			((Class158_Sub1_Sub4) this).anInterface13Array10233[i] = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 116))
			method15622(i);
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= i_12_;
	}

	public void method13763(Interface8 interface8) {
		Interface13 interface13 = (Interface13) interface8;
		if (interface8 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | 0x10) != 16) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 113))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= 0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= ~0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 104))
			method15625();
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= 0x10;
	}

	public void method13765(Interface8 interface8) {
		Interface13 interface13 = (Interface13) interface8;
		if (interface8 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | 0x10) != 16) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 109))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= 0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= ~0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 124))
			method15625();
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= 0x10;
	}

	public void method13758(Interface8 interface8) {
		Interface13 interface13 = (Interface13) interface8;
		if (interface8 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | 0x10) != 16) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 112))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= 0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= ~0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 107))
			method15625();
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= 0x10;
	}

	public boolean method13766() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method54() {
		OpenGL.glBindFramebufferEXT(36160, ((Class158_Sub1_Sub4) this).anInt10228);
		for (int i = 0; i < 4; i++) {
			if ((((Class158_Sub1_Sub4) this).anInt10226 & 1 << i) != 0)
				method15622(i);
		}
		if ((((Class158_Sub1_Sub4) this).anInt10226 & 0x10) != 0)
			method15625();
		((Class158_Sub1_Sub4) this).anInt10226 = 0;
		((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13578();
		return true;
	}

	public void method13757(Interface8 interface8) {
		Interface13 interface13 = (Interface13) interface8;
		if (interface8 != null) {
			if ((((Class158_Sub1_Sub4) this).anInt10231 | 0x10) != 16) {
				if ((((Class158_Sub1_Sub4) this).anInt10229 != interface13.method1()) || (((Class158_Sub1_Sub4) this).anInt10230 != interface13.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub4) this).anInt10230 = interface13.method74();
				((Class158_Sub1_Sub4) this).anInt10229 = interface13.method1();
				if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 124))
					((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method13639();
			}
			((Class158_Sub1_Sub4) this).anInt10231 |= 0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = interface13;
		} else {
			((Class158_Sub1_Sub4) this).anInt10231 &= ~0x10;
			((Class158_Sub1_Sub4) this).anInterface13_10232 = null;
			if (((Class158_Sub1_Sub4) this).anInt10231 == 0) {
				((Class158_Sub1_Sub4) this).anInt10230 = 0;
				((Class158_Sub1_Sub4) this).anInt10229 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 127))
			method15625();
		else
			((Class158_Sub1_Sub4) this).anInt10226 |= 0x10;
	}

	boolean method2723() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method2715() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method2717() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method2724() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method2725() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method2722() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public int method2721() {
		return ((Class158_Sub1_Sub4) this).anInt10230;
	}

	public int method2727() {
		return ((Class158_Sub1_Sub4) this).anInt10230;
	}

	void method15626() {
		if (((Class158_Sub1_Sub4) this).anInterface13_10232 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class158_Sub1_Sub4) this).anInterface13_10232.method99(36096);
	}

	public int method2714() {
		return ((Class158_Sub1_Sub4) this).anInt10229;
	}

	public int method2726() {
		return ((Class158_Sub1_Sub4) this).anInt10229;
	}

	void method15627(int i) {
		Interface13 interface13 = ((Class158_Sub1_Sub4) this).anInterface13Array10233[i];
		if (interface13 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface13.method99(36064 + i);
	}

	void method15628(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	public void finalize() throws Throwable {
		super.finalize();
		method212();
	}

	void method15629(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	void method15630(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool, boolean bool_18_) {
		if (bool | bool_18_) {
			int i_19_ = ((Class158_Sub1_Sub4) this).anInt10230;
			int i_20_ = ((Class158_Sub1_Sub4) this).aClass505_Sub1_10227.method8523((byte) 118).method2716();
			int i_21_ = 0;
			if (bool_18_)
				i_21_ |= 0x100;
			if (bool)
				i_21_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class158_Sub1_Sub4) this).anInt10228));
			OpenGL.glBlitFramebufferEXT(i, i_19_ - i_13_ - i_15_, i + i_14_, i_19_ - i_13_, i_16_, i_20_ - i_17_ - i_15_, i_16_ + i_14_, i_20_ - i_17_, i_21_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}
}
