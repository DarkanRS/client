/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class300 {
	static int anInt3200 = 50;
	static int anInt3201 = 8192;
	static Class303 aClass303_3202;
	static int anInt3203 = 8192;
	static int anInt3204 = 0;
	static int anInt3205 = 4096;
	static int anInt3206 = 4096;
	public static int anInt3207 = 184109511;
	public static boolean aBoolean3208 = false;
	public static int anInt3209 = 2;
	public static int anInt3210 = -154813479;
	static int anInt3211 = 16384;
	public static Class284 aClass284_3212;
	static int anInt3213 = 0;
	static Class297[] aClass297Array3214 = new Class297[50];
	static Class303 aClass303_3215;
	static int anInt3216 = 16384;
	public static Class518 aClass518_3217;

	static {
		aClass303_3202 = null;
		aClass303_3215 = null;
	}

	Class300() throws Throwable {
		throw new Error();
	}

	static final void method3683(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class317.method3850(class105, class119, class403, -883658200);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mm.io(").append(')').toString());
		}
	}

	static final void method3684(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -33);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class422_Sub10.method5664(class105, class119, class403, -617787103);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mm.nr(").append(')').toString());
		}
	}

	public static String method3685(long l, int i, boolean bool, Class429 class429, short i_1_) {
		try {
			char c = ',';
			char c_2_ = '.';
			if (class429 == Class429.aClass429_6624) {
				c = '.';
				c_2_ = ',';
			}
			if (class429 == Class429.aClass429_6626)
				c_2_ = '\u00a0';
			boolean bool_3_ = false;
			if (l < 0L) {
				bool_3_ = true;
				l = -l;
			}
			StringBuilder stringbuilder = new StringBuilder(26);
			if (i > 0) {
				for (int i_4_ = 0; i_4_ < i; i_4_++) {
					int i_5_ = (int) l;
					l /= 10L;
					stringbuilder.append((char) (i_5_ + 48 - 10 * (int) l));
				}
				stringbuilder.append(c);
			}
			int i_6_ = 0;
			for (;;) {
				int i_7_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_7_ - (int) l * 10));
				if (l == 0L) {
					if (i_1_ == 255) {
						/* empty */
					}
					break;
				}
				if (bool) {
					i_6_++;
					if (0 == i_6_ % 3)
						stringbuilder.append(c_2_);
				}
			}
			if (bool_3_)
				stringbuilder.append('-');
			return stringbuilder.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mm.i(").append(')').toString());
		}
	}

	static void method3686(long l) {
		try {
			Class490.aCalendar6075.setTime(new Date(l));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mm.k(").append(')').toString());
		}
	}

	public static void method3687(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, String string, int i_13_) {
		try {
			Class302_Sub4 class302_sub4 = new Class302_Sub4();
			((Class302_Sub4) class302_sub4).anInt7653 = i * 1025727709;
			((Class302_Sub4) class302_sub4).anInt7652 = 862924059 * i_8_;
			((Class302_Sub4) class302_sub4).anInt7656 = i_9_ * -1389157181;
			((Class302_Sub4) class302_sub4).anInt7655 = (i_11_ + client.anInt8884 * 443738891) * -1019659005;
			((Class302_Sub4) class302_sub4).anInt7654 = i_10_ * 274200991;
			((Class302_Sub4) class302_sub4).aString7657 = string;
			((Class302_Sub4) class302_sub4).anInt7651 = i_12_ * 334332979;
			client.aClass442_8650.method5870(class302_sub4, 1639821588);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mm.nv(").append(')').toString());
		}
	}

	static final void method3688(ClientScript2 class403, byte i) {
		try {
			int i_14_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class128.aClass148_6331.anIntArray6654[i_14_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mm.c(").append(')').toString());
		}
	}
}
