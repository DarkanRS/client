public class Exception_Sub2_Sub2 extends Exception_Sub2 {

	Exception_Sub2_Sub2(String string_1) {
		super(string_1);
	}

	static final void decodeAddRemove() {
		RsBitsBuffer rsbitsbuffer_1 = client.aClass184_7475.recievedBuffer;
		rsbitsbuffer_1.initBitAccess((byte) 104);
		int i_2 = rsbitsbuffer_1.readBits(8, (byte) -33);
		int i_3;
		if (i_2 < client.anInt7211) {
			for (i_3 = i_2; i_3 < client.anInt7211; i_3++) {
				client.anIntArray7421[++client.anInt7216 - 1] = client.anIntArray7212[i_3];
			}
		}

		if (i_2 > client.anInt7211) {
			throw new RuntimeException();
		} else {
			client.anInt7211 = 0;

			for (i_3 = 0; i_3 < i_2; i_3++) {
				int i_4 = client.anIntArray7212[i_3];
				NPC npc_5 = (NPC) ((Class282_Sub47) client.NPCS.get((long) i_4)).anObject8068;
				int i_6 = rsbitsbuffer_1.readBits(1, (byte) 26);
				if (i_6 == 0) {
					client.anIntArray7212[++client.anInt7211 - 1] = i_4;
					npc_5.anInt10353 = client.anInt7332;
				} else {
					int i_7 = rsbitsbuffer_1.readBits(2, (byte) 53);
					if (i_7 == 0) {
						client.anIntArray7212[++client.anInt7211 - 1] = i_4;
						npc_5.anInt10353 = client.anInt7332;
						client.NPC_INDICES[++client.npcListSize - 1] = i_4;
					} else {
						Class252 class252_8;
						if (i_7 == 1) {
							client.anIntArray7212[++client.anInt7211 - 1] = i_4;
							npc_5.anInt10353 = client.anInt7332;
							class252_8 = (Class252) Class386.method6672(Class46.method931(1696399796), rsbitsbuffer_1.readBits(3, (byte) -36), -2098267169);
							npc_5.method16161(class252_8, Class249.aClass249_3084.aByte3085, 59420458);
							int i_9 = rsbitsbuffer_1.readBits(1, (byte) 10);
							if (i_9 == 1) {
								client.NPC_INDICES[++client.npcListSize - 1] = i_4;
							}
						} else if (i_7 == 2) {
							client.anIntArray7212[++client.anInt7211 - 1] = i_4;
							npc_5.anInt10353 = client.anInt7332;
							if (rsbitsbuffer_1.readBits(1, (byte) 34) == 1) {
								class252_8 = (Class252) Class386.method6672(Class46.method931(-112780956), rsbitsbuffer_1.readBits(3, (byte) 44), -2077804920);
								npc_5.method16161(class252_8, Class249.aClass249_3086.aByte3085, -82675465);
								Class252 class252_10 = (Class252) Class386.method6672(Class46.method931(-882869718), rsbitsbuffer_1.readBits(3, (byte) 30), -1179003968);
								npc_5.method16161(class252_10, Class249.aClass249_3086.aByte3085, 1093039209);
							} else {
								class252_8 = (Class252) Class386.method6672(Class46.method931(-867338683), rsbitsbuffer_1.readBits(3, (byte) 35), -1403757890);
								npc_5.method16161(class252_8, Class249.aClass249_3082.aByte3085, 1992160730);
							}

							int i_11 = rsbitsbuffer_1.readBits(1, (byte) 3);
							if (i_11 == 1) {
								client.NPC_INDICES[++client.npcListSize - 1] = i_4;
							}
						} else if (i_7 == 3) {
							client.anIntArray7421[++client.anInt7216 - 1] = i_4;
						}
					}
				}
			}

		}
	}

}
