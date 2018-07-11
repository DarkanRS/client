
/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.imageio.ImageIO;

public final class Class251 {
	static int exitY;
	static int[][] directions = new int[128][128];
	static int exitX;
	static int[] bufferY;
	static int[] bufferX;
	static int[][] distances = new int[128][128];
	static Class194 aClass194_3103;

	static {
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	Class251() throws Throwable {
		throw new Error();
	}

	static final void method4310(CS2Executor class527, int i) {
		boolean bool = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) != 0);
		if (Class84.myPlayer.playerAppearance != null)
			Class84.myPlayer.playerAppearance.method4003(bool, -794449734);
	}

	static final void method4311(CS2Executor class527, int i) {
		int i_172_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_172_, (byte) 118);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_172_ >> 16];
		Class455.method7555(class118, class98, class527, (byte) -54);
	}

	static final void method4312(CS2Executor class527, byte i) {
		if (client.rights * -644057819 >= 2)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -644057819 * client.rights;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void handleCommand(String string, boolean bool, boolean bool_173_, int i) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class209.method3598("commands - This command", -1128292172);
					Class209.method3598("cls - Clear console", -1305824571);
					Class209.method3598("displayfps - Toggle FPS and other information", -1028056987);
					Class209.method3598("renderer - Print graphics renderer information", -895621363);
					Class209.method3598("heap - Print java memory information", -770815394);
					Class209.method3598("getcamerapos - Print location and direction of camera for use in bug reports", -2142075960);
				} else if (string.equalsIgnoreCase("cls")) {
					Class179.anInt2227 = 0;
					Class179.anInt2223 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool7176 = !client.aBool7176;
					if (client.aBool7176)
						Class209.method3598("FPS on", -1478532172);
					else
						Class209.method3598("FPS off", -318501716);
				} else if (string.equals("renderer")) {
					Class168 class168 = Renderers.SOFTWARE_RENDERER.method8392();
					Class209.method3598(new StringBuilder().append("Toolkit ID: ").append(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(174476725)).toString(), -199774023);
					Class209.method3598(new StringBuilder().append("Vendor: ").append(class168.anInt2052 * 1681700525).toString(), -1266717403);
					Class209.method3598(new StringBuilder().append("Name: ").append(class168.aString2051).toString(), -2120239732);
					Class209.method3598(new StringBuilder().append("Version: ").append(292421485 * class168.anInt2045).toString(), -1689852117);
					Class209.method3598(new StringBuilder().append("Device: ").append(class168.aString2053).toString(), -1211113537);
					Class209.method3598(new StringBuilder().append("Driver Version: ").append(-3062896818026551219L * class168.aLong2049).toString(), -598072423);
				} else if (string.equals("heap"))
					Class209.method3598(new StringBuilder().append("Heap: ").append(-1346844585 * Engine.MAX_MEMORY).append("MB").toString(), -845757732);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1275338740);
					Class209.method3598(new StringBuilder().append("Pos: ").append(Class84.myPlayer.plane).append(",").append(((Class31.anInt361 * -360258135 >> 9) + 1948093437 * class219.x) >> 6).append(",").append((-1002240017 * class219.y + (413271601 * Class246.anInt3029 >> 9)) >> 6).append(",").append(((Class31.anInt361 * -360258135 >> 9) + class219.x * 1948093437) & 0x3f).append(",")
							.append((class219.y * -1002240017 + (Class246.anInt3029 * 413271601 >> 9)) & 0x3f).append(" Height: ").append((Class504.method8389(Class31.anInt361 * -360258135, 413271601 * Class246.anInt3029, (Class84.myPlayer.plane), (byte) 22)) - Class109_Sub1.anInt9384 * 1929945579).toString(), -2096324041);
					Class209.method3598(new StringBuilder().append("Look: ").append(Class84.myPlayer.plane).append(",").append((721567303 * Class96_Sub13.anInt9368 + class219.x * 1948093437) >> 6).append(",").append((OutgoingLoginPacket.anInt4280 * 469662201 + class219.y * -1002240017) >> 6).append(",").append((class219.x * 1948093437 + Class96_Sub13.anInt9368 * 721567303) & 0x3f).append(",")
							.append((class219.y * -1002240017 + 469662201 * OutgoingLoginPacket.anInt4280) & 0x3f).append(" Height: ").append((Class504.method8389(Class96_Sub13.anInt9368 * 721567303, 469662201 * OutgoingLoginPacket.anInt4280, (Class84.myPlayer.plane), (byte) 2)) - 654473753 * Class121.anInt1527).toString(), -2049086171);
				}
			} catch (Exception exception) {
				Class209.method3598((Message.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE, -927245115)), -314816204);
			}
			return;
		} while (false);
		if (Class496.aClass496_5813 != Class90.aClass496_952 || -644057819 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class440.method7373(1, -1, -1, false, (byte) 111);
					if (Class158.method2730((short) -2613) == 1)
						Class209.method3598("Success", -1081042103);
					else
						Class209.method3598("Failure", -1679059179);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class440.method7373(2, -1, -1, false, (byte) 71);
					if (Class158.method2730((short) -27549) == 2)
						Class209.method3598("Success", -268796037);
					else
						Class209.method3598("Failure", -693309543);
					return;
				}
				if (Class475.aBool5623 && string.equalsIgnoreCase("wm3")) {
					Class440.method7373(3, 1024, 768, false, (byte) 71);
					if (Class158.method2730((short) -23797) == 3)
						Class209.method3598("Success", -1837857918);
					else
						Class209.method3598("Failure", -223811881);
					return;
				}
				if (string.startsWith("clipmask")) {
					Class209.method3598("["+Class84.myPlayer.localX+", " + Class84.myPlayer.localY + "]:" + (IndexLoaders.MAP_REGION_DECODER.getClipMap((Class84.myPlayer.plane), 1801793645)).map[Class84.myPlayer.localX][Class84.myPlayer.localY], i);
				}
				if (string.startsWith("dumpitems")) {
					for (int itemId = 0; itemId < 24806; itemId++) {
						int[] is = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(itemId, 1).renderToSprite(Class182.HARDWARE_RENDERER, Renderers.SOFTWARE_RENDERER, 1, 1, -13623264, false, 0, Renderers.FONT_RENDERER, Class84.myPlayer.playerAppearance, (short) 1);
						try {
							int w = (int) Math.sqrt((int) is.length) - 1;
							BufferedImage bImg = new BufferedImage(36, 32, BufferedImage.TYPE_INT_ARGB);
							bImg.setRGB(0, 0, w, w, is, 0, w);
							for (int by = 0; by < w; by++) {
								for (int bx = 0; bx < w; bx++) {
									bImg.setRGB(bx, by, is[(by * 36) + bx]);
								}
							}
							File outFile = new File("./items/"+itemId+".png");
							ImageIO.write(bImg, "png", outFile);
						} catch (Exception ee) {
							ee.printStackTrace();
						}
					}
					return;
				}
				if (string.startsWith("setlobby ")) {
					int i_174_ = -1;
					Object object = null;
					string = string.substring(9);
					int i_175_ = string.indexOf(' ');
					if (-1 == i_175_)
						Class209.method3598("Failure", -208040475);
					else {
						try {
							i_174_ = Integer.parseInt(string.substring(0, i_175_));
						} catch (NumberFormatException numberformatexception) {
							/* empty */
						}
						if (-1 == i_174_)
							Class209.method3598("Failure", -1955711283);
						else {
							String string_176_ = new StringBuilder().append(string.substring(1 + i_175_).trim()).append(".runescape.com").toString();
							Class496.method8314(string_176_, i_174_, -1852846838);
							Class209.method3598("Success", -226741800);
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class538.method11500(0, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-491393282) == 0) {
						Class209.method3598("Success", -1340836055);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 0, -1122635532);
						Class190.method3148((byte) 68);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -344734779);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class538.method11500(1, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1821997083) == 1) {
						Class209.method3598("Success", -364086081);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 1, -1690467164);
						Class190.method3148((byte) 47);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -716939990);
					return;
				}
				if (string.equalsIgnoreCase("tk2")) {
					Class538.method11500(2, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(2070272351) == 2) {
						Class209.method3598("Success", -1794668716);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 2, -259704912);
						Class190.method3148((byte) 17);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -822814139);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class538.method11500(3, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(389435618) == 3) {
						Class209.method3598("Success", -832737067);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 3, 1626226442);
						Class190.method3148((byte) 28);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -129081346);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class538.method11500(5, false, (byte) 24);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-889180352) == 5) {
						Class209.method3598("Success", -1022184236);
						Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 5, -1654618197);
						Class190.method3148((byte) 119);
						client.aBool7175 = false;
					} else
						Class209.method3598("Failure", -1885199360);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (client.anInt7166 * -1741204137 == 13)
						Class151.method2592((byte) 34);
					else if (18 == -1741204137 * client.anInt7166)
						client.aClass184_7475.aBool2298 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class184[] class184s = client.aClass184Array7220;
					for (int i_177_ = 0; i_177_ < class184s.length; i_177_++) {
						Class184 class184 = class184s[i_177_];
						if (class184.method3053((byte) -116) != null)
							class184.method3053((byte) -71).method3320((byte) 52);
					}
					Class119.JS5_STANDARD_REQUESTER.method5543((byte) 48);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_178_ = Integer.parseInt(string.substring(17));
					Class209.method3598(new StringBuilder().append("varpbit=").append(Class158_Sub1.aClass3_8507.method241(i_178_, -632025668)).toString(), -1998632005);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_179_ = Integer.parseInt(string.substring(14));
					Class209.method3598(new StringBuilder().append("varp=").append(Class158_Sub1.aClass3_8507.method240(i_179_, 127032296)).toString(), -2108704386);
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
					int i_180_ = Integer.parseInt(strings[0]);
					Class282_Sub1.method11614(i_180_, 143389073);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class169.method2869(1635435907)).append(".log").toString());
						if (file.exists()) {
							Class209.method3598("file already exists!", -2041307357);
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
						Class209.method3598(new StringBuilder().append("Could not create ").append(file.getName()).toString(), -1294344572);
					} catch (SecurityException securityexception) {
						Class209.method3598(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), -425204708);
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
						Class209.method3598("No such file", -445176938);
						return;
					}
					byte[] is = Class153.method2621(file, 1265044571);
					if (null == is) {
						Class209.method3598("Failed to read file", -1589533875);
						return;
					}
					String[] strings = (Class456_Sub3.method12681((Class122.method2110(Class282_Sub17_Sub7.method15439(is, 198480512), '\r', "", -601284203)), '\n', 229848533));
					Class341.method6074(strings, 1579654554);
				}
				if (-1741204137 * client.anInt7166 == 13) {
					TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4612, (client.aClass184_7475.isaac), 704086040);
					class282_sub23.buffer.writeByte(string.length() + 3);
					class282_sub23.buffer.writeByte(bool ? 1 : 0);
					class282_sub23.buffer.writeByte(bool_173_ ? 1 : 0);
					class282_sub23.buffer.writeString(string);
					client.aClass184_7475.method3049(class282_sub23, -273447008);
				}
			} catch (Exception exception) {
				Class209.method3598((Message.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE, -1449846660)), -1151783606);
				return;
			}
		}
		if (client.anInt7166 * -1741204137 != 13)
			Class209.method3598(new StringBuilder().append(Message.UNKNOWN_DEV_COMMAND.translate(Class223.CURRENT_LANGUAGE, -1344246012)).append(string).toString(), -1444759652);
	}

	static void method4314(CS2Executor class527, int i) {
		class527.intStack[class527.intStackPtr * 1942118537 - 2] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[1942118537 * class527.intStackPtr - 2]), -1396181317).method4103(Class158_Sub1.aClass3_8507, (class527.intStack[1942118537 * class527.intStackPtr - 1]), -394016301)) ? 1 : 0;
		class527.intStackPtr -= 141891001;
	}

	static final void method4315(CS2Executor class527, int i) {
		Class283.anInt3384 = 0;
	}

	public static final int decodeLandscapeData(ObjectIndexLoader objectDefs, byte[] data, int regionX, int regionY, int i_182_, int i_183_, short i_184_) {
		int numObjects = 0;
		RsByteBuffer stream = new RsByteBuffer(data);
		int objectId = -1;
		for (;;) {
			int incr = stream.readSmart2(-1436314957);
			if (incr == 0)
				break;
			objectId += incr;
			int location = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int incr2 = stream.readUnsignedSmart(1964048281);
					if (0 == incr2)
						break;
					stream.readUnsignedByte();
				} else {
					int i_190_ = stream.readUnsignedSmart(1841377249);
					if (0 == i_190_)
						break;
					location += i_190_ - 1;
					int localY = location & 0x3f;
					int localX = location >> 6 & 0x3f;
					int type = stream.readUnsignedByte() >> 2;
					int x = localX + regionX;
					int y = regionY + localY;
					if (x > 0 && y > 0 && x < i_182_ - 1 && y < i_183_ - 1) {
						ObjectDefinitions defs = objectDefs.getObjectDefinitions(objectId, 65280);
						if ((SceneObjectType.GROUND_DECORATION.type * 1109376893 != type) || Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 59) != 0 || defs.anInt5652 * -348507379 != 0 || 647396503 * defs.clipType == 1 || defs.aBool5685) {
							if (!defs.method7968(-2090294731))
								numObjects++;
							bool = true;
						}
					}
				}
			}
		}
		return numObjects;
	}
}
