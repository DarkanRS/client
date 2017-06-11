/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113 {
	int[] anIntArray1370;
	byte[] aByteArray1371;
	int[] anIntArray1372;
	public static IComponentDefinition aClass105_1373;

	public Class113(byte[] is) {
		int i = is.length;
		((Class113) this).anIntArray1370 = new int[i];
		((Class113) this).aByteArray1371 = is;
		int[] is_0_ = new int[33];
		((Class113) this).anIntArray1372 = new int[8];
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			int i_3_ = is[i_2_];
			if (0 != i_3_) {
				int i_4_ = 1 << 32 - i_3_;
				int i_5_ = is_0_[i_3_];
				((Class113) this).anIntArray1370[i_2_] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0)
					i_6_ = is_0_[i_3_ - 1];
				else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						int i_8_ = is_0_[i_7_];
						if (i_5_ != i_8_)
							break;
						int i_9_ = 1 << 32 - i_7_;
						if (0 != (i_8_ & i_9_)) {
							is_0_[i_7_] = is_0_[i_7_ - 1];
							break;
						}
						is_0_[i_7_] = i_8_ | i_9_;
					}
				}
				is_0_[i_3_] = i_6_;
				for (int i_10_ = 1 + i_3_; i_10_ <= 32; i_10_++) {
					if (is_0_[i_10_] == i_5_)
						is_0_[i_10_] = i_6_;
				}
				int i_11_ = 0;
				for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
					int i_13_ = -2147483648 >>> i_12_;
					if ((i_5_ & i_13_) != 0) {
						if (((Class113) this).anIntArray1372[i_11_] == 0)
							((Class113) this).anIntArray1372[i_11_] = i_1_;
						i_11_ = ((Class113) this).anIntArray1372[i_11_];
					} else
						i_11_++;
					if (i_11_ >= ((Class113) this).anIntArray1372.length) {
						int[] is_14_ = (new int[2 * ((Class113) this).anIntArray1372.length]);
						for (int i_15_ = 0; i_15_ < ((Class113) this).anIntArray1372.length; i_15_++)
							is_14_[i_15_] = ((Class113) this).anIntArray1372[i_15_];
						((Class113) this).anIntArray1372 = is_14_;
					}
					i_13_ >>>= 1;
				}
				((Class113) this).anIntArray1372[i_11_] = i_2_ ^ 0xffffffff;
				if (i_11_ >= i_1_)
					i_1_ = 1 + i_11_;
			}
		}
	}

	int method1245(byte[] is, int i, byte[] is_16_, int i_17_, int i_18_, int i_19_) {
		try {
			if (0 == i_18_)
				return 0;
			int i_20_ = 0;
			i_18_ += i_17_;
			int i_21_ = i;
			for (;;) {
				byte i_22_ = is[i_21_];
				if (i_22_ < 0)
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				int i_23_;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x40) != 0)
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if (0 != (i_22_ & 0x20))
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x10) != 0)
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x8) != 0)
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x4) != 0)
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if (0 != (i_22_ & 0x2))
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x1) != 0)
					i_20_ = ((Class113) this).anIntArray1372[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class113) this).anIntArray1372[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == 787727170)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				i_21_++;
			}
			return i_21_ + 1 - i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.f(").append(')').toString());
		}
	}

	int method1246(byte[] is, int i, int i_24_, byte[] is_25_, int i_26_, byte i_27_) {
		try {
			int i_28_ = 0;
			int i_29_ = i_26_ << 3;
			for (i_24_ += i; i < i_24_; i++) {
				int i_30_ = is[i] & 0xff;
				int i_31_ = ((Class113) this).anIntArray1370[i_30_];
				int i_32_ = ((Class113) this).aByteArray1371[i_30_];
				if (0 == i_32_)
					throw new RuntimeException(new StringBuilder().append("").append(i_30_).toString());
				int i_33_ = i_29_ >> 3;
				int i_34_ = i_29_ & 0x7;
				i_28_ &= -i_34_ >> 31;
				int i_35_ = i_33_ + (i_34_ + i_32_ - 1 >> 3);
				i_34_ += 24;
				is_25_[i_33_] = (byte) (i_28_ |= i_31_ >>> i_34_);
				if (i_33_ >= i_35_) {
					if (i_27_ >= 23)
						throw new IllegalStateException();
				} else {
					i_33_++;
					i_34_ -= 8;
					is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
					if (i_33_ >= i_35_) {
						if (i_27_ >= 23) {
							/* empty */
						}
					} else {
						i_33_++;
						i_34_ -= 8;
						is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
						if (i_33_ >= i_35_) {
							if (i_27_ >= 23) {
								/* empty */
							}
						} else {
							i_33_++;
							i_34_ -= 8;
							is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
							if (i_33_ >= i_35_) {
								if (i_27_ >= 23) {
									/* empty */
								}
							} else {
								i_33_++;
								i_34_ -= 8;
								is_25_[i_33_] = (byte) (i_28_ = i_31_ << -i_34_);
							}
						}
					}
				}
				i_29_ += i_32_;
			}
			return (i_29_ + 7 >> 3) - i_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.a(").append(')').toString());
		}
	}

	public static final void method1247(int i) {
		try {
			Class291.aClass309_6492.method3788(841920910);
			for (int i_36_ = 0; i_36_ < 32; i_36_++)
				Class291.aLongArray6486[i_36_] = 0L;
			for (int i_37_ = 0; i_37_ < 32; i_37_++)
				Class291.aLongArray6479[i_37_] = 0L;
			RuntimeException_Sub1.anInt6303 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.ax(").append(')').toString());
		}
	}

	static final void method1248(ClientScript2 class403, byte i) {
		try {
			int i_38_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_38_, (byte) -77);
			Class119 class119 = Class389.aClass119Array4165[i_38_ >> 16];
			Class298_Sub33.method3396(class105, class119, class403, -1171777109);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.eo(").append(')').toString());
		}
	}

	static final void method1249(ClientScript2 class403, int i) {
		try {
			int i_39_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_39_, (byte) -77);
			Class119 class119 = Class389.aClass119Array4165[i_39_ >> 16];
			Class356.method4270(class105, class119, class403, 268393846);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.ll(").append(')').toString());
		}
	}

	static final void method1250(ClientScript2 class403, int i) {
		try {
			int i_40_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_40_, (byte) -61);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1424956747 * class105.anInt1167;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.re(").append(')').toString());
		}
	}

	static final void method1251(ClientScript2 class403, int i) {
		try {
			int i_41_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (client.aString8804 != null && i_41_ < Class489.anInt6071 * -1801543887)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = Class82_Sub6.aClass7Array6846[i_41_].aByte97;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.wh(").append(')').toString());
		}
	}

	static final void method1252(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub20_7578.method5700(-1397951801);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.akj(").append(')').toString());
		}
	}

	static byte method1253(int i, int i_42_, int i_43_) {
		try {
			if (i != Class424.aClass424_6595.anInt6613 * -1976050083)
				return (byte) 0;
			if ((i_42_ & 0x1) == 0)
				return (byte) 1;
			return (byte) 2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.by(").append(')').toString());
		}
	}

	public static final Interface method1254(int parentHash, Interface class298_sub51, int[] is, boolean bool, int i_44_) {
		try {
			Interface class298_sub51_45_ = (Interface) client.aClass437_8841.get((long) parentHash);
			if (class298_sub51_45_ != null)
				Class173.method1821(class298_sub51_45_, (class298_sub51_45_.interfaceId * -1617025021 != (-1617025021 * class298_sub51.interfaceId)), bool, -113822480);
			client.aClass437_8841.method5817(class298_sub51, (long) parentHash);
			Class8.method321(-1617025021 * class298_sub51.interfaceId, is, 888891171);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(parentHash, (byte) 49);
			if (class105 != null)
				Tradution.method6054(class105, -702811353);
			if (null != client.aClass105_8652) {
				Tradution.method6054(client.aClass105_8652, 961005010);
				client.aClass105_8652 = null;
			}
			Class247.method2376(-662741241);
			if (null != class105)
				Class65.method761((Class389.aClass119Array4165[class105.anInt1142 * -440872681 >>> 16]), class105, !bool, 112223880);
			if (!bool)
				Class14.method341(-1617025021 * class298_sub51.interfaceId, is, -746339380);
			if (!bool && -257444687 * client.WINDOW_PANE_ID != -1)
				Class82_Sub10.method903(client.WINDOW_PANE_ID * -257444687, 1, -2018560763);
			return class298_sub51;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.ld(").append(')').toString());
		}
	}

	public static Class133[] method1255(int i) {
		try {
			return (new Class133[] { Class133.aClass133_1510, Class133.aClass133_1511, Class133.aClass133_1509 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ep.a(").append(')').toString());
		}
	}
}
