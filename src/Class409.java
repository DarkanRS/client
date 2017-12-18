/* Class409 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class409 {
	int anInt5281;
	int anInt5282;
	Class341 aClass341_5283;
	static int anInt5284;

	public Class409(Class341 class341, int i, int i_0_, int i_1_) {
		((Class409) this).aClass341_5283 = class341;
		((Class409) this).anInt5281 = 1975331269 * i;
		((Class409) this).anInt5282 = i_1_ * -1576240641;
	}

	int method4970(int i) {
		try {
			return (client.anIntArray8739[((Class409) this).anInt5281 * -1511232243]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.a(").append(')').toString());
		}
	}

	public Interface3 method4971(int i) {
		try {
			Interface3 interface3 = method4972(804311649);
			if (null == interface3)
				return null;
			if (interface3.method32((byte) 42) != -1949334017 * ((Class409) this).anInt5282)
				return null;
			return interface3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.f(").append(')').toString());
		}
	}

	Interface3 method4972(int i) {
		try {
			int i_2_ = 1008331379 * ((Class409) this).aClass341_5283.anInt3645;
			Class341 class341 = client.aClass283_8716.method2628(681479919);
			int i_3_ = (((Class409) this).aClass341_5283.gameSceneBaseX * -1760580017 - class341.gameSceneBaseX * -1760580017);
			int i_4_ = (((Class409) this).aClass341_5283.gameSceneBaseY * 283514611 - class341.gameSceneBaseY * 283514611);
			if (i_3_ < 0 || i_4_ < 0 || i_3_ >= client.aClass283_8716.method2629(-1998327105) || i_4_ >= client.aClass283_8716.method2630(539294898))
				return null;
			switch (method4970(-2091768912)) {
			case 0:
				return ((Interface3) client.aClass283_8716.method2675(-1611682495).method4031(i_2_, i_3_, i_4_, 1566382166));
			case 1:
				return ((Interface3) client.aClass283_8716.method2675(-1611682495).method4033(i_2_, i_3_, i_4_, 1080081135));
			default:
				return null;
			case 2:
				return (Interface3) (client.aClass283_8716.method2675(-1611682495).method4035(i_2_, i_3_, i_4_, client.anInterface17_8960, -1306218271));
			case 3:
				return ((Interface3) client.aClass283_8716.method2675(-1611682495).method4058(i_2_, i_3_, i_4_, (byte) 72));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.b(").append(')').toString());
		}
	}

	static final void method4973(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			class105.anInt1158 = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * 349940087;
			class105.anInt1242 = ((((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]) * 153098785);
			Tradution.method6054(class105, 909224475);
			Class438.method5845(class119, class105, -1959938301);
			if (0 == -1215239439 * class105.anInt1144)
				Class65.method761(class119, class105, false, 112223880);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.ci(").append(')').toString());
		}
	}

	static final void method4974(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class301_Sub1.aBoolean7635 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.aem(").append(')').toString());
		}
	}

	static final void method4975(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-192114923);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.aje(").append(')').toString());
		}
	}

	public static Frame method4976(Class457 class457, int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if (0 == i_6_) {
				Class456[] class456s = JS5Index.method1238(class457, (short) 486);
				if (class456s == null)
					return null;
				boolean bool = false;
				for (int i_9_ = 0; i_9_ < class456s.length; i_9_++) {
					if (i == class456s[i_9_].anInt5663 * 28445523 && 262154323 * class456s[i_9_].anInt5665 == i_5_ && (i_7_ == 0 || 1126617439 * (((Class456) class456s[i_9_]).anInt5662) == i_7_) && (!bool || (-1087459453 * class456s[i_9_].anInt5664 > i_6_))) {
						i_6_ = -1087459453 * class456s[i_9_].anInt5664;
						bool = true;
					}
				}
				if (!bool)
					return null;
			}
			Frame frame = new Frame("Jagex Full Screen");
			frame.setResizable(false);
			class457.method5962(frame, i, i_5_, i_6_, i_7_);
			return frame;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.f(").append(')').toString());
		}
	}

	static final void method4977(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub11_7558, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), 417121289);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.ain(").append(')').toString());
		}
	}

	public static byte[] method4978(byte[] is, int i) {
		try {
			if (is == null)
				return null;
			byte[] is_10_ = new byte[is.length];
			System.arraycopy(is, 0, is_10_, 0, is.length);
			return is_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.a(").append(')').toString());
		}
	}

	static final void method4979(ClientScript2 class403, int i) {
		try {
			boolean bool = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) != 0);
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = Class300.method3685((long) i_11_, 0, bool, Class321.aClass429_3357, (short) 25477);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qz.aac(").append(')').toString());
		}
	}
}
