/* Class282_Sub50_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationSkeleton extends CacheableNode {
	static Index ANIMATION_SKIN_INDEX;
	static Index ANIMATION_SKELETON_INDEX;
	int animSkeletonId;
	byte[][] skeletonData;
	AnimationSkin[] animationSkins;

	public boolean method15079(int i, int i_4_) {
		return (((AnimationSkin) this.animationSkins[i]).aBool986);
	}

	public boolean method15080(int i, int i_5_) {
		return (((AnimationSkin) this.animationSkins[i]).aBool972);
	}

	public boolean method15081(int i, int i_6_) {
		return (((AnimationSkin) this.animationSkins[i]).aBool988);
	}

	public AnimationSkeleton(int animSkeletonId) {
		this.animSkeletonId = animSkeletonId * -155691699;
	}

	public boolean decodeAnimSkeletonData() {
		if (null != this.animationSkins)
			return true;
		if (this.skeletonData == null) {
			synchronized (ANIMATION_SKELETON_INDEX) {
				if (!ANIMATION_SKELETON_INDEX.loadArchive((this.animSkeletonId) * 2091314053)) {
					return false;
				}
				int[] fileIds = ANIMATION_SKELETON_INDEX.getValidFileIds((this.animSkeletonId) * 2091314053);
				this.skeletonData = new byte[fileIds.length][];
				for (int i = 0; i < fileIds.length; i++)
					this.skeletonData[i] = ANIMATION_SKELETON_INDEX.getFile((this.animSkeletonId * 2091314053), fileIds[i]);
			}
		}
		boolean bool = true;
		for (int i = 0; i < this.skeletonData.length; i++) {
			byte[] data = this.skeletonData[i];
			RsByteBuffer buffer = new RsByteBuffer(data);
			buffer.index = -1115476867;
			int skinId = buffer.readUnsignedShort();
			synchronized (ANIMATION_SKIN_INDEX) {
				bool &= ANIMATION_SKIN_INDEX.method5661(skinId, 518523792);
			}
		}
		if (!bool)
			return false;
		XLinkedNodeList skinList = new XLinkedNodeList();
		int[] validFiles;
		synchronized (ANIMATION_SKELETON_INDEX) {
			int fileSize = ANIMATION_SKELETON_INDEX.filesCount((this.animSkeletonId) * 2091314053);
			this.animationSkins = new AnimationSkin[fileSize];
			validFiles = ANIMATION_SKELETON_INDEX.getValidFileIds((this.animSkeletonId) * 2091314053);
		}
		for (int i = 0; i < validFiles.length; i++) {
			byte[] skeletonData = this.skeletonData[i];
			RsByteBuffer buffer = new RsByteBuffer(skeletonData);
			buffer.index = -1115476867;
			int skinId = buffer.readUnsignedShort();
			AnimationSkinNode skins = null;
			for (AnimationSkinNode iter = (AnimationSkinNode) skinList.getBack(); iter != null; iter = (AnimationSkinNode) skinList.getPrevious()) {
				if (skinId == (((AnimationSkinNode) iter).skinId * -2041542071)) {
					skins = iter;
					break;
				}
			}
			if (skins == null) {
				synchronized (ANIMATION_SKIN_INDEX) {
					skins = new AnimationSkinNode(skinId, ANIMATION_SKIN_INDEX.getFile(skinId));
				}
				skinList.insertBack(skins);
			}
			this.animationSkins[validFiles[i]] = new AnimationSkin(skeletonData, skins);
		}
		this.skeletonData = null;
		return true;
	}

	public static byte[] method15090(byte[] is, int i) {
		if (is == null)
			return null;
		byte[] is_15_ = new byte[is.length];
		System.arraycopy(is, 0, is_15_, 0, is.length);
		return is_15_;
	}
}
