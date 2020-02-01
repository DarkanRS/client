package com.jagex;
public class JS5LocalRequester implements Runnable {

	Queue aClass477_3664 = new Queue();
	int anInt3662 = 0;
	boolean aBool3661 = false;
	Thread aThread3663 = new Thread(this);

	CacheableNode_Sub11_Sub2 method5564(int i_1, byte[] bytes_2, JS5CacheFile js5cachefile_3, int i_4) {
		CacheableNode_Sub11_Sub2 class282_sub50_sub11_sub2_5 = new CacheableNode_Sub11_Sub2();
		class282_sub50_sub11_sub2_5.anInt10467 = 2;
		class282_sub50_sub11_sub2_5.key = (long) i_1;
		class282_sub50_sub11_sub2_5.aByteArray10469 = bytes_2;
		class282_sub50_sub11_sub2_5.aClass203_10464 = js5cachefile_3;
		class282_sub50_sub11_sub2_5.highPriority = false;
		this.method5569(class282_sub50_sub11_sub2_5, 1039174565);
		return class282_sub50_sub11_sub2_5;
	}

	public JS5LocalRequester() {
		this.aThread3663.setDaemon(true);
		this.aThread3663.start();
		this.aThread3663.setPriority(1);
	}

	public void run() {
		while (!this.aBool3661) {
			Queue class477_2 = this.aClass477_3664;
			CacheableNode_Sub11_Sub2 class282_sub50_sub11_sub2_1;
			synchronized (this.aClass477_3664) {
				class282_sub50_sub11_sub2_1 = (CacheableNode_Sub11_Sub2) this.aClass477_3664.method7937(1974175895);
				if (class282_sub50_sub11_sub2_1 == null) {
					try {
						this.aClass477_3664.wait();
					} catch (InterruptedException interruptedexception_5) {
						;
					}
					continue;
				}

				--this.anInt3662;
			}

			try {
				if (class282_sub50_sub11_sub2_1.anInt10467 == 2) {
					class282_sub50_sub11_sub2_1.aClass203_10464.method3348((int) class282_sub50_sub11_sub2_1.key, class282_sub50_sub11_sub2_1.aByteArray10469, class282_sub50_sub11_sub2_1.aByteArray10469.length);
				} else if (class282_sub50_sub11_sub2_1.anInt10467 == 3) {
					class282_sub50_sub11_sub2_1.aByteArray10469 = class282_sub50_sub11_sub2_1.aClass203_10464.method3350((int) class282_sub50_sub11_sub2_1.key, (byte) 25);
				}
			} catch (Exception exception_4) {
				Class151.method2594((String) null, exception_4, (byte) -118);
			}

			class282_sub50_sub11_sub2_1.waiting = false;
		}

	}

	public void method5565(byte b_1) {
		this.aBool3661 = true;
		Queue class477_2 = this.aClass477_3664;
		synchronized (this.aClass477_3664) {
			this.aClass477_3664.notifyAll();
		}

		try {
			this.aThread3663.join();
		} catch (InterruptedException interruptedexception_3) {
			;
		}

		this.aThread3663 = null;
	}

	CacheableNode_Sub11_Sub2 method5567(int i_1, JS5CacheFile js5cachefile_2) {
		CacheableNode_Sub11_Sub2 class282_sub50_sub11_sub2_4 = new CacheableNode_Sub11_Sub2();
		class282_sub50_sub11_sub2_4.anInt10467 = 3;
		class282_sub50_sub11_sub2_4.key = (long) i_1;
		class282_sub50_sub11_sub2_4.aClass203_10464 = js5cachefile_2;
		class282_sub50_sub11_sub2_4.highPriority = false;
		this.method5569(class282_sub50_sub11_sub2_4, 400126913);
		return class282_sub50_sub11_sub2_4;
	}

	void method5569(CacheableNode_Sub11_Sub2 class282_sub50_sub11_sub2_1, int i_2) {
		Queue class477_3 = this.aClass477_3664;
		synchronized (this.aClass477_3664) {
			this.aClass477_3664.method7936(class282_sub50_sub11_sub2_1);
			++this.anInt3662;
			this.aClass477_3664.notifyAll();
		}
	}

	CacheableNode_Sub11_Sub2 method5578(int i_1, JS5CacheFile js5cachefile_2, int i_3) {
		CacheableNode_Sub11_Sub2 class282_sub50_sub11_sub2_4 = new CacheableNode_Sub11_Sub2();
		class282_sub50_sub11_sub2_4.anInt10467 = 1;
		Queue class477_5 = this.aClass477_3664;
		synchronized (this.aClass477_3664) {
			CacheableNode_Sub11_Sub2 class282_sub50_sub11_sub2_6 = (CacheableNode_Sub11_Sub2) this.aClass477_3664.method7941();

			while (true) {
				if (class282_sub50_sub11_sub2_6 == null) {
					break;
				}

				if ((long) i_1 == class282_sub50_sub11_sub2_6.key && js5cachefile_2 == class282_sub50_sub11_sub2_6.aClass203_10464 && class282_sub50_sub11_sub2_6.anInt10467 == 2) {
					class282_sub50_sub11_sub2_4.aByteArray10469 = class282_sub50_sub11_sub2_6.aByteArray10469;
					class282_sub50_sub11_sub2_4.waiting = false;
					return class282_sub50_sub11_sub2_4;
				}

				class282_sub50_sub11_sub2_6 = (CacheableNode_Sub11_Sub2) this.aClass477_3664.method7955(-1570817833);
			}
		}

		class282_sub50_sub11_sub2_4.aByteArray10469 = js5cachefile_2.method3350(i_1, (byte) 6);
		class282_sub50_sub11_sub2_4.waiting = false;
		class282_sub50_sub11_sub2_4.highPriority = true;
		return class282_sub50_sub11_sub2_4;
	}

	public static void method5581(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(17, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 13);
	}

}
