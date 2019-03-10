public class Class2 {

    Class2() throws Throwable {
        throw new Error();
    }

    public static void method257(String string_0, String string_1, int i_2) {
        if (string_0.length() <= 320 && Class388.method6693(1589792436)) {
            Class290.method5118((byte) -52);
            Class9.aString99 = string_0;
            Class9.aString102 = string_1;
            Class365.setGameState(19);
        }
    }

    public static void method258(String string_0, int i_1) {
        Class191.method3167(0, 0, "", "", "", string_0, 1534931586);
    }

    public static int method259(int i_0, int i_1, int i_2, int i_3) {
        i_2 &= 0x3;
        return i_2 == 0 ? i_1 : (i_2 == 1 ? 7 - i_0 : (i_2 == 2 ? 7 - i_1 : i_0));
    }

    public static SceneObjectType[] method262(byte b_0) {
        return new SceneObjectType[] { SceneObjectType.STRAIGHT_INSIDE_WALL_DEC, SceneObjectType.STRAIGHT_SLOPE_ROOF, SceneObjectType.GROUND_INTERACT, SceneObjectType.STRAIGHT_SLOPE_CORNER_ROOF, SceneObjectType.STRAIGHT_BOTTOM_EDGE_ROOF, SceneObjectType.STRAIGHT_BOTTOM_EDGE_CONNECT_ROOF, SceneObjectType.WALL_INTERACT, SceneObjectType.STRAIGHT_OUSIDE_WALL_DEC, SceneObjectType.STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF, SceneObjectType.DIAGONAL_INSIDE_WALL_DEC, SceneObjectType.WALL_DIAGONAL_CORNER, SceneObjectType.WALL_STRAIGHT_CORNER, SceneObjectType.DIAGONAL_INWALL_DEC, SceneObjectType.WALL_WHOLE_CORNER, SceneObjectType.SCENERY_INTERACT, SceneObjectType.DIAGONAL_BOTTOM_EDGE_CONNECT_ROOF, SceneObjectType.DIAGONAL_OUTSIDE_WALL_DEC, SceneObjectType.GROUND_DECORATION, SceneObjectType.DIAGONAL_SLOPE_ROOF, SceneObjectType.STRAIGHT_FLAT_ROOF, SceneObjectType.WALL_STRAIGHT, SceneObjectType.DIAGONAL_SLOPE_CONNECT_ROOF, SceneObjectType.STRAIGHT_SLOPE_CORNER_CONNECT_ROOF };
    }

    static void method263(Class282_Sub18 class282_sub18_0, byte b_1) {
        if (!Class337.aLinkedList3969.contains(class282_sub18_0)) {
            Class337.aLinkedList3969.add(class282_sub18_0);
        }
    }
}
