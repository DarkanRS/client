package com.jagex;

import java.math.BigInteger;

import com.Loader;

public class ByteBuf extends Node {

	public static class Bit extends ByteBuf {
		static int[] anIntArray9610 = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
		ISAACCipher isaac;
		int anInt9608;

		public Bit(int i_1) {
			super(i_1);
		}

		public void finishBitAccess() {
			index = (anInt9608 + 7) / 8;
		}

		public void initBitAccess() {
			anInt9608 = index * 8;
		}

		public boolean peekIsIsaacSmart() {
			int i_2 = buffer[index] - isaac.peek() & 0xff;
			return i_2 >= 128;
		}

		public int readableBits(int i_1) {
			return i_1 * 8 - anInt9608;
		}

		public int readBits(int i_1) {
			int i_3 = anInt9608 >> 3;
			int i_4 = 8 - (anInt9608 & 0x7);
			int i_5 = 0;

			for (anInt9608 += i_1; i_1 > i_4; i_4 = 8) {
				i_5 += (buffer[i_3++] & anIntArray9610[i_4]) << i_1 - i_4;
				i_1 -= i_4;
			}

			if (i_4 == i_1)
				i_5 += buffer[i_3] & anIntArray9610[i_4];
			else
				i_5 += buffer[i_3] >> i_4 - i_1 & anIntArray9610[i_1];

				return i_5;
		}

		public void readBytes(byte[] bytes_1, int i_3) {
			for (int i_5 = 0; i_5 < i_3; i_5++)
				bytes_1[i_5] = (byte) (buffer[++index - 1] - isaac.nextInt());

		}

		public int readEncryptedSmart() {
			int i_1 = buffer[++index - 1] - isaac.nextInt() & 0xff;
			return i_1 < 128 ? i_1 : (i_1 - 128 << 8) + (buffer[++index - 1] - isaac.nextInt() & 0xff);
		}

		public void setIsaacCipher(ISAACCipher isaaccipher_1) {
			isaac = isaaccipher_1;
		}

		public void writeIsaacByte(int i_1) {
			buffer[++index - 1] = (byte) (i_1 + isaac.nextInt());
		}

	}
	public static long[] aLongArray7979;

	static int[] anIntArray7986 = new int[256];

	static {
		int i_0;
		for (i_0 = 0; i_0 < 256; i_0++) {
			int i_1 = i_0;
			for (int i_2 = 0; i_2 < 8; i_2++)
				if ((i_1 & 0x1) == 1)
					i_1 = i_1 >>> 1 ^ -306674912;
		else
			i_1 >>>= 1;
			anIntArray7986[i_0] = i_1;
		}
		aLongArray7979 = new long[256];
		for (i_0 = 0; i_0 < 256; i_0++) {
			long long_4 = i_0;
			for (int i_3 = 0; i_3 < 8; i_3++)
				if ((long_4 & 0x1L) == 1L)
					long_4 = long_4 >>> 1 ^ -3932672073523589310L;
		else
			long_4 >>>= 1;
			aLongArray7979[i_0] = long_4;
		}
	}
	public static int writeHuffmanString(ByteBuf buffer, String message) {
		int i_3 = buffer.index;
		byte[] bytes_4 = LinkedNodeList.method7885(message);
		buffer.method13076(bytes_4.length);
		buffer.index += Class113.HUFFMAN.method1971(bytes_4, 0, bytes_4.length, buffer.buffer, buffer.index);
		return buffer.index - i_3;
	}

	public byte[] buffer;

	public int index;

	public ByteBuf(byte[] bytes_1) {
		buffer = bytes_1;
		index = 0;
	}

	public ByteBuf(int i_1) {
		buffer = CircularBuffer.createBuffer(i_1);
		index = 0;
	}

	public void applyRSA() {
		int i_3 = index;
		index = 0;
		byte[] bytes_4 = new byte[i_3];
		readBytes(bytes_4, 0, i_3);
		BigInteger biginteger_5 = new BigInteger(bytes_4);
		BigInteger biginteger_6 = biginteger_5.modPow(Loader.RSA_PUBLIC_EXPONENT, Loader.RSA_PUBLIC_MODULUS);
		byte[] bytes_7 = biginteger_6.toByteArray();
		index = 0;
		writeShort(bytes_7.length);
		writeBytes(bytes_7, 0, bytes_7.length);
	}

