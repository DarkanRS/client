import java.io.IOException;

public class Exception_Sub3 extends Exception {

	public static void method15619(boolean bool_0, int i_1) {
		Class282_Sub20_Sub24.method15391(941725182);
		if (TextureDetails.method2875(client.gameState, -1881307804)) {
			BufferedConnectionContext[] arr_2 = client.aClass184Array7220;

			for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
				BufferedConnectionContext class184_4 = arr_2[i_3];
				++class184_4.anInt2290;
				if (class184_4.anInt2290 < 50 && !bool_0) {
					return;
				}

				class184_4.anInt2290 = 0;
				if (!class184_4.aBool2298 && class184_4.getConnection() != null) {
					TCPMessage tcpmessage_5 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, class184_4.isaac, -105520716);
					class184_4.method3049(tcpmessage_5, 1142654187);

					try {
						class184_4.method3047(168161979);
					} catch (IOException ioexception_7) {
						class184_4.aBool2298 = true;
					}
				}
			}

			Class282_Sub20_Sub24.method15391(-1015227977);
		}

	}

}
