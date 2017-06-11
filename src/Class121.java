/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class121 implements Interface4 {
	static int[] anIntArray6321;

	public long method48(String string) {
		return Class368.method4554(string, (byte) 51);
	}

	public long method47(String string, byte i) {
		try {
			return Class368.method4554(string, (byte) 51);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ex.a(").append(')').toString());
		}
	}

	public long method46(String string) {
		return Class368.method4554(string, (byte) 104);
	}

	static final void method1314(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -40);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class363.method4314(class105, class119, class403, 280747696);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ex.ip(").append(')').toString());
		}
	}

	static Class298_Sub48 method1315(int i) {
		try {
			Class476 class476 = null;
			Class298_Sub48 class298_sub48 = new Class298_Sub48(client.aClass411_8944, 0);
			try {
				class476 = Class86.method962("", client.aClass411_8944.aString5317, false, -1804643872);
				byte[] is = new byte[(int) class476.method6080(-423906976)];
				int i_1_;
				for (int i_2_ = 0; i_2_ < is.length; i_2_ += i_1_) {
					i_1_ = class476.method6081(is, i_2_, is.length - i_2_, (short) 4730);
					if (-1 == i_1_)
						throw new IOException();
				}
				class298_sub48 = new Class298_Sub48(new RsByteBuffer(is), client.aClass411_8944, 0);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (null != class476)
					class476.method6079(1294013462);
			} catch (Exception exception) {
				/* empty */
			}
			return class298_sub48;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ex.a(").append(')').toString());
		}
	}

	static final void method1316(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class247.method2363(class105, class119, class403, 1246330568);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ex.fd(").append(')').toString());
		}
	}
}
