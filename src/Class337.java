/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class337 {
	static Class337 aClass337_3624;
	static Class337 aClass337_3625;
	int anInt3626;
	static Class337 aClass337_3627 = new Class337(0);

	static {
		aClass337_3625 = new Class337(1);
		aClass337_3624 = new Class337(2);
	}

	Class337(int i) {
		((Class337) this).anInt3626 = i * 11911155;
	}

	static final void method4109(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			Class376 class376 = Class299.aClass370_3199.method4576(i_0_, -1387183809);
			if (null == class376)
				throw new RuntimeException();
			Integer integer = (((ClientScript2) class403).aClass162_5252.method1754((client.aClass411_8944.gameType * -937307905 << 16 | class376.anInt4086 * -1808461691), class376.anInt4087 * -2047408817, class376.anInt4088 * -530058953, -1943222730));
			int i_1_;
			if (integer == null)
				i_1_ = 0;
			else
				i_1_ = integer.intValue();
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ob.bh(").append(')').toString());
		}
	}

	static final void method4110(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class234.method2184(class105, class119, class403, (byte) 57);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ob.ca(").append(')').toString());
		}
	}

	static final void method4111(ClientScript2 class403, byte i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 62);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class291.method2787(class105, class119, class403, 1932699563);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ob.fb(").append(')').toString());
		}
	}

	static final void method4112(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_3_);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class468.aBoolean5771 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ob.aba(").append(')').toString());
		}
	}
}
