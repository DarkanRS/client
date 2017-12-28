
/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

public class za extends Class158_Sub2 implements Interface40 {
	static long aLong10286;
	int anInt10287;
	int anInt10288;
	long nativeid;
	ja aja10289;
	Canvas aCanvas10290;
	static boolean aBool10291 = false;

	public int method14345(int i, int i_0_) {
		try {
			synchronized (((za) this).aCanvas10290.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas10290.getSize();
				H(i, i_0_, dimension.width, dimension.height);
				aBool10291 = false;
			}
		} catch (Exception exception) {
			method15706(exception);
			return -1;
		}
		return 0;
	}

	public void finalize() {
		if (((za) this).nativeid != 0L)
			Class156.method2642(this, (byte) 83);
	}

	boolean method213() {
		((za) this).aja10289.PA(this);
		return true;
	}

	void method14347(int i, int i_1_) {
		((za) this).anInt10288 = i;
		((za) this).anInt10287 = i_1_;
		wa(((za) this).aCanvas10290, i, i_1_);
		if (((za) this).aja10289.method8523((byte) 108) == this)
			method213();
	}

	native void n(ja var_ja, Canvas canvas, int i, int i_2_);

	native void H(int i, int i_3_, int i_4_, int i_5_);

	native void wa(Canvas canvas, int i, int i_6_);

	public int method14344() {
		return method14353(0, 0);
	}

	boolean method2723() {
		return true;
	}

	void method14354(int i, int i_7_) {
		((za) this).anInt10288 = i;
		((za) this).anInt10287 = i_7_;
		wa(((za) this).aCanvas10290, i, i_7_);
		if (((za) this).aja10289.method8523((byte) 113) == this)
			method213();
	}

	public int method2714() {
		return ((za) this).anInt10288;
	}

	public int method14353(int i, int i_8_) {
		try {
			synchronized (((za) this).aCanvas10290.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas10290.getSize();
				H(i, i_8_, dimension.width, dimension.height);
				aBool10291 = false;
			}
		} catch (Exception exception) {
			method15706(exception);
			return -1;
		}
		return 0;
	}

	public void method212() {
		if (((za) this).aja10289.method8523((byte) 108) == this)
			method2718();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas10290 = null;
	}

	void method15705(Exception exception) {
		if (!aBool10291) {
			aLong10286 = Class169.method2869(1953039972);
			aBool10291 = true;
		} else if (Class169.method2869(1563249560) - aLong10286 < 30000L)
			((za) this).aCanvas10290.repaint();
		else
			throw new RuntimeException(exception.getMessage());
	}

	public void method186() {
		if (((za) this).aja10289.method8523((byte) 117) == this)
			method2718();
		ma(true);
		((za) this).nativeid = 0L;
		((za) this).aCanvas10290 = null;
	}

	native void as(int i, int i_9_, int i_10_, int i_11_);

	public int method2719() {
		return ((za) this).anInt10288;
	}

	public int method2720() {
		return ((za) this).anInt10288;
	}

	native void ai(Canvas canvas, int i, int i_12_);

	boolean method211() {
		((za) this).aja10289.PA(this);
		return true;
	}

	boolean method54() {
		((za) this).aja10289.PA(this);
		return true;
	}

	native void ah(Canvas canvas, int i, int i_13_);

	public native void ma(boolean bool);

	boolean method2717() {
		return true;
	}

	boolean method2724() {
		return true;
	}

	native void ax(int i, int i_14_, int i_15_, int i_16_);

	boolean method2722() {
		return true;
	}

	void method14348(int i, int i_17_) {
		((za) this).anInt10288 = i;
		((za) this).anInt10287 = i_17_;
		wa(((za) this).aCanvas10290, i, i_17_);
		if (((za) this).aja10289.method8523((byte) 103) == this)
			method213();
	}

	public int method2721() {
		return ((za) this).anInt10287;
	}

	public int method2727() {
		return ((za) this).anInt10287;
	}

	public int method14349() {
		return method14353(0, 0);
	}

	public int method14350() {
		return method14353(0, 0);
	}

	public int method14346() {
		return method14353(0, 0);
	}

	void method15706(Exception exception) {
		if (!aBool10291) {
			aLong10286 = Class169.method2869(2026829364);
			aBool10291 = true;
		} else if (Class169.method2869(1530794002) - aLong10286 < 30000L)
			((za) this).aCanvas10290.repaint();
		else
			throw new RuntimeException(exception.getMessage());
	}

	void method15707() {
		if (((za) this).nativeid != 0L)
			Class156.method2642(this, (byte) 117);
	}

	boolean method2725() {
		return true;
	}

	public int method14352(int i, int i_18_) {
		try {
			synchronized (((za) this).aCanvas10290.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas10290.getSize();
				H(i, i_18_, dimension.width, dimension.height);
				aBool10291 = false;
			}
		} catch (Exception exception) {
			method15706(exception);
			return -1;
		}
		return 0;
	}

	public int method2716() {
		return ((za) this).anInt10287;
	}

	boolean method2718() {
		return true;
	}

	public native void y(boolean bool);

	public native void x(boolean bool);

	void method15708() {
		if (((za) this).nativeid != 0L)
			Class156.method2642(this, (byte) 39);
	}

	native void az(ja var_ja, Canvas canvas, int i, int i_19_);

	za(ja var_ja, Canvas canvas, int i, int i_20_) {
		((za) this).aja10289 = var_ja;
		((za) this).aCanvas10290 = canvas;
		((za) this).anInt10288 = i;
		((za) this).anInt10287 = i_20_;
		n(var_ja, ((za) this).aCanvas10290, i, i_20_);
	}

	native void ap(int i, int i_21_, int i_22_, int i_23_);

	native void al(int i, int i_24_, int i_25_, int i_26_);

	boolean method2715() {
		return true;
	}

	public int method2726() {
		return ((za) this).anInt10288;
	}

	public int method14351(int i, int i_27_) {
		try {
			synchronized (((za) this).aCanvas10290.getTreeLock()) {
				Dimension dimension = ((za) this).aCanvas10290.getSize();
				H(i, i_27_, dimension.width, dimension.height);
				aBool10291 = false;
			}
		} catch (Exception exception) {
			method15706(exception);
			return -1;
		}
		return 0;
	}
}
