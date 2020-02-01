package com.jagex;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class194 {

	static int anInt2402 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
	static int[] anIntArray2406 = new int[256];
	int anInt2407;
	int anInt2408;
	boolean aBool2404 = false;
	int[] anIntArray2409 = new int[4];
	NativeSprite[] aNativeSpriteArray2405;
	int[] anIntArray2403;

	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
			if (i_22_ == -1)
				i_22_ = 74;
			anIntArray2406[i] = i_22_;
		}

	}

	int method3173() {
		return this.anInt2408 - 1;
	}

	void method3175(GraphicalRenderer graphicalrenderer_1, String string_2, int[] ints_3, int i_4, int i_5, int i_6, boolean bool_7) {
		if (i_6 == 0) {
			bool_7 = false;
		}

		i_6 |= ~0xffffff;

		for (int i_8 = 0; i_8 < string_2.length(); i_8++) {
			int i_9 = anIntArray2406[string_2.charAt(i_8)];
			if (bool_7) {
				this.aNativeSpriteArray2405[i_9].method2742(i_4 + 1, i_5 + 1, 0, -16777216, 1);
			}

			this.aNativeSpriteArray2405[i_9].method2742(i_4, i_5, 0, i_6, 1);
			i_4 += this.anIntArray2403[i_9];
		}

	}

	int method3177(String string_1) {
		int i_2 = 0;

		for (int i_3 = 0; i_3 < string_1.length(); i_3++) {
			int i_4 = anIntArray2406[string_1.charAt(i_3)];
			i_2 += this.anIntArray2403[i_4];
		}

		return i_2;
	}

	void method3178(GraphicalRenderer graphicalrenderer_1, String string_2, int i_3, int i_4, int i_5) {
		int i_7 = this.method3177(string_2) / 2;
		graphicalrenderer_1.qa(this.anIntArray2409);
		if (i_3 - i_7 <= this.anIntArray2409[2] && i_3 + i_7 >= this.anIntArray2409[0] && i_4 - this.anInt2407 <= this.anIntArray2409[3] && i_4 + this.anInt2408 >= this.anIntArray2409[1]) {
			this.method3175(graphicalrenderer_1, string_2, this.anIntArray2409, i_3 - i_7, i_4, i_5, true);
		}

	}

	void method3179(GraphicalRenderer graphicalrenderer_1, Font font_2, java.awt.FontMetrics fontmetrics_3, char var_4, int i_5, boolean bool_6) {
		int i_7 = fontmetrics_3.charWidth(var_4);
		int i_8 = i_7;
		if (bool_6) {
			try {
				if (var_4 == 47) {
					bool_6 = false;
				}

				if (var_4 == 102 || var_4 == 116 || var_4 == 119 || var_4 == 118 || var_4 == 107 || var_4 == 120 || var_4 == 121 || var_4 == 65 || var_4 == 86 || var_4 == 87) {
					++i_7;
				}
			} catch (Exception exception_23) {
				;
			}
		}

		int i_21 = fontmetrics_3.getMaxAscent();
		int i_10 = fontmetrics_3.getMaxAscent() + fontmetrics_3.getMaxDescent();
		int i_11 = fontmetrics_3.getHeight();
		Image image_12 = Class351.gameCanvas.createImage(i_7, i_10);
		Graphics graphics_13 = image_12.getGraphics();
		graphics_13.setColor(Color.black);
		graphics_13.fillRect(0, 0, i_7, i_10);
		graphics_13.setColor(Color.white);
		graphics_13.setFont(font_2);
		graphics_13.drawString(var_4 + "", 0, i_21);
		if (bool_6) {
			graphics_13.drawString(var_4 + "", 1, i_21);
		}

		int[] ints_14 = new int[i_7 * i_10];
		PixelGrabber pixelgrabber_15 = new PixelGrabber(image_12, 0, 0, i_7, i_10, ints_14, 0, i_7);

		try {
			pixelgrabber_15.grabPixels();
		} catch (Exception exception_22) {
			;
		}

		image_12.flush();
		Object obj_16 = null;
		int i_17 = 0;

		int i_18;
		label66: for (i_18 = 0; i_18 < i_10; i_18++) {
			for (int i_19 = 0; i_19 < i_7; i_19++) {
				int i_20 = ints_14[i_19 + i_18 * i_7];
				if ((i_20 & 0xffffff) != 0) {
					i_17 = i_18;
					break label66;
				}
			}
		}

		for (i_18 = 0; i_18 < ints_14.length; i_18++) {
			if ((ints_14[i_18] & 0xffffff) == 0) {
				ints_14[i_18] = 0;
			}
		}

		this.anInt2407 = i_21 - i_17;
		this.anInt2408 = i_11;
		this.anIntArray2403[i_5] = i_8;
		this.aNativeSpriteArray2405[i_5] = graphicalrenderer_1.createNativeSprite(ints_14, i_7, i_7, i_10, -829104519);
	}

	Class194(GraphicalRenderer class505, int i, Component component) {
		((Class194) this).aBool2404 = false;
		((Class194) this).aNativeSpriteArray2405 = new NativeSprite[256];
		((Class194) this).anIntArray2403 = new int[256];
		Font font = new Font("Helvetica", true ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_53_ = 0; i_53_ < anInt2402; i_53_++)
			method3179(class505, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_53_), i_53_, false);
		if (true && ((Class194) this).aBool2404) {
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

	int method3186() {
		return this.anInt2407;
	}

}
