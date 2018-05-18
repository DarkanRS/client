
/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Class179 {
	static int anInt2220;
	static int anInt2221;
	static int anInt2222;
	static int anInt2223;
	static final String aString2224 = "\\/.:, _-+[]~@";
	static String aString2225;
	static int anInt2226;
	static int anInt2227 = 0;
	static final String aString2228 = "Failure";
	static boolean aBool2229;
	static int anInt2230;
	static int anInt2231;
	static long aLong2232;
	static final String aString2233 = "Success";
	static final int anInt2234 = 350;

	static void method2981(String[] strings) {
		if (strings.length > 1) {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].startsWith("pause")) {
					int i_0_ = 5;
					try {
						i_0_ = Integer.parseInt(strings[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class209.method3598(new StringBuilder().append("Pausing for ").append(i_0_).append(" seconds...").toString(), -1466859962);
					Class276.aStringArray3345 = strings;
					anInt2231 = -479843653 * (1 + i);
					aLong2232 = (Class169.method2869(1793720451) + (long) (i_0_ * 1000)) * 5591849346017053157L;
					break;
				}
				aString2225 = strings[i];
				Class165.method2853(false, -550919802);
			}
		} else {
			aString2225 = new StringBuilder().append(aString2225).append(strings[0]).toString();
			anInt2220 += strings[0].length() * -1996461669;
		}
	}

	static {
		anInt2223 = 0;
		aString2225 = "";
		anInt2226 = 0;
		anInt2220 = 0;
		anInt2221 = 0;
		aBool2229 = false;
		anInt2231 = 479843653;
	}

	static boolean method2982() {
		if (Class504.method8388(client.anInt7166 * -1741204137, (byte) 79))
			return false;
		return true;
	}

	static boolean method2983() {
		if (Class504.method8388(client.anInt7166 * -1741204137, (byte) 120))
			return false;
		return true;
	}

	static void method2984() {
		if (Class298.method5303((byte) -50)) {
			if (Class13.aStringArray129 == null)
				FontRenderer.method402(1211602372);
			aBool2229 = true;
			anInt2221 = 0;
		}
	}

	static void method2985() {
		if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
			try {
				Class282_Sub50_Sub3.aFileOutputStream9481.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class282_Sub50_Sub3.aFileOutputStream9481 = null;
	}

	static void method2986() {
		if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
			try {
				Class282_Sub50_Sub3.aFileOutputStream9481.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class282_Sub50_Sub3.aFileOutputStream9481 = null;
	}

	static void method2987() {
		anInt2230 = -2050700174 + (Class288.aClass414_3438.anInt4978 * 1838611167 + -810427415 * Class288.aClass414_3438.anInt4979);
		anInt2222 = 681447330 + (2090076551 * Class16.aClass414_139.anInt4978 + Class16.aClass414_139.anInt4979 * 74486273);
		Class13.aStringArray129 = new String[500];
		for (int i = 0; i < Class13.aStringArray129.length; i++)
			Class13.aStringArray129[i] = "";
		Class209.method3598(Class433.aClass433_5232.method7273(Class223.aClass495_2772, -623888526), -1301842653);
	}

	static void method2988(GraphicalRenderer class505) {
		class505.r(0, 0, Class349.anInt4083 * -418109423, 350);
		class505.B(0, 0, -418109423 * Class349.anInt4083, 350, anInt2221 * 1790640201 << 24 | 0x332277, 1);
		int i = 350 / (-2030522063 * anInt2222);
		if (anInt2227 * -1647152403 > 0) {
			int i_1_ = 346 - anInt2222 * -2030522063 - 4;
			int i_2_ = i * i_1_ / (-1647152403 * anInt2227 + i - 1);
			int i_3_ = 4;
			if (-1647152403 * anInt2227 > 1)
				i_3_ += ((i_1_ - i_2_) * (-1647152403 * anInt2227 - 1 - -2132918525 * anInt2223) / (-1647152403 * anInt2227 - 1));
			class505.B(Class349.anInt4083 * -418109423 - 16, i_3_, 12, i_2_, 1790640201 * anInt2221 << 24 | 0x332277, 2);
			for (int i_4_ = anInt2223 * -2132918525; (i_4_ < -2132918525 * anInt2223 + i && i_4_ < -1647152403 * anInt2227); i_4_++) {
				String[] strings = Class456_Sub3.method12681(Class13.aStringArray129[i_4_], '\010', 229848533);
				int i_5_ = ((Class349.anInt4083 * -418109423 - 8 - 16) / strings.length);
				for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
					int i_7_ = 8 + i_6_ * i_5_;
					class505.r(i_7_, 0, i_5_ + i_7_ - 8, 350);
					Class16.aClass8_144.renderText(Class400.method6793(strings[i_6_], (byte) 1), i_7_, (350 - anInt2230 * 1922934793 - 2 - Class16.aClass414_139.anInt4979 * -1518951631 - ((i_4_ - -2132918525 * anInt2223) * (anInt2222 * -2030522063))), -1, -16777216, -418109423);
				}
			}
		}
		Class540.aClass8_7138.method359("727 1", -418109423 * Class349.anInt4083 - 25, 330, -1, -16777216, 1878721557);
		class505.r(0, 0, Class349.anInt4083 * -418109423, 350);
		class505.method8659(0, 350 - 1922934793 * anInt2230, -418109423 * Class349.anInt4083, -1, -1880781903);
		Class285.aClass8_3394.renderText(new StringBuilder().append("--> ").append(Class400.method6793(aString2225, (byte) 1)).toString(), 10, 350 - -1518951631 * Class288.aClass414_3438.anInt4979 - 1, -1, -16777216, -418109423);
		if (Class530.aBool7050) {
			int i_8_ = -1;
			if (client.cycles * -1809259861 % 30 > 15)
				i_8_ = 16777215;
			class505.method8428(10 + (Class288.aClass414_3438.method6946(new StringBuilder().append("--> ").append(Class400.method6793(aString2225, (byte) 1).substring(0, -530721645 * anInt2220)).toString(), -1967833701)), 350 - -1518951631 * Class288.aClass414_3438.anInt4979 - 11, 12, i_8_, -1796764807);
		}
		class505.L();
		Class18.method574((short) -6236);
	}

	static void method2989() {
		aBool2229 = false;
		IncomingPacket.method6378(-1538407760);
	}

	static String method2990(String string) {
		String string_9_ = null;
		int i = string.indexOf("--> ");
		if (i >= 0) {
			string_9_ = string.substring(0, 4 + i);
			string = string.substring(4 + i);
		}
		if (string.startsWith("directlogin ")) {
			int i_10_ = string.indexOf(" ", "directlogin ".length());
			if (i_10_ >= 0) {
				int i_11_ = string.length();
				string = new StringBuilder().append(string.substring(0, i_10_)).append(" ").toString();
				for (int i_12_ = i_10_ + 1; i_12_ < i_11_; i_12_++)
					string = new StringBuilder().append(string).append("*").toString();
			}
		}
		if (null != string_9_)
			return new StringBuilder().append(string_9_).append(string).toString();
		return string;
	}

	static String method2991(String string) {
		String string_13_ = null;
		int i = string.indexOf("--> ");
		if (i >= 0) {
			string_13_ = string.substring(0, 4 + i);
			string = string.substring(4 + i);
		}
		if (string.startsWith("directlogin ")) {
			int i_14_ = string.indexOf(" ", "directlogin ".length());
			if (i_14_ >= 0) {
				int i_15_ = string.length();
				string = new StringBuilder().append(string.substring(0, i_14_)).append(" ").toString();
				for (int i_16_ = i_14_ + 1; i_16_ < i_15_; i_16_++)
					string = new StringBuilder().append(string).append("*").toString();
			}
		}
		if (null != string_13_)
			return new StringBuilder().append(string_13_).append(string).toString();
		return string;
	}

	public static void method2992(String string, boolean bool, boolean bool_17_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class209.method3598("commands - This command", -1446014129);
					Class209.method3598("cls - Clear console", -1269106766);
					Class209.method3598("displayfps - Toggle FPS and other information", -1663964760);
					Class209.method3598("renderer - Print graphics renderer information", -902627449);
					Class209.method3598("heap - Print java memory information", -1724838097);
					Class209.method3598("getcamerapos - Print location and direction of camera for use in bug reports", -233237535);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt2227 = 0;
					anInt2223 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool7176 = !client.aBool7176;
					if (client.aBool7176)
						Class209.method3598("FPS on", -517662884);
					else
						Class209.method3598("FPS off", -1881441255);
				} else if (string.equals("renderer")) {
					Class168 class168 = Class316.aClass505_3680.method8392();
					Class209.method3598(new StringBuilder().append("Toolkit ID: ").append(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(198120991)).toString(), -1246943399);
					Class209.method3598(new StringBuilder().append("Vendor: ").append(class168.anInt2052 * 1681700525).toString(), -1516104469);
					Class209.method3598(new StringBuilder().append("Name: ").append(class168.aString2051).toString(), -118163522);
					Class209.method3598(new StringBuilder().append("Version: ").append(292421485 * class168.anInt2045).toString(), -2110060612);
					Class209.method3598(new StringBuilder().append("Device: ").append(class168.aString2053).toString(), -636825331);
					Class209.method3598(new StringBuilder().append("Driver Version: ").append(-3062896818026551219L * class168.aLong2049).toString(), -1592558341);
				} else if (string.equals("heap"))
					Class209.method3598(new StringBuilder().append("Heap: ").append(-1346844585 * Class263.anInt3273).append("MB").toString(), -1095706712);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class219 class219 = client.aClass257_7353.method4519(914377736);
					Class209.method3598(new StringBuilder().append("Pos: ").append(Class84.myPlayer.aByte7967).append(",").append(((Class31.anInt361 * -360258135 >> 9) + 1948093437 * class219.anInt2711) >> 6).append(",").append((-1002240017 * class219.anInt2712 + (413271601 * Class246.anInt3029 >> 9)) >> 6).append(",").append(((Class31.anInt361 * -360258135 >> 9) + class219.anInt2711 * 1948093437) & 0x3f).append(",")
							.append((class219.anInt2712 * -1002240017 + (Class246.anInt3029 * 413271601 >> 9)) & 0x3f).append(" Height: ").append((Class504.method8389(Class31.anInt361 * -360258135, 413271601 * Class246.anInt3029, (Class84.myPlayer.aByte7967), (byte) 126)) - Class109_Sub1.anInt9384 * 1929945579).toString(), -1834471946);
					Class209.method3598(new StringBuilder().append("Look: ").append(Class84.myPlayer.aByte7967).append(",").append((721567303 * Class96_Sub13.anInt9368 + class219.anInt2711 * 1948093437) >> 6).append(",").append((Class369.anInt4280 * 469662201 + class219.anInt2712 * -1002240017) >> 6).append(",").append((class219.anInt2711 * 1948093437 + Class96_Sub13.anInt9368 * 721567303) & 0x3f).append(",")
							.append((class219.anInt2712 * -1002240017 + 469662201 * Class369.anInt4280) & 0x3f).append(" Height: ").append((Class504.method8389(Class96_Sub13.anInt9368 * 721567303, 469662201 * Class369.anInt4280, (Class84.myPlayer.aByte7967), (byte) 42)) - 654473753 * Class121.anInt1527).toString(), -112329762);
				}
			} catch (Exception exception) {
				Class209.method3598((Class433.aClass433_5159.method7273(Class223.aClass495_2772, -515552037)), -1127364284);
			}
			return;
		} while (false);
		if (Class496.aClass496_5813 != Class90.aClass496_952 || -644057819 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class440.method7373(1, -1, -1, false, (byte) 101);
					if (Class158.method2730((short) -15236) == 1)
						Class209.method3598("Success", -1769647739);
					else
						Class209.method3598("Failure", -1743708421);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class440.method7373(2, -1, -1, false, (byte) 117);
					if (Class158.method2730((short) -2686) == 2)
						Class209.method3598("Success", -1440877972);
					else
						Class209.method3598("Failure", -545385990);
					return;
				}
				if (Class475.aBool5623 && string.equalsIgnoreCase("wm3")) {
					Class440.method7373(3, 1024, 768, false, (byte) 24);
					if (Class158.method2730((short) -3022) == 3)
						Class209.method3598("Success", -1533207013);
					else
						Class209.method3598("Failure", -1865992255);
					return;
				}
				if (string.startsWith("setlobby ")) {
					int i = -1;
					Object object = null;
					string = string.substring(9);
					int i_18_ = string.indexOf(' ');
					if (-1 == i_18_)
						Class209.method3598("Failure", -1129907620);
					else {
						try {
							i = Integer.parseInt(string.substring(0, i_18_));
						} catch (NumberFormatException numberformatexception) {
							/* empty */
						}
						if (-1 == i)
							Class209.method3598("Failure", -1244373328);
						else {
							String string_19_ = new StringBuilder().append(string.substring(1 + i_18_).trim()).append(".runescape.com").toString();
							Class496.method8314(string_19_, i, -1220116925);
							Class209.method3598("Success", -666769501);
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class538.method11500(0, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-712544236) == 0) {
						Class209.method3598("Success", -254093577);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 0, 901491518);
						Class190.method3148((byte) 60);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -56493456);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class538.method11500(1, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1515164834) == 1) {
						Class209.method3598("Success", -614830995);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 1, -557179726);
						Class190.method3148((byte) 104);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -580145838);
					return;
				}
				if (string.equalsIgnoreCase("tk2")) {
					Class538.method11500(2, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1195851299) == 2) {
						Class209.method3598("Success", -1794796487);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 2, 1538009429);
						Class190.method3148((byte) 44);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -1593749661);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class538.method11500(3, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1592646455) == 3) {
						Class209.method3598("Success", -1972178478);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 3, -1556722677);
						Class190.method3148((byte) 96);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -1367422447);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class538.method11500(5, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(485463767) == 5) {
						Class209.method3598("Success", -170690067);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 5, 986814799);
						Class190.method3148((byte) 122);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -204457045);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (client.anInt7166 * -1741204137 == 13)
						Class151.method2592((byte) 104);
					else if (18 == -1741204137 * client.anInt7166)
						client.aClass184_7475.aBool2298 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class184[] class184s = client.aClass184Array7220;
					for (int i = 0; i < class184s.length; i++) {
						Class184 class184 = class184s[i];
						if (class184.method3053((byte) -39) != null)
							class184.method3053((byte) -116).method3320((byte) 102);
					}
					Class119.aClass312_1462.method5543((byte) -62);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class209.method3598(new StringBuilder().append("varpbit=").append(Class158_Sub1.aClass3_8507.method241(i, -1398895291)).toString(), -194693030);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class209.method3598(new StringBuilder().append("varp=").append(Class158_Sub1.aClass3_8507.method240(i, 1393003401)).toString(), -670677614);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class456_Sub3.method12681(string.substring(12), ' ', 229848533);
					if (2 == strings.length)
						Class2.method257(strings[0], strings[1], 1942118537);
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class456_Sub3.method12681(string.substring(8), ' ', 229848533);
					int i = Integer.parseInt(strings[0]);
					Class282_Sub1.method11614(i, 143389073);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class169.method2869(1713571718)).append(".log").toString());
						if (file.exists()) {
							Class209.method3598("file already exists!", -57329557);
							return;
						}
					}
					if (Class282_Sub50_Sub3.aFileOutputStream9481 != null) {
						Class282_Sub50_Sub3.aFileOutputStream9481.close();
						Class282_Sub50_Sub3.aFileOutputStream9481 = null;
					}
					try {
						Class282_Sub50_Sub3.aFileOutputStream9481 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class209.method3598(new StringBuilder().append("Could not create ").append(file.getName()).toString(), -1319963999);
					} catch (SecurityException securityexception) {
						Class209.method3598(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), -205187998);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (Class282_Sub50_Sub3.aFileOutputStream9481 != null)
						Class282_Sub50_Sub3.aFileOutputStream9481.close();
					Class282_Sub50_Sub3.aFileOutputStream9481 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class209.method3598("No such file", -130100069);
						return;
					}
					byte[] is = Class153.method2621(file, -590820179);
					if (null == is) {
						Class209.method3598("Failed to read file", -1777764632);
						return;
					}
					String[] strings = (Class456_Sub3.method12681((Class122.method2110(Class282_Sub17_Sub7.method15439(is, -1385519940), '\r', "", -601284203)), '\n', 229848533));
					Class341.method6074(strings, 1624396687);
				}
				if (-1741204137 * client.anInt7166 == 13) {
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4612, (client.aClass184_7475.aClass432_2283), 649205617);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 3);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool ? 1 : 0);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool_17_ ? 1 : 0);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
					client.aClass184_7475.method3049(class282_sub23, 881777984);
				}
			} catch (Exception exception) {
				Class209.method3598((Class433.aClass433_5159.method7273(Class223.aClass495_2772, -1488316549)), -146676373);
				return;
			}
		}
		if (client.anInt7166 * -1741204137 != 13)
			Class209.method3598(new StringBuilder().append(Class433.aClass433_5160.method7273(Class223.aClass495_2772, -666903111)).append(string).toString(), -1454199893);
	}

	static boolean method2993() {
		return aBool2229;
	}

	static void method2994() {
		anInt2230 = -2050700174 + (Class288.aClass414_3438.anInt4978 * 1838611167 + -810427415 * Class288.aClass414_3438.anInt4979);
		anInt2222 = 681447330 + (2090076551 * Class16.aClass414_139.anInt4978 + Class16.aClass414_139.anInt4979 * 74486273);
		Class13.aStringArray129 = new String[500];
		for (int i = 0; i < Class13.aStringArray129.length; i++)
			Class13.aStringArray129[i] = "";
		Class209.method3598(Class433.aClass433_5232.method7273(Class223.aClass495_2772, -1882291735), -941312141);
	}

	static void method2995() {
		aBool2229 = false;
		IncomingPacket.method6378(-1538407760);
	}

	static void method2996() {
		/* empty */
	}

	static void method2997() {
		if (anInt2221 * 1790640201 < 102)
			anInt2221 += 345353174;
		if (anInt2231 * -1374254477 != -1 && (aLong2232 * -8784386644529951763L < Class169.method2869(1664241633))) {
			for (int i = anInt2231 * -1374254477; i < Class276.aStringArray3345.length; i++) {
				if (Class276.aStringArray3345[i].startsWith("pause")) {
					int i_20_ = 5;
					try {
						i_20_ = Integer.parseInt(Class276.aStringArray3345[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class209.method3598(new StringBuilder().append("Pausing for ").append(i_20_).append(" seconds...").toString(), -910106822);
					anInt2231 = -479843653 * (1 + i);
					aLong2232 = (Class169.method2869(1624458411) + (long) (i_20_ * 1000)) * 5591849346017053157L;
					return;
				}
				aString2225 = Class276.aStringArray3345[i];
				Class165.method2853(false, -132330885);
			}
			anInt2231 = 479843653;
		}
		if (0 != 1789395551 * client.anInt7191) {
			anInt2223 -= 1388403785 * client.anInt7191;
			if (-2132918525 * anInt2223 >= -1647152403 * anInt2227)
				anInt2223 = anInt2227 * -1033721009 - -758144085;
			if (anInt2223 * -2132918525 < 0)
				anInt2223 = 0;
			client.anInt7191 = 0;
		}
		for (int i = 0; i < client.anInt7193 * -1911445195; i++) {
			Interface16 interface16 = client.anInterface16Array7154[i];
			int i_21_ = interface16.method92(317240429);
			char c = interface16.method118(-1233497366);
			int i_22_ = interface16.method125(607264098);
			if (84 == i_21_)
				Class165.method2853(false, -1882474160);
			if (80 == i_21_)
				Class165.method2853(true, -314593657);
			else if (66 == i_21_ && (i_22_ & 0x4) != 0) {
				if (Class182.aClipboard2263 != null) {
					String string = "";
					for (int i_23_ = Class13.aStringArray129.length - 1; i_23_ >= 0; i_23_--) {
						if (null != Class13.aStringArray129[i_23_] && Class13.aStringArray129[i_23_].length() > 0)
							string = new StringBuilder().append(string).append(Class13.aStringArray129[i_23_]).append('\n').toString();
					}
					Class182.aClipboard2263.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_21_ && (i_22_ & 0x4) != 0) {
				if (null != Class182.aClipboard2263) {
					try {
						Transferable transferable = Class182.aClipboard2263.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
								Class341.method6074(strings, 1476110499);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_21_ == 85 && anInt2220 * -530721645 > 0) {
				aString2225 = new StringBuilder().append(aString2225.substring(0, anInt2220 * -530721645 - 1)).append(aString2225.substring(-530721645 * anInt2220)).toString();
				anInt2220 -= -1996461669;
			} else if (i_21_ == 101 && -530721645 * anInt2220 < aString2225.length())
				aString2225 = new StringBuilder().append(aString2225.substring(0, -530721645 * anInt2220)).append(aString2225.substring(1 + anInt2220 * -530721645)).toString();
			else if (96 == i_21_ && anInt2220 * -530721645 > 0)
				anInt2220 -= -1996461669;
			else if (i_21_ == 97 && anInt2220 * -530721645 < aString2225.length())
				anInt2220 += -1996461669;
			else if (i_21_ == 102)
				anInt2220 = 0;
			else if (103 == i_21_)
				anInt2220 = aString2225.length() * -1996461669;
			else if (i_21_ == 104 && (anInt2226 * -2115839039 < Class13.aStringArray129.length)) {
				anInt2226 += -1115474879;
				Class534.method11441((byte) -86);
				anInt2220 = aString2225.length() * -1996461669;
			} else if (i_21_ == 105 && -2115839039 * anInt2226 > 0) {
				anInt2226 -= -1115474879;
				Class534.method11441((byte) -42);
				anInt2220 = aString2225.length() * -1996461669;
			} else if (Class380.method6450(c, 382053319) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString2225 = new StringBuilder().append(aString2225.substring(0, anInt2220 * -530721645)).append(client.anInterface16Array7154[i].method118(-2085997727)).append(aString2225.substring(-530721645 * anInt2220)).toString();
				anInt2220 += -1996461669;
			}
		}
		client.anInt7193 = 0;
		client.anInt7196 = 0;
		IncomingPacket.method6378(-1538407760);
	}

	static void method2998() {
		if (anInt2221 * 1790640201 < 102)
			anInt2221 += 345353174;
		if (anInt2231 * -1374254477 != -1 && (aLong2232 * -8784386644529951763L < Class169.method2869(1569504309))) {
			for (int i = anInt2231 * -1374254477; i < Class276.aStringArray3345.length; i++) {
				if (Class276.aStringArray3345[i].startsWith("pause")) {
					int i_24_ = 5;
					try {
						i_24_ = Integer.parseInt(Class276.aStringArray3345[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class209.method3598(new StringBuilder().append("Pausing for ").append(i_24_).append(" seconds...").toString(), -1599674424);
					anInt2231 = -479843653 * (1 + i);
					aLong2232 = (Class169.method2869(2056289154) + (long) (i_24_ * 1000)) * 5591849346017053157L;
					return;
				}
				aString2225 = Class276.aStringArray3345[i];
				Class165.method2853(false, -1031466716);
			}
			anInt2231 = 479843653;
		}
		if (0 != 1789395551 * client.anInt7191) {
			anInt2223 -= 1388403785 * client.anInt7191;
			if (-2132918525 * anInt2223 >= -1647152403 * anInt2227)
				anInt2223 = anInt2227 * -1033721009 - -758144085;
			if (anInt2223 * -2132918525 < 0)
				anInt2223 = 0;
			client.anInt7191 = 0;
		}
		for (int i = 0; i < client.anInt7193 * -1911445195; i++) {
			Interface16 interface16 = client.anInterface16Array7154[i];
			int i_25_ = interface16.method92(317240429);
			char c = interface16.method118(-1893780838);
			int i_26_ = interface16.method125(177108017);
			if (84 == i_25_)
				Class165.method2853(false, -1833999248);
			if (80 == i_25_)
				Class165.method2853(true, -7284544);
			else if (66 == i_25_ && (i_26_ & 0x4) != 0) {
				if (Class182.aClipboard2263 != null) {
					String string = "";
					for (int i_27_ = Class13.aStringArray129.length - 1; i_27_ >= 0; i_27_--) {
						if (null != Class13.aStringArray129[i_27_] && Class13.aStringArray129[i_27_].length() > 0)
							string = new StringBuilder().append(string).append(Class13.aStringArray129[i_27_]).append('\n').toString();
					}
					Class182.aClipboard2263.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_25_ && (i_26_ & 0x4) != 0) {
				if (null != Class182.aClipboard2263) {
					try {
						Transferable transferable = Class182.aClipboard2263.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
								Class341.method6074(strings, 1945281889);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_25_ == 85 && anInt2220 * -530721645 > 0) {
				aString2225 = new StringBuilder().append(aString2225.substring(0, anInt2220 * -530721645 - 1)).append(aString2225.substring(-530721645 * anInt2220)).toString();
				anInt2220 -= -1996461669;
			} else if (i_25_ == 101 && -530721645 * anInt2220 < aString2225.length())
				aString2225 = new StringBuilder().append(aString2225.substring(0, -530721645 * anInt2220)).append(aString2225.substring(1 + anInt2220 * -530721645)).toString();
			else if (96 == i_25_ && anInt2220 * -530721645 > 0)
				anInt2220 -= -1996461669;
			else if (i_25_ == 97 && anInt2220 * -530721645 < aString2225.length())
				anInt2220 += -1996461669;
			else if (i_25_ == 102)
				anInt2220 = 0;
			else if (103 == i_25_)
				anInt2220 = aString2225.length() * -1996461669;
			else if (i_25_ == 104 && (anInt2226 * -2115839039 < Class13.aStringArray129.length)) {
				anInt2226 += -1115474879;
				Class534.method11441((byte) -43);
				anInt2220 = aString2225.length() * -1996461669;
			} else if (i_25_ == 105 && -2115839039 * anInt2226 > 0) {
				anInt2226 -= -1115474879;
				Class534.method11441((byte) -6);
				anInt2220 = aString2225.length() * -1996461669;
			} else if (Class380.method6450(c, 1316645337) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString2225 = new StringBuilder().append(aString2225.substring(0, anInt2220 * -530721645)).append(client.anInterface16Array7154[i].method118(-285318589)).append(aString2225.substring(-530721645 * anInt2220)).toString();
				anInt2220 += -1996461669;
			}
		}
		client.anInt7193 = 0;
		client.anInt7196 = 0;
		IncomingPacket.method6378(-1538407760);
	}

	static void method2999() {
		if (-2115839039 * anInt2226 > 0) {
			int i = 0;
			for (int i_28_ = 0; i_28_ < Class13.aStringArray129.length; i_28_++) {
				if (Class13.aStringArray129[i_28_].indexOf("--> ") != -1 && ++i == anInt2226 * -2115839039) {
					aString2225 = (Class13.aStringArray129[i_28_].substring(Class13.aStringArray129[i_28_].indexOf('>') + 2));
					break;
				}
			}
		} else
			aString2225 = "";
	}

	Class179() throws Throwable {
		throw new Error();
	}

	static void method3000(boolean bool) {
		if (aString2225.length() != 0) {
			Class209.method3598(new StringBuilder().append("--> ").append(aString2225).toString(), -81151076);
			Class251.method4313(aString2225, false, bool, -354697449);
			anInt2226 = 0;
			if (!bool) {
				anInt2220 = 0;
				aString2225 = "";
			}
		}
	}

	static void method3001(boolean bool) {
		if (aString2225.length() != 0) {
			Class209.method3598(new StringBuilder().append("--> ").append(aString2225).toString(), -929787912);
			Class251.method4313(aString2225, false, bool, -354697449);
			anInt2226 = 0;
			if (!bool) {
				anInt2220 = 0;
				aString2225 = "";
			}
		}
	}

	public static void method3002(String string) {
		if (Class13.aStringArray129 == null)
			FontRenderer.method402(2044756849);
		client.aCalendar7278.setTime(new Date(Class169.method2869(1760274968)));
		int i = client.aCalendar7278.get(11);
		int i_29_ = client.aCalendar7278.get(12);
		int i_30_ = client.aCalendar7278.get(13);
		String string_31_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_29_ / 10).append(i_29_ % 10).append(":").append(i_30_ / 10).append(i_30_ % 10).toString();
		String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
		for (int i_32_ = 0; i_32_ < strings.length; i_32_++) {
			for (int i_33_ = -1647152403 * anInt2227; i_33_ > 0; i_33_--)
				Class13.aStringArray129[i_33_] = Class13.aStringArray129[i_33_ - 1];
			Class13.aStringArray129[0] = new StringBuilder().append(string_31_).append(": ").append(strings[i_32_]).toString();
			if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
				try {
					Class282_Sub50_Sub3.aFileOutputStream9481.write(Class473.method7885(new StringBuilder().append(Class13.aStringArray129[0]).append("\n").toString(), (byte) -94));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (-1647152403 * anInt2227 < Class13.aStringArray129.length - 1) {
				anInt2227 += 895204069;
				if (-2132918525 * anInt2223 > 0)
					anInt2223 += -758144085;
			}
		}
	}

	public static void method3003(String string) {
		if (Class13.aStringArray129 == null)
			FontRenderer.method402(477681610);
		client.aCalendar7278.setTime(new Date(Class169.method2869(2050452450)));
		int i = client.aCalendar7278.get(11);
		int i_34_ = client.aCalendar7278.get(12);
		int i_35_ = client.aCalendar7278.get(13);
		String string_36_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_34_ / 10).append(i_34_ % 10).append(":").append(i_35_ / 10).append(i_35_ % 10).toString();
		String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
		for (int i_37_ = 0; i_37_ < strings.length; i_37_++) {
			for (int i_38_ = -1647152403 * anInt2227; i_38_ > 0; i_38_--)
				Class13.aStringArray129[i_38_] = Class13.aStringArray129[i_38_ - 1];
			Class13.aStringArray129[0] = new StringBuilder().append(string_36_).append(": ").append(strings[i_37_]).toString();
			if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
				try {
					Class282_Sub50_Sub3.aFileOutputStream9481.write(Class473.method7885(new StringBuilder().append(Class13.aStringArray129[0]).append("\n").toString(), (byte) -117));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (-1647152403 * anInt2227 < Class13.aStringArray129.length - 1) {
				anInt2227 += 895204069;
				if (-2132918525 * anInt2223 > 0)
					anInt2223 += -758144085;
			}
		}
	}

	public static void method3004(String string) {
		if (Class13.aStringArray129 == null)
			FontRenderer.method402(1458657713);
		client.aCalendar7278.setTime(new Date(Class169.method2869(1675447905)));
		int i = client.aCalendar7278.get(11);
		int i_39_ = client.aCalendar7278.get(12);
		int i_40_ = client.aCalendar7278.get(13);
		String string_41_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_39_ / 10).append(i_39_ % 10).append(":").append(i_40_ / 10).append(i_40_ % 10).toString();
		String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
		for (int i_42_ = 0; i_42_ < strings.length; i_42_++) {
			for (int i_43_ = -1647152403 * anInt2227; i_43_ > 0; i_43_--)
				Class13.aStringArray129[i_43_] = Class13.aStringArray129[i_43_ - 1];
			Class13.aStringArray129[0] = new StringBuilder().append(string_41_).append(": ").append(strings[i_42_]).toString();
			if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
				try {
					Class282_Sub50_Sub3.aFileOutputStream9481.write(Class473.method7885(new StringBuilder().append(Class13.aStringArray129[0]).append("\n").toString(), (byte) -102));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (-1647152403 * anInt2227 < Class13.aStringArray129.length - 1) {
				anInt2227 += 895204069;
				if (-2132918525 * anInt2223 > 0)
					anInt2223 += -758144085;
			}
		}
	}

	static void method3005(GraphicalRenderer class505) {
		class505.r(0, 0, Class349.anInt4083 * -418109423, 350);
		class505.B(0, 0, -418109423 * Class349.anInt4083, 350, anInt2221 * 1790640201 << 24 | 0x332277, 1);
		int i = 350 / (-2030522063 * anInt2222);
		if (anInt2227 * -1647152403 > 0) {
			int i_44_ = 346 - anInt2222 * -2030522063 - 4;
			int i_45_ = i * i_44_ / (-1647152403 * anInt2227 + i - 1);
			int i_46_ = 4;
			if (-1647152403 * anInt2227 > 1)
				i_46_ += ((i_44_ - i_45_) * (-1647152403 * anInt2227 - 1 - -2132918525 * anInt2223) / (-1647152403 * anInt2227 - 1));
			class505.B(Class349.anInt4083 * -418109423 - 16, i_46_, 12, i_45_, 1790640201 * anInt2221 << 24 | 0x332277, 2);
			for (int i_47_ = anInt2223 * -2132918525; (i_47_ < -2132918525 * anInt2223 + i && i_47_ < -1647152403 * anInt2227); i_47_++) {
				String[] strings = Class456_Sub3.method12681(Class13.aStringArray129[i_47_], '\010', 229848533);
				int i_48_ = ((Class349.anInt4083 * -418109423 - 8 - 16) / strings.length);
				for (int i_49_ = 0; i_49_ < strings.length; i_49_++) {
					int i_50_ = 8 + i_49_ * i_48_;
					class505.r(i_50_, 0, i_48_ + i_50_ - 8, 350);
					Class16.aClass8_144.renderText(Class400.method6793(strings[i_49_], (byte) 1), i_50_, (350 - anInt2230 * 1922934793 - 2 - Class16.aClass414_139.anInt4979 * -1518951631 - ((i_47_ - -2132918525 * anInt2223) * (anInt2222 * -2030522063))), -1, -16777216, -418109423);
				}
			}
		}
		Class540.aClass8_7138.method359("727 1", -418109423 * Class349.anInt4083 - 25, 330, -1, -16777216, 1878721557);
		class505.r(0, 0, Class349.anInt4083 * -418109423, 350);
		class505.method8659(0, 350 - 1922934793 * anInt2230, -418109423 * Class349.anInt4083, -1, -1171281345);
		Class285.aClass8_3394.renderText(new StringBuilder().append("--> ").append(Class400.method6793(aString2225, (byte) 1)).toString(), 10, 350 - -1518951631 * Class288.aClass414_3438.anInt4979 - 1, -1, -16777216, -418109423);
		if (Class530.aBool7050) {
			int i_51_ = -1;
			if (client.cycles * -1809259861 % 30 > 15)
				i_51_ = 16777215;
			class505.method8428(10 + (Class288.aClass414_3438.method6946(new StringBuilder().append("--> ").append(Class400.method6793(aString2225, (byte) 1).substring(0, -530721645 * anInt2220)).toString(), -1967833701)), 350 - -1518951631 * Class288.aClass414_3438.anInt4979 - 11, 12, i_51_, -1796764807);
		}
		class505.L();
		Class18.method574((short) 87);
	}

	static void method3006() {
		if (null != Class282_Sub50_Sub3.aFileOutputStream9481) {
			try {
				Class282_Sub50_Sub3.aFileOutputStream9481.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class282_Sub50_Sub3.aFileOutputStream9481 = null;
	}

	static void method3007(String[] strings) {
		if (strings.length > 1) {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].startsWith("pause")) {
					int i_52_ = 5;
					try {
						i_52_ = Integer.parseInt(strings[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class209.method3598(new StringBuilder().append("Pausing for ").append(i_52_).append(" seconds...").toString(), -730192579);
					Class276.aStringArray3345 = strings;
					anInt2231 = -479843653 * (1 + i);
					aLong2232 = (Class169.method2869(1584639641) + (long) (i_52_ * 1000)) * 5591849346017053157L;
					break;
				}
				aString2225 = strings[i];
				Class165.method2853(false, -1260150839);
			}
		} else {
			aString2225 = new StringBuilder().append(aString2225).append(strings[0]).toString();
			anInt2220 += strings[0].length() * -1996461669;
		}
	}

	public static void method3008(String string, boolean bool, boolean bool_53_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class209.method3598("commands - This command", -1969219968);
					Class209.method3598("cls - Clear console", -2091199331);
					Class209.method3598("displayfps - Toggle FPS and other information", -1181591967);
					Class209.method3598("renderer - Print graphics renderer information", -1071117703);
					Class209.method3598("heap - Print java memory information", -532617420);
					Class209.method3598("getcamerapos - Print location and direction of camera for use in bug reports", -278182247);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt2227 = 0;
					anInt2223 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool7176 = !client.aBool7176;
					if (client.aBool7176)
						Class209.method3598("FPS on", -1376034537);
					else
						Class209.method3598("FPS off", -1419627016);
				} else if (string.equals("renderer")) {
					Class168 class168 = Class316.aClass505_3680.method8392();
					Class209.method3598(new StringBuilder().append("Toolkit ID: ").append(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1794510046)).toString(), -1620087203);
					Class209.method3598(new StringBuilder().append("Vendor: ").append(class168.anInt2052 * 1681700525).toString(), -817073850);
					Class209.method3598(new StringBuilder().append("Name: ").append(class168.aString2051).toString(), -127362715);
					Class209.method3598(new StringBuilder().append("Version: ").append(292421485 * class168.anInt2045).toString(), -97948400);
					Class209.method3598(new StringBuilder().append("Device: ").append(class168.aString2053).toString(), -702148994);
					Class209.method3598(new StringBuilder().append("Driver Version: ").append(-3062896818026551219L * class168.aLong2049).toString(), -718025824);
				} else if (string.equals("heap"))
					Class209.method3598(new StringBuilder().append("Heap: ").append(-1346844585 * Class263.anInt3273).append("MB").toString(), -663049816);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class219 class219 = client.aClass257_7353.method4519(1419754749);
					Class209.method3598(new StringBuilder().append("Pos: ").append(Class84.myPlayer.aByte7967).append(",").append(((Class31.anInt361 * -360258135 >> 9) + 1948093437 * class219.anInt2711) >> 6).append(",").append((-1002240017 * class219.anInt2712 + (413271601 * Class246.anInt3029 >> 9)) >> 6).append(",").append(((Class31.anInt361 * -360258135 >> 9) + class219.anInt2711 * 1948093437) & 0x3f).append(",")
							.append((class219.anInt2712 * -1002240017 + (Class246.anInt3029 * 413271601 >> 9)) & 0x3f).append(" Height: ").append((Class504.method8389(Class31.anInt361 * -360258135, 413271601 * Class246.anInt3029, (Class84.myPlayer.aByte7967), (byte) 51)) - Class109_Sub1.anInt9384 * 1929945579).toString(), -434108193);
					Class209.method3598(new StringBuilder().append("Look: ").append(Class84.myPlayer.aByte7967).append(",").append((721567303 * Class96_Sub13.anInt9368 + class219.anInt2711 * 1948093437) >> 6).append(",").append((Class369.anInt4280 * 469662201 + class219.anInt2712 * -1002240017) >> 6).append(",").append((class219.anInt2711 * 1948093437 + Class96_Sub13.anInt9368 * 721567303) & 0x3f).append(",")
							.append((class219.anInt2712 * -1002240017 + 469662201 * Class369.anInt4280) & 0x3f).append(" Height: ").append((Class504.method8389(Class96_Sub13.anInt9368 * 721567303, 469662201 * Class369.anInt4280, (Class84.myPlayer.aByte7967), (byte) 25)) - 654473753 * Class121.anInt1527).toString(), -773547759);
				}
			} catch (Exception exception) {
				Class209.method3598((Class433.aClass433_5159.method7273(Class223.aClass495_2772, -1590942601)), -291693412);
			}
			return;
		} while (false);
		if (Class496.aClass496_5813 != Class90.aClass496_952 || -644057819 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class440.method7373(1, -1, -1, false, (byte) 89);
					if (Class158.method2730((short) -7892) == 1)
						Class209.method3598("Success", -537361833);
					else
						Class209.method3598("Failure", -690646848);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class440.method7373(2, -1, -1, false, (byte) 93);
					if (Class158.method2730((short) -4868) == 2)
						Class209.method3598("Success", -1057863830);
					else
						Class209.method3598("Failure", -761452010);
					return;
				}
				if (Class475.aBool5623 && string.equalsIgnoreCase("wm3")) {
					Class440.method7373(3, 1024, 768, false, (byte) 80);
					if (Class158.method2730((short) -8941) == 3)
						Class209.method3598("Success", -462102936);
					else
						Class209.method3598("Failure", -1249259631);
					return;
				}
				if (string.startsWith("setlobby ")) {
					int i = -1;
					Object object = null;
					string = string.substring(9);
					int i_54_ = string.indexOf(' ');
					if (-1 == i_54_)
						Class209.method3598("Failure", -253021123);
					else {
						try {
							i = Integer.parseInt(string.substring(0, i_54_));
						} catch (NumberFormatException numberformatexception) {
							/* empty */
						}
						if (-1 == i)
							Class209.method3598("Failure", -588638733);
						else {
							String string_55_ = new StringBuilder().append(string.substring(1 + i_54_).trim()).append(".runescape.com").toString();
							Class496.method8314(string_55_, i, -1521115493);
							Class209.method3598("Success", -1589029727);
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class538.method11500(0, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-989249516) == 0) {
						Class209.method3598("Success", -1784884436);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 0, -1305478253);
						Class190.method3148((byte) 104);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -458921923);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class538.method11500(1, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-2067204553) == 1) {
						Class209.method3598("Success", -1004962805);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 1, 1367658664);
						Class190.method3148((byte) 116);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -142954783);
					return;
				}
				if (string.equalsIgnoreCase("tk2")) {
					Class538.method11500(2, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-2029929858) == 2) {
						Class209.method3598("Success", -1122947356);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 2, -581731898);
						Class190.method3148((byte) 57);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -1202448840);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class538.method11500(3, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(836596060) == 3) {
						Class209.method3598("Success", -1213432875);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 3, 1572395233);
						Class190.method3148((byte) 61);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -2134829624);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class538.method11500(5, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1616770863) == 5) {
						Class209.method3598("Success", -144743968);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 5, -370882863);
						Class190.method3148((byte) 63);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -1067871553);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (client.anInt7166 * -1741204137 == 13)
						Class151.method2592((byte) 47);
					else if (18 == -1741204137 * client.anInt7166)
						client.aClass184_7475.aBool2298 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class184[] class184s = client.aClass184Array7220;
					for (int i = 0; i < class184s.length; i++) {
						Class184 class184 = class184s[i];
						if (class184.method3053((byte) -69) != null)
							class184.method3053((byte) -73).method3320((byte) 127);
					}
					Class119.aClass312_1462.method5543((byte) 24);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class209.method3598(new StringBuilder().append("varpbit=").append(Class158_Sub1.aClass3_8507.method241(i, -2063004772)).toString(), -333059146);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class209.method3598(new StringBuilder().append("varp=").append(Class158_Sub1.aClass3_8507.method240(i, 161214692)).toString(), -1991380723);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class456_Sub3.method12681(string.substring(12), ' ', 229848533);
					if (2 == strings.length)
						Class2.method257(strings[0], strings[1], 1942118537);
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class456_Sub3.method12681(string.substring(8), ' ', 229848533);
					int i = Integer.parseInt(strings[0]);
					Class282_Sub1.method11614(i, 143389073);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class169.method2869(1862167469)).append(".log").toString());
						if (file.exists()) {
							Class209.method3598("file already exists!", -2064628919);
							return;
						}
					}
					if (Class282_Sub50_Sub3.aFileOutputStream9481 != null) {
						Class282_Sub50_Sub3.aFileOutputStream9481.close();
						Class282_Sub50_Sub3.aFileOutputStream9481 = null;
					}
					try {
						Class282_Sub50_Sub3.aFileOutputStream9481 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class209.method3598(new StringBuilder().append("Could not create ").append(file.getName()).toString(), -1108968707);
					} catch (SecurityException securityexception) {
						Class209.method3598(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), -1468905328);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (Class282_Sub50_Sub3.aFileOutputStream9481 != null)
						Class282_Sub50_Sub3.aFileOutputStream9481.close();
					Class282_Sub50_Sub3.aFileOutputStream9481 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class209.method3598("No such file", -177544854);
						return;
					}
					byte[] is = Class153.method2621(file, 1788899636);
					if (null == is) {
						Class209.method3598("Failed to read file", -413065813);
						return;
					}
					String[] strings = (Class456_Sub3.method12681((Class122.method2110(Class282_Sub17_Sub7.method15439(is, -779237537), '\r', "", -601284203)), '\n', 229848533));
					Class341.method6074(strings, 1082942774);
				}
				if (-1741204137 * client.anInt7166 == 13) {
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4612, (client.aClass184_7475.aClass432_2283), 256372392);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 3);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool ? 1 : 0);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool_53_ ? 1 : 0);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
					client.aClass184_7475.method3049(class282_sub23, 1616485384);
				}
			} catch (Exception exception) {
				Class209.method3598((Class433.aClass433_5159.method7273(Class223.aClass495_2772, -1600472953)), -1470495365);
				return;
			}
		}
		if (client.anInt7166 * -1741204137 != 13)
			Class209.method3598(new StringBuilder().append(Class433.aClass433_5160.method7273(Class223.aClass495_2772, -1962372403)).append(string).toString(), -1059605262);
	}

	static void method3009() {
		/* empty */
	}

	static void method3010() {
		/* empty */
	}

	static void method3011() {
		/* empty */
	}

	public static void method3012(String string) {
		aString2225 = string;
		anInt2220 = aString2225.length() * -1996461669;
	}

	static void method3013() {
		/* empty */
	}

	static void method3014() {
		if (Class298.method5303((byte) -12)) {
			if (Class13.aStringArray129 == null)
				FontRenderer.method402(875830550);
			aBool2229 = true;
			anInt2221 = 0;
		}
	}

	static boolean method3015() {
		return aBool2229;
	}

	static void method3016() {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(1319010794) == 1)
			Class6.aClass340_45.method6049(new Class335((Class256.aClass256_3152), null), 301123709);
		else {
			client.aClass257_7353.method4547((byte) -45);
			Class58.method1139(-1673014383);
		}
	}

	static final void method3017(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class241.method4150(-536353301);
	}

	public static String method3018(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_56_ = l; l_56_ != 0L; l_56_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_57_ = l;
			l /= 37L;
			char c = Class500.aCharArray5825[(int) (l_57_ - 37L * l)];
			if ('_' == c) {
				int i_58_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_58_, Character.toUpperCase(stringbuilder.charAt(i_58_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	public static int method3019(int i, short i_59_) {
		i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
		i = (i >>> 2 & 0x33333333) + (i & 0x33333333);
		i = (i >>> 4) + i & 0xf0f0f0f;
		i += i >>> 8;
		i += i >>> 16;
		return i & 0xff;
	}

	static final void method3020(CS2Executor class527, int i) {
		int i_60_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_60_, (byte) 40);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_60_ >> 16];
		Class249.method4276(class118, class98, class527, -724687188);
	}

	static final void method3021(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((CS2Executor) class527).aClass282_Sub4_7011.aByte7504;
	}
}
