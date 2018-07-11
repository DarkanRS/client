/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RegionMap {
	public byte[][][] tileMasks;
	public static String aString3643;
	public static int anInt3644;

	public void reset(int i) {
		for (int i_0_ = 0; i_0_ < tileMasks.length; i_0_++) {
			for (int i_1_ = 0; i_1_ < tileMasks[0].length; i_1_++) {
				for (int i_2_ = 0; i_2_ < tileMasks[0][0].length; i_2_++)
					tileMasks[i_0_][i_1_][i_2_] = (byte) 0;
			}
		}
	}
	
	public boolean is0x2(int x, int y, int i_6_) {
		if (x < 0 || y < 0 || x >= tileMasks[1].length || y >= tileMasks[1][x].length)
			return false;
		if ((tileMasks[1][x][y] & 0x2) != 0)
			return true;
		return false;
	}

	public boolean method5498(int i, int plane, int x, int y, short i_10_) {
		if (0 != (tileMasks[0][x][y] & 0x2))
			return true;
		if ((tileMasks[plane][x][y] & 0x10) != 0)
			return false;
		if (method5499(plane, x, y, (short) -9790) == i)
			return true;
		return false;
	}

	int method5499(int i, int i_11_, int i_12_, short i_13_) {
		if ((tileMasks[i][i_11_][i_12_] & 0x8) != 0)
			return 0;
		if (i > 0 && (tileMasks[1][i_11_][i_12_] & 0x2) != 0)
			return i - 1;
		return i;
	}

	public RegionMap(int i, int i_14_, int i_15_) {
		tileMasks = new byte[i][i_14_][i_15_];
	}

	static final void method5511(CS2Executor class527, int i) {
		int i_35_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_35_, (byte) 98);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_35_ >> 16];
		Class169.method2874(class118, class98, class527, (byte) 3);
	}

	static final void method5512(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class96_Sub10.method14605(class118, class527, (byte) -77);
	}

	public static void method5513(int i, int i_36_, byte i_37_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(18, (long) i_36_ << 32 | (long) i);
		class282_sub50_sub12.method14965((byte) -18);
	}
}
