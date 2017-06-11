/* Class82_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub13 extends Class82 {
	int anInt6868;
	int anInt6869;

	public void method866(int i) {
		try {
			client.anInt8728 = 938117879 * client.anInt8884;
			client.anInt8737 = (1303928015 * client.anInt8884 + 1252628863 * ((Class82_Sub13) this).anInt6868);
			Class256.anInt2801 = client.anInt8681 * -1680550441;
			Class108.anInt1321 = 410053157 * client.anInt8731;
			Class474.anInt5980 = client.anInt8732 * -1645861677;
			Class115.anInt1389 = client.anInt8720 * -933884753;
			client.anInt8681 = 563175129 * (392492523 * ((Class82_Sub13) this).anInt6869 >>> 24);
			client.anInt8731 = (-1719011785 * (((Class82_Sub13) this).anInt6869 * 392492523 >>> 16 & 0xff));
			client.anInt8732 = (-1294785203 * (392492523 * ((Class82_Sub13) this).anInt6869 >>> 8 & 0xff));
			client.anInt8720 = -1656733051 * (392492523 * ((Class82_Sub13) this).anInt6869 & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ya.f(").append(')').toString());
		}
	}

	Class82_Sub13(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub13) this).anInt6868 = class298_sub53.readUnsignedShort() * -477707085;
		((Class82_Sub13) this).anInt6869 = class298_sub53.readInt((byte) -19) * -1164408125;
	}

	public void method868() {
		client.anInt8728 = 938117879 * client.anInt8884;
		client.anInt8737 = (1303928015 * client.anInt8884 + 1252628863 * ((Class82_Sub13) this).anInt6868);
		Class256.anInt2801 = client.anInt8681 * -1680550441;
		Class108.anInt1321 = 410053157 * client.anInt8731;
		Class474.anInt5980 = client.anInt8732 * -1645861677;
		Class115.anInt1389 = client.anInt8720 * -933884753;
		client.anInt8681 = 563175129 * (392492523 * ((Class82_Sub13) this).anInt6869 >>> 24);
		client.anInt8731 = (-1719011785 * (((Class82_Sub13) this).anInt6869 * 392492523 >>> 16 & 0xff));
		client.anInt8732 = -1294785203 * (392492523 * ((Class82_Sub13) this).anInt6869 >>> 8 & 0xff);
		client.anInt8720 = -1656733051 * (392492523 * ((Class82_Sub13) this).anInt6869 & 0xff);
	}

	public void method869() {
		client.anInt8728 = 938117879 * client.anInt8884;
		client.anInt8737 = (1303928015 * client.anInt8884 + 1252628863 * ((Class82_Sub13) this).anInt6868);
		Class256.anInt2801 = client.anInt8681 * -1680550441;
		Class108.anInt1321 = 410053157 * client.anInt8731;
		Class474.anInt5980 = client.anInt8732 * -1645861677;
		Class115.anInt1389 = client.anInt8720 * -933884753;
		client.anInt8681 = 563175129 * (392492523 * ((Class82_Sub13) this).anInt6869 >>> 24);
		client.anInt8731 = (-1719011785 * (((Class82_Sub13) this).anInt6869 * 392492523 >>> 16 & 0xff));
		client.anInt8732 = -1294785203 * (392492523 * ((Class82_Sub13) this).anInt6869 >>> 8 & 0xff);
		client.anInt8720 = -1656733051 * (392492523 * ((Class82_Sub13) this).anInt6869 & 0xff);
	}

	public static final int method910(Class433 class433, byte[] is, int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			int i_4_ = 0;
			RsByteBuffer class298_sub53 = new RsByteBuffer(is);
			int i_5_ = -1;
			for (;;) {
				int i_6_ = class298_sub53.readSmart((short) 255);
				if (0 == i_6_) {
					if (i_3_ == 3) {
						/* empty */
					}
					break;
				}
				i_5_ += i_6_;
				int i_7_ = 0;
				boolean bool = false;
				for (;;) {
					if (bool) {
						int i_8_ = class298_sub53.readUnsignedSmart(1723054621);
						if (i_8_ == 0) {
							if (i_3_ == 3)
								throw new IllegalStateException();
							break;
						}
						class298_sub53.readUnsignedByte();
					} else {
						int i_9_ = class298_sub53.readUnsignedSmart(1723054621);
						if (i_9_ == 0) {
							if (i_3_ == 3) {
								/* empty */
							}
							break;
						}
						i_7_ += i_9_ - 1;
						int i_10_ = i_7_ & 0x3f;
						int i_11_ = i_7_ >> 6 & 0x3f;
						int i_12_ = class298_sub53.readUnsignedByte() >> 2;
						int i_13_ = i + i_11_;
						int i_14_ = i_10_ + i_0_;
						if (i_13_ > 0 && i_14_ > 0 && i_13_ < i_1_ - 1 && i_14_ < i_2_ - 1) {
							ObjectDefinitions class432 = class433.getObjectDefinitions(i_5_);
							if ((-1976050083 * Class424.aClass424_6610.anInt6613) == i_12_ && Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547.method5629(-1915667162) == 0 && 0 == 1532834983 * class432.anInt5382 && -2144543407 * class432.anInt5380 != 1 && !class432.aBoolean5410) {
								if (i_3_ == 3) {
									/* empty */
								}
							} else {
								if (!class432.method5772(-1755524122))
									i_4_++;
								bool = true;
							}
						}
					}
				}
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ya.ch(").append(')').toString());
		}
	}
}
