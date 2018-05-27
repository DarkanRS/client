
/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class194 {
	static final String aString2401 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7";
	static int anInt2402 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
	int[] anIntArray2403;
	boolean aBool2404 = false;
	NativeSprite[] aClass160Array2405;
	static int[] anIntArray2406 = new int[256];
	int anInt2407;
	int anInt2408;
	int[] anIntArray2409 = new int[4];

	int method3173() {
		return ((Class194) this).anInt2408 - 1;
	}

	int method3174() {
		return ((Class194) this).anInt2407;
	}

	void method3175(GraphicalRenderer class505, String string, int[] is, int i, int i_0_, int i_1_, boolean bool) {
		if (i_1_ == 0)
			bool = false;
		i_1_ |= ~0xffffff;
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
			int i_3_ = anIntArray2406[string.charAt(i_2_)];
			if (bool)
				((Class194) this).aClass160Array2405[i_3_].method2742(i + 1, i_0_ + 1, 0, -16777216, 1);
			((Class194) this).aClass160Array2405[i_3_].method2742(i, i_0_, 0, i_1_, 1);
			i += ((Class194) this).anIntArray2403[i_3_];
		}
	}

	void method3176(GraphicalRenderer class505, String string, int i, int i_4_, int i_5_, boolean bool) {
		int i_6_ = method3177(string) / 2;
		class505.qa(((Class194) this).anIntArray2409);
		if (i - i_6_ <= ((Class194) this).anIntArray2409[2] && i + i_6_ >= ((Class194) this).anIntArray2409[0] && (i_4_ - ((Class194) this).anInt2407 <= ((Class194) this).anIntArray2409[3]) && (i_4_ + ((Class194) this).anInt2408 >= ((Class194) this).anIntArray2409[1]))
			method3175(class505, string, ((Class194) this).anIntArray2409, i - i_6_, i_4_, i_5_, bool);
	}

	int method3177(String string) {
		int i = 0;
		for (int i_7_ = 0; i_7_ < string.length(); i_7_++) {
			int i_8_ = anIntArray2406[string.charAt(i_7_)];
			i += ((Class194) this).anIntArray2403[i_8_];
		}
		return i;
	}

	void method3178(GraphicalRenderer class505, String string, int i, int i_9_, int i_10_, boolean bool) {
		int i_11_ = method3177(string) / 2;
		class505.qa(((Class194) this).anIntArray2409);
		if (i - i_11_ <= ((Class194) this).anIntArray2409[2] && i + i_11_ >= ((Class194) this).anIntArray2409[0] && (i_9_ - ((Class194) this).anInt2407 <= ((Class194) this).anIntArray2409[3]) && (i_9_ + ((Class194) this).anInt2408 >= ((Class194) this).anIntArray2409[1]))
			method3175(class505, string, ((Class194) this).anIntArray2409, i - i_11_, i_9_, i_10_, bool);
	}

	void method3179(GraphicalRenderer class505, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_12_ = fontmetrics.charWidth(c);
		int i_13_ = i_12_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_12_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_14_ = fontmetrics.getMaxAscent();
		int i_15_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_16_ = fontmetrics.getHeight();
		Image image = Class351.LOAD_CANVAS.createImage(i_12_, i_15_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_12_, i_15_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_14_);
		if (bool)
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_14_);
		int[] is = new int[i_12_ * i_15_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_12_, i_15_, is, 0, i_12_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_17_ = 0;
		while_186_: for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
			for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
				int i_20_ = is[i_19_ + i_18_ * i_12_];
				if ((i_20_ & 0xffffff) != 0) {
					i_17_ = i_18_;
					break while_186_;
				}
			}
		}
		for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
			if ((is[i_21_] & 0xffffff) == 0)
				is[i_21_] = 0;
		}
		((Class194) this).anInt2407 = i_14_ - i_17_;
		((Class194) this).anInt2408 = i_16_;
		((Class194) this).anIntArray2403[i] = i_13_;
		((Class194) this).aClass160Array2405[i] = class505.createNativeSprite(is, 0, i_12_, i_12_, i_15_, -829104519);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
			if (i_22_ == -1)
				i_22_ = 74;
			anIntArray2406[i] = i_22_;
		}
	}

	void method3180(GraphicalRenderer class505, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_23_ = fontmetrics.charWidth(c);
		int i_24_ = i_23_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_23_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_25_ = fontmetrics.getMaxAscent();
		int i_26_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_27_ = fontmetrics.getHeight();
		Image image = Class351.LOAD_CANVAS.createImage(i_23_, i_26_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_23_, i_26_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_25_);
		if (bool)
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_25_);
		int[] is = new int[i_23_ * i_26_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_23_, i_26_, is, 0, i_23_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_28_ = 0;
		while_187_: for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
			for (int i_30_ = 0; i_30_ < i_23_; i_30_++) {
				int i_31_ = is[i_30_ + i_29_ * i_23_];
				if ((i_31_ & 0xffffff) != 0) {
					i_28_ = i_29_;
					break while_187_;
				}
			}
		}
		for (int i_32_ = 0; i_32_ < is.length; i_32_++) {
			if ((is[i_32_] & 0xffffff) == 0)
				is[i_32_] = 0;
		}
		((Class194) this).anInt2407 = i_25_ - i_28_;
		((Class194) this).anInt2408 = i_27_;
		((Class194) this).anIntArray2403[i] = i_24_;
		((Class194) this).aClass160Array2405[i] = class505.createNativeSprite(is, 0, i_23_, i_23_, i_26_, 1394779103);
	}

	void method3181(GraphicalRenderer class505, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_33_ = fontmetrics.charWidth(c);
		int i_34_ = i_33_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_33_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_35_ = fontmetrics.getMaxAscent();
		int i_36_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_37_ = fontmetrics.getHeight();
		Image image = Class351.LOAD_CANVAS.createImage(i_33_, i_36_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_33_, i_36_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_35_);
		if (bool)
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_35_);
		int[] is = new int[i_33_ * i_36_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_33_, i_36_, is, 0, i_33_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_38_ = 0;
		while_188_: for (int i_39_ = 0; i_39_ < i_36_; i_39_++) {
			for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
				int i_41_ = is[i_40_ + i_39_ * i_33_];
				if ((i_41_ & 0xffffff) != 0) {
					i_38_ = i_39_;
					break while_188_;
				}
			}
		}
		for (int i_42_ = 0; i_42_ < is.length; i_42_++) {
			if ((is[i_42_] & 0xffffff) == 0)
				is[i_42_] = 0;
		}
		((Class194) this).anInt2407 = i_35_ - i_38_;
		((Class194) this).anInt2408 = i_37_;
		((Class194) this).anIntArray2403[i] = i_34_;
		((Class194) this).aClass160Array2405[i] = class505.createNativeSprite(is, 0, i_33_, i_33_, i_36_, -918979358);
	}

	void method3182(GraphicalRenderer class505, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_43_ = fontmetrics.charWidth(c);
		int i_44_ = i_43_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_43_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_45_ = fontmetrics.getMaxAscent();
		int i_46_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_47_ = fontmetrics.getHeight();
		Image image = Class351.LOAD_CANVAS.createImage(i_43_, i_46_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_43_, i_46_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder().append(c).append("").toString(), 0, i_45_);
		if (bool)
			graphics.drawString(new StringBuilder().append(c).append("").toString(), 1, i_45_);
		int[] is = new int[i_43_ * i_46_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_43_, i_46_, is, 0, i_43_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_48_ = 0;
		while_189_: for (int i_49_ = 0; i_49_ < i_46_; i_49_++) {
			for (int i_50_ = 0; i_50_ < i_43_; i_50_++) {
				int i_51_ = is[i_50_ + i_49_ * i_43_];
				if ((i_51_ & 0xffffff) != 0) {
					i_48_ = i_49_;
					break while_189_;
				}
			}
		}
		for (int i_52_ = 0; i_52_ < is.length; i_52_++) {
			if ((is[i_52_] & 0xffffff) == 0)
				is[i_52_] = 0;
		}
		((Class194) this).anInt2407 = i_45_ - i_48_;
		((Class194) this).anInt2408 = i_47_;
		((Class194) this).anIntArray2403[i] = i_44_;
		((Class194) this).aClass160Array2405[i] = class505.createNativeSprite(is, 0, i_43_, i_43_, i_46_, -535318270);
	}

	Class194(GraphicalRenderer class505, int i, boolean bool, Component component) {
		((Class194) this).aBool2404 = false;
		((Class194) this).aClass160Array2405 = new NativeSprite[256];
		((Class194) this).anIntArray2403 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_53_ = 0; i_53_ < anInt2402; i_53_++)
			method3179(class505, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_53_), i_53_, false);
		if (bool && ((Class194) this).aBool2404) {
			((Class194) this).aBool2404 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_54_ = 0; i_54_ < anInt2402; i_54_++)
				method3179(class505, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_54_), i_54_, false);
			if (!((Class194) this).aBool2404) {
				((Class194) this).aBool2404 = false;
				for (int i_55_ = 0; i_55_ < anInt2402; i_55_++)
					method3179(class505, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_55_), i_55_, true);
			}
		}
	}

	int method3183(String string) {
		int i = 0;
		for (int i_56_ = 0; i_56_ < string.length(); i_56_++) {
			int i_57_ = anIntArray2406[string.charAt(i_56_)];
			i += ((Class194) this).anIntArray2403[i_57_];
		}
		return i;
	}

	int method3184(String string) {
		int i = 0;
		for (int i_58_ = 0; i_58_ < string.length(); i_58_++) {
			int i_59_ = anIntArray2406[string.charAt(i_58_)];
			i += ((Class194) this).anIntArray2403[i_59_];
		}
		return i;
	}

	void method3185(GraphicalRenderer class505, String string, int i, int i_60_, int i_61_, boolean bool) {
		int i_62_ = method3177(string) / 2;
		class505.qa(((Class194) this).anIntArray2409);
		if (i - i_62_ <= ((Class194) this).anIntArray2409[2] && i + i_62_ >= ((Class194) this).anIntArray2409[0] && (i_60_ - ((Class194) this).anInt2407 <= ((Class194) this).anIntArray2409[3]) && (i_60_ + ((Class194) this).anInt2408 >= ((Class194) this).anIntArray2409[1]))
			method3175(class505, string, ((Class194) this).anIntArray2409, i - i_62_, i_60_, i_61_, bool);
	}

	int method3186() {
		return ((Class194) this).anInt2407;
	}

	void method3187(GraphicalRenderer class505, String string, int[] is, int i, int i_63_, int i_64_, boolean bool) {
		if (i_64_ == 0)
			bool = false;
		i_64_ |= ~0xffffff;
		for (int i_65_ = 0; i_65_ < string.length(); i_65_++) {
			int i_66_ = anIntArray2406[string.charAt(i_65_)];
			if (bool)
				((Class194) this).aClass160Array2405[i_66_].method2742(i + 1, i_63_ + 1, 0, -16777216, 1);
			((Class194) this).aClass160Array2405[i_66_].method2742(i, i_63_, 0, i_64_, 1);
			i += ((Class194) this).anIntArray2403[i_66_];
		}
	}
}
