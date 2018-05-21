/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107 {
	Interface11 anInterface11_1078;
	Class282_Sub21[] aClass282_Sub21Array1079;
	IterableNodeMap aClass465_1080;
	public static Index aClass317_1081;
	protected static int anInt1082;

	public Class107(int i, Interface11 interface11) {
		int i_0_;
		for (i_0_ = 1; i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		((Class107) this).aClass465_1080 = new IterableNodeMap(i_0_);
		((Class107) this).aClass282_Sub21Array1079 = new Class282_Sub21[i_0_];
		((Class107) this).anInterface11_1078 = interface11;
	}

	public Class282_Sub21 method1819(String string) {
		long l = ((Class107) this).anInterface11_1078.method79(string, 44501256);
		for (Class282_Sub21 class282_sub21 = ((Class282_Sub21) ((Class107) this).aClass465_1080.method7754(l)); class282_sub21 != null; class282_sub21 = (Class282_Sub21) ((Class107) this).aClass465_1080.method7747(-1375647572)) {
			if (((Class282_Sub21) class282_sub21).aString7674.equals(string))
				return class282_sub21;
		}
		return null;
	}

	public Class282_Sub21 method1820(String string, int i) {
		long l = ((Class107) this).anInterface11_1078.method79(string, 166693021);
		for (Class282_Sub21 class282_sub21 = ((Class282_Sub21) ((Class107) this).aClass465_1080.method7754(l)); class282_sub21 != null; class282_sub21 = (Class282_Sub21) ((Class107) this).aClass465_1080.method7747(-1934040693)) {
			if (((Class282_Sub21) class282_sub21).aString7674.equals(string))
				return class282_sub21;
		}
		return null;
	}

	void method1821(int i, short i_1_) {
		Class282_Sub21 class282_sub21 = method1823(i, 1887501575);
		if (null != class282_sub21) {
			class282_sub21.unlink(-371378792);
			((Class107) this).aClass282_Sub21Array1079[((Class282_Sub21) class282_sub21).anInt7675 * 1401548631] = null;
		}
	}

	public void method1822(int i, String string, Class282_Sub21 class282_sub21, int i_2_) {
		Class282_Sub21 class282_sub21_3_ = method1820(string, -2129504033);
		if (class282_sub21_3_ != null && i != (1401548631 * ((Class282_Sub21) class282_sub21_3_).anInt7675))
			throw new IllegalArgumentException(string);
		method1821(i, (short) -24232);
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length) {
			int i_4_;
			for (i_4_ = ((Class107) this).aClass282_Sub21Array1079.length; i >= i_4_; i_4_ += i_4_) {
				/* empty */
			}
			((Class107) this).aClass465_1080 = new IterableNodeMap(i_4_);
			for (int i_5_ = 0; i_5_ < ((Class107) this).aClass282_Sub21Array1079.length; i_5_++) {
				Class282_Sub21 class282_sub21_6_ = ((Class107) this).aClass282_Sub21Array1079[i_5_];
				if (null != class282_sub21_6_)
					((Class107) this).aClass465_1080.method7765(class282_sub21_6_, class282_sub21_6_.data * -3442165056282524525L);
			}
			Class282_Sub21[] class282_sub21s = new Class282_Sub21[i_4_];
			for (int i_7_ = 0; i_7_ < ((Class107) this).aClass282_Sub21Array1079.length; i_7_++)
				class282_sub21s[i_7_] = ((Class107) this).aClass282_Sub21Array1079[i_7_];
			((Class107) this).aClass282_Sub21Array1079 = class282_sub21s;
		}
		((Class282_Sub21) class282_sub21).anInt7675 = -1262982041 * i;
		((Class282_Sub21) class282_sub21).aString7674 = string;
		((Class107) this).aClass465_1080.method7765(class282_sub21, ((Class107) this).anInterface11_1078.method79(string, 276122066));
		((Class107) this).aClass282_Sub21Array1079[i] = class282_sub21;
	}

	public Class282_Sub21 method1823(int i, int i_8_) {
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length)
			return null;
		return ((Class107) this).aClass282_Sub21Array1079[i];
	}

	public Class282_Sub21 method1824(int i) {
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length)
			return null;
		return ((Class107) this).aClass282_Sub21Array1079[i];
	}

	public Class282_Sub21 method1825(String string) {
		long l = ((Class107) this).anInterface11_1078.method79(string, -483409428);
		for (Class282_Sub21 class282_sub21 = ((Class282_Sub21) ((Class107) this).aClass465_1080.method7754(l)); class282_sub21 != null; class282_sub21 = (Class282_Sub21) ((Class107) this).aClass465_1080.method7747(-1773335970)) {
			if (((Class282_Sub21) class282_sub21).aString7674.equals(string))
				return class282_sub21;
		}
		return null;
	}

	void method1826(int i) {
		Class282_Sub21 class282_sub21 = method1823(i, 1913214087);
		if (null != class282_sub21) {
			class282_sub21.unlink(-371378792);
			((Class107) this).aClass282_Sub21Array1079[((Class282_Sub21) class282_sub21).anInt7675 * 1401548631] = null;
		}
	}

	public Class282_Sub21 method1827(int i) {
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length)
			return null;
		return ((Class107) this).aClass282_Sub21Array1079[i];
	}

	void method1828(int i) {
		Class282_Sub21 class282_sub21 = method1823(i, 1989060357);
		if (null != class282_sub21) {
			class282_sub21.unlink(-371378792);
			((Class107) this).aClass282_Sub21Array1079[((Class282_Sub21) class282_sub21).anInt7675 * 1401548631] = null;
		}
	}

	void method1829(int i) {
		Class282_Sub21 class282_sub21 = method1823(i, 1705037884);
		if (null != class282_sub21) {
			class282_sub21.unlink(-371378792);
			((Class107) this).aClass282_Sub21Array1079[((Class282_Sub21) class282_sub21).anInt7675 * 1401548631] = null;
		}
	}

	public void method1830(int i, String string, Class282_Sub21 class282_sub21) {
		Class282_Sub21 class282_sub21_9_ = method1820(string, -2071430708);
		if (class282_sub21_9_ != null && i != (1401548631 * ((Class282_Sub21) class282_sub21_9_).anInt7675))
			throw new IllegalArgumentException(string);
		method1821(i, (short) -18462);
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length) {
			int i_10_;
			for (i_10_ = ((Class107) this).aClass282_Sub21Array1079.length; i >= i_10_; i_10_ += i_10_) {
				/* empty */
			}
			((Class107) this).aClass465_1080 = new IterableNodeMap(i_10_);
			for (int i_11_ = 0; i_11_ < ((Class107) this).aClass282_Sub21Array1079.length; i_11_++) {
				Class282_Sub21 class282_sub21_12_ = ((Class107) this).aClass282_Sub21Array1079[i_11_];
				if (null != class282_sub21_12_)
					((Class107) this).aClass465_1080.method7765(class282_sub21_12_, class282_sub21_12_.data * -3442165056282524525L);
			}
			Class282_Sub21[] class282_sub21s = new Class282_Sub21[i_10_];
			for (int i_13_ = 0; i_13_ < ((Class107) this).aClass282_Sub21Array1079.length; i_13_++)
				class282_sub21s[i_13_] = ((Class107) this).aClass282_Sub21Array1079[i_13_];
			((Class107) this).aClass282_Sub21Array1079 = class282_sub21s;
		}
		((Class282_Sub21) class282_sub21).anInt7675 = -1262982041 * i;
		((Class282_Sub21) class282_sub21).aString7674 = string;
		((Class107) this).aClass465_1080.method7765(class282_sub21, ((Class107) this).anInterface11_1078.method79(string, -916033427));
		((Class107) this).aClass282_Sub21Array1079[i] = class282_sub21;
	}

	public void method1831(int i, String string, Class282_Sub21 class282_sub21) {
		Class282_Sub21 class282_sub21_14_ = method1820(string, -2048126035);
		if (class282_sub21_14_ != null && i != (1401548631 * ((Class282_Sub21) class282_sub21_14_).anInt7675))
			throw new IllegalArgumentException(string);
		method1821(i, (short) -4477);
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length) {
			int i_15_;
			for (i_15_ = ((Class107) this).aClass282_Sub21Array1079.length; i >= i_15_; i_15_ += i_15_) {
				/* empty */
			}
			((Class107) this).aClass465_1080 = new IterableNodeMap(i_15_);
			for (int i_16_ = 0; i_16_ < ((Class107) this).aClass282_Sub21Array1079.length; i_16_++) {
				Class282_Sub21 class282_sub21_17_ = ((Class107) this).aClass282_Sub21Array1079[i_16_];
				if (null != class282_sub21_17_)
					((Class107) this).aClass465_1080.method7765(class282_sub21_17_, class282_sub21_17_.data * -3442165056282524525L);
			}
			Class282_Sub21[] class282_sub21s = new Class282_Sub21[i_15_];
			for (int i_18_ = 0; i_18_ < ((Class107) this).aClass282_Sub21Array1079.length; i_18_++)
				class282_sub21s[i_18_] = ((Class107) this).aClass282_Sub21Array1079[i_18_];
			((Class107) this).aClass282_Sub21Array1079 = class282_sub21s;
		}
		((Class282_Sub21) class282_sub21).anInt7675 = -1262982041 * i;
		((Class282_Sub21) class282_sub21).aString7674 = string;
		((Class107) this).aClass465_1080.method7765(class282_sub21, ((Class107) this).anInterface11_1078.method79(string, -572039434));
		((Class107) this).aClass282_Sub21Array1079[i] = class282_sub21;
	}

	public void method1832(int i, String string, Class282_Sub21 class282_sub21) {
		Class282_Sub21 class282_sub21_19_ = method1820(string, -2016646072);
		if (class282_sub21_19_ != null && i != (1401548631 * ((Class282_Sub21) class282_sub21_19_).anInt7675))
			throw new IllegalArgumentException(string);
		method1821(i, (short) -31492);
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length) {
			int i_20_;
			for (i_20_ = ((Class107) this).aClass282_Sub21Array1079.length; i >= i_20_; i_20_ += i_20_) {
				/* empty */
			}
			((Class107) this).aClass465_1080 = new IterableNodeMap(i_20_);
			for (int i_21_ = 0; i_21_ < ((Class107) this).aClass282_Sub21Array1079.length; i_21_++) {
				Class282_Sub21 class282_sub21_22_ = ((Class107) this).aClass282_Sub21Array1079[i_21_];
				if (null != class282_sub21_22_)
					((Class107) this).aClass465_1080.method7765(class282_sub21_22_, class282_sub21_22_.data * -3442165056282524525L);
			}
			Class282_Sub21[] class282_sub21s = new Class282_Sub21[i_20_];
			for (int i_23_ = 0; i_23_ < ((Class107) this).aClass282_Sub21Array1079.length; i_23_++)
				class282_sub21s[i_23_] = ((Class107) this).aClass282_Sub21Array1079[i_23_];
			((Class107) this).aClass282_Sub21Array1079 = class282_sub21s;
		}
		((Class282_Sub21) class282_sub21).anInt7675 = -1262982041 * i;
		((Class282_Sub21) class282_sub21).aString7674 = string;
		((Class107) this).aClass465_1080.method7765(class282_sub21, ((Class107) this).anInterface11_1078.method79(string, 735213849));
		((Class107) this).aClass282_Sub21Array1079[i] = class282_sub21;
	}

	public void method1833(int i, String string, Class282_Sub21 class282_sub21) {
		Class282_Sub21 class282_sub21_24_ = method1820(string, -2009276003);
		if (class282_sub21_24_ != null && i != (1401548631 * ((Class282_Sub21) class282_sub21_24_).anInt7675))
			throw new IllegalArgumentException(string);
		method1821(i, (short) -24278);
		if (i >= ((Class107) this).aClass282_Sub21Array1079.length) {
			int i_25_;
			for (i_25_ = ((Class107) this).aClass282_Sub21Array1079.length; i >= i_25_; i_25_ += i_25_) {
				/* empty */
			}
			((Class107) this).aClass465_1080 = new IterableNodeMap(i_25_);
			for (int i_26_ = 0; i_26_ < ((Class107) this).aClass282_Sub21Array1079.length; i_26_++) {
				Class282_Sub21 class282_sub21_27_ = ((Class107) this).aClass282_Sub21Array1079[i_26_];
				if (null != class282_sub21_27_)
					((Class107) this).aClass465_1080.method7765(class282_sub21_27_, class282_sub21_27_.data * -3442165056282524525L);
			}
			Class282_Sub21[] class282_sub21s = new Class282_Sub21[i_25_];
			for (int i_28_ = 0; i_28_ < ((Class107) this).aClass282_Sub21Array1079.length; i_28_++)
				class282_sub21s[i_28_] = ((Class107) this).aClass282_Sub21Array1079[i_28_];
			((Class107) this).aClass282_Sub21Array1079 = class282_sub21s;
		}
		((Class282_Sub21) class282_sub21).anInt7675 = -1262982041 * i;
		((Class282_Sub21) class282_sub21).aString7674 = string;
		((Class107) this).aClass465_1080.method7765(class282_sub21, ((Class107) this).anInterface11_1078.method79(string, -709814758));
		((Class107) this).aClass282_Sub21Array1079[i] = class282_sub21;
	}

	static void method1834(Class397 class397, int i, int i_29_, CS2Executor class527, byte i_30_) {
		CS2Script class282_sub50_sub5 = Class225_Sub1.method12792(class397, i, i_29_, 856735933);
		if (null == class282_sub50_sub5)
			Class282_Sub50_Sub17.method15509(282059094);
		else {
			((CS2Executor) class527).intLocals = new int[class282_sub50_sub5.intLocalsCount * 693687803];
			((CS2Executor) class527).objectLocals = new Object[1886892247 * class282_sub50_sub5.stringLocalsCount];
			if (Class397.aClass397_4797 == class282_sub50_sub5.aClass397_9527 || (Class397.aClass397_4805 == class282_sub50_sub5.aClass397_9527) || (Class397.aClass397_4798 == class282_sub50_sub5.aClass397_9527)) {
				int i_31_ = 0;
				int i_32_ = 0;
				if (Class282_Sub20_Sub24.aClass118_9884 != null) {
					i_31_ = (597157617 * Class282_Sub20_Sub24.aClass118_9884.anInt1299);
					i_32_ = (198275475 * Class282_Sub20_Sub24.aClass118_9884.anInt1428);
				}
				((CS2Executor) class527).intLocals[0] = Class163.aClass209_2031.method3569(2102959757) - i_31_;
				((CS2Executor) class527).intLocals[1] = Class163.aClass209_2031.method3570(756095591) - i_32_;
			} else if (Class397.aClass397_4806 == class282_sub50_sub5.aClass397_9527)
				((CS2Executor) class527).intLocals[0] = ((CS2Executor) class527).anInt7004 * -945484741;
			Class51.method1068(class282_sub50_sub5, 200000, class527, 223631814);
		}
	}

	static final void method1835(CS2Executor class527, short i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_33_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_34_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		if (null != Class84.myPlayer.playerAppearance)
			Class84.myPlayer.playerAppearance.method4029(i_33_, i_34_, (byte) -21);
	}

	static final void method1836(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		Class329_Sub1.method12491(Class84.myPlayer, (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 * 1942118537)]), (((CS2Executor) class527).intStack[(1942118537 * ((CS2Executor) class527).anInt7012) + 1]), (byte) -23);
	}

	static final void method1837(CS2Executor class527, int i) {
		Class514.method8841(1236129433);
	}

	static final void method1838(Class118 class118, byte[] is, byte[] is_35_, CS2Executor class527, int i) {
		int i_36_ = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) - 1);
		if (i_36_ < 0 || i_36_ > 9)
			throw new RuntimeException();
		Class445.method7429(class118, i_36_, is, is_35_, class527, -1172279897);
	}
}
