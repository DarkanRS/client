public class Class96_Sub17 extends Class96 {

	int anInt9385;

	int anInt9386;

	String aString9387;

	int anInt9388;

	int anInt9389;

	Class96_Sub17(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9385 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9386 = rsbytebuffer_1.readUnsignedShort();
		this.aString9387 = rsbytebuffer_1.readString();
		this.anInt9388 = rsbytebuffer_1.readInt();
		this.anInt9389 = rsbytebuffer_1.readUnsignedShort();
	}

	public void method1592(int i_1) {
		ParticleProducerDefinition.method1161(Class4.anInt35, this.anInt9385, this.anInt9386, Class504.method8389(this.anInt9385, this.anInt9386, Class4.anInt35, (byte) 47), this.anInt9389, this.anInt9388, this.aString9387, (short) 12244);
	}

	public void method1601() {
		ParticleProducerDefinition.method1161(Class4.anInt35 * -647602067 * 675588453, 31133705 * this.anInt9385 * -1930592711, this.anInt9386 * -621881623 * -2086575783, Class504.method8389(31133705 * this.anInt9385 * -1930592711, -2086575783 * this.anInt9386 * -621881623, 675588453 * Class4.anInt35 * -647602067, (byte) 93), this.anInt9389 * -159499065 * -469908233, this.anInt9388 * -1475639137 * 882611039, this.aString9387, (short) 20309);
	}

	static final void method14653(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, -271288407) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1353 = Class351.method6193(string_4, cs2executor_2, 1245386660);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final boolean performCalculationS1(int i_0, int i_1, RouteStrategy routestrategy_2, ClipMap clipmap_3, int i_4) {
		int i_5 = i_0;
		int i_6 = i_1;
		byte b_7 = 64;
		byte b_8 = 64;
		int i_9 = i_0 - b_7;
		int i_10 = i_1 - b_8;
		Class251.directions[b_7][b_8] = 99;
		Class251.distances[b_7][b_8] = 0;
		byte b_11 = 0;
		int i_12 = 0;
		Class251.bufferX[b_11] = i_0;
		byte b_10001 = b_11;
		int i_19 = b_11 + 1;
		Class251.bufferY[b_10001] = i_1;
		int[][] ints_13 = clipmap_3.map;
		while (i_12 != i_19) {
			i_5 = Class251.bufferX[i_12];
			i_6 = Class251.bufferY[i_12];
			i_12 = i_12 + 1 & 0xfff;
			int i_17 = i_5 - i_9;
			int i_18 = i_6 - i_10;
			int i_14 = i_5 - clipmap_3.offsetX;
			int i_15 = i_6 - clipmap_3.offsetY;
			if (routestrategy_2.canExit(1, i_5, i_6, clipmap_3, (byte) -1)) {
				Class251.exitX = i_5;
				Class251.exitY = i_6;
				return true;
			}
			int i_16 = Class251.distances[i_17][i_18] + 1;
			if (i_17 > 0 && Class251.directions[i_17 - 1][i_18] == 0 && (ints_13[i_14 - 1][i_15] & 0x42240000) == 0) {
				Class251.bufferX[i_19] = i_5 - 1;
				Class251.bufferY[i_19] = i_6;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 - 1][i_18] = 2;
				Class251.distances[i_17 - 1][i_18] = i_16;
			}
			if (i_17 < 127 && Class251.directions[i_17 + 1][i_18] == 0 && (ints_13[i_14 + 1][i_15] & 0x60240000) == 0) {
				Class251.bufferX[i_19] = i_5 + 1;
				Class251.bufferY[i_19] = i_6;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 + 1][i_18] = 8;
				Class251.distances[i_17 + 1][i_18] = i_16;
			}
			if (i_18 > 0 && Class251.directions[i_17][i_18 - 1] == 0 && (ints_13[i_14][i_15 - 1] & 0x40a40000) == 0) {
				Class251.bufferX[i_19] = i_5;
				Class251.bufferY[i_19] = i_6 - 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17][i_18 - 1] = 1;
				Class251.distances[i_17][i_18 - 1] = i_16;
			}
			if (i_18 < 127 && Class251.directions[i_17][i_18 + 1] == 0 && (ints_13[i_14][i_15 + 1] & 0x48240000) == 0) {
				Class251.bufferX[i_19] = i_5;
				Class251.bufferY[i_19] = i_6 + 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17][i_18 + 1] = 4;
				Class251.distances[i_17][i_18 + 1] = i_16;
			}
			if (i_17 > 0 && i_18 > 0 && Class251.directions[i_17 - 1][i_18 - 1] == 0 && (ints_13[i_14 - 1][i_15 - 1] & 0x43a40000) == 0 && (ints_13[i_14 - 1][i_15] & 0x42240000) == 0 && (ints_13[i_14][i_15 - 1] & 0x40a40000) == 0) {
				Class251.bufferX[i_19] = i_5 - 1;
				Class251.bufferY[i_19] = i_6 - 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 - 1][i_18 - 1] = 3;
				Class251.distances[i_17 - 1][i_18 - 1] = i_16;
			}
			if (i_17 < 127 && i_18 > 0 && Class251.directions[i_17 + 1][i_18 - 1] == 0 && (ints_13[i_14 + 1][i_15 - 1] & 0x60e40000) == 0 && (ints_13[i_14 + 1][i_15] & 0x60240000) == 0 && (ints_13[i_14][i_15 - 1] & 0x40a40000) == 0) {
				Class251.bufferX[i_19] = i_5 + 1;
				Class251.bufferY[i_19] = i_6 - 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 + 1][i_18 - 1] = 9;
				Class251.distances[i_17 + 1][i_18 - 1] = i_16;
			}
			if (i_17 > 0 && i_18 < 127 && Class251.directions[i_17 - 1][i_18 + 1] == 0 && (ints_13[i_14 - 1][i_15 + 1] & 0x4e240000) == 0 && (ints_13[i_14 - 1][i_15] & 0x42240000) == 0 && (ints_13[i_14][i_15 + 1] & 0x48240000) == 0) {
				Class251.bufferX[i_19] = i_5 - 1;
				Class251.bufferY[i_19] = i_6 + 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 - 1][i_18 + 1] = 6;
				Class251.distances[i_17 - 1][i_18 + 1] = i_16;
			}
			if (i_17 < 127 && i_18 < 127 && Class251.directions[i_17 + 1][i_18 + 1] == 0 && (ints_13[i_14 + 1][i_15 + 1] & 0x78240000) == 0 && (ints_13[i_14 + 1][i_15] & 0x60240000) == 0 && (ints_13[i_14][i_15 + 1] & 0x48240000) == 0) {
				Class251.bufferX[i_19] = i_5 + 1;
				Class251.bufferY[i_19] = i_6 + 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 + 1][i_18 + 1] = 12;
				Class251.distances[i_17 + 1][i_18 + 1] = i_16;
			}
		}
		Class251.exitX = i_5;
		Class251.exitY = i_6;
		return false;
	}

	public static void method14656(int i_0, int i_1) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(20, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 40);
	}
}
