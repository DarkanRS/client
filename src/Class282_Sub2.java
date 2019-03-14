public class Class282_Sub2 extends Node {

	public int anInt7478;
	public int anInt7479;
	public int anInt7482;
	public int anInt7484;
	public int anInt7485;
	public int anInt7481;
	public int anInt7480;
	public int anInt7483;
	public int anInt7486;

	Class282_Sub2(RsByteBuffer rsbytebuffer_1) {
		int i_2 = rsbytebuffer_1.readInt();
		this.anInt7478 = i_2 >>> 28;
		this.anInt7479 = i_2 >>> 14 & 0x3fff;
		this.anInt7482 = i_2 & 0x3fff;
		this.anInt7484 = rsbytebuffer_1.readUnsignedByte();
		this.anInt7485 = rsbytebuffer_1.readUnsignedByte();
		this.anInt7481 = rsbytebuffer_1.readUnsignedByte();
		this.anInt7480 = rsbytebuffer_1.readUnsignedByte();
		this.anInt7483 = rsbytebuffer_1.readUnsignedByte();
		this.anInt7486 = rsbytebuffer_1.readUnsignedByte();
	}

	static TCPMessage method12078(int i_0, int i_1, int i_2, int i_3) {
		TCPMessage tcpmessage_4 = null;
		if (i_2 == 0) {
			tcpmessage_4 = Class271.method4828(OutgoingPacket.WALK, client.aClass184_7475.isaac, 1058999201);
		}

		if (i_2 == 1) {
			tcpmessage_4 = Class271.method4828(OutgoingPacket.MINI_WALK, client.aClass184_7475.isaac, -505511344);
		}

		CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		tcpmessage_4.buffer.writeByte(Class84.method1465(-2046314159) ? 1 : 0);
		tcpmessage_4.buffer.writeShort(i_0 + coordgrid_5.x, 1417031095);
		tcpmessage_4.buffer.writeShortLE(coordgrid_5.y + i_1, (short) -23988);
		Class187.anInt2361 = i_0;
		Class187.anInt2359 = i_1;
		Class187.aBool2360 = false;
		Class282_Sub20_Sub9.method15255((short) -19687);
		return tcpmessage_4;
	}

}
