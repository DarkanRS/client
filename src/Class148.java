/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class148 implements Interface23 {
	HashTable aClass437_6647 = new HashTable(128);
	static long aLong6648 = 4611686018427387903L;
	static long aLong6649 = 4611686018427387904L;
	static int[] anIntArray6650 = new int[32];
	static long aLong6651 = 500L;
	int[] anIntArray6652 = new int[-1085917127 * Class440.aClass205_5582.anInt2339];
	static long aLong6653 = 1L;
	public int[] anIntArray6654 = new int[-1085917127 * Class440.aClass205_5582.anInt2339];

	public int method252(int i, byte i_0_) {
		try {
			return anIntArray6654[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.d(").append(')').toString());
		}
	}

	void setConfigByFileValue(int configId, int i_1_, int i_2_) {
		try {
			ConfigDefinitions class327 = Class472.aClass314_5965.getConfigDefinitions(configId, -781710328);
			int i_3_ = class327.anInt3469 * -50358139;
			int i_4_ = class327.anInt3468 * -1528472107;
			int i_5_ = 1394539663 * class327.anInt3470;
			int i_6_ = anIntArray6650[i_5_ - i_4_];
			if (i_1_ < 0 || i_1_ > i_6_)
				i_1_ = 0;
			i_6_ <<= i_4_;
			method1605(i_3_, (((Class148) this).anIntArray6652[i_3_] & (i_6_ ^ 0xffffffff) | i_1_ << i_4_ & i_6_), (byte) 16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.k(").append(')').toString());
		}
	}

	void method1603(int i) {
		try {
			for (int i_7_ = 0; i_7_ < Class440.aClass205_5582.anInt2339 * -1085917127; i_7_++) {
				((Class148) this).anIntArray6652[i_7_] = 0;
				anIntArray6654[i_7_] = 0;
			}
			((Class148) this).aClass437_6647 = new HashTable(128);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.f(").append(')').toString());
		}
	}

	public void method1604(int i, int i_8_, int i_9_) {
		try {
			anIntArray6654[i] = i_8_;
			Class298_Sub33 class298_sub33 = ((Class298_Sub33) ((Class148) this).aClass437_6647.get((long) i));
			if (null != class298_sub33)
				class298_sub33.aLong7385 = (Class122.method1319((byte) 1) + 500L) * 2132790236050020951L;
			else {
				class298_sub33 = new Class298_Sub33(Class122.method1319((byte) 1) + 500L);
				((Class148) this).aClass437_6647.method5817(class298_sub33, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.b(").append(')').toString());
		}
	}

	void method1605(int i, int i_10_, byte i_11_) {
		try {
			((Class148) this).anIntArray6652[i] = i_10_;
			Class298_Sub33 class298_sub33 = ((Class298_Sub33) ((Class148) this).aClass437_6647.get((long) i));
			if (null != class298_sub33) {
				if (4611686018427387905L != class298_sub33.aLong7385 * -959724544626478745L)
					class298_sub33.aLong7385 = (Class122.method1319((byte) 1) + 500L | 0x4000000000000000L) * 2132790236050020951L;
			} else {
				class298_sub33 = new Class298_Sub33(4611686018427387905L);
				((Class148) this).aClass437_6647.method5817(class298_sub33, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.p(").append(')').toString());
		}
	}

	public void method1606(int i, int i_12_, int i_13_) {
		try {
			ConfigDefinitions class327 = Class472.aClass314_5965.getConfigDefinitions(i, -781710328);
			int i_14_ = class327.anInt3469 * -50358139;
			int i_15_ = class327.anInt3468 * -1528472107;
			int i_16_ = 1394539663 * class327.anInt3470;
			int i_17_ = anIntArray6650[i_16_ - i_15_];
			if (i_12_ < 0 || i_12_ > i_17_)
				i_12_ = 0;
			i_17_ <<= i_15_;
			method1604(i_14_, (anIntArray6654[i_14_] & (i_17_ ^ 0xffffffff) | i_12_ << i_15_ & i_17_), 681479919);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.i(").append(')').toString());
		}
	}

	public int method250(int i, byte i_18_) {
		try {
			ConfigDefinitions class327 = Class472.aClass314_5965.getConfigDefinitions(i, -781710328);
			int i_19_ = class327.anInt3469 * -50358139;
			int i_20_ = -1528472107 * class327.anInt3468;
			int i_21_ = class327.anInt3470 * 1394539663;
			int i_22_ = anIntArray6650[i_21_ - i_20_];
			return anIntArray6654[i_19_] >> i_20_ & i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.u(").append(')').toString());
		}
	}

	static {
		int i = 2;
		for (int i_23_ = 0; i_23_ < 32; i_23_++) {
			anIntArray6650[i_23_] = i - 1;
			i += i;
		}
	}

	public int method251(int i) {
		return anIntArray6654[i];
	}

	public int method254(int i) {
		return anIntArray6654[i];
	}

	public int method255(int i) {
		return anIntArray6654[i];
	}

	public int method253(int i) {
		return anIntArray6654[i];
	}

	int method1607(boolean bool, int i) {
		try {
			long l = Class122.method1319((byte) 1);
			for (Class298_Sub33 class298_sub33 = (Class298_Sub33) (bool ? ((Class148) this).aClass437_6647.method5816(1646690306) : ((Class148) this).aClass437_6647.method5815((byte) 18)); class298_sub33 != null; class298_sub33 = (Class298_Sub33) ((Class148) this).aClass437_6647.method5815((byte) -66)) {
				if ((class298_sub33.aLong7385 * -959724544626478745L & 0x3fffffffffffffffL) < l) {
					if ((-959724544626478745L * class298_sub33.aLong7385 & 0x4000000000000000L) != 0L) {
						int i_24_ = (int) (7051297995265073167L * class298_sub33.linkedKey);
						anIntArray6654[i_24_] = ((Class148) this).anIntArray6652[i_24_];
						class298_sub33.unlink(-1460969981);
						return i_24_;
					}
					class298_sub33.unlink(-1460969981);
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.a(").append(')').toString());
		}
	}

	public int method249(int i) {
		ConfigDefinitions class327 = Class472.aClass314_5965.getConfigDefinitions(i, -781710328);
		int i_25_ = class327.anInt3469 * -50358139;
		int i_26_ = -1528472107 * class327.anInt3468;
		int i_27_ = class327.anInt3470 * 1394539663;
		int i_28_ = anIntArray6650[i_27_ - i_26_];
		return anIntArray6654[i_25_] >> i_26_ & i_28_;
	}

	static final void method1608(ClientScript2 class403, byte i) {
		try {
			int i_29_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_29_, (byte) -44);
			Class119 class119 = Class389.aClass119Array4165[i_29_ >> 16];
			Class372_Sub3.method4602(class105, class119, class403, 2065875065);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.hc(").append(')').toString());
		}
	}

	static final void method1609(ClientScript2 class403, byte i) {
		try {
			int i_30_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_30_, (byte) 31);
			Class119 class119 = Class389.aClass119Array4165[i_30_ >> 16];
			Class308_Sub1.method3786(class105, class119, class403, 805534141);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.ko(").append(')').toString());
		}
	}

	static final void method1610(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.anInt8665 * -1154804873;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.uy(").append(')').toString());
		}
	}

	static final void method1611(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aBoolean8680 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.ahy(").append(')').toString());
		}
	}

	public static void method1612(int i, int i_31_) {
		try {
			if (i < 0 || i > 2)
				i = 0;
			Class344.anInt3675 = i * 741965445;
			Class344.aClass351Array3679 = new Class351[1 + (Class65.anIntArray658[Class344.anInt3675 * 1197525581])];
			Class344.anInt3680 = 0;
			Class344.anInt3681 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.i(").append(')').toString());
		}
	}

	static final void method1613(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_32_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_33_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class298_Sub1.method2845(i_32_, i_33_, false, false, 1482071907);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.ul(").append(')').toString());
		}
	}

	public static void method1614(byte i) {
		try {
			if (null == Class231.aFrame2589) {
				int i_34_ = 1898544019 * client.anInt6473;
				int i_35_ = 540368727 * client.anInt6474;
				int i_36_ = (Class78.anInt733 * -639974669 - Class462.anInt5683 * -2110394505 - i_34_);
				int i_37_ = (1282634425 * client.anInt6472 - -1111710645 * Class298_Sub40_Sub9.anInt9716 - i_35_);
				if (i_34_ > 0 || i_36_ > 0 || i_35_ > 0 || i_37_ > 0) {
					try {
						Container container = Class318.method3874((byte) 92);
						int i_38_ = 0;
						int i_39_ = 0;
						if (container == Class298_Sub36.aFrame7403) {
							Insets insets = Class298_Sub36.aFrame7403.getInsets();
							i_38_ = insets.left;
							i_39_ = insets.top;
						}
						Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if (i_34_ > 0)
							graphics.fillRect(i_38_, i_39_, i_34_, client.anInt6472 * 1282634425);
						if (i_35_ > 0)
							graphics.fillRect(i_38_, i_39_, -639974669 * Class78.anInt733, i_35_);
						if (i_36_ > 0)
							graphics.fillRect((i_38_ + Class78.anInt733 * -639974669 - i_36_), i_39_, i_36_, client.anInt6472 * 1282634425);
						if (i_37_ > 0)
							graphics.fillRect(i_38_, (client.anInt6472 * 1282634425 + i_39_ - i_37_), -639974669 * Class78.anInt733, i_37_);
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.go(").append(')').toString());
		}
	}

	static final void method1615(ClientScript2 class403, byte i) {
		try {
			int i_40_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_40_, (byte) 62);
			Class119 class119 = Class389.aClass119Array4165[i_40_ >> 16];
			Class234.method2184(class105, class119, class403, (byte) 84);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.cc(").append(')').toString());
		}
	}

	static final void method1616(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.anInt1284 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * -1066050969;
			Tradution.method6054(class105, 2100669842);
			if (-1 == class105.anInt1154 * -1309843523 && !class119.aBoolean1403)
				Class509.method6286(class105.anInt1142 * -440872681, -1977969421);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("g.fc(").append(')').toString());
		}
	}
}
