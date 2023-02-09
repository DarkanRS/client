package com.rs.jagex;

public class Class280 implements Interface25 {

	public static boolean isIgnored(String string_0) {
		if (string_0 != null)
			for (int i_2 = 0; i_2 < client.IGNORE_LIST_COUNT; i_2++) {
				IgnoredPlayer class10_3 = client.IGNORED_PLAYERS[i_2];
				if (string_0.equalsIgnoreCase(class10_3.displayName) || string_0.equalsIgnoreCase(class10_3.lastDisplayName))
					return true;
			}
		return false;
	}

	static void method4974(long long_0) {
		int i_2 = client.anInt7262;
		int i_3 = client.anInt7376;
		int i_4;
		int i_5;
		if (i_2 != Camera.anInt122) {
			i_4 = i_2 - Camera.anInt122;
			i_5 = (int) (i_4 * long_0 / 320L);
			if (i_4 > 0) {
				if (i_5 == 0)
					i_5 = 1;
				else if (i_5 > i_4)
					i_5 = i_4;
			} else if (i_5 == 0)
				i_5 = -1;
			else if (i_5 < i_4)
				i_5 = i_4;
			Camera.anInt122 += i_5;
		}
		if (i_3 != Camera.anInt3289) {
			i_4 = i_3 - Camera.anInt3289;
			i_5 = (int) (i_4 * long_0 / 320L);
			if (i_4 > 0) {
				if (i_5 == 0)
					i_5 = 1;
				else if (i_5 > i_4)
					i_5 = i_4;
			} else if (i_5 == 0)
				i_5 = -1;
			else if (i_5 < i_4)
				i_5 = i_4;
			Camera.anInt3289 += i_5;
		}
		Camera.camAngleY += 8.0F * (client.aFloat7266 * long_0 / 40.0F);
		Camera.camAngleX += 8.0F * (long_0 * client.aFloat7284 / 40.0F);
		Camera.processCamera();
	}

	GraphNode_Sub1_Sub1_Sub1 aTransform_Sub1_Sub1_Sub1_3371;

	Class280(GraphNode_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_1) {
		aTransform_Sub1_Sub1_Sub1_3371 = class521_sub1_sub1_sub1_1;
	}

	@Override
	public boolean method182(GraphNode_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 == aTransform_Sub1_Sub1_Sub1_3371;
	}

	@Override
	public boolean method183(GraphNode_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 == aTransform_Sub1_Sub1_Sub1_3371;
	}
}
