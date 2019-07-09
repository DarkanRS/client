public class VarnDefinitions {

	public char aChar5431;

	void method7485(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.aChar5431 = Utils.cp1252ToChar(rsbytebuffer_1.readByte());
		}

	}

	void method7487(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7485(rsbytebuffer_1, i_3);
		}
	}

	public static void pingWorlds() {
		if (Class448.PING_WORLDS) {
			if (Class448.currentWorldPingIdx < Class485.WORLD_LIST_START) {
				Class448.currentWorldPingIdx = Class485.WORLD_LIST_START;
			}

			while (true) {
				while (Class448.currentWorldPingIdx < Class244.WORLD_LIST_SIZEPLUS1) {
					WorldDescriptor world = ObjectIndexLoader.getWorld(Class448.currentWorldPingIdx);
					if (world != null && world.ping == -1) {
						if (Class448.CURRENT_WORLD_PING_REQUEST == null) {
							Class448.CURRENT_WORLD_PING_REQUEST = client.PING_REQUESTER.createPingRequest(world.ipAddress);
						}

						int ping = Class448.CURRENT_WORLD_PING_REQUEST.ping;
						
						//System.out.println("Ping: " + world.ipAddress + "->" + ping);
						
						if (ping == -1) {
							return;
						}
						
						world.ping = ping;
						++Class448.currentWorldPingIdx;
						Class448.CURRENT_WORLD_PING_REQUEST = null;
					} else {
						++Class448.currentWorldPingIdx;
					}
				}

				return;
			}
		}
	}

}
