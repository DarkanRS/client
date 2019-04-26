import jaggl.OpenGL;

public class Class134 {

	Interface14 anInterface14_1602;
	OpenGlArrayBufferPointer aClass143_1617;
	OpenGlArrayBufferPointer aClass143_1603;
	OpenGlArrayBufferPointer aClass143_1605;
	int anInt1616;
	static float aFloat1600;
	int anInt1606 = 64;
	int anInt1608 = 1600;
	int anInt1610 = 64;
	int anInt1612 = 768;
	float[] aFloatArray1613 = new float[16];
	Node_Sub35_Sub1 aNode_Sub35_Sub1_1601 = new Node_Sub35_Sub1(786336);
	int anInt1609;
	int[] anIntArray1611;
	int[] anIntArray1615;
	int[] anIntArray1604;
	PointEntity[][] aEntityNode_Sub1_Sub1ArrayArray1614;
	PointEntity[][] aEntityNode_Sub1_Sub1ArrayArray1607;

	void method2328(OpenGLGraphicalRenderer class505_sub1_1) {
		this.anInterface14_1602 = class505_sub1_1.method13599(24, (byte[]) null, 196584, true);
		this.aClass143_1617 = new OpenGlArrayBufferPointer(this.anInterface14_1602, 5126, 2, 0);
		this.aClass143_1603 = new OpenGlArrayBufferPointer(this.anInterface14_1602, 5126, 3, 8);
		this.aClass143_1605 = new OpenGlArrayBufferPointer(this.anInterface14_1602, 5121, 4, 20);
	}

	void method2329(OpenGLGraphicalRenderer class505_sub1_1, Class151 class151_2) {
		if (class505_sub1_1.aClass384_8348 != null) {
			this.method2331(class505_sub1_1);
			float f_3 = class505_sub1_1.aClass384_8348.buf[2];
			float f_4 = class505_sub1_1.aClass384_8348.buf[6];
			float f_5 = class505_sub1_1.aClass384_8348.buf[10];
			float f_6 = class505_sub1_1.aClass384_8348.buf[14];

			try {
				int i_7 = 0;
				int i_8 = Integer.MAX_VALUE;
				int i_9 = 0;
				EntityNode_Sub1 class275_sub1_10 = class151_2.aClass464_1961.aEntityNode_Sub1_5554;

				for (EntityNode_Sub1 class275_sub1_11 = class275_sub1_10.aEntityNode_Sub1_7706; class275_sub1_11 != class275_sub1_10; class275_sub1_11 = class275_sub1_11.aEntityNode_Sub1_7706) {
					PointEntity class275_sub1_sub1_12 = (PointEntity) class275_sub1_11;
					int i_13 = (int) (f_3 * (float) (class275_sub1_sub1_12.x >> 12) + f_4 * (float) (class275_sub1_sub1_12.z >> 12) + f_5 * (float) (class275_sub1_sub1_12.y >> 12) + f_6);
					if (i_13 > i_9) {
						i_9 = i_13;
					}

					if (i_13 < i_8) {
						i_8 = i_13;
					}

					this.anIntArray1611[i_7++] = i_13;
				}

				int i_19 = i_9 - i_8;
				int i_20;
				if (i_19 + 2 > 1600) {
					i_20 = 1 + Class159.method2739(i_19, 1005279071) - this.anInt1609;
					i_19 = (i_19 >> i_20) + 2;
				} else {
					i_20 = 0;
					i_19 += 2;
				}

				EntityNode_Sub1 class275_sub1_21 = class275_sub1_10.aEntityNode_Sub1_7706;
				i_7 = 0;
				int i_14 = -2;
				boolean bool_15 = true;

				for (boolean bool_16 = true; class275_sub1_21 != class275_sub1_10; this.method2330(class505_sub1_1, i_19)) {
					this.anInt1616 = 0;

					int i_17;
					for (i_17 = 0; i_17 < i_19; i_17++) {
						this.anIntArray1615[i_17] = 0;
					}

					for (i_17 = 0; i_17 < 64; i_17++) {
						this.anIntArray1604[i_17] = 0;
					}

					for (; class275_sub1_21 != class275_sub1_10; class275_sub1_21 = class275_sub1_21.aEntityNode_Sub1_7706) {
						PointEntity class275_sub1_sub1_22 = (PointEntity) class275_sub1_21;
						if (bool_16) {
							i_14 = class275_sub1_sub1_22.rotation;
							bool_15 = class275_sub1_sub1_22.aBool10210;
							bool_16 = false;
						}

						if (i_7 > 0 && (i_14 != class275_sub1_sub1_22.rotation || bool_15 != class275_sub1_sub1_22.aBool10210)) {
							bool_16 = true;
							break;
						}

						int i_18 = this.anIntArray1611[i_7++] - i_8 >> i_20;
						if (i_18 < 1600) {
							if (this.anIntArray1615[i_18] < 64) {
								this.aEntityNode_Sub1_Sub1ArrayArray1614[i_18][this.anIntArray1615[i_18]++] = class275_sub1_sub1_22;
							} else {
								if (this.anIntArray1615[i_18] == 64) {
									if (this.anInt1616 == 64) {
										continue;
									}

									this.anIntArray1615[i_18] += 1 + this.anInt1616++;
								}

								PointEntity[] arr_10000 = this.aEntityNode_Sub1_Sub1ArrayArray1607[this.anIntArray1615[i_18] - 64 - 1];
								int i_10002 = this.anIntArray1615[i_18] - 64 - 1;
								int i_10004 = this.anIntArray1604[this.anIntArray1615[i_18] - 64 - 1];
								this.anIntArray1604[i_10002] = this.anIntArray1604[this.anIntArray1615[i_18] - 64 - 1] + 1;
								arr_10000[i_10004] = class275_sub1_sub1_22;
							}
						}
					}

					if (i_14 >= 0) {
						class505_sub1_1.method13581(i_14);
					} else {
						class505_sub1_1.method13581(-1);
					}

					if (bool_15 && class505_sub1_1.aFloat8432 != aFloat1600) {
						class505_sub1_1.IA(aFloat1600);
					} else if (class505_sub1_1.aFloat8432 != 1.0F) {
						class505_sub1_1.IA(1.0F);
					}
				}
			} catch (Exception exception_24) {
				;
			}

			this.method2332(class505_sub1_1);
		}

	}

