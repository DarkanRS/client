/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class438 {
	public static int anInt5521 = 2;
	public static int anInt5522 = 1;
	int anInt5523;
	Class391 aClass391_5524;
	int anInt5525;
	int anInt5526;
	int anInt5527;
	public static int anInt5528 = 0;
	int anInt5529;
	boolean aBoolean5530 = false;
	boolean aBoolean5531 = false;
	int anInt5532 = 0;
	boolean aBoolean5533 = false;
	Class441 aClass441_5534;
	Class441 aClass441_5535;

	public final boolean method5819(byte i) {
		try {
			return null != ((Class438) this).aClass391_5524;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.b(").append(')').toString());
		}
	}

	public final Class391 method5820(int i) {
		try {
			return ((Class438) this).aClass391_5524;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.p(").append(')').toString());
		}
	}

	public final void method5821(int i, int i_0_) {
		try {
			method5824(i, 0, 0, false, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.k(").append(')').toString());
		}
	}

	public final boolean method5822(int i, int i_1_) {
		try {
			if (null == ((Class438) this).aClass391_5524 || i == 0)
				return false;
			if (((Class438) this).anInt5526 * -1577984117 > 0) {
				if (-1577984117 * ((Class438) this).anInt5526 >= i) {
					((Class438) this).anInt5526 -= -2070327261 * i;
					return false;
				}
				i -= ((Class438) this).anInt5526 * -1577984117;
				((Class438) this).anInt5526 = 0;
				method5837(((Class438) this).aClass391_5524, -8792169 * ((Class438) this).anInt5523, (byte) 71);
			}
			i += ((Class438) this).anInt5525 * 458730501;
			boolean bool = (((Class438) this).aClass391_5524.aBoolean4176 | Class391.aBoolean4186);
			if (i > 100 && (((Class438) this).aClass391_5524.anInt4175 * -658922537 > 0)) {
				int i_2_;
				for (i_2_ = ((((Class438) this).aClass391_5524.anIntArray4172).length - (((Class438) this).aClass391_5524.anInt4175 * -658922537)); (((Class438) this).anInt5523 * -8792169 < i_2_ && i > (((Class438) this).aClass391_5524.anIntArray4169[((Class438) this).anInt5523 * -8792169])); ((Class438) this).anInt5523 += 282466343)
					i -= (((Class438) this).aClass391_5524.anIntArray4169[((Class438) this).anInt5523 * -8792169]);
				if (((Class438) this).anInt5523 * -8792169 >= i_2_) {
					int i_3_ = 0;
					for (int i_4_ = i_2_; i_4_ < (((Class438) this).aClass391_5524.anIntArray4172).length; i_4_++)
						i_3_ += (((Class438) this).aClass391_5524.anIntArray4169[i_4_]);
					if (0 == ((Class438) this).anInt5532 * -1542612693)
						((Class438) this).anInt5527 += 1129171511 * (i / i_3_);
					i %= i_3_;
				}
				((Class438) this).anInt5529 = -64061137 * ((Class438) this).anInt5523 + -1266936279;
				if (-112073191 * ((Class438) this).anInt5529 >= (((Class438) this).aClass391_5524.anIntArray4172).length) {
					if ((((Class438) this).aClass391_5524.anInt4175 * -658922537) == -1 && ((Class438) this).aBoolean5533)
						((Class438) this).anInt5529 = 0;
					else
						((Class438) this).anInt5529 -= (((Class438) this).aClass391_5524.anInt4175 * 838055791);
					if (((Class438) this).anInt5529 * -112073191 < 0 || (((Class438) this).anInt5529 * -112073191 >= (((Class438) this).aClass391_5524.anIntArray4172).length))
						((Class438) this).anInt5529 = 1266936279;
				}
				bool = true;
			}
			while (i > (((Class438) this).aClass391_5524.anIntArray4169[-8792169 * ((Class438) this).anInt5523])) {
				bool = true;
				i -= (((Class438) this).aClass391_5524.anIntArray4169[((((Class438) this).anInt5523 += 282466343) * -8792169 - 1)]);
				if (-8792169 * ((Class438) this).anInt5523 >= (((Class438) this).aClass391_5524.anIntArray4172).length) {
					if ((((Class438) this).aClass391_5524.anInt4175 * -658922537) != -1 && -1542612693 * ((Class438) this).anInt5532 != 2) {
						((Class438) this).anInt5523 -= (((Class438) this).aClass391_5524.anInt4175 * -782361151);
						if (-1542612693 * ((Class438) this).anInt5532 == 0)
							((Class438) this).anInt5527 += 1129171511;
					}
					if ((2063993735 * ((Class438) this).anInt5527 >= (((Class438) this).aClass391_5524.anInt4181 * -23055529)) || -8792169 * ((Class438) this).anInt5523 < 0 || (-8792169 * ((Class438) this).anInt5523 >= (((Class438) this).aClass391_5524.anIntArray4172).length)) {
						((Class438) this).aBoolean5530 = true;
						break;
					}
				}
				method5837(((Class438) this).aClass391_5524, -8792169 * ((Class438) this).anInt5523, (byte) 75);
				((Class438) this).anInt5529 = ((Class438) this).anInt5523 * -64061137 + -1266936279;
				if (-112073191 * ((Class438) this).anInt5529 >= (((Class438) this).aClass391_5524.anIntArray4172).length) {
					if (-1 == (((Class438) this).aClass391_5524.anInt4175 * -658922537) && ((Class438) this).aBoolean5533)
						((Class438) this).anInt5529 = 0;
					else
						((Class438) this).anInt5529 -= (838055791 * ((Class438) this).aClass391_5524.anInt4175);
					if (-112073191 * ((Class438) this).anInt5529 < 0 || (((Class438) this).anInt5529 * -112073191 >= (((Class438) this).aClass391_5524.anIntArray4172).length))
						((Class438) this).anInt5529 = 1266936279;
				}
			}
			((Class438) this).anInt5525 = -993902387 * i;
			if (bool)
				method5844(1397320731);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.j(").append(')').toString());
		}
	}

	public final int method5823(int i) {
		try {
			return (((Class438) this).aClass391_5524 != null ? -1945308871 * ((Class438) this).aClass391_5524.anInt4171 : -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.i(").append(')').toString());
		}
	}

	public final void method5824(int i, int i_5_, int i_6_, boolean bool, byte i_7_) {
		try {
			method5825(i, i_5_, i_6_, bool, false, -1437479972);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.r(").append(')').toString());
		}
	}

	final void method5825(int i, int i_8_, int i_9_, boolean bool, boolean bool_10_, int i_11_) {
		try {
			if (i != method5823(1947694560)) {
				if (-1 != i) {
					if (null != ((Class438) this).aClass391_5524 && i == (((Class438) this).aClass391_5524.anInt4171 * -1945308871)) {
						if (0 == -1117238071 * (((Class438) this).aClass391_5524.anInt4184))
							return;
					} else
						((Class438) this).aClass391_5524 = Class298_Sub2.aClass395_7165.method4903(i, (byte) 32);
					((Class438) this).anInt5527 = 0;
					((Class438) this).anInt5526 = i_8_ * -2070327261;
					((Class438) this).anInt5532 = -1775084157 * i_9_;
					((Class438) this).aBoolean5533 = bool_10_;
					if (bool) {
						((Class438) this).anInt5523 = ((int) (Math.random() * (double) (((Class438) this).aClass391_5524.anIntArray4172).length) * 282466343);
						((Class438) this).anInt5525 = ((int) (Math.random() * (double) (((Class438) this).aClass391_5524.anIntArray4169[(-8792169 * (((Class438) this).anInt5523))])) * -993902387);
					} else {
						((Class438) this).anInt5523 = 0;
						((Class438) this).anInt5525 = 0;
					}
					((Class438) this).anInt5529 = (-1266936279 + -64061137 * ((Class438) this).anInt5523);
					if (((Class438) this).anInt5529 * -112073191 < 0 || (((Class438) this).anInt5529 * -112073191 >= (((Class438) this).aClass391_5524.anIntArray4172).length))
						((Class438) this).anInt5529 = 1266936279;
					if (0 == -1577984117 * ((Class438) this).anInt5526)
						method5837(((Class438) this).aClass391_5524, -8792169 * ((Class438) this).anInt5523, (byte) 59);
					((Class438) this).aBoolean5530 = false;
				} else
					((Class438) this).aClass391_5524 = null;
				method5844(898280732);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.q(").append(')').toString());
		}
	}

	public final boolean method5826(int i) {
		try {
			return 0 != -1577984117 * ((Class438) this).anInt5526;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.n(").append(')').toString());
		}
	}

	public final int method5827(short i) {
		try {
			return -1577984117 * ((Class438) this).anInt5526;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.s(").append(')').toString());
		}
	}

	public final void method5828(int i, int i_12_) {
		try {
			((Class438) this).anInt5526 = i * -2070327261;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.z(").append(')').toString());
		}
	}

	public final int method5829(int i) {
		try {
			if (method5838((short) 225)) {
				int i_13_ = 0;
				if (method5838((short) 225)) {
					i_13_ |= (-1050600049 * (((Class441) ((Class438) this).aClass441_5534).anInt5588));
					if (((Class438) this).aBoolean5531 && null != (((Class438) this).aClass391_5524.anIntArray4174))
						i_13_ |= -1050600049 * (((Class441) (((Class438) this).aClass441_5535)).anInt5588);
				}
				return i_13_;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.y(").append(')').toString());
		}
	}

	public final void method5830(Class387 class387, int i, int i_14_, byte i_15_) {
		try {
			if (null != ((Class438) this).aClass391_5524.anIntArray4172 && method5838((short) 225)) {
				class387.method4765((((Class441) ((Class438) this).aClass441_5534).aClass298_Sub37_Sub4_5583), (((Class441) ((Class438) this).aClass441_5534).anInt5584 * 806878007), (((Class441) ((Class438) this).aClass441_5534).aClass298_Sub37_Sub4_5587), -643912397 * ((Class441) ((Class438) this).aClass441_5534).anInt5586, 458730501 * ((Class438) this).anInt5525, (((Class438) this).aClass391_5524.anIntArray4169[-8792169 * ((Class438) this).anInt5523]), i, i_14_,
						((Class438) this).aClass391_5524.aBoolean4185, null);
				if (((Class438) this).aBoolean5531 && ((Class438) this).aClass391_5524.anIntArray4174 != null && (((Class441) ((Class438) this).aClass441_5535).aBoolean5585))
					class387.method4765((((Class441) ((Class438) this).aClass441_5535).aClass298_Sub37_Sub4_5583), (((Class441) ((Class438) this).aClass441_5535).anInt5584) * 806878007, (((Class441) ((Class438) this).aClass441_5535).aClass298_Sub37_Sub4_5587), -643912397 * ((Class441) (((Class438) this).aClass441_5535)).anInt5586, 458730501 * ((Class438) this).anInt5525, (((Class438) this).aClass391_5524.anIntArray4169[-8792169 * ((Class438) this).anInt5523]), i, i_14_,
							((Class438) this).aClass391_5524.aBoolean4185, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.h(").append(')').toString());
		}
	}

	public final void method5831(Class387 class387, int i) {
		try {
			if (((Class438) this).aClass391_5524.anIntArray4172 != null && method5838((short) 225)) {
				class387.method4737((((Class441) ((Class438) this).aClass441_5534).aClass298_Sub37_Sub4_5583), (((Class441) (((Class438) this).aClass441_5534)).anInt5584 * 806878007));
				if (((Class438) this).aBoolean5531 && null != ((Class438) this).aClass391_5524.anIntArray4174 && (((Class441) ((Class438) this).aClass441_5535).aBoolean5585))
					class387.method4737((((Class441) ((Class438) this).aClass441_5535).aClass298_Sub37_Sub4_5583), (((Class441) ((Class438) this).aClass441_5535).anInt5584) * 806878007);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.v(").append(')').toString());
		}
	}

	public final boolean method5832(int i) {
		try {
			return ((Class438) this).aBoolean5530;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.e(").append(')').toString());
		}
	}

	public final void method5833(int i, int i_16_, int i_17_) {
		try {
			method5824(i, i_16_, 0, false, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.d(").append(')').toString());
		}
	}

	public final void method5834(int i) {
		try {
			method5835(0, (byte) 97);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.m(").append(')').toString());
		}
	}

	public final void method5835(int i, byte i_18_) {
		try {
			((Class438) this).anInt5523 = 0;
			((Class438) this).anInt5529 = -1266936279 * ((((Class438) this).aClass391_5524.anIntArray4172).length > 1 ? 1 : -1);
			((Class438) this).anInt5525 = 0;
			((Class438) this).aBoolean5530 = false;
			((Class438) this).anInt5526 = i * -2070327261;
			((Class438) this).anInt5527 = 0;
			if (null != ((Class438) this).aClass391_5524 & ((Class438) this).aClass391_5524.anIntArray4172 != null) {
				method5837(((Class438) this).aClass391_5524, -8792169 * ((Class438) this).anInt5523, (byte) -16);
				method5844(1713813277);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.w(").append(')').toString());
		}
	}

	public final boolean method5836(int i, int i_19_) {
		try {
			if (((Class438) this).aClass391_5524 == null | (i -= ((Class438) this).anInt5526 * -1577984117) <= 0)
				return false;
			return (((Class438) this).aClass391_5524.aBoolean4176 | (458730501 * ((Class438) this).anInt5525 + i > (((Class438) this).aClass391_5524.anIntArray4169[-8792169 * ((Class438) this).anInt5523])));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.o(").append(')').toString());
		}
	}

	void method5837(Class391 class391, int i, byte i_20_) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.l(").append(')').toString());
		}
	}

	final boolean method5838(short i) {
		try {
			if (null != ((Class438) this).aClass391_5524) {
				boolean bool = (((Class438) this).aClass441_5534.method5863(Class298_Sub2.aClass395_7165, ((Class438) this).aClass391_5524, ((Class438) this).anInt5523 * -8792169, -112073191 * ((Class438) this).anInt5529, ((Class438) this).aClass391_5524.anIntArray4172, (byte) 103));
				if (bool && ((Class438) this).aBoolean5531 && ((Class438) this).aClass391_5524.anIntArray4174 != null)
					((Class438) this).aClass441_5535.method5863(Class298_Sub2.aClass395_7165, ((Class438) this).aClass391_5524, ((Class438) this).anInt5523 * -8792169, ((Class438) this).anInt5529 * -112073191, ((Class438) this).aClass391_5524.anIntArray4174, (byte) 103);
				return bool;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.ax(").append(')').toString());
		}
	}

	public final void method5839(Class387 class387, int i, int i_21_) {
		try {
			if (((Class438) this).aClass391_5524 != null) {
				if (null != ((Class438) this).aClass391_5524.anIntArray4172 && method5838((short) 225)) {
					class387.method4735((((Class441) ((Class438) this).aClass441_5534).aClass298_Sub37_Sub4_5583), (((Class441) ((Class438) this).aClass441_5534).anInt5584) * 806878007, (((Class441) ((Class438) this).aClass441_5534).aClass298_Sub37_Sub4_5587), (((Class441) ((Class438) this).aClass441_5534).anInt5586) * -643912397, ((Class438) this).anInt5525 * 458730501, (((Class438) this).aClass391_5524.anIntArray4169[-8792169 * ((Class438) this).anInt5523]), i,
							((Class438) this).aClass391_5524.aBoolean4185);
					if (((Class438) this).aBoolean5531 && (null != ((Class438) this).aClass391_5524.anIntArray4174) && (((Class441) ((Class438) this).aClass441_5535).aBoolean5585))
						class387.method4735((((Class441) ((Class438) this).aClass441_5535).aClass298_Sub37_Sub4_5583), (((Class441) ((Class438) this).aClass441_5535).anInt5584) * 806878007, (((Class441) ((Class438) this).aClass441_5535).aClass298_Sub37_Sub4_5587), (-643912397 * (((Class441) ((Class438) this).aClass441_5535).anInt5586)), ((Class438) this).anInt5525 * 458730501, (((Class438) this).aClass391_5524.anIntArray4169[-8792169 * ((Class438) this).anInt5523]), i,
								((Class438) this).aClass391_5524.aBoolean4185);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.t(").append(')').toString());
		}
	}

	public final void method5840(Class438 class438_22_, int i) {
		try {
			((Class438) this).aClass391_5524 = ((Class438) class438_22_).aClass391_5524;
			((Class438) this).aBoolean5530 = ((Class438) class438_22_).aBoolean5530;
			((Class438) this).aBoolean5531 = ((Class438) class438_22_).aBoolean5531;
			((Class438) this).anInt5526 = 1 * ((Class438) class438_22_).anInt5526;
			((Class438) this).anInt5527 = ((Class438) class438_22_).anInt5527 * 1;
			((Class438) this).anInt5523 = ((Class438) class438_22_).anInt5523 * 1;
			((Class438) this).anInt5529 = ((Class438) class438_22_).anInt5529 * 1;
			((Class438) this).anInt5525 = 1 * ((Class438) class438_22_).anInt5525;
			method5844(853197244);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.f(").append(')').toString());
		}
	}

	public final void method5841(int i, boolean bool, boolean bool_23_, byte i_24_) {
		try {
			method5825(i, 0, 0, bool, bool_23_, -1437479972);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.x(").append(')').toString());
		}
	}

	public final void method5842(int i) {
		try {
			((Class438) this).anInt5527 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.c(").append(')').toString());
		}
	}

	public final void method5843(int i, boolean bool, int i_25_) {
		try {
			method5824(i, 0, 0, bool, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.u(").append(')').toString());
		}
	}

	final void method5844(int i) {
		try {
			((Class438) this).aClass441_5534.method5864(-2015637843);
			if (((Class438) this).aBoolean5531)
				((Class438) this).aClass441_5535.method5864(-2050586678);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.aa(").append(')').toString());
		}
	}

	Class438(boolean bool) {
		((Class438) this).aBoolean5531 = bool;
		((Class438) this).aClass441_5534 = new Class441();
		if (((Class438) this).aBoolean5531)
			((Class438) this).aClass441_5535 = new Class441();
		else
			((Class438) this).aClass441_5535 = null;
	}

	public static void method5845(Class119 class119, IComponentDefinition class105, int i) {
		try {
			IComponentDefinition class105_26_ = Class523.method6331(class119, class105, -499945373);
			int i_27_;
			int i_28_;
			if (null == class105_26_) {
				i_27_ = Class462.anInt5683 * -2110394505;
				i_28_ = Class298_Sub40_Sub9.anInt9716 * -1111710645;
			} else {
				i_27_ = -2093041337 * class105_26_.anInt1156;
				i_28_ = class105_26_.anInt1162 * 457937409;
			}
			Class82_Sub10.method904(class105, i_27_, i_28_, false, (byte) -73);
			Class292.method2816(class105, i_27_, i_28_, (byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.kz(").append(')').toString());
		}
	}

	public static void method5846(String string, boolean bool, int i, int i_29_, int i_30_) {
		try {
			Class384.method4699(string, bool, i, i_29_, null, false, (short) -5215);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sb.nl(").append(')').toString());
		}
	}
}
