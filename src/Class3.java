/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3 implements Interface42 {
	static final long aLong21 = 500L;
	static final long aLong22 = 4611686018427387903L;
	static final long aLong23 = 4611686018427387904L;
	static final long aLong24 = 1L;
	int[] anIntArray25;
	public int[] anIntArray26;
	static int[] anIntArray27 = new int[32];
	IterableNodeMap aClass465_28 = new IterableNodeMap(128);

	public int method242(int i) {
		Class226 class226 = IndexLoaders.aClass230_147.method3897(i, (byte) 13);
		int i_0_ = -1764754967 * class226.anInt2784;
		int i_1_ = -1174362995 * class226.anInt2785;
		int i_2_ = class226.anInt2783 * -188179155;
		int i_3_ = anIntArray27[i_2_ - i_1_];
		return anIntArray26[i_0_] >> i_1_ & i_3_;
	}

	int method264(boolean bool, byte i) {
		long l = Class169.method2869(1700652075);
		for (Class282_Sub45 class282_sub45 = ((Class282_Sub45) (bool ? ((Class3) this).aClass465_28.method7750(-1019501860) : ((Class3) this).aClass465_28.method7751((byte) 13))); null != class282_sub45; class282_sub45 = (Class282_Sub45) ((Class3) this).aClass465_28.method7751((byte) 105)) {
			if ((3367138086658270151L * class282_sub45.aLong8066 & 0x3fffffffffffffffL) < l) {
				if (0L != (class282_sub45.aLong8066 * 3367138086658270151L & 0x4000000000000000L)) {
					int i_4_ = (int) (-3442165056282524525L * class282_sub45.data);
					anIntArray26[i_4_] = ((Class3) this).anIntArray25[i_4_];
					class282_sub45.remove();
					return i_4_;
				}
				class282_sub45.remove();
			}
		}
		return -1;
	}

	void method265(int i) {
		for (int i_5_ = 0; i_5_ < IndexLoaders.aClass377_1065.anInt4519 * -1456639697; i_5_++) {
			((Class3) this).anIntArray25[i_5_] = 0;
			anIntArray26[i_5_] = 0;
		}
		((Class3) this).aClass465_28 = new IterableNodeMap(128);
	}

	public void method266(int i, int i_6_, int i_7_) {
		anIntArray26[i] = i_6_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45)
			class282_sub45.aLong8066 = (Class169.method2869(2002446854) + 500L) * 1350258240038399479L;
		else {
			class282_sub45 = new Class282_Sub45(Class169.method2869(2004288140) + 500L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	public int method236(int i) {
		return anIntArray26[i];
	}

	void method267(int i, int i_8_) {
		((Class3) this).anIntArray25[i] = i_8_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45) {
			if (4611686018427387905L != class282_sub45.aLong8066 * 3367138086658270151L)
				class282_sub45.aLong8066 = (Class169.method2869(1850194248) + 500L | 0x4000000000000000L) * 1350258240038399479L;
		} else {
			class282_sub45 = new Class282_Sub45(4611686018427387905L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	void method268(int i, int i_9_, int i_10_) {
		Class226 class226 = IndexLoaders.aClass230_147.method3897(i, (byte) 29);
		int i_11_ = -1764754967 * class226.anInt2784;
		int i_12_ = -1174362995 * class226.anInt2785;
		int i_13_ = class226.anInt2783 * -188179155;
		int i_14_ = anIntArray27[i_13_ - i_12_];
		if (i_9_ < 0 || i_9_ > i_14_)
			i_9_ = 0;
		i_14_ <<= i_12_;
		method281(i_11_, (((Class3) this).anIntArray25[i_11_] & (i_14_ ^ 0xffffffff) | i_9_ << i_12_ & i_14_), (byte) 73);
	}

	public void method269(int i, int i_15_) {
		anIntArray26[i] = i_15_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45)
			class282_sub45.aLong8066 = (Class169.method2869(2005329429) + 500L) * 1350258240038399479L;
		else {
			class282_sub45 = new Class282_Sub45(Class169.method2869(1754901634) + 500L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	public int method241(int i, int i_16_) {
		Class226 class226 = IndexLoaders.aClass230_147.method3897(i, (byte) 125);
		int i_17_ = -1764754967 * class226.anInt2784;
		int i_18_ = -1174362995 * class226.anInt2785;
		int i_19_ = class226.anInt2783 * -188179155;
		int i_20_ = anIntArray27[i_19_ - i_18_];
		return anIntArray26[i_17_] >> i_18_ & i_20_;
	}

	int method270(boolean bool) {
		long l = Class169.method2869(1545476665);
		for (Class282_Sub45 class282_sub45 = ((Class282_Sub45) (bool ? ((Class3) this).aClass465_28.method7750(-1213303065) : ((Class3) this).aClass465_28.method7751((byte) 115))); null != class282_sub45; class282_sub45 = (Class282_Sub45) ((Class3) this).aClass465_28.method7751((byte) 4)) {
			if ((3367138086658270151L * class282_sub45.aLong8066 & 0x3fffffffffffffffL) < l) {
				if (0L != (class282_sub45.aLong8066 * 3367138086658270151L & 0x4000000000000000L)) {
					int i = (int) (-3442165056282524525L * class282_sub45.data);
					anIntArray26[i] = ((Class3) this).anIntArray25[i];
					class282_sub45.remove();
					return i;
				}
				class282_sub45.remove();
			}
		}
		return -1;
	}

	int method271(boolean bool) {
		long l = Class169.method2869(2060109148);
		for (Class282_Sub45 class282_sub45 = ((Class282_Sub45) (bool ? ((Class3) this).aClass465_28.method7750(1511149696) : ((Class3) this).aClass465_28.method7751((byte) 94))); null != class282_sub45; class282_sub45 = (Class282_Sub45) ((Class3) this).aClass465_28.method7751((byte) 66)) {
			if ((3367138086658270151L * class282_sub45.aLong8066 & 0x3fffffffffffffffL) < l) {
				if (0L != (class282_sub45.aLong8066 * 3367138086658270151L & 0x4000000000000000L)) {
					int i = (int) (-3442165056282524525L * class282_sub45.data);
					anIntArray26[i] = ((Class3) this).anIntArray25[i];
					class282_sub45.remove();
					return i;
				}
				class282_sub45.remove();
			}
		}
		return -1;
	}

	static {
		int i = 2;
		for (int i_21_ = 0; i_21_ < 32; i_21_++) {
			anIntArray27[i_21_] = i - 1;
			i += i;
		}
	}

	void method272() {
		for (int i = 0; i < IndexLoaders.aClass377_1065.anInt4519 * -1456639697; i++) {
			((Class3) this).anIntArray25[i] = 0;
			anIntArray26[i] = 0;
		}
		((Class3) this).aClass465_28 = new IterableNodeMap(128);
	}

	void method273() {
		for (int i = 0; i < IndexLoaders.aClass377_1065.anInt4519 * -1456639697; i++) {
			((Class3) this).anIntArray25[i] = 0;
			anIntArray26[i] = 0;
		}
		((Class3) this).aClass465_28 = new IterableNodeMap(128);
	}

	void method274() {
		for (int i = 0; i < IndexLoaders.aClass377_1065.anInt4519 * -1456639697; i++) {
			((Class3) this).anIntArray25[i] = 0;
			anIntArray26[i] = 0;
		}
		((Class3) this).aClass465_28 = new IterableNodeMap(128);
	}

	public Class3() {
		((Class3) this).anIntArray25 = new int[-1456639697 * IndexLoaders.aClass377_1065.anInt4519];
		anIntArray26 = new int[-1456639697 * IndexLoaders.aClass377_1065.anInt4519];
	}

	public void method275(int i, int i_22_) {
		Class226 class226 = IndexLoaders.aClass230_147.method3897(i, (byte) 127);
		int i_23_ = -1764754967 * class226.anInt2784;
		int i_24_ = class226.anInt2785 * -1174362995;
		int i_25_ = class226.anInt2783 * -188179155;
		int i_26_ = anIntArray27[i_25_ - i_24_];
		if (i_22_ < 0 || i_22_ > i_26_)
			i_22_ = 0;
		i_26_ <<= i_24_;
		method266(i_23_, (anIntArray26[i_23_] & (i_26_ ^ 0xffffffff) | i_22_ << i_24_ & i_26_), -1032634252);
	}

	public void method276(int i, int i_27_) {
		anIntArray26[i] = i_27_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45)
			class282_sub45.aLong8066 = (Class169.method2869(1596114231) + 500L) * 1350258240038399479L;
		else {
			class282_sub45 = new Class282_Sub45(Class169.method2869(2068758574) + 500L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	void method277(int i, int i_28_) {
		((Class3) this).anIntArray25[i] = i_28_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45) {
			if (4611686018427387905L != class282_sub45.aLong8066 * 3367138086658270151L)
				class282_sub45.aLong8066 = (Class169.method2869(1713791125) + 500L | 0x4000000000000000L) * 1350258240038399479L;
		} else {
			class282_sub45 = new Class282_Sub45(4611686018427387905L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	public int method238(int i) {
		return anIntArray26[i];
	}

	public void method278(int i, int i_29_) {
		anIntArray26[i] = i_29_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45)
			class282_sub45.aLong8066 = (Class169.method2869(1914994951) + 500L) * 1350258240038399479L;
		else {
			class282_sub45 = new Class282_Sub45(Class169.method2869(1775368055) + 500L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	void method279(int i, int i_30_) {
		Class226 class226 = IndexLoaders.aClass230_147.method3897(i, (byte) 66);
		int i_31_ = -1764754967 * class226.anInt2784;
		int i_32_ = -1174362995 * class226.anInt2785;
		int i_33_ = class226.anInt2783 * -188179155;
		int i_34_ = anIntArray27[i_33_ - i_32_];
		if (i_30_ < 0 || i_30_ > i_34_)
			i_30_ = 0;
		i_34_ <<= i_32_;
		method281(i_31_, (((Class3) this).anIntArray25[i_31_] & (i_34_ ^ 0xffffffff) | i_30_ << i_32_ & i_34_), (byte) -67);
	}

	public void method280(int i, int i_35_, int i_36_) {
		Class226 class226 = IndexLoaders.aClass230_147.method3897(i, (byte) 58);
		int i_37_ = -1764754967 * class226.anInt2784;
		int i_38_ = class226.anInt2785 * -1174362995;
		int i_39_ = class226.anInt2783 * -188179155;
		int i_40_ = anIntArray27[i_39_ - i_38_];
		if (i_35_ < 0 || i_35_ > i_40_)
			i_35_ = 0;
		i_40_ <<= i_38_;
		method266(i_37_, (anIntArray26[i_37_] & (i_40_ ^ 0xffffffff) | i_35_ << i_38_ & i_40_), 682938464);
	}

	public int method239(int i) {
		return anIntArray26[i];
	}

	public int method237(int i) {
		return anIntArray26[i];
	}

	public int method240(int i, int i_41_) {
		return anIntArray26[i];
	}

	void method281(int i, int i_42_, byte i_43_) {
		((Class3) this).anIntArray25[i] = i_42_;
		Class282_Sub45 class282_sub45 = ((Class282_Sub45) ((Class3) this).aClass465_28.method7754((long) i));
		if (null != class282_sub45) {
			if (4611686018427387905L != class282_sub45.aLong8066 * 3367138086658270151L)
				class282_sub45.aLong8066 = (Class169.method2869(2128597494) + 500L | 0x4000000000000000L) * 1350258240038399479L;
		} else {
			class282_sub45 = new Class282_Sub45(4611686018427387905L);
			((Class3) this).aClass465_28.method7765(class282_sub45, (long) i);
		}
	}

	public static int method282(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		if ((i_48_ & 0x1) == 1) {
			int i_50_ = i_46_;
			i_46_ = i_47_;
			i_47_ = i_50_;
		}
		i_45_ &= 0x3;
		if (i_45_ == 0)
			return i_44_;
		if (1 == i_45_)
			return 7 - i - (i_46_ - 1);
		if (i_45_ == 2)
			return 7 - i_44_ - (i_47_ - 1);
		return i;
	}

	static final void method283(CS2Executor class527, int i) {
		int i_51_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_51_, (byte) 27);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_51_ >> 16];
		Class359.method6244(class118, class98, class527, 606535438);
	}

	static final void method284(CS2Executor class527, int i) {
		boolean bool = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), bool ? 2 : 1, 681995550);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), bool ? 2 : 1, -1225765043);
		Class405.method6823(-734889653);
		Class190.method3148((byte) 111);
		client.aBool7175 = false;
	}

	public static int method285(int i, int i_52_, int i_53_) {
		int i_54_ = 0;
		for (/**/; i_52_ > 0; i_52_--) {
			i_54_ = i_54_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_54_;
	}

	static Class275_Sub2 method286(int i) {
		Class275_Sub2 class275_sub2 = ((Class275_Sub2) Class275_Sub2.aClass457_7745.method7648(1622132188));
		if (class275_sub2 != null) {
			Class275_Sub2.anInt7741 -= -1808489727;
			return class275_sub2;
		}
		return new Class275_Sub2();
	}

	static final void method287(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) (Class169.method2869(1779387759) / 86400000L) - 11745;
	}
}
