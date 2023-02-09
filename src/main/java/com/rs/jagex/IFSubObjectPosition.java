package com.rs.jagex;

public class IFSubObjectPosition {

	public static boolean appletHasFocus;

	static Class204[] method11353() {
		return new Class204[]{Class204.aClass204_2578, Class204.aClass204_2579};
	}

	public static Class357 method11354(ByteBuf rsbytebuffer_0) {
		Class357 class357_2 = Class258.method4570(rsbytebuffer_0);
		int i_3 = rsbytebuffer_0.read24BitInteger();
		return new Class357_Sub1(class357_2.anInt4124, class357_2.aClass356_4121, class357_2.aClass353_4122, class357_2.anInt4123, class357_2.anInt4120, i_3);
	}

	CoordGrid position;

	int type;

	int objectId;

	public IFSubObjectPosition(CoordGrid coordgrid_1, int i_2, int i_4) {
		position = coordgrid_1;
		type = i_2;
		objectId = i_4;
	}

	WorldObject getObjectAtPos() {
		int i_2 = position.plane;
		CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getBase();
		int i_4 = position.x - coordgrid_3.x;
		int i_5 = position.y - coordgrid_3.y;
		if ((i_4 < 0) || (i_5 < 0) || (i_4 >= IndexLoaders.MAP_REGION_DECODER.getSizeX()) || (i_5 >= IndexLoaders.MAP_REGION_DECODER.getSizeY()))
			return null;
		return switch (getSlot()) {
		case 0 -> (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall(i_2, i_4, i_5);
		case 1 -> (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWallDecoration(i_2, i_4, i_5);
		case 2 -> (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getInteractableObject(i_2, i_4, i_5, client.anInterface25_7446);
		case 3 -> (WorldObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getGroundDecoration(i_2, i_4, i_5);
		default -> null;
		};
	}

	public WorldObject getObjectWithId() {
		WorldObject obj = getObjectAtPos();
		return obj == null ? null : (obj.getId() != objectId ? null : obj);
	}

	int getSlot() {
		return client.OBJECT_TYPE_SLOTS[type];
	}
}
