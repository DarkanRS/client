package com.jagex;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;

public class Class253_Sub1 extends Class253 {

	/**
	 * This is important to understanding sound...
	 */
    AudioFormat anAudioFormat7824;
    byte[] aByteArray7825;
    boolean aBool7826;
    SourceDataLine aSourceDataLine7822;
    int anInt7823;

    @Override
    void method4370() {
        Info[] arr_2 = AudioSystem.getMixerInfo();
        if (arr_2 != null) {
            for (Info mixer$info_5 : arr_2) {
                if (mixer$info_5 != null) {
                    String string_6 = mixer$info_5.getName();
                    if (string_6 != null && string_6.toLowerCase().indexOf("soundmax") >= 0) {
                        aBool7826 = true;
                    }
                }
            }
        }

        anAudioFormat7824 = new AudioFormat(anInt3129, 16, aBool3115 ? 2 : 1, true, false);
        aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
    }

    @Override
    void method4361(int i_1) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info dataline$info_2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, anAudioFormat7824, i_1 << (aBool3115 ? 2 : 1));
            aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(dataline$info_2);
            aSourceDataLine7822.open();
            aSourceDataLine7822.start();
            anInt7823 = i_1;
        } catch (LineUnavailableException lineunavailableexception_3) {
            if (Class179.method3019(i_1) == 1) {
                aSourceDataLine7822 = null;
                throw lineunavailableexception_3;
            }

            method4361(Utils.nextPowerOfTwo(i_1));
        }

    }

    @Override
    void method4342() {
        int i_1 = 256;
        if (aBool3115) {
            i_1 <<= 1;
        }

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            int i_3 = anIntArray3140[i_2];
            if ((i_3 + 8388608 & -16777216) != 0) {
                i_3 = 0x7fffff ^ i_3 >> 31;
            }

            aByteArray7825[i_2 * 2] = (byte) (i_3 >> 8);
            aByteArray7825[i_2 * 2 + 1] = (byte) (i_3 >> 16);
        }

        aSourceDataLine7822.write(aByteArray7825, 0, i_1 << 1);
    }

    @Override
    void method4343() {
        if (aSourceDataLine7822 != null) {
            aSourceDataLine7822.close();
            aSourceDataLine7822 = null;
        }

    }

    @Override
    void method4344() throws LineUnavailableException {
        aSourceDataLine7822.flush();
        if (aBool7826) {
            aSourceDataLine7822.close();
            aSourceDataLine7822 = null;
            javax.sound.sampled.DataLine.Info dataline$info_1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, anAudioFormat7824, anInt7823 << (aBool3115 ? 2 : 1));
            aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(dataline$info_1);
            aSourceDataLine7822.open();
            aSourceDataLine7822.start();
        }

    }

    @Override
    int method4340() {
        return anInt7823 - (aSourceDataLine7822.available() >> (aBool3115 ? 2 : 1));
    }

}
