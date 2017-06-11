/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class143 {
	Class243 aClass243_1555;
	Class243 aClass243_1556;
	Class140 aClass140_1557;
	static int anInt1558;

	public Interface6 method1572(Interface5 interface5, byte i) {
		try {
			if (interface5 == null)
				return null;
			Class146 class146 = interface5.method49(1551623871);
			if (class146 == Class146.aClass146_1569)
				return new Class141((Class145) interface5);
			if (Class146.aClass146_1568 == class146)
				return new Class129(method1573(597799285), (Class134) interface5);
			if (class146 == Class146.aClass146_1572)
				return new Class136(((Class143) this).aClass243_1556, (Class158) interface5);
			if (class146 == Class146.aClass146_1573)
				return new Class136_Sub1(((Class143) this).aClass243_1556, (Class158_Sub1) interface5);
			if (class146 == Class146.aClass146_1565)
				return new Class127_Sub3(((Class143) this).aClass243_1556, ((Class143) this).aClass243_1555, (Class128_Sub2) interface5);
			if (Class146.aClass146_1566 == class146)
				return new Class127_Sub2(((Class143) this).aClass243_1556, ((Class143) this).aClass243_1555, (Class128_Sub1) interface5);
			if (Class146.aClass146_1567 == class146)
				return new Class127_Sub1(((Class143) this).aClass243_1556, ((Class143) this).aClass243_1555, (Class128_Sub3) interface5);
			if (class146 == Class146.aClass146_1564)
				return new Class126(((Class143) this).aClass243_1556, ((Class143) this).aClass243_1555, (Class151) interface5);
			if (class146 == Class146.aClass146_1570)
				return new Class135(((Class143) this).aClass243_1556, (Class165) interface5);
			if (class146 == Class146.aClass146_1571)
				return new Class127_Sub1_Sub1(((Class143) this).aClass243_1556, ((Class143) this).aClass243_1555, (Class128_Sub3_Sub1) interface5);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.a(").append(')').toString());
		}
	}

	public Class143(Class243 class243, Class243 class243_0_) {
		((Class143) this).aClass243_1556 = class243;
		((Class143) this).aClass243_1555 = class243_0_;
	}

	Class140 method1573(int i) {
		try {
			if (null == ((Class143) this).aClass140_1557)
				((Class143) this).aClass140_1557 = new Class140();
			return ((Class143) this).aClass140_1557;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.f(").append(')').toString());
		}
	}

	static final void method1574(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) -78);
			Class119 class119 = Class389.aClass119Array4165[i_1_ >> 16];
			OutcommingPacket.method1890(class105, class119, class403, 2041063660);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.kj(").append(')').toString());
		}
	}

	static final void method1575(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass162_5252.anInt1661 * 2125429757;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.xs(").append(')').toString());
		}
	}

	static final void method1576(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class321.aClass429_3357.method242(694163818);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.up(").append(')').toString());
		}
	}

	static final boolean method1577(Class326[][][] class326s, int i, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			byte[][][] is = client.aClass283_8716.method2642(1330177323);
			byte i_5_ = (bool ? (byte) 1 : (byte) (-1953789277 * client.anInt8777 & 0xff));
			if (i_5_ == is[1855729883 * Class99.anInt952][i_2_][i_3_])
				return false;
			Class244 class244 = client.aClass283_8716.method2654(-334353018);
			if (((class244.aByteArrayArrayArray2731[Class99.anInt952 * 1855729883][i_2_][i_3_]) & 0x4) == 0)
				return false;
			int i_6_ = 0;
			int i_7_ = 0;
			client.anIntArray8735[i_6_] = i_2_;
			client.anIntArray8847[i_6_++] = i_3_;
			is[1855729883 * Class99.anInt952][i_2_][i_3_] = i_5_;
			while (i_7_ != i_6_) {
				int i_8_ = client.anIntArray8735[i_7_] & 0xffff;
				int i_9_ = client.anIntArray8735[i_7_] >> 16 & 0xff;
				int i_10_ = client.anIntArray8735[i_7_] >> 24 & 0xff;
				int i_11_ = client.anIntArray8847[i_7_] & 0xffff;
				int i_12_ = client.anIntArray8847[i_7_] >> 16 & 0xff;
				i_7_ = i_7_ + 1 & 0xfff;
				boolean bool_13_ = false;
				if (((class244.aByteArrayArrayArray2731[1855729883 * Class99.anInt952][i_8_][i_11_]) & 0x4) == 0)
					bool_13_ = true;
				boolean bool_14_ = false;
				if (null != class326s) {
					int i_15_ = Class99.anInt952 * 1855729883 + 1;
					while_63_: for (/**/; i_15_ <= 3; i_15_++) {
						if (null == class326s[i_15_]) {
							if (i_4_ != -777988087)
								throw new IllegalStateException();
						} else if (((class244.aByteArrayArrayArray2731[i_15_][i_8_][i_11_]) & 0x8) == 0) {
							if (bool_13_ && null != class326s[i_15_][i_8_][i_11_]) {
								if (null != (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457)) {
									int i_16_ = Class125.method1402(i_9_, -1319957905);
									if (i_16_ == (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457.aShort9814))
										continue;
									if (null != (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458) && i_16_ == (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458.aShort9814)) {
										if (i_4_ != -777988087)
											throw new IllegalStateException();
										continue;
									}
									if (i_10_ != 0) {
										int i_17_ = Class125.method1402(i_10_, -1159033021);
										if ((class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457.aShort9814) == i_17_)
											continue;
										if (null != (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458) && (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458.aShort9814) == i_17_) {
											if (i_4_ != -777988087) {
												/* empty */
											}
											continue;
										}
									}
									if (i_12_ != 0) {
										int i_18_ = Class125.method1402(i_12_, -1010197518);
										if (i_18_ == (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3457.aShort9814))
											continue;
										if ((class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458) != null && (class326s[i_15_][i_8_][i_11_].aClass365_Sub1_Sub5_3458.aShort9814) == i_18_) {
											if (i_4_ != -777988087)
												throw new IllegalStateException();
											continue;
										}
									}
								}
								Class326 class326 = class326s[i_15_][i_8_][i_11_];
								if (null != class326.aClass322_3456) {
									for (Class322 class322 = class326.aClass322_3456; null != class322; class322 = class322.aClass322_3360) {
										Class365_Sub1_Sub1 class365_sub1_sub1 = (class322.aClass365_Sub1_Sub1_3359);
										if (class365_sub1_sub1 instanceof Interface3) {
											Interface3 interface3 = ((Interface3) class365_sub1_sub1);
											int i_19_ = interface3.method29(726839210);
											int i_20_ = interface3.method30((short) 13168);
											if (21 == i_19_)
												i_19_ = 19;
											int i_21_ = i_19_ | i_20_ << 6;
											if (i_21_ == i_9_) {
												if (i_4_ != -777988087) {
													/* empty */
												}
												continue while_63_;
											}
											if (i_10_ != 0 && i_10_ == i_21_) {
												if (i_4_ != -777988087) {
													/* empty */
												}
												continue while_63_;
											}
											if (i_12_ != 0 && i_12_ == i_21_) {
												if (i_4_ != -777988087)
													throw new IllegalStateException();
												continue while_63_;
											}
										}
									}
								}
							}
							Class326 class326 = class326s[i_15_][i_8_][i_11_];
							if (null != class326 && class326.aClass322_3456 != null) {
								for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
									Class365_Sub1_Sub1 class365_sub1_sub1 = class322.aClass365_Sub1_Sub1_3359;
									if ((class365_sub1_sub1.aShort9796 != class365_sub1_sub1.aShort9798) || (class365_sub1_sub1.aShort9795 != (class365_sub1_sub1.aShort9797))) {
										for (int i_22_ = (class365_sub1_sub1.aShort9798); i_22_ <= (class365_sub1_sub1.aShort9796); i_22_++) {
											for (int i_23_ = (class365_sub1_sub1.aShort9795); i_23_ <= (class365_sub1_sub1.aShort9797); i_23_++)
												is[i_15_][i_22_][i_23_] = i_5_;
										}
									}
								}
							}
							is[i_15_][i_8_][i_11_] = i_5_;
							bool_14_ = true;
						}
					}
				}
				if (bool_14_) {
					int i_24_ = client.aClass283_8716.method2675(-1611682495).aClass_xaArray3517[1855729883 * Class99.anInt952 + 1].method6341(i_8_, i_11_, (byte) -36);
					if (client.anIntArray8793[i] < i_24_)
						client.anIntArray8793[i] = i_24_;
					int i_25_ = i_8_ << 9;
					int i_26_ = i_11_ << 9;
					if (client.anIntArray8670[i] > i_25_)
						client.anIntArray8670[i] = i_25_;
					else if (client.anIntArray8795[i] < i_25_)
						client.anIntArray8795[i] = i_25_;
					if (client.anIntArray8797[i] > i_26_)
						client.anIntArray8797[i] = i_26_;
					else if (client.anIntArray8641[i] < i_26_)
						client.anIntArray8641[i] = i_26_;
				}
				if (bool_13_) {
					if (i_4_ != -777988087) {
						/* empty */
					}
				} else {
					if (i_8_ >= 1 && i_5_ != (is[1855729883 * Class99.anInt952][i_8_ - 1][i_11_])) {
						client.anIntArray8735[i_6_] = i_8_ - 1 | 0x120000 | ~0x2cffffff;
						client.anIntArray8847[i_6_] = i_11_ | 0x130000;
						i_6_ = i_6_ + 1 & 0xfff;
						is[Class99.anInt952 * 1855729883][i_8_ - 1][i_11_] = i_5_;
					}
					if (++i_11_ < client.aClass283_8716.method2630(-1603394405)) {
						if (i_8_ - 1 >= 0 && i_5_ != (is[Class99.anInt952 * 1855729883][i_8_ - 1][i_11_]) && 0 == ((class244.aByteArrayArrayArray2731[1855729883 * Class99.anInt952][i_8_][i_11_]) & 0x4) && 0 == ((class244.aByteArrayArrayArray2731[Class99.anInt952 * 1855729883][i_8_ - 1][i_11_ - 1]) & 0x4)) {
							client.anIntArray8735[i_6_] = i_8_ - 1 | 0x120000 | 0x52000000;
							client.anIntArray8847[i_6_] = i_11_ | 0x130000;
							i_6_ = 1 + i_6_ & 0xfff;
							is[Class99.anInt952 * 1855729883][i_8_ - 1][i_11_] = i_5_;
						}
						if (is[1855729883 * Class99.anInt952][i_8_][i_11_] != i_5_) {
							client.anIntArray8735[i_6_] = i_8_ | 0x520000 | 0x13000000;
							client.anIntArray8847[i_6_] = i_11_ | 0x530000;
							i_6_ = i_6_ + 1 & 0xfff;
							is[1855729883 * Class99.anInt952][i_8_][i_11_] = i_5_;
						}
						if ((1 + i_8_ < client.aClass283_8716.method2629(-1968040539)) && i_5_ != (is[Class99.anInt952 * 1855729883][1 + i_8_][i_11_]) && ((class244.aByteArrayArrayArray2731[1855729883 * Class99.anInt952][i_8_][i_11_]) & 0x4) == 0 && ((class244.aByteArrayArrayArray2731[1855729883 * Class99.anInt952][1 + i_8_][i_11_ - 1]) & 0x4) == 0) {
							client.anIntArray8735[i_6_] = i_8_ + 1 | 0x520000 | ~0x6dffffff;
							client.anIntArray8847[i_6_] = i_11_ | 0x530000;
							i_6_ = 1 + i_6_ & 0xfff;
							is[1855729883 * Class99.anInt952][i_8_ + 1][i_11_] = i_5_;
						}
					}
					i_11_--;
					if ((1 + i_8_ < client.aClass283_8716.method2629(-1881854697)) && i_5_ != (is[1855729883 * Class99.anInt952][i_8_ + 1][i_11_])) {
						client.anIntArray8735[i_6_] = 1 + i_8_ | 0x920000 | 0x53000000;
						client.anIntArray8847[i_6_] = i_11_ | 0x930000;
						i_6_ = i_6_ + 1 & 0xfff;
						is[Class99.anInt952 * 1855729883][i_8_ + 1][i_11_] = i_5_;
					}
					if (--i_11_ >= 0) {
						if (i_8_ - 1 >= 0 && i_5_ != (is[1855729883 * Class99.anInt952][i_8_ - 1][i_11_]) && ((class244.aByteArrayArrayArray2731[1855729883 * Class99.anInt952][i_8_][i_11_]) & 0x4) == 0 && ((class244.aByteArrayArrayArray2731[1855729883 * Class99.anInt952][i_8_ - 1][1 + i_11_]) & 0x4) == 0) {
							client.anIntArray8735[i_6_] = i_8_ - 1 | 0xd20000 | 0x12000000;
							client.anIntArray8847[i_6_] = i_11_ | 0xd30000;
							i_6_ = i_6_ + 1 & 0xfff;
							is[1855729883 * Class99.anInt952][i_8_ - 1][i_11_] = i_5_;
						}
						if (i_5_ != (is[1855729883 * Class99.anInt952][i_8_][i_11_])) {
							client.anIntArray8735[i_6_] = i_8_ | 0xd20000 | ~0x6cffffff;
							client.anIntArray8847[i_6_] = i_11_ | 0xd30000;
							i_6_ = i_6_ + 1 & 0xfff;
							is[Class99.anInt952 * 1855729883][i_8_][i_11_] = i_5_;
						}
						if ((1 + i_8_ < client.aClass283_8716.method2629(-1909288528)) && (is[1855729883 * Class99.anInt952][i_8_ + 1][i_11_]) != i_5_ && ((class244.aByteArrayArrayArray2731[Class99.anInt952 * 1855729883][i_8_][i_11_]) & 0x4) == 0 && ((class244.aByteArrayArrayArray2731[Class99.anInt952 * 1855729883][i_8_ + 1][i_11_ + 1]) & 0x4) == 0) {
							client.anIntArray8735[i_6_] = 1 + i_8_ | 0x920000 | ~0x2dffffff;
							client.anIntArray8847[i_6_] = i_11_ | 0x930000;
							i_6_ = i_6_ + 1 & 0xfff;
							is[Class99.anInt952 * 1855729883][1 + i_8_][i_11_] = i_5_;
						}
					}
				}
			}
			if (-1000000 != client.anIntArray8793[i]) {
				client.anIntArray8793[i] += 40;
				client.anIntArray8670[i] -= 512;
				client.anIntArray8795[i] += 512;
				client.anIntArray8641[i] += 512;
				client.anIntArray8797[i] -= 512;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.iz(").append(')').toString());
		}
	}

	public static void method1578(byte i) {
		try {
			Class190.aClass348_1929.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fu.k(").append(')').toString());
		}
	}
}
