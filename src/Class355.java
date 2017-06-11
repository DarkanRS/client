/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class355 implements Interface19 {
	int[] anIntArray6524;
	static Class4 aClass4_6525;

	public boolean method238(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323) {
		int[] is = ((Class355) this).anIntArray6524;
		for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
			int i_1_ = is[i_0_];
			if (!class323.method3936(i_1_, -12857846))
				return false;
		}
		return true;
	}

	public boolean method239(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323, int i_2_) {
		try {
			int[] is = ((Class355) this).anIntArray6524;
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				int i_4_ = is[i_3_];
				if (!class323.method3936(i_4_, 537035513))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ov.a(").append(')').toString());
		}
	}

	public boolean method237(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323) {
		int[] is = ((Class355) this).anIntArray6524;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is[i_5_];
			if (!class323.method3936(i_6_, -1630939752))
				return false;
		}
		return true;
	}

	Class355(int[] is) {
		((Class355) this).anIntArray6524 = is;
	}

	static boolean method4261(int i, int i_7_) {
		try {
			return (i >= -1976050083 * Class424.aClass424_6596.anInt6613 && i <= -1976050083 * Class424.aClass424_6600.anInt6613);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ov.p(").append(')').toString());
		}
	}

	public static void method4262(int i) {
		try {
			Class399.aClass354_5218.method4254(-1987483304);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ov.a(").append(')').toString());
		}
	}

	static int method4263(int i, int i_8_, byte i_9_) {
		try {
			if (Class424.aClass424_6592.anInt6613 * -1976050083 == i || -1976050083 * Class424.aClass424_6594.anInt6613 == i)
				return Class365_Sub1_Sub5_Sub2.anIntArray9938[i_8_ & 0x3];
			return Class365_Sub1_Sub5_Sub2.anIntArray9937[i_8_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ov.by(").append(')').toString());
		}
	}

	static final void method4264(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			Class497 class497 = Class92.aClass504_905.method6251(i_11_, -1869114423);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = client.aClass283_8716.method2641(-1837734772).getObjectDefinitions(i_10_).method5770(i_11_, class497.aString6101, 1595133323);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (client.aClass283_8716.method2641(767453715).getObjectDefinitions(i_10_).method5776(i_11_, class497.anInt6100 * -388931549, (byte) 2));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ov.abf(").append(')').toString());
		}
	}

	static void method4265(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(8, (long) i);
			class298_sub37_sub12.method3449((byte) 10);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_12_ * 1274450087;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = 293101103 * i_13_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609 = i_14_ * -80288087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ov.af(").append(')').toString());
		}
	}
}
