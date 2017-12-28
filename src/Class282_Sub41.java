
/* Class282_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class282_Sub41 extends Class282 {
	int anInt8031;
	OggStreamState anOggStreamState8032;

	abstract void method13360(int i);

	void method13361(OggPacket oggpacket, byte i) {
		method13362(oggpacket, -1309691662);
		((Class282_Sub41) this).anInt8031 += 1669091145;
	}

	abstract void method13362(OggPacket oggpacket, int i);

	Class282_Sub41(OggStreamState oggstreamstate) {
		((Class282_Sub41) this).anOggStreamState8032 = oggstreamstate;
	}

	abstract void method13363(OggPacket oggpacket);

	abstract void method13364();

	abstract void method13365();

	abstract void method13366(OggPacket oggpacket);

	public static boolean method13367(int i, short i_0_) {
		return i != 1 && 7 != i;
	}
}
