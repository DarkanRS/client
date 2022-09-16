package com.jagex;

public class Class60 {

	public static NativeSprite aNativeSprite_612;

	public static Class60 aClass60_609 = new Class60(1);
	public static Class60 aClass60_602 = new Class60(2);
	public static Class60 aClass60_603 = new Class60(2);
	public static Class60 aClass60_608 = new Class60(2);
	public static Class60 aClass60_605 = new Class60(1);
	public static Class60 aClass60_606 = new Class60(1);
	public static Class60 aClass60_607 = new Class60(1);
	public static Class60 aClass60_604 = new Class60(2);
	public static Class60 aClass60_601 = new Class60(1);
	public static Class60 aClass60_610 = new Class60(2);

	public static boolean method1166(int i_0) {
		return i_0 == 1 || i_0 == 3 || i_0 == 5;
	}

	public static boolean method1169(char var_0) {
		return var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
	}

	public static void method1170() {
		if (client.IS_USE_SELECTED) {
			IComponentDefinitions icomponentdefinitions_1 = Index.getIComponentDefinitions(client.anInt56, client.anInt7345);
			if (icomponentdefinitions_1 != null && icomponentdefinitions_1.anObjectArray1396 != null) {
				HookRequest hookrequest_2 = new HookRequest();
				hookrequest_2.source = icomponentdefinitions_1;
				hookrequest_2.params = icomponentdefinitions_1.anObjectArray1396;
				CS2Executor.executeHookInner(hookrequest_2);
			}
			client.anInt7427 = -1;
			client.anInt7346 = -1;
			client.IS_USE_SELECTED = false;
			if (icomponentdefinitions_1 != null)
				IComponentDefinitions.redrawComponent(icomponentdefinitions_1);
		}
	}

	static void method1172() {
		if (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.LOCAL)
			Class361.aClass361_4174.method6257();
	}

	static void method1174(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		ItemIndexLoader.method7170(i_2);
		int i_7 = 0;
		int i_8 = i_2 - i_5;
		if (i_8 < 0)
			i_8 = 0;
		int i_9 = i_2;
		int i_10 = -i_2;
		int i_11 = i_8;
		int i_12 = -i_8;
		int i_13 = -1;
		int i_14 = -1;
		int i_16;
		int i_17;
		int i_18;
		int i_19;
		if (i_1 >= Class532.anInt7070 && i_1 <= Class532.anInt7068) {
			int[] ints_15 = Class532.anIntArrayArray7072[i_1];
			i_16 = EntityNode.method4890(i_0 - i_2, Class532.anInt7071, Class532.anInt7069);
			i_17 = EntityNode.method4890(i_0 + i_2, Class532.anInt7071, Class532.anInt7069);
			i_18 = EntityNode.method4890(i_0 - i_8, Class532.anInt7071, Class532.anInt7069);
			i_19 = EntityNode.method4890(i_0 + i_8, Class532.anInt7071, Class532.anInt7069);
			KeyHoldInputSubscriber.method3922(ints_15, i_16, i_18, i_4);
			KeyHoldInputSubscriber.method3922(ints_15, i_18, i_19, i_3);
			KeyHoldInputSubscriber.method3922(ints_15, i_19, i_17, i_4);
		}
		while (i_9 > i_7) {
			i_13 += 2;
			i_14 += 2;
			i_10 += i_13;
			i_12 += i_14;
			if (i_12 >= 0 && i_11 >= 1) {
				--i_11;
				i_12 -= i_11 << 1;
				Class5.anIntArray36[i_11] = i_7;
			}
			++i_7;
			int i_20;
			int i_21;
			int[] ints_22;
			int i_23;
			if (i_10 >= 0) {
				--i_9;
				i_10 -= i_9 << 1;
				i_23 = i_1 - i_9;
				i_16 = i_9 + i_1;
				if (i_16 >= Class532.anInt7070 && i_23 <= Class532.anInt7068)
					if (i_9 >= i_8) {
						i_17 = EntityNode.method4890(i_0 + i_7, Class532.anInt7071, Class532.anInt7069);
						i_18 = EntityNode.method4890(i_0 - i_7, Class532.anInt7071, Class532.anInt7069);
						if (i_16 <= Class532.anInt7068)
							KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_16], i_18, i_17, i_4);
						if (i_23 >= Class532.anInt7070)
							KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_23], i_18, i_17, i_4);
					} else {
						i_17 = Class5.anIntArray36[i_9];
						i_18 = EntityNode.method4890(i_0 + i_7, Class532.anInt7071, Class532.anInt7069);
						i_19 = EntityNode.method4890(i_0 - i_7, Class532.anInt7071, Class532.anInt7069);
						i_20 = EntityNode.method4890(i_0 + i_17, Class532.anInt7071, Class532.anInt7069);
						i_21 = EntityNode.method4890(i_0 - i_17, Class532.anInt7071, Class532.anInt7069);
						if (i_16 <= Class532.anInt7068) {
							ints_22 = Class532.anIntArrayArray7072[i_16];
							KeyHoldInputSubscriber.method3922(ints_22, i_19, i_21, i_4);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_18, i_4);
						}
						if (i_23 >= Class532.anInt7070) {
							ints_22 = Class532.anIntArrayArray7072[i_23];
							KeyHoldInputSubscriber.method3922(ints_22, i_19, i_21, i_4);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_18, i_4);
						}
					}
			}
			i_23 = i_1 - i_7;
			i_16 = i_7 + i_1;
			if (i_16 >= Class532.anInt7070 && i_23 <= Class532.anInt7068) {
				i_17 = i_0 + i_9;
				i_18 = i_0 - i_9;
				if (i_17 >= Class532.anInt7071 && i_18 <= Class532.anInt7069) {
					i_17 = EntityNode.method4890(i_17, Class532.anInt7071, Class532.anInt7069);
					i_18 = EntityNode.method4890(i_18, Class532.anInt7071, Class532.anInt7069);
					if (i_7 < i_8) {
						i_19 = i_11 < i_7 ? Class5.anIntArray36[i_7] : i_11;
						i_20 = EntityNode.method4890(i_0 + i_19, Class532.anInt7071, Class532.anInt7069);
						i_21 = EntityNode.method4890(i_0 - i_19, Class532.anInt7071, Class532.anInt7069);
						if (i_16 <= Class532.anInt7068) {
							ints_22 = Class532.anIntArrayArray7072[i_16];
							KeyHoldInputSubscriber.method3922(ints_22, i_18, i_21, i_4);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_17, i_4);
						}
						if (i_23 >= Class532.anInt7070) {
							ints_22 = Class532.anIntArrayArray7072[i_23];
							KeyHoldInputSubscriber.method3922(ints_22, i_18, i_21, i_4);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_17, i_4);
						}
					} else {
						if (i_16 <= Class532.anInt7068)
							KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_16], i_18, i_17, i_4);
						if (i_23 >= Class532.anInt7070)
							KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_23], i_18, i_17, i_4);
					}
				}
			}
		}
	}

	public int anInt611;

	Class60(int i_1) {
		anInt611 = i_1;
	}
}
