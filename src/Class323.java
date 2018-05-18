/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class323 implements Interface22 {
	Index aClass317_3750;
	Index aClass317_3751;
	int anInt3752;
	Class169[] aClass169Array3753;
	Class223 aClass223_3754 = new Class223(256);

	Class282_Sub50_Sub3 method5770(int i, int i_0_) {
		Class282_Sub50 class282_sub50 = ((Class323) this).aClass223_3754.method3758((long) i);
		if (class282_sub50 != null)
			return (Class282_Sub50_Sub3) class282_sub50;
		byte[] is = ((Class323) this).aClass317_3750.method5615(i, -130547352);
		if (is == null)
			return null;
		Class282_Sub50_Sub3 class282_sub50_sub3 = new Class282_Sub50_Sub3(new RsByteBuffer(is));
		((Class323) this).aClass223_3754.method3759(class282_sub50_sub3, (long) i);
		return class282_sub50_sub3;
	}

	public int method84(int i) {
		return 821306191 * ((Class323) this).anInt3752;
	}

	public int method39() {
		return 821306191 * ((Class323) this).anInt3752;
	}

	public Class169 method144(int i, int i_1_) {
		return ((Class323) this).aClass169Array3753[i];
	}

	public void method161(int i) {
		/* empty */
	}

	public Class323(Index class317, Index class317_2_, Index class317_3_) {
		((Class323) this).aClass317_3750 = class317_2_;
		((Class323) this).aClass317_3751 = class317_3_;
		RsByteBuffer class282_sub35 = new RsByteBuffer(class317.getFile(0, 0, -1917534237));
		((Class323) this).anInt3752 = class282_sub35.readUnsignedShort() * 309531567;
		((Class323) this).aClass169Array3753 = new Class169[821306191 * ((Class323) this).anInt3752];
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (class282_sub35.readUnsignedByte() == 1)
				((Class323) this).aClass169Array3753[i] = new Class169();
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aBool2056 = class282_sub35.readUnsignedByte() == 0;
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aBool2065 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aBool2072 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aByte2080 = class282_sub35.readByte((short) -27413);
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aByte2079 = class282_sub35.readByte((short) -24494);
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aByte2064 = class282_sub35.readByte((short) -3914);
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aByte2076 = class282_sub35.readByte((short) -25013);
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].aShort2073 = (short) class282_sub35.readUnsignedShort();
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aByte2081 = class282_sub35.readByte((short) -4135);
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].aByte2090 = class282_sub35.readByte((short) -10789);
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].aBool2087 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aBool2082 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aByte2088 = class282_sub35.readByte((short) -13267);
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].aBool2086 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].aBool2059 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].aBool2089 = class282_sub35.readUnsignedByte() == 1;
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (null != ((Class323) this).aClass169Array3753[i])
				((Class323) this).aClass169Array3753[i].anInt2091 = class282_sub35.readUnsignedByte() * 395759591;
		}
		for (int i = 0; i < ((Class323) this).anInt3752 * 821306191; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].anInt2077 = class282_sub35.readInt() * -1989009777;
		}
		for (int i = 0; i < 821306191 * ((Class323) this).anInt3752; i++) {
			if (((Class323) this).aClass169Array3753[i] != null)
				((Class323) this).aClass169Array3753[i].anInt2074 = class282_sub35.readUnsignedByte() * -1523744511;
		}
	}

	public int[] method141(int i, float f, int i_4_, int i_5_, boolean bool, int i_6_) {
		int[] is = (method5770(i, 1098624376).method14719(((Class323) this).aClass317_3751, this, (double) f, i_4_, i_5_, ((Class323) this).aClass169Array3753[i].aBool2082, (byte) -5));
		return is;
	}

	public float[] method145(int i, float f, int i_7_, int i_8_, boolean bool, int i_9_) {
		float[] fs = (method5770(i, 409452943).method14723(((Class323) this).aClass317_3751, this, i_7_, i_8_, ((Class323) this).aClass169Array3753[i].aBool2082, -1771156117));
		return fs;
	}

	public boolean method146(int i) {
		Class282_Sub50_Sub3 class282_sub50_sub3 = method5770(i, 1665929764);
		return (null != class282_sub50_sub3 && class282_sub50_sub3.method14717((((Class323) this).aClass317_3751), this, -1782889034));
	}

	public int method76() {
		return 821306191 * ((Class323) this).anInt3752;
	}

	public boolean method139(int i, int i_10_) {
		Class282_Sub50_Sub3 class282_sub50_sub3 = method5770(i, 832620623);
		return (null != class282_sub50_sub3 && class282_sub50_sub3.method14717((((Class323) this).aClass317_3751), this, -950452873));
	}

	public boolean method150(int i) {
		Class282_Sub50_Sub3 class282_sub50_sub3 = method5770(i, 2122748961);
		return (null != class282_sub50_sub3 && class282_sub50_sub3.method14717((((Class323) this).aClass317_3751), this, -450865232));
	}

	public float[] method143(int i, float f, int i_11_, int i_12_, boolean bool) {
		float[] fs = (method5770(i, 1967689599).method14723(((Class323) this).aClass317_3751, this, i_11_, i_12_, ((Class323) this).aClass169Array3753[i].aBool2082, -1771156117));
		return fs;
	}

	public boolean method147(int i) {
		Class282_Sub50_Sub3 class282_sub50_sub3 = method5770(i, 1168970702);
		return (null != class282_sub50_sub3 && class282_sub50_sub3.method14717((((Class323) this).aClass317_3751), this, 1117287067));
	}

	public int[] method151(int i, float f, int i_13_, int i_14_, boolean bool) {
		int[] is = (method5770(i, 1578123890).method14719(((Class323) this).aClass317_3751, this, (double) f, i_13_, i_14_, ((Class323) this).aClass169Array3753[i].aBool2082, (byte) -42));
		return is;
	}

	public int[] method149(int i, float f, int i_15_, int i_16_, boolean bool) {
		int[] is = (method5770(i, 131429824).method14718(((Class323) this).aClass317_3751, this, (double) f, i_15_, i_16_, bool, ((Class323) this).aClass169Array3753[i].aBool2082, 1932199605));
		return is;
	}

	public int[] method142(int i, float f, int i_17_, int i_18_, boolean bool) {
		int[] is = (method5770(i, 1541756935).method14718(((Class323) this).aClass317_3751, this, (double) f, i_17_, i_18_, bool, ((Class323) this).aClass169Array3753[i].aBool2082, 1245157724));
		return is;
	}

	public boolean method148(int i) {
		Class282_Sub50_Sub3 class282_sub50_sub3 = method5770(i, 1141007931);
		return (null != class282_sub50_sub3 && class282_sub50_sub3.method14717((((Class323) this).aClass317_3751), this, 1414802158));
	}

	public int[] method138(int i, float f, int i_19_, int i_20_, boolean bool) {
		int[] is = (method5770(i, 638861447).method14718(((Class323) this).aClass317_3751, this, (double) f, i_19_, i_20_, bool, ((Class323) this).aClass169Array3753[i].aBool2082, 733021009));
		return is;
	}

	public float[] method152(int i, float f, int i_21_, int i_22_, boolean bool) {
		float[] fs = (method5770(i, 795042789).method14723(((Class323) this).aClass317_3751, this, i_21_, i_22_, ((Class323) this).aClass169Array3753[i].aBool2082, -1771156117));
		return fs;
	}

	Class282_Sub50_Sub3 method5771(int i) {
		Class282_Sub50 class282_sub50 = ((Class323) this).aClass223_3754.method3758((long) i);
		if (class282_sub50 != null)
			return (Class282_Sub50_Sub3) class282_sub50;
		byte[] is = ((Class323) this).aClass317_3750.method5615(i, -1645578794);
		if (is == null)
			return null;
		Class282_Sub50_Sub3 class282_sub50_sub3 = new Class282_Sub50_Sub3(new RsByteBuffer(is));
		((Class323) this).aClass223_3754.method3759(class282_sub50_sub3, (long) i);
		return class282_sub50_sub3;
	}

	public float[] method154(int i, float f, int i_23_, int i_24_, boolean bool) {
		float[] fs = (method5770(i, 1535419542).method14723(((Class323) this).aClass317_3751, this, i_23_, i_24_, ((Class323) this).aClass169Array3753[i].aBool2082, -1771156117));
		return fs;
	}

	public float[] method155(int i, float f, int i_25_, int i_26_, boolean bool) {
		float[] fs = (method5770(i, 777010049).method14723(((Class323) this).aClass317_3751, this, i_25_, i_26_, ((Class323) this).aClass169Array3753[i].aBool2082, -1771156117));
		return fs;
	}

	public Class169 method156(int i) {
		return ((Class323) this).aClass169Array3753[i];
	}

	public void method157() {
		/* empty */
	}

	public int[] method140(int i, float f, int i_27_, int i_28_, boolean bool, byte i_29_) {
		int[] is = (method5770(i, 531210835).method14718(((Class323) this).aClass317_3751, this, (double) f, i_27_, i_28_, bool, ((Class323) this).aClass169Array3753[i].aBool2082, 112593463));
		return is;
	}

	public void method159() {
		/* empty */
	}

	public Class169 method160(int i) {
		return ((Class323) this).aClass169Array3753[i];
	}

	public float[] method153(int i, float f, int i_30_, int i_31_, boolean bool) {
		float[] fs = (method5770(i, 1019867788).method14723(((Class323) this).aClass317_3751, this, i_30_, i_31_, ((Class323) this).aClass169Array3753[i].aBool2082, -1771156117));
		return fs;
	}

	public void method158() {
		/* empty */
	}

	Class282_Sub50_Sub3 method5772(int i) {
		Class282_Sub50 class282_sub50 = ((Class323) this).aClass223_3754.method3758((long) i);
		if (class282_sub50 != null)
			return (Class282_Sub50_Sub3) class282_sub50;
		byte[] is = ((Class323) this).aClass317_3750.method5615(i, -239185434);
		if (is == null)
			return null;
		Class282_Sub50_Sub3 class282_sub50_sub3 = new Class282_Sub50_Sub3(new RsByteBuffer(is));
		((Class323) this).aClass223_3754.method3759(class282_sub50_sub3, (long) i);
		return class282_sub50_sub3;
	}

	public static int method5773(int i, int i_32_, byte i_33_) {
		int i_34_ = i_32_ >>> 24;
		int i_35_ = 255 - i_34_;
		i_32_ = ((i_32_ & 0xff00ff) * i_34_ & ~0xff00ff | i_34_ * (i_32_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_35_ & ~0xff00ff | (i & 0xff00) * i_35_ & 0xff0000) >>> 8) + i_32_);
	}

	static final void method5774(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class13.method501(class118, class98, class527, (byte) 22);
	}

	static final void method5775(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class363.method6288(class118, class98, class527, (short) 27570);
	}

	static final void method5776(CS2Executor class527, short i) {
		int i_36_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i_36_)
			throw new RuntimeException();
		Class431 class431 = Class466.aClass444_5570.method7424(i_36_, (byte) 8);
		if (class431.aChar5140 != 's')
			throw new RuntimeException();
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(string, (byte) -23) ? 1 : 0;
	}

	static void method5777(int i) {
		if (-1290103735 * Class263.anInt3277 > 1)
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub5_8221), 4, 482618320);
		else
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub5_8221), 2, -2037005846);
	}

	public static int nextPowerOfTwo(int i, int i_37_) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}
}
