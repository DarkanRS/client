package com.rs.jagex;

import java.awt.Container;
import java.awt.Insets;

import com.rs.jagex.clans.settings.ChangeClanSetting;

public class Class532_Sub1 extends Class532 {

	public static ImageLoader IMAGE_LOADER;

	Class532_Sub1() throws Throwable {
		throw new Error();
	}

	static void method12838(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_0 - i_2 >= anInt7071 && i_0 + i_2 <= anInt7069 && i_1 - i_2 >= anInt7070 && i_2 + i_1 <= anInt7068)
			Class155.method2637(i_0, i_1, i_2, i_3, i_4, i_5);
		else
			Class60.method1174(i_0, i_1, i_2, i_3, i_4, i_5);
	}

	public static void method12840() {
		client client_1 = Class308.aclient3620;
		synchronized (Class308.aclient3620) {
			if (Engine.fullScreenFrame == null) {
				Container container_2 = Class371.getActiveContainer();
				if (container_2 != null) {
					SunIndexLoader.anInt434 = container_2.getSize().width;
					Class107.anInt1082 = container_2.getSize().height;
					Insets insets_3;
					if (container_2 == Engine.engineFrame) {
						insets_3 = Engine.engineFrame.getInsets();
						SunIndexLoader.anInt434 -= insets_3.left + insets_3.right;
						Class107.anInt1082 -= insets_3.bottom + insets_3.top;
					}
					if (SunIndexLoader.anInt434 <= 0)
						SunIndexLoader.anInt434 = 1;
					if (Class107.anInt1082 <= 0)
						Class107.anInt1082 = 1;
					if (Class158.getScreenMode() != 1)
						Class46.method935();
					else {
						ChangeClanSetting.BASE_WINDOW_WIDTH = client.GAME_WIDTH;
						Engine.GAME_CANVAS_X = (SunIndexLoader.anInt434 - client.GAME_WIDTH) / 2;
						Engine.BASE_WINDOW_HEIGHT = client.GAME_HEIGHT * -1929118563;
						Engine.GAME_CANVAS_Y = 0;
					}
					int i_10000;
					if (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.LIVE && ChangeClanSetting.BASE_WINDOW_WIDTH < 1024)
						i_10000 = Engine.BASE_WINDOW_HEIGHT;
					Class351.gameCanvas.setSize(ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
					if (Renderers.CURRENT_RENDERER != null)
						Renderers.CURRENT_RENDERER.method8414(Class351.gameCanvas, ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
					if (container_2 == Engine.engineFrame) {
						insets_3 = Engine.engineFrame.getInsets();
						Class351.gameCanvas.setLocation(insets_3.left + Engine.GAME_CANVAS_X, insets_3.top + Engine.GAME_CANVAS_Y);
					} else
						Class351.gameCanvas.setLocation(Engine.GAME_CANVAS_X, Engine.GAME_CANVAS_Y);
					GameTipsLoader.method6795();
					if (client.BASE_WINDOW_ID != -1)
						Class516.method8867(true);
					EntityNode.method4891();
				}
			}
		}
	}
}
