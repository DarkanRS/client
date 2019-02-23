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
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4548, client.aClass184_7475.isaac, -184524303);
		tcpmessage_3.buffer.writeIntV1(i_0, 834716715);
		tcpmessage_3.buffer.writeShortLE128(i_1, -1183932171);
		client.aClass184_7475.method3049(tcpmessage_3, 1272182727);
	}

	static TCPMessage method14356(short s_0) {
		return TCPMessage.index == 0 ? new TCPMessage() : TCPMessage.OUTGOING_PACKETS[--TCPMessage.index];
	}

}
