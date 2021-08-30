package com.jagex;

public class WorldDescriptor extends Class217 {

    public int worldNumber;
    public String ipAddress;
    public String unknown;
    public int port = -1;
    public int ping = -1;

    public static void method13056() {
        Class334.method5940();
    }

    public WorldType getWorld() {
        return Class354.WORLDS[worldIndex];
    }

	public static WorldDescriptor getWorld(int id) {
	    return Class244.aBool3007 && id >= Class485.WORLD_LIST_START && id <= Class244.WORLD_LIST_SIZEPLUS1 ? Class244.WORLD_LIST_DESCRIPTORS[id - Class485.WORLD_LIST_START] : null;
	}

	public static WorldDescriptor getGameWorldDescriptor() {
	    return getWorld(ConnectionInfo.GAME_CONNECTION_INFO.worldId);
	}
	
	@Override
	public String toString() {
		return "World: [" + worldNumber + ", " + ipAddress + ", " + port + ", " + unknown + ", " + ping + "]";
	}
}
