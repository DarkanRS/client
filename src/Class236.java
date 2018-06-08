
/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Class236 {
	static boolean aBool2909;
	static long aLong2910 = -7066845128101291095L;
	static Class534_Sub2 aClass534_Sub2_2911;
	static int anInt2912 = 0;
	static Class534_Sub1 aClass534_Sub1_2913;
	static Queue aQueue2914;
	
	public static void method3968(Class282_Sub53 class282_sub53) {
		if (!Class169.method2875(-1741204137 * client.anInt7166, -2098454084))
			class282_sub53.method13475(1491323558);
		else
			aClass534_Sub2_2911.method11410(class282_sub53, (byte) 24);
	}

	static {
		aBool2909 = true;
		aClass534_Sub2_2911 = new Class534_Sub2();
		aClass534_Sub1_2913 = new Class534_Sub1();
		aQueue2914 = new LinkedList();
	}

	public static void method3969() {
		synchronized (aQueue2914) {
			for (;;) {
				Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) aQueue2914.poll();
				if (class282_sub53_sub1 == null)
					break;
				class282_sub53_sub1.method13475(-480487739);
			}
		}
	}

	public static void method3970(Class282_Sub53 class282_sub53) {
		if (!Class169.method2875(-1741204137 * client.anInt7166, -1917863970))
			class282_sub53.method13475(791251996);
		else
			aClass534_Sub2_2911.method11410(class282_sub53, (byte) 24);
	}

	public static void method3971() {
		if (Class93.method1576(737246747))
			Class169.method2877(new Class237(), (byte) 20);
	}

	public static void method3972() {
		aClass534_Sub2_2911.method11409(-277742763);
		aClass534_Sub1_2913.method11409(-277742763);
		aLong2910 = -7066845128101291095L;
		aBool2909 = true;
	}

	public static void method3973() {
		if (Class93.method1576(-1632616926))
			Class169.method2877(new Class237(), (byte) -68);
	}

	public static void method3974() {
		aClass534_Sub2_2911.method11409(-277742763);
		aClass534_Sub1_2913.method11409(-277742763);
		aLong2910 = -7066845128101291095L;
		aBool2909 = true;
	}

	public static void method3975() {
		if (Class93.method1576(-1132064291))
			Class169.method2877(new Class237(), (byte) -10);
	}

	static void method3976() {
		synchronized (aQueue2914) {
			Point point;
			if (Class351.gameCanvas.isShowing())
				point = Class351.gameCanvas.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) aQueue2914.poll();
				if (null == class282_sub53_sub1)
					break;
				if (point == null || !Class351.gameCanvas.isShowing() || !Class530.aBool7050)
					class282_sub53_sub1.method13475(1967225308);
				else {
					class282_sub53_sub1.method14732(point, -1545161336);
					if (!class282_sub53_sub1.method14731(1027546934) && (class282_sub53_sub1.method13481(1640979195) < -418109423 * Class349.anInt4083) && (class282_sub53_sub1.method13469(-671163161) < Engine.anInt3243 * -969250379) && class282_sub53_sub1.method13481(1455240973) >= 0 && class282_sub53_sub1.method13469(737835345) >= 0) {
						int i = class282_sub53_sub1.method13470(1041558998);
						if (class282_sub53_sub1.method13470(-1182900523) == -1)
							aClass534_Sub1_2913.method11410(class282_sub53_sub1, (byte) 24);
						else if (Class298.method5304(i, -884201168))
							aClass534_Sub1_2913.method12809(class282_sub53_sub1, 16711935);
					}
				}
			}
		}
	}

	public static void method3977(Class282_Sub53 class282_sub53) {
		if (!Class169.method2875(-1741204137 * client.anInt7166, -1952645738))
			class282_sub53.method13475(-1628743170);
		else
			aClass534_Sub2_2911.method11410(class282_sub53, (byte) 24);
	}

	static void method3978() {
		synchronized (aQueue2914) {
			Point point;
			if (Class351.gameCanvas.isShowing())
				point = Class351.gameCanvas.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) aQueue2914.poll();
				if (null == class282_sub53_sub1)
					break;
				if (point == null || !Class351.gameCanvas.isShowing() || !Class530.aBool7050)
					class282_sub53_sub1.method13475(940122346);
				else {
					class282_sub53_sub1.method14732(point, -1545161336);
					if (!class282_sub53_sub1.method14731(-397351507) && (class282_sub53_sub1.method13481(1193255882) < -418109423 * Class349.anInt4083) && (class282_sub53_sub1.method13469(725757410) < Engine.anInt3243 * -969250379) && class282_sub53_sub1.method13481(1727253317) >= 0 && class282_sub53_sub1.method13469(-559863837) >= 0) {
						int i = class282_sub53_sub1.method13470(-1833626141);
						if (class282_sub53_sub1.method13470(-1459707112) == -1)
							aClass534_Sub1_2913.method11410(class282_sub53_sub1, (byte) 24);
						else if (Class298.method5304(i, -1468531517))
							aClass534_Sub1_2913.method12809(class282_sub53_sub1, 16711935);
					}
				}
			}
		}
	}

	Class236() throws Throwable {
		throw new Error();
	}

	public static void method3979() {
		synchronized (aQueue2914) {
			for (;;) {
				Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) aQueue2914.poll();
				if (class282_sub53_sub1 == null)
					break;
				class282_sub53_sub1.method13475(-1919591066);
			}
		}
	}

	public static void method3980() {
		Class373.method6365(-624739613);
		aClass534_Sub2_2911.method11417(-2131070711);
		aClass534_Sub1_2913.method11417(-2025016525);
		if (client.anInt7196 * -809233249 > 0) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4555, client.aClass184_7475.isaac, 1599560152);
			class282_sub23.buffer.writeShort(client.anInt7196 * 1058034300, 1417031095);
			for (int i = 0; i < -809233249 * client.anInt7196; i++) {
				Interface16 interface16 = client.anInterface16Array7298[i];
				long l = (interface16.method119(271107573) - -3063389150359337113L * aLong2910);
				if (l > 16777215L)
					l = 16777215L;
				aLong2910 = interface16.method119(1978831775) * 7066845128101291095L;
				class282_sub23.buffer.writeByte(interface16.method92(317240429));
				class282_sub23.buffer.write24BitInt((int) l, (byte) 14);
			}
			client.aClass184_7475.method3049(class282_sub23, 1095849519);
		}
		if (1389032649 * anInt2912 > 0)
			anInt2912 -= 1241998713;
		if (client.aBool7371 && anInt2912 * 1389032649 <= 0) {
			anInt2912 = -929829516;
			client.aBool7371 = false;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4593, client.aClass184_7475.isaac, -19697976);
			class282_sub23.buffer.writeShortLE128((int) client.aFloat7146 >> 3, -1183932171);
			class282_sub23.buffer.writeShort128((int) client.aFloat7365 >> 3, -800257688);
			client.aClass184_7475.method3049(class282_sub23, -817618495);
		}
		if (aBool2909 != Class530.aBool7050) {
			aBool2909 = Class530.aBool7050;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4597, client.aClass184_7475.isaac, 1253502350);
			class282_sub23.buffer.writeByte(Class530.aBool7050 ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, -1055822261);
		}
		if (!client.aBool7175) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4537, client.aClass184_7475.isaac, 60461791);
			class282_sub23.buffer.writeByte(0);
			int i = (-1990677291 * class282_sub23.buffer.index);
			RsByteBuffer class282_sub35 = Class393.aClass282_Sub54_4783.method13499(-1147561842);
			class282_sub23.buffer.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
			class282_sub23.buffer.method13061((class282_sub23.buffer.index * -1990677291) - i, -1166490048);
			client.aClass184_7475.method3049(class282_sub23, -1096465741);
			client.aBool7175 = true;
		}
	}

	public static void method3981() {
		Class373.method6365(-1078371833);
		aClass534_Sub2_2911.method11417(-2092643769);
		aClass534_Sub1_2913.method11417(-2019935808);
		if (client.anInt7196 * -809233249 > 0) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4555, client.aClass184_7475.isaac, 1523962744);
			class282_sub23.buffer.writeShort(client.anInt7196 * 1058034300, 1417031095);
			for (int i = 0; i < -809233249 * client.anInt7196; i++) {
				Interface16 interface16 = client.anInterface16Array7298[i];
				long l = (interface16.method119(-1599226670) - -3063389150359337113L * aLong2910);
				if (l > 16777215L)
					l = 16777215L;
				aLong2910 = (interface16.method119(-2082955085) * 7066845128101291095L);
				class282_sub23.buffer.writeByte(interface16.method92(317240429));
				class282_sub23.buffer.write24BitInt((int) l, (byte) 14);
			}
			client.aClass184_7475.method3049(class282_sub23, -905187608);
		}
		if (1389032649 * anInt2912 > 0)
			anInt2912 -= 1241998713;
		if (client.aBool7371 && anInt2912 * 1389032649 <= 0) {
			anInt2912 = -929829516;
			client.aBool7371 = false;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4593, client.aClass184_7475.isaac, 862540422);
			class282_sub23.buffer.writeShortLE128((int) client.aFloat7146 >> 3, -1183932171);
			class282_sub23.buffer.writeShort128((int) client.aFloat7365 >> 3, -800257688);
			client.aClass184_7475.method3049(class282_sub23, 1267628084);
		}
		if (aBool2909 != Class530.aBool7050) {
			aBool2909 = Class530.aBool7050;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4597, client.aClass184_7475.isaac, 1965686540);
			class282_sub23.buffer.writeByte(Class530.aBool7050 ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, 1220912376);
		}
		if (!client.aBool7175) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4537, client.aClass184_7475.isaac, -566531928);
			class282_sub23.buffer.writeByte(0);
			int i = (-1990677291 * class282_sub23.buffer.index);
			RsByteBuffer class282_sub35 = Class393.aClass282_Sub54_4783.method13499(-1147561842);
			class282_sub23.buffer.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
			class282_sub23.buffer.method13061((class282_sub23.buffer.index * -1990677291) - i, 197005771);
			client.aClass184_7475.method3049(class282_sub23, 1972990392);
			client.aBool7175 = true;
		}
	}

	public static void method3982() {
		Class373.method6365(-190153689);
		aClass534_Sub2_2911.method11417(-2053066056);
		aClass534_Sub1_2913.method11417(-2128219454);
		if (client.anInt7196 * -809233249 > 0) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4555, client.aClass184_7475.isaac, 101857474);
			class282_sub23.buffer.writeShort(client.anInt7196 * 1058034300, 1417031095);
			for (int i = 0; i < -809233249 * client.anInt7196; i++) {
				Interface16 interface16 = client.anInterface16Array7298[i];
				long l = (interface16.method119(714046399) - -3063389150359337113L * aLong2910);
				if (l > 16777215L)
					l = 16777215L;
				aLong2910 = (interface16.method119(-1304839736) * 7066845128101291095L);
				class282_sub23.buffer.writeByte(interface16.method92(317240429));
				class282_sub23.buffer.write24BitInt((int) l, (byte) 14);
			}
			client.aClass184_7475.method3049(class282_sub23, 1455330085);
		}
		if (1389032649 * anInt2912 > 0)
			anInt2912 -= 1241998713;
		if (client.aBool7371 && anInt2912 * 1389032649 <= 0) {
			anInt2912 = -929829516;
			client.aBool7371 = false;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4593, client.aClass184_7475.isaac, 2062495474);
			class282_sub23.buffer.writeShortLE128((int) client.aFloat7146 >> 3, -1183932171);
			class282_sub23.buffer.writeShort128((int) client.aFloat7365 >> 3, -800257688);
			client.aClass184_7475.method3049(class282_sub23, 279844120);
		}
		if (aBool2909 != Class530.aBool7050) {
			aBool2909 = Class530.aBool7050;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4597, client.aClass184_7475.isaac, 1487838207);
			class282_sub23.buffer.writeByte(Class530.aBool7050 ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, 1260523793);
		}
		if (!client.aBool7175) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4537, client.aClass184_7475.isaac, 320552293);
			class282_sub23.buffer.writeByte(0);
			int i = (-1990677291 * class282_sub23.buffer.index);
			RsByteBuffer class282_sub35 = Class393.aClass282_Sub54_4783.method13499(-1147561842);
			class282_sub23.buffer.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
			class282_sub23.buffer.method13061((class282_sub23.buffer.index * -1990677291) - i, 1349555723);
			client.aClass184_7475.method3049(class282_sub23, -461512155);
			client.aBool7175 = true;
		}
	}

	static final void method3983(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class527.anInt7012 -= 567564004;
		class118.anInt1295 = 1302798223 * (class527.intStack[class527.anInt7012 * 1942118537]);
		class118.anInt1296 = (-1965685901 * (class527.intStack[1942118537 * class527.anInt7012 + 1]));
		int i_0_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		if (i_0_ < 0)
			i_0_ = 0;
		else if (i_0_ > 5)
			i_0_ = 5;
		int i_1_ = (class527.intStack[3 + 1942118537 * class527.anInt7012]);
		if (i_1_ < 0)
			i_1_ = 0;
		else if (i_1_ > 5)
			i_1_ = 5;
		class118.aByte1333 = (byte) i_0_;
		class118.aByte1355 = (byte) i_1_;
		Class109.method1858(class118, (byte) -75);
		Class44.method913(class98, class118, (byte) 1);
		if (class118.anInt1268 * -2131393857 == 0)
			Class12.method483(class98, class118, false, -1665129520);
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class396.method6774(class118.idHash * -1952846363, (byte) -43);
	}

	static final void method3984(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class101.method1776(i_2_, false, 610483852);
	}

	static void method3985(Animable class521_sub1_sub1_sub2, int i, byte i_3_) {
		if (class521_sub1_sub1_sub2.anIntArray10350 != null) {
			Class249 class249 = ((Class249) Class386.method6672(Class8_Sub3.method14339(2013063034), i, -1950936431));
			int i_4_ = (class521_sub1_sub1_sub2.anIntArray10350[class249.method4268(306106666)]);
			if (i_4_ != class521_sub1_sub1_sub2.aClass456_10338.method7597(-886146530)) {
				class521_sub1_sub1_sub2.aClass456_10338.method7615(i_4_, class521_sub1_sub1_sub2.aClass456_10338.method7574(-752424125), 405438357);
				class521_sub1_sub1_sub2.anInt10367 = class521_sub1_sub1_sub2.anInt10355 * 485298635;
			}
		}
	}

	static final void method3986(CS2Executor class527, int i) {
		if (null == Class308.aShortArray3621 || (1750691703 * Class283.anInt3384 >= 560339485 * Class415.anInt4985))
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = ((Class308.aShortArray3621[(Class283.anInt3384 += 220207687) * 1750691703 - 1]) & 0xffff);
	}
}
