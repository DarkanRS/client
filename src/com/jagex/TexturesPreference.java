package com.jagex;
public class TexturesPreference extends Preference {

	int method7787() {
		return 1;
	}

	public void method12871() {
		if (this.manager.getGame() != Game.darkan) {
			this.anInt5578 = 1;
		}

		if (this.anInt5578 != 0 && this.anInt5578 != 1) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	int getDefaultValue() {
		return 1;
	}

	public boolean method12872() {
		return this.manager.getGame() == Game.darkan;
	}

	public int checkValid(int i_1) {
		return this.manager.getGame() == Game.darkan ? (i_1 != 0 && this.manager.groundBlending.method12762(288309414) != 1 ? 2 : 1) : 3;
	}

	public int method12873(int i_1) {
		return this.anInt5578;
	}

	int method7786() {
		return 1;
	}

	public int method7784(int i_1) {
		return this.manager.getGame() == Game.darkan ? (i_1 != 0 && this.manager.groundBlending.method12762(-925093981) != 1 ? 2 : 1) : 3;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	public TexturesPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public TexturesPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	static IComponentDefinitions method12880(IComponentDefinitions icomponentdefinitions_0) {
		IComponentDefinitions icomponentdefinitions_2 = client.method11634(icomponentdefinitions_0);
		if (icomponentdefinitions_2 == null) {
			icomponentdefinitions_2 = icomponentdefinitions_0.aClass118_1379;
		}

		return icomponentdefinitions_2;
	}

}
