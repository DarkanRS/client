/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerAppearance {
	static int[] anIntArray2917 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	public static final int anInt2918 = 1073741824;
	public static final int anInt2919 = -2147483648;
	static SoftCache aClass229_2920 = new SoftCache(260);
	int[] anIntArray2921;
	MeshModifier[] aClass422Array2922;
	public int[] colors;
	static final int anInt2924 = 1073741823;
	int anInt2925;
	long aLong2926;
	long aLong2927;
	public int anInt2928 = -232890067;
	public boolean aBool2929;
	static SoftCache aClass229_2930 = new SoftCache(5);

	void method3991(byte i) {
		long[] ls = RsByteBuffer.aLongArray7979;
		((PlayerAppearance) this).aLong2926 = 9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815 >> 8)) & 0xffL)]) * -9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815)) & 0xffL)]));
		for (int i_0_ = 0; i_0_ < ((PlayerAppearance) this).anIntArray2921.length; i_0_++) {
			((PlayerAppearance) this).aLong2926 = (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i_0_] >> 24)) & 0xffL)])) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i_0_] >> 16)) & 0xffL)])) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) ((((PlayerAppearance) this).anIntArray2921[i_0_]) >> 8)) & 0xffL)]));
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((PlayerAppearance) this).anIntArray2921[i_0_]) & 0xffL)])) * -9195927454341211745L;
		}
		if (null != ((PlayerAppearance) this).aClass422Array2922) {
			for (int i_1_ = 0; i_1_ < ((PlayerAppearance) this).aClass422Array2922.length; i_1_++) {
				if (((PlayerAppearance) this).aClass422Array2922[i_1_] != null) {
					int[] is;
					int[] is_2_;
					if (aBool2929) {
						is = (((PlayerAppearance) this).aClass422Array2922[i_1_].femaleBody);
						is_2_ = (((PlayerAppearance) this).aClass422Array2922[i_1_].femaleHeads);
					} else {
						is = (((PlayerAppearance) this).aClass422Array2922[i_1_].maleBody);
						is_2_ = (((PlayerAppearance) this).aClass422Array2922[i_1_].maleHeads);
					}
					if (is != null) {
						for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (is[i_3_] >> 8)) & 0xffL)]));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) is[i_3_]) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (is_2_ != null) {
						for (int i_4_ = 0; i_4_ < is_2_.length; i_4_++) {
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (is_2_[i_4_] >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) is_2_[i_4_]) & 0xffL)])) * -9195927454341211745L);
						}
					}
					if (null != (((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedColors)) {
						for (int i_5_ = 0; i_5_ < (((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedColors).length; i_5_++) {
							((PlayerAppearance) this).aLong2926 = (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedColors[i_5_]) >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedColors[i_5_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if ((((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedTextures) != null) {
						for (int i_6_ = 0; i_6_ < (((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedTextures).length; i_6_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedTextures[i_6_]) >> 8)) & 0xffL)])));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i_1_].modifiedTextures[i_6_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
				}
			}
		}
		for (int i_7_ = 0; i_7_ < 10; i_7_++)
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) colors[i_7_]) & 0xffL)]));
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (aBool2929 ? 1 : 0)) & 0xffL)]));
	}

	public void method3992(int i, int[] is, MeshModifier[] class422s, int[] is_8_, boolean bool, int i_9_, int i_10_) {
		if (-1483086815 * ((PlayerAppearance) this).anInt2925 != i)
			((PlayerAppearance) this).anInt2925 = i * 995008481;
		((PlayerAppearance) this).anIntArray2921 = is;
		((PlayerAppearance) this).aClass422Array2922 = class422s;
		colors = is_8_;
		aBool2929 = bool;
		anInt2928 = 232890067 * i_9_;
		method3991((byte) 3);
	}

	public void method3993(int i, int i_11_, Class31 class31, int i_12_) {
		int i_13_ = anIntArray2917[i];
		if (class31.method800(i_11_, 1435454406) != null) {
			((PlayerAppearance) this).anIntArray2921[i_13_] = i_11_ | ~0x7fffffff;
			method3991((byte) 3);
		}
	}

	void method3994() {
		long[] ls = RsByteBuffer.aLongArray7979;
		((PlayerAppearance) this).aLong2926 = 9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815 >> 8)) & 0xffL)]) * -9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815)) & 0xffL)]));
		for (int i = 0; i < ((PlayerAppearance) this).anIntArray2921.length; i++) {
			((PlayerAppearance) this).aLong2926 = (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 24)) & 0xffL)]) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 16)) & 0xffL)]) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 8)) & 0xffL)])));
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((PlayerAppearance) this).anIntArray2921[i]) & 0xffL)]) * -9195927454341211745L;
		}
		if (null != ((PlayerAppearance) this).aClass422Array2922) {
			for (int i = 0; i < ((PlayerAppearance) this).aClass422Array2922.length; i++) {
				if (((PlayerAppearance) this).aClass422Array2922[i] != null) {
					int[] is;
					int[] is_14_;
					if (aBool2929) {
						is = (((PlayerAppearance) this).aClass422Array2922[i].femaleBody);
						is_14_ = (((PlayerAppearance) this).aClass422Array2922[i].femaleHeads);
					} else {
						is = (((PlayerAppearance) this).aClass422Array2922[i].maleBody);
						is_14_ = (((PlayerAppearance) this).aClass422Array2922[i].maleHeads);
					}
					if (is != null) {
						for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (is[i_15_] >> 8)) & 0xffL)]));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) is[i_15_]) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (is_14_ != null) {
						for (int i_16_ = 0; i_16_ < is_14_.length; i_16_++) {
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (is_14_[i_16_] >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) is_14_[i_16_]) & 0xffL)])) * -9195927454341211745L);
						}
					}
					if (null != (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors)) {
						for (int i_17_ = 0; i_17_ < (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors).length; i_17_++) {
							((PlayerAppearance) this).aLong2926 = (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i].modifiedColors[i_17_]) >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors[i_17_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures != null) {
						for (int i_18_ = 0; i_18_ < (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures).length; i_18_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures[i_18_]) >> 8)) & 0xffL)])));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures[i_18_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) colors[i]) & 0xffL)]));
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (aBool2929 ? 1 : 0)) & 0xffL)]));
	}

	public void method3995(int i, int i_19_, ItemIndexLoader class426, byte i_20_) {
		if (i_19_ == -1)
			((PlayerAppearance) this).anIntArray2921[i] = 0;
		else if (class426.getItemDefinitions(i_19_, 115625832) != null) {
			((PlayerAppearance) this).anIntArray2921[i] = i_19_ | 0x40000000;
			method3991((byte) 3);
		}
	}

	public MeshRasterizer method3996(GraphicalRenderer class505, int i, Class31 class31, Class523 class523, Class456 class456, int i_21_, int i_22_, int i_23_) {
		int i_24_ = class456 != null ? i | class456.method7640(-1572860046) : i;
		long l = (long) i_23_ << 32 | (long) (i_22_ << 16) | (long) i_21_;
		MeshRasterizer class528;
		synchronized (aClass229_2930) {
			class528 = (MeshRasterizer) aClass229_2930.get(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i_24_) != 0) {
			if (null != class528)
				i_24_ = class505.method8546(i_24_, class528.m());
			int i_25_ = i_24_;
			RSMesh[] class157s = new RSMesh[3];
			int i_26_ = 0;
			if (class31.method800(i_21_, 521580729).method900(36053) && class31.method800(i_22_, 1562899129).method900(36053) && class31.method800(i_23_, -79985536).method900(36053)) {
				RSMesh class157 = class31.method800(i_21_, 255571624).method895(-1575455554);
				if (null != class157)
					class157s[i_26_++] = class157;
				class157 = class31.method800(i_22_, 226578063).method895(1018390836);
				if (null != class157)
					class157s[i_26_++] = class157;
				class157 = class31.method800(i_23_, 1294232417).method895(-1948392489);
				if (class157 != null)
					class157s[i_26_++] = class157;
				class157 = new RSMesh(class157s, i_26_);
				i_25_ |= 0x4000;
				class528 = class505.createMeshRasterizer(class157, i_25_, Class149.anInt1744 * -127031115, 64, 768);
				for (int i_27_ = 0; i_27_ < 10; i_27_++) {
					for (int i_28_ = 0; i_28_ < (AbstractQueue_Sub1.skinColors[i_27_]).length; i_28_++) {
						if (colors[i_27_] < (Class366.skinColors[i_27_][i_28_]).length)
							class528.X((AbstractQueue_Sub1.skinColors[i_27_][i_28_]), (Class366.skinColors[i_27_][i_28_][colors[i_27_]]));
					}
				}
				class528.KA(i_24_);
				synchronized (aClass229_2930) {
					aClass229_2930.put(class528, l);
				}
			} else
				return null;
		}
		if (class456 == null)
			return class528;
		class528 = class528.method11289((byte) 4, i_24_, true);
		class456.method7577(class528, 0, 16711935);
		return class528;
	}

	public MeshRasterizer method3997(GraphicalRenderer class505, int i, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) 100).method6880(class505, i, interface42, class456, null, 1737411260));
		int i_29_ = null != class456 ? i | class456.method7640(-1639744740) : i;
		MeshRasterizer class528;
		synchronized (aClass229_2930) {
			class528 = ((MeshRasterizer) aClass229_2930.get(-6800555520516554145L * ((PlayerAppearance) this).aLong2926));
		}
		if (class528 == null || class505.method8452(class528.m(), i_29_) != 0) {
			if (class528 != null)
				i_29_ = class505.method8546(i_29_, class528.m());
			int i_30_ = i_29_;
			boolean bool = false;
			for (int i_31_ = 0; i_31_ < ((PlayerAppearance) this).anIntArray2921.length; i_31_++) {
				int i_32_ = ((PlayerAppearance) this).anIntArray2921[i_31_];
				MeshModifier class422 = null;
				if (0 != (i_32_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && null != ((PlayerAppearance) this).aClass422Array2922[i_31_])
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_31_];
					if (!class426.getItemDefinitions(i_32_ & 0x3fffffff, 1739128278).headMeshesReady(aBool2929, class422, -2079589755))
						bool = true;
				} else if ((i_32_ & ~0x7fffffff) != 0 && !class31.method800(i_32_ & 0x3fffffff, 1687930397).method900(36053))
					bool = true;
			}
			if (bool)
				return null;
			RSMesh[] class157s = new RSMesh[((PlayerAppearance) this).anIntArray2921.length];
			int i_33_ = 0;
			for (int i_34_ = 0; i_34_ < ((PlayerAppearance) this).anIntArray2921.length; i_34_++) {
				int i_35_ = ((PlayerAppearance) this).anIntArray2921[i_34_];
				MeshModifier class422 = null;
				if (0 != (i_35_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && ((PlayerAppearance) this).aClass422Array2922[i_34_] != null)
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_34_];
					RSMesh class157 = class426.getItemDefinitions(i_35_ & 0x3fffffff, 1215609914).getHeadMesh(aBool2929, class422, -1646472294);
					if (null != class157)
						class157s[i_33_++] = class157;
				} else if ((i_35_ & ~0x7fffffff) != 0) {
					RSMesh class157 = class31.method800(i_35_ & 0x3fffffff, 566935069).method895(1212743403);
					if (class157 != null)
						class157s[i_33_++] = class157;
				}
			}
			RSMesh class157 = new RSMesh(class157s, i_33_);
			i_30_ |= 0x4000;
			class528 = class505.createMeshRasterizer(class157, i_30_, -127031115 * Class149.anInt1744, 64, 768);
			for (int i_36_ = 0; i_36_ < 10; i_36_++) {
				for (int i_37_ = 0; i_37_ < (AbstractQueue_Sub1.skinColors[i_36_]).length; i_37_++) {
					if (colors[i_36_] < (Class366.skinColors[i_36_][i_37_]).length)
						class528.X((AbstractQueue_Sub1.skinColors[i_36_][i_37_]), (Class366.skinColors[i_36_][i_37_][colors[i_36_]]));
				}
			}
			class528.KA(i_29_);
			synchronized (aClass229_2930) {
				aClass229_2930.put(class528, (((PlayerAppearance) this).aLong2926 * -6800555520516554145L));
			}
		}
		if (class456 == null)
			return class528;
		MeshRasterizer class528_38_ = class528.method11289((byte) 4, i_29_, true);
		class456.method7577(class528_38_, 0, 16711935);
		return class528_38_;
	}

	public MeshRasterizer method3998(GraphicalRenderer class505, int i, Class211 class211, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456, Class456 class456_39_, Class456[] class456s, int[] is, int i_40_, boolean bool, Class526 class526, short i_41_) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) -32).method6875(class505, i, class211, interface42, class456, class456_39_, class456s, is, i_40_, null, 2039422694));
		int i_42_ = i;
		long l = -6800555520516554145L * ((PlayerAppearance) this).aLong2926;
		int[] is_43_ = ((PlayerAppearance) this).anIntArray2921;
		boolean bool_44_ = false;
		boolean bool_45_ = false;
		if (null != class456) {
			Class518 class518 = class456.method7565(-1632742162);
			if (class518 != null && (class518.anInt5917 * -516792901 >= 0 || class518.anInt5918 * -1325291837 >= 0)) {
				is_43_ = new int[((PlayerAppearance) this).anIntArray2921.length];
				for (int i_46_ = 0; i_46_ < is_43_.length; i_46_++)
					is_43_[i_46_] = ((PlayerAppearance) this).anIntArray2921[i_46_];
				if (-516792901 * class518.anInt5917 >= 0 && -1 != -333243893 * class526.anInt6990) {
					bool_44_ = true;
					if (65535 == class518.anInt5917 * -516792901) {
						is_43_[-333243893 * class526.anInt6990] = 0;
						for (int i_47_ = 0; i_47_ < class526.anIntArray6992.length; i_47_++)
							is_43_[class526.anIntArray6992[i_47_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_43_[class526.anInt6990 * -333243893] = -516792901 * class518.anInt5917 | 0x40000000;
						for (int i_48_ = 0; i_48_ < class526.anIntArray6992.length; i_48_++)
							is_43_[class526.anIntArray6992[i_48_]] = 0;
						l ^= ((long) is_43_[class526.anInt6990 * -333243893] << 32);
					}
				}
				if (-1325291837 * class518.anInt5918 >= 0 && -1 != class526.anInt6991 * 847181775) {
					bool_45_ = true;
					if (class518.anInt5918 * -1325291837 == 65535) {
						is_43_[847181775 * class526.anInt6991] = 0;
						for (int i_49_ = 0; i_49_ < class526.anIntArray6993.length; i_49_++)
							is_43_[class526.anIntArray6993[i_49_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_43_[847181775 * class526.anInt6991] = -1325291837 * class518.anInt5918 | 0x40000000;
						for (int i_50_ = 0; i_50_ < class526.anIntArray6993.length; i_50_++)
							is_43_[class526.anIntArray6993[i_50_]] = 0;
						l ^= (long) is_43_[class526.anInt6991 * 847181775];
					}
				}
			}
		}
		boolean bool_51_ = false;
		int i_52_ = null != class456s ? class456s.length : 0;
		for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
			if (class456s[i_53_] != null) {
				i_42_ |= class456s[i_53_].method7640(-1188538690);
				bool_51_ = true;
			}
		}
		if (null != class456) {
			i_42_ |= class456.method7640(-1468207471);
			bool_51_ = true;
		}
		if (null != class456_39_) {
			i_42_ |= class456_39_.method7640(-1978063837);
			bool_51_ = true;
		}
		boolean bool_54_ = false;
		if (null != is) {
			for (int i_55_ = 0; i_55_ < is.length; i_55_++) {
				if (is[i_55_] != -1) {
					i_42_ |= 0x20;
					bool_54_ = true;
				}
			}
		}
		MeshRasterizer class528;
		synchronized (aClass229_2920) {
			class528 = (MeshRasterizer) aClass229_2920.get(l);
		}
		Class227 class227 = null;
		if (-1 != -1483086815 * ((PlayerAppearance) this).anInt2925)
			class227 = class211.method3616((((PlayerAppearance) this).anInt2925 * -1483086815), (byte) 62);
		if (null == class528 || class505.method8452(class528.m(), i_42_) != 0) {
			if (class528 != null)
				i_42_ = class505.method8546(i_42_, class528.m());
			int i_56_ = i_42_;
			boolean bool_57_ = false;
			for (int i_58_ = 0; i_58_ < is_43_.length; i_58_++) {
				int i_59_ = is_43_[i_58_];
				MeshModifier class422 = null;
				boolean bool_60_ = false;
				if (bool_44_) {
					if (class526.anInt6990 * -333243893 == i_58_)
						bool_60_ = true;
					else {
						for (int i_61_ = 0; i_61_ < class526.anIntArray6992.length; i_61_++) {
							if (class526.anIntArray6992[i_61_] == i_58_) {
								bool_60_ = true;
								break;
							}
						}
					}
				}
				if (bool_45_) {
					if (class526.anInt6991 * 847181775 == i_58_)
						bool_60_ = true;
					else {
						for (int i_62_ = 0; i_62_ < class526.anIntArray6993.length; i_62_++) {
							if (i_58_ == class526.anIntArray6993[i_62_]) {
								bool_60_ = true;
								break;
							}
						}
					}
				}
				if ((i_59_ & 0x40000000) != 0) {
					if (!bool_60_ && ((PlayerAppearance) this).aClass422Array2922 != null && ((PlayerAppearance) this).aClass422Array2922[i_58_] != null)
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_58_];
					if (!class426.getItemDefinitions(i_59_ & 0x3fffffff, 865631179).bodyMeshesReady(aBool2929, class422, -1830991961))
						bool_57_ = true;
				} else if (0 != (i_59_ & ~0x7fffffff) && !class31.method800(i_59_ & 0x3fffffff, 1122652918).method898(-965716691))
					bool_57_ = true;
			}
			if (bool_57_) {
				if (-2249810898304743821L * ((PlayerAppearance) this).aLong2927 != -1L) {
					synchronized (aClass229_2920) {
						class528 = ((MeshRasterizer) aClass229_2920.get(-2249810898304743821L * (((PlayerAppearance) this).aLong2927)));
					}
				}
				if (class528 == null || class505.method8452(class528.m(), i_42_) != 0)
					return null;
			} else {
				RSMesh[] class157s = new RSMesh[is_43_.length];
				for (int i_63_ = 0; i_63_ < is_43_.length; i_63_++) {
					int i_64_ = is_43_[i_63_];
					MeshModifier class422 = null;
					boolean bool_65_ = 5 == i_63_ && bool_44_ || i_63_ == 3 && bool_45_;
					if (0 != (i_64_ & 0x40000000)) {
						if (!bool_65_ && ((PlayerAppearance) this).aClass422Array2922 != null && null != (((PlayerAppearance) this).aClass422Array2922[i_63_]))
							class422 = ((PlayerAppearance) this).aClass422Array2922[i_63_];
						RSMesh class157 = class426.getItemDefinitions(i_64_ & 0x3fffffff, 489246789).getBodyMesh(aBool2929, class422, 710746900);
						if (null != class157)
							class157s[i_63_] = class157;
					} else if (0 != (i_64_ & ~0x7fffffff)) {
						RSMesh class157 = class31.method800(i_64_ & 0x3fffffff, -33767981).method899(-1947876301);
						if (null != class157)
							class157s[i_63_] = class157;
					}
				}
				if (null != class227 && null != class227.anIntArrayArray2802) {
					for (int i_66_ = 0; i_66_ < class227.anIntArrayArray2802.length; i_66_++) {
						if (class157s[i_66_] != null) {
							int i_67_ = 0;
							int i_68_ = 0;
							int i_69_ = 0;
							int i_70_ = 0;
							int i_71_ = 0;
							int i_72_ = 0;
							if (class227.anIntArrayArray2802[i_66_] != null) {
								i_67_ = class227.anIntArrayArray2802[i_66_][0];
								i_68_ = class227.anIntArrayArray2802[i_66_][1];
								i_69_ = class227.anIntArrayArray2802[i_66_][2];
								i_70_ = (class227.anIntArrayArray2802[i_66_][3] << 3);
								i_71_ = (class227.anIntArrayArray2802[i_66_][4] << 3);
								i_72_ = (class227.anIntArrayArray2802[i_66_][5] << 3);
							}
							if (0 != i_70_ || 0 != i_71_ || 0 != i_72_)
								class157s[i_66_].method2671(i_70_, i_71_, i_72_);
							if (0 != i_67_ || 0 != i_68_ || 0 != i_69_)
								class157s[i_66_].method2712(i_67_, i_68_, i_69_);
						}
					}
				}
				RSMesh class157 = new RSMesh(class157s, class157s.length);
				i_56_ |= 0x4000;
				class528 = class505.createMeshRasterizer(class157, i_56_, Class149.anInt1744 * -127031115, 64, 850);
				for (int i_73_ = 0; i_73_ < 10; i_73_++) {
					for (int i_74_ = 0; i_74_ < (AbstractQueue_Sub1.skinColors[i_73_]).length; i_74_++) {
						if (colors[i_73_] < (Class366.skinColors[i_73_][i_74_]).length)
							class528.X((AbstractQueue_Sub1.skinColors[i_73_][i_74_]), (Class366.skinColors[i_73_][i_74_][colors[i_73_]]));
					}
				}
				if (bool) {
					class528.KA(i_42_);
					synchronized (aClass229_2920) {
						aClass229_2920.put(class528, l);
					}
					((PlayerAppearance) this).aLong2927 = l * -6835014681310605637L;
				}
			}
		}
		MeshRasterizer class528_75_ = class528.method11289((byte) 4, i_42_, true);
		if (!bool_51_ && !bool_54_)
			return class528_75_;
		Class294[] class294s = null;
		if (null != class227)
			class294s = class227.method3811((byte) 98);
		if (bool_54_ && null != class294s) {
			for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
				if (class294s[i_76_] != null)
					class528_75_.method11298(class294s[i_76_], 1 << i_76_, true);
			}
		}
		int i_77_ = 0;
		int i_78_ = 1;
		while (i_77_ < i_52_) {
			if (null != class456s[i_77_])
				class456s[i_77_].method7578(class528_75_, 0, i_78_, 892744834);
			i_77_++;
			i_78_ <<= 1;
		}
		if (bool_54_) {
			for (i_77_ = 0; i_77_ < is.length; i_77_++) {
				if (-1 != is[i_77_]) {
					i_78_ = is[i_77_] - i_40_;
					i_78_ &= 0x3fff;
					Class294 class294 = new Class294();
					class294.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_78_));
					class528_75_.method11298(class294, 1 << i_77_, false);
				}
			}
		}
		if (bool_54_ && class294s != null) {
			for (i_77_ = 0; i_77_ < is.length; i_77_++) {
				if (null != class294s[i_77_])
					class528_75_.method11298(class294s[i_77_], 1 << i_77_, false);
			}
		}
		if (class456 != null && class456_39_ != null)
			Class521_Sub1_Sub3_Sub1.method16078(class528_75_, class456, class456_39_, -484588693);
		else if (class456 != null)
			class456.method7577(class528_75_, 0, 16711935);
		else if (null != class456_39_)
			class456_39_.method7577(class528_75_, 0, 16711935);
		return class528_75_;
	}

	public MeshRasterizer method3999(GraphicalRenderer class505, int i, Class31 class31, Class523 class523, Class456 class456, int i_79_, int i_80_, int i_81_, int i_82_) {
		int i_83_ = class456 != null ? i | class456.method7640(-1959438084) : i;
		long l = (long) i_81_ << 32 | (long) (i_80_ << 16) | (long) i_79_;
		MeshRasterizer class528;
		synchronized (aClass229_2930) {
			class528 = (MeshRasterizer) aClass229_2930.get(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i_83_) != 0) {
			if (null != class528)
				i_83_ = class505.method8546(i_83_, class528.m());
			int i_84_ = i_83_;
			RSMesh[] class157s = new RSMesh[3];
			int i_85_ = 0;
			if (class31.method800(i_79_, 2136015066).method900(36053) && class31.method800(i_80_, 1449973284).method900(36053) && class31.method800(i_81_, 327347634).method900(36053)) {
				RSMesh class157 = class31.method800(i_79_, 23864498).method895(246816839);
				if (null != class157)
					class157s[i_85_++] = class157;
				class157 = class31.method800(i_80_, 283433208).method895(1834406332);
				if (null != class157)
					class157s[i_85_++] = class157;
				class157 = class31.method800(i_81_, 644064518).method895(1598273380);
				if (class157 != null)
					class157s[i_85_++] = class157;
				class157 = new RSMesh(class157s, i_85_);
				i_84_ |= 0x4000;
				class528 = class505.createMeshRasterizer(class157, i_84_, Class149.anInt1744 * -127031115, 64, 768);
				for (int i_86_ = 0; i_86_ < 10; i_86_++) {
					for (int i_87_ = 0; i_87_ < (AbstractQueue_Sub1.skinColors[i_86_]).length; i_87_++) {
						if (colors[i_86_] < (Class366.skinColors[i_86_][i_87_]).length)
							class528.X((AbstractQueue_Sub1.skinColors[i_86_][i_87_]), (Class366.skinColors[i_86_][i_87_][colors[i_86_]]));
					}
				}
				class528.KA(i_83_);
				synchronized (aClass229_2930) {
					aClass229_2930.put(class528, l);
				}
			} else
				return null;
		}
		if (class456 == null)
			return class528;
		class528 = class528.method11289((byte) 4, i_83_, true);
		class456.method7577(class528, 0, 16711935);
		return class528;
	}

	public void method4000(int i, int[] is, MeshModifier[] class422s, int[] is_88_, boolean bool, int i_89_) {
		if (-1483086815 * ((PlayerAppearance) this).anInt2925 != i)
			((PlayerAppearance) this).anInt2925 = i * 995008481;
		((PlayerAppearance) this).anIntArray2921 = is;
		((PlayerAppearance) this).aClass422Array2922 = class422s;
		colors = is_88_;
		aBool2929 = bool;
		anInt2928 = 232890067 * i_89_;
		method3991((byte) 3);
	}

	public static int method4001() {
		synchronized (aClass229_2920) {
			int i = aClass229_2920.method3862((byte) 2);
			return i;
		}
	}

	public void method4002(int i, int[] is, MeshModifier[] class422s, int[] is_90_, boolean bool, int i_91_) {
		if (-1483086815 * ((PlayerAppearance) this).anInt2925 != i)
			((PlayerAppearance) this).anInt2925 = i * 995008481;
		((PlayerAppearance) this).anIntArray2921 = is;
		((PlayerAppearance) this).aClass422Array2922 = class422s;
		colors = is_90_;
		aBool2929 = bool;
		anInt2928 = 232890067 * i_91_;
		method3991((byte) 3);
	}

	public void method4003(boolean bool, int i) {
		aBool2929 = bool;
		method3991((byte) 3);
	}

	public void method4004(int i, int i_92_, Class31 class31) {
		int i_93_ = anIntArray2917[i];
		if (class31.method800(i_92_, 674551392) != null) {
			((PlayerAppearance) this).anIntArray2921[i_93_] = i_92_ | ~0x7fffffff;
			method3991((byte) 3);
		}
	}

	public void method4005(int i, int i_94_, Class31 class31) {
		int i_95_ = anIntArray2917[i];
		if (class31.method800(i_94_, 9964818) != null) {
			((PlayerAppearance) this).anIntArray2921[i_95_] = i_94_ | ~0x7fffffff;
			method3991((byte) 3);
		}
	}

	public void method4006(int i, int i_96_) {
		colors[i] = i_96_;
		method3991((byte) 3);
	}

	public void method4007(int i, int i_97_) {
		colors[i] = i_97_;
		method3991((byte) 3);
	}

	public MeshRasterizer method4008(GraphicalRenderer class505, int i, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) 42).method6880(class505, i, interface42, class456, null, 1842006915));
		int i_98_ = null != class456 ? i | class456.method7640(-1637762744) : i;
		MeshRasterizer class528;
		synchronized (aClass229_2930) {
			class528 = ((MeshRasterizer) aClass229_2930.get(-6800555520516554145L * ((PlayerAppearance) this).aLong2926));
		}
		if (class528 == null || class505.method8452(class528.m(), i_98_) != 0) {
			if (class528 != null)
				i_98_ = class505.method8546(i_98_, class528.m());
			int i_99_ = i_98_;
			boolean bool = false;
			for (int i_100_ = 0; i_100_ < ((PlayerAppearance) this).anIntArray2921.length; i_100_++) {
				int i_101_ = ((PlayerAppearance) this).anIntArray2921[i_100_];
				MeshModifier class422 = null;
				if (0 != (i_101_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && (null != ((PlayerAppearance) this).aClass422Array2922[i_100_]))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_100_];
					if (!class426.getItemDefinitions(i_101_ & 0x3fffffff, 1561532574).headMeshesReady(aBool2929, class422, -2079589755))
						bool = true;
				} else if ((i_101_ & ~0x7fffffff) != 0 && !class31.method800(i_101_ & 0x3fffffff, -175439170).method900(36053))
					bool = true;
			}
			if (bool)
				return null;
			RSMesh[] class157s = new RSMesh[((PlayerAppearance) this).anIntArray2921.length];
			int i_102_ = 0;
			for (int i_103_ = 0; i_103_ < ((PlayerAppearance) this).anIntArray2921.length; i_103_++) {
				int i_104_ = ((PlayerAppearance) this).anIntArray2921[i_103_];
				MeshModifier class422 = null;
				if (0 != (i_104_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && (((PlayerAppearance) this).aClass422Array2922[i_103_] != null))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_103_];
					RSMesh class157 = class426.getItemDefinitions(i_104_ & 0x3fffffff, 1998841702).getHeadMesh(aBool2929, class422, -1198252688);
					if (null != class157)
						class157s[i_102_++] = class157;
				} else if ((i_104_ & ~0x7fffffff) != 0) {
					RSMesh class157 = class31.method800(i_104_ & 0x3fffffff, 1056298163).method895(-1381337478);
					if (class157 != null)
						class157s[i_102_++] = class157;
				}
			}
			RSMesh class157 = new RSMesh(class157s, i_102_);
			i_99_ |= 0x4000;
			class528 = class505.createMeshRasterizer(class157, i_99_, -127031115 * Class149.anInt1744, 64, 768);
			for (int i_105_ = 0; i_105_ < 10; i_105_++) {
				for (int i_106_ = 0; i_106_ < (AbstractQueue_Sub1.skinColors[i_105_]).length; i_106_++) {
					if (colors[i_105_] < (Class366.skinColors[i_105_][i_106_]).length)
						class528.X((AbstractQueue_Sub1.skinColors[i_105_][i_106_]), (Class366.skinColors[i_105_][i_106_][colors[i_105_]]));
				}
			}
			class528.KA(i_98_);
			synchronized (aClass229_2930) {
				aClass229_2930.put(class528, (((PlayerAppearance) this).aLong2926 * -6800555520516554145L));
			}
		}
		if (class456 == null)
			return class528;
		MeshRasterizer class528_107_ = class528.method11289((byte) 4, i_98_, true);
		class456.method7577(class528_107_, 0, 16711935);
		return class528_107_;
	}

	public void method4009(boolean bool) {
		aBool2929 = bool;
		method3991((byte) 3);
	}

	public void method4010(boolean bool) {
		aBool2929 = bool;
		method3991((byte) 3);
	}

	public void method4011(int i, int i_108_, ItemIndexLoader class426) {
		if (i_108_ == -1)
			((PlayerAppearance) this).anIntArray2921[i] = 0;
		else if (class426.getItemDefinitions(i_108_, 77617223) != null) {
			((PlayerAppearance) this).anIntArray2921[i] = i_108_ | 0x40000000;
			method3991((byte) 3);
		}
	}

	public void method4012(int i, int i_109_, ItemIndexLoader class426) {
		if (i_109_ == -1)
			((PlayerAppearance) this).anIntArray2921[i] = 0;
		else if (class426.getItemDefinitions(i_109_, 690199612) != null) {
			((PlayerAppearance) this).anIntArray2921[i] = i_109_ | 0x40000000;
			method3991((byte) 3);
		}
	}

	void method4013() {
		long[] ls = RsByteBuffer.aLongArray7979;
		((PlayerAppearance) this).aLong2926 = 9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815 >> 8)) & 0xffL)]) * -9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815)) & 0xffL)]));
		for (int i = 0; i < ((PlayerAppearance) this).anIntArray2921.length; i++) {
			((PlayerAppearance) this).aLong2926 = (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 24)) & 0xffL)]) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 16)) & 0xffL)]) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 8)) & 0xffL)])));
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((PlayerAppearance) this).anIntArray2921[i]) & 0xffL)]) * -9195927454341211745L;
		}
		if (null != ((PlayerAppearance) this).aClass422Array2922) {
			for (int i = 0; i < ((PlayerAppearance) this).aClass422Array2922.length; i++) {
				if (((PlayerAppearance) this).aClass422Array2922[i] != null) {
					int[] is;
					int[] is_110_;
					if (aBool2929) {
						is = (((PlayerAppearance) this).aClass422Array2922[i].femaleBody);
						is_110_ = (((PlayerAppearance) this).aClass422Array2922[i].femaleHeads);
					} else {
						is = (((PlayerAppearance) this).aClass422Array2922[i].maleBody);
						is_110_ = (((PlayerAppearance) this).aClass422Array2922[i].maleHeads);
					}
					if (is != null) {
						for (int i_111_ = 0; i_111_ < is.length; i_111_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (is[i_111_] >> 8)) & 0xffL)]));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) is[i_111_]) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (is_110_ != null) {
						for (int i_112_ = 0; i_112_ < is_110_.length; i_112_++) {
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (is_110_[i_112_] >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) is_110_[i_112_]) & 0xffL)])) * -9195927454341211745L);
						}
					}
					if (null != (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors)) {
						for (int i_113_ = 0; i_113_ < (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors).length; i_113_++) {
							((PlayerAppearance) this).aLong2926 = (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i].modifiedColors[i_113_]) >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors[i_113_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures != null) {
						for (int i_114_ = 0; i_114_ < (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures).length; i_114_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures[i_114_]) >> 8)) & 0xffL)])));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures[i_114_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) colors[i]) & 0xffL)]));
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (aBool2929 ? 1 : 0)) & 0xffL)]));
	}

	public static void method4014() {
		synchronized (aClass229_2920) {
			aClass229_2920.method3863(1498855103);
		}
		synchronized (aClass229_2930) {
			aClass229_2930.method3863(1566156288);
		}
	}

	void method4015() {
		long[] ls = RsByteBuffer.aLongArray7979;
		((PlayerAppearance) this).aLong2926 = 9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815 >> 8)) & 0xffL)]) * -9195927454341211745L;
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anInt2925 * -1483086815)) & 0xffL)]));
		for (int i = 0; i < ((PlayerAppearance) this).anIntArray2921.length; i++) {
			((PlayerAppearance) this).aLong2926 = (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 24)) & 0xffL)]) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 16)) & 0xffL)]) * -9195927454341211745L;
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (((PlayerAppearance) this).anIntArray2921[i] >> 8)) & 0xffL)])));
			((PlayerAppearance) this).aLong2926 = (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((PlayerAppearance) this).anIntArray2921[i]) & 0xffL)]) * -9195927454341211745L;
		}
		if (null != ((PlayerAppearance) this).aClass422Array2922) {
			for (int i = 0; i < ((PlayerAppearance) this).aClass422Array2922.length; i++) {
				if (((PlayerAppearance) this).aClass422Array2922[i] != null) {
					int[] is;
					int[] is_115_;
					if (aBool2929) {
						is = (((PlayerAppearance) this).aClass422Array2922[i].femaleBody);
						is_115_ = (((PlayerAppearance) this).aClass422Array2922[i].femaleHeads);
					} else {
						is = (((PlayerAppearance) this).aClass422Array2922[i].maleBody);
						is_115_ = (((PlayerAppearance) this).aClass422Array2922[i].maleHeads);
					}
					if (is != null) {
						for (int i_116_ = 0; i_116_ < is.length; i_116_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (is[i_116_] >> 8)) & 0xffL)]));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) is[i_116_]) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (is_115_ != null) {
						for (int i_117_ = 0; i_117_ < is_115_.length; i_117_++) {
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) (is_115_[i_117_] >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) is_115_[i_117_]) & 0xffL)])) * -9195927454341211745L);
						}
					}
					if (null != (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors)) {
						for (int i_118_ = 0; i_118_ < (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors).length; i_118_++) {
							((PlayerAppearance) this).aLong2926 = (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) >>> 8 ^ (ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i].modifiedColors[i_118_]) >> 8)) & 0xffL)])) * -9195927454341211745L);
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i].modifiedColors[i_118_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
					if (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures != null) {
						for (int i_119_ = 0; i_119_ < (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures).length; i_119_++) {
							((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * ((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ (ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) ((((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures[i_119_]) >> 8)) & 0xffL)])));
							((PlayerAppearance) this).aLong2926 = (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (((PlayerAppearance) this).aClass422Array2922[i].modifiedTextures[i_119_])) & 0xffL)]) * -9195927454341211745L);
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (-6800555520516554145L * ((PlayerAppearance) this).aLong2926 >>> 8 ^ ls[(int) (((-6800555520516554145L * ((PlayerAppearance) this).aLong2926) ^ (long) colors[i]) & 0xffL)]));
		((PlayerAppearance) this).aLong2926 = (-9195927454341211745L * (((PlayerAppearance) this).aLong2926 * -6800555520516554145L >>> 8 ^ ls[(int) (((((PlayerAppearance) this).aLong2926 * -6800555520516554145L) ^ (long) (aBool2929 ? 1 : 0)) & 0xffL)]));
	}

	public MeshRasterizer method4016(GraphicalRenderer class505, int i, Class211 class211, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456, Class456 class456_120_, Class456[] class456s, int[] is, int i_121_, boolean bool, Class526 class526) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) 29).method6875(class505, i, class211, interface42, class456, class456_120_, class456s, is, i_121_, null, 1850728903));
		int i_122_ = i;
		long l = -6800555520516554145L * ((PlayerAppearance) this).aLong2926;
		int[] is_123_ = ((PlayerAppearance) this).anIntArray2921;
		boolean bool_124_ = false;
		boolean bool_125_ = false;
		if (null != class456) {
			Class518 class518 = class456.method7565(-1632742162);
			if (class518 != null && (class518.anInt5917 * -516792901 >= 0 || class518.anInt5918 * -1325291837 >= 0)) {
				is_123_ = new int[((PlayerAppearance) this).anIntArray2921.length];
				for (int i_126_ = 0; i_126_ < is_123_.length; i_126_++)
					is_123_[i_126_] = ((PlayerAppearance) this).anIntArray2921[i_126_];
				if (-516792901 * class518.anInt5917 >= 0 && -1 != -333243893 * class526.anInt6990) {
					bool_124_ = true;
					if (65535 == class518.anInt5917 * -516792901) {
						is_123_[-333243893 * class526.anInt6990] = 0;
						for (int i_127_ = 0; i_127_ < class526.anIntArray6992.length; i_127_++)
							is_123_[class526.anIntArray6992[i_127_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_123_[class526.anInt6990 * -333243893] = -516792901 * class518.anInt5917 | 0x40000000;
						for (int i_128_ = 0; i_128_ < class526.anIntArray6992.length; i_128_++)
							is_123_[class526.anIntArray6992[i_128_]] = 0;
						l ^= ((long) is_123_[class526.anInt6990 * -333243893] << 32);
					}
				}
				if (-1325291837 * class518.anInt5918 >= 0 && -1 != class526.anInt6991 * 847181775) {
					bool_125_ = true;
					if (class518.anInt5918 * -1325291837 == 65535) {
						is_123_[847181775 * class526.anInt6991] = 0;
						for (int i_129_ = 0; i_129_ < class526.anIntArray6993.length; i_129_++)
							is_123_[class526.anIntArray6993[i_129_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_123_[847181775 * class526.anInt6991] = -1325291837 * class518.anInt5918 | 0x40000000;
						for (int i_130_ = 0; i_130_ < class526.anIntArray6993.length; i_130_++)
							is_123_[class526.anIntArray6993[i_130_]] = 0;
						l ^= (long) is_123_[class526.anInt6991 * 847181775];
					}
				}
			}
		}
		boolean bool_131_ = false;
		int i_132_ = null != class456s ? class456s.length : 0;
		for (int i_133_ = 0; i_133_ < i_132_; i_133_++) {
			if (class456s[i_133_] != null) {
				i_122_ |= class456s[i_133_].method7640(-1036168198);
				bool_131_ = true;
			}
		}
		if (null != class456) {
			i_122_ |= class456.method7640(-2033179655);
			bool_131_ = true;
		}
		if (null != class456_120_) {
			i_122_ |= class456_120_.method7640(-1044343519);
			bool_131_ = true;
		}
		boolean bool_134_ = false;
		if (null != is) {
			for (int i_135_ = 0; i_135_ < is.length; i_135_++) {
				if (is[i_135_] != -1) {
					i_122_ |= 0x20;
					bool_134_ = true;
				}
			}
		}
		MeshRasterizer class528;
		synchronized (aClass229_2920) {
			class528 = (MeshRasterizer) aClass229_2920.get(l);
		}
		Class227 class227 = null;
		if (-1 != -1483086815 * ((PlayerAppearance) this).anInt2925)
			class227 = class211.method3616((((PlayerAppearance) this).anInt2925 * -1483086815), (byte) -87);
		if (null == class528 || class505.method8452(class528.m(), i_122_) != 0) {
			if (class528 != null)
				i_122_ = class505.method8546(i_122_, class528.m());
			int i_136_ = i_122_;
			boolean bool_137_ = false;
			for (int i_138_ = 0; i_138_ < is_123_.length; i_138_++) {
				int i_139_ = is_123_[i_138_];
				MeshModifier class422 = null;
				boolean bool_140_ = false;
				if (bool_124_) {
					if (class526.anInt6990 * -333243893 == i_138_)
						bool_140_ = true;
					else {
						for (int i_141_ = 0; i_141_ < class526.anIntArray6992.length; i_141_++) {
							if (class526.anIntArray6992[i_141_] == i_138_) {
								bool_140_ = true;
								break;
							}
						}
					}
				}
				if (bool_125_) {
					if (class526.anInt6991 * 847181775 == i_138_)
						bool_140_ = true;
					else {
						for (int i_142_ = 0; i_142_ < class526.anIntArray6993.length; i_142_++) {
							if (i_138_ == class526.anIntArray6993[i_142_]) {
								bool_140_ = true;
								break;
							}
						}
					}
				}
				if ((i_139_ & 0x40000000) != 0) {
					if (!bool_140_ && ((PlayerAppearance) this).aClass422Array2922 != null && (((PlayerAppearance) this).aClass422Array2922[i_138_] != null))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_138_];
					if (!class426.getItemDefinitions(i_139_ & 0x3fffffff, 566233318).bodyMeshesReady(aBool2929, class422, -1608263178))
						bool_137_ = true;
				} else if (0 != (i_139_ & ~0x7fffffff) && !class31.method800(i_139_ & 0x3fffffff, 1541066475).method898(-965716691))
					bool_137_ = true;
			}
			if (bool_137_) {
				if (-2249810898304743821L * ((PlayerAppearance) this).aLong2927 != -1L) {
					synchronized (aClass229_2920) {
						class528 = ((MeshRasterizer) aClass229_2920.get(-2249810898304743821L * (((PlayerAppearance) this).aLong2927)));
					}
				}
				if (class528 == null || class505.method8452(class528.m(), i_122_) != 0)
					return null;
			} else {
				RSMesh[] class157s = new RSMesh[is_123_.length];
				for (int i_143_ = 0; i_143_ < is_123_.length; i_143_++) {
					int i_144_ = is_123_[i_143_];
					MeshModifier class422 = null;
					boolean bool_145_ = 5 == i_143_ && bool_124_ || i_143_ == 3 && bool_125_;
					if (0 != (i_144_ & 0x40000000)) {
						if (!bool_145_ && ((PlayerAppearance) this).aClass422Array2922 != null && null != (((PlayerAppearance) this).aClass422Array2922[i_143_]))
							class422 = ((PlayerAppearance) this).aClass422Array2922[i_143_];
						RSMesh class157 = (class426.getItemDefinitions(i_144_ & 0x3fffffff, 1530062981).getBodyMesh(aBool2929, class422, -1159162700));
						if (null != class157)
							class157s[i_143_] = class157;
					} else if (0 != (i_144_ & ~0x7fffffff)) {
						RSMesh class157 = class31.method800(i_144_ & 0x3fffffff, 1866827922).method899(-1537578885);
						if (null != class157)
							class157s[i_143_] = class157;
					}
				}
				if (null != class227 && null != class227.anIntArrayArray2802) {
					for (int i_146_ = 0; i_146_ < class227.anIntArrayArray2802.length; i_146_++) {
						if (class157s[i_146_] != null) {
							int i_147_ = 0;
							int i_148_ = 0;
							int i_149_ = 0;
							int i_150_ = 0;
							int i_151_ = 0;
							int i_152_ = 0;
							if (class227.anIntArrayArray2802[i_146_] != null) {
								i_147_ = class227.anIntArrayArray2802[i_146_][0];
								i_148_ = class227.anIntArrayArray2802[i_146_][1];
								i_149_ = class227.anIntArrayArray2802[i_146_][2];
								i_150_ = (class227.anIntArrayArray2802[i_146_][3] << 3);
								i_151_ = (class227.anIntArrayArray2802[i_146_][4] << 3);
								i_152_ = (class227.anIntArrayArray2802[i_146_][5] << 3);
							}
							if (0 != i_150_ || 0 != i_151_ || 0 != i_152_)
								class157s[i_146_].method2671(i_150_, i_151_, i_152_);
							if (0 != i_147_ || 0 != i_148_ || 0 != i_149_)
								class157s[i_146_].method2712(i_147_, i_148_, i_149_);
						}
					}
				}
				RSMesh class157 = new RSMesh(class157s, class157s.length);
				i_136_ |= 0x4000;
				class528 = class505.createMeshRasterizer(class157, i_136_, Class149.anInt1744 * -127031115, 64, 850);
				for (int i_153_ = 0; i_153_ < 10; i_153_++) {
					for (int i_154_ = 0; i_154_ < (AbstractQueue_Sub1.skinColors[i_153_]).length; i_154_++) {
						if (colors[i_153_] < (Class366.skinColors[i_153_][i_154_]).length)
							class528.X((AbstractQueue_Sub1.skinColors[i_153_][i_154_]), (Class366.skinColors[i_153_][i_154_][colors[i_153_]]));
					}
				}
				if (bool) {
					class528.KA(i_122_);
					synchronized (aClass229_2920) {
						aClass229_2920.put(class528, l);
					}
					((PlayerAppearance) this).aLong2927 = l * -6835014681310605637L;
				}
			}
		}
		MeshRasterizer class528_155_ = class528.method11289((byte) 4, i_122_, true);
		if (!bool_131_ && !bool_134_)
			return class528_155_;
		Class294[] class294s = null;
		if (null != class227)
			class294s = class227.method3811((byte) 36);
		if (bool_134_ && null != class294s) {
			for (int i_156_ = 0; i_156_ < is.length; i_156_++) {
				if (class294s[i_156_] != null)
					class528_155_.method11298(class294s[i_156_], 1 << i_156_, true);
			}
		}
		int i_157_ = 0;
		int i_158_ = 1;
		while (i_157_ < i_132_) {
			if (null != class456s[i_157_])
				class456s[i_157_].method7578(class528_155_, 0, i_158_, 586421394);
			i_157_++;
			i_158_ <<= 1;
		}
		if (bool_134_) {
			for (i_157_ = 0; i_157_ < is.length; i_157_++) {
				if (-1 != is[i_157_]) {
					i_158_ = is[i_157_] - i_121_;
					i_158_ &= 0x3fff;
					Class294 class294 = new Class294();
					class294.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_158_));
					class528_155_.method11298(class294, 1 << i_157_, false);
				}
			}
		}
		if (bool_134_ && class294s != null) {
			for (i_157_ = 0; i_157_ < is.length; i_157_++) {
				if (null != class294s[i_157_])
					class528_155_.method11298(class294s[i_157_], 1 << i_157_, false);
			}
		}
		if (class456 != null && class456_120_ != null)
			Class521_Sub1_Sub3_Sub1.method16078(class528_155_, class456, class456_120_, -593542594);
		else if (class456 != null)
			class456.method7577(class528_155_, 0, 16711935);
		else if (null != class456_120_)
			class456_120_.method7577(class528_155_, 0, 16711935);
		return class528_155_;
	}

	public MeshRasterizer method4017(GraphicalRenderer class505, int i, Class211 class211, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456, Class456 class456_159_, Class456[] class456s, int[] is, int i_160_, boolean bool, Class526 class526) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) 91).method6875(class505, i, class211, interface42, class456, class456_159_, class456s, is, i_160_, null, 1456552905));
		int i_161_ = i;
		long l = -6800555520516554145L * ((PlayerAppearance) this).aLong2926;
		int[] is_162_ = ((PlayerAppearance) this).anIntArray2921;
		boolean bool_163_ = false;
		boolean bool_164_ = false;
		if (null != class456) {
			Class518 class518 = class456.method7565(-1632742162);
			if (class518 != null && (class518.anInt5917 * -516792901 >= 0 || class518.anInt5918 * -1325291837 >= 0)) {
				is_162_ = new int[((PlayerAppearance) this).anIntArray2921.length];
				for (int i_165_ = 0; i_165_ < is_162_.length; i_165_++)
					is_162_[i_165_] = ((PlayerAppearance) this).anIntArray2921[i_165_];
				if (-516792901 * class518.anInt5917 >= 0 && -1 != -333243893 * class526.anInt6990) {
					bool_163_ = true;
					if (65535 == class518.anInt5917 * -516792901) {
						is_162_[-333243893 * class526.anInt6990] = 0;
						for (int i_166_ = 0; i_166_ < class526.anIntArray6992.length; i_166_++)
							is_162_[class526.anIntArray6992[i_166_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_162_[class526.anInt6990 * -333243893] = -516792901 * class518.anInt5917 | 0x40000000;
						for (int i_167_ = 0; i_167_ < class526.anIntArray6992.length; i_167_++)
							is_162_[class526.anIntArray6992[i_167_]] = 0;
						l ^= ((long) is_162_[class526.anInt6990 * -333243893] << 32);
					}
				}
				if (-1325291837 * class518.anInt5918 >= 0 && -1 != class526.anInt6991 * 847181775) {
					bool_164_ = true;
					if (class518.anInt5918 * -1325291837 == 65535) {
						is_162_[847181775 * class526.anInt6991] = 0;
						for (int i_168_ = 0; i_168_ < class526.anIntArray6993.length; i_168_++)
							is_162_[class526.anIntArray6993[i_168_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_162_[847181775 * class526.anInt6991] = -1325291837 * class518.anInt5918 | 0x40000000;
						for (int i_169_ = 0; i_169_ < class526.anIntArray6993.length; i_169_++)
							is_162_[class526.anIntArray6993[i_169_]] = 0;
						l ^= (long) is_162_[class526.anInt6991 * 847181775];
					}
				}
			}
		}
		boolean bool_170_ = false;
		int i_171_ = null != class456s ? class456s.length : 0;
		for (int i_172_ = 0; i_172_ < i_171_; i_172_++) {
			if (class456s[i_172_] != null) {
				i_161_ |= class456s[i_172_].method7640(-1724592857);
				bool_170_ = true;
			}
		}
		if (null != class456) {
			i_161_ |= class456.method7640(-853468364);
			bool_170_ = true;
		}
		if (null != class456_159_) {
			i_161_ |= class456_159_.method7640(-1247275571);
			bool_170_ = true;
		}
		boolean bool_173_ = false;
		if (null != is) {
			for (int i_174_ = 0; i_174_ < is.length; i_174_++) {
				if (is[i_174_] != -1) {
					i_161_ |= 0x20;
					bool_173_ = true;
				}
			}
		}
		MeshRasterizer class528;
		synchronized (aClass229_2920) {
			class528 = (MeshRasterizer) aClass229_2920.get(l);
		}
		Class227 class227 = null;
		if (-1 != -1483086815 * ((PlayerAppearance) this).anInt2925)
			class227 = class211.method3616((((PlayerAppearance) this).anInt2925 * -1483086815), (byte) 61);
		if (null == class528 || class505.method8452(class528.m(), i_161_) != 0) {
			if (class528 != null)
				i_161_ = class505.method8546(i_161_, class528.m());
			int i_175_ = i_161_;
			boolean bool_176_ = false;
			for (int i_177_ = 0; i_177_ < is_162_.length; i_177_++) {
				int i_178_ = is_162_[i_177_];
				MeshModifier class422 = null;
				boolean bool_179_ = false;
				if (bool_163_) {
					if (class526.anInt6990 * -333243893 == i_177_)
						bool_179_ = true;
					else {
						for (int i_180_ = 0; i_180_ < class526.anIntArray6992.length; i_180_++) {
							if (class526.anIntArray6992[i_180_] == i_177_) {
								bool_179_ = true;
								break;
							}
						}
					}
				}
				if (bool_164_) {
					if (class526.anInt6991 * 847181775 == i_177_)
						bool_179_ = true;
					else {
						for (int i_181_ = 0; i_181_ < class526.anIntArray6993.length; i_181_++) {
							if (i_177_ == class526.anIntArray6993[i_181_]) {
								bool_179_ = true;
								break;
							}
						}
					}
				}
				if ((i_178_ & 0x40000000) != 0) {
					if (!bool_179_ && ((PlayerAppearance) this).aClass422Array2922 != null && (((PlayerAppearance) this).aClass422Array2922[i_177_] != null))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_177_];
					if (!class426.getItemDefinitions(i_178_ & 0x3fffffff, 1464385022).bodyMeshesReady(aBool2929, class422, 1517001593))
						bool_176_ = true;
				} else if (0 != (i_178_ & ~0x7fffffff) && !class31.method800(i_178_ & 0x3fffffff, 1409187819).method898(-965716691))
					bool_176_ = true;
			}
			if (bool_176_) {
				if (-2249810898304743821L * ((PlayerAppearance) this).aLong2927 != -1L) {
					synchronized (aClass229_2920) {
						class528 = ((MeshRasterizer) aClass229_2920.get(-2249810898304743821L * (((PlayerAppearance) this).aLong2927)));
					}
				}
				if (class528 == null || class505.method8452(class528.m(), i_161_) != 0)
					return null;
			} else {
				RSMesh[] class157s = new RSMesh[is_162_.length];
				for (int i_182_ = 0; i_182_ < is_162_.length; i_182_++) {
					int i_183_ = is_162_[i_182_];
					MeshModifier class422 = null;
					boolean bool_184_ = 5 == i_182_ && bool_163_ || i_182_ == 3 && bool_164_;
					if (0 != (i_183_ & 0x40000000)) {
						if (!bool_184_ && ((PlayerAppearance) this).aClass422Array2922 != null && null != (((PlayerAppearance) this).aClass422Array2922[i_182_]))
							class422 = ((PlayerAppearance) this).aClass422Array2922[i_182_];
						RSMesh class157 = (class426.getItemDefinitions(i_183_ & 0x3fffffff, 447022467).getBodyMesh(aBool2929, class422, -2055931554));
						if (null != class157)
							class157s[i_182_] = class157;
					} else if (0 != (i_183_ & ~0x7fffffff)) {
						RSMesh class157 = class31.method800(i_183_ & 0x3fffffff, 532840550).method899(-1711886924);
						if (null != class157)
							class157s[i_182_] = class157;
					}
				}
				if (null != class227 && null != class227.anIntArrayArray2802) {
					for (int i_185_ = 0; i_185_ < class227.anIntArrayArray2802.length; i_185_++) {
						if (class157s[i_185_] != null) {
							int i_186_ = 0;
							int i_187_ = 0;
							int i_188_ = 0;
							int i_189_ = 0;
							int i_190_ = 0;
							int i_191_ = 0;
							if (class227.anIntArrayArray2802[i_185_] != null) {
								i_186_ = class227.anIntArrayArray2802[i_185_][0];
								i_187_ = class227.anIntArrayArray2802[i_185_][1];
								i_188_ = class227.anIntArrayArray2802[i_185_][2];
								i_189_ = (class227.anIntArrayArray2802[i_185_][3] << 3);
								i_190_ = (class227.anIntArrayArray2802[i_185_][4] << 3);
								i_191_ = (class227.anIntArrayArray2802[i_185_][5] << 3);
							}
							if (0 != i_189_ || 0 != i_190_ || 0 != i_191_)
								class157s[i_185_].method2671(i_189_, i_190_, i_191_);
							if (0 != i_186_ || 0 != i_187_ || 0 != i_188_)
								class157s[i_185_].method2712(i_186_, i_187_, i_188_);
						}
					}
				}
				RSMesh class157 = new RSMesh(class157s, class157s.length);
				i_175_ |= 0x4000;
				class528 = class505.createMeshRasterizer(class157, i_175_, Class149.anInt1744 * -127031115, 64, 850);
				for (int i_192_ = 0; i_192_ < 10; i_192_++) {
					for (int i_193_ = 0; i_193_ < (AbstractQueue_Sub1.skinColors[i_192_]).length; i_193_++) {
						if (colors[i_192_] < (Class366.skinColors[i_192_][i_193_]).length)
							class528.X((AbstractQueue_Sub1.skinColors[i_192_][i_193_]), (Class366.skinColors[i_192_][i_193_][colors[i_192_]]));
					}
				}
				if (bool) {
					class528.KA(i_161_);
					synchronized (aClass229_2920) {
						aClass229_2920.put(class528, l);
					}
					((PlayerAppearance) this).aLong2927 = l * -6835014681310605637L;
				}
			}
		}
		MeshRasterizer class528_194_ = class528.method11289((byte) 4, i_161_, true);
		if (!bool_170_ && !bool_173_)
			return class528_194_;
		Class294[] class294s = null;
		if (null != class227)
			class294s = class227.method3811((byte) 25);
		if (bool_173_ && null != class294s) {
			for (int i_195_ = 0; i_195_ < is.length; i_195_++) {
				if (class294s[i_195_] != null)
					class528_194_.method11298(class294s[i_195_], 1 << i_195_, true);
			}
		}
		int i_196_ = 0;
		int i_197_ = 1;
		while (i_196_ < i_171_) {
			if (null != class456s[i_196_])
				class456s[i_196_].method7578(class528_194_, 0, i_197_, -1806975956);
			i_196_++;
			i_197_ <<= 1;
		}
		if (bool_173_) {
			for (i_196_ = 0; i_196_ < is.length; i_196_++) {
				if (-1 != is[i_196_]) {
					i_197_ = is[i_196_] - i_160_;
					i_197_ &= 0x3fff;
					Class294 class294 = new Class294();
					class294.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_197_));
					class528_194_.method11298(class294, 1 << i_196_, false);
				}
			}
		}
		if (bool_173_ && class294s != null) {
			for (i_196_ = 0; i_196_ < is.length; i_196_++) {
				if (null != class294s[i_196_])
					class528_194_.method11298(class294s[i_196_], 1 << i_196_, false);
			}
		}
		if (class456 != null && class456_159_ != null)
			Class521_Sub1_Sub3_Sub1.method16078(class528_194_, class456, class456_159_, 769017172);
		else if (class456 != null)
			class456.method7577(class528_194_, 0, 16711935);
		else if (null != class456_159_)
			class456_159_.method7577(class528_194_, 0, 16711935);
		return class528_194_;
	}

	public void method4018(int i, int[] is, MeshModifier[] class422s, int[] is_198_, boolean bool, int i_199_) {
		if (-1483086815 * ((PlayerAppearance) this).anInt2925 != i)
			((PlayerAppearance) this).anInt2925 = i * 995008481;
		((PlayerAppearance) this).anIntArray2921 = is;
		((PlayerAppearance) this).aClass422Array2922 = class422s;
		colors = is_198_;
		aBool2929 = bool;
		anInt2928 = 232890067 * i_199_;
		method3991((byte) 3);
	}

	public void method4019(int i, int i_200_) {
		colors[i] = i_200_;
		method3991((byte) 3);
	}

	public MeshRasterizer method4020(GraphicalRenderer class505, int i, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) -22).method6880(class505, i, interface42, class456, null, 1531880788));
		int i_201_ = null != class456 ? i | class456.method7640(-921112046) : i;
		MeshRasterizer class528;
		synchronized (aClass229_2930) {
			class528 = ((MeshRasterizer) aClass229_2930.get(-6800555520516554145L * ((PlayerAppearance) this).aLong2926));
		}
		if (class528 == null || class505.method8452(class528.m(), i_201_) != 0) {
			if (class528 != null)
				i_201_ = class505.method8546(i_201_, class528.m());
			int i_202_ = i_201_;
			boolean bool = false;
			for (int i_203_ = 0; i_203_ < ((PlayerAppearance) this).anIntArray2921.length; i_203_++) {
				int i_204_ = ((PlayerAppearance) this).anIntArray2921[i_203_];
				MeshModifier class422 = null;
				if (0 != (i_204_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && (null != ((PlayerAppearance) this).aClass422Array2922[i_203_]))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_203_];
					if (!class426.getItemDefinitions(i_204_ & 0x3fffffff, 933779783).headMeshesReady(aBool2929, class422, -2079589755))
						bool = true;
				} else if ((i_204_ & ~0x7fffffff) != 0 && !class31.method800(i_204_ & 0x3fffffff, 2089431789).method900(36053))
					bool = true;
			}
			if (bool)
				return null;
			RSMesh[] class157s = new RSMesh[((PlayerAppearance) this).anIntArray2921.length];
			int i_205_ = 0;
			for (int i_206_ = 0; i_206_ < ((PlayerAppearance) this).anIntArray2921.length; i_206_++) {
				int i_207_ = ((PlayerAppearance) this).anIntArray2921[i_206_];
				MeshModifier class422 = null;
				if (0 != (i_207_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && (((PlayerAppearance) this).aClass422Array2922[i_206_] != null))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_206_];
					RSMesh class157 = class426.getItemDefinitions(i_207_ & 0x3fffffff, 1264260029).getHeadMesh(aBool2929, class422, -1890606891);
					if (null != class157)
						class157s[i_205_++] = class157;
				} else if ((i_207_ & ~0x7fffffff) != 0) {
					RSMesh class157 = class31.method800(i_207_ & 0x3fffffff, 1623414782).method895(-1388016436);
					if (class157 != null)
						class157s[i_205_++] = class157;
				}
			}
			RSMesh class157 = new RSMesh(class157s, i_205_);
			i_202_ |= 0x4000;
			class528 = class505.createMeshRasterizer(class157, i_202_, -127031115 * Class149.anInt1744, 64, 768);
			for (int i_208_ = 0; i_208_ < 10; i_208_++) {
				for (int i_209_ = 0; i_209_ < (AbstractQueue_Sub1.skinColors[i_208_]).length; i_209_++) {
					if (colors[i_208_] < (Class366.skinColors[i_208_][i_209_]).length)
						class528.X((AbstractQueue_Sub1.skinColors[i_208_][i_209_]), (Class366.skinColors[i_208_][i_209_][colors[i_208_]]));
				}
			}
			class528.KA(i_201_);
			synchronized (aClass229_2930) {
				aClass229_2930.put(class528, (((PlayerAppearance) this).aLong2926 * -6800555520516554145L));
			}
		}
		if (class456 == null)
			return class528;
		MeshRasterizer class528_210_ = class528.method11289((byte) 4, i_201_, true);
		class456.method7577(class528_210_, 0, 16711935);
		return class528_210_;
	}

	public MeshRasterizer method4021(GraphicalRenderer class505, int i, Class31 class31, Class406 class406, ItemIndexLoader class426, Class523 class523, Interface42 interface42, Class456 class456, int i_211_) {
		if (-977770149 * anInt2928 != -1)
			return (class406.method6828(anInt2928 * -977770149, (byte) 14).method6880(class505, i, interface42, class456, null, 1135826867));
		int i_212_ = null != class456 ? i | class456.method7640(-1790467862) : i;
		MeshRasterizer class528;
		synchronized (aClass229_2930) {
			class528 = ((MeshRasterizer) aClass229_2930.get(-6800555520516554145L * ((PlayerAppearance) this).aLong2926));
		}
		if (class528 == null || class505.method8452(class528.m(), i_212_) != 0) {
			if (class528 != null)
				i_212_ = class505.method8546(i_212_, class528.m());
			int i_213_ = i_212_;
			boolean bool = false;
			for (int i_214_ = 0; i_214_ < ((PlayerAppearance) this).anIntArray2921.length; i_214_++) {
				int i_215_ = ((PlayerAppearance) this).anIntArray2921[i_214_];
				MeshModifier class422 = null;
				if (0 != (i_215_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && (null != ((PlayerAppearance) this).aClass422Array2922[i_214_]))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_214_];
					if (!class426.getItemDefinitions(i_215_ & 0x3fffffff, 1258535408).headMeshesReady(aBool2929, class422, -2079589755))
						bool = true;
				} else if ((i_215_ & ~0x7fffffff) != 0 && !class31.method800(i_215_ & 0x3fffffff, 745327343).method900(36053))
					bool = true;
			}
			if (bool)
				return null;
			RSMesh[] class157s = new RSMesh[((PlayerAppearance) this).anIntArray2921.length];
			int i_216_ = 0;
			for (int i_217_ = 0; i_217_ < ((PlayerAppearance) this).anIntArray2921.length; i_217_++) {
				int i_218_ = ((PlayerAppearance) this).anIntArray2921[i_217_];
				MeshModifier class422 = null;
				if (0 != (i_218_ & 0x40000000)) {
					if (null != ((PlayerAppearance) this).aClass422Array2922 && (((PlayerAppearance) this).aClass422Array2922[i_217_] != null))
						class422 = ((PlayerAppearance) this).aClass422Array2922[i_217_];
					RSMesh class157 = class426.getItemDefinitions(i_218_ & 0x3fffffff, 393457333).getHeadMesh(aBool2929, class422, -1413121212);
					if (null != class157)
						class157s[i_216_++] = class157;
				} else if ((i_218_ & ~0x7fffffff) != 0) {
					RSMesh class157 = class31.method800(i_218_ & 0x3fffffff, 316441737).method895(-2041696);
					if (class157 != null)
						class157s[i_216_++] = class157;
				}
			}
			RSMesh class157 = new RSMesh(class157s, i_216_);
			i_213_ |= 0x4000;
			class528 = class505.createMeshRasterizer(class157, i_213_, -127031115 * Class149.anInt1744, 64, 768);
			for (int i_219_ = 0; i_219_ < 10; i_219_++) {
				for (int i_220_ = 0; i_220_ < (AbstractQueue_Sub1.skinColors[i_219_]).length; i_220_++) {
					if (colors[i_219_] < (Class366.skinColors[i_219_][i_220_]).length)
						class528.X((AbstractQueue_Sub1.skinColors[i_219_][i_220_]), (Class366.skinColors[i_219_][i_220_][colors[i_219_]]));
				}
			}
			class528.KA(i_212_);
			synchronized (aClass229_2930) {
				aClass229_2930.put(class528, (((PlayerAppearance) this).aLong2926 * -6800555520516554145L));
			}
		}
		if (class456 == null)
			return class528;
		MeshRasterizer class528_221_ = class528.method11289((byte) 4, i_212_, true);
		class456.method7577(class528_221_, 0, 16711935);
		return class528_221_;
	}

	public static int method4022() {
		synchronized (aClass229_2920) {
			int i = aClass229_2920.method3862((byte) 2);
			return i;
		}
	}

	public static int method4023() {
		synchronized (aClass229_2920) {
			int i = aClass229_2920.method3862((byte) 2);
			return i;
		}
	}

	public static void method4024(int i) {
		Class149.anInt1744 = i * 186910109;
		synchronized (aClass229_2930) {
			aClass229_2930.method3859(1209949911);
		}
		synchronized (aClass229_2920) {
			aClass229_2920.method3859(-2142061397);
		}
	}

	public static void method4025() {
		synchronized (aClass229_2920) {
			aClass229_2920.method3859(1547937296);
		}
		synchronized (aClass229_2930) {
			aClass229_2930.method3859(-95834929);
		}
	}

	public static void method4026() {
		synchronized (aClass229_2920) {
			aClass229_2920.method3859(-1148110417);
		}
		synchronized (aClass229_2930) {
			aClass229_2930.method3859(1808648316);
		}
	}

	public static void method4027(int i) {
		synchronized (aClass229_2920) {
			aClass229_2920.method3858(i, (byte) 32);
		}
		synchronized (aClass229_2930) {
			aClass229_2930.method3858(i, (byte) 3);
		}
	}

	public static void method4028(int i) {
		synchronized (aClass229_2920) {
			aClass229_2920.method3858(i, (byte) 20);
		}
		synchronized (aClass229_2930) {
			aClass229_2930.method3858(i, (byte) 13);
		}
	}

	public void method4029(int i, int i_222_, byte i_223_) {
		colors[i] = i_222_;
		method3991((byte) 3);
	}

	static final void method4030(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class204.method3365(class118, class98, class527, -296742554);
	}

	static final void method4031(CS2Executor class527, short i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3565((byte) -75) ? 1 : 0;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3566(-2143623365) ? 1 : 0;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class163.aClass209_2031.method3567((byte) -59) ? 1 : 0;
	}

	static void method4032(String string, String string_224_, int i, int i_225_, int i_226_, long l, int i_227_, int i_228_, boolean bool, boolean bool_229_, long l_230_, boolean bool_231_, int i_232_) {
		if (!Class20.aBool161 && Class20.anInt169 * 2144330291 < 520) {
			i = -1 != i ? i : -1211259595 * client.anInt7427;
			Class282_Sub50_Sub7 class282_sub50_sub7 = new Class282_Sub50_Sub7(string, string_224_, i, i_225_, i_226_, l, i_227_, i_228_, bool, bool_229_, l_230_, bool_231_);
			Class361.method6269(class282_sub50_sub7, -1498808978);
		}
	}

	static final void method4033(CS2Executor class527, byte i) {
		int i_233_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_233_, (byte) 64);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_233_ >> 16];
		Class96_Sub17.method14653(class118, class98, class527, -1617819065);
	}

	static void method4034(int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, byte i_240_) {
		int i_241_ = Class275.method4890(i_235_, Class532_Sub1.anInt7070 * 324226563, -348932735 * Class532_Sub1.anInt7068, 843506601);
		int i_242_ = Class275.method4890(i_236_, 324226563 * Class532_Sub1.anInt7070, Class532_Sub1.anInt7068 * -348932735, -196621682);
		int i_243_ = Class275.method4890(i, -612590951 * Class532_Sub1.anInt7071, Class532_Sub1.anInt7069 * -1345107225, 1641610688);
		int i_244_ = Class275.method4890(i_234_, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, 444789004);
		int i_245_ = Class275.method4890(i_235_ + i_239_, 324226563 * Class532_Sub1.anInt7070, -348932735 * Class532_Sub1.anInt7068, 995356010);
		int i_246_ = Class275.method4890(i_236_ - i_239_, 324226563 * Class532_Sub1.anInt7070, Class532_Sub1.anInt7068 * -348932735, -1579133308);
		for (int i_247_ = i_241_; i_247_ < i_245_; i_247_++) {
			if (i_240_ >= 0)
				return;
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_247_], i_243_, i_244_, i_238_, (byte) 47);
		}
		for (int i_248_ = i_242_; i_248_ > i_246_; i_248_--) {
			if (i_240_ >= 0)
				return;
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_248_], i_243_, i_244_, i_238_, (byte) -32);
		}
		int i_249_ = Class275.method4890(i + i_239_, Class532_Sub1.anInt7071 * -612590951, -1345107225 * Class532_Sub1.anInt7069, -1513727224);
		int i_250_ = Class275.method4890(i_234_ - i_239_, -612590951 * Class532_Sub1.anInt7071, Class532_Sub1.anInt7069 * -1345107225, -1346060806);
		for (int i_251_ = i_245_; i_251_ <= i_246_; i_251_++) {
			if (i_240_ >= 0)
				break;
			int[] is = Class532_Sub1.anIntArrayArray7072[i_251_];
			Class232.method3922(is, i_243_, i_249_, i_238_, (byte) 87);
			Class232.method3922(is, i_249_, i_250_, i_237_, (byte) 89);
			Class232.method3922(is, i_250_, i_244_, i_238_, (byte) -32);
		}
	}

	static final void method4035(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub7_8210, (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]), 1004111582);
		Class190.method3148((byte) 112);
		client.aBool7185 = true;
	}
}
