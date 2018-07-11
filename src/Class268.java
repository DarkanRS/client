/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class268 {
	int anInt3291;
	static final byte aByte3292 = 2;
	static final byte aByte3293 = 3;
	Class282_Sub18 aClass282_Sub18_3294;
	int anInt3295;
	Class282_Sub26_Sub1_Sub1 aClass282_Sub26_Sub1_Sub1_3296;
	int anInt3297;
	int anInt3298;
	int anInt3299;
	byte aByte3300;
	static final byte aByte3301 = 1;
	int anInt3302;
	Class343 aClass343_3303;
	Class282_Sub15_Sub5 aClass282_Sub15_Sub5_3304;
	int anInt3305 = 1094655877;
	int anInt3306 = -1820867023;
	static int anInt3307;

	boolean method4793(byte i) {
		return (((Class268) this).aByte3300 == 2 || ((Class268) this).aByte3300 == 3);
	}

	boolean method4794() {
		return (((Class268) this).aByte3300 == 2 || ((Class268) this).aByte3300 == 3);
	}

	Class268(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class521_Sub1 class521_sub1) {
		((Class268) this).aByte3300 = i;
		((Class268) this).anInt3291 = 716186907 * i_0_;
		((Class268) this).anInt3302 = i_1_ * 960122691;
		((Class268) this).anInt3297 = i_2_ * 1909850437;
		((Class268) this).anInt3299 = i_3_ * 776249937;
		((Class268) this).anInt3298 = 766590407 * i_4_;
		((Class268) this).anInt3295 = 1990221407 * i_5_;
		if (null != class521_sub1 && class521_sub1 instanceof Class521_Sub1_Sub1) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = (Class521_Sub1_Sub1) class521_sub1;
			((Class268) this).anInt3305 = -1094655877 * class521_sub1_sub1.aShort9458;
			((Class268) this).anInt3306 = 1820867023 * class521_sub1_sub1.aShort9456;
		}
	}

	boolean method4795() {
		return (((Class268) this).aByte3300 == 2 || ((Class268) this).aByte3300 == 3);
	}

	boolean method4796() {
		return (((Class268) this).aByte3300 == 2 || ((Class268) this).aByte3300 == 3);
	}

	static final void method4797(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class169.method2874(class118, class98, class527, (byte) 11);
	}

	static final void method4798(CS2Executor class527, int i) {
		Class282_Sub4.method12114((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]), 917416551);
	}

	public static int[] method4799(int i, int i_6_) {
		int[] is = new int[3];
		Class155.method2634(Class302.method5363(i, 1155387046));
		is[0] = Class407.aCalendar4848.get(5);
		is[1] = Class407.aCalendar4848.get(2);
		is[2] = Class407.aCalendar4848.get(1);
		return is;
	}

	static void method4800(GraphicalRenderer class505, byte i) {
		if ((Class20.anInt169 * 2144330291 >= 2 || client.aBool7344) && client.aClass118_7257 == null) {
			String string;
			if (client.aBool7344 && 2144330291 * Class20.anInt169 < 2)
				string = new StringBuilder().append(client.aString7275).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -912912276)).append(client.aString7356).append(" ").append(Class2.aString17).toString();
			else if (Class468_Sub1.method12619(-1903584217) && 2144330291 * Class20.anInt169 > 2)
				string = IncomingPacket.method6380((Class96_Sub23.aClass282_Sub50_Sub7_9445), 1195583741);
			else {
				Class282_Sub50_Sub7 class282_sub50_sub7 = Class96_Sub23.aClass282_Sub50_Sub7_9445;
				if (null == class282_sub50_sub7)
					return;
				string = IncomingPacket.method6380(class282_sub50_sub7, 1123504706);
				int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -1336515986);
				if (null != is)
					string = new StringBuilder().append(string).append(Class15.method547(is, 2114598830)).toString();
			}
			if (Class20.anInt169 * 2144330291 > 2)
				string = new StringBuilder().append(string).append(Class59.method1163(16777215, 619010179)).append(" / ").append(2144330291 * Class20.anInt169 - 2).append(Message.MORE_OPTIONS.translate(Class223.CURRENT_LANGUAGE, -386320365)).toString();
			if (Class20.aClass118_183 != null) {
				FontRenderer class8 = Class20.aClass118_183.method1988(Class487.aClass378_5752, (client.anInterface35_7206), -208417273);
				if (class8 == null)
					class8 = Class285.aClass8_3394;
				class8.method367(string, Class20.anInt195 * 734403649, -1447866103 * Class20.anInt179, Class20.aClass118_183.anInt1301 * 1506818197, Class20.aClass118_183.anInt1429 * -492594917, Class20.aClass118_183.anInt1264 * -795991475, 1279397863 * Class20.aClass118_183.anInt1324, -220189555 * Class20.aClass118_183.anInt1359, Class20.aClass118_183.anInt1360 * 1297350181, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, client.anIntArray7438, Class115.aClass160Array1248,
						Class20.anIntArray177, 1750233370);
				Class292.method5201(client.anIntArray7438[0], client.anIntArray7438[1], client.anIntArray7438[2], client.anIntArray7438[3], (byte) 12);
			}
		}
	}

	static final void method4801(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub20_Sub9.method15256(class118, class98, class527, -158517117);
	}

	static final void method4802(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1288 * 1924549737;
	}
}
