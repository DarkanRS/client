import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.nio.ByteBuffer;

public class HardwareGround extends Ground {

	static int[] anIntArray8558 = new int[1];
	static int[] anIntArray8559 = new int[1];
	static int[] anIntArray8561 = new int[1];
	int[][][] anIntArrayArrayArray8543;
	int[][][] anIntArrayArrayArray8532;
	int anInt8552;
	int anInt8542;
	static int anInt8560;
	Class74 aClass74_8545;
	int[][][] anIntArrayArrayArray8533;
	int[][][] anIntArrayArrayArray8540;
	int[][][] anIntArrayArrayArray8538;
	int[][][] anIntArrayArrayArray8556;
	Class282_Sub6[][][] aClass282_Sub6ArrayArrayArray8541;
	byte[][] aByteArrayArray8553;
	HashTable aClass453_8537;
	float[][] aFloatArrayArray8549;
	float[][] aFloatArrayArray8551;
	float[][] aFloatArrayArray8554;
	Interface4 anInterface4_8557;
	Interface4 anInterface4_8548;
	Class70 aClass70_8550;
	Node[] aClass282Array8547;
	int anInt8527;
	int anInt8525;
	float aFloat8535 = Float.MAX_VALUE;
	float aFloat8544 = -3.4028235E38F;
	LinkedNodeList aClass473_8546 = new LinkedNodeList();
	Class505_Sub2 aClass505_Sub2_8528;
	int anInt8536;
	int anInt8529;
	int anInt8530;
	int flags;
	short[][] aShortArrayArray8534;
	byte[][] aByteArrayArray8531;

	public void method6723(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
		if (this.anInt8542 > 0) {
			Interface32 interface32_9 = this.aClass505_Sub2_8528.method13911(this.anInt8527);
			int i_10 = 0;
			int i_11 = 32767;
			int i_12 = -32768;
			ByteBuffer bytebuffer_13 = this.aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer_13.clear();

			for (int i_14 = i_5; i_14 < i_7; i_14++) {
				int i_15 = i_14 * this.width + i_4;

				for (int i_16 = i_4; i_16 < i_6; i_16++) {
					if (bools_8[i_16 - i_4][i_14 - i_5]) {
						short[] shorts_17 = this.aShortArrayArray8534[i_15];
						if (shorts_17 != null) {
							for (int i_21 = 0; i_21 < shorts_17.length; i_21++) {
								int i_19 = shorts_17[i_21] & 0xffff;
								if (i_19 > i_12) {
									i_12 = i_19;
								}

								if (i_19 < i_11) {
									i_11 = i_19;
								}

								bytebuffer_13.putShort((short) i_19);
								++i_10;
							}
						}
					}

					++i_15;
				}
			}

			interface32_9.method42(0, bytebuffer_13.position(), this.aClass505_Sub2_8528.aLong8695);
			if (i_10 > 0) {
				this.aClass505_Sub2_8528.method14004();
				Class48 class48_20 = this.aClass505_Sub2_8528.aClass48_8794;
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method14161(1, this.anInterface4_8557);
				this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
				this.aClass505_Sub2_8528.method13997(interface32_9);
				this.aClass505_Sub2_8528.method8457(Matrix44Var.aClass294_3518);
				float f_22 = (float) this.aClass505_Sub2_8528.method8523((byte) 126).method2714();
				float f_23 = (float) this.aClass505_Sub2_8528.method8523((byte) 127).method2716();
				Matrix44Var matrix44var_24 = new Matrix44Var();
				Matrix44Var matrix44var_18 = new Matrix44Var();
				matrix44var_24.method5214();
				matrix44var_18.method5259((float) i_3 / (256.0F * (float) (this.tileUnits)), (float) (-i_3) / (256.0F * (float) (this.tileUnits)), 1.0F / (this.aFloat8544 - this.aFloat8535));
				matrix44var_18.method5219((float) i_1 - (float) (i_4 * i_3) / 256.0F, (float) i_2 + (float) (i_7 * i_3) / 256.0F, -this.aFloat8535 / (this.aFloat8544 - this.aFloat8535));
				matrix44var_18.method5247(2.0F / f_22, 2.0F / f_23);
				matrix44var_18.method5219(-1.0F, -1.0F, 0.0F);
				this.aClass505_Sub2_8528.aClass294_8713.method5261(matrix44var_24, matrix44var_18);
				this.aClass505_Sub2_8528.aClass384_8683.fromVarMatrix44(this.aClass505_Sub2_8528.aClass294_8713);
				this.aClass505_Sub2_8528.method8424(this.aClass505_Sub2_8528.aClass384_8683);
				class48_20.method957(Matrix44Arr.aClass384_4666);
				class48_20.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_20.aClass385_457.set(0.0F, 0.0F, 0.0F);
				class48_20.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_20.aClass385_459.set(0.0F, 0.0F, 0.0F);
				class48_20.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
				class48_20.aClass384_454.identity();
				class48_20.anInt467 = i_11;
				class48_20.anInt468 = i_12 - i_11 + 1;
				class48_20.anInt469 = 0;
				class48_20.anInt470 = i_10 / 3;
				class48_20.method946(false);
			}
		}

	}

	public void LA(int i_1, int i_2, int i_3) {
		if ((this.aByteArrayArray8553[i_1][i_2] & 0xff) < i_3) {
			this.aByteArrayArray8553[i_1][i_2] = (byte) i_3;
		}

	}

	public void method6707(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, Class90 class90_11, boolean bool_12) {
		Interface22 interface22_13 = this.aClass505_Sub2_8528.anInterface22_5834;
		if (ints_6 != null && this.anIntArrayArrayArray8543 == null) {
			this.anIntArrayArrayArray8543 = new int[this.width][this.length][];
		}

		if (ints_4 != null && this.anIntArrayArrayArray8532 == null) {
			this.anIntArrayArrayArray8532 = new int[this.width][this.length][];
		}

		this.anIntArrayArrayArray8540[i_1][i_2] = ints_3;
		this.anIntArrayArrayArray8533[i_1][i_2] = ints_5;
		this.anIntArrayArrayArray8538[i_1][i_2] = ints_7;
		this.anIntArrayArrayArray8556[i_1][i_2] = ints_8;
		if (this.anIntArrayArrayArray8543 != null) {
			this.anIntArrayArrayArray8543[i_1][i_2] = ints_6;
		}

		if (this.anIntArrayArrayArray8532 != null) {
			this.anIntArrayArrayArray8532[i_1][i_2] = ints_4;
		}

		Class282_Sub6[] arr_14 = this.aClass282_Sub6ArrayArrayArray8541[i_1][i_2] = new Class282_Sub6[ints_7.length];

		for (int i_15 = 0; i_15 < ints_7.length; i_15++) {
			int i_16 = ints_9[i_15];
			int i_17 = ints_10[i_15];
			if ((this.flags & 0x20) != 0 && i_16 != -1 && interface22_13.method144(i_16, -1764984087).isGroundMesh) {
				i_17 = 128;
				i_16 = -1;
			}

			long long_18 = (long) class90_11.intensity << 48 | (long) class90_11.scale << 42 | (long) class90_11.color << 28 | (long) (i_17 << 14) | (long) i_16;

			Node node_20;
			for (node_20 = this.aClass453_8537.method7530(long_18); node_20 != null; node_20 = this.aClass453_8537.method7544(1200593705)) {
				Class282_Sub6 class282_sub6_21 = (Class282_Sub6) node_20;
				if (i_16 == class282_sub6_21.anInt7510 && class282_sub6_21.aFloat7511 == (float) i_17 && class282_sub6_21.aClass90_7512.method1506(class90_11, -120742780)) {
					break;
				}
			}

			if (node_20 == null) {
				arr_14[i_15] = new Class282_Sub6(this, i_16, i_17, class90_11);
				this.aClass453_8537.method7534(arr_14[i_15], long_18);
			} else {
				arr_14[i_15] = (Class282_Sub6) node_20;
			}
		}

		if (bool_12) {
			this.aByteArrayArray8531[i_1][i_2] = (byte) (this.aByteArrayArray8531[i_1][i_2] | 0x1);
		}

		if (ints_7.length > this.anInt8552) {
			this.anInt8552 = ints_7.length;
		}

		this.anInt8542 += ints_7.length;
	}

