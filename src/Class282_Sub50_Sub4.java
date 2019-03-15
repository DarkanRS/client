public class Class282_Sub50_Sub4 extends CacheableNode {

	IterableNodeMap aClass465_9518;

	void method14747(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 249) {
			int i_4 = rsbytebuffer_1.readUnsignedByte();
			int i_5;
			if (this.aClass465_9518 == null) {
				i_5 = Class323.nextPowerOfTwo(i_4, -1925062571);
				this.aClass465_9518 = new IterableNodeMap(i_5);
			}

			for (i_5 = 0; i_5 < i_4; i_5++) {
				boolean bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
				int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
				Object obj_8;
				if (bool_6) {
					obj_8 = new Class282_Sub47(rsbytebuffer_1.readString());
				} else {
					obj_8 = new Class282_Sub38(rsbytebuffer_1.readInt());
				}

				this.aClass465_9518.put((Node) obj_8, (long) i_7);
			}
		}

	}

	void method14748(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method14747(rsbytebuffer_1, i_3);
		}
	}

	public int method14750(int i_1, int i_2) {
		if (this.aClass465_9518 == null) {
			return i_2;
		} else {
			Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_9518.get((long) i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
		}
	}

	public String method14751(int i_1, String string_2) {
		if (this.aClass465_9518 == null) {
			return string_2;
		} else {
			Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_9518.get((long) i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
		}
	}

}
