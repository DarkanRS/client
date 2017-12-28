
/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.util.Arrays;

public class Class253 {
	int anInt3114;
	public static boolean aBool3115;
	Class282_Sub15[] aClass282_Sub15Array3116;
	int anInt3117;
	public static final int anInt3118 = 256;
	static final int anInt3119 = 16384;
	static Class254 aClass254_3120;
	int anInt3121;
	Class282_Sub15 aClass282_Sub15_3122;
	int anInt3123;
	long aLong3124;
	int anInt3125;
	long aLong3126;
	static final int anInt3127 = 8;
	long aLong3128;
	public static int anInt3129;
	int anInt3130;
	int anInt3131;
	int anInt3132;
	boolean aBool3133;
	static final int anInt3134 = 3;
	boolean aBool3135 = false;
	static final int anInt3136 = 2;
	static final int anInt3137 = 4;
	static final int anInt3138 = 286331153;
	static int anInt3139;
	int[] anIntArray3140;
	Class282_Sub15[] aClass282_Sub15Array3141;

	public final synchronized void method4329(Class282_Sub15 class282_sub15) {
		((Class253) this).aClass282_Sub15_3122 = class282_sub15;
	}

	public static final void method4330(int i, boolean bool, int i_0_) {
		if (i < 8000 || i > 48000)
			throw new IllegalArgumentException();
		anInt3129 = i;
		aBool3115 = bool;
		anInt3139 = i_0_;
	}

