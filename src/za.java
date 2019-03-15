import java.awt.Canvas;
import java.awt.Dimension;

public class za extends Class158_Sub2 implements Interface40 {

	static boolean aBool10291 = false;
	int anInt10288;
	int anInt10287;
	long nativeid;
	Canvas aCanvas10290;
	static long aLong10286;
	ja aja10289;

	public int method14345(int i_1, int i_2) {
		try {
			synchronized (this.aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = this.aCanvas10290.getSize();
				this.H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			this.method15706(exception_6);
			return -1;
		}
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class156.method2642(this, (byte) 83);
		}

	}

	boolean method213() {
		this.aja10289.PA(this);
		return true;
	}

	void method14347(int i_1, int i_2) {
		this.anInt10288 = i_1;
		this.anInt10287 = i_2;
		this.wa(this.aCanvas10290, i_1, i_2);
		if (this.aja10289.method8523((byte) 108) == this) {
			this.method213();
		}

	}

	native void n(ja var1, Canvas var2, int var3, int var4);

	native void H(int var1, int var2, int var3, int var4);

	native void wa(Canvas var1, int var2, int var3);

	public int method14344() {
		return this.method14353(0, 0);
	}

	boolean method2723() {
		return true;
	}

	void method14354(int i_1, int i_2) {
		this.anInt10288 = i_1;
		this.anInt10287 = i_2;
		this.wa(this.aCanvas10290, i_1, i_2);
		if (this.aja10289.method8523((byte) 113) == this) {
			this.method213();
		}

	}

	public int method2714() {
		return this.anInt10288;
	}

	public int method14353(int i_1, int i_2) {
		try {
			synchronized (this.aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = this.aCanvas10290.getSize();
				this.H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			this.method15706(exception_6);
			return -1;
		}
	}

	public void method212() {
		if (this.aja10289.method8523((byte) 108) == this) {
			this.method2718();
		}

		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas10290 = null;
	}

	public void method186() {
		if (this.aja10289.method8523((byte) 117) == this) {
			this.method2718();
		}

		this.ma(true);
		this.nativeid = 0L;
		this.aCanvas10290 = null;
	}

	native void as(int var1, int var2, int var3, int var4);

	public int method2719() {
		return this.anInt10288;
	}

	public int method2720() {
		return this.anInt10288;
	}

	native void ai(Canvas var1, int var2, int var3);

	boolean method211() {
		this.aja10289.PA(this);
		return true;
	}

	boolean method54() {
		this.aja10289.PA(this);
		return true;
	}

	native void ah(Canvas var1, int var2, int var3);

	public native void ma(boolean var1);

	boolean method2717() {
		return true;
	}

	boolean method2724() {
		return true;
	}

	native void ax(int var1, int var2, int var3, int var4);

	boolean method2722() {
		return true;
	}

	void method14348(int i_1, int i_2) {
		this.anInt10288 = i_1;
		this.anInt10287 = i_2;
		this.wa(this.aCanvas10290, i_1, i_2);
		if (this.aja10289.method8523((byte) 103) == this) {
			this.method213();
		}

	}

	public int method2721() {
		return this.anInt10287;
	}

	public int method2727() {
		return this.anInt10287;
	}

	public int method14349() {
		return this.method14353(0, 0);
	}

	public int method14350() {
		return this.method14353(0, 0);
	}

	public int method14346() {
		return this.method14353(0, 0);
	}

	void method15706(Exception exception_1) {
		if (!aBool10291) {
			aLong10286 = TextureDetails.time();
			aBool10291 = true;
		} else {
			if (TextureDetails.time() - aLong10286 >= 30000L) {
				throw new RuntimeException(exception_1.getMessage());
			}

			this.aCanvas10290.repaint();
		}

	}

	boolean method2725() {
		return true;
	}

	public int method14352(int i_1, int i_2) {
		try {
			synchronized (this.aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = this.aCanvas10290.getSize();
				this.H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			this.method15706(exception_6);
			return -1;
		}
	}

	public int method2716() {
		return this.anInt10287;
	}

	boolean method2718() {
		return true;
	}

	public native void y(boolean var1);

	public native void x(boolean var1);

	native void az(ja var1, Canvas var2, int var3, int var4);

	za(ja ja_1, Canvas canvas_2, int i_3, int i_4) {
		this.aja10289 = ja_1;
		this.aCanvas10290 = canvas_2;
		this.anInt10288 = i_3;
		this.anInt10287 = i_4;
		this.n(ja_1, this.aCanvas10290, i_3, i_4);
	}

	native void ap(int var1, int var2, int var3, int var4);

	native void al(int var1, int var2, int var3, int var4);

	boolean method2715() {
		return true;
	}

	public int method2726() {
		return this.anInt10288;
	}

	public int method14351(int i_1, int i_2) {
		try {
			synchronized (this.aCanvas10290.getTreeLock()) {
				Dimension dimension_4 = this.aCanvas10290.getSize();
				this.H(i_1, i_2, dimension_4.width, dimension_4.height);
				aBool10291 = false;
				return 0;
			}
		} catch (Exception exception_6) {
			this.method15706(exception_6);
			return -1;
		}
	}

}
