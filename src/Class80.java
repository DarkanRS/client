/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80 {
	static byte[] aByteArray784 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int anInt785;
	long aLong786;
	int[] anIntArray787;
	int[] anIntArray788;
	static final int anInt789 = 2;
	int anInt790;
	static final int anInt791 = 500000;
	RsByteBuffer aClass282_Sub35_792;
	int[] anIntArray793;
	static final int anInt794 = 0;
	static final int anInt795 = 1;
	int[] anIntArray796;
	static final int anInt797 = 3;

	void method1392(int i) {
		int i_0_ = ((Class80) this).aClass282_Sub35_792.method13099(2005906318);
		((Class80) this).anIntArray788[i] += i_0_;
	}

	int method1393() {
		int i = ((Class80) this).anIntArray787.length;
		int i_1_ = -1;
		int i_2_ = 2147483647;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			if (((Class80) this).anIntArray787[i_3_] >= 0 && ((Class80) this).anIntArray788[i_3_] < i_2_) {
				i_1_ = i_3_;
				i_2_ = ((Class80) this).anIntArray788[i_3_];
			}
		}
		return i_1_;
	}

	void method1394(byte[] is) {
		((Class80) this).aClass282_Sub35_792.buffer = is;
		((Class80) this).aClass282_Sub35_792.index = 1730133218;
		int i = ((Class80) this).aClass282_Sub35_792.readUnsignedShort();
		((Class80) this).anInt785 = ((Class80) this).aClass282_Sub35_792.readUnsignedShort();
		((Class80) this).anInt790 = 500000;
		((Class80) this).anIntArray793 = new int[i];
		int i_4_ = 0;
		while (i_4_ < i) {
			int i_5_ = ((Class80) this).aClass282_Sub35_792.readInt();
			int i_6_ = ((Class80) this).aClass282_Sub35_792.readInt();
			if (i_5_ == 1297379947) {
				((Class80) this).anIntArray793[i_4_] = (((Class80) this).aClass282_Sub35_792.index * -1990677291);
				i_4_++;
			}
			((Class80) this).aClass282_Sub35_792.index += i_6_ * -1115476867;
		}
		((Class80) this).aLong786 = 0L;
		((Class80) this).anIntArray787 = new int[i];
		for (i_4_ = 0; i_4_ < i; i_4_++)
			((Class80) this).anIntArray787[i_4_] = ((Class80) this).anIntArray793[i_4_];
		((Class80) this).anIntArray788 = new int[i];
		((Class80) this).anIntArray796 = new int[i];
	}

	void method1395() {
		((Class80) this).aClass282_Sub35_792.buffer = null;
		((Class80) this).anIntArray793 = null;
		((Class80) this).anIntArray787 = null;
		((Class80) this).anIntArray788 = null;
		((Class80) this).anIntArray796 = null;
	}

	boolean method1396() {
		int i = ((Class80) this).anIntArray787.length;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			if (((Class80) this).anIntArray787[i_7_] >= 0)
				return false;
		}
		return true;
	}

	int method1397() {
		return ((Class80) this).anIntArray787.length;
	}

	void method1398(int i) {
		((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray787[i] * -1115476867;
	}

	void method1399(int i) {
		((Class80) this).anIntArray787[i] = ((Class80) this).aClass282_Sub35_792.index * -1990677291;
	}

	Class80(byte[] is) {
		((Class80) this).aClass282_Sub35_792 = new RsByteBuffer(null);
		method1394(is);
	}

	void method1400() {
		((Class80) this).aClass282_Sub35_792.index = 1115476867;
	}

	int method1401(int i) {
		int i_8_ = method1423(i);
		return i_8_;
	}

	void method1402(long l) {
		((Class80) this).aLong786 = l;
		int i = ((Class80) this).anIntArray787.length;
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			((Class80) this).anIntArray788[i_9_] = 0;
			((Class80) this).anIntArray796[i_9_] = 0;
			((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray793[i_9_] * -1115476867;
			method1392(i_9_);
			((Class80) this).anIntArray787[i_9_] = ((Class80) this).aClass282_Sub35_792.index * -1990677291;
		}
	}

	long method1403(int i) {
		return (((Class80) this).aLong786 + (long) i * (long) ((Class80) this).anInt790);
	}

	void method1404(int i) {
		((Class80) this).anIntArray787[i] = ((Class80) this).aClass282_Sub35_792.index * -1990677291;
	}

	boolean method1405() {
		int i = ((Class80) this).anIntArray787.length;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			if (((Class80) this).anIntArray787[i_10_] >= 0)
				return false;
		}
		return true;
	}

	void method1406(long l) {
		((Class80) this).aLong786 = l;
		int i = ((Class80) this).anIntArray787.length;
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			((Class80) this).anIntArray788[i_11_] = 0;
			((Class80) this).anIntArray796[i_11_] = 0;
			((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray793[i_11_] * -1115476867;
			method1392(i_11_);
			((Class80) this).anIntArray787[i_11_] = ((Class80) this).aClass282_Sub35_792.index * -1990677291;
		}
	}

	long method1407(int i) {
		return (((Class80) this).aLong786 + (long) i * (long) ((Class80) this).anInt790);
	}

	void method1408(byte[] is) {
		((Class80) this).aClass282_Sub35_792.buffer = is;
		((Class80) this).aClass282_Sub35_792.index = 1730133218;
		int i = ((Class80) this).aClass282_Sub35_792.readUnsignedShort();
		((Class80) this).anInt785 = ((Class80) this).aClass282_Sub35_792.readUnsignedShort();
		((Class80) this).anInt790 = 500000;
		((Class80) this).anIntArray793 = new int[i];
		int i_12_ = 0;
		while (i_12_ < i) {
			int i_13_ = ((Class80) this).aClass282_Sub35_792.readInt();
			int i_14_ = ((Class80) this).aClass282_Sub35_792.readInt();
			if (i_13_ == 1297379947) {
				((Class80) this).anIntArray793[i_12_] = (((Class80) this).aClass282_Sub35_792.index * -1990677291);
				i_12_++;
			}
			((Class80) this).aClass282_Sub35_792.index += i_14_ * -1115476867;
		}
		((Class80) this).aLong786 = 0L;
		((Class80) this).anIntArray787 = new int[i];
		for (i_12_ = 0; i_12_ < i; i_12_++)
			((Class80) this).anIntArray787[i_12_] = ((Class80) this).anIntArray793[i_12_];
		((Class80) this).anIntArray788 = new int[i];
		((Class80) this).anIntArray796 = new int[i];
	}

	boolean method1409() {
		return ((Class80) this).aClass282_Sub35_792.buffer != null;
	}

	boolean method1410() {
		return ((Class80) this).aClass282_Sub35_792.buffer != null;
	}

	void method1411(int i) {
		((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray787[i] * -1115476867;
	}

	int method1412(int i, int i_15_) {
		if (i_15_ == 255) {
			int i_16_ = ((Class80) this).aClass282_Sub35_792.readUnsignedByte();
			int i_17_ = ((Class80) this).aClass282_Sub35_792.method13099(-873046353);
			if (i_16_ == 47) {
				((Class80) this).aClass282_Sub35_792.index += i_17_ * -1115476867;
				return 1;
			}
			if (i_16_ == 81) {
				int i_18_ = ((Class80) this).aClass282_Sub35_792.read24BitUnsignedInteger();
				i_17_ -= 3;
				int i_19_ = ((Class80) this).anIntArray788[i];
				((Class80) this).aLong786 += (long) i_19_ * (long) (((Class80) this).anInt790 - i_18_);
				((Class80) this).anInt790 = i_18_;
				((Class80) this).aClass282_Sub35_792.index += i_17_ * -1115476867;
				return 2;
			}
			((Class80) this).aClass282_Sub35_792.index += i_17_ * -1115476867;
			return 3;
		}
		byte i_20_ = aByteArray784[i_15_ - 128];
		int i_21_ = i_15_;
		if (i_20_ >= 1)
			i_21_ |= (((Class80) this).aClass282_Sub35_792.readUnsignedByte() << 8);
		if (i_20_ >= 2)
			i_21_ |= (((Class80) this).aClass282_Sub35_792.readUnsignedByte() << 16);
		return i_21_;
	}

	boolean method1413() {
		return ((Class80) this).aClass282_Sub35_792.buffer != null;
	}

	int method1414() {
		return ((Class80) this).anIntArray787.length;
	}

	boolean method1415() {
		return ((Class80) this).aClass282_Sub35_792.buffer != null;
	}

	void method1416(int i) {
		((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray787[i] * -1115476867;
	}

	boolean method1417() {
		return ((Class80) this).aClass282_Sub35_792.buffer != null;
	}

	void method1418(int i) {
		((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray787[i] * -1115476867;
	}

	void method1419(int i) {
		((Class80) this).aClass282_Sub35_792.index = ((Class80) this).anIntArray787[i] * -1115476867;
	}

	void method1420(int i) {
		((Class80) this).anIntArray787[i] = ((Class80) this).aClass282_Sub35_792.index * -1990677291;
	}

	int method1421() {
		return ((Class80) this).anIntArray787.length;
	}

	void method1422(int i) {
		((Class80) this).anIntArray787[i] = ((Class80) this).aClass282_Sub35_792.index * -1990677291;
	}

	int method1423(int i) {
		int i_22_ = (((Class80) this).aClass282_Sub35_792.buffer[((Class80) this).aClass282_Sub35_792.index * -1990677291]);
		if (i_22_ < 0) {
			i_22_ &= 0xff;
			((Class80) this).anIntArray796[i] = i_22_;
			((Class80) this).aClass282_Sub35_792.index += -1115476867;
		} else
			i_22_ = ((Class80) this).anIntArray796[i];
		if (i_22_ == 240 || i_22_ == 247) {
			int i_23_ = ((Class80) this).aClass282_Sub35_792.method13099(57806040);
			if (i_22_ == 247 && i_23_ > 0) {
				int i_24_ = ((((Class80) this).aClass282_Sub35_792.buffer[(((Class80) this).aClass282_Sub35_792.index * -1990677291)]) & 0xff);
				if (i_24_ >= 241 && i_24_ <= 243 || i_24_ == 246 || i_24_ == 248 || i_24_ >= 250 && i_24_ <= 252 || i_24_ == 254) {
					((Class80) this).aClass282_Sub35_792.index += -1115476867;
					((Class80) this).anIntArray796[i] = i_24_;
					return method1412(i, i_24_);
				}
			}
			((Class80) this).aClass282_Sub35_792.index += i_23_ * -1115476867;
			return 0;
		}
		return method1412(i, i_22_);
	}

	void method1424() {
		((Class80) this).aClass282_Sub35_792.index = 1115476867;
	}

	int method1425(int i) {
		int i_25_ = method1423(i);
		return i_25_;
	}

	int method1426(int i) {
		int i_26_ = method1423(i);
		return i_26_;
	}

	int method1427(int i) {
		int i_27_ = (((Class80) this).aClass282_Sub35_792.buffer[((Class80) this).aClass282_Sub35_792.index * -1990677291]);
		if (i_27_ < 0) {
			i_27_ &= 0xff;
			((Class80) this).anIntArray796[i] = i_27_;
			((Class80) this).aClass282_Sub35_792.index += -1115476867;
		} else
			i_27_ = ((Class80) this).anIntArray796[i];
		if (i_27_ == 240 || i_27_ == 247) {
			int i_28_ = ((Class80) this).aClass282_Sub35_792.method13099(-899704620);
			if (i_27_ == 247 && i_28_ > 0) {
				int i_29_ = ((((Class80) this).aClass282_Sub35_792.buffer[(((Class80) this).aClass282_Sub35_792.index * -1990677291)]) & 0xff);
				if (i_29_ >= 241 && i_29_ <= 243 || i_29_ == 246 || i_29_ == 248 || i_29_ >= 250 && i_29_ <= 252 || i_29_ == 254) {
					((Class80) this).aClass282_Sub35_792.index += -1115476867;
					((Class80) this).anIntArray796[i] = i_29_;
					return method1412(i, i_29_);
				}
			}
			((Class80) this).aClass282_Sub35_792.index += i_28_ * -1115476867;
			return 0;
		}
		return method1412(i, i_27_);
	}

	int method1428(int i) {
		int i_30_ = (((Class80) this).aClass282_Sub35_792.buffer[((Class80) this).aClass282_Sub35_792.index * -1990677291]);
		if (i_30_ < 0) {
			i_30_ &= 0xff;
			((Class80) this).anIntArray796[i] = i_30_;
			((Class80) this).aClass282_Sub35_792.index += -1115476867;
		} else
			i_30_ = ((Class80) this).anIntArray796[i];
		if (i_30_ == 240 || i_30_ == 247) {
			int i_31_ = ((Class80) this).aClass282_Sub35_792.method13099(-480223713);
			if (i_30_ == 247 && i_31_ > 0) {
				int i_32_ = ((((Class80) this).aClass282_Sub35_792.buffer[(((Class80) this).aClass282_Sub35_792.index * -1990677291)]) & 0xff);
				if (i_32_ >= 241 && i_32_ <= 243 || i_32_ == 246 || i_32_ == 248 || i_32_ >= 250 && i_32_ <= 252 || i_32_ == 254) {
					((Class80) this).aClass282_Sub35_792.index += -1115476867;
					((Class80) this).anIntArray796[i] = i_32_;
					return method1412(i, i_32_);
				}
			}
			((Class80) this).aClass282_Sub35_792.index += i_31_ * -1115476867;
			return 0;
		}
		return method1412(i, i_30_);
	}

	int method1429(int i, int i_33_) {
		if (i_33_ == 255) {
			int i_34_ = ((Class80) this).aClass282_Sub35_792.readUnsignedByte();
			int i_35_ = ((Class80) this).aClass282_Sub35_792.method13099(474524132);
			if (i_34_ == 47) {
				((Class80) this).aClass282_Sub35_792.index += i_35_ * -1115476867;
				return 1;
			}
			if (i_34_ == 81) {
				int i_36_ = ((Class80) this).aClass282_Sub35_792.read24BitUnsignedInteger();
				i_35_ -= 3;
				int i_37_ = ((Class80) this).anIntArray788[i];
				((Class80) this).aLong786 += (long) i_37_ * (long) (((Class80) this).anInt790 - i_36_);
				((Class80) this).anInt790 = i_36_;
				((Class80) this).aClass282_Sub35_792.index += i_35_ * -1115476867;
				return 2;
			}
			((Class80) this).aClass282_Sub35_792.index += i_35_ * -1115476867;
			return 3;
		}
		byte i_38_ = aByteArray784[i_33_ - 128];
		int i_39_ = i_33_;
		if (i_38_ >= 1)
			i_39_ |= (((Class80) this).aClass282_Sub35_792.readUnsignedByte() << 8);
		if (i_38_ >= 2)
			i_39_ |= (((Class80) this).aClass282_Sub35_792.readUnsignedByte() << 16);
		return i_39_;
	}

	long method1430(int i) {
		return (((Class80) this).aLong786 + (long) i * (long) ((Class80) this).anInt790);
	}

	void method1431() {
		((Class80) this).aClass282_Sub35_792.index = 1115476867;
	}

	int method1432() {
		int i = ((Class80) this).anIntArray787.length;
		int i_40_ = -1;
		int i_41_ = 2147483647;
		for (int i_42_ = 0; i_42_ < i; i_42_++) {
			if (((Class80) this).anIntArray787[i_42_] >= 0 && ((Class80) this).anIntArray788[i_42_] < i_41_) {
				i_40_ = i_42_;
				i_41_ = ((Class80) this).anIntArray788[i_42_];
			}
		}
		return i_40_;
	}

	boolean method1433() {
		int i = ((Class80) this).anIntArray787.length;
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			if (((Class80) this).anIntArray787[i_43_] >= 0)
				return false;
		}
		return true;
	}

	void method1434(byte[] is) {
		((Class80) this).aClass282_Sub35_792.buffer = is;
		((Class80) this).aClass282_Sub35_792.index = 1730133218;
		int i = ((Class80) this).aClass282_Sub35_792.readUnsignedShort();
		((Class80) this).anInt785 = ((Class80) this).aClass282_Sub35_792.readUnsignedShort();
		((Class80) this).anInt790 = 500000;
		((Class80) this).anIntArray793 = new int[i];
		int i_44_ = 0;
		while (i_44_ < i) {
			int i_45_ = ((Class80) this).aClass282_Sub35_792.readInt();
			int i_46_ = ((Class80) this).aClass282_Sub35_792.readInt();
			if (i_45_ == 1297379947) {
				((Class80) this).anIntArray793[i_44_] = (((Class80) this).aClass282_Sub35_792.index * -1990677291);
				i_44_++;
			}
			((Class80) this).aClass282_Sub35_792.index += i_46_ * -1115476867;
		}
		((Class80) this).aLong786 = 0L;
		((Class80) this).anIntArray787 = new int[i];
		for (i_44_ = 0; i_44_ < i; i_44_++)
			((Class80) this).anIntArray787[i_44_] = ((Class80) this).anIntArray793[i_44_];
		((Class80) this).anIntArray788 = new int[i];
		((Class80) this).anIntArray796 = new int[i];
	}

	boolean method1435() {
		int i = ((Class80) this).anIntArray787.length;
		for (int i_47_ = 0; i_47_ < i; i_47_++) {
			if (((Class80) this).anIntArray787[i_47_] >= 0)
				return false;
		}
		return true;
	}

	Class80() {
		((Class80) this).aClass282_Sub35_792 = new RsByteBuffer(null);
	}
}
