package com.jagex;

public class SoftwareItemRender implements Interface18 {

    int outlineSize;

    int itemAmount;

    int itemId;

    int rendererId;

    int shadowColor;

    int renderStack;

    boolean hasPlayerAppearance;

    static Class149_Sub4 method7033(ByteBuf rsbytebuffer_0) {
        return new Class149_Sub4(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
    }

    public static void method7034(AnimationDefinitions defs, int i_1) {
        if (Class260.SOUNDS_SIZE < 50 && defs != null && defs.anIntArrayArray5913 != null && i_1 < defs.anIntArrayArray5913.length && defs.anIntArrayArray5913[i_1] != null) {
            int i_3 = defs.anIntArrayArray5913[i_1][0];
            int soundID = i_3 >> 8;
            int i_5 = i_3 >> 5 & 0x7;
            int i_6;
            if (defs.anIntArrayArray5913[i_1].length > 1) {
                i_6 = (int) (Math.random() * defs.anIntArrayArray5913[i_1].length);
                if (i_6 > 0) {
                    soundID = defs.anIntArrayArray5913[i_1][i_6];
                }
            }
            i_6 = 256;
            if (defs.anIntArray5927 != null && defs.anIntArray5919 != null) {
                i_6 = Class76.method1356(defs.anIntArray5927[i_1], defs.anIntArray5919[i_1]);
            }
            int i_7 = defs.anIntArray5926 == null ? 255 : defs.anIntArray5926[i_1];
            if (defs.aBool5928) {
                Class435.playSoundVorbis(soundID, i_5, 0, i_7, false, i_6);
            } else {
                VarNPCMap.playSoundSynth(soundID, i_5, 0, i_7, i_6);
            }
        }
    }

    static boolean method7035(char var_0) {
        return var_0 == 160 || var_0 == 32 || var_0 == 95 || var_0 == 45;
    }

    @Override
    public boolean method132(Interface18 interface18_1) {
        if (!(interface18_1 instanceof SoftwareItemRender)) {
            return false;
        } else {
            SoftwareItemRender softwareitemrender_2 = (SoftwareItemRender) interface18_1;
            return softwareitemrender_2.rendererId * 785163709 * 362003861 == rendererId * 785163709 * 362003861 && (-2122717931 * softwareitemrender_2.itemId * 412172861 == -2122717931 * itemId * 412172861 && (softwareitemrender_2.itemAmount * -1802585529 * 716754807 == 716754807 * itemAmount * -1802585529 && (outlineSize * -1113099245 * -1886226917 == -1886226917 * softwareitemrender_2.outlineSize * -1113099245 && (442868743 * softwareitemrender_2.shadowColor * -621770313 == shadowColor * -621770313 * 442868743 && (softwareitemrender_2.renderStack * -190647633 * -1317952433 == -1317952433 * renderStack * -190647633 && softwareitemrender_2.hasPlayerAppearance == hasPlayerAppearance)))));
        }
    }

    @Override
    public boolean method131(Interface18 interface18_1) {
        if (!(interface18_1 instanceof SoftwareItemRender)) {
            return false;
        } else {
            SoftwareItemRender softwareitemrender_2 = (SoftwareItemRender) interface18_1;
            return softwareitemrender_2.rendererId == rendererId && (softwareitemrender_2.itemId == itemId && (softwareitemrender_2.itemAmount == itemAmount && (outlineSize == softwareitemrender_2.outlineSize && (softwareitemrender_2.shadowColor == shadowColor && (softwareitemrender_2.renderStack == renderStack && softwareitemrender_2.hasPlayerAppearance == hasPlayerAppearance)))));
        }
    }

    @Override
    public long method109() {
        long[] longs_1 = ByteBuf.aLongArray7979;
        long long_2 = -1L;
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (362003861 * rendererId * 785163709)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (-2122717931 * itemId * 412172861 >> 8)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (-2122717931 * itemId * 412172861)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (716754807 * itemAmount * -1802585529 >> 24)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (716754807 * itemAmount * -1802585529 >> 16)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (716754807 * itemAmount * -1802585529 >> 8)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount * -1802585529 * 716754807)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (-1886226917 * outlineSize * -1113099245)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (442868743 * shadowColor * -621770313 >> 24)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor * -621770313 * 442868743 >> 16)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (442868743 * shadowColor * -621770313 >> 8)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (442868743 * shadowColor * -621770313)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (-1317952433 * renderStack * -190647633)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (hasPlayerAppearance ? 1 : 0)) & 0xffL)];
        return long_2;
    }

    @Override
    public long method130() {
        long[] longs_1 = ByteBuf.aLongArray7979;
        long long_2 = -1L;
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ rendererId) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemId >> 8)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ itemId) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount >> 24)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount >> 16)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount >> 8)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ itemAmount) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ outlineSize) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor >> 24)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor >> 16)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor >> 8)) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ shadowColor) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ renderStack) & 0xffL)];
        long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (hasPlayerAppearance ? 1 : 0)) & 0xffL)];
        return long_2;
    }

    @Override
    public boolean method133(Interface18 interface18_1) {
        if (!(interface18_1 instanceof SoftwareItemRender)) {
            return false;
        } else {
            SoftwareItemRender softwareitemrender_2 = (SoftwareItemRender) interface18_1;
            return softwareitemrender_2.rendererId * 785163709 * 362003861 == rendererId * 785163709 * 362003861 && (-2122717931 * softwareitemrender_2.itemId * 412172861 == -2122717931 * itemId * 412172861 && (softwareitemrender_2.itemAmount * -1802585529 * 716754807 == 716754807 * itemAmount * -1802585529 && (outlineSize * -1113099245 * -1886226917 == -1886226917 * softwareitemrender_2.outlineSize * -1113099245 && (442868743 * softwareitemrender_2.shadowColor * -621770313 == shadowColor * -621770313 * 442868743 && (softwareitemrender_2.renderStack * -190647633 * -1317952433 == -1317952433 * renderStack * -190647633 && softwareitemrender_2.hasPlayerAppearance == hasPlayerAppearance)))));
        }
    }

    @Override
    public boolean method134(Interface18 interface18_1) {
        if (!(interface18_1 instanceof SoftwareItemRender)) {
            return false;
        } else {
            SoftwareItemRender softwareitemrender_2 = (SoftwareItemRender) interface18_1;
            return softwareitemrender_2.rendererId * 785163709 * 362003861 == rendererId * 785163709 * 362003861 && (-2122717931 * softwareitemrender_2.itemId * 412172861 == -2122717931 * itemId * 412172861 && (softwareitemrender_2.itemAmount * -1802585529 * 716754807 == 716754807 * itemAmount * -1802585529 && (outlineSize * -1113099245 * -1886226917 == -1886226917 * softwareitemrender_2.outlineSize * -1113099245 && (442868743 * softwareitemrender_2.shadowColor * -621770313 == shadowColor * -621770313 * 442868743 && (softwareitemrender_2.renderStack * -190647633 * -1317952433 == -1317952433 * renderStack * -190647633 && softwareitemrender_2.hasPlayerAppearance == hasPlayerAppearance)))));
        }
    }
}
