import java.nio.ByteBuffer;
import java.util.Vector;

public class Class32 {

	Interface4 anInterface4_376;
	Class70 aClass70_377;
	Class76 aClass76_373;
	Class158_Sub1 aClass158_Sub1_374;
	Interface29 anInterface29_363;
	Interface9 anInterface9_364;
	Interface29 anInterface29_372;
	Interface9 anInterface9_368;
	Interface29 anInterface29_366;
	Interface9 anInterface9_369;
	Interface8 anInterface8_362;
	int anInt378 = 0;
	Vector aVector375 = new Vector();
	Class505_Sub2 aClass505_Sub2_371;
	int anInt367;
	int anInt365;
	boolean aBool370;

	boolean method816(Class55 class55_1) {
		return this.method821(this.aVector375.size(), class55_1);
	}

	void method817() {
		if (this.anInterface4_376 == null) {
			this.anInterface4_376 = this.aClass505_Sub2_371.method13994(false);
			this.anInterface4_376.method31(12, 4);
			ByteBuffer bytebuffer_1 = this.aClass505_Sub2_371.aByteBuffer8838;
			bytebuffer_1.clear();
			bytebuffer_1.putFloat(0.0F);
			bytebuffer_1.putFloat(1.0F);
			bytebuffer_1.putFloat(2.0F);
			this.anInterface4_376.method42(0, bytebuffer_1.position(), this.aClass505_Sub2_371.aLong8695);
			this.aClass70_377 = this.aClass505_Sub2_371.method13995(new Class72[] { new Class72(Class69.aClass69_691) });
		}

	}

	void method818() {
		this.aClass158_Sub1_374.method212();
		this.anInterface9_364.method26();
		this.anInterface9_368.method26();
		this.anInterface9_369.method26();
		this.anInterface29_363.method26();
		this.anInterface29_372.method26();
		this.anInterface29_366.method26();
		this.anInterface8_362.method26();
		int i_1 = this.aVector375.size();

		for (int i_2 = 0; i_2 < i_1; i_2++) {
			Class55 class55_3 = (Class55) this.aVector375.elementAt(i_2);
			class55_3.method1110();
		}

	}

	void method819() {
		this.method817();
		switch (this.anInt378) {
		case 0:
			this.aClass76_373 = Class76.aClass76_751;
			break;
		case 1:
			this.aClass76_373 = Class76.aClass76_755;
			break;
		case 2:
			this.aClass76_373 = Class76.aClass76_758;
			break;
		default:
			throw new RuntimeException();
		}

		this.aClass158_Sub1_374 = this.aClass505_Sub2_371.method8418();
		this.anInterface29_363 = this.aClass505_Sub2_371.method14064(Class150.aClass150_1949, this.aClass76_373, this.anInt367, this.anInt365);
		this.anInterface9_364 = this.anInterface29_363.method200();
		this.anInterface29_372 = this.aClass505_Sub2_371.method14064(Class150.aClass150_1949, this.aClass76_373, this.anInt367, this.anInt365);
		this.anInterface9_368 = this.anInterface29_372.method200();
		this.anInterface29_366 = this.aClass505_Sub2_371.method14064(Class150.aClass150_1949, this.aClass76_373, this.anInt367, this.anInt365);
		this.anInterface9_369 = this.anInterface29_366.method200();
		this.anInterface8_362 = this.aClass505_Sub2_371.method8419(this.anInt367, this.anInt365);
		int i_1 = this.aVector375.size();

		for (int i_2 = 0; i_2 < i_1; i_2++) {
			Class55 class55_3 = (Class55) this.aVector375.elementAt(i_2);
			class55_3.method1102(this.anInt367, this.anInt365);
		}

	}

	void method820() {
		this.aClass505_Sub2_371.method14161(0, this.anInterface4_376);
		this.aClass505_Sub2_371.method13996(this.aClass70_377);
		this.aClass505_Sub2_371.method13923(Class352.aClass352_4098, 0, 1);
	}

