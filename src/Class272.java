/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class272 {
	Class440 aClass440_2899 = new Class440(256);
	Class243 aClass243_2900;
	Class243 aClass243_2901;
	Class440 aClass440_2902 = new Class440(256);
	static int anInt2903;

	Class298_Sub26_Sub1 method2549(int i, int i_0_, int[] is, int i_1_) {
		try {
			int i_2_ = i_0_ ^ (i << 4 & 0xffff | i >>> 12);
			i_2_ |= i << 16;
			long l = (long) i_2_;
			Class298_Sub26_Sub1 class298_sub26_sub1 = ((Class298_Sub26_Sub1) ((Class272) this).aClass440_2902.method5852(l));
			if (null != class298_sub26_sub1)
				return class298_sub26_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class278 class278 = Class278.method2604(((Class272) this).aClass243_2901, i, i_0_);
			if (class278 == null)
				return null;
			class298_sub26_sub1 = class278.method2601();
			((Class272) this).aClass440_2902.method5858(class298_sub26_sub1, l);
			if (null != is)
				is[0] -= class298_sub26_sub1.aByteArray9309.length;
			return class298_sub26_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.a(").append(')').toString());
		}
	}

	Class298_Sub26_Sub1 method2550(int i, int i_3_, int[] is, int i_4_) {
		try {
			int i_5_ = i_3_ ^ (i << 4 & 0xffff | i >>> 12);
			i_5_ |= i << 16;
			long l = (long) i_5_ ^ 0x100000000L;
			Class298_Sub26_Sub1 class298_sub26_sub1 = ((Class298_Sub26_Sub1) ((Class272) this).aClass440_2902.method5852(l));
			if (null != class298_sub26_sub1)
				return class298_sub26_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class298_Sub23 class298_sub23 = ((Class298_Sub23) ((Class272) this).aClass440_2899.method5852(l));
			if (class298_sub23 == null) {
				class298_sub23 = Class298_Sub23.method3065((((Class272) this).aClass243_2900), i, i_3_);
				if (null == class298_sub23)
					return null;
				((Class272) this).aClass440_2899.method5858(class298_sub23, l);
			}
			class298_sub26_sub1 = class298_sub23.method3067(is);
			if (null == class298_sub26_sub1)
				return null;
			class298_sub23.unlink(-1460969981);
			((Class272) this).aClass440_2902.method5858(class298_sub26_sub1, l);
			return class298_sub26_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.f(").append(')').toString());
		}
	}

	public Class298_Sub26_Sub1 method2551(int i, int[] is, int i_6_) {
		try {
			if (((Class272) this).aClass243_2901.method2296(1029061077) == 1)
				return method2549(0, i, is, 1909168122);
			if (((Class272) this).aClass243_2901.method2316(i, -1941901563) == 1)
				return method2549(i, 0, is, -1018556227);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.b(").append(')').toString());
		}
	}

	public Class298_Sub26_Sub1 method2552(int i, int[] is, byte i_7_) {
		try {
			if (((Class272) this).aClass243_2900.method2296(853704793) == 1)
				return method2550(0, i, is, -745389241);
			if (((Class272) this).aClass243_2900.method2316(i, -1796273847) == 1)
				return method2550(i, 0, is, -745389241);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.p(").append(')').toString());
		}
	}

	public Class272(Class243 class243, Class243 class243_8_) {
		((Class272) this).aClass243_2901 = class243;
		((Class272) this).aClass243_2900 = class243_8_;
	}

	static final void method2553(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_9_, (byte) 22);
			Class119 class119 = Class389.aClass119Array4165[i_9_ >> 16];
			Class298_Sub43.method3527(class105, class119, class403, (byte) -127);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.el(").append(')').toString());
		}
	}

	static final void method2554(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2027, client.gameConnection.aClass449_330, (byte) 34);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(string.length() + 1);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2114518021);
			client.gameConnection.method390(class298_sub36, (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.sb(").append(')').toString());
		}
	}

	static final void method2555(ClientScript2 class403, int i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_10_ == -1) {
				int i_11_ = i_10_ >> 14 & 0x3fff;
				int i_12_ = i_10_ & 0x3fff;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				i_11_ -= class341.gameSceneBaseX * -1760580017;
				if (i_11_ < 0)
					i_11_ = 0;
				else if (i_11_ >= client.aClass283_8716.method2629(-1866822819))
					i_11_ = client.aClass283_8716.method2629(-1973847066);
				i_12_ -= 283514611 * class341.gameSceneBaseY;
				if (i_12_ < 0)
					i_12_ = 0;
				else if (i_12_ >= client.aClass283_8716.method2630(922370140))
					i_12_ = client.aClass283_8716.method2630(271939870);
				Class100.anInt1081 = ((i_11_ << 9) + 256) * -178575833;
				Class418.anInt5339 = 1001372047 * ((i_12_ << 9) + 256);
			} else {
				Class100.anInt1081 = 178575833;
				Class418.anInt5339 = -1001372047;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.agw(").append(')').toString());
		}
	}

	static final void method2556(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1 ? 1 : 0, 1031457025);
			client.aClass283_8716.method2667(2089019629);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.ahq(").append(')').toString());
		}
	}

	public static Class298_Sub37_Sub15 method2557(int i) {
		try {
			return Class298_Sub45.aClass298_Sub37_Sub15_7522;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.ai(").append(')').toString());
		}
	}

	public static void method2558(int i, int i_13_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(2, (long) i);
			class298_sub37_sub12.method3445(-1442934147);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lh.i(").append(')').toString());
		}
	}
}
