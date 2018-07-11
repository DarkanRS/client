
/* Class282_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class RsByteBuffer extends Node {
	public static long[] aLongArray7979;
	public int index;
	public byte[] buffer;

	static int[] anIntArray7986 = new int[256];

	public RsByteBuffer(byte[] is) {
		buffer = is;
		index = 0;
	}

	public void method13059(int i) {
		if (null != buffer) {
			Class351.method6197(buffer, -1154101175);
		}
		buffer = null;
	}

	public void writeByte(int i) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
	}

	public void method13061(int i, int i_3_) {
		buffer[-1990677291 * index - i - 1] = (byte) i;
	}

	public void writeLEShort(int i, byte i_4_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
	}

	public void writeInt(int i) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 24);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
	}

	public void writeShortLE(int i, short i_6_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
	}

	public void writeLong(long l) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 56);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 48);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 40);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 32);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 24);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) l;
	}

	public void method13068(long l, int i, int i_7_) {
		if (--i < 0 || i > 7) {
			throw new IllegalArgumentException();
		}
		for (int i_8_ = i * 8; i_8_ >= 0; i_8_ -= 8) {
			buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> i_8_);
		}
	}

	public void writeJagString(String string, int i) {
		int i_9_ = string.indexOf('\0');
		if (i_9_ >= 0) {
			throw new IllegalArgumentException("");
		}
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) 0;
		index += (Index.method5693(string, 0, string.length(), buffer, -1990677291 * index, -74015201) * -1115476867);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) 0;
	}

	public void method13071(CharSequence charsequence, byte i) {
		int i_10_ = charsequence.length();
		int i_11_ = 0;
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
			char c = charsequence.charAt(i_12_);
			if (c <= '\u007f') {
				i_11_++;
			} else if (c <= '\u07ff') {
				i_11_ += 2;
			} else {
				i_11_ += 3;
			}
		}
		int i_13_ = i_11_;
		i_10_ = i_13_;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) 0;
		method13077(i_10_, 1646116683);
		index += Class330.method5914(buffer, -1990677291 * index, charsequence, -1772783727) * -1115476867;
	}

	public void writeBytes(byte[] is, int i, int i_14_) {
		for (int i_16_ = i; i_16_ < i_14_ + i; i_16_++) {
			buffer[(index += -1115476867) * -1990677291 - 1] = is[i_16_];
		}
	}

	public void method13073(int i, int i_17_) {
		buffer[-1990677291 * index - i - 4] = (byte) (i >> 24);
		buffer[index * -1990677291 - i - 3] = (byte) (i >> 16);
		buffer[-1990677291 * index - i - 2] = (byte) (i >> 8);
		buffer[index * -1990677291 - i - 1] = (byte) i;
	}

	public int readUnsignedShort128() {
		index += 2064013562;
		return (((buffer[-1990677291 * index - 2] & 0xff) << 8) + (buffer[index * -1990677291 - 1] - 128 & 0xff));
	}

	public void writeByte128(int i, int i_18_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (128 + i);
	}

	public void method13076(int i, int i_19_) {
		if (i >= 0 && i < 128) {
			writeByte(i);
		} else if (i >= 0 && i < 32768) {
			writeShort(32768 + i, 1417031095);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method13077(int i, int i_20_) {
		if (0 != (i & ~0x7f)) {
			if ((i & ~0x3fff) != 0) {
				if (0 != (i & ~0x1fffff)) {
					if (0 != (i & ~0xfffffff)) {
						writeByte(i >>> 28 | 0x80);
					}
					writeByte(i >>> 21 | 0x80);
				}
				writeByte(i >>> 14 | 0x80);
			}
			writeByte(i >>> 7 | 0x80);
		}
		writeByte(i & 0x7f);
	}

	public int readUnsignedByte() {
		return (buffer[(index += -1115476867) * -1990677291 - 1] & 0xff);
	}

	public int readUnsignedShort() {
		index += 2064013562;
		return (((buffer[-1990677291 * index - 2] & 0xff) << 8) + (buffer[-1990677291 * index - 1] & 0xff));
	}

	public int readShort(int i) {
		index += 2064013562;
		int i_24_ = ((buffer[index * -1990677291 - 1] & 0xff) + ((buffer[index * -1990677291 - 2] & 0xff) << 8));
		if (i_24_ > 32767) {
			i_24_ -= 65536;
		}
		return i_24_;
	}

	public int read24BitUnsignedInteger() {
		index += 948536695;
		return (((buffer[index * -1990677291 - 2] & 0xff) << 8) + ((buffer[index * -1990677291 - 3] & 0xff) << 16) + (buffer[-1990677291 * index - 1] & 0xff));
	}

	public int read24BitInteger(int i) {
		index += 948536695;
		int i_25_ = (((buffer[-1990677291 * index - 3] & 0xff) << 16) + ((buffer[index * -1990677291 - 2] & 0xff) << 8) + (buffer[-1990677291 * index - 1] & 0xff));
		if (i_25_ > 8388607) {
			i_25_ -= 16777216;
		}
		return i_25_;
	}

	public int method13085(int i) {
		index += -166940172;
		return ((buffer[index * -1990677291 - 4] & 0xff) + (((buffer[index * -1990677291 - 3] & 0xff) << 8) + (((buffer[-1990677291 * index - 2] & 0xff) << 16) + ((buffer[-1990677291 * index - 1] & 0xff) << 24))));
	}

	public long readLong(int i) {
		long l = readInt() & 0xffffffffL;
		long l_26_ = readInt() & 0xffffffffL;
		return l_26_ + (l << 32);
	}

	public void writeShort(int i, int i_27_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
	}

	public long method13089(int i, int i_28_) {
		if (--i < 0 || i > 7) {
			throw new IllegalArgumentException();
		}
		int i_29_ = i * 8;
		long l = 0L;
		for (/**/; i_29_ >= 0; i_29_ -= 8) {
			l |= ((buffer[(index += -1115476867) * -1990677291 - 1]) & 0xffL) << i_29_;
		}
		return l;
	}

	public String readNullString(int i) {
		if (buffer[-1990677291 * index] == 0) {
			index += -1115476867;
			return null;
		}
		return readString();
	}

	public RsByteBuffer(int i) {
		buffer = CircularBuffer.method8239(i, 1959390720);
		index = 0;
	}

	public String readGJString(int i) {
		byte i_30_ = buffer[(index += -1115476867) * -1990677291 - 1];
		if (0 != i_30_) {
			throw new IllegalStateException("");
		}
		int i_31_ = -1990677291 * index;
		while (buffer[(index += -1115476867) * -1990677291 - 1] != 0) {
			/* empty */
		}
		int i_32_ = index * -1990677291 - i_31_ - 1;
		if (i_32_ == 0) {
			return "";
		}
		return Class344.method6118(buffer, i_31_, i_32_, (byte) -81);
	}

	public int method13094(int i) {
		int i_39_ = buffer[-1990677291 * index] & 0xff;
		if (i_39_ < 128) {
			return readUnsignedByte() - 64;
		}
		return readUnsignedShort() - 49152;
	}
	
	public int readSmart2(int i) {
		int i_40_ = 0;
		int i_41_;
		for (i_41_ = readUnsignedSmart(2017494920); i_41_ == 32767; i_41_ = readUnsignedSmart(1731195561)) {
			i_40_ += 32767;
		}
		i_40_ += i_41_;
		return i_40_;
	}

	public int readBigSmart(byte i) {
		if (buffer[index * -1990677291] < 0) {
			return readInt() & 0x7fffffff;
		}
		return readUnsignedShort();
	}

	public int method13099(int i) {
		int i_42_ = buffer[(index += -1115476867) * -1990677291 - 1];
		int i_43_ = 0;
		for (/**/; i_42_ < 0; i_42_ = (buffer[(index += -1115476867) * -1990677291 - 1])) {
			i_43_ = (i_43_ | i_42_ & 0x7f) << 7;
		}
		return i_43_ | i_42_;
	}

	public void method13100(int[] is, int i) {
		int i_44_ = index * -1990677291 / 8;
		index = 0;
		for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
			int i_46_ = readInt();
			int i_47_ = readInt();
			int i_48_ = -957401312;
			int i_49_ = -1640531527;
			int i_50_ = 32;
			while (i_50_-- > 0) {
				i_47_ -= ((i_46_ << 4 ^ i_46_ >>> 5) + i_46_ ^ is[i_48_ >>> 11 & 0x3] + i_48_);
				i_48_ -= i_49_;
				i_46_ -= (i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ is[i_48_ & 0x3] + i_48_);
			}
			index -= -333880344;
			writeInt(i_46_);
			writeInt(i_47_);
		}
	}

	public void encryptWithXtea(int[] is, int i, int i_51_, int i_52_) {
		int i_53_ = index * -1990677291;
		index = -1115476867 * i;
		int i_54_ = (i_51_ - i) / 8;
		for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
			int i_56_ = readInt();
			int i_57_ = readInt();
			int i_58_ = 0;
			int i_59_ = -1640531527;
			int i_60_ = 32;
			while (i_60_-- > 0) {
				i_56_ += (i_57_ + (i_57_ << 4 ^ i_57_ >>> 5) ^ is[i_58_ & 0x3] + i_58_);
				i_58_ += i_59_;
				i_57_ += (i_56_ + (i_56_ << 4 ^ i_56_ >>> 5) ^ i_58_ + is[i_58_ >>> 11 & 0x3]);
			}
			index -= -333880344;
			writeInt(i_56_);
			writeInt(i_57_);
		}
		index = -1115476867 * i_53_;
	}

	public void applyRSA(BigInteger biginteger, BigInteger biginteger_61_) {
		int i_62_ = index * -1990677291;
		index = 0;
		byte[] is = new byte[i_62_];
		readBytes(is, 0, i_62_, 1787887302);
		BigInteger biginteger_63_ = new BigInteger(is);
		BigInteger biginteger_64_ = biginteger_63_.modPow(biginteger, biginteger_61_);
		byte[] is_65_ = biginteger_64_.toByteArray();
		index = 0;
		writeShort(is_65_.length, 1417031095);
		writeBytes(is_65_, 0, is_65_.length);
	}

	public int method13104(int i, int i_66_) {
		int i_67_ = Class455.method7559(buffer, i, -1990677291 * index, -1209894190);
		writeInt(i_67_);
		return i_67_;
	}

	public boolean method13105(byte i) {
		index -= -166940172;
		int i_68_ = Class455.method7559(buffer, 0, -1990677291 * index, -1770060686);
		int i_69_ = readInt();
		if (i_68_ == i_69_) {
			return true;
		}
		return false;
	}

	public void writeByteC(int i, int i_70_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (0 - i);
	}

	public void write128Byte(int i, int i_71_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (128 - i);
	}

	public int readUnsigned128Byte() {
		return (128 - (buffer[(index += -1115476867) * -1990677291 - 1]) & 0xff);
	}

	public byte readByte128(int i) {
		return (byte) ((buffer[(index += -1115476867) * -1990677291 - 1]) - 128);
	}

	public byte read128Byte(short i) {
		return (byte) (128 - (buffer[(index += -1115476867) * -1990677291 - 1]));
	}

	public void writeShort128(int i, int i_75_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (128 + i);
	}

	public void writeShortLE128(int i, int i_76_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i + 128);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
	}

	public int readShortLE(byte i) {
		index += 2064013562;
		return ((buffer[index * -1990677291 - 2] & 0xff) + ((buffer[-1990677291 * index - 1] & 0xff) << 8));
	}


	public int readShortLE128() {
		index += 2064013562;
		return (((buffer[-1990677291 * index - 1] & 0xff) << 8) + (buffer[index * -1990677291 - 2] - 128 & 0xff));
	}

	public int method13121(int i) {
		index += 2064013562;
		int i_77_ = ((buffer[-1990677291 * index - 2] & 0xff) + ((buffer[-1990677291 * index - 1] & 0xff) << 8));
		if (i_77_ > 32767) {
			i_77_ -= 65536;
		}
		return i_77_;
	}

	public int readUnsignedShort128(int i) {
		index += 2064013562;
		int i_78_ = ((buffer[-1990677291 * index - 1] - 128 & 0xff) + ((buffer[index * -1990677291 - 2] & 0xff) << 8));
		if (i_78_ > 32767) {
			i_78_ -= 65536;
		}
		return i_78_;
	}

	public int readUnsignedShortLE128(int i) {
		index += 2064013562;
		int i_79_ = ((buffer[-1990677291 * index - 2] - 128 & 0xff) + ((buffer[index * -1990677291 - 1] & 0xff) << 8));
		if (i_79_ > 32767) {
			i_79_ -= 65536;
		}
		return i_79_;
	}

	public void writeLEInt(int i, byte i_83_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 24);
	}

	public void writeIntV2(int i, byte i_84_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 24);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
	}

	public int readIntLE() {
		index += -166940172;
		return ((buffer[index * -1990677291 - 4] & 0xff) + (((buffer[-1990677291 * index - 2] & 0xff) << 16) + ((buffer[index * -1990677291 - 1] & 0xff) << 24) + ((buffer[-1990677291 * index - 3] & 0xff) << 8)));
	}

	public int readIntV1() {
		index += -166940172;
		return (((buffer[-1990677291 * index - 1] & 0xff) << 16) + ((buffer[-1990677291 * index - 2] & 0xff) << 24) + ((buffer[-1990677291 * index - 4] & 0xff) << 8) + (buffer[index * -1990677291 - 3] & 0xff));
	}

	public int readIntV2(int i) {
		index += -166940172;
		return (((buffer[-1990677291 * index - 1] & 0xff) << 8) + (((buffer[index * -1990677291 - 4] & 0xff) << 16) + ((buffer[index * -1990677291 - 3] & 0xff) << 24)) + (buffer[index * -1990677291 - 2] & 0xff));
	}

	public int method13132(int i) {
		index += 948536695;
		return ((buffer[-1990677291 * index - 2] & 0xff) + (((buffer[index * -1990677291 - 1] & 0xff) << 8) + ((buffer[-1990677291 * index - 3] & 0xff) << 16)));
	}

	public void readBytes(byte[] is, int i, int i_85_, int i_86_) {
		for (int i_87_ = i; i_87_ < i + i_85_; i_87_++) {
			is[i_87_] = buffer[(index += -1115476867) * -1990677291 - 1];
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_89_ = i;
			for (int i_90_ = 0; i_90_ < 8; i_90_++) {
				if (1 == (i_89_ & 0x1)) {
					i_89_ = i_89_ >>> 1 ^ ~0x12477cdf;
				} else {
					i_89_ >>>= 1;
				}
			}
			anIntArray7986[i] = i_89_;
		}
		aLongArray7979 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_91_ = 0; i_91_ < 8; i_91_++) {
				if (1L == (l & 0x1L)) {
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				} else {
					l >>>= 1;
				}
			}
			aLongArray7979[i] = l;
		}
	}

	public int readInt() {
		index += -166940172;
		return (((buffer[index * -1990677291 - 4] & 0xff) << 24) + ((buffer[index * -1990677291 - 3] & 0xff) << 16) + ((buffer[index * -1990677291 - 2] & 0xff) << 8) + (buffer[-1990677291 * index - 1] & 0xff));
	}

	public void writeString(String string) {
		int i_92_ = string.indexOf('\0');
		if (i_92_ >= 0) {
			throw new IllegalArgumentException("");
		}
		index += (Index.method5693(string, 0, string.length(), buffer, -1990677291 * index, -74015201) * -1115476867);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) 0;
	}

	public void writeIntV1(int i, int i_98_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 24);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 16);
	}

	public int readBigSmart() {
		if (buffer[-1990677291 * index] < 0) {
			return readInt() & 0x7fffffff;
		}
		int i_99_ = readUnsignedShort();
		if (i_99_ == 32767) {
			return -1;
		}
		return i_99_;
	}

	public int readUnsignedSmart(int i) {
		int i_111_ = buffer[index * -1990677291] & 0xff;
		if (i_111_ < 128) {
			return readUnsignedByte();
		}
		return readUnsignedShort() - 32768;
	}

	public long read5ByteInteger(int i) {
		long l = readUnsignedByte() & 0xffffffffL;
		long l_113_ = readInt() & 0xffffffffL;
		return (l << 32) + l_113_;
	}

	public void write24BitInt(int i, byte i_114_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
	}

	public void method13204(long l) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 32);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 24);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) (l >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (int) l;
	}

	public String readString() {
		int i_119_ = index * -1990677291;
		while (buffer[(index += -1115476867) * -1990677291 - 1] != 0) {
			/* empty */
		}
		int i_120_ = index * -1990677291 - i_119_ - 1;
		if (i_120_ == 0) {
			return "";
		}
		return Class344.method6118(buffer, i_119_, i_120_, (byte) -24);
	}

	public int readUnsignedByte128(int i) {
		return ((buffer[(index += -1115476867) * -1990677291 - 1] - 128) & 0xff);
	}

	public void method13232(int i, byte i_140_) {
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) i;
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 8);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 16);
		buffer[(index += -1115476867) * -1990677291 - 1] = (byte) (i >> 24);
	}

	public byte readByte(short i) {
		return buffer[(index += -1115476867) * -1990677291 - 1];
	}

	public String method13248(int i) {
		byte i_176_ = buffer[(index += -1115476867) * -1990677291 - 1];
		if (i_176_ != 0) {
			throw new IllegalStateException("");
		}
		int i_177_ = method13099(-154954210);
		if (-1990677291 * index + i_177_ > buffer.length) {
			throw new IllegalStateException("");
		}
		String string = Class271.method4824(buffer, -1990677291 * index, i_177_, 336004634);
		index += i_177_ * -1115476867;
		return string;
	}

	public void method13249(int[] is, int i, int i_178_, int i_179_) {
		int i_180_ = -1990677291 * index;
		index = -1115476867 * i;
		int i_181_ = (i_178_ - i) / 8;
		for (int i_182_ = 0; i_182_ < i_181_; i_182_++) {
			int i_183_ = readInt();
			int i_184_ = readInt();
			int i_185_ = -957401312;
			int i_186_ = -1640531527;
			int i_187_ = 32;
			while (i_187_-- > 0) {
				i_184_ -= ((i_183_ << 4 ^ i_183_ >>> 5) + i_183_ ^ is[i_185_ >>> 11 & 0x3] + i_185_);
				i_185_ -= i_186_;
				i_183_ -= (i_184_ + (i_184_ << 4 ^ i_184_ >>> 5) ^ i_185_ + is[i_185_ & 0x3]);
			}
			index -= -333880344;
			writeInt(i_183_);
			writeInt(i_184_);
		}
		index = -1115476867 * i_180_;
	}

	public byte readByteC(int i) {
		return (byte) (0 - (buffer[(index += -1115476867) * -1990677291 - 1]));
	}

	public int readUnsignedByteC(int i) {
		return (0 - (buffer[(index += -1115476867) * -1990677291 - 1]) & 0xff);
	}

	public long method13278(byte i) {
		long l = method13085(-1967517434) & 0xffffffffL;
		long l_190_ = method13085(341921667) & 0xffffffffL;
		return l + (l_190_ << 32);
	}

	public void method13281(int i, int i_192_) {
		buffer[-1990677291 * index - i - 2] = (byte) (i >> 8);
		buffer[-1990677291 * index - i - 1] = (byte) i;
	}

	static final void method13292(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		class527.intStackPtr -= 283782002;
		class118.anInt1441 = 304814545 * (class527.intStack[class527.intStackPtr * 1942118537]);
		class118.anInt1263 = ((class527.intStack[1942118537 * class527.intStackPtr + 1]) * -1208146817);
		Class109.method1858(class118, (byte) -27);
	}
}
