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
		rsbytebuffer_1.readLong();
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12208(RsByteBuffer rsbytebuffer_1) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
		rsbytebuffer_1.readLong();
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12204(ClanChannel class282_sub4_1) {
		ClanChannelPlayer class57_3 = class282_sub4_1.players[this.anInt10061];
		class57_3.rank = this.aByte10062;
		class57_3.world = this.anInt10063;
		class57_3.name = this.aString10064;
	}

	Class282_Sub11_Sub3(Class349 class349_1) {
		this.this$0 = class349_1;
		this.anInt10061 = -1;
	}

	void method12203(RsByteBuffer rsbytebuffer_1) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort();
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort();
		rsbytebuffer_1.readLong();
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12207(RsByteBuffer rsbytebuffer_1) {
		this.anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
		this.aByte10062 = rsbytebuffer_1.readByte();
		this.anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
		rsbytebuffer_1.readLong();
		this.aString10064 = rsbytebuffer_1.readString();
	}

	void method12205(ClanChannel class282_sub4_1) {
		ClanChannelPlayer class57_2 = class282_sub4_1.players[this.anInt10061 * -800503111 * -1538155639];
		class57_2.rank = this.aByte10062;
		class57_2.world = -452687215 * this.anInt10063 * 1544248451 * -1097296133;
		class57_2.name = this.aString10064;
	}

	public static void method15476(GraphicalRenderer graphicalrenderer_0, int i_1) {
		Renderers.FONT_RENDERER = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.p11FullIndex, true, true, -2082744480);
		Class282_Sub17_Sub2.aClass414_9933 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.p11FullIndex, -777262931);
		Class16.aClass8_144 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.p12FullIndex, true, true, -2070045915);
		Class16.aClass414_139 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.p12FullIndex, -1782944110);
		Class285.aClass8_3394 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class395.b12FullIndex, true, true, -2089957930);
		SkyboxIndexLoader.aClass414_3438 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class395.b12FullIndex, -989172290);
	}
}
