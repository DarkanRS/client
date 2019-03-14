import java.io.IOException;

public class Class282_Sub18 extends Node {

	static boolean aBool7611 = false;
	static int anInt7635;
	static int anInt7637;
	static float[] aFloatArray7612;
	static Class255[] aClass255Array7615;
	static Class338[] aClass338Array7610;
	static Class265[] aClass265Array7617;
	static Class259[] aClass259Array7618;
	static boolean[] aBoolArray7619;
	static int[] anIntArray7621;
	static float[] aFloatArray7627;
	static float[] aFloatArray7628;
	static float[] aFloatArray7629;
	static int[] anIntArray7633;
	static float[] aFloatArray7630;
	static float[] aFloatArray7631;
	static float[] aFloatArray7632;
	static int[] anIntArray7634;
	static byte[] aByteArray7607;
	static int anInt7614;
	static int anInt7613;
	int anInt7605;
	int anInt7620;
	int anInt7616;
	int anInt7604;
	boolean aBool7609;
	byte[][] aByteArrayArray7606;
	float[] aFloatArray7622;
	int anInt7623;
	int anInt7624;
	boolean aBool7625;
	float[] aFloatArray7608;
	int anInt7636 = 0;
	int anInt7626;
	int anInt7638 = 0;

	static void method12261(byte[] bytes_0) {
		method12262(bytes_0, 0);
		anInt7635 = 1 << method12264(4);
		anInt7637 = 1 << method12264(4);
		aFloatArray7612 = new float[anInt7637];

		int i_1;
		int i_2;
		int i_3;
		int i_4;
		int i_5;
		for (i_1 = 0; i_1 < 2; i_1++) {
			i_2 = i_1 != 0 ? anInt7637 : anInt7635;
			i_3 = i_2 >> 1;
			i_4 = i_2 >> 2;
			i_5 = i_2 >> 3;
			float[] floats_12 = new float[i_3];

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				floats_12[i_7 * 2] = (float) Math.cos((double) (i_7 * 4) * 3.141592653589793D / (double) i_2);
				floats_12[i_7 * 2 + 1] = -((float) Math.sin((double) (i_7 * 4) * 3.141592653589793D / (double) i_2));
			}

			float[] floats_13 = new float[i_3];

			for (int i_8 = 0; i_8 < i_4; i_8++) {
				floats_13[i_8 * 2] = (float) Math.cos((double) (i_8 * 2 + 1) * 3.141592653589793D / (double) (i_2 * 2));
				floats_13[i_8 * 2 + 1] = (float) Math.sin((double) (i_8 * 2 + 1) * 3.141592653589793D / (double) (i_2 * 2));
			}

			float[] floats_14 = new float[i_4];

			for (int i_9 = 0; i_9 < i_5; i_9++) {
				floats_14[i_9 * 2] = (float) Math.cos((double) (i_9 * 4 + 2) * 3.141592653589793D / (double) i_2);
				floats_14[i_9 * 2 + 1] = -((float) Math.sin((double) (i_9 * 4 + 2) * 3.141592653589793D / (double) i_2));
			}

			int[] ints_15 = new int[i_5];
			int i_10 = Class159.method2739(i_5 - 1, 548668392);

			for (int i_11 = 0; i_11 < i_5; i_11++) {
				ints_15[i_11] = Class3.method285(i_11, i_10, 1788302958);
			}

			if (i_1 != 0) {
				aFloatArray7630 = floats_12;
				aFloatArray7631 = floats_13;
				aFloatArray7632 = floats_14;
				anIntArray7634 = ints_15;
			} else {
				aFloatArray7627 = floats_12;
				aFloatArray7628 = floats_13;
				aFloatArray7629 = floats_14;
				anIntArray7633 = ints_15;
			}
		}

		i_1 = method12264(8) + 1;
		aClass255Array7615 = new Class255[i_1];

		for (i_2 = 0; i_2 < i_1; i_2++) {
			aClass255Array7615[i_2] = new Class255();
		}

