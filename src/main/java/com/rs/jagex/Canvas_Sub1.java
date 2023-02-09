package com.rs.jagex;

import java.awt.*;
import java.io.File;

public class Canvas_Sub1 extends Canvas {

	static File aFile9453;
	Component aComponent9452;

	Canvas_Sub1(Component component_1) {
		aComponent9452 = component_1;
	}

	@Override
	public void paint(Graphics graphics_1) {
		aComponent9452.paint(graphics_1);
	}

	@Override
	public void update(Graphics graphics_1) {
		aComponent9452.update(graphics_1);
	}

}
