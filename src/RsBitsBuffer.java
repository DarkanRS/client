/* Class282_Sub35_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RsBitsBuffer extends RsByteBuffer {

	int anInt9608;
	IsaacCipher aClass432_9609;
	static int[] anIntArray9610 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };

	public void method14866() {
		this.anInt9608 = -436806392 * index;
	}

	public void method14867(IsaacCipher class432, int i) {
		this.aClass432_9609 = class432;
	}

	public void method14868(int i) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i + this.aClass432_9609.method7254(1662845708));
	}

	public boolean method14869(short i) {
		int i_0_ = ((buffer[index * -1990677291] - this.aClass432_9609.method7255(-44751888)) & 0xff);
		if (i_0_ < 128) {
			return false;
		}
		return true;
	}

	public int method14870() {
		int i_1_ = ((buffer[(index += -1115476867) * -1990677291 - 1] - this.aClass432_9609.method7254(1151052161)) & 0xff);
		if (i_1_ < 128) {
			return i_1_;
		}
		return ((i_1_ - 128 << 8) + (((buffer[(index += -1115476867) * -1990677291 - 1]) - this.aClass432_9609.method7254(843866869)) & 0xff));
	}

	public int readBits(int i, byte i_2_) {
		int i_3_ = this.anInt9608 * -951262027 >> 3;
		int i_4_ = 8 - (this.anInt9608 * -951262027 & 0x7);
		int i_5_ = 0;
		this.anInt9608 += -145495651 * i;
		for (/**/; i > i_4_; i_4_ = 8) {
			i_5_ += (buffer[i_3_++] & anIntArray9610[i_4_]) << i - i_4_;
			i -= i_4_;
		}
		if (i_4_ == i) {
			i_5_ += buffer[i_3_] & anIntArray9610[i_4_];
		} else {
			i_5_ += buffer[i_3_] >> i_4_ - i & anIntArray9610[i];
		}
		return i_5_;
	}

	public void initBitAccess(byte i) {
		this.anInt9608 = -436806392 * index;
	}

	public void method14873(byte[] is, int i, int i_6_, byte i_7_) {
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			if (i_7_ != 8) {
				break;
			}
			is[i_8_ + i] = (byte) ((buffer[(index += -1115476867) * -1990677291 - 1]) - this.aClass432_9609.method7254(1542383540));
		}
	}

	public void finishBitAccess(byte i) {
		index = ((-951262027 * this.anInt9608 + 7) / 8 * -1115476867);
	}

	public int readableBits(int i, int i_9_) {
		return 8 * i - this.anInt9608 * -951262027;
	}

	public void method14876(int i) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i + this.aClass432_9609.method7254(669057184));
	}

	public void method14877(int i) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i + this.aClass432_9609.method7254(1338157466));
	}

	public int method14878(int i) {
		int i_10_ = this.anInt9608 * -951262027 >> 3;
		int i_11_ = 8 - (this.anInt9608 * -951262027 & 0x7);
		int i_12_ = 0;
		this.anInt9608 += -145495651 * i;
		for (/**/; i > i_11_; i_11_ = 8) {
			i_12_ += ((buffer[i_10_++] & anIntArray9610[i_11_]) << i - i_11_);
			i -= i_11_;
		}
		if (i_11_ == i) {
			i_12_ += buffer[i_10_] & anIntArray9610[i_11_];
		} else {
			i_12_ += buffer[i_10_] >> i_11_ - i & anIntArray9610[i];
		}
		return i_12_;
	}

	public boolean method14879() {
		int i = ((buffer[index * -1990677291] - this.aClass432_9609.method7255(-692378847)) & 0xff);
		if (i < 128) {
			return false;
		}
		return true;
	}

	public int method14880(int i) {
		return 8 * i - this.anInt9608 * -951262027;
	}

	public int method14881() {
		int i = ((buffer[(index += -1115476867) * -1990677291 - 1] - this.aClass432_9609.method7254(2040665613)) & 0xff);
		if (i < 128) {
			return i;
		}
		return ((i - 128 << 8) + (((buffer[(index += -1115476867) * -1990677291 - 1]) - this.aClass432_9609.method7254(617496031)) & 0xff));
	}

	public void method14882(byte[] is, int i, int i_13_) {
		for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
			is[i_14_ + i] = (byte) ((buffer[(index += -1115476867) * -1990677291 - 1]) - this.aClass432_9609.method7254(1348910147));
		}
	}

	public void method14883(int i, int i_15_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i + this.aClass432_9609.method7254(1317631877));
	}

	public boolean method14884() {
		int i = ((buffer[index * -1990677291] - this.aClass432_9609.method7255(1157859893)) & 0xff);
		if (i < 128) {
			return false;
		}
		return true;
	}

	public int method14885(int i) {
		return 8 * i - this.anInt9608 * -951262027;
	}

	public void method14886() {
		this.anInt9608 = -436806392 * index;
	}

	public RsBitsBuffer(int i) {
		super(i);
	}

	public void method14887() {
		index = ((-951262027 * this.anInt9608 + 7) / 8 * -1115476867);
	}

	public void method14888() {
		index = ((-951262027 * this.anInt9608 + 7) / 8 * -1115476867);
	}

	public void method14889(byte[] is, int i, int i_16_) {
		for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
			is[i_17_ + i] = (byte) ((buffer[(index += -1115476867) * -1990677291 - 1]) - this.aClass432_9609.method7254(1242633396));
		}
	}

	public void method14890() {
		this.anInt9608 = -436806392 * index;
	}

	public int method14891(int i) {
		return 8 * i - this.anInt9608 * -951262027;
	}
}