		i_2 = method12264(6) + 1;

		for (i_3 = 0; i_3 < i_2; i_3++) {
			method12264(16);
		}

		i_2 = method12264(6) + 1;
		aClass338Array7610 = new Class338[i_2];

		for (i_3 = 0; i_3 < i_2; i_3++) {
			aClass338Array7610[i_3] = new Class338();
		}

		i_3 = method12264(6) + 1;
		aClass265Array7617 = new Class265[i_3];

		for (i_4 = 0; i_4 < i_3; i_4++) {
			aClass265Array7617[i_4] = new Class265();
		}

		i_4 = method12264(6) + 1;
		aClass259Array7618 = new Class259[i_4];

		for (i_5 = 0; i_5 < i_4; i_5++) {
			aClass259Array7618[i_5] = new Class259();
		}

		i_5 = method12264(6) + 1;
		aBoolArray7619 = new boolean[i_5];
		anIntArray7621 = new int[i_5];

		for (int i_6 = 0; i_6 < i_5; i_6++) {
			aBoolArray7619[i_6] = method12263() != 0;
			method12264(16);
			method12264(16);
			anIntArray7621[i_6] = method12264(8);
		}

		aBool7611 = true;
	}

	static void method12262(byte[] bytes_0, int i_1) {
		aByteArray7607 = bytes_0;
		anInt7614 = i_1;
		anInt7613 = 0;
	}

	static int method12263() {
		int i_0 = aByteArray7607[anInt7614] >> anInt7613 & 0x1;
		++anInt7613;
		anInt7614 += anInt7613 >> 3;
		anInt7613 &= 0x7;
		return i_0;
	}

	static int method12264(int i_0) {
		int i_1 = 0;

		int i_2;
		int i_3;
		for (i_2 = 0; i_0 >= 8 - anInt7613; i_0 -= i_3) {
			i_3 = 8 - anInt7613;
			int i_4 = (1 << i_3) - 1;
			i_1 += (aByteArray7607[anInt7614] >> anInt7613 & i_4) << i_2;
			anInt7613 = 0;
			++anInt7614;
			i_2 += i_3;
		}

		if (i_0 > 0) {
			i_3 = (1 << i_0) - 1;
			i_1 += (aByteArray7607[anInt7614] >> anInt7613 & i_3) << i_2;
			anInt7613 += i_0;
		}

		return i_1;
	}

	void method12265(byte[] bytes_1) throws IOException {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(bytes_1);
		this.anInt7605 = rsbytebuffer_2.readInt();
		this.anInt7620 = rsbytebuffer_2.readInt();
		this.anInt7616 = rsbytebuffer_2.readInt();
		this.anInt7604 = rsbytebuffer_2.readInt();
		if (this.anInt7604 < 0) {
			this.anInt7604 = ~this.anInt7604;
			this.aBool7609 = true;
		}

		int i_3 = rsbytebuffer_2.readInt();
		if (i_3 < 0) {
			throw new IOException();
		} else {
			this.aByteArrayArray7606 = new byte[i_3][];

			for (int i_4 = 0; i_4 < i_3; i_4++) {
				int i_5 = 0;

				int i_6;
				do {
					i_6 = rsbytebuffer_2.readUnsignedByte();
					i_5 += i_6;
				} while (i_6 >= 255);

				byte[] bytes_7 = new byte[i_5];
				rsbytebuffer_2.readBytes(bytes_7, 0, i_5);
				this.aByteArrayArray7606[i_4] = bytes_7;
			}

		}
	}

	float[] method12267(int i_1) {
		method12262(this.aByteArrayArray7606[i_1], 0);
		method12263();
		int i_2 = method12264(Class159.method2739(anIntArray7621.length - 1, -908362072));
		boolean bool_3 = aBoolArray7619[i_2];
		int i_4 = bool_3 ? anInt7637 : anInt7635;
		boolean bool_5 = false;
		boolean bool_6 = false;
		if (bool_3) {
			bool_5 = method12263() != 0;
			bool_6 = method12263() != 0;
		}

		int i_7 = i_4 >> 1;
		int i_8;
		int i_9;
		int i_10;
		if (bool_3 && !bool_5) {
			i_8 = (i_4 >> 2) - (anInt7635 >> 2);
			i_9 = (anInt7635 >> 2) + (i_4 >> 2);
			i_10 = anInt7635 >> 1;
		} else {
			i_8 = 0;
			i_9 = i_7;
			i_10 = i_4 >> 1;
		}

		int i_11;
		int i_12;
		int i_13;
		if (bool_3 && !bool_6) {
			i_11 = i_4 - (i_4 >> 2) - (anInt7635 >> 2);
			i_12 = (anInt7635 >> 2) + (i_4 - (i_4 >> 2));
			i_13 = anInt7635 >> 1;
		} else {
			i_11 = i_7;
			i_12 = i_4;
			i_13 = i_4 >> 1;
		}

		Class259 class259_14 = aClass259Array7618[anIntArray7621[i_2]];
		int i_15 = class259_14.anInt3214;
		int i_16 = class259_14.anIntArray3215[i_15];
		boolean bool_17 = !aClass338Array7610[i_16].method6024();
		boolean bool_18 = bool_17;

		float[] floats_42;
		for (i_16 = 0; i_16 < class259_14.anInt3213; i_16++) {
			Class265 class265_41 = aClass265Array7617[class259_14.anIntArray3216[i_16]];
			floats_42 = aFloatArray7612;
			class265_41.method4790(floats_42, i_4 >> 1, bool_18);
		}

		int i_19;
		if (!bool_17) {
			i_16 = class259_14.anInt3214;
			i_19 = class259_14.anIntArray3215[i_16];
			aClass338Array7610[i_19].method6025(aFloatArray7612, i_4 >> 1);
		}

		int i_20;
		int i_22;
		if (bool_17) {
			for (i_16 = i_4 >> 1; i_16 < i_4; i_16++) {
				aFloatArray7612[i_16] = 0.0F;
			}
		} else {
			i_16 = i_4 >> 1;
			i_19 = i_4 >> 2;
			i_20 = i_4 >> 3;
			float[] floats_43 = aFloatArray7612;

			for (i_22 = 0; i_22 < i_16; i_22++) {
				floats_43[i_22] *= 0.5F;
			}

			for (i_22 = i_16; i_22 < i_4; i_22++) {
				floats_43[i_22] = -floats_43[i_4 - i_22 - 1];
			}

			float[] floats_44 = bool_3 ? aFloatArray7630 : aFloatArray7627;
			float[] floats_23 = bool_3 ? aFloatArray7631 : aFloatArray7628;
			float[] floats_24 = bool_3 ? aFloatArray7632 : aFloatArray7629;
			int[] ints_25 = bool_3 ? anIntArray7634 : anIntArray7633;

			int i_26;
			float f_27;
			float f_28;
			float f_29;
			float f_30;
			for (i_26 = 0; i_26 < i_19; i_26++) {
				f_27 = floats_43[i_26 * 4] - floats_43[i_4 - i_26 * 4 - 1];
				f_28 = floats_43[i_26 * 4 + 2] - floats_43[i_4 - i_26 * 4 - 3];
				f_29 = floats_44[i_26 * 2];
				f_30 = floats_44[i_26 * 2 + 1];
				floats_43[i_4 - i_26 * 4 - 1] = f_27 * f_29 - f_28 * f_30;
				floats_43[i_4 - i_26 * 4 - 3] = f_27 * f_30 + f_28 * f_29;
			}

			float f_31;
			float f_32;
			for (i_26 = 0; i_26 < i_20; i_26++) {
				f_27 = floats_43[i_16 + i_26 * 4 + 3];
				f_28 = floats_43[i_16 + i_26 * 4 + 1];
				f_29 = floats_43[i_26 * 4 + 3];
				f_30 = floats_43[i_26 * 4 + 1];
				floats_43[i_16 + i_26 * 4 + 3] = f_27 + f_29;
				floats_43[i_16 + i_26 * 4 + 1] = f_28 + f_30;
				f_31 = floats_44[i_16 - 4 - i_26 * 4];
				f_32 = floats_44[i_16 - 3 - i_26 * 4];
				floats_43[i_26 * 4 + 3] = (f_27 - f_29) * f_31 - (f_28 - f_30) * f_32;
				floats_43[i_26 * 4 + 1] = (f_28 - f_30) * f_31 + (f_27 - f_29) * f_32;
			}

			i_26 = Class159.method2739(i_4 - 1, -537302823);

			int i_45;
			int i_46;
			int i_47;
			int i_48;
			for (i_45 = 0; i_45 < i_26 - 3; i_45++) {
				i_46 = i_4 >> i_45 + 2;
				i_47 = 8 << i_45;

				for (i_48 = 0; i_48 < 2 << i_45; i_48++) {
					int i_49 = i_4 - i_46 * i_48 * 2;
					int i_50 = i_4 - i_46 * (i_48 * 2 + 1);

					for (int i_33 = 0; i_33 < i_4 >> i_45 + 4; i_33++) {
						int i_34 = i_33 * 4;
						float f_35 = floats_43[i_49 - 1 - i_34];
						float f_36 = floats_43[i_49 - 3 - i_34];
						float f_37 = floats_43[i_50 - 1 - i_34];
						float f_38 = floats_43[i_50 - 3 - i_34];
						floats_43[i_49 - 1 - i_34] = f_35 + f_37;
						floats_43[i_49 - 3 - i_34] = f_36 + f_38;
						float f_39 = floats_44[i_33 * i_47];
						float f_40 = floats_44[i_33 * i_47 + 1];
						floats_43[i_50 - 1 - i_34] = (f_35 - f_37) * f_39 - (f_36 - f_38) * f_40;
						floats_43[i_50 - 3 - i_34] = (f_36 - f_38) * f_39 + (f_35 - f_37) * f_40;
					}
				}
			}

			for (i_45 = 1; i_45 < i_20 - 1; i_45++) {
				i_46 = ints_25[i_45];
				if (i_45 < i_46) {
					i_47 = i_45 * 8;
					i_48 = i_46 * 8;
					f_31 = floats_43[i_47 + 1];
					floats_43[i_47 + 1] = floats_43[i_48 + 1];
					floats_43[i_48 + 1] = f_31;
					f_31 = floats_43[i_47 + 3];
					floats_43[i_47 + 3] = floats_43[i_48 + 3];
					floats_43[i_48 + 3] = f_31;
					f_31 = floats_43[i_47 + 5];
					floats_43[i_47 + 5] = floats_43[i_48 + 5];
					floats_43[i_48 + 5] = f_31;
					f_31 = floats_43[i_47 + 7];
					floats_43[i_47 + 7] = floats_43[i_48 + 7];
					floats_43[i_48 + 7] = f_31;
				}
			}

			for (i_45 = 0; i_45 < i_16; i_45++) {
				floats_43[i_45] = floats_43[i_45 * 2 + 1];
			}

			for (i_45 = 0; i_45 < i_20; i_45++) {
				floats_43[i_4 - 1 - i_45 * 2] = floats_43[i_45 * 4];
				floats_43[i_4 - 2 - i_45 * 2] = floats_43[i_45 * 4 + 1];
				floats_43[i_4 - i_19 - 1 - i_45 * 2] = floats_43[i_45 * 4 + 2];
				floats_43[i_4 - i_19 - 2 - i_45 * 2] = floats_43[i_45 * 4 + 3];
			}

			for (i_45 = 0; i_45 < i_20; i_45++) {
				f_28 = floats_24[i_45 * 2];
				f_29 = floats_24[i_45 * 2 + 1];
				f_30 = floats_43[i_16 + i_45 * 2];
				f_31 = floats_43[i_16 + i_45 * 2 + 1];
				f_32 = floats_43[i_4 - 2 - i_45 * 2];
				float f_51 = floats_43[i_4 - 1 - i_45 * 2];
				float f_52 = f_29 * (f_30 - f_32) + f_28 * (f_31 + f_51);
				floats_43[i_16 + i_45 * 2] = (f_30 + f_32 + f_52) * 0.5F;
				floats_43[i_4 - 2 - i_45 * 2] = (f_30 + f_32 - f_52) * 0.5F;
				f_52 = f_29 * (f_31 + f_51) - f_28 * (f_30 - f_32);
				floats_43[i_16 + i_45 * 2 + 1] = (f_31 - f_51 + f_52) * 0.5F;
				floats_43[i_4 - 1 - i_45 * 2] = (-f_31 + f_51 + f_52) * 0.5F;
			}

			for (i_45 = 0; i_45 < i_19; i_45++) {
				floats_43[i_45] = floats_43[i_16 + i_45 * 2] * floats_23[i_45 * 2] + floats_43[i_16 + i_45 * 2 + 1] * floats_23[i_45 * 2 + 1];
				floats_43[i_16 - 1 - i_45] = floats_43[i_16 + i_45 * 2] * floats_23[i_45 * 2 + 1] - floats_43[i_16 + i_45 * 2 + 1] * floats_23[i_45 * 2];
			}

			for (i_45 = 0; i_45 < i_19; i_45++) {
				floats_43[i_45 + (i_4 - i_19)] = -floats_43[i_45];
			}

			for (i_45 = 0; i_45 < i_19; i_45++) {
				floats_43[i_45] = floats_43[i_19 + i_45];
			}

			for (i_45 = 0; i_45 < i_19; i_45++) {
				floats_43[i_19 + i_45] = -floats_43[i_19 - i_45 - 1];
			}

			for (i_45 = 0; i_45 < i_19; i_45++) {
				floats_43[i_16 + i_45] = floats_43[i_4 - i_45 - 1];
			}

			for (i_45 = i_8; i_45 < i_9; i_45++) {
				f_28 = (float) Math.sin(((double) (i_45 - i_8) + 0.5D) / (double) i_10 * 0.5D * 3.141592653589793D);
				aFloatArray7612[i_45] *= (float) Math.sin(1.5707963267948966D * (double) f_28 * (double) f_28);
			}

			for (i_45 = i_11; i_45 < i_12; i_45++) {
				f_28 = (float) Math.sin(((double) (i_45 - i_11) + 0.5D) / (double) i_13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				aFloatArray7612[i_45] *= (float) Math.sin(1.5707963267948966D * (double) f_28 * (double) f_28);
			}
		}

		float[] floats_53 = null;
		if (this.anInt7623 > 0) {
			i_20 = i_4 + this.anInt7623 >> 2;
			floats_53 = new float[i_20];
			int i_21;
			if (!this.aBool7625) {
				for (i_21 = 0; i_21 < this.anInt7624; i_21++) {
					i_22 = i_21 + (this.anInt7623 >> 1);
					floats_53[i_21] += this.aFloatArray7622[i_22];
				}
			}

			if (!bool_17) {
				for (i_21 = i_8; i_21 < i_4 >> 1; i_21++) {
					i_22 = floats_53.length - (i_4 >> 1) + i_21;
					floats_53[i_22] += aFloatArray7612[i_21];
				}
			}
		}

		floats_42 = this.aFloatArray7622;
		this.aFloatArray7622 = aFloatArray7612;
		aFloatArray7612 = floats_42;
		this.anInt7623 = i_4;
		this.anInt7624 = i_12 - (i_4 >> 1);
		this.aBool7625 = bool_17;
		return floats_53;
	}

	static boolean method12268(Index index_0) {
		if (!aBool7611) {
			byte[] bytes_1 = index_0.getFile(0, 0);
			if (bytes_1 == null) {
				return false;
			}

			method12261(bytes_1);
		}

		return true;
	}

	public static Class282_Sub18 method12270(Index index_0, int i_1) {
		if (!method12268(index_0)) {
			index_0.loadCutscene(i_1);
			return null;
		} else {
			byte[] bytes_2 = index_0.getFile(i_1);
			if (bytes_2 == null) {
				return null;
			} else {
				Class282_Sub18 class282_sub18_3 = null;

				try {
					class282_sub18_3 = new Class282_Sub18(bytes_2);
				} catch (IOException ioexception_5) {
					ioexception_5.printStackTrace();
				}

				return class282_sub18_3;
			}
		}
	}

	static Class282_Sub18 method12271(Index index_0, int i_1, int i_2) {
		if (!method12268(index_0)) {
			index_0.load(i_1, i_2);
			return null;
		} else {
			byte[] bytes_3 = index_0.getFile(i_1, i_2);
			if (bytes_3 == null) {
				return null;
			} else {
				Class282_Sub18 class282_sub18_4 = null;

				try {
					class282_sub18_4 = new Class282_Sub18(bytes_3);
				} catch (IOException ioexception_6) {
					ioexception_6.printStackTrace();
				}

				return class282_sub18_4;
			}
		}
	}

	public Class282_Sub26_Sub1_Sub1 method12272() {
		Class2.method263(this, (byte) 24);
		return !this.method12276() || this.anInt7636 > this.anInt7605 && this.anInt7638 > this.anInt7605 / Class204.method3363(1396511710) ? new Class282_Sub26_Sub1_Sub1(this.anInt7605, this, this.aFloatArray7608, this.anInt7616, this.anInt7604, this.aBool7609) : null;
	}

	int method12273(int i_1) {
		int i_2 = 0;
		if (this.aFloatArray7608 == null) {
			this.anInt7623 = 0;
			this.aFloatArray7622 = new float[anInt7637];
			this.aFloatArray7608 = new float[this.anInt7620];
			this.anInt7636 = 0;
			this.anInt7626 = 0;
		}

		for (; i_1 > this.anInt7636 && this.anInt7626 < this.aByteArrayArray7606.length; this.anInt7626++) {
			float[] floats_3 = this.method12267(this.anInt7626);
			if (floats_3 != null) {
				int i_4 = this.anInt7636;
				int i_5 = floats_3.length;
				if (i_5 > this.anInt7620 - i_4) {
					i_5 = this.anInt7620 - i_4;
				}

				for (int i_6 = 0; i_6 < i_5; i_6++) {
					this.aFloatArray7608[i_4++] = floats_3[i_6];
				}

				i_2 += i_4 - this.anInt7636;
				this.anInt7636 = i_4;
			}
		}

		return i_2;
	}

	int method12275() {
		return this.anInt7636;
	}

	boolean method12276() {
		return this.anInt7636 < this.anInt7620 - 1;
	}

	int method12277() {
		return this.anInt7605;
	}

	Class282_Sub18(byte[] bytes_1) throws IOException {
		this.method12265(bytes_1);
	}

	void method12296(int i_1) {
		if (i_1 > this.anInt7620 - 1) {
			i_1 = this.anInt7620 - 1;
		}

		if (i_1 > this.anInt7636) {
			this.anInt7638 = this.method12273(i_1);
		} else {
			this.anInt7638 = 0;
		}

		if (!this.method12276()) {
			this.aFloatArray7622 = null;
		}

	}

	static float method12300(int i_0) {
		int i_1 = i_0 & 0x1fffff;
		int i_2 = i_0 & ~0x7fffffff;
		int i_3 = (i_0 & 0x7fe00000) >> 21;
		if (i_2 != 0) {
			i_1 = -i_1;
		}

		return (float) ((double) i_1 * Math.pow(2.0D, (double) (i_3 - 788)));
	}

}
