/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class516 {
	static Class516 aClass516_6234;
	int anInt6235;
	static Class516 aClass516_6236;
	static Class516 aClass516_6237;
	static Class516 aClass516_6238;
	static Class516 aClass516_6239;
	static Class516 aClass516_6240;
	static Class516 aClass516_6241;
	static Class516 aClass516_6242;
	static Class516 aClass516_6243;
	static Class516 aClass516_6244;
	static Class516 aClass516_6245 = new Class516(6, 0);
	static Class516 aClass516_6246;
	static Class516 aClass516_6247;
	static Class516 aClass516_6248;
	static Class516 aClass516_6249;
	static Class516 aClass516_6250;
	static Class516 aClass516_6251;
	static Class516 aClass516_6252;
	static Class516 aClass516_6253;
	static Class516 aClass516_6254;
	static Class516 aClass516_6255;
	static Class516 aClass516_6256;
	static Class516 aClass516_6257;
	static Class516 aClass516_6258;
	static Class516 aClass516_6259;
	static Class516 aClass516_6260;
	static Class516 aClass516_6261;
	static Class516 aClass516_6262;
	static Class516 aClass516_6263;
	static Class516 aClass516_6264;
	static Class516 aClass516_6265;
	public int anInt6266;

	Class516(int i, int i_0_) {
		anInt6266 = i * -1418823413;
		((Class516) this).anInt6235 = i_0_ * 1688575393;
	}

	static {
		aClass516_6244 = new Class516(1, 1);
		aClass516_6263 = new Class516(0, 2);
		aClass516_6239 = new Class516(18, 3);
		aClass516_6238 = new Class516(2, 10);
		aClass516_6257 = new Class516(19, 11);
		aClass516_6240 = new Class516(29, 12);
		aClass516_6241 = new Class516(28, 13);
		aClass516_6246 = new Class516(12, 14);
		aClass516_6243 = new Class516(3, 15);
		aClass516_6247 = new Class516(22, 16);
		aClass516_6237 = new Class516(26, 17);
		aClass516_6255 = new Class516(9, 20);
		aClass516_6236 = new Class516(25, 21);
		aClass516_6248 = new Class516(10, 22);
		aClass516_6249 = new Class516(23, 30);
		aClass516_6250 = new Class516(30, 31);
		aClass516_6251 = new Class516(20, 32);
		aClass516_6252 = new Class516(17, 33);
		aClass516_6253 = new Class516(16, 40);
		aClass516_6254 = new Class516(4, 41);
		aClass516_6265 = new Class516(27, 42);
		aClass516_6256 = new Class516(7, 43);
		aClass516_6234 = new Class516(13, 50);
		aClass516_6258 = new Class516(21, 51);
		aClass516_6259 = new Class516(14, 52);
		aClass516_6260 = new Class516(8, 53);
		aClass516_6261 = new Class516(11, 60);
		aClass516_6262 = new Class516(5, 61);
		aClass516_6242 = new Class516(15, 70);
		aClass516_6264 = new Class516(24, 255);
	}

	public static final void method6299(String string, int i) {
		try {
			if (!string.equals("")) {
				BufferedConnectionContext class25 = Class429.method5760((short) 512);
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.JOIN_FRIEND_CHAT_PACKET, class25.aClass449_330, (byte) 113);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class58.method693(string, 148630832));
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2138604047);
				class25.method390(class298_sub36, (byte) -81);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vs.ma(").append(')').toString());
		}
	}

	static final void method6300(int i, int i_1_, int i_2_, int i_3_, Class435 class435, byte i_4_) {
		try {
			if (i_2_ >= 1 && i_3_ >= 1 && i_2_ <= client.aClass283_8716.method2629(-1894377459) - 2 && i_3_ <= client.aClass283_8716.method2630(793681614) - 2) {
				if (client.aClass283_8716.method2675(-1611682495) != null) {
					Interface3 interface3 = client.aClass283_8716.method2644(112641684).method2241(i, i_1_, i_2_, i_3_, 2002986961);
					if (interface3 != null) {
						if (interface3 instanceof Class365_Sub1_Sub1_Sub5)
							((Class365_Sub1_Sub1_Sub5) interface3).method4486(class435, -1857916290);
						else if (interface3 instanceof Class365_Sub1_Sub2_Sub1)
							((Class365_Sub1_Sub2_Sub1) interface3).method4495(class435, (byte) 0);
						else if (interface3 instanceof Class365_Sub1_Sub5_Sub2)
							((Class365_Sub1_Sub5_Sub2) interface3).method4530(class435, -772948139);
						else if (interface3 instanceof Class365_Sub1_Sub3_Sub1)
							((Class365_Sub1_Sub3_Sub1) interface3).method4504(class435, (byte) 11);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vs.u(").append(')').toString());
		}
	}

	static final void method6301(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_5_, (byte) -48);
			Class119 class119 = Class389.aClass119Array4165[i_5_ >> 16];
			Class240_Sub1.method2244(class105, class119, class403, (byte) -14);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vs.om(").append(')').toString());
		}
	}

	static final void method6302(ClientScript2 class403, int i) {
		try {
			Class69.method788(true, -1114331607);
			client.aClass283_8716.method2667(1924605464);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vs.ana(").append(')').toString());
		}
	}

	static final void method6303(ClientScript2 class403, byte i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_6_, (byte) -100);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1210 * 1508815983;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vs.rh(").append(')').toString());
		}
	}
}
