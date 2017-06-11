/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114 {
	int anInt1374 = -811445531;
	Class100 aClass100_1375;
	Class100 aClass100_1376;
	String aString1377;
	String aString1378;
	public int[] anIntArray1379;
	public int[] anIntArray1380;
	public static Class243 aClass243_1381;

	void method1256(Class101 class101, byte i) {
		try {
			int i_0_ = class101.method1080(2085203042);
			((Class114) this).aClass100_1375 = Class433.method5799(-1585817819)[i_0_];
			if (((Class114) this).aClass100_1375 == Class100.aClass100_1076) {
				int i_1_ = class101.method1080(656081273);
				((Class114) this).aClass100_1376 = Class433.method5799(-12226797)[i_1_];
				((Class114) this).anInt1374 = class101.method1080(1114947725) * 811445531;
			}
			((Class114) this).aString1377 = class101.method1079(1509343502);
			((Class114) this).aString1378 = class101.method1079(1509343502);
			int i_2_ = class101.method1080(1761622063);
			anIntArray1379 = new int[i_2_];
			anIntArray1380 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				anIntArray1379[i_3_] = class101.method1080(-781974415);
				anIntArray1380[i_3_] = class101.method1080(372809823);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eq.a(").append(')').toString());
		}
	}

	Class114() {
		/* empty */
	}

	public static void method1257(int i) {
		try {
			synchronized (Class366.aClass348_3979) {
				Class366.aClass348_3979.method4189();
			}
			synchronized (Class366.aClass348_3980) {
				Class366.aClass348_3980.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eq.z(").append(')').toString());
		}
	}

	static final void method1258(ClientScript2 class403, byte i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) -7);
			Class119 class119 = Class389.aClass119Array4165[i_4_ >> 16];
			Class261.method2463(class105, class119, class403, (byte) -113);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eq.lj(").append(')').toString());
		}
	}

	static final void method1259(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class365_Sub1_Sub3_Sub1.method4509(class105, class119, class403, (byte) -50);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eq.kp(").append(')').toString());
		}
	}
}
