package com.jagex;

import java.io.IOException;

public class VorbisFileReference extends Class278 {

	static void method13448(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
		Class119 class119_4 = icomponentdefinitions_0.method2046(Renderers.CURRENT_RENDERER);
		if (class119_4 != null) {
			Renderers.CURRENT_RENDERER.r(i_1, i_2, icomponentdefinitions_0.width + i_1, i_2 + icomponentdefinitions_0.height);
			if (Class187.anInt2363 < 3) {
				int i_5 = (int) (-client.camAngleY);
				i_5 = i_5 + client.anInt7255 * 2 & 0x3fff;
				i_5 <<= 2;
				Class16.aNativeSprite_146.method2761(icomponentdefinitions_0.width / 2.0F + i_1, icomponentdefinitions_0.height / 2.0F + i_2, i_5, class119_4.aClass455_1456, i_1, i_2);
			} else
				Renderers.CURRENT_RENDERER.DA(class119_4.aClass455_1456, i_1, i_2);
		}
	}
	public static void method13449() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4335();
		if (ShaderDecoder.aClass253_1008 != null)
			ShaderDecoder.aClass253_1008.method4335();
	}
	int[] values;
	int anInt8115;
	byte[][] aByteArrayArray8111 = new byte[10][];
	ByteBuf aNode_Sub35_8112 = new ByteBuf(null);
	ByteBuf byteBuffer = new ByteBuf(null);

	Index index;

	int fileId;

	public VorbisFileReference(Index index_2, int i_3) {
		index = index_2;
		fileId = i_3;
	}

	@Override
	int decode(byte[] bytes_1) throws IOException {
		if (values == null) {
			if (!index.load(fileId, 0))
				return 0;
			byte[] data = index.getFile(fileId, 0);
			if (data == null)
				throw new IllegalStateException("");
			byteBuffer.buffer = data;
			byteBuffer.index = 0;
			int len = data.length >> 1;
				values = new int[len];
				for (int i_5 = 0; i_5 < len; i_5++)
					values[i_5] = byteBuffer.readUnsignedShort();
		}
		if (anInt8115 >= values.length)
			return -1;
		method13447();
		byteBuffer.buffer = bytes_1;
		byteBuffer.index = 0;
		do {
			if (byteBuffer.index >= byteBuffer.buffer.length) {
				byteBuffer.buffer = null;
				return bytes_1.length;
			}
			if (aNode_Sub35_8112.buffer == null) {
				if (aByteArrayArray8111[0] == null) {
					byteBuffer.buffer = null;
					return byteBuffer.index;
				}
				aNode_Sub35_8112.buffer = aByteArrayArray8111[0];
			}
			int i_6 = byteBuffer.buffer.length - byteBuffer.index;
			int len = aNode_Sub35_8112.buffer.length - aNode_Sub35_8112.index;
			if (i_6 < len) {
				aNode_Sub35_8112.readBytes(byteBuffer.buffer, byteBuffer.index, i_6);
				byteBuffer.buffer = null;
				return bytes_1.length;
			}
			byteBuffer.writeBytes(aNode_Sub35_8112.buffer, aNode_Sub35_8112.index, len);
			aNode_Sub35_8112.buffer = null;
			aNode_Sub35_8112.index = 0;
			++anInt8115;
			System.arraycopy(aByteArrayArray8111, 1, aByteArrayArray8111, 0, 9);
			aByteArrayArray8111[9] = null;
		} while (anInt8115 < values.length);
		byteBuffer.buffer = null;
		return byteBuffer.index;
	}

	public void method13447() {
		if (values != null)
			for (int i_2 = 0; i_2 < 10 && i_2 + anInt8115 < values.length; i_2++)
				if (aByteArrayArray8111[i_2] == null && index.load(values[i_2 + anInt8115], 0))
					aByteArrayArray8111[i_2] = index.getFile(values[i_2 + anInt8115], 0);
	}
}
