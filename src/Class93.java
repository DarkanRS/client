/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class93 implements Interface23 {
	public int method254(int i) {
		Class298_Sub35 class298_sub35 = (Class298_Sub35) Class87.aClass437_793.get((long) i);
		if (class298_sub35 == null)
			return Class128.aClass148_6331.method252(i, (byte) 84);
		return class298_sub35.anInt7394 * -774922497;
	}

	public int method255(int i) {
		Class298_Sub35 class298_sub35 = (Class298_Sub35) Class87.aClass437_793.get((long) i);
		if (class298_sub35 == null)
			return Class128.aClass148_6331.method252(i, (byte) 1);
		return class298_sub35.anInt7394 * -774922497;
	}

	public int method252(int i, byte i_0_) {
		try {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) Class87.aClass437_793.get((long) i);
			if (class298_sub35 == null)
				return Class128.aClass148_6331.method252(i, (byte) 21);
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.d(").append(')').toString());
		}
	}

	public int method251(int i) {
		Class298_Sub35 class298_sub35 = (Class298_Sub35) Class87.aClass437_793.get((long) i);
		if (class298_sub35 == null)
			return Class128.aClass148_6331.method252(i, (byte) 101);
		return class298_sub35.anInt7394 * -774922497;
	}

	public int method253(int i) {
		Class298_Sub35 class298_sub35 = (Class298_Sub35) Class87.aClass437_793.get((long) i);
		if (class298_sub35 == null)
			return Class128.aClass148_6331.method252(i, (byte) 98);
		return class298_sub35.anInt7394 * -774922497;
	}

	public int method250(int i, byte i_1_) {
		try {
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) Class87.aClass437_793.get(0x100000000L | (long) i));
			if (class298_sub35 == null)
				return Class128.aClass148_6331.method250(i, (byte) 36);
			return -774922497 * class298_sub35.anInt7394;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.u(").append(')').toString());
		}
	}

	public int method249(int i) {
		Class298_Sub35 class298_sub35 = ((Class298_Sub35) Class87.aClass437_793.get(0x100000000L | (long) i));
		if (class298_sub35 == null)
			return Class128.aClass148_6331.method250(i, (byte) 43);
		return -774922497 * class298_sub35.anInt7394;
	}

	static final void method1009(ClientScript2 class403, int i) {
		try {
			if (null != client.aString8804)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class227.method2114(client.aString8804, 864183945);
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.wy(").append(')').toString());
		}
	}

	public static void method1010(Class457 class457, Frame frame, int i) {
		try {
			class457.method5960();
			frame.setVisible(false);
			frame.dispose();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.b(").append(')').toString());
		}
	}

	public static void method1011(byte i) {
		try {
			Class478.aClass453_6002 = new Class453();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.a(").append(')').toString());
		}
	}

	public static void method1012(Class298_Sub50 class298_sub50, int i) {
		try {
			if (!Class435.method5804(client.anInt8752 * -1233866115, (byte) -26))
				class298_sub50.method3550(1342402184);
			else
				ClientScriptsExecutor.aClass374_Sub1_4125.method4620(class298_sub50, 2143317873);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.p(").append(')').toString());
		}
	}

	static final void method1013(int i, int i_2_, long l) {
		try {
			int i_3_ = (int) l >> 14 & 0x1f;
			int i_4_ = (int) l >> 20 & 0x3;
			int i_5_ = (int) (l >>> 32) & 0x7fffffff;
			Class424 class424 = ((Class424) Class422_Sub20.method5701(Class336_Sub6.method4108(114624527), i_3_, (byte) 2));
			Class336 class336;
			if (Class424.aClass424_6611 == class424 || Class424.aClass424_6604 == class424 || Class424.aClass424_6610 == class424) {
				ObjectDefinitions class432 = client.aClass283_8716.method2641(-1208362615).getObjectDefinitions(i_5_);
				int i_6_;
				int i_7_;
				if (0 == i_4_ || i_4_ == 2) {
					i_6_ = -1125834887 * class432.sizeX;
					i_7_ = -565161399 * class432.sizeY;
				} else {
					i_6_ = -565161399 * class432.sizeY;
					i_7_ = class432.sizeX * -1125834887;
				}
				if (i_4_ == 0) {
					/* empty */
				}
				class336 = Class336_Sub5.method4105(i, i_2_, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
			} else if (Class82_Sub9.method900(-1976050083 * class424.anInt6613, (byte) 28))
				class336 = Class336_Sub5.method4105(i, i_2_, 0, 0, class424, i_4_, 740164949);
			else
				class336 = Class194.method1867(i, i_2_, 0, 0, class424, i_4_, (byte) -22);
			Class82_Sub21.method938(i, i_2_, true, class336, -1680742639);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.jd(").append(')').toString());
		}
	}

	public static boolean method1014(int i) {
		try {
			do {
				boolean bool;
				try {
					if (IcmpService_Sub1.available())
						break;
					bool = false;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			} while (false);
			if (null != IcmpService_Sub1.anIcmpService_Sub1_8551)
				throw new IllegalStateException("");
			IcmpService_Sub1.anIcmpService_Sub1_8551 = new IcmpService_Sub1();
			Thread thread = new Thread(new Class393());
			thread.setDaemon(true);
			thread.start();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("du.k(").append(')').toString());
		}
	}
}
