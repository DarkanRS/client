/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class190 {
	public static int anInt1917 = 1;
	static int anInt1918 = 2;
	static int anInt1919 = 0;
	public int anInt1920;
	public static int anInt1921 = 2;
	int anInt1922;
	static int anInt1923 = 1;
	public static int anInt1924 = 0;
	static int anInt1925 = 1;
	public static Class190[] aClass190Array1926 = new Class190[16];
	boolean aBoolean1927;
	public static HashTable aClass437_1928;
	static Class348 aClass348_1929;
	public int anInt1930;
	public long aLong1931;
	static int anInt1932 = 0;
	public int anInt1933;
	public int anInt1934;
	public int anInt1935;
	public int anInt1936;
	public static int anInt1937 = 1;
	public static int anInt1938 = 0;
	public int anInt1939;
	public int anInt1940;
	public int anInt1941;
	public int anInt1942 = 0;
	public int anInt1943;

	static {
		aClass437_1928 = new HashTable(16);
		aClass348_1929 = new Class348(64);
	}

	void method1853(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i == -1336450331)
						throw new IllegalStateException();
					break;
				}
				method1854(class298_sub53, i_0_, 1980463854);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.b(").append(')').toString());
		}
	}

	void method1854(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i)
				((Class190) this).anInt1922 = class298_sub53.readUnsignedShort() * 631997191;
			else if (2 == i)
				class298_sub53.readUnsignedByte();
			else if (i == 3) {
				anInt1933 = class298_sub53.readInt((byte) -21) * 2057106809;
				anInt1934 = class298_sub53.readInt((byte) 12) * 2073554425;
				anInt1935 = class298_sub53.readInt((byte) 61) * 659772455;
			} else if (4 == i) {
				anInt1936 = class298_sub53.readUnsignedByte() * -1434113687;
				anInt1920 = class298_sub53.readInt((byte) 6) * 1749954193;
			} else if (6 == i)
				anInt1940 = class298_sub53.readUnsignedByte() * 2068768775;
			else if (i == 8)
				anInt1942 = 652557667;
			else if (9 == i)
				anInt1939 = -1270173587;
			else if (i == 10)
				((Class190) this).aBoolean1927 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.p(").append(')').toString());
		}
	}

	void method1855(int i) {
		try {
			anInt1943 = (-738467127 * (Class220.anIntArray2474[((Class190) this).anInt1922 * -1184073033 << 3]));
			long l = (long) (anInt1933 * 1776313545);
			long l_2_ = (long) (-739294135 * anInt1934);
			long l_3_ = (long) (anInt1935 * -1849369705);
			anInt1941 = (int) Math.sqrt((double) (l * l + l_2_ * l_2_ + l_3_ * l_3_)) * -1363693449;
			if (-1595714959 * anInt1920 == 0)
				anInt1920 = 1749954193;
			if (anInt1936 * -1660029223 == 0)
				aLong1931 = -5755520316440321689L;
			else if (anInt1936 * -1660029223 == 1) {
				aLong1931 = ((long) (-1570158024 * anInt1941 / (anInt1920 * -1595714959)) * 8888916578422759065L);
				aLong1931 *= aLong1931 * 6688605316592129449L;
			} else if (-1660029223 * anInt1936 == 2)
				aLong1931 = ((long) (-1570158024 * anInt1941 / (-1595714959 * anInt1920)) * 8888916578422759065L);
			if (((Class190) this).aBoolean1927)
				anInt1941 *= -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.i(").append(')').toString());
		}
	}

	Class190() {
		anInt1939 = 0;
		((Class190) this).aBoolean1927 = false;
	}

	static final void method1856(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) 2);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -2093041337 * class105.anInt1156;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.qh(").append(')').toString());
		}
	}

	static final void method1857(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (client.anInt8942 * 1131012101 != 0 && i_5_ < -548972447 * client.anInt8952) {
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = client.aStringArray8859[i_5_];
				if (null != client.aStringArray8955[i_5_])
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = client.aStringArray8955[i_5_];
				else
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			} else {
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.wr(").append(')').toString());
		}
	}

	static final void method1858(ClientScript2 class403, int i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub4_7563.method5612(i_6_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.aos(").append(')').toString());
		}
	}

	public static int method1859(byte i) {
		try {
			if (Class452.aBoolean5642 && null != Class231.aFrame2589)
				return 3;
			return client.aBoolean8799 ? 2 : 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.gc(").append(')').toString());
		}
	}

	static final void method1860(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5259 += ((((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hy.j(").append(')').toString());
		}
	}
}
