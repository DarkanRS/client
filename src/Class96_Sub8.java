public class Class96_Sub8 extends CutsceneAction {

	Class268 aClass268_9271;

	int anInt9270;

	int anInt9269;

	int anInt9272;

	int anInt9268;

	public void method1592() {
		this.aClass268_9271 = Class435.method7300(this.anInt9270, this.anInt9268, 0, this.anInt9269, false, this.anInt9272);
	}

	Class96_Sub8(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9270 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9269 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9272 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9268 = rsbytebuffer_1.readUnsignedByte();
	}

	void method1593() {
		if (this.aClass268_9271 != null) {
			QuickchatFiller.method1142(this.aClass268_9271, 1303678782);
			this.aClass268_9271 = null;
		}
	}

	public void method1601() {
		this.aClass268_9271 = Class435.method7300(983294899 * this.anInt9270 * -1315470469, this.anInt9268 * 1609664985 * -573413783, 0, this.anInt9269 * -957613339 * -840420627, false, 177588843 * this.anInt9272 * -1529769405);
	}

	static boolean method14577() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5879, (byte) -63);
	}
}
