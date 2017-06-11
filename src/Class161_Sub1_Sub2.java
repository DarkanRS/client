/* Class161_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161_Sub1_Sub2 extends Class161_Sub1 {
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9136;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9137;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9138;
	public Class217 aClass217_9139;
	public Matrix4f aClass233_9140 = new Matrix4f();
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9141;
	public Matrix4f aClass233_9142 = new Matrix4f();
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9143;
	public Class217 aClass217_9144 = new Class217();
	public int anInt9145;
	Class232 aClass232_9146;
	Class232 aClass232_9147 = new Class232();
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9148;
	public Class217 aClass217_9149;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9150;
	Class232 aClass232_9151;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9152;
	public Class232 aClass232_9153;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9154;
	Class159 aClass159_9155;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9156;
	public Class232 aClass232_9157;
	public int anInt9158;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9159;
	public int anInt9160;
	float aFloat9161;
	public int anInt9162;
	public int anInt9163;
	Class298_Sub31_Sub1 aClass298_Sub31_Sub1_9164;
	boolean aBoolean9165;

	void method1741(Matrix4f class233) {
		Matrix4f class233_0_ = new Matrix4f();
		class233_0_.method2147(((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161, 1.0F, 1.0F);
		class233_0_.method2143(class233, class233_0_);
		super.method1727(class233_0_);
	}

	void method1729(boolean bool) {
		try {
			float f = 1.0F + (1.0F - Math.abs(aClass_ra_Sub3_1648.aFloatArray8283[1])) * 2.0F;
			float f_1_ = aClass_ra_Sub3_1648.aFloat8364;
			aClass_ra_Sub3_1648.aFloat8364 *= f;
			super.method1729(bool);
			aClass_ra_Sub3_1648.aFloat8364 = f_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afv.l(").append(')').toString());
		}
	}

	void method1727(Matrix4f class233) {
		try {
			Matrix4f class233_2_ = new Matrix4f();
			class233_2_.method2147(((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161, 1.0F, 1.0F);
			class233_2_.method2143(class233, class233_2_);
			super.method1727(class233_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afv.m(").append(')').toString());
		}
	}

	void method1742(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass_ra_Sub3_1648.aFloatArray8283[1])) * 2.0F);
		float f_3_ = aClass_ra_Sub3_1648.aFloat8364;
		aClass_ra_Sub3_1648.aFloat8364 *= f;
		super.method1729(bool);
		aClass_ra_Sub3_1648.aFloat8364 = f_3_;
	}

	void method1743(int i) {
		try {
			((Class161_Sub1_Sub2) this).aFloat9161 = 2.4414062E-4F;
			int i_4_ = 256;
			float f = 0.3F;
			float f_5_ = 0.4F;
			float f_6_ = 0.1F;
			int i_7_ = 5;
			aClass233_9142.method2147(((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161);
			((Class161_Sub1_Sub2) this).aClass232_9147.method2135(-aClass_ra_Sub3_1648.aFloatArray8283[0], -aClass_ra_Sub3_1648.aFloatArray8283[1], -aClass_ra_Sub3_1648.aFloatArray8283[2], 32.0F);
			((Class161_Sub1_Sub2) this).aClass232_9146.method2135(aClass_ra_Sub3_1648.aFloat8362, aClass_ra_Sub3_1648.aFloat8289, aClass_ra_Sub3_1648.aFloat8290, (float) i_7_);
			((Class161_Sub1_Sub2) this).aClass232_9151.method2135(f_6_, f_5_, (float) i_4_, f);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afv.am(").append(')').toString());
		}
	}

	boolean method1736() throws Exception_Sub2 {
		if (!((Class161_Sub1_Sub2) this).aClass159_9155.method1705())
			return false;
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9137 = aClass123_7033.method1360("NormalSampler", -1799179479);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9164 = aClass123_7033.method1360("EnvMapSampler", -863358126);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9138 = aClass123_7033.method1360("WVPMatrix", -1578257061);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9141 = aClass123_7033.method1360("TexCoordMatrix", 1173183718);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9143 = aClass123_7033.method1360("EyePosAndTime", 1913245218);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9136 = aClass123_7033.method1360("SunDirectionAndExponent", 143918019);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9148 = aClass123_7033.method1360("SunColourAndWaveExponent", -1330149261);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9150 = (aClass123_7033.method1360("WaveIntensityAndBreakWaterDepthAndOffset", 458926447));
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9154 = aClass123_7033.method1360("HeightFogPlane", -1594015511);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9159 = aClass123_7033.method1360("HeightFogColour", 191981507);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9156 = aClass123_7033.method1360("DistanceFogPlane", -193071269);
		((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9152 = aClass123_7033.method1360("DistanceFogColour", 738690292);
		Class110 class110 = aClass123_7033.method1327(((((Class161_Sub1_Sub2) this).aBoolean9165) ? "EnvMappedSea" : "EnvMappedWater"), (byte) -66);
		aClass123_7033.method1331(class110);
		return true;
	}

	void method1744(Matrix4f class233) {
		Matrix4f class233_8_ = new Matrix4f();
		class233_8_.method2147(((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161, 1.0F, 1.0F);
		class233_8_.method2143(class233, class233_8_);
		super.method1727(class233_8_);
	}

	void method1745(Matrix4f class233) {
		Matrix4f class233_9_ = new Matrix4f();
		class233_9_.method2147(((Class161_Sub1_Sub2) this).aFloat9161, ((Class161_Sub1_Sub2) this).aFloat9161, 1.0F, 1.0F);
		class233_9_.method2143(class233, class233_9_);
		super.method1727(class233_9_);
	}

	void method1746(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass_ra_Sub3_1648.aFloatArray8283[1])) * 2.0F);
		float f_10_ = aClass_ra_Sub3_1648.aFloat8364;
		aClass_ra_Sub3_1648.aFloat8364 *= f;
		super.method1729(bool);
		aClass_ra_Sub3_1648.aFloat8364 = f_10_;
	}

	public Class161_Sub1_Sub2(Class_ra_Sub3 class_ra_sub3, Class159 class159, boolean bool) throws Exception_Sub2 {
		super(class_ra_sub3);
		((Class161_Sub1_Sub2) this).aClass232_9146 = new Class232();
		((Class161_Sub1_Sub2) this).aClass232_9151 = new Class232();
		aClass232_9153 = new Class232();
		aClass217_9149 = new Class217();
		aClass232_9157 = new Class232();
		aClass217_9139 = new Class217();
		((Class161_Sub1_Sub2) this).aFloat9161 = 0.0F;
		new Matrix4f();
		((Class161_Sub1_Sub2) this).aClass159_9155 = class159;
		((Class161_Sub1_Sub2) this).aBoolean9165 = bool;
		if (class_ra_sub3.method5295() && class_ra_sub3.method5483())
			method1725("EnvMappedWater");
	}

	void method1747(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass_ra_Sub3_1648.aFloatArray8283[1])) * 2.0F);
		float f_11_ = aClass_ra_Sub3_1648.aFloat8364;
		aClass_ra_Sub3_1648.aFloat8364 *= f;
		super.method1729(bool);
		aClass_ra_Sub3_1648.aFloat8364 = f_11_;
	}

	public void method1748(int i) {
		try {
			method1743(1985693745);
			aClass123_7033.method1331(aClass123_7033.method1330(-1437671487));
			aClass123_7033.method1340();
			aClass123_7033.method1341((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9137), 0, (((Class161_Sub1_Sub2) this).aClass159_9155.anInterface9_Impl3_1626), -572281806);
			aClass123_7033.method1341((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9164), 1, aClass_ra_Sub3_1648.method5321(), -1260247991);
			aClass123_7033.method1368((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9138), aClass233_9140, 600012267);
			aClass123_7033.method1337((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9141), aClass233_9142, (byte) 17);
			int i_12_ = 1 << (149563177 * anInt9145 & 0x3);
			aClass123_7033.method1366((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9143), aClass217_9144.aFloat2451, aClass217_9144.aFloat2455, aClass217_9144.aFloat2454, (float) (i_12_ * aClass_ra_Sub3_1648.anInt8342 % 40000) / 40000.0F, 2032048310);
			aClass123_7033.method1339((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9136), (((Class161_Sub1_Sub2) this).aClass232_9147), -1051400568);
			aClass123_7033.method1339((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9148), (((Class161_Sub1_Sub2) this).aClass232_9146), -1384576078);
			aClass123_7033.method1339((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9150), (((Class161_Sub1_Sub2) this).aClass232_9151), 642247137);
			aClass123_7033.method1339((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9154), aClass232_9153, -1615535867);
			aClass123_7033.method1338((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9159), aClass217_9149, -386546877);
			aClass123_7033.method1339((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9156), aClass232_9157, 221024078);
			aClass123_7033.method1338((((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9152), aClass217_9139, -386546877);
			aClass_ra_Sub3_1648.method5392(Class187.aClass187_1907, -1146886737 * anInt9160, anInt9158 * -2126568899, anInt9162 * 501274325, anInt9163 * -913937851);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afv.ac(").append(')').toString());
		}
	}

	boolean method1726() throws Exception_Sub2 {
		try {
			if (!((Class161_Sub1_Sub2) this).aClass159_9155.method1705())
				return false;
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9137 = aClass123_7033.method1360("NormalSampler", -921780111);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9164 = aClass123_7033.method1360("EnvMapSampler", 606818732);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9138 = aClass123_7033.method1360("WVPMatrix", 1310649603);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9141 = aClass123_7033.method1360("TexCoordMatrix", 1954962863);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9143 = aClass123_7033.method1360("EyePosAndTime", -238618670);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9136 = aClass123_7033.method1360("SunDirectionAndExponent", -457877765);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9148 = aClass123_7033.method1360("SunColourAndWaveExponent", 442145451);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9150 = (aClass123_7033.method1360("WaveIntensityAndBreakWaterDepthAndOffset", -391677311));
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9154 = aClass123_7033.method1360("HeightFogPlane", 1386296488);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9159 = aClass123_7033.method1360("HeightFogColour", -1148212701);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9156 = aClass123_7033.method1360("DistanceFogPlane", -755878477);
			((Class161_Sub1_Sub2) this).aClass298_Sub31_Sub1_9152 = aClass123_7033.method1360("DistanceFogColour", 1321216707);
			Class110 class110 = aClass123_7033.method1327(((((Class161_Sub1_Sub2) this).aBoolean9165) ? "EnvMappedSea" : "EnvMappedWater"), (byte) -97);
			aClass123_7033.method1331(class110);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afv.e(").append(')').toString());
		}
	}
}
