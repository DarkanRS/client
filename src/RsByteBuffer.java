/* RsByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class RsByteBuffer extends Linkable {
	public byte[] buffer;
	public int index;
	static int[] anIntArray7614 = new int[256];
	public static long[] aLongArray7619;

	public void write36BitLong(long l) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 32);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 24);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.r(").append(')').toString());
		}
	}

	public void writeByte(int i) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.p(").append(')').toString());
		}
	}

	public void writeShort(int i, int i_1_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.i(").append(')').toString());
		}
	}

	public void method3587(int i, int i_2_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.k(").append(')').toString());
		}
	}

	public void writeInt(int i, int i_3_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.u(").append(')').toString());
		}
	}

	public void writeLEInt(int i, int i_4_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.x(").append(')').toString());
		}
	}

	public void writeString(String string, int i) {
		try {
			int i_5_ = string.indexOf('\0');
			if (i_5_ >= 0)
				throw new IllegalArgumentException("");
			index += Class361.method4304(string, 0, string.length(), buffer, 385051775 * index, (byte) 41) * 116413311;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.z(").append(')').toString());
		}
	}

	public int readShort(int i) {
		try {
			index += 232826622;
			int i_6_ = (((buffer[index * 385051775 - 2] & 0xff) << 8) + (buffer[385051775 * index - 1] & 0xff));
			if (i_6_ > 32767)
				i_6_ -= 65536;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ao(").append(')').toString());
		}
	}

	public void writeIntV1(int i, byte i_7_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ba(").append(')').toString());
		}
	}

	public void method3593(int i, int i_8_) {
		try {
			buffer[385051775 * index - i - 2] = (byte) (i >> 8);
			buffer[385051775 * index - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.j(").append(')').toString());
		}
	}

	public void method3594(int i, byte i_9_) {
		try {
			if (i >= 0 && i < 128)
				writeByte(i);
			else if (i >= 0 && i < 32768)
				writeShort(32768 + i, 16711935);
			else
				throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.l(").append(')').toString());
		}
	}

	public int readUnsignedByte() {
		try {
			return (buffer[(index += 116413311) * 385051775 - 1] & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.aa(").append(')').toString());
		}
	}

	public byte readByte(int i) {
		try {
			return buffer[(index += 116413311) * 385051775 - 1];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ak(").append(')').toString());
		}
	}

	final int readCustomUnsignedShort() {
		int v = readUnsignedShort();
		if (v == 65535)
			return -1;
		return v;
	}

	public int readUnsignedShort() {
		try {
			index += 232826622;
			return ((buffer[index * 385051775 - 1] & 0xff) + ((buffer[index * 385051775 - 2] & 0xff) << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ae(").append(')').toString());
		}
	}

	public long readLong(short i) {
		try {
			long l = (long) readInt((byte) 35) & 0xffffffffL;
			long l_10_ = (long) readInt((byte) 13) & 0xffffffffL;
			return (l << 32) + l_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.al(").append(')').toString());
		}
	}

	public void method3599(int i, int i_11_) {
		try {
			buffer[385051775 * index - i - 4] = (byte) (i >> 24);
			buffer[index * 385051775 - i - 3] = (byte) (i >> 16);
			buffer[385051775 * index - i - 2] = (byte) (i >> 8);
			buffer[385051775 * index - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.w(").append(')').toString());
		}
	}

	public int method3600(int i) {
		try {
			index += 465653244;
			return (((buffer[index * 385051775 - 1] & 0xff) << 24) + ((buffer[index * 385051775 - 2] & 0xff) << 16) + ((buffer[index * 385051775 - 3] & 0xff) << 8) + (buffer[385051775 * index - 4] & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ah(").append(')').toString());
		}
	}

	public long method3601(byte i) {
		try {
			long l = (long) readUnsignedByte() & 0xffffffffL;
			long l_12_ = (long) readInt((byte) 19) & 0xffffffffL;
			return (l << 32) + l_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ai(").append(')').toString());
		}
	}

	public String readString(int i) {
		try {
			int i_13_ = 385051775 * index;
			while (buffer[(index += 116413311) * 385051775 - 1] != 0) {
				if (i == 968466925) {
					/* empty */
				}
			}
			int i_14_ = index * 385051775 - i_13_ - 1;
			if (i_14_ == 0)
				return "";
			return Class52.method556(buffer, i_13_, i_14_, 964250329);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.af(").append(')').toString());
		}
	}

	public void method3603(long l, int i, int i_15_) {
		try {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			for (int i_16_ = i * 8; i_16_ >= 0; i_16_ -= 8)
				buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> i_16_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.n(").append(')').toString());
		}
	}

	public void readBytes(byte[] bytes, int i, int i_17_, int i_18_) {
		try {
			for (int i_19_ = i; i_19_ < i + i_17_; i_19_++)
				bytes[i_19_] = buffer[(index += 116413311) * 385051775 - 1];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ab(").append(')').toString());
		}
	}

	public int readUnsignedSmart(int i) {
		try {
			int i_20_ = buffer[index * 385051775] & 0xff;
			if (i_20_ < 128)
				return readUnsignedByte();
			return readUnsignedShort() - 32768;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ay(").append(')').toString());
		}
	}

	public int readSmart(short i) {
		try {
			int i_21_ = 0;
			int i_22_;
			for (i_22_ = readUnsignedSmart(1723054621); 32767 == i_22_; i_22_ = readUnsignedSmart(1723054621))
				i_21_ += 32767;
			i_21_ += i_22_;
			return i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.aq(").append(')').toString());
		}
	}

	public int method3607(int i) {
		try {
			if (buffer[index * 385051775] < 0)
				return readInt((byte) 47) & 0x7fffffff;
			return readUnsignedShort();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ag(").append(')').toString());
		}
	}

	public void writeLong(long l) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 56);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 48);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 40);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 32);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 24);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) (l >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.q(").append(')').toString());
		}
	}

	public int method3609(int i) {
		try {
			int i_23_ = buffer[(index += 116413311) * 385051775 - 1];
			int i_24_ = 0;
			for (/**/; i_23_ < 0; i_23_ = (buffer[(index += 116413311) * 385051775 - 1]))
				i_24_ = (i_24_ | i_23_ & 0x7f) << 7;
			return i_24_ | i_23_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.au(").append(')').toString());
		}
	}

	public void method3610(int[] is, int i) {
		try {
			int i_25_ = 385051775 * index / 8;
			index = 0;
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				int i_27_ = readInt((byte) -31);
				int i_28_ = readInt((byte) -90);
				int i_29_ = -957401312;
				int i_30_ = -1640531527;
				int i_31_ = 32;
				while (i_31_-- > 0) {
					i_28_ -= (i_27_ + (i_27_ << 4 ^ i_27_ >>> 5) ^ is[i_29_ >>> 11 & 0x3] + i_29_);
					i_29_ -= i_30_;
					i_27_ -= (i_28_ + (i_28_ << 4 ^ i_28_ >>> 5) ^ i_29_ + is[i_29_ & 0x3]);
				}
				index -= 931306488;
				writeInt(i_27_, -429646008);
				writeInt(i_28_, 96557392);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ar(").append(')').toString());
		}
	}

	public void method3611(int[] is, int i, int i_32_, int i_33_) {
		try {
			int i_34_ = 385051775 * index;
			index = i * 116413311;
			int i_35_ = (i_32_ - i) / 8;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = readInt((byte) -6);
				int i_38_ = readInt((byte) -16);
				int i_39_ = 0;
				int i_40_ = -1640531527;
				int i_41_ = 32;
				while (i_41_-- > 0) {
					i_37_ += ((i_38_ << 4 ^ i_38_ >>> 5) + i_38_ ^ is[i_39_ & 0x3] + i_39_);
					i_39_ += i_40_;
					i_38_ += ((i_37_ << 4 ^ i_37_ >>> 5) + i_37_ ^ i_39_ + is[i_39_ >>> 11 & 0x3]);
				}
				index -= 931306488;
				writeInt(i_37_, -1455722924);
				writeInt(i_38_, -1798688670);
			}
			index = 116413311 * i_34_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ac(").append(')').toString());
		}
	}

	public void method3612(int[] is, int i, int i_42_, int i_43_) {
		try {
			int i_44_ = index * 385051775;
			index = i * 116413311;
			int i_45_ = (i_42_ - i) / 8;
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
				int i_47_ = readInt((byte) -22);
				int i_48_ = readInt((byte) -60);
				int i_49_ = -957401312;
				int i_50_ = -1640531527;
				int i_51_ = 32;
				while (i_51_-- > 0) {
					i_48_ -= (i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ i_49_ + is[i_49_ >>> 11 & 0x3]);
					i_49_ -= i_50_;
					i_47_ -= (i_48_ + (i_48_ << 4 ^ i_48_ >>> 5) ^ is[i_49_ & 0x3] + i_49_);
				}
				index -= 931306488;
				writeInt(i_47_, -1451619282);
				writeInt(i_48_, -1662476613);
			}
			index = i_44_ * 116413311;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.am(").append(')').toString());
		}
	}

	public int read24BitUnsignedInteger(byte i) {
		try {
			index += 349239933;
			return ((buffer[385051775 * index - 1] & 0xff) + (((buffer[index * 385051775 - 3] & 0xff) << 16) + ((buffer[385051775 * index - 2] & 0xff) << 8)));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ad(").append(')').toString());
		}
	}

	public int method3614(int i, int i_52_) {
		try {
			int i_53_ = Class11.method328(buffer, i, index * 385051775, -1501053505);
			writeInt(i_53_, 533083974);
			return i_53_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bf(").append(')').toString());
		}
	}

	public boolean method3615(byte i) {
		try {
			index -= 465653244;
			int i_54_ = Class11.method328(buffer, 0, 385051775 * index, -395934040);
			int i_55_ = readInt((byte) -63);
			if (i_55_ == i_54_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.be(").append(')').toString());
		}
	}

	public void writeByte128(int i, int i_56_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (128 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.by(").append(')').toString());
		}
	}

	public void method3617(int i, int i_57_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (0 - i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bm(").append(')').toString());
		}
	}

	public int readUnsignedByte128(int i) {
		try {
			return ((buffer[(index += 116413311) * 385051775 - 1] - 128) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bx(").append(')').toString());
		}
	}

	public int readUnsignedByteC(short i) {
		try {
			return (0 - (buffer[(index += 116413311) * 385051775 - 1]) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bo(").append(')').toString());
		}
	}

	public int readUnsigned128Byte(byte i) {
		try {
			return (128 - (buffer[(index += 116413311) * 385051775 - 1]) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bb(").append(')').toString());
		}
	}

	public byte readByteC(int i) {
		try {
			return (byte) (0 - (buffer[(index += 116413311) * 385051775 - 1]));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bu(").append(')').toString());
		}
	}

	public byte read128Byte(int i) {
		try {
			return (byte) (128 - (buffer[(index += 116413311) * 385051775 - 1]));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bw(").append(')').toString());
		}
	}

	public void writeShortLE128(int i) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i + 128);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bg(").append(')').toString());
		}
	}

	public int readUnsignedShortLE(byte i) {
		try {
			index += 232826622;
			return ((buffer[385051775 * index - 2] & 0xff) + ((buffer[index * 385051775 - 1] & 0xff) << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bs(").append(')').toString());
		}
	}

	public int readUnsignedShort128(int i) {
		try {
			index += 232826622;
			return (((buffer[385051775 * index - 2] & 0xff) << 8) + (buffer[index * 385051775 - 1] - 128 & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bp(").append(')').toString());
		}
	}

	public int readUnsignedShortLE128(int i) {
		try {
			index += 232826622;
			return (((buffer[385051775 * index - 1] & 0xff) << 8) + (buffer[385051775 * index - 2] - 128 & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bv(").append(')').toString());
		}
	}

	public int read24BitInteger(byte i) {
		try {
			index += 349239933;
			int i_59_ = (((buffer[index * 385051775 - 3] & 0xff) << 16) + ((buffer[index * 385051775 - 2] & 0xff) << 8) + (buffer[385051775 * index - 1] & 0xff));
			if (i_59_ > 8388607)
				i_59_ -= 16777216;
			return i_59_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.av(").append(')').toString());
		}
	}

	public int read24BitUnsignedIntegerV2(byte i) {
		try {
			index += 349239933;
			return ((buffer[385051775 * index - 2] & 0xff) + (((buffer[index * 385051775 - 3] & 0xff) << 16) + ((buffer[385051775 * index - 1] & 0xff) << 8)));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bn(").append(')').toString());
		}
	}

	public void writeIntLE(int i, byte i_60_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bi(").append(')').toString());
		}
	}

	public byte readByte128(byte i) {
		try {
			return (byte) ((buffer[(index += 116413311) * 385051775 - 1]) - 128);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bl(").append(')').toString());
		}
	}

	public void writeIntV2(int i) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bt(").append(')').toString());
		}
	}

	public int readIntLE(int i) {
		try {
			index += 465653244;
			return (((buffer[index * 385051775 - 3] & 0xff) << 8) + (((buffer[index * 385051775 - 1] & 0xff) << 24) + ((buffer[index * 385051775 - 2] & 0xff) << 16)) + (buffer[index * 385051775 - 4] & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bj(").append(')').toString());
		}
	}

	public int readIntV2(byte i) {
		try {
			index += 465653244;
			return ((buffer[385051775 * index - 2] & 0xff) + (((buffer[index * 385051775 - 1] & 0xff) << 8) + (((buffer[index * 385051775 - 4] & 0xff) << 16) + ((buffer[385051775 * index - 3] & 0xff) << 24))));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bz(").append(')').toString());
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_62_ = i;
			for (int i_63_ = 0; i_63_ < 8; i_63_++) {
				if ((i_62_ & 0x1) == 1)
					i_62_ = i_62_ >>> 1 ^ ~0x12477cdf;
				else
					i_62_ >>>= 1;
			}
			anIntArray7614[i] = i_62_;
		}
		aLongArray7619 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_64_ = 0; i_64_ < 8; i_64_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray7619[i] = l;
		}
	}

	public void putTriByte(int i, byte i_65_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.d(").append(')').toString());
		}
	}

	public void applyRsa(BigInteger biginteger, BigInteger biginteger_66_, int i) {
		try {
			int i_67_ = index * 385051775;
			index = 0;
			byte[] is = new byte[i_67_];
			readBytes(is, 0, i_67_, -953523806);
			BigInteger biginteger_68_ = new BigInteger(is);
			BigInteger biginteger_69_ = Loader.DISABLE_RSA ? biginteger_68_ : biginteger_68_.modPow(biginteger, biginteger_66_);
			byte[] is_70_ = biginteger_69_.toByteArray();
			index = 0;
			writeShort(is_70_.length, 16711935);
			writeBytes(is_70_, 0, is_70_.length, (short) -25461);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bd(").append(')').toString());
		}
	}

	public RsByteBuffer(int i) {
		buffer = Class416.method5589(i, (short) -31789);
		index = 0;
	}

	public String readJagString(int i) {
		try {
			byte i_71_ = buffer[(index += 116413311) * 385051775 - 1];
			if (0 != i_71_)
				throw new IllegalStateException("");
			int i_72_ = index * 385051775;
			while_13_: do {
				do {
					if ((buffer[(index += 116413311) * 385051775 - 1]) == 0)
						break while_13_;
				} while (i == 681479919);
				throw new IllegalStateException();
			} while (false);
			int i_73_ = index * 385051775 - i_72_ - 1;
			if (0 == i_73_)
				return "";
			return Class52.method556(buffer, i_72_, i_73_, -1673599026);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.aw(").append(')').toString());
		}
	}

	public int readIntV1(int i) {
		try {
			index += 465653244;
			return (((buffer[385051775 * index - 1] & 0xff) << 16) + ((buffer[385051775 * index - 2] & 0xff) << 24) + ((buffer[index * 385051775 - 4] & 0xff) << 8) + (buffer[index * 385051775 - 3] & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.br(").append(')').toString());
		}
	}

	public void write128Byte(int i, byte i_74_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (128 - i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bc(").append(')').toString());
		}
	}

	public void method3639(int i, int i_75_) {
		try {
			if ((i & ~0x7f) != 0) {
				if ((i & ~0x3fff) != 0) {
					if ((i & ~0x1fffff) != 0) {
						if (0 != (i & ~0xfffffff))
							writeByte(i >>> 28 | 0x80);
						writeByte(i >>> 21 | 0x80);
					}
					writeByte(i >>> 14 | 0x80);
				}
				writeByte(i >>> 7 | 0x80);
			}
			writeByte(i & 0x7f);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ax(").append(')').toString());
		}
	}

	public long method3640(int i) {
		try {
			long l = (long) method3600(143621107) & 0xffffffffL;
			long l_76_ = (long) method3600(742659427) & 0xffffffffL;
			return (l_76_ << 32) + l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.az(").append(')').toString());
		}
	}

	public void putJagString(String string, short i) {
		try {
			int i_77_ = string.indexOf('\0');
			if (i_77_ >= 0)
				throw new IllegalArgumentException("");
			buffer[(index += 116413311) * 385051775 - 1] = (byte) 0;
			index += Class361.method4304(string, 0, string.length(), buffer, 385051775 * index, (byte) 102) * 116413311;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.c(").append(')').toString());
		}
	}

	public void writeShort128(int i) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i + 128);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bq(").append(')').toString());
		}
	}

	public int readInt(byte i) {
		try {
			index += 465653244;
			return (((buffer[385051775 * index - 3] & 0xff) << 16) 
					+ ((buffer[385051775 * index - 4] & 0xff) << 24) 
					+ ((buffer[index * 385051775 - 2] & 0xff) << 8) 
					+ (buffer[385051775 * index - 1] & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.at(").append(')').toString());
		}
	}

	public void writeShortLE(int i, int i_79_) {
		try {
			buffer[(index += 116413311) * 385051775 - 1] = (byte) i;
			buffer[(index += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bk(").append(')').toString());
		}
	}

	public RsByteBuffer(byte[] is) {
		buffer = is;
		index = 0;
	}

	public int method3645(int i) {
		try {
			int i_80_ = buffer[385051775 * index] & 0xff;
			if (i_80_ < 128)
				return readUnsignedByte() - 64;
			return readUnsignedShort() - 49152;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.aj(").append(')').toString());
		}
	}

	public int readBigSmart(int i) {// readBigSmart
		try {
			if (buffer[385051775 * index] < 0)
				return readInt((byte) 33) & 0x7fffffff;
			int i_81_ = readUnsignedShort();
			if (32767 == i_81_)
				return -1;
			return i_81_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.an(").append(')').toString());
		}
	}

	public long method3647(int i, byte i_82_) {
		try {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			int i_83_ = 8 * i;
			long l = 0L;
			for (/**/; i_83_ >= 0; i_83_ -= 8)
				l |= ((long) (buffer[(index += 116413311) * 385051775 - 1]) & 0xffL) << i_83_;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.as(").append(')').toString());
		}
	}

	public void writeBytes(byte[] is, int i, int i_84_, short i_85_) {
		try {
			for (int i_86_ = i; i_86_ < i_84_ + i; i_86_++)
				buffer[(index += 116413311) * 385051775 - 1] = is[i_86_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.m(").append(')').toString());
		}
	}

	public void method3649(int i, byte i_87_) {
		try {
			buffer[index * 385051775 - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.o(").append(')').toString());
		}
	}

	public void method3650(int i) {
		try {
			if (null != buffer)
				Class201.method1900(buffer, -860028882);
			buffer = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.b(").append(')').toString());
		}
	}

	public int method3651(int i) {
		try {
			index += 232826622;
			int i_88_ = ((buffer[index * 385051775 - 2] & 0xff) + ((buffer[index * 385051775 - 1] & 0xff) << 8));
			if (i_88_ > 32767)
				i_88_ -= 65536;
			return i_88_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.bh(").append(')').toString());
		}
	}

	public String method3652(int i) {
		try {
			if (buffer[385051775 * index] == 0) {
				index += 116413311;
				return null;
			}
			return readString(541883117);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.ap(").append(')').toString());
		}
	}

	static final void method3653(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string.toLowerCase();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.zd(").append(')').toString());
		}
	}

	static final void method3654(ClientScript2 class403, int i) {
		try {
			int i_89_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_89_, (byte) 28);
			Class119 class119 = Class389.aClass119Array4165[i_89_ >> 16];
			Class391.method4887(class105, class119, class403, (byte) -121);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.dp(").append(')').toString());
		}
	}

	static final void method3655(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5674(-484902399) && Class373.aClass_ra4071.method5032()) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.anb(").append(')').toString());
		}
	}

	static void method3656(int i, int i_90_, int i_91_, short i_92_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(9, (long) i);
			class298_sub37_sub12.method3449((byte) 105);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_90_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = 293101103 * i_91_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.aw(").append(')').toString());
		}
	}

	static final void method3657(ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int i_93_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (-1 == i_93_)
				throw new RuntimeException("");
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = new StringBuilder().append(string).append((char) i_93_).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acx.za(").append(')').toString());
		}
	}
}
