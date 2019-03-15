public class Class124 {

	boolean aBool1556 = true;
	int anInt1563 = -1;
	OpenGLGraphicalRenderer aClass505_Sub1_1558;
	Class130 aClass130_1559;
	int anInt1557;
	int anInt1561;
	int anInt1564;
	Class137_Sub1 aClass137_Sub1_1560;
	Interface15 anInterface15_1565;
	Class131_Sub2 aClass131_Sub2_1567;

	void method2155() {
		this.method2165(this.anInterface15_1565, this.anInt1564);
	}

	void method2156(byte[] bytes_1, int i_2) {
		this.aClass131_Sub2_1567.method111(bytes_1, i_2 * 2);
		this.method2165(this.aClass131_Sub2_1567, i_2);
	}

	Class124(OpenGLGraphicalRenderer class505_sub1_1, Class130 class130_2, OpenGLGround class390_sub2_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.aClass505_Sub1_1558 = class505_sub1_1;
		this.aClass130_1559 = class130_2;
		this.anInt1557 = i_7;
		this.anInt1561 = i_8;
		int i_9 = 1 << i_6;
		int i_10 = 0;
		int i_11 = i_4 << i_6;
		int i_12 = i_5 << i_6;

		int i_14;
		int i_15;
		for (int i_13 = 0; i_13 < i_9; i_13++) {
			i_14 = class390_sub2_3.width * (i_12 + i_13) + i_11;

			for (i_15 = 0; i_15 < i_9; i_15++) {
				short[] shorts_20 = class390_sub2_3.materialIndices[i_14++];
				if (shorts_20 != null) {
					i_10 += shorts_20.length;
				}
			}
		}

		this.anInt1564 = i_10;
		if (i_10 > 0) {
			RsByteBuffer rsbytebuffer_19 = new RsByteBuffer(i_10 * 2);
			int i_16;
			short[] shorts_17;
			int i_18;
			if (this.aClass505_Sub1_1558.aBool8467) {
				for (i_14 = 0; i_14 < i_9; i_14++) {
					i_15 = class390_sub2_3.width * (i_12 + i_14) + i_11;

					for (i_16 = 0; i_16 < i_9; i_16++) {
						shorts_17 = class390_sub2_3.materialIndices[i_15++];
						if (shorts_17 != null) {
							for (i_18 = 0; i_18 < shorts_17.length; i_18++) {
								rsbytebuffer_19.writeShort(shorts_17[i_18] & 0xffff);
							}
						}
					}
				}
			} else {
				for (i_14 = 0; i_14 < i_9; i_14++) {
					i_15 = class390_sub2_3.width * (i_12 + i_14) + i_11;

					for (i_16 = 0; i_16 < i_9; i_16++) {
						shorts_17 = class390_sub2_3.materialIndices[i_15++];
						if (shorts_17 != null) {
							for (i_18 = 0; i_18 < shorts_17.length; i_18++) {
								rsbytebuffer_19.writeLEShort(shorts_17[i_18] & 0xffff, (byte) -58);
							}
						}
					}
				}
			}

			this.anInterface15_1565 = this.aClass505_Sub1_1558.method13598(rsbytebuffer_19.buffer, rsbytebuffer_19.index, false);
			this.aClass131_Sub2_1567 = new Class131_Sub2(this.aClass505_Sub1_1558, (byte[]) null, 1);
		} else {
			this.aClass137_Sub1_1560 = null;
		}

	}

	void method2157() {
		if (this.aBool1556) {
			this.aBool1556 = false;
			byte[] bytes_1 = this.aClass130_1559.aByteArray1588;
			byte[] bytes_2 = this.aClass505_Sub1_1558.aByteArray8503;
			int i_3 = 0;
			int i_4 = this.aClass130_1559.anInt1586;
			int i_5 = this.anInt1557 + this.aClass130_1559.anInt1586 * this.anInt1561;

			int i_6;
			int i_7;
			for (i_6 = -128; i_6 < 0; i_6++) {
				i_3 = (i_3 << 8) - i_3;

				for (i_7 = -128; i_7 < 0; i_7++) {
					if (bytes_1[i_5++] != 0) {
						++i_3;
					}
				}

				i_5 += i_4 - 128;
			}

			if (this.aClass137_Sub1_1560 != null && i_3 == this.anInt1563) {
				this.aBool1556 = false;
			} else {
				this.anInt1563 = i_3;
				i_6 = 0;
				i_5 = i_4 * this.anInt1561 + this.anInt1557;

				for (i_7 = -128; i_7 < 0; i_7++) {
					for (int i_8 = -128; i_8 < 0; i_8++) {
						if (bytes_1[i_5] != 0) {
							bytes_2[i_6++] = 68;
						} else {
							int i_9 = 0;
							if (bytes_1[i_5 - 1] != 0) {
								++i_9;
							}

							if (bytes_1[i_5 + 1] != 0) {
								++i_9;
							}

							if (bytes_1[i_5 - i_4] != 0) {
								++i_9;
							}

							if (bytes_1[i_5 + i_4] != 0) {
								++i_9;
							}

							bytes_2[i_6++] = (byte) (i_9 * 17);
						}

						++i_5;
					}

					i_5 += this.aClass130_1559.anInt1586 - 128;
				}

				if (this.aClass137_Sub1_1560 == null) {
					this.aClass137_Sub1_1560 = new Class137_Sub1(this.aClass505_Sub1_1558, 3553, Class150.aClass150_1951, Class76.aClass76_751, 128, 128, false, this.aClass505_Sub1_1558.aByteArray8503, Class150.aClass150_1951, false);
					this.aClass137_Sub1_1560.method14445(false, false);
					this.aClass137_Sub1_1560.method2351(true);
				} else {
					this.aClass137_Sub1_1560.method14455(0, 128, 128, this.aClass505_Sub1_1558.aByteArray8503, Class150.aClass150_1951, 0, false);
				}
			}
		}

	}

	void method2165(Interface15 interface15_1, int i_2) {
		if (i_2 != 0) {
			this.method2157();
			this.aClass505_Sub1_1558.method13654(this.aClass137_Sub1_1560);
			this.aClass505_Sub1_1558.method13611(interface15_1, 0, i_2);
		}

	}

}
