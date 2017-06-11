/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15 {
	int[] anIntArray178;
	Runnable aRunnable179;
	static float aFloat180 = 255.0F;
	float[] aFloatArray181;
	Class_ra_Sub1 aClass_ra_Sub1_182;
	float aFloat183;
	int anInt184;
	int anInt185;
	boolean aBoolean186;
	Class387_Sub1[] aClass387_Sub1Array187;
	float[] aFloatArray188;
	Matrix3f aClass222_189;
	Matrix4f aClass233_190;
	float aFloat191;
	Class2 aClass2_192;
	float aFloat193;
	Matrix4f aClass233_194;
	Matrix4f aClass233_195;
	int anInt196;
	float[] aFloatArray197;
	float[] aFloatArray198;
	float[] aFloatArray199;
	float[] aFloatArray200;
	int[] anIntArray201;
	int[] anIntArray202;
	int[] anIntArray203;
	int[] anIntArray204;
	float aFloat205 = 0.85F;
	int[] anIntArray206;
	boolean aBoolean207;
	float aFloat208;
	float aFloat209;
	float[] aFloatArray210;
	float aFloat211;
	float aFloat212;
	int[] anIntArray213;
	int anInt214;
	int anInt215;
	boolean aBoolean216;
	Class387_Sub1[] aClass387_Sub1Array217;
	float[] aFloatArray218;
	Matrix3f aClass222_219;
	float aFloat220;
	float[] aFloatArray221;
	float[] aFloatArray222;
	float[] aFloatArray223;
	public static Class507 aClass507_224;

	Class15(Class_ra_Sub1 class_ra_sub1) {
		((Class15) this).aFloat183 = 1.0F - ((Class15) this).aFloat205;
		((Class15) this).anInt184 = 0;
		((Class15) this).anInt185 = 0;
		((Class15) this).aBoolean186 = false;
		((Class15) this).anInt196 = 0;
		((Class15) this).anInt215 = 0;
		((Class15) this).aBoolean207 = true;
		((Class15) this).aClass233_190 = new Matrix4f();
		((Class15) this).aClass222_219 = new Matrix3f();
		((Class15) this).aClass222_189 = new Matrix3f();
		((Class15) this).aClass233_194 = new Matrix4f();
		((Class15) this).aClass233_195 = new Matrix4f();
		((Class15) this).anIntArray213 = new int[Class387_Sub1.anInt7810];
		((Class15) this).aFloatArray197 = new float[Class387_Sub1.anInt7810];
		((Class15) this).aFloatArray188 = new float[Class387_Sub1.anInt7810];
		((Class15) this).aFloatArray199 = new float[Class387_Sub1.anInt7810];
		((Class15) this).aFloatArray200 = new float[Class387_Sub1.anInt7810];
		((Class15) this).anIntArray201 = new int[8];
		((Class15) this).anIntArray202 = new int[8];
		((Class15) this).anIntArray203 = new int[8];
		((Class15) this).anIntArray204 = new int[10000];
		((Class15) this).anIntArray178 = new int[10000];
		((Class15) this).aFloat211 = 1.0F;
		((Class15) this).aFloat212 = 0.0F;
		((Class15) this).aFloat191 = 1.0F;
		((Class15) this).aFloatArray210 = new float[2];
		((Class15) this).aClass387_Sub1Array187 = new Class387_Sub1[7];
		((Class15) this).aClass387_Sub1Array217 = new Class387_Sub1[7];
		((Class15) this).aFloatArray218 = new float[64];
		((Class15) this).aFloatArray181 = new float[64];
		((Class15) this).aFloatArray223 = new float[64];
		((Class15) this).aFloatArray221 = new float[64];
		((Class15) this).aFloatArray222 = new float[64];
		((Class15) this).aFloatArray198 = new float[3];
		((Class15) this).aClass_ra_Sub1_182 = class_ra_sub1;
		((Class15) this).aClass2_192 = new Class2(class_ra_sub1, this);
		for (int i = 0; i < 7; i++) {
			((Class15) this).aClass387_Sub1Array187[i] = new Class387_Sub1(((Class15) this).aClass_ra_Sub1_182);
			((Class15) this).aClass387_Sub1Array217[i] = new Class387_Sub1(((Class15) this).aClass_ra_Sub1_182);
		}
		((Class15) this).anIntArray206 = new int[Class387_Sub1.anInt7787];
		for (int i = 0; i < Class387_Sub1.anInt7787; i++)
			((Class15) this).anIntArray206[i] = -1;
	}

	void method347(Runnable runnable, byte i) {
		try {
			((Class15) this).aRunnable179 = runnable;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ap.f(").append(')').toString());
		}
	}

	void method348(int i) {
		try {
			((Class15) this).aClass2_192 = new Class2(((Class15) this).aClass_ra_Sub1_182, this);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ap.a(").append(')').toString());
		}
	}

	static final void method349(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_0_);
			if (-1673957995 * class468.anInt5755 == -1 && 809765849 * class468.anInt5709 >= 0)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 809765849 * class468.anInt5709;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ap.aal(").append(')').toString());
		}
	}

	static final void method350(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class379.anIntArray4096[Class173.method1823(i_1_, (byte) 0) & 0xffff]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ap.zl(").append(')').toString());
		}
	}

	static final void method351(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class21.method365(class105, class119, false, 1, class403, 1620962996);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ap.hp(").append(')').toString());
		}
	}
}
