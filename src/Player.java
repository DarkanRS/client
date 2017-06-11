/* Class365_Sub1_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Entity {
	public int anInt10194;
	public String username;
	public boolean transformedNpc;
	String afterTitle;
	public boolean hidden;
	String beforeTitle;
	public String displayName;
	public int prayerIcon;
	public int skullId;
	public boolean aBoolean10203;
	public int anInt10204;
	public int anInt10205;
	public int anInt10206;
	public boolean aBoolean10207;
	public int anInt10208;
	public Class366 aClass366_10209;
	public int anInt10210;
	public int anInt10211;
	public int anInt10212;
	public int anInt10213;
	public int anInt10214;
	public int anInt10215;
	int anInt10216;
	public boolean aBoolean10217;
	public int anInt10218;
	public int anInt10219;
	public byte gender = 0;
	public int anInt10221;
	public boolean cprgbe;
	public byte cpr,cpg,cpb;
	public int ci, ca;
	public float ch;
	public boolean che;
	public al ccat;
	public boolean aBoolean10222;
	public Class70 aClass70_10223;

	public Player(Class331 class331, int i) {
		super(class331, i);
		skullId = -1944760989;
		prayerIcon = -218110545;
		anInt10206 = 0;
		anInt10213 = 0;
		anInt10204 = 1031683529;
		anInt10205 = 0;
		anInt10221 = 1530078181;
		aBoolean10207 = false;
		anInt10208 = 0;
		anInt10194 = -361000179;
		anInt10210 = -1839540625;
		anInt10211 = -1358158739;
		anInt10212 = 1578398049;
		transformedNpc = false;
		anInt10214 = 0;
		anInt10215 = -664381027;
		aBoolean10217 = false;
		aBoolean10203 = false;
		hidden = false;
		aBoolean10222 = false;
		cprgbe = false;
		cpr = 0;
		cpg = 0;
		cpb = 0;
		ci = 0;
		ca = 0;
		ch = 0;
		che = false;
		ccat = new al((byte)0, (byte)0, (byte)0);
		ccat.m = false;
		aClass70_10223 = new Class70(16);
	}

	public final void sendAppearence(RsByteBuffer stream, byte i) {
		try {
			stream.index = 0;
			int flag = stream.readUnsignedByte();
			gender = (byte) (flag & 0x1);
			boolean previousTransformedNpc = transformedNpc;
			transformedNpc = 0 != (flag & 0x2);
			boolean showingSkillLevel = (flag & 0x4) != 0;
			int size = super.getSize();
			setSizeOffset((flag >> 3 & 0x7) + 1, -2030022890);
			boolean titleBefore = 0 != (flag & 0x40);
			boolean titleAfter = 0 != (flag & 0x80);
			Class217 class217 = Class217.method2005(method4337().aClass217_2599);
			class217.aFloat2451 += (float) (getSize() - size << 8);
			class217.aFloat2454 += (float) (getSize() - size << 8);
			method4340(class217);
			class217.method2006();
			if (titleBefore)
				((Player) this).beforeTitle = stream.readJagString(681479919);
			else
				((Player) this).beforeTitle = null;
			if (titleAfter)
				((Player) this).afterTitle = stream.readJagString(681479919);
			else
				((Player) this).afterTitle = null;
			skullId = stream.readByte(-12558881) * 1944760989;
			prayerIcon = stream.readByte(-12558881) * 218110545;
			hidden = stream.readByte(-12558881) == 1;
			if (Class242.aClass401_2708 == Class401.aClass401_6557 && 1806357379 * client.playerRights >= 2)
				hidden = false;
			int i_5_ = -1;
			anInt10208 = 0;
			int[] is = new int[Class82_Sub18.aClass405_6892.anIntArray5267.length];
			ItemEffects[] itemEffects = (new ItemEffects[Class82_Sub18.aClass405_6892.anIntArray5267.length]);
			ItemDefinitions[] itemDefinitions = (new ItemDefinitions[Class82_Sub18.aClass405_6892.anIntArray5267.length]);
			for (int i_6_ = 0; i_6_ < Class82_Sub18.aClass405_6892.anIntArray5267.length; i_6_++) {
				if (1 != Class82_Sub18.aClass405_6892.anIntArray5267[i_6_]) {
					int i_7_ = stream.readUnsignedByte();
					if (0 == i_7_)
						is[i_6_] = 0;
					else {
						int i_8_ = stream.readUnsignedByte();
						int i_9_ = (i_7_ << 8) + i_8_;
						if (i_6_ == 0 && 65535 == i_9_) {
							i_5_ = stream.readBigSmart(1235052657);
							anInt10208 = (stream.readUnsignedByte() * 1076333291);
							break;
						}
						if (i_9_ >= 32768) {
							i_9_ = Class519.anIntArray6274[i_9_ - 32768];
							is[i_6_] = i_9_ | 0x40000000;
							itemDefinitions[i_6_] = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_9_);
							int i_10_ = itemDefinitions[i_6_].anInt5700 * 1832088845;
							if (0 != i_10_)
								anInt10208 = 1076333291 * i_10_;
						} else
							is[i_6_] = i_9_ - 256 | ~0x7fffffff;
					}
				}
			}
			if (-1 == i_5_) {
				int i_11_ = stream.readUnsignedShort();
				int i_12_ = 0;
				for (int i_13_ = 0; (i_13_ < Class82_Sub18.aClass405_6892.anIntArray5267.length); i_13_++) {
					if (0 != (Class82_Sub18.aClass405_6892.anIntArray5267[i_13_])) {
						if (i != 3)
							return;
					} else {
						if ((i_11_ & 1 << i_12_) != 0)
							itemEffects[i_13_] = Class401.readItemEffects(itemDefinitions[i_13_], stream, (byte) 15);
						i_12_++;
					}
				}
			}
			int[] is_14_ = new int[10];
			for (int i_15_ = 0; i_15_ < 10; i_15_++) {
				int i_16_ = stream.readUnsignedByte();
				if (Class22.aShortArrayArrayArray278.length < 1 || i_16_ < 0 || (i_16_ >= Class22.aShortArrayArrayArray278[i_15_][0].length))
					i_16_ = 0;
				is_14_[i_15_] = i_16_;
			}
			((Player) this).anInt10216 = stream.readUnsignedShort() * 148972467;
			displayName = stream.readString(-594796753);
			username = displayName;
			if (this == Class287.myPlayer)
				RuntimeException_Sub2.aString6305 = displayName;
			anInt10206 = stream.readUnsignedByte() * 1202458455;
			if (showingSkillLevel) {
				anInt10205 = stream.readUnsignedShort() * -1214139113;
				if (65535 == 242930343 * anInt10205)
					anInt10205 = 1214139113;
				anInt10213 = anInt10206 * -1911826885;
				anInt10204 = 1031683529;
			} else {
				anInt10205 = 0;
				anInt10213 = stream.readUnsignedByte() * 1144472333;
				anInt10204 = stream.readUnsignedByte() * -1031683529;
				if (255 == anInt10204 * 1792775047)
					anInt10204 = 1031683529;
			}
			int i_17_ = anInt10214 * 780357347;
			anInt10214 = stream.readUnsignedByte() * -1973000501;
			if (0 != 780357347 * anInt10214) {
				int i_18_ = anInt10194 * 1728220219;
				int i_19_ = anInt10210 * -1304250511;
				int i_20_ = anInt10211 * 1899133595;
				int i_21_ = -978842273 * anInt10212;
				int i_22_ = 933675083 * anInt10215;
				anInt10194 = stream.readUnsignedShort() * 361000179;
				anInt10210 = stream.readUnsignedShort() * 1839540625;
				anInt10211 = stream.readUnsignedShort() * 1358158739;
				anInt10212 = stream.readUnsignedShort() * -1578398049;
				anInt10215 = stream.readUnsignedByte() * -895284893;
				if (transformedNpc != previousTransformedNpc || anInt10214 * 780357347 != i_17_ || 1728220219 * anInt10194 != i_18_ || -1304250511 * anInt10210 != i_19_ || i_20_ != anInt10211 * 1899133595 || i_21_ != -978842273 * anInt10212 || anInt10215 * 933675083 != i_22_)
					Class451.method5934(this, (byte) 8);
			} else
				Class_v.method3670(this, (byte) -41);
			cprgbe = stream.readUnsignedByte() == 1;
			if(cprgbe) {
				if(ccat == null)
					ccat = new al((byte)0,(byte)0,(byte)0);
				ccat.cr = (byte) stream.readUnsignedByte();
				ccat.cg = (byte) stream.readUnsignedByte();
				ccat.cb = (byte) stream.readUnsignedByte();
				ci = stream.readUnsignedByte();
				ca = stream.readUnsignedByte();
				if(ccat.cr == -69 && ccat.cg == -69 && ccat.cb == -69)
					ccat.m = true;
				else
					ccat.m = false;
			}
			if (null == aClass366_10209)
				aClass366_10209 = new Class366();
			int i_23_ = 164936249 * aClass366_10209.anInt3974;
			int[] is_24_ = aClass366_10209.anIntArray3973;
			aClass366_10209.method4546(method4432(-1515602233), is, itemEffects, is_14_, 1 == gender, i_5_, 775068819);
			if (i_23_ != i_5_) {
				class217 = Class217.method2005(method4337().aClass217_2599);
				class217.aFloat2451 = (float) ((scenePositionXQueue[0] << 9) + (getSize() << 8));
				class217.aFloat2454 = (float) ((scenePositionYQueue[0] << 9) + (getSize() << 8));
				method4340(class217);
				class217.method2006();
			}
			if (client.playerIndex * -442628795 == anInt10064 * 1888274983 && null != is_24_) {
				for (int i_25_ = 0; i_25_ < is_14_.length; i_25_++) {
					if (is_24_[i_25_] != is_14_[i_25_]) {
						Class298_Sub32_Sub14.aClass477_9400.method6089(-2137955741);
						break;
					}
				}
			}
			if (((Player) this).aClass351_10067 != null)
				((Player) this).aClass351_10067.method4220();
			if (aClass438_10077.method5819((byte) -68) && aBoolean10094) {
				Class350 class350 = method4426(-244281365);
				if (!class350.method4209(aClass438_10077.method5823(1971304294), (byte) -15)) {
					aClass438_10077.method5821(-1, -2110667700);
					aBoolean10094 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gf(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bc(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (null == aClass366_10209 || !method4469(class_ra, 2048, (byte) 12))
				return null;
			Matrix3f class222 = class_ra.method5178();
			Matrix3f class222_26_ = method4347();
			Class235 class235 = method4337();
			int i_27_ = aClass386_10084.method4719((byte) 0);
			Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][(int) class235.aClass217_2599.aFloat2451 >> 9][(int) class235.aClass217_2599.aFloat2454 >> 9]);
			if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
				int i_28_ = ((((Player) this).anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
				((Player) this).anInt10122 = (int) ((float) (-661498661 * (((Player) this).anInt10122)) - (float) i_28_ / 10.0F) * 1394444115;
			} else
				((Player) this).anInt10122 = (int) ((float) ((((Player) this).anInt10122) * -661498661) - (float) ((((Player) this).anInt10122) * -661498661) / 10.0F) * 1394444115;
			class222.method2070(class222_26_);
			class222.method2064(0.0F, (float) (-20 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
			Class335 class335 = null;
			((Player) this).aBoolean10129 = false;
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub18_7561.method5693(-591782935) == 1) {
				Class350 class350 = method4426(-97958061);
				if (class350.aBoolean3756 && (164936249 * aClass366_10209.anInt3974 == -1 || (Class15.aClass507_224.method6269(aClass366_10209.anInt3974 * 164936249, -465726953).aBoolean6165))) {
					Class438 class438 = ((aClass438_10078.method5819((byte) -70) && aClass438_10078.method5826(-65534)) ? aClass438_10078 : null);
					Class438 class438_29_ = ((aClass438_10077.method5819((byte) -61) && (!aBoolean10094 || class438 == null)) ? aClass438_10077 : null);
					Class387 class387 = (Class283.method2678(class_ra, i_27_, -155466425 * (((Player) this).anInt10097), -197572281 * (((Player) this).anInt10073), -104151209 * (((Player) this).anInt10074), 1, aClass387Array10082[0], 0, 0, 160, 240, class438_29_ != null ? class438_29_ : class438, 1812843484));
					if (null != class387) {
						if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < 1 + aClass387Array10082.length))
							method4362(aClass387Array10082.length + 1, -1332935516);
						class335 = Class73.method818(true, 1694437358);
						((Player) this).aBoolean10129 = true;
						class_ra.RA(false);
						class387.method4739(class222, (aClass302_Sub1Array7726[aClass387Array10082.length]), 0);
						class_ra.RA(true);
					}
				}
			}
			if (this == Class287.myPlayer) {
				for (int i_30_ = client.aClass19Array8869.length - 1; i_30_ >= 0; i_30_--) {
					Class19 class19 = client.aClass19Array8869[i_30_];
					if (null != class19 && class19.anInt263 * 408071539 != -1) {
						if (958933333 * class19.anInt266 == 1) {
							Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) (-841622081 * class19.anInt256))));
							if (null != class298_sub29) {
								NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
								Class217 class217 = (Class217.method2011(class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599, Class287.myPlayer.method4337().aClass217_2599));
								int i_31_ = (int) class217.aFloat2451;
								int i_32_ = (int) class217.aFloat2454;
								method4468(class_ra, class222, aClass387Array10082[0], (long) i_31_, (long) i_32_, class19.anInt263 * 408071539, 92160000L);
							}
						}
						if (2 == class19.anInt266 * 958933333) {
							Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
							long l = (long) (-1338192389 * class19.anInt260 - (int) class217.aFloat2451);
							long l_33_ = (long) (class19.anInt261 * 1018128075 - (int) class217.aFloat2454);
							long l_34_ = (long) (2140036693 * class19.anInt257 << 9);
							l_34_ *= l_34_;
							method4468(class_ra, class222, aClass387Array10082[0], l, l_33_, 408071539 * class19.anInt263, l_34_);
						}
						if (10 == class19.anInt266 * 958933333 && -841622081 * class19.anInt256 >= 0 && (-841622081 * class19.anInt256 < (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805).length)) {
							Player class365_sub1_sub1_sub2_sub2_35_ = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[class19.anInt256 * -841622081]);
							if (class365_sub1_sub1_sub2_sub2_35_ != null) {
								Class217 class217 = (Class217.method2011(class365_sub1_sub1_sub2_sub2_35_.method4337().aClass217_2599, Class287.myPlayer.method4337().aClass217_2599));
								int i_36_ = (int) class217.aFloat2451;
								int i_37_ = (int) class217.aFloat2454;
								method4468(class_ra, class222, aClass387Array10082[0], (long) i_36_, (long) i_37_, 408071539 * class19.anInt263, 92160000L);
							}
						}
					}
				}
			}
			class222.method2070(class222_26_);
			class222.method2064(0.0F, (float) (-5 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
			if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < aClass387Array10082.length)
				method4362(aClass387Array10082.length, 1335663590);
			if (class335 == null)
				class335 = Class73.method818(true, 1293324019);
			method4445(class_ra, aClass387Array10082, class222, false, 482140235);
			for (int i_38_ = 0; i_38_ < aClass387Array10082.length; i_38_++) {
				if (aClass387Array10082[i_38_] != null)
					aClass387Array10082[i_38_].method4739(class222, aClass302_Sub1Array7726[i_38_], (this == Class287.myPlayer ? 1 : 0));
			}
			if (null != ((Player) this).aClass351_10067) {
				Class69 class69 = ((Player) this).aClass351_10067.method4229();
				if(cprgbe)
					class_ra.method5042_cp(class69, ccat, ci, ca);
				else
					class_ra.method5042(class69);
				class_ra.method5042(class69);
			}
			for (int i_39_ = 0; i_39_ < aClass387Array10082.length; i_39_++) {
				if (null != aClass387Array10082[i_39_])
					((Player) this).aBoolean10129 |= aClass387Array10082[i_39_].i();
				aClass387Array10082[i_39_] = null;
			}
			anInt10066 = client.anInt8777 * -815465993;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bo(").append(')').toString());
		}
	}

	int method4438() {
		return ((Player) this).anInt10216 * 613696379;
	}

	void method4468(GraphicsToolkit class_ra, Matrix3f class222, Class387 class387, long l, long l_40_, int i, long l_41_) {
		try {
			long l_42_ = l * l + l_40_ * l_40_;
			if (l_42_ >= 262144L && l_42_ <= l_41_) {
				int i_43_ = ((int) ((Math.atan2((double) l, (double) l_40_) * 2607.5945876176133) - (double) aClass386_10084.method4719((byte) 0)) & 0x3fff);
				Class387 class387_44_ = (Class219.method2044(class_ra, i_43_, (((Player) this).anInt10097 * -155466425), (-197572281 * ((Player) this).anInt10073), (((Player) this).anInt10074 * -104151209), i, -2134746538));
				if (class387_44_ != null) {
					class_ra.RA(false);
					class387_44_.method4739(class222, null, 0);
					class_ra.RA(true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gb(").append(')').toString());
		}
	}

	boolean method4469(GraphicsToolkit class_ra, int i, byte i_45_) {
		try {
			int i_46_ = i;
			Class350 class350 = method4426(1841046440);
			Class438 class438 = ((aClass438_10078.method5819((byte) -54) && !aClass438_10078.method5826(-65534)) ? aClass438_10078 : null);
			Class438 class438_47_ = ((aClass438_10077.method5819((byte) -28) && !aBoolean10207 && (!aBoolean10094 || class438 == null)) ? aClass438_10077 : null);
			int i_48_ = class350.anInt3735 * 250567115;
			int i_49_ = 1110265995 * class350.anInt3736;
			if (i_48_ != 0 || 0 != i_49_ || class350.anInt3748 * 1185872679 != 0 || 0 != -330229359 * class350.anInt3751)
				i |= 0x7;
			int i_50_ = aClass386_10084.method4719((byte) 0);
			boolean bool = (0 != aByte10130 && 443738891 * client.anInt8884 >= anInt10105 * 1920148979 && 443738891 * client.anInt8884 < 1953154657 * anInt10106);
			if (bool)
				i |= 0x80000;
			Class387 class387 = (aClass387Array10082[0] = (aClass366_10209.method4545(class_ra, i, Class94.aClass349_913, Class212.aClass144_2433, Class15.aClass507_224, Class298_Sub32_Sub14.aClass477_9400, Class501.aClass395_6122, Class128.aClass148_6331, class438, class438_47_, aClass438_Sub2_Sub1Array10112, anIntArray10085, i_50_, true, Class82_Sub18.aClass405_6892, 1284357526)));
			int i_51_ = Class297.method2836((byte) 1);
			if (Class291.maximumMemory * 1126040225 < 96 && i_51_ > 50)
				Class234.method2183(-824617958);
			if (Class242.aClass401_2708 != Class401.aClass401_6557 && i_51_ < 50) {
				int i_52_;
				for (i_52_ = 50 - i_51_; i_52_ > -837572863 * client.anInt8677; client.anInt8677 += 836589825)
					Class98.aByteArrayArray949[client.anInt8677 * -837572863] = new byte[102400];
				while (i_52_ < -837572863 * client.anInt8677) {
					client.anInt8677 -= 836589825;
					Class98.aByteArrayArray949[-837572863 * client.anInt8677] = null;
				}
			} else if (Class401.aClass401_6557 != Class242.aClass401_2708) {
				Class98.aByteArrayArray949 = new byte[50][];
				client.anInt8677 = 0;
			}
			if (class387 == null)
				return false;
			((Player) this).anInt10089 = class387.YA() * -49760597;
			class387.n();
			method4423(class387, 839093609);
			if (i_48_ != 0 || 0 != i_49_) {
				method4425(i_50_, i_48_, i_49_, class350.anInt3734 * -947990311, 1869548445 * class350.anInt3740, 1427427127);
				if ((((Player) this).anInt10097 * -155466425) != 0)
					class387.t(-155466425 * ((Player) this).anInt10097);
				if ((((Player) this).anInt10073 * -197572281) != 0)
					class387.EA((((Player) this).anInt10073) * -197572281);
				if (0 != (-104151209 * ((Player) this).anInt10074))
					class387.ia(0, -104151209 * ((Player) this).anInt10074, 0);
			} else
				method4425(i_50_, getSize() << 9, getSize() << 9, 0, 0, 1352604124);
			if (bool)
				class387.PA(aByte10117, aByte10108, aByte10109, aByte10130 & 0xff);
			if (!aBoolean10207)
				method4424(class_ra, class350, i_46_, i_48_, i_49_, i_50_, 1438640232);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gx(").append(')').toString());
		}
	}

	public String method4470(boolean bool, int i) {
		try {
			String string = "";
			if (((Player) this).beforeTitle != null)
				string = ((Player) this).beforeTitle;
			if (bool)
				string = new StringBuilder().append(string).append(displayName).toString();
			else
				string = new StringBuilder().append(string).append(username).toString();
			if (null != ((Player) this).afterTitle)
				string = new StringBuilder().append(string).append(((Player) this).afterTitle).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gk(").append(')').toString());
		}
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	public final void method4471(int i, int i_53_, byte i_54_, int i_55_) {
		try {
			if (aClass438_10078.method5819((byte) -119) && (aClass438_10078.method5820(1546485881).anInt4189 * -882531177) == 1) {
				anIntArray10093 = null;
				aClass438_10078.method5821(-1, -1739646413);
			}
			for (int i_56_ = 0; i_56_ < currentGraphics.length; i_56_++) {
				if (-1 != currentGraphics[i_56_].id * -967533709) {
					Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(-967533709 * currentGraphics[i_56_].id, -1891757366));
					if (class398.aBoolean5215 && 1505778629 * class398.anInt5205 != -1 && (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) 83).anInt4189) * -882531177 == 1) {
						currentGraphics[i_56_].aClass438_569.method5821(-1, -1843943010);
						currentGraphics[i_56_].id = -1313669563;
					}
				}
			}
			anInt10221 = 1530078181;
			if (i < 0 || i >= client.aClass283_8716.method2629(-1987519551) || i_53_ < 0 || i_53_ >= client.aClass283_8716.method2630(1479162339))
				method4472(i, i_53_, -2049230528);
			else if (scenePositionXQueue[0] < 0 || (scenePositionXQueue[0] >= client.aClass283_8716.method2629(-1906686754)) || scenePositionYQueue[0] < 0 || (scenePositionYQueue[0] >= client.aClass283_8716.method2630(-964068282)))
				method4472(i, i_53_, -2022261810);
			else {
				if (Class282.aClass282_6541.aByte6542 == i_54_)
					Class303.method3737(this, i, i_53_, Class282.aClass282_6541.aByte6542, (byte) 98);
				method4473(i, i_53_, i_54_, (byte) 94);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gy(").append(')').toString());
		}
	}

	public void method4472(int i, int i_57_, int i_58_) {
		try {
			anInt10120 = 0;
			anInt10125 = 0;
			anInt10124 = 0;
			scenePositionXQueue[0] = i;
			scenePositionYQueue[0] = i_57_;
			int i_59_ = getSize();
			Class217 class217 = Class217.method2005(method4337().aClass217_2599);
			class217.aFloat2451 = (float) (256 * i_59_ + scenePositionXQueue[0] * 512);
			class217.aFloat2454 = (float) (i_59_ * 256 + scenePositionYQueue[0] * 512);
			method4340(class217);
			class217.method2006();
			if (this == Class287.myPlayer)
				client.aClass283_8716.method2640((byte) 35).method4324(-1515011512);
			if (null != ((Player) this).aClass351_10067)
				((Player) this).aClass351_10067.method4220();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gu(").append(')').toString());
		}
	}

	public final void method4473(int i, int i_60_, byte i_61_, byte i_62_) {
		try {
			if (2050671733 * anInt10120 < scenePositionXQueue.length - 1)
				anInt10120 += -1013322787;
			for (int i_63_ = 2050671733 * anInt10120; i_63_ > 0; i_63_--) {
				scenePositionXQueue[i_63_] = scenePositionXQueue[i_63_ - 1];
				scenePositionYQueue[i_63_] = scenePositionYQueue[i_63_ - 1];
				aByteArray10110[i_63_] = aByteArray10110[i_63_ - 1];
			}
			scenePositionXQueue[0] = i;
			scenePositionYQueue[0] = i_60_;
			aByteArray10110[0] = i_61_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gh(").append(')').toString());
		}
	}

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_64_, int i_65_, boolean bool) {
		throw new IllegalStateException();
	}

	public int getSize() {
		try {
			if (null != aClass366_10209 && -1 != aClass366_10209.anInt3974 * 164936249)
				return ((Class15.aClass507_224.method6269(164936249 * aClass366_10209.anInt3974, 1333509149).anInt6187) * -2095128707);
			return super.getSize();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.q(").append(')').toString());
		}
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	public int method4427(byte i) {
		try {
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.h(").append(')').toString());
		}
	}

	public void method4474(String string, int i, int i_66_, int i_67_) {
		try {
			method4430(string, i, i_66_, (Class82_Sub5.method883((byte) 6) * (453178367 * HashTable.aClass371_5520.anInt4037)), (byte) -79);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gz(").append(')').toString());
		}
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bw(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_68_, int i_69_, boolean bool, int i_70_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bk(").append(')').toString());
		}
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bq(").append(')').toString());
		}
	}

	public boolean method4429(byte i) {
		try {
			return HashTable.aClass371_5520.aBoolean4043;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.by(").append(')').toString());
		}
	}

	public String method4475(boolean bool, byte i) {
		try {
			if (bool)
				return displayName;
			return username;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.gr(").append(')').toString());
		}
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_71_) {
		if (null == aClass366_10209 || !method4469(class_ra, 131072, (byte) -3))
			return false;
		Matrix3f class222 = method4347();
		boolean bool = false;
		for (int i_72_ = 0; i_72_ < aClass387Array10082.length; i_72_++) {
			if (aClass387Array10082[i_72_] != null && aClass387Array10082[i_72_].method4787(i, i_71_, class222, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_73_ = 0; i_73_ < aClass387Array10082.length; i_73_++)
			aClass387Array10082[i_73_] = null;
		return bool;
	}

	final boolean method4387() {
		return false;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (null == aClass366_10209 || !method4469(class_ra, 2048, (byte) 38))
			return null;
		Matrix3f class222 = class_ra.method5178();
		Matrix3f class222_74_ = method4347();
		Class235 class235 = method4337();
		int i = aClass386_10084.method4719((byte) 0);
		Class326 class326 = (aClass331_7722.aClass326ArrayArrayArray3516[plane][(int) class235.aClass217_2599.aFloat2451 >> 9][(int) class235.aClass217_2599.aFloat2454 >> 9]);
		if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
			int i_75_ = ((((Player) this).anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
			((Player) this).anInt10122 = (int) ((float) (-661498661 * (((Player) this).anInt10122)) - (float) i_75_ / 10.0F) * 1394444115;
		} else
			((Player) this).anInt10122 = (int) ((float) ((((Player) this).anInt10122) * -661498661) - (float) ((((Player) this).anInt10122) * -661498661) / 10.0F) * 1394444115;
		class222.method2070(class222_74_);
		class222.method2064(0.0F, (float) (-20 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
		Class335 class335 = null;
		((Player) this).aBoolean10129 = false;
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub18_7561.method5693(-1650118723) == 1) {
			Class350 class350 = method4426(-231420914);
			if (class350.aBoolean3756 && (164936249 * aClass366_10209.anInt3974 == -1 || (Class15.aClass507_224.method6269(aClass366_10209.anInt3974 * 164936249, -824172978).aBoolean6165))) {
				Class438 class438 = ((aClass438_10078.method5819((byte) -76) && aClass438_10078.method5826(-65534)) ? aClass438_10078 : null);
				Class438 class438_76_ = ((aClass438_10077.method5819((byte) -39) && (!aBoolean10094 || class438 == null)) ? aClass438_10077 : null);
				Class387 class387 = (Class283.method2678(class_ra, i, (-155466425 * ((Player) this).anInt10097), (-197572281 * ((Player) this).anInt10073), (-104151209 * ((Player) this).anInt10074), 1, aClass387Array10082[0], 0, 0, 160, 240, class438_76_ != null ? class438_76_ : class438, 1812843484));
				if (null != class387) {
					if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < 1 + aClass387Array10082.length))
						method4362(aClass387Array10082.length + 1, -1158693755);
					class335 = Class73.method818(true, 1781263344);
					((Player) this).aBoolean10129 = true;
					class_ra.RA(false);
					class387.method4739(class222, (aClass302_Sub1Array7726[aClass387Array10082.length]), 0);
					class_ra.RA(true);
				}
			}
		}
		if (this == Class287.myPlayer) {
			for (int i_77_ = client.aClass19Array8869.length - 1; i_77_ >= 0; i_77_--) {
				Class19 class19 = client.aClass19Array8869[i_77_];
				if (null != class19 && class19.anInt263 * 408071539 != -1) {
					if (958933333 * class19.anInt266 == 1) {
						Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) (-841622081 * class19.anInt256))));
						if (null != class298_sub29) {
							NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
							Class217 class217 = (Class217.method2011((class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599), Class287.myPlayer.method4337().aClass217_2599));
							int i_78_ = (int) class217.aFloat2451;
							int i_79_ = (int) class217.aFloat2454;
							method4468(class_ra, class222, aClass387Array10082[0], (long) i_78_, (long) i_79_, class19.anInt263 * 408071539, 92160000L);
						}
					}
					if (2 == class19.anInt266 * 958933333) {
						Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
						long l = (long) (-1338192389 * class19.anInt260 - (int) class217.aFloat2451);
						long l_80_ = (long) (class19.anInt261 * 1018128075 - (int) class217.aFloat2454);
						long l_81_ = (long) (2140036693 * class19.anInt257 << 9);
						l_81_ *= l_81_;
						method4468(class_ra, class222, aClass387Array10082[0], l, l_80_, 408071539 * class19.anInt263, l_81_);
					}
					if (10 == class19.anInt266 * 958933333 && -841622081 * class19.anInt256 >= 0 && (-841622081 * class19.anInt256 < (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805).length)) {
						Player class365_sub1_sub1_sub2_sub2_82_ = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[class19.anInt256 * -841622081]);
						if (class365_sub1_sub1_sub2_sub2_82_ != null) {
							Class217 class217 = (Class217.method2011(class365_sub1_sub1_sub2_sub2_82_.method4337().aClass217_2599, Class287.myPlayer.method4337().aClass217_2599));
							int i_83_ = (int) class217.aFloat2451;
							int i_84_ = (int) class217.aFloat2454;
							method4468(class_ra, class222, aClass387Array10082[0], (long) i_83_, (long) i_84_, 408071539 * class19.anInt263, 92160000L);
						}
					}
				}
			}
		}
		class222.method2070(class222_74_);
		class222.method2064(0.0F, (float) (-5 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
		if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < aClass387Array10082.length)
			method4362(aClass387Array10082.length, 984553269);
		if (class335 == null)
			class335 = Class73.method818(true, 1891741263);
		method4445(class_ra, aClass387Array10082, class222, false, -135783625);
		for (int i_85_ = 0; i_85_ < aClass387Array10082.length; i_85_++) {
			if (aClass387Array10082[i_85_] != null)
				aClass387Array10082[i_85_].method4739(class222, aClass302_Sub1Array7726[i_85_], (this == Class287.myPlayer ? 1 : 0));
		}
		if (null != ((Player) this).aClass351_10067) {
			Class69 class69 = ((Player) this).aClass351_10067.method4229();
			if(cprgbe)
				class_ra.method5042_cp(class69, ccat, ci, ca);
			else
				class_ra.method5042(class69);
			class_ra.method5042(class69);
		}
		for (int i_86_ = 0; i_86_ < aClass387Array10082.length; i_86_++) {
			if (null != aClass387Array10082[i_86_])
				((Player) this).aBoolean10129 |= aClass387Array10082[i_86_].i();
			aClass387Array10082[i_86_] = null;
		}
		anInt10066 = client.anInt8777 * -815465993;
		return class335;
	}

	void method4371(GraphicsToolkit class_ra) {
		if (null != aClass366_10209 && (((Player) this).aBoolean10128 || method4469(class_ra, 0, (byte) 83))) {
			Matrix3f class222 = class_ra.method5178();
			class222.method2054(method4337());
			class222.method2064(0.0F, -5.0F, 0.0F);
			method4445(class_ra, aClass387Array10082, class222, ((Player) this).aBoolean10128, -639077471);
			for (int i = 0; i < aClass387Array10082.length; i++)
				aClass387Array10082[i] = null;
		}
	}

	public Class62 method4437(int i) {
		try {
			if (null != ((Player) this).aClass62_10118) {
				if (null == ((Class62) (((Player) this).aClass62_10118)).aString608)
					return null;
				if (0 == client.anInt8837 * -1168328513 || -1168328513 * client.anInt8837 == 3 || (client.anInt8837 * -1168328513 == 1 && Class494.method6192(username, -1511804216)))
					return (((Player) this).aClass62_10118);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bl(").append(')').toString());
		}
	}

	public Player(Class331 class331) {
		super(class331);
		skullId = -1944760989;
		prayerIcon = -218110545;
		anInt10206 = 0;
		anInt10213 = 0;
		anInt10204 = 1031683529;
		anInt10205 = 0;
		anInt10221 = 1530078181;
		aBoolean10207 = false;
		anInt10208 = 0;
		anInt10194 = -361000179;
		anInt10210 = -1839540625;
		anInt10211 = -1358158739;
		anInt10212 = 1578398049;
		transformedNpc = false;
		anInt10214 = 0;
		anInt10215 = -664381027;
		aBoolean10217 = false;
		aBoolean10203 = false;
		hidden = false;
		aBoolean10222 = false;
		aClass70_10223 = new Class70(16);
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_87_) {
		if (null == aClass366_10209 || !method4469(class_ra, 131072, (byte) -89))
			return false;
		Matrix3f class222 = method4347();
		boolean bool = false;
		for (int i_88_ = 0; i_88_ < aClass387Array10082.length; i_88_++) {
			if (aClass387Array10082[i_88_] != null && aClass387Array10082[i_88_].method4787(i, i_87_, class222, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_89_ = 0; i_89_ < aClass387Array10082.length; i_89_++)
			aClass387Array10082[i_89_] = null;
		return bool;
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_90_, int i_91_, boolean bool) {
		throw new IllegalStateException();
	}

	int method4446() {
		return ((Player) this).anInt10216 * 613696379;
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	public int method4476() {
		if (null != aClass366_10209 && -1 != aClass366_10209.anInt3974 * 164936249)
			return ((Class15.aClass507_224.method6269(164936249 * aClass366_10209.anInt3974, 1538306428).anInt6187) * -2095128707);
		return super.getSize();
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_92_, byte i_93_) {
		try {
			if (null == aClass366_10209 || !method4469(class_ra, 131072, (byte) 31))
				return false;
			Matrix3f class222 = method4347();
			boolean bool = false;
			for (int i_94_ = 0; i_94_ < aClass387Array10082.length; i_94_++) {
				if (aClass387Array10082[i_94_] != null && aClass387Array10082[i_94_].method4787(i, i_92_, class222, true, 0)) {
					bool = true;
					break;
				}
			}
			for (int i_95_ = 0; i_95_ < aClass387Array10082.length; i_95_++)
				aClass387Array10082[i_95_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bu(").append(')').toString());
		}
	}

	public boolean method4452() {
		return HashTable.aClass371_5520.aBoolean4043;
	}

	int method4447() {
		return ((Player) this).anInt10216 * 613696379;
	}

	final boolean method4384() {
		return false;
	}

	int method4448() {
		return ((Player) this).anInt10216 * 613696379;
	}

	public int method4449() {
		return -1;
	}

	public final boolean method4477(int i) {
		try {
			if (aClass366_10209 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.ga(").append(')').toString());
		}
	}

	final boolean method4400() {
		return false;
	}

	final boolean method4386() {
		return false;
	}

	void method4373(GraphicsToolkit class_ra) {
		if (null != aClass366_10209 && (((Player) this).aBoolean10128 || method4469(class_ra, 0, (byte) -3))) {
			Matrix3f class222 = class_ra.method5178();
			class222.method2054(method4337());
			class222.method2064(0.0F, -5.0F, 0.0F);
			method4445(class_ra, aClass387Array10082, class222, ((Player) this).aBoolean10128, -758371208);
			for (int i = 0; i < aClass387Array10082.length; i++)
				aClass387Array10082[i] = null;
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			if (null != aClass366_10209 && (((Player) this).aBoolean10128 || method4469(class_ra, 0, (byte) 34))) {
				Matrix3f class222 = class_ra.method5178();
				class222.method2054(method4337());
				class222.method2064(0.0F, -5.0F, 0.0F);
				method4445(class_ra, aClass387Array10082, class222, ((Player) this).aBoolean10128, 1138059762);
				for (int i_96_ = 0; i_96_ < aClass387Array10082.length; i_96_++)
					aClass387Array10082[i_96_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.bb(").append(')').toString());
		}
	}

	int method4432(int i) {
		try {
			return (((Player) this).anInt10216 * 613696379);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akm.t(").append(')').toString());
		}
	}

	public Class62 method4443() {
		if (null != ((Player) this).aClass62_10118) {
			if (null == ((Class62) (((Player) this).aClass62_10118)).aString608)
				return null;
			if (0 == client.anInt8837 * -1168328513 || -1168328513 * client.anInt8837 == 3 || (client.anInt8837 * -1168328513 == 1 && Class494.method6192(username, -1800657283)))
				return ((Player) this).aClass62_10118;
		}
		return null;
	}

	public boolean method4440() {
		return HashTable.aClass371_5520.aBoolean4043;
	}

	final void method4378() {
		throw new IllegalStateException();
	}

	public int method4478() {
		if (null != aClass366_10209 && -1 != aClass366_10209.anInt3974 * 164936249)
			return ((Class15.aClass507_224.method6269(164936249 * aClass366_10209.anInt3974, 662796254).anInt6187) * -2095128707);
		return super.getSize();
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_97_) {
		if (null == aClass366_10209 || !method4469(class_ra, 131072, (byte) -34))
			return false;
		Matrix3f class222 = method4347();
		boolean bool = false;
		for (int i_98_ = 0; i_98_ < aClass387Array10082.length; i_98_++) {
			if (aClass387Array10082[i_98_] != null && aClass387Array10082[i_98_].method4787(i, i_97_, class222, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_99_ = 0; i_99_ < aClass387Array10082.length; i_99_++)
			aClass387Array10082[i_99_] = null;
		return bool;
	}
}
