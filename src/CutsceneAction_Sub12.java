import java.util.Iterator;

public class CutsceneAction_Sub12 extends CutsceneAction {

	static int USE_INTERFACE_ID;

	String aString9318;

	int anInt9317;

	public void method1592() {
		if (client.CURRENT_CUTSCENE != -1) {
			CS2Executor.method3661(client.CURRENT_CUTSCENE, this.aString9318, this.anInt9317, (byte) -117);
		}
	}

	public void method1601() {
		if (client.CURRENT_CUTSCENE != -1) {
			CS2Executor.method3661(client.CURRENT_CUTSCENE, this.aString9318, this.anInt9317, (byte) -111);
		}
	}

	CutsceneAction_Sub12(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.aString9318 = rsbytebuffer_1.readString();
		this.anInt9317 = rsbytebuffer_1.readUnsignedShort();
	}

	static final void method14612(int i_0, int i_1, int i_2, int i_3) {
		HintArrow[] arr_7 = client.HINT_ARROWS;
		for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
			HintArrow class180_9 = arr_7[i_8];
			if (class180_9 != null && class180_9.targetType == 2) {
				Class407.method6871(class180_9.plane, class180_9.x, class180_9.y, class180_9.height * 2, -1913137620);
				if (client.aFloatArray7292[0] > -1.0F && client.cycles % 20 < 10) {
					NativeSprite nativesprite_10 = Class391.HINT_ARROW_SPRITES[class180_9.arrowSprite];
					int i_11 = (int) (client.aFloatArray7292[0] + (float) i_0 - 12.0F);
					int i_12 = (int) (client.aFloatArray7292[1] + (float) i_1 - 28.0F);
					nativesprite_10.method2752(i_11, i_12);
				}
			}
		}
	}

	public static int method14613(CacheableNode_Sub7 class282_sub50_sub7_0) {
		if (Class20.aBool161) {
			return 6;
		} else if (class282_sub50_sub7_0 == null) {
			return 0;
		} else {
			int i_2 = class282_sub50_sub7_0.clickType;
			return Class14.method539(i_2, 85195047) ? 1 : (SunDefinitions.method859(i_2, -1682057624) ? 2 : (EnumDefinitions.method7252(i_2) ? 3 : (Class237.method3989(i_2) ? 4 : (Class348.method6176(i_2) ? 7 : (i_2 == 16 ? 8 : 5)))));
		}
	}

	public static void method14614(GraphicalRenderer graphicalrenderer_0, long long_1) {
		Class235.anInt2903 = Class235.anInt2900;
		Class235.anInt2900 = 0;
		Utils.time();
		Iterator iterator_3 = Class235.aList2896.iterator();
		while (iterator_3.hasNext()) {
			ParticleSystem class539_4 = (ParticleSystem) iterator_3.next();
			boolean bool_5 = class539_4.method11509(graphicalrenderer_0, long_1);
			if (!bool_5) {
				iterator_3.remove();
				Queue.aClass539Array5632[Class235.anInt2901] = class539_4;
				Class235.anInt2901 = Class235.anInt2901 + 1 & Class89.anIntArray931[Class235.anInt2906];
			}
		}
	}
}
