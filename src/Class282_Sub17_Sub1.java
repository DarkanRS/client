public class Class282_Sub17_Sub1 extends Class282_Sub17 {

	long aLong9930;

	String aString9931;

	Class348 this$0;

	void method12257(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong9930 = rsbytebuffer_1.readLong() * -7156069632047741567L * -6384031897606374783L;
		}
		this.aString9931 = rsbytebuffer_1.readNullString();
	}

	void method12250(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			this.aLong9930 = rsbytebuffer_1.readLong();
		}
		this.aString9931 = rsbytebuffer_1.readNullString();
	}

	void method12251(Class61 class61_1) {
		class61_1.method1216(this.aLong9930, this.aString9931, 0, (byte) 46);
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong9930 = rsbytebuffer_1.readLong() * -7156069632047741567L * -6384031897606374783L;
		}
		this.aString9931 = rsbytebuffer_1.readNullString();
	}

	void method12258(Class61 class61_1) {
		class61_1.method1216(-6384031897606374783L * this.aLong9930 * -7156069632047741567L, this.aString9931, 0, (byte) -53);
	}

	void method12253(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong9930 = rsbytebuffer_1.readLong() * -7156069632047741567L * -6384031897606374783L;
		}
		this.aString9931 = rsbytebuffer_1.readNullString();
	}

	void method12254(Class61 class61_1) {
		class61_1.method1216(-6384031897606374783L * this.aLong9930 * -7156069632047741567L, this.aString9931, 0, (byte) -33);
	}

	void method12255(Class61 class61_1) {
		class61_1.method1216(-6384031897606374783L * this.aLong9930 * -7156069632047741567L, this.aString9931, 0, (byte) 14);
	}

	void method12256(Class61 class61_1) {
		class61_1.method1216(-6384031897606374783L * this.aLong9930 * -7156069632047741567L, this.aString9931, 0, (byte) 81);
	}

	void method12252(Class61 class61_1) {
		class61_1.method1216(-6384031897606374783L * this.aLong9930 * -7156069632047741567L, this.aString9931, 0, (byte) -93);
	}

	Class282_Sub17_Sub1(Class348 class348_1) {
		this.this$0 = class348_1;
		this.aLong9930 = -1L;
		this.aString9931 = null;
	}

	public static void method15402(int i_0, String string_1, boolean bool_2, int i_3) {
		if (i_0 == 0) {
			Renderers.SOFTWARE_RENDERER = Class320.createRenderer(0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, Class393.preferences.aClass468_Sub4_8223.method12641(-1783373613) * 2, -1283280673);
			if (string_1 != null) {
				Renderers.SOFTWARE_RENDERER.ba(1, 0);
				FontMetrics fontmetrics_4 = Class94.createFontSpecification(IndexLoaders.FONT_METRICS_INDEX, Class16.anInt136, 1150997063);
				FontRenderer fontrenderer_5 = Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_4, Class91.method1514(IndexLoaders.SPRITES_INDEX, Class16.anInt136), true);
				Class275.method4891((byte) -128);
				Class446.method7447(string_1, true, Renderers.SOFTWARE_RENDERER, fontrenderer_5, fontmetrics_4, (byte) -87);
			}
		} else {
			GraphicalRenderer graphicalrenderer_16 = null;
			FontMetrics fontmetrics_17;
			FontRenderer fontrenderer_6;
			if (string_1 != null) {
				graphicalrenderer_16 = Class320.createRenderer(0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0, -603391790);
				graphicalrenderer_16.ba(1, 0);
				fontmetrics_17 = Class94.createFontSpecification(IndexLoaders.FONT_METRICS_INDEX, Class16.anInt136, 1961117540);
				fontrenderer_6 = graphicalrenderer_16.createFont(fontmetrics_17, Class91.method1514(IndexLoaders.SPRITES_INDEX, Class16.anInt136), true);
				Class275.method4891((byte) -74);
				Class446.method7447(string_1, true, graphicalrenderer_16, fontrenderer_6, fontmetrics_17, (byte) -82);
			}
			try {
				try {
					Renderers.SOFTWARE_RENDERER = Class320.createRenderer(i_0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, Class393.preferences.aClass468_Sub4_8223.method12641(169664234) * 2, -694595538);
					if (string_1 != null) {
						graphicalrenderer_16.ba(1, 0);
						fontmetrics_17 = Class94.createFontSpecification(IndexLoaders.FONT_METRICS_INDEX, Class16.anInt136, 1716473063);
						fontrenderer_6 = graphicalrenderer_16.createFont(fontmetrics_17, Class91.method1514(IndexLoaders.SPRITES_INDEX, Class16.anInt136), true);
						Class275.method4891((byte) -30);
						Class446.method7447(string_1, true, graphicalrenderer_16, fontrenderer_6, fontmetrics_17, (byte) -16);
					}
					if (Renderers.SOFTWARE_RENDERER.method8399()) {
						boolean bool_8 = true;
						try {
							bool_8 = Class11.SYSTEM_INFO.anInt8167 > 256;
						} catch (Throwable throwable_13) {
							;
						}
						Class282_Sub1 class282_sub1_18;
						if (bool_8) {
							class282_sub1_18 = Renderers.SOFTWARE_RENDERER.method8438(146800640);
						} else {
							class282_sub1_18 = Renderers.SOFTWARE_RENDERER.method8438(104857600);
						}
						Renderers.SOFTWARE_RENDERER.method8439(class282_sub1_18);
					}
				} catch (Throwable throwable_14) {
					int i_9 = Class393.preferences.currentToolkit.getValue(-1734953723);
					if (i_9 == 2) {
						client.aBool7171 = true;
					}
					Class393.preferences.setValue(Class393.preferences.currentToolkit, 0, -1949394777);
					method15402(i_9, string_1, bool_2, 1368243224);
					if (graphicalrenderer_16 != null) {
						try {
							graphicalrenderer_16.method8396(978390252);
						} catch (Throwable throwable_11) {
							;
						}
					}
					return;
				}
				if (graphicalrenderer_16 != null) {
					try {
						graphicalrenderer_16.method8396(1088813931);
					} catch (Throwable throwable_12) {
						;
					}
				}
			} catch (Exception exception_15) {
				if (graphicalrenderer_16 != null) {
					try {
						graphicalrenderer_16.method8396(-2045375529);
					} catch (Throwable throwable_10) {
						;
					}
				}
			}
		}
		if (bool_2) {
			Class393.preferences.method13505(Class393.preferences.currentToolkit, !bool_2, 2032339457);
		}
		Class393.preferences.setValue(Class393.preferences.currentToolkit, i_0, -952272736);
		if (!bool_2) {
			Class393.preferences.method13505(Class393.preferences.currentToolkit, !bool_2, -1976221425);
		}
		HostNameIdentifier.method482((byte) 53);
		Renderers.SOFTWARE_RENDERER.method8459();
		Renderers.SOFTWARE_RENDERER.J();
		IndexLoaders.MAP_REGION_DECODER.method4447(1353866416);
		Renderers.SOFTWARE_RENDERER.method8568();
		if (Renderers.SOFTWARE_RENDERER.method8403()) {
			Class115.method1952(Class393.preferences.aClass468_Sub12_8195.method12706((byte) 97) == 1, -1437511825);
		}
		IndexLoaders.MAP_REGION_DECODER.method4446((byte) 78);
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048(1352749078);
		client.aBool7175 = false;
		client.aBool7185 = true;
		Class149_Sub3.aClass467Array9380 = null;
		Renderers.SOFTWARE_RENDERER.GA();
	}
}
