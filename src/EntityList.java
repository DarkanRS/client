public class EntityList {

	Class275 aClass275_5468 = new Class275();

	Class275 aClass275_5469;

	public EntityList() {
		this.aClass275_5468.aClass275_3339 = this.aClass275_5468;
		this.aClass275_5468.aClass275_3340 = this.aClass275_5468;
	}

	public void method7647(Class275 class275_1, int i_2) {
		if (class275_1.aClass275_3340 != null) {
			class275_1.method4887((byte) -87);
		}
		class275_1.aClass275_3340 = this.aClass275_5468;
		class275_1.aClass275_3339 = this.aClass275_5468.aClass275_3339;
		class275_1.aClass275_3340.aClass275_3339 = class275_1;
		class275_1.aClass275_3339.aClass275_3340 = class275_1;
	}

	public Class275 method7648(int i_1) {
		Class275 class275_2 = this.aClass275_5468.aClass275_3339;
		if (class275_2 == this.aClass275_5468) {
			return null;
		} else {
			class275_2.method4887((byte) -116);
			return class275_2;
		}
	}

	public void offer(Class275 class275_1, int i_2) {
		if (class275_1.aClass275_3340 != null) {
			class275_1.method4887((byte) -24);
		}
		class275_1.aClass275_3340 = this.aClass275_5468.aClass275_3340;
		class275_1.aClass275_3339 = this.aClass275_5468;
		class275_1.aClass275_3340.aClass275_3339 = class275_1;
		class275_1.aClass275_3339.aClass275_3340 = class275_1;
	}

	public Class275 method7650(byte b_1) {
		Class275 class275_2 = this.aClass275_5469;
		if (class275_2 == this.aClass275_5468) {
			this.aClass275_5469 = null;
			return null;
		} else {
			this.aClass275_5469 = class275_2.aClass275_3339;
			return class275_2;
		}
	}

	public void method7651(byte b_1) {
		while (true) {
			Class275 class275_2 = this.aClass275_5468.aClass275_3339;
			if (class275_2 == this.aClass275_5468) {
				this.aClass275_5469 = null;
				return;
			}
			class275_2.method4887((byte) -18);
		}
	}

	public Class275 method7659(int i_1) {
		Class275 class275_2 = this.aClass275_5468.aClass275_3339;
		if (class275_2 == this.aClass275_5468) {
			this.aClass275_5469 = null;
			return null;
		} else {
			this.aClass275_5469 = class275_2.aClass275_3339;
			return class275_2;
		}
	}

	public boolean method7666(int i_1) {
		return this.aClass275_5468.aClass275_3339 == this.aClass275_5468;
	}

	static final void method7667(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 3;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		short s_5 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		short s_6 = (short) cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 >= 0 && i_4 < 5) {
			icomponentdefinitions_0.method2007(i_4, s_5, s_6, -1261332787);
			Class109.redrawComponent(icomponentdefinitions_0, (byte) -93);
			if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
				RegionMap.method5513(icomponentdefinitions_0.idHash, i_4, (byte) -1);
			}
		}
	}
}
