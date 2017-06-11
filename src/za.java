/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

public class za extends Class52_Sub2 implements Interface25 {
	ja aJa8981;
	Canvas aCanvas8982;
	static long aLong8983;
	int anInt8984;
	int anInt8985;
	long nativeid;
	static boolean aBoolean8986 = false;

	public int method547() {
		return ((za) this).anInt8985;
	}

	void method582(int i, int i_0_) {
		((za) this).anInt8985 = i;
		((za) this).anInt8984 = i_0_;
		wa(((za) this).aCanvas8982, i, i_0_);
		if (((za) this).aJa8981.method4992((short) 10240) == this)
			method136();
	}

	public native void ma(boolean bool);

	za(ja var_ja, Canvas canvas, int i, int i_1_) {
		((za) this).aJa8981 = var_ja;
		((za) this).aCanvas8982 = canvas;
		((za) this).anInt8985 = i;
		((za) this).anInt8984 = i_1_;
		n(var_ja, ((za) this).aCanvas8982, i, i_1_);
	}

	native void ao(int i, int i_2_, int i_3_, int i_4_);

	native void wa(Canvas canvas, int i, int i_5_);

	public int method580() {
		return method581(0, 0);
	}

	public int method581(int i, int i_6_) {
		try {
			synchronized (((za) this).aCanvas8982.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas8982.getSize();
				H(i, i_6_, dimension.width, dimension.height);
				aBoolean8986 = false;
			}
		} catch (Exception exception) {
			method598(exception);
			return -1;
		}
		return 0;
	}

	void method598(Exception exception) {
		if (!aBoolean8986) {
			aLong8983 = Class122.method1319((byte) 1);
			aBoolean8986 = true;
		} else if (Class122.method1319((byte) 1) - aLong8983 < 30000L)
			((za) this).aCanvas8982.repaint();
		else
			throw new RuntimeException(exception.getMessage());
	}

	public int method545() {
		return ((za) this).anInt8985;
	}

	public int method552() {
		return ((za) this).anInt8984;
	}

	public void method135() {
		if (((za) this).aJa8981.method4992((short) -12143) == this)
			method546();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas8982 = null;
	}

	native void ad(int i, int i_7_, int i_8_, int i_9_);

	boolean method546() {
		return true;
	}

	public int method579() {
		return method581(0, 0);
	}

	public int method544() {
		return ((za) this).anInt8984;
	}

	native void H(int i, int i_10_, int i_11_, int i_12_);

	public int method585(int i, int i_13_) {
		try {
			synchronized (((za) this).aCanvas8982.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas8982.getSize();
				H(i, i_13_, dimension.width, dimension.height);
				aBoolean8986 = false;
			}
		} catch (Exception exception) {
			method598(exception);
			return -1;
		}
		return 0;
	}

	public int method549() {
		return ((za) this).anInt8985;
	}

	public void method138() {
		if (((za) this).aJa8981.method4992((short) -2527) == this)
			method546();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas8982 = null;
	}

	void method583(int i, int i_14_) {
		((za) this).anInt8985 = i;
		((za) this).anInt8984 = i_14_;
		wa(((za) this).aCanvas8982, i, i_14_);
		if (((za) this).aJa8981.method4992((short) -7265) == this)
			method136();
	}

	boolean method134() {
		((za) this).aJa8981.PA(this);
		return true;
	}

	public int method550() {
		return ((za) this).anInt8985;
	}

	public int method551() {
		return ((za) this).anInt8985;
	}

	native void n(ja var_ja, Canvas canvas, int i, int i_15_);

	public int method584(int i, int i_16_) {
		try {
			synchronized (((za) this).aCanvas8982.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas8982.getSize();
				H(i, i_16_, dimension.width, dimension.height);
				aBoolean8986 = false;
			}
		} catch (Exception exception) {
			method598(exception);
			return -1;
		}
		return 0;
	}

	public void method137() {
		if (((za) this).aJa8981.method4992((short) -9633) == this)
			method546();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas8982 = null;
	}

	public int method586(int i, int i_17_) {
		try {
			synchronized (((za) this).aCanvas8982.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas8982.getSize();
				H(i, i_17_, dimension.width, dimension.height);
				aBoolean8986 = false;
			}
		} catch (Exception exception) {
			method598(exception);
			return -1;
		}
		return 0;
	}

	public int method587(int i, int i_18_) {
		try {
			synchronized (((za) this).aCanvas8982.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas8982.getSize();
				H(i, i_18_, dimension.width, dimension.height);
				aBoolean8986 = false;
			}
		} catch (Exception exception) {
			method598(exception);
			return -1;
		}
		return 0;
	}

	native void ak(ja var_ja, Canvas canvas, int i, int i_19_);

	native void aa(ja var_ja, Canvas canvas, int i, int i_20_);

	boolean method548() {
		return true;
	}

	native void ae(int i, int i_21_, int i_22_, int i_23_);

	public native void z(boolean bool);

	boolean method136() {
		((za) this).aJa8981.PA(this);
		return true;
	}

	native void av(Canvas canvas, int i, int i_24_);
}
