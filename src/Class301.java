
/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class301 implements Interface41 {
	String aString3553;
	boolean aBool3554;
	static int anInt3555;
	public static int anInt3556;

	public Class445 method230() {
		return Class445.aClass445_5383;
	}

	boolean method5326() {
		return ((Class301) this).aBool3554;
	}

	boolean method5327() {
		return ((Class301) this).aBool3554;
	}

	public Class445 method235() {
		return Class445.aClass445_5383;
	}

	public int method231() {
		if (((Class301) this).aBool3554)
			return 100;
		int i = IndexLoaders.NATIVE_LIBRARY_LOADER.method4648(((Class301) this).aString3553, 2070008290);
		if (i >= 0 && i <= 100)
			return i;
		((Class301) this).aBool3554 = true;
		return 100;
	}

	public Class445 method232(byte i) {
		return Class445.aClass445_5383;
	}

	public Class445 method233() {
		return Class445.aClass445_5383;
	}

	public Class445 method234() {
		return Class445.aClass445_5383;
	}

	boolean method5328(byte i) {
		return ((Class301) this).aBool3554;
	}

	boolean method5329() {
		return ((Class301) this).aBool3554;
	}

	public int getCompletion(int i) {
		if (((Class301) this).aBool3554)
			return 100;
		int i_0_ = IndexLoaders.NATIVE_LIBRARY_LOADER.method4648(((Class301) this).aString3553, -419242357);
		if (i_0_ >= 0 && i_0_ <= 100)
			return i_0_;
		((Class301) this).aBool3554 = true;
		return 100;
	}

	boolean method5330() {
		return ((Class301) this).aBool3554;
	}

	Class301(String string) {
		((Class301) this).aString3553 = string;
	}

	public static Class283 method5331(Index class317, String string, boolean bool, int i) {
		int i_1_ = class317.getArchiveId(string, -1729894285);
		if (-1 == i_1_)
			return new Class283(0);
		int[] is = class317.getValidFileIds(i_1_, -710345524);
		Class283 class283 = new Class283(is.length);
		int i_2_ = 0;
		int i_3_ = 0;
		while (i_2_ < -361490119 * class283.anInt3382) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(class317.getFile(i_1_, is[i_3_++], -1846070100));
			int i_4_ = class282_sub35.readInt();
			int i_5_ = class282_sub35.readUnsignedShort();
			int i_6_ = class282_sub35.readUnsignedByte();
			if (bool || 1 != i_6_) {
				class283.anIntArray3381[i_2_] = i_4_;
				class283.anIntArray3383[i_2_] = i_5_;
				i_2_++;
			} else
				class283.anInt3382 -= -1982528247;
		}
		return class283;
	}

	static final void method5332(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class496.method8310(class118, class98, class527, (byte) -121);
	}

	static void method5333(int i) {
		if (Class179.anInt2221 * 1790640201 < 102)
			Class179.anInt2221 += 345353174;
		if (Class179.anInt2231 * -1374254477 != -1 && (Class179.aLong2232 * -8784386644529951763L < Class169.method2869(2051394880))) {
			for (int i_7_ = Class179.anInt2231 * -1374254477; i_7_ < Class276.aStringArray3345.length; i_7_++) {
				if (Class276.aStringArray3345[i_7_].startsWith("pause")) {
					int i_8_ = 5;
					try {
						i_8_ = Integer.parseInt(Class276.aStringArray3345[i_7_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class209.method3598(new StringBuilder().append("Pausing for ").append(i_8_).append(" seconds...").toString(), -707420136);
					Class179.anInt2231 = -479843653 * (1 + i_7_);
					Class179.aLong2232 = (Class169.method2869(1776970496) + (long) (i_8_ * 1000)) * 5591849346017053157L;
					return;
				}
				Class179.aString2225 = Class276.aStringArray3345[i_7_];
				Class165.method2853(false, -1814369538);
			}
			Class179.anInt2231 = 479843653;
		}
		if (0 != 1789395551 * client.anInt7191) {
			Class179.anInt2223 -= 1388403785 * client.anInt7191;
			if (-2132918525 * Class179.anInt2223 >= -1647152403 * Class179.anInt2227)
				Class179.anInt2223 = Class179.anInt2227 * -1033721009 - -758144085;
			if (Class179.anInt2223 * -2132918525 < 0)
				Class179.anInt2223 = 0;
			client.anInt7191 = 0;
		}
		for (int i_9_ = 0; i_9_ < client.anInt7193 * -1911445195; i_9_++) {
			Interface16 interface16 = client.anInterface16Array7154[i_9_];
			int i_10_ = interface16.method92(317240429);
			char c = interface16.method118(-63648913);
			int i_11_ = interface16.method125(1713705553);
			if (84 == i_10_)
				Class165.method2853(false, -2060132011);
			if (80 == i_10_)
				Class165.method2853(true, -719504830);
			else if (66 == i_10_ && (i_11_ & 0x4) != 0) {
				if (Class182.aClipboard2263 != null) {
					String string = "";
					for (int i_12_ = Class13.aStringArray129.length - 1; i_12_ >= 0; i_12_--) {
						if (null != Class13.aStringArray129[i_12_] && Class13.aStringArray129[i_12_].length() > 0)
							string = new StringBuilder().append(string).append(Class13.aStringArray129[i_12_]).append('\n').toString();
					}
					Class182.aClipboard2263.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_10_ && (i_11_ & 0x4) != 0) {
				if (null != Class182.aClipboard2263) {
					try {
						Transferable transferable = Class182.aClipboard2263.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
								Class341.method6074(strings, 1068148827);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_10_ == 85 && Class179.anInt2220 * -530721645 > 0) {
				Class179.aString2225 = new StringBuilder().append(Class179.aString2225.substring(0, (Class179.anInt2220 * -530721645) - 1)).append(Class179.aString2225.substring(-530721645 * Class179.anInt2220)).toString();
				Class179.anInt2220 -= -1996461669;
			} else if (i_10_ == 101 && (-530721645 * Class179.anInt2220 < Class179.aString2225.length()))
				Class179.aString2225 = new StringBuilder().append(Class179.aString2225.substring(0, -530721645 * Class179.anInt2220)).append(Class179.aString2225.substring(1 + Class179.anInt2220 * -530721645)).toString();
			else if (96 == i_10_ && Class179.anInt2220 * -530721645 > 0)
				Class179.anInt2220 -= -1996461669;
			else if (i_10_ == 97 && (Class179.anInt2220 * -530721645 < Class179.aString2225.length()))
				Class179.anInt2220 += -1996461669;
			else if (i_10_ == 102)
				Class179.anInt2220 = 0;
			else if (103 == i_10_)
				Class179.anInt2220 = Class179.aString2225.length() * -1996461669;
			else if (i_10_ == 104 && (Class179.anInt2226 * -2115839039 < Class13.aStringArray129.length)) {
				Class179.anInt2226 += -1115474879;
				Class534.method11441((byte) -63);
				Class179.anInt2220 = Class179.aString2225.length() * -1996461669;
			} else if (i_10_ == 105 && -2115839039 * Class179.anInt2226 > 0) {
				Class179.anInt2226 -= -1115474879;
				Class534.method11441((byte) -128);
				Class179.anInt2220 = Class179.aString2225.length() * -1996461669;
			} else if (Class380.method6450(c, -803297917) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				Class179.aString2225 = new StringBuilder().append(Class179.aString2225.substring(0, Class179.anInt2220 * -530721645)).append(client.anInterface16Array7154[i_9_].method118(-890560120)).append(Class179.aString2225.substring(-530721645 * Class179.anInt2220)).toString();
				Class179.anInt2220 += -1996461669;
			}
		}
		client.anInt7193 = 0;
		client.anInt7196 = 0;
		IncomingPacket.method6378(-1538407760);
	}

	static boolean method5334(int i, int i_13_, int i_14_) {
		if (i_13_ >= 1000 && i < 1000)
			return true;
		if (i_13_ < 1000 && i < 1000) {
			if (Class96_Sub4.method13788(i, -1087183805))
				return true;
			if (Class96_Sub4.method13788(i_13_, -1371032664))
				return false;
			return true;
		}
		if (i_13_ >= 1000 && i >= 1000)
			return true;
		return false;
	}

	static final void method5335(CS2Executor class527, byte i) {
		class527.intStackPtr -= 709455005;
		Class435.method7300((class527.intStack[class527.intStackPtr * 1942118537]), (class527.intStack[1 + 1942118537 * class527.intStackPtr]), (class527.intStack[class527.intStackPtr * 1942118537 + 2]), (class527.intStack[3 + 1942118537 * class527.intStackPtr]), false, (class527.intStack[4 + class527.intStackPtr * 1942118537]), 1449989045);
	}
}
