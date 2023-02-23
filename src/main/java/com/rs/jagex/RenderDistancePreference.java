package com.rs.jagex;

public class RenderDistancePreference extends Preference {

	public RenderDistancePreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public RenderDistancePreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return RenderDistance.LOW.ordinal();
	}

	public void method12749() {
		if (value < RenderDistance.LOW.ordinal() || value > RenderDistance.HIGH.ordinal())
			value = getDefaultValue();

	}

	public int method12750() {
		return value;
	}

	void method7780(int i_1) {
		value = i_1 * -754033619 * -859024475;
	}

	int method7784() {
		return 1;
	}

	int method7786() {
		return -1544200711 * RenderDistance.LOW.ordinal() * 2087113801;
	}

	int method7787() {
		return -1544200711 * RenderDistance.LOW.ordinal() * 2087113801;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
