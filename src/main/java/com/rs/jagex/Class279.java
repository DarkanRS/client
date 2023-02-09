package com.rs.jagex;

import java.awt.*;
import java.util.Stack;

public class Class279 {

	public static Class279 aClass279_3368 = new Class279();
	static int anInt3370;
	static Class279 aClass279_3369 = new Class279();
	static Class279 aClass279_3367 = new Class279();

	static void method4964() {
		Class9.lobbyStage = 140;
		Class9.CURRENT_CONNECTION_CONTEXT = client.LOBBY_CONNECTION_CONTEXT;
		Class455.method7558(Class9.aLong77 == -1L, true, "", "", Class9.aLong77);
	}

	static void method4969(Class285 class285_0) {
		class285_0.aTransform_Sub1_3391 = null;
		Stack<Class285> stack_2 = Class285.aStack3390;
		synchronized (Class285.aStack3390) {
			if (Class285.aStack3390.size() < 200)
				Class285.aStack3390.push(class285_0);
		}
	}

	static void renderItems(AbstractRenderer currentRenderer) {
		if (!Class182.ITEMS.isEmpty()) {
			Item item;
			if (Class393.preferences.currentToolkit.getValue() == 0) {
				for (item = (Item) Class182.ITEMS.head(); item != null; item = (Item) Class182.ITEMS.next()) {
					IndexLoaders.ITEM_LOADER.getSprite(currentRenderer, currentRenderer, item.id, item.amount, item.outlineSize, item.shadowColor, false, false, item.anInt7819, Renderers.FONT_RENDERER, item.hasPlayerAppearance ? VertexNormal.MY_PLAYER.model : null);
					item.unlink();
				}
				Static.method6378();
			} else {
				if (Class182.HARDWARE_RENDERER == null) {
					Canvas canvas_3 = new Canvas();
					canvas_3.setSize(36, 32);
					Class182.HARDWARE_RENDERER = AbstractRenderer.createRenderer(0, canvas_3, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0);
					Class182.aFontRenderer_2259 = Class182.HARDWARE_RENDERER.createFont(Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, Class16.p11FullIndex), SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, Class16.p11FullIndex), true);
				}
				for (item = (Item) Class182.ITEMS.head(); item != null; item = (Item) Class182.ITEMS.next()) {
					IndexLoaders.ITEM_LOADER.getSprite(Class182.HARDWARE_RENDERER, currentRenderer, item.id, item.amount, item.outlineSize, item.shadowColor, false, false, item.anInt7819, Class182.aFontRenderer_2259, item.hasPlayerAppearance ? VertexNormal.MY_PLAYER.model : null);
					item.unlink();
				}
			}
		}
	}
}
