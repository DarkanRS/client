/* Class161_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161_Sub1_Sub1 extends Class161_Sub1 {
	Class110 aClass110_9118;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9119;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9120;
	public Matrix4f aClass233_9121;
	Class159 aClass159_9122;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9123;
	public Matrix4f aClass233_9124 = new Matrix4f();
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9125;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9126;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9127;
	float[] aFloatArray9128;
	float[] aFloatArray9129;
	Class110 aClass110_9130;
	float aFloat9131;
	public int anInt9132;
	public int anInt9133;
	public int anInt9134;
	public int anInt9135;

	public void method1738(int i, int i_0_, byte i_1_) {
		try {
			float f = -5.0E-4F * (float) (1 + (i & 0x3));
			float f_2_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
			float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
			boolean bool = (i & 0x80) != 0;
			if (bool) {
				((Class161_Sub1_Sub1) this).aFloatArray9128[0] = f_3_;
				((Class161_Sub1_Sub1) this).aFloatArray9128[1] = 0.0F;
				((Class161_Sub1_Sub1) this).aFloatArray9128[2] = 0.0F;
				((Class161_Sub1_Sub1) this).aFloatArray9128[3] = 0.0F;
			} else {
				((Class161_Sub1_Sub1) this).aFloatArray9128[0] = 0.0F;
				((Class161_Sub1_Sub1) this).aFloatArray9128[1] = 0.0F;
				((Class161_Sub1_Sub1) this).aFloatArray9128[2] = f_3_;
				((Class161_Sub1_Sub1) this).aFloatArray9128[3] = 0.0F;
			}
			((Class161_Sub1_Sub1) this).aFloatArray9129[0] = 0.0F;
			((Class161_Sub1_Sub1) this).aFloatArray9129[1] = f_3_;
			((Class161_Sub1_Sub1) this).aFloatArray9129[2] = 0.0F;
			((Class161_Sub1_Sub1) this).aFloatArray9129[3] = f * (float) aClass_ra_Sub3_1648.anInt8342 % 1.0F;
			if (!((Class161_Sub1_Sub1) this).aClass159_9122.aBoolean1621) {
				int i_4_ = (int) ((float) aClass_ra_Sub3_1648.anInt8342 * f_2_ * 16.0F);
				aClass_ra_Sub3_1648.method5358(((Class161_Sub1_Sub1) this).aClass159_9122.anInterface9_Impl2Array1624[i_4_ % 16]);
			} else
				((Class161_Sub1_Sub1) this).aFloat9131 = (float) ((double) f_2_ * (double) aClass_ra_Sub3_1648.anInt8342 % 1.0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afj.ac(").append(')').toString());
		}
	}

	boolean method1736() throws Exception_Sub2 {
		((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9125 = aClass123_7033.method1360("WorldMatrix", -867744099);
		((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9123 = aClass123_7033.method1360("WVPMatrix", -250672432);
		((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9127 = aClass123_7033.method1360("UGenerationPlane", -1602523427);
		((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9126 = aClass123_7033.method1360("VGenerationPlane", 1186138394);
		((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9119 = aClass123_7033.method1360("Time", -2093315319);
		((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9120 = aClass123_7033.method1360("billowSampler3D", -1560961563);
		if (((Class161_Sub1_Sub1) this).aClass159_9122.aBoolean1621) {
			((Class161_Sub1_Sub1) this).aClass110_9130 = aClass123_7033.method1327("Waterfall3D", (byte) 0);
			aClass123_7033.method1331(((Class161_Sub1_Sub1) this).aClass110_9130);
		} else {
			((Class161_Sub1_Sub1) this).aClass110_9118 = aClass123_7033.method1327("Waterfall2D", (byte) -112);
			aClass123_7033.method1331(((Class161_Sub1_Sub1) this).aClass110_9118);
		}
		return true;
	}

	public void method1739(int i) {
		try {
			if (((Class161_Sub1_Sub1) this).aClass159_9122.aBoolean1621)
				aClass123_7033.method1331(((Class161_Sub1_Sub1) this).aClass110_9130);
			else
				aClass123_7033.method1331(((Class161_Sub1_Sub1) this).aClass110_9118);
			aClass123_7033.method1340();
			if (((Class161_Sub1_Sub1) this).aClass159_9122.aBoolean1621)
				aClass123_7033.method1341((((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9120), 0, (((Class161_Sub1_Sub1) this).aClass159_9122.anInterface9_Impl3_1625), -1892543284);
			aClass123_7033.method1368((((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9125), aClass233_9121, 600012267);
			aClass123_7033.method1368((((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9123), aClass233_9124, 600012267);
			aClass123_7033.method1339(((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9127, new Class232(((Class161_Sub1_Sub1) this).aFloatArray9128[0], ((Class161_Sub1_Sub1) this).aFloatArray9128[1], ((Class161_Sub1_Sub1) this).aFloatArray9128[2], ((Class161_Sub1_Sub1) this).aFloatArray9128[3]), 1385384483);
			aClass123_7033.method1339(((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9126, new Class232(((Class161_Sub1_Sub1) this).aFloatArray9129[0], ((Class161_Sub1_Sub1) this).aFloatArray9129[1], ((Class161_Sub1_Sub1) this).aFloatArray9129[2], ((Class161_Sub1_Sub1) this).aFloatArray9129[3]), 560835049);
			aClass123_7033.method1339((((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9119), new Class232((((Class161_Sub1_Sub1) this).aFloat9131), 0.0F, 0.0F, 0.0F), -247168453);
			aClass_ra_Sub3_1648.method5392(Class187.aClass187_1907, anInt9132 * 540763355, anInt9133 * -754699637, anInt9134 * -863719041, anInt9135 * 507848871);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afj.am(").append(')').toString());
		}
	}

	public Class161_Sub1_Sub1(Class_ra_Sub3 class_ra_sub3, Class159 class159) throws Exception_Sub2 {
		super(class_ra_sub3);
		aClass233_9121 = new Matrix4f();
		((Class161_Sub1_Sub1) this).aFloatArray9128 = new float[4];
		((Class161_Sub1_Sub1) this).aFloatArray9129 = new float[4];
		((Class161_Sub1_Sub1) this).aClass159_9122 = class159;
		if (((Class161_Sub1_Sub1) this).aClass159_9122.method1704() && class_ra_sub3.method5295())
			method1725("Waterfall");
	}

	boolean method1726() throws Exception_Sub2 {
		try {
			((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9125 = aClass123_7033.method1360("WorldMatrix", -2088418999);
			((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9123 = aClass123_7033.method1360("WVPMatrix", -363138804);
			((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9127 = aClass123_7033.method1360("UGenerationPlane", 1661649711);
			((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9126 = aClass123_7033.method1360("VGenerationPlane", 2031421483);
			((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9119 = aClass123_7033.method1360("Time", 293420542);
			((Class161_Sub1_Sub1) this).aClass298_Sub31_Sub1_9120 = aClass123_7033.method1360("billowSampler3D", 2054271289);
			if (((Class161_Sub1_Sub1) this).aClass159_9122.aBoolean1621) {
				((Class161_Sub1_Sub1) this).aClass110_9130 = aClass123_7033.method1327("Waterfall3D", (byte) -79);
				aClass123_7033.method1331(((Class161_Sub1_Sub1) this).aClass110_9130);
			} else {
				((Class161_Sub1_Sub1) this).aClass110_9118 = aClass123_7033.method1327("Waterfall2D", (byte) -52);
				aClass123_7033.method1331(((Class161_Sub1_Sub1) this).aClass110_9118);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afj.e(").append(')').toString());
		}
	}

	static Class82 method1740(RsByteBuffer class298_sub53, byte i) {
		try {
			int i_5_ = class298_sub53.readUnsignedByte();
			Class516 class516 = Class255.method2436(i_5_, -707576455);
			Class82 class82 = null;
			switch (class516.anInt6266 * -1646556509) {
			case 30:
				class82 = new Class82_Sub16(class298_sub53);
				break;
			case 28:
				class82 = new Class82_Sub5(class298_sub53);
				break;
			case 11:
				class82 = new Class82_Sub8(class298_sub53, false);
				break;
			case 1:
				class82 = new Class82_Sub7(class298_sub53);
				break;
			case 23:
				class82 = new Class82_Sub23(class298_sub53);
				break;
			case 21:
				class82 = new Class82_Sub22(class298_sub53, 0, 1);
				break;
			case 16:
				class82 = new Class82_Sub13(class298_sub53);
				break;
			case 26:
				class82 = new Class82_Sub19_Sub2(class298_sub53);
				break;
			case 9:
				class82 = new Class82_Sub14(class298_sub53);
				break;
			case 12:
				class82 = new Class82_Sub6(class298_sub53);
				break;
			case 8:
				class82 = new Class82_Sub22(class298_sub53, 1, 0);
				break;
			case 2:
				class82 = new Class82_Sub12(class298_sub53);
				break;
			case 6:
				class82 = new Class82_Sub2(class298_sub53);
				break;
			case 14:
				class82 = new Class82_Sub22(class298_sub53, 0, 0);
				break;
			case 4:
				class82 = new Class82_Sub20(class298_sub53);
				break;
			case 17:
				class82 = new Class82_Sub15(class298_sub53);
				break;
			case 10:
				class82 = new Class82_Sub3(class298_sub53);
				break;
			case 20:
				class82 = new Class82_Sub18(class298_sub53);
				break;
			case 13:
				class82 = new Class82_Sub22(class298_sub53, 1, 1);
				break;
			case 25:
				class82 = new Class82_Sub21(class298_sub53);
				break;
			case 22:
				class82 = new Class82_Sub9(class298_sub53);
				break;
			case 29:
				class82 = new Class82_Sub17(class298_sub53);
				break;
			case 3:
				class82 = new Class82_Sub4(class298_sub53);
				break;
			case 5:
				class82 = new Class82_Sub8(class298_sub53, true);
				break;
			case 24:
				class82 = new Class82_Sub10(class298_sub53);
				break;
			case 19:
				class82 = new Class82_Sub1(class298_sub53);
				break;
			default:
				break;
			case 15:
				class82 = new Class82_Sub11(class298_sub53);
				break;
			case 27:
				class82 = new Class82_Sub19_Sub1(class298_sub53);
			}
			return class82;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afj.a(").append(')').toString());
		}
	}
}
