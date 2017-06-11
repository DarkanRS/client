/* Class365_Sub1_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPC extends Entity {
	int[] anIntArray10178;
	public int anInt10179 = -1312461425;
	public int anInt10180 = -2139727009;
	public Class498 aClass498_10181;
	public int anInt10182 = -230300471;
	public int anInt10183 = 55499771;
	public int anInt10184 = 312753929;
	int[] anIntArray10185;
	public String aString10186;
	public Class73 aClass73_10187;
	int anInt10188;
	public int anInt10189;
	public SomethingDefinitions aClass503_10190;
	int anInt10191;
	int anInt10192;
	int anInt10193;

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_0_, int i_1_, boolean bool) {
		throw new IllegalStateException();
	}

	void method4453(int i) {
		try {
			((NPC) this).anInt10188 = (32 + (int) (Math.random() * 4.0)) * -1382184985;
			((NPC) this).anInt10191 = (3 + (int) (Math.random() * 2.0)) * -1827850421;
			((NPC) this).anInt10192 = (16 + (int) (Math.random() * 3.0)) * -1891288283;
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(2100839354) == 1)
				((NPC) this).anInt10193 = (int) (Math.random() * 6.0) * 818502475;
			else
				((NPC) this).anInt10193 = (int) (Math.random() * 12.0) * 818502475;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gf(").append(')').toString());
		}
	}

	void method4373(GraphicsToolkit class_ra) {
		if (aClass503_10190 != null && (((NPC) this).aBoolean10128 || method4454(class_ra, 0, 498700808))) {
			Matrix3f class222 = class_ra.method5178();
			class222.method2070(method4347());
			class222.method2064(0.0F, -5.0F, 0.0F);
			method4445(class_ra, aClass387Array10082, class222, ((NPC) this).aBoolean10128, 1604637699);
			for (int i = 0; i < aClass387Array10082.length; i++)
				aClass387Array10082[i] = null;
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bc(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (aClass503_10190 == null || !method4454(class_ra, 526336, -1241441124))
				return null;
			Matrix3f class222 = method4347();
			Class235 class235 = method4337();
			Matrix3f class222_2_ = class_ra.method5178();
			int i_3_ = aClass386_10084.method4719((byte) 0);
			Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][(int) class235.aClass217_2599.aFloat2451 >> 9][(int) class235.aClass217_2599.aFloat2454 >> 9]);
			if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
				int i_4_ = ((((NPC) this).anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
				((NPC) this).anInt10122 = (int) ((float) (-661498661 * (((NPC) this).anInt10122)) - (float) i_4_ / 10.0F) * 1394444115;
			} else
				((NPC) this).anInt10122 = (int) ((float) (-661498661 * (((NPC) this).anInt10122)) - (float) ((((NPC) this).anInt10122) * -661498661) / 10.0F) * 1394444115;
			class222_2_.method2070(class222);
			class222_2_.method2064(0.0F, (float) (-20 - ((NPC) this).anInt10122 * -661498661), 0.0F);
			Class350 class350 = method4426(1744135386);
			SomethingDefinitions class503 = (aClass503_10190.anIntArray6188 != null ? aClass503_10190.method6240(Class128.aClass148_6331, 1631739764) : aClass503_10190);
			((NPC) this).aBoolean10129 = false;
			Class335 class335 = null;
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub18_7561.method5693(-1104068428) == 1 && class503.aBoolean6165 && class350.aBoolean3756) {
				Class438 class438 = ((aClass438_10078.method5819((byte) -29) && aClass438_10078.method5826(-65534)) ? aClass438_10078 : null);
				Class438 class438_5_ = ((aClass438_10077.method5819((byte) -63) && (!aBoolean10094 || class438 == null)) ? aClass438_10077 : null);
				Class387 class387 = (Class283.method2678(class_ra, i_3_, (((NPC) this).anInt10097 * -155466425), (-197572281 * ((NPC) this).anInt10073), (-104151209 * ((NPC) this).anInt10074), -2095128707 * aClass503_10190.anInt6187, aClass387Array10082[0], aClass503_10190.aShort6191 & 0xffff, aClass503_10190.aShort6153 & 0xffff, aClass503_10190.aByte6168 & 0xff, aClass503_10190.aByte6152 & 0xff, null != class438_5_ ? class438_5_ : class438, 1812843484));
				if (null != class387) {
					if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < aClass387Array10082.length + 1))
						method4362(aClass387Array10082.length + 1, 1538315389);
					class335 = Class73.method818(method4459(1869849139), 1879615126);
					((NPC) this).aBoolean10129 = true;
					class_ra.RA(false);
					class387.method4739(class222_2_, (aClass302_Sub1Array7726[aClass387Array10082.length]), 0);
					class_ra.RA(true);
				}
			}
			if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < aClass387Array10082.length)
				method4362(aClass387Array10082.length, -241324715);
			if (null == class335)
				class335 = Class73.method818(method4459(1869849139), 1797748717);
			method4445(class_ra, aClass387Array10082, class222_2_, false, 879327846);
			for (int i_6_ = 0; i_6_ < aClass387Array10082.length; i_6_++) {
				if (aClass387Array10082[i_6_] != null) {
					if (aClass503_10190.aBoolean6193)
						aClass387Array10082[i_6_].PA((((NPC) this).anInt10188 * 1611045847), 1427249763 * ((NPC) this).anInt10191, (((NPC) this).anInt10192 * 376465581), (((NPC) this).anInt10193 * 332650083));
					aClass387Array10082[i_6_].method4739(class222_2_, aClass302_Sub1Array7726[i_6_], 0);
				}
			}
			if (((NPC) this).aClass351_10067 != null) {
				Class69 class69 = ((NPC) this).aClass351_10067.method4229();
				class_ra.method5042(class69);
			}
			for (int i_7_ = 0; i_7_ < aClass387Array10082.length; i_7_++) {
				if (null != aClass387Array10082[i_7_])
					((NPC) this).aBoolean10129 |= aClass387Array10082[i_7_].i();
				aClass387Array10082[i_7_] = null;
			}
			anInt10066 = client.anInt8777 * -815465993;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bo(").append(')').toString());
		}
	}

	boolean method4454(GraphicsToolkit class_ra, int i, int i_8_) {
		try {
			int i_9_ = i;
			Class350 class350 = method4426(979705538);
			Class438 class438 = ((aClass438_10078.method5819((byte) -97) && !aClass438_10078.method5826(-65534)) ? aClass438_10078 : null);
			Class438 class438_10_ = ((aClass438_10077.method5819((byte) -121) && (!aBoolean10094 || null == class438)) ? aClass438_10077 : null);
			int i_11_ = 250567115 * class350.anInt3735;
			int i_12_ = 1110265995 * class350.anInt3736;
			if (0 != i_11_ || i_12_ != 0 || class350.anInt3748 * 1185872679 != 0 || -330229359 * class350.anInt3751 != 0)
				i |= 0x7;
			boolean bool = (0 != aByte10130 && 443738891 * client.anInt8884 >= anInt10105 * 1920148979 && client.anInt8884 * 443738891 < anInt10106 * 1953154657);
			if (bool)
				i |= 0x80000;
			int i_13_ = aClass386_10084.method4719((byte) 0);
			Class387 class387 = (aClass387Array10082[0] = aClass503_10190.method6236(class_ra, i, Class94.aClass349_913, Class128.aClass148_6331, class438, class438_10_, aClass438_Sub2_Sub1Array10112, anIntArray10085, i_13_, aClass498_10181, method4432(-1491129226), false, -679459424));
			if (null == class387)
				return false;
			((NPC) this).anInt10089 = class387.YA() * -49760597;
			class387.n();
			method4423(class387, 839093609);
			if (0 != i_11_ || i_12_ != 0) {
				method4425(i_13_, i_11_, i_12_, -947990311 * class350.anInt3734, 1869548445 * class350.anInt3740, 1232740545);
				if (0 != (((NPC) this).anInt10097 * -155466425))
					aClass387Array10082[0].t(((NPC) this).anInt10097 * -155466425);
				if ((((NPC) this).anInt10073 * -197572281) != 0)
					aClass387Array10082[0].EA(-197572281 * ((NPC) this).anInt10073);
				if ((((NPC) this).anInt10074 * -104151209) != 0)
					aClass387Array10082[0].ia(0, ((NPC) this).anInt10074 * -104151209, 0);
			} else
				method4425(i_13_, getSize() << 9, getSize() << 9, 0, 0, 1757570363);
			if (bool)
				class387.PA(aByte10117, aByte10108, aByte10109, aByte10130 & 0xff);
			method4424(class_ra, class350, i_9_, i_11_, i_12_, i_13_, 614564932);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gx(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			if (aClass503_10190 != null && (((NPC) this).aBoolean10128 || method4454(class_ra, 0, -1205291751))) {
				Matrix3f class222 = class_ra.method5178();
				class222.method2070(method4347());
				class222.method2064(0.0F, -5.0F, 0.0F);
				method4445(class_ra, aClass387Array10082, class222, ((NPC) this).aBoolean10128, 1317836884);
				for (int i_14_ = 0; i_14_ < aClass387Array10082.length; i_14_++)
					aClass387Array10082[i_14_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bb(").append(')').toString());
		}
	}

	public final void method4455(Class274 class274, int i, short i_15_) {
		try {
			int i_16_ = scenePositionXQueue[0];
			int i_17_ = scenePositionYQueue[0];
			switch (class274.anInt6533 * 495490839) {
			case 7:
				i_17_++;
				break;
			case 5:
				i_16_--;
				i_17_--;
				break;
			case 3:
				i_16_++;
				i_17_++;
				break;
			case 4:
				i_16_--;
				i_17_++;
				break;
			case 2:
				i_17_--;
				break;
			case 0:
				i_16_++;
				i_17_--;
				break;
			case 6:
				i_16_++;
				break;
			case 1:
				i_16_--;
				break;
			}
			if (aClass438_10078.method5819((byte) -128) && (aClass438_10078.method5820(1057375366).anInt4189 * -882531177) == 1) {
				anIntArray10093 = null;
				aClass438_10078.method5821(-1, -1581174742);
			}
			for (int i_18_ = 0; i_18_ < currentGraphics.length; i_18_++) {
				if (currentGraphics[i_18_].id * -967533709 != -1) {
					Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(-967533709 * currentGraphics[i_18_].id, -1708083255));
					if (class398.aBoolean5215 && class398.anInt5205 * 1505778629 != -1 && (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) -23).anInt4189) * -882531177 == 1) {
						currentGraphics[i_18_].aClass438_569.method5821(-1, -1871121711);
						currentGraphics[i_18_].id = -1313669563;
					}
				}
			}
			if (anInt10120 * 2050671733 < scenePositionXQueue.length - 1)
				anInt10120 += -1013322787;
			for (int i_19_ = 2050671733 * anInt10120; i_19_ > 0; i_19_--) {
				scenePositionXQueue[i_19_] = scenePositionXQueue[i_19_ - 1];
				scenePositionYQueue[i_19_] = scenePositionYQueue[i_19_ - 1];
				aByteArray10110[i_19_] = aByteArray10110[i_19_ - 1];
			}
			scenePositionXQueue[0] = i_16_;
			scenePositionYQueue[0] = i_17_;
			aByteArray10110[0] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gk(").append(')').toString());
		}
	}

	public void method4456(int i, int i_20_, int i_21_, boolean bool, int i_22_, byte i_23_) {
		try {
			plane = aByte7724 = (byte) i;
			if (client.aClass283_8716.method2654(1132456995).method2320(i_20_, i_21_, 1587070733))
				aByte7724++;
			if (aClass438_10078.method5819((byte) -33) && (aClass438_10078.method5820(1592092831).anInt4189 * -882531177) == 1) {
				anIntArray10093 = null;
				aClass438_10078.method5821(-1, -1899534119);
			}
			for (int i_24_ = 0; i_24_ < currentGraphics.length; i_24_++) {
				if (-1 != currentGraphics[i_24_].id * -967533709) {
					Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(-967533709 * currentGraphics[i_24_].id, -1738473272));
					if (class398.aBoolean5215 && -1 != 1505778629 * class398.anInt5205 && (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) 83).anInt4189) * -882531177 == 1) {
						currentGraphics[i_24_].aClass438_569.method5821(-1, -1950379754);
						currentGraphics[i_24_].id = -1313669563;
					}
				}
			}
			if (!bool) {
				int i_25_ = i_20_ - scenePositionXQueue[0];
				int i_26_ = i_21_ - scenePositionYQueue[0];
				if (i_25_ >= -8 && i_25_ <= 8 && i_26_ >= -8 && i_26_ <= 8) {
					if (2050671733 * anInt10120 < scenePositionXQueue.length - 1)
						anInt10120 += -1013322787;
					for (int i_27_ = anInt10120 * 2050671733; i_27_ > 0; i_27_--) {
						scenePositionXQueue[i_27_] = scenePositionXQueue[i_27_ - 1];
						scenePositionYQueue[i_27_] = scenePositionYQueue[i_27_ - 1];
						aByteArray10110[i_27_] = aByteArray10110[i_27_ - 1];
					}
					scenePositionXQueue[0] = i_20_;
					scenePositionYQueue[0] = i_21_;
					aByteArray10110[0] = Class282.aClass282_6540.aByte6542;
					return;
				}
			}
			anInt10120 = 0;
			anInt10125 = 0;
			anInt10124 = 0;
			scenePositionXQueue[0] = i_20_;
			scenePositionYQueue[0] = i_21_;
			Class217 class217 = Class217.method2005(method4337().aClass217_2599);
			class217.aFloat2451 = (float) ((i_22_ << 8) + (scenePositionXQueue[0] << 9));
			class217.aFloat2454 = (float) ((scenePositionYQueue[0] << 9) + (i_22_ << 8));
			method4340(class217);
			class217.method2006();
			if (((NPC) this).aClass351_10067 != null)
				((NPC) this).aClass351_10067.method4220();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gr(").append(')').toString());
		}
	}

	public final boolean method4457(int i) {
		try {
			if (null == aClass503_10190)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gy(").append(')').toString());
		}
	}

	int method4432(int i) {
		try {
			if (-1 != -1317338937 * anInt10184)
				return anInt10184 * -1317338937;
			if (null != aClass503_10190.anIntArray6188) {
				SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1794284929);
				if (class503 != null && 525312939 * class503.anInt6132 != -1)
					return 525312939 * class503.anInt6132;
			}
			return aClass503_10190.anInt6132 * 525312939;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.t(").append(')').toString());
		}
	}

	public int method4427(byte i) {
		try {
			if (null != aClass503_10190.anIntArray6188) {
				SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1605369279);
				if (class503 != null && -1 != 363729791 * class503.anInt6178)
					return 363729791 * class503.anInt6178;
			}
			return 363729791 * aClass503_10190.anInt6178;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.h(").append(')').toString());
		}
	}

	int method4458() {
		if (aClass503_10190 == null)
			return 0;
		return aClass503_10190.anInt6192 * -226722581;
	}

	boolean method4459(int i) {
		try {
			return aClass503_10190.aBoolean6163;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gu(").append(')').toString());
		}
	}

	int method4356(byte i) {
		try {
			if (aClass503_10190 == null)
				return 0;
			return aClass503_10190.anInt6192 * -226722581;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.dh(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_28_, byte i_29_) {
		try {
			if (aClass503_10190 == null || !method4454(class_ra, 131072, -1046532898))
				return false;
			Matrix3f class222 = method4347();
			boolean bool = false;
			for (int i_30_ = 0; i_30_ < aClass387Array10082.length; i_30_++) {
				if (null != aClass387Array10082[i_30_]) {
					boolean bool_31_;
					while_55_: do {
						do {
							if (-226722581 * aClass503_10190.anInt6192 <= 0) {
								if (286060383 * aClass503_10190.anInt6189 == -1) {
									if (1 != (aClass503_10190.anInt6187 * -2095128707))
										break;
									if (i_29_ != 1)
										throw new IllegalStateException();
								} else if (1 != (aClass503_10190.anInt6189 * 286060383))
									break;
							}
							bool_31_ = true;
							break while_55_;
						} while (false);
						bool_31_ = false;
					} while (false);
					boolean bool_32_ = bool_31_;
					boolean bool_33_ = (aClass387Array10082[i_30_].method4787(i, i_28_, class222, bool_32_, aClass503_10190.anInt6192 * -226722581));
					if (bool_33_) {
						bool = true;
						break;
					}
				}
			}
			for (int i_34_ = 0; i_34_ < aClass387Array10082.length; i_34_++)
				aClass387Array10082[i_34_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bu(").append(')').toString());
		}
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bq(").append(')').toString());
		}
	}

	public void method4460(int i, int i_35_, int i_36_, int i_37_) {
		try {
			((NPC) this).anIntArray10178[i] = i_35_;
			((NPC) this).anIntArray10185[i] = i_36_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gz(").append(')').toString());
		}
	}

	public boolean method4429(byte i) {
		try {
			return HashTable.aClass371_5520.aBoolean4041;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.by(").append(')').toString());
		}
	}

	public Class62 method4437(int i) {
		try {
			if (((NPC) this).aClass62_10118 != null && ((Class62) (((NPC) this).aClass62_10118)).aString608 == null)
				return null;
			return ((NPC) this).aClass62_10118;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bl(").append(')').toString());
		}
	}

	public void method4461(String string, int i, int i_38_, int i_39_) {
		try {
			int i_40_ = (Class82_Sub5.method883((byte) 6) * (HashTable.aClass371_5520.anInt4036 * -478874963));
			method4430(string, i, i_38_, i_40_, (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gd(").append(')').toString());
		}
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	public int method4435() {
		if (aClass503_10190.anIntArray6188 != null) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1815832117);
			if (null != class503 && class503.anInt6143 * -1575020259 != -1)
				return class503.anInt6143 * -1575020259;
		}
		return (-1575020259 * aClass503_10190.anInt6143 != -1 ? -1575020259 * aClass503_10190.anInt6143 : super.method4363((byte) -104));
	}

	public int method4436() {
		if (aClass503_10190.anIntArray6188 != null) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1928445532);
			if (null != class503 && class503.anInt6143 * -1575020259 != -1)
				return class503.anInt6143 * -1575020259;
		}
		return (-1575020259 * aClass503_10190.anInt6143 != -1 ? -1575020259 * aClass503_10190.anInt6143 : super.method4363((byte) -11));
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (aClass503_10190 == null || !method4454(class_ra, 526336, -1153791486))
			return null;
		Matrix3f class222 = method4347();
		Class235 class235 = method4337();
		Matrix3f class222_41_ = class_ra.method5178();
		int i = aClass386_10084.method4719((byte) 0);
		Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][(int) class235.aClass217_2599.aFloat2451 >> 9][(int) class235.aClass217_2599.aFloat2454 >> 9]);
		if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
			int i_42_ = ((((NPC) this).anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
			((NPC) this).anInt10122 = (int) ((float) (-661498661 * (((NPC) this).anInt10122)) - (float) i_42_ / 10.0F) * 1394444115;
		} else
			((NPC) this).anInt10122 = (int) ((float) (-661498661 * (((NPC) this).anInt10122)) - (float) ((((NPC) this).anInt10122) * -661498661) / 10.0F) * 1394444115;
		class222_41_.method2070(class222);
		class222_41_.method2064(0.0F, (float) (-20 - ((NPC) this).anInt10122 * -661498661), 0.0F);
		Class350 class350 = method4426(1676580874);
		SomethingDefinitions class503 = (aClass503_10190.anIntArray6188 != null ? aClass503_10190.method6240(Class128.aClass148_6331, 1779938932) : aClass503_10190);
		((NPC) this).aBoolean10129 = false;
		Class335 class335 = null;
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub18_7561.method5693(-1718454976) == 1 && class503.aBoolean6165 && class350.aBoolean3756) {
			Class438 class438 = ((aClass438_10078.method5819((byte) -38) && aClass438_10078.method5826(-65534)) ? aClass438_10078 : null);
			Class438 class438_43_ = ((aClass438_10077.method5819((byte) -86) && (!aBoolean10094 || class438 == null)) ? aClass438_10077 : null);
			Class387 class387 = (Class283.method2678(class_ra, i, (((NPC) this).anInt10097 * -155466425), (-197572281 * ((NPC) this).anInt10073), (-104151209 * ((NPC) this).anInt10074), -2095128707 * aClass503_10190.anInt6187, aClass387Array10082[0], aClass503_10190.aShort6191 & 0xffff, aClass503_10190.aShort6153 & 0xffff, aClass503_10190.aByte6168 & 0xff, aClass503_10190.aByte6152 & 0xff, null != class438_43_ ? class438_43_ : class438, 1812843484));
			if (null != class387) {
				if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < aClass387Array10082.length + 1))
					method4362(aClass387Array10082.length + 1, -565315916);
				class335 = Class73.method818(method4459(1869849139), 1346320693);
				((NPC) this).aBoolean10129 = true;
				class_ra.RA(false);
				class387.method4739(class222_41_, (aClass302_Sub1Array7726[aClass387Array10082.length]), 0);
				class_ra.RA(true);
			}
		}
		if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < aClass387Array10082.length)
			method4362(aClass387Array10082.length, -1743332566);
		if (null == class335)
			class335 = Class73.method818(method4459(1869849139), 1675644085);
		method4445(class_ra, aClass387Array10082, class222_41_, false, 969483486);
		for (int i_44_ = 0; i_44_ < aClass387Array10082.length; i_44_++) {
			if (aClass387Array10082[i_44_] != null) {
				if (aClass503_10190.aBoolean6193)
					aClass387Array10082[i_44_].PA((((NPC) this).anInt10188 * 1611045847), (1427249763 * ((NPC) this).anInt10191), (((NPC) this).anInt10192 * 376465581), (((NPC) this).anInt10193 * 332650083));
				aClass387Array10082[i_44_].method4739(class222_41_, (aClass302_Sub1Array7726[i_44_]), 0);
			}
		}
		if (((NPC) this).aClass351_10067 != null) {
			Class69 class69 = ((NPC) this).aClass351_10067.method4229();
			class_ra.method5042(class69);
		}
		for (int i_45_ = 0; i_45_ < aClass387Array10082.length; i_45_++) {
			if (null != aClass387Array10082[i_45_])
				((NPC) this).aBoolean10129 |= aClass387Array10082[i_45_].i();
			aClass387Array10082[i_45_] = null;
		}
		anInt10066 = client.anInt8777 * -815465993;
		return class335;
	}

	void method4371(GraphicsToolkit class_ra) {
		if (aClass503_10190 != null && (((NPC) this).aBoolean10128 || method4454(class_ra, 0, -1590633829))) {
			Matrix3f class222 = class_ra.method5178();
			class222.method2070(method4347());
			class222.method2064(0.0F, -5.0F, 0.0F);
			method4445(class_ra, aClass387Array10082, class222, ((NPC) this).aBoolean10128, -935143388);
			for (int i = 0; i < aClass387Array10082.length; i++)
				aClass387Array10082[i] = null;
		}
	}

	final boolean method4386() {
		return false;
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_46_) {
		if (aClass503_10190 == null || !method4454(class_ra, 131072, 1720809223))
			return false;
		Matrix3f class222 = method4347();
		boolean bool = false;
		for (int i_47_ = 0; i_47_ < aClass387Array10082.length; i_47_++) {
			if (null != aClass387Array10082[i_47_]) {
				boolean bool_48_;
				while_56_: do {
					do {
						if (-226722581 * aClass503_10190.anInt6192 <= 0) {
							if (286060383 * aClass503_10190.anInt6189 == -1) {
								if (1 != aClass503_10190.anInt6187 * -2095128707)
									break;
							} else if (1 != (aClass503_10190.anInt6189 * 286060383))
								break;
						}
						bool_48_ = true;
						break while_56_;
					} while (false);
					bool_48_ = false;
				} while (false);
				boolean bool_49_ = bool_48_;
				boolean bool_50_ = aClass387Array10082[i_47_].method4787(i, i_46_, class222, bool_49_, ((aClass503_10190.anInt6192) * -226722581));
				if (bool_50_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_51_ = 0; i_51_ < aClass387Array10082.length; i_51_++)
			aClass387Array10082[i_51_] = null;
		return bool;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_52_) {
		if (aClass503_10190 == null || !method4454(class_ra, 131072, -1030471484))
			return false;
		Matrix3f class222 = method4347();
		boolean bool = false;
		for (int i_53_ = 0; i_53_ < aClass387Array10082.length; i_53_++) {
			if (null != aClass387Array10082[i_53_]) {
				boolean bool_54_;
				while_57_: do {
					do {
						if (-226722581 * aClass503_10190.anInt6192 <= 0) {
							if (286060383 * aClass503_10190.anInt6189 == -1) {
								if (1 != aClass503_10190.anInt6187 * -2095128707)
									break;
							} else if (1 != (aClass503_10190.anInt6189 * 286060383))
								break;
						}
						bool_54_ = true;
						break while_57_;
					} while (false);
					bool_54_ = false;
				} while (false);
				boolean bool_55_ = bool_54_;
				boolean bool_56_ = aClass387Array10082[i_53_].method4787(i, i_52_, class222, bool_55_, ((aClass503_10190.anInt6192) * -226722581));
				if (bool_56_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_57_ = 0; i_57_ < aClass387Array10082.length; i_57_++)
			aClass387Array10082[i_57_] = null;
		return bool;
	}

	public int method4462(int i, int i_58_) {
		try {
			return ((NPC) this).anIntArray10178[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gh(").append(')').toString());
		}
	}

	int method4447() {
		if (-1 != -1317338937 * anInt10184)
			return anInt10184 * -1317338937;
		if (null != aClass503_10190.anIntArray6188) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1618298715);
			if (class503 != null && 525312939 * class503.anInt6132 != -1)
				return 525312939 * class503.anInt6132;
		}
		return aClass503_10190.anInt6132 * 525312939;
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	final void method4378() {
		throw new IllegalStateException();
	}

	int method4446() {
		if (-1 != -1317338937 * anInt10184)
			return anInt10184 * -1317338937;
		if (null != aClass503_10190.anIntArray6188) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1807692721);
			if (class503 != null && 525312939 * class503.anInt6132 != -1)
				return 525312939 * class503.anInt6132;
		}
		return aClass503_10190.anInt6132 * 525312939;
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bw(").append(')').toString());
		}
	}

	int method4438() {
		if (-1 != -1317338937 * anInt10184)
			return anInt10184 * -1317338937;
		if (null != aClass503_10190.anIntArray6188) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1685758496);
			if (class503 != null && 525312939 * class503.anInt6132 != -1)
				return 525312939 * class503.anInt6132;
		}
		return aClass503_10190.anInt6132 * 525312939;
	}

	int method4448() {
		if (-1 != -1317338937 * anInt10184)
			return anInt10184 * -1317338937;
		if (null != aClass503_10190.anIntArray6188) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1859138308);
			if (class503 != null && 525312939 * class503.anInt6132 != -1)
				return 525312939 * class503.anInt6132;
		}
		return aClass503_10190.anInt6132 * 525312939;
	}

	public int method4449() {
		if (null != aClass503_10190.anIntArray6188) {
			SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1923690826);
			if (class503 != null && -1 != 363729791 * class503.anInt6178)
				return 363729791 * class503.anInt6178;
		}
		return 363729791 * aClass503_10190.anInt6178;
	}

	public Class62 method4443() {
		if (((NPC) this).aClass62_10118 != null && ((Class62) (((NPC) this).aClass62_10118)).aString608 == null)
			return null;
		return ((NPC) this).aClass62_10118;
	}

	final boolean method4384() {
		return false;
	}

	final boolean method4400() {
		return false;
	}

	public NPC(Class331 class331, int i) {
		super(class331, i);
		aClass73_10187 = new Class73(32);
		((NPC) this).anIntArray10178 = new int[6];
		((NPC) this).anIntArray10185 = new int[6];
		method4453(684373346);
	}

	final boolean method4387() {
		return false;
	}

	public int method4363(byte i) {
		try {
			if (aClass503_10190.anIntArray6188 != null) {
				SomethingDefinitions class503 = aClass503_10190.method6240(Class128.aClass148_6331, 1652651645);
				if (null != class503 && class503.anInt6143 * -1575020259 != -1)
					return class503.anInt6143 * -1575020259;
			}
			return (-1575020259 * aClass503_10190.anInt6143 != -1 ? -1575020259 * aClass503_10190.anInt6143 : super.method4363((byte) 61));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bx(").append(')').toString());
		}
	}

	int method4463() {
		if (aClass503_10190 == null)
			return 0;
		return aClass503_10190.anInt6192 * -226722581;
	}

	public void method4464(SomethingDefinitions class503, int i) {
		try {
			if (class503 != aClass503_10190 && Class436.aBoolean5478 && Class518.method6313(anInt10064 * 1888274983, 351851633))
				Class194.method1868(2025307040);
			aClass503_10190 = class503;
			if (aClass503_10190 != null) {
				aString10186 = aClass503_10190.aString6127;
				anInt10189 = aClass503_10190.anInt6149 * 1520279523;
			}
			if (((NPC) this).aClass351_10067 != null)
				((NPC) this).aClass351_10067.method4220();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.gb(").append(')').toString());
		}
	}

	public boolean method4452() {
		return HashTable.aClass371_5520.aBoolean4041;
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_59_, int i_60_, boolean bool, int i_61_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.bk(").append(')').toString());
		}
	}

	int method4465() {
		if (aClass503_10190 == null)
			return 0;
		return aClass503_10190.anInt6192 * -226722581;
	}

	public NPC(Class331 class331) {
		super(class331);
		aClass73_10187 = new Class73(32);
		((NPC) this).anIntArray10178 = new int[6];
		((NPC) this).anIntArray10185 = new int[6];
		method4453(684373346);
	}

	public boolean method4440() {
		return HashTable.aClass371_5520.aBoolean4041;
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_62_, int i_63_, boolean bool) {
		throw new IllegalStateException();
	}

	public int method4466(int i, byte i_64_) {
		try {
			return ((NPC) this).anIntArray10185[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ake.ga(").append(')').toString());
		}
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_65_) {
		if (aClass503_10190 == null || !method4454(class_ra, 131072, 76578294))
			return false;
		Matrix3f class222 = method4347();
		boolean bool = false;
		for (int i_66_ = 0; i_66_ < aClass387Array10082.length; i_66_++) {
			if (null != aClass387Array10082[i_66_]) {
				boolean bool_67_;
				while_58_: do {
					do {
						if (-226722581 * aClass503_10190.anInt6192 <= 0) {
							if (286060383 * aClass503_10190.anInt6189 == -1) {
								if (1 != aClass503_10190.anInt6187 * -2095128707)
									break;
							} else if (1 != (aClass503_10190.anInt6189 * 286060383))
								break;
						}
						bool_67_ = true;
						break while_58_;
					} while (false);
					bool_67_ = false;
				} while (false);
				boolean bool_68_ = bool_67_;
				boolean bool_69_ = aClass387Array10082[i_66_].method4787(i, i_65_, class222, bool_68_, ((aClass503_10190.anInt6192) * -226722581));
				if (bool_69_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_70_ = 0; i_70_ < aClass387Array10082.length; i_70_++)
			aClass387Array10082[i_70_] = null;
		return bool;
	}
}
