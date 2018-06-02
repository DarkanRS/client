/* Class521_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Animable extends Class521_Sub1_Sub1 {
	boolean aBool10312;
	static final int anInt10313 = 5;
	public int anInt10314;
	int anInt10315 = -2140159477;
	public int[] anIntArray10316;
	int anInt10317 = -1172406272;
	public boolean aBool10318 = true;
	public int anInt10319 = 0;
	static final int anInt10320 = 20;
	public int anInt10321;
	int anInt10322;
	int anInt10323;
	public Class98 aClass98_10324;
	int anInt10325;
	public int anInt10326;
	public byte aByte10327;
	public int anInt10328;
	public int[] anIntArray10329;
	public Class19 aClass19_10330;
	public int[] anIntArray10331;
	public int[] anIntArray10332;
	public Class457 aClass457_10333;
	Class163 aClass163_10334;
	public int[] anIntArray10335;
	public int[] regionBaseY;
	public Class456_Sub3 aClass456_Sub3_10337;
	public Class456 aClass456_10338;
	public Class161[] aClass161Array10339;
	public int anInt10340;
	public int anInt10341;
	public int anInt10342;
	public int anInt10343;
	int anInt10344;
	public int anInt10345;
	public int anInt10346;
	public int anInt10347;
	public int anInt10348;
	public int anInt10349;
	public int[] anIntArray10350;
	public int[] anIntArray10351;
	public byte aByte10352;
	public int anInt10353;
	public Class456_Sub2_Sub1[] aClass456_Sub2_Sub1Array10354;
	public int anInt10355;
	public int[] regionBaseX;
	public int anInt10357;
	byte aByte10358;
	public Class19 aClass19_10359;
	public Class19 aClass19_10360;
	public int anInt10361;
	public int[] anIntArray10362;
	int anInt10363;
	public byte aByte10364;
	public byte[] aByteArray10365;
	public int anInt10366;
	public int anInt10367;
	public int anInt10368;
	Class539 aClass539_10369;
	boolean aBool10370;
	public byte aByte10371;
	public MeshRasterizer[] aClass528Array10372;
	public int faceEntity;
	public int anInt10374;
	public int anInt10375 = -1305000051;

	public void method15791(int i, boolean bool, byte i_0_) {
		Class227 class227 = method15855((byte) -17);
		if (bool || class227.anInt2820 * 729582379 != 0 || anInt10340 * 455380417 != 0) {
			anInt10361 = (i & 0x3fff) * 484383169;
			aClass19_10359.method577(1633416769 * anInt10361, 836947093);
		}
	}

	boolean method15792() {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}

	public void method15793(int i, int i_1_, boolean bool) {
		if (method15900(-891096831))
			InteractableObject.method16099((aClass98_10324.aClass118Array998), -1, i, i_1_, bool, (byte) 2);
	}

	public int method13017() {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	boolean method12987(int i) {
		return ((Animable) this).aBool10312;
	}

	public abstract int method15794(int i);

	public void method15795(int i, int i_2_, boolean bool, byte i_3_) {
		if (method15900(-1083675262))
			InteractableObject.method16099((aClass98_10324.aClass118Array998), -1, i, i_2_, bool, (byte) 33);
	}

	public int method15796(byte i) {
		Class227 class227 = method15855((byte) -17);
		int i_4_ = 1040633965 * aClass19_10359.anInt153;
		boolean bool;
		if (0 != class227.anInt2820 * 729582379)
			bool = aClass19_10359.method576(1633416769 * anInt10361, 729582379 * class227.anInt2820, class227.anInt2804 * -728054019, 1656393893);
		else
			bool = aClass19_10359.method576(anInt10361 * 1633416769, 455380417 * anInt10340, 455380417 * anInt10340, 1676023529);
		int i_5_ = aClass19_10359.anInt153 * 1040633965 - i_4_;
		if (0 != i_5_)
			anInt10357 += -589413125;
		else {
			anInt10357 = 0;
			aClass19_10359.method577(1633416769 * anInt10361, 2019707046);
		}
		if (bool) {
			if (2028234633 * class227.anInt2825 != 0) {
				if (i_5_ > 0)
					aClass19_10360.method576(-1949451929 * class227.anInt2824, class227.anInt2825 * 2028234633, -947368133 * class227.anInt2823, 1659264135);
				else
					aClass19_10360.method576(-(-1949451929 * class227.anInt2824), 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1639499103);
			}
			if (0 != -1218558443 * class227.anInt2816)
				aClass19_10330.method576(class227.anInt2827 * -373642049, -1218558443 * class227.anInt2816, 269392411 * class227.anInt2815, 1666619993);
		} else {
			if (0 != class227.anInt2825 * 2028234633)
				aClass19_10360.method576(0, 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 2114745339);
			else
				aClass19_10360.method577(0, 1751012412);
			if (class227.anInt2816 * -1218558443 != 0)
				aClass19_10330.method576(0, class227.anInt2816 * -1218558443, 269392411 * class227.anInt2815, 1643131619);
			else
				aClass19_10330.method577(0, 1690575668);
		}
		return i_5_;
	}

	public void method15797(int[] is, int[] is_6_, int i) {
		if (anIntArray10335 == null && is != null)
			anIntArray10335 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
		else if (is == null) {
			anIntArray10335 = null;
			return;
		}
		for (int i_7_ = 0; i_7_ < anIntArray10335.length; i_7_++)
			anIntArray10335[i_7_] = -1;
		for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
			int i_9_ = is_6_[i_8_];
			int i_10_ = 0;
			while (i_10_ < anIntArray10335.length) {
				if ((i_9_ & 0x1) != 0)
					anIntArray10335[i_10_] = is[i_8_];
				i_10_++;
				i_9_ >>= 1;
			}
		}
	}

	public boolean method15798(int i, int i_11_, short i_12_) {
		if (anIntArray10362 == null) {
			if (-1 == i_11_)
				return true;
			anIntArray10362 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
			for (int i_13_ = 0; i_13_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_13_++)
				anIntArray10362[i_13_] = -1;
		}
		Class227 class227 = method15855((byte) -17);
		int i_14_ = 256;
		if (class227.anIntArray2818 != null && class227.anIntArray2818[i] > 0)
			i_14_ = class227.anIntArray2818[i];
		if (-1 == i_11_) {
			if (anIntArray10362[i] == -1)
				return true;
			int i_15_ = aClass19_10359.method578((byte) 2);
			int i_16_ = anIntArray10362[i];
			int i_17_ = i_15_ - i_16_;
			if (i_17_ >= -i_14_ && i_17_ <= i_14_) {
				anIntArray10362[i] = -1;
				for (int i_18_ = 0; i_18_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_18_++) {
					if (-1 != anIntArray10362[i_18_])
						return true;
				}
				anIntArray10362 = null;
				return true;
			}
			if (i_17_ > 0 && i_17_ <= 8192 || i_17_ <= -8192)
				anIntArray10362[i] = i_16_ + i_14_ & 0x3fff;
			else
				anIntArray10362[i] = i_16_ - i_14_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray10362[i])
			anIntArray10362[i] = aClass19_10359.method578((byte) 2);
		int i_19_ = anIntArray10362[i];
		int i_20_ = i_11_ - i_19_;
		if (i_20_ >= -i_14_ && i_20_ <= i_14_) {
			anIntArray10362[i] = i_11_;
			return true;
		}
		if (i_20_ > 0 && i_20_ <= 8192 || i_20_ <= -8192)
			anIntArray10362[i] = i_19_ + i_14_ & 0x3fff;
		else
			anIntArray10362[i] = i_19_ - i_14_ & 0x3fff;
		return false;
	}

	void method15799(GraphicalRenderer class505, MeshRasterizer[] class528s, Class294 class294, boolean bool, byte i) {
		if (!bool) {
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = 0;
			int i_25_ = -1;
			int i_26_ = -1;
			Class87[][] class87s = new Class87[class528s.length][];
			Class172[][] class172s = new Class172[class528s.length][];
			for (int i_27_ = 0; i_27_ < class528s.length; i_27_++) {
				if (null != class528s[i_27_]) {
					class528s[i_27_].method11273(class294);
					class87s[i_27_] = class528s[i_27_].method11253();
					class172s[i_27_] = class528s[i_27_].method11274();
					if (class87s[i_27_] != null) {
						i_25_ = i_27_;
						i_22_++;
						i_21_ += class87s[i_27_].length;
					}
					if (null != class172s[i_27_]) {
						i_26_ = i_27_;
						i_24_++;
						i_23_ += class172s[i_27_].length;
					}
				}
			}
			if ((((Animable) this).aClass539_10369 == null || ((Animable) this).aClass539_10369.aBool7132) && (i_22_ > 0 || i_24_ > 0))
				((Animable) this).aClass539_10369 = Class539.method11557(-1809259861 * client.cycles, true);
			if (null != ((Animable) this).aClass539_10369) {
				Object object = null;
				Class87[] class87s_28_;
				if (1 == i_22_)
					class87s_28_ = class87s[i_25_];
				else {
					class87s_28_ = new Class87[i_21_];
					int i_29_ = 0;
					for (int i_30_ = 0; i_30_ < class528s.length; i_30_++) {
						if (class87s[i_30_] != null) {
							System.arraycopy(class87s[i_30_], 0, class87s_28_, i_29_, class87s[i_30_].length);
							i_29_ += class87s[i_30_].length;
						}
					}
				}
				Object object_31_ = null;
				Class172[] class172s_32_;
				if (1 == i_24_)
					class172s_32_ = class172s[i_26_];
				else {
					class172s_32_ = new Class172[i_23_];
					int i_33_ = 0;
					for (int i_34_ = 0; i_34_ < class528s.length; i_34_++) {
						if (null != class172s[i_34_]) {
							System.arraycopy(class172s[i_34_], 0, class172s_32_, i_33_, class172s[i_34_].length);
							i_33_ += class172s[i_34_].length;
						}
					}
				}
				((Animable) this).aClass539_10369.method11511(class505, (long) (-1809259861 * client.cycles), class87s_28_, class172s_32_, false);
				((Animable) this).aBool10370 = true;
			}
		} else if (((Animable) this).aClass539_10369 != null)
			((Animable) this).aClass539_10369.method11512((long) (client.cycles * -1809259861));
		if (((Animable) this).aClass539_10369 != null)
			((Animable) this).aClass539_10369.method11515(aByte7967, aShort9458, aShort9455, aShort9456, aShort9457);
	}

	public final void sendGraphics(int i, int i_35_, int i_36_, int i_37_, boolean bool, int i_38_, int i_39_) {
		Class161 class161 = aClass161Array10339[i_38_];
		int i_40_ = 378836105 * class161.anInt2012;
		if (-1 != i && -1 != i_40_) {
			if (i == i_40_) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(i, (byte) -32);
				if (class525.aBool6968 && -1 != class525.anInt6977 * -364555849) {
					AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205(((class525.anInt6977) * -364555849), (byte) 21);
					int i_41_ = 554947543 * class518.anInt5907;
					if (0 == i_41_)
						return;
					if (2 == i_41_) {
						class161.aClass456_2014.method7584(955077688);
						return;
					}
				}
			} else {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(i, (byte) 36);
				Class525 class525_42_ = IndexLoaders.aClass515_9416.method8845(i_40_, (byte) -6);
				if (-1 != class525.anInt6977 * -364555849 && class525_42_.anInt6977 * -364555849 != -1) {
					AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((-364555849 * (class525.anInt6977)), (byte) -33);
					AnimationDefinitions class518_43_ = IndexLoaders.aClass523_3868.method11205(((class525_42_.anInt6977) * -364555849), (byte) 13);
					if (-1834317435 * class518.anInt5916 < -1834317435 * class518_43_.anInt5916)
						return;
				}
			}
		}
		int i_44_ = 0;
		if (-1 != i && !(IndexLoaders.aClass515_9416.method8845(i, (byte) 62).aBool6968))
			i_44_ = 2;
		if (i != -1 && bool)
			i_44_ = 1;
		class161.anInt2012 = i * -1025302087;
		class161.anInt2011 = -523477979 * i_37_;
		class161.anInt2013 = (i_35_ >> 16) * 391696483;
		class161.anInt2015 = i_36_ * 1859279795;
		class161.aClass456_2014.method7571((-1 != i ? ((IndexLoaders.aClass515_9416.method8845(i, (byte) -71).anInt6977) * -364555849) : -1), i_35_ & 0xffff, i_44_, false, -1358660139);
	}

	public final void method15801(int i) {
		anInt10355 = 0;
		anInt10367 = 0;
	}

	public final void applyHit(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		boolean bool = true;
		boolean bool_51_ = true;
		for (int i_52_ = 0; i_52_ < Class58.aClass529_527.anInt7026 * -1141871871; i_52_++) {
			if (anIntArray10351[i_52_] > i_48_)
				bool = false;
			else
				bool_51_ = false;
		}
		int i_53_ = -1;
		int i_54_ = -1;
		int i_55_ = 0;
		if (i >= 0) {
			HitsplatDefinitions class228 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(i, 1856651955);
			i_54_ = -1638316243 * class228.anInt2839;
			i_55_ = class228.anInt2841 * -1006911631;
		}
		if (bool_51_) {
			if (i_54_ == -1)
				return;
			i_53_ = 0;
			int i_56_ = 0;
			if (0 == i_54_)
				i_56_ = anIntArray10351[0];
			else if (1 == i_54_)
				i_56_ = anIntArray10329[0];
			for (int i_57_ = 1; i_57_ < Class58.aClass529_527.anInt7026 * -1141871871; i_57_++) {
				if (i_54_ == 0) {
					if (anIntArray10351[i_57_] < i_56_) {
						i_53_ = i_57_;
						i_56_ = anIntArray10351[i_57_];
					}
				} else if (1 == i_54_ && anIntArray10329[i_57_] < i_56_) {
					i_53_ = i_57_;
					i_56_ = anIntArray10329[i_57_];
				}
			}
			if (1 == i_54_ && i_56_ >= i_45_)
				return;
		} else {
			if (bool)
				((Animable) this).aByte10358 = (byte) 0;
			for (int i_58_ = 0; i_58_ < -1141871871 * Class58.aClass529_527.anInt7026; i_58_++) {
				int i_59_ = ((Animable) this).aByte10358;
				((Animable) this).aByte10358 = (byte) ((((Animable) this).aByte10358 + 1) % (Class58.aClass529_527.anInt7026 * -1141871871));
				if (anIntArray10351[i_59_] <= i_48_) {
					i_53_ = i_59_;
					break;
				}
			}
		}
		if (i_53_ >= 0) {
			anIntArray10316[i_53_] = i;
			anIntArray10329[i_53_] = i_45_;
			anIntArray10331[i_53_] = i_46_;
			anIntArray10332[i_53_] = i_47_;
			anIntArray10351[i_53_] = i_55_ + i_48_ + i_49_;
		}
	}

	public final void displayHitbar(int type, int clientCycles, int i_61_, int delay, int startPerc, int endPerc, byte i_65_) {
		HitbarDefinitions hitbarDefs = IndexLoaders.HITBAR_INDEX.getDefinitions(type, -133815568);
		Class275_Sub7 class275_sub7 = null;
		Class275_Sub7 class275_sub7_66_ = null;
		int i_67_ = -1142991979 * hitbarDefs.anInt2440;
		int i_68_ = 0;
		for (Class275_Sub7 class275_sub7_69_ = (Class275_Sub7) aClass457_10333.method7659(301908602); null != class275_sub7_69_; class275_sub7_69_ = (Class275_Sub7) aClass457_10333.method7650((byte) 105)) {
			i_68_++;
			if (class275_sub7_69_.aClass198_7863 == hitbarDefs) {
				class275_sub7_69_.method12601(clientCycles + delay, startPerc, endPerc, i_61_, -555582799);
				return;
			}
			if (class275_sub7_69_.aClass198_7863.anInt2446 * -29546407 <= hitbarDefs.anInt2446 * -29546407)
				class275_sub7 = class275_sub7_69_;
			if (class275_sub7_69_.aClass198_7863.anInt2440 * -1142991979 > i_67_) {
				class275_sub7_66_ = class275_sub7_69_;
				i_67_ = -1142991979 * class275_sub7_69_.aClass198_7863.anInt2440;
			}
		}
		if (null != class275_sub7_66_ || i_68_ < Class58.aClass529_527.anInt7032 * -1838667567) {
			Class275_Sub7 class275_sub7_70_ = new Class275_Sub7(hitbarDefs);
			if (null == class275_sub7)
				aClass457_10333.method7647(class275_sub7_70_, -1998416604);
			else
				Class516.method8866(class275_sub7_70_, class275_sub7, -63118413);
			class275_sub7_70_.method12601(clientCycles + delay, startPerc, endPerc, i_61_, -1371931787);
			if (i_68_ >= Class58.aClass529_527.anInt7032 * -1838667567)
				class275_sub7_66_.method4887((byte) -33);
		}
	}

	boolean method13000() {
		return ((Animable) this).aBool10312;
	}

	public int method12997(int i) {
		Class227 class227 = method15855((byte) -17);
		int i_71_;
		if (class227.anInt2798 * 895441719 != -1)
			i_71_ = 895441719 * class227.anInt2798;
		else if (-32768 == ((Animable) this).anInt10317 * 296631531)
			i_71_ = 200;
		else
			i_71_ = -(296631531 * ((Animable) this).anInt10317);
		Class305 class305 = method11166();
		int i_72_ = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_73_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		if (null != aClass206_7970 && i_72_ >= 1 && i_73_ >= 1 && i_72_ <= IndexLoaders.MAP_REGION_DECODER.method4424(2033491837) - 1 && i_73_ <= IndexLoaders.MAP_REGION_DECODER.method4451(-2135239532) - 1) {
			Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][i_72_][i_73_]);
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null)
				return class293.aClass521_Sub1_Sub3_3499.aShort9561 + i_71_;
		}
		return i_71_;
	}

	public abstract int method15804();

	public int method15805(int i) {
		return ((Animable) this).anInt10315 * 1959344547;
	}

	public void method14697(byte i) {
		int i_74_ = (240 + (1959344547 * ((Animable) this).anInt10315 - 1 << 8));
		Class385 class385 = method11166().aClass385_3595;
		aShort9458 = (short) ((int) class385.aFloat4671 - i_74_ >> 9);
		aShort9456 = (short) ((int) class385.aFloat4673 - i_74_ >> 9);
		aShort9455 = (short) ((int) class385.aFloat4671 + i_74_ >> 9);
		aShort9457 = (short) ((int) class385.aFloat4673 + i_74_ >> 9);
	}

	Animable(SceneObjectManager class206) {
		this(class206, 10);
	}

	public abstract int method15806();

	public void method15807(int i) {
		if (((Animable) this).anInt10344 * 1959466465 != 226532721 * anInt10374)
			method15816((byte) 50);
		((Animable) this).anInt10344 = -321130975 * i;
	}

	boolean method12986(int i) {
		return false;
	}

	abstract int method15808(int i);

	public abstract Class163 method15809();

	public void method14699() {
		int i = (240 + (1959344547 * ((Animable) this).anInt10315 - 1 << 8));
		Class385 class385 = method11166().aClass385_3595;
		aShort9458 = (short) ((int) class385.aFloat4671 - i >> 9);
		aShort9456 = (short) ((int) class385.aFloat4673 - i >> 9);
		aShort9455 = (short) ((int) class385.aFloat4671 + i >> 9);
		aShort9457 = (short) ((int) class385.aFloat4673 + i >> 9);
	}

	public void method15810(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		if (method15900(-412106793))
			client.method11768(aClass98_10324, aClass98_10324.method1616(2133589758), -1, i, i_75_, i_76_, i_77_, i_78_, i_79_, i_80_, i_81_);
	}

	public abstract Class163 method15811(int i);

	public void method15812(int i) {
		if (null != ((Animable) this).aClass163_10334 && (((Class163) ((Animable) this).aClass163_10334).aString2028) != null) {
			((Class163) ((Animable) this).aClass163_10334).anInt2030 -= 1459172487;
			if ((((Class163) ((Animable) this).aClass163_10334).anInt2030) * -1892593353 == 0)
				((Class163) ((Animable) this).aClass163_10334).aString2028 = null;
		}
	}

	public void method15813(int i, byte i_82_) {
		if (((Animable) this).anInt10344 * 1959466465 != 226532721 * anInt10374)
			method15816((byte) 106);
		((Animable) this).anInt10344 = -321130975 * i;
	}

	public abstract boolean method15814();

	boolean method15815(int i, int i_83_) {
		if (anInt10374 * 226532721 == i)
			return true;
		aClass98_10324 = Class288.method5084(i, null, null, true, (byte) -56);
		if (aClass98_10324 == null)
			return false;
		anInt10374 = -1342798959 * i;
		Class202.method3337(aClass98_10324.aClass118Array998, 2088119296);
		return true;
	}

	void method15816(byte i) {
		if (anInt10374 * 226532721 != -1) {
			Class12.method480(226532721 * anInt10374, -1658723672);
			aClass98_10324 = null;
			anInt10374 = 1342798959;
		}
	}

	void method15817() {
		if (anInt10374 * 226532721 != -1) {
			Class12.method480(226532721 * anInt10374, 1697643491);
			aClass98_10324 = null;
			anInt10374 = 1342798959;
		}
	}

	public void method15818(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		if (!method15900(-1887834848)) {
			if (i != -1)
				client.aBoolArray7443[i] = true;
			else {
				for (int i_91_ = 0; i_91_ < 107; i_91_++)
					client.aBoolArray7443[i_91_] = true;
			}
		} else
			GroundDecoration.method16094(aClass98_10324.method1616(2115136308), -1, i_84_, i_85_, i_86_, i_87_, i_88_, i_89_, i, false, (byte) 6);
	}

	void method15819(MeshRasterizer class528, int i) {
		int i_92_ = 1040633965 * aClass19_10360.anInt153;
		int i_93_ = 1040633965 * aClass19_10330.anInt153;
		if (i_92_ != 0 || i_93_ != 0) {
			int i_94_ = class528.YA() / 2;
			class528.ia(0, -i_94_, 0);
			class528.EA(i_92_ & 0x3fff);
			class528.t(i_93_ & 0x3fff);
			class528.ia(0, i_94_, 0);
		}
	}

	void method15820(GraphicalRenderer class505, Class227 class227, int i, int i_95_, int i_96_, int i_97_) {
		for (int i_98_ = 0; i_98_ < aClass161Array10339.length; i_98_++) {
			byte i_99_ = 0;
			if (0 == i_98_)
				i_99_ = (byte) 2;
			else if (1 == i_98_)
				i_99_ = (byte) 5;
			else if (2 == i_98_)
				i_99_ = (byte) 1;
			else if (i_98_ == 3)
				i_99_ = (byte) 7;
			Class161 class161 = aClass161Array10339[i_98_];
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.method7573(1386461400)) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(((class161.anInt2012) * 378836105), (byte) 117);
				boolean bool = 3 == class525.aByte6982 && (0 != i_95_ || 0 != i_96_);
				int i_100_ = i;
				if (bool)
					i_100_ |= 0x7;
				else {
					if (0 != class161.anInt2015 * -43136133)
						i_100_ |= 0x5;
					if (-1576521397 * class161.anInt2013 != 0)
						i_100_ |= 0x2;
					if (-660316243 * class161.anInt2011 >= 0)
						i_100_ |= 0x7;
				}
				MeshRasterizer class528 = (aClass528Array10372[i_98_ + 1] = class525.method11228(class505, i_100_, class161.aClass456_2014, i_99_, (byte) -5));
				if (class528 != null) {
					if (class161.anInt2011 * -660316243 >= 0 && class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[-660316243 * class161.anInt2011])) {
						int i_101_ = 0;
						int i_102_ = 0;
						int i_103_ = 0;
						if (null != class227.anIntArrayArray2802 && (class227.anIntArrayArray2802[-660316243 * class161.anInt2011]) != null) {
							i_101_ += (class227.anIntArrayArray2802[-660316243 * class161.anInt2011][0]);
							i_102_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][1]);
							i_103_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][2]);
						}
						if (null != class227.anIntArrayArray2791 && (class227.anIntArrayArray2791[-660316243 * class161.anInt2011]) != null) {
							i_101_ += (class227.anIntArrayArray2791[-660316243 * class161.anInt2011][0]);
							i_102_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][1]);
							i_103_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][2]);
						}
						if (0 != i_103_ || i_101_ != 0) {
							int i_104_ = i_97_;
							if (anIntArray10362 != null && -1 != (anIntArray10362[class161.anInt2011 * -660316243]))
								i_104_ = (anIntArray10362[class161.anInt2011 * -660316243]);
							int i_105_ = ((class161.anInt2015 * 1851512832 + i_104_ - i_97_) & 0x3fff);
							if (i_105_ != 0)
								class528.f(i_105_);
							int i_106_ = Class382.anIntArray4657[i_105_];
							int i_107_ = Class382.anIntArray4661[i_105_];
							int i_108_ = i_107_ * i_101_ + i_103_ * i_106_ >> 14;
							i_103_ = i_107_ * i_103_ - i_101_ * i_106_ >> 14;
							i_101_ = i_108_;
						}
						class528.ia(i_101_, i_102_, i_103_);
					} else if (-43136133 * class161.anInt2015 != 0)
						class528.f(class161.anInt2015 * 1851512832);
					if (0 != -1576521397 * class161.anInt2013)
						class528.ia(0, -(-1576521397 * class161.anInt2013) << 2, 0);
					if (bool) {
						if ((((Animable) this).anInt10322 * -35614997) != 0)
							class528.t((((Animable) this).anInt10322) * -35614997);
						if (0 != (-1768311789 * ((Animable) this).anInt10323))
							class528.EA((((Animable) this).anInt10323) * -1768311789);
						if (0 != (((Animable) this).anInt10363 * -628205413))
							class528.ia(0, (((Animable) this).anInt10363) * -628205413, 0);
					}
				}
			} else
				aClass528Array10372[1 + i_98_] = null;
		}
	}

	boolean method12999() {
		return false;
	}

	public boolean method15821(int i, int i_109_) {
		if (anIntArray10362 == null) {
			if (-1 == i_109_)
				return true;
			anIntArray10362 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
			for (int i_110_ = 0; i_110_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_110_++)
				anIntArray10362[i_110_] = -1;
		}
		Class227 class227 = method15855((byte) -17);
		int i_111_ = 256;
		if (class227.anIntArray2818 != null && class227.anIntArray2818[i] > 0)
			i_111_ = class227.anIntArray2818[i];
		if (-1 == i_109_) {
			if (anIntArray10362[i] == -1)
				return true;
			int i_112_ = aClass19_10359.method578((byte) 2);
			int i_113_ = anIntArray10362[i];
			int i_114_ = i_112_ - i_113_;
			if (i_114_ >= -i_111_ && i_114_ <= i_111_) {
				anIntArray10362[i] = -1;
				for (int i_115_ = 0; i_115_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_115_++) {
					if (-1 != anIntArray10362[i_115_])
						return true;
				}
				anIntArray10362 = null;
				return true;
			}
			if (i_114_ > 0 && i_114_ <= 8192 || i_114_ <= -8192)
				anIntArray10362[i] = i_113_ + i_111_ & 0x3fff;
			else
				anIntArray10362[i] = i_113_ - i_111_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray10362[i])
			anIntArray10362[i] = aClass19_10359.method578((byte) 2);
		int i_116_ = anIntArray10362[i];
		int i_117_ = i_109_ - i_116_;
		if (i_117_ >= -i_111_ && i_117_ <= i_111_) {
			anIntArray10362[i] = i_109_;
			return true;
		}
		if (i_117_ > 0 && i_117_ <= 8192 || i_117_ <= -8192)
			anIntArray10362[i] = i_116_ + i_111_ & 0x3fff;
		else
			anIntArray10362[i] = i_116_ - i_111_ & 0x3fff;
		return false;
	}

	boolean method13001() {
		return ((Animable) this).aBool10312;
	}

	public Class227 method15822() {
		int i = method15808(635765286);
		if (i == -1)
			return Class211.aClass227_2669;
		return IndexLoaders.aClass211_9383.method3616(i, (byte) 15);
	}

	public int method13003() {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	boolean method13002() {
		return ((Animable) this).aBool10312;
	}

	public int method13005() {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	public void method15823() {
		if (null != ((Animable) this).aClass163_10334 && (((Class163) ((Animable) this).aClass163_10334).aString2028) != null) {
			((Class163) ((Animable) this).aClass163_10334).anInt2030 -= 1459172487;
			if ((((Class163) ((Animable) this).aClass163_10334).anInt2030) * -1892593353 == 0)
				((Class163) ((Animable) this).aClass163_10334).aString2028 = null;
		}
	}

	public int method13007() {
		Class227 class227 = method15855((byte) -17);
		int i;
		if (class227.anInt2798 * 895441719 != -1)
			i = 895441719 * class227.anInt2798;
		else if (-32768 == ((Animable) this).anInt10317 * 296631531)
			i = 200;
		else
			i = -(296631531 * ((Animable) this).anInt10317);
		Class305 class305 = method11166();
		int i_118_ = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_119_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		if (null != aClass206_7970 && i_118_ >= 1 && i_119_ >= 1 && i_118_ <= IndexLoaders.MAP_REGION_DECODER.method4424(1358683385) - 1 && i_119_ <= IndexLoaders.MAP_REGION_DECODER.method4451(-947392385) - 1) {
			Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][i_118_][i_119_]);
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null)
				return class293.aClass521_Sub1_Sub3_3499.aShort9561 + i;
		}
		return i;
	}

	public int method13028() {
		Class227 class227 = method15855((byte) -17);
		int i;
		if (class227.anInt2798 * 895441719 != -1)
			i = 895441719 * class227.anInt2798;
		else if (-32768 == ((Animable) this).anInt10317 * 296631531)
			i = 200;
		else
			i = -(296631531 * ((Animable) this).anInt10317);
		Class305 class305 = method11166();
		int i_120_ = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_121_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		if (null != aClass206_7970 && i_120_ >= 1 && i_121_ >= 1 && i_120_ <= IndexLoaders.MAP_REGION_DECODER.method4424(-1295672030) - 1 && i_121_ <= IndexLoaders.MAP_REGION_DECODER.method4451(-1381064515) - 1) {
			Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[aByte7967][i_120_][i_121_]);
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null)
				return class293.aClass521_Sub1_Sub3_3499.aShort9561 + i;
		}
		return i;
	}

	public void method15824(int i) {
		Class227 class227 = method15855((byte) -17);
		if (class227.anInt2820 * 729582379 != 0 || 0 != 455380417 * anInt10340) {
			aClass19_10359.method579(1727887159);
			int i_122_ = i - 1040633965 * aClass19_10359.anInt153 & 0x3fff;
			if (i_122_ > 8192)
				anInt10361 = 484383169 * (1040633965 * aClass19_10359.anInt153 - (16384 - i_122_));
			else
				anInt10361 = ((i_122_ + 1040633965 * aClass19_10359.anInt153) * 484383169);
		}
	}

	public void method15825(int i, boolean bool) {
		Class227 class227 = method15855((byte) -17);
		if (bool || class227.anInt2820 * 729582379 != 0 || anInt10340 * 455380417 != 0) {
			anInt10361 = (i & 0x3fff) * 484383169;
			aClass19_10359.method577(1633416769 * anInt10361, 2070462330);
		}
	}

	public void method15826(int i, boolean bool) {
		Class227 class227 = method15855((byte) -17);
		if (bool || class227.anInt2820 * 729582379 != 0 || anInt10340 * 455380417 != 0) {
			anInt10361 = (i & 0x3fff) * 484383169;
			aClass19_10359.method577(1633416769 * anInt10361, 1408391664);
		}
	}

	public boolean method15827(int i, int i_123_) {
		if (anIntArray10362 == null) {
			if (-1 == i_123_)
				return true;
			anIntArray10362 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
			for (int i_124_ = 0; i_124_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_124_++)
				anIntArray10362[i_124_] = -1;
		}
		Class227 class227 = method15855((byte) -17);
		int i_125_ = 256;
		if (class227.anIntArray2818 != null && class227.anIntArray2818[i] > 0)
			i_125_ = class227.anIntArray2818[i];
		if (-1 == i_123_) {
			if (anIntArray10362[i] == -1)
				return true;
			int i_126_ = aClass19_10359.method578((byte) 2);
			int i_127_ = anIntArray10362[i];
			int i_128_ = i_126_ - i_127_;
			if (i_128_ >= -i_125_ && i_128_ <= i_125_) {
				anIntArray10362[i] = -1;
				for (int i_129_ = 0; i_129_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_129_++) {
					if (-1 != anIntArray10362[i_129_])
						return true;
				}
				anIntArray10362 = null;
				return true;
			}
			if (i_128_ > 0 && i_128_ <= 8192 || i_128_ <= -8192)
				anIntArray10362[i] = i_127_ + i_125_ & 0x3fff;
			else
				anIntArray10362[i] = i_127_ - i_125_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray10362[i])
			anIntArray10362[i] = aClass19_10359.method578((byte) 2);
		int i_130_ = anIntArray10362[i];
		int i_131_ = i_123_ - i_130_;
		if (i_131_ >= -i_125_ && i_131_ <= i_125_) {
			anIntArray10362[i] = i_123_;
			return true;
		}
		if (i_131_ > 0 && i_131_ <= 8192 || i_131_ <= -8192)
			anIntArray10362[i] = i_130_ + i_125_ & 0x3fff;
		else
			anIntArray10362[i] = i_130_ - i_125_ & 0x3fff;
		return false;
	}

	public int method15828() {
		Class227 class227 = method15855((byte) -17);
		int i = 1040633965 * aClass19_10359.anInt153;
		boolean bool;
		if (0 != class227.anInt2820 * 729582379)
			bool = aClass19_10359.method576(1633416769 * anInt10361, 729582379 * class227.anInt2820, class227.anInt2804 * -728054019, 2061091756);
		else
			bool = aClass19_10359.method576(anInt10361 * 1633416769, 455380417 * anInt10340, 455380417 * anInt10340, 2044359804);
		int i_132_ = aClass19_10359.anInt153 * 1040633965 - i;
		if (0 != i_132_)
			anInt10357 += -589413125;
		else {
			anInt10357 = 0;
			aClass19_10359.method577(1633416769 * anInt10361, 1593045946);
		}
		if (bool) {
			if (2028234633 * class227.anInt2825 != 0) {
				if (i_132_ > 0)
					aClass19_10360.method576(-1949451929 * class227.anInt2824, class227.anInt2825 * 2028234633, -947368133 * class227.anInt2823, 1884644126);
				else
					aClass19_10360.method576(-(-1949451929 * class227.anInt2824), 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1904446945);
			}
			if (0 != -1218558443 * class227.anInt2816)
				aClass19_10330.method576(class227.anInt2827 * -373642049, -1218558443 * class227.anInt2816, 269392411 * class227.anInt2815, 1591704319);
		} else {
			if (0 != class227.anInt2825 * 2028234633)
				aClass19_10360.method576(0, 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1782347813);
			else
				aClass19_10360.method577(0, 1236441234);
			if (class227.anInt2816 * -1218558443 != 0)
				aClass19_10330.method576(0, class227.anInt2816 * -1218558443, 269392411 * class227.anInt2815, 1764826786);
			else
				aClass19_10330.method577(0, 1316092154);
		}
		return i_132_;
	}

	public int method15829() {
		Class227 class227 = method15855((byte) -17);
		int i = 1040633965 * aClass19_10359.anInt153;
		boolean bool;
		if (0 != class227.anInt2820 * 729582379)
			bool = aClass19_10359.method576(1633416769 * anInt10361, 729582379 * class227.anInt2820, class227.anInt2804 * -728054019, 1730466217);
		else
			bool = aClass19_10359.method576(anInt10361 * 1633416769, 455380417 * anInt10340, 455380417 * anInt10340, 1558705219);
		int i_133_ = aClass19_10359.anInt153 * 1040633965 - i;
		if (0 != i_133_)
			anInt10357 += -589413125;
		else {
			anInt10357 = 0;
			aClass19_10359.method577(1633416769 * anInt10361, 1246639686);
		}
		if (bool) {
			if (2028234633 * class227.anInt2825 != 0) {
				if (i_133_ > 0)
					aClass19_10360.method576(-1949451929 * class227.anInt2824, class227.anInt2825 * 2028234633, -947368133 * class227.anInt2823, 1699952626);
				else
					aClass19_10360.method576(-(-1949451929 * class227.anInt2824), 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 2047908564);
			}
			if (0 != -1218558443 * class227.anInt2816)
				aClass19_10330.method576(class227.anInt2827 * -373642049, -1218558443 * class227.anInt2816, 269392411 * class227.anInt2815, 2084224753);
		} else {
			if (0 != class227.anInt2825 * 2028234633)
				aClass19_10360.method576(0, 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1676514548);
			else
				aClass19_10360.method577(0, 1585082513);
			if (class227.anInt2816 * -1218558443 != 0)
				aClass19_10330.method576(0, class227.anInt2816 * -1218558443, 269392411 * class227.anInt2815, 1953301418);
			else
				aClass19_10330.method577(0, 1798985860);
		}
		return i_133_;
	}

	public int method15830() {
		Class227 class227 = method15855((byte) -17);
		int i = 1040633965 * aClass19_10359.anInt153;
		boolean bool;
		if (0 != class227.anInt2820 * 729582379)
			bool = aClass19_10359.method576(1633416769 * anInt10361, 729582379 * class227.anInt2820, class227.anInt2804 * -728054019, 1933203232);
		else
			bool = aClass19_10359.method576(anInt10361 * 1633416769, 455380417 * anInt10340, 455380417 * anInt10340, 1593469988);
		int i_134_ = aClass19_10359.anInt153 * 1040633965 - i;
		if (0 != i_134_)
			anInt10357 += -589413125;
		else {
			anInt10357 = 0;
			aClass19_10359.method577(1633416769 * anInt10361, 627382973);
		}
		if (bool) {
			if (2028234633 * class227.anInt2825 != 0) {
				if (i_134_ > 0)
					aClass19_10360.method576(-1949451929 * class227.anInt2824, class227.anInt2825 * 2028234633, -947368133 * class227.anInt2823, 1808018678);
				else
					aClass19_10360.method576(-(-1949451929 * class227.anInt2824), 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1898042915);
			}
			if (0 != -1218558443 * class227.anInt2816)
				aClass19_10330.method576(class227.anInt2827 * -373642049, -1218558443 * class227.anInt2816, 269392411 * class227.anInt2815, 1538258049);
		} else {
			if (0 != class227.anInt2825 * 2028234633)
				aClass19_10360.method576(0, 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1898645977);
			else
				aClass19_10360.method577(0, 352304896);
			if (class227.anInt2816 * -1218558443 != 0)
				aClass19_10330.method576(0, class227.anInt2816 * -1218558443, 269392411 * class227.anInt2815, 1792180686);
			else
				aClass19_10330.method577(0, 752680935);
		}
		return i_134_;
	}

	public void method15831(int[] is, int[] is_135_) {
		if (anIntArray10335 == null && is != null)
			anIntArray10335 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
		else if (is == null) {
			anIntArray10335 = null;
			return;
		}
		for (int i = 0; i < anIntArray10335.length; i++)
			anIntArray10335[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_136_ = is_135_[i];
			int i_137_ = 0;
			while (i_137_ < anIntArray10335.length) {
				if ((i_136_ & 0x1) != 0)
					anIntArray10335[i_137_] = is[i];
				i_137_++;
				i_136_ >>= 1;
			}
		}
	}

	public void method15832(int[] is, int[] is_138_) {
		if (anIntArray10335 == null && is != null)
			anIntArray10335 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
		else if (is == null) {
			anIntArray10335 = null;
			return;
		}
		for (int i = 0; i < anIntArray10335.length; i++)
			anIntArray10335[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_139_ = is_138_[i];
			int i_140_ = 0;
			while (i_140_ < anIntArray10335.length) {
				if ((i_139_ & 0x1) != 0)
					anIntArray10335[i_140_] = is[i];
				i_140_++;
				i_139_ >>= 1;
			}
		}
	}

	public void method15833(int[] is, int[] is_141_) {
		if (anIntArray10335 == null && is != null)
			anIntArray10335 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
		else if (is == null) {
			anIntArray10335 = null;
			return;
		}
		for (int i = 0; i < anIntArray10335.length; i++)
			anIntArray10335[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_142_ = is_141_[i];
			int i_143_ = 0;
			while (i_143_ < anIntArray10335.length) {
				if ((i_142_ & 0x1) != 0)
					anIntArray10335[i_143_] = is[i];
				i_143_++;
				i_142_ >>= 1;
			}
		}
	}

	public void method15834(int[] is, int[] is_144_) {
		if (anIntArray10335 == null && is != null)
			anIntArray10335 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
		else if (is == null) {
			anIntArray10335 = null;
			return;
		}
		for (int i = 0; i < anIntArray10335.length; i++)
			anIntArray10335[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_145_ = is_144_[i];
			int i_146_ = 0;
			while (i_146_ < anIntArray10335.length) {
				if ((i_145_ & 0x1) != 0)
					anIntArray10335[i_146_] = is[i];
				i_146_++;
				i_145_ >>= 1;
			}
		}
	}

	public boolean method15835(int i, int i_147_) {
		if (anIntArray10362 == null) {
			if (-1 == i_147_)
				return true;
			anIntArray10362 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
			for (int i_148_ = 0; i_148_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_148_++)
				anIntArray10362[i_148_] = -1;
		}
		Class227 class227 = method15855((byte) -17);
		int i_149_ = 256;
		if (class227.anIntArray2818 != null && class227.anIntArray2818[i] > 0)
			i_149_ = class227.anIntArray2818[i];
		if (-1 == i_147_) {
			if (anIntArray10362[i] == -1)
				return true;
			int i_150_ = aClass19_10359.method578((byte) 2);
			int i_151_ = anIntArray10362[i];
			int i_152_ = i_150_ - i_151_;
			if (i_152_ >= -i_149_ && i_152_ <= i_149_) {
				anIntArray10362[i] = -1;
				for (int i_153_ = 0; i_153_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_153_++) {
					if (-1 != anIntArray10362[i_153_])
						return true;
				}
				anIntArray10362 = null;
				return true;
			}
			if (i_152_ > 0 && i_152_ <= 8192 || i_152_ <= -8192)
				anIntArray10362[i] = i_151_ + i_149_ & 0x3fff;
			else
				anIntArray10362[i] = i_151_ - i_149_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray10362[i])
			anIntArray10362[i] = aClass19_10359.method578((byte) 2);
		int i_154_ = anIntArray10362[i];
		int i_155_ = i_147_ - i_154_;
		if (i_155_ >= -i_149_ && i_155_ <= i_149_) {
			anIntArray10362[i] = i_147_;
			return true;
		}
		if (i_155_ > 0 && i_155_ <= 8192 || i_155_ <= -8192)
			anIntArray10362[i] = i_154_ + i_149_ & 0x3fff;
		else
			anIntArray10362[i] = i_154_ - i_149_ & 0x3fff;
		return false;
	}

	public void method15836(int i, byte i_156_) {
		((Animable) this).anInt10315 = -2140159477 * i;
	}

	void method15837(GraphicalRenderer class505, Class227 class227, int i, int i_157_, int i_158_, int i_159_, byte i_160_) {
		for (int i_161_ = 0; i_161_ < aClass161Array10339.length; i_161_++) {
			byte i_162_ = 0;
			if (0 == i_161_)
				i_162_ = (byte) 2;
			else if (1 == i_161_)
				i_162_ = (byte) 5;
			else if (2 == i_161_)
				i_162_ = (byte) 1;
			else if (i_161_ == 3)
				i_162_ = (byte) 7;
			Class161 class161 = aClass161Array10339[i_161_];
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.method7573(-544447199)) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(((class161.anInt2012) * 378836105), (byte) 62);
				boolean bool = 3 == class525.aByte6982 && (0 != i_157_ || 0 != i_158_);
				int i_163_ = i;
				if (bool)
					i_163_ |= 0x7;
				else {
					if (0 != class161.anInt2015 * -43136133)
						i_163_ |= 0x5;
					if (-1576521397 * class161.anInt2013 != 0)
						i_163_ |= 0x2;
					if (-660316243 * class161.anInt2011 >= 0)
						i_163_ |= 0x7;
				}
				MeshRasterizer class528 = (aClass528Array10372[i_161_ + 1] = class525.method11228(class505, i_163_, class161.aClass456_2014, i_162_, (byte) 53));
				if (class528 != null) {
					if (class161.anInt2011 * -660316243 >= 0 && class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[-660316243 * class161.anInt2011])) {
						int i_164_ = 0;
						int i_165_ = 0;
						int i_166_ = 0;
						if (null != class227.anIntArrayArray2802 && (class227.anIntArrayArray2802[-660316243 * class161.anInt2011]) != null) {
							i_164_ += (class227.anIntArrayArray2802[-660316243 * class161.anInt2011][0]);
							i_165_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][1]);
							i_166_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][2]);
						}
						if (null != class227.anIntArrayArray2791 && (class227.anIntArrayArray2791[-660316243 * class161.anInt2011]) != null) {
							i_164_ += (class227.anIntArrayArray2791[-660316243 * class161.anInt2011][0]);
							i_165_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][1]);
							i_166_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][2]);
						}
						if (0 != i_166_ || i_164_ != 0) {
							int i_167_ = i_159_;
							if (anIntArray10362 != null && -1 != (anIntArray10362[class161.anInt2011 * -660316243]))
								i_167_ = (anIntArray10362[class161.anInt2011 * -660316243]);
							int i_168_ = ((class161.anInt2015 * 1851512832 + i_167_ - i_159_) & 0x3fff);
							if (i_168_ != 0)
								class528.f(i_168_);
							int i_169_ = Class382.anIntArray4657[i_168_];
							int i_170_ = Class382.anIntArray4661[i_168_];
							int i_171_ = i_170_ * i_164_ + i_166_ * i_169_ >> 14;
							i_166_ = i_170_ * i_166_ - i_164_ * i_169_ >> 14;
							i_164_ = i_171_;
						}
						class528.ia(i_164_, i_165_, i_166_);
					} else if (-43136133 * class161.anInt2015 != 0)
						class528.f(class161.anInt2015 * 1851512832);
					if (0 != -1576521397 * class161.anInt2013)
						class528.ia(0, -(-1576521397 * class161.anInt2013) << 2, 0);
					if (bool) {
						if ((((Animable) this).anInt10322 * -35614997) != 0)
							class528.t((((Animable) this).anInt10322) * -35614997);
						if (0 != (-1768311789 * ((Animable) this).anInt10323))
							class528.EA((((Animable) this).anInt10323) * -1768311789);
						if (0 != (((Animable) this).anInt10363 * -628205413))
							class528.ia(0, (((Animable) this).anInt10363) * -628205413, 0);
					}
				}
			} else
				aClass528Array10372[1 + i_161_] = null;
		}
	}

	public void method15838(int i) {
		((Animable) this).anInt10315 = -2140159477 * i;
	}

	void method15839(GraphicalRenderer class505, MeshRasterizer[] class528s, Class294 class294, boolean bool) {
		if (!bool) {
			int i = 0;
			int i_172_ = 0;
			int i_173_ = 0;
			int i_174_ = 0;
			int i_175_ = -1;
			int i_176_ = -1;
			Class87[][] class87s = new Class87[class528s.length][];
			Class172[][] class172s = new Class172[class528s.length][];
			for (int i_177_ = 0; i_177_ < class528s.length; i_177_++) {
				if (null != class528s[i_177_]) {
					class528s[i_177_].method11273(class294);
					class87s[i_177_] = class528s[i_177_].method11253();
					class172s[i_177_] = class528s[i_177_].method11274();
					if (class87s[i_177_] != null) {
						i_175_ = i_177_;
						i_172_++;
						i += class87s[i_177_].length;
					}
					if (null != class172s[i_177_]) {
						i_176_ = i_177_;
						i_174_++;
						i_173_ += class172s[i_177_].length;
					}
				}
			}
			if ((((Animable) this).aClass539_10369 == null || ((Animable) this).aClass539_10369.aBool7132) && (i_172_ > 0 || i_174_ > 0))
				((Animable) this).aClass539_10369 = Class539.method11557(-1809259861 * client.cycles, true);
			if (null != ((Animable) this).aClass539_10369) {
				Object object = null;
				Class87[] class87s_178_;
				if (1 == i_172_)
					class87s_178_ = class87s[i_175_];
				else {
					class87s_178_ = new Class87[i];
					int i_179_ = 0;
					for (int i_180_ = 0; i_180_ < class528s.length; i_180_++) {
						if (class87s[i_180_] != null) {
							System.arraycopy(class87s[i_180_], 0, class87s_178_, i_179_, class87s[i_180_].length);
							i_179_ += class87s[i_180_].length;
						}
					}
				}
				Object object_181_ = null;
				Class172[] class172s_182_;
				if (1 == i_174_)
					class172s_182_ = class172s[i_176_];
				else {
					class172s_182_ = new Class172[i_173_];
					int i_183_ = 0;
					for (int i_184_ = 0; i_184_ < class528s.length; i_184_++) {
						if (null != class172s[i_184_]) {
							System.arraycopy(class172s[i_184_], 0, class172s_182_, i_183_, class172s[i_184_].length);
							i_183_ += class172s[i_184_].length;
						}
					}
				}
				((Animable) this).aClass539_10369.method11511(class505, (long) (-1809259861 * client.cycles), class87s_178_, class172s_182_, false);
				((Animable) this).aBool10370 = true;
			}
		} else if (((Animable) this).aClass539_10369 != null)
			((Animable) this).aClass539_10369.method11512((long) (client.cycles * -1809259861));
		if (((Animable) this).aClass539_10369 != null)
			((Animable) this).aClass539_10369.method11515(aByte7967, aShort9458, aShort9455, aShort9456, aShort9457);
	}

	void method15840(GraphicalRenderer class505, MeshRasterizer[] class528s, Class294 class294, boolean bool) {
		if (!bool) {
			int i = 0;
			int i_185_ = 0;
			int i_186_ = 0;
			int i_187_ = 0;
			int i_188_ = -1;
			int i_189_ = -1;
			Class87[][] class87s = new Class87[class528s.length][];
			Class172[][] class172s = new Class172[class528s.length][];
			for (int i_190_ = 0; i_190_ < class528s.length; i_190_++) {
				if (null != class528s[i_190_]) {
					class528s[i_190_].method11273(class294);
					class87s[i_190_] = class528s[i_190_].method11253();
					class172s[i_190_] = class528s[i_190_].method11274();
					if (class87s[i_190_] != null) {
						i_188_ = i_190_;
						i_185_++;
						i += class87s[i_190_].length;
					}
					if (null != class172s[i_190_]) {
						i_189_ = i_190_;
						i_187_++;
						i_186_ += class172s[i_190_].length;
					}
				}
			}
			if ((((Animable) this).aClass539_10369 == null || ((Animable) this).aClass539_10369.aBool7132) && (i_185_ > 0 || i_187_ > 0))
				((Animable) this).aClass539_10369 = Class539.method11557(-1809259861 * client.cycles, true);
			if (null != ((Animable) this).aClass539_10369) {
				Object object = null;
				Class87[] class87s_191_;
				if (1 == i_185_)
					class87s_191_ = class87s[i_188_];
				else {
					class87s_191_ = new Class87[i];
					int i_192_ = 0;
					for (int i_193_ = 0; i_193_ < class528s.length; i_193_++) {
						if (class87s[i_193_] != null) {
							System.arraycopy(class87s[i_193_], 0, class87s_191_, i_192_, class87s[i_193_].length);
							i_192_ += class87s[i_193_].length;
						}
					}
				}
				Object object_194_ = null;
				Class172[] class172s_195_;
				if (1 == i_187_)
					class172s_195_ = class172s[i_189_];
				else {
					class172s_195_ = new Class172[i_186_];
					int i_196_ = 0;
					for (int i_197_ = 0; i_197_ < class528s.length; i_197_++) {
						if (null != class172s[i_197_]) {
							System.arraycopy(class172s[i_197_], 0, class172s_195_, i_196_, class172s[i_197_].length);
							i_196_ += class172s[i_197_].length;
						}
					}
				}
				((Animable) this).aClass539_10369.method11511(class505, (long) (-1809259861 * client.cycles), class87s_191_, class172s_195_, false);
				((Animable) this).aBool10370 = true;
			}
		} else if (((Animable) this).aClass539_10369 != null)
			((Animable) this).aClass539_10369.method11512((long) (client.cycles * -1809259861));
		if (((Animable) this).aClass539_10369 != null)
			((Animable) this).aClass539_10369.method11515(aByte7967, aShort9458, aShort9455, aShort9456, aShort9457);
	}

	public final void method15841(int i, int i_198_, int i_199_, int i_200_, boolean bool, int i_201_) {
		Class161 class161 = aClass161Array10339[i_201_];
		int i_202_ = 378836105 * class161.anInt2012;
		if (-1 != i && -1 != i_202_) {
			if (i == i_202_) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(i, (byte) -63);
				if (class525.aBool6968 && -1 != class525.anInt6977 * -364555849) {
					AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205(((class525.anInt6977) * -364555849), (byte) -19);
					int i_203_ = 554947543 * class518.anInt5907;
					if (0 == i_203_)
						return;
					if (2 == i_203_) {
						class161.aClass456_2014.method7584(637834844);
						return;
					}
				}
			} else {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(i, (byte) 26);
				Class525 class525_204_ = IndexLoaders.aClass515_9416.method8845(i_202_, (byte) 69);
				if (-1 != class525.anInt6977 * -364555849 && class525_204_.anInt6977 * -364555849 != -1) {
					AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((-364555849 * (class525.anInt6977)), (byte) 42);
					AnimationDefinitions class518_205_ = IndexLoaders.aClass523_3868.method11205(((class525_204_.anInt6977) * -364555849), (byte) 16);
					if (-1834317435 * class518.anInt5916 < -1834317435 * class518_205_.anInt5916)
						return;
				}
			}
		}
		int i_206_ = 0;
		if (-1 != i && !(IndexLoaders.aClass515_9416.method8845(i, (byte) -22).aBool6968))
			i_206_ = 2;
		if (i != -1 && bool)
			i_206_ = 1;
		class161.anInt2012 = i * -1025302087;
		class161.anInt2011 = -523477979 * i_200_;
		class161.anInt2013 = (i_198_ >> 16) * 391696483;
		class161.anInt2015 = i_199_ * 1859279795;
		class161.aClass456_2014.method7571((-1 != i ? ((IndexLoaders.aClass515_9416.method8845(i, (byte) 24).anInt6977) * -364555849) : -1), i_198_ & 0xffff, i_206_, false, 1530931614);
	}

	public void method15842(String string, int i, int i_207_, int i_208_) {
		if (((Animable) this).aClass163_10334 == null)
			((Animable) this).aClass163_10334 = new Class163();
		((Class163) ((Animable) this).aClass163_10334).aString2028 = string;
		((Class163) ((Animable) this).aClass163_10334).anInt2027 = i * -336317719;
		((Class163) ((Animable) this).aClass163_10334).anInt2029 = -1720683961 * i_207_;
		((Class163) ((Animable) this).aClass163_10334).anInt2030 = (((Class163) ((Animable) this).aClass163_10334).anInt2026 = -1883468973 * i_208_) * 665419645;
	}

	public final void method15843() {
		anInt10355 = 0;
		anInt10367 = 0;
	}

	public final void method15844() {
		anInt10355 = 0;
		anInt10367 = 0;
	}

	public final void method15845(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_) {
		boolean bool = true;
		boolean bool_214_ = true;
		for (int i_215_ = 0; i_215_ < Class58.aClass529_527.anInt7026 * -1141871871; i_215_++) {
			if (anIntArray10351[i_215_] > i_212_)
				bool = false;
			else
				bool_214_ = false;
		}
		int i_216_ = -1;
		int i_217_ = -1;
		int i_218_ = 0;
		if (i >= 0) {
			HitsplatDefinitions class228 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(i, 1856651955);
			i_217_ = -1638316243 * class228.anInt2839;
			i_218_ = class228.anInt2841 * -1006911631;
		}
		if (bool_214_) {
			if (i_217_ == -1)
				return;
			i_216_ = 0;
			int i_219_ = 0;
			if (0 == i_217_)
				i_219_ = anIntArray10351[0];
			else if (1 == i_217_)
				i_219_ = anIntArray10329[0];
			for (int i_220_ = 1; i_220_ < Class58.aClass529_527.anInt7026 * -1141871871; i_220_++) {
				if (i_217_ == 0) {
					if (anIntArray10351[i_220_] < i_219_) {
						i_216_ = i_220_;
						i_219_ = anIntArray10351[i_220_];
					}
				} else if (1 == i_217_ && anIntArray10329[i_220_] < i_219_) {
					i_216_ = i_220_;
					i_219_ = anIntArray10329[i_220_];
				}
			}
			if (1 == i_217_ && i_219_ >= i_209_)
				return;
		} else {
			if (bool)
				((Animable) this).aByte10358 = (byte) 0;
			for (int i_221_ = 0; i_221_ < -1141871871 * Class58.aClass529_527.anInt7026; i_221_++) {
				int i_222_ = ((Animable) this).aByte10358;
				((Animable) this).aByte10358 = (byte) ((((Animable) this).aByte10358 + 1) % (Class58.aClass529_527.anInt7026 * -1141871871));
				if (anIntArray10351[i_222_] <= i_212_) {
					i_216_ = i_222_;
					break;
				}
			}
		}
		if (i_216_ >= 0) {
			anIntArray10316[i_216_] = i;
			anIntArray10329[i_216_] = i_209_;
			anIntArray10331[i_216_] = i_210_;
			anIntArray10332[i_216_] = i_211_;
			anIntArray10351[i_216_] = i_218_ + i_212_ + i_213_;
		}
	}

	public final void method15846(int i, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_) {
		boolean bool = true;
		boolean bool_228_ = true;
		for (int i_229_ = 0; i_229_ < Class58.aClass529_527.anInt7026 * -1141871871; i_229_++) {
			if (anIntArray10351[i_229_] > i_226_)
				bool = false;
			else
				bool_228_ = false;
		}
		int i_230_ = -1;
		int i_231_ = -1;
		int i_232_ = 0;
		if (i >= 0) {
			HitsplatDefinitions class228 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(i, 1856651955);
			i_231_ = -1638316243 * class228.anInt2839;
			i_232_ = class228.anInt2841 * -1006911631;
		}
		if (bool_228_) {
			if (i_231_ == -1)
				return;
			i_230_ = 0;
			int i_233_ = 0;
			if (0 == i_231_)
				i_233_ = anIntArray10351[0];
			else if (1 == i_231_)
				i_233_ = anIntArray10329[0];
			for (int i_234_ = 1; i_234_ < Class58.aClass529_527.anInt7026 * -1141871871; i_234_++) {
				if (i_231_ == 0) {
					if (anIntArray10351[i_234_] < i_233_) {
						i_230_ = i_234_;
						i_233_ = anIntArray10351[i_234_];
					}
				} else if (1 == i_231_ && anIntArray10329[i_234_] < i_233_) {
					i_230_ = i_234_;
					i_233_ = anIntArray10329[i_234_];
				}
			}
			if (1 == i_231_ && i_233_ >= i_223_)
				return;
		} else {
			if (bool)
				((Animable) this).aByte10358 = (byte) 0;
			for (int i_235_ = 0; i_235_ < -1141871871 * Class58.aClass529_527.anInt7026; i_235_++) {
				int i_236_ = ((Animable) this).aByte10358;
				((Animable) this).aByte10358 = (byte) ((((Animable) this).aByte10358 + 1) % (Class58.aClass529_527.anInt7026 * -1141871871));
				if (anIntArray10351[i_236_] <= i_226_) {
					i_230_ = i_236_;
					break;
				}
			}
		}
		if (i_230_ >= 0) {
			anIntArray10316[i_230_] = i;
			anIntArray10329[i_230_] = i_223_;
			anIntArray10331[i_230_] = i_224_;
			anIntArray10332[i_230_] = i_225_;
			anIntArray10351[i_230_] = i_232_ + i_226_ + i_227_;
		}
	}

	public final void method15847(int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_) {
		boolean bool = true;
		boolean bool_242_ = true;
		for (int i_243_ = 0; i_243_ < Class58.aClass529_527.anInt7026 * -1141871871; i_243_++) {
			if (anIntArray10351[i_243_] > i_240_)
				bool = false;
			else
				bool_242_ = false;
		}
		int i_244_ = -1;
		int i_245_ = -1;
		int i_246_ = 0;
		if (i >= 0) {
			HitsplatDefinitions class228 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(i, 1856651955);
			i_245_ = -1638316243 * class228.anInt2839;
			i_246_ = class228.anInt2841 * -1006911631;
		}
		if (bool_242_) {
			if (i_245_ == -1)
				return;
			i_244_ = 0;
			int i_247_ = 0;
			if (0 == i_245_)
				i_247_ = anIntArray10351[0];
			else if (1 == i_245_)
				i_247_ = anIntArray10329[0];
			for (int i_248_ = 1; i_248_ < Class58.aClass529_527.anInt7026 * -1141871871; i_248_++) {
				if (i_245_ == 0) {
					if (anIntArray10351[i_248_] < i_247_) {
						i_244_ = i_248_;
						i_247_ = anIntArray10351[i_248_];
					}
				} else if (1 == i_245_ && anIntArray10329[i_248_] < i_247_) {
					i_244_ = i_248_;
					i_247_ = anIntArray10329[i_248_];
				}
			}
			if (1 == i_245_ && i_247_ >= i_237_)
				return;
		} else {
			if (bool)
				((Animable) this).aByte10358 = (byte) 0;
			for (int i_249_ = 0; i_249_ < -1141871871 * Class58.aClass529_527.anInt7026; i_249_++) {
				int i_250_ = ((Animable) this).aByte10358;
				((Animable) this).aByte10358 = (byte) ((((Animable) this).aByte10358 + 1) % (Class58.aClass529_527.anInt7026 * -1141871871));
				if (anIntArray10351[i_250_] <= i_240_) {
					i_244_ = i_250_;
					break;
				}
			}
		}
		if (i_244_ >= 0) {
			anIntArray10316[i_244_] = i;
			anIntArray10329[i_244_] = i_237_;
			anIntArray10331[i_244_] = i_238_;
			anIntArray10332[i_244_] = i_239_;
			anIntArray10351[i_244_] = i_246_ + i_240_ + i_241_;
		}
	}

	public final void method15848(int i, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_) {
		boolean bool = true;
		boolean bool_256_ = true;
		for (int i_257_ = 0; i_257_ < Class58.aClass529_527.anInt7026 * -1141871871; i_257_++) {
			if (anIntArray10351[i_257_] > i_254_)
				bool = false;
			else
				bool_256_ = false;
		}
		int i_258_ = -1;
		int i_259_ = -1;
		int i_260_ = 0;
		if (i >= 0) {
			HitsplatDefinitions class228 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(i, 1856651955);
			i_259_ = -1638316243 * class228.anInt2839;
			i_260_ = class228.anInt2841 * -1006911631;
		}
		if (bool_256_) {
			if (i_259_ == -1)
				return;
			i_258_ = 0;
			int i_261_ = 0;
			if (0 == i_259_)
				i_261_ = anIntArray10351[0];
			else if (1 == i_259_)
				i_261_ = anIntArray10329[0];
			for (int i_262_ = 1; i_262_ < Class58.aClass529_527.anInt7026 * -1141871871; i_262_++) {
				if (i_259_ == 0) {
					if (anIntArray10351[i_262_] < i_261_) {
						i_258_ = i_262_;
						i_261_ = anIntArray10351[i_262_];
					}
				} else if (1 == i_259_ && anIntArray10329[i_262_] < i_261_) {
					i_258_ = i_262_;
					i_261_ = anIntArray10329[i_262_];
				}
			}
			if (1 == i_259_ && i_261_ >= i_251_)
				return;
		} else {
			if (bool)
				((Animable) this).aByte10358 = (byte) 0;
			for (int i_263_ = 0; i_263_ < -1141871871 * Class58.aClass529_527.anInt7026; i_263_++) {
				int i_264_ = ((Animable) this).aByte10358;
				((Animable) this).aByte10358 = (byte) ((((Animable) this).aByte10358 + 1) % (Class58.aClass529_527.anInt7026 * -1141871871));
				if (anIntArray10351[i_264_] <= i_254_) {
					i_258_ = i_264_;
					break;
				}
			}
		}
		if (i_258_ >= 0) {
			anIntArray10316[i_258_] = i;
			anIntArray10329[i_258_] = i_251_;
			anIntArray10331[i_258_] = i_252_;
			anIntArray10332[i_258_] = i_253_;
			anIntArray10351[i_258_] = i_260_ + i_254_ + i_255_;
		}
	}

	public int method15849() {
		Class227 class227 = method15855((byte) -17);
		int i = 1040633965 * aClass19_10359.anInt153;
		boolean bool;
		if (0 != class227.anInt2820 * 729582379)
			bool = aClass19_10359.method576(1633416769 * anInt10361, 729582379 * class227.anInt2820, class227.anInt2804 * -728054019, 1858172120);
		else
			bool = aClass19_10359.method576(anInt10361 * 1633416769, 455380417 * anInt10340, 455380417 * anInt10340, 1747943376);
		int i_265_ = aClass19_10359.anInt153 * 1040633965 - i;
		if (0 != i_265_)
			anInt10357 += -589413125;
		else {
			anInt10357 = 0;
			aClass19_10359.method577(1633416769 * anInt10361, 2119994721);
		}
		if (bool) {
			if (2028234633 * class227.anInt2825 != 0) {
				if (i_265_ > 0)
					aClass19_10360.method576(-1949451929 * class227.anInt2824, class227.anInt2825 * 2028234633, -947368133 * class227.anInt2823, 2092540224);
				else
					aClass19_10360.method576(-(-1949451929 * class227.anInt2824), 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1979034150);
			}
			if (0 != -1218558443 * class227.anInt2816)
				aClass19_10330.method576(class227.anInt2827 * -373642049, -1218558443 * class227.anInt2816, 269392411 * class227.anInt2815, 1706496714);
		} else {
			if (0 != class227.anInt2825 * 2028234633)
				aClass19_10360.method576(0, 2028234633 * class227.anInt2825, class227.anInt2823 * -947368133, 1749427636);
			else
				aClass19_10360.method577(0, 1799199225);
			if (class227.anInt2816 * -1218558443 != 0)
				aClass19_10330.method576(0, class227.anInt2816 * -1218558443, 269392411 * class227.anInt2815, 2023742161);
			else
				aClass19_10330.method577(0, 346676186);
		}
		return i_265_;
	}

	public final void method15850(int i) {
		HitbarDefinitions class198 = IndexLoaders.HITBAR_INDEX.getDefinitions(i, 2065623331);
		for (Class275_Sub7 class275_sub7 = (Class275_Sub7) aClass457_10333.method7659(301908602); null != class275_sub7; class275_sub7 = (Class275_Sub7) aClass457_10333.method7650((byte) 87)) {
			if (class198 == class275_sub7.aClass198_7863) {
				class275_sub7.method4887((byte) -113);
				break;
			}
		}
	}

	public void method15851(int i) {
		((Animable) this).anInt10315 = -2140159477 * i;
	}

	public abstract Class163 method15852();

	public int method15853() {
		return ((Animable) this).anInt10315 * 1959344547;
	}

	public void method14698() {
		int i = (240 + (1959344547 * ((Animable) this).anInt10315 - 1 << 8));
		Class385 class385 = method11166().aClass385_3595;
		aShort9458 = (short) ((int) class385.aFloat4671 - i >> 9);
		aShort9456 = (short) ((int) class385.aFloat4673 - i >> 9);
		aShort9455 = (short) ((int) class385.aFloat4671 + i >> 9);
		aShort9457 = (short) ((int) class385.aFloat4673 + i >> 9);
	}

	public boolean method15854(int i, int i_266_) {
		if (anIntArray10362 == null) {
			if (-1 == i_266_)
				return true;
			anIntArray10362 = new int[Class473.DEFAULTS_LOADER_6.equipmentSlots.length];
			for (int i_267_ = 0; i_267_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_267_++)
				anIntArray10362[i_267_] = -1;
		}
		Class227 class227 = method15855((byte) -17);
		int i_268_ = 256;
		if (class227.anIntArray2818 != null && class227.anIntArray2818[i] > 0)
			i_268_ = class227.anIntArray2818[i];
		if (-1 == i_266_) {
			if (anIntArray10362[i] == -1)
				return true;
			int i_269_ = aClass19_10359.method578((byte) 2);
			int i_270_ = anIntArray10362[i];
			int i_271_ = i_269_ - i_270_;
			if (i_271_ >= -i_268_ && i_271_ <= i_268_) {
				anIntArray10362[i] = -1;
				for (int i_272_ = 0; i_272_ < Class473.DEFAULTS_LOADER_6.equipmentSlots.length; i_272_++) {
					if (-1 != anIntArray10362[i_272_])
						return true;
				}
				anIntArray10362 = null;
				return true;
			}
			if (i_271_ > 0 && i_271_ <= 8192 || i_271_ <= -8192)
				anIntArray10362[i] = i_270_ + i_268_ & 0x3fff;
			else
				anIntArray10362[i] = i_270_ - i_268_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray10362[i])
			anIntArray10362[i] = aClass19_10359.method578((byte) 2);
		int i_273_ = anIntArray10362[i];
		int i_274_ = i_266_ - i_273_;
		if (i_274_ >= -i_268_ && i_274_ <= i_268_) {
			anIntArray10362[i] = i_266_;
			return true;
		}
		if (i_274_ > 0 && i_274_ <= 8192 || i_274_ <= -8192)
			anIntArray10362[i] = i_273_ + i_268_ & 0x3fff;
		else
			anIntArray10362[i] = i_273_ - i_268_ & 0x3fff;
		return false;
	}

	public Class227 method15855(byte i) {
		int i_275_ = method15808(635765286);
		if (i_275_ == -1)
			return Class211.aClass227_2669;
		return IndexLoaders.aClass211_9383.method3616(i_275_, (byte) -2);
	}

	void method15856(GraphicalRenderer class505, Class227 class227, int i, int i_276_, int i_277_, int i_278_) {
		for (int i_279_ = 0; i_279_ < aClass161Array10339.length; i_279_++) {
			byte i_280_ = 0;
			if (0 == i_279_)
				i_280_ = (byte) 2;
			else if (1 == i_279_)
				i_280_ = (byte) 5;
			else if (2 == i_279_)
				i_280_ = (byte) 1;
			else if (i_279_ == 3)
				i_280_ = (byte) 7;
			Class161 class161 = aClass161Array10339[i_279_];
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.method7573(344781570)) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(((class161.anInt2012) * 378836105), (byte) -53);
				boolean bool = 3 == class525.aByte6982 && (0 != i_276_ || 0 != i_277_);
				int i_281_ = i;
				if (bool)
					i_281_ |= 0x7;
				else {
					if (0 != class161.anInt2015 * -43136133)
						i_281_ |= 0x5;
					if (-1576521397 * class161.anInt2013 != 0)
						i_281_ |= 0x2;
					if (-660316243 * class161.anInt2011 >= 0)
						i_281_ |= 0x7;
				}
				MeshRasterizer class528 = (aClass528Array10372[i_279_ + 1] = class525.method11228(class505, i_281_, class161.aClass456_2014, i_280_, (byte) 31));
				if (class528 != null) {
					if (class161.anInt2011 * -660316243 >= 0 && class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[-660316243 * class161.anInt2011])) {
						int i_282_ = 0;
						int i_283_ = 0;
						int i_284_ = 0;
						if (null != class227.anIntArrayArray2802 && (class227.anIntArrayArray2802[-660316243 * class161.anInt2011]) != null) {
							i_282_ += (class227.anIntArrayArray2802[-660316243 * class161.anInt2011][0]);
							i_283_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][1]);
							i_284_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][2]);
						}
						if (null != class227.anIntArrayArray2791 && (class227.anIntArrayArray2791[-660316243 * class161.anInt2011]) != null) {
							i_282_ += (class227.anIntArrayArray2791[-660316243 * class161.anInt2011][0]);
							i_283_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][1]);
							i_284_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][2]);
						}
						if (0 != i_284_ || i_282_ != 0) {
							int i_285_ = i_278_;
							if (anIntArray10362 != null && -1 != (anIntArray10362[class161.anInt2011 * -660316243]))
								i_285_ = (anIntArray10362[class161.anInt2011 * -660316243]);
							int i_286_ = ((class161.anInt2015 * 1851512832 + i_285_ - i_278_) & 0x3fff);
							if (i_286_ != 0)
								class528.f(i_286_);
							int i_287_ = Class382.anIntArray4657[i_286_];
							int i_288_ = Class382.anIntArray4661[i_286_];
							int i_289_ = i_288_ * i_282_ + i_284_ * i_287_ >> 14;
							i_284_ = i_288_ * i_284_ - i_282_ * i_287_ >> 14;
							i_282_ = i_289_;
						}
						class528.ia(i_282_, i_283_, i_284_);
					} else if (-43136133 * class161.anInt2015 != 0)
						class528.f(class161.anInt2015 * 1851512832);
					if (0 != -1576521397 * class161.anInt2013)
						class528.ia(0, -(-1576521397 * class161.anInt2013) << 2, 0);
					if (bool) {
						if ((((Animable) this).anInt10322 * -35614997) != 0)
							class528.t((((Animable) this).anInt10322) * -35614997);
						if (0 != (-1768311789 * ((Animable) this).anInt10323))
							class528.EA((((Animable) this).anInt10323) * -1768311789);
						if (0 != (((Animable) this).anInt10363 * -628205413))
							class528.ia(0, (((Animable) this).anInt10363) * -628205413, 0);
					}
				}
			} else
				aClass528Array10372[1 + i_279_] = null;
		}
	}

	public final void method15857(int i, int i_290_) {
		HitbarDefinitions class198 = IndexLoaders.HITBAR_INDEX.getDefinitions(i, 757267285);
		for (Class275_Sub7 class275_sub7 = (Class275_Sub7) aClass457_10333.method7659(301908602); null != class275_sub7; class275_sub7 = (Class275_Sub7) aClass457_10333.method7650((byte) 67)) {
			if (class198 == class275_sub7.aClass198_7863) {
				class275_sub7.method4887((byte) -33);
				break;
			}
		}
	}

	void method15858(MeshRasterizer class528) {
		int i = 1040633965 * aClass19_10360.anInt153;
		int i_291_ = 1040633965 * aClass19_10330.anInt153;
		if (i != 0 || i_291_ != 0) {
			int i_292_ = class528.YA() / 2;
			class528.ia(0, -i_292_, 0);
			class528.EA(i & 0x3fff);
			class528.t(i_291_ & 0x3fff);
			class528.ia(0, i_292_, 0);
		}
	}

	void method15859(GraphicalRenderer class505, Class227 class227, int i, int i_293_, int i_294_, int i_295_) {
		for (int i_296_ = 0; i_296_ < aClass161Array10339.length; i_296_++) {
			byte i_297_ = 0;
			if (0 == i_296_)
				i_297_ = (byte) 2;
			else if (1 == i_296_)
				i_297_ = (byte) 5;
			else if (2 == i_296_)
				i_297_ = (byte) 1;
			else if (i_296_ == 3)
				i_297_ = (byte) 7;
			Class161 class161 = aClass161Array10339[i_296_];
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.method7573(-249536007)) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(((class161.anInt2012) * 378836105), (byte) 12);
				boolean bool = 3 == class525.aByte6982 && (0 != i_293_ || 0 != i_294_);
				int i_298_ = i;
				if (bool)
					i_298_ |= 0x7;
				else {
					if (0 != class161.anInt2015 * -43136133)
						i_298_ |= 0x5;
					if (-1576521397 * class161.anInt2013 != 0)
						i_298_ |= 0x2;
					if (-660316243 * class161.anInt2011 >= 0)
						i_298_ |= 0x7;
				}
				MeshRasterizer class528 = (aClass528Array10372[i_296_ + 1] = class525.method11228(class505, i_298_, class161.aClass456_2014, i_297_, (byte) 32));
				if (class528 != null) {
					if (class161.anInt2011 * -660316243 >= 0 && class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[-660316243 * class161.anInt2011])) {
						int i_299_ = 0;
						int i_300_ = 0;
						int i_301_ = 0;
						if (null != class227.anIntArrayArray2802 && (class227.anIntArrayArray2802[-660316243 * class161.anInt2011]) != null) {
							i_299_ += (class227.anIntArrayArray2802[-660316243 * class161.anInt2011][0]);
							i_300_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][1]);
							i_301_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][2]);
						}
						if (null != class227.anIntArrayArray2791 && (class227.anIntArrayArray2791[-660316243 * class161.anInt2011]) != null) {
							i_299_ += (class227.anIntArrayArray2791[-660316243 * class161.anInt2011][0]);
							i_300_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][1]);
							i_301_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][2]);
						}
						if (0 != i_301_ || i_299_ != 0) {
							int i_302_ = i_295_;
							if (anIntArray10362 != null && -1 != (anIntArray10362[class161.anInt2011 * -660316243]))
								i_302_ = (anIntArray10362[class161.anInt2011 * -660316243]);
							int i_303_ = ((class161.anInt2015 * 1851512832 + i_302_ - i_295_) & 0x3fff);
							if (i_303_ != 0)
								class528.f(i_303_);
							int i_304_ = Class382.anIntArray4657[i_303_];
							int i_305_ = Class382.anIntArray4661[i_303_];
							int i_306_ = i_305_ * i_299_ + i_301_ * i_304_ >> 14;
							i_301_ = i_305_ * i_301_ - i_299_ * i_304_ >> 14;
							i_299_ = i_306_;
						}
						class528.ia(i_299_, i_300_, i_301_);
					} else if (-43136133 * class161.anInt2015 != 0)
						class528.f(class161.anInt2015 * 1851512832);
					if (0 != -1576521397 * class161.anInt2013)
						class528.ia(0, -(-1576521397 * class161.anInt2013) << 2, 0);
					if (bool) {
						if ((((Animable) this).anInt10322 * -35614997) != 0)
							class528.t((((Animable) this).anInt10322) * -35614997);
						if (0 != (-1768311789 * ((Animable) this).anInt10323))
							class528.EA((((Animable) this).anInt10323) * -1768311789);
						if (0 != (((Animable) this).anInt10363 * -628205413))
							class528.ia(0, (((Animable) this).anInt10363) * -628205413, 0);
					}
				}
			} else
				aClass528Array10372[1 + i_296_] = null;
		}
	}

	boolean method15860() {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}

	public final void method15861() {
		anInt10355 = 0;
		anInt10367 = 0;
	}

	void method15862(int i, int i_307_, int i_308_, int i_309_, int i_310_) {
		Class385 class385 = method11166().aClass385_3595;
		int i_311_ = aShort9458 + aShort9455 >> 1;
		int i_312_ = aShort9457 + aShort9456 >> 1;
		int i_313_ = Class382.anIntArray4657[i];
		int i_314_ = Class382.anIntArray4661[i];
		int i_315_ = -i_307_ / 2;
		int i_316_ = -i_308_ / 2;
		int i_317_ = i_314_ * i_315_ + i_313_ * i_316_ >> 14;
		int i_318_ = i_316_ * i_314_ - i_313_ * i_315_ >> 14;
		int i_319_ = Class13.method507((int) class385.aFloat4671 + i_317_, i_318_ + (int) class385.aFloat4673, i_311_, i_312_, aByte7967, (byte) -30);
		int i_320_ = i_307_ / 2;
		int i_321_ = -i_308_ / 2;
		int i_322_ = i_320_ * i_314_ + i_313_ * i_321_ >> 14;
		int i_323_ = i_314_ * i_321_ - i_320_ * i_313_ >> 14;
		int i_324_ = Class13.method507(i_322_ + (int) class385.aFloat4671, (int) class385.aFloat4673 + i_323_, i_311_, i_312_, aByte7967, (byte) -127);
		int i_325_ = -i_307_ / 2;
		int i_326_ = i_308_ / 2;
		int i_327_ = i_314_ * i_325_ + i_313_ * i_326_ >> 14;
		int i_328_ = i_326_ * i_314_ - i_313_ * i_325_ >> 14;
		int i_329_ = Class13.method507((int) class385.aFloat4671 + i_327_, (int) class385.aFloat4673 + i_328_, i_311_, i_312_, aByte7967, (byte) -128);
		int i_330_ = i_307_ / 2;
		int i_331_ = i_308_ / 2;
		int i_332_ = i_314_ * i_330_ + i_331_ * i_313_ >> 14;
		int i_333_ = i_331_ * i_314_ - i_313_ * i_330_ >> 14;
		int i_334_ = Class13.method507((int) class385.aFloat4671 + i_332_, (int) class385.aFloat4673 + i_333_, i_311_, i_312_, aByte7967, (byte) -50);
		int i_335_ = i_319_ < i_324_ ? i_319_ : i_324_;
		int i_336_ = i_329_ < i_334_ ? i_329_ : i_334_;
		int i_337_ = i_324_ < i_334_ ? i_324_ : i_334_;
		int i_338_ = i_319_ < i_329_ ? i_319_ : i_329_;
		((Animable) this).anInt10322 = ((int) (Math.atan2((double) (i_335_ - i_336_), (double) i_308_) * 2607.5945876176133) & 0x3fff) * 2085530051;
		((Animable) this).anInt10323 = ((int) (Math.atan2((double) (i_338_ - i_337_), (double) i_307_) * 2607.5945876176133) & 0x3fff) * 884618779;
		if (0 != -35614997 * ((Animable) this).anInt10322 && i_309_ != 0) {
			int i_339_ = 16384 - i_309_;
			if (((Animable) this).anInt10322 * -35614997 > 8192) {
				if (-35614997 * ((Animable) this).anInt10322 < i_339_)
					((Animable) this).anInt10322 = i_339_ * 2085530051;
			} else if (((Animable) this).anInt10322 * -35614997 > i_309_)
				((Animable) this).anInt10322 = i_309_ * 2085530051;
		}
		if (((Animable) this).anInt10323 * -1768311789 != 0 && i_310_ != 0) {
			int i_340_ = 16384 - i_310_;
			if (((Animable) this).anInt10323 * -1768311789 > 8192) {
				if (((Animable) this).anInt10323 * -1768311789 < i_340_)
					((Animable) this).anInt10323 = 884618779 * i_340_;
			} else if ((-1768311789 * ((Animable) this).anInt10323) > i_310_)
				((Animable) this).anInt10323 = i_310_ * 884618779;
		}
		((Animable) this).anInt10363 = -1453470317 * (i_334_ + i_319_);
		if (i_324_ + i_329_ < ((Animable) this).anInt10363 * -628205413)
			((Animable) this).anInt10363 = -1453470317 * (i_329_ + i_324_);
		((Animable) this).anInt10363 = (-1453470317 * ((((Animable) this).anInt10363 * -628205413 >> 1) - (int) class385.aFloat4672));
	}

	public void method15863(int i, int i_341_) {
		Class227 class227 = method15855((byte) -17);
		if (class227.anInt2820 * 729582379 != 0 || 0 != 455380417 * anInt10340) {
			aClass19_10359.method579(73676429);
			int i_342_ = i - 1040633965 * aClass19_10359.anInt153 & 0x3fff;
			if (i_342_ > 8192)
				anInt10361 = 484383169 * (1040633965 * aClass19_10359.anInt153 - (16384 - i_342_));
			else
				anInt10361 = ((i_342_ + 1040633965 * aClass19_10359.anInt153) * 484383169);
		}
	}

	public Class227 method15864() {
		int i = method15808(635765286);
		if (i == -1)
			return Class211.aClass227_2669;
		return IndexLoaders.aClass211_9383.method3616(i, (byte) 41);
	}

	public Class227 method15865() {
		int i = method15808(635765286);
		if (i == -1)
			return Class211.aClass227_2669;
		return IndexLoaders.aClass211_9383.method3616(i, (byte) -19);
	}

	public Class227 method15866() {
		int i = method15808(635765286);
		if (i == -1)
			return Class211.aClass227_2669;
		return IndexLoaders.aClass211_9383.method3616(i, (byte) -34);
	}

	abstract int method15867();

	abstract int method15868();

	public void method15869() {
		if (null != ((Animable) this).aClass163_10334 && (((Class163) ((Animable) this).aClass163_10334).aString2028) != null) {
			((Class163) ((Animable) this).aClass163_10334).anInt2030 -= 1459172487;
			if ((((Class163) ((Animable) this).aClass163_10334).anInt2030) * -1892593353 == 0)
				((Class163) ((Animable) this).aClass163_10334).aString2028 = null;
		}
	}

	Animable(SceneObjectManager class206, int i) {
		super(class206, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		anInt10321 = 0;
		((Animable) this).anInt10325 = 0;
		((Animable) this).aByte10358 = (byte) 0;
		anIntArray10316 = new int[Class58.aClass529_527.anInt7026 * -1141871871];
		anIntArray10329 = new int[-1141871871 * Class58.aClass529_527.anInt7026];
		anIntArray10351 = new int[Class58.aClass529_527.anInt7026 * -1141871871];
		anIntArray10331 = new int[Class58.aClass529_527.anInt7026 * -1141871871];
		anIntArray10332 = new int[-1141871871 * Class58.aClass529_527.anInt7026];
		aClass457_10333 = new Class457();
		faceEntity = 2059452093;
		anIntArray10350 = null;
		aClass456_Sub3_10337 = new Class456_Sub3(this, false);
		aClass456_10338 = new Class456_Sub2(this, false);
		anInt10347 = 245378127;
		anInt10348 = -485671023;
		aByte10352 = (byte) 0;
		anInt10353 = 0;
		anInt10357 = 0;
		anInt10340 = -1132314368;
		aClass19_10359 = new Class19();
		aClass19_10360 = new Class19();
		aClass19_10330 = new Class19();
		anInt10355 = 0;
		anInt10366 = 0;
		anInt10367 = 0;
		anInt10368 = 0;
		((Animable) this).aBool10370 = false;
		((Animable) this).aBool10312 = false;
		anInt10374 = 1342798959;
		((Animable) this).anInt10344 = 321130975;
		regionBaseX = new int[i];
		regionBaseY = new int[i];
		aByteArray10365 = new byte[i];
		aClass528Array10372 = new MeshRasterizer[5];
		aClass161Array10339 = new Class161[4];
		for (int i_343_ = 0; i_343_ < 4; i_343_++)
			aClass161Array10339[i_343_] = new Class161(this);
		aClass456_Sub2_Sub1Array10354 = (new Class456_Sub2_Sub1[Class473.DEFAULTS_LOADER_6.equipmentSlots.length]);
	}

	public void method15870() {
		if (null != ((Animable) this).aClass163_10334 && (((Class163) ((Animable) this).aClass163_10334).aString2028) != null) {
			((Class163) ((Animable) this).aClass163_10334).anInt2030 -= 1459172487;
			if ((((Class163) ((Animable) this).aClass163_10334).anInt2030) * -1892593353 == 0)
				((Class163) ((Animable) this).aClass163_10334).aString2028 = null;
		}
	}

	public abstract boolean method15871();

	public abstract boolean method15872();

	public abstract boolean method15873();

	public abstract int method15874();

	public void method15875(String string, int i, int i_344_, int i_345_, int i_346_) {
		if (((Animable) this).aClass163_10334 == null)
			((Animable) this).aClass163_10334 = new Class163();
		((Class163) ((Animable) this).aClass163_10334).aString2028 = string;
		((Class163) ((Animable) this).aClass163_10334).anInt2027 = i * -336317719;
		((Class163) ((Animable) this).aClass163_10334).anInt2029 = -1720683961 * i_344_;
		((Class163) ((Animable) this).aClass163_10334).anInt2030 = (((Class163) ((Animable) this).aClass163_10334).anInt2026 = -1883468973 * i_345_) * 665419645;
	}

	public abstract Class163 method15876();

	public abstract Class163 method15877();

	public final void method15878(int i, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_) {
		HitbarDefinitions class198 = IndexLoaders.HITBAR_INDEX.getDefinitions(i, 955218758);
		Class275_Sub7 class275_sub7 = null;
		Class275_Sub7 class275_sub7_352_ = null;
		int i_353_ = -1142991979 * class198.anInt2440;
		int i_354_ = 0;
		for (Class275_Sub7 class275_sub7_355_ = (Class275_Sub7) aClass457_10333.method7659(301908602); null != class275_sub7_355_; class275_sub7_355_ = (Class275_Sub7) aClass457_10333.method7650((byte) 97)) {
			i_354_++;
			if (class275_sub7_355_.aClass198_7863 == class198) {
				class275_sub7_355_.method12601(i_347_ + i_349_, i_350_, i_351_, i_348_, -1147189333);
				return;
			}
			if (class275_sub7_355_.aClass198_7863.anInt2446 * -29546407 <= class198.anInt2446 * -29546407)
				class275_sub7 = class275_sub7_355_;
			if (class275_sub7_355_.aClass198_7863.anInt2440 * -1142991979 > i_353_) {
				class275_sub7_352_ = class275_sub7_355_;
				i_353_ = (-1142991979 * class275_sub7_355_.aClass198_7863.anInt2440);
			}
		}
		if (null != class275_sub7_352_ || i_354_ < Class58.aClass529_527.anInt7032 * -1838667567) {
			Class275_Sub7 class275_sub7_356_ = new Class275_Sub7(class198);
			if (null == class275_sub7)
				aClass457_10333.method7647(class275_sub7_356_, -1250823254);
			else
				Class516.method8866(class275_sub7_356_, class275_sub7, -1837912800);
			class275_sub7_356_.method12601(i_347_ + i_349_, i_350_, i_351_, i_348_, -1299914865);
			if (i_354_ >= Class58.aClass529_527.anInt7032 * -1838667567)
				class275_sub7_352_.method4887((byte) -73);
		}
	}

	public void method15879(String string, int i, int i_357_, int i_358_) {
		if (((Animable) this).aClass163_10334 == null)
			((Animable) this).aClass163_10334 = new Class163();
		((Class163) ((Animable) this).aClass163_10334).aString2028 = string;
		((Class163) ((Animable) this).aClass163_10334).anInt2027 = i * -336317719;
		((Class163) ((Animable) this).aClass163_10334).anInt2029 = -1720683961 * i_357_;
		((Class163) ((Animable) this).aClass163_10334).anInt2030 = (((Class163) ((Animable) this).aClass163_10334).anInt2026 = -1883468973 * i_358_) * 665419645;
	}

	public void method15880(int i, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, int i_365_, byte i_366_) {
		if (method15900(-686641141))
			client.method11768(aClass98_10324, aClass98_10324.method1616(2121231895), -1, i, i_359_, i_360_, i_361_, i_362_, i_363_, i_364_, i_365_);
	}

	public void method15881(int i, int i_367_, boolean bool) {
		if (method15900(586484177))
			InteractableObject.method16099((aClass98_10324.aClass118Array998), -1, i, i_367_, bool, (byte) 60);
	}

	public void method15882(int i) {
		if (((Animable) this).anInt10344 * 1959466465 != 226532721 * anInt10374)
			method15816((byte) 58);
		((Animable) this).anInt10344 = -321130975 * i;
	}

	void method15883(GraphicalRenderer class505, Class227 class227, int i, int i_368_, int i_369_, int i_370_) {
		for (int i_371_ = 0; i_371_ < aClass161Array10339.length; i_371_++) {
			byte i_372_ = 0;
			if (0 == i_371_)
				i_372_ = (byte) 2;
			else if (1 == i_371_)
				i_372_ = (byte) 5;
			else if (2 == i_371_)
				i_372_ = (byte) 1;
			else if (i_371_ == 3)
				i_372_ = (byte) 7;
			Class161 class161 = aClass161Array10339[i_371_];
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.method7573(10654334)) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(((class161.anInt2012) * 378836105), (byte) 55);
				boolean bool = 3 == class525.aByte6982 && (0 != i_368_ || 0 != i_369_);
				int i_373_ = i;
				if (bool)
					i_373_ |= 0x7;
				else {
					if (0 != class161.anInt2015 * -43136133)
						i_373_ |= 0x5;
					if (-1576521397 * class161.anInt2013 != 0)
						i_373_ |= 0x2;
					if (-660316243 * class161.anInt2011 >= 0)
						i_373_ |= 0x7;
				}
				MeshRasterizer class528 = (aClass528Array10372[i_371_ + 1] = class525.method11228(class505, i_373_, class161.aClass456_2014, i_372_, (byte) -110));
				if (class528 != null) {
					if (class161.anInt2011 * -660316243 >= 0 && class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[-660316243 * class161.anInt2011])) {
						int i_374_ = 0;
						int i_375_ = 0;
						int i_376_ = 0;
						if (null != class227.anIntArrayArray2802 && (class227.anIntArrayArray2802[-660316243 * class161.anInt2011]) != null) {
							i_374_ += (class227.anIntArrayArray2802[-660316243 * class161.anInt2011][0]);
							i_375_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][1]);
							i_376_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][2]);
						}
						if (null != class227.anIntArrayArray2791 && (class227.anIntArrayArray2791[-660316243 * class161.anInt2011]) != null) {
							i_374_ += (class227.anIntArrayArray2791[-660316243 * class161.anInt2011][0]);
							i_375_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][1]);
							i_376_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][2]);
						}
						if (0 != i_376_ || i_374_ != 0) {
							int i_377_ = i_370_;
							if (anIntArray10362 != null && -1 != (anIntArray10362[class161.anInt2011 * -660316243]))
								i_377_ = (anIntArray10362[class161.anInt2011 * -660316243]);
							int i_378_ = ((class161.anInt2015 * 1851512832 + i_377_ - i_370_) & 0x3fff);
							if (i_378_ != 0)
								class528.f(i_378_);
							int i_379_ = Class382.anIntArray4657[i_378_];
							int i_380_ = Class382.anIntArray4661[i_378_];
							int i_381_ = i_380_ * i_374_ + i_376_ * i_379_ >> 14;
							i_376_ = i_380_ * i_376_ - i_374_ * i_379_ >> 14;
							i_374_ = i_381_;
						}
						class528.ia(i_374_, i_375_, i_376_);
					} else if (-43136133 * class161.anInt2015 != 0)
						class528.f(class161.anInt2015 * 1851512832);
					if (0 != -1576521397 * class161.anInt2013)
						class528.ia(0, -(-1576521397 * class161.anInt2013) << 2, 0);
					if (bool) {
						if ((((Animable) this).anInt10322 * -35614997) != 0)
							class528.t((((Animable) this).anInt10322) * -35614997);
						if (0 != (-1768311789 * ((Animable) this).anInt10323))
							class528.EA((((Animable) this).anInt10323) * -1768311789);
						if (0 != (((Animable) this).anInt10363 * -628205413))
							class528.ia(0, (((Animable) this).anInt10363) * -628205413, 0);
					}
				}
			} else
				aClass528Array10372[1 + i_371_] = null;
		}
	}

	boolean method15884() {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}

	void method15885(GraphicalRenderer class505, Class227 class227, int i, int i_382_, int i_383_, int i_384_) {
		for (int i_385_ = 0; i_385_ < aClass161Array10339.length; i_385_++) {
			byte i_386_ = 0;
			if (0 == i_385_)
				i_386_ = (byte) 2;
			else if (1 == i_385_)
				i_386_ = (byte) 5;
			else if (2 == i_385_)
				i_386_ = (byte) 1;
			else if (i_385_ == 3)
				i_386_ = (byte) 7;
			Class161 class161 = aClass161Array10339[i_385_];
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.method7573(485786249)) {
				Class525 class525 = IndexLoaders.aClass515_9416.method8845(((class161.anInt2012) * 378836105), (byte) -52);
				boolean bool = 3 == class525.aByte6982 && (0 != i_382_ || 0 != i_383_);
				int i_387_ = i;
				if (bool)
					i_387_ |= 0x7;
				else {
					if (0 != class161.anInt2015 * -43136133)
						i_387_ |= 0x5;
					if (-1576521397 * class161.anInt2013 != 0)
						i_387_ |= 0x2;
					if (-660316243 * class161.anInt2011 >= 0)
						i_387_ |= 0x7;
				}
				MeshRasterizer class528 = (aClass528Array10372[i_385_ + 1] = class525.method11228(class505, i_387_, class161.aClass456_2014, i_386_, (byte) -31));
				if (class528 != null) {
					if (class161.anInt2011 * -660316243 >= 0 && class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[-660316243 * class161.anInt2011])) {
						int i_388_ = 0;
						int i_389_ = 0;
						int i_390_ = 0;
						if (null != class227.anIntArrayArray2802 && (class227.anIntArrayArray2802[-660316243 * class161.anInt2011]) != null) {
							i_388_ += (class227.anIntArrayArray2802[-660316243 * class161.anInt2011][0]);
							i_389_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][1]);
							i_390_ += (class227.anIntArrayArray2802[class161.anInt2011 * -660316243][2]);
						}
						if (null != class227.anIntArrayArray2791 && (class227.anIntArrayArray2791[-660316243 * class161.anInt2011]) != null) {
							i_388_ += (class227.anIntArrayArray2791[-660316243 * class161.anInt2011][0]);
							i_389_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][1]);
							i_390_ += (class227.anIntArrayArray2791[class161.anInt2011 * -660316243][2]);
						}
						if (0 != i_390_ || i_388_ != 0) {
							int i_391_ = i_384_;
							if (anIntArray10362 != null && -1 != (anIntArray10362[class161.anInt2011 * -660316243]))
								i_391_ = (anIntArray10362[class161.anInt2011 * -660316243]);
							int i_392_ = ((class161.anInt2015 * 1851512832 + i_391_ - i_384_) & 0x3fff);
							if (i_392_ != 0)
								class528.f(i_392_);
							int i_393_ = Class382.anIntArray4657[i_392_];
							int i_394_ = Class382.anIntArray4661[i_392_];
							int i_395_ = i_394_ * i_388_ + i_390_ * i_393_ >> 14;
							i_390_ = i_394_ * i_390_ - i_388_ * i_393_ >> 14;
							i_388_ = i_395_;
						}
						class528.ia(i_388_, i_389_, i_390_);
					} else if (-43136133 * class161.anInt2015 != 0)
						class528.f(class161.anInt2015 * 1851512832);
					if (0 != -1576521397 * class161.anInt2013)
						class528.ia(0, -(-1576521397 * class161.anInt2013) << 2, 0);
					if (bool) {
						if ((((Animable) this).anInt10322 * -35614997) != 0)
							class528.t((((Animable) this).anInt10322) * -35614997);
						if (0 != (-1768311789 * ((Animable) this).anInt10323))
							class528.EA((((Animable) this).anInt10323) * -1768311789);
						if (0 != (((Animable) this).anInt10363 * -628205413))
							class528.ia(0, (((Animable) this).anInt10363) * -628205413, 0);
					}
				}
			} else
				aClass528Array10372[1 + i_385_] = null;
		}
	}

	boolean method15886() {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}

	public abstract boolean method15887(int i);

	boolean method15888() {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}

	boolean method15889(int i) {
		if (anInt10374 * 226532721 == i)
			return true;
		aClass98_10324 = Class288.method5084(i, null, null, true, (byte) -100);
		if (aClass98_10324 == null)
			return false;
		anInt10374 = -1342798959 * i;
		Class202.method3337(aClass98_10324.aClass118Array998, 2088119296);
		return true;
	}

	void method15890() {
		if (anInt10374 * 226532721 != -1) {
			Class12.method480(226532721 * anInt10374, -867142380);
			aClass98_10324 = null;
			anInt10374 = 1342798959;
		}
	}

	public int method13006() {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	public void method15891(int i, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_, int i_401_, int i_402_) {
		if (method15900(-1369605719))
			client.method11768(aClass98_10324, aClass98_10324.method1616(2142526641), -1, i, i_396_, i_397_, i_398_, i_399_, i_400_, i_401_, i_402_);
	}

	public abstract int method15892();

	public void method15893(int i, int i_403_, int i_404_, int i_405_, int i_406_, int i_407_, int i_408_, int i_409_) {
		if (method15900(-1952249862))
			client.method11768(aClass98_10324, aClass98_10324.method1616(2142618409), -1, i, i_403_, i_404_, i_405_, i_406_, i_407_, i_408_, i_409_);
	}

	public void method15894(int i, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_, int i_415_) {
		if (!method15900(-55761371)) {
			if (i != -1)
				client.aBoolArray7443[i] = true;
			else {
				for (int i_416_ = 0; i_416_ < 107; i_416_++)
					client.aBoolArray7443[i_416_] = true;
			}
		} else
			GroundDecoration.method16094(aClass98_10324.method1616(2138776200), -1, i_410_, i_411_, i_412_, i_413_, i_414_, i_415_, i, false, (byte) 6);
	}

	void method15895(int i, int i_417_, int i_418_, int i_419_, int i_420_, byte i_421_) {
		Class385 class385 = method11166().aClass385_3595;
		int i_422_ = aShort9458 + aShort9455 >> 1;
		int i_423_ = aShort9457 + aShort9456 >> 1;
		int i_424_ = Class382.anIntArray4657[i];
		int i_425_ = Class382.anIntArray4661[i];
		int i_426_ = -i_417_ / 2;
		int i_427_ = -i_418_ / 2;
		int i_428_ = i_425_ * i_426_ + i_424_ * i_427_ >> 14;
		int i_429_ = i_427_ * i_425_ - i_424_ * i_426_ >> 14;
		int i_430_ = Class13.method507((int) class385.aFloat4671 + i_428_, i_429_ + (int) class385.aFloat4673, i_422_, i_423_, aByte7967, (byte) -92);
		int i_431_ = i_417_ / 2;
		int i_432_ = -i_418_ / 2;
		int i_433_ = i_431_ * i_425_ + i_424_ * i_432_ >> 14;
		int i_434_ = i_425_ * i_432_ - i_431_ * i_424_ >> 14;
		int i_435_ = Class13.method507(i_433_ + (int) class385.aFloat4671, (int) class385.aFloat4673 + i_434_, i_422_, i_423_, aByte7967, (byte) -75);
		int i_436_ = -i_417_ / 2;
		int i_437_ = i_418_ / 2;
		int i_438_ = i_425_ * i_436_ + i_424_ * i_437_ >> 14;
		int i_439_ = i_437_ * i_425_ - i_424_ * i_436_ >> 14;
		int i_440_ = Class13.method507((int) class385.aFloat4671 + i_438_, (int) class385.aFloat4673 + i_439_, i_422_, i_423_, aByte7967, (byte) -66);
		int i_441_ = i_417_ / 2;
		int i_442_ = i_418_ / 2;
		int i_443_ = i_425_ * i_441_ + i_442_ * i_424_ >> 14;
		int i_444_ = i_442_ * i_425_ - i_424_ * i_441_ >> 14;
		int i_445_ = Class13.method507((int) class385.aFloat4671 + i_443_, (int) class385.aFloat4673 + i_444_, i_422_, i_423_, aByte7967, (byte) -13);
		int i_446_ = i_430_ < i_435_ ? i_430_ : i_435_;
		int i_447_ = i_440_ < i_445_ ? i_440_ : i_445_;
		int i_448_ = i_435_ < i_445_ ? i_435_ : i_445_;
		int i_449_ = i_430_ < i_440_ ? i_430_ : i_440_;
		((Animable) this).anInt10322 = ((int) (Math.atan2((double) (i_446_ - i_447_), (double) i_418_) * 2607.5945876176133) & 0x3fff) * 2085530051;
		((Animable) this).anInt10323 = ((int) (Math.atan2((double) (i_449_ - i_448_), (double) i_417_) * 2607.5945876176133) & 0x3fff) * 884618779;
		if (0 != -35614997 * ((Animable) this).anInt10322 && i_419_ != 0) {
			int i_450_ = 16384 - i_419_;
			if (((Animable) this).anInt10322 * -35614997 > 8192) {
				if (-35614997 * ((Animable) this).anInt10322 < i_450_)
					((Animable) this).anInt10322 = i_450_ * 2085530051;
			} else if (((Animable) this).anInt10322 * -35614997 > i_419_)
				((Animable) this).anInt10322 = i_419_ * 2085530051;
		}
		if (((Animable) this).anInt10323 * -1768311789 != 0 && i_420_ != 0) {
			int i_451_ = 16384 - i_420_;
			if (((Animable) this).anInt10323 * -1768311789 > 8192) {
				if (((Animable) this).anInt10323 * -1768311789 < i_451_)
					((Animable) this).anInt10323 = 884618779 * i_451_;
			} else if ((-1768311789 * ((Animable) this).anInt10323) > i_420_)
				((Animable) this).anInt10323 = i_420_ * 884618779;
		}
		((Animable) this).anInt10363 = -1453470317 * (i_445_ + i_430_);
		if (i_435_ + i_440_ < ((Animable) this).anInt10363 * -628205413)
			((Animable) this).anInt10363 = -1453470317 * (i_440_ + i_435_);
		((Animable) this).anInt10363 = (-1453470317 * ((((Animable) this).anInt10363 * -628205413 >> 1) - (int) class385.aFloat4672));
	}

	void method15896(int i, int i_452_, int i_453_, int i_454_, int i_455_) {
		Class385 class385 = method11166().aClass385_3595;
		int i_456_ = aShort9458 + aShort9455 >> 1;
		int i_457_ = aShort9457 + aShort9456 >> 1;
		int i_458_ = Class382.anIntArray4657[i];
		int i_459_ = Class382.anIntArray4661[i];
		int i_460_ = -i_452_ / 2;
		int i_461_ = -i_453_ / 2;
		int i_462_ = i_459_ * i_460_ + i_458_ * i_461_ >> 14;
		int i_463_ = i_461_ * i_459_ - i_458_ * i_460_ >> 14;
		int i_464_ = Class13.method507((int) class385.aFloat4671 + i_462_, i_463_ + (int) class385.aFloat4673, i_456_, i_457_, aByte7967, (byte) -124);
		int i_465_ = i_452_ / 2;
		int i_466_ = -i_453_ / 2;
		int i_467_ = i_465_ * i_459_ + i_458_ * i_466_ >> 14;
		int i_468_ = i_459_ * i_466_ - i_465_ * i_458_ >> 14;
		int i_469_ = Class13.method507(i_467_ + (int) class385.aFloat4671, (int) class385.aFloat4673 + i_468_, i_456_, i_457_, aByte7967, (byte) -103);
		int i_470_ = -i_452_ / 2;
		int i_471_ = i_453_ / 2;
		int i_472_ = i_459_ * i_470_ + i_458_ * i_471_ >> 14;
		int i_473_ = i_471_ * i_459_ - i_458_ * i_470_ >> 14;
		int i_474_ = Class13.method507((int) class385.aFloat4671 + i_472_, (int) class385.aFloat4673 + i_473_, i_456_, i_457_, aByte7967, (byte) -119);
		int i_475_ = i_452_ / 2;
		int i_476_ = i_453_ / 2;
		int i_477_ = i_459_ * i_475_ + i_476_ * i_458_ >> 14;
		int i_478_ = i_476_ * i_459_ - i_458_ * i_475_ >> 14;
		int i_479_ = Class13.method507((int) class385.aFloat4671 + i_477_, (int) class385.aFloat4673 + i_478_, i_456_, i_457_, aByte7967, (byte) -82);
		int i_480_ = i_464_ < i_469_ ? i_464_ : i_469_;
		int i_481_ = i_474_ < i_479_ ? i_474_ : i_479_;
		int i_482_ = i_469_ < i_479_ ? i_469_ : i_479_;
		int i_483_ = i_464_ < i_474_ ? i_464_ : i_474_;
		((Animable) this).anInt10322 = ((int) (Math.atan2((double) (i_480_ - i_481_), (double) i_453_) * 2607.5945876176133) & 0x3fff) * 2085530051;
		((Animable) this).anInt10323 = ((int) (Math.atan2((double) (i_483_ - i_482_), (double) i_452_) * 2607.5945876176133) & 0x3fff) * 884618779;
		if (0 != -35614997 * ((Animable) this).anInt10322 && i_454_ != 0) {
			int i_484_ = 16384 - i_454_;
			if (((Animable) this).anInt10322 * -35614997 > 8192) {
				if (-35614997 * ((Animable) this).anInt10322 < i_484_)
					((Animable) this).anInt10322 = i_484_ * 2085530051;
			} else if (((Animable) this).anInt10322 * -35614997 > i_454_)
				((Animable) this).anInt10322 = i_454_ * 2085530051;
		}
		if (((Animable) this).anInt10323 * -1768311789 != 0 && i_455_ != 0) {
			int i_485_ = 16384 - i_455_;
			if (((Animable) this).anInt10323 * -1768311789 > 8192) {
				if (((Animable) this).anInt10323 * -1768311789 < i_485_)
					((Animable) this).anInt10323 = 884618779 * i_485_;
			} else if ((-1768311789 * ((Animable) this).anInt10323) > i_455_)
				((Animable) this).anInt10323 = i_455_ * 884618779;
		}
		((Animable) this).anInt10363 = -1453470317 * (i_479_ + i_464_);
		if (i_469_ + i_474_ < ((Animable) this).anInt10363 * -628205413)
			((Animable) this).anInt10363 = -1453470317 * (i_474_ + i_469_);
		((Animable) this).anInt10363 = (-1453470317 * ((((Animable) this).anInt10363 * -628205413 >> 1) - (int) class385.aFloat4672));
	}

	public abstract int method15897();

	public abstract int method15898();

	public abstract int method15899(int i);

	public int method12995(int i) {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	boolean method15900(int i) {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}

	boolean method15901() {
		if (((Animable) this).anInt10344 * 1959466465 == -1)
			return false;
		return method15815((((Animable) this).anInt10344 * 1959466465), -1081352448);
	}
}
