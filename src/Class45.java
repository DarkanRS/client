/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class45 {
	static int anInt476 = 16;
	static int anInt477 = 128;
	static int anInt478 = 128;
	static Object anObject479;
	boolean aBoolean480;
	static Object anObject481;
	Class30_Sub4 aClass30_Sub4_482;
	Class30_Sub2[] aClass30_Sub2Array483;
	Class30_Sub4 aClass30_Sub4_484;
	Class30_Sub4 aClass30_Sub4_485;
	static int anInt486 = 4000;
	Class30_Sub2[] aClass30_Sub2Array487 = null;
	static Object anObject488;

	Class45(Class_ra_Sub2 class_ra_sub2) {
		((Class45) this).aClass30_Sub4_482 = null;
		((Class45) this).aClass30_Sub2Array483 = null;
		((Class45) this).aClass30_Sub4_484 = null;
		((Class45) this).aClass30_Sub4_485 = null;
		((Class45) this).aBoolean480 = ((Class_ra_Sub2) class_ra_sub2).aBoolean8177;
		method498(class_ra_sub2);
		if (!((Class45) this).aBoolean480) {
			((Class45) this).aClass30_Sub2Array487 = new Class30_Sub2[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class415.method5586(anObject488, i * 32768, 32768, (byte) 1);
				((Class45) this).aClass30_Sub2Array487[i] = new Class30_Sub2(class_ra_sub2, 3553, Class55.aClass55_565, Class77.aClass77_717, 128, 128, true, is, Class55.aClass55_565, false);
			}
			((Class45) this).aClass30_Sub2Array483 = new Class30_Sub2[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class415.method5586(anObject479, i * 32768, 32768, (byte) 1);
				((Class45) this).aClass30_Sub2Array483[i] = new Class30_Sub2(class_ra_sub2, 3553, Class55.aClass55_565, Class77.aClass77_717, 128, 128, true, is, Class55.aClass55_565, false);
			}
		} else {
			byte[] is = Class338.method4114(anObject488, false, -1069979681);
			((Class45) this).aClass30_Sub4_482 = new Class30_Sub4(class_ra_sub2, Class55.aClass55_565, Class77.aClass77_717, 128, 128, 16, is, Class55.aClass55_565);
			is = Class338.method4114(anObject479, false, -2082451325);
			((Class45) this).aClass30_Sub4_484 = new Class30_Sub4(class_ra_sub2, Class55.aClass55_565, Class77.aClass77_717, 128, 128, 16, is, Class55.aClass55_565);
			Class49 class49 = ((Class_ra_Sub2) class_ra_sub2).aClass49_8061;
			if (class49.method528()) {
				is = Class338.method4114(anObject481, false, 77360531);
				((Class45) this).aClass30_Sub4_485 = new Class30_Sub4(class_ra_sub2, Class55.aClass55_557, Class77.aClass77_717, 128, 128, 16);
				Class30_Sub4 class30_sub4 = new Class30_Sub4(class_ra_sub2, Class55.aClass55_559, Class77.aClass77_717, 128, 128, 16, is, Class55.aClass55_559);
				if (!class49.method527(((Class45) this).aClass30_Sub4_485, class30_sub4, 2.0F)) {
					((Class45) this).aClass30_Sub4_485.method417();
					((Class45) this).aClass30_Sub4_485 = null;
				} else
					((Class45) this).aClass30_Sub4_485.method413();
				class30_sub4.method417();
			}
		}
	}

	static void method498(Class_ra_Sub2 class_ra_sub2) {
		if (anObject488 == null) {
			Class213_Sub2_Sub2 class213_sub2_sub2 = new Class213_Sub2_Sub2();
			byte[] is = class213_sub2_sub2.method1982(128, 128, 16);
			anObject488 = Class158.method1702(is, false, (short) 467);
		}
		if (anObject479 == null) {
			Class213_Sub1_Sub2 class213_sub1_sub2 = new Class213_Sub1_Sub2();
			byte[] is = class213_sub1_sub2.method1974(128, 128, 16);
			anObject479 = Class158.method1702(is, false, (short) -3222);
		}
		Class49 class49 = ((Class_ra_Sub2) class_ra_sub2).aClass49_8061;
		if (class49.method528() && anObject481 == null) {
			byte[] is = Class306.method3756(128, 128, 16, 8, new Class307_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject481 = Class158.method1702(is, false, (short) -1995);
		}
	}
}
