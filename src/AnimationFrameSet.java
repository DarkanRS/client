public class AnimationFrameSet extends CacheableNode {

	static Index ANIMATION_FRAME_INDEX;
	static Index ANIMATION_FRAMESET_INDEX;
	int id;
	byte[][] frameData;
	AnimationFrame[] frames;

	public boolean method15079(int i_1, int i_2) {
		return this.frames[i_1].modifiesAlpha;
	}

	public boolean method15080(int i_1, int i_2) {
		return this.frames[i_1].modifiesColor;
	}

	public boolean method15081(int i_1, int i_2) {
		return this.frames[i_1].aBool988;
	}

	public AnimationFrameSet(int i_1) {
		this.id = i_1;
	}

	public boolean decodeFrameData() {
		if (this.frames != null) {
			return true;
		} else {
			if (this.frameData == null) {
				synchronized (ANIMATION_FRAMESET_INDEX) {
					if (!ANIMATION_FRAMESET_INDEX.loadArchive(this.id)) {
						return false;
					}

					int[] fileIds = ANIMATION_FRAMESET_INDEX.getValidFileIds(this.id);
					this.frameData = new byte[fileIds.length][];

					for (int i_3 = 0; i_3 < fileIds.length; i_3++) {
						this.frameData[i_3] = ANIMATION_FRAMESET_INDEX.getFile(this.id, fileIds[i_3]);
					}
				}
			}

			boolean loaded = true;

			for (int i_11 = 0; i_11 < this.frameData.length; i_11++) {
				byte[] bytes_12 = this.frameData[i_11];
				RsByteBuffer buffer = new RsByteBuffer(bytes_12);
				buffer.index = 1;
				int frameId = buffer.readUnsignedShort();
				synchronized (ANIMATION_FRAME_INDEX) {
					loaded &= ANIMATION_FRAME_INDEX.loadCutscene(frameId);
				}
			}

			if (!loaded) {
				return false;
			} else {
				LinkedNodeList frameBaseList = new LinkedNodeList();
				int[] fileIds;
				synchronized (ANIMATION_FRAMESET_INDEX) {
					int fileCount = ANIMATION_FRAMESET_INDEX.filesCount(this.id);
					this.frames = new AnimationFrame[fileCount];
					fileIds = ANIMATION_FRAMESET_INDEX.getValidFileIds(this.id);
				}

				for (int i = 0; i < fileIds.length; i++) {
					byte[] frameData = this.frameData[i];
					RsByteBuffer frameBuffer = new RsByteBuffer(frameData);
					frameBuffer.index = 1;
					int frameId = frameBuffer.readUnsignedShort();
					AnimationFrameBase frameBase = null;

					for (AnimationFrameBase iter = (AnimationFrameBase) frameBaseList.getBack(); iter != null; iter = (AnimationFrameBase) frameBaseList.getPrevious()) {
						if (frameId == iter.id) {
							frameBase = iter;
							break;
						}
					}

					if (frameBase == null) {
						synchronized (ANIMATION_FRAME_INDEX) {
							frameBase = new AnimationFrameBase(frameId, ANIMATION_FRAME_INDEX.getFile(frameId));
						}

						frameBaseList.insertBack(frameBase);
					}

					this.frames[fileIds[i]] = new AnimationFrame(frameData, frameBase);
				}

				this.frameData = null;
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
