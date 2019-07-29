public class PlaySynthCutsceneAction extends CutsceneAction {

	public static int anInt9368;

	AreadSound aClass268_9367;

	int anInt9363;

	int anInt9365;

	int anInt9364;

	int anInt9366;

	public void method1592() {
		this.aClass268_9367 = VarNPCMap.playSoundSynth(this.anInt9363, this.anInt9366, 0, this.anInt9365, this.anInt9364);
	}

	void method1593() {
		if (this.aClass268_9367 != null) {
			QuickchatFiller.method1142(this.aClass268_9367, 1890417673);
			this.aClass268_9367 = null;
		}
	}

	public void method1601() {
		this.aClass268_9367 = VarNPCMap.playSoundSynth(-1658024425 * this.anInt9363 * -614233689, 1033987545 * this.anInt9366 * 468765289, 0, 183603537 * this.anInt9365 * -2028447823, this.anInt9364 * -1995338863 * -1180265103);
	}

	PlaySynthCutsceneAction(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9363 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9365 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9364 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9366 = rsbytebuffer_1.readUnsignedByte();
	}
}
