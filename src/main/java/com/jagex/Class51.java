package com.jagex;

public class Class51 implements Interface2 {

	static int anInt488;

	public static int method1072(int i_0) {
		int i_2 = i_0 >>> 1;
		i_2 |= i_2 >>> 1;
		i_2 |= i_2 >>> 2;
		i_2 |= i_2 >>> 4;
		i_2 |= i_2 >>> 8;
		i_2 |= i_2 >>> 16;
		return i_0 & ~i_2;
	}

	public static void method1074(int[] ints_0, Object[] arr_1, int i_2, int i_3) {
		if (i_2 < i_3) {
			int i_5 = (i_3 + i_2) / 2;
			int i_6 = i_2;
			int i_7 = ints_0[i_5];
			ints_0[i_5] = ints_0[i_3];
			ints_0[i_3] = i_7;
			Object object_8 = arr_1[i_5];
			arr_1[i_5] = arr_1[i_3];
			arr_1[i_3] = object_8;
			int i_9 = i_7 == Integer.MAX_VALUE ? 0 : 1;
			for (int i_10 = i_2; i_10 < i_3; i_10++)
				if (ints_0[i_10] < (i_10 & i_9) + i_7) {
					int i_11 = ints_0[i_10];
					ints_0[i_10] = ints_0[i_6];
					ints_0[i_6] = i_11;
					Object object_12 = arr_1[i_10];
					arr_1[i_10] = arr_1[i_6];
					arr_1[i_6++] = object_12;
				}
			ints_0[i_3] = ints_0[i_6];
			ints_0[i_6] = i_7;
			arr_1[i_3] = arr_1[i_6];
			arr_1[i_6] = object_8;
			method1074(ints_0, arr_1, i_2, i_6 - 1);
			method1074(ints_0, arr_1, i_6 + 1, i_3);
		}
	}

	Class62 aClass62_485;

	Index aClass317_487;

	Index aClass317_486;

	FontRenderer aFontRenderer_484;

	Class51(Index index_1, Index index_2, Class62 class62_3) {
		aClass62_485 = class62_3;
		aClass317_487 = index_1;
		aClass317_486 = index_2;
	}

	@Override
	public boolean method10() {
		boolean bool_2 = true;
		if (!aClass317_487.loadFile(aClass62_485.anInt658))
			bool_2 = false;
		if (!aClass317_486.loadFile(aClass62_485.anInt658))
			bool_2 = false;
		return bool_2;
	}