	void method2330(OpenGLGraphicalRenderer class505_sub1_1, int i_2) {
		OpenGL.glGetFloatv(2982, this.aFloatArray1613, 0);
		float f_3 = this.aFloatArray1613[0];
		float f_4 = this.aFloatArray1613[4];
		float f_5 = this.aFloatArray1613[8];
		float f_6 = this.aFloatArray1613[1];
		float f_7 = this.aFloatArray1613[5];
		float f_8 = this.aFloatArray1613[9];
		float f_9 = f_3 + f_6;
		float f_10 = f_4 + f_7;
		float f_11 = f_5 + f_8;
		float f_12 = f_3 - f_6;
		float f_13 = f_4 - f_7;
		float f_14 = f_5 - f_8;
		float f_15 = f_6 - f_3;
		float f_16 = f_7 - f_4;
		float f_17 = f_8 - f_5;
		this.aNode_Sub35_Sub1_1601.index = 0;
		int i_18;
		int i_19;
		int i_20;
		int i_21;
		PointEntity class275_sub1_sub1_22;
		byte b_23;
		byte b_24;
		byte b_25;
		byte b_26;
		float f_27;
		float f_28;
		float f_29;
		int i_30;
		int i_31;
		PointEntity class275_sub1_sub1_32;
		int i_33;
		int i_34;
		byte b_35;
		float f_36;
		if (class505_sub1_1.aBool8467) {
			for (i_18 = i_2 - 1; i_18 >= 0; --i_18) {
				i_19 = this.anIntArray1615[i_18] > 64 ? 64 : this.anIntArray1615[i_18];
				if (i_19 > 0) {
					for (i_20 = i_19 - 1; i_20 >= 0; --i_20) {
						class275_sub1_sub1_32 = this.aEntityNode_Sub1_Sub1ArrayArray1614[i_18][i_20];
						i_33 = class275_sub1_sub1_32.color;
						b_23 = (byte) (i_33 >> 16);
						b_24 = (byte) (i_33 >> 8);
						b_25 = (byte) i_33;
						b_26 = (byte) (i_33 >>> 24);
						f_27 = (float) (class275_sub1_sub1_32.x >> 12);
						f_28 = (float) (class275_sub1_sub1_32.z >> 12);
						f_29 = (float) (class275_sub1_sub1_32.y >> 12);
						i_30 = class275_sub1_sub1_32.size >> 12;
						this.aNode_Sub35_Sub1_1601.method14688(0.0F);
						this.aNode_Sub35_Sub1_1601.method14688(0.0F);
						this.aNode_Sub35_Sub1_1601.method14688(f_27 + f_9 * (float) (-i_30));
						this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_10 * (float) (-i_30));
						this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_11 * (float) (-i_30));
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
						this.aNode_Sub35_Sub1_1601.method14688(0.0F);
						this.aNode_Sub35_Sub1_1601.method14688(1.0F);
						this.aNode_Sub35_Sub1_1601.method14688(f_27 + f_15 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_16 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_17 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
						this.aNode_Sub35_Sub1_1601.method14688(1.0F);
						this.aNode_Sub35_Sub1_1601.method14688(1.0F);
						this.aNode_Sub35_Sub1_1601.method14688(f_27 + f_9 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_10 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_11 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
						this.aNode_Sub35_Sub1_1601.method14688(1.0F);
						this.aNode_Sub35_Sub1_1601.method14688(0.0F);
						this.aNode_Sub35_Sub1_1601.method14688(f_27 + f_12 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_13 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_14 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
					}

					if (this.anIntArray1615[i_18] > 64) {
						i_20 = this.anIntArray1615[i_18] - 64 - 1;

						for (i_21 = this.anIntArray1604[i_20] - 1; i_21 >= 0; --i_21) {
							class275_sub1_sub1_22 = this.aEntityNode_Sub1_Sub1ArrayArray1607[i_20][i_21];
							i_34 = class275_sub1_sub1_22.color;
							b_24 = (byte) (i_34 >> 16);
							b_25 = (byte) (i_34 >> 8);
							b_26 = (byte) i_34;
							b_35 = (byte) (i_34 >>> 24);
							f_28 = (float) (class275_sub1_sub1_22.x >> 12);
							f_29 = (float) (class275_sub1_sub1_22.z >> 12);
							f_36 = (float) (class275_sub1_sub1_22.y >> 12);
							i_31 = class275_sub1_sub1_22.size >> 12;
							this.aNode_Sub35_Sub1_1601.method14688(0.0F);
							this.aNode_Sub35_Sub1_1601.method14688(0.0F);
							this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_9 * (float) (-i_31));
							this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_10 * (float) (-i_31));
							this.aNode_Sub35_Sub1_1601.method14688(f_36 + f_11 * (float) (-i_31));
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
							this.aNode_Sub35_Sub1_1601.method14688(0.0F);
							this.aNode_Sub35_Sub1_1601.method14688(1.0F);
							this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_15 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_16 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14688(f_36 + f_17 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
							this.aNode_Sub35_Sub1_1601.method14688(1.0F);
							this.aNode_Sub35_Sub1_1601.method14688(1.0F);
							this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_9 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_10 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14688(f_36 + f_11 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
							this.aNode_Sub35_Sub1_1601.method14688(1.0F);
							this.aNode_Sub35_Sub1_1601.method14688(0.0F);
							this.aNode_Sub35_Sub1_1601.method14688(f_28 + f_12 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14688(f_29 + f_13 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14688(f_36 + f_14 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
						}
					}
				}
			}
		} else {
			for (i_18 = i_2 - 1; i_18 >= 0; --i_18) {
				i_19 = this.anIntArray1615[i_18] > 64 ? 64 : this.anIntArray1615[i_18];
				if (i_19 > 0) {
					for (i_20 = i_19 - 1; i_20 >= 0; --i_20) {
						class275_sub1_sub1_32 = this.aEntityNode_Sub1_Sub1ArrayArray1614[i_18][i_20];
						i_33 = class275_sub1_sub1_32.color;
						b_23 = (byte) (i_33 >> 16);
						b_24 = (byte) (i_33 >> 8);
						b_25 = (byte) i_33;
						b_26 = (byte) (i_33 >>> 24);
						f_27 = (float) (class275_sub1_sub1_32.x >> 12);
						f_28 = (float) (class275_sub1_sub1_32.z >> 12);
						f_29 = (float) (class275_sub1_sub1_32.y >> 12);
						i_30 = class275_sub1_sub1_32.size >> 12;
						this.aNode_Sub35_Sub1_1601.method14685(0.0F);
						this.aNode_Sub35_Sub1_1601.method14685(0.0F);
						this.aNode_Sub35_Sub1_1601.method14685(f_27 + f_9 * (float) (-i_30));
						this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_10 * (float) (-i_30));
						this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_11 * (float) (-i_30));
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
						this.aNode_Sub35_Sub1_1601.method14685(0.0F);
						this.aNode_Sub35_Sub1_1601.method14685(1.0F);
						this.aNode_Sub35_Sub1_1601.method14685(f_27 + f_15 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_16 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_17 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
						this.aNode_Sub35_Sub1_1601.method14685(1.0F);
						this.aNode_Sub35_Sub1_1601.method14685(1.0F);
						this.aNode_Sub35_Sub1_1601.method14685(f_27 + f_9 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_10 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_11 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
						this.aNode_Sub35_Sub1_1601.method14685(1.0F);
						this.aNode_Sub35_Sub1_1601.method14685(0.0F);
						this.aNode_Sub35_Sub1_1601.method14685(f_27 + f_12 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_13 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_14 * (float) i_30);
						this.aNode_Sub35_Sub1_1601.writeByte(b_23);
						this.aNode_Sub35_Sub1_1601.writeByte(b_24);
						this.aNode_Sub35_Sub1_1601.writeByte(b_25);
						this.aNode_Sub35_Sub1_1601.writeByte(b_26);
					}

					if (this.anIntArray1615[i_18] > 64) {
						i_20 = this.anIntArray1615[i_18] - 64 - 1;

						for (i_21 = this.anIntArray1604[i_20] - 1; i_21 >= 0; --i_21) {
							class275_sub1_sub1_22 = this.aEntityNode_Sub1_Sub1ArrayArray1607[i_20][i_21];
							i_34 = class275_sub1_sub1_22.color;
							b_24 = (byte) (i_34 >> 16);
							b_25 = (byte) (i_34 >> 8);
							b_26 = (byte) i_34;
							b_35 = (byte) (i_34 >>> 24);
							f_28 = (float) (class275_sub1_sub1_22.x >> 12);
							f_29 = (float) (class275_sub1_sub1_22.z >> 12);
							f_36 = (float) (class275_sub1_sub1_22.y >> 12);
							i_31 = class275_sub1_sub1_22.size >> 12;
							this.aNode_Sub35_Sub1_1601.method14685(0.0F);
							this.aNode_Sub35_Sub1_1601.method14685(0.0F);
							this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_9 * (float) (-i_31));
							this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_10 * (float) (-i_31));
							this.aNode_Sub35_Sub1_1601.method14685(f_36 + f_11 * (float) (-i_31));
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
							this.aNode_Sub35_Sub1_1601.method14685(0.0F);
							this.aNode_Sub35_Sub1_1601.method14685(1.0F);
							this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_15 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_16 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14685(f_36 + f_17 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
							this.aNode_Sub35_Sub1_1601.method14685(1.0F);
							this.aNode_Sub35_Sub1_1601.method14685(1.0F);
							this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_9 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_10 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14685(f_36 + f_11 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
							this.aNode_Sub35_Sub1_1601.method14685(1.0F);
							this.aNode_Sub35_Sub1_1601.method14685(0.0F);
							this.aNode_Sub35_Sub1_1601.method14685(f_28 + f_12 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14685(f_29 + f_13 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.method14685(f_36 + f_14 * (float) i_31);
							this.aNode_Sub35_Sub1_1601.writeByte(b_24);
							this.aNode_Sub35_Sub1_1601.writeByte(b_25);
							this.aNode_Sub35_Sub1_1601.writeByte(b_26);
							this.aNode_Sub35_Sub1_1601.writeByte(b_35);
						}
					}
				}
			}
		}

		if (this.aNode_Sub35_Sub1_1601.index != 0) {
			this.anInterface14_1602.method106(24, this.aNode_Sub35_Sub1_1601.buffer, this.aNode_Sub35_Sub1_1601.index);
			class505_sub1_1.method13647(this.aClass143_1603, (OpenGlArrayBufferPointer) null, this.aClass143_1605, this.aClass143_1617);
			class505_sub1_1.method13603(this.aNode_Sub35_Sub1_1601.index / 24);
		}

	}

	void method2331(OpenGLGraphicalRenderer class505_sub1_1) {
		aFloat1600 = class505_sub1_1.aFloat8432;
		class505_sub1_1.method13607();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class505_sub1_1.method13623(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2332(OpenGLGraphicalRenderer class505_sub1_1) {
		class505_sub1_1.method13623(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class505_sub1_1.aFloat8432 != aFloat1600) {
			class505_sub1_1.IA(aFloat1600);
		}

	}

	Class134() {
		this.anInt1606 = 64;
		this.anInt1612 = 768;
		this.anInt1608 = 1600;
		this.anInt1609 = Class159.method2739(1600, 725171944);
		this.anInt1610 = 64;
		this.anIntArray1611 = new int[8191];
		this.anIntArray1615 = new int[1600];
		this.anIntArray1604 = new int[64];
		this.aEntityNode_Sub1_Sub1ArrayArray1614 = new PointEntity[1600][64];
		this.aEntityNode_Sub1_Sub1ArrayArray1607 = new PointEntity[64][768];
		this.anInt1616 = 0;
	}

}
