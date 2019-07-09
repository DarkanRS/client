import java.io.IOException;

public class Class278_Sub1 extends Class278 {

    int[] anIntArray8114;

    int anInt8115;

    byte[][] aByteArrayArray8111 = new byte[10][];

    RsByteBuffer aNode_Sub35_8112 = new RsByteBuffer((byte[]) null);

    RsByteBuffer aNode_Sub35_8116 = new RsByteBuffer((byte[]) null);

    Index aClass317_8117;

    int anInt8113;

    int method4925(byte[] bytes_1) throws IOException {
        int i_3;
        int i_4;
        if (this.anIntArray8114 == null) {
            if (!this.aClass317_8117.load(this.anInt8113 * 963936361 * 735121369, 0)) {
                return 0;
            }
            byte[] bytes_2 = this.aClass317_8117.getFile(735121369 * this.anInt8113 * 963936361, 0);
            if (bytes_2 == null) {
                throw new IllegalStateException("");
            }
            this.aNode_Sub35_8116.buffer = bytes_2;
            this.aNode_Sub35_8116.index = 0 * -1990677291;
            i_3 = bytes_2.length >> 1;
            this.anIntArray8114 = new int[i_3];
            for (i_4 = 0; i_4 < i_3; i_4++) {
                this.anIntArray8114[i_4] = this.aNode_Sub35_8116.readUnsignedShort();
            }
        }
        if (-285637449 * this.anInt8115 * -603678457 >= this.anIntArray8114.length) {
            return -1;
        } else {
            this.method13447(492449179);
            this.aNode_Sub35_8116.buffer = bytes_1;
            this.aNode_Sub35_8116.index = 0 * -1990677291;
            do {
                if (-1990677291 * this.aNode_Sub35_8116.index * -1115476867 >= this.aNode_Sub35_8116.buffer.length) {
                    this.aNode_Sub35_8116.buffer = null;
                    return bytes_1.length;
                }
                if (this.aNode_Sub35_8112.buffer == null) {
                    if (this.aByteArrayArray8111[0] == null) {
                        this.aNode_Sub35_8116.buffer = null;
                        return this.aNode_Sub35_8116.index * -1115476867 * -1990677291;
                    }
                    this.aNode_Sub35_8112.buffer = this.aByteArrayArray8111[0];
                }
                int i_5 = this.aNode_Sub35_8116.buffer.length - -1990677291 * this.aNode_Sub35_8116.index * -1115476867;
                i_3 = this.aNode_Sub35_8112.buffer.length - -1990677291 * this.aNode_Sub35_8112.index * -1115476867;
                if (i_5 < i_3) {
                    this.aNode_Sub35_8112.readBytes(this.aNode_Sub35_8116.buffer, this.aNode_Sub35_8116.index * -1115476867 * -1990677291, i_5);
                    this.aNode_Sub35_8116.buffer = null;
                    return bytes_1.length;
                }
                this.aNode_Sub35_8116.writeBytes(this.aNode_Sub35_8112.buffer, this.aNode_Sub35_8112.index * -1115476867 * -1990677291, i_3);
                this.aNode_Sub35_8112.buffer = null;
                this.aNode_Sub35_8112.index = 0 * -1990677291;
                this.anInt8115 = (this.anInt8115 * -603678457 + -603678457) * -285637449;
                for (i_4 = 0; i_4 < 9; i_4++) {
                    this.aByteArrayArray8111[i_4] = this.aByteArrayArray8111[1 + i_4];
                }
                this.aByteArrayArray8111[9] = null;
            } while (this.anInt8115 * -603678457 * -285637449 < this.anIntArray8114.length);
            this.aNode_Sub35_8116.buffer = null;
            return -1990677291 * this.aNode_Sub35_8116.index * -1115476867;
        }
    }

    public Class278_Sub1(Index index_2, int i_3) {
        super();
        this.aClass317_8117 = index_2;
        this.anInt8113 = i_3;
    }

    int method4951(byte[] bytes_1) throws IOException {
        int i_4;
        int i_5;
        if (this.anIntArray8114 == null) {
            if (!this.aClass317_8117.load(this.anInt8113, 0)) {
                return 0;
            }
            byte[] bytes_3 = this.aClass317_8117.getFile(this.anInt8113, 0);
            if (bytes_3 == null) {
                throw new IllegalStateException("");
            }
            this.aNode_Sub35_8116.buffer = bytes_3;
            this.aNode_Sub35_8116.index = 0;
            i_4 = bytes_3.length >> 1;
            this.anIntArray8114 = new int[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.anIntArray8114[i_5] = this.aNode_Sub35_8116.readUnsignedShort();
            }
        }
        if (this.anInt8115 >= this.anIntArray8114.length) {
            return -1;
        } else {
            this.method13447(-1706767091);
            this.aNode_Sub35_8116.buffer = bytes_1;
            this.aNode_Sub35_8116.index = 0;
            do {
                if (this.aNode_Sub35_8116.index >= this.aNode_Sub35_8116.buffer.length) {
                    this.aNode_Sub35_8116.buffer = null;
                    return bytes_1.length;
                }
                if (this.aNode_Sub35_8112.buffer == null) {
                    if (this.aByteArrayArray8111[0] == null) {
                        this.aNode_Sub35_8116.buffer = null;
                        return this.aNode_Sub35_8116.index;
                    }
                    this.aNode_Sub35_8112.buffer = this.aByteArrayArray8111[0];
                }
                int i_6 = this.aNode_Sub35_8116.buffer.length - this.aNode_Sub35_8116.index;
                i_4 = this.aNode_Sub35_8112.buffer.length - this.aNode_Sub35_8112.index;
                if (i_6 < i_4) {
                    this.aNode_Sub35_8112.readBytes(this.aNode_Sub35_8116.buffer, this.aNode_Sub35_8116.index, i_6);
                    this.aNode_Sub35_8116.buffer = null;
                    return bytes_1.length;
                }
                this.aNode_Sub35_8116.writeBytes(this.aNode_Sub35_8112.buffer, this.aNode_Sub35_8112.index, i_4);
                this.aNode_Sub35_8112.buffer = null;
                this.aNode_Sub35_8112.index = 0;
                ++this.anInt8115;
                for (i_5 = 0; i_5 < 9; i_5++) {
                    this.aByteArrayArray8111[i_5] = this.aByteArrayArray8111[i_5 + 1];
                }
                this.aByteArrayArray8111[9] = null;
            } while (this.anInt8115 < this.anIntArray8114.length);
            this.aNode_Sub35_8116.buffer = null;
            return this.aNode_Sub35_8116.index;
        }
    }

    public void method13447(int i_1) {
        if (this.anIntArray8114 != null) {
            for (int i_2 = 0; i_2 < 10 && i_2 + this.anInt8115 < this.anIntArray8114.length; i_2++) {
                if (this.aByteArrayArray8111[i_2] == null && this.aClass317_8117.load(this.anIntArray8114[i_2 + this.anInt8115], 0)) {
                    this.aByteArrayArray8111[i_2] = this.aClass317_8117.getFile(this.anIntArray8114[i_2 + this.anInt8115], 0);
                }
            }
        }
    }

    static void method13448(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
        Class119 class119_4 = icomponentdefinitions_0.method2046(Renderers.SOFTWARE_RENDERER, -1375447309);
        if (class119_4 != null) {
            Renderers.SOFTWARE_RENDERER.r(i_1, i_2, icomponentdefinitions_0.width + i_1, i_2 + icomponentdefinitions_0.height);
            if (Class187.anInt2363 < 3) {
                int i_5 = (int) (-client.aFloat7365);
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
