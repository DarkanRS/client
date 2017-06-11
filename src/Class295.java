/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class295 {
	Robot aRobot3167;

	public Class295() throws Exception {
		((Class295) this).aRobot3167 = new Robot();
	}

	public void method2827(int i, int i_0_) {
		try {
			((Class295) this).aRobot3167.mouseMove(i, i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mg.movemouse(").append(')').toString());
		}
	}

	public void method2828(Component component, int[] is, int i, int i_1_, Point point) {
		try {
			if (is != null) {
				BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
				bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
				component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
			} else
				component.setCursor(null);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mg.setcustomcursor(").append(')').toString());
		}
	}
}
