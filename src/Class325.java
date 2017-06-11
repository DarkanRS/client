/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325 {
	int anInt3449;
	int anInt3450 = -192677437;
	int[] anIntArray3451;
	Class320 aClass320_3452;
	int anInt3453;
	public static long aLong3454;

	Class325() {
		((Class325) this).anInt3449 = 2100310889;
		((Class325) this).aClass320_3452 = Class320.aClass320_6548;
		((Class325) this).anInt3453 = 544205675;
	}

	void method3961(RsByteBuffer class298_sub53, int i, int i_0_) {
		try {
			if (1 == i)
				((Class325) this).anInt3450 = class298_sub53.readUnsignedShort() * 192677437;
			else if (2 == i) {
				((Class325) this).anIntArray3451 = new int[class298_sub53.readUnsignedByte()];
				for (int i_1_ = 0; i_1_ < ((Class325) this).anIntArray3451.length; i_1_++)
					((Class325) this).anIntArray3451[i_1_] = class298_sub53.readUnsignedShort();
			} else if (3 == i)
				((Class325) this).anInt3449 = class298_sub53.readUnsignedByte() * -2100310889;
			else if (4 == i)
				((Class325) this).aClass320_3452 = ((Class320) Class422_Sub20.method5701(Class74.method825(-151911925), class298_sub53.readUnsignedByte(), (byte) 2));
			else if (5 == i)
				((Class325) this).anInt3453 = class298_sub53.readBigSmart(1235052657) * -544205675;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.f(").append(')').toString());
		}
	}

	void method3962(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_2_ = class298_sub53.readUnsignedByte();
				if (0 == i_2_) {
					if (i < 3)
						break;
					break;
				}
				method3961(class298_sub53, i_2_, 1312976368);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.a(").append(')').toString());
		}
	}

	public static Class336 method3963(int i, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_) {
		try {
			Class315.aClass336_Sub3_3310.toX = i * -760677635;
			Class315.aClass336_Sub3_3310.toY = i_3_ * 167105303;
			Class315.aClass336_Sub3_3310.sizeX = i_4_ * -1544157451;
			Class315.aClass336_Sub3_3310.sizeY = i_5_ * -1468199503;
			((Class336_Sub3) Class315.aClass336_Sub3_3310).anInt7715 = 89792661 * i_6_;
			return Class315.aClass336_Sub3_3310;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.b(").append(')').toString());
		}
	}

	static final void method3964(ClientScript2 class403, byte i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) 55);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1004185785 * class105.anInt1192;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.rr(").append(')').toString());
		}
	}

	static final void method3965(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_9_, 1408826506);
			String string = "";
			if (class102 != null && null != class102.aString1088)
				string = class102.aString1088;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.abo(").append(')').toString());
		}
	}

	public static void method3966(int i, int i_10_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(14, (long) i);
			class298_sub37_sub12.method3445(-1882192793);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.o(").append(')').toString());
		}
	}

	static final void method3967(ClientScript2 class403, byte i) {
		try {
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_11_, (byte) 36);
			Class119 class119 = Class389.aClass119Array4165[i_11_ >> 16];
			Class478.method6097(class105, class119, class403, 924787839);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("no.il(").append(')').toString());
		}
	}
}
