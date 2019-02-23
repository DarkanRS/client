import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class275 {

	public Class275 aClass275_3339;
	public Class275 aClass275_3340;

	public void method4887(byte b_1) {
		if (this.aClass275_3340 != null) {
			this.aClass275_3340.aClass275_3339 = this.aClass275_3339;
			this.aClass275_3339.aClass275_3340 = this.aClass275_3340;
			this.aClass275_3339 = null;
			this.aClass275_3340 = null;
		}

	}

	static final void method4889(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		int i_3 = 0;
		if (Class115.method1950(string_2, -1586612370)) {
			i_3 = Class328.parseInt(string_2, 1827486792);
		}

		TCPMessage tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4585, client.aClass184_7475.isaac, 1022314002);
		tcpmessage_4.buffer.writeInt(i_3);
		client.aClass184_7475.method3049(tcpmessage_4, -492560470);
	}

	static final int method4890(int i_0, int i_1, int i_2, int i_3) {
		return i_0 < i_1 ? i_1 : (i_0 > i_2 ? i_2 : i_0);
	}

	public static void method4891(byte b_0) {
		if (client.aFrame3260 == null) {
			int i_1 = client.anInt3250;
			int i_2 = client.anInt3251;
			int i_3 = Class45.anInt434 - Class349.anInt4083 - i_1;
			int i_4 = Class107.anInt1082 - client.anInt3243 * -969250379 - i_2;
			if (i_1 > 0 || i_3 > 0 || i_2 > 0 || i_4 > 0) {
				try {
					Container container_5 = Class371.method6354((byte) 1);
					int i_6 = 0;
					int i_7 = 0;
					if (container_5 == client.aFrame3261) {
						Insets insets_8 = client.aFrame3261.getInsets();
						i_6 = insets_8.left;
						i_7 = insets_8.top;
					}

					Graphics graphics_10 = container_5.getGraphics();
					graphics_10.setColor(Color.black);
					if (i_1 > 0) {
						graphics_10.fillRect(i_6, i_7, i_1, Class107.anInt1082);
					}

					if (i_2 > 0) {
						graphics_10.fillRect(i_6, i_7, Class45.anInt434, i_2);
					}

					if (i_3 > 0) {
						graphics_10.fillRect(i_6 + Class45.anInt434 - i_3, i_7, i_3, Class107.anInt1082);
					}

					if (i_4 > 0) {
						graphics_10.fillRect(i_6, i_7 + Class107.anInt1082 - i_4, Class45.anInt434, i_4);
					}
				} catch (Exception exception_9) {
					;
				}
			}
		}

	}

}
