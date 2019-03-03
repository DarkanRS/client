import java.awt.Container;
import java.awt.Insets;

public class Class507 {

	static Class208 aClass208_5860;

	Class507() throws Throwable {
		throw new Error();
	}

	static final void method8723(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class202.method3338(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 40);
	}

	static final void method8724(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (Class468_Sub8.aClass98Array7889[i_2] == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class468_Sub8.aClass98Array7889[i_2].components[i_3].anInt1414;
		}

	}

	static void method8725(int i_0, int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
		if (Class475.supportsFullScreen && client.fullScreenFrame != null && (i_1 != 3 || i_2 != Class363.anInt4203 || i_3 != client.anInt3249)) {
			Class329.method5903(Class274.aClass470_3336, client.fullScreenFrame, -1600993985);
			client.fullScreenFrame = null;
		}

		if (Class475.supportsFullScreen && i_1 == 3 && client.fullScreenFrame == null) {
			client.fullScreenFrame = Class472.method7852(Class274.aClass470_3336, i_2, i_3, 0, 0, (byte) -27);
			if (client.fullScreenFrame != null) {
				Class363.anInt4203 = i_2;
				client.anInt3249 = i_3;
				Class190.savePreferences((byte) 115);
			}
		}

		if (i_1 == 3 && (!Class475.supportsFullScreen || client.fullScreenFrame == null)) {
			method8725(i_0, Class393.preferences.screenSize.method12687(-1519705843), -1, -1, true, -1040786933);
		} else {
			Container container_6 = Class371.getActiveContainer((byte) 1);
			Insets insets_7;
			if (client.fullScreenFrame != null) {
				Class45.anInt434 = i_2;
				Class107.anInt1082 = i_3;
			} else if (client.engineFrame != null) {
				insets_7 = client.engineFrame.getInsets();
				int i_10001 = insets_7.left + insets_7.right;
				Class45.anInt434 = client.engineFrame.getSize().width - i_10001;
				i_10001 = insets_7.bottom + insets_7.top;
				Class107.anInt1082 = client.engineFrame.getSize().height - i_10001;
			} else {
				Class45.anInt434 = container_6.getSize().width;
				Class107.anInt1082 = container_6.getSize().height;
			}

			if (Class45.anInt434 <= 0) {
				Class45.anInt434 = 1;
			}

			if (Class107.anInt1082 <= 0) {
				Class107.anInt1082 = 1;
			}

			if (i_1 != 1) {
				Class46.method935((byte) -63);
			} else {
				Class349.anInt4083 = client.anInt7439;
				client.anInt3250 = (Class45.anInt434 - client.anInt7439) / 2;
				client.anInt3243 = client.anInt7312 * -1929118563;
				client.anInt3251 = 0;
			}

			if (Class90.aClass496_952 != Class496.aClass496_5813 && Class349.anInt4083 < 1024) {
				int i_10000 = client.anInt3243;
			}

			if (!bool_4) {
				Class351.gameCanvas.setSize(Class349.anInt4083, client.anInt3243 * -969250379);
				Renderers.SOFTWARE_RENDERER.method8414(Class351.gameCanvas, Class349.anInt4083, client.anInt3243 * -969250379, -1972128400);
				if (container_6 == client.engineFrame) {
					insets_7 = client.engineFrame.getInsets();
					Class351.gameCanvas.setLocation(insets_7.left + client.anInt3250, insets_7.top + client.anInt3251);
				} else {
					Class351.gameCanvas.setLocation(client.anInt3250, client.anInt3251);
				}
			} else {
				Class350_Sub2.method12571(-551950888);
			}

			if (i_1 >= 2) {
				client.resizeableScreen = true;
			} else {
				client.resizeableScreen = false;
			}

			Class400.method6795(2030703690);
			if (client.anInt7349 != -1) {
				Class516.method8867(true, -905479502);
			}

			if (client.aClass184_7475.method3053((byte) -102) != null && Class169.method2875(client.gameState, -2070106492)) {
				Class388.method6692(529242177);
			}

			for (int i_8 = 0; i_8 < 107; i_8++) {
				client.aBoolArray7443[i_8] = true;
			}

			client.aBool3274 = true;
		}

	}

	static final void method8726(CS2Executor cs2executor_0, short s_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class30.method797(icomponentdefinitions_3, interface_4, cs2executor_0, 2104717291);
	}

	public static Class282_Sub50_Sub7 method8727(int i_0) {
		return Class20.aClass282_Sub50_Sub7_168;
	}

}
