package com.jagex;

import java.awt.Component;
import java.util.Arrays;
import java.util.Random;

public abstract class FontRenderer {

	static int STRIKETHROUGH_COLOR = -1;
	static int anInt62 = -1;
	static int anInt63;
	static int anInt64;
	static int anInt65;
	static int anInt57;
	static int anInt67;
	static int anInt68;
	static String[] aStringArray69 = new String[100];
	public static Class209 method400(Component component_0) {
		return new Class209_Sub1(component_0);
	}
	static void method402() {
		Class179.anInt2230 = SkyboxIndexLoader.aClass414_3438.topPadding + SkyboxIndexLoader.aClass414_3438.bottomPadding + 2;
		Class179.anInt2222 = Class16.aClass414_139.topPadding + Class16.aClass414_139.bottomPadding + 2;
		Class13.aStringArray129 = new String[500];
		Arrays.fill(Class13.aStringArray129, "");
		Class209.printConsoleMessage(LocalizedText.DEVELOPER_CONSOLE_INTRO.translate(Class223.CURRENT_LANGUAGE));
	}

	AbstractRenderer renderer;

	FontMetrics fontMetrics;

	FontRenderer(AbstractRenderer graphicalrenderer_1, FontMetrics fontmetrics_2) {
		renderer = graphicalrenderer_1;
		fontMetrics = fontmetrics_2;
	}

	void applySpecialEffects(String s) {
		try {
			if (s.startsWith("col="))
				anInt64 = anInt64 & ~0xffffff | Class285.method5026(s.substring(4)) & 0xffffff;
			else if ("/col".equals(s))
				anInt64 = anInt64 & ~0xffffff | anInt63 & 0xffffff;
			if (s.startsWith("argb="))
				anInt64 = Class285.method5026(s.substring(5));
			else if ("/argb".equals(s))
				anInt64 = anInt63;
			else if (s.startsWith("str="))
				STRIKETHROUGH_COLOR = anInt64 & ~0xffffff | Class285.method5026(s.substring(4));
			else if ("str".equals(s))
				STRIKETHROUGH_COLOR = anInt64 & ~0xffffff | 0x800000;
			else if ("/str".equals(s))
				STRIKETHROUGH_COLOR = -1;
			else if (s.startsWith("u="))
				anInt62 = anInt64 & ~0xffffff | Class285.method5026(s.substring(2));
			else if ("u".equals(s))
				anInt62 = anInt64 & ~0xffffff;
			else if ("/u".equals(s))
				anInt62 = -1;
			else if ("shad=-1".equalsIgnoreCase(s))
				anInt57 = 0;
			else if (s.startsWith("shad="))
				anInt57 = anInt64 & ~0xffffff | Class285.method5026(s.substring(5));
			else if ("shad".equals(s))
				anInt57 = anInt64 & ~0xffffff;
			else if ("/shad".equals(s))
				anInt57 = anInt65;
			else if ("br".equals(s))
				method365(anInt63, anInt65);
		} catch (Exception ignored) {
		}
	}

	abstract void c(char var1, int var2, int var3, int var4, boolean var5);

	public void drawText(String string_1, int i_2, int i_3, int i_4, int i_5) {
		if (string_1 != null) {
			method365(i_4, i_5);
			method371(string_1, i_2 - fontMetrics.getWidthNoSprites(string_1), i_3, null, null, null, 0, 0);
		}
	}

	public void method360(String string_1, int i_2, int i_3, int i_4, int i_5) {
		if (string_1 != null) {
			method365(i_4, i_5);
			method371(string_1, i_2 - fontMetrics.getWidthNoSprites(string_1) / 2, i_3, null, null, null, 0, 0);
		}
	}

