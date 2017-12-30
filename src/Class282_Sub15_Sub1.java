/* Class282_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub15_Sub1 extends Class282_Sub15 {
	int anInt9565;
	static final int anInt9566 = 100;
	int anInt9567;
	Class482 aClass482_9568 = new Class482();
	int anInt9569 = 0;
	int anInt9570;
	boolean aBool9571;
	int anInt9572;
	static Class321 aClass321_9573 = new Class321(64, Class332.aClass332_3875);
	boolean aBool9574;
	static int anInt9575;

	synchronized void method14808(byte i) {
		((Class282_Sub15_Sub1) this).aBool9571 = true;
	}

	synchronized Class282_Sub39 method14809() {
		return (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 53);
	}

	synchronized void method12230(int[] is, int i, int i_0_) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			if (method14812(1416311209) == null) {
				if (((Class282_Sub15_Sub1) this).aBool9571) {
					method4991(-371378792);
					aClass321_9573.method5744((byte) 56);
				}
			} else {
				int i_1_ = i + i_0_;
				if (Class253.aBool3115)
					i_1_ <<= 1;
				int i_2_ = 0;
				int i_3_ = 0;
				if (2 == 1508954819 * ((Class282_Sub15_Sub1) this).anInt9567)
					i_3_ = 1;
				while (i < i_1_) {
					Class282_Sub39 class282_sub39 = method14812(1416311209);
					if (null == class282_sub39)
						break;
					short[][] is_4_;
					for (is_4_ = (((Class282_Sub39) class282_sub39).aShortArrayArray8003); i < i_1_ && (((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) < is_4_[0].length; ((Class282_Sub15_Sub1) this).anInt9570 += -235363691) {
						if (Class253.aBool3115) {
							is[i++] = (((Class282_Sub15_Sub1) this).anInt9565 * 1644019701 * (is_4_[i_2_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]));
							is[i++] = (is_4_[i_3_][(-1326835523 * (((Class282_Sub15_Sub1) this).anInt9570))] * (-1731402595 * (((Class282_Sub15_Sub1) this).anInt9572)));
						} else
							is[i++] += (((is_4_[i_3_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]) * (((Class282_Sub15_Sub1) this).anInt9572 * -1731402595)) + ((is_4_[i_2_][(((Class282_Sub15_Sub1) this).anInt9570) * -1326835523]) * ((((Class282_Sub15_Sub1) this).anInt9565) * 1644019701)));
					}
					if (-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570 >= is_4_[0].length)
						method14813(-935693077);
				}
			}
		}
	}

	Class282_Sub39 method14810(int i, double d) {
		long l = (long) (1508954819 * ((Class282_Sub15_Sub1) this).anInt9567 << 32 | i);
		Class282_Sub39 class282_sub39 = ((Class282_Sub39) aClass321_9573.method5739(Long.valueOf(l), (byte) 0));
		if (null != class282_sub39) {
			((Class282_Sub39) class282_sub39).aDouble8004 = d;
			aClass321_9573.method5737(Long.valueOf(l), -1701862442);
		} else
			class282_sub39 = new Class282_Sub39(new short[(((Class282_Sub15_Sub1) this).anInt9567) * 1508954819][i], d);
		return class282_sub39;
	}

	synchronized int method14811(int i) {
		return -1438659995 * ((Class282_Sub15_Sub1) this).anInt9569;
	}

	synchronized Class282_Sub39 method14812(int i) {
		return (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 60);
	}

	synchronized void method14813(int i) {
		Class282_Sub39 class282_sub39 = method14812(1416311209);
		if (null != class282_sub39) {
			class282_sub39.method4991(-371378792);
			((Class282_Sub15_Sub1) this).anInt9570 = 0;
			((Class282_Sub15_Sub1) this).anInt9569 -= -458434707;
			aClass321_9573.method5740(Long.valueOf(class282_sub39.method13294(108092461)), class282_sub39, -1742340748);
		}
	}

	Class282_Sub39 method14814(int i, double d) {
		long l = (long) (1508954819 * ((Class282_Sub15_Sub1) this).anInt9567 << 32 | i);
		Class282_Sub39 class282_sub39 = ((Class282_Sub39) aClass321_9573.method5739(Long.valueOf(l), (byte) 0));
		if (null != class282_sub39) {
			((Class282_Sub39) class282_sub39).aDouble8004 = d;
			aClass321_9573.method5737(Long.valueOf(l), -1701862442);
		} else
			class282_sub39 = new Class282_Sub39(new short[(((Class282_Sub15_Sub1) this).anInt9567) * 1508954819][i], d);
		return class282_sub39;
	}

	synchronized void method14815(Class282_Sub39 class282_sub39, int i) {
		for (/**/; -1438659995 * ((Class282_Sub15_Sub1) this).anInt9569 >= 100; ((Class282_Sub15_Sub1) this).anInt9569 -= -458434707)
			((Class282_Sub15_Sub1) this).aClass482_9568.method8061((byte) -124);
		((Class282_Sub15_Sub1) this).aClass482_9568.method8059(class282_sub39, 1091702645);
		((Class282_Sub15_Sub1) this).anInt9569 += -458434707;
	}

	int method12244() {
		return 1;
	}

	Class282_Sub15_Sub1(int i) {
		((Class282_Sub15_Sub1) this).anInt9565 = -709600000;
		((Class282_Sub15_Sub1) this).anInt9572 = 1757525248;
		((Class282_Sub15_Sub1) this).anInt9567 = i * 586214891;
	}

	synchronized void method14816(boolean bool, int i) {
		((Class282_Sub15_Sub1) this).aBool9574 = bool;
	}

	int method12228() {
		return 1;
	}

	synchronized void method12231(int i) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			for (;;) {
				Class282_Sub39 class282_sub39 = method14812(1416311209);
				if (class282_sub39 == null) {
					if (((Class282_Sub15_Sub1) this).aBool9571) {
						method4991(-371378792);
						aClass321_9573.method5744((byte) 21);
					}
					break;
				}
				if (((((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length - ((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) > i) {
					((Class282_Sub15_Sub1) this).anInt9570 += i * -235363691;
					break;
				}
				i -= ((((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length - ((Class282_Sub15_Sub1) this).anInt9570 * -1326835523);
				method14813(581758156);
			}
		}
	}

	synchronized void method12242(int[] is, int i, int i_5_) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			if (method14812(1416311209) == null) {
				if (((Class282_Sub15_Sub1) this).aBool9571) {
					method4991(-371378792);
					aClass321_9573.method5744((byte) 102);
				}
			} else {
				int i_6_ = i + i_5_;
				if (Class253.aBool3115)
					i_6_ <<= 1;
				int i_7_ = 0;
				int i_8_ = 0;
				if (2 == 1508954819 * ((Class282_Sub15_Sub1) this).anInt9567)
					i_8_ = 1;
				while (i < i_6_) {
					Class282_Sub39 class282_sub39 = method14812(1416311209);
					if (null == class282_sub39)
						break;
					short[][] is_9_;
					for (is_9_ = (((Class282_Sub39) class282_sub39).aShortArrayArray8003); i < i_6_ && (((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) < is_9_[0].length; ((Class282_Sub15_Sub1) this).anInt9570 += -235363691) {
						if (Class253.aBool3115) {
							is[i++] = (((Class282_Sub15_Sub1) this).anInt9565 * 1644019701 * (is_9_[i_7_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]));
							is[i++] = (is_9_[i_8_][(-1326835523 * (((Class282_Sub15_Sub1) this).anInt9570))] * (-1731402595 * (((Class282_Sub15_Sub1) this).anInt9572)));
						} else
							is[i++] += (((is_9_[i_8_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]) * (((Class282_Sub15_Sub1) this).anInt9572 * -1731402595)) + ((is_9_[i_7_][(((Class282_Sub15_Sub1) this).anInt9570) * -1326835523]) * ((((Class282_Sub15_Sub1) this).anInt9565) * 1644019701)));
					}
					if (-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570 >= is_9_[0].length)
						method14813(-284910116);
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

	static Class486[] method14817(int i) {
		return (new Class486[] { Class486.aClass486_5745, Class486.aClass486_5743, Class486.aClass486_5750, Class486.aClass486_5747, Class486.aClass486_5744 });
	}

	int method12224() {
		return 1;
	}

	int method12238() {
		return 1;
	}

	static final void method14818(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class47_Sub1.aClass262_9143.method4639("jagtheora", (short) 255) ? 1 : 0);
	}

	synchronized void method12240(int[] is, int i, int i_10_) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			if (method14812(1416311209) == null) {
				if (((Class282_Sub15_Sub1) this).aBool9571) {
					method4991(-371378792);
					aClass321_9573.method5744((byte) 18);
				}
			} else {
				int i_11_ = i + i_10_;
				if (Class253.aBool3115)
					i_11_ <<= 1;
				int i_12_ = 0;
				int i_13_ = 0;
				if (2 == 1508954819 * ((Class282_Sub15_Sub1) this).anInt9567)
					i_13_ = 1;
				while (i < i_11_) {
					Class282_Sub39 class282_sub39 = method14812(1416311209);
					if (null == class282_sub39)
						break;
					short[][] is_14_;
					for (is_14_ = (((Class282_Sub39) class282_sub39).aShortArrayArray8003); i < i_11_ && (((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) < is_14_[0].length; ((Class282_Sub15_Sub1) this).anInt9570 += -235363691) {
						if (Class253.aBool3115) {
							is[i++] = (((Class282_Sub15_Sub1) this).anInt9565 * 1644019701 * (is_14_[i_12_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]));
							is[i++] = ((is_14_[i_13_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]) * (-1731402595 * (((Class282_Sub15_Sub1) this).anInt9572)));
						} else
							is[i++] += (((is_14_[i_13_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]) * (((Class282_Sub15_Sub1) this).anInt9572 * -1731402595)) + ((is_14_[i_12_][(((Class282_Sub15_Sub1) this).anInt9570) * -1326835523]) * ((((Class282_Sub15_Sub1) this).anInt9565) * 1644019701)));
					}
					if (-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570 >= is_14_[0].length)
						method14813(658215674);
				}
			}
		}
	}

	synchronized void method12241(int[] is, int i, int i_15_) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			if (method14812(1416311209) == null) {
				if (((Class282_Sub15_Sub1) this).aBool9571) {
					method4991(-371378792);
					aClass321_9573.method5744((byte) 11);
				}
			} else {
				int i_16_ = i + i_15_;
				if (Class253.aBool3115)
					i_16_ <<= 1;
				int i_17_ = 0;
				int i_18_ = 0;
				if (2 == 1508954819 * ((Class282_Sub15_Sub1) this).anInt9567)
					i_18_ = 1;
				while (i < i_16_) {
					Class282_Sub39 class282_sub39 = method14812(1416311209);
					if (null == class282_sub39)
						break;
					short[][] is_19_;
					for (is_19_ = (((Class282_Sub39) class282_sub39).aShortArrayArray8003); i < i_16_ && (((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) < is_19_[0].length; ((Class282_Sub15_Sub1) this).anInt9570 += -235363691) {
						if (Class253.aBool3115) {
							is[i++] = (((Class282_Sub15_Sub1) this).anInt9565 * 1644019701 * (is_19_[i_17_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]));
							is[i++] = ((is_19_[i_18_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]) * (-1731402595 * (((Class282_Sub15_Sub1) this).anInt9572)));
						} else
							is[i++] += (((is_19_[i_18_][-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570]) * (((Class282_Sub15_Sub1) this).anInt9572 * -1731402595)) + ((is_19_[i_17_][(((Class282_Sub15_Sub1) this).anInt9570) * -1326835523]) * ((((Class282_Sub15_Sub1) this).anInt9565) * 1644019701)));
					}
					if (-1326835523 * ((Class282_Sub15_Sub1) this).anInt9570 >= is_19_[0].length)
						method14813(1800540316);
				}
			}
		}
	}

	synchronized double method14819(int i) {
		if (((Class282_Sub15_Sub1) this).anInt9569 * -1438659995 < 1)
			return -1.0;
		Class282_Sub39 class282_sub39 = (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 95);
		if (null == class282_sub39)
			return -1.0;
		return (((Class282_Sub39) class282_sub39).aDouble8004 - (double) ((float) (((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length / (float) Class253.anInt3129));
	}

	public void method14820(int i, int i_20_) {
		((Class282_Sub15_Sub1) this).anInt9565 = 299218013 * i;
		((Class282_Sub15_Sub1) this).anInt9572 = i * 1802027445;
	}

	synchronized void method12234(int i) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			for (;;) {
				Class282_Sub39 class282_sub39 = method14812(1416311209);
				if (class282_sub39 == null) {
					if (((Class282_Sub15_Sub1) this).aBool9571) {
						method4991(-371378792);
						aClass321_9573.method5744((byte) 96);
					}
					break;
				}
				if (((((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length - ((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) > i) {
					((Class282_Sub15_Sub1) this).anInt9570 += i * -235363691;
					break;
				}
				i -= ((((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length - ((Class282_Sub15_Sub1) this).anInt9570 * -1326835523);
				method14813(1057139444);
			}
		}
	}

	public void method14821(int i) {
		((Class282_Sub15_Sub1) this).anInt9565 = 299218013 * i;
		((Class282_Sub15_Sub1) this).anInt9572 = i * 1802027445;
	}

	int method12227() {
		return 1;
	}

	synchronized int method14822() {
		return -1438659995 * ((Class282_Sub15_Sub1) this).anInt9569;
	}

	synchronized Class282_Sub39 method14823() {
		return (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 40);
	}

	Class282_Sub15 method12239() {
		return null;
	}

	synchronized Class282_Sub39 method14824() {
		return (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 49);
	}

	synchronized Class282_Sub39 method14825() {
		return (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 36);
	}

	synchronized void method12243(int i) {
		if (!((Class282_Sub15_Sub1) this).aBool9574) {
			for (;;) {
				Class282_Sub39 class282_sub39 = method14812(1416311209);
				if (class282_sub39 == null) {
					if (((Class282_Sub15_Sub1) this).aBool9571) {
						method4991(-371378792);
						aClass321_9573.method5744((byte) 53);
					}
					break;
				}
				if (((((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length - ((Class282_Sub15_Sub1) this).anInt9570 * -1326835523) > i) {
					((Class282_Sub15_Sub1) this).anInt9570 += i * -235363691;
					break;
				}
				i -= ((((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length - ((Class282_Sub15_Sub1) this).anInt9570 * -1326835523);
				method14813(912660599);
			}
		}
	}

	Class282_Sub15 method12226() {
		return null;
	}

	synchronized void method14826(Class282_Sub39 class282_sub39) {
		for (/**/; -1438659995 * ((Class282_Sub15_Sub1) this).anInt9569 >= 100; ((Class282_Sub15_Sub1) this).anInt9569 -= -458434707)
			((Class282_Sub15_Sub1) this).aClass482_9568.method8061((byte) -31);
		((Class282_Sub15_Sub1) this).aClass482_9568.method8059(class282_sub39, 582902953);
		((Class282_Sub15_Sub1) this).anInt9569 += -458434707;
	}

	synchronized void method14827(Class282_Sub39 class282_sub39) {
		for (/**/; -1438659995 * ((Class282_Sub15_Sub1) this).anInt9569 >= 100; ((Class282_Sub15_Sub1) this).anInt9569 -= -458434707)
			((Class282_Sub15_Sub1) this).aClass482_9568.method8061((byte) -100);
		((Class282_Sub15_Sub1) this).aClass482_9568.method8059(class282_sub39, 1479246241);
		((Class282_Sub15_Sub1) this).anInt9569 += -458434707;
	}

	synchronized int method14828() {
		return -1438659995 * ((Class282_Sub15_Sub1) this).anInt9569;
	}

	Class282_Sub39 method14829(int i, double d) {
		long l = (long) (1508954819 * ((Class282_Sub15_Sub1) this).anInt9567 << 32 | i);
		Class282_Sub39 class282_sub39 = ((Class282_Sub39) aClass321_9573.method5739(Long.valueOf(l), (byte) 0));
		if (null != class282_sub39) {
			((Class282_Sub39) class282_sub39).aDouble8004 = d;
			aClass321_9573.method5737(Long.valueOf(l), -1701862442);
		} else
			class282_sub39 = new Class282_Sub39(new short[(((Class282_Sub15_Sub1) this).anInt9567) * 1508954819][i], d);
		return class282_sub39;
	}

	synchronized void method14830() {
		((Class282_Sub15_Sub1) this).aBool9571 = true;
	}

	synchronized void method14831(boolean bool) {
		((Class282_Sub15_Sub1) this).aBool9574 = bool;
	}

	synchronized void method14832(boolean bool) {
		((Class282_Sub15_Sub1) this).aBool9574 = bool;
	}

	static final void method14833(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -520818011 * TilestreamPacket.anInt4219;
	}

	synchronized void method14834() {
		((Class282_Sub15_Sub1) this).aBool9571 = true;
	}

	static final void method14835(CS2Executor class527, byte i) {
		int i_21_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i_21_, (byte) -1);
		String string = "";
		if (null != class108 && null != class108.aString1089)
			string = class108.aString1089;
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method14836(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_22_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		boolean bool = ((((CS2Executor) class527).intStack[1 + 1942118537 * ((CS2Executor) class527).anInt7012]) == 1);
		if (null != Class291_Sub1.aClass465_8025) {
			Class282 class282 = Class291_Sub1.aClass465_8025.method7754((long) i_22_);
			if (class282 != null && !bool)
				class282.method4991(-371378792);
			else if (class282 == null && bool) {
				class282 = new Class282();
				Class291_Sub1.aClass465_8025.method7765(class282, (long) i_22_);
			}
		}
	}

	synchronized double method14837() {
		if (((Class282_Sub15_Sub1) this).anInt9569 * -1438659995 < 1)
			return -1.0;
		Class282_Sub39 class282_sub39 = (Class282_Sub39) ((Class282_Sub15_Sub1) this).aClass482_9568.method8097((byte) 82);
		if (null == class282_sub39)
			return -1.0;
		return (((Class282_Sub39) class282_sub39).aDouble8004 - (double) ((float) (((Class282_Sub39) class282_sub39).aShortArrayArray8003[0]).length / (float) Class253.anInt3129));
	}

	synchronized void method14838(boolean bool) {
		((Class282_Sub15_Sub1) this).aBool9574 = bool;
	}

	static final void method14839(CS2Executor class527, byte i) {
		if (client.aBool7310)
			Class361.aClass361_4177.method6257(1901306878);
	}

	public static final void method14840(byte i) {
		Class263.aClass273_3244.method4853(-1473028742);
		for (int i_23_ = 0; i_23_ < 32; i_23_++)
			Class263.aLongArray3246[i_23_] = 0L;
		for (int i_24_ = 0; i_24_ < 32; i_24_++)
			Class263.aLongArray3247[i_24_] = 0L;
		Class263.anInt3279 = 0;
	}

	static void method14841(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 - 2] = (Class409.aClass242_4922.method4156((((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 - 2]), -1396181317).method4111(client.anIntArray7337, (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 - 1]), -1427910028)) ? 1 : 0;
		((CS2Executor) class527).anInt7012 -= 141891001;
	}
}
