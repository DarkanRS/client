package com.jagex;

public class AudioFormatUnknown extends NodeWithAudioBuffer26_Sub1 {

    byte[] audioBuffer;

	/**
	 * The actual format is unknown
	 * @param data
	 * @param i_3
	 * @param i_4
	 */
    AudioFormatUnknown(byte[] data, int i_3, int i_4) {
        hertz = 22050;
        audioBuffer = data;
        anInt9749 = i_3;
        duration = i_4;
    }

    public AudioFormatUnknown method16062(Class344 class344_1) {
        audioBuffer = class344_1.method6102(audioBuffer);
        hertz = class344_1.method6112(hertz);
        if (anInt9749 == duration) {
            anInt9749 = duration = class344_1.method6114(anInt9749);
        } else {
            anInt9749 = class344_1.method6114(anInt9749);
            duration = class344_1.method6114(duration);
            if (anInt9749 == duration) {
                --anInt9749;
            }
        }

        return this;
    }

    @Override
    public int getAudioBufferLength() {
        return audioBuffer.length;
    }

    @Override
    public Sound_Node_1 getHeadSoundNode_4(int i_1, int volume, int i_3) {
        return audioBuffer != null && audioBuffer.length != 0 ? new SoundEffectNode_2(this, i_1, volume, i_3) : null;
    }

}
