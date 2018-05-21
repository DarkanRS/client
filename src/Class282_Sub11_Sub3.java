/* Class282_Sub11_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub11_Sub3 extends Class282_Sub11 {
	int anInt10061;
	byte aByte10062;
	int anInt10063;
	String aString10064;
	Class349 this$0;

	void method12206(RsByteBuffer class282_sub35) {
		((Class282_Sub11_Sub3) this).anInt10061 = class282_sub35.readUnsignedShort() * -800503111;
		((Class282_Sub11_Sub3) this).aByte10062 = class282_sub35.readByte((short) -17571);
		((Class282_Sub11_Sub3) this).anInt10063 = class282_sub35.readUnsignedShort() * 1544248451;
		class282_sub35.readLong(1060653483);
		((Class282_Sub11_Sub3) this).aString10064 = class282_sub35.readString(856431251);
	}

	void method12208(RsByteBuffer class282_sub35) {
		((Class282_Sub11_Sub3) this).anInt10061 = class282_sub35.readUnsignedShort() * -800503111;
		((Class282_Sub11_Sub3) this).aByte10062 = class282_sub35.readByte((short) -25078);
		((Class282_Sub11_Sub3) this).anInt10063 = class282_sub35.readUnsignedShort() * 1544248451;
		class282_sub35.readLong(1948051444);
		((Class282_Sub11_Sub3) this).aString10064 = class282_sub35.readString(15294387);
	}

	void method12204(Class282_Sub4 class282_sub4, int i) {
		Class57 class57 = (class282_sub4.aClass57Array7499[((Class282_Sub11_Sub3) this).anInt10061 * -1538155639]);
		class57.aByte525 = ((Class282_Sub11_Sub3) this).aByte10062;
		class57.anInt526 = -452687215 * ((Class282_Sub11_Sub3) this).anInt10063;
		class57.aString524 = ((Class282_Sub11_Sub3) this).aString10064;
	}

	Class282_Sub11_Sub3(Class349 class349) {
		((Class282_Sub11_Sub3) this).this$0 = class349;
		((Class282_Sub11_Sub3) this).anInt10061 = 800503111;
	}

	void method12203(RsByteBuffer class282_sub35, int i) {
		((Class282_Sub11_Sub3) this).anInt10061 = class282_sub35.readUnsignedShort() * -800503111;
		((Class282_Sub11_Sub3) this).aByte10062 = class282_sub35.readByte((short) -30046);
		((Class282_Sub11_Sub3) this).anInt10063 = class282_sub35.readUnsignedShort() * 1544248451;
		class282_sub35.readLong(-3036577);
		((Class282_Sub11_Sub3) this).aString10064 = class282_sub35.readString(1404627570);
	}

	void method12207(RsByteBuffer class282_sub35) {
		((Class282_Sub11_Sub3) this).anInt10061 = class282_sub35.readUnsignedShort() * -800503111;
		((Class282_Sub11_Sub3) this).aByte10062 = class282_sub35.readByte((short) -300);
		((Class282_Sub11_Sub3) this).anInt10063 = class282_sub35.readUnsignedShort() * 1544248451;
		class282_sub35.readLong(270516625);
		((Class282_Sub11_Sub3) this).aString10064 = class282_sub35.readString(80475538);
	}

	void method12205(Class282_Sub4 class282_sub4) {
		Class57 class57 = (class282_sub4.aClass57Array7499[((Class282_Sub11_Sub3) this).anInt10061 * -1538155639]);
		class57.aByte525 = ((Class282_Sub11_Sub3) this).aByte10062;
		class57.anInt526 = -452687215 * ((Class282_Sub11_Sub3) this).anInt10063;
		class57.aString524 = ((Class282_Sub11_Sub3) this).aString10064;
	}

	static final void method15475(CS2Executor class527, int i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_0_, (byte) 19);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class295.method5291(class118, class98, class527, 464841858);
	}

	public static void method15476(GraphicalRenderer class505, int i) {
		Renderers.FONT_RENDERER = ((FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, (Class16.anInt140 * 1500183805), true, true, -2082744480));
		Class282_Sub17_Sub2.aClass414_9933 = Class487.aClass378_5752.method6415(client.anInterface35_7206, 1500183805 * Class16.anInt140, -777262931);
		Class16.aClass8_144 = ((FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, 436671641 * Class16.anInt136, true, true, -2070045915));
		Class16.aClass414_139 = Class487.aClass378_5752.method6415(client.anInterface35_7206, 436671641 * Class16.anInt136, -1782944110);
		Class285.aClass8_3394 = ((FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, (Class395.anInt4788 * -625646657), true, true, -2089957930));
		Class288.aClass414_3438 = Class487.aClass378_5752.method6415(client.anInterface35_7206, (Class395.anInt4788 * -625646657), -989172290);
	}
}
