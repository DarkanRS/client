
/* Class158_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public abstract class Class158_Sub2_Sub3 extends Class158_Sub2 {
	float[] aFloatArray10236;
	Class505_Sub3 aClass505_Sub3_10237;
	int anInt10238;
	int anInt10239;
	int[] anIntArray10240;
	Canvas aCanvas10241;
	boolean aBool10242;
	static int anInt10243;

	final boolean method2723() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	final boolean method213() {
		((Class158_Sub2_Sub3) this).aClass505_Sub3_10237.method14376(-1977580999 * ((Class158_Sub2_Sub3) this).anInt10238, 2033125333 * ((Class158_Sub2_Sub3) this).anInt10239, ((Class158_Sub2_Sub3) this).anIntArray10240, ((Class158_Sub2_Sub3) this).aFloatArray10236);
		((Class158_Sub2_Sub3) this).aBool10242 = true;
		return true;
	}

	final void method14354(int i, int i_0_) {
		if (i != ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999 || i_0_ != ((Class158_Sub2_Sub3) this).anInt10239 * 2033125333) {
			((Class158_Sub2_Sub3) this).anInt10238 = -1379480567 * i;
			((Class158_Sub2_Sub3) this).anInt10239 = -2009073283 * i_0_;
			method15632((byte) -47);
		}
	}

	public int method2714() {
		return ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999;
	}

	Class158_Sub2_Sub3(Class505_Sub3 class505_sub3, Canvas canvas, int i, int i_1_) {
		((Class158_Sub2_Sub3) this).aCanvas10241 = canvas;
		((Class158_Sub2_Sub3) this).aClass505_Sub3_10237 = class505_sub3;
		((Class158_Sub2_Sub3) this).anInt10238 = i * -1379480567;
		((Class158_Sub2_Sub3) this).anInt10239 = i_1_ * -2009073283;
	}

	final boolean method54() {
		((Class158_Sub2_Sub3) this).aClass505_Sub3_10237.method14376(-1977580999 * ((Class158_Sub2_Sub3) this).anInt10238, 2033125333 * ((Class158_Sub2_Sub3) this).anInt10239, ((Class158_Sub2_Sub3) this).anIntArray10240, ((Class158_Sub2_Sub3) this).aFloatArray10236);
		((Class158_Sub2_Sub3) this).aBool10242 = true;
		return true;
	}

	public int method2726() {
		return ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999;
	}

	public int method2719() {
		return ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999;
	}

	public int method2720() {
		return ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999;
	}

	final boolean method2715() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	public int method2716() {
		return 2033125333 * ((Class158_Sub2_Sub3) this).anInt10239;
	}

	final boolean method2718() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	final boolean method211() {
		((Class158_Sub2_Sub3) this).aClass505_Sub3_10237.method14376(-1977580999 * ((Class158_Sub2_Sub3) this).anInt10238, 2033125333 * ((Class158_Sub2_Sub3) this).anInt10239, ((Class158_Sub2_Sub3) this).anIntArray10240, ((Class158_Sub2_Sub3) this).aFloatArray10236);
		((Class158_Sub2_Sub3) this).aBool10242 = true;
		return true;
	}

	final void method14347(int i, int i_2_) {
		if (i != ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999 || i_2_ != ((Class158_Sub2_Sub3) this).anInt10239 * 2033125333) {
			((Class158_Sub2_Sub3) this).anInt10238 = -1379480567 * i;
			((Class158_Sub2_Sub3) this).anInt10239 = -2009073283 * i_2_;
			method15632((byte) -36);
		}
	}

	final boolean method2717() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	void method15632(byte i) {
		((Class158_Sub2_Sub3) this).anIntArray10240 = new int[(((Class158_Sub2_Sub3) this).anInt10239 * 2033125333 * (-1977580999 * ((Class158_Sub2_Sub3) this).anInt10238))];
		((Class158_Sub2_Sub3) this).aFloatArray10236 = new float[(((Class158_Sub2_Sub3) this).anInt10239 * 2033125333 * (((Class158_Sub2_Sub3) this).anInt10238 * -1977580999))];
		if (((Class158_Sub2_Sub3) this).aBool10242) {
			if (i == -1)
				throw new IllegalStateException();
			((Class158_Sub2_Sub3) this).aClass505_Sub3_10237.method14376(((Class158_Sub2_Sub3) this).anInt10238 * -1977580999, ((Class158_Sub2_Sub3) this).anInt10239 * 2033125333, ((Class158_Sub2_Sub3) this).anIntArray10240, ((Class158_Sub2_Sub3) this).aFloatArray10236);
		}
	}

	final boolean method2725() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	final boolean method2722() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	static Class158_Sub2_Sub3 method15633(Class505_Sub3 class505_sub3, Canvas canvas, int i, int i_3_) {
		Class158_Sub2_Sub3_Sub1 class158_sub2_sub3_sub1 = new Class158_Sub2_Sub3_Sub1(class505_sub3, canvas, i, i_3_);
		return class158_sub2_sub3_sub1;
	}

	static Class158_Sub2_Sub3 method15634(Class505_Sub3 class505_sub3, Canvas canvas, int i, int i_4_) {
		Class158_Sub2_Sub3_Sub1 class158_sub2_sub3_sub1 = new Class158_Sub2_Sub3_Sub1(class505_sub3, canvas, i, i_4_);
		return class158_sub2_sub3_sub1;
	}

	static Class158_Sub2_Sub3 method15635(Class505_Sub3 class505_sub3, Canvas canvas, int i, int i_5_) {
		Class158_Sub2_Sub3_Sub1 class158_sub2_sub3_sub1 = new Class158_Sub2_Sub3_Sub1(class505_sub3, canvas, i, i_5_);
		return class158_sub2_sub3_sub1;
	}

	void method15636() {
		((Class158_Sub2_Sub3) this).anIntArray10240 = new int[(((Class158_Sub2_Sub3) this).anInt10239 * 2033125333 * (-1977580999 * ((Class158_Sub2_Sub3) this).anInt10238))];
		((Class158_Sub2_Sub3) this).aFloatArray10236 = new float[(((Class158_Sub2_Sub3) this).anInt10239 * 2033125333 * (((Class158_Sub2_Sub3) this).anInt10238 * -1977580999))];
		if (((Class158_Sub2_Sub3) this).aBool10242)
			((Class158_Sub2_Sub3) this).aClass505_Sub3_10237.method14376(((Class158_Sub2_Sub3) this).anInt10238 * -1977580999, ((Class158_Sub2_Sub3) this).anInt10239 * 2033125333, ((Class158_Sub2_Sub3) this).anIntArray10240, ((Class158_Sub2_Sub3) this).aFloatArray10236);
	}

	void method15637() {
		((Class158_Sub2_Sub3) this).anIntArray10240 = new int[(((Class158_Sub2_Sub3) this).anInt10239 * 2033125333 * (-1977580999 * ((Class158_Sub2_Sub3) this).anInt10238))];
		((Class158_Sub2_Sub3) this).aFloatArray10236 = new float[(((Class158_Sub2_Sub3) this).anInt10239 * 2033125333 * (((Class158_Sub2_Sub3) this).anInt10238 * -1977580999))];
		if (((Class158_Sub2_Sub3) this).aBool10242)
			((Class158_Sub2_Sub3) this).aClass505_Sub3_10237.method14376(((Class158_Sub2_Sub3) this).anInt10238 * -1977580999, ((Class158_Sub2_Sub3) this).anInt10239 * 2033125333, ((Class158_Sub2_Sub3) this).anIntArray10240, ((Class158_Sub2_Sub3) this).aFloatArray10236);
	}

	final boolean method2724() {
		((Class158_Sub2_Sub3) this).aBool10242 = false;
		return true;
	}

	final void method14348(int i, int i_6_) {
		if (i != ((Class158_Sub2_Sub3) this).anInt10238 * -1977580999 || i_6_ != ((Class158_Sub2_Sub3) this).anInt10239 * 2033125333) {
			((Class158_Sub2_Sub3) this).anInt10238 = -1379480567 * i;
			((Class158_Sub2_Sub3) this).anInt10239 = -2009073283 * i_6_;
			method15632((byte) 58);
		}
	}

	public int method2721() {
		return 2033125333 * ((Class158_Sub2_Sub3) this).anInt10239;
	}

	public int method2727() {
		return 2033125333 * ((Class158_Sub2_Sub3) this).anInt10239;
	}
}
