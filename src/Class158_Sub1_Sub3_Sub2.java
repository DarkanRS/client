
/* Class158_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class158_Sub1_Sub3_Sub2 extends Class158_Sub1_Sub3 {
	int anInt10441;
	static final int anInt10442 = 16;
	int anInt10443;
	int anInt10444;
	int anInt10445;
	Class505_Sub2_Sub1 aClass505_Sub2_Sub1_10446;
	int anInt10447;
	Interface28 anInterface28_10448;
	Interface28[] anInterface28Array10449 = new Interface28[4];

	void method15979() {
		if (((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448.method99(36096);
	}

	public int method2714() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10441;
	}

	void method15980() throws Throwable {
		super.finalize();
		method212();
	}

	Class158_Sub1_Sub3_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1) {
		super((Class505_Sub2) class505_sub2_sub1);
		((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446 = class505_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class158_Sub1_Sub3_Sub2) this).anInt10443 = is[0];
	}

	public void method13765(Interface8 interface8) {
		Interface28 interface28 = (Interface28) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= 0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= ~0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 107))
			method15982();
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= 0x10;
	}

	void method15981(int i) {
		Interface28 interface28 = ((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i];
		if (interface28 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface28.method99(36064 + i);
	}

	void method15982() {
		if (((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448.method99(36096);
	}

	public void method13758(Interface8 interface8) {
		Interface28 interface28 = (Interface28) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= 0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= ~0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 113))
			method15982();
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= 0x10;
	}

	boolean method213() {
		OpenGL.glBindFramebufferEXT(36160, (((Class158_Sub1_Sub3_Sub2) this).anInt10443));
		for (int i = 0; i < 4; i++) {
			if ((((Class158_Sub1_Sub3_Sub2) this).anInt10447 & 1 << i) != 0)
				method15981(i);
		}
		if ((((Class158_Sub1_Sub3_Sub2) this).anInt10447 & 0x10) != 0)
			method15982();
		((Class158_Sub1_Sub3_Sub2) this).anInt10447 = 0;
		return super.method213();
	}

	public void method13760(int i, Interface9 interface9) {
		int i_0_ = 1 << i;
		Interface28 interface28 = (Interface28) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= i_0_;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= i_0_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 125))
			method15981(i);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= i_0_;
	}

	public void method212() {
		if (((Class158_Sub1_Sub3_Sub2) this).anInt10443 != 0) {
			((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method15571(((Class158_Sub1_Sub3_Sub2) this).anInt10443);
			((Class158_Sub1_Sub3_Sub2) this).anInt10443 = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		method212();
	}

	boolean method211() {
		OpenGL.glBindFramebufferEXT(36160, (((Class158_Sub1_Sub3_Sub2) this).anInt10443));
		for (int i = 0; i < 4; i++) {
			if ((((Class158_Sub1_Sub3_Sub2) this).anInt10447 & 1 << i) != 0)
				method15981(i);
		}
		if ((((Class158_Sub1_Sub3_Sub2) this).anInt10447 & 0x10) != 0)
			method15982();
		((Class158_Sub1_Sub3_Sub2) this).anInt10447 = 0;
		return super.method213();
	}

	public int method2720() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10441;
	}

	public int method2726() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10441;
	}

	public boolean method13764() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method13761(int i, Interface9 interface9) {
		int i_1_ = 1 << i;
		Interface28 interface28 = (Interface28) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= i_1_;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= i_1_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 103))
			method15981(i);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= i_1_;
	}

	public int method2719() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10441;
	}

	public void method13763(Interface8 interface8) {
		Interface28 interface28 = (Interface28) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= 0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= ~0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 121))
			method15982();
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= 0x10;
	}

	public void method13757(Interface8 interface8) {
		Interface28 interface28 = (Interface28) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= 0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= ~0x10;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 119))
			method15982();
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= 0x10;
	}

	boolean method2725() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public boolean method13766() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method13759(int i, Interface9 interface9) {
		int i_2_ = 1 << i;
		Interface28 interface28 = (Interface28) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= i_2_;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= i_2_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 120))
			method15981(i);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= i_2_;
	}

	boolean method54() {
		OpenGL.glBindFramebufferEXT(36160, (((Class158_Sub1_Sub3_Sub2) this).anInt10443));
		for (int i = 0; i < 4; i++) {
			if ((((Class158_Sub1_Sub3_Sub2) this).anInt10447 & 1 << i) != 0)
				method15981(i);
		}
		if ((((Class158_Sub1_Sub3_Sub2) this).anInt10447 & 0x10) != 0)
			method15982();
		((Class158_Sub1_Sub3_Sub2) this).anInt10447 = 0;
		return super.method213();
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

	public int method2716() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10445;
	}

	boolean method2722() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public int method2721() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10445;
	}

	public int method2727() {
		return ((Class158_Sub1_Sub3_Sub2) this).anInt10445;
	}

	public void method13762(int i, Interface9 interface9) {
		int i_3_ = 1 << i;
		Interface28 interface28 = (Interface28) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 != 0) {
				if ((((Class158_Sub1_Sub3_Sub2) this).anInt10441 != interface28.method1()) || (((Class158_Sub1_Sub3_Sub2) this).anInt10445 != interface28.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = interface28.method74();
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = interface28.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 |= i_3_;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = interface28;
		} else {
			((Class158_Sub1_Sub3_Sub2) this).anInt10444 &= i_3_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i] = null;
			if (((Class158_Sub1_Sub3_Sub2) this).anInt10444 == 0) {
				((Class158_Sub1_Sub3_Sub2) this).anInt10445 = 0;
				((Class158_Sub1_Sub3_Sub2) this).anInt10441 = 0;
			}
		}
		if (this == ((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method8523((byte) 116))
			method15981(i);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInt10447 |= i_3_;
	}

	void method15983() throws Throwable {
		super.finalize();
		method212();
	}

	boolean method2718() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method15984(int i) {
		Interface28 interface28 = ((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i];
		if (interface28 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface28.method99(36064 + i);
	}

	void method15985(int i) {
		Interface28 interface28 = ((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i];
		if (interface28 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface28.method99(36064 + i);
	}

	void method15986(int i) {
		Interface28 interface28 = ((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i];
		if (interface28 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface28.method99(36064 + i);
	}

	void method15987(int i) {
		Interface28 interface28 = ((Class158_Sub1_Sub3_Sub2) this).anInterface28Array10449[i];
		if (interface28 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface28.method99(36064 + i);
	}

	public void method186() {
		if (((Class158_Sub1_Sub3_Sub2) this).anInt10443 != 0) {
			((Class158_Sub1_Sub3_Sub2) this).aClass505_Sub2_Sub1_10446.method15571(((Class158_Sub1_Sub3_Sub2) this).anInt10443);
			((Class158_Sub1_Sub3_Sub2) this).anInt10443 = 0;
		}
	}

	void method15988() {
		if (((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class158_Sub1_Sub3_Sub2) this).anInterface28_10448.method99(36096);
	}
}
