/* Class282_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TCPMessage extends Node {
	static TCPMessage[] OUTGOING_PACKETS = new TCPMessage[300];
	int anInt7678;
	static int index = 0;
	public int anInt7680;
	OutgoingPacket packet;
	public RsBitsBuffer buffer;

	public void method12360(int i) {
		if (index * -918638833 < OUTGOING_PACKETS.length)
			OUTGOING_PACKETS[((index += -331587601) * -918638833 - 1)] = this;
	}

	TCPMessage() {
		/* empty */
	}
	
	static final void method12366(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (1 == client.anInt7341 * -891719545) {
			int i_7_ = -963499271 * Class197.NUM_PLAYER_INDICES;
			int[] is = Class197.PLAYER_INDICES;
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[is[i_8_]];
				if (class521_sub1_sub1_sub2_sub1 != null)
					class521_sub1_sub1_sub2_sub1.method15818(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, 331033522);
			}
			for (int i_9_ = 0; i_9_ < -685729279 * client.anInt7211; i_9_++) {
				int i_10_ = client.anIntArray7212[i_9_];
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_10_));
				if (null != class282_sub47)
					((Animable) class282_sub47.anObject8068).method15818(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, 1391480104);
			}
		}
	}
}
