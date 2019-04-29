public class CS2Interface {
	RSInterface inter;
	IComponentDefinitions defs;

	boolean method8764(int i_1, int i_2) {
		IComponentDefinitions icomponentdefinitions_4 = Index.getIComponentDefinitions(i_1, i_2);
		if (icomponentdefinitions_4 != null) {
			this.inter = Preference_Sub8.INTERFACES[i_1 >> 16];
			this.defs = icomponentdefinitions_4;
			return true;
		} else {
			this.method8768(525234186);
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

		this.method8768(-2008016727);
		return false;
	}

	void method8768(int i_1) {
		this.inter = null;
		this.defs = null;
	}

	IComponentDefinitions method8772() {
		return this.inter.getComponent(this.defs.idHash);
	}

	static final void method8777(int i_0, byte b_1) {
		if (MovingAnimation.isInterfaceLoaded(i_0, (int[]) null, -1514339264)) {
			Class464.method7743(Preference_Sub8.INTERFACES[i_0].components, -1);
		}

	}

}
