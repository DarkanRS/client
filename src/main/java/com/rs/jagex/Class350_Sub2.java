package com.rs.jagex;

import java.awt.*;

public class Class350_Sub2 extends Class350 {

	public static int anInt7815;

	static void method12571() {
		if (Renderers.CURRENT_RENDERER.method8407()) {
			Renderers.CURRENT_RENDERER.method8410(Class351.gameCanvas);
			Class250.method4297();
			Dimension dimension_1 = Class351.gameCanvas.getSize();
			Renderers.CURRENT_RENDERER.method8524(Class351.gameCanvas, dimension_1.width, dimension_1.height);
			Renderers.CURRENT_RENDERER.method8412(Class351.gameCanvas);
		} else
			ParticleProducer.switchRenderType(Class393.preferences.currentToolkit.getValue(), false);
		Static.method6378();
	}

	static void method12571(boolean fullScreen) {
		if (Renderers.CURRENT_RENDERER.method8407()) {
			Renderers.CURRENT_RENDERER.method8410(Class351.gameCanvas);
			Class250.method4297();
			Dimension dimension_1 = Class351.gameCanvas.getSize();
			Renderers.CURRENT_RENDERER.method8524(Class351.gameCanvas, dimension_1.width, dimension_1.height);
			Renderers.CURRENT_RENDERER.method8412(Class351.gameCanvas);
		} else
			ParticleProducer.switchRenderType(Class393.preferences.currentToolkit.getValue(), fullScreen);
		Static.method6378();
	}

	public int anInt7813;

	public int anInt7814;

	Class350_Sub2(Class356 class356_1, Class353 class353_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
		super(class356_1, class353_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9);
		anInt7813 = i_10;
		anInt7814 = i_11;
	}

	@Override
	public Class60 method24() {
		return Class60.aClass60_602;
	}

	@Override
	public Class60 method25() {
		return Class60.aClass60_602;
	}
}
