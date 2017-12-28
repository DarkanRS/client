/* Class521_Sub1_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPC extends Animable {
	public int anInt10575;
	public int anInt10576;
	public int anInt10577;
	public int anInt10578 = -119874337;
	public Class153 aClass153_10579;
	public Class409 aClass409_10580;
	public Class417 aClass417_10581;
	public int anInt10582;
	public int anInt10583;
	public String aString10584;
	int[] anIntArray10585;
	int[] anIntArray10586;
	int anInt10587;
	int anInt10588;
	int anInt10589;
	int anInt10590;

	int method12996(int i) {
		if (aClass409_10580 == null)
			return 0;
		return aClass409_10580.anInt4913 * -1894935519;
	}

	public NPC(Class206 class206, int i) {
		super(class206, i);
		anInt10577 = 1084745433;
		anInt10583 = -371839573;
		anInt10576 = -1761803989;
		anInt10575 = 1914841399;
		aClass153_10579 = new Class153(32);
		((NPC) this).anIntArray10585 = new int[6];
		((NPC) this).anIntArray10586 = new int[6];
		method16156((byte) 15);
	}

	void method16156(byte i) {
		((NPC) this).anInt10587 = (32 + (int) (Math.random() * 4.0)) * 1113755543;
		((NPC) this).anInt10588 = (3 + (int) (Math.random() * 2.0)) * -1912819721;
		((NPC) this).anInt10589 = (16 + (int) (Math.random() * 3.0)) * -62352365;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-255909442) == 1)
			((NPC) this).anInt10590 = (int) (Math.random() * 6.0) * -331447001;
		else
			((NPC) this).anInt10590 = (int) (Math.random() * 12.0) * -331447001;
	}

	public void method16157(Class409 class409) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) -44))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	public Class200 method12992(Class505 class505, byte i) {
		return null;
	}

	public Class200 method13018(Class505 class505) {
		return null;
	}

	boolean method16158(Class505 class505, int i, byte i_0_) {
		int i_1_ = i;
		Class227 class227 = method15855((byte) -17);
		Class456 class456 = ((aClass456_10338.method7564(-82148188) && !aClass456_10338.method7573(-1119795377)) ? aClass456_10338 : null);
		Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-931118944) && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
		int i_2_ = -983752529 * class227.anInt2786;
		int i_3_ = -209978553 * class227.anInt2829;
		if (0 != i_2_ || i_3_ != 0 || 0 != class227.anInt2824 * -1949451929 || 0 != -373642049 * class227.anInt2827)
			i |= 0x7;
		boolean bool = (0 != aByte10352 && -1809259861 * client.cycles >= -134703791 * anInt10347 && -1809259861 * client.cycles < -444686705 * anInt10348);
		if (bool)
			i |= 0x80000;
		int i_4_ = aClass19_10359.method578((byte) 2);
		Class528 class528 = (aClass528Array10372[0] = aClass409_10580.method6879(class505, i, Class96_Sub16.aClass211_9383, Class158_Sub1.aClass3_8507, class456, class456_sub3, aClass456_Sub2_Sub1Array10354, anIntArray10362, i_4_, aClass417_10581, method15808(635765286), false, -1676394010));
		if (null == class528)
			return false;
		((NPC) this).anInt10317 = class528.YA() * -358839357;
		class528.n();
		method15819(class528, 2019976245);
		if (0 != i_2_ || i_3_ != 0) {
			method15895(i_4_, i_2_, i_3_, -1269540851 * class227.anInt2813, -1319342263 * class227.anInt2790, (byte) 1);
			if (0 != (-35614997 * ((NPC) this).anInt10322))
				aClass528Array10372[0].t(-35614997 * ((NPC) this).anInt10322);
			if (0 != (((NPC) this).anInt10323 * -1768311789))
				aClass528Array10372[0].EA(((NPC) this).anInt10323 * -1768311789);
			if (-628205413 * ((NPC) this).anInt10363 != 0)
				aClass528Array10372[0].ia(0, ((NPC) this).anInt10363 * -628205413, 0);
		} else
			method15895(i_4_, method15805(828768449) << 9, method15805(828768449) << 9, 0, 0, (byte) 1);
		if (bool)
			class528.PA(aByte10371, aByte10327, aByte10364, aByte10352 & 0xff);
		method15837(class505, class227, i_1_, i_2_, i_3_, i_4_, (byte) 1);
		return true;
	}

	void method12991(Class505 class505, int i) {
		if (null != aClass409_10580 && (((NPC) this).aBool10370 || method16158(class505, 0, (byte) 23))) {
			Class294 class294 = class505.method8450();
			class294.method5209(method11168());
			class294.method5219(0.0F, -5.0F, 0.0F);
			method15799(class505, aClass528Array10372, class294, ((NPC) this).aBool10370, (byte) -31);
			for (int i_5_ = 0; i_5_ < aClass528Array10372.length; i_5_++)
				aClass528Array10372[i_5_] = null;
		}
	}

	public int method15794(int i) {
		return 1 + anInt10314 * -1691508299;
	}

	public void method16159(int i, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_) {
		aByte7967 = aByte7968 = (byte) i;
		if (client.aClass257_7353.method4433(33386298).method5497(i_6_, i_7_, 1670715577))
			aByte7968++;
		if (aClass456_10338.method7564(1626305328) && (aClass456_10338.method7565(-1632742162).anInt5921 * 113839939 == 1)) {
			anIntArray10350 = null;
			aClass456_10338.method7567(-1, (short) 8960);
		}
		for (int i_10_ = 0; i_10_ < aClass161Array10339.length; i_10_++) {
			if (-1 != 378836105 * aClass161Array10339[i_10_].anInt2012) {
				Class525 class525 = (Class96_Sub20.aClass515_9416.method8845(aClass161Array10339[i_10_].anInt2012 * 378836105, (byte) -95));
				if (class525.aBool6968 && -1 != -364555849 * class525.anInt6977 && ((Class330.aClass523_3868.method11205(class525.anInt6977 * -364555849, (byte) 7).anInt5921) * 113839939) == 1) {
					aClass161Array10339[i_10_].aClass456_2014.method7567(-1, (short) 8960);
					aClass161Array10339[i_10_].anInt2012 = 1025302087;
				}
			}
		}
		if (!bool) {
			int i_11_ = i_6_ - regionBaseX[0];
			int i_12_ = i_7_ - regionBaseY[0];
			if (i_11_ >= -8 && i_11_ <= 8 && i_12_ >= -8 && i_12_ <= 8) {
				if (1871221471 * anInt10355 < regionBaseX.length - 1)
					anInt10355 += -2086688481;
				for (int i_13_ = anInt10355 * 1871221471; i_13_ > 0; i_13_--) {
					regionBaseX[i_13_] = regionBaseX[i_13_ - 1];
					regionBaseY[i_13_] = regionBaseY[i_13_ - 1];
					aByteArray10365[i_13_] = aByteArray10365[i_13_ - 1];
				}
				regionBaseX[0] = i_6_;
				regionBaseY[0] = i_7_;
				aByteArray10365[0] = Class249.aClass249_3084.aByte3085;
				return;
			}
		}
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i_6_;
		regionBaseY[0] = i_7_;
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) ((i_8_ << 8) + (regionBaseX[0] << 9));
		class385.aFloat4673 = (float) ((regionBaseY[0] << 9) + (i_8_ << 8));
		method11171(class385);
		class385.method6624();
		if (((NPC) this).aClass539_10369 != null)
			((NPC) this).aClass539_10369.method11505();
	}

	public final boolean method16160(int i) {
		if (aClass409_10580 == null)
			return false;
		return true;
	}

	int method15808(int i) {
		if (-1 != -343399559 * anInt10575)
			return anInt10575 * -343399559;
		if (aClass409_10580.anIntArray4886 != null) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != class409.anInt4898 * -490908695)
				return -490908695 * class409.anInt4898;
		}
		return aClass409_10580.anInt4898 * -490908695;
	}

	public final void method16161(Class252 class252, int i, int i_14_) {
		int i_15_ = regionBaseX[0];
		int i_16_ = regionBaseY[0];
		switch (class252.anInt3104 * 1583741993) {
		case 3:
			i_15_++;
			break;
		case 5:
			i_15_--;
			break;
		case 2:
			i_15_++;
			i_16_++;
			break;
		case 4:
			i_15_--;
			i_16_--;
			break;
		case 7:
			i_15_++;
			i_16_--;
			break;
		case 1:
			i_15_--;
			i_16_++;
			break;
		case 0:
			i_16_++;
			break;
		case 6:
			i_16_--;
			break;
		}
		if (aClass456_10338.method7564(-1741857470) && (aClass456_10338.method7565(-1632742162).anInt5921 * 113839939 == 1)) {
			anIntArray10350 = null;
			aClass456_10338.method7567(-1, (short) 8960);
		}
		for (int i_17_ = 0; i_17_ < aClass161Array10339.length; i_17_++) {
			if (-1 != 378836105 * aClass161Array10339[i_17_].anInt2012) {
				Class525 class525 = (Class96_Sub20.aClass515_9416.method8845(378836105 * aClass161Array10339[i_17_].anInt2012, (byte) -12));
				if (class525.aBool6968 && -1 != class525.anInt6977 * -364555849 && (Class330.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) -9).anInt5921) * 113839939 == 1) {
					aClass161Array10339[i_17_].aClass456_2014.method7567(-1, (short) 8960);
					aClass161Array10339[i_17_].anInt2012 = 1025302087;
				}
			}
		}
		if (anInt10355 * 1871221471 < regionBaseX.length - 1)
			anInt10355 += -2086688481;
		for (int i_18_ = anInt10355 * 1871221471; i_18_ > 0; i_18_--) {
			regionBaseX[i_18_] = regionBaseX[i_18_ - 1];
			regionBaseY[i_18_] = regionBaseY[i_18_ - 1];
			aByteArray10365[i_18_] = aByteArray10365[i_18_ - 1];
		}
		regionBaseX[0] = i_15_;
		regionBaseY[0] = i_16_;
		aByteArray10365[0] = (byte) i;
	}

	public int method12997(int i) {
		if (aClass409_10580.anIntArray4886 != null) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != class409.anInt4902 * -675134025)
				return -675134025 * class409.anInt4902;
		}
		return (-675134025 * aClass409_10580.anInt4902 != -1 ? aClass409_10580.anInt4902 * -675134025 : super.method12997(-218366287));
	}

	boolean method16162(int i) {
		return aClass409_10580.aBool4893;
	}

	public int method15898() {
		if (null != aClass409_10580.anIntArray4886) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != 327817917 * class409.anInt4918)
				return class409.anInt4918 * 327817917;
		}
		return 327817917 * aClass409_10580.anInt4918;
	}

	void method13023(Class505 class505) {
		if (null != aClass409_10580 && (((NPC) this).aBool10370 || method16158(class505, 0, (byte) -5))) {
			Class294 class294 = class505.method8450();
			class294.method5209(method11168());
			class294.method5219(0.0F, -5.0F, 0.0F);
			method15799(class505, aClass528Array10372, class294, ((NPC) this).aBool10370, (byte) 9);
			for (int i = 0; i < aClass528Array10372.length; i++)
				aClass528Array10372[i] = null;
		}
	}

	final boolean method12985(int i) {
		return false;
	}

	final void method13013(Class505 class505, Class521_Sub1 class521_sub1, int i, int i_19_, int i_20_, boolean bool, int i_21_) {
		throw new IllegalStateException();
	}

	final void method12984(int i) {
		throw new IllegalStateException();
	}

	public int method16163(int i, int i_22_) {
		return ((NPC) this).anIntArray10585[i];
	}

	public boolean method15871() {
		return Class58.aClass529_527.aBool7041;
	}

	boolean method12983(Class505 class505, int i, int i_23_, int i_24_) {
		if (aClass409_10580 == null || !method16158(class505, 131072, (byte) 19))
			return false;
		Class294 class294 = method11168();
		boolean bool = false;
		for (int i_25_ = 0; i_25_ < aClass528Array10372.length; i_25_++) {
			if (aClass528Array10372[i_25_] != null) {
				boolean bool_26_;
				while_46_: do {
					do {
						if (-1894935519 * aClass409_10580.anInt4913 <= 0) {
							if (1419481733 * aClass409_10580.anInt4917 == -1) {
								if (1 != aClass409_10580.anInt4858 * 1203434505)
									break;
							} else if (1 != (aClass409_10580.anInt4917 * 1419481733))
								break;
						}
						bool_26_ = true;
						break while_46_;
					} while (false);
					bool_26_ = false;
				} while (false);
				boolean bool_27_ = bool_26_;
				boolean bool_28_ = (aClass528Array10372[i_25_].method11270(i, i_23_, class294, bool_27_, aClass409_10580.anInt4913 * -1894935519));
				if (bool_28_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_29_ = 0; i_29_ < aClass528Array10372.length; i_29_++)
			aClass528Array10372[i_29_] = null;
		return bool;
	}

	public Class200 method12993(Class505 class505) {
		return null;
	}

	Class285 method13009(Class505 class505) {
		if (aClass409_10580 == null || !method16158(class505, 526336, (byte) -27))
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class294 class294_30_ = class505.method8450();
		int i = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (null != class293 && null != class293.aClass521_Sub1_Sub3_3499) {
			int i_31_ = ((((NPC) this).anInt10325 * -2023195771) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((NPC) this).anInt10325)) - (float) i_31_ / 10.0F));
		} else
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) ((((NPC) this).anInt10325) * -2023195771) - (float) (-2023195771 * (((NPC) this).anInt10325)) / 10.0F));
		class294_30_.method5209(class294);
		class294_30_.method5219(0.0F, (float) (-20 - ((NPC) this).anInt10325 * -2023195771), 0.0F);
		Class227 class227 = method15855((byte) -17);
		Class409 class409 = (aClass409_10580.anIntArray4886 != null ? aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693) : aClass409_10580);
		((NPC) this).aBool10312 = false;
		Class285 class285 = null;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -105) == 1 && class409.aBool4912 && class227.aBool2787) {
			Class456 class456 = ((aClass456_10338.method7564(135273050) && aClass456_10338.method7573(-1080298347)) ? aClass456_10338 : null);
			Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(1632589371) && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
			Class528 class528 = Class116.method1969(class505, i, (((NPC) this).anInt10322) * -35614997, (-1768311789 * (((NPC) this).anInt10323)), (-628205413 * (((NPC) this).anInt10363)), 1203434505 * aClass409_10580.anInt4858, aClass528Array10372[0], aClass409_10580.aShort4874 & 0xffff, aClass409_10580.aShort4897 & 0xffff, aClass409_10580.aByte4883 & 0xff, aClass409_10580.aByte4899 & 0xff, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935);
			if (null != class528) {
				if (null == aClass275_Sub5Array7965 || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
					method13008(aClass528Array10372.length + 1, (byte) -19);
				class285 = Class470.method7824(method16162(1548602767), (byte) -37);
				((NPC) this).aBool10312 = true;
				class505.RA(false);
				class528.method11282(class294_30_, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
				class505.RA(true);
			}
		}
		if (aClass275_Sub5Array7965 == null || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -90);
		if (class285 == null)
			class285 = Class470.method7824(method16162(759364370), (byte) -74);
		method15799(class505, aClass528Array10372, class294_30_, false, (byte) 0);
		for (int i_32_ = 0; i_32_ < aClass528Array10372.length; i_32_++) {
			if (null != aClass528Array10372[i_32_]) {
				if (aClass409_10580.aBool4920)
					aClass528Array10372[i_32_].PA((((NPC) this).anInt10587 * 812179495), (954646983 * ((NPC) this).anInt10588), (37639707 * ((NPC) this).anInt10589), (478845591 * ((NPC) this).anInt10590));
				aClass528Array10372[i_32_].method11282(class294_30_, (aClass275_Sub5Array7965[i_32_]), 0);
			}
		}
		if (((NPC) this).aClass539_10369 != null) {
			Class151 class151 = ((NPC) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_33_ = 0; i_33_ < aClass528Array10372.length; i_33_++) {
			if (aClass528Array10372[i_33_] != null)
				((NPC) this).aBool10312 |= aClass528Array10372[i_33_].i();
			aClass528Array10372[i_33_] = null;
		}
		anInt10349 = client.anInt7286 * 1178121955;
		return class285;
	}

	public void method16164(String string, int i, int i_34_, byte i_35_) {
		int i_36_ = (Class204.method3363(1027745545) * (-936082597 * Class58.aClass529_527.anInt7038));
		method15875(string, i, i_34_, i_36_, 1930642006);
	}

	public Class163 method15852() {
		if (((NPC) this).aClass163_10334 != null && null == ((Class163) (((NPC) this).aClass163_10334)).aString2028)
			return null;
		return ((NPC) this).aClass163_10334;
	}

	public int method13007() {
		if (aClass409_10580.anIntArray4886 != null) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != class409.anInt4902 * -675134025)
				return -675134025 * class409.anInt4902;
		}
		return (-675134025 * aClass409_10580.anInt4902 != -1 ? aClass409_10580.anInt4902 * -675134025 : super.method12997(-218366287));
	}

	public int method13028() {
		if (aClass409_10580.anIntArray4886 != null) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != class409.anInt4902 * -675134025)
				return -675134025 * class409.anInt4902;
		}
		return (-675134025 * aClass409_10580.anInt4902 != -1 ? aClass409_10580.anInt4902 * -675134025 : super.method12997(-218366287));
	}

	Class285 method12990(Class505 class505, int i) {
		if (aClass409_10580 == null || !method16158(class505, 526336, (byte) 26))
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class294 class294_37_ = class505.method8450();
		int i_38_ = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (null != class293 && null != class293.aClass521_Sub1_Sub3_3499) {
			int i_39_ = ((((NPC) this).anInt10325 * -2023195771) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((NPC) this).anInt10325)) - (float) i_39_ / 10.0F));
		} else
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) ((((NPC) this).anInt10325) * -2023195771) - (float) (-2023195771 * (((NPC) this).anInt10325)) / 10.0F));
		class294_37_.method5209(class294);
		class294_37_.method5219(0.0F, (float) (-20 - ((NPC) this).anInt10325 * -2023195771), 0.0F);
		Class227 class227 = method15855((byte) -17);
		Class409 class409 = (aClass409_10580.anIntArray4886 != null ? aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693) : aClass409_10580);
		((NPC) this).aBool10312 = false;
		Class285 class285 = null;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -38) == 1 && class409.aBool4912 && class227.aBool2787) {
			Class456 class456 = ((aClass456_10338.method7564(1891093991) && aClass456_10338.method7573(-539713016)) ? aClass456_10338 : null);
			Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-503444560) && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
			Class528 class528 = Class116.method1969(class505, i_38_, (((NPC) this).anInt10322) * -35614997, (-1768311789 * (((NPC) this).anInt10323)), (-628205413 * (((NPC) this).anInt10363)), 1203434505 * aClass409_10580.anInt4858, aClass528Array10372[0], aClass409_10580.aShort4874 & 0xffff, aClass409_10580.aShort4897 & 0xffff, aClass409_10580.aByte4883 & 0xff, aClass409_10580.aByte4899 & 0xff, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935);
			if (null != class528) {
				if (null == aClass275_Sub5Array7965 || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
					method13008(aClass528Array10372.length + 1, (byte) -107);
				class285 = Class470.method7824(method16162(425151398), (byte) -117);
				((NPC) this).aBool10312 = true;
				class505.RA(false);
				class528.method11282(class294_37_, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
				class505.RA(true);
			}
		}
		if (aClass275_Sub5Array7965 == null || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -9);
		if (class285 == null)
			class285 = Class470.method7824(method16162(1979469596), (byte) -108);
		method15799(class505, aClass528Array10372, class294_37_, false, (byte) -6);
		for (int i_40_ = 0; i_40_ < aClass528Array10372.length; i_40_++) {
			if (null != aClass528Array10372[i_40_]) {
				if (aClass409_10580.aBool4920)
					aClass528Array10372[i_40_].PA((((NPC) this).anInt10587 * 812179495), (954646983 * ((NPC) this).anInt10588), (37639707 * ((NPC) this).anInt10589), (478845591 * ((NPC) this).anInt10590));
				aClass528Array10372[i_40_].method11282(class294_37_, (aClass275_Sub5Array7965[i_40_]), 0);
			}
		}
		if (((NPC) this).aClass539_10369 != null) {
			Class151 class151 = ((NPC) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_41_ = 0; i_41_ < aClass528Array10372.length; i_41_++) {
			if (aClass528Array10372[i_41_] != null)
				((NPC) this).aBool10312 |= aClass528Array10372[i_41_].i();
			aClass528Array10372[i_41_] = null;
		}
		anInt10349 = client.anInt7286 * 1178121955;
		return class285;
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	Class285 method12989(Class505 class505) {
		if (aClass409_10580 == null || !method16158(class505, 526336, (byte) -14))
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class294 class294_42_ = class505.method8450();
		int i = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (null != class293 && null != class293.aClass521_Sub1_Sub3_3499) {
			int i_43_ = ((((NPC) this).anInt10325 * -2023195771) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((NPC) this).anInt10325)) - (float) i_43_ / 10.0F));
		} else
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) ((((NPC) this).anInt10325) * -2023195771) - (float) (-2023195771 * (((NPC) this).anInt10325)) / 10.0F));
		class294_42_.method5209(class294);
		class294_42_.method5219(0.0F, (float) (-20 - ((NPC) this).anInt10325 * -2023195771), 0.0F);
		Class227 class227 = method15855((byte) -17);
		Class409 class409 = (aClass409_10580.anIntArray4886 != null ? aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693) : aClass409_10580);
		((NPC) this).aBool10312 = false;
		Class285 class285 = null;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -85) == 1 && class409.aBool4912 && class227.aBool2787) {
			Class456 class456 = ((aClass456_10338.method7564(-1253945962) && aClass456_10338.method7573(-1093777602)) ? aClass456_10338 : null);
			Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-368195130) && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
			Class528 class528 = Class116.method1969(class505, i, (((NPC) this).anInt10322) * -35614997, (-1768311789 * (((NPC) this).anInt10323)), (-628205413 * (((NPC) this).anInt10363)), 1203434505 * aClass409_10580.anInt4858, aClass528Array10372[0], aClass409_10580.aShort4874 & 0xffff, aClass409_10580.aShort4897 & 0xffff, aClass409_10580.aByte4883 & 0xff, aClass409_10580.aByte4899 & 0xff, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935);
			if (null != class528) {
				if (null == aClass275_Sub5Array7965 || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
					method13008(aClass528Array10372.length + 1, (byte) -114);
				class285 = Class470.method7824(method16162(673687659), (byte) -118);
				((NPC) this).aBool10312 = true;
				class505.RA(false);
				class528.method11282(class294_42_, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
				class505.RA(true);
			}
		}
		if (aClass275_Sub5Array7965 == null || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -3);
		if (class285 == null)
			class285 = Class470.method7824(method16162(1870859445), (byte) -84);
		method15799(class505, aClass528Array10372, class294_42_, false, (byte) -22);
		for (int i_44_ = 0; i_44_ < aClass528Array10372.length; i_44_++) {
			if (null != aClass528Array10372[i_44_]) {
				if (aClass409_10580.aBool4920)
					aClass528Array10372[i_44_].PA((((NPC) this).anInt10587 * 812179495), (954646983 * ((NPC) this).anInt10588), (37639707 * ((NPC) this).anInt10589), (478845591 * ((NPC) this).anInt10590));
				aClass528Array10372[i_44_].method11282(class294_42_, (aClass275_Sub5Array7965[i_44_]), 0);
			}
		}
		if (((NPC) this).aClass539_10369 != null) {
			Class151 class151 = ((NPC) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_45_ = 0; i_45_ < aClass528Array10372.length; i_45_++) {
			if (aClass528Array10372[i_45_] != null)
				((NPC) this).aBool10312 |= aClass528Array10372[i_45_].i();
			aClass528Array10372[i_45_] = null;
		}
		anInt10349 = client.anInt7286 * 1178121955;
		return class285;
	}

	public int method15897() {
		if (null != aClass409_10580.anIntArray4886) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != 327817917 * class409.anInt4918)
				return class409.anInt4918 * 327817917;
		}
		return 327817917 * aClass409_10580.anInt4918;
	}

	public boolean method15887(int i) {
		return Class58.aClass529_527.aBool7041;
	}

	public void method16165(Class409 class409) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) -122))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	public Class163 method15811(int i) {
		if (((NPC) this).aClass163_10334 != null && null == ((Class163) (((NPC) this).aClass163_10334)).aString2028)
			return null;
		return ((NPC) this).aClass163_10334;
	}

	final void method13016(Class505 class505, Class521_Sub1 class521_sub1, int i, int i_46_, int i_47_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method16166(Class409 class409, int i) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) -83))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	int method15868() {
		if (-1 != -343399559 * anInt10575)
			return anInt10575 * -343399559;
		if (aClass409_10580.anIntArray4886 != null) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != class409.anInt4898 * -490908695)
				return -490908695 * class409.anInt4898;
		}
		return aClass409_10580.anInt4898 * -490908695;
	}

	final boolean method13011() {
		return false;
	}

	public boolean method15872() {
		return Class58.aClass529_527.aBool7041;
	}

	public boolean method15873() {
		return Class58.aClass529_527.aBool7041;
	}

	public boolean method15814() {
		return Class58.aClass529_527.aBool7041;
	}

	public Class163 method15809() {
		if (((NPC) this).aClass163_10334 != null && null == ((Class163) (((NPC) this).aClass163_10334)).aString2028)
			return null;
		return ((NPC) this).aClass163_10334;
	}

	public Class163 method15876() {
		if (((NPC) this).aClass163_10334 != null && null == ((Class163) (((NPC) this).aClass163_10334)).aString2028)
			return null;
		return ((NPC) this).aClass163_10334;
	}

	public Class163 method15877() {
		if (((NPC) this).aClass163_10334 != null && null == ((Class163) (((NPC) this).aClass163_10334)).aString2028)
			return null;
		return ((NPC) this).aClass163_10334;
	}

	public void method16167(Class409 class409) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) -112))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	public Class200 method13019(Class505 class505) {
		return null;
	}

	public int method16168(int i) {
		return ((NPC) this).anIntArray10585[i];
	}

	int method15867() {
		if (-1 != -343399559 * anInt10575)
			return anInt10575 * -343399559;
		if (aClass409_10580.anIntArray4886 != null) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != class409.anInt4898 * -490908695)
				return -490908695 * class409.anInt4898;
		}
		return aClass409_10580.anInt4898 * -490908695;
	}

	boolean method13020(Class505 class505, int i, int i_48_) {
		if (aClass409_10580 == null || !method16158(class505, 131072, (byte) -19))
			return false;
		Class294 class294 = method11168();
		boolean bool = false;
		for (int i_49_ = 0; i_49_ < aClass528Array10372.length; i_49_++) {
			if (aClass528Array10372[i_49_] != null) {
				boolean bool_50_;
				while_47_: do {
					do {
						if (-1894935519 * aClass409_10580.anInt4913 <= 0) {
							if (1419481733 * aClass409_10580.anInt4917 == -1) {
								if (1 != aClass409_10580.anInt4858 * 1203434505)
									break;
							} else if (1 != (aClass409_10580.anInt4917 * 1419481733))
								break;
						}
						bool_50_ = true;
						break while_47_;
					} while (false);
					bool_50_ = false;
				} while (false);
				boolean bool_51_ = bool_50_;
				boolean bool_52_ = (aClass528Array10372[i_49_].method11270(i, i_48_, class294, bool_51_, aClass409_10580.anInt4913 * -1894935519));
				if (bool_52_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_53_ = 0; i_53_ < aClass528Array10372.length; i_53_++)
			aClass528Array10372[i_53_] = null;
		return bool;
	}

	public int method16169(int i, byte i_54_) {
		return ((NPC) this).anIntArray10586[i];
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	int method13027() {
		if (aClass409_10580 == null)
			return 0;
		return aClass409_10580.anInt4913 * -1894935519;
	}

	public int method16170(int i) {
		return ((NPC) this).anIntArray10585[i];
	}

	boolean method16171() {
		return aClass409_10580.aBool4893;
	}

	public int method15804() {
		if (null != aClass409_10580.anIntArray4886) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != 327817917 * class409.anInt4918)
				return class409.anInt4918 * 327817917;
		}
		return 327817917 * aClass409_10580.anInt4918;
	}

	public int method15874() {
		return 1 + anInt10314 * -1691508299;
	}

	public int method15892() {
		return 1 + anInt10314 * -1691508299;
	}

	final boolean method13026() {
		return false;
	}

	void method16172() {
		((NPC) this).anInt10587 = (32 + (int) (Math.random() * 4.0)) * 1113755543;
		((NPC) this).anInt10588 = (3 + (int) (Math.random() * 2.0)) * -1912819721;
		((NPC) this).anInt10589 = (16 + (int) (Math.random() * 3.0)) * -62352365;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-51981151) == 1)
			((NPC) this).anInt10590 = (int) (Math.random() * 6.0) * -331447001;
		else
			((NPC) this).anInt10590 = (int) (Math.random() * 12.0) * -331447001;
	}

	void method16173() {
		((NPC) this).anInt10587 = (32 + (int) (Math.random() * 4.0)) * 1113755543;
		((NPC) this).anInt10588 = (3 + (int) (Math.random() * 2.0)) * -1912819721;
		((NPC) this).anInt10589 = (16 + (int) (Math.random() * 3.0)) * -62352365;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(2126679923) == 1)
			((NPC) this).anInt10590 = (int) (Math.random() * 6.0) * -331447001;
		else
			((NPC) this).anInt10590 = (int) (Math.random() * 12.0) * -331447001;
	}

	void method16174() {
		((NPC) this).anInt10587 = (32 + (int) (Math.random() * 4.0)) * 1113755543;
		((NPC) this).anInt10588 = (3 + (int) (Math.random() * 2.0)) * -1912819721;
		((NPC) this).anInt10589 = (16 + (int) (Math.random() * 3.0)) * -62352365;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1366489423) == 1)
			((NPC) this).anInt10590 = (int) (Math.random() * 6.0) * -331447001;
		else
			((NPC) this).anInt10590 = (int) (Math.random() * 12.0) * -331447001;
	}

	void method16175() {
		((NPC) this).anInt10587 = (32 + (int) (Math.random() * 4.0)) * 1113755543;
		((NPC) this).anInt10588 = (3 + (int) (Math.random() * 2.0)) * -1912819721;
		((NPC) this).anInt10589 = (16 + (int) (Math.random() * 3.0)) * -62352365;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-306444908) == 1)
			((NPC) this).anInt10590 = (int) (Math.random() * 6.0) * -331447001;
		else
			((NPC) this).anInt10590 = (int) (Math.random() * 12.0) * -331447001;
	}

	public void method16176(Class409 class409) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) -85))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	public void method16177(Class409 class409) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) -69))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	public void method16178(Class409 class409) {
		if (aClass409_10580 != class409 && Class20.aBool161 && Class444.method7426(anInt10314 * -1691508299, (byte) 38))
			Class316.method5594(-559600711);
		aClass409_10580 = class409;
		if (aClass409_10580 != null) {
			aString10584 = aClass409_10580.aString4857;
			anInt10582 = 466211499 * aClass409_10580.anInt4879;
		}
		if (null != ((NPC) this).aClass539_10369)
			((NPC) this).aClass539_10369.method11505();
	}

	public void method16179(int i, int i_55_, int i_56_, byte i_57_) {
		((NPC) this).anIntArray10585[i] = i_55_;
		((NPC) this).anIntArray10586[i] = i_56_;
	}

	public int method15899(int i) {
		if (null != aClass409_10580.anIntArray4886) {
			Class409 class409 = aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (null != class409 && -1 != 327817917 * class409.anInt4918)
				return class409.anInt4918 * 327817917;
		}
		return 327817917 * aClass409_10580.anInt4918;
	}

	public void method16180(String string, int i, int i_58_) {
		int i_59_ = (Class204.method3363(2026859155) * (-936082597 * Class58.aClass529_527.anInt7038));
		method15875(string, i, i_58_, i_59_, -1032476785);
	}

	boolean method16181(Class505 class505, int i) {
		int i_60_ = i;
		Class227 class227 = method15855((byte) -17);
		Class456 class456 = ((aClass456_10338.method7564(-647672511) && !aClass456_10338.method7573(-964739095)) ? aClass456_10338 : null);
		Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-1444451130) && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
		int i_61_ = -983752529 * class227.anInt2786;
		int i_62_ = -209978553 * class227.anInt2829;
		if (0 != i_61_ || i_62_ != 0 || 0 != class227.anInt2824 * -1949451929 || 0 != -373642049 * class227.anInt2827)
			i |= 0x7;
		boolean bool = (0 != aByte10352 && -1809259861 * client.cycles >= -134703791 * anInt10347 && -1809259861 * client.cycles < -444686705 * anInt10348);
		if (bool)
			i |= 0x80000;
		int i_63_ = aClass19_10359.method578((byte) 2);
		Class528 class528 = (aClass528Array10372[0] = aClass409_10580.method6879(class505, i, Class96_Sub16.aClass211_9383, Class158_Sub1.aClass3_8507, class456, class456_sub3, aClass456_Sub2_Sub1Array10354, anIntArray10362, i_63_, aClass417_10581, method15808(635765286), false, 339814141));
		if (null == class528)
			return false;
		((NPC) this).anInt10317 = class528.YA() * -358839357;
		class528.n();
		method15819(class528, 2019976245);
		if (0 != i_61_ || i_62_ != 0) {
			method15895(i_63_, i_61_, i_62_, -1269540851 * class227.anInt2813, -1319342263 * class227.anInt2790, (byte) 1);
			if (0 != (-35614997 * ((NPC) this).anInt10322))
				aClass528Array10372[0].t(-35614997 * ((NPC) this).anInt10322);
			if (0 != (((NPC) this).anInt10323 * -1768311789))
				aClass528Array10372[0].EA(((NPC) this).anInt10323 * -1768311789);
			if (-628205413 * ((NPC) this).anInt10363 != 0)
				aClass528Array10372[0].ia(0, ((NPC) this).anInt10363 * -628205413, 0);
		} else
			method15895(i_63_, method15805(828768449) << 9, method15805(828768449) << 9, 0, 0, (byte) 1);
		if (bool)
			class528.PA(aByte10371, aByte10327, aByte10364, aByte10352 & 0xff);
		method15837(class505, class227, i_60_, i_61_, i_62_, i_63_, (byte) 1);
		return true;
	}

	public void method16182(int i, int i_64_, int i_65_, boolean bool, int i_66_) {
		aByte7967 = aByte7968 = (byte) i;
		if (client.aClass257_7353.method4433(33386298).method5497(i_64_, i_65_, 1699221461))
			aByte7968++;
		if (aClass456_10338.method7564(303439181) && (aClass456_10338.method7565(-1632742162).anInt5921 * 113839939 == 1)) {
			anIntArray10350 = null;
			aClass456_10338.method7567(-1, (short) 8960);
		}
		for (int i_67_ = 0; i_67_ < aClass161Array10339.length; i_67_++) {
			if (-1 != 378836105 * aClass161Array10339[i_67_].anInt2012) {
				Class525 class525 = (Class96_Sub20.aClass515_9416.method8845(aClass161Array10339[i_67_].anInt2012 * 378836105, (byte) -30));
				if (class525.aBool6968 && -1 != -364555849 * class525.anInt6977 && (Class330.aClass523_3868.method11205(class525.anInt6977 * -364555849, (byte) -80).anInt5921) * 113839939 == 1) {
					aClass161Array10339[i_67_].aClass456_2014.method7567(-1, (short) 8960);
					aClass161Array10339[i_67_].anInt2012 = 1025302087;
				}
			}
		}
		if (!bool) {
			int i_68_ = i_64_ - regionBaseX[0];
			int i_69_ = i_65_ - regionBaseY[0];
			if (i_68_ >= -8 && i_68_ <= 8 && i_69_ >= -8 && i_69_ <= 8) {
				if (1871221471 * anInt10355 < regionBaseX.length - 1)
					anInt10355 += -2086688481;
				for (int i_70_ = anInt10355 * 1871221471; i_70_ > 0; i_70_--) {
					regionBaseX[i_70_] = regionBaseX[i_70_ - 1];
					regionBaseY[i_70_] = regionBaseY[i_70_ - 1];
					aByteArray10365[i_70_] = aByteArray10365[i_70_ - 1];
				}
				regionBaseX[0] = i_64_;
				regionBaseY[0] = i_65_;
				aByteArray10365[0] = Class249.aClass249_3084.aByte3085;
				return;
			}
		}
		anInt10355 = 0;
		anInt10367 = 0;
		anInt10366 = 0;
		regionBaseX[0] = i_64_;
		regionBaseY[0] = i_65_;
		Class385 class385 = Class385.method6623(method11166().aClass385_3595);
		class385.aFloat4671 = (float) ((i_66_ << 8) + (regionBaseX[0] << 9));
		class385.aFloat4673 = (float) ((regionBaseY[0] << 9) + (i_66_ << 8));
		method11171(class385);
		class385.method6624();
		if (((NPC) this).aClass539_10369 != null)
			((NPC) this).aClass539_10369.method11505();
	}

	public final boolean method16183() {
		if (aClass409_10580 == null)
			return false;
		return true;
	}

	boolean method16184() {
		return aClass409_10580.aBool4893;
	}

	void method13012(Class505 class505) {
		if (null != aClass409_10580 && (((NPC) this).aBool10370 || method16158(class505, 0, (byte) 29))) {
			Class294 class294 = class505.method8450();
			class294.method5209(method11168());
			class294.method5219(0.0F, -5.0F, 0.0F);
			method15799(class505, aClass528Array10372, class294, ((NPC) this).aBool10370, (byte) 87);
			for (int i = 0; i < aClass528Array10372.length; i++)
				aClass528Array10372[i] = null;
		}
	}

	Class285 method13010(Class505 class505) {
		if (aClass409_10580 == null || !method16158(class505, 526336, (byte) 37))
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class294 class294_71_ = class505.method8450();
		int i = aClass19_10359.method578((byte) 2);
		Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][(int) class305.aClass385_3595.aFloat4671 >> 9][(int) class305.aClass385_3595.aFloat4673 >> 9]);
		if (null != class293 && null != class293.aClass521_Sub1_Sub3_3499) {
			int i_72_ = ((((NPC) this).anInt10325 * -2023195771) - class293.aClass521_Sub1_Sub3_3499.aShort9561);
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) (-2023195771 * (((NPC) this).anInt10325)) - (float) i_72_ / 10.0F));
		} else
			((NPC) this).anInt10325 = (-374848179 * (int) ((float) ((((NPC) this).anInt10325) * -2023195771) - (float) (-2023195771 * (((NPC) this).anInt10325)) / 10.0F));
		class294_71_.method5209(class294);
		class294_71_.method5219(0.0F, (float) (-20 - ((NPC) this).anInt10325 * -2023195771), 0.0F);
		Class227 class227 = method15855((byte) -17);
		Class409 class409 = (aClass409_10580.anIntArray4886 != null ? aClass409_10580.method6884(Class158_Sub1.aClass3_8507, 265881693) : aClass409_10580);
		((NPC) this).aBool10312 = false;
		Class285 class285 = null;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub28_8212.method12966((byte) -99) == 1 && class409.aBool4912 && class227.aBool2787) {
			Class456 class456 = ((aClass456_10338.method7564(-1892437466) && aClass456_10338.method7573(2108774285)) ? aClass456_10338 : null);
			Class456_Sub3 class456_sub3 = ((aClass456_Sub3_10337.method7564(-525622402) && (!aClass456_Sub3_10337.aBool7891 || null == class456)) ? aClass456_Sub3_10337 : null);
			Class528 class528 = Class116.method1969(class505, i, (((NPC) this).anInt10322) * -35614997, (-1768311789 * (((NPC) this).anInt10323)), (-628205413 * (((NPC) this).anInt10363)), 1203434505 * aClass409_10580.anInt4858, aClass528Array10372[0], aClass409_10580.aShort4874 & 0xffff, aClass409_10580.aShort4897 & 0xffff, aClass409_10580.aByte4883 & 0xff, aClass409_10580.aByte4899 & 0xff, (null != class456_sub3 ? (Class456) class456_sub3 : class456), 16711935);
			if (null != class528) {
				if (null == aClass275_Sub5Array7965 || (aClass275_Sub5Array7965.length < 1 + aClass528Array10372.length))
					method13008(aClass528Array10372.length + 1, (byte) -124);
				class285 = Class470.method7824(method16162(1927143783), (byte) -100);
				((NPC) this).aBool10312 = true;
				class505.RA(false);
				class528.method11282(class294_71_, (aClass275_Sub5Array7965[aClass528Array10372.length]), 0);
				class505.RA(true);
			}
		}
		if (aClass275_Sub5Array7965 == null || aClass275_Sub5Array7965.length < aClass528Array10372.length)
			method13008(aClass528Array10372.length, (byte) -10);
		if (class285 == null)
			class285 = Class470.method7824(method16162(574364280), (byte) -55);
		method15799(class505, aClass528Array10372, class294_71_, false, (byte) -36);
		for (int i_73_ = 0; i_73_ < aClass528Array10372.length; i_73_++) {
			if (null != aClass528Array10372[i_73_]) {
				if (aClass409_10580.aBool4920)
					aClass528Array10372[i_73_].PA((((NPC) this).anInt10587 * 812179495), (954646983 * ((NPC) this).anInt10588), (37639707 * ((NPC) this).anInt10589), (478845591 * ((NPC) this).anInt10590));
				aClass528Array10372[i_73_].method11282(class294_71_, (aClass275_Sub5Array7965[i_73_]), 0);
			}
		}
		if (((NPC) this).aClass539_10369 != null) {
			Class151 class151 = ((NPC) this).aClass539_10369.method11517();
			class505.method8456(class151);
		}
		for (int i_74_ = 0; i_74_ < aClass528Array10372.length; i_74_++) {
			if (aClass528Array10372[i_74_] != null)
				((NPC) this).aBool10312 |= aClass528Array10372[i_74_].i();
			aClass528Array10372[i_74_] = null;
		}
		anInt10349 = client.anInt7286 * 1178121955;
		return class285;
	}

	public void method16185(String string, int i, int i_75_) {
		int i_76_ = (Class204.method3363(1862480607) * (-936082597 * Class58.aClass529_527.anInt7038));
		method15875(string, i, i_75_, i_76_, 820561633);
	}

	public int method16186(int i) {
		return ((NPC) this).anIntArray10585[i];
	}

	public int method16187(int i) {
		return ((NPC) this).anIntArray10585[i];
	}

	public int method16188(int i) {
		return ((NPC) this).anIntArray10585[i];
	}

	public int method16189(int i) {
		return ((NPC) this).anIntArray10586[i];
	}

	public void method16190(int i, int i_77_, int i_78_) {
		((NPC) this).anIntArray10585[i] = i_77_;
		((NPC) this).anIntArray10586[i] = i_78_;
	}

	public void method16191(int i, int i_79_, int i_80_) {
		((NPC) this).anIntArray10585[i] = i_79_;
		((NPC) this).anIntArray10586[i] = i_80_;
	}

	public void method16192(int i, int i_81_, int i_82_) {
		((NPC) this).anIntArray10585[i] = i_81_;
		((NPC) this).anIntArray10586[i] = i_82_;
	}

	public int method15806() {
		return 1 + anInt10314 * -1691508299;
	}

	public NPC(Class206 class206) {
		super(class206);
		anInt10577 = 1084745433;
		anInt10583 = -371839573;
		anInt10576 = -1761803989;
		anInt10575 = 1914841399;
		aClass153_10579 = new Class153(32);
		((NPC) this).anIntArray10585 = new int[6];
		((NPC) this).anIntArray10586 = new int[6];
		method16156((byte) 15);
	}
}
