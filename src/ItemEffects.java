
/* Class422 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class ItemEffects {
	static final int anInt5016 = 4;
	static final int anInt5017 = 2;
	static final int anInt5018 = 8;
	public short[] aShortArray5019;
	public short[] aShortArray5020;
	public int[] anIntArray5021;
	public int[] anIntArray5022;
	public int[] anIntArray5023;
	static final int anInt5024 = 1;
	public int[] anIntArray5025 = new int[3];
	protected static Class267 aClass267_5026;

	ItemEffects(ItemDefinitions class425) {
		anIntArray5021 = new int[3];
		anIntArray5022 = new int[2];
		anIntArray5023 = new int[2];
		anIntArray5025[0] = -525270939 * ((ItemDefinitions) class425).anInt5066;
		anIntArray5025[1] = ((ItemDefinitions) class425).anInt5100 * -931922913;
		anIntArray5025[2] = ((ItemDefinitions) class425).anInt5070 * -562041407;
		anIntArray5021[0] = -2090968851 * ((ItemDefinitions) class425).anInt5075;
		anIntArray5021[1] = ((ItemDefinitions) class425).anInt5069 * -1259031521;
		anIntArray5021[2] = ((ItemDefinitions) class425).anInt5071 * -1802576377;
		anIntArray5022[0] = -603336817 * ((ItemDefinitions) class425).anInt5096;
		anIntArray5022[1] = ((ItemDefinitions) class425).anInt5079 * -613723223;
		anIntArray5023[0] = ((ItemDefinitions) class425).anInt5080 * -1705416443;
		anIntArray5023[1] = ((ItemDefinitions) class425).anInt5081 * -1871546585;
		if (null != ((ItemDefinitions) class425).aShortArray5039) {
			aShortArray5020 = new short[((ItemDefinitions) class425).aShortArray5039.length];
			System.arraycopy(((ItemDefinitions) class425).aShortArray5039, 0, aShortArray5020, 0, aShortArray5020.length);
		}
		if (((ItemDefinitions) class425).aShortArray5083 != null) {
			aShortArray5019 = new short[((ItemDefinitions) class425).aShortArray5083.length];
			System.arraycopy(((ItemDefinitions) class425).aShortArray5083, 0, aShortArray5019, 0, aShortArray5019.length);
		}
	}

	public static ItemEffects method7040(ItemDefinitions class425, RsByteBuffer class282_sub35) {
		ItemEffects class422 = new ItemEffects(class425);
		int i = class282_sub35.readUnsignedByte();
		boolean bool = (i & 0x1) != 0;
		boolean bool_0_ = 0 != (i & 0x2);
		boolean bool_1_ = 0 != (i & 0x4);
		boolean bool_2_ = (i & 0x8) != 0;
		if (bool) {
			class422.anIntArray5025[0] = class282_sub35.readBigSmart(2139141811);
			class422.anIntArray5021[0] = class282_sub35.readBigSmart(2068675466);
			if (-1 != ((ItemDefinitions) class425).anInt5100 * -931922913 || -1259031521 * ((ItemDefinitions) class425).anInt5069 != -1) {
				class422.anIntArray5025[1] = class282_sub35.readBigSmart(2111055855);
				class422.anIntArray5021[1] = class282_sub35.readBigSmart(2041853750);
			}
			if (-1 != -562041407 * ((ItemDefinitions) class425).anInt5070 || -1 != -1802576377 * ((ItemDefinitions) class425).anInt5071) {
				class422.anIntArray5025[2] = class282_sub35.readBigSmart(2141016611);
				class422.anIntArray5021[2] = class282_sub35.readBigSmart(1979530734);
			}
		}
		if (bool_0_) {
			class422.anIntArray5022[0] = class282_sub35.readBigSmart(2115897274);
			class422.anIntArray5023[0] = class282_sub35.readBigSmart(1991679721);
			if (-1 != -613723223 * ((ItemDefinitions) class425).anInt5079 || -1 != -1871546585 * ((ItemDefinitions) class425).anInt5081) {
				class422.anIntArray5022[1] = class282_sub35.readBigSmart(2078521218);
				class422.anIntArray5023[1] = class282_sub35.readBigSmart(2072485027);
			}
		}
		if (bool_1_) {
			int i_3_ = class282_sub35.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_3_ & 0xf;
			is[1] = i_3_ >> 4 & 0xf;
			is[2] = i_3_ >> 8 & 0xf;
			is[3] = i_3_ >> 12 & 0xf;
			for (int i_4_ = 0; i_4_ < 4; i_4_++) {
				if (is[i_4_] != 15)
					class422.aShortArray5020[is[i_4_]] = (short) class282_sub35.readUnsignedShort();
			}
		}
		if (bool_2_) {
			int i_5_ = class282_sub35.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_5_ & 0xf;
			is[1] = i_5_ >> 4 & 0xf;
			for (int i_6_ = 0; i_6_ < 2; i_6_++) {
				if (15 != is[i_6_])
					class422.aShortArray5019[is[i_6_]] = (short) class282_sub35.readUnsignedShort();
			}
		}
		return class422;
	}

	public static void method7041(byte i) {
		Class468_Sub8.aClass98Array7889 = new Class98[Class388.aClass317_4721.method5618(-989265149)];
		Class218.aBoolArray2709 = new boolean[Class388.aClass317_4721.method5618(-1315651594)];
	}

	public static void method7042(byte i) {
		int i_7_ = Class337.aLinkedList3969.size();
		Iterator iterator = Class337.aLinkedList3969.iterator();
		while (iterator.hasNext()) {
			Class282_Sub18 class282_sub18 = (Class282_Sub18) iterator.next();
			class282_sub18.method12296(class282_sub18.method12275() + (class282_sub18.method12277() / (2 * i_7_)));
			if (!class282_sub18.method12276())
				iterator.remove();
		}
	}

	static final void method7043(CS2Executor class527, int i) {
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1468656099);
		if (null != class282_sub50_sub6) {
			boolean bool = (class282_sub50_sub6.method14775(Class291.anInt3472 + Class427.anInt5123 * -861975801, Class291.anInt3473 + Class475.anInt5624 * 483850921, Class517.anIntArray5900, -1687346032));
			if (bool) {
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class517.anIntArray5900[1];
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class517.anIntArray5900[2];
			} else {
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}
}
