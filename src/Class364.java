/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class364 {
	Class385 aClass385_3932;
	static int anInt3933;
	long aLong3934;
	static float aFloat3935 = 0.69921875F;
	static float aFloat3936 = 1.2F;
	static int anInt3937 = -50;
	static int anInt3938 = -60;
	static int anInt3939 = -50;
	static int anInt3940 = 0;
	static float aFloat3941 = 1.1523438F;
	static int anInt3942;
	GraphicsToolkit aClass_ra3943;
	Class385[][] aClass385ArrayArray3944;
	int anInt3945 = 0;
	int anInt3946 = -1117911945;
	public static int[] anIntArray3947;
	Class217 aClass217_3948;
	Class385 aClass385_3949;
	Class385 aClass385_3950;
	Class385 aClass385_3951;
	static int anInt3952 = 1373663905;
	Class348 aClass348_3953;
	boolean aBoolean3954;
	Class348 aClass348_3955;

	public Class364(GraphicsToolkit class_ra, int i, int i_0_) {
		((Class364) this).aLong3934 = 0L;
		((Class364) this).aBoolean3954 = false;
		((Class364) this).aClass217_3948 = new Class217(-50.0F, -60.0F, -50.0F);
		((Class364) this).aClass348_3953 = new Class348(8);
		((Class364) this).aClass348_3955 = new Class348(8);
		((Class364) this).aClass_ra3943 = class_ra;
		((Class364) this).aClass385ArrayArray3944 = new Class385[i][i_0_];
		if (null != anIntArray3947)
			Class82_Sub12.aClass66_6864 = method4329(anIntArray3947[0], anIntArray3947[1], anIntArray3947[2], anIntArray3947[3], anIntArray3947[4], anIntArray3947[5], 2001255265);
		Class254.aClass277_2789 = null;
		((Class364) this).aClass385_3949 = new Class385();
		((Class364) this).aClass385_3950 = new Class385();
		((Class364) this).aClass385_3932 = new Class385();
		((Class364) this).aClass385_3951 = new Class385();
		method4324(-1545496874);
	}

	public Class385 method4316(byte i) {
		try {
			return ((Class364) this).aClass385_3950;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.f(").append(')').toString());
		}
	}

	public void method4317(byte i) {
		try {
			((Class364) this).aClass348_3953.method4187();
			((Class364) this).aClass348_3955.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.p(").append(')').toString());
		}
	}

	void method4318(byte i) {
		try {
			((Class364) this).aClass_ra3943.IA((0.7F + ((float) Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub1_7552.method5625(-712203354) * 0.1F) + client.aClass283_8716.method2633(2016671740)) * ((Class385) ((Class364) this).aClass385_3950).aFloat4130);
			((Class364) this).aClass_ra3943.m((-1951302757 * ((Class385) ((Class364) this).aClass385_3950).anInt4133), ((Class385) ((Class364) this).aClass385_3950).aFloat4131, ((Class385) ((Class364) this).aClass385_3950).aFloat4137, (float) ((int) ((Class364) this).aClass217_3948.aFloat2451 << 2), (float) ((int) ((Class364) this).aClass217_3948.aFloat2455 << 2), (float) ((int) ((Class364) this).aClass217_3948.aFloat2454 << 2));
			((Class364) this).aClass_ra3943.method5095(((Class385) ((Class364) this).aClass385_3950).aClass66_4136);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.s(").append(')').toString());
		}
	}

	public void method4319(int i, int i_1_, Class385 class385, byte i_2_) {
		try {
			((Class364) this).aClass385ArrayArray3944[i][i_1_] = class385;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.d(").append(')').toString());
		}
	}

	public void method4320(byte i) {
		try {
			for (int i_3_ = 0; i_3_ < ((Class364) this).aClass385ArrayArray3944.length; i_3_++) {
				for (int i_4_ = 0; i_4_ < (((Class364) this).aClass385ArrayArray3944[i_3_]).length; i_4_++)
					((Class364) this).aClass385ArrayArray3944[i_3_][i_4_] = ((Class364) this).aClass385_3949;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.u(").append(')').toString());
		}
	}

	public void method4321(int i, int i_5_, int i_6_) {
		try {
			Class385 class385 = ((Class364) this).aClass385ArrayArray3944[i][i_5_];
			if (class385 != null)
				((Class364) this).aClass217_3948.method2013(((Class385) class385).aClass217_4129);
			method4318((byte) -41);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.x(").append(')').toString());
		}
	}

	void method4322(int i, int i_7_, int i_8_, int i_9_) {
		try {
			Class385 class385 = ((Class364) this).aClass385ArrayArray3944[i][i_7_];
			if (null == class385)
				class385 = ((Class364) this).aClass385_3949;
			if (((Class364) this).aBoolean3954) {
				((Class364) this).aBoolean3954 = false;
				i_8_ = 0;
			}
			if (!((Class364) this).aClass385_3951.method4708(class385, -759773054)) {
				((Class364) this).aClass385_3951.method4704(class385, (byte) -51);
				((Class364) this).aLong3934 = Class122.method1319((byte) 1) * 858881257410153067L;
				((Class364) this).anInt3945 = ((((Class364) this).anInt3946 = 1117911945 * i_8_) * -2145126213);
				if (913546523 * ((Class364) this).anInt3945 != 0) {
					((Class364) this).aClass385_3932.method4704(((Class364) this).aClass385_3950, (byte) -80);
					if ((((Class385) ((Class364) this).aClass385_3950).aClass277_4140) != null) {
						if (((Class385) ((Class364) this).aClass385_3950).aClass277_4140.method2586((byte) -18))
							((Class385) ((Class364) this).aClass385_3950).aClass277_4140 = ((Class385) ((Class364) this).aClass385_3932).aClass277_4140 = ((Class385) ((Class364) this).aClass385_3950).aClass277_4140.method2587(1076468319);
						if ((null != (((Class385) ((Class364) this).aClass385_3950).aClass277_4140)) && ((((Class385) ((Class364) this).aClass385_3951).aClass277_4140) != (((Class385) ((Class364) this).aClass385_3950).aClass277_4140)))
							((Class385) ((Class364) this).aClass385_3950).aClass277_4140.method2584((((Class385) ((Class364) this).aClass385_3951).aClass277_4140), -583959548);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.r(").append(')').toString());
		}
	}

	public void method4323(Class283 class283, int i) {
		try {
			if (Class413.method5584(-1233866115 * client.anInt8752, 2068577506) || Class299.method3682(-1233866115 * client.anInt8752, 1765230881))
				method4322(Class367.anInt4000 * -1740717447 >> 12, -299812095 * Class146.anInt1575 >> 12, anInt3942 * -450037889, -1055017698);
			else {
				int i_10_ = -1;
				int i_11_ = -1;
				if (null != Class287.myPlayer) {
					i_10_ = (Class287.myPlayer.scenePositionXQueue[0]) >> 3;
					i_11_ = (Class287.myPlayer.scenePositionYQueue[0]) >> 3;
				}
				if (i_10_ < 0 || i_10_ >= class283.method2629(-2064159072) >> 3 || i_11_ < 0 || i_11_ >= class283.method2630(-1098820218) >> 3)
					method4322(class283.method2629(-1944264656) >> 4, class283.method2630(211843254) >> 4, 0, -1158726222);
				else
					method4322(i_10_, i_11_, anInt3942 * -450037889, -908271345);
			}
			method4330(828656850);
			method4318((byte) 67);
			method4325(394959545);
			method4331((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.a(").append(')').toString());
		}
	}

	public void method4324(int i) {
		try {
			((Class364) this).aBoolean3954 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.n(").append(')').toString());
		}
	}

	void method4325(int i) {
		try {
			((Class364) this).aClass_ra3943.method5152(((Class385) ((Class364) this).aClass385_3950).aFloat4132, ((Class385) ((Class364) this).aClass385_3950).aFloat4139, ((Class385) ((Class364) this).aClass385_3950).aFloat4138, -1795302913);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.y(").append(')').toString());
		}
	}

	public void method4326(byte i) {
		try {
			((Class364) this).aClass_ra3943.IA((0.7F + ((float) Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub1_7552.method5625(-1693044274) * 0.1F) + client.aClass283_8716.method2633(1910914073)) * 1.1523438F);
			((Class364) this).aClass_ra3943.m(anInt3952 * 332664479, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
			((Class364) this).aClass_ra3943.c(anInt3933 * -1971415573, -1, 0);
			((Class364) this).aClass_ra3943.method5095(Class82_Sub12.aClass66_6864);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.t(").append(')').toString());
		}
	}

	static {
		anInt3933 = 615272440;
		anInt3942 = -816669807;
	}

	public void method4327(Class364 class364_12_, int i) {
		try {
			((Class364) this).aClass385_3950.method4704((((Class364) class364_12_).aClass385_3950), (byte) 37);
			((Class364) this).aClass385_3932.method4704((((Class364) class364_12_).aClass385_3932), (byte) -76);
			((Class364) this).aClass385_3951.method4704((((Class364) class364_12_).aClass385_3951), (byte) 34);
			((Class364) this).aLong3934 = ((Class364) class364_12_).aLong3934 * 1L;
			((Class364) this).anInt3945 = 1 * ((Class364) class364_12_).anInt3945;
			((Class364) this).anInt3946 = ((Class364) class364_12_).anInt3946 * 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.b(").append(')').toString());
		}
	}

	Class277 method4328(int i, int i_13_, int i_14_, int i_15_, short i_16_) {
		try {
			long l = (((long) i_13_ & 0xffffL) << 48 | ((long) i_14_ & 0xffffL) << 32 | ((long) i_15_ & 0xffffL) << 16 | (long) i & 0xffffL);
			Class277 class277 = (Class277) ((Class364) this).aClass348_3955.method4184(l);
			if (null == class277) {
				class277 = ConfigDefinitions.aClass317_3472.method3845(i, i_13_, i_14_, i_15_, (Class138_Sub1.aClass131_7010), (byte) -51);
				((Class364) this).aClass348_3955.method4194(class277, l);
			}
			return class277;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.k(").append(')').toString());
		}
	}

	Class66 method4329(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		try {
			long l = (67481L * (long) i ^ (long) i_17_ * 97549L ^ 475427L * (long) i_18_ ^ (long) i_19_ * 986053L ^ (long) i_20_ * 32147369L ^ (long) i_21_ * 76724863L);
			Class66 class66 = (Class66) ((Class364) this).aClass348_3953.method4184(l);
			if (null != class66)
				return class66;
			class66 = ((Class364) this).aClass_ra3943.method5028(i, i_17_, i_18_, i_19_, i_20_, i_21_);
			((Class364) this).aClass348_3953.method4194(class66, l);
			return class66;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.i(").append(')').toString());
		}
	}

	void method4330(int i) {
		try {
			if (((Class364) this).anInt3946 * -1051268423 >= 0) {
				long l = Class122.method1319((byte) 1);
				((Class364) this).anInt3946 -= ((l - 5777556104771211843L * ((Class364) this).aLong3934) * 1117911945L);
				if (-1051268423 * ((Class364) this).anInt3946 > 0)
					((Class364) this).aClass385_3950.method4705(((Class364) this).aClass_ra3943, ((Class364) this).aClass385_3932, ((Class364) this).aClass385_3951, ((float) (913546523 * ((Class364) this).anInt3945 - ((Class364) this).anInt3946 * -1051268423) / (float) (913546523 * ((Class364) this).anInt3945)), 937279263);
				else {
					((Class364) this).aClass385_3950.method4704(((Class364) this).aClass385_3951, (byte) -42);
					if ((((Class385) ((Class364) this).aClass385_3950).aClass277_4140) != null)
						((Class385) ((Class364) this).aClass385_3950).aClass277_4140.method2585((byte) -128);
					((Class364) this).anInt3946 = -1117911945;
				}
				((Class364) this).aLong3934 = 858881257410153067L * l;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.q(").append(')').toString());
		}
	}

	public void method4331(byte i) {
		try {
			int i_23_ = 0;
			int i_24_ = i_23_ + ((((Class385) ((Class364) this).aClass385_3950).anInt4135) * -1939701499 + 256 << 2);
			((Class364) this).aClass_ra3943.c((((Class385) ((Class364) this).aClass385_3950).anInt4134 * -1269717659), Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub3_7556.method5633(1323547629) == 1 ? i_24_ : -1, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.z(").append(')').toString());
		}
	}

	static final void method4332(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			BufferedConnectionContext class25 = Class429.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.QUICK_CHAT_PRIVATE_MESSAGE, class25.aClass449_330, (byte) 109);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(0);
			int i_25_ = (385051775 * class298_sub36.aClass298_Sub53_Sub2_7396.index);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2120587039);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(((ClientScript2) class403).aClass177_5243.anInt1787 * -2034569943, 16711935);
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.aClass298_Sub53_Sub2_7396, ((ClientScript2) class403).aClass177_5243.anIntArray1789, 535185989);
			class298_sub36.aClass298_Sub53_Sub2_7396.method3649((class298_sub36.aClass298_Sub53_Sub2_7396.index * 385051775) - i_25_, (byte) -99);
			class25.method390(class298_sub36, (byte) -26);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.acd(").append(')').toString());
		}
	}

	static final void method4333(ClientScript2 class403, int i) {
		try {
			Class216.method2001(false, (byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.ahb(").append(')').toString());
		}
	}

	public static boolean method4334(char c, int i) {
		try {
			return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.s(").append(')').toString());
		}
	}

	static final void method4335(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class522.method6326(class105, class119, class403, -1905856494);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.ir(").append(')').toString());
		}
	}

	public static Class412 method4336(int i) {
		try {
			if (null == Class525.aClass412_6299)
				return Class412.aClass412_6568;
			return Class525.aClass412_6299;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pd.d(").append(')').toString());
		}
	}
}
