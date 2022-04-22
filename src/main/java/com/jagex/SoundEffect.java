package com.jagex;

public class SoundEffect {

    Instrument[] instruments = new Instrument[10];
    int loopBegin;
    int loopEnd;

    SoundEffect(ByteBuf buffer) {
        for (int i_2 = 0; i_2 < 10; i_2++) {
            int hasInstruments = buffer.readUnsignedByte();
            if (hasInstruments != 0) {
                --buffer.index;
                instruments[i_2] = new Instrument();
                instruments[i_2].decodeInstruments(buffer);
            }
        }

        loopBegin = buffer.readUnsignedShort();
        loopEnd = buffer.readUnsignedShort();
    }

    public static SoundEffect getSoundEffect(Index soundEffectsIndex, int i_1, int i_2) {
        byte[] data = soundEffectsIndex.getFile(i_1, i_2);
        return data == null ? null : new SoundEffect(new ByteBuf(data));
    }

    public AudioFormatUnknown getMixedAudio() {
        byte[] mixed = mix();
        return new AudioFormatUnknown(mixed, loopBegin * 22050 / 1000, loopEnd * 22050 / 1000);
    }

    public int getDelay() {
        int delay = 9999999;

        int i_2;
        for (i_2 = 0; i_2 < 10; i_2++) {
            if (instruments[i_2] != null && instruments[i_2].offset / 20 < delay) {
                delay = instruments[i_2].offset / 20;
            }
        }

        if (loopBegin < loopEnd && loopBegin / 20 < delay) {
            delay = loopBegin / 20;
        }

        if (delay != 9999999 && delay != 0) {
            for (i_2 = 0; i_2 < 10; i_2++) {
                if (instruments[i_2] != null) {
                    instruments[i_2].offset -= delay * 20;
                }
            }

            if (loopBegin < loopEnd) {
                loopBegin -= delay * 20;
                loopEnd -= delay * 20;
            }

            return delay;
        } else {
            return 0;
        }
    }

    byte[] mix() {
        int duration = 0;

        for (int i = 0; i < 10; i++) {
            if (instruments[i] != null && instruments[i].duration + instruments[i].offset > duration) {
                duration = instruments[i].duration + instruments[i].offset;
            }
        }

        if (duration == 0) {
            return new byte[0];
        } else {
            int ns = duration * 22050 / 1000;
            byte[] mixed = new byte[ns];

            for (int i = 0; i < 10; i++) {
                if (instruments[i] != null) {
                    int mixDuration = instruments[i].duration * 22050 / 1000;
                    int offset = instruments[i].offset * 22050 / 1000;
                    int[] samples = instruments[i].synthesize(mixDuration, instruments[i].duration);

                    for (int j = 0; j < mixDuration; j++) {
                        int out = (samples[j] >> 8) + mixed[j + offset];
                        if ((out + 128 & -256) != 0) {
                            out = out >> 31 ^ 0x7f;
                        }

                        mixed[j + offset] = (byte) out;
                    }
                }
            }

            return mixed;
        }
    }

}
