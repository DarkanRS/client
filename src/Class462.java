/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class462 {
	int anInt5542;
	int anInt5543;
	boolean aBool5544 = false;
	Class282_Sub50_Sub13 aClass282_Sub50_Sub13_5545;
	Class282_Sub50_Sub13 aClass282_Sub50_Sub13_5546;
	int anInt5547;
	public static String[] aStringArray5548;

	final void method7706() {
		((Class462) this).aBool5544 = false;
		((Class462) this).anInt5543 = 0;
		((Class462) this).aClass282_Sub50_Sub13_5546 = null;
		((Class462) this).aClass282_Sub50_Sub13_5545 = null;
	}

	final boolean method7707(Class523 class523, Class518 class518, int i, int i_0_, int[] is, int i_1_) {
		if (!((Class462) this).aBool5544) {
			if (i >= is.length)
				return false;
			((Class462) this).anInt5542 = is[i] * -1816701217;
			((Class462) this).aClass282_Sub50_Sub13_5545 = class523.method11207((((Class462) this).anInt5542 * -104209121) >> 16, -1536383536);
			((Class462) this).anInt5542 = ((((Class462) this).anInt5542 * -104209121 & 0xffff) * -1816701217);
			if (((Class462) this).aClass282_Sub50_Sub13_5545 != null) {
				if (class518.aBool5924 && -1 != i_0_ && i_0_ < is.length) {
					((Class462) this).anInt5547 = is[i_0_] * -362437113;
					((Class462) this).aClass282_Sub50_Sub13_5546 = class523.method11207((((Class462) this).anInt5547 * -775231561) >> 16, -1536383536);
					((Class462) this).anInt5547 = (-362437113 * (-775231561 * ((Class462) this).anInt5547 & 0xffff));
				}
				if (class518.aBool5923)
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

	final boolean method7709(Class523 class523, Class518 class518, int i, int i_2_, int[] is) {
		if (!((Class462) this).aBool5544) {
			if (i >= is.length)
				return false;
			((Class462) this).anInt5542 = is[i] * -1816701217;
			((Class462) this).aClass282_Sub50_Sub13_5545 = class523.method11207((((Class462) this).anInt5542 * -104209121) >> 16, -1536383536);
			((Class462) this).anInt5542 = ((((Class462) this).anInt5542 * -104209121 & 0xffff) * -1816701217);
			if (((Class462) this).aClass282_Sub50_Sub13_5545 != null) {
				if (class518.aBool5924 && -1 != i_2_ && i_2_ < is.length) {
					((Class462) this).anInt5547 = is[i_2_] * -362437113;
					((Class462) this).aClass282_Sub50_Sub13_5546 = class523.method11207((((Class462) this).anInt5547 * -775231561) >> 16, -1536383536);
					((Class462) this).anInt5547 = (-362437113 * (-775231561 * ((Class462) this).anInt5547 & 0xffff));
				}
				if (class518.aBool5923)
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x200));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15080(((Class462) this).anInt5542 * -104209121, -1717074724))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x80) * -547501175);
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15079(((Class462) this).anInt5542 * -104209121, 61802721))
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x100));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15081(-104209121 * ((Class462) this).anInt5542, -752356381))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x400) * -547501175);
				if (null != ((Class462) this).aClass282_Sub50_Sub13_5546) {
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15080(((Class462) this).anInt5547 * -775231561, -1375634942))
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

	final void method7710() {
		((Class462) this).aBool5544 = false;
		((Class462) this).anInt5543 = 0;
		((Class462) this).aClass282_Sub50_Sub13_5546 = null;
		((Class462) this).aClass282_Sub50_Sub13_5545 = null;
	}

	final boolean method7711(Class523 class523, Class518 class518, int i, int i_3_, int[] is) {
		if (!((Class462) this).aBool5544) {
			if (i >= is.length)
				return false;
			((Class462) this).anInt5542 = is[i] * -1816701217;
			((Class462) this).aClass282_Sub50_Sub13_5545 = class523.method11207((((Class462) this).anInt5542 * -104209121) >> 16, -1536383536);
			((Class462) this).anInt5542 = ((((Class462) this).anInt5542 * -104209121 & 0xffff) * -1816701217);
			if (((Class462) this).aClass282_Sub50_Sub13_5545 != null) {
				if (class518.aBool5924 && -1 != i_3_ && i_3_ < is.length) {
					((Class462) this).anInt5547 = is[i_3_] * -362437113;
					((Class462) this).aClass282_Sub50_Sub13_5546 = class523.method11207((((Class462) this).anInt5547 * -775231561) >> 16, -1536383536);
					((Class462) this).anInt5547 = (-362437113 * (-775231561 * ((Class462) this).anInt5547 & 0xffff));
				}
				if (class518.aBool5923)
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x200));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15080(((Class462) this).anInt5542 * -104209121, -718528893))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x80) * -547501175);
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15079(((Class462) this).anInt5542 * -104209121, 61802721))
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x100));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15081(-104209121 * ((Class462) this).anInt5542, -752356381))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x400) * -547501175);
				if (null != ((Class462) this).aClass282_Sub50_Sub13_5546) {
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15080(((Class462) this).anInt5547 * -775231561, -635702540))
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

	final boolean method7712(Class523 class523, Class518 class518, int i, int i_4_, int[] is) {
		if (!((Class462) this).aBool5544) {
			if (i >= is.length)
				return false;
			((Class462) this).anInt5542 = is[i] * -1816701217;
			((Class462) this).aClass282_Sub50_Sub13_5545 = class523.method11207((((Class462) this).anInt5542 * -104209121) >> 16, -1536383536);
			((Class462) this).anInt5542 = ((((Class462) this).anInt5542 * -104209121 & 0xffff) * -1816701217);
			if (((Class462) this).aClass282_Sub50_Sub13_5545 != null) {
				if (class518.aBool5924 && -1 != i_4_ && i_4_ < is.length) {
					((Class462) this).anInt5547 = is[i_4_] * -362437113;
					((Class462) this).aClass282_Sub50_Sub13_5546 = class523.method11207((((Class462) this).anInt5547 * -775231561) >> 16, -1536383536);
					((Class462) this).anInt5547 = (-362437113 * (-775231561 * ((Class462) this).anInt5547 & 0xffff));
				}
				if (class518.aBool5923)
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x200));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15080(((Class462) this).anInt5542 * -104209121, -446067374))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x80) * -547501175);
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15079(((Class462) this).anInt5542 * -104209121, 61802721))
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x100));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15081(-104209121 * ((Class462) this).anInt5542, -752356381))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x400) * -547501175);
				if (null != ((Class462) this).aClass282_Sub50_Sub13_5546) {
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15080(((Class462) this).anInt5547 * -775231561, -311293003))
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

	final boolean method7713(Class523 class523, Class518 class518, int i, int i_5_, int[] is) {
		if (!((Class462) this).aBool5544) {
			if (i >= is.length)
				return false;
			((Class462) this).anInt5542 = is[i] * -1816701217;
			((Class462) this).aClass282_Sub50_Sub13_5545 = class523.method11207((((Class462) this).anInt5542 * -104209121) >> 16, -1536383536);
			((Class462) this).anInt5542 = ((((Class462) this).anInt5542 * -104209121 & 0xffff) * -1816701217);
			if (((Class462) this).aClass282_Sub50_Sub13_5545 != null) {
				if (class518.aBool5924 && -1 != i_5_ && i_5_ < is.length) {
					((Class462) this).anInt5547 = is[i_5_] * -362437113;
					((Class462) this).aClass282_Sub50_Sub13_5546 = class523.method11207((((Class462) this).anInt5547 * -775231561) >> 16, -1536383536);
					((Class462) this).anInt5547 = (-362437113 * (-775231561 * ((Class462) this).anInt5547 & 0xffff));
				}
				if (class518.aBool5923)
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x200));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15080(((Class462) this).anInt5542 * -104209121, -869647360))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x80) * -547501175);
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15079(((Class462) this).anInt5542 * -104209121, 61802721))
					((Class462) this).anInt5543 = (-547501175 * (((Class462) this).anInt5543 * -1154737479 | 0x100));
				if (((Class462) this).aClass282_Sub50_Sub13_5545.method15081(-104209121 * ((Class462) this).anInt5542, -752356381))
					((Class462) this).anInt5543 = ((((Class462) this).anInt5543 * -1154737479 | 0x400) * -547501175);
				if (null != ((Class462) this).aClass282_Sub50_Sub13_5546) {
					if (((Class462) this).aClass282_Sub50_Sub13_5546.method15080(((Class462) this).anInt5547 * -775231561, -1141644232))
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

	Class462() {
		/* empty */
	}

	final void method7714() {
		((Class462) this).aBool5544 = false;
		((Class462) this).anInt5543 = 0;
		((Class462) this).aClass282_Sub50_Sub13_5546 = null;
		((Class462) this).aClass282_Sub50_Sub13_5545 = null;
	}

	static final void method7715(CS2Executor class527, int i) {
		int i_6_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 192651981 * client.aClass330Array7428[i_6_].anInt3862;
	}
}
