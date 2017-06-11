/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class82 {
	public int anInt761;

	public abstract void method866(int i);

	void method867(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.b(").append(')').toString());
		}
	}

	Class82(RsByteBuffer class298_sub53) {
		anInt761 = class298_sub53.readUnsignedShort() * 349693613;
	}

	public abstract void method868();

	public abstract void method869();

	boolean method870(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.p(").append(')').toString());
		}
	}

	static void method871(GraphicsToolkit class_ra, ObjectDefinitions class432, int i, int i_0_, int i_1_, byte i_2_) {
		try {
			Class496 class496 = Class120.aClass487_1463.method6159((class432.anInt5400 * -1204256389), -2141345299);
			if (1690480405 * class496.anInt6097 != -1) {
				if (class432.aBoolean5401) {
					i += -1382013163 * class432.anInt5402;
					i &= 0x3;
				} else
					i = 0;
				Class57 class57 = class496.method6198(class_ra, i, class432.aBoolean5440, (byte) -63);
				if (class57 != null) {
					int i_3_ = -1125834887 * class432.sizeX;
					int i_4_ = -565161399 * class432.sizeY;
					if ((i & 0x1) == 1) {
						i_3_ = -565161399 * class432.sizeY;
						i_4_ = class432.sizeX * -1125834887;
					}
					int i_5_ = class57.method271();
					int i_6_ = class57.method626();
					if (class496.aBoolean6098) {
						i_5_ = i_3_ * 4;
						i_6_ = 4 * i_4_;
					}
					if (0 != class496.anInt6096 * -2012904123)
						class57.method634(i_0_, i_1_ - (i_4_ - 1) * 4, i_5_, i_6_, 0, (~0xffffff | class496.anInt6096 * -2012904123), 1);
					else
						class57.method633(i_0_, i_1_ - 4 * (i_4_ - 1), i_5_, i_6_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.x(").append(')').toString());
		}
	}

	public static void method872(int i, byte i_7_) {
		try {
			Class299.anInt3197 = i * 1684929947;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.i(").append(')').toString());
		}
	}

	static final void method873(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) -100);
			Class119 class119 = Class389.aClass119Array4165[i_8_ >> 16];
			Class298_Sub39.method3507(class105, class119, class403, -2106555824);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.md(").append(')').toString());
		}
	}

	static final void method874(ClientScript2 class403, int i) {
		try {
			long l = (((ClientScript2) class403).aLongArray5251[((((ClientScript2) class403).anInt5245 -= -682569305) * 1685767703)]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.aab(").append(')').toString());
		}
	}

	static final void method875(ClientScript2 class403, byte i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7550, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -283253928);
			Class370.method4578(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1637975360), false, 622850291);
			Class3.method300(656179282);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.aia(").append(')').toString());
		}
	}

	static final void method876(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_9_, 601023665);
			int i_10_ = 0;
			if (class102 != null)
				i_10_ = class102.anInt1092 * 1016049299;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("di.acf(").append(')').toString());
		}
	}
}