	@Override
	public void method11(boolean bool_1) {
		if (bool_1) {
			int i_2 = aClass62_485.aClass356_650.method6221(2056525513 * aClass62_485.anInt652 * 1860559737, 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + -906350423 * aClass62_485.anInt651 * -1042975847;
			int i_3 = aClass62_485.aClass353_654.method6198(38429607 * aClass62_485.anInt648 * 959976471, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass62_485.anInt655 * -2042627867 * -601422611;
			aFontRenderer_484.method378(aClass62_485.aString649, i_2, i_3, 2056525513 * aClass62_485.anInt652 * 1860559737, 38429607 * aClass62_485.anInt648 * 959976471, -1179509109 * aClass62_485.anInt659 * 1820776739, aClass62_485.anInt660 * -1985214661 * 1958427123, -533570239 * aClass62_485.anInt653 * -762236223, 1391502107 * aClass62_485.anInt656 * 533004051, -1240305753 * aClass62_485.anInt657 * 1235699735, null, null, null, 0, 0);
		}
	}

	@Override
	public void method12(boolean bool_1) {
		if (bool_1) {
			int i_2 = aClass62_485.aClass356_650.method6221(2056525513 * aClass62_485.anInt652 * 1860559737, 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + -906350423 * aClass62_485.anInt651 * -1042975847;
			int i_3 = aClass62_485.aClass353_654.method6198(38429607 * aClass62_485.anInt648 * 959976471, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass62_485.anInt655 * -2042627867 * -601422611;
			aFontRenderer_484.method378(aClass62_485.aString649, i_2, i_3, 2056525513 * aClass62_485.anInt652 * 1860559737, 38429607 * aClass62_485.anInt648 * 959976471, -1179509109 * aClass62_485.anInt659 * 1820776739, aClass62_485.anInt660 * -1985214661 * 1958427123, -533570239 * aClass62_485.anInt653 * -762236223, 1391502107 * aClass62_485.anInt656 * 533004051, -1240305753 * aClass62_485.anInt657 * 1235699735, null, null, null, 0, 0);
		}
	}

	@Override
	public boolean method13() {
		boolean bool_1 = true;
		if (!aClass317_487.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		if (!aClass317_486.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		return bool_1;
	}

	@Override
	public void method14(boolean bool_1) {
		if (bool_1) {
			int i_2 = aClass62_485.aClass356_650.method6221(2056525513 * aClass62_485.anInt652 * 1860559737, 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + -906350423 * aClass62_485.anInt651 * -1042975847;
			int i_3 = aClass62_485.aClass353_654.method6198(38429607 * aClass62_485.anInt648 * 959976471, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass62_485.anInt655 * -2042627867 * -601422611;
			aFontRenderer_484.method378(aClass62_485.aString649, i_2, i_3, 2056525513 * aClass62_485.anInt652 * 1860559737, 38429607 * aClass62_485.anInt648 * 959976471, -1179509109 * aClass62_485.anInt659 * 1820776739, aClass62_485.anInt660 * -1985214661 * 1958427123, -533570239 * aClass62_485.anInt653 * -762236223, 1391502107 * aClass62_485.anInt656 * 533004051, -1240305753 * aClass62_485.anInt657 * 1235699735, null, null, null, 0, 0);
		}
	}

	@Override
	public void method15() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_486, -1949174501 * aClass62_485.anInt658 * -2111808237);
		aFontRenderer_484 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_487, -1949174501 * aClass62_485.anInt658 * -2111808237), true);
	}

	@Override
	public void method16() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_486, -1949174501 * aClass62_485.anInt658 * -2111808237);
		aFontRenderer_484 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_487, -1949174501 * aClass62_485.anInt658 * -2111808237), true);
	}

	@Override
	public boolean method17() {
		boolean bool_1 = true;
		if (!aClass317_487.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		if (!aClass317_486.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		return bool_1;
	}

	@Override
	public void method18() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_486, -1949174501 * aClass62_485.anInt658 * -2111808237);
		aFontRenderer_484 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_487, -1949174501 * aClass62_485.anInt658 * -2111808237), true);
	}

	@Override
	public void method19() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_486, -1949174501 * aClass62_485.anInt658 * -2111808237);
		aFontRenderer_484 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_487, -1949174501 * aClass62_485.anInt658 * -2111808237), true);
	}

	@Override
	public void method20(boolean bool_1) {
		if (bool_1) {
			int i_3 = aClass62_485.aClass356_650.method6221(aClass62_485.anInt652, client.GAME_WIDTH) + aClass62_485.anInt651;
			int i_4 = aClass62_485.aClass353_654.method6198(aClass62_485.anInt648, client.GAME_HEIGHT) + aClass62_485.anInt655;
			aFontRenderer_484.method378(aClass62_485.aString649, i_3, i_4, aClass62_485.anInt652, aClass62_485.anInt648, aClass62_485.anInt659, aClass62_485.anInt660, aClass62_485.anInt653, aClass62_485.anInt656, aClass62_485.anInt657, null, null, null, 0, 0);
		}
	}

	@Override
	public boolean method21() {
		boolean bool_1 = true;
		if (!aClass317_487.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		if (!aClass317_486.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		return bool_1;
	}

	@Override
	public void method22() {
		FontMetrics fontmetrics_2 = Class163.method2845(aClass317_486, aClass62_485.anInt658);
		aFontRenderer_484 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_2, SpriteDefinitions.method1534(aClass317_487, aClass62_485.anInt658), true);
	}

	@Override
	public void method23() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_486, -1949174501 * aClass62_485.anInt658 * -2111808237);
		aFontRenderer_484 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_487, -1949174501 * aClass62_485.anInt658 * -2111808237), true);
	}

	@Override
	public boolean method9() {
		boolean bool_1 = true;
		if (!aClass317_487.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		if (!aClass317_486.loadFile(aClass62_485.anInt658 * -2111808237 * -1949174501))
			bool_1 = false;
		return bool_1;
	}
}
