package com.jagex;

public class AudioFormatUnknown2 extends NodeWithAudioBuffer26_Sub1 {

    float[] audioBuffer;

	/**
	 * The actual format is unknown
	 * @param hertz
	 * @param data
	 * @param i_4
	 * @param duration
	 * @param bool_6
	 */
    AudioFormatUnknown2(int hertz, float[] data, int i_4, int duration, boolean bool_6) {
        this.hertz = hertz;
        audioBuffer = data;
        anInt9749 = i_4;
        this.duration = duration;
        aBoolNormFalse9752 = bool_6;
    }

    @Override
    public int getAudioBufferLength() {
        return audioBuffer.length;
    }

    @Override
    public Sound_Node_1 getHeadSoundNode_4(int i_1, int volume, int i_3) {
        return audioBuffer != null && audioBuffer.length != 0 ? new MidiInstrumentNode_2(this, i_1, volume, i_3) : null;
    }

    float[] getAudioBuffer() {
        return audioBuffer;
    }

}
