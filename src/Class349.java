public class Class349 {

	public static int anInt4083;
	long aLong4081;
	long aLong4077 = -1L;
	NodeCollection aClass482_4076 = new NodeCollection();

	void method6178(RsByteBuffer rsbytebuffer_1) {
		this.aLong4081 = rsbytebuffer_1.readLong();
		this.aLong4077 = rsbytebuffer_1.readLong();

		for (int i_3 = rsbytebuffer_1.readUnsignedByte(); i_3 != 0; i_3 = rsbytebuffer_1.readUnsignedByte()) {
			Object obj_4;
			if (i_3 == 1) {
				obj_4 = new Class282_Sub11_Sub4(this);
			} else if (i_3 == 4) {
				obj_4 = new Class282_Sub11_Sub1(this);
			} else if (i_3 == 3) {
				obj_4 = new Class282_Sub11_Sub2(this);
			} else {
				if (i_3 != 2) {
					throw new RuntimeException("");
				}

				obj_4 = new Class282_Sub11_Sub3(this);
			}

			((Class282_Sub11) obj_4).method12203(rsbytebuffer_1);
			this.aClass482_4076.append((Node) obj_4);
		}

	}

	public void method6179(ClanChannel class282_sub4_1) {
		if (class282_sub4_1.data == this.aLong4081 && class282_sub4_1.nextUpdateNumber == this.aLong4077) {
			for (Class282_Sub11 class282_sub11_3 = (Class282_Sub11) this.aClass482_4076.head((byte) 71); class282_sub11_3 != null; class282_sub11_3 = (Class282_Sub11) this.aClass482_4076.next(2116443073)) {
				class282_sub11_3.method12204(class282_sub4_1);
			}

			++class282_sub4_1.nextUpdateNumber;
		} else {
			throw new RuntimeException("");
		}
	}

	public Class349(RsByteBuffer rsbytebuffer_1) {
		this.method6178(rsbytebuffer_1);
	}

	static final void method6186(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		if (icomponentdefinitions_0.type == 4) {
			Class306.method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -2108209213);
		}

	}

}
