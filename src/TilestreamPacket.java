/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TilestreamPacket {
	public static TilestreamPacket aClass364_4204;
	public static TilestreamPacket aClass364_4205;
	public static TilestreamPacket aClass364_4206;
	public static TilestreamPacket aClass364_4207;
	public static TilestreamPacket aClass364_4208;
	public static TilestreamPacket aClass364_4209 = new TilestreamPacket(-1);
	public static TilestreamPacket aClass364_4210;
	public static TilestreamPacket aClass364_4211;
	public static TilestreamPacket PROJECTILE;
	public static TilestreamPacket aClass364_4213;
	public static TilestreamPacket aClass364_4214;
	public static TilestreamPacket aClass364_4215;
	public static TilestreamPacket aClass364_4216;
	public static TilestreamPacket aClass364_4217;
	public static TilestreamPacket aClass364_4218;
	public static int anInt4219;

	TilestreamPacket(int i) {
		/* empty */
	}

	static {
		aClass364_4207 = new TilestreamPacket(3);
		aClass364_4206 = new TilestreamPacket(5);
		aClass364_4213 = new TilestreamPacket(2);
		aClass364_4208 = new TilestreamPacket(6);
		PROJECTILE = new TilestreamPacket(16);
		aClass364_4210 = new TilestreamPacket(19);
		aClass364_4211 = new TilestreamPacket(5);
		aClass364_4205 = new TilestreamPacket(7);
		aClass364_4204 = new TilestreamPacket(7);
		aClass364_4214 = new TilestreamPacket(8);
		aClass364_4215 = new TilestreamPacket(-1);
		aClass364_4216 = new TilestreamPacket(6);
		aClass364_4217 = new TilestreamPacket(9);
		aClass364_4218 = new TilestreamPacket(8);
	}

	static final void method6289(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -14681089) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1390 = Class351.method6193(string, class527, 289210792);
		class118.aBool1384 = true;
	}

	static final void method6290(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_0_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_1_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		if (i_0_ != -1) {
			if (i_1_ > 255)
				i_1_ = 255;
			else if (i_1_ < 0)
				i_1_ = 0;
			Class93.method1575(i_0_, i_1_, false, 733762718);
		}
	}

	static final void method6291(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class158.method2732(class118, class98, class527, -1950907302);
	}

	static final void method6292(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (i - i_3_ >= Class532_Sub3.anInt7071 * -612590951 && i + i_3_ <= Class532_Sub3.anInt7069 * -1345107225 && i_2_ - i_3_ >= 324226563 * Class532_Sub3.anInt7070 && i_3_ + i_2_ <= -348932735 * Class532_Sub3.anInt7068)
			Class31.method813(i, i_2_, i_3_, i_4_, -990721076);
		else
			Class273.method4866(i, i_2_, i_3_, i_4_, -1855958867);
	}
}
