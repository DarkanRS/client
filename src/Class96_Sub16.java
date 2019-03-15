public class Class96_Sub16 extends Class96 {

	long aLong9382;

	int anInt9381;

	public void method1601() {
		Class282_Sub38 class282_sub38_1 = (Class282_Sub38) Class86.aClass465_823.get(-6193626509720689219L * this.aLong9382 * -8460157808910631531L);
		if (class282_sub38_1 != null) {
			class282_sub38_1.anInt8002 = -1352622247 * this.anInt9381 * -1911760175 * -570797415;
		} else {
			Class86.aClass465_823.put(new Class282_Sub38(900972081 * this.anInt9381 * -1911760175), -6193626509720689219L * this.aLong9382 * -8460157808910631531L);
		}
	}

	public void method1592() {
		Class282_Sub38 class282_sub38_2 = (Class282_Sub38) Class86.aClass465_823.get(this.aLong9382);
		if (class282_sub38_2 != null) {
			class282_sub38_2.anInt8002 = this.anInt9381;
		} else {
			Class86.aClass465_823.put(new Class282_Sub38(this.anInt9381), this.aLong9382);
		}
	}

	Class96_Sub16(RsByteBuffer rsbytebuffer_1, boolean bool_2) {
		super(rsbytebuffer_1);
		int i_3 = rsbytebuffer_1.readUnsignedShort();
		if (bool_2) {
			this.aLong9382 = 0x100000000L | (long) i_3;
		} else {
			this.aLong9382 = (long) i_3;
		}
		this.anInt9381 = rsbytebuffer_1.readInt();
	}
}
