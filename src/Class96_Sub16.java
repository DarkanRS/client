public class Class96_Sub16 extends Class96 {

	long aLong9382;
	int anInt9381;

	public void method1601() {
		Class282_Sub38 class282_sub38_1 = (Class282_Sub38) Class86.aClass465_823.get(-6193626509720689219L * this.aLong9382 * -8460157808910631531L);
		if (class282_sub38_1 != null) {
			class282_sub38_1.anInt8002 = -1352622247 * this.anInt9381 * -1911760175 * -570797415;
		} else {
			Class86.aClass465_823.method7765(new Class282_Sub38(900972081 * this.anInt9381 * -1911760175), -6193626509720689219L * this.aLong9382 * -8460157808910631531L);
		}

	}

	public void method1592(int i_1) {
		Class282_Sub38 class282_sub38_2 = (Class282_Sub38) Class86.aClass465_823.get(this.aLong9382);
		if (class282_sub38_2 != null) {
			class282_sub38_2.anInt8002 = this.anInt9381;
		} else {
			Class86.aClass465_823.method7765(new Class282_Sub38(this.anInt9381), this.aLong9382);
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

	static final void method14647(CS2Executor cs2executor_0, byte b_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8223, cs2executor_0.intStack[--cs2executor_0.intStackPtr], -939446296);
		ParticleProducer.method11500(Class393.preferences.currentToolkit.getValue(-1329116825), false, (byte) 24);
		Class190.savePreferences((byte) 38);
	}

	static void method14648(int i_0, int i_1, int i_2, byte b_3) {
		Class282_Sub50_Sub12 class282_sub50_sub12_4 = Engine.getIComponentVar(11, (long) i_0);
		class282_sub50_sub12_4.method14995(467467668);
		class282_sub50_sub12_4.anInt9668 = i_1;
		class282_sub50_sub12_4.anInt9641 = i_2;
	}

	static final void method14649(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub1_8197.method7785(i_2, 364907736);
	}

}
