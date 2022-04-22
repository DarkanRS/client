package com.jagex;

public class SoundLevelPreference extends Preference {

    public SoundLevelPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public SoundLevelPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

	/**
	 * Volume ratio is between 0 and 127
	 */
    public void validateVolume() {
        if (value < 0 && value > 127) {
            value = getDefaultValue();
        }
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

	/**
	 * A multiplier for raw volumes
	 * @return
	 */
    public int getVolumeRatio() {
        return value;
    }

    int getMaxVolumeRatio() {
        return 127;
    }

    int getMinVolumeRatio() {
        return 1;
    }

    @Override
    int getDefaultValue() {
        return 127;
    }
}
