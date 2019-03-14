public class Class268 {

	Class282_Sub18 aClass282_Sub18_3294;

	Class282_Sub26_Sub1_Sub1 aClass282_Sub26_Sub1_Sub1_3296;

	Class343 aClass343_3303;

	Class282_Sub15_Sub5 aClass282_Sub15_Sub5_3304;

	static int anInt3307;

	int anInt3305 = -1;

	int anInt3306 = -1;

	byte aByte3300;

	int anInt3291;

	int anInt3302;

	int anInt3297;

	int anInt3299;

	int anInt3298;

	int anInt3295;

	boolean method4793(byte b_1) {
		return this.aByte3300 == 2 || this.aByte3300 == 3;
	}

	Class268(byte b_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, Class521_Sub1 class521_sub1_8) {
		this.aByte3300 = b_1;
		this.anInt3291 = i_2;
		this.anInt3302 = i_3;
		this.anInt3297 = i_4;
		this.anInt3299 = i_5;
		this.anInt3298 = i_6;
		this.anInt3295 = i_7;
		if (class521_sub1_8 != null && class521_sub1_8 instanceof Class521_Sub1_Sub1) {
			Class521_Sub1_Sub1 class521_sub1_sub1_9 = (Class521_Sub1_Sub1) class521_sub1_8;
			this.anInt3305 = class521_sub1_sub1_9.aShort9458;
			this.anInt3306 = class521_sub1_sub1_9.aShort9456;
		}
	}

	public static int[] method4799(int i_0, int i_1) {
		int[] ints_2 = new int[3];
		Class155.method2634(Class302.method5363(i_0, 1155387046));
		ints_2[0] = Class407.aCalendar4848.get(5);
		ints_2[1] = Class407.aCalendar4848.get(2);
		ints_2[2] = Class407.aCalendar4848.get(1);
		return ints_2;
	}

	static void method4800(GraphicalRenderer graphicalrenderer_0, byte b_1) {
		if ((Class20.anInt169 >= 2 || client.aBool7344) && client.aClass118_7257 == null) {
			String string_2;
			if (client.aBool7344 && Class20.anInt169 < 2) {
				string_2 = client.aString7275 + Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -912912276) + client.aString7356 + " " + "->";
			} else if (Class468_Sub1.method12619(-1903584217) && Class20.anInt169 > 2) {
				string_2 = IncomingPacket.method6380(Class96_Sub23.aClass282_Sub50_Sub7_9445, 1195583741);
			} else {
				Class282_Sub50_Sub7 class282_sub50_sub7_3 = Class96_Sub23.aClass282_Sub50_Sub7_9445;
				if (class282_sub50_sub7_3 == null) {
					return;
				}
				string_2 = IncomingPacket.method6380(class282_sub50_sub7_3, 1123504706);
				int[] ints_4 = Class534_Sub1.method12815(class282_sub50_sub7_3, -1336515986);
				if (ints_4 != null) {
					string_2 = string_2 + Class15.method547(ints_4, 2114598830);
				}
			}
			if (Class20.anInt169 > 2) {
				string_2 = string_2 + ParticleProducerDefinition.method1163(16777215, 619010179) + " / " + (Class20.anInt169 - 2) + Message.MORE_OPTIONS.translate(Class223.CURRENT_LANGUAGE, -386320365);
			}
			if (Class20.aClass118_183 != null) {
				FontRenderer fontrenderer_5 = Class20.aClass118_183.method1988(Class487.aClass378_5752, client.anInterface35_7206, -208417273);
				if (fontrenderer_5 == null) {
					fontrenderer_5 = Class285.aClass8_3394;
				}
				fontrenderer_5.method367(string_2, Class20.anInt195, Class20.anInt179, Class20.aClass118_183.anInt1301, Class20.aClass118_183.anInt1429, Class20.aClass118_183.color, Class20.aClass118_183.anInt1324, Class20.aClass118_183.anInt1359, Class20.aClass118_183.anInt1360, client.aRandom7260, PacketsDecoder.anInt9079, client.anIntArray7438, Class115.aClass160Array1248, Class20.anIntArray177, 1750233370);
				Class292.method5201(client.anIntArray7438[0], client.anIntArray7438[1], client.anIntArray7438[2], client.anIntArray7438[3], (byte) 12);
			}
		}
	}
}
