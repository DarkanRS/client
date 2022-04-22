package com.jagex;

public class AudioFormatUnknown2 extends Node_Sub26_Sub1 {

    float[] audioBuffer;

	/**
	 * The actual format is unknown
	 * @param hertz
	 * @param data
	 * @param i_4
	 * @param i_5
	 * @param bool_6
	 */
    AudioFormatUnknown2(int hertz, float[] data, int i_4, int i_5, boolean bool_6) {
        this.hertz = hertz;
        audioBuffer = data;
        anInt9749 = i_4;
        anInt9751 = i_5;
        aBool9752 = bool_6;
    }

    @Override
    public int getAudioBufferLength() {
        return audioBuffer.length;
    }

    @Override
    public Node_Sub15_Sub5 method15225(int i_1, int volume, int i_3) {
        return audioBuffer != null && audioBuffer.length != 0 ? new Node_Sub15_Sub5_Sub1(this, i_1, volume, i_3) : null;
    }

    float[] getAudioBuffer() {
        return audioBuffer;
    }

}
