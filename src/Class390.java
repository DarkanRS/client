/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class390 {
	Class119 aClass119_4167;
	IComponentDefinition aClass105_4168;

	boolean method4866(Class119 class119, int i, int i_0_, int i_1_) {
		try {
			if (class119 != null) {
				IComponentDefinition class105 = class119.method1297(i, (short) 15753);
				if (null != class105) {
					((Class390) this).aClass119_4167 = class119;
					((Class390) this).aClass105_4168 = class105;
					return true;
				}
			}
			method4869((byte) 38);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.b(").append(')').toString());
		}
	}

	boolean method4867(int i, int i_2_, int i_3_) {
		try {
			IComponentDefinition class105 = Class140.method1558(i, i_2_, -156511736);
			if (class105 != null) {
				((Class390) this).aClass119_4167 = Class389.aClass119Array4165[i >> 16];
				((Class390) this).aClass105_4168 = class105;
				return true;
			}
			method4869((byte) 92);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.f(").append(')').toString());
		}
	}

	IComponentDefinition method4868(int i) {
		try {
			return (((Class390) this).aClass119_4167.method1297(((Class390) this).aClass105_4168.anInt1142 * -440872681, (short) 10433));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.a(").append(')').toString());
		}
	}

	void method4869(byte i) {
		try {
			((Class390) this).aClass119_4167 = null;
			((Class390) this).aClass105_4168 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.p(").append(')').toString());
		}
	}

	Class390() {
		/* empty */
	}

	static final void method4870(ClientScript2 class403, short i) {
		try {
			Class301_Sub1.aBoolean7635 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.aez(").append(')').toString());
		}
	}

	public static int method4871(byte i) {
		try {
			Canvas canvas = new Canvas();
			canvas.setSize(100, 100);
			GraphicsToolkit class_ra = Class523.method6334(0, canvas, null, null, 0, -1071815074);
			long l = Class122.method1319((byte) 1);
			for (int i_4_ = 0; i_4_ < 10000; i_4_++)
				class_ra.method5020(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
			int i_5_ = (int) (Class122.method1319((byte) 1) - l);
			class_ra.method5015(0, 0, 100, 100, -16777216, (byte) 7);
			class_ra.method5136(1538379056);
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.f(").append(')').toString());
		}
	}

	static final void method4872(ClientScript2 class403, int i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_6_, (byte) 54);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1262 * -1086526073;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.rb(").append(')').toString());
		}
	}

	static void method4873(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			for (int i_12_ = i_8_; i_12_ <= i_9_; i_12_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_12_]), i, i_7_, i_10_, -1334363034);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.z(").append(')').toString());
		}
	}

	static final void method4874(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) client.aFloat8757 >> 3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.agr(").append(')').toString());
		}
	}

	static final void method4875(Class298_Sub37_Sub15 class298_sub37_sub15, ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class247.method2366(class298_sub37_sub15, (byte) -65);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = Class73.method822(class298_sub37_sub15, 533229453);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = Class104.method1107(class298_sub37_sub15, (byte) 14);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = Class207.method1933(class298_sub37_sub15, -532801249);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.v(").append(')').toString());
		}
	}

	public static final void method4876(int i, boolean bool, int i_13_, int i_14_) {
		try {
			if (i < 8000 || i > 48000)
				throw new IllegalArgumentException();
			Class284.anInt3059 = i * 1438282109;
			Class284.aBoolean3047 = bool;
			Class284.anInt3048 = i_13_ * 2095551653;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qd.a(").append(')').toString());
		}
	}
}
