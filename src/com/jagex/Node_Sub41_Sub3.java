package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.*;

public class Node_Sub41_Sub3 extends Node_Sub41 {

    boolean aBool9555;
    long aLong9553;
    boolean aBool9554;
    double aDouble9547;
    DecoderContext aDecoderContext9549;
    GranulePos aGranulePos9550;
    Frame aFrame9551;
    int anInt9556;
    boolean aBool9560;
    boolean aBool9558;
    int anInt9557;
    NativeSprite anObject9544;
    SetupInfo aSetupInfo9559 = new SetupInfo();
    TheoraInfo aTheoraInfo9546 = new TheoraInfo();
    TheoraComment aTheoraComment9552 = new TheoraComment();

    Node_Sub41_Sub3(OggStreamState oggstreamstate_1) {
        super(oggstreamstate_1);
    }

    public static void method14807() {
        AreadSound.anInt3307 = 100;
        MouseRecord_Sub1.aMouseRecord_Sub1Array9497 = new MouseRecord_Sub1[100];
        Class81.anInt803 = 0;
    }

    @Override
    void method13362(OggPacket oggpacket_1) {
        int i_3;
        if (!aBool9554) {
            i_3 = aSetupInfo9559.decodeHeader(aTheoraInfo9546, aTheoraComment9552, oggpacket_1);
            if (i_3 == 0) {
                aBool9554 = true;
                if (aTheoraInfo9546.frameWidth > 2048 || aTheoraInfo9546.frameHeight > 1024) {
                    throw new IllegalStateException();
                }

                aDecoderContext9549 = new DecoderContext(aTheoraInfo9546, aSetupInfo9559);
                aGranulePos9550 = new GranulePos();
                aFrame9551 = new Frame(aTheoraInfo9546.frameWidth, aTheoraInfo9546.frameHeight);
                anInt9556 = aDecoderContext9549.getMaxPostProcessingLevel();
                method14790(anInt9557);
            } else if (i_3 < 0) {
                throw new IllegalStateException("" + i_3);
            }
        } else {
            aLong9553 = Utils.time();
            i_3 = aDecoderContext9549.decodePacketIn(oggpacket_1, aGranulePos9550);
            if (i_3 < 0) {
                throw new IllegalStateException("" + i_3);
            }

            aDecoderContext9549.granuleFrame(aGranulePos9550);
            aDouble9547 = aDecoderContext9549.granuleTime(aGranulePos9550);
            if (aBool9558) {
                boolean bool_4 = oggpacket_1.isKeyFrame() == 1;
                if (!bool_4) {
                    return;
                }

                aBool9558 = false;
            }

            if (!aBool9555 || oggpacket_1.isKeyFrame() == 1) {
                if (aDecoderContext9549.decodeFrame(aFrame9551) != 0) {
                    throw new IllegalStateException("" + i_3);
                }

                aBool9560 = true;
            }
        }

    }

    void method14790(int i_1) {
        anInt9557 = i_1;
        if (aBool9554) {
            if (anInt9557 > anInt9556) {
                anInt9557 = anInt9556;
            }

            if (anInt9557 < 0) {
                anInt9557 = 0;
            }

            aDecoderContext9549.setPostProcessingLevel(anInt9557);
        }

    }

    float method14791() {
        return aBool9554 && !aTheoraInfo9546.method6698() ? (float) aTheoraInfo9546.fpsNumerator / aTheoraInfo9546.fpsDenominator : 0.0F;
    }

    double method14792() {
        return aDouble9547;
    }

    long method14793() {
        return aLong9553;
    }

    boolean method14794() {
        return aBool9554;
    }

    @Override
    void method13360() {
        if (aFrame9551 != null) {
            aFrame9551.method6699();
        }

        if (aDecoderContext9549 != null) {
            aDecoderContext9549.method6699();
            aDecoderContext9549 = null;
        }

        if (aGranulePos9550 != null) {
            aGranulePos9550.method6699();
            aGranulePos9550 = null;
        }

        aTheoraInfo9546.method6699();
        aTheoraComment9552.method6699();
        aSetupInfo9559.method6699();
    }

    public NativeSprite method14795(Interface23 interface23_1) {
        if (aFrame9551 == null) {
            return null;
        } else if (!aBool9560 && anObject9544 != null) {
            return anObject9544;
        } else {
            anObject9544 = interface23_1.method162(aFrame9551.pixels, aFrame9551.anInt9119, aFrame9551.anInt9119, aFrame9551.anInt9120);
            aBool9560 = false;
            return anObject9544;
        }
    }

