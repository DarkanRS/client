
/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;

public final class Canvas_Sub1 extends Canvas {
	Component aComponent9452;
	static File aFile9453;

	Canvas_Sub1(Component component) {
		((Canvas_Sub1) this).aComponent9452 = component;
	}

	public final void update(Graphics graphics) {
		((Canvas_Sub1) this).aComponent9452.update(graphics);
	}

	public final void paint(Graphics graphics) {
		((Canvas_Sub1) this).aComponent9452.paint(graphics);
	}

	public final void method14695(Graphics graphics) {
		((Canvas_Sub1) this).aComponent9452.update(graphics);
	}

	public final void method14696(Graphics graphics) {
		((Canvas_Sub1) this).aComponent9452.paint(graphics);
	}
}
