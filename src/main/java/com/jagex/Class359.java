package com.jagex;

public class Class359 {

	static int anInt4163;

	static void decodePlayerCounts(ByteBuf rsbytebuffer_0) {
		for (int i_2 = 0; i_2 < Class4.WORLD_LIST_SIZE; i_2++) {
			int worldId = rsbytebuffer_0.readSmart();
			int playerCount = rsbytebuffer_0.readUnsignedShort();
			if (playerCount == 65535)
				playerCount = -1;
			if (Class244.WORLD_LIST_DESCRIPTORS[worldId] != null)
				Class244.WORLD_LIST_DESCRIPTORS[worldId].playerCount = playerCount;
		}
	}

	Class359() throws Throwable {
		throw new Error();
	}
}
