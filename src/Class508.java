/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class508 {
	public int anInt6214;
	Class243 aClass243_6215;
	public static Class162 aClass162_6216;

	public Class508(Class411 class411, Class429 class429, Class243 class243) {
		new Class348(64);
		((Class508) this).aClass243_6215 = class243;
		anInt6214 = (((Class508) this).aClass243_6215.method2316((-1006924897 * (Class120.aClass120_1420.anInt1460)), -2127064505) * 809853823);
	}

	static final void method6278(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_1_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class359.method4291((((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242.aClass119_10131), i_0_ & 0xffff, i_1_, i_2_, ((ClientScript2) class403).aBoolean5261, class403, 2022077336);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.aoo(").append(')').toString());
		}
	}

	static final void method6279(boolean bool, int i) {
		try {
			RsBitsBuffer stream = ((BufferedConnectionContext) client.gameConnection).stream;
			for (;;) {
				if (stream.method3660((-866602563 * (((BufferedConnectionContext) client.gameConnection).anInt336)), (byte) -70) < 15) {
					if (i != 596994841)
						break;
					return;
				}
				int i_3_ = stream.readBits(15);
				if (32767 == i_3_) {
					if (i == 596994841) {
						/* empty */
					}
					break;
				}
				boolean bool_4_ = false;
				Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_3_));
				if (class298_sub29 == null) {
					NPC class365_sub1_sub1_sub2_sub1 = (new NPC(client.aClass283_8716.method2675(-1611682495)));
					class365_sub1_sub1_sub2_sub1.anInt10064 = 1714292119 * i_3_;
					class298_sub29 = new Class298_Sub29(class365_sub1_sub1_sub2_sub1);
					client.npcs.method5817(class298_sub29, (long) i_3_);
					client.aClass298_Sub29Array8816[(client.anInt8772 += -118843751) * 1962237353 - 1] = class298_sub29;
					bool_4_ = true;
				}
				NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
				client.anIntArray8699[(client.anInt8703 += -409937273) * -1230451913 - 1] = i_3_;
				class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * client.anInt8707;
				if (null != class365_sub1_sub1_sub2_sub1.aClass503_10190 && class365_sub1_sub1_sub2_sub1.aClass503_10190.method6242((byte) 88))
					Class244.method2330(class365_sub1_sub1_sub2_sub1, (byte) 40);
				int i_5_ = (stream.readBits(3) + 4 << 11 & 0x3fff);
				int i_6_;
				if (bool) {
					i_6_ = stream.readBits(8);
					if (i_6_ > 127)
						i_6_ -= 256;
				} else {
					i_6_ = stream.readBits(5);
					if (i_6_ > 15)
						i_6_ -= 32;
				}
				class365_sub1_sub1_sub2_sub1.method4464((Class15.aClass507_224.method6269(stream.readBits(15), 229452067)), 1407104224);
				int i_7_;
				if (bool) {
					i_7_ = stream.readBits(8);
					if (i_7_ > 127)
						i_7_ -= 256;
				} else {
					i_7_ = stream.readBits(5);
					if (i_7_ > 15)
						i_7_ -= 32;
				}
				int i_8_ = stream.readBits(2);
				int i_9_ = stream.readBits(1);
				if (i_9_ == 1)
					client.anIntArray8706[(client.anInt8808 += -386992021) * -976358333 - 1] = i_3_;
				int i_10_ = stream.readBits(1);
				class365_sub1_sub1_sub2_sub1.setSizeOffset(-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187), -1253182390);
				class365_sub1_sub1_sub2_sub1.anInt10115 = (-1186616623 * (-1927065533 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6181) << 3));
				if (bool_4_)
					class365_sub1_sub1_sub2_sub1.method4415(i_5_, true, -2079607043);
				class365_sub1_sub1_sub2_sub1.method4456(i_8_, i_7_ + (Class287.myPlayer.scenePositionXQueue[0]), i_6_ + (Class287.myPlayer.scenePositionYQueue[0]), 1 == i_10_, class365_sub1_sub1_sub2_sub1.getSize(), (byte) 58);
				if (class365_sub1_sub1_sub2_sub1.aClass503_10190.method6242((byte) -9))
					Class391.method4884(class365_sub1_sub1_sub2_sub1.plane, (class365_sub1_sub1_sub2_sub1.scenePositionXQueue[0]), (class365_sub1_sub1_sub2_sub1.scenePositionYQueue[0]), 0, null, class365_sub1_sub1_sub2_sub1, null, (byte) -66);
			}
			stream.finishBitAccess((byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.jo(").append(')').toString());
		}
	}

	static final void method6280(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class495.method6195((byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.acr(").append(')').toString());
		}
	}

	public static void method6281(int i, int i_11_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(20, (long) i);
			class298_sub37_sub12.method3445(-1607796466);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.ax(").append(')').toString());
		}
	}

	static void method6282(int i, boolean bool, int i_12_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(22, (long) i);
			class298_sub37_sub12.method3449((byte) 61);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = (bool ? 1 : 0) * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uz.ai(").append(')').toString());
		}
	}
}
