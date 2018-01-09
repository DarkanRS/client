/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class136 {
	static Object anObject1627;
	static Object anObject1628;
	static final int anInt1629 = 128;
	static final int anInt1630 = 16;
	boolean aBool1631;
	Class137_Sub1[] aClass137_Sub1Array1632 = null;
	Class137_Sub4 aClass137_Sub4_1633 = null;
	Class137_Sub1[] aClass137_Sub1Array1634 = null;
	static final int anInt1635 = 128;
	Class137_Sub4 aClass137_Sub4_1636 = null;
	static Object anObject1637;
	Class137_Sub4 aClass137_Sub4_1638 = null;
	static final int anInt1639 = 4000;

	static void method2348(Class505_Sub1 class505_sub1) {
		if (anObject1637 == null) {
			Class370_Sub1_Sub2 class370_sub1_sub2 = new Class370_Sub1_Sub2();
			byte[] is = class370_sub1_sub2.method15614(128, 128, 16);
			anObject1637 = Class309.method5493(is, false, (byte) 83);
		}
		if (anObject1627 == null) {
			Class370_Sub2_Sub2 class370_sub2_sub2 = new Class370_Sub2_Sub2();
			byte[] is = class370_sub2_sub2.method15617(128, 128, 16);
			anObject1627 = Class309.method5493(is, false, (byte) 37);
		}
		Class164 class164 = ((Class505_Sub1) class505_sub1).aClass164_8363;
		if (class164.method2847() && anObject1628 == null) {
			byte[] is = Class264.method4782(128, 128, 16, 8, new Class261_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1628 = Class309.method5493(is, false, (byte) 61);
		}
	}

	Class136(Class505_Sub1 class505_sub1) {
		((Class136) this).aBool1631 = ((Class505_Sub1) class505_sub1).aBool8393;
		method2348(class505_sub1);
		if (!((Class136) this).aBool1631) {
			((Class136) this).aClass137_Sub1Array1632 = new Class137_Sub1[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class282_Sub17_Sub5.method15410(anObject1637, i * 32768, 32768, -1014539390);
				((Class136) this).aClass137_Sub1Array1632[i] = new Class137_Sub1(class505_sub1, 3553, Class150.aClass150_1952, Class76.aClass76_751, 128, 128, true, is, Class150.aClass150_1952, false);
			}
			((Class136) this).aClass137_Sub1Array1634 = new Class137_Sub1[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class282_Sub17_Sub5.method15410(anObject1627, i * 32768, 32768, 675773741);
				((Class136) this).aClass137_Sub1Array1634[i] = new Class137_Sub1(class505_sub1, 3553, Class150.aClass150_1952, Class76.aClass76_751, 128, 128, true, is, Class150.aClass150_1952, false);
			}
		} else {
			byte[] is = Class346.toByteArray(anObject1637, false, (byte) 1);
			((Class136) this).aClass137_Sub4_1633 = new Class137_Sub4(class505_sub1, Class150.aClass150_1952, Class76.aClass76_751, 128, 128, 16, is, Class150.aClass150_1952);
			is = Class346.toByteArray(anObject1627, false, (byte) 1);
			((Class136) this).aClass137_Sub4_1636 = new Class137_Sub4(class505_sub1, Class150.aClass150_1952, Class76.aClass76_751, 128, 128, 16, is, Class150.aClass150_1952);
			Class164 class164 = ((Class505_Sub1) class505_sub1).aClass164_8363;
			if (class164.method2847()) {
				is = Class346.toByteArray(anObject1628, false, (byte) 1);
				((Class136) this).aClass137_Sub4_1638 = new Class137_Sub4(class505_sub1, Class150.aClass150_1949, Class76.aClass76_751, 128, 128, 16);
				Class137_Sub4 class137_sub4 = new Class137_Sub4(class505_sub1, Class150.aClass150_1948, Class76.aClass76_751, 128, 128, 16, is, Class150.aClass150_1948);
				if (!class164.method2848(((Class136) this).aClass137_Sub4_1638, class137_sub4, 2.0F)) {
					((Class136) this).aClass137_Sub4_1638.method2378();
					((Class136) this).aClass137_Sub4_1638 = null;
				} else
					((Class136) this).aClass137_Sub4_1638.method2353();
				class137_sub4.method2378();
			}
		}
	}

	static void method2349(Class505_Sub1 class505_sub1) {
		if (anObject1637 == null) {
			Class370_Sub1_Sub2 class370_sub1_sub2 = new Class370_Sub1_Sub2();
			byte[] is = class370_sub1_sub2.method15614(128, 128, 16);
			anObject1637 = Class309.method5493(is, false, (byte) 51);
		}
		if (anObject1627 == null) {
			Class370_Sub2_Sub2 class370_sub2_sub2 = new Class370_Sub2_Sub2();
			byte[] is = class370_sub2_sub2.method15617(128, 128, 16);
			anObject1627 = Class309.method5493(is, false, (byte) 101);
		}
		Class164 class164 = ((Class505_Sub1) class505_sub1).aClass164_8363;
		if (class164.method2847() && anObject1628 == null) {
			byte[] is = Class264.method4782(128, 128, 16, 8, new Class261_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1628 = Class309.method5493(is, false, (byte) 82);
		}
	}
}
