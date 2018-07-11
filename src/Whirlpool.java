/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Whirlpool {
	long[] aLongArray5361;
	public static final int anInt5362 = 64;
	static final int anInt5363 = 10;
	static final String aString5364 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	long[] aLongArray5365;
	static long[] aLongArray5366;
	static long[][] aLongArrayArray5367 = new long[8][256];
	byte[] aByteArray5368;
	int anInt5369;
	int anInt5370;
	static final int anInt5371 = 512;
	long[] aLongArray5372;
	long[] aLongArray5373;
	long[] aLongArray5374;
	byte[] aByteArray5375 = new byte[32];
	public static JS5LocalRequester JS5_LOCAL_REQUESTER;

	void method7404() {
		int i = 0;
		int i_0_ = 0;
		while (i < 8) {
			((Whirlpool) this).aLongArray5365[i] = ((long) ((Whirlpool) this).aByteArray5368[i_0_] << 56 ^ ((long) ((Whirlpool) this).aByteArray5368[i_0_ + 1] & 0xffL) << 48 ^ ((long) ((Whirlpool) this).aByteArray5368[2 + i_0_] & 0xffL) << 40 ^ ((long) ((Whirlpool) this).aByteArray5368[3 + i_0_] & 0xffL) << 32 ^ ((long) ((Whirlpool) this).aByteArray5368[4 + i_0_] & 0xffL) << 24 ^ ((long) ((Whirlpool) this).aByteArray5368[5 + i_0_] & 0xffL) << 16
					^ ((long) ((Whirlpool) this).aByteArray5368[i_0_ + 6] & 0xffL) << 8 ^ ((long) ((Whirlpool) this).aByteArray5368[i_0_ + 7] & 0xffL));
			i++;
			i_0_ += 8;
		}
		for (i = 0; i < 8; i++)
			((Whirlpool) this).aLongArray5373[i] = (((Whirlpool) this).aLongArray5365[i] ^ (((Whirlpool) this).aLongArray5372[i] = ((Whirlpool) this).aLongArray5361[i]));
		for (i = 1; i <= 10; i++) {
			for (i_0_ = 0; i_0_ < 8; i_0_++) {
				((Whirlpool) this).aLongArray5374[i_0_] = 0L;
				int i_1_ = 0;
				int i_2_ = 56;
				while (i_1_ < 8) {
					((Whirlpool) this).aLongArray5374[i_0_] ^= (aLongArrayArray5367[i_1_][(int) ((((Whirlpool) this).aLongArray5372[i_0_ - i_1_ & 0x7]) >>> i_2_) & 0xff]);
					i_1_++;
					i_2_ -= 8;
				}
			}
			for (i_0_ = 0; i_0_ < 8; i_0_++)
				((Whirlpool) this).aLongArray5372[i_0_] = ((Whirlpool) this).aLongArray5374[i_0_];
			((Whirlpool) this).aLongArray5372[0] ^= aLongArray5366[i];
			for (i_0_ = 0; i_0_ < 8; i_0_++) {
				((Whirlpool) this).aLongArray5374[i_0_] = ((Whirlpool) this).aLongArray5372[i_0_];
				int i_3_ = 0;
				int i_4_ = 56;
				while (i_3_ < 8) {
					((Whirlpool) this).aLongArray5374[i_0_] ^= (aLongArrayArray5367[i_3_][(int) ((((Whirlpool) this).aLongArray5373[i_0_ - i_3_ & 0x7]) >>> i_4_) & 0xff]);
					i_3_++;
					i_4_ -= 8;
				}
			}
			for (i_0_ = 0; i_0_ < 8; i_0_++)
				((Whirlpool) this).aLongArray5373[i_0_] = ((Whirlpool) this).aLongArray5374[i_0_];
		}
		for (i = 0; i < 8; i++)
			((Whirlpool) this).aLongArray5361[i] ^= (((Whirlpool) this).aLongArray5373[i] ^ ((Whirlpool) this).aLongArray5365[i]);
	}

	void method7405(byte[] is, long l) {
		int i = 0;
		int i_5_ = 8 - ((int) l & 0x7) & 0x7;
		int i_6_ = 1189134755 * ((Whirlpool) this).anInt5369 & 0x7;
		long l_7_ = l;
		int i_8_ = 31;
		int i_9_ = 0;
		for (/**/; i_8_ >= 0; i_8_--) {
			i_9_ += ((((Whirlpool) this).aByteArray5375[i_8_] & 0xff) + ((int) l_7_ & 0xff));
			((Whirlpool) this).aByteArray5375[i_8_] = (byte) i_9_;
			i_9_ >>>= 8;
			l_7_ >>>= 8;
		}
		while (l > 8L) {
			int i_10_ = is[i] << i_5_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_5_;
			if (i_10_ < 0 || i_10_ >= 256)
				throw new RuntimeException();
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= i_10_ >>> i_6_;
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_6_);
			if (512 == ((Whirlpool) this).anInt5369 * 1189134755) {
				method7410((byte) -78);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_10_ << 8 - i_6_ & 0xff);
			((Whirlpool) this).anInt5369 += i_6_ * -391087605;
			l -= 8L;
			i++;
		}
		int i_11_;
		if (l > 0L) {
			i_11_ = is[i] << i_5_ & 0xff;
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] |= i_11_ >>> i_6_;
		} else
			i_11_ = 0;
		if ((long) i_6_ + l < 8L)
			((Whirlpool) this).anInt5369 += l * -391087605L;
		else {
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_6_);
			l -= (long) (8 - i_6_);
			if (1189134755 * ((Whirlpool) this).anInt5369 == 512) {
				method7410((byte) -123);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_11_ << 8 - i_6_ & 0xff);
			((Whirlpool) this).anInt5369 += -391087605 * (int) l;
		}
	}

	void method7406(int i) {
		for (int i_12_ = 0; i_12_ < 32; i_12_++)
			((Whirlpool) this).aByteArray5375[i_12_] = (byte) 0;
		((Whirlpool) this).anInt5370 = 0;
		((Whirlpool) this).anInt5369 = 0;
		((Whirlpool) this).aByteArray5368[0] = (byte) 0;
		for (int i_13_ = 0; i_13_ < 8; i_13_++)
			((Whirlpool) this).aLongArray5361[i_13_] = 0L;
	}

	void method7407(byte[] is, long l) {
		int i = 0;
		int i_14_ = 8 - ((int) l & 0x7) & 0x7;
		int i_15_ = 1189134755 * ((Whirlpool) this).anInt5369 & 0x7;
		long l_16_ = l;
		int i_17_ = 31;
		int i_18_ = 0;
		for (/**/; i_17_ >= 0; i_17_--) {
			i_18_ += ((((Whirlpool) this).aByteArray5375[i_17_] & 0xff) + ((int) l_16_ & 0xff));
			((Whirlpool) this).aByteArray5375[i_17_] = (byte) i_18_;
			i_18_ >>>= 8;
			l_16_ >>>= 8;
		}
		while (l > 8L) {
			int i_19_ = is[i] << i_14_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_14_;
			if (i_19_ < 0 || i_19_ >= 256)
				throw new RuntimeException();
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= i_19_ >>> i_15_;
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_15_);
			if (512 == ((Whirlpool) this).anInt5369 * 1189134755) {
				method7410((byte) -75);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_19_ << 8 - i_15_ & 0xff);
			((Whirlpool) this).anInt5369 += i_15_ * -391087605;
			l -= 8L;
			i++;
		}
		int i_20_;
		if (l > 0L) {
			i_20_ = is[i] << i_14_ & 0xff;
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] |= i_20_ >>> i_15_;
		} else
			i_20_ = 0;
		if ((long) i_15_ + l < 8L)
			((Whirlpool) this).anInt5369 += l * -391087605L;
		else {
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_15_);
			l -= (long) (8 - i_15_);
			if (1189134755 * ((Whirlpool) this).anInt5369 == 512) {
				method7410((byte) -85);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_20_ << 8 - i_15_ & 0xff);
			((Whirlpool) this).anInt5369 += -391087605 * (int) l;
		}
	}

	void method7408(byte[] is, int i, int i_21_) {
		((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= 128 >>> (1189134755 * ((Whirlpool) this).anInt5369 & 0x7);
		((Whirlpool) this).anInt5370 += 1101767573;
		if (-1706520643 * ((Whirlpool) this).anInt5370 > 32) {
			while (((Whirlpool) this).anInt5370 * -1706520643 < 64)
				((Whirlpool) this).aByteArray5368[((((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1)] = (byte) 0;
			method7410((byte) -28);
			((Whirlpool) this).anInt5370 = 0;
		}
		while (((Whirlpool) this).anInt5370 * -1706520643 < 32)
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1] = (byte) 0;
		System.arraycopy(((Whirlpool) this).aByteArray5375, 0, ((Whirlpool) this).aByteArray5368, 32, 32);
		method7410((byte) -57);
		int i_22_ = 0;
		int i_23_ = i;
		while (i_22_ < 8) {
			long l = ((Whirlpool) this).aLongArray5361[i_22_];
			is[i_23_] = (byte) (int) (l >>> 56);
			is[1 + i_23_] = (byte) (int) (l >>> 48);
			is[i_23_ + 2] = (byte) (int) (l >>> 40);
			is[i_23_ + 3] = (byte) (int) (l >>> 32);
			is[i_23_ + 4] = (byte) (int) (l >>> 24);
			is[5 + i_23_] = (byte) (int) (l >>> 16);
			is[6 + i_23_] = (byte) (int) (l >>> 8);
			is[i_23_ + 7] = (byte) (int) l;
			i_22_++;
			i_23_ += 8;
		}
	}

	void method7409(byte[] is, long l) {
		int i = 0;
		int i_24_ = 8 - ((int) l & 0x7) & 0x7;
		int i_25_ = 1189134755 * ((Whirlpool) this).anInt5369 & 0x7;
		long l_26_ = l;
		int i_27_ = 31;
		int i_28_ = 0;
		for (/**/; i_27_ >= 0; i_27_--) {
			i_28_ += ((((Whirlpool) this).aByteArray5375[i_27_] & 0xff) + ((int) l_26_ & 0xff));
			((Whirlpool) this).aByteArray5375[i_27_] = (byte) i_28_;
			i_28_ >>>= 8;
			l_26_ >>>= 8;
		}
		while (l > 8L) {
			int i_29_ = is[i] << i_24_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_24_;
			if (i_29_ < 0 || i_29_ >= 256)
				throw new RuntimeException();
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= i_29_ >>> i_25_;
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_25_);
			if (512 == ((Whirlpool) this).anInt5369 * 1189134755) {
				method7410((byte) -97);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_29_ << 8 - i_25_ & 0xff);
			((Whirlpool) this).anInt5369 += i_25_ * -391087605;
			l -= 8L;
			i++;
		}
		int i_30_;
		if (l > 0L) {
			i_30_ = is[i] << i_24_ & 0xff;
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] |= i_30_ >>> i_25_;
		} else
			i_30_ = 0;
		if ((long) i_25_ + l < 8L)
			((Whirlpool) this).anInt5369 += l * -391087605L;
		else {
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_25_);
			l -= (long) (8 - i_25_);
			if (1189134755 * ((Whirlpool) this).anInt5369 == 512) {
				method7410((byte) -79);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_30_ << 8 - i_25_ & 0xff);
			((Whirlpool) this).anInt5369 += -391087605 * (int) l;
		}
	}

	void method7410(byte i) {
		int i_31_ = 0;
		int i_32_ = 0;
		while (i_31_ < 8) {
			((Whirlpool) this).aLongArray5365[i_31_] = ((long) ((Whirlpool) this).aByteArray5368[i_32_] << 56 ^ ((long) ((Whirlpool) this).aByteArray5368[i_32_ + 1] & 0xffL) << 48 ^ ((long) ((Whirlpool) this).aByteArray5368[2 + i_32_] & 0xffL) << 40 ^ ((long) ((Whirlpool) this).aByteArray5368[3 + i_32_] & 0xffL) << 32 ^ ((long) ((Whirlpool) this).aByteArray5368[4 + i_32_] & 0xffL) << 24 ^ ((long) ((Whirlpool) this).aByteArray5368[5 + i_32_] & 0xffL) << 16
					^ ((long) ((Whirlpool) this).aByteArray5368[i_32_ + 6] & 0xffL) << 8 ^ ((long) ((Whirlpool) this).aByteArray5368[i_32_ + 7] & 0xffL));
			i_31_++;
			i_32_ += 8;
		}
		for (i_31_ = 0; i_31_ < 8; i_31_++)
			((Whirlpool) this).aLongArray5373[i_31_] = (((Whirlpool) this).aLongArray5365[i_31_] ^ (((Whirlpool) this).aLongArray5372[i_31_] = ((Whirlpool) this).aLongArray5361[i_31_]));
		for (i_31_ = 1; i_31_ <= 10; i_31_++) {
			for (i_32_ = 0; i_32_ < 8; i_32_++) {
				((Whirlpool) this).aLongArray5374[i_32_] = 0L;
				int i_33_ = 0;
				int i_34_ = 56;
				while (i_33_ < 8) {
					((Whirlpool) this).aLongArray5374[i_32_] ^= (aLongArrayArray5367[i_33_][(int) ((((Whirlpool) this).aLongArray5372[i_32_ - i_33_ & 0x7]) >>> i_34_) & 0xff]);
					i_33_++;
					i_34_ -= 8;
				}
			}
			for (i_32_ = 0; i_32_ < 8; i_32_++)
				((Whirlpool) this).aLongArray5372[i_32_] = ((Whirlpool) this).aLongArray5374[i_32_];
			((Whirlpool) this).aLongArray5372[0] ^= aLongArray5366[i_31_];
			for (i_32_ = 0; i_32_ < 8; i_32_++) {
				((Whirlpool) this).aLongArray5374[i_32_] = ((Whirlpool) this).aLongArray5372[i_32_];
				int i_35_ = 0;
				int i_36_ = 56;
				while (i_35_ < 8) {
					((Whirlpool) this).aLongArray5374[i_32_] ^= (aLongArrayArray5367[i_35_][(int) ((((Whirlpool) this).aLongArray5373[i_32_ - i_35_ & 0x7]) >>> i_36_) & 0xff]);
					i_35_++;
					i_36_ -= 8;
				}
			}
			for (i_32_ = 0; i_32_ < 8; i_32_++)
				((Whirlpool) this).aLongArray5373[i_32_] = ((Whirlpool) this).aLongArray5374[i_32_];
		}
		for (i_31_ = 0; i_31_ < 8; i_31_++)
			((Whirlpool) this).aLongArray5361[i_31_] ^= (((Whirlpool) this).aLongArray5373[i_31_] ^ ((Whirlpool) this).aLongArray5365[i_31_]);
	}

	Whirlpool() {
		((Whirlpool) this).aByteArray5368 = new byte[64];
		((Whirlpool) this).anInt5369 = 0;
		((Whirlpool) this).anInt5370 = 0;
		((Whirlpool) this).aLongArray5361 = new long[8];
		((Whirlpool) this).aLongArray5372 = new long[8];
		((Whirlpool) this).aLongArray5374 = new long[8];
		((Whirlpool) this).aLongArray5365 = new long[8];
		((Whirlpool) this).aLongArray5373 = new long[8];
	}

	public static byte[] method7411(byte[] is, int i, int i_37_) {
		byte[] is_38_;
		if (i > 0) {
			is_38_ = new byte[i_37_];
			for (int i_39_ = 0; i_39_ < i_37_; i_39_++)
				is_38_[i_39_] = is[i_39_ + i];
		} else
			is_38_ = is;
		Whirlpool class443 = new Whirlpool();
		class443.method7406(1964217241);
		class443.method7407(is_38_, (long) (i_37_ * 8));
		byte[] is_40_ = new byte[64];
		class443.method7408(is_40_, 0, -979792487);
		return is_40_;
	}

	void method7412(byte[] is, long l) {
		int i = 0;
		int i_41_ = 8 - ((int) l & 0x7) & 0x7;
		int i_42_ = 1189134755 * ((Whirlpool) this).anInt5369 & 0x7;
		long l_43_ = l;
		int i_44_ = 31;
		int i_45_ = 0;
		for (/**/; i_44_ >= 0; i_44_--) {
			i_45_ += ((((Whirlpool) this).aByteArray5375[i_44_] & 0xff) + ((int) l_43_ & 0xff));
			((Whirlpool) this).aByteArray5375[i_44_] = (byte) i_45_;
			i_45_ >>>= 8;
			l_43_ >>>= 8;
		}
		while (l > 8L) {
			int i_46_ = is[i] << i_41_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_41_;
			if (i_46_ < 0 || i_46_ >= 256)
				throw new RuntimeException();
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= i_46_ >>> i_42_;
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_42_);
			if (512 == ((Whirlpool) this).anInt5369 * 1189134755) {
				method7410((byte) -20);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_46_ << 8 - i_42_ & 0xff);
			((Whirlpool) this).anInt5369 += i_42_ * -391087605;
			l -= 8L;
			i++;
		}
		int i_47_;
		if (l > 0L) {
			i_47_ = is[i] << i_41_ & 0xff;
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] |= i_47_ >>> i_42_;
		} else
			i_47_ = 0;
		if ((long) i_42_ + l < 8L)
			((Whirlpool) this).anInt5369 += l * -391087605L;
		else {
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_42_);
			l -= (long) (8 - i_42_);
			if (1189134755 * ((Whirlpool) this).anInt5369 == 512) {
				method7410((byte) -85);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_47_ << 8 - i_42_ & 0xff);
			((Whirlpool) this).anInt5369 += -391087605 * (int) l;
		}
	}

	void method7413(byte[] is, long l) {
		int i = 0;
		int i_48_ = 8 - ((int) l & 0x7) & 0x7;
		int i_49_ = 1189134755 * ((Whirlpool) this).anInt5369 & 0x7;
		long l_50_ = l;
		int i_51_ = 31;
		int i_52_ = 0;
		for (/**/; i_51_ >= 0; i_51_--) {
			i_52_ += ((((Whirlpool) this).aByteArray5375[i_51_] & 0xff) + ((int) l_50_ & 0xff));
			((Whirlpool) this).aByteArray5375[i_51_] = (byte) i_52_;
			i_52_ >>>= 8;
			l_50_ >>>= 8;
		}
		while (l > 8L) {
			int i_53_ = is[i] << i_48_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_48_;
			if (i_53_ < 0 || i_53_ >= 256)
				throw new RuntimeException();
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= i_53_ >>> i_49_;
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_49_);
			if (512 == ((Whirlpool) this).anInt5369 * 1189134755) {
				method7410((byte) -65);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_53_ << 8 - i_49_ & 0xff);
			((Whirlpool) this).anInt5369 += i_49_ * -391087605;
			l -= 8L;
			i++;
		}
		int i_54_;
		if (l > 0L) {
			i_54_ = is[i] << i_48_ & 0xff;
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] |= i_54_ >>> i_49_;
		} else
			i_54_ = 0;
		if ((long) i_49_ + l < 8L)
			((Whirlpool) this).anInt5369 += l * -391087605L;
		else {
			((Whirlpool) this).anInt5370 += 1101767573;
			((Whirlpool) this).anInt5369 += -391087605 * (8 - i_49_);
			l -= (long) (8 - i_49_);
			if (1189134755 * ((Whirlpool) this).anInt5369 == 512) {
				method7410((byte) -28);
				((Whirlpool) this).anInt5370 = 0;
				((Whirlpool) this).anInt5369 = 0;
			}
			((Whirlpool) this).aByteArray5368[(-1706520643 * ((Whirlpool) this).anInt5370)] = (byte) (i_54_ << 8 - i_49_ & 0xff);
			((Whirlpool) this).anInt5369 += -391087605 * (int) l;
		}
	}

	void method7414(byte[] is, int i) {
		((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= 128 >>> (1189134755 * ((Whirlpool) this).anInt5369 & 0x7);
		((Whirlpool) this).anInt5370 += 1101767573;
		if (-1706520643 * ((Whirlpool) this).anInt5370 > 32) {
			while (((Whirlpool) this).anInt5370 * -1706520643 < 64)
				((Whirlpool) this).aByteArray5368[((((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1)] = (byte) 0;
			method7410((byte) -9);
			((Whirlpool) this).anInt5370 = 0;
		}
		while (((Whirlpool) this).anInt5370 * -1706520643 < 32)
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1] = (byte) 0;
		System.arraycopy(((Whirlpool) this).aByteArray5375, 0, ((Whirlpool) this).aByteArray5368, 32, 32);
		method7410((byte) -113);
		int i_55_ = 0;
		int i_56_ = i;
		while (i_55_ < 8) {
			long l = ((Whirlpool) this).aLongArray5361[i_55_];
			is[i_56_] = (byte) (int) (l >>> 56);
			is[1 + i_56_] = (byte) (int) (l >>> 48);
			is[i_56_ + 2] = (byte) (int) (l >>> 40);
			is[i_56_ + 3] = (byte) (int) (l >>> 32);
			is[i_56_ + 4] = (byte) (int) (l >>> 24);
			is[5 + i_56_] = (byte) (int) (l >>> 16);
			is[6 + i_56_] = (byte) (int) (l >>> 8);
			is[i_56_ + 7] = (byte) (int) l;
			i_55_++;
			i_56_ += 8;
		}
	}

	void method7415(byte[] is, int i) {
		((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= 128 >>> (1189134755 * ((Whirlpool) this).anInt5369 & 0x7);
		((Whirlpool) this).anInt5370 += 1101767573;
		if (-1706520643 * ((Whirlpool) this).anInt5370 > 32) {
			while (((Whirlpool) this).anInt5370 * -1706520643 < 64)
				((Whirlpool) this).aByteArray5368[((((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1)] = (byte) 0;
			method7410((byte) -80);
			((Whirlpool) this).anInt5370 = 0;
		}
		while (((Whirlpool) this).anInt5370 * -1706520643 < 32)
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1] = (byte) 0;
		System.arraycopy(((Whirlpool) this).aByteArray5375, 0, ((Whirlpool) this).aByteArray5368, 32, 32);
		method7410((byte) -122);
		int i_57_ = 0;
		int i_58_ = i;
		while (i_57_ < 8) {
			long l = ((Whirlpool) this).aLongArray5361[i_57_];
			is[i_58_] = (byte) (int) (l >>> 56);
			is[1 + i_58_] = (byte) (int) (l >>> 48);
			is[i_58_ + 2] = (byte) (int) (l >>> 40);
			is[i_58_ + 3] = (byte) (int) (l >>> 32);
			is[i_58_ + 4] = (byte) (int) (l >>> 24);
			is[5 + i_58_] = (byte) (int) (l >>> 16);
			is[6 + i_58_] = (byte) (int) (l >>> 8);
			is[i_58_ + 7] = (byte) (int) l;
			i_57_++;
			i_58_ += 8;
		}
	}

	void method7416(byte[] is, int i) {
		((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 * -1706520643)] |= 128 >>> (1189134755 * ((Whirlpool) this).anInt5369 & 0x7);
		((Whirlpool) this).anInt5370 += 1101767573;
		if (-1706520643 * ((Whirlpool) this).anInt5370 > 32) {
			while (((Whirlpool) this).anInt5370 * -1706520643 < 64)
				((Whirlpool) this).aByteArray5368[((((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1)] = (byte) 0;
			method7410((byte) -123);
			((Whirlpool) this).anInt5370 = 0;
		}
		while (((Whirlpool) this).anInt5370 * -1706520643 < 32)
			((Whirlpool) this).aByteArray5368[(((Whirlpool) this).anInt5370 += 1101767573) * -1706520643 - 1] = (byte) 0;
		System.arraycopy(((Whirlpool) this).aByteArray5375, 0, ((Whirlpool) this).aByteArray5368, 32, 32);
		method7410((byte) -99);
		int i_59_ = 0;
		int i_60_ = i;
		while (i_59_ < 8) {
			long l = ((Whirlpool) this).aLongArray5361[i_59_];
			is[i_60_] = (byte) (int) (l >>> 56);
			is[1 + i_60_] = (byte) (int) (l >>> 48);
			is[i_60_ + 2] = (byte) (int) (l >>> 40);
			is[i_60_ + 3] = (byte) (int) (l >>> 32);
			is[i_60_ + 4] = (byte) (int) (l >>> 24);
			is[5 + i_60_] = (byte) (int) (l >>> 16);
			is[6 + i_60_] = (byte) (int) (l >>> 8);
			is[i_60_ + 7] = (byte) (int) l;
			i_59_++;
			i_60_ += 8;
		}
	}

	public static byte[] method7417(byte[] is, int i, int i_61_) {
		byte[] is_62_;
		if (i > 0) {
			is_62_ = new byte[i_61_];
			for (int i_63_ = 0; i_63_ < i_61_; i_63_++)
				is_62_[i_63_] = is[i_63_ + i];
		} else
			is_62_ = is;
		Whirlpool class443 = new Whirlpool();
		class443.method7406(2081769325);
		class443.method7407(is_62_, (long) (i_61_ * 8));
		byte[] is_64_ = new byte[64];
		class443.method7408(is_64_, 0, -979792487);
		return is_64_;
	}

	public static byte[] method7418(byte[] is, int i, int i_65_) {
		byte[] is_66_;
		if (i > 0) {
			is_66_ = new byte[i_65_];
			for (int i_67_ = 0; i_67_ < i_65_; i_67_++)
				is_66_[i_67_] = is[i_67_ + i];
		} else
			is_66_ = is;
		Whirlpool class443 = new Whirlpool();
		class443.method7406(2098335641);
		class443.method7407(is_66_, (long) (i_65_ * 8));
		byte[] is_68_ = new byte[64];
		class443.method7408(is_68_, 0, -979792487);
		return is_68_;
	}

	public static byte[] method7419(byte[] is, int i, int i_69_) {
		byte[] is_70_;
		if (i > 0) {
			is_70_ = new byte[i_69_];
			for (int i_71_ = 0; i_71_ < i_69_; i_71_++)
				is_70_[i_71_] = is[i_71_ + i];
		} else
			is_70_ = is;
		Whirlpool class443 = new Whirlpool();
		class443.method7406(1974742323);
		class443.method7407(is_70_, (long) (i_69_ * 8));
		byte[] is_72_ = new byte[64];
		class443.method7408(is_72_, 0, -979792487);
		return is_72_;
	}

	static {
		aLongArray5366 = new long[11];
		for (int i = 0; i < 256; i++) {
			int i_73_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = (0 == (i & 0x1) ? (long) (i_73_ >>> 8) : (long) (i_73_ & 0xff));
			long l_74_ = l << 1;
			if (l_74_ >= 256L)
				l_74_ ^= 0x11dL;
			long l_75_ = l_74_ << 1;
			if (l_75_ >= 256L)
				l_75_ ^= 0x11dL;
			long l_76_ = l_75_ ^ l;
			long l_77_ = l_75_ << 1;
			if (l_77_ >= 256L)
				l_77_ ^= 0x11dL;
			long l_78_ = l_77_ ^ l;
			aLongArrayArray5367[0][i] = (l << 56 | l << 48 | l_75_ << 40 | l << 32 | l_77_ << 24 | l_76_ << 16 | l_74_ << 8 | l_78_);
			for (int i_79_ = 1; i_79_ < 8; i_79_++)
				aLongArrayArray5367[i_79_][i] = (aLongArrayArray5367[i_79_ - 1][i] >>> 8 | aLongArrayArray5367[i_79_ - 1][i] << 56);
		}
		aLongArray5366[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_80_ = (i - 1) * 8;
			aLongArray5366[i] = (aLongArrayArray5367[0][i_80_] & ~0xffffffffffffffL ^ aLongArrayArray5367[1][1 + i_80_] & 0xff000000000000L ^ aLongArrayArray5367[2][i_80_ + 2] & 0xff0000000000L ^ aLongArrayArray5367[3][3 + i_80_] & 0xff00000000L ^ aLongArrayArray5367[4][i_80_ + 4] & 0xff000000L ^ aLongArrayArray5367[5][i_80_ + 5] & 0xff0000L ^ aLongArrayArray5367[6][i_80_ + 6] & 0xff00L ^ aLongArrayArray5367[7][7 + i_80_] & 0xffL);
		}
	}

	static final void method7420(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub29_8201.method13049(426414688) ? 1 : 0;
	}

	static void method7421(int i, int i_81_) {
		if (i == 17)
			throw new Error();
		if (i == 25)
			throw new OutOfMemoryError();
		try {
			if (i == 8)
				Class173.method2944(-1950066116);
			else if (24 == i)
				Class209.method3598(new StringBuilder().append("").append(457052913 * Engine.FPS).toString(), -1823674146);
			else if (i == 28) {
				Class201 class201 = (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1512240603).aClass201_2600);
				class201.aBool2552 = !class201.aBool2552;
			} else if (i == 7)
				client.aBool7176 = true;
			else if (4 == i)
				client.aBool7176 = false;
			else if (i == 14)
				client.aClass457_7335.method7651((byte) 5);
			else if (21 == i) {
				Class357_Sub1.method12565(-1890847709);
				for (int i_82_ = 0; i_82_ < 10; i_82_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_83_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class209.method3598(new StringBuilder().append("").append(i_83_).toString(), -1844000265);
			} else if (i == 9) {
				Class357_Sub1.method12565(-1890847709);
				for (int i_84_ = 0; i_84_ < 10; i_84_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_85_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class209.method3598(new StringBuilder().append("").append(i_85_).toString(), -1847953573);
				JS5CacheFile.method3359(-1275511493);
				Class357_Sub1.method12565(-1890847709);
				for (int i_86_ = 0; i_86_ < 10; i_86_++)
					System.gc();
				i_85_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class209.method3598(new StringBuilder().append("").append(i_85_).toString(), -1441723190);
			} else if (i == 19)
				Class209.method3598((IndexLoaders.NATIVE_LIBRARY_LOADER.method219(-1916862873) ? "Success" : "Failure"), -1724537176);
			else if (20 == i)
				Class159.aClass450_2010.method7493(-799490388);
			else if (i == 22)
				Class119.JS5_STANDARD_REQUESTER.method5525(-115621470);
			else if (3 == i)
				Class119.JS5_STANDARD_REQUESTER.method5526(-1851671444);
			else if (13 == i)
				Class351.gameCanvas.setLocation(50, 50);
			else if (1 == i)
				Class351.gameCanvas.setLocation((Engine.anInt3250 * -1911940837), (698621615 * Engine.anInt3251));
			else if (i == 27)
				Class468.method7789(-838440375);
			else if (i == 6) {
				IndexLoaders.MAP_REGION_DECODER.aLong3183 = Class169.method2869(1624509158) * 2884791228845673515L;
				IndexLoaders.MAP_REGION_DECODER.aBool3206 = true;
				Class468.method7789(620089057);
			} else if (i == 26) {
				Vector3 class385 = (Class84.myPlayer.method11166().aClass385_3595);
				Class209.method3598(new StringBuilder().append((int) class385.x >> 9).append(" ").append((int) class385.z >> 9).toString(), -1980423440);
			} else if (2 == i) {
				Vector3 class385 = (Class84.myPlayer.method11166().aClass385_3595);
				Class209.method3598(new StringBuilder().append("").append(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1116166565).aClass390Array2591[(Class84.myPlayer.plane)].method6722((int) class385.x >> 9, (int) class385.z >> 9, 65280)).toString(), -1193762995);
			} else if (23 == i) {
				Class209.method3598(new StringBuilder().append(IComponentDefinitions.aClass229_1280.method3861((byte) 1)).append(" ").append(IComponentDefinitions.aClass229_1280.method3860((byte) 53)).toString(), -622119201);
				Class209.method3598(new StringBuilder().append(IComponentDefinitions.aClass229_1341.method3861((byte) 1)).append(" ").append(IComponentDefinitions.aClass229_1341.method3860((byte) 119)).toString(), -632491603);
				Class209.method3598(new StringBuilder().append(IndexLoaders.ITEM_INDEX_LOADER.aClass212_5114.method3640()).append(" ").append(IndexLoaders.ITEM_INDEX_LOADER.aClass212_5114.method3632()).toString(), -1389047879);
			} else if (i == 16)
				Class356.method6227(false, (byte) 37);
			else if (15 == i) {
				client.aBool7177 = !client.aBool7177;
				Renderers.SOFTWARE_RENDERER.method8480(client.aBool7177);
				Class282_Sub14.method12222(-1129309560);
			} else if (10 == i) {
				client.anInt7240 = 0;
				IndexLoaders.MAP_REGION_DECODER.method4547((byte) -123);
			} else if (5 == i) {
				client.anInt7240 = 1094588803;
				IndexLoaders.MAP_REGION_DECODER.method4547((byte) -69);
			} else if (i == 29) {
				client.anInt7240 = -2105789690;
				IndexLoaders.MAP_REGION_DECODER.method4547((byte) -47);
			}
		} catch (Exception exception) {
			Class209.method3598(Message.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE, -1843715069), -915823010);
		}
	}

	static final void method7422(CS2Executor class527, int i) {
		int i_87_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_87_, (byte) 68);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 276864765 * class118.anInt1311;
	}
}