	public boolean checkCRC() {
		index -= 4;
		int i_2 = Class455.getCRC(buffer, 0, index);
		int i_3 = readInt();
		return i_2 == i_3;
	}

	public void encryptWithXtea(int[] keys, int start, int end) {
		int i_5 = index;
		index = start;
		int i_6 = (end - start) / 8;
		for (int i_7 = 0; i_7 < i_6; i_7++) {
			int i_8 = readInt();
			int i_9 = readInt();
			int i_10 = 0;
			int i_11 = -1640531527;
			for (int i_12 = 32; i_12-- > 0; i_9 += i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ keys[i_10 >>> 11 & 0x3] + i_10) {
				i_8 += i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + keys[i_10 & 0x3];
				i_10 += i_11;
			}
			index -= 8;
			writeInt(i_8);
			writeInt(i_9);
		}
		index = i_5;
	}

	public void encryptXtea(int[] ints_1) {
		int i_3 = index / 8;
		index = 0;
		for (int i_4 = 0; i_4 < i_3; i_4++) {
			int i_5 = readInt();
			int i_6 = readInt();
			int i_7 = -957401312;
			int i_8 = -1640531527;
			for (int i_9 = 32; i_9-- > 0; i_5 -= i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3]) {
				i_6 -= i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7;
				i_7 -= i_8;
			}
			index -= 8;
			writeInt(i_5);
			writeInt(i_6);
		}
	}

	public void method13059() {
		if (buffer != null)
			Class351.method6197(buffer);
		buffer = null;
	}

	public void method13068(long long_1, int i_3) {
		--i_3;
		if ((i_3 < 0) || (i_3 > 7))
			throw new IllegalArgumentException();
		for (int i_5 = i_3 * 8; i_5 >= 0; i_5 -= 8)
			buffer[++index - 1] = (byte) ((int) (long_1 >> i_5));
	}

	public void method13071(CharSequence charsequence_1) {
		int i_3 = charsequence_1.length();
		int i_4 = 0;
		for (int i_5 = 0; i_5 < i_3; i_5++) {
			char var_6 = charsequence_1.charAt(i_5);
			if (var_6 <= 127)
				++i_4;
			else if (var_6 <= 2047)
				i_4 += 2;
			else
				i_4 += 3;
		}
		buffer[++index - 1] = 0;
		method13077(i_4);
		index += GrandExchangeSlot.method5914(buffer, index, charsequence_1);
	}

	public void method13073(int i_1) {
		buffer[index - i_1 - 4] = (byte) (i_1 >> 24);
		buffer[index - i_1 - 3] = (byte) (i_1 >> 16);
		buffer[index - i_1 - 2] = (byte) (i_1 >> 8);
		buffer[index - i_1 - 1] = (byte) i_1;
	}

	public void method13076(int i_1) {
		if (i_1 >= 0 && i_1 < 128)
			writeByte(i_1);
		else {
			if (i_1 < 0 || i_1 >= 32768)
				throw new IllegalArgumentException();
			writeShort(i_1 + 32768);
		}
	}

	public void method13077(int i_1) {
		if ((i_1 & -128) != 0) {
			if ((i_1 & -16384) != 0) {
				if ((i_1 & -2097152) != 0) {
					if ((i_1 & -268435456) != 0)
						writeByte(i_1 >>> 28 | 0x80);
					writeByte(i_1 >>> 21 | 0x80);
				}
				writeByte(i_1 >>> 14 | 0x80);
			}
			writeByte(i_1 >>> 7 | 0x80);
		}
		writeByte(i_1 & 0x7f);
	}

	public int method13085() {
		index += 4;
		return (buffer[index - 4] & 0xff) + ((buffer[index - 3] & 0xff) << 8) + ((buffer[index - 2] & 0xff) << 16) + ((buffer[index - 1] & 0xff) << 24);
	}

	public int method13099() {
		byte b_2 = buffer[++index - 1];
		int i_3;
		for (i_3 = 0; b_2 < 0; b_2 = buffer[++index - 1])
			i_3 = (i_3 | b_2 & 0x7f) << 7;
		return i_3 | b_2;
	}

	public int method13121() {
		index += 2;
		int i_2 = ((buffer[index - 1] & 0xff) << 8) + (buffer[index - 2] & 0xff);
		if (i_2 > 32767)
			i_2 -= 65536;
		return i_2;
	}

	public int method13132() {
		index += 3;
		return ((buffer[index - 1] & 0xff) << 8) + ((buffer[index - 3] & 0xff) << 16) + (buffer[index - 2] & 0xff);
	}

	public void method13204(long long_1) {
		buffer[++index - 1] = (byte) ((int) (long_1 >> 32));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 24));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 16));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 8));
		buffer[++index - 1] = (byte) ((int) long_1);
	}

	public void method13232(int i_1) {
		buffer[++index - 1] = (byte) i_1;
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) (i_1 >> 16);
		buffer[++index - 1] = (byte) (i_1 >> 24);
	}

	public String method13248() {
		byte b_2 = buffer[++index - 1];
		if (b_2 != 0)
			throw new IllegalStateException("");
		int i_3 = method13099();
		if (i_3 + index > buffer.length)
			throw new IllegalStateException("");
		else {
			String string_4 = Class271.method4824(buffer, index, i_3);
			index += i_3;
			return string_4;
		}
	}

	public void method13249(int[] ints_1, int i_3) {
		int i_5 = index;
		index = 5;
		int i_6 = (i_3 - 5) / 8;
		for (int i_7 = 0; i_7 < i_6; i_7++) {
			int i_8 = readInt();
			int i_9 = readInt();
			int i_10 = -957401312;
			int i_11 = -1640531527;
			for (int i_12 = 32; i_12-- > 0; i_8 -= i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3]) {
				i_9 -= i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10;
				i_10 -= i_11;
			}
			index -= 8;
			writeInt(i_8);
			writeInt(i_9);
		}
		index = i_5;
	}

	public long method13278() {
		long long_2 = method13085() & 0xffffffffL;
		long long_4 = method13085() & 0xffffffffL;
		return long_2 + (long_4 << 32);
	}

	public byte read128Byte() {
		return (byte) (128 - buffer[++index - 1]);
	}

	public int read24BitInteger() {
		index += 3;
		int i_2 = ((buffer[index - 3] & 0xff) << 16) + (buffer[index - 1] & 0xff) + ((buffer[index - 2] & 0xff) << 8);
		if (i_2 > 8388607)
			i_2 -= 16777216;
		return i_2;
	}

	public int read24BitUnsignedInteger() {
		index += 3;
		return ((buffer[index - 3] & 0xff) << 16) + (buffer[index - 1] & 0xff) + ((buffer[index - 2] & 0xff) << 8);
	}

	public long read5ByteInteger() {
		long long_2 = readUnsignedByte() & 0xffffffffL;
		long long_4 = readInt() & 0xffffffffL;
		return (long_2 << 32) + long_4;
	}

	public int readBigSmart() {
		if (buffer[index] < 0)
			return readInt() & 0x7fffffff;
		int i_1 = readUnsignedShort();
		return i_1 == 32767 ? -1 : i_1;
	}

	public byte readByte() {
		return buffer[++index - 1];
	}

	public byte readByte128() {
		return (byte) (buffer[++index - 1] - 128);
	}

	public byte readByteC() {
		return (byte) (-buffer[++index - 1]);
	}

	public void readBytes(byte[] bytes_1, int i_2, int i_3) {
		for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++)
			bytes_1[i_5] = buffer[++index - 1];
	}

	public String readGJString() {
		byte b = buffer[++index - 1];
		if (b != 0)
			throw new IllegalStateException("");
		int idx = index;
		while (buffer[++index - 1] != 0) {
		}
		int i_4 = index - idx - 1;
		return i_4 == 0 ? "" : Utils.readString(buffer, idx, i_4);
	}

	public int readInt() {
		index += 4;
		return ((buffer[index - 3] & 0xff) << 16) + (buffer[index - 1] & 0xff) + ((buffer[index - 2] & 0xff) << 8) + ((buffer[index - 4] & 0xff) << 24);
	}

	public int readIntLE() {
		index += 4;
		return (buffer[index - 4] & 0xff) + ((buffer[index - 3] & 0xff) << 8) + ((buffer[index - 2] & 0xff) << 16) + ((buffer[index - 1] & 0xff) << 24);
	}

	public int readIntV1() {
		index += 4;
		return ((buffer[index - 2] & 0xff) << 24) + ((buffer[index - 4] & 0xff) << 8) + (buffer[index - 3] & 0xff) + ((buffer[index - 1] & 0xff) << 16);
	}

	public int readIntV2() {
		index += 4;
		return ((buffer[index - 1] & 0xff) << 8) + ((buffer[index - 4] & 0xff) << 16) + (buffer[index - 2] & 0xff) + ((buffer[index - 3] & 0xff) << 24);
	}

	public long readLong() {
		long long_2 = readInt() & 0xffffffffL;
		long long_4 = readInt() & 0xffffffffL;
		return long_4 + (long_2 << 32);
	}

	public String readNullString() {
		if (buffer[index] == 0) {
			++index;
			return null;
		}
		return readString();
	}

	public int readShort() {
		index += 2;
		int i_2 = (buffer[index - 1] & 0xff) + ((buffer[index - 2] & 0xff) << 8);
		if (i_2 > 32767)
			i_2 -= 65536;
		return i_2;
	}

	public int readShort128() {
		index += 2;
		int i_2 = (buffer[index - 1] - 128 & 0xff) + ((buffer[index - 2] & 0xff) << 8);
		if (i_2 > 32767)
			i_2 -= 65536;
		return i_2;
	}

	public int readShortLE() {
		index += 2;
		return ((buffer[index - 1] & 0xff) << 8) + (buffer[index - 2] & 0xff);
	}

	public int readShortLE128() {
		index += 2;
		int i_2 = ((buffer[index - 1] & 0xff) << 8) + (buffer[index - 2] - 128 & 0xff);
		if (i_2 > 32767)
			i_2 -= 65536;
		return i_2;
	}

	public long readSize(int i_1) {
		--i_1;
		if ((i_1 < 0) || (i_1 > 7))
			throw new IllegalArgumentException();
		int i_3 = i_1 * 8;
		long long_4;
		for (long_4 = 0L; i_3 >= 0; i_3 -= 8)
			long_4 |= (buffer[++index - 1] & 0xffL) << i_3;
		return long_4;
	}

	public int readSmart() {
		int i_2 = buffer[index] & 0xff;
		return i_2 < 128 ? readUnsignedByte() : readUnsignedShort() - 32768;
	}

	public String readString() {
		int i_1 = index;
		while (buffer[++index - 1] != 0) {
		}
		int i_2 = index - i_1 - 1;
		return i_2 == 0 ? "" : Utils.readString(buffer, i_1, i_2);
	}

	public int readSum() {
		int i_2 = 0;
		int i_3;
		for (i_3 = readSmart(); i_3 == 32767; i_3 = readSmart())
			i_2 += 32767;
		i_2 += i_3;
		return i_2;
	}

	public int readUnsigned128Byte() {
		return 128 - buffer[++index - 1] & 0xff;
	}

	public int readUnsignedBigSmart() {
		return buffer[index] < 0 ? readInt() & 0x7fffffff : readUnsignedShort();
	}

	public int readUnsignedByte() {
		return buffer[++index - 1] & 0xff;
	}

	public int readUnsignedByte128() {
		return buffer[++index - 1] - 128 & 0xff;
	}

	public int readUnsignedByteC() {
		return -buffer[++index - 1] & 0xff;
	}

	public int readUnsignedShort() {
		index += 2;
		return (buffer[index - 1] & 0xff) + ((buffer[index - 2] & 0xff) << 8);
	}

	public int readUnsignedShort128() {
		index += 2;
		return (buffer[index - 1] - 128 & 0xff) + ((buffer[index - 2] & 0xff) << 8);
	}

	public int readUnsignedShortLE128() {
		index += 2;
		return ((buffer[index - 1] & 0xff) << 8) + (buffer[index - 2] - 128 & 0xff);
	}

	public int readUnsignedSmart() {
		int i_2 = buffer[index] & 0xff;
		return i_2 < 128 ? readUnsignedByte() - 64 : readUnsignedShort() - 49152;
	}

	public void write128Byte(int i_1) {
		buffer[++index - 1] = (byte) (128 - i_1);
	}

	public void write24BitInt(int i_1) {
		buffer[++index - 1] = (byte) (i_1 >> 16);
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) i_1;
	}

	public void writeByte(int i_1) {
		buffer[++index - 1] = (byte) i_1;
	}

	public void writeByte128(int i_1) {
		buffer[++index - 1] = (byte) (i_1 + 128);
	}

	public void writeByteC(int i_1) {
		buffer[++index - 1] = (byte) (-i_1);
	}

	public void writeBytes(byte[] bytes_1, int i_2, int i_3) {
		for (int i_4 = i_2; i_4 < i_3 + i_2; i_4++)
			buffer[++index - 1] = bytes_1[i_4];
	}

	public int writeCRC(int i_1) {
		int i_3 = Class455.getCRC(buffer, i_1, index);
		writeInt(i_3);
		return i_3;
	}

	public void writeIndex(int i_1) {
		buffer[index - i_1 - 1] = (byte) i_1;
	}

	public void writeInt(int i_1) {
		buffer[++index - 1] = (byte) (i_1 >> 24);
		buffer[++index - 1] = (byte) (i_1 >> 16);
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) i_1;
	}

	public void writeIntLE(int i_1) {
		buffer[++index - 1] = (byte) i_1;
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) (i_1 >> 16);
		buffer[++index - 1] = (byte) (i_1 >> 24);
	}

	public void writeIntV1(int i_1) {
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) i_1;
		buffer[++index - 1] = (byte) (i_1 >> 24);
		buffer[++index - 1] = (byte) (i_1 >> 16);
	}

	public void writeIntV2(int i_1) {
		buffer[++index - 1] = (byte) (i_1 >> 16);
		buffer[++index - 1] = (byte) (i_1 >> 24);
		buffer[++index - 1] = (byte) i_1;
		buffer[++index - 1] = (byte) (i_1 >> 8);
	}

	public void writeJagString(String string_1) {
		int i_3 = string_1.indexOf(0);
		if (i_3 >= 0)
			throw new IllegalArgumentException("");
		buffer[++index - 1] = 0;
		index += Index.method5693(string_1, string_1.length(), buffer, index);
		buffer[++index - 1] = 0;
	}

	public void writeLength(int i_1) {
		buffer[index - i_1 - 2] = (byte) (i_1 >> 8);
		buffer[index - i_1 - 1] = (byte) i_1;
	}

	public void writeLEShort(int i_1) {
		buffer[++index - 1] = (byte) i_1;
		buffer[++index - 1] = (byte) (i_1 >> 8);
	}

	public void writeLong(long long_1) {
		buffer[++index - 1] = (byte) ((int) (long_1 >> 56));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 48));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 40));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 32));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 24));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 16));
		buffer[++index - 1] = (byte) ((int) (long_1 >> 8));
		buffer[++index - 1] = (byte) ((int) long_1);
	}

	public void writeShort(int i_1) {
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) i_1;
	}

	public void writeShort128(int i_1) {
		buffer[++index - 1] = (byte) (i_1 >> 8);
		buffer[++index - 1] = (byte) (i_1 + 128);
	}

	public void writeShortLE(int i_1) {
		buffer[++index - 1] = (byte) i_1;
		buffer[++index - 1] = (byte) (i_1 >> 8);
	}

	public void writeShortLE128(int i_1) {
		buffer[++index - 1] = (byte) (i_1 + 128);
		buffer[++index - 1] = (byte) (i_1 >> 8);
	}

	public void writeString(String string_1) {
		int i_2 = string_1.indexOf(0);
		if (i_2 >= 0)
			throw new IllegalArgumentException("");
		index += Index.method5693(string_1, string_1.length(), buffer, index);
		buffer[++index - 1] = 0;
	}
}
