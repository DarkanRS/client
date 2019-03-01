import java.awt.Dimension;

public class Class350_Sub2 extends Class350 {

	public static int anInt7815;
	public int anInt7813;
	public int anInt7814;

	public Class60 method25() {
		return Class60.aClass60_602;
	}

	public Class60 method24(int i_1) {
		return Class60.aClass60_602;
	}

	Class350_Sub2(Class356 class356_1, Class353 class353_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
		super(class356_1, class353_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9);
		this.anInt7813 = i_10;
		this.anInt7814 = i_11;
	}

	static void method12571(int i_0) {
		if (Renderers.SOFTWARE_RENDERER.method8407()) {
			Renderers.SOFTWARE_RENDERER.method8410(Class351.gameCanvas, -796091411);
			Class250.method4297(-1109644708);
			Dimension dimension_1 = Class351.gameCanvas.getSize();
			Renderers.SOFTWARE_RENDERER.method8524(Class351.gameCanvas, dimension_1.width, dimension_1.height, (byte) -5);
			Renderers.SOFTWARE_RENDERER.method8412(Class351.gameCanvas, (byte) 8);
		} else {
			ParticleProducer.method11500(Class393.preferences.currentToolkit.getValue(-1386089693), false, (byte) 24);
		}

		IncomingPacket.method6378(-1538407760);
	}

	static final void method12572(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class125.method2173(1467773242);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14775(i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Runner.anIntArray5900, -169630584);
			if (bool_4) {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anIntArray5900[1];
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anIntArray5900[2];
			} else {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			}
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		}

	}

	static final void method12573(CS2Executor cs2executor_0, short s_1) {
		if (client.gameState == 0) {
			Class448.aBool5419 = cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1;
		}

	}

}
