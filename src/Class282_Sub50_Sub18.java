/* Class282_Sub50_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub18 extends Class282_Sub50 implements Interface46 {
	public int[] anIntArray10274;
	public int[] anIntArray10275;
	public int anInt10276 = 0;
	public int anInt10277 = 0;

	Class282_Sub50_Sub18() {
		/* empty */
	}

	void method15690(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method15691(class282_sub35, i_0_, -1602172632);
		}
	}

	void method15691(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (2 == i)
			anInt10277 = class282_sub35.readUnsignedShort() * 1760265307;
		else if (4 == i) {
			anInt10276 = class282_sub35.readUnsignedByte() * 1526908655;
			anIntArray10274 = new int[anInt10276 * -1471207409];
			anIntArray10275 = new int[-1471207409 * anInt10276];
			for (int i_2_ = 0; i_2_ < anInt10276 * -1471207409; i_2_++) {
				anIntArray10274[i_2_] = class282_sub35.readUnsignedShort();
				anIntArray10275[i_2_] = class282_sub35.readUnsignedShort();
			}
		}
	}

	void method15692(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method15691(class282_sub35, i, -1484721786);
		}
	}

	void method15693(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method15691(class282_sub35, i, -573337814);
		}
	}

	void method15694(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method15691(class282_sub35, i, 1950560649);
		}
	}

	void method15695(RsByteBuffer class282_sub35, int i) {
		if (2 == i)
			anInt10277 = class282_sub35.readUnsignedShort() * 1760265307;
		else if (4 == i) {
			anInt10276 = class282_sub35.readUnsignedByte() * 1526908655;
			anIntArray10274 = new int[anInt10276 * -1471207409];
			anIntArray10275 = new int[-1471207409 * anInt10276];
			for (int i_3_ = 0; i_3_ < anInt10276 * -1471207409; i_3_++) {
				anIntArray10274[i_3_] = class282_sub35.readUnsignedShort();
				anIntArray10275[i_3_] = class282_sub35.readUnsignedShort();
			}
		}
	}

	static final void method15696(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((Class84.myPlayer.aClass238_10558 != null) && (Class84.myPlayer.aClass238_10558.aBool2929)) ? 1 : 0;
	}
}
