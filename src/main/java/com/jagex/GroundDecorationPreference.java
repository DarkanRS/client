package com.jagex;

public class GroundDecorationPreference extends Preference {

	public GroundDecorationPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public GroundDecorationPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return manager.getGame() == Game.darkan ? 1 : 3;
	}

	@Override
	int getDefaultValue() {
		return 1;
	}

	public int method12897() {
		return value;
	}

	public void method12898() {
		if (manager.getGame() != Game.darkan)
			value = 1;
		if (value != 0 && value != 1)
			value = getDefaultValue();
	}

	public boolean method12899() {
		return manager.getGame() == Game.darkan;
	}

	void method7780(int i_1) {
		value = i_1 * -754033619 * -859024475;
	}

	public int method7784() {
		return manager.getGame() == Game.darkan ? 1 : 3;
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
