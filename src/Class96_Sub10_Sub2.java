public class Class96_Sub10_Sub2 extends Class96_Sub10 {

	int anInt10223;
	int anInt10222;
	int anInt10224;

	public void method1601() {
		int i_1 = 256 + this.anInt10223 * -979961597 * 611538432;
		int i_2 = 256 + this.anInt10222 * -1994093411 * -55350784;
		int i_3 = -387189251 * this.anInt10224 * -51671211;
		if (i_3 < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(this.anInt10223 * -979961597 * 563231147, this.anInt10222 * -1994093411 * -344041035, 1522246231)) {
			++i_3;
		}

		Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4_4 = new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1619106347), 660169595 * this.anInt9296 * -1972436045, 0, -387189251 * this.anInt10224 * -51671211, i_3, i_1, Class504.method8389(i_1, i_2, this.anInt10224 * -51671211 * -387189251, (byte) 7) - this.anInt9295 * 143267879 * 277206935, i_2, 563231147 * this.anInt10223 * -979961597, this.anInt10223 * -979961597 * 563231147, -344041035 * this.anInt10222 * -1994093411, -344041035 * this.anInt10222 * -1994093411, this.anInt9297 * 468728079 * 1009489391, false);
		client.aClass465_7334.put(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4_4), (long) (this.anInt10223 * -979961597 * 563231147 << 16 | -344041035 * this.anInt10222 * -1994093411));
	}

	public void method1592() {
		int i_2 = this.anInt10223 * 512 + 256;
		int i_3 = this.anInt10222 * 512 + 256;
		int i_4 = this.anInt10224;
		if (i_4 < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(this.anInt10223, this.anInt10222, 1968806525)) {
			++i_4;
		}

		Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4_5 = new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1995024088), this.anInt9296, 0, this.anInt10224, i_4, i_2, Class504.method8389(i_2, i_3, this.anInt10224, (byte) 34) - this.anInt9295, i_3, this.anInt10223, this.anInt10223, this.anInt10222, this.anInt10222, this.anInt9297, false);
		client.aClass465_7334.put(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4_5), (long) (this.anInt10223 << 16 | this.anInt10222));
	}

	Class96_Sub10_Sub2(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		int i_2 = rsbytebuffer_1.readInt();
		this.anInt10223 = i_2 >>> 16;
		this.anInt10222 = i_2 & 0xffff;
		this.anInt10224 = rsbytebuffer_1.readUnsignedByte();
	}

}
