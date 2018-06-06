/* Class158_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class158_Sub2 extends Class158 {
	static int anInt8975;

	public abstract int method14344();

	Class158_Sub2() {
		/* empty */
	}

	public abstract int method14345(int i, int i_0_);

	public abstract int method14346();

	abstract void method14347(int i, int i_1_);

	abstract void method14348(int i, int i_2_);

	public abstract int method14349();

	public abstract int method14350();

	public abstract int method14351(int i, int i_3_);

	public abstract int method14352(int i, int i_4_);

	public abstract int method14353(int i, int i_5_);

	abstract void method14354(int i, int i_6_);

	public static void method14355(int i, int i_7_, int i_8_) {
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4548, client.aClass184_7475.isaac, -184524303);
		class282_sub23.buffer.writeIntV1(i, 834716715);
		class282_sub23.buffer.writeShortLE128(i_7_, -1183932171);
		client.aClass184_7475.method3049(class282_sub23, 1272182727);
	}

	static TCPMessage method14356(short i) {
		if (-918638833 * TCPMessage.index == 0)
			return new TCPMessage();
		return (TCPMessage.OUTGOING_PACKETS[(TCPMessage.index -= -331587601) * -918638833]);
	}
}
