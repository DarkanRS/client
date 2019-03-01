import java.awt.Container;
import java.awt.Insets;

public class Class532_Sub1 extends Class532 {

	public static Interface22 anInterface22_7922;

	Class532_Sub1() throws Throwable {
		throw new Error();
	}

	static final void method12838(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, short s_6) {
		if (i_0 - i_2 >= Class532_Sub3.anInt7071 && i_0 + i_2 <= Class532_Sub3.anInt7069 && i_1 - i_2 >= Class532_Sub3.anInt7070 && i_2 + i_1 <= Class532_Sub3.anInt7068) {
			Class155.method2637(i_0, i_1, i_2, i_3, i_4, i_5, (byte) 6);
		} else {
			Class60.method1174(i_0, i_1, i_2, i_3, i_4, i_5, -1253230247);
		}

	}

	static final void method12839(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 105);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class13.method505(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 1);
	}

	public static void method12840(int i_0) {
		client client_1 = Class308.aclient3620;
		synchronized (Class308.aclient3620) {
			if (client.fullScreenFrame == null) {
				Container container_2 = Class371.getActiveContainer((byte) 1);
				if (container_2 != null) {
					Class45.anInt434 = container_2.getSize().width;
					Class107.anInt1082 = container_2.getSize().height;
					Insets insets_3;
					if (container_2 == client.engineFrame) {
						insets_3 = client.engineFrame.getInsets();
						Class45.anInt434 -= insets_3.left + insets_3.right;
						Class107.anInt1082 -= insets_3.bottom + insets_3.top;
					}

					if (Class45.anInt434 <= 0) {
						Class45.anInt434 = 1;
					}

					if (Class107.anInt1082 <= 0) {
						Class107.anInt1082 = 1;
					}

					if (Class158.windowedMode() != 1) {
						Class46.method935((byte) 0);
					} else {
						Class349.anInt4083 = client.anInt7439;
						client.anInt3250 = (Class45.anInt434 - client.anInt7439) / 2;
						client.anInt3243 = client.anInt7312 * -1929118563;
						client.anInt3251 = 0;
					}

					if (Class496.aClass496_5813 != Class90.aClass496_952 && Class349.anInt4083 < 1024) {
						int i_10000 = client.anInt3243;
					}

					Class351.gameCanvas.setSize(Class349.anInt4083, client.anInt3243 * -969250379);
					if (Renderers.SOFTWARE_RENDERER != null) {
						Renderers.SOFTWARE_RENDERER.method8414(Class351.gameCanvas, Class349.anInt4083, client.anInt3243 * -969250379, -2138128111);
					}

					if (container_2 == client.engineFrame) {
						insets_3 = client.engineFrame.getInsets();
						Class351.gameCanvas.setLocation(insets_3.left + client.anInt3250, insets_3.top + client.anInt3251);
					} else {
						Class351.gameCanvas.setLocation(client.anInt3250, client.anInt3251);
					}

					Class400.method6795(-366853248);
					if (client.anInt7349 != -1) {
						Class516.method8867(true, -905479502);
					}

					Class275.method4891((byte) -40);
				}
			}

		}
	}

	static final void method12841(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4544, client.aClass184_7475.isaac, 443775606);
		tcpmessage_3.buffer.writeShort(i_2, 1417031095);
		client.aClass184_7475.method3049(tcpmessage_3, -1028777472);
	}

}
