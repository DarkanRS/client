package com.jagex;

public class TextureDetails {

    public boolean isGroundMesh;
    public boolean repeatT;
    public byte effectId;
    public boolean isHalfSize;
    public boolean skipTriangles;
    public short color;
    public int blendType;
    public byte effectParam1;
    public int effectParam2;
    public byte shadowFactor;
    public byte brightness;
    public byte textureSpeedU;
    public boolean isBrickTile;
    public boolean repeatS;
    public boolean aBool2087;
    public byte useMipmaps;
    public boolean hdr;
    public byte textureSpeedV;
    public int combineMode;

    public static boolean method2875(int i_0, int i_1) {
        return i_0 == 13 || i_0 == 18 || i_0 == 12;
    }

    public static void method2876(NPC npc_0) {
        for (Node_Sub48 class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass482_8074.head(); class282_sub48_2 != null; class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass482_8074.next(1114732326)) {
            if (class282_sub48_2.aTransform_Sub1_Sub1_Sub2_Sub2_8085 == npc_0) {
                if (class282_sub48_2.aNode_Sub15_Sub5_8099 != null) {
                    Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_2.aNode_Sub15_Sub5_8099);
                    class282_sub48_2.aNode_Sub15_Sub5_8099 = null;
                }
                class282_sub48_2.remove();
                break;
            }
        }
    }

    public static void method2877(Interface45 interface45_0) {
        if (IcmpService_Sub1.anIcmpService_Sub1_7964 == null) {
            throw new IllegalStateException("");
        } else {
            IcmpService_Sub1.anIcmpService_Sub1_7964.aList7962.add(interface45_0);
        }
    }
}
