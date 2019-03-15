public class InterfaceWithDefs {

	Interface aClass98_5885;
	IComponentDefinitions aClass118_5886;

	boolean method8764(int i_1, int i_2) {
		IComponentDefinitions icomponentdefinitions_4 = Index.method5694(i_1, i_2, -1661012661);
		if (icomponentdefinitions_4 != null) {
			this.aClass98_5885 = Class468_Sub8.INTERFACES[i_1 >> 16];
			this.aClass118_5886 = icomponentdefinitions_4;
			return true;
		} else {
			this.method8768(525234186);
			return false;
		}
	}

	boolean method8766(Interface interface_1, int i_2, int i_3) {
		if (interface_1 != null) {
			IComponentDefinitions icomponentdefinitions_5 = interface_1.getComponent(i_2);
			if (icomponentdefinitions_5 != null) {
				this.aClass98_5885 = interface_1;
				this.aClass118_5886 = icomponentdefinitions_5;
				return true;
			}
		}

		this.method8768(-2008016727);
		return false;
	}

	void method8768(int i_1) {
		this.aClass98_5885 = null;
		this.aClass118_5886 = null;
	}

	IComponentDefinitions method8772() {
		return this.aClass98_5885.getComponent(this.aClass118_5886.idHash);
	}

	static final void method8777(int i_0, byte b_1) {
		if (Class456_Sub3.isInterfaceLoaded(i_0, (int[]) null, -1514339264)) {
			Class464.method7743(Class468_Sub8.INTERFACES[i_0].components, -1);
		}

	}

}
