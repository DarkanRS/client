
/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

public final class Class459 {
	int anInt5496;
	boolean[] aBoolArray5497;
	int anInt5498 = 6;
	int anInt5499;
	int anInt5500 = 50;
	int anInt5501 = 18002;
	byte[] aByteArray5502;
	int anInt5503;
	byte[] aByteArray5504;
	int anInt5505;
	int anInt5506;
	int anInt5507;
	int anInt5508;
	byte aByte5509;
	boolean[] aBoolArray5510;
	int anInt5511;
	int anInt5512 = 258;
	int anInt5513;
	int anInt5514;
	int anInt5515;
	int anInt5516;
	int[] anIntArray5517;
	int anInt5518;
	int[] anIntArray5519;
	int anInt5520;
	int anInt5521 = 16;
	int anInt5522 = 4096;
	byte[] aByteArray5523;
	byte[] aByteArray5524;
	int[] anIntArray5525;
	byte[] aByteArray5526;
	byte[] aByteArray5527;
	byte[][] aByteArrayArray5528;
	int[][] anIntArrayArray5529;
	int[][] anIntArrayArray5530;
	int[][] anIntArrayArray5531;
	int anInt5532;
	int[] anIntArray5533;
	public static int anInt5534;

	Class459() {
		((Class459) this).anInt5521 = 16;
		((Class459) this).anInt5512 = 258;
		((Class459) this).anInt5498 = 6;
		((Class459) this).anInt5500 = 50;
		((Class459) this).anInt5501 = 18002;
		((Class459) this).anInt5503 = 0;
		((Class459) this).anInt5506 = 0;
		((Class459) this).anIntArray5517 = new int[256];
		((Class459) this).anIntArray5519 = new int[257];
		((Class459) this).aBoolArray5497 = new boolean[256];
		((Class459) this).aBoolArray5510 = new boolean[16];
		((Class459) this).aByteArray5523 = new byte[256];
		((Class459) this).aByteArray5524 = new byte[4096];
		((Class459) this).anIntArray5525 = new int[16];
		((Class459) this).aByteArray5504 = new byte[18002];
		((Class459) this).aByteArray5527 = new byte[18002];
		((Class459) this).aByteArrayArray5528 = new byte[6][258];
		((Class459) this).anIntArrayArray5529 = new int[6][258];
		((Class459) this).anIntArrayArray5530 = new int[6][258];
		((Class459) this).anIntArrayArray5531 = new int[6][258];
		((Class459) this).anIntArray5533 = new int[6];
	}

	static final void method7676(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		int i_0_ = -1;
		int i_1_ = -1;
		Class119 class119 = class118.method2046(Renderers.SOFTWARE_RENDERER, 1887351094);
		if (class119 != null) {
			i_0_ = class119.anInt1458 * -1125753931;
			i_1_ = class119.anInt1454 * 2069222845;
		}
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_0_;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_1_;
	}

	static final void decodeUpdate(boolean largeSceneView, int i) {
		RsBitsBuffer buffer = ((Class184) client.aClass184_7475).aClass282_Sub35_Sub2_2284;
		while (buffer.readableBits((715663393 * (((Class184) client.aClass184_7475).anInt2287)), 816213370) >= 15) {
			int npcIndex = buffer.readBits(15, (byte) -53);
			if (32767 == npcIndex)
				break;
			boolean bool_3_ = false;
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) npcIndex));
			if (class282_sub47 == null) {
				NPC npc = (new NPC(client.aClass257_7353.method4430(-1073098599)));
				npc.anInt10314 = npcIndex * -1498872675;
				class282_sub47 = new Class282_Sub47(npc);
				client.aClass465_7208.method7765(class282_sub47, (long) npcIndex);
				client.aClass282_Sub47Array7209[(client.anInt7210 += -1228117803) * 1658163325 - 1] = class282_sub47;
				bool_3_ = true;
			}
			NPC npc = (NPC) class282_sub47.anObject8068;
			client.anIntArray7212[(client.anInt7211 += 1568892417) * -685729279 - 1] = npcIndex;
			npc.anInt10353 = -2017074209 * client.anInt7332;
			if (null != npc.aClass409_10580 && npc.aClass409_10580.method6886(-1639112398))
				Class169.method2876(npc, 1280406765);
			int needsUpdate = buffer.readBits(1, (byte) -14);
			if (1 == needsUpdate)
				client.NPC_INDICES[(client.npcListSize += -1510626643) * -1300281051 - 1] = npcIndex;
			int localY;
			if (largeSceneView) {
				localY = buffer.readBits(8, (byte) 53);
				if (localY > 127)
					localY -= 256;
			} else {
				localY = buffer.readBits(5, (byte) -4);
				if (localY > 15)
					localY -= 32;
			}
			int direction = (buffer.readBits(3, (byte) -25) + 4 << 11 & 0x3fff);
			npc.method16166((Class350_Sub1.aClass406_7757.method6828(buffer.readBits(15, (byte) 78), (byte) -40)), -1917205540);
			int localX;
			if (largeSceneView) {
				localX = buffer.readBits(8, (byte) -6);
				if (localX > 127)
					localX -= 256;
			} else {
				localX = buffer.readBits(5, (byte) 32);
				if (localX > 15)
					localX -= 32;
			}
			int hasTeleported = buffer.readBits(1, (byte) 80);
			int plane = buffer.readBits(2, (byte) 49);
			npc.method15836((1203434505 * npc.aClass409_10580.anInt4858), (byte) -107);
			npc.anInt10340 = -222526911 * ((npc.aClass409_10580.anInt4889) * 1913503455 << 3);
			if (bool_3_)
				npc.method15791(direction, true, (byte) -43);
			npc.method16159(plane, (Class84.myPlayer.regionBaseX[0] + localX), (Class84.myPlayer.regionBaseY[0] + localY), hasTeleported == 1, npc.method15805(828768449), -1655892623);
			if (npc.aClass409_10580.method6886(-1862040818))
				Class397.method6775(npc.aByte7967, (npc.regionBaseX[0]), (npc.regionBaseY[0]), 0, null, npc, null, 386204149);
		}
		buffer.finishBitAccess((byte) 35);
	}

	static void method7678(int i) {
		Class122.method2111(false, 662490589);
		if (Class291_Sub1.anInt8021 * 1337065231 >= 0 && 0 != 1337065231 * Class291_Sub1.anInt8021) {
			Class538.method11500(Class291_Sub1.anInt8021 * 1337065231, false, (byte) 24);
			Class291_Sub1.anInt8021 = -923733999;
		}
	}

	public static void method7679(Canvas canvas, int i) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}
}
