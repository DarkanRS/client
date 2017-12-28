/* Class41_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41_Sub1_Sub2 extends Class41_Sub1 {
	public Class384 aClass384_10138 = new Class384();
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10139;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10140;
	Class115 aClass115_10141;
	public int anInt10142;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10143;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10144;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10145;
	public Class384 aClass384_10146 = new Class384();
	Class49 aClass49_10147;
	float[] aFloatArray10148 = new float[4];
	float aFloat10149;
	float[] aFloatArray10150 = new float[4];
	Class115 aClass115_10151;
	public int anInt10152;
	public int anInt10153;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10154;
	public int anInt10155;

	boolean method14539() throws Exception_Sub2 {
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10145 = aClass101_9218.method1691("WorldMatrix", (short) 13951);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10154 = aClass101_9218.method1691("WVPMatrix", (short) 7310);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10144 = aClass101_9218.method1691("UGenerationPlane", (short) 29108);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10143 = aClass101_9218.method1691("VGenerationPlane", (short) 19913);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10139 = aClass101_9218.method1691("Time", (short) 24696);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10140 = aClass101_9218.method1691("billowSampler3D", (short) 8729);
		if (((Class41_Sub1_Sub2) this).aClass49_10147.aBool474) {
			((Class41_Sub1_Sub2) this).aClass115_10141 = aClass101_9218.method1651("Waterfall3D", 535586513);
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10141);
		} else {
			((Class41_Sub1_Sub2) this).aClass115_10151 = aClass101_9218.method1651("Waterfall2D", 1580881070);
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10151);
		}
		return true;
	}

	boolean method14524() throws Exception_Sub2 {
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10145 = aClass101_9218.method1691("WorldMatrix", (short) 10413);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10154 = aClass101_9218.method1691("WVPMatrix", (short) 8248);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10144 = aClass101_9218.method1691("UGenerationPlane", (short) 13144);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10143 = aClass101_9218.method1691("VGenerationPlane", (short) 12992);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10139 = aClass101_9218.method1691("Time", (short) 18225);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10140 = aClass101_9218.method1691("billowSampler3D", (short) 13430);
		if (((Class41_Sub1_Sub2) this).aClass49_10147.aBool474) {
			((Class41_Sub1_Sub2) this).aClass115_10141 = aClass101_9218.method1651("Waterfall3D", 1467514072);
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10141);
		} else {
			((Class41_Sub1_Sub2) this).aClass115_10151 = aClass101_9218.method1651("Waterfall2D", -1808211852);
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10151);
		}
		return true;
	}

	public void method15548(int i, int i_0_) {
		float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
		float f_1_ = (float) (1 + (i >> 3 & 0x3)) * 5.0E-4F;
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			((Class41_Sub1_Sub2) this).aFloatArray10148[0] = f_2_;
			((Class41_Sub1_Sub2) this).aFloatArray10148[1] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[2] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[3] = 0.0F;
		} else {
			((Class41_Sub1_Sub2) this).aFloatArray10148[0] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[1] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[2] = f_2_;
			((Class41_Sub1_Sub2) this).aFloatArray10148[3] = 0.0F;
		}
		((Class41_Sub1_Sub2) this).aFloatArray10150[0] = 0.0F;
		((Class41_Sub1_Sub2) this).aFloatArray10150[1] = f_2_;
		((Class41_Sub1_Sub2) this).aFloatArray10150[2] = 0.0F;
		((Class41_Sub1_Sub2) this).aFloatArray10150[3] = (float) aClass505_Sub2_413.anInt8820 * f % 1.0F;
		if (!((Class41_Sub1_Sub2) this).aClass49_10147.aBool474) {
			int i_3_ = (int) (f_1_ * (float) aClass505_Sub2_413.anInt8820 * 16.0F);
			aClass505_Sub2_413.method14035(((Class41_Sub1_Sub2) this).aClass49_10147.anInterface6Array478[i_3_ % 16]);
		} else
			((Class41_Sub1_Sub2) this).aFloat10149 = (float) ((double) aClass505_Sub2_413.anInt8820 * (double) f_1_ % 1.0);
	}

	public void method15549(short i) {
		if (((Class41_Sub1_Sub2) this).aClass49_10147.aBool474)
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10141);
		else
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10151);
		aClass101_9218.method1646();
		if (((Class41_Sub1_Sub2) this).aClass49_10147.aBool474)
			aClass101_9218.method1671((((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10140), 0, (((Class41_Sub1_Sub2) this).aClass49_10147.anInterface1_479), (byte) 0);
		aClass101_9218.method1668((((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10145), aClass384_10146, (byte) -98);
		aClass101_9218.method1668((((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10154), aClass384_10138, (byte) -57);
		aClass101_9218.method1689(((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10144, new Class303(((Class41_Sub1_Sub2) this).aFloatArray10148[0], ((Class41_Sub1_Sub2) this).aFloatArray10148[1], ((Class41_Sub1_Sub2) this).aFloatArray10148[2], ((Class41_Sub1_Sub2) this).aFloatArray10148[3]), 1522147633);
		aClass101_9218.method1689(((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10143, new Class303(((Class41_Sub1_Sub2) this).aFloatArray10150[0], ((Class41_Sub1_Sub2) this).aFloatArray10150[1], ((Class41_Sub1_Sub2) this).aFloatArray10150[2], ((Class41_Sub1_Sub2) this).aFloatArray10150[3]), 1537911160);
		aClass101_9218.method1689((((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10139), new Class303((((Class41_Sub1_Sub2) this).aFloat10149), 0.0F, 0.0F, 0.0F), 1904707370);
		aClass505_Sub2_413.method14002(Class352.aClass352_4098, anInt10152 * 2132515209, anInt10153 * -1213533977, 433051785 * anInt10142, anInt10155 * 25583391);
	}

	public Class41_Sub1_Sub2(Class505_Sub2 class505_sub2, Class49 class49) throws Exception_Sub2 {
		super(class505_sub2);
		((Class41_Sub1_Sub2) this).aClass49_10147 = class49;
		if (((Class41_Sub1_Sub2) this).aClass49_10147.method975() && class505_sub2.method13887())
			method14523("Waterfall");
	}

	boolean method14541() throws Exception_Sub2 {
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10145 = aClass101_9218.method1691("WorldMatrix", (short) 26752);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10154 = aClass101_9218.method1691("WVPMatrix", (short) 11996);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10144 = aClass101_9218.method1691("UGenerationPlane", (short) 30485);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10143 = aClass101_9218.method1691("VGenerationPlane", (short) 19570);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10139 = aClass101_9218.method1691("Time", (short) 19497);
		((Class41_Sub1_Sub2) this).aClass282_Sub21_Sub1_10140 = aClass101_9218.method1691("billowSampler3D", (short) 27239);
		if (((Class41_Sub1_Sub2) this).aClass49_10147.aBool474) {
			((Class41_Sub1_Sub2) this).aClass115_10141 = aClass101_9218.method1651("Waterfall3D", -501563722);
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10141);
		} else {
			((Class41_Sub1_Sub2) this).aClass115_10151 = aClass101_9218.method1651("Waterfall2D", -1716701856);
			aClass101_9218.method1655(((Class41_Sub1_Sub2) this).aClass115_10151);
		}
		return true;
	}

	public void method15550(int i, int i_4_, int i_5_) {
		float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
		float f_6_ = (float) (1 + (i >> 3 & 0x3)) * 5.0E-4F;
		float f_7_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			((Class41_Sub1_Sub2) this).aFloatArray10148[0] = f_7_;
			((Class41_Sub1_Sub2) this).aFloatArray10148[1] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[2] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[3] = 0.0F;
		} else {
			((Class41_Sub1_Sub2) this).aFloatArray10148[0] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[1] = 0.0F;
			((Class41_Sub1_Sub2) this).aFloatArray10148[2] = f_7_;
			((Class41_Sub1_Sub2) this).aFloatArray10148[3] = 0.0F;
		}
		((Class41_Sub1_Sub2) this).aFloatArray10150[0] = 0.0F;
		((Class41_Sub1_Sub2) this).aFloatArray10150[1] = f_7_;
		((Class41_Sub1_Sub2) this).aFloatArray10150[2] = 0.0F;
		((Class41_Sub1_Sub2) this).aFloatArray10150[3] = (float) aClass505_Sub2_413.anInt8820 * f % 1.0F;
		if (!((Class41_Sub1_Sub2) this).aClass49_10147.aBool474) {
			int i_8_ = (int) (f_6_ * (float) aClass505_Sub2_413.anInt8820 * 16.0F);
			aClass505_Sub2_413.method14035(((Class41_Sub1_Sub2) this).aClass49_10147.anInterface6Array478[i_8_ % 16]);
		} else
			((Class41_Sub1_Sub2) this).aFloat10149 = (float) ((double) aClass505_Sub2_413.anInt8820 * (double) f_6_ % 1.0);
	}

	static final void method15551(Class527 class527, int i) {
		int i_9_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method7785(i_9_, -1918950659);
	}
}
