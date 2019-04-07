public class SkyboxDefinitions {

	int anInt2653 = -1;
	int anInt2654 = -1;
	Class204 aClass204_2656;
	int anInt2657;
	int[] anIntArray2655;

	void method3549(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method3552(rsbytebuffer_1, i_3);
		}
	}

	SkyboxDefinitions() {
		this.aClass204_2656 = Class204.aClass204_2579;
		this.anInt2657 = -1;
	}

	void method3552(RsByteBuffer buffer, int opcode) {
		if (opcode == 1) {
			this.anInt2653 = buffer.readUnsignedShort();
		} else if (opcode == 2) {
			this.anIntArray2655 = new int[buffer.readUnsignedByte()];
			for (int i_4 = 0; i_4 < this.anIntArray2655.length; i_4++) {
				this.anIntArray2655[i_4] = buffer.readUnsignedShort();
			}
		} else if (opcode == 3) {
			this.anInt2654 = buffer.readUnsignedByte();
		} else if (opcode == 4) {
			this.aClass204_2656 = (Class204) Class386.identify(Class530.method11353(), buffer.readUnsignedByte());
		} else if (opcode == 5) {
			this.anInt2657 = buffer.readBigSmart();
		}
	}

	public static TCPPacket method3558(byte b_0) {
		TCPPacket tcpmessage_1 = Class158_Sub2.method14356();
		tcpmessage_1.packet = null;
		tcpmessage_1.anInt7678 = 0;
		tcpmessage_1.buffer = new RsBitsBuffer(5000);
		return tcpmessage_1;
	}
}
