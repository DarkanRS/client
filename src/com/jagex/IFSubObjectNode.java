package com.jagex;

public class IFSubObjectNode extends SubInterface {

    IFSubObjectPosition aClass530_9564;

    public IFSubObjectNode(int i_1, int i_2, IFSubObjectPosition class530_3) {
        super(i_1, i_2);
        aClass530_9564 = class530_3;
    }

    @Override
    public boolean method13401() {
        WorldObject sceneobject_2 = aClass530_9564.method11344();
        if (sceneobject_2 != null) {
            Class15.method549(ClientTriggerType.aClass397_4808, interfaceId, sceneobject_2);
            return true;
        } else {
            return false;
        }
    }

}
