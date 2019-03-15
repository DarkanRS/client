import java.math.BigInteger;

public class RsByteBuffer extends Node {

	static int[] anIntArray7986 = new int[256];
	public static long[] aLongArray7979;
	public byte[] buffer;
	public int index;

	static {
		int i_0;
		for (i_0 = 0; i_0 < 256; i_0++) {
			int i_1 = i_0;

			for (int i_2 = 0; i_2 < 8; i_2++) {
				if ((i_1 & 0x1) == 1) {
					i_1 = i_1 >>> 1 ^ ~0x12477cdf;
				} else {
					i_1 >>>= 1;
				}
			}

			anIntArray7986[i_0] = i_1;
		}

		aLongArray7979 = new long[256];

		for (i_0 = 0; i_0 < 256; i_0++) {
			long long_4 = (long) i_0;

			for (int i_3 = 0; i_3 < 8; i_3++) {
				if ((long_4 & 0x1L) == 1L) {
					long_4 = long_4 >>> 1 ^ ~0x3693a86a2878f0bdL;
				} else {
					long_4 >>>= 1;
				}
			}

			aLongArray7979[i_0] = long_4;
		}

	}

	public RsByteBuffer(byte[] bytes_1) {
		this.buffer = bytes_1;
		this.index = 0;
	}

	public void method13059() {
		if (this.buffer != null) {
			Class351.method6197(this.buffer);
		}

		this.buffer = null;
	}

	public void writeByte(int i_1) {
		this.buffer[++this.index - 1] = (byte) i_1;
	}

	public void method13061(int i_1, int i_2) {
		this.buffer[this.index - i_1 - 1] = (byte) i_1;
	}

	public void writeLEShort(int i_1, byte b_2) {
		this.buffer[++this.index - 1] = (byte) i_1;
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
	}

