public class Class282_Sub17_Sub3 extends Class282_Sub17 {

	String aString9935;

	Class348 this$0;

	void method12251(Class61 class61_1) {
		class61_1.aString622 = this.aString9935;
	}

	void method12250(RsByteBuffer rsbytebuffer_1) {
		this.aString9935 = rsbytebuffer_1.readString();
		rsbytebuffer_1.readInt();
	}

	Class282_Sub17_Sub3(Class348 class348_1) {
		this.this$0 = class348_1;
	}

	void method12257(RsByteBuffer rsbytebuffer_1) {
		this.aString9935 = rsbytebuffer_1.readString();
		rsbytebuffer_1.readInt();
	}

	void method12252(Class61 class61_1) {
		class61_1.aString622 = this.aString9935;
	}

	void method12253(RsByteBuffer rsbytebuffer_1) {
		this.aString9935 = rsbytebuffer_1.readString();
		rsbytebuffer_1.readInt();
	}

	void method12254(Class61 class61_1) {
		class61_1.aString622 = this.aString9935;
	}

	void method12258(Class61 class61_1) {
		class61_1.aString622 = this.aString9935;
	}

	void method12256(Class61 class61_1) {
		class61_1.aString622 = this.aString9935;
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		this.aString9935 = rsbytebuffer_1.readString();
		rsbytebuffer_1.readInt();
	}

	void method12255(Class61 class61_1) {
		class61_1.aString622 = this.aString9935;
	}

	static void method15405(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_6 = 0;
		int i_7 = i_3;
		int i_8 = i_2 * i_2;
		int i_9 = i_3 * i_3;
		int i_10 = i_9 << 1;
		int i_11 = i_8 << 1;
		int i_12 = i_3 << 1;
		int i_13 = i_10 + (1 - i_12) * i_8;
		int i_14 = i_9 - i_11 * (i_12 - 1);
		int i_15 = i_8 << 2;
		int i_16 = i_9 << 2;
		int i_17 = ((i_6 << 1) + 3) * i_10;
		int i_18 = ((i_3 << 1) - 3) * i_11;
		int i_19 = i_16 * (i_6 + 1);
		int i_20 = i_15 * (i_3 - 1);
		int i_21;
		int i_22;
		if (i_1 >= Class532_Sub3_Sub1.anInt7070 && i_1 <= Class532_Sub3_Sub1.anInt7068) {
			i_21 = EntityNode.method4890(i_0 + i_2, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, -2092614922);
			i_22 = EntityNode.method4890(i_0 - i_2, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 107584630);
			Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_1], i_22, i_21, i_4, (byte) -117);
		}
		while (i_7 > 0) {
			if (i_13 < 0) {
				while (i_13 < 0) {
					i_13 += i_17;
					i_14 += i_19;
					i_17 += i_16;
					i_19 += i_16;
					++i_6;
				}
			}
			if (i_14 < 0) {
				i_13 += i_17;
				i_14 += i_19;
				i_17 += i_16;
				i_19 += i_16;
				++i_6;
			}
			i_13 += -i_20;
			i_14 += -i_18;
			i_18 -= i_15;
			i_20 -= i_15;
			--i_7;
			i_21 = i_1 - i_7;
			i_22 = i_7 + i_1;
			if (i_22 >= Class532_Sub3_Sub1.anInt7070 && i_21 <= Class532_Sub3_Sub1.anInt7068) {
				int i_23 = EntityNode.method4890(i_0 + i_6, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 1305925887);
				int i_24 = EntityNode.method4890(i_0 - i_6, Class532_Sub3_Sub1.anInt7071, Class532_Sub3_Sub1.anInt7069, 923847581);
				if (i_21 >= Class532_Sub3_Sub1.anInt7070) {
					Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_21], i_24, i_23, i_4, (byte) 40);
				}
				if (i_22 <= Class532_Sub3_Sub1.anInt7068) {
					Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_22], i_24, i_23, i_4, (byte) 68);
				}
			}
		}
	}
}
