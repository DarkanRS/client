package com.jagex;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import java.io.FileOutputStream;

public class Class253_Sub1 extends Class253 {

	/**
	 * This is important to understanding sound...
	 */
    AudioFormat anAudioFormat7824;
    byte[] audioData2;
    boolean aBool7826;
    SourceDataLine audioLine;
    int anInt7823;
	static FileOutputStream output;

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

        anAudioFormat7824 = new AudioFormat(hertz, 16, isStereo ? 2 : 1, true, false);
        audioData2 = new byte[256 << (isStereo ? 2 : 1)];
    }

    @Override
    void method4361(int i_1) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info dataline$info_2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, anAudioFormat7824, i_1 << (isStereo ? 2 : 1));
            audioLine = (SourceDataLine) AudioSystem.getLine(dataline$info_2);
            audioLine.open();
            audioLine.start();
            anInt7823 = i_1;
        } catch (LineUnavailableException lineunavailableexception_3) {
            if (Class179.method3019(i_1) == 1) {
                audioLine = null;
                throw lineunavailableexception_3;
            }

            method4361(Utils.nextPowerOfTwo(i_1));
        }

    }

    @Override
    void writeAudioDataToOutput() {
        int dataLength = 256;//bytes per cycle
        if (isStereo) {
            dataLength <<= 1;//512, twice as much
        }

        for (int r = 0; r < dataLength; r++) {

            int byteFromSound = audioData1[r];
            if ((byteFromSound + 8388608 & -16777216) != 0) {
                byteFromSound = 0x7fffff ^ byteFromSound >> 31;
            }

			audioData2[r * 2] = (byte) (byteFromSound >> 8);
			audioData2[r * 2 + 1] = (byte) (byteFromSound >> 16);
        }
        audioLine.write(audioData2, 0, dataLength << 1);
    }

    @Override
    void method4343() {
        if (audioLine != null) {
            audioLine.close();
            audioLine = null;
        }

    }

    @Override
    void method4344() throws LineUnavailableException {
        audioLine.flush();
        if (aBool7826) {
            audioLine.close();
            audioLine = null;
            javax.sound.sampled.DataLine.Info dataline$info_1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, anAudioFormat7824, anInt7823 << (isStereo ? 2 : 1));
            audioLine = (SourceDataLine) AudioSystem.getLine(dataline$info_1);
            audioLine.open();
            audioLine.start();
        }

    }

    @Override
    int method4340() {
        return anInt7823 - (audioLine.available() >> (isStereo ? 2 : 1));
    }

}
