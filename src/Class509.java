/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class509 {
	public Interface5[] anInterface5Array6217;

	Class509() {
		/* empty */
	}

	void method6283(RsByteBuffer class298_sub53, int i) {
		try {
			anInterface5Array6217 = new Interface5[class298_sub53.readUnsignedByte()];
			Class146[] class146s = Class521.method6323(1755655127);
			for (int i_0_ = 0; i_0_ < anInterface5Array6217.length; i_0_++)
				anInterface5Array6217[i_0_] = method6284(class298_sub53, (class146s[class298_sub53.readUnsignedByte()]), -1580077477);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("va.a(").append(')').toString());
		}
	}

	Interface5 method6284(RsByteBuffer class298_sub53, Class146 class146, int i) {
		try {
			if (class146 == Class146.aClass146_1569)
				return Class221.method2052(class298_sub53, 791939430);
			if (class146 == Class146.aClass146_1565)
				return SomethingDefinitions.method6247(class298_sub53, 1486124265);
			if (class146 == Class146.aClass146_1568)
				return Class58.method695(class298_sub53, -1734441948);
			if (class146 == Class146.aClass146_1573)
				return Class394.method4899(class298_sub53, 931476429);
			if (Class146.aClass146_1572 == class146)
				return Class80.method853(class298_sub53, (short) 172);
			if (Class146.aClass146_1566 == class146)
				return Class304.method3741(class298_sub53, -970414625);
			if (Class146.aClass146_1567 == class146)
				return Class266.method2524(class298_sub53, (byte) -19);
			if (Class146.aClass146_1564 == class146)
				return Class122.method1318(class298_sub53, (byte) -71);
			if (class146 == Class146.aClass146_1570)
				return Class393.method4896(class298_sub53, (byte) 8);
			if (class146 == Class146.aClass146_1571)
				return Class24.method382(class298_sub53, -24258340);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("va.f(").append(')').toString());
		}
	}

	static final void method6285(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_1_);
			if (i_2_ >= 1 && i_2_ <= 5 && class468.aStringArray5723[i_2_ - 1] != null)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class468.aStringArray5723[i_2_ - 1];
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("va.aaw(").append(')').toString());
		}
	}

	public static void method6286(int i, int i_3_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(8, (long) i);
			class298_sub37_sub12.method3445(-1712153653);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("va.n(").append(')').toString());
		}
	}
}