	abstract void method362(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

	void method365(int i_1, int i_2) {
		int i_21 = i_2;
		STRIKETHROUGH_COLOR = -1;
		anInt62 = -1;
		anInt63 = i_1;
		anInt64 = i_1;
		anInt67 = 0;
		anInt68 = 0;
		if (i_21 == -1)
			i_21 = 0;
		anInt65 = i_21;
		anInt57 = i_21;
	}

	public int method367(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, Random random_10, int i_11, int[] ints_12, NativeSprite[] arr_13, int[] ints_14) {
		if (string_1 == null)
			return 0;
		random_10.setSeed(i_11);
		int i_16 = 192 + (random_10.nextInt() & 0x1f);
		method365(i_16 << 24 | i_6 & 0xffffff, i_7 == -1 ? 0 : i_16 << 24 | i_7 & 0xffffff);
		int i_17 = string_1.length();
		int[] ints_18 = new int[i_17];
		int i_19 = 0;
		int i_20;
		for (i_20 = 0; i_20 < i_17; i_20++) {
			ints_18[i_20] = i_19;
			if ((random_10.nextInt() & 0x3) == 0)
				++i_19;
		}
		i_20 = i_2;
		int i_21 = i_3 + fontMetrics.topPadding;
		int i_22 = -1;
		if (i_9 == 1)
			i_21 += (i_5 - fontMetrics.topPadding - fontMetrics.bottomPadding) / 2;
		else if (i_9 == 2)
			i_21 = i_3 + i_5 - fontMetrics.bottomPadding;
		if (i_8 == 1) {
			i_22 = fontMetrics.getWidthNoSprites(string_1) + i_19;
			i_20 = (i_4 - i_22) / 2 + i_2;
		} else if (i_8 == 2) {
			i_22 = fontMetrics.getWidthNoSprites(string_1) + i_19;
			i_20 = i_2 + (i_4 - i_22);
		}
		method372(string_1, i_20, i_21, arr_13, ints_14, ints_18, null);
		if (ints_12 != null) {
			if (i_22 == -1)
				i_22 = fontMetrics.getWidthNoSprites(string_1) + i_19;
			ints_12[0] = i_20;
			ints_12[1] = i_21 - fontMetrics.topPadding;
			ints_12[2] = i_22;
			ints_12[3] = fontMetrics.bottomPadding + fontMetrics.topPadding;
		}
		return i_19;
	}

	public void method368(String string_1, int i_2, int i_3, int i_4, int i_6) {
		if (string_1 != null) {
			method365(i_4, ~0xffffff);
			int i_8 = string_1.length();
			int[] ints_9 = new int[i_8];
			int[] ints_10 = new int[i_8];
			for (int i_11 = 0; i_11 < i_8; i_11++) {
				ints_9[i_11] = (int) (Math.sin(i_6 / 5.0D + i_11 / 5.0D) * 5.0D);
				ints_10[i_11] = (int) (Math.sin(i_6 / 5.0D + i_11 / 3.0D) * 5.0D);
			}
			method372(string_1, i_2 - fontMetrics.getWidthNoSprites(string_1) / 2, i_3, null, null, ints_9, ints_10);
		}
	}

	void method370(String string_1, int i_2) {
		int i_4 = 0;
		boolean bool_5 = false;
		for (int i_6 = 0; i_6 < string_1.length(); i_6++) {
			char var_7 = string_1.charAt(i_6);
			if (var_7 == 60)
				bool_5 = true;
			else if (var_7 == 62)
				bool_5 = false;
			else if (!bool_5 && var_7 == 32)
				++i_4;
		}
		if (i_4 > 0)
			anInt67 = (i_2 - fontMetrics.getWidthNoSprites(string_1) << 8) / i_4;
	}

	void method371(String string_1, int i_2, int i_3, NativeSprite[] arr_4, int[] ints_5, Class455 class455_6, int i_7, int i_8) {
		i_3 -= fontMetrics.verticalSpacing;
		int i_10 = -1;
		int i_11 = -1;
		int i_12 = string_1.length();
		for (int i_13 = 0; i_13 < i_12; i_13++) {
			char var_14 = (char) (QuestIndexLoader.getByteForChar(string_1.charAt(i_13)) & 0xff);
			if (var_14 == 60)
				i_10 = i_13;
			else {
				if (var_14 == 62 && i_10 != -1) {
					String string_15 = string_1.substring(i_10 + 1, i_13);
					i_10 = -1;
					if ("lt".equals(string_15))
						var_14 = 60;
					else if ("gt".equals(string_15))
						var_14 = 62;
					else if ("nbsp".equals(string_15))
						var_14 = 160;
					else if ("shy".equals(string_15))
						var_14 = 173;
					else if ("times".equals(string_15))
						var_14 = 215;
					else if ("euro".equals(string_15))
						var_14 = 8364;
					else if ("copy".equals(string_15))
						var_14 = 169;
					else {
						if (!"reg".equals(string_15)) {
							if (string_15.startsWith("img="))
								try {
									int i_16 = Utils.parseInt(string_15.substring(4));
									NativeSprite nativesprite_17 = arr_4[i_16];
									int i_18 = ints_5 != null ? ints_5[i_16] : nativesprite_17.method2748();
									if ((anInt64 & ~0xffffff) == ~0xffffff)
										nativesprite_17.method2742(i_2, i_3 + fontMetrics.verticalSpacing - i_18, 1, 0, 1);
									else
										nativesprite_17.method2742(i_2, i_3 + fontMetrics.verticalSpacing - i_18, 0, anInt64 & ~0xffffff | 0xffffff, 1);
									i_2 += arr_4[i_16].scaleWidth();
									i_11 = -1;
								} catch (Exception ignored) {
								}
							else
								applySpecialEffects(string_15);
							continue;
						}
						var_14 = 174;
					}
				}
				if (i_10 == -1) {
					if (i_11 != -1)
						i_2 += fontMetrics.getKerning(i_11, var_14);
					if (var_14 != 32) {
						if (class455_6 == null) {
							if ((anInt57 & ~0xffffff) != 0)
								UA(var_14, i_2 + 1, i_3 + 1, anInt57, true);
							UA(var_14, i_2, i_3, anInt64, false);
						} else {
							if ((anInt57 & ~0xffffff) != 0)
								method374(var_14, i_2 + 1, i_3 + 1, anInt57, true, class455_6, i_7, i_8);
							method374(var_14, i_2, i_3, anInt64, false, class455_6, i_7, i_8);
						}
					} else if (anInt67 > 0) {
						anInt68 += anInt67;
						i_2 += anInt68 >> 8;
			anInt68 &= 0xff;
					}
					int i_20 = fontMetrics.method6945(var_14);
					if (STRIKETHROUGH_COLOR != -1)
						renderer.method8659(i_2, i_3 + (int) (0.7D * fontMetrics.verticalSpacing), i_20, STRIKETHROUGH_COLOR);
					if (anInt62 != -1)
						renderer.method8659(i_2, i_3 + fontMetrics.verticalSpacing + 1, i_20, anInt62);
					i_2 += i_20;
					i_11 = var_14;
				}
			}
		}
	}

	void method372(String string_1, int i_2, int i_3, NativeSprite[] arr_4, int[] ints_5, int[] ints_6, int[] ints_7) {
		i_3 -= fontMetrics.verticalSpacing;
		int i_9 = -1;
		int i_10 = -1;
		int i_11 = 0;
		int i_12 = string_1.length();
		for (int i_13 = 0; i_13 < i_12; i_13++) {
			char var_14 = (char) (QuestIndexLoader.getByteForChar(string_1.charAt(i_13)) & 0xff);
			if (var_14 == 60)
				i_9 = i_13;
			else {
				int i_16;
				int i_17;
				if (var_14 == 62 && i_9 != -1) {
					String string_15 = string_1.substring(i_9 + 1, i_13);
					i_9 = -1;
					if ("lt".equals(string_15))
						var_14 = 60;
					else if ("gt".equals(string_15))
						var_14 = 62;
					else if ("nbsp".equals(string_15))
						var_14 = 160;
					else if ("shy".equals(string_15))
						var_14 = 173;
					else if ("times".equals(string_15))
						var_14 = 215;
					else if ("euro".equals(string_15))
						var_14 = 8364;
					else if ("copy".equals(string_15))
						var_14 = 169;
					else if ("reg".equals(string_15))
						var_14 = '\u00ae';
					else {
						if (string_15.startsWith("img="))
							try {
								if (ints_6 != null)
									i_16 = ints_6[i_11];
								else
									i_16 = 0;
								if (ints_7 != null)
									i_17 = ints_7[i_11];
								else
									i_17 = 0;
								++i_11;
								int i_18 = Utils.parseInt(string_15.substring(4));
								NativeSprite nativesprite_19 = arr_4[i_18];
								int i_20 = ints_5 != null ? ints_5[i_18] : nativesprite_19.method2748();
								nativesprite_19.method2742(i_16 + i_2, i_3 + fontMetrics.verticalSpacing - i_20 + i_17, 1, 0, 1);
								i_2 += arr_4[i_18].scaleWidth();
								i_10 = -1;
							} catch (Exception ignored) {
							}
						else
							applySpecialEffects(string_15);
						continue;
					}
				}
				if (i_9 == -1) {
					if (i_10 != -1)
						i_2 += fontMetrics.getKerning(i_10, var_14);
					int i_22;
					if (ints_6 != null)
						i_22 = ints_6[i_11];
					else
						i_22 = 0;
					if (ints_7 != null)
						i_16 = ints_7[i_11];
					else
						i_16 = 0;
					++i_11;
					if (var_14 != 32) {
						if ((anInt57 & ~0xffffff) != 0)
							UA(var_14, i_22 + i_2 + 1, i_3 + i_16 + 1, anInt57, true);
						UA(var_14, i_22 + i_2, i_3 + i_16, anInt64, false);
					} else if (anInt67 > 0) {
						anInt68 += anInt67;
						i_2 += anInt68 >> 8;
			anInt68 &= 0xff;
					}
					i_17 = fontMetrics.method6945(var_14);
					if (STRIKETHROUGH_COLOR != -1)
						renderer.method8659(i_2, i_3 + (int) (fontMetrics.verticalSpacing * 0.7D), i_17, STRIKETHROUGH_COLOR);
					if (anInt62 != -1)
						renderer.method8659(i_2, i_3 + fontMetrics.verticalSpacing, i_17, anInt62);
					i_2 += i_17;
					i_10 = var_14;
				}
			}
		}
	}

	public int method373(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, NativeSprite[] arr_12, int[] ints_13, Class455 class455_14, int i_15, int i_16) {
		int i_101 = i_10;
		int i_111 = i_11;
		int i_91 = i_9;
		if (string_1 == null)
			return 0;
		method365(i_6, i_7);
		if (i_101 == 0)
			i_101 = fontMetrics.verticalSpacing;
		int[] ints_18;
		if (i_5 < i_101 + fontMetrics.bottomPadding + fontMetrics.topPadding && i_5 < i_101 + i_101)
			ints_18 = null;
		else
			ints_18 = new int[]{i_4};
		int i_19 = fontMetrics.method6987(string_1, ints_18, aStringArray69, arr_12);
		if (i_111 == -1) {
			i_111 = i_5 / i_101;
			if (i_111 <= 0)
				i_111 = 1;
		}
		if (i_111 > 0 && i_19 >= i_111) {
			aStringArray69[i_111 - 1] = fontMetrics.fitText(aStringArray69[i_111 - 1], i_4, arr_12);
			i_19 = i_111;
		}
		if (i_91 == 3 && i_19 == 1)
			i_91 = 1;
		int i_20;
		int i_21;
		if (i_91 == 0)
			i_20 = i_3 + fontMetrics.topPadding;
		else if (i_91 == 1)
			i_20 = (i_5 - fontMetrics.topPadding - fontMetrics.bottomPadding - i_101 * (i_19 - 1)) / 2 + i_3 + fontMetrics.topPadding;
		else if (i_91 == 2)
			i_20 = i_3 + i_5 - fontMetrics.bottomPadding - i_101 * (i_19 - 1);
		else {
			i_21 = (i_5 - fontMetrics.topPadding - fontMetrics.bottomPadding - i_101 * (i_19 - 1)) / (i_19 + 1);
			if (i_21 < 0)
				i_21 = 0;
			i_20 = i_3 + fontMetrics.topPadding + i_21;
			i_101 += i_21;
		}
		for (i_21 = 0; i_21 < i_19; i_21++) {
			if (i_8 == 0)
				method371(aStringArray69[i_21], i_2, i_20, arr_12, ints_13, class455_14, i_15, i_16);
			else if (i_8 == 1)
				method371(aStringArray69[i_21], i_2 + (i_4 - fontMetrics.getWidthNoSprites(aStringArray69[i_21])) / 2, i_20, arr_12, ints_13, class455_14, i_15, i_16);
			else if (i_8 == 2)
				method371(aStringArray69[i_21], i_2 + i_4 - fontMetrics.getWidthNoSprites(aStringArray69[i_21]), i_20, arr_12, ints_13, class455_14, i_15, i_16);
			else if (i_21 == i_19 - 1)
				method371(aStringArray69[i_21], i_2, i_20, arr_12, ints_13, class455_14, i_15, i_16);
			else {
				method370(aStringArray69[i_21], i_4);
				method371(aStringArray69[i_21], i_2, i_20, arr_12, ints_13, class455_14, i_15, i_16);
				anInt67 = 0;
			}
			i_20 += i_101;
		}
		return i_19;
	}

	abstract void method374(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

	public int method378(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, NativeSprite[] arr_11, int[] ints_12, Class455 class455_13, int i_14, int i_15) {
		return method373(string_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, 0, arr_11, ints_12, class455_13, i_14, i_15);
	}

	public void method381(String string_1, int i_2, int i_3, int i_4, int i_6, int i_7) {
		if (string_1 != null) {
			method365(i_4, ~0xffffff);
			double d_9 = 7.0D - i_7 / 8.0D;
			if (d_9 < 0.0D)
				d_9 = 0.0D;
			int i_11 = string_1.length();
			int[] ints_12 = new int[i_11];
			for (int i_13 = 0; i_13 < i_11; i_13++)
				ints_12[i_13] = (int) (Math.sin(i_6 / 1.0D + i_13 / 1.5D) * d_9);
			method372(string_1, i_2 - fontMetrics.getWidthNoSprites(string_1) / 2, i_3, null, null, null, ints_12);
		}
	}

	public int method386(String string_1, int i_2, int i_3, int i_4, Random random_6, int i_7, NativeSprite[] arr_8, int[] ints_9) {
		if (string_1 == null)
			return 0;
		random_6.setSeed(i_7);
		int i_11 = 192 + (random_6.nextInt() & 0x1f);
		method365(i_11 << 24 | i_4 & 0xffffff, i_11 << 24);
		int i_12 = string_1.length();
		int[] ints_13 = new int[i_12];
		int i_14 = 0;
		for (int i_15 = 0; i_15 < i_12; i_15++) {
			ints_13[i_15] = i_14;
			if ((random_6.nextInt() & 0x3) == 0)
				++i_14;
		}
		method372(string_1, i_2, i_3, arr_8, ints_9, ints_13, null);
		return i_14;
	}

	public void method387(String string_1, int i_2, int i_3, int i_4, int i_6) {
		if (string_1 != null) {
			method365(i_4, ~0xffffff);
			int i_8 = string_1.length();
			int[] ints_9 = new int[i_8];
			for (int i_10 = 0; i_10 < i_8; i_10++)
				ints_9[i_10] = (int) (Math.sin(i_6 / 5.0D + i_10 / 2.0D) * 5.0D);
			method372(string_1, i_2 - fontMetrics.getWidthNoSprites(string_1) / 2, i_3, null, null, null, ints_9);
		}
	}

	public void renderText(String string_1, int i_2, int i_3, int i_4, int i_5) {
		if (string_1 != null) {
			method365(i_4, i_5);
			method371(string_1, i_2, i_3, null, null, null, 0, 0);
		}
	}

	abstract void t(char var1, int var2, int var3, int var4, boolean var5);

	abstract void UA(char var1, int var2, int var3, int var4, boolean var5);
}
