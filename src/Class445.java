/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445 {
	Class243 aClass243_5609;
	Class348 aClass348_5610 = new Class348(64);

	public void method5891(int i) {
		try {
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.p(").append(')').toString());
		}
	}

	public Class485 method5892(int i, int i_0_) {
		try {
			Class485 class485;
			synchronized (((Class445) this).aClass348_5610) {
				class485 = (Class485) ((Class445) this).aClass348_5610.method4184((long) i);
			}
			if (null != class485)
				return class485;
			byte[] is = ((Class445) this).aClass243_5609.method2315(((Class120.aClass120_1411.anInt1460) * -1006924897), i, (byte) -50);
			class485 = new Class485();
			if (null != is)
				class485.method6143(new RsByteBuffer(is), 905111826);
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4194(class485, (long) i);
			}
			return class485;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.a(").append(')').toString());
		}
	}

	public void method5893(int i) {
		try {
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.f(").append(')').toString());
		}
	}

	public void method5894(int i, byte i_1_) {
		try {
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4186(i, 187343477);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.b(").append(')').toString());
		}
	}

	public Class445(Class411 class411, Class429 class429, Class243 class243) {
		((Class445) this).aClass243_5609 = class243;
		if (null != ((Class445) this).aClass243_5609)
			((Class445) this).aClass243_5609.method2316(Class120.aClass120_1411.anInt1460 * -1006924897, 1281975621);
	}

	static void method5895(GraphicsToolkit gt, byte i) {
		try {
			gt.r(0, 0, -2110394505 * Class462.anInt5683, 350);
			gt.B(0, 0, -2110394505 * Class462.anInt5683, 350, Class8.anInt98 * 256666041 << 24 | Loader.DEVELOPER_CONSOLE_COLOR, 1);
			int i_2_ = 350 / (376067837 * Class8.anInt110);
			if (Class8.anInt102 * -2035787443 > 0) {
				int i_3_ = 346 - 376067837 * Class8.anInt110 - 4;
				int i_4_ = i_3_ * i_2_ / (i_2_ + -2035787443 * Class8.anInt102 - 1);
				int i_5_ = 4;
				if (-2035787443 * Class8.anInt102 > 1)
					i_5_ += ((-2035787443 * Class8.anInt102 - 1 - Class8.anInt103 * -1731316011) * (i_3_ - i_4_) / (Class8.anInt102 * -2035787443 - 1));
				gt.B(Class462.anInt5683 * -2110394505 - 16, i_5_, 12, i_4_, Class8.anInt98 * 256666041 << 24 | Loader.DEVELOPER_CONSOLE_COLOR, 2);
				for (int i_6_ = -1731316011 * Class8.anInt103; (i_6_ < -1731316011 * Class8.anInt103 + i_2_ && i_6_ < -2035787443 * Class8.anInt102); i_6_++) {
					String[] strings = Class365_Sub1_Sub3_Sub1.method4508((Class8.aStringArray107[i_6_]), '\010', 846052986);
					int i_7_ = ((-2110394505 * Class462.anInt5683 - 8 - 16) / strings.length);
					for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
						int i_9_ = 8 + i_7_ * i_8_;
						gt.r(i_9_, 0, i_9_ + i_7_ - 8, 350);
						Class343.aClass264_3673.method2488(Class117.method1276(strings[i_8_], (byte) 76), i_9_, (350 - Class8.anInt106 * 1194411673 - 2 - (-1883958527 * Class422_Sub2.aClass505_8369.anInt6197) - (376067837 * Class8.anInt110 * (i_6_ - Class8.anInt103 * -1731316011))), -1, -16777216, 2087345638);
					}
				}
			}
			Script.aClass264_7534.method2474(Loader.REVISION+" "+Loader.SUB_REVISION, -2110394505 * Class462.anInt5683 - 25, 330, -1, -16777216, (byte) -63);
			gt.r(0, 0, Class462.anInt5683 * -2110394505, 350);
			gt.method4990(0, 350 - Class8.anInt106 * 1194411673, Class462.anInt5683 * -2110394505, -1, -2042566638);
			Class101.aClass264_1084.method2488(new StringBuilder().append("--> ").append(Class117.method1276(Class8.aString101, (byte) -1)).toString(), 10, (350 - Class82_Sub19_Sub1.aClass505_9111.anInt6197 * -1883958527 - 1), -1, -16777216, -10016873);
			if (Class422_Sub7.aBoolean8385) {
				int i_10_ = -1;
				if (443738891 * client.anInt8884 % 30 > 15)
					i_10_ = 16777215;
				gt.method5035((10 + (Class82_Sub19_Sub1.aClass505_9111.method6264(new StringBuilder().append("--> ").append(Class117.method1276(Class8.aString101, (byte) 58).substring(0, Class8.anInt99 * -1182747927)).toString(), -949897299))), 350 - -1883958527 * (Class82_Sub19_Sub1.aClass505_9111.anInt6197) - 11, 12, i_10_, (short) 26562);
			}
			gt.L();
			Class98_Sub2.method1061(-1132401323);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.s(").append(')').toString());
		}
	}

	static final void method5896(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class283.method2677(class105, class119, class403, (byte) 32);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.mo(").append(')').toString());
		}
	}

	public static boolean method5897(Class243 class243, Class243 class243_11_, Class243 class243_12_, Class298_Sub19_Sub1 class298_sub19_sub1, Class284 class284, byte i) {
		try {
			Class79.aClass243_747 = class243;
			Class79.aClass243_735 = class243_11_;
			Class79.aClass243_736 = class243_12_;
			Class79.aClass298_Sub19_Sub1_737 = class298_sub19_sub1;
			Class79.aClass284_738 = class284;
			Class298_Sub10.anIntArray7229 = new int[16];
			for (int i_13_ = 0; i_13_ < 16; i_13_++)
				Class298_Sub10.anIntArray7229[i_13_] = 255;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sj.a(").append(')').toString());
		}
	}
}
