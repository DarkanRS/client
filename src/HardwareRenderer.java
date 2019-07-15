import java.awt.Canvas;

public class HardwareRenderer extends GraphicalRenderer {

	int anInt8977;
	int anInt8998;
	int anInt8999;
	int anInt9000;
	int anInt9001;
	boolean aBool9012;
	boolean aBool9014;
	float aFloat8976;
	float aFloat9004;
	float aFloat9003;
	float aFloat8982;
	int anInt8983;
	int anInt9009;
	int anInt9002;
	int anInt8986;
	float aFloat8978;
	float aFloat8985;
	int anInt8990;
	int anInt8991;
	int anInt9011;
	int anInt8988;
	int anInt9007;
	int anInt9008;
	Class185[] aClass185Array8984;
	int anInt9015;
	NativeSprite aNativeSprite_8987;
	Matrix44Var aClass294_8993;
	int anInt8992;
	float[][] aFloatArrayArray8989;
	int anInt9005;
	boolean aBool8997;
	SoftCache aClass229_9013;
	SoftCache aClass229_9006;
	Matrix44Arr aClass384_8994;
	Matrix44Arr aClass384_8995;
	Matrix44Arr aClass384_8996;
	int anInt8980;
	int anInt8981;
	int[] anIntArray8979;
	float[] aFloatArray9010;

	public boolean method8399() {
		return false;
	}

	public RendererInfo method8392() {
		return new RendererInfo(0, "Pure Java", 1, "CPU", 0L);
	}

	public void method8507() {
	}

	public void method8395() {
	}

	public void method8398(int i_1) {
		int i_2 = i_1 - this.anInt8977;

		for (Node_Sub27 class282_sub27_3 = (Node_Sub27) this.aClass229_9006.method3866(1886478674); class282_sub27_3 != null; class282_sub27_3 = (Node_Sub27) this.aClass229_9006.method3867()) {
			if (class282_sub27_3.aBool7693) {
				class282_sub27_3.anInt7692 += i_2;
				int i_4 = class282_sub27_3.anInt7692 / 50;
				if (i_4 > 0) {
					TextureDetails class169_5 = this.anInterface22_5834.method144(class282_sub27_3.anInt7695);
					float f_6 = class169_5.isHalfSize ? 64.0F : 128.0F;
					class282_sub27_3.method12403((int) (f_6 * ((float) class169_5.textureSpeedU * ((float) i_2 / 1000.0F) / 64.0F)), (int) ((float) class169_5.textureSpeedV * ((float) i_2 / 1000.0F) / 64.0F * f_6));
					class282_sub27_3.anInt7692 -= i_4 * 50;
				}

				class282_sub27_3.aBool7693 = false;
			}
		}

		this.anInt8977 = i_1;
		this.aClass229_9013.method3858(5);
		this.aClass229_9006.method3858(5);
	}

	public int method8443(int i_1, int i_2) {
		i_1 |= 0x20800;
		return i_1 & i_2 ^ i_2;
	}

	void method8592(float f_1, float f_2, float f_3) {
	}

	int[] method14359(int i) {
		Node_Sub27 class282_sub27;
		synchronized (((HardwareRenderer) this).aClass229_9006) {
			class282_sub27 = ((Node_Sub27) ((HardwareRenderer) this).aClass229_9006.get((long) i | ~0x7fffffffffffffffL));
			if (class282_sub27 == null) {
				if (!anInterface22_5834.method139(i, -99337949)) {
					int[] is = null;
					return is;
				}
				TextureDetails class169 = anInterface22_5834.method144(i);
				int i_29_ = (class169.isHalfSize || ((HardwareRenderer) this).aBool8997 ? 64 : ((HardwareRenderer) this).anInt9005);
				class282_sub27 = (new Node_Sub27(i, i_29_, anInterface22_5834.method141(i, i_29_, i_29_, true, 1334254083), 1 != class169.blendType));
				((HardwareRenderer) this).aClass229_9006.put(class282_sub27, (long) i | ~0x7fffffffffffffffL);
			}
		}
		((Node_Sub27) class282_sub27).aBool7693 = true;
		return class282_sub27.method12406();
	}

	boolean method14360(int i_1) {
		return this.anInterface22_5834.method139(i_1, -976464344);
	}

	public boolean method8498() {
		return false;
	}

	int method14361(int i_1) {
		return this.anInterface22_5834.method144(i_1).blendType;
	}

	int method14362(int i_1) {
		return this.anInterface22_5834.method144(i_1).color & 0xffff;
	}

	public void method8598(Class152 class152_1) {
	}

	void method14363(boolean bool_1, boolean bool_2, Class151 class151_4) {
		Class185 class185_5 = this.method14370(Thread.currentThread());
		EntityNode_Sub1 class275_sub1_6 = class151_4.aClass464_1961.aEntityNode_Sub1_5554;

		for (EntityNode_Sub1 class275_sub1_7 = class275_sub1_6.aEntityNode_Sub1_7706; class275_sub1_7 != class275_sub1_6; class275_sub1_7 = class275_sub1_7.aEntityNode_Sub1_7706) {
			PointEntity class275_sub1_sub1_8 = (PointEntity) class275_sub1_7;
			int i_9 = class275_sub1_sub1_8.x >> 12;
			int i_10 = class275_sub1_sub1_8.z >> 12;
			int i_11 = class275_sub1_sub1_8.y >> 12;
			float f_12 = this.aClass384_8996.buf[14] + this.aClass384_8996.buf[10] * (float) i_11 + (float) i_9 * this.aClass384_8996.buf[2] + (float) i_10 * this.aClass384_8996.buf[6];
			float f_13 = this.aClass384_8996.buf[15] + this.aClass384_8996.buf[7] * (float) i_10 + this.aClass384_8996.buf[3] * (float) i_9 + this.aClass384_8996.buf[11] * (float) i_11;
			if (f_12 >= -f_13) {
				float f_14 = this.aFloat8985 + f_12 * this.aFloat8978 / f_13;
				if (f_12 <= class185_5.aFloat2305) {
					float f_15 = this.aClass384_8996.buf[0] * (float) i_9 + this.aClass384_8996.buf[4] * (float) i_10 + (float) i_11 * this.aClass384_8996.buf[8] + this.aClass384_8996.buf[12];
					float f_16 = (float) i_11 * this.aClass384_8996.buf[9] + this.aClass384_8996.buf[1] * (float) i_9 + this.aClass384_8996.buf[5] * (float) i_10 + this.aClass384_8996.buf[13];
					if (f_15 >= -f_13 && f_15 <= f_13 && f_16 >= -f_13 && f_16 <= f_13) {
						float f_17 = (float) class275_sub1_sub1_8.size / 4096.0F;
						float f_18 = f_17 * this.aClass384_8995.buf[0] + f_15;
						float f_19 = f_13 + this.aClass384_8995.buf[3] * f_17;
						float f_20 = this.aFloat9003 + f_15 * this.aFloat8976 / f_13;
						float f_21 = this.aFloat9004 * f_16 / f_13 + this.aFloat8982;
						float f_22 = this.aFloat9003 + f_18 * this.aFloat8976 / f_19;
						this.method14371(bool_1, bool_2, class275_sub1_sub1_8, (int) f_20, (int) f_21, f_14, (int) (f_22 < f_20 ? f_20 - f_22 : f_22 - f_20));
					}
				}
			}
		}

	}

	public boolean method8465() {
		return false;
	}

	public boolean method8664() {
		return true;
	}

	public boolean method8403() {
		return false;
	}

	public boolean method8404() {
		return false;
	}

	public boolean method8402() {
		return false;
	}

	public boolean method8405() {
		return false;
	}

	public boolean method8406() {
		return false;
	}

	public boolean method8454() {
		return false;
	}

	public boolean method8407() {
		return true;
	}

