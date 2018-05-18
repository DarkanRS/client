/* Class456_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub2 extends Class456 {
	Class521_Sub1 aClass521_Sub1_7890;

	void method7592(AnimationDefinitions class518, int i) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	void method7586(AnimationDefinitions class518, int i, int i_0_) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	void method7626(AnimationDefinitions class518, int i) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	void method7590(AnimationDefinitions class518, int i) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	void method7591(AnimationDefinitions class518, int i) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	Class456_Sub2(Class521_Sub1 class521_sub1, boolean bool) {
		super(bool);
		((Class456_Sub2) this).aClass521_Sub1_7890 = class521_sub1;
	}

	void method7616(AnimationDefinitions class518, int i) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	void method7594(AnimationDefinitions class518, int i) {
		Class213.method3662(class518, i, ((Class456_Sub2) this).aClass521_Sub1_7890, (short) 255);
	}

	static void method12680(GraphicalRenderer class505, int i, int i_1_, int i_2_, int i_3_, int i_4_, FontRenderer class8, Class414 class414, String string, int i_5_) {
		int i_6_ = (255 - Class301.anInt3556 * 233097173 - Class20.anInt156 * -1454754391);
		if (i_6_ < 0)
			i_6_ = 0;
		if (Class467.aClass160_5576 == null || null == Class61.aClass160_647) {
			if (Class211.aClass317_2673.method5661(Class450.anInt5438 * 947424179, -1304535718) && Class211.aClass317_2673.method5661((-1626939609 * Class373.anInt4350), 1306027790)) {
				Class467.aClass160_5576 = (class505.method8444(Class91.method1522(Class211.aClass317_2673, Class450.anInt5438 * 947424179, 0), true));
				Class91 class91 = Class91.method1522(Class211.aClass317_2673, -1626939609 * Class373.anInt4350, 0);
				Class61.aClass160_647 = class505.method8444(class91, true);
				class91.method1525();
				Class60.aClass160_612 = class505.method8444(class91, true);
			} else
				class505.B(i, i_1_, i_2_, i_4_, (i_6_ << 24 | 134810037 * Class282_Sub20_Sub9.anInt9792), 1);
		}
		if (Class467.aClass160_5576 != null && Class61.aClass160_647 != null) {
			int i_7_ = ((i_2_ - Class61.aClass160_647.method2747() * 2) / Class467.aClass160_5576.method2747());
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				Class467.aClass160_5576.method2752((i + Class61.aClass160_647.method2747() + i_8_ * Class467.aClass160_5576.method2747()), i_1_);
			Class61.aClass160_647.method2752(i, i_1_);
			Class60.aClass160_612.method2752(i + i_2_ - Class60.aClass160_612.method2747(), i_1_);
		}
		class8.renderText(string, i + 3, (i_1_ + 397683159 * class414.anInt4978 + (20 - class414.anInt4978 * 397683159) / 2), 1836789541 * Class388.anInt4722 | ~0xffffff, -1, -418109423);
		class505.B(i, i_1_ + i_4_, i_2_, i_3_ - i_4_, i_6_ << 24 | Class282_Sub20_Sub9.anInt9792 * 134810037, 1);
	}
}
