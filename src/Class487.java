/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class487 {
	public static final int anInt5751 = 4;
	public static Class378 aClass378_5752;

	Class487() throws Throwable {
		throw new Error();
	}

	static final void method8208(CS2Executor class527, byte i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 70);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class504.method8387(class118, class98, class527, 1918613827);
	}

	static void method8209(GraphicalRenderer class505, int i, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_) {
		if ((null == Class354.aClass160_4110 || null == AttributeDefault.aClass160_5339 || Class125.aClass160_1571 == null) && IndexLoaders.SPRITES_INDEX.method5661(Class254.anInt3145 * 464964387, -635610932) && IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, -688613423) && IndexLoaders.SPRITES_INDEX.method5661(-1965396391 * Class17.anInt148, 1307952066)) {
			Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -781860267 * Class446.anInt5396, 0);
			AttributeDefault.aClass160_5339 = class505.method8444(class91, true);
			class91.method1525();
			Class290.aClass160_3452 = class505.method8444(class91, true);
			Class354.aClass160_4110 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, 464964387 * Class254.anInt3145, 0), true));
			Class91 class91_6_ = Class91.method1522(IndexLoaders.SPRITES_INDEX, Class17.anInt148 * -1965396391, 0);
			Class125.aClass160_1571 = class505.method8444(class91_6_, true);
			class91_6_.method1525();
			Class149_Sub2.aClass160_9315 = class505.method8444(class91_6_, true);
		}
		if (null != Class354.aClass160_4110 && AttributeDefault.aClass160_5339 != null && Class125.aClass160_1571 != null) {
			int i_7_ = ((i_2_ - Class125.aClass160_1571.method2747() * 2) / Class354.aClass160_4110.method2747());
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				Class354.aClass160_4110.method2752((i + Class125.aClass160_1571.method2747() + i_8_ * Class354.aClass160_4110.method2747()), i_1_ + i_3_ - Class354.aClass160_4110.method2793());
			int i_9_ = ((i_3_ - i_4_ - Class125.aClass160_1571.method2793()) / AttributeDefault.aClass160_5339.method2793());
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				AttributeDefault.aClass160_5339.method2752(i, (i_4_ + i_1_ + i_10_ * AttributeDefault.aClass160_5339.method2793()));
				Class290.aClass160_3452.method2752(i + i_2_ - Class290.aClass160_3452.method2747(), (i_4_ + i_1_ + i_10_ * AttributeDefault.aClass160_5339.method2793()));
			}
			Class125.aClass160_1571.method2752(i, (i_3_ + i_1_ - Class125.aClass160_1571.method2793()));
			Class149_Sub2.aClass160_9315.method2752(i_2_ + i - Class125.aClass160_1571.method2747(), i_3_ + i_1_ - Class125.aClass160_1571.method2793());
		}
	}
}
