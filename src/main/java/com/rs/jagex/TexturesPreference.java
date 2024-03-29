package com.rs.jagex;

public class TexturesPreference extends Preference {

	static IComponentDefinitions method12880(IComponentDefinitions icomponentdefinitions_0) {
		IComponentDefinitions icomponentdefinitions_2 = client.method11634(icomponentdefinitions_0);
		if (icomponentdefinitions_2 == null)
			icomponentdefinitions_2 = icomponentdefinitions_0.aClass118_1379;

		return icomponentdefinitions_2;
	}

	public TexturesPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public TexturesPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return manager.getGame() == Game.darkan ? (i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1) : 3;
	}

	@Override
	int getDefaultValue() {
		return 1;
	}

	public void method12871() {
		if (manager.getGame() != Game.darkan)
			value = 1;

		if (value != 0 && value != 1)
			value = getDefaultValue();

	}

	public boolean method12872() {
		return manager.getGame() == Game.darkan;
	}

	public int method12873() {
		return value;
	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	public int method7784(int i_1) {
		return manager.getGame() == Game.darkan ? (i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1) : 3;
	}

	int method7786() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
