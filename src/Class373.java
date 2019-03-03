import java.awt.Point;
import java.util.Queue;

public class Class373 {

	public static int anInt4350;

	Class373() throws Throwable {
		throw new Error();
	}

	static final void method6363(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class158_Sub1.PLAYER_VAR_PROVIDER.anIntArray26[i_2];
	}

	static final void method6364(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class249.method4276(icomponentdefinitions_3, interface_4, cs2executor_0, 175430076);
	}

	static void method6365(int i_0) {
		Queue queue_1 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			Point point_2;
			if (Class351.gameCanvas.isShowing()) {
				point_2 = Class351.gameCanvas.getLocationOnScreen();
			} else {
				point_2 = null;
			}

			while (true) {
				while (true) {
					Class282_Sub53_Sub1 class282_sub53_sub1_3 = (Class282_Sub53_Sub1) Class236.aQueue2914.poll();
					if (class282_sub53_sub1_3 == null) {
						return;
					}

					if (point_2 != null && Class351.gameCanvas.isShowing() && Class530.aBool7050) {
						class282_sub53_sub1_3.method14732(point_2, -1545161336);
						if (!class282_sub53_sub1_3.method14731(-1966919184) && class282_sub53_sub1_3.method13481(1700591909) < Class349.anInt4083 && class282_sub53_sub1_3.method13469(1495235000) < Engine.anInt3243 * -969250379 && class282_sub53_sub1_3.method13481(1815146840) >= 0 && class282_sub53_sub1_3.method13469(-1984385021) >= 0) {
							int i_4 = class282_sub53_sub1_3.getClickType(1166516765);
							if (class282_sub53_sub1_3.getClickType(1107239769) == -1) {
								Class236.aClass534_Sub1_2913.method11410(class282_sub53_sub1_3, (byte) 24);
							} else if (Class298.method5304(i_4, -1867456508)) {
								Class236.aClass534_Sub1_2913.method12809(class282_sub53_sub1_3, 16711935);
							}
						}
					} else {
						class282_sub53_sub1_3.cache(665742059);
					}
				}
			}
		}
	}

}
