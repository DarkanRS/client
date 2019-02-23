public class Class96_Sub6 extends Class96 {

	static boolean aBool9173;
	int anInt9170;
	int anInt9169;
	int anInt9168;
	int anInt9171;
	int anInt9172;

	Class96_Sub6(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9170 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readInt();
		this.anInt9169 = i_2 >>> 16;
		this.anInt9168 = i_2 & 0xffff;
		this.anInt9171 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9172 = rsbytebuffer_1.readUnsignedByte();
	}

	public void method1592(int i_1) {
		Class86.aClass92Array820[this.anInt9170].method1559(this.anInt9171, this.anInt9169, this.anInt9168, this.anInt9172, (byte) 60);
	}

	public void method1601() {
		Class86.aClass92Array820[848428857 * this.anInt9170 * 1418149641].method1559(this.anInt9171 * 10301909 * 376340349, -916997341 * this.anInt9169 * 1332038795, -1710403859 * this.anInt9168 * -2105065755, this.anInt9172 * -781329023 * -2066193791, (byte) 30);
	}

	static final int getUseOptionFlags(int settings) {
		return settings >> 11 & 0x7f;
	}

	static final void method14503(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		if (i_3 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_5 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_3, (byte) 8);
			if (i_2 != enumdefinitions_5.aChar5140) {
				throw new RuntimeException();
			} else {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = enumdefinitions_5.method7228(Integer.valueOf(i_4), (byte) -68) ? 1 : 0;
			}
		}
	}

}
