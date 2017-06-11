/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class345 implements Interface19 {
	int anInt6521;
	int anInt6522;
	int[] anIntArray6523;

	public boolean method238(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323) {
		if (null == class298_sub50) {
			if (-1 != ((Class345) this).anInt6522 * 1099340307)
				return false;
		} else {
			if (1099340307 * ((Class345) this).anInt6522 != class298_sub50.method3546(-1372966703))
				return false;
			if (((Class345) this).anInt6521 * 1026337135 > class298_sub50.method3548(49279861))
				return false;
			int[] is = ((Class345) this).anIntArray6523;
			for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
				int i_1_ = is[i_0_];
				if (!class323.method3936(i_1_, 311958108))
					return false;
			}
		}
		return true;
	}

	public boolean method239(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323, int i_2_) {
		try {
			if (null == class298_sub50) {
				if (-1 != ((Class345) this).anInt6522 * 1099340307)
					return false;
			} else {
				if (1099340307 * ((Class345) this).anInt6522 != class298_sub50.method3546(-1372966703))
					return false;
				if (((Class345) this).anInt6521 * 1026337135 > class298_sub50.method3548(1840203341))
					return false;
				int[] is = ((Class345) this).anIntArray6523;
				for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
					int i_4_ = is[i_3_];
					if (!class323.method3936(i_4_, 741080989))
						return false;
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oj.a(").append(')').toString());
		}
	}

	public boolean method237(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323) {
		if (null == class298_sub50) {
			if (-1 != ((Class345) this).anInt6522 * 1099340307)
				return false;
		} else {
			if (1099340307 * ((Class345) this).anInt6522 != class298_sub50.method3546(-1372966703))
				return false;
			if (((Class345) this).anInt6521 * 1026337135 > class298_sub50.method3548(966339099))
				return false;
			int[] is = ((Class345) this).anIntArray6523;
			for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
				int i_6_ = is[i_5_];
				if (!class323.method3936(i_6_, 226662543))
					return false;
			}
		}
		return true;
	}

	Class345(int i, int i_7_, int[] is) {
		((Class345) this).anInt6522 = i * 397623323;
		((Class345) this).anInt6521 = 875353487 * i_7_;
		((Class345) this).anIntArray6523 = is;
	}

	static final void method4166(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) 23);
			Class119 class119 = Class389.aClass119Array4165[i_8_ >> 16];
			Class277.method2594(class105, class119, class403, 2094067145);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oj.di(").append(')').toString());
		}
	}

	static final void method4167(ClientScript2 class403, byte i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_9_, (byte) 69);
			Class119 class119 = Class389.aClass119Array4165[i_9_ >> 16];
			Graphics.method613(class105, class119, class403, 230712598);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oj.jc(").append(')').toString());
		}
	}

	static final void method4168(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (i_10_ >= 0 && i_10_ < 2)
				client.anIntArrayArrayArray8767[i_10_] = new int[i_11_ << 1][4];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oj.afc(").append(')').toString());
		}
	}

	static final void method4169(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class372_Sub1.method4597(class105, class119, class403, 2138038025);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oj.ns(").append(')').toString());
		}
	}
}
