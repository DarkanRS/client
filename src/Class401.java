/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class401 implements Interface21 {
	int anInt6551;
	public static Class401 aClass401_6552 = new Class401("LOCAL", "", 4);
	public static Class401 aClass401_6553;
	public static Class401 aClass401_6554;
	public static Class401 aClass401_6555;
	static Class401 aClass401_6556;
	public static Class401 aClass401_6557;
	String aString6558;
	static int anInt6559;
	public static Class401 aClass401_6560 = new Class401("WTWIP", "", 3);
	static Class57[] aClass57Array6561;
	static int anInt6562;

	Class401(String string, String string_0_, int i) {
		((Class401) this).aString6558 = string;
		((Class401) this).anInt6551 = i * 143252701;
	}

	public static boolean method4932(Class401 class401, int i) {
		try {
			return (aClass401_6555 == class401 || class401 == aClass401_6554 || aClass401_6560 == class401 || aClass401_6553 == class401 || aClass401_6556 == class401);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.b(").append(')').toString());
		}
	}

	public int method242(int i) {
		try {
			return ((Class401) this).anInt6551 * -504243339;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.f(").append(')').toString());
		}
	}

	static {
		aClass401_6553 = new Class401("WTI", "", 5);
		aClass401_6554 = new Class401("WTQA", "", 2);
		aClass401_6555 = new Class401("WTRC", "", 1);
		aClass401_6556 = new Class401("INTBETA", "", 6);
		aClass401_6557 = new Class401("LIVE", "", 0);
		method4936(-2140357445);
	}

	public int method243() {
		return ((Class401) this).anInt6551 * -504243339;
	}

	public static final int method4933(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_2_ > 243)
				i_1_ >>= 4;
			else if (i_2_ > 217)
				i_1_ >>= 3;
			else if (i_2_ > 192)
				i_1_ >>= 2;
			else if (i_2_ > 179)
				i_1_ >>= 1;
			return (i_2_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_1_ >> 5 << 7));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.s(").append(')').toString());
		}
	}

	public int method244() {
		return ((Class401) this).anInt6551 * -504243339;
	}

	static void method4934(byte i) {
		try {
			Class19.aClass348_264.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.b(").append(')').toString());
		}
	}

	static final void method4935(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			if ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) >= (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]))
				((ClientScript2) class403).anInt5259 += ((((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.al(").append(')').toString());
		}
	}

	public static Class401[] method4936(int i) {
		try {
			return (new Class401[] { aClass401_6556, aClass401_6552, aClass401_6553, aClass401_6557, aClass401_6555, aClass401_6560, aClass401_6554 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.a(").append(')').toString());
		}
	}

	public static ItemEffects readItemEffects(ItemDefinitions defs, RsByteBuffer buffer, byte i) {
		try {
			ItemEffects data = new ItemEffects(defs);
			int flag = buffer.readUnsignedByte();
			boolean flagged_aura = (flag & 0x1) != 0;
			boolean flagged_head_mdl = (flag & 0x2) != 0;
			boolean recolorFlag = (flag & 0x4) != 0;
			boolean flagTexture = (flag & 0x8) != 0;
			if (flagged_aura) {
				data.aura_cmp_ptone[0] = buffer.readBigSmart(1235052657);// male
																			// model
																			// id
																			// 1.
				data.aura_cmp_pttwo[0] = buffer.readBigSmart(1235052657);// male
																			// model
																			// id
																			// 2.
				if (-1 != 34210967 * ((ItemDefinitions) defs).femaleModelId1 || -1 != -1284247975 * ((ItemDefinitions) defs).femaleModelId2) {
					data.aura_cmp_ptone[1] = buffer.readBigSmart(1235052657);
					data.aura_cmp_pttwo[1] = buffer.readBigSmart(1235052657);
				}
				if (((ItemDefinitions) defs).anInt5759 * 1313278521 != -1 || -1767718263 * ((ItemDefinitions) defs).anInt5741 != -1) {
					data.aura_cmp_ptone[2] = buffer.readBigSmart(1235052657);
					data.aura_cmp_pttwo[2] = buffer.readBigSmart(1235052657);
				}
			}
			if (flagged_head_mdl) {
				data.male_head_mdls[0] = buffer.readBigSmart(1235052657);
				data.fem_head_mdls[0] = buffer.readBigSmart(1235052657);
				if (86274879 * ((ItemDefinitions) defs).male_head_mdltwo != -1 || ((ItemDefinitions) defs).fem_head_mdltwo * 1578724433 != -1) {
					data.male_head_mdls[1] = buffer.readBigSmart(1235052657);
					data.fem_head_mdls[1] = buffer.readBigSmart(1235052657);
				}
			}
			if (recolorFlag) {
				int colorSet = buffer.readUnsignedShort();
				int[] indices = new int[4];
				// indices[0] = colorSet & 0xf;
				// indices[1] = colorSet >> 4 & 0xf;
				// indices[2] = colorSet >> 8 & 0xf;
				// indices[3] = colorSet >> 12 & 0xf;
				indices[0] = 15 & colorSet;
				indices[1] = (colorSet & 255) >> 4;
				indices[2] = 15 & colorSet >> 8;
				indices[3] = 15 & colorSet >> 12;
				for (int bit = 0; bit < 4; bit++) {
					if (indices[bit] != 15)
						data.color_palette[indices[bit]] = (short) buffer.readUnsignedShort();
				}
			}
			if (flagTexture) {
				int textureSet = buffer.readUnsignedByte();
				int[] indices = new int[2];
				// indices[0] = textureSet & 0xf;
				// indices[1] = textureSet >> 4 & 0xf;
				indices[0] = textureSet & 15;
				indices[1] = (255 & textureSet) >> 4;
				for (int bit = 0; bit < 2; bit++) {
					if (15 != indices[bit])
						data.texture_palette[indices[bit]] = (short) buffer.readUnsignedShort();
				}
			}
			return data;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.a(").append(')').toString());
		}
	}

	static void method4938(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, byte i_18_) {
		try {
			int i_19_ = Class463.method6012(i_13_, 1155384281 * Class372_Sub3.anInt4049, -1062447355 * Class372_Sub3.anInt4050, -1212608691);
			int i_20_ = Class463.method6012(i_14_, Class372_Sub3.anInt4049 * 1155384281, Class372_Sub3.anInt4050 * -1062447355, -1212608691);
			int i_21_ = Class463.method6012(i, Class372_Sub3.anInt4051 * -1424479739, 1135094847 * Class372_Sub3.anInt4048, -1212608691);
			int i_22_ = Class463.method6012(i_12_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847, -1212608691);
			int i_23_ = Class463.method6012(i_13_ + i_17_, 1155384281 * Class372_Sub3.anInt4049, Class372_Sub3.anInt4050 * -1062447355, -1212608691);
			int i_24_ = Class463.method6012(i_14_ - i_17_, Class372_Sub3.anInt4049 * 1155384281, -1062447355 * Class372_Sub3.anInt4050, -1212608691);
			for (int i_25_ = i_19_; i_25_ < i_23_; i_25_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_25_]), i_21_, i_22_, i_16_, -1884573988);
			for (int i_26_ = i_20_; i_26_ > i_24_; i_26_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_26_]), i_21_, i_22_, i_16_, 712014890);
			int i_27_ = Class463.method6012(i + i_17_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847, -1212608691);
			int i_28_ = Class463.method6012(i_12_ - i_17_, Class372_Sub3.anInt4051 * -1424479739, Class372_Sub3.anInt4048 * 1135094847, -1212608691);
			for (int i_29_ = i_23_; i_29_ <= i_24_; i_29_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_29_];
				Class82_Sub22.method940(is, i_21_, i_27_, i_16_, -665045806);
				Class82_Sub22.method940(is, i_27_, i_28_, i_15_, -1572233497);
				Class82_Sub22.method940(is, i_28_, i_22_, i_16_, -2046400935);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.q(").append(')').toString());
		}
	}

	static void method4939(Class298_Sub37_Sub15 class298_sub37_sub15, int i, int i_30_, short i_31_) {
		try {
			if (null != class298_sub37_sub15 && (Class436.aClass453_5480.aClass298_5643 != class298_sub37_sub15)) {
				int i_32_ = (-887503319 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9658));
				int i_33_ = (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9663 * -502720623);
				int i_34_ = (946432351 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662));
				int i_35_ = (int) ((((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661) * 2236412381003659263L);
				long l = (2236412381003659263L * (((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661));
				if (i_34_ >= 2000)
					i_34_ -= 2000;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				if (23 == i_34_) {
					if (1806357379 * client.playerRights > 0 && Class434.method5802(1267311211))
						Class476.teleport((Class287.myPlayer.plane), i_32_ + -1760580017 * class341.gameSceneBaseX, i_33_ + class341.gameSceneBaseY * 283514611, 2043472934);
					else {

						if (Loader.usingRS) {
							Class298_Sub36 class298_sub36 = Class277.createWalkPacket(i_32_, i_33_, i_35_);
							if (1 == i_35_) {
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(-1);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(-1);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((int) client.aFloat8949, 16711935);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(57);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(1227356013 * client.anInt8801);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(356727603 * client.anInt8749);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(89);
								Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((int) class217.aFloat2451, 16711935);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((int) class217.aFloat2454, 16711935);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(63);
							} else {
								client.anInt8784 = i * 143636043;
								client.anInt8785 = i_30_ * 381532777;
								client.anInt8748 = 277162405;
								client.anInt8786 = 0;
							}
							client.gameConnection.method390(class298_sub36, (byte) -115);
						} else {
							Class277.sendWalkPacket(i_35_, Class350.method4214(i_32_, i_33_, (short) 808));
							if (i_35_ == 0) {
								client.anInt8784 = i * 143636043;
								client.anInt8785 = i_30_ * 381532777;
								client.anInt8748 = 277162405;
								client.anInt8786 = 0;
							}
						}
						Class82_Sub21.method938(i_32_, i_33_, true, Class350.method4214(i_32_, i_33_, (short) 808), -1776617382);

					}
				}
				OutcommingPacket class198 = null;
				if (i_34_ == 18)
					class198 = OutcommingPacket.aClass198_2002;
				else if (i_34_ == 19)
					class198 = OutcommingPacket.aClass198_2050;
				else if (i_34_ == 20)
					class198 = OutcommingPacket.ITEM_TAKE_PACKET;
				else if (21 == i_34_)
					class198 = OutcommingPacket.aClass198_2055;
				else if (22 == i_34_)
					class198 = OutcommingPacket.aClass198_2038;
				else if (1004 == i_34_)
					class198 = OutcommingPacket.ITEM_ON_FLOOR_EXAMINE;
				if (class198 != null) {
					if (class198 != OutcommingPacket.ITEM_ON_FLOOR_EXAMINE)
						Class277.sendWalkPacket(Class282.method2619(i_32_, i_33_, 1, 1, 1978833308));
					client.anInt8784 = i * 143636043;
					client.anInt8785 = i_30_ * 381532777;
					client.anInt8748 = 554324810;
					client.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(class198, client.gameConnection.aClass449_330, (byte) 23);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(283514611 * class341.gameSceneBaseY + i_33_, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE(i_32_ + -1760580017 * class341.gameSceneBaseX, 1653379787);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(i_35_, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(984220338) ? 1 : 0, (byte) 1);
					client.gameConnection.method390(class298_sub36, (byte) -56);
					Class375.method4654(i_32_, i_33_, (byte) -67);
				}
				if (59 == i_34_) {
					client.anInt8784 = 143636043 * i;
					client.anInt8785 = 381532777 * i_30_;
					client.anInt8748 = 277162405;
					client.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2087, client.gameConnection.aClass449_330, (byte) 6);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(1262526353 * Class379.anInt4099, 969641873);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(392084321 * client.anInt8836, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(class341.gameSceneBaseY * 283514611 + i_33_, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(client.anInt8906 * 1408085039);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE(class341.gameSceneBaseX * -1760580017 + i_32_, 1993411127);
					client.gameConnection.method390(class298_sub36, (byte) -125);
					Class82_Sub21.method938(i_32_, i_33_, true, Class350.method4214(i_32_, i_33_, (short) 808), -1460658515);
				}
				if (i_34_ == 57 || i_34_ == 1007)
					Class301_Sub1.method3713(i_35_, i_33_, i_32_, (((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657), 400950689);
				if (1008 == i_34_ || 1009 == i_34_ || i_34_ == 1010 || 1011 == i_34_ || i_34_ == 1012)
					Class463.method6014(i_34_, i_35_, i_32_, 1889973846);
				if (2 == i_34_) {

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
						class336 = Class336_Sub5.method4105(i_32_, i_33_, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
					} else if (Class82_Sub9.method900(-1976050083 * class424.anInt6613, (byte) 28))
						class336 = Class336_Sub5.method4105(i_32_, i_33_, 0, 0, class424, i_4_, 740164949);
					else
						class336 = Class194.method1867(i_32_, i_33_, 0, 0, class424, i_4_, (byte) -22);
					Class277.sendWalkPacket(class336);
					client.anInt8784 = 143636043 * i;
					client.anInt8785 = i_30_ * 381532777;
					client.anInt8748 = 554324810;
					client.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.INTERFACE_ON_OBJECT, client.gameConnection.aClass449_330, (byte) 52);
					class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(-427290804) ? 1 : 0, (byte) 1);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(client.anInt8906 * 1408085039);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(283514611 * class341.gameSceneBaseY + i_33_);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeIntV2((int) (l >>> 32) & 0x7fffffff);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(1262526353 * Class379.anInt4099, 671195475);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE(client.anInt8836 * 392084321, 462918069);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i_32_ + -1760580017 * class341.gameSceneBaseX);
					client.gameConnection.method390(class298_sub36, (byte) -39);
					Class93.method1013(i_32_, i_33_, l);
				}
				if (i_34_ == 30 && client.aClass105_8652 == null) {
					Class117.method1280(i_33_, i_32_, 1723723267);
					client.aClass105_8652 = Class140.method1558(i_33_, i_32_, -156511736);
					Tradution.method6054(client.aClass105_8652, 194587581);
				}
				OutcommingPacket class198_36_ = null;
				if (i_34_ == 44)
					class198_36_ = OutcommingPacket.ATTACK_PLAYER_PACKET;
				else if (i_34_ == 45)
					class198_36_ = OutcommingPacket.aClass198_2039;
				else if (i_34_ == 46)
					class198_36_ = OutcommingPacket.aClass198_2064;
				else if (i_34_ == 47)
					class198_36_ = OutcommingPacket.aClass198_2010;
				else if (48 == i_34_)
					class198_36_ = OutcommingPacket.aClass198_2070;
				else if (i_34_ == 49)
					class198_36_ = OutcommingPacket.aClass198_2042;
				else if (50 == i_34_)
					class198_36_ = OutcommingPacket.aClass198_2056;
				else if (51 == i_34_)
					class198_36_ = OutcommingPacket.aClass198_2078;
				else if (i_34_ == 52)
					class198_36_ = OutcommingPacket.aClass198_2049;
				else if (i_34_ == 53)
					class198_36_ = OutcommingPacket.aClass198_2000;
				if (class198_36_ != null) {
					Player player = client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_35_];
					if (null != player) {
						Class277.sendWalkPacket(Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) 13));
						client.anInt8784 = i * 143636043;
						client.anInt8785 = 381532777 * i_30_;
						client.anInt8748 = 554324810;
						client.anInt8786 = 0;
						Class298_Sub36 class298_sub36 = Class18.method359(class198_36_, (client.gameConnection.aClass449_330), (byte) 74);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class151.method1644(1625676244) ? 1 : 0);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(i_35_);
						client.gameConnection.method390(class298_sub36, (byte) -105);
						Class82_Sub21.method938(player.scenePositionXQueue[0], player.scenePositionYQueue[0], true, Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) 13), 278987907);
					}
				}
				if (i_34_ == 16) {
					client.anInt8784 = 143636043 * i;
					client.anInt8785 = 381532777 * i_30_;
					client.anInt8748 = 554324810;
					client.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.INTERFACE_ON_PLAYER, client.gameConnection.aClass449_330, (byte) 82);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(1408085039 * client.anInt8906, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((Class287.myPlayer.anInt10064) * 1888274983, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeIntV2(Class379.anInt4099 * 1262526353);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(client.anInt8836 * 392084321);
					class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(-1804963392) ? 1 : 0, (byte) 1);
					client.gameConnection.method390(class298_sub36, (byte) -113);
				}
				if (i_34_ == 17) {
					client.anInt8784 = 143636043 * i;
					client.anInt8785 = i_30_ * 381532777;
					client.anInt8748 = 554324810;
					client.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2062, client.gameConnection.aClass449_330, (byte) 15);
					class298_sub36.aClass298_Sub53_Sub2_7396.method3617(Class151.method1644(1934855379) ? 1 : 0, 1961724405);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(1408085039 * client.anInt8906);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(i_32_ + class341.gameSceneBaseX * -1760580017);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(283514611 * class341.gameSceneBaseY + i_33_);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeIntLE(1262526353 * Class379.anInt4099, (byte) 1);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(client.anInt8836 * 392084321);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(i_35_);
					client.gameConnection.method390(class298_sub36, (byte) -59);
					Class375.method4654(i_32_, i_33_, (byte) -97);
				}
				if (58 == i_34_) {
					IComponentDefinition class105 = Class140.method1558(i_33_, i_32_, -156511736);
					if (class105 != null)
						Class422_Sub5.method5643(class105, 1371871585);
				}
				OutcommingPacket class198_37_ = null;
				if (9 == i_34_)
					class198_37_ = OutcommingPacket.aClass198_2024;
				else if (i_34_ == 10)
					class198_37_ = OutcommingPacket.ATTACK_NPC_PACKET;
				else if (11 == i_34_)
					class198_37_ = OutcommingPacket.aClass198_2094;
				else if (12 == i_34_)
					class198_37_ = OutcommingPacket.aClass198_2031;
				else if (i_34_ == 13)
					class198_37_ = OutcommingPacket.NPC_CLICK_4;
				else if (i_34_ == 1003)
					class198_37_ = OutcommingPacket.NPC_EXAMINE_PACKET;
				if (null != class198_37_) {
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_35_));
					if (null != class298_sub29) {
						NPC npc = ((NPC) class298_sub29.anObject7366);
						if (class198_37_ != OutcommingPacket.NPC_EXAMINE_PACKET) {
							Class277.sendWalkPacket(Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -51));
						}
						client.anInt8784 = 143636043 * i;
						client.anInt8785 = i_30_ * 381532777;
						client.anInt8748 = 554324810;
						client.anInt8786 = 0;
						Class298_Sub36 class298_sub36 = Class18.method359(class198_37_, (client.gameConnection.aClass449_330), (byte) 15);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(i_35_);
						class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(1824393579) ? 1 : 0, (byte) 1);
						client.gameConnection.method390(class298_sub36, (byte) -120);
						Class82_Sub21.method938(npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], true, Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -51), -1636676956);
					}
				}
				OutcommingPacket packet = null;
				if (3 == i_34_)
					packet = OutcommingPacket.aClass198_2019;
				else if (4 == i_34_)
					packet = OutcommingPacket.aClass198_2052;
				else if (5 == i_34_)
					packet = OutcommingPacket.aClass198_2033;
				else if (6 == i_34_)
					packet = OutcommingPacket.aClass198_2016;
				else if (1001 == i_34_)
					packet = OutcommingPacket.aClass198_2012;
				else if (1002 == i_34_)
					packet = OutcommingPacket.EXAMINE_OBJECT_PACKET;
				if (packet != null) {
					client.anInt8784 = 143636043 * i;
					client.anInt8785 = i_30_ * 381532777;
					client.anInt8748 = 554324810;
					client.anInt8786 = 0;

					if (OutcommingPacket.EXAMINE_OBJECT_PACKET != packet) {
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
							class336 = Class336_Sub5.method4105(i_32_, i_33_, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
						} else if (Class82_Sub9.method900(-1976050083 * class424.anInt6613, (byte) 28))
							class336 = Class336_Sub5.method4105(i_32_, i_33_, 0, 0, class424, i_4_, 740164949);
						else
							class336 = Class194.method1867(i_32_, i_33_, 0, 0, class424, i_4_, (byte) -22);
						Class277.sendWalkPacket(class336);
					}
					Class298_Sub36 class298_sub36 = Class18.method359(packet, client.gameConnection.aClass449_330, (byte) 94);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte128(Class151.method1644(1030396767) ? 1 : 0, 1999137832);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeIntLE((int) (l >>> 32) & 0x7fffffff, (byte) 1);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE(i_32_ + class341.gameSceneBaseX * -1760580017, 1077977138);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(class341.gameSceneBaseY * 283514611 + i_33_);
					client.gameConnection.method390(class298_sub36, (byte) -13);
					Class93.method1013(i_32_, i_33_, l);
				}
				if (8 == i_34_) {
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_35_));
					if (class298_sub29 != null) {
						NPC npc = ((NPC) class298_sub29.anObject7366);
						Class277.sendWalkPacket(Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -81));
						client.anInt8784 = 143636043 * i;
						client.anInt8785 = i_30_ * 381532777;
						client.anInt8748 = 554324810;
						client.anInt8786 = 0;
						Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.INTERFACE_ON_NPC, (client.gameConnection.aClass449_330), (byte) 103);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class151.method1644(-510062351) ? 1 : 0);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(1262526353 * Class379.anInt4099, -828026807);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE(i_35_, 1218473206);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(client.anInt8836 * 392084321);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE(1408085039 * client.anInt8906, 249731045);
						client.gameConnection.method390(class298_sub36, (byte) -11);
						Class82_Sub21.method938(npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], true, Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -81), 420897053);
					}
				}
				if (25 == i_34_) {
					IComponentDefinition class105 = Class140.method1558(i_33_, i_32_, -156511736);
					if (class105 != null) {
						Class144.method1587((byte) 4);
						IComponentSettings class298_sub38 = client.method2801(class105);
						Class147.method1600(class105, class298_sub38.method3497((byte) -122), (class298_sub38.anInt7410 * -1133219011), 1387537939);
						client.aString8838 = Class88.method977(class105, -447348156);
						if (null == client.aString8838)
							client.aString8838 = "Null";
						client.aString8754 = new StringBuilder().append(class105.aString1228).append(Class285.method2709(16777215, -1652576288)).toString();
					}
				} else {
					if (15 == i_34_) {
						Player player = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_35_]);
						if (null != player) {
							Class277.sendWalkPacket(Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) -81));
							client.anInt8784 = i * 143636043;
							client.anInt8785 = i_30_ * 381532777;
							client.anInt8748 = 554324810;
							client.anInt8786 = 0;
							Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.INTERFACE_ON_PLAYER, (client.gameConnection.aClass449_330), (byte) 92);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(client.anInt8906 * 1408085039, 16711935);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(i_35_, 16711935);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeIntV2(Class379.anInt4099 * 1262526353);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(392084321 * client.anInt8836);
							class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(1486448273) ? 1 : 0, (byte) 1);
							client.gameConnection.method390(class298_sub36, (byte) -120);
							Class82_Sub21.method938((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), true, (Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) -81)), -1518106468);
						}
					}
					if (i_34_ == 60) {
						if (client.playerRights * 1806357379 > 0 && Class434.method5802(838408640))
							Class476.teleport((Class287.myPlayer.plane), class341.gameSceneBaseX * -1760580017 + i_32_, 283514611 * class341.gameSceneBaseY + i_33_, 1886787992);
						else {
							client.anInt8784 = i * 143636043;
							client.anInt8785 = 381532777 * i_30_;
							client.anInt8748 = 277162405;
							client.anInt8786 = 0;
							Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2082, (client.gameConnection.aClass449_330), (byte) 98);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(class341.gameSceneBaseY * 283514611 + i_33_, 16711935);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(-1760580017 * class341.gameSceneBaseX + i_32_);
							client.gameConnection.method390(class298_sub36, (byte) -43);
						}
					}
					if (client.aBoolean8835)
						Class144.method1587((byte) 4);
					if (null != Class236.aClass105_2606 && 0 == -2018194505 * client.anInt8788)
						Tradution.method6054(Class236.aClass105_2606, 1534658392);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.bs(").append(')').toString());
		}
	}

	static final void method4940(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1372893999 * Class360.anInt3871;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qq.aho(").append(')').toString());
		}
	}
}
