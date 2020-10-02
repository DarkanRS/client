package com.jagex;

public class CS2Interface {
    Interface inter;
    IComponentDefinitions defs;

    static void method8777(int i_0) {
        if (MovingAnimation.isInterfaceLoaded(i_0, null)) {
            Class464.method7743(Interface.INTERFACES[i_0].components, -1);
        }

    }

    boolean setChild(int ifComp, int slotId) {
        IComponentDefinitions def = Index.getIComponentDefinitions(ifComp, slotId);
        if (def != null) {
            inter = Interface.INTERFACES[ifComp >> 16];
            defs = def;
            return true;
        } else {
            method8768();
            return false;
        }
    }

    boolean method8766(Interface interface_1, int i_2) {
        if (interface_1 != null) {
            IComponentDefinitions icomponentdefinitions_5 = interface_1.getComponent(i_2);
            if (icomponentdefinitions_5 != null) {
                inter = interface_1;
                defs = icomponentdefinitions_5;
                return true;
            }
        }

        method8768();
        return false;
    }

    void method8768() {
        inter = null;
        defs = null;
    }

    IComponentDefinitions method8772() {
        return inter.getComponent(defs.idHash);
    }

}
