/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class158 {
	public abstract int method2714();

	abstract boolean method2715();

	public abstract int method2716();

	public abstract void method212();

	abstract boolean method2717();

	abstract boolean method2718();

	public abstract int method2719();

	public abstract int method2720();

	public abstract int method2721();

	abstract boolean method211();

	abstract boolean method2722();

	abstract boolean method2723();

	Class158() {
		/* empty */
	}

	abstract boolean method213();

	abstract boolean method2724();

	abstract boolean method2725();

	public abstract int method2726();

	public abstract void method186();

	public abstract int method2727();

	abstract boolean method54();

	static final void method2728(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_0_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_1_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_1_, (byte) 0);
		if (class437.method7319(2069262708))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_0_, 156724259).method7101(i_1_, class437.aString5335, -1662195407);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_0_, 221320768).method7099(i_1_, class437.anInt5337 * -1741480635, -1410109564));
	}

	static final void method2729(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i_2_, (short) 9738).anInt10277) * 875957203;
	}

	public static int method2730(short i) {
		if (Class475.aBool5623 && client.aFrame3260 != null)
			return 3;
		return client.aBool7301 ? 2 : 1;
	}

	static void method2731(GraphicalRenderer class505, Class455 class455, Class118 class118, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_6_, 2092552415);
		if (class220 != null && class220.aBool2729 && class220.method3719(Class158_Sub1.aClass3_8507, -1138810540)) {
			if (null != class220.anIntArray2717) {
				int[] is = new int[class220.anIntArray2717.length];
				for (int i_8_ = 0; i_8_ < is.length / 2; i_8_++) {
					int i_9_;
					if (-672443707 * Class262.anInt3240 == 4)
						i_9_ = (int) client.aFloat7365 & 0x3fff;
					else
						i_9_ = (client.anInt7255 * -1790074477 + (int) client.aFloat7365) & 0x3fff;
					int i_10_ = Class382.anIntArray4657[i_9_];
					int i_11_ = Class382.anIntArray4661[i_9_];
					if (4 != -672443707 * Class262.anInt3240) {
						i_10_ = i_10_ * 256 / (client.anInt7203 * -1864403271 + 256);
						i_11_ = 256 * i_11_ / (-1864403271 * client.anInt7203 + 256);
					}
					is[i_8_ * 2] = ((i_10_ * (i_5_ + 4 * (class220.anIntArray2717[2 * i_8_ + 1])) + ((i_4_ + 4 * class220.anIntArray2717[i_8_ * 2]) * i_11_)) >> 14) + (1506818197 * class118.anInt1301 / 2 + i);
					is[i_8_ * 2 + 1] = (-492594917 * class118.anInt1429 / 2 + i_3_ - ((((i_5_ + 4 * class220.anIntArray2717[1 + i_8_ * 2]) * i_11_) - ((i_4_ + 4 * class220.anIntArray2717[i_8_ * 2]) * i_10_)) >> 14));
				}
				Class119 class119 = class118.method2046(class505, -907269302);
				if (null != class119)
					Class147.method2505(class505, is, class220.anInt2715 * 152819427, class119.anIntArray1457, class119.anIntArray1455);
				if (-1216326857 * class220.anInt2748 > 0) {
					for (int i_12_ = 0; i_12_ < is.length / 2 - 1; i_12_++) {
						int i_13_ = is[i_12_ * 2];
						int i_14_ = is[i_12_ * 2 + 1];
						int i_15_ = is[2 * (i_12_ + 1)];
						int i_16_ = is[1 + 2 * (i_12_ + 1)];
						if (i_15_ < i_13_) {
							int i_17_ = i_13_;
							int i_18_ = i_14_;
							i_13_ = i_15_;
							i_14_ = i_16_;
							i_15_ = i_17_;
							i_16_ = i_18_;
						} else if (i_13_ == i_15_ && i_16_ < i_14_) {
							int i_19_ = i_14_;
							i_14_ = i_16_;
							i_16_ = i_19_;
						}
						class505.method8563(i_13_, i_14_, i_15_, i_16_, (class220.anIntArray2738[(class220.aByteArray2754[i_12_] & 0xff)]), 1, class455, i, i_3_, -1216326857 * class220.anInt2748, 1940337227 * class220.anInt2749, -155138445 * class220.anInt2756);
					}
					int i_20_ = is[is.length - 2];
					int i_21_ = is[is.length - 1];
					int i_22_ = is[0];
					int i_23_ = is[1];
					if (i_22_ < i_20_) {
						int i_24_ = i_20_;
						int i_25_ = i_21_;
						i_20_ = i_22_;
						i_21_ = i_23_;
						i_22_ = i_24_;
						i_23_ = i_25_;
					} else if (i_22_ == i_20_ && i_23_ < i_21_) {
						int i_26_ = i_21_;
						i_21_ = i_23_;
						i_23_ = i_26_;
					}
					class505.method8563(i_20_, i_21_, i_22_, i_23_, (class220.anIntArray2738[(class220.aByteArray2754[(class220.aByteArray2754.length - 1)]) & 0xff]), 1, class455, i, i_3_, -1216326857 * class220.anInt2748, 1940337227 * class220.anInt2749, class220.anInt2756 * -155138445);
				} else {
					for (int i_27_ = 0; i_27_ < is.length / 2 - 1; i_27_++)
						class505.method8669(is[2 * i_27_], is[1 + i_27_ * 2], is[(i_27_ + 1) * 2], is[1 + (i_27_ + 1) * 2], (class220.anIntArray2738[(class220.aByteArray2754[i_27_] & 0xff)]), 1, class455, i, i_3_);
					class505.method8669(is[is.length - 2], is[is.length - 1], is[0], is[1], (class220.anIntArray2738[(class220.aByteArray2754[(class220.aByteArray2754.length - 1)]) & 0xff]), 1, class455, i, i_3_);
				}
			}
			NativeSprite sprites = null;
			if (-1 != class220.anInt2719 * -1248709255) {
				sprites = class220.renderIcons(class505, false, (byte) 8);
				if (sprites != null)
					Class190.method3149(class118, class455, i, i_3_, i_4_, i_5_, sprites, -1909602202);
			}
			if (null != class220.areaName) {
				int i_28_ = 0;
				if (sprites != null)
					i_28_ = sprites.method2793();
				FontRenderer fontRenderer = Renderers.FONT_RENDERER;
				Class414 class414 = Class282_Sub17_Sub2.aClass414_9933;
				if (1 == class220.anInt2722 * 1172439539) {
					fontRenderer = Class16.aClass8_144;
					class414 = Class16.aClass414_139;
				}
				if (class220.anInt2722 * 1172439539 == 2) {
					fontRenderer = Class285.aClass8_3394;
					class414 = Class288.aClass414_3438;
				}
				Class241.method4152(class118, class455, i, i_3_, i_4_, i_5_, i_28_, class220.areaName, fontRenderer, class414, class220.anInt2720 * -2116785903, -1590332940);
			}
		}
	}

	static final void method2732(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (!string.equals(class118.aString1391)) {
			class118.aString1391 = string;
			Class109.method1858(class118, (byte) 79);
		}
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Class211.method3631(class118.anInt1287 * -1952846363, -1844455774);
	}
}
