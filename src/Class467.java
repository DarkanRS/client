/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class467 {
	Class467() throws Throwable {
		throw new Error();
	}

	static final void method6023(int i) {
		try {
			RsBitsBuffer stream = ((BufferedConnectionContext) client.gameConnection).stream;
			stream.initBitAccess(1157167964);
			int i_0_ = stream.readBits(8);
			if (i_0_ < client.anInt8703 * -1230451913) {
				for (int i_1_ = i_0_; i_1_ < -1230451913 * client.anInt8703; i_1_++)
					client.anIntArray8709[(client.anInt8708 += 107511579) * -1508392173 - 1] = client.anIntArray8699[i_1_];
			}
			if (i_0_ > client.anInt8703 * -1230451913)
				throw new RuntimeException();
			client.anInt8703 = 0;
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				int i_3_ = client.anIntArray8699[i_2_];
				NPC npc = ((NPC) (((Class298_Sub29) client.npcs.get((long) i_3_)).anObject7366));
				int i_4_ = stream.readBits(1);
				if (i_4_ == 0) {
					client.anIntArray8699[(client.anInt8703 += -409937273) * -1230451913 - 1] = i_3_;
					npc.anInt10075 = -3704423 * client.anInt8707;
				} else {
					int i_5_ = stream.readBits(2);
					if (0 == i_5_) {
						client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_3_;
						npc.anInt10075 = -3704423 * client.anInt8707;
						client.anIntArray8706[(client.anInt8808 += -386992021) * -976358333 - 1] = i_3_;
					} else if (1 == i_5_) {
						client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_3_;
						npc.anInt10075 = client.anInt8707 * -3704423;
						Class274 class274 = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-2130206915), stream.readBits(3), (byte) 2)));
						npc.method4455(class274, Class282.aClass282_6540.aByte6542, (short) 32767);
						int i_6_ = stream.readBits(1);
						if (1 == i_6_)
							client.anIntArray8706[((client.anInt8808 += -386992021) * -976358333 - 1)] = i_3_;
					} else if (i_5_ == 2) {
						client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_3_;
						npc.anInt10075 = -3704423 * client.anInt8707;
						if (stream.readBits(1) == 1) {
							Class274 class274 = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-2113999549), stream.readBits(3), (byte) 2)));
							npc.method4455(class274, Class282.aClass282_6541.aByte6542, (short) 32767);
							Class274 class274_7_ = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-1890825389), stream.readBits(3), (byte) 2)));
							npc.method4455(class274_7_, Class282.aClass282_6541.aByte6542, (short) 32767);
						} else {
							Class274 class274 = ((Class274) (Class422_Sub20.method5701(Class299.method3680(-2012553016), stream.readBits(3), (byte) 2)));
							npc.method4455(class274, Class282.aClass282_6545.aByte6542, (short) 32767);
						}
						int i_8_ = stream.readBits(1);
						if (1 == i_8_)
							client.anIntArray8706[((client.anInt8808 += -386992021) * -976358333 - 1)] = i_3_;
					} else if (i_5_ == 3)
						client.anIntArray8709[(client.anInt8708 += 107511579) * -1508392173 - 1] = i_3_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tg.jn(").append(')').toString());
		}
	}

	static final void method6024(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]);
			ClientScript class298_sub37_sub17 = Class216.getClientScript(i_9_, (byte) 1);
			if (null == class298_sub37_sub17)
				throw new RuntimeException();
			int[] is = new int[class298_sub37_sub17.anInt9679 * -1516159487];
			Object[] objects = new Object[1787035509 * class298_sub37_sub17.anInt9680];
			long[] ls = new long[class298_sub37_sub17.anInt9681 * 1679522843];
			for (int i_10_ = 0; i_10_ < class298_sub37_sub17.anInt9682 * -1249619929; i_10_++)
				is[i_10_] = (((ClientScript2) class403).anIntArray5244[(681479919 * ((ClientScript2) class403).anInt5239 - -1249619929 * class298_sub37_sub17.anInt9682 + i_10_)]);
			for (int i_11_ = 0; i_11_ < 2027436935 * class298_sub37_sub17.anInt9674; i_11_++)
				objects[i_11_] = (((ClientScript2) class403).anObjectArray5240[(i_11_ + (-203050393 * ((ClientScript2) class403).anInt5241 - 2027436935 * class298_sub37_sub17.anInt9674))]);
			for (int i_12_ = 0; i_12_ < class298_sub37_sub17.anInt9684 * -1520504699; i_12_++)
				ls[i_12_] = (((ClientScript2) class403).aLongArray5251[(i_12_ + (1685767703 * ((ClientScript2) class403).anInt5245 - class298_sub37_sub17.anInt9684 * -1520504699))]);
			((ClientScript2) class403).anInt5239 -= -238333367 * class298_sub37_sub17.anInt9682;
			((ClientScript2) class403).anInt5241 -= 258390497 * class298_sub37_sub17.anInt9674;
			((ClientScript2) class403).anInt5245 -= class298_sub37_sub17.anInt9684 * 1071348675;
			Class402 class402 = new Class402();
			((Class402) class402).aClass298_Sub37_Sub17_5229 = ((ClientScript2) class403).aClass298_Sub37_Sub17_5260;
			((Class402) class402).anInt5226 = -985206291 * ((ClientScript2) class403).anInt5259;
			((Class402) class402).anIntArray5228 = ((ClientScript2) class403).anIntArray5248;
			((Class402) class402).anObjectArray5231 = ((ClientScript2) class403).anObjectArray5234;
			((Class402) class402).aLongArray5230 = ((ClientScript2) class403).aLongArray5235;
			if (((ClientScript2) class403).anInt5250 * -932179775 >= ((ClientScript2) class403).aClass402Array5249.length)
				throw new RuntimeException();
			((ClientScript2) class403).aClass402Array5249[((((ClientScript2) class403).anInt5250 += 373063489) * -932179775 - 1)] = class402;
			((ClientScript2) class403).aClass298_Sub37_Sub17_5260 = class298_sub37_sub17;
			((ClientScript2) class403).aClass394Array5258 = (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.aClass394Array9675);
			((ClientScript2) class403).anIntArray5257 = (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.anIntArray9676);
			((ClientScript2) class403).anInt5259 = -286750741;
			((ClientScript2) class403).anIntArray5248 = is;
			((ClientScript2) class403).anObjectArray5234 = objects;
			((ClientScript2) class403).aLongArray5235 = ls;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tg.ay(").append(')').toString());
		}
	}
}
