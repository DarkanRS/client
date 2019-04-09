public abstract class Class158_Sub2 extends Class158 {

	static int anInt8975;

	public abstract int method14344();

	public abstract int method14345(int var1, int var2);

	public abstract int method14346();

	abstract void method14347(int var1, int var2);

	abstract void method14348(int var1, int var2);

	public abstract int method14349();

	public abstract int method14350();

	public abstract int method14351(int var1, int var2);

	public abstract int method14352(int var1, int var2);

	public abstract int method14353(int var1, int var2);

	abstract void method14354(int var1, int var2);

	public static void method14355(int i_0, int i_1, int i_2) {
		TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.ICOMPONENT_CONTINUE, client.outputContext.isaac);
		tcpmessage_3.buffer.writeIntV1(i_0, 834716715);
		tcpmessage_3.buffer.writeShortLE128(i_1);
		client.outputContext.queuePacket(tcpmessage_3);
	}

	static TCPPacket method14356() {
		return TCPPacket.index == 0 ? new TCPPacket() : TCPPacket.OUTGOING_PACKETS[--TCPPacket.index];
	}

}
