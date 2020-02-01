package com.jagex;
public class IFSubObjectNode extends IFSubNode {

	IFSubObjectPosition aClass530_9564;

	public boolean method13401() {
		SceneObject sceneobject_2 = this.aClass530_9564.method11344();
		if (sceneobject_2 != null) {
			Class15.method549(CS2HookEventType.aClass397_4808, this.interfaceId, sceneobject_2);
			return true;
		} else {
			return false;
		}
	}

	public IFSubObjectNode(int i_1, int i_2, IFSubObjectPosition class530_3) {
		super(i_1, i_2);
		this.aClass530_9564 = class530_3;
	}

}
