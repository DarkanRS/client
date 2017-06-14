/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class165 implements Interface5 {
	public int anInt6365;
	public static Class319 recorder;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1570;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gt.f(").append(')').toString());
		}
	}

	public Class146 method50() {
		return Class146.aClass146_1570;
	}

	public Class146 method51() {
		return Class146.aClass146_1570;
	}

	Class165(int i) {
		anInt6365 = i * -1617371261;
	}

	static final void method1781(IComponentDefinition class105, Class119 class119, ClientScript2 class403, short i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (class105.anInt1289 * -324971993 != i_0_) {
				class105.anInt1289 = 1025047959 * i_0_;
				Tradution.method6054(class105, -1283605613);
			}
			if (-1 == class105.anInt1154 * -1309843523 && !class119.aBoolean1403)
				Class302_Sub2.method3720(-440872681 * class105.anInt1142, (byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gt.gs(").append(')').toString());
		}
	}

	static void method1782(long[] ls, Object[] objects, int i, int i_1_, int i_2_) {
		try {
			if (i < i_1_) {
				int i_3_ = (i + i_1_) / 2;
				int i_4_ = i;
				long l = ls[i_3_];
				ls[i_3_] = ls[i_1_];
				ls[i_1_] = l;
				Object object = objects[i_3_];
				objects[i_3_] = objects[i_1_];
				objects[i_1_] = object;
				int i_5_ = 9223372036854775807L == l ? 0 : 1;
				for (int i_6_ = i; i_6_ < i_1_; i_6_++) {
					if (ls[i_6_] < l + (long) (i_6_ & i_5_)) {
						long l_7_ = ls[i_6_];
						ls[i_6_] = ls[i_4_];
						ls[i_4_] = l_7_;
						Object object_8_ = objects[i_6_];
						objects[i_6_] = objects[i_4_];
						objects[i_4_++] = object_8_;
					}
				}
				ls[i_1_] = ls[i_4_];
				ls[i_4_] = l;
				objects[i_1_] = objects[i_4_];
				objects[i_4_] = object;
				method1782(ls, objects, i, i_4_ - 1, 975453798);
				method1782(ls, objects, i_4_ + 1, i_1_, -1825686782);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gt.q(").append(')').toString());
		}
	}

	static void method1783(int i) {
		try {
			int[] is = new int[(Class298_Sub32_Sub14.aClass477_9400.itemDefinitionsLength * -888767613)];
			int i_9_ = 0;
			for (int i_10_ = 0; i_10_ < (-888767613 * Class298_Sub32_Sub14.aClass477_9400.itemDefinitionsLength); i_10_++) {
				ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_10_);
				if (1343198193 * class468.anInt5724 >= 0 || 1585491093 * class468.anInt5747 >= 0)
					is[i_9_++] = i_10_;
			}
			Class519.anIntArray6274 = new int[i_9_];
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++)
				Class519.anIntArray6274[i_11_] = is[i_11_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gt.n(").append(')').toString());
		}
	}

	static final void method1784(ClientScript2 class403, byte i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_12_, (byte) -27);
			int i_13_ = -1;
			int i_14_ = -1;
			Class117 class117 = class105.method1116(Class373.aClass_ra4071, 1559428350);
			if (null != class117) {
				i_13_ = class117.anInt1393 * 1633695381;
				i_14_ = -60174999 * class117.anInt1394;
			}
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_13_;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gt.rm(").append(')').toString());
		}
	}
}
