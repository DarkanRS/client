public class Class96_Sub13 extends CutsceneAction {

	public static int anInt9368;

	Class268 aClass268_9367;

	int anInt9363;

	int anInt9365;

	int anInt9364;

	int anInt9366;

	public void method1592() {
		this.aClass268_9367 = Class153.method2618(this.anInt9363, this.anInt9366, 0, this.anInt9365, this.anInt9364, 1753039442);
	}

	void method1593() {
		if (this.aClass268_9367 != null) {
			QuickchatFiller.method1142(this.aClass268_9367, 1890417673);
			this.aClass268_9367 = null;
		}
	}

	public void method1601() {
		this.aClass268_9367 = Class153.method2618(-1658024425 * this.anInt9363 * -614233689, 1033987545 * this.anInt9366 * 468765289, 0, 183603537 * this.anInt9365 * -2028447823, this.anInt9364 * -1995338863 * -1180265103, 1758960658);
	}

	Class96_Sub13(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9363 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9365 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9364 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9366 = rsbytebuffer_1.readUnsignedByte();
	}
}
