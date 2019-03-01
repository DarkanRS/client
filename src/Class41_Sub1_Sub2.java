public class Class41_Sub1_Sub2 extends Class41_Sub1 {

	public int anInt10142;
	public int anInt10152;
	public int anInt10153;
	public int anInt10155;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10145;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10154;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10144;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10143;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10139;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10140;
	Class115 aClass115_10151;
	Class115 aClass115_10141;
	public Matrix44Arr aClass384_10138 = new Matrix44Arr();
	public Matrix44Arr aClass384_10146 = new Matrix44Arr();
	float[] aFloatArray10148 = new float[4];
	float[] aFloatArray10150 = new float[4];
	Class49 aClass49_10147;
	float aFloat10149;

	boolean method14539() throws Exception_Sub2 {
		this.aClass282_Sub21_Sub1_10145 = this.aClass101_9218.method1691("WorldMatrix", (short) 13951);
		this.aClass282_Sub21_Sub1_10154 = this.aClass101_9218.method1691("WVPMatrix", (short) 7310);
		this.aClass282_Sub21_Sub1_10144 = this.aClass101_9218.method1691("UGenerationPlane", (short) 29108);
		this.aClass282_Sub21_Sub1_10143 = this.aClass101_9218.method1691("VGenerationPlane", (short) 19913);
		this.aClass282_Sub21_Sub1_10139 = this.aClass101_9218.method1691("Time", (short) 24696);
		this.aClass282_Sub21_Sub1_10140 = this.aClass101_9218.method1691("billowSampler3D", (short) 8729);
		if (this.aClass49_10147.aBool474) {
			this.aClass115_10141 = this.aClass101_9218.method1651("Waterfall3D", 535586513);
			this.aClass101_9218.method1655(this.aClass115_10141);
		} else {
			this.aClass115_10151 = this.aClass101_9218.method1651("Waterfall2D", 1580881070);
			this.aClass101_9218.method1655(this.aClass115_10151);
		}

		return true;
	}

	boolean method14524() throws Exception_Sub2 {
		this.aClass282_Sub21_Sub1_10145 = this.aClass101_9218.method1691("WorldMatrix", (short) 10413);
		this.aClass282_Sub21_Sub1_10154 = this.aClass101_9218.method1691("WVPMatrix", (short) 8248);
		this.aClass282_Sub21_Sub1_10144 = this.aClass101_9218.method1691("UGenerationPlane", (short) 13144);
		this.aClass282_Sub21_Sub1_10143 = this.aClass101_9218.method1691("VGenerationPlane", (short) 12992);
		this.aClass282_Sub21_Sub1_10139 = this.aClass101_9218.method1691("Time", (short) 18225);
		this.aClass282_Sub21_Sub1_10140 = this.aClass101_9218.method1691("billowSampler3D", (short) 13430);
		if (this.aClass49_10147.aBool474) {
			this.aClass115_10141 = this.aClass101_9218.method1651("Waterfall3D", 1467514072);
			this.aClass101_9218.method1655(this.aClass115_10141);
		} else {
			this.aClass115_10151 = this.aClass101_9218.method1651("Waterfall2D", -1808211852);
			this.aClass101_9218.method1655(this.aClass115_10151);
		}

		return true;
	}

	public void method15549(short s_1) {
		if (this.aClass49_10147.aBool474) {
			this.aClass101_9218.method1655(this.aClass115_10141);
		} else {
			this.aClass101_9218.method1655(this.aClass115_10151);
		}

		this.aClass101_9218.method1646();
		if (this.aClass49_10147.aBool474) {
			this.aClass101_9218.method1671(this.aClass282_Sub21_Sub1_10140, 0, this.aClass49_10147.anInterface1_479, (byte) 0);
		}

		this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_10145, this.aClass384_10146, (byte) -98);
		this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_10154, this.aClass384_10138, (byte) -57);
		this.aClass101_9218.method1689(this.aClass282_Sub21_Sub1_10144, new Vector4(this.aFloatArray10148[0], this.aFloatArray10148[1], this.aFloatArray10148[2], this.aFloatArray10148[3]), 1522147633);
		this.aClass101_9218.method1689(this.aClass282_Sub21_Sub1_10143, new Vector4(this.aFloatArray10150[0], this.aFloatArray10150[1], this.aFloatArray10150[2], this.aFloatArray10150[3]), 1537911160);
		this.aClass101_9218.method1689(this.aClass282_Sub21_Sub1_10139, new Vector4(this.aFloat10149, 0.0F, 0.0F, 0.0F), 1904707370);
		this.aClass505_Sub2_413.method14002(Class352.aClass352_4098, this.anInt10152, this.anInt10153, this.anInt10142, this.anInt10155);
	}

	public Class41_Sub1_Sub2(Class505_Sub2 class505_sub2_1, Class49 class49_2) throws Exception_Sub2 {
		super(class505_sub2_1);
		this.aClass49_10147 = class49_2;
		if (this.aClass49_10147.method975() && class505_sub2_1.method13887()) {
			this.method14523("Waterfall");
		}

	}

	boolean method14541() throws Exception_Sub2 {
		this.aClass282_Sub21_Sub1_10145 = this.aClass101_9218.method1691("WorldMatrix", (short) 26752);
		this.aClass282_Sub21_Sub1_10154 = this.aClass101_9218.method1691("WVPMatrix", (short) 11996);
		this.aClass282_Sub21_Sub1_10144 = this.aClass101_9218.method1691("UGenerationPlane", (short) 30485);
		this.aClass282_Sub21_Sub1_10143 = this.aClass101_9218.method1691("VGenerationPlane", (short) 19570);
		this.aClass282_Sub21_Sub1_10139 = this.aClass101_9218.method1691("Time", (short) 19497);
		this.aClass282_Sub21_Sub1_10140 = this.aClass101_9218.method1691("billowSampler3D", (short) 27239);
		if (this.aClass49_10147.aBool474) {
			this.aClass115_10141 = this.aClass101_9218.method1651("Waterfall3D", -501563722);
			this.aClass101_9218.method1655(this.aClass115_10141);
		} else {
			this.aClass115_10151 = this.aClass101_9218.method1651("Waterfall2D", -1716701856);
			this.aClass101_9218.method1655(this.aClass115_10151);
		}

		return true;
	}

	public void method15550(int i_1, int i_2, int i_3) {
		float f_4 = (float) ((i_1 & 0x3) + 1) * -5.0E-4F;
		float f_5 = (float) ((i_1 >> 3 & 0x3) + 1) * 5.0E-4F;
		float f_6 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_7 = (i_1 & 0x80) != 0;
		if (bool_7) {
			this.aFloatArray10148[0] = f_6;
			this.aFloatArray10148[1] = 0.0F;
			this.aFloatArray10148[2] = 0.0F;
			this.aFloatArray10148[3] = 0.0F;
		} else {
			this.aFloatArray10148[0] = 0.0F;
			this.aFloatArray10148[1] = 0.0F;
			this.aFloatArray10148[2] = f_6;
			this.aFloatArray10148[3] = 0.0F;
		}

		this.aFloatArray10150[0] = 0.0F;
		this.aFloatArray10150[1] = f_6;
		this.aFloatArray10150[2] = 0.0F;
		this.aFloatArray10150[3] = (float) this.aClass505_Sub2_413.anInt8820 * f_4 % 1.0F;
		if (!this.aClass49_10147.aBool474) {
			int i_8 = (int) (f_5 * (float) this.aClass505_Sub2_413.anInt8820 * 16.0F);
			this.aClass505_Sub2_413.method14035(this.aClass49_10147.anInterface6Array478[i_8 % 16]);
		} else {
			this.aFloat10149 = (float) ((double) this.aClass505_Sub2_413.anInt8820 * (double) f_5 % 1.0D);
		}

	}

	static final void method15551(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub28_8212.method7785(i_2, -1918950659);
	}

}
