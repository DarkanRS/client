/* Class_ta_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ta_Sub2 extends Class_ta {
	int[] anIntArray8442;
	int[] anIntArray8443;

	Class_ta_Sub2(int i, int i_0_, int[] is, int[] is_1_) {
		((Class_ta_Sub2) this).anIntArray8443 = is;
		((Class_ta_Sub2) this).anIntArray8442 = is_1_;
	}

	static void method6000(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 1]), 245040087).anInt4012) * 126451825;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.p(").append(')').toString());
		}
	}

	public static void method6001(Class57[] class57s, int i) {
		try {
			Class277.anInt2964 = -1283115375 * class57s.length;
			Class436.aClass57Array5501 = new Class57[Class277.anInt2964 * -232961423 + 10];
			Class422_Sub3.anIntArray8372 = new int[-232961423 * Class277.anInt2964 + 10];
			System.arraycopy(class57s, 0, Class436.aClass57Array5501, 0, -232961423 * Class277.anInt2964);
			for (int i_2_ = 0; i_2_ < -232961423 * Class277.anInt2964; i_2_++)
				Class422_Sub3.anIntArray8372[i_2_] = Class436.aClass57Array5501[i_2_].method626();
			for (int i_3_ = Class277.anInt2964 * -232961423; i_3_ < Class436.aClass57Array5501.length; i_3_++)
				Class422_Sub3.anIntArray8372[i_3_] = 12;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.ao(").append(')').toString());
		}
	}

	static final void method6002(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class308_Sub1.method3786(class105, class119, class403, 805534141);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.kv(").append(')').toString());
		}
	}

	static RsByteBuffer method6003(int i) {
		try {
			RsByteBuffer class298_sub53 = Class322.method3933(-68618923);
			class298_sub53.writeLong(0L);
			class298_sub53.writeString(Class360.password, 2126310592);
			class298_sub53.writeLong(Class360.aLong3911 * 6528380240290452803L);
			class298_sub53.writeLong(client.clientKey * -8380697455384249973L);
			class298_sub53.applyRsa(Class50.aBigInteger500, Class50.aBigInteger503, 1411965819);
			return class298_sub53;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.w(").append(')').toString());
		}
	}

	static void method6004(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), 245040087).aString4008);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.f(").append(')').toString());
		}
	}

	static final void method6005(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (null != client.aString8804 && i_4_ < Class489.anInt6071 * -1801543887)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class82_Sub6.aClass7Array6846[i_4_].aString93;
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.wz(").append(')').toString());
		}
	}

	public static void method6006(Class243 class243, Class243 class243_5_, int i, byte i_6_) {
		try {
			Class317.aClass243_3321 = class243;
			Class298_Sub37_Sub4.aClass243_9582 = class243_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wi.a(").append(')').toString());
		}
	}
}