    @Override
    void method13366(OggPacket oggpacket_1) {
        int i_2;
        if (!aBool9554) {
            i_2 = aSetupInfo9559.decodeHeader(aTheoraInfo9546, aTheoraComment9552, oggpacket_1);
            if (i_2 == 0) {
                aBool9554 = true;
                if (aTheoraInfo9546.frameWidth > 2048 || aTheoraInfo9546.frameHeight > 1024) {
                    throw new IllegalStateException();
                }

                aDecoderContext9549 = new DecoderContext(aTheoraInfo9546, aSetupInfo9559);
                aGranulePos9550 = new GranulePos();
                aFrame9551 = new Frame(aTheoraInfo9546.frameWidth, aTheoraInfo9546.frameHeight);
                anInt9556 = aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231 * -1692639633;
                method14790(351513665 * anInt9557 * -986815551);
            } else if (i_2 < 0) {
                throw new IllegalStateException("" + i_2);
            }
        } else {
            aLong9553 = Utils.time() * -3822562485386198145L * 4278118698289560703L;
            i_2 = aDecoderContext9549.decodePacketIn(oggpacket_1, aGranulePos9550);
            if (i_2 < 0) {
                throw new IllegalStateException("" + i_2);
            }

            aDecoderContext9549.granuleFrame(aGranulePos9550);
            aDouble9547 = aDecoderContext9549.granuleTime(aGranulePos9550);
            if (aBool9558) {
                boolean bool_3 = oggpacket_1.isKeyFrame() == 1;
                if (!bool_3) {
                    return;
                }

                aBool9558 = false;
            }

            if (!aBool9555 || oggpacket_1.isKeyFrame() == 1) {
                if (aDecoderContext9549.decodeFrame(aFrame9551) != 0) {
                    throw new IllegalStateException("" + i_2);
                }

                aBool9560 = true;
            }
        }

    }

    @Override
    void method13363(OggPacket oggpacket_1) {
        int i_2;
        if (!aBool9554) {
            i_2 = aSetupInfo9559.decodeHeader(aTheoraInfo9546, aTheoraComment9552, oggpacket_1);
            if (i_2 == 0) {
                aBool9554 = true;
                if (aTheoraInfo9546.frameWidth > 2048 || aTheoraInfo9546.frameHeight > 1024) {
                    throw new IllegalStateException();
                }

                aDecoderContext9549 = new DecoderContext(aTheoraInfo9546, aSetupInfo9559);
                aGranulePos9550 = new GranulePos();
                aFrame9551 = new Frame(aTheoraInfo9546.frameWidth, aTheoraInfo9546.frameHeight);
                anInt9556 = aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231 * -1692639633;
                method14790(351513665 * anInt9557 * -986815551);
            } else if (i_2 < 0) {
                throw new IllegalStateException("" + i_2);
            }
        } else {
            aLong9553 = Utils.time() * -3822562485386198145L * 4278118698289560703L;
            i_2 = aDecoderContext9549.decodePacketIn(oggpacket_1, aGranulePos9550);
            if (i_2 < 0) {
                throw new IllegalStateException("" + i_2);
            }

            aDecoderContext9549.granuleFrame(aGranulePos9550);
            aDouble9547 = aDecoderContext9549.granuleTime(aGranulePos9550);
            if (aBool9558) {
                boolean bool_3 = oggpacket_1.isKeyFrame() == 1;
                if (!bool_3) {
                    return;
                }

                aBool9558 = false;
            }

            if (!aBool9555 || oggpacket_1.isKeyFrame() == 1) {
                if (aDecoderContext9549.decodeFrame(aFrame9551) != 0) {
                    throw new IllegalStateException("" + i_2);
                }

                aBool9560 = true;
            }
        }

    }

    @Override
    void method13364() {
        if (aFrame9551 != null) {
            aFrame9551.method6699();
        }

        if (aDecoderContext9549 != null) {
            aDecoderContext9549.method6699();
            aDecoderContext9549 = null;
        }

        if (aGranulePos9550 != null) {
            aGranulePos9550.method6699();
            aGranulePos9550 = null;
        }

        aTheoraInfo9546.method6699();
        aTheoraComment9552.method6699();
        aSetupInfo9559.method6699();
    }

    @Override
    void method13365() {
        if (aFrame9551 != null) {
            aFrame9551.method6699();
        }

        if (aDecoderContext9549 != null) {
            aDecoderContext9549.method6699();
            aDecoderContext9549 = null;
        }

        if (aGranulePos9550 != null) {
            aGranulePos9550.method6699();
            aGranulePos9550 = null;
        }

        aTheoraInfo9546.method6699();
        aTheoraComment9552.method6699();
        aSetupInfo9559.method6699();
    }

}
