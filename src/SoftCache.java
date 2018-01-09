/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class SoftCache {
	int anInt2852;
	int anInt2853;
	IterableNodeMap aClass465_2854;
	Class477 aClass477_2855 = new Class477();

	public Object method3852() {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 54));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (object == null) {
				Class282_Sub50_Sub1 class282_sub50_sub1_0_ = class282_sub50_sub1;
				class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 52));
				class282_sub50_sub1_0_.unlink(-371378792);
				class282_sub50_sub1_0_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_0_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	public SoftCache(int i, int i_1_) {
		((SoftCache) this).anInt2853 = -1978744435 * i;
		((SoftCache) this).anInt2852 = 571578001 * i;
		int i_2_;
		for (i_2_ = 1; i_2_ + i_2_ < i && i_2_ < i_1_; i_2_ += i_2_) {
			/* empty */
		}
		((SoftCache) this).aClass465_2854 = new IterableNodeMap(i_2_);
	}

	public Object method3853(long l) {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7754(l));
		if (class282_sub50_sub1 == null)
			return null;
		Object object = class282_sub50_sub1.method14692(-264417270);
		if (object == null) {
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
			((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -1587611389);
			return null;
		}
		if (class282_sub50_sub1.method14691(-1540659410)) {
			Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -484661165));
			((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, class282_sub50_sub1.uid * -3442165056282524525L);
			((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
			class282_sub50_sub1_sub1.aLong8120 = 0L;
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
		} else {
			((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1, -1738910950);
			class282_sub50_sub1.aLong8120 = 0L;
		}
		return object;
	}

	public void method3854(Object object, long l) {
		method3857(object, l, 1, -1999293128);
	}

	public Object method3855() {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7750(1294161972));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (null == object) {
				Class282_Sub50_Sub1 class282_sub50_sub1_3_ = class282_sub50_sub1;
				class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 112);
				class282_sub50_sub1_3_.unlink(-371378792);
				class282_sub50_sub1_3_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_3_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	public void put(Object object, long l) {
		method3857(object, l, 1, -1866496230);
	}

	public void method3857(Object object, long l, int i, int i_4_) {
		if (i > -1292932795 * ((SoftCache) this).anInt2853)
			throw new IllegalStateException();
		method3873(l);
		((SoftCache) this).anInt2852 -= i * 571578001;
		while (-1629689231 * ((SoftCache) this).anInt2852 < 0) {
			Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7937(-154092419));
			method3864(class282_sub50_sub1, (byte) 24);
		}
		Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, i);
		((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, l);
		((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
		class282_sub50_sub1_sub1.aLong8120 = 0L;
	}

	public void method3858(int i, byte i_5_) {
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); class282_sub50_sub1 != null; class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-1108267960)) {
			if (class282_sub50_sub1.method14691(-436752315)) {
				if (class282_sub50_sub1.method14692(-264417270) == null) {
					class282_sub50_sub1.unlink(-371378792);
					class282_sub50_sub1.method13452((byte) -5);
					((SoftCache) this).anInt2852 += -1587611389 * ((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451;
				}
			} else if (((class282_sub50_sub1.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub1_Sub2 class282_sub50_sub1_sub2 = (new Class282_Sub50_Sub1_Sub2(class282_sub50_sub1.method14692(-264417270), (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -484661165)));
				((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub2, class282_sub50_sub1.uid * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub1_sub2, class282_sub50_sub1, -782987779);
				class282_sub50_sub1.unlink(-371378792);
				class282_sub50_sub1.method13452((byte) -5);
			}
		}
	}

	public void method3859(int i) {
		((SoftCache) this).aClass477_2855.method7935((byte) 38);
		((SoftCache) this).aClass465_2854.method7749(-1780649231);
		((SoftCache) this).anInt2852 = ((SoftCache) this).anInt2853 * -924971499;
	}

	public int method3860(byte i) {
		return ((SoftCache) this).anInt2853 * -1292932795;
	}

	public int method3861(byte i) {
		return -1629689231 * ((SoftCache) this).anInt2852;
	}

	public int method3862(byte i) {
		int i_6_ = 0;
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); class282_sub50_sub1 != null; class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-124475022))) {
			if (!class282_sub50_sub1.method14691(-1137158918))
				i_6_++;
		}
		return i_6_;
	}

	public void method3863(int i) {
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); null != class282_sub50_sub1; class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-586582507))) {
			if (class282_sub50_sub1.method14691(1940847824)) {
				class282_sub50_sub1.unlink(-371378792);
				class282_sub50_sub1.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -1587611389);
			}
		}
	}

	void method3864(Class282_Sub50_Sub1 class282_sub50_sub1, byte i) {
		if (class282_sub50_sub1 != null) {
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
			((SoftCache) this).anInt2852 += (-1587611389 * ((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451);
		}
	}

	public Object get(long l) {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7754(l));
		if (class282_sub50_sub1 == null)
			return null;
		Object object = class282_sub50_sub1.method14692(-264417270);
		if (object == null) {
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
			((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -1587611389);
			return null;
		}
		if (class282_sub50_sub1.method14691(279512561)) {
			Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -484661165));
			((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, class282_sub50_sub1.uid * -3442165056282524525L);
			((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
			class282_sub50_sub1_sub1.aLong8120 = 0L;
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
		} else {
			((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1, -1738910950);
			class282_sub50_sub1.aLong8120 = 0L;
		}
		return object;
	}

	public SoftCache(int i) {
		this(i, i);
	}

	public Object method3866(int i) {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7750(426226201));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (null == object) {
				Class282_Sub50_Sub1 class282_sub50_sub1_7_ = class282_sub50_sub1;
				class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 100);
				class282_sub50_sub1_7_.unlink(-371378792);
				class282_sub50_sub1_7_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_7_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	public Object method3867(int i) {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 50));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (object == null) {
				Class282_Sub50_Sub1 class282_sub50_sub1_8_ = class282_sub50_sub1;
				class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 125);
				class282_sub50_sub1_8_.unlink(-371378792);
				class282_sub50_sub1_8_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_8_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	public void method3868(Object object, long l) {
		method3857(object, l, 1, -1981880204);
	}

	public int method3869() {
		return ((SoftCache) this).anInt2853 * -1292932795;
	}

	public Object method3870(long l) {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7754(l));
		if (class282_sub50_sub1 == null)
			return null;
		Object object = class282_sub50_sub1.method14692(-264417270);
		if (object == null) {
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
			((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -1587611389);
			return null;
		}
		if (class282_sub50_sub1.method14691(1027337133)) {
			Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -484661165));
			((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, class282_sub50_sub1.uid * -3442165056282524525L);
			((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
			class282_sub50_sub1_sub1.aLong8120 = 0L;
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
		} else {
			((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1, -1738910950);
			class282_sub50_sub1.aLong8120 = 0L;
		}
		return object;
	}

	public void method3871(Object object, long l, int i) {
		if (i > -1292932795 * ((SoftCache) this).anInt2853)
			throw new IllegalStateException();
		method3873(l);
		((SoftCache) this).anInt2852 -= i * 571578001;
		while (-1629689231 * ((SoftCache) this).anInt2852 < 0) {
			Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7937(648497527));
			method3864(class282_sub50_sub1, (byte) -31);
		}
		Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, i);
		((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, l);
		((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
		class282_sub50_sub1_sub1.aLong8120 = 0L;
	}

	public void method3872(Object object, long l, int i) {
		if (i > -1292932795 * ((SoftCache) this).anInt2853)
			throw new IllegalStateException();
		method3873(l);
		((SoftCache) this).anInt2852 -= i * 571578001;
		while (-1629689231 * ((SoftCache) this).anInt2852 < 0) {
			Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7937(-1141451667));
			method3864(class282_sub50_sub1, (byte) -17);
		}
		Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, i);
		((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, l);
		((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
		class282_sub50_sub1_sub1.aLong8120 = 0L;
	}

	public void method3873(long l) {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7754(l));
		method3864(class282_sub50_sub1, (byte) -6);
	}

	public void method3874(int i) {
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); class282_sub50_sub1 != null; class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-1595094473)) {
			if (class282_sub50_sub1.method14691(-208984468)) {
				if (class282_sub50_sub1.method14692(-264417270) == null) {
					class282_sub50_sub1.unlink(-371378792);
					class282_sub50_sub1.method13452((byte) -5);
					((SoftCache) this).anInt2852 += -1587611389 * ((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451;
				}
			} else if (((class282_sub50_sub1.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub1_Sub2 class282_sub50_sub1_sub2 = (new Class282_Sub50_Sub1_Sub2(class282_sub50_sub1.method14692(-264417270), (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -484661165)));
				((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub2, class282_sub50_sub1.uid * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub1_sub2, class282_sub50_sub1, 25499167);
				class282_sub50_sub1.unlink(-371378792);
				class282_sub50_sub1.method13452((byte) -5);
			}
		}
	}

	public void method3875() {
		((SoftCache) this).aClass477_2855.method7935((byte) 3);
		((SoftCache) this).aClass465_2854.method7749(-1874433469);
		((SoftCache) this).anInt2852 = ((SoftCache) this).anInt2853 * -924971499;
	}

	public void method3876() {
		((SoftCache) this).aClass477_2855.method7935((byte) -65);
		((SoftCache) this).aClass465_2854.method7749(1850853775);
		((SoftCache) this).anInt2852 = ((SoftCache) this).anInt2853 * -924971499;
	}

	public void method3877() {
		((SoftCache) this).aClass477_2855.method7935((byte) 115);
		((SoftCache) this).aClass465_2854.method7749(-1407789757);
		((SoftCache) this).anInt2852 = ((SoftCache) this).anInt2853 * -924971499;
	}

	public int method3878() {
		return ((SoftCache) this).anInt2853 * -1292932795;
	}

	public int method3879() {
		return ((SoftCache) this).anInt2853 * -1292932795;
	}

	public int method3880() {
		int i = 0;
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); class282_sub50_sub1 != null; class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-1968677241)) {
			if (!class282_sub50_sub1.method14691(-1607000735))
				i++;
		}
		return i;
	}

	public int method3881() {
		return -1629689231 * ((SoftCache) this).anInt2852;
	}

	void method3882(Class282_Sub50_Sub1 class282_sub50_sub1) {
		if (class282_sub50_sub1 != null) {
			class282_sub50_sub1.unlink(-371378792);
			class282_sub50_sub1.method13452((byte) -5);
			((SoftCache) this).anInt2852 += (-1587611389 * ((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451);
		}
	}

	public int method3883() {
		int i = 0;
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); class282_sub50_sub1 != null; class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-217979854))) {
			if (!class282_sub50_sub1.method14691(-1984656974))
				i++;
		}
		return i;
	}

	public int method3884() {
		int i = 0;
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); class282_sub50_sub1 != null; class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(-1902945913)) {
			if (!class282_sub50_sub1.method14691(-2011843246))
				i++;
		}
		return i;
	}

	public void method3885() {
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); null != class282_sub50_sub1; class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(82728790))) {
			if (class282_sub50_sub1.method14691(745744870)) {
				class282_sub50_sub1.unlink(-371378792);
				class282_sub50_sub1.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -1587611389);
			}
		}
	}

	public void method3886() {
		for (Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7941((byte) 4)); null != class282_sub50_sub1; class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7955(593006674))) {
			if (class282_sub50_sub1.method14691(316703520)) {
				class282_sub50_sub1.unlink(-371378792);
				class282_sub50_sub1.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1).anInt9451 * -1587611389);
			}
		}
	}

	public void method3887(Object object, long l, int i) {
		if (i > -1292932795 * ((SoftCache) this).anInt2853)
			throw new IllegalStateException();
		method3873(l);
		((SoftCache) this).anInt2852 -= i * 571578001;
		while (-1629689231 * ((SoftCache) this).anInt2852 < 0) {
			Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass477_2855.method7937(1229875033));
			method3864(class282_sub50_sub1, (byte) 86);
		}
		Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1 = new Class282_Sub50_Sub1_Sub1(object, i);
		((SoftCache) this).aClass465_2854.method7765(class282_sub50_sub1_sub1, l);
		((SoftCache) this).aClass477_2855.method7936(class282_sub50_sub1_sub1, -1738910950);
		class282_sub50_sub1_sub1.aLong8120 = 0L;
	}

	public void method3888(Object object, long l) {
		method3857(object, l, 1, -1749117034);
	}

	public Object method3889() {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 82));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (object == null) {
				Class282_Sub50_Sub1 class282_sub50_sub1_9_ = class282_sub50_sub1;
				class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 45));
				class282_sub50_sub1_9_.unlink(-371378792);
				class282_sub50_sub1_9_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_9_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	public Object method3890() {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 42));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (object == null) {
				Class282_Sub50_Sub1 class282_sub50_sub1_10_ = class282_sub50_sub1;
				class282_sub50_sub1 = (Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 100);
				class282_sub50_sub1_10_.unlink(-371378792);
				class282_sub50_sub1_10_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_10_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	public Object method3891() {
		Class282_Sub50_Sub1 class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7750(265570009));
		while (null != class282_sub50_sub1) {
			Object object = class282_sub50_sub1.method14692(-264417270);
			if (null == object) {
				Class282_Sub50_Sub1 class282_sub50_sub1_11_ = class282_sub50_sub1;
				class282_sub50_sub1 = ((Class282_Sub50_Sub1) ((SoftCache) this).aClass465_2854.method7751((byte) 83));
				class282_sub50_sub1_11_.unlink(-371378792);
				class282_sub50_sub1_11_.method13452((byte) -5);
				((SoftCache) this).anInt2852 += (((Class282_Sub50_Sub1) class282_sub50_sub1_11_).anInt9451) * -1587611389;
			} else
				return object;
		}
		return null;
	}

	static final void method3892(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class185.method3078(class118, class98, class527, 64340405);
	}

	static final void method3893(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-1794676778);
	}

	static final void method3894(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class221.anInt2762 * 509550843;
	}

	static void method3895(double d) {
		if (d != Class282_Sub50_Sub3.aDouble9479) {
			for (int i = 0; i < 256; i++) {
				int i_12_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
				Class282_Sub50_Sub3.anIntArray9474[i] = i_12_ > 255 ? 255 : i_12_;
			}
			Class282_Sub50_Sub3.aDouble9479 = d;
		}
	}
}
