/* Class298_Sub37_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub7 extends Class298_Sub37 {
	HashTable aClass437_9594;

	void method3424(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i != -2124220647) {
						/* empty */
					}
					break;
				}
				method3426(class298_sub53, i_0_, 1595820905);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aim.a(").append(')').toString());
		}
	}

	public int method3425(int i, int i_1_, short i_2_) {
		try {
			if (((Class298_Sub37_Sub7) this).aClass437_9594 == null)
				return i_1_;
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class298_Sub37_Sub7) this).aClass437_9594.get((long) i);
			if (null == class298_sub35)
				return i_1_;
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aim.b(").append(')').toString());
		}
	}

	Class298_Sub37_Sub7() {
		/* empty */
	}

	void method3426(RsByteBuffer class298_sub53, int i, int i_3_) {
		try {
			if (i == 249) {
				int i_4_ = class298_sub53.readUnsignedByte();
				if (null == ((Class298_Sub37_Sub7) this).aClass437_9594) {
					int i_5_ = Class416.method5590(i_4_, (byte) 16);
					((Class298_Sub37_Sub7) this).aClass437_9594 = new HashTable(i_5_);
				}
				for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
					boolean bool = class298_sub53.readUnsignedByte() == 1;
					int i_7_ = class298_sub53.read24BitUnsignedInteger((byte) -75);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(class298_sub53.readString(281550837));
					else
						class298 = new Class298_Sub35(class298_sub53.readInt((byte) -72));
					((Class298_Sub37_Sub7) this).aClass437_9594.method5817(class298, (long) i_7_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aim.f(").append(')').toString());
		}
	}

	public String method3427(int i, String string, byte i_8_) {
		try {
			if (((Class298_Sub37_Sub7) this).aClass437_9594 == null)
				return string;
			Class298_Sub29 class298_sub29 = (Class298_Sub29) ((Class298_Sub37_Sub7) this).aClass437_9594.get((long) i);
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aim.p(").append(')').toString());
		}
	}

	public static void method3428(Entity class365_sub1_sub1_sub2, int[] is, int[] is_9_, int[] is_10_, int i) {
		try {
			for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
				int i_12_ = is[i_11_];
				int i_13_ = is_10_[i_11_];
				int i_14_ = is_9_[i_11_];
				for (int i_15_ = 0; (0 != i_13_ && i_15_ < (class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112).length); i_13_ >>>= 1) {
					if ((i_13_ & 0x1) == 0) {
						if (i != 1644064563) {
							/* empty */
						}
					} else if (-1 == i_12_)
						class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_15_] = null;
					else {
						Class391 class391 = Class501.aClass395_6122.method4903(i_12_, (byte) -80);
						int i_16_ = class391.anInt4184 * -1117238071;
						Class438_Sub2_Sub1 class438_sub2_sub1 = (class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_15_]);
						if (null != class438_sub2_sub1 && class438_sub2_sub1.method5819((byte) -110)) {
							if (i_12_ == class438_sub2_sub1.method5823(1502559146)) {
								if (0 == i_16_) {
									class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_15_] = null;
									class438_sub2_sub1 = null;
								} else if (i_16_ == 1) {
									class438_sub2_sub1.method5834(83585082);
									class438_sub2_sub1.anInt9874 = -731066289 * i_14_;
								} else if (2 == i_16_)
									class438_sub2_sub1.method5842(1476401100);
							} else if (-1445588039 * class391.anInt4178 >= ((class438_sub2_sub1.method5820(595695662).anInt4178) * -1445588039)) {
								class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_15_] = null;
								class438_sub2_sub1 = null;
							}
						}
						if (class438_sub2_sub1 == null || !class438_sub2_sub1.method5819((byte) -3)) {
							class438_sub2_sub1 = class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_15_] = (new Class438_Sub2_Sub1(class365_sub1_sub1_sub2));
							class438_sub2_sub1.method5821(i_12_, -1608832147);
							class438_sub2_sub1.anInt9874 = -731066289 * i_14_;
						}
					}
					i_15_++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aim.ix(").append(')').toString());
		}
	}

	static final void method3429(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int i_17_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = new StringBuilder().append(string).append(Class128_Sub1.method1440(i_17_, true, (byte) 8)).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aim.zy(").append(')').toString());
		}
	}
}
