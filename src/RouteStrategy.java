public abstract class RouteStrategy {

	public int approxDestinationX;

	public int approxDestinationY;

	public int approxDestinationSizeX;

	public int approxDestinationSizeY;

	public abstract boolean method3785(int var1, int var2, int var3, ClipMap var4);

	public abstract boolean method3786(int var1, int var2, int var3, ClipMap var4);

	public abstract boolean canExit(int var1, int var2, int var3, ClipMap var4, byte var5);

	public abstract boolean method3788(int var1, int var2, int var3, ClipMap var4);

	public abstract boolean method3789(int var1, int var2, int var3, ClipMap var4);

	public static final void method3794(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class296.anInt3534 = i_0;
		Node_Sub44.anInt8064 = i_1;
		SpotAnimDefinitions.anInt6985 = i_2;
		Class454.anInt5451 = i_3;
		Class115.anInt1249 = i_4;
		if (bool_5 && Class115.anInt1249 >= 100) {
			IdentitiKitIndexLoader.anInt361 = Class296.anInt3534 * 512 + 256;
			Class246.anInt3029 = Node_Sub44.anInt8064 * 512 + 256;
			Class109_Sub1.anInt9384 = Class504.method8389(IdentitiKitIndexLoader.anInt361, Class246.anInt3029, Class4.anInt35, (byte) 10) - SpotAnimDefinitions.anInt6985;
		}
		NativeLibraryLoader.anInt3240 = 5;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
	}
}
