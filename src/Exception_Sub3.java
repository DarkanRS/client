
/* Exception_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Exception_Sub3 extends Exception {
	public static void method15619(boolean bool, int i) {
		Class282_Sub20_Sub24.method15391(941725182);
		if (Class169.method2875(client.anInt7166 * -1741204137, -1881307804)) {
			Class184[] class184s = client.aClass184Array7220;
			for (int i_0_ = 0; i_0_ < class184s.length; i_0_++) {
				Class184 class184 = class184s[i_0_];
				class184.anInt2290 += 352048501;
				if (class184.anInt2290 * 804033245 < 50 && !bool)
					return;
				class184.anInt2290 = 0;
				if (!class184.aBool2298 && class184.method3053((byte) -85) != null) {
					TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, class184.isaac, -105520716);
					class184.method3049(class282_sub23, 1142654187);
					try {
						class184.method3047(168161979);
					} catch (IOException ioexception) {
						class184.aBool2298 = true;
					}
				}
			}
			Class282_Sub20_Sub24.method15391(-1015227977);
		}
	}
}
