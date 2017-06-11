/* Class82_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class82_Sub19 extends Class82 {
	int anInt6893;
	int anInt6894;
	int anInt6895;

	Class82_Sub19(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub19) this).anInt6895 = class298_sub53.readUnsignedShort() * -752019511;
		((Class82_Sub19) this).anInt6894 = class298_sub53.readUnsignedShort() * -1262871307;
		((Class82_Sub19) this).anInt6893 = class298_sub53.readUnsignedByte() * 1089946905;
	}

	boolean method870(int i) {
		try {
			Class398 class398 = Class158_Sub1.aClass389_8568.method4857((720810617 * ((Class82_Sub19) this).anInt6895), -2111155708);
			boolean bool = class398.method4919((byte) 51);
			Class391 class391 = Class501.aClass395_6122.method4903(1505778629 * class398.anInt5205, (byte) 13);
			bool &= class391.method4880(1053460676);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.p(").append(')').toString());
		}
	}

	boolean method924() {
		Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(720810617 * ((Class82_Sub19) this).anInt6895, -1729093071));
		boolean bool = class398.method4919((byte) 82);
		Class391 class391 = Class501.aClass395_6122.method4903(1505778629 * class398.anInt5205, (byte) -7);
		bool &= class391.method4880(2049469908);
		return bool;
	}

	static final void method925(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.aBoolean1180 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, 564764353);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.fo(").append(')').toString());
		}
	}

	public static void method926(int i) {
		try {
			if (Class229.anInt6459 * 1100796341 != -1) {
				Class74.method830(Class229.anInt6459 * 1100796341, -1, -1, false, 225660373);
				Class229.anInt6459 = -678712477;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.cx(").append(')').toString());
		}
	}

	static final void method927(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (-1 == i_0_)
				throw new RuntimeException();
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_0_, 1528209569);
			if ('s' != class483.aChar6037)
				throw new RuntimeException();
			int[] is = class483.method6128(string, (short) 19209);
			int i_1_ = 0;
			if (null != is)
				i_1_ = is.length;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.vf(").append(')').toString());
		}
	}

	static final void method928(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class323.method3947(class105, class119, class403, 845844637);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.gr(").append(')').toString());
		}
	}

	static final void method929(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) -23);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 840270937 * class105.anInt1306;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.rc(").append(')').toString());
		}
	}

	static final void method930(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1102843797 * ((ClientScript2) class403).aClass162_5252.anInt1669;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ym.xg(").append(')').toString());
		}
	}
}
