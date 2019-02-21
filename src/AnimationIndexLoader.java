/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationIndexLoader {
	SoftCache cache;
	SoftCache aClass229_6955 = new SoftCache(64);
	Index sequenceIndex;
	
	public void method11204(int i) {
		synchronized (((AnimationIndexLoader) this).aClass229_6955) {
			((AnimationIndexLoader) this).aClass229_6955.method3859(1867962972);
		}
		synchronized (((AnimationIndexLoader) this).cache) {
			((AnimationIndexLoader) this).cache.method3859(335894365);
		}
	}

	public AnimationDefinitions getAnimDefs(int i, byte i_0_) {
		AnimationDefinitions class518;
		synchronized (((AnimationIndexLoader) this).aClass229_6955) {
			class518 = ((AnimationDefinitions) ((AnimationIndexLoader) this).aClass229_6955.get((long) i));
		}
		if (null != class518)
			return class518;
		byte[] is;
		synchronized (((AnimationIndexLoader) this).sequenceIndex) {
			is = (((AnimationIndexLoader) this).sequenceIndex.getFile(SharedConfigsType.SEQUENCES.containerId(i), SharedConfigsType.SEQUENCES.fileId(i)));
		}
		class518 = new AnimationDefinitions();
		class518.anInt5909 = i * 919942973;
		((AnimationDefinitions) class518).animationIndexLoader = this;
		if (null != is)
			class518.method11130(new RsByteBuffer(is), -2068474756);
		class518.method11143((byte) -115);
		synchronized (((AnimationIndexLoader) this).aClass229_6955) {
			((AnimationIndexLoader) this).aClass229_6955.put(class518, (long) i);
		}
		return class518;
	}

	public AnimationIndexLoader(Game class486, Language class495, Index sequencesIndex, Index animSkeletonIndex, Index animSkinIndex) {
		((AnimationIndexLoader) this).cache = new SoftCache(100);
		((AnimationIndexLoader) this).sequenceIndex = sequencesIndex;
		if (null != ((AnimationIndexLoader) this).sequenceIndex) {
			int i = ((AnimationIndexLoader) this).sequenceIndex.containersCount(-738745647) - 1;
			SharedConfigsType.SEQUENCES.filesPerContainer(-1584727313);
			((AnimationIndexLoader) this).sequenceIndex.filesCount(i, -812236501);
		}
		Class96_Sub10_Sub1.setAnimationIndices(animSkeletonIndex, animSkinIndex, 2, -1736051925);
	}

	public AnimationSkeleton getAnimationSkeleton(int animSkeletonId, int i_3_) {
		AnimationSkeleton skeleton;
		synchronized (((AnimationIndexLoader) this).cache) {
			skeleton = ((AnimationSkeleton) ((AnimationIndexLoader) this).cache.get((long) animSkeletonId));
			if (skeleton == null) {
				skeleton = new AnimationSkeleton(animSkeletonId);
				((AnimationIndexLoader) this).cache.put(skeleton, (long) animSkeletonId);
			}
			if (!skeleton.decodeAnimSkeletonData()) {
				return null;
			}
		}
		return skeleton;
	}

	public void method11208(int i) {
		synchronized (((AnimationIndexLoader) this).aClass229_6955) {
			((AnimationIndexLoader) this).aClass229_6955.method3863(2031071202);
		}
		synchronized (((AnimationIndexLoader) this).cache) {
			((AnimationIndexLoader) this).cache.method3863(1832973954);
		}
	}

	public void method11210(int i, byte i_5_) {
		synchronized (((AnimationIndexLoader) this).aClass229_6955) {
			((AnimationIndexLoader) this).aClass229_6955.method3858(i, (byte) -49);
		}
		synchronized (((AnimationIndexLoader) this).cache) {
			((AnimationIndexLoader) this).cache.method3858(i, (byte) -26);
		}
	}

	static final void method11218(CS2Executor class527, byte i) {
		int i_8_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), i_8_, 1266441439);
		Class190.method3148((byte) 88);
		client.aBool7175 = false;
	}

	public static boolean method11219(char c, int i) {
		return c >= '0' && c <= '9';
	}

	static final void method11220(int i, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_) {
		int i_14_ = i_11_ - i_9_;
		int i_15_ = i_10_ - i;
		if (i_15_ == 0) {
			if (i_14_ != 0)
				Class225_Sub6.method13411(i, i_9_, i_11_, i_12_, (byte) -83);
		} else if (i_14_ == 0)
			Class16.method568(i, i_10_, i_9_, i_12_, (short) 128);
		else {
			if (i_14_ < 0)
				i_14_ = -i_14_;
			if (i_15_ < 0)
				i_15_ = -i_15_;
			boolean bool = i_14_ > i_15_;
			if (bool) {
				int i_16_ = i;
				int i_17_ = i_10_;
				i = i_9_;
				i_9_ = i_16_;
				i_10_ = i_11_;
				i_11_ = i_17_;
			}
			if (i > i_10_) {
				int i_18_ = i;
				int i_19_ = i_9_;
				i = i_10_;
				i_10_ = i_18_;
				i_9_ = i_11_;
				i_11_ = i_19_;
			}
			int i_20_ = i_9_;
			int i_21_ = i_10_ - i;
			int i_22_ = i_11_ - i_9_;
			int i_23_ = -(i_21_ >> 1);
			int i_24_ = i_9_ < i_11_ ? 1 : -1;
			if (i_22_ < 0)
				i_22_ = -i_22_;
			if (bool) {
				for (int i_25_ = i; i_25_ <= i_10_; i_25_++) {
					Class532_Sub2.anIntArrayArray7072[i_25_][i_20_] = i_12_;
					i_23_ += i_22_;
					if (i_23_ > 0) {
						i_20_ += i_24_;
						i_23_ -= i_21_;
					}
				}
			} else {
				for (int i_26_ = i; i_26_ <= i_10_; i_26_++) {
					Class532_Sub2.anIntArrayArray7072[i_20_][i_26_] = i_12_;
					i_23_ += i_22_;
					if (i_23_ > 0) {
						i_20_ += i_24_;
						i_23_ -= i_21_;
					}
				}
			}
		}
	}
}
