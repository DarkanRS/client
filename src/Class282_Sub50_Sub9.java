/* Class282_Sub50_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub9 extends Class282_Sub50 {
	Class429 aClass429_9623;
	public int[] anIntArray9624;
	int[] anIntArray9625;
	int[][] anIntArrayArray9626;
	String[] aStringArray9627;
	public boolean aBool9628 = true;

	public int method14893(int i, int i_0_) {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625 || i < 0 || i > ((Class282_Sub50_Sub9) this).anIntArray9625.length)
			return -1;
		if (null == ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i] || i_0_ < 0 || (i_0_ > ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i].length))
			return -1;
		return ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i][i_0_];
	}

	void method14894() {
		if (anIntArray9624 != null) {
			for (int i = 0; i < anIntArray9624.length; i++)
				anIntArray9624[i] |= 0x8000;
		}
	}

	void method14895(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (1 == i)
			((Class282_Sub50_Sub9) this).aStringArray9627 = Class456_Sub3.method12681(class282_sub35.readString(996565628), '<', 229848533);
		else if (2 == i) {
			int i_2_ = class282_sub35.readUnsignedByte();
			anIntArray9624 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				anIntArray9624[i_3_] = class282_sub35.readUnsignedShort();
		} else if (i == 3) {
			int i_4_ = class282_sub35.readUnsignedByte();
			((Class282_Sub50_Sub9) this).anIntArray9625 = new int[i_4_];
			((Class282_Sub50_Sub9) this).anIntArrayArray9626 = new int[i_4_][];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				int i_6_ = class282_sub35.readUnsignedShort();
				Class243 class243 = Class282_Sub38.method13293(i_6_, (byte) -5);
				if (class243 != null) {
					((Class282_Sub50_Sub9) this).anIntArray9625[i_5_] = i_6_;
					((Class282_Sub50_Sub9) this).anIntArrayArray9626[i_5_] = new int[class243.anInt3000 * 720437159];
					for (int i_7_ = 0; i_7_ < class243.anInt3000 * 720437159; i_7_++)
						((Class282_Sub50_Sub9) this).anIntArrayArray9626[i_5_][i_7_] = class282_sub35.readUnsignedShort();
				}
			}
		} else if (4 == i)
			aBool9628 = false;
	}

	public void method14896(RsByteBuffer class282_sub35, int[] is, int i) {
		if (((Class282_Sub50_Sub9) this).anIntArray9625 != null) {
			for (int i_8_ = 0; (i_8_ < ((Class282_Sub50_Sub9) this).anIntArray9625.length && i_8_ < is.length); i_8_++) {
				int i_9_ = method14918(i_8_, -218667909).anInt2998 * -906335175;
				if (i_9_ > 0)
					class282_sub35.method13068((long) is[i_8_], i_9_, 1986683793);
			}
		}
	}

	public String method14897(RsByteBuffer class282_sub35, byte i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).anIntArray9625 != null) {
			for (int i_10_ = 0; i_10_ < ((Class282_Sub50_Sub9) this).anIntArray9625.length; i_10_++) {
				stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i_10_]);
				stringbuilder.append(((Class282_Sub50_Sub9) this).aClass429_9623.method7212(method14918(i_10_, 12195822), ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i_10_], class282_sub35.method13089((Class282_Sub38.method13293((((Class282_Sub50_Sub9) this).anIntArray9625[i_10_]), (byte) -21).anInt2999) * 730963347, 1911535403)));
			}
		}
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[(((Class282_Sub50_Sub9) this).aStringArray9627).length - 1]);
		return stringbuilder.toString();
	}

	public String method14898(int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).aStringArray9627 == null)
			return "";
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[0]);
		for (int i_11_ = 1; i_11_ < ((Class282_Sub50_Sub9) this).aStringArray9627.length; i_11_++) {
			for (int i_12_ = 0; i_12_ < 3; i_12_++)
				stringbuilder.append('.');
			stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i_11_]);
		}
		return stringbuilder.toString();
	}

	void method14899(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method14895(class282_sub35, i, -1258498307);
		}
	}

	public int method14900() {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625)
			return 0;
		return ((Class282_Sub50_Sub9) this).anIntArray9625.length;
	}

	public int method14901(int i, int i_13_, int i_14_) {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625 || i < 0 || i > ((Class282_Sub50_Sub9) this).anIntArray9625.length)
			return -1;
		if (null == ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i] || i_13_ < 0 || (i_13_ > ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i].length))
			return -1;
		return ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i][i_13_];
	}

	public Class243 method14902(int i) {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625 || i < 0 || i > ((Class282_Sub50_Sub9) this).anIntArray9625.length)
			return null;
		return Class282_Sub38.method13293((((Class282_Sub50_Sub9) this).anIntArray9625[i]), (byte) -53);
	}

	void method14903(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method14895(class282_sub35, i, -989545630);
		}
	}

	void method14904() {
		if (anIntArray9624 != null) {
			for (int i = 0; i < anIntArray9624.length; i++)
				anIntArray9624[i] |= 0x8000;
		}
	}

	public String method14905() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).aStringArray9627 == null)
			return "";
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[0]);
		for (int i = 1; i < ((Class282_Sub50_Sub9) this).aStringArray9627.length; i++) {
			for (int i_15_ = 0; i_15_ < 3; i_15_++)
				stringbuilder.append('.');
			stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i]);
		}
		return stringbuilder.toString();
	}

	void method14906(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			((Class282_Sub50_Sub9) this).aStringArray9627 = Class456_Sub3.method12681(class282_sub35.readString(1277890613), '<', 229848533);
		else if (2 == i) {
			int i_16_ = class282_sub35.readUnsignedByte();
			anIntArray9624 = new int[i_16_];
			for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
				anIntArray9624[i_17_] = class282_sub35.readUnsignedShort();
		} else if (i == 3) {
			int i_18_ = class282_sub35.readUnsignedByte();
			((Class282_Sub50_Sub9) this).anIntArray9625 = new int[i_18_];
			((Class282_Sub50_Sub9) this).anIntArrayArray9626 = new int[i_18_][];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				int i_20_ = class282_sub35.readUnsignedShort();
				Class243 class243 = Class282_Sub38.method13293(i_20_, (byte) -10);
				if (class243 != null) {
					((Class282_Sub50_Sub9) this).anIntArray9625[i_19_] = i_20_;
					((Class282_Sub50_Sub9) this).anIntArrayArray9626[i_19_] = new int[class243.anInt3000 * 720437159];
					for (int i_21_ = 0; i_21_ < class243.anInt3000 * 720437159; i_21_++)
						((Class282_Sub50_Sub9) this).anIntArrayArray9626[i_19_][i_21_] = class282_sub35.readUnsignedShort();
				}
			}
		} else if (4 == i)
			aBool9628 = false;
	}

	public void method14907(RsByteBuffer class282_sub35, int[] is) {
		if (((Class282_Sub50_Sub9) this).anIntArray9625 != null) {
			for (int i = 0; (i < ((Class282_Sub50_Sub9) this).anIntArray9625.length && i < is.length); i++) {
				int i_22_ = method14918(i, -679645268).anInt2998 * -906335175;
				if (i_22_ > 0)
					class282_sub35.method13068((long) is[i], i_22_, 1644841751);
			}
		}
	}

	public String method14908(RsByteBuffer class282_sub35) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).anIntArray9625 != null) {
			for (int i = 0; i < ((Class282_Sub50_Sub9) this).anIntArray9625.length; i++) {
				stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i]);
				stringbuilder.append(((Class282_Sub50_Sub9) this).aClass429_9623.method7212(method14918(i, -597596224), ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i], class282_sub35.method13089((Class282_Sub38.method13293(((Class282_Sub50_Sub9) this).anIntArray9625[i], (byte) -47).anInt2999) * 730963347, 1677550656)));
			}
		}
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[(((Class282_Sub50_Sub9) this).aStringArray9627).length - 1]);
		return stringbuilder.toString();
	}

	public String method14909(RsByteBuffer class282_sub35) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).anIntArray9625 != null) {
			for (int i = 0; i < ((Class282_Sub50_Sub9) this).anIntArray9625.length; i++) {
				stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i]);
				stringbuilder.append(((Class282_Sub50_Sub9) this).aClass429_9623.method7212(method14918(i, 61370160), ((Class282_Sub50_Sub9) this).anIntArrayArray9626[i], class282_sub35.method13089((Class282_Sub38.method13293(((Class282_Sub50_Sub9) this).anIntArray9625[i], (byte) -116).anInt2999) * 730963347, 1415012003)));
			}
		}
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[(((Class282_Sub50_Sub9) this).aStringArray9627).length - 1]);
		return stringbuilder.toString();
	}

	public String method14910() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).aStringArray9627 == null)
			return "";
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[0]);
		for (int i = 1; i < ((Class282_Sub50_Sub9) this).aStringArray9627.length; i++) {
			for (int i_23_ = 0; i_23_ < 3; i_23_++)
				stringbuilder.append('.');
			stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i]);
		}
		return stringbuilder.toString();
	}

	public String method14911() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((Class282_Sub50_Sub9) this).aStringArray9627 == null)
			return "";
		stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[0]);
		for (int i = 1; i < ((Class282_Sub50_Sub9) this).aStringArray9627.length; i++) {
			for (int i_24_ = 0; i_24_ < 3; i_24_++)
				stringbuilder.append('.');
			stringbuilder.append(((Class282_Sub50_Sub9) this).aStringArray9627[i]);
		}
		return stringbuilder.toString();
	}

	void method14912(int i) {
		if (anIntArray9624 != null) {
			for (int i_25_ = 0; i_25_ < anIntArray9624.length; i_25_++)
				anIntArray9624[i_25_] |= 0x8000;
		}
	}

	void method14913(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_26_ = class282_sub35.readUnsignedByte();
			if (0 == i_26_)
				break;
			method14895(class282_sub35, i_26_, -1464850620);
		}
	}

	public int method14914() {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625)
			return 0;
		return ((Class282_Sub50_Sub9) this).anIntArray9625.length;
	}

	public Class243 method14915(int i) {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625 || i < 0 || i > ((Class282_Sub50_Sub9) this).anIntArray9625.length)
			return null;
		return Class282_Sub38.method13293((((Class282_Sub50_Sub9) this).anIntArray9625[i]), (byte) -74);
	}

	public int method14916(int i) {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625)
			return 0;
		return ((Class282_Sub50_Sub9) this).anIntArray9625.length;
	}

	void method14917() {
		if (anIntArray9624 != null) {
			for (int i = 0; i < anIntArray9624.length; i++)
				anIntArray9624[i] |= 0x8000;
		}
	}

	Class282_Sub50_Sub9() {
		/* empty */
	}

	public Class243 method14918(int i, int i_27_) {
		if (null == ((Class282_Sub50_Sub9) this).anIntArray9625 || i < 0 || i > ((Class282_Sub50_Sub9) this).anIntArray9625.length)
			return null;
		return Class282_Sub38.method13293((((Class282_Sub50_Sub9) this).anIntArray9625[i]), (byte) -128);
	}

	void method14919() {
		if (anIntArray9624 != null) {
			for (int i = 0; i < anIntArray9624.length; i++)
				anIntArray9624[i] |= 0x8000;
		}
	}

	void method14920(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method14895(class282_sub35, i, -1366040255);
		}
	}

	static boolean method14921(int i, int i_28_, int i_29_, byte i_30_) {
		Class206 class206 = client.aClass257_7353.method4430(-1536948250);
		boolean bool = true;
		Interface12 interface12 = (Interface12) class206.method3381(i, i_28_, i_29_, (byte) -61);
		if (null != interface12)
			bool &= Class93.method1577(interface12, -1691371970);
		interface12 = (Interface12) class206.method3413(i, i_28_, i_29_, client.anInterface25_7446, -233664382);
		if (interface12 != null)
			bool &= Class93.method1577(interface12, -1754652045);
		interface12 = (Interface12) class206.method3415(i, i_28_, i_29_, -387297653);
		if (interface12 != null)
			bool &= Class93.method1577(interface12, -1776795369);
		return bool;
	}
}
