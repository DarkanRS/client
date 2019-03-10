public class Class282_Sub15_Sub1 extends Class282_Sub15 {

	static int anInt9575;

	static Class321 aClass321_9573;

	boolean aBool9571;

	int anInt9570;

	int anInt9569 = 0;

	NodeCollection aClass482_9568 = new NodeCollection();

	int anInt9565 = 256;

	int anInt9572 = 256;

	int anInt9567;

	boolean aBool9574;

	static {
		aClass321_9573 = new Class321(64, Class332.aClass332_3875);
	}

	synchronized void method14808(byte b_1) {
		this.aBool9571 = true;
	}

	synchronized void method12230(int[] ints_1, int i_2, int i_3) {
		if (!this.aBool9574) {
			if (this.method14812(1416311209) == null) {
				if (this.aBool9571) {
					this.remove();
					aClass321_9573.method5744((byte) 56);
				}
			} else {
				int i_4 = i_3 + i_2;
				if (Class253.aBool3115) {
					i_4 <<= 1;
				}
				byte b_5 = 0;
				byte b_6 = 0;
				if (this.anInt9567 == 2) {
					b_6 = 1;
				}
				while (i_2 < i_4) {
					Class282_Sub39 class282_sub39_7 = this.method14812(1416311209);
					if (class282_sub39_7 == null) {
						break;
					}
					short[][] shorts_8;
					for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && this.anInt9570 < shorts_8[0].length; this.anInt9570++) {
						if (Class253.aBool3115) {
							ints_1[i_2++] = shorts_8[b_5][this.anInt9570] * this.anInt9565;
							ints_1[i_2++] = shorts_8[b_6][this.anInt9570] * this.anInt9572;
						} else {
							int i_10001 = i_2++;
							ints_1[i_10001] += shorts_8[b_6][this.anInt9570] * this.anInt9572 + shorts_8[b_5][this.anInt9570] * this.anInt9565;
						}
					}
					if (this.anInt9570 >= shorts_8[0].length) {
						this.method14813(-935693077);
					}
				}
			}
		}
	}

	synchronized int method14811(int i_1) {
		return this.anInt9569;
	}

	synchronized Class282_Sub39 method14812(int i_1) {
		return (Class282_Sub39) this.aClass482_9568.head((byte) 60);
	}

	synchronized void method14813(int i_1) {
		Class282_Sub39 class282_sub39_2 = this.method14812(1416311209);
		if (class282_sub39_2 != null) {
			class282_sub39_2.remove();
			this.anInt9570 = 0;
			--this.anInt9569;
			aClass321_9573.method5740(Long.valueOf(class282_sub39_2.method13294(108092461)), class282_sub39_2, -1742340748);
		}
	}

	Class282_Sub39 method14814(int i_1, double d_2) {
		long long_4 = (long) (this.anInt9567 << 32 | i_1);
		Class282_Sub39 class282_sub39_6 = (Class282_Sub39) aClass321_9573.method5739(Long.valueOf(long_4), (byte) 0);
		if (class282_sub39_6 != null) {
			class282_sub39_6.aDouble8004 = d_2;
			aClass321_9573.method5737(Long.valueOf(long_4), -1701862442);
		} else {
			class282_sub39_6 = new Class282_Sub39(new short[this.anInt9567][i_1], d_2);
		}
		return class282_sub39_6;
	}

	synchronized void method14815(Class282_Sub39 class282_sub39_1, int i_2) {
		while (this.anInt9569 >= 100) {
			this.aClass482_9568.popHead((byte) -124);
			--this.anInt9569;
		}
		this.aClass482_9568.append(class282_sub39_1, 1091702645);
		++this.anInt9569;
	}

	int method12244() {
		return 1;
	}

	Class282_Sub15_Sub1(int i_1) {
		this.anInt9567 = i_1;
	}

	synchronized void method14816(boolean bool_1, int i_2) {
		this.aBool9574 = bool_1;
	}

	int method12228() {
		return 1;
	}

	synchronized void method12231(int i_1) {
		if (!this.aBool9574) {
			while (true) {
				Class282_Sub39 class282_sub39_2 = this.method14812(1416311209);
				if (class282_sub39_2 == null) {
					if (this.aBool9571) {
						this.remove();
						aClass321_9573.method5744((byte) 21);
					}
					break;
				}
				if (class282_sub39_2.aShortArrayArray8003[0].length - this.anInt9570 > i_1) {
					this.anInt9570 += i_1;
					break;
				}
				i_1 -= class282_sub39_2.aShortArrayArray8003[0].length - this.anInt9570;
				this.method14813(581758156);
			}
		}
	}

	synchronized void method12242(int[] ints_1, int i_2, int i_3) {
		if (!this.aBool9574) {
			if (this.method14812(1416311209) == null) {
				if (this.aBool9571) {
					this.remove();
					aClass321_9573.method5744((byte) 102);
				}
			} else {
				int i_4 = i_2 + i_3;
				if (Class253.aBool3115) {
					i_4 <<= 1;
				}
				byte b_5 = 0;
				byte b_6 = 0;
				if (1508954819 * this.anInt9567 * 586214891 == 2) {
					b_6 = 1;
				}
				while (i_2 < i_4) {
					Class282_Sub39 class282_sub39_7 = this.method14812(1416311209);
					if (class282_sub39_7 == null) {
						break;
					}
					short[][] shorts_8;
					for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && this.anInt9570 * -235363691 * -1326835523 < shorts_8[0].length; this.anInt9570 = (this.anInt9570 * -235363691 + -235363691) * -1326835523) {
						if (Class253.aBool3115) {
							ints_1[i_2++] = this.anInt9565 * 299218013 * 1644019701 * shorts_8[b_5][-1326835523 * this.anInt9570 * -235363691];
							ints_1[i_2++] = shorts_8[b_6][-1326835523 * this.anInt9570 * -235363691] * -1731402595 * this.anInt9572 * 1802027445;
						} else {
							int i_10001 = i_2++;
							ints_1[i_10001] += shorts_8[b_6][-1326835523 * this.anInt9570 * -235363691] * this.anInt9572 * 1802027445 * -1731402595 + shorts_8[b_5][this.anInt9570 * -235363691 * -1326835523] * this.anInt9565 * 299218013 * 1644019701;
						}
					}
					if (-1326835523 * this.anInt9570 * -235363691 >= shorts_8[0].length) {
						this.method14813(-284910116);
					}
				}
			}
		}
	}

	Class282_Sub15 method12232() {
		return null;
	}

	Class282_Sub15 method12233() {
		return null;
	}

	Class282_Sub15 method12229() {
		return null;
	}

	Class282_Sub15 method12235() {
		return null;
	}

	Class282_Sub15 method12236() {
		return null;
	}

	static Game[] method14817(int i_0) {
		return new Game[] { Game.aClass486_5745, Game.aClass486_5743, Game.stellarDawn, Game.aClass486_5747, Game.darkan };
	}

	int method12224() {
		return 1;
	}

	int method12238() {
		return 1;
	}

	synchronized void method12240(int[] ints_1, int i_2, int i_3) {
		if (!this.aBool9574) {
			if (this.method14812(1416311209) == null) {
				if (this.aBool9571) {
					this.remove();
					aClass321_9573.method5744((byte) 18);
				}
			} else {
				int i_4 = i_2 + i_3;
				if (Class253.aBool3115) {
					i_4 <<= 1;
				}
				byte b_5 = 0;
				byte b_6 = 0;
				if (1508954819 * this.anInt9567 * 586214891 == 2) {
					b_6 = 1;
				}
				while (i_2 < i_4) {
					Class282_Sub39 class282_sub39_7 = this.method14812(1416311209);
					if (class282_sub39_7 == null) {
						break;
					}
					short[][] shorts_8;
					for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && this.anInt9570 * -235363691 * -1326835523 < shorts_8[0].length; this.anInt9570 = (this.anInt9570 * -235363691 + -235363691) * -1326835523) {
						if (Class253.aBool3115) {
							ints_1[i_2++] = this.anInt9565 * 299218013 * 1644019701 * shorts_8[b_5][-1326835523 * this.anInt9570 * -235363691];
							ints_1[i_2++] = shorts_8[b_6][-1326835523 * this.anInt9570 * -235363691] * -1731402595 * this.anInt9572 * 1802027445;
						} else {
							int i_10001 = i_2++;
							ints_1[i_10001] += shorts_8[b_6][-1326835523 * this.anInt9570 * -235363691] * this.anInt9572 * 1802027445 * -1731402595 + shorts_8[b_5][this.anInt9570 * -235363691 * -1326835523] * this.anInt9565 * 299218013 * 1644019701;
						}
					}
					if (-1326835523 * this.anInt9570 * -235363691 >= shorts_8[0].length) {
						this.method14813(658215674);
					}
				}
			}
		}
	}

	synchronized void method12241(int[] ints_1, int i_2, int i_3) {
		if (!this.aBool9574) {
			if (this.method14812(1416311209) == null) {
				if (this.aBool9571) {
					this.remove();
					aClass321_9573.method5744((byte) 11);
				}
			} else {
				int i_4 = i_2 + i_3;
				if (Class253.aBool3115) {
					i_4 <<= 1;
				}
				byte b_5 = 0;
				byte b_6 = 0;
				if (1508954819 * this.anInt9567 * 586214891 == 2) {
					b_6 = 1;
				}
				while (i_2 < i_4) {
					Class282_Sub39 class282_sub39_7 = this.method14812(1416311209);
					if (class282_sub39_7 == null) {
						break;
					}
					short[][] shorts_8;
					for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && this.anInt9570 * -235363691 * -1326835523 < shorts_8[0].length; this.anInt9570 = (this.anInt9570 * -235363691 + -235363691) * -1326835523) {
						if (Class253.aBool3115) {
							ints_1[i_2++] = this.anInt9565 * 299218013 * 1644019701 * shorts_8[b_5][-1326835523 * this.anInt9570 * -235363691];
							ints_1[i_2++] = shorts_8[b_6][-1326835523 * this.anInt9570 * -235363691] * -1731402595 * this.anInt9572 * 1802027445;
						} else {
							int i_10001 = i_2++;
							ints_1[i_10001] += shorts_8[b_6][-1326835523 * this.anInt9570 * -235363691] * this.anInt9572 * 1802027445 * -1731402595 + shorts_8[b_5][this.anInt9570 * -235363691 * -1326835523] * this.anInt9565 * 299218013 * 1644019701;
						}
					}
					if (-1326835523 * this.anInt9570 * -235363691 >= shorts_8[0].length) {
						this.method14813(1800540316);
					}
				}
			}
		}
	}

	synchronized double method14819(int i_1) {
		if (this.anInt9569 < 1) {
			return -1.0D;
		} else {
			Class282_Sub39 class282_sub39_2 = (Class282_Sub39) this.aClass482_9568.head((byte) 95);
			return class282_sub39_2 == null ? -1.0D : class282_sub39_2.aDouble8004 - (double) ((float) class282_sub39_2.aShortArrayArray8003[0].length / (float) Class253.anInt3129);
		}
	}

	public void method14820(int i_1, int i_2) {
		this.anInt9565 = i_1;
		this.anInt9572 = i_1;
	}

	synchronized void method12234(int i_1) {
		if (!this.aBool9574) {
			while (true) {
				Class282_Sub39 class282_sub39_2 = this.method14812(1416311209);
				if (class282_sub39_2 == null) {
					if (this.aBool9571) {
						this.remove();
						aClass321_9573.method5744((byte) 96);
					}
					break;
				}
				if (class282_sub39_2.aShortArrayArray8003[0].length - this.anInt9570 * -235363691 * -1326835523 > i_1) {
					this.anInt9570 = (this.anInt9570 * -235363691 + i_1 * -235363691) * -1326835523;
					break;
				}
				i_1 -= class282_sub39_2.aShortArrayArray8003[0].length - this.anInt9570 * -235363691 * -1326835523;
				this.method14813(1057139444);
			}
		}
	}

	int method12227() {
		return 1;
	}

	Class282_Sub15 method12239() {
		return null;
	}

	synchronized void method12243(int i_1) {
		if (!this.aBool9574) {
			while (true) {
				Class282_Sub39 class282_sub39_2 = this.method14812(1416311209);
				if (class282_sub39_2 == null) {
					if (this.aBool9571) {
						this.remove();
						aClass321_9573.method5744((byte) 53);
					}
					break;
				}
				if (class282_sub39_2.aShortArrayArray8003[0].length - this.anInt9570 * -235363691 * -1326835523 > i_1) {
					this.anInt9570 = (this.anInt9570 * -235363691 + i_1 * -235363691) * -1326835523;
					break;
				}
				i_1 -= class282_sub39_2.aShortArrayArray8003[0].length - this.anInt9570 * -235363691 * -1326835523;
				this.method14813(912660599);
			}
		}
	}

	Class282_Sub15 method12226() {
		return null;
	}

	public static final void method14840(byte b_0) {
		Engine.aClass273_3244.method4853(-1473028742);
		int i_1;
		for (i_1 = 0; i_1 < 32; i_1++) {
			Engine.aLongArray3246[i_1] = 0L;
		}
		for (i_1 = 0; i_1 < 32; i_1++) {
			Engine.aLongArray3247[i_1] = 0L;
		}
		Engine.anInt3279 = 0;
	}
}
