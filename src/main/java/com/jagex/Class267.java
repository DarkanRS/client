package com.jagex;

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class267 {
	Robot aRobot3290 = new Robot();

	public Class267() throws Exception {
	}

	public void moveMouse(int i_1, int i_2) {
		aRobot3290.mouseMove(i_1, i_2);
	}

	public void setCustomCursor(Component component_1, int[] ints_2, int i_3, int i_4, Point point_5) {
		if (ints_2 != null) {
			BufferedImage bufferedimage_6 = new BufferedImage(i_3, i_4, 2);
			bufferedimage_6.setRGB(0, 0, i_3, i_4, ints_2, 0, i_3);
			component_1.setCursor(component_1.getToolkit().createCustomCursor(bufferedimage_6, point_5, null));
		} else
			component_1.setCursor(null);

	}

}
