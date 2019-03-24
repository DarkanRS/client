public class TCPPacket extends Node {

	int anInt7678;
	public int anInt7680;
	OutgoingPacket packet;
	public RsBitsBuffer buffer;
	static TCPPacket[] OUTGOING_PACKETS = new TCPPacket[300];
	static int index = 0;

	public void method12360() {
		if (index < OUTGOING_PACKETS.length) {
			OUTGOING_PACKETS[++index - 1] = this;
		}

	}

	static final void method12366(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (client.anInt7341 == 1) {
			int i_8 = Class197.NUM_PLAYER_INDICES;
			int[] ints_9 = Class197.PLAYER_INDICES;

			int i_10;
			for (i_10 = 0; i_10 < i_8; i_10++) {
				Player player_13 = client.players[ints_9[i_10]];
				if (player_13 != null) {
					player_13.method15818(i_0, i_1, i_2, i_3, i_4, i_5, i_6, 331033522);
				}
			}

			for (i_10 = 0; i_10 < client.NPC_UPDATE_INDEX; i_10++) {
				int i_11 = client.NPC_UPDATE_INDICES[i_10];
				Class282_Sub47 class282_sub47_12 = (Class282_Sub47) client.NPCS.get((long) i_11);
				if (class282_sub47_12 != null) {
					((Animable) class282_sub47_12.anObject8068).method15818(i_0, i_1, i_2, i_3, i_4, i_5, i_6, 1391480104);
				}
			}
		}

	}

}
