package com.jagex;

import java.io.IOException;
import java.net.Socket;

import com.jagex.clans.settings.ChangeClanSetting;

public class SunDefinitions {

	public static Connection createAsyncConnection(Socket socket_0, int bufferSize) throws IOException {
		return new AsyncConnection(socket_0, bufferSize);
	}
	static boolean isItemClickType(int i_0) {
		return i_0 == 18 || i_0 == 19 || i_0 == 20 || i_0 == 21 || i_0 == 22 || i_0 == 1004 || i_0 == 17;
	}
	static void method851(int i_0) {
		HintArrow.anInt2246 = i_0;
		HintArrow.aClass229_2245.method3859();
	}
	public static RouteStrategy method853(int i_0, int i_1) {
		RouteStrategies.FIXED_TILE.approxDestinationX = i_0;
		RouteStrategies.FIXED_TILE.approxDestinationY = i_1;
		RouteStrategies.FIXED_TILE.approxDestinationSizeX = 1;
		RouteStrategies.FIXED_TILE.approxDestinationSizeY = 1;
		return RouteStrategies.FIXED_TILE;
	}
	public static void method854(boolean bool_0, boolean bool_1) {
		if (bool_0) {
			++Class540.anInt7137;
			Class371.method6351();
		}
		if (bool_1) {
			++Class540.anInt7135;
			CutsceneCameraMovement.method1365();
		}
	}
	static void method857(AbstractRenderer graphicalrenderer_0) {
		int i_2 = Class301.anInt3555;
		int i_3 = BufferedConnectionContext.anInt2300;
		int i_4 = Class158_Sub2.anInt8975;
		int i_5 = Class110.anInt1104 - 3;
		byte b_6 = 20;
		if (Class186.aFontRenderer_2348 == null || Class176.aClass414_2200 == null) {
			Class186.aFontRenderer_2348 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, QuestIndexLoader.anInt2982, true, true);
			Class176.aClass414_2200 = Class487.aClass378_5752.method6415(client.anInterface35_7206, QuestIndexLoader.anInt2982);
			if (Class186.aFontRenderer_2348 != null && Class176.aClass414_2200 != null) {
				Class316.method5594();
				int i_15 = i_4 / 2 + i_2;
				if (i_15 + i_4 > ChangeClanSetting.BASE_WINDOW_WIDTH)
					i_15 = ChangeClanSetting.BASE_WINDOW_WIDTH - i_4;
				if (i_15 < 0)
					i_15 = 0;
				Static.method4653(i_15, BufferedConnectionContext.anInt2300);
				return;
			}
		}
		FontRenderer fontrenderer_7;
		if (Class186.aFontRenderer_2348 != null && Class176.aClass414_2200 != null)
			fontrenderer_7 = Class186.aFontRenderer_2348;
		else
			fontrenderer_7 = Class285.aFontRenderer_3394;
		FontMetrics fontmetrics_8 = ShaderLoader.method1887();
		Animation_Sub2.method12680(graphicalrenderer_0, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, b_6, fontrenderer_7, fontmetrics_8, LocalizedText.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE));
		int i_9 = 255 - Class182.anInt2262 - Class20.anInt156;
		if (i_9 < 0)
			i_9 = 0;
		int i_10 = Class163.mouseRecorder.getMouseX();
		int i_11 = Class163.mouseRecorder.getMouseY();
		int i_12;
		CacheableNode_Sub7 class282_sub50_sub7_13;
		int i_14;
		CacheableNode_Sub15 class282_sub50_sub15_16;
		if (!Class20.aBool162) {
			i_12 = 0;
			for (class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
				i_14 = i_3 + b_6 + (Class20.anInt169 - 1 - i_12) * Class20.anInt178 + fontmetrics_8.topPadding + 1;
				if (i_10 > Class301.anInt3555 && i_10 < Class301.anInt3555 + Class158_Sub2.anInt8975 && i_11 > i_14 - fontmetrics_8.topPadding - 1 && i_11 < i_14 + fontmetrics_8.bottomPadding && class282_sub50_sub7_13.aBool9583)
					graphicalrenderer_0.B(Class301.anInt3555, i_14 - fontmetrics_8.topPadding, Class158_Sub2.anInt8975, Class20.anInt178, i_9 << 24 | Class20.anInt188, 1);
				++i_12;
			}
		} else {
			i_12 = 0;
			for (class282_sub50_sub15_16 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_16 != null; class282_sub50_sub15_16 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
				i_14 = i_3 + b_6 + i_12 * Class20.anInt178 + fontmetrics_8.topPadding + 1;
				if (i_10 > Class301.anInt3555 && i_10 < Class158_Sub2.anInt8975 + Class301.anInt3555 && i_11 > i_14 - fontmetrics_8.topPadding - 1 && i_11 < i_14 + fontmetrics_8.bottomPadding && (class282_sub50_sub15_16.anInt9769 > 1 || ((CacheableNode_Sub7) class282_sub50_sub15_16.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119).aBool9583))
					graphicalrenderer_0.B(Class301.anInt3555, i_14 - fontmetrics_8.topPadding, Class158_Sub2.anInt8975, Class20.anInt178, i_9 << 24 | Class20.anInt188, 1);
				++i_12;
			}
			if (Class20.aCacheableNode_Sub15_163 != null) {
				Animation_Sub2.method12680(graphicalrenderer_0, Class341.anInt3996, CacheableNode_Sub2.anInt9471, ObjectAnimationCutsceneAction.anInt8518, WallObjectGraphNode.anInt10526, b_6, fontrenderer_7, fontmetrics_8, Class20.aCacheableNode_Sub15_163.aString9771);
				i_12 = 0;
				for (class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aCacheableNode_Sub15_163.aClass477_9770.method7941(); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aCacheableNode_Sub15_163.aClass477_9770.method7955()) {
					i_14 = b_6 + i_12 * Class20.anInt178 + fontmetrics_8.topPadding + CacheableNode_Sub2.anInt9471 + 1;
					if (i_10 > Class341.anInt3996 && i_10 < ObjectAnimationCutsceneAction.anInt8518 + Class341.anInt3996 && i_11 > i_14 - fontmetrics_8.topPadding - 1 && i_11 < i_14 + fontmetrics_8.bottomPadding && class282_sub50_sub7_13.aBool9583)
						graphicalrenderer_0.B(Class341.anInt3996, i_14 - fontmetrics_8.topPadding, ObjectAnimationCutsceneAction.anInt8518, Class20.anInt178, i_9 << 24 | Class20.anInt188, 1);
					++i_12;
				}
				Class487.method8209(graphicalrenderer_0, Class341.anInt3996, CacheableNode_Sub2.anInt9471, ObjectAnimationCutsceneAction.anInt8518, WallObjectGraphNode.anInt10526, b_6);
			}
		}
		Class487.method8209(graphicalrenderer_0, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, b_6);
		if (!Class20.aBool162) {
			i_12 = 0;
			for (class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
				i_14 = i_3 + b_6 + (Class20.anInt169 - 1 - i_12) * Class20.anInt178 + fontmetrics_8.topPadding + 1;
				Node_Sub25.method12400(i_10, i_11, i_2, i_4, i_14, class282_sub50_sub7_13, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | -16777216, Class99.anInt1005 | -16777216);
				++i_12;
			}
		} else {
			i_12 = 0;
			for (class282_sub50_sub15_16 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_16 != null; class282_sub50_sub15_16 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
				i_14 = b_6 + i_12 * Class20.anInt178 + fontmetrics_8.topPadding + BufferedConnectionContext.anInt2300 + 1;
				if (class282_sub50_sub15_16.anInt9769 == 1)
					Node_Sub25.method12400(i_10, i_11, Class301.anInt3555, Class158_Sub2.anInt8975, i_14, (CacheableNode_Sub7) class282_sub50_sub15_16.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | -16777216, Class99.anInt1005 | -16777216);
				else
					Class99.method1630(i_10, i_11, Class301.anInt3555, Class158_Sub2.anInt8975, i_14, class282_sub50_sub15_16, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | -16777216, Class99.anInt1005 | -16777216);
				++i_12;
			}
			if (Class20.aCacheableNode_Sub15_163 != null) {
				i_12 = 0;
				for (class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aCacheableNode_Sub15_163.aClass477_9770.method7941(); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (CacheableNode_Sub7) Class20.aCacheableNode_Sub15_163.aClass477_9770.method7955()) {
					i_14 = b_6 + i_12 * Class20.anInt178 + fontmetrics_8.topPadding + CacheableNode_Sub2.anInt9471 + 1;
					Node_Sub25.method12400(i_10, i_11, Class341.anInt3996, ObjectAnimationCutsceneAction.anInt8518, i_14, class282_sub50_sub7_13, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | -16777216, Class99.anInt1005 | -16777216);
					++i_12;
				}
			}
		}
	}
	public int anInt396 = 8;
	public boolean aBool400;
	public int anInt401;
	public int anInt397;
	public int anInt399;

	public int anInt395;

	public int anInt402;

	public int anInt404 = 16777215;

	public int anInt403;

	public int anInt398;

	public int anInt405;

	void method843(ByteBuf stream, int opcode) {
		if (opcode == 1)
			anInt396 = stream.readUnsignedShort();
		else if (opcode == 2)
			aBool400 = true;
		else if (opcode == 3) {
			anInt401 = stream.readShort();
			anInt397 = stream.readShort();
			anInt399 = stream.readShort();
		} else if (opcode == 4)
			anInt395 = stream.readUnsignedByte();
		else if (opcode == 5)
			anInt402 = stream.readBigSmart();
		else if (opcode == 6)
			anInt404 = stream.read24BitUnsignedInteger();
		else if (opcode == 7) {
			anInt403 = stream.readShort();
			anInt398 = stream.readShort();
			anInt405 = stream.readShort();
		}
	}

	void method850(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;
			method843(rsbytebuffer_1, i_3);
		}
	}
}
