/* Class282_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub17_Sub1 extends Class282_Sub17 {
	Class348 this$0;
	long aLong9930;
	String aString9931;

	void method12257(RsByteBuffer class282_sub35) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			((Class282_Sub17_Sub1) this).aLong9930 = (class282_sub35.readLong(1688907962) * -7156069632047741567L);
		}
		((Class282_Sub17_Sub1) this).aString9931 = class282_sub35.readNullString(-56317092);
	}

	void method12250(RsByteBuffer class282_sub35, int i) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			((Class282_Sub17_Sub1) this).aLong9930 = (class282_sub35.readLong(1312780753) * -7156069632047741567L);
		}
		((Class282_Sub17_Sub1) this).aString9931 = class282_sub35.readNullString(-141336185);
	}

	void method12251(Class61 class61, int i) {
		class61.method1216((-6384031897606374783L * ((Class282_Sub17_Sub1) this).aLong9930), ((Class282_Sub17_Sub1) this).aString9931, 0, (byte) 46);
	}

	void method12249(RsByteBuffer class282_sub35) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			((Class282_Sub17_Sub1) this).aLong9930 = (class282_sub35.readLong(2019975858) * -7156069632047741567L);
		}
		((Class282_Sub17_Sub1) this).aString9931 = class282_sub35.readNullString(938582751);
	}

	void method12258(Class61 class61) {
		class61.method1216((-6384031897606374783L * ((Class282_Sub17_Sub1) this).aLong9930), ((Class282_Sub17_Sub1) this).aString9931, 0, (byte) -53);
	}

	void method12253(RsByteBuffer class282_sub35) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			((Class282_Sub17_Sub1) this).aLong9930 = (class282_sub35.readLong(1143481691) * -7156069632047741567L);
		}
		((Class282_Sub17_Sub1) this).aString9931 = class282_sub35.readNullString(415831589);
	}

	void method12254(Class61 class61) {
		class61.method1216((-6384031897606374783L * ((Class282_Sub17_Sub1) this).aLong9930), ((Class282_Sub17_Sub1) this).aString9931, 0, (byte) -33);
	}

	void method12255(Class61 class61) {
		class61.method1216((-6384031897606374783L * ((Class282_Sub17_Sub1) this).aLong9930), ((Class282_Sub17_Sub1) this).aString9931, 0, (byte) 14);
	}

	void method12256(Class61 class61) {
		class61.method1216((-6384031897606374783L * ((Class282_Sub17_Sub1) this).aLong9930), ((Class282_Sub17_Sub1) this).aString9931, 0, (byte) 81);
	}

	void method12252(Class61 class61) {
		class61.method1216((-6384031897606374783L * ((Class282_Sub17_Sub1) this).aLong9930), ((Class282_Sub17_Sub1) this).aString9931, 0, (byte) -93);
	}

	Class282_Sub17_Sub1(Class348 class348) {
		((Class282_Sub17_Sub1) this).this$0 = class348;
		((Class282_Sub17_Sub1) this).aLong9930 = 7156069632047741567L;
		((Class282_Sub17_Sub1) this).aString9931 = null;
	}

	public static void method15402(int i, String string, boolean bool, int i_0_) {
		if (0 == i) {
			Renderers.SOFTWARE_RENDERER = Class320.method5732(0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(-1783373613) * 2, -1283280673);
			if (string != null) {
				Renderers.SOFTWARE_RENDERER.ba(1, 0);
				Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, Class16.anInt136 * 436671641, 0, 1150997063);
				FontRenderer class8 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1514(IndexLoaders.SPRITES_INDEX, Class16.anInt136 * 436671641, 0), true));
				Class275.method4891((byte) -128);
				Class446.method7447(string, true, Renderers.SOFTWARE_RENDERER, class8, class414, (byte) -87);
			}
		} else {
			GraphicalRenderer renderer = null;
			if (string != null) {
				renderer = Class320.method5732(0, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0, -603391790);
				renderer.ba(1, 0);
				Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, Class16.anInt136 * 436671641, 0, 1961117540);
				FontRenderer class8 = (renderer.method8448(class414, Class91.method1514(IndexLoaders.SPRITES_INDEX, 436671641 * Class16.anInt136, 0), true));
				Class275.method4891((byte) -74);
				Class446.method7447(string, true, renderer, class8, class414, (byte) -82);
			}
			try {
				try {
					Renderers.SOFTWARE_RENDERER = Class320.method5732(i, Class351.gameCanvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(169664234) * 2, -694595538);
					if (string != null) {
						renderer.ba(1, 0);
						Class414 class414 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, 436671641 * Class16.anInt136, 0, 1716473063);
						FontRenderer class8 = (renderer.method8448(class414, Class91.method1514(IndexLoaders.SPRITES_INDEX, (436671641 * Class16.anInt136), 0), true));
						Class275.method4891((byte) -30);
						Class446.method7447(string, true, renderer, class8, class414, (byte) -16);
					}
					if (Renderers.SOFTWARE_RENDERER.method8399()) {
						boolean bool_1_ = true;
						try {
							bool_1_ = (Class11.aClass282_Sub51_124.anInt8167 * -79546877) > 256;
						} catch (Throwable throwable) {
							/* empty */
						}
						Class282_Sub1 class282_sub1;
						if (bool_1_)
							class282_sub1 = Renderers.SOFTWARE_RENDERER.method8438(146800640);
						else
							class282_sub1 = Renderers.SOFTWARE_RENDERER.method8438(104857600);
						Renderers.SOFTWARE_RENDERER.method8439(class282_sub1);
					}
				} catch (Throwable throwable) {
					int i_2_ = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1734953723);
					if (i_2_ == 2)
						client.aBool7171 = true;
					Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230, 0, -1949394777);
					method15402(i_2_, string, bool, 1368243224);
					if (null != renderer) {
						try {
							renderer.method8396(978390252);
						} catch (Throwable throwable_3_) {
							/* empty */
						}
					}
					return;
				}
				if (null != renderer) {
					try {
						renderer.method8396(1088813931);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception object) {
				if (null != renderer) {
					try {
						renderer.method8396(-2045375529);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				//throw object;
			}
		}
		if (bool)
			Class393.aClass282_Sub54_4783.method13505((Class393.aClass282_Sub54_4783.aClass468_Sub18_8230), !bool, 2032339457);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8230), i, -952272736);
		if (!bool)
			Class393.aClass282_Sub54_4783.method13505((Class393.aClass282_Sub54_4783.aClass468_Sub18_8230), !bool, -1976221425);
		Class12.method482((byte) 53);
		Renderers.SOFTWARE_RENDERER.method8459(10000);
		Renderers.SOFTWARE_RENDERER.J(32);
		IndexLoaders.MAP_REGION_DECODER.method4447(1353866416);
		Renderers.SOFTWARE_RENDERER.method8568(false);
		if (Renderers.SOFTWARE_RENDERER.method8403())
			Class115.method1952(Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12706((byte) 97) == 1, -1437511825);
		IndexLoaders.MAP_REGION_DECODER.method4446((byte) 78);
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(1352749078);
		client.aBool7175 = false;
		client.aBool7185 = true;
		Class149_Sub3.aClass467Array9380 = null;
		Renderers.SOFTWARE_RENDERER.GA(0.0F, 1.0F);
	}

	static final void method15403(CS2Executor class527, int i) {
		ItemDefaultsLoader.method7081((byte) -41);
	}
}
