
/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class340 implements Runnable {
	Class257 aClass257_3988;
	volatile boolean aBool3989 = false;
	LinkedList aLinkedList3990 = new LinkedList();
	static int anInt3991;

	public void method6048(Class335 class335) {
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335);
			this.aLinkedList3990.notify();
		}
	}

	public void method6049(Class335 class335, int i) {
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335);
			this.aLinkedList3990.notify();
		}
	}

	void method6050(Class257 class257, byte i) {
		this.aClass257_3988 = class257;
	}

	public boolean method6051(int i) {
		return this.aBool3989;
	}

	public Class340() {
		this.aClass257_3988 = new Class257(true);
	}

	public Class257 method6052(short i) {
		return this.aClass257_3988;
	}

	public void method6053() {
		for (;;) {
			method6054((byte) 2);
		}
	}

	void method6054(byte i) {
		Object object = null;
		Class335 class335;
		synchronized (this.aLinkedList3990) {
			try {
				this.aLinkedList3990.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class335 = (Class335) this.aLinkedList3990.pollFirst();
		}
		do {
			try {
				try {
					if (class335 != null) {
						if (i != 2) {
							break;
						}
						this.aBool3989 = true;
						method6055(class335, -1292482767);
					}
				} catch (Exception exception) {
					this.aBool3989 = false;
					break;
				}
				this.aBool3989 = false;
			} catch (Exception object_0_) {
				this.aBool3989 = false;
				//throw object_0_;
			}
		} while (false);
	}

	void method6055(Class335 class335, int i) {
		if (class335.aClass256_3915 == Class256.aClass256_3152) {
			this.aClass257_3988.method4547((byte) -52);
		} else {
			this.aClass257_3988.method4499(class335, 233576206);
		}
		for (boolean bool = this.aClass257_3988.method4461((byte) -10); !bool; bool = this.aClass257_3988.method4461((byte) -76)) {
			/* empty */
		}
		this.aClass257_3988.method4445((byte) -92);
		client.aClass257_7353.method4445((byte) -40);
	}

	public void method6056() {
		for (;;) {
			method6054((byte) 2);
		}
	}

	void method6057(Class257 class257) {
		this.aClass257_3988 = class257;
	}

	public void method6058(Class474 class474) {
		this.aClass257_3988.method4442(class474, -834443097);
	}

	public void method6059(Class474 class474) {
		this.aClass257_3988.method4442(class474, -834443097);
	}

	public void method6060(Class335 class335) {
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335);
			this.aLinkedList3990.notify();
		}
	}

	public void method6061(Class335 class335) {
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335);
			this.aLinkedList3990.notify();
		}
	}

	public void method6062(Class474 class474, int i) {
		this.aClass257_3988.method4442(class474, -834443097);
	}

	public void method6063(Class335 class335) {
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335);
			this.aLinkedList3990.notify();
		}
	}

	public boolean method6064() {
		return this.aBool3989;
	}

	public boolean method6065() {
		return this.aBool3989;
	}

	public Class257 method6066() {
		return this.aClass257_3988;
	}

	public Class257 method6067() {
		return this.aClass257_3988;
	}

	@Override
	public void run() {
		for (;;) {
			method6054((byte) 2);
		}
	}

	void method6068(Class257 class257) {
		this.aClass257_3988 = class257;
	}

	void method6069() {
		Object object = null;
		Class335 class335;
		synchronized (this.aLinkedList3990) {
			try {
				this.aLinkedList3990.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class335 = (Class335) this.aLinkedList3990.pollFirst();
		}
		do {
			try {
				try {
					if (class335 != null) {
						this.aBool3989 = true;
						method6055(class335, -1674929098);
					}
				} catch (Exception exception) {
					this.aBool3989 = false;
					break;
				}
				this.aBool3989 = false;
			} catch (Exception object_1_) {
				this.aBool3989 = false;
				//throw object_1_;
			}
		} while (false);
	}

	public static void method6070(int i, int i_2_, String string, String string_3_, String string_4_, String string_5_, String string_6_, int i_7_, int i_8_) {
		Class108 class108 = Class81.aClass108Array798[99];
		for (int i_9_ = 99; i_9_ > 0; i_9_--) {
			Class81.aClass108Array798[i_9_] = Class81.aClass108Array798[i_9_ - 1];
		}
		if (null == class108) {
			class108 = new Class108(i, i_2_, string, string_3_, string_4_, string_6_, i_7_, string_5_);
		} else {
			class108.method1840(i, i_2_, string, string_3_, string_4_, string_6_, i_7_, string_5_, 34167);
		}
		Class81.aClass108Array798[0] = class108;
		Class81.anInt800 += 809055037;
		client.anInt7391 = -1529209901 * client.anInt7347;
	}

	static final void method6071(Class527 class527, byte i) {
		Class513 class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = class513.aClass118_5886;
		Class98 class98 = class513.aClass98_5885;
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method6072(Class527 class527, int i) {
		class527.anIntArray6999[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12707(1260810349) && Class316.aClass505_3680.method8403()) ? 1 : 0;
	}
}
