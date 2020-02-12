package com.jagex;

public class CS2Interface {
    RSInterface inter;
    IComponentDefinitions defs;

    boolean setChild(int ifComp, int slotId) {
        IComponentDefinitions def = Index.getIComponentDefinitions(ifComp, slotId);
        if (def != null) {
            this.inter = CustomCursorsPreference.INTERFACES[ifComp >> 16];
            this.defs = def;
            return true;
        } else {
            this.method8768();
            return false;
        }
    }

    boolean method8766(RSInterface interface_1, int i_2, int i_3) {
        if (interface_1 != null) {
            IComponentDefinitions icomponentdefinitions_5 = interface_1.getComponent(i_2);
            if (icomponentdefinitions_5 != null) {
                this.inter = interface_1;
                this.defs = icomponentdefinitions_5;
                return true;
            }
        }

        this.method8768();
        return false;
    }

    void method8768() {
        this.inter = null;
        this.defs = null;
    }

    IComponentDefinitions method8772() {
        return this.inter.getComponent(this.defs.idHash);
    }

    static final void method8777(int i_0, byte b_1) {
        if (MovingAnimation.isInterfaceLoaded(i_0, null, -1514339264)) {
            Class464.method7743(CustomCursorsPreference.INTERFACES[i_0].components, -1);
        }

    }

}
