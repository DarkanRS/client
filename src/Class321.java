
/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public final class Class321 {
	AbstractQueue_Sub1 anAbstractQueue_Sub1_3725;
	long aLong3726;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_3727;
	Map aMap3728;
	Class332 aClass332_3729;
	int anInt3730;
	
	public Object method5737(Object object, int i) {
		synchronized (this) {
			if (-1L != ((Class321) this).aLong3726 * 7831064100123684311L)
				method5745((byte) 57);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.remove(object);
			if (null != class328) {
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
				if (method5738(16711680))
					((Class321) this).anAbstractQueue_Sub1_3727.remove(class328);
				Object object_0_ = ((Class328) class328).anObject3768;
				return object_0_;
			}
			Object object_1_ = null;
			return object_1_;
		}
	}

	Class321(long l, int i, Class332 class332) {
		((Class321) this).aLong3726 = l * -3197860828920113689L;
		((Class321) this).anInt3730 = 319700123 * i;
		((Class321) this).aClass332_3729 = class332;
		if (-1 == ((Class321) this).anInt3730 * 1607551379) {
			((Class321) this).aMap3728 = new HashMap(64);
			((Class321) this).anAbstractQueue_Sub1_3725 = new AbstractQueue_Sub1(64);
			((Class321) this).anAbstractQueue_Sub1_3727 = null;
		} else {
			if (null == ((Class321) this).aClass332_3729)
				throw new IllegalArgumentException("");
			((Class321) this).aMap3728 = new HashMap(((Class321) this).anInt3730 * 1607551379);
			((Class321) this).anAbstractQueue_Sub1_3725 = new AbstractQueue_Sub1(1607551379 * ((Class321) this).anInt3730);
			((Class321) this).anAbstractQueue_Sub1_3727 = new AbstractQueue_Sub1(((Class321) this).anInt3730 * 1607551379);
		}
	}

	boolean method5738(int i) {
		return ((Class321) this).anInt3730 * 1607551379 != -1;
	}

	public Object method5739(Object object, byte i) {
		synchronized (this) {
			if (7831064100123684311L * ((Class321) this).aLong3726 != -1L)
				method5745((byte) 81);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.get(object);
			if (class328 == null) {
				Object object_2_ = null;
				return object_2_;
			}
			method5742(class328, false, (byte) 41);
			Object object_3_ = ((Class328) class328).anObject3768;
			return object_3_;
		}
	}

	public Object method5740(Object object, Object object_4_, int i) {
		synchronized (this) {
			if (-1L != 7831064100123684311L * ((Class321) this).aLong3726)
				method5745((byte) 119);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.get(object);
			if (null != class328) {
				Object object_5_ = ((Class328) class328).anObject3768;
				((Class328) class328).anObject3768 = object_4_;
				method5742(class328, false, (byte) 13);
				Object object_6_ = object_5_;
				return object_6_;
			}
			if (method5738(16711680) && (((Class321) this).aMap3728.size() == 1607551379 * ((Class321) this).anInt3730)) {
				Class328 class328_7_ = ((Class328) ((Class321) this).anAbstractQueue_Sub1_3727.remove());
				((Class321) this).aMap3728.remove(((Class328) class328_7_).anObject3770);
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328_7_);
			}
			Class328 class328_8_ = new Class328(object_4_, object);
			((Class321) this).aMap3728.put(object, class328_8_);
			method5742(class328_8_, true, (byte) 6);
			Object object_9_ = null;
			return object_9_;
		}
	}

	public Object method5741(Object object) {
		synchronized (this) {
			if (7831064100123684311L * ((Class321) this).aLong3726 != -1L)
				method5745((byte) 112);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.get(object);
			if (class328 == null) {
				Object object_10_ = null;
				return object_10_;
			}
			method5742(class328, false, (byte) 59);
			Object object_11_ = ((Class328) class328).anObject3768;
			return object_11_;
		}
	}

	void method5742(Class328 class328, boolean bool, byte i) {
		if (!bool) {
			((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
			if (method5738(16711680) && !((Class321) this).anAbstractQueue_Sub1_3727.remove(class328))
				throw new IllegalStateException("");
		}
		((Class328) class328).aLong3767 = System.currentTimeMillis() * -8918812157227430537L;
		if (method5738(16711680)) {
			switch (((Class332) ((Class321) this).aClass332_3729).anInt3876 * -433915021) {
			case 0:
				((Class328) class328).aLong3769 += -6433242713277960601L;
				break;
			case 1:
				((Class328) class328).aLong3769 = ((Class328) class328).aLong3767 * 1071323446977045137L;
				break;
			}
			((Class321) this).anAbstractQueue_Sub1_3727.add(class328);
		}
		((Class321) this).anAbstractQueue_Sub1_3725.add(class328);
	}

	public Object method5743(Object object) {
		synchronized (this) {
			if (-1L != ((Class321) this).aLong3726 * 7831064100123684311L)
				method5745((byte) 41);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.remove(object);
			if (null != class328) {
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
				if (method5738(16711680))
					((Class321) this).anAbstractQueue_Sub1_3727.remove(class328);
				Object object_12_ = ((Class328) class328).anObject3768;
				return object_12_;
			}
			Object object_13_ = null;
			return object_13_;
		}
	}

	public void method5744(byte i) {
		synchronized (this) {
			((Class321) this).aMap3728.clear();
			((Class321) this).anAbstractQueue_Sub1_3725.clear();
			if (method5738(16711680))
				((Class321) this).anAbstractQueue_Sub1_3727.clear();
		}
	}

	void method5745(byte i) {
		if (-1L == ((Class321) this).aLong3726 * 7831064100123684311L)
			throw new IllegalStateException("");
		long l = (System.currentTimeMillis() - 7831064100123684311L * ((Class321) this).aLong3726);
		while (!((Class321) this).anAbstractQueue_Sub1_3725.isEmpty()) {
			Class328 class328 = ((Class328) ((Class321) this).anAbstractQueue_Sub1_3725.peek());
			if (((Class328) class328).aLong3767 * -7127845352115217337L < l) {
				((Class321) this).aMap3728.remove(((Class328) class328).anObject3770);
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
				if (method5738(16711680))
					((Class321) this).anAbstractQueue_Sub1_3727.remove(class328);
			} else
				break;
		}
	}

	public Object method5746(Object object) {
		synchronized (this) {
			if (7831064100123684311L * ((Class321) this).aLong3726 != -1L)
				method5745((byte) 83);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.get(object);
			if (class328 == null) {
				Object object_14_ = null;
				return object_14_;
			}
			method5742(class328, false, (byte) 76);
			Object object_15_ = ((Class328) class328).anObject3768;
			return object_15_;
		}
	}

	boolean method5747() {
		return ((Class321) this).anInt3730 * 1607551379 != -1;
	}

	public Object method5748(Object object) {
		synchronized (this) {
			if (7831064100123684311L * ((Class321) this).aLong3726 != -1L)
				method5745((byte) 121);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.get(object);
			if (class328 == null) {
				Object object_16_ = null;
				return object_16_;
			}
			method5742(class328, false, (byte) 26);
			Object object_17_ = ((Class328) class328).anObject3768;
			return object_17_;
		}
	}

	public Object method5749(Object object) {
		synchronized (this) {
			if (-1L != ((Class321) this).aLong3726 * 7831064100123684311L)
				method5745((byte) 123);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.remove(object);
			if (null != class328) {
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
				if (method5738(16711680))
					((Class321) this).anAbstractQueue_Sub1_3727.remove(class328);
				Object object_18_ = ((Class328) class328).anObject3768;
				return object_18_;
			}
			Object object_19_ = null;
			return object_19_;
		}
	}

	public Object method5750(Object object) {
		synchronized (this) {
			if (-1L != ((Class321) this).aLong3726 * 7831064100123684311L)
				method5745((byte) 97);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.remove(object);
			if (null != class328) {
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
				if (method5738(16711680))
					((Class321) this).anAbstractQueue_Sub1_3727.remove(class328);
				Object object_20_ = ((Class328) class328).anObject3768;
				return object_20_;
			}
			Object object_21_ = null;
			return object_21_;
		}
	}

	public Object method5751(Object object) {
		synchronized (this) {
			if (-1L != ((Class321) this).aLong3726 * 7831064100123684311L)
				method5745((byte) 47);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.remove(object);
			if (null != class328) {
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
				if (method5738(16711680))
					((Class321) this).anAbstractQueue_Sub1_3727.remove(class328);
				Object object_22_ = ((Class328) class328).anObject3768;
				return object_22_;
			}
			Object object_23_ = null;
			return object_23_;
		}
	}

	public Object method5752(Object object, Object object_24_) {
		synchronized (this) {
			if (-1L != 7831064100123684311L * ((Class321) this).aLong3726)
				method5745((byte) 18);
			Class328 class328 = (Class328) ((Class321) this).aMap3728.get(object);
			if (null != class328) {
				Object object_25_ = ((Class328) class328).anObject3768;
				((Class328) class328).anObject3768 = object_24_;
				method5742(class328, false, (byte) 90);
				Object object_26_ = object_25_;
				return object_26_;
			}
			if (method5738(16711680) && (((Class321) this).aMap3728.size() == 1607551379 * ((Class321) this).anInt3730)) {
				Class328 class328_27_ = ((Class328) ((Class321) this).anAbstractQueue_Sub1_3727.remove());
				((Class321) this).aMap3728.remove(((Class328) class328_27_).anObject3770);
				((Class321) this).anAbstractQueue_Sub1_3725.remove(class328_27_);
			}
			Class328 class328_28_ = new Class328(object_24_, object);
			((Class321) this).aMap3728.put(object, class328_28_);
			method5742(class328_28_, true, (byte) 10);
			Object object_29_ = null;
			return object_29_;
		}
	}

	public Class321(int i, Class332 class332) {
		this(-1L, i, class332);
	}

	void method5753(Class328 class328, boolean bool) {
		if (!bool) {
			((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
			if (method5738(16711680) && !((Class321) this).anAbstractQueue_Sub1_3727.remove(class328))
				throw new IllegalStateException("");
		}
		((Class328) class328).aLong3767 = System.currentTimeMillis() * -8918812157227430537L;
		if (method5738(16711680)) {
			switch (((Class332) ((Class321) this).aClass332_3729).anInt3876 * -433915021) {
			case 0:
				((Class328) class328).aLong3769 += -6433242713277960601L;
				break;
			case 1:
				((Class328) class328).aLong3769 = ((Class328) class328).aLong3767 * 1071323446977045137L;
				break;
			}
			((Class321) this).anAbstractQueue_Sub1_3727.add(class328);
		}
		((Class321) this).anAbstractQueue_Sub1_3725.add(class328);
	}

	void method5754(Class328 class328, boolean bool) {
		if (!bool) {
			((Class321) this).anAbstractQueue_Sub1_3725.remove(class328);
			if (method5738(16711680) && !((Class321) this).anAbstractQueue_Sub1_3727.remove(class328))
				throw new IllegalStateException("");
		}
		((Class328) class328).aLong3767 = System.currentTimeMillis() * -8918812157227430537L;
		if (method5738(16711680)) {
			switch (((Class332) ((Class321) this).aClass332_3729).anInt3876 * -433915021) {
			case 0:
				((Class328) class328).aLong3769 += -6433242713277960601L;
				break;
			case 1:
				((Class328) class328).aLong3769 = ((Class328) class328).aLong3767 * 1071323446977045137L;
				break;
			}
			((Class321) this).anAbstractQueue_Sub1_3727.add(class328);
		}
		((Class321) this).anAbstractQueue_Sub1_3725.add(class328);
	}

	static final void method5755(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.aBool7323 ? 1 : 0;
	}

	static final void method5756(CS2Executor class527, byte i) {
		int i_30_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_30_, (byte) 45);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_30_ >> 16];
		Class82.method1454(class118, class98, class527, (byte) 50);
	}

	public static void method5757(int i) {
		Class345.aClass229_4031.method3859(1719265419);
	}

	static final void method5758(CS2Executor class527, byte i) {
		int i_31_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_31_, (byte) 127);
		Class475.method7927(class118, class527, (byte) -98);
	}
}
