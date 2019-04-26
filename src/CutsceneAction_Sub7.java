public class CutsceneAction_Sub7 extends CutsceneAction {

	int anInt9177;
	String aString9175;
	int anInt9176;
	int anInt9174;

	CutsceneAction_Sub7(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9177 = rsbytebuffer_1.readUnsignedShort();
		this.aString9175 = rsbytebuffer_1.readString();
		this.anInt9176 = rsbytebuffer_1.readInt();
		this.anInt9174 = rsbytebuffer_1.readUnsignedShort();
	}

	public void method1592() {
		Class82.aClass75Array804[this.anInt9177].method1342((byte) 110).method15875(this.aString9175, this.anInt9176, 0, this.anInt9174, 1801324989);
	}

	public void method1601() {
		Class82.aClass75Array804[411942041 * this.anInt9177 * -711272535].method1342((byte) 113).method15875(this.aString9175, 369590275 * this.anInt9176 * -637588821, 0, this.anInt9174 * -1631359867 * -171725747, 1215715033);
	}

}
