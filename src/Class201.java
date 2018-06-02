/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class201 {
	static final int anInt2541 = 10;
	boolean aBool2542;
	int anInt2543;
	static final float aFloat2544 = 3.0F;
	int anInt2545;
	SceneObjectManager aClass206_2546;
	Class205 aClass205_2547;
	boolean aBool2548;
	int anInt2549;
	int[] anIntArray2550;
	int[][][] anIntArrayArrayArray2551;
	public boolean aBool2552 = true;
	Class231[] aClass231Array2553;
	float[] aFloatArray2554;
	Class231[] aClass231Array2555;
	int anInt2556;
	Class231[] aClass231Array2557;
	static final int anInt2558 = 102;
	Class231[] aClass231Array2559;
	int[] anIntArray2560;
	int[] anIntArray2561;
	int[] anIntArray2562;
	int anInt2563;
	int anInt2564;
	int[] anIntArray2565;
	static GraphicalRenderer aClass505_2566;
	int anInt2567;
	int[] anIntArray2568;
	int[] anIntArray2569;
	int anInt2570;
	boolean aBool2571;

	boolean method3261(int i, int i_0_, int i_1_, int i_2_, int i_3_, Class200 class200) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (i_0_ == i_1_ && i_2_ == i_3_) {
			if (!method3271(i, i_0_, i_2_))
				return false;
			if (method3299(class200))
				return true;
			return false;
		}
		for (int i_4_ = i_0_; i_4_ <= i_1_; i_4_++) {
			for (int i_5_ = i_2_; i_5_ <= i_3_; i_5_++) {
				if (((Class201) this).anIntArrayArrayArray2551[i][i_4_][i_5_] == -((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609) * -3958433))
					return false;
			}
		}
		if (!method3299(class200))
			return false;
		return true;
	}

	public void method3262(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_11_ = i_7_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293);
				int i_12_ = i_11_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_13_ = i_8_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293);
				int i_14_ = i_13_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_15_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_6_].method6722(i_7_, i_8_, 65280);
				int i_16_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_6_].method6722(i_7_ + 1, i_8_ + 1, 65280);
				((Class201) this).aClass231Array2557[((Class201) this).anInt2556++] = new Class231(((Class201) this).aClass206_2546, i, i_6_, i_11_, i_12_, i_12_, i_11_, i_15_, i_16_, i_16_ - i_9_, i_15_ - i_9_, i_13_, i_14_, i_14_, i_13_);
			} else {
				int i_17_ = ((i_7_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293)) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347);
				int i_18_ = i_17_ - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_19_ = i_8_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293);
				int i_20_ = i_19_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_21_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_6_].method6722(i_7_ + 1, i_8_, 65280);
				int i_22_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_6_].method6722(i_7_, i_8_ + 1, 65280);
				((Class201) this).aClass231Array2557[((Class201) this).anInt2556++] = new Class231(((Class201) this).aClass206_2546, i, i_6_, i_17_, i_18_, i_18_, i_17_, i_21_, i_22_, i_22_ - i_9_, i_21_ - i_9_, i_19_, i_20_, i_20_, i_19_);
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_6_][i_7_][i_8_]);
			if (class293 == null)
				((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_6_][i_7_][i_8_] = class293 = new Class293(i_6_);
			if (i == 1) {
				((Class293) class293).aShort3508 = (short) i_9_;
				((Class293) class293).aShort3501 = (short) i_10_;
			} else if (i == 2) {
				((Class293) class293).aShort3510 = (short) i_9_;
				((Class293) class293).aShort3511 = (short) i_10_;
			}
			if (((Class201) this).aBool2548)
				method3309();
		}
	}

	public void method3263(int i, int i_23_, int i_24_, int i_25_) {
		if (i == 8 || i == 16) {
			for (int i_26_ = 0; i_26_ < ((Class201) this).anInt2556; i_26_++) {
				Class231 class231 = ((Class201) this).aClass231Array2557[i_26_];
				if (((Class231) class231).aByte2863 == i && ((Class231) class231).aByte2865 == i_23_ && ((((Class231) class231).aShort2866 == i_24_ && ((Class231) class231).aShort2868 == i_25_) || (((Class231) class231).aShort2867 == i_24_ && ((Class231) class231).aShort2869 == i_25_))) {
					if (i_26_ != ((Class201) this).anInt2556)
						System.arraycopy(((Class201) this).aClass231Array2557, i_26_ + 1, ((Class201) this).aClass231Array2557, i_26_, ((((Class201) this).aClass231Array2557).length - (i_26_ + 1)));
					((Class201) this).anInt2556--;
					break;
				}
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_23_][i_24_][i_25_]);
			if (class293 != null) {
				if (i == 1)
					((Class293) class293).aShort3508 = (short) 0;
				else if (i == 2)
					((Class293) class293).aShort3510 = (short) 0;
			}
			method3309();
		}
	}

	public void method3264() {
		method3309();
	}

	void method3265(GraphicalRenderer class505, int i) {
		aClass505_2566 = class505;
		if (!aBool2552 || !((Class201) this).aBool2542)
			((Class201) this).anInt2564 = 0;
		else {
			if (((Class201) this).aBool2571)
				((SceneObjectManager) ((Class201) this).aClass206_2546).aClass454_2597.method7548((byte) -54);
			aClass505_2566.method8408(((Class201) this).anIntArray2550);
			if ((((Class201) this).anInt2543 != (int) ((float) ((Class201) this).anIntArray2550[0] / 3.0F)) || (((Class201) this).anInt2570 != (int) ((float) ((Class201) this).anIntArray2550[1] / 3.0F))) {
				((Class201) this).anInt2543 = (int) ((float) ((Class201) this).anIntArray2550[0] / 3.0F);
				((Class201) this).anInt2570 = (int) ((float) ((Class201) this).anIntArray2550[1] / 3.0F);
				((Class201) this).anIntArray2565 = new int[(((Class201) this).anInt2543 * ((Class201) this).anInt2570)];
			}
			((Class201) this).anInt2564 = 0;
			for (int i_27_ = 0; i_27_ < ((Class201) this).anInt2567; i_27_++)
				method3281(aClass505_2566, ((Class201) this).aClass231Array2553[i_27_], i);
			for (int i_28_ = 0; i_28_ < ((Class201) this).anInt2545; i_28_++)
				method3281(aClass505_2566, ((Class201) this).aClass231Array2555[i_28_], i);
			for (int i_29_ = 0; i_29_ < ((Class201) this).anInt2556; i_29_++)
				method3281(aClass505_2566, ((Class201) this).aClass231Array2557[i_29_], i);
			((Class205) ((Class201) this).aClass205_2547).anInt2588 = 0;
			if (((Class201) this).anInt2564 > 0) {
				int i_30_ = ((Class201) this).anIntArray2565.length;
				int i_31_ = i_30_ - i_30_ & 0x7;
				int i_32_ = 0;
				while (i_32_ < i_31_) {
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
				}
				while (i_32_ < i_30_)
					((Class201) this).anIntArray2565[i_32_++] = 2147483647;
				((Class205) ((Class201) this).aClass205_2547).anInt2587 = 1;
				for (int i_33_ = 0; i_33_ < ((Class201) this).anInt2564; i_33_++) {
					Class231 class231 = ((Class201) this).aClass231Array2559[i_33_];
					((Class201) this).aClass205_2547.method3371(((Class231) class231).aShortArray2862[0], ((Class231) class231).aShortArray2862[1], ((Class231) class231).aShortArray2862[3], ((Class231) class231).aShortArray2873[0], ((Class231) class231).aShortArray2873[1], ((Class231) class231).aShortArray2873[3], ((Class231) class231).aShortArray2875[0], ((Class231) class231).aShortArray2875[1], ((Class231) class231).aShortArray2875[3]);
					((Class201) this).aClass205_2547.method3371(((Class231) class231).aShortArray2862[1], ((Class231) class231).aShortArray2862[2], ((Class231) class231).aShortArray2862[3], ((Class231) class231).aShortArray2873[1], ((Class231) class231).aShortArray2873[2], ((Class231) class231).aShortArray2873[3], ((Class231) class231).aShortArray2875[1], ((Class231) class231).aShortArray2875[2], ((Class231) class231).aShortArray2875[3]);
				}
				((Class205) ((Class201) this).aClass205_2547).anInt2587 = 2;
			}
			if (((Class201) this).aBool2571)
				((SceneObjectManager) ((Class201) this).aClass206_2546).aClass454_2597.method7548((byte) -68);
		}
	}

	public void method3266(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		((Class201) this).aClass231Array2553[((Class201) this).anInt2567++] = new Class231(((Class201) this).aClass206_2546, i, i_34_, i_35_, i_36_, i_36_, i_35_, i_39_, i_40_, i_40_, i_39_, i_37_, i_37_, i_38_, i_38_);
	}

	final boolean method3267(int i, int i_41_, int i_42_) {
		aClass505_2566.method8479((float) i, (float) i_41_, (float) i_42_, ((Class201) this).aFloatArray2554);
		if (((Class201) this).aFloatArray2554[2] < 50.0F)
			return false;
		((Class201) this).aFloatArray2554[0] /= 3.0F;
		((Class201) this).aFloatArray2554[1] /= 3.0F;
		return true;
	}

	boolean method3268(Class521_Sub1_Sub5 class521_sub1_sub5, int i, int i_43_, int i_44_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (!method3271(i, i_43_, i_44_))
			return false;
		int i_45_ = (i_43_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_46_ = (i_44_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_47_ = (((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_43_, i_44_, 65280) - 1);
		int i_48_ = i_47_ + class521_sub1_sub5.method12995(-95286416);
		if (class521_sub1_sub5.aShort9615 == 1) {
			if (!method3277(i_45_, i_47_, i_46_, i_45_, i_48_, i_46_, i_45_, i_48_, (i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347)))
				return false;
			if (!method3277(i_45_, i_47_, i_46_, i_45_, i_48_, (i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_45_, i_47_, (i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347)))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 2) {
			if (!method3277(i_45_, i_47_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_48_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_45_, i_48_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			if (!method3277(i_45_, i_47_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_47_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_48_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 4) {
			if (!method3277(i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_47_, i_46_, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_48_, i_46_, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_48_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			if (!method3277(i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_47_, i_46_, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_48_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_47_, i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 8) {
			if (!method3277(i_45_, i_47_, i_46_, (i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_48_, i_46_, i_45_, i_48_, i_46_))
				return false;
			if (!method3277(i_45_, i_47_, i_46_, (i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_47_, i_46_, (i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_48_, i_46_))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 16) {
			if (!method3276(i_45_, i_47_, (i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_48_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 32) {
			if (!method3276((i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), i_47_, (i_46_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_48_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 64) {
			if (!method3276((i_45_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), i_47_, i_46_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_48_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 128) {
			if (!method3276(i_45_, i_47_, i_46_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_48_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		return true;
	}

	boolean method3269(Class231 class231, int i) {
		if (!method3270(((Class231) class231).anIntArray2859[i], ((Class231) class231).anIntArray2871[i], ((Class231) class231).anIntArray2864[i]))
			return false;
		((Class231) class231).aShortArray2873[i] = (short) (int) ((Class201) this).aFloatArray2554[0];
		((Class231) class231).aShortArray2862[i] = (short) (int) ((Class201) this).aFloatArray2554[1];
		((Class231) class231).aShortArray2875[i] = (short) (int) ((Class201) this).aFloatArray2554[2];
		return true;
	}

	final boolean method3270(int i, int i_49_, int i_50_) {
		aClass505_2566.method8479((float) i, (float) i_49_, (float) i_50_, ((Class201) this).aFloatArray2554);
		if (((Class201) this).aFloatArray2554[2] < 50.0F)
			return false;
		((Class201) this).aFloatArray2554[0] /= 3.0F;
		((Class201) this).aFloatArray2554[1] /= 3.0F;
		return true;
	}

	boolean method3271(int i, int i_51_, int i_52_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		int i_53_ = ((Class201) this).anIntArrayArrayArray2551[i][i_51_][i_52_];
		if (i_53_ == -(((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433))
			return false;
		if (i_53_ == (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433))
			return true;
		if (((Class201) this).aClass206_2546.aClass390Array2591 == ((Class201) this).aClass206_2546.aClass390Array2614)
			return false;
		int i_54_ = (i_51_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_55_ = (i_52_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		if (method3277(i_54_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_51_, i_52_, 65280), i_55_ + 1, i_54_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_51_ + 1, i_52_ + 1, 65280), i_55_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1, i_54_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_51_, i_52_ + 1, 65280),
				i_55_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1)
				&& method3277(i_54_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_51_, i_52_, 65280), i_55_ + 1, (i_54_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1), ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_51_ + 1, i_52_, 65280), i_55_ + 1, (i_54_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1),
						((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_51_ + 1, i_52_ + 1, 65280), (i_55_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1))) {
			((Class201) this).anIntArrayArrayArray2551[i][i_51_][i_52_] = (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433);
			return true;
		}
		((Class201) this).anIntArrayArrayArray2551[i][i_51_][i_52_] = -(((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433);
		return false;
	}

	void method3272() {
		for (int i = 0; i < ((Class201) this).anInt2545; i++)
			((Class201) this).aClass231Array2555[i] = null;
		((Class201) this).anInt2545 = 0;
		for (int i = 0; i < ((Class201) this).aClass206_2546.anInt2601 * -1485737447; i++) {
			for (int i_56_ = 0; (i_56_ < ((Class201) this).aClass206_2546.anInt2617 * -1912960305); i_56_++) {
				for (int i_57_ = 0; i_57_ < (((Class201) this).aClass206_2546.anInt2603 * -18177099); i_57_++) {
					Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_57_][i_56_]);
					if (class293 != null) {
						if (((Class293) class293).aShort3508 > 0)
							((Class293) class293).aShort3508 *= -1;
						if (((Class293) class293).aShort3510 > 0)
							((Class293) class293).aShort3510 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < ((Class201) this).aClass206_2546.anInt2601 * -1485737447; i++) {
			for (int i_58_ = 0; (i_58_ < ((Class201) this).aClass206_2546.anInt2617 * -1912960305); i_58_++) {
				for (int i_59_ = 0; i_59_ < (((Class201) this).aClass206_2546.anInt2603 * -18177099); i_59_++) {
					Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_59_][i_58_]);
					if (class293 != null) {
						boolean bool = ((((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[0][i_59_][i_58_]) != null && (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[0][i_59_][i_58_].aClass293_3509) != null);
						if (((Class293) class293).aShort3508 < 0) {
							int i_60_ = i_58_;
							int i_61_ = i_58_;
							int i_62_ = i;
							int i_63_ = i;
							Class293 class293_64_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_59_][i_60_ - 1]);
							int i_65_;
							for (i_65_ = ((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_59_, i_58_, 65280); (i_60_ > 0 && class293_64_ != null && ((Class293) class293_64_).aShort3508 < 0 && (((Class293) class293_64_).aShort3508 == ((Class293) class293).aShort3508) && (((Class293) class293_64_).aShort3501 == ((Class293) class293).aShort3501) && i_65_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_59_, i_60_ - 1, 65280))
									&& (i_60_ - 1 <= 0 || i_65_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_59_, i_60_ - 2, 65280))) && i_61_ - i_60_ <= 10); class293_64_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_59_][i_60_ - 1]))
								i_60_--;
							for (class293_64_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_59_][i_61_ + 1]); (i_61_ < (((Class201) this).aClass206_2546.anInt2603) * -18177099 && class293_64_ != null && ((Class293) class293_64_).aShort3508 < 0 && (((Class293) class293_64_).aShort3508 == ((Class293) class293).aShort3508) && (((Class293) class293_64_).aShort3501 == ((Class293) class293).aShort3501)
									&& i_65_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_59_, i_61_ + 1, 65280)) && (i_61_ + 1 >= ((((Class201) this).aClass206_2546.anInt2603) * -18177099) || i_65_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_59_, i_61_ + 2, 65280))) && i_61_ - i_60_ <= 10); class293_64_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_59_][i_61_ + 1]))
								i_61_++;
							int i_66_ = i_63_ - i_62_ + 1;
							int i_67_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_62_ + 1 : i_62_].method6722(i_59_, i_60_, 65280);
							int i_68_ = (i_67_ + ((Class293) class293).aShort3508 * i_66_);
							int i_69_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_62_ + 1 : i_62_].method6722(i_59_, i_61_ + 1, 65280);
							int i_70_ = (i_69_ + ((Class293) class293).aShort3508 * i_66_);
							int i_71_ = i_59_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_72_ = i_60_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_73_ = ((i_61_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293) + (((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2593 * 1885735347));
							((Class201) this).aClass231Array2555[((Class201) this).anInt2545++] = (new Class231(((Class201) this).aClass206_2546, 1, i_63_, i_71_ + ((Class293) class293).aShort3501, i_71_ + ((Class293) class293).aShort3501, i_71_ + ((Class293) class293).aShort3501, i_71_ + ((Class293) class293).aShort3501, i_67_, i_69_, i_70_, i_68_, i_72_, i_73_, i_73_, i_72_));
							for (int i_74_ = i_62_; i_74_ <= i_63_; i_74_++) {
								for (int i_75_ = i_60_; i_75_ <= i_61_; i_75_++)
									((Class293) (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_74_][i_59_][i_75_])).aShort3508 *= -1;
							}
						}
						if (((Class293) class293).aShort3510 < 0) {
							int i_76_ = i_59_;
							int i_77_ = i_59_;
							int i_78_ = i;
							int i_79_ = i;
							Class293 class293_80_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_76_ - 1][i_58_]);
							int i_81_;
							for (i_81_ = ((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_59_, i_58_, 65280); (i_76_ > 0 && class293_80_ != null && ((Class293) class293_80_).aShort3510 < 0 && (((Class293) class293_80_).aShort3510 == ((Class293) class293).aShort3510) && (((Class293) class293_80_).aShort3511 == ((Class293) class293).aShort3511) && i_81_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_76_ - 1, i_58_, 65280))
									&& (i_76_ - 1 <= 0 || i_81_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_76_ - 2, i_58_, 65280))) && i_77_ - i_76_ <= 10); class293_80_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_76_ - 1][i_58_]))
								i_76_--;
							for (class293_80_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_77_ + 1][i_58_]); (i_77_ < (((Class201) this).aClass206_2546.anInt2617) * -1912960305 && class293_80_ != null && ((Class293) class293_80_).aShort3510 < 0 && (((Class293) class293_80_).aShort3510 == ((Class293) class293).aShort3510) && (((Class293) class293_80_).aShort3511 == ((Class293) class293).aShort3511)
									&& i_81_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_77_ + 1, i_58_, 65280)) && (i_77_ + 1 >= ((((Class201) this).aClass206_2546.anInt2617) * -1912960305) || i_81_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_77_ + 2, i_58_, 65280))) && i_77_ - i_76_ <= 10); class293_80_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_77_ + 1][i_58_]))
								i_77_++;
							int i_82_ = i_79_ - i_78_ + 1;
							int i_83_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_78_ + 1 : i_78_].method6722(i_76_, i_58_, 65280);
							int i_84_ = (i_83_ + ((Class293) class293).aShort3510 * i_82_);
							int i_85_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_78_ + 1 : i_78_].method6722(i_77_ + 1, i_58_, 65280);
							int i_86_ = (i_85_ + ((Class293) class293).aShort3510 * i_82_);
							int i_87_ = i_76_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_88_ = ((i_77_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293) + (((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2593 * 1885735347));
							int i_89_ = i_58_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							((Class201) this).aClass231Array2555[((Class201) this).anInt2545++] = (new Class231(((Class201) this).aClass206_2546, 2, i_79_, i_87_, i_88_, i_88_, i_87_, i_83_, i_85_, i_86_, i_84_, i_89_ + ((Class293) class293).aShort3511, i_89_ + ((Class293) class293).aShort3511, i_89_ + ((Class293) class293).aShort3511, i_89_ + ((Class293) class293).aShort3511));
							for (int i_90_ = i_78_; i_90_ <= i_79_; i_90_++) {
								for (int i_91_ = i_76_; i_91_ <= i_77_; i_91_++)
									((Class293) (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_90_][i_91_][i_58_])).aShort3510 *= -1;
							}
						}
					}
				}
			}
		}
		((Class201) this).aBool2548 = true;
	}

	boolean method3273(int i, int i_92_, int i_93_, int i_94_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (!method3271(i, i_92_, i_93_))
			return false;
		int i_95_ = (i_92_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_96_ = (i_93_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		if (method3276(i_95_, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_92_, i_93_, 65280), i_96_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593 * 1885735347), i_94_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593 * 1885735347)))
			return true;
		return false;
	}

	boolean method3274(int i, int i_97_, int i_98_, int i_99_, int i_100_, Class200 class200) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (i_97_ == i_98_ && i_99_ == i_100_) {
			if (!method3271(i, i_97_, i_99_))
				return false;
			if (method3299(class200))
				return true;
			return false;
		}
		for (int i_101_ = i_97_; i_101_ <= i_98_; i_101_++) {
			for (int i_102_ = i_99_; i_102_ <= i_100_; i_102_++) {
				if ((((Class201) this).anIntArrayArrayArray2551[i][i_101_][i_102_]) == -((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609) * -3958433))
					return false;
			}
		}
		if (!method3299(class200))
			return false;
		return true;
	}

	boolean method3275(Class521_Sub1_Sub5 class521_sub1_sub5, int i, int i_103_, int i_104_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (!method3271(i, i_103_, i_104_))
			return false;
		int i_105_ = (i_103_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_106_ = (i_104_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_107_ = (((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_103_, i_104_, 65280) - 1);
		int i_108_ = i_107_ + class521_sub1_sub5.method12995(-1987253874);
		if (class521_sub1_sub5.aShort9615 == 1) {
			if (!method3277(i_105_, i_107_, i_106_, i_105_, i_108_, i_106_, i_105_, i_108_, (i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347)))
				return false;
			if (!method3277(i_105_, i_107_, i_106_, i_105_, i_108_, (i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_105_, i_107_, (i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347)))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 2) {
			if (!method3277(i_105_, i_107_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_108_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_105_, i_108_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			if (!method3277(i_105_, i_107_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_107_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_108_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 4) {
			if (!method3277(i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_107_, i_106_, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_108_, i_106_, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_108_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			if (!method3277(i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_107_, i_106_, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_108_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_107_, i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 8) {
			if (!method3277(i_105_, i_107_, i_106_, (i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_108_, i_106_, i_105_, i_108_, i_106_))
				return false;
			if (!method3277(i_105_, i_107_, i_106_, (i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_107_, i_106_, (i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_108_, i_106_))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 16) {
			if (!method3276(i_105_, i_107_, (i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_108_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 32) {
			if (!method3276((i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), i_107_, (i_106_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_108_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 64) {
			if (!method3276((i_105_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), i_107_, i_106_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_108_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 128) {
			if (!method3276(i_105_, i_107_, i_106_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_108_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		return true;
	}

	final boolean method3276(int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_) {
		int i_114_ = i + i_111_;
		int i_115_ = i_109_ + i_112_;
		int i_116_ = i_110_ + i_113_;
		if (!method3277(i, i_115_, i_110_, i_114_, i_115_, i_116_, i, i_115_, i_116_))
			return false;
		if (!method3277(i, i_115_, i_110_, i_114_, i_115_, i_110_, i_114_, i_115_, i_116_))
			return false;
		if (i < (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2630 * 1980897327)) {
			if (!method3277(i, i_109_, i_116_, i, i_115_, i_110_, i, i_115_, i_116_))
				return false;
			if (!method3277(i, i_109_, i_116_, i, i_109_, i_110_, i, i_115_, i_110_))
				return false;
		} else {
			if (!method3277(i_114_, i_109_, i_116_, i_114_, i_115_, i_110_, i_114_, i_115_, i_116_))
				return false;
			if (!method3277(i_114_, i_109_, i_116_, i_114_, i_109_, i_110_, i_114_, i_115_, i_110_))
				return false;
		}
		if (i_110_ < (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2650 * 1171890939)) {
			if (!method3277(i, i_109_, i_110_, i_114_, i_115_, i_110_, i, i_115_, i_110_))
				return false;
			if (!method3277(i, i_109_, i_110_, i_114_, i_109_, i_110_, i_114_, i_115_, i_110_))
				return false;
		} else {
			if (!method3277(i, i_109_, i_116_, i_114_, i_115_, i_116_, i, i_115_, i_116_))
				return false;
			if (!method3277(i, i_109_, i_116_, i_114_, i_109_, i_116_, i_114_, i_115_, i_116_))
				return false;
		}
		return true;
	}

	final boolean method3277(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_) {
		if (!method3270(i, i_117_, i_118_))
			return false;
		i = (int) ((Class201) this).aFloatArray2554[0];
		i_117_ = (int) ((Class201) this).aFloatArray2554[1];
		i_118_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_119_, i_120_, i_121_))
			return false;
		i_119_ = (int) ((Class201) this).aFloatArray2554[0];
		i_120_ = (int) ((Class201) this).aFloatArray2554[1];
		i_121_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_122_, i_123_, i_124_))
			return false;
		i_122_ = (int) ((Class201) this).aFloatArray2554[0];
		i_123_ = (int) ((Class201) this).aFloatArray2554[1];
		i_124_ = (int) ((Class201) this).aFloatArray2554[2];
		return ((Class201) this).aClass205_2547.method3371(i_117_, i_120_, i_123_, i, i_119_, i_122_, i_118_, i_121_, i_124_);
	}

	public void method3278(int i, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_130_ = i_126_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293);
				int i_131_ = i_130_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_132_ = i_127_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293);
				int i_133_ = i_132_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_134_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_125_].method6722(i_126_, i_127_, 65280);
				int i_135_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_125_].method6722(i_126_ + 1, i_127_ + 1, 65280);
				((Class201) this).aClass231Array2557[((Class201) this).anInt2556++] = new Class231(((Class201) this).aClass206_2546, i, i_125_, i_130_, i_131_, i_131_, i_130_, i_134_, i_135_, i_135_ - i_128_, i_134_ - i_128_, i_132_, i_133_, i_133_, i_132_);
			} else {
				int i_136_ = ((i_126_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293)) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347);
				int i_137_ = i_136_ - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_138_ = i_127_ << (((Class201) this).aClass206_2546.anInt2592 * -1928575293);
				int i_139_ = i_138_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347;
				int i_140_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_125_].method6722(i_126_ + 1, i_127_, 65280);
				int i_141_ = ((Class201) this).aClass206_2546.aClass390Array2607[i_125_].method6722(i_126_, i_127_ + 1, 65280);
				((Class201) this).aClass231Array2557[((Class201) this).anInt2556++] = new Class231(((Class201) this).aClass206_2546, i, i_125_, i_136_, i_137_, i_137_, i_136_, i_140_, i_141_, i_141_ - i_128_, i_140_ - i_128_, i_138_, i_139_, i_139_, i_138_);
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_125_][i_126_][i_127_]);
			if (class293 == null)
				((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_125_][i_126_][i_127_] = class293 = new Class293(i_125_);
			if (i == 1) {
				((Class293) class293).aShort3508 = (short) i_128_;
				((Class293) class293).aShort3501 = (short) i_129_;
			} else if (i == 2) {
				((Class293) class293).aShort3510 = (short) i_128_;
				((Class293) class293).aShort3511 = (short) i_129_;
			}
			if (((Class201) this).aBool2548)
				method3309();
		}
	}

	public void method3279(int i, int i_142_, int i_143_, int i_144_) {
		if (i == 8 || i == 16) {
			for (int i_145_ = 0; i_145_ < ((Class201) this).anInt2556; i_145_++) {
				Class231 class231 = ((Class201) this).aClass231Array2557[i_145_];
				if (((Class231) class231).aByte2863 == i && ((Class231) class231).aByte2865 == i_142_ && ((((Class231) class231).aShort2866 == i_143_ && ((Class231) class231).aShort2868 == i_144_) || (((Class231) class231).aShort2867 == i_143_ && ((Class231) class231).aShort2869 == i_144_))) {
					if (i_145_ != ((Class201) this).anInt2556)
						System.arraycopy(((Class201) this).aClass231Array2557, i_145_ + 1, ((Class201) this).aClass231Array2557, i_145_, ((((Class201) this).aClass231Array2557).length - (i_145_ + 1)));
					((Class201) this).anInt2556--;
					break;
				}
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_142_][i_143_][i_144_]);
			if (class293 != null) {
				if (i == 1)
					((Class293) class293).aShort3508 = (short) 0;
				else if (i == 2)
					((Class293) class293).aShort3510 = (short) 0;
			}
			method3309();
		}
	}

	public void method3280(int i, int i_146_, int i_147_, int i_148_) {
		if (i == 8 || i == 16) {
			for (int i_149_ = 0; i_149_ < ((Class201) this).anInt2556; i_149_++) {
				Class231 class231 = ((Class201) this).aClass231Array2557[i_149_];
				if (((Class231) class231).aByte2863 == i && ((Class231) class231).aByte2865 == i_146_ && ((((Class231) class231).aShort2866 == i_147_ && ((Class231) class231).aShort2868 == i_148_) || (((Class231) class231).aShort2867 == i_147_ && ((Class231) class231).aShort2869 == i_148_))) {
					if (i_149_ != ((Class201) this).anInt2556)
						System.arraycopy(((Class201) this).aClass231Array2557, i_149_ + 1, ((Class201) this).aClass231Array2557, i_149_, ((((Class201) this).aClass231Array2557).length - (i_149_ + 1)));
					((Class201) this).anInt2556--;
					break;
				}
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_146_][i_147_][i_148_]);
			if (class293 != null) {
				if (i == 1)
					((Class293) class293).aShort3508 = (short) 0;
				else if (i == 2)
					((Class293) class293).aShort3510 = (short) 0;
			}
			method3309();
		}
	}

	void method3281(GraphicalRenderer class505, Class231 class231, int i) {
		aClass505_2566 = class505;
		if (((Class201) this).anIntArray2569 != null && ((Class231) class231).aByte2865 >= i) {
			for (int i_150_ = 0; i_150_ < ((Class201) this).anIntArray2569.length; i_150_++) {
				if (((Class201) this).anIntArray2569[i_150_] != -1000000 && ((((Class231) class231).anIntArray2871[0] <= ((Class201) this).anIntArray2569[i_150_]) || (((Class231) class231).anIntArray2871[1] <= ((Class201) this).anIntArray2569[i_150_]) || (((Class231) class231).anIntArray2871[2] <= ((Class201) this).anIntArray2569[i_150_]) || (((Class231) class231).anIntArray2871[3] <= ((Class201) this).anIntArray2569[i_150_]))
						&& ((((Class231) class231).anIntArray2859[0] <= ((Class201) this).anIntArray2562[i_150_]) || (((Class231) class231).anIntArray2859[1] <= ((Class201) this).anIntArray2562[i_150_]) || (((Class231) class231).anIntArray2859[2] <= ((Class201) this).anIntArray2562[i_150_]) || (((Class231) class231).anIntArray2859[3] <= ((Class201) this).anIntArray2562[i_150_]))
						&& ((((Class231) class231).anIntArray2859[0] >= ((Class201) this).anIntArray2561[i_150_]) || (((Class231) class231).anIntArray2859[1] >= ((Class201) this).anIntArray2561[i_150_]) || (((Class231) class231).anIntArray2859[2] >= ((Class201) this).anIntArray2561[i_150_]) || (((Class231) class231).anIntArray2859[3] >= ((Class201) this).anIntArray2561[i_150_]))
						&& ((((Class231) class231).anIntArray2864[0] <= ((Class201) this).anIntArray2568[i_150_]) || (((Class231) class231).anIntArray2864[1] <= ((Class201) this).anIntArray2568[i_150_]) || (((Class231) class231).anIntArray2864[2] <= ((Class201) this).anIntArray2568[i_150_]) || (((Class231) class231).anIntArray2864[3] <= ((Class201) this).anIntArray2568[i_150_]))
						&& ((((Class231) class231).anIntArray2864[0] >= ((Class201) this).anIntArray2560[i_150_]) || (((Class231) class231).anIntArray2864[1] >= ((Class201) this).anIntArray2560[i_150_]) || (((Class231) class231).anIntArray2864[2] >= ((Class201) this).anIntArray2560[i_150_]) || (((Class231) class231).anIntArray2864[3] >= ((Class201) this).anIntArray2560[i_150_])))
					return;
			}
		}
		if (((Class231) class231).aByte2863 == 1) {
			int i_151_ = (((Class231) class231).aShort2866 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2628 * -527863643) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833));
			if (i_151_ >= 0 && i_151_ <= ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833)) {
				int i_152_ = (((Class231) class231).aShort2868 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2629) * 1580412859 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_152_ < 0)
					i_152_ = 0;
				else if (i_152_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					return;
				int i_153_ = (((Class231) class231).aShort2869 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2629) * 1580412859 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_153_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					i_153_ = ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				else if (i_153_ < 0)
					return;
				boolean bool = false;
				while_131_: do {
					do {
						if (i_152_ > i_153_)
							break while_131_;
					} while (!((SceneObjectManager) ((Class201) this).aClass206_2546).aBoolArrayArray2651[i_151_][i_152_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) ((((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2630 * 1980897327) - ((Class231) class231).anIntArray2859[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) ((Class201) this).anInt2549) && method3269(class231, 0) && method3269(class231, 1) && method3269(class231, 2) && method3269(class231, 3))
						((Class201) this).aClass231Array2559[((Class201) this).anInt2564++] = class231;
				}
			}
		} else if (((Class231) class231).aByte2863 == 2) {
			int i_154_ = (((Class231) class231).aShort2868 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2629 * 1580412859) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833));
			if (i_154_ >= 0 && i_154_ <= ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833)) {
				int i_155_ = (((Class231) class231).aShort2866 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2628) * -527863643 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_155_ < 0)
					i_155_ = 0;
				else if (i_155_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					return;
				int i_156_ = (((Class231) class231).aShort2867 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2628) * -527863643 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_156_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					i_156_ = ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				else if (i_156_ < 0)
					return;
				boolean bool = false;
				while_132_: do {
					do {
						if (i_155_ > i_156_)
							break while_132_;
					} while (!((SceneObjectManager) ((Class201) this).aClass206_2546).aBoolArrayArray2651[i_155_++][i_154_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) ((((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2650 * 1171890939) - ((Class231) class231).anIntArray2864[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) ((Class201) this).anInt2549) && method3269(class231, 0) && method3269(class231, 1) && method3269(class231, 2) && method3269(class231, 3))
						((Class201) this).aClass231Array2559[((Class201) this).anInt2564++] = class231;
				}
			}
		} else if (((Class231) class231).aByte2863 == 16 || ((Class231) class231).aByte2863 == 8) {
			int i_157_ = (((Class231) class231).aShort2866 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2628 * -527863643) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833));
			if (i_157_ >= 0 && i_157_ <= ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833)) {
				int i_158_ = (((Class231) class231).aShort2868 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2629) * 1580412859 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_158_ >= 0 && (i_158_ <= ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833)) && (((SceneObjectManager) ((Class201) this).aClass206_2546).aBoolArrayArray2651[i_157_][i_158_])) {
					float f = (float) ((((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2630 * 1980897327) - ((Class231) class231).anIntArray2859[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_159_ = (float) ((((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2650 * 1171890939) - ((Class231) class231).anIntArray2864[0]);
					if (f_159_ < 0.0F)
						f_159_ *= -1.0F;
					if ((!(f < (float) ((Class201) this).anInt2549) || !(f_159_ < (float) ((Class201) this).anInt2549)) && method3269(class231, 0) && method3269(class231, 1) && method3269(class231, 2) && method3269(class231, 3))
						((Class201) this).aClass231Array2559[((Class201) this).anInt2564++] = class231;
				}
			}
		} else if (((Class231) class231).aByte2863 == 4) {
			float f = (float) (((Class231) class231).anIntArray2871[0] - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2632) * -691571515);
			if (!(f <= (float) ((Class201) this).anInt2563)) {
				int i_160_ = (((Class231) class231).aShort2868 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2629) * 1580412859 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_160_ < 0)
					i_160_ = 0;
				else if (i_160_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					return;
				int i_161_ = (((Class231) class231).aShort2869 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2629) * 1580412859 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_161_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					i_161_ = ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				else if (i_161_ < 0)
					return;
				int i_162_ = (((Class231) class231).aShort2866 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2628) * -527863643 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_162_ < 0)
					i_162_ = 0;
				else if (i_162_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					return;
				int i_163_ = (((Class231) class231).aShort2867 - (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2628) * -527863643 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				if (i_163_ > ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652 * 1459994833) + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833))
					i_163_ = ((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833 + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2652) * 1459994833);
				else if (i_163_ < 0)
					return;
				boolean bool = false;
				while_133_: for (int i_164_ = i_162_; i_164_ <= i_163_; i_164_++) {
					for (int i_165_ = i_160_; i_165_ <= i_161_; i_165_++) {
						if (((SceneObjectManager) ((Class201) this).aClass206_2546).aBoolArrayArray2651[i_164_][i_165_]) {
							bool = true;
							break while_133_;
						}
					}
				}
				if (bool && method3269(class231, 0) && method3269(class231, 1) && method3269(class231, 2) && method3269(class231, 3))
					((Class201) this).aClass231Array2559[((Class201) this).anInt2564++] = class231;
			}
		}
	}

	public void method3282(int i, int i_166_, int i_167_, int i_168_) {
		if (i == 8 || i == 16) {
			for (int i_169_ = 0; i_169_ < ((Class201) this).anInt2556; i_169_++) {
				Class231 class231 = ((Class201) this).aClass231Array2557[i_169_];
				if (((Class231) class231).aByte2863 == i && ((Class231) class231).aByte2865 == i_166_ && ((((Class231) class231).aShort2866 == i_167_ && ((Class231) class231).aShort2868 == i_168_) || (((Class231) class231).aShort2867 == i_167_ && ((Class231) class231).aShort2869 == i_168_))) {
					if (i_169_ != ((Class201) this).anInt2556)
						System.arraycopy(((Class201) this).aClass231Array2557, i_169_ + 1, ((Class201) this).aClass231Array2557, i_169_, ((((Class201) this).aClass231Array2557).length - (i_169_ + 1)));
					((Class201) this).anInt2556--;
					break;
				}
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_166_][i_167_][i_168_]);
			if (class293 != null) {
				if (i == 1)
					((Class293) class293).aShort3508 = (short) 0;
				else if (i == 2)
					((Class293) class293).aShort3510 = (short) 0;
			}
			method3309();
		}
	}

	final boolean method3283(int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_) {
		int i_175_ = i + i_172_;
		int i_176_ = i_170_ + i_173_;
		int i_177_ = i_171_ + i_174_;
		if (!method3277(i, i_176_, i_171_, i_175_, i_176_, i_177_, i, i_176_, i_177_))
			return false;
		if (!method3277(i, i_176_, i_171_, i_175_, i_176_, i_171_, i_175_, i_176_, i_177_))
			return false;
		if (i < (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2630 * 1980897327)) {
			if (!method3277(i, i_170_, i_177_, i, i_176_, i_171_, i, i_176_, i_177_))
				return false;
			if (!method3277(i, i_170_, i_177_, i, i_170_, i_171_, i, i_176_, i_171_))
				return false;
		} else {
			if (!method3277(i_175_, i_170_, i_177_, i_175_, i_176_, i_171_, i_175_, i_176_, i_177_))
				return false;
			if (!method3277(i_175_, i_170_, i_177_, i_175_, i_170_, i_171_, i_175_, i_176_, i_171_))
				return false;
		}
		if (i_171_ < (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2650 * 1171890939)) {
			if (!method3277(i, i_170_, i_171_, i_175_, i_176_, i_171_, i, i_176_, i_171_))
				return false;
			if (!method3277(i, i_170_, i_171_, i_175_, i_170_, i_171_, i_175_, i_176_, i_171_))
				return false;
		} else {
			if (!method3277(i, i_170_, i_177_, i_175_, i_176_, i_177_, i, i_176_, i_177_))
				return false;
			if (!method3277(i, i_170_, i_177_, i_175_, i_170_, i_177_, i_175_, i_176_, i_177_))
				return false;
		}
		return true;
	}

	public void method3284() {
		method3309();
	}

	void method3285(GraphicalRenderer class505, int i) {
		aClass505_2566 = class505;
		if (!aBool2552 || !((Class201) this).aBool2542)
			((Class201) this).anInt2564 = 0;
		else {
			if (((Class201) this).aBool2571)
				((SceneObjectManager) ((Class201) this).aClass206_2546).aClass454_2597.method7548((byte) -66);
			aClass505_2566.method8408(((Class201) this).anIntArray2550);
			if ((((Class201) this).anInt2543 != (int) ((float) ((Class201) this).anIntArray2550[0] / 3.0F)) || (((Class201) this).anInt2570 != (int) ((float) ((Class201) this).anIntArray2550[1] / 3.0F))) {
				((Class201) this).anInt2543 = (int) ((float) ((Class201) this).anIntArray2550[0] / 3.0F);
				((Class201) this).anInt2570 = (int) ((float) ((Class201) this).anIntArray2550[1] / 3.0F);
				((Class201) this).anIntArray2565 = new int[(((Class201) this).anInt2543 * ((Class201) this).anInt2570)];
			}
			((Class201) this).anInt2564 = 0;
			for (int i_178_ = 0; i_178_ < ((Class201) this).anInt2567; i_178_++)
				method3281(aClass505_2566, ((Class201) this).aClass231Array2553[i_178_], i);
			for (int i_179_ = 0; i_179_ < ((Class201) this).anInt2545; i_179_++)
				method3281(aClass505_2566, ((Class201) this).aClass231Array2555[i_179_], i);
			for (int i_180_ = 0; i_180_ < ((Class201) this).anInt2556; i_180_++)
				method3281(aClass505_2566, ((Class201) this).aClass231Array2557[i_180_], i);
			((Class205) ((Class201) this).aClass205_2547).anInt2588 = 0;
			if (((Class201) this).anInt2564 > 0) {
				int i_181_ = ((Class201) this).anIntArray2565.length;
				int i_182_ = i_181_ - i_181_ & 0x7;
				int i_183_ = 0;
				while (i_183_ < i_182_) {
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
				}
				while (i_183_ < i_181_)
					((Class201) this).anIntArray2565[i_183_++] = 2147483647;
				((Class205) ((Class201) this).aClass205_2547).anInt2587 = 1;
				for (int i_184_ = 0; i_184_ < ((Class201) this).anInt2564; i_184_++) {
					Class231 class231 = ((Class201) this).aClass231Array2559[i_184_];
					((Class201) this).aClass205_2547.method3371(((Class231) class231).aShortArray2862[0], ((Class231) class231).aShortArray2862[1], ((Class231) class231).aShortArray2862[3], ((Class231) class231).aShortArray2873[0], ((Class231) class231).aShortArray2873[1], ((Class231) class231).aShortArray2873[3], ((Class231) class231).aShortArray2875[0], ((Class231) class231).aShortArray2875[1], ((Class231) class231).aShortArray2875[3]);
					((Class201) this).aClass205_2547.method3371(((Class231) class231).aShortArray2862[1], ((Class231) class231).aShortArray2862[2], ((Class231) class231).aShortArray2862[3], ((Class231) class231).aShortArray2873[1], ((Class231) class231).aShortArray2873[2], ((Class231) class231).aShortArray2873[3], ((Class231) class231).aShortArray2875[1], ((Class231) class231).aShortArray2875[2], ((Class231) class231).aShortArray2875[3]);
				}
				((Class205) ((Class201) this).aClass205_2547).anInt2587 = 2;
			}
			if (((Class201) this).aBool2571)
				((SceneObjectManager) ((Class201) this).aClass206_2546).aClass454_2597.method7548((byte) -53);
		}
	}

	void method3286() {
		for (int i = 0; i < ((Class201) this).anInt2545; i++)
			((Class201) this).aClass231Array2555[i] = null;
		((Class201) this).anInt2545 = 0;
		for (int i = 0; i < ((Class201) this).aClass206_2546.anInt2601 * -1485737447; i++) {
			for (int i_185_ = 0; (i_185_ < ((Class201) this).aClass206_2546.anInt2617 * -1912960305); i_185_++) {
				for (int i_186_ = 0; i_186_ < (((Class201) this).aClass206_2546.anInt2603 * -18177099); i_186_++) {
					Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_186_][i_185_]);
					if (class293 != null) {
						if (((Class293) class293).aShort3508 > 0)
							((Class293) class293).aShort3508 *= -1;
						if (((Class293) class293).aShort3510 > 0)
							((Class293) class293).aShort3510 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < ((Class201) this).aClass206_2546.anInt2601 * -1485737447; i++) {
			for (int i_187_ = 0; (i_187_ < ((Class201) this).aClass206_2546.anInt2617 * -1912960305); i_187_++) {
				for (int i_188_ = 0; i_188_ < (((Class201) this).aClass206_2546.anInt2603 * -18177099); i_188_++) {
					Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_188_][i_187_]);
					if (class293 != null) {
						boolean bool = ((((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[0][i_188_][i_187_]) != null && (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[0][i_188_][i_187_].aClass293_3509) != null);
						if (((Class293) class293).aShort3508 < 0) {
							int i_189_ = i_187_;
							int i_190_ = i_187_;
							int i_191_ = i;
							int i_192_ = i;
							Class293 class293_193_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_188_][i_189_ - 1]);
							int i_194_;
							for (i_194_ = ((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_188_, i_187_, 65280); (i_189_ > 0 && class293_193_ != null && ((Class293) class293_193_).aShort3508 < 0 && (((Class293) class293_193_).aShort3508 == ((Class293) class293).aShort3508) && (((Class293) class293_193_).aShort3501 == ((Class293) class293).aShort3501) && (i_194_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_188_, i_189_ - 1, 65280)))
									&& (i_189_ - 1 <= 0 || (i_194_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_188_, i_189_ - 2, 65280)))) && i_190_ - i_189_ <= 10); class293_193_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_188_][i_189_ - 1]))
								i_189_--;
							for (class293_193_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_188_][i_190_ + 1]); (i_190_ < (((Class201) this).aClass206_2546.anInt2603) * -18177099 && class293_193_ != null && ((Class293) class293_193_).aShort3508 < 0 && (((Class293) class293_193_).aShort3508 == ((Class293) class293).aShort3508) && (((Class293) class293_193_).aShort3501 == ((Class293) class293).aShort3501)
									&& (i_194_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_188_, i_190_ + 1, 65280))) && (i_190_ + 1 >= (((Class201) this).aClass206_2546.anInt2603) * -18177099 || (i_194_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_188_, i_190_ + 2, 65280)))) && i_190_ - i_189_ <= 10); class293_193_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_188_][i_190_ + 1]))
								i_190_++;
							int i_195_ = i_192_ - i_191_ + 1;
							int i_196_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_191_ + 1 : i_191_].method6722(i_188_, i_189_, 65280);
							int i_197_ = i_196_ + (((Class293) class293).aShort3508 * i_195_);
							int i_198_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_191_ + 1 : i_191_].method6722(i_188_, i_190_ + 1, 65280);
							int i_199_ = i_198_ + (((Class293) class293).aShort3508 * i_195_);
							int i_200_ = i_188_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_201_ = i_189_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_202_ = ((i_190_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293) + (((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2593 * 1885735347));
							((Class201) this).aClass231Array2555[((Class201) this).anInt2545++] = (new Class231(((Class201) this).aClass206_2546, 1, i_192_, i_200_ + ((Class293) class293).aShort3501, i_200_ + ((Class293) class293).aShort3501, i_200_ + ((Class293) class293).aShort3501, i_200_ + ((Class293) class293).aShort3501, i_196_, i_198_, i_199_, i_197_, i_201_, i_202_, i_202_, i_201_));
							for (int i_203_ = i_191_; i_203_ <= i_192_; i_203_++) {
								for (int i_204_ = i_189_; i_204_ <= i_190_; i_204_++)
									((Class293) (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_203_][i_188_][i_204_])).aShort3508 *= -1;
							}
						}
						if (((Class293) class293).aShort3510 < 0) {
							int i_205_ = i_188_;
							int i_206_ = i_188_;
							int i_207_ = i;
							int i_208_ = i;
							Class293 class293_209_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_205_ - 1][i_187_]);
							int i_210_;
							for (i_210_ = ((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_188_, i_187_, 65280); (i_205_ > 0 && class293_209_ != null && ((Class293) class293_209_).aShort3510 < 0 && (((Class293) class293_209_).aShort3510 == ((Class293) class293).aShort3510) && (((Class293) class293_209_).aShort3511 == ((Class293) class293).aShort3511) && (i_210_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_205_ - 1, i_187_, 65280)))
									&& (i_205_ - 1 <= 0 || (i_210_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_205_ - 2, i_187_, 65280)))) && i_206_ - i_205_ <= 10); class293_209_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_205_ - 1][i_187_]))
								i_205_--;
							for (class293_209_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_206_ + 1][i_187_]); (i_206_ < (((Class201) this).aClass206_2546.anInt2617) * -1912960305 && class293_209_ != null && ((Class293) class293_209_).aShort3510 < 0 && (((Class293) class293_209_).aShort3510 == ((Class293) class293).aShort3510) && (((Class293) class293_209_).aShort3511 == ((Class293) class293).aShort3511)
									&& (i_210_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_206_ + 1, i_187_, 65280))) && (i_206_ + 1 >= (((Class201) this).aClass206_2546.anInt2617) * -1912960305 || (i_210_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_206_ + 2, i_187_, 65280)))) && i_206_ - i_205_ <= 10); class293_209_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_206_ + 1][i_187_]))
								i_206_++;
							int i_211_ = i_208_ - i_207_ + 1;
							int i_212_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_207_ + 1 : i_207_].method6722(i_205_, i_187_, 65280);
							int i_213_ = i_212_ + (((Class293) class293).aShort3510 * i_211_);
							int i_214_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_207_ + 1 : i_207_].method6722(i_206_ + 1, i_187_, 65280);
							int i_215_ = i_214_ + (((Class293) class293).aShort3510 * i_211_);
							int i_216_ = i_205_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_217_ = ((i_206_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293) + (((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2593 * 1885735347));
							int i_218_ = i_187_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							((Class201) this).aClass231Array2555[((Class201) this).anInt2545++] = (new Class231(((Class201) this).aClass206_2546, 2, i_208_, i_216_, i_217_, i_217_, i_216_, i_212_, i_214_, i_215_, i_213_, i_218_ + ((Class293) class293).aShort3511, i_218_ + ((Class293) class293).aShort3511, i_218_ + ((Class293) class293).aShort3511, (i_218_ + ((Class293) class293).aShort3511)));
							for (int i_219_ = i_207_; i_219_ <= i_208_; i_219_++) {
								for (int i_220_ = i_205_; i_220_ <= i_206_; i_220_++)
									((Class293) (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_219_][i_220_][i_187_])).aShort3510 *= -1;
							}
						}
					}
				}
			}
		}
		((Class201) this).aBool2548 = true;
	}

	final boolean method3287(int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_) {
		if (!method3270(i, i_221_, i_222_))
			return false;
		i = (int) ((Class201) this).aFloatArray2554[0];
		i_221_ = (int) ((Class201) this).aFloatArray2554[1];
		i_222_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_223_, i_224_, i_225_))
			return false;
		i_223_ = (int) ((Class201) this).aFloatArray2554[0];
		i_224_ = (int) ((Class201) this).aFloatArray2554[1];
		i_225_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_226_, i_227_, i_228_))
			return false;
		i_226_ = (int) ((Class201) this).aFloatArray2554[0];
		i_227_ = (int) ((Class201) this).aFloatArray2554[1];
		i_228_ = (int) ((Class201) this).aFloatArray2554[2];
		return ((Class201) this).aClass205_2547.method3371(i_221_, i_224_, i_227_, i, i_223_, i_226_, i_222_, i_225_, i_228_);
	}

	boolean method3288(Class231 class231, int i) {
		if (!method3270(((Class231) class231).anIntArray2859[i], ((Class231) class231).anIntArray2871[i], ((Class231) class231).anIntArray2864[i]))
			return false;
		((Class231) class231).aShortArray2873[i] = (short) (int) ((Class201) this).aFloatArray2554[0];
		((Class231) class231).aShortArray2862[i] = (short) (int) ((Class201) this).aFloatArray2554[1];
		((Class231) class231).aShortArray2875[i] = (short) (int) ((Class201) this).aFloatArray2554[2];
		return true;
	}

	boolean method3289(Class231 class231, int i) {
		if (!method3270(((Class231) class231).anIntArray2859[i], ((Class231) class231).anIntArray2871[i], ((Class231) class231).anIntArray2864[i]))
			return false;
		((Class231) class231).aShortArray2873[i] = (short) (int) ((Class201) this).aFloatArray2554[0];
		((Class231) class231).aShortArray2862[i] = (short) (int) ((Class201) this).aFloatArray2554[1];
		((Class231) class231).aShortArray2875[i] = (short) (int) ((Class201) this).aFloatArray2554[2];
		return true;
	}

	boolean method3290(Class231 class231, int i) {
		if (!method3270(((Class231) class231).anIntArray2859[i], ((Class231) class231).anIntArray2871[i], ((Class231) class231).anIntArray2864[i]))
			return false;
		((Class231) class231).aShortArray2873[i] = (short) (int) ((Class201) this).aFloatArray2554[0];
		((Class231) class231).aShortArray2862[i] = (short) (int) ((Class201) this).aFloatArray2554[1];
		((Class231) class231).aShortArray2875[i] = (short) (int) ((Class201) this).aFloatArray2554[2];
		return true;
	}

	boolean method3291(int i, int i_229_, int i_230_, int i_231_, int i_232_, Class200 class200) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (i_229_ == i_230_ && i_231_ == i_232_) {
			if (!method3271(i, i_229_, i_231_))
				return false;
			if (method3299(class200))
				return true;
			return false;
		}
		for (int i_233_ = i_229_; i_233_ <= i_230_; i_233_++) {
			for (int i_234_ = i_231_; i_234_ <= i_232_; i_234_++) {
				if ((((Class201) this).anIntArrayArrayArray2551[i][i_233_][i_234_]) == -((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609) * -3958433))
					return false;
			}
		}
		if (!method3299(class200))
			return false;
		return true;
	}

	final boolean method3292(int i, int i_235_, int i_236_) {
		aClass505_2566.method8479((float) i, (float) i_235_, (float) i_236_, ((Class201) this).aFloatArray2554);
		if (((Class201) this).aFloatArray2554[2] < 50.0F)
			return false;
		((Class201) this).aFloatArray2554[0] /= 3.0F;
		((Class201) this).aFloatArray2554[1] /= 3.0F;
		return true;
	}

	final boolean method3293(int i, int i_237_, int i_238_) {
		aClass505_2566.method8479((float) i, (float) i_237_, (float) i_238_, ((Class201) this).aFloatArray2554);
		if (((Class201) this).aFloatArray2554[2] < 50.0F)
			return false;
		((Class201) this).aFloatArray2554[0] /= 3.0F;
		((Class201) this).aFloatArray2554[1] /= 3.0F;
		return true;
	}

	final boolean method3294(int i, int i_239_, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_) {
		if (!method3270(i, i_239_, i_240_))
			return false;
		i = (int) ((Class201) this).aFloatArray2554[0];
		i_239_ = (int) ((Class201) this).aFloatArray2554[1];
		i_240_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_241_, i_242_, i_243_))
			return false;
		i_241_ = (int) ((Class201) this).aFloatArray2554[0];
		i_242_ = (int) ((Class201) this).aFloatArray2554[1];
		i_243_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_244_, i_245_, i_246_))
			return false;
		i_244_ = (int) ((Class201) this).aFloatArray2554[0];
		i_245_ = (int) ((Class201) this).aFloatArray2554[1];
		i_246_ = (int) ((Class201) this).aFloatArray2554[2];
		return ((Class201) this).aClass205_2547.method3371(i_239_, i_242_, i_245_, i, i_241_, i_244_, i_240_, i_243_, i_246_);
	}

	boolean method3295(int i, int i_247_, int i_248_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		int i_249_ = ((Class201) this).anIntArrayArrayArray2551[i][i_247_][i_248_];
		if (i_249_ == -(((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433))
			return false;
		if (i_249_ == (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433))
			return true;
		if (((Class201) this).aClass206_2546.aClass390Array2591 == ((Class201) this).aClass206_2546.aClass390Array2614)
			return false;
		int i_250_ = (i_247_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_251_ = (i_248_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		if (method3277(i_250_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_247_, i_248_, 65280), i_251_ + 1, i_250_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_247_ + 1, i_248_ + 1, 65280), i_251_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1, i_250_ + 1,
				((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_247_, i_248_ + 1, 65280), i_251_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1)
				&& method3277(i_250_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_247_, i_248_, 65280), i_251_ + 1, (i_250_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1), ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_247_ + 1, i_248_, 65280), i_251_ + 1, (i_250_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1),
						((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_247_ + 1, i_248_ + 1, 65280), (i_251_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1))) {
			((Class201) this).anIntArrayArrayArray2551[i][i_247_][i_248_] = (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433);
			return true;
		}
		((Class201) this).anIntArrayArrayArray2551[i][i_247_][i_248_] = -(((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433);
		return false;
	}

	boolean method3296(int i, int i_252_, int i_253_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		int i_254_ = ((Class201) this).anIntArrayArrayArray2551[i][i_252_][i_253_];
		if (i_254_ == -(((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433))
			return false;
		if (i_254_ == (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433))
			return true;
		if (((Class201) this).aClass206_2546.aClass390Array2591 == ((Class201) this).aClass206_2546.aClass390Array2614)
			return false;
		int i_255_ = (i_252_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_256_ = (i_253_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		if (method3277(i_255_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_252_, i_253_, 65280), i_256_ + 1, i_255_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_252_ + 1, i_253_ + 1, 65280), i_256_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1, i_255_ + 1,
				((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_252_, i_253_ + 1, 65280), i_256_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1)
				&& method3277(i_255_ + 1, ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_252_, i_253_, 65280), i_256_ + 1, (i_255_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1), ((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_252_ + 1, i_253_, 65280), i_256_ + 1, (i_255_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1),
						((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_252_ + 1, i_253_ + 1, 65280), (i_256_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347 - 1))) {
			((Class201) this).anIntArrayArrayArray2551[i][i_252_][i_253_] = (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433);
			return true;
		}
		((Class201) this).anIntArrayArrayArray2551[i][i_252_][i_253_] = -(((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609 * -3958433);
		return false;
	}

	public void method3297(int i, int i_257_, int i_258_, int i_259_) {
		if (i == 8 || i == 16) {
			for (int i_260_ = 0; i_260_ < ((Class201) this).anInt2556; i_260_++) {
				Class231 class231 = ((Class201) this).aClass231Array2557[i_260_];
				if (((Class231) class231).aByte2863 == i && ((Class231) class231).aByte2865 == i_257_ && ((((Class231) class231).aShort2866 == i_258_ && ((Class231) class231).aShort2868 == i_259_) || (((Class231) class231).aShort2867 == i_258_ && ((Class231) class231).aShort2869 == i_259_))) {
					if (i_260_ != ((Class201) this).anInt2556)
						System.arraycopy(((Class201) this).aClass231Array2557, i_260_ + 1, ((Class201) this).aClass231Array2557, i_260_, ((((Class201) this).aClass231Array2557).length - (i_260_ + 1)));
					((Class201) this).anInt2556--;
					break;
				}
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_257_][i_258_][i_259_]);
			if (class293 != null) {
				if (i == 1)
					((Class293) class293).aShort3508 = (short) 0;
				else if (i == 2)
					((Class293) class293).aShort3510 = (short) 0;
			}
			method3309();
		}
	}

	boolean method3298(Class521_Sub1_Sub5 class521_sub1_sub5, int i, int i_261_, int i_262_) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (!method3271(i, i_261_, i_262_))
			return false;
		int i_263_ = (i_261_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_264_ = (i_262_ << ((Class201) this).aClass206_2546.anInt2592 * -1928575293);
		int i_265_ = (((Class201) this).aClass206_2546.aClass390Array2591[i].method6722(i_261_, i_262_, 65280) - 1);
		int i_266_ = i_265_ + class521_sub1_sub5.method12995(-1961243630);
		if (class521_sub1_sub5.aShort9615 == 1) {
			if (!method3277(i_263_, i_265_, i_264_, i_263_, i_266_, i_264_, i_263_, i_266_, (i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347)))
				return false;
			if (!method3277(i_263_, i_265_, i_264_, i_263_, i_266_, (i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_263_, i_265_, (i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347)))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 2) {
			if (!method3277(i_263_, i_265_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_266_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_263_, i_266_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			if (!method3277(i_263_, i_265_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_265_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_266_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 4) {
			if (!method3277(i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_265_, i_264_, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_266_, i_264_, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_266_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			if (!method3277(i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_265_, i_264_, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_266_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347, i_265_, i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 8) {
			if (!method3277(i_263_, i_265_, i_264_, (i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_266_, i_264_, i_263_, i_266_, i_264_))
				return false;
			if (!method3277(i_263_, i_265_, i_264_, (i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_265_, i_264_, (i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2593) * 1885735347), i_266_, i_264_))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 16) {
			if (!method3276(i_263_, i_265_, (i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_266_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 32) {
			if (!method3276((i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), i_265_, (i_264_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_266_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 64) {
			if (!method3276((i_263_ + (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483), i_265_, i_264_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_266_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		if (class521_sub1_sub5.aShort9615 == 128) {
			if (!method3276(i_263_, i_265_, i_264_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483, i_266_, (((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2594) * -1428980483))
				return false;
			return true;
		}
		return true;
	}

	final boolean method3299(Class200 class200) {
		if (class200 == null)
			return false;
		return method3276(((Class200) class200).anInt2535, ((Class200) class200).anInt2537, ((Class200) class200).anInt2539, (((Class200) class200).anInt2536 - ((Class200) class200).anInt2535), (((Class200) class200).anInt2538 - ((Class200) class200).anInt2537), (((Class200) class200).anInt2531 - ((Class200) class200).anInt2539));
	}

	boolean method3300(int i, int i_267_, int i_268_, int i_269_, int i_270_, Class200 class200) {
		if (!aBool2552 || !((Class201) this).aBool2542)
			return false;
		if (((Class205) ((Class201) this).aClass205_2547).anInt2588 < 102)
			return false;
		if (i_267_ == i_268_ && i_269_ == i_270_) {
			if (!method3271(i, i_267_, i_269_))
				return false;
			if (method3299(class200))
				return true;
			return false;
		}
		for (int i_271_ = i_267_; i_271_ <= i_268_; i_271_++) {
			for (int i_272_ = i_269_; i_272_ <= i_270_; i_272_++) {
				if ((((Class201) this).anIntArrayArrayArray2551[i][i_271_][i_272_]) == -((((SceneObjectManager) ((Class201) this).aClass206_2546).anInt2609) * -3958433))
					return false;
			}
		}
		if (!method3299(class200))
			return false;
		return true;
	}

	Class201(SceneObjectManager class206) {
		((Class201) this).aBool2542 = true;
		((Class201) this).aBool2548 = false;
		((Class201) this).anInt2564 = 0;
		((Class201) this).aFloatArray2554 = new float[3];
		((Class201) this).anIntArray2550 = new int[2];
		((Class201) this).anInt2543 = -1;
		((Class201) this).anInt2570 = -1;
		((Class201) this).aBool2571 = true;
		((Class201) this).anInt2549 = ((SceneObjectManager) class206).anInt2593 * 1885735347;
		((Class201) this).anInt2563 = ((SceneObjectManager) class206).anInt2593 * 1885735347;
		((Class201) this).aClass206_2546 = class206;
		((Class201) this).aClass231Array2553 = new Class231[509];
		((Class201) this).anInt2567 = 0;
		((Class201) this).aClass231Array2555 = new Class231[2034];
		((Class201) this).anInt2545 = 0;
		((Class201) this).aClass231Array2557 = new Class231[1027];
		((Class201) this).anInt2556 = 0;
		((Class201) this).aClass231Array2559 = new Class231[1005];
		((Class201) this).anInt2564 = 0;
		((Class201) this).anIntArrayArrayArray2551 = (new int[((Class201) this).aClass206_2546.anInt2601 * -1485737447][((Class201) this).aClass206_2546.anInt2617 * -1912960305 + 1][((Class201) this).aClass206_2546.anInt2603 * -18177099 + 1]);
		((Class201) this).aBool2548 = false;
		if (((SceneObjectManager) ((Class201) this).aClass206_2546).aClass505_2596 instanceof ja)
			aBool2552 = false;
		else
			aBool2552 = true;
		if (aBool2552)
			((Class201) this).aClass205_2547 = new Class205(this);
	}

	final boolean method3301(Class200 class200) {
		if (class200 == null)
			return false;
		return method3276(((Class200) class200).anInt2535, ((Class200) class200).anInt2537, ((Class200) class200).anInt2539, (((Class200) class200).anInt2536 - ((Class200) class200).anInt2535), (((Class200) class200).anInt2538 - ((Class200) class200).anInt2537), (((Class200) class200).anInt2531 - ((Class200) class200).anInt2539));
	}

	final boolean method3302(Class200 class200) {
		if (class200 == null)
			return false;
		return method3276(((Class200) class200).anInt2535, ((Class200) class200).anInt2537, ((Class200) class200).anInt2539, (((Class200) class200).anInt2536 - ((Class200) class200).anInt2535), (((Class200) class200).anInt2538 - ((Class200) class200).anInt2537), (((Class200) class200).anInt2531 - ((Class200) class200).anInt2539));
	}

	final boolean method3303(Class200 class200) {
		if (class200 == null)
			return false;
		return method3276(((Class200) class200).anInt2535, ((Class200) class200).anInt2537, ((Class200) class200).anInt2539, (((Class200) class200).anInt2536 - ((Class200) class200).anInt2535), (((Class200) class200).anInt2538 - ((Class200) class200).anInt2537), (((Class200) class200).anInt2531 - ((Class200) class200).anInt2539));
	}

	final boolean method3304(Class200 class200) {
		if (class200 == null)
			return false;
		return method3276(((Class200) class200).anInt2535, ((Class200) class200).anInt2537, ((Class200) class200).anInt2539, (((Class200) class200).anInt2536 - ((Class200) class200).anInt2535), (((Class200) class200).anInt2538 - ((Class200) class200).anInt2537), (((Class200) class200).anInt2531 - ((Class200) class200).anInt2539));
	}

	final boolean method3305(Class200 class200) {
		if (class200 == null)
			return false;
		return method3276(((Class200) class200).anInt2535, ((Class200) class200).anInt2537, ((Class200) class200).anInt2539, (((Class200) class200).anInt2536 - ((Class200) class200).anInt2535), (((Class200) class200).anInt2538 - ((Class200) class200).anInt2537), (((Class200) class200).anInt2531 - ((Class200) class200).anInt2539));
	}

	public void method3306(int i, int i_273_, int i_274_, int i_275_) {
		if (i == 8 || i == 16) {
			for (int i_276_ = 0; i_276_ < ((Class201) this).anInt2556; i_276_++) {
				Class231 class231 = ((Class201) this).aClass231Array2557[i_276_];
				if (((Class231) class231).aByte2863 == i && ((Class231) class231).aByte2865 == i_273_ && ((((Class231) class231).aShort2866 == i_274_ && ((Class231) class231).aShort2868 == i_275_) || (((Class231) class231).aShort2867 == i_274_ && ((Class231) class231).aShort2869 == i_275_))) {
					if (i_276_ != ((Class201) this).anInt2556)
						System.arraycopy(((Class201) this).aClass231Array2557, i_276_ + 1, ((Class201) this).aClass231Array2557, i_276_, ((((Class201) this).aClass231Array2557).length - (i_276_ + 1)));
					((Class201) this).anInt2556--;
					break;
				}
			}
		} else {
			Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_273_][i_274_][i_275_]);
			if (class293 != null) {
				if (i == 1)
					((Class293) class293).aShort3508 = (short) 0;
				else if (i == 2)
					((Class293) class293).aShort3510 = (short) 0;
			}
			method3309();
		}
	}

	public void method3307(int i, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_) {
		((Class201) this).aClass231Array2553[((Class201) this).anInt2567++] = new Class231(((Class201) this).aClass206_2546, i, i_277_, i_278_, i_279_, i_279_, i_278_, i_282_, i_283_, i_283_, i_282_, i_280_, i_280_, i_281_, i_281_);
	}

	final boolean method3308(int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_) {
		if (!method3270(i, i_284_, i_285_))
			return false;
		i = (int) ((Class201) this).aFloatArray2554[0];
		i_284_ = (int) ((Class201) this).aFloatArray2554[1];
		i_285_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_286_, i_287_, i_288_))
			return false;
		i_286_ = (int) ((Class201) this).aFloatArray2554[0];
		i_287_ = (int) ((Class201) this).aFloatArray2554[1];
		i_288_ = (int) ((Class201) this).aFloatArray2554[2];
		if (!method3270(i_289_, i_290_, i_291_))
			return false;
		i_289_ = (int) ((Class201) this).aFloatArray2554[0];
		i_290_ = (int) ((Class201) this).aFloatArray2554[1];
		i_291_ = (int) ((Class201) this).aFloatArray2554[2];
		return ((Class201) this).aClass205_2547.method3371(i_284_, i_287_, i_290_, i, i_286_, i_289_, i_285_, i_288_, i_291_);
	}

	void method3309() {
		for (int i = 0; i < ((Class201) this).anInt2545; i++)
			((Class201) this).aClass231Array2555[i] = null;
		((Class201) this).anInt2545 = 0;
		for (int i = 0; i < ((Class201) this).aClass206_2546.anInt2601 * -1485737447; i++) {
			for (int i_292_ = 0; (i_292_ < ((Class201) this).aClass206_2546.anInt2617 * -1912960305); i_292_++) {
				for (int i_293_ = 0; i_293_ < (((Class201) this).aClass206_2546.anInt2603 * -18177099); i_293_++) {
					Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_293_][i_292_]);
					if (class293 != null) {
						if (((Class293) class293).aShort3508 > 0)
							((Class293) class293).aShort3508 *= -1;
						if (((Class293) class293).aShort3510 > 0)
							((Class293) class293).aShort3510 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < ((Class201) this).aClass206_2546.anInt2601 * -1485737447; i++) {
			for (int i_294_ = 0; (i_294_ < ((Class201) this).aClass206_2546.anInt2617 * -1912960305); i_294_++) {
				for (int i_295_ = 0; i_295_ < (((Class201) this).aClass206_2546.anInt2603 * -18177099); i_295_++) {
					Class293 class293 = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_295_][i_294_]);
					if (class293 != null) {
						boolean bool = ((((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[0][i_295_][i_294_]) != null && (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[0][i_295_][i_294_].aClass293_3509) != null);
						if (((Class293) class293).aShort3508 < 0) {
							int i_296_ = i_294_;
							int i_297_ = i_294_;
							int i_298_ = i;
							int i_299_ = i;
							Class293 class293_300_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_295_][i_296_ - 1]);
							int i_301_;
							for (i_301_ = ((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_295_, i_294_, 65280); (i_296_ > 0 && class293_300_ != null && ((Class293) class293_300_).aShort3508 < 0 && (((Class293) class293_300_).aShort3508 == ((Class293) class293).aShort3508) && (((Class293) class293_300_).aShort3501 == ((Class293) class293).aShort3501) && (i_301_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_295_, i_296_ - 1, 65280)))
									&& (i_296_ - 1 <= 0 || (i_301_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_295_, i_296_ - 2, 65280)))) && i_297_ - i_296_ <= 10); class293_300_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_295_][i_296_ - 1]))
								i_296_--;
							for (class293_300_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_295_][i_297_ + 1]); (i_297_ < (((Class201) this).aClass206_2546.anInt2603) * -18177099 && class293_300_ != null && ((Class293) class293_300_).aShort3508 < 0 && (((Class293) class293_300_).aShort3508 == ((Class293) class293).aShort3508) && (((Class293) class293_300_).aShort3501 == ((Class293) class293).aShort3501)
									&& (i_301_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_295_, i_297_ + 1, 65280))) && (i_297_ + 1 >= (((Class201) this).aClass206_2546.anInt2603) * -18177099 || (i_301_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_295_, i_297_ + 2, 65280)))) && i_297_ - i_296_ <= 10); class293_300_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_295_][i_297_ + 1]))
								i_297_++;
							int i_302_ = i_299_ - i_298_ + 1;
							int i_303_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_298_ + 1 : i_298_].method6722(i_295_, i_296_, 65280);
							int i_304_ = i_303_ + (((Class293) class293).aShort3508 * i_302_);
							int i_305_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_298_ + 1 : i_298_].method6722(i_295_, i_297_ + 1, 65280);
							int i_306_ = i_305_ + (((Class293) class293).aShort3508 * i_302_);
							int i_307_ = i_295_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_308_ = i_296_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_309_ = ((i_297_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293) + (((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2593 * 1885735347));
							((Class201) this).aClass231Array2555[((Class201) this).anInt2545++] = (new Class231(((Class201) this).aClass206_2546, 1, i_299_, i_307_ + ((Class293) class293).aShort3501, i_307_ + ((Class293) class293).aShort3501, i_307_ + ((Class293) class293).aShort3501, i_307_ + ((Class293) class293).aShort3501, i_303_, i_305_, i_306_, i_304_, i_308_, i_309_, i_309_, i_308_));
							for (int i_310_ = i_298_; i_310_ <= i_299_; i_310_++) {
								for (int i_311_ = i_296_; i_311_ <= i_297_; i_311_++)
									((Class293) (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_310_][i_295_][i_311_])).aShort3508 *= -1;
							}
						}
						if (((Class293) class293).aShort3510 < 0) {
							int i_312_ = i_295_;
							int i_313_ = i_295_;
							int i_314_ = i;
							int i_315_ = i;
							Class293 class293_316_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_312_ - 1][i_294_]);
							int i_317_;
							for (i_317_ = ((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_295_, i_294_, 65280); (i_312_ > 0 && class293_316_ != null && ((Class293) class293_316_).aShort3510 < 0 && (((Class293) class293_316_).aShort3510 == ((Class293) class293).aShort3510) && (((Class293) class293_316_).aShort3511 == ((Class293) class293).aShort3511) && (i_317_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_312_ - 1, i_294_, 65280)))
									&& (i_312_ - 1 <= 0 || (i_317_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_312_ - 2, i_294_, 65280)))) && i_313_ - i_312_ <= 10); class293_316_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_312_ - 1][i_294_]))
								i_312_--;
							for (class293_316_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_313_ + 1][i_294_]); (i_313_ < (((Class201) this).aClass206_2546.anInt2617) * -1912960305 && class293_316_ != null && ((Class293) class293_316_).aShort3510 < 0 && (((Class293) class293_316_).aShort3510 == ((Class293) class293).aShort3510) && (((Class293) class293_316_).aShort3511 == ((Class293) class293).aShort3511)
									&& (i_317_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_313_ + 1, i_294_, 65280))) && (i_313_ + 1 >= (((Class201) this).aClass206_2546.anInt2617) * -1912960305 || (i_317_ == (((Class201) this).aClass206_2546.aClass390Array2607[i].method6722(i_313_ + 2, i_294_, 65280)))) && i_313_ - i_312_ <= 10); class293_316_ = (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i][i_313_ + 1][i_294_]))
								i_313_++;
							int i_318_ = i_315_ - i_314_ + 1;
							int i_319_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_314_ + 1 : i_314_].method6722(i_312_, i_294_, 65280);
							int i_320_ = i_319_ + (((Class293) class293).aShort3510 * i_318_);
							int i_321_ = ((Class201) this).aClass206_2546.aClass390Array2607[bool ? i_314_ + 1 : i_314_].method6722(i_313_ + 1, i_294_, 65280);
							int i_322_ = i_321_ + (((Class293) class293).aShort3510 * i_318_);
							int i_323_ = i_312_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							int i_324_ = ((i_313_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293) + (((SceneObjectManager) (((Class201) this).aClass206_2546)).anInt2593 * 1885735347));
							int i_325_ = i_294_ << (((Class201) this).aClass206_2546.anInt2592) * -1928575293;
							((Class201) this).aClass231Array2555[((Class201) this).anInt2545++] = (new Class231(((Class201) this).aClass206_2546, 2, i_315_, i_323_, i_324_, i_324_, i_323_, i_319_, i_321_, i_322_, i_320_, i_325_ + ((Class293) class293).aShort3511, i_325_ + ((Class293) class293).aShort3511, i_325_ + ((Class293) class293).aShort3511, (i_325_ + ((Class293) class293).aShort3511)));
							for (int i_326_ = i_314_; i_326_ <= i_315_; i_326_++) {
								for (int i_327_ = i_312_; i_327_ <= i_313_; i_327_++)
									((Class293) (((Class201) this).aClass206_2546.aClass293ArrayArrayArray2604[i_326_][i_327_][i_294_])).aShort3510 *= -1;
							}
						}
					}
				}
			}
		}
		((Class201) this).aBool2548 = true;
	}
}
