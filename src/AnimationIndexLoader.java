public class AnimationIndexLoader {

	SoftCache aClass229_6955 = new SoftCache(64);

	SoftCache cache = new SoftCache(100);

	Index sequenceIndex;

	public void method11204() {
		SoftCache softcache_2 = this.aClass229_6955;
		synchronized (this.aClass229_6955) {
			this.aClass229_6955.method3859();
		}
		softcache_2 = this.cache;
		synchronized (this.cache) {
			this.cache.method3859();
		}
	}

	public AnimationDefinitions getAnimDefs(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_6955;
		AnimationDefinitions animationdefinitions_3;
		synchronized (this.aClass229_6955) {
			animationdefinitions_3 = (AnimationDefinitions) this.aClass229_6955.get((long) i_1);
		}
		if (animationdefinitions_3 != null) {
			return animationdefinitions_3;
		} else {
			Index index_5 = this.sequenceIndex;
			byte[] bytes_10;
			synchronized (this.sequenceIndex) {
				bytes_10 = this.sequenceIndex.getFile(SharedConfigsType.ANIMATIONS.containerId(i_1), SharedConfigsType.ANIMATIONS.fileId(i_1));
			}
			animationdefinitions_3 = new AnimationDefinitions();
			animationdefinitions_3.anInt5909 = i_1;
			animationdefinitions_3.animationIndexLoader = this;
			if (bytes_10 != null) {
				animationdefinitions_3.method11130(new RsByteBuffer(bytes_10));
			}
			animationdefinitions_3.method11143();
			SoftCache softcache_9 = this.aClass229_6955;
			synchronized (this.aClass229_6955) {
				this.aClass229_6955.put(animationdefinitions_3, (long) i_1);
				return animationdefinitions_3;
			}
		}
	}

	public AnimationIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4, Index index_5) {
		this.sequenceIndex = index_3;
		if (this.sequenceIndex != null) {
			int i_6 = this.sequenceIndex.containersCount() - 1;
			SharedConfigsType.ANIMATIONS.filesPerContainer(-1584727313);
			this.sequenceIndex.filesCount(i_6);
		}
		CutsceneAction_Sub10_Sub1.setAnimationIndices(index_4, index_5);
	}

	public AnimationFrameSet getAnimationFrame(int i_1) {
		SoftCache softcache_4 = this.cache;
		synchronized (this.cache) {
			AnimationFrameSet animationskeleton_3 = (AnimationFrameSet) this.cache.get((long) i_1);
			if (animationskeleton_3 == null) {
				animationskeleton_3 = new AnimationFrameSet(i_1);
				this.cache.put(animationskeleton_3, (long) i_1);
			}
			return !animationskeleton_3.decodeFrameData() ? null : animationskeleton_3;
		}
	}

	public void method11208() {
		SoftCache softcache_2 = this.aClass229_6955;
		synchronized (this.aClass229_6955) {
			this.aClass229_6955.method3863();
		}
		softcache_2 = this.cache;
		synchronized (this.cache) {
			this.cache.method3863();
		}
	}

	public void method11210() {
		SoftCache softcache_3 = this.aClass229_6955;
		synchronized (this.aClass229_6955) {
			this.aClass229_6955.method3858(5);
		}
		softcache_3 = this.cache;
		synchronized (this.cache) {
			this.cache.method3858(5);
		}
	}

	public static boolean method11219(char var_0, int i_1) {
		return var_0 >= 48 && var_0 <= 57;
	}

	static final void method11220(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		int i_6 = i_3 - i_1;
		int i_7 = i_2 - i_0;
		if (i_7 == 0) {
			if (i_6 != 0) {
				GroundItemStrategy.method13411(i_0, i_1, i_3, i_4, (byte) -83);
			}
		} else if (i_6 == 0) {
			Class16.method568(i_0, i_2, i_1, i_4);
		} else {
			if (i_6 < 0) {
				i_6 = -i_6;
			}
			if (i_7 < 0) {
				i_7 = -i_7;
			}
			boolean bool_8 = i_6 > i_7;
			int i_9;
			int i_10;
			if (bool_8) {
				i_9 = i_0;
				i_10 = i_2;
				i_0 = i_1;
				i_1 = i_9;
				i_2 = i_3;
				i_3 = i_10;
			}
			if (i_0 > i_2) {
				i_9 = i_0;
				i_10 = i_1;
				i_0 = i_2;
				i_2 = i_9;
				i_1 = i_3;
				i_3 = i_10;
			}
			i_9 = i_1;
			i_10 = i_2 - i_0;
			int i_11 = i_3 - i_1;
			int i_12 = -(i_10 >> 1);
			int i_13 = i_1 < i_3 ? 1 : -1;
			if (i_11 < 0) {
				i_11 = -i_11;
			}
			int i_14;
			if (bool_8) {
				for (i_14 = i_0; i_14 <= i_2; i_14++) {
					Class532_Sub2.anIntArrayArray7072[i_14][i_9] = i_4;
					i_12 += i_11;
					if (i_12 > 0) {
						i_9 += i_13;
						i_12 -= i_10;
					}
				}
			} else {
				for (i_14 = i_0; i_14 <= i_2; i_14++) {
					Class532_Sub2.anIntArrayArray7072[i_9][i_14] = i_4;
					i_12 += i_11;
					if (i_12 > 0) {
						i_9 += i_13;
						i_12 -= i_10;
					}
				}
			}
		}
	}
}
