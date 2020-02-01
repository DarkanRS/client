package com.jagex;
import java.io.IOException;

public class VorbisFileReference extends Class278 {

    int[] values;
    int anInt8115;
    byte[][] aByteArrayArray8111 = new byte[10][];
    RsByteBuffer aNode_Sub35_8112 = new RsByteBuffer((byte[]) null);
    RsByteBuffer byteBuffer = new RsByteBuffer((byte[]) null);
    Index index;
    int fileId;

    public VorbisFileReference(Index index_2, int i_3) {
        super();
        this.index = index_2;
        this.fileId = i_3;
    }

    int decode(byte[] bytes_1) throws IOException {
        if (this.values == null) {
            if (!this.index.load(this.fileId, 0)) {
                return 0;
            }
            byte[] data = this.index.getFile(this.fileId, 0);
            if (data == null) {
                throw new IllegalStateException("");
            }
            this.byteBuffer.buffer = data;
            this.byteBuffer.index = 0;
            int len = data.length >> 1;
            this.values = new int[len];
            for (int i_5 = 0; i_5 < len; i_5++) {
                this.values[i_5] = this.byteBuffer.readUnsignedShort();
            }
        }
        if (this.anInt8115 >= this.values.length) {
            return -1;
        } else {
            this.method13447(-1706767091);
            this.byteBuffer.buffer = bytes_1;
            this.byteBuffer.index = 0;
            do {
                if (this.byteBuffer.index >= this.byteBuffer.buffer.length) {
                    this.byteBuffer.buffer = null;
                    return bytes_1.length;
                }
                if (this.aNode_Sub35_8112.buffer == null) {
                    if (this.aByteArrayArray8111[0] == null) {
                        this.byteBuffer.buffer = null;
                        return this.byteBuffer.index;
                    }
                    this.aNode_Sub35_8112.buffer = this.aByteArrayArray8111[0];
                }
                int i_6 = this.byteBuffer.buffer.length - this.byteBuffer.index;
                int len = this.aNode_Sub35_8112.buffer.length - this.aNode_Sub35_8112.index;
                if (i_6 < len) {
                    this.aNode_Sub35_8112.readBytes(this.byteBuffer.buffer, this.byteBuffer.index, i_6);
                    this.byteBuffer.buffer = null;
                    return bytes_1.length;
                }
                this.byteBuffer.writeBytes(this.aNode_Sub35_8112.buffer, this.aNode_Sub35_8112.index, len);
                this.aNode_Sub35_8112.buffer = null;
                this.aNode_Sub35_8112.index = 0;
                ++this.anInt8115;
                for (int i_5 = 0; i_5 < 9; i_5++) {
                    this.aByteArrayArray8111[i_5] = this.aByteArrayArray8111[i_5 + 1];
                }
                this.aByteArrayArray8111[9] = null;
            } while (this.anInt8115 < this.values.length);
            this.byteBuffer.buffer = null;
            return this.byteBuffer.index;
        }
    }

    public void method13447(int i_1) {
        if (this.values != null) {
            for (int i_2 = 0; i_2 < 10 && i_2 + this.anInt8115 < this.values.length; i_2++) {
                if (this.aByteArrayArray8111[i_2] == null && this.index.load(this.values[i_2 + this.anInt8115], 0)) {
                    this.aByteArrayArray8111[i_2] = this.index.getFile(this.values[i_2 + this.anInt8115], 0);
                }
            }
        }
    }

    static void method13448(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
        Class119 class119_4 = icomponentdefinitions_0.method2046(Renderers.SOFTWARE_RENDERER, -1375447309);
        if (class119_4 != null) {
            Renderers.SOFTWARE_RENDERER.r(i_1, i_2, icomponentdefinitions_0.width + i_1, i_2 + icomponentdefinitions_0.height);
            if (Class187.anInt2363 < 3) {
                int i_5 = (int) (-client.camAngleY);
                i_5 = i_5 + client.anInt7255 * 2 & 0x3fff;
                i_5 <<= 2;
                Class16.aNativeSprite_146.method2761((float) icomponentdefinitions_0.width / 2.0F + (float) i_1, (float) icomponentdefinitions_0.height / 2.0F + (float) i_2, i_5, class119_4.aClass455_1456, i_1, i_2);
            } else {
                Renderers.SOFTWARE_RENDERER.DA(class119_4.aClass455_1456, i_1, i_2);
            }
        }
    }

    public static void method13449(byte b_0) {
        if (Class320.aClass253_3723 != null) {
            Class320.aClass253_3723.method4335();
        }
        if (ShaderDecoder.aClass253_1008 != null) {
            ShaderDecoder.aClass253_1008.method4335();
        }
    }
}
