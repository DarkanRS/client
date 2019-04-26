public class i extends Ground implements Interface40 {

	long nativeid;
	NodeCollection aClass482_7143 = new NodeCollection();
	ja aja7144;

	public void method6721(Node_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass482_7143.append(class282_sub24_1);
		this.A(class282_sub24_1.hashCode(), class282_sub24_1.method12368((byte) -66), class282_sub24_1.method12369(), class282_sub24_1.method12394(1778675317), class282_sub24_1.method12370(), class282_sub24_1.method12371(-2137870600), ints_2);
	}

	native void G(ja var1, ba var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

	public native void z(Shadow var1, int var2, int var3, int var4, int var5, boolean var6);

	native void ap(float[] var1);

	public native void LA(int var1, int var2, int var3);

	public final void method6707(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, HDWaterTile class90_11, boolean bool_12) {
		this.ya(i_1, i_2, ints_3, ints_4, ints_5, ints_6, ints_7, ints_8, ints_9, ints_10, class90_11.color, class90_11.scale, class90_11.intensity, bool_12);
	}

	public void method6710(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
		this.aja7144.nx().method318(this, i_1, i_2, i_3, i_4, i_5, i_6, i_7, bools_8);
	}

	public void method6714(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, HDWaterTile class90_14, boolean bool_15) {
		boolean bool_16 = false;
		if (ints_10 != null) {
			int[] ints_17 = ints_10;

			for (int i_18 = 0; i_18 < ints_17.length; i_18++) {
				int i_33 = ints_17[i_18];
				if (i_33 != -1) {
					bool_16 = true;
					break;
				}
			}
		}

		int i_31 = ints_10.length;
		int[] ints_32 = new int[i_31 * 3];
		int[] ints_19 = new int[i_31 * 3];
		int[] ints_20 = new int[i_31 * 3];
		int[] ints_21 = new int[i_31 * 3];
		int[] ints_22 = new int[i_31 * 3];
		int[] ints_23 = ints_11 != null ? new int[i_31 * 3] : null;
		int[] ints_24 = ints_4 != null ? new int[i_31 * 3] : null;
		int[] ints_25 = ints_6 != null ? new int[i_31 * 3] : null;
		int i_26 = 0;

		for (int i_27 = 0; i_27 < i_31; i_27++) {
			int i_28 = ints_7[i_27];
			int i_29 = ints_8[i_27];
			int i_30 = ints_9[i_27];
			ints_32[i_26] = ints_3[i_28];
			ints_19[i_26] = ints_5[i_28];
			ints_20[i_26] = ints_10[i_27];
			ints_21[i_26] = ints_12[i_27];
			ints_22[i_26] = ints_13[i_27];
			if (ints_11 != null) {
				ints_23[i_26] = ints_11[i_27];
			}

			if (ints_4 != null) {
				ints_24[i_26] = ints_4[i_28];
			}

			if (ints_6 != null) {
				ints_25[i_26] = ints_6[i_28];
			}

			++i_26;
			ints_32[i_26] = ints_3[i_29];
			ints_19[i_26] = ints_5[i_29];
			ints_20[i_26] = ints_10[i_27];
			ints_21[i_26] = ints_12[i_27];
			ints_22[i_26] = ints_13[i_27];
			if (ints_11 != null) {
				ints_23[i_26] = ints_11[i_27];
			}

			if (ints_4 != null) {
				ints_24[i_26] = ints_4[i_29];
			}

			if (ints_6 != null) {
				ints_25[i_26] = ints_6[i_29];
			}

			++i_26;
			ints_32[i_26] = ints_3[i_30];
			ints_19[i_26] = ints_5[i_30];
			ints_20[i_26] = ints_10[i_27];
			ints_21[i_26] = ints_12[i_27];
			ints_22[i_26] = ints_13[i_27];
			if (ints_11 != null) {
				ints_23[i_26] = ints_11[i_27];
			}

			if (ints_4 != null) {
				ints_24[i_26] = ints_4[i_30];
			}

			if (ints_6 != null) {
				ints_25[i_26] = ints_6[i_30];
			}

			++i_26;
		}

		if (bool_16 || ints_23 != null) {
			this.ya(i_1, i_2, ints_32, ints_24, ints_19, ints_25, ints_20, ints_23, ints_21, ints_22, class90_14.color, class90_14.scale, class90_14.intensity, bool_15);
		}

	}

	public void method6708(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, HDWaterTile class90_14) {
		boolean bool_16 = false;
		if (ints_10 != null) {
			int[] ints_17 = ints_10;

			for (int i_18 = 0; i_18 < ints_17.length; i_18++) {
				int i_33 = ints_17[i_18];
				if (i_33 != -1) {
					bool_16 = true;
					break;
				}
			}
		}

		int i_31 = ints_10.length;
		int[] ints_32 = new int[i_31 * 3];
		int[] ints_19 = new int[i_31 * 3];
		int[] ints_20 = new int[i_31 * 3];
		int[] ints_21 = new int[i_31 * 3];
		int[] ints_22 = new int[i_31 * 3];
		int[] ints_23 = ints_11 != null ? new int[i_31 * 3] : null;
		int[] ints_24 = ints_4 != null ? new int[i_31 * 3] : null;
		int[] ints_25 = ints_6 != null ? new int[i_31 * 3] : null;
		int i_26 = 0;

		for (int i_27 = 0; i_27 < i_31; i_27++) {
			int i_28 = ints_7[i_27];
			int i_29 = ints_8[i_27];
			int i_30 = ints_9[i_27];
			ints_32[i_26] = ints_3[i_28];
			ints_19[i_26] = ints_5[i_28];
			ints_20[i_26] = ints_10[i_27];
			ints_21[i_26] = ints_12[i_27];
			ints_22[i_26] = ints_13[i_27];
			if (ints_11 != null) {
				ints_23[i_26] = ints_11[i_27];
			}

			if (ints_4 != null) {
				ints_24[i_26] = ints_4[i_28];
			}

			if (ints_6 != null) {
				ints_25[i_26] = ints_6[i_28];
			}

			++i_26;
			ints_32[i_26] = ints_3[i_29];
			ints_19[i_26] = ints_5[i_29];
			ints_20[i_26] = ints_10[i_27];
			ints_21[i_26] = ints_12[i_27];
			ints_22[i_26] = ints_13[i_27];
			if (ints_11 != null) {
				ints_23[i_26] = ints_11[i_27];
			}

			if (ints_4 != null) {
				ints_24[i_26] = ints_4[i_29];
			}

			if (ints_6 != null) {
				ints_25[i_26] = ints_6[i_29];
			}

			++i_26;
			ints_32[i_26] = ints_3[i_30];
			ints_19[i_26] = ints_5[i_30];
			ints_20[i_26] = ints_10[i_27];
			ints_21[i_26] = ints_12[i_27];
			ints_22[i_26] = ints_13[i_27];
			if (ints_11 != null) {
				ints_23[i_26] = ints_11[i_27];
			}

			if (ints_4 != null) {
				ints_24[i_26] = ints_4[i_30];
			}

			if (ints_6 != null) {
				ints_25[i_26] = ints_6[i_30];
			}

			++i_26;
		}

		if (bool_16 || ints_23 != null) {
			this.ya(i_1, i_2, ints_32, ints_24, ints_19, ints_25, ints_20, ints_23, ints_21, ints_22, class90_14.color, class90_14.scale, class90_14.intensity, false);
		}

	}

	public void method6717(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5) {
		int i_7 = 0;
		float[] floats_8 = new float[this.aClass482_7143.size()];

		for (Node_Sub24 class282_sub24_9 = (Node_Sub24) this.aClass482_7143.head(); class282_sub24_9 != null; class282_sub24_9 = (Node_Sub24) this.aClass482_7143.next(89434836)) {
			floats_8[i_7++] = class282_sub24_9.method12395(-730968094);
		}

		this.t(floats_8);

		for (int i_13 = 0; i_13 < i_3 + i_3; i_13++) {
			for (int i_10 = 0; i_10 < i_3 + i_3; i_10++) {
				if (bools_4[i_13][i_10]) {
					int i_11 = i_13 + (i_1 - i_3);
					int i_12 = i_10 + (i_2 - i_3);
					if (i_11 >= 0 && i_11 < this.width && i_12 >= 0 && i_12 < this.length) {
						this.aja7144.nx().method316(this, i_11, i_12);
					}
				}
			}
		}

	}

	public void method6715(int i_1, int i_2, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
		this.aja7144.nx().method318(this, i_1, i_2, 1024, i_4, i_5, i_6, i_7, bools_8);
	}

	public native Shadow w(int var1, int var2, Shadow var3);

	public native void UA(Shadow var1, int var2, int var3, int var4);

	public native void NA(Shadow var1, int var2, int var3, int var4);

	public native void u(Shadow var1, int var2, int var3, int var4, int var5, boolean var6);

	public void method6713(Node_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass482_7143.append(class282_sub24_1);
		this.A(class282_sub24_1.hashCode(), class282_sub24_1.method12368((byte) -36), class282_sub24_1.method12369(), class282_sub24_1.method12394(1367026999), class282_sub24_1.method12370(), class282_sub24_1.method12371(-2137393590), ints_2);
	}

	native void A(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7);

	native void t(float[] var1);

	public native void m(int var1, int var2, int var3);

	public boolean method6718(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return true;
	}

	public final void method6706(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, HDWaterTile class90_11, boolean bool_12) {
		this.ya(i_1, i_2, ints_3, ints_4, ints_5, ints_6, ints_7, ints_8, ints_9, ints_10, class90_11.color, class90_11.scale, class90_11.intensity, bool_12);
	}

	public native void p();

	public void finalize() {
		if (this.nativeid != 0L) {
			Class156.method2642(this, (byte) 91);
		}

	}

	public void method6716(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5, int i_6) {
		int i_7 = 0;
		float[] floats_8 = new float[this.aClass482_7143.size()];

		for (Node_Sub24 class282_sub24_9 = (Node_Sub24) this.aClass482_7143.head(); class282_sub24_9 != null; class282_sub24_9 = (Node_Sub24) this.aClass482_7143.next(-1062392884)) {
			floats_8[i_7++] = class282_sub24_9.method12395(1226134811);
		}

		this.t(floats_8);

		for (int i_13 = 0; i_13 < i_3 + i_3; i_13++) {
			for (int i_10 = 0; i_10 < i_3 + i_3; i_10++) {
				if (bools_4[i_13][i_10]) {
					int i_11 = i_1 - i_3 + i_13;
					int i_12 = i_2 - i_3 + i_10;
					if (i_11 >= 0 && i_11 < this.width && i_12 >= 0 && i_12 < this.length) {
						this.aja7144.nx().method316(this, i_11, i_12);
					}
				}
			}
		}

	}

	public native Shadow s(int var1, int var2, Shadow var3);

	native void ya(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

	public boolean method6712(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
		return true;
	}

	public boolean method6719(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return true;
	}

	public native void d(Shadow var1, int var2, int var3, int var4, int var5, boolean var6);

	public native void a(Shadow var1, int var2, int var3, int var4, int var5, boolean var6);

	public native void e();

	public native void ma(boolean var1);

	public void method6720(Node_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass482_7143.append(class282_sub24_1);
		this.A(class282_sub24_1.hashCode(), class282_sub24_1.method12368((byte) -36), class282_sub24_1.method12369(), class282_sub24_1.method12394(1861802480), class282_sub24_1.method12370(), class282_sub24_1.method12371(-2141041870), ints_2);
	}

	public native void x(boolean var1);

	public void method6711(Node_Sub24 class282_sub24_1, int[] ints_2) {
		this.aClass482_7143.append(class282_sub24_1);
		this.A(class282_sub24_1.hashCode(), class282_sub24_1.method12368((byte) -75), class282_sub24_1.method12369(), class282_sub24_1.method12394(1800255406), class282_sub24_1.method12370(), class282_sub24_1.method12371(-2136043298), ints_2);
	}

	public void method6723(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
		this.aja7144.nx().method318(this, i_1, i_2, i_3, i_4, i_5, i_6, i_7, bools_8);
	}

	public native void b(Shadow var1, int var2, int var3, int var4, int var5, boolean var6);

	public native void y(boolean var1);

	public native void SA();

	native void az(ja var1, ba var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

	native void ax(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

	i(ja ja_1, ba ba_2, int i_3, int i_4, int[][] ints_5, int[][] ints_6, int i_7, int i_8, int i_9) {
		super(i_3, i_4, i_7, ints_5);
		this.aja7144 = ja_1;
		this.G(this.aja7144, ba_2, i_3, i_4, this.tileHeights, ints_6, i_7, i_8, i_9);
	}

}
