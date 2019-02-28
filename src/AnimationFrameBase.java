public class AnimationFrameBase extends Node {

	int id;
	int count;
	int[] transformationTypes;
	int[][] labels;
	boolean[] aBoolArray7563;
	int[] anIntArray7561;

	AnimationFrameBase(int id, byte[] bytes_2) {
		this.id = id;
		RsByteBuffer rsbytebuffer_3 = new RsByteBuffer(bytes_2);
		this.count = rsbytebuffer_3.readUnsignedByte();
		this.transformationTypes = new int[this.count];
		this.labels = new int[this.count][];
		this.aBoolArray7563 = new boolean[this.count];
		this.anIntArray7561 = new int[this.count];

		int i_4;
		for (i_4 = 0; i_4 < this.count; i_4++) {
			this.transformationTypes[i_4] = rsbytebuffer_3.readUnsignedByte();
			if (this.transformationTypes[i_4] == 6) {
				this.transformationTypes[i_4] = 2;
			}
		}

		for (i_4 = 0; i_4 < this.count; i_4++) {
			this.aBoolArray7563[i_4] = rsbytebuffer_3.readUnsignedByte() == 1;
		}

		for (i_4 = 0; i_4 < this.count; i_4++) {
			this.anIntArray7561[i_4] = rsbytebuffer_3.readUnsignedShort();
		}

		for (i_4 = 0; i_4 < this.count; i_4++) {
			this.labels[i_4] = new int[rsbytebuffer_3.readUnsignedByte()];
		}

		for (i_4 = 0; i_4 < this.count; i_4++) {
			for (int i_5 = 0; i_5 < this.labels[i_4].length; i_5++) {
				this.labels[i_4][i_5] = rsbytebuffer_3.readUnsignedByte();
			}
		}

	}

	static void method12212(Class282_Sub50_Sub15 class282_sub50_sub15_0, int i_1, int i_2) {
		if (Class20.aBool161) {
			FontMetrics fontmetrics_3 = Class114.method1887(-1200220753);
			int i_4 = 0;

			int i_6;
			for (Class282_Sub50_Sub7 class282_sub50_sub7_5 = (Class282_Sub50_Sub7) class282_sub50_sub15_0.aClass477_9770.method7941((byte) 4); class282_sub50_sub7_5 != null; class282_sub50_sub7_5 = (Class282_Sub50_Sub7) class282_sub50_sub15_0.aClass477_9770.method7955(-726833918)) {
				i_6 = Class282_Sub50_Sub17.method15507(class282_sub50_sub7_5, fontmetrics_3, 943671530);
				if (i_6 > i_4) {
					i_4 = i_6;
				}
			}

			i_4 += 8;
			int i_9 = class282_sub50_sub15_0.anInt9769 * Class20.anInt178 + 21;
			Class521_Sub1_Sub5_Sub1.anInt10526 = (Class20.aBool187 ? 26 : 22) + Class20.anInt178 * class282_sub50_sub15_0.anInt9769;
			i_6 = Class301.anInt3555 + Class158_Sub2.anInt8975;
			if (i_4 + i_6 > Class349.anInt4083) {
				i_6 = Class301.anInt3555 - i_4;
			}

			if (i_6 < 0) {
				i_6 = 0;
			}

			int i_7 = Class20.aBool187 ? fontmetrics_3.anInt4978 + 1 + 20 : 31;
			int i_8 = i_1 - i_7 + fontmetrics_3.anInt4978 + 1;
			if (i_9 + i_8 > Engine.anInt3243 * -969250379) {
				i_8 = Engine.anInt3243 * -969250379 - i_9;
			}

			if (i_8 < 0) {
				i_8 = 0;
			}

			Class341.anInt3996 = i_6;
			Class282_Sub50_Sub2.anInt9471 = i_8;
			Class96_Sub3.anInt8518 = i_4;
			Class20.aClass282_Sub50_Sub15_163 = class282_sub50_sub15_0;
		}

	}

}
