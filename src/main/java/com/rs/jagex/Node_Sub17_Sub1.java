package com.rs.jagex;

import com.rs.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub1 extends ClanSettingDeltaUpdate {

	public static void method15402(int renderType, String loadingText, boolean isFullScreen) {
		if (renderType == 0) {
			Renderers.CURRENT_RENDERER = AbstractRenderer.createRenderer(0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, Class393.preferences.aPreference_Sub4_8223.method12641() * 2);
			if (loadingText != null) {
				Renderers.CURRENT_RENDERER.ba(1, 0);
				FontMetrics fontmetrics_4 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, Class16.p12FullIndex);
				FontRenderer fontrenderer_5 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_4, SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, Class16.p12FullIndex), true);
				EntityNode.method4891();
				Class446.method7447(loadingText, true, Renderers.CURRENT_RENDERER, fontrenderer_5, fontmetrics_4);
			}
		} else {
			AbstractRenderer renderer = null;
			FontMetrics fontmetrics_17;
			FontRenderer fontrenderer_6;
			if (loadingText != null) {
				renderer = AbstractRenderer.createRenderer(0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0);
				renderer.ba(1, 0);
				fontmetrics_17 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, Class16.p12FullIndex);
				fontrenderer_6 = renderer.createFont(fontmetrics_17, SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, Class16.p12FullIndex), true);
				EntityNode.method4891();
				Class446.method7447(loadingText, true, renderer, fontrenderer_6, fontmetrics_17);
			}
			try {
				try {
					Renderers.CURRENT_RENDERER = AbstractRenderer.createRenderer(renderType, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, Class393.preferences.aPreference_Sub4_8223.method12641() * 2);
					if (loadingText != null) {
						renderer.ba(1, 0);
						fontmetrics_17 = Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, Class16.p12FullIndex);
						fontrenderer_6 = renderer.createFont(fontmetrics_17, SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, Class16.p12FullIndex), true);
						EntityNode.method4891();
						Class446.method7447(loadingText, true, renderer, fontrenderer_6, fontmetrics_17);
					}
					if (Renderers.CURRENT_RENDERER.method8399()) {
						boolean bool_8 = true;
						try {
							bool_8 = Class11.SYSTEM_INFO.ram > 256;
						} catch (Throwable ignored) {
						}
						Node_Sub1 class282_sub1_18;
						if (bool_8)
							class282_sub1_18 = Renderers.CURRENT_RENDERER.method8438(146800640);
						else
							class282_sub1_18 = Renderers.CURRENT_RENDERER.method8438(104857600);
						Renderers.CURRENT_RENDERER.method8439(class282_sub1_18);
					}
				} catch (Throwable throwable_14) {
					int i_9 = Class393.preferences.currentToolkit.getValue();
					if (i_9 == 2)
						client.aBool7171 = true;
					Class393.preferences.setValue(Class393.preferences.currentToolkit, 0);
					method15402(i_9, loadingText, isFullScreen);
					if (renderer != null)
						try {
							renderer.method8396();
						} catch (Throwable ignored) {
						}
					return;
				}
				if (renderer != null)
					try {
						renderer.method8396();
					} catch (Throwable ignored) {
					}
			} catch (Exception exception_15) {
				if (renderer != null)
					try {
						renderer.method8396();
					} catch (Throwable ignored) {
					}
			}
		}
		if (isFullScreen)
			Class393.preferences.method13505(Class393.preferences.currentToolkit, !isFullScreen);
		Class393.preferences.setValue(Class393.preferences.currentToolkit, renderType);
		if (!isFullScreen)
			Class393.preferences.method13505(Class393.preferences.currentToolkit, !isFullScreen);
		HostNameIdentifier.method482();
		Renderers.CURRENT_RENDERER.method8459();
		Renderers.CURRENT_RENDERER.J();
		IndexLoaders.MAP_REGION_DECODER.method4447();
		Renderers.CURRENT_RENDERER.method8568();
		if (Renderers.CURRENT_RENDERER.method8403())
			Class115.setBloom(Class393.preferences.bloom.method12706() == 1);
		IndexLoaders.MAP_REGION_DECODER.method4446();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
		client.aBool7175 = false;
		client.aBool7185 = true;
		Class149_Sub3.aClass467Array9380 = null;
		Renderers.CURRENT_RENDERER.GA();
	}
	long aLong9930;
	String aString9931;

	ClanSettingsDelta this$0;

	Node_Sub17_Sub1(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
		aLong9930 = -1L;
		aString9931 = null;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.method1216(aLong9930, aString9931, 0);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			aLong9930 = rsbytebuffer_1.readLong();
		}
		aString9931 = rsbytebuffer_1.readNullString();
	}
}
