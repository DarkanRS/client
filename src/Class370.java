/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370 {
	Class348 aClass348_4029 = new Class348(64);
	Class243 aClass243_4030;

	public void method4573(int i, int i_0_) {
		try {
			synchronized (((Class370) this).aClass348_4029) {
				((Class370) this).aClass348_4029.method4186(i, -1076736355);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.b(").append(')').toString());
		}
	}

	public void method4574(byte i) {
		try {
			synchronized (((Class370) this).aClass348_4029) {
				((Class370) this).aClass348_4029.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}

	public void method4575(int i) {
		try {
			synchronized (((Class370) this).aClass348_4029) {
				((Class370) this).aClass348_4029.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.p(").append(')').toString());
		}
	}

	public Class376 method4576(int i, int i_1_) {
		try {
			Class376 class376;
			synchronized (((Class370) this).aClass348_4029) {
				class376 = (Class376) ((Class370) this).aClass348_4029.method4184((long) i);
			}
			if (null != class376)
				return class376;
			byte[] is;
			synchronized (((Class370) this).aClass243_4030) {
				is = (((Class370) this).aClass243_4030.getFile(Class120.aClass120_1414.anInt1460 * -1006924897, i, (byte) -90));
			}
			class376 = new Class376();
			if (is != null)
				class376.method4655(new RsByteBuffer(is), 1705012994);
			synchronized (((Class370) this).aClass348_4029) {
				((Class370) this).aClass348_4029.method4194(class376, (long) i);
			}
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.a(").append(')').toString());
		}
	}

	public Class370(Class411 class411, Class429 class429, Class243 class243) {
		((Class370) this).aClass243_4030 = class243;
		if (null != ((Class370) this).aClass243_4030)
			((Class370) this).aClass243_4030.method2316(-1006924897 * Class120.aClass120_1414.anInt1460, -279300149);
	}

	public static boolean method4577(byte i) {
		try {
			Class298_Sub47 class298_sub47 = ((Class298_Sub47) Class478.aClass453_6002.method5939(1766612795));
			if (class298_sub47 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}

	public static void method4578(int i, boolean bool, int i_2_) {
		try {
			Class371.method4584(i, Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210), bool, (byte) 31);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.fw(").append(')').toString());
		}
	}

	static void method4579(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class435 class435, byte i_8_) {
		try {
			Class298_Sub1 class298_sub1 = null;
			for (Class298_Sub1 class298_sub1_9_ = ((Class298_Sub1) Class298_Sub1.aClass453_7162.method5939(1766612795)); class298_sub1_9_ != null; class298_sub1_9_ = ((Class298_Sub1) Class298_Sub1.aClass453_7162.method5944(49146))) {
				if (i == (2108312995 * ((Class298_Sub1) class298_sub1_9_).anInt7151) && i_3_ == 634196087 * class298_sub1_9_.anInt7150 && i_4_ == class298_sub1_9_.anInt7155 * -2146829167 && -431456739 * (((Class298_Sub1) class298_sub1_9_).anInt7157) == i_5_) {
					class298_sub1 = class298_sub1_9_;
					break;
				}
			}
			if (null == class298_sub1) {
				class298_sub1 = new Class298_Sub1();
				((Class298_Sub1) class298_sub1).anInt7151 = i * -196260341;
				((Class298_Sub1) class298_sub1).anInt7157 = i_5_ * 1088435253;
				class298_sub1.anInt7150 = i_3_ * 656787783;
				class298_sub1.anInt7155 = 284247153 * i_4_;
				Class298_Sub1.aClass453_7162.method5935(class298_sub1, 1693481470);
			}
			((Class298_Sub1) class298_sub1).anInt7156 = i_6_ * 240885009;
			((Class298_Sub1) class298_sub1).anInt7153 = i_7_ * 998055383;
			((Class298_Sub1) class298_sub1).aClass435_7158 = class435;
			((Class298_Sub1) class298_sub1).aBoolean7159 = true;
			((Class298_Sub1) class298_sub1).aBoolean7160 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}
}
