/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class419 {
	static char[] aCharArray5340 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	static int anInt5341;

	Class419() throws Throwable {
		throw new Error();
	}

	public static void method5602(int[] is, Object[] objects, int i, int i_0_, int i_1_) {
		try {
			if (i < i_0_) {
				int i_2_ = (i_0_ + i) / 2;
				int i_3_ = i;
				int i_4_ = is[i_2_];
				is[i_2_] = is[i_0_];
				is[i_0_] = i_4_;
				Object object = objects[i_2_];
				objects[i_2_] = objects[i_0_];
				objects[i_0_] = object;
				int i_5_ = 2147483647 == i_4_ ? 0 : 1;
				for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
					if (is[i_6_] < (i_6_ & i_5_) + i_4_) {
						int i_7_ = is[i_6_];
						is[i_6_] = is[i_3_];
						is[i_3_] = i_7_;
						Object object_8_ = objects[i_6_];
						objects[i_6_] = objects[i_3_];
						objects[i_3_++] = object_8_;
					}
				}
				is[i_0_] = is[i_3_];
				is[i_3_] = i_4_;
				objects[i_0_] = objects[i_3_];
				objects[i_3_] = object;
				method5602(is, objects, i, i_3_ - 1, -641027314);
				method5602(is, objects, i_3_ + 1, i_0_, -641027314);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rj.x(").append(')').toString());
		}
	}

	static boolean method5603(IComponentDefinition class105, int i) {
		try {
			IComponentSettings class298_sub38 = client.method2801(class105);
			if (class298_sub38.method3493((byte) 1) > 0)
				return true;
			if (class298_sub38.method3496(-1320707999))
				return true;
			if (null != class105.aClass105_1233)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rj.lo(").append(')').toString());
		}
	}

	static final void method5604(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class165.recorder.method3878(1767596149) ? 1 : 0;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class165.recorder.method3887(1474356836) ? 1 : 0;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class165.recorder.method3880((byte) -46) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rj.vg(").append(')').toString());
		}
	}

	public static void method5605(String string, boolean bool, boolean bool_9_, int i) {
		try {
			do {
				try {
					if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
						Class255.method2435("commands - This command", 186560885);
						Class255.method2435("cls - Clear console", 1228482885);
						Class255.method2435("displayfps - Toggle FPS and other information", 553669962);
						Class255.method2435("renderer - Print graphics renderer information", 757390347);
						Class255.method2435("heap - Print java memory information", 1394924823);
						Class255.method2435("getcamerapos - Print location and direction of camera for use in bug reports", 1131153902);
					} else if (string.equalsIgnoreCase("cls")) {
						Class8.anInt102 = 0;
						Class8.anInt103 = 0;
					} else if (string.equalsIgnoreCase("displayfps")) {
						client.aBoolean8667 = !client.aBoolean8667;
						if (client.aBoolean8667)
							Class255.method2435("FPS on", 899052076);
						else
							Class255.method2435("FPS off", 1184714257);
					} else if (string.equals("renderer")) {
						Class58 class58 = Class373.aClass_ra4071.method4987();
						Class255.method2435(new StringBuilder().append("Toolkit ID: ").append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-481266690)).toString(), 1038434697);
						Class255.method2435(new StringBuilder().append("Vendor: ").append(class58.anInt574 * 267107087).toString(), 212944002);
						Class255.method2435(new StringBuilder().append("Name: ").append(class58.aString582).toString(), 723527437);
						Class255.method2435(new StringBuilder().append("Version: ").append(class58.anInt581 * 1959468245).toString(), 1382813939);
						Class255.method2435(new StringBuilder().append("Device: ").append(class58.aString577).toString(), 536857078);
						Class255.method2435(new StringBuilder().append("Driver Version: ").append(class58.aLong583 * 703334160035735425L).toString(), 1218429557);
					} else if (string.equals("heap"))
						Class255.method2435(new StringBuilder().append("Heap: ").append(Class291.maximumMemory * 1126040225).append("MB").toString(), 170718628);
					else {
						if (!string.equalsIgnoreCase("getcamerapos"))
							break;
						Class341 class341 = client.aClass283_8716.method2628(681479919);
						Class255.method2435(
								new StringBuilder().append("Pos: ").append(Class287.myPlayer.plane).append(",").append(((-1740717447 * Class367.anInt4000 >> 9) + class341.gameSceneBaseX * -1760580017) >> 6).append(",").append(((Class146.anInt1575 * -299812095 >> 9) + 283514611 * class341.gameSceneBaseY) >> 6).append(",").append((-1760580017 * class341.gameSceneBaseX + (-1740717447 * Class367.anInt4000 >> 9)) & 0x3f).append(",")
										.append((class341.gameSceneBaseY * 283514611 + (-299812095 * Class146.anInt1575 >> 9)) & 0x3f).append(" Height: ").append((Class356.method4271(Class367.anInt4000 * -1740717447, Class146.anInt1575 * -299812095, (Class287.myPlayer.plane), -1453034846)) - Class110.anInt6403 * 1449634147).toString(), 306448697);
						Class255.method2435(
								new StringBuilder().append("Look: ").append(Class287.myPlayer.plane).append(",").append((-1125224763 * Class_xa.anInt6292 + class341.gameSceneBaseX * -1760580017) >> 6).append(",").append((283514611 * class341.gameSceneBaseY + Class464.anInt5959 * -1758389953) >> 6).append(",").append((class341.gameSceneBaseX * -1760580017 + -1125224763 * Class_xa.anInt6292) & 0x3f).append(",")
										.append((283514611 * class341.gameSceneBaseY + -1758389953 * Class464.anInt5959) & 0x3f).append(" Height: ").append((Class356.method4271(Class_xa.anInt6292 * -1125224763, -1758389953 * Class464.anInt5959, (Class287.myPlayer.plane), -860898067)) - 771695069 * Class18.anInt255).toString(), 1171744016);
					}
				} catch (Exception exception) {
					Class255.method2435(Tradution.aClass470_5782.method6049(Class321.aClass429_3357, -875414210), 247216384);
				}
				return;
			} while (false);
			if (Class242.aClass401_2708 != Class401.aClass401_6557 || 1806357379 * client.playerRights >= 2) {
				try {
					if (string.equalsIgnoreCase("wm1")) {
						Class357.method4276(1, -1, -1, false, 1791719030);
						if (Class190.method1859((byte) -15) == 1)
							Class255.method2435("Success", 1472876448);
						else
							Class255.method2435("Failure", 1016209121);
						return;
					}
					if (string.equalsIgnoreCase("wm2")) {
						Class357.method4276(2, -1, -1, false, -674111799);
						if (Class190.method1859((byte) -79) == 2)
							Class255.method2435("Success", 1308535348);
						else
							Class255.method2435("Failure", 863221927);
						return;
					}
					if (Class452.aBoolean5642 && string.equalsIgnoreCase("wm3")) {
						Class357.method4276(3, 1024, 768, false, 1894568246);
						if (Class190.method1859((byte) -25) == 3)
							Class255.method2435("Success", 2072006321);
						else
							Class255.method2435("Failure", 1988552564);
						return;
					}
					if (string.equalsIgnoreCase("tk0")) {
						Class370.method4578(0, false, 622850291);
						if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1547826526) == 0) {
							Class255.method2435("Success", 267543271);
							Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 0, -458723189);
							Class3.method300(656179282);
							client.aBoolean8666 = false;
						} else
							Class255.method2435("Failure", 268000194);
						return;
					}
					if (string.equalsIgnoreCase("tk1")) {
						Class370.method4578(1, false, 622850291);
						if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-957568446) == 1) {
							Class255.method2435("Success", 1271200712);
							Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 1, -72348841);
							Class3.method300(656179282);
							client.aBoolean8666 = false;
						} else
							Class255.method2435("Failure", 1851865795);
						return;
					}
					if (string.equalsIgnoreCase("tk2")) {
						Class370.method4578(2, false, 622850291);
						if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-565622932) == 2) {
							Class255.method2435("Success", 1728166997);
							Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 2, 345084383);
							Class3.method300(656179282);
							client.aBoolean8666 = false;
						} else
							Class255.method2435("Failure", 807691994);
						return;
					}
					if (string.equalsIgnoreCase("tk3")) {
						Class370.method4578(3, false, 622850291);
						if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1899485997) == 3) {
							Class255.method2435("Success", 2073339182);
							Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 3, 1121469356);
							Class3.method300(656179282);
							client.aBoolean8666 = false;
						} else
							Class255.method2435("Failure", 1035326643);
						return;
					}
					if (string.equalsIgnoreCase("tk5")) {
						Class370.method4578(5, false, 622850291);
						if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-996545824) == 5) {
							Class255.method2435("Success", 892097548);
							Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 5, -1087457820);
							Class3.method300(656179282);
							client.aBoolean8666 = false;
						} else
							Class255.method2435("Failure", 1743942992);
						return;
					}
					if (string.equalsIgnoreCase("clientdrop")) {
						if (0 == client.anInt8752 * -1233866115)
							SubIncommingPacket.method1923(554378996);
						else if (17 == -1233866115 * client.anInt8752)
							client.gameConnection.aBoolean347 = true;
						return;
					}
					if (string.equalsIgnoreCase("breakcon")) {
						BufferedConnectionContext[] class25s = client.connectionContexts;
						for (int i_10_ = 0; i_10_ < class25s.length; i_10_++) {
							BufferedConnectionContext class25 = class25s[i_10_];
							if (class25.method387(537308016) != null)
								class25.method387(537308016).method3867((byte) 100);
						}
						Class248.aClass247_2752.method2353((short) 2067);
						return;
					}
					if (string.startsWith("getclientvarpbit")) {
						int i_11_ = Integer.parseInt(string.substring(17));
						Class255.method2435(new StringBuilder().append("varpbit=").append(Class128.aClass148_6331.method250(i_11_, (byte) 49)).toString(), 812809440);
						return;
					}
					if (string.startsWith("getclientvarp")) {
						int i_12_ = Integer.parseInt(string.substring(14));
						Class255.method2435(new StringBuilder().append("varp=").append(Class128.aClass148_6331.method252(i_12_, (byte) 25)).toString(), 1156644577);
						return;
					}
					if (string.startsWith("directlogin")) {
						String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(string.substring(12), ' ', 1545850593));
						if (2 == strings.length)
							Class63.method741(strings[0], strings[1], 2101690439);
						return;
					}
					if (string.startsWith("snlogin ")) {
						String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(string.substring(8), ' ', 259158417));
						int i_13_ = Integer.parseInt(strings[0]);
						Class124.method1385(i_13_, (byte) -22);
						return;
					}
					if (string.startsWith("setoutput ")) {
						File file = new File(string.substring(10));
						if (file.exists()) {
							file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class122.method1319((byte) 1)).append(".log").toString());
							if (file.exists()) {
								Class255.method2435("file already exists!", 1609687254);
								return;
							}
						}
						if (null != Class78.aFileOutputStream731) {
							Class78.aFileOutputStream731.close();
							Class78.aFileOutputStream731 = null;
						}
						try {
							Class78.aFileOutputStream731 = new FileOutputStream(file);
						} catch (FileNotFoundException filenotfoundexception) {
							Class255.method2435(new StringBuilder().append("Could not create ").append(file.getName()).toString(), 2057720306);
						} catch (SecurityException securityexception) {
							Class255.method2435(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), 651886745);
						}
						return;
					}
					if (string.equals("closeoutput")) {
						if (Class78.aFileOutputStream731 != null)
							Class78.aFileOutputStream731.close();
						Class78.aFileOutputStream731 = null;
						return;
					}
					if (string.startsWith("runscript ")) {
						File file = new File(string.substring(10));
						if (!file.exists()) {
							Class255.method2435("No such file", 1833830484);
							return;
						}
						byte[] is = Class362.method4311(file, -1944658057);
						if (null == is) {
							Class255.method2435("Failed to read file", 1208919662);
							return;
						}
						String[] strings = (Class365_Sub1_Sub3_Sub1.method4508((Class123.method1378(Class146.method1598(is, 1704231187), '\r', "", (short) 316)), '\n', 714918179));
						Class55.method606(strings, 408166320);
					}
					if (client.anInt8752 * -1233866115 == 0) {
						Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.COMMANDS_PACKET, (client.gameConnection.aClass449_330), (byte) 6);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(string.length() + 3);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(bool ? 1 : 0);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(bool_9_ ? 1 : 0);
						class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2127017558);
						client.gameConnection.method390(class298_sub36, (byte) -55);
					}
				} catch (Exception exception) {
					Class255.method2435(Tradution.aClass470_5782.method6049(Class321.aClass429_3357, -875414210), 417864665);
					return;
				}
			}
			if (client.anInt8752 * -1233866115 != 0)
				Class255.method2435(new StringBuilder().append(Tradution.aClass470_5805.method6049(Class321.aClass429_3357, -875414210)).append(string).toString(), 276776266);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rj.t(").append(')').toString());
		}
	}
}
