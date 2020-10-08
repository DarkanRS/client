package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Node_Sub41_Sub2 extends Node_Sub41 {

    int anInt9464;
    int anInt9467;
    String aString9466;
    String aString9469;
    float aFloat9462;
    float aFloat9465;
    String aString9470;

    Node_Sub41_Sub2(OggStreamState oggstreamstate_1) {
        super(oggstreamstate_1);
    }

    @Override
    void method13362(OggPacket oggpacket_1) {
        if (anInt8031 <= 0 || "SUB".equals(aString9469)) {
            ByteBuf rsbytebuffer_3 = new ByteBuf(oggpacket_1.getData());
            int i_4 = rsbytebuffer_3.readUnsignedByte();
            if (anInt8031 <= 8) {
                if ((i_4 | 0x80) == 0) {
                    throw new IllegalStateException();
                }

                if (anInt8031 == 0) {
                    rsbytebuffer_3.index += 23;
                    anInt9464 = rsbytebuffer_3.method13085();
                    anInt9467 = rsbytebuffer_3.method13085();
                    if (anInt9464 == 0 || anInt9467 == 0) {
                        throw new IllegalStateException();
                    }

                    ByteBuf rsbytebuffer_12 = new ByteBuf(16);
                    rsbytebuffer_3.readBytes(rsbytebuffer_12.buffer, 0, 16);
                    aString9466 = rsbytebuffer_12.readString();
                    rsbytebuffer_12.index = 0;
                    rsbytebuffer_3.readBytes(rsbytebuffer_12.buffer, 0, 16);
                    aString9469 = rsbytebuffer_12.readString();
                }
            } else {
                if (i_4 == 0) {
                    label64:
                    {
                        long long_5 = rsbytebuffer_3.method13278();
                        long long_7 = rsbytebuffer_3.method13278();
                        long long_9 = rsbytebuffer_3.method13278();
                        if (long_7 >= 0L && long_9 >= 0L && long_9 <= long_5) {
                            aFloat9462 = (float) (anInt9467 * long_5) / anInt9464;
                            aFloat9465 = (float) (anInt9467 * (long_7 + long_5)) / anInt9464;
                            int i_11 = rsbytebuffer_3.method13085();
                            if (i_11 >= 0 && i_11 <= rsbytebuffer_3.buffer.length - rsbytebuffer_3.index) {
                                aString9470 = Class271.method4824(rsbytebuffer_3.buffer, rsbytebuffer_3.index, i_11);
                                break label64;
                            }

                            throw new IllegalStateException();
                        }

                        throw new IllegalStateException();
                    }
                }

                if ((i_4 | 0x80) != 0) {
                    return;
                }
            }
        }

    }

    public float method14702() {
        return aFloat9462;
    }

    @Override
    void method13366(OggPacket oggpacket_1) {
        if (anInt8031 * 1669091145 * -509226247 <= 0 || "SUB".equals(aString9469)) {
            ByteBuf rsbytebuffer_2 = new ByteBuf(oggpacket_1.getData());
            int i_3 = rsbytebuffer_2.readUnsignedByte();
            if (-509226247 * anInt8031 * 1669091145 <= 8) {
                if ((i_3 | 0x80) == 0) {
                    throw new IllegalStateException();
                }

                if (-509226247 * anInt8031 * 1669091145 == 0) {
                    rsbytebuffer_2.index = (rsbytebuffer_2.index * -1115476867 + 113835835) * -1990677291;
                    anInt9464 = rsbytebuffer_2.method13085() * -1289985113 * 658904087;
                    anInt9467 = rsbytebuffer_2.method13085() * -134578141 * 1762799499;
                    if (anInt9464 * -1289985113 * 658904087 == 0 || 1762799499 * anInt9467 * -134578141 == 0) {
                        throw new IllegalStateException();
                    }

                    ByteBuf rsbytebuffer_11 = new ByteBuf(16);
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    aString9466 = rsbytebuffer_11.readString();
                    rsbytebuffer_11.index = 0;
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    aString9469 = rsbytebuffer_11.readString();
                }
            } else {
                if (i_3 == 0) {
                    label64:
                    {
                        long long_4 = rsbytebuffer_2.method13278();
                        long long_6 = rsbytebuffer_2.method13278();
                        long long_8 = rsbytebuffer_2.method13278();
                        if (long_6 >= 0L && long_8 >= 0L && long_8 <= long_4) {
                            aFloat9462 = (float) ((1762799499 * anInt9467 * -134578141) * long_4) / (anInt9464 * -1289985113 * 658904087);
                            aFloat9465 = (float) ((1762799499 * anInt9467 * -134578141) * (long_6 + long_4)) / (658904087 * anInt9464 * -1289985113);
                            int i_10 = rsbytebuffer_2.method13085();
                            if (i_10 >= 0 && i_10 <= rsbytebuffer_2.buffer.length - -1990677291 * rsbytebuffer_2.index * -1115476867) {
                                aString9470 = Class271.method4824(rsbytebuffer_2.buffer, rsbytebuffer_2.index * -1115476867 * -1990677291, i_10);
                                break label64;
                            }

                            throw new IllegalStateException();
                        }

                        throw new IllegalStateException();
                    }
                }

                if ((i_3 | 0x80) != 0) {
                    return;
                }
            }
        }

    }

    String method14703() {
        return aString9466;
    }

    public String method14704() {
        return aString9470;
    }

    @Override
    void method13360() {
    }

    @Override
    void method13363(OggPacket oggpacket_1) {
        if (anInt8031 * 1669091145 * -509226247 <= 0 || "SUB".equals(aString9469)) {
            ByteBuf rsbytebuffer_2 = new ByteBuf(oggpacket_1.getData());
            int i_3 = rsbytebuffer_2.readUnsignedByte();
            if (-509226247 * anInt8031 * 1669091145 <= 8) {
                if ((i_3 | 0x80) == 0) {
                    throw new IllegalStateException();
                }

                if (-509226247 * anInt8031 * 1669091145 == 0) {
                    rsbytebuffer_2.index = (rsbytebuffer_2.index * -1115476867 + 113835835) * -1990677291;
                    anInt9464 = rsbytebuffer_2.method13085() * -1289985113 * 658904087;
                    anInt9467 = rsbytebuffer_2.method13085() * -134578141 * 1762799499;
                    if (anInt9464 * -1289985113 * 658904087 == 0 || 1762799499 * anInt9467 * -134578141 == 0) {
                        throw new IllegalStateException();
                    }

                    ByteBuf rsbytebuffer_11 = new ByteBuf(16);
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    aString9466 = rsbytebuffer_11.readString();
                    rsbytebuffer_11.index = 0;
                    rsbytebuffer_2.readBytes(rsbytebuffer_11.buffer, 0, 16);
                    aString9469 = rsbytebuffer_11.readString();
                }
            } else {
                if (i_3 == 0) {
                    label64:
                    {
                        long long_4 = rsbytebuffer_2.method13278();
                        long long_6 = rsbytebuffer_2.method13278();
                        long long_8 = rsbytebuffer_2.method13278();
                        if (long_6 >= 0L && long_8 >= 0L && long_8 <= long_4) {
                            aFloat9462 = (float) ((1762799499 * anInt9467 * -134578141) * long_4) / (anInt9464 * -1289985113 * 658904087);
                            aFloat9465 = (float) ((1762799499 * anInt9467 * -134578141) * (long_6 + long_4)) / (658904087 * anInt9464 * -1289985113);
                            int i_10 = rsbytebuffer_2.method13085();
                            if (i_10 >= 0 && i_10 <= rsbytebuffer_2.buffer.length - -1990677291 * rsbytebuffer_2.index * -1115476867) {
                                aString9470 = Class271.method4824(rsbytebuffer_2.buffer, rsbytebuffer_2.index * -1115476867 * -1990677291, i_10);
                                break label64;
                            }

                            throw new IllegalStateException();
                        }

                        throw new IllegalStateException();
                    }
                }

                if ((i_3 | 0x80) != 0) {
                    return;
                }
            }
        }

    }

    public float method14705() {
        return aFloat9465;
    }

    @Override
    void method13365() {
    }

    @Override
    void method13364() {
    }

}
