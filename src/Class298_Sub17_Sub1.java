/* Class298_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub1 extends Class298_Sub17 {
	int anInt9191;
	byte aByte9192;
	String aString9194;

	void method2916(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			class298_sub53.readLong((short) 28399);
		}
		((Class298_Sub17_Sub1) this).aString9194 = class298_sub53.method3652(-517364695);
		((Class298_Sub17_Sub1) this).anInt9191 = class298_sub53.readUnsignedShort() * -1467351539;
		((Class298_Sub17_Sub1) this).aByte9192 = class298_sub53.readByte(-12558881);
		class298_sub53.readLong((short) 23541);
	}

	Class298_Sub17_Sub1(Class152 class152) {
		super();
		((Class298_Sub17_Sub1) this).aString9194 = null;
	}

	void method2921(ClanChannel class298_sub25) {
		ClanMember class163 = new ClanMember();
		class163.username = ((Class298_Sub17_Sub1) this).aString9194;
		class163.world = ((Class298_Sub17_Sub1) this).anInt9191 * 1934144191;
		class163.rank = ((Class298_Sub17_Sub1) this).aByte9192;
		class298_sub25.method3096(class163, 1759515162);
	}

	void method2919(ClanChannel class298_sub25) {
		ClanMember class163 = new ClanMember();
		class163.username = ((Class298_Sub17_Sub1) this).aString9194;
		class163.world = ((Class298_Sub17_Sub1) this).anInt9191 * 1934144191;
		class163.rank = ((Class298_Sub17_Sub1) this).aByte9192;
		class298_sub25.method3096(class163, -1986283944);
	}

	void method2918(ClanChannel class298_sub25, int i) {
		try {
			ClanMember class163 = new ClanMember();
			class163.username = ((Class298_Sub17_Sub1) this).aString9194;
			class163.world = ((Class298_Sub17_Sub1) this).anInt9191 * 1934144191;
			class163.rank = ((Class298_Sub17_Sub1) this).aByte9192;
			class298_sub25.method3096(class163, 1028626118);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agh.f(").append(')').toString());
		}
	}

	void method2920(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			class298_sub53.readLong((short) 3495);
		}
		((Class298_Sub17_Sub1) this).aString9194 = class298_sub53.method3652(-517364695);
		((Class298_Sub17_Sub1) this).anInt9191 = class298_sub53.readUnsignedShort() * -1467351539;
		((Class298_Sub17_Sub1) this).aByte9192 = class298_sub53.readByte(-12558881);
		class298_sub53.readLong((short) 28080);
	}

	void method2917(RsByteBuffer class298_sub53, int i) {
		try {
			if (class298_sub53.readUnsignedByte() != 255) {
				class298_sub53.index -= 116413311;
				class298_sub53.readLong((short) 7794);
			}
			((Class298_Sub17_Sub1) this).aString9194 = class298_sub53.method3652(-517364695);
			((Class298_Sub17_Sub1) this).anInt9191 = class298_sub53.readUnsignedShort() * -1467351539;
			((Class298_Sub17_Sub1) this).aByte9192 = class298_sub53.readByte(-12558881);
			class298_sub53.readLong((short) 8524);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agh.a(").append(')').toString());
		}
	}

	void method2922(RsByteBuffer class298_sub53) {
		if (class298_sub53.readUnsignedByte() != 255) {
			class298_sub53.index -= 116413311;
			class298_sub53.readLong((short) 10216);
		}
		((Class298_Sub17_Sub1) this).aString9194 = class298_sub53.method3652(-517364695);
		((Class298_Sub17_Sub1) this).anInt9191 = class298_sub53.readUnsignedShort() * -1467351539;
		((Class298_Sub17_Sub1) this).aByte9192 = class298_sub53.readByte(-12558881);
		class298_sub53.readLong((short) 9073);
	}
}
