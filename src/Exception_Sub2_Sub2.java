public class Exception_Sub2_Sub2 extends Exception_Sub2 {

	Exception_Sub2_Sub2(String string_1) {
		super(string_1);
	}

	static final void decodeAddRemove() {
		RsBitsBuffer buffer = client.outputContext.recievedBuffer;
		buffer.initBitAccess((byte) 104);
		int size = buffer.readBits(8);
		int i;
		if (size < client.NPC_UPDATE_INDEX) {
			for (i = size; i < client.NPC_UPDATE_INDEX; i++) {
				client.anIntArray7421[++client.anInt7216 - 1] = client.NPC_UPDATE_INDICES[i];
			}
		}

		if (size > client.NPC_UPDATE_INDEX) {
			throw new RuntimeException();
		} else {
			client.NPC_UPDATE_INDEX = 0;

			for (i = 0; i < size; i++) {
				int key = client.NPC_UPDATE_INDICES[i];
				NPC npc = (NPC) ((StringNode) client.NPCS.get((long) key)).anObject8068;
				int needsUpdate = buffer.readBits(1);
				if (needsUpdate == 0) {
					client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
					npc.lastUpdate = client.anInt7332;
				} else {
					int moveSpeed = buffer.readBits(2);
					if (moveSpeed == 0) {
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
						npc.lastUpdate = client.anInt7332;
						client.NPC_INDICES[++client.npcListSize - 1] = key;
					} else if (moveSpeed == 1) {
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
						npc.lastUpdate = client.anInt7332;
						NPCDirection class252_8 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
						npc.move(class252_8, MovementType.WALKING.id);
						int i_9 = buffer.readBits(1);
						if (i_9 == 1) {
							client.NPC_INDICES[++client.npcListSize - 1] = key;
						}
					} else if (moveSpeed == 2) {
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
						npc.lastUpdate = client.anInt7332;
						if (buffer.readBits(1) == 1) {
							NPCDirection direction = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
							npc.move(direction, MovementType.RUNNING.id);
							NPCDirection class252_10 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
							npc.move(class252_10, MovementType.RUNNING.id);
						} else {
							NPCDirection class252_8 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
							npc.move(class252_8, MovementType.HALF_WALK.id);
						}

						int i_11 = buffer.readBits(1);
						if (i_11 == 1) {
							client.NPC_INDICES[++client.npcListSize - 1] = key;
						}
					} else if (moveSpeed == 3) {
						client.anIntArray7421[++client.anInt7216 - 1] = key;
					}
				}
			}

		}
	}

}
