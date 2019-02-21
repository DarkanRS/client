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
	public Interface inter;
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
	public Animation currentAnimation;
	public Class161[] aClass161Array10339;
	public int anInt10340;
	public int anInt10341;
	public int anInt10342;
	public int anInt10343;
	int interfaceIdToLoad;
	public int anInt10345;
	public int anInt10346;
	public int anInt10347;
	public int anInt10348;
	public int anInt10349;
	public int[] currentAnimations;
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
	public int loadedInterfaceId;
	public int anInt10375 = -1305000051;

	public void method15791(int i, boolean bool, byte i_0_) {
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
		if (bool || class227.anInt2820 * 729582379 != 0 || anInt10340 * 455380417 != 0) {
			anInt10361 = (i & 0x3fff) * 484383169;
			aClass19_10359.method577(1633416769 * anInt10361, 836947093);
		}
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
		if (initInterface())
			InteractableObject.method16099((inter.components), -1, i, i_2_, bool, (byte) 33);
	}

	public int method15796(byte i) {
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
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
			anIntArray10335 = new int[LinkedNodeList.DEFAULTS_LOADER_6.equipmentSlots.length];
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
			anIntArray10362 = new int[LinkedNodeList.DEFAULTS_LOADER_6.equipmentSlots.length];
			for (int i_13_ = 0; i_13_ < LinkedNodeList.DEFAULTS_LOADER_6.equipmentSlots.length; i_13_++)
				anIntArray10362[i_13_] = -1;
		}
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
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
				for (int i_18_ = 0; i_18_ < LinkedNodeList.DEFAULTS_LOADER_6.equipmentSlots.length; i_18_++) {
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

	void method15799(GraphicalRenderer class505, MeshRasterizer[] class528s, Matrix44Var class294, boolean bool, byte i) {
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
			((Animable) this).aClass539_10369.method11515(plane, aShort9458, localX, aShort9456, localY);
	}

	public final void sendSpotAnim(int spotAnimId, int i_35_, int i_36_, int i_37_, boolean bool, int index, int i_39_) {
		Class161 class161 = aClass161Array10339[index];
		int i_40_ = 378836105 * class161.anInt2012;
		if (-1 != spotAnimId && -1 != i_40_) {
			if (spotAnimId == i_40_) {
				SpotAnimDefinitions spotAnimDefs = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(spotAnimId, (byte) -32);
				if (spotAnimDefs.aBool6968 && -1 != spotAnimDefs.animationId * -364555849) {
					AnimationDefinitions animDefs = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(((spotAnimDefs.animationId) * -364555849), (byte) 21);
					int i_41_ = 554947543 * animDefs.anInt5907;
					if (0 == i_41_)
						return;
					if (2 == i_41_) {
						class161.aClass456_2014.method7584(955077688);
						return;
					}
				}
			} else {
				SpotAnimDefinitions spotAnimDefsSend = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(spotAnimId, (byte) 36);
				SpotAnimDefinitions spotAnimDefsCurrent = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_40_, (byte) -6);
				if (-1 != spotAnimDefsSend.animationId * -364555849 && spotAnimDefsCurrent.animationId * -364555849 != -1) {
					AnimationDefinitions animDefsSend = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs((-364555849 * (spotAnimDefsSend.animationId)), (byte) -33);
					AnimationDefinitions animDefsCurrent = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(((spotAnimDefsCurrent.animationId) * -364555849), (byte) 13);
					if (-1834317435 * animDefsSend.priority < -1834317435 * animDefsCurrent.priority)
						return;
				}
			}
		}
		int i_44_ = 0;
		if (-1 != spotAnimId && !(IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(spotAnimId, (byte) 62).aBool6968))
			i_44_ = 2;
		if (spotAnimId != -1 && bool)
			i_44_ = 1;
		class161.anInt2012 = spotAnimId * -1025302087;
		class161.anInt2011 = -523477979 * i_37_;
		class161.anInt2013 = (i_35_ >> 16) * 391696483;
		class161.anInt2015 = i_36_ * 1859279795;
		class161.aClass456_2014.method7571((-1 != spotAnimId ? ((IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(spotAnimId, (byte) -71).animationId) * -364555849) : -1), i_35_ & 0xffff, i_44_, false, -1358660139);
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
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
		int i_71_;
		if (class227.anInt2798 * 895441719 != -1)
			i_71_ = 895441719 * class227.anInt2798;
		else if (-32768 == ((Animable) this).anInt10317 * 296631531)
			i_71_ = 200;
		else
			i_71_ = -(296631531 * ((Animable) this).anInt10317);
		Class305 class305 = method11166();
		int i_72_ = (int) class305.aClass385_3595.x >> 9;
		int i_73_ = (int) class305.aClass385_3595.z >> 9;
		if (null != aClass206_7970 && i_72_ >= 1 && i_73_ >= 1 && i_72_ <= IndexLoaders.MAP_REGION_DECODER.getSizeX(2033491837) - 1 && i_73_ <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-2135239532) - 1) {
			Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[plane][i_72_][i_73_]);
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null)
				return class293.aClass521_Sub1_Sub3_3499.aShort9561 + i_71_;
		}
		return i_71_;
	}

	public abstract int method15804();

	public int getSize(int i) {
		return ((Animable) this).anInt10315 * 1959344547;
	}

	public void method14697(byte i) {
		int i_74_ = (240 + (1959344547 * ((Animable) this).anInt10315 - 1 << 8));
		Vector3 class385 = method11166().aClass385_3595;
		aShort9458 = (short) ((int) class385.x - i_74_ >> 9);
		aShort9456 = (short) ((int) class385.z - i_74_ >> 9);
		localX = (short) ((int) class385.x + i_74_ >> 9);
		localY = (short) ((int) class385.z + i_74_ >> 9);
	}

	Animable(SceneObjectManager class206) {
		this(class206, 10);
	}

	public abstract int method15806();

	boolean method12986(int i) {
		return false;
	}

	abstract int getRenderAnimation(int i);

	public abstract Class163 method15809();

	public void method14699() {
		int i = (240 + (1959344547 * ((Animable) this).anInt10315 - 1 << 8));
		Vector3 class385 = method11166().aClass385_3595;
		aShort9458 = (short) ((int) class385.x - i >> 9);
		aShort9456 = (short) ((int) class385.z - i >> 9);
		localX = (short) ((int) class385.x + i >> 9);
		localY = (short) ((int) class385.z + i >> 9);
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
		if (((Animable) this).interfaceIdToLoad * 1959466465 != 226532721 * loadedInterfaceId)
			method15816((byte) 106);
		((Animable) this).interfaceIdToLoad = -321130975 * i;
	}

	public abstract boolean method15814();

	boolean initInterface(int id, int i_83_) {
		if (loadedInterfaceId * 226532721 == id)
			return true;
		inter = Class288.getInterface(id, null, null, true, (byte) -56);
		if (inter == null)
			return false;
		loadedInterfaceId = -1342798959 * id;
		Class202.runIComponentScripts(inter.components, 2088119296);
		return true;
	}

	void method15816(byte i) {
		if (loadedInterfaceId * 226532721 != -1) {
			Class12.clearComponents(226532721 * loadedInterfaceId, -1658723672);
			inter = null;
			loadedInterfaceId = 1342798959;
		}
	}

	public void method15818(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		if (!initInterface()) {
			if (i != -1)
				client.aBoolArray7443[i] = true;
			else {
				for (int i_91_ = 0; i_91_ < 107; i_91_++)
					client.aBoolArray7443[i_91_] = true;
			}
		} else
			GroundDecoration.method16094(inter.method1616(2115136308), -1, i_84_, i_85_, i_86_, i_87_, i_88_, i_89_, i, false, (byte) 6);
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

	boolean method12999() {
		return false;
	}

	boolean method13001() {
		return ((Animable) this).aBool10312;
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

	public int method13007() {
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
		int i;
		if (class227.anInt2798 * 895441719 != -1)
			i = 895441719 * class227.anInt2798;
		else if (-32768 == ((Animable) this).anInt10317 * 296631531)
			i = 200;
		else
			i = -(296631531 * ((Animable) this).anInt10317);
		Class305 class305 = method11166();
		int i_118_ = (int) class305.aClass385_3595.x >> 9;
		int i_119_ = (int) class305.aClass385_3595.z >> 9;
		if (null != aClass206_7970 && i_118_ >= 1 && i_119_ >= 1 && i_118_ <= IndexLoaders.MAP_REGION_DECODER.getSizeX(1358683385) - 1 && i_119_ <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-947392385) - 1) {
			Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[plane][i_118_][i_119_]);
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null)
				return class293.aClass521_Sub1_Sub3_3499.aShort9561 + i;
		}
		return i;
	}

	public int method13028() {
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
		int i;
		if (class227.anInt2798 * 895441719 != -1)
			i = 895441719 * class227.anInt2798;
		else if (-32768 == ((Animable) this).anInt10317 * 296631531)
			i = 200;
		else
			i = -(296631531 * ((Animable) this).anInt10317);
		Class305 class305 = method11166();
		int i_120_ = (int) class305.aClass385_3595.x >> 9;
		int i_121_ = (int) class305.aClass385_3595.z >> 9;
		if (null != aClass206_7970 && i_120_ >= 1 && i_121_ >= 1 && i_120_ <= IndexLoaders.MAP_REGION_DECODER.getSizeX(-1295672030) - 1 && i_121_ <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1381064515) - 1) {
			Class293 class293 = (aClass206_7970.aClass293ArrayArrayArray2604[plane][i_120_][i_121_]);
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null)
				return class293.aClass521_Sub1_Sub3_3499.aShort9561 + i;
		}
		return i;
	}

	public void method15836(int i, byte i_156_) {
		((Animable) this).anInt10315 = -2140159477 * i;
	}

	void method15837(GraphicalRenderer class505, RenderAnimDefs class227, int i, int i_157_, int i_158_, int i_159_, byte i_160_) {
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
			if (-1 != 378836105 * class161.anInt2012 && !class161.aClass456_2014.hasSpeed(-544447199)) {
				SpotAnimDefinitions class525 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(((class161.anInt2012) * 378836105), (byte) 62);
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

	public abstract Class163 method15852();

	public int method15853() {
		return ((Animable) this).anInt10315 * 1959344547;
	}

	public void method14698() {
		int i = (240 + (1959344547 * ((Animable) this).anInt10315 - 1 << 8));
		Vector3 class385 = method11166().aClass385_3595;
		aShort9458 = (short) ((int) class385.x - i >> 9);
		aShort9456 = (short) ((int) class385.z - i >> 9);
		localX = (short) ((int) class385.x + i >> 9);
		localY = (short) ((int) class385.z + i >> 9);
	}
	
	public RenderAnimDefs getRenderAnimDefs(byte i) {
		int renderAnim = getRenderAnimation(635765286);
		if (renderAnim == -1)
			return RenderAnimIndexLoader.aClass227_2669;
		return IndexLoaders.RENDER_ANIMS.getRenderAnimDefs(renderAnim, (byte) -2);
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

	public void method15863(int i, int i_341_) {
		RenderAnimDefs class227 = getRenderAnimDefs((byte) -17);
		if (class227.anInt2820 * 729582379 != 0 || 0 != 455380417 * anInt10340) {
			aClass19_10359.method579(73676429);
			int i_342_ = i - 1040633965 * aClass19_10359.anInt153 & 0x3fff;
			if (i_342_ > 8192)
				anInt10361 = 484383169 * (1040633965 * aClass19_10359.anInt153 - (16384 - i_342_));
			else
				anInt10361 = ((i_342_ + 1040633965 * aClass19_10359.anInt153) * 484383169);
		}
	}

	abstract int method15867();

	abstract int method15868();

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
		currentAnimations = null;
		aClass456_Sub3_10337 = new Class456_Sub3(this, false);
		currentAnimation = new Class456_Sub2(this, false);
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
		loadedInterfaceId = 1342798959;
		((Animable) this).interfaceIdToLoad = 321130975;
		regionBaseX = new int[i];
		regionBaseY = new int[i];
		aByteArray10365 = new byte[i];
		aClass528Array10372 = new MeshRasterizer[5];
		aClass161Array10339 = new Class161[4];
		for (int i_343_ = 0; i_343_ < 4; i_343_++)
			aClass161Array10339[i_343_] = new Class161(this);
		aClass456_Sub2_Sub1Array10354 = (new Class456_Sub2_Sub1[LinkedNodeList.DEFAULTS_LOADER_6.equipmentSlots.length]);
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

	public void method15880(int i, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, int i_365_, byte i_366_) {
		if (initInterface())
			client.method11768(inter, inter.method1616(2121231895), -1, i, i_359_, i_360_, i_361_, i_362_, i_363_, i_364_, i_365_);
	}

	public abstract boolean method15887(int i);

	public int method13006() {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	public abstract int method15892();

	void method15895(int i, int i_417_, int i_418_, int i_419_, int i_420_, byte i_421_) {
		Vector3 class385 = method11166().aClass385_3595;
		int i_422_ = aShort9458 + localX >> 1;
		int i_423_ = localY + aShort9456 >> 1;
		int i_424_ = Class382.anIntArray4657[i];
		int i_425_ = Class382.anIntArray4661[i];
		int i_426_ = -i_417_ / 2;
		int i_427_ = -i_418_ / 2;
		int i_428_ = i_425_ * i_426_ + i_424_ * i_427_ >> 14;
		int i_429_ = i_427_ * i_425_ - i_424_ * i_426_ >> 14;
		int i_430_ = Class13.method507((int) class385.x + i_428_, i_429_ + (int) class385.z, i_422_, i_423_, plane, (byte) -92);
		int i_431_ = i_417_ / 2;
		int i_432_ = -i_418_ / 2;
		int i_433_ = i_431_ * i_425_ + i_424_ * i_432_ >> 14;
		int i_434_ = i_425_ * i_432_ - i_431_ * i_424_ >> 14;
		int i_435_ = Class13.method507(i_433_ + (int) class385.x, (int) class385.z + i_434_, i_422_, i_423_, plane, (byte) -75);
		int i_436_ = -i_417_ / 2;
		int i_437_ = i_418_ / 2;
		int i_438_ = i_425_ * i_436_ + i_424_ * i_437_ >> 14;
		int i_439_ = i_437_ * i_425_ - i_424_ * i_436_ >> 14;
		int i_440_ = Class13.method507((int) class385.x + i_438_, (int) class385.z + i_439_, i_422_, i_423_, plane, (byte) -66);
		int i_441_ = i_417_ / 2;
		int i_442_ = i_418_ / 2;
		int i_443_ = i_425_ * i_441_ + i_442_ * i_424_ >> 14;
		int i_444_ = i_442_ * i_425_ - i_424_ * i_441_ >> 14;
		int i_445_ = Class13.method507((int) class385.x + i_443_, (int) class385.z + i_444_, i_422_, i_423_, plane, (byte) -13);
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
		((Animable) this).anInt10363 = (-1453470317 * ((((Animable) this).anInt10363 * -628205413 >> 1) - (int) class385.y));
	}

	public abstract int method15897();

	public abstract int method15898();

	public abstract int method15899(int i);

	public int method12995(int i) {
		if (((Animable) this).anInt10317 * 296631531 == -32768)
			return 0;
		return 296631531 * ((Animable) this).anInt10317;
	}

	boolean initInterface() {
		if (((Animable) this).interfaceIdToLoad * 1959466465 == -1)
			return false;
		return initInterface((((Animable) this).interfaceIdToLoad * 1959466465), -1081352448);
	}
}
