/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class421 {
	Class282_Sub50_Sub4[] aClass282_Sub50_Sub4Array5012;
	int anInt5013;
	Class317 aClass317_5014;
	static int anInt5015;

	public Class282_Sub50_Sub4 method7036(int i, int i_0_) {
		if (i < 0)
			return new Class282_Sub50_Sub4();
		return ((Class421) this).aClass282_Sub50_Sub4Array5012[i];
	}

	public Class421(Class486 class486, Class495 class495, Class317 class317, boolean bool) {
		((Class421) this).aClass317_5014 = class317;
		((Class421) this).anInt5013 = (((Class421) this).aClass317_5014.method5624(((Class120.aClass120_1473.anInt1521) * -71319279), 1779903880) * 268916055);
		if (bool) {
			((Class421) this).aClass282_Sub50_Sub4Array5012 = (new Class282_Sub50_Sub4[-1814796697 * ((Class421) this).anInt5013]);
			for (int i = 0; i < ((Class421) this).anInt5013 * -1814796697; i++) {
				byte[] is;
				synchronized (((Class421) this).aClass317_5014) {
					is = (((Class421) this).aClass317_5014.getFile(Class120.aClass120_1473.anInt1521 * -71319279, i, -1758012491));
				}
				Class282_Sub50_Sub4 class282_sub50_sub4 = new Class282_Sub50_Sub4();
				if (is != null)
					class282_sub50_sub4.method14748(new RsByteBuffer(is), (byte) 1);
				((Class421) this).aClass282_Sub50_Sub4Array5012[i] = class282_sub50_sub4;
			}
		}
	}

	public Class282_Sub50_Sub4 method7037(int i) {
		if (i < 0)
			return new Class282_Sub50_Sub4();
		return ((Class421) this).aClass282_Sub50_Sub4Array5012[i];
	}

	public Class282_Sub50_Sub4 method7038(int i) {
		if (i < 0)
			return new Class282_Sub50_Sub4();
		return ((Class421) this).aClass282_Sub50_Sub4Array5012[i];
	}

	static final void method7039(byte i) {
		Class328.aClass118Array3772 = null;
		Class211.method3629(client.anInt7349 * -1699899559, 0, 0, Class349.anInt4083 * -418109423, -969250379 * client.anInt3243, 0, 0, -1, -1848011733);
		if (null != Class328.aClass118Array3772) {
			if (i <= -1) {
				/* empty */
			}
			Class118[] class118s = Class328.aClass118Array3772;
			int i_1_ = -1412584499;
			int i_2_ = 0;
			int i_3_ = 0;
			int i_4_ = -418109423 * Class349.anInt4083;
			int i_5_ = client.anInt3243 * -969250379;
			int i_6_ = 1536123267 * Class400.anInt4822;
			int i_7_ = 71483785 * IsaacCipher.anInt5157;
			int i_8_;
			if (client.aClass118_7247 == Class221.aClass118_2763) {
				if (i <= -1) {
					for (;;) {
						/* empty */
					}
				}
				i_8_ = -1;
			} else
				i_8_ = client.aClass118_7247.anInt1449 * -1338917705;
			Class521_Sub1_Sub3_Sub2.method16094(class118s, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, true, (byte) 6);
			Class328.aClass118Array3772 = null;
		}
	}
}
