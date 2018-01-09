/* Class521_Sub1_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Animable {
	int anInt10545;
	public String displayName;
	public int anInt10547;
	public boolean hidden;
	public byte male = 0;
	public boolean aBool10550;
	public int skullId = 451636825;
	public int headIconId = -719121349;
	String prefixTitle;
	public int anInt10554;
	public int anInt10555;
	public int anInt10556;
	public int faceDirection;
	public PlayerAppearance aClass238_10558;
	public int anInt10559;
	public int anInt10560;
	public Class155 aClass155_10561;
	String postfixTitle;
	public String username;
	public boolean isTransformedNPC;
	public int anInt10565 = 0;
	public int anInt10566;
	public int isNpc;
	public boolean aBool10568;
	public int anInt10569;
	public int anInt10570;
	public boolean aBool10571;
	public int anInt10572;
	public boolean aBool10573;
	public int anInt10574;

	final void method13021() {
		throw new IllegalStateException();
	}

	Class285 method13010(GraphicalRenderer class505) {
		if (null == aClass238_10558 || !method16133(class505, 2048, -231081740))
			return null;
		Class294 class294 = class505.method8450();
		Class294 class294_0_ = method11168();
		Class305 class305 = method11166();
		int i = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null) {
			int i_1_ = ((-2023195771 * ((Player) this).anInt10325) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((Player) this).anInt10325 = (int) ((float) ((((Player) this).anInt10325) * -2023195771) - (float) i_1_ / 10.0F) * -374848179;
		} else
			((Player) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((Player) this).anInt10325)) - (float) ((((Player) this).anInt10325) * -2023195771) / 10.0F));
		class294.method5209(class294_0_);
		class294.method5219(0.0F, (float) (-20 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		Class285 class285 = null;
		((Player) this).aBool10312 = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -110) == 1) {
			Class227 class227 = method15855((byte) -17);
			if (class227.aBool2787 && (-977770149 * aClass238_10558.anInt2928 == -1 || (Class350_Sub1.aClass406_7757.method6828(aClass238_10558.anInt2928 * -977770149, (byte) -104).aBool4912))) {
				Class456 class456 = ((aClass456_10338.method7564(67909937) && aClass456_10338.method7573(-563768008)) ? aClass456_10338 : null);
				Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(343060235) && (!aClass456_Sub3_10337.aBool7891 || class456 == null)) ? aClass456_Sub3_10337 : null);
				MeshRasterizer class528 = (Class116.method1969(class505, i, (-35614997 * ((Player) this).anInt10322), (((Player) this).anInt10323 * -1768311789), (-628205413 * ((Player) this).anInt10363), 1, aClass528Array10372[0], 0, 0, 160, 240, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935));
				if (null != class528) {
					if (aClass275_Sub5Array7965 == null || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
						method13008(aClass528Array10372.length + 1, (byte) -124);
					class285 = Class470.method7824(true, (byte) -56);
					((Player) this).aBool10312 = true;
					class505.RA(false);
					class528.method11282(class294, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
					class505.RA(true);
				}
			}
		}
		if (this == Class84.myPlayer) {
			for (int i_2_ = client.aClass180Array7348.length - 1; i_2_ >= 0; i_2_--) {
				Class180 class180 = client.aClass180Array7348[i_2_];
				if (class180 != null && -1 != 1869984395 * class180.anInt2242) {
					if (-379447335 * class180.anInt2236 == 1) {
						Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (1505135749 * class180.anInt2238))));
						if (null != class282_sub47) {
							NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
							Class385 class385 = (Class385.method6632((class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595), Class84.myPlayer.method11166().aClass385_3595));
							int i_3_ = (int) class385.aFloat4671;
							int i_4_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_3_, (long) i_4_, 1869984395 * class180.anInt2242, 92160000L);
						}
					}
					if (2 == class180.anInt2236 * -379447335) {
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						long l = (long) (class180.anInt2243 * -51612493 - (int) class385.aFloat4671);
						long l_5_ = (long) (class180.anInt2235 * -1074026889 - (int) class385.aFloat4673);
						long l_6_ = (long) (1116475963 * class180.anInt2237 << 9);
						l_6_ *= l_6_;
						method16136(class505, class294, aClass528Array10372[0], l, l_5_, class180.anInt2242 * 1869984395, l_6_);
					}
					if (-379447335 * class180.anInt2236 == 10 && 1505135749 * class180.anInt2238 >= 0 && (1505135749 * class180.anInt2238 < (client.players).length)) {
						Player class521_sub1_sub1_sub2_sub1_7_ = (client.players[1505135749 * class180.anInt2238]);
						if (null != class521_sub1_sub1_sub2_sub1_7_) {
							Class385 class385 = (Class385.method6632(class521_sub1_sub1_sub2_sub1_7_.method11166().aClass385_3595, Class84.myPlayer.method11166().aClass385_3595));
							int i_8_ = (int) class385.aFloat4671;
							int i_9_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_8_, (long) i_9_, class180.anInt2242 * 1869984395, 92160000L);
						}
					}
				}
			}
		}
		class294.method5209(class294_0_);
		class294.method5219(0.0F, (float) (-5 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		if (null == aClass275_Sub5Array7965 || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -87);
		if (class285 == null)
			class285 = Class470.method7824(true, (byte) -33);
		method15799(class505, aClass528Array10372, class294, false, (byte) 79);
		for (int i_10_ = 0; i_10_ < aClass528Array10372.length; i_10_++) {
			if (null != aClass528Array10372[i_10_])
				aClass528Array10372[i_10_].method11282(class294, aClass275_Sub5Array7965[i_10_], (this == Class84.myPlayer ? 1 : 0));
		}
		if (null != ((Player) this).aClass539_10369) {
			Class151 class151 = ((Player) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_11_ = 0; i_11_ < aClass528Array10372.length; i_11_++) {
			if (null != aClass528Array10372[i_11_])
				((Player) this).aBool10312 |= aClass528Array10372[i_11_].i();
			aClass528Array10372[i_11_] = null;
		}
		anInt10349 = 1178121955 * client.anInt7286;
		return class285;
	}

	final boolean method13011() {
		return false;
	}

	public Class200 method12992(GraphicalRenderer class505, byte i) {
		return null;
	}

	public Player(Class206 class206, int i) {
		super(class206, i);
		anInt10554 = 0;
		anInt10555 = -12499273;
		anInt10556 = 0;
		faceDirection = -1435090479;
		aBool10573 = false;
		anInt10559 = 0;
		anInt10560 = 839006951;
		anInt10547 = -146256779;
		anInt10572 = 56029395;
		anInt10574 = -511486063;
		isTransformedNPC = false;
		isNpc = 0;
		anInt10566 = -230903419;
		aBool10568 = false;
		aBool10571 = false;
		hidden = false;
		aBool10550 = false;
		aClass155_10561 = new Class155(16);
	}

	void method12991(GraphicalRenderer class505, int i) {
		if (aClass238_10558 != null && (((Player) this).aBool10370 || method16133(class505, 0, -231081740))) {
			Class294 class294 = class505.method8450();
			class294.method5210(method11166());
			class294.method5219(0.0F, -5.0F, 0.0F);
			method15799(class505, aClass528Array10372, class294, ((Player) this).aBool10370, (byte) -50);
			for (int i_12_ = 0; i_12_ < aClass528Array10372.length; i_12_++)
				aClass528Array10372[i_12_] = null;
		}
	}

	public final boolean method16126(byte i) {
		if (aClass238_10558 == null)
			return false;
		return true;
	}

	void method13023(GraphicalRenderer class505) {
		if (aClass238_10558 != null && (((Player) this).aBool10370 || method16133(class505, 0, -231081740))) {
			Class294 class294 = class505.method8450();
			class294.method5210(method11166());
			class294.method5219(0.0F, -5.0F, 0.0F);
			method15799(class505, aClass528Array10372, class294, ((Player) this).aBool10370, (byte) -26);
			for (int i = 0; i < aClass528Array10372.length; i++)
				aClass528Array10372[i] = null;
		}
	}

	public String method16127(boolean bool, int i) {
		String string = "";
		if (null != ((Player) this).prefixTitle)
			string = ((Player) this).prefixTitle;
		if (bool)
			string = new StringBuilder().append(string).append(username).toString();
		else
			string = new StringBuilder().append(string).append(displayName).toString();
		if (((Player) this).postfixTitle != null)
			string = new StringBuilder().append(string).append(((Player) this).postfixTitle).toString();
		return string;
	}

	public String method16128(boolean bool, int i) {
		if (bool)
			return username;
		return displayName;
	}

	public final void method16129(int i, int i_13_, byte i_14_, int i_15_) {
		if (aClass456_10338.method7564(1696606115) && (aClass456_10338.method7565(-1632742162).anInt5921 * 113839939 == 1)) {
			anIntArray10350 = null;
			aClass456_10338.method7567(-1, (short) 8960);
		}
		for (int i_16_ = 0; i_16_ < aClass161Array10339.length; i_16_++) {
			if (aClass161Array10339[i_16_].anInt2012 * 378836105 != -1) {
				Class525 class525 = (Class96_Sub20.aClass515_9416.method8845(aClass161Array10339[i_16_].anInt2012 * 378836105, (byte) 55));
				if (class525.aBool6968 && class525.anInt6977 * -364555849 != -1 && (Class330.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) -26).anInt5921) * 113839939 == 1) {
					aClass161Array10339[i_16_].aClass456_2014.method7567(-1, (short) 8960);
					aClass161Array10339[i_16_].anInt2012 = 1025302087;
				}
			}
		}
		faceDirection = -1435090479;
		if (i < 0 || i >= client.aClass257_7353.method4424(-1727502065) || i_13_ < 0 || i_13_ >= client.aClass257_7353.method4451(-1374799853))
			method16130(i, i_13_, -1637376735);
		else if (regionBaseX[0] < 0 || (regionBaseX[0] >= client.aClass257_7353.method4424(1713910486)) || regionBaseY[0] < 0 || (regionBaseY[0] >= client.aClass257_7353.method4451(-499497479)))
			method16130(i, i_13_, -1457263225);
		else {
			if (Class249.aClass249_3086.aByte3085 == i_14_)
				Class512.method8762(this, i, i_13_, Class249.aClass249_3086.aByte3085, (byte) -86);
			method16132(i, i_13_, i_14_, (short) 255);
		}
	}

	public void method16130(int i, int i_17_, int i_18_) {
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i;
		regionBaseY[0] = i_17_;
		int i_19_ = method15805(828768449);
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) (256 * i_19_ + 512 * regionBaseX[0]);
		class385.aFloat4673 = (float) (i_19_ * 256 + 512 * regionBaseY[0]);
		method11171(class385);
		class385.method6624();
		if (Class84.myPlayer == this)
			client.aClass257_7353.method4435((byte) 1).method4048(-402586639);
		if (null != ((Player) this).aClass539_10369)
			((Player) this).aClass539_10369.method11505();
	}

	public boolean method15887(int i) {
		return Class58.aClass529_527.aBool7035;
	}

	public final void method16131(int i, int i_20_, byte i_21_) {
		if (aClass456_10338.method7564(-1570330208) && (aClass456_10338.method7565(-1632742162).anInt5921 * 113839939 == 1)) {
			anIntArray10350 = null;
			aClass456_10338.method7567(-1, (short) 8960);
		}
		for (int i_22_ = 0; i_22_ < aClass161Array10339.length; i_22_++) {
			if (aClass161Array10339[i_22_].anInt2012 * 378836105 != -1) {
				Class525 class525 = (Class96_Sub20.aClass515_9416.method8845(aClass161Array10339[i_22_].anInt2012 * 378836105, (byte) -1));
				if (class525.aBool6968 && class525.anInt6977 * -364555849 != -1 && (Class330.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) 34).anInt5921) * 113839939 == 1) {
					aClass161Array10339[i_22_].aClass456_2014.method7567(-1, (short) 8960);
					aClass161Array10339[i_22_].anInt2012 = 1025302087;
				}
			}
		}
		faceDirection = -1435090479;
		if (i < 0 || i >= client.aClass257_7353.method4424(867439000) || i_20_ < 0 || i_20_ >= client.aClass257_7353.method4451(-1029319921))
			method16130(i, i_20_, -1477093785);
		else if (regionBaseX[0] < 0 || (regionBaseX[0] >= client.aClass257_7353.method4424(-186585243)) || regionBaseY[0] < 0 || (regionBaseY[0] >= client.aClass257_7353.method4451(-827756739)))
			method16130(i, i_20_, -1115122773);
		else {
			if (Class249.aClass249_3086.aByte3085 == i_21_)
				Class512.method8762(this, i, i_20_, Class249.aClass249_3086.aByte3085, (byte) -98);
			method16132(i, i_20_, i_21_, (short) 255);
		}
	}

	public int method15805(int i) {
		if (null != aClass238_10558 && -977770149 * aClass238_10558.anInt2928 != -1)
			return ((Class350_Sub1.aClass406_7757.method6828(aClass238_10558.anInt2928 * -977770149, (byte) -115).anInt4858) * 1203434505);
		return super.method15805(828768449);
	}

	int method15808(int i) {
		return ((Player) this).anInt10545 * 1628597657;
	}

	public int method15899(int i) {
		return -1;
	}

	boolean method12983(GraphicalRenderer class505, int i, int i_23_, int i_24_) {
		if (aClass238_10558 == null || !method16133(class505, 131072, -231081740))
			return false;
		Class294 class294 = method11168();
		boolean bool = false;
		for (int i_25_ = 0; i_25_ < aClass528Array10372.length; i_25_++) {
			if (null != aClass528Array10372[i_25_] && aClass528Array10372[i_25_].method11270(i, i_23_, class294, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_26_ = 0; i_26_ < aClass528Array10372.length; i_26_++)
			aClass528Array10372[i_26_] = null;
		return bool;
	}

	public Player(Class206 class206) {
		super(class206);
		anInt10554 = 0;
		anInt10555 = -12499273;
		anInt10556 = 0;
		faceDirection = -1435090479;
		aBool10573 = false;
		anInt10559 = 0;
		anInt10560 = 839006951;
		anInt10547 = -146256779;
		anInt10572 = 56029395;
		anInt10574 = -511486063;
		isTransformedNPC = false;
		isNpc = 0;
		anInt10566 = -230903419;
		aBool10568 = false;
		aBool10571 = false;
		hidden = false;
		aBool10550 = false;
		aClass155_10561 = new Class155(16);
	}

	final void method13013(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_27_, int i_28_, boolean bool, int i_29_) {
		throw new IllegalStateException();
	}

	final void method12984(int i) {
		throw new IllegalStateException();
	}

	public final void method16132(int i, int i_30_, byte i_31_, short i_32_) {
		if (anInt10355 * 1871221471 < regionBaseX.length - 1)
			anInt10355 += -2086688481;
		for (int i_33_ = anInt10355 * 1871221471; i_33_ > 0; i_33_--) {
			regionBaseX[i_33_] = regionBaseX[i_33_ - 1];
			regionBaseY[i_33_] = regionBaseY[i_33_ - 1];
			aByteArray10365[i_33_] = aByteArray10365[i_33_ - 1];
		}
		regionBaseX[0] = i;
		regionBaseY[0] = i_30_;
		aByteArray10365[0] = i_31_;
	}

	boolean method16133(GraphicalRenderer class505, int i, int i_34_) {
		int i_35_ = i;
		Class227 class227 = method15855((byte) -17);
		Class456 class456 = ((aClass456_10338.method7564(-1342840788) && !aClass456_10338.method7573(-509247548)) ? aClass456_10338 : null);
		Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(2138994963) && !aBool10573 && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
		int i_36_ = class227.anInt2786 * -983752529;
		int i_37_ = -209978553 * class227.anInt2829;
		if (0 != i_36_ || 0 != i_37_ || -1949451929 * class227.anInt2824 != 0 || 0 != -373642049 * class227.anInt2827)
			i |= 0x7;
		int i_38_ = aClass19_10359.method578((byte) 2);
		boolean bool = (aByte10352 != 0 && -1809259861 * client.cycles >= anInt10347 * -134703791 && -1809259861 * client.cycles < -444686705 * anInt10348);
		if (bool)
			i |= 0x80000;
		MeshRasterizer class528 = (aClass528Array10372[0] = aClass238_10558.method3998(class505, i, Class96_Sub16.aClass211_9383, Class20.aClass31_204, Class350_Sub1.aClass406_7757, Class119.aClass426_1463, Class330.aClass523_3868, Class158_Sub1.aClass3_8507, class456, class456_sub3, aClass456_Sub2_Sub1Array10354, anIntArray10362, i_38_, true, Class473.aClass526_5605, (short) -9437));
		int i_39_ = Class46.method932(-708293505);
		if (Class263.anInt3273 * -1346844585 < 96 && i_39_ > 50)
			Js5CacheFile.method3359(-1275511493);
		if (Class496.aClass496_5813 != Class90.aClass496_952 && i_39_ < 50) {
			int i_40_;
			for (i_40_ = 50 - i_39_; i_40_ > 1578529437 * client.anInt7173; client.anInt7173 += 731095989)
				Class339.aByteArrayArray3986[1578529437 * client.anInt7173] = new byte[102400];
			while (i_40_ < 1578529437 * client.anInt7173) {
				client.anInt7173 -= 731095989;
				Class339.aByteArrayArray3986[client.anInt7173 * 1578529437] = null;
			}
		} else if (Class496.aClass496_5813 != Class90.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
			client.anInt7173 = 0;
		}
		if (null == class528)
			return false;
		((Player) this).anInt10317 = class528.YA() * -358839357;
		class528.n();
		method15819(class528, 2019976245);
		if (i_36_ != 0 || i_37_ != 0) {
			method15895(i_38_, i_36_, i_37_, -1269540851 * class227.anInt2813, -1319342263 * class227.anInt2790, (byte) 1);
			if (0 != (((Player) this).anInt10322 * -35614997))
				class528.t(((Player) this).anInt10322 * -35614997);
			if (-1768311789 * ((Player) this).anInt10323 != 0)
				class528.EA(-1768311789 * ((Player) this).anInt10323);
			if (0 != (((Player) this).anInt10363 * -628205413))
				class528.ia(0, -628205413 * (((Player) this).anInt10363), 0);
		} else
			method15895(i_38_, method15805(828768449) << 9, method15805(828768449) << 9, 0, 0, (byte) 1);
		if (bool)
			class528.PA(aByte10371, aByte10327, aByte10364, aByte10352 & 0xff);
		if (!aBool10573)
			method15837(class505, class227, i_35_, i_36_, i_37_, i_38_, (byte) 1);
		return true;
	}

	public void sendChat(String string, int i, int i_41_, byte i_42_) {
		method15875(string, i, i_41_, (Class204.method3363(592406309) * (Class58.aClass529_527.anInt7043 * 1698449143)), 1858323003);
	}

	public int method15794(int i) {
		return -(anInt10314 * -1691508299) - 1;
	}

	Class285 method13009(GraphicalRenderer class505) {
		if (null == aClass238_10558 || !method16133(class505, 2048, -231081740))
			return null;
		Class294 class294 = class505.method8450();
		Class294 class294_43_ = method11168();
		Class305 class305 = method11166();
		int i = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null) {
			int i_44_ = ((-2023195771 * ((Player) this).anInt10325) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((Player) this).anInt10325 = (int) ((float) ((((Player) this).anInt10325) * -2023195771) - (float) i_44_ / 10.0F) * -374848179;
		} else
			((Player) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((Player) this).anInt10325)) - (float) ((((Player) this).anInt10325) * -2023195771) / 10.0F));
		class294.method5209(class294_43_);
		class294.method5219(0.0F, (float) (-20 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		Class285 class285 = null;
		((Player) this).aBool10312 = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -42) == 1) {
			Class227 class227 = method15855((byte) -17);
			if (class227.aBool2787 && (-977770149 * aClass238_10558.anInt2928 == -1 || (Class350_Sub1.aClass406_7757.method6828(aClass238_10558.anInt2928 * -977770149, (byte) -47).aBool4912))) {
				Class456 class456 = ((aClass456_10338.method7564(-1628442322) && aClass456_10338.method7573(-305064415)) ? aClass456_10338 : null);
				Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(1443215927) && (!aClass456_Sub3_10337.aBool7891 || class456 == null)) ? aClass456_Sub3_10337 : null);
				MeshRasterizer class528 = (Class116.method1969(class505, i, (-35614997 * ((Player) this).anInt10322), (((Player) this).anInt10323 * -1768311789), (-628205413 * ((Player) this).anInt10363), 1, aClass528Array10372[0], 0, 0, 160, 240, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935));
				if (null != class528) {
					if (aClass275_Sub5Array7965 == null || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
						method13008(aClass528Array10372.length + 1, (byte) -105);
					class285 = Class470.method7824(true, (byte) -34);
					((Player) this).aBool10312 = true;
					class505.RA(false);
					class528.method11282(class294, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
					class505.RA(true);
				}
			}
		}
		if (this == Class84.myPlayer) {
			for (int i_45_ = client.aClass180Array7348.length - 1; i_45_ >= 0; i_45_--) {
				Class180 class180 = client.aClass180Array7348[i_45_];
				if (class180 != null && -1 != 1869984395 * class180.anInt2242) {
					if (-379447335 * class180.anInt2236 == 1) {
						Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (1505135749 * class180.anInt2238))));
						if (null != class282_sub47) {
							NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
							Class385 class385 = (Class385.method6632((class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595), Class84.myPlayer.method11166().aClass385_3595));
							int i_46_ = (int) class385.aFloat4671;
							int i_47_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_46_, (long) i_47_, 1869984395 * class180.anInt2242, 92160000L);
						}
					}
					if (2 == class180.anInt2236 * -379447335) {
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						long l = (long) (class180.anInt2243 * -51612493 - (int) class385.aFloat4671);
						long l_48_ = (long) (class180.anInt2235 * -1074026889 - (int) class385.aFloat4673);
						long l_49_ = (long) (1116475963 * class180.anInt2237 << 9);
						l_49_ *= l_49_;
						method16136(class505, class294, aClass528Array10372[0], l, l_48_, class180.anInt2242 * 1869984395, l_49_);
					}
					if (-379447335 * class180.anInt2236 == 10 && 1505135749 * class180.anInt2238 >= 0 && (1505135749 * class180.anInt2238 < (client.players).length)) {
						Player class521_sub1_sub1_sub2_sub1_50_ = (client.players[1505135749 * class180.anInt2238]);
						if (null != class521_sub1_sub1_sub2_sub1_50_) {
							Class385 class385 = (Class385.method6632(class521_sub1_sub1_sub2_sub1_50_.method11166().aClass385_3595, Class84.myPlayer.method11166().aClass385_3595));
							int i_51_ = (int) class385.aFloat4671;
							int i_52_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_51_, (long) i_52_, class180.anInt2242 * 1869984395, 92160000L);
						}
					}
				}
			}
		}
		class294.method5209(class294_43_);
		class294.method5219(0.0F, (float) (-5 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		if (null == aClass275_Sub5Array7965 || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -105);
		if (class285 == null)
			class285 = Class470.method7824(true, (byte) -44);
		method15799(class505, aClass528Array10372, class294, false, (byte) -1);
		for (int i_53_ = 0; i_53_ < aClass528Array10372.length; i_53_++) {
			if (null != aClass528Array10372[i_53_])
				aClass528Array10372[i_53_].method11282(class294, aClass275_Sub5Array7965[i_53_], (this == Class84.myPlayer ? 1 : 0));
		}
		if (null != ((Player) this).aClass539_10369) {
			Class151 class151 = ((Player) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_54_ = 0; i_54_ < aClass528Array10372.length; i_54_++) {
			if (null != aClass528Array10372[i_54_])
				((Player) this).aBool10312 |= aClass528Array10372[i_54_].i();
			aClass528Array10372[i_54_] = null;
		}
		anInt10349 = 1178121955 * client.anInt7286;
		return class285;
	}

	public final boolean method16135() {
		if (aClass238_10558 == null)
			return false;
		return true;
	}

	Class285 method12989(GraphicalRenderer class505) {
		if (null == aClass238_10558 || !method16133(class505, 2048, -231081740))
			return null;
		Class294 class294 = class505.method8450();
		Class294 class294_55_ = method11168();
		Class305 class305 = method11166();
		int i = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null) {
			int i_56_ = ((-2023195771 * ((Player) this).anInt10325) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((Player) this).anInt10325 = (int) ((float) ((((Player) this).anInt10325) * -2023195771) - (float) i_56_ / 10.0F) * -374848179;
		} else
			((Player) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((Player) this).anInt10325)) - (float) ((((Player) this).anInt10325) * -2023195771) / 10.0F));
		class294.method5209(class294_55_);
		class294.method5219(0.0F, (float) (-20 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		Class285 class285 = null;
		((Player) this).aBool10312 = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -32) == 1) {
			Class227 class227 = method15855((byte) -17);
			if (class227.aBool2787 && (-977770149 * aClass238_10558.anInt2928 == -1 || (Class350_Sub1.aClass406_7757.method6828(aClass238_10558.anInt2928 * -977770149, (byte) -84).aBool4912))) {
				Class456 class456 = ((aClass456_10338.method7564(-1120099750) && aClass456_10338.method7573(871780846)) ? aClass456_10338 : null);
				Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-1403309054) && (!aClass456_Sub3_10337.aBool7891 || class456 == null)) ? aClass456_Sub3_10337 : null);
				MeshRasterizer class528 = (Class116.method1969(class505, i, (-35614997 * ((Player) this).anInt10322), (((Player) this).anInt10323 * -1768311789), (-628205413 * ((Player) this).anInt10363), 1, aClass528Array10372[0], 0, 0, 160, 240, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935));
				if (null != class528) {
					if (aClass275_Sub5Array7965 == null || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
						method13008(aClass528Array10372.length + 1, (byte) -105);
					class285 = Class470.method7824(true, (byte) -125);
					((Player) this).aBool10312 = true;
					class505.RA(false);
					class528.method11282(class294, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
					class505.RA(true);
				}
			}
		}
		if (this == Class84.myPlayer) {
			for (int i_57_ = client.aClass180Array7348.length - 1; i_57_ >= 0; i_57_--) {
				Class180 class180 = client.aClass180Array7348[i_57_];
				if (class180 != null && -1 != 1869984395 * class180.anInt2242) {
					if (-379447335 * class180.anInt2236 == 1) {
						Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (1505135749 * class180.anInt2238))));
						if (null != class282_sub47) {
							NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
							Class385 class385 = (Class385.method6632((class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595), Class84.myPlayer.method11166().aClass385_3595));
							int i_58_ = (int) class385.aFloat4671;
							int i_59_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_58_, (long) i_59_, 1869984395 * class180.anInt2242, 92160000L);
						}
					}
					if (2 == class180.anInt2236 * -379447335) {
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						long l = (long) (class180.anInt2243 * -51612493 - (int) class385.aFloat4671);
						long l_60_ = (long) (class180.anInt2235 * -1074026889 - (int) class385.aFloat4673);
						long l_61_ = (long) (1116475963 * class180.anInt2237 << 9);
						l_61_ *= l_61_;
						method16136(class505, class294, aClass528Array10372[0], l, l_60_, class180.anInt2242 * 1869984395, l_61_);
					}
					if (-379447335 * class180.anInt2236 == 10 && 1505135749 * class180.anInt2238 >= 0 && (1505135749 * class180.anInt2238 < (client.players).length)) {
						Player class521_sub1_sub1_sub2_sub1_62_ = (client.players[1505135749 * class180.anInt2238]);
						if (null != class521_sub1_sub1_sub2_sub1_62_) {
							Class385 class385 = (Class385.method6632(class521_sub1_sub1_sub2_sub1_62_.method11166().aClass385_3595, Class84.myPlayer.method11166().aClass385_3595));
							int i_63_ = (int) class385.aFloat4671;
							int i_64_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_63_, (long) i_64_, class180.anInt2242 * 1869984395, 92160000L);
						}
					}
				}
			}
		}
		class294.method5209(class294_55_);
		class294.method5219(0.0F, (float) (-5 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		if (null == aClass275_Sub5Array7965 || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -61);
		if (class285 == null)
			class285 = Class470.method7824(true, (byte) -77);
		method15799(class505, aClass528Array10372, class294, false, (byte) 1);
		for (int i_65_ = 0; i_65_ < aClass528Array10372.length; i_65_++) {
			if (null != aClass528Array10372[i_65_])
				aClass528Array10372[i_65_].method11282(class294, aClass275_Sub5Array7965[i_65_], (this == Class84.myPlayer ? 1 : 0));
		}
		if (null != ((Player) this).aClass539_10369) {
			Class151 class151 = ((Player) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_66_ = 0; i_66_ < aClass528Array10372.length; i_66_++) {
			if (null != aClass528Array10372[i_66_])
				((Player) this).aBool10312 |= aClass528Array10372[i_66_].i();
			aClass528Array10372[i_66_] = null;
		}
		anInt10349 = 1178121955 * client.anInt7286;
		return class285;
	}

	void method13012(GraphicalRenderer class505) {
		if (aClass238_10558 != null && (((Player) this).aBool10370 || method16133(class505, 0, -231081740))) {
			Class294 class294 = class505.method8450();
			class294.method5210(method11166());
			class294.method5219(0.0F, -5.0F, 0.0F);
			method15799(class505, aClass528Array10372, class294, ((Player) this).aBool10370, (byte) 12);
			for (int i = 0; i < aClass528Array10372.length; i++)
				aClass528Array10372[i] = null;
		}
	}

	public boolean method15871() {
		return Class58.aClass529_527.aBool7035;
	}

	final boolean method13026() {
		return false;
	}

	public int method15804() {
		return -1;
	}

	final void method13016(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_67_, int i_68_, boolean bool) {
		throw new IllegalStateException();
	}

	void method16136(GraphicalRenderer class505, Class294 class294, MeshRasterizer class528, long l, long l_69_, int i, long l_70_) {
		long l_71_ = l * l + l_69_ * l_69_;
		if (l_71_ >= 262144L && l_71_ <= l_70_) {
			int i_72_ = ((int) ((Math.atan2((double) l, (double) l_69_) * 2607.5945876176133) - (double) aClass19_10359.method578((byte) 2)) & 0x3fff);
			MeshRasterizer class528_73_ = Class511.method8752(class505, i_72_, (((Player) this).anInt10322) * -35614997, (((Player) this).anInt10323) * -1768311789, (-628205413 * (((Player) this).anInt10363)), i, -122250887);
			if (null != class528_73_) {
				class505.RA(false);
				class528_73_.method11282(class294, null, 0);
				class505.RA(true);
			}
		}
	}

	int method15867() {
		return ((Player) this).anInt10545 * 1628597657;
	}

	int method15868() {
		return ((Player) this).anInt10545 * 1628597657;
	}

	public Class200 method12993(GraphicalRenderer class505) {
		return null;
	}

	public boolean method15872() {
		return Class58.aClass529_527.aBool7035;
	}

	public boolean method15873() {
		return Class58.aClass529_527.aBool7035;
	}

	public boolean method15814() {
		return Class58.aClass529_527.aBool7035;
	}

	public Class163 method15809() {
		if (null != ((Player) this).aClass163_10334) {
			if (((Class163) (((Player) this).aClass163_10334)).aString2028 == null)
				return null;
			if (0 == -574868913 * client.anInt7416 || 3 == client.anInt7416 * -574868913 || (1 == -574868913 * client.anInt7416 && Class249.method4282(displayName, (byte) 0)))
				return ((Player) this).aClass163_10334;
		}
		return null;
	}

	public Class163 method15876() {
		if (null != ((Player) this).aClass163_10334) {
			if (((Class163) (((Player) this).aClass163_10334)).aString2028 == null)
				return null;
			if (0 == -574868913 * client.anInt7416 || 3 == client.anInt7416 * -574868913 || (1 == -574868913 * client.anInt7416 && Class249.method4282(displayName, (byte) 0)))
				return ((Player) this).aClass163_10334;
		}
		return null;
	}

	public Class163 method15877() {
		if (null != ((Player) this).aClass163_10334) {
			if (((Class163) (((Player) this).aClass163_10334)).aString2028 == null)
				return null;
			if (0 == -574868913 * client.anInt7416 || 3 == client.anInt7416 * -574868913 || (1 == -574868913 * client.anInt7416 && Class249.method4282(displayName, (byte) 0)))
				return ((Player) this).aClass163_10334;
		}
		return null;
	}

	boolean method13020(GraphicalRenderer class505, int i, int i_74_) {
		if (aClass238_10558 == null || !method16133(class505, 131072, -231081740))
			return false;
		Class294 class294 = method11168();
		boolean bool = false;
		for (int i_75_ = 0; i_75_ < aClass528Array10372.length; i_75_++) {
			if (null != aClass528Array10372[i_75_] && aClass528Array10372[i_75_].method11270(i, i_74_, class294, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_76_ = 0; i_76_ < aClass528Array10372.length; i_76_++)
			aClass528Array10372[i_76_] = null;
		return bool;
	}

	public Class200 method13019(GraphicalRenderer class505) {
		return null;
	}

	public Class200 method13018(GraphicalRenderer class505) {
		return null;
	}

	public final void decodeAppearance(RsByteBuffer buffer, int i) {
		buffer.index = 0;
		int flag = buffer.readUnsignedByte();
		male = (byte) (flag & 0x1);
		boolean bool = isTransformedNPC;
		isTransformedNPC = 0 != (flag & 0x2);
		boolean showingTotalLevel = (flag & 0x4) != 0;
		int i_79_ = super.method15805(828768449);
		method15836(1 + (flag >> 3 & 0x7), (byte) -78);
		boolean prefixTitle = (flag & 0x40) != 0;
		boolean postfixTitlle = (flag & 0x80) != 0;
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 += (float) (method15805(828768449) - i_79_ << 8);
		class385.aFloat4673 += (float) (method15805(828768449) - i_79_ << 8);
		method11171(class385);
		class385.method6624();
		if (prefixTitle)
			((Player) this).prefixTitle = buffer.readGJString(-441737398);
		else
			((Player) this).prefixTitle = null;
		if (postfixTitlle)
			((Player) this).postfixTitle = buffer.readGJString(-1660604826);
		else
			((Player) this).postfixTitle = null;
		skullId = buffer.readByte((short) -6126) * -451636825;
		headIconId = buffer.readByte((short) -7122) * 719121349;
		hidden = buffer.readByte((short) -24079) == 1;
		if (Class496.aClass496_5813 == Class90.aClass496_952 && client.rights * -644057819 >= 2)
			hidden = false;
		int effectData = -1;
		anInt10559 = 0;
		int[] is = new int[Class473.aClass526_5605.equipmentSlots.length];
		MeshModifier[] itemEffects = new MeshModifier[Class473.aClass526_5605.equipmentSlots.length];
		ItemDefinitions[] itemDefinitions = new ItemDefinitions[Class473.aClass526_5605.equipmentSlots.length];
		for (int equipSlot = 0; equipSlot < Class473.aClass526_5605.equipmentSlots.length; equipSlot++) {
			if (1 != Class473.aClass526_5605.equipmentSlots[equipSlot]) {
				int firstByte = buffer.readUnsignedByte();
				if (0 == firstByte)
					is[equipSlot] = 0;
				else {
					int secondByte = buffer.readUnsignedByte();
					int itemId = (firstByte << 8) + secondByte;
					if (0 == equipSlot && itemId == 65535) {
						effectData = buffer.readBigSmart(1950511572);
						anInt10559 = (buffer.readUnsignedByte() * -2039578069);
						break;
					}
					if (itemId >= 16384) {
						itemId -= 16384;
						is[equipSlot] = itemId | 0x40000000;
						itemDefinitions[equipSlot] = Class119.aClass426_1463.getItemDefinitions(itemId, 233758785);
						int i_87_ = itemDefinitions[equipSlot].team * -1412708647;
						if (0 != i_87_)
							anInt10559 = -2039578069 * i_87_;
					} else
						is[equipSlot] = itemId - 256 | ~0x7fffffff;
				}
			}
		}
		if (effectData == -1) {
			int i_88_ = buffer.readUnsignedShort();
			int i_89_ = 0;
			for (int equipSlot = 0; equipSlot < Class473.aClass526_5605.equipmentSlots.length; equipSlot++) {
				if (Class473.aClass526_5605.equipmentSlots[equipSlot] == 0) {
					if ((i_88_ & 1 << i_89_) != 0)
						itemEffects[equipSlot] = Class506.decodeItemEffects(itemDefinitions[equipSlot], buffer, 1637937706);
					i_89_++;
				}
			}
		}
		int[] colors = new int[10];
		for (int colorIndex = 0; colorIndex < 10; colorIndex++) {
			int color = buffer.readUnsignedByte();
			if (Class366.skinColors.length < 1 || color < 0 || (color >= Class366.skinColors[colorIndex][0].length))
				color = 0;
			colors[colorIndex] = color;
		}
		((Player) this).anInt10545 = buffer.readUnsignedShort() * -900819287;
		username = buffer.readString(1238215024);
		displayName = username;
		if (this == Class84.myPlayer)
			RuntimeException_Sub3.aString10458 = username;
		anInt10565 = buffer.readUnsignedByte() * 1567314241;
		if (showingTotalLevel) {
			anInt10556 = buffer.readUnsignedShort() * 2136175047;
			if (65535 == -1231486985 * anInt10556)
				anInt10556 = -2136175047;
			anInt10554 = 703278993 * anInt10565;
			anInt10555 = -12499273;
		} else {
			anInt10556 = 0;
			anInt10554 = buffer.readUnsignedByte() * -1654721327;
			anInt10555 = buffer.readUnsignedByte() * 12499273;
			if (255 == anInt10555 * 1519880441)
				anInt10555 = -12499273;
		}
		int i_94_ = 1304574447 * isNpc;
		isNpc = buffer.readUnsignedByte() * -519957233;
		if (isNpc * 1304574447 != 0) {
			int i_95_ = 921552681 * anInt10560;
			int i_96_ = -1465525213 * anInt10547;
			int i_97_ = anInt10572 * -1104078683;
			int i_98_ = anInt10574 * -1965967729;
			int i_99_ = anInt10566 * -737825357;
			anInt10560 = buffer.readUnsignedShort() * -839006951;
			anInt10547 = buffer.readUnsignedShort() * 146256779;
			anInt10572 = buffer.readUnsignedShort() * -56029395;
			anInt10574 = buffer.readUnsignedShort() * 511486063;
			anInt10566 = buffer.readUnsignedByte() * -1702049413;
			if (isTransformedNPC != bool || isNpc * 1304574447 != i_94_ || i_95_ != anInt10560 * 921552681 || -1465525213 * anInt10547 != i_96_ || anInt10572 * -1104078683 != i_97_ || i_98_ != anInt10574 * -1965967729 || i_99_ != -737825357 * anInt10566)
				IncomingPacket.method6379(this, -1506620602);
		} else
			Class149_Sub2.method14609(this, -1660310904);
		if (aClass238_10558 == null)
			aClass238_10558 = new PlayerAppearance();
		int i_100_ = -977770149 * aClass238_10558.anInt2928;
		int[] is_101_ = aClass238_10558.colors;
		aClass238_10558.method3992(method15808(635765286), is, itemEffects, colors, 1 == male, effectData, 1600934567);
		if (effectData != i_100_) {
			class385 = Class385.method6623(method11166().aClass385_3595);
			class385.aFloat4671 = (float) ((regionBaseX[0] << 9) + (method15805(828768449) << 8));
			class385.aFloat4673 = (float) ((regionBaseY[0] << 9) + (method15805(828768449) << 8));
			method11171(class385);
			class385.method6624();
		}
		if (client.anInt7315 * 1595512269 == -1691508299 * anInt10314 && is_101_ != null) {
			for (int i_102_ = 0; i_102_ < colors.length; i_102_++) {
				if (colors[i_102_] != is_101_[i_102_]) {
					Class119.aClass426_1463.method7151((byte) -16);
					break;
				}
			}
		}
		if (((Player) this).aClass539_10369 != null)
			((Player) this).aClass539_10369.method11505();
		if (aClass456_Sub3_10337.method7564(2061974418) && aClass456_Sub3_10337.aBool7891) {
			Class227 class227 = method15855((byte) -17);
			if (!class227.method3810(aClass456_Sub3_10337.method7597(-859961134), -1546960795)) {
				aClass456_Sub3_10337.method7567(-1, (short) 8960);
				aClass456_Sub3_10337.aBool7891 = false;
			}
		}
	}

	public final void method16138(int i, int i_103_, byte i_104_) {
		if (anInt10355 * 1871221471 < regionBaseX.length - 1)
			anInt10355 += -2086688481;
		for (int i_105_ = anInt10355 * 1871221471; i_105_ > 0; i_105_--) {
			regionBaseX[i_105_] = regionBaseX[i_105_ - 1];
			regionBaseY[i_105_] = regionBaseY[i_105_ - 1];
			aByteArray10365[i_105_] = aByteArray10365[i_105_ - 1];
		}
		regionBaseX[0] = i;
		regionBaseY[0] = i_103_;
		aByteArray10365[0] = i_104_;
	}

	public Class163 method15852() {
		if (null != ((Player) this).aClass163_10334) {
			if (((Class163) (((Player) this).aClass163_10334)).aString2028 == null)
				return null;
			if (0 == -574868913 * client.anInt7416 || 3 == client.anInt7416 * -574868913 || (1 == -574868913 * client.anInt7416 && Class249.method4282(displayName, (byte) 0)))
				return ((Player) this).aClass163_10334;
		}
		return null;
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public String method16139(boolean bool) {
		if (bool)
			return username;
		return displayName;
	}

	void method16140(GraphicalRenderer class505, Class294 class294, MeshRasterizer class528, long l, long l_106_, int i, long l_107_) {
		long l_108_ = l * l + l_106_ * l_106_;
		if (l_108_ >= 262144L && l_108_ <= l_107_) {
			int i_109_ = ((int) ((Math.atan2((double) l, (double) l_106_) * 2607.5945876176133) - (double) aClass19_10359.method578((byte) 2)) & 0x3fff);
			MeshRasterizer class528_110_ = Class511.method8752(class505, i_109_, (((Player) this).anInt10322) * -35614997, (((Player) this).anInt10323) * -1768311789, (-628205413 * (((Player) this).anInt10363)), i, -122250887);
			if (null != class528_110_) {
				class505.RA(false);
				class528_110_.method11282(class294, null, 0);
				class505.RA(true);
			}
		}
	}

	void method16141(GraphicalRenderer class505, Class294 class294, MeshRasterizer class528, long l, long l_111_, int i, long l_112_) {
		long l_113_ = l * l + l_111_ * l_111_;
		if (l_113_ >= 262144L && l_113_ <= l_112_) {
			int i_114_ = ((int) ((Math.atan2((double) l, (double) l_111_) * 2607.5945876176133) - (double) aClass19_10359.method578((byte) 2)) & 0x3fff);
			MeshRasterizer class528_115_ = Class511.method8752(class505, i_114_, (((Player) this).anInt10322) * -35614997, (((Player) this).anInt10323) * -1768311789, (-628205413 * (((Player) this).anInt10363)), i, -122250887);
			if (null != class528_115_) {
				class505.RA(false);
				class528_115_.method11282(class294, null, 0);
				class505.RA(true);
			}
		}
	}

	boolean method16142(GraphicalRenderer class505, int i) {
		int i_116_ = i;
		Class227 class227 = method15855((byte) -17);
		Class456 class456 = ((aClass456_10338.method7564(1572434818) && !aClass456_10338.method7573(-510181887)) ? aClass456_10338 : null);
		Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(549134737) && !aBool10573 && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
		int i_117_ = class227.anInt2786 * -983752529;
		int i_118_ = -209978553 * class227.anInt2829;
		if (0 != i_117_ || 0 != i_118_ || -1949451929 * class227.anInt2824 != 0 || 0 != -373642049 * class227.anInt2827)
			i |= 0x7;
		int i_119_ = aClass19_10359.method578((byte) 2);
		boolean bool = (aByte10352 != 0 && -1809259861 * client.cycles >= anInt10347 * -134703791 && -1809259861 * client.cycles < -444686705 * anInt10348);
		if (bool)
			i |= 0x80000;
		MeshRasterizer class528 = (aClass528Array10372[0] = aClass238_10558.method3998(class505, i, Class96_Sub16.aClass211_9383, Class20.aClass31_204, Class350_Sub1.aClass406_7757, Class119.aClass426_1463, Class330.aClass523_3868, Class158_Sub1.aClass3_8507, class456, class456_sub3, aClass456_Sub2_Sub1Array10354, anIntArray10362, i_119_, true, Class473.aClass526_5605, (short) -8674));
		int i_120_ = Class46.method932(-1668934621);
		if (Class263.anInt3273 * -1346844585 < 96 && i_120_ > 50)
			Js5CacheFile.method3359(-1275511493);
		if (Class496.aClass496_5813 != Class90.aClass496_952 && i_120_ < 50) {
			int i_121_;
			for (i_121_ = 50 - i_120_; i_121_ > 1578529437 * client.anInt7173; client.anInt7173 += 731095989)
				Class339.aByteArrayArray3986[1578529437 * client.anInt7173] = new byte[102400];
			while (i_121_ < 1578529437 * client.anInt7173) {
				client.anInt7173 -= 731095989;
				Class339.aByteArrayArray3986[client.anInt7173 * 1578529437] = null;
			}
		} else if (Class496.aClass496_5813 != Class90.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
			client.anInt7173 = 0;
		}
		if (null == class528)
			return false;
		((Player) this).anInt10317 = class528.YA() * -358839357;
		class528.n();
		method15819(class528, 2019976245);
		if (i_117_ != 0 || i_118_ != 0) {
			method15895(i_119_, i_117_, i_118_, -1269540851 * class227.anInt2813, -1319342263 * class227.anInt2790, (byte) 1);
			if (0 != (((Player) this).anInt10322 * -35614997))
				class528.t(((Player) this).anInt10322 * -35614997);
			if (-1768311789 * ((Player) this).anInt10323 != 0)
				class528.EA(-1768311789 * ((Player) this).anInt10323);
			if (0 != (((Player) this).anInt10363 * -628205413))
				class528.ia(0, -628205413 * (((Player) this).anInt10363), 0);
		} else
			method15895(i_119_, method15805(828768449) << 9, method15805(828768449) << 9, 0, 0, (byte) 1);
		if (bool)
			class528.PA(aByte10371, aByte10327, aByte10364, aByte10352 & 0xff);
		if (!aBool10573)
			method15837(class505, class227, i_116_, i_117_, i_118_, i_119_, (byte) 1);
		return true;
	}

	boolean method16143(GraphicalRenderer class505, int i) {
		int i_122_ = i;
		Class227 class227 = method15855((byte) -17);
		Class456 class456 = ((aClass456_10338.method7564(882176487) && !aClass456_10338.method7573(-506806837)) ? aClass456_10338 : null);
		Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-1796907289) && !aBool10573 && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
		int i_123_ = class227.anInt2786 * -983752529;
		int i_124_ = -209978553 * class227.anInt2829;
		if (0 != i_123_ || 0 != i_124_ || -1949451929 * class227.anInt2824 != 0 || 0 != -373642049 * class227.anInt2827)
			i |= 0x7;
		int i_125_ = aClass19_10359.method578((byte) 2);
		boolean bool = (aByte10352 != 0 && -1809259861 * client.cycles >= anInt10347 * -134703791 && -1809259861 * client.cycles < -444686705 * anInt10348);
		if (bool)
			i |= 0x80000;
		MeshRasterizer class528 = (aClass528Array10372[0] = aClass238_10558.method3998(class505, i, Class96_Sub16.aClass211_9383, Class20.aClass31_204, Class350_Sub1.aClass406_7757, Class119.aClass426_1463, Class330.aClass523_3868, Class158_Sub1.aClass3_8507, class456, class456_sub3, aClass456_Sub2_Sub1Array10354, anIntArray10362, i_125_, true, Class473.aClass526_5605, (short) -4743));
		int i_126_ = Class46.method932(-1966796916);
		if (Class263.anInt3273 * -1346844585 < 96 && i_126_ > 50)
			Js5CacheFile.method3359(-1275511493);
		if (Class496.aClass496_5813 != Class90.aClass496_952 && i_126_ < 50) {
			int i_127_;
			for (i_127_ = 50 - i_126_; i_127_ > 1578529437 * client.anInt7173; client.anInt7173 += 731095989)
				Class339.aByteArrayArray3986[1578529437 * client.anInt7173] = new byte[102400];
			while (i_127_ < 1578529437 * client.anInt7173) {
				client.anInt7173 -= 731095989;
				Class339.aByteArrayArray3986[client.anInt7173 * 1578529437] = null;
			}
		} else if (Class496.aClass496_5813 != Class90.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
			client.anInt7173 = 0;
		}
		if (null == class528)
			return false;
		((Player) this).anInt10317 = class528.YA() * -358839357;
		class528.n();
		method15819(class528, 2019976245);
		if (i_123_ != 0 || i_124_ != 0) {
			method15895(i_125_, i_123_, i_124_, -1269540851 * class227.anInt2813, -1319342263 * class227.anInt2790, (byte) 1);
			if (0 != (((Player) this).anInt10322 * -35614997))
				class528.t(((Player) this).anInt10322 * -35614997);
			if (-1768311789 * ((Player) this).anInt10323 != 0)
				class528.EA(-1768311789 * ((Player) this).anInt10323);
			if (0 != (((Player) this).anInt10363 * -628205413))
				class528.ia(0, -628205413 * (((Player) this).anInt10363), 0);
		} else
			method15895(i_125_, method15805(828768449) << 9, method15805(828768449) << 9, 0, 0, (byte) 1);
		if (bool)
			class528.PA(aByte10371, aByte10327, aByte10364, aByte10352 & 0xff);
		if (!aBool10573)
			method15837(class505, class227, i_122_, i_123_, i_124_, i_125_, (byte) 1);
		return true;
	}

	public String method16144(boolean bool) {
		if (bool)
			return username;
		return displayName;
	}

	public int method15806() {
		return -(anInt10314 * -1691508299) - 1;
	}

	public final void method16145(int i, int i_128_, byte i_129_) {
		if (aClass456_10338.method7564(-125657992) && (aClass456_10338.method7565(-1632742162).anInt5921 * 113839939 == 1)) {
			anIntArray10350 = null;
			aClass456_10338.method7567(-1, (short) 8960);
		}
		for (int i_130_ = 0; i_130_ < aClass161Array10339.length; i_130_++) {
			if (aClass161Array10339[i_130_].anInt2012 * 378836105 != -1) {
				Class525 class525 = (Class96_Sub20.aClass515_9416.method8845(aClass161Array10339[i_130_].anInt2012 * 378836105, (byte) 90));
				if (class525.aBool6968 && class525.anInt6977 * -364555849 != -1 && (Class330.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) 14).anInt5921) * 113839939 == 1) {
					aClass161Array10339[i_130_].aClass456_2014.method7567(-1, (short) 8960);
					aClass161Array10339[i_130_].anInt2012 = 1025302087;
				}
			}
		}
		faceDirection = -1435090479;
		if (i < 0 || i >= client.aClass257_7353.method4424(702601001) || i_128_ < 0 || i_128_ >= client.aClass257_7353.method4451(-953474424))
			method16130(i, i_128_, -568584625);
		else if (regionBaseX[0] < 0 || (regionBaseX[0] >= client.aClass257_7353.method4424(-1187672790)) || regionBaseY[0] < 0 || (regionBaseY[0] >= client.aClass257_7353.method4451(-369879048)))
			method16130(i, i_128_, -490270639);
		else {
			if (Class249.aClass249_3086.aByte3085 == i_129_)
				Class512.method8762(this, i, i_128_, Class249.aClass249_3086.aByte3085, (byte) 5);
			method16132(i, i_128_, i_129_, (short) 255);
		}
	}

	void method16146(GraphicalRenderer class505, Class294 class294, MeshRasterizer class528, long l, long l_131_, int i, long l_132_) {
		long l_133_ = l * l + l_131_ * l_131_;
		if (l_133_ >= 262144L && l_133_ <= l_132_) {
			int i_134_ = ((int) ((Math.atan2((double) l, (double) l_131_) * 2607.5945876176133) - (double) aClass19_10359.method578((byte) 2)) & 0x3fff);
			MeshRasterizer class528_135_ = Class511.method8752(class505, i_134_, (((Player) this).anInt10322) * -35614997, (((Player) this).anInt10323) * -1768311789, (-628205413 * (((Player) this).anInt10363)), i, -122250887);
			if (null != class528_135_) {
				class505.RA(false);
				class528_135_.method11282(class294, null, 0);
				class505.RA(true);
			}
		}
	}

	public void method16147(int i, int i_136_) {
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i;
		regionBaseY[0] = i_136_;
		int i_137_ = method15805(828768449);
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) (256 * i_137_ + 512 * regionBaseX[0]);
		class385.aFloat4673 = (float) (i_137_ * 256 + 512 * regionBaseY[0]);
		method11171(class385);
		class385.method6624();
		if (Class84.myPlayer == this)
			client.aClass257_7353.method4435((byte) 1).method4048(-632984749);
		if (null != ((Player) this).aClass539_10369)
			((Player) this).aClass539_10369.method11505();
	}

	public void method16148(int i, int i_138_) {
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i;
		regionBaseY[0] = i_138_;
		int i_139_ = method15805(828768449);
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) (256 * i_139_ + 512 * regionBaseX[0]);
		class385.aFloat4673 = (float) (i_139_ * 256 + 512 * regionBaseY[0]);
		method11171(class385);
		class385.method6624();
		if (Class84.myPlayer == this)
			client.aClass257_7353.method4435((byte) 1).method4048(-651113834);
		if (null != ((Player) this).aClass539_10369)
			((Player) this).aClass539_10369.method11505();
	}

	public void method16149(int i, int i_140_) {
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i;
		regionBaseY[0] = i_140_;
		int i_141_ = method15805(828768449);
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) (256 * i_141_ + 512 * regionBaseX[0]);
		class385.aFloat4673 = (float) (i_141_ * 256 + 512 * regionBaseY[0]);
		method11171(class385);
		class385.method6624();
		if (Class84.myPlayer == this)
			client.aClass257_7353.method4435((byte) 1).method4048(-882314050);
		if (null != ((Player) this).aClass539_10369)
			((Player) this).aClass539_10369.method11505();
	}

	public void method16150(int i, int i_142_) {
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i;
		regionBaseY[0] = i_142_;
		int i_143_ = method15805(828768449);
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) (256 * i_143_ + 512 * regionBaseX[0]);
		class385.aFloat4673 = (float) (i_143_ * 256 + 512 * regionBaseY[0]);
		method11171(class385);
		class385.method6624();
		if (Class84.myPlayer == this)
			client.aClass257_7353.method4435((byte) 1).method4048(35667555);
		if (null != ((Player) this).aClass539_10369)
			((Player) this).aClass539_10369.method11505();
	}

	public void method16151(int i, int i_144_) {
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i;
		regionBaseY[0] = i_144_;
		int i_145_ = method15805(828768449);
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) (256 * i_145_ + 512 * regionBaseX[0]);
		class385.aFloat4673 = (float) (i_145_ * 256 + 512 * regionBaseY[0]);
		method11171(class385);
		class385.method6624();
		if (Class84.myPlayer == this)
			client.aClass257_7353.method4435((byte) 1).method4048(786486900);
		if (null != ((Player) this).aClass539_10369)
			((Player) this).aClass539_10369.method11505();
	}

	final boolean method12985(int i) {
		return false;
	}

	public int method15898() {
		return -1;
	}

	public final boolean method16152() {
		if (aClass238_10558 == null)
			return false;
		return true;
	}

	public final boolean method16153() {
		if (aClass238_10558 == null)
			return false;
		return true;
	}

	public int method15897() {
		return -1;
	}

	public int method15892() {
		return -(anInt10314 * -1691508299) - 1;
	}

	Class285 method12990(GraphicalRenderer class505, int i) {
		if (null == aClass238_10558 || !method16133(class505, 2048, -231081740))
			return null;
		Class294 class294 = class505.method8450();
		Class294 class294_146_ = method11168();
		Class305 class305 = method11166();
		int i_147_ = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null) {
			int i_148_ = ((-2023195771 * ((Player) this).anInt10325) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((Player) this).anInt10325 = (int) ((float) ((((Player) this).anInt10325) * -2023195771) - (float) i_148_ / 10.0F) * -374848179;
		} else
			((Player) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((Player) this).anInt10325)) - (float) ((((Player) this).anInt10325) * -2023195771) / 10.0F));
		class294.method5209(class294_146_);
		class294.method5219(0.0F, (float) (-20 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		Class285 class285 = null;
		((Player) this).aBool10312 = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -35) == 1) {
			Class227 class227 = method15855((byte) -17);
			if (class227.aBool2787 && (-977770149 * aClass238_10558.anInt2928 == -1 || (Class350_Sub1.aClass406_7757.method6828(aClass238_10558.anInt2928 * -977770149, (byte) 90).aBool4912))) {
				Class456 class456 = ((aClass456_10338.method7564(546395340) && aClass456_10338.method7573(-1045482299)) ? aClass456_10338 : null);
				Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-32112903) && (!aClass456_Sub3_10337.aBool7891 || class456 == null)) ? aClass456_Sub3_10337 : null);
				MeshRasterizer class528 = (Class116.method1969(class505, i_147_, (-35614997 * ((Player) this).anInt10322), (((Player) this).anInt10323 * -1768311789), (-628205413 * ((Player) this).anInt10363), 1, aClass528Array10372[0], 0, 0, 160, 240, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935));
				if (null != class528) {
					if (aClass275_Sub5Array7965 == null || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
						method13008(aClass528Array10372.length + 1, (byte) -9);
					class285 = Class470.method7824(true, (byte) -88);
					((Player) this).aBool10312 = true;
					class505.RA(false);
					class528.method11282(class294, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
					class505.RA(true);
				}
			}
		}
		if (this == Class84.myPlayer) {
			for (int i_149_ = client.aClass180Array7348.length - 1; i_149_ >= 0; i_149_--) {
				Class180 class180 = client.aClass180Array7348[i_149_];
				if (class180 != null && -1 != 1869984395 * class180.anInt2242) {
					if (-379447335 * class180.anInt2236 == 1) {
						Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (1505135749 * class180.anInt2238))));
						if (null != class282_sub47) {
							NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
							Class385 class385 = (Class385.method6632((class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595), Class84.myPlayer.method11166().aClass385_3595));
							int i_150_ = (int) class385.aFloat4671;
							int i_151_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_150_, (long) i_151_, 1869984395 * class180.anInt2242, 92160000L);
						}
					}
					if (2 == class180.anInt2236 * -379447335) {
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						long l = (long) (class180.anInt2243 * -51612493 - (int) class385.aFloat4671);
						long l_152_ = (long) (class180.anInt2235 * -1074026889 - (int) class385.aFloat4673);
						long l_153_ = (long) (1116475963 * class180.anInt2237 << 9);
						l_153_ *= l_153_;
						method16136(class505, class294, aClass528Array10372[0], l, l_152_, class180.anInt2242 * 1869984395, l_153_);
					}
					if (-379447335 * class180.anInt2236 == 10 && 1505135749 * class180.anInt2238 >= 0 && (1505135749 * class180.anInt2238 < (client.players).length)) {
						Player class521_sub1_sub1_sub2_sub1_154_ = (client.players[1505135749 * class180.anInt2238]);
						if (null != class521_sub1_sub1_sub2_sub1_154_) {
							Class385 class385 = (Class385.method6632(class521_sub1_sub1_sub2_sub1_154_.method11166().aClass385_3595, Class84.myPlayer.method11166().aClass385_3595));
							int i_155_ = (int) class385.aFloat4671;
							int i_156_ = (int) class385.aFloat4673;
							method16136(class505, class294, aClass528Array10372[0], (long) i_155_, (long) i_156_, class180.anInt2242 * 1869984395, 92160000L);
						}
					}
				}
			}
		}
		class294.method5209(class294_146_);
		class294.method5219(0.0F, (float) (-5 - (-2023195771 * ((Player) this).anInt10325)), 0.0F);
		if (null == aClass275_Sub5Array7965 || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -92);
		if (class285 == null)
			class285 = Class470.method7824(true, (byte) -43);
		method15799(class505, aClass528Array10372, class294, false, (byte) -20);
		for (int i_157_ = 0; i_157_ < aClass528Array10372.length; i_157_++) {
			if (null != aClass528Array10372[i_157_])
				aClass528Array10372[i_157_].method11282(class294, aClass275_Sub5Array7965[i_157_], (this == Class84.myPlayer ? 1 : 0));
		}
		if (null != ((Player) this).aClass539_10369) {
			Class151 class151 = ((Player) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_158_ = 0; i_158_ < aClass528Array10372.length; i_158_++) {
			if (null != aClass528Array10372[i_158_])
				((Player) this).aBool10312 |= aClass528Array10372[i_158_].i();
			aClass528Array10372[i_158_] = null;
		}
		anInt10349 = 1178121955 * client.anInt7286;
		return class285;
	}

	public void method16154(String string, int i, int i_159_) {
		method15875(string, i, i_159_, (Class204.method3363(1378909282) * (Class58.aClass529_527.anInt7043 * 1698449143)), 66229583);
	}

	public void method16155(String string, int i, int i_160_) {
		method15875(string, i, i_160_, (Class204.method3363(1913262990) * (Class58.aClass529_527.anInt7043 * 1698449143)), 1909582399);
	}

	public int method15853() {
		if (null != aClass238_10558 && -977770149 * aClass238_10558.anInt2928 != -1)
			return ((Class350_Sub1.aClass406_7757.method6828(aClass238_10558.anInt2928 * -977770149, (byte) 2).anInt4858) * 1203434505);
		return super.method15805(828768449);
	}

	public Class163 method15811(int i) {
		if (null != ((Player) this).aClass163_10334) {
			if (((Class163) (((Player) this).aClass163_10334)).aString2028 == null)
				return null;
			if (0 == -574868913 * client.anInt7416 || 3 == client.anInt7416 * -574868913 || (1 == -574868913 * client.anInt7416 && Class249.method4282(displayName, (byte) 0)))
				return ((Player) this).aClass163_10334;
		}
		return null;
	}

	public int method15874() {
		return -(anInt10314 * -1691508299) - 1;
	}
}
