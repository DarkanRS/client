package com.jagex;
import java.awt.Container;
import java.awt.Insets;

public class Class507 {

	static Class208 aClass208_5860;

	Class507() throws Throwable {
		throw new Error();
	}

	static void method8725(int i_0, int i_1, int i_2, int i_3, boolean bool_4) {
		if (Class475.supportsFullScreen && client.fullScreenFrame != null && (i_1 != 3 || i_2 != Class363.anInt4203 || i_3 != client.anInt3249)) {
			Class329.method5903(Class274.aClass470_3336, client.fullScreenFrame, -1600993985);
			client.fullScreenFrame = null;
		}
		if (Class475.supportsFullScreen && i_1 == 3 && client.fullScreenFrame == null) {
			client.fullScreenFrame = BuildEnvironment.method7852(Class274.aClass470_3336, i_2, i_3, 0);
			if (client.fullScreenFrame != null) {
				Class363.anInt4203 = i_2;
				client.anInt3249 = i_3;
				Class190.savePreferences((byte) 115);
			}
		}
		if (i_1 == 3 && (!Class475.supportsFullScreen || client.fullScreenFrame == null)) {
			method8725(i_0, Class393.preferences.screenSize.method12687(-1519705843), -1, -1, true);
		} else {
			Container container_6 = Class371.getActiveContainer();
			Insets insets_7;
			if (client.fullScreenFrame != null) {
				SunIndexLoader.anInt434 = i_2;
				Class107.anInt1082 = i_3;
			} else if (client.engineFrame != null) {
				insets_7 = client.engineFrame.getInsets();
				int i_10001 = insets_7.left + insets_7.right;
				SunIndexLoader.anInt434 = client.engineFrame.getSize().width - i_10001;
				i_10001 = insets_7.bottom + insets_7.top;
				Class107.anInt1082 = client.engineFrame.getSize().height - i_10001;
			} else {
				SunIndexLoader.anInt434 = container_6.getSize().width;
				Class107.anInt1082 = container_6.getSize().height;
			}
			if (SunIndexLoader.anInt434 <= 0) {
				SunIndexLoader.anInt434 = 1;
			}
			if (Class107.anInt1082 <= 0) {
				Class107.anInt1082 = 1;
			}
			if (i_1 != 1) {
				Class46.method935((byte) -63);
			} else {
				Class349.anInt4083 = client.GAME_WIDTH;
				client.GAME_CANVAS_X = (SunIndexLoader.anInt434 - client.GAME_WIDTH) / 2;
				client.anInt3243 = client.GAME_HEIGHT * -1929118563;
				client.GAME_CANVAS_Y = 0;
			}
			if (HDWaterTile.SERVER_ENVIRONMENT != ServerEnvironment.LIVE && Class349.anInt4083 < 1024) {
				int i_10000 = client.anInt3243;
			}
			if (!bool_4) {
				Class351.gameCanvas.setSize(Class349.anInt4083, client.anInt3243 * -969250379);
				Renderers.SOFTWARE_RENDERER.method8414(Class351.gameCanvas, Class349.anInt4083, client.anInt3243 * -969250379, -1972128400);
				if (container_6 == client.engineFrame) {
					insets_7 = client.engineFrame.getInsets();
					Class351.gameCanvas.setLocation(insets_7.left + client.GAME_CANVAS_X, insets_7.top + client.GAME_CANVAS_Y);
				} else {
					Class351.gameCanvas.setLocation(client.GAME_CANVAS_X, client.GAME_CANVAS_Y);
				}
			} else {
				Class350_Sub2.method12571(-551950888);
			}
			if (i_1 >= 2) {
				client.resizeableScreen = true;
			} else {
				client.resizeableScreen = false;
			}
			GameTipsLoader.method6795(2030703690);
			if (client.BASE_WINDOW_ID != -1) {
				Class516.method8867(true);
			}
			if (client.GAME_CONNECTION_CONTEXT.getConnection() != null && TextureDetails.method2875(client.gameState, -2070106492)) {
				Class388.method6692(529242177);
			}
			for (int i_8 = 0; i_8 < 107; i_8++) {
				client.aBoolArray7443[i_8] = true;
			}
			client.aBool3274 = true;
		}
	}

	public static CacheableNode_Sub7 method8727() {
		return Class20.aCacheableNode_Sub7_168;
	}
}
