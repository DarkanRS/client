/* Class365_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Entity extends Class365_Sub1_Sub1 {
	static int anInt10062 = 5;
	public int anInt10063;
	public int anInt10064;
	int sizePositioningOffset = -1934893373;
	public int anInt10066;
	Class351 aClass351_10067;
	public int anInt10068;
	public int anInt10069;
	public int anInt10070;
	public int anInt10071;
	static int anInt10072 = 20;
	int anInt10073;
	int anInt10074;
	public int anInt10075;
	public Graphics[] currentGraphics;
	public Class438 aClass438_10077;
	public Class438 aClass438_10078;
	public int[] anIntArray10079;
	public int[] anIntArray10080;
	public int[] anIntArray10081;
	public Class387[] aClass387Array10082;
	public int[] anIntArray10083;
	public Class386 aClass386_10084;
	public int[] anIntArray10085;
	public int anInt10086;
	public int anInt10087;
	public int anInt10088;
	int anInt10089 = -1532329984;
	public int anInt10090;
	public int[] scenePositionYQueue;
	public int[] anIntArray10092;
	public int[] anIntArray10093;
	public boolean aBoolean10094;
	public int anInt10095;
	public int anInt10096;
	int anInt10097;
	public int anInt10098;
	public int anInt10099;
	public int anInt10100;
	public int anInt10101;
	public int[] anIntArray10102;
	public int anInt10103;
	public int anInt10104;
	public int anInt10105;
	public int anInt10106;
	int anInt10107;
	public byte aByte10108;
	public byte aByte10109;
	public byte[] aByteArray10110;
	public Class386 aClass386_10111;
	public Class438_Sub2_Sub1[] aClass438_Sub2_Sub1Array10112;
	public Class386 aClass386_10113;
	public int anInt10114;
	public int anInt10115;
	public int anInt10116;
	public byte aByte10117;
	Class62 aClass62_10118;
	public boolean aBoolean10119;
	public int anInt10120;
	public int[] scenePositionXQueue;
	int anInt10122;
	public boolean aBoolean10123 = true;
	public int anInt10124;
	public int anInt10125;
	public int anInt10126;
	public int[] anIntArray10127;
	boolean aBoolean10128;
	boolean aBoolean10129;
	public byte aByte10130;
	public Class119 aClass119_10131;
	public int anInt10132;
	byte aByte10133;

	public void method4413(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (method4439(-1427124632))
				client.method2800(aClass119_10131, aClass119_10131.method1295((byte) 20), -1, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.cx(").append(')').toString());
		}
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.bf(").append(')').toString());
		}
	}

	public void method4414(int i, byte i_8_) {
		try {
			Class350 class350 = method4426(654212117);
			if (class350.anInt3744 * -2079528661 != 0 || 907865649 * anInt10115 != 0) {
				aClass386_10084.method4720((byte) 67);
				int i_9_ = i - 259411823 * aClass386_10084.anInt4144 & 0x3fff;
				if (i_9_ > 8192)
					anInt10068 = (aClass386_10084.anInt4144 * 259411823 - (16384 - i_9_)) * 1874549911;
				else
					anInt10068 = (aClass386_10084.anInt4144 * 259411823 + i_9_) * 1874549911;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.a(").append(')').toString());
		}
	}

	public void method4415(int i, boolean bool, int i_10_) {
		try {
			Class350 class350 = method4426(-124866780);
			if (bool || -2079528661 * class350.anInt3744 != 0 || 907865649 * anInt10115 != 0) {
				anInt10068 = (i & 0x3fff) * 1874549911;
				aClass386_10084.method4718(2145248039 * anInt10068, -1986657311);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.f(").append(')').toString());
		}
	}

	void method4416(byte i) {
		try {
			if (-1 != anInt10132 * 1097409519) {
				Class140.method1560(1097409519 * anInt10132, -1417106299);
				aClass119_10131 = null;
				anInt10132 = -441346831;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.cs(").append(')').toString());
		}
	}

	boolean method4382() {
		return ((Entity) this).aBoolean10129;
	}

	public boolean method4417(int i, int i_11_, byte i_12_) {
		try {
			if (anIntArray10085 == null) {
				if (-1 == i_11_)
					return true;
				anIntArray10085 = new int[(Class82_Sub18.aClass405_6892.anIntArray5267).length];
				for (int i_13_ = 0; (i_13_ < Class82_Sub18.aClass405_6892.anIntArray5267.length); i_13_++)
					anIntArray10085[i_13_] = -1;
			}
			Class350 class350 = method4426(-401641714);
			int i_14_ = 256;
			if (class350.anIntArray3742 != null && class350.anIntArray3742[i] > 0)
				i_14_ = class350.anIntArray3742[i];
			if (-1 == i_11_) {
				if (anIntArray10085[i] == -1)
					return true;
				int i_15_ = aClass386_10084.method4719((byte) 0);
				int i_16_ = anIntArray10085[i];
				int i_17_ = i_15_ - i_16_;
				if (i_17_ >= -i_14_ && i_17_ <= i_14_) {
					anIntArray10085[i] = -1;
					for (int i_18_ = 0; i_18_ < (Class82_Sub18.aClass405_6892.anIntArray5267).length; i_18_++) {
						if (anIntArray10085[i_18_] != -1)
							return true;
					}
					anIntArray10085 = null;
					return true;
				}
				if (i_17_ > 0 && i_17_ <= 8192 || i_17_ <= -8192)
					anIntArray10085[i] = i_16_ + i_14_ & 0x3fff;
				else
					anIntArray10085[i] = i_16_ - i_14_ & 0x3fff;
				return false;
			}
			if (-1 == anIntArray10085[i])
				anIntArray10085[i] = aClass386_10084.method4719((byte) 0);
			int i_19_ = anIntArray10085[i];
			int i_20_ = i_11_ - i_19_;
			if (i_20_ >= -i_14_ && i_20_ <= i_14_) {
				anIntArray10085[i] = i_11_;
				return true;
			}
			if (i_20_ > 0 && i_20_ <= 8192 || i_20_ <= -8192)
				anIntArray10085[i] = i_14_ + i_19_ & 0x3fff;
			else
				anIntArray10085[i] = i_19_ - i_14_ & 0x3fff;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.i(").append(')').toString());
		}
	}

	public final void sendGraphics(int graphicId, int positioning, int rotation, int i_23_, boolean bool, int graphicIndex, int i_25_) {
		try {
			Graphics graphics = currentGraphics[graphicIndex];
			int i_26_ = -967533709 * graphics.id;
			if (graphicId != -1 && i_26_ != -1) {
				if (i_26_ == graphicId) {
					Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicId, -1791372939);
					if (class398.aBoolean5215 && 1505778629 * class398.anInt5205 != -1) {
						Class391 class391 = (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) -43));
						int i_27_ = class391.anInt4184 * -1117238071;
						if (i_27_ == 0)
							return;
						if (2 == i_27_) {
							graphics.aClass438_569.method5842(1476401100);
							return;
						}
					}
				} else {
					Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicId, -1699460112);
					Class398 class398_28_ = Class158_Sub1.aClass389_8568.method4857(i_26_, -1865033182);
					if (1505778629 * class398.anInt5205 != -1 && 1505778629 * class398_28_.anInt5205 != -1) {
						Class391 class391 = (Class501.aClass395_6122.method4903(1505778629 * class398.anInt5205, (byte) 50));
						Class391 class391_29_ = (Class501.aClass395_6122.method4903(1505778629 * class398_28_.anInt5205, (byte) -13));
						if (-1445588039 * class391.anInt4178 < class391_29_.anInt4178 * -1445588039)
							return;
					}
				}
			}
			int i_30_ = 0;
			if (graphicId != -1 && !(Class158_Sub1.aClass389_8568.method4857(graphicId, -2139980686).aBoolean5215))
				i_30_ = 2;
			if (-1 != graphicId && bool)
				i_30_ = 1;
			graphics.id = 1313669563 * graphicId;
			graphics.anInt568 = 1533439965 * i_23_;
			graphics.height = 1755371497 * (positioning >> 16);
			graphics.anInt571 = rotation * 1949040559;
			graphics.aClass438_569.method5824((-1 != graphicId ? ((Class158_Sub1.aClass389_8568.method4857(graphicId, -2144045629).anInt5205) * 1505778629) : -1), positioning & 0xffff, i_30_, false, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.d(").append(')').toString());
		}
	}

	public final void method4419(int i) {
		try {
			anInt10120 = 0;
			anInt10125 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.u(").append(')').toString());
		}
	}

	public final void method4420(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, byte i_37_) {
		try {
			boolean bool = true;
			boolean bool_38_ = true;
			for (int i_39_ = 0; i_39_ < HashTable.aClass371_5520.anInt4032 * -942466371; i_39_++) {
				if (anIntArray10080[i_39_] > i_34_)
					bool = false;
				else
					bool_38_ = false;
			}
			int i_40_ = -1;
			int i_41_ = -1;
			int i_42_ = 0;
			if (i >= 0) {
				Class358 class358 = Class500.aClass347_6117.method4176(i, -1682094753);
				i_41_ = class358.anInt3863 * 100473069;
				i_42_ = -169339039 * class358.anInt3854;
			}
			if (bool_38_) {
				if (i_41_ == -1)
					return;
				i_40_ = 0;
				int i_43_ = 0;
				if (i_41_ == 0)
					i_43_ = anIntArray10080[0];
				else if (i_41_ == 1)
					i_43_ = anIntArray10079[0];
				for (int i_44_ = 1; i_44_ < -942466371 * HashTable.aClass371_5520.anInt4032; i_44_++) {
					if (i_41_ == 0) {
						if (anIntArray10080[i_44_] < i_43_) {
							i_40_ = i_44_;
							i_43_ = anIntArray10080[i_44_];
						}
					} else if (1 == i_41_ && anIntArray10079[i_44_] < i_43_) {
						i_40_ = i_44_;
						i_43_ = anIntArray10079[i_44_];
					}
				}
				if (i_41_ == 1 && i_43_ >= i_31_)
					return;
			} else {
				if (bool)
					((Entity) this).aByte10133 = (byte) 0;
				for (int i_45_ = 0; i_45_ < HashTable.aClass371_5520.anInt4032 * -942466371; i_45_++) {
					int i_46_ = ((Entity) this).aByte10133;
					((Entity) this).aByte10133 = (byte) ((((Entity) this).aByte10133 + 1) % (-942466371 * HashTable.aClass371_5520.anInt4032));
					if (anIntArray10080[i_46_] <= i_34_) {
						i_40_ = i_46_;
						break;
					}
				}
			}
			if (i_40_ >= 0) {
				anIntArray10102[i_40_] = i;
				anIntArray10079[i_40_] = i_31_;
				anIntArray10127[i_40_] = i_32_;
				anIntArray10083[i_40_] = i_33_;
				anIntArray10080[i_40_] = i_35_ + (i_34_ + i_42_);
				anIntArray10081[i_40_] = i_36_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.x(").append(')').toString());
		}
	}

	public int method4363(byte i) {
		try {
			Class350 class350 = method4426(219719478);
			int i_47_;
			if (1638157075 * class350.anInt3716 != -1)
				i_47_ = class350.anInt3716 * 1638157075;
			else if (-32768 == (((Entity) this).anInt10089 * 1507955715))
				i_47_ = 200;
			else
				i_47_ = -(1507955715 * ((Entity) this).anInt10089);
			Class235 class235 = method4337();
			int i_48_ = (int) class235.aClass217_2599.aFloat2451 >> 9;
			int i_49_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
			if (null != aClass331_7722 && i_48_ >= 1 && i_49_ >= 1 && i_48_ <= client.aClass283_8716.method2629(-2008930035) - 1 && i_49_ <= client.aClass283_8716.method2630(-33342416) - 1) {
				Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][i_48_][i_49_]);
				if (null != class326 && class326.aClass365_Sub1_Sub2_3461 != null)
					return (i_47_ + class326.aClass365_Sub1_Sub2_3461.aShort9801);
			}
			return i_47_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.bx(").append(')').toString());
		}
	}

	public void setSizeOffset(int i, int i_50_) {
		try {
			((Entity) this).sizePositioningOffset = -1934893373 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.r(").append(')').toString());
		}
	}

	public int getSize() {
		try {
			return 1173963243 * ((Entity) this).sizePositioningOffset;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.q(").append(')').toString());
		}
	}

	public void method4404(int i) {
		try {
			int i_51_ = (((Entity) this).sizePositioningOffset * 1173963243 - 1 << 8) + 240;
			Class217 class217 = method4337().aClass217_2599;
			aShort9798 = (short) ((int) class217.aFloat2451 - i_51_ >> 9);
			aShort9795 = (short) ((int) class217.aFloat2454 - i_51_ >> 9);
			aShort9796 = (short) ((int) class217.aFloat2451 + i_51_ >> 9);
			aShort9797 = (short) ((int) class217.aFloat2454 + i_51_ >> 9);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.ew(").append(')').toString());
		}
	}

	void method4423(Class387 class387, int i) {
		try {
			int i_52_ = aClass386_10113.anInt4144 * 259411823;
			int i_53_ = 259411823 * aClass386_10111.anInt4144;
			if (0 != i_52_ || i_53_ != 0) {
				int i_54_ = class387.YA() / 2;
				class387.ia(0, -i_54_, 0);
				class387.EA(i_52_ & 0x3fff);
				class387.t(i_53_ & 0x3fff);
				class387.ia(0, i_54_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.n(").append(')').toString());
		}
	}

	void method4424(GraphicsToolkit class_ra, Class350 class350, int i, int i_55_, int i_56_, int i_57_, int i_58_) {
		try {
			for (int i_59_ = 0; i_59_ < currentGraphics.length; i_59_++) {
				byte i_60_ = 0;
				if (0 == i_59_)
					i_60_ = (byte) 2;
				else if (1 == i_59_)
					i_60_ = (byte) 5;
				else if (i_59_ == 2)
					i_60_ = (byte) 1;
				else if (3 == i_59_)
					i_60_ = (byte) 7;
				Graphics class56 = currentGraphics[i_59_];
				if (-1 != class56.id * -967533709 && !class56.aClass438_569.method5826(-65534)) {
					Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(class56.id * -967533709, -2040253952));
					boolean bool = (class398.aByte5216 == 3 && (i_55_ != 0 || 0 != i_56_));
					int i_61_ = i;
					if (bool)
						i_61_ |= 0x7;
					else {
						if (0 != -885344433 * class56.anInt571)
							i_61_ |= 0x5;
						if (0 != 1615294553 * class56.height)
							i_61_ |= 0x2;
						if (class56.anInt568 * -1418960779 >= 0)
							i_61_ |= 0x7;
					}
					Class387 class387 = (aClass387Array10082[i_59_ + 1] = class398.method4917(class_ra, i_61_, class56.aClass438_569, i_60_, 2124203678));
					if (null != class387) {
						if (class56.anInt568 * -1418960779 >= 0 && null != class350.anIntArrayArray3710 && (class350.anIntArrayArray3710[-1418960779 * class56.anInt568]) != null) {
							int i_62_ = 0;
							int i_63_ = 0;
							int i_64_ = 0;
							if (null != class350.anIntArrayArray3710 && (null != (class350.anIntArrayArray3710[class56.anInt568 * -1418960779]))) {
								i_62_ += (class350.anIntArrayArray3710[-1418960779 * class56.anInt568][0]);
								i_63_ += (class350.anIntArrayArray3710[-1418960779 * class56.anInt568][1]);
								i_64_ += (class350.anIntArrayArray3710[class56.anInt568 * -1418960779][2]);
							}
							if (class350.anIntArrayArray3753 != null && (null != (class350.anIntArrayArray3753[class56.anInt568 * -1418960779]))) {
								i_62_ += (class350.anIntArrayArray3753[-1418960779 * class56.anInt568][0]);
								i_63_ += (class350.anIntArrayArray3753[class56.anInt568 * -1418960779][1]);
								i_64_ += (class350.anIntArrayArray3753[class56.anInt568 * -1418960779][2]);
							}
							if (0 != i_64_ || i_62_ != 0) {
								int i_65_ = i_57_;
								if (null != anIntArray10085 && anIntArray10085[(class56.anInt568 * -1418960779)] != -1)
									i_65_ = (anIntArray10085[-1418960779 * class56.anInt568]);
								int i_66_ = ((i_65_ + -709199872 * class56.anInt571 - i_57_) & 0x3fff);
								if (0 != i_66_)
									class387.f(i_66_);
								int i_67_ = Class220.anIntArray2483[i_66_];
								int i_68_ = Class220.anIntArray2474[i_66_];
								int i_69_ = i_68_ * i_62_ + i_64_ * i_67_ >> 14;
								i_64_ = i_68_ * i_64_ - i_67_ * i_62_ >> 14;
								i_62_ = i_69_;
							}
							class387.ia(i_62_, i_63_, i_64_);
						} else if (class56.anInt571 * -885344433 != 0)
							class387.f(-709199872 * class56.anInt571);
						if (class56.height * 1615294553 != 0)
							class387.ia(0, -(1615294553 * class56.height) << 2, 0);
						if (bool) {
							if (0 != -155466425 * ((Entity) this).anInt10097)
								class387.t((((Entity) this).anInt10097) * -155466425);
							if (0 != -197572281 * ((Entity) this).anInt10073)
								class387.EA((((Entity) this).anInt10073) * -197572281);
							if (0 != (((Entity) this).anInt10074 * -104151209))
								class387.ia(0, (-104151209 * ((Entity) this).anInt10074), 0);
						}
					}
				} else
					aClass387Array10082[1 + i_59_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.s(").append(')').toString());
		}
	}

	void method4425(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_) {
		try {
			Class217 class217 = method4337().aClass217_2599;
			int i_75_ = aShort9796 + aShort9798 >> 1;
			int i_76_ = aShort9795 + aShort9797 >> 1;
			int i_77_ = Class220.anIntArray2483[i];
			int i_78_ = Class220.anIntArray2474[i];
			int i_79_ = -i_70_ / 2;
			int i_80_ = -i_71_ / 2;
			int i_81_ = i_79_ * i_78_ + i_77_ * i_80_ >> 14;
			int i_82_ = i_78_ * i_80_ - i_77_ * i_79_ >> 14;
			int i_83_ = Class70.method807(i_81_ + (int) class217.aFloat2451, (int) class217.aFloat2454 + i_82_, i_75_, i_76_, plane, (byte) 13);
			int i_84_ = i_70_ / 2;
			int i_85_ = -i_71_ / 2;
			int i_86_ = i_84_ * i_78_ + i_77_ * i_85_ >> 14;
			int i_87_ = i_85_ * i_78_ - i_84_ * i_77_ >> 14;
			int i_88_ = Class70.method807(i_86_ + (int) class217.aFloat2451, (int) class217.aFloat2454 + i_87_, i_75_, i_76_, plane, (byte) -9);
			int i_89_ = -i_70_ / 2;
			int i_90_ = i_71_ / 2;
			int i_91_ = i_89_ * i_78_ + i_90_ * i_77_ >> 14;
			int i_92_ = i_78_ * i_90_ - i_77_ * i_89_ >> 14;
			int i_93_ = Class70.method807((int) class217.aFloat2451 + i_91_, i_92_ + (int) class217.aFloat2454, i_75_, i_76_, plane, (byte) 105);
			int i_94_ = i_70_ / 2;
			int i_95_ = i_71_ / 2;
			int i_96_ = i_78_ * i_94_ + i_77_ * i_95_ >> 14;
			int i_97_ = i_95_ * i_78_ - i_77_ * i_94_ >> 14;
			int i_98_ = Class70.method807(i_96_ + (int) class217.aFloat2451, i_97_ + (int) class217.aFloat2454, i_75_, i_76_, plane, (byte) 97);
			int i_99_ = i_83_ < i_88_ ? i_83_ : i_88_;
			int i_100_ = i_93_ < i_98_ ? i_93_ : i_98_;
			int i_101_ = i_88_ < i_98_ ? i_88_ : i_98_;
			int i_102_ = i_83_ < i_93_ ? i_83_ : i_93_;
			((Entity) this).anInt10097 = ((int) (Math.atan2((double) (i_99_ - i_100_), (double) i_71_) * 2607.5945876176133) & 0x3fff) * 1814320247;
			((Entity) this).anInt10073 = ((int) (Math.atan2((double) (i_102_ - i_101_), (double) i_70_) * 2607.5945876176133) & 0x3fff) * -1037987721;
			if (0 != ((Entity) this).anInt10097 * -155466425 && i_72_ != 0) {
				int i_103_ = 16384 - i_72_;
				if (((Entity) this).anInt10097 * -155466425 > 8192) {
					if ((-155466425 * ((Entity) this).anInt10097) < i_103_)
						((Entity) this).anInt10097 = 1814320247 * i_103_;
				} else if ((((Entity) this).anInt10097 * -155466425) > i_72_)
					((Entity) this).anInt10097 = i_72_ * 1814320247;
			}
			if (-197572281 * ((Entity) this).anInt10073 != 0 && i_73_ != 0) {
				int i_104_ = 16384 - i_73_;
				if (((Entity) this).anInt10073 * -197572281 > 8192) {
					if ((((Entity) this).anInt10073 * -197572281) < i_104_)
						((Entity) this).anInt10073 = i_104_ * -1037987721;
				} else if ((-197572281 * ((Entity) this).anInt10073) > i_73_)
					((Entity) this).anInt10073 = i_73_ * -1037987721;
			}
			((Entity) this).anInt10074 = (i_83_ + i_98_) * 1400968295;
			if (i_88_ + i_93_ < -104151209 * ((Entity) this).anInt10074)
				((Entity) this).anInt10074 = 1400968295 * (i_88_ + i_93_);
			((Entity) this).anInt10074 = (1400968295 * ((((Entity) this).anInt10074 * -104151209 >> 1) - (int) class217.aFloat2455));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.z(").append(')').toString());
		}
	}

	public Class350 method4426(int i) {
		try {
			int i_105_ = method4432(-40678538);
			if (-1 == i_105_)
				return Class349.aClass350_3708;
			return Class94.aClass349_913.method4202(i_105_, (byte) 11);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.y(").append(')').toString());
		}
	}

	public abstract int method4427(byte i);

	public void method4428(int i) {
		try {
			if (((Entity) this).aClass62_10118 != null && null != ((Class62) (((Entity) this).aClass62_10118)).aString608) {
				((Class62) ((Entity) this).aClass62_10118).anInt611 -= -1979671751;
				if (((Class62) (((Entity) this).aClass62_10118)).anInt611 * -1542462711 == 0)
					((Class62) ((Entity) this).aClass62_10118).aString608 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.v(").append(')').toString());
		}
	}

	public abstract boolean method4429(byte i);

	public void method4430(String string, int i, int i_106_, int i_107_, byte i_108_) {
		try {
			if (((Entity) this).aClass62_10118 == null)
				((Entity) this).aClass62_10118 = new Class62();
			((Class62) ((Entity) this).aClass62_10118).aString608 = string;
			((Class62) ((Entity) this).aClass62_10118).anInt607 = -883265885 * i;
			((Class62) ((Entity) this).aClass62_10118).anInt609 = -998781563 * i_106_;
			((Class62) ((Entity) this).aClass62_10118).anInt611 = (((Class62) ((Entity) this).aClass62_10118).anInt610 = i_107_ * -1166793105) * 1683680471;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.br(").append(')').toString());
		}
	}

	public void method4431(int i, int i_109_) {
		try {
			if (anInt10132 * 1097409519 != 1992528251 * ((Entity) this).anInt10107)
				method4416((byte) -65);
			((Entity) this).anInt10107 = i * 543663539;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.bz(").append(')').toString());
		}
	}

	abstract int method4432(int i);

	boolean method4433(int i, int i_110_) {
		try {
			if (1097409519 * anInt10132 == i)
				return true;
			aClass119_10131 = Class338.method4115(i, null, null, true, (byte) 3);
			if (aClass119_10131 == null)
				return false;
			anInt10132 = i * 441346831;
			Graphics.method611(aClass119_10131.aClass105Array1405, -1178956884);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.cd(").append(')').toString());
		}
	}

	public void method4434() {
		int i = ((((Entity) this).sizePositioningOffset * 1173963243 - 1 << 8) + 240);
		Class217 class217 = method4337().aClass217_2599;
		aShort9798 = (short) ((int) class217.aFloat2451 - i >> 9);
		aShort9795 = (short) ((int) class217.aFloat2454 - i >> 9);
		aShort9796 = (short) ((int) class217.aFloat2451 + i >> 9);
		aShort9797 = (short) ((int) class217.aFloat2454 + i >> 9);
	}

	public int method4361(int i) {
		try {
			if (-32768 == ((Entity) this).anInt10089 * 1507955715)
				return 0;
			return ((Entity) this).anInt10089 * 1507955715;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.bm(").append(')').toString());
		}
	}

	boolean method4353() {
		return false;
	}

	public int method4379() {
		if (-32768 == ((Entity) this).anInt10089 * 1507955715)
			return 0;
		return ((Entity) this).anInt10089 * 1507955715;
	}

	boolean method4374() {
		return false;
	}

	public int method4435() {
		Class350 class350 = method4426(1643711288);
		int i;
		if (1638157075 * class350.anInt3716 != -1)
			i = class350.anInt3716 * 1638157075;
		else if (-32768 == ((Entity) this).anInt10089 * 1507955715)
			i = 200;
		else
			i = -(1507955715 * ((Entity) this).anInt10089);
		Class235 class235 = method4337();
		int i_111_ = (int) class235.aClass217_2599.aFloat2451 >> 9;
		int i_112_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
		if (null != aClass331_7722 && i_111_ >= 1 && i_112_ >= 1 && i_111_ <= client.aClass283_8716.method2629(-2022187323) - 1 && i_112_ <= client.aClass283_8716.method2630(1908645218) - 1) {
			Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][i_111_][i_112_]);
			if (null != class326 && class326.aClass365_Sub1_Sub2_3461 != null)
				return i + class326.aClass365_Sub1_Sub2_3461.aShort9801;
		}
		return i;
	}

	public int method4436() {
		Class350 class350 = method4426(1920081667);
		int i;
		if (1638157075 * class350.anInt3716 != -1)
			i = class350.anInt3716 * 1638157075;
		else if (-32768 == ((Entity) this).anInt10089 * 1507955715)
			i = 200;
		else
			i = -(1507955715 * ((Entity) this).anInt10089);
		Class235 class235 = method4337();
		int i_113_ = (int) class235.aClass217_2599.aFloat2451 >> 9;
		int i_114_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
		if (null != aClass331_7722 && i_113_ >= 1 && i_114_ >= 1 && i_113_ <= client.aClass283_8716.method2629(-2141154955) - 1 && i_114_ <= client.aClass283_8716.method2630(145346949) - 1) {
			Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][i_113_][i_114_]);
			if (null != class326 && class326.aClass365_Sub1_Sub2_3461 != null)
				return i + class326.aClass365_Sub1_Sub2_3461.aShort9801;
		}
		return i;
	}

	public abstract Class62 method4437(int i);

	abstract int method4438();

	public int method4381() {
		if (-32768 == ((Entity) this).anInt10089 * 1507955715)
			return 0;
		return ((Entity) this).anInt10089 * 1507955715;
	}

	boolean method4439(int i) {
		try {
			if (((Entity) this).anInt10107 * 1992528251 == -1)
				return false;
			return method4433((1992528251 * ((Entity) this).anInt10107), -1999241902);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.cm(").append(')').toString());
		}
	}

	boolean method4369() {
		return ((Entity) this).aBoolean10129;
	}

	boolean method4365() {
		return false;
	}

	public abstract boolean method4440();

	public void method4441(int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, byte i_121_) {
		try {
			if (!method4439(-377564191)) {
				if (-1 != i)
					client.aBooleanArray8900[i] = true;
				else {
					for (int i_122_ = 0; i_122_ < 113; i_122_++)
						client.aBooleanArray8900[i_122_] = true;
				}
			} else
				Class422_Sub24.method5714(aClass119_10131.method1295((byte) -37), -1, i_115_, i_116_, i_117_, i_118_, i_119_, i_120_, i, false, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.cp(").append(')').toString());
		}
	}

	public void method4442(int i, int i_123_, boolean bool, int i_124_) {
		try {
			if (method4439(-551216163))
				Class372.method4591(aClass119_10131.aClass105Array1405, -1, i, i_123_, bool, (short) -1055);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.cq(").append(')').toString());
		}
	}

	public abstract Class62 method4443();

	boolean method4376(short i) {
		try {
			return ((Entity) this).aBoolean10129;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.be(").append(')').toString());
		}
	}

	public void method4444() {
		int i = ((((Entity) this).sizePositioningOffset * 1173963243 - 1 << 8) + 240);
		Class217 class217 = method4337().aClass217_2599;
		aShort9798 = (short) ((int) class217.aFloat2451 - i >> 9);
		aShort9795 = (short) ((int) class217.aFloat2454 - i >> 9);
		aShort9796 = (short) ((int) class217.aFloat2451 + i >> 9);
		aShort9797 = (short) ((int) class217.aFloat2454 + i >> 9);
	}

	Entity(Class331 class331, int i) {
		super(class331, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		anInt10069 = 0;
		anInt10070 = -2135118589;
		anInt10071 = 0;
		((Entity) this).anInt10122 = 0;
		((Entity) this).aByte10133 = (byte) 0;
		anIntArray10102 = new int[-942466371 * HashTable.aClass371_5520.anInt4032];
		anIntArray10079 = new int[-942466371 * HashTable.aClass371_5520.anInt4032];
		anIntArray10080 = new int[-942466371 * HashTable.aClass371_5520.anInt4032];
		anIntArray10081 = new int[HashTable.aClass371_5520.anInt4032 * -942466371];
		anIntArray10127 = new int[HashTable.aClass371_5520.anInt4032 * -942466371];
		anIntArray10083 = new int[HashTable.aClass371_5520.anInt4032 * -942466371];
		anInt10116 = 1208121000;
		anInt10086 = 875976968;
		aBoolean10119 = false;
		anInt10090 = -283914955;
		anIntArray10093 = null;
		aBoolean10094 = false;
		aClass438_10077 = new Class438_Sub2(this, false);
		aClass438_10078 = new Class438_Sub2(this, false);
		anInt10105 = -1828453179;
		anInt10106 = 473408095;
		aByte10130 = (byte) 0;
		anInt10075 = 0;
		anInt10114 = 0;
		anInt10115 = 1168822528;
		aClass386_10084 = new Class386();
		aClass386_10113 = new Class386();
		aClass386_10111 = new Class386();
		anInt10120 = 0;
		anInt10124 = 0;
		anInt10125 = 0;
		anInt10126 = 0;
		((Entity) this).aBoolean10128 = false;
		((Entity) this).aBoolean10129 = false;
		anInt10132 = -441346831;
		((Entity) this).anInt10107 = -543663539;
		scenePositionXQueue = new int[i];
		scenePositionYQueue = new int[i];
		aByteArray10110 = new byte[i];
		aClass387Array10082 = new Class387[5];
		currentGraphics = new Graphics[4];
		for (int i_125_ = 0; i_125_ < 4; i_125_++)
			currentGraphics[i_125_] = new Graphics(this);
		aClass438_Sub2_Sub1Array10112 = (new Class438_Sub2_Sub1[Class82_Sub18.aClass405_6892.anIntArray5267.length]);
	}

	void method4445(GraphicsToolkit class_ra, Class387[] class387s, Matrix3f class222, boolean bool, int i) {
		try {
			if (!bool) {
				int i_126_ = 0;
				int i_127_ = 0;
				int i_128_ = 0;
				int i_129_ = 0;
				int i_130_ = -1;
				int i_131_ = -1;
				Class85[][] class85s = new Class85[class387s.length][];
				Class68[][] class68s = new Class68[class387s.length][];
				for (int i_132_ = 0; i_132_ < class387s.length; i_132_++) {
					if (class387s[i_132_] != null) {
						class387s[i_132_].method4786(class222);
						class85s[i_132_] = class387s[i_132_].method4781();
						class68s[i_132_] = class387s[i_132_].method4728();
						if (null != class85s[i_132_]) {
							i_130_ = i_132_;
							i_127_++;
							i_126_ += class85s[i_132_].length;
						}
						if (class68s[i_132_] != null) {
							i_131_ = i_132_;
							i_129_++;
							i_128_ += class68s[i_132_].length;
						}
					}
				}
				if ((((Entity) this).aClass351_10067 == null || (((Entity) this).aClass351_10067.aBoolean3772)) && (i_127_ > 0 || i_129_ > 0))
					((Entity) this).aClass351_10067 = Class351.method4232(client.anInt8884 * 443738891, true);
				if (((Entity) this).aClass351_10067 != null) {
					Object object = null;
					Class85[] class85s_133_;
					if (i_127_ == 1)
						class85s_133_ = class85s[i_130_];
					else {
						class85s_133_ = new Class85[i_126_];
						int i_134_ = 0;
						for (int i_135_ = 0; i_135_ < class387s.length; i_135_++) {
							if (null != class85s[i_135_]) {
								System.arraycopy(class85s[i_135_], 0, class85s_133_, i_134_, class85s[i_135_].length);
								i_134_ += class85s[i_135_].length;
							}
						}
					}
					Object object_136_ = null;
					Class68[] class68s_137_;
					if (i_129_ == 1)
						class68s_137_ = class68s[i_131_];
					else {
						class68s_137_ = new Class68[i_128_];
						int i_138_ = 0;
						for (int i_139_ = 0; i_139_ < class387s.length; i_139_++) {
							if (class68s[i_139_] != null) {
								System.arraycopy(class68s[i_139_], 0, class68s_137_, i_138_, class68s[i_139_].length);
								i_138_ += class68s[i_139_].length;
							}
						}
					}
					((Entity) this).aClass351_10067.method4231(class_ra, (long) (443738891 * client.anInt8884), class85s_133_, class68s_137_, false);
					((Entity) this).aBoolean10128 = true;
				}
			} else if (((Entity) this).aClass351_10067 != null)
				((Entity) this).aClass351_10067.method4233((long) (client.anInt8884 * 443738891));
			if (null != ((Entity) this).aClass351_10067)
				((Entity) this).aClass351_10067.method4227(plane, aShort9798, aShort9796, aShort9795, aShort9797);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.k(").append(')').toString());
		}
	}

	abstract int method4446();

	abstract int method4447();

	abstract int method4448();

	public abstract int method4449();

	public int method4450(short i) {
		try {
			Class350 class350 = method4426(80856829);
			int i_140_ = 259411823 * aClass386_10084.anInt4144;
			boolean bool;
			if (class350.anInt3744 * -2079528661 != 0)
				bool = aClass386_10084.method4717(anInt10068 * 2145248039, (-2079528661 * class350.anInt3744), (class350.anInt3745 * -1460258951), (byte) -24);
			else
				bool = aClass386_10084.method4717(anInt10068 * 2145248039, 907865649 * anInt10115, anInt10115 * 907865649, (byte) -44);
			int i_141_ = 259411823 * aClass386_10084.anInt4144 - i_140_;
			if (0 != i_141_)
				anInt10114 += 1666755029;
			else {
				anInt10114 = 0;
				aClass386_10084.method4718(2145248039 * anInt10068, -43132362);
			}
			if (bool) {
				if (0 != class350.anInt3726 * 1496476593) {
					if (i_141_ > 0)
						aClass386_10113.method4717(class350.anInt3748 * 1185872679, class350.anInt3726 * 1496476593, 827802659 * class350.anInt3747, (byte) -96);
					else
						aClass386_10113.method4717(-(class350.anInt3748 * 1185872679), 1496476593 * class350.anInt3726, class350.anInt3747 * 827802659, (byte) -111);
				}
				if (class350.anInt3720 * 847512459 != 0)
					aClass386_10111.method4717(-330229359 * class350.anInt3751, 847512459 * class350.anInt3720, class350.anInt3750 * 1308368525, (byte) -37);
			} else {
				if (0 != 1496476593 * class350.anInt3726)
					aClass386_10113.method4717(0, class350.anInt3726 * 1496476593, 827802659 * class350.anInt3747, (byte) -2);
				else
					aClass386_10113.method4718(0, -1696263872);
				if (class350.anInt3720 * 847512459 != 0)
					aClass386_10111.method4717(0, 847512459 * class350.anInt3720, class350.anInt3750 * 1308368525, (byte) -85);
				else
					aClass386_10111.method4718(0, -146971224);
			}
			return i_141_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.b(").append(')').toString());
		}
	}

	Entity(Class331 class331) {
		this(class331, 10);
	}

	public void method4451(int[] is, int[] is_142_, int i) {
		try {
			if (null == anIntArray10092 && is != null)
				anIntArray10092 = new int[(Class82_Sub18.aClass405_6892.anIntArray5267).length];
			else if (null == is) {
				anIntArray10092 = null;
				return;
			}
			for (int i_143_ = 0; i_143_ < anIntArray10092.length; i_143_++)
				anIntArray10092[i_143_] = -1;
			for (int i_144_ = 0; i_144_ < is.length; i_144_++) {
				int i_145_ = is_142_[i_144_];
				int i_146_ = 0;
				while (i_146_ < anIntArray10092.length) {
					if ((i_145_ & 0x1) != 0)
						anIntArray10092[i_146_] = is[i_144_];
					i_146_++;
					i_145_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akn.p(").append(')').toString());
		}
	}

	boolean method4349() {
		return ((Entity) this).aBoolean10129;
	}

	boolean method4383() {
		return ((Entity) this).aBoolean10129;
	}

	boolean method4351() {
		return ((Entity) this).aBoolean10129;
	}

	public int method4380() {
		if (-32768 == ((Entity) this).anInt10089 * 1507955715)
			return 0;
		return ((Entity) this).anInt10089 * 1507955715;
	}

	public abstract boolean method4452();
}
