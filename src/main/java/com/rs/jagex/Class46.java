package com.rs.jagex;

import com.rs.jagex.clans.settings.ChangeClanSetting;

public class Class46 implements Interface2 {

	public static Object[] CLAN_VARS;

	static MenuActionEvent aCacheableNode_Sub7_438;

	public static NPCDirection[] getDirections() {
		return new NPCDirection[]{NPCDirection.SOUTH_EAST, NPCDirection.NORTH_EAST, NPCDirection.SOUTH_WEST, NPCDirection.SOUTH, NPCDirection.EAST, NPCDirection.WEST, NPCDirection.NORTH_WEST, NPCDirection.NORTH};
	}

	public static int method932() {
		LRUCache softcache_1 = PlayerModel.aClass229_2920;
		synchronized (PlayerModel.aClass229_2920) {
			int i_2 = PlayerModel.aClass229_2920.method3862();
			return i_2;
		}
	}

	static void method935() {
		int i_1 = 0;
		if (Class393.preferences != null)
			i_1 = Class393.preferences.maxScreenSize.method12666();
		int i_2;
		int i_3;
		if (i_1 == 2) {
			i_2 = Math.min(800, SunIndexLoader.anInt434);
			i_3 = Math.min(600, Class107.anInt1082);
			ChangeClanSetting.BASE_WINDOW_WIDTH = i_2;
			Engine.GAME_CANVAS_X = (SunIndexLoader.anInt434 - i_2) / 2;
			Engine.BASE_WINDOW_HEIGHT = i_3 * -1929118563;
			Engine.GAME_CANVAS_Y = 0;
		} else if (i_1 == 1) {
			i_2 = Math.min(1024, SunIndexLoader.anInt434);
			i_3 = Math.min(768, Class107.anInt1082);
			ChangeClanSetting.BASE_WINDOW_WIDTH = i_2;
			Engine.GAME_CANVAS_X = (SunIndexLoader.anInt434 - i_2) / 2;
			Engine.BASE_WINDOW_HEIGHT = i_3 * -1929118563;
			Engine.GAME_CANVAS_Y = 0;
		} else {
			ChangeClanSetting.BASE_WINDOW_WIDTH = SunIndexLoader.anInt434;
			Engine.GAME_CANVAS_X = 0;
			Engine.BASE_WINDOW_HEIGHT = Class107.anInt1082 * -1929118563;
			Engine.GAME_CANVAS_Y = 0;
		}
	}

	Class366 aClass366_436;

	Class46(Class366 class366_1) {
		aClass366_436 = class366_1;
	}

	@Override
	public boolean method10() {
		return true;
	}

	@Override
	public void method11(boolean bool_1) {
		if (bool_1)
			Renderers.CURRENT_RENDERER.B(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.BASE_WINDOW_HEIGHT * -969250379 * -1929118563, aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
	}

	@Override
	public void method12(boolean bool_1) {
		if (bool_1)
			Renderers.CURRENT_RENDERER.B(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.BASE_WINDOW_HEIGHT * -969250379 * -1929118563, aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
	}

	@Override
	public boolean method13() {
		return true;
	}

	@Override
	public void method14(boolean bool_1) {
		if (bool_1)
			Renderers.CURRENT_RENDERER.B(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.BASE_WINDOW_HEIGHT * -969250379 * -1929118563, aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
	}

	@Override
	public void method15() {
	}

	@Override
	public void method16() {
	}

	@Override
	public boolean method17() {
		return true;
	}

	@Override
	public void method18() {
	}

	@Override
	public void method19() {
	}

	@Override
	public void method20(boolean bool_1) {
		if (bool_1)
			Renderers.CURRENT_RENDERER.B(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379, aClass366_436.anInt4231, 0);
	}

	@Override
	public boolean method21() {
		return true;
	}

	@Override
	public void method22() {
	}

	@Override
	public void method23() {
	}

	@Override
	public boolean method9() {
		return true;
	}
}
