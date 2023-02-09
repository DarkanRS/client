package com.rs.jagex;

import java.awt.Frame;

public enum ModeWhere {

	LIVE("LIVE", 0),
	BUILD_LIVE("BUILDLIVE", 3),
	RC("RC", 1),
	WIP("WIP", 2),
	INT_BETA("INTBETA", 4);

	public static Frame method7852(Class470 class470_0, int width, int height, int i_3) {
		int i_31 = i_3;
		if (i_31 == 0) {
			Class467[] arr_6 = Class386.method6671(class470_0);
			if (arr_6 == null)
				return null;

			boolean bool_7 = false;

			for (Class467 element : arr_6)
				if (element.anInt5571 == width && height == element.anInt5574 && (!bool_7 || element.anInt5573 > 0)) {
					i_31 = element.anInt5573;
					bool_7 = true;
				}

			if (!bool_7)
				return null;
		}

		Frame window = new Frame("Darkan Full Screen");
		window.setResizable(false);
		class470_0.method7808(window, width, height, i_31, 0);
		return window;
	}
	static byte method7853(int i_0, int i_1) {
		return (byte) (i_0 != ObjectType.WALL_INTERACT.id ? 0 : ((i_1 & 0x1) == 0 ? 1 : 2));
	}

	public final String name;

	public final int id;

	ModeWhere(String string_1, int i_2) {
		name = string_1;
		id = i_2;
	}

}