	public static final Class253 method4331(Component component, int i, int i_1_) {
		if (anInt3129 == 0)
			throw new IllegalStateException();
		if (i < 0 || i >= 2)
			throw new IllegalArgumentException();
		if (i_1_ < 256)
			i_1_ = 256;
		Class253_Sub1 class253_sub1;
		try {
			Class253_Sub1 class253_sub1_2_ = new Class253_Sub1();
			((Class253) class253_sub1_2_).anIntArray3140 = new int[256 * (aBool3115 ? 2 : 1)];
			((Class253) class253_sub1_2_).anInt3132 = i_1_;
			class253_sub1_2_.method4370(component);
			((Class253) class253_sub1_2_).anInt3121 = (i_1_ & ~0x3ff) + 1024;
			if (((Class253) class253_sub1_2_).anInt3121 > 16384)
				((Class253) class253_sub1_2_).anInt3121 = 16384;
			class253_sub1_2_.method4361(((Class253) class253_sub1_2_).anInt3121);
			if (anInt3139 > 0 && aClass254_3120 == null) {
				aClass254_3120 = new Class254_Sub1();
				Thread thread = new Thread(aClass254_3120);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(anInt3139);
			}
			if (aClass254_3120 != null) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					throw new IllegalArgumentException();
				((Class254) aClass254_3120).aClass253Array3142[i] = class253_sub1_2_;
			}
			class253_sub1 = class253_sub1_2_;
		} catch (Throwable throwable) {
			return new Class253();
		}
		return class253_sub1;
	}

	void method4332() {
		/* empty */
	}

	public final synchronized void method4333() {
		if (!((Class253) this).aBool3135) {
			long l = Class169.method2869(1993392309);
			try {
				if (l > ((Class253) this).aLong3124 + 6000L)
					((Class253) this).aLong3124 = l - 6000L;
				for (/**/; l > ((Class253) this).aLong3124 + 5000L; l = Class169.method2869(1843823776)) {
					method4373(256);
					((Class253) this).aLong3124 += (long) (256000 / anInt3129);
				}
			} catch (Exception exception) {
				((Class253) this).aLong3124 = l;
			}
			if (((Class253) this).anIntArray3140 != null) {
				try {
					if (((Class253) this).aLong3128 != 0L) {
						if (l < ((Class253) this).aLong3128)
							return;
						method4361(((Class253) this).anInt3121);
						((Class253) this).aLong3128 = 0L;
						((Class253) this).aBool3133 = true;
					}
					int i = method4340();
					if (((Class253) this).anInt3131 - i > ((Class253) this).anInt3114)
						((Class253) this).anInt3114 = ((Class253) this).anInt3131 - i;
					int i_3_ = (((Class253) this).anInt3132 + ((Class253) this).anInt3125);
					if (i_3_ + 256 > 16384)
						i_3_ = 16128;
					if (i_3_ + 256 > ((Class253) this).anInt3121) {
						((Class253) this).anInt3121 += 1024;
						if (((Class253) this).anInt3121 > 16384)
							((Class253) this).anInt3121 = 16384;
						method4343();
						method4361(((Class253) this).anInt3121);
						i = 0;
						((Class253) this).aBool3133 = true;
						if (i_3_ + 256 > ((Class253) this).anInt3121) {
							i_3_ = ((Class253) this).anInt3121 - 256;
							((Class253) this).anInt3125 = i_3_ - ((Class253) this).anInt3132;
						}
					}
					for (/**/; i < i_3_; i += 256) {
						method4337(((Class253) this).anIntArray3140, 256);
						method4342();
					}
					if (l > ((Class253) this).aLong3126) {
						if (!((Class253) this).aBool3133) {
							if (((Class253) this).anInt3114 == 0 && ((Class253) this).anInt3130 == 0) {
								method4343();
								((Class253) this).aLong3128 = l + 2000L;
								return;
							}
							((Class253) this).anInt3125 = Math.min(((Class253) this).anInt3130, ((Class253) this).anInt3114);
							((Class253) this).anInt3130 = ((Class253) this).anInt3114;
						} else
							((Class253) this).aBool3133 = false;
						((Class253) this).anInt3114 = 0;
						((Class253) this).aLong3126 = l + 2000L;
					}
					((Class253) this).anInt3131 = i;
				} catch (Exception exception) {
					method4343();
					((Class253) this).aLong3128 = l + 2000L;
				}
			}
		}
	}

	public final synchronized void method4334() {
		((Class253) this).aBool3133 = true;
		try {
			method4344();
		} catch (Exception exception) {
			method4343();
			((Class253) this).aLong3128 = Class169.method2869(1703218389) + 2000L;
		}
	}

	public final synchronized void method4335() {
		if (aClass254_3120 != null) {
			boolean bool = true;
			for (int i = 0; i < 2; i++) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] == this)
					((Class254) aClass254_3120).aClass253Array3142[i] = null;
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					bool = false;
			}
			if (bool) {
				((Class254) aClass254_3120).aBool3143 = true;
				while (((Class254) aClass254_3120).aBool3144)
					Class89.method1504(50L);
				aClass254_3120 = null;
			}
		}
		method4343();
		((Class253) this).anIntArray3140 = null;
		((Class253) this).aBool3135 = true;
	}

	public final synchronized void method4336(Class282_Sub15 class282_sub15) {
		((Class253) this).aClass282_Sub15_3122 = class282_sub15;
	}

	final void method4337(int[] is, int i) {
		int i_4_ = i;
		if (aBool3115)
			i_4_ <<= 1;
		Arrays.fill(is, 0, i_4_, 0);
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).aClass282_Sub15_3122 != null && ((Class253) this).anInt3117 <= 0) {
			((Class253) this).anInt3117 += anInt3129 >> 4;
			method4338(((Class253) this).aClass282_Sub15_3122);
			method4339(((Class253) this).aClass282_Sub15_3122, ((Class253) this).aClass282_Sub15_3122.method12225());
			int i_5_ = 0;
			int i_6_ = 255;
			int i_7_ = 7;
			while_81_: while (i_6_ != 0) {
				int i_8_;
				int i_9_;
				if (i_7_ < 0) {
					i_8_ = i_7_ & 0x3;
					i_9_ = -(i_7_ >> 2);
				} else {
					i_8_ = i_7_;
					i_9_ = 0;
				}
				for (int i_10_ = i_6_ >>> i_8_ & 0x11111111; i_10_ != 0; i_10_ >>>= 4) {
					if ((i_10_ & 0x1) != 0) {
						i_6_ &= 1 << i_8_ ^ 0xffffffff;
						Class282_Sub15 class282_sub15 = null;
						Class282_Sub15 class282_sub15_11_ = ((Class253) this).aClass282_Sub15Array3116[i_8_];
						while (class282_sub15_11_ != null) {
							Class282_Sub26 class282_sub26 = (((Class282_Sub15) class282_sub15_11_).aClass282_Sub26_7601);
							if (class282_sub26 != null && (((Class282_Sub26) class282_sub26).anInt7690 > i_9_)) {
								i_6_ |= 1 << i_8_;
								class282_sub15 = class282_sub15_11_;
								class282_sub15_11_ = (((Class282_Sub15) class282_sub15_11_).aClass282_Sub15_7598);
							} else {
								((Class282_Sub15) class282_sub15_11_).aBool7600 = true;
								int i_12_ = class282_sub15_11_.method12228();
								i_5_ += i_12_;
								if (class282_sub26 != null)
									((Class282_Sub26) class282_sub26).anInt7690 += i_12_;
								if (i_5_ >= ((Class253) this).anInt3123)
									break while_81_;
								Class282_Sub15 class282_sub15_13_ = class282_sub15_11_.method12226();
								if (class282_sub15_13_ != null) {
									int i_14_ = (((Class282_Sub15) class282_sub15_11_).anInt7599);
									for (/**/; class282_sub15_13_ != null; class282_sub15_13_ = class282_sub15_11_.method12239())
										method4339(class282_sub15_13_, (i_14_ * class282_sub15_13_.method12225() >> 8));
								}
								Class282_Sub15 class282_sub15_15_ = (((Class282_Sub15) class282_sub15_11_).aClass282_Sub15_7598);
								((Class282_Sub15) class282_sub15_11_).aClass282_Sub15_7598 = null;
								if (class282_sub15 == null)
									((Class253) this).aClass282_Sub15Array3116[i_8_] = class282_sub15_15_;
								else
									((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = class282_sub15_15_;
								if (class282_sub15_15_ == null)
									((Class253) this).aClass282_Sub15Array3141[i_8_] = class282_sub15;
								class282_sub15_11_ = class282_sub15_15_;
							}
						}
					}
					i_8_ += 4;
					i_9_++;
				}
				i_7_--;
			}
			for (i_7_ = 0; i_7_ < 8; i_7_++) {
				Class282_Sub15 class282_sub15 = ((Class253) this).aClass282_Sub15Array3116[i_7_];
				Class282_Sub15[] class282_sub15s = ((Class253) this).aClass282_Sub15Array3116;
				int i_16_ = i_7_;
				((Class253) this).aClass282_Sub15Array3141[i_7_] = null;
				class282_sub15s[i_16_] = null;
				Class282_Sub15 class282_sub15_17_;
				for (/**/; class282_sub15 != null; class282_sub15 = class282_sub15_17_) {
					class282_sub15_17_ = (((Class282_Sub15) class282_sub15).aClass282_Sub15_7598);
					((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = null;
				}
			}
		}
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12230(is, 0, i);
		((Class253) this).aLong3124 = Class169.method2869(1568857193);
	}

	static final void method4338(Class282_Sub15 class282_sub15) {
		((Class282_Sub15) class282_sub15).aBool7600 = false;
		if (((Class282_Sub15) class282_sub15).aClass282_Sub26_7601 != null)
			((Class282_Sub26) ((Class282_Sub15) class282_sub15).aClass282_Sub26_7601).anInt7690 = 0;
		for (Class282_Sub15 class282_sub15_18_ = class282_sub15.method12226(); class282_sub15_18_ != null; class282_sub15_18_ = class282_sub15.method12239())
			method4338(class282_sub15_18_);
	}

	final void method4339(Class282_Sub15 class282_sub15, int i) {
		int i_19_ = i >> 5;
		Class282_Sub15 class282_sub15_20_ = ((Class253) this).aClass282_Sub15Array3141[i_19_];
		if (class282_sub15_20_ == null)
			((Class253) this).aClass282_Sub15Array3116[i_19_] = class282_sub15;
		else
			((Class282_Sub15) class282_sub15_20_).aClass282_Sub15_7598 = class282_sub15;
		((Class253) this).aClass282_Sub15Array3141[i_19_] = class282_sub15;
		((Class282_Sub15) class282_sub15).anInt7599 = i;
	}

	Class253() {
		((Class253) this).anInt3123 = 32;
		((Class253) this).aLong3124 = Class169.method2869(1926471611);
		((Class253) this).aLong3128 = 0L;
		((Class253) this).anInt3114 = 0;
		((Class253) this).anInt3130 = 0;
		((Class253) this).anInt3131 = 0;
		((Class253) this).aLong3126 = 0L;
		((Class253) this).aBool3133 = true;
		((Class253) this).anInt3117 = 0;
		((Class253) this).aClass282_Sub15Array3116 = new Class282_Sub15[8];
		((Class253) this).aClass282_Sub15Array3141 = new Class282_Sub15[8];
	}

	int method4340() throws Exception {
		return ((Class253) this).anInt3121;
	}

	void method4341(Component component) throws Exception {
		/* empty */
	}

	void method4342() throws Exception {
		/* empty */
	}

	void method4343() {
		/* empty */
	}

	void method4344() throws Exception {
		/* empty */
	}

	public static final void method4345(int i, boolean bool, int i_21_) {
		if (i < 8000 || i > 48000)
			throw new IllegalArgumentException();
		anInt3129 = i;
		aBool3115 = bool;
		anInt3139 = i_21_;
	}

	public static final void method4346(int i, boolean bool, int i_22_) {
		if (i < 8000 || i > 48000)
			throw new IllegalArgumentException();
		anInt3129 = i;
		aBool3115 = bool;
		anInt3139 = i_22_;
	}

	public static final void method4347(int i, boolean bool, int i_23_) {
		if (i < 8000 || i > 48000)
			throw new IllegalArgumentException();
		anInt3129 = i;
		aBool3115 = bool;
		anInt3139 = i_23_;
	}

	public static final Class253 method4348(Component component, int i, int i_24_) {
		if (anInt3129 == 0)
			throw new IllegalStateException();
		if (i < 0 || i >= 2)
			throw new IllegalArgumentException();
		if (i_24_ < 256)
			i_24_ = 256;
		Class253_Sub1 class253_sub1;
		try {
			Class253_Sub1 class253_sub1_25_ = new Class253_Sub1();
			((Class253) class253_sub1_25_).anIntArray3140 = new int[256 * (aBool3115 ? 2 : 1)];
			((Class253) class253_sub1_25_).anInt3132 = i_24_;
			class253_sub1_25_.method4370(component);
			((Class253) class253_sub1_25_).anInt3121 = (i_24_ & ~0x3ff) + 1024;
			if (((Class253) class253_sub1_25_).anInt3121 > 16384)
				((Class253) class253_sub1_25_).anInt3121 = 16384;
			class253_sub1_25_.method4361(((Class253) class253_sub1_25_).anInt3121);
			if (anInt3139 > 0 && aClass254_3120 == null) {
				aClass254_3120 = new Class254_Sub1();
				Thread thread = new Thread(aClass254_3120);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(anInt3139);
			}
			if (aClass254_3120 != null) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					throw new IllegalArgumentException();
				((Class254) aClass254_3120).aClass253Array3142[i] = class253_sub1_25_;
			}
			class253_sub1 = class253_sub1_25_;
		} catch (Throwable throwable) {
			return new Class253();
		}
		return class253_sub1;
	}

	public static final Class253 method4349(Component component, int i, int i_26_) {
		if (anInt3129 == 0)
			throw new IllegalStateException();
		if (i < 0 || i >= 2)
			throw new IllegalArgumentException();
		if (i_26_ < 256)
			i_26_ = 256;
		Class253_Sub1 class253_sub1;
		try {
			Class253_Sub1 class253_sub1_27_ = new Class253_Sub1();
			((Class253) class253_sub1_27_).anIntArray3140 = new int[256 * (aBool3115 ? 2 : 1)];
			((Class253) class253_sub1_27_).anInt3132 = i_26_;
			class253_sub1_27_.method4370(component);
			((Class253) class253_sub1_27_).anInt3121 = (i_26_ & ~0x3ff) + 1024;
			if (((Class253) class253_sub1_27_).anInt3121 > 16384)
				((Class253) class253_sub1_27_).anInt3121 = 16384;
			class253_sub1_27_.method4361(((Class253) class253_sub1_27_).anInt3121);
			if (anInt3139 > 0 && aClass254_3120 == null) {
				aClass254_3120 = new Class254_Sub1();
				Thread thread = new Thread(aClass254_3120);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(anInt3139);
			}
			if (aClass254_3120 != null) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					throw new IllegalArgumentException();
				((Class254) aClass254_3120).aClass253Array3142[i] = class253_sub1_27_;
			}
			class253_sub1 = class253_sub1_27_;
		} catch (Throwable throwable) {
			return new Class253();
		}
		return class253_sub1;
	}

	public static final Class253 method4350(Component component, int i, int i_28_) {
		if (anInt3129 == 0)
			throw new IllegalStateException();
		if (i < 0 || i >= 2)
			throw new IllegalArgumentException();
		if (i_28_ < 256)
			i_28_ = 256;
		Class253_Sub1 class253_sub1;
		try {
			Class253_Sub1 class253_sub1_29_ = new Class253_Sub1();
			((Class253) class253_sub1_29_).anIntArray3140 = new int[256 * (aBool3115 ? 2 : 1)];
			((Class253) class253_sub1_29_).anInt3132 = i_28_;
			class253_sub1_29_.method4370(component);
			((Class253) class253_sub1_29_).anInt3121 = (i_28_ & ~0x3ff) + 1024;
			if (((Class253) class253_sub1_29_).anInt3121 > 16384)
				((Class253) class253_sub1_29_).anInt3121 = 16384;
			class253_sub1_29_.method4361(((Class253) class253_sub1_29_).anInt3121);
			if (anInt3139 > 0 && aClass254_3120 == null) {
				aClass254_3120 = new Class254_Sub1();
				Thread thread = new Thread(aClass254_3120);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(anInt3139);
			}
			if (aClass254_3120 != null) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					throw new IllegalArgumentException();
				((Class254) aClass254_3120).aClass253Array3142[i] = class253_sub1_29_;
			}
			class253_sub1 = class253_sub1_29_;
		} catch (Throwable throwable) {
			return new Class253();
		}
		return class253_sub1;
	}

	public final synchronized void method4351(Class282_Sub15 class282_sub15) {
		((Class253) this).aClass282_Sub15_3122 = class282_sub15;
	}

	public final synchronized void method4352(Class282_Sub15 class282_sub15) {
		((Class253) this).aClass282_Sub15_3122 = class282_sub15;
	}

	int method4353() throws Exception {
		return ((Class253) this).anInt3121;
	}

	public final synchronized void method4354() {
		if (!((Class253) this).aBool3135) {
			long l = Class169.method2869(2043584773);
			try {
				if (l > ((Class253) this).aLong3124 + 6000L)
					((Class253) this).aLong3124 = l - 6000L;
				for (/**/; l > ((Class253) this).aLong3124 + 5000L; l = Class169.method2869(2074092224)) {
					method4373(256);
					((Class253) this).aLong3124 += (long) (256000 / anInt3129);
				}
			} catch (Exception exception) {
				((Class253) this).aLong3124 = l;
			}
			if (((Class253) this).anIntArray3140 != null) {
				try {
					if (((Class253) this).aLong3128 != 0L) {
						if (l < ((Class253) this).aLong3128)
							return;
						method4361(((Class253) this).anInt3121);
						((Class253) this).aLong3128 = 0L;
						((Class253) this).aBool3133 = true;
					}
					int i = method4340();
					if (((Class253) this).anInt3131 - i > ((Class253) this).anInt3114)
						((Class253) this).anInt3114 = ((Class253) this).anInt3131 - i;
					int i_30_ = (((Class253) this).anInt3132 + ((Class253) this).anInt3125);
					if (i_30_ + 256 > 16384)
						i_30_ = 16128;
					if (i_30_ + 256 > ((Class253) this).anInt3121) {
						((Class253) this).anInt3121 += 1024;
						if (((Class253) this).anInt3121 > 16384)
							((Class253) this).anInt3121 = 16384;
						method4343();
						method4361(((Class253) this).anInt3121);
						i = 0;
						((Class253) this).aBool3133 = true;
						if (i_30_ + 256 > ((Class253) this).anInt3121) {
							i_30_ = ((Class253) this).anInt3121 - 256;
							((Class253) this).anInt3125 = i_30_ - ((Class253) this).anInt3132;
						}
					}
					for (/**/; i < i_30_; i += 256) {
						method4337(((Class253) this).anIntArray3140, 256);
						method4342();
					}
					if (l > ((Class253) this).aLong3126) {
						if (!((Class253) this).aBool3133) {
							if (((Class253) this).anInt3114 == 0 && ((Class253) this).anInt3130 == 0) {
								method4343();
								((Class253) this).aLong3128 = l + 2000L;
								return;
							}
							((Class253) this).anInt3125 = Math.min(((Class253) this).anInt3130, ((Class253) this).anInt3114);
							((Class253) this).anInt3130 = ((Class253) this).anInt3114;
						} else
							((Class253) this).aBool3133 = false;
						((Class253) this).anInt3114 = 0;
						((Class253) this).aLong3126 = l + 2000L;
					}
					((Class253) this).anInt3131 = i;
				} catch (Exception exception) {
					method4343();
					((Class253) this).aLong3128 = l + 2000L;
				}
			}
		}
	}

	public final synchronized void method4355() {
		if (!((Class253) this).aBool3135) {
			long l = Class169.method2869(1912394005);
			try {
				if (l > ((Class253) this).aLong3124 + 6000L)
					((Class253) this).aLong3124 = l - 6000L;
				for (/**/; l > ((Class253) this).aLong3124 + 5000L; l = Class169.method2869(1693867196)) {
					method4373(256);
					((Class253) this).aLong3124 += (long) (256000 / anInt3129);
				}
			} catch (Exception exception) {
				((Class253) this).aLong3124 = l;
			}
			if (((Class253) this).anIntArray3140 != null) {
				try {
					if (((Class253) this).aLong3128 != 0L) {
						if (l < ((Class253) this).aLong3128)
							return;
						method4361(((Class253) this).anInt3121);
						((Class253) this).aLong3128 = 0L;
						((Class253) this).aBool3133 = true;
					}
					int i = method4340();
					if (((Class253) this).anInt3131 - i > ((Class253) this).anInt3114)
						((Class253) this).anInt3114 = ((Class253) this).anInt3131 - i;
					int i_31_ = (((Class253) this).anInt3132 + ((Class253) this).anInt3125);
					if (i_31_ + 256 > 16384)
						i_31_ = 16128;
					if (i_31_ + 256 > ((Class253) this).anInt3121) {
						((Class253) this).anInt3121 += 1024;
						if (((Class253) this).anInt3121 > 16384)
							((Class253) this).anInt3121 = 16384;
						method4343();
						method4361(((Class253) this).anInt3121);
						i = 0;
						((Class253) this).aBool3133 = true;
						if (i_31_ + 256 > ((Class253) this).anInt3121) {
							i_31_ = ((Class253) this).anInt3121 - 256;
							((Class253) this).anInt3125 = i_31_ - ((Class253) this).anInt3132;
						}
					}
					for (/**/; i < i_31_; i += 256) {
						method4337(((Class253) this).anIntArray3140, 256);
						method4342();
					}
					if (l > ((Class253) this).aLong3126) {
						if (!((Class253) this).aBool3133) {
							if (((Class253) this).anInt3114 == 0 && ((Class253) this).anInt3130 == 0) {
								method4343();
								((Class253) this).aLong3128 = l + 2000L;
								return;
							}
							((Class253) this).anInt3125 = Math.min(((Class253) this).anInt3130, ((Class253) this).anInt3114);
							((Class253) this).anInt3130 = ((Class253) this).anInt3114;
						} else
							((Class253) this).aBool3133 = false;
						((Class253) this).anInt3114 = 0;
						((Class253) this).aLong3126 = l + 2000L;
					}
					((Class253) this).anInt3131 = i;
				} catch (Exception exception) {
					method4343();
					((Class253) this).aLong3128 = l + 2000L;
				}
			}
		}
	}

	public final synchronized void method4356() {
		if (aClass254_3120 != null) {
			boolean bool = true;
			for (int i = 0; i < 2; i++) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] == this)
					((Class254) aClass254_3120).aClass253Array3142[i] = null;
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					bool = false;
			}
			if (bool) {
				((Class254) aClass254_3120).aBool3143 = true;
				while (((Class254) aClass254_3120).aBool3144)
					Class89.method1504(50L);
				aClass254_3120 = null;
			}
		}
		method4343();
		((Class253) this).anIntArray3140 = null;
		((Class253) this).aBool3135 = true;
	}

	public final synchronized void method4357() {
		if (aClass254_3120 != null) {
			boolean bool = true;
			for (int i = 0; i < 2; i++) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] == this)
					((Class254) aClass254_3120).aClass253Array3142[i] = null;
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					bool = false;
			}
			if (bool) {
				((Class254) aClass254_3120).aBool3143 = true;
				while (((Class254) aClass254_3120).aBool3144)
					Class89.method1504(50L);
				aClass254_3120 = null;
			}
		}
		method4343();
		((Class253) this).anIntArray3140 = null;
		((Class253) this).aBool3135 = true;
	}

	void method4358() throws Exception {
		/* empty */
	}

	final void method4359(int i) {
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12231(i);
	}

	final void method4360(int i) {
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12231(i);
	}

	void method4361(int i) throws Exception {
		/* empty */
	}

	void method4362() throws Exception {
		/* empty */
	}

	final void method4363(int[] is, int i) {
		int i_32_ = i;
		if (aBool3115)
			i_32_ <<= 1;
		Arrays.fill(is, 0, i_32_, 0);
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).aClass282_Sub15_3122 != null && ((Class253) this).anInt3117 <= 0) {
			((Class253) this).anInt3117 += anInt3129 >> 4;
			method4338(((Class253) this).aClass282_Sub15_3122);
			method4339(((Class253) this).aClass282_Sub15_3122, ((Class253) this).aClass282_Sub15_3122.method12225());
			int i_33_ = 0;
			int i_34_ = 255;
			int i_35_ = 7;
			while_82_: while (i_34_ != 0) {
				int i_36_;
				int i_37_;
				if (i_35_ < 0) {
					i_36_ = i_35_ & 0x3;
					i_37_ = -(i_35_ >> 2);
				} else {
					i_36_ = i_35_;
					i_37_ = 0;
				}
				for (int i_38_ = i_34_ >>> i_36_ & 0x11111111; i_38_ != 0; i_38_ >>>= 4) {
					if ((i_38_ & 0x1) != 0) {
						i_34_ &= 1 << i_36_ ^ 0xffffffff;
						Class282_Sub15 class282_sub15 = null;
						Class282_Sub15 class282_sub15_39_ = (((Class253) this).aClass282_Sub15Array3116[i_36_]);
						while (class282_sub15_39_ != null) {
							Class282_Sub26 class282_sub26 = (((Class282_Sub15) class282_sub15_39_).aClass282_Sub26_7601);
							if (class282_sub26 != null && (((Class282_Sub26) class282_sub26).anInt7690 > i_37_)) {
								i_34_ |= 1 << i_36_;
								class282_sub15 = class282_sub15_39_;
								class282_sub15_39_ = (((Class282_Sub15) class282_sub15_39_).aClass282_Sub15_7598);
							} else {
								((Class282_Sub15) class282_sub15_39_).aBool7600 = true;
								int i_40_ = class282_sub15_39_.method12228();
								i_33_ += i_40_;
								if (class282_sub26 != null)
									((Class282_Sub26) class282_sub26).anInt7690 += i_40_;
								if (i_33_ >= ((Class253) this).anInt3123)
									break while_82_;
								Class282_Sub15 class282_sub15_41_ = class282_sub15_39_.method12226();
								if (class282_sub15_41_ != null) {
									int i_42_ = (((Class282_Sub15) class282_sub15_39_).anInt7599);
									for (/**/; class282_sub15_41_ != null; class282_sub15_41_ = class282_sub15_39_.method12239())
										method4339(class282_sub15_41_, (i_42_ * class282_sub15_41_.method12225() >> 8));
								}
								Class282_Sub15 class282_sub15_43_ = (((Class282_Sub15) class282_sub15_39_).aClass282_Sub15_7598);
								((Class282_Sub15) class282_sub15_39_).aClass282_Sub15_7598 = null;
								if (class282_sub15 == null)
									((Class253) this).aClass282_Sub15Array3116[i_36_] = class282_sub15_43_;
								else
									((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = class282_sub15_43_;
								if (class282_sub15_43_ == null)
									((Class253) this).aClass282_Sub15Array3141[i_36_] = class282_sub15;
								class282_sub15_39_ = class282_sub15_43_;
							}
						}
					}
					i_36_ += 4;
					i_37_++;
				}
				i_35_--;
			}
			for (i_35_ = 0; i_35_ < 8; i_35_++) {
				Class282_Sub15 class282_sub15 = ((Class253) this).aClass282_Sub15Array3116[i_35_];
				Class282_Sub15[] class282_sub15s = ((Class253) this).aClass282_Sub15Array3116;
				int i_44_ = i_35_;
				((Class253) this).aClass282_Sub15Array3141[i_35_] = null;
				class282_sub15s[i_44_] = null;
				Class282_Sub15 class282_sub15_45_;
				for (/**/; class282_sub15 != null; class282_sub15 = class282_sub15_45_) {
					class282_sub15_45_ = (((Class282_Sub15) class282_sub15).aClass282_Sub15_7598);
					((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = null;
				}
			}
		}
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12230(is, 0, i);
		((Class253) this).aLong3124 = Class169.method2869(1621486386);
	}

	static final void method4364(Class282_Sub15 class282_sub15) {
		((Class282_Sub15) class282_sub15).aBool7600 = false;
		if (((Class282_Sub15) class282_sub15).aClass282_Sub26_7601 != null)
			((Class282_Sub26) ((Class282_Sub15) class282_sub15).aClass282_Sub26_7601).anInt7690 = 0;
		for (Class282_Sub15 class282_sub15_46_ = class282_sub15.method12226(); class282_sub15_46_ != null; class282_sub15_46_ = class282_sub15.method12239())
			method4338(class282_sub15_46_);
	}

	final void method4365(Class282_Sub15 class282_sub15, int i) {
		int i_47_ = i >> 5;
		Class282_Sub15 class282_sub15_48_ = ((Class253) this).aClass282_Sub15Array3141[i_47_];
		if (class282_sub15_48_ == null)
			((Class253) this).aClass282_Sub15Array3116[i_47_] = class282_sub15;
		else
			((Class282_Sub15) class282_sub15_48_).aClass282_Sub15_7598 = class282_sub15;
		((Class253) this).aClass282_Sub15Array3141[i_47_] = class282_sub15;
		((Class282_Sub15) class282_sub15).anInt7599 = i;
	}

	void method4366(Component component) throws Exception {
		/* empty */
	}

	void method4367(Component component) throws Exception {
		/* empty */
	}

	final void method4368(int[] is, int i) {
		int i_49_ = i;
		if (aBool3115)
			i_49_ <<= 1;
		Arrays.fill(is, 0, i_49_, 0);
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).aClass282_Sub15_3122 != null && ((Class253) this).anInt3117 <= 0) {
			((Class253) this).anInt3117 += anInt3129 >> 4;
			method4338(((Class253) this).aClass282_Sub15_3122);
			method4339(((Class253) this).aClass282_Sub15_3122, ((Class253) this).aClass282_Sub15_3122.method12225());
			int i_50_ = 0;
			int i_51_ = 255;
			int i_52_ = 7;
			while_83_: while (i_51_ != 0) {
				int i_53_;
				int i_54_;
				if (i_52_ < 0) {
					i_53_ = i_52_ & 0x3;
					i_54_ = -(i_52_ >> 2);
				} else {
					i_53_ = i_52_;
					i_54_ = 0;
				}
				for (int i_55_ = i_51_ >>> i_53_ & 0x11111111; i_55_ != 0; i_55_ >>>= 4) {
					if ((i_55_ & 0x1) != 0) {
						i_51_ &= 1 << i_53_ ^ 0xffffffff;
						Class282_Sub15 class282_sub15 = null;
						Class282_Sub15 class282_sub15_56_ = (((Class253) this).aClass282_Sub15Array3116[i_53_]);
						while (class282_sub15_56_ != null) {
							Class282_Sub26 class282_sub26 = (((Class282_Sub15) class282_sub15_56_).aClass282_Sub26_7601);
							if (class282_sub26 != null && (((Class282_Sub26) class282_sub26).anInt7690 > i_54_)) {
								i_51_ |= 1 << i_53_;
								class282_sub15 = class282_sub15_56_;
								class282_sub15_56_ = (((Class282_Sub15) class282_sub15_56_).aClass282_Sub15_7598);
							} else {
								((Class282_Sub15) class282_sub15_56_).aBool7600 = true;
								int i_57_ = class282_sub15_56_.method12228();
								i_50_ += i_57_;
								if (class282_sub26 != null)
									((Class282_Sub26) class282_sub26).anInt7690 += i_57_;
								if (i_50_ >= ((Class253) this).anInt3123)
									break while_83_;
								Class282_Sub15 class282_sub15_58_ = class282_sub15_56_.method12226();
								if (class282_sub15_58_ != null) {
									int i_59_ = (((Class282_Sub15) class282_sub15_56_).anInt7599);
									for (/**/; class282_sub15_58_ != null; class282_sub15_58_ = class282_sub15_56_.method12239())
										method4339(class282_sub15_58_, (i_59_ * class282_sub15_58_.method12225() >> 8));
								}
								Class282_Sub15 class282_sub15_60_ = (((Class282_Sub15) class282_sub15_56_).aClass282_Sub15_7598);
								((Class282_Sub15) class282_sub15_56_).aClass282_Sub15_7598 = null;
								if (class282_sub15 == null)
									((Class253) this).aClass282_Sub15Array3116[i_53_] = class282_sub15_60_;
								else
									((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = class282_sub15_60_;
								if (class282_sub15_60_ == null)
									((Class253) this).aClass282_Sub15Array3141[i_53_] = class282_sub15;
								class282_sub15_56_ = class282_sub15_60_;
							}
						}
					}
					i_53_ += 4;
					i_54_++;
				}
				i_52_--;
			}
			for (i_52_ = 0; i_52_ < 8; i_52_++) {
				Class282_Sub15 class282_sub15 = ((Class253) this).aClass282_Sub15Array3116[i_52_];
				Class282_Sub15[] class282_sub15s = ((Class253) this).aClass282_Sub15Array3116;
				int i_61_ = i_52_;
				((Class253) this).aClass282_Sub15Array3141[i_52_] = null;
				class282_sub15s[i_61_] = null;
				Class282_Sub15 class282_sub15_62_;
				for (/**/; class282_sub15 != null; class282_sub15 = class282_sub15_62_) {
					class282_sub15_62_ = (((Class282_Sub15) class282_sub15).aClass282_Sub15_7598);
					((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = null;
				}
			}
		}
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12230(is, 0, i);
		((Class253) this).aLong3124 = Class169.method2869(2132495124);
	}

	void method4369(Component component) throws Exception {
		/* empty */
	}

	void method4370(Component component) throws Exception {
		/* empty */
	}

	void method4371(int i) throws Exception {
		/* empty */
	}

	void method4372(int i) throws Exception {
		/* empty */
	}

	final void method4373(int i) {
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12231(i);
	}

	public final synchronized void method4374() {
		if (aClass254_3120 != null) {
			boolean bool = true;
			for (int i = 0; i < 2; i++) {
				if (((Class254) aClass254_3120).aClass253Array3142[i] == this)
					((Class254) aClass254_3120).aClass253Array3142[i] = null;
				if (((Class254) aClass254_3120).aClass253Array3142[i] != null)
					bool = false;
			}
			if (bool) {
				((Class254) aClass254_3120).aBool3143 = true;
				while (((Class254) aClass254_3120).aBool3144)
					Class89.method1504(50L);
				aClass254_3120 = null;
			}
		}
		method4343();
		((Class253) this).anIntArray3140 = null;
		((Class253) this).aBool3135 = true;
	}

	void method4375(Component component) throws Exception {
		/* empty */
	}

	void method4376() {
		/* empty */
	}

	final void method4377(int[] is, int i) {
		int i_63_ = i;
		if (aBool3115)
			i_63_ <<= 1;
		Arrays.fill(is, 0, i_63_, 0);
		((Class253) this).anInt3117 -= i;
		if (((Class253) this).aClass282_Sub15_3122 != null && ((Class253) this).anInt3117 <= 0) {
			((Class253) this).anInt3117 += anInt3129 >> 4;
			method4338(((Class253) this).aClass282_Sub15_3122);
			method4339(((Class253) this).aClass282_Sub15_3122, ((Class253) this).aClass282_Sub15_3122.method12225());
			int i_64_ = 0;
			int i_65_ = 255;
			int i_66_ = 7;
			while_84_: while (i_65_ != 0) {
				int i_67_;
				int i_68_;
				if (i_66_ < 0) {
					i_67_ = i_66_ & 0x3;
					i_68_ = -(i_66_ >> 2);
				} else {
					i_67_ = i_66_;
					i_68_ = 0;
				}
				for (int i_69_ = i_65_ >>> i_67_ & 0x11111111; i_69_ != 0; i_69_ >>>= 4) {
					if ((i_69_ & 0x1) != 0) {
						i_65_ &= 1 << i_67_ ^ 0xffffffff;
						Class282_Sub15 class282_sub15 = null;
						Class282_Sub15 class282_sub15_70_ = (((Class253) this).aClass282_Sub15Array3116[i_67_]);
						while (class282_sub15_70_ != null) {
							Class282_Sub26 class282_sub26 = (((Class282_Sub15) class282_sub15_70_).aClass282_Sub26_7601);
							if (class282_sub26 != null && (((Class282_Sub26) class282_sub26).anInt7690 > i_68_)) {
								i_65_ |= 1 << i_67_;
								class282_sub15 = class282_sub15_70_;
								class282_sub15_70_ = (((Class282_Sub15) class282_sub15_70_).aClass282_Sub15_7598);
							} else {
								((Class282_Sub15) class282_sub15_70_).aBool7600 = true;
								int i_71_ = class282_sub15_70_.method12228();
								i_64_ += i_71_;
								if (class282_sub26 != null)
									((Class282_Sub26) class282_sub26).anInt7690 += i_71_;
								if (i_64_ >= ((Class253) this).anInt3123)
									break while_84_;
								Class282_Sub15 class282_sub15_72_ = class282_sub15_70_.method12226();
								if (class282_sub15_72_ != null) {
									int i_73_ = (((Class282_Sub15) class282_sub15_70_).anInt7599);
									for (/**/; class282_sub15_72_ != null; class282_sub15_72_ = class282_sub15_70_.method12239())
										method4339(class282_sub15_72_, (i_73_ * class282_sub15_72_.method12225() >> 8));
								}
								Class282_Sub15 class282_sub15_74_ = (((Class282_Sub15) class282_sub15_70_).aClass282_Sub15_7598);
								((Class282_Sub15) class282_sub15_70_).aClass282_Sub15_7598 = null;
								if (class282_sub15 == null)
									((Class253) this).aClass282_Sub15Array3116[i_67_] = class282_sub15_74_;
								else
									((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = class282_sub15_74_;
								if (class282_sub15_74_ == null)
									((Class253) this).aClass282_Sub15Array3141[i_67_] = class282_sub15;
								class282_sub15_70_ = class282_sub15_74_;
							}
						}
					}
					i_67_ += 4;
					i_68_++;
				}
				i_66_--;
			}
			for (i_66_ = 0; i_66_ < 8; i_66_++) {
				Class282_Sub15 class282_sub15 = ((Class253) this).aClass282_Sub15Array3116[i_66_];
				Class282_Sub15[] class282_sub15s = ((Class253) this).aClass282_Sub15Array3116;
				int i_75_ = i_66_;
				((Class253) this).aClass282_Sub15Array3141[i_66_] = null;
				class282_sub15s[i_75_] = null;
				Class282_Sub15 class282_sub15_76_;
				for (/**/; class282_sub15 != null; class282_sub15 = class282_sub15_76_) {
					class282_sub15_76_ = (((Class282_Sub15) class282_sub15).aClass282_Sub15_7598);
					((Class282_Sub15) class282_sub15).aClass282_Sub15_7598 = null;
				}
			}
		}
		if (((Class253) this).anInt3117 < 0)
			((Class253) this).anInt3117 = 0;
		if (((Class253) this).aClass282_Sub15_3122 != null)
			((Class253) this).aClass282_Sub15_3122.method12230(is, 0, i);
		((Class253) this).aLong3124 = Class169.method2869(1859678625);
	}

	void method4378() throws Exception {
		/* empty */
	}
}
