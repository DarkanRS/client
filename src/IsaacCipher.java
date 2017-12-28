/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class IsaacCipher {
	static final int anInt5148 = 1020;
	int[] anIntArray5149 = new int[256];
	int[] anIntArray5150 = new int[256];
	static final int anInt5151 = 256;
	int anInt5152;
	static final int anInt5153 = 8;
	int anInt5154;
	int anInt5155;
	int anInt5156;
	static int anInt5157;

	final void method7253(byte i) {
		int i_0_ = -1640531527;
		int i_1_ = -1640531527;
		int i_2_ = -1640531527;
		int i_3_ = -1640531527;
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		for (int i_8_ = 0; i_8_ < 4; i_8_++) {
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
		}
		for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
			i_7_ += this.anIntArray5150[i_9_];
			i_6_ += this.anIntArray5150[i_9_ + 1];
			i_5_ += this.anIntArray5150[i_9_ + 2];
			i_4_ += this.anIntArray5150[i_9_ + 3];
			i_3_ += this.anIntArray5150[4 + i_9_];
			i_2_ += this.anIntArray5150[i_9_ + 5];
			i_1_ += this.anIntArray5150[6 + i_9_];
			i_0_ += this.anIntArray5150[i_9_ + 7];
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
			this.anIntArray5149[i_9_] = i_7_;
			this.anIntArray5149[i_9_ + 1] = i_6_;
			this.anIntArray5149[2 + i_9_] = i_5_;
			this.anIntArray5149[3 + i_9_] = i_4_;
			this.anIntArray5149[4 + i_9_] = i_3_;
			this.anIntArray5149[5 + i_9_] = i_2_;
			this.anIntArray5149[6 + i_9_] = i_1_;
			this.anIntArray5149[i_9_ + 7] = i_0_;
		}
		for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
			i_7_ += this.anIntArray5149[i_10_];
			i_6_ += this.anIntArray5149[1 + i_10_];
			i_5_ += this.anIntArray5149[2 + i_10_];
			i_4_ += this.anIntArray5149[3 + i_10_];
			i_3_ += this.anIntArray5149[4 + i_10_];
			i_2_ += this.anIntArray5149[i_10_ + 5];
			i_1_ += this.anIntArray5149[i_10_ + 6];
			i_0_ += this.anIntArray5149[i_10_ + 7];
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
			this.anIntArray5149[i_10_] = i_7_;
			this.anIntArray5149[1 + i_10_] = i_6_;
			this.anIntArray5149[i_10_ + 2] = i_5_;
			this.anIntArray5149[i_10_ + 3] = i_4_;
			this.anIntArray5149[4 + i_10_] = i_3_;
			this.anIntArray5149[i_10_ + 5] = i_2_;
			this.anIntArray5149[6 + i_10_] = i_1_;
			this.anIntArray5149[i_10_ + 7] = i_0_;
		}
		method7256(420526674);
		this.anInt5152 = 1059992832;
	}

	public final int method7254(int i) {
		if (0 == -566152163 * this.anInt5152) {
			method7256(420526674);
			this.anInt5152 = 1059992832;
		}
		if (!Loader.USING_ISAAC) {
			return 0;
		}
		return (this.anIntArray5150[(this.anInt5152 -= -1707135435) * -566152163]);
	}

	public final int method7255(int i) {
		if (this.anInt5152 * -566152163 == 0) {
			method7256(420526674);
			this.anInt5152 = 1059992832;
		}
		if (!Loader.USING_ISAAC) {
			return 0;
		}
		return (this.anIntArray5150[-566152163 * this.anInt5152 - 1]);
	}

	final void method7256(int i) {
		this.anInt5155 += (this.anInt5156 += 1020971657) * -37826951;
		for (int i_11_ = 0; i_11_ < 256; i_11_++) {
			int i_12_ = this.anIntArray5149[i_11_];
			if (0 == (i_11_ & 0x2)) {
				if ((i_11_ & 0x1) == 0) {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 << 13) * -676341089);
				} else {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ this.anInt5154 * 1117045087 >>> 6) * -676341089);
				}
			} else if (0 == (i_11_ & 0x1)) {
				this.anInt5154 = (-676341089 * (this.anInt5154 * 1117045087 ^ this.anInt5154 * 1117045087 << 2));
			} else {
				this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 >>> 16) * -676341089);
			}
			this.anInt5154 += (-676341089 * this.anIntArray5149[128 + i_11_ & 0xff]);
			int i_13_;
			this.anIntArray5149[i_11_] = i_13_ = (this.anInt5155 * 540448577 + (this.anIntArray5149[(i_12_ & 0x3fc) >> 2] + this.anInt5154 * 1117045087));
			this.anIntArray5150[i_11_] = ((this.anInt5155 = (i_12_ + (this.anIntArray5149[(i_13_ >> 8 & 0x3fc) >> 2])) * -1995310911) * 540448577);
		}
	}

	final void method7257() {
		int i = -1640531527;
		int i_14_ = -1640531527;
		int i_15_ = -1640531527;
		int i_16_ = -1640531527;
		int i_17_ = -1640531527;
		int i_18_ = -1640531527;
		int i_19_ = -1640531527;
		int i_20_ = -1640531527;
		for (int i_21_ = 0; i_21_ < 4; i_21_++) {
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i;
			i_14_ ^= i << 8;
			i_19_ += i_14_;
			i += i_20_;
			i ^= i_20_ >>> 9;
			i_18_ += i;
			i_20_ += i_19_;
		}
		for (int i_22_ = 0; i_22_ < 256; i_22_ += 8) {
			i_20_ += this.anIntArray5150[i_22_];
			i_19_ += this.anIntArray5150[i_22_ + 1];
			i_18_ += this.anIntArray5150[i_22_ + 2];
			i_17_ += this.anIntArray5150[i_22_ + 3];
			i_16_ += this.anIntArray5150[4 + i_22_];
			i_15_ += this.anIntArray5150[i_22_ + 5];
			i_14_ += this.anIntArray5150[6 + i_22_];
			i += this.anIntArray5150[i_22_ + 7];
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i;
			i_14_ ^= i << 8;
			i_19_ += i_14_;
			i += i_20_;
			i ^= i_20_ >>> 9;
			i_18_ += i;
			i_20_ += i_19_;
			this.anIntArray5149[i_22_] = i_20_;
			this.anIntArray5149[i_22_ + 1] = i_19_;
			this.anIntArray5149[2 + i_22_] = i_18_;
			this.anIntArray5149[3 + i_22_] = i_17_;
			this.anIntArray5149[4 + i_22_] = i_16_;
			this.anIntArray5149[5 + i_22_] = i_15_;
			this.anIntArray5149[6 + i_22_] = i_14_;
			this.anIntArray5149[i_22_ + 7] = i;
		}
		for (int i_23_ = 0; i_23_ < 256; i_23_ += 8) {
			i_20_ += this.anIntArray5149[i_23_];
			i_19_ += this.anIntArray5149[1 + i_23_];
			i_18_ += this.anIntArray5149[2 + i_23_];
			i_17_ += this.anIntArray5149[3 + i_23_];
			i_16_ += this.anIntArray5149[4 + i_23_];
			i_15_ += this.anIntArray5149[i_23_ + 5];
			i_14_ += this.anIntArray5149[i_23_ + 6];
			i += this.anIntArray5149[i_23_ + 7];
			i_20_ ^= i_19_ << 11;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 2;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 8;
			i_15_ += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 16;
			i_14_ += i_17_;
			i_16_ += i_15_;
			i_16_ ^= i_15_ << 10;
			i += i_16_;
			i_15_ += i_14_;
			i_15_ ^= i_14_ >>> 4;
			i_20_ += i_15_;
			i_14_ += i;
			i_14_ ^= i << 8;
			i_19_ += i_14_;
			i += i_20_;
			i ^= i_20_ >>> 9;
			i_18_ += i;
			i_20_ += i_19_;
			this.anIntArray5149[i_23_] = i_20_;
			this.anIntArray5149[1 + i_23_] = i_19_;
			this.anIntArray5149[i_23_ + 2] = i_18_;
			this.anIntArray5149[i_23_ + 3] = i_17_;
			this.anIntArray5149[4 + i_23_] = i_16_;
			this.anIntArray5149[i_23_ + 5] = i_15_;
			this.anIntArray5149[6 + i_23_] = i_14_;
			this.anIntArray5149[i_23_ + 7] = i;
		}
		method7256(420526674);
		this.anInt5152 = 1059992832;
	}

	public final int method7258() {
		if (this.anInt5152 * -566152163 == 0) {
			method7256(420526674);
			this.anInt5152 = 1059992832;
		}
		return (this.anIntArray5150[-566152163 * this.anInt5152 - 1]);
	}

	public IsaacCipher(int[] is) {
		for (int i = 0; i < is.length; i++) {
			this.anIntArray5150[i] = is[i];
		}
		method7253((byte) -97);
	}

	final void method7259() {
		this.anInt5155 += (this.anInt5156 += 1020971657) * -37826951;
		for (int i = 0; i < 256; i++) {
			int i_24_ = this.anIntArray5149[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0) {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 << 13) * -676341089);
				} else {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ this.anInt5154 * 1117045087 >>> 6) * -676341089);
				}
			} else if (0 == (i & 0x1)) {
				this.anInt5154 = (-676341089 * (this.anInt5154 * 1117045087 ^ this.anInt5154 * 1117045087 << 2));
			} else {
				this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 >>> 16) * -676341089);
			}
			this.anInt5154 += (-676341089 * this.anIntArray5149[128 + i & 0xff]);
			int i_25_;
			this.anIntArray5149[i] = i_25_ = (this.anInt5155 * 540448577 + (this.anIntArray5149[(i_24_ & 0x3fc) >> 2] + this.anInt5154 * 1117045087));
			this.anIntArray5150[i] = ((this.anInt5155 = (i_24_ + (this.anIntArray5149[(i_25_ >> 8 & 0x3fc) >> 2])) * -1995310911) * 540448577);
		}
	}

	final void method7260() {
		this.anInt5155 += (this.anInt5156 += 1020971657) * -37826951;
		for (int i = 0; i < 256; i++) {
			int i_26_ = this.anIntArray5149[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0) {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 << 13) * -676341089);
				} else {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ this.anInt5154 * 1117045087 >>> 6) * -676341089);
				}
			} else if (0 == (i & 0x1)) {
				this.anInt5154 = (-676341089 * (this.anInt5154 * 1117045087 ^ this.anInt5154 * 1117045087 << 2));
			} else {
				this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 >>> 16) * -676341089);
			}
			this.anInt5154 += (-676341089 * this.anIntArray5149[128 + i & 0xff]);
			int i_27_;
			this.anIntArray5149[i] = i_27_ = (this.anInt5155 * 540448577 + (this.anIntArray5149[(i_26_ & 0x3fc) >> 2] + this.anInt5154 * 1117045087));
			this.anIntArray5150[i] = ((this.anInt5155 = (i_26_ + (this.anIntArray5149[(i_27_ >> 8 & 0x3fc) >> 2])) * -1995310911) * 540448577);
		}
	}

	final void method7261() {
		this.anInt5155 += (this.anInt5156 += 1020971657) * -37826951;
		for (int i = 0; i < 256; i++) {
			int i_28_ = this.anIntArray5149[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0) {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 << 13) * -676341089);
				} else {
					this.anInt5154 = ((1117045087 * this.anInt5154 ^ this.anInt5154 * 1117045087 >>> 6) * -676341089);
				}
			} else if (0 == (i & 0x1)) {
				this.anInt5154 = (-676341089 * (this.anInt5154 * 1117045087 ^ this.anInt5154 * 1117045087 << 2));
			} else {
				this.anInt5154 = ((1117045087 * this.anInt5154 ^ 1117045087 * this.anInt5154 >>> 16) * -676341089);
			}
			this.anInt5154 += (-676341089 * this.anIntArray5149[128 + i & 0xff]);
			int i_29_;
			this.anIntArray5149[i] = i_29_ = (this.anInt5155 * 540448577 + (this.anIntArray5149[(i_28_ & 0x3fc) >> 2] + this.anInt5154 * 1117045087));
			this.anIntArray5150[i] = ((this.anInt5155 = (i_28_ + (this.anIntArray5149[(i_29_ >> 8 & 0x3fc) >> 2])) * -1995310911) * 540448577);
		}
	}

	final void method7262() {
		int i = -1640531527;
		int i_30_ = -1640531527;
		int i_31_ = -1640531527;
		int i_32_ = -1640531527;
		int i_33_ = -1640531527;
		int i_34_ = -1640531527;
		int i_35_ = -1640531527;
		int i_36_ = -1640531527;
		for (int i_37_ = 0; i_37_ < 4; i_37_++) {
			i_36_ ^= i_35_ << 11;
			i_33_ += i_36_;
			i_35_ += i_34_;
			i_35_ ^= i_34_ >>> 2;
			i_32_ += i_35_;
			i_34_ += i_33_;
			i_34_ ^= i_33_ << 8;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 16;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 10;
			i += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 4;
			i_36_ += i_31_;
			i_30_ += i;
			i_30_ ^= i << 8;
			i_35_ += i_30_;
			i += i_36_;
			i ^= i_36_ >>> 9;
			i_34_ += i;
			i_36_ += i_35_;
		}
		for (int i_38_ = 0; i_38_ < 256; i_38_ += 8) {
			i_36_ += this.anIntArray5150[i_38_];
			i_35_ += this.anIntArray5150[i_38_ + 1];
			i_34_ += this.anIntArray5150[i_38_ + 2];
			i_33_ += this.anIntArray5150[i_38_ + 3];
			i_32_ += this.anIntArray5150[4 + i_38_];
			i_31_ += this.anIntArray5150[i_38_ + 5];
			i_30_ += this.anIntArray5150[6 + i_38_];
			i += this.anIntArray5150[i_38_ + 7];
			i_36_ ^= i_35_ << 11;
			i_33_ += i_36_;
			i_35_ += i_34_;
			i_35_ ^= i_34_ >>> 2;
			i_32_ += i_35_;
			i_34_ += i_33_;
			i_34_ ^= i_33_ << 8;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 16;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 10;
			i += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 4;
			i_36_ += i_31_;
			i_30_ += i;
			i_30_ ^= i << 8;
			i_35_ += i_30_;
			i += i_36_;
			i ^= i_36_ >>> 9;
			i_34_ += i;
			i_36_ += i_35_;
			this.anIntArray5149[i_38_] = i_36_;
			this.anIntArray5149[i_38_ + 1] = i_35_;
			this.anIntArray5149[2 + i_38_] = i_34_;
			this.anIntArray5149[3 + i_38_] = i_33_;
			this.anIntArray5149[4 + i_38_] = i_32_;
			this.anIntArray5149[5 + i_38_] = i_31_;
			this.anIntArray5149[6 + i_38_] = i_30_;
			this.anIntArray5149[i_38_ + 7] = i;
		}
		for (int i_39_ = 0; i_39_ < 256; i_39_ += 8) {
			i_36_ += this.anIntArray5149[i_39_];
			i_35_ += this.anIntArray5149[1 + i_39_];
			i_34_ += this.anIntArray5149[2 + i_39_];
			i_33_ += this.anIntArray5149[3 + i_39_];
			i_32_ += this.anIntArray5149[4 + i_39_];
			i_31_ += this.anIntArray5149[i_39_ + 5];
			i_30_ += this.anIntArray5149[i_39_ + 6];
			i += this.anIntArray5149[i_39_ + 7];
			i_36_ ^= i_35_ << 11;
			i_33_ += i_36_;
			i_35_ += i_34_;
			i_35_ ^= i_34_ >>> 2;
			i_32_ += i_35_;
			i_34_ += i_33_;
			i_34_ ^= i_33_ << 8;
			i_31_ += i_34_;
			i_33_ += i_32_;
			i_33_ ^= i_32_ >>> 16;
			i_30_ += i_33_;
			i_32_ += i_31_;
			i_32_ ^= i_31_ << 10;
			i += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 4;
			i_36_ += i_31_;
			i_30_ += i;
			i_30_ ^= i << 8;
			i_35_ += i_30_;
			i += i_36_;
			i ^= i_36_ >>> 9;
			i_34_ += i;
			i_36_ += i_35_;
			this.anIntArray5149[i_39_] = i_36_;
			this.anIntArray5149[1 + i_39_] = i_35_;
			this.anIntArray5149[i_39_ + 2] = i_34_;
			this.anIntArray5149[i_39_ + 3] = i_33_;
			this.anIntArray5149[4 + i_39_] = i_32_;
			this.anIntArray5149[i_39_ + 5] = i_31_;
			this.anIntArray5149[6 + i_39_] = i_30_;
			this.anIntArray5149[i_39_ + 7] = i;
		}
		method7256(420526674);
		this.anInt5152 = 1059992832;
	}

	final void method7263() {
		int i = -1640531527;
		int i_40_ = -1640531527;
		int i_41_ = -1640531527;
		int i_42_ = -1640531527;
		int i_43_ = -1640531527;
		int i_44_ = -1640531527;
		int i_45_ = -1640531527;
		int i_46_ = -1640531527;
		for (int i_47_ = 0; i_47_ < 4; i_47_++) {
			i_46_ ^= i_45_ << 11;
			i_43_ += i_46_;
			i_45_ += i_44_;
			i_45_ ^= i_44_ >>> 2;
			i_42_ += i_45_;
			i_44_ += i_43_;
			i_44_ ^= i_43_ << 8;
			i_41_ += i_44_;
			i_43_ += i_42_;
			i_43_ ^= i_42_ >>> 16;
			i_40_ += i_43_;
			i_42_ += i_41_;
			i_42_ ^= i_41_ << 10;
			i += i_42_;
			i_41_ += i_40_;
			i_41_ ^= i_40_ >>> 4;
			i_46_ += i_41_;
			i_40_ += i;
			i_40_ ^= i << 8;
			i_45_ += i_40_;
			i += i_46_;
			i ^= i_46_ >>> 9;
			i_44_ += i;
			i_46_ += i_45_;
		}
		for (int i_48_ = 0; i_48_ < 256; i_48_ += 8) {
			i_46_ += this.anIntArray5150[i_48_];
			i_45_ += this.anIntArray5150[i_48_ + 1];
			i_44_ += this.anIntArray5150[i_48_ + 2];
			i_43_ += this.anIntArray5150[i_48_ + 3];
			i_42_ += this.anIntArray5150[4 + i_48_];
			i_41_ += this.anIntArray5150[i_48_ + 5];
			i_40_ += this.anIntArray5150[6 + i_48_];
			i += this.anIntArray5150[i_48_ + 7];
			i_46_ ^= i_45_ << 11;
			i_43_ += i_46_;
			i_45_ += i_44_;
			i_45_ ^= i_44_ >>> 2;
			i_42_ += i_45_;
			i_44_ += i_43_;
			i_44_ ^= i_43_ << 8;
			i_41_ += i_44_;
			i_43_ += i_42_;
			i_43_ ^= i_42_ >>> 16;
			i_40_ += i_43_;
			i_42_ += i_41_;
			i_42_ ^= i_41_ << 10;
			i += i_42_;
			i_41_ += i_40_;
			i_41_ ^= i_40_ >>> 4;
			i_46_ += i_41_;
			i_40_ += i;
			i_40_ ^= i << 8;
			i_45_ += i_40_;
			i += i_46_;
			i ^= i_46_ >>> 9;
			i_44_ += i;
			i_46_ += i_45_;
			this.anIntArray5149[i_48_] = i_46_;
			this.anIntArray5149[i_48_ + 1] = i_45_;
			this.anIntArray5149[2 + i_48_] = i_44_;
			this.anIntArray5149[3 + i_48_] = i_43_;
			this.anIntArray5149[4 + i_48_] = i_42_;
			this.anIntArray5149[5 + i_48_] = i_41_;
			this.anIntArray5149[6 + i_48_] = i_40_;
			this.anIntArray5149[i_48_ + 7] = i;
		}
		for (int i_49_ = 0; i_49_ < 256; i_49_ += 8) {
			i_46_ += this.anIntArray5149[i_49_];
			i_45_ += this.anIntArray5149[1 + i_49_];
			i_44_ += this.anIntArray5149[2 + i_49_];
			i_43_ += this.anIntArray5149[3 + i_49_];
			i_42_ += this.anIntArray5149[4 + i_49_];
			i_41_ += this.anIntArray5149[i_49_ + 5];
			i_40_ += this.anIntArray5149[i_49_ + 6];
			i += this.anIntArray5149[i_49_ + 7];
			i_46_ ^= i_45_ << 11;
			i_43_ += i_46_;
			i_45_ += i_44_;
			i_45_ ^= i_44_ >>> 2;
			i_42_ += i_45_;
			i_44_ += i_43_;
			i_44_ ^= i_43_ << 8;
			i_41_ += i_44_;
			i_43_ += i_42_;
			i_43_ ^= i_42_ >>> 16;
			i_40_ += i_43_;
			i_42_ += i_41_;
			i_42_ ^= i_41_ << 10;
			i += i_42_;
			i_41_ += i_40_;
			i_41_ ^= i_40_ >>> 4;
			i_46_ += i_41_;
			i_40_ += i;
			i_40_ ^= i << 8;
			i_45_ += i_40_;
			i += i_46_;
			i ^= i_46_ >>> 9;
			i_44_ += i;
			i_46_ += i_45_;
			this.anIntArray5149[i_49_] = i_46_;
			this.anIntArray5149[1 + i_49_] = i_45_;
			this.anIntArray5149[i_49_ + 2] = i_44_;
			this.anIntArray5149[i_49_ + 3] = i_43_;
			this.anIntArray5149[4 + i_49_] = i_42_;
			this.anIntArray5149[i_49_ + 5] = i_41_;
			this.anIntArray5149[6 + i_49_] = i_40_;
			this.anIntArray5149[i_49_ + 7] = i;
		}
		method7256(420526674);
		this.anInt5152 = 1059992832;
	}

	public final int method7264() {
		if (this.anInt5152 * -566152163 == 0) {
			method7256(420526674);
			this.anInt5152 = 1059992832;
		}
		if (!Loader.USING_ISAAC) {
			return 0;
		}
		return (this.anIntArray5150[-566152163 * this.anInt5152 - 1]);
	}

	final void method7265() {
		int i = -1640531527;
		int i_50_ = -1640531527;
		int i_51_ = -1640531527;
		int i_52_ = -1640531527;
		int i_53_ = -1640531527;
		int i_54_ = -1640531527;
		int i_55_ = -1640531527;
		int i_56_ = -1640531527;
		for (int i_57_ = 0; i_57_ < 4; i_57_++) {
			i_56_ ^= i_55_ << 11;
			i_53_ += i_56_;
			i_55_ += i_54_;
			i_55_ ^= i_54_ >>> 2;
			i_52_ += i_55_;
			i_54_ += i_53_;
			i_54_ ^= i_53_ << 8;
			i_51_ += i_54_;
			i_53_ += i_52_;
			i_53_ ^= i_52_ >>> 16;
			i_50_ += i_53_;
			i_52_ += i_51_;
			i_52_ ^= i_51_ << 10;
			i += i_52_;
			i_51_ += i_50_;
			i_51_ ^= i_50_ >>> 4;
			i_56_ += i_51_;
			i_50_ += i;
			i_50_ ^= i << 8;
			i_55_ += i_50_;
			i += i_56_;
			i ^= i_56_ >>> 9;
			i_54_ += i;
			i_56_ += i_55_;
		}
		for (int i_58_ = 0; i_58_ < 256; i_58_ += 8) {
			i_56_ += this.anIntArray5150[i_58_];
			i_55_ += this.anIntArray5150[i_58_ + 1];
			i_54_ += this.anIntArray5150[i_58_ + 2];
			i_53_ += this.anIntArray5150[i_58_ + 3];
			i_52_ += this.anIntArray5150[4 + i_58_];
			i_51_ += this.anIntArray5150[i_58_ + 5];
			i_50_ += this.anIntArray5150[6 + i_58_];
			i += this.anIntArray5150[i_58_ + 7];
			i_56_ ^= i_55_ << 11;
			i_53_ += i_56_;
			i_55_ += i_54_;
			i_55_ ^= i_54_ >>> 2;
			i_52_ += i_55_;
			i_54_ += i_53_;
			i_54_ ^= i_53_ << 8;
			i_51_ += i_54_;
			i_53_ += i_52_;
			i_53_ ^= i_52_ >>> 16;
			i_50_ += i_53_;
			i_52_ += i_51_;
			i_52_ ^= i_51_ << 10;
			i += i_52_;
			i_51_ += i_50_;
			i_51_ ^= i_50_ >>> 4;
			i_56_ += i_51_;
			i_50_ += i;
			i_50_ ^= i << 8;
			i_55_ += i_50_;
			i += i_56_;
			i ^= i_56_ >>> 9;
			i_54_ += i;
			i_56_ += i_55_;
			this.anIntArray5149[i_58_] = i_56_;
			this.anIntArray5149[i_58_ + 1] = i_55_;
			this.anIntArray5149[2 + i_58_] = i_54_;
			this.anIntArray5149[3 + i_58_] = i_53_;
			this.anIntArray5149[4 + i_58_] = i_52_;
			this.anIntArray5149[5 + i_58_] = i_51_;
			this.anIntArray5149[6 + i_58_] = i_50_;
			this.anIntArray5149[i_58_ + 7] = i;
		}
		for (int i_59_ = 0; i_59_ < 256; i_59_ += 8) {
			i_56_ += this.anIntArray5149[i_59_];
			i_55_ += this.anIntArray5149[1 + i_59_];
			i_54_ += this.anIntArray5149[2 + i_59_];
			i_53_ += this.anIntArray5149[3 + i_59_];
			i_52_ += this.anIntArray5149[4 + i_59_];
			i_51_ += this.anIntArray5149[i_59_ + 5];
			i_50_ += this.anIntArray5149[i_59_ + 6];
			i += this.anIntArray5149[i_59_ + 7];
			i_56_ ^= i_55_ << 11;
			i_53_ += i_56_;
			i_55_ += i_54_;
			i_55_ ^= i_54_ >>> 2;
			i_52_ += i_55_;
			i_54_ += i_53_;
			i_54_ ^= i_53_ << 8;
			i_51_ += i_54_;
			i_53_ += i_52_;
			i_53_ ^= i_52_ >>> 16;
			i_50_ += i_53_;
			i_52_ += i_51_;
			i_52_ ^= i_51_ << 10;
			i += i_52_;
			i_51_ += i_50_;
			i_51_ ^= i_50_ >>> 4;
			i_56_ += i_51_;
			i_50_ += i;
			i_50_ ^= i << 8;
			i_55_ += i_50_;
			i += i_56_;
			i ^= i_56_ >>> 9;
			i_54_ += i;
			i_56_ += i_55_;
			this.anIntArray5149[i_59_] = i_56_;
			this.anIntArray5149[1 + i_59_] = i_55_;
			this.anIntArray5149[i_59_ + 2] = i_54_;
			this.anIntArray5149[i_59_ + 3] = i_53_;
			this.anIntArray5149[4 + i_59_] = i_52_;
			this.anIntArray5149[i_59_ + 5] = i_51_;
			this.anIntArray5149[6 + i_59_] = i_50_;
			this.anIntArray5149[i_59_ + 7] = i;
		}
		method7256(420526674);
		this.anInt5152 = 1059992832;
	}

	public static Class217_Sub1 method7266(int i) {
		return Class474.method7916((-87869981 * Class159.aClass450_2010.worldId), 1371284314);
	}

	static final void method7267(Class118 class118, Class98 class98, Class527 class527, int i) {
		class118.aBool1344 = ((class527.anIntArray6999[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 89);
	}

	static final void method7268(int i) {
		if (client.aFloat7146 < 1081.0F) {
			client.aFloat7146 = 1081.0F;
		}
		if (client.aFloat7146 > 2980.0F) {
			client.aFloat7146 = 2980.0F;
		}
		for (/**/; client.aFloat7365 >= 16384.0F; client.aFloat7365 -= 16384.0F) {
			/* empty */
		}
		for (/**/; client.aFloat7365 < 0.0F; client.aFloat7365 += 16384.0F) {
			/* empty */
		}
		Class311 class311 = client.aClass257_7353.method4433(33386298);
		Class206 class206 = client.aClass257_7353.method4430(-1812615457);
		int i_60_ = 1762352089 * Class11.anInt122 >> 9;
		int i_61_ = 518160421 * Class266.anInt3289 >> 9;
		int i_62_ = Class504.method8389(Class11.anInt122 * 1762352089, Class266.anInt3289 * 518160421, Class4.anInt35 * 675588453, (byte) 58);
		int i_63_ = 0;
		if (i_60_ > 3 && i_61_ > 3 && i_60_ < client.aClass257_7353.method4424(-61399020) - 4 && i_61_ < client.aClass257_7353.method4451(-1849222129) - 4) {
			for (int i_64_ = i_60_ - 4; i_64_ <= i_60_ + 4; i_64_++) {
				for (int i_65_ = i_61_ - 4; i_65_ <= 4 + i_61_; i_65_++) {
					int i_66_ = Class4.anInt35 * 675588453;
					if (i_66_ < 3 && class311.method5497(i_64_, i_65_, 1857186418)) {
						i_66_++;
					}
					int i_67_ = 0;
					byte[][] is = client.aClass257_7353.method4507(i_66_, (byte) 27);
					if (is != null) {
						i_67_ = (is[i_64_][i_65_] & 0xff) * 8 << 2;
					}
					if (null != class206.aClass390Array2591 && class206.aClass390Array2591[i_66_] != null) {
						int i_68_ = i_62_ - (class206.aClass390Array2591[i_66_].method6722(i_64_, i_65_, 65280) - i_67_);
						if (i_68_ > i_63_) {
							i_63_ = i_68_;
						}
					}
				}
			}
		}
		int i_69_ = (i_63_ >> 2) * 1536;
		if (i_69_ > 786432) {
			i_69_ = 786432;
		}
		if (i_69_ < 262144) {
			i_69_ = 262144;
		}
		if (i_69_ > client.anInt7273 * 1661251369) {
			client.anInt7273 += 1539398937 * ((i_69_ - 1661251369 * client.anInt7273) / 24);
		} else if (i_69_ < 1661251369 * client.anInt7273) {
			client.anInt7273 += (i_69_ - 1661251369 * client.anInt7273) / 80 * 1539398937;
		}
	}
}
