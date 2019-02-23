import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class282_Sub41 extends Node {

	int anInt8031;
	OggStreamState anOggStreamState8032;

	abstract void method13360(int var1);

	void method13361(OggPacket oggpacket_1, byte b_2) {
		this.method13362(oggpacket_1, -1309691662);
		++this.anInt8031;
	}

	abstract void method13362(OggPacket var1, int var2);

	Class282_Sub41(OggStreamState oggstreamstate_1) {
		this.anOggStreamState8032 = oggstreamstate_1;
	}

	abstract void method13363(OggPacket var1);

	abstract void method13364();

	abstract void method13365();

	abstract void method13366(OggPacket var1);

	public static boolean method13367(int i_0, short s_1) {
		return i_0 != 1 && i_0 != 7;
	}

}
