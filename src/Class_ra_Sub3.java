/* Class_ra_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import sun.misc.Unsafe;

public abstract class Class_ra_Sub3 extends GraphicsToolkit {
	Interface7_Impl1 anInterface7_Impl1_8202;
	Class501 aClass501_8203 = new Class501();
	Matrix4f aClass233_8204;
	Matrix4f aClass233_8205;
	static int anInt8206 = -1;
	static int anInt8207 = 2;
	static int anInt8208 = 4;
	Matrix4f aClass233_8209;
	static int anInt8210 = 55;
	static int anInt8211 = 7;
	protected static int anInt8212 = 100663296;
	Class78 aClass78_8213;
	protected boolean fixedFunction;
	int[] anIntArray8215;
	public ByteBuffer aByteBuffer8216;
	public long aLong8217;
	int anInt8218 = 4194304;
	public Unsafe anUnsafe8219;
	Class159 aClass159_8220;
	NativeHeap aNativeHeap8221;
	Class458 aClass458_8222 = new Class458();
	public int anInt8223;
	public int anInt8224;
	static Matrix4f aClass233_8225;
	Matrix3f aClass222_8226 = new Matrix3f();
	Matrix4f aClass233_8227 = new Matrix4f();
	Matrix3f aClass222_8228 = new Matrix3f();
	Matrix3f aClass222_8229 = new Matrix3f();
	public Matrix4f aClass233_8230 = new Matrix4f();
	Matrix4f aClass233_8231 = new Matrix4f();
	Matrix3f aClass222_8232 = new Matrix3f();
	protected int anInt8233;
	protected int anInt8234;
	Matrix3f aClass222_8235;
	protected Matrix4f aClass233_8236;
	protected boolean aBoolean8237;
	Class217 aClass217_8238;
	protected int anInt8239;
	boolean aBoolean8240;
	protected int anInt8241;
	boolean aBoolean8242;
	Matrix4f aClass233_8243;
	Matrix4f aClass233_8244;
	protected boolean aBoolean8245;
	Matrix4f aClass233_8246;
	Matrix4f aClass233_8247;
	protected float[] aFloatArray8248;
	Class130 aClass130_8249;
	Matrix3f aClass222_8250;
	public Matrix4f aClass233_8251;
	float[][] aFloatArrayArray8252;
	float aFloat8253;
	protected boolean aBoolean8254;
	float aFloat8255;
	float aFloat8256;
	Class138 aClass138_8257;
	protected float aFloat8258;
	float aFloat8259;
	float aFloat8260;
	protected float aFloat8261;
	Class149 aClass149_8262;
	protected int anInt8263;
	protected boolean aBoolean8264;
	protected int anInt8265;
	Class161_Sub1_Sub1 aClass161_Sub1_Sub1_8266;
	Class387_Sub3[] aClass387_Sub3Array8267;
	protected Class174 aClass174_8268;
	int anInt8269;
	int anInt8270;
	int anInt8271;
	protected int anInt8272;
	protected int anInt8273;
	protected int anInt8274;
	protected int anInt8275;
	protected int anInt8276;
	protected boolean aBoolean8277;
	protected boolean aBoolean8278;
	protected boolean aBoolean8279;
	Class57_Sub2 aClass57_Sub2_8280;
	protected boolean aBoolean8281;
	protected boolean aBoolean8282;
	public float[] aFloatArray8283;
	Class66_Sub2 aClass66_Sub2_8284;
	float[] aFloatArray8285;
	protected Class298_Sub10[] aClass298_Sub10Array8286;
	int anInt8287;
	Class387_Sub3[] aClass387_Sub3Array8288;
	public float aFloat8289;
	public float aFloat8290;
	protected float aFloat8291;
	protected float aFloat8292;
	protected float aFloat8293;
	protected Class175[] aClass175Array8294;
	protected int anInt8295;
	protected int anInt8296;
	int anInt8297;
	int anInt8298;
	int anInt8299;
	static Object anObject8300 = new Object();
	Interface9_Impl2 anInterface9_Impl2_8301;
	static int anInt8302 = 8;
	Interface9[] anInterface9Array8303;
	protected Matrix4f[] aClass233Array8304;
	protected Class171[] aClass171Array8305;
	Class153 aClass153_8306;
	protected Class175[] aClass175Array8307;
	protected float aFloat8308;
	protected boolean aBoolean8309;
	public Interface9_Impl2 anInterface9_Impl2_8310;
	int anInt8311;
	float[] aFloatArray8312;
	int anInt8313;
	Class161 aClass161_8314;
	Class161[] aClass161Array8315;
	Class137 aClass137_8316;
	int anInt8317;
	protected int anInt8318;
	Class161_Sub1_Sub2 aClass161_Sub1_Sub2_8319;
	Class57_Sub2 aClass57_Sub2_8320;
	Class168 aClass168_8321;
	static int anInt8322 = 1;
	static int anInt8323 = 2;
	Class150[] aClass150Array8324;
	protected int anInt8325;
	boolean aBoolean8326;
	boolean aBoolean8327;
	int anInt8328;
	float aFloat8329;
	boolean aBoolean8330;
	protected boolean aBoolean8331;
	protected int anInt8332;
	public Matrix4f aClass233_8333;
	protected int anInt8334;
	protected float aFloat8335;
	protected float aFloat8336;
	Class153 aClass153_8337;
	Matrix4f aClass233_8338 = new Matrix4f();
	protected int anInt8339;
	float[] aFloatArray8340;
	public int anInt8341;
	public int anInt8342;
	Interface7_Impl1 anInterface7_Impl1_8343;
	boolean aBoolean8344;
	Class176 aClass176_8345;
	int anInt8346;
	public int anInt8347;
	protected int anInt8348;
	public boolean aBoolean8349;
	protected boolean aBoolean8350;
	Class157 aClass157_8351;
	static int anInt8352 = 1;
	int anInt8353;
	Interface7_Impl1 anInterface7_Impl1_8354;
	static int anInt8355 = 128;
	Class153 aClass153_8356;
	int anInt8357;
	Class153 aClass153_8358;
	Class153 aClass153_8359;
	Interface7_Impl2 anInterface7_Impl2_8360;
	Class243 aClass243_8361;
	public float aFloat8362;
	Matrix4f aClass233_8363;
	public float aFloat8364;
	protected boolean aBoolean8365;
	protected int anInt8366;

	abstract void method5292(int i);

	public void method5293(Interface8 interface8) {
		((Class_ra_Sub3) this).aClass501_8203.method6225(interface8, -1339142220);
	}

	void method5294() {
		ArrayList arraylist = ((Class_ra_Sub3) this).aClass501_8203.method6224(500882138);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface8 interface8 = (Interface8) iterator.next();
			interface8.b();
		}
	}

	public abstract boolean method5295();

	public final void method5296(int i, Class183 class183) {
		method5427(i, class183, false, false);
	}

	public abstract Class123 method5297(String string);

	byte[] method5298(String string, String string_0_) {
		return ((Class_ra_Sub3) this).aClass243_8361.method2301(string, string_0_, -2042628011);
	}
	
	public final void method5042_cp(Class69 class69, al ccat, int ci, int ca) {
		((Class_ra_Sub3) this).aClass176_8345.method1829_cp(this, class69, ccat, ci, ca);
	}

	Class109 method5299(byte[] is) {
		if (is == null)
			return null;
		Class109 class109;
		try {
			class109 = new Class109(is);
		} catch (Exception exception) {
			return null;
		}
		return class109;
	}

	public abstract void method5300(Matrix4f class233, Matrix4f class233_1_, Matrix4f class233_2_);

	final Matrix4f method5301() {
		return aClass233_8333;
	}

	public final void method5302() {
		((Class_ra_Sub3) this).anInterface9Array8303 = new Interface9[anInt8347];
		aClass233Array8304 = new Matrix4f[anInt8347];
		aClass171Array8305 = new Class171[anInt8347];
		aClass175Array8294 = new Class175[anInt8347];
		aClass175Array8307 = new Class175[anInt8347];
		for (int i = 0; i < anInt8347; i++) {
			aClass175Array8307[i] = Class175.aClass175_1765;
			aClass175Array8294[i] = Class175.aClass175_1765;
			aClass171Array8305[i] = Class171.aClass171_1742;
			aClass233Array8304[i] = new Matrix4f();
		}
		aClass298_Sub10Array8286 = new Class298_Sub10[anInt8348 - 2];
		int[] is = { -1 };
		anInterface9_Impl2_8310 = method5355(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class_ra_Sub3) this).anInterface9_Impl2_8301 = method5355(1, 1, false, is, 0, 0);
		method5027(new Class_v_Sub2(262144));
		((Class_ra_Sub3) this).aClass153_8359 = method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599 }) });
		method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1597 }) });
		((Class_ra_Sub3) this).aClass153_8358 = method5404(new Class181[] { new Class181(Class155.aClass155_1610), new Class181(Class155.aClass155_1597), new Class181(Class155.aClass155_1599), new Class181(Class155.aClass155_1596) });
		((Class_ra_Sub3) this).aClass153_8306 = method5404(new Class181[] { new Class181(Class155.aClass155_1610), new Class181(Class155.aClass155_1597), new Class181(Class155.aClass155_1599) });
		for (int i = 0; i < 7; i++) {
			((Class_ra_Sub3) this).aClass387_Sub3Array8288[i] = new Class387_Sub3(this, 0, 0, false, false);
			((Class_ra_Sub3) this).aClass387_Sub3Array8267[i] = new Class387_Sub3(this, 0, 0, true, true);
		}
		method5402();
		((Class_ra_Sub3) this).anInterface7_Impl2_8360 = method5381(true);
		method5463();
		method5094();
		L();
		method5176();
		((Class_ra_Sub3) this).aClass57_Sub2_8320 = new Class57_Sub2(this, anInterface9_Impl2_8310);
		((Class_ra_Sub3) this).aClass57_Sub2_8280 = new Class57_Sub2(this, ((Class_ra_Sub3) this).anInterface9_Impl2_8301);
		ba(3, 0);
	}

	abstract void method5303();

	Class161 method5304(int i) {
		return ((Class_ra_Sub3) this).aClass161Array8315[i];
	}

	abstract void method5305();

	public final void method4991(int i, int i_3_, int i_4_, int i_5_) {
		((Class_ra_Sub3) this).aClass168_8321.method1798(i, i_3_, i_4_, i_5_);
	}

	void method5306() {
		((Class_ra_Sub3) this).aClass168_8321.method1796();
		((Class_ra_Sub3) this).anInterface7_Impl1_8202.b();
		((Class_ra_Sub3) this).anInterface7_Impl1_8343.b();
		((Class_ra_Sub3) this).anInterface7_Impl1_8354.b();
		for (int i = 0; i < 7; i++)
			((Class_ra_Sub3) this).aClass387_Sub3Array8267[i].method4850();
		((Class_ra_Sub3) this).aClass176_8345.method1828();
		((Class_ra_Sub3) this).anInterface7_Impl2_8360.b();
	}

	void method5307() {
		((Class_ra_Sub3) this).aClass168_8321.method1791();
		for (int i = 0; i < ((Class_ra_Sub3) this).aClass150Array8324.length; i++) {
			if (((Class_ra_Sub3) this).aClass150Array8324[i] != null && ((Class_ra_Sub3) this).aClass150Array8324[i].method1626())
				((Class_ra_Sub3) this).aClass150Array8324[i].method1619();
		}
		((Class_ra_Sub3) this).aClass176_8345 = new Class176(this);
		method5308();
		method5309();
		method5420();
		((Class_ra_Sub3) this).aClass176_8345.method1827(this);
	}

	final void method5308() {
		((Class_ra_Sub3) this).anInterface7_Impl1_8202 = method5382(false);
		int i = 160;
		((Class_ra_Sub3) this).anInterface7_Impl1_8202.method72(i, 32);
		aByteBuffer8216.clear();
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(1.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putInt(-1);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		((Class_ra_Sub3) this).anInterface7_Impl1_8202.method63(0, aByteBuffer8216.position(), aLong8217);
		((Class_ra_Sub3) this).aClass153_8356 = method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1597, Class155.aClass155_1599, Class155.aClass155_1599 }) });
	}

	final void method5309() {
		((Class_ra_Sub3) this).anInterface7_Impl1_8343 = method5382(true);
		((Class_ra_Sub3) this).anInterface7_Impl1_8343.method72(24, 12);
		((Class_ra_Sub3) this).aClass153_8337 = method5404(new Class181[] { new Class181(Class155.aClass155_1610) });
	}

	abstract boolean method5310(Class55 class55, Class77 class77);

	boolean method5311(float f, float f_6_, float f_7_, float f_8_, float f_9_, float f_10_) {
		aByteBuffer8216.clear();
		aByteBuffer8216.putFloat(f);
		aByteBuffer8216.putFloat(f_6_);
		aByteBuffer8216.putFloat(f_7_);
		aByteBuffer8216.putFloat(f_8_);
		aByteBuffer8216.putFloat(f_9_);
		aByteBuffer8216.putFloat(f_10_);
		return ((Class_ra_Sub3) this).anInterface7_Impl1_8343.method63(0, aByteBuffer8216.position(), aLong8217);
	}

	void method5023() {
		if (!((Class_ra_Sub3) this).aBoolean8344) {
			method5306();
			((Class_ra_Sub3) this).aClass157_8351.method1697();
			for (Linkable class298 = ((Class_ra_Sub3) this).aClass458_8222.method5967(1389781376); class298 != null; class298 = ((Class_ra_Sub3) this).aClass458_8222.method5969((byte) -7))
				((Class_v_Sub2) class298).method3675();
			Class216.method2000(false, true, (short) 2786);
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass161Array8315.length; i++) {
				if (((Class_ra_Sub3) this).aClass161Array8315[i] != null) {
					((Class_ra_Sub3) this).aClass161Array8315[i].method1712();
					((Class_ra_Sub3) this).aClass161Array8315[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass150Array8324.length; i++) {
				if (((Class_ra_Sub3) this).aClass150Array8324[i] != null) {
					((Class_ra_Sub3) this).aClass150Array8324[i].method1627();
					((Class_ra_Sub3) this).aClass150Array8324[i] = null;
				}
			}
			method5294();
			method4993(0);
			((Class_ra_Sub3) this).aBoolean8344 = true;
		}
	}

	public final boolean method5001() {
		return true;
	}

	public final boolean method5074() {
		return true;
	}

	final Interface7_Impl2 method5312(int i) {
		if (((Class_ra_Sub3) this).anInterface7_Impl2_8360.method60() < i * 2)
			((Class_ra_Sub3) this).anInterface7_Impl2_8360.method113(i);
		return ((Class_ra_Sub3) this).anInterface7_Impl2_8360;
	}

	public final boolean method5050() {
		return ((Class_ra_Sub3) this).aClass150Array8324[1] != null;
	}

	public final boolean method4996() {
		return true;
	}

	public abstract void method5313(Class153 class153);

	public final boolean method5159() {
		return true;
	}

	final void method5314() {
		aClass233_8333.method2142(((Class_ra_Sub3) this).aClass233_8209);
		method5335(aClass233_8333);
		aFloat8308 = ((aClass233_8333.aFloatArray2594[14] - aClass233_8333.aFloatArray2594[15]) / (aClass233_8333.aFloatArray2594[11] - aClass233_8333.aFloatArray2594[10]));
		aFloat8261 = (-aClass233_8333.aFloatArray2594[14] / aClass233_8333.aFloatArray2594[10]);
		method5377();
	}

	public final boolean method5051() {
		return false;
	}

	public final boolean method5032() {
		return aBoolean8350;
	}

	public abstract float method5315();

	public void method4993(int i) {
		if (((Class_ra_Sub3) this).aClass157_8351 != null)
			((Class_ra_Sub3) this).aClass157_8351.method1696();
		anInt8342 = i & 0x7fffffff;
	}

	final Matrix4f method5316() {
		return aClass233Array8304[anInt8325];
	}

	void method5317() {
		method5419();
		method5318();
		method5336();
		method5011();
		L();
	}

	public final boolean method5052() {
		if (((Class_ra_Sub3) this).aClass150Array8324[1] != null && !((Class_ra_Sub3) this).aClass150Array8324[1].method1626()) {
			boolean bool = (((Class_ra_Sub3) this).aClass168_8321.method1792(((Class_ra_Sub3) this).aClass150Array8324[1]));
			if (bool)
				((Class_ra_Sub3) this).aClass157_8351.method1697();
			return bool;
		}
		return false;
	}

	public final void method5053() {
		if (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626()) {
			((Class_ra_Sub3) this).aClass168_8321.method1795(((Class_ra_Sub3) this).aClass150Array8324[1]);
			((Class_ra_Sub3) this).aClass157_8351.method1697();
		}
	}

	public final boolean method5054() {
		return (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626());
	}

	final void method5188(float f, float f_11_, float f_12_, float f_13_, float f_14_, float f_15_) {
		Class150_Sub1.aFloat7011 = f;
		Class150_Sub1.aFloat7013 = f_11_;
		Class150_Sub1.aFloat7012 = f_12_;
		Class150_Sub1.aFloat7015 = f_15_;
	}

	public final void method5056(int i, int i_16_, int i_17_, int i_18_) {
		((Class_ra_Sub3) this).aClass168_8321.method1798(i, i_16_, i_17_, i_18_);
	}

	public final void method5112() {
		((Class_ra_Sub3) this).aClass168_8321.method1794();
	}

	public final Class_v method5026(int i) {
		Class_v_Sub2 class_v_sub2 = new Class_v_Sub2(i);
		((Class_ra_Sub3) this).aClass458_8222.method5968(class_v_sub2, 864912510);
		return class_v_sub2;
	}

	final void method5318() {
		((Class_ra_Sub3) this).aBoolean8330 = false;
		method5407();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5314();
	}

	public final Matrix4f method5124() {
		return ((Class_ra_Sub3) this).aClass233_8246;
	}

	public final int za() {
		return anInt8224 + anInt8223 + anInt8318;
	}

	public final Class57 method5029(int i, int i_19_, boolean bool, boolean bool_20_) {
		return new Class57_Sub2(this, i, i_19_, bool, bool_20_);
	}

	public final Class57 method5125(Class89 class89, boolean bool) {
		Class57 class57;
		if (class89.anInt812 != 0 && class89.anInt816 != 0) {
			int[] is = new int[class89.anInt812 * class89.anInt816];
			int i = 0;
			int i_21_ = 0;
			if (class89.aByteArray819 != null) {
				for (int i_22_ = 0; i_22_ < class89.anInt816; i_22_++) {
					for (int i_23_ = 0; i_23_ < class89.anInt812; i_23_++) {
						is[i_21_++] = (class89.aByteArray819[i] << 24 | (class89.anIntArray817[class89.aByteArray818[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_24_ = 0; i_24_ < class89.anInt816; i_24_++) {
					for (int i_25_ = 0; i_25_ < class89.anInt812; i_25_++) {
						int i_26_ = (class89.anIntArray817[class89.aByteArray818[i++] & 0xff]);
						is[i_21_++] = i_26_ != 0 ? ~0xffffff | i_26_ : 0;
					}
				}
			}
			class57 = method5031(is, 0, class89.anInt812, class89.anInt812, class89.anInt816, -268200852);
		} else
			class57 = method5031(new int[] { 0 }, 0, 1, 1, 1, -938706176);
		class57.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return class57;
	}

	public final Class57 method5030(int[] is, int i, int i_27_, int i_28_, int i_29_, boolean bool) {
		return new Class57_Sub2(this, i_28_, i_29_, is, i, i_27_);
	}

	abstract void method5319(int i, Class183 class183, boolean bool, boolean bool_30_);

	public final Class_ta method5034(int i, int i_31_, int[] is, int[] is_32_) {
		return Class_ta_Sub3.method6007(this, i, i_31_, is, is_32_);
	}

	public final void method5169(int i) {
		/* empty */
	}

	abstract void method5320();

	public final void method5157(int i, int i_33_, float f, int i_34_, int i_35_, float f_36_, int i_37_, int i_38_, float f_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		/* empty */
	}

	public final Class_xa method5121(int i, int i_44_, int[][] is, int[][] is_45_, int i_46_, int i_47_, int i_48_) {
		return new Class_xa_Sub1(this, i_47_, i_48_, i, i_44_, is, is_45_, i_46_);
	}

	public final Class_xa method5040(int i, int i_49_, int[][] is, int[][] is_50_, int i_51_, int i_52_, int i_53_) {
		return new Class_xa_Sub1(this, i_52_, i_53_, i, i_49_, is, is_50_, i_51_);
	}

	public final Matrix4f method5036() {
		return ((Class_ra_Sub3) this).aClass233_8363;
	}

	public final Matrix3f method5178() {
		return ((Class_ra_Sub3) this).aClass222_8250;
	}

	public final Class66 method5028(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		return new Class66_Sub2_Sub1(this, i, i_54_, i_55_, i_56_, i_57_, i_58_);
	}

	public final void method5010(int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		i += 1.0F;
		i_59_ += 1.0F;
		i_60_ += 1.0F;
		i_61_ += 1.0F;
		float f = (float) (i_60_ - i);
		float f_65_ = (float) (i_61_ - i_59_);
		float f_66_ = 1.0F / (float) Math.sqrt((double) (f * f + f_65_ * f_65_));
		f *= f_66_;
		f_65_ *= f_66_;
		i -= f;
		i_59_ -= f_65_;
		float f_67_ = -f_65_;
		float f_68_ = f;
		f_67_ *= 0.5F * (float) i_63_;
		f_68_ *= 0.5F * (float) i_63_;
		((Class_ra_Sub3) this).aClass57_Sub2_8320.method641((float) i - f_67_, (float) i_59_ - f_68_, (float) i_60_ - f_67_, (float) i_61_ - f_68_, (float) i + f_67_, (float) i_59_ + f_68_, 0, i_62_, i_64_);
	}

	public final Interface9_Impl1 method5321() {
		return (((Class_ra_Sub3) this).aClass66_Sub2_8284 != null ? ((Class_ra_Sub3) this).aClass66_Sub2_8284.method773() : null);
	}

	public void method5011() {
		((Class_ra_Sub3) this).anInt8298 = 0;
		((Class_ra_Sub3) this).anInt8357 = 0;
		((Class_ra_Sub3) this).anInt8269 = aClass52_5292.method545();
		((Class_ra_Sub3) this).anInt8270 = aClass52_5292.method552();
		method5322();
	}

	final void method5322() {
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584) {
			anInt8339 = ((Class_ra_Sub3) this).anInt8298;
			anInt8272 = ((Class_ra_Sub3) this).anInt8357;
			anInt8273 = ((Class_ra_Sub3) this).anInt8269;
			anInt8239 = ((Class_ra_Sub3) this).anInt8270;
			aFloat8335 = ((Class_ra_Sub3) this).aFloat8259;
			aFloat8258 = ((Class_ra_Sub3) this).aFloat8260;
		} else {
			anInt8339 = 0;
			anInt8272 = 0;
			anInt8273 = aClass52_5292.method545();
			anInt8239 = aClass52_5292.method552();
			aFloat8335 = 0.0F;
			aFloat8258 = 1.0F;
		}
		method5325();
		((Class_ra_Sub3) this).aFloat8329 = (float) ((Class_ra_Sub3) this).anInt8269 / 2.0F;
		((Class_ra_Sub3) this).aFloat8256 = (float) ((Class_ra_Sub3) this).anInt8270 / 2.0F;
		((Class_ra_Sub3) this).aFloat8253 = ((float) ((Class_ra_Sub3) this).anInt8298 + ((Class_ra_Sub3) this).aFloat8329);
		((Class_ra_Sub3) this).aFloat8255 = ((float) ((Class_ra_Sub3) this).anInt8357 + ((Class_ra_Sub3) this).aFloat8256);
	}

	public final Class57 method5190(int[] is, int i, int i_69_, int i_70_, int i_71_, boolean bool) {
		return new Class57_Sub2(this, i_70_, i_71_, is, i, i_69_);
	}

	public void method5323(Interface8 interface8) {
		((Class_ra_Sub3) this).aClass501_8203.method6222(interface8, anObject8300, -391880689);
	}

	final void method5324(int i, int i_72_) {
		anInt8275 = i;
		anInt8276 = i_72_;
		method5325();
		method5326();
	}

	abstract void method5325();

	abstract void method5326();

	abstract void method5327();

	final Matrix4f method5328() {
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			return aClass233_8230;
		return aClass233_8225;
	}

	final Matrix4f method5329() {
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			return ((Class_ra_Sub3) this).aClass233_8231;
		return aClass233_8225;
	}

	public final void method5043(Matrix3f class222) {
		((Class_ra_Sub3) this).aClass222_8228 = class222;
		aClass233_8230.method2145(((Class_ra_Sub3) this).aClass222_8228);
		((Class_ra_Sub3) this).aClass222_8229.method2070(class222);
		((Class_ra_Sub3) this).aClass222_8229.method2058();
		((Class_ra_Sub3) this).aClass233_8231.method2145(((Class_ra_Sub3) this).aClass222_8229);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5331();
	}

	public final void method5182(Matrix4f class233) {
		((Class_ra_Sub3) this).aClass233_8246.method2142(class233);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5314();
	}

	final void method5330(boolean bool) {
		if (bool != aBoolean8278) {
			aBoolean8278 = bool;
			method5379();
			((Class_ra_Sub3) this).anInt8311 &= ~0xf;
		}
	}

	public final Matrix4f method5045() {
		return ((Class_ra_Sub3) this).aClass233_8246;
	}

	final void method5331() {
		((Class_ra_Sub3) this).aBoolean8240 = false;
	}

	void method5332() {
		method5317();
	}

	abstract void method5333(int i);

	final Matrix4f method5334() {
		return aClass233_8251;
	}

	public final Class387 method5116(Model model, int i, int i_73_, int i_74_, int i_75_) {
		return new Class387_Sub3(this, model, i, i_74_, i_75_, i_73_);
	}

	public abstract void method5335(Matrix4f class233);

	final void method5336() {
		if (((Class_ra_Sub3) this).aClass149_8262 != Class149.aClass149_1582) {
			Class149 class149 = ((Class_ra_Sub3) this).aClass149_8262;
			((Class_ra_Sub3) this).aClass149_8262 = Class149.aClass149_1582;
			if (class149 == Class149.aClass149_1584)
				method5331();
			((Class_ra_Sub3) this).aClass233_8209 = ((Class_ra_Sub3) this).aClass233_8247;
			method5314();
			method5322();
			((Class_ra_Sub3) this).anInt8311 &= ~0xf;
		}
	}

	final void method5337() {
		if (((Class_ra_Sub3) this).aClass149_8262 != Class149.aClass149_1583) {
			Class149 class149 = ((Class_ra_Sub3) this).aClass149_8262;
			((Class_ra_Sub3) this).aClass149_8262 = Class149.aClass149_1583;
			if (class149 == Class149.aClass149_1584)
				method5331();
			method5443();
			((Class_ra_Sub3) this).aClass233_8209 = ((Class_ra_Sub3) this).aClass233_8243;
			method5314();
			method5322();
			((Class_ra_Sub3) this).anInt8311 &= ~0x8;
		}
	}

	final void method5338() {
		if (((Class_ra_Sub3) this).aClass149_8262 != Class149.aClass149_1584) {
			((Class_ra_Sub3) this).aClass149_8262 = Class149.aClass149_1584;
			method5331();
			method5407();
			((Class_ra_Sub3) this).aClass233_8209 = ((Class_ra_Sub3) this).aClass233_8246;
			method5314();
			method5322();
			((Class_ra_Sub3) this).anInt8311 &= ~0x7;
		}
	}

	public final Class264 method5092(Class505 class505, Class89[] class89s, boolean bool) {
		return new Class264_Sub5(this, class505, class89s, bool);
	}

	public Matrix3f method5171() {
		return ((Class_ra_Sub3) this).aClass222_8228;
	}

	public final void RA(boolean bool) {
		aBoolean8277 = bool;
		method5410();
	}

	final void method5339(boolean bool) {
		if (bool != aBoolean8279) {
			aBoolean8279 = bool;
			method5340();
			((Class_ra_Sub3) this).anInt8311 &= ~0xf;
		}
	}

	public final void ea(int i, int i_76_, int i_77_, int i_78_) {
		int i_79_;
		int i_80_;
		if (aClass52_5292 != null) {
			i_80_ = aClass52_5292.method545();
			i_79_ = aClass52_5292.method552();
		} else {
			i_79_ = 0;
			i_80_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_77_ = i_77_ <= i_80_ ? i_77_ : i_80_;
		i_76_ = i_76_ >= 0 ? i_76_ : 0;
		i_78_ = i_78_ <= i_79_ ? i_78_ : i_79_;
		boolean bool = false;
		if (anInt8265 < i) {
			anInt8265 = i;
			bool = true;
		}
		if (anInt8234 > i_77_) {
			anInt8234 = i_77_;
			bool = true;
		}
		if (anInt8263 < i_76_) {
			anInt8263 = i_76_;
			bool = true;
		}
		if (anInt8241 > i_78_) {
			anInt8241 = i_78_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	abstract void method5340();

	public final int method5120(int i, int i_81_) {
		return i & i_81_ ^ i_81_;
	}

	public void method5060(float f, float f_82_, float f_83_, float[] fs) {
		float f_84_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_82_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_83_));
		float f_85_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_82_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_83_));
		float f_86_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * f_82_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * f_83_));
		float f_87_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_82_ + aClass233_8230.aFloatArray2594[10] * f_83_);
		fs[0] = (((Class_ra_Sub3) this).aFloat8253 + ((Class_ra_Sub3) this).aFloat8329 * f_85_ / f_84_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8255 + ((Class_ra_Sub3) this).aFloat8256 * f_86_ / f_84_);
		fs[2] = f_87_;
	}

	public final void method5129(Matrix3f class222) {
		((Class_ra_Sub3) this).aClass222_8228 = class222;
		aClass233_8230.method2145(((Class_ra_Sub3) this).aClass222_8228);
		((Class_ra_Sub3) this).aClass222_8229.method2070(class222);
		((Class_ra_Sub3) this).aClass222_8229.method2058();
		((Class_ra_Sub3) this).aClass233_8231.method2145(((Class_ra_Sub3) this).aClass222_8229);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5331();
	}

	public int method5025(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_) {
		int i_93_ = 0;
		float f = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_88_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_89_));
		float f_94_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i_90_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_91_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_92_));
		float f_95_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_88_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_89_));
		float f_96_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i_90_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_91_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_92_));
		if (f < -f_95_ && f_94_ < -f_96_)
			i_93_ |= 0x10;
		else if (f > f_95_ && f_94_ > f_96_)
			i_93_ |= 0x20;
		float f_97_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_88_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_89_));
		float f_98_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i_90_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_91_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_92_));
		if (f_97_ < -f_95_ && f_98_ < -f_96_)
			i_93_ |= 0x1;
		if (f_97_ > f_95_ && f_98_ > f_96_)
			i_93_ |= 0x2;
		float f_99_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_88_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_89_));
		float f_100_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i_90_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_91_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_92_));
		if (f_99_ < -f_95_ && f_100_ < -f_96_)
			i_93_ |= 0x4;
		if (f_99_ > f_95_ && f_100_ > f_96_)
			i_93_ |= 0x8;
		return i_93_;
	}

	public final int method5048() {
		return anInt8348 - 2;
	}

	public final void o(int i, int i_101_, int i_102_, int i_103_) {
		int i_104_;
		int i_105_;
		if (aClass52_5292 != null) {
			i_105_ = aClass52_5292.method545();
			i_104_ = aClass52_5292.method552();
		} else {
			i_104_ = 0;
			i_105_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_102_ = i_102_ <= i_105_ ? i_102_ : i_105_;
		i_101_ = i_101_ >= 0 ? i_101_ : 0;
		i_103_ = i_103_ <= i_104_ ? i_103_ : i_104_;
		boolean bool = false;
		if (anInt8265 < i) {
			anInt8265 = i;
			bool = true;
		}
		if (anInt8234 > i_102_) {
			anInt8234 = i_102_;
			bool = true;
		}
		if (anInt8263 < i_101_) {
			anInt8263 = i_101_;
			bool = true;
		}
		if (anInt8241 > i_103_) {
			anInt8241 = i_103_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	public final void method5021(int i, Class298_Sub10[] class298_sub10s) {
		for (int i_106_ = 0; i_106_ < i; i_106_++)
			aClass298_Sub10Array8286[i_106_] = class298_sub10s[i_106_];
		anInt8296 = i;
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5346();
	}

	public final void IA(float f) {
		if (aFloat8291 != f) {
			aFloat8291 = f;
			method5411();
			method5320();
		}
	}

	public final void m(int i, float f, float f_107_, float f_108_, float f_109_, float f_110_) {
		boolean bool = ((Class_ra_Sub3) this).anInt8287 != i;
		if (bool || aFloat8364 != f || aFloat8293 != f_107_) {
			((Class_ra_Sub3) this).anInt8287 = i;
			aFloat8364 = f;
			aFloat8293 = f_107_;
			if (bool) {
				aFloat8362 = (float) (((Class_ra_Sub3) this).anInt8287 & 0xff0000) / 1.671168E7F;
				aFloat8289 = (float) (((Class_ra_Sub3) this).anInt8287 & 0xff00) / 65280.0F;
				aFloat8290 = ((float) (((Class_ra_Sub3) this).anInt8287 & 0xff) / 255.0F);
				method5411();
			}
			method5343();
		}
		if (((Class_ra_Sub3) this).aFloatArray8285[0] != f_108_ || ((Class_ra_Sub3) this).aFloatArray8285[1] != f_109_ || ((Class_ra_Sub3) this).aFloatArray8285[2] != f_110_) {
			((Class_ra_Sub3) this).aFloatArray8285[0] = f_108_;
			((Class_ra_Sub3) this).aFloatArray8285[1] = f_109_;
			((Class_ra_Sub3) this).aFloatArray8285[2] = f_110_;
			((Class_ra_Sub3) this).aFloatArray8340[0] = -f_108_;
			((Class_ra_Sub3) this).aFloatArray8340[1] = -f_109_;
			((Class_ra_Sub3) this).aFloatArray8340[2] = -f_110_;
			float f_111_ = (float) (1.0 / Math.sqrt((double) (f_108_ * f_108_ + f_109_ * f_109_ + f_110_ * f_110_)));
			aFloatArray8283[0] = f_108_ * f_111_;
			aFloatArray8283[1] = f_109_ * f_111_;
			aFloatArray8283[2] = f_110_ * f_111_;
			aFloatArray8248[0] = -aFloatArray8283[0];
			aFloatArray8248[1] = -aFloatArray8283[1];
			aFloatArray8248[2] = -aFloatArray8283[2];
			method5422();
			((Class_ra_Sub3) this).anInt8299 = (int) (f_108_ * 256.0F / f_109_);
			((Class_ra_Sub3) this).anInt8317 = (int) (f_110_ * 256.0F / f_109_);
		}
		method5320();
	}

	public final void J(int i) {
		((Class_ra_Sub3) this).anInt8313 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class_ra_Sub3) this).anInt8313++;
		((Class_ra_Sub3) this).anInt8297 = 1 << ((Class_ra_Sub3) this).anInt8313;
	}

	abstract void method5341();

	abstract void method5342();

	abstract void method5343();

	public final void method5132(Matrix3f class222) {
		((Class_ra_Sub3) this).aClass222_8228 = class222;
		aClass233_8230.method2145(((Class_ra_Sub3) this).aClass222_8228);
		((Class_ra_Sub3) this).aClass222_8229.method2070(class222);
		((Class_ra_Sub3) this).aClass222_8229.method2058();
		((Class_ra_Sub3) this).aClass233_8231.method2145(((Class_ra_Sub3) this).aClass222_8229);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5331();
	}

	abstract Interface9_Impl3 method5344(Class55 class55, int i, int i_112_, int i_113_, boolean bool, byte[] is);

	abstract void method5345();

	final void method5346() {
		if (method5438())
			method5347();
		anInt8295 = anInt8296;
		anInt8296 = 0;
	}

	abstract void method5347();

	abstract boolean method5348(Class55 class55, Class77 class77);

	abstract boolean method5349(Class55 class55, Class77 class77);

	final Interface9_Impl2 method5350(int i, int i_114_, boolean bool, int[] is) {
		return method5355(i, i_114_, bool, is, 0, 0);
	}

	final Interface9_Impl2 method5351(Class55 class55, int i, int i_115_, boolean bool, byte[] is) {
		return method5439(class55, i, i_115_, bool, is, 0, 0);
	}

	final Interface9_Impl2 method5352(Class55 class55, int i, int i_116_, boolean bool, float[] fs) {
		return method5453(class55, i, i_116_, bool, fs, 0, 0);
	}

	abstract Interface9_Impl2 method5353(Class55 class55, Class77 class77, int i, int i_117_);

	public abstract void method5354(Class187 class187, int i, int i_118_, int i_119_, int i_120_);

	abstract Interface9_Impl2 method5355(int i, int i_121_, boolean bool, int[] is, int i_122_, int i_123_);

	public final boolean method5144() {
		if (((Class_ra_Sub3) this).aClass150Array8324[1] != null && !((Class_ra_Sub3) this).aClass150Array8324[1].method1626()) {
			boolean bool = (((Class_ra_Sub3) this).aClass168_8321.method1792(((Class_ra_Sub3) this).aClass150Array8324[1]));
			if (bool)
				((Class_ra_Sub3) this).aClass157_8351.method1697();
			return bool;
		}
		return false;
	}

	abstract Interface9_Impl2_Impl1 method5356(Class55 class55, Class77 class77, int i, int i_124_);

	public final void method5047(boolean bool) {
		/* empty */
	}

	public final void method5357(int i) {
		if (anInt8325 != i) {
			anInt8325 = i;
			method5371();
		}
	}

	public final void method5358(Interface9 interface9) {
		if (((Class_ra_Sub3) this).anInterface9Array8303[anInt8325] != interface9) {
			((Class_ra_Sub3) this).anInterface9Array8303[anInt8325] = interface9;
			if (interface9 != null)
				interface9.method128();
			else
				anInterface9_Impl2_8310.method128();
			((Class_ra_Sub3) this).anInt8311 &= ~0x1;
		}
	}

	public abstract void method5359();

	public final void method5360(int i) {
		switch (i) {
		case 3:
			method5361(Class175.aClass175_1767, Class175.aClass175_1765);
			break;
		case 1:
			method5361(Class175.aClass175_1770, Class175.aClass175_1770);
			break;
		case 4:
			method5361(Class175.aClass175_1768, Class175.aClass175_1768);
			break;
		case 0:
			method5361(Class175.aClass175_1765, Class175.aClass175_1765);
			break;
		case 2:
			method5361(Class175.aClass175_1769, Class175.aClass175_1770);
			break;
		}
	}

	public final void method5361(Class175 class175, Class175 class175_125_) {
		boolean bool = false;
		if (aClass175Array8294[anInt8325] != class175) {
			aClass175Array8294[anInt8325] = class175;
			method5372();
			bool = true;
		}
		if (aClass175Array8307[anInt8325] != class175_125_) {
			aClass175Array8307[anInt8325] = class175_125_;
			method5444();
			bool = true;
		}
		if (bool)
			((Class_ra_Sub3) this).anInt8311 &= ~0xd;
	}

	public final void es(int[] is) {
		is[0] = anInt8265;
		is[1] = anInt8263;
		is[2] = anInt8234;
		is[3] = anInt8241;
	}

	public abstract void method5362(Class187 class187, int i, int i_126_, int i_127_, int i_128_);

	public final void method5363(int i, Class183 class183) {
		method5364(i, class183, false);
	}

	abstract void method5364(int i, Class183 class183, boolean bool);

	public final void method5155(int i, Class78 class78) {
		((Class_ra_Sub3) this).anInt8328 = i;
		((Class_ra_Sub3) this).aClass78_8213 = class78;
		((Class_ra_Sub3) this).aBoolean8326 = true;
	}

	public final Matrix4f method5365() {
		return aClass233Array8304[anInt8325];
	}

	public final void method5366(Class171 class171) {
		aClass171Array8305[anInt8325] = class171;
		method5368();
	}

	final void method5367() {
		if (aClass171Array8305[anInt8325] != Class171.aClass171_1742) {
			aClass171Array8305[anInt8325] = Class171.aClass171_1742;
			aClass233Array8304[anInt8325].method2172();
			method5368();
		}
	}

	final void method5368() {
		method5486();
	}

	abstract void method5369();

	abstract Interface9_Impl2 method5370(Class55 class55, int i, int i_129_, boolean bool, byte[] is, int i_130_, int i_131_);

	abstract void method5371();

	abstract void method5372();

	public final int method5004(int i, int i_132_) {
		return i | i_132_;
	}

	Class78 method5373() {
		return ((Class_ra_Sub3) this).aClass78_8213;
	}

	public final void hj(int i, int i_133_, int i_134_) {
		if (anInt8332 != i || anInt8233 != i_133_ || anInt8334 != i_134_) {
			anInt8332 = i;
			anInt8233 = i_133_;
			anInt8334 = i_134_;
			method5377();
			method5379();
		}
	}

	public final void fo(int i, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, byte[] is, int i_140_, int i_141_) {
		/* empty */
	}

	public final void O() {
		((Class_ra_Sub3) this).aBoolean8326 = false;
	}

	final void method5374(int i) {
		if (((Class_ra_Sub3) this).anInt8353 != i) {
			Class174 class174;
			boolean bool;
			boolean bool_142_;
			if (i == 1) {
				class174 = Class174.aClass174_1762;
				bool = true;
				bool_142_ = true;
			} else if (i == 2) {
				class174 = Class174.aClass174_1760;
				bool = false;
				bool_142_ = true;
			} else if (i == 128) {
				class174 = Class174.aClass174_1761;
				bool = true;
				bool_142_ = true;
			} else {
				class174 = Class174.aClass174_1763;
				bool = false;
				bool_142_ = false;
			}
			if (bool != aBoolean8309) {
				aBoolean8309 = bool;
				method5375();
			}
			if (bool_142_ != aBoolean8245) {
				aBoolean8245 = bool_142_;
				method5305();
			}
			if (class174 != aClass174_8268) {
				aClass174_8268 = class174;
				method5376();
			}
			((Class_ra_Sub3) this).anInt8353 = i;
			((Class_ra_Sub3) this).anInt8311 &= ~0xc;
		}
	}

	abstract void method5375();

	abstract void method5376();

	public final void method5156(int i, Class78 class78) {
		((Class_ra_Sub3) this).anInt8328 = i;
		((Class_ra_Sub3) this).aClass78_8213 = class78;
		((Class_ra_Sub3) this).aBoolean8326 = true;
	}

	public final void c(int i, int i_143_, int i_144_) {
		if (anInt8332 != i || anInt8233 != i_143_ || anInt8334 != i_144_) {
			anInt8332 = i;
			anInt8233 = i_143_;
			anInt8334 = i_144_;
			method5377();
			method5379();
		}
	}

	final void method5377() {
		if (((Class_ra_Sub3) this).aClass161_8314 != null)
			((Class_ra_Sub3) this).aClass161_8314.method1723();
		method5378();
	}

	abstract void method5378();

	abstract void method5379();

	abstract void method5380(boolean bool);

	abstract Interface7_Impl2 method5381(boolean bool);

	abstract Interface7_Impl1 method5382(boolean bool);

	public int method5099(int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_) {
		int i_150_ = 0;
		float f = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_145_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_146_));
		float f_151_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i_147_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_148_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_149_));
		float f_152_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_145_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_146_));
		float f_153_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i_147_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_148_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_149_));
		if (f < -f_152_ && f_151_ < -f_153_)
			i_150_ |= 0x10;
		else if (f > f_152_ && f_151_ > f_153_)
			i_150_ |= 0x20;
		float f_154_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_145_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_146_));
		float f_155_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i_147_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_148_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_149_));
		if (f_154_ < -f_152_ && f_155_ < -f_153_)
			i_150_ |= 0x1;
		if (f_154_ > f_152_ && f_155_ > f_153_)
			i_150_ |= 0x2;
		float f_156_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_145_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_146_));
		float f_157_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i_147_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_148_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_149_));
		if (f_156_ < -f_152_ && f_157_ < -f_153_)
			i_150_ |= 0x4;
		if (f_156_ > f_152_ && f_157_ > f_153_)
			i_150_ |= 0x8;
		return i_150_;
	}

	public abstract void method5383(int i, Interface7_Impl1 interface7_impl1);

	abstract void method5384(Interface7_Impl2 interface7_impl2);

	public final boolean method5127() {
		return true;
	}

	public abstract boolean method5385();

	public final void method5019(int i, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_) {
		method5091(i, i_158_, i + i_159_, i_158_, i_161_, i_162_);
		method5091(i, i_158_ + i_160_, i + i_159_, i_158_ + i_160_, i_161_, i_162_);
		method5091(i, i_158_, i, i_158_ + i_160_, i_161_, i_162_);
		method5091(i + i_159_, i_158_, i + i_159_, i_158_ + i_160_, i_161_, i_162_);
	}

	public final void N(int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, byte[] is, int i_168_, int i_169_) {
		/* empty */
	}

	public final void method5020(int i, int i_170_, float f, int i_171_, int i_172_, float f_173_, int i_174_, int i_175_, float f_176_, int i_177_, int i_178_, int i_179_, int i_180_) {
		/* empty */
	}

	public final int method5386() {
		return anInt8325;
	}

	public final void XA(int i, int i_181_, int i_182_, int i_183_, int i_184_) {
		method5091(i, i_181_, i + i_182_, i_181_, i_183_, i_184_);
	}

	public final void G(int i, int i_185_, int i_186_, int i_187_, int i_188_) {
		method5091(i, i_185_, i, i_185_ + i_186_, i_187_, i_188_);
	}

	public final void method5091(int i, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_) {
		method4999(i, i_189_, i_190_, i_191_, i_192_, 1, i_193_);
	}

	public void method5039(int i, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_) {
		float f = (float) i_195_ - (float) i;
		float f_202_ = (float) i_196_ - (float) i_194_;
		if (f == 0.0F && f_202_ == 0.0F)
			f = 1.0F;
		else {
			float f_203_ = (float) (1.0 / Math.sqrt((double) (f * f + f_202_ * f_202_)));
			f *= f_203_;
			f_202_ *= f_203_;
		}
		method5337();
		Class161 class161 = ((Class_ra_Sub3) this).aClass161Array8315[13];
		class161.method1713();
		class161.method1715(i_197_);
		method5374(i_198_);
		class161.method1718();
		method5380(false);
		i_201_ %= i_200_ + i_199_;
		float f_204_ = f * (float) i_199_;
		float f_205_ = f_202_ * (float) i_199_;
		float f_206_ = 0.0F;
		float f_207_ = 0.0F;
		float f_208_ = f_204_;
		float f_209_ = f_205_;
		if (i_201_ > i_199_) {
			f_206_ = f * (float) (i_199_ + i_200_ - i_201_);
			f_207_ = f_202_ * (float) (i_199_ + i_200_ - i_201_);
		} else {
			f_208_ = f * (float) (i_199_ - i_201_);
			f_209_ = f_202_ * (float) (i_199_ - i_201_);
		}
		float f_210_ = (float) i + f_206_;
		float f_211_ = (float) i_194_ + f_207_;
		float f_212_ = f * (float) i_200_;
		float f_213_ = f_202_ * (float) i_200_;
		for (;;) {
			if (i_195_ > i) {
				if (f_210_ > (float) i_195_)
					break;
				if (f_210_ + f_208_ > (float) i_195_)
					f_208_ = (float) i_195_ - f_210_;
			} else {
				if (f_210_ < (float) i_195_)
					break;
				if (f_210_ + f_208_ < (float) i_195_)
					f_208_ = (float) i_195_ - f_210_;
			}
			if (i_196_ > i_194_) {
				if (f_211_ > (float) i_196_)
					break;
				if (f_211_ + f_209_ > (float) i_196_)
					f_209_ = (float) i_196_ - f_211_;
			} else {
				if (f_211_ < (float) i_196_)
					break;
				if (f_211_ + f_209_ < (float) i_196_)
					f_209_ = (float) i_196_ - f_211_;
			}
			if (!method5311(f_210_, f_211_, 0.0F, f_210_ + f_208_, f_211_ + f_209_, 0.0F))
				return;
			method5388();
			f_210_ += f_212_ + f_208_;
			f_211_ += f_213_ + f_209_;
			f_208_ = f_204_;
			f_209_ = f_205_;
		}
		method5380(true);
		class161.method1714();
	}

	public void method5007(int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, Class_ta class_ta, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_) {
		/* empty */
	}

	public final void method5022(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, Class_ta class_ta, int i_229_, int i_230_) {
		/* empty */
	}

	Matrix4f method5387() {
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584) {
			if (!((Class_ra_Sub3) this).aBoolean8240)
				method5477();
			return ((Class_ra_Sub3) this).aClass233_8338;
		}
		return ((Class_ra_Sub3) this).aClass233_8227;
	}

	public final void method5042(Class69 class69) {
		((Class_ra_Sub3) this).aClass176_8345.method1829(this, class69);
	}

	final void method5388() {
		method5383(0, ((Class_ra_Sub3) this).anInterface7_Impl1_8343);
		method5455(((Class_ra_Sub3) this).aClass153_8337);
		method5398(Class187.aClass187_1908, 0, 1);
	}

	public final void method5389() {
		method5390(Class187.aClass187_1906, 2);
	}

	final void method5390(Class187 class187, int i) {
		method5383(0, ((Class_ra_Sub3) this).anInterface7_Impl1_8202);
		method5455(((Class_ra_Sub3) this).aClass153_8356);
		method5398(class187, 0, i);
	}

	abstract Interface9_Impl2_Impl1 method5391(Class55 class55, Class77 class77, int i, int i_231_);

	public abstract void method5392(Class187 class187, int i, int i_232_, int i_233_, int i_234_);

	final void method5393() {
		if (((Class_ra_Sub3) this).anInt8311 != 8) {
			method5338();
			method5330(true);
			method5339(true);
			method5399(true);
			method5374(1);
			((Class_ra_Sub3) this).anInt8311 = 8;
		}
	}

	abstract void method5394(int i);

	public final void method5145() {
		if (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626()) {
			((Class_ra_Sub3) this).aClass168_8321.method1795(((Class_ra_Sub3) this).aClass150Array8324[1]);
			((Class_ra_Sub3) this).aClass157_8351.method1697();
		}
	}

	void method5009() {
		if (!((Class_ra_Sub3) this).aBoolean8344) {
			method5306();
			((Class_ra_Sub3) this).aClass157_8351.method1697();
			for (Linkable class298 = ((Class_ra_Sub3) this).aClass458_8222.method5967(1818783198); class298 != null; class298 = ((Class_ra_Sub3) this).aClass458_8222.method5969((byte) -95))
				((Class_v_Sub2) class298).method3675();
			Class216.method2000(false, true, (short) 10441);
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass161Array8315.length; i++) {
				if (((Class_ra_Sub3) this).aClass161Array8315[i] != null) {
					((Class_ra_Sub3) this).aClass161Array8315[i].method1712();
					((Class_ra_Sub3) this).aClass161Array8315[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass150Array8324.length; i++) {
				if (((Class_ra_Sub3) this).aClass150Array8324[i] != null) {
					((Class_ra_Sub3) this).aClass150Array8324[i].method1627();
					((Class_ra_Sub3) this).aClass150Array8324[i] = null;
				}
			}
			method5294();
			method4993(0);
			((Class_ra_Sub3) this).aBoolean8344 = true;
		}
	}

	void method5141() {
		if (!((Class_ra_Sub3) this).aBoolean8344) {
			method5306();
			((Class_ra_Sub3) this).aClass157_8351.method1697();
			for (Linkable class298 = ((Class_ra_Sub3) this).aClass458_8222.method5967(1588081095); class298 != null; class298 = ((Class_ra_Sub3) this).aClass458_8222.method5969((byte) -118))
				((Class_v_Sub2) class298).method3675();
			Class216.method2000(false, true, (short) 26847);
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass161Array8315.length; i++) {
				if (((Class_ra_Sub3) this).aClass161Array8315[i] != null) {
					((Class_ra_Sub3) this).aClass161Array8315[i].method1712();
					((Class_ra_Sub3) this).aClass161Array8315[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass150Array8324.length; i++) {
				if (((Class_ra_Sub3) this).aClass150Array8324[i] != null) {
					((Class_ra_Sub3) this).aClass150Array8324[i].method1627();
					((Class_ra_Sub3) this).aClass150Array8324[i] = null;
				}
			}
			method5294();
			method4993(0);
			((Class_ra_Sub3) this).aBoolean8344 = true;
		}
	}

	void method5068() {
		if (!((Class_ra_Sub3) this).aBoolean8344) {
			method5306();
			((Class_ra_Sub3) this).aClass157_8351.method1697();
			for (Linkable class298 = ((Class_ra_Sub3) this).aClass458_8222.method5967(1339705525); class298 != null; class298 = ((Class_ra_Sub3) this).aClass458_8222.method5969((byte) -26))
				((Class_v_Sub2) class298).method3675();
			Class216.method2000(false, true, (short) -26086);
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass161Array8315.length; i++) {
				if (((Class_ra_Sub3) this).aClass161Array8315[i] != null) {
					((Class_ra_Sub3) this).aClass161Array8315[i].method1712();
					((Class_ra_Sub3) this).aClass161Array8315[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass150Array8324.length; i++) {
				if (((Class_ra_Sub3) this).aClass150Array8324[i] != null) {
					((Class_ra_Sub3) this).aClass150Array8324[i].method1627();
					((Class_ra_Sub3) this).aClass150Array8324[i] = null;
				}
			}
			method5294();
			method4993(0);
			((Class_ra_Sub3) this).aBoolean8344 = true;
		}
	}

	void method5069() {
		if (!((Class_ra_Sub3) this).aBoolean8344) {
			method5306();
			((Class_ra_Sub3) this).aClass157_8351.method1697();
			for (Linkable class298 = ((Class_ra_Sub3) this).aClass458_8222.method5967(1472040998); class298 != null; class298 = ((Class_ra_Sub3) this).aClass458_8222.method5969((byte) 1))
				((Class_v_Sub2) class298).method3675();
			Class216.method2000(false, true, (short) -28220);
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass161Array8315.length; i++) {
				if (((Class_ra_Sub3) this).aClass161Array8315[i] != null) {
					((Class_ra_Sub3) this).aClass161Array8315[i].method1712();
					((Class_ra_Sub3) this).aClass161Array8315[i] = null;
				}
			}
			for (int i = 0; i < ((Class_ra_Sub3) this).aClass150Array8324.length; i++) {
				if (((Class_ra_Sub3) this).aClass150Array8324[i] != null) {
					((Class_ra_Sub3) this).aClass150Array8324[i].method1627();
					((Class_ra_Sub3) this).aClass150Array8324[i] = null;
				}
			}
			method5294();
			method4993(0);
			((Class_ra_Sub3) this).aBoolean8344 = true;
		}
	}

	public void method5174(int i) {
		if (((Class_ra_Sub3) this).aClass157_8351 != null)
			((Class_ra_Sub3) this).aClass157_8351.method1696();
		anInt8342 = i & 0x7fffffff;
	}

	public final int dm() {
		return anInt8224 + anInt8223 + anInt8318;
	}

	abstract void method5395();

	public final boolean method5070() {
		return true;
	}

	public final boolean method5071() {
		return true;
	}

	public final boolean method5072() {
		return true;
	}

	public final boolean method5073() {
		return true;
	}

	public final boolean method5081() {
		return true;
	}

	public final boolean method4994() {
		return true;
	}

	public final boolean method5076() {
		return aBoolean8350;
	}

	public final boolean method5077() {
		return aBoolean8350;
	}

	public final boolean method5078() {
		return true;
	}

	public final void gg(int i, Class_ta class_ta, int i_235_, int i_236_) {
		RA(false);
		((Class_ra_Sub3) this).aClass57_Sub2_8280.method644(0.0F, 0.0F, (float) method4992((short) -12362).method545(), 0.0F, 0.0F, (float) method4992((short) 24584).method552(), 0, class_ta, i_235_, i_236_);
		RA(true);
	}

	public final boolean method5180() {
		return false;
	}

	public abstract float method5396();

	public final void ec(boolean bool) {
		aBoolean8277 = bool;
		method5410();
	}

	public final void method5088(int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_, Class_ta class_ta, int i_242_, int i_243_) {
		/* empty */
	}

	public void ey(float f, float f_244_) {
		((Class_ra_Sub3) this).aFloat8259 = f;
		((Class_ra_Sub3) this).aFloat8260 = f_244_;
		method5322();
	}

	public void ez(float f, float f_245_) {
		((Class_ra_Sub3) this).aFloat8259 = f;
		((Class_ra_Sub3) this).aFloat8260 = f_245_;
		method5322();
	}

	public void el(float f, float f_246_) {
		((Class_ra_Sub3) this).aFloat8259 = f;
		((Class_ra_Sub3) this).aFloat8260 = f_246_;
		method5322();
	}

	public final void eq() {
		if (aClass52_5292 != null) {
			anInt8263 = 0;
			anInt8265 = 0;
			anInt8234 = aClass52_5292.method545();
			anInt8241 = aClass52_5292.method552();
		} else {
			anInt8241 = 0;
			anInt8234 = 0;
			anInt8263 = 0;
			anInt8265 = 0;
		}
		if (aBoolean8254) {
			aBoolean8254 = false;
			method5327();
		}
	}

	public final void ep() {
		if (aClass52_5292 != null) {
			anInt8263 = 0;
			anInt8265 = 0;
			anInt8234 = aClass52_5292.method545();
			anInt8241 = aClass52_5292.method552();
		} else {
			anInt8241 = 0;
			anInt8234 = 0;
			anInt8263 = 0;
			anInt8265 = 0;
		}
		if (aBoolean8254) {
			aBoolean8254 = false;
			method5327();
		}
	}

	public final void ei() {
		if (aClass52_5292 != null) {
			anInt8263 = 0;
			anInt8265 = 0;
			anInt8234 = aClass52_5292.method545();
			anInt8241 = aClass52_5292.method552();
		} else {
			anInt8241 = 0;
			anInt8234 = 0;
			anInt8263 = 0;
			anInt8265 = 0;
		}
		if (aBoolean8254) {
			aBoolean8254 = false;
			method5327();
		}
	}

	public final boolean method4995() {
		return true;
	}

	public final void qa(int[] is) {
		is[0] = anInt8265;
		is[1] = anInt8263;
		is[2] = anInt8234;
		is[3] = anInt8241;
	}

	final void method5397(int i) {
		if (anInt8366 != i) {
			anInt8366 = i;
			method5376();
		}
	}

	public abstract void method5398(Class187 class187, int i, int i_247_);

	public final void eo(int[] is) {
		is[0] = anInt8265;
		is[1] = anInt8263;
		is[2] = anInt8234;
		is[3] = anInt8241;
	}

	public final void er(int[] is) {
		is[0] = anInt8265;
		is[1] = anInt8263;
		is[2] = anInt8234;
		is[3] = anInt8241;
	}

	public final void method5093(int i, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_) {
		method5091(i, i_248_, i + i_249_, i_248_, i_251_, i_252_);
		method5091(i, i_248_ + i_250_, i + i_249_, i_248_ + i_250_, i_251_, i_252_);
		method5091(i, i_248_, i, i_248_ + i_250_, i_251_, i_252_);
		method5091(i + i_249_, i_248_, i + i_249_, i_248_ + i_250_, i_251_, i_252_);
	}

	public final void fa(int i, int i_253_, int i_254_, int i_255_, int i_256_, int i_257_) {
		if (aBoolean8277) {
			RA(false);
			((Class_ra_Sub3) this).aClass57_Sub2_8320.method634(i, i_253_, i_254_, i_255_, 0, i_256_, i_257_);
			RA(true);
		} else
			((Class_ra_Sub3) this).aClass57_Sub2_8320.method634(i, i_253_, i_254_, i_255_, 0, i_256_, i_257_);
	}

	final void method5399(boolean bool) {
		if (bool != aBoolean8237) {
			aBoolean8237 = bool;
			method5410();
			((Class_ra_Sub3) this).anInt8311 &= ~0xf;
		}
	}

	abstract void method5400();

	final void fv(int i, int i_258_, int i_259_, int i_260_, int i_261_) {
		/* empty */
	}

	abstract Class153 method5401(Class181[] class181s);

	public final void ff(int i, int i_262_, int i_263_, int i_264_, int i_265_) {
		method5091(i, i_262_, i + i_263_, i_262_, i_264_, i_265_);
	}

	public final void fd(int i, int i_266_, int i_267_, int i_268_, int i_269_) {
		method5091(i, i_266_, i + i_267_, i_266_, i_268_, i_269_);
	}

	public final void ft(int i, int i_270_, int i_271_, int i_272_, int i_273_) {
		method5091(i, i_270_, i, i_270_ + i_271_, i_272_, i_273_);
	}

	final void method5402() {
		((Class_ra_Sub3) this).aClass159_8220 = new Class159(this);
		fixedFunction = false;
		try {
			((Class_ra_Sub3) this).aClass137_8316 = new Class137_Sub1(this);
			((Class_ra_Sub3) this).aClass138_8257 = new Class138_Sub1(this);
			((Class_ra_Sub3) this).aClass130_8249 = new Class130_Sub2(this);
			((Class_ra_Sub3) this).aClass161_Sub1_Sub2_8319 = new Class161_Sub1_Sub2(this, ((Class_ra_Sub3) this).aClass159_8220, true);
			((Class_ra_Sub3) this).aClass161_Sub1_Sub1_8266 = new Class161_Sub1_Sub1(this, (((Class_ra_Sub3) this).aClass159_8220));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class_ra_Sub3) this).aClass137_8316 = new Class137_Sub2(this);
			((Class_ra_Sub3) this).aClass138_8257 = new Class138_Sub2(this);
			((Class_ra_Sub3) this).aClass130_8249 = new Class130_Sub1(this);
			((Class_ra_Sub3) this).aClass161_Sub1_Sub2_8319 = null;
			((Class_ra_Sub3) this).aClass161_Sub1_Sub1_8266 = null;
			fixedFunction = true;
		}
		int i;
		int i_274_;
		if (aClass52_5292 != null) {
			i_274_ = aClass52_5292.method545();
			i = aClass52_5292.method552();
		} else {
			i = 0;
			i_274_ = 0;
		}
		((Class_ra_Sub3) this).aClass168_8321 = new Class168(this, i_274_, i);
		if (!fixedFunction) {
			((Class_ra_Sub3) this).aClass150Array8324[1] = new Class150_Sub1(this);
			((Class_ra_Sub3) this).aClass168_8321.method1792(((Class_ra_Sub3) this).aClass150Array8324[1]);
		}
		if (((Class_ra_Sub3) this).aClass161_8314 != null) {
			((Class_ra_Sub3) this).aClass161_8314.method1714();
			((Class_ra_Sub3) this).aClass161_8314 = null;
		}
		method5307();
	}

	public void method5086() {
		((Class_ra_Sub3) this).anInt8298 = 0;
		((Class_ra_Sub3) this).anInt8357 = 0;
		((Class_ra_Sub3) this).anInt8269 = aClass52_5292.method545();
		((Class_ra_Sub3) this).anInt8270 = aClass52_5292.method552();
		method5322();
	}

	abstract Interface9_Impl2 method5403(Class55 class55, int i, int i_275_, boolean bool, float[] fs, int i_276_, int i_277_);

	public final void method5096(int i, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, Class_ta class_ta, int i_283_, int i_284_) {
		/* empty */
	}

	public final void method5097(int i, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, Class_ta class_ta, int i_290_, int i_291_) {
		/* empty */
	}

	abstract Class153 method5404(Class181[] class181s);

	public int method5100(int i, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_) {
		int i_297_ = 0;
		float f = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_292_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_293_));
		float f_298_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i_294_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_295_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_296_));
		float f_299_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_292_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_293_));
		float f_300_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i_294_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_295_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_296_));
		if (f < -f_299_ && f_298_ < -f_300_)
			i_297_ |= 0x10;
		else if (f > f_299_ && f_298_ > f_300_)
			i_297_ |= 0x20;
		float f_301_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_292_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_293_));
		float f_302_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i_294_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_295_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_296_));
		if (f_301_ < -f_299_ && f_302_ < -f_300_)
			i_297_ |= 0x1;
		if (f_301_ > f_299_ && f_302_ > f_300_)
			i_297_ |= 0x2;
		float f_303_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_292_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_293_));
		float f_304_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i_294_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_295_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_296_));
		if (f_303_ < -f_299_ && f_304_ < -f_300_)
			i_297_ |= 0x4;
		if (f_303_ > f_299_ && f_304_ > f_300_)
			i_297_ |= 0x8;
		return i_297_;
	}

	public int method5135(int i, int i_305_, int i_306_, int i_307_, int i_308_, int i_309_) {
		int i_310_ = 0;
		float f = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_305_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_306_));
		float f_311_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * (float) i_307_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * (float) i_308_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * (float) i_309_));
		float f_312_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_305_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_306_));
		float f_313_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * (float) i_307_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * (float) i_308_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * (float) i_309_));
		if (f < -f_312_ && f_311_ < -f_313_)
			i_310_ |= 0x10;
		else if (f > f_312_ && f_311_ > f_313_)
			i_310_ |= 0x20;
		float f_314_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_305_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_306_));
		float f_315_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * (float) i_307_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * (float) i_308_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * (float) i_309_));
		if (f_314_ < -f_312_ && f_315_ < -f_313_)
			i_310_ |= 0x1;
		if (f_314_ > f_312_ && f_315_ > f_313_)
			i_310_ |= 0x2;
		float f_316_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_305_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_306_));
		float f_317_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * (float) i_307_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * (float) i_308_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * (float) i_309_));
		if (f_316_ < -f_312_ && f_317_ < -f_313_)
			i_310_ |= 0x4;
		if (f_316_ > f_312_ && f_317_ > f_313_)
			i_310_ |= 0x8;
		return i_310_;
	}

	public final Class_v method5102(int i) {
		Class_v_Sub2 class_v_sub2 = new Class_v_Sub2(i);
		((Class_ra_Sub3) this).aClass458_8222.method5968(class_v_sub2, -68959905);
		return class_v_sub2;
	}

	static {
		aClass233_8225 = new Matrix4f();
	}

	final void CA(int i, int i_318_, int i_319_, int i_320_, int i_321_) {
		/* empty */
	}

	public final int method5118(int i, int i_322_) {
		return i & i_322_ ^ i_322_;
	}

	public final Class57 method5106(int[] is, int i, int i_323_, int i_324_, int i_325_, boolean bool) {
		return new Class57_Sub2(this, i_324_, i_325_, is, i, i_323_);
	}

	abstract void method5405();

	abstract boolean method5406(Class55 class55, Class77 class77);

	public final void method5189(Class66 class66) {
		((Class_ra_Sub3) this).aClass66_Sub2_8284 = (Class66_Sub2) class66;
	}

	public final Class57 method5108(int i, int i_326_, int i_327_, int i_328_, boolean bool) {
		Class57_Sub2 class57_sub2 = new Class57_Sub2(this, i_327_, i_328_, bool, false);
		class57_sub2.method675(0, 0, i_327_, i_328_, i, i_326_);
		return class57_sub2;
	}

	public final Class_ta method5109(int i, int i_329_, int[] is, int[] is_330_) {
		return Class_ta_Sub3.method6007(this, i, i_329_, is, is_330_);
	}

	public final Class_ta method5110(int i, int i_331_, int[] is, int[] is_332_) {
		return Class_ta_Sub3.method6007(this, i, i_331_, is, is_332_);
	}

	public final void go(int i, Class_ta class_ta, int i_333_, int i_334_) {
		RA(false);
		((Class_ra_Sub3) this).aClass57_Sub2_8280.method644(0.0F, 0.0F, (float) method4992((short) 4277).method545(), 0.0F, 0.0F, (float) method4992((short) 16580).method552(), 0, class_ta, i_333_, i_334_);
		RA(true);
	}

	public void GA(float f, float f_335_) {
		((Class_ra_Sub3) this).aFloat8259 = f;
		((Class_ra_Sub3) this).aFloat8260 = f_335_;
		method5322();
	}

	public final void gv(int i, Class_ta class_ta, int i_336_, int i_337_) {
		RA(false);
		((Class_ra_Sub3) this).aClass57_Sub2_8280.method644(0.0F, 0.0F, (float) method4992((short) 2515).method545(), 0.0F, 0.0F, (float) method4992((short) 2414).method552(), 0, class_ta, i_336_, i_337_);
		RA(true);
	}

	public final Class264 method5113(Class505 class505, Class89[] class89s, boolean bool) {
		return new Class264_Sub5(this, class505, class89s, bool);
	}

	public final Class264 method5114(Class505 class505, Class89[] class89s, boolean bool) {
		return new Class264_Sub5(this, class505, class89s, bool);
	}

	public final void method5115(int i) {
		/* empty */
	}

	public final int method5126(int i, int i_338_) {
		return i & i_338_ ^ i_338_;
	}

	final void method5407() {
		if (!((Class_ra_Sub3) this).aBoolean8330)
			((Class_ra_Sub3) this).aBoolean8330 = true;
	}

	public void method5059(float f, float f_339_, float f_340_, float[] fs) {
		float f_341_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * f_339_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * f_340_));
		float f_342_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_339_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_340_));
		if (f_341_ < -f_342_ || f_341_ > f_342_) {
			float[] fs_343_ = fs;
			float[] fs_344_ = fs;
			fs[2] = Float.NaN;
			fs_344_[1] = Float.NaN;
			fs_343_[0] = Float.NaN;
		} else {
			float f_345_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_339_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_340_));
			if (f_345_ < -f_342_ || f_345_ > f_342_) {
				float[] fs_346_ = fs;
				float[] fs_347_ = fs;
				fs[2] = Float.NaN;
				fs_347_[1] = Float.NaN;
				fs_346_[0] = Float.NaN;
			} else {
				float f_348_ = ((((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13]) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1]) * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5]) * f_339_ + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9]) * f_340_);
				if (f_348_ < -f_342_ || f_348_ > f_342_) {
					float[] fs_349_ = fs;
					float[] fs_350_ = fs;
					fs[2] = Float.NaN;
					fs_350_[1] = Float.NaN;
					fs_349_[0] = Float.NaN;
				} else {
					float f_351_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_339_ + aClass233_8230.aFloatArray2594[10] * f_340_);
					fs[0] = (((Class_ra_Sub3) this).aFloat8253 + (((Class_ra_Sub3) this).aFloat8329 * f_345_ / f_342_));
					fs[1] = (((Class_ra_Sub3) this).aFloat8255 + (((Class_ra_Sub3) this).aFloat8256 * f_348_ / f_342_));
					fs[2] = f_351_;
				}
			}
		}
	}

	public Matrix3f method5044() {
		return ((Class_ra_Sub3) this).aClass222_8228;
	}

	public final Class_xa method5122(int i, int i_352_, int[][] is, int[][] is_353_, int i_354_, int i_355_, int i_356_) {
		return new Class_xa_Sub1(this, i_355_, i_356_, i, i_352_, is, is_353_, i_354_);
	}

	abstract Interface7_Impl1 method5408(boolean bool);

	public final Matrix4f method5083() {
		return ((Class_ra_Sub3) this).aClass233_8363;
	}

	public final Matrix3f method5183() {
		return ((Class_ra_Sub3) this).aClass222_8250;
	}

	abstract void method5409(Interface7_Impl2 interface7_impl2);

	public final Matrix3f method5013() {
		return ((Class_ra_Sub3) this).aClass222_8250;
	}

	public final void method4997(int i, Class298_Sub10[] class298_sub10s) {
		for (int i_357_ = 0; i_357_ < i; i_357_++)
			aClass298_Sub10Array8286[i_357_] = class298_sub10s[i_357_];
		anInt8296 = i;
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5346();
	}

	public final void method5128(Class69 class69) {
		((Class_ra_Sub3) this).aClass176_8345.method1829(this, class69);
	}

	abstract void method5410();

	public final void method5130(Matrix3f class222) {
		((Class_ra_Sub3) this).aClass222_8228 = class222;
		aClass233_8230.method2145(((Class_ra_Sub3) this).aClass222_8228);
		((Class_ra_Sub3) this).aClass222_8229.method2070(class222);
		((Class_ra_Sub3) this).aClass222_8229.method2058();
		((Class_ra_Sub3) this).aClass233_8231.method2145(((Class_ra_Sub3) this).aClass222_8229);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5331();
	}

	abstract void method5411();

	public final void method5134(Matrix4f class233) {
		((Class_ra_Sub3) this).aClass233_8246.method2142(class233);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5314();
	}

	abstract void method5412();

	public final void r(int i, int i_358_, int i_359_, int i_360_) {
		int i_361_;
		int i_362_;
		if (aClass52_5292 != null) {
			i_362_ = aClass52_5292.method545();
			i_361_ = aClass52_5292.method552();
		} else {
			i_361_ = 0;
			i_362_ = 0;
		}
		if (i <= 0 && i_359_ >= i_362_ - 1 && i_358_ <= 0 && i_360_ >= i_361_ - 1)
			L();
		else {
			anInt8265 = i >= 0 ? i : 0;
			anInt8234 = i_359_ <= i_362_ ? i_359_ : i_362_;
			anInt8263 = i_358_ >= 0 ? i_358_ : 0;
			anInt8241 = i_360_ <= i_361_ ? i_360_ : i_361_;
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	public final void hs(float f) {
		if (aFloat8291 != f) {
			aFloat8291 = f;
			method5411();
			method5320();
		}
	}

	public final void hb(int i) {
		((Class_ra_Sub3) this).anInt8313 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class_ra_Sub3) this).anInt8313++;
		((Class_ra_Sub3) this).anInt8297 = 1 << ((Class_ra_Sub3) this).anInt8313;
	}

	public final void hv(int i, int i_363_, int i_364_) {
		if (anInt8332 != i || anInt8233 != i_363_ || anInt8334 != i_364_) {
			anInt8332 = i;
			anInt8233 = i_363_;
			anInt8334 = i_364_;
			method5377();
			method5379();
		}
	}

	public final void fu(int i, int i_365_, int i_366_, int i_367_, int i_368_) {
		method5091(i, i_365_, i, i_365_ + i_366_, i_367_, i_368_);
	}

	public final void hn(int i, int i_369_, int i_370_) {
		if (anInt8332 != i || anInt8233 != i_369_ || anInt8334 != i_370_) {
			anInt8332 = i;
			anInt8233 = i_369_;
			anInt8334 = i_370_;
			method5377();
			method5379();
		}
	}

	public final void he(int i, int i_371_, int i_372_) {
		if (anInt8332 != i || anInt8233 != i_371_ || anInt8334 != i_372_) {
			anInt8332 = i;
			anInt8233 = i_371_;
			anInt8334 = i_372_;
			method5377();
			method5379();
		}
	}

	public final void method5131(Matrix3f class222) {
		((Class_ra_Sub3) this).aClass222_8228 = class222;
		aClass233_8230.method2145(((Class_ra_Sub3) this).aClass222_8228);
		((Class_ra_Sub3) this).aClass222_8229.method2070(class222);
		((Class_ra_Sub3) this).aClass222_8229.method2058();
		((Class_ra_Sub3) this).aClass233_8231.method2145(((Class_ra_Sub3) this).aClass222_8229);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5331();
	}

	public final void method5184(boolean bool) {
		/* empty */
	}

	public final Class66 method5140(int i, int i_373_, int i_374_, int i_375_, int i_376_, int i_377_) {
		return new Class66_Sub2_Sub1(this, i, i_373_, i_374_, i_375_, i_376_, i_377_);
	}

	public final Class66 method5181(int i, int i_378_, int i_379_, int i_380_, int i_381_, int i_382_) {
		return new Class66_Sub2_Sub1(this, i, i_378_, i_379_, i_380_, i_381_, i_382_);
	}

	abstract Interface9_Impl2_Impl1 method5413(Class55 class55, Class77 class77, int i, int i_383_);

	public final Class57 method5101(Class89 class89, boolean bool) {
		Class57 class57;
		if (class89.anInt812 != 0 && class89.anInt816 != 0) {
			int[] is = new int[class89.anInt812 * class89.anInt816];
			int i = 0;
			int i_384_ = 0;
			if (class89.aByteArray819 != null) {
				for (int i_385_ = 0; i_385_ < class89.anInt816; i_385_++) {
					for (int i_386_ = 0; i_386_ < class89.anInt812; i_386_++) {
						is[i_384_++] = (class89.aByteArray819[i] << 24 | (class89.anIntArray817[class89.aByteArray818[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_387_ = 0; i_387_ < class89.anInt816; i_387_++) {
					for (int i_388_ = 0; i_388_ < class89.anInt812; i_388_++) {
						int i_389_ = (class89.anIntArray817[class89.aByteArray818[i++] & 0xff]);
						is[i_384_++] = i_389_ != 0 ? ~0xffffff | i_389_ : 0;
					}
				}
			}
			class57 = method5031(is, 0, class89.anInt812, class89.anInt812, class89.anInt816, 2021033350);
		} else
			class57 = method5031(new int[] { 0 }, 0, 1, 1, 1, 739975791);
		class57.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return class57;
	}

	public final int du() {
		return anInt8224 + anInt8223 + anInt8318;
	}

	public final Class57 method5107(Class89 class89, boolean bool) {
		Class57 class57;
		if (class89.anInt812 != 0 && class89.anInt816 != 0) {
			int[] is = new int[class89.anInt812 * class89.anInt816];
			int i = 0;
			int i_390_ = 0;
			if (class89.aByteArray819 != null) {
				for (int i_391_ = 0; i_391_ < class89.anInt816; i_391_++) {
					for (int i_392_ = 0; i_392_ < class89.anInt812; i_392_++) {
						is[i_390_++] = (class89.aByteArray819[i] << 24 | (class89.anIntArray817[class89.aByteArray818[i] & 0xff]));
						i++;
					}
				}
			} else {
				for (int i_393_ = 0; i_393_ < class89.anInt816; i_393_++) {
					for (int i_394_ = 0; i_394_ < class89.anInt812; i_394_++) {
						int i_395_ = (class89.anIntArray817[class89.aByteArray818[i++] & 0xff]);
						is[i_390_++] = i_395_ != 0 ? ~0xffffff | i_395_ : 0;
					}
				}
			}
			class57 = method5031(is, 0, class89.anInt812, class89.anInt812, class89.anInt816, -1575984249);
		} else
			class57 = method5031(new int[] { 0 }, 0, 1, 1, 1, 250272340);
		class57.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return class57;
	}

	public final boolean method5119() {
		return (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626());
	}

	public final boolean method5148() {
		return (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626());
	}

	public final boolean method5149() {
		return (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626());
	}

	public final void method5137(boolean bool) {
		/* empty */
	}

	public void method5414(int i) {
		if (i != anInt8274) {
			anInt8274 = i;
			method5369();
		}
	}

	abstract Interface9_Impl1 method5415(int i, boolean bool, int[][] is);

	abstract Interface9_Impl3 method5416(Class55 class55, int i, int i_396_, int i_397_, boolean bool, byte[] is);

	public final void method5089(int i, Class78 class78) {
		if (!((Class_ra_Sub3) this).aBoolean8326)
			throw new RuntimeException("");
		((Class_ra_Sub3) this).anInt8328 = i;
		((Class_ra_Sub3) this).aClass78_8213 = class78;
		if (((Class_ra_Sub3) this).aBoolean8327) {
			((Class_ra_Sub3) this).aClass161Array8315[3].method1716();
			((Class_ra_Sub3) this).aClass161Array8315[3].method1723();
		}
	}

	public final void ih() {
		((Class_ra_Sub3) this).aBoolean8326 = false;
	}

	public final boolean method5146() {
		return (((Class_ra_Sub3) this).aClass150Array8324[1] != null && ((Class_ra_Sub3) this).aClass150Array8324[1].method1626());
	}

	public final boolean method5082() {
		return true;
	}

	public final void method5158(int i, int i_398_, float f, int i_399_, int i_400_, float f_401_, int i_402_, int i_403_, float f_404_, int i_405_, int i_406_, int i_407_, int i_408_) {
		/* empty */
	}

	public final void method5139(int i, int i_409_, float f, int i_410_, int i_411_, float f_412_, int i_413_, int i_414_, float f_415_, int i_416_, int i_417_, int i_418_, int i_419_) {
		/* empty */
	}

	public final void method5027(Class_v class_v) {
		((Class_ra_Sub3) this).aNativeHeap8221 = ((Class_v_Sub2) (Class_v_Sub2) class_v).aNativeHeap9784;
	}

	final void method5417(boolean bool) {
		if (bool != aBoolean8264) {
			aBoolean8264 = bool;
			method5341();
			((Class_ra_Sub3) this).anInt8311 &= ~0x7;
		}
	}

	public void method5055(float f, float f_420_, float f_421_, float[] fs) {
		float f_422_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * f_420_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * f_421_));
		float f_423_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_420_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_421_));
		if (f_422_ < -f_423_ || f_422_ > f_423_) {
			float[] fs_424_ = fs;
			float[] fs_425_ = fs;
			fs[2] = Float.NaN;
			fs_425_[1] = Float.NaN;
			fs_424_[0] = Float.NaN;
		} else {
			float f_426_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_420_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_421_));
			if (f_426_ < -f_423_ || f_426_ > f_423_) {
				float[] fs_427_ = fs;
				float[] fs_428_ = fs;
				fs[2] = Float.NaN;
				fs_428_[1] = Float.NaN;
				fs_427_[0] = Float.NaN;
			} else {
				float f_429_ = ((((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13]) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1]) * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5]) * f_420_ + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9]) * f_421_);
				if (f_429_ < -f_423_ || f_429_ > f_423_) {
					float[] fs_430_ = fs;
					float[] fs_431_ = fs;
					fs[2] = Float.NaN;
					fs_431_[1] = Float.NaN;
					fs_430_[0] = Float.NaN;
				} else {
					float f_432_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_420_ + aClass233_8230.aFloatArray2594[10] * f_421_);
					fs[0] = (((Class_ra_Sub3) this).aFloat8253 + (((Class_ra_Sub3) this).aFloat8329 * f_426_ / f_423_));
					fs[1] = (((Class_ra_Sub3) this).aFloat8255 + (((Class_ra_Sub3) this).aFloat8256 * f_429_ / f_423_));
					fs[2] = f_432_;
				}
			}
		}
	}

	public void method5164(float f, float f_433_, float f_434_, float[] fs) {
		float f_435_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[14] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[2] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[6] * f_433_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[10] * f_434_));
		float f_436_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_433_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_434_));
		if (f_435_ < -f_436_ || f_435_ > f_436_) {
			float[] fs_437_ = fs;
			float[] fs_438_ = fs;
			fs[2] = Float.NaN;
			fs_438_[1] = Float.NaN;
			fs_437_[0] = Float.NaN;
		} else {
			float f_439_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_433_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_434_));
			if (f_439_ < -f_436_ || f_439_ > f_436_) {
				float[] fs_440_ = fs;
				float[] fs_441_ = fs;
				fs[2] = Float.NaN;
				fs_441_[1] = Float.NaN;
				fs_440_[0] = Float.NaN;
			} else {
				float f_442_ = ((((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13]) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1]) * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5]) * f_433_ + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9]) * f_434_);
				if (f_442_ < -f_436_ || f_442_ > f_436_) {
					float[] fs_443_ = fs;
					float[] fs_444_ = fs;
					fs[2] = Float.NaN;
					fs_444_[1] = Float.NaN;
					fs_443_[0] = Float.NaN;
				} else {
					float f_445_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_433_ + aClass233_8230.aFloatArray2594[10] * f_434_);
					fs[0] = (((Class_ra_Sub3) this).aFloat8253 + (((Class_ra_Sub3) this).aFloat8329 * f_439_ / f_436_));
					fs[1] = (((Class_ra_Sub3) this).aFloat8255 + (((Class_ra_Sub3) this).aFloat8256 * f_442_ / f_436_));
					fs[2] = f_445_;
				}
			}
		}
	}

	public final boolean method5166() {
		return ((Class_ra_Sub3) this).aClass150Array8324[1] != null;
	}

	public final void method5167(int i, int i_446_, int i_447_, int i_448_, int i_449_, int i_450_) {
		method4999(i, i_446_, i_447_, i_448_, i_449_, 1, i_450_);
	}

	abstract void method5418();

	final void method5419() {
		((Class_ra_Sub3) this).aBoolean8242 = false;
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1583) {
			method5443();
			method5314();
		}
	}

	public final int method5170(int i, int i_451_) {
		return i | i_451_;
	}

	public void method5090(int i, int i_452_, int i_453_, int i_454_) {
		((Class_ra_Sub3) this).anInt8298 = i;
		((Class_ra_Sub3) this).anInt8357 = i_452_;
		((Class_ra_Sub3) this).anInt8269 = i_453_;
		((Class_ra_Sub3) this).anInt8270 = i_454_;
		method5322();
	}

	public final void iv() {
		((Class_ra_Sub3) this).aBoolean8326 = false;
	}

	public final Matrix4f method5172() {
		return ((Class_ra_Sub3) this).aClass233_8246;
	}

	final void method5420() {
		((Class_ra_Sub3) this).anInterface7_Impl1_8354 = method5382(false);
		((Class_ra_Sub3) this).anInterface7_Impl1_8354.method72(3096, 12);
		aByteBuffer8216.clear();
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		aByteBuffer8216.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_455_ = (float) Math.sin(d);
			aByteBuffer8216.putFloat(f_455_);
			aByteBuffer8216.putFloat(f);
			aByteBuffer8216.putFloat(0.0F);
		}
		((Class_ra_Sub3) this).anInterface7_Impl1_8354.method63(0, aByteBuffer8216.position(), aLong8217);
	}

	public final void fi(int i, int i_456_, int i_457_, int i_458_, int i_459_, int i_460_, byte[] is, int i_461_, int i_462_) {
		/* empty */
	}

	public final Class66 method5084(int i, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_) {
		return new Class66_Sub2_Sub1(this, i, i_463_, i_464_, i_465_, i_466_, i_467_);
	}

	public static boolean method5421() {
		return Class85.method955(-1541888660).method265("jaclib", 377960072);
	}

	abstract void method5422();

	public final int method5024(int i, int i_468_) {
		return i & i_468_ ^ i_468_;
	}

	final void method5150(float f, float f_469_, float f_470_, float f_471_, float f_472_, float f_473_) {
		Class150_Sub1.aFloat7011 = f;
		Class150_Sub1.aFloat7013 = f_469_;
		Class150_Sub1.aFloat7012 = f_470_;
		Class150_Sub1.aFloat7015 = f_473_;
	}

	public abstract boolean method5423();

	public abstract boolean method5424();

	public abstract boolean method5425();

	public abstract boolean method5426();

	public final int method5017(int i, int i_474_) {
		return i & i_474_ ^ i_474_;
	}

	abstract void method5427(int i, Class183 class183, boolean bool, boolean bool_475_);

	abstract void method5428();

	public final void method5154() {
		((Class_ra_Sub3) this).aClass168_8321.method1794();
	}

	abstract void method5429();

	public final boolean method5079() {
		return true;
	}

	abstract void method5430();

	public final void L() {
		if (aClass52_5292 != null) {
			anInt8263 = 0;
			anInt8265 = 0;
			anInt8234 = aClass52_5292.method545();
			anInt8241 = aClass52_5292.method552();
		} else {
			anInt8241 = 0;
			anInt8234 = 0;
			anInt8263 = 0;
			anInt8265 = 0;
		}
		if (aBoolean8254) {
			aBoolean8254 = false;
			method5327();
		}
	}

	Matrix4f method5431() {
		return ((Class_ra_Sub3) this).aClass233_8227;
	}

	abstract void method5432();

	abstract Interface9_Impl2 method5433(Class55 class55, Class77 class77, int i, int i_476_);

	public abstract float method5434();

	public abstract float method5435();

	public final void method5103(Class_v class_v) {
		((Class_ra_Sub3) this).aNativeHeap8221 = ((Class_v_Sub2) (Class_v_Sub2) class_v).aNativeHeap9784;
	}

	public abstract float method5436();

	abstract void method5437();

	public final void hg(int i, float f, float f_477_, float f_478_, float f_479_, float f_480_) {
		boolean bool = ((Class_ra_Sub3) this).anInt8287 != i;
		if (bool || aFloat8364 != f || aFloat8293 != f_477_) {
			((Class_ra_Sub3) this).anInt8287 = i;
			aFloat8364 = f;
			aFloat8293 = f_477_;
			if (bool) {
				aFloat8362 = (float) (((Class_ra_Sub3) this).anInt8287 & 0xff0000) / 1.671168E7F;
				aFloat8289 = (float) (((Class_ra_Sub3) this).anInt8287 & 0xff00) / 65280.0F;
				aFloat8290 = ((float) (((Class_ra_Sub3) this).anInt8287 & 0xff) / 255.0F);
				method5411();
			}
			method5343();
		}
		if (((Class_ra_Sub3) this).aFloatArray8285[0] != f_478_ || ((Class_ra_Sub3) this).aFloatArray8285[1] != f_479_ || ((Class_ra_Sub3) this).aFloatArray8285[2] != f_480_) {
			((Class_ra_Sub3) this).aFloatArray8285[0] = f_478_;
			((Class_ra_Sub3) this).aFloatArray8285[1] = f_479_;
			((Class_ra_Sub3) this).aFloatArray8285[2] = f_480_;
			((Class_ra_Sub3) this).aFloatArray8340[0] = -f_478_;
			((Class_ra_Sub3) this).aFloatArray8340[1] = -f_479_;
			((Class_ra_Sub3) this).aFloatArray8340[2] = -f_480_;
			float f_481_ = (float) (1.0 / Math.sqrt((double) (f_478_ * f_478_ + f_479_ * f_479_ + f_480_ * f_480_)));
			aFloatArray8283[0] = f_478_ * f_481_;
			aFloatArray8283[1] = f_479_ * f_481_;
			aFloatArray8283[2] = f_480_ * f_481_;
			aFloatArray8248[0] = -aFloatArray8283[0];
			aFloatArray8248[1] = -aFloatArray8283[1];
			aFloatArray8248[2] = -aFloatArray8283[2];
			method5422();
			((Class_ra_Sub3) this).anInt8299 = (int) (f_478_ * 256.0F / f_479_);
			((Class_ra_Sub3) this).anInt8317 = (int) (f_480_ * 256.0F / f_479_);
		}
		method5320();
	}

	public final void method5153() {
		((Class_ra_Sub3) this).aClass168_8321.method1794();
	}

	final boolean method5438() {
		return fixedFunction;
	}

	abstract Interface9_Impl2 method5439(Class55 class55, int i, int i_482_, boolean bool, byte[] is, int i_483_, int i_484_);

	public final void method5058(int i, Class78 class78) {
		if (!((Class_ra_Sub3) this).aBoolean8326)
			throw new RuntimeException("");
		((Class_ra_Sub3) this).anInt8328 = i;
		((Class_ra_Sub3) this).aClass78_8213 = class78;
		if (((Class_ra_Sub3) this).aBoolean8327) {
			((Class_ra_Sub3) this).aClass161Array8315[3].method1716();
			((Class_ra_Sub3) this).aClass161Array8315[3].method1723();
		}
	}

	public final boolean method5111() {
		return true;
	}

	public final void em(boolean bool) {
		aBoolean8277 = bool;
		method5410();
	}

	public final Matrix3f method5008() {
		return ((Class_ra_Sub3) this).aClass222_8250;
	}

	public final void ed(int i, int i_485_, int i_486_, int i_487_) {
		int i_488_;
		int i_489_;
		if (aClass52_5292 != null) {
			i_489_ = aClass52_5292.method545();
			i_488_ = aClass52_5292.method552();
		} else {
			i_488_ = 0;
			i_489_ = 0;
		}
		if (i <= 0 && i_486_ >= i_489_ - 1 && i_485_ <= 0 && i_487_ >= i_488_ - 1)
			L();
		else {
			anInt8265 = i >= 0 ? i : 0;
			anInt8234 = i_486_ <= i_489_ ? i_486_ : i_489_;
			anInt8263 = i_485_ >= 0 ? i_485_ : 0;
			anInt8241 = i_487_ <= i_488_ ? i_487_ : i_488_;
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	abstract void method5440();

	abstract void method5441();

	abstract void method5442();

	final void method5443() {
		if (!((Class_ra_Sub3) this).aBoolean8242) {
			int i;
			int i_490_;
			if (aClass52_5292 != null) {
				i_490_ = aClass52_5292.method545();
				i = aClass52_5292.method552();
			} else {
				i = 0;
				i_490_ = 0;
			}
			Matrix4f class233 = ((Class_ra_Sub3) this).aClass233_8243;
			if (i_490_ != 0 && i != 0)
				class233.method2151(0.0F, (float) i_490_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				class233.method2172();
			((Class_ra_Sub3) this).aClass233_8244.method2142(class233);
			method5335(((Class_ra_Sub3) this).aClass233_8244);
			((Class_ra_Sub3) this).aBoolean8242 = true;
		}
	}

	abstract void method5444();

	public void method5098(int i, int i_491_, int i_492_, int i_493_, int i_494_, int i_495_, Class_ta class_ta, int i_496_, int i_497_, int i_498_, int i_499_, int i_500_) {
		/* empty */
	}

	final void fm(int i, int i_501_, int i_502_, int i_503_, int i_504_) {
		/* empty */
	}

	public abstract void method5445(Matrix4f class233);

	public abstract void method5446(Matrix4f class233);

	public final void method5168(int i, int i_505_, int i_506_, int i_507_, int i_508_, int i_509_, int i_510_) {
		i += 1.0F;
		i_505_ += 1.0F;
		i_506_ += 1.0F;
		i_507_ += 1.0F;
		float f = (float) (i_506_ - i);
		float f_511_ = (float) (i_507_ - i_505_);
		float f_512_ = 1.0F / (float) Math.sqrt((double) (f * f + f_511_ * f_511_));
		f *= f_512_;
		f_511_ *= f_512_;
		i -= f;
		i_505_ -= f_511_;
		float f_513_ = -f_511_;
		float f_514_ = f;
		f_513_ *= 0.5F * (float) i_509_;
		f_514_ *= 0.5F * (float) i_509_;
		((Class_ra_Sub3) this).aClass57_Sub2_8320.method641((float) i - f_513_, (float) i_505_ - f_514_, (float) i_506_ - f_513_, (float) i_507_ - f_514_, (float) i + f_513_, (float) i_505_ + f_514_, 0, i_508_, i_510_);
	}

	abstract Class153 method5447(Class181[] class181s);

	public final void method5133(Matrix4f class233) {
		((Class_ra_Sub3) this).aClass233_8246.method2142(class233);
		method5503();
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584)
			method5314();
	}

	public void method5162(float f, float f_515_, float f_516_, float[] fs) {
		float f_517_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_515_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_516_));
		float f_518_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_515_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_516_));
		float f_519_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * f_515_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * f_516_));
		float f_520_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_515_ + aClass233_8230.aFloatArray2594[10] * f_516_);
		fs[0] = (((Class_ra_Sub3) this).aFloat8253 + ((Class_ra_Sub3) this).aFloat8329 * f_518_ / f_517_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8255 + ((Class_ra_Sub3) this).aFloat8256 * f_519_ / f_517_);
		fs[2] = f_520_;
	}

	public final void B(int i, int i_521_, int i_522_, int i_523_, int i_524_, int i_525_) {
		if (aBoolean8277) {
			RA(false);
			((Class_ra_Sub3) this).aClass57_Sub2_8320.method634(i, i_521_, i_522_, i_523_, 0, i_524_, i_525_);
			RA(true);
		} else
			((Class_ra_Sub3) this).aClass57_Sub2_8320.method634(i, i_521_, i_522_, i_523_, 0, i_524_, i_525_);
	}

	public void method5187(int i, int i_526_, int i_527_, int i_528_) {
		((Class_ra_Sub3) this).anInt8298 = i;
		((Class_ra_Sub3) this).anInt8357 = i_526_;
		((Class_ra_Sub3) this).anInt8269 = i_527_;
		((Class_ra_Sub3) this).anInt8270 = i_528_;
		method5322();
	}

	abstract void method5448();

	public final Class57 method5033(int i, int i_529_, int i_530_, int i_531_, boolean bool) {
		Class57_Sub2 class57_sub2 = new Class57_Sub2(this, i_530_, i_531_, bool, false);
		class57_sub2.method675(0, 0, i_530_, i_531_, i, i_529_);
		return class57_sub2;
	}

	public abstract void method5449(Class187 class187, int i, int i_532_, int i_533_, int i_534_);

	public final Class_xa method5087(int i, int i_535_, int[][] is, int[][] is_536_, int i_537_, int i_538_, int i_539_) {
		return new Class_xa_Sub1(this, i_538_, i_539_, i, i_535_, is, is_536_, i_537_);
	}

	final void method5450() {
		method5411();
		method5343();
		method5341();
		method5346();
		method5422();
		method5320();
		method5345();
		method5340();
		method5410();
		method5379();
		method5378();
		method5305();
		method5376();
		method5375();
		for (int i = anInt8347 - 1; i >= 0; i--) {
			method5357(i);
			method5372();
			method5444();
			method5367();
		}
		method5369();
		method5325();
	}

	abstract void method5451();

	abstract void method5452();

	abstract Interface9_Impl2 method5453(Class55 class55, int i, int i_540_, boolean bool, float[] fs, int i_541_, int i_542_);

	abstract void method5454();

	public void method5161(float f, float f_543_, float f_544_, float[] fs) {
		float f_545_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_543_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_544_));
		float f_546_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_543_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_544_));
		float f_547_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * f_543_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * f_544_));
		float f_548_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_543_ + aClass233_8230.aFloatArray2594[10] * f_544_);
		fs[0] = (((Class_ra_Sub3) this).aFloat8253 + ((Class_ra_Sub3) this).aFloat8329 * f_546_ / f_545_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8255 + ((Class_ra_Sub3) this).aFloat8256 * f_547_ / f_545_);
		fs[2] = f_548_;
	}

	public abstract void method5455(Class153 class153);

	public void method5160(float f, float f_549_, float f_550_, float[] fs) {
		float f_551_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[15] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[3] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[7] * f_549_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[11] * f_550_));
		float f_552_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[12] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[0] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[4] * f_549_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[8] * f_550_));
		float f_553_ = (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[13] + ((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[1] * f + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[5] * f_549_) + (((Class_ra_Sub3) this).aClass233_8205.aFloatArray2594[9] * f_550_));
		float f_554_ = (aClass233_8230.aFloatArray2594[14] + aClass233_8230.aFloatArray2594[2] * f + aClass233_8230.aFloatArray2594[6] * f_549_ + aClass233_8230.aFloatArray2594[10] * f_550_);
		fs[0] = (((Class_ra_Sub3) this).aFloat8253 + ((Class_ra_Sub3) this).aFloat8329 * f_552_ / f_551_);
		fs[1] = (((Class_ra_Sub3) this).aFloat8255 + ((Class_ra_Sub3) this).aFloat8256 * f_553_ / f_551_);
		fs[2] = f_554_;
	}

	abstract void method5456();

	abstract void method5457();

	abstract void method5458();

	abstract void method5459();

	Class_ra_Sub3(Interface_ma interface_ma, Class243 class243, int i, int i_555_) {
		super(interface_ma);
		((Class_ra_Sub3) this).aClass222_8235 = new Matrix3f();
		aClass233_8236 = new Matrix4f();
		((Class_ra_Sub3) this).aClass233_8204 = new Matrix4f();
		((Class_ra_Sub3) this).aClass217_8238 = new Class217();
		((Class_ra_Sub3) this).aFloatArray8312 = new float[4];
		((Class_ra_Sub3) this).aBoolean8240 = false;
		((Class_ra_Sub3) this).aClass149_8262 = Class149.aClass149_1582;
		((Class_ra_Sub3) this).aBoolean8242 = false;
		((Class_ra_Sub3) this).aClass233_8243 = new Matrix4f();
		((Class_ra_Sub3) this).aClass233_8244 = new Matrix4f();
		((Class_ra_Sub3) this).aBoolean8330 = false;
		((Class_ra_Sub3) this).aClass233_8246 = new Matrix4f();
		((Class_ra_Sub3) this).aClass233_8247 = new Matrix4f();
		((Class_ra_Sub3) this).aClass233_8209 = ((Class_ra_Sub3) this).aClass233_8247;
		aClass233_8333 = new Matrix4f();
		((Class_ra_Sub3) this).aClass233_8205 = new Matrix4f();
		aClass233_8251 = new Matrix4f();
		((Class_ra_Sub3) this).aFloatArrayArray8252 = new float[6][4];
		aFloat8335 = 0.0F;
		aFloat8258 = 1.0F;
		((Class_ra_Sub3) this).aFloat8259 = 0.0F;
		((Class_ra_Sub3) this).aFloat8260 = 1.0F;
		aFloat8261 = 50.0F;
		aFloat8308 = 3584.0F;
		anInt8263 = 0;
		anInt8241 = 0;
		anInt8265 = 0;
		anInt8234 = 0;
		((Class_ra_Sub3) this).anInt8298 = 0;
		((Class_ra_Sub3) this).anInt8357 = 0;
		((Class_ra_Sub3) this).anInt8269 = 0;
		((Class_ra_Sub3) this).anInt8270 = 0;
		anInt8339 = 0;
		anInt8272 = 0;
		anInt8273 = 0;
		anInt8239 = 0;
		anInt8275 = 0;
		anInt8276 = 0;
		aBoolean8277 = true;
		aBoolean8237 = false;
		aBoolean8279 = false;
		aBoolean8264 = false;
		aBoolean8281 = true;
		aBoolean8282 = false;
		aFloatArray8283 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray8248 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		((Class_ra_Sub3) this).aFloatArray8285 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class_ra_Sub3) this).aFloatArray8340 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class_ra_Sub3) this).anInt8287 = 16777215;
		aFloat8362 = 1.0F;
		aFloat8289 = 1.0F;
		aFloat8290 = 1.0F;
		aFloat8291 = 1.0F;
		aFloat8364 = -1.0F;
		aFloat8293 = -1.0F;
		((Class_ra_Sub3) this).anInt8297 = 8;
		((Class_ra_Sub3) this).anInt8313 = 3;
		((Class_ra_Sub3) this).anInt8271 = 128;
		anInt8325 = 0;
		((Class_ra_Sub3) this).aClass161Array8315 = new Class161[16];
		((Class_ra_Sub3) this).aClass150Array8324 = new Class150[2];
		((Class_ra_Sub3) this).aBoolean8327 = false;
		aBoolean8331 = true;
		anInt8332 = -1;
		anInt8233 = -1;
		anInt8334 = 0;
		((Class_ra_Sub3) this).anInt8353 = 1;
		aClass174_8268 = Class174.aClass174_1762;
		aBoolean8245 = true;
		aBoolean8309 = true;
		((Class_ra_Sub3) this).aBoolean8344 = false;
		new Stream();
		((Class_ra_Sub3) this).aClass387_Sub3Array8288 = new Class387_Sub3[7];
		((Class_ra_Sub3) this).aClass387_Sub3Array8267 = new Class387_Sub3[7];
		((Class_ra_Sub3) this).aClass233_8363 = new Matrix4f();
		((Class_ra_Sub3) this).aClass222_8250 = new Matrix3f();
		anInt8366 = -1;
		try {
			((Class_ra_Sub3) this).aClass243_8361 = class243;
			anInt8341 = i;
			((Class_ra_Sub3) this).anInt8346 = i_555_;
			Class374_Sub1.method4640(false, true, -162450455);
			if (anInterface_ma5299 != null)
				((Class_ra_Sub3) this).aClass157_8351 = new Class157(this, anInterface_ma5299);
			else
				((Class_ra_Sub3) this).aClass157_8351 = null;
			if (((Class_ra_Sub3) this).anInt8346 == 0)
				((Class_ra_Sub3) this).anIntArray8215 = Class294.anIntArray3165;
			else
				((Class_ra_Sub3) this).anIntArray8215 = Class379.anIntArray4098;
			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				anUnsafe8219 = (Unsafe) field.get(null);
			} catch (Exception exception) {
				/* empty */
			}
			aByteBuffer8216 = ByteBuffer.allocateDirect(4194304);
			aByteBuffer8216.order(ByteOrder.nativeOrder());
			aLong8217 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer8216);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method5136(887833658);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
		method5027(method5026(131072));
	}

	abstract void method5460();

	public final Class57 method5105(int[] is, int i, int i_556_, int i_557_, int i_558_, boolean bool) {
		return new Class57_Sub2(this, i_557_, i_558_, is, i, i_556_);
	}

	public final void method5175() {
		((Class_ra_Sub3) this).aClass168_8321.method1794();
	}

	public final void method4999(int i, int i_559_, int i_560_, int i_561_, int i_562_, int i_563_, int i_564_) {
		i += 1.0F;
		i_559_ += 1.0F;
		i_560_ += 1.0F;
		i_561_ += 1.0F;
		float f = (float) (i_560_ - i);
		float f_565_ = (float) (i_561_ - i_559_);
		float f_566_ = 1.0F / (float) Math.sqrt((double) (f * f + f_565_ * f_565_));
		f *= f_566_;
		f_565_ *= f_566_;
		i -= f;
		i_559_ -= f_565_;
		float f_567_ = -f_565_;
		float f_568_ = f;
		f_567_ *= 0.5F * (float) i_563_;
		f_568_ *= 0.5F * (float) i_563_;
		((Class_ra_Sub3) this).aClass57_Sub2_8320.method641((float) i - f_567_, (float) i_559_ - f_568_, (float) i_560_ - f_567_, (float) i_561_ - f_568_, (float) i + f_567_, (float) i_559_ + f_568_, 0, i_562_, i_564_);
	}

	abstract boolean method5461(Class55 class55, Class77 class77);

	abstract boolean method5462(Class55 class55, Class77 class77);

	void method5463() {
		method5292(7);
		method5450();
	}

	abstract boolean method5464(Class55 class55, Class77 class77);

	abstract boolean method5465(Class55 class55, Class77 class77);

	abstract boolean method5466(Class55 class55, Class77 class77);

	public final void method5467() {
		if (((Class_ra_Sub3) this).anInt8311 != 2) {
			method5337();
			method5330(false);
			method5417(false);
			method5339(false);
			method5399(false);
			((Class_ra_Sub3) this).anInt8311 = 2;
		}
	}

	abstract Interface9_Impl2 method5468(Class55 class55, int i, int i_569_, boolean bool, byte[] is, int i_570_, int i_571_);

	abstract void method5469();

	abstract Interface9_Impl2 method5470(Class55 class55, int i, int i_572_, boolean bool, float[] fs, int i_573_, int i_574_);

	abstract Interface9_Impl2 method5471(Class55 class55, int i, int i_575_, boolean bool, float[] fs, int i_576_, int i_577_);

	abstract Interface9_Impl2 method5472(Class55 class55, int i, int i_578_, boolean bool, float[] fs, int i_579_, int i_580_);

	public final boolean method4998() {
		return true;
	}

	abstract Interface9_Impl2 method5473(int i, int i_581_, boolean bool, int[] is, int i_582_, int i_583_);

	abstract Interface9_Impl2 method5474(int i, int i_584_, boolean bool, int[] is, int i_585_, int i_586_);

	abstract Interface9_Impl1 method5475(int i, boolean bool, int[][] is);

	abstract Interface9_Impl1 method5476(int i, boolean bool, int[][] is);

	Matrix3f method5477() {
		if (((Class_ra_Sub3) this).aClass149_8262 == Class149.aClass149_1584) {
			if (!((Class_ra_Sub3) this).aBoolean8240) {
				((Class_ra_Sub3) this).aClass222_8232.method2070(((Class_ra_Sub3) this).aClass222_8226);
				((Class_ra_Sub3) this).aClass222_8232.method2073(((Class_ra_Sub3) this).aClass222_8228);
				((Class_ra_Sub3) this).aClass233_8338.method2145(((Class_ra_Sub3) this).aClass222_8232);
				((Class_ra_Sub3) this).aBoolean8240 = true;
			}
			return ((Class_ra_Sub3) this).aClass222_8232;
		}
		return ((Class_ra_Sub3) this).aClass222_8226;
	}

	abstract Interface9_Impl3 method5478(Class55 class55, int i, int i_587_, int i_588_, boolean bool, byte[] is);

	abstract Interface9_Impl2_Impl1 method5479(Class55 class55, Class77 class77, int i, int i_589_);

	public abstract void method5480();

	abstract void method5481();

	abstract void method5482(int i, Class183 class183, boolean bool, boolean bool_590_);

	public abstract boolean method5483();

	public final void fl(int i, int i_591_, int i_592_, int i_593_, int i_594_) {
		method5091(i, i_591_, i, i_591_ + i_592_, i_593_, i_594_);
	}

	public final Class66 method5185(int i, int i_595_, int i_596_, int i_597_, int i_598_, int i_599_) {
		return new Class66_Sub2_Sub1(this, i, i_595_, i_596_, i_597_, i_598_, i_599_);
	}

	abstract void method5484(int i, Class183 class183, boolean bool);

	abstract void method5485(int i, Class183 class183, boolean bool);

	abstract void method5486();

	public final void hu(float f) {
		if (aFloat8291 != f) {
			aFloat8291 = f;
			method5411();
			method5320();
		}
	}

	abstract void method5487();

	abstract void method5488();

	abstract void method5489();

	abstract void method5490();

	abstract void method5491();

	abstract void method5492();

	abstract void method5493();

	abstract void method5494();

	abstract void method5495();

	abstract void method5496();

	public void method5038(int i, int i_600_, int i_601_, int i_602_, int i_603_, int i_604_, int i_605_, int i_606_, int i_607_) {
		float f = (float) i_601_ - (float) i;
		float f_608_ = (float) i_602_ - (float) i_600_;
		if (f == 0.0F && f_608_ == 0.0F)
			f = 1.0F;
		else {
			float f_609_ = (float) (1.0 / Math.sqrt((double) (f * f + f_608_ * f_608_)));
			f *= f_609_;
			f_608_ *= f_609_;
		}
		method5337();
		Class161 class161 = ((Class_ra_Sub3) this).aClass161Array8315[13];
		class161.method1713();
		class161.method1715(i_603_);
		method5374(i_604_);
		class161.method1718();
		method5380(false);
		i_607_ %= i_606_ + i_605_;
		float f_610_ = f * (float) i_605_;
		float f_611_ = f_608_ * (float) i_605_;
		float f_612_ = 0.0F;
		float f_613_ = 0.0F;
		float f_614_ = f_610_;
		float f_615_ = f_611_;
		if (i_607_ > i_605_) {
			f_612_ = f * (float) (i_605_ + i_606_ - i_607_);
			f_613_ = f_608_ * (float) (i_605_ + i_606_ - i_607_);
		} else {
			f_614_ = f * (float) (i_605_ - i_607_);
			f_615_ = f_608_ * (float) (i_605_ - i_607_);
		}
		float f_616_ = (float) i + f_612_;
		float f_617_ = (float) i_600_ + f_613_;
		float f_618_ = f * (float) i_606_;
		float f_619_ = f_608_ * (float) i_606_;
		for (;;) {
			if (i_601_ > i) {
				if (f_616_ > (float) i_601_)
					break;
				if (f_616_ + f_614_ > (float) i_601_)
					f_614_ = (float) i_601_ - f_616_;
			} else {
				if (f_616_ < (float) i_601_)
					break;
				if (f_616_ + f_614_ < (float) i_601_)
					f_614_ = (float) i_601_ - f_616_;
			}
			if (i_602_ > i_600_) {
				if (f_617_ > (float) i_602_)
					break;
				if (f_617_ + f_615_ > (float) i_602_)
					f_615_ = (float) i_602_ - f_617_;
			} else {
				if (f_617_ < (float) i_602_)
					break;
				if (f_617_ + f_615_ < (float) i_602_)
					f_615_ = (float) i_602_ - f_617_;
			}
			if (!method5311(f_616_, f_617_, 0.0F, f_616_ + f_614_, f_617_ + f_615_, 0.0F))
				return;
			method5388();
			f_616_ += f_618_ + f_614_;
			f_617_ += f_619_ + f_615_;
			f_614_ = f_610_;
			f_615_ = f_611_;
		}
		method5380(true);
		class161.method1714();
	}

	abstract void method5497();

	public final int method5177() {
		return anInt8348 - 2;
	}

	abstract void method5498(int i);

	abstract void method5499(int i);

	abstract void method5500();

	abstract void method5501();

	abstract void method5502();

	final void method5503() {
		((Class_ra_Sub3) this).aClass233_8205.method2142(aClass233_8230);
		((Class_ra_Sub3) this).aClass233_8205.method2144(((Class_ra_Sub3) this).aClass233_8246);
		((Class_ra_Sub3) this).aClass233_8205.method2157(((Class_ra_Sub3) this).aFloatArrayArray8252[0]);
		((Class_ra_Sub3) this).aClass233_8205.method2158(((Class_ra_Sub3) this).aFloatArrayArray8252[1]);
		((Class_ra_Sub3) this).aClass233_8205.method2156(((Class_ra_Sub3) this).aFloatArrayArray8252[2]);
		((Class_ra_Sub3) this).aClass233_8205.method2170(((Class_ra_Sub3) this).aFloatArrayArray8252[3]);
		((Class_ra_Sub3) this).aClass233_8205.method2171(((Class_ra_Sub3) this).aFloatArrayArray8252[4]);
		((Class_ra_Sub3) this).aClass233_8205.method2163(((Class_ra_Sub3) this).aFloatArrayArray8252[5]);
		aClass233_8251.method2142(((Class_ra_Sub3) this).aClass233_8205);
		method5335(aClass233_8251);
	}

	public final void method5057(int i, Class78 class78) {
		((Class_ra_Sub3) this).anInt8328 = i;
		((Class_ra_Sub3) this).aClass78_8213 = class78;
		((Class_ra_Sub3) this).aBoolean8326 = true;
	}

	public final Class_xa method5123(int i, int i_620_, int[][] is, int[][] is_621_, int i_622_, int i_623_, int i_624_) {
		return new Class_xa_Sub1(this, i_623_, i_624_, i, i_620_, is, is_621_, i_622_);
	}

	abstract void method5504();

	public final void DA(int i, Class_ta class_ta, int i_625_, int i_626_) {
		RA(false);
		((Class_ra_Sub3) this).aClass57_Sub2_8280.method644(0.0F, 0.0F, (float) method4992((short) -25673).method545(), 0.0F, 0.0F, (float) method4992((short) 20678).method552(), 0, class_ta, i_625_, i_626_);
		RA(true);
	}

	abstract void method5505(boolean bool);

	abstract void method5506(boolean bool);

	abstract Interface7_Impl2 method5507(boolean bool);

	abstract Interface7_Impl1 method5508(boolean bool);

	abstract Interface7_Impl1 method5509(boolean bool);

	abstract Class153 method5510(Class181[] class181s);

	public final void ej(int i, int i_627_, int i_628_, int i_629_) {
		int i_630_;
		int i_631_;
		if (aClass52_5292 != null) {
			i_631_ = aClass52_5292.method545();
			i_630_ = aClass52_5292.method552();
		} else {
			i_630_ = 0;
			i_631_ = 0;
		}
		if (i <= 0 && i_628_ >= i_631_ - 1 && i_627_ <= 0 && i_629_ >= i_630_ - 1)
			L();
		else {
			anInt8265 = i >= 0 ? i : 0;
			anInt8234 = i_628_ <= i_631_ ? i_628_ : i_631_;
			anInt8263 = i_627_ >= 0 ? i_627_ : 0;
			anInt8241 = i_629_ <= i_630_ ? i_629_ : i_630_;
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	abstract void method5511(Interface7_Impl2 interface7_impl2);

	abstract void method5512(Interface7_Impl2 interface7_impl2);

	public final void eh(int i, int i_632_, int i_633_, int i_634_) {
		int i_635_;
		int i_636_;
		if (aClass52_5292 != null) {
			i_636_ = aClass52_5292.method545();
			i_635_ = aClass52_5292.method552();
		} else {
			i_635_ = 0;
			i_636_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_633_ = i_633_ <= i_636_ ? i_633_ : i_636_;
		i_632_ = i_632_ >= 0 ? i_632_ : 0;
		i_634_ = i_634_ <= i_635_ ? i_634_ : i_635_;
		boolean bool = false;
		if (anInt8265 < i) {
			anInt8265 = i;
			bool = true;
		}
		if (anInt8234 > i_633_) {
			anInt8234 = i_633_;
			bool = true;
		}
		if (anInt8263 < i_632_) {
			anInt8263 = i_632_;
			bool = true;
		}
		if (anInt8241 > i_634_) {
			anInt8241 = i_634_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean8254) {
				aBoolean8254 = true;
				method5327();
			}
			method5326();
		}
	}

	public abstract void method5513(Class187 class187, int i, int i_637_);

	public abstract void method5514(Class187 class187, int i, int i_638_);

	public final void method5095(Class66 class66) {
		((Class_ra_Sub3) this).aClass66_Sub2_8284 = (Class66_Sub2) class66;
	}

	public final Class387 method5037(Model model, int i, int i_639_, int i_640_, int i_641_) {
		return new Class387_Sub3(this, model, i, i_640_, i_641_, i_639_);
	}

	abstract Interface9_Impl2 method5515(Class55 class55, int i, int i_642_, boolean bool, byte[] is, int i_643_, int i_644_);

	public abstract void method5516(Class187 class187, int i, int i_645_, int i_646_, int i_647_);

	public final NativeHeapBuffer method5517(int i, boolean bool) {
		return ((Class_ra_Sub3) this).aNativeHeap8221.f(i, bool);
	}

	abstract void method5518(int i);

	public abstract void method5519(Matrix4f class233, Matrix4f class233_648_, Matrix4f class233_649_);

	public abstract void method5520(Matrix4f class233, Matrix4f class233_650_, Matrix4f class233_651_);

	public final Class57 method5104(int i, int i_652_, boolean bool, boolean bool_653_) {
		return new Class57_Sub2(this, i, i_652_, bool, bool_653_);
	}

	public abstract void method5521(int i, Interface7_Impl1 interface7_impl1);

	public abstract Class123 method5522(String string);

	public abstract Class123 method5523(String string);

	public abstract Class123 method5524(String string);

	public abstract Class123 method5525(String string);
}
