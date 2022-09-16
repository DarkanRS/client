package com.jagex;

public class AnimationFrame {

	static short[] indicesBuffer = new short[500];
	static short[] bufferX = new short[500];
	static short[] bufferY = new short[500];
	static short[] bufferZ = new short[500];
	static short[] skipped = new short[500];
	static byte[] flagsBuffer = new byte[500];
	AnimationFrameBase frameBaseList;
	int transformationCount;
	boolean modifiesAlpha;
	boolean modifiesColor;
	boolean aBool988;
	short[] transformationIndices;
	short[] transformationX;
	short[] transformationY;
	short[] transformationZ;
	short[] skippedReferences;
	byte[] transformationFlags;

	AnimationFrame(byte[] data, AnimationFrameBase frameList) {
		frameBaseList = frameList;

		try {
			ByteBuf attribBuffer = new ByteBuf(data);
			ByteBuf transformationBuffer = new ByteBuf(data);
			attribBuffer.readUnsignedByte();
			attribBuffer.index += 2;
			int count = attribBuffer.readUnsignedByte();
			int used = 0;
			int last = -1;
			int lastUsed = -1;
			transformationBuffer.index = count + attribBuffer.index;

			int index;
			for (index = 0; index < count; index++) {
				int type = frameBaseList.transformationTypes[index];
				if (type == 0)
					last = index;

				int attribute = attribBuffer.readUnsignedByte();
				if (attribute > 0) {
					if (type == 0)
						lastUsed = index;

					indicesBuffer[used] = (short) index;
					short value = 0;
					if (type == 3 || type == 10)
						value = 128;

					if ((attribute & 0x1) != 0)
						bufferX[used] = (short) transformationBuffer.readUnsignedSmart();
					else
						bufferX[used] = value;

					if ((attribute & 0x2) != 0)
						bufferY[used] = (short) transformationBuffer.readUnsignedSmart();
					else
						bufferY[used] = value;

					if ((attribute & 0x4) != 0)
						bufferZ[used] = (short) transformationBuffer.readUnsignedSmart();
					else
						bufferZ[used] = value;

					flagsBuffer[used] = (byte) (attribute >>> 3 & 0x3);
					if (type == 2 || type == 9) {
						bufferX[used] = (short) (bufferX[used] << 2 & 0x3fff);
						bufferY[used] = (short) (bufferY[used] << 2 & 0x3fff);
						bufferZ[used] = (short) (bufferZ[used] << 2 & 0x3fff);
					}

					skipped[used] = -1;
					if (type != 1 && type != 2 && type != 3) {
						if (type == 5)
							modifiesAlpha = true;
						else if (type == 7)
							modifiesColor = true;
						else if (type == 9 || type == 10 || type == 8)
							aBool988 = true;
					} else if (last > lastUsed) {
						skipped[used] = (short) last;
						lastUsed = last;
					}

					++used;
				}
			}

			if (data.length != transformationBuffer.index)
				throw new RuntimeException();

			transformationCount = used;
			transformationIndices = new short[used];
			transformationX = new short[used];
			transformationY = new short[used];
			transformationZ = new short[used];
			skippedReferences = new short[used];
			transformationFlags = new byte[used];

			for (index = 0; index < used; index++) {
				transformationIndices[index] = indicesBuffer[index];
				transformationX[index] = bufferX[index];
				transformationY[index] = bufferY[index];
				transformationZ[index] = bufferZ[index];
				skippedReferences[index] = skipped[index];
				transformationFlags[index] = flagsBuffer[index];
			}
		} catch (Exception exception_13) {
			transformationCount = 0;
			modifiesAlpha = false;
			modifiesColor = false;
		}

	}

}
