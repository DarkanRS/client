package com.jagex;

public class SoundEffect {

    Instrument[] instruments = new Instrument[10];
    int loopBegin;
    int loopEnd;

    SoundEffect(RsByteBuffer buffer) {
        for (int i_2 = 0; i_2 < 10; i_2++) {
            int hasInstruments = buffer.readUnsignedByte();
            if (hasInstruments != 0) {
                --buffer.index;
                this.instruments[i_2] = new Instrument();
                this.instruments[i_2].decodeInstruments(buffer);
            }
        }

        this.loopBegin = buffer.readUnsignedShort();
        this.loopEnd = buffer.readUnsignedShort();
    }

    public Node_Sub26_Sub1_Sub2 getMixedAudio() {
        byte[] mixed = this.mix();
        return new Node_Sub26_Sub1_Sub2(mixed, this.loopBegin * 22050 / 1000, this.loopEnd * 22050 / 1000);
    }

    public final int getDelay() {
        int delay = 9999999;

        int i_2;
        for (i_2 = 0; i_2 < 10; i_2++) {
            if (this.instruments[i_2] != null && this.instruments[i_2].offset / 20 < delay) {
                delay = this.instruments[i_2].offset / 20;
            }
        }

        if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < delay) {
            delay = this.loopBegin / 20;
        }

        if (delay != 9999999 && delay != 0) {
            for (i_2 = 0; i_2 < 10; i_2++) {
                if (this.instruments[i_2] != null) {
                    this.instruments[i_2].offset -= delay * 20;
                }
            }

            if (this.loopBegin < this.loopEnd) {
                this.loopBegin -= delay * 20;
                this.loopEnd -= delay * 20;
            }

            return delay;
        } else {
            return 0;
        }
    }

    final byte[] mix() {
        int duration = 0;

        for (int i = 0; i < 10; i++) {
            if (this.instruments[i] != null && this.instruments[i].duration + this.instruments[i].offset > duration) {
                duration = this.instruments[i].duration + this.instruments[i].offset;
            }
        }

        if (duration == 0) {
            return new byte[0];
        } else {
            int ns = duration * 22050 / 1000;
            byte[] mixed = new byte[ns];

            for (int i = 0; i < 10; i++) {
                if (this.instruments[i] != null) {
                    int mixDuration = this.instruments[i].duration * 22050 / 1000;
                    int offset = this.instruments[i].offset * 22050 / 1000;
                    int[] samples = this.instruments[i].synthesize(mixDuration, this.instruments[i].duration);

                    for (int j = 0; j < mixDuration; j++) {
                        int out = (samples[j] >> 8) + mixed[j + offset];
                        if ((out + 128 & ~0xff) != 0) {
                            out = out >> 31 ^ 0x7f;
                        }

                        mixed[j + offset] = (byte) out;
                    }
                }
            }

            return mixed;
        }
    }

    public static SoundEffect getSoundEffect(Index index_0, int i_1, int i_2) {
        byte[] data = index_0.getFile(i_1, i_2);
        return data == null ? null : new SoundEffect(new RsByteBuffer(data));
    }

}
