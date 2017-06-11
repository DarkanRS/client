/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class4 {
	int[] anIntArray69;
	static int anInt70 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
	static int[] anIntArray71 = new int[256];
	boolean aBoolean72 = false;
	Class57[] aClass57Array73;
	int anInt74;
	static String aString75 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7";
	int anInt76;
	int[] anIntArray77 = new int[4];

	void method304(GraphicsToolkit class_ra, String string, int[] is, int i, int i_0_, int i_1_, boolean bool) {
		if (i_1_ == 0)
			bool = false;
		i_1_ |= ~0xffffff;
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
			int i_3_ = anIntArray71[string.charAt(i_2_)];
			if (bool)
				((Class4) this).aClass57Array73[i_3_].method631(i + 1, i_0_ + 1, 0, -16777216, 1);
			((Class4) this).aClass57Array73[i_3_].method631(i, i_0_, 0, i_1_, 1);
			i += ((Class4) this).anIntArray69[i_3_];
		}
	}

	void method305(GraphicsToolkit class_ra, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_4_ = fontmetrics.charWidth(c);
		int i_5_ = i_4_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_4_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_6_ = fontmetrics.getMaxAscent();
		int i_7_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_8_ = fontmetrics.getHeight();
		Image image = Class52_Sub2_Sub1.aCanvas9079.createImage(i_4_, i_7_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_4_, i_7_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_6_);
		if (bool)
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_6_);
		int[] is = new int[i_4_ * i_7_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_4_, i_7_, is, 0, i_4_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_9_ = 0;
		while_14_: for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
			for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
				int i_12_ = is[i_11_ + i_10_ * i_4_];
				if ((i_12_ & 0xffffff) != 0) {
					i_9_ = i_10_;
					break while_14_;
				}
			}
		}
		for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
			if ((is[i_13_] & 0xffffff) == 0)
				is[i_13_] = 0;
		}
		((Class4) this).anInt76 = i_6_ - i_9_;
		((Class4) this).anInt74 = i_8_;
		((Class4) this).anIntArray69[i] = i_5_;
		((Class4) this).aClass57Array73[i] = class_ra.method5031(is, 0, i_4_, i_4_, i_7_, -939201391);
	}

	int method306() {
		return ((Class4) this).anInt76;
	}

	int method307(String string) {
		int i = 0;
		for (int i_14_ = 0; i_14_ < string.length(); i_14_++) {
			int i_15_ = anIntArray71[string.charAt(i_14_)];
			i += ((Class4) this).anIntArray69[i_15_];
		}
		return i;
	}

	Class4(GraphicsToolkit class_ra, int i, boolean bool, Component component) {
		((Class4) this).aBoolean72 = false;
		((Class4) this).aClass57Array73 = new Class57[256];
		((Class4) this).anIntArray69 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_16_ = 0; i_16_ < anInt70; i_16_++)
			method305(class_ra, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_16_), i_16_, false);
		if (bool && ((Class4) this).aBoolean72) {
			((Class4) this).aBoolean72 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_17_ = 0; i_17_ < anInt70; i_17_++)
				method305(class_ra, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_17_), i_17_, false);
			if (!((Class4) this).aBoolean72) {
				((Class4) this).aBoolean72 = false;
				for (int i_18_ = 0; i_18_ < anInt70; i_18_++)
					method305(class_ra, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_18_), i_18_, true);
			}
		}
	}

	void method308(GraphicsToolkit class_ra, String string, int i, int i_19_, int i_20_, boolean bool) {
		int i_21_ = method307(string) / 2;
		class_ra.qa(((Class4) this).anIntArray77);
		if (i - i_21_ <= ((Class4) this).anIntArray77[2] && i + i_21_ >= ((Class4) this).anIntArray77[0] && (i_19_ - ((Class4) this).anInt76 <= ((Class4) this).anIntArray77[3]) && (i_19_ + ((Class4) this).anInt74 >= ((Class4) this).anIntArray77[1]))
			method304(class_ra, string, ((Class4) this).anIntArray77, i - i_21_, i_19_, i_20_, bool);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
			if (i_22_ == -1)
				i_22_ = 74;
			anIntArray71[i] = i_22_;
		}
	}

	int method309() {
		return ((Class4) this).anInt74 - 1;
	}
}