	public void z(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1315(class282_sub50_sub17_1, i_7, i_8);
		}

	}

	public boolean method6712(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			return this.aClass74_8545.method1316(class282_sub50_sub17_1, i_7, i_8);
		} else {
			return false;
		}
	}

	public boolean method6718(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			return this.aClass74_8545.method1316(class282_sub50_sub17_1, i_7, i_8);
		} else {
			return false;
		}
	}

	public void method6715(int i_1, int i_2, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
		if (this.anInt8542 > 0) {
			Interface32 interface32_9 = this.aClass505_Sub2_8528.method13911(this.anInt8527);
			int i_10 = 0;
			int i_11 = 32767;
			int i_12 = -32768;
			ByteBuffer bytebuffer_13 = this.aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer_13.clear();

			for (int i_14 = i_5; i_14 < i_7; i_14++) {
				int i_15 = i_14 * this.width + i_4;

				for (int i_16 = i_4; i_16 < i_6; i_16++) {
					if (bools_8[i_16 - i_4][i_14 - i_5]) {
						short[] shorts_17 = this.aShortArrayArray8534[i_15];
						if (shorts_17 != null) {
							for (int i_21 = 0; i_21 < shorts_17.length; i_21++) {
								int i_19 = shorts_17[i_21] & 0xffff;
								if (i_19 > i_12) {
									i_12 = i_19;
								}

								if (i_19 < i_11) {
									i_11 = i_19;
								}

								bytebuffer_13.putShort((short) i_19);
								++i_10;
							}
						}
					}

					++i_15;
				}
			}

			interface32_9.method42(0, bytebuffer_13.position(), this.aClass505_Sub2_8528.aLong8695);
			if (i_10 > 0) {
				this.aClass505_Sub2_8528.method14004();
				Class48 class48_20 = this.aClass505_Sub2_8528.aClass48_8794;
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method14161(1, this.anInterface4_8557);
				this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
				this.aClass505_Sub2_8528.method13997(interface32_9);
				this.aClass505_Sub2_8528.method8457(Matrix44Var.aClass294_3518);
				float f_22 = (float) this.aClass505_Sub2_8528.method8523((byte) 109).method2714();
				float f_23 = (float) this.aClass505_Sub2_8528.method8523((byte) 122).method2716();
				Matrix44Var matrix44var_24 = new Matrix44Var();
				Matrix44Var matrix44var_18 = new Matrix44Var();
				matrix44var_24.method5214();
				matrix44var_18.method5259((float) 1024 / (256.0F * (float) this.tileUnits), (float) (-1024) / (256.0F * (float) this.tileUnits), 1.0F / (this.aFloat8544 - this.aFloat8535));
				matrix44var_18.method5219((float) i_1 - (float) (1024 * i_4) / 256.0F, (float) i_2 + (float) (1024 * i_7) / 256.0F, -this.aFloat8535 / (this.aFloat8544 - this.aFloat8535));
				matrix44var_18.method5247(2.0F / f_22, 2.0F / f_23);
				matrix44var_18.method5219(-1.0F, -1.0F, 0.0F);
				this.aClass505_Sub2_8528.aClass294_8713.method5261(matrix44var_24, matrix44var_18);
				this.aClass505_Sub2_8528.aClass384_8683.fromVarMatrix44(this.aClass505_Sub2_8528.aClass294_8713);
				this.aClass505_Sub2_8528.method8424(this.aClass505_Sub2_8528.aClass384_8683);
				class48_20.method957(Matrix44Arr.aClass384_4666);
				class48_20.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_20.aClass385_457.set(0.0F, 0.0F, 0.0F);
				class48_20.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_20.aClass385_459.set(0.0F, 0.0F, 0.0F);
				class48_20.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
				class48_20.aClass384_454.identity();
				class48_20.anInt467 = i_11;
				class48_20.anInt468 = i_12 - i_11 + 1;
				class48_20.anInt469 = 0;
				class48_20.anInt470 = i_10 / 3;
				class48_20.method946(false);
			}
		}

	}

	public Shadow w(int i_1, int i_2, Shadow class282_sub50_sub17_3) {
		if ((this.aByteArrayArray8531[i_1][i_2] & 0x1) == 0) {
			return null;
		} else {
			int i_4 = this.tileUnits >> this.aClass505_Sub2_8528.anInt8806;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_5 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_3;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_6;
			if (class282_sub50_sub17_sub2_5 != null && class282_sub50_sub17_sub2_5.method16039(i_4, i_4)) {
				class282_sub50_sub17_sub2_6 = class282_sub50_sub17_sub2_5;
				class282_sub50_sub17_sub2_5.method16042();
			} else {
				class282_sub50_sub17_sub2_6 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8528, i_4, i_4);
			}

			class282_sub50_sub17_sub2_6.method16040(0, 0, i_4, i_4);
			this.method13791(class282_sub50_sub17_sub2_6, i_1, i_2);
			return class282_sub50_sub17_sub2_6;
		}
	}

	void method13791(Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_1, int i_2, int i_3) {
		int[] ints_4 = this.anIntArrayArrayArray8540[i_2][i_3];
		int[] ints_5 = this.anIntArrayArrayArray8533[i_2][i_3];
		int i_6 = ints_4.length;
		if (anIntArray8558.length < i_6) {
			anIntArray8558 = new int[i_6];
			anIntArray8559 = new int[i_6];
		}

		int i_7;
		for (i_7 = 0; i_7 < i_6; i_7++) {
			anIntArray8558[i_7] = ints_4[i_7] >> this.aClass505_Sub2_8528.anInt8806;
			anIntArray8559[i_7] = ints_5[i_7] >> this.aClass505_Sub2_8528.anInt8806;
		}

		i_7 = 0;

		while (i_7 < i_6) {
			int i_8 = anIntArray8558[i_7];
			int i_9 = anIntArray8559[i_7++];
			int i_10 = anIntArray8558[i_7];
			int i_11 = anIntArray8559[i_7++];
			int i_12 = anIntArray8558[i_7];
			int i_13 = anIntArray8559[i_7++];
			if ((i_8 - i_10) * (i_11 - i_13) - (i_11 - i_9) * (i_12 - i_10) > 0) {
				class282_sub50_sub17_sub2_1.method16043(i_9, i_11, i_13, i_8, i_10, i_12);
			}
		}

	}

	public Shadow s(int i_1, int i_2, Shadow class282_sub50_sub17_3) {
		if ((this.aByteArrayArray8531[i_1][i_2] & 0x1) == 0) {
			return null;
		} else {
			int i_4 = this.tileUnits >> this.aClass505_Sub2_8528.anInt8806;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_5 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_3;
			Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2_6;
			if (class282_sub50_sub17_sub2_5 != null && class282_sub50_sub17_sub2_5.method16039(i_4, i_4)) {
				class282_sub50_sub17_sub2_6 = class282_sub50_sub17_sub2_5;
				class282_sub50_sub17_sub2_5.method16042();
			} else {
				class282_sub50_sub17_sub2_6 = new Class282_Sub50_Sub17_Sub2(this.aClass505_Sub2_8528, i_4, i_4);
			}

			class282_sub50_sub17_sub2_6.method16040(0, 0, i_4, i_4);
			this.method13791(class282_sub50_sub17_sub2_6, i_1, i_2);
			return class282_sub50_sub17_sub2_6;
		}
	}

	public void method6716(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5, int i_6) {
		if (this.aClass282Array8547 != null) {
			int i_7 = i_3 + i_3 + 1;
			i_7 *= i_7;
			if (anIntArray8561.length < i_7) {
				anIntArray8561 = new int[i_7];
			}

			int i_8 = i_1 - i_3;
			int i_9 = i_8;
			if (i_8 < 0) {
				i_8 = 0;
			}

			int i_10 = i_2 - i_3;
			int i_11 = i_10;
			if (i_10 < 0) {
				i_10 = 0;
			}

			int i_12 = i_1 + i_3;
			if (i_12 > this.width - 1) {
				i_12 = this.width - 1;
			}

			int i_13 = i_2 + i_3;
			if (i_13 > this.length - 1) {
				i_13 = this.length - 1;
			}

			anInt8560 = 0;

			for (int i_14 = i_8; i_14 <= i_12; i_14++) {
				boolean[] bools_25 = bools_4[i_14 - i_9];

				for (int i_26 = i_10; i_26 <= i_13; i_26++) {
					if (bools_25[i_26 - i_11]) {
						anIntArray8561[anInt8560++] = i_26 * this.width + i_14;
					}
				}
			}

			ByteBuffer bytebuffer_24 = this.aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer_24.clear();

			int i_15;
			for (i_15 = 0; i_15 < this.aClass282Array8547.length; i_15++) {
				Class282_Sub6 class282_sub6_16 = (Class282_Sub6) this.aClass282Array8547[i_15];
				class282_sub6_16.method12147(anIntArray8561, anInt8560);
			}

			i_15 = bytebuffer_24.position();
			Class48 class48_27 = this.aClass505_Sub2_8528.aClass48_8794;
			if (i_15 != 0) {
				Interface32 interface32_17 = this.aClass505_Sub2_8528.method13911(i_15 / 2);
				interface32_17.method42(0, i_15, this.aClass505_Sub2_8528.aLong8695);
				this.aClass505_Sub2_8528.method14004();
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method13997(interface32_17);
				class48_27.method957(Matrix44Arr.aClass384_4666);
				if (this.aClass505_Sub2_8528.anInt8811 > 0) {
					class48_27.aClass303_460.set(0.0F, 0.0F, 1.0F, -this.aClass505_Sub2_8528.aFloat8813);
					class48_27.aClass385_457.set((float) (this.aClass505_Sub2_8528.anInt8810 >> 16 & 0xff) / 255.0F, (float) (this.aClass505_Sub2_8528.anInt8810 >> 8 & 0xff) / 255.0F, (float) (this.aClass505_Sub2_8528.anInt8810 >> 0 & 0xff) / 255.0F);
					this.aClass505_Sub2_8528.aClass384_8683.method6562(this.aClass505_Sub2_8528.aClass384_8740);
					this.aClass505_Sub2_8528.aClass384_8683.method6520();
					class48_27.aClass303_460.concat(this.aClass505_Sub2_8528.aClass384_8683);
					class48_27.aClass303_460.scale(1.0F / (this.aClass505_Sub2_8528.aFloat8819 - this.aClass505_Sub2_8528.aFloat8813));
				} else {
					class48_27.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
					class48_27.aClass385_457.set(0.0F, 0.0F, 0.0F);
				}

				int i_18;
				int i_19;
				Class282_Sub6 class282_sub6_20;
				TextureDetails class169_22;
				if ((this.flags & 0x37) == 0) {
					i_18 = 0;

					for (i_19 = 0; i_19 < this.aClass282Array8547.length; i_19++) {
						class282_sub6_20 = (Class282_Sub6) this.aClass282Array8547[i_19];
						if (class282_sub6_20.anInt7514 != 0) {
							if (this.aClass505_Sub2_8528.aBool8779) {
								this.aClass505_Sub2_8528.method8476(0, class282_sub6_20.aClass90_7512);
								class48_27.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) this.aClass505_Sub2_8528.anInt8739 + (float) (class282_sub6_20.aClass90_7512.intensity) / 255.0F * (float) (class282_sub6_20.aClass90_7512.scale));
								class48_27.aClass303_458.scale(1.0F / (float) (class282_sub6_20.aClass90_7512.scale));
								class48_27.aClass385_459.set((float) (class282_sub6_20.aClass90_7512.color >> 16 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 8 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 0 & 0xff) / 255.0F);
							} else {
								class48_27.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
								class48_27.aClass385_459.set(0.0F, 0.0F, 0.0F);
							}

							boolean bool_30 = false;
							if (class282_sub6_20.anInt7510 != -1) {
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.aClass66_8787.method1283(class282_sub6_20.anInt7510);
								class169_22 = this.aClass505_Sub2_8528.anInterface22_5834.method144(class282_sub6_20.anInt7510, -2012208347);
								bool_30 = !Class282_Sub41.method13367(class169_22.effectId, (short) 16046);
							} else {
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
							}

							this.aClass505_Sub2_8528.method14161(1, class282_sub6_20.anInterface4_7516);
							this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
							class48_27.aClass384_454.method6525(1.0F / class282_sub6_20.aFloat7511, 1.0F / class282_sub6_20.aFloat7511, 1.0F, 1.0F);
							class48_27.anInt467 = class282_sub6_20.anInt7519;
							class48_27.anInt468 = class282_sub6_20.anInt7517 - class282_sub6_20.anInt7519 + 1;
							class48_27.anInt469 = i_18;
							class48_27.anInt470 = class282_sub6_20.anInt7514 / 3;
							class48_27.method946(bool_30);
							i_18 += class282_sub6_20.anInt7514;
						}
					}
				} else {
					class48_27.aClass385_466.set(this.aClass505_Sub2_8528.aFloatArray8747[0], this.aClass505_Sub2_8528.aFloatArray8747[1], this.aClass505_Sub2_8528.aFloatArray8747[2]);
					class48_27.aClass385_448.set(this.aClass505_Sub2_8528.aFloat8770 * this.aClass505_Sub2_8528.aFloat8766, this.aClass505_Sub2_8528.aFloat8770 * this.aClass505_Sub2_8528.aFloat8767, this.aClass505_Sub2_8528.aFloat8770 * this.aClass505_Sub2_8528.aFloat8768);
					class48_27.aClass385_464.set(-this.aClass505_Sub2_8528.aFloat8826 * this.aClass505_Sub2_8528.aFloat8766, -this.aClass505_Sub2_8528.aFloat8826 * this.aClass505_Sub2_8528.aFloat8767, -this.aClass505_Sub2_8528.aFloat8826 * this.aClass505_Sub2_8528.aFloat8768);
					class48_27.aClass385_461.set(this.aClass505_Sub2_8528.aFloat8769 * this.aClass505_Sub2_8528.aFloat8766, this.aClass505_Sub2_8528.aFloat8769 * this.aClass505_Sub2_8528.aFloat8767, this.aClass505_Sub2_8528.aFloat8769 * this.aClass505_Sub2_8528.aFloat8768);
					i_18 = 0;

					for (i_19 = 0; i_19 < this.aClass282Array8547.length; i_19++) {
						class282_sub6_20 = (Class282_Sub6) this.aClass282Array8547[i_19];
						if (class282_sub6_20.anInt7514 > 0) {
							if (this.aClass505_Sub2_8528.aBool8779) {
								this.aClass505_Sub2_8528.method8476(0, class282_sub6_20.aClass90_7512);
								float f_21 = 0.15F;
								class48_27.aClass303_458.set(0.0F, 1.0F / ((float) (class282_sub6_20.aClass90_7512.scale) * f_21), 0.0F, 256.0F / ((float) (class282_sub6_20.aClass90_7512.scale) * f_21));
								class48_27.aClass385_459.set((float) (class282_sub6_20.aClass90_7512.color >> 16 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 8 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 0 & 0xff) / 255.0F);
							} else {
								class48_27.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
								class48_27.aClass385_459.set(0.0F, 0.0F, 0.0F);
							}

							byte b_29 = 11;
							if (class282_sub6_20.anInt7510 != -1) {
								class169_22 = this.aClass505_Sub2_8528.anInterface22_5834.method144(class282_sub6_20.anInt7510, -1968208071);
								b_29 = class169_22.effectId;
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.aClass66_8787.method1283(class282_sub6_20.anInt7510);
								class48_27.method944(class169_22);
							} else {
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
							}

							this.aClass505_Sub2_8528.method14161(1, class282_sub6_20.anInterface4_7516);
							this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
							class48_27.aClass384_454.method6525(1.0F / class282_sub6_20.aFloat7511, 1.0F / class282_sub6_20.aFloat7511, 1.0F, 1.0F);
							class48_27.anInt467 = class282_sub6_20.anInt7519;
							class48_27.anInt468 = class282_sub6_20.anInt7517 - class282_sub6_20.anInt7519 + 1;
							class48_27.anInt469 = i_18;
							class48_27.anInt470 = class282_sub6_20.anInt7514 / 3;
							switch (b_29) {
							case 1:
								class48_27.aClass385_455.set(this.aClass505_Sub2_8528.aClass384_8814.buf[12], this.aClass505_Sub2_8528.aClass384_8814.buf[13], this.aClass505_Sub2_8528.aClass384_8814.buf[14]);
								class48_27.method948(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!this.aClass505_Sub2_8528.aBool8692 && (this.flags & 0x8) != 0) {
									Class41_Sub1_Sub1 class41_sub1_sub1_31 = this.aClass505_Sub2_8528.aClass41_Sub1_Sub1_8691;
									class41_sub1_sub1_31.aClass384_10090.method6562(this.aClass505_Sub2_8528.aClass384_8729);
									class41_sub1_sub1_31.aClass384_10091.method6525(1.0F / (class282_sub6_20.aFloat7511 * (float) (class282_sub6_20.aClass90_7512.anInt949)), 1.0F / (class282_sub6_20.aFloat7511 * (float) (class282_sub6_20.aClass90_7512.anInt949)), 1.0F, 1.0F);
									class41_sub1_sub1_31.aClass385_10089.set(this.aClass505_Sub2_8528.aClass384_8814.buf[12], this.aClass505_Sub2_8528.aClass384_8814.buf[13], this.aClass505_Sub2_8528.aClass384_8814.buf[14]);
									TextureDetails class169_23 = this.aClass505_Sub2_8528.anInterface22_5834.method144(class282_sub6_20.anInt7510, -1774392494);
									class41_sub1_sub1_31.anInt10095 = class169_23.effectParam1;
									class41_sub1_sub1_31.anInt10110 = class282_sub6_20.anInt7519;
									class41_sub1_sub1_31.anInt10111 = (class282_sub6_20.anInt7517 - class282_sub6_20.anInt7519 + 1);
									class41_sub1_sub1_31.anInt10094 = i_18;
									class41_sub1_sub1_31.anInt10112 = class282_sub6_20.anInt7514 / 3;
									class41_sub1_sub1_31.aClass303_10103.copy(class48_27.aClass303_458);
									class41_sub1_sub1_31.aClass385_10086.copy(class48_27.aClass385_459);
									class41_sub1_sub1_31.aClass303_10107.copy(class48_27.aClass303_460);
									class41_sub1_sub1_31.aClass385_10109.copy(class48_27.aClass385_457);
									class41_sub1_sub1_31.method15520(-648647139);
								} else {
									class48_27.method965(0);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass505_Sub2_8528.aBool8779) {
									class48_27.method950();
								} else {
									class48_27.method965(0);
								}
								break;
							case 6:
								class48_27.method946(!Class282_Sub41.method13367(b_29, (short) 8402));
								break;
							case 7:
								class48_27.aClass385_455.set(this.aClass505_Sub2_8528.aClass384_8814.buf[12], this.aClass505_Sub2_8528.aClass384_8814.buf[13], this.aClass505_Sub2_8528.aClass384_8814.buf[14]);
								class48_27.aClass384_465.identity();
								class48_27.anInterface31_451 = this.aClass505_Sub2_8528.method13965();
								class48_27.method949(0);
							}

							i_18 += class282_sub6_20.anInt7514;
						}
					}
				}
			}

			if (this.aClass74_8545 != null) {
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method14161(1, this.anInterface4_8557);
				this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
				Matrix44Arr matrix44arr_28 = this.aClass505_Sub2_8528.aClass384_8683;
				matrix44arr_28.identity();
				matrix44arr_28.buf[13] = -1.0F;
				class48_27.method957(matrix44arr_28);
				this.aClass74_8545.method1314(class48_27, i_1, i_2, i_3, bools_4, bool_5);
			}
		}

	}

	public void NA(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1315(class282_sub50_sub17_1, i_7, i_8);
		}

	}

	public void method6711(Class282_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass473_8546.insertBack(new Class282_Sub8(this.aClass505_Sub2_8528, this, class282_sub24_1, ints_2));
	}

	public void d(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1315(class282_sub50_sub17_1, i_7, i_8);
		}

	}

	public void m(int i_1, int i_2, int i_3) {
		if ((this.aByteArrayArray8553[i_1][i_2] & 0xff) < i_3) {
			this.aByteArrayArray8553[i_1][i_2] = (byte) i_3;
		}

	}

	public void method6714(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, Class90 class90_14, boolean bool_15) {
		int i_16 = ints_10.length;
		int[] ints_17 = new int[i_16 * 3];
		int[] ints_18 = new int[i_16 * 3];
		int[] ints_19 = new int[i_16 * 3];
		int[] ints_20 = new int[i_16 * 3];
		int[] ints_21 = new int[i_16 * 3];
		int[] ints_22 = new int[i_16 * 3];
		int[] ints_23 = ints_4 != null ? new int[i_16 * 3] : null;
		int[] ints_24 = ints_6 != null ? new int[i_16 * 3] : null;
		int i_25 = 0;

		for (int i_26 = 0; i_26 < i_16; i_26++) {
			int i_27 = ints_7[i_26];
			int i_28 = ints_8[i_26];
			int i_29 = ints_9[i_26];
			ints_17[i_25] = ints_3[i_27];
			ints_18[i_25] = ints_5[i_27];
			ints_19[i_25] = ints_10[i_26];
			ints_21[i_25] = ints_12[i_26];
			ints_22[i_25] = ints_13[i_26];
			ints_20[i_25] = ints_11 != null ? ints_11[i_26] : ints_10[i_26];
			if (ints_4 != null) {
				ints_23[i_25] = ints_4[i_27];
			}

			if (ints_6 != null) {
				ints_24[i_25] = ints_6[i_27];
			}

			++i_25;
			ints_17[i_25] = ints_3[i_28];
			ints_18[i_25] = ints_5[i_28];
			ints_19[i_25] = ints_10[i_26];
			ints_21[i_25] = ints_12[i_26];
			ints_22[i_25] = ints_13[i_26];
			ints_20[i_25] = ints_11 != null ? ints_11[i_26] : ints_10[i_26];
			if (ints_4 != null) {
				ints_23[i_25] = ints_4[i_28];
			}

			if (ints_6 != null) {
				ints_24[i_25] = ints_6[i_28];
			}

			++i_25;
			ints_17[i_25] = ints_3[i_29];
			ints_18[i_25] = ints_5[i_29];
			ints_19[i_25] = ints_10[i_26];
			ints_21[i_25] = ints_12[i_26];
			ints_22[i_25] = ints_13[i_26];
			ints_20[i_25] = ints_11 != null ? ints_11[i_26] : ints_10[i_26];
			if (ints_4 != null) {
				ints_23[i_25] = ints_4[i_29];
			}

			if (ints_6 != null) {
				ints_24[i_25] = ints_6[i_29];
			}

			++i_25;
		}

		this.method6707(i_1, i_2, ints_17, ints_23, ints_18, ints_24, ints_19, ints_20, ints_21, ints_22, class90_14, bool_15);
	}

	public void method6706(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, Class90 class90_11, boolean bool_12) {
		Interface22 interface22_13 = this.aClass505_Sub2_8528.anInterface22_5834;
		if (ints_6 != null && this.anIntArrayArrayArray8543 == null) {
			this.anIntArrayArrayArray8543 = new int[this.width][this.length][];
		}

		if (ints_4 != null && this.anIntArrayArrayArray8532 == null) {
			this.anIntArrayArrayArray8532 = new int[this.width][this.length][];
		}

		this.anIntArrayArrayArray8540[i_1][i_2] = ints_3;
		this.anIntArrayArrayArray8533[i_1][i_2] = ints_5;
		this.anIntArrayArrayArray8538[i_1][i_2] = ints_7;
		this.anIntArrayArrayArray8556[i_1][i_2] = ints_8;
		if (this.anIntArrayArrayArray8543 != null) {
			this.anIntArrayArrayArray8543[i_1][i_2] = ints_6;
		}

		if (this.anIntArrayArrayArray8532 != null) {
			this.anIntArrayArrayArray8532[i_1][i_2] = ints_4;
		}

		Class282_Sub6[] arr_14 = this.aClass282_Sub6ArrayArrayArray8541[i_1][i_2] = new Class282_Sub6[ints_7.length];

		for (int i_15 = 0; i_15 < ints_7.length; i_15++) {
			int i_16 = ints_9[i_15];
			int i_17 = ints_10[i_15];
			if ((this.flags & 0x20) != 0 && i_16 != -1 && interface22_13.method144(i_16, -2017855605).isGroundMesh) {
				i_17 = 128;
				i_16 = -1;
			}

			long long_18 = (long) (class90_11.intensity) << 48 | (long) (class90_11.scale) << 42 | (long) (class90_11.color) << 28 | (long) (i_17 << 14) | (long) i_16;

			Node node_20;
			for (node_20 = this.aClass453_8537.method7530(long_18); node_20 != null; node_20 = this.aClass453_8537.method7544(2090773608)) {
				Class282_Sub6 class282_sub6_21 = (Class282_Sub6) node_20;
				if (class282_sub6_21.anInt7510 == i_16 && class282_sub6_21.aFloat7511 == (float) i_17 && class282_sub6_21.aClass90_7512.method1506(class90_11, 224170917)) {
					break;
				}
			}

			if (node_20 == null) {
				arr_14[i_15] = new Class282_Sub6(this, i_16, i_17, class90_11);
				this.aClass453_8537.method7534(arr_14[i_15], long_18);
			} else {
				arr_14[i_15] = (Class282_Sub6) node_20;
			}
		}

		if (bool_12) {
			this.aByteArrayArray8531[i_1][i_2] = (byte) (this.aByteArrayArray8531[i_1][i_2] | 0x1);
		}

		if (ints_7.length > this.anInt8552) {
			this.anInt8552 = ints_7.length;
		}

		this.anInt8542 += ints_7.length;
	}

	public void p() {
		if (this.anInt8542 > 0) {
			byte[][] bytes_1 = new byte[this.width + 1][this.length + 1];

			int i_3;
			for (int i_2 = 1; i_2 < this.width; i_2++) {
				for (i_3 = 1; i_3 < this.length; i_3++) {
					bytes_1[i_2][i_3] = (byte) ((this.aByteArrayArray8553[i_2 - 1][i_3] >> 2) + (this.aByteArrayArray8553[i_2 + 1][i_3] >> 3) + (this.aByteArrayArray8553[i_2][i_3 - 1] >> 2) + (this.aByteArrayArray8553[i_2][i_3 + 1] >> 3) + (this.aByteArrayArray8553[i_2][i_3] >> 1));
				}
			}

			Node[] arr_67 = new Node[this.aClass453_8537.method7540()];
			this.aClass453_8537.method7532(arr_67, (byte) 122);

			for (i_3 = 0; i_3 < arr_67.length; i_3++) {
				((Class282_Sub6) arr_67[i_3]).method12150(this.anInt8542);
			}

			i_3 = 20;
			if (this.anIntArrayArrayArray8543 != null) {
				i_3 += 4;
			}

			if ((this.flags & 0x7) != 0) {
				i_3 += 12;
			}

			NativeHeapBuffer nativeheapbuffer_4 = this.aClass505_Sub2_8528.aNativeHeap8699.method759(this.anInt8542 * 4, false);
			NativeHeapBuffer nativeheapbuffer_5 = this.aClass505_Sub2_8528.aNativeHeap8699.method759(this.anInt8542 * i_3, false);
			Stream stream_6 = new Stream(nativeheapbuffer_5);
			Stream stream_7 = new Stream(nativeheapbuffer_4);
			Class282_Sub6[] arr_8 = new Class282_Sub6[this.anInt8542];
			int i_9 = Class51.method1072(this.anInt8542 / 4, 2136936903);
			if (i_9 < 1) {
				i_9 = 1;
			}

			HashTable class453_10 = new HashTable(i_9);
			Class282_Sub6[] arr_11 = new Class282_Sub6[this.anInt8552];

			int i_12;
			int i_13;
			for (i_12 = 0; i_12 < this.width; i_12++) {
				for (i_13 = 0; i_13 < this.length; i_13++) {
					if (this.anIntArrayArrayArray8538[i_12][i_13] != null) {
						Class282_Sub6[] arr_14 = this.aClass282_Sub6ArrayArrayArray8541[i_12][i_13];
						int[] ints_70 = this.anIntArrayArrayArray8540[i_12][i_13];
						int[] ints_71 = this.anIntArrayArrayArray8533[i_12][i_13];
						int[] ints_17 = this.anIntArrayArrayArray8556[i_12][i_13];
						int[] ints_18 = this.anIntArrayArrayArray8538[i_12][i_13];
						int[] ints_19 = this.anIntArrayArrayArray8532 != null ? this.anIntArrayArrayArray8532[i_12][i_13] : null;
						int[] ints_20 = this.anIntArrayArrayArray8543 != null ? this.anIntArrayArrayArray8543[i_12][i_13] : null;
						if (ints_17 == null) {
							ints_17 = ints_18;
						}

						float f_21 = this.aFloatArrayArray8554[i_12][i_13];
						float f_22 = this.aFloatArrayArray8551[i_12][i_13];
						float f_23 = this.aFloatArrayArray8549[i_12][i_13];
						float f_24 = this.aFloatArrayArray8554[i_12][i_13 + 1];
						float f_25 = this.aFloatArrayArray8551[i_12][i_13 + 1];
						float f_26 = this.aFloatArrayArray8549[i_12][i_13 + 1];
						float f_27 = this.aFloatArrayArray8554[i_12 + 1][i_13 + 1];
						float f_28 = this.aFloatArrayArray8551[i_12 + 1][i_13 + 1];
						float f_29 = this.aFloatArrayArray8549[i_12 + 1][i_13 + 1];
						float f_30 = this.aFloatArrayArray8554[i_12 + 1][i_13];
						float f_31 = this.aFloatArrayArray8551[i_12 + 1][i_13];
						float f_32 = this.aFloatArrayArray8549[i_12 + 1][i_13];
						int i_33 = bytes_1[i_12][i_13] & 0xff;
						int i_34 = bytes_1[i_12][i_13 + 1] & 0xff;
						int i_35 = bytes_1[i_12 + 1][i_13 + 1] & 0xff;
						int i_36 = bytes_1[i_12 + 1][i_13] & 0xff;
						int i_37 = 0;

						int i_40;
						label459: for (int i_38 = 0; i_38 < ints_18.length; i_38++) {
							Class282_Sub6 class282_sub6_73 = arr_14[i_38];

							for (i_40 = 0; i_40 < i_37; i_40++) {
								if (arr_11[i_40] == class282_sub6_73) {
									continue label459;
								}
							}

							arr_11[i_37++] = class282_sub6_73;
						}

						short[] shorts_72 = this.aShortArrayArray8534[i_13 * this.width + i_12] = new short[ints_18.length];

						for (int i_39 = 0; i_39 < ints_18.length; i_39++) {
							i_40 = (i_12 << this.tileScale) + ints_70[i_39];
							int i_41 = (i_13 << this.tileScale) + ints_71[i_39];
							int i_42 = i_40 >> this.anInt8536;
							int i_43 = i_41 >> this.anInt8536;
							int i_44 = ints_18[i_39];
							int i_45 = ints_17[i_39];
							int i_46 = ints_19 != null ? ints_19[i_39] : 0;
							long long_47 = (long) i_45 << 48 | (long) i_44 << 32 | (long) (i_42 << 16) | (long) i_43;
							int i_49 = ints_70[i_39];
							int i_50 = ints_71[i_39];
							byte b_51 = 74;
							int i_52 = 0;
							float f_53 = 1.0F;
							float f_54;
							float f_55;
							float f_56;
							float f_61;
							int i_84;
							if (i_49 == 0 && i_50 == 0) {
								f_54 = f_21;
								f_55 = f_22;
								f_56 = f_23;
								i_84 = b_51 - i_33;
							} else if (i_49 == 0 && i_50 == this.tileUnits) {
								f_54 = f_24;
								f_55 = f_25;
								f_56 = f_26;
								i_84 = b_51 - i_34;
							} else if (i_49 == this.tileUnits && i_50 == this.tileUnits) {
								f_54 = f_27;
								f_55 = f_28;
								f_56 = f_29;
								i_84 = b_51 - i_35;
							} else if (i_49 == this.tileUnits && i_50 == 0) {
								f_54 = f_30;
								f_55 = f_31;
								f_56 = f_32;
								i_84 = b_51 - i_36;
							} else {
								float f_57 = (float) i_49 / (float) (this.tileUnits);
								float f_58 = (float) i_50 / (float) (this.tileUnits);
								float f_59 = f_21 + (f_30 - f_21) * f_57;
								float f_60 = f_22 + (f_31 - f_22) * f_57;
								f_61 = f_23 + (f_32 - f_23) * f_57;
								float f_62 = f_24 + (f_27 - f_24) * f_57;
								float f_63 = f_25 + (f_28 - f_25) * f_57;
								float f_64 = f_26 + (f_29 - f_26) * f_57;
								f_54 = f_59 + (f_62 - f_59) * f_58;
								f_55 = f_60 + (f_63 - f_60) * f_58;
								f_56 = f_61 + (f_64 - f_61) * f_58;
								int i_65 = i_33 + ((i_36 - i_33) * i_49 >> this.tileScale);
								int i_66 = i_34 + ((i_35 - i_34) * i_49 >> this.tileScale);
								i_84 = b_51 - (i_65 + ((i_66 - i_65) * i_50 >> this.tileScale));
							}

							if (i_44 != -1) {
								int i_85 = (i_44 & 0x7f) * i_84 >> 7;
								if (i_85 < 2) {
									i_85 = 2;
								} else if (i_85 > 126) {
									i_85 = 126;
								}

								i_52 = Class540.anIntArray7136[i_44 & 0xff80 | i_85];
								if ((this.flags & 0x7) == 0) {
									f_53 = this.aClass505_Sub2_8528.aFloatArray8747[0] * f_54 + this.aClass505_Sub2_8528.aFloatArray8747[1] * f_55 + this.aClass505_Sub2_8528.aFloatArray8747[2] * f_56;
									f_53 = this.aClass505_Sub2_8528.aFloat8769 + f_53 * (f_53 > 0.0F ? this.aClass505_Sub2_8528.aFloat8770 : this.aClass505_Sub2_8528.aFloat8826);
								}
							}

							Node node_80 = null;
							if ((i_40 & this.anInt8529 - 1) == 0 && (i_41 & this.anInt8529 - 1) == 0) {
								node_80 = class453_10.method7530(long_47);
							}

							int i_86;
							int i_87;
							if (node_80 == null) {
								if (i_45 != i_44) {
									int i_88 = (i_45 & 0x7f) * i_84 >> 7;
									if (i_88 < 2) {
										i_88 = 2;
									} else if (i_88 > 126) {
										i_88 = 126;
									}

									i_87 = Class540.anIntArray7136[i_45 & 0xff80 | i_88];
									if ((this.flags & 0x7) == 0) {
										float f_10000 = this.aClass505_Sub2_8528.aFloatArray8747[0] * f_54 + this.aClass505_Sub2_8528.aFloatArray8747[1] * f_55 + this.aClass505_Sub2_8528.aFloatArray8747[2] * f_56;
										f_61 = this.aClass505_Sub2_8528.aFloat8769 + f_53 * (f_53 > 0.0F ? this.aClass505_Sub2_8528.aFloat8770 : this.aClass505_Sub2_8528.aFloat8826);
										int i_89 = i_87 >> 16 & 0xff;
										int i_90 = i_87 >> 8 & 0xff;
										int i_91 = i_87 & 0xff;
										i_89 = (int) ((float) i_89 * f_61);
										if (i_89 < 0) {
											i_89 = 0;
										} else if (i_89 > 255) {
											i_89 = 255;
										}

										i_90 = (int) ((float) i_90 * f_61);
										if (i_90 < 0) {
											i_90 = 0;
										} else if (i_90 > 255) {
											i_90 = 255;
										}

										i_91 = (int) ((float) i_91 * f_61);
										if (i_91 < 0) {
											i_91 = 0;
										} else if (i_91 > 255) {
											i_91 = 255;
										}

										i_87 = i_89 << 16 | i_90 << 8 | i_91;
									}
								} else {
									i_87 = i_52;
								}

								if (Stream.method2926()) {
									stream_6.method2923((float) i_40);
									stream_6.method2923((float) (this.averageHeight(i_40, i_41, 1763341485) + i_46));
									stream_6.method2923((float) i_41);
									stream_6.method2923((float) i_40);
									stream_6.method2923((float) i_41);
									if (this.anIntArrayArrayArray8543 != null) {
										stream_6.method2923(ints_20 != null ? (float) (ints_20[i_39] - 1) : 0.0F);
									}

									if ((this.flags & 0x7) != 0) {
										stream_6.method2923(f_54);
										stream_6.method2923(f_55);
										stream_6.method2923(f_56);
									}
								} else {
									stream_6.method2924((float) i_40);
									stream_6.method2924((float) (this.averageHeight(i_40, i_41, 763165425) + i_46));
									stream_6.method2924((float) i_41);
									stream_6.method2924((float) i_40);
									stream_6.method2924((float) i_41);
									if (this.anIntArrayArrayArray8543 != null) {
										stream_6.method2924(ints_20 != null ? (float) (ints_20[i_39] - 1) : 0.0F);
									}

									if ((this.flags & 0x7) != 0) {
										stream_6.method2924(f_54);
										stream_6.method2924(f_55);
										stream_6.method2924(f_56);
									}
								}

								if (this.aClass505_Sub2_8528.anInt8824 == 0) {
									stream_7.method2921(~0xffffff | i_87);
								} else {
									stream_7.method2922(~0xffffff | i_87);
								}

								i_86 = this.anInt8525++;
								shorts_72[i_39] = (short) i_86;
								if (i_44 != -1) {
									arr_8[i_86] = arr_14[i_39];
								}

								class453_10.method7534(new Class282_Sub46(shorts_72[i_39]), long_47);
							} else {
								shorts_72[i_39] = ((Class282_Sub46) node_80).aShort8067;
								i_86 = shorts_72[i_39] & 0xffff;
								if (i_44 != -1 && arr_14[i_39].data < arr_8[i_86].data) {
									arr_8[i_86] = arr_14[i_39];
								}
							}

							for (i_87 = 0; i_87 < i_37; i_87++) {
								arr_11[i_87].method12145(i_86, i_52, i_84, f_53);
							}

							++this.anInt8527;
						}
					}
				}
			}

			for (i_12 = 0; i_12 < this.anInt8525; i_12++) {
				Class282_Sub6 class282_sub6_68 = arr_8[i_12];
				if (class282_sub6_68 != null) {
					class282_sub6_68.method12143(i_12);
				}
			}

			for (i_12 = 0; i_12 < this.width; i_12++) {
				for (i_13 = 0; i_13 < this.length; i_13++) {
					short[] shorts_81 = this.aShortArrayArray8534[i_13 * this.width + i_12];
					if (shorts_81 != null) {
						int i_15 = 0;

						for (int i_16 = 0; i_16 < shorts_81.length; i_15++) {
							int i_74 = shorts_81[i_16++] & 0xffff;
							int i_75 = shorts_81[i_16++] & 0xffff;
							int i_76 = shorts_81[i_16++] & 0xffff;
							Class282_Sub6 class282_sub6_83 = arr_8[i_74];
							Class282_Sub6 class282_sub6_77 = arr_8[i_75];
							Class282_Sub6 class282_sub6_78 = arr_8[i_76];
							Class282_Sub6 class282_sub6_79 = null;
							if (class282_sub6_83 != null) {
								class282_sub6_83.method12152(i_12, i_13, i_15);
								class282_sub6_79 = class282_sub6_83;
							}

							if (class282_sub6_77 != null) {
								class282_sub6_77.method12152(i_12, i_13, i_15);
								if (class282_sub6_79 == null || class282_sub6_77.data < class282_sub6_79.data) {
									class282_sub6_79 = class282_sub6_77;
								}
							}

							if (class282_sub6_78 != null) {
								class282_sub6_78.method12152(i_12, i_13, i_15);
								if (class282_sub6_79 == null || class282_sub6_78.data < class282_sub6_79.data) {
									class282_sub6_79 = class282_sub6_78;
								}
							}

							if (class282_sub6_79 != null) {
								if (class282_sub6_83 != null) {
									class282_sub6_79.method12143(i_74);
								}

								if (class282_sub6_77 != null) {
									class282_sub6_79.method12143(i_75);
								}

								if (class282_sub6_78 != null) {
									class282_sub6_79.method12143(i_76);
								}

								class282_sub6_79.method12152(i_12, i_13, i_15);
							}
						}
					}
				}
			}

			stream_6.method2925();
			stream_7.method2925();
			this.anInterface4_8557 = this.aClass505_Sub2_8528.method13994(false);
			this.anInterface4_8557.method27(this.anInt8525 * 4, 4, nativeheapbuffer_4);
			this.anInterface4_8548 = this.aClass505_Sub2_8528.method13994(false);
			this.anInterface4_8548.method27(this.anInt8525 * i_3, i_3, nativeheapbuffer_5);
			if ((this.flags & 0x7) != 0) {
				if (this.anIntArrayArrayArray8543 != null) {
					this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) });
				} else {
					this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) });
				}
			} else if (this.anIntArrayArrayArray8543 != null) {
				this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691 }), new Class72(Class69.aClass69_690) });
			} else {
				this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }), new Class72(Class69.aClass69_690) });
			}

			i_12 = 0;

			for (i_13 = 0; i_13 < arr_67.length; i_13++) {
				Class282_Sub6 class282_sub6_82 = (Class282_Sub6) arr_67[i_13];
				if (class282_sub6_82.anInt7508 > 0) {
					arr_67[i_12++] = class282_sub6_82;
				}
			}

			this.aClass282Array8547 = new Node[i_12];
			long[] longs_92 = new long[i_12];

			for (int i_69 = 0; i_69 < i_12; i_69++) {
				Class282_Sub6 class282_sub6_93 = (Class282_Sub6) arr_67[i_69];
				longs_92[i_69] = class282_sub6_93.data;
				this.aClass282Array8547[i_69] = class282_sub6_93;
				class282_sub6_93.method12146(this.anInt8525);
			}

			Class214.method3669(longs_92, this.aClass282Array8547, 1515187812);
			if (this.aClass74_8545 != null) {
				this.aClass74_8545.method1312();
			}
		} else {
			this.aClass74_8545 = null;
		}

		if ((this.anInt8530 & 0x2) == 0) {
			this.anIntArrayArrayArray8533 = null;
			this.anIntArrayArrayArray8540 = null;
			this.anIntArrayArrayArray8538 = null;
		}

		this.anIntArrayArrayArray8543 = null;
		this.anIntArrayArrayArray8556 = null;
		this.anIntArrayArrayArray8532 = null;
		this.aClass282_Sub6ArrayArrayArray8541 = null;
		this.aByteArrayArray8553 = null;
		this.aClass453_8537 = null;
		this.aFloatArrayArray8549 = null;
		this.aFloatArrayArray8551 = null;
		this.aFloatArrayArray8554 = null;
	}

	public void e() {
		if (this.anInt8542 > 0) {
			byte[][] bytes_1 = new byte[this.width + 1][this.length + 1];

			int i_3;
			for (int i_2 = 1; i_2 < this.width; i_2++) {
				for (i_3 = 1; i_3 < this.length; i_3++) {
					bytes_1[i_2][i_3] = (byte) ((this.aByteArrayArray8553[i_2 - 1][i_3] >> 2) + (this.aByteArrayArray8553[i_2 + 1][i_3] >> 3) + (this.aByteArrayArray8553[i_2][i_3 - 1] >> 2) + (this.aByteArrayArray8553[i_2][i_3 + 1] >> 3) + (this.aByteArrayArray8553[i_2][i_3] >> 1));
				}
			}

			Node[] arr_67 = new Node[this.aClass453_8537.method7540()];
			this.aClass453_8537.method7532(arr_67, (byte) 32);

			for (i_3 = 0; i_3 < arr_67.length; i_3++) {
				((Class282_Sub6) arr_67[i_3]).method12150(this.anInt8542);
			}

			i_3 = 20;
			if (this.anIntArrayArrayArray8543 != null) {
				i_3 += 4;
			}

			if ((this.flags & 0x7) != 0) {
				i_3 += 12;
			}

			NativeHeapBuffer nativeheapbuffer_4 = this.aClass505_Sub2_8528.aNativeHeap8699.method759(this.anInt8542 * 4, false);
			NativeHeapBuffer nativeheapbuffer_5 = this.aClass505_Sub2_8528.aNativeHeap8699.method759(this.anInt8542 * i_3, false);
			Stream stream_6 = new Stream(nativeheapbuffer_5);
			Stream stream_7 = new Stream(nativeheapbuffer_4);
			Class282_Sub6[] arr_8 = new Class282_Sub6[this.anInt8542];
			int i_9 = Class51.method1072(this.anInt8542 / 4, 1403155536);
			if (i_9 < 1) {
				i_9 = 1;
			}

			HashTable class453_10 = new HashTable(i_9);
			Class282_Sub6[] arr_11 = new Class282_Sub6[this.anInt8552];

			int i_12;
			int i_13;
			for (i_12 = 0; i_12 < this.width; i_12++) {
				for (i_13 = 0; i_13 < this.length; i_13++) {
					if (this.anIntArrayArrayArray8538[i_12][i_13] != null) {
						Class282_Sub6[] arr_14 = this.aClass282_Sub6ArrayArrayArray8541[i_12][i_13];
						int[] ints_70 = this.anIntArrayArrayArray8540[i_12][i_13];
						int[] ints_71 = this.anIntArrayArrayArray8533[i_12][i_13];
						int[] ints_17 = this.anIntArrayArrayArray8556[i_12][i_13];
						int[] ints_18 = this.anIntArrayArrayArray8538[i_12][i_13];
						int[] ints_19 = this.anIntArrayArrayArray8532 != null ? this.anIntArrayArrayArray8532[i_12][i_13] : null;
						int[] ints_20 = this.anIntArrayArrayArray8543 != null ? this.anIntArrayArrayArray8543[i_12][i_13] : null;
						if (ints_17 == null) {
							ints_17 = ints_18;
						}

						float f_21 = this.aFloatArrayArray8554[i_12][i_13];
						float f_22 = this.aFloatArrayArray8551[i_12][i_13];
						float f_23 = this.aFloatArrayArray8549[i_12][i_13];
						float f_24 = this.aFloatArrayArray8554[i_12][i_13 + 1];
						float f_25 = this.aFloatArrayArray8551[i_12][i_13 + 1];
						float f_26 = this.aFloatArrayArray8549[i_12][i_13 + 1];
						float f_27 = this.aFloatArrayArray8554[i_12 + 1][i_13 + 1];
						float f_28 = this.aFloatArrayArray8551[i_12 + 1][i_13 + 1];
						float f_29 = this.aFloatArrayArray8549[i_12 + 1][i_13 + 1];
						float f_30 = this.aFloatArrayArray8554[i_12 + 1][i_13];
						float f_31 = this.aFloatArrayArray8551[i_12 + 1][i_13];
						float f_32 = this.aFloatArrayArray8549[i_12 + 1][i_13];
						int i_33 = bytes_1[i_12][i_13] & 0xff;
						int i_34 = bytes_1[i_12][i_13 + 1] & 0xff;
						int i_35 = bytes_1[i_12 + 1][i_13 + 1] & 0xff;
						int i_36 = bytes_1[i_12 + 1][i_13] & 0xff;
						int i_37 = 0;

						int i_40;
						label459: for (int i_38 = 0; i_38 < ints_18.length; i_38++) {
							Class282_Sub6 class282_sub6_73 = arr_14[i_38];

							for (i_40 = 0; i_40 < i_37; i_40++) {
								if (arr_11[i_40] == class282_sub6_73) {
									continue label459;
								}
							}

							arr_11[i_37++] = class282_sub6_73;
						}

						short[] shorts_72 = this.aShortArrayArray8534[i_13 * this.width + i_12] = new short[ints_18.length];

						for (int i_39 = 0; i_39 < ints_18.length; i_39++) {
							i_40 = (i_12 << this.tileScale) + ints_70[i_39];
							int i_41 = (i_13 << this.tileScale) + ints_71[i_39];
							int i_42 = i_40 >> this.anInt8536;
							int i_43 = i_41 >> this.anInt8536;
							int i_44 = ints_18[i_39];
							int i_45 = ints_17[i_39];
							int i_46 = ints_19 != null ? ints_19[i_39] : 0;
							long long_47 = (long) i_45 << 48 | (long) i_44 << 32 | (long) (i_42 << 16) | (long) i_43;
							int i_49 = ints_70[i_39];
							int i_50 = ints_71[i_39];
							byte b_51 = 74;
							int i_52 = 0;
							float f_53 = 1.0F;
							float f_54;
							float f_55;
							float f_56;
							float f_61;
							int i_84;
							if (i_49 == 0 && i_50 == 0) {
								f_54 = f_21;
								f_55 = f_22;
								f_56 = f_23;
								i_84 = b_51 - i_33;
							} else if (i_49 == 0 && i_50 == this.tileUnits) {
								f_54 = f_24;
								f_55 = f_25;
								f_56 = f_26;
								i_84 = b_51 - i_34;
							} else if (i_49 == this.tileUnits && i_50 == this.tileUnits) {
								f_54 = f_27;
								f_55 = f_28;
								f_56 = f_29;
								i_84 = b_51 - i_35;
							} else if (i_49 == this.tileUnits && i_50 == 0) {
								f_54 = f_30;
								f_55 = f_31;
								f_56 = f_32;
								i_84 = b_51 - i_36;
							} else {
								float f_57 = (float) i_49 / (float) (this.tileUnits);
								float f_58 = (float) i_50 / (float) (this.tileUnits);
								float f_59 = f_21 + (f_30 - f_21) * f_57;
								float f_60 = f_22 + (f_31 - f_22) * f_57;
								f_61 = f_23 + (f_32 - f_23) * f_57;
								float f_62 = f_24 + (f_27 - f_24) * f_57;
								float f_63 = f_25 + (f_28 - f_25) * f_57;
								float f_64 = f_26 + (f_29 - f_26) * f_57;
								f_54 = f_59 + (f_62 - f_59) * f_58;
								f_55 = f_60 + (f_63 - f_60) * f_58;
								f_56 = f_61 + (f_64 - f_61) * f_58;
								int i_65 = i_33 + ((i_36 - i_33) * i_49 >> this.tileScale);
								int i_66 = i_34 + ((i_35 - i_34) * i_49 >> this.tileScale);
								i_84 = b_51 - (i_65 + ((i_66 - i_65) * i_50 >> this.tileScale));
							}

							if (i_44 != -1) {
								int i_85 = (i_44 & 0x7f) * i_84 >> 7;
								if (i_85 < 2) {
									i_85 = 2;
								} else if (i_85 > 126) {
									i_85 = 126;
								}

								i_52 = Class540.anIntArray7136[i_44 & 0xff80 | i_85];
								if ((this.flags & 0x7) == 0) {
									f_53 = this.aClass505_Sub2_8528.aFloatArray8747[0] * f_54 + this.aClass505_Sub2_8528.aFloatArray8747[1] * f_55 + this.aClass505_Sub2_8528.aFloatArray8747[2] * f_56;
									f_53 = this.aClass505_Sub2_8528.aFloat8769 + f_53 * (f_53 > 0.0F ? this.aClass505_Sub2_8528.aFloat8770 : this.aClass505_Sub2_8528.aFloat8826);
								}
							}

							Node node_80 = null;
							if ((i_40 & this.anInt8529 - 1) == 0 && (i_41 & this.anInt8529 - 1) == 0) {
								node_80 = class453_10.method7530(long_47);
							}

							int i_86;
							int i_87;
							if (node_80 == null) {
								if (i_45 != i_44) {
									int i_88 = (i_45 & 0x7f) * i_84 >> 7;
									if (i_88 < 2) {
										i_88 = 2;
									} else if (i_88 > 126) {
										i_88 = 126;
									}

									i_87 = Class540.anIntArray7136[i_45 & 0xff80 | i_88];
									if ((this.flags & 0x7) == 0) {
										float f_10000 = this.aClass505_Sub2_8528.aFloatArray8747[0] * f_54 + this.aClass505_Sub2_8528.aFloatArray8747[1] * f_55 + this.aClass505_Sub2_8528.aFloatArray8747[2] * f_56;
										f_61 = this.aClass505_Sub2_8528.aFloat8769 + f_53 * (f_53 > 0.0F ? this.aClass505_Sub2_8528.aFloat8770 : this.aClass505_Sub2_8528.aFloat8826);
										int i_89 = i_87 >> 16 & 0xff;
										int i_90 = i_87 >> 8 & 0xff;
										int i_91 = i_87 & 0xff;
										i_89 = (int) ((float) i_89 * f_61);
										if (i_89 < 0) {
											i_89 = 0;
										} else if (i_89 > 255) {
											i_89 = 255;
										}

										i_90 = (int) ((float) i_90 * f_61);
										if (i_90 < 0) {
											i_90 = 0;
										} else if (i_90 > 255) {
											i_90 = 255;
										}

										i_91 = (int) ((float) i_91 * f_61);
										if (i_91 < 0) {
											i_91 = 0;
										} else if (i_91 > 255) {
											i_91 = 255;
										}

										i_87 = i_89 << 16 | i_90 << 8 | i_91;
									}
								} else {
									i_87 = i_52;
								}

								if (Stream.method2926()) {
									stream_6.method2923((float) i_40);
									stream_6.method2923((float) (this.averageHeight(i_40, i_41, -1027450257) + i_46));
									stream_6.method2923((float) i_41);
									stream_6.method2923((float) i_40);
									stream_6.method2923((float) i_41);
									if (this.anIntArrayArrayArray8543 != null) {
										stream_6.method2923(ints_20 != null ? (float) (ints_20[i_39] - 1) : 0.0F);
									}

									if ((this.flags & 0x7) != 0) {
										stream_6.method2923(f_54);
										stream_6.method2923(f_55);
										stream_6.method2923(f_56);
									}
								} else {
									stream_6.method2924((float) i_40);
									stream_6.method2924((float) (this.averageHeight(i_40, i_41, -2114498022) + i_46));
									stream_6.method2924((float) i_41);
									stream_6.method2924((float) i_40);
									stream_6.method2924((float) i_41);
									if (this.anIntArrayArrayArray8543 != null) {
										stream_6.method2924(ints_20 != null ? (float) (ints_20[i_39] - 1) : 0.0F);
									}

									if ((this.flags & 0x7) != 0) {
										stream_6.method2924(f_54);
										stream_6.method2924(f_55);
										stream_6.method2924(f_56);
									}
								}

								if (this.aClass505_Sub2_8528.anInt8824 == 0) {
									stream_7.method2921(~0xffffff | i_87);
								} else {
									stream_7.method2922(~0xffffff | i_87);
								}

								i_86 = this.anInt8525++;
								shorts_72[i_39] = (short) i_86;
								if (i_44 != -1) {
									arr_8[i_86] = arr_14[i_39];
								}

								class453_10.method7534(new Class282_Sub46(shorts_72[i_39]), long_47);
							} else {
								shorts_72[i_39] = ((Class282_Sub46) node_80).aShort8067;
								i_86 = shorts_72[i_39] & 0xffff;
								if (i_44 != -1 && arr_14[i_39].data < arr_8[i_86].data) {
									arr_8[i_86] = arr_14[i_39];
								}
							}

							for (i_87 = 0; i_87 < i_37; i_87++) {
								arr_11[i_87].method12145(i_86, i_52, i_84, f_53);
							}

							++this.anInt8527;
						}
					}
				}
			}

			for (i_12 = 0; i_12 < this.anInt8525; i_12++) {
				Class282_Sub6 class282_sub6_68 = arr_8[i_12];
				if (class282_sub6_68 != null) {
					class282_sub6_68.method12143(i_12);
				}
			}

			for (i_12 = 0; i_12 < this.width; i_12++) {
				for (i_13 = 0; i_13 < this.length; i_13++) {
					short[] shorts_81 = this.aShortArrayArray8534[i_13 * this.width + i_12];
					if (shorts_81 != null) {
						int i_15 = 0;

						for (int i_16 = 0; i_16 < shorts_81.length; i_15++) {
							int i_74 = shorts_81[i_16++] & 0xffff;
							int i_75 = shorts_81[i_16++] & 0xffff;
							int i_76 = shorts_81[i_16++] & 0xffff;
							Class282_Sub6 class282_sub6_83 = arr_8[i_74];
							Class282_Sub6 class282_sub6_77 = arr_8[i_75];
							Class282_Sub6 class282_sub6_78 = arr_8[i_76];
							Class282_Sub6 class282_sub6_79 = null;
							if (class282_sub6_83 != null) {
								class282_sub6_83.method12152(i_12, i_13, i_15);
								class282_sub6_79 = class282_sub6_83;
							}

							if (class282_sub6_77 != null) {
								class282_sub6_77.method12152(i_12, i_13, i_15);
								if (class282_sub6_79 == null || class282_sub6_77.data < class282_sub6_79.data) {
									class282_sub6_79 = class282_sub6_77;
								}
							}

							if (class282_sub6_78 != null) {
								class282_sub6_78.method12152(i_12, i_13, i_15);
								if (class282_sub6_79 == null || class282_sub6_78.data < class282_sub6_79.data) {
									class282_sub6_79 = class282_sub6_78;
								}
							}

							if (class282_sub6_79 != null) {
								if (class282_sub6_83 != null) {
									class282_sub6_79.method12143(i_74);
								}

								if (class282_sub6_77 != null) {
									class282_sub6_79.method12143(i_75);
								}

								if (class282_sub6_78 != null) {
									class282_sub6_79.method12143(i_76);
								}

								class282_sub6_79.method12152(i_12, i_13, i_15);
							}
						}
					}
				}
			}

			stream_6.method2925();
			stream_7.method2925();
			this.anInterface4_8557 = this.aClass505_Sub2_8528.method13994(false);
			this.anInterface4_8557.method27(this.anInt8525 * 4, 4, nativeheapbuffer_4);
			this.anInterface4_8548 = this.aClass505_Sub2_8528.method13994(false);
			this.anInterface4_8548.method27(this.anInt8525 * i_3, i_3, nativeheapbuffer_5);
			if ((this.flags & 0x7) != 0) {
				if (this.anIntArrayArrayArray8543 != null) {
					this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) });
				} else {
					this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) });
				}
			} else if (this.anIntArrayArrayArray8543 != null) {
				this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691 }), new Class72(Class69.aClass69_690) });
			} else {
				this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }), new Class72(Class69.aClass69_690) });
			}

			i_12 = 0;

			for (i_13 = 0; i_13 < arr_67.length; i_13++) {
				Class282_Sub6 class282_sub6_82 = (Class282_Sub6) arr_67[i_13];
				if (class282_sub6_82.anInt7508 > 0) {
					arr_67[i_12++] = class282_sub6_82;
				}
			}

			this.aClass282Array8547 = new Node[i_12];
			long[] longs_92 = new long[i_12];

			for (int i_69 = 0; i_69 < i_12; i_69++) {
				Class282_Sub6 class282_sub6_93 = (Class282_Sub6) arr_67[i_69];
				longs_92[i_69] = class282_sub6_93.data;
				this.aClass282Array8547[i_69] = class282_sub6_93;
				class282_sub6_93.method12146(this.anInt8525);
			}

			Class214.method3669(longs_92, this.aClass282Array8547, 2070243142);
			if (this.aClass74_8545 != null) {
				this.aClass74_8545.method1312();
			}
		} else {
			this.aClass74_8545 = null;
		}

		if ((this.anInt8530 & 0x2) == 0) {
			this.anIntArrayArrayArray8533 = null;
			this.anIntArrayArrayArray8540 = null;
			this.anIntArrayArrayArray8538 = null;
		}

		this.anIntArrayArrayArray8543 = null;
		this.anIntArrayArrayArray8556 = null;
		this.anIntArrayArrayArray8532 = null;
		this.aClass282_Sub6ArrayArrayArray8541 = null;
		this.aByteArrayArray8553 = null;
		this.aClass453_8537 = null;
		this.aFloatArrayArray8549 = null;
		this.aFloatArrayArray8551 = null;
		this.aFloatArrayArray8554 = null;
	}

	public void SA() {
		if (this.anInt8542 > 0) {
			byte[][] bytes_1 = new byte[this.width + 1][this.length + 1];

			int i_3;
			for (int i_2 = 1; i_2 < this.width; i_2++) {
				for (i_3 = 1; i_3 < this.length; i_3++) {
					bytes_1[i_2][i_3] = (byte) ((this.aByteArrayArray8553[i_2][i_3 - 1] >> 2) + (this.aByteArrayArray8553[i_2][i_3] >> 1) + (this.aByteArrayArray8553[i_2 - 1][i_3] >> 2) + (this.aByteArrayArray8553[i_2][i_3 + 1] >> 3) + (this.aByteArrayArray8553[i_2 + 1][i_3] >> 3));
				}
			}

			Node[] arr_67 = new Node[this.aClass453_8537.method7540()];
			this.aClass453_8537.method7532(arr_67, (byte) 55);

			for (i_3 = 0; i_3 < arr_67.length; i_3++) {
				((Class282_Sub6) arr_67[i_3]).method12150(this.anInt8542);
			}

			i_3 = 20;
			if (this.anIntArrayArrayArray8543 != null) {
				i_3 += 4;
			}

			if ((this.flags & 0x7) != 0) {
				i_3 += 12;
			}

			NativeHeapBuffer nativeheapbuffer_4 = this.aClass505_Sub2_8528.aNativeHeap8699.method759(this.anInt8542 * 4, false);
			NativeHeapBuffer nativeheapbuffer_5 = this.aClass505_Sub2_8528.aNativeHeap8699.method759(i_3 * this.anInt8542, false);
			Stream stream_6 = new Stream(nativeheapbuffer_5);
			Stream stream_7 = new Stream(nativeheapbuffer_4);
			Class282_Sub6[] arr_8 = new Class282_Sub6[this.anInt8542];
			int i_9 = Class51.method1072(this.anInt8542 / 4, 942119232);
			if (i_9 < 1) {
				i_9 = 1;
			}

			HashTable class453_10 = new HashTable(i_9);
			Class282_Sub6[] arr_11 = new Class282_Sub6[this.anInt8552];

			int i_12;
			int i_13;
			for (i_12 = 0; i_12 < this.width; i_12++) {
				for (i_13 = 0; i_13 < this.length; i_13++) {
					if (this.anIntArrayArrayArray8538[i_12][i_13] != null) {
						Class282_Sub6[] arr_14 = this.aClass282_Sub6ArrayArrayArray8541[i_12][i_13];
						int[] ints_70 = this.anIntArrayArrayArray8540[i_12][i_13];
						int[] ints_71 = this.anIntArrayArrayArray8533[i_12][i_13];
						int[] ints_17 = this.anIntArrayArrayArray8556[i_12][i_13];
						int[] ints_18 = this.anIntArrayArrayArray8538[i_12][i_13];
						int[] ints_19 = this.anIntArrayArrayArray8532 != null ? this.anIntArrayArrayArray8532[i_12][i_13] : null;
						int[] ints_20 = this.anIntArrayArrayArray8543 != null ? this.anIntArrayArrayArray8543[i_12][i_13] : null;
						if (ints_17 == null) {
							ints_17 = ints_18;
						}

						float f_21 = this.aFloatArrayArray8554[i_12][i_13];
						float f_22 = this.aFloatArrayArray8551[i_12][i_13];
						float f_23 = this.aFloatArrayArray8549[i_12][i_13];
						float f_24 = this.aFloatArrayArray8554[i_12][i_13 + 1];
						float f_25 = this.aFloatArrayArray8551[i_12][i_13 + 1];
						float f_26 = this.aFloatArrayArray8549[i_12][i_13 + 1];
						float f_27 = this.aFloatArrayArray8554[i_12 + 1][i_13 + 1];
						float f_28 = this.aFloatArrayArray8551[i_12 + 1][i_13 + 1];
						float f_29 = this.aFloatArrayArray8549[i_12 + 1][i_13 + 1];
						float f_30 = this.aFloatArrayArray8554[i_12 + 1][i_13];
						float f_31 = this.aFloatArrayArray8551[i_12 + 1][i_13];
						float f_32 = this.aFloatArrayArray8549[i_12 + 1][i_13];
						int i_33 = bytes_1[i_12][i_13] & 0xff;
						int i_34 = bytes_1[i_12][i_13 + 1] & 0xff;
						int i_35 = bytes_1[i_12 + 1][i_13 + 1] & 0xff;
						int i_36 = bytes_1[i_12 + 1][i_13] & 0xff;
						int i_37 = 0;

						int i_40;
						label459: for (int i_38 = 0; i_38 < ints_18.length; i_38++) {
							Class282_Sub6 class282_sub6_73 = arr_14[i_38];

							for (i_40 = 0; i_40 < i_37; i_40++) {
								if (class282_sub6_73 == arr_11[i_40]) {
									continue label459;
								}
							}

							arr_11[i_37++] = class282_sub6_73;
						}

						short[] shorts_72 = this.aShortArrayArray8534[i_12 + i_13 * this.width] = new short[ints_18.length];

						for (int i_39 = 0; i_39 < ints_18.length; i_39++) {
							i_40 = (i_12 << this.tileScale) + ints_70[i_39];
							int i_41 = (i_13 << this.tileScale) + ints_71[i_39];
							int i_42 = i_40 >> this.anInt8536;
							int i_43 = i_41 >> this.anInt8536;
							int i_44 = ints_18[i_39];
							int i_45 = ints_17[i_39];
							int i_46 = ints_19 != null ? ints_19[i_39] : 0;
							long long_47 = (long) i_45 << 48 | (long) i_44 << 32 | (long) (i_42 << 16) | (long) i_43;
							int i_49 = ints_70[i_39];
							int i_50 = ints_71[i_39];
							byte b_51 = 74;
							int i_52 = 0;
							float f_53 = 1.0F;
							float f_54;
							float f_55;
							float f_56;
							float f_61;
							int i_84;
							if (i_49 == 0 && i_50 == 0) {
								f_54 = f_21;
								f_55 = f_22;
								f_56 = f_23;
								i_84 = b_51 - i_33;
							} else if (i_49 == 0 && i_50 == this.tileUnits) {
								f_54 = f_24;
								f_55 = f_25;
								f_56 = f_26;
								i_84 = b_51 - i_34;
							} else if (i_49 == this.tileUnits && i_50 == this.tileUnits) {
								f_54 = f_27;
								f_55 = f_28;
								f_56 = f_29;
								i_84 = b_51 - i_35;
							} else if (i_49 == this.tileUnits && i_50 == 0) {
								f_54 = f_30;
								f_55 = f_31;
								f_56 = f_32;
								i_84 = b_51 - i_36;
							} else {
								float f_57 = (float) i_49 / (float) this.tileUnits;
								float f_58 = (float) i_50 / (float) this.tileUnits;
								float f_59 = f_21 + (f_30 - f_21) * f_57;
								float f_60 = f_22 + (f_31 - f_22) * f_57;
								f_61 = f_23 + (f_32 - f_23) * f_57;
								float f_62 = f_24 + (f_27 - f_24) * f_57;
								float f_63 = f_25 + (f_28 - f_25) * f_57;
								float f_64 = f_26 + (f_29 - f_26) * f_57;
								f_54 = f_59 + (f_62 - f_59) * f_58;
								f_55 = f_60 + (f_63 - f_60) * f_58;
								f_56 = f_61 + (f_64 - f_61) * f_58;
								int i_65 = i_33 + (i_49 * (i_36 - i_33) >> this.tileScale);
								int i_66 = i_34 + (i_49 * (i_35 - i_34) >> this.tileScale);
								i_84 = b_51 - (i_65 + (i_50 * (i_66 - i_65) >> this.tileScale));
							}

							if (i_44 != -1) {
								int i_85 = i_84 * (i_44 & 0x7f) >> 7;
								if (i_85 < 2) {
									i_85 = 2;
								} else if (i_85 > 126) {
									i_85 = 126;
								}

								i_52 = Class540.anIntArray7136[i_44 & 0xff80 | i_85];
								if ((this.flags & 0x7) == 0) {
									f_53 = this.aClass505_Sub2_8528.aFloatArray8747[0] * f_54 + this.aClass505_Sub2_8528.aFloatArray8747[1] * f_55 + this.aClass505_Sub2_8528.aFloatArray8747[2] * f_56;
									f_53 = this.aClass505_Sub2_8528.aFloat8769 + f_53 * (f_53 > 0.0F ? this.aClass505_Sub2_8528.aFloat8770 : this.aClass505_Sub2_8528.aFloat8826);
								}
							}

							Node node_80 = null;
							if ((i_40 & this.anInt8529 - 1) == 0 && (i_41 & this.anInt8529 - 1) == 0) {
								node_80 = class453_10.method7530(long_47);
							}

							int i_86;
							int i_87;
							if (node_80 == null) {
								if (i_45 != i_44) {
									int i_88 = i_84 * (i_45 & 0x7f) >> 7;
									if (i_88 < 2) {
										i_88 = 2;
									} else if (i_88 > 126) {
										i_88 = 126;
									}

									i_87 = Class540.anIntArray7136[i_45 & 0xff80 | i_88];
									if ((this.flags & 0x7) == 0) {
										float f_10000 = this.aClass505_Sub2_8528.aFloatArray8747[0] * f_54 + this.aClass505_Sub2_8528.aFloatArray8747[1] * f_55 + this.aClass505_Sub2_8528.aFloatArray8747[2] * f_56;
										f_61 = this.aClass505_Sub2_8528.aFloat8769 + f_53 * (f_53 > 0.0F ? this.aClass505_Sub2_8528.aFloat8770 : this.aClass505_Sub2_8528.aFloat8826);
										int i_89 = i_87 >> 16 & 0xff;
										int i_90 = i_87 >> 8 & 0xff;
										int i_91 = i_87 & 0xff;
										i_89 = (int) ((float) i_89 * f_61);
										if (i_89 < 0) {
											i_89 = 0;
										} else if (i_89 > 255) {
											i_89 = 255;
										}

										i_90 = (int) ((float) i_90 * f_61);
										if (i_90 < 0) {
											i_90 = 0;
										} else if (i_90 > 255) {
											i_90 = 255;
										}

										i_91 = (int) ((float) i_91 * f_61);
										if (i_91 < 0) {
											i_91 = 0;
										} else if (i_91 > 255) {
											i_91 = 255;
										}

										i_87 = i_89 << 16 | i_90 << 8 | i_91;
									}
								} else {
									i_87 = i_52;
								}

								if (Stream.method2926()) {
									stream_6.method2923((float) i_40);
									stream_6.method2923((float) (this.averageHeight(i_40, i_41, 2064894909) + i_46));
									stream_6.method2923((float) i_41);
									stream_6.method2923((float) i_40);
									stream_6.method2923((float) i_41);
									if (this.anIntArrayArrayArray8543 != null) {
										stream_6.method2923(ints_20 != null ? (float) (ints_20[i_39] - 1) : 0.0F);
									}

									if ((this.flags & 0x7) != 0) {
										stream_6.method2923(f_54);
										stream_6.method2923(f_55);
										stream_6.method2923(f_56);
									}
								} else {
									stream_6.method2924((float) i_40);
									stream_6.method2924((float) (this.averageHeight(i_40, i_41, 2124462689) + i_46));
									stream_6.method2924((float) i_41);
									stream_6.method2924((float) i_40);
									stream_6.method2924((float) i_41);
									if (this.anIntArrayArrayArray8543 != null) {
										stream_6.method2924(ints_20 != null ? (float) (ints_20[i_39] - 1) : 0.0F);
									}

									if ((this.flags & 0x7) != 0) {
										stream_6.method2924(f_54);
										stream_6.method2924(f_55);
										stream_6.method2924(f_56);
									}
								}

								if (this.aClass505_Sub2_8528.anInt8824 == 0) {
									stream_7.method2921(~0xffffff | i_87);
								} else {
									stream_7.method2922(~0xffffff | i_87);
								}

								i_86 = this.anInt8525++;
								shorts_72[i_39] = (short) i_86;
								if (i_44 != -1) {
									arr_8[i_86] = arr_14[i_39];
								}

								class453_10.method7534(new Class282_Sub46(shorts_72[i_39]), long_47);
							} else {
								shorts_72[i_39] = ((Class282_Sub46) node_80).aShort8067;
								i_86 = shorts_72[i_39] & 0xffff;
								if (i_44 != -1 && arr_14[i_39].data < arr_8[i_86].data) {
									arr_8[i_86] = arr_14[i_39];
								}
							}

							for (i_87 = 0; i_87 < i_37; i_87++) {
								arr_11[i_87].method12145(i_86, i_52, i_84, f_53);
							}

							++this.anInt8527;
						}
					}
				}
			}

			for (i_12 = 0; i_12 < this.anInt8525; i_12++) {
				Class282_Sub6 class282_sub6_68 = arr_8[i_12];
				if (class282_sub6_68 != null) {
					class282_sub6_68.method12143(i_12);
				}
			}

			for (i_12 = 0; i_12 < this.width; i_12++) {
				for (i_13 = 0; i_13 < this.length; i_13++) {
					short[] shorts_81 = this.aShortArrayArray8534[i_12 + i_13 * this.width];
					if (shorts_81 != null) {
						int i_15 = 0;

						for (int i_16 = 0; i_16 < shorts_81.length; i_15++) {
							int i_74 = shorts_81[i_16++] & 0xffff;
							int i_75 = shorts_81[i_16++] & 0xffff;
							int i_76 = shorts_81[i_16++] & 0xffff;
							Class282_Sub6 class282_sub6_83 = arr_8[i_74];
							Class282_Sub6 class282_sub6_77 = arr_8[i_75];
							Class282_Sub6 class282_sub6_78 = arr_8[i_76];
							Class282_Sub6 class282_sub6_79 = null;
							if (class282_sub6_83 != null) {
								class282_sub6_83.method12152(i_12, i_13, i_15);
								class282_sub6_79 = class282_sub6_83;
							}

							if (class282_sub6_77 != null) {
								class282_sub6_77.method12152(i_12, i_13, i_15);
								if (class282_sub6_79 == null || class282_sub6_77.data < class282_sub6_79.data) {
									class282_sub6_79 = class282_sub6_77;
								}
							}

							if (class282_sub6_78 != null) {
								class282_sub6_78.method12152(i_12, i_13, i_15);
								if (class282_sub6_79 == null || class282_sub6_78.data < class282_sub6_79.data) {
									class282_sub6_79 = class282_sub6_78;
								}
							}

							if (class282_sub6_79 != null) {
								if (class282_sub6_83 != null) {
									class282_sub6_79.method12143(i_74);
								}

								if (class282_sub6_77 != null) {
									class282_sub6_79.method12143(i_75);
								}

								if (class282_sub6_78 != null) {
									class282_sub6_79.method12143(i_76);
								}

								class282_sub6_79.method12152(i_12, i_13, i_15);
							}
						}
					}
				}
			}

			stream_6.method2925();
			stream_7.method2925();
			this.anInterface4_8557 = this.aClass505_Sub2_8528.method13994(false);
			this.anInterface4_8557.method27(this.anInt8525 * 4, 4, nativeheapbuffer_4);
			this.anInterface4_8548 = this.aClass505_Sub2_8528.method13994(false);
			this.anInterface4_8548.method27(i_3 * this.anInt8525, i_3, nativeheapbuffer_5);
			if ((this.flags & 0x7) != 0) {
				if (this.anIntArrayArrayArray8543 != null) {
					this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) });
				} else {
					this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_689 }), new Class72(Class69.aClass69_690) });
				}
			} else if (this.anIntArrayArrayArray8543 != null) {
				this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692, Class69.aClass69_691 }), new Class72(Class69.aClass69_690) });
			} else {
				this.aClass70_8550 = this.aClass505_Sub2_8528.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_692 }), new Class72(Class69.aClass69_690) });
			}

			i_12 = 0;

			for (i_13 = 0; i_13 < arr_67.length; i_13++) {
				Class282_Sub6 class282_sub6_82 = (Class282_Sub6) arr_67[i_13];
				if (class282_sub6_82.anInt7508 > 0) {
					arr_67[i_12++] = class282_sub6_82;
				}
			}

			this.aClass282Array8547 = new Node[i_12];
			long[] longs_92 = new long[i_12];

			for (int i_69 = 0; i_69 < i_12; i_69++) {
				Class282_Sub6 class282_sub6_93 = (Class282_Sub6) arr_67[i_69];
				longs_92[i_69] = class282_sub6_93.data;
				this.aClass282Array8547[i_69] = class282_sub6_93;
				class282_sub6_93.method12146(this.anInt8525);
			}

			Class214.method3669(longs_92, this.aClass282Array8547, 1879958043);
			if (this.aClass74_8545 != null) {
				this.aClass74_8545.method1312();
			}
		} else {
			this.aClass74_8545 = null;
		}

		if ((this.anInt8530 & 0x2) == 0) {
			this.anIntArrayArrayArray8533 = null;
			this.anIntArrayArrayArray8540 = null;
			this.anIntArrayArrayArray8538 = null;
		}

		this.anIntArrayArrayArray8543 = null;
		this.anIntArrayArrayArray8556 = null;
		this.anIntArrayArrayArray8532 = null;
		this.aClass282_Sub6ArrayArrayArray8541 = null;
		this.aByteArrayArray8553 = null;
		this.aClass453_8537 = null;
		this.aFloatArrayArray8549 = null;
		this.aFloatArrayArray8551 = null;
		this.aFloatArrayArray8554 = null;
	}

	public void method6720(Class282_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass473_8546.insertBack(new Class282_Sub8(this.aClass505_Sub2_8528, this, class282_sub24_1, ints_2));
	}

	public void u(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1317(class282_sub50_sub17_1, i_7, i_8);
		}
	}

	public void method6717(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5) {
		if (this.aClass282Array8547 != null) {
			int i_7 = i_3 + i_3 + 1;
			i_7 *= i_7;
			if (anIntArray8561.length < i_7) {
				anIntArray8561 = new int[i_7];
			}

			int i_8 = i_1 - i_3;
			int i_9 = i_8;
			if (i_8 < 0) {
				i_8 = 0;
			}

			int i_10 = i_2 - i_3;
			int i_11 = i_10;
			if (i_10 < 0) {
				i_10 = 0;
			}

			int i_12 = i_3 + i_1;
			if (i_12 > this.width - 1) {
				i_12 = this.width - 1;
			}

			int i_13 = i_3 + i_2;
			if (i_13 > this.length - 1) {
				i_13 = this.length - 1;
			}

			anInt8560 = 0;

			for (int i_14 = i_8; i_14 <= i_12; i_14++) {
				boolean[] bools_25 = bools_4[i_14 - i_9];

				for (int i_26 = i_10; i_26 <= i_13; i_26++) {
					if (bools_25[i_26 - i_11]) {
						anIntArray8561[anInt8560++] = i_14 + i_26 * this.width;
					}
				}
			}

			ByteBuffer bytebuffer_24 = this.aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer_24.clear();

			int i_15;
			for (i_15 = 0; i_15 < this.aClass282Array8547.length; i_15++) {
				Class282_Sub6 class282_sub6_16 = (Class282_Sub6) this.aClass282Array8547[i_15];
				class282_sub6_16.method12147(anIntArray8561, anInt8560);
			}

			i_15 = bytebuffer_24.position();
			Class48 class48_27 = this.aClass505_Sub2_8528.aClass48_8794;
			if (i_15 != 0) {
				Interface32 interface32_17 = this.aClass505_Sub2_8528.method13911(i_15 / 2);
				interface32_17.method42(0, i_15, this.aClass505_Sub2_8528.aLong8695);
				this.aClass505_Sub2_8528.method14004();
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method13997(interface32_17);
				class48_27.method957(Matrix44Arr.aClass384_4666);
				if (this.aClass505_Sub2_8528.anInt8811 > 0) {
					class48_27.aClass303_460.set(0.0F, 0.0F, 1.0F, -this.aClass505_Sub2_8528.aFloat8813);
					class48_27.aClass385_457.set((float) (this.aClass505_Sub2_8528.anInt8810 >> 16 & 0xff) / 255.0F, (float) (this.aClass505_Sub2_8528.anInt8810 >> 8 & 0xff) / 255.0F, (float) (this.aClass505_Sub2_8528.anInt8810 >> 0 & 0xff) / 255.0F);
					this.aClass505_Sub2_8528.aClass384_8683.method6562(this.aClass505_Sub2_8528.aClass384_8740);
					this.aClass505_Sub2_8528.aClass384_8683.method6520();
					class48_27.aClass303_460.concat(this.aClass505_Sub2_8528.aClass384_8683);
					class48_27.aClass303_460.scale(1.0F / (this.aClass505_Sub2_8528.aFloat8819 - this.aClass505_Sub2_8528.aFloat8813));
				} else {
					class48_27.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
					class48_27.aClass385_457.set(0.0F, 0.0F, 0.0F);
				}

				int i_18;
				int i_19;
				Class282_Sub6 class282_sub6_20;
				TextureDetails class169_22;
				if ((this.flags & 0x37) == 0) {
					i_18 = 0;

					for (i_19 = 0; i_19 < this.aClass282Array8547.length; i_19++) {
						class282_sub6_20 = (Class282_Sub6) this.aClass282Array8547[i_19];
						if (class282_sub6_20.anInt7514 != 0) {
							if (this.aClass505_Sub2_8528.aBool8779) {
								this.aClass505_Sub2_8528.method8476(0, class282_sub6_20.aClass90_7512);
								class48_27.aClass303_458.set(0.0F, 1.0F, 0.0F, (float) this.aClass505_Sub2_8528.anInt8739 + (float) class282_sub6_20.aClass90_7512.intensity / 255.0F * (float) class282_sub6_20.aClass90_7512.scale);
								class48_27.aClass303_458.scale(1.0F / (float) class282_sub6_20.aClass90_7512.scale);
								class48_27.aClass385_459.set((float) (class282_sub6_20.aClass90_7512.color >> 16 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 8 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 0 & 0xff) / 255.0F);
							} else {
								class48_27.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
								class48_27.aClass385_459.set(0.0F, 0.0F, 0.0F);
							}

							boolean bool_30 = false;
							if (class282_sub6_20.anInt7510 != -1) {
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.aClass66_8787.method1283(class282_sub6_20.anInt7510);
								class169_22 = this.aClass505_Sub2_8528.anInterface22_5834.method144(class282_sub6_20.anInt7510, -1934981615);
								bool_30 = !Class282_Sub41.method13367(class169_22.effectId, (short) 17932);
							} else {
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
							}

							this.aClass505_Sub2_8528.method14161(1, class282_sub6_20.anInterface4_7516);
							this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
							class48_27.aClass384_454.method6525(1.0F / class282_sub6_20.aFloat7511, 1.0F / class282_sub6_20.aFloat7511, 1.0F, 1.0F);
							class48_27.anInt467 = class282_sub6_20.anInt7519;
							class48_27.anInt468 = class282_sub6_20.anInt7517 - class282_sub6_20.anInt7519 + 1;
							class48_27.anInt469 = i_18;
							class48_27.anInt470 = class282_sub6_20.anInt7514 / 3;
							class48_27.method946(bool_30);
							i_18 += class282_sub6_20.anInt7514;
						}
					}
				} else {
					class48_27.aClass385_466.set(this.aClass505_Sub2_8528.aFloatArray8747[0], this.aClass505_Sub2_8528.aFloatArray8747[1], this.aClass505_Sub2_8528.aFloatArray8747[2]);
					class48_27.aClass385_448.set(this.aClass505_Sub2_8528.aFloat8770 * this.aClass505_Sub2_8528.aFloat8766, this.aClass505_Sub2_8528.aFloat8770 * this.aClass505_Sub2_8528.aFloat8767, this.aClass505_Sub2_8528.aFloat8770 * this.aClass505_Sub2_8528.aFloat8768);
					class48_27.aClass385_464.set(-this.aClass505_Sub2_8528.aFloat8826 * this.aClass505_Sub2_8528.aFloat8766, -this.aClass505_Sub2_8528.aFloat8826 * this.aClass505_Sub2_8528.aFloat8767, -this.aClass505_Sub2_8528.aFloat8826 * this.aClass505_Sub2_8528.aFloat8768);
					class48_27.aClass385_461.set(this.aClass505_Sub2_8528.aFloat8769 * this.aClass505_Sub2_8528.aFloat8766, this.aClass505_Sub2_8528.aFloat8769 * this.aClass505_Sub2_8528.aFloat8767, this.aClass505_Sub2_8528.aFloat8769 * this.aClass505_Sub2_8528.aFloat8768);
					i_18 = 0;

					for (i_19 = 0; i_19 < this.aClass282Array8547.length; i_19++) {
						class282_sub6_20 = (Class282_Sub6) this.aClass282Array8547[i_19];
						if (class282_sub6_20.anInt7514 > 0) {
							if (this.aClass505_Sub2_8528.aBool8779) {
								this.aClass505_Sub2_8528.method8476(0, class282_sub6_20.aClass90_7512);
								float f_21 = 0.15F;
								class48_27.aClass303_458.set(0.0F, 1.0F / ((float) class282_sub6_20.aClass90_7512.scale * f_21), 0.0F, 256.0F / ((float) class282_sub6_20.aClass90_7512.scale * f_21));
								class48_27.aClass385_459.set((float) (class282_sub6_20.aClass90_7512.color >> 16 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 8 & 0xff) / 255.0F, (float) (class282_sub6_20.aClass90_7512.color >> 0 & 0xff) / 255.0F);
							} else {
								class48_27.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
								class48_27.aClass385_459.set(0.0F, 0.0F, 0.0F);
							}

							byte b_29 = 11;
							if (class282_sub6_20.anInt7510 != -1) {
								class169_22 = this.aClass505_Sub2_8528.anInterface22_5834.method144(class282_sub6_20.anInt7510, -1784475659);
								b_29 = class169_22.effectId;
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.aClass66_8787.method1283(class282_sub6_20.anInt7510);
								class48_27.method944(class169_22);
							} else {
								class48_27.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
							}

							this.aClass505_Sub2_8528.method14161(1, class282_sub6_20.anInterface4_7516);
							this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
							class48_27.aClass384_454.method6525(1.0F / class282_sub6_20.aFloat7511, 1.0F / class282_sub6_20.aFloat7511, 1.0F, 1.0F);
							class48_27.anInt467 = class282_sub6_20.anInt7519;
							class48_27.anInt468 = class282_sub6_20.anInt7517 - class282_sub6_20.anInt7519 + 1;
							class48_27.anInt469 = i_18;
							class48_27.anInt470 = class282_sub6_20.anInt7514 / 3;
							switch (b_29) {
							case 1:
								class48_27.aClass385_455.set(this.aClass505_Sub2_8528.aClass384_8814.buf[12], this.aClass505_Sub2_8528.aClass384_8814.buf[13], this.aClass505_Sub2_8528.aClass384_8814.buf[14]);
								class48_27.method948(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								// render shaders/ripples water
								if (!this.aClass505_Sub2_8528.aBool8692 && (this.flags & 0x8) != 0) {
									Class41_Sub1_Sub1 class41_sub1_sub1_31 = this.aClass505_Sub2_8528.aClass41_Sub1_Sub1_8691;
									class41_sub1_sub1_31.aClass384_10090.method6562(this.aClass505_Sub2_8528.aClass384_8729);
									class41_sub1_sub1_31.aClass384_10091.method6525(1.0F / (class282_sub6_20.aFloat7511 * (float) class282_sub6_20.aClass90_7512.anInt949), 1.0F / (class282_sub6_20.aFloat7511 * (float) class282_sub6_20.aClass90_7512.anInt949), 1.0F, 1.0F);
									class41_sub1_sub1_31.aClass385_10089.set(this.aClass505_Sub2_8528.aClass384_8814.buf[12], this.aClass505_Sub2_8528.aClass384_8814.buf[13], this.aClass505_Sub2_8528.aClass384_8814.buf[14]);
									TextureDetails class169_23 = this.aClass505_Sub2_8528.anInterface22_5834.method144(class282_sub6_20.anInt7510, -2062913457);
									class41_sub1_sub1_31.anInt10095 = class169_23.effectParam1;
									class41_sub1_sub1_31.anInt10110 = class282_sub6_20.anInt7519;
									class41_sub1_sub1_31.anInt10111 = class282_sub6_20.anInt7517 - class282_sub6_20.anInt7519 + 1;
									class41_sub1_sub1_31.anInt10094 = i_18;
									class41_sub1_sub1_31.anInt10112 = class282_sub6_20.anInt7514 / 3;
									class41_sub1_sub1_31.aClass303_10103.copy(class48_27.aClass303_458);
									class41_sub1_sub1_31.aClass385_10086.copy(class48_27.aClass385_459);
									class41_sub1_sub1_31.aClass303_10107.copy(class48_27.aClass303_460);
									class41_sub1_sub1_31.aClass385_10109.copy(class48_27.aClass385_457);
									class41_sub1_sub1_31.method15520(-1989775919);
								} else {
									class48_27.method965(0);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass505_Sub2_8528.aBool8779) {
									class48_27.method950();
								} else {
									class48_27.method965(0);
								}
								break;
							case 6:
								class48_27.method946(!Class282_Sub41.method13367(b_29, (short) 27875));
								break;
							case 7:
								class48_27.aClass385_455.set(this.aClass505_Sub2_8528.aClass384_8814.buf[12], this.aClass505_Sub2_8528.aClass384_8814.buf[13], this.aClass505_Sub2_8528.aClass384_8814.buf[14]);
								class48_27.aClass384_465.identity();
								class48_27.anInterface31_451 = this.aClass505_Sub2_8528.method13965();
								class48_27.method949(0);
							}

							i_18 += class282_sub6_20.anInt7514;
						}
					}
				}
			}

			if (this.aClass74_8545 != null) {
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method14161(1, this.anInterface4_8557);
				this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
				Matrix44Arr matrix44arr_28 = this.aClass505_Sub2_8528.aClass384_8683;
				matrix44arr_28.identity();
				matrix44arr_28.buf[13] = -1.0F;
				class48_27.method957(matrix44arr_28);
				this.aClass74_8545.method1314(class48_27, i_1, i_2, i_3, bools_4, bool_5);
			}
		}

	}

	public boolean method6719(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			return this.aClass74_8545.method1316(class282_sub50_sub17_1, i_7, i_8);
		} else {
			return false;
		}
	}

	HardwareGround(Class505_Sub2 class505_sub2_1, int i_2, int i_3, int i_4, int i_5, int[][] ints_6, int[][] ints_7, int i_8) {
		super(i_4, i_5, i_8, ints_6);
		this.aClass505_Sub2_8528 = class505_sub2_1;
		this.anInt8536 = this.tileScale - 2;
		this.anInt8529 = 1 << this.anInt8536;
		this.anInt8530 = i_2;
		this.flags = i_3;
		this.anIntArrayArrayArray8532 = new int[i_4][i_5][];
		this.aClass282_Sub6ArrayArrayArray8541 = new Class282_Sub6[i_4][i_5][];
		this.anIntArrayArrayArray8540 = new int[i_4][i_5][];
		this.anIntArrayArrayArray8533 = new int[i_4][i_5][];
		this.anIntArrayArrayArray8538 = new int[i_4][i_5][];
		this.anIntArrayArrayArray8556 = new int[i_4][i_5][];
		this.aShortArrayArray8534 = new short[i_5 * i_4][];
		this.aByteArrayArray8531 = new byte[i_4][i_5];
		this.aByteArrayArray8553 = new byte[i_4 + 1][i_5 + 1];
		this.aFloatArrayArray8554 = new float[this.width + 1][this.length + 1];
		this.aFloatArrayArray8551 = new float[this.width + 1][this.length + 1];
		this.aFloatArrayArray8549 = new float[this.width + 1][this.length + 1];

		for (int i_9 = 0; i_9 <= this.length; i_9++) {
			for (int i_10 = 0; i_10 <= this.width; i_10++) {
				int i_11 = this.tileHeights[i_10][i_9];
				if ((float) i_11 < this.aFloat8535) {
					this.aFloat8535 = (float) i_11;
				}

				if ((float) i_11 > this.aFloat8544) {
					this.aFloat8544 = (float) i_11;
				}

				if (i_10 > 0 && i_9 > 0 && i_10 < this.width && i_9 < this.length) {
					int i_12 = ints_7[i_10 + 1][i_9] - ints_7[i_10 - 1][i_9];
					int i_13 = ints_7[i_10][i_9 + 1] - ints_7[i_10][i_9 - 1];
					float f_14 = (float) (1.0D / Math.sqrt((double) (i_8 * i_8 * 4 + i_12 * i_12 + i_13 * i_13)));
					this.aFloatArrayArray8554[i_10][i_9] = (float) i_12 * f_14;
					this.aFloatArrayArray8551[i_10][i_9] = (float) (-i_8 * 2) * f_14;
					this.aFloatArrayArray8549[i_10][i_9] = (float) i_13 * f_14;
				}
			}
		}

		--this.aFloat8535;
		++this.aFloat8544;
		this.aClass453_8537 = new HashTable(128);
		if ((this.flags & 0x10) != 0) {
			this.aClass74_8545 = new Class74(this.aClass505_Sub2_8528, this);
		}

	}

	public void a(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1315(class282_sub50_sub17_1, i_7, i_8);
		}

	}

	public void b(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1315(class282_sub50_sub17_1, i_7, i_8);
		}

	}

	public void method6708(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, Class90 class90_14) {
		int i_16 = ints_10.length;
		int[] ints_17 = new int[i_16 * 3];
		int[] ints_18 = new int[i_16 * 3];
		int[] ints_19 = new int[i_16 * 3];
		int[] ints_20 = new int[i_16 * 3];
		int[] ints_21 = new int[i_16 * 3];
		int[] ints_22 = new int[i_16 * 3];
		int[] ints_23 = ints_4 != null ? new int[i_16 * 3] : null;
		int[] ints_24 = ints_6 != null ? new int[i_16 * 3] : null;
		int i_25 = 0;

		for (int i_26 = 0; i_26 < i_16; i_26++) {
			int i_27 = ints_7[i_26];
			int i_28 = ints_8[i_26];
			int i_29 = ints_9[i_26];
			ints_17[i_25] = ints_3[i_27];
			ints_18[i_25] = ints_5[i_27];
			ints_19[i_25] = ints_10[i_26];
			ints_21[i_25] = ints_12[i_26];
			ints_22[i_25] = ints_13[i_26];
			ints_20[i_25] = ints_11 != null ? ints_11[i_26] : ints_10[i_26];
			if (ints_4 != null) {
				ints_23[i_25] = ints_4[i_27];
			}

			if (ints_6 != null) {
				ints_24[i_25] = ints_6[i_27];
			}

			++i_25;
			ints_17[i_25] = ints_3[i_28];
			ints_18[i_25] = ints_5[i_28];
			ints_19[i_25] = ints_10[i_26];
			ints_21[i_25] = ints_12[i_26];
			ints_22[i_25] = ints_13[i_26];
			ints_20[i_25] = ints_11 != null ? ints_11[i_26] : ints_10[i_26];
			if (ints_4 != null) {
				ints_23[i_25] = ints_4[i_28];
			}

			if (ints_6 != null) {
				ints_24[i_25] = ints_6[i_28];
			}

			++i_25;
			ints_17[i_25] = ints_3[i_29];
			ints_18[i_25] = ints_5[i_29];
			ints_19[i_25] = ints_10[i_26];
			ints_21[i_25] = ints_12[i_26];
			ints_22[i_25] = ints_13[i_26];
			ints_20[i_25] = ints_11 != null ? ints_11[i_26] : ints_10[i_26];
			if (ints_4 != null) {
				ints_23[i_25] = ints_4[i_29];
			}

			if (ints_6 != null) {
				ints_24[i_25] = ints_6[i_29];
			}

			++i_25;
		}

		this.method6707(i_1, i_2, ints_17, ints_23, ints_18, ints_24, ints_19, ints_20, ints_21, ints_22, class90_14, false);
	}

	public void method6713(Class282_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass473_8546.insertBack(new Class282_Sub8(this.aClass505_Sub2_8528, this, class282_sub24_1, ints_2));
	}

	public void method6721(Class282_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass473_8546.insertBack(new Class282_Sub8(this.aClass505_Sub2_8528, this, class282_sub24_1, ints_2));
	}

	public void UA(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
		if (this.aClass74_8545 != null && class282_sub50_sub17_1 != null) {
			int i_7 = i_2 - (i_3 * this.aClass505_Sub2_8528.anInt8777 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			int i_8 = i_4 - (i_3 * this.aClass505_Sub2_8528.anInt8778 >> 8) >> this.aClass505_Sub2_8528.anInt8806;
			this.aClass74_8545.method1317(class282_sub50_sub17_1, i_7, i_8);
		}

	}

	public void method6710(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
		if (this.anInt8542 > 0) {
			Interface32 interface32_9 = this.aClass505_Sub2_8528.method13911(this.anInt8527);
			int i_10 = 0;
			int i_11 = 32767;
			int i_12 = -32768;
			ByteBuffer bytebuffer_13 = this.aClass505_Sub2_8528.aByteBuffer8838;
			bytebuffer_13.clear();

			for (int i_14 = i_5; i_14 < i_7; i_14++) {
				int i_15 = i_14 * this.width + i_4;

				for (int i_16 = i_4; i_16 < i_6; i_16++) {
					if (bools_8[i_16 - i_4][i_14 - i_5]) {
						short[] shorts_17 = this.aShortArrayArray8534[i_15];
						if (shorts_17 != null) {
							for (int i_21 = 0; i_21 < shorts_17.length; i_21++) {
								int i_19 = shorts_17[i_21] & 0xffff;
								if (i_19 > i_12) {
									i_12 = i_19;
								}

								if (i_19 < i_11) {
									i_11 = i_19;
								}

								bytebuffer_13.putShort((short) i_19);
								++i_10;
							}
						}
					}

					++i_15;
				}
			}

			interface32_9.method42(0, bytebuffer_13.position(), this.aClass505_Sub2_8528.aLong8695);
			if (i_10 > 0) {
				this.aClass505_Sub2_8528.method14004();
				Class48 class48_20 = this.aClass505_Sub2_8528.aClass48_8794;
				this.aClass505_Sub2_8528.method14161(0, this.anInterface4_8548);
				this.aClass505_Sub2_8528.method14161(1, this.anInterface4_8557);
				this.aClass505_Sub2_8528.method13996(this.aClass70_8550);
				this.aClass505_Sub2_8528.method13997(interface32_9);
				this.aClass505_Sub2_8528.method8457(Matrix44Var.aClass294_3518);
				float f_22 = (float) this.aClass505_Sub2_8528.method8523((byte) 105).method2714();
				float f_23 = (float) this.aClass505_Sub2_8528.method8523((byte) 126).method2716();
				Matrix44Var matrix44var_24 = new Matrix44Var();
				Matrix44Var matrix44var_18 = new Matrix44Var();
				matrix44var_24.method5214();
				matrix44var_18.method5259((float) i_3 / (256.0F * (float) (this.tileUnits)), (float) (-i_3) / (256.0F * (float) (this.tileUnits)), 1.0F / (this.aFloat8544 - this.aFloat8535));
				matrix44var_18.method5219((float) i_1 - (float) (i_4 * i_3) / 256.0F, (float) i_2 + (float) (i_7 * i_3) / 256.0F, -this.aFloat8535 / (this.aFloat8544 - this.aFloat8535));
				matrix44var_18.method5247(2.0F / f_22, 2.0F / f_23);
				matrix44var_18.method5219(-1.0F, -1.0F, 0.0F);
				this.aClass505_Sub2_8528.aClass294_8713.method5261(matrix44var_24, matrix44var_18);
				this.aClass505_Sub2_8528.aClass384_8683.fromVarMatrix44(this.aClass505_Sub2_8528.aClass294_8713);
				this.aClass505_Sub2_8528.method8424(this.aClass505_Sub2_8528.aClass384_8683);
				class48_20.method957(Matrix44Arr.aClass384_4666);
				class48_20.aClass303_460.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_20.aClass385_457.set(0.0F, 0.0F, 0.0F);
				class48_20.aClass303_458.set(0.0F, 0.0F, 0.0F, 0.0F);
				class48_20.aClass385_459.set(0.0F, 0.0F, 0.0F);
				class48_20.anInterface6_452 = this.aClass505_Sub2_8528.anInterface6_8788;
				class48_20.aClass384_454.identity();
				class48_20.anInt467 = i_11;
				class48_20.anInt468 = i_12 - i_11 + 1;
				class48_20.anInt469 = 0;
				class48_20.anInt470 = i_10 / 3;
				class48_20.method946(false);
			}
		}

	}

}
