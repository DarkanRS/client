package com.rs.jagex;

public class Preference_Sub17 extends Preference {

	public Preference_Sub17(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public Preference_Sub17(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		if (manager.getGame() != Game.darkan)
			return 3;
		if (i_1 == 0) {
			if ((manager.fog.method13417() == 1) || (manager.textures.method12873() == 1) || (manager.water.getValue() > 0))
				return 2;
		}

		return 1;
	}

	@Override
	int getDefaultValue() {
		return 1;
	}

	public boolean method12761() {
		return manager.getGame() == Game.darkan;
	}

	public int method12762() {
		return value;
	}

	public void method12767() {
		if (manager.getGame() != Game.darkan)
			value = 1;

		if (value != 0 && value != 1)
			value = getDefaultValue();

	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	public int method7784(int i_1) {
		if (manager.getGame() != Game.darkan)
			return 3;
		if (i_1 == 0) {
			if ((manager.fog.method13417() == 1) || (manager.textures.method12873() == 1) || (manager.water.getValue() > 0))
				return 2;
		}

		return 1;
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