	public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = (float) i_3 * this.aClass384_8996.buf[10] + (float) i_2 * this.aClass384_8996.buf[6] + this.aClass384_8996.buf[14] + (float) i_1 * this.aClass384_8996.buf[2];
		float f_9 = this.aClass384_8996.buf[6] * (float) i_5 + this.aClass384_8996.buf[14] + this.aClass384_8996.buf[2] * (float) i_4 + this.aClass384_8996.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8996.buf[15] + (float) i_1 * this.aClass384_8996.buf[3] + (float) i_2 * this.aClass384_8996.buf[7] + (float) i_3 * this.aClass384_8996.buf[11];
		float f_11 = (float) i_5 * this.aClass384_8996.buf[7] + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[3] * (float) i_4 + (float) i_6 * this.aClass384_8996.buf[11];
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8996.buf[4] * (float) i_2 + this.aClass384_8996.buf[12] + (float) i_1 * this.aClass384_8996.buf[0] + (float) i_3 * this.aClass384_8996.buf[8];
		float f_13 = (float) i_6 * this.aClass384_8996.buf[8] + (float) i_4 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[4] * (float) i_5;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8996.buf[5] * (float) i_2 + (float) i_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * (float) i_4 + this.aClass384_8996.buf[5] * (float) i_5 + (float) i_6 * this.aClass384_8996.buf[9];
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return Class52_Sub1.method14493(this, canvas_1, i_2, i_3, -2066477984);
	}

	public void RA(boolean bool_1) {
		Class185 class185_2 = this.method14370(Thread.currentThread());
		class185_2.aBool2334 = bool_1;
	}

	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_5 = new int[i_3 * i_4];
			int i_6 = 0;

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				int i_8 = (i_7 + i_2) * this.anInt8980 + i_1;

				for (int i_9 = 0; i_9 < i_3; i_9++) {
					ints_5[i_6++] = this.anIntArray8979[i_8 + i_9];
				}
			}

			return ints_5;
		}
	}

	public void method8420() {
	}

	public void method8408(int[] ints_1) {
		ints_1[0] = this.anInt8980;
		ints_1[1] = this.anInt8981;
	}

	public boolean method8600() {
		return false;
	}

	public void method8618(Node_Sub1 class282_sub1_1) {
	}

	public void method8421() {
		this.anInt8998 = 0;
		this.anInt8999 = 0;
		this.anInt9000 = this.anInt8980;
		this.anInt9001 = this.anInt8981;
		this.method14364();
	}

	public void method8617(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8998 = i_1;
		this.anInt8999 = i_2;
		this.anInt9000 = i_3;
		this.anInt9001 = i_4;
		this.method14364();
	}

	void method8397() {
		if (this.aBool9012) {
			Class13.method508(true, false, 31830891);
			this.aBool9012 = false;
		}

		this.aBool9014 = true;
	}

	void method14364() {
		int i_1 = this.anInt9002 - this.anInt8983;
		int i_2 = this.anInt8986 - this.anInt9009;
		float f_3 = this.aFloat8976 = (float) this.anInt9000 / 2.0F;
		float f_4 = this.aFloat9004 = (float) this.anInt9001 / 2.0F;
		this.aFloat9003 = (float) this.anInt8998 + f_3;
		this.aFloat8982 = (float) this.anInt8999 + f_4;

		int i_5;
		for (i_5 = 0; i_5 < this.anInt9008; i_5++) {
			Class185 class185_8 = this.aClass185Array8984[i_5];
			ChoppyItemFixClass choppyitemfixclass_7 = class185_8.aClass144_2310;
			choppyitemfixclass_7.aFloat1679 = f_3;
			choppyitemfixclass_7.aFloat1702 = f_4;
			choppyitemfixclass_7.aFloat1678 = this.aFloat9003 - (float) this.anInt8983;
			choppyitemfixclass_7.aFloat1680 = this.aFloat8982 - (float) this.anInt9009;
			choppyitemfixclass_7.anInt1684 = i_1;
			choppyitemfixclass_7.anInt1700 = i_2;
		}

		i_5 = this.anInt8980 * this.anInt9009 + this.anInt8983;

		for (int i_6 = this.anInt9009; i_6 < this.anInt8986; i_6++) {
			for (int i_9 = 0; i_9 < this.anInt9008; i_9++) {
				this.aClass185Array8984[i_9].aClass144_2310.anIntArray1685[i_6 - this.anInt9009] = i_5;
			}

			i_5 += this.anInt8980;
		}

	}

	public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		boolean bool_7 = false;
		int i_8 = i_2;

		for (int i_9 = 0; i_9 < i_5; i_9++) {
			for (int i_10 = 0; i_10 < i_4; i_10++) {
				int i_11 = ints_1[i_8++] >>> 24;
				if (i_11 != 0 && i_11 != 255) {
					bool_7 = true;
					return (NativeSprite) (bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6));
				}
			}
		}

		return (NativeSprite) (bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6));
	}

	public FontRenderer createFont(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		int[] ints_4 = new int[arr_2.length];
		int[] ints_5 = new int[arr_2.length];
		boolean bool_6 = false;

		for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
			ints_4[i_7] = arr_2[i_7].width;
			ints_5[i_7] = arr_2[i_7].height;
			if (arr_2[i_7].alpha != null) {
				bool_6 = true;
			}
		}

		if (bool_3) {
			if (bool_6) {
				return new FontRenderer_Sub2(this, fontmetrics_1, arr_2, ints_4, ints_5);
			} else {
				return new FontRenderer_Sub1(this, fontmetrics_1, arr_2, ints_4, ints_5);
			}
		} else if (bool_6) {
			throw new IllegalArgumentException("");
		} else {
			return new FontRenderer_Sub3(this, fontmetrics_1, arr_2, ints_4, ints_5);
		}
	}

	public void o(int i_1, int i_2, int i_3, int i_4) {
		if (this.anInt8983 < i_1) {
			this.anInt8983 = i_1;
		}

		if (this.anInt9009 < i_2) {
			this.anInt9009 = i_2;
		}

		if (this.anInt9002 > i_3) {
			this.anInt9002 = i_3;
		}

		if (this.anInt8986 > i_4) {
			this.anInt8986 = i_4;
		}

		this.method14364();
	}

	void method8531() {
		if (this.aBool9012) {
			Class13.method508(true, false, -468399844);
			this.aBool9012 = false;
		}

		this.aBool9014 = true;
	}

	public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		boolean bool_7 = false;
		int i_8 = i_2;

		for (int i_9 = 0; i_9 < i_5; i_9++) {
			for (int i_10 = 0; i_10 < i_4; i_10++) {
				int i_11 = ints_1[i_8++] >>> 24;
				if (i_11 != 0 && i_11 != 255) {
					bool_7 = true;
					return (NativeSprite) (bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6));
				}
			}
		}

		return (NativeSprite) (bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6));
	}

	public void B(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.anIntArray8979 != null) {
			if (i_1 < this.anInt8983) {
				i_3 -= this.anInt8983 - i_1;
				i_1 = this.anInt8983;
			}

			if (i_2 < this.anInt9009) {
				i_4 -= this.anInt9009 - i_2;
				i_2 = this.anInt9009;
			}

			if (i_3 + i_1 > this.anInt9002) {
				i_3 = this.anInt9002 - i_1;
			}

			if (i_2 + i_4 > this.anInt8986) {
				i_4 = this.anInt8986 - i_2;
			}

			if (i_3 > 0 && i_4 > 0 && i_1 <= this.anInt9002 && i_2 <= this.anInt8986) {
				int i_7 = this.anInt8980 - i_3;
				int i_8 = i_2 * this.anInt8980 + i_1;
				int i_9 = i_5 >>> 24;
				int i_10;
				int i_11;
				int i_12;
				if (i_6 != 0 && (i_6 != 1 || i_9 != 255)) {
					int i_13;
					if (i_6 == 1) {
						i_5 = (i_9 * ((i_5 & ~0xff00ff) >>> 8) & ~0xff00ff) + (i_9 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);
						i_10 = 256 - i_9;

						for (i_11 = 0; i_11 < i_4; i_11++) {
							for (i_12 = -i_3; i_12 < 0; i_12++) {
								i_13 = this.anIntArray8979[i_8];
								i_13 = (((i_13 & ~0xff00ff) >>> 8) * i_10 & ~0xff00ff) + ((i_13 & 0xff00ff) * i_10 >> 8 & 0xff00ff);
								this.anIntArray8979[i_8++] = i_5 + i_13;
							}

							i_8 += i_7;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						for (i_10 = 0; i_10 < i_4; i_10++) {
							for (i_11 = -i_3; i_11 < 0; i_11++) {
								i_12 = this.anIntArray8979[i_8];
								i_13 = i_5 + i_12;
								int i_14 = (i_12 & 0xff00ff) + (i_5 & 0xff00ff);
								i_12 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
								this.anIntArray8979[i_8++] = i_13 - i_12 | i_12 - (i_12 >>> 8);
							}

							i_8 += i_7;
						}
					}
				} else {
					i_10 = i_3 >> 3;
					i_11 = i_3 & 0x7;
					i_3 = i_8 - 1;

					for (i_12 = -i_4; i_12 < 0; i_12++) {
						if (i_10 > 0) {
							i_1 = i_10;

							do {
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								--i_1;
							} while (i_1 > 0);
						}

						if (i_11 > 0) {
							i_1 = i_11;

							do {
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								--i_1;
							} while (i_1 > 0);
						}

						i_3 += i_7;
					}
				}
			}
		}

	}

	public void N(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null && i_3 > 0 && i_4 > 0) {
			int i_10 = 0;
			int i_11 = 0;
			int i_12 = (i_8 << 16) / i_3;
			int i_13 = (bytes_7.length / i_8 << 16) / i_4;
			int i_14 = i_2 * this.anInt8980 + i_1;
			int i_15 = this.anInt8980 - i_3;
			if (i_2 + i_4 > this.anInt8986) {
				i_4 -= i_2 + i_4 - this.anInt8986;
			}

			int i_16;
			if (i_2 < this.anInt9009) {
				i_16 = this.anInt9009 - i_2;
				i_4 -= i_16;
				i_14 += i_16 * this.anInt8980;
				i_11 += i_16 * i_13;
			}

			if (i_3 + i_1 > this.anInt9002) {
				i_16 = i_3 + i_1 - this.anInt9002;
				i_3 -= i_16;
				i_15 += i_16;
			}

			if (i_1 < this.anInt8983) {
				i_16 = this.anInt8983 - i_1;
				i_3 -= i_16;
				i_14 += i_16;
				i_10 += i_16 * i_12;
				i_15 += i_16;
			}

			i_16 = i_5 >>> 24;
			int i_17 = i_6 >>> 24;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			if (i_9 == 0 || i_9 == 1 && i_16 == 255 && i_17 == 255) {
				i_18 = i_10;

				for (i_19 = -i_4; i_19 < 0; i_19++) {
					i_20 = i_8 * (i_11 >> 16);

					for (i_21 = -i_3; i_21 < 0; i_21++) {
						if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
							this.anIntArray8979[i_14++] = i_6;
						} else {
							this.anIntArray8979[i_14++] = i_5;
						}

						i_10 += i_12;
					}

					i_11 += i_13;
					i_10 = i_18;
					i_14 += i_15;
				}
			} else {
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				if (i_9 == 1) {
					i_18 = i_10;

					for (i_19 = -i_4; i_19 < 0; i_19++) {
						i_20 = i_8 * (i_11 >> 16);

						for (i_21 = -i_3; i_21 < 0; i_21++) {
							i_22 = i_5;
							if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
								i_22 = i_6;
							}

							i_23 = i_22 >>> 24;
							i_24 = 255 - i_23;
							i_25 = this.anIntArray8979[i_14];
							this.anIntArray8979[i_14++] = (i_24 * (i_25 & 0xff00) + i_23 * (i_22 & 0xff00) & 0xff0000) + ((i_25 & 0xff00ff) * i_24 + (i_22 & 0xff00ff) * i_23 & ~0xff00ff) >> 8;
							i_10 += i_12;
						}

						i_11 += i_13;
						i_10 = i_18;
						i_14 += i_15;
					}
				} else {
					if (i_9 != 2) {
						throw new IllegalArgumentException();
					}

					i_18 = i_10;

					for (i_19 = -i_4; i_19 < 0; i_19++) {
						i_20 = i_8 * (i_11 >> 16);

						for (i_21 = -i_3; i_21 < 0; i_21++) {
							i_22 = i_5;
							if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
								i_22 = i_6;
							}

							if (i_22 != 0) {
								i_23 = this.anIntArray8979[i_14];
								i_24 = i_22 + i_23;
								i_25 = (i_23 & 0xff00ff) + (i_22 & 0xff00ff);
								i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
								this.anIntArray8979[i_14++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
							} else {
								++i_14;
							}

							i_10 += i_12;
						}

						i_11 += i_13;
						i_10 = i_18;
						i_14 += i_15;
					}
				}
			}
		}

	}

	void CA(int i_1, int i_2, int i_3, int i_4) {
		if (this.anIntArray8979 != null) {
			if (i_3 < 0) {
				i_3 = -i_3;
			}

			int i_6 = i_2 - i_3;
			if (i_6 < this.anInt9009) {
				i_6 = this.anInt9009;
			}

			int i_7 = i_3 + i_2 + 1;
			if (i_7 > this.anInt8986) {
				i_7 = this.anInt8986;
			}

			int i_8 = i_6;
			int i_9 = i_3 * i_3;
			int i_10 = 0;
			int i_11 = i_2 - i_6;
			int i_12 = i_11 * i_11;
			int i_13 = i_12 - i_11;
			if (i_2 > i_7) {
				i_2 = i_7;
			}

			int i_14 = i_4 >>> 24;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (1 != 0 && (1 != 1 || i_14 != 255)) {
				int i_19;
				int i_20;
				if (1 == 1) {
					i_4 = (i_14 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_14 << 24);

					for (i_15 = 256 - i_14; i_8 < i_2; i_13 -= i_11 + i_11) {
						while (i_13 <= i_9 || i_12 <= i_9) {
							i_12 = i_12 + i_10 + i_10;
							i_13 += i_10++ + i_10;
						}

						i_16 = i_1 - i_10 + 1;
						if (i_16 < this.anInt8983) {
							i_16 = this.anInt8983;
						}

						i_17 = i_10 + i_1;
						if (i_17 > this.anInt9002) {
							i_17 = this.anInt9002;
						}

						i_18 = i_16 + i_8 * this.anInt8980;

						for (i_19 = i_16; i_19 < i_17; i_19++) {
							i_20 = this.anIntArray8979[i_18];
							i_20 = ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff) + (i_15 * (i_20 & 0xff00) >> 8 & 0xff00);
							this.anIntArray8979[i_18++] = i_20 + i_4;
						}

						++i_8;
						i_12 -= i_11-- + i_11;
					}

					i_10 = i_3;
					i_11 = -i_11;
					i_13 = i_9 + i_11 * i_11;
					i_12 = i_13 - i_3;

					for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
						while (i_13 > i_9 && i_12 > i_9) {
							i_13 -= i_10-- + i_10;
							i_12 -= i_10 + i_10;
						}

						i_16 = i_1 - i_10;
						if (i_16 < this.anInt8983) {
							i_16 = this.anInt8983;
						}

						i_17 = i_10 + i_1;
						if (i_17 > this.anInt9002 - 1) {
							i_17 = this.anInt9002 - 1;
						}

						i_18 = i_16 + i_8 * this.anInt8980;

						for (i_19 = i_16; i_19 <= i_17; i_19++) {
							i_20 = this.anIntArray8979[i_18];
							i_20 = (i_15 * (i_20 & 0xff00) >> 8 & 0xff00) + ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff);
							this.anIntArray8979[i_18++] = i_20 + i_4;
						}

						++i_8;
						i_13 = i_13 + i_11 + i_11;
					}
				} else {
					if (1 != 2) {
						throw new IllegalArgumentException();
					}

					int i_21;
					while (i_8 < i_2) {
						while (i_13 <= i_9 || i_12 <= i_9) {
							i_12 = i_12 + i_10 + i_10;
							i_13 += i_10++ + i_10;
						}

						i_15 = i_1 - i_10 + 1;
						if (i_15 < this.anInt8983) {
							i_15 = this.anInt8983;
						}

						i_16 = i_10 + i_1;
						if (i_16 > this.anInt9002) {
							i_16 = this.anInt9002;
						}

						i_17 = i_15 + i_8 * this.anInt8980;

						for (i_18 = i_15; i_18 < i_16; i_18++) {
							i_19 = this.anIntArray8979[i_17];
							i_20 = i_19 + i_4;
							i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
							i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
							this.anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
						}

						++i_8;
						i_12 -= i_11-- + i_11;
						i_13 -= i_11 + i_11;
					}

					i_10 = i_3;
					i_11 = -i_11;
					i_13 = i_9 + i_11 * i_11;
					i_12 = i_13 - i_3;

					for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
						while (i_13 > i_9 && i_12 > i_9) {
							i_13 -= i_10-- + i_10;
							i_12 -= i_10 + i_10;
						}

						i_15 = i_1 - i_10;
						if (i_15 < this.anInt8983) {
							i_15 = this.anInt8983;
						}

						i_16 = i_10 + i_1;
						if (i_16 > this.anInt9002 - 1) {
							i_16 = this.anInt9002 - 1;
						}

						i_17 = i_15 + i_8 * this.anInt8980;

						for (i_18 = i_15; i_18 <= i_16; i_18++) {
							i_19 = this.anIntArray8979[i_17];
							i_20 = i_19 + i_4;
							i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
							i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
							this.anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
						}

						++i_8;
						i_13 = i_13 + i_11 + i_11;
					}
				}
			} else {
				while (i_8 < i_2) {
					while (i_13 <= i_9 || i_12 <= i_9) {
						i_12 = i_12 + i_10 + i_10;
						i_13 += i_10++ + i_10;
					}

					i_15 = i_1 - i_10 + 1;
					if (i_15 < this.anInt8983) {
						i_15 = this.anInt8983;
					}

					i_16 = i_10 + i_1;
					if (i_16 > this.anInt9002) {
						i_16 = this.anInt9002;
					}

					i_17 = i_15 + i_8 * this.anInt8980;

					for (i_18 = i_15; i_18 < i_16; i_18++) {
						this.anIntArray8979[i_17++] = i_4;
					}

					++i_8;
					i_12 -= i_11-- + i_11;
					i_13 -= i_11 + i_11;
				}

				i_10 = i_3;
				i_11 = i_8 - i_2;
				i_13 = i_9 + i_11 * i_11;
				i_12 = i_13 - i_3;

				for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
					while (i_13 > i_9 && i_12 > i_9) {
						i_13 -= i_10-- + i_10;
						i_12 -= i_10 + i_10;
					}

					i_15 = i_1 - i_10;
					if (i_15 < this.anInt8983) {
						i_15 = this.anInt8983;
					}

					i_16 = i_10 + i_1;
					if (i_16 > this.anInt9002 - 1) {
						i_16 = this.anInt9002 - 1;
					}

					i_17 = i_15 + i_8 * this.anInt8980;

					for (i_18 = i_15; i_18 <= i_16; i_18++) {
						this.anIntArray8979[i_17++] = i_4;
					}

					++i_8;
					i_13 = i_13 + i_11 + i_11;
				}

				return;
			}
		}

	}

	public void XA(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null && i_2 >= this.anInt9009 && i_2 < this.anInt8986) {
			if (i_1 < this.anInt8983) {
				i_3 -= this.anInt8983 - i_1;
				i_1 = this.anInt8983;
			}

			if (i_3 + i_1 > this.anInt9002) {
				i_3 = this.anInt9002 - i_1;
			}

			int i_6 = i_2 * this.anInt8980 + i_1;
			int i_7 = i_4 >>> 24;
			int i_8;
			if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
				for (i_8 = 0; i_8 < i_3; i_8++) {
					this.anIntArray8979[i_6 + i_8] = i_4;
				}
			} else {
				int i_9;
				int i_10;
				if (i_5 == 1) {
					i_4 = (i_7 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_7 << 24) + (i_7 * (i_4 & 0xff00) >> 8 & 0xff00);
					i_8 = 256 - i_7;

					for (i_9 = 0; i_9 < i_3; i_9++) {
						i_10 = this.anIntArray8979[i_9 + i_6];
						i_10 = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
						this.anIntArray8979[i_9 + i_6] = i_10 + i_4;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_8 = 0; i_8 < i_3; i_8++) {
						i_9 = this.anIntArray8979[i_6 + i_8];
						i_10 = i_9 + i_4;
						int i_11 = (i_9 & 0xff00ff) + (i_4 & 0xff00ff);
						i_9 = (i_11 & 0x1000100) + (i_10 - i_11 & 0x10000);
						this.anIntArray8979[i_8 + i_6] = i_10 - i_9 | i_9 - (i_9 >>> 8);
					}
				}
			}
		}

	}

	void method14366(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (this.anIntArray8979 != null && i_2 >= this.anInt9009 && i_2 < this.anInt8986) {
			int i_9 = i_2 * this.anInt8980 + i_1;
			int i_10 = i_4 >>> 24;
			int i_11 = i_7 + i_6;
			int i_12 = i_8 % i_11;
			int i_13;
			if (i_5 == 0 || i_5 == 1 && i_10 == 255) {
				for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
					if (i_13 + i_1 >= this.anInt8983 && i_13 + i_1 < this.anInt9002 && i_12 < i_6) {
						this.anIntArray8979[i_13 + i_9] = i_4;
					}

					++i_13;
					++i_12;
				}
			} else {
				int i_14;
				int i_15;
				if (i_5 == 1) {
					i_4 = (i_10 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_10 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_10 << 24);
					i_13 = 256 - i_10;

					for (i_14 = 0; i_14 < i_3; i_12 %= i_11) {
						if (i_14 + i_1 >= this.anInt8983 && i_14 + i_1 < this.anInt9002 && i_12 < i_6) {
							i_15 = this.anIntArray8979[i_14 + i_9];
							i_15 = ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
							this.anIntArray8979[i_14 + i_9] = i_15 + i_4;
						}

						++i_14;
						++i_12;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
						if (i_13 + i_1 >= this.anInt8983 && i_13 + i_1 < this.anInt9002 && i_12 < i_6) {
							i_14 = this.anIntArray8979[i_13 + i_9];
							i_15 = i_14 + i_4;
							int i_16 = (i_14 & 0xff00ff) + (i_4 & 0xff00ff);
							i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
							this.anIntArray8979[i_9 + i_13] = i_15 - i_14 | i_14 - (i_14 >>> 8);
						}

						++i_13;
						++i_12;
					}
				}
			}
		}

	}

	public void qa(int[] ints_1) {
		ints_1[0] = this.anInt8983;
		ints_1[1] = this.anInt9009;
		ints_1[2] = this.anInt9002;
		ints_1[3] = this.anInt8986;
	}

	public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_4 + i_2 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
		this.G(i_1 + i_3 - 1, 1 + i_2, i_4 - 2, i_5, i_6);
	}

	public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.XA(i_1, i_2, i_3 + 1, i_5, i_6);
				} else {
					this.XA(i_3 + i_1, i_2, -i_3 + 1, i_5, i_6);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.G(i_1, i_2, i_4 + 1, i_5, i_6);
				} else {
					this.G(i_1, i_2 + i_4, -i_4 + 1, i_5, i_6);
				}
			} else {
				if (i_3 + i_4 < 0) {
					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_7;
				int i_8;
				int i_9;
				int i_10;
				int i_11;
				int i_12;
				int i_13;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_7 = (int) Math.floor(0.5D + (double) i_4 / (double) i_3);
					i_3 += i_1;
					if (i_1 < this.anInt8983) {
						i_2 += i_7 * (this.anInt8983 - i_1);
						i_1 = this.anInt8983;
					}

					if (i_3 >= this.anInt9002) {
						i_3 = this.anInt9002 - 1;
					}

					i_8 = i_5 >>> 24;
					if (i_6 != 0 && (i_6 != 1 || i_8 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_8 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_8 << 24);

							for (i_9 = 256 - i_8; i_1 <= i_3; i_1++) {
								i_10 = i_2 >> 16;
								if (i_10 >= this.anInt9009 && i_10 < this.anInt8986) {
									i_11 = i_10 * this.anInt8980 + i_1;
									i_12 = this.anIntArray8979[i_11];
									i_12 = (i_9 * (i_12 & 0xff00) >> 8 & 0xff00) + ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff);
									this.anIntArray8979[i_11] = i_5 + i_12;
								}

								i_2 += i_7;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_1 <= i_3) {
								i_9 = i_2 >> 16;
								if (i_9 >= this.anInt9009 && i_9 < this.anInt8986) {
									i_10 = i_9 * this.anInt8980 + i_1;
									i_11 = this.anIntArray8979[i_10];
									i_12 = i_5 + i_11;
									i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
									i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
									this.anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
								}

								i_2 += i_7;
								++i_1;
							}
						}
					} else {
						while (i_1 <= i_3) {
							i_9 = i_2 >> 16;
							if (i_9 >= this.anInt9009 && i_9 < this.anInt8986) {
								this.anIntArray8979[i_9 * this.anInt8980 + i_1] = i_5;
							}

							i_2 += i_7;
							++i_1;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_7 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					if (i_2 < this.anInt9009) {
						i_1 += i_7 * (this.anInt9009 - i_2);
						i_2 = this.anInt9009;
					}

					if (i_4 >= this.anInt8986) {
						i_4 = this.anInt8986 - 1;
					}

					i_8 = i_5 >>> 24;
					if (i_6 == 0 || i_6 == 1 && i_8 == 255) {
						while (i_2 <= i_4) {
							i_9 = i_1 >> 16;
							if (i_9 >= this.anInt8983 && i_9 < this.anInt9002) {
								this.anIntArray8979[i_2 * this.anInt8980 + i_9] = i_5;
							}

							i_1 += i_7;
							++i_2;
						}
					} else if (i_6 == 1) {
						i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_8 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_8 << 24);

						for (i_9 = 256 - i_8; i_2 <= i_4; i_2++) {
							i_10 = i_1 >> 16;
							if (i_10 >= this.anInt8983 && i_10 < this.anInt9002) {
								i_11 = i_2 * this.anInt8980 + i_10;
								i_12 = this.anIntArray8979[i_11];
								i_12 = ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + (i_9 * (i_12 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_2 * this.anInt8980 + i_10] = i_5 + i_12;
							}

							i_1 += i_7;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_9 = i_1 >> 16;
							if (i_9 >= this.anInt8983 && i_9 < this.anInt9002) {
								i_10 = i_2 * this.anInt8980 + i_9;
								i_11 = this.anIntArray8979[i_10];
								i_12 = i_5 + i_11;
								i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
								i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
								this.anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
							}

							i_1 += i_7;
							++i_2;
						}
					}
				}
			}
		}

	}

	public Matrix44Arr method8449() {
		Class185 class185_1 = this.method14370(Thread.currentThread());
		return class185_1.aClass384_2346;
	}

	public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
			int[] ints_11 = packetsdecoder_10.anIntArray9077;
			int[] ints_12 = packetsdecoder_10.anIntArray9078;
			int i_13 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_14 = this.anInt8986 < ints_11.length + i_9 ? this.anInt8986 : ints_11.length + i_9;
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_3 + i_4 < 0) {
				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_15;
			int i_16;
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			int i_22;
			int i_23;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_15 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				if (i_1 < this.anInt8983) {
					i_2 += i_15 * (this.anInt8983 - i_1);
					i_1 = this.anInt8983;
				}

				if (i_3 >= this.anInt9002) {
					i_3 = this.anInt9002 - 1;
				}

				i_16 = i_5 >>> 24;
				if (1 == 0 || 1 == 1 && i_16 == 255) {
					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = i_8 + ints_11[i_18];
							if (i_1 >= i_19 && i_1 < i_19 + ints_12[i_18]) {
								this.anIntArray8979[i_17 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_15;
						++i_1;
					}
				} else if (1 == 1) {
					i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_16 << 24);

					for (i_17 = 256 - i_16; i_1 <= i_3; i_1++) {
						i_18 = i_2 >> 16;
						i_19 = i_18 - i_9;
						if (i_18 >= i_13 && i_18 < i_14) {
							i_20 = i_8 + ints_11[i_19];
							if (i_1 >= i_20 && i_1 < i_20 + ints_12[i_19]) {
								i_21 = i_18 * this.anInt8980 + i_1;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff);
								this.anIntArray8979[i_21] = i_5 + i_22;
							}
						}

						i_2 += i_15;
					}
				} else {
					if (1 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = i_8 + ints_11[i_18];
							if (i_1 >= i_19 && i_1 < i_19 + ints_12[i_18]) {
								i_20 = i_17 * this.anInt8980 + i_1;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_5 + i_21;
								i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}
						}

						i_2 += i_15;
						++i_1;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_15 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_4 += i_2;
				if (i_2 < i_13) {
					i_1 += (i_13 - i_2) * i_15;
					i_2 = i_13;
				}

				if (i_4 >= i_14) {
					i_4 = i_14 - 1;
				}

				i_16 = i_5 >>> 24;
				if (1 != 0 && (1 != 1 || i_16 != 255)) {
					if (1 == 1) {
						i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_16 << 24);

						for (i_17 = 256 - i_16; i_2 <= i_4; i_2++) {
							i_18 = i_1 >> 16;
							i_19 = i_2 - i_9;
							i_20 = i_8 + ints_11[i_19];
							if (i_18 >= this.anInt8983 && i_18 < this.anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
								i_21 = i_2 * this.anInt8980 + i_18;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff);
								this.anIntArray8979[i_2 * this.anInt8980 + i_18] = i_5 + i_22;
							}

							i_1 += i_15;
						}
					} else {
						if (1 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_17 = i_1 >> 16;
							i_18 = i_2 - i_9;
							i_19 = i_8 + ints_11[i_18];
							if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
								i_20 = i_2 * this.anInt8980 + i_17;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_5 + i_21;
								i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							i_1 += i_15;
							++i_2;
						}
					}
				} else {
					while (i_2 <= i_4) {
						i_17 = i_1 >> 16;
						i_18 = i_2 - i_9;
						i_19 = i_8 + ints_11[i_18];
						if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
							this.anIntArray8979[i_2 * this.anInt8980 + i_17] = i_5;
						}

						i_1 += i_15;
						++i_2;
					}
				}
			}
		}

	}

	public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_13 = (Class455_Sub3) class455_7;
			int[] ints_14 = packetsdecoder_13.anIntArray9077;
			int[] ints_15 = packetsdecoder_13.anIntArray9078;
			int i_16 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_17 = this.anInt8986 < ints_14.length + i_9 ? this.anInt8986 : ints_14.length + i_9;
			i_12 <<= 8;
			i_10 <<= 8;
			i_11 <<= 8;
			int i_18 = i_11 + i_10;
			i_12 %= i_18;
			i_3 -= i_1;
			i_4 -= i_2;
			int i_19;
			int i_20;
			if (i_3 + i_4 < 0) {
				i_19 = (int) (Math.sqrt((double) (i_3 * i_3 + i_4 * i_4)) * 256.0D);
				i_20 = i_19 % i_18;
				i_12 = i_10 + i_18 - i_12 - i_20;
				i_12 %= i_18;
				if (i_12 < 0) {
					i_12 += i_18;
				}

				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_21;
			int i_22;
			int i_23;
			int i_24;
			int i_25;
			int i_26;
			int i_27;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_19 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				i_20 = i_5 >>> 24;
				i_21 = (int) Math.sqrt((double) ((i_19 >> 8) * (i_19 >> 8) + 65536));
				if (1 == 0 || 1 == 1 && i_20 == 255) {
					while (i_1 <= i_3) {
						i_22 = i_2 >> 16;
						i_23 = i_22 - i_9;
						if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
							i_24 = i_8 + ints_14[i_23];
							if (i_1 >= i_24 && i_1 < i_24 + ints_15[i_23]) {
								this.anIntArray8979[i_22 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_19;
						++i_1;
						i_12 += i_21;
						i_12 %= i_18;
					}
				} else if (1 == 1) {
					i_5 = (i_20 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_20 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_20 << 24);

					for (i_22 = 256 - i_20; i_1 <= i_3; i_12 %= i_18) {
						i_23 = i_2 >> 16;
						i_24 = i_23 - i_9;
						if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_23 >= i_16 && i_23 < i_17 && i_12 < i_10) {
							i_25 = i_8 + ints_14[i_24];
							if (i_1 >= i_25 && i_1 < i_25 + ints_15[i_24]) {
								i_26 = i_23 * this.anInt8980 + i_1;
								i_27 = this.anIntArray8979[i_26];
								i_27 = (i_22 * (i_27 & 0xff00) >> 8 & 0xff00) + ((i_27 & 0xff00ff) * i_22 >> 8 & 0xff00ff);
								this.anIntArray8979[i_26] = i_5 + i_27;
							}
						}

						i_2 += i_19;
						++i_1;
						i_12 += i_21;
					}
				} else {
					if (1 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_22 = i_2 >> 16;
						i_23 = i_22 - i_9;
						if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
							i_24 = i_8 + ints_14[i_23];
							if (i_1 >= i_24 && i_1 < i_24 + ints_15[i_23]) {
								i_25 = i_22 * this.anInt8980 + i_1;
								i_26 = this.anIntArray8979[i_25];
								i_27 = i_5 + i_26;
								int i_28 = (i_26 & 0xff00ff) + (i_5 & 0xff00ff);
								i_26 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
								this.anIntArray8979[i_25] = i_27 - i_26 | i_26 - (i_26 >>> 8);
							}
						}

						i_2 += i_19;
						++i_1;
						i_12 += i_21;
						i_12 %= i_18;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_19 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_20 = (int) Math.sqrt((double) ((i_19 >> 8) * (i_19 >> 8) + 65536));
				i_4 += i_2;
				i_21 = i_5 >>> 24;
				if (1 == 0 || 1 == 1 && i_21 == 255) {
					while (i_2 <= i_4) {
						i_22 = i_1 >> 16;
						i_23 = i_2 - i_9;
						if (i_2 >= i_16 && i_2 < i_17 && i_22 >= this.anInt8983 && i_22 < this.anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < i_8 + ints_14[i_23] + ints_15[i_23]) {
							this.anIntArray8979[i_2 * this.anInt8980 + i_22] = i_5;
						}

						i_1 += i_19;
						++i_2;
						i_12 += i_20;
						i_12 %= i_18;
					}
				} else if (1 == 1) {
					i_5 = (i_21 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_21 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_21 << 24);

					for (i_22 = 256 - i_21; i_2 <= i_4; i_12 %= i_18) {
						i_23 = i_1 >> 16;
						i_24 = i_2 - i_9;
						if (i_2 >= i_16 && i_2 < i_17 && i_23 >= this.anInt8983 && i_23 < this.anInt9002 && i_12 < i_10 && i_23 >= i_8 + ints_14[i_24] && i_23 < i_8 + ints_14[i_24] + ints_15[i_24]) {
							i_25 = i_2 * this.anInt8980 + i_23;
							i_26 = this.anIntArray8979[i_25];
							i_26 = (i_22 * (i_26 & 0xff00) >> 8 & 0xff00) + ((i_26 & 0xff00ff) * i_22 >> 8 & 0xff00ff);
							this.anIntArray8979[i_2 * this.anInt8980 + i_23] = i_5 + i_26;
						}

						i_1 += i_19;
						++i_2;
						i_12 += i_20;
					}
				} else {
					if (1 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_2 <= i_4) {
						i_22 = i_1 >> 16;
						i_23 = i_2 - i_9;
						if (i_2 >= i_16 && i_2 < i_17 && i_22 >= this.anInt8983 && i_22 < this.anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < i_8 + ints_15[i_23] + ints_14[i_23]) {
							i_24 = i_2 * this.anInt8980 + i_22;
							i_25 = this.anIntArray8979[i_24];
							i_26 = i_5 + i_25;
							i_27 = (i_25 & 0xff00ff) + (i_5 & 0xff00ff);
							i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
							this.anIntArray8979[i_24] = i_26 - i_25 | i_25 - (i_25 >>> 8);
						}

						i_1 += i_19;
						++i_2;
						i_12 += i_20;
						i_12 %= i_18;
					}
				}
			}
		}

	}

	public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		boolean bool_14 = this.anIntArray8979 != null;
		boolean bool_15 = this.aFloatArray9010 != null;
		if (bool_14 || bool_15) {
			Class185 class185_16 = this.method14370(Thread.currentThread());
			ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
			choppyitemfixclass_17.aBool1675 = false;
			i_1 -= this.anInt8983;
			i_4 -= this.anInt8983;
			i_7 -= this.anInt8983;
			i_2 -= this.anInt9009;
			i_5 -= this.anInt9009;
			i_8 -= this.anInt9009;
			choppyitemfixclass_17.aBool1708 = i_1 < 0 || i_1 > choppyitemfixclass_17.anInt1684 || i_4 < 0 || i_4 > choppyitemfixclass_17.anInt1684 || i_7 < 0 || i_7 > choppyitemfixclass_17.anInt1684;
			int i_18 = i_10 >>> 24;
			if (i_13 == 0 || i_13 == 1 && i_18 == 255) {
				choppyitemfixclass_17.anInt1674 = 0;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			} else if (i_13 == 1) {
				choppyitemfixclass_17.anInt1674 = 255 - i_18;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			} else {
				if (i_13 != 2) {
					throw new IllegalArgumentException();
				}

				choppyitemfixclass_17.anInt1674 = 128;
				choppyitemfixclass_17.aBool1672 = true;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			}

			choppyitemfixclass_17.aBool1675 = true;
		}

	}

	public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = (float) i_3 * this.aClass384_8996.buf[10] + (float) i_2 * this.aClass384_8996.buf[6] + this.aClass384_8996.buf[14] + (float) i_1 * this.aClass384_8996.buf[2];
		float f_9 = this.aClass384_8996.buf[6] * (float) i_5 + this.aClass384_8996.buf[14] + this.aClass384_8996.buf[2] * (float) i_4 + this.aClass384_8996.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8996.buf[15] + (float) i_1 * this.aClass384_8996.buf[3] + (float) i_2 * this.aClass384_8996.buf[7] + (float) i_3 * this.aClass384_8996.buf[11];
		float f_11 = (float) i_5 * this.aClass384_8996.buf[7] + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[3] * (float) i_4 + (float) i_6 * this.aClass384_8996.buf[11];
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8996.buf[4] * (float) i_2 + this.aClass384_8996.buf[12] + (float) i_1 * this.aClass384_8996.buf[0] + (float) i_3 * this.aClass384_8996.buf[8];
		float f_13 = (float) i_6 * this.aClass384_8996.buf[8] + (float) i_4 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[4] * (float) i_5;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8996.buf[5] * (float) i_2 + (float) i_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * (float) i_4 + this.aClass384_8996.buf[5] * (float) i_5 + (float) i_6 * this.aClass384_8996.buf[9];
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
			int[] ints_11 = packetsdecoder_10.anIntArray9077;
			int[] ints_12 = packetsdecoder_10.anIntArray9078;
			int i_13 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_14 = this.anInt8986 < i_9 + ints_11.length ? this.anInt8986 : ints_11.length + i_9;
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 + i_3 < 0) {
				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_15;
			int i_16;
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			int i_22;
			int i_23;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_15 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				if (i_1 < this.anInt8983) {
					i_2 += (this.anInt8983 - i_1) * i_15;
					i_1 = this.anInt8983;
				}

				if (i_3 >= this.anInt9002) {
					i_3 = this.anInt9002 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = ints_11[i_18] + i_8;
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								this.anIntArray8979[i_17 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_15;
						++i_1;
					}
				} else if (i_6 == 1) {
					i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

					for (i_17 = 256 - i_16; i_1 <= i_3; i_1++) {
						i_18 = i_2 >> 16;
						i_19 = i_18 - i_9;
						if (i_18 >= i_13 && i_18 < i_14) {
							i_20 = ints_11[i_19] + i_8;
							if (i_1 >= i_20 && i_1 < i_20 + ints_12[i_19]) {
								i_21 = i_1 + this.anInt8980 * i_18;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
								this.anIntArray8979[i_21] = i_5 + i_22;
							}
						}

						i_2 += i_15;
					}
				} else {
					if (i_6 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = i_8 + ints_11[i_18];
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								i_20 = i_17 * this.anInt8980 + i_1;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_21 + i_5;
								i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}
						}

						i_2 += i_15;
						++i_1;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_15 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_4 += i_2;
				if (i_2 < i_13) {
					i_1 += (i_13 - i_2) * i_15;
					i_2 = i_13;
				}

				if (i_4 >= i_14) {
					i_4 = i_14 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
					if (i_6 == 1) {
						i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

						for (i_17 = 256 - i_16; i_2 <= i_4; i_2++) {
							i_18 = i_1 >> 16;
							i_19 = i_2 - i_9;
							i_20 = i_8 + ints_11[i_19];
							if (i_18 >= this.anInt8983 && i_18 < this.anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
								i_21 = i_18 + i_2 * this.anInt8980;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_18 + i_2 * this.anInt8980] = i_22 + i_5;
							}

							i_1 += i_15;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_17 = i_1 >> 16;
							i_18 = i_2 - i_9;
							i_19 = ints_11[i_18] + i_8;
							if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
								i_20 = this.anInt8980 * i_2 + i_17;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_5 + i_21;
								i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							i_1 += i_15;
							++i_2;
						}
					}
				} else {
					while (i_2 <= i_4) {
						i_17 = i_1 >> 16;
						i_18 = i_2 - i_9;
						i_19 = ints_11[i_18] + i_8;
						if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
							this.anIntArray8979[i_17 + this.anInt8980 * i_2] = i_5;
						}

						i_1 += i_15;
						++i_2;
					}
				}
			}
		}

	}

	public void method8439(Node_Sub1 class282_sub1_1) {
	}

	public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return (NativeSprite) (bool_3 ? new NativeSprite_Sub1_Sub3(this, i_1, i_2) : new NativeSprite_Sub1_Sub1(this, i_1, i_2));
	}

	public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = f_3 * this.aClass384_8996.buf[11] + this.aClass384_8996.buf[7] * f_2 + f_1 * this.aClass384_8996.buf[3] + this.aClass384_8996.buf[15];
		float f_6 = f_2 * this.aClass384_8996.buf[4] + f_1 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[8] * f_3;
		float f_7 = f_2 * this.aClass384_8996.buf[5] + f_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + f_3 * this.aClass384_8996.buf[9];
		float f_8 = f_3 * this.aClass384_8994.buf[10] + this.aClass384_8994.buf[6] * f_2 + f_1 * this.aClass384_8994.buf[2] + this.aClass384_8994.buf[14];
		floats_4[0] = this.aFloat9003 + f_6 * this.aFloat8976 / f_5;
		floats_4[1] = this.aFloat8982 + f_7 * this.aFloat9004 / f_5;
		floats_4[2] = f_8;
	}

	public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_6 = new int[i_3 * i_4];
			int i_7 = i_2 * this.anInt8980 + i_1;
			int i_8 = this.anInt8980 - i_3;

			for (int i_9 = 0; i_9 < i_4; i_9++) {
				int i_10 = i_3 * i_9;

				for (int i_11 = 0; i_11 < i_3; i_11++) {
					ints_6[i_10 + i_11] = this.anIntArray8979[i_7++];
				}

				i_7 += i_8;
			}

			if (bool_5) {
				return new NativeSprite_Sub1_Sub3(this, ints_6, i_3, i_4);
			} else {
				return new NativeSprite_Sub1_Sub1(this, ints_6, i_3, i_4);
			}
		}
	}

	public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new Class455_Sub3(i_1, i_2, ints_3, ints_4);
	}

	public void en(float f_1, float f_2) {
		this.aFloat8978 = f_2 - f_1;
		this.aFloat8985 = f_2 + f_1 - 1.0F;

		for (int i_3 = 0; i_3 < this.anInt9008; i_3++) {
			Class185 class185_4 = this.aClass185Array8984[i_3];
			ChoppyItemFixClass choppyitemfixclass_5 = class185_4.aClass144_2310;
			choppyitemfixclass_5.aFloat1683 = this.aFloat8978;
			choppyitemfixclass_5.aFloat1682 = this.aFloat8985;
		}

	}

	public void method8446(Matrix44Arr matrix44arr_1) {
		this.aClass384_8995.method6562(matrix44arr_1);
		this.method14374();
	}

	public void GA() {
		this.aFloat8978 = (float) 1.0 - (float) 0.0;
		this.aFloat8985 = (float) 1.0 + (float) 0.0 - 1.0F;

		for (int i_3 = 0; i_3 < this.anInt9008; i_3++) {
			Class185 class185_4 = this.aClass185Array8984[i_3];
			ChoppyItemFixClass choppyitemfixclass_5 = class185_4.aClass144_2310;
			choppyitemfixclass_5.aFloat1683 = this.aFloat8978;
			choppyitemfixclass_5.aFloat1682 = this.aFloat8985;
		}

	}

	public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public int method8546(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
		return new Ground_Sub3(this, i_6, i_7, i_1, i_2, ints_3, ints_4, 512);
	}

	public void method8634() {
		this.anInt8998 = 0;
		this.anInt8999 = 0;
		this.anInt9000 = this.anInt8980;
		this.anInt9001 = this.anInt8981;
		this.method14364();
	}

	public Matrix44Var method8450() {
		Class185 class185_1 = this.method14370(Thread.currentThread());
		return class185_1.aClass294_2314;
	}

	public boolean method8471() {
		return false;
	}

	public void iw(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		this.anInt8990 = (int) (65535.0F * f_2);
		this.anInt8991 = (int) (65535.0F * f_3);
		float f_7 = (float) Math.sqrt((double) (f_6 * f_6 + f_5 * f_5 + f_4 * f_4));
		this.anInt9011 = (int) (f_4 * 65535.0F / f_7);
		this.anInt8988 = (int) (65535.0F * f_5 / f_7);
		this.anInt9007 = (int) (f_6 * 65535.0F / f_7);
	}

	public void method8547(int i_1, Node_Sub24[] arr_2) {
	}

	public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_13 = (Class455_Sub3) class455_7;
			int[] ints_14 = packetsdecoder_13.anIntArray9077;
			int[] ints_15 = packetsdecoder_13.anIntArray9078;
			int i_16 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_17 = this.anInt8986 < i_9 + ints_14.length ? this.anInt8986 : i_9 + ints_14.length;
			i_12 <<= 8;
			i_10 <<= 8;
			i_11 <<= 8;
			int i_18 = i_11 + i_10;
			i_12 %= i_18;
			i_3 -= i_1;
			i_4 -= i_2;
			int i_19;
			int i_20;
			if (i_3 + i_4 < 0) {
				i_19 = (int) (Math.sqrt((double) (i_4 * i_4 + i_3 * i_3)) * 256.0D);
				i_20 = i_19 % i_18;
				i_12 = i_10 + i_18 - i_12 - i_20;
				i_12 %= i_18;
				if (i_12 < 0) {
					i_12 += i_18;
				}

				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_21;
			int i_22;
			int i_23;
			int i_24;
			int i_25;
			int i_26;
			int i_27;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_19 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				i_20 = i_5 >>> 24;
				i_21 = (int) Math.sqrt((double) ((i_19 >> 8) * (i_19 >> 8) + 65536));
				if (i_6 == 0 || i_6 == 1 && i_20 == 255) {
					while (i_1 <= i_3) {
						i_22 = i_2 >> 16;
						i_23 = i_22 - i_9;
						if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
							i_24 = i_8 + ints_14[i_23];
							if (i_1 >= i_24 && i_1 < ints_15[i_23] + i_24) {
								this.anIntArray8979[i_22 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_19;
						++i_1;
						i_12 += i_21;
						i_12 %= i_18;
					}
				} else if (i_6 == 1) {
					i_5 = ((i_5 & 0xff00ff) * i_20 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_20 >> 8 & 0xff00) + (i_20 << 24);

					for (i_22 = 256 - i_20; i_1 <= i_3; i_12 %= i_18) {
						i_23 = i_2 >> 16;
						i_24 = i_23 - i_9;
						if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_23 >= i_16 && i_23 < i_17 && i_12 < i_10) {
							i_25 = i_8 + ints_14[i_24];
							if (i_1 >= i_25 && i_1 < i_25 + ints_15[i_24]) {
								i_26 = this.anInt8980 * i_23 + i_1;
								i_27 = this.anIntArray8979[i_26];
								i_27 = (i_22 * (i_27 & 0xff00ff) >> 8 & 0xff00ff) + (i_22 * (i_27 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_26] = i_27 + i_5;
							}
						}

						i_2 += i_19;
						++i_1;
						i_12 += i_21;
					}
				} else {
					if (i_6 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_22 = i_2 >> 16;
						i_23 = i_22 - i_9;
						if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
							i_24 = i_8 + ints_14[i_23];
							if (i_1 >= i_24 && i_1 < i_24 + ints_15[i_23]) {
								i_25 = i_1 + i_22 * this.anInt8980;
								i_26 = this.anIntArray8979[i_25];
								i_27 = i_26 + i_5;
								int i_28 = (i_26 & 0xff00ff) + (i_5 & 0xff00ff);
								i_26 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
								this.anIntArray8979[i_25] = i_27 - i_26 | i_26 - (i_26 >>> 8);
							}
						}

						i_2 += i_19;
						++i_1;
						i_12 += i_21;
						i_12 %= i_18;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_19 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_20 = (int) Math.sqrt((double) (65536 + (i_19 >> 8) * (i_19 >> 8)));
				i_4 += i_2;
				i_21 = i_5 >>> 24;
				if (i_6 == 0 || i_6 == 1 && i_21 == 255) {
					while (i_2 <= i_4) {
						i_22 = i_1 >> 16;
						i_23 = i_2 - i_9;
						if (i_2 >= i_16 && i_2 < i_17 && i_22 >= this.anInt8983 && i_22 < this.anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < ints_14[i_23] + i_8 + ints_15[i_23]) {
							this.anIntArray8979[i_2 * this.anInt8980 + i_22] = i_5;
						}

						i_1 += i_19;
						++i_2;
						i_12 += i_20;
						i_12 %= i_18;
					}
				} else if (i_6 == 1) {
					i_5 = (i_21 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_21 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_21 << 24);

					for (i_22 = 256 - i_21; i_2 <= i_4; i_12 %= i_18) {
						i_23 = i_1 >> 16;
						i_24 = i_2 - i_9;
						if (i_2 >= i_16 && i_2 < i_17 && i_23 >= this.anInt8983 && i_23 < this.anInt9002 && i_12 < i_10 && i_23 >= i_8 + ints_14[i_24] && i_23 < i_8 + ints_14[i_24] + ints_15[i_24]) {
							i_25 = i_2 * this.anInt8980 + i_23;
							i_26 = this.anIntArray8979[i_25];
							i_26 = (i_22 * (i_26 & 0xff00) >> 8 & 0xff00) + (i_22 * (i_26 & 0xff00ff) >> 8 & 0xff00ff);
							this.anIntArray8979[this.anInt8980 * i_2 + i_23] = i_26 + i_5;
						}

						i_1 += i_19;
						++i_2;
						i_12 += i_20;
					}
				} else {
					if (i_6 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_2 <= i_4) {
						i_22 = i_1 >> 16;
						i_23 = i_2 - i_9;
						if (i_2 >= i_16 && i_2 < i_17 && i_22 >= this.anInt8983 && i_22 < this.anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < ints_15[i_23] + ints_14[i_23] + i_8) {
							i_24 = i_22 + i_2 * this.anInt8980;
							i_25 = this.anIntArray8979[i_24];
							i_26 = i_5 + i_25;
							i_27 = (i_25 & 0xff00ff) + (i_5 & 0xff00ff);
							i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
							this.anIntArray8979[i_24] = i_26 - i_25 | i_25 - (i_25 >>> 8);
						}

						i_1 += i_19;
						++i_2;
						i_12 += i_20;
						i_12 %= i_18;
					}
				}
			}
		}

	}

	void method14369(int i_1) {
		this.anInt9008 = i_1;
		this.aClass185Array8984 = new Class185[this.anInt9008];

		for (int i_2 = 0; i_2 < this.anInt9008; i_2++) {
			this.aClass185Array8984[i_2] = new Class185(this);
		}

	}

	Class185 method14370(Runnable runnable_1) {
		for (int i_2 = 0; i_2 < this.anInt9008; i_2++) {
			if (runnable_1 == this.aClass185Array8984[i_2].aRunnable2343) {
				return this.aClass185Array8984[i_2];
			}
		}

		return null;
	}

	public void method8456(Class151 class151_1) {
		this.method14363(this.anIntArray8979 != null, this.aFloatArray9010 != null, class151_1);
	}

	public void method8611() {
	}

	void method14371(boolean bool_1, boolean bool_2, PointEntity class275_sub1_sub1_4, int i_5, int i_6, float f_7, int i_8) {
		int i_9 = class275_sub1_sub1_4.rotation;
		int i_10 = i_8;
		i_8 <<= 1;
		if (i_9 == -1) {
			this.method14373(bool_2, i_5, i_6, f_7, i_10, class275_sub1_sub1_4.color, 1);
		} else {
			if (i_9 != this.anInt9015) {
				NativeSprite nativesprite_11 = (NativeSprite) this.aClass229_9013.get((long) i_9);
				if (nativesprite_11 == null) {
					int[] ints_12 = this.method14359(i_9);
					if (ints_12 == null) {
						return;
					}

					int i_13 = this.method14377(i_9) ? 64 : this.anInt9005;
					nativesprite_11 = this.createNativeSprite(ints_12, i_13, i_13, i_13, 1598794306);
					this.aClass229_9013.put(nativesprite_11, (long) i_9);
				}

				this.anInt9015 = i_9;
				this.aNativeSprite_8987 = nativesprite_11;
			}

			++i_8;
			((NativeSprite_Sub1) this.aNativeSprite_8987).method14247(bool_1, bool_2, false, i_5 - i_10, i_6 - i_10, f_7, i_8, i_8, 0, class275_sub1_sub1_4.color, 1, false);
		}

	}

	void method14372(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (i_7 != 0 && i_8 != 0) {
			if (i_9 != 65535) {
				TextureDetails class169_13 = this.anInterface22_5834.method144(i_9);
				if (!class169_13.isGroundMesh) {
					if (i_9 != this.anInt9015) {
						NativeSprite nativesprite_14 = (NativeSprite) this.aClass229_9013.get((long) i_9);
						if (nativesprite_14 == null) {
							int[] ints_15 = this.method14359(i_9);
							if (ints_15 == null) {
								return;
							}

							int i_16 = this.method14377(i_9) ? 64 : this.anInt9005;
							nativesprite_14 = this.createNativeSprite(ints_15, i_16, i_16, i_16, -1270335849);
							this.aClass229_9013.put(nativesprite_14, (long) i_9);
						}

						this.anInt9015 = i_9;
						this.aNativeSprite_8987 = nativesprite_14;
					}

					((NativeSprite_Sub1) this.aNativeSprite_8987).method14247(bool_1, bool_2, bool_3, i_4 - i_7, i_5 - i_8, f_6, i_7 << 1, i_8 << 1, i_11, i_10, i_12, class169_13.blendType != 2);
					return;
				}
			}

			this.method14373(bool_2, i_4, i_5, f_6, i_7, i_10, i_12);
		}

	}

	void method14373(boolean bool_1, int i_2, int i_3, float f_4, int i_5, int i_6, int i_7) {
		if (this.anIntArray8979 != null) {
			if (i_5 < 0) {
				i_5 = -i_5;
			}

			int i_8 = i_3 - i_5;
			if (i_8 < this.anInt9009) {
				i_8 = this.anInt9009;
			}

			int i_9 = i_3 + i_5 + 1;
			if (i_9 > this.anInt8986) {
				i_9 = this.anInt8986;
			}

			int i_10 = i_8;
			int i_11 = i_5 * i_5;
			int i_12 = 0;
			int i_13 = i_3 - i_8;
			int i_14 = i_13 * i_13;
			int i_15 = i_14 - i_13;
			if (i_3 > i_9) {
				i_3 = i_9;
			}

			int i_16 = i_6 >>> 24;
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			if (i_7 != 0 && (i_7 != 1 || i_16 != 255)) {
				int i_21;
				int i_22;
				if (i_7 == 1) {
					i_6 = ((i_6 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24) + (i_16 * (i_6 & 0xff00) >> 8 & 0xff00);

					for (i_17 = 256 - i_16; i_10 < i_3; i_15 -= i_13 + i_13) {
						while (i_15 <= i_11 || i_14 <= i_11) {
							i_14 = i_14 + i_12 + i_12;
							i_15 += i_12++ + i_12;
						}

						i_18 = i_2 - i_12 + 1;
						if (i_18 < this.anInt8983) {
							i_18 = this.anInt8983;
						}

						i_19 = i_12 + i_2;
						if (i_19 > this.anInt9002) {
							i_19 = this.anInt9002;
						}

						i_20 = i_18 + i_10 * this.anInt8980;

						for (i_21 = i_18; i_21 < i_19; i_21++) {
							if (!bool_1 || f_4 < this.aFloatArray9010[i_20]) {
								i_22 = this.anIntArray8979[i_20];
								i_22 = ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_20] = i_22 + i_6;
							}

							++i_20;
						}

						++i_10;
						i_14 -= i_13-- + i_13;
					}

					i_12 = i_5;
					i_13 = -i_13;
					i_15 = i_11 + i_13 * i_13;
					i_14 = i_15 - i_5;

					for (i_15 -= i_13; i_10 < i_9; i_14 += i_13++ + i_13) {
						while (i_15 > i_11 && i_14 > i_11) {
							i_15 -= i_12-- + i_12;
							i_14 -= i_12 + i_12;
						}

						i_18 = i_2 - i_12;
						if (i_18 < this.anInt8983) {
							i_18 = this.anInt8983;
						}

						i_19 = i_12 + i_2;
						if (i_19 > this.anInt9002 - 1) {
							i_19 = this.anInt9002 - 1;
						}

						i_20 = i_18 + i_10 * this.anInt8980;

						for (i_21 = i_18; i_21 <= i_19; i_21++) {
							if (!bool_1 || f_4 < this.aFloatArray9010[i_20]) {
								i_22 = this.anIntArray8979[i_20];
								i_22 = ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_20] = i_22 + i_6;
							}

							++i_20;
						}

						++i_10;
						i_15 = i_15 + i_13 + i_13;
					}
				} else {
					if (i_7 != 2) {
						throw new IllegalArgumentException();
					}

					int i_23;
					while (i_10 < i_3) {
						while (i_15 <= i_11 || i_14 <= i_11) {
							i_14 = i_14 + i_12 + i_12;
							i_15 += i_12++ + i_12;
						}

						i_17 = i_2 - i_12 + 1;
						if (i_17 < this.anInt8983) {
							i_17 = this.anInt8983;
						}

						i_18 = i_12 + i_2;
						if (i_18 > this.anInt9002) {
							i_18 = this.anInt9002;
						}

						i_19 = i_17 + i_10 * this.anInt8980;

						for (i_20 = i_17; i_20 < i_18; i_20++) {
							if (!bool_1 || f_4 < this.aFloatArray9010[i_19]) {
								i_21 = this.anIntArray8979[i_19];
								i_22 = i_21 + i_6;
								i_23 = (i_21 & 0xff00ff) + (i_6 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_19] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							++i_19;
						}

						++i_10;
						i_14 -= i_13-- + i_13;
						i_15 -= i_13 + i_13;
					}

					i_12 = i_5;
					i_13 = -i_13;
					i_15 = i_11 + i_13 * i_13;
					i_14 = i_15 - i_5;

					for (i_15 -= i_13; i_10 < i_9; i_14 += i_13++ + i_13) {
						while (i_15 > i_11 && i_14 > i_11) {
							i_15 -= i_12-- + i_12;
							i_14 -= i_12 + i_12;
						}

						i_17 = i_2 - i_12;
						if (i_17 < this.anInt8983) {
							i_17 = this.anInt8983;
						}

						i_18 = i_12 + i_2;
						if (i_18 > this.anInt9002 - 1) {
							i_18 = this.anInt9002 - 1;
						}

						i_19 = i_17 + i_10 * this.anInt8980;

						for (i_20 = i_17; i_20 <= i_18; i_20++) {
							if (!bool_1 || f_4 < this.aFloatArray9010[i_19]) {
								i_21 = this.anIntArray8979[i_19];
								i_22 = i_21 + i_6;
								i_23 = (i_21 & 0xff00ff) + (i_6 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_19] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							++i_19;
						}

						++i_10;
						i_15 = i_15 + i_13 + i_13;
					}
				}
			} else {
				while (i_10 < i_3) {
					while (i_15 <= i_11 || i_14 <= i_11) {
						i_14 = i_14 + i_12 + i_12;
						i_15 += i_12++ + i_12;
					}

					i_17 = i_2 - i_12 + 1;
					if (i_17 < this.anInt8983) {
						i_17 = this.anInt8983;
					}

					i_18 = i_12 + i_2;
					if (i_18 > this.anInt9002) {
						i_18 = this.anInt9002;
					}

					i_19 = i_17 + i_10 * this.anInt8980;

					for (i_20 = i_17; i_20 < i_18; i_20++) {
						if (!bool_1 || f_4 < this.aFloatArray9010[i_19]) {
							this.anIntArray8979[i_19] = i_6;
						}

						++i_19;
					}

					++i_10;
					i_14 -= i_13-- + i_13;
					i_15 -= i_13 + i_13;
				}

				i_12 = i_5;
				i_13 = i_10 - i_3;
				i_15 = i_11 + i_13 * i_13;
				i_14 = i_15 - i_5;

				for (i_15 -= i_13; i_10 < i_9; i_14 += i_13++ + i_13) {
					while (i_15 > i_11 && i_14 > i_11) {
						i_15 -= i_12-- + i_12;
						i_14 -= i_12 + i_12;
					}

					i_17 = i_2 - i_12;
					if (i_17 < this.anInt8983) {
						i_17 = this.anInt8983;
					}

					i_18 = i_12 + i_2;
					if (i_18 > this.anInt9002 - 1) {
						i_18 = this.anInt9002 - 1;
					}

					i_19 = i_17 + i_10 * this.anInt8980;

					for (i_20 = i_17; i_20 <= i_18; i_20++) {
						if (!bool_1 || f_4 < this.aFloatArray9010[i_19]) {
							this.anIntArray8979[i_19] = i_6;
						}

						++i_19;
					}

					++i_10;
					i_15 = i_15 + i_13 + i_13;
				}

				return;
			}
		}

	}

	public void method8457(Matrix44Var matrix44var_1) {
		this.aClass294_8993 = matrix44var_1;
		this.method14374();
	}

	public Matrix44Var method8458() {
		return new Matrix44Var(this.aClass294_8993);
	}

	public void method8521() {
	}

	public Matrix44Arr method8453() {
		return new Matrix44Arr(this.aClass384_8995);
	}

	HardwareRenderer(Interface22 interface22_1) {
		super(interface22_1);
		this.aBool9014 = false;
		this.aBool9012 = false;
		this.anInt8983 = 0;
		this.anInt9002 = 0;
		this.anInt9009 = 0;
		this.anInt8986 = 0;
		this.anInt8990 = 45823;
		this.anInt8991 = 78642;
		this.anInt8992 = 75518;
		this.aFloatArrayArray8989 = new float[6][4];
		this.aFloat8978 = 1.0F;
		this.aFloat8985 = 0.0F;
		this.anInt9005 = 128;
		this.aBool8997 = false;
		this.aClass229_9013 = new SoftCache(16);
		this.anInt9015 = -1;

		try {
			this.aClass229_9006 = new SoftCache(256);
			this.aClass294_8993 = new Matrix44Var();
			this.aClass384_8994 = new Matrix44Arr();
			this.aClass384_8995 = new Matrix44Arr();
			this.aClass384_8996 = new Matrix44Arr();
			this.method14369(1);
			this.method14409();
			SunDefinitions.method854(true, true, -1425832759);
			this.aBool9012 = true;
			this.anInt8977 = (int) Utils.time();
		} catch (Throwable throwable_3) {
			throwable_3.printStackTrace();
			this.method8396();
			throw new RuntimeException("");
		}
	}

	public void m(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		this.anInt8990 = (int) (65535.0F * f_2);
		this.anInt8991 = (int) (65535.0F * f_3);
		float f_7 = (float) Math.sqrt((double) (f_6 * f_6 + f_5 * f_5 + f_4 * f_4));
		this.anInt9011 = (int) (f_4 * 65535.0F / f_7);
		this.anInt8988 = (int) (65535.0F * f_5 / f_7);
		this.anInt9007 = (int) (f_6 * 65535.0F / f_7);
	}

	public void J() {
	}

	public void c(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.aClass185Array8984.length; i_4++) {
			Class185 class185_5 = this.aClass185Array8984[i_4];
			class185_5.anInt2307 = i_1 & 0xffffff;
			int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
			if (i_6 < 2) {
				i_6 = 2;
			}

			int i_7 = class185_5.anInt2307 >> 8 & 0xff;
			if (i_7 < 2) {
				i_7 = 2;
			}

			int i_8 = class185_5.anInt2307 & 0xff;
			if (i_8 < 2) {
				i_8 = 2;
			}

			class185_5.anInt2307 = i_6 << 16 | i_7 << 8 | i_8;
			if (i_2 < 0) {
				class185_5.aBool2304 = false;
			} else {
				class185_5.aBool2304 = true;
			}
		}

	}

	public void method8568() {
		this.aBool8997 = false;
		this.aClass229_9006.method3859();
	}

	void method14374() {
		this.aClass384_8994.fromVarMatrix44(this.aClass294_8993);
		this.aClass384_8996.method6562(this.aClass384_8994);
		this.aClass384_8996.method6523(this.aClass384_8995);
		this.aClass384_8996.method6539(this.aFloatArrayArray8989[0]);
		this.aClass384_8996.method6540(this.aFloatArrayArray8989[1]);
		this.aClass384_8996.method6535(this.aFloatArrayArray8989[2]);
		this.aClass384_8996.method6536(this.aFloatArrayArray8989[3]);
		this.aClass384_8996.method6613(this.aFloatArrayArray8989[4]);
		this.aClass384_8996.method6538(this.aFloatArrayArray8989[5]);
		float f_1 = this.aClass384_8995.method6587();
		float f_2 = this.aClass384_8995.buf[10] * (f_1 - 255.0F) + this.aClass384_8995.buf[14];
		float f_3 = this.aClass384_8995.buf[10] * f_1 + this.aClass384_8995.buf[14];
		float f_4 = f_3 - f_2;

		for (int i_5 = 0; i_5 < this.anInt9008; i_5++) {
			Class185 class185_6 = this.aClass185Array8984[i_5];
			class185_6.aFloat2305 = f_2;
			class185_6.aFloat2303 = f_4;
		}

	}

	public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return null;
	}

	public void ik(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.aClass185Array8984.length; i_4++) {
			Class185 class185_5 = this.aClass185Array8984[i_4];
			class185_5.anInt2307 = (i_1 & 0xffffff);
			int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
			if (i_6 < 2) {
				i_6 = 2;
			}

			int i_7 = class185_5.anInt2307 >> 8 & 0xff;
			if (i_7 < 2) {
				i_7 = 2;
			}

			int i_8 = class185_5.anInt2307 & 0xff;
			if (i_8 < 2) {
				i_8 = 2;
			}

			class185_5.anInt2307 = (i_6 << 16 | i_7 << 8 | i_8);
			if (i_2 < 0) {
				class185_5.aBool2304 = false;
			} else {
				class185_5.aBool2304 = true;
			}
		}

	}

	public Matrix44Arr method8590() {
		return new Matrix44Arr(this.aClass384_8995);
	}

	public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = (float) i_3 * this.aClass384_8996.buf[10] + (float) i_2 * this.aClass384_8996.buf[6] + this.aClass384_8996.buf[14] + (float) i_1 * this.aClass384_8996.buf[2];
		float f_9 = this.aClass384_8996.buf[6] * (float) i_5 + this.aClass384_8996.buf[14] + this.aClass384_8996.buf[2] * (float) i_4 + this.aClass384_8996.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8996.buf[15] + (float) i_1 * this.aClass384_8996.buf[3] + (float) i_2 * this.aClass384_8996.buf[7] + (float) i_3 * this.aClass384_8996.buf[11];
		float f_11 = (float) i_5 * this.aClass384_8996.buf[7] + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[3] * (float) i_4 + (float) i_6 * this.aClass384_8996.buf[11];
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8996.buf[4] * (float) i_2 + this.aClass384_8996.buf[12] + (float) i_1 * this.aClass384_8996.buf[0] + (float) i_3 * this.aClass384_8996.buf[8];
		float f_13 = (float) i_6 * this.aClass384_8996.buf[8] + (float) i_4 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[4] * (float) i_5;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8996.buf[5] * (float) i_2 + (float) i_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * (float) i_4 + this.aClass384_8996.buf[5] * (float) i_5 + (float) i_6 * this.aClass384_8996.buf[9];
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public void method8490() {
	}

	public void fu(int i_1, int i_2) {
		if ((i_1 & 0x1) != 0) {
			this.B(0, 0, this.anInt8980, this.anInt8981, i_2, 0);
		}

		if ((i_1 & 0x2) != 0) {
			this.method14410();
		}

	}

	public void method8525(int i_3, int i_4) {
	}

	public boolean method8528() {
		return false;
	}

	void method14376(int i_1, int i_2, int[] ints_3, float[] floats_4) {
		this.anInt8980 = i_1;
		this.anInt8981 = i_2;
		this.anIntArray8979 = ints_3;
		this.aFloatArray9010 = floats_4;

		for (int i_5 = 0; i_5 < this.anInt9008; i_5++) {
			this.aClass185Array8984[i_5].method3071();
		}

		this.L();
		this.method8421();
	}

	public void method8476(int i_1, HDWaterTile class90_2) {
		Class185 class185_3 = this.method14370(Thread.currentThread());
		class185_3.anInt2306 = i_1;
		class185_3.anInt2307 = class90_2.color;
		class185_3.anInt2313 = class90_2.scale;
	}

	public void O() {
		for (int i_1 = 0; i_1 < this.aClass185Array8984.length; i_1++) {
			this.aClass185Array8984[i_1].anInt2307 = this.aClass185Array8984[i_1].anInt2336;
			this.aClass185Array8984[i_1].aBool2309 = false;
		}

	}

	public void method8658() {
		boolean bool_14 = this.anIntArray8979 != null;
		boolean bool_15 = this.aFloatArray9010 != null;
		if (bool_14 || bool_15) {
			Class185 class185_16 = this.method14370(Thread.currentThread());
			ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
			choppyitemfixclass_17.aBool1675 = false;
			choppyitemfixclass_17.aBool1708 = 5 < 0 || 5 > choppyitemfixclass_17.anInt1684 || 75 < 0 || 75 > choppyitemfixclass_17.anInt1684 || 15 < 0 || 15 > choppyitemfixclass_17.anInt1684;
			int i_18 = -65536 >>> 24;
			if (1 == 0 || 1 == 1 && i_18 == 255) {
				choppyitemfixclass_17.anInt1674 = 0;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) 10, (float) 50, (float) 90, (float) 5, (float) 75, (float) 15, (float) 100.0, (float) 100.0, (float) 100.0, -65536, -65536, -65536);
			} else {
				choppyitemfixclass_17.anInt1674 = 255 - i_18;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) 10, (float) 50, (float) 90, (float) 5, (float) 75, (float) 15, (float) 100.0, (float) 100.0, (float) 100.0, -65536, -65536, -65536);
			}

			choppyitemfixclass_17.aBool1675 = true;
		}

	}

	public Matrix44Arr method8587() {
		return new Matrix44Arr(this.aClass384_8995);
	}

	public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (this.anIntArray8979 != null) {
			Class185 class185_8 = this.method14370(Thread.currentThread());
			ChoppyItemFixClass choppyitemfixclass_9 = class185_8.aClass144_2310;
			int i_10 = i_3 - i_1;
			int i_11 = i_4 - i_2;
			int i_12 = i_10 >= 0 ? i_10 : -i_10;
			int i_13 = i_11 >= 0 ? i_11 : -i_11;
			int i_14 = i_12;
			if (i_12 < i_13) {
				i_14 = i_13;
			}

			if (i_14 != 0) {
				int i_15 = (i_10 << 16) / i_14;
				int i_16 = (i_11 << 16) / i_14;
				i_10 += i_15 >> 16;
				i_11 += i_16 >> 16;
				if (i_16 <= i_15) {
					i_15 = -i_15;
				} else {
					i_16 = -i_16;
				}

				int i_17 = i_16 * i_6 >> 17;
				int i_18 = 1 + i_16 * i_6 >> 17;
				int i_19 = i_15 * i_6 >> 17;
				int i_20 = 1 + i_6 * i_15 >> 17;
				i_1 -= choppyitemfixclass_9.method2416();
				i_2 -= choppyitemfixclass_9.method2417();
				int i_21 = i_1 + i_17;
				int i_22 = i_1 - i_18;
				int i_23 = i_10 + i_1 - i_18;
				int i_24 = i_10 + i_1 + i_17;
				int i_25 = i_19 + i_2;
				int i_26 = i_2 - i_20;
				int i_27 = i_2 + i_11 - i_20;
				int i_28 = i_11 + i_2 + i_19;
				if (i_7 == 0) {
					choppyitemfixclass_9.anInt1674 = 0;
				} else {
					if (i_7 != 1) {
						throw new IllegalArgumentException();
					}

					choppyitemfixclass_9.anInt1674 = 255 - (i_5 >>> 24);
				}

				this.RA(false);
				choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_22 < 0 || i_22 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684;
				choppyitemfixclass_9.method2428(true, false, false, (float) i_25, (float) i_26, (float) i_27, (float) i_21, (float) i_22, (float) i_23, 100.0F, 100.0F, 100.0F, i_5);
				choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684 || i_24 < 0 || i_24 > choppyitemfixclass_9.anInt1684;
				choppyitemfixclass_9.method2428(true, false, false, (float) i_25, (float) i_27, (float) i_28, (float) i_21, (float) i_23, (float) i_24, 100.0F, 100.0F, 100.0F, i_5);
				this.RA(true);
			}
		}

	}

	public void method8459() {
		MeshRasterizer_Sub2.anInt8644 = 10000;
		MeshRasterizer_Sub2.anInt8562 = 10000;
		if (this.anInt9008 > 1) {
			throw new IllegalStateException();
		} else {
			this.method14369(this.anInt9008);
			this.method14409();
		}
	}

	public Interface8 method8419(int i_1, int i_2) {
		return new Class125(i_1, i_2);
	}

	public RendererInfo method8481() {
		return new RendererInfo(0, "Pure Java", 1, "CPU", 0L);
	}

	void method8486() {
		if (this.aBool9012) {
			Class13.method508(true, false, -1632869233);
			this.aBool9012 = false;
		}

		this.aBool9014 = true;
	}

	public void method8483() {
	}

	public void method8484() {
	}

	public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8996.buf[10] * f_3 + f_1 * this.aClass384_8996.buf[2] + this.aClass384_8996.buf[14] + f_2 * this.aClass384_8996.buf[6];
		float f_6 = this.aClass384_8996.buf[3] * f_1 + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[7] * f_2 + f_3 * this.aClass384_8996.buf[11];
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = f_2 * this.aClass384_8996.buf[4] + this.aClass384_8996.buf[12] + f_1 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = f_3 * this.aClass384_8996.buf[9] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * f_1 + this.aClass384_8996.buf[5] * f_2;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.aClass384_8994.buf[14] + this.aClass384_8994.buf[2] * f_1 + this.aClass384_8994.buf[6] * f_2 + this.aClass384_8994.buf[10] * f_3;
					floats_4[0] = this.aFloat9003 + f_7 * this.aFloat8976 / f_6;
					floats_4[1] = f_8 * this.aFloat9004 / f_6 + this.aFloat8982;
					floats_4[2] = f_9;
				} else {
					floats_4[2] = Float.NaN;
					floats_4[1] = Float.NaN;
					floats_4[0] = Float.NaN;
				}
			} else {
				floats_4[2] = Float.NaN;
				floats_4[1] = Float.NaN;
				floats_4[0] = Float.NaN;
			}
		} else {
			floats_4[2] = Float.NaN;
			floats_4[1] = Float.NaN;
			floats_4[0] = Float.NaN;
		}

	}

	public void DA(Class455 class455_2, int i_3, int i_4) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
			int[] ints_6 = packetsdecoder_5.anIntArray9077;
			int[] ints_7 = packetsdecoder_5.anIntArray9078;
			int i_8;
			if (this.anInt8986 < ints_6.length + i_4) {
				i_8 = this.anInt8986 - i_4;
			} else {
				i_8 = ints_6.length;
			}

			int i_9;
			if (this.anInt9009 > i_4) {
				i_9 = this.anInt9009 - i_4;
				i_4 = this.anInt9009;
			} else {
				i_9 = 0;
			}

			if (i_8 - i_9 > 0) {
				int i_10 = i_4 * this.anInt8980;

				for (int i_11 = i_9; i_11 < i_8; i_11++) {
					int i_12 = i_3 + ints_6[i_11];
					int i_13 = ints_7[i_11];
					if (this.anInt8983 > i_12) {
						i_13 -= this.anInt8983 - i_12;
						i_12 = this.anInt8983;
					}

					if (this.anInt9002 < i_13 + i_12) {
						i_13 = this.anInt9002 - i_12;
					}

					i_12 += i_10;

					for (int i_14 = -i_13; i_14 < 0; i_14++) {
						this.anIntArray8979[i_12++] = -16777216;
					}

					i_10 += this.anInt8980;
				}
			}
		}

	}

	boolean method14377(int i_1) {
		return this.aBool8997 || this.anInterface22_5834.method144(i_1).isHalfSize;
	}

	public void method8487(int i_1) {
		int i_2 = i_1 - 1426154545 * this.anInt8977;

		for (Node_Sub27 class282_sub27_3 = (Node_Sub27) this.aClass229_9006.method3866(863387437); class282_sub27_3 != null; class282_sub27_3 = (Node_Sub27) this.aClass229_9006.method3867()) {
			if (class282_sub27_3.aBool7693) {
				class282_sub27_3.anInt7692 += i_2;
				int i_4 = class282_sub27_3.anInt7692 / 50;
				if (i_4 > 0) {
					TextureDetails class169_5 = this.anInterface22_5834.method144(class282_sub27_3.anInt7695);
					float f_6 = class169_5.isHalfSize ? 64.0F : 128.0F;
					class282_sub27_3.method12403((int) (f_6 * ((float) class169_5.textureSpeedU * ((float) i_2 / 1000.0F) / 64.0F)), (int) ((float) class169_5.textureSpeedV * ((float) i_2 / 1000.0F) / 64.0F * f_6));
					class282_sub27_3.anInt7692 -= 50 * i_4;
				}

				class282_sub27_3.aBool7693 = false;
			}
		}

		this.anInt8977 = i_1;
		this.aClass229_9013.method3858(5);
		this.aClass229_9006.method3858(5);
	}

	public void fq(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null && i_2 >= this.anInt9009 && i_2 < this.anInt8986) {
			if (i_1 < this.anInt8983) {
				i_3 -= this.anInt8983 - i_1;
				i_1 = this.anInt8983;
			}

			if (i_3 + i_1 > this.anInt9002) {
				i_3 = this.anInt9002 - i_1;
			}

			int i_6 = i_2 * this.anInt8980 + i_1;
			int i_7 = i_4 >>> 24;
			int i_8;
			if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
				for (i_8 = 0; i_8 < i_3; i_8++) {
					this.anIntArray8979[i_6 + i_8] = i_4;
				}
			} else {
				int i_9;
				int i_10;
				if (i_5 == 1) {
					i_4 = ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + (i_7 << 24);
					i_8 = 256 - i_7;

					for (i_9 = 0; i_9 < i_3; i_9++) {
						i_10 = this.anIntArray8979[i_9 + i_6];
						i_10 = (i_8 * (i_10 & 0xff00) >> 8 & 0xff00) + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff);
						this.anIntArray8979[i_9 + i_6] = i_4 + i_10;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_8 = 0; i_8 < i_3; i_8++) {
						i_9 = this.anIntArray8979[i_6 + i_8];
						i_10 = i_9 + i_4;
						int i_11 = (i_4 & 0xff00ff) + (i_9 & 0xff00ff);
						i_9 = (i_10 - i_11 & 0x10000) + (i_11 & 0x1000100);
						this.anIntArray8979[i_8 + i_6] = i_10 - i_9 | i_9 - (i_9 >>> 8);
					}
				}
			}
		}

	}

	public int dd() {
		return 0;
	}

	public int df() {
		return 0;
	}

	public int dv() {
		return 0;
	}

	public FontRenderer method8660(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		int[] ints_4 = new int[arr_2.length];
		int[] ints_5 = new int[arr_2.length];
		boolean bool_6 = false;

		for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
			ints_4[i_7] = arr_2[i_7].width;
			ints_5[i_7] = arr_2[i_7].height;
			if (arr_2[i_7].alpha != null) {
				bool_6 = true;
			}
		}

		if (bool_3) {
			if (bool_6) {
				return new FontRenderer_Sub2(this, fontmetrics_1, arr_2, ints_4, ints_5);
			} else {
				return new FontRenderer_Sub1(this, fontmetrics_1, arr_2, ints_4, ints_5);
			}
		} else if (bool_6) {
			throw new IllegalArgumentException("");
		} else {
			return new FontRenderer_Sub3(this, fontmetrics_1, arr_2, ints_4, ints_5);
		}
	}

	public boolean method8495() {
		return false;
	}

	public void method8477(Class152 class152_1) {
	}

	void fw(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null) {
			if (i_3 < 0) {
				i_3 = -i_3;
			}

			int i_6 = i_2 - i_3;
			if (i_6 < this.anInt9009) {
				i_6 = this.anInt9009;
			}

			int i_7 = 1 + i_2 + i_3;
			if (i_7 > this.anInt8986) {
				i_7 = this.anInt8986;
			}

			int i_8 = i_6;
			int i_9 = i_3 * i_3;
			int i_10 = 0;
			int i_11 = i_2 - i_6;
			int i_12 = i_11 * i_11;
			int i_13 = i_12 - i_11;
			if (i_2 > i_7) {
				i_2 = i_7;
			}

			int i_14 = i_4 >>> 24;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (i_5 != 0 && (i_5 != 1 || i_14 != 255)) {
				int i_19;
				int i_20;
				if (i_5 == 1) {
					i_4 = (i_14 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_14 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 << 24);

					for (i_15 = 256 - i_14; i_8 < i_2; i_13 -= i_11 + i_11) {
						while (i_13 <= i_9 || i_12 <= i_9) {
							i_12 += i_10 + i_10;
							i_13 += i_10++ + i_10;
						}

						i_16 = i_1 - i_10 + 1;
						if (i_16 < this.anInt8983) {
							i_16 = this.anInt8983;
						}

						i_17 = i_1 + i_10;
						if (i_17 > this.anInt9002) {
							i_17 = this.anInt9002;
						}

						i_18 = i_16 + i_8 * this.anInt8980;

						for (i_19 = i_16; i_19 < i_17; i_19++) {
							i_20 = this.anIntArray8979[i_18];
							i_20 = ((i_20 & 0xff00) * i_15 >> 8 & 0xff00) + ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff);
							this.anIntArray8979[i_18++] = i_4 + i_20;
						}

						++i_8;
						i_12 -= i_11-- + i_11;
					}

					i_10 = i_3;
					i_11 = -i_11;
					i_13 = i_9 + i_11 * i_11;
					i_12 = i_13 - i_3;

					for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
						while (i_13 > i_9 && i_12 > i_9) {
							i_13 -= i_10-- + i_10;
							i_12 -= i_10 + i_10;
						}

						i_16 = i_1 - i_10;
						if (i_16 < this.anInt8983) {
							i_16 = this.anInt8983;
						}

						i_17 = i_10 + i_1;
						if (i_17 > this.anInt9002 - 1) {
							i_17 = this.anInt9002 - 1;
						}

						i_18 = i_16 + this.anInt8980 * i_8;

						for (i_19 = i_16; i_19 <= i_17; i_19++) {
							i_20 = this.anIntArray8979[i_18];
							i_20 = (i_15 * (i_20 & 0xff00) >> 8 & 0xff00) + (i_15 * (i_20 & 0xff00ff) >> 8 & 0xff00ff);
							this.anIntArray8979[i_18++] = i_4 + i_20;
						}

						++i_8;
						i_13 += i_11 + i_11;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					int i_21;
					while (i_8 < i_2) {
						while (i_13 <= i_9 || i_12 <= i_9) {
							i_12 += i_10 + i_10;
							i_13 += i_10++ + i_10;
						}

						i_15 = i_1 - i_10 + 1;
						if (i_15 < this.anInt8983) {
							i_15 = this.anInt8983;
						}

						i_16 = i_10 + i_1;
						if (i_16 > this.anInt9002) {
							i_16 = this.anInt9002;
						}

						i_17 = i_15 + this.anInt8980 * i_8;

						for (i_18 = i_15; i_18 < i_16; i_18++) {
							i_19 = this.anIntArray8979[i_17];
							i_20 = i_4 + i_19;
							i_21 = (i_4 & 0xff00ff) + (i_19 & 0xff00ff);
							i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
							this.anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
						}

						++i_8;
						i_12 -= i_11-- + i_11;
						i_13 -= i_11 + i_11;
					}

					i_10 = i_3;
					i_11 = -i_11;
					i_13 = i_11 * i_11 + i_9;
					i_12 = i_13 - i_3;

					for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
						while (i_13 > i_9 && i_12 > i_9) {
							i_13 -= i_10-- + i_10;
							i_12 -= i_10 + i_10;
						}

						i_15 = i_1 - i_10;
						if (i_15 < this.anInt8983) {
							i_15 = this.anInt8983;
						}

						i_16 = i_10 + i_1;
						if (i_16 > this.anInt9002 - 1) {
							i_16 = this.anInt9002 - 1;
						}

						i_17 = i_15 + this.anInt8980 * i_8;

						for (i_18 = i_15; i_18 <= i_16; i_18++) {
							i_19 = this.anIntArray8979[i_17];
							i_20 = i_4 + i_19;
							i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
							i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
							this.anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
						}

						++i_8;
						i_13 += i_11 + i_11;
					}
				}
			} else {
				while (i_8 < i_2) {
					while (i_13 <= i_9 || i_12 <= i_9) {
						i_12 += i_10 + i_10;
						i_13 += i_10++ + i_10;
					}

					i_15 = 1 + (i_1 - i_10);
					if (i_15 < this.anInt8983) {
						i_15 = this.anInt8983;
					}

					i_16 = i_10 + i_1;
					if (i_16 > this.anInt9002) {
						i_16 = this.anInt9002;
					}

					i_17 = i_15 + i_8 * this.anInt8980;

					for (i_18 = i_15; i_18 < i_16; i_18++) {
						this.anIntArray8979[i_17++] = i_4;
					}

					++i_8;
					i_12 -= i_11-- + i_11;
					i_13 -= i_11 + i_11;
				}

				i_10 = i_3;
				i_11 = i_8 - i_2;
				i_13 = i_11 * i_11 + i_9;
				i_12 = i_13 - i_3;

				for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
					while (i_13 > i_9 && i_12 > i_9) {
						i_13 -= i_10-- + i_10;
						i_12 -= i_10 + i_10;
					}

					i_15 = i_1 - i_10;
					if (i_15 < this.anInt8983) {
						i_15 = this.anInt8983;
					}

					i_16 = i_1 + i_10;
					if (i_16 > this.anInt9002 - 1) {
						i_16 = this.anInt9002 - 1;
					}

					i_17 = i_15 + i_8 * this.anInt8980;

					for (i_18 = i_15; i_18 <= i_16; i_18++) {
						this.anIntArray8979[i_17++] = i_4;
					}

					++i_8;
					i_13 += i_11 + i_11;
				}

				return;
			}
		}

	}

	void method8485() {
		if (this.aBool9012) {
			Class13.method508(true, false, 208447629);
			this.aBool9012 = false;
		}

		this.aBool9014 = true;
	}

	public boolean method8489() {
		return false;
	}

	public boolean method8674() {
		return false;
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub2(this);
	}

	public boolean method8492() {
		return true;
	}

	public boolean method8599() {
		return false;
	}

	public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_4 + i_2 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
		this.G(i_1 + i_3 - 1, 1 + i_2, i_4 - 2, i_5, i_6);
	}

	public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return null;
	}

	void method8555() throws Exception_Sub3 {
		this.aClass158_Sub2_5841.method14353(0, 0);
		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-1661310222);
		}

	}

	public boolean method8431() {
		return false;
	}

	public boolean method8644() {
		return false;
	}

	public void method8475(HDWaterTile class90_2) {
		for (int i_3 = 0; i_3 < this.aClass185Array8984.length; i_3++) {
			this.aClass185Array8984[i_3].anInt2336 = this.aClass185Array8984[i_3].anInt2307;
			this.aClass185Array8984[i_3].anInt2306 = -1;
			this.aClass185Array8984[i_3].anInt2307 = class90_2.color;
			this.aClass185Array8984[i_3].anInt2313 = class90_2.scale;
			this.aClass185Array8984[i_3].aBool2309 = true;
		}

	}

	public boolean method8578() {
		return false;
	}

	public boolean method8462() {
		return false;
	}

	public boolean method8501() {
		return false;
	}

	public void method8560(int i_1) {
		MeshRasterizer_Sub2.anInt8644 = i_1;
		MeshRasterizer_Sub2.anInt8562 = i_1;
		if (656550451 * this.anInt9008 * 1696391419 > 1) {
			throw new IllegalStateException();
		} else {
			this.method14369(this.anInt9008);
			this.method14409();
		}
	}

	public boolean method8503() {
		return false;
	}

	public boolean method8614() {
		return false;
	}

	public boolean method8504() {
		return false;
	}

	public void method8491(boolean bool_1) {
	}

	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return Class52_Sub1.method14493(this, canvas_1, i_2, i_3, -2002710225);
	}

	public void fd(int i_1, int i_2) {
		if ((i_1 & 0x1) != 0) {
			this.B(0, 0, this.anInt8980, this.anInt8981, i_2, 0);
		}

		if ((i_1 & 0x2) != 0) {
			this.method14410();
		}

	}

	public void method8445() {
	}

	public void method8497() {
	}

	public void method8424(Matrix44Arr matrix44arr_1) {
		this.aClass384_8995.method6562(matrix44arr_1);
		this.method14374();
	}

	public void method8559(int i_1) {
		MeshRasterizer_Sub2.anInt8644 = i_1;
		MeshRasterizer_Sub2.anInt8562 = i_1;
		if (656550451 * this.anInt9008 * 1696391419 > 1) {
			throw new IllegalStateException();
		} else {
			this.method14369(this.anInt9008);
			this.method14409();
		}
	}

	public void eq(boolean bool_1) {
		Class185 class185_2 = this.method14370(Thread.currentThread());
		class185_2.aBool2334 = bool_1;
	}

	public void method8513(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8998 = i_1;
		this.anInt8999 = i_2;
		this.anInt9000 = i_3;
		this.anInt9001 = i_4;
		this.method14364();
	}

	public void method8691() {
	}

	public boolean method8502() {
		return false;
	}

	public NativeSprite method8518(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = class91_1.pallete;
		byte[] bytes_4 = class91_1.pixels;
		int i_5 = class91_1.width;
		int i_6 = class91_1.height;
		Object obj_7;
		int[] ints_8;
		byte[] bytes_9;
		int i_10;
		int i_11;
		int i_12;
		if (bool_2 && class91_1.alpha == null) {
			ints_8 = new int[ints_3.length];
			bytes_9 = new byte[i_5 * i_6];

			for (i_10 = 0; i_10 < i_6; i_10++) {
				i_11 = i_10 * i_5;

				for (i_12 = 0; i_12 < i_5; i_12++) {
					bytes_9[i_12 + i_11] = bytes_4[i_12 + i_11];
				}
			}

			for (i_10 = 0; i_10 < ints_3.length; i_10++) {
				ints_8[i_10] = ints_3[i_10];
			}

			obj_7 = new NativeSprite_Sub1_Sub2(this, bytes_9, ints_8, i_5, i_6);
		} else {
			ints_8 = new int[i_6 * i_5];
			bytes_9 = class91_1.alpha;
			if (bytes_9 != null) {
				for (i_10 = 0; i_10 < i_6; i_10++) {
					i_11 = i_5 * i_10;

					for (i_12 = 0; i_12 < i_5; i_12++) {
						ints_8[i_12 + i_11] = ints_3[bytes_4[i_12 + i_11] & 0xff] | bytes_9[i_12 + i_11] << 24;
					}
				}

				obj_7 = new NativeSprite_Sub1_Sub3(this, ints_8, i_5, i_6);
			} else {
				for (i_10 = 0; i_10 < i_6; i_10++) {
					i_11 = i_10 * i_5;

					for (i_12 = 0; i_12 < i_5; i_12++) {
						int i_13 = ints_3[bytes_4[i_12 + i_11] & 0xff];
						ints_8[i_11 + i_12] = i_13 != 0 ? ~0xffffff | i_13 : 0;
					}
				}

				obj_7 = new NativeSprite_Sub1_Sub1(this, ints_8, i_5, i_6);
			}
		}

		((NativeSprite_Sub1) obj_7).method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return (NativeSprite) obj_7;
	}

	public void ez() {
		this.anInt8983 = 0 * 72550989;
		this.anInt9009 = 0 * 1516535457;
		this.anInt9002 = 1480196385 * this.anInt8980;
		this.anInt8986 = this.anInt8981 * 1628550159;
		this.method14364();
	}

	public void eh() {
		this.anInt8983 = 0 * 72550989;
		this.anInt9009 = 0 * 1516535457;
		this.anInt9002 = 1480196385 * this.anInt8980;
		this.anInt8986 = this.anInt8981 * 1628550159;
		this.method14364();
	}

	public NativeSprite method8444(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = class91_1.pallete;
		byte[] bytes_4 = class91_1.pixels;
		int i_5 = class91_1.width;
		int i_6 = class91_1.height;
		Object obj_7;
		int[] ints_8;
		byte[] bytes_9;
		int i_10;
		int i_11;
		int i_12;
		if (bool_2 && class91_1.alpha == null) {
			ints_8 = new int[ints_3.length];
			bytes_9 = new byte[i_5 * i_6];

			for (i_10 = 0; i_10 < i_6; i_10++) {
				i_11 = i_10 * i_5;

				for (i_12 = 0; i_12 < i_5; i_12++) {
					bytes_9[i_12 + i_11] = bytes_4[i_12 + i_11];
				}
			}

			for (i_10 = 0; i_10 < ints_3.length; i_10++) {
				ints_8[i_10] = ints_3[i_10];
			}

			obj_7 = new NativeSprite_Sub1_Sub2(this, bytes_9, ints_8, i_5, i_6);
		} else {
			ints_8 = new int[i_6 * i_5];
			bytes_9 = class91_1.alpha;
			if (bytes_9 != null) {
				for (i_10 = 0; i_10 < i_6; i_10++) {
					i_11 = i_5 * i_10;

					for (i_12 = 0; i_12 < i_5; i_12++) {
						ints_8[i_12 + i_11] = ints_3[bytes_4[i_12 + i_11] & 0xff] | bytes_9[i_12 + i_11] << 24;
					}
				}

				obj_7 = new NativeSprite_Sub1_Sub3(this, ints_8, i_5, i_6);
			} else {
				for (i_10 = 0; i_10 < i_6; i_10++) {
					i_11 = i_10 * i_5;

					for (i_12 = 0; i_12 < i_5; i_12++) {
						int i_13 = ints_3[bytes_4[i_12 + i_11] & 0xff];
						ints_8[i_11 + i_12] = i_13 != 0 ? ~0xffffff | i_13 : 0;
					}
				}

				obj_7 = new NativeSprite_Sub1_Sub1(this, ints_8, i_5, i_6);
			}
		}

		((NativeSprite_Sub1) obj_7).method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return (NativeSprite) obj_7;
	}

	public void fc(int i_1, int i_2, int i_3, int i_4) {
		if (i_1 < 0) {
			i_1 = 0;
		}

		if (i_2 < 0) {
			i_2 = 0;
		}

		if (i_3 > this.anInt8980) {
			i_3 = this.anInt8980;
		}

		if (i_4 > this.anInt8981) {
			i_4 = this.anInt8981;
		}

		this.anInt8983 = i_1;
		this.anInt9002 = i_3;
		this.anInt9009 = i_2;
		this.anInt8986 = i_4;
		this.method14364();
	}

	public void fe(int i_1, int i_2, int i_3, int i_4) {
		if (this.anInt8983 < i_1) {
			this.anInt8983 = i_1;
		}

		if (this.anInt9009 < i_2) {
			this.anInt9009 = i_2;
		}

		if (this.anInt9002 > i_3) {
			this.anInt9002 = 1714763515 * i_3;
		}

		if (this.anInt8986 > i_4) {
			this.anInt8986 = i_4;
		}

		this.method14364();
	}

	public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		this.aClass158_Sub2_5841.method14353(i_1, i_2);
		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-1963503773);
		}

	}

	public Matrix44Var method8685() {
		return new Matrix44Var(this.aClass294_8993);
	}

	public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (this.anIntArray8979 != null) {
			Class185 class185_8 = this.method14370(Thread.currentThread());
			ChoppyItemFixClass choppyitemfixclass_9 = class185_8.aClass144_2310;
			int i_10 = i_3 - i_1;
			int i_11 = i_4 - i_2;
			int i_12 = i_10 >= 0 ? i_10 : -i_10;
			int i_13 = i_11 >= 0 ? i_11 : -i_11;
			int i_14 = i_12;
			if (i_12 < i_13) {
				i_14 = i_13;
			}

			if (i_14 != 0) {
				int i_15 = (i_10 << 16) / i_14;
				int i_16 = (i_11 << 16) / i_14;
				i_10 += i_15 >> 16;
				i_11 += i_16 >> 16;
				if (i_16 <= i_15) {
					i_15 = -i_15;
				} else {
					i_16 = -i_16;
				}

				int i_17 = i_16 * i_6 >> 17;
				int i_18 = i_16 * i_6 + 1 >> 17;
				int i_19 = i_15 * i_6 >> 17;
				int i_20 = i_15 * i_6 + 1 >> 17;
				i_1 -= choppyitemfixclass_9.method2416();
				i_2 -= choppyitemfixclass_9.method2417();
				int i_21 = i_17 + i_1;
				int i_22 = i_1 - i_18;
				int i_23 = i_10 + i_1 - i_18;
				int i_24 = i_10 + i_17 + i_1;
				int i_25 = i_19 + i_2;
				int i_26 = i_2 - i_20;
				int i_27 = i_11 + i_2 - i_20;
				int i_28 = i_11 + i_19 + i_2;
				if (i_7 == 0) {
					choppyitemfixclass_9.anInt1674 = 0;
				} else {
					if (i_7 != 1) {
						throw new IllegalArgumentException();
					}

					choppyitemfixclass_9.anInt1674 = 255 - (i_5 >>> 24);
				}

				this.RA(false);
				choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_22 < 0 || i_22 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684;
				choppyitemfixclass_9.method2428(true, false, false, (float) i_25, (float) i_26, (float) i_27, (float) i_21, (float) i_22, (float) i_23, 100.0F, 100.0F, 100.0F, i_5);
				choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684 || i_24 < 0 || i_24 > choppyitemfixclass_9.anInt1684;
				choppyitemfixclass_9.method2428(true, false, false, (float) i_25, (float) i_27, (float) i_28, (float) i_21, (float) i_23, (float) i_24, 100.0F, 100.0F, 100.0F, i_5);
				this.RA(true);
			}
		}

	}

	public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public void fi(int i_1, int i_2) {
		if ((i_1 & 0x1) != 0) {
			this.B(0, 0, this.anInt8980, this.anInt8981, i_2, 0);
		}

		if ((i_1 & 0x2) != 0) {
			this.method14410();
		}

	}

	public void fk(int i_1, int i_2, int i_3, int i_4) {
		if (this.anInt8983 < i_1) {
			this.anInt8983 = i_1;
		}

		if (this.anInt9009 < i_2) {
			this.anInt9009 = i_2;
		}

		if (this.anInt9002 > i_3) {
			this.anInt9002 = 1714763515 * i_3;
		}

		if (this.anInt8986 > i_4) {
			this.anInt8986 = i_4;
		}

		this.method14364();
	}

	public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_4 + i_2 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
		this.G(i_1 + i_3 - 1, 1 + i_2, i_4 - 2, i_5, i_6);
	}

	public void fp(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.anIntArray8979 != null) {
			if (i_1 < this.anInt8983) {
				i_3 -= this.anInt8983 - i_1;
				i_1 = this.anInt8983;
			}

			if (i_2 < this.anInt9009) {
				i_4 -= this.anInt9009 - i_2;
				i_2 = this.anInt9009;
			}

			if (i_1 + i_3 > this.anInt9002) {
				i_3 = this.anInt9002 - i_1;
			}

			if (i_2 + i_4 > this.anInt8986) {
				i_4 = this.anInt8986 - i_2;
			}

			if (i_3 > 0 && i_4 > 0 && i_1 <= this.anInt9002 && i_2 <= this.anInt8986) {
				int i_7 = this.anInt8980 - i_3;
				int i_8 = i_1 + i_2 * this.anInt8980;
				int i_9 = i_5 >>> 24;
				int i_10;
				int i_11;
				int i_12;
				if (i_6 != 0 && (i_6 != 1 || i_9 != 255)) {
					int i_13;
					if (i_6 == 1) {
						i_5 = (((i_5 & ~0xff00ff) >>> 8) * i_9 & ~0xff00ff) + ((i_5 & 0xff00ff) * i_9 >> 8 & 0xff00ff);
						i_10 = 256 - i_9;

						for (i_11 = 0; i_11 < i_4; i_11++) {
							for (i_12 = -i_3; i_12 < 0; i_12++) {
								i_13 = this.anIntArray8979[i_8];
								i_13 = (i_10 * ((i_13 & ~0xff00ff) >>> 8) & ~0xff00ff) + (i_10 * (i_13 & 0xff00ff) >> 8 & 0xff00ff);
								this.anIntArray8979[i_8++] = i_5 + i_13;
							}

							i_8 += i_7;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						for (i_10 = 0; i_10 < i_4; i_10++) {
							for (i_11 = -i_3; i_11 < 0; i_11++) {
								i_12 = this.anIntArray8979[i_8];
								i_13 = i_12 + i_5;
								int i_14 = (i_5 & 0xff00ff) + (i_12 & 0xff00ff);
								i_12 = (i_13 - i_14 & 0x10000) + (i_14 & 0x1000100);
								this.anIntArray8979[i_8++] = i_13 - i_12 | i_12 - (i_12 >>> 8);
							}

							i_8 += i_7;
						}
					}
				} else {
					i_10 = i_3 >> 3;
					i_11 = i_3 & 0x7;
					i_3 = i_8 - 1;

					for (i_12 = -i_4; i_12 < 0; i_12++) {
						if (i_10 > 0) {
							i_1 = i_10;

							do {
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								--i_1;
							} while (i_1 > 0);
						}

						if (i_11 > 0) {
							i_1 = i_11;

							do {
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								--i_1;
							} while (i_1 > 0);
						}

						i_3 += i_7;
					}
				}
			}
		}

	}

	public void fb(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.anIntArray8979 != null) {
			if (i_1 < this.anInt8983) {
				i_3 -= this.anInt8983 - i_1;
				i_1 = this.anInt8983;
			}

			if (i_2 < this.anInt9009) {
				i_4 -= this.anInt9009 - i_2;
				i_2 = this.anInt9009;
			}

			if (i_1 + i_3 > this.anInt9002) {
				i_3 = this.anInt9002 - i_1;
			}

			if (i_2 + i_4 > this.anInt8986) {
				i_4 = this.anInt8986 - i_2;
			}

			if (i_3 > 0 && i_4 > 0 && i_1 <= this.anInt9002 && i_2 <= this.anInt8986) {
				int i_7 = this.anInt8980 - i_3;
				int i_8 = i_1 + i_2 * this.anInt8980;
				int i_9 = i_5 >>> 24;
				int i_10;
				int i_11;
				int i_12;
				if (i_6 != 0 && (i_6 != 1 || i_9 != 255)) {
					int i_13;
					if (i_6 == 1) {
						i_5 = (((i_5 & ~0xff00ff) >>> 8) * i_9 & ~0xff00ff) + ((i_5 & 0xff00ff) * i_9 >> 8 & 0xff00ff);
						i_10 = 256 - i_9;

						for (i_11 = 0; i_11 < i_4; i_11++) {
							for (i_12 = -i_3; i_12 < 0; i_12++) {
								i_13 = this.anIntArray8979[i_8];
								i_13 = (i_10 * ((i_13 & ~0xff00ff) >>> 8) & ~0xff00ff) + (i_10 * (i_13 & 0xff00ff) >> 8 & 0xff00ff);
								this.anIntArray8979[i_8++] = i_5 + i_13;
							}

							i_8 += i_7;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						for (i_10 = 0; i_10 < i_4; i_10++) {
							for (i_11 = -i_3; i_11 < 0; i_11++) {
								i_12 = this.anIntArray8979[i_8];
								i_13 = i_12 + i_5;
								int i_14 = (i_5 & 0xff00ff) + (i_12 & 0xff00ff);
								i_12 = (i_13 - i_14 & 0x10000) + (i_14 & 0x1000100);
								this.anIntArray8979[i_8++] = i_13 - i_12 | i_12 - (i_12 >>> 8);
							}

							i_8 += i_7;
						}
					}
				} else {
					i_10 = i_3 >> 3;
					i_11 = i_3 & 0x7;
					i_3 = i_8 - 1;

					for (i_12 = -i_4; i_12 < 0; i_12++) {
						if (i_10 > 0) {
							i_1 = i_10;

							do {
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								--i_1;
							} while (i_1 > 0);
						}

						if (i_11 > 0) {
							i_1 = i_11;

							do {
								++i_3;
								this.anIntArray8979[i_3] = i_5;
								--i_1;
							} while (i_1 > 0);
						}

						i_3 += i_7;
					}
				}
			}
		}

	}

	public void fv(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null && i_3 > 0 && i_4 > 0) {
			int i_10 = 0;
			int i_11 = 0;
			int i_12 = (i_8 << 16) / i_3;
			int i_13 = (bytes_7.length / i_8 << 16) / i_4;
			int i_14 = i_1 + this.anInt8980 * i_2;
			int i_15 = this.anInt8980 - i_3;
			if (i_2 + i_4 > this.anInt8986) {
				i_4 -= i_4 + i_2 - this.anInt8986;
			}

			int i_16;
			if (i_2 < this.anInt9009) {
				i_16 = this.anInt9009 - i_2;
				i_4 -= i_16;
				i_14 += this.anInt8980 * i_16;
				i_11 += i_16 * i_13;
			}

			if (i_1 + i_3 > this.anInt9002) {
				i_16 = i_3 + i_1 - this.anInt9002;
				i_3 -= i_16;
				i_15 += i_16;
			}

			if (i_1 < this.anInt8983) {
				i_16 = this.anInt8983 - i_1;
				i_3 -= i_16;
				i_14 += i_16;
				i_10 += i_16 * i_12;
				i_15 += i_16;
			}

			i_16 = i_5 >>> 24;
			int i_17 = i_6 >>> 24;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			if (i_9 == 0 || i_9 == 1 && i_16 == 255 && i_17 == 255) {
				i_18 = i_10;

				for (i_19 = -i_4; i_19 < 0; i_19++) {
					i_20 = i_8 * (i_11 >> 16);

					for (i_21 = -i_3; i_21 < 0; i_21++) {
						if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
							this.anIntArray8979[i_14++] = i_6;
						} else {
							this.anIntArray8979[i_14++] = i_5;
						}

						i_10 += i_12;
					}

					i_11 += i_13;
					i_10 = i_18;
					i_14 += i_15;
				}
			} else {
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				if (i_9 == 1) {
					i_18 = i_10;

					for (i_19 = -i_4; i_19 < 0; i_19++) {
						i_20 = (i_11 >> 16) * i_8;

						for (i_21 = -i_3; i_21 < 0; i_21++) {
							i_22 = i_5;
							if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
								i_22 = i_6;
							}

							i_23 = i_22 >>> 24;
							i_24 = 255 - i_23;
							i_25 = this.anIntArray8979[i_14];
							this.anIntArray8979[i_14++] = (i_24 * (i_25 & 0xff00) + i_23 * (i_22 & 0xff00) & 0xff0000) + (i_23 * (i_22 & 0xff00ff) + (i_25 & 0xff00ff) * i_24 & ~0xff00ff) >> 8;
							i_10 += i_12;
						}

						i_11 += i_13;
						i_10 = i_18;
						i_14 += i_15;
					}
				} else {
					if (i_9 != 2) {
						throw new IllegalArgumentException();
					}

					i_18 = i_10;

					for (i_19 = -i_4; i_19 < 0; i_19++) {
						i_20 = i_8 * (i_11 >> 16);

						for (i_21 = -i_3; i_21 < 0; i_21++) {
							i_22 = i_5;
							if (bytes_7[(i_10 >> 16) + i_20] != 0) {
								i_22 = i_6;
							}

							if (i_22 != 0) {
								i_23 = this.anIntArray8979[i_14];
								i_24 = i_22 + i_23;
								i_25 = (i_23 & 0xff00ff) + (i_22 & 0xff00ff);
								i_23 = (i_24 - i_25 & 0x10000) + (i_25 & 0x1000100);
								this.anIntArray8979[i_14++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
							} else {
								++i_14;
							}

							i_10 += i_12;
						}

						i_11 += i_13;
						i_10 = i_18;
						i_14 += i_15;
					}
				}
			}
		}

	}

	public void ff(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null && i_3 > 0 && i_4 > 0) {
			int i_10 = 0;
			int i_11 = 0;
			int i_12 = (i_8 << 16) / i_3;
			int i_13 = (bytes_7.length / i_8 << 16) / i_4;
			int i_14 = i_1 + this.anInt8980 * i_2;
			int i_15 = this.anInt8980 - i_3;
			if (i_2 + i_4 > this.anInt8986) {
				i_4 -= i_4 + i_2 - this.anInt8986;
			}

			int i_16;
			if (i_2 < this.anInt9009) {
				i_16 = this.anInt9009 - i_2;
				i_4 -= i_16;
				i_14 += this.anInt8980 * i_16;
				i_11 += i_16 * i_13;
			}

			if (i_1 + i_3 > this.anInt9002) {
				i_16 = i_3 + i_1 - this.anInt9002;
				i_3 -= i_16;
				i_15 += i_16;
			}

			if (i_1 < this.anInt8983) {
				i_16 = this.anInt8983 - i_1;
				i_3 -= i_16;
				i_14 += i_16;
				i_10 += i_16 * i_12;
				i_15 += i_16;
			}

			i_16 = i_5 >>> 24;
			int i_17 = i_6 >>> 24;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			if (i_9 == 0 || i_9 == 1 && i_16 == 255 && i_17 == 255) {
				i_18 = i_10;

				for (i_19 = -i_4; i_19 < 0; i_19++) {
					i_20 = i_8 * (i_11 >> 16);

					for (i_21 = -i_3; i_21 < 0; i_21++) {
						if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
							this.anIntArray8979[i_14++] = i_6;
						} else {
							this.anIntArray8979[i_14++] = i_5;
						}

						i_10 += i_12;
					}

					i_11 += i_13;
					i_10 = i_18;
					i_14 += i_15;
				}
			} else {
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				if (i_9 == 1) {
					i_18 = i_10;

					for (i_19 = -i_4; i_19 < 0; i_19++) {
						i_20 = (i_11 >> 16) * i_8;

						for (i_21 = -i_3; i_21 < 0; i_21++) {
							i_22 = i_5;
							if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
								i_22 = i_6;
							}

							i_23 = i_22 >>> 24;
							i_24 = 255 - i_23;
							i_25 = this.anIntArray8979[i_14];
							this.anIntArray8979[i_14++] = (i_24 * (i_25 & 0xff00) + i_23 * (i_22 & 0xff00) & 0xff0000) + (i_23 * (i_22 & 0xff00ff) + (i_25 & 0xff00ff) * i_24 & ~0xff00ff) >> 8;
							i_10 += i_12;
						}

						i_11 += i_13;
						i_10 = i_18;
						i_14 += i_15;
					}
				} else {
					if (i_9 != 2) {
						throw new IllegalArgumentException();
					}

					i_18 = i_10;

					for (i_19 = -i_4; i_19 < 0; i_19++) {
						i_20 = i_8 * (i_11 >> 16);

						for (i_21 = -i_3; i_21 < 0; i_21++) {
							i_22 = i_5;
							if (bytes_7[(i_10 >> 16) + i_20] != 0) {
								i_22 = i_6;
							}

							if (i_22 != 0) {
								i_23 = this.anIntArray8979[i_14];
								i_24 = i_22 + i_23;
								i_25 = (i_23 & 0xff00ff) + (i_22 & 0xff00ff);
								i_23 = (i_24 - i_25 & 0x10000) + (i_25 & 0x1000100);
								this.anIntArray8979[i_14++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
							} else {
								++i_14;
							}

							i_10 += i_12;
						}

						i_11 += i_13;
						i_10 = i_18;
						i_14 += i_15;
					}
				}
			}
		}

	}

	void fr(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null) {
			if (i_3 < 0) {
				i_3 = -i_3;
			}

			int i_6 = i_2 - i_3;
			if (i_6 < this.anInt9009) {
				i_6 = this.anInt9009;
			}

			int i_7 = 1 + i_2 + i_3;
			if (i_7 > this.anInt8986) {
				i_7 = this.anInt8986;
			}

			int i_8 = i_6;
			int i_9 = i_3 * i_3;
			int i_10 = 0;
			int i_11 = i_2 - i_6;
			int i_12 = i_11 * i_11;
			int i_13 = i_12 - i_11;
			if (i_2 > i_7) {
				i_2 = i_7;
			}

			int i_14 = i_4 >>> 24;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (i_5 != 0 && (i_5 != 1 || i_14 != 255)) {
				int i_19;
				int i_20;
				if (i_5 == 1) {
					i_4 = (i_14 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_14 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 << 24);

					for (i_15 = 256 - i_14; i_8 < i_2; i_13 -= i_11 + i_11) {
						while (i_13 <= i_9 || i_12 <= i_9) {
							i_12 += i_10 + i_10;
							i_13 += i_10++ + i_10;
						}

						i_16 = i_1 - i_10 + 1;
						if (i_16 < this.anInt8983) {
							i_16 = this.anInt8983;
						}

						i_17 = i_1 + i_10;
						if (i_17 > this.anInt9002) {
							i_17 = this.anInt9002;
						}

						i_18 = i_16 + i_8 * this.anInt8980;

						for (i_19 = i_16; i_19 < i_17; i_19++) {
							i_20 = this.anIntArray8979[i_18];
							i_20 = ((i_20 & 0xff00) * i_15 >> 8 & 0xff00) + ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff);
							this.anIntArray8979[i_18++] = i_4 + i_20;
						}

						++i_8;
						i_12 -= i_11-- + i_11;
					}

					i_10 = i_3;
					i_11 = -i_11;
					i_13 = i_9 + i_11 * i_11;
					i_12 = i_13 - i_3;

					for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
						while (i_13 > i_9 && i_12 > i_9) {
							i_13 -= i_10-- + i_10;
							i_12 -= i_10 + i_10;
						}

						i_16 = i_1 - i_10;
						if (i_16 < this.anInt8983) {
							i_16 = this.anInt8983;
						}

						i_17 = i_10 + i_1;
						if (i_17 > this.anInt9002 - 1) {
							i_17 = this.anInt9002 - 1;
						}

						i_18 = i_16 + this.anInt8980 * i_8;

						for (i_19 = i_16; i_19 <= i_17; i_19++) {
							i_20 = this.anIntArray8979[i_18];
							i_20 = (i_15 * (i_20 & 0xff00) >> 8 & 0xff00) + (i_15 * (i_20 & 0xff00ff) >> 8 & 0xff00ff);
							this.anIntArray8979[i_18++] = i_4 + i_20;
						}

						++i_8;
						i_13 += i_11 + i_11;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					int i_21;
					while (i_8 < i_2) {
						while (i_13 <= i_9 || i_12 <= i_9) {
							i_12 += i_10 + i_10;
							i_13 += i_10++ + i_10;
						}

						i_15 = i_1 - i_10 + 1;
						if (i_15 < this.anInt8983) {
							i_15 = this.anInt8983;
						}

						i_16 = i_10 + i_1;
						if (i_16 > this.anInt9002) {
							i_16 = this.anInt9002;
						}

						i_17 = i_15 + this.anInt8980 * i_8;

						for (i_18 = i_15; i_18 < i_16; i_18++) {
							i_19 = this.anIntArray8979[i_17];
							i_20 = i_4 + i_19;
							i_21 = (i_4 & 0xff00ff) + (i_19 & 0xff00ff);
							i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
							this.anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
						}

						++i_8;
						i_12 -= i_11-- + i_11;
						i_13 -= i_11 + i_11;
					}

					i_10 = i_3;
					i_11 = -i_11;
					i_13 = i_11 * i_11 + i_9;
					i_12 = i_13 - i_3;

					for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
						while (i_13 > i_9 && i_12 > i_9) {
							i_13 -= i_10-- + i_10;
							i_12 -= i_10 + i_10;
						}

						i_15 = i_1 - i_10;
						if (i_15 < this.anInt8983) {
							i_15 = this.anInt8983;
						}

						i_16 = i_10 + i_1;
						if (i_16 > this.anInt9002 - 1) {
							i_16 = this.anInt9002 - 1;
						}

						i_17 = i_15 + this.anInt8980 * i_8;

						for (i_18 = i_15; i_18 <= i_16; i_18++) {
							i_19 = this.anIntArray8979[i_17];
							i_20 = i_4 + i_19;
							i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
							i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
							this.anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
						}

						++i_8;
						i_13 += i_11 + i_11;
					}
				}
			} else {
				while (i_8 < i_2) {
					while (i_13 <= i_9 || i_12 <= i_9) {
						i_12 += i_10 + i_10;
						i_13 += i_10++ + i_10;
					}

					i_15 = 1 + (i_1 - i_10);
					if (i_15 < this.anInt8983) {
						i_15 = this.anInt8983;
					}

					i_16 = i_10 + i_1;
					if (i_16 > this.anInt9002) {
						i_16 = this.anInt9002;
					}

					i_17 = i_15 + i_8 * this.anInt8980;

					for (i_18 = i_15; i_18 < i_16; i_18++) {
						this.anIntArray8979[i_17++] = i_4;
					}

					++i_8;
					i_12 -= i_11-- + i_11;
					i_13 -= i_11 + i_11;
				}

				i_10 = i_3;
				i_11 = i_8 - i_2;
				i_13 = i_11 * i_11 + i_9;
				i_12 = i_13 - i_3;

				for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
					while (i_13 > i_9 && i_12 > i_9) {
						i_13 -= i_10-- + i_10;
						i_12 -= i_10 + i_10;
					}

					i_15 = i_1 - i_10;
					if (i_15 < this.anInt8983) {
						i_15 = this.anInt8983;
					}

					i_16 = i_1 + i_10;
					if (i_16 > this.anInt9002 - 1) {
						i_16 = this.anInt9002 - 1;
					}

					i_17 = i_15 + i_8 * this.anInt8980;

					for (i_18 = i_15; i_18 <= i_16; i_18++) {
						this.anIntArray8979[i_17++] = i_4;
					}

					++i_8;
					i_13 += i_11 + i_11;
				}

				return;
			}
		}

	}

	public void method8514(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8998 = i_1;
		this.anInt8999 = i_2;
		this.anInt9000 = i_3;
		this.anInt9001 = i_4;
		this.method14364();
	}

	public void fs(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null && i_2 >= this.anInt9009 && i_2 < this.anInt8986) {
			if (i_1 < this.anInt8983) {
				i_3 -= this.anInt8983 - i_1;
				i_1 = this.anInt8983;
			}

			if (i_3 + i_1 > this.anInt9002) {
				i_3 = this.anInt9002 - i_1;
			}

			int i_6 = i_2 * this.anInt8980 + i_1;
			int i_7 = i_4 >>> 24;
			int i_8;
			if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
				for (i_8 = 0; i_8 < i_3; i_8++) {
					this.anIntArray8979[i_6 + i_8] = i_4;
				}
			} else {
				int i_9;
				int i_10;
				if (i_5 == 1) {
					i_4 = ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + (i_7 << 24);
					i_8 = 256 - i_7;

					for (i_9 = 0; i_9 < i_3; i_9++) {
						i_10 = this.anIntArray8979[i_9 + i_6];
						i_10 = (i_8 * (i_10 & 0xff00) >> 8 & 0xff00) + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff);
						this.anIntArray8979[i_9 + i_6] = i_4 + i_10;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_8 = 0; i_8 < i_3; i_8++) {
						i_9 = this.anIntArray8979[i_6 + i_8];
						i_10 = i_9 + i_4;
						int i_11 = (i_4 & 0xff00ff) + (i_9 & 0xff00ff);
						i_9 = (i_10 - i_11 & 0x10000) + (i_11 & 0x1000100);
						this.anIntArray8979[i_8 + i_6] = i_10 - i_9 | i_9 - (i_9 >>> 8);
					}
				}
			}
		}

	}

	public boolean method8605() {
		return false;
	}

	public void ej(float f_1, float f_2) {
		this.aFloat8978 = f_2 - f_1;
		this.aFloat8985 = f_2 + f_1 - 1.0F;

		for (int i_3 = 0; i_3 < this.anInt9008; i_3++) {
			Class185 class185_4 = this.aClass185Array8984[i_3];
			ChoppyItemFixClass choppyitemfixclass_5 = class185_4.aClass144_2310;
			choppyitemfixclass_5.aFloat1683 = this.aFloat8978;
			choppyitemfixclass_5.aFloat1682 = this.aFloat8985;
		}

	}

	public void fo(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null && i_1 >= this.anInt8983 && i_1 < this.anInt9002) {
			if (i_2 < this.anInt9009) {
				i_3 -= this.anInt9009 - i_2;
				i_2 = this.anInt9009;
			}

			if (i_2 + i_3 > this.anInt8986) {
				i_3 = this.anInt8986 - i_2;
			}

			int i_6 = i_2 * this.anInt8980 + i_1;
			int i_7 = i_4 >>> 24;
			int i_8;
			if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
				for (i_8 = 0; i_8 < i_3; i_8++) {
					this.anIntArray8979[i_6 + this.anInt8980 * i_8] = i_4;
				}
			} else {
				int i_9;
				int i_10;
				int i_11;
				if (i_5 == 1) {
					i_4 = ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + (i_7 << 24);
					i_8 = 256 - i_7;

					for (i_9 = 0; i_9 < i_3; i_9++) {
						i_10 = i_6 + i_9 * this.anInt8980;
						i_11 = this.anIntArray8979[i_10];
						i_11 = ((i_11 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_11 & 0xff00) * i_8 >> 8 & 0xff00);
						this.anIntArray8979[i_10] = i_4 + i_11;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_8 = 0; i_8 < i_3; i_8++) {
						i_9 = this.anInt8980 * i_8 + i_6;
						i_10 = this.anIntArray8979[i_9];
						i_11 = i_10 + i_4;
						int i_12 = (i_4 & 0xff00ff) + (i_10 & 0xff00ff);
						i_10 = (i_12 & 0x1000100) + (i_11 - i_12 & 0x10000);
						this.anIntArray8979[i_9] = i_11 - i_10 | i_10 - (i_10 >>> 8);
					}
				}
			}
		}

	}

	public void fl(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null && i_1 >= this.anInt8983 && i_1 < this.anInt9002) {
			if (i_2 < this.anInt9009) {
				i_3 -= this.anInt9009 - i_2;
				i_2 = this.anInt9009;
			}

			if (i_2 + i_3 > this.anInt8986) {
				i_3 = this.anInt8986 - i_2;
			}

			int i_6 = i_2 * this.anInt8980 + i_1;
			int i_7 = i_4 >>> 24;
			int i_8;
			if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
				for (i_8 = 0; i_8 < i_3; i_8++) {
					this.anIntArray8979[i_6 + this.anInt8980 * i_8] = i_4;
				}
			} else {
				int i_9;
				int i_10;
				int i_11;
				if (i_5 == 1) {
					i_4 = ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + (i_7 << 24);
					i_8 = 256 - i_7;

					for (i_9 = 0; i_9 < i_3; i_9++) {
						i_10 = i_6 + i_9 * this.anInt8980;
						i_11 = this.anIntArray8979[i_10];
						i_11 = ((i_11 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_11 & 0xff00) * i_8 >> 8 & 0xff00);
						this.anIntArray8979[i_10] = i_4 + i_11;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_8 = 0; i_8 < i_3; i_8++) {
						i_9 = this.anInt8980 * i_8 + i_6;
						i_10 = this.anIntArray8979[i_9];
						i_11 = i_10 + i_4;
						int i_12 = (i_4 & 0xff00ff) + (i_10 & 0xff00ff);
						i_10 = (i_12 & 0x1000100) + (i_11 - i_12 & 0x10000);
						this.anIntArray8979[i_9] = i_11 - i_10 | i_10 - (i_10 >>> 8);
					}
				}
			}
		}

	}

	public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new Class455_Sub3(i_1, i_2, ints_3, ints_4);
	}

	public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.XA(i_1, i_2, 1 + i_3, i_5, i_6);
				} else {
					this.XA(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.G(i_1, i_2, 1 + i_4, i_5, i_6);
				} else {
					this.G(i_1, i_2 + i_4, -i_4 + 1, i_5, i_6);
				}
			} else {
				if (i_3 + i_4 < 0) {
					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_7;
				int i_8;
				int i_9;
				int i_10;
				int i_11;
				int i_12;
				int i_13;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_7 = (int) Math.floor(0.5D + (double) i_4 / (double) i_3);
					i_3 += i_1;
					if (i_1 < this.anInt8983) {
						i_2 += (this.anInt8983 - i_1) * i_7;
						i_1 = this.anInt8983;
					}

					if (i_3 >= this.anInt9002) {
						i_3 = this.anInt9002 - 1;
					}

					i_8 = i_5 >>> 24;
					if (i_6 != 0 && (i_6 != 1 || i_8 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_8 << 24) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_8 >> 8 & 0xff00ff);

							for (i_9 = 256 - i_8; i_1 <= i_3; i_1++) {
								i_10 = i_2 >> 16;
								if (i_10 >= this.anInt9009 && i_10 < this.anInt8986) {
									i_11 = i_1 + this.anInt8980 * i_10;
									i_12 = this.anIntArray8979[i_11];
									i_12 = (i_9 * (i_12 & 0xff00ff) >> 8 & 0xff00ff) + (i_9 * (i_12 & 0xff00) >> 8 & 0xff00);
									this.anIntArray8979[i_11] = i_5 + i_12;
								}

								i_2 += i_7;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_1 <= i_3) {
								i_9 = i_2 >> 16;
								if (i_9 >= this.anInt9009 && i_9 < this.anInt8986) {
									i_10 = i_1 + i_9 * this.anInt8980;
									i_11 = this.anIntArray8979[i_10];
									i_12 = i_5 + i_11;
									i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
									i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
									this.anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
								}

								i_2 += i_7;
								++i_1;
							}
						}
					} else {
						while (i_1 <= i_3) {
							i_9 = i_2 >> 16;
							if (i_9 >= this.anInt9009 && i_9 < this.anInt8986) {
								this.anIntArray8979[i_1 + i_9 * this.anInt8980] = i_5;
							}

							i_2 += i_7;
							++i_1;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_7 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					if (i_2 < this.anInt9009) {
						i_1 += (this.anInt9009 - i_2) * i_7;
						i_2 = this.anInt9009;
					}

					if (i_4 >= this.anInt8986) {
						i_4 = this.anInt8986 - 1;
					}

					i_8 = i_5 >>> 24;
					if (i_6 == 0 || i_6 == 1 && i_8 == 255) {
						while (i_2 <= i_4) {
							i_9 = i_1 >> 16;
							if (i_9 >= this.anInt8983 && i_9 < this.anInt9002) {
								this.anIntArray8979[i_9 + this.anInt8980 * i_2] = i_5;
							}

							i_1 += i_7;
							++i_2;
						}
					} else if (i_6 == 1) {
						i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + (i_8 << 24);

						for (i_9 = 256 - i_8; i_2 <= i_4; i_2++) {
							i_10 = i_1 >> 16;
							if (i_10 >= this.anInt8983 && i_10 < this.anInt9002) {
								i_11 = this.anInt8980 * i_2 + i_10;
								i_12 = this.anIntArray8979[i_11];
								i_12 = ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_12 & 0xff00) * i_9 >> 8 & 0xff00);
								this.anIntArray8979[this.anInt8980 * i_2 + i_10] = i_5 + i_12;
							}

							i_1 += i_7;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_9 = i_1 >> 16;
							if (i_9 >= this.anInt8983 && i_9 < this.anInt9002) {
								i_10 = i_9 + i_2 * this.anInt8980;
								i_11 = this.anIntArray8979[i_10];
								i_12 = i_11 + i_5;
								i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
								i_11 = (i_12 - i_13 & 0x10000) + (i_13 & 0x1000100);
								this.anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
							}

							i_1 += i_7;
							++i_2;
						}
					}
				}
			}
		}

	}

	public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.XA(i_1, i_2, 1 + i_3, i_5, i_6);
				} else {
					this.XA(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.G(i_1, i_2, 1 + i_4, i_5, i_6);
				} else {
					this.G(i_1, i_2 + i_4, -i_4 + 1, i_5, i_6);
				}
			} else {
				if (i_3 + i_4 < 0) {
					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_7;
				int i_8;
				int i_9;
				int i_10;
				int i_11;
				int i_12;
				int i_13;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_7 = (int) Math.floor(0.5D + (double) i_4 / (double) i_3);
					i_3 += i_1;
					if (i_1 < this.anInt8983) {
						i_2 += (this.anInt8983 - i_1) * i_7;
						i_1 = this.anInt8983;
					}

					if (i_3 >= this.anInt9002) {
						i_3 = this.anInt9002 - 1;
					}

					i_8 = i_5 >>> 24;
					if (i_6 != 0 && (i_6 != 1 || i_8 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_8 << 24) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_8 >> 8 & 0xff00ff);

							for (i_9 = 256 - i_8; i_1 <= i_3; i_1++) {
								i_10 = i_2 >> 16;
								if (i_10 >= this.anInt9009 && i_10 < this.anInt8986) {
									i_11 = i_1 + this.anInt8980 * i_10;
									i_12 = this.anIntArray8979[i_11];
									i_12 = (i_9 * (i_12 & 0xff00ff) >> 8 & 0xff00ff) + (i_9 * (i_12 & 0xff00) >> 8 & 0xff00);
									this.anIntArray8979[i_11] = i_5 + i_12;
								}

								i_2 += i_7;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_1 <= i_3) {
								i_9 = i_2 >> 16;
								if (i_9 >= this.anInt9009 && i_9 < this.anInt8986) {
									i_10 = i_1 + i_9 * this.anInt8980;
									i_11 = this.anIntArray8979[i_10];
									i_12 = i_5 + i_11;
									i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
									i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
									this.anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
								}

								i_2 += i_7;
								++i_1;
							}
						}
					} else {
						while (i_1 <= i_3) {
							i_9 = i_2 >> 16;
							if (i_9 >= this.anInt9009 && i_9 < this.anInt8986) {
								this.anIntArray8979[i_1 + i_9 * this.anInt8980] = i_5;
							}

							i_2 += i_7;
							++i_1;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_7 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					if (i_2 < this.anInt9009) {
						i_1 += (this.anInt9009 - i_2) * i_7;
						i_2 = this.anInt9009;
					}

					if (i_4 >= this.anInt8986) {
						i_4 = this.anInt8986 - 1;
					}

					i_8 = i_5 >>> 24;
					if (i_6 == 0 || i_6 == 1 && i_8 == 255) {
						while (i_2 <= i_4) {
							i_9 = i_1 >> 16;
							if (i_9 >= this.anInt8983 && i_9 < this.anInt9002) {
								this.anIntArray8979[i_9 + this.anInt8980 * i_2] = i_5;
							}

							i_1 += i_7;
							++i_2;
						}
					} else if (i_6 == 1) {
						i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + (i_8 << 24);

						for (i_9 = 256 - i_8; i_2 <= i_4; i_2++) {
							i_10 = i_1 >> 16;
							if (i_10 >= this.anInt8983 && i_10 < this.anInt9002) {
								i_11 = this.anInt8980 * i_2 + i_10;
								i_12 = this.anIntArray8979[i_11];
								i_12 = ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_12 & 0xff00) * i_9 >> 8 & 0xff00);
								this.anIntArray8979[this.anInt8980 * i_2 + i_10] = i_5 + i_12;
							}

							i_1 += i_7;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_9 = i_1 >> 16;
							if (i_9 >= this.anInt8983 && i_9 < this.anInt9002) {
								i_10 = i_9 + i_2 * this.anInt8980;
								i_11 = this.anIntArray8979[i_10];
								i_12 = i_11 + i_5;
								i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
								i_11 = (i_12 - i_13 & 0x10000) + (i_13 & 0x1000100);
								this.anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
							}

							i_1 += i_7;
							++i_2;
						}
					}
				}
			}
		}

	}

	public Matrix44Arr method8588() {
		return new Matrix44Arr(this.aClass384_8995);
	}

	public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			int i_10;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_7 + i_8;
					i_9 %= i_10;
					i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_8 + i_7;
					i_9 %= i_10;
					i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
				}
			} else {
				i_9 <<= 8;
				i_7 <<= 8;
				i_8 <<= 8;
				i_10 = i_8 + i_7;
				i_9 %= i_10;
				int i_11;
				int i_12;
				if (i_3 + i_4 < 0) {
					i_11 = (int) (Math.sqrt((double) (i_3 * i_3 + i_4 * i_4)) * 256.0D);
					i_12 = i_11 % i_10;
					i_9 = i_7 + i_10 - i_9 - i_12;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_13;
				int i_14;
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_11 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
					i_3 += i_1;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								this.anIntArray8979[i_1 + this.anInt8980 * i_14] = i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					} else if (i_6 == 1) {
						i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

						for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
							i_15 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_15 >= this.anInt9009 && i_15 < this.anInt8986 && i_9 < i_7) {
								i_16 = i_15 * this.anInt8980 + i_1;
								i_17 = this.anIntArray8979[i_16];
								i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_16] = i_17 + i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								i_15 = i_1 + i_14 * this.anInt8980;
								i_16 = this.anIntArray8979[i_15];
								i_17 = i_16 + i_5;
								i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
								i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_11 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

							for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
								i_15 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_15 >= this.anInt8983 && i_15 < this.anInt9002 && i_9 < i_7) {
									i_16 = i_2 * this.anInt8980 + i_15;
									i_17 = this.anIntArray8979[i_16];
									i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
									this.anIntArray8979[i_15 + this.anInt8980 * i_2] = i_17 + i_5;
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_2 <= i_4) {
								i_14 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
									i_15 = i_2 * this.anInt8980 + i_14;
									i_16 = this.anIntArray8979[i_15];
									i_17 = i_16 + i_5;
									i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
								i_9 %= i_10;
							}
						}
					} else {
						while (i_2 <= i_4) {
							i_14 = i_1 >> 16;
							if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
								this.anIntArray8979[i_14 + i_2 * this.anInt8980] = i_5;
							}

							i_1 += i_11;
							++i_2;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				}
			}
		}

	}

	public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			int i_10;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_7 + i_8;
					i_9 %= i_10;
					i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_8 + i_7;
					i_9 %= i_10;
					i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
				}
			} else {
				i_9 <<= 8;
				i_7 <<= 8;
				i_8 <<= 8;
				i_10 = i_8 + i_7;
				i_9 %= i_10;
				int i_11;
				int i_12;
				if (i_3 + i_4 < 0) {
					i_11 = (int) (Math.sqrt((double) (i_3 * i_3 + i_4 * i_4)) * 256.0D);
					i_12 = i_11 % i_10;
					i_9 = i_7 + i_10 - i_9 - i_12;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_13;
				int i_14;
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_11 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
					i_3 += i_1;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								this.anIntArray8979[i_1 + this.anInt8980 * i_14] = i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					} else if (i_6 == 1) {
						i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

						for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
							i_15 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_15 >= this.anInt9009 && i_15 < this.anInt8986 && i_9 < i_7) {
								i_16 = i_15 * this.anInt8980 + i_1;
								i_17 = this.anIntArray8979[i_16];
								i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_16] = i_17 + i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								i_15 = i_1 + i_14 * this.anInt8980;
								i_16 = this.anIntArray8979[i_15];
								i_17 = i_16 + i_5;
								i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
								i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_11 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

							for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
								i_15 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_15 >= this.anInt8983 && i_15 < this.anInt9002 && i_9 < i_7) {
									i_16 = i_2 * this.anInt8980 + i_15;
									i_17 = this.anIntArray8979[i_16];
									i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
									this.anIntArray8979[i_15 + this.anInt8980 * i_2] = i_17 + i_5;
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_2 <= i_4) {
								i_14 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
									i_15 = i_2 * this.anInt8980 + i_14;
									i_16 = this.anIntArray8979[i_15];
									i_17 = i_16 + i_5;
									i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
								i_9 %= i_10;
							}
						}
					} else {
						while (i_2 <= i_4) {
							i_14 = i_1 >> 16;
							if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
								this.anIntArray8979[i_14 + i_2 * this.anInt8980] = i_5;
							}

							i_1 += i_11;
							++i_2;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				}
			}
		}

	}

	public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			int i_10;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_7 + i_8;
					i_9 %= i_10;
					i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_8 + i_7;
					i_9 %= i_10;
					i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
				}
			} else {
				i_9 <<= 8;
				i_7 <<= 8;
				i_8 <<= 8;
				i_10 = i_8 + i_7;
				i_9 %= i_10;
				int i_11;
				int i_12;
				if (i_3 + i_4 < 0) {
					i_11 = (int) (Math.sqrt((double) (i_3 * i_3 + i_4 * i_4)) * 256.0D);
					i_12 = i_11 % i_10;
					i_9 = i_7 + i_10 - i_9 - i_12;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_13;
				int i_14;
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_11 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
					i_3 += i_1;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								this.anIntArray8979[i_1 + this.anInt8980 * i_14] = i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					} else if (i_6 == 1) {
						i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

						for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
							i_15 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_15 >= this.anInt9009 && i_15 < this.anInt8986 && i_9 < i_7) {
								i_16 = i_15 * this.anInt8980 + i_1;
								i_17 = this.anIntArray8979[i_16];
								i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_16] = i_17 + i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								i_15 = i_1 + i_14 * this.anInt8980;
								i_16 = this.anIntArray8979[i_15];
								i_17 = i_16 + i_5;
								i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
								i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_11 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

							for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
								i_15 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_15 >= this.anInt8983 && i_15 < this.anInt9002 && i_9 < i_7) {
									i_16 = i_2 * this.anInt8980 + i_15;
									i_17 = this.anIntArray8979[i_16];
									i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
									this.anIntArray8979[i_15 + this.anInt8980 * i_2] = i_17 + i_5;
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_2 <= i_4) {
								i_14 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
									i_15 = i_2 * this.anInt8980 + i_14;
									i_16 = this.anIntArray8979[i_15];
									i_17 = i_16 + i_5;
									i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
								i_9 %= i_10;
							}
						}
					} else {
						while (i_2 <= i_4) {
							i_14 = i_1 >> 16;
							if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
								this.anIntArray8979[i_14 + i_2 * this.anInt8980] = i_5;
							}

							i_1 += i_11;
							++i_2;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				}
			}
		}

	}

	public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
			int[] ints_11 = packetsdecoder_10.anIntArray9077;
			int[] ints_12 = packetsdecoder_10.anIntArray9078;
			int i_13 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_14 = this.anInt8986 < i_9 + ints_11.length ? this.anInt8986 : ints_11.length + i_9;
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 + i_3 < 0) {
				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_15;
			int i_16;
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			int i_22;
			int i_23;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_15 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				if (i_1 < this.anInt8983) {
					i_2 += (this.anInt8983 - i_1) * i_15;
					i_1 = this.anInt8983;
				}

				if (i_3 >= this.anInt9002) {
					i_3 = this.anInt9002 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = ints_11[i_18] + i_8;
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								this.anIntArray8979[i_17 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_15;
						++i_1;
					}
				} else if (i_6 == 1) {
					i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

					for (i_17 = 256 - i_16; i_1 <= i_3; i_1++) {
						i_18 = i_2 >> 16;
						i_19 = i_18 - i_9;
						if (i_18 >= i_13 && i_18 < i_14) {
							i_20 = ints_11[i_19] + i_8;
							if (i_1 >= i_20 && i_1 < i_20 + ints_12[i_19]) {
								i_21 = i_1 + this.anInt8980 * i_18;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
								this.anIntArray8979[i_21] = i_5 + i_22;
							}
						}

						i_2 += i_15;
					}
				} else {
					if (i_6 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = i_8 + ints_11[i_18];
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								i_20 = i_17 * this.anInt8980 + i_1;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_21 + i_5;
								i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}
						}

						i_2 += i_15;
						++i_1;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_15 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_4 += i_2;
				if (i_2 < i_13) {
					i_1 += (i_13 - i_2) * i_15;
					i_2 = i_13;
				}

				if (i_4 >= i_14) {
					i_4 = i_14 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
					if (i_6 == 1) {
						i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

						for (i_17 = 256 - i_16; i_2 <= i_4; i_2++) {
							i_18 = i_1 >> 16;
							i_19 = i_2 - i_9;
							i_20 = i_8 + ints_11[i_19];
							if (i_18 >= this.anInt8983 && i_18 < this.anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
								i_21 = i_18 + i_2 * this.anInt8980;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_18 + i_2 * this.anInt8980] = i_22 + i_5;
							}

							i_1 += i_15;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_17 = i_1 >> 16;
							i_18 = i_2 - i_9;
							i_19 = ints_11[i_18] + i_8;
							if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
								i_20 = this.anInt8980 * i_2 + i_17;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_5 + i_21;
								i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							i_1 += i_15;
							++i_2;
						}
					}
				} else {
					while (i_2 <= i_4) {
						i_17 = i_1 >> 16;
						i_18 = i_2 - i_9;
						i_19 = ints_11[i_18] + i_8;
						if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
							this.anIntArray8979[i_17 + this.anInt8980 * i_2] = i_5;
						}

						i_1 += i_15;
						++i_2;
					}
				}
			}
		}

	}

	public void jf() {
		for (int i_1 = 0; i_1 < this.aClass185Array8984.length; i_1++) {
			this.aClass185Array8984[i_1].anInt2307 = this.aClass185Array8984[i_1].anInt2336;
			this.aClass185Array8984[i_1].aBool2309 = false;
		}

	}

	public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
			int[] ints_11 = packetsdecoder_10.anIntArray9077;
			int[] ints_12 = packetsdecoder_10.anIntArray9078;
			int i_13 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_14 = this.anInt8986 < i_9 + ints_11.length ? this.anInt8986 : ints_11.length + i_9;
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 + i_3 < 0) {
				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_15;
			int i_16;
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			int i_22;
			int i_23;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_15 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				if (i_1 < this.anInt8983) {
					i_2 += (this.anInt8983 - i_1) * i_15;
					i_1 = this.anInt8983;
				}

				if (i_3 >= this.anInt9002) {
					i_3 = this.anInt9002 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = ints_11[i_18] + i_8;
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								this.anIntArray8979[i_17 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_15;
						++i_1;
					}
				} else if (i_6 == 1) {
					i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

					for (i_17 = 256 - i_16; i_1 <= i_3; i_1++) {
						i_18 = i_2 >> 16;
						i_19 = i_18 - i_9;
						if (i_18 >= i_13 && i_18 < i_14) {
							i_20 = ints_11[i_19] + i_8;
							if (i_1 >= i_20 && i_1 < i_20 + ints_12[i_19]) {
								i_21 = i_1 + this.anInt8980 * i_18;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
								this.anIntArray8979[i_21] = i_5 + i_22;
							}
						}

						i_2 += i_15;
					}
				} else {
					if (i_6 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = i_8 + ints_11[i_18];
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								i_20 = i_17 * this.anInt8980 + i_1;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_21 + i_5;
								i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}
						}

						i_2 += i_15;
						++i_1;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_15 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_4 += i_2;
				if (i_2 < i_13) {
					i_1 += (i_13 - i_2) * i_15;
					i_2 = i_13;
				}

				if (i_4 >= i_14) {
					i_4 = i_14 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
					if (i_6 == 1) {
						i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

						for (i_17 = 256 - i_16; i_2 <= i_4; i_2++) {
							i_18 = i_1 >> 16;
							i_19 = i_2 - i_9;
							i_20 = i_8 + ints_11[i_19];
							if (i_18 >= this.anInt8983 && i_18 < this.anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
								i_21 = i_18 + i_2 * this.anInt8980;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_18 + i_2 * this.anInt8980] = i_22 + i_5;
							}

							i_1 += i_15;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_17 = i_1 >> 16;
							i_18 = i_2 - i_9;
							i_19 = ints_11[i_18] + i_8;
							if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
								i_20 = this.anInt8980 * i_2 + i_17;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_5 + i_21;
								i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							i_1 += i_15;
							++i_2;
						}
					}
				} else {
					while (i_2 <= i_4) {
						i_17 = i_1 >> 16;
						i_18 = i_2 - i_9;
						i_19 = ints_11[i_18] + i_8;
						if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
							this.anIntArray8979[i_17 + this.anInt8980 * i_2] = i_5;
						}

						i_1 += i_15;
						++i_2;
					}
				}
			}
		}

	}

	public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
			int[] ints_11 = packetsdecoder_10.anIntArray9077;
			int[] ints_12 = packetsdecoder_10.anIntArray9078;
			int i_13 = this.anInt9009 > i_9 ? this.anInt9009 : i_9;
			int i_14 = this.anInt8986 < i_9 + ints_11.length ? this.anInt8986 : ints_11.length + i_9;
			i_3 -= i_1;
			i_4 -= i_2;
			if (i_4 + i_3 < 0) {
				i_1 += i_3;
				i_3 = -i_3;
				i_2 += i_4;
				i_4 = -i_4;
			}

			int i_15;
			int i_16;
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			int i_22;
			int i_23;
			if (i_3 > i_4) {
				i_2 <<= 16;
				i_2 += 32768;
				i_4 <<= 16;
				i_15 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
				i_3 += i_1;
				if (i_1 < this.anInt8983) {
					i_2 += (this.anInt8983 - i_1) * i_15;
					i_1 = this.anInt8983;
				}

				if (i_3 >= this.anInt9002) {
					i_3 = this.anInt9002 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = ints_11[i_18] + i_8;
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								this.anIntArray8979[i_17 * this.anInt8980 + i_1] = i_5;
							}
						}

						i_2 += i_15;
						++i_1;
					}
				} else if (i_6 == 1) {
					i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

					for (i_17 = 256 - i_16; i_1 <= i_3; i_1++) {
						i_18 = i_2 >> 16;
						i_19 = i_18 - i_9;
						if (i_18 >= i_13 && i_18 < i_14) {
							i_20 = ints_11[i_19] + i_8;
							if (i_1 >= i_20 && i_1 < i_20 + ints_12[i_19]) {
								i_21 = i_1 + this.anInt8980 * i_18;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
								this.anIntArray8979[i_21] = i_5 + i_22;
							}
						}

						i_2 += i_15;
					}
				} else {
					if (i_6 != 2) {
						throw new IllegalArgumentException();
					}

					while (i_1 <= i_3) {
						i_17 = i_2 >> 16;
						i_18 = i_17 - i_9;
						if (i_17 >= i_13 && i_17 < i_14) {
							i_19 = i_8 + ints_11[i_18];
							if (i_1 >= i_19 && i_1 < ints_12[i_18] + i_19) {
								i_20 = i_17 * this.anInt8980 + i_1;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_21 + i_5;
								i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
								i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}
						}

						i_2 += i_15;
						++i_1;
					}
				}
			} else {
				i_1 <<= 16;
				i_1 += 32768;
				i_3 <<= 16;
				i_15 = (int) Math.floor(0.5D + (double) i_3 / (double) i_4);
				i_4 += i_2;
				if (i_2 < i_13) {
					i_1 += (i_13 - i_2) * i_15;
					i_2 = i_13;
				}

				if (i_4 >= i_14) {
					i_4 = i_14 - 1;
				}

				i_16 = i_5 >>> 24;
				if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
					if (i_6 == 1) {
						i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

						for (i_17 = 256 - i_16; i_2 <= i_4; i_2++) {
							i_18 = i_1 >> 16;
							i_19 = i_2 - i_9;
							i_20 = i_8 + ints_11[i_19];
							if (i_18 >= this.anInt8983 && i_18 < this.anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
								i_21 = i_18 + i_2 * this.anInt8980;
								i_22 = this.anIntArray8979[i_21];
								i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_18 + i_2 * this.anInt8980] = i_22 + i_5;
							}

							i_1 += i_15;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_2 <= i_4) {
							i_17 = i_1 >> 16;
							i_18 = i_2 - i_9;
							i_19 = ints_11[i_18] + i_8;
							if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
								i_20 = this.anInt8980 * i_2 + i_17;
								i_21 = this.anIntArray8979[i_20];
								i_22 = i_5 + i_21;
								i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
								this.anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
							}

							i_1 += i_15;
							++i_2;
						}
					}
				} else {
					while (i_2 <= i_4) {
						i_17 = i_1 >> 16;
						i_18 = i_2 - i_9;
						i_19 = ints_11[i_18] + i_8;
						if (i_17 >= this.anInt8983 && i_17 < this.anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
							this.anIntArray8979[i_17 + this.anInt8980 * i_2] = i_5;
						}

						i_1 += i_15;
						++i_2;
					}
				}
			}
		}

	}

	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_5 = new int[i_4 * i_3];
			int i_6 = 0;

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				int i_8 = i_1 + (i_2 + i_7) * this.anInt8980;

				for (int i_9 = 0; i_9 < i_3; i_9++) {
					ints_5[i_6++] = this.anIntArray8979[i_8 + i_9];
				}
			}

			return ints_5;
		}
	}

	public void method8480(boolean bool_1) {
	}

	public Node_Sub1 method8438(int i_1) {
		return null;
	}

	public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = (float) i_3 * this.aClass384_8996.buf[10] + (float) i_2 * this.aClass384_8996.buf[6] + this.aClass384_8996.buf[14] + (float) i_1 * this.aClass384_8996.buf[2];
		float f_9 = this.aClass384_8996.buf[6] * (float) i_5 + this.aClass384_8996.buf[14] + this.aClass384_8996.buf[2] * (float) i_4 + this.aClass384_8996.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8996.buf[15] + (float) i_1 * this.aClass384_8996.buf[3] + (float) i_2 * this.aClass384_8996.buf[7] + (float) i_3 * this.aClass384_8996.buf[11];
		float f_11 = (float) i_5 * this.aClass384_8996.buf[7] + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[3] * (float) i_4 + (float) i_6 * this.aClass384_8996.buf[11];
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8996.buf[4] * (float) i_2 + this.aClass384_8996.buf[12] + (float) i_1 * this.aClass384_8996.buf[0] + (float) i_3 * this.aClass384_8996.buf[8];
		float f_13 = (float) i_6 * this.aClass384_8996.buf[8] + (float) i_4 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[4] * (float) i_5;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8996.buf[5] * (float) i_2 + (float) i_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * (float) i_4 + this.aClass384_8996.buf[5] * (float) i_5 + (float) i_6 * this.aClass384_8996.buf[9];
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		boolean bool_14 = this.anIntArray8979 != null;
		boolean bool_15 = this.aFloatArray9010 != null;
		if (bool_14 || bool_15) {
			Class185 class185_16 = this.method14370(Thread.currentThread());
			ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
			choppyitemfixclass_17.aBool1675 = false;
			i_1 -= this.anInt8983;
			i_4 -= this.anInt8983;
			i_7 -= this.anInt8983;
			i_2 -= this.anInt9009;
			i_5 -= this.anInt9009;
			i_8 -= this.anInt9009;
			choppyitemfixclass_17.aBool1708 = i_1 < 0 || i_1 > choppyitemfixclass_17.anInt1684 || i_4 < 0 || i_4 > choppyitemfixclass_17.anInt1684 || i_7 < 0 || i_7 > choppyitemfixclass_17.anInt1684;
			int i_18 = i_10 >>> 24;
			if (i_13 == 0 || i_13 == 1 && i_18 == 255) {
				choppyitemfixclass_17.anInt1674 = 0;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			} else if (i_13 == 1) {
				choppyitemfixclass_17.anInt1674 = 255 - i_18;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			} else {
				if (i_13 != 2) {
					throw new IllegalArgumentException();
				}

				choppyitemfixclass_17.anInt1674 = 128;
				choppyitemfixclass_17.aBool1672 = true;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			}

			choppyitemfixclass_17.aBool1675 = true;
		}

	}

	public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = (float) i_3 * this.aClass384_8996.buf[10] + (float) i_2 * this.aClass384_8996.buf[6] + this.aClass384_8996.buf[14] + (float) i_1 * this.aClass384_8996.buf[2];
		float f_9 = this.aClass384_8996.buf[6] * (float) i_5 + this.aClass384_8996.buf[14] + this.aClass384_8996.buf[2] * (float) i_4 + this.aClass384_8996.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8996.buf[15] + (float) i_1 * this.aClass384_8996.buf[3] + (float) i_2 * this.aClass384_8996.buf[7] + (float) i_3 * this.aClass384_8996.buf[11];
		float f_11 = (float) i_5 * this.aClass384_8996.buf[7] + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[3] * (float) i_4 + (float) i_6 * this.aClass384_8996.buf[11];
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8996.buf[4] * (float) i_2 + this.aClass384_8996.buf[12] + (float) i_1 * this.aClass384_8996.buf[0] + (float) i_3 * this.aClass384_8996.buf[8];
		float f_13 = (float) i_6 * this.aClass384_8996.buf[8] + (float) i_4 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[4] * (float) i_5;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8996.buf[5] * (float) i_2 + (float) i_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * (float) i_4 + this.aClass384_8996.buf[5] * (float) i_5 + (float) i_6 * this.aClass384_8996.buf[9];
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public Node_Sub1 method8570(int i_1) {
		return null;
	}

	public Node_Sub1 method8541(int i_1) {
		return null;
	}

	HardwareRenderer(Canvas canvas_1, Interface22 interface22_2, int i_3, int i_4) {
		this(interface22_2);

		try {
			this.method8524(canvas_1, i_3, i_4, (byte) -11);
			this.method8412(canvas_1);
		} catch (Throwable throwable_6) {
			throwable_6.printStackTrace();
			this.method8396();
			throw new RuntimeException("");
		}
	}

	public void method8544(Node_Sub1 class282_sub1_1) {
	}

	public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return (NativeSprite) (bool_3 ? new NativeSprite_Sub1_Sub3(this, i_1, i_2) : new NativeSprite_Sub1_Sub1(this, i_1, i_2));
	}

	public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return (NativeSprite) (bool_3 ? new NativeSprite_Sub1_Sub3(this, i_1, i_2) : new NativeSprite_Sub1_Sub1(this, i_1, i_2));
	}

	public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		boolean bool_7 = false;
		int i_8 = i_2;

		for (int i_9 = 0; i_9 < i_5; i_9++) {
			for (int i_10 = 0; i_10 < i_4; i_10++) {
				int i_11 = ints_1[i_8++] >>> 24;
				if (i_11 != 0 && i_11 != 255) {
					bool_7 = true;
					return (NativeSprite) (bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6));
				}
			}
		}

		return (NativeSprite) (bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6));
	}

	public void method8673(int i_1, int i_2, int i_3, int i_4) {
	}

	public NativeSprite method8612(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = class91_1.pallete;
		byte[] bytes_4 = class91_1.pixels;
		int i_5 = class91_1.width;
		int i_6 = class91_1.height;
		Object obj_7;
		int[] ints_8;
		byte[] bytes_9;
		int i_10;
		int i_11;
		int i_12;
		if (bool_2 && class91_1.alpha == null) {
			ints_8 = new int[ints_3.length];
			bytes_9 = new byte[i_5 * i_6];

			for (i_10 = 0; i_10 < i_6; i_10++) {
				i_11 = i_10 * i_5;

				for (i_12 = 0; i_12 < i_5; i_12++) {
					bytes_9[i_12 + i_11] = bytes_4[i_12 + i_11];
				}
			}

			for (i_10 = 0; i_10 < ints_3.length; i_10++) {
				ints_8[i_10] = ints_3[i_10];
			}

			obj_7 = new NativeSprite_Sub1_Sub2(this, bytes_9, ints_8, i_5, i_6);
		} else {
			ints_8 = new int[i_6 * i_5];
			bytes_9 = class91_1.alpha;
			if (bytes_9 != null) {
				for (i_10 = 0; i_10 < i_6; i_10++) {
					i_11 = i_5 * i_10;

					for (i_12 = 0; i_12 < i_5; i_12++) {
						ints_8[i_12 + i_11] = ints_3[bytes_4[i_12 + i_11] & 0xff] | bytes_9[i_12 + i_11] << 24;
					}
				}

				obj_7 = new NativeSprite_Sub1_Sub3(this, ints_8, i_5, i_6);
			} else {
				for (i_10 = 0; i_10 < i_6; i_10++) {
					i_11 = i_10 * i_5;

					for (i_12 = 0; i_12 < i_5; i_12++) {
						int i_13 = ints_3[bytes_4[i_12 + i_11] & 0xff];
						ints_8[i_11 + i_12] = i_13 != 0 ? ~0xffffff | i_13 : 0;
					}
				}

				obj_7 = new NativeSprite_Sub1_Sub1(this, ints_8, i_5, i_6);
			}
		}

		((NativeSprite_Sub1) obj_7).method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return (NativeSprite) obj_7;
	}

	public int method8463() {
		return 0;
	}

	public boolean method8464() {
		return false;
	}

	public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_6 = new int[i_3 * i_4];
			int i_7 = i_2 * this.anInt8980 + i_1;
			int i_8 = this.anInt8980 - i_3;

			for (int i_9 = 0; i_9 < i_4; i_9++) {
				int i_10 = i_9 * i_3;

				for (int i_11 = 0; i_11 < i_3; i_11++) {
					ints_6[i_10 + i_11] = this.anIntArray8979[i_7++];
				}

				i_7 += i_8;
			}

			if (bool_5) {
				return new NativeSprite_Sub1_Sub3(this, ints_6, i_3, i_4);
			} else {
				return new NativeSprite_Sub1_Sub1(this, ints_6, i_3, i_4);
			}
		}
	}

	public void method8542(Node_Sub1 class282_sub1_1) {
	}

	public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new Class455_Sub3(i_1, i_2, ints_3, ints_4);
	}

	public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new Class455_Sub3(i_1, i_2, ints_3, ints_4);
	}

	void method14399(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (this.anIntArray8979 != null && i_1 >= this.anInt8983 && i_1 < this.anInt9002) {
			int i_9 = i_2 * this.anInt8980 + i_1;
			int i_10 = i_4 >>> 24;
			int i_11 = i_7 + i_6;
			int i_12 = i_8 % i_11;
			int i_13;
			if (i_5 == 0 || i_5 == 1 && i_10 == 255) {
				for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
					if (i_13 + i_2 >= this.anInt9009 && i_13 + i_2 < this.anInt8986 && i_12 < i_6) {
						this.anIntArray8979[i_9 + i_13 * this.anInt8980] = i_4;
					}

					++i_13;
					++i_12;
				}
			} else {
				int i_14;
				int i_15;
				int i_16;
				if (i_5 == 1) {
					i_4 = (i_10 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_10 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_10 << 24);
					i_13 = 256 - i_10;

					for (i_14 = 0; i_14 < i_3; i_12 %= i_11) {
						if (i_14 + i_2 >= this.anInt9009 && i_14 + i_2 < this.anInt8986 && i_12 < i_6) {
							i_15 = i_9 + i_14 * this.anInt8980;
							i_16 = this.anIntArray8979[i_15];
							i_16 = (i_13 * (i_16 & 0xff00) >> 8 & 0xff00) + ((i_16 & 0xff00ff) * i_13 >> 8 & 0xff00ff);
							this.anIntArray8979[i_15] = i_16 + i_4;
						}

						++i_14;
						++i_12;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
						if (i_13 + i_2 >= this.anInt9009 && i_13 + i_2 < this.anInt8986 && i_12 < i_6) {
							i_14 = i_9 + i_13 * this.anInt8980;
							i_15 = this.anIntArray8979[i_14];
							i_16 = i_15 + i_4;
							int i_17 = (i_15 & 0xff00ff) + (i_4 & 0xff00ff);
							i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
							this.anIntArray8979[i_14] = i_16 - i_15 | i_15 - (i_15 >>> 8);
						}

						++i_13;
						++i_12;
					}
				}
			}
		}

	}

	public void hr(int i_1, Class455 class455_2, int i_3, int i_4) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
			int[] ints_6 = packetsdecoder_5.anIntArray9077;
			int[] ints_7 = packetsdecoder_5.anIntArray9078;
			int i_8;
			if (this.anInt8986 < i_4 + ints_6.length) {
				i_8 = this.anInt8986 - i_4;
			} else {
				i_8 = ints_6.length;
			}

			int i_9;
			if (this.anInt9009 > i_4) {
				i_9 = this.anInt9009 - i_4;
				i_4 = this.anInt9009;
			} else {
				i_9 = 0;
			}

			if (i_8 - i_9 > 0) {
				int i_10 = this.anInt8980 * i_4;

				for (int i_11 = i_9; i_11 < i_8; i_11++) {
					int i_12 = ints_6[i_11] + i_3;
					int i_13 = ints_7[i_11];
					if (this.anInt8983 > i_12) {
						i_13 -= this.anInt8983 - i_12;
						i_12 = this.anInt8983;
					}

					if (this.anInt9002 < i_13 + i_12) {
						i_13 = this.anInt9002 - i_12;
					}

					i_12 += i_10;

					for (int i_14 = -i_13; i_14 < 0; i_14++) {
						this.anIntArray8979[i_12++] = i_1;
					}

					i_10 += this.anInt8980;
				}
			}
		}

	}

	public void hi(int i_1, Class455 class455_2, int i_3, int i_4) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
			int[] ints_6 = packetsdecoder_5.anIntArray9077;
			int[] ints_7 = packetsdecoder_5.anIntArray9078;
			int i_8;
			if (this.anInt8986 < i_4 + ints_6.length) {
				i_8 = this.anInt8986 - i_4;
			} else {
				i_8 = ints_6.length;
			}

			int i_9;
			if (this.anInt9009 > i_4) {
				i_9 = this.anInt9009 - i_4;
				i_4 = this.anInt9009;
			} else {
				i_9 = 0;
			}

			if (i_8 - i_9 > 0) {
				int i_10 = this.anInt8980 * i_4;

				for (int i_11 = i_9; i_11 < i_8; i_11++) {
					int i_12 = ints_6[i_11] + i_3;
					int i_13 = ints_7[i_11];
					if (this.anInt8983 > i_12) {
						i_13 -= this.anInt8983 - i_12;
						i_12 = this.anInt8983;
					}

					if (this.anInt9002 < i_13 + i_12) {
						i_13 = this.anInt9002 - i_12;
					}

					i_12 += i_10;

					for (int i_14 = -i_13; i_14 < 0; i_14++) {
						this.anIntArray8979[i_12++] = i_1;
					}

					i_10 += this.anInt8980;
				}
			}
		}

	}

	public void method8601() {
	}

	public FontRenderer method8625(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		int[] ints_4 = new int[arr_2.length];
		int[] ints_5 = new int[arr_2.length];
		boolean bool_6 = false;

		for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
			ints_4[i_7] = arr_2[i_7].width;
			ints_5[i_7] = arr_2[i_7].height;
			if (arr_2[i_7].alpha != null) {
				bool_6 = true;
			}
		}

		if (bool_3) {
			if (bool_6) {
				return new FontRenderer_Sub2(this, fontmetrics_1, arr_2, ints_4, ints_5);
			} else {
				return new FontRenderer_Sub1(this, fontmetrics_1, arr_2, ints_4, ints_5);
			}
		} else if (bool_6) {
			throw new IllegalArgumentException("");
		} else {
			return new FontRenderer_Sub3(this, fontmetrics_1, arr_2, ints_4, ints_5);
		}
	}

	public void method8586(Matrix44Arr matrix44arr_1) {
		this.aClass384_8995.method6562(matrix44arr_1);
		this.method14374();
	}

	public void ba(int i_1, int i_2) {
		if ((i_1 & 0x1) != 0) {
			this.B(0, 0, this.anInt8980, this.anInt8981, i_2, 0);
		}

		if ((i_1 & 0x2) != 0) {
			this.method14410();
		}

	}

	public void fh(int[] ints_1) {
		ints_1[0] = this.anInt8983;
		ints_1[1] = this.anInt9009;
		ints_1[2] = this.anInt9002;
		ints_1[3] = this.anInt8986;
	}

	public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public void L() {
		this.anInt8983 = 0;
		this.anInt9009 = 0;
		this.anInt9002 = this.anInt8980;
		this.anInt8986 = this.anInt8981;
		this.method14364();
	}

	public int method8565(int i_1, int i_2) {
		i_1 |= 0x20800;
		return i_1 & i_2 ^ i_2;
	}

	public void method8581(Class151 class151_1) {
		this.method14363(this.anIntArray8979 != null, this.aFloatArray9010 != null, class151_1);
	}

	public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
		return new Ground_Sub3(this, i_6, i_7, i_1, i_2, ints_3, ints_4, i_5);
	}

	public Matrix44Arr method8517() {
		Class185 class185_1 = this.method14370(Thread.currentThread());
		return class185_1.aClass384_2346;
	}

	public Matrix44Arr method8571() {
		Class185 class185_1 = this.method14370(Thread.currentThread());
		return class185_1.aClass384_2346;
	}

	public void method8580(Class151 class151_1) {
		this.method14363(this.anIntArray8979 != null, this.aFloatArray9010 != null, class151_1);
	}

	public Matrix44Var method8626() {
		Class185 class185_1 = this.method14370(Thread.currentThread());
		return class185_1.aClass294_2314;
	}

	public int method8574() {
		return 0;
	}

	public void fm(int i_1, int i_2, int i_3, int i_4) {
		if (i_1 < 0) {
			i_1 = 0;
		}

		if (i_2 < 0) {
			i_2 = 0;
		}

		if (i_3 > this.anInt8980) {
			i_3 = this.anInt8980;
		}

		if (i_4 > this.anInt8981) {
			i_4 = this.anInt8981;
		}

		this.anInt8983 = i_1;
		this.anInt9002 = i_3;
		this.anInt9009 = i_2;
		this.anInt8986 = i_4;
		this.method14364();
	}

	public void method8426(int i_1, Node_Sub24[] arr_2) {
	}

	public void method8579(int i_1, Node_Sub24[] arr_2) {
	}

	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_5 = new int[i_4 * i_3];
			int i_6 = 0;

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				int i_8 = i_1 + (i_2 + i_7) * this.anInt8980;

				for (int i_9 = 0; i_9 < i_3; i_9++) {
					ints_5[i_6++] = this.anIntArray8979[i_8 + i_9];
				}
			}

			return ints_5;
		}
	}

	public void G(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.anIntArray8979 != null && i_1 >= this.anInt8983 && i_1 < this.anInt9002) {
			if (i_2 < this.anInt9009) {
				i_3 -= this.anInt9009 - i_2;
				i_2 = this.anInt9009;
			}

			if (i_3 + i_2 > this.anInt8986) {
				i_3 = this.anInt8986 - i_2;
			}

			int i_6 = i_2 * this.anInt8980 + i_1;
			int i_7 = i_4 >>> 24;
			int i_8;
			if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
				for (i_8 = 0; i_8 < i_3; i_8++) {
					this.anIntArray8979[i_6 + i_8 * this.anInt8980] = i_4;
				}
			} else {
				int i_9;
				int i_10;
				int i_11;
				if (i_5 == 1) {
					i_4 = (i_7 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_7 << 24) + (i_7 * (i_4 & 0xff00) >> 8 & 0xff00);
					i_8 = 256 - i_7;

					for (i_9 = 0; i_9 < i_3; i_9++) {
						i_10 = i_6 + i_9 * this.anInt8980;
						i_11 = this.anIntArray8979[i_10];
						i_11 = ((i_11 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + (i_8 * (i_11 & 0xff00) >> 8 & 0xff00);
						this.anIntArray8979[i_10] = i_11 + i_4;
					}
				} else {
					if (i_5 != 2) {
						throw new IllegalArgumentException();
					}

					for (i_8 = 0; i_8 < i_3; i_8++) {
						i_9 = i_6 + i_8 * this.anInt8980;
						i_10 = this.anIntArray8979[i_9];
						i_11 = i_10 + i_4;
						int i_12 = (i_10 & 0xff00ff) + (i_4 & 0xff00ff);
						i_10 = (i_12 & 0x1000100) + (i_11 - i_12 & 0x10000);
						this.anIntArray8979[i_9] = i_11 - i_10 | i_10 - (i_10 >>> 8);
					}
				}
			}
		}

	}

	boolean method14403(int i_1) {
		return this.anInterface22_5834.method144(i_1).repeatS || this.anInterface22_5834.method144(i_1).repeatT;
	}

	public void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
		this.G(i_3 + i_1 - 1, i_2 + 1, i_4 - 2, i_5, i_6);
	}

	public void method8474() {
	}

	public void IA(float f_1) {
		this.anInt8992 = (int) (f_1 * 65535.0F);
	}

	public void method8423(Matrix44Var matrix44var_1) {
		this.aClass294_8993 = matrix44var_1;
		this.method14374();
	}

	public Matrix44Var method8583() {
		return new Matrix44Var(this.aClass294_8993);
	}

	public int method8566(int i_1, int i_2) {
		i_1 |= 0x20800;
		return i_1 & i_2 ^ i_2;
	}

	public void method8394(int i_1, Node_Sub24[] arr_2) {
	}

	public int method8567(int i_1, int i_2) {
		i_1 |= 0x20800;
		return i_1 & i_2 ^ i_2;
	}

	public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			int i_10;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_7 + i_8;
					i_9 %= i_10;
					i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
				} else {
					i_10 = i_8 + i_7;
					i_9 %= i_10;
					i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
				}
			} else {
				i_9 <<= 8;
				i_7 <<= 8;
				i_8 <<= 8;
				i_10 = i_8 + i_7;
				i_9 %= i_10;
				int i_11;
				int i_12;
				if (i_3 + i_4 < 0) {
					i_11 = (int) (Math.sqrt((double) (i_3 * i_3 + i_4 * i_4)) * 256.0D);
					i_12 = i_11 % i_10;
					i_9 = i_7 + i_10 - i_9 - i_12;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_13;
				int i_14;
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_11 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
					i_3 += i_1;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								this.anIntArray8979[i_1 + this.anInt8980 * i_14] = i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					} else if (i_6 == 1) {
						i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

						for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
							i_15 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_15 >= this.anInt9009 && i_15 < this.anInt8986 && i_9 < i_7) {
								i_16 = i_15 * this.anInt8980 + i_1;
								i_17 = this.anIntArray8979[i_16];
								i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_16] = i_17 + i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
						}
					} else {
						if (i_6 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								i_15 = i_1 + i_14 * this.anInt8980;
								i_16 = this.anIntArray8979[i_15];
								i_17 = i_16 + i_5;
								i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
								i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_11 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
						if (i_6 == 1) {
							i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

							for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
								i_15 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_15 >= this.anInt8983 && i_15 < this.anInt9002 && i_9 < i_7) {
									i_16 = i_2 * this.anInt8980 + i_15;
									i_17 = this.anIntArray8979[i_16];
									i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
									this.anIntArray8979[i_15 + this.anInt8980 * i_2] = i_17 + i_5;
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
							}
						} else {
							if (i_6 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_2 <= i_4) {
								i_14 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
									i_15 = i_2 * this.anInt8980 + i_14;
									i_16 = this.anIntArray8979[i_15];
									i_17 = i_16 + i_5;
									i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
								i_9 %= i_10;
							}
						}
					} else {
						while (i_2 <= i_4) {
							i_14 = i_1 >> 16;
							if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
								this.anIntArray8979[i_14 + i_2 * this.anInt8980] = i_5;
							}

							i_1 += i_11;
							++i_2;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				}
			}
		}

	}

	public void r(int i_1, int i_2, int i_3, int i_4) {
		if (i_1 < 0) {
			i_1 = 0;
		}

		if (i_2 < 0) {
			i_2 = 0;
		}

		if (i_3 > this.anInt8980) {
			i_3 = this.anInt8980;
		}

		if (i_4 > this.anInt8981) {
			i_4 = this.anInt8981;
		}

		this.anInt8983 = i_1;
		this.anInt9002 = i_3;
		this.anInt9009 = i_2;
		this.anInt8986 = i_4;
		this.method14364();
	}

	public Matrix44Arr method8589() {
		return new Matrix44Arr(this.aClass384_8995);
	}

	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return null;
	}

	public void iz(float f_1) {
		this.anInt8992 = (int) (f_1 * 65535.0F);
	}

	public void in(float f_1) {
		this.anInt8992 = (int) (f_1 * 65535.0F);
	}

	boolean method14408() {
		return this.aBool9014;
	}

	public void im(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		this.anInt8990 = (int) (65535.0F * f_2);
		this.anInt8991 = (int) (65535.0F * f_3);
		float f_7 = (float) Math.sqrt((double) (f_6 * f_6 + f_5 * f_5 + f_4 * f_4));
		this.anInt9011 = (int) (f_4 * 65535.0F / f_7);
		this.anInt8988 = (int) (65535.0F * f_5 / f_7);
		this.anInt9007 = (int) (f_6 * 65535.0F / f_7);
	}

	public void iq(int i_1) {
	}

	public void il(int i_1) {
	}

	public void ii(int i_1) {
	}

	public void is(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.aClass185Array8984.length; i_4++) {
			Class185 class185_5 = this.aClass185Array8984[i_4];
			class185_5.anInt2307 = (i_1 & 0xffffff);
			int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
			if (i_6 < 2) {
				i_6 = 2;
			}

			int i_7 = class185_5.anInt2307 >> 8 & 0xff;
			if (i_7 < 2) {
				i_7 = 2;
			}

			int i_8 = class185_5.anInt2307 & 0xff;
			if (i_8 < 2) {
				i_8 = 2;
			}

			class185_5.anInt2307 = (i_6 << 16 | i_7 << 8 | i_8);
			if (i_2 < 0) {
				class185_5.aBool2304 = false;
			} else {
				class185_5.aBool2304 = true;
			}
		}

	}

	public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
		if (this.anIntArray8979 != null) {
			i_3 -= i_1;
			i_4 -= i_2;
			int i_10;
			if (i_4 == 0) {
				if (i_3 >= 0) {
					this.method14366(i_1, i_2, i_3 + 1, i_5, 1, i_7, i_8, i_9);
				} else {
					i_10 = i_8 + i_7;
					i_9 %= i_10;
					i_9 = i_10 + i_7 - i_9 - (-i_3 + 1) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14366(i_3 + i_1, i_2, -i_3 + 1, i_5, 1, i_7, i_8, i_9);
				}
			} else if (i_3 == 0) {
				if (i_4 >= 0) {
					this.method14399(i_1, i_2, i_4 + 1, i_5, 1, i_7, i_8, i_9);
				} else {
					i_10 = i_8 + i_7;
					i_9 %= i_10;
					i_9 = i_10 + i_7 - i_9 - (-i_4 + 1) % i_10;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					this.method14399(i_1, i_2 + i_4, -i_4 + 1, i_5, 1, i_7, i_8, i_9);
				}
			} else {
				i_9 <<= 8;
				i_7 <<= 8;
				i_8 <<= 8;
				i_10 = i_8 + i_7;
				i_9 %= i_10;
				int i_11;
				int i_12;
				if (i_3 + i_4 < 0) {
					i_11 = (int) (Math.sqrt((double) (i_3 * i_3 + i_4 * i_4)) * 256.0D);
					i_12 = i_11 % i_10;
					i_9 = i_10 + i_7 - i_9 - i_12;
					i_9 %= i_10;
					if (i_9 < 0) {
						i_9 += i_10;
					}

					i_1 += i_3;
					i_3 = -i_3;
					i_2 += i_4;
					i_4 = -i_4;
				}

				int i_13;
				int i_14;
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (i_3 > i_4) {
					i_2 <<= 16;
					i_2 += 32768;
					i_4 <<= 16;
					i_11 = (int) Math.floor((double) i_4 / (double) i_3 + 0.5D);
					i_3 += i_1;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (1 == 0 || 1 == 1 && i_12 == 255) {
						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								this.anIntArray8979[i_14 * this.anInt8980 + i_1] = i_5;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					} else if (1 == 1) {
						i_5 = (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_12 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_12 << 24);

						for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
							i_15 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_15 >= this.anInt9009 && i_15 < this.anInt8986 && i_9 < i_7) {
								i_16 = i_15 * this.anInt8980 + i_1;
								i_17 = this.anIntArray8979[i_16];
								i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
								this.anIntArray8979[i_16] = i_5 + i_17;
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
						}
					} else {
						if (1 != 2) {
							throw new IllegalArgumentException();
						}

						while (i_1 <= i_3) {
							i_14 = i_2 >> 16;
							if (i_1 >= this.anInt8983 && i_1 < this.anInt9002 && i_14 >= this.anInt9009 && i_14 < this.anInt8986 && i_9 < i_7) {
								i_15 = i_14 * this.anInt8980 + i_1;
								i_16 = this.anIntArray8979[i_15];
								i_17 = i_5 + i_16;
								i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
								i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
							}

							i_2 += i_11;
							++i_1;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				} else {
					i_1 <<= 16;
					i_1 += 32768;
					i_3 <<= 16;
					i_11 = (int) Math.floor((double) i_3 / (double) i_4 + 0.5D);
					i_4 += i_2;
					i_12 = i_5 >>> 24;
					i_13 = (int) Math.sqrt((double) ((i_11 >> 8) * (i_11 >> 8) + 65536));
					if (1 != 0 && (1 != 1 || i_12 != 255)) {
						if (1 == 1) {
							i_5 = (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_12 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_12 << 24);

							for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
								i_15 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_15 >= this.anInt8983 && i_15 < this.anInt9002 && i_9 < i_7) {
									i_16 = i_2 * this.anInt8980 + i_15;
									i_17 = this.anIntArray8979[i_16];
									i_17 = (i_14 * (i_17 & 0xff00) >> 8 & 0xff00) + ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff);
									this.anIntArray8979[i_2 * this.anInt8980 + i_15] = i_5 + i_17;
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
							}
						} else {
							if (1 != 2) {
								throw new IllegalArgumentException();
							}

							while (i_2 <= i_4) {
								i_14 = i_1 >> 16;
								if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
									i_15 = i_2 * this.anInt8980 + i_14;
									i_16 = this.anIntArray8979[i_15];
									i_17 = i_5 + i_16;
									i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									this.anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}

								i_1 += i_11;
								++i_2;
								i_9 += i_13;
								i_9 %= i_10;
							}
						}
					} else {
						while (i_2 <= i_4) {
							i_14 = i_1 >> 16;
							if (i_2 >= this.anInt9009 && i_2 < this.anInt8986 && i_14 >= this.anInt8983 && i_14 < this.anInt9002 && i_9 < i_7) {
								this.anIntArray8979[i_2 * this.anInt8980 + i_14] = i_5;
							}

							i_1 += i_11;
							++i_2;
							i_9 += i_13;
							i_9 %= i_10;
						}
					}
				}
			}
		}

	}

	public void ib(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.aClass185Array8984.length; i_4++) {
			Class185 class185_5 = this.aClass185Array8984[i_4];
			class185_5.anInt2307 = (i_1 & 0xffffff);
			int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
			if (i_6 < 2) {
				i_6 = 2;
			}

			int i_7 = class185_5.anInt2307 >> 8 & 0xff;
			if (i_7 < 2) {
				i_7 = 2;
			}

			int i_8 = class185_5.anInt2307 & 0xff;
			if (i_8 < 2) {
				i_8 = 2;
			}

			class185_5.anInt2307 = (i_6 << 16 | i_7 << 8 | i_8);
			if (i_2 < 0) {
				class185_5.aBool2304 = false;
			} else {
				class185_5.aBool2304 = true;
			}
		}

	}

	public Node_Sub24 method8593(int i_1, int i_2, int i_3, int i_4, int i_5) {
		return null;
	}

	public void method8595(boolean bool_1) {
		this.aBool8997 = bool_1;
		this.aClass229_9006.method3859();
	}

	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return null;
	}

	public void method8584(Class152 class152_1) {
	}

	public boolean method8469() {
		return false;
	}

	public boolean method8628() {
		return false;
	}

	public void method8602() {
	}

	public Matrix44Var method8572() {
		Class185 class185_1 = this.method14370(Thread.currentThread());
		return class185_1.aClass294_2314;
	}

	public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new Class455_Sub3(i_1, i_2, ints_3, ints_4);
	}

	public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_6 = new int[i_3 * i_4];
			int i_7 = i_2 * this.anInt8980 + i_1;
			int i_8 = this.anInt8980 - i_3;

			for (int i_9 = 0; i_9 < i_4; i_9++) {
				int i_10 = i_9 * i_3;

				for (int i_11 = 0; i_11 < i_3; i_11++) {
					ints_6[i_10 + i_11] = this.anIntArray8979[i_7++];
				}

				i_7 += i_8;
			}

			if (bool_5) {
				return new NativeSprite_Sub1_Sub3(this, ints_6, i_3, i_4);
			} else {
				return new NativeSprite_Sub1_Sub1(this, ints_6, i_3, i_4);
			}
		}
	}

	public boolean method8679() {
		return false;
	}

	public boolean method8649() {
		return false;
	}

	public boolean method8606() {
		return false;
	}

	public boolean method8607() {
		return false;
	}

	void method8608(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
	}

	public int method8452(int i_1, int i_2) {
		i_1 |= 0x20800;
		return i_1 & i_2 ^ i_2;
	}

	public void method8603(int i_1, int i_2, int i_3, int i_4) {
	}

	public int za() {
		return 0;
	}

	public void method8594(boolean bool_1) {
		this.aBool8997 = bool_1;
		this.aClass229_9006.method3859();
	}

	public void method8613() {
	}

	public void method8585(int i_1, HDWaterTile class90_2) {
		for (int i_3 = 0; i_3 < this.aClass185Array8984.length; i_3++) {
			this.aClass185Array8984[i_3].anInt2336 = this.aClass185Array8984[i_3].anInt2307;
			this.aClass185Array8984[i_3].anInt2306 = i_1;
			this.aClass185Array8984[i_3].anInt2307 = class90_2.color;
			this.aClass185Array8984[i_3].anInt2313 = class90_2.scale;
			this.aClass185Array8984[i_3].aBool2309 = true;
		}

	}

	public void method8615(int i_1, HDWaterTile class90_2) {
		Class185 class185_3 = this.method14370(Thread.currentThread());
		class185_3.anInt2306 = i_1;
		class185_3.anInt2307 = class90_2.color;
		class185_3.anInt2313 = class90_2.scale;
	}

	public void method8616(int i_1, HDWaterTile class90_2) {
		Class185 class185_3 = this.method14370(Thread.currentThread());
		class185_3.anInt2306 = i_1;
		class185_3.anInt2307 = class90_2.color;
		class185_3.anInt2313 = class90_2.scale;
	}

	public void method8488(int i_1) {
		int i_2 = i_1 - 1426154545 * this.anInt8977;

		for (Node_Sub27 class282_sub27_3 = (Node_Sub27) this.aClass229_9006.method3866(514216110); class282_sub27_3 != null; class282_sub27_3 = (Node_Sub27) this.aClass229_9006.method3867()) {
			if (class282_sub27_3.aBool7693) {
				class282_sub27_3.anInt7692 += i_2;
				int i_4 = class282_sub27_3.anInt7692 / 50;
				if (i_4 > 0) {
					TextureDetails class169_5 = this.anInterface22_5834.method144(class282_sub27_3.anInt7695);
					float f_6 = class169_5.isHalfSize ? 64.0F : 128.0F;
					class282_sub27_3.method12403((int) (f_6 * ((float) class169_5.textureSpeedU * ((float) i_2 / 1000.0F) / 64.0F)), (int) ((float) class169_5.textureSpeedV * ((float) i_2 / 1000.0F) / 64.0F * f_6));
					class282_sub27_3.anInt7692 -= 50 * i_4;
				}

				class282_sub27_3.aBool7693 = false;
			}
		}

		this.anInt8977 = i_1;
		this.aClass229_9013.method3858(5);
		this.aClass229_9006.method3858(5);
	}

	public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = f_3 * this.aClass384_8996.buf[11] + this.aClass384_8996.buf[7] * f_2 + f_1 * this.aClass384_8996.buf[3] + this.aClass384_8996.buf[15];
		float f_6 = f_2 * this.aClass384_8996.buf[4] + f_1 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[8] * f_3;
		float f_7 = f_2 * this.aClass384_8996.buf[5] + f_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + f_3 * this.aClass384_8996.buf[9];
		float f_8 = f_3 * this.aClass384_8994.buf[10] + this.aClass384_8994.buf[6] * f_2 + f_1 * this.aClass384_8994.buf[2] + this.aClass384_8994.buf[14];
		floats_4[0] = this.aFloat9003 + f_6 * this.aFloat8976 / f_5;
		floats_4[1] = this.aFloat8982 + f_7 * this.aFloat9004 / f_5;
		floats_4[2] = f_8;
	}

	public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = f_3 * this.aClass384_8996.buf[11] + this.aClass384_8996.buf[7] * f_2 + f_1 * this.aClass384_8996.buf[3] + this.aClass384_8996.buf[15];
		float f_6 = f_2 * this.aClass384_8996.buf[4] + f_1 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[12] + this.aClass384_8996.buf[8] * f_3;
		float f_7 = f_2 * this.aClass384_8996.buf[5] + f_1 * this.aClass384_8996.buf[1] + this.aClass384_8996.buf[13] + f_3 * this.aClass384_8996.buf[9];
		float f_8 = f_3 * this.aClass384_8994.buf[10] + this.aClass384_8994.buf[6] * f_2 + f_1 * this.aClass384_8994.buf[2] + this.aClass384_8994.buf[14];
		floats_4[0] = this.aFloat9003 + f_6 * this.aFloat8976 / f_5;
		floats_4[1] = this.aFloat8982 + f_7 * this.aFloat9004 / f_5;
		floats_4[2] = f_8;
	}

	public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8996.buf[10] * f_3 + f_1 * this.aClass384_8996.buf[2] + this.aClass384_8996.buf[14] + f_2 * this.aClass384_8996.buf[6];
		float f_6 = this.aClass384_8996.buf[3] * f_1 + this.aClass384_8996.buf[15] + this.aClass384_8996.buf[7] * f_2 + f_3 * this.aClass384_8996.buf[11];
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = f_2 * this.aClass384_8996.buf[4] + this.aClass384_8996.buf[12] + f_1 * this.aClass384_8996.buf[0] + this.aClass384_8996.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = f_3 * this.aClass384_8996.buf[9] + this.aClass384_8996.buf[13] + this.aClass384_8996.buf[1] * f_1 + this.aClass384_8996.buf[5] * f_2;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.aClass384_8994.buf[14] + this.aClass384_8994.buf[2] * f_1 + this.aClass384_8994.buf[6] * f_2 + this.aClass384_8994.buf[10] * f_3;
					floats_4[0] = this.aFloat9003 + f_7 * this.aFloat8976 / f_6;
					floats_4[1] = f_8 * this.aFloat9004 / f_6 + this.aFloat8982;
					floats_4[2] = f_9;
				} else {
					floats_4[2] = Float.NaN;
					floats_4[1] = Float.NaN;
					floats_4[0] = Float.NaN;
				}
			} else {
				floats_4[2] = Float.NaN;
				floats_4[1] = Float.NaN;
				floats_4[0] = Float.NaN;
			}
		} else {
			floats_4[2] = Float.NaN;
			floats_4[1] = Float.NaN;
			floats_4[0] = Float.NaN;
		}

	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub2(this);
	}

	public Interface8 method8621(int i_1, int i_2) {
		return new Class125(i_1, i_2);
	}

	public boolean method8609() {
		return true;
	}

	public void ft(int[] ints_1) {
		ints_1[0] = this.anInt8983;
		ints_1[1] = this.anInt9009;
		ints_1[2] = this.anInt9002;
		ints_1[3] = this.anInt8986;
	}

	void method14409() {
		this.aClass185Array8984[0].method3070(Thread.currentThread());
	}

	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		if (this.anIntArray8979 == null) {
			throw new IllegalStateException("");
		} else {
			int[] ints_5 = new int[i_4 * i_3];
			int i_6 = 0;

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				int i_8 = i_1 + (i_2 + i_7) * this.anInt8980;

				for (int i_9 = 0; i_9 < i_3; i_9++) {
					ints_5[i_6++] = this.anIntArray8979[i_8 + i_9];
				}
			}

			return ints_5;
		}
	}

	public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		boolean bool_14 = this.anIntArray8979 != null;
		boolean bool_15 = this.aFloatArray9010 != null;
		if (bool_14 || bool_15) {
			Class185 class185_16 = this.method14370(Thread.currentThread());
			ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
			choppyitemfixclass_17.aBool1675 = false;
			i_1 -= this.anInt8983;
			i_4 -= this.anInt8983;
			i_7 -= this.anInt8983;
			i_2 -= this.anInt9009;
			i_5 -= this.anInt9009;
			i_8 -= this.anInt9009;
			choppyitemfixclass_17.aBool1708 = i_1 < 0 || i_1 > choppyitemfixclass_17.anInt1684 || i_4 < 0 || i_4 > choppyitemfixclass_17.anInt1684 || i_7 < 0 || i_7 > choppyitemfixclass_17.anInt1684;
			int i_18 = i_10 >>> 24;
			if (i_13 == 0 || i_13 == 1 && i_18 == 255) {
				choppyitemfixclass_17.anInt1674 = 0;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			} else if (i_13 == 1) {
				choppyitemfixclass_17.anInt1674 = 255 - i_18;
				choppyitemfixclass_17.aBool1672 = false;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			} else {
				if (i_13 != 2) {
					throw new IllegalArgumentException();
				}

				choppyitemfixclass_17.anInt1674 = 128;
				choppyitemfixclass_17.aBool1672 = true;
				choppyitemfixclass_17.method2425(bool_14, bool_15, false, (float) i_2, (float) i_5, (float) i_8, (float) i_1, (float) i_4, (float) i_7, f_3, f_6, f_9, i_10, i_11, i_12);
			}

			choppyitemfixclass_17.aBool1675 = true;
		}

	}

	public void hz(int i_1, Class455 class455_2, int i_3, int i_4) {
		if (this.anIntArray8979 != null) {
			Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
			int[] ints_6 = packetsdecoder_5.anIntArray9077;
			int[] ints_7 = packetsdecoder_5.anIntArray9078;
			int i_8;
			if (this.anInt8986 < i_4 + ints_6.length) {
				i_8 = this.anInt8986 - i_4;
			} else {
				i_8 = ints_6.length;
			}

			int i_9;
			if (this.anInt9009 > i_4) {
				i_9 = this.anInt9009 - i_4;
				i_4 = this.anInt9009;
			} else {
				i_9 = 0;
			}

			if (i_8 - i_9 > 0) {
				int i_10 = this.anInt8980 * i_4;

				for (int i_11 = i_9; i_11 < i_8; i_11++) {
					int i_12 = ints_6[i_11] + i_3;
					int i_13 = ints_7[i_11];
					if (this.anInt8983 > i_12) {
						i_13 -= this.anInt8983 - i_12;
						i_12 = this.anInt8983;
					}

					if (this.anInt9002 < i_13 + i_12) {
						i_13 = this.anInt9002 - i_12;
					}

					i_12 += i_10;

					for (int i_14 = -i_13; i_14 < 0; i_14++) {
						this.anIntArray8979[i_12++] = i_1;
					}

					i_10 += this.anInt8980;
				}
			}
		}

	}

	void method14410() {
		if (this.aFloatArray9010 != null) {
			int i_1;
			int i_2;
			int i_3;
			if (this.anInt8983 == 0 && this.anInt9002 == this.anInt8980 && this.anInt9009 == 0 && this.anInt8986 == this.anInt8981) {
				i_1 = this.aFloatArray9010.length;
				i_2 = i_1 - (i_1 & 0x7);

				for (i_3 = 0; i_3 < i_2; this.aFloatArray9010[i_3++] = 2.14748365E9F) {
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
				}

				while (i_3 < i_1) {
					this.aFloatArray9010[i_3++] = 2.14748365E9F;
				}
			} else {
				i_1 = this.anInt9002 - this.anInt8983;
				i_2 = this.anInt8986 - this.anInt9009;
				i_3 = this.anInt8980 - i_1;
				int i_4 = this.anInt8980 * this.anInt9009 + this.anInt8983;
				int i_5 = i_1 >> 3;
				int i_6 = i_1 & 0x7;
				i_1 = i_4 - 1;

				for (int i_7 = -i_2; i_7 < 0; i_7++) {
					int i_8;
					if (i_5 > 0) {
						i_8 = i_5;

						do {
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							--i_8;
						} while (i_8 > 0);
					}

					if (i_6 > 0) {
						i_8 = i_6;

						do {
							++i_1;
							this.aFloatArray9010[i_1] = 2.14748365E9F;
							--i_8;
						} while (i_8 > 0);
					}

					i_1 += i_3;
				}
			}
		}

	}

	public int method8630(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public int method8434(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public int method8632(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public void method8633() {
		this.anInt8998 = 0;
		this.anInt8999 = 0;
		this.anInt9000 = this.anInt8980;
		this.anInt9001 = this.anInt8981;
		this.method14364();
	}

	public void method8635() {
		this.anInt8998 = 0;
		this.anInt8999 = 0;
		this.anInt9000 = this.anInt8980;
		this.anInt9001 = this.anInt8981;
		this.method14364();
	}

	public int di() {
		return 0;
	}

	public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return null;
	}

}
