public class Class466 implements Identifiable {

	public static Class466 aClass466_5569 = new Class466(-2);

	public static Class466 aClass466_5564 = new Class466(-3);

	static Class466 aClass466_5565 = new Class466(2);

	public static Class466 aClass466_5563 = new Class466(3);

	static Class466 aClass466_5567 = new Class466(21);

	static Class466 aClass466_5568 = new Class466(20);

	int anInt5566;

	public int getValue() {
		return this.anInt5566;
	}

	public int method75() {
		return 1856682733 * this.anInt5566 * -1731808539;
	}

	Class466(int i_1) {
		this.anInt5566 = i_1;
	}

	public int method76() {
		return 1856682733 * this.anInt5566 * -1731808539;
	}

	static void method7776() {
		TCPMessage tcpmessage_1 = Class271.method4828(OutgoingPacket.aClass379_4582, client.aClass184_7475.isaac, -384952781);
		tcpmessage_1.buffer.writeInt(client.anInt7221);
		client.aClass184_7475.method3049(tcpmessage_1, -226174867);
	}

	public static void method7777() {
		if (client.gameState == 0 && !JS5CacheFile.method3360((byte) -101) && !Class85.method1466(-873027647)) {
			Class365.setGameState(7);
		}
	}

	static char method7778(char var_0, int i_1) {
		return (char) (var_0 == 198 ? 'E' : (var_0 == 230 ? 'e' : (var_0 == 223 ? 's' : (var_0 == 338 ? 'E' : (var_0 == 339 ? 'e' : '\u0000')))));
	}
}
