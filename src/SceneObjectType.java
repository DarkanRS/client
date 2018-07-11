/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SceneObjectType implements Interface43 {
	public static SceneObjectType WALL_STRAIGHT = new SceneObjectType(0, 0);
	static SceneObjectType STRAIGHT_BOTTOM_EDGE_ROOF;
	public static SceneObjectType WALL_WHOLE_CORNER;
	public static SceneObjectType WALL_STRAIGHT_CORNER;
	public static SceneObjectType WALL_INTERACT;
	public static SceneObjectType STRAIGHT_INSIDE_WALL_DEC;
	public static SceneObjectType STRAIGHT_OUSIDE_WALL_DEC;
	public static SceneObjectType DIAGONAL_OUTSIDE_WALL_DEC;
	public static SceneObjectType DIAGONAL_INSIDE_WALL_DEC;
	public static SceneObjectType DIAGONAL_INWALL_DEC;
	public static SceneObjectType GROUND_DECORATION;
	public int type;
	static SceneObjectType DIAGONAL_SLOPE_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_SLOPE_CORNER_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_SLOPE_CORNER_ROOF;
	static SceneObjectType STRAIGHT_FLAT_ROOF;
	static SceneObjectType STRAIGHT_SLOPE_ROOF;
	static SceneObjectType DIAGONAL_BOTTOM_EDGE_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_BOTTOM_EDGE_CONNECT_ROOF;
	static SceneObjectType STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF;
	public static SceneObjectType SCENERY_INTERACT;
	public static SceneObjectType DIAGONAL_SLOPE_ROOF;
	public static SceneObjectType GROUND_INTERACT;
	public static SceneObjectType WALL_DIAGONAL_CORNER = new SceneObjectType(1, 0);
	public int anInt5494;
	static int anInt5495;

	public int method76() {
		return 1109376893 * type;
	}

	public int method243(byte i) {
		return 1109376893 * type;
	}

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

	public int method75() {
		return 1109376893 * type;
	}

	public static boolean method7669(int i) {
		return ((i >= 1109376893 * WALL_STRAIGHT.type && i <= 1109376893 * WALL_STRAIGHT_CORNER.type) || i == 1109376893 * WALL_INTERACT.type);
	}

	public static boolean method7670(int i) {
		return (i >= STRAIGHT_SLOPE_ROOF.type * 1109376893 && i <= STRAIGHT_FLAT_ROOF.type * 1109376893);
	}

	public static boolean method7671(int i) {
		return ((i >= 1109376893 * WALL_STRAIGHT.type && i <= 1109376893 * WALL_STRAIGHT_CORNER.type) || i == 1109376893 * WALL_INTERACT.type);
	}

	SceneObjectType(int i, int i_0_) {
		type = i * 2087055829;
		anInt5494 = -259002495 * i_0_;
	}

	public static boolean method7672(int i) {
		return (i >= STRAIGHT_SLOPE_ROOF.type * 1109376893 && i <= STRAIGHT_FLAT_ROOF.type * 1109376893);
	}

	public static boolean method7673(int i) {
		return (i >= STRAIGHT_SLOPE_ROOF.type * 1109376893 && i <= STRAIGHT_FLAT_ROOF.type * 1109376893);
	}

	public static boolean method7674(int i) {
		return (i >= STRAIGHT_BOTTOM_EDGE_ROOF.type * 1109376893 && i <= STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF.type * 1109376893);
	}

	static final void method7675(CS2Executor class527, byte i) {
		class527.intStackPtr -= 283782002;
		int i_1_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_2_ = (class527.intStack[1942118537 * class527.intStackPtr + 1]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class515.method8861(i_1_, i_2_, false, 946854305);
	}
}
