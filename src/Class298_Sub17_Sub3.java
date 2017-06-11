/* Class298_Sub17_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub3 extends Class298_Sub17 {
	Class152 aClass152_9200;
	int anInt9201;

	Class298_Sub17_Sub3(Class152 class152) {
		super();
		((Class298_Sub17_Sub3) this).anInt9201 = -2081754389;
	}

	void method2917(RsByteBuffer class298_sub53, int i) {
		try {
			((Class298_Sub17_Sub3) this).anInt9201 = class298_sub53.readUnsignedShort() * 2081754389;
			class298_sub53.readUnsignedByte();
			if (class298_sub53.readUnsignedByte() != 255) {
				class298_sub53.index -= 116413311;
				class298_sub53.readLong((short) 30041);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agk.a(").append(')').toString());
		}
	}

	void method2918(ClanChannel class298_sub25, int i) {
		try {
			class298_sub25.method3100((((Class298_Sub17_Sub3) this).anInt9201 * -528950723), -554375757);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agk.f(").append(')').toString());
		}
	}

	void method2919(ClanChannel class298_sub25) {
		class298_sub25.method3100((((Class298_Sub17_Sub3) this).anInt9201 * -528950723), -464922462);
	}

	void method2921(ClanChannel class298_sub25) {
		class298_sub25.method3100((((Class298_Sub17_Sub3) this).anInt9201 * -528950723), -489380093);
	}

	void method2920(RsByteBuffer class298_sub53) {
		((Class298_Sub17_Sub3) this).anInt9201 = class298_sub53.readUnsignedShort() * 2081754389;
		class298_sub53.readUnsignedByte();
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			class298_sub53.readLong((short) 3485);
		}
	}

	void method2916(RsByteBuffer class298_sub53) {
		((Class298_Sub17_Sub3) this).anInt9201 = class298_sub53.readUnsignedShort() * 2081754389;
		class298_sub53.readUnsignedByte();
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			class298_sub53.readLong((short) 22737);
		}
	}

	void method2922(RsByteBuffer class298_sub53) {
		((Class298_Sub17_Sub3) this).anInt9201 = class298_sub53.readUnsignedShort() * 2081754389;
		class298_sub53.readUnsignedByte();
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			class298_sub53.readLong((short) 21753);
		}
	}

	static final void method2924(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).aLongArray5251[((((ClientScript2) class403).anInt5245 += -682569305) * 1685767703 - 1)] = (((ClientScript2) class403).aLongArray5235[(((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259])]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agk.by(").append(')').toString());
		}
	}
}
