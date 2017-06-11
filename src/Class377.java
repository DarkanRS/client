/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class377 {
	public Interface19 anInterface19_4091;
	public static Class243 aClass243_4092;

	public Class377(Class243 class243) {
		byte[] is = class243.method2294((Class380.aClass380_4100.anInt4108 * -363169051), (byte) 11);
		method4661(new RsByteBuffer(is), 1724191904);
	}

	void method4661(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i != 1724191904)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_0_)
					anInterface19_4091 = ObjectDefinitions.method5786(class298_sub53, (byte) -47);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.a(").append(')').toString());
		}
	}

	static final void method4662(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) 58);
			Class119 class119 = Class389.aClass119Array4165[i_1_ >> 16];
			Class135.method1490(class105, class119, class403, 1344346794);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.gl(").append(')').toString());
		}
	}

	static final void method4663(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub10_7548.method5660(-575221319) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.anr(").append(')').toString());
		}
	}

	public static String method4664(long l) {
		try {
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if (l % 37L == 0L)
				return null;
			int i = 0;
			for (long l_2_ = l; 0L != l_2_; l_2_ /= 37L)
				i++;
			StringBuilder stringbuilder = new StringBuilder(i);
			while (0L != l) {
				long l_3_ = l;
				l /= 37L;
				stringbuilder.append(Class420.aCharArray5342[(int) (l_3_ - 37L * l)]);
			}
			return stringbuilder.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.f(").append(')').toString());
		}
	}

	static final void method4665(IComponentDefinition class105, Class119 class119, ClientScript2 class403, short i) {
		try {
			class105.aBoolean1182 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, -275285651);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.fs(").append(')').toString());
		}
	}

	static final void method4666(ClientScript2 class403, byte i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) -91);
			Class119 class119 = Class389.aClass119Array4165[i_4_ >> 16];
			Class393.method4891(class105, class119, class403, (byte) -121);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.hd(").append(')').toString());
		}
	}

	static final void method4667(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (2 == 1131012101 * client.anInt8942 && i_5_ >= 0 && i_5_ < client.anInt8941 * -1054937867)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = client.aBooleanArray8722[i_5_] ? 1 : 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.wt(").append(')').toString());
		}
	}

	static final void method4668(ClientScript2 class403, byte i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = ((ClientScript2) class403).aClass162_5252.aStringArray1668[i_6_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pr.xw(").append(')').toString());
		}
	}
}
