public abstract class RouteStrategy {

	public int approxDestinationX;
	public int approxDestinationY;
	public int approxDestinationSizeX;
	public int approxDestinationSizeY;

	public abstract boolean canExit(int size, int x, int y, ClipMap var4);

	public static final void moveCamera(int localX, int localY, int moveZ, int constantSpeed, int variableSpeed, boolean bool_5) {
		Class296.CAM_MOVE_LOCALX = localX;
		Node_Sub44.CAM_MOVE_LOCALY = localY;
		SpotAnimDefinitions.CAM_MOVE_Z = moveZ;
		Class454.CAM_MOVE_CONST_SPEED = constantSpeed;
		Class115.CAM_MOVE_VAR_SPEED = variableSpeed;
		if (bool_5 && Class115.CAM_MOVE_VAR_SPEED >= 100) {
			IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = Class296.CAM_MOVE_LOCALX * 512 + 256;
			Class246.CAM_MOVE_ABSOLUTEY = Node_Sub44.CAM_MOVE_LOCALY * 512 + 256;
			Class109_Sub1.CAM_MOVE_ABSOLUTEZ = Class504.getTerrainHeightAtPos(IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX, Class246.CAM_MOVE_ABSOLUTEY, Class4.MY_PLAYER_PLANE) - SpotAnimDefinitions.CAM_MOVE_Z;
		}
		NativeLibraryLoader.anInt3240 = 5;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
	}
}
