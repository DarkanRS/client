/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class JS5LocalRequester implements Runnable {
	boolean aBool3661;
	int anInt3662;
	Thread aThread3663;
	Class477 aClass477_3664 = new Class477();
	
	public void method5561() {
		while (!((JS5LocalRequester) this).aBool3661) {
			Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2;
			synchronized (((JS5LocalRequester) this).aClass477_3664) {
				class282_sub50_sub11_sub2 = (Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7937(2083604428);
				if (null != class282_sub50_sub11_sub2)
					((JS5LocalRequester) this).anInt3662 -= 985427143;
				else {
					try {
						((JS5LocalRequester) this).aClass477_3664.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467) * 1459013903)
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464.method3348((int) (class282_sub50_sub11_sub2.key * -7883876913471066125L), ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469, ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469.length, -180281887);
				else if (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 * 1459013903 == 3)
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464.method3350((int) (-7883876913471066125L * class282_sub50_sub11_sub2.key), (byte) 23));
			} catch (Exception exception) {
				Class151.method2594(null, exception, (byte) -1);
			}
			((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		}
	}

	public void method5562() {
		((JS5LocalRequester) this).aBool3661 = true;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
		try {
			((JS5LocalRequester) this).aThread3663.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((JS5LocalRequester) this).aThread3663 = null;
	}

	void method5563(Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2) {
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.method7936(class282_sub50_sub11_sub2, -1738910950);
			((JS5LocalRequester) this).anInt3662 += 985427143;
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
	}

	Class282_Sub50_Sub11_Sub2 method5564(int i, byte[] is, JS5CacheFile class203, int i_0_) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = 1795558366;
		class282_sub50_sub11_sub2.key = (long) i * 5418180015864004923L;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = is;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464 = class203;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = false;
		method5569(class282_sub50_sub11_sub2, 1039174565);
		return class282_sub50_sub11_sub2;
	}

	public JS5LocalRequester() {
		((JS5LocalRequester) this).anInt3662 = 0;
		((JS5LocalRequester) this).aBool3661 = false;
		((JS5LocalRequester) this).aThread3663 = new Thread(this);
		((JS5LocalRequester) this).aThread3663.setDaemon(true);
		((JS5LocalRequester) this).aThread3663.start();
		((JS5LocalRequester) this).aThread3663.setPriority(1);
	}

	public void run() {
		while (!((JS5LocalRequester) this).aBool3661) {
			Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2;
			synchronized (((JS5LocalRequester) this).aClass477_3664) {
				class282_sub50_sub11_sub2 = (Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7937(1974175895);
				if (null != class282_sub50_sub11_sub2)
					((JS5LocalRequester) this).anInt3662 -= 985427143;
				else {
					try {
						((JS5LocalRequester) this).aClass477_3664.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467) * 1459013903)
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464.method3348((int) (class282_sub50_sub11_sub2.key * -7883876913471066125L), ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469, ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469.length, -2009158934);
				else if (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 * 1459013903 == 3)
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464.method3350((int) (-7883876913471066125L * class282_sub50_sub11_sub2.key), (byte) 25));
			} catch (Exception exception) {
				Class151.method2594(null, exception, (byte) -118);
			}
			((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		}
	}

	public void method5565(byte i) {
		((JS5LocalRequester) this).aBool3661 = true;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
		try {
			((JS5LocalRequester) this).aThread3663.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((JS5LocalRequester) this).aThread3663 = null;
	}

	public void method5566() {
		while (!((JS5LocalRequester) this).aBool3661) {
			Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2;
			synchronized (((JS5LocalRequester) this).aClass477_3664) {
				class282_sub50_sub11_sub2 = (Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7937(-199336628);
				if (null != class282_sub50_sub11_sub2)
					((JS5LocalRequester) this).anInt3662 -= 985427143;
				else {
					try {
						((JS5LocalRequester) this).aClass477_3664.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467) * 1459013903)
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464.method3348((int) (class282_sub50_sub11_sub2.key * -7883876913471066125L), ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469, ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469.length, 123722418);
				else if (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 * 1459013903 == 3)
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464.method3350((int) (-7883876913471066125L * class282_sub50_sub11_sub2.key), (byte) 117));
			} catch (Exception exception) {
				Class151.method2594(null, exception, (byte) -95);
			}
			((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		}
	}

	Class282_Sub50_Sub11_Sub2 method5567(int i, JS5CacheFile class203, int i_1_) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = -1601629747;
		class282_sub50_sub11_sub2.key = 5418180015864004923L * (long) i;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464 = class203;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = false;
		method5569(class282_sub50_sub11_sub2, 400126913);
		return class282_sub50_sub11_sub2;
	}

	Class282_Sub50_Sub11_Sub2 method5568(int i, JS5CacheFile class203) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = 897779183;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			for (Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_2_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7941((byte) 4)); null != class282_sub50_sub11_sub2_2_; class282_sub50_sub11_sub2_2_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7955(1024225838))) {
				if ((long) i == (-7883876913471066125L * class282_sub50_sub11_sub2_2_.key) && (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_2_).aClass203_10464 == class203) && 2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_2_).anInt10467 * 1459013903)) {
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_2_).aByteArray10469;
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
					Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_3_ = class282_sub50_sub11_sub2;
					return class282_sub50_sub11_sub2_3_;
				}
			}
		}
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = class203.method3350(i, (byte) 50);
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = true;
		return class282_sub50_sub11_sub2;
	}

	void method5569(Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2, int i) {
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.method7936(class282_sub50_sub11_sub2, -1738910950);
			((JS5LocalRequester) this).anInt3662 += 985427143;
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
	}

	Class282_Sub50_Sub11_Sub2 method5570(int i, JS5CacheFile class203) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = 897779183;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			for (Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_4_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7941((byte) 4)); null != class282_sub50_sub11_sub2_4_; class282_sub50_sub11_sub2_4_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7955(-838839358))) {
				if ((long) i == (-7883876913471066125L * class282_sub50_sub11_sub2_4_.key) && (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_4_).aClass203_10464 == class203) && 2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_4_).anInt10467 * 1459013903)) {
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_4_).aByteArray10469;
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
					Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_5_ = class282_sub50_sub11_sub2;
					return class282_sub50_sub11_sub2_5_;
				}
			}
		}
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = class203.method3350(i, (byte) 51);
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = true;
		return class282_sub50_sub11_sub2;
	}

	Class282_Sub50_Sub11_Sub2 method5571(int i, JS5CacheFile class203) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = 897779183;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			for (Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_6_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7941((byte) 4)); null != class282_sub50_sub11_sub2_6_; class282_sub50_sub11_sub2_6_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7955(930531401))) {
				if ((long) i == (-7883876913471066125L * class282_sub50_sub11_sub2_6_.key) && (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_6_).aClass203_10464 == class203) && 2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_6_).anInt10467 * 1459013903)) {
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_6_).aByteArray10469;
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
					Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_7_ = class282_sub50_sub11_sub2;
					return class282_sub50_sub11_sub2_7_;
				}
			}
		}
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = class203.method3350(i, (byte) 51);
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = true;
		return class282_sub50_sub11_sub2;
	}

	Class282_Sub50_Sub11_Sub2 method5572(int i, JS5CacheFile class203) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = -1601629747;
		class282_sub50_sub11_sub2.key = 5418180015864004923L * (long) i;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aClass203_10464 = class203;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = false;
		method5569(class282_sub50_sub11_sub2, -339241790);
		return class282_sub50_sub11_sub2;
	}

	void method5573(Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2) {
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.method7936(class282_sub50_sub11_sub2, -1738910950);
			((JS5LocalRequester) this).anInt3662 += 985427143;
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
	}

	void method5574(Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2) {
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.method7936(class282_sub50_sub11_sub2, -1738910950);
			((JS5LocalRequester) this).anInt3662 += 985427143;
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
	}

	Class282_Sub50_Sub11_Sub2 method5575(int i, JS5CacheFile class203) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = 897779183;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			for (Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_8_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7941((byte) 4)); null != class282_sub50_sub11_sub2_8_; class282_sub50_sub11_sub2_8_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7955(917922845))) {
				if ((long) i == (-7883876913471066125L * class282_sub50_sub11_sub2_8_.key) && (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_8_).aClass203_10464 == class203) && 2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_8_).anInt10467 * 1459013903)) {
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_8_).aByteArray10469;
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
					Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_9_ = class282_sub50_sub11_sub2;
					return class282_sub50_sub11_sub2_9_;
				}
			}
		}
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = class203.method3350(i, (byte) 26);
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = true;
		return class282_sub50_sub11_sub2;
	}

	void method5576(Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2) {
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.method7936(class282_sub50_sub11_sub2, -1738910950);
			((JS5LocalRequester) this).anInt3662 += 985427143;
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
	}

	public void method5577() {
		((JS5LocalRequester) this).aBool3661 = true;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
		try {
			((JS5LocalRequester) this).aThread3663.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((JS5LocalRequester) this).aThread3663 = null;
	}

	Class282_Sub50_Sub11_Sub2 method5578(int i, JS5CacheFile class203, int i_10_) {
		Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2 = new Class282_Sub50_Sub11_Sub2();
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).anInt10467 = 897779183;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			for (Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_11_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7941((byte) 4)); null != class282_sub50_sub11_sub2_11_; class282_sub50_sub11_sub2_11_ = ((Class282_Sub50_Sub11_Sub2) ((JS5LocalRequester) this).aClass477_3664.method7955(-1570817833))) {
				if ((long) i == (-7883876913471066125L * class282_sub50_sub11_sub2_11_.key) && (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_11_).aClass203_10464 == class203) && 2 == (((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_11_).anInt10467 * 1459013903)) {
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = ((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2_11_).aByteArray10469;
					((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
					Class282_Sub50_Sub11_Sub2 class282_sub50_sub11_sub2_12_ = class282_sub50_sub11_sub2;
					return class282_sub50_sub11_sub2_12_;
				}
			}
		}
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aByteArray10469 = class203.method3350(i, (byte) 6);
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).incomplete = false;
		((Class282_Sub50_Sub11_Sub2) class282_sub50_sub11_sub2).aBool9637 = true;
		return class282_sub50_sub11_sub2;
	}

	public void method5579() {
		((JS5LocalRequester) this).aBool3661 = true;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
		try {
			((JS5LocalRequester) this).aThread3663.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((JS5LocalRequester) this).aThread3663 = null;
	}

	public void method5580() {
		((JS5LocalRequester) this).aBool3661 = true;
		synchronized (((JS5LocalRequester) this).aClass477_3664) {
			((JS5LocalRequester) this).aClass477_3664.notifyAll();
		}
		try {
			((JS5LocalRequester) this).aThread3663.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((JS5LocalRequester) this).aThread3663 = null;
	}

	public static void method5581(int i, byte i_13_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(17, (long) i);
		class282_sub50_sub12.method14965((byte) 13);
	}
}
