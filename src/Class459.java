import java.awt.Canvas;
import java.lang.reflect.Method;

public final class Class459 {

    int anInt5496;

    int anInt5499;

    byte[] aByteArray5502;

    int anInt5505;

    int anInt5507;

    int anInt5508;

    byte aByte5509;

    int anInt5511;

    int anInt5513;

    int anInt5514;

    int anInt5515;

    int anInt5516;

    int anInt5518;

    int anInt5520;

    byte[] aByteArray5526;

    int anInt5532;

    public static int anInt5534;

    int anInt5498 = 6;

    int anInt5500 = 50;

    int anInt5501 = 18002;

    int anInt5512 = 258;

    int anInt5521 = 16;

    int anInt5522 = 4096;

    int anInt5503;

    int anInt5506;

    int[] anIntArray5517;

    int[] anIntArray5519;

    boolean[] aBoolArray5497;

    boolean[] aBoolArray5510;

    byte[] aByteArray5523;

    byte[] aByteArray5524;

    int[] anIntArray5525;

    byte[] aByteArray5504;

    byte[] aByteArray5527;

    byte[][] aByteArrayArray5528;

    int[][] anIntArrayArray5529;

    int[][] anIntArrayArray5530;

    int[][] anIntArrayArray5531;

    int[] anIntArray5533;

    Class459() {
        this.anInt5521 = 16;
        this.anInt5512 = 258;
        this.anInt5498 = 6;
        this.anInt5500 = 50;
        this.anInt5501 = 18002;
        this.anInt5503 = 0;
        this.anInt5506 = 0;
        this.anIntArray5517 = new int[256];
        this.anIntArray5519 = new int[257];
        this.aBoolArray5497 = new boolean[256];
        this.aBoolArray5510 = new boolean[16];
        this.aByteArray5523 = new byte[256];
        this.aByteArray5524 = new byte[4096];
        this.anIntArray5525 = new int[16];
        this.aByteArray5504 = new byte[18002];
        this.aByteArray5527 = new byte[18002];
        this.aByteArrayArray5528 = new byte[6][258];
        this.anIntArrayArray5529 = new int[6][258];
        this.anIntArrayArray5530 = new int[6][258];
        this.anIntArrayArray5531 = new int[6][258];
        this.anIntArray5533 = new int[6];
    }

    static final void decodeUpdate(boolean bool_0, int i_1) {
        RsBitsBuffer rsbitsbuffer_2 = client.aClass184_7475.recievedBuffer;
        while (rsbitsbuffer_2.readableBits(client.aClass184_7475.anInt2287, 816213370) >= 15) {
            int i_3 = rsbitsbuffer_2.readBits(15, (byte) -53);
            if (i_3 == 32767) {
                break;
            }
            boolean bool_4 = false;
            Class282_Sub47 class282_sub47_5 = (Class282_Sub47) client.NPCS.get((long) i_3);
            NPC npc_6;
            if (class282_sub47_5 == null) {
                npc_6 = new NPC(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1073098599));
                npc_6.anInt10314 = i_3;
                class282_sub47_5 = new Class282_Sub47(npc_6);
                client.NPCS.put(class282_sub47_5, (long) i_3);
                client.aClass282_Sub47Array7209[++client.anInt7210 - 1] = class282_sub47_5;
                bool_4 = true;
            }
            npc_6 = (NPC) class282_sub47_5.anObject8068;
            client.anIntArray7212[++client.anInt7211 - 1] = i_3;
            npc_6.anInt10353 = client.anInt7332;
            if (npc_6.definitions != null && npc_6.definitions.method6886(-1639112398)) {
                Class169.method2876(npc_6, 1280406765);
            }
            int i_7 = rsbitsbuffer_2.readBits(1, (byte) -14);
            if (i_7 == 1) {
                client.NPC_INDICES[++client.npcListSize - 1] = i_3;
            }
            int i_8;
            if (bool_0) {
                i_8 = rsbitsbuffer_2.readBits(8, (byte) 53);
                if (i_8 > 127) {
                    i_8 -= 256;
                }
            } else {
                i_8 = rsbitsbuffer_2.readBits(5, (byte) -4);
                if (i_8 > 15) {
                    i_8 -= 32;
                }
            }
            int i_9 = rsbitsbuffer_2.readBits(3, (byte) -25) + 4 << 11 & 0x3fff;
            npc_6.method16166(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(rsbitsbuffer_2.readBits(15, (byte) 78), (byte) -40), -1917205540);
            int i_10;
            if (bool_0) {
                i_10 = rsbitsbuffer_2.readBits(8, (byte) -6);
                if (i_10 > 127) {
                    i_10 -= 256;
                }
            } else {
                i_10 = rsbitsbuffer_2.readBits(5, (byte) 32);
                if (i_10 > 15) {
                    i_10 -= 32;
                }
            }
            int i_11 = rsbitsbuffer_2.readBits(1, (byte) 80);
            int i_12 = rsbitsbuffer_2.readBits(2, (byte) 49);
            npc_6.method15836(npc_6.definitions.anInt4858, (byte) -107);
            npc_6.anInt10340 = npc_6.definitions.anInt4889 << 3;
            if (bool_4) {
                npc_6.method15791(i_9, true, (byte) -43);
            }
            npc_6.method16159(i_12, Class84.myPlayer.regionBaseX[0] + i_10, Class84.myPlayer.regionBaseY[0] + i_8, i_11 == 1, npc_6.getSize(828768449), -1655892623);
            if (npc_6.definitions.method6886(-1862040818)) {
                Class397.method6775(npc_6.plane, npc_6.regionBaseX[0], npc_6.regionBaseY[0], 0, (ObjectDefinitions) null, npc_6, (Player) null, 386204149);
            }
        }
        rsbitsbuffer_2.finishBitAccess((byte) 35);
    }

    static void method7678(int i_0) {
        Class122.method2111(false, 662490589);
        if (Class291_Sub1.anInt8021 >= 0 && Class291_Sub1.anInt8021 != 0) {
            ParticleProducer.method11500(Class291_Sub1.anInt8021, false, (byte) 24);
            Class291_Sub1.anInt8021 = -1;
        }
    }

    public static void method7679(Canvas canvas_0, int i_1) {
        try {
            Class class_2 = Class.forName("java.awt.Canvas");
            Method method_3 = class_2.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
            method_3.invoke(canvas_0, new Object[] { Boolean.TRUE });
        } catch (Exception exception_4) {
            ;
        }
    }
}
