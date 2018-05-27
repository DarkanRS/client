
/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class14 {
	static int[] anIntArray131;
	static final int anInt132 = 3;
	static int anInt133 = 0;
	static int anInt134 = 0;

	static void method509() {
		Class192.aClass1_2391 = Class1.aClass1_11;
		Class96_Sub9.aClass483_9278 = Class483.aClass483_5729;
		Class237.aClass494_2916 = Class494.aClass494_5786;
		Class404.aClass466_4831 = Class466.aClass466_5569;
	}

	static int[] method510(Class282_Sub23 class282_sub23) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(518);
		int[] is = new int[4];
		for (int i = 0; i < 4; i++) {
			is[i] = (int) (Math.random() * 9.9999999E7);
		}
		class282_sub35.writeByte(10);
		class282_sub35.writeInt(is[0]);
		class282_sub35.writeInt(is[1]);
		class282_sub35.writeInt(is[2]);
		class282_sub35.writeInt(is[3]);
		for (int i = 0; i < 10; i++) {
			class282_sub35.writeInt((int) (Math.random() * 9.9999999E7));
		}
		class282_sub35.writeShort((int) (Math.random() * 9.9999999E7), 1417031095);
		class282_sub35.applyRSA(Class18.LOGIN_EXPONENT, Class18.LOGIN_MODULUS);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
		return is;
	}

	public static void method511() {
		if (client.anInt7166 * -1741204137 == 5 && (!JS5CacheFile.method3360((byte) -83) && !Class85.method1466(202936196))) {
			Class365.method6298(8, 788883621);
		}
	}

	public static void method512(int i) {
		if (3 == client.anInt7166 * -1741204137) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4606, client.aClass184_7218.aClass432_2283, 113846186);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			client.aClass184_7218.method3049(class282_sub23, 956883870);
		}
	}

	static void method513() {
		Class192.aClass1_2391 = Class1.aClass1_11;
		Class96_Sub9.aClass483_9278 = Class483.aClass483_5729;
		Class237.aClass494_2916 = Class494.aClass494_5786;
		Class404.aClass466_4831 = Class466.aClass466_5569;
	}

	static void method514() {
		Class192.aClass1_2391 = Class1.aClass1_11;
		Class96_Sub9.aClass483_9278 = Class483.aClass483_5729;
		Class237.aClass494_2916 = Class494.aClass494_5786;
		Class404.aClass466_4831 = Class466.aClass466_5569;
	}

	static boolean method515() {
		return Class192.aClass1_2391 != null;
	}

	static void method516(Class494 class494) {
		Class237.aClass494_2916 = class494;
	}

	static int[] method517(Class282_Sub23 class282_sub23) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(518);
		int[] is = new int[4];
		for (int i = 0; i < 4; i++) {
			is[i] = (int) (Math.random() * 9.9999999E7);
		}
		class282_sub35.writeByte(10);
		class282_sub35.writeInt(is[0]);
		class282_sub35.writeInt(is[1]);
		class282_sub35.writeInt(is[2]);
		class282_sub35.writeInt(is[3]);
		for (int i = 0; i < 10; i++) {
			class282_sub35.writeInt((int) (Math.random() * 9.9999999E7));
		}
		class282_sub35.writeShort((int) (Math.random() * 9.9999999E7), 1417031095);
		class282_sub35.applyRSA(Class18.LOGIN_EXPONENT, Class18.LOGIN_MODULUS);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
		return is;
	}

	public static void method518(int i) {
		if (3 == client.anInt7166 * -1741204137) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4606, client.aClass184_7218.aClass432_2283, 762027735);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			client.aClass184_7218.method3049(class282_sub23, -431175530);
		}
	}

	public static void method519(String string) {
		if (-1741204137 * client.anInt7166 == 3) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4570, client.aClass184_7218.aClass432_2283, 1877460792);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
			int i = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.index += 781596523;
			class282_sub23.aClass282_Sub35_Sub2_7682.method13101(anIntArray131, i, (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index), 1215552851);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13281((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i, 1201423895);
			client.aClass184_7218.method3049(class282_sub23, 1299979472);
			Class404.aClass466_4831 = Class466.aClass466_5564;
		}
	}

	public static Class483 method520() {
		if (null == Class96_Sub9.aClass483_9278) {
			return Class483.aClass483_5730;
		}
		return Class96_Sub9.aClass483_9278;
	}

	public static Class494 method521() {
		if (Class237.aClass494_2916 == null) {
			return Class494.aClass494_5786;
		}
		return Class237.aClass494_2916;
	}

	static int[] method522(Class282_Sub23 class282_sub23) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(518);
		int[] is = new int[4];
		for (int i = 0; i < 4; i++) {
			is[i] = (int) (Math.random() * 9.9999999E7);
		}
		class282_sub35.writeByte(10);
		class282_sub35.writeInt(is[0]);
		class282_sub35.writeInt(is[1]);
		class282_sub35.writeInt(is[2]);
		class282_sub35.writeInt(is[3]);
		for (int i = 0; i < 10; i++) {
			class282_sub35.writeInt((int) (Math.random() * 9.9999999E7));
		}
		class282_sub35.writeShort((int) (Math.random() * 9.9999999E7), 1417031095);
		class282_sub35.applyRSA(Class18.LOGIN_EXPONENT, Class18.LOGIN_MODULUS);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
		return is;
	}

	public static Class494 method523() {
		if (Class237.aClass494_2916 == null) {
			return Class494.aClass494_5786;
		}
		return Class237.aClass494_2916;
	}

	public static Class466 method524() {
		if (null == Class404.aClass466_4831) {
			return Class466.aClass466_5569;
		}
		return Class404.aClass466_4831;
	}

	Class14() throws Throwable {
		throw new Error();
	}

	static void method525(Class494 class494) {
		Class237.aClass494_2916 = class494;
	}

	static void method526(Class494 class494) {
		Class237.aClass494_2916 = class494;
	}

	static void method527(Class466 class466) {
		Class404.aClass466_4831 = class466;
	}

	static void method528(Class466 class466) {
		Class404.aClass466_4831 = class466;
	}

	static void method529() {
		if (null != Class192.aClass1_2391) {
			try {
				int i;
				if (0 == 1539502519 * anInt134) {
					i = 250;
				} else {
					i = 2000;
				}
				anInt133 += -1066537219;
				if (-623501739 * anInt133 > i) {
					Class5.method297(1966582117);
				}
				if (Class192.aClass1_2391 == Class1.aClass1_11) {
					client.aClass184_7218.method3050(Class38.method852(Class448.aClass450_5424.method7494((byte) 113), 15000, 1368325142), Class448.aClass450_5424.aString5433, (byte) -14);
					client.aClass184_7218.method3054((short) -9124);
					Class282_Sub23 class282_sub23 = Class207.method3558((byte) 21);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1627920319 * Class369.aClass369_4275.anInt4278);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
					int i_0_ = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(727, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(1, 1417031095);
					anIntArray131 = Class463.method7725(class282_sub23, (byte) -81);
					int i_1_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(client.aString7164);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-1543197399 * client.anInt7149, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeLong(-8972807970865466165L * client.aLong7153);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(Class464.aString5555);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class223.CURRENT_LANGUAGE.method243((byte) 1));
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.CURRENT_GAME.anInt5746 * 1648080491);
					Class31.method809(class282_sub23.aClass282_Sub35_Sub2_7682, -1203327887);
					String string = client.aString7156;
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string == null ? 0 : 1);
					if (string != null) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
					}
					Class11.aClass282_Sub51_124.writeMachineInformation(class282_sub23.aClass282_Sub35_Sub2_7682, 419814551);
					class282_sub23.aClass282_Sub35_Sub2_7682.index += 781596523;
					class282_sub23.aClass282_Sub35_Sub2_7682.method13101(anIntArray131, i_1_, (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291), 1018047228);
					class282_sub23.aClass282_Sub35_Sub2_7682.method13281((-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i_0_), 1201423895);
					client.aClass184_7218.method3049(class282_sub23, -593422595);
					client.aClass184_7218.method3047(-126216739);
					Class192.aClass1_2391 = Class1.aClass1_10;
				}
				if (Class1.aClass1_10 == Class192.aClass1_2391) {
					if (client.aClass184_7218.method3053((byte) -95) == null) {
						Class5.method297(1947398967);
					} else if (client.aClass184_7218.method3053((byte) -82).method3315(1, (byte) 32)) {
						client.aClass184_7218.method3053((byte) -37).method3327((client.aClass184_7218.aClass282_Sub35_Sub2_2284.buffer), 0, 1, -1954229573);
						Class96_Sub9.aClass483_9278 = ((Class483) Class386.method6672(Class98.method1626(1186080710), (client.aClass184_7218.aClass282_Sub35_Sub2_2284.buffer[0]) & 0xff, -2094829621));
						if (Class483.aClass483_5734 == Class96_Sub9.aClass483_9278) {
							client.aClass184_7218.aClass432_2283 = new IsaacCipher(anIntArray131);
							int[] is = new int[4];
							for (int i_2_ = 0; i_2_ < 4; i_2_++) {
								is[i_2_] = anIntArray131[i_2_] + 50;
							}
							client.aClass184_7218.aClass432_2295 = new IsaacCipher(is);
							new IsaacCipher(is);
							client.aClass184_7218.aClass282_Sub35_Sub2_2284.method14867((client.aClass184_7218.aClass432_2295), 265937050);
							Class365.method6298(3, 1921190304);
							client.aClass184_7218.method3054((short) 8755);
							client.aClass184_7218.aClass282_Sub35_Sub2_2284.index = 0;
							client.aClass184_7218.aClass375_2278 = null;
							client.aClass184_7218.aClass375_2296 = null;
							client.aClass184_7218.aClass375_2291 = null;
							client.aClass184_7218.anInt2289 = 0;
						} else {
							client.aClass184_7218.method3051((byte) -105);
						}
						client.aClass184_7218.aClass375_2286 = null;
						Class192.aClass1_2391 = null;
					}
				}
			} catch (IOException ioexception) {
				Class5.method297(2029025504);
			}
		}
	}

	static void method530() {
		if (null != Class192.aClass1_2391) {
			try {
				int i;
				if (0 == 1539502519 * anInt134) {
					i = 250;
				} else {
					i = 2000;
				}
				anInt133 += -1066537219;
				if (-623501739 * anInt133 > i) {
					Class5.method297(2046137401);
				}
				if (Class192.aClass1_2391 == Class1.aClass1_11) {
					client.aClass184_7218.method3050(Class38.method852(Class448.aClass450_5424.method7494((byte) 126), 15000, -1073158074), Class448.aClass450_5424.aString5433, (byte) -49);
					client.aClass184_7218.method3054((short) -9437);
					Class282_Sub23 class282_sub23 = Class207.method3558((byte) 98);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(1627920319 * Class369.aClass369_4275.anInt4278);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
					int i_3_ = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(727, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(1, 1417031095);
					anIntArray131 = Class463.method7725(class282_sub23, (byte) -73);
					int i_4_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(client.aString7164);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-1543197399 * client.anInt7149, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeLong(-8972807970865466165L * client.aLong7153);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(Class464.aString5555);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class223.CURRENT_LANGUAGE.method243((byte) 1));
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.CURRENT_GAME.anInt5746 * 1648080491);
					Class31.method809(class282_sub23.aClass282_Sub35_Sub2_7682, -1909494425);
					String string = client.aString7156;
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string == null ? 0 : 1);
					if (string != null) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
					}
					Class11.aClass282_Sub51_124.writeMachineInformation(class282_sub23.aClass282_Sub35_Sub2_7682, 419814551);
					class282_sub23.aClass282_Sub35_Sub2_7682.index += 781596523;
					class282_sub23.aClass282_Sub35_Sub2_7682.method13101(anIntArray131, i_4_, (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291), 1166498960);
					class282_sub23.aClass282_Sub35_Sub2_7682.method13281((-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i_3_), 1201423895);
					client.aClass184_7218.method3049(class282_sub23, 633127749);
					client.aClass184_7218.method3047(-54298491);
					Class192.aClass1_2391 = Class1.aClass1_10;
				}
				if (Class1.aClass1_10 == Class192.aClass1_2391) {
					if (client.aClass184_7218.method3053((byte) -64) == null) {
						Class5.method297(1963604679);
					} else if (client.aClass184_7218.method3053((byte) -9).method3315(1, (byte) 70)) {
						client.aClass184_7218.method3053((byte) -22).method3327((client.aClass184_7218.aClass282_Sub35_Sub2_2284.buffer), 0, 1, -1209978686);
						Class96_Sub9.aClass483_9278 = ((Class483) Class386.method6672(Class98.method1626(1186080710), (client.aClass184_7218.aClass282_Sub35_Sub2_2284.buffer[0]) & 0xff, -1986301155));
						if (Class483.aClass483_5734 == Class96_Sub9.aClass483_9278) {
							client.aClass184_7218.aClass432_2283 = new IsaacCipher(anIntArray131);
							int[] is = new int[4];
							for (int i_5_ = 0; i_5_ < 4; i_5_++) {
								is[i_5_] = anIntArray131[i_5_] + 50;
							}
							client.aClass184_7218.aClass432_2295 = new IsaacCipher(is);
							new IsaacCipher(is);
							client.aClass184_7218.aClass282_Sub35_Sub2_2284.method14867((client.aClass184_7218.aClass432_2295), 1278346129);
							Class365.method6298(3, 703977156);
							client.aClass184_7218.method3054((short) 19258);
							client.aClass184_7218.aClass282_Sub35_Sub2_2284.index = 0;
							client.aClass184_7218.aClass375_2278 = null;
							client.aClass184_7218.aClass375_2296 = null;
							client.aClass184_7218.aClass375_2291 = null;
							client.aClass184_7218.anInt2289 = 0;
						} else {
							client.aClass184_7218.method3051((byte) -116);
						}
						client.aClass184_7218.aClass375_2286 = null;
						Class192.aClass1_2391 = null;
					}
				}
			} catch (IOException ioexception) {
				Class5.method297(2098655578);
			}
		}
	}

	public static void method531(String string, String string_6_, int i, boolean bool) {
		if (3 == client.anInt7166 * -1741204137) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4628, client.aClass184_7218.aClass432_2283, 850444840);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
			int i_7_ = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_6_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool ? 1 : 0);
			class282_sub23.aClass282_Sub35_Sub2_7682.index += 781596523;
			class282_sub23.aClass282_Sub35_Sub2_7682.method13101(anIntArray131, i_7_, (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291), 1159424708);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13281((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i_7_, 1201423895);
			client.aClass184_7218.method3049(class282_sub23, 1205023217);
			if (i < 13) {
				client.aBool7189 = true;
				Class188.method3142(-1524757897);
			}
			Class237.aClass494_2916 = Class494.aClass494_5790;
		}
	}

	public static Class483 method532() {
		if (null == Class96_Sub9.aClass483_9278) {
			return Class483.aClass483_5730;
		}
		return Class96_Sub9.aClass483_9278;
	}

	public static void method533() {
		if (client.anInt7166 * -1741204137 == 5 && (!JS5CacheFile.method3360((byte) 15) && !Class85.method1466(1248559152))) {
			Class365.method6298(8, 1165660023);
		}
	}

	static void method534() {
		client.aClass184_7218.method3051((byte) -19);
		if (anInt134 * 1539502519 < 2) {
			Class448.aClass450_5424.method7493(-1299064448);
			anInt133 = 0;
			anInt134 += 1763687431;
			Class192.aClass1_2391 = Class1.aClass1_11;
		} else {
			Class192.aClass1_2391 = null;
			Class96_Sub9.aClass483_9278 = Class483.aClass483_5731;
			Class365.method6298(5, 1076898236);
		}
	}

	static void method535() {
		client.aClass184_7218.method3051((byte) -110);
		if (anInt134 * 1539502519 < 2) {
			Class448.aClass450_5424.method7493(-493174083);
			anInt133 = 0;
			anInt134 += 1763687431;
			Class192.aClass1_2391 = Class1.aClass1_11;
		} else {
			Class192.aClass1_2391 = null;
			Class96_Sub9.aClass483_9278 = Class483.aClass483_5731;
			Class365.method6298(5, 1915572295);
		}
	}

	static final void method536(CS2Executor class527, byte i) {
		class527.anInt7012 -= 425673003;
		int i_8_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_9_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_10_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (-1 == i_9_) {
			throw new RuntimeException();
		}
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_9_, (byte) 8);
		if (i_8_ != class431.aChar5146) {
			throw new RuntimeException();
		}
		if ('s' != class431.aChar5140) {
			throw new RuntimeException();
		}
		int[] is = class431.method7251(string, 1800176062);
		if (i_10_ < 0 || null == is || is.length <= i_10_) {
			throw new RuntimeException();
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = is[i_10_];
	}

	static void method537(int i) {
		Class9.lobbyStage = 211318143;
		Class9.aClass184_73 = client.aClass184_7475;
		Class455.method7558(-1L == Class9.aLong77 * 8013795473128403269L, true, "", "", Class9.aLong77 * 8013795473128403269L);
	}

	static final void decodeMasks() {
		RsBitsBuffer buffer = client.aClass184_7475.aClass282_Sub35_Sub2_2284;
		for (int i = 0; i < client.npcListSize * -1300281051; i++) {
			int npcIndex = client.NPC_INDICES[i];
			NPC npc = ((NPC) (((Class282_Sub47) client.aClass465_7208.method7754(npcIndex)).anObject8068));
			int flags = buffer.readUnsignedByte();
			if ((flags & 0x40) != 0) {
				flags += buffer.readUnsignedByte() << 8;
			}
			if (0 != (flags & 0x2000)) {
				flags += buffer.readUnsignedByte() << 16;
			}
			if (0 != (flags & 0x100000)) {
				flags += buffer.readUnsignedByte() << 24;
			}
			if (0 != (flags & 0x10)) {
				int[] is = new int[Class8_Sub3.method14339(195444347).length];
				for (int i_14_ = 0; i_14_ < Class8_Sub3.method14339(1841907826).length; i_14_++) {
					is[i_14_] = buffer.readBigSmart();
				}
				int i_15_ = buffer.readUnsignedByte();
				Class20.animate(npc, is, i_15_, true, (byte) 23);
			}
			if (0 != (flags & 0x100)) {
				int i_16_ = (npc.aClass409_10580.anIntArray4859).length;
				int i_17_ = 0;
				if ((npc.aClass409_10580.aShortArray4892) != null) {
					i_17_ = (npc.aClass409_10580.aShortArray4892).length;
				}
				int i_18_ = 0;
				if (null != (npc.aClass409_10580.aShortArray4867)) {
					i_18_ = (npc.aClass409_10580.aShortArray4867).length;
				}
				int i_19_ = buffer.readUnsigned128Byte();
				if ((i_19_ & 0x1) == 1) {
					npc.aClass417_10581 = null;
				} else {
					int[] is = null;
					if (2 == (i_19_ & 0x2)) {
						is = new int[i_16_];
						for (int i_20_ = 0; i_20_ < i_16_; i_20_++) {
							is[i_20_] = buffer.readBigSmart();
						}
					}
					short[] is_21_ = null;
					if ((i_19_ & 0x4) == 4) {
						is_21_ = new short[i_17_];
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
							is_21_[i_22_] = (short) buffer.readUnsignedShort();
						}
					}
					short[] is_23_ = null;
					if ((i_19_ & 0x8) == 8) {
						is_23_ = new short[i_18_];
						for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
							is_23_[i_24_] = (short) buffer.readUnsignedShort();
						}
					}
					long l = (npcIndex | (long) ((npc.anInt10583 += -371839573) * 74147075 - 1) << 32);
					npc.aClass417_10581 = new Class417(l, is, is_21_, is_23_);
				}
			}
			if ((flags & 0x400) != 0) {
				npc.anInt10326 = (buffer.read128Byte((short) -21275) * 830034083);
				npc.anInt10328 = (buffer.readByte128(1918538585) * -2091025609);
				npc.anInt10341 = (buffer.readByteC(-1245142414) * 1110107435);
				npc.anInt10343 = (buffer.readByte128(1932630708) * -1352948627);
				npc.anInt10342 = (buffer.readShortLE((byte) -102) + client.cycles * -1809259861) * -506987231;
				npc.anInt10345 = (buffer.readShortLE((byte) -65) + -1809259861 * client.cycles) * -38144783;
				npc.anInt10346 = buffer.readShortLE128(602501853) * -19018465;
				npc.anInt10326 += (npc.regionBaseX[0] * 830034083);
				npc.anInt10328 += (npc.regionBaseY[0] * -2091025609);
				npc.anInt10341 += (1110107435 * npc.regionBaseX[0]);
				npc.anInt10343 += (npc.regionBaseY[0] * -1352948627);
				npc.anInt10355 = -2086688481;
				npc.anInt10367 = 0;
			}
			if ((flags & 0x1000) != 0) {
				npc.anInt10575 = (buffer.readUnsignedShort() * -1914841399);
				if (-343399559 * npc.anInt10575 == 65535) {
					npc.anInt10575 = 1914841399;
				}
			}
			if ((flags & 0x200000) != 0) {
				int i_25_ = ((buffer.buffer[((buffer.index += -1115476867) * -1990677291) - 1]) & 0xff);
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
					int i_27_ = buffer.readShortLE128(602501853);
					int i_28_ = buffer.readIntV1();
					npc.aClass153_10579.method2614(i_27_, i_28_, (short) 768);
				}
			}
			if (0 != (flags & 0x1000000)) {
				int i_29_ = buffer.readUnsignedShort128();
				int i_30_ = buffer.readIntV2(-309073722);
				if (i_29_ == 65535) {
					i_29_ = -1;
				}
				int i_31_ = buffer.readUnsignedByte128(-1454950076);
				int i_32_ = i_31_ & 0x7;
				int i_33_ = i_31_ >> 3 & 0xf;
				if (15 == i_33_) {
					i_33_ = -1;
				}
				boolean bool = (i_31_ >> 7 & 0x1) == 1;
				npc.sendGraphics(i_29_, i_30_, i_32_, i_33_, bool, 3, -770849102);
			}
			if (0 != (flags & 0x80)) {
				npc.faceEntity = (buffer.readShortLE((byte) -44) * -2059452093);
				if (-737324181 * npc.faceEntity == 65535) {
					npc.faceEntity = 2059452093;
				}
			}
			if (0 != (flags & 0x8000)) {
				int i_34_ = buffer.readUnsignedByteC(-172016026);
				int[] is = new int[i_34_];
				int[] is_35_ = new int[i_34_];
				int[] is_36_ = new int[i_34_];
				for (int i_37_ = 0; i_37_ < i_34_; i_37_++) {
					int i_38_ = buffer.readBigSmart();
					is[i_37_] = i_38_;
					is_35_[i_37_] = buffer.readUnsignedByte();
					is_36_[i_37_] = buffer.readShortLE((byte) -27);
				}
				Class331.method5923(npc, is, is_35_, is_36_, -125170497);
			}
			if (0 != (flags & 0x800)) {
				int i_39_ = buffer.readShortLE((byte) -78);
				int i_40_ = buffer.readInt();
				if (65535 == i_39_) {
					i_39_ = -1;
				}
				int i_41_ = buffer.readUnsignedByte128(-967780898);
				int i_42_ = i_41_ & 0x7;
				int i_43_ = i_41_ >> 3 & 0xf;
				if (i_43_ == 15) {
					i_43_ = -1;
				}
				boolean bool = (i_41_ >> 7 & 0x1) == 1;
				npc.sendGraphics(i_39_, i_40_, i_42_, i_43_, bool, 1, 733349032);
			}
			if ((flags & 0x1) != 0) {
				int i_44_ = buffer.readUnsignedByte128(-1043197231);
				if (i_44_ > 0) {
					for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
						int i_46_ = -1;
						int i_47_ = -1;
						int i_48_ = -1;
						int i_49_ = buffer.readUnsignedSmart(1828814034);
						if (i_49_ == 32767) {
							i_49_ = buffer.readUnsignedSmart(1784037348);
							i_47_ = buffer.readUnsignedSmart(1685424814);
							i_46_ = buffer.readUnsignedSmart(1522141109);
							i_48_ = buffer.readUnsignedSmart(1916421564);
						} else if (i_49_ != 32766) {
							i_47_ = buffer.readUnsignedSmart(2083838398);
						} else {
							i_49_ = -1;
							i_47_ = buffer.readUnsignedByte();
						}
						int i_50_ = buffer.readUnsignedSmart(1905070758);
						npc.applyHit(i_49_, i_47_, i_46_, i_48_, client.cycles * -1809259861, i_50_, 1810678734);
					}
				}
				int i_51_ = buffer.readUnsignedByte128(-625812613);
				if (i_51_ > 0) {
					for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
						int i_53_ = buffer.readUnsignedSmart(2098648600);
						int i_54_ = buffer.readUnsignedSmart(2076092492);
						if (i_54_ != 32767) {
							int i_55_ = buffer.readUnsignedSmart(1675414519);
							int i_56_ = buffer.readUnsigned128Byte();
							int i_57_ = (i_54_ > 0 ? buffer.readUnsignedByte128(-1240191837) : i_56_);
							npc.method15803(i_53_, client.cycles * -1809259861, i_54_, i_55_, i_56_, i_57_, (byte) 0);
						} else {
							npc.method15857(i_53_, 1885735347);
						}
					}
				}
			}
			if (0 != (flags & 0x8)) {
				if (npc.aClass409_10580.method6886(-1543379642)) {
					Class169.method2876(npc, 1280406765);
				}
				npc.method16166((IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(buffer.readBigSmart(), (byte) 45)), 332217631);
				npc.method15836(1203434505 * (npc.aClass409_10580.anInt4858), (byte) -91);
				npc.anInt10340 = -222526911 * ((npc.aClass409_10580.anInt4889) * 1913503455 << 3);
				if (npc.aClass409_10580.method6886(-1928423029)) {
					Class397.method6775(npc.aByte7967, (npc.regionBaseX[0]), (npc.regionBaseY[0]), 0, null, npc, null, 352984427);
				}
			}
			if ((flags & 0x2000000) != 0) {
				int i_58_ = buffer.readShortLE((byte) -78);
				int i_59_ = buffer.readIntLE(1663978297);
				if (i_58_ == 65535) {
					i_58_ = -1;
				}
				int i_60_ = buffer.readUnsignedByte();
				int i_61_ = i_60_ & 0x7;
				int i_62_ = i_60_ >> 3 & 0xf;
				if (15 == i_62_) {
					i_62_ = -1;
				}
				boolean bool = (i_60_ >> 7 & 0x1) == 1;
				npc.sendGraphics(i_58_, i_59_, i_61_, i_62_, bool, 2, -195417019);
			}
			if ((flags & 0x80000) != 0) {
				int i_63_ = ((buffer.buffer[((buffer.index += -1115476867) * -1990677291) - 1]) & 0xff);
				for (int i_64_ = 0; i_64_ < i_63_; i_64_++) {
					int i_65_ = buffer.readUnsignedByte128(-890813741);
					int i_66_ = buffer.readInt();
					int i_67_ = buffer.method13132(-458827259);
					npc.method16179(i_65_, i_66_, i_67_, (byte) -110);
				}
			}
			if (0 != (flags & 0x40000)) {
				int i_68_ = (npc.aClass409_10580.anIntArray4860).length;
				int i_69_ = 0;
				if (null != (npc.aClass409_10580.aShortArray4892)) {
					i_69_ = (npc.aClass409_10580.aShortArray4892).length;
				}
				int i_70_ = 0;
				if ((npc.aClass409_10580.aShortArray4867) != null) {
					i_69_ = (npc.aClass409_10580.aShortArray4867).length;
				}
				int i_71_ = buffer.readUnsignedByte128(-1866772562);
				if (1 != (i_71_ & 0x1)) {
					int[] is = null;
					if (2 == (i_71_ & 0x2)) {
						is = new int[i_68_];
						for (int i_72_ = 0; i_72_ < i_68_; i_72_++) {
							is[i_72_] = buffer.readBigSmart();
						}
					}
					short[] is_73_ = null;
					if ((i_71_ & 0x4) == 4) {
						is_73_ = new short[i_69_];
						for (int i_74_ = 0; i_74_ < i_69_; i_74_++) {
							is_73_[i_74_] = (short) buffer.readUnsignedShort();
						}
					}
					short[] is_75_ = null;
					if ((i_71_ & 0x8) == 8) {
						is_75_ = new short[i_70_];
						for (int i_76_ = 0; i_76_ < i_70_; i_76_++) {
							is_75_[i_76_] = (short) buffer.readShortLE128(602501853);
						}
					}
					long l = (npcIndex | (long) ((npc.anInt10576 += -1761803989) * -476072573 - 1) << 32);
					new Class417(l, is, is_73_, is_75_);
				}
			}
			if ((flags & 0x10000) != 0) {
				npc.anInt10582 = buffer.readUnsignedShort128() * -383285097;
				if (-1394313433 * npc.anInt10582 == 65535) {
					npc.anInt10582 = 466211499 * (npc.aClass409_10580.anInt4879);
				}
			}
			if ((flags & 0x400000) != 0) {
				npc.aClass153_10579.method2607((byte) -33);
				int i_77_ = ((buffer.buffer[((buffer.index += -1115476867) * -1990677291) - 1]) & 0xff);
				for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
					int i_79_ = buffer.readUnsignedShort();
					int i_80_ = buffer.readIntV1();
					npc.aClass153_10579.method2614(i_79_, i_80_, (short) 768);
				}
			}
			if (0 != (flags & 0x4)) {
				npc.anInt10578 = buffer.readShortLE128(602501853) * 119874337;
				npc.anInt10577 = (buffer.readShortLE((byte) -32) * -1084745433);
			}
			if ((flags & 0x20000) != 0) {
				npc.aByte10371 = buffer.read128Byte((short) 2463);
				npc.aByte10327 = buffer.readByte((short) -14611);
				npc.aByte10364 = buffer.readByte((short) -22344);
				npc.aByte10352 = (byte) buffer.readUnsigned128Byte();
				npc.anInt10347 = ((client.cycles * -1809259861 + buffer.readShortLE((byte) -97)) * -245378127);
				npc.anInt10348 = ((-1809259861 * client.cycles + buffer.readUnsignedShort()) * 485671023);
			}
			if (0 != (flags & 0x800000)) {
				npc.aString10584 = buffer.readString(724047844);
				if ("".equals(npc.aString10584) || (npc.aString10584.equals(npc.aClass409_10580.aString4857))) {
					npc.aString10584 = (npc.aClass409_10580.aString4857);
				}
			}
			if ((flags & 0x2) != 0) {
				npc.method16164(buffer.readString(1804278403), 0, 0, (byte) -84);
			}
			if ((flags & 0x4000) != 0) {
				int i_81_ = buffer.readUnsigned128Byte();
				int[] is = new int[i_81_];
				int[] is_82_ = new int[i_81_];
				for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
					int i_84_ = buffer.readShortLE128(602501853);
					if (49152 == (i_84_ & 0xc000)) {
						int i_85_ = buffer.readUnsignedShort();
						is[i_83_] = i_84_ << 16 | i_85_;
					} else {
						is[i_83_] = i_84_;
					}
					is_82_[i_83_] = buffer.readShortLE128(602501853);
				}
				npc.method15797(is, is_82_, -1858199952);
			}
			if ((flags & 0x20) != 0) {
				int i_86_ = buffer.readUnsignedShort();
				int i_87_ = buffer.readIntV2(-1710167524);
				if (65535 == i_86_) {
					i_86_ = -1;
				}
				int i_88_ = buffer.readUnsignedByteC(-1949571815);
				int i_89_ = i_88_ & 0x7;
				int i_90_ = i_88_ >> 3 & 0xf;
				if (15 == i_90_) {
					i_90_ = -1;
				}
				boolean bool = 1 == (i_88_ >> 7 & 0x1);
				npc.sendGraphics(i_86_, i_87_, i_89_, i_90_, bool, 0, 1997289787);
			}
		}
	}

	static boolean method539(int i, int i_91_) {
		return 57 == i || i == 58 || i == 1007 || i == 25 || 30 == i;
	}
}
