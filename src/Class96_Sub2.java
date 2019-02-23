public class Class96_Sub2 extends Class96 {

	int anInt8504;
	int anInt8505;

	public void method1601() {
		Class82.aClass75Array804[-644812741 * this.anInt8504 * 607938803].method1342((byte) 117).method15791(this.anInt8505 * -16472603 * -2022567955, true, (byte) -83);
	}

	Class96_Sub2(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt8504 = rsbytebuffer_1.readUnsignedShort();
		this.anInt8505 = rsbytebuffer_1.readUnsignedShort();
	}

	public void method1592(int i_1) {
		Class82.aClass75Array804[this.anInt8504].method1342((byte) 18).method15791(this.anInt8505, true, (byte) -82);
	}

	static final void method13756(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class291.method5175(i_2 >> 14 & 0x3fff, i_2 & 0x3fff);
		if (class282_sub50_sub6_3 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub50_sub6_3.anInt9536;
		}

	}

}
