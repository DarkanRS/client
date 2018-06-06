
/* Class422 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class MeshModifier {
	static final int anInt5016 = 4;
	static final int anInt5017 = 2;
	static final int anInt5018 = 8;
	public short[] modifiedTextures;
	public short[] modifiedColors;
	public int[] femaleBody;
	public int[] maleHeads;
	public int[] femaleHeads;
	static final int anInt5024 = 1;
	public int[] maleBody = new int[3];
	protected static Class267 aClass267_5026;

	MeshModifier(ItemDefinitions class425) {
		femaleBody = new int[3];
		maleHeads = new int[2];
		femaleHeads = new int[2];
		maleBody[0] = -525270939 * ((ItemDefinitions) class425).maleBody1;
		maleBody[1] = ((ItemDefinitions) class425).maleBody2 * -931922913;
		maleBody[2] = ((ItemDefinitions) class425).maleBody3 * -562041407;
		femaleBody[0] = -2090968851 * ((ItemDefinitions) class425).femaleBody1;
		femaleBody[1] = ((ItemDefinitions) class425).femaleBody2 * -1259031521;
		femaleBody[2] = ((ItemDefinitions) class425).femaleBody3 * -1802576377;
		maleHeads[0] = -603336817 * ((ItemDefinitions) class425).maleHead1;
		maleHeads[1] = ((ItemDefinitions) class425).maleHead2 * -613723223;
		femaleHeads[0] = ((ItemDefinitions) class425).femaleHead1 * -1705416443;
		femaleHeads[1] = ((ItemDefinitions) class425).femaleHead2 * -1871546585;
		if (null != ((ItemDefinitions) class425).modifiedColors) {
			modifiedColors = new short[((ItemDefinitions) class425).modifiedColors.length];
			System.arraycopy(((ItemDefinitions) class425).modifiedColors, 0, modifiedColors, 0, modifiedColors.length);
		}
		if (((ItemDefinitions) class425).modifiedTextures != null) {
			modifiedTextures = new short[((ItemDefinitions) class425).modifiedTextures.length];
			System.arraycopy(((ItemDefinitions) class425).modifiedTextures, 0, modifiedTextures, 0, modifiedTextures.length);
		}
	}

	public static MeshModifier method7040(ItemDefinitions class425, RsByteBuffer class282_sub35) {
		MeshModifier class422 = new MeshModifier(class425);
		int i = class282_sub35.readUnsignedByte();
		boolean modifyWearModel = (i & 0x1) != 0;
		boolean modifyHeadModel = 0 != (i & 0x2);
		boolean modifyColors = 0 != (i & 0x4);
		boolean modifyTextures = (i & 0x8) != 0;
		if (modifyWearModel) {
			class422.maleBody[0] = class282_sub35.readBigSmart();
			class422.femaleBody[0] = class282_sub35.readBigSmart();
			if (-1 != ((ItemDefinitions) class425).maleBody2 * -931922913 || -1259031521 * ((ItemDefinitions) class425).femaleBody2 != -1) {
				class422.maleBody[1] = class282_sub35.readBigSmart();
				class422.femaleBody[1] = class282_sub35.readBigSmart();
			}
			if (-1 != -562041407 * ((ItemDefinitions) class425).maleBody3 || -1 != -1802576377 * ((ItemDefinitions) class425).femaleBody3) {
				class422.maleBody[2] = class282_sub35.readBigSmart();
				class422.femaleBody[2] = class282_sub35.readBigSmart();
			}
		}
		if (modifyHeadModel) {
			class422.maleHeads[0] = class282_sub35.readBigSmart();
			class422.femaleHeads[0] = class282_sub35.readBigSmart();
			if (-1 != -613723223 * ((ItemDefinitions) class425).maleHead2 || -1 != -1871546585 * ((ItemDefinitions) class425).femaleHead2) {
				class422.maleHeads[1] = class282_sub35.readBigSmart();
				class422.femaleHeads[1] = class282_sub35.readBigSmart();
			}
		}
		if (modifyColors) {
			int i_3_ = class282_sub35.readUnsignedShort();
			int[] is = new int[4];
			is[0] = i_3_ & 0xf;
			is[1] = i_3_ >> 4 & 0xf;
			is[2] = i_3_ >> 8 & 0xf;
			is[3] = i_3_ >> 12 & 0xf;
			for (int i_4_ = 0; i_4_ < 4; i_4_++) {
				if (is[i_4_] != 15)
					class422.modifiedColors[is[i_4_]] = (short) class282_sub35.readUnsignedShort();
			}
		}
		if (modifyTextures) {
			int i_5_ = class282_sub35.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_5_ & 0xf;
			is[1] = i_5_ >> 4 & 0xf;
			for (int i_6_ = 0; i_6_ < 2; i_6_++) {
				if (15 != is[i_6_])
					class422.modifiedTextures[is[i_6_]] = (short) class282_sub35.readUnsignedShort();
			}
		}
		return class422;
	}

	public static void method7041(byte i) {
		Class468_Sub8.aClass98Array7889 = new Interface[Class388.INTERFACE_INDEX.containersCount(-989265149)];
		WorldMapIndexLoader.aBoolArray2709 = new boolean[Class388.INTERFACE_INDEX.containersCount(-1315651594)];
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
			boolean bool = (class282_sub50_sub6.method14775(Class291.anInt3472 + Class427.anInt5123 * -861975801, Class291.anInt3473 + Class475.anInt5624 * 483850921, CS2Runner.anIntArray5900, -1687346032));
			if (bool) {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = CS2Runner.anIntArray5900[1];
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = CS2Runner.anIntArray5900[2];
			} else {
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
				class527.intStack[((class527.anInt7012 += 141891001) * 1942118537) - 1] = -1;
			}
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		}
	}
}
