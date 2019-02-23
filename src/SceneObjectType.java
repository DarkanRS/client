public class SceneObjectType implements Interface43 {

	static int anInt5495;
	public static SceneObjectType WALL_STRAIGHT = new SceneObjectType(0, 0);
	public static SceneObjectType WALL_DIAGONAL_CORNER = new SceneObjectType(1, 0);
	public static SceneObjectType WALL_WHOLE_CORNER;
	public static SceneObjectType WALL_STRAIGHT_CORNER;
	public static SceneObjectType STRAIGHT_INSIDE_WALL_DEC;
	public static SceneObjectType STRAIGHT_OUSIDE_WALL_DEC;
	public static SceneObjectType DIAGONAL_OUTSIDE_WALL_DEC;
	public static SceneObjectType DIAGONAL_INSIDE_WALL_DEC;
	public static SceneObjectType DIAGONAL_INWALL_DEC;
	public static SceneObjectType WALL_INTERACT;
	public static SceneObjectType SCENERY_INTERACT;
	public static SceneObjectType GROUND_INTERACT;
	static SceneObjectType STRAIGHT_SLOPE_ROOF;
	public static SceneObjectType DIAGONAL_SLOPE_ROOF;
	static SceneObjectType DIAGONAL_SLOPE_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_SLOPE_CORNER_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_SLOPE_CORNER_ROOF;
	static SceneObjectType STRAIGHT_FLAT_ROOF;
	static SceneObjectType STRAIGHT_BOTTOM_EDGE_ROOF;
	static SceneObjectType DIAGONAL_BOTTOM_EDGE_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_BOTTOM_EDGE_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF;
	public static SceneObjectType GROUND_DECORATION;
	public int type;
	public int anInt5494;

	static {
		WALL_STRAIGHT = new SceneObjectType(0, 0);
		WALL_DIAGONAL_CORNER = new SceneObjectType(1, 0);
		WALL_WHOLE_CORNER = new SceneObjectType(2, 0);
		WALL_STRAIGHT_CORNER = new SceneObjectType(3, 0);
		STRAIGHT_INSIDE_WALL_DEC = new SceneObjectType(4, 1);
		STRAIGHT_OUSIDE_WALL_DEC = new SceneObjectType(5, 1);
		DIAGONAL_OUTSIDE_WALL_DEC = new SceneObjectType(6, 1);
		DIAGONAL_INSIDE_WALL_DEC = new SceneObjectType(7, 1);
		DIAGONAL_INWALL_DEC = new SceneObjectType(8, 1);
		WALL_INTERACT = new SceneObjectType(9, 2);
		SCENERY_INTERACT = new SceneObjectType(10, 2);
		GROUND_INTERACT = new SceneObjectType(11, 2);
		STRAIGHT_SLOPE_ROOF = new SceneObjectType(12, 2);
		DIAGONAL_SLOPE_ROOF = new SceneObjectType(13, 2);
		DIAGONAL_SLOPE_CONNECT_ROOF = new SceneObjectType(14, 2);
		STRAIGHT_SLOPE_CORNER_CONNECT_ROOF = new SceneObjectType(15, 2);
		STRAIGHT_SLOPE_CORNER_ROOF = new SceneObjectType(16, 2);
		STRAIGHT_FLAT_ROOF = new SceneObjectType(17, 2);
		STRAIGHT_BOTTOM_EDGE_ROOF = new SceneObjectType(18, 2);
		DIAGONAL_BOTTOM_EDGE_CONNECT_ROOF = new SceneObjectType(19, 2);
		STRAIGHT_BOTTOM_EDGE_CONNECT_ROOF = new SceneObjectType(20, 2);
		STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF = new SceneObjectType(21, 2);
		GROUND_DECORATION = new SceneObjectType(22, 3);
	}

	public int method76() {
		return 1109376893 * this.type * 2087055829;
	}

	public int method243(byte b_1) {
		return this.type;
	}

	public int method75() {
		return 1109376893 * this.type * 2087055829;
	}

	SceneObjectType(int i_1, int i_2) {
		this.type = i_1;
		this.anInt5494 = i_2;
	}

	static final void method7675(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = SpotAnimIndexLoader.method8861(i_2, i_3, false, 946854305);
	}

}
