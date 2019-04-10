public class ClanVarDefinitions {

	public char aChar4832;
	public int baseVar;
	public int startBit;
	public int endBit;

	void method6814(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.aChar4832 = Utils.cp1252ToChar(rsbytebuffer_1.readByte());
		} else if (i_2 == 3) {
			this.baseVar = rsbytebuffer_1.readUnsignedShort();
			this.startBit = rsbytebuffer_1.readUnsignedByte();
			this.endBit = rsbytebuffer_1.readUnsignedByte();
		}

	}

	void method6816(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method6814(rsbytebuffer_1, i_3);
		}
	}

	public static final void method6823() {
		int i_1 = Class393.preferences.aClass468_Sub27_8209.method12952((byte) 47);
		if (i_1 == 0) {
			IndexLoaders.MAP_REGION_DECODER.method4440((byte[][][]) null);
			Class534_Sub2.method12847(0, (byte) 57);
		} else if (i_1 == 1) {
			PingRequest.method8744((byte) 0, -1832206339);
			Class534_Sub2.method12847(512, (byte) 105);
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
				Class17.method570();
			}
		} else {
			PingRequest.method8744((byte) (client.anInt7286 - 4 & 0xff), 688949228);
			Class534_Sub2.method12847(2, (byte) 69);
		}

		client.anInt7472 = Class4.anInt35;
	}

	static void method6824(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_8 = 0;
		int i_9 = i_3;
		int i_10 = 0;
		int i_11 = i_2 - i_6;
		int i_12 = i_3 - i_6;
		int i_13 = i_2 * i_2;
		int i_14 = i_3 * i_3;
		int i_15 = i_11 * i_11;
		int i_16 = i_12 * i_12;
		int i_17 = i_14 << 1;
		int i_18 = i_13 << 1;
		int i_19 = i_16 << 1;
		int i_20 = i_15 << 1;
		int i_21 = i_3 << 1;
		int i_22 = i_12 << 1;
		int i_23 = i_17 + (1 - i_21) * i_13;
		int i_24 = i_14 - i_18 * (i_21 - 1);
		int i_25 = i_19 + (1 - i_22) * i_15;
		int i_26 = i_16 - i_20 * (i_22 - 1);
		int i_27 = i_13 << 2;
		int i_28 = i_14 << 2;
		int i_29 = i_15 << 2;
		int i_30 = i_16 << 2;
		int i_31 = i_17 * 3;
		int i_32 = i_18 * (i_21 - 3);
		int i_33 = i_19 * 3;
		int i_34 = i_20 * (i_22 - 3);
		int i_35 = i_28;
		int i_36 = (i_3 - 1) * i_27;
		int i_37 = i_30;
		int i_38 = i_29 * (i_12 - 1);
		int i_40;
		int i_41;
		int i_42;
		int i_43;
		if (i_1 >= Class532_Sub3_Sub1.anInt7070 && i_1 <= Class532_Sub3_Sub1.anInt7068) {
			int[] ints_39 = Class532_Sub3_Sub1.anIntArrayArray7072[i_1];
			i_40 = EntityNode.method4890(i_0 - i_2, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 1055094720);
			i_41 = EntityNode.method4890(i_0 + i_2, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 651225496);
			i_42 = EntityNode.method4890(i_0 - i_11, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 568370220);
			i_43 = EntityNode.method4890(i_0 + i_11, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, -475666035);
			KeyHoldInputSubscriber.method3922(ints_39, i_40, i_42, i_5, (byte) -27);
			KeyHoldInputSubscriber.method3922(ints_39, i_42, i_43, i_4, (byte) -31);
			KeyHoldInputSubscriber.method3922(ints_39, i_43, i_41, i_5, (byte) 16);
		}

		while (i_9 > 0) {
			boolean bool_47 = i_9 <= i_12;
			if (bool_47) {
				if (i_25 < 0) {
					while (i_25 < 0) {
						i_25 += i_33;
						i_26 += i_37;
						i_33 += i_30;
						i_37 += i_30;
						++i_10;
					}
				}

				if (i_26 < 0) {
					i_25 += i_33;
					i_26 += i_37;
					i_33 += i_30;
					i_37 += i_30;
					++i_10;
				}

				i_25 += -i_38;
				i_26 += -i_34;
				i_34 -= i_29;
				i_38 -= i_29;
			}

			if (i_23 < 0) {
				while (i_23 < 0) {
					i_23 += i_31;
					i_24 += i_35;
					i_31 += i_28;
					i_35 += i_28;
					++i_8;
				}
			}

			if (i_24 < 0) {
				i_23 += i_31;
				i_24 += i_35;
				i_31 += i_28;
				i_35 += i_28;
				++i_8;
			}

			i_23 += -i_36;
			i_24 += -i_32;
			i_32 -= i_27;
			i_36 -= i_27;
			--i_9;
			i_40 = i_1 - i_9;
			i_41 = i_9 + i_1;
			if (i_41 >= Class532_Sub3_Sub1.anInt7070 && i_40 <= Class532_Sub3_Sub1.anInt7068) {
				i_42 = EntityNode.method4890(i_0 + i_8, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 682389056);
				i_43 = EntityNode.method4890(i_0 - i_8, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 304939185);
				if (bool_47) {
					int i_44 = EntityNode.method4890(i_0 + i_10, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, -849253478);
					int i_45 = EntityNode.method4890(i_0 - i_10, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, -1762410169);
					int[] ints_46;
					if (i_40 >= Class532_Sub3_Sub1.anInt7070) {
						ints_46 = Class532_Sub3_Sub1.anIntArrayArray7072[i_40];
						KeyHoldInputSubscriber.method3922(ints_46, i_43, i_45, i_5, (byte) -1);
						KeyHoldInputSubscriber.method3922(ints_46, i_45, i_44, i_4, (byte) 59);
						KeyHoldInputSubscriber.method3922(ints_46, i_44, i_42, i_5, (byte) -30);
					}

					if (i_41 <= Class532_Sub3_Sub1.anInt7068) {
						ints_46 = Class532_Sub3_Sub1.anIntArrayArray7072[i_41];
						KeyHoldInputSubscriber.method3922(ints_46, i_43, i_45, i_5, (byte) -15);
						KeyHoldInputSubscriber.method3922(ints_46, i_45, i_44, i_4, (byte) 5);
						KeyHoldInputSubscriber.method3922(ints_46, i_44, i_42, i_5, (byte) 62);
					}
				} else {
					if (i_40 >= Class532_Sub3_Sub1.anInt7070) {
						KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_40], i_43, i_42, i_5, (byte) 66);
					}

					if (i_41 <= Class532_Sub3_Sub1.anInt7068) {
						KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_41], i_43, i_42, i_5, (byte) 92);
					}
				}
			}
		}

	}

	public static Class467[] method6825(byte b_0) {
		if (Class149_Sub3.aClass467Array9380 == null) {
			Class467[] arr_1 = Class386.method6671(Class274.aClass470_3336, 1629641091);
			Class467[] arr_2 = new Class467[arr_1.length];
			int i_3 = 0;
			int i_4 = Class393.preferences.aClass468_Sub7_8210.method12666(527706569);

			label70: for (int i_5 = 0; i_5 < arr_1.length; i_5++) {
				Class467 class467_10 = arr_1[i_5];
				if ((class467_10.anInt5573 <= 0 || class467_10.anInt5573 >= 24) && class467_10.anInt5571 >= 800 && class467_10.anInt5574 >= 600 && (i_4 != 2 || class467_10.anInt5571 <= 800 && class467_10.anInt5574 <= 600) && (i_4 != 1 || class467_10.anInt5571 <= 1024 && class467_10.anInt5574 <= 768)) {
					for (int i_11 = 0; i_11 < i_3; i_11++) {
						Class467 class467_8 = arr_2[i_11];
						if (class467_10.anInt5571 == class467_8.anInt5571 && class467_10.anInt5574 == class467_8.anInt5574) {
							if (class467_10.anInt5573 > class467_8.anInt5573) {
								arr_2[i_11] = class467_10;
							}
							continue label70;
						}
					}

					arr_2[i_3] = class467_10;
					++i_3;
				}
			}

			Class149_Sub3.aClass467Array9380 = new Class467[i_3];
			System.arraycopy(arr_2, 0, Class149_Sub3.aClass467Array9380, 0, i_3);
			int[] ints_9 = new int[Class149_Sub3.aClass467Array9380.length];

			for (int i_6 = 0; i_6 < Class149_Sub3.aClass467Array9380.length; i_6++) {
				Class467 class467_7 = Class149_Sub3.aClass467Array9380[i_6];
				ints_9[i_6] = class467_7.anInt5574 * class467_7.anInt5571;
			}

			Class30.method796(ints_9, Class149_Sub3.aClass467Array9380);
		}

		return Class149_Sub3.aClass467Array9380;
	}

}
