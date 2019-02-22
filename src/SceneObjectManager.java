
/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class SceneObjectManager {
	public Class390[] aClass390Array2591;
	public int anInt2592;
	int anInt2593;
	int anInt2594;
	byte[][] aByteArrayArray2595;
	GraphicalRenderer aClass505_2596;
	Class454 aClass454_2597;
	boolean aBool2598;
	boolean aBool2599;
	public Class201 aClass201_2600;
	public int anInt2601;
	int anInt2602;
	public int anInt2603;
	public Class293[][][] aClass293ArrayArrayArray2604;
	Class521_Sub1[] aClass521_Sub1Array2605;
	int[][] anIntArrayArray2606;
	public Class390[] aClass390Array2607;
	public Class293[][][] aClass293ArrayArrayArray2608;
	int anInt2609;
	public Class293[][][] aClass293ArrayArrayArray2610;
	short[][] aShortArrayArray2611;
	byte[][] aByteArrayArray2612;
	byte[][] aByteArrayArray2613;
	public Class390[] aClass390Array2614;
	int anInt2615;
	int anInt2616;
	public int anInt2617;
	int anInt2618 = 5015;
	int anInt2619 = 5040;
	byte[][] aByteArrayArray2620;
	int anInt2621;
	int anInt2622 = 16;
	int anInt2623;
	int anInt2624;
	Class521_Sub1[] aClass521_Sub1Array2625;
	Class521_Sub1[] aClass521_Sub1Array2626;
	Class521_Sub1_Sub1[] aClass521_Sub1_Sub1Array2627;
	int anInt2628;
	int anInt2629;
	int anInt2630;
	boolean[][] aBoolArrayArray2631;
	int anInt2632;
	Class521_Sub1[] aClass521_Sub1Array2633;
	int anInt2634 = 10072;
	boolean[][] aBoolArrayArray2635;
	int anInt2636;
	int anInt2637;
	int anInt2638;
	float[] aFloatArray2639;
	int anInt2640;
	int[] anIntArray2641;
	Class282_Sub24[] aClass282_Sub24Array2642;
	int anInt2643 = 65361;
	public static boolean aBool2644 = true;
	long[][][] aLongArrayArrayArray2645;
	Class287[] aClass287Array2646;
	boolean[] aBoolArray2647;
	public XLogin aClass284_2648;
	Class521_Sub1[] aClass521_Sub1Array2649;
	int anInt2650;
	boolean[][] aBoolArrayArray2651;
	int anInt2652;

	public void method3377(int i, int i_0_, int i_1_, SceneObjectNode class521_sub1_sub3) {
		Class293 class293 = method3459(i, i_0_, i_1_, -855868021);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub3_3499 = class521_sub1_sub3;
			int i_2_ = aClass390Array2591 == aClass390Array2614 ? 1 : 0;
			if (class521_sub1_sub3.method12986(-840829634)) {
				if (class521_sub1_sub3.method12987(560630672)) {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_2_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_2_] = class521_sub1_sub3;
				} else {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_2_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_2_] = class521_sub1_sub3;
				}
			} else {
				((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_2_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_2_] = class521_sub1_sub3;
			}
		}
	}

	public void method3378(int i, int i_3_) {
		/* empty */
	}

	public void method3379(FontRenderer class8, byte i) {
		/* empty */
	}

	public void method3380(boolean bool, int i) {
		if (bool) {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2608;
			aClass390Array2591 = aClass390Array2614;
		} else {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2610;
			aClass390Array2591 = aClass390Array2607;
		}
		anInt2601 = aClass293ArrayArrayArray2604.length * 483772969;
	}

	public Class521_Sub1_Sub5 getWall(int i, int i_4_, int i_5_, byte i_6_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_4_][i_5_];
		if (null == class293)
			return null;
		return class293.aClass521_Sub1_Sub5_3505;
	}

	public void method3382(int i, int i_7_, int i_8_) {
		Class293 class293 = aClass293ArrayArrayArray2604[0][i][i_7_];
		for (int i_9_ = 0; i_9_ < 3; i_9_++) {
			Class293 class293_10_ = (aClass293ArrayArrayArray2604[i_9_][i][i_7_] = aClass293ArrayArrayArray2604[1 + i_9_][i][i_7_]);
			if (class293_10_ != null) {
				for (Class208 class208 = class293_10_.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
					Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
					if (class521_sub1_sub1.aShort9458 == i && class521_sub1_sub1.aShort9456 == i_7_)
						class521_sub1_sub1.plane--;
				}
				if (null != class293_10_.aClass521_Sub1_Sub3_3499)
					class293_10_.aClass521_Sub1_Sub3_3499.plane--;
				if (null != class293_10_.aClass521_Sub1_Sub5_3505)
					class293_10_.aClass521_Sub1_Sub5_3505.plane--;
				if (null != class293_10_.aClass521_Sub1_Sub5_3502)
					class293_10_.aClass521_Sub1_Sub5_3502.plane--;
				if (class293_10_.aClass521_Sub1_Sub4_3503 != null)
					class293_10_.aClass521_Sub1_Sub4_3503.plane--;
				if (null != class293_10_.aClass521_Sub1_Sub4_3500)
					class293_10_.aClass521_Sub1_Sub4_3500.plane--;
			}
		}
		if (null == aClass293ArrayArrayArray2604[0][i][i_7_]) {
			aClass293ArrayArrayArray2604[0][i][i_7_] = new Class293(0);
			aClass293ArrayArrayArray2604[0][i][i_7_].aByte3507 = (byte) 1;
		}
		aClass293ArrayArrayArray2604[0][i][i_7_].aClass293_3509 = class293;
		aClass293ArrayArrayArray2604[3][i][i_7_] = null;
	}

	public void method3383(int i, int i_11_, int i_12_, int i_13_, byte[][][] is, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int i_19_, byte i_20_, int i_21_, int i_22_, boolean bool, boolean bool_23_, int i_24_, boolean bool_25_) {
		((Class201) aClass201_2600).aBool2542 = true;
		((SceneObjectManager) this).aBool2599 = bool_23_;
		((SceneObjectManager) this).anInt2628 = (i_11_ >> anInt2592 * -1928575293) * 453572397;
		((SceneObjectManager) this).anInt2629 = (i_13_ >> anInt2592 * -1928575293) * -1765393037;
		((SceneObjectManager) this).anInt2630 = i_11_ * -2116407601;
		((SceneObjectManager) this).anInt2650 = i_13_ * 1955010611;
		((SceneObjectManager) this).anInt2632 = i_12_ * 449309197;
		((SceneObjectManager) this).anInt2637 = (((SceneObjectManager) this).anInt2628 * -94301647 - ((SceneObjectManager) this).anInt2652 * -589362899);
		if (260560053 * ((SceneObjectManager) this).anInt2637 < 0) {
			((SceneObjectManager) this).anInt2602 = -(-869346571 * ((SceneObjectManager) this).anInt2637);
			((SceneObjectManager) this).anInt2637 = 0;
		} else
			((SceneObjectManager) this).anInt2602 = 0;
		((SceneObjectManager) this).anInt2621 = (-2134113369 * ((SceneObjectManager) this).anInt2629 - 1959093013 * ((SceneObjectManager) this).anInt2652);
		if (-1955723827 * ((SceneObjectManager) this).anInt2621 < 0) {
			((SceneObjectManager) this).anInt2636 = -(-823028627 * ((SceneObjectManager) this).anInt2621);
			((SceneObjectManager) this).anInt2621 = 0;
		} else
			((SceneObjectManager) this).anInt2636 = 0;
		((SceneObjectManager) this).anInt2638 = (-438519439 * ((SceneObjectManager) this).anInt2652 + 2114225605 * ((SceneObjectManager) this).anInt2628);
		if (170184033 * ((SceneObjectManager) this).anInt2638 > -1912960305 * anInt2617)
			((SceneObjectManager) this).anInt2638 = 438474287 * anInt2617;
		((SceneObjectManager) this).anInt2640 = (-1498695357 * ((SceneObjectManager) this).anInt2652 + ((SceneObjectManager) this).anInt2629 * -983308767);
		if (-887086501 * ((SceneObjectManager) this).anInt2640 > -18177099 * anInt2603)
			((SceneObjectManager) this).anInt2640 = anInt2603 * 1406340911;
		boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2651;
		boolean[][] bools_26_ = ((SceneObjectManager) this).aBoolArrayArray2635;
		if (((SceneObjectManager) this).aBool2599) {
			for (int i_27_ = 0; i_27_ < (((SceneObjectManager) this).anInt2652 * 1459994833 + ((SceneObjectManager) this).anInt2652 * 1459994833 + 2); i_27_++) {
				int i_28_ = 0;
				int i_29_ = 0;
				for (int i_30_ = 0; i_30_ < 2 + (((SceneObjectManager) this).anInt2652 * 1459994833 + ((SceneObjectManager) this).anInt2652 * 1459994833); i_30_++) {
					if (i_30_ > 1)
						((SceneObjectManager) this).anIntArray2641[i_30_ - 2] = i_28_;
					i_28_ = i_29_;
					int i_31_ = (-527863643 * ((SceneObjectManager) this).anInt2628 - 1459994833 * ((SceneObjectManager) this).anInt2652 + i_27_);
					int i_32_ = i_30_ + (((SceneObjectManager) this).anInt2629 * 1580412859 - 1459994833 * ((SceneObjectManager) this).anInt2652);
					if (i_31_ >= 0 && i_32_ >= 0 && i_31_ < anInt2617 * -1912960305 && i_32_ < anInt2603 * -18177099) {
						int i_33_ = i_31_ << anInt2592 * -1928575293;
						int i_34_ = i_32_ << -1928575293 * anInt2592;
						int i_35_ = (aClass390Array2607[aClass390Array2607.length - 1].method6722(i_31_, i_32_, 65280) - (1000 << -1928575293 * anInt2592 - 7));
						int i_36_ = ((aClass390Array2614 != null ? (aClass390Array2614[0].method6722(i_31_, i_32_, 65280) + ((SceneObjectManager) this).anInt2593 * 1885735347) : (aClass390Array2607[0].method6722(i_31_, i_32_, 65280) + ((SceneObjectManager) this).anInt2593 * 1885735347)) + (1000 << -1928575293 * anInt2592 - 7));
						i_29_ = (((SceneObjectManager) this).aClass505_2596.method8437(i_33_, i_35_, i_34_, i_33_, i_36_, i_34_));
						((SceneObjectManager) this).aBoolArrayArray2635[i_27_][i_30_] = i_29_ == 0;
					} else {
						i_29_ = -1;
						((SceneObjectManager) this).aBoolArrayArray2635[i_27_][i_30_] = false;
					}
					if (i_27_ > 0 && i_30_ > 0) {
						int i_37_ = (((SceneObjectManager) this).anIntArray2641[i_30_ - 1] & ((SceneObjectManager) this).anIntArray2641[i_30_] & i_28_ & i_29_);
						((SceneObjectManager) this).aBoolArrayArray2651[i_27_ - 1][(i_30_ - 1)] = i_37_ == 0;
					}
				}
				((SceneObjectManager) this).anIntArray2641[(1459994833 * ((SceneObjectManager) this).anInt2652 + 1459994833 * ((SceneObjectManager) this).anInt2652)] = i_28_;
				((SceneObjectManager) this).anIntArray2641[1 + (((SceneObjectManager) this).anInt2652 * 1459994833 + 1459994833 * ((SceneObjectManager) this).anInt2652)] = i_29_;
			}
			if (!bool_25_)
				((Class201) aClass201_2600).aBool2542 = false;
			else {
				((Class201) aClass201_2600).anIntArray2569 = is_14_;
				((Class201) aClass201_2600).anIntArray2561 = is_15_;
				((Class201) aClass201_2600).anIntArray2562 = is_16_;
				((Class201) aClass201_2600).anIntArray2568 = is_17_;
				((Class201) aClass201_2600).anIntArray2560 = is_18_;
				aClass201_2600.method3265(((SceneObjectManager) this).aClass505_2596, i_19_);
			}
		} else {
			if (((SceneObjectManager) this).aBoolArrayArray2631 == null)
				((SceneObjectManager) this).aBoolArrayArray2631 = (new boolean[(1459994833 * ((SceneObjectManager) this).anInt2652 + ((SceneObjectManager) this).anInt2652 * 1459994833 + 2)][(((SceneObjectManager) this).anInt2652 * 1459994833 + ((SceneObjectManager) this).anInt2652 * 1459994833 + 2)]);
			for (int i_38_ = 0; i_38_ < ((SceneObjectManager) this).aBoolArrayArray2631.length; i_38_++) {
				for (int i_39_ = 0; i_39_ < ((SceneObjectManager) this).aBoolArrayArray2631[0].length; i_39_++)
					((SceneObjectManager) this).aBoolArrayArray2631[i_38_][i_39_] = true;
			}
			((SceneObjectManager) this).aBoolArrayArray2635 = ((SceneObjectManager) this).aBoolArrayArray2631;
			((SceneObjectManager) this).aBoolArrayArray2651 = ((SceneObjectManager) this).aBoolArrayArray2631;
			((SceneObjectManager) this).anInt2637 = 0;
			((SceneObjectManager) this).anInt2621 = 0;
			((SceneObjectManager) this).anInt2638 = anInt2617 * 438474287;
			((SceneObjectManager) this).anInt2640 = 1406340911 * anInt2603;
			((Class201) aClass201_2600).aBool2542 = false;
		}
		ChatLine.method1848(this, ((SceneObjectManager) this).aClass505_2596, 1003653340);
		if (!((XLogin) aClass284_2648).aBool3386) {
			Iterator iterator = aClass284_2648.aList3388.iterator();
			while (iterator.hasNext()) {
				Class285 class285 = (Class285) iterator.next();
				iterator.remove();
				Class279.method4969(class285, 1362412061);
			}
		}
		if (((SceneObjectManager) this).aBool2598) {
			for (int i_40_ = 0; i_40_ < ((SceneObjectManager) this).anInt2615 * -1136166139; i_40_++)
				((SceneObjectManager) this).aClass287Array2646[i_40_].method5053(i, bool, -36765707);
		}
		if (null != aClass293ArrayArrayArray2608) {
			method3380(true, -914334995);
			((SceneObjectManager) this).aClass505_2596.method8475(-1, new Class90(1583160, 40, 127, 63, 0, 0, 0));
			method3441(true, is, i_19_, i_20_, i_24_);
			((SceneObjectManager) this).aClass505_2596.O();
			method3380(false, -914334995);
		}
		method3441(false, is, i_19_, i_20_, i_24_);
		if (!((SceneObjectManager) this).aBool2599) {
			((SceneObjectManager) this).aBoolArrayArray2651 = bools;
			((SceneObjectManager) this).aBoolArrayArray2635 = bools_26_;
		}
	}

	public void method3384(int i, int i_41_, int i_42_, byte i_43_) {
		boolean bool = (aClass293ArrayArrayArray2604[0][i_41_][i_42_] != null && null != (aClass293ArrayArrayArray2604[0][i_41_][i_42_].aClass293_3509));
		for (int i_44_ = i; i_44_ >= 0; i_44_--) {
			if (aClass293ArrayArrayArray2604[i_44_][i_41_][i_42_] == null) {
				Class293 class293 = (aClass293ArrayArrayArray2604[i_44_][i_41_][i_42_] = new Class293(i_44_));
				if (bool)
					class293.aByte3507++;
			}
		}
	}

	public void method3385(int i, Class390 class390, int i_45_) {
		aClass390Array2591[i] = class390;
	}

	public int method3386(int i, int i_46_, int i_47_) {
		return (null != ((SceneObjectManager) this).aShortArrayArray2611 ? ((SceneObjectManager) this).aShortArrayArray2611[i][i_46_] & 0xffff : 0);
	}

	public int method3387(int i, int i_48_, byte i_49_) {
		return (null != ((SceneObjectManager) this).anIntArrayArray2606 ? ((SceneObjectManager) this).anIntArrayArray2606[i][i_48_] & 0xffffff : 0);
	}

	void method3388(Class521_Sub1[] class521_sub1s, int i, int i_50_) {
		if (i < i_50_) {
			int i_51_ = (i_50_ + i) / 2;
			int i_52_ = i;
			Class521_Sub1 class521_sub1 = class521_sub1s[i_51_];
			class521_sub1s[i_51_] = class521_sub1s[i_50_];
			class521_sub1s[i_50_] = class521_sub1;
			int i_53_ = ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495;
			for (int i_54_ = i; i_54_ < i_50_; i_54_++) {
				if ((((Class521_Sub1) class521_sub1s[i_54_]).anInt7969 * 1272394495) > i_53_ + (i_54_ & 0x1)) {
					Class521_Sub1 class521_sub1_55_ = class521_sub1s[i_54_];
					class521_sub1s[i_54_] = class521_sub1s[i_52_];
					class521_sub1s[i_52_++] = class521_sub1_55_;
				}
			}
			class521_sub1s[i_50_] = class521_sub1s[i_52_];
			class521_sub1s[i_52_] = class521_sub1;
			method3502(class521_sub1s, i, i_52_ - 1);
			method3502(class521_sub1s, 1 + i_52_, i_50_);
		}
	}

	void method3389(int i, int i_56_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_57_ = i; i_57_ < i_56_; i_57_++) {
			Class390 class390 = aClass390Array2607[i_57_];
			if (class390 != null) {
				for (int i_58_ = 0; i_58_ < anInt2603 * -18177099; i_58_++) {
					for (int i_59_ = 0; i_59_ < -1912960305 * anInt2617; i_59_++) {
						class282_sub50_sub17 = class390.w(i_59_, i_58_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_60_ = i_59_ << -1928575293 * anInt2592;
							int i_61_ = i_58_ << anInt2592 * -1928575293;
							for (int i_62_ = i_57_ - 1; i_62_ >= 0; i_62_--) {
								Class390 class390_63_ = aClass390Array2607[i_62_];
								if (null != class390_63_) {
									int i_64_ = (class390.method6722(i_59_, i_58_, 65280) - class390_63_.method6722(i_59_, i_58_, 65280));
									int i_65_ = (class390.method6722(i_59_ + 1, i_58_, 65280) - class390_63_.method6722(i_59_ + 1, i_58_, 65280));
									int i_66_ = (class390.method6722(i_59_ + 1, 1 + i_58_, 65280) - class390_63_.method6722(i_59_ + 1, i_58_ + 1, 65280));
									int i_67_ = (class390.method6722(i_59_, 1 + i_58_, 65280) - class390_63_.method6722(i_59_, 1 + i_58_, 65280));
									class390_63_.UA(class282_sub50_sub17, i_60_, ((i_67_ + (i_66_ + (i_65_ + i_64_))) / 4), i_61_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	void method3390(Class521_Sub1 class521_sub1, int i, int i_68_, int i_69_) {
		if (i_68_ < -1912960305 * anInt2617) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_68_ + 1][i_69_];
			if (class293 != null && null != class293.aClass521_Sub1_Sub3_3499 && class293.aClass521_Sub1_Sub3_3499.method12985(-1099111910))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, 0, true, -1781676417);
		}
		if (i_69_ < anInt2617 * -1912960305) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_68_][1 + i_69_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1227844707))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, 0, 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -2025925569);
		}
		if (i_68_ < -1912960305 * anInt2617 && i_69_ < -18177099 * anInt2603) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_68_][1 + i_69_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1211523084))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -1710939145);
		}
		if (i_68_ < -1912960305 * anInt2617 && i_69_ > 0) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_68_][i_69_ - 1];
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1406035096))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (((SceneObjectManager) this).anInt2593 * 1885735347), 0, -(((SceneObjectManager) this).anInt2593 * 1885735347), true, -2094823069);
		}
	}

	public int method3391(int i, int i_70_, int i_71_) {
		return (null != ((SceneObjectManager) this).aByteArrayArray2620 ? ((SceneObjectManager) this).aByteArrayArray2620[i][i_70_] & 0xff : 0);
	}

	public void method3392(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, short i_79_) {
		if (((SceneObjectManager) this).anIntArrayArray2606 != null)
			((SceneObjectManager) this).anIntArrayArray2606[i][i_72_] = ~0xffffff | i_73_;
		if (((SceneObjectManager) this).aShortArrayArray2611 != null)
			((SceneObjectManager) this).aShortArrayArray2611[i][i_72_] = (short) i_74_;
		if (null != ((SceneObjectManager) this).aByteArrayArray2612)
			((SceneObjectManager) this).aByteArrayArray2612[i][i_72_] = (byte) i_75_;
		if (((SceneObjectManager) this).aByteArrayArray2613 != null)
			((SceneObjectManager) this).aByteArrayArray2613[i][i_72_] = (byte) i_76_;
		if (null != ((SceneObjectManager) this).aByteArrayArray2595)
			((SceneObjectManager) this).aByteArrayArray2595[i][i_72_] = (byte) i_77_;
		if (null != ((SceneObjectManager) this).aByteArrayArray2620)
			((SceneObjectManager) this).aByteArrayArray2620[i][i_72_] = (byte) i_78_;
	}

	public void method3393(int i, int i_80_, int i_81_, SceneObjectNode class521_sub1_sub3, int i_82_) {
		Class293 class293 = method3459(i, i_80_, i_81_, -204527757);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub3_3499 = class521_sub1_sub3;
			int i_83_ = aClass390Array2591 == aClass390Array2614 ? 1 : 0;
			if (class521_sub1_sub3.method12986(-152076894)) {
				if (class521_sub1_sub3.method12987(1864171775)) {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_83_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_83_] = class521_sub1_sub3;
				} else {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_83_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_83_] = class521_sub1_sub3;
				}
			} else {
				((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_83_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_83_] = class521_sub1_sub3;
			}
		}
	}

	public void method3394(int i, int i_84_, int i_85_, int i_86_, Class521_Sub1_Sub2 class521_sub1_sub2, byte i_87_) {
		Class293 class293 = method3459(i, i_84_, i_85_, 546259933);
		if (class293 != null) {
			class521_sub1_sub2.method11171(new Vector3((float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_84_ << anInt2592 * -1928575293)), (float) i_86_, (float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_85_ << anInt2592 * -1928575293))));
			((Class293) class293).aClass521_Sub1_Sub2_3506 = class521_sub1_sub2;
			int i_88_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub2.method12986(-1465902560)) {
				if (class521_sub1_sub2.method12987(-1746699245)) {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_88_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_88_] = class521_sub1_sub2;
				} else {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_88_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_88_] = class521_sub1_sub2;
				}
			} else {
				((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_88_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_88_] = class521_sub1_sub2;
			}
		}
	}

	public void method3395(int i, int i_89_, int i_90_, Class521_Sub1_Sub5 class521_sub1_sub5, Class521_Sub1_Sub5 class521_sub1_sub5_91_, int i_92_) {
		Class293 class293 = method3459(i, i_89_, i_90_, -322644171);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub5_3505 = class521_sub1_sub5;
			class293.aClass521_Sub1_Sub5_3502 = class521_sub1_sub5_91_;
			int i_93_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub5.method12986(-422075919)) {
				if (class521_sub1_sub5.method12987(-1845208495)) {
					((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_93_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_93_] = class521_sub1_sub5;
				} else {
					((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_93_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_93_] = class521_sub1_sub5;
				}
			} else {
				((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_93_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_93_] = class521_sub1_sub5;
			}
			if (null != class521_sub1_sub5_91_) {
				if (class521_sub1_sub5_91_.method12986(-1805444814)) {
					if (class521_sub1_sub5_91_.method12987(-1456067745)) {
						((Class521_Sub1_Sub5) class521_sub1_sub5_91_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_93_];
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_93_] = class521_sub1_sub5_91_;
					} else {
						((Class521_Sub1_Sub5) class521_sub1_sub5_91_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_93_];
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_93_] = class521_sub1_sub5_91_;
					}
				} else {
					((Class521_Sub1_Sub5) class521_sub1_sub5_91_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_93_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_93_] = class521_sub1_sub5_91_;
				}
			}
		}
	}

	public void method3396(int i, int i_94_, int i_95_, Class521_Sub1_Sub4 class521_sub1_sub4, Class521_Sub1_Sub4 class521_sub1_sub4_96_, byte i_97_) {
		Class293 class293 = method3459(i, i_94_, i_95_, -144176397);
		if (null != class293) {
			class293.aClass521_Sub1_Sub4_3503 = class521_sub1_sub4;
			class293.aClass521_Sub1_Sub4_3500 = class521_sub1_sub4_96_;
			int i_98_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub4.method12986(-287475150)) {
				if (class521_sub1_sub4.method12987(-1554775076)) {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_98_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_98_] = class521_sub1_sub4;
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_98_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_98_] = class521_sub1_sub4;
				}
			} else {
				((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_98_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_98_] = class521_sub1_sub4;
			}
			if (null != class521_sub1_sub4_96_) {
				if (class521_sub1_sub4_96_.method12986(-1380725108)) {
					if (class521_sub1_sub4_96_.method12987(-1946462410)) {
						((Class521_Sub1_Sub4) class521_sub1_sub4_96_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_98_];
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_98_] = class521_sub1_sub4_96_;
					} else {
						((Class521_Sub1_Sub4) class521_sub1_sub4_96_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_98_];
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_98_] = class521_sub1_sub4_96_;
					}
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4_96_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_98_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_98_] = class521_sub1_sub4_96_;
				}
			}
		}
	}

	public boolean method3397(Class521_Sub1_Sub1 class521_sub1_sub1, boolean bool, int i) {
		boolean bool_99_ = aClass390Array2591 == aClass390Array2614;
		int i_100_ = 0;
		short i_101_ = 0;
		byte i_102_ = 0;
		class521_sub1_sub1.method14697((byte) 115);
		if (class521_sub1_sub1.aShort9458 < 0 || class521_sub1_sub1.aShort9456 < 0 || class521_sub1_sub1.localX >= anInt2617 * -1912960305 || class521_sub1_sub1.localY >= -18177099 * anInt2603)
			return false;
		short i_103_ = 0;
		for (int i_104_ = class521_sub1_sub1.aShort9458; i_104_ <= class521_sub1_sub1.localX; i_104_++) {
			for (int i_105_ = class521_sub1_sub1.aShort9456; i_105_ <= class521_sub1_sub1.localY; i_105_++) {
				Class293 class293 = method3459(class521_sub1_sub1.plane, i_104_, i_105_, 123590531);
				if (class293 != null) {
					Class208 class208 = Class153.method2622(class521_sub1_sub1, -2120940003);
					Class208 class208_106_ = class293.aClass208_3504;
					if (class208_106_ == null)
						class293.aClass208_3504 = class208;
					else {
						for (/**/; class208_106_.aClass208_2660 != null; class208_106_ = class208_106_.aClass208_2660) {
							/* empty */
						}
						class208_106_.aClass208_2660 = class208;
					}
					if (bool_99_ && ((((SceneObjectManager) this).anIntArrayArray2606[i_104_][i_105_]) & ~0xffffff) != 0) {
						i_100_ = (((SceneObjectManager) this).anIntArrayArray2606[i_104_][i_105_]);
						i_101_ = (((SceneObjectManager) this).aShortArrayArray2611[i_104_][i_105_]);
						i_102_ = (((SceneObjectManager) this).aByteArrayArray2612[i_104_][i_105_]);
					}
					if (!bool && class293.aClass521_Sub1_Sub3_3499 != null && (class293.aClass521_Sub1_Sub3_3499.aShort9561 > i_103_))
						i_103_ = class293.aClass521_Sub1_Sub3_3499.aShort9561;
				}
			}
		}
		if (bool_99_ && (i_100_ & ~0xffffff) != 0) {
			for (int i_107_ = class521_sub1_sub1.aShort9458; i_107_ <= class521_sub1_sub1.localX; i_107_++) {
				for (int i_108_ = class521_sub1_sub1.aShort9456; i_108_ <= class521_sub1_sub1.localY; i_108_++) {
					if (0 == ((((SceneObjectManager) this).anIntArrayArray2606[i_107_][i_108_]) & ~0xffffff)) {
						((SceneObjectManager) this).anIntArrayArray2606[i_107_][i_108_] = i_100_;
						((SceneObjectManager) this).aShortArrayArray2611[i_107_][i_108_] = i_101_;
						((SceneObjectManager) this).aByteArrayArray2612[i_107_][i_108_] = i_102_;
					}
				}
			}
		}
		if (bool) {
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[((((SceneObjectManager) this).anInt2616 += -1378536477) * -1983534645 - 1)] = class521_sub1_sub1;
			class521_sub1_sub1.aClass206_7970 = this;
		} else {
			int i_109_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub1.method12986(-874752575)) {
				if (class521_sub1_sub1.method12987(331122687)) {
					((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_109_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_109_] = class521_sub1_sub1;
				} else {
					((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_109_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_109_] = class521_sub1_sub1;
				}
			} else {
				((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_109_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_109_] = class521_sub1_sub1;
			}
		}
		if (bool) {
			Vector3 class385 = Vector3.method6623(class521_sub1_sub1.method11166().aClass385_3595);
			class385.y -= (float) i_103_;
			class521_sub1_sub1.method11171(class385);
			class385.method6624();
		}
		return true;
	}

	public void method3398(int i, int i_110_, int i_111_, int i_112_, byte i_113_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_110_][i_111_];
		if (class293 != null) {
			Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3503;
			Class521_Sub1_Sub4 class521_sub1_sub4_114_ = class293.aClass521_Sub1_Sub4_3500;
			if (null != class521_sub1_sub4) {
				class521_sub1_sub4.aShort9611 = (short) (i_112_ * class521_sub1_sub4.aShort9611 / (16 << anInt2592 * -1928575293 - 7));
				class521_sub1_sub4.aShort9612 = (short) (class521_sub1_sub4.aShort9612 * i_112_ / (16 << -1928575293 * anInt2592 - 7));
			}
			if (null != class521_sub1_sub4_114_) {
				class521_sub1_sub4_114_.aShort9611 = (short) (class521_sub1_sub4_114_.aShort9611 * i_112_ / (16 << -1928575293 * anInt2592 - 7));
				class521_sub1_sub4_114_.aShort9612 = (short) (i_112_ * class521_sub1_sub4_114_.aShort9612 / (16 << anInt2592 * -1928575293 - 7));
			}
		}
	}

	public void method3399(byte i) {
		for (int i_115_ = 0; i_115_ < ((SceneObjectManager) this).anInt2616 * -1983534645; i_115_++) {
			if (i == 1)
				return;
			Class521_Sub1_Sub1 class521_sub1_sub1 = ((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_115_];
			method3407(class521_sub1_sub1, true, -1696604087);
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_115_] = null;
		}
		((SceneObjectManager) this).anInt2616 = 0;
	}

	public void method3400() {
		for (int i = 0; i < anInt2601 * -1485737447; i++) {
			for (int i_116_ = 0; i_116_ < -1912960305 * anInt2617; i_116_++) {
				for (int i_117_ = 0; i_117_ < -18177099 * anInt2603; i_117_++) {
					Class293 class293 = aClass293ArrayArrayArray2604[i][i_116_][i_117_];
					if (class293 != null) {
						Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
						Class521_Sub1_Sub5 class521_sub1_sub5_118_ = class293.aClass521_Sub1_Sub5_3502;
						if (class521_sub1_sub5 != null && class521_sub1_sub5.method12985(-1950778651)) {
							method3452(class521_sub1_sub5, i, i_116_, i_117_, 1, 1);
							if (class521_sub1_sub5_118_ != null && class521_sub1_sub5_118_.method12985(-770467208)) {
								method3452(class521_sub1_sub5_118_, i, i_116_, i_117_, 1, 1);
								class521_sub1_sub5_118_.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, 0, 0, 0, false, -1985350019);
								class521_sub1_sub5_118_.method12984(150172527);
							}
							class521_sub1_sub5.method12984(-727923375);
						}
						for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-776427124)) {
								method3452(class521_sub1_sub1, i, i_116_, i_117_, 1 + (class521_sub1_sub1.localX - (class521_sub1_sub1.aShort9458)), (class521_sub1_sub1.localY - class521_sub1_sub1.aShort9456 + 1));
								class521_sub1_sub1.method12984(1378070205);
							}
						}
						SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
						if (null != class521_sub1_sub3 && class521_sub1_sub3.method12985(-1912639539)) {
							method3417(class521_sub1_sub3, i, i_116_, i_117_, 1236537030);
							class521_sub1_sub3.method12984(107766505);
						}
					}
				}
			}
		}
	}

	public int method3401(int i, int i_119_) {
		return (null != ((SceneObjectManager) this).anIntArrayArray2606 ? ((SceneObjectManager) this).anIntArrayArray2606[i][i_119_] & 0xffffff : 0);
	}

	public Class521_Sub1_Sub4 method3402(int i, int i_120_, int i_121_, byte i_122_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_120_][i_121_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub4_3503, 1327771301);
			if (class293.aClass521_Sub1_Sub4_3503 != null) {
				Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3503;
				class293.aClass521_Sub1_Sub4_3503 = null;
				return class521_sub1_sub4;
			}
		}
		return null;
	}

	void method3403(Class521_Sub1 class521_sub1) {
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		((SceneObjectManager) this).aClass505_2596.method8479((float) (int) class385.x, (float) ((int) class385.y + (class521_sub1.method12995(-700409118) >> 1)), (float) (int) class385.z, ((SceneObjectManager) this).aFloatArray2639);
		((Class521_Sub1) class521_sub1).anInt7969 = (int) ((SceneObjectManager) this).aFloatArray2639[2] * -721433345;
	}

	public SceneObjectNode method3404(int i, int i_123_, int i_124_, int i_125_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_123_][i_124_];
		if (class293 == null)
			return null;
		method3408(class293.aClass521_Sub1_Sub3_3499, 2096802032);
		if (null != class293.aClass521_Sub1_Sub3_3499) {
			SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
			class293.aClass521_Sub1_Sub3_3499 = null;
			return class521_sub1_sub3;
		}
		return null;
	}

	public Class521_Sub1_Sub2 method3405(int i, int i_126_, int i_127_, int i_128_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_126_][i_127_];
		if (null == class293)
			return null;
		Class521_Sub1_Sub2 class521_sub1_sub2 = ((Class293) class293).aClass521_Sub1_Sub2_3506;
		((Class293) class293).aClass521_Sub1_Sub2_3506 = null;
		method3408(class521_sub1_sub2, 1563744432);
		return class521_sub1_sub2;
	}

	public void method3406(int i, Class390 class390) {
		aClass390Array2591[i] = class390;
	}

	void method3407(Class521_Sub1_Sub1 class521_sub1_sub1, boolean bool, int i) {
		for (int i_129_ = class521_sub1_sub1.aShort9458; i_129_ <= class521_sub1_sub1.localX; i_129_++) {
			for (int i_130_ = class521_sub1_sub1.aShort9456; i_130_ <= class521_sub1_sub1.localY; i_130_++) {
				Class293 class293 = (aClass293ArrayArrayArray2604[class521_sub1_sub1.plane][i_129_][i_130_]);
				if (null != class293) {
					Class208 class208 = class293.aClass208_3504;
					Class208 class208_131_ = null;
					for (/**/; null != class208; class208 = class208.aClass208_2660) {
						if (class208.aClass521_Sub1_Sub1_2659 == class521_sub1_sub1) {
							if (null != class208_131_)
								class208_131_.aClass208_2660 = class208.aClass208_2660;
							else
								class293.aClass208_3504 = class208.aClass208_2660;
							class208.method3560(508246192);
							break;
						}
						class208_131_ = class208;
					}
				}
			}
		}
		if (!bool)
			method3408(class521_sub1_sub1, 1970492302);
	}

	void method3408(Class521_Sub1 class521_sub1, int i) {
		if (class521_sub1 != null) {
			class521_sub1.method11176();
			for (int i_132_ = 0; i_132_ < 2; i_132_++) {
				Class521_Sub1 class521_sub1_133_ = null;
				for (Class521_Sub1 class521_sub1_134_ = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_132_]; class521_sub1_134_ != null; class521_sub1_134_ = (((Class521_Sub1) class521_sub1_134_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_134_) {
						if (class521_sub1_133_ != null)
							((Class521_Sub1) class521_sub1_133_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_134_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2605[i_132_] = (((Class521_Sub1) class521_sub1_134_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_133_ = class521_sub1_134_;
				}
				class521_sub1_133_ = null;
				for (Class521_Sub1 class521_sub1_135_ = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_132_]; null != class521_sub1_135_; class521_sub1_135_ = (((Class521_Sub1) class521_sub1_135_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_135_) {
						if (null != class521_sub1_133_)
							((Class521_Sub1) class521_sub1_133_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_135_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2633[i_132_] = (((Class521_Sub1) class521_sub1_135_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_133_ = class521_sub1_135_;
				}
				class521_sub1_133_ = null;
				for (Class521_Sub1 class521_sub1_136_ = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_132_]; null != class521_sub1_136_; class521_sub1_136_ = (((Class521_Sub1) class521_sub1_136_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_136_) {
						if (null != class521_sub1_133_)
							((Class521_Sub1) class521_sub1_133_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_136_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2649[i_132_] = (((Class521_Sub1) class521_sub1_136_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_133_ = class521_sub1_136_;
				}
			}
		}
	}

	public void method3409(int i, int i_137_) {
		Class293 class293 = aClass293ArrayArrayArray2604[0][i][i_137_];
		for (int i_138_ = 0; i_138_ < 3; i_138_++) {
			Class293 class293_139_ = (aClass293ArrayArrayArray2604[i_138_][i][i_137_] = aClass293ArrayArrayArray2604[1 + i_138_][i][i_137_]);
			if (class293_139_ != null) {
				for (Class208 class208 = class293_139_.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
					Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
					if (class521_sub1_sub1.aShort9458 == i && class521_sub1_sub1.aShort9456 == i_137_)
						class521_sub1_sub1.plane--;
				}
				if (null != class293_139_.aClass521_Sub1_Sub3_3499)
					class293_139_.aClass521_Sub1_Sub3_3499.plane--;
				if (null != class293_139_.aClass521_Sub1_Sub5_3505)
					class293_139_.aClass521_Sub1_Sub5_3505.plane--;
				if (null != class293_139_.aClass521_Sub1_Sub5_3502)
					class293_139_.aClass521_Sub1_Sub5_3502.plane--;
				if (class293_139_.aClass521_Sub1_Sub4_3503 != null)
					class293_139_.aClass521_Sub1_Sub4_3503.plane--;
				if (null != class293_139_.aClass521_Sub1_Sub4_3500)
					class293_139_.aClass521_Sub1_Sub4_3500.plane--;
			}
		}
		if (null == aClass293ArrayArrayArray2604[0][i][i_137_]) {
			aClass293ArrayArrayArray2604[0][i][i_137_] = new Class293(0);
			aClass293ArrayArrayArray2604[0][i][i_137_].aByte3507 = (byte) 1;
		}
		aClass293ArrayArrayArray2604[0][i][i_137_].aClass293_3509 = class293;
		aClass293ArrayArrayArray2604[3][i][i_137_] = null;
	}

	public Class521_Sub1_Sub5 getWall2(int i, int i_140_, int i_141_, int i_142_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_140_][i_141_];
		if (null == class293)
			return null;
		return class293.aClass521_Sub1_Sub5_3502;
	}

	void method3411(Class521_Sub1 class521_sub1, int i, int i_143_, int i_144_) {
		if (i_143_ < -1912960305 * anInt2617) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_143_ + 1][i_144_];
			if (class293 != null && null != class293.aClass521_Sub1_Sub3_3499 && class293.aClass521_Sub1_Sub3_3499.method12985(-985610915))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, 0, true, -2069932795);
		}
		if (i_144_ < anInt2617 * -1912960305) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_143_][1 + i_144_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1385279027))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, 0, 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -1728349361);
		}
		if (i_143_ < -1912960305 * anInt2617 && i_144_ < -18177099 * anInt2603) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_143_][1 + i_144_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1805732429))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -1982850059);
		}
		if (i_143_ < -1912960305 * anInt2617 && i_144_ > 0) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_143_][i_144_ - 1];
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1999961181))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (((SceneObjectManager) this).anInt2593 * 1885735347), 0, -(((SceneObjectManager) this).anInt2593 * 1885735347), true, -1758411074);
		}
	}

	public int method3412(int i, int i_145_) {
		return (null != ((SceneObjectManager) this).aByteArrayArray2620 ? ((SceneObjectManager) this).aByteArrayArray2620[i][i_145_] & 0xff : 0);
	}

	public Class521_Sub1_Sub1 getInteractableObject(int i, int i_146_, int i_147_, Interface25 interface25, int i_148_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_146_][i_147_];
		if (class293 == null)
			return null;
		for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
			if ((null == interface25 || interface25.method183(class521_sub1_sub1, 1956908464)) && i_146_ == class521_sub1_sub1.aShort9458 && i_147_ == class521_sub1_sub1.aShort9456)
				return class521_sub1_sub1;
		}
		return null;
	}

	public void method3414() {
		for (int i = 0; i < anInt2601 * -1485737447; i++) {
			for (int i_149_ = 0; i_149_ < -1912960305 * anInt2617; i_149_++) {
				for (int i_150_ = 0; i_150_ < -18177099 * anInt2603; i_150_++) {
					Class293 class293 = aClass293ArrayArrayArray2604[i][i_149_][i_150_];
					if (class293 != null) {
						Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
						Class521_Sub1_Sub5 class521_sub1_sub5_151_ = class293.aClass521_Sub1_Sub5_3502;
						if (class521_sub1_sub5 != null && class521_sub1_sub5.method12985(-810493079)) {
							method3452(class521_sub1_sub5, i, i_149_, i_150_, 1, 1);
							if (class521_sub1_sub5_151_ != null && class521_sub1_sub5_151_.method12985(-1634316233)) {
								method3452(class521_sub1_sub5_151_, i, i_149_, i_150_, 1, 1);
								class521_sub1_sub5_151_.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, 0, 0, 0, false, -1754874448);
								class521_sub1_sub5_151_.method12984(1443746520);
							}
							class521_sub1_sub5.method12984(322429259);
						}
						for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-1113236390)) {
								method3452(class521_sub1_sub1, i, i_149_, i_150_, 1 + (class521_sub1_sub1.localX - (class521_sub1_sub1.aShort9458)), (class521_sub1_sub1.localY - class521_sub1_sub1.aShort9456 + 1));
								class521_sub1_sub1.method12984(-680352242);
							}
						}
						SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
						if (null != class521_sub1_sub3 && class521_sub1_sub3.method12985(-1402022893)) {
							method3417(class521_sub1_sub3, i, i_149_, i_150_, 1147445654);
							class521_sub1_sub3.method12984(-423188382);
						}
					}
				}
			}
		}
	}

	public SceneObjectNode getGroundDecoration(int plane, int x, int y, int i_154_) {
		Class293 class293 = aClass293ArrayArrayArray2604[plane][x][y];
		if (null == class293 || class293.aClass521_Sub1_Sub3_3499 == null)
			return null;
		return class293.aClass521_Sub1_Sub3_3499;
	}

	public int method3416(int i, int i_155_) {
		return (null != ((SceneObjectManager) this).anIntArrayArray2606 ? ((SceneObjectManager) this).anIntArrayArray2606[i][i_155_] & 0xffffff : 0);
	}

	void method3417(Class521_Sub1 class521_sub1, int i, int i_156_, int i_157_, int i_158_) {
		if (i_156_ < -1912960305 * anInt2617) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_156_ + 1][i_157_];
			if (class293 != null && null != class293.aClass521_Sub1_Sub3_3499 && class293.aClass521_Sub1_Sub3_3499.method12985(-1157326636))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, 0, true, -2061518556);
		}
		if (i_157_ < anInt2617 * -1912960305) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_156_][1 + i_157_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1529728389))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, 0, 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -1951339273);
		}
		if (i_156_ < -1912960305 * anInt2617 && i_157_ < -18177099 * anInt2603) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_156_][1 + i_157_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1925311637))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -1913658819);
		}
		if (i_156_ < -1912960305 * anInt2617 && i_157_ > 0) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_156_][i_157_ - 1];
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-883899381))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (((SceneObjectManager) this).anInt2593 * 1885735347), 0, -(((SceneObjectManager) this).anInt2593 * 1885735347), true, -1779065543);
		}
	}

	public void method3418(int i, int i_159_, int i_160_, SceneObjectNode class521_sub1_sub3) {
		Class293 class293 = method3459(i, i_159_, i_160_, 1740144813);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub3_3499 = class521_sub1_sub3;
			int i_161_ = aClass390Array2591 == aClass390Array2614 ? 1 : 0;
			if (class521_sub1_sub3.method12986(-132760109)) {
				if (class521_sub1_sub3.method12987(297507035)) {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_161_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_161_] = class521_sub1_sub3;
				} else {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_161_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_161_] = class521_sub1_sub3;
				}
			} else {
				((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_161_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_161_] = class521_sub1_sub3;
			}
		}
	}

	public Class208 method3419(int i, int i_162_, int i_163_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_162_][i_163_];
		if (class293 == null)
			return null;
		return class293.aClass208_3504;
	}

	public Class521_Sub1_Sub4 method3420(int i, int i_164_, int i_165_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_164_][i_165_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub4_3503, 802375709);
			if (class293.aClass521_Sub1_Sub4_3503 != null) {
				Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3503;
				class293.aClass521_Sub1_Sub4_3503 = null;
				return class521_sub1_sub4;
			}
		}
		return null;
	}

	void method3421(Class521_Sub1 class521_sub1, byte i) {
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		((SceneObjectManager) this).aClass505_2596.method8479((float) (int) class385.x, (float) ((int) class385.y + (class521_sub1.method12995(-353593796) >> 1)), (float) (int) class385.z, ((SceneObjectManager) this).aFloatArray2639);
		((Class521_Sub1) class521_sub1).anInt7969 = (int) ((SceneObjectManager) this).aFloatArray2639[2] * -721433345;
	}

	public Class521_Sub1_Sub5 method3422(int i, int i_166_, int i_167_, short i_168_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_166_][i_167_];
		if (class293 != null) {
			method3408(class293.aClass521_Sub1_Sub5_3505, 1587735516);
			if (class293.aClass521_Sub1_Sub5_3505 != null) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
				class293.aClass521_Sub1_Sub5_3505 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public Class521_Sub1_Sub5 method3423(int i, int i_169_, int i_170_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_169_][i_170_];
		if (class293 != null) {
			method3408(class293.aClass521_Sub1_Sub5_3505, 1627444468);
			if (class293.aClass521_Sub1_Sub5_3505 != null) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
				class293.aClass521_Sub1_Sub5_3505 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	boolean method3424(Class521_Sub1 class521_sub1, boolean bool, byte[][][] is, int i, byte i_171_) {
		if (!((SceneObjectManager) this).aBool2599)
			return false;
		if (class521_sub1 instanceof Class521_Sub1_Sub1) {
			int i_172_ = ((Class521_Sub1_Sub1) class521_sub1).localX;
			int i_173_ = ((Class521_Sub1_Sub1) class521_sub1).localY;
			int i_174_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9458;
			int i_175_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9456;
			for (int i_176_ = i_174_; i_176_ <= i_172_; i_176_++) {
				for (int i_177_ = i_175_; i_177_ <= i_173_; i_177_++) {
					if (class521_sub1.aByte7968 < -1485737447 * anInt2601 && i_176_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_176_ < ((SceneObjectManager) this).anInt2638 * 170184033 && i_177_ >= ((SceneObjectManager) this).anInt2621 * -1955723827 && i_177_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
						if ((null != is && class521_sub1.plane >= i && i_171_ == (is[class521_sub1.plane][i_176_][i_177_])) || !class521_sub1.method13029((byte) 1) || class521_sub1.method13037((((SceneObjectManager) this).aClass505_2596), 1922998214)) {
							if (!bool && i_176_ >= -527863643 * (((SceneObjectManager) this).anInt2628) - 16 && i_176_ <= 16 + -527863643 * ((SceneObjectManager) this).anInt2628 && i_177_ >= 1580412859 * (((SceneObjectManager) this).anInt2629) - 16 && i_177_ <= 16 + (((SceneObjectManager) this).anInt2629 * 1580412859))
								class521_sub1.method12991((((SceneObjectManager) this).aClass505_2596), -1308770774);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		int i_178_ = (int) class385.x >> -1928575293 * anInt2592;
		int i_179_ = (int) class385.z >> -1928575293 * anInt2592;
		if (class521_sub1.aByte7968 < anInt2601 * -1485737447 && i_178_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_178_ < 170184033 * ((SceneObjectManager) this).anInt2638 && i_179_ >= -1955723827 * ((SceneObjectManager) this).anInt2621 && i_179_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
			if ((null != is && class521_sub1.plane >= i && is[class521_sub1.plane][i_178_][i_179_] == i_171_) || !class521_sub1.method13029((byte) -39) || class521_sub1.method13037(((SceneObjectManager) this).aClass505_2596, -53758878)) {
				if (!bool && i_178_ >= -527863643 * ((SceneObjectManager) this).anInt2628 - 16 && i_178_ <= -527863643 * ((SceneObjectManager) this).anInt2628 + 16 && i_179_ >= ((SceneObjectManager) this).anInt2629 * 1580412859 - 16 && i_179_ <= 16 + ((SceneObjectManager) this).anInt2629 * 1580412859)
					class521_sub1.method12991(((SceneObjectManager) this).aClass505_2596, -1131763435);
				return true;
			}
			return false;
		}
		return true;
	}

	boolean method3425(Class521_Sub1 class521_sub1, boolean bool, byte[][][] is, int i, byte i_180_) {
		if (!((SceneObjectManager) this).aBool2599)
			return false;
		if (class521_sub1 instanceof Class521_Sub1_Sub1) {
			int i_181_ = ((Class521_Sub1_Sub1) class521_sub1).localX;
			int i_182_ = ((Class521_Sub1_Sub1) class521_sub1).localY;
			int i_183_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9458;
			int i_184_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9456;
			for (int i_185_ = i_183_; i_185_ <= i_181_; i_185_++) {
				for (int i_186_ = i_184_; i_186_ <= i_182_; i_186_++) {
					if (class521_sub1.aByte7968 < -1485737447 * anInt2601 && i_185_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_185_ < ((SceneObjectManager) this).anInt2638 * 170184033 && i_186_ >= ((SceneObjectManager) this).anInt2621 * -1955723827 && i_186_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
						if ((null != is && class521_sub1.plane >= i && i_180_ == (is[class521_sub1.plane][i_185_][i_186_])) || !class521_sub1.method13029((byte) -82) || class521_sub1.method13037((((SceneObjectManager) this).aClass505_2596), 1868678759)) {
							if (!bool && i_185_ >= -527863643 * (((SceneObjectManager) this).anInt2628) - 16 && i_185_ <= 16 + -527863643 * ((SceneObjectManager) this).anInt2628 && i_186_ >= 1580412859 * (((SceneObjectManager) this).anInt2629) - 16 && i_186_ <= 16 + (((SceneObjectManager) this).anInt2629 * 1580412859))
								class521_sub1.method12991((((SceneObjectManager) this).aClass505_2596), -978759949);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		int i_187_ = (int) class385.x >> -1928575293 * anInt2592;
		int i_188_ = (int) class385.z >> -1928575293 * anInt2592;
		if (class521_sub1.aByte7968 < anInt2601 * -1485737447 && i_187_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_187_ < 170184033 * ((SceneObjectManager) this).anInt2638 && i_188_ >= -1955723827 * ((SceneObjectManager) this).anInt2621 && i_188_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
			if ((null != is && class521_sub1.plane >= i && is[class521_sub1.plane][i_187_][i_188_] == i_180_) || !class521_sub1.method13029((byte) -71) || class521_sub1.method13037(((SceneObjectManager) this).aClass505_2596, -843272103)) {
				if (!bool && i_187_ >= -527863643 * ((SceneObjectManager) this).anInt2628 - 16 && i_187_ <= -527863643 * ((SceneObjectManager) this).anInt2628 + 16 && i_188_ >= ((SceneObjectManager) this).anInt2629 * 1580412859 - 16 && i_188_ <= 16 + ((SceneObjectManager) this).anInt2629 * 1580412859)
					class521_sub1.method12991(((SceneObjectManager) this).aClass505_2596, -835940518);
				return true;
			}
			return false;
		}
		return true;
	}

	public boolean method3426(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_189_, int i_190_, boolean[] bools, byte i_191_) {
		boolean bool = false;
		if (aClass390Array2591 != aClass390Array2614) {
			int i_192_ = aClass390Array2607[i].method6709(i_189_, i_190_, 1177871260);
			int i_193_ = 0;
			for (/**/; i_193_ <= i; i_193_++) {
				Class390 class390 = aClass390Array2607[i_193_];
				if (class390 != null) {
					int i_194_ = i_192_ - class390.method6709(i_189_, i_190_, 1885983541);
					if (bools != null) {
						bools[i_193_] = class390.method6712(class282_sub50_sub17, i_189_, i_194_, i_190_, 0, false);
						if (!bools[i_193_])
							continue;
					}
					class390.UA(class282_sub50_sub17, i_189_, i_194_, i_190_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public void method3427(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_195_, int i_196_, boolean[] bools, byte i_197_) {
		if (aClass390Array2614 != aClass390Array2591) {
			int i_198_ = aClass390Array2607[i].method6709(i_195_, i_196_, 2131709892);
			for (int i_199_ = 0; i_199_ <= i; i_199_++) {
				if (null == bools || bools[i_199_]) {
					Class390 class390 = aClass390Array2607[i_199_];
					if (null != class390)
						class390.NA(class282_sub50_sub17, i_195_, i_198_ - class390.method6709(i_195_, i_196_, 159261886), i_196_, 0, false);
				}
			}
		}
	}

	public void method3428(int i) {
		for (int i_200_ = 0; i_200_ < -1912960305 * anInt2617; i_200_++) {
			for (int i_201_ = 0; i_201_ < anInt2603 * -18177099; i_201_++) {
				if (null == aClass293ArrayArrayArray2604[0][i_200_][i_201_])
					aClass293ArrayArrayArray2604[0][i_200_][i_201_] = new Class293(0);
			}
		}
	}

	public void method3429(int i) {
		method3486(1, anInt2601 * -1485737447, 1563160205);
	}

	public void method3430(Class287 class287, byte i) {
		if (-1136166139 * ((SceneObjectManager) this).anInt2615 < 65361) {
			Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
			((SceneObjectManager) this).aClass287Array2646[-1136166139 * ((SceneObjectManager) this).anInt2615] = class287;
			((SceneObjectManager) this).aBoolArray2647[(-1136166139 * ((SceneObjectManager) this).anInt2615)] = false;
			((SceneObjectManager) this).anInt2615 += -1292690995;
			int i_202_ = class287.anInt3419 * -2046020753;
			if (((Class287) class287).aBool3427)
				i_202_ = 0;
			int i_203_ = -2046020753 * class287.anInt3419;
			if (((Class287) class287).aBool3426)
				i_203_ = anInt2601 * -1485737447 - 1;
			for (int i_204_ = i_202_; i_204_ <= i_203_; i_204_++) {
				int i_205_ = 0;
				int i_206_ = ((class282_sub24.method12394(997046092) - class282_sub24.method12370(-789603523) + ((SceneObjectManager) this).anInt2594 * -1428980483) >> -1928575293 * anInt2592);
				if (i_206_ < 0) {
					i_205_ -= i_206_;
					i_206_ = 0;
				}
				int i_207_ = ((class282_sub24.method12394(1086113153) + class282_sub24.method12370(-789603523) - ((SceneObjectManager) this).anInt2594 * -1428980483) >> anInt2592 * -1928575293);
				if (i_207_ >= -18177099 * anInt2603)
					i_207_ = anInt2603 * -18177099 - 1;
				for (int i_208_ = i_206_; i_208_ <= i_207_; i_208_++) {
					int i_209_ = ((Class287) class287).aShortArray3429[i_205_++];
					int i_210_ = ((class282_sub24.method12368((byte) 47) - class282_sub24.method12370(-789603523) + ((SceneObjectManager) this).anInt2594 * -1428980483) >> anInt2592 * -1928575293) + (i_209_ >>> 8);
					int i_211_ = (i_209_ & 0xff) + i_210_ - 1;
					if (i_210_ < 0)
						i_210_ = 0;
					if (i_211_ >= -1912960305 * anInt2617)
						i_211_ = anInt2617 * -1912960305 - 1;
					for (int i_212_ = i_210_; i_212_ <= i_211_; i_212_++) {
						long l = (((SceneObjectManager) this).aLongArrayArrayArray2645[i_204_][i_212_][i_208_]);
						if ((l & 0xffffL) == 0L)
							((SceneObjectManager) this).aLongArrayArrayArray2645[i_204_][i_212_][i_208_] = l | (long) (-1136166139 * ((SceneObjectManager) this).anInt2615);
						else if (0L == (l & 0xffff0000L))
							((SceneObjectManager) this).aLongArrayArrayArray2645[i_204_][i_212_][i_208_] = l | (long) (((SceneObjectManager) this).anInt2615 * -1136166139) << 16;
						else if ((l & 0xffff00000000L) == 0L)
							((SceneObjectManager) this).aLongArrayArrayArray2645[i_204_][i_212_][i_208_] = l | ((long) (-1136166139 * ((SceneObjectManager) this).anInt2615) << 32);
						else if (0L == (l & ~0xffffffffffffL))
							((SceneObjectManager) this).aLongArrayArrayArray2645[i_204_][i_212_][i_208_] = l | ((long) (-1136166139 * ((SceneObjectManager) this).anInt2615) << 48);
					}
				}
			}
		}
	}

	public void method3431(int i) {
		for (int i_213_ = 0; i_213_ < ((SceneObjectManager) this).anInt2615 * -1136166139; i_213_++) {
			if (!((SceneObjectManager) this).aBoolArray2647[i_213_]) {
				Class287 class287 = ((SceneObjectManager) this).aClass287Array2646[i_213_];
				Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
				int i_214_ = -2046020753 * class287.anInt3419;
				int i_215_ = (class282_sub24.method12370(-789603523) - ((SceneObjectManager) this).anInt2594 * -1428980483);
				int i_216_ = (2 * i_215_ >> -1928575293 * anInt2592) + 1;
				int i_217_ = 0;
				int[] is = new int[i_216_ * i_216_];
				int i_218_ = (class282_sub24.method12368((byte) 18) - i_215_ >> -1928575293 * anInt2592);
				int i_219_ = (class282_sub24.method12394(1388951862) - i_215_ >> anInt2592 * -1928575293);
				int i_220_ = (class282_sub24.method12394(1380469261) + i_215_ >> -1928575293 * anInt2592);
				if (i_219_ < 0) {
					i_217_ -= i_219_;
					i_219_ = 0;
				}
				if (i_220_ >= anInt2603 * -18177099)
					i_220_ = -18177099 * anInt2603 - 1;
				for (int i_221_ = i_219_; i_221_ <= i_220_; i_221_++) {
					int i_222_ = ((Class287) class287).aShortArray3429[i_217_];
					int i_223_ = i_222_ >>> 8;
					int i_224_ = i_217_ * i_216_ + i_223_;
					int i_225_ = i_218_ + (i_222_ >>> 8);
					int i_226_ = (i_222_ & 0xff) + i_225_ - 1;
					if (i_225_ < 0) {
						i_224_ -= i_225_;
						i_225_ = 0;
					}
					if (i_226_ >= anInt2617 * -1912960305)
						i_226_ = anInt2617 * -1912960305 - 1;
					for (int i_227_ = i_225_; i_227_ <= i_226_; i_227_++) {
						int i_228_ = 1;
						Class521_Sub1_Sub1 class521_sub1_sub1 = getInteractableObject(i_214_, i_227_, i_221_, null, -233664382);
						if (null != class521_sub1_sub1 && (((Class521_Sub1_Sub1) class521_sub1_sub1).aByte9454) != 0) {
							if (1 == (((Class521_Sub1_Sub1) class521_sub1_sub1).aByte9454)) {
								boolean bool = i_227_ - 1 >= i_225_;
								boolean bool_229_ = i_227_ + 1 <= i_226_;
								if (!bool && 1 + i_221_ <= i_220_) {
									int i_230_ = (((Class287) class287).aShortArray3429[1 + i_217_]);
									int i_231_ = i_218_ + (i_230_ >>> 8);
									int i_232_ = (i_230_ & 0xff) + i_231_;
									bool = i_227_ > i_231_ && i_227_ < i_232_;
								}
								if (!bool_229_ && i_221_ - 1 >= i_219_) {
									int i_233_ = (((Class287) class287).aShortArray3429[i_217_ - 1]);
									int i_234_ = i_218_ + (i_233_ >>> 8);
									int i_235_ = i_234_ + (i_233_ & 0xff);
									bool_229_ = i_227_ > i_234_ && i_227_ < i_235_;
								}
								if (bool && !bool_229_)
									i_228_ = 4;
								else if (bool_229_ && !bool)
									i_228_ = 2;
							} else {
								boolean bool = i_227_ - 1 >= i_225_;
								boolean bool_236_ = 1 + i_227_ <= i_226_;
								if (!bool && i_221_ - 1 >= i_219_) {
									int i_237_ = (((Class287) class287).aShortArray3429[i_217_ - 1]);
									int i_238_ = (i_237_ >>> 8) + i_218_;
									int i_239_ = i_238_ + (i_237_ & 0xff);
									bool = i_227_ > i_238_ && i_227_ < i_239_;
								}
								if (!bool_236_ && 1 + i_221_ <= i_220_) {
									int i_240_ = (((Class287) class287).aShortArray3429[i_217_ + 1]);
									int i_241_ = (i_240_ >>> 8) + i_218_;
									int i_242_ = i_241_ + (i_240_ & 0xff);
									bool_236_ = i_227_ > i_241_ && i_227_ < i_242_;
								}
								if (bool && !bool_236_)
									i_228_ = 3;
								else if (bool_236_ && !bool)
									i_228_ = 5;
							}
						}
						is[i_224_++] = i_228_;
					}
					i_217_++;
				}
				((SceneObjectManager) this).aBoolArray2647[i_213_] = true;
				if (aBool2644)
					aClass390Array2591[i_214_].method6713(class282_sub24, is);
			}
		}
	}

	public int method3432(int i, int i_243_, byte i_244_) {
		return (((SceneObjectManager) this).aByteArrayArray2613 != null ? ((SceneObjectManager) this).aByteArrayArray2613[i][i_243_] & 0xff : 0);
	}

	public void method3433(int i) {
		/* empty */
	}

	public void method3434(FontRenderer class8) {
		/* empty */
	}

	public void method3435(FontRenderer class8) {
		/* empty */
	}

	public void method3436(FontRenderer class8) {
		/* empty */
	}

	public Class521_Sub1_Sub2 method3437(int i, int i_245_, int i_246_, short i_247_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_245_][i_246_];
		if (null == class293)
			return null;
		return ((Class293) class293).aClass521_Sub1_Sub2_3506;
	}

	public void method3438(boolean bool) {
		if (bool) {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2608;
			aClass390Array2591 = aClass390Array2614;
		} else {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2610;
			aClass390Array2591 = aClass390Array2607;
		}
		anInt2601 = aClass293ArrayArrayArray2604.length * 483772969;
	}

	public Class521_Sub1_Sub4 method3439(int i, int i_248_, int i_249_, int i_250_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_248_][i_249_];
		if (class293 != null) {
			method3408(class293.aClass521_Sub1_Sub4_3500, 1336618461);
			if (class293.aClass521_Sub1_Sub4_3500 != null) {
				Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3500;
				class293.aClass521_Sub1_Sub4_3500 = null;
				return class521_sub1_sub4;
			}
		}
		return null;
	}

	public void method3440(int i, int i_251_) {
		Class293 class293 = aClass293ArrayArrayArray2604[0][i][i_251_];
		for (int i_252_ = 0; i_252_ < 3; i_252_++) {
			Class293 class293_253_ = (aClass293ArrayArrayArray2604[i_252_][i][i_251_] = aClass293ArrayArrayArray2604[1 + i_252_][i][i_251_]);
			if (class293_253_ != null) {
				for (Class208 class208 = class293_253_.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
					Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
					if (class521_sub1_sub1.aShort9458 == i && class521_sub1_sub1.aShort9456 == i_251_)
						class521_sub1_sub1.plane--;
				}
				if (null != class293_253_.aClass521_Sub1_Sub3_3499)
					class293_253_.aClass521_Sub1_Sub3_3499.plane--;
				if (null != class293_253_.aClass521_Sub1_Sub5_3505)
					class293_253_.aClass521_Sub1_Sub5_3505.plane--;
				if (null != class293_253_.aClass521_Sub1_Sub5_3502)
					class293_253_.aClass521_Sub1_Sub5_3502.plane--;
				if (class293_253_.aClass521_Sub1_Sub4_3503 != null)
					class293_253_.aClass521_Sub1_Sub4_3503.plane--;
				if (null != class293_253_.aClass521_Sub1_Sub4_3500)
					class293_253_.aClass521_Sub1_Sub4_3500.plane--;
			}
		}
		if (null == aClass293ArrayArrayArray2604[0][i][i_251_]) {
			aClass293ArrayArrayArray2604[0][i][i_251_] = new Class293(0);
			aClass293ArrayArrayArray2604[0][i][i_251_].aByte3507 = (byte) 1;
		}
		aClass293ArrayArrayArray2604[0][i][i_251_].aClass293_3509 = class293;
		aClass293ArrayArrayArray2604[3][i][i_251_] = null;
	}

	void method3441(boolean bool, byte[][][] is, int i, byte i_254_, int i_255_) {
		int i_256_ = bool ? 1 : 0;
		((SceneObjectManager) this).anInt2623 = 0;
		((SceneObjectManager) this).anInt2624 = 0;
		((SceneObjectManager) this).anInt2609 += -162594145;
		if (0 == (i_255_ & 0x2)) {
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_256_]; null != class521_sub1; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) -60);
				if ((-1 != ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495) && !method3424(class521_sub1, bool, is, i, i_254_))
					((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = class521_sub1;
			}
		}
		if ((i_255_ & 0x1) == 0) {
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_256_]; null != class521_sub1; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) -30);
				if ((1272394495 * ((Class521_Sub1) class521_sub1).anInt7969 != -1) && !method3424(class521_sub1, bool, is, i, i_254_))
					((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = class521_sub1;
			}
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_256_]; class521_sub1 != null; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) 18);
				if ((((Class521_Sub1) class521_sub1).anInt7969 * 1272394495 != -1) && !method3424(class521_sub1, bool, is, i, i_254_)) {
					if (class521_sub1.method12987(1931050089))
						((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = class521_sub1;
					else
						((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = class521_sub1;
				}
			}
			if (!bool) {
				for (int i_257_ = 0; i_257_ < -1983534645 * ((SceneObjectManager) this).anInt2616; i_257_++) {
					method3421((((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_257_]), (byte) 8);
					if ((1272394495 * ((Class521_Sub1_Sub1) (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_257_])).anInt7969) != -1 && !method3424((((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_257_]), bool, is, i, i_254_)) {
						if (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_257_].method12987(1185762690))
							((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_257_]);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_257_]);
					}
				}
			}
		}
		if (-390666023 * ((SceneObjectManager) this).anInt2623 > 0) {
			method3466(((SceneObjectManager) this).aClass521_Sub1Array2626, 0, ((SceneObjectManager) this).anInt2623 * -390666023 - 1);
			for (int i_258_ = 0; i_258_ < ((SceneObjectManager) this).anInt2623 * -390666023; i_258_++)
				method3508(((SceneObjectManager) this).aClass521_Sub1Array2626[i_258_], ((SceneObjectManager) this).aClass282_Sub24Array2642);
		}
		if (((SceneObjectManager) this).aBool2598)
			((SceneObjectManager) this).aClass505_2596.method8547(0, null);
		if ((i_255_ & 0x2) == 0) {
			for (int i_259_ = 0; i_259_ < -1485737447 * anInt2601; i_259_++) {
				if (i_259_ >= i && is != null) {
					int i_260_ = ((SceneObjectManager) this).aBoolArrayArray2651.length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053) > -1912960305 * anInt2617)
						i_260_ -= (((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053 - anInt2617 * -1912960305);
					int i_261_ = ((SceneObjectManager) this).aBoolArrayArray2651[0].length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651[0].length + ((SceneObjectManager) this).anInt2621 * -1955723827) > -18177099 * anInt2603)
						i_261_ -= (((SceneObjectManager) this).anInt2621 * -1955723827 + (((SceneObjectManager) this).aBoolArrayArray2651[0]).length - anInt2603 * -18177099);
					boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2635;
					if (((SceneObjectManager) this).aBool2599) {
						for (int i_262_ = ((SceneObjectManager) this).anInt2602 * -1275764031; i_262_ < i_260_; i_262_++) {
							int i_263_ = (i_262_ + 260560053 * ((SceneObjectManager) this).anInt2637 - (-1275764031 * ((SceneObjectManager) this).anInt2602));
							for (int i_264_ = (-2139776287 * ((SceneObjectManager) this).anInt2636); i_264_ < i_261_; i_264_++) {
								bools[i_262_][i_264_] = false;
								if (((SceneObjectManager) this).aBoolArrayArray2651[i_262_][i_264_]) {
									int i_265_ = (i_264_ + (((SceneObjectManager) this).anInt2621 * -1955723827) - (-2139776287 * ((SceneObjectManager) this).anInt2636));
									for (int i_266_ = i_259_; i_266_ >= 0; i_266_--) {
										if ((null != (aClass293ArrayArrayArray2604[i_266_][i_263_][i_265_])) && (aClass293ArrayArrayArray2604[i_266_][i_263_][i_265_].aByte3507) == i_259_) {
											if ((i_266_ >= i && (is[i_266_][i_263_][i_265_] == i_254_)) || (aClass201_2600.method3271(i_259_, i_263_, i_265_)))
												bools[i_262_][i_264_] = false;
											else
												bools[i_262_][i_264_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass390Array2591[i_259_].method6717(((SceneObjectManager) this).anInt2628 * -527863643, 1580412859 * ((SceneObjectManager) this).anInt2629, 1459994833 * ((SceneObjectManager) this).anInt2652, ((SceneObjectManager) this).aBoolArrayArray2635, false, i_255_);
				} else {
					int i_267_ = ((SceneObjectManager) this).aBoolArrayArray2651.length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053) > anInt2617 * -1912960305)
						i_267_ -= (260560053 * ((SceneObjectManager) this).anInt2637 + ((SceneObjectManager) this).aBoolArrayArray2651.length - anInt2617 * -1912960305);
					int i_268_ = ((SceneObjectManager) this).aBoolArrayArray2651[0].length;
					if ((-1955723827 * ((SceneObjectManager) this).anInt2621 + ((SceneObjectManager) this).aBoolArrayArray2651[0].length) > anInt2603 * -18177099)
						i_268_ -= (((SceneObjectManager) this).anInt2621 * -1955723827 + (((SceneObjectManager) this).aBoolArrayArray2651[0]).length - anInt2603 * -18177099);
					boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2635;
					if (((SceneObjectManager) this).aBool2599) {
						for (int i_269_ = -1275764031 * ((SceneObjectManager) this).anInt2602; i_269_ < i_267_; i_269_++) {
							int i_270_ = (i_269_ + 260560053 * ((SceneObjectManager) this).anInt2637 - (-1275764031 * ((SceneObjectManager) this).anInt2602));
							for (int i_271_ = (((SceneObjectManager) this).anInt2636 * -2139776287); i_271_ < i_268_; i_271_++) {
								if ((((SceneObjectManager) this).aBoolArrayArray2651[i_269_][i_271_]) && !(aClass201_2600.method3271(i_259_, i_270_, (i_271_ + (-1955723827 * ((SceneObjectManager) this).anInt2621) - -2139776287 * (((SceneObjectManager) this).anInt2636)))))
									bools[i_269_][i_271_] = true;
								else
									bools[i_269_][i_271_] = false;
							}
						}
					}
					aClass390Array2591[i_259_].method6717(((SceneObjectManager) this).anInt2628 * -527863643, 1580412859 * ((SceneObjectManager) this).anInt2629, ((SceneObjectManager) this).anInt2652 * 1459994833, ((SceneObjectManager) this).aBoolArrayArray2635, true, i_255_);
				}
			}
		}
		if (227522527 * ((SceneObjectManager) this).anInt2624 > 0) {
			method3502(((SceneObjectManager) this).aClass521_Sub1Array2625, 0, 227522527 * ((SceneObjectManager) this).anInt2624 - 1);
			for (int i_272_ = 0; i_272_ < ((SceneObjectManager) this).anInt2624 * 227522527; i_272_++)
				method3508(((SceneObjectManager) this).aClass521_Sub1Array2625[i_272_], ((SceneObjectManager) this).aClass282_Sub24Array2642);
		}
	}

	void method3442(boolean bool, byte[][][] is, int i, byte i_273_, int i_274_) {
		int i_275_ = bool ? 1 : 0;
		((SceneObjectManager) this).anInt2623 = 0;
		((SceneObjectManager) this).anInt2624 = 0;
		((SceneObjectManager) this).anInt2609 += -162594145;
		if (0 == (i_274_ & 0x2)) {
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_275_]; null != class521_sub1; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) -71);
				if ((-1 != ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495) && !method3424(class521_sub1, bool, is, i, i_273_))
					((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = class521_sub1;
			}
		}
		if ((i_274_ & 0x1) == 0) {
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_275_]; null != class521_sub1; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) 50);
				if ((1272394495 * ((Class521_Sub1) class521_sub1).anInt7969 != -1) && !method3424(class521_sub1, bool, is, i, i_273_))
					((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = class521_sub1;
			}
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_275_]; class521_sub1 != null; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) -11);
				if ((((Class521_Sub1) class521_sub1).anInt7969 * 1272394495 != -1) && !method3424(class521_sub1, bool, is, i, i_273_)) {
					if (class521_sub1.method12987(1059891180))
						((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = class521_sub1;
					else
						((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = class521_sub1;
				}
			}
			if (!bool) {
				for (int i_276_ = 0; i_276_ < -1983534645 * ((SceneObjectManager) this).anInt2616; i_276_++) {
					method3421((((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_276_]), (byte) 21);
					if ((1272394495 * ((Class521_Sub1_Sub1) (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_276_])).anInt7969) != -1 && !method3424((((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_276_]), bool, is, i, i_273_)) {
						if (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_276_].method12987(1332006186))
							((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_276_]);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_276_]);
					}
				}
			}
		}
		if (-390666023 * ((SceneObjectManager) this).anInt2623 > 0) {
			method3466(((SceneObjectManager) this).aClass521_Sub1Array2626, 0, ((SceneObjectManager) this).anInt2623 * -390666023 - 1);
			for (int i_277_ = 0; i_277_ < ((SceneObjectManager) this).anInt2623 * -390666023; i_277_++)
				method3508(((SceneObjectManager) this).aClass521_Sub1Array2626[i_277_], ((SceneObjectManager) this).aClass282_Sub24Array2642);
		}
		if (((SceneObjectManager) this).aBool2598)
			((SceneObjectManager) this).aClass505_2596.method8547(0, null);
		if ((i_274_ & 0x2) == 0) {
			for (int i_278_ = 0; i_278_ < -1485737447 * anInt2601; i_278_++) {
				if (i_278_ >= i && is != null) {
					int i_279_ = ((SceneObjectManager) this).aBoolArrayArray2651.length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053) > -1912960305 * anInt2617)
						i_279_ -= (((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053 - anInt2617 * -1912960305);
					int i_280_ = ((SceneObjectManager) this).aBoolArrayArray2651[0].length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651[0].length + ((SceneObjectManager) this).anInt2621 * -1955723827) > -18177099 * anInt2603)
						i_280_ -= (((SceneObjectManager) this).anInt2621 * -1955723827 + (((SceneObjectManager) this).aBoolArrayArray2651[0]).length - anInt2603 * -18177099);
					boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2635;
					if (((SceneObjectManager) this).aBool2599) {
						for (int i_281_ = ((SceneObjectManager) this).anInt2602 * -1275764031; i_281_ < i_279_; i_281_++) {
							int i_282_ = (i_281_ + 260560053 * ((SceneObjectManager) this).anInt2637 - (-1275764031 * ((SceneObjectManager) this).anInt2602));
							for (int i_283_ = (-2139776287 * ((SceneObjectManager) this).anInt2636); i_283_ < i_280_; i_283_++) {
								bools[i_281_][i_283_] = false;
								if (((SceneObjectManager) this).aBoolArrayArray2651[i_281_][i_283_]) {
									int i_284_ = (i_283_ + (((SceneObjectManager) this).anInt2621 * -1955723827) - (-2139776287 * ((SceneObjectManager) this).anInt2636));
									for (int i_285_ = i_278_; i_285_ >= 0; i_285_--) {
										if ((null != (aClass293ArrayArrayArray2604[i_285_][i_282_][i_284_])) && (aClass293ArrayArrayArray2604[i_285_][i_282_][i_284_].aByte3507) == i_278_) {
											if ((i_285_ >= i && (is[i_285_][i_282_][i_284_] == i_273_)) || (aClass201_2600.method3271(i_278_, i_282_, i_284_)))
												bools[i_281_][i_283_] = false;
											else
												bools[i_281_][i_283_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass390Array2591[i_278_].method6717(((SceneObjectManager) this).anInt2628 * -527863643, 1580412859 * ((SceneObjectManager) this).anInt2629, 1459994833 * ((SceneObjectManager) this).anInt2652, ((SceneObjectManager) this).aBoolArrayArray2635, false, i_274_);
				} else {
					int i_286_ = ((SceneObjectManager) this).aBoolArrayArray2651.length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053) > anInt2617 * -1912960305)
						i_286_ -= (260560053 * ((SceneObjectManager) this).anInt2637 + ((SceneObjectManager) this).aBoolArrayArray2651.length - anInt2617 * -1912960305);
					int i_287_ = ((SceneObjectManager) this).aBoolArrayArray2651[0].length;
					if ((-1955723827 * ((SceneObjectManager) this).anInt2621 + ((SceneObjectManager) this).aBoolArrayArray2651[0].length) > anInt2603 * -18177099)
						i_287_ -= (((SceneObjectManager) this).anInt2621 * -1955723827 + (((SceneObjectManager) this).aBoolArrayArray2651[0]).length - anInt2603 * -18177099);
					boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2635;
					if (((SceneObjectManager) this).aBool2599) {
						for (int i_288_ = -1275764031 * ((SceneObjectManager) this).anInt2602; i_288_ < i_286_; i_288_++) {
							int i_289_ = (i_288_ + 260560053 * ((SceneObjectManager) this).anInt2637 - (-1275764031 * ((SceneObjectManager) this).anInt2602));
							for (int i_290_ = (((SceneObjectManager) this).anInt2636 * -2139776287); i_290_ < i_287_; i_290_++) {
								if ((((SceneObjectManager) this).aBoolArrayArray2651[i_288_][i_290_]) && !(aClass201_2600.method3271(i_278_, i_289_, (i_290_ + (-1955723827 * ((SceneObjectManager) this).anInt2621) - -2139776287 * (((SceneObjectManager) this).anInt2636)))))
									bools[i_288_][i_290_] = true;
								else
									bools[i_288_][i_290_] = false;
							}
						}
					}
					aClass390Array2591[i_278_].method6717(((SceneObjectManager) this).anInt2628 * -527863643, 1580412859 * ((SceneObjectManager) this).anInt2629, ((SceneObjectManager) this).anInt2652 * 1459994833, ((SceneObjectManager) this).aBoolArrayArray2635, true, i_274_);
				}
			}
		}
		if (227522527 * ((SceneObjectManager) this).anInt2624 > 0) {
			method3502(((SceneObjectManager) this).aClass521_Sub1Array2625, 0, 227522527 * ((SceneObjectManager) this).anInt2624 - 1);
			for (int i_291_ = 0; i_291_ < ((SceneObjectManager) this).anInt2624 * 227522527; i_291_++)
				method3508(((SceneObjectManager) this).aClass521_Sub1Array2625[i_291_], ((SceneObjectManager) this).aClass282_Sub24Array2642);
		}
	}

	Class293 method3443(int i, int i_292_, int i_293_) {
		if (aClass293ArrayArrayArray2604[i][i_292_][i_293_] == null) {
			boolean bool = (aClass293ArrayArrayArray2604[0][i_292_][i_293_] != null && (aClass293ArrayArrayArray2604[0][i_292_][i_293_].aClass293_3509) != null);
			if (bool && i >= -1485737447 * anInt2601 - 1)
				return null;
			method3384(i, i_292_, i_293_, (byte) 2);
		}
		return aClass293ArrayArrayArray2604[i][i_292_][i_293_];
	}

	public void method3444(int i, int i_294_, int i_295_) {
		boolean bool = (aClass293ArrayArrayArray2604[0][i_294_][i_295_] != null && null != (aClass293ArrayArrayArray2604[0][i_294_][i_295_].aClass293_3509));
		for (int i_296_ = i; i_296_ >= 0; i_296_--) {
			if (aClass293ArrayArrayArray2604[i_296_][i_294_][i_295_] == null) {
				Class293 class293 = (aClass293ArrayArrayArray2604[i_296_][i_294_][i_295_] = new Class293(i_296_));
				if (bool)
					class293.aByte3507++;
			}
		}
	}

	public void method3445(int i, Class390 class390) {
		aClass390Array2591[i] = class390;
	}

	public Class521_Sub1_Sub2 method3446(int i, int i_297_, int i_298_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_297_][i_298_];
		if (null == class293)
			return null;
		return ((Class293) class293).aClass521_Sub1_Sub2_3506;
	}

	public void method3447(int i, int i_299_, int i_300_, int i_301_, byte[][][] is, int[] is_302_, int[] is_303_, int[] is_304_, int[] is_305_, int[] is_306_, int i_307_, byte i_308_, int i_309_, int i_310_, boolean bool, boolean bool_311_, int i_312_, boolean bool_313_) {
		((Class201) aClass201_2600).aBool2542 = true;
		((SceneObjectManager) this).aBool2599 = bool_311_;
		((SceneObjectManager) this).anInt2628 = (i_299_ >> anInt2592 * -1928575293) * 453572397;
		((SceneObjectManager) this).anInt2629 = (i_301_ >> anInt2592 * -1928575293) * -1765393037;
		((SceneObjectManager) this).anInt2630 = i_299_ * -2116407601;
		((SceneObjectManager) this).anInt2650 = i_301_ * 1955010611;
		((SceneObjectManager) this).anInt2632 = i_300_ * 449309197;
		((SceneObjectManager) this).anInt2637 = (((SceneObjectManager) this).anInt2628 * -94301647 - ((SceneObjectManager) this).anInt2652 * -589362899);
		if (260560053 * ((SceneObjectManager) this).anInt2637 < 0) {
			((SceneObjectManager) this).anInt2602 = -(-869346571 * ((SceneObjectManager) this).anInt2637);
			((SceneObjectManager) this).anInt2637 = 0;
		} else
			((SceneObjectManager) this).anInt2602 = 0;
		((SceneObjectManager) this).anInt2621 = (-2134113369 * ((SceneObjectManager) this).anInt2629 - 1959093013 * ((SceneObjectManager) this).anInt2652);
		if (-1955723827 * ((SceneObjectManager) this).anInt2621 < 0) {
			((SceneObjectManager) this).anInt2636 = -(-823028627 * ((SceneObjectManager) this).anInt2621);
			((SceneObjectManager) this).anInt2621 = 0;
		} else
			((SceneObjectManager) this).anInt2636 = 0;
		((SceneObjectManager) this).anInt2638 = (-438519439 * ((SceneObjectManager) this).anInt2652 + 2114225605 * ((SceneObjectManager) this).anInt2628);
		if (170184033 * ((SceneObjectManager) this).anInt2638 > -1912960305 * anInt2617)
			((SceneObjectManager) this).anInt2638 = 438474287 * anInt2617;
		((SceneObjectManager) this).anInt2640 = (-1498695357 * ((SceneObjectManager) this).anInt2652 + ((SceneObjectManager) this).anInt2629 * -983308767);
		if (-887086501 * ((SceneObjectManager) this).anInt2640 > -18177099 * anInt2603)
			((SceneObjectManager) this).anInt2640 = anInt2603 * 1406340911;
		boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2651;
		boolean[][] bools_314_ = ((SceneObjectManager) this).aBoolArrayArray2635;
		if (((SceneObjectManager) this).aBool2599) {
			for (int i_315_ = 0; i_315_ < (((SceneObjectManager) this).anInt2652 * 1459994833 + ((SceneObjectManager) this).anInt2652 * 1459994833 + 2); i_315_++) {
				int i_316_ = 0;
				int i_317_ = 0;
				for (int i_318_ = 0; i_318_ < 2 + (((SceneObjectManager) this).anInt2652 * 1459994833 + ((SceneObjectManager) this).anInt2652 * 1459994833); i_318_++) {
					if (i_318_ > 1)
						((SceneObjectManager) this).anIntArray2641[i_318_ - 2] = i_316_;
					i_316_ = i_317_;
					int i_319_ = (-527863643 * ((SceneObjectManager) this).anInt2628 - 1459994833 * ((SceneObjectManager) this).anInt2652 + i_315_);
					int i_320_ = (i_318_ + (((SceneObjectManager) this).anInt2629 * 1580412859 - 1459994833 * ((SceneObjectManager) this).anInt2652));
					if (i_319_ >= 0 && i_320_ >= 0 && i_319_ < anInt2617 * -1912960305 && i_320_ < anInt2603 * -18177099) {
						int i_321_ = i_319_ << anInt2592 * -1928575293;
						int i_322_ = i_320_ << -1928575293 * anInt2592;
						int i_323_ = (aClass390Array2607[aClass390Array2607.length - 1].method6722(i_319_, i_320_, 65280) - (1000 << -1928575293 * anInt2592 - 7));
						int i_324_ = ((aClass390Array2614 != null ? (aClass390Array2614[0].method6722(i_319_, i_320_, 65280) + ((SceneObjectManager) this).anInt2593 * 1885735347) : (aClass390Array2607[0].method6722(i_319_, i_320_, 65280) + ((SceneObjectManager) this).anInt2593 * 1885735347)) + (1000 << -1928575293 * anInt2592 - 7));
						i_317_ = (((SceneObjectManager) this).aClass505_2596.method8437(i_321_, i_323_, i_322_, i_321_, i_324_, i_322_));
						((SceneObjectManager) this).aBoolArrayArray2635[i_315_][i_318_] = i_317_ == 0;
					} else {
						i_317_ = -1;
						((SceneObjectManager) this).aBoolArrayArray2635[i_315_][i_318_] = false;
					}
					if (i_315_ > 0 && i_318_ > 0) {
						int i_325_ = (((SceneObjectManager) this).anIntArray2641[i_318_ - 1] & ((SceneObjectManager) this).anIntArray2641[i_318_] & i_316_ & i_317_);
						((SceneObjectManager) this).aBoolArrayArray2651[i_315_ - 1][i_318_ - 1] = i_325_ == 0;
					}
				}
				((SceneObjectManager) this).anIntArray2641[(1459994833 * ((SceneObjectManager) this).anInt2652 + 1459994833 * ((SceneObjectManager) this).anInt2652)] = i_316_;
				((SceneObjectManager) this).anIntArray2641[1 + (((SceneObjectManager) this).anInt2652 * 1459994833 + 1459994833 * ((SceneObjectManager) this).anInt2652)] = i_317_;
			}
			if (!bool_313_)
				((Class201) aClass201_2600).aBool2542 = false;
			else {
				((Class201) aClass201_2600).anIntArray2569 = is_302_;
				((Class201) aClass201_2600).anIntArray2561 = is_303_;
				((Class201) aClass201_2600).anIntArray2562 = is_304_;
				((Class201) aClass201_2600).anIntArray2568 = is_305_;
				((Class201) aClass201_2600).anIntArray2560 = is_306_;
				aClass201_2600.method3265(((SceneObjectManager) this).aClass505_2596, i_307_);
			}
		} else {
			if (((SceneObjectManager) this).aBoolArrayArray2631 == null)
				((SceneObjectManager) this).aBoolArrayArray2631 = (new boolean[(1459994833 * ((SceneObjectManager) this).anInt2652 + ((SceneObjectManager) this).anInt2652 * 1459994833 + 2)][(((SceneObjectManager) this).anInt2652 * 1459994833 + ((SceneObjectManager) this).anInt2652 * 1459994833 + 2)]);
			for (int i_326_ = 0; i_326_ < ((SceneObjectManager) this).aBoolArrayArray2631.length; i_326_++) {
				for (int i_327_ = 0; i_327_ < ((SceneObjectManager) this).aBoolArrayArray2631[0].length; i_327_++)
					((SceneObjectManager) this).aBoolArrayArray2631[i_326_][i_327_] = true;
			}
			((SceneObjectManager) this).aBoolArrayArray2635 = ((SceneObjectManager) this).aBoolArrayArray2631;
			((SceneObjectManager) this).aBoolArrayArray2651 = ((SceneObjectManager) this).aBoolArrayArray2631;
			((SceneObjectManager) this).anInt2637 = 0;
			((SceneObjectManager) this).anInt2621 = 0;
			((SceneObjectManager) this).anInt2638 = anInt2617 * 438474287;
			((SceneObjectManager) this).anInt2640 = 1406340911 * anInt2603;
			((Class201) aClass201_2600).aBool2542 = false;
		}
		ChatLine.method1848(this, ((SceneObjectManager) this).aClass505_2596, 437446404);
		if (!((XLogin) aClass284_2648).aBool3386) {
			Iterator iterator = aClass284_2648.aList3388.iterator();
			while (iterator.hasNext()) {
				Class285 class285 = (Class285) iterator.next();
				iterator.remove();
				Class279.method4969(class285, 1362412061);
			}
		}
		if (((SceneObjectManager) this).aBool2598) {
			for (int i_328_ = 0; i_328_ < ((SceneObjectManager) this).anInt2615 * -1136166139; i_328_++)
				((SceneObjectManager) this).aClass287Array2646[i_328_].method5053(i, bool, -1826281531);
		}
		if (null != aClass293ArrayArrayArray2608) {
			method3380(true, -914334995);
			((SceneObjectManager) this).aClass505_2596.method8475(-1, new Class90(1583160, 40, 127, 63, 0, 0, 0));
			method3441(true, is, i_307_, i_308_, i_312_);
			((SceneObjectManager) this).aClass505_2596.O();
			method3380(false, -914334995);
		}
		method3441(false, is, i_307_, i_308_, i_312_);
		if (!((SceneObjectManager) this).aBool2599) {
			((SceneObjectManager) this).aBoolArrayArray2651 = bools;
			((SceneObjectManager) this).aBoolArrayArray2635 = bools_314_;
		}
	}

	public void method3448(boolean bool) {
		if (bool) {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2608;
			aClass390Array2591 = aClass390Array2614;
		} else {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2610;
			aClass390Array2591 = aClass390Array2607;
		}
		anInt2601 = aClass293ArrayArrayArray2604.length * 483772969;
	}

	public int method3449(int i, int i_329_) {
		return (null != ((SceneObjectManager) this).anIntArrayArray2606 ? ((SceneObjectManager) this).anIntArrayArray2606[i][i_329_] & 0xffffff : 0);
	}

	public Class521_Sub1_Sub2 method3450(int i, int i_330_, int i_331_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_330_][i_331_];
		if (null == class293)
			return null;
		Class521_Sub1_Sub2 class521_sub1_sub2 = ((Class293) class293).aClass521_Sub1_Sub2_3506;
		((Class293) class293).aClass521_Sub1_Sub2_3506 = null;
		method3408(class521_sub1_sub2, 639375447);
		return class521_sub1_sub2;
	}

	public int method3451(int i, int i_332_) {
		return (null != ((SceneObjectManager) this).anIntArrayArray2606 ? ((SceneObjectManager) this).anIntArrayArray2606[i][i_332_] & 0xffffff : 0);
	}

	void method3452(Class521_Sub1 class521_sub1, int i, int i_333_, int i_334_, int i_335_, int i_336_) {
		boolean bool = true;
		int i_337_ = i_333_;
		int i_338_ = i_333_ + i_335_;
		int i_339_ = i_334_ - 1;
		int i_340_ = i_336_ + i_334_;
		for (int i_341_ = i; i_341_ <= 1 + i; i_341_++) {
			if (-1485737447 * anInt2601 != i_341_) {
				for (int i_342_ = i_337_; i_342_ <= i_338_; i_342_++) {
					if (i_342_ >= 0 && i_342_ < -1912960305 * anInt2617) {
						for (int i_343_ = i_339_; i_343_ <= i_340_; i_343_++) {
							if (i_343_ >= 0 && i_343_ < anInt2603 * -18177099 && (!bool || i_342_ >= i_338_ || i_343_ >= i_340_ || i_343_ < i_334_ && i_342_ != i_333_)) {
								Class293 class293 = (aClass293ArrayArrayArray2604[i_341_][i_342_][i_343_]);
								if (class293 != null) {
									int i_344_ = (((aClass390Array2591[i_341_].method6722(i_342_, i_343_, 65280)) + (aClass390Array2591[i_341_].method6722(1 + i_342_, i_343_, 65280)) + (aClass390Array2591[i_341_].method6722(i_342_, 1 + i_343_, 65280)) + (aClass390Array2591[i_341_].method6722(1 + i_342_, 1 + i_343_, 65280))) / 4
											- ((aClass390Array2591[i].method6722(i_333_, i_334_, 65280)) + (aClass390Array2591[i].method6722(i_333_ + 1, i_334_, 65280)) + (aClass390Array2591[i].method6722(i_333_, i_334_ + 1, 65280)) + (aClass390Array2591[i].method6722(i_333_ + 1, i_334_ + 1, 65280))) / 4);
									Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
									Class521_Sub1_Sub5 class521_sub1_sub5_345_ = class293.aClass521_Sub1_Sub5_3502;
									if (null != class521_sub1_sub5 && class521_sub1_sub5.method12985(-2063907301))
										class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, ((((SceneObjectManager) this).anInt2594 * -1428980483 * (1 - i_335_)) + ((i_342_ - i_333_) * (1885735347 * (((SceneObjectManager) this).anInt2593)))), i_344_, (((1 - i_336_) * (-1428980483 * (((SceneObjectManager) this).anInt2594))) + ((i_343_ - i_334_) * (((SceneObjectManager) this).anInt2593 * 1885735347))), bool, -2001031070);
									if (null != class521_sub1_sub5_345_ && class521_sub1_sub5_345_.method12985(-1646817954))
										class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5_345_, (((i_342_ - i_333_) * (1885735347 * (((SceneObjectManager) this).anInt2593))) + (-1428980483 * ((SceneObjectManager) this).anInt2594 * (1 - i_335_))), i_344_, (((i_343_ - i_334_) * (1885735347 * (((SceneObjectManager) this).anInt2593))) + ((1 - i_336_) * (((SceneObjectManager) this).anInt2594 * -1428980483))), bool, -1714087738);
									for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
										Class521_Sub1_Sub1 class521_sub1_sub1 = (class208.aClass521_Sub1_Sub1_2659);
										if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-1911399746) && ((class521_sub1_sub1.aShort9458 == i_342_) || i_337_ == i_342_) && ((class521_sub1_sub1.aShort9456 == i_343_) || i_339_ == i_343_)) {
											int i_346_ = ((class521_sub1_sub1.localX) - (class521_sub1_sub1.aShort9458) + 1);
											int i_347_ = 1 + ((class521_sub1_sub1.localY) - (class521_sub1_sub1.aShort9456));
											class521_sub1.method13013((((SceneObjectManager) this).aClass505_2596), class521_sub1_sub1, ((1885735347 * (((SceneObjectManager) this).anInt2593) * ((class521_sub1_sub1.aShort9458) - i_333_)) + ((((SceneObjectManager) this).anInt2594) * -1428980483 * (i_346_ - i_335_))), i_344_, (((i_347_ - i_336_) * ((((SceneObjectManager) this).anInt2594) * -1428980483)) + (((class521_sub1_sub1.aShort9456) - i_334_) * ((((SceneObjectManager) this).anInt2593) * 1885735347))), bool, -1732186752);
										}
									}
								}
							}
						}
					}
				}
				i_337_--;
				bool = false;
			}
		}
	}

	void method3453(Class521_Sub1 class521_sub1) {
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		((SceneObjectManager) this).aClass505_2596.method8479((float) (int) class385.x, (float) ((int) class385.y + (class521_sub1.method12995(-2077915442) >> 1)), (float) (int) class385.z, ((SceneObjectManager) this).aFloatArray2639);
		((Class521_Sub1) class521_sub1).anInt7969 = (int) ((SceneObjectManager) this).aFloatArray2639[2] * -721433345;
	}

	public int method3454(int i, int i_348_) {
		return (((SceneObjectManager) this).aByteArrayArray2612 != null ? ((SceneObjectManager) this).aByteArrayArray2612[i][i_348_] & 0xff : 0);
	}

	public int method3455(int i, int i_349_) {
		return (((SceneObjectManager) this).aByteArrayArray2613 != null ? ((SceneObjectManager) this).aByteArrayArray2613[i][i_349_] & 0xff : 0);
	}

	public int method3456(int i, int i_350_) {
		return (((SceneObjectManager) this).aByteArrayArray2595 != null ? ((SceneObjectManager) this).aByteArrayArray2595[i][i_350_] & 0xff : 0);
	}

	public Class208 method3457(int i, int i_351_, int i_352_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_351_][i_352_];
		if (class293 == null)
			return null;
		return class293.aClass208_3504;
	}

	public void method3458(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_353_, int i_354_, boolean[] bools) {
		if (aClass390Array2614 != aClass390Array2591) {
			int i_355_ = aClass390Array2607[i].method6709(i_353_, i_354_, 449437129);
			for (int i_356_ = 0; i_356_ <= i; i_356_++) {
				if (null == bools || bools[i_356_]) {
					Class390 class390 = aClass390Array2607[i_356_];
					if (null != class390)
						class390.NA(class282_sub50_sub17, i_353_, i_355_ - class390.method6709(i_353_, i_354_, 36595061), i_354_, 0, false);
				}
			}
		}
	}

	Class293 method3459(int i, int i_357_, int i_358_, int i_359_) {
		if (aClass293ArrayArrayArray2604[i][i_357_][i_358_] == null) {
			boolean bool = (aClass293ArrayArrayArray2604[0][i_357_][i_358_] != null && (aClass293ArrayArrayArray2604[0][i_357_][i_358_].aClass293_3509) != null);
			if (bool && i >= -1485737447 * anInt2601 - 1)
				return null;
			method3384(i, i_357_, i_358_, (byte) -48);
		}
		return aClass293ArrayArrayArray2604[i][i_357_][i_358_];
	}

	public Class521_Sub1_Sub5 method3460(int i, int i_360_, int i_361_, byte i_362_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_360_][i_361_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub5_3502, 936233239);
			if (null != class293.aClass521_Sub1_Sub5_3502) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3502;
				class293.aClass521_Sub1_Sub5_3502 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public void method3461(int i, int i_363_, int i_364_, SceneObjectNode class521_sub1_sub3) {
		Class293 class293 = method3459(i, i_363_, i_364_, 1065789395);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub3_3499 = class521_sub1_sub3;
			int i_365_ = aClass390Array2591 == aClass390Array2614 ? 1 : 0;
			if (class521_sub1_sub3.method12986(-1673897900)) {
				if (class521_sub1_sub3.method12987(1125733672)) {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_365_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_365_] = class521_sub1_sub3;
				} else {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_365_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_365_] = class521_sub1_sub3;
				}
			} else {
				((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_365_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_365_] = class521_sub1_sub3;
			}
		}
	}

	public int method3462(int i, int i_366_) {
		return (((SceneObjectManager) this).aByteArrayArray2595 != null ? ((SceneObjectManager) this).aByteArrayArray2595[i][i_366_] & 0xff : 0);
	}

	public void method3463(int i, int i_367_, int i_368_, SceneObjectNode class521_sub1_sub3) {
		Class293 class293 = method3459(i, i_367_, i_368_, -709223847);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub3_3499 = class521_sub1_sub3;
			int i_369_ = aClass390Array2591 == aClass390Array2614 ? 1 : 0;
			if (class521_sub1_sub3.method12986(-1184376980)) {
				if (class521_sub1_sub3.method12987(-140492741)) {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_369_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_369_] = class521_sub1_sub3;
				} else {
					((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_369_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_369_] = class521_sub1_sub3;
				}
			} else {
				((SceneObjectNode) class521_sub1_sub3).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_369_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_369_] = class521_sub1_sub3;
			}
		}
	}

	public int method3464(int i, int i_370_, int i_371_) {
		return (((SceneObjectManager) this).aByteArrayArray2595 != null ? ((SceneObjectManager) this).aByteArrayArray2595[i][i_370_] & 0xff : 0);
	}

	public void method3465(int i, int i_372_, int i_373_, int i_374_, Class521_Sub1_Sub2 class521_sub1_sub2) {
		Class293 class293 = method3459(i, i_372_, i_373_, 1598284427);
		if (class293 != null) {
			class521_sub1_sub2.method11171(new Vector3((float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_372_ << anInt2592 * -1928575293)), (float) i_374_, (float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_373_ << anInt2592 * -1928575293))));
			((Class293) class293).aClass521_Sub1_Sub2_3506 = class521_sub1_sub2;
			int i_375_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub2.method12986(-1328423037)) {
				if (class521_sub1_sub2.method12987(192360478)) {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_375_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_375_] = class521_sub1_sub2;
				} else {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_375_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_375_] = class521_sub1_sub2;
				}
			} else {
				((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_375_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_375_] = class521_sub1_sub2;
			}
		}
	}

	void method3466(Class521_Sub1[] class521_sub1s, int i, int i_376_) {
		if (i < i_376_) {
			int i_377_ = (i_376_ + i) / 2;
			int i_378_ = i;
			Class521_Sub1 class521_sub1 = class521_sub1s[i_377_];
			class521_sub1s[i_377_] = class521_sub1s[i_376_];
			class521_sub1s[i_376_] = class521_sub1;
			int i_379_ = 1272394495 * ((Class521_Sub1) class521_sub1).anInt7969;
			for (int i_380_ = i; i_380_ < i_376_; i_380_++) {
				if ((((Class521_Sub1) class521_sub1s[i_380_]).anInt7969 * 1272394495) < i_379_ + (i_380_ & 0x1)) {
					Class521_Sub1 class521_sub1_381_ = class521_sub1s[i_380_];
					class521_sub1s[i_380_] = class521_sub1s[i_378_];
					class521_sub1s[i_378_++] = class521_sub1_381_;
				}
			}
			class521_sub1s[i_376_] = class521_sub1s[i_378_];
			class521_sub1s[i_378_] = class521_sub1;
			method3466(class521_sub1s, i, i_378_ - 1);
			method3466(class521_sub1s, 1 + i_378_, i_376_);
		}
	}

	public void method3467(int i, int i_382_, int i_383_, int i_384_, Class521_Sub1_Sub2 class521_sub1_sub2) {
		Class293 class293 = method3459(i, i_382_, i_383_, 1220729187);
		if (class293 != null) {
			class521_sub1_sub2.method11171(new Vector3((float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_382_ << anInt2592 * -1928575293)), (float) i_384_, (float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_383_ << anInt2592 * -1928575293))));
			((Class293) class293).aClass521_Sub1_Sub2_3506 = class521_sub1_sub2;
			int i_385_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub2.method12986(-1257836210)) {
				if (class521_sub1_sub2.method12987(-2053763362)) {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_385_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_385_] = class521_sub1_sub2;
				} else {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_385_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_385_] = class521_sub1_sub2;
				}
			} else {
				((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_385_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_385_] = class521_sub1_sub2;
			}
		}
	}

	public void method3468(int i, int i_386_, int i_387_, Class521_Sub1_Sub5 class521_sub1_sub5, Class521_Sub1_Sub5 class521_sub1_sub5_388_) {
		Class293 class293 = method3459(i, i_386_, i_387_, 694274033);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub5_3505 = class521_sub1_sub5;
			class293.aClass521_Sub1_Sub5_3502 = class521_sub1_sub5_388_;
			int i_389_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub5.method12986(-1511604811)) {
				if (class521_sub1_sub5.method12987(-981332563)) {
					((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_389_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_389_] = class521_sub1_sub5;
				} else {
					((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_389_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_389_] = class521_sub1_sub5;
				}
			} else {
				((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_389_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_389_] = class521_sub1_sub5;
			}
			if (null != class521_sub1_sub5_388_) {
				if (class521_sub1_sub5_388_.method12986(-160943714)) {
					if (class521_sub1_sub5_388_.method12987(493277376)) {
						((Class521_Sub1_Sub5) class521_sub1_sub5_388_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2633[i_389_]);
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_389_] = class521_sub1_sub5_388_;
					} else {
						((Class521_Sub1_Sub5) class521_sub1_sub5_388_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2605[i_389_]);
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_389_] = class521_sub1_sub5_388_;
					}
				} else {
					((Class521_Sub1_Sub5) class521_sub1_sub5_388_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_389_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_389_] = class521_sub1_sub5_388_;
				}
			}
		}
	}

	public void method3469(int i, int i_390_, int i_391_, Class521_Sub1_Sub5 class521_sub1_sub5, Class521_Sub1_Sub5 class521_sub1_sub5_392_) {
		Class293 class293 = method3459(i, i_390_, i_391_, 875990722);
		if (class293 != null) {
			class293.aClass521_Sub1_Sub5_3505 = class521_sub1_sub5;
			class293.aClass521_Sub1_Sub5_3502 = class521_sub1_sub5_392_;
			int i_393_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub5.method12986(-172724482)) {
				if (class521_sub1_sub5.method12987(1682522206)) {
					((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_393_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_393_] = class521_sub1_sub5;
				} else {
					((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_393_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_393_] = class521_sub1_sub5;
				}
			} else {
				((Class521_Sub1_Sub5) class521_sub1_sub5).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_393_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_393_] = class521_sub1_sub5;
			}
			if (null != class521_sub1_sub5_392_) {
				if (class521_sub1_sub5_392_.method12986(-1330860725)) {
					if (class521_sub1_sub5_392_.method12987(-729989421)) {
						((Class521_Sub1_Sub5) class521_sub1_sub5_392_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2633[i_393_]);
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_393_] = class521_sub1_sub5_392_;
					} else {
						((Class521_Sub1_Sub5) class521_sub1_sub5_392_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2605[i_393_]);
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_393_] = class521_sub1_sub5_392_;
					}
				} else {
					((Class521_Sub1_Sub5) class521_sub1_sub5_392_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_393_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_393_] = class521_sub1_sub5_392_;
				}
			}
		}
	}

	public void method3470(int i, int i_394_, int i_395_, Class521_Sub1_Sub4 class521_sub1_sub4, Class521_Sub1_Sub4 class521_sub1_sub4_396_) {
		Class293 class293 = method3459(i, i_394_, i_395_, -483538756);
		if (null != class293) {
			class293.aClass521_Sub1_Sub4_3503 = class521_sub1_sub4;
			class293.aClass521_Sub1_Sub4_3500 = class521_sub1_sub4_396_;
			int i_397_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub4.method12986(-168659728)) {
				if (class521_sub1_sub4.method12987(-1139450492)) {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_397_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_397_] = class521_sub1_sub4;
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_397_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_397_] = class521_sub1_sub4;
				}
			} else {
				((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_397_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_397_] = class521_sub1_sub4;
			}
			if (null != class521_sub1_sub4_396_) {
				if (class521_sub1_sub4_396_.method12986(-1692001456)) {
					if (class521_sub1_sub4_396_.method12987(548854399)) {
						((Class521_Sub1_Sub4) class521_sub1_sub4_396_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2633[i_397_]);
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_397_] = class521_sub1_sub4_396_;
					} else {
						((Class521_Sub1_Sub4) class521_sub1_sub4_396_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2605[i_397_]);
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_397_] = class521_sub1_sub4_396_;
					}
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4_396_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_397_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_397_] = class521_sub1_sub4_396_;
				}
			}
		}
	}

	public void method3471(int i, int i_398_, int i_399_, Class521_Sub1_Sub4 class521_sub1_sub4, Class521_Sub1_Sub4 class521_sub1_sub4_400_) {
		Class293 class293 = method3459(i, i_398_, i_399_, 466858635);
		if (null != class293) {
			class293.aClass521_Sub1_Sub4_3503 = class521_sub1_sub4;
			class293.aClass521_Sub1_Sub4_3500 = class521_sub1_sub4_400_;
			int i_401_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub4.method12986(-1593296975)) {
				if (class521_sub1_sub4.method12987(602178619)) {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_401_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_401_] = class521_sub1_sub4;
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_401_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_401_] = class521_sub1_sub4;
				}
			} else {
				((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_401_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_401_] = class521_sub1_sub4;
			}
			if (null != class521_sub1_sub4_400_) {
				if (class521_sub1_sub4_400_.method12986(-754760841)) {
					if (class521_sub1_sub4_400_.method12987(-1702139371)) {
						((Class521_Sub1_Sub4) class521_sub1_sub4_400_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2633[i_401_]);
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_401_] = class521_sub1_sub4_400_;
					} else {
						((Class521_Sub1_Sub4) class521_sub1_sub4_400_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2605[i_401_]);
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_401_] = class521_sub1_sub4_400_;
					}
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4_400_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_401_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_401_] = class521_sub1_sub4_400_;
				}
			}
		}
	}

	public void method3472(int i, int i_402_, int i_403_, Class521_Sub1_Sub4 class521_sub1_sub4, Class521_Sub1_Sub4 class521_sub1_sub4_404_) {
		Class293 class293 = method3459(i, i_402_, i_403_, 1528305606);
		if (null != class293) {
			class293.aClass521_Sub1_Sub4_3503 = class521_sub1_sub4;
			class293.aClass521_Sub1_Sub4_3500 = class521_sub1_sub4_404_;
			int i_405_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub4.method12986(-556169391)) {
				if (class521_sub1_sub4.method12987(-703844049)) {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_405_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_405_] = class521_sub1_sub4;
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_405_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_405_] = class521_sub1_sub4;
				}
			} else {
				((Class521_Sub1_Sub4) class521_sub1_sub4).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_405_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_405_] = class521_sub1_sub4;
			}
			if (null != class521_sub1_sub4_404_) {
				if (class521_sub1_sub4_404_.method12986(-2089571966)) {
					if (class521_sub1_sub4_404_.method12987(-1924153764)) {
						((Class521_Sub1_Sub4) class521_sub1_sub4_404_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2633[i_405_]);
						((SceneObjectManager) this).aClass521_Sub1Array2633[i_405_] = class521_sub1_sub4_404_;
					} else {
						((Class521_Sub1_Sub4) class521_sub1_sub4_404_).aClass521_Sub1_7966 = (((SceneObjectManager) this).aClass521_Sub1Array2605[i_405_]);
						((SceneObjectManager) this).aClass521_Sub1Array2605[i_405_] = class521_sub1_sub4_404_;
					}
				} else {
					((Class521_Sub1_Sub4) class521_sub1_sub4_404_).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_405_];
					((SceneObjectManager) this).aClass521_Sub1Array2649[i_405_] = class521_sub1_sub4_404_;
				}
			}
		}
	}

	public boolean method3473(Class521_Sub1_Sub1 class521_sub1_sub1, boolean bool) {
		boolean bool_406_ = aClass390Array2591 == aClass390Array2614;
		int i = 0;
		short i_407_ = 0;
		byte i_408_ = 0;
		class521_sub1_sub1.method14697((byte) 11);
		if (class521_sub1_sub1.aShort9458 < 0 || class521_sub1_sub1.aShort9456 < 0 || class521_sub1_sub1.localX >= anInt2617 * -1912960305 || class521_sub1_sub1.localY >= -18177099 * anInt2603)
			return false;
		short i_409_ = 0;
		for (int i_410_ = class521_sub1_sub1.aShort9458; i_410_ <= class521_sub1_sub1.localX; i_410_++) {
			for (int i_411_ = class521_sub1_sub1.aShort9456; i_411_ <= class521_sub1_sub1.localY; i_411_++) {
				Class293 class293 = method3459(class521_sub1_sub1.plane, i_410_, i_411_, 463648972);
				if (class293 != null) {
					Class208 class208 = Class153.method2622(class521_sub1_sub1, -1986379274);
					Class208 class208_412_ = class293.aClass208_3504;
					if (class208_412_ == null)
						class293.aClass208_3504 = class208;
					else {
						for (/**/; class208_412_.aClass208_2660 != null; class208_412_ = class208_412_.aClass208_2660) {
							/* empty */
						}
						class208_412_.aClass208_2660 = class208;
					}
					if (bool_406_ && ((((SceneObjectManager) this).anIntArrayArray2606[i_410_][i_411_]) & ~0xffffff) != 0) {
						i = (((SceneObjectManager) this).anIntArrayArray2606[i_410_][i_411_]);
						i_407_ = (((SceneObjectManager) this).aShortArrayArray2611[i_410_][i_411_]);
						i_408_ = (((SceneObjectManager) this).aByteArrayArray2612[i_410_][i_411_]);
					}
					if (!bool && class293.aClass521_Sub1_Sub3_3499 != null && (class293.aClass521_Sub1_Sub3_3499.aShort9561 > i_409_))
						i_409_ = class293.aClass521_Sub1_Sub3_3499.aShort9561;
				}
			}
		}
		if (bool_406_ && (i & ~0xffffff) != 0) {
			for (int i_413_ = class521_sub1_sub1.aShort9458; i_413_ <= class521_sub1_sub1.localX; i_413_++) {
				for (int i_414_ = class521_sub1_sub1.aShort9456; i_414_ <= class521_sub1_sub1.localY; i_414_++) {
					if (0 == ((((SceneObjectManager) this).anIntArrayArray2606[i_413_][i_414_]) & ~0xffffff)) {
						((SceneObjectManager) this).anIntArrayArray2606[i_413_][i_414_] = i;
						((SceneObjectManager) this).aShortArrayArray2611[i_413_][i_414_] = i_407_;
						((SceneObjectManager) this).aByteArrayArray2612[i_413_][i_414_] = i_408_;
					}
				}
			}
		}
		if (bool) {
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[((((SceneObjectManager) this).anInt2616 += -1378536477) * -1983534645 - 1)] = class521_sub1_sub1;
			class521_sub1_sub1.aClass206_7970 = this;
		} else {
			int i_415_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub1.method12986(-984176777)) {
				if (class521_sub1_sub1.method12987(223602346)) {
					((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_415_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_415_] = class521_sub1_sub1;
				} else {
					((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_415_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_415_] = class521_sub1_sub1;
				}
			} else {
				((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_415_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_415_] = class521_sub1_sub1;
			}
		}
		if (bool) {
			Vector3 class385 = Vector3.method6623(class521_sub1_sub1.method11166().aClass385_3595);
			class385.y -= (float) i_409_;
			class521_sub1_sub1.method11171(class385);
			class385.method6624();
		}
		return true;
	}

	public boolean method3474(Class521_Sub1_Sub1 class521_sub1_sub1, boolean bool) {
		boolean bool_416_ = aClass390Array2591 == aClass390Array2614;
		int i = 0;
		short i_417_ = 0;
		byte i_418_ = 0;
		class521_sub1_sub1.method14697((byte) 10);
		if (class521_sub1_sub1.aShort9458 < 0 || class521_sub1_sub1.aShort9456 < 0 || class521_sub1_sub1.localX >= anInt2617 * -1912960305 || class521_sub1_sub1.localY >= -18177099 * anInt2603)
			return false;
		short i_419_ = 0;
		for (int i_420_ = class521_sub1_sub1.aShort9458; i_420_ <= class521_sub1_sub1.localX; i_420_++) {
			for (int i_421_ = class521_sub1_sub1.aShort9456; i_421_ <= class521_sub1_sub1.localY; i_421_++) {
				Class293 class293 = method3459(class521_sub1_sub1.plane, i_420_, i_421_, 1565895691);
				if (class293 != null) {
					Class208 class208 = Class153.method2622(class521_sub1_sub1, -735622954);
					Class208 class208_422_ = class293.aClass208_3504;
					if (class208_422_ == null)
						class293.aClass208_3504 = class208;
					else {
						for (/**/; class208_422_.aClass208_2660 != null; class208_422_ = class208_422_.aClass208_2660) {
							/* empty */
						}
						class208_422_.aClass208_2660 = class208;
					}
					if (bool_416_ && ((((SceneObjectManager) this).anIntArrayArray2606[i_420_][i_421_]) & ~0xffffff) != 0) {
						i = (((SceneObjectManager) this).anIntArrayArray2606[i_420_][i_421_]);
						i_417_ = (((SceneObjectManager) this).aShortArrayArray2611[i_420_][i_421_]);
						i_418_ = (((SceneObjectManager) this).aByteArrayArray2612[i_420_][i_421_]);
					}
					if (!bool && class293.aClass521_Sub1_Sub3_3499 != null && (class293.aClass521_Sub1_Sub3_3499.aShort9561 > i_419_))
						i_419_ = class293.aClass521_Sub1_Sub3_3499.aShort9561;
				}
			}
		}
		if (bool_416_ && (i & ~0xffffff) != 0) {
			for (int i_423_ = class521_sub1_sub1.aShort9458; i_423_ <= class521_sub1_sub1.localX; i_423_++) {
				for (int i_424_ = class521_sub1_sub1.aShort9456; i_424_ <= class521_sub1_sub1.localY; i_424_++) {
					if (0 == ((((SceneObjectManager) this).anIntArrayArray2606[i_423_][i_424_]) & ~0xffffff)) {
						((SceneObjectManager) this).anIntArrayArray2606[i_423_][i_424_] = i;
						((SceneObjectManager) this).aShortArrayArray2611[i_423_][i_424_] = i_417_;
						((SceneObjectManager) this).aByteArrayArray2612[i_423_][i_424_] = i_418_;
					}
				}
			}
		}
		if (bool) {
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[((((SceneObjectManager) this).anInt2616 += -1378536477) * -1983534645 - 1)] = class521_sub1_sub1;
			class521_sub1_sub1.aClass206_7970 = this;
		} else {
			int i_425_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub1.method12986(-287068670)) {
				if (class521_sub1_sub1.method12987(934625577)) {
					((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_425_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_425_] = class521_sub1_sub1;
				} else {
					((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_425_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_425_] = class521_sub1_sub1;
				}
			} else {
				((Class521_Sub1_Sub1) class521_sub1_sub1).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_425_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_425_] = class521_sub1_sub1;
			}
		}
		if (bool) {
			Vector3 class385 = Vector3.method6623(class521_sub1_sub1.method11166().aClass385_3595);
			class385.y -= (float) i_419_;
			class521_sub1_sub1.method11171(class385);
			class385.method6624();
		}
		return true;
	}

	public void method3475() {
		for (int i = 0; i < ((SceneObjectManager) this).anInt2616 * -1983534645; i++) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = ((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i];
			method3407(class521_sub1_sub1, true, -1696604087);
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i] = null;
		}
		((SceneObjectManager) this).anInt2616 = 0;
	}

	public void method3476() {
		for (int i = 0; i < ((SceneObjectManager) this).anInt2616 * -1983534645; i++) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = ((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i];
			method3407(class521_sub1_sub1, true, -1696604087);
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i] = null;
		}
		((SceneObjectManager) this).anInt2616 = 0;
	}

	public void method3477() {
		for (int i = 0; i < ((SceneObjectManager) this).anInt2616 * -1983534645; i++) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = ((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i];
			method3407(class521_sub1_sub1, true, -1696604087);
			((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i] = null;
		}
		((SceneObjectManager) this).anInt2616 = 0;
	}

	public Class521_Sub1_Sub5 method3478(int i, int i_426_, int i_427_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_426_][i_427_];
		if (class293 != null) {
			method3408(class293.aClass521_Sub1_Sub5_3505, 1519479731);
			if (class293.aClass521_Sub1_Sub5_3505 != null) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
				class293.aClass521_Sub1_Sub5_3505 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	void method3479(int i, int i_428_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_429_ = i; i_429_ < i_428_; i_429_++) {
			Class390 class390 = aClass390Array2607[i_429_];
			if (class390 != null) {
				for (int i_430_ = 0; i_430_ < anInt2603 * -18177099; i_430_++) {
					for (int i_431_ = 0; i_431_ < -1912960305 * anInt2617; i_431_++) {
						class282_sub50_sub17 = class390.w(i_431_, i_430_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_432_ = i_431_ << -1928575293 * anInt2592;
							int i_433_ = i_430_ << anInt2592 * -1928575293;
							for (int i_434_ = i_429_ - 1; i_434_ >= 0; i_434_--) {
								Class390 class390_435_ = aClass390Array2607[i_434_];
								if (null != class390_435_) {
									int i_436_ = (class390.method6722(i_431_, i_430_, 65280) - class390_435_.method6722(i_431_, i_430_, 65280));
									int i_437_ = (class390.method6722(i_431_ + 1, i_430_, 65280) - class390_435_.method6722((i_431_ + 1), i_430_, 65280));
									int i_438_ = (class390.method6722(i_431_ + 1, 1 + i_430_, 65280) - class390_435_.method6722((i_431_ + 1), (i_430_ + 1), 65280));
									int i_439_ = (class390.method6722(i_431_, 1 + i_430_, 65280) - (class390_435_.method6722(i_431_, 1 + i_430_, 65280)));
									class390_435_.UA(class282_sub50_sub17, i_432_, ((i_439_ + (i_438_ + (i_437_ + i_436_))) / 4), i_433_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public Class521_Sub1_Sub5 method3480(int i, int i_440_, int i_441_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_440_][i_441_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub5_3502, 2063924843);
			if (null != class293.aClass521_Sub1_Sub5_3502) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3502;
				class293.aClass521_Sub1_Sub5_3502 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public Class521_Sub1_Sub2 method3481(int i, int i_442_, int i_443_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_442_][i_443_];
		if (null == class293)
			return null;
		return ((Class293) class293).aClass521_Sub1_Sub2_3506;
	}

	public Class521_Sub1_Sub5 method3482(int i, int i_444_, int i_445_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_444_][i_445_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub5_3502, 2042198761);
			if (null != class293.aClass521_Sub1_Sub5_3502) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3502;
				class293.aClass521_Sub1_Sub5_3502 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public Class521_Sub1_Sub5 method3483(int i, int i_446_, int i_447_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_446_][i_447_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub5_3502, 663756245);
			if (null != class293.aClass521_Sub1_Sub5_3502) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3502;
				class293.aClass521_Sub1_Sub5_3502 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public int method3484(int i, int i_448_) {
		return (null != ((SceneObjectManager) this).aByteArrayArray2620 ? ((SceneObjectManager) this).aByteArrayArray2620[i][i_448_] & 0xff : 0);
	}

	public Class521_Sub1_Sub4 method3485(int i, int i_449_, int i_450_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_449_][i_450_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub4_3503, 703723831);
			if (class293.aClass521_Sub1_Sub4_3503 != null) {
				Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3503;
				class293.aClass521_Sub1_Sub4_3503 = null;
				return class521_sub1_sub4;
			}
		}
		return null;
	}

	void method3486(int i, int i_451_, int i_452_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_453_ = i; i_453_ < i_451_; i_453_++) {
			Class390 class390 = aClass390Array2607[i_453_];
			if (class390 != null) {
				for (int i_454_ = 0; i_454_ < anInt2603 * -18177099; i_454_++) {
					for (int i_455_ = 0; i_455_ < -1912960305 * anInt2617; i_455_++) {
						class282_sub50_sub17 = class390.w(i_455_, i_454_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_456_ = i_455_ << -1928575293 * anInt2592;
							int i_457_ = i_454_ << anInt2592 * -1928575293;
							for (int i_458_ = i_453_ - 1; i_458_ >= 0; i_458_--) {
								Class390 class390_459_ = aClass390Array2607[i_458_];
								if (null != class390_459_) {
									int i_460_ = (class390.method6722(i_455_, i_454_, 65280) - class390_459_.method6722(i_455_, i_454_, 65280));
									int i_461_ = (class390.method6722(i_455_ + 1, i_454_, 65280) - class390_459_.method6722((i_455_ + 1), i_454_, 65280));
									int i_462_ = (class390.method6722(i_455_ + 1, 1 + i_454_, 65280) - class390_459_.method6722((i_455_ + 1), (i_454_ + 1), 65280));
									int i_463_ = (class390.method6722(i_455_, 1 + i_454_, 65280) - (class390_459_.method6722(i_455_, 1 + i_454_, 65280)));
									class390_459_.UA(class282_sub50_sub17, i_456_, ((i_463_ + (i_462_ + (i_461_ + i_460_))) / 4), i_457_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public Class521_Sub1_Sub4 method3487(int i, int i_464_, int i_465_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_464_][i_465_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub4_3503, 2023590418);
			if (class293.aClass521_Sub1_Sub4_3503 != null) {
				Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3503;
				class293.aClass521_Sub1_Sub4_3503 = null;
				return class521_sub1_sub4;
			}
		}
		return null;
	}

	public Class521_Sub1_Sub4 method3488(int i, int i_466_, int i_467_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_466_][i_467_];
		if (class293 != null) {
			method3408(class293.aClass521_Sub1_Sub4_3500, 1808387400);
			if (class293.aClass521_Sub1_Sub4_3500 != null) {
				Class521_Sub1_Sub4 class521_sub1_sub4 = class293.aClass521_Sub1_Sub4_3500;
				class293.aClass521_Sub1_Sub4_3500 = null;
				return class521_sub1_sub4;
			}
		}
		return null;
	}

	public SceneObjectNode method3489(int i, int i_468_, int i_469_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_468_][i_469_];
		if (class293 == null)
			return null;
		method3408(class293.aClass521_Sub1_Sub3_3499, 1733548178);
		if (null != class293.aClass521_Sub1_Sub3_3499) {
			SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
			class293.aClass521_Sub1_Sub3_3499 = null;
			return class521_sub1_sub3;
		}
		return null;
	}

	public SceneObjectNode method3490(int i, int i_470_, int i_471_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_470_][i_471_];
		if (class293 == null)
			return null;
		method3408(class293.aClass521_Sub1_Sub3_3499, 1021884097);
		if (null != class293.aClass521_Sub1_Sub3_3499) {
			SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
			class293.aClass521_Sub1_Sub3_3499 = null;
			return class521_sub1_sub3;
		}
		return null;
	}

	public void method3491(boolean bool) {
		if (bool) {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2608;
			aClass390Array2591 = aClass390Array2614;
		} else {
			aClass293ArrayArrayArray2604 = aClass293ArrayArrayArray2610;
			aClass390Array2591 = aClass390Array2607;
		}
		anInt2601 = aClass293ArrayArrayArray2604.length * 483772969;
	}

	public Class521_Sub1_Sub2 method3492(int i, int i_472_, int i_473_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_472_][i_473_];
		if (null == class293)
			return null;
		Class521_Sub1_Sub2 class521_sub1_sub2 = ((Class293) class293).aClass521_Sub1_Sub2_3506;
		((Class293) class293).aClass521_Sub1_Sub2_3506 = null;
		method3408(class521_sub1_sub2, 1782593134);
		return class521_sub1_sub2;
	}

	void method3493(Class521_Sub1[] class521_sub1s, int i, int i_474_) {
		if (i < i_474_) {
			int i_475_ = (i_474_ + i) / 2;
			int i_476_ = i;
			Class521_Sub1 class521_sub1 = class521_sub1s[i_475_];
			class521_sub1s[i_475_] = class521_sub1s[i_474_];
			class521_sub1s[i_474_] = class521_sub1;
			int i_477_ = ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495;
			for (int i_478_ = i; i_478_ < i_474_; i_478_++) {
				if ((((Class521_Sub1) class521_sub1s[i_478_]).anInt7969 * 1272394495) > i_477_ + (i_478_ & 0x1)) {
					Class521_Sub1 class521_sub1_479_ = class521_sub1s[i_478_];
					class521_sub1s[i_478_] = class521_sub1s[i_476_];
					class521_sub1s[i_476_++] = class521_sub1_479_;
				}
			}
			class521_sub1s[i_474_] = class521_sub1s[i_476_];
			class521_sub1s[i_476_] = class521_sub1;
			method3502(class521_sub1s, i, i_476_ - 1);
			method3502(class521_sub1s, 1 + i_476_, i_474_);
		}
	}

	public Class521_Sub1_Sub1 method3494(int i, int i_480_, int i_481_, Interface25 interface25) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_480_][i_481_];
		if (class293 == null)
			return null;
		for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
			if ((interface25 == null || interface25.method183(class521_sub1_sub1, 1956908464)) && class521_sub1_sub1.aShort9458 == i_480_ && class521_sub1_sub1.aShort9456 == i_481_) {
				method3407(class521_sub1_sub1, false, -1696604087);
				return class521_sub1_sub1;
			}
		}
		return null;
	}

	public Class521_Sub1_Sub1 method3495(int i, int i_482_, int i_483_, Interface25 interface25) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_482_][i_483_];
		if (class293 == null)
			return null;
		for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
			if ((interface25 == null || interface25.method183(class521_sub1_sub1, 1956908464)) && class521_sub1_sub1.aShort9458 == i_482_ && class521_sub1_sub1.aShort9456 == i_483_) {
				method3407(class521_sub1_sub1, false, -1696604087);
				return class521_sub1_sub1;
			}
		}
		return null;
	}

	void method3496(Class521_Sub1_Sub1 class521_sub1_sub1, boolean bool) {
		for (int i = class521_sub1_sub1.aShort9458; i <= class521_sub1_sub1.localX; i++) {
			for (int i_484_ = class521_sub1_sub1.aShort9456; i_484_ <= class521_sub1_sub1.localY; i_484_++) {
				Class293 class293 = (aClass293ArrayArrayArray2604[class521_sub1_sub1.plane][i][i_484_]);
				if (null != class293) {
					Class208 class208 = class293.aClass208_3504;
					Class208 class208_485_ = null;
					for (/**/; null != class208; class208 = class208.aClass208_2660) {
						if (class208.aClass521_Sub1_Sub1_2659 == class521_sub1_sub1) {
							if (null != class208_485_)
								class208_485_.aClass208_2660 = class208.aClass208_2660;
							else
								class293.aClass208_3504 = class208.aClass208_2660;
							class208.method3560(508246192);
							break;
						}
						class208_485_ = class208;
					}
				}
			}
		}
		if (!bool)
			method3408(class521_sub1_sub1, 1209007509);
	}

	public Class521_Sub1_Sub5 method3497(int i, int i_486_, int i_487_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_486_][i_487_];
		if (null == class293)
			return null;
		return class293.aClass521_Sub1_Sub5_3505;
	}

	void method3498(Class521_Sub1 class521_sub1) {
		if (class521_sub1 != null) {
			class521_sub1.method11176();
			for (int i = 0; i < 2; i++) {
				Class521_Sub1 class521_sub1_488_ = null;
				for (Class521_Sub1 class521_sub1_489_ = ((SceneObjectManager) this).aClass521_Sub1Array2605[i]; class521_sub1_489_ != null; class521_sub1_489_ = (((Class521_Sub1) class521_sub1_489_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_489_) {
						if (class521_sub1_488_ != null)
							((Class521_Sub1) class521_sub1_488_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_489_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2605[i] = (((Class521_Sub1) class521_sub1_489_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_488_ = class521_sub1_489_;
				}
				class521_sub1_488_ = null;
				for (Class521_Sub1 class521_sub1_490_ = ((SceneObjectManager) this).aClass521_Sub1Array2633[i]; null != class521_sub1_490_; class521_sub1_490_ = (((Class521_Sub1) class521_sub1_490_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_490_) {
						if (null != class521_sub1_488_)
							((Class521_Sub1) class521_sub1_488_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_490_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2633[i] = (((Class521_Sub1) class521_sub1_490_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_488_ = class521_sub1_490_;
				}
				class521_sub1_488_ = null;
				for (Class521_Sub1 class521_sub1_491_ = ((SceneObjectManager) this).aClass521_Sub1Array2649[i]; null != class521_sub1_491_; class521_sub1_491_ = (((Class521_Sub1) class521_sub1_491_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_491_) {
						if (null != class521_sub1_488_)
							((Class521_Sub1) class521_sub1_488_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_491_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2649[i] = (((Class521_Sub1) class521_sub1_491_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_488_ = class521_sub1_491_;
				}
			}
		}
	}

	void method3499(Class521_Sub1 class521_sub1) {
		if (class521_sub1 != null) {
			class521_sub1.method11176();
			for (int i = 0; i < 2; i++) {
				Class521_Sub1 class521_sub1_492_ = null;
				for (Class521_Sub1 class521_sub1_493_ = ((SceneObjectManager) this).aClass521_Sub1Array2605[i]; class521_sub1_493_ != null; class521_sub1_493_ = (((Class521_Sub1) class521_sub1_493_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_493_) {
						if (class521_sub1_492_ != null)
							((Class521_Sub1) class521_sub1_492_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_493_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2605[i] = (((Class521_Sub1) class521_sub1_493_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_492_ = class521_sub1_493_;
				}
				class521_sub1_492_ = null;
				for (Class521_Sub1 class521_sub1_494_ = ((SceneObjectManager) this).aClass521_Sub1Array2633[i]; null != class521_sub1_494_; class521_sub1_494_ = (((Class521_Sub1) class521_sub1_494_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_494_) {
						if (null != class521_sub1_492_)
							((Class521_Sub1) class521_sub1_492_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_494_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2633[i] = (((Class521_Sub1) class521_sub1_494_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_492_ = class521_sub1_494_;
				}
				class521_sub1_492_ = null;
				for (Class521_Sub1 class521_sub1_495_ = ((SceneObjectManager) this).aClass521_Sub1Array2649[i]; null != class521_sub1_495_; class521_sub1_495_ = (((Class521_Sub1) class521_sub1_495_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_495_) {
						if (null != class521_sub1_492_)
							((Class521_Sub1) class521_sub1_492_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_495_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2649[i] = (((Class521_Sub1) class521_sub1_495_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_492_ = class521_sub1_495_;
				}
			}
		}
	}

	public Class521_Sub1_Sub5 method3500(int i, int i_496_, int i_497_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_496_][i_497_];
		if (null == class293)
			return null;
		return class293.aClass521_Sub1_Sub5_3505;
	}

	public void method3501(int i) {
		/* empty */
	}

	void method3502(Class521_Sub1[] class521_sub1s, int i, int i_498_) {
		if (i < i_498_) {
			int i_499_ = (i_498_ + i) / 2;
			int i_500_ = i;
			Class521_Sub1 class521_sub1 = class521_sub1s[i_499_];
			class521_sub1s[i_499_] = class521_sub1s[i_498_];
			class521_sub1s[i_498_] = class521_sub1;
			int i_501_ = ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495;
			for (int i_502_ = i; i_502_ < i_498_; i_502_++) {
				if ((((Class521_Sub1) class521_sub1s[i_502_]).anInt7969 * 1272394495) > i_501_ + (i_502_ & 0x1)) {
					Class521_Sub1 class521_sub1_503_ = class521_sub1s[i_502_];
					class521_sub1s[i_502_] = class521_sub1s[i_500_];
					class521_sub1s[i_500_++] = class521_sub1_503_;
				}
			}
			class521_sub1s[i_498_] = class521_sub1s[i_500_];
			class521_sub1s[i_500_] = class521_sub1;
			method3502(class521_sub1s, i, i_500_ - 1);
			method3502(class521_sub1s, 1 + i_500_, i_498_);
		}
	}

	public Class521_Sub1_Sub5 method3503(int i, int i_504_, int i_505_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_504_][i_505_];
		if (class293 != null) {
			method3408(class293.aClass521_Sub1_Sub5_3505, 788847756);
			if (class293.aClass521_Sub1_Sub5_3505 != null) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
				class293.aClass521_Sub1_Sub5_3505 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public int method3504(int i, int i_506_) {
		return (((SceneObjectManager) this).aByteArrayArray2612 != null ? ((SceneObjectManager) this).aByteArrayArray2612[i][i_506_] & 0xff : 0);
	}

	public Class521_Sub1_Sub1 method3505(int i, int i_507_, int i_508_, Interface25 interface25) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_507_][i_508_];
		if (class293 == null)
			return null;
		for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
			if ((null == interface25 || interface25.method183(class521_sub1_sub1, 1956908464)) && i_507_ == class521_sub1_sub1.aShort9458 && i_508_ == class521_sub1_sub1.aShort9456)
				return class521_sub1_sub1;
		}
		return null;
	}

	public Class208 method3506(int i, int i_509_, int i_510_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_509_][i_510_];
		if (class293 == null)
			return null;
		return class293.aClass208_3504;
	}

	public Class208 method3507(int i, int i_511_, int i_512_, byte i_513_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_511_][i_512_];
		if (class293 == null)
			return null;
		return class293.aClass208_3504;
	}

	void method3508(Class521_Sub1 class521_sub1, Class282_Sub24[] class282_sub24s) {
		if (((SceneObjectManager) this).aBool2598) {
			int i = class521_sub1.method13036(class282_sub24s, -827011094);
			((SceneObjectManager) this).aClass505_2596.method8547(i, class282_sub24s);
		}
		if (aClass390Array2614 == aClass390Array2591) {
			boolean bool = false;
			boolean bool_514_ = false;
			Vector3 class385 = class521_sub1.method11166().aClass385_3595;
			int i;
			int i_515_;
			if (class521_sub1 instanceof Class521_Sub1_Sub1) {
				i = ((Class521_Sub1_Sub1) class521_sub1).aShort9458;
				i_515_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9456;
			} else {
				i = (int) class385.x >> anInt2592 * -1928575293;
				i_515_ = (int) class385.z >> -1928575293 * anInt2592;
			}
			Class90 class90 = new Class90();
			class90.anInt946 = method3387(i, i_515_, (byte) 102) * -1856397433;
			class90.anInt945 = method3386(i, i_515_, 1481885588) * 873459953;
			class90.anInt947 = method3538(i, i_515_, -575094789) * -96197041;
			class90.anInt949 = method3432(i, i_515_, (byte) 1) * -1472617411;
			class90.anInt950 = method3464(i, i_515_, 1819707800) * 1801644261;
			class90.anInt951 = method3391(i, i_515_, 2124895018) * 1412616155;
			((SceneObjectManager) this).aClass505_2596.method8476(aClass390Array2607[0].method6709((int) class385.x, (int) class385.z, -402315089), class90);
		}
		Class285 class285 = class521_sub1.method12990(((SceneObjectManager) this).aClass505_2596, 389193782);
		if (null != class285) {
			if (((Class285) class285).aBool3392) {
				class285.aClass521_Sub1_3391 = class521_sub1;
				aClass284_2648.method5013(class285, 414101686);
			} else
				Class279.method4969(class285, 1362412061);
		}
	}

	public SceneObjectNode method3509(int i, int i_516_, int i_517_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_516_][i_517_];
		if (null == class293 || class293.aClass521_Sub1_Sub3_3499 == null)
			return null;
		return class293.aClass521_Sub1_Sub3_3499;
	}

	public void method3510() {
		for (int i = 0; i < anInt2601 * -1485737447; i++) {
			for (int i_518_ = 0; i_518_ < -1912960305 * anInt2617; i_518_++) {
				for (int i_519_ = 0; i_519_ < -18177099 * anInt2603; i_519_++) {
					Class293 class293 = aClass293ArrayArrayArray2604[i][i_518_][i_519_];
					if (class293 != null) {
						Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
						Class521_Sub1_Sub5 class521_sub1_sub5_520_ = class293.aClass521_Sub1_Sub5_3502;
						if (class521_sub1_sub5 != null && class521_sub1_sub5.method12985(-1485859653)) {
							method3452(class521_sub1_sub5, i, i_518_, i_519_, 1, 1);
							if (class521_sub1_sub5_520_ != null && class521_sub1_sub5_520_.method12985(-1575616145)) {
								method3452(class521_sub1_sub5_520_, i, i_518_, i_519_, 1, 1);
								class521_sub1_sub5_520_.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, 0, 0, 0, false, -1957409820);
								class521_sub1_sub5_520_.method12984(1095073923);
							}
							class521_sub1_sub5.method12984(505746949);
						}
						for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-1089672802)) {
								method3452(class521_sub1_sub1, i, i_518_, i_519_, 1 + (class521_sub1_sub1.localX - (class521_sub1_sub1.aShort9458)), (class521_sub1_sub1.localY - class521_sub1_sub1.aShort9456 + 1));
								class521_sub1_sub1.method12984(1847498492);
							}
						}
						SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
						if (null != class521_sub1_sub3 && class521_sub1_sub3.method12985(-1372627430)) {
							method3417(class521_sub1_sub3, i, i_518_, i_519_, 2139294126);
							class521_sub1_sub3.method12984(1969618813);
						}
					}
				}
			}
		}
	}

	public Class521_Sub1_Sub4 getWallDecoration(int i, int i_521_, int i_522_, byte i_523_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_521_][i_522_];
		if (class293 == null) {
			if (i_523_ == -1) {
				/* empty */
			}
			return null;
		}
		return class293.aClass521_Sub1_Sub4_3503;
	}

	public void method3512() {
		for (int i = 0; i < anInt2601 * -1485737447; i++) {
			for (int i_524_ = 0; i_524_ < -1912960305 * anInt2617; i_524_++) {
				for (int i_525_ = 0; i_525_ < -18177099 * anInt2603; i_525_++) {
					Class293 class293 = aClass293ArrayArrayArray2604[i][i_524_][i_525_];
					if (class293 != null) {
						Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
						Class521_Sub1_Sub5 class521_sub1_sub5_526_ = class293.aClass521_Sub1_Sub5_3502;
						if (class521_sub1_sub5 != null && class521_sub1_sub5.method12985(-1378606081)) {
							method3452(class521_sub1_sub5, i, i_524_, i_525_, 1, 1);
							if (class521_sub1_sub5_526_ != null && class521_sub1_sub5_526_.method12985(-1089911862)) {
								method3452(class521_sub1_sub5_526_, i, i_524_, i_525_, 1, 1);
								class521_sub1_sub5_526_.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, 0, 0, 0, false, -1809126221);
								class521_sub1_sub5_526_.method12984(-488883099);
							}
							class521_sub1_sub5.method12984(511398697);
						}
						for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-1830269089)) {
								method3452(class521_sub1_sub1, i, i_524_, i_525_, 1 + (class521_sub1_sub1.localX - (class521_sub1_sub1.aShort9458)), (class521_sub1_sub1.localY - class521_sub1_sub1.aShort9456 + 1));
								class521_sub1_sub1.method12984(194418785);
							}
						}
						SceneObjectNode class521_sub1_sub3 = class293.aClass521_Sub1_Sub3_3499;
						if (null != class521_sub1_sub3 && class521_sub1_sub3.method12985(-2143297831)) {
							method3417(class521_sub1_sub3, i, i_524_, i_525_, 1099261163);
							class521_sub1_sub3.method12984(-282004007);
						}
					}
				}
			}
		}
	}

	void method3513(Class521_Sub1 class521_sub1, int i, int i_527_, int i_528_) {
		if (i_527_ < -1912960305 * anInt2617) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_527_ + 1][i_528_];
			if (class293 != null && null != class293.aClass521_Sub1_Sub3_3499 && class293.aClass521_Sub1_Sub3_3499.method12985(-1056520770))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, 0, true, -1880715157);
		}
		if (i_528_ < anInt2617 * -1912960305) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][i_527_][1 + i_528_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1553993985))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, 0, 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -2085777643);
		}
		if (i_527_ < -1912960305 * anInt2617 && i_528_ < -18177099 * anInt2603) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_527_][1 + i_528_];
			if (null != class293 && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-2041919381))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (1885735347 * ((SceneObjectManager) this).anInt2593), 0, (((SceneObjectManager) this).anInt2593 * 1885735347), true, -2118207437);
		}
		if (i_527_ < -1912960305 * anInt2617 && i_528_ > 0) {
			Class293 class293 = aClass293ArrayArrayArray2604[i][1 + i_527_][i_528_ - 1];
			if (class293 != null && class293.aClass521_Sub1_Sub3_3499 != null && class293.aClass521_Sub1_Sub3_3499.method12985(-1493429552))
				class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class293.aClass521_Sub1_Sub3_3499, (((SceneObjectManager) this).anInt2593 * 1885735347), 0, -(((SceneObjectManager) this).anInt2593 * 1885735347), true, -1937479153);
		}
	}

	public Class521_Sub1_Sub5 method3514(int i, int i_529_, int i_530_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_529_][i_530_];
		if (null != class293) {
			method3408(class293.aClass521_Sub1_Sub5_3502, 756588615);
			if (null != class293.aClass521_Sub1_Sub5_3502) {
				Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3502;
				class293.aClass521_Sub1_Sub5_3502 = null;
				return class521_sub1_sub5;
			}
		}
		return null;
	}

	public void method3515(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_531_, int i_532_, boolean[] bools) {
		if (aClass390Array2614 != aClass390Array2591) {
			int i_533_ = aClass390Array2607[i].method6709(i_531_, i_532_, -461874996);
			for (int i_534_ = 0; i_534_ <= i; i_534_++) {
				if (null == bools || bools[i_534_]) {
					Class390 class390 = aClass390Array2607[i_534_];
					if (null != class390)
						class390.NA(class282_sub50_sub17, i_531_, i_533_ - class390.method6709(i_531_, i_532_, 350887357), i_532_, 0, false);
				}
			}
		}
	}

	Class293 method3516(int i, int i_535_, int i_536_) {
		if (aClass293ArrayArrayArray2604[i][i_535_][i_536_] == null) {
			boolean bool = (aClass293ArrayArrayArray2604[0][i_535_][i_536_] != null && (aClass293ArrayArrayArray2604[0][i_535_][i_536_].aClass293_3509) != null);
			if (bool && i >= -1485737447 * anInt2601 - 1)
				return null;
			method3384(i, i_535_, i_536_, (byte) -63);
		}
		return aClass293ArrayArrayArray2604[i][i_535_][i_536_];
	}

	void method3517(Class521_Sub1 class521_sub1, int i, int i_537_, int i_538_, int i_539_, int i_540_) {
		boolean bool = true;
		int i_541_ = i_537_;
		int i_542_ = i_537_ + i_539_;
		int i_543_ = i_538_ - 1;
		int i_544_ = i_540_ + i_538_;
		for (int i_545_ = i; i_545_ <= 1 + i; i_545_++) {
			if (-1485737447 * anInt2601 != i_545_) {
				for (int i_546_ = i_541_; i_546_ <= i_542_; i_546_++) {
					if (i_546_ >= 0 && i_546_ < -1912960305 * anInt2617) {
						for (int i_547_ = i_543_; i_547_ <= i_544_; i_547_++) {
							if (i_547_ >= 0 && i_547_ < anInt2603 * -18177099 && (!bool || i_546_ >= i_542_ || i_547_ >= i_544_ || i_547_ < i_538_ && i_546_ != i_537_)) {
								Class293 class293 = (aClass293ArrayArrayArray2604[i_545_][i_546_][i_547_]);
								if (class293 != null) {
									int i_548_ = (((aClass390Array2591[i_545_].method6722(i_546_, i_547_, 65280)) + (aClass390Array2591[i_545_].method6722(1 + i_546_, i_547_, 65280)) + (aClass390Array2591[i_545_].method6722(i_546_, 1 + i_547_, 65280)) + (aClass390Array2591[i_545_].method6722(1 + i_546_, 1 + i_547_, 65280))) / 4
											- ((aClass390Array2591[i].method6722(i_537_, i_538_, 65280)) + (aClass390Array2591[i].method6722(i_537_ + 1, i_538_, 65280)) + (aClass390Array2591[i].method6722(i_537_, i_538_ + 1, 65280)) + (aClass390Array2591[i].method6722(i_537_ + 1, i_538_ + 1, 65280))) / 4);
									Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
									Class521_Sub1_Sub5 class521_sub1_sub5_549_ = class293.aClass521_Sub1_Sub5_3502;
									if (null != class521_sub1_sub5 && class521_sub1_sub5.method12985(-2013074668))
										class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, ((((SceneObjectManager) this).anInt2594 * -1428980483 * (1 - i_539_)) + ((i_546_ - i_537_) * (1885735347 * (((SceneObjectManager) this).anInt2593)))), i_548_, (((1 - i_540_) * (-1428980483 * (((SceneObjectManager) this).anInt2594))) + ((i_547_ - i_538_) * (((SceneObjectManager) this).anInt2593 * 1885735347))), bool, -2052835481);
									if (null != class521_sub1_sub5_549_ && class521_sub1_sub5_549_.method12985(-1274793054))
										class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5_549_, (((i_546_ - i_537_) * (1885735347 * (((SceneObjectManager) this).anInt2593))) + (-1428980483 * ((SceneObjectManager) this).anInt2594 * (1 - i_539_))), i_548_, (((i_547_ - i_538_) * (1885735347 * (((SceneObjectManager) this).anInt2593))) + ((1 - i_540_) * (((SceneObjectManager) this).anInt2594 * -1428980483))), bool, -1977659895);
									for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
										Class521_Sub1_Sub1 class521_sub1_sub1 = (class208.aClass521_Sub1_Sub1_2659);
										if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-1526846111) && ((class521_sub1_sub1.aShort9458 == i_546_) || i_541_ == i_546_) && ((class521_sub1_sub1.aShort9456 == i_547_) || i_543_ == i_547_)) {
											int i_550_ = ((class521_sub1_sub1.localX) - (class521_sub1_sub1.aShort9458) + 1);
											int i_551_ = 1 + ((class521_sub1_sub1.localY) - (class521_sub1_sub1.aShort9456));
											class521_sub1.method13013((((SceneObjectManager) this).aClass505_2596), class521_sub1_sub1, ((1885735347 * (((SceneObjectManager) this).anInt2593) * ((class521_sub1_sub1.aShort9458) - i_537_)) + ((((SceneObjectManager) this).anInt2594) * -1428980483 * (i_550_ - i_539_))), i_548_, (((i_551_ - i_540_) * ((((SceneObjectManager) this).anInt2594) * -1428980483)) + (((class521_sub1_sub1.aShort9456) - i_538_) * ((((SceneObjectManager) this).anInt2593) * 1885735347))), bool, -2029114862);
										}
									}
								}
							}
						}
					}
				}
				i_541_--;
				bool = false;
			}
		}
	}

	public int method3518(int i, int i_552_) {
		return (null != ((SceneObjectManager) this).aShortArrayArray2611 ? ((SceneObjectManager) this).aShortArrayArray2611[i][i_552_] & 0xffff : 0);
	}

	void method3519(boolean bool, byte[][][] is, int i, byte i_553_, int i_554_) {
		int i_555_ = bool ? 1 : 0;
		((SceneObjectManager) this).anInt2623 = 0;
		((SceneObjectManager) this).anInt2624 = 0;
		((SceneObjectManager) this).anInt2609 += -162594145;
		if (0 == (i_554_ & 0x2)) {
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_555_]; null != class521_sub1; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) 9);
				if ((-1 != ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495) && !method3424(class521_sub1, bool, is, i, i_553_))
					((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = class521_sub1;
			}
		}
		if ((i_554_ & 0x1) == 0) {
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_555_]; null != class521_sub1; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) -3);
				if ((1272394495 * ((Class521_Sub1) class521_sub1).anInt7969 != -1) && !method3424(class521_sub1, bool, is, i, i_553_))
					((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = class521_sub1;
			}
			for (Class521_Sub1 class521_sub1 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_555_]; class521_sub1 != null; class521_sub1 = ((Class521_Sub1) class521_sub1).aClass521_Sub1_7966) {
				method3421(class521_sub1, (byte) 65);
				if ((((Class521_Sub1) class521_sub1).anInt7969 * 1272394495 != -1) && !method3424(class521_sub1, bool, is, i, i_553_)) {
					if (class521_sub1.method12987(718816681))
						((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = class521_sub1;
					else
						((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = class521_sub1;
				}
			}
			if (!bool) {
				for (int i_556_ = 0; i_556_ < -1983534645 * ((SceneObjectManager) this).anInt2616; i_556_++) {
					method3421((((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_556_]), (byte) 0);
					if ((1272394495 * ((Class521_Sub1_Sub1) (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_556_])).anInt7969) != -1 && !method3424((((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_556_]), bool, is, i, i_553_)) {
						if (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_556_].method12987(-622207769))
							((SceneObjectManager) this).aClass521_Sub1Array2625[((((SceneObjectManager) this).anInt2624 += -814824417) * 227522527) - 1] = (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_556_]);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2626[((((SceneObjectManager) this).anInt2623 += -1389947031) * -390666023) - 1] = (((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627[i_556_]);
					}
				}
			}
		}
		if (-390666023 * ((SceneObjectManager) this).anInt2623 > 0) {
			method3466(((SceneObjectManager) this).aClass521_Sub1Array2626, 0, ((SceneObjectManager) this).anInt2623 * -390666023 - 1);
			for (int i_557_ = 0; i_557_ < ((SceneObjectManager) this).anInt2623 * -390666023; i_557_++)
				method3508(((SceneObjectManager) this).aClass521_Sub1Array2626[i_557_], ((SceneObjectManager) this).aClass282_Sub24Array2642);
		}
		if (((SceneObjectManager) this).aBool2598)
			((SceneObjectManager) this).aClass505_2596.method8547(0, null);
		if ((i_554_ & 0x2) == 0) {
			for (int i_558_ = 0; i_558_ < -1485737447 * anInt2601; i_558_++) {
				if (i_558_ >= i && is != null) {
					int i_559_ = ((SceneObjectManager) this).aBoolArrayArray2651.length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053) > -1912960305 * anInt2617)
						i_559_ -= (((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053 - anInt2617 * -1912960305);
					int i_560_ = ((SceneObjectManager) this).aBoolArrayArray2651[0].length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651[0].length + ((SceneObjectManager) this).anInt2621 * -1955723827) > -18177099 * anInt2603)
						i_560_ -= (((SceneObjectManager) this).anInt2621 * -1955723827 + (((SceneObjectManager) this).aBoolArrayArray2651[0]).length - anInt2603 * -18177099);
					boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2635;
					if (((SceneObjectManager) this).aBool2599) {
						for (int i_561_ = ((SceneObjectManager) this).anInt2602 * -1275764031; i_561_ < i_559_; i_561_++) {
							int i_562_ = (i_561_ + 260560053 * ((SceneObjectManager) this).anInt2637 - (-1275764031 * ((SceneObjectManager) this).anInt2602));
							for (int i_563_ = (-2139776287 * ((SceneObjectManager) this).anInt2636); i_563_ < i_560_; i_563_++) {
								bools[i_561_][i_563_] = false;
								if (((SceneObjectManager) this).aBoolArrayArray2651[i_561_][i_563_]) {
									int i_564_ = (i_563_ + (((SceneObjectManager) this).anInt2621 * -1955723827) - (-2139776287 * ((SceneObjectManager) this).anInt2636));
									for (int i_565_ = i_558_; i_565_ >= 0; i_565_--) {
										if ((null != (aClass293ArrayArrayArray2604[i_565_][i_562_][i_564_])) && (aClass293ArrayArrayArray2604[i_565_][i_562_][i_564_].aByte3507) == i_558_) {
											if ((i_565_ >= i && (is[i_565_][i_562_][i_564_] == i_553_)) || (aClass201_2600.method3271(i_558_, i_562_, i_564_)))
												bools[i_561_][i_563_] = false;
											else
												bools[i_561_][i_563_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass390Array2591[i_558_].method6717(((SceneObjectManager) this).anInt2628 * -527863643, 1580412859 * ((SceneObjectManager) this).anInt2629, 1459994833 * ((SceneObjectManager) this).anInt2652, ((SceneObjectManager) this).aBoolArrayArray2635, false, i_554_);
				} else {
					int i_566_ = ((SceneObjectManager) this).aBoolArrayArray2651.length;
					if ((((SceneObjectManager) this).aBoolArrayArray2651.length + ((SceneObjectManager) this).anInt2637 * 260560053) > anInt2617 * -1912960305)
						i_566_ -= (260560053 * ((SceneObjectManager) this).anInt2637 + ((SceneObjectManager) this).aBoolArrayArray2651.length - anInt2617 * -1912960305);
					int i_567_ = ((SceneObjectManager) this).aBoolArrayArray2651[0].length;
					if ((-1955723827 * ((SceneObjectManager) this).anInt2621 + ((SceneObjectManager) this).aBoolArrayArray2651[0].length) > anInt2603 * -18177099)
						i_567_ -= (((SceneObjectManager) this).anInt2621 * -1955723827 + (((SceneObjectManager) this).aBoolArrayArray2651[0]).length - anInt2603 * -18177099);
					boolean[][] bools = ((SceneObjectManager) this).aBoolArrayArray2635;
					if (((SceneObjectManager) this).aBool2599) {
						for (int i_568_ = -1275764031 * ((SceneObjectManager) this).anInt2602; i_568_ < i_566_; i_568_++) {
							int i_569_ = (i_568_ + 260560053 * ((SceneObjectManager) this).anInt2637 - (-1275764031 * ((SceneObjectManager) this).anInt2602));
							for (int i_570_ = (((SceneObjectManager) this).anInt2636 * -2139776287); i_570_ < i_567_; i_570_++) {
								if ((((SceneObjectManager) this).aBoolArrayArray2651[i_568_][i_570_]) && !(aClass201_2600.method3271(i_558_, i_569_, (i_570_ + (-1955723827 * ((SceneObjectManager) this).anInt2621) - -2139776287 * (((SceneObjectManager) this).anInt2636)))))
									bools[i_568_][i_570_] = true;
								else
									bools[i_568_][i_570_] = false;
							}
						}
					}
					aClass390Array2591[i_558_].method6717(((SceneObjectManager) this).anInt2628 * -527863643, 1580412859 * ((SceneObjectManager) this).anInt2629, ((SceneObjectManager) this).anInt2652 * 1459994833, ((SceneObjectManager) this).aBoolArrayArray2635, true, i_554_);
				}
			}
		}
		if (227522527 * ((SceneObjectManager) this).anInt2624 > 0) {
			method3502(((SceneObjectManager) this).aClass521_Sub1Array2625, 0, 227522527 * ((SceneObjectManager) this).anInt2624 - 1);
			for (int i_571_ = 0; i_571_ < ((SceneObjectManager) this).anInt2624 * 227522527; i_571_++)
				method3508(((SceneObjectManager) this).aClass521_Sub1Array2625[i_571_], ((SceneObjectManager) this).aClass282_Sub24Array2642);
		}
	}

	public void method3520(int i, int i_572_, int i_573_, int i_574_, Class521_Sub1_Sub2 class521_sub1_sub2) {
		Class293 class293 = method3459(i, i_572_, i_573_, 1879504414);
		if (class293 != null) {
			class521_sub1_sub2.method11171(new Vector3((float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_572_ << anInt2592 * -1928575293)), (float) i_574_, (float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_573_ << anInt2592 * -1928575293))));
			((Class293) class293).aClass521_Sub1_Sub2_3506 = class521_sub1_sub2;
			int i_575_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub2.method12986(-1694477320)) {
				if (class521_sub1_sub2.method12987(-1490917954)) {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_575_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_575_] = class521_sub1_sub2;
				} else {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_575_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_575_] = class521_sub1_sub2;
				}
			} else {
				((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_575_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_575_] = class521_sub1_sub2;
			}
		}
	}

	public SceneObjectManager(GraphicalRenderer class505, int i, int i_576_, int i_577_, int i_578_, int i_579_, boolean bool, boolean bool_580_) {
		((SceneObjectManager) this).anInt2616 = 0;
		((SceneObjectManager) this).anInt2634 = 10072;
		((SceneObjectManager) this).anInt2618 = 5015;
		((SceneObjectManager) this).anInt2619 = 5040;
		((SceneObjectManager) this).aFloatArray2639 = new float[3];
		((SceneObjectManager) this).aClass282_Sub24Array2642 = new Class282_Sub24[8];
		((SceneObjectManager) this).anInt2643 = 65361;
		((SceneObjectManager) this).aClass505_2596 = class505;
		((SceneObjectManager) this).aBool2598 = ((SceneObjectManager) this).aClass505_2596.method8463() > 0;
		anInt2592 = -2000283157 * i;
		((SceneObjectManager) this).anInt2593 = -1653092997 * (1 << anInt2592 * -1928575293);
		((SceneObjectManager) this).anInt2594 = 356352085 * (((SceneObjectManager) this).anInt2593 * 1885735347 >> 1);
		anInt2601 = i_576_ * 483772969;
		anInt2617 = i_577_ * 537410607;
		anInt2603 = i_578_ * 1850176157;
		((SceneObjectManager) this).anInt2652 = 1632278577 * i_579_;
		((SceneObjectManager) this).aClass454_2597 = new Class454();
		aClass201_2600 = new Class201(this);
		aClass293ArrayArrayArray2610 = (new Class293[i_576_][anInt2617 * -1912960305][-18177099 * anInt2603]);
		aClass390Array2607 = new Class390[i_576_];
		if (bool) {
			((SceneObjectManager) this).anIntArrayArray2606 = new int[anInt2617 * -1912960305][anInt2603 * -18177099];
			((SceneObjectManager) this).aByteArrayArray2612 = new byte[-1912960305 * anInt2617][-18177099 * anInt2603];
			((SceneObjectManager) this).aShortArrayArray2611 = new short[anInt2617 * -1912960305][anInt2603 * -18177099];
			((SceneObjectManager) this).aByteArrayArray2613 = new byte[anInt2617 * -1912960305][anInt2603 * -18177099];
			((SceneObjectManager) this).aByteArrayArray2595 = new byte[anInt2617 * -1912960305][-18177099 * anInt2603];
			((SceneObjectManager) this).aByteArrayArray2620 = new byte[anInt2617 * -1912960305][-18177099 * anInt2603];
			aClass293ArrayArrayArray2608 = (new Class293[1][anInt2617 * -1912960305][-18177099 * anInt2603]);
			aClass390Array2614 = new Class390[1];
		}
		if (bool_580_) {
			((SceneObjectManager) this).aLongArrayArrayArray2645 = new long[i_576_][i_577_][i_578_];
			((SceneObjectManager) this).aClass287Array2646 = new Class287[65361];
			((SceneObjectManager) this).aBoolArray2647 = new boolean[65361];
			((SceneObjectManager) this).anInt2615 = 0;
		}
		method3380(false, -914334995);
		((SceneObjectManager) this).aClass521_Sub1Array2605 = new Class521_Sub1[2];
		((SceneObjectManager) this).aClass521_Sub1Array2633 = new Class521_Sub1[2];
		((SceneObjectManager) this).aClass521_Sub1Array2649 = new Class521_Sub1[2];
		((SceneObjectManager) this).aClass521_Sub1Array2626 = new Class521_Sub1[10072];
		((SceneObjectManager) this).anInt2623 = 0;
		((SceneObjectManager) this).aClass521_Sub1Array2625 = new Class521_Sub1[5015];
		((SceneObjectManager) this).anInt2624 = 0;
		((SceneObjectManager) this).aClass521_Sub1_Sub1Array2627 = new Class521_Sub1_Sub1[5040];
		((SceneObjectManager) this).anInt2616 = 0;
		((SceneObjectManager) this).aBoolArrayArray2651 = (new boolean[1 + (1459994833 * ((SceneObjectManager) this).anInt2652 + 1459994833 * ((SceneObjectManager) this).anInt2652)][(((SceneObjectManager) this).anInt2652 * 1459994833 + 1459994833 * ((SceneObjectManager) this).anInt2652 + 1)]);
		((SceneObjectManager) this).aBoolArrayArray2635 = (new boolean[2 + (((SceneObjectManager) this).anInt2652 * 1459994833 + 1459994833 * ((SceneObjectManager) this).anInt2652)][(((SceneObjectManager) this).anInt2652 * 1459994833 + 1459994833 * ((SceneObjectManager) this).anInt2652 + 2)]);
		((SceneObjectManager) this).anIntArray2641 = new int[(((SceneObjectManager) this).anInt2652 * 1459994833 + 1459994833 * ((SceneObjectManager) this).anInt2652 + 2)];
		aClass284_2648 = new XLogin(false);
	}

	void method3521(Class521_Sub1 class521_sub1) {
		if (class521_sub1 != null) {
			class521_sub1.method11176();
			for (int i = 0; i < 2; i++) {
				Class521_Sub1 class521_sub1_581_ = null;
				for (Class521_Sub1 class521_sub1_582_ = ((SceneObjectManager) this).aClass521_Sub1Array2605[i]; class521_sub1_582_ != null; class521_sub1_582_ = (((Class521_Sub1) class521_sub1_582_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_582_) {
						if (class521_sub1_581_ != null)
							((Class521_Sub1) class521_sub1_581_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_582_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2605[i] = (((Class521_Sub1) class521_sub1_582_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_581_ = class521_sub1_582_;
				}
				class521_sub1_581_ = null;
				for (Class521_Sub1 class521_sub1_583_ = ((SceneObjectManager) this).aClass521_Sub1Array2633[i]; null != class521_sub1_583_; class521_sub1_583_ = (((Class521_Sub1) class521_sub1_583_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_583_) {
						if (null != class521_sub1_581_)
							((Class521_Sub1) class521_sub1_581_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_583_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2633[i] = (((Class521_Sub1) class521_sub1_583_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_581_ = class521_sub1_583_;
				}
				class521_sub1_581_ = null;
				for (Class521_Sub1 class521_sub1_584_ = ((SceneObjectManager) this).aClass521_Sub1Array2649[i]; null != class521_sub1_584_; class521_sub1_584_ = (((Class521_Sub1) class521_sub1_584_).aClass521_Sub1_7966)) {
					if (class521_sub1 == class521_sub1_584_) {
						if (null != class521_sub1_581_)
							((Class521_Sub1) class521_sub1_581_).aClass521_Sub1_7966 = (((Class521_Sub1) class521_sub1_584_).aClass521_Sub1_7966);
						else
							((SceneObjectManager) this).aClass521_Sub1Array2649[i] = (((Class521_Sub1) class521_sub1_584_).aClass521_Sub1_7966);
						return;
					}
					class521_sub1_581_ = class521_sub1_584_;
				}
			}
		}
	}

	void method3522(Class521_Sub1 class521_sub1) {
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		((SceneObjectManager) this).aClass505_2596.method8479((float) (int) class385.x, (float) ((int) class385.y + (class521_sub1.method12995(793354040) >> 1)), (float) (int) class385.z, ((SceneObjectManager) this).aFloatArray2639);
		((Class521_Sub1) class521_sub1).anInt7969 = (int) ((SceneObjectManager) this).aFloatArray2639[2] * -721433345;
	}

	void method3523(Class521_Sub1 class521_sub1) {
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		((SceneObjectManager) this).aClass505_2596.method8479((float) (int) class385.x, (float) ((int) class385.y + (class521_sub1.method12995(358674030) >> 1)), (float) (int) class385.z, ((SceneObjectManager) this).aFloatArray2639);
		((Class521_Sub1) class521_sub1).anInt7969 = (int) ((SceneObjectManager) this).aFloatArray2639[2] * -721433345;
	}

	void method3524(Class521_Sub1 class521_sub1) {
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		((SceneObjectManager) this).aClass505_2596.method8479((float) (int) class385.x, (float) ((int) class385.y + (class521_sub1.method12995(-1590857294) >> 1)), (float) (int) class385.z, ((SceneObjectManager) this).aFloatArray2639);
		((Class521_Sub1) class521_sub1).anInt7969 = (int) ((SceneObjectManager) this).aFloatArray2639[2] * -721433345;
	}

	void method3525(Class521_Sub1[] class521_sub1s, int i, int i_585_) {
		if (i < i_585_) {
			int i_586_ = (i_585_ + i) / 2;
			int i_587_ = i;
			Class521_Sub1 class521_sub1 = class521_sub1s[i_586_];
			class521_sub1s[i_586_] = class521_sub1s[i_585_];
			class521_sub1s[i_585_] = class521_sub1;
			int i_588_ = ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495;
			for (int i_589_ = i; i_589_ < i_585_; i_589_++) {
				if ((((Class521_Sub1) class521_sub1s[i_589_]).anInt7969 * 1272394495) > i_588_ + (i_589_ & 0x1)) {
					Class521_Sub1 class521_sub1_590_ = class521_sub1s[i_589_];
					class521_sub1s[i_589_] = class521_sub1s[i_587_];
					class521_sub1s[i_587_++] = class521_sub1_590_;
				}
			}
			class521_sub1s[i_585_] = class521_sub1s[i_587_];
			class521_sub1s[i_587_] = class521_sub1;
			method3502(class521_sub1s, i, i_587_ - 1);
			method3502(class521_sub1s, 1 + i_587_, i_585_);
		}
	}

	void method3526(int i, int i_591_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_592_ = i; i_592_ < i_591_; i_592_++) {
			Class390 class390 = aClass390Array2607[i_592_];
			if (class390 != null) {
				for (int i_593_ = 0; i_593_ < anInt2603 * -18177099; i_593_++) {
					for (int i_594_ = 0; i_594_ < -1912960305 * anInt2617; i_594_++) {
						class282_sub50_sub17 = class390.w(i_594_, i_593_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_595_ = i_594_ << -1928575293 * anInt2592;
							int i_596_ = i_593_ << anInt2592 * -1928575293;
							for (int i_597_ = i_592_ - 1; i_597_ >= 0; i_597_--) {
								Class390 class390_598_ = aClass390Array2607[i_597_];
								if (null != class390_598_) {
									int i_599_ = (class390.method6722(i_594_, i_593_, 65280) - class390_598_.method6722(i_594_, i_593_, 65280));
									int i_600_ = (class390.method6722(i_594_ + 1, i_593_, 65280) - class390_598_.method6722((i_594_ + 1), i_593_, 65280));
									int i_601_ = (class390.method6722(i_594_ + 1, 1 + i_593_, 65280) - class390_598_.method6722((i_594_ + 1), (i_593_ + 1), 65280));
									int i_602_ = (class390.method6722(i_594_, 1 + i_593_, 65280) - (class390_598_.method6722(i_594_, 1 + i_593_, 65280)));
									class390_598_.UA(class282_sub50_sub17, i_595_, ((i_602_ + (i_601_ + (i_600_ + i_599_))) / 4), i_596_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public void method3527(int i, int i_603_, int i_604_, int i_605_, Class521_Sub1_Sub2 class521_sub1_sub2) {
		Class293 class293 = method3459(i, i_603_, i_604_, -464174953);
		if (class293 != null) {
			class521_sub1_sub2.method11171(new Vector3((float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_603_ << anInt2592 * -1928575293)), (float) i_605_, (float) ((((SceneObjectManager) this).anInt2594 * -1428980483) + (i_604_ << anInt2592 * -1928575293))));
			((Class293) class293).aClass521_Sub1_Sub2_3506 = class521_sub1_sub2;
			int i_606_ = aClass390Array2614 == aClass390Array2591 ? 1 : 0;
			if (class521_sub1_sub2.method12986(-1273057709)) {
				if (class521_sub1_sub2.method12987(-778978085)) {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2633[i_606_];
					((SceneObjectManager) this).aClass521_Sub1Array2633[i_606_] = class521_sub1_sub2;
				} else {
					((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2605[i_606_];
					((SceneObjectManager) this).aClass521_Sub1Array2605[i_606_] = class521_sub1_sub2;
				}
			} else {
				((Class521_Sub1_Sub2) class521_sub1_sub2).aClass521_Sub1_7966 = ((SceneObjectManager) this).aClass521_Sub1Array2649[i_606_];
				((SceneObjectManager) this).aClass521_Sub1Array2649[i_606_] = class521_sub1_sub2;
			}
		}
	}

	void method3528(Class521_Sub1[] class521_sub1s, int i, int i_607_) {
		if (i < i_607_) {
			int i_608_ = (i_607_ + i) / 2;
			int i_609_ = i;
			Class521_Sub1 class521_sub1 = class521_sub1s[i_608_];
			class521_sub1s[i_608_] = class521_sub1s[i_607_];
			class521_sub1s[i_607_] = class521_sub1;
			int i_610_ = ((Class521_Sub1) class521_sub1).anInt7969 * 1272394495;
			for (int i_611_ = i; i_611_ < i_607_; i_611_++) {
				if ((((Class521_Sub1) class521_sub1s[i_611_]).anInt7969 * 1272394495) > i_610_ + (i_611_ & 0x1)) {
					Class521_Sub1 class521_sub1_612_ = class521_sub1s[i_611_];
					class521_sub1s[i_611_] = class521_sub1s[i_609_];
					class521_sub1s[i_609_++] = class521_sub1_612_;
				}
			}
			class521_sub1s[i_607_] = class521_sub1s[i_609_];
			class521_sub1s[i_609_] = class521_sub1;
			method3502(class521_sub1s, i, i_609_ - 1);
			method3502(class521_sub1s, 1 + i_609_, i_607_);
		}
	}

	boolean method3529(Class521_Sub1 class521_sub1, boolean bool, byte[][][] is, int i, byte i_613_) {
		if (!((SceneObjectManager) this).aBool2599)
			return false;
		if (class521_sub1 instanceof Class521_Sub1_Sub1) {
			int i_614_ = ((Class521_Sub1_Sub1) class521_sub1).localX;
			int i_615_ = ((Class521_Sub1_Sub1) class521_sub1).localY;
			int i_616_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9458;
			int i_617_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9456;
			for (int i_618_ = i_616_; i_618_ <= i_614_; i_618_++) {
				for (int i_619_ = i_617_; i_619_ <= i_615_; i_619_++) {
					if (class521_sub1.aByte7968 < -1485737447 * anInt2601 && i_618_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_618_ < ((SceneObjectManager) this).anInt2638 * 170184033 && i_619_ >= ((SceneObjectManager) this).anInt2621 * -1955723827 && i_619_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
						if ((null != is && class521_sub1.plane >= i && i_613_ == (is[class521_sub1.plane][i_618_][i_619_])) || !class521_sub1.method13029((byte) -41) || class521_sub1.method13037((((SceneObjectManager) this).aClass505_2596), -1315565077)) {
							if (!bool && i_618_ >= -527863643 * (((SceneObjectManager) this).anInt2628) - 16 && i_618_ <= 16 + -527863643 * ((SceneObjectManager) this).anInt2628 && i_619_ >= 1580412859 * (((SceneObjectManager) this).anInt2629) - 16 && i_619_ <= 16 + (((SceneObjectManager) this).anInt2629 * 1580412859))
								class521_sub1.method12991((((SceneObjectManager) this).aClass505_2596), -219071901);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		int i_620_ = (int) class385.x >> -1928575293 * anInt2592;
		int i_621_ = (int) class385.z >> -1928575293 * anInt2592;
		if (class521_sub1.aByte7968 < anInt2601 * -1485737447 && i_620_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_620_ < 170184033 * ((SceneObjectManager) this).anInt2638 && i_621_ >= -1955723827 * ((SceneObjectManager) this).anInt2621 && i_621_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
			if ((null != is && class521_sub1.plane >= i && is[class521_sub1.plane][i_620_][i_621_] == i_613_) || !class521_sub1.method13029((byte) -14) || class521_sub1.method13037(((SceneObjectManager) this).aClass505_2596, -200390961)) {
				if (!bool && i_620_ >= -527863643 * ((SceneObjectManager) this).anInt2628 - 16 && i_620_ <= -527863643 * ((SceneObjectManager) this).anInt2628 + 16 && i_621_ >= ((SceneObjectManager) this).anInt2629 * 1580412859 - 16 && i_621_ <= 16 + ((SceneObjectManager) this).anInt2629 * 1580412859)
					class521_sub1.method12991(((SceneObjectManager) this).aClass505_2596, -179855139);
				return true;
			}
			return false;
		}
		return true;
	}

	public Class521_Sub1_Sub1 method3530(int i, int i_622_, int i_623_, Interface25 interface25, int i_624_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_622_][i_623_];
		if (class293 == null)
			return null;
		for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
			if ((interface25 == null || interface25.method183(class521_sub1_sub1, 1956908464)) && class521_sub1_sub1.aShort9458 == i_622_ && class521_sub1_sub1.aShort9456 == i_623_) {
				method3407(class521_sub1_sub1, false, -1696604087);
				return class521_sub1_sub1;
			}
		}
		return null;
	}

	boolean method3531(Class521_Sub1 class521_sub1, boolean bool, byte[][][] is, int i, byte i_625_) {
		if (!((SceneObjectManager) this).aBool2599)
			return false;
		if (class521_sub1 instanceof Class521_Sub1_Sub1) {
			int i_626_ = ((Class521_Sub1_Sub1) class521_sub1).localX;
			int i_627_ = ((Class521_Sub1_Sub1) class521_sub1).localY;
			int i_628_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9458;
			int i_629_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9456;
			for (int i_630_ = i_628_; i_630_ <= i_626_; i_630_++) {
				for (int i_631_ = i_629_; i_631_ <= i_627_; i_631_++) {
					if (class521_sub1.aByte7968 < -1485737447 * anInt2601 && i_630_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_630_ < ((SceneObjectManager) this).anInt2638 * 170184033 && i_631_ >= ((SceneObjectManager) this).anInt2621 * -1955723827 && i_631_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
						if ((null != is && class521_sub1.plane >= i && i_625_ == (is[class521_sub1.plane][i_630_][i_631_])) || !class521_sub1.method13029((byte) -19) || class521_sub1.method13037((((SceneObjectManager) this).aClass505_2596), 146381757)) {
							if (!bool && i_630_ >= -527863643 * (((SceneObjectManager) this).anInt2628) - 16 && i_630_ <= 16 + -527863643 * ((SceneObjectManager) this).anInt2628 && i_631_ >= 1580412859 * (((SceneObjectManager) this).anInt2629) - 16 && i_631_ <= 16 + (((SceneObjectManager) this).anInt2629 * 1580412859))
								class521_sub1.method12991((((SceneObjectManager) this).aClass505_2596), -1631650110);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Vector3 class385 = class521_sub1.method11166().aClass385_3595;
		int i_632_ = (int) class385.x >> -1928575293 * anInt2592;
		int i_633_ = (int) class385.z >> -1928575293 * anInt2592;
		if (class521_sub1.aByte7968 < anInt2601 * -1485737447 && i_632_ >= ((SceneObjectManager) this).anInt2637 * 260560053 && i_632_ < 170184033 * ((SceneObjectManager) this).anInt2638 && i_633_ >= -1955723827 * ((SceneObjectManager) this).anInt2621 && i_633_ < ((SceneObjectManager) this).anInt2640 * -887086501) {
			if ((null != is && class521_sub1.plane >= i && is[class521_sub1.plane][i_632_][i_633_] == i_625_) || !class521_sub1.method13029((byte) -122) || class521_sub1.method13037(((SceneObjectManager) this).aClass505_2596, 363865494)) {
				if (!bool && i_632_ >= -527863643 * ((SceneObjectManager) this).anInt2628 - 16 && i_632_ <= -527863643 * ((SceneObjectManager) this).anInt2628 + 16 && i_633_ >= ((SceneObjectManager) this).anInt2629 * 1580412859 - 16 && i_633_ <= 16 + ((SceneObjectManager) this).anInt2629 * 1580412859)
					class521_sub1.method12991(((SceneObjectManager) this).aClass505_2596, -646183533);
				return true;
			}
			return false;
		}
		return true;
	}

	void method3532(Class521_Sub1 class521_sub1, Class282_Sub24[] class282_sub24s) {
		if (((SceneObjectManager) this).aBool2598) {
			int i = class521_sub1.method13036(class282_sub24s, -827011094);
			((SceneObjectManager) this).aClass505_2596.method8547(i, class282_sub24s);
		}
		if (aClass390Array2614 == aClass390Array2591) {
			boolean bool = false;
			boolean bool_634_ = false;
			Vector3 class385 = class521_sub1.method11166().aClass385_3595;
			int i;
			int i_635_;
			if (class521_sub1 instanceof Class521_Sub1_Sub1) {
				i = ((Class521_Sub1_Sub1) class521_sub1).aShort9458;
				i_635_ = ((Class521_Sub1_Sub1) class521_sub1).aShort9456;
			} else {
				i = (int) class385.x >> anInt2592 * -1928575293;
				i_635_ = (int) class385.z >> -1928575293 * anInt2592;
			}
			Class90 class90 = new Class90();
			class90.anInt946 = method3387(i, i_635_, (byte) 120) * -1856397433;
			class90.anInt945 = method3386(i, i_635_, 1809562470) * 873459953;
			class90.anInt947 = method3538(i, i_635_, -575094789) * -96197041;
			class90.anInt949 = method3432(i, i_635_, (byte) 1) * -1472617411;
			class90.anInt950 = method3464(i, i_635_, -1198981558) * 1801644261;
			class90.anInt951 = method3391(i, i_635_, 1883274655) * 1412616155;
			((SceneObjectManager) this).aClass505_2596.method8476(aClass390Array2607[0].method6709((int) class385.x, (int) class385.z, 1928410404), class90);
		}
		Class285 class285 = class521_sub1.method12990(((SceneObjectManager) this).aClass505_2596, 245300010);
		if (null != class285) {
			if (((Class285) class285).aBool3392) {
				class285.aClass521_Sub1_3391 = class521_sub1;
				aClass284_2648.method5013(class285, 414101686);
			} else
				Class279.method4969(class285, 1362412061);
		}
	}

	void method3533(Class521_Sub1 class521_sub1, int i, int i_636_, int i_637_, int i_638_, int i_639_) {
		boolean bool = true;
		int i_640_ = i_636_;
		int i_641_ = i_636_ + i_638_;
		int i_642_ = i_637_ - 1;
		int i_643_ = i_639_ + i_637_;
		for (int i_644_ = i; i_644_ <= 1 + i; i_644_++) {
			if (-1485737447 * anInt2601 != i_644_) {
				for (int i_645_ = i_640_; i_645_ <= i_641_; i_645_++) {
					if (i_645_ >= 0 && i_645_ < -1912960305 * anInt2617) {
						for (int i_646_ = i_642_; i_646_ <= i_643_; i_646_++) {
							if (i_646_ >= 0 && i_646_ < anInt2603 * -18177099 && (!bool || i_645_ >= i_641_ || i_646_ >= i_643_ || i_646_ < i_637_ && i_645_ != i_636_)) {
								Class293 class293 = (aClass293ArrayArrayArray2604[i_644_][i_645_][i_646_]);
								if (class293 != null) {
									int i_647_ = (((aClass390Array2591[i_644_].method6722(i_645_, i_646_, 65280)) + (aClass390Array2591[i_644_].method6722(1 + i_645_, i_646_, 65280)) + (aClass390Array2591[i_644_].method6722(i_645_, 1 + i_646_, 65280)) + (aClass390Array2591[i_644_].method6722(1 + i_645_, 1 + i_646_, 65280))) / 4
											- ((aClass390Array2591[i].method6722(i_636_, i_637_, 65280)) + (aClass390Array2591[i].method6722(i_636_ + 1, i_637_, 65280)) + (aClass390Array2591[i].method6722(i_636_, i_637_ + 1, 65280)) + (aClass390Array2591[i].method6722(i_636_ + 1, i_637_ + 1, 65280))) / 4);
									Class521_Sub1_Sub5 class521_sub1_sub5 = class293.aClass521_Sub1_Sub5_3505;
									Class521_Sub1_Sub5 class521_sub1_sub5_648_ = class293.aClass521_Sub1_Sub5_3502;
									if (null != class521_sub1_sub5 && class521_sub1_sub5.method12985(-802427616))
										class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5, ((((SceneObjectManager) this).anInt2594 * -1428980483 * (1 - i_638_)) + ((i_645_ - i_636_) * (1885735347 * (((SceneObjectManager) this).anInt2593)))), i_647_, (((1 - i_639_) * (-1428980483 * (((SceneObjectManager) this).anInt2594))) + ((i_646_ - i_637_) * (((SceneObjectManager) this).anInt2593 * 1885735347))), bool, -2045662067);
									if (null != class521_sub1_sub5_648_ && class521_sub1_sub5_648_.method12985(-1708136985))
										class521_sub1.method13013(((SceneObjectManager) this).aClass505_2596, class521_sub1_sub5_648_, (((i_645_ - i_636_) * (1885735347 * (((SceneObjectManager) this).anInt2593))) + (-1428980483 * ((SceneObjectManager) this).anInt2594 * (1 - i_638_))), i_647_, (((i_646_ - i_637_) * (1885735347 * (((SceneObjectManager) this).anInt2593))) + ((1 - i_639_) * (((SceneObjectManager) this).anInt2594 * -1428980483))), bool, -1804279827);
									for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
										Class521_Sub1_Sub1 class521_sub1_sub1 = (class208.aClass521_Sub1_Sub1_2659);
										if (class521_sub1_sub1 != null && class521_sub1_sub1.method12985(-1040604428) && ((class521_sub1_sub1.aShort9458 == i_645_) || i_640_ == i_645_) && ((class521_sub1_sub1.aShort9456 == i_646_) || i_642_ == i_646_)) {
											int i_649_ = ((class521_sub1_sub1.localX) - (class521_sub1_sub1.aShort9458) + 1);
											int i_650_ = 1 + ((class521_sub1_sub1.localY) - (class521_sub1_sub1.aShort9456));
											class521_sub1.method13013((((SceneObjectManager) this).aClass505_2596), class521_sub1_sub1, ((1885735347 * (((SceneObjectManager) this).anInt2593) * ((class521_sub1_sub1.aShort9458) - i_636_)) + ((((SceneObjectManager) this).anInt2594) * -1428980483 * (i_649_ - i_638_))), i_647_, (((i_650_ - i_639_) * ((((SceneObjectManager) this).anInt2594) * -1428980483)) + (((class521_sub1_sub1.aShort9456) - i_637_) * ((((SceneObjectManager) this).anInt2593) * 1885735347))), bool, -1886773619);
										}
									}
								}
							}
						}
					}
				}
				i_640_--;
				bool = false;
			}
		}
	}

	public int method3534(int i, int i_651_) {
		return (((SceneObjectManager) this).aByteArrayArray2612 != null ? ((SceneObjectManager) this).aByteArrayArray2612[i][i_651_] & 0xff : 0);
	}

	public void method3535(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_652_, int i_653_, boolean[] bools) {
		if (aClass390Array2614 != aClass390Array2591) {
			int i_654_ = aClass390Array2607[i].method6709(i_652_, i_653_, 1544650321);
			for (int i_655_ = 0; i_655_ <= i; i_655_++) {
				if (null == bools || bools[i_655_]) {
					Class390 class390 = aClass390Array2607[i_655_];
					if (null != class390)
						class390.NA(class282_sub50_sub17, i_652_, i_654_ - class390.method6709(i_652_, i_653_, 235359216), i_653_, 0, false);
				}
			}
		}
	}

	public void method3536(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_656_, int i_657_, boolean[] bools) {
		if (aClass390Array2614 != aClass390Array2591) {
			int i_658_ = aClass390Array2607[i].method6709(i_656_, i_657_, -1572548729);
			for (int i_659_ = 0; i_659_ <= i; i_659_++) {
				if (null == bools || bools[i_659_]) {
					Class390 class390 = aClass390Array2607[i_659_];
					if (null != class390)
						class390.NA(class282_sub50_sub17, i_656_, i_658_ - class390.method6709(i_656_, i_657_, 1663062885), i_657_, 0, false);
				}
			}
		}
	}

	void method3537(int i, int i_660_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_661_ = i; i_661_ < i_660_; i_661_++) {
			Class390 class390 = aClass390Array2607[i_661_];
			if (class390 != null) {
				for (int i_662_ = 0; i_662_ < anInt2603 * -18177099; i_662_++) {
					for (int i_663_ = 0; i_663_ < -1912960305 * anInt2617; i_663_++) {
						class282_sub50_sub17 = class390.w(i_663_, i_662_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_664_ = i_663_ << -1928575293 * anInt2592;
							int i_665_ = i_662_ << anInt2592 * -1928575293;
							for (int i_666_ = i_661_ - 1; i_666_ >= 0; i_666_--) {
								Class390 class390_667_ = aClass390Array2607[i_666_];
								if (null != class390_667_) {
									int i_668_ = (class390.method6722(i_663_, i_662_, 65280) - class390_667_.method6722(i_663_, i_662_, 65280));
									int i_669_ = (class390.method6722(i_663_ + 1, i_662_, 65280) - class390_667_.method6722((i_663_ + 1), i_662_, 65280));
									int i_670_ = (class390.method6722(i_663_ + 1, 1 + i_662_, 65280) - class390_667_.method6722((i_663_ + 1), (i_662_ + 1), 65280));
									int i_671_ = (class390.method6722(i_663_, 1 + i_662_, 65280) - (class390_667_.method6722(i_663_, 1 + i_662_, 65280)));
									class390_667_.UA(class282_sub50_sub17, i_664_, ((i_671_ + (i_670_ + (i_669_ + i_668_))) / 4), i_665_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public int method3538(int i, int i_672_, int i_673_) {
		return (((SceneObjectManager) this).aByteArrayArray2612 != null ? ((SceneObjectManager) this).aByteArrayArray2612[i][i_672_] & 0xff : 0);
	}

	public Class521_Sub1_Sub1 method3539(int i, int i_674_, int i_675_, Interface25 interface25) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_674_][i_675_];
		if (class293 == null)
			return null;
		for (Class208 class208 = class293.aClass208_3504; null != class208; class208 = class208.aClass208_2660) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
			if ((interface25 == null || interface25.method183(class521_sub1_sub1, 1956908464)) && class521_sub1_sub1.aShort9458 == i_674_ && class521_sub1_sub1.aShort9456 == i_675_) {
				method3407(class521_sub1_sub1, false, -1696604087);
				return class521_sub1_sub1;
			}
		}
		return null;
	}

	void method3540(int i, int i_676_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_677_ = i; i_677_ < i_676_; i_677_++) {
			Class390 class390 = aClass390Array2607[i_677_];
			if (class390 != null) {
				for (int i_678_ = 0; i_678_ < anInt2603 * -18177099; i_678_++) {
					for (int i_679_ = 0; i_679_ < -1912960305 * anInt2617; i_679_++) {
						class282_sub50_sub17 = class390.w(i_679_, i_678_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_680_ = i_679_ << -1928575293 * anInt2592;
							int i_681_ = i_678_ << anInt2592 * -1928575293;
							for (int i_682_ = i_677_ - 1; i_682_ >= 0; i_682_--) {
								Class390 class390_683_ = aClass390Array2607[i_682_];
								if (null != class390_683_) {
									int i_684_ = (class390.method6722(i_679_, i_678_, 65280) - class390_683_.method6722(i_679_, i_678_, 65280));
									int i_685_ = (class390.method6722(i_679_ + 1, i_678_, 65280) - class390_683_.method6722((i_679_ + 1), i_678_, 65280));
									int i_686_ = (class390.method6722(i_679_ + 1, 1 + i_678_, 65280) - class390_683_.method6722((i_679_ + 1), (i_678_ + 1), 65280));
									int i_687_ = (class390.method6722(i_679_, 1 + i_678_, 65280) - (class390_683_.method6722(i_679_, 1 + i_678_, 65280)));
									class390_683_.UA(class282_sub50_sub17, i_680_, ((i_687_ + (i_686_ + (i_685_ + i_684_))) / 4), i_681_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public Class521_Sub1_Sub4 method3541(int i, int i_688_, int i_689_) {
		Class293 class293 = aClass293ArrayArrayArray2604[i][i_688_][i_689_];
		if (class293 == null)
			return null;
		return class293.aClass521_Sub1_Sub4_3503;
	}

	void method3542(int i, int i_690_) {
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		for (int i_691_ = i; i_691_ < i_690_; i_691_++) {
			Class390 class390 = aClass390Array2607[i_691_];
			if (class390 != null) {
				for (int i_692_ = 0; i_692_ < anInt2603 * -18177099; i_692_++) {
					for (int i_693_ = 0; i_693_ < -1912960305 * anInt2617; i_693_++) {
						class282_sub50_sub17 = class390.w(i_693_, i_692_, class282_sub50_sub17);
						if (null != class282_sub50_sub17) {
							int i_694_ = i_693_ << -1928575293 * anInt2592;
							int i_695_ = i_692_ << anInt2592 * -1928575293;
							for (int i_696_ = i_691_ - 1; i_696_ >= 0; i_696_--) {
								Class390 class390_697_ = aClass390Array2607[i_696_];
								if (null != class390_697_) {
									int i_698_ = (class390.method6722(i_693_, i_692_, 65280) - class390_697_.method6722(i_693_, i_692_, 65280));
									int i_699_ = (class390.method6722(i_693_ + 1, i_692_, 65280) - class390_697_.method6722((i_693_ + 1), i_692_, 65280));
									int i_700_ = (class390.method6722(i_693_ + 1, 1 + i_692_, 65280) - class390_697_.method6722((i_693_ + 1), (i_692_ + 1), 65280));
									int i_701_ = (class390.method6722(i_693_, 1 + i_692_, 65280) - (class390_697_.method6722(i_693_, 1 + i_692_, 65280)));
									class390_697_.UA(class282_sub50_sub17, i_694_, ((i_701_ + (i_700_ + (i_699_ + i_698_))) / 4), i_695_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public void method3543() {
		method3486(1, anInt2601 * -1485737447, 1563160205);
	}

	public void method3544() {
		method3486(1, anInt2601 * -1485737447, 1563160205);
	}

	static Class215 method3545(RsByteBuffer class282_sub35, int i) {
		int i_702_ = class282_sub35.readUnsignedByte();
		int i_703_ = class282_sub35.readUnsignedByte();
		int i_704_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_704_];
		for (int i_705_ = 0; i_705_ < i_704_; i_705_++)
			is[i_705_] = class282_sub35.readUnsignedByte();
		return new Class215(i_702_, i_703_, is);
	}

	static final void method3546(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		XLogin.method5017(class118, class98, class527, -974856399);
	}

	static final void method3547(CS2Executor class527, int i) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_706_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		int i_707_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = string.indexOf(string_706_, i_707_);
	}
}
