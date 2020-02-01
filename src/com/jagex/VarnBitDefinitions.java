package com.jagex;
public class VarnBitDefinitions {

	static int anInt5765;
	public int anInt5764;
	public int anInt5763;
	public int anInt5762;

	void method8213(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method8214(rsbytebuffer_1, i_3);
		}
	}

	void method8214(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.anInt5764 = rsbytebuffer_1.readUnsignedShort();
			this.anInt5763 = rsbytebuffer_1.readUnsignedByte();
			this.anInt5762 = rsbytebuffer_1.readUnsignedByte();
		}
	}

	static void method8217(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, Class476 class476_6, byte b_7) {
		Node_Sub31 class282_sub31_8 = null;
		for (Node_Sub31 class282_sub31_9 = (Node_Sub31) Node_Sub31.aClass482_7776.head(); class282_sub31_9 != null; class282_sub31_9 = (Node_Sub31) Node_Sub31.aClass482_7776.next(375031762)) {
			if (i_0 == class282_sub31_9.anInt7764 && class282_sub31_9.anInt7762 == i_1 && i_2 == class282_sub31_9.anInt7763 && i_3 == class282_sub31_9.anInt7766) {
				class282_sub31_8 = class282_sub31_9;
				break;
			}
		}
		if (class282_sub31_8 == null) {
			class282_sub31_8 = new Node_Sub31();
			class282_sub31_8.anInt7764 = i_0;
			class282_sub31_8.anInt7766 = i_3;
			class282_sub31_8.anInt7762 = i_1;
			class282_sub31_8.anInt7763 = i_2;
			Node_Sub31.aClass482_7776.append(class282_sub31_8);
		}
		class282_sub31_8.anInt7769 = i_4;
		class282_sub31_8.anInt7771 = i_5;
		class282_sub31_8.aClass476_7768 = class476_6;
		class282_sub31_8.aBool7773 = true;
		class282_sub31_8.aBool7774 = false;
	}
}
