package com.jagex;

public class VarnDefinitions {

	public static void pingWorlds() {
		if (ConnectionInfo.PING_WORLDS) {
			if (ConnectionInfo.currentWorldPingIdx < Class485.WORLD_LIST_START)
				ConnectionInfo.currentWorldPingIdx = Class485.WORLD_LIST_START;

			while (true) {
				while (ConnectionInfo.currentWorldPingIdx < Class244.WORLD_LIST_SIZEPLUS1) {
					WorldDescriptor world = WorldDescriptor.getWorld(ConnectionInfo.currentWorldPingIdx);
					if (world != null && world.ping == -1) {
						if (ConnectionInfo.CURRENT_WORLD_PING_REQUEST == null)
							ConnectionInfo.CURRENT_WORLD_PING_REQUEST = client.PING_REQUESTER.createPingRequest(world.ipAddress);

						int ping = ConnectionInfo.CURRENT_WORLD_PING_REQUEST.ping;

						//System.out.println("Ping: " + world.ipAddress + "->" + ping);

						if (ping == -1)
							return;

						world.ping = ping;
						++ConnectionInfo.currentWorldPingIdx;
						ConnectionInfo.CURRENT_WORLD_PING_REQUEST = null;
					} else
						++ConnectionInfo.currentWorldPingIdx;
				}

				return;
			}
		}
	}

	public char aChar5431;

	void method7485(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 1)
			aChar5431 = Utils.cp1252ToChar(rsbytebuffer_1.readByte());

	}

	void method7487(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;

			method7485(rsbytebuffer_1, i_3);
		}
	}

}
