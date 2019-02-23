public class AnimationSkeleton extends CacheableNode {

	static Index ANIMATION_SKIN_INDEX;
	static Index ANIMATION_SKELETON_INDEX;
	int animSkeletonId;
	byte[][] skeletonData;
	AnimationSkin[] animationSkins;

	public boolean method15079(int i_1, int i_2) {
		return this.animationSkins[i_1].aBool986;
	}

	public boolean method15080(int i_1, int i_2) {
		return this.animationSkins[i_1].aBool972;
	}

	public boolean method15081(int i_1, int i_2) {
		return this.animationSkins[i_1].aBool988;
	}

	public AnimationSkeleton(int i_1) {
		this.animSkeletonId = i_1;
	}

	public boolean decodeAnimSkeletonData() {
		if (this.animationSkins != null) {
			return true;
		} else {
			if (this.skeletonData == null) {
				synchronized (ANIMATION_SKELETON_INDEX) {
					if (!ANIMATION_SKELETON_INDEX.loadArchive(this.animSkeletonId)) {
						return false;
					}

					int[] ints_2 = ANIMATION_SKELETON_INDEX.getValidFileIds(this.animSkeletonId);
					this.skeletonData = new byte[ints_2.length][];

					for (int i_3 = 0; i_3 < ints_2.length; i_3++) {
						this.skeletonData[i_3] = ANIMATION_SKELETON_INDEX.getFile(this.animSkeletonId, ints_2[i_3]);
					}
				}
			}

			boolean bool_10 = true;

			int i_5;
			for (int i_11 = 0; i_11 < this.skeletonData.length; i_11++) {
				byte[] bytes_12 = this.skeletonData[i_11];
				RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(bytes_12);
				rsbytebuffer_4.index = 1;
				i_5 = rsbytebuffer_4.readUnsignedShort();
				synchronized (ANIMATION_SKIN_INDEX) {
					bool_10 &= ANIMATION_SKIN_INDEX.method5661(i_5, 518523792);
				}
			}

			if (!bool_10) {
				return false;
			} else {
				LinkedNodeList xlinkednodelist_19 = new LinkedNodeList();
				int[] ints_23;
				synchronized (ANIMATION_SKELETON_INDEX) {
					i_5 = ANIMATION_SKELETON_INDEX.filesCount(this.animSkeletonId);
					this.animationSkins = new AnimationSkin[i_5];
					ints_23 = ANIMATION_SKELETON_INDEX.getValidFileIds(this.animSkeletonId);
				}

				for (int i_13 = 0; i_13 < ints_23.length; i_13++) {
					byte[] bytes_14 = this.skeletonData[i_13];
					RsByteBuffer rsbytebuffer_21 = new RsByteBuffer(bytes_14);
					rsbytebuffer_21.index = 1;
					int i_7 = rsbytebuffer_21.readUnsignedShort();
					AnimationSkinNode animationskinnode_8 = null;

					for (AnimationSkinNode animationskinnode_9 = (AnimationSkinNode) xlinkednodelist_19.getBack(); animationskinnode_9 != null; animationskinnode_9 = (AnimationSkinNode) xlinkednodelist_19.getPrevious()) {
						if (i_7 == animationskinnode_9.skinId) {
							animationskinnode_8 = animationskinnode_9;
							break;
						}
					}

					if (animationskinnode_8 == null) {
						synchronized (ANIMATION_SKIN_INDEX) {
							animationskinnode_8 = new AnimationSkinNode(i_7, ANIMATION_SKIN_INDEX.getFile(i_7));
						}

						xlinkednodelist_19.insertBack(animationskinnode_8);
					}

					this.animationSkins[ints_23[i_13]] = new AnimationSkin(bytes_14, animationskinnode_8);
				}

				this.skeletonData = null;
				return true;
			}
		}
	}

	public static byte[] method15090(byte[] bytes_0, int i_1) {
		if (bytes_0 == null) {
			return null;
		} else {
			byte[] bytes_2 = new byte[bytes_0.length];
			System.arraycopy(bytes_0, 0, bytes_2, 0, bytes_0.length);
			return bytes_2;
		}
	}

}
