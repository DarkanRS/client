public class Class96_Sub5 extends Class96 {

	int anInt8845;
	int anInt8847;
	int anInt8846;
	int anInt8848;
	int anInt8849;

	public void method1601() {
		RouteStrategy.method3794(-1748191497 * this.anInt8845 * -597628217, this.anInt8846 * 693223401 * -808646567, -602355731 * this.anInt8847 * 1851960805, 100, 100, false, (byte) -1);
		Class12.method486(-908637089 * this.anInt8848 * -1393422433, this.anInt8849 * -652781679 * -1608889999, 0, 596260679);
		client.aBool7321 = true;
	}

	public void method1592(int i_1) {
		RouteStrategy.method3794(this.anInt8845, this.anInt8846, this.anInt8847, 100, 100, false, (byte) -1);
		Class12.method486(this.anInt8848, this.anInt8849, 0, 596260679);
		client.aBool7321 = true;
	}

	Class96_Sub5(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt8845 = rsbytebuffer_1.readUnsignedShort();
		this.anInt8847 = rsbytebuffer_1.readUnsignedShort();
		this.anInt8846 = rsbytebuffer_1.readUnsignedShort();
		this.anInt8848 = rsbytebuffer_1.readUnsignedShort();
		this.anInt8849 = rsbytebuffer_1.readUnsignedShort();
	}

	public static void method14243(short s_0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_7964 != null) {
			try {
				IcmpService_Sub1.anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable_2) {
				;
			}

			IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
		}

	}

	static final void method14244(CS2Executor cs2executor_0, int i_1) {
		int i_2 = Class363.anInt4203;
		int i_3 = Engine.anInt3249;
		int i_4 = -1;
		if (Class475.aBool5623) {
			Class467[] arr_5 = Class405.method6825((byte) 55);

			for (int i_6 = 0; i_6 < arr_5.length; i_6++) {
				Class467 class467_7 = arr_5[i_6];
				if (i_2 == class467_7.anInt5571 && i_3 == class467_7.anInt5574) {
					i_4 = i_6;
					break;
				}
			}
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_4;
	}

}
