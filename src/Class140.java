/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class140 implements Runnable {
	volatile boolean aBoolean1549;
	Class142[] aClass142Array1550;
	Thread aThread1551;

	Class140() {
		/* empty */
	}

	Class142 method1552(int i, int i_0_) {
		try {
			if (((Class140) this).aClass142Array1550 == null || i < 0 || i >= ((Class140) this).aClass142Array1550.length)
				return null;
			return ((Class140) this).aClass142Array1550[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.a(").append(')').toString());
		}
	}

	boolean method1553(int i) {
		try {
			if (((Class140) this).aBoolean1549)
				return true;
			if (null == ((Class140) this).aThread1551) {
				((Class140) this).aThread1551 = new Thread(this);
				((Class140) this).aThread1551.start();
			}
			return ((Class140) this).aBoolean1549;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.f(").append(')').toString());
		}
	}

	public void run() {
		try {
			try {
				int i = (Class401.aClass401_6557 == Class242.aClass401_2708 ? 80 : (1606920449 * Class474.aClass471_5976.worldId + 7000));
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class474.aClass471_5976.address).append(":").append(i).append("/news.ws?game=").append(-937307905 * (client.aClass411_8944.gameType)).toString()).openStream()))));
				String string = bufferedreader.readLine();
				ArrayList arraylist = new ArrayList();
				for (/**/; string != null; string = bufferedreader.readLine())
					arraylist.add(string);
				String[] strings = new String[arraylist.size()];
				arraylist.toArray(strings);
				if (0 != strings.length % 3)
					return;
				((Class140) this).aClass142Array1550 = new Class142[strings.length / 3];
				for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
					((Class140) this).aClass142Array1550[i_1_ / 3] = new Class142(strings[i_1_], strings[i_1_ + 1], strings[2 + i_1_]);
			} catch (IOException ioexception) {
				/* empty */
			}
			((Class140) this).aBoolean1549 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.run(").append(')').toString());
		}
	}

	public static Class190 method1554(int i, int i_2_) {
		try {
			Class190 class190 = (Class190) Class190.aClass348_1929.method4184((long) i);
			if (class190 != null)
				return class190;
			byte[] is = Class287.aClass243_3100.method2315(1, i, (byte) -28);
			class190 = new Class190();
			class190.anInt1930 = i * -1112552131;
			if (null != is)
				class190.method1853(new RsByteBuffer(is), 1143811540);
			class190.method1855(-1168443566);
			if (2 == class190.anInt1940 * -1955592777 && Class190.aClass437_1928.get((long) i) == null) {
				Class190.aClass437_1928.method5817(new Class298_Sub35(Class190.anInt1932 * 1105746915), (long) i);
				Class190.aClass190Array1926[(Class190.anInt1932 += -34356789) * 1105746915 - 1] = class190;
			}
			Class190.aClass348_1929.method4194(class190, (long) i);
			return class190;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.f(").append(')').toString());
		}
	}

	static void method1555(NPC class365_sub1_sub1_sub2_sub1, boolean bool, byte i) {
		try {
			if (Class436.anInt5506 * -278777595 < 410) {
				SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
				String string = class365_sub1_sub1_sub2_sub1.aString10186;
				if (null != class503.anIntArray6188) {
					class503 = class503.method6240(Class128.aClass148_6331, 1662486316);
					if (null == class503)
						return;
					string = class503.aString6127;
				}
				if (class503.aBoolean6163) {
					if (1817570317 * class365_sub1_sub1_sub2_sub1.anInt10189 != 0) {
						String string_3_ = (client.aClass411_8944 == Class411.aClass411_5316 ? (Tradution.aClass470_5928.method6049(Class321.aClass429_3357, -875414210)) : (Tradution.aClass470_5911.method6049(Class321.aClass429_3357, -875414210)));
						string = new StringBuilder().append(string).append(Class18.method358(1817570317 * (class365_sub1_sub1_sub2_sub1.anInt10189), (Class287.myPlayer.anInt10206) * 696798311, (byte) 4)).append(Class26.aString349).append(string_3_).append(1817570317 * class365_sub1_sub1_sub2_sub1.anInt10189).append(Class26.aString352).toString();
					}
					if (client.aBoolean8835 && !bool) {
						Class497 class497 = (831522399 * Class132.anInt1508 != -1 ? (Class92.aClass504_905.method6251(831522399 * Class132.anInt1508, 1875400558)) : null);
						if ((Linkable.anInt3192 * -112110875 & 0x2) != 0 && (null == class497 || (class503.method6239((Class132.anInt1508 * 831522399), (-388931549 * class497.anInt6100), (byte) 47) != class497.anInt6100 * -388931549)))
							Class234.method2174(client.aString8838, new StringBuilder().append(client.aString8754).append(" ").append(Class26.aString351).append(" ").append(Class285.method2709(16776960, -2021390481)).append(string).toString(), 697885143 * Class240.anInt2704, 8, -1, (long) (1888274983 * (class365_sub1_sub1_sub2_sub1.anInt10064)), 0, 0, true, false, (long) (1888274983 * (class365_sub1_sub1_sub2_sub1.anInt10064)), false, -1507413924);
					}
					if (!bool) {
						String[] strings = class503.aStringArray6142;
						if (client.aBoolean8922)
							strings = Class519.method6319(strings, -1228297238);
						if (null != strings) {
							for (int i_4_ = strings.length - 1; i_4_ >= 0; i_4_--) {
								if (strings[i_4_] != null && (0 == class503.aByte6158 || (!(strings[i_4_].equalsIgnoreCase(Tradution.aClass470_5906.method6049(Class321.aClass429_3357, -875414210))) && !(strings[i_4_].equalsIgnoreCase(Tradution.aClass470_5905.method6049(Class321.aClass429_3357, -875414210)))))) {
									int i_5_ = 0;
									int i_6_ = 1395924385 * client.anInt8690;
									if (i_4_ == 0)
										i_5_ = 9;
									if (i_4_ == 1)
										i_5_ = 10;
									if (i_4_ == 2)
										i_5_ = 11;
									if (3 == i_4_)
										i_5_ = 12;
									if (i_4_ == 4)
										i_5_ = 13;
									if (i_4_ == 5)
										i_5_ = 1003;
									if (class503.anInt6145 * 1095931419 == i_4_)
										i_6_ = class503.anInt6128 * 846965703;
									if (i_4_ == class503.anInt6146 * -598113659)
										i_6_ = class503.anInt6144 * -899602593;
									Class234.method2174(strings[i_4_], new StringBuilder().append(Class285.method2709(16776960, -1768803512)).append(string).toString(), ((strings[i_4_].equalsIgnoreCase(Tradution.aClass470_5906.method6049(Class321.aClass429_3357, -875414210))) ? class503.anInt6147 * 1183282735 : i_6_), i_5_, -1, (long) ((class365_sub1_sub1_sub2_sub1.anInt10064) * 1888274983), 0, 0, true, false, (long) ((class365_sub1_sub1_sub2_sub1.anInt10064) * 1888274983), false, -1881687525);
								}
							}
							if (class503.aByte6158 == 1) {
								for (int i_7_ = 0; i_7_ < strings.length; i_7_++) {
									if (strings[i_7_] != null && ((strings[i_7_].equalsIgnoreCase(Tradution.aClass470_5906.method6049(Class321.aClass429_3357, -875414210))) || (strings[i_7_].equalsIgnoreCase(Tradution.aClass470_5905.method6049(Class321.aClass429_3357, -875414210))))) {
										short i_8_ = 0;
										if ((1817570317 * (class365_sub1_sub1_sub2_sub1.anInt10189)) > (Class287.myPlayer.anInt10206) * 696798311)
											i_8_ = (short) 2000;
										short i_9_ = 0;
										int i_10_ = 1395924385 * client.anInt8690;
										if (0 == i_7_)
											i_9_ = (short) 9;
										if (1 == i_7_)
											i_9_ = (short) 10;
										if (2 == i_7_)
											i_9_ = (short) 11;
										if (3 == i_7_)
											i_9_ = (short) 12;
										if (i_7_ == 4)
											i_9_ = (short) 13;
										if (5 == i_7_)
											i_9_ = (short) 1003;
										if (0 != i_9_)
											i_9_ += i_8_;
										if (i_7_ == class503.anInt6145 * 1095931419)
											i_10_ = (class503.anInt6128 * 846965703);
										if (-598113659 * class503.anInt6146 == i_7_)
											i_10_ = (-899602593 * class503.anInt6144);
										Class234.method2174(strings[i_7_], new StringBuilder().append(Class285.method2709(16776960, -1391055346)).append(string).toString(), ((strings[i_7_].equalsIgnoreCase(Tradution.aClass470_5906.method6049(Class321.aClass429_3357, -875414210))) ? class503.anInt6147 * 1183282735 : i_10_), i_9_, -1, (long) ((class365_sub1_sub1_sub2_sub1.anInt10064) * 1888274983), 0, 0, true, false, (long) (1888274983 * (class365_sub1_sub1_sub2_sub1.anInt10064)), false,
												-1360691095);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.bw(").append(')').toString());
		}
	}

	static final void method1556(ClientScript2 class403, int i) {
		try {
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_11_ < 0 || i_11_ > 1)
				i_11_ = 0;
			Class365_Sub1_Sub5_Sub1.method4525(i_11_ == 1, -1375344490);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.ail(").append(')').toString());
		}
	}

	public static byte[] method1557(String string, byte i) {
		try {
			int i_12_ = string.length();
			if (0 == i_12_)
				return new byte[0];
			int i_13_ = 3 + i_12_ & ~0x3;
			int i_14_ = i_13_ / 4 * 3;
			if (i_13_ - 2 >= i_12_ || (ClanMember.method1773(string.charAt(i_13_ - 2), 1186467127) == -1))
				i_14_ -= 2;
			else if (i_13_ - 1 >= i_12_ || ClanMember.method1773(string.charAt(i_13_ - 1), 1292628022) == -1)
				i_14_--;
			byte[] is = new byte[i_14_];
			Class228.method2121(string, is, 0, (byte) -114);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.b(").append(')').toString());
		}
	}

	public static IComponentDefinition method1558(int i, int i_15_, int i_16_) {
		try {
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i, (byte) -11);
			if (-1 == i_15_)
				return class105;
			if (class105 == null || class105.aClass105Array1292 == null || i_15_ >= class105.aClass105Array1292.length)
				return null;
			return class105.aClass105Array1292[i_15_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.p(").append(')').toString());
		}
	}

	static final boolean method1559(Class433 class433, int i, int i_17_, byte i_18_) {
		try {
			ObjectDefinitions class432 = class433.getObjectDefinitions(i);
			if (11 == i_17_)
				i_17_ = 10;
			if (i_17_ >= 5 && i_17_ <= 8)
				i_17_ = 4;
			return class432.method5771(i_17_, (byte) 91);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.ct(").append(')').toString());
		}
	}

	public static void method1560(int i, int i_19_) {
		try {
			if (i != -1 && !Class441.aBooleanArray5590[i]) {
				Class270.aClass243_2894.method2297(i, -692047844);
				Class389.aClass119Array4165[i] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fr.d(").append(')').toString());
		}
	}
}
