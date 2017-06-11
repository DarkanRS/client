/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96 {
	int anInt925;
	static short[] aShortArray926;
	static short[] aShortArray927 = new short[500];
	static short[] aShortArray928;
	static short[] aShortArray929;
	short[] aShortArray930;
	Class298_Sub15 aClass298_Sub15_931 = null;
	static short[] aShortArray932;
	short[] aShortArray933;
	short[] aShortArray934;
	static int anInt935 = 2;
	short[] aShortArray936;
	short[] aShortArray937;
	byte[] aByteArray938;
	boolean aBoolean939;
	boolean aBoolean940;
	boolean aBoolean941;
	static int anInt942 = 1;
	static int anInt943 = 2;
	static byte[] aByteArray944;

	Class96(byte[] is, Class298_Sub15 class298_sub15) {
		((Class96) this).anInt925 = 0;
		((Class96) this).aBoolean939 = false;
		((Class96) this).aBoolean940 = false;
		((Class96) this).aBoolean941 = false;
		((Class96) this).aClass298_Sub15_931 = class298_sub15;
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(is);
			RsByteBuffer class298_sub53_0_ = new RsByteBuffer(is);
			class298_sub53.readUnsignedByte();
			class298_sub53.index += 232826622;
			int i = class298_sub53.readUnsignedByte();
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			class298_sub53_0_.index = (class298_sub53.index * 385051775 + i) * 116413311;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class298_Sub15) ((Class96) this).aClass298_Sub15_931).anIntArray7278[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = class298_sub53.readUnsignedByte();
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray927[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray926[i_1_] = (short) class298_sub53_0_.method3645(590991010);
					else
						aShortArray926[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray932[i_1_] = (short) class298_sub53_0_.method3645(590991010);
					else
						aShortArray932[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray928[i_1_] = (short) class298_sub53_0_.method3645(590991010);
					else
						aShortArray928[i_1_] = i_7_;
					aByteArray944[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray926[i_1_] = (short) (aShortArray926[i_1_] << 2 & 0x3fff);
						aShortArray932[i_1_] = (short) (aShortArray932[i_1_] << 2 & 0x3fff);
						aShortArray928[i_1_] = (short) (aShortArray928[i_1_] << 2 & 0x3fff);
					}
					aShortArray929[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray929[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((Class96) this).aBoolean939 = true;
					else if (i_5_ == 7)
						((Class96) this).aBoolean940 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((Class96) this).aBoolean941 = true;
					i_1_++;
				}
			}
			if (class298_sub53_0_.index * 385051775 != is.length)
				throw new RuntimeException();
			((Class96) this).anInt925 = i_1_;
			((Class96) this).aShortArray933 = new short[i_1_];
			((Class96) this).aShortArray934 = new short[i_1_];
			((Class96) this).aShortArray930 = new short[i_1_];
			((Class96) this).aShortArray936 = new short[i_1_];
			((Class96) this).aShortArray937 = new short[i_1_];
			((Class96) this).aByteArray938 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((Class96) this).aShortArray933[i_8_] = aShortArray927[i_8_];
				((Class96) this).aShortArray934[i_8_] = aShortArray926[i_8_];
				((Class96) this).aShortArray930[i_8_] = aShortArray932[i_8_];
				((Class96) this).aShortArray936[i_8_] = aShortArray928[i_8_];
				((Class96) this).aShortArray937[i_8_] = aShortArray929[i_8_];
				((Class96) this).aByteArray938[i_8_] = aByteArray944[i_8_];
			}
		} catch (Exception exception) {
			((Class96) this).anInt925 = 0;
			((Class96) this).aBoolean939 = false;
			((Class96) this).aBoolean940 = false;
		}
	}

	static {
		aShortArray926 = new short[500];
		aShortArray932 = new short[500];
		aShortArray928 = new short[500];
		aShortArray929 = new short[500];
		aByteArray944 = new byte[500];
	}
}
