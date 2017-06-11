/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class384 {
	static Class57 aClass57_4127;
	public static int anInt4128;

	Class384() throws Throwable {
		throw new Error();
	}

	static final void method4695(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -36);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class486.method6157(class105, class119, class403, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.fj(").append(')').toString());
		}
	}

	static final void method4696(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			int i_4_ = (((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]);
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_3_, 1528209569);
//			if (class483.aChar6042 != i_1_ || class483.aChar6037 != i_2_)
//				throw new RuntimeException(new StringBuilder().append(i_3_).append(" ").append(i_4_).toString());
			if (i_2_ == 115)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class483.method6122(i_4_, (byte) 60);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class483.method6125(i_4_, 2053522267);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.vz(").append(')').toString());
		}
	}

	static final void method4697(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 45);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.afi(").append(')').toString());
		}
	}

	static final void method4698(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub11_7558.method5612(i_5_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.aoj(").append(')').toString());
		}
	}

	static void method4699(String string, boolean bool, int i, int i_6_, String string_7_, boolean bool_8_, short i_9_) {
		try {
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_10_ = -1;
			String string_11_ = null;
			if (-1 != i) {
				Class497 class497 = Class92.aClass504_905.method6251(i, -871094304);
				if (null == class497 || class497.method6206(1883696427) != bool_8_)
					return;
				if (class497.method6206(1883696427))
					string_11_ = class497.aString6101;
				else
					i_10_ = -388931549 * class497.anInt6100;
			}
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < (Class298_Sub32_Sub14.aClass477_9400.itemDefinitionsLength * -888767613); i_13_++) {
				ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_13_);
				if (bool && !class468.aBoolean5734) {
					if (i_9_ == 8221) {
						/* empty */
					}
				} else if (-1 == class468.anInt5755 * -1673957995 && -1 == 465190555 * class468.anInt5719 && 2083650097 * class468.anInt5770 == -1) {
					if (0 != 935029595 * class468.anInt5765) {
						if (i_9_ == 8221)
							return;
					} else if (class468.aString5707.toLowerCase().indexOf(string) == -1) {
						if (i_9_ == 8221)
							throw new IllegalStateException();
					} else {
						if (i != -1) {
							if (bool_8_) {
								if (!string_7_.equals(class468.method6041(i, string_11_, (short) 24753))) {
									if (i_9_ == 8221)
										throw new IllegalStateException();
									continue;
								}
							} else if (i_6_ != class468.method6037(i, i_10_, -2091980999)) {
								if (i_9_ == 8221) {
									/* empty */
								}
								continue;
							}
						}
						if (i_12_ >= 250) {
							Class344.anInt3688 = -140296601;
							Class68.aShortArray678 = null;
							return;
						}
						if (i_12_ >= is.length) {
							short[] is_14_ = new short[2 * is.length];
							for (int i_15_ = 0; i_15_ < i_12_; i_15_++)
								is_14_[i_15_] = is[i_15_];
							is = is_14_;
						}
						is[i_12_++] = (short) i_13_;
					}
				}
			}
			Class68.aShortArray678 = is;
			Class242.anInt2709 = 0;
			Class344.anInt3688 = i_12_ * 140296601;
			String[] strings = new String[367592105 * Class344.anInt3688];
			for (int i_16_ = 0; i_16_ < 367592105 * Class344.anInt3688; i_16_++)
				strings[i_16_] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(is[i_16_]).aString5707);
			Class223.method2085(strings, Class68.aShortArray678, -1747372319);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.nh(").append(')').toString());
		}
	}

	static final void method4700(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class436.method5805(class105, class119, class403, -2016583860);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.ms(").append(')').toString());
		}
	}

	static final void method4701(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class315.method3837((byte) -27) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.ahe(").append(')').toString());
		}
	}

	static final void method4702(ClientScript2 class403, int i) {
		try {
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864(-598938437);
			if (class298_sub37_sub13 != null) {
				boolean bool = (class298_sub37_sub13.method3451((Class301.anInt3245 + 1196508279 * Class82_Sub14.anInt6875), 1882038855 * Class376.anInt4090 + Class301.anInt3238, Class388.anIntArray4156, -1054516511));
				if (bool) {
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = Class388.anIntArray4156[1];
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = Class388.anIntArray4156[2];
				} else {
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
				}
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.aeg(").append(')').toString());
		}
	}


	public static void method4703(int i, byte i_17_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(1, (long) i);
			class298_sub37_sub12.method3445(-1820151665);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("py.p(").append(')').toString());
		}
	}
}
