/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class455 {
	int anInt5647;
	public static int anInt5648 = 64;
	static int anInt5649 = 10;
	static String aString5650 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	static long[][] aLongArrayArray5651 = new long[8][256];
	static long[] aLongArray5652 = new long[11];
	byte[] aByteArray5653 = new byte[32];
	byte[] aByteArray5654 = new byte[64];
	static int anInt5655 = 512;
	int anInt5656;
	long[] aLongArray5657;
	long[] aLongArray5658;
	long[] aLongArray5659;
	long[] aLongArray5660;
	long[] aLongArray5661;

	void method5953(int i) {
		try {
			for (int i_0_ = 0; i_0_ < 32; i_0_++)
				((Class455) this).aByteArray5653[i_0_] = (byte) 0;
			((Class455) this).anInt5656 = 0;
			((Class455) this).anInt5647 = 0;
			((Class455) this).aByteArray5654[0] = (byte) 0;
			for (int i_1_ = 0; i_1_ < 8; i_1_++)
				((Class455) this).aLongArray5658[i_1_] = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("st.f(").append(')').toString());
		}
	}

	void method5954(byte[] is, long l) {
		try {
			int i = 0;
			int i_2_ = 8 - ((int) l & 0x7) & 0x7;
			int i_3_ = ((Class455) this).anInt5647 * 1985592997 & 0x7;
			long l_4_ = l;
			int i_5_ = 31;
			int i_6_ = 0;
			for (/**/; i_5_ >= 0; i_5_--) {
				i_6_ += ((((Class455) this).aByteArray5653[i_5_] & 0xff) + ((int) l_4_ & 0xff));
				((Class455) this).aByteArray5653[i_5_] = (byte) i_6_;
				i_6_ >>>= 8;
				l_4_ >>>= 8;
			}
			while (l > 8L) {
				int i_7_ = is[i] << i_2_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_2_;
				if (i_7_ < 0 || i_7_ >= 256)
					throw new RuntimeException();
				((Class455) this).aByteArray5654[(((Class455) this).anInt5656 * 1412698381)] |= i_7_ >>> i_3_;
				((Class455) this).anInt5656 += -715643451;
				((Class455) this).anInt5647 += (8 - i_3_) * 833616173;
				if (512 == 1985592997 * ((Class455) this).anInt5647) {
					method5956((byte) 4);
					((Class455) this).anInt5656 = 0;
					((Class455) this).anInt5647 = 0;
				}
				((Class455) this).aByteArray5654[1412698381 * ((Class455) this).anInt5656] = (byte) (i_7_ << 8 - i_3_ & 0xff);
				((Class455) this).anInt5647 += 833616173 * i_3_;
				l -= 8L;
				i++;
			}
			int i_8_;
			if (l > 0L) {
				i_8_ = is[i] << i_2_ & 0xff;
				((Class455) this).aByteArray5654[1412698381 * ((Class455) this).anInt5656] |= i_8_ >>> i_3_;
			} else
				i_8_ = 0;
			if (l + (long) i_3_ < 8L)
				((Class455) this).anInt5647 += 833616173L * l;
			else {
				((Class455) this).anInt5656 += -715643451;
				((Class455) this).anInt5647 += (8 - i_3_) * 833616173;
				l -= (long) (8 - i_3_);
				if (1985592997 * ((Class455) this).anInt5647 == 512) {
					method5956((byte) 4);
					((Class455) this).anInt5656 = 0;
					((Class455) this).anInt5647 = 0;
				}
				((Class455) this).aByteArray5654[1412698381 * ((Class455) this).anInt5656] = (byte) (i_8_ << 8 - i_3_ & 0xff);
				((Class455) this).anInt5647 += 833616173 * (int) l;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("st.b(").append(')').toString());
		}
	}

	void method5955(byte[] is, int i, int i_9_) {
		try {
			((Class455) this).aByteArray5654[(((Class455) this).anInt5656 * 1412698381)] |= 128 >>> (1985592997 * ((Class455) this).anInt5647 & 0x7);
			((Class455) this).anInt5656 += -715643451;
			if (1412698381 * ((Class455) this).anInt5656 > 32) {
				while (((Class455) this).anInt5656 * 1412698381 < 64)
					((Class455) this).aByteArray5654[((((Class455) this).anInt5656 += -715643451) * 1412698381) - 1] = (byte) 0;
				method5956((byte) 4);
				((Class455) this).anInt5656 = 0;
			}
			while (((Class455) this).anInt5656 * 1412698381 < 32)
				((Class455) this).aByteArray5654[((((Class455) this).anInt5656 += -715643451) * 1412698381 - 1)] = (byte) 0;
			System.arraycopy(((Class455) this).aByteArray5653, 0, ((Class455) this).aByteArray5654, 32, 32);
			method5956((byte) 4);
			int i_10_ = 0;
			int i_11_ = i;
			while (i_10_ < 8) {
				long l = ((Class455) this).aLongArray5658[i_10_];
				is[i_11_] = (byte) (int) (l >>> 56);
				is[1 + i_11_] = (byte) (int) (l >>> 48);
				is[i_11_ + 2] = (byte) (int) (l >>> 40);
				is[i_11_ + 3] = (byte) (int) (l >>> 32);
				is[i_11_ + 4] = (byte) (int) (l >>> 24);
				is[5 + i_11_] = (byte) (int) (l >>> 16);
				is[i_11_ + 6] = (byte) (int) (l >>> 8);
				is[7 + i_11_] = (byte) (int) l;
				i_10_++;
				i_11_ += 8;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("st.p(").append(')').toString());
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_12_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = (0 == (i & 0x1) ? (long) (i_12_ >>> 8) : (long) (i_12_ & 0xff));
			long l_13_ = l << 1;
			if (l_13_ >= 256L)
				l_13_ ^= 0x11dL;
			long l_14_ = l_13_ << 1;
			if (l_14_ >= 256L)
				l_14_ ^= 0x11dL;
			long l_15_ = l_14_ ^ l;
			long l_16_ = l_14_ << 1;
			if (l_16_ >= 256L)
				l_16_ ^= 0x11dL;
			long l_17_ = l_16_ ^ l;
			aLongArrayArray5651[0][i] = (l << 56 | l << 48 | l_14_ << 40 | l << 32 | l_16_ << 24 | l_15_ << 16 | l_13_ << 8 | l_17_);
			for (int i_18_ = 1; i_18_ < 8; i_18_++)
				aLongArrayArray5651[i_18_][i] = (aLongArrayArray5651[i_18_ - 1][i] >>> 8 | aLongArrayArray5651[i_18_ - 1][i] << 56);
		}
		aLongArray5652[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_19_ = (i - 1) * 8;
			aLongArray5652[i] = (aLongArrayArray5651[0][i_19_] & ~0xffffffffffffffL ^ aLongArrayArray5651[1][i_19_ + 1] & 0xff000000000000L ^ aLongArrayArray5651[2][2 + i_19_] & 0xff0000000000L ^ aLongArrayArray5651[3][i_19_ + 3] & 0xff00000000L ^ aLongArrayArray5651[4][4 + i_19_] & 0xff000000L ^ aLongArrayArray5651[5][5 + i_19_] & 0xff0000L ^ aLongArrayArray5651[6][6 + i_19_] & 0xff00L ^ aLongArrayArray5651[7][7 + i_19_] & 0xffL);
		}
	}

	void method5956(byte i) {
		try {
			int i_20_ = 0;
			int i_21_ = 0;
			while (i_20_ < 8) {
				((Class455) this).aLongArray5660[i_20_] = ((long) ((Class455) this).aByteArray5654[i_21_] << 56 ^ ((long) ((Class455) this).aByteArray5654[1 + i_21_] & 0xffL) << 48 ^ ((long) ((Class455) this).aByteArray5654[2 + i_21_] & 0xffL) << 40 ^ ((long) ((Class455) this).aByteArray5654[i_21_ + 3] & 0xffL) << 32 ^ ((long) ((Class455) this).aByteArray5654[4 + i_21_] & 0xffL) << 24 ^ ((long) ((Class455) this).aByteArray5654[5 + i_21_] & 0xffL) << 16
						^ ((long) ((Class455) this).aByteArray5654[6 + i_21_] & 0xffL) << 8 ^ ((long) ((Class455) this).aByteArray5654[7 + i_21_] & 0xffL));
				i_20_++;
				i_21_ += 8;
			}
			for (i_20_ = 0; i_20_ < 8; i_20_++)
				((Class455) this).aLongArray5661[i_20_] = (((Class455) this).aLongArray5660[i_20_] ^ (((Class455) this).aLongArray5657[i_20_] = ((Class455) this).aLongArray5658[i_20_]));
			for (i_20_ = 1; i_20_ <= 10; i_20_++) {
				for (i_21_ = 0; i_21_ < 8; i_21_++) {
					((Class455) this).aLongArray5659[i_21_] = 0L;
					int i_22_ = 0;
					int i_23_ = 56;
					while (i_22_ < 8) {
						((Class455) this).aLongArray5659[i_21_] ^= (aLongArrayArray5651[i_22_][(int) ((((Class455) this).aLongArray5657[i_21_ - i_22_ & 0x7]) >>> i_23_) & 0xff]);
						i_22_++;
						i_23_ -= 8;
					}
				}
				for (i_21_ = 0; i_21_ < 8; i_21_++)
					((Class455) this).aLongArray5657[i_21_] = ((Class455) this).aLongArray5659[i_21_];
				((Class455) this).aLongArray5657[0] ^= aLongArray5652[i_20_];
				for (i_21_ = 0; i_21_ < 8; i_21_++) {
					((Class455) this).aLongArray5659[i_21_] = ((Class455) this).aLongArray5657[i_21_];
					int i_24_ = 0;
					int i_25_ = 56;
					while (i_24_ < 8) {
						((Class455) this).aLongArray5659[i_21_] ^= (aLongArrayArray5651[i_24_][(int) ((((Class455) this).aLongArray5661[i_21_ - i_24_ & 0x7]) >>> i_25_) & 0xff]);
						i_24_++;
						i_25_ -= 8;
					}
				}
				for (i_21_ = 0; i_21_ < 8; i_21_++)
					((Class455) this).aLongArray5661[i_21_] = ((Class455) this).aLongArray5659[i_21_];
			}
			for (i_20_ = 0; i_20_ < 8; i_20_++)
				((Class455) this).aLongArray5658[i_20_] ^= (((Class455) this).aLongArray5661[i_20_] ^ ((Class455) this).aLongArray5660[i_20_]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("st.a(").append(')').toString());
		}
	}

	Class455() {
		((Class455) this).anInt5647 = 0;
		((Class455) this).anInt5656 = 0;
		((Class455) this).aLongArray5658 = new long[8];
		((Class455) this).aLongArray5657 = new long[8];
		((Class455) this).aLongArray5659 = new long[8];
		((Class455) this).aLongArray5660 = new long[8];
		((Class455) this).aLongArray5661 = new long[8];
	}

	public static void method5957(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		try {
			if (i_27_ == i_28_)
				Class285.method2712(i, i_26_, i_27_, i_29_, i_30_, i_31_, -790065680);
			else if (i - i_27_ >= -1424479739 * Class372_Sub1_Sub1.anInt4051 && i_27_ + i <= Class372_Sub1_Sub1.anInt4048 * 1135094847 && (i_26_ - i_28_ >= 1155384281 * Class372_Sub1_Sub1.anInt4049) && (i_26_ + i_28_ <= -1062447355 * Class372_Sub1_Sub1.anInt4050))
				Class298_Sub27.method3107(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, (byte) 121);
			else
				Class422_Sub13.method5676(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, -568588475);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("st.ae(").append(')').toString());
		}
	}

	static void method5958(GraphicsToolkit class_ra, int i, int i_33_, IComponentDefinition class105, int i_34_, int i_35_) {
		try {
			for (int i_36_ = 7; i_36_ >= 0; i_36_--) {
				for (int i_37_ = 127; i_37_ >= 0; i_37_--) {
					int i_38_ = ((i_34_ & 0x3f) << 10 | (i_36_ & 0x7) << 7 | i_37_ & 0x7f);
					Class374_Sub1.method4640(false, true, -162450455);
					int i_39_ = Class294.anIntArray3165[i_38_];
					Class216.method2000(false, true, (short) -6266);
					class_ra.B(i + (class105.anInt1156 * -2093041337 * i_37_ >> 7), i_33_ + ((7 - i_36_) * (class105.anInt1162 * 457937409) >> 3), (class105.anInt1156 * -2093041337 >> 7) + 1, (457937409 * class105.anInt1162 >> 3) + 1, i_39_, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("st.f(").append(')').toString());
		}
	}
}
