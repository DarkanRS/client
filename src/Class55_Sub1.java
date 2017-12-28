/* Class55_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55_Sub1 extends Class55 {
	Class115 aClass115_9182;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9183;
	public static float aFloat9184;
	Class115 aClass115_9185;
	public static float aFloat9186;
	Class101 aClass101_9187;
	public static float aFloat9188;
	public static float aFloat9189 = 0.25F;
	Class115 aClass115_9190;
	Class115 aClass115_9191;
	Class115 aClass115_9192;
	static final int anInt9193 = 256;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9194;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9195;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9196;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9197;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9198;
	boolean aBool9199;

	void method1133(int i, int i_0_) {
		/* empty */
	}

	void method1104(int i) {
		((Class55_Sub1) this).aClass101_9187.method1647();
	}

	boolean method1098() {
		return ((Class55_Sub1) this).aBool9199;
	}

	static {
		aFloat9184 = 1.0F;
		aFloat9188 = 1.0F;
		aFloat9186 = 1.0F;
	}

	void method1102(int i, int i_1_) {
		/* empty */
	}

	void method1110() {
		/* empty */
	}

	int method1100() {
		return 4;
	}

	void method1103(int i, Class158_Sub1 class158_sub1, Interface6 interface6, Interface8 interface8, Interface6 interface6_2_) {
		float f = aClass505_Sub2_514.method13905();
		float f_3_ = (float) class158_sub1.method2714();
		float f_4_ = (float) class158_sub1.method2716();
		Interface6 interface6_5_ = interface6;
		float[] fs = { -1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F };
		int i_6_ = (int) f_3_;
		int i_7_ = (int) f_4_;
		int i_8_ = i_6_;
		int i_9_ = i_7_;
		if (i == 0) {
			i_6_ = 256;
			i_7_ = 256;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9185);
			((Class55_Sub1) this).aClass101_9187.method1646();
		} else if (i == 1) {
			i_6_ = 256;
			i_7_ = 256;
			i_8_ = i_6_;
			i_9_ = i_7_;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9190);
			((Class55_Sub1) this).aClass101_9187.method1646();
			((Class55_Sub1) this).aClass101_9187.method1658(((Class55_Sub1) this).aClass282_Sub21_Sub1_9196, aFloat9186 / f_3_, 0.0F, -1376055691);
		} else if (i == 2) {
			i_6_ = 256;
			i_7_ = 256;
			i_8_ = i_6_;
			i_9_ = i_7_;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9190);
			((Class55_Sub1) this).aClass101_9187.method1646();
			((Class55_Sub1) this).aClass101_9187.method1658(((Class55_Sub1) this).aClass282_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_4_, -1647399007);
		} else if (i == 3) {
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9191);
			interface6_5_ = interface6_2_;
			((Class55_Sub1) this).aClass101_9187.method1671(((Class55_Sub1) this).aClass282_Sub21_Sub1_9197, 1, interface6, (byte) 0);
			((Class55_Sub1) this).aClass101_9187.method1646();
		}
		float f_10_ = (float) i_6_ / f_3_;
		float f_11_ = (float) i_7_ / f_4_;
		float f_12_ = (float) i_8_ / f_3_;
		float f_13_ = (float) i_9_ / f_4_;
		fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
		fs[10] *= f_12_;
		fs[7] *= f_13_;
		((Class55_Sub1) this).aClass101_9187.method1688(((Class55_Sub1) this).aClass282_Sub21_Sub1_9198, fs, 1193588147);
		((Class55_Sub1) this).aClass101_9187.method1671(((Class55_Sub1) this).aClass282_Sub21_Sub1_9194, 0, interface6_5_, (byte) 0);
		((Class55_Sub1) this).aClass101_9187.method1662(((Class55_Sub1) this).aClass282_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F, (byte) -70);
		((Class55_Sub1) this).aClass101_9187.method1662(((Class55_Sub1) this).aClass282_Sub21_Sub1_9183, f / f_3_, f / f_4_, 256.0F / f_3_, 256.0F / f_4_, (byte) -98);
		aClass505_Sub2_514.method8617(0, 0, i_6_, i_7_);
		aClass505_Sub2_514.r(0, 0, i_6_, i_7_);
	}

	public Class55_Sub1(Class505_Sub2 class505_sub2) {
		super(class505_sub2);
	}

	int method1106() {
		return 1;
	}

	int method1123() {
		return 4;
	}

	boolean method1128() {
		return ((Class55_Sub1) this).aBool9199;
	}

	int method1114() {
		return 4;
	}

	boolean method1111() {
		return ((Class55_Sub1) this).aBool9199;
	}

	boolean method1125() {
		return ((Class55_Sub1) this).aBool9199;
	}

	boolean method14517() {
		return (aClass505_Sub2_514.aBool8718 && aClass505_Sub2_514.method13888());
	}

	boolean method1101() {
		if (method14517()) {
			((Class55_Sub1) this).aClass101_9187 = aClass505_Sub2_514.method13890("FilterBloom");
			if (((Class55_Sub1) this).aClass101_9187 == null)
				return false;
			try {
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9194 = ((Class55_Sub1) this).aClass101_9187.method1691("sceneTex", (short) 5629);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9197 = ((Class55_Sub1) this).aClass101_9187.method1691("bloomTex1", (short) 16551);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9195 = ((Class55_Sub1) this).aClass101_9187.method1691("params", (short) 5315);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9196 = ((Class55_Sub1) this).aClass101_9187.method1691("sampleSize", (short) 10054);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9183 = (((Class55_Sub1) this).aClass101_9187.method1691("pixelOffsetAndBloomScale", (short) 23779));
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9198 = ((Class55_Sub1) this).aClass101_9187.method1691("PosAndTexCoords", (short) 12594);
				((Class55_Sub1) this).aClass101_9187.method1651("test", 2057720732);
				((Class55_Sub1) this).aClass115_9182 = ((Class55_Sub1) this).aClass101_9187.method1651("techFullscreenTri", 23893671);
				((Class55_Sub1) this).aClass115_9185 = ((Class55_Sub1) this).aClass101_9187.method1651("brightpass", -416906059);
				((Class55_Sub1) this).aClass115_9190 = ((Class55_Sub1) this).aClass101_9187.method1651("blur", 925585453);
				((Class55_Sub1) this).aClass115_9191 = ((Class55_Sub1) this).aClass101_9187.method1651("composite", 1412845557);
				((Class55_Sub1) this).aClass115_9192 = ((Class55_Sub1) this).aClass101_9187.method1651("techDefault", -960899187);
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			}
			if (!((Class55_Sub1) this).aClass115_9182.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9185.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9190.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9191.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9192.method1899())
				return false;
			((Class55_Sub1) this).aBool9199 = true;
			return true;
		}
		return false;
	}

	int method1116() {
		return 4;
	}

	void method1112() {
		/* empty */
	}

	void method1124() {
		/* empty */
	}

	void method1109(int i, Class158_Sub1 class158_sub1, Interface6 interface6, Interface8 interface8, Interface6 interface6_14_) {
		float f = aClass505_Sub2_514.method13905();
		float f_15_ = (float) class158_sub1.method2714();
		float f_16_ = (float) class158_sub1.method2716();
		Interface6 interface6_17_ = interface6;
		float[] fs = { -1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F };
		int i_18_ = (int) f_15_;
		int i_19_ = (int) f_16_;
		int i_20_ = i_18_;
		int i_21_ = i_19_;
		if (i == 0) {
			i_18_ = 256;
			i_19_ = 256;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9185);
			((Class55_Sub1) this).aClass101_9187.method1646();
		} else if (i == 1) {
			i_18_ = 256;
			i_19_ = 256;
			i_20_ = i_18_;
			i_21_ = i_19_;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9190);
			((Class55_Sub1) this).aClass101_9187.method1646();
			((Class55_Sub1) this).aClass101_9187.method1658(((Class55_Sub1) this).aClass282_Sub21_Sub1_9196, aFloat9186 / f_15_, 0.0F, -1986573669);
		} else if (i == 2) {
			i_18_ = 256;
			i_19_ = 256;
			i_20_ = i_18_;
			i_21_ = i_19_;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9190);
			((Class55_Sub1) this).aClass101_9187.method1646();
			((Class55_Sub1) this).aClass101_9187.method1658(((Class55_Sub1) this).aClass282_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_16_, -1759245436);
		} else if (i == 3) {
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9191);
			interface6_17_ = interface6_14_;
			((Class55_Sub1) this).aClass101_9187.method1671(((Class55_Sub1) this).aClass282_Sub21_Sub1_9197, 1, interface6, (byte) 0);
			((Class55_Sub1) this).aClass101_9187.method1646();
		}
		float f_22_ = (float) i_18_ / f_15_;
		float f_23_ = (float) i_19_ / f_16_;
		float f_24_ = (float) i_20_ / f_15_;
		float f_25_ = (float) i_21_ / f_16_;
		fs[8] = (fs[8] + 1.0F) * f_22_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_23_ + 1.0F;
		fs[10] *= f_24_;
		fs[7] *= f_25_;
		((Class55_Sub1) this).aClass101_9187.method1688(((Class55_Sub1) this).aClass282_Sub21_Sub1_9198, fs, 749671414);
		((Class55_Sub1) this).aClass101_9187.method1671(((Class55_Sub1) this).aClass282_Sub21_Sub1_9194, 0, interface6_17_, (byte) 0);
		((Class55_Sub1) this).aClass101_9187.method1662(((Class55_Sub1) this).aClass282_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F, (byte) -3);
		((Class55_Sub1) this).aClass101_9187.method1662(((Class55_Sub1) this).aClass282_Sub21_Sub1_9183, f / f_15_, f / f_16_, 256.0F / f_15_, 256.0F / f_16_, (byte) -95);
		aClass505_Sub2_514.method8617(0, 0, i_18_, i_19_);
		aClass505_Sub2_514.r(0, 0, i_18_, i_19_);
	}

	void method1119(int i, Class158_Sub1 class158_sub1, Interface6 interface6, Interface8 interface8, Interface6 interface6_26_) {
		float f = aClass505_Sub2_514.method13905();
		float f_27_ = (float) class158_sub1.method2714();
		float f_28_ = (float) class158_sub1.method2716();
		Interface6 interface6_29_ = interface6;
		float[] fs = { -1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F };
		int i_30_ = (int) f_27_;
		int i_31_ = (int) f_28_;
		int i_32_ = i_30_;
		int i_33_ = i_31_;
		if (i == 0) {
			i_30_ = 256;
			i_31_ = 256;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9185);
			((Class55_Sub1) this).aClass101_9187.method1646();
		} else if (i == 1) {
			i_30_ = 256;
			i_31_ = 256;
			i_32_ = i_30_;
			i_33_ = i_31_;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9190);
			((Class55_Sub1) this).aClass101_9187.method1646();
			((Class55_Sub1) this).aClass101_9187.method1658(((Class55_Sub1) this).aClass282_Sub21_Sub1_9196, aFloat9186 / f_27_, 0.0F, -2043454425);
		} else if (i == 2) {
			i_30_ = 256;
			i_31_ = 256;
			i_32_ = i_30_;
			i_33_ = i_31_;
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9190);
			((Class55_Sub1) this).aClass101_9187.method1646();
			((Class55_Sub1) this).aClass101_9187.method1658(((Class55_Sub1) this).aClass282_Sub21_Sub1_9196, 0.0F, aFloat9186 / f_28_, -1553465871);
		} else if (i == 3) {
			((Class55_Sub1) this).aClass101_9187.method1655(((Class55_Sub1) this).aClass115_9191);
			interface6_29_ = interface6_26_;
			((Class55_Sub1) this).aClass101_9187.method1671(((Class55_Sub1) this).aClass282_Sub21_Sub1_9197, 1, interface6, (byte) 0);
			((Class55_Sub1) this).aClass101_9187.method1646();
		}
		float f_34_ = (float) i_30_ / f_27_;
		float f_35_ = (float) i_31_ / f_28_;
		float f_36_ = (float) i_32_ / f_27_;
		float f_37_ = (float) i_33_ / f_28_;
		fs[8] = (fs[8] + 1.0F) * f_34_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_35_ + 1.0F;
		fs[10] *= f_36_;
		fs[7] *= f_37_;
		((Class55_Sub1) this).aClass101_9187.method1688(((Class55_Sub1) this).aClass282_Sub21_Sub1_9198, fs, 92267019);
		((Class55_Sub1) this).aClass101_9187.method1671(((Class55_Sub1) this).aClass282_Sub21_Sub1_9194, 0, interface6_29_, (byte) 0);
		((Class55_Sub1) this).aClass101_9187.method1662(((Class55_Sub1) this).aClass282_Sub21_Sub1_9195, aFloat9188, aFloat9189, aFloat9184, 0.0F, (byte) -2);
		((Class55_Sub1) this).aClass101_9187.method1662(((Class55_Sub1) this).aClass282_Sub21_Sub1_9183, f / f_27_, f / f_28_, 256.0F / f_27_, 256.0F / f_28_, (byte) -95);
		aClass505_Sub2_514.method8617(0, 0, i_30_, i_31_);
		aClass505_Sub2_514.r(0, 0, i_30_, i_31_);
	}

	void method1120(int i) {
		((Class55_Sub1) this).aClass101_9187.method1647();
	}

	int method1121() {
		return 4;
	}

	int method1126() {
		return 4;
	}

	void method1115() {
		/* empty */
	}

	boolean method1113() {
		if (method14517()) {
			((Class55_Sub1) this).aClass101_9187 = aClass505_Sub2_514.method13890("FilterBloom");
			if (((Class55_Sub1) this).aClass101_9187 == null)
				return false;
			try {
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9194 = ((Class55_Sub1) this).aClass101_9187.method1691("sceneTex", (short) 24156);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9197 = ((Class55_Sub1) this).aClass101_9187.method1691("bloomTex1", (short) 28551);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9195 = ((Class55_Sub1) this).aClass101_9187.method1691("params", (short) 31009);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9196 = ((Class55_Sub1) this).aClass101_9187.method1691("sampleSize", (short) 25220);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9183 = (((Class55_Sub1) this).aClass101_9187.method1691("pixelOffsetAndBloomScale", (short) 17358));
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9198 = ((Class55_Sub1) this).aClass101_9187.method1691("PosAndTexCoords", (short) 31197);
				((Class55_Sub1) this).aClass101_9187.method1651("test", 14547040);
				((Class55_Sub1) this).aClass115_9182 = ((Class55_Sub1) this).aClass101_9187.method1651("techFullscreenTri", -65124239);
				((Class55_Sub1) this).aClass115_9185 = ((Class55_Sub1) this).aClass101_9187.method1651("brightpass", -276518163);
				((Class55_Sub1) this).aClass115_9190 = ((Class55_Sub1) this).aClass101_9187.method1651("blur", -274556349);
				((Class55_Sub1) this).aClass115_9191 = ((Class55_Sub1) this).aClass101_9187.method1651("composite", 2132478463);
				((Class55_Sub1) this).aClass115_9192 = ((Class55_Sub1) this).aClass101_9187.method1651("techDefault", 1768065180);
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			}
			if (!((Class55_Sub1) this).aClass115_9182.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9185.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9190.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9191.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9192.method1899())
				return false;
			((Class55_Sub1) this).aBool9199 = true;
			return true;
		}
		return false;
	}

	int method1118() {
		return 4;
	}

	boolean method1097() {
		if (method14517()) {
			((Class55_Sub1) this).aClass101_9187 = aClass505_Sub2_514.method13890("FilterBloom");
			if (((Class55_Sub1) this).aClass101_9187 == null)
				return false;
			try {
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9194 = ((Class55_Sub1) this).aClass101_9187.method1691("sceneTex", (short) 23052);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9197 = ((Class55_Sub1) this).aClass101_9187.method1691("bloomTex1", (short) 12055);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9195 = ((Class55_Sub1) this).aClass101_9187.method1691("params", (short) 26278);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9196 = ((Class55_Sub1) this).aClass101_9187.method1691("sampleSize", (short) 9862);
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9183 = (((Class55_Sub1) this).aClass101_9187.method1691("pixelOffsetAndBloomScale", (short) 7215));
				((Class55_Sub1) this).aClass282_Sub21_Sub1_9198 = ((Class55_Sub1) this).aClass101_9187.method1691("PosAndTexCoords", (short) 12182);
				((Class55_Sub1) this).aClass101_9187.method1651("test", -206314658);
				((Class55_Sub1) this).aClass115_9182 = ((Class55_Sub1) this).aClass101_9187.method1651("techFullscreenTri", -575469557);
				((Class55_Sub1) this).aClass115_9185 = ((Class55_Sub1) this).aClass101_9187.method1651("brightpass", -1905427550);
				((Class55_Sub1) this).aClass115_9190 = ((Class55_Sub1) this).aClass101_9187.method1651("blur", 988160871);
				((Class55_Sub1) this).aClass115_9191 = ((Class55_Sub1) this).aClass101_9187.method1651("composite", 1685222905);
				((Class55_Sub1) this).aClass115_9192 = ((Class55_Sub1) this).aClass101_9187.method1651("techDefault", -410984860);
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			}
			if (!((Class55_Sub1) this).aClass115_9182.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9185.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9190.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9191.method1899())
				return false;
			if (!((Class55_Sub1) this).aClass115_9192.method1899())
				return false;
			((Class55_Sub1) this).aBool9199 = true;
			return true;
		}
		return false;
	}

	int method1127() {
		return 1;
	}

	int method1117() {
		return 1;
	}

	boolean method14518() {
		return (aClass505_Sub2_514.aBool8718 && aClass505_Sub2_514.method13888());
	}

	boolean method1108() {
		return ((Class55_Sub1) this).aBool9199;
	}
}
