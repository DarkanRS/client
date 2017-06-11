/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class248 implements Runnable {
	volatile boolean aBoolean2749 = false;
	LinkedList aLinkedList2750 = new LinkedList();
	Class283 aClass283_2751 = new Class283(true);
	public static Class247 aClass247_2752;

	public void method2379(Class433 class433, int i) {
		try {
			((Class248) this).aClass283_2751.method2645(class433, -441647750);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.a(").append(')').toString());
		}
	}

	public boolean method2380(int i) {
		try {
			return ((Class248) this).aBoolean2749;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.b(").append(')').toString());
		}
	}

	void method2381(Class283 class283, int i) {
		try {
			((Class248) this).aClass283_2751 = class283;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.i(").append(')').toString());
		}
	}

	public void run() {
		try {
			for (;;)
				method2382((byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.run(").append(')').toString());
		}
	}

	void method2382(byte i) {
		try {
			Object object = null;
			Class267 class267;
			synchronized (((Class248) this).aLinkedList2750) {
				try {
					((Class248) this).aLinkedList2750.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				class267 = (Class267) ((Class248) this).aLinkedList2750.pollFirst();
			}
			do {
				try {
					try {
						if (class267 != null) {
							((Class248) this).aBoolean2749 = true;
							method2383(class267, 1924370616);
						}
					} catch (Exception exception) {
						((Class248) this).aBoolean2749 = false;
						break;
					}
					((Class248) this).aBoolean2749 = false;
				} catch (RuntimeException object_0_) {
					((Class248) this).aBoolean2749 = false;
					throw object_0_;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.k(").append(')').toString());
		}
	}

	void method2383(Class267 class267, int i) {
		try {
			if (Class266.aClass266_2852 == ((Class267) class267).aClass266_2857)
				((Class248) this).aClass283_2751.method2667(528640146);
			else
				((Class248) this).aClass283_2751.sendMapScene(class267, -1991819579);
			for (boolean bool = ((Class248) this).aClass283_2751.method2672(-1688450979); !bool; bool = ((Class248) this).aClass283_2751.method2672(-770547477)) {
				/* empty */
			}
			((Class248) this).aClass283_2751.method2673((byte) 119);
			client.aClass283_8716.method2673((byte) 25);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.d(").append(')').toString());
		}
	}

	public Class283 method2384(short i) {
		try {
			return ((Class248) this).aClass283_2751;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.p(").append(')').toString());
		}
	}

	public void method2385(Class267 class267, int i) {
		try {
			synchronized (((Class248) this).aLinkedList2750) {
				((Class248) this).aLinkedList2750.add(class267);
				((Class248) this).aLinkedList2750.notify();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.f(").append(')').toString());
		}
	}

	static final void method2386(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			String string_1_ = (String) (((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2068, client.lobbyConnection.aClass449_330, (byte) 47);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((Class58.method693(string, -250227687) + Class58.method693(string_1_, -433489347)), 16711935);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2110683902);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string_1_, 2142092723);
			client.lobbyConnection.method390(class298_sub36, (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.vq(").append(')').toString());
		}
	}

	static final void method2387(ClientScript2 class403, byte i) {
		try {
			Class239.method2208((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), -292908966);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.adc(").append(')').toString());
		}
	}

	public static String decryptStringMessage(String string, int i) {
		try {
			int i_2_ = string.length();
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				char c = string.charAt(i_4_);
				if ('<' == c || c == '>')
					i_3_ += 3;
			}
			StringBuilder stringbuilder = new StringBuilder(i_2_ + i_3_);
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
				char c = string.charAt(i_5_);
				if ('<' == c)
					stringbuilder.append("<lt>");
				else if ('>' == c)
					stringbuilder.append("<gt>");
				else
					stringbuilder.append(c);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.a(").append(')').toString());
		}
	}

	static void method2389(GraphicsToolkit class_ra, Class_ta class_ta, IComponentDefinition class105, int i, int i_6_, int i_7_, int i_8_, int i_9_, byte i_10_) {
		try {
			Class352 class352 = Class363.aClass339_3931.method4116(i_9_, -405562208);
			if (class352 != null && class352.aBoolean3780 && class352.method4237(Class128.aClass148_6331, 1844230404)) {
				if (class352.anIntArray3803 != null) {
					int[] is = new int[class352.anIntArray3803.length];
					for (int i_11_ = 0; i_11_ < is.length / 2; i_11_++) {
						int i_12_;
						if (-863531439 * Class298_Sub1.anInt7164 == 2)
							i_12_ = (int) client.aFloat8949 & 0x3fff;
						else
							i_12_ = (client.anInt8801 * 1227356013 + (int) client.aFloat8949) & 0x3fff;
						int i_13_ = Class220.anIntArray2483[i_12_];
						int i_14_ = Class220.anIntArray2474[i_12_];
						if (Class298_Sub1.anInt7164 * -863531439 != 2) {
							i_13_ = 256 * i_13_ / (client.anInt8749 * 356727603 + 256);
							i_14_ = (i_14_ * 256 / (256 + 356727603 * client.anInt8749));
						}
						is[i_11_ * 2] = ((((i_8_ + 4 * (class352.anIntArray3803[i_11_ * 2 + 1])) * i_13_ + ((i_7_ + 4 * class352.anIntArray3803[i_11_ * 2]) * i_14_)) >> 14) + (class105.anInt1156 * -2093041337 / 2 + i));
						is[i_11_ * 2 + 1] = (i_6_ + class105.anInt1162 * 457937409 / 2 - ((i_14_ * ((class352.anIntArray3803[1 + 2 * i_11_]) * 4 + i_8_) - (4 * class352.anIntArray3803[2 * i_11_] + i_7_) * i_13_) >> 14));
					}
					Class117 class117 = class105.method1116(class_ra, 973176237);
					if (null != class117)
						Class81.method858(class_ra, is, class352.anInt3808 * -248291889, class117.anIntArray1396, class117.anIntArray1395);
					if (class352.anInt3806 * -972644285 > 0) {
						for (int i_15_ = 0; i_15_ < is.length / 2 - 1; i_15_++) {
							int i_16_ = is[i_15_ * 2];
							int i_17_ = is[1 + 2 * i_15_];
							int i_18_ = is[(i_15_ + 1) * 2];
							int i_19_ = is[2 * (i_15_ + 1) + 1];
							if (i_18_ < i_16_) {
								int i_20_ = i_16_;
								int i_21_ = i_17_;
								i_16_ = i_18_;
								i_17_ = i_19_;
								i_18_ = i_20_;
								i_19_ = i_21_;
							} else if (i_18_ == i_16_ && i_19_ < i_17_) {
								int i_22_ = i_17_;
								i_17_ = i_19_;
								i_19_ = i_22_;
							}
							class_ra.method5007(i_16_, i_17_, i_18_, i_19_, (class352.anIntArray3814[class352.aByteArray3777[i_15_] & 0xff]), 1, class_ta, i, i_6_, class352.anInt3806 * -972644285, class352.anInt3799 * 2123190239, -176015499 * class352.anInt3788);
						}
						int i_23_ = is[is.length - 2];
						int i_24_ = is[is.length - 1];
						int i_25_ = is[0];
						int i_26_ = is[1];
						if (i_25_ < i_23_) {
							int i_27_ = i_23_;
							int i_28_ = i_24_;
							i_23_ = i_25_;
							i_24_ = i_26_;
							i_25_ = i_27_;
							i_26_ = i_28_;
						} else if (i_25_ == i_23_ && i_26_ < i_24_) {
							int i_29_ = i_24_;
							i_24_ = i_26_;
							i_26_ = i_29_;
						}
						class_ra.method5007(i_23_, i_24_, i_25_, i_26_, (class352.anIntArray3814[(class352.aByteArray3777[(class352.aByteArray3777.length - 1)]) & 0xff]), 1, class_ta, i, i_6_, -972644285 * class352.anInt3806, 2123190239 * class352.anInt3799, class352.anInt3788 * -176015499);
					} else {
						for (int i_30_ = 0; i_30_ < is.length / 2 - 1; i_30_++)
							class_ra.method5022(is[2 * i_30_], is[1 + 2 * i_30_], is[(i_30_ + 1) * 2], is[1 + 2 * (1 + i_30_)], (class352.anIntArray3814[(class352.aByteArray3777[i_30_]) & 0xff]), 1, class_ta, i, i_6_);
						class_ra.method5022(is[is.length - 2], is[is.length - 1], is[0], is[1], (class352.anIntArray3814[(class352.aByteArray3777[(class352.aByteArray3777.length - 1)]) & 0xff]), 1, class_ta, i, i_6_);
					}
				}
				Class57 class57 = null;
				if (-1 != class352.anInt3785 * 715019623) {
					class57 = class352.method4238(class_ra, false, -98402151);
					if (null != class57)
						Class443.method5883(class105, class_ta, i, i_6_, i_7_, i_8_, class57, (byte) -86);
				}
				if (class352.aString3792 != null) {
					int i_31_ = 0;
					if (null != class57)
						i_31_ = class57.method625();
					Class264 class264 = Script.aClass264_7534;
					Class505 class505 = Class74.aClass505_695;
					if (class352.anInt3783 * 1023000389 == 1) {
						class264 = Class343.aClass264_3673;
						class505 = Class422_Sub2.aClass505_8369;
					}
					if (class352.anInt3783 * 1023000389 == 2) {
						class264 = Class101.aClass264_1084;
						class505 = Class82_Sub19_Sub1.aClass505_9111;
					}
					Class358.method4290(class105, class_ta, i, i_6_, i_7_, i_8_, i_31_, class352.aString3792, class264, class505, -1836991893 * class352.anInt3781, 1768300509);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kj.z(").append(')').toString());
		}
	}
}
