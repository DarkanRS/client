package com.jagex;

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
            if (Class285.aStack3390.size() < 200) {
                Class285.aStack3390.push(class285_0);
            }
        }
    }

    static void renderItems(AbstractRenderer graphicalrenderer_0) {
        if (!Class182.ITEMS.isEmpty()) {
            Item item_2;
            if (Class393.preferences.currentToolkit.getValue() == 0) {
                for (item_2 = (Item) Class182.ITEMS.head(); item_2 != null; item_2 = (Item) Class182.ITEMS.next()) {
                    IndexLoaders.ITEM_LOADER.getSprite(graphicalrenderer_0, graphicalrenderer_0, item_2.id, item_2.amount, item_2.outlineSize, item_2.shadowColor, false, false, item_2.anInt7819, Renderers.FONT_RENDERER, item_2.hasPlayerAppearance ? VertexNormal.MY_PLAYER.model : null);
                    item_2.unlink();
                }
                Static.method6378();
            } else {
                if (Class182.HARDWARE_RENDERER == null) {
                    Canvas canvas_3 = new Canvas();
                    canvas_3.setSize(36, 32);
                    Class182.HARDWARE_RENDERER = AbstractRenderer.createRenderer(0, canvas_3, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0);
                    Class182.aFontRenderer_2259 = Class182.HARDWARE_RENDERER.createFont(Class94.getFontMetrics(IndexLoaders.FONT_METRICS_INDEX, Class16.p11FullIndex), SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, Class16.p11FullIndex), true);
                }
                for (item_2 = (Item) Class182.ITEMS.head(); item_2 != null; item_2 = (Item) Class182.ITEMS.next()) {
                    IndexLoaders.ITEM_LOADER.getSprite(Class182.HARDWARE_RENDERER, graphicalrenderer_0, item_2.id, item_2.amount, item_2.outlineSize, item_2.shadowColor, false, false, item_2.anInt7819, Class182.aFontRenderer_2259, item_2.hasPlayerAppearance ? VertexNormal.MY_PLAYER.model : null);
                    item_2.unlink();
                }
            }
        }
    }
}
