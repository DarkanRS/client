public class Class207 {

    int anInt2653 = -1;

    int anInt2654 = -1;

    Class204 aClass204_2656;

    int anInt2657;

    int[] anIntArray2655;

    void method3549(RsByteBuffer rsbytebuffer_1, int i_2) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            this.method3552(rsbytebuffer_1, i_3, (byte) 127);
        }
    }

    Class207() {
        this.aClass204_2656 = Class204.aClass204_2579;
        this.anInt2657 = -1;
    }

    void method3552(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
        if (i_2 == 1) {
            this.anInt2653 = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 2) {
            this.anIntArray2655 = new int[rsbytebuffer_1.readUnsignedByte()];
            for (int i_4 = 0; i_4 < this.anIntArray2655.length; i_4++) {
                this.anIntArray2655[i_4] = rsbytebuffer_1.readUnsignedShort();
            }
        } else if (i_2 == 3) {
            this.anInt2654 = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 4) {
            this.aClass204_2656 = (Class204) Class386.method6672(Class530.method11353(-430210137), rsbytebuffer_1.readUnsignedByte(), -1538541275);
        } else if (i_2 == 5) {
            this.anInt2657 = rsbytebuffer_1.readBigSmart();
        }
    }

    public static TCPMessage method3558(byte b_0) {
        TCPMessage tcpmessage_1 = Class158_Sub2.method14356((short) 2048);
        tcpmessage_1.packet = null;
        tcpmessage_1.anInt7678 = 0;
        tcpmessage_1.buffer = new RsBitsBuffer(5000);
        return tcpmessage_1;
    }
}
