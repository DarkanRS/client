public class AnimationFrame {

	static short[] indicesBuffer = new short[500];
	static short[] bufferX = new short[500];
	static short[] bufferY = new short[500];
	static short[] bufferZ = new short[500];
	static short[] skipped = new short[500];
	static byte[] flagsBuffer = new byte[500];
	AnimationFrameBase frameBaseList = null;
	int transformationCount = 0;
	boolean modifiesAlpha = false;
	boolean modifiesColor = false;
	boolean aBool988 = false;
	short[] transformationIndices;
	short[] transformationX;
	short[] transformationY;
	short[] transformationZ;
	short[] skippedReferences;
	byte[] transformationFlags;

	AnimationFrame(byte[] data, AnimationFrameBase frameList) {
		this.frameBaseList = frameList;

		try {
			RsByteBuffer attribBuffer = new RsByteBuffer(data);
			RsByteBuffer transformationBuffer = new RsByteBuffer(data);
			attribBuffer.readUnsignedByte();
			attribBuffer.index += 2;
			int count = attribBuffer.readUnsignedByte();
			int used = 0;
			int last = -1;
			int lastUsed = -1;
			transformationBuffer.index = count + attribBuffer.index;

			int index;
			for (index = 0; index < count; index++) {
				int type = this.frameBaseList.transformationTypes[index];
				if (type == 0) {
					last = index;
				}

				int attribute = attribBuffer.readUnsignedByte();
				if (attribute > 0) {
					if (type == 0) {
						lastUsed = index;
					}

					indicesBuffer[used] = (short) index;
					short value = 0;
					if (type == 3 || type == 10) {
						value = 128;
					}

					if ((attribute & 0x1) != 0) {
						bufferX[used] = (short) transformationBuffer.readSignedSmart();
					} else {
						bufferX[used] = value;
					}

					if ((attribute & 0x2) != 0) {
						bufferY[used] = (short) transformationBuffer.readSignedSmart();
					} else {
						bufferY[used] = value;
					}

					if ((attribute & 0x4) != 0) {
						bufferZ[used] = (short) transformationBuffer.readSignedSmart();
					} else {
						bufferZ[used] = value;
					}

					flagsBuffer[used] = (byte) (attribute >>> 3 & 0x3);
					if (type == 2 || type == 9) {
						bufferX[used] = (short) (bufferX[used] << 2 & 0x3fff);
						bufferY[used] = (short) (bufferY[used] << 2 & 0x3fff);
						bufferZ[used] = (short) (bufferZ[used] << 2 & 0x3fff);
					}

					skipped[used] = -1;
					if (type != 1 && type != 2 && type != 3) {
						if (type == 5) {
							this.modifiesAlpha = true;
						} else if (type == 7) {
							this.modifiesColor = true;
						} else if (type == 9 || type == 10 || type == 8) {
							this.aBool988 = true;
						}
					} else if (last > lastUsed) {
						skipped[used] = (short) last;
						lastUsed = last;
					}

					++used;
				}
			}

			if (data.length != transformationBuffer.index) {
				throw new RuntimeException();
			}

			this.transformationCount = used;
			this.transformationIndices = new short[used];
			this.transformationX = new short[used];
			this.transformationY = new short[used];
			this.transformationZ = new short[used];
			this.skippedReferences = new short[used];
			this.transformationFlags = new byte[used];

			for (index = 0; index < used; index++) {
				this.transformationIndices[index] = indicesBuffer[index];
				this.transformationX[index] = bufferX[index];
				this.transformationY[index] = bufferY[index];
				this.transformationZ[index] = bufferZ[index];
				this.skippedReferences[index] = skipped[index];
				this.transformationFlags[index] = flagsBuffer[index];
			}
		} catch (Exception exception_13) {
			this.transformationCount = 0;
			this.modifiesAlpha = false;
			this.modifiesColor = false;
		}

	}

}
