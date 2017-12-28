/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class226 implements Interface46 {
	public int anInt2783;
	public int anInt2784;
	public int anInt2785;

	void method3795(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method3796(class282_sub35, i_0_, 767185341);
		}
	}

	Class226() {
		/* empty */
	}

	void method3796(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (i == 1) {
			anInt2784 = class282_sub35.readUnsignedShort() * -1882165671;
			anInt2785 = class282_sub35.readUnsignedByte() * -1187004859;
			anInt2783 = class282_sub35.readUnsignedByte() * -1434404187;
		}
	}

	void method3797(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method3796(class282_sub35, i, -545015864);
		}
	}

	void method3798(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method3796(class282_sub35, i, 245403690);
		}
	}

	void method3799(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method3796(class282_sub35, i, 2099062464);
		}
	}

	void method3800(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			anInt2784 = class282_sub35.readUnsignedShort() * -1882165671;
			anInt2785 = class282_sub35.readUnsignedByte() * -1187004859;
			anInt2783 = class282_sub35.readUnsignedByte() * -1434404187;
		}
	}

	void method3801(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			anInt2784 = class282_sub35.readUnsignedShort() * -1882165671;
			anInt2785 = class282_sub35.readUnsignedByte() * -1187004859;
			anInt2783 = class282_sub35.readUnsignedByte() * -1434404187;
		}
	}

	static final void method3802(Class527 class527, int i) {
		int i_2_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = -705707341 * client.aClass330Array7428[i_2_].anInt3865;
	}

	static final void method3803(Class527 class527, short i) {
		int i_3_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class108 class108 = Class180.method3032(i_3_, (byte) -1);
		int i_4_ = -1;
		if (null != class108)
			i_4_ = 840973581 * class108.anInt1085;
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_4_;
	}

	static final void method3804(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_5_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_6_ = (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]);
		if (Class475.aBool5623) {
			Class440.method7373(3, i_5_, i_6_, false, (byte) 114);
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = null != Class263.aFrame3260 ? 1 : 0;
		} else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void method3805(int i) {
		Class148.aClass282_Sub15_Sub2_1735.method15101((short) -11220);
		Class148.anInt1730 = 800770715;
		Class75.aClass317_746 = null;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
	}

	static final void method3806(Class527 class527, int i) {
		int i_7_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_7_, (byte) 114);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_7_ >> 16];
		Class96_Sub18.method14664(class118, class98, true, 1, class527, (byte) -9);
	}
}
