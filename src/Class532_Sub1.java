import java.awt.Container;
import java.awt.Insets;

public class Class532_Sub1 extends Class532 {

	public static Interface22 anInterface22_7922;

	Class532_Sub1() throws Throwable {
		throw new Error();
	}

	static final void method12838(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_0 - i_2 >= Class532_Sub3.anInt7071 && i_0 + i_2 <= Class532_Sub3.anInt7069 && i_1 - i_2 >= Class532_Sub3.anInt7070 && i_2 + i_1 <= Class532_Sub3.anInt7068) {
			Class155.method2637(i_0, i_1, i_2, i_3, i_4, i_5);
		} else {
			Class60.method1174(i_0, i_1, i_2, i_3, i_4, i_5);
		}
	}

	public static void method12840(int i_0) {
		client client_1 = Class308.aclient3620;
		synchronized (Class308.aclient3620) {
			if (client.fullScreenFrame == null) {
				Container container_2 = Class371.getActiveContainer();
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
					if (Class496.aClass496_5813 != HDWaterTile.aClass496_952 && Class349.anInt4083 < 1024) {
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
						Class516.method8867(true);
					}
					Class275.method4891((byte) -40);
				}
			}
		}
	}
}
