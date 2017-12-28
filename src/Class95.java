/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95 {
	boolean aBool972;
	static short[] aShortArray973;
	static final int anInt974 = 2;
	static short[] aShortArray975;
	static short[] aShortArray976 = new short[500];
	static short[] aShortArray977;
	Class282_Sub12 aClass282_Sub12_978 = null;
	static short[] aShortArray979;
	int anInt980 = 0;
	short[] aShortArray981;
	short[] aShortArray982;
	short[] aShortArray983;
	short[] aShortArray984;
	byte[] aByteArray985;
	boolean aBool986 = false;
	short[] aShortArray987;
	boolean aBool988;
	static final int anInt989 = 1;
	static final int anInt990 = 2;
	static byte[] aByteArray991;

	Class95(byte[] is, Class282_Sub12 class282_sub12) {
		((Class95) this).aBool972 = false;
		((Class95) this).aBool988 = false;
		((Class95) this).aClass282_Sub12_978 = class282_sub12;
		try {
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			RsByteBuffer class282_sub35_0_ = new RsByteBuffer(is);
			class282_sub35.readUnsignedByte();
			class282_sub35.index += 2064013562;
			int i = class282_sub35.readUnsignedByte();
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			class282_sub35_0_.index = (class282_sub35.index * -1990677291 + i) * -1115476867;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class282_Sub12) ((Class95) this).aClass282_Sub12_978).anIntArray7562[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = class282_sub35.readUnsignedByte();
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray976[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray973[i_1_] = (short) class282_sub35_0_.method13094(98798348);
					else
						aShortArray973[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray977[i_1_] = (short) class282_sub35_0_.method13094(-1955143271);
					else
						aShortArray977[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray975[i_1_] = (short) class282_sub35_0_.method13094(117687154);
					else
						aShortArray975[i_1_] = i_7_;
					aByteArray991[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray973[i_1_] = (short) (aShortArray973[i_1_] << 2 & 0x3fff);
						aShortArray977[i_1_] = (short) (aShortArray977[i_1_] << 2 & 0x3fff);
						aShortArray975[i_1_] = (short) (aShortArray975[i_1_] << 2 & 0x3fff);
					}
					aShortArray979[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray979[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((Class95) this).aBool986 = true;
					else if (i_5_ == 7)
						((Class95) this).aBool972 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((Class95) this).aBool988 = true;
					i_1_++;
				}
			}
			if (class282_sub35_0_.index * -1990677291 != is.length)
				throw new RuntimeException();
			((Class95) this).anInt980 = i_1_;
			((Class95) this).aShortArray987 = new short[i_1_];
			((Class95) this).aShortArray981 = new short[i_1_];
			((Class95) this).aShortArray982 = new short[i_1_];
			((Class95) this).aShortArray983 = new short[i_1_];
			((Class95) this).aShortArray984 = new short[i_1_];
			((Class95) this).aByteArray985 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((Class95) this).aShortArray987[i_8_] = aShortArray976[i_8_];
				((Class95) this).aShortArray981[i_8_] = aShortArray973[i_8_];
				((Class95) this).aShortArray982[i_8_] = aShortArray977[i_8_];
				((Class95) this).aShortArray983[i_8_] = aShortArray975[i_8_];
				((Class95) this).aShortArray984[i_8_] = aShortArray979[i_8_];
				((Class95) this).aByteArray985[i_8_] = aByteArray991[i_8_];
			}
		} catch (Exception exception) {
			((Class95) this).anInt980 = 0;
			((Class95) this).aBool986 = false;
			((Class95) this).aBool972 = false;
		}
	}

	static {
		aShortArray973 = new short[500];
		aShortArray977 = new short[500];
		aShortArray975 = new short[500];
		aShortArray979 = new short[500];
		aByteArray991 = new byte[500];
	}
}
