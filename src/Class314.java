/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class314 {
	public static int anInt3301 = 64;
	Class243 aClass243_3302;
	Class348 aClass348_3303 = new Class348(64);

	public void method3823(int i) {
		try {
			synchronized (((Class314) this).aClass348_3303) {
				((Class314) this).aClass348_3303.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.f(").append(')').toString());
		}
	}

	public void method3824(int i) {
		try {
			synchronized (((Class314) this).aClass348_3303) {
				((Class314) this).aClass348_3303.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.p(").append(')').toString());
		}
	}

	public void method3825(int i, byte i_0_) {
		try {
			synchronized (((Class314) this).aClass348_3303) {
				((Class314) this).aClass348_3303.method4187();
				((Class314) this).aClass348_3303 = new Class348(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.i(").append(')').toString());
		}
	}

	public void method3826(int i, byte i_1_) {
		try {
			synchronized (((Class314) this).aClass348_3303) {
				((Class314) this).aClass348_3303.method4186(i, 204865938);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.b(").append(')').toString());
		}
	}

	public Class314(Class411 class411, Class429 class429, Class243 class243) {
		((Class314) this).aClass243_3302 = class243;
		if (((Class314) this).aClass243_3302 != null) {
			int i = ((Class314) this).aClass243_3302.method2296(2088108840) - 1;
			Class120.aClass120_1406.method1306((short) 7909);
			((Class314) this).aClass243_3302.method2316(i, 967571472);
		}
	}

	public ConfigDefinitions getConfigDefinitions(int i, int i_2_) {
		try {
			ConfigDefinitions class327;
			synchronized (((Class314) this).aClass348_3303) {
				class327 = (ConfigDefinitions) ((Class314) this).aClass348_3303.method4184((long) i);
			}
			if (null != class327)
				return class327;
			byte[] is;
			synchronized (((Class314) this).aClass243_3302) {
				is = (((Class314) this).aClass243_3302.getFile(Class120.aClass120_1406.getArchiveId(i, -1343831720), Class120.aClass120_1406.getFileId(i, 39933071), (byte) 14));
			}
			class327 = new ConfigDefinitions();
			if (null != is)
				class327.method3975(new RsByteBuffer(is), 16711680);
			synchronized (((Class314) this).aClass348_3303) {
				((Class314) this).aClass348_3303.method4194(class327, (long) i);
			}
			return class327;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.a(").append(')').toString());
		}
	}

	static final void method3828(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5245 -= -1365138610;
			if ((((ClientScript2) class403).aLongArray5251[1685767703 * ((ClientScript2) class403).anInt5245]) <= (((ClientScript2) class403).aLongArray5251[((ClientScript2) class403).anInt5245 * 1685767703 + 1]))
				((ClientScript2) class403).anInt5259 += (286750741 * (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.bl(").append(')').toString());
		}
	}

	static final void method3829(ClientScript2 class403, short i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -48);
			Class119 class119 = Class389.aClass119Array4165[i_3_ >> 16];
			Class119.method1298(class105, class119, class403, (byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.ib(").append(')').toString());
		}
	}

	static final void method3830(ClientScript2 class403, int i) {
		try {
			BufferedConnectionContext class25 = Class429.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.FRIEND_CHAT_QUICK_CHAT_MESSAGE, class25.aClass449_330, (byte) 109);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(0);
			int i_4_ = (class298_sub36.aClass298_Sub53_Sub2_7396.index * 385051775);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(1);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(-2034569943 * ((ClientScript2) class403).aClass177_5243.anInt1787, 16711935);
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.aClass298_Sub53_Sub2_7396, ((ClientScript2) class403).aClass177_5243.anIntArray1789, 373327263);
			class298_sub36.aClass298_Sub53_Sub2_7396.method3649((class298_sub36.aClass298_Sub53_Sub2_7396.index * 385051775) - i_4_, (byte) -102);
			class25.method390(class298_sub36, (byte) -38);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.ack(").append(')').toString());
		}
	}

	static int method3831(CharSequence charsequence, char c, int i) {
		try {
			int i_5_ = 0;
			int i_6_ = charsequence.length();
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				if (charsequence.charAt(i_7_) == c)
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.a(").append(')').toString());
		}
	}

	static final void method3832(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) -74);
			Class119 class119 = Class389.aClass119Array4165[i_8_ >> 16];
			Class365_Sub1_Sub3_Sub1.method4509(class105, class119, class403, (byte) -34);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nb.ka(").append(')').toString());
		}
	}
}
