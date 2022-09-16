package com.jagex;

import java.awt.Rectangle;

public class Class292 {

	static void method5201(int i_0, int i_1, int i_2, int i_3) {
		for (int i_5 = 0; i_5 < client.IF_CURR_LAYER; i_5++) {
			Rectangle rectangle_6 = client.IF_LAYER_BOUNDS[i_5];
			if (rectangle_6.x + rectangle_6.width > i_0 && rectangle_6.x < i_0 + i_2 && rectangle_6.height + rectangle_6.y > i_1 && rectangle_6.y < i_3 + i_1)
				client.IF_COMPONENTS_TO_RENDER[i_5] = true;
		}
	}

	Class292() throws Throwable {
		throw new Error();
	}
}
