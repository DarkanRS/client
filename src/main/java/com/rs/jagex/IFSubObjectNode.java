package com.rs.jagex;

public class IFSubObjectNode extends SubInterface {

	IFSubObjectPosition objPos;

	public IFSubObjectNode(int interfaceId, int overlay, IFSubObjectPosition class530_3) {
		super(interfaceId, overlay);
		objPos = class530_3;
	}

	@Override
	public boolean load() {
		WorldObject obj = objPos.getObjectWithId();
		if (obj != null) {
			Class15.method549(ClientTriggerType.aClass397_4808, interfaceId, obj);
			return true;
		}
		return false;
	}

}
