/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class395 {
	Class243 aClass243_5189;
	public static int anInt5190;
	Class348 aClass348_5191;
	Class348 aClass348_5192 = new Class348(64);

	public Class298_Sub37_Sub4 method4900(int i, int i_0_) {
		try {
			Class298_Sub37_Sub4 class298_sub37_sub4;
			synchronized (((Class395) this).aClass348_5191) {
				class298_sub37_sub4 = ((Class298_Sub37_Sub4) ((Class395) this).aClass348_5191.method4184((long) i));
				if (null == class298_sub37_sub4) {
					class298_sub37_sub4 = new Class298_Sub37_Sub4(i);
					((Class395) this).aClass348_5191.method4194(class298_sub37_sub4, (long) i);
				}
				if (!class298_sub37_sub4.method3412((byte) 45)) {
					Class298_Sub37_Sub4 class298_sub37_sub4_1_ = null;
					return class298_sub37_sub4_1_;
				}
			}
			return class298_sub37_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.f(").append(')').toString());
		}
	}

	public void method4901(int i) {
		try {
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4187();
			}
			synchronized (((Class395) this).aClass348_5191) {
				((Class395) this).aClass348_5191.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.b(").append(')').toString());
		}
	}

	public void method4902(int i) {
		try {
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4189();
			}
			synchronized (((Class395) this).aClass348_5191) {
				((Class395) this).aClass348_5191.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.i(").append(')').toString());
		}
	}

	public Class395(Class411 class411, Class429 class429, Class243 class243, Class243 class243_2_, Class243 class243_3_) {
		((Class395) this).aClass348_5191 = new Class348(100);
		((Class395) this).aClass243_5189 = class243;
		if (null != ((Class395) this).aClass243_5189) {
			int i = ((Class395) this).aClass243_5189.method2296(1196471561) - 1;
			Class120.aClass120_1409.method1306((short) 21776);
			((Class395) this).aClass243_5189.method2316(i, -1829120689);
		}
		Class_ta_Sub2.method6006(class243_2_, class243_3_, 2, (byte) 2);
	}

	public Class391 method4903(int i, byte i_4_) {
		try {
			Class391 class391;
			synchronized (((Class395) this).aClass348_5192) {
				class391 = (Class391) ((Class395) this).aClass348_5192.method4184((long) i);
			}
			if (null != class391)
				return class391;
			byte[] is;
			synchronized (((Class395) this).aClass243_5189) {
				is = (((Class395) this).aClass243_5189.method2315(Class120.aClass120_1409.method1307(i, 180156567), Class120.aClass120_1409.method1305(i, -1217474734), (byte) -6));
			}
			class391 = new Class391();
			class391.anInt4171 = i * -523719415;
			((Class391) class391).aClass395_4170 = this;
			if (is != null)
				class391.method4882(new RsByteBuffer(is), -795902444);
			class391.method4879((byte) -46);
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4194(class391, (long) i);
			}
			return class391;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.a(").append(')').toString());
		}
	}

	public void method4904(int i, byte i_5_) {
		try {
			synchronized (((Class395) this).aClass348_5192) {
				((Class395) this).aClass348_5192.method4186(i, -208985286);
			}
			synchronized (((Class395) this).aClass348_5191) {
				((Class395) this).aClass348_5191.method4186(i, -1704294236);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.p(").append(')').toString());
		}
	}

	static final void method4905(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_7_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class497 class497 = Class92.aClass504_905.method6251(i_7_, -1755093541);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_6_).method6041(i_7_, class497.aString6101, (short) 26472));
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_6_).method6037(i_7_, class497.anInt6100 * -388931549, -2143571113));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.aat(").append(')').toString());
		}
	}

	static final void method4906(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_9_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			Class301_Sub1.method3713(10, i_8_ << 16 | i_9_, i_10_, "", -1433549098);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.alu(").append(')').toString());
		}
	}

	static boolean method4907(int i, byte i_11_) {
		try {
			if (i == 3 || 4 == i || 5 == i || 6 == i || i == 1001 || 1002 == i)
				return true;
			if (2 == i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qj.bu(").append(')').toString());
		}
	}
}
