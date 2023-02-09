package com.rs.jagex;

import com.rs.jagex.clans.settings.ChangeClanSetting;

import java.awt.*;

public class EntityNode {

	static int method4890(int i_0, int i_1, int i_2) {
		return i_0 < i_1 ? i_1 : (Math.min(i_0, i_2));
	}
	public static void method4891() {
		if (Engine.fullScreenFrame == null) {
			int i_1 = Engine.GAME_CANVAS_X;
			int i_2 = Engine.GAME_CANVAS_Y;
			int i_3 = SunIndexLoader.anInt434 - ChangeClanSetting.BASE_WINDOW_WIDTH - i_1;
			int i_4 = Class107.anInt1082 - Engine.BASE_WINDOW_HEIGHT * -969250379 - i_2;
			if (i_1 > 0 || i_3 > 0 || i_2 > 0 || i_4 > 0)
				try {
					Container container_5 = Class371.getActiveContainer();
					int i_6 = 0;
					int i_7 = 0;
					if (container_5 == Engine.engineFrame) {
						Insets insets_8 = Engine.engineFrame.getInsets();
						i_6 = insets_8.left;
						i_7 = insets_8.top;
					}
					Graphics graphics_10 = container_5.getGraphics();
					graphics_10.setColor(Color.black);
					if (i_1 > 0)
						graphics_10.fillRect(i_6, i_7, i_1, Class107.anInt1082);
					if (i_2 > 0)
						graphics_10.fillRect(i_6, i_7, SunIndexLoader.anInt434, i_2);
					if (i_3 > 0)
						graphics_10.fillRect(i_6 + SunIndexLoader.anInt434 - i_3, i_7, i_3, Class107.anInt1082);
					if (i_4 > 0)
						graphics_10.fillRect(i_6, i_7 + Class107.anInt1082 - i_4, SunIndexLoader.anInt434, i_4);
				} catch (Exception ignored) {
				}
		}
	}

	public EntityNode aEntityNode_3339;

	public EntityNode aEntityNode_3340;

	public void method4887() {
		if (aEntityNode_3340 != null) {
			aEntityNode_3340.aEntityNode_3339 = aEntityNode_3339;
			aEntityNode_3339.aEntityNode_3340 = aEntityNode_3340;
			aEntityNode_3339 = null;
			aEntityNode_3340 = null;
		}
	}
}
