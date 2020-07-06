package com.jagex;

public class Class46 implements Interface2 {

    public static Object[] CLAN_VARS;

    static CacheableNode_Sub7 aCacheableNode_Sub7_438;

    Class366 aClass366_436;

    Class46(Class366 class366_1) {
        aClass366_436 = class366_1;
    }

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
        if (Class393.preferences != null) {
            i_1 = Class393.preferences.maxScreenSize.method12666();
        }
        int i_2;
        int i_3;
        if (i_1 == 2) {
            i_2 = Math.min(800, SunIndexLoader.anInt434);
            i_3 = Math.min(600, Class107.anInt1082);
            Class349.anInt4083 = i_2;
            client.GAME_CANVAS_X = (SunIndexLoader.anInt434 - i_2) / 2;
            client.anInt3243 = i_3 * -1929118563;
            client.GAME_CANVAS_Y = 0;
        } else if (i_1 == 1) {
            i_2 = Math.min(1024, SunIndexLoader.anInt434);
            i_3 = Math.min(768, Class107.anInt1082);
            Class349.anInt4083 = i_2;
            client.GAME_CANVAS_X = (SunIndexLoader.anInt434 - i_2) / 2;
            client.anInt3243 = i_3 * -1929118563;
            client.GAME_CANVAS_Y = 0;
        } else {
            Class349.anInt4083 = SunIndexLoader.anInt434;
            client.GAME_CANVAS_X = 0;
            client.anInt3243 = Class107.anInt1082 * -1929118563;
            client.GAME_CANVAS_Y = 0;
        }
    }

    @Override
    public boolean method21() {
        return true;
    }

    @Override
    public void method20(boolean bool_1) {
        if (bool_1) {
            Renderers.CURRENT_RENDERER.B(0, 0, Class349.anInt4083, Engine.anInt3243 * -969250379, aClass366_436.anInt4231, 0);
        }
    }

    @Override
    public void method11(boolean bool_1) {
        if (bool_1) {
            Renderers.CURRENT_RENDERER.B(0, 0, Class349.anInt4083 * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.anInt3243 * -969250379 * -1929118563, aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
        }
    }

    @Override
    public boolean method10() {
        return true;
    }

    @Override
    public void method12(boolean bool_1) {
        if (bool_1) {
            Renderers.CURRENT_RENDERER.B(0, 0, Class349.anInt4083 * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.anInt3243 * -969250379 * -1929118563, aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
        }
    }

    @Override
    public void method14(boolean bool_1) {
        if (bool_1) {
            Renderers.CURRENT_RENDERER.B(0, 0, Class349.anInt4083 * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.anInt3243 * -969250379 * -1929118563, aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
        }
    }

    @Override
    public void method15() {
    }

    @Override
    public void method18() {
    }

    @Override
    public void method23() {
    }

    @Override
    public void method16() {
    }

    @Override
    public void method22() {
    }

    @Override
    public boolean method13() {
        return true;
    }

    @Override
    public boolean method9() {
        return true;
    }

    @Override
    public void method19() {
    }

    @Override
    public boolean method17() {
        return true;
    }
}
