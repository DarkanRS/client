/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class506 {
	static Class223 aClass223_5857 = new Class223(128);
	static int anInt5858;

	Class506() throws Throwable {
		throw new Error();
	}

	static final void method8714(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class175.method2960(class118, class98, class527, 1306300088);
	}

	static final void method8715(CS2Executor class527, int i) {
		int i_10_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_10_, (byte) 60);
		Class199.method3251(class118, class527, 1146866687);
	}

	static final void method8716(CS2Executor class527, byte i) {
		int i_11_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		int i_12_ = client.aClass330Array7428[i_11_].method5908(-12393301);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 2 == i_12_ ? 1 : 0;
	}

	static final void method8717(CS2Executor class527, int i) {
		String string;
		if (null != Class84.myPlayer && null != Class84.myPlayer.username)
			string = Class84.myPlayer.method16127(true, 2008342545);
		else
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method8718(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.aClass191_7008 = new Class191(string, true);
	}

	static final void method8719(CS2Executor class527, byte i) {
		class527.intStackPtr -= 425673003;
		long l = (long) (class527.intStack[1942118537 * class527.intStackPtr]);
		long l_13_ = (long) (class527.intStack[class527.intStackPtr * 1942118537 + 1]);
		long l_14_ = (long) (class527.intStack[1942118537 * class527.intStackPtr + 2]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) (l_14_ * l / l_13_);
	}

	static final void method8720(CS2Executor class527, int i) {
		int i_15_ = (class527.intOpValues[301123709 * class527.instrPtr]);
		int i_16_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (i_16_ < 0 || i_16_ >= class527.globalArrayLengths[i_15_])
			throw new RuntimeException();
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class527.globalArrays[i_15_][i_16_];
	}

	public static MeshModifier decodeItemEffects(ItemDefinitions class425, RsByteBuffer stream, int i) {
		MeshModifier class422 = new MeshModifier(class425);
		int flags = stream.readUnsignedByte();
		boolean modifyModel = (flags & 0x1) != 0;
		boolean bool_18_ = 0 != (flags & 0x2);
		boolean modifyModelColors = 0 != (flags & 0x4);
		boolean bool_20_ = (flags & 0x8) != 0;
		if (modifyModel) {
			class422.maleBody[0] = stream.readBigSmart();
			class422.femaleBody[0] = stream.readBigSmart();
			if (-1 != ((ItemDefinitions) class425).maleBody2 * -931922913 || -1259031521 * ((ItemDefinitions) class425).femaleBody2 != -1) {
				class422.maleBody[1] = stream.readBigSmart();
				class422.femaleBody[1] = stream.readBigSmart();
			}
			if (-1 != -562041407 * ((ItemDefinitions) class425).maleBody3 || -1 != -1802576377 * ((ItemDefinitions) class425).femaleBody3) {
				class422.maleBody[2] = stream.readBigSmart();
				class422.femaleBody[2] = stream.readBigSmart();
			}
		}
		if (bool_18_) {
			class422.maleHeads[0] = stream.readBigSmart();
			class422.femaleHeads[0] = stream.readBigSmart();
			if (-1 != -613723223 * ((ItemDefinitions) class425).maleHead2 || -1 != -1871546585 * ((ItemDefinitions) class425).femaleHead2) {
				class422.maleHeads[1] = stream.readBigSmart();
				class422.femaleHeads[1] = stream.readBigSmart();
			}
		}
		if (modifyModelColors) {
			int flag = stream.readUnsignedShort();
			int[] slots = new int[4];
			slots[0] = flag & 0xf;
			slots[1] = flag >> 4 & 0xf;
			slots[2] = flag >> 8 & 0xf;
			slots[3] = flag >> 12 & 0xf;
			for (int slotId = 0; slotId < 4; slotId++) {
				if (slots[slotId] != 15) {
					class422.modifiedColors[slots[slotId]] = (short) stream.readUnsignedShort();
				}
			}
		}
		if (bool_20_) {
			int i_23_ = stream.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_23_ & 0xf;
			is[1] = i_23_ >> 4 & 0xf;
			for (int i_24_ = 0; i_24_ < 2; i_24_++) {
				if (15 != is[i_24_])
					class422.modifiedTextures[is[i_24_]] = (short) stream.readUnsignedShort();
			}
		}
		return class422;
	}

	static void method8722(int i, int i_25_, int i_26_, int i_27_, int i_28_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(18, (long) i_25_ << 32 | (long) i);
		class282_sub50_sub12.method14995(540803591);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = -1773141545 * i_26_;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9641 = 717659479 * i_27_;
	}
}