	public void writeInt(int i_1) {
		this.buffer[++this.index - 1] = (byte) (i_1 >> 24);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) i_1;
	}

	public void writeShortLE(int i_1, short s_2) {
		this.buffer[++this.index - 1] = (byte) i_1;
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
	}

	public void writeLong(long long_1) {
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 56));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 48));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 40));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 32));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 24));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 16));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 8));
		this.buffer[++this.index - 1] = (byte) ((int) long_1);
	}

	public void method13068(long long_1, int i_3) {
		--i_3;
		if (i_3 >= 0 && i_3 <= 7) {
			for (int i_5 = i_3 * 8; i_5 >= 0; i_5 -= 8) {
				this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> i_5));
			}

		} else {
			throw new IllegalArgumentException();
		}
	}

	public void writeJagString(String string_1, int i_2) {
		int i_3 = string_1.indexOf(0);
		if (i_3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.buffer[++this.index - 1] = 0;
			this.index += Index.method5693(string_1, string_1.length(), this.buffer, this.index);
			this.buffer[++this.index - 1] = 0;
		}
	}

	public void method13071(CharSequence charsequence_1, byte b_2) {
		int i_3 = charsequence_1.length();
		int i_4 = 0;

		for (int i_5 = 0; i_5 < i_3; i_5++) {
			char var_6 = charsequence_1.charAt(i_5);
			if (var_6 <= 127) {
				++i_4;
			} else if (var_6 <= 2047) {
				i_4 += 2;
			} else {
				i_4 += 3;
			}
		}

		this.buffer[++this.index - 1] = 0;
		this.method13077(i_4, 1646116683);
		this.index += GrandExchangeSlot.method5914(this.buffer, this.index, charsequence_1);
	}

	public void writeBytes(byte[] bytes_1, int i_2, int i_3) {
		for (int i_4 = i_2; i_4 < i_3 + i_2; i_4++) {
			this.buffer[++this.index - 1] = bytes_1[i_4];
		}

	}

	public void method13073(int i_1) {
		this.buffer[this.index - i_1 - 4] = (byte) (i_1 >> 24);
		this.buffer[this.index - i_1 - 3] = (byte) (i_1 >> 16);
		this.buffer[this.index - i_1 - 2] = (byte) (i_1 >> 8);
		this.buffer[this.index - i_1 - 1] = (byte) i_1;
	}

	public int readUnsignedShort128() {
		this.index += 2;
		return (this.buffer[this.index - 1] - 128 & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8);
	}

	public void writeByte128(int i_1, int i_2) {
		this.buffer[++this.index - 1] = (byte) (i_1 + 128);
	}

	public void method13076(int i_1) {
		if (i_1 >= 0 && i_1 < 128) {
			this.writeByte(i_1);
		} else {
			if (i_1 < 0 || i_1 >= 32768) {
				throw new IllegalArgumentException();
			}

			this.writeShort(i_1 + 32768);
		}

	}

	public void method13077(int i_1, int i_2) {
		if ((i_1 & ~0x7f) != 0) {
			if ((i_1 & ~0x3fff) != 0) {
				if ((i_1 & ~0x1fffff) != 0) {
					if ((i_1 & ~0xfffffff) != 0) {
						this.writeByte(i_1 >>> 28 | 0x80);
					}

					this.writeByte(i_1 >>> 21 | 0x80);
				}

				this.writeByte(i_1 >>> 14 | 0x80);
			}

			this.writeByte(i_1 >>> 7 | 0x80);
		}

		this.writeByte(i_1 & 0x7f);
	}

	public int readUnsignedByte() {
		return this.buffer[++this.index - 1] & 0xff;
	}

	public int readUnsignedShort() {
		this.index += 2;
		return (this.buffer[this.index - 1] & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8);
	}

	public int readShort() {
		this.index += 2;
		int i_2 = (this.buffer[this.index - 1] & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8);
		if (i_2 > 32767) {
			i_2 -= 65536;
		}

		return i_2;
	}

	public int read24BitUnsignedInteger() {
		this.index += 3;
		return ((this.buffer[this.index - 3] & 0xff) << 16) + (this.buffer[this.index - 1] & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8);
	}

	public int read24BitInteger(int i_1) {
		this.index += 3;
		int i_2 = ((this.buffer[this.index - 3] & 0xff) << 16) + (this.buffer[this.index - 1] & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8);
		if (i_2 > 8388607) {
			i_2 -= 16777216;
		}

		return i_2;
	}

	public int method13085(int i_1) {
		this.index += 4;
		return (this.buffer[this.index - 4] & 0xff) + ((this.buffer[this.index - 3] & 0xff) << 8) + ((this.buffer[this.index - 2] & 0xff) << 16) + ((this.buffer[this.index - 1] & 0xff) << 24);
	}

	public long readLong() {
		long long_2 = (long) this.readInt() & 0xffffffffL;
		long long_4 = (long) this.readInt() & 0xffffffffL;
		return long_4 + (long_2 << 32);
	}

	public void writeShort(int i_1) {
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) i_1;
	}

	public long method13089(int i_1) {
		--i_1;
		if (i_1 >= 0 && i_1 <= 7) {
			int i_3 = i_1 * 8;

			long long_4;
			for (long_4 = 0L; i_3 >= 0; i_3 -= 8) {
				long_4 |= ((long) this.buffer[++this.index - 1] & 0xffL) << i_3;
			}

			return long_4;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String readNullString() {
		if (this.buffer[this.index] == 0) {
			++this.index;
			return null;
		} else {
			return this.readString();
		}
	}

	public RsByteBuffer(int i_1) {
		this.buffer = CircularBuffer.createBuffer(i_1);
		this.index = 0;
	}

	public String readGJString(int i_1) {
		byte b_2 = this.buffer[++this.index - 1];
		if (b_2 != 0) {
			throw new IllegalStateException("");
		} else {
			int i_3 = this.index;

			while (this.buffer[++this.index - 1] != 0) {
				;
			}

			int i_4 = this.index - i_3 - 1;
			return i_4 == 0 ? "" : Class344.method6118(this.buffer, i_3, i_4, (byte) -81);
		}
	}

	public int readSmart() {
		int i_2 = this.buffer[this.index] & 0xff;
		return i_2 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	public int readSmart2(int i_1) {
		int i_2 = 0;

		int i_3;
		for (i_3 = this.readUnsignedSmart(2017494920); i_3 == 32767; i_3 = this.readUnsignedSmart(1731195561)) {
			i_2 += 32767;
		}

		i_2 += i_3;
		return i_2;
	}

	public int readUnsignedBigSmart() {
		return this.buffer[this.index] < 0 ? this.readInt() & 0x7fffffff : this.readUnsignedShort();
	}

	public int method13099(int i_1) {
		byte b_2 = this.buffer[++this.index - 1];

		int i_3;
		for (i_3 = 0; b_2 < 0; b_2 = this.buffer[++this.index - 1]) {
			i_3 = (i_3 | b_2 & 0x7f) << 7;
		}

		return i_3 | b_2;
	}

	public void method13100(int[] ints_1, int i_2) {
		int i_3 = this.index / 8;
		this.index = 0;

		for (int i_4 = 0; i_4 < i_3; i_4++) {
			int i_5 = this.readInt();
			int i_6 = this.readInt();
			int i_7 = -957401312;
			int i_8 = -1640531527;

			for (int i_9 = 32; i_9-- > 0; i_5 -= i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3]) {
				i_6 -= i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7;
				i_7 -= i_8;
			}

			this.index -= 8;
			this.writeInt(i_5);
			this.writeInt(i_6);
		}

	}

	public void encryptWithXtea(int[] ints_1, int i_2, int i_3, int i_4) {
		int i_5 = this.index;
		this.index = i_2;
		int i_6 = (i_3 - i_2) / 8;

		for (int i_7 = 0; i_7 < i_6; i_7++) {
			int i_8 = this.readInt();
			int i_9 = this.readInt();
			int i_10 = 0;
			int i_11 = -1640531527;

			for (int i_12 = 32; i_12-- > 0; i_9 += i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10) {
				i_8 += i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3];
				i_10 += i_11;
			}

			this.index -= 8;
			this.writeInt(i_8);
			this.writeInt(i_9);
		}

		this.index = i_5;
	}

	public void applyRSA() {
		int i_3 = this.index;
		this.index = 0;
		byte[] bytes_4 = new byte[i_3];
		this.readBytes(bytes_4, 0, i_3);
		BigInteger biginteger_5 = new BigInteger(bytes_4);
		BigInteger biginteger_6 = biginteger_5.modPow(Loader.RSA_PUBLIC_EXPONENT, Loader.RSA_PUBLIC_MODULUS);
		byte[] bytes_7 = biginteger_6.toByteArray();
		this.index = 0;
		this.writeShort(bytes_7.length);
		this.writeBytes(bytes_7, 0, bytes_7.length);
	}

	public int method13104(int i_1) {
		int i_3 = Class455.getCRC(this.buffer, i_1, this.index);
		this.writeInt(i_3);
		return i_3;
	}

	public boolean method13105() {
		this.index -= 4;
		int i_2 = Class455.getCRC(this.buffer, 0, this.index);
		int i_3 = this.readInt();
		return i_2 == i_3;
	}

	public void writeByteC(int i_1) {
		this.buffer[++this.index - 1] = (byte) (0 - i_1);
	}

	public void write128Byte(int i_1, int i_2) {
		this.buffer[++this.index - 1] = (byte) (128 - i_1);
	}

	public int readUnsigned128Byte() {
		return 128 - this.buffer[++this.index - 1] & 0xff;
	}

	public byte readByte128(int i_1) {
		return (byte) (this.buffer[++this.index - 1] - 128);
	}

	public byte read128Byte(short s_1) {
		return (byte) (128 - this.buffer[++this.index - 1]);
	}

	public void writeShort128(int i_1) {
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) (i_1 + 128);
	}

	public void writeShortLE128(int i_1) {
		this.buffer[++this.index - 1] = (byte) (i_1 + 128);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
	}

	public int readShortLE() {
		this.index += 2;
		return ((this.buffer[this.index - 1] & 0xff) << 8) + (this.buffer[this.index - 2] & 0xff);
	}

	public int readUnsignedShortLE128() {
		this.index += 2;
		return ((this.buffer[this.index - 1] & 0xff) << 8) + (this.buffer[this.index - 2] - 128 & 0xff);
	}

	public int method13121() {
		this.index += 2;
		int i_2 = ((this.buffer[this.index - 1] & 0xff) << 8) + (this.buffer[this.index - 2] & 0xff);
		if (i_2 > 32767) {
			i_2 -= 65536;
		}

		return i_2;
	}

	public int readShort128() {
		this.index += 2;
		int i_2 = (this.buffer[this.index - 1] - 128 & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8);
		if (i_2 > 32767) {
			i_2 -= 65536;
		}

		return i_2;
	}

	public int readShortLE128() {
		this.index += 2;
		int i_2 = ((this.buffer[this.index - 1] & 0xff) << 8) + (this.buffer[this.index - 2] - 128 & 0xff);
		if (i_2 > 32767) {
			i_2 -= 65536;
		}

		return i_2;
	}

	public void writeLEInt(int i_1, byte b_2) {
		this.buffer[++this.index - 1] = (byte) i_1;
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 24);
	}

	public void writeIntV2(int i_1) {
		this.buffer[++this.index - 1] = (byte) (i_1 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 24);
		this.buffer[++this.index - 1] = (byte) i_1;
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
	}

	public int readIntLE() {
		this.index += 4;
		return (this.buffer[this.index - 4] & 0xff) + ((this.buffer[this.index - 3] & 0xff) << 8) + ((this.buffer[this.index - 2] & 0xff) << 16) + ((this.buffer[this.index - 1] & 0xff) << 24);
	}

	public int readIntV1() {
		this.index += 4;
		return ((this.buffer[this.index - 2] & 0xff) << 24) + ((this.buffer[this.index - 4] & 0xff) << 8) + (this.buffer[this.index - 3] & 0xff) + ((this.buffer[this.index - 1] & 0xff) << 16);
	}

	public int readIntV2() {
		this.index += 4;
		return ((this.buffer[this.index - 1] & 0xff) << 8) + ((this.buffer[this.index - 4] & 0xff) << 16) + (this.buffer[this.index - 2] & 0xff) + ((this.buffer[this.index - 3] & 0xff) << 24);
	}

	public int method13132() {
		this.index += 3;
		return ((this.buffer[this.index - 1] & 0xff) << 8) + ((this.buffer[this.index - 3] & 0xff) << 16) + (this.buffer[this.index - 2] & 0xff);
	}

	public void readBytes(byte[] bytes_1, int i_2, int i_3) {
		for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
			bytes_1[i_5] = this.buffer[++this.index - 1];
		}

	}

	public int readInt() {
		this.index += 4;
		return ((this.buffer[this.index - 3] & 0xff) << 16) + (this.buffer[this.index - 1] & 0xff) + ((this.buffer[this.index - 2] & 0xff) << 8) + ((this.buffer[this.index - 4] & 0xff) << 24);
	}

	public void writeString(String string_1) {
		int i_2 = string_1.indexOf(0);
		if (i_2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.index += Index.method5693(string_1, string_1.length(), this.buffer, this.index);
			this.buffer[++this.index - 1] = 0;
		}
	}

	public void writeIntV1(int i_1, int i_2) {
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) i_1;
		this.buffer[++this.index - 1] = (byte) (i_1 >> 24);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 16);
	}

	public int readBigSmart() {
		if (this.buffer[this.index] < 0) {
			return this.readInt() & 0x7fffffff;
		} else {
			int i_1 = this.readUnsignedShort();
			return i_1 == 32767 ? -1 : i_1;
		}
	}

	public int readUnsignedSmart(int i_1) {
		int i_2 = this.buffer[this.index] & 0xff;
		return i_2 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	public long read5ByteInteger() {
		long long_2 = (long) this.readUnsignedByte() & 0xffffffffL;
		long long_4 = (long) this.readInt() & 0xffffffffL;
		return (long_2 << 32) + long_4;
	}

	public void write24BitInt(int i_1) {
		this.buffer[++this.index - 1] = (byte) (i_1 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) i_1;
	}

	public void method13204(long long_1) {
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 32));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 24));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 16));
		this.buffer[++this.index - 1] = (byte) ((int) (long_1 >> 8));
		this.buffer[++this.index - 1] = (byte) ((int) long_1);
	}

	public String readString() {
		int i_1 = this.index;

		while (this.buffer[++this.index - 1] != 0) {
			;
		}

		int i_2 = this.index - i_1 - 1;
		return i_2 == 0 ? "" : Class344.method6118(this.buffer, i_1, i_2, (byte) -24);
	}

	public int readUnsignedByte128() {
		return this.buffer[++this.index - 1] - 128 & 0xff;
	}

	public void method13232(int i_1, byte b_2) {
		this.buffer[++this.index - 1] = (byte) i_1;
		this.buffer[++this.index - 1] = (byte) (i_1 >> 8);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_1 >> 24);
	}

	public byte readByte() {
		return this.buffer[++this.index - 1];
	}

	public String method13248(int i_1) {
		byte b_2 = this.buffer[++this.index - 1];
		if (b_2 != 0) {
			throw new IllegalStateException("");
		} else {
			int i_3 = this.method13099(-154954210);
			if (i_3 + this.index > this.buffer.length) {
				throw new IllegalStateException("");
			} else {
				String string_4 = Class271.method4824(this.buffer, this.index, i_3);
				this.index += i_3;
				return string_4;
			}
		}
	}

	public void method13249(int[] ints_1, int i_3) {
		int i_5 = this.index;
		this.index = 5;
		int i_6 = (i_3 - 5) / 8;

		for (int i_7 = 0; i_7 < i_6; i_7++) {
			int i_8 = this.readInt();
			int i_9 = this.readInt();
			int i_10 = -957401312;
			int i_11 = -1640531527;

			for (int i_12 = 32; i_12-- > 0; i_8 -= i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3]) {
				i_9 -= i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10;
				i_10 -= i_11;
			}

			this.index -= 8;
			this.writeInt(i_8);
			this.writeInt(i_9);
		}

		this.index = i_5;
	}

	public byte readByteC(int i_1) {
		return (byte) (0 - this.buffer[++this.index - 1]);
	}

	public int readUnsignedByteC() {
		return 0 - this.buffer[++this.index - 1] & 0xff;
	}

	public long method13278(byte b_1) {
		long long_2 = (long) this.method13085(-1967517434) & 0xffffffffL;
		long long_4 = (long) this.method13085(341921667) & 0xffffffffL;
		return long_2 + (long_4 << 32);
	}

	public void method13281(int i_1) {
		this.buffer[this.index - i_1 - 2] = (byte) (i_1 >> 8);
		this.buffer[this.index - i_1 - 1] = (byte) i_1;
	}

	static final void method13292(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1441 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1263 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -27);
	}

}
