public class Class282_Sub11_Sub3 extends Class282_Sub11 {

	int anInt10061;
	byte aByte10062;
	int anInt10063;
	String aString10064;
	Class349 this$0;

	void method12206(RsByteBuffer rsbytebuffer_1) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
		rsbytebuffer_1.readLong(1060653483);
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12208(RsByteBuffer rsbytebuffer_1) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
		rsbytebuffer_1.readLong(1948051444);
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12204(Class282_Sub4 class282_sub4_1, int i_2) {
		Class57 class57_3 = class282_sub4_1.aClass57Array7499[this.anInt10061];
		class57_3.aByte525 = this.aByte10062;
		class57_3.anInt526 = this.anInt10063;
		class57_3.aString524 = this.aString10064;
	}

	Class282_Sub11_Sub3(Class349 class349_1) {
		this.this$0 = class349_1;
		this.anInt10061 = -1;
	}

	void method12203(RsByteBuffer rsbytebuffer_1, int i_2) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort();
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort();
		rsbytebuffer_1.readLong(-3036577);
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12207(RsByteBuffer rsbytebuffer_1) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
		rsbytebuffer_1.readLong(270516625);
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12205(Class282_Sub4 class282_sub4_1) {
		Class57 class57_2 = class282_sub4_1.aClass57Array7499[this.anInt10061 * -800503111 * -1538155639];
		class57_2.aByte525 = this.aByte10062;
		class57_2.anInt526 = -452687215 * this.anInt10063 * 1544248451 * -1097296133;
		class57_2.aString524 = this.aString10064;
	}

	static final void method15475(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 19);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class295.method5291(icomponentdefinitions_3, interface_4, cs2executor_0, 464841858);
	}

	public static void method15476(GraphicalRenderer graphicalrenderer_0, int i_1) {
		Renderers.FONT_RENDERER = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.anInt140, true, true, -2082744480);
		Class282_Sub17_Sub2.aClass414_9933 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.anInt140, -777262931);
		Class16.aClass8_144 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.anInt136, true, true, -2070045915);
		Class16.aClass414_139 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.anInt136, -1782944110);
		Class285.aClass8_3394 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class395.anInt4788, true, true, -2089957930);
		Class288.aClass414_3438 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class395.anInt4788, -989172290);
	}

}
