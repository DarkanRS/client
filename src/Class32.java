
/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class32 {
	Interface8 anInterface8_362;
	Interface29 anInterface29_363;
	Interface9 anInterface9_364;
	int anInt365;
	Interface29 anInterface29_366;
	int anInt367;
	Interface9 anInterface9_368;
	Interface9 anInterface9_369;
	boolean aBool370;
	Class505_Sub2 aClass505_Sub2_371;
	Interface29 anInterface29_372;
	Class76 aClass76_373;
	Class158_Sub1 aClass158_Sub1_374;
	Vector aVector375 = new Vector();
	Interface4 anInterface4_376;
	Class70 aClass70_377;
	int anInt378 = 0;

	boolean method816(Class55 class55) {
		return method821(((Class32) this).aVector375.size(), class55);
	}

	void method817() {
		if (((Class32) this).anInterface4_376 == null) {
			((Class32) this).anInterface4_376 = ((Class32) this).aClass505_Sub2_371.method13994(false);
			((Class32) this).anInterface4_376.method31(12, 4);
			ByteBuffer bytebuffer = ((Class32) this).aClass505_Sub2_371.aByteBuffer8838;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			((Class32) this).anInterface4_376.method42(0, bytebuffer.position(), (((Class32) this).aClass505_Sub2_371.aLong8695));
			((Class32) this).aClass70_377 = (((Class32) this).aClass505_Sub2_371.method13995(new Class72[] { new Class72(Class69.aClass69_691) }));
		}
	}

	void method818() {
		((Class32) this).aClass158_Sub1_374.method212();
		((Class32) this).anInterface9_364.method26();
		((Class32) this).anInterface9_368.method26();
		((Class32) this).anInterface9_369.method26();
		((Class32) this).anInterface29_363.method26();
		((Class32) this).anInterface29_372.method26();
		((Class32) this).anInterface29_366.method26();
		((Class32) this).anInterface8_362.method26();
		int i = ((Class32) this).aVector375.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_0_);
			class55.method1110();
		}
	}

	void method819() {
		method817();
		switch (((Class32) this).anInt378) {
		case 1:
			((Class32) this).aClass76_373 = Class76.aClass76_755;
			break;
		case 2:
			((Class32) this).aClass76_373 = Class76.aClass76_758;
			break;
		case 0:
			((Class32) this).aClass76_373 = Class76.aClass76_751;
			break;
		default:
			throw new RuntimeException();
		}
		((Class32) this).aClass158_Sub1_374 = ((Class32) this).aClass505_Sub2_371.method8418();
		((Class32) this).anInterface29_363 = (((Class32) this).aClass505_Sub2_371.method14064(Class150.aClass150_1949, ((Class32) this).aClass76_373, ((Class32) this).anInt367, ((Class32) this).anInt365));
		((Class32) this).anInterface9_364 = ((Class32) this).anInterface29_363.method200(0);
		((Class32) this).anInterface29_372 = (((Class32) this).aClass505_Sub2_371.method14064(Class150.aClass150_1949, ((Class32) this).aClass76_373, ((Class32) this).anInt367, ((Class32) this).anInt365));
		((Class32) this).anInterface9_368 = ((Class32) this).anInterface29_372.method200(0);
		((Class32) this).anInterface29_366 = (((Class32) this).aClass505_Sub2_371.method14064(Class150.aClass150_1949, ((Class32) this).aClass76_373, ((Class32) this).anInt367, ((Class32) this).anInt365));
		((Class32) this).anInterface9_369 = ((Class32) this).anInterface29_366.method200(0);
		((Class32) this).anInterface8_362 = ((Class32) this).aClass505_Sub2_371.method8419((((Class32) this).anInt367), (((Class32) this).anInt365));
		int i = ((Class32) this).aVector375.size();
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_1_);
			class55.method1102(((Class32) this).anInt367, ((Class32) this).anInt365);
		}
	}

	void method820() {
		((Class32) this).aClass505_Sub2_371.method14161(0, ((Class32) this).anInterface4_376);
		((Class32) this).aClass505_Sub2_371.method13996(((Class32) this).aClass70_377);
		((Class32) this).aClass505_Sub2_371.method13923(Class352.aClass352_4098, 0, 1);
	}

	boolean method821(int i, Class55 class55) {
		if (class55.method1098() || class55.method1097()) {
			((Class32) this).aVector375.insertElementAt(class55, i);
			class55.method1102(((Class32) this).anInt367, ((Class32) this).anInt365);
			int i_2_ = class55.method1106();
			if (i_2_ > ((Class32) this).anInt378)
				((Class32) this).anInt378 = i_2_;
			((Class55) class55).aBool513 = true;
			return true;
		}
		method822(class55);
		return true;
	}

	void method822(Class55 class55) {
		class55.method1110();
		((Class55) class55).aBool513 = false;
		((Class32) this).aVector375.removeElement(class55);
	}

	boolean method823(int i, Class55 class55) {
		if (class55.method1098() || class55.method1097()) {
			((Class32) this).aVector375.insertElementAt(class55, i);
			class55.method1102(((Class32) this).anInt367, ((Class32) this).anInt365);
			int i_3_ = class55.method1106();
			if (i_3_ > ((Class32) this).anInt378)
				((Class32) this).anInt378 = i_3_;
			((Class55) class55).aBool513 = true;
			return true;
		}
		method822(class55);
		return true;
	}

	Class32(Class505_Sub2 class505_sub2, int i, int i_4_) {
		((Class32) this).aClass505_Sub2_371 = class505_sub2;
		((Class32) this).aClass76_373 = Class76.aClass76_751;
		((Class32) this).anInt367 = i;
		((Class32) this).anInt365 = i_4_;
	}

	void method824() {
		((Class32) this).aClass505_Sub2_371.method14003();
		((Class32) this).aClass505_Sub2_371.method13904(0);
		((Class32) this).aClass505_Sub2_371.method13947(1);
		((Class32) this).aClass505_Sub2_371.L();
		((Class32) this).aClass158_Sub1_374.method13765(null);
		((Class32) this).aClass505_Sub2_371.method13919(0, 0);
		int i = ((Class32) this).aVector375.size();
		((Class32) this).anInterface29_366.method54();
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_5_);
			int i_6_ = class55.method1100();
			boolean bool = i_5_ == i - 1;
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				if (bool && i_7_ == i_6_ - 1)
					((Class32) this).aClass505_Sub2_371.method8416(((Class32) this).aClass158_Sub1_374, (byte) -26);
				else
					((Class32) this).aClass158_Sub1_374.method13759(0, ((Class32) this).anInterface9_368);
				Interface29 interface29 = ((Class32) this).anInterface29_363;
				if (i_7_ == 0)
					interface29 = ((Class32) this).anInterface29_366;
				class55.method1103(i_7_, ((Class32) this).aClass158_Sub1_374, interface29, ((Class32) this).anInterface8_362, ((Class32) this).anInterface29_366);
				method820();
				class55.method1104(i_7_);
				Interface29 interface29_8_ = ((Class32) this).anInterface29_363;
				((Class32) this).anInterface29_363 = ((Class32) this).anInterface29_372;
				((Class32) this).anInterface29_372 = interface29_8_;
				Interface9 interface9 = ((Class32) this).anInterface9_364;
				((Class32) this).anInterface9_364 = ((Class32) this).anInterface9_368;
				((Class32) this).anInterface9_368 = interface9;
			}
		}
		((Class32) this).aClass505_Sub2_371.method13904(1);
		((Class32) this).aClass505_Sub2_371.method13947(0);
	}

	void method825() {
		((Class32) this).aClass158_Sub1_374.method212();
		((Class32) this).anInterface9_364.method26();
		((Class32) this).anInterface9_368.method26();
		((Class32) this).anInterface9_369.method26();
		((Class32) this).anInterface29_363.method26();
		((Class32) this).anInterface29_372.method26();
		((Class32) this).anInterface29_366.method26();
		((Class32) this).anInterface8_362.method26();
		int i = ((Class32) this).aVector375.size();
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_9_);
			class55.method1110();
		}
	}

	void method826() {
		if (((Class32) this).anInterface4_376 == null) {
			((Class32) this).anInterface4_376 = ((Class32) this).aClass505_Sub2_371.method13994(false);
			((Class32) this).anInterface4_376.method31(12, 4);
			ByteBuffer bytebuffer = ((Class32) this).aClass505_Sub2_371.aByteBuffer8838;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			((Class32) this).anInterface4_376.method42(0, bytebuffer.position(), (((Class32) this).aClass505_Sub2_371.aLong8695));
			((Class32) this).aClass70_377 = (((Class32) this).aClass505_Sub2_371.method13995(new Class72[] { new Class72(Class69.aClass69_691) }));
		}
	}

	void method827() {
		if (((Class32) this).anInterface4_376 == null) {
			((Class32) this).anInterface4_376 = ((Class32) this).aClass505_Sub2_371.method13994(false);
			((Class32) this).anInterface4_376.method31(12, 4);
			ByteBuffer bytebuffer = ((Class32) this).aClass505_Sub2_371.aByteBuffer8838;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			((Class32) this).anInterface4_376.method42(0, bytebuffer.position(), (((Class32) this).aClass505_Sub2_371.aLong8695));
			((Class32) this).aClass70_377 = (((Class32) this).aClass505_Sub2_371.method13995(new Class72[] { new Class72(Class69.aClass69_691) }));
		}
	}

	void method828() {
		method817();
		switch (((Class32) this).anInt378) {
		case 1:
			((Class32) this).aClass76_373 = Class76.aClass76_755;
			break;
		case 2:
			((Class32) this).aClass76_373 = Class76.aClass76_758;
			break;
		case 0:
			((Class32) this).aClass76_373 = Class76.aClass76_751;
			break;
		default:
			throw new RuntimeException();
		}
		((Class32) this).aClass158_Sub1_374 = ((Class32) this).aClass505_Sub2_371.method8418();
		((Class32) this).anInterface29_363 = (((Class32) this).aClass505_Sub2_371.method14064(Class150.aClass150_1949, ((Class32) this).aClass76_373, ((Class32) this).anInt367, ((Class32) this).anInt365));
		((Class32) this).anInterface9_364 = ((Class32) this).anInterface29_363.method200(0);
		((Class32) this).anInterface29_372 = (((Class32) this).aClass505_Sub2_371.method14064(Class150.aClass150_1949, ((Class32) this).aClass76_373, ((Class32) this).anInt367, ((Class32) this).anInt365));
		((Class32) this).anInterface9_368 = ((Class32) this).anInterface29_372.method200(0);
		((Class32) this).anInterface29_366 = (((Class32) this).aClass505_Sub2_371.method14064(Class150.aClass150_1949, ((Class32) this).aClass76_373, ((Class32) this).anInt367, ((Class32) this).anInt365));
		((Class32) this).anInterface9_369 = ((Class32) this).anInterface29_366.method200(0);
		((Class32) this).anInterface8_362 = ((Class32) this).aClass505_Sub2_371.method8419((((Class32) this).anInt367), (((Class32) this).anInt365));
		int i = ((Class32) this).aVector375.size();
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_10_);
			class55.method1102(((Class32) this).anInt367, ((Class32) this).anInt365);
		}
	}

	void method829() {
		((Class32) this).aClass505_Sub2_371.method14161(0, ((Class32) this).anInterface4_376);
		((Class32) this).aClass505_Sub2_371.method13996(((Class32) this).aClass70_377);
		((Class32) this).aClass505_Sub2_371.method13923(Class352.aClass352_4098, 0, 1);
	}

	boolean method830(int i, int i_11_, int i_12_, int i_13_) {
		if (((Class32) this).aVector375.isEmpty())
			return false;
		if (((Class32) this).anInt367 != i_12_ || ((Class32) this).anInt365 != i_13_) {
			((Class32) this).anInt367 = i_12_;
			((Class32) this).anInt365 = i_13_;
			method818();
			method819();
		}
		((Class32) this).aClass158_Sub1_374.method13759(0, ((Class32) this).anInterface9_369);
		if (((Class32) this).anInterface8_362 != null)
			((Class32) this).aClass158_Sub1_374.method13765(((Class32) this).anInterface8_362);
		((Class32) this).aClass505_Sub2_371.method8637(((Class32) this).aClass158_Sub1_374, -712324126);
		((Class32) this).aClass505_Sub2_371.ba(3, -16777216);
		((Class32) this).aClass505_Sub2_371.method13986(15);
		((Class32) this).aClass505_Sub2_371.method13985(0);
		if (!((Class32) this).aClass158_Sub1_374.method13764())
			throw new RuntimeException("");
		((Class32) this).aBool370 = true;
		return true;
	}

	boolean method831(int i, Class55 class55) {
		if (class55.method1098() || class55.method1097()) {
			((Class32) this).aVector375.insertElementAt(class55, i);
			class55.method1102(((Class32) this).anInt367, ((Class32) this).anInt365);
			int i_14_ = class55.method1106();
			if (i_14_ > ((Class32) this).anInt378)
				((Class32) this).anInt378 = i_14_;
			((Class55) class55).aBool513 = true;
			return true;
		}
		method822(class55);
		return true;
	}

	void method832(Class55 class55) {
		class55.method1110();
		((Class55) class55).aBool513 = false;
		((Class32) this).aVector375.removeElement(class55);
	}

	void method833() {
		if (((Class32) this).aBool370) {
			method824();
			((Class32) this).aBool370 = false;
		}
	}

	void method834() {
		if (((Class32) this).aBool370) {
			method824();
			((Class32) this).aBool370 = false;
		}
	}

	void method835() {
		if (((Class32) this).aBool370) {
			method824();
			((Class32) this).aBool370 = false;
		}
	}

	void method836() {
		if (((Class32) this).aBool370) {
			method824();
			((Class32) this).aBool370 = false;
		}
	}

	boolean method837(int i, int i_15_, int i_16_, int i_17_) {
		if (((Class32) this).aVector375.isEmpty())
			return false;
		if (((Class32) this).anInt367 != i_16_ || ((Class32) this).anInt365 != i_17_) {
			((Class32) this).anInt367 = i_16_;
			((Class32) this).anInt365 = i_17_;
			method818();
			method819();
		}
		((Class32) this).aClass158_Sub1_374.method13759(0, ((Class32) this).anInterface9_369);
		if (((Class32) this).anInterface8_362 != null)
			((Class32) this).aClass158_Sub1_374.method13765(((Class32) this).anInterface8_362);
		((Class32) this).aClass505_Sub2_371.method8637(((Class32) this).aClass158_Sub1_374, -211881745);
		((Class32) this).aClass505_Sub2_371.ba(3, -16777216);
		((Class32) this).aClass505_Sub2_371.method13986(15);
		((Class32) this).aClass505_Sub2_371.method13985(0);
		if (!((Class32) this).aClass158_Sub1_374.method13764())
			throw new RuntimeException("");
		((Class32) this).aBool370 = true;
		return true;
	}

	void method838() {
		((Class32) this).aClass505_Sub2_371.method14003();
		((Class32) this).aClass505_Sub2_371.method13904(0);
		((Class32) this).aClass505_Sub2_371.method13947(1);
		((Class32) this).aClass505_Sub2_371.L();
		((Class32) this).aClass158_Sub1_374.method13765(null);
		((Class32) this).aClass505_Sub2_371.method13919(0, 0);
		int i = ((Class32) this).aVector375.size();
		((Class32) this).anInterface29_366.method54();
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_18_);
			int i_19_ = class55.method1100();
			boolean bool = i_18_ == i - 1;
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
				if (bool && i_20_ == i_19_ - 1)
					((Class32) this).aClass505_Sub2_371.method8416(((Class32) this).aClass158_Sub1_374, (byte) -15);
				else
					((Class32) this).aClass158_Sub1_374.method13759(0, ((Class32) this).anInterface9_368);
				Interface29 interface29 = ((Class32) this).anInterface29_363;
				if (i_20_ == 0)
					interface29 = ((Class32) this).anInterface29_366;
				class55.method1103(i_20_, ((Class32) this).aClass158_Sub1_374, interface29, ((Class32) this).anInterface8_362, ((Class32) this).anInterface29_366);
				method820();
				class55.method1104(i_20_);
				Interface29 interface29_21_ = ((Class32) this).anInterface29_363;
				((Class32) this).anInterface29_363 = ((Class32) this).anInterface29_372;
				((Class32) this).anInterface29_372 = interface29_21_;
				Interface9 interface9 = ((Class32) this).anInterface9_364;
				((Class32) this).anInterface9_364 = ((Class32) this).anInterface9_368;
				((Class32) this).anInterface9_368 = interface9;
			}
		}
		((Class32) this).aClass505_Sub2_371.method13904(1);
		((Class32) this).aClass505_Sub2_371.method13947(0);
	}

	void method839() {
		((Class32) this).aClass505_Sub2_371.method14003();
		((Class32) this).aClass505_Sub2_371.method13904(0);
		((Class32) this).aClass505_Sub2_371.method13947(1);
		((Class32) this).aClass505_Sub2_371.L();
		((Class32) this).aClass158_Sub1_374.method13765(null);
		((Class32) this).aClass505_Sub2_371.method13919(0, 0);
		int i = ((Class32) this).aVector375.size();
		((Class32) this).anInterface29_366.method54();
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_22_);
			int i_23_ = class55.method1100();
			boolean bool = i_22_ == i - 1;
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
				if (bool && i_24_ == i_23_ - 1)
					((Class32) this).aClass505_Sub2_371.method8416(((Class32) this).aClass158_Sub1_374, (byte) -100);
				else
					((Class32) this).aClass158_Sub1_374.method13759(0, ((Class32) this).anInterface9_368);
				Interface29 interface29 = ((Class32) this).anInterface29_363;
				if (i_24_ == 0)
					interface29 = ((Class32) this).anInterface29_366;
				class55.method1103(i_24_, ((Class32) this).aClass158_Sub1_374, interface29, ((Class32) this).anInterface8_362, ((Class32) this).anInterface29_366);
				method820();
				class55.method1104(i_24_);
				Interface29 interface29_25_ = ((Class32) this).anInterface29_363;
				((Class32) this).anInterface29_363 = ((Class32) this).anInterface29_372;
				((Class32) this).anInterface29_372 = interface29_25_;
				Interface9 interface9 = ((Class32) this).anInterface9_364;
				((Class32) this).anInterface9_364 = ((Class32) this).anInterface9_368;
				((Class32) this).anInterface9_368 = interface9;
			}
		}
		((Class32) this).aClass505_Sub2_371.method13904(1);
		((Class32) this).aClass505_Sub2_371.method13947(0);
	}

	void method840() {
		((Class32) this).aClass505_Sub2_371.method14003();
		((Class32) this).aClass505_Sub2_371.method13904(0);
		((Class32) this).aClass505_Sub2_371.method13947(1);
		((Class32) this).aClass505_Sub2_371.L();
		((Class32) this).aClass158_Sub1_374.method13765(null);
		((Class32) this).aClass505_Sub2_371.method13919(0, 0);
		int i = ((Class32) this).aVector375.size();
		((Class32) this).anInterface29_366.method54();
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			Class55 class55 = (Class55) ((Class32) this).aVector375.elementAt(i_26_);
			int i_27_ = class55.method1100();
			boolean bool = i_26_ == i - 1;
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				if (bool && i_28_ == i_27_ - 1)
					((Class32) this).aClass505_Sub2_371.method8416(((Class32) this).aClass158_Sub1_374, (byte) -19);
				else
					((Class32) this).aClass158_Sub1_374.method13759(0, ((Class32) this).anInterface9_368);
				Interface29 interface29 = ((Class32) this).anInterface29_363;
				if (i_28_ == 0)
					interface29 = ((Class32) this).anInterface29_366;
				class55.method1103(i_28_, ((Class32) this).aClass158_Sub1_374, interface29, ((Class32) this).anInterface8_362, ((Class32) this).anInterface29_366);
				method820();
				class55.method1104(i_28_);
				Interface29 interface29_29_ = ((Class32) this).anInterface29_363;
				((Class32) this).anInterface29_363 = ((Class32) this).anInterface29_372;
				((Class32) this).anInterface29_372 = interface29_29_;
				Interface9 interface9 = ((Class32) this).anInterface9_364;
				((Class32) this).anInterface9_364 = ((Class32) this).anInterface9_368;
				((Class32) this).anInterface9_368 = interface9;
			}
		}
		((Class32) this).aClass505_Sub2_371.method13904(1);
		((Class32) this).aClass505_Sub2_371.method13947(0);
	}
}
