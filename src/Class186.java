import java.net.URL;

public class Class186 {

	static FontRenderer aClass8_2348;
	static int anInt2349;

	Class186() throws Throwable {
		throw new Error();
	}

	public static boolean method3082(String string_0, int i_1, String string_2) {
		boolean bool_4;
		if (i_1 == 0) {
			try {
				if (!Class225_Sub6.aString8069.startsWith("win")) {
					throw new Exception();
				} else if (!string_0.startsWith("http://") && !string_0.startsWith("https://")) {
					throw new Exception();
				} else {
					String str_13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int i_6 = 0; i_6 < string_0.length(); i_6++) {
						if (str_13.indexOf(string_0.charAt(i_6)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string_0 + "\"");
					bool_4 = true;
					return bool_4;
				}
			} catch (Throwable throwable_12) {
				return false;
			}
		} else if (i_1 == 1) {
			try {
				Object object_5 = Class441.method7375(Class282_Sub44.anApplet8065, string_2, new Object[] { (new URL(Class282_Sub44.anApplet8065.getCodeBase(), string_0)).toString() }, 161008971);
				bool_4 = object_5 != null;
				return bool_4;
			} catch (Throwable throwable_8) {
				return false;
			}
		} else if (i_1 == 2) {
			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), string_0), "_blank");
				bool_4 = true;
				return bool_4;
			} catch (Exception exception_9) {
				return false;
			}
		} else if (i_1 == 3) {
			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1762272883);
			} catch (Throwable throwable_11) {
				;
			}

			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), string_0), "_top");
				bool_4 = true;
				return bool_4;
			} catch (Exception exception_10) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static void method3083(int i_0) {
		Class9.aClass184_73.method3054((short) 18699);
		Class9.aClass184_73.recievedBuffer.index = 0;
		Class9.aClass184_73.lastPacket = null;
		Class9.aClass184_73.secondLastPacket = null;
		Class9.aClass184_73.thirdLastPacket = null;
		Class9.aClass184_73.idleReadPulses = 0;
		client.anInt7178 = 0;
		Class209_Sub1.method12916();
		client.anInt7434 = 0;
		client.anInt7449 = 0;
		client.aString7426 = null;
		Class459.anInt5534 = 0;
		Class467.aClass173Array5575 = null;
		Class282_Sub13.aClass61_7587 = null;
		Class58.aClass61_528 = null;
		Class237.method3990();

		for (int i_1 = 0; i_1 < 25; i_1++) {
			client.anIntArray7336[i_1] = 0;
			client.anIntArray7337[i_1] = 0;
			client.anIntArray7338[i_1] = 0;
		}

	}

	static void method3084() {
		Class197.NUM_PLAYER_INDICES = 0;

		for (int i_1 = 0; i_1 < 2048; i_1++) {
			Class197.aClass282_Sub35Array2428[i_1] = null;
			Class197.playerMovementTypes[i_1] = Class249.aClass249_3084.aByte3085;
			Class197.aClass4Array2430[i_1] = null;
		}

	}

}
