/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class158 implements Interface5 {
	public int anInt6359;
	public Class139 aClass139_6360;
	public int anInt6361;
	public int anInt6362;
	public Class133 aClass133_6363;
	public static Class243 aClass243_6364;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1572;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gl.f(").append(')').toString());
		}
	}

	public Class146 method50() {
		return Class146.aClass146_1572;
	}

	Class158(int i, Class139 class139, Class133 class133, int i_0_, int i_1_) {
		anInt6361 = i * -1500420259;
		aClass139_6360 = class139;
		aClass133_6363 = class133;
		anInt6362 = i_0_ * -455546715;
		anInt6359 = -463734461 * i_1_;
	}

	public Class146 method51() {
		return Class146.aClass146_1572;
	}

	static final void method1699(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -172692776) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1209 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gl.ln(").append(')').toString());
		}
	}

	static final void method1700(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 76);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1170 * 1045422783;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gl.rv(").append(')').toString());
		}
	}

	static final void method1701(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			Class320.method3913((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]), (((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]), true, 256, 1228357249);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gl.tk(").append(')').toString());
		}
	}

	public static Object method1702(byte[] is, boolean bool, short i) {
		try {
			if (is == null)
				return null;
			if (is.length > 136) {
				ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
				bytebuffer.position(0);
				bytebuffer.put(is);
				return bytebuffer;
			}
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gl.a(").append(')').toString());
		}
	}
}
