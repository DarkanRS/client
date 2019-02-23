import java.awt.Component;
import java.util.Arrays;

public class Class253 {

	Class282_Sub15 aClass282_Sub15_3122;
	public static int anInt3129;
	public static boolean aBool3115;
	static int anInt3139;
	int[] anIntArray3140;
	int anInt3132;
	int anInt3121;
	static Class254 aClass254_3120;
	long aLong3124 = Class169.method2869(1926471611);
	long aLong3128 = 0L;
	boolean aBool3133 = true;
	int anInt3114 = 0;
	int anInt3125;
	int anInt3131 = 0;
	long aLong3126 = 0L;
	int anInt3130 = 0;
	boolean aBool3135 = false;
	int anInt3117 = 0;
	int anInt3123 = 32;
	Class282_Sub15[] aClass282_Sub15Array3116 = new Class282_Sub15[8];
	Class282_Sub15[] aClass282_Sub15Array3141 = new Class282_Sub15[8];

	public final synchronized void method4329(Class282_Sub15 class282_sub15_1) {
		this.aClass282_Sub15_3122 = class282_sub15_1;
	}

	public static final void method4330(int i_0, boolean bool_1, int i_2) {
		if (i_0 >= 8000 && i_0 <= 48000) {
			anInt3129 = i_0;
			aBool3115 = bool_1;
			anInt3139 = i_2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static final Class253 method4331(Component component_0, int i_1, int i_2) {
		if (anInt3129 == 0) {
			throw new IllegalStateException();
		} else if (i_1 >= 0 && i_1 < 2) {
			if (i_2 < 256) {
				i_2 = 256;
			}

			try {
				Class253_Sub1 class253_sub1_4 = new Class253_Sub1();
				class253_sub1_4.anIntArray3140 = new int[256 * (aBool3115 ? 2 : 1)];
				class253_sub1_4.anInt3132 = i_2;
				class253_sub1_4.method4370(component_0);
				class253_sub1_4.anInt3121 = (i_2 & ~0x3ff) + 1024;
				if (class253_sub1_4.anInt3121 > 16384) {
					class253_sub1_4.anInt3121 = 16384;
				}

				class253_sub1_4.method4361(class253_sub1_4.anInt3121);
				if (anInt3139 > 0 && aClass254_3120 == null) {
					aClass254_3120 = new Class254_Sub1();
					Thread thread_5 = new Thread(aClass254_3120);
					thread_5.setDaemon(true);
					thread_5.start();
					thread_5.setPriority(anInt3139);
				}

				if (aClass254_3120 != null) {
					if (aClass254_3120.aClass253Array3142[i_1] != null) {
						throw new IllegalArgumentException();
					}

					aClass254_3120.aClass253Array3142[i_1] = class253_sub1_4;
				}

				return class253_sub1_4;
			} catch (Throwable throwable_6) {
				return new Class253();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public final synchronized void method4333() {
		if (!this.aBool3135) {
			long long_1 = Class169.method2869(1993392309);

			try {
				if (long_1 > this.aLong3124 + 6000L) {
					this.aLong3124 = long_1 - 6000L;
				}

				while (long_1 > this.aLong3124 + 5000L) {
					this.method4373(256);
					this.aLong3124 += (long) (256000 / anInt3129);
					long_1 = Class169.method2869(1843823776);
				}
			} catch (Exception exception_7) {
				this.aLong3124 = long_1;
			}

			if (this.anIntArray3140 != null) {
				try {
					if (this.aLong3128 != 0L) {
						if (long_1 < this.aLong3128) {
							return;
						}

						this.method4361(this.anInt3121);
						this.aLong3128 = 0L;
						this.aBool3133 = true;
					}

					int i_5 = this.method4340();
					if (this.anInt3131 - i_5 > this.anInt3114) {
						this.anInt3114 = this.anInt3131 - i_5;
					}

					int i_4 = this.anInt3132 + this.anInt3125;
					if (i_4 + 256 > 16384) {
						i_4 = 16128;
					}

					if (i_4 + 256 > this.anInt3121) {
						this.anInt3121 += 1024;
						if (this.anInt3121 > 16384) {
							this.anInt3121 = 16384;
						}

						this.method4343();
						this.method4361(this.anInt3121);
						i_5 = 0;
						this.aBool3133 = true;
						if (i_4 + 256 > this.anInt3121) {
							i_4 = this.anInt3121 - 256;
							this.anInt3125 = i_4 - this.anInt3132;
						}
					}

					while (i_5 < i_4) {
						this.method4337(this.anIntArray3140, 256);
						this.method4342();
						i_5 += 256;
					}

					if (long_1 > this.aLong3126) {
						if (!this.aBool3133) {
							if (this.anInt3114 == 0 && this.anInt3130 == 0) {
								this.method4343();
								this.aLong3128 = long_1 + 2000L;
								return;
							}

							this.anInt3125 = Math.min(this.anInt3130, this.anInt3114);
							this.anInt3130 = this.anInt3114;
						} else {
							this.aBool3133 = false;
						}

						this.anInt3114 = 0;
						this.aLong3126 = long_1 + 2000L;
					}

					this.anInt3131 = i_5;
				} catch (Exception exception_6) {
					this.method4343();
					this.aLong3128 = long_1 + 2000L;
				}
			}
		}

	}

	public final synchronized void method4334() {
		this.aBool3133 = true;

		try {
			this.method4344();
		} catch (Exception exception_2) {
			this.method4343();
			this.aLong3128 = Class169.method2869(1703218389) + 2000L;
		}

	}

	public final synchronized void method4335() {
		if (aClass254_3120 != null) {
			boolean bool_1 = true;

			for (int i_2 = 0; i_2 < 2; i_2++) {
				if (this == aClass254_3120.aClass253Array3142[i_2]) {
					aClass254_3120.aClass253Array3142[i_2] = null;
				}

				if (aClass254_3120.aClass253Array3142[i_2] != null) {
					bool_1 = false;
				}
			}

			if (bool_1) {
				aClass254_3120.aBool3143 = true;

				while (aClass254_3120.aBool3144) {
					Class89.method1504(50L);
				}

				aClass254_3120 = null;
			}
		}

		this.method4343();
		this.anIntArray3140 = null;
		this.aBool3135 = true;
	}

	final void method4337(int[] ints_1, int i_2) {
		int i_3 = i_2;
		if (aBool3115) {
			i_3 = i_2 << 1;
		}

		Arrays.fill(ints_1, 0, i_3, 0);
		this.anInt3117 -= i_2;
		if (this.aClass282_Sub15_3122 != null && this.anInt3117 <= 0) {
			this.anInt3117 += anInt3129 >> 4;
			method4338(this.aClass282_Sub15_3122);
			this.method4339(this.aClass282_Sub15_3122, this.aClass282_Sub15_3122.method12225());
			int i_4 = 0;
			int i_5 = 255;

			int i_6;
			Class282_Sub15 class282_sub15_10;
			label107: for (i_6 = 7; i_5 != 0; --i_6) {
				int i_16;
				int i_17;
				if (i_6 < 0) {
					i_16 = i_6 & 0x3;
					i_17 = -(i_6 >> 2);
				} else {
					i_16 = i_6;
					i_17 = 0;
				}

				for (int i_9 = i_5 >>> i_16 & 0x11111111; i_9 != 0; i_9 >>>= 4) {
					if ((i_9 & 0x1) != 0) {
						i_5 &= ~(1 << i_16);
						class282_sub15_10 = null;
						Class282_Sub15 class282_sub15_11 = this.aClass282_Sub15Array3116[i_16];

						label101: while (true) {
							while (true) {
								if (class282_sub15_11 == null) {
									break label101;
								}

								Class282_Sub26 class282_sub26_12 = class282_sub15_11.aClass282_Sub26_7601;
								if (class282_sub26_12 != null && class282_sub26_12.anInt7690 > i_17) {
									i_5 |= 1 << i_16;
									class282_sub15_10 = class282_sub15_11;
									class282_sub15_11 = class282_sub15_11.aClass282_Sub15_7598;
								} else {
									class282_sub15_11.aBool7600 = true;
									int i_13 = class282_sub15_11.method12228();
									i_4 += i_13;
									if (class282_sub26_12 != null) {
										class282_sub26_12.anInt7690 += i_13;
									}

									if (i_4 >= this.anInt3123) {
										break label107;
									}

									Class282_Sub15 class282_sub15_14 = class282_sub15_11.method12226();
									if (class282_sub15_14 != null) {
										for (int i_15 = class282_sub15_11.anInt7599; class282_sub15_14 != null; class282_sub15_14 = class282_sub15_11.method12239()) {
											this.method4339(class282_sub15_14, i_15 * class282_sub15_14.method12225() >> 8);
										}
									}

									Class282_Sub15 class282_sub15_18 = class282_sub15_11.aClass282_Sub15_7598;
									class282_sub15_11.aClass282_Sub15_7598 = null;
									if (class282_sub15_10 == null) {
										this.aClass282_Sub15Array3116[i_16] = class282_sub15_18;
									} else {
										class282_sub15_10.aClass282_Sub15_7598 = class282_sub15_18;
									}

									if (class282_sub15_18 == null) {
										this.aClass282_Sub15Array3141[i_16] = class282_sub15_10;
									}

									class282_sub15_11 = class282_sub15_18;
								}
							}
						}
					}

					i_16 += 4;
					++i_17;
				}
			}

			for (i_6 = 0; i_6 < 8; i_6++) {
				Class282_Sub15 class282_sub15_7 = this.aClass282_Sub15Array3116[i_6];
				Class282_Sub15[] arr_8 = this.aClass282_Sub15Array3116;
				this.aClass282_Sub15Array3141[i_6] = null;

				for (arr_8[i_6] = null; class282_sub15_7 != null; class282_sub15_7 = class282_sub15_10) {
					class282_sub15_10 = class282_sub15_7.aClass282_Sub15_7598;
					class282_sub15_7.aClass282_Sub15_7598 = null;
				}
			}
		}

		if (this.anInt3117 < 0) {
			this.anInt3117 = 0;
		}

		if (this.aClass282_Sub15_3122 != null) {
			this.aClass282_Sub15_3122.method12230(ints_1, 0, i_2);
		}

		this.aLong3124 = Class169.method2869(1568857193);
	}

	static final void method4338(Class282_Sub15 class282_sub15_0) {
		class282_sub15_0.aBool7600 = false;
		if (class282_sub15_0.aClass282_Sub26_7601 != null) {
			class282_sub15_0.aClass282_Sub26_7601.anInt7690 = 0;
		}

		for (Class282_Sub15 class282_sub15_1 = class282_sub15_0.method12226(); class282_sub15_1 != null; class282_sub15_1 = class282_sub15_0.method12239()) {
			method4338(class282_sub15_1);
		}

	}

	final void method4339(Class282_Sub15 class282_sub15_1, int i_2) {
		int i_3 = i_2 >> 5;
		Class282_Sub15 class282_sub15_4 = this.aClass282_Sub15Array3141[i_3];
		if (class282_sub15_4 == null) {
			this.aClass282_Sub15Array3116[i_3] = class282_sub15_1;
		} else {
			class282_sub15_4.aClass282_Sub15_7598 = class282_sub15_1;
		}

		this.aClass282_Sub15Array3141[i_3] = class282_sub15_1;
		class282_sub15_1.anInt7599 = i_2;
	}

	int method4340() throws Exception {
		return this.anInt3121;
	}

	void method4342() throws Exception {
	}

	void method4343() {
	}

	void method4344() throws Exception {
	}

	void method4361(int i_1) throws Exception {
	}

	void method4370(Component component_1) throws Exception {
	}

	final void method4373(int i_1) {
		this.anInt3117 -= i_1;
		if (this.anInt3117 < 0) {
			this.anInt3117 = 0;
		}

		if (this.aClass282_Sub15_3122 != null) {
			this.aClass282_Sub15_3122.method12231(i_1);
		}

	}

}
