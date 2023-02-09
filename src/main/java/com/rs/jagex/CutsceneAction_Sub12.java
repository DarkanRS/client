package com.rs.jagex;

import java.util.Iterator;

public class CutsceneAction_Sub12 extends CutsceneAction {

	static int TARGET_PARAM;

	static void method14612(int i_0, int i_1) {
		HintArrow[] arr_7 = client.HINT_ARROWS;
		for (HintArrow class180_9 : arr_7) {
			if (class180_9 != null && class180_9.targetType == 2) {
				Class407.method6871(class180_9.plane, class180_9.x, class180_9.y, class180_9.height * 2);
				if (client.aFloatArray7292[0] > -1.0f && client.FRAME_COUNT % 20 < 10) {
					NativeSprite nativesprite_10 = Class391.HINT_ARROW_SPRITES[class180_9.arrowSprite];
					int i_11 = (int) (client.aFloatArray7292[0] + i_0 - 12.0F);
					int i_12 = (int) (client.aFloatArray7292[1] + i_1 - 28.0F);
					nativesprite_10.method2752(i_11, i_12);
				}
			}
		}
	}

	public static int method14613(MenuActionEvent class282_sub50_sub7_0) {
		if (Class20.aBool161)
			return 6;
		if (class282_sub50_sub7_0 == null)
			return 0;
		else {
			MenuAction i_2 = class282_sub50_sub7_0.menuAction;
			return i_2.isIFClick() ? 1 : (i_2.isGroundItemClick() ? 2 : (i_2.isObjectClick() ? 3 : (i_2.isNPCClick() ? 4 : (i_2.isPlayerClick() ? 7 : (i_2 == MenuAction.TGT_SELF ? 8 : 5)))));
		}
	}

	public static void method14614(AbstractRenderer graphicalrenderer_0, long long_1) {
		Class235.anInt2903 = Class235.anInt2900;
		Class235.anInt2900 = 0;
		Utils.time();
		Iterator<ParticleSystem> iterator_3 = Class235.aList2896.iterator();
		while (iterator_3.hasNext()) {
			ParticleSystem class539_4 = iterator_3.next();
			boolean bool_5 = class539_4.method11509(graphicalrenderer_0, long_1);
			if (!bool_5) {
				iterator_3.remove();
				Queue.aClass539Array5632[Class235.anInt2901] = class539_4;
				Class235.anInt2901 = Class235.anInt2901 + 1 & Class89.anIntArray931[Class235.anInt2906];
			}
		}
	}

	String aString9318;

	int anInt9317;

	CutsceneAction_Sub12(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		aString9318 = rsbytebuffer_1.readString();
		anInt9317 = rsbytebuffer_1.readUnsignedShort();
	}

	@Override
	public void method1592() {
		if (client.CURRENT_CUTSCENE != -1)
			CS2Executor.method3661(client.CURRENT_CUTSCENE, aString9318, anInt9317);
	}

	public void method1601() {
		if (client.CURRENT_CUTSCENE != -1)
			CS2Executor.method3661(client.CURRENT_CUTSCENE, aString9318, anInt9317);
	}
}
