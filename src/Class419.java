public class Class419 {

	Class438 aClass438_5001;
	static NativeSprite aClass160_5004;
	int anInt5003;
	public int anInt5002;
	public int anInt5000;

	void method7024(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7025(rsbytebuffer_1, i_3, 1938961128);
		}
	}

	void method7025(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.anInt5003 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 2) {
			this.anInt5002 = rsbytebuffer_1.readUnsignedByte();
			this.anInt5000 = rsbytebuffer_1.readUnsignedByte();
		}

	}

	public synchronized Class91 method7026(int i_1) {
		Class91 class91_2 = (Class91) this.aClass438_5001.aClass229_5342.get((long) this.anInt5003);
		if (class91_2 != null) {
			return class91_2;
		} else {
			class91_2 = Class91.method1522(this.aClass438_5001.aClass317_5341, this.anInt5003, 0);
			if (class91_2 != null) {
				this.aClass438_5001.aClass229_5342.put(class91_2, (long) this.anInt5003);
			}

			return class91_2;
		}
	}

}
