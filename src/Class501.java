/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class501 {
	int anInt6118;
	static int anInt6119;
	ReferenceQueue aReferenceQueue6120 = new ReferenceQueue();
	WeakReference_Sub1[] aWeakReference_Sub1Array6121 = new WeakReference_Sub1[16];
	public static Class395 aClass395_6122;
	public static Class57 aClass57_6123;

	public void method6222(Object object, Object object_0_, int i) {
		try {
			if (null == object)
				throw new NullPointerException();
			method6223(1702492864);
			int i_1_ = System.identityHashCode(object);
			int i_2_ = i_1_ & (((Class501) this).aWeakReference_Sub1Array6121.length - 1);
			WeakReference_Sub1 weakreference_sub1 = ((Class501) this).aWeakReference_Sub1Array6121[i_2_];
			if (weakreference_sub1 == null) {
				((Class501) this).aWeakReference_Sub1Array6121[i_2_] = new WeakReference_Sub1(object, (((Class501) this).aReferenceQueue6120), i_1_, object_0_);
				((Class501) this).anInt6118 += -1233820543;
				if (2061425537 * ((Class501) this).anInt6118 >= ((Class501) this).aWeakReference_Sub1Array6121.length)
					method6226(-354056618);
			} else {
				for (;;) {
					if (weakreference_sub1.get() == object) {
						if (i != -391880689) {
							/* empty */
						}
						break;
					}
					if ((((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302) == null) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302 = new WeakReference_Sub1(object, (((Class501) this).aReferenceQueue6120), i_1_, object_0_);
						((Class501) this).anInt6118 += -1233820543;
						if (((Class501) this).anInt6118 * 2061425537 >= (((Class501) this).aWeakReference_Sub1Array6121).length)
							method6226(-2117837549);
						break;
					}
					weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.a(").append(')').toString());
		}
	}

	void method6223(int i) {
		try {
			for (;;) {
				WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class501) this).aReferenceQueue6120.poll());
				if (weakreference_sub1 == null)
					break;
				int i_3_ = ((1530822039 * ((WeakReference_Sub1) weakreference_sub1).anInt6301) & (((Class501) this).aWeakReference_Sub1Array6121.length - 1));
				WeakReference_Sub1 weakreference_sub1_4_ = ((Class501) this).aWeakReference_Sub1Array6121[i_3_];
				if (weakreference_sub1 == weakreference_sub1_4_) {
					((Class501) this).aWeakReference_Sub1Array6121[i_3_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302);
					((Class501) this).anInt6118 -= -1233820543;
				} else {
					for (/**/; (null != weakreference_sub1_4_ && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_4_).aWeakReference_Sub1_6302))); weakreference_sub1_4_ = (((WeakReference_Sub1) weakreference_sub1_4_).aWeakReference_Sub1_6302)) {
						/* empty */
					}
					if (weakreference_sub1_4_ != null) {
						((WeakReference_Sub1) weakreference_sub1_4_).aWeakReference_Sub1_6302 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302);
						((Class501) this).anInt6118 -= -1233820543;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.i(").append(')').toString());
		}
	}

	public ArrayList method6224(int i) {
		try {
			method6223(-93976926);
			ArrayList arraylist = new ArrayList(((Class501) this).anInt6118 * 2061425537);
			WeakReference_Sub1[] weakreference_sub1s = ((Class501) this).aWeakReference_Sub1Array6121;
			for (int i_5_ = 0; i_5_ < weakreference_sub1s.length; i_5_++) {
				for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_5_]; null != weakreference_sub1; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302)) {
					Object object = weakreference_sub1.get();
					if (object != null)
						arraylist.add(object);
				}
			}
			return arraylist;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.b(").append(')').toString());
		}
	}

	public void method6225(Object object, int i) {
		try {
			if (object == null)
				throw new NullPointerException();
			method6223(-439163515);
			int i_6_ = System.identityHashCode(object);
			int i_7_ = i_6_ & (((Class501) this).aWeakReference_Sub1Array6121.length - 1);
			WeakReference_Sub1 weakreference_sub1 = ((Class501) this).aWeakReference_Sub1Array6121[i_7_];
			if (null != weakreference_sub1) {
				if (weakreference_sub1.get() == object) {
					((Class501) this).aWeakReference_Sub1Array6121[i_7_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302);
					((Class501) this).anInt6118 -= -1233820543;
				} else {
					for (;;) {
						WeakReference_Sub1 weakreference_sub1_8_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302);
						if (weakreference_sub1_8_ == null) {
							if (i < 125611783)
								break;
							break;
						}
						if (weakreference_sub1_8_.get() == object) {
							((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302 = (((WeakReference_Sub1) weakreference_sub1_8_).aWeakReference_Sub1_6302);
							((Class501) this).anInt6118 -= -1233820543;
							break;
						}
						weakreference_sub1 = weakreference_sub1_8_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.f(").append(')').toString());
		}
	}

	void method6226(int i) {
		try {
			WeakReference_Sub1[] weakreference_sub1s = ((Class501) this).aWeakReference_Sub1Array6121;
			((Class501) this).aWeakReference_Sub1Array6121 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
			WeakReference_Sub1[] weakreference_sub1s_9_ = weakreference_sub1s;
			for (int i_10_ = 0; i_10_ < weakreference_sub1s_9_.length; i_10_++) {
				WeakReference_Sub1 weakreference_sub1_11_;
				for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_9_[i_10_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_11_) {
					weakreference_sub1_11_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302);
					int i_12_ = ((((WeakReference_Sub1) weakreference_sub1).anInt6301 * 1530822039) & (((Class501) this).aWeakReference_Sub1Array6121).length - 1);
					((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6302 = (((Class501) this).aWeakReference_Sub1Array6121[i_12_]);
					((Class501) this).aWeakReference_Sub1Array6121[i_12_] = weakreference_sub1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.p(").append(')').toString());
		}
	}

	public static void method6227(boolean bool, int i) {
		try {
			if (bool) {
				if (-1 != client.WINDOW_PANE_ID * -257444687)
					Class82_Sub8.method893(-257444687 * client.WINDOW_PANE_ID, -2042512871);
				for (Interface class298_sub51 = ((Interface) client.aClass437_8841.method5816(1741120464)); null != class298_sub51; class298_sub51 = ((Interface) client.aClass437_8841.method5815((byte) 42))) {
					if (!class298_sub51.method2840(-629325116)) {
						class298_sub51 = ((Interface) client.aClass437_8841.method5816(1941104676));
						if (class298_sub51 == null) {
							if (i < -995600773)
								break;
							return;
						}
					}
					Class173.method1821(class298_sub51, true, false, -113822480);
				}
				client.WINDOW_PANE_ID = -1785861201;
				client.aClass437_8841 = new HashTable(8);
				Class397.method4912((short) 255);
				client.WINDOW_PANE_ID = 62030331 * HashTable.aClass371_5520.anInt4042;
				Class257.method2453(false, (byte) 8);
				Class360.method4301(-960032596);
				Class14.method341(-257444687 * client.WINDOW_PANE_ID, null, 2019085039);
			}
			Class209.method1939(-2068735860);
			Class360.aBoolean3912 = false;
			ConfigDefinitions.method3983(1449725764);
			client.anInt8937 = 280458557;
			Class518.method6314(client.anInt8831 * 1203044105, 614001892);
			Class287.myPlayer = new Player(null);
			Class287.myPlayer.method4341((float) (client.aClass283_8716.method2629(-1895849411) * 512 / 2), 0.0F, (float) (client.aClass283_8716.method2630(501771104) * 512 / 2));
			Class287.myPlayer.scenePositionXQueue[0] = client.aClass283_8716.method2629(-1873805931) / 2;
			Class287.myPlayer.scenePositionYQueue[0] = client.aClass283_8716.method2630(2001443939) / 2;
			Class146.anInt1575 = 0;
			Class367.anInt4000 = 0;
			if (3 == Class298_Sub1.anInt7164 * -863531439) {
				Class367.anInt4000 = (1374340743 * Class376.anInt4089 << 9) * 547882953;
				Class146.anInt1575 = (Class82_Sub4.anInt6832 * -1548077269 << 9) * 309839105;
			} else
				Class397.method4913((byte) 90);
			client.aClass283_8716.method2640((byte) -45).method4324(-1834713428);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.fs(").append(')').toString());
		}
	}

	static final void method6228(ClientScript2 class403, byte i) {
		try {
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_13_, (byte) -38);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1354508417 * class105.anInt1143;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.qx(").append(')').toString());
		}
	}

	static boolean method6229(RsBitsBuffer class298_sub53_sub2, int i, int i_14_) {
		try {
			int i_15_ = class298_sub53_sub2.readBits(2);
			if (0 == i_15_) {
				if (class298_sub53_sub2.readBits(1) != 0)
					method6229(class298_sub53_sub2, i, -1136734730);
				int i_16_ = class298_sub53_sub2.readBits(6);
				int i_17_ = class298_sub53_sub2.readBits(6);
				boolean bool = class298_sub53_sub2.readBits(1) == 1;
				if (bool)
					Class10.anIntArray140[(Class10.anInt139 += 867608709) * -1281683379 - 1] = i;
				if (null != client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i])
					throw new RuntimeException();
				Class410 class410 = Class10.aClass410Array138[i];
				Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i] = (new Player(client.aClass283_8716.method2675(-1611682495))));
				class365_sub1_sub1_sub2_sub2.anInt10064 = i * 1714292119;
				if (null != Class10.aClass298_Sub53Array133[i])
					class365_sub1_sub1_sub2_sub2.sendAppearence(Class10.aClass298_Sub53Array133[i], (byte) 3);
				class365_sub1_sub1_sub2_sub2.method4415(-1000138653 * ((Class410) class410).anInt5286, true, 1449559817);
				class365_sub1_sub1_sub2_sub2.anInt10090 = -790543005 * ((Class410) class410).anInt5285;
				int i_18_ = ((Class410) class410).anInt5288 * 1966930015;
				int i_19_ = i_18_ >> 28;
				int i_20_ = i_18_ >> 14 & 0xff;
				int i_21_ = i_18_ & 0xff;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				int i_22_ = (i_20_ << 6) + i_16_ - class341.gameSceneBaseX * -1760580017;
				int i_23_ = (i_21_ << 6) + i_17_ - 283514611 * class341.gameSceneBaseY;
				class365_sub1_sub1_sub2_sub2.aBoolean10203 = ((Class410) class410).aBoolean5287;
				class365_sub1_sub1_sub2_sub2.aBoolean10222 = ((Class410) class410).aBoolean5289;
				class365_sub1_sub1_sub2_sub2.aByteArray10110[0] = Class10.playersMovementTypes[i];
				class365_sub1_sub1_sub2_sub2.plane = class365_sub1_sub1_sub2_sub2.aByte7724 = (byte) i_19_;
				if (client.aClass283_8716.method2654(1040339757).method2320(i_22_, i_23_, -937818147))
					class365_sub1_sub1_sub2_sub2.aByte7724++;
				class365_sub1_sub1_sub2_sub2.method4472(i_22_, i_23_, -2040915654);
				class365_sub1_sub1_sub2_sub2.aBoolean10217 = false;
				Class10.aClass410Array138[i] = null;
				return true;
			}
			if (1 == i_15_) {
				int i_24_ = class298_sub53_sub2.readBits(2);
				int i_25_ = (((Class410) Class10.aClass410Array138[i]).anInt5288 * 1966930015);
				((Class410) Class10.aClass410Array138[i]).anInt5288 = (((i_24_ + (i_25_ >> 28) & 0x3) << 28) + (i_25_ & 0xfffffff)) * 1896571807;
				return false;
			}
			if (i_15_ == 2) {
				int i_26_ = class298_sub53_sub2.readBits(5);
				int i_27_ = i_26_ >> 3;
				int i_28_ = i_26_ & 0x7;
				int i_29_ = (1966930015 * ((Class410) Class10.aClass410Array138[i]).anInt5288);
				int i_30_ = (i_29_ >> 28) + i_27_ & 0x3;
				int i_31_ = i_29_ >> 14 & 0xff;
				int i_32_ = i_29_ & 0xff;
				if (i_28_ == 0) {
					i_31_--;
					i_32_--;
				}
				if (i_28_ == 1)
					i_32_--;
				if (i_28_ == 2) {
					i_31_++;
					i_32_--;
				}
				if (3 == i_28_)
					i_31_--;
				if (4 == i_28_)
					i_31_++;
				if (i_28_ == 5) {
					i_31_--;
					i_32_++;
				}
				if (6 == i_28_)
					i_32_++;
				if (i_28_ == 7) {
					i_31_++;
					i_32_++;
				}
				((Class410) Class10.aClass410Array138[i]).anInt5288 = 1896571807 * (i_32_ + ((i_30_ << 28) + (i_31_ << 14)));
				return false;
			}
			int i_33_ = class298_sub53_sub2.readBits(18);
			int i_34_ = i_33_ >> 16;
			int i_35_ = i_33_ >> 8 & 0xff;
			int i_36_ = i_33_ & 0xff;
			int i_37_ = (1966930015 * ((Class410) Class10.aClass410Array138[i]).anInt5288);
			int i_38_ = i_34_ + (i_37_ >> 28) & 0x3;
			int i_39_ = i_35_ + (i_37_ >> 14) & 0xff;
			int i_40_ = i_37_ + i_36_ & 0xff;
			((Class410) Class10.aClass410Array138[i]).anInt5288 = (i_40_ + ((i_39_ << 14) + (i_38_ << 28))) * 1896571807;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.k(").append(')').toString());
		}
	}

	static void method6230(int i, String string, int i_41_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(2, (long) i);
			class298_sub37_sub12.method3449((byte) 54);
			((Class298_Sub37_Sub12) class298_sub37_sub12).aString9611 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.at(").append(')').toString());
		}
	}

	static void method6231(File file, byte[] is, int i, int i_42_) throws IOException {
		try {
			DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
			try {
				datainputstream.readFully(is, 0, i);
			} catch (EOFException eofexception) {
				/* empty */
			}
			datainputstream.close();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("us.a(").append(')').toString());
		}
	}
}
