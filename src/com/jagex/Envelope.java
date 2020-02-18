package com.jagex;

public class Envelope {
    int form;
    int start;
    int end;
    int critical;
    int phaseIndex;
    int step;
    int amplitude;
    int ticks;
    int numPhases = 2;
    int[] phaseDuration = new int[2];
    int[] phasePeak = new int[2];

    Envelope() {
        phaseDuration[0] = 0;
        phaseDuration[1] = 65535;
        phasePeak[0] = 0;
        phasePeak[1] = 65535;
    }

    void decode(Packet buffer) {
        form = buffer.readUnsignedByte();
        start = buffer.readInt();
        end = buffer.readInt();
        decodeShape(buffer);
    }

    void reset() {
        critical = 0;
        phaseIndex = 0;
        step = 0;
        amplitude = 0;
        ticks = 0;
    }

    void decodeShape(Packet buffer) {
        numPhases = buffer.readUnsignedByte();
        phaseDuration = new int[numPhases];
        phasePeak = new int[numPhases];

        for (int i = 0; i < numPhases; i++) {
            phaseDuration[i] = buffer.readUnsignedShort();
            phasePeak[i] = buffer.readUnsignedShort();
        }

    }

    int step(int period) {
        if (ticks >= critical) {
            amplitude = phasePeak[phaseIndex++] << 15;
            if (phaseIndex >= numPhases) {
                phaseIndex = numPhases - 1;
            }

            critical = (int) (phaseDuration[phaseIndex] / 65536.0D * period);
            if (critical > ticks) {
                step = ((phasePeak[phaseIndex] << 15) - amplitude) / (critical - ticks);
            }
        }

        amplitude += step;
        ++ticks;
        return amplitude - step >> 15;
    }

}