	boolean method821(int i_1, Class55 class55_2) {
		if (!class55_2.method1098() && !class55_2.method1097()) {
			this.method822(class55_2);
			return true;
		} else {
			this.aVector375.insertElementAt(class55_2, i_1);
			class55_2.method1102(this.anInt367, this.anInt365);
			int i_3 = class55_2.method1106();
			if (i_3 > this.anInt378) {
				this.anInt378 = i_3;
			}

			class55_2.aBool513 = true;
			return true;
		}
	}

	void method822(Class55 class55_1) {
		class55_1.method1110();
		class55_1.aBool513 = false;
		this.aVector375.removeElement(class55_1);
	}

	Class32(Class505_Sub2 class505_sub2_1, int i_2, int i_3) {
		this.aClass505_Sub2_371 = class505_sub2_1;
		this.aClass76_373 = Class76.aClass76_751;
		this.anInt367 = i_2;
		this.anInt365 = i_3;
	}

	void method824() {
		this.aClass505_Sub2_371.method14003();
		this.aClass505_Sub2_371.method13904(0);
		this.aClass505_Sub2_371.method13947(1);
		this.aClass505_Sub2_371.L();
		this.aClass158_Sub1_374.method13765((Interface8) null);
		this.aClass505_Sub2_371.method13919();
		int i_1 = this.aVector375.size();
		this.anInterface29_366.method54();

		for (int i_2 = 0; i_2 < i_1; i_2++) {
			Class55 class55_3 = (Class55) this.aVector375.elementAt(i_2);
			int i_4 = class55_3.method1100();
			boolean bool_5 = i_2 == i_1 - 1;

			for (int i_6 = 0; i_6 < i_4; i_6++) {
				if (bool_5 && i_6 == i_4 - 1) {
					this.aClass505_Sub2_371.method8416(this.aClass158_Sub1_374, (byte) -26);
				} else {
					this.aClass158_Sub1_374.method13759(0, this.anInterface9_368);
				}

				Interface29 interface29_7 = this.anInterface29_363;
				if (i_6 == 0) {
					interface29_7 = this.anInterface29_366;
				}

				class55_3.method1103(i_6, this.aClass158_Sub1_374, interface29_7, this.anInterface8_362, this.anInterface29_366);
				this.method820();
				class55_3.method1104(i_6);
				Interface29 interface29_8 = this.anInterface29_363;
				this.anInterface29_363 = this.anInterface29_372;
				this.anInterface29_372 = interface29_8;
				Interface9 interface9_9 = this.anInterface9_364;
				this.anInterface9_364 = this.anInterface9_368;
				this.anInterface9_368 = interface9_9;
			}
		}

		this.aClass505_Sub2_371.method13904(1);
		this.aClass505_Sub2_371.method13947(0);
	}

	boolean method830(int i_1, int i_2, int i_3, int i_4) {
		if (this.aVector375.isEmpty()) {
			return false;
		} else {
			if (i_3 != this.anInt367 || i_4 != this.anInt365) {
				this.anInt367 = i_3;
				this.anInt365 = i_4;
				this.method818();
				this.method819();
			}

			this.aClass158_Sub1_374.method13759(0, this.anInterface9_369);
			if (this.anInterface8_362 != null) {
				this.aClass158_Sub1_374.method13765(this.anInterface8_362);
			}

			this.aClass505_Sub2_371.method8637(this.aClass158_Sub1_374, -712324126);
			this.aClass505_Sub2_371.ba(3, -16777216);
			this.aClass505_Sub2_371.method13986(15);
			this.aClass505_Sub2_371.method13985();
			if (!this.aClass158_Sub1_374.method13764()) {
				throw new RuntimeException("");
			} else {
				this.aBool370 = true;
				return true;
			}
		}
	}

	void method833() {
		if (this.aBool370) {
			this.method824();
			this.aBool370 = false;
		}

	}

}
