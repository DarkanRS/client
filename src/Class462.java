/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class462 {
	int anInt5542;
	int anInt5543;
	boolean aBool5544 = false;
	AnimationSkeleton aClass282_Sub50_Sub13_5545;
	AnimationSkeleton aClass282_Sub50_Sub13_5546;
	int anInt5547;
	public static String[] aStringArray5548;

	final boolean method7707(AnimationIndexLoader animIndexLoader, AnimationDefinitions animDefs, int i, int i_0_, int[] is, int i_1_) {
		if (!((Class462) this).aBool5544) {
			if (i >= is.length)
				return false;
			((Class462) this).anInt5542 = is[i] * -1816701217;
			((Class462) this).aClass282_Sub50_Sub13_5545 = animIndexLoader.getAnimationSkeleton((((Class462) this).anInt5542 * -104209121) >> 16, -1536383536);
			((Class462) this).anInt5542 = ((((Class462) this).anInt5542 * -104209121 & 0xffff) * -1816701217);
			if (((Class462) this).aClass282_Sub50_Sub13_5545 != null) {
				if (animDefs.aBool5924 && -1 != i_0_ && i_0_ < is.length) {
					((Class462) this).anInt5547 = is[i_0_] * -362437113;
					((Class462) this).aClass282_Sub50_Sub13_5546 = animIndexLoader.getAnimationSkeleton((((Class462) this).anInt5547 * -775231561) >> 16, -1536383536);
					((Class462) this).anInt5547 = (-362437113 * (-775231561 * ((Class462) this).anInt5547 & 0xffff));
				}
				if (animDefs.aBool5923)
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x200));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15080(((Class462) this).anInt5542 * -104209121, -1144516636))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x80) * -547501175);
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15079(((Class462) this).anInt5542 * -104209121, 61802721))
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x100));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15081(-104209121 * ((Class462) this).anInt5542, -752356381))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x400) * -547501175);
				if (null != ((Class462) this).aClass282_Sub50_Sub13_5546) {
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15080(((Class462) this).anInt5547 * -775231561, -2104215933))
						((Class462) this).anInt5543 = (-547501175 * (-1154737479 * ((Class462) this).anInt5543 | 0x80));
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15079(((Class462) this).anInt5547 * -775231561, 61802721))
						((Class462) this).anInt5543 = (((Class462) this).anInt5543 * -1154737479 | 0x100) * -547501175;
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15081(-775231561 * ((Class462) this).anInt5547, -752356381))
						((Class462) this).anInt5543 = (-1154737479 * ((Class462) this).anInt5543 | 0x400) * -547501175;
				}
				((Class462) this).anInt5543 = -547501175 * (-1154737479 * ((Class462) this).anInt5543 | 0x20);
				((Class462) this).aBool5544 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	final void method7708(int i) {
		((Class462) this).aBool5544 = false;
		((Class462) this).anInt5543 = 0;
		((Class462) this).aClass282_Sub50_Sub13_5546 = null;
		((Class462) this).aClass282_Sub50_Sub13_5545 = null;
	}

	Class462() {
		/* empty */
	}

	static final void method7715(CS2Executor class527, int i) {
		int i_6_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 192651981 * client.aClass330Array7428[i_6_].anInt3862;
	}
}
