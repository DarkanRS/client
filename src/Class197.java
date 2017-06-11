/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class197 {
	Class243 aClass243_1987;
	Class243 aClass243_1988;
	Class348 aClass348_1989 = new Class348(20);
	Map aMap1990 = null;
	int[] anIntArray1991;
	static int anInt1992;

	public int method1875(boolean bool, int i) {
		try {
			if (((Class197) this).anIntArray1991 == null)
				return 0;
			if (!bool && null != ((Class197) this).aMap1990)
				return ((Class197) this).anIntArray1991.length * 2;
			int i_0_ = 0;
			for (int i_1_ = 0; i_1_ < ((Class197) this).anIntArray1991.length; i_1_++) {
				int i_2_ = ((Class197) this).anIntArray1991[i_1_];
				if (((Class197) this).aClass243_1987.method2310(i_2_, -457216440))
					i_0_++;
				if (((Class197) this).aClass243_1988.method2310(i_2_, -457216440))
					i_0_++;
			}
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.p(").append(')').toString());
		}
	}

	public void method1876(int i) {
		try {
			((Class197) this).aMap1990 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.f(").append(')').toString());
		}
	}

	public int method1877(int i) {
		try {
			return method1875(false, -249350940);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.b(").append(')').toString());
		}
	}

	public int method1878(int i) {
		try {
			if (((Class197) this).anIntArray1991 == null)
				return 0;
			return ((Class197) this).anIntArray1991.length * 2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.i(").append(')').toString());
		}
	}

	public Class505 method1879(Interface10 interface10, int i, int i_3_) {
		try {
			Class454 class454 = method1885(interface10, i, true, true, -160012913);
			if (null == class454)
				return null;
			return (Class505) class454.anObject5646;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.d(").append(')').toString());
		}
	}

	public void method1880(int i) {
		try {
			((Class197) this).aClass348_1989.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.x(").append(')').toString());
		}
	}

	public void method1881(int i, int i_4_) {
		try {
			((Class197) this).aClass348_1989.method4186(i, -19915416);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.r(").append(')').toString());
		}
	}

	public void method1882(Interface10 interface10, byte i) {
		try {
			((Class197) this).aMap1990 = new HashMap(((Class197) this).anIntArray1991.length);
			for (int i_5_ = 0; i_5_ < ((Class197) this).anIntArray1991.length; i_5_++) {
				int i_6_ = ((Class197) this).anIntArray1991[i_5_];
				Class505 class505 = Class255.method2439(((Class197) this).aClass243_1988, i_6_, -227622319);
				byte[] is = ((Class197) this).aClass243_1987.method2294(i_6_, (byte) 82);
				Object object = interface10.method131(is, class505, true, -2012626904);
				((Class197) this).aMap1990.put(Integer.valueOf(i_5_), new Class454(object, class505));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.a(").append(')').toString());
		}
	}

	public Object method1883(Interface10 interface10, int i, boolean bool, boolean bool_7_, int i_8_) {
		try {
			Class454 class454 = method1885(interface10, i, bool, bool_7_, 229227815);
			if (class454 == null)
				return null;
			return class454.anObject5645;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.k(").append(')').toString());
		}
	}

	public void method1884(int i) {
		try {
			((Class197) this).aClass348_1989.method4189();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.q(").append(')').toString());
		}
	}

	Class454 method1885(Interface10 interface10, int i, boolean bool, boolean bool_9_, int i_10_) {
		try {
			if (-1 == i)
				return null;
			if (((Class197) this).anIntArray1991 != null) {
				for (int i_11_ = 0; i_11_ < ((Class197) this).anIntArray1991.length; i_11_++) {
					if (i == ((Class197) this).anIntArray1991[i_11_])
						return (Class454) ((Class197) this).aMap1990.get(Integer.valueOf(i_11_));
				}
			}
			Class454 class454 = ((Class454) ((Class197) this).aClass348_1989.method4184((long) (i << 1 | (bool_9_ ? 1 : 0))));
			if (null != class454) {
				if (bool && class454.anObject5646 == null) {
					Class505 class505 = Class255.method2439(((Class197) this).aClass243_1988, i, -221293891);
					if (null == class505)
						return null;
					class454.anObject5646 = class505;
				}
				return class454;
			}
			byte[] is = ((Class197) this).aClass243_1987.method2294(i, (byte) 54);
			if (null == is)
				return null;
			Class505 class505 = Class255.method2439(((Class197) this).aClass243_1988, i, 1718390038);
			if (class505 == null)
				return null;
			if (bool)
				class454 = new Class454(interface10.method131(is, class505, bool_9_, -1761009560), class505);
			else
				class454 = new Class454(interface10.method131(is, class505, bool_9_, -2090037397), null);
			((Class197) this).aClass348_1989.method4194(class454, (long) (i << 1 | (bool_9_ ? 1 : 0)));
			return class454;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.u(").append(')').toString());
		}
	}

	public Class197(Class243 class243, Class243 class243_12_, int[] is) {
		((Class197) this).aClass243_1987 = class243;
		((Class197) this).aClass243_1988 = class243_12_;
		if (null != is)
			((Class197) this).anIntArray1991 = is;
		else
			((Class197) this).anIntArray1991 = null;
	}

	static final void method1886(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1086526073 * class105.anInt1262;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.px(").append(')').toString());
		}
	}

	static final void method1887(ClientScript2 class403, int i) {
		try {
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_13_, (byte) 71);
			Class119 class119 = Class389.aClass119Array4165[i_13_ >> 16];
			Class7.method310(class105, class119, class403, (byte) 102);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.od(").append(')').toString());
		}
	}

	static void method1888(int i, boolean bool, int i_14_) {
		try {
			Class298_Sub9 class298_sub9 = Class255.method2437(i, bool, 1277483186);
			if (class298_sub9 != null)
				class298_sub9.unlink(-1460969981);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ii.x(").append(')').toString());
		}
	}
}
