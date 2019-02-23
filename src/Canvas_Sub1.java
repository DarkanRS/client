import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;

public final class Canvas_Sub1 extends Canvas {

	static File aFile9453;
	Component aComponent9452;

	Canvas_Sub1(Component component_1) {
		this.aComponent9452 = component_1;
	}

	public final void update(Graphics graphics_1) {
		this.aComponent9452.update(graphics_1);
	}

	public final void paint(Graphics graphics_1) {
		this.aComponent9452.paint(graphics_1);
	}

}
