
/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Desktop;
import java.net.URI;

public class Class276 {
	static final int anInt3341 = 2;
	static final int anInt3342 = 0;
	public static final int anInt3343 = 1;
	static final int anInt3344 = 3;
	static String[] aStringArray3345;
	public static RsByteBuffer aClass282_Sub35_3346;

	public static void method4892(String string, boolean bool, boolean bool_0_, boolean bool_1_, boolean bool_2_) {
		Class508.method8736(string, bool, bool_0_, "openjs", bool_1_, bool_2_, (byte) -66);
	}

	public static void method4893(String string, boolean bool, boolean bool_3_, boolean bool_4_, boolean bool_5_) {
		Class508.method8736(string, bool, bool_3_, "openjs", bool_4_, bool_5_, (byte) 39);
	}

	static boolean method4894(String string, int i) {
		return Class186.method3082(string, i, "openjs", 145298920);
	}

	public static void method4895(String string, boolean bool, boolean bool_6_, boolean bool_7_, boolean bool_8_) {
		Class508.method8736(string, bool, bool_6_, "openjs", bool_7_, bool_8_, (byte) 24);
	}

	public static void method4896(String string, boolean bool, boolean bool_9_, String string_10_, boolean bool_11_, boolean bool_12_) {
		if (bool) {
			do {
				if (!bool_11_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (Class225_Sub6.aString8069.startsWith("win") && !bool_11_)
				Class468_Sub6.method12661(string, 0, (byte) -45);
			else if (Class225_Sub6.aString8069.startsWith("mac"))
				Class186.method3082(string, 1, string_10_, 145298920);
			else
				Class468_Sub6.method12661(string, 2, (byte) -73);
		} else
			Class468_Sub6.method12661(string, 3, (byte) -5);
	}

	Class276() throws Throwable {
		throw new Error();
	}

	static boolean method4897(String string, int i) {
		return Class186.method3082(string, i, "openjs", 145298920);
	}

	static final void method4898(CS2Executor class527, int i) {
		IComponentDefinitions class118 = Class117.method1981((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]), (byte) 97);
		if (class118.aClass118Array1438 == null)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
		else {
			int i_13_ = class118.aClass118Array1438.length;
			for (int i_14_ = 0; i_14_ < class118.aClass118Array1438.length; i_14_++) {
				if (null == class118.aClass118Array1438[i_14_]) {
					i_13_ = i_14_;
					break;
				}
			}
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = i_13_;
		}
	}

	static final void method4899(CS2Executor class527, int i) {
		int i_15_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		int i_16_ = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(2130279532);
		if (i_16_ != i_15_ && (Class260.anInt3228 * 1712678171 == Class260.anInt3223 * 1293234709)) {
			if (!Class169.method2875(client.anInt7166 * -1741204137, -2119377821)) {
				if (0 == i_16_) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, 1293234709 * Class260.anInt3223, 0, i_15_, false, (byte) -58);
					Class468_Sub6.method12658(173344706);
					Class260.aBool3220 = false;
				} else if (i_15_ == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else
					Class87.method1491(i_15_, (byte) -14);
			}
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub13_8229), i_15_, 1044638020);
			Class190.method3148((byte) 93);
			client.aBool7175 = false;
		}
	}

	static final void method4900(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-825847336) == 1 ? 1 : 0;
	}

	static final void method4901(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -354780671 * class118.anInt1376;
	}

	static final void method4902(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class202.method3345(string, 1291002521);
	}

	public static void method4903(int i, int i_17_, int i_18_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(19, (long) i_17_ << 32 | (long) i);
		class282_sub50_sub12.method14965((byte) -68);
	}
}
